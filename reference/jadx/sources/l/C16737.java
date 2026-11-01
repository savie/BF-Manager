package l;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.File;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ܽܺۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 02QQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C16737 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static InterfaceC6025 f53607;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC5204 f53608;

    /* JADX INFO: renamed from: ۘᩳۚ, reason: not valid java name and contains not printable characters */
    private static final short[] f53609 = {1171, -24924, -24922, -24905, -24960, -24916, -24915, -24905, -24922, -24915, -24905, -24943, -24922, -24912, -24916, -24913, -24907, -24922, -24911, -24853, -24851, -24851, -24851, -24854, 2815, -15584, -15582, -15565, -15610, -15561, -15561, -15573, -15570, -15580, -15578, -15565, -15570, -15576, -15575, -15602, -15575, -15583, -15576, -15505, -15511, -15511, -15511, -15506, 2062, -8631, -8616, -8614, -8622, -8616, -8610, -8612, -8585, -8616, -8620, -8612, -8610, -8612, -8627, -8599, -8616, -8614, -8622, -8616, -8610, -8612, -8592, -8617, -8609, -8618, -8687, -8681, -8681, -8681, -8688, 1147, -22763, -22756, -22783, -22754, -22766, -22777, -22734, -22783, -22764, -22784, -22764, -22762, -22777, -22752, -22777, -22783, -22758, -22755, -22764, -22693, -22691, -22691, -22691, -22694, 7853, 16700, 16691, 16694, 16687, 16701, 16688, 16702, 16685, 16699, 16689, 16682, 16691, 16691, 16767, 16700, 16702, 16689, 16689, 16688, 16683, 16767, 16701, 16698, 16767, 16700, 16702, 16684, 16683, 16767, 16683, 16688, 16767, 16689, 16688, 16689, 16754, 16689, 16682, 16691, 16691, 16767, 16683, 16678, 16687, 16698, 16767, 16702, 16689, 16699, 16685, 16688, 16694, 16699, 16753, 16683, 16698, 16679, 16683, 16753, 16668, 16691, 16694, 16687, 16701, 16688, 16702, 16685, 16699, 16658, 16702, 16689, 16702, 16696, 16698, 16685, 8095, 15770, -11498, 9537, 12332, 12347, 12349, 12347, 12343, 12328, 12347, 12332, 2267, -19830, -19811, -19813, -19811, -19823, -19826, -19811, -19830, 3334, -1716, -1717, -1711, -1728, -1717, -1711, 758, 24402, -22433, -20448, 8596, 3809, 831, 19114, 7459, -5260, -5270, -5250, -5254, -5259, -5264, -5271, -5253, -5258, -5256, -5269, -5251, -5257, -5268, -5259, -5259, -5319, -5254, -5256, -5257, -5257, -5258, -5267, -5319, -5253, -5252, -5319, -5254, -5256, -5270, -5267, -5319, -5267, -5258, -5319, -5257, -5258, -5257, -5324, -5257, -5268, -5259, -5259, -5319, -5267, -5280, -5271, -5252, -5319, -5256, -5257, -5251, -5269, -5258, -5264, -5251, -5321, -5267, -5252, -5279, -5267, -5321, -5286, -5259, -5264, -5271, -5253, -5258, -5256, -5269, -5251, -5292, -5256, -5257, -5256, -5250, -5252, -5269, -29005, 28355, 31074, 592, 16838, 16842, 16843, 16849, 16832, 16861, 16849, 8895, -23193, -23195, -23180, -23214, -23195, -23181, -23185, -23179, -23182, -23197, -23195, -23181, -23256, -23250, -23250, -23250, -23255, 3462, -5891, -5894, -5891, -5916, -5914, -5903, -5913, -5903, -5914, -5918, -5903, -5941, -5902, -5891, -5896, -5903, -5941, -5920, -5891, -5895, -5903, 6094, 28423, 28421, 28436, 28451, 28417, 28419, 28424, 28421, 28452, 28425, 28434, 28488, 28494, 28494, 28494, 28489, 6687, -13492, -13490, -13473, -13441, -13490, -13485, -13473, -13565, -13563, -13563, -13563, -13566, 8094, 32262, 32260, 32277, 32295, 32264, 32269, 32260, 32274, 32293, 32264, 32275, 32329, 32335, 32335, 32335, 32328, 7967, 15016, 15018, 15035, 14990, 15036, 15036, 15018, 15035, 15036, 15079, 15073, 15073, 15073, 15078, 8278, -20332, -20330, -20345, -20320, -20345, -20351, -20326, -20323, -20332, -20261, -20259, -20259, -20259, -20262, 9811, -21366, -21363, -21357, -21354, -21353, -21316, -21362, -21370, -21353, -21365, -21364, -21369, -21363, -21354, -21361, -21361, -21309, -21376, -21374, -21363, -21363, -21364, -21353, -21309, -21375, -21370, -21309, -21376, -21374, -21360, -21353, -21309, -21353, -21364, -21309, -21363, -21364, -21363, -21298, -21363, -21354, -21361, -21361, -21309, -21353, -21350, -21357, -21370, -21309, -21374, -21363, -21369, -21359, -21364, -21366, -21369, -21299, -21355, -21366, -21370, -21356, -21299, -21366, -21363, -21357, -21354, -21353, -21362, -21370, -21353, -21365, -21364, -21369, -21299, -21334, -21363, -21357, -21354, -21353, -21330, -21370, -21353, -21365, -21364, -21369, -21330, -21374, -21363, -21374, -21372, -21370, -21359, 6051, 7935, 7933, 7916, 7880, 7929, 7931, 7923, 7929, 7935, 7933, 7893, 7929, 7926, 7929, 7935, 7933, 7914, 7856, 7862, 7862, 7862, 7857, 4317, 28698, 28696, 28681, 28717, 28700, 28702, 28694, 28700, 28698, 28696, 28723, 28700, 28688, 28696, 28757, 28755, 28755, 28755, 28756, 7958, -28516, -28528, -28527, -28527, -28518, -28516, -28533, -28522, -28535, -28522, -28533, -28538, -28527, -28534, -28525, -28525, -28449, -28516, -28514, -28527, -28527, -28528, -28533, -28449, -28515, -28518, -28449, -28516, -28514, -28532, -28533, -28449, -28533, -28528, -28449, -28527, -28528, -28527, -28462, -28527, -28534, -28525, -28525, -28449, -28533, -28538, -28529, -28518, -28449, -28514, -28527, -28517, -28531, -28528, -28522, -28517, -28463, -28527, -28518, -28533, -28463, -28484, -28528, -28527, -28527, -28518, -28516, -28533, -28522, -28535, -28522, -28533, -28538, -28494, -28514, -28527, -28514, -28520, -28518, -28531, 5928, 10125, 10127, 10142, 10172, 10123, 10118, 10143, 10127, 10178, 10180, 10180, 10180, 10179, 4396, 17962, 17957, 17952, 17977, 17963, 17958, 17960, 17979, 17965, 17959, 17980, 17957, 17957, 18025, 17962, 17960, 17959, 17959, 17958, 17981, 18025, 17963, 17964, 18025, 17962, 17960, 17978, 17981, 18025, 17981, 17958, 18025, 17959, 17958, 17959, 18020, 17959, 17980, 17957, 17957, 18025, 17981, 17968, 17977, 17964, 18025, 17960, 17959, 17965, 17979, 17958, 17952, 17965, 18023, 17962, 17958, 17959, 17981, 17964, 17959, 17981, 18023, 17930, 17957, 17952, 17977, 17963, 17958, 17960, 17979, 17965, 17924, 17960, 17959, 17960, 17966, 17964, 17979, 5526, -20216, -20214, -20197, -20167, -20210, -20221, -20198, -20214, -20153, -20159, -20159, -20159, -20154};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Handler f53610;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static boolean f53611;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static boolean f53612;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final InterfaceC5204 f53613;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static ApplicationC0716 f53614;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static SharedPreferences f53615;

    /* JADX WARN: Code duplicated, block: B:54:0x01d6 A[PHI: r2 r5 r6 r8 r9
      0x01d6: PHI (r2v4 java.lang.String) = (r2v2 java.lang.String), (r2v2 java.lang.String), (r2v3 java.lang.String), (r2v2 java.lang.String) binds: [B:53:0x01d4, B:45:0x0191, B:22:0x00a3, B:13:0x0083] A[DONT_GENERATE, DONT_INLINE]
      0x01d6: PHI (r5v4 short) = (r5v3 short), (r5v2 short), (r5v2 short), (r5v2 short) binds: [B:53:0x01d4, B:45:0x0191, B:22:0x00a3, B:13:0x0083] A[DONT_GENERATE, DONT_INLINE]
      0x01d6: PHI (r6v4 short) = (r6v3 short), (r6v2 short), (r6v2 short), (r6v2 short) binds: [B:53:0x01d4, B:45:0x0191, B:22:0x00a3, B:13:0x0083] A[DONT_GENERATE, DONT_INLINE]
      0x01d6: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:53:0x01d4, B:45:0x0191, B:22:0x00a3, B:13:0x0083] A[DONT_GENERATE, DONT_INLINE]
      0x01d6: PHI (r9v4 int) = (r9v2 int), (r9v3 int), (r9v2 int), (r9v2 int) binds: [B:53:0x01d4, B:45:0x0191, B:22:0x00a3, B:13:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x020d A[PHI: r4 r7 r12 r13
      0x020d: PHI (r4v4 char) = (r4v3 char), (r4v2 char), (r4v2 char) binds: [B:57:0x020b, B:49:0x01b0, B:30:0x00ee] A[DONT_GENERATE, DONT_INLINE]
      0x020d: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int) binds: [B:57:0x020b, B:49:0x01b0, B:30:0x00ee] A[DONT_GENERATE, DONT_INLINE]
      0x020d: PHI (r12v3 short[]) = (r12v2 short[]), (r12v2 short[]), (r12v4 short[]) binds: [B:57:0x020b, B:49:0x01b0, B:30:0x00ee] A[DONT_GENERATE, DONT_INLINE]
      0x020d: PHI (r13v3 int) = (r13v2 int), (r13v2 int), (r13v4 int) binds: [B:57:0x020b, B:49:0x01b0, B:30:0x00ee] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x023e A[PHI: r14 r19
      0x023e: PHI (r14v6 int) = (r14v2 int), (r14v3 int), (r14v2 int) binds: [B:61:0x023c, B:26:0x00c8, B:9:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x023e: PHI (r19v7 short[]) = (r19v4 short[]), (r19v3 short[]), (r19v3 short[]) binds: [B:61:0x023c, B:26:0x00c8, B:9:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0274 A[PHI: r10
      0x0274: PHI (r10v4 int) = (r10v2 int), (r10v3 int), (r10v2 int) binds: [B:65:0x0272, B:41:0x016d, B:14:0x0087] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x008d, code lost:
    
        if (l.C1398.f5802 <= 0) goto L13;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m39269(android.content.BroadcastReceiver r20, android.content.IntentFilter r21) {
        /*
            Method dump skipped, instruction units count: 822
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16737.m39269(android.content.BroadcastReceiver, android.content.IntentFilter):void");
    }

    /* JADX WARN: Code duplicated, block: B:43:0x013e A[PHI: r9
      0x013e: PHI (r9v4 short) = (r9v3 short), (r9v2 short), (r9v2 short) binds: [B:42:0x013c, B:15:0x0066, B:12:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x0170 A[PHI: r2 r8 r11 r12
      0x0170: PHI (r2v7 java.lang.String) = 
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
      (r2v6 java.lang.String)
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
     binds: [B:46:0x016e, B:31:0x00cc, B:24:0x008a, B:17:0x006a, B:15:0x0066, B:9:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x0170: PHI (r8v4 int) = (r8v3 int), (r8v2 int), (r8v2 int), (r8v2 int), (r8v2 int), (r8v2 int) binds: [B:46:0x016e, B:31:0x00cc, B:24:0x008a, B:17:0x006a, B:15:0x0066, B:9:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x0170: PHI (r11v4 short[]) = (r11v2 short[]), (r11v3 short[]), (r11v2 short[]), (r11v2 short[]), (r11v2 short[]), (r11v2 short[]) binds: [B:46:0x016e, B:31:0x00cc, B:24:0x008a, B:17:0x006a, B:15:0x0066, B:9:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x0170: PHI (r12v4 int) = (r12v2 int), (r12v3 int), (r12v2 int), (r12v2 int), (r12v2 int), (r12v2 int) binds: [B:46:0x016e, B:31:0x00cc, B:24:0x008a, B:17:0x006a, B:15:0x0066, B:9:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x01c3 A[PHI: r5 r6 r13
      0x01c3: PHI (r5v4 short) = (r5v3 short), (r5v2 short), (r5v2 short) binds: [B:54:0x01c1, B:27:0x00aa, B:9:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x01c3: PHI (r6v4 int) = (r6v3 int), (r6v2 int), (r6v2 int) binds: [B:54:0x01c1, B:27:0x00aa, B:9:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x01c3: PHI (r13v4 int) = (r13v2 int), (r13v3 int), (r13v2 int) binds: [B:54:0x01c1, B:27:0x00aa, B:9:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0213 A[PHI: r7 r18
      0x0213: PHI (r7v3 int) = (r7v2 int), (r7v4 int) binds: [B:62:0x0211, B:50:0x01a2] A[DONT_GENERATE, DONT_INLINE]
      0x0213: PHI (r18v5 short[]) = (r18v4 short[]), (r18v3 short[]) binds: [B:62:0x0211, B:50:0x01a2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x023b A[PHI: r4
      0x023b: PHI (r4v4 char) = (r4v3 char), (r4v2 char), (r4v2 char) binds: [B:58:0x01f3, B:12:0x005b, B:6:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m39274(Runnable runnable, long j) {
        int iM45029;
        int i;
        int i2 = C1148.f5161;
        int i3 = C1025.f4800;
        int iM11306 = (ThreadFactoryC3888.m11306("ۗ᩶") + i3) * 101;
        int i4 = ((iM11306 ^ i2) * (-19953)) ^ 498370716;
        short[] sArr = null;
        short[] sArr2 = null;
        int i5 = iM11306 ^ (-1722004684);
        String str = null;
        char c = 0;
        short s = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        short s2 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = -999521940;
        while (true) {
            i12 = i5 ^ (i4 & (((i12 ^ i2) * (-1679)) >> 31));
            switch (i12) {
                case -1945579043:
                case -49455400:
                    c = 214;
                    if (C1377.f5749) {
                        iM45029 = (C19806.m45029("᩹᩹") + i2) * (-11);
                        i4 = ((iM45029 ^ i3) * 22851) ^ 1530383283;
                        i = -1971873417;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۬ܺ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-16185)) ^ (-1213576441);
                        i = 2043887499;
                    }
                    i5 = iM45029 ^ i;
                    break;
                case -1902519597:
                case -1519564181:
                    i7 = 22819729;
                    if (C3743.f13569) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩹ۢ") ^ i3) * (-51);
                        i4 = ((iM45029 ^ i2) * (-20185)) ^ (-248446326);
                        i = -1822381087;
                    } else {
                        iM45029 = (C19806.m45029("ۘۡ") ^ i2) * 71;
                        i4 = ((iM45029 ^ i3) * 24737) ^ 192515268;
                        i = 1963601142;
                    }
                    i5 = iM45029 ^ i;
                    break;
                case -1785792412:
                case 1667210879:
                    C0629.m2907();
                    iM45029 = (C19806.m45029("ۗ۠") ^ i3) * (-17);
                    i4 = ((iM45029 ^ i2) * (-28495)) ^ (-1659806461);
                    i = -1628392500;
                    i5 = iM45029 ^ i;
                    break;
                case -1694022199:
                case 699776504:
                    sArr = f53609;
                    if (C7105.m18985()) {
                        iM45029 = (C19806.m45029("ۘۡ") ^ i2) * 71;
                        i4 = ((iM45029 ^ i3) * 24737) ^ 192515268;
                        i = 1963601142;
                    } else {
                        iM45029 = C19806.m45029("ۢۛ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 12369) ^ (-1530940060);
                        i = 1555691819;
                    }
                    i5 = iM45029 ^ i;
                    break;
                case -1458081072:
                case -27380772:
                    i11 = 1;
                    if (C0797.f3386) {
                        iM45029 = (C19806.m45029("ۗۨ") + i3) * (-119);
                        i4 = ((iM45029 ^ i2) * (-23307)) ^ (-1463784478);
                        i = 1262602638;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܶܰ") + i3) * (-5);
                        i4 = ((iM45029 ^ i2) * (-21687)) ^ 528939412;
                        i = -1569325884;
                    }
                    i5 = iM45029 ^ i;
                    break;
                case -1453189494:
                case 1936130887:
                    C0797.m3359();
                    if (C2249.m6915() <= 0) {
                        iM45029 = (C19806.m45029("ۗ۠") ^ i3) * (-17);
                        i4 = ((iM45029 ^ i2) * (-28495)) ^ (-1659806461);
                        i = -1628392500;
                    } else {
                        iM45029 = C19806.m45029("ۡ۟") ^ i2;
                        i4 = ((iM45029 ^ i3) * 31667) ^ 2077851865;
                        i = 485236614;
                    }
                    i5 = iM45029 ^ i;
                    break;
                case -1369864166:
                case -16769297:
                    int i13 = i6 + i7;
                    i8 = i13 + i13;
                    if (C0671.f2816 != 0) {
                        iM45029 = (C19806.m45029("ۗ۠") ^ i3) * (-17);
                        i4 = ((iM45029 ^ i2) * (-28495)) ^ (-1659806461);
                        i = -1628392500;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("᩷ۛ")) * 51;
                        i4 = ((iM45029 ^ i3) * (-20403)) ^ 568141298;
                        i = 420844934;
                    }
                    i5 = iM45029 ^ i;
                    break;
                case -1245825827:
                case 532693236:
                    C1066.m4023();
                    if (C2704.f10408) {
                        iM45029 = (C19806.m45029("ۗ۠") ^ i3) * (-17);
                        i4 = ((iM45029 ^ i2) * (-28495)) ^ (-1659806461);
                        i = -1628392500;
                    } else {
                        iM45029 = (C19806.m45029("ۗۨ") + i3) * (-119);
                        i4 = ((iM45029 ^ i2) * (-23307)) ^ (-1463784478);
                        i = 1262602638;
                    }
                    i5 = iM45029 ^ i;
                    break;
                case -1214208946:
                case 993713919:
                    if (C0278.f1572 <= 0) {
                        iM45029 = C19806.m45029("ۡ۟") ^ i2;
                        i4 = ((iM45029 ^ i3) * 31667) ^ 2077851865;
                        i = 485236614;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۬ܺ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-16185)) ^ (-1213576441);
                        i = 2043887499;
                    }
                    i5 = iM45029 ^ i;
                    break;
                case -1161077578:
                case 1552207672:
                    C1668.m5583();
                    break;
                case -790058493:
                case 156305860:
                    s = sArr[c];
                    i6 = s * s;
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = (C19806.m45029("ۗۨ") + i3) * (-119);
                        i4 = ((iM45029 ^ i2) * (-23307)) ^ (-1463784478);
                        i = 1262602638;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܽۢ") + i3) * (-59);
                        i4 = ((iM45029 ^ i2) * (-8701)) ^ 1260550449;
                        i = 1135217935;
                    }
                    i5 = iM45029 ^ i;
                    break;
                case -649034497:
                case 1176454221:
                    sArr2 = f53609;
                    i10 = 215;
                    if (C19806.m45024()) {
                        iM45029 = (C19806.m45029("ۗ۠") ^ i3) * (-17);
                        i4 = ((iM45029 ^ i2) * (-28495)) ^ (-1659806461);
                        i = -1628392500;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֨ۙ") + i2) * (-103);
                        i4 = ((iM45029 ^ i3) * 17809) ^ (-1369225333);
                        i = 933009544;
                    }
                    i5 = iM45029 ^ i;
                    break;
                case -617734162:
                case 900207947:
                    CallableC1627.m5508(runnable, str);
                    f53610.postDelayed(runnable, j);
                    break;
                case -196204021:
                case -128099045:
                    i9 = 19160;
                    iM45029 = (ThreadFactoryC3888.m11306("ܺۚ") + i3) * (-83);
                    i4 = ((iM45029 ^ i2) * (-18907)) ^ 820106758;
                    i = 270369294;
                    i5 = iM45029 ^ i;
                    break;
                case 499731311:
                case 1471001166:
                    i9 = 55452;
                    iM45029 = (ThreadFactoryC3888.m11306("ܺۚ") + i3) * (-83);
                    i4 = ((iM45029 ^ i2) * (-18907)) ^ 820106758;
                    i = 270369294;
                    i5 = iM45029 ^ i;
                    break;
                case 1076937047:
                case 1324632727:
                    String strM4892 = C1398.m4892(sArr2, i10, i11, i9);
                    if (C1461.m5080()) {
                        str = strM4892;
                        iM45029 = (C19806.m45029("ۗ۠") ^ i3) * (-17);
                        i4 = ((iM45029 ^ i2) * (-28495)) ^ (-1659806461);
                        i = -1628392500;
                        i5 = iM45029 ^ i;
                    } else {
                        int iM11307 = ThreadFactoryC3888.m11306("᩹۬") ^ i2;
                        int i14 = ((iM11307 ^ i3) * (-30873)) ^ 1170320536;
                        i5 = iM11307 ^ 1243116351;
                        str = strM4892;
                        i4 = i14;
                    }
                    break;
                case 1421448883:
                case 1761833983:
                    s2 = 4777;
                    if (RunnableC1606.f6488 >= 0) {
                        iM45029 = C19806.m45029("ۡ۟") ^ i2;
                        i4 = ((iM45029 ^ i3) * 31667) ^ 2077851865;
                        i = 485236614;
                    } else {
                        iM45029 = (C19806.m45029("ܽ۬") + i3) * (-47);
                        i4 = ((iM45029 ^ i2) * (-31119)) ^ 1117053815;
                        i = -890988012;
                    }
                    i5 = iM45029 ^ i;
                    break;
                case 1707936874:
                case 1746213780:
                    int i15 = s + s2;
                    if ((i15 * i15) - i8 > 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܽ᩸") ^ i2) * 85;
                        i4 = ((iM45029 ^ i3) * (-4045)) ^ (-2048035368);
                        i = 2070924675;
                    } else {
                        iM45029 = C19806.m45029("ܳۗ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-30565)) ^ (-312854348);
                        i = -2014386440;
                    }
                    i5 = iM45029 ^ i;
                    break;
                default:
                    if (C0671.f2816 != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۬ܺ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-16185)) ^ (-1213576441);
                        i = 2043887499;
                    } else {
                        iM45029 = (C19806.m45029("᩵۟") ^ i2) * 3;
                        i4 = ((iM45029 ^ i3) * 6175) ^ (-456460087);
                        i = 1453623615;
                    }
                    i5 = iM45029 ^ i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0262 A[PHI: r1 r4 r5 r7 r10 r16
      0x0262: PHI (r1v6 short[]) = (r1v5 short[]), (r1v2 short[]), (r1v2 short[]), (r1v2 short[]) binds: [B:68:0x0260, B:51:0x01af, B:43:0x0160, B:24:0x0082] A[DONT_GENERATE, DONT_INLINE]
      0x0262: PHI (r4v4 int) = (r4v2 int), (r4v3 int), (r4v2 int), (r4v2 int) binds: [B:68:0x0260, B:51:0x01af, B:43:0x0160, B:24:0x0082] A[DONT_GENERATE, DONT_INLINE]
      0x0262: PHI (r5v4 int) = (r5v2 int), (r5v3 int), (r5v2 int), (r5v2 int) binds: [B:68:0x0260, B:51:0x01af, B:43:0x0160, B:24:0x0082] A[DONT_GENERATE, DONT_INLINE]
      0x0262: PHI (r7v4 short) = (r7v2 short), (r7v2 short), (r7v3 short), (r7v2 short) binds: [B:68:0x0260, B:51:0x01af, B:43:0x0160, B:24:0x0082] A[DONT_GENERATE, DONT_INLINE]
      0x0262: PHI (r10v3 int) = (r10v2 int), (r10v2 int), (r10v2 int), (r10v4 int) binds: [B:68:0x0260, B:51:0x01af, B:43:0x0160, B:24:0x0082] A[DONT_GENERATE, DONT_INLINE]
      0x0262: PHI (r16v16 java.lang.String) = (r16v5 java.lang.String), (r16v9 java.lang.String), (r16v12 java.lang.String), (r16v19 java.lang.String) binds: [B:68:0x0260, B:51:0x01af, B:43:0x0160, B:24:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final String m39288(int i) {
        String str;
        int iM45029;
        int i2;
        int iM450210;
        int i3;
        int i4;
        String strM3412 = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        short s2 = 0;
        int i8 = 0;
        short[] sArr2 = null;
        int i9 = 0;
        int i10 = 907688068;
        int i11 = C0050.f912;
        int i12 = C1460.f5948;
        int iM11306 = ThreadFactoryC3888.m11306("ᩴۘ") ^ i12;
        int i13 = ((iM11306 ^ i11) * (-10135)) ^ (-662014904);
        int i14 = -1675092416;
        while (true) {
            int i15 = iM11306 ^ i14;
            while (true) {
                i10 = ((((i10 ^ i11) * (-6537)) >> 31) & i13) ^ i15;
                switch (i10) {
                    case -2130046580:
                    case 1093828060:
                        C1937.m6279();
                        iM11306 = ThreadFactoryC3888.m11306("ۤ۟") ^ i12;
                        i13 = ((iM11306 ^ i11) * (-15365)) ^ (-160633452);
                        i14 = -179034096;
                        break;
                    case -2090015805:
                    case 2017304850:
                        str = strM3412;
                        sArr = f53609;
                        if (C2642.f10294 <= 0) {
                            iM45029 = ThreadFactoryC3888.m11306("ܶۘ") ^ i12;
                            i13 = ((iM45029 ^ i11) * 7571) ^ (-253944261);
                            i2 = 444388589;
                        } else {
                            iM45029 = (i11 - C19806.m45029("ۛ᩷")) * 81;
                            i13 = ((iM45029 ^ i12) * (-32739)) ^ (-12506422);
                            i2 = 1270325030;
                        }
                        i15 = iM45029 ^ i2;
                        strM3412 = str;
                        break;
                    case -1913896553:
                    case -26560711:
                        RunnableC1606.m5473();
                        if (C3286.m9798() <= 0) {
                            iM11306 = (C19806.m45029("᩷ۧ") ^ i11) * (-5);
                            i13 = ((iM11306 ^ i12) * 27677) ^ 1992515456;
                            i14 = 776712847;
                        }
                        iM450210 = ThreadFactoryC3888.m11306("۫ۖ") ^ i11;
                        str = strM3412;
                        i3 = ((iM450210 ^ i12) * (-2591)) ^ (-2128536306);
                        i4 = -853519068;
                        i15 = iM450210 ^ i4;
                        i13 = i3;
                        strM3412 = str;
                        break;
                    case -1778934766:
                    case -832904574:
                        str = strM3412;
                        int i16 = i5 + i6;
                        i7 = i16 + i16;
                        if (C1189.m4368() > 0) {
                            iM45029 = (C19806.m45029("ۨۜ") ^ i11) * (-65);
                            i13 = ((iM45029 ^ i12) * (-20711)) ^ 1557354872;
                            i2 = 1309136057;
                            i15 = iM45029 ^ i2;
                            strM3412 = str;
                        }
                        strM3412 = str;
                        iM450210 = ThreadFactoryC3888.m11306("۫ۖ") ^ i11;
                        str = strM3412;
                        i3 = ((iM450210 ^ i12) * (-2591)) ^ (-2128536306);
                        i4 = -853519068;
                        i15 = iM450210 ^ i4;
                        i13 = i3;
                        strM3412 = str;
                        break;
                    case -1669447139:
                    case -952398952:
                        str = strM3412;
                        int i17 = s + s2;
                        if (i7 - (i17 * i17) < 0) {
                            iM45029 = C19806.m45029("ۧܰ") ^ i11;
                            i13 = ((iM45029 ^ i12) * 31241) ^ (-1966263017);
                            i2 = 130704827;
                        } else {
                            iM45029 = C19806.m45029("ۡۘ") ^ i12;
                            i13 = ((iM45029 ^ i11) * 31389) ^ (-2032093597);
                            i2 = -1303871722;
                        }
                        i15 = iM45029 ^ i2;
                        strM3412 = str;
                        break;
                    case -1557692536:
                    case -544569321:
                        str = strM3412;
                        c = 408;
                        if (C1398.f5802 > 0) {
                            iM45029 = (C19806.m45029("۫ܶ") + i12) * 65;
                            i13 = ((iM45029 ^ i11) * 17489) ^ 801961360;
                            i2 = -509636062;
                            i15 = iM45029 ^ i2;
                            strM3412 = str;
                        }
                        strM3412 = str;
                        iM450210 = ThreadFactoryC3888.m11306("۫ۖ") ^ i11;
                        str = strM3412;
                        i3 = ((iM450210 ^ i12) * (-2591)) ^ (-2128536306);
                        i4 = -853519068;
                        i15 = iM450210 ^ i4;
                        i13 = i3;
                        strM3412 = str;
                        break;
                    case -1517810528:
                    case 1657379080:
                        i9 = 409;
                        if (C3535.f13026 > 0) {
                            iM11306 = (ThreadFactoryC3888.m11306("֫ۧ") + i11) * 37;
                            i13 = ((iM11306 ^ i12) * 5145) ^ 2040222989;
                            i14 = 678201058;
                        }
                        str = strM3412;
                        iM45029 = ThreadFactoryC3888.m11306("ܶۘ") ^ i12;
                        i13 = ((iM45029 ^ i11) * 7571) ^ (-253944261);
                        i2 = 444388589;
                        i15 = iM45029 ^ i2;
                        strM3412 = str;
                        break;
                        break;
                    case -1427799311:
                    case 141535619:
                        str = strM3412;
                        s = sArr[c];
                        if (AbstractC0464.f2088 <= 0) {
                            iM45029 = ThreadFactoryC3888.m11306("ۢۧ") ^ i12;
                            i13 = ((iM45029 ^ i11) * (-1887)) ^ 1366267510;
                            i2 = 36430762;
                        } else {
                            iM45029 = C19806.m45029("᩻۫") ^ i11;
                            i13 = ((iM45029 ^ i12) * 30183) ^ (-812017646);
                            i2 = 58157707;
                        }
                        i15 = iM45029 ^ i2;
                        strM3412 = str;
                        break;
                    case -1385930738:
                    case 971844277:
                        if (C1460.m5050() == 0) {
                            iM11306 = ThreadFactoryC3888.m11306("ۤ۟") ^ i12;
                            i13 = ((iM11306 ^ i11) * (-15365)) ^ (-160633452);
                            i14 = -179034096;
                            break;
                        }
                        str = strM3412;
                        iM45029 = ThreadFactoryC3888.m11306("ۢۧ") ^ i12;
                        i13 = ((iM45029 ^ i11) * (-1887)) ^ 1366267510;
                        i2 = 36430762;
                        i15 = iM45029 ^ i2;
                        strM3412 = str;
                        break;
                    case -432162215:
                    case 1600546367:
                        ThreadFactoryC3888.m11300();
                        if (C1668.f6641 >= 0) {
                            iM11306 = ThreadFactoryC3888.m11306("ۤ۟") ^ i12;
                            i13 = ((iM11306 ^ i11) * (-15365)) ^ (-160633452);
                            i14 = -179034096;
                            break;
                        }
                        iM450210 = ThreadFactoryC3888.m11306("۫ۖ") ^ i11;
                        str = strM3412;
                        i3 = ((iM450210 ^ i12) * (-2591)) ^ (-2128536306);
                        i4 = -853519068;
                        i15 = iM450210 ^ i4;
                        i13 = i3;
                        strM3412 = str;
                        break;
                    case -414998128:
                    case -177747857:
                        str = strM3412;
                        s2 = 17651;
                        if (C1189.m4368() <= 0) {
                            iM45029 = ThreadFactoryC3888.m11306("ܶۘ") ^ i12;
                            i13 = ((iM45029 ^ i11) * 7571) ^ (-253944261);
                            i2 = 444388589;
                        } else {
                            iM45029 = (C19806.m45029("ܺ۟") + i11) * (-11);
                            i13 = ((iM45029 ^ i12) * 271) ^ (-427831161);
                            i2 = 643773813;
                        }
                        i15 = iM45029 ^ i2;
                        strM3412 = str;
                        break;
                    case -262157138:
                    case 1449010871:
                        i8 = 45299;
                        iM450210 = (i12 - C19806.m45029("ۗܿ")) * (-123);
                        str = strM3412;
                        i3 = ((iM450210 ^ i11) * (-423)) ^ (-1765351099);
                        i4 = 830873658;
                        i15 = iM450210 ^ i4;
                        i13 = i3;
                        strM3412 = str;
                        break;
                    case -101378277:
                    case 2005188591:
                        sArr2 = f53609;
                        if (C1148.f5161 > 0) {
                            iM11306 = C19806.m45029("ۗܶ") ^ i12;
                            i13 = ((iM11306 ^ i11) * 4491) ^ (-1518353114);
                            i14 = -2032154751;
                            break;
                        }
                        iM11306 = (C19806.m45029("᩷ۧ") ^ i11) * (-5);
                        i13 = ((iM11306 ^ i12) * 27677) ^ 1992515456;
                        i14 = 776712847;
                        break;
                    case 528150842:
                    case 1272979825:
                        i8 = 31985;
                        iM450210 = (i12 - C19806.m45029("ۗܿ")) * (-123);
                        str = strM3412;
                        i3 = ((iM450210 ^ i11) * (-423)) ^ (-1765351099);
                        i4 = 830873658;
                        i15 = iM450210 ^ i4;
                        i13 = i3;
                        strM3412 = str;
                        break;
                    case 707667129:
                    case 1122179985:
                        C1937.m6286(strM3412, C2642.m8172(sArr2, i9, 14, i8));
                        return strM3412;
                    case 785064617:
                    case 1331611832:
                        str = strM3412;
                        i5 = s * s;
                        i6 = 311557801;
                        if (C1461.m5080()) {
                            iM45029 = ThreadFactoryC3888.m11306("ܶۘ") ^ i12;
                            i13 = ((iM45029 ^ i11) * 7571) ^ (-253944261);
                            i2 = 444388589;
                        } else {
                            iM45029 = (i12 - ThreadFactoryC3888.m11306("ۛᩴ")) * (-69);
                            i13 = ((iM45029 ^ i11) * (-11571)) ^ (-1313235860);
                            i2 = 1215610253;
                        }
                        i15 = iM45029 ^ i2;
                        strM3412 = str;
                        break;
                    case 1240217286:
                    case 1385729073:
                        str = strM3412;
                        if (C2249.f8050 < 0) {
                            iM45029 = (C19806.m45029("ۜۖ") + i12) * 35;
                            i13 = ((iM45029 ^ i11) * (-26681)) ^ (-1503188486);
                            i2 = -256327289;
                            i15 = iM45029 ^ i2;
                            strM3412 = str;
                        }
                        strM3412 = str;
                        iM450210 = ThreadFactoryC3888.m11306("۫ۖ") ^ i11;
                        str = strM3412;
                        i3 = ((iM450210 ^ i12) * (-2591)) ^ (-2128536306);
                        i4 = -853519068;
                        i15 = iM450210 ^ i4;
                        i13 = i3;
                        strM3412 = str;
                        break;
                    case 1477524764:
                    case 1829650980:
                        strM3412 = C0817.m3412(C1377.m4826(), i);
                        if (C0629.f2722 <= 0) {
                            iM450210 = ThreadFactoryC3888.m11306("۫ۖ") ^ i11;
                            str = strM3412;
                            i3 = ((iM450210 ^ i12) * (-2591)) ^ (-2128536306);
                            i4 = -853519068;
                        } else {
                            iM450210 = (ThreadFactoryC3888.m11306("ۡۛ") ^ i11) * (-21);
                            str = strM3412;
                            i3 = ((iM450210 ^ i12) * (-20635)) ^ (-1143966611);
                            i4 = -1223885444;
                        }
                        i15 = iM450210 ^ i4;
                        i13 = i3;
                        strM3412 = str;
                        break;
                    default:
                        C3577.m10565();
                        C1460.m5050();
                        return null;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0063  */
    /* JADX WARN: Code duplicated, block: B:32:0x00de A[PHI: r10 r11 r12 r16
      0x00de: PHI (r10v3 short[]) = (r10v2 short[]), (r10v2 short[]), (r10v2 short[]), (r10v2 short[]), (r10v5 short[]) binds: [B:29:0x00c4, B:19:0x0085, B:17:0x0082, B:14:0x005f, B:6:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x00de: PHI (r11v3 int) = (r11v2 int), (r11v2 int), (r11v2 int), (r11v2 int), (r11v5 int) binds: [B:29:0x00c4, B:19:0x0085, B:17:0x0082, B:14:0x005f, B:6:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x00de: PHI (r12v4 int) = (r12v3 int), (r12v2 int), (r12v2 int), (r12v2 int), (r12v2 int) binds: [B:29:0x00c4, B:19:0x0085, B:17:0x0082, B:14:0x005f, B:6:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x00de: PHI (r16v22 int) = (r16v13 int), (r16v15 int), (r16v17 int), (r16v18 int), (r16v25 int) binds: [B:29:0x00c4, B:19:0x0085, B:17:0x0082, B:14:0x005f, B:6:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0227 A[PHI: r4 r8 r16
      0x0227: PHI (r4v4 char) = (r4v2 char), (r4v3 char), (r4v2 char), (r4v2 char) binds: [B:62:0x0225, B:54:0x01e8, B:42:0x0169, B:11:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x0227: PHI (r8v4 short) = (r8v2 short), (r8v2 short), (r8v3 short), (r8v2 short) binds: [B:62:0x0225, B:54:0x01e8, B:42:0x0169, B:11:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x0227: PHI (r16v20 int) = (r16v3 int), (r16v5 int), (r16v8 int), (r16v21 int) binds: [B:62:0x0225, B:54:0x01e8, B:42:0x0169, B:11:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x0257 A[PHI: r2 r3 r7 r16
      0x0257: PHI (r2v4 java.lang.String) = 
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
      (r2v3 java.lang.String)
      (r2v2 java.lang.String)
     binds: [B:66:0x0255, B:58:0x0208, B:46:0x018d, B:25:0x00a2, B:17:0x0082] A[DONT_GENERATE, DONT_INLINE]
      0x0257: PHI (r3v4 short[]) = (r3v3 short[]), (r3v2 short[]), (r3v2 short[]), (r3v2 short[]), (r3v2 short[]) binds: [B:66:0x0255, B:58:0x0208, B:46:0x018d, B:25:0x00a2, B:17:0x0082] A[DONT_GENERATE, DONT_INLINE]
      0x0257: PHI (r7v4 int) = (r7v2 int), (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int) binds: [B:66:0x0255, B:58:0x0208, B:46:0x018d, B:25:0x00a2, B:17:0x0082] A[DONT_GENERATE, DONT_INLINE]
      0x0257: PHI (r16v16 int) = (r16v2 int), (r16v4 int), (r16v7 int), (r16v14 int), (r16v17 int) binds: [B:66:0x0255, B:58:0x0208, B:46:0x018d, B:25:0x00a2, B:17:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m39273(Runnable runnable) {
        int iM11306;
        int i;
        int i2;
        int i3 = RunnableC1606.f6488;
        int i4 = ViewTreeObserverOnPreDrawListenerC3327.f12317;
        int iM45029 = C19806.m45029("֫۟") ^ i4;
        int i5 = ((iM45029 ^ i3) * (-19809)) ^ 983609459;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM45029 ^ (-1155344484);
        String strM5481 = null;
        char c = 0;
        short s = 0;
        int i7 = 0;
        int i8 = 0;
        short s2 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 1435316749;
        while (true) {
            int i13 = i6 ^ (i5 & (((i12 ^ i3) * (-1911)) >> 31));
            switch (i13) {
                case -2147174007:
                case 800736230:
                    i13 = i13;
                    if (RunnableC0195.f1321 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۗ۟") ^ i4;
                        i = ((iM11306 ^ i3) * 30127) ^ 31655777;
                        i2 = 895749938;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩸֫") ^ i4;
                        i = ((iM11306 ^ i3) * 19769) ^ (-961054173);
                        i2 = 1833766694;
                    }
                    int i14 = i13;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    i12 = i14;
                    break;
                case -1906105846:
                case 1514697483:
                    i13 = i13;
                    if ((s * s2) - i8 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩺᩷") ^ i3;
                        i = ((iM11306 ^ i4) * 823) ^ (-624108913);
                        i2 = -2097159956;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ܺܳ")) * 37;
                        i = ((iM11306 ^ i4) * (-5305)) ^ 71342474;
                        i2 = -1708334853;
                    }
                    int i15 = i13;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    i12 = i15;
                    break;
                case -1653251649:
                case -387218300:
                    CallableC1627.m5508(runnable, strM5481);
                    f53610.post(runnable);
                    break;
                case -1516869598:
                case -417149692:
                    i13 = i13;
                    s2 = 23244;
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۗ۟") ^ i4;
                        i = ((iM11306 ^ i3) * 30127) ^ 31655777;
                        i2 = 895749938;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩸ܰ") ^ i4) * (-87);
                        i = ((iM11306 ^ i3) * 15625) ^ 1466388370;
                        i2 = -1755679383;
                    }
                    int i16 = i13;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    i12 = i16;
                    break;
                case -1177713627:
                case 649435200:
                    i13 = i13;
                    if (CallableC1627.m5507() != 0) {
                        iM11306 = (i3 - C19806.m45029("ۚܽ")) * (-103);
                        i = ((iM11306 ^ i4) * (-14525)) ^ (-1963339747);
                        i2 = 1318556036;
                    } else {
                        iM11306 = (C19806.m45029("ۘۨ") ^ i4) * (-51);
                        i = ((iM11306 ^ i3) * (-25197)) ^ (-1249536955);
                        i2 = 1677636604;
                    }
                    int i17 = i13;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    i12 = i17;
                    break;
                case -1032892334:
                case 809255168:
                    i9 = 37946;
                    iM11306 = ThreadFactoryC3888.m11306("ۗ᩷") ^ i4;
                    i = ((iM11306 ^ i3) * 28995) ^ (-1555122555);
                    i2 = -1637106121;
                    int i18 = i13;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    i12 = i18;
                    break;
                case -1002747019:
                case -762675400:
                    i13 = i13;
                    strM5481 = RunnableC1606.m5481(sArr2, i10, i11, i9);
                    if (MenuItemOnMenuItemClickListenerC3244.m9701() >= 0) {
                        iM11306 = (C19806.m45029("ۘۨ") ^ i4) * (-51);
                        i = ((iM11306 ^ i3) * (-25197)) ^ (-1249536955);
                        i2 = 1677636604;
                    } else {
                        iM11306 = (C19806.m45029("ۗܳ") ^ i4) * 115;
                        i = ((iM11306 ^ i3) * 32535) ^ (-1137504760);
                        i2 = 43496473;
                    }
                    int i19 = i13;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    i12 = i19;
                    break;
                case -837321687:
                case -180220402:
                    C3286.m9798();
                    break;
                case -811538584:
                case 1524643180:
                    i13 = i13;
                    c = 212;
                    if (CallableC1627.f6528) {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩳܳ") ^ i4) * 47;
                        i = ((iM11306 ^ i3) * (-2293)) ^ 550163199;
                        i2 = 1442348222;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۗ۟") ^ i4;
                        i = ((iM11306 ^ i3) * 30127) ^ 31655777;
                        i2 = 895749938;
                    }
                    int i110 = i13;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    i12 = i110;
                    break;
                case -649783447:
                case -228283237:
                    i13 = i13;
                    sArr = f53609;
                    if (RunnableC1895.f7152) {
                        iM11306 = ThreadFactoryC3888.m11306("ۚۛ") ^ i3;
                        i = ((iM11306 ^ i4) * 14991) ^ (-1085115399);
                        i2 = 1876145168;
                    } else {
                        iM11306 = (C19806.m45029("ۘۨ") ^ i4) * (-51);
                        i = ((iM11306 ^ i3) * (-25197)) ^ (-1249536955);
                        i2 = 1677636604;
                    }
                    int i111 = i13;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    i12 = i111;
                    break;
                case -400226019:
                case 604567686:
                    i13 = i13;
                    if (C1977.m6356()) {
                        iM11306 = (C19806.m45029("ۘۨ") ^ i4) * (-51);
                        i = ((iM11306 ^ i3) * (-25197)) ^ (-1249536955);
                        i2 = 1677636604;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۡܶ") + i3) * 49;
                        i = ((iM11306 ^ i4) * 6827) ^ 1310207166;
                        i2 = -1298504495;
                    }
                    int i112 = i13;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    i12 = i112;
                    break;
                case -123012080:
                case -39839467:
                    C2788.m8472();
                    if (AbstractC0464.f2088 > 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("۟֫") + i3) * (-69);
                        i13 = i13;
                        i = ((iM11306 ^ i4) * 23455) ^ 193234180;
                        i2 = -480926903;
                    } else {
                        i13 = i13;
                        iM11306 = ThreadFactoryC3888.m11306("ۗ۟") ^ i4;
                        i = ((iM11306 ^ i3) * 30127) ^ 31655777;
                        i2 = 895749938;
                    }
                    int i113 = i13;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    i12 = i113;
                    break;
                case 83308571:
                case 767636083:
                    i13 = i13;
                    CallableC1627.m5507();
                    iM11306 = (i3 - C19806.m45029("ۚܽ")) * (-103);
                    i = ((iM11306 ^ i4) * (-14525)) ^ (-1963339747);
                    i2 = 1318556036;
                    int i114 = i13;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    i12 = i114;
                    break;
                case 115589701:
                case 2082609225:
                    if (C1937.f7317 >= 0) {
                        i13 = i13;
                        iM11306 = (i3 - C19806.m45029("ۚܽ")) * (-103);
                        i = ((iM11306 ^ i4) * (-14525)) ^ (-1963339747);
                        i2 = 1318556036;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۟֫") + i3) * (-69);
                        i13 = i13;
                        i = ((iM11306 ^ i4) * 23455) ^ 193234180;
                        i2 = -480926903;
                    }
                    int i115 = i13;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    i12 = i115;
                    break;
                case 639645283:
                case 784688043:
                    i13 = i13;
                    s = sArr[c];
                    i7 = s * s;
                    if (C1460.m5050() != 0) {
                        iM11306 = (C19806.m45029("ᩴ֨") ^ i3) * (-91);
                        i = ((iM11306 ^ i4) * 21785) ^ (-1184425870);
                        i2 = 1122958729;
                    } else {
                        iM11306 = (C19806.m45029("۬ۗ") ^ i3) * 95;
                        i = ((iM11306 ^ i4) * (-32759)) ^ (-192505835);
                        i2 = 1365968284;
                    }
                    int i116 = i13;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    i12 = i116;
                    break;
                case 931800284:
                case 1831565577:
                    i9 = 3731;
                    iM11306 = ThreadFactoryC3888.m11306("ۗ᩷") ^ i4;
                    i = ((iM11306 ^ i3) * 28995) ^ (-1555122555);
                    i2 = -1637106121;
                    int i117 = i13;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    i12 = i117;
                    break;
                case 1369854705:
                case 1833547786:
                    i13 = i13;
                    i8 = i7 + 135070884;
                    if (C3577.f13150 >= 0) {
                        iM11306 = (C19806.m45029("ۘۨ") ^ i4) * (-51);
                        i = ((iM11306 ^ i3) * (-25197)) ^ (-1249536955);
                        i2 = 1677636604;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۢ֫") ^ i4) * (-65);
                        i = ((iM11306 ^ i3) * (-30185)) ^ (-693561164);
                        i2 = -1063114044;
                    }
                    int i118 = i13;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    i12 = i118;
                    break;
                case 1424959775:
                case 1598684911:
                    i13 = i13;
                    i11 = 1;
                    if (C1148.m4232() <= 0) {
                        iM11306 = (i3 - C19806.m45029("ۚܽ")) * (-103);
                        i = ((iM11306 ^ i4) * (-14525)) ^ (-1963339747);
                        i2 = 1318556036;
                    } else {
                        iM11306 = (C19806.m45029("ܳ֫") + i3) * 5;
                        i = ((iM11306 ^ i4) * (-11637)) ^ (-1948407284);
                        i2 = 1795219717;
                    }
                    int i119 = i13;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    i12 = i119;
                    break;
                default:
                    i13 = i13;
                    sArr2 = f53609;
                    i10 = 213;
                    if (C2788.f10625 >= 0) {
                        iM11306 = (i3 - C19806.m45029("ۚܽ")) * (-103);
                        i = ((iM11306 ^ i4) * (-14525)) ^ (-1963339747);
                        i2 = 1318556036;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۗۨ") ^ i4;
                        i = ((iM11306 ^ i3) * (-32335)) ^ (-804422550);
                        i2 = 370141581;
                    }
                    int i1110 = i13;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    i12 = i1110;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0059  */
    /* JADX WARN: Code duplicated, block: B:48:0x017f A[PHI: r6 r7 r12 r16
      0x017f: PHI (r6v4 int) = (r6v2 int), (r6v1 int), (r6v1 int), (r6v1 int) binds: [B:47:0x017d, B:24:0x0088, B:19:0x0073, B:9:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x017f: PHI (r7v4 int) = (r7v2 int), (r7v1 int), (r7v1 int), (r7v1 int) binds: [B:47:0x017d, B:24:0x0088, B:19:0x0073, B:9:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x017f: PHI (r12v4 int) = (r12v1 int), (r12v2 int), (r12v1 int), (r12v1 int) binds: [B:47:0x017d, B:24:0x0088, B:19:0x0073, B:9:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x017f: PHI (r16v28 int) = (r16v11 int), (r16v20 int), (r16v21 int), (r16v29 int) binds: [B:47:0x017d, B:24:0x0088, B:19:0x0073, B:9:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0210 A[PHI: r3 r4 r16
      0x0210: PHI (r3v3 short) = (r3v1 short), (r3v2 short), (r3v1 short), (r3v1 short) binds: [B:63:0x020e, B:59:0x01f2, B:55:0x01d2, B:10:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x0210: PHI (r4v3 short) = (r4v1 short), (r4v1 short), (r4v2 short), (r4v1 short) binds: [B:63:0x020e, B:59:0x01f2, B:55:0x01d2, B:10:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x0210: PHI (r16v25 int) = (r16v7 int), (r16v8 int), (r16v9 int), (r16v30 int) binds: [B:63:0x020e, B:59:0x01f2, B:55:0x01d2, B:10:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x0241 A[PHI: r5 r10 r11 r16
      0x0241: PHI (r5v3 int) = (r5v1 int), (r5v2 int), (r5v1 int) binds: [B:67:0x023f, B:51:0x01b3, B:28:0x00ae] A[DONT_GENERATE, DONT_INLINE]
      0x0241: PHI (r10v2 short[]) = (r10v1 short[]), (r10v1 short[]), (r10v3 short[]) binds: [B:67:0x023f, B:51:0x01b3, B:28:0x00ae] A[DONT_GENERATE, DONT_INLINE]
      0x0241: PHI (r11v2 int) = (r11v1 int), (r11v1 int), (r11v3 int) binds: [B:67:0x023f, B:51:0x01b3, B:28:0x00ae] A[DONT_GENERATE, DONT_INLINE]
      0x0241: PHI (r16v18 int) = (r16v6 int), (r16v10 int), (r16v19 int) binds: [B:67:0x023f, B:51:0x01b3, B:28:0x00ae] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x0275 A[PHI: r1 r2 r8 r16
      0x0275: PHI (r1v3 short[]) = (r1v2 short[]), (r1v1 short[]), (r1v1 short[]) binds: [B:71:0x0273, B:43:0x0159, B:14:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0275: PHI (r2v3 char) = (r2v2 char), (r2v1 char), (r2v1 char) binds: [B:71:0x0273, B:43:0x0159, B:14:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0275: PHI (r8v3 int) = (r8v1 int), (r8v2 int), (r8v1 int) binds: [B:71:0x0273, B:43:0x0159, B:14:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0275: PHI (r16v23 int) = (r16v5 int), (r16v12 int), (r16v24 int) binds: [B:71:0x0273, B:43:0x0159, B:14:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final Application m39277() {
        int iM45029;
        int i;
        int i2;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        short[] sArr2 = null;
        int i8 = 0;
        int i9 = 0;
        int i10 = -782711764;
        int i11 = C1937.f7317;
        int i12 = ThreadFactoryC3888.f14547;
        int iM11306 = ThreadFactoryC3888.m11306("ۛܰ") ^ i12;
        int i13 = ((iM11306 ^ i11) * 26567) ^ 878004516;
        int i14 = iM11306 ^ (-1170322140);
        ApplicationC0716 applicationC0716 = null;
        while (true) {
            int i15 = i14 ^ (i13 & (((i10 ^ i11) * 16995) >> 31));
            switch (i15) {
                case -2108017610:
                case -1064130367:
                    C0278.m1789();
                    C3743.m10966();
                    return null;
                case -2088519027:
                case -1621258848:
                    i15 = i15;
                    i4 = s * s;
                    i5 = 199233225;
                    if (C3743.f13569) {
                        iM45029 = C19806.m45029("᩷᩺") ^ i11;
                        i = ((iM45029 ^ i12) * 29805) ^ (-779558646);
                        i2 = -1060869181;
                    } else {
                        iM45029 = C19806.m45029("֫ۡ") ^ i11;
                        i = ((iM45029 ^ i12) * (-10493)) ^ 873241098;
                        i2 = 1776744397;
                    }
                    int i16 = i15;
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    i10 = i16;
                    break;
                case -1939573782:
                case 598959086:
                    i15 = i15;
                    applicationC0716 = f53614;
                    if (applicationC0716 != null) {
                        iM45029 = (C19806.m45029("᩶ܶ") + i12) * (-89);
                        i = ((iM45029 ^ i11) * (-10039)) ^ (-1773358800);
                        i2 = 1450890463;
                    } else {
                        iM45029 = C19806.m45029("ۚ᩺") ^ i11;
                        i = ((iM45029 ^ i12) * (-19637)) ^ 1044123940;
                        i2 = 2043327451;
                    }
                    int i17 = i15;
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    i10 = i17;
                    break;
                case -1885719823:
                case -1223484925:
                    i15 = i15;
                    i9 = 7;
                    if (C1875.f7103 >= 0) {
                        iM45029 = C19806.m45029("֫ۡ") ^ i11;
                        i = ((iM45029 ^ i12) * (-10493)) ^ 873241098;
                        i2 = 1776744397;
                    } else {
                        iM45029 = (i11 - C19806.m45029("ۧܽ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM45029 ^ i12) * 23571) ^ 1718047025;
                        i2 = 51374803;
                    }
                    int i18 = i15;
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    i10 = i18;
                    break;
                case -1866821422:
                case 2139032229:
                    if (C1398.f5802 > 0) {
                        i15 = i15;
                        iM45029 = (C19806.m45029("ۜۛ") ^ i11) * (-95);
                        i = ((iM45029 ^ i12) * 5543) ^ (-1287162878);
                        i2 = -885762489;
                        int i19 = i15;
                        i14 = iM45029 ^ i2;
                        i13 = i;
                        i10 = i19;
                    }
                    i15 = i15;
                    iM45029 = C19806.m45029("֫ۡ") ^ i11;
                    i = ((iM45029 ^ i12) * (-10493)) ^ 873241098;
                    i2 = 1776744397;
                    int i110 = i15;
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    i10 = i110;
                    break;
                case -1837750186:
                case 609867601:
                    i15 = i15;
                    sArr2 = f53609;
                    i8 = 299;
                    if (C0278.m1789() <= 0) {
                        iM45029 = (C19806.m45029("۫ᩴ") ^ i12) * (-125);
                        i = ((iM45029 ^ i11) * (-24867)) ^ 16259381;
                        i2 = -1374424862;
                    } else {
                        iM45029 = (i12 - C19806.m45029("᩻۫")) * (-65);
                        i = ((iM45029 ^ i11) * (-3045)) ^ 667690761;
                        i2 = -1499513137;
                    }
                    int i111 = i15;
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    i10 = i111;
                    break;
                case -1789962173:
                case 1368298447:
                    i15 = i15;
                    if ((i6 + i6) - i3 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܽ۬") ^ i11) * (-121);
                        i = ((iM45029 ^ i12) * (-7503)) ^ 2064402939;
                        i2 = -1252171658;
                    } else {
                        iM45029 = C19806.m45029("ܶۜ") ^ i12;
                        i = ((iM45029 ^ i11) * (-32075)) ^ (-1632320745);
                        i2 = -1635398455;
                    }
                    int i112 = i15;
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    i10 = i112;
                    break;
                case -1697819031:
                case -1268273112:
                    i15 = i15;
                    if (C2642.f10294 <= 0) {
                        iM45029 = (C19806.m45029("ۜۛ") ^ i11) * (-95);
                        i = ((iM45029 ^ i12) * 5543) ^ (-1287162878);
                        i2 = -885762489;
                    } else {
                        iM45029 = C19806.m45029("ۢ۠") ^ i11;
                        i = ((iM45029 ^ i12) * (-23873)) ^ 161195783;
                        i2 = 534421340;
                    }
                    int i113 = i15;
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    i10 = i113;
                    break;
                case -1606450749:
                case -1376001974:
                    return applicationC0716;
                case -1203601739:
                case -329442155:
                    i15 = i15;
                    sArr = f53609;
                    c = 298;
                    if (C1461.f5957 <= 0) {
                        iM45029 = (i12 - ThreadFactoryC3888.m11306("ۨ۠")) * 71;
                        i = ((iM45029 ^ i11) * (-24585)) ^ (-1050435609);
                        i2 = 1259885848;
                    } else {
                        iM45029 = (C19806.m45029("ۧܶ") ^ i12) * (-75);
                        i = ((iM45029 ^ i11) * 20203) ^ (-344088440);
                        i2 = -176058767;
                    }
                    int i114 = i15;
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    i10 = i114;
                    break;
                case -1184823517:
                case -801936489:
                    i15 = i15;
                    int i20 = s + s2;
                    i3 = i20 * i20;
                    if (C0817.m3399()) {
                        iM45029 = ThreadFactoryC3888.m11306("᩷᩸") ^ i11;
                        i = ((iM45029 ^ i12) * (-28659)) ^ 173520069;
                        i2 = 1748795649;
                    } else {
                        iM45029 = (C19806.m45029("۫ᩴ") ^ i12) * (-125);
                        i = ((iM45029 ^ i11) * (-24867)) ^ 16259381;
                        i2 = -1374424862;
                    }
                    int i115 = i15;
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    i10 = i115;
                    break;
                case -1102730420:
                case 721063508:
                    if (C0050.f912 > 0) {
                        i15 = i15;
                        iM45029 = C19806.m45029("֫ۡ") ^ i11;
                        i = ((iM45029 ^ i12) * (-10493)) ^ 873241098;
                        i2 = 1776744397;
                    } else {
                        iM45029 = (i11 - ThreadFactoryC3888.m11306("᩺᩵")) * (-3);
                        i15 = i15;
                        i = ((iM45029 ^ i12) * (-24633)) ^ 800630875;
                        i2 = 1887121743;
                    }
                    int i116 = i15;
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    i10 = i116;
                    break;
                case -977361963:
                case -542357906:
                    i15 = i15;
                    s2 = 14115;
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM45029 = (C19806.m45029("ۜۛ") ^ i11) * (-95);
                        i = ((iM45029 ^ i12) * 5543) ^ (-1287162878);
                        i2 = -885762489;
                    } else {
                        iM45029 = (C19806.m45029("ۨ᩷") + i12) * (-81);
                        i = ((iM45029 ^ i11) * (-32635)) ^ 34946788;
                        i2 = 324284510;
                    }
                    int i117 = i15;
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    i10 = i117;
                    break;
                case -924409685:
                case 641021479:
                    i7 = 38898;
                    iM45029 = ThreadFactoryC3888.m11306("۠ۚ") ^ i12;
                    i = ((iM45029 ^ i11) * (-20805)) ^ (-1751142043);
                    i2 = 1976578576;
                    int i118 = i15;
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    i10 = i118;
                    break;
                case -666326871:
                case 646155672:
                    i7 = 16805;
                    iM45029 = ThreadFactoryC3888.m11306("۠ۚ") ^ i12;
                    i = ((iM45029 ^ i11) * (-20805)) ^ (-1751142043);
                    i2 = 1976578576;
                    int i119 = i15;
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    i10 = i119;
                    break;
                case -194628081:
                case 1199373025:
                    i15 = i15;
                    s = sArr[c];
                    if (C1377.f5749) {
                        iM45029 = ThreadFactoryC3888.m11306("۟۬") ^ i12;
                        i = ((iM45029 ^ i11) * 17031) ^ (-1308316633);
                        i2 = -1814171076;
                    } else {
                        iM45029 = (C19806.m45029("ۜۛ") ^ i11) * (-95);
                        i = ((iM45029 ^ i12) * 5543) ^ (-1287162878);
                        i2 = -885762489;
                    }
                    int i1110 = i15;
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    i10 = i1110;
                    break;
                case -111080196:
                case 1286585381:
                    i15 = i15;
                    C0797.m3359();
                    iM45029 = C19806.m45029("֫ۡ") ^ i11;
                    i = ((iM45029 ^ i12) * (-10493)) ^ 873241098;
                    i2 = 1776744397;
                    int i1111 = i15;
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    i10 = i1111;
                    break;
                case 296920077:
                case 1338978581:
                    if (C2704.f10408) {
                        iM45029 = (i11 - ThreadFactoryC3888.m11306("᩺᩵")) * (-3);
                        i15 = i15;
                        i = ((iM45029 ^ i12) * (-24633)) ^ 800630875;
                        i2 = 1887121743;
                    } else {
                        i15 = i15;
                        iM45029 = (i12 - ThreadFactoryC3888.m11306("ۨ۠")) * 71;
                        i = ((iM45029 ^ i11) * (-24585)) ^ (-1050435609);
                        i2 = 1259885848;
                    }
                    int i1112 = i15;
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    i10 = i1112;
                    break;
                case 729501773:
                case 765046405:
                    i15 = i15;
                    i6 = i4 + i5;
                    if (C0629.f2722 <= 0) {
                        iM45029 = (i12 - ThreadFactoryC3888.m11306("ۨ۠")) * 71;
                        i = ((iM45029 ^ i11) * (-24585)) ^ (-1050435609);
                        i2 = 1259885848;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳ۬") ^ i12) * (-39);
                        i = ((iM45029 ^ i11) * 10187) ^ (-1687701212);
                        i2 = 1133895638;
                    }
                    int i1113 = i15;
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    i10 = i1113;
                    break;
                case 1164245014:
                case 1471909552:
                    i15 = i15;
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM45029 = (C19806.m45029("۫ᩴ") ^ i12) * (-125);
                        i = ((iM45029 ^ i11) * (-24867)) ^ 16259381;
                        i2 = -1374424862;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܳ۫") ^ i11;
                        i = ((iM45029 ^ i12) * 28825) ^ 1004356296;
                        i2 = 1608196957;
                    }
                    int i1114 = i15;
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    i10 = i1114;
                    break;
                default:
                    C1398.m4902(C1398.m4892(sArr2, i8, i9, i7));
                    throw null;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m39276(boolean z) {
        f53611 = z;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final boolean m39291() {
        return f53611;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final boolean m39260() {
        return f53612;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final void m39281() {
        f53612 = true;
    }

    static {
        C13081 c13081 = null;
        C16032 c16032 = null;
        InterfaceC5204 interfaceC5204M49098 = null;
        int i = 98685755;
        int i2 = C1189.f5284;
        int i3 = RunnableC1606.f6488;
        int iM11306 = ThreadFactoryC3888.m11306("۟ܰ") ^ i3;
        int i4 = ((iM11306 ^ i2) * (-27075)) ^ (-865970212);
        int i5 = 941167445;
        while (true) {
            i = ((((i ^ i2) * 1317) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -1828393541:
                case -1250058111:
                    C1977.m6356();
                    if (RunnableC0195.f1321 < 0) {
                        iM11306 = C19806.m45029("ܶܽ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-22443)) ^ 951012062;
                        i5 = 1342618593;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۛۜ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 19069) ^ (-921378013);
                        i5 = 5387359;
                    }
                    break;
                case -1808082034:
                case 647751859:
                    C2249.m6915();
                    C1875.m6086();
                    iM11306 = ThreadFactoryC3888.m11306("ۛۜ") ^ i3;
                    i4 = ((iM11306 ^ i2) * 19069) ^ (-921378013);
                    i5 = 5387359;
                    break;
                case -1552916983:
                case 103027155:
                    f53613 = interfaceC5204M49098;
                    if (C0817.f3443) {
                        iM11306 = ThreadFactoryC3888.m11306("ۚ᩻") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-7199)) ^ 1413639207;
                        i5 = -1144339320;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۢۧ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-24819)) ^ (-1072856698);
                        i5 = -482178097;
                    }
                    break;
                case -1445855976:
                case -674358852:
                    c13081 = new C13081();
                    if (C1668.f6641 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۛۜ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 19069) ^ (-921378013);
                        i5 = 5387359;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩶ܺ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 27151) ^ 614344678;
                        i5 = 1407387766;
                    }
                    break;
                case -1426252282:
                case 838231428:
                    if (C1875.f7103 < 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۢۧ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-24819)) ^ (-1072856698);
                        i5 = -482178097;
                    } else {
                        iM11306 = C19806.m45029("ܶܽ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-22443)) ^ 951012062;
                        i5 = 1342618593;
                    }
                    break;
                case -1137187542:
                case 1768915887:
                    if (C1419.m4973()) {
                        iM11306 = ThreadFactoryC3888.m11306("ۛۜ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 19069) ^ (-921378013);
                        i5 = 5387359;
                    } else {
                        iM11306 = (C19806.m45029("ܿ᩹") ^ i2) * (-57);
                        i4 = ((iM11306 ^ i3) * 23483) ^ (-217512351);
                        i5 = -988143493;
                    }
                    break;
                case -1076786178:
                case 1957548134:
                    if (C1148.f5161 > 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۛۜ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 19069) ^ (-921378013);
                        i5 = 5387359;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۡۜ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 28991) ^ 559181491;
                        i5 = -461587036;
                    }
                    break;
                case -985572074:
                case -897409216:
                    if (C1189.f5284 <= 0) {
                        iM11306 = C19806.m45029("ܶܽ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-22443)) ^ 951012062;
                        i5 = 1342618593;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܽۘ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 14703) ^ 332476176;
                        i5 = 541100685;
                    }
                    break;
                case -879980456:
                case 1558617463:
                    if (C1148.f5161 > 0) {
                        f53610 = new Handler(C19806.m45016());
                        return;
                    }
                    iM11306 = ThreadFactoryC3888.m11306("ۢۧ") ^ i2;
                    i4 = ((iM11306 ^ i3) * (-24819)) ^ (-1072856698);
                    i5 = -482178097;
                    break;
                case -625772206:
                case 178533764:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 > 0) {
                        interfaceC5204M49098 = C22138.m49098(new C20265());
                        if (C2249.f8050 < 0) {
                            iM11306 = (ThreadFactoryC3888.m11306("ۧۚ") + i3) * 83;
                            i4 = ((iM11306 ^ i2) * 10827) ^ (-422076646);
                            i5 = 1613897336;
                        }
                        break;
                    }
                    iM11306 = C19806.m45029("ۛۛ") ^ i2;
                    i4 = ((iM11306 ^ i3) * 1099) ^ (-1652190559);
                    i5 = 1102054613;
                    break;
                case -605381991:
                case 1342625671:
                    f53607 = c13081;
                    if (C1419.m4973()) {
                        iM11306 = C19806.m45029("ܶܽ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-22443)) ^ 951012062;
                        i5 = 1342618593;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۟ۗ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 23613) ^ (-1470880356);
                        i5 = 730889003;
                    }
                    break;
                case -458027086:
                case 1013860523:
                    f53608 = C22138.m49098(c16032);
                    if (C1937.f7317 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۢۧ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-24819)) ^ (-1072856698);
                        i5 = -482178097;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۘܺ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 24369) ^ 1310194253;
                        i5 = 2061653207;
                    }
                    break;
                case -276481562:
                case 799160237:
                    C2249.m6915();
                    throw new RuntimeException();
                default:
                    c16032 = new C16032();
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۢۧ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-24819)) ^ (-1072856698);
                        i5 = -482178097;
                    } else {
                        iM11306 = (C19806.m45029("ܿܽ") + i3) * (-69);
                        i4 = ((iM11306 ^ i2) * 1821) ^ 1075577358;
                        i5 = 1727713369;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x017d A[PHI: r9 r11 r16
      0x017d: PHI (r9v4 int) = (r9v3 int), (r9v2 int), (r9v2 int) binds: [B:47:0x017b, B:32:0x00de, B:13:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x017d: PHI (r11v4 short[]) = (r11v2 short[]), (r11v3 short[]), (r11v2 short[]) binds: [B:47:0x017b, B:32:0x00de, B:13:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x017d: PHI (r16v19 int) = (r16v6 int), (r16v12 int), (r16v20 int) binds: [B:47:0x017b, B:32:0x00de, B:13:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x01b3 A[PHI: r8 r12 r16
      0x01b3: PHI (r8v4 int) = (r8v3 int), (r8v2 int), (r8v2 int), (r8v2 int) binds: [B:51:0x01b1, B:28:0x00bd, B:18:0x007d, B:16:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x01b3: PHI (r12v4 int) = (r12v2 int), (r12v3 int), (r12v2 int), (r12v2 int) binds: [B:51:0x01b1, B:28:0x00bd, B:18:0x007d, B:16:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x01b3: PHI (r16v17 int) = (r16v5 int), (r16v13 int), (r16v16 int), (r16v18 int) binds: [B:51:0x01b1, B:28:0x00bd, B:18:0x007d, B:16:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x021d A[PHI: r1 r5 r6 r16
      0x021d: PHI (r1v5 java.lang.Object) = 
      (r1v2 java.lang.Object)
      (r1v4 java.lang.Object)
      (r1v2 java.lang.Object)
      (r1v2 java.lang.Object)
      (r1v2 java.lang.Object)
      (r1v2 java.lang.Object)
     binds: [B:60:0x021b, B:36:0x0103, B:16:0x0079, B:13:0x0071, B:10:0x0050, B:6:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x021d: PHI (r5v4 short) = (r5v3 short), (r5v2 short), (r5v2 short), (r5v2 short), (r5v2 short), (r5v2 short) binds: [B:60:0x021b, B:36:0x0103, B:16:0x0079, B:13:0x0071, B:10:0x0050, B:6:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x021d: PHI (r6v3 short) = (r6v2 short), (r6v2 short), (r6v2 short), (r6v2 short), (r6v2 short), (r6v5 short) binds: [B:60:0x021b, B:36:0x0103, B:16:0x0079, B:13:0x0071, B:10:0x0050, B:6:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x021d: PHI (r16v23 int) = (r16v3 int), (r16v11 int), (r16v18 int), (r16v20 int), (r16v22 int), (r16v26 int) binds: [B:60:0x021b, B:36:0x0103, B:16:0x0079, B:13:0x0071, B:10:0x0050, B:6:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x024f A[PHI: r2 r3 r4 r7 r16
      0x024f: PHI (r2v3 java.lang.String) = (r2v2 java.lang.String), (r2v2 java.lang.String), (r2v4 java.lang.String) binds: [B:64:0x024d, B:55:0x01e5, B:24:0x009c] A[DONT_GENERATE, DONT_INLINE]
      0x024f: PHI (r3v4 short[]) = (r3v3 short[]), (r3v2 short[]), (r3v2 short[]) binds: [B:64:0x024d, B:55:0x01e5, B:24:0x009c] A[DONT_GENERATE, DONT_INLINE]
      0x024f: PHI (r4v4 char) = (r4v3 char), (r4v2 char), (r4v2 char) binds: [B:64:0x024d, B:55:0x01e5, B:24:0x009c] A[DONT_GENERATE, DONT_INLINE]
      0x024f: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int) binds: [B:64:0x024d, B:55:0x01e5, B:24:0x009c] A[DONT_GENERATE, DONT_INLINE]
      0x024f: PHI (r16v14 int) = (r16v2 int), (r16v4 int), (r16v15 int) binds: [B:64:0x024d, B:55:0x01e5, B:24:0x009c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final C5079 m39297() {
        int iM45029;
        int i;
        int i2;
        int i3 = C3577.f13150;
        int i4 = C0629.f2722;
        int iM450210 = C19806.m45029("ۖۚ") ^ i3;
        int i5 = ((iM450210 ^ i4) * (-19545)) ^ 1382536169;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM450210 ^ (-35730300);
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = -2074275054;
        String strM6105 = null;
        Object value = null;
        while (true) {
            int i13 = i6 ^ (i5 & (((i12 ^ i4) * 12877) >> 31));
            switch (i13) {
                case -1946202982:
                case 1300185110:
                    i13 = i13;
                    i11 = 734;
                    if (C1937.m6279() >= 0) {
                        iM45029 = C19806.m45029("ۘ᩵") ^ i3;
                        i = ((iM45029 ^ i4) * 3857) ^ (-778636594);
                        i2 = -182223312;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۗ᩸") ^ i3;
                        i = ((iM45029 ^ i4) * 7725) ^ 931110720;
                        i2 = -313212180;
                    }
                    int i14 = i13;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    i12 = i14;
                    break;
                case -1857733930:
                case 2060735622:
                    i13 = i13;
                    value = f53608.getValue();
                    if (C2477.f9839 <= 0) {
                        iM45029 = C19806.m45029("ۜۙ") ^ i3;
                        i = ((iM45029 ^ i4) * (-15185)) ^ 1827936292;
                        i2 = -224674099;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴۗ") ^ i3;
                        i = ((iM45029 ^ i4) * 6517) ^ (-1905727680);
                        i2 = 1713795651;
                    }
                    int i15 = i13;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    i12 = i15;
                    break;
                case -1782653894:
                case -1493509350:
                    i13 = i13;
                    i8 = s * 2;
                    if (C0050.m946() <= 0) {
                        iM45029 = C19806.m45029("ۘ᩵") ^ i3;
                        i = ((iM45029 ^ i4) * 3857) ^ (-778636594);
                        i2 = -182223312;
                    } else {
                        iM45029 = C19806.m45029("᩻᩸") ^ i3;
                        i = ((iM45029 ^ i4) * 16803) ^ 1146848439;
                        i2 = 1564339182;
                    }
                    int i16 = i13;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    i12 = i16;
                    break;
                case -1728506470:
                case 134068727:
                    i10 = 10603;
                    iM45029 = ThreadFactoryC3888.m11306("ᩳۛ") ^ i4;
                    i = ((iM45029 ^ i3) * (-12295)) ^ 110361399;
                    i2 = -2111188774;
                    int i17 = i13;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    i12 = i17;
                    break;
                case -1401520959:
                case -1174354335:
                    i10 = 45423;
                    iM45029 = ThreadFactoryC3888.m11306("ᩳۛ") ^ i4;
                    i = ((iM45029 ^ i3) * (-12295)) ^ 110361399;
                    i2 = -2111188774;
                    int i18 = i13;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    i12 = i18;
                    break;
                case -1026179913:
                case -51901709:
                    i13 = i13;
                    sArr2 = f53609;
                    if (ViewGroupOnHierarchyChangeListenerC1916.m6233() != 0) {
                        iM45029 = C19806.m45029("᩹۟") ^ i4;
                        i = ((iM45029 ^ i3) * 12027) ^ 646486071;
                        i2 = 58833539;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۛܰ") + i4) * (-109);
                        i = ((iM45029 ^ i3) * 6077) ^ 2077995780;
                        i2 = 855235809;
                    }
                    int i19 = i13;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    i12 = i19;
                    break;
                case -940316960:
                case 952689609:
                    i13 = i13;
                    i9 = 1;
                    if (C7105.m18985()) {
                        iM45029 = C19806.m45029("᩹۟") ^ i4;
                        i = ((iM45029 ^ i3) * 12027) ^ 646486071;
                        i2 = 58833539;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۠᩻") + i4) * (-15);
                        i = ((iM45029 ^ i3) * 18981) ^ 791236810;
                        i2 = -1935689265;
                    }
                    int i110 = i13;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    i12 = i110;
                    break;
                case -880535459:
                case 283988417:
                    i13 = i13;
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 > 0) {
                        iM45029 = C19806.m45029("ۘ᩵") ^ i3;
                        i = ((iM45029 ^ i4) * 3857) ^ (-778636594);
                        i2 = -182223312;
                    } else {
                        iM45029 = C19806.m45029("ۜۙ") ^ i3;
                        i = ((iM45029 ^ i4) * (-15185)) ^ 1827936292;
                        i2 = -224674099;
                    }
                    int i111 = i13;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    i12 = i111;
                    break;
                case -865554209:
                case 1729319955:
                    i13 = i13;
                    sArr = f53609;
                    c = 733;
                    if (C0817.f3443) {
                        iM45029 = (i4 - C19806.m45029("ۤۢ")) * (-91);
                        i = ((iM45029 ^ i3) * (-2945)) ^ 1326622242;
                        i2 = 2042501198;
                    } else {
                        iM45029 = (i4 - C19806.m45029("ۗۙ")) * 35;
                        i = ((iM45029 ^ i3) * 1561) ^ (-664907424);
                        i2 = -979475292;
                    }
                    int i112 = i13;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    i12 = i112;
                    break;
                case -735986033:
                case 1840642370:
                    if (C0962.f3784) {
                        iM45029 = (C19806.m45029("ۜᩴ") ^ i3) * 35;
                        i13 = i13;
                        i = ((iM45029 ^ i4) * (-2617)) ^ (-1624522813);
                        i2 = 585070606;
                    } else {
                        i13 = i13;
                        iM45029 = C19806.m45029("ۜۙ") ^ i3;
                        i = ((iM45029 ^ i4) * (-15185)) ^ 1827936292;
                        i2 = -224674099;
                    }
                    int i113 = i13;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    i12 = i113;
                    break;
                case -702467007:
                case 1848718160:
                    i13 = i13;
                    s = sArr[c];
                    if (C0629.f2722 <= 0) {
                        iM45029 = C19806.m45029("ۜۙ") ^ i3;
                        i = ((iM45029 ^ i4) * (-15185)) ^ 1827936292;
                        i2 = -224674099;
                    } else {
                        iM45029 = C19806.m45029("ۚۨ") ^ i3;
                        i = ((iM45029 ^ i4) * 24149) ^ (-1689807031);
                        i2 = -1131942199;
                    }
                    int i114 = i13;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    i12 = i114;
                    break;
                case 138383665:
                case 1750476771:
                    i13 = i13;
                    C2871.m8646();
                    C2788.m8472();
                    iM45029 = C19806.m45029("ۘ᩵") ^ i3;
                    i = ((iM45029 ^ i4) * 3857) ^ (-778636594);
                    i2 = -182223312;
                    int i115 = i13;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    i12 = i115;
                    break;
                case 146917711:
                case 1343775215:
                    i13 = i13;
                    if (C2477.f9839 > 0) {
                        iM45029 = C19806.m45029("ۜۙ") ^ i3;
                        i = ((iM45029 ^ i4) * (-15185)) ^ 1827936292;
                        i2 = -224674099;
                    } else {
                        iM45029 = C19806.m45029("᩹۟") ^ i4;
                        i = ((iM45029 ^ i3) * 12027) ^ 646486071;
                        i2 = 58833539;
                    }
                    int i116 = i13;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    i12 = i116;
                    break;
                case 162886592:
                case 2054391974:
                    C7105.m18988(value, strM6105);
                    return (C5079) value;
                case 393671322:
                case 1877922558:
                    C1460.m5050();
                    return null;
                case 662727622:
                case 1358627744:
                    i13 = i13;
                    if (i7 - (i8 + i9) >= 0) {
                        iM45029 = C19806.m45029("ᩴۙ") ^ i4;
                        i = ((iM45029 ^ i3) * (-1815)) ^ 547882338;
                        i2 = -1088776480;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۡ᩵") ^ i3) * 89;
                        i = ((iM45029 ^ i4) * (-19563)) ^ 840902282;
                        i2 = 1232625877;
                    }
                    int i117 = i13;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    i12 = i117;
                    break;
                case 961326274:
                case 1903382106:
                    i13 = i13;
                    int i20 = s + s2;
                    i7 = i20 * i20;
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM45029 = (i4 - C19806.m45029("ۗۙ")) * 35;
                        i = ((iM45029 ^ i3) * 1561) ^ (-664907424);
                        i2 = -979475292;
                    } else {
                        iM45029 = (C19806.m45029("ۗۗ") + i4) * 59;
                        i = ((iM45029 ^ i3) * (-20315)) ^ 380646747;
                        i2 = -280407306;
                    }
                    int i118 = i13;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    i12 = i118;
                    break;
                case 2006543934:
                case 2096927392:
                    i13 = i13;
                    strM6105 = C1875.m6105(sArr2, i11, 13, i10);
                    if (C1461.f5957 <= 0) {
                        iM45029 = (i4 - C19806.m45029("ۗۙ")) * 35;
                        i = ((iM45029 ^ i3) * 1561) ^ (-664907424);
                        i2 = -979475292;
                    } else {
                        iM45029 = C19806.m45029("ᩴ᩷") ^ i4;
                        i = ((iM45029 ^ i3) * 18117) ^ 1484597250;
                        i2 = 1763645153;
                    }
                    int i119 = i13;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    i12 = i119;
                    break;
                default:
                    i13 = i13;
                    s2 = 1;
                    if (C1398.f5802 <= 0) {
                        iM45029 = C19806.m45029("ۜۙ") ^ i3;
                        i = ((iM45029 ^ i4) * (-15185)) ^ 1827936292;
                        i2 = -224674099;
                    } else {
                        iM45029 = (C19806.m45029("֫ܳ") + i3) * (-29);
                        i = ((iM45029 ^ i4) * (-22289)) ^ 198516099;
                        i2 = 1340500115;
                    }
                    int i1110 = i13;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    i12 = i1110;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39265(int i, View view) {
        int i2 = -1731886739;
        int i3 = C3722.f13525;
        int i4 = C1668.f6641;
        int iM45029 = C19806.m45029("ۡ۬") ^ i4;
        int i5 = ((iM45029 ^ i3) * 17491) ^ (-1451417927);
        int i6 = -1482600223;
        while (true) {
            i2 = ((((i2 ^ i3) * 10123) >> 31) & i5) ^ (iM45029 ^ i6);
            switch (i2) {
                case -2049510988:
                case -328151610:
                    if (C2704.f10408) {
                        iM45029 = C19806.m45029("᩶ۨ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 25135) ^ 451327628;
                        i6 = 724566937;
                    } else {
                        iM45029 = (C19806.m45029("۫᩸") + i4) * (-17);
                        i5 = ((iM45029 ^ i3) * 6351) ^ 185187585;
                        i6 = -722146294;
                    }
                    break;
                case -2043750869:
                case -729760713:
                    if (C1025.m3861() <= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۚۙ")) * 21;
                        i5 = ((iM45029 ^ i4) * (-27519)) ^ 811786651;
                        i6 = 1207231330;
                    } else {
                        iM45029 = (C19806.m45029("۠ܽ") + i3) * (-109);
                        i5 = ((iM45029 ^ i4) * (-28429)) ^ 1313930508;
                        i6 = -460019373;
                    }
                    break;
                case -1879780812:
                case -674615707:
                    if (C1419.f5860 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳۗ") ^ i3) * (-97);
                        i5 = ((iM45029 ^ i4) * (-31595)) ^ 284874806;
                        i6 = 1924709260;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܽ۫") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-16471)) ^ (-209276160);
                        i6 = -797501035;
                    }
                    break;
                case -1799917909:
                case 930465369:
                    if (C1977.m6356()) {
                        iM45029 = C19806.m45029("᩷ܰ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 20107) ^ (-2116823754);
                        i6 = 1595671164;
                    } else {
                        iM45029 = C19806.m45029("᩹ۚ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-27117)) ^ (-1591022448);
                        i6 = 290914613;
                    }
                    break;
                case -1539890274:
                case 974775324:
                    if (view.isShown()) {
                        iM45029 = C19806.m45029("ۚܶ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 18413) ^ (-1428844643);
                        i6 = -764090155;
                    } else {
                        iM45029 = (C19806.m45029("֫ܽ") + i4) * (-105);
                        i5 = ((iM45029 ^ i3) * 249) ^ 830697984;
                        i6 = -2054514807;
                    }
                    break;
                case -1203060370:
                case -282389607:
                    C19806.m45024();
                    C0629.m2907();
                    break;
                case -1136012236:
                case 368091489:
                    if (C0526.f2219) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۚۙ")) * 21;
                        i5 = ((iM45029 ^ i4) * (-27519)) ^ 811786651;
                        i6 = 1207231330;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ۡ᩹")) * (-15);
                        i5 = ((iM45029 ^ i4) * 2397) ^ 971504728;
                        i6 = 1113330742;
                    }
                    break;
                case -1063187051:
                case 1388612869:
                    m39289(i + 1, view);
                    iM45029 = (C19806.m45029("֫ܽ") + i4) * (-105);
                    i5 = ((iM45029 ^ i3) * 249) ^ 830697984;
                    i6 = -2054514807;
                    break;
                case -989366009:
                case 1192038980:
                    if (C3286.f12186) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳۗ") ^ i3) * (-97);
                        i5 = ((iM45029 ^ i4) * (-31595)) ^ 284874806;
                        i6 = 1924709260;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۧ᩻") ^ i4) * 51;
                        i5 = ((iM45029 ^ i3) * (-30319)) ^ 449846779;
                        i6 = 1366458918;
                    }
                    break;
                case -942075351:
                case 163386604:
                    if (C0629.m2907()) {
                        iM45029 = (C19806.m45029("۟᩷") ^ i4) * 101;
                        i5 = ((iM45029 ^ i3) * 21875) ^ (-802510253);
                        i6 = -689576013;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳۗ") ^ i3) * (-97);
                        i5 = ((iM45029 ^ i4) * (-31595)) ^ 284874806;
                        i6 = 1924709260;
                    }
                    break;
                case -344406915:
                case 2053180991:
                    ViewTreeObserverOnPreDrawListenerC3327.m9874();
                    if (!C1977.m6356()) {
                        iM45029 = (C19806.m45029("۫᩸") + i4) * (-17);
                        i5 = ((iM45029 ^ i3) * 6351) ^ 185187585;
                        i6 = -722146294;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳۗ") ^ i3) * (-97);
                        i5 = ((iM45029 ^ i4) * (-31595)) ^ 284874806;
                        i6 = 1924709260;
                    }
                    break;
                case 103524270:
                case 1158602710:
                    if (view.isFocused()) {
                        iM45029 = (C19806.m45029("֫᩻") ^ i3) * 101;
                        i5 = ((iM45029 ^ i4) * (-6919)) ^ (-695233291);
                        i6 = -1713463209;
                    } else {
                        iM45029 = (C19806.m45029("֫ܽ") + i4) * (-105);
                        i5 = ((iM45029 ^ i3) * 249) ^ 830697984;
                        i6 = -2054514807;
                    }
                    break;
                case 162655574:
                case 2096728893:
                    if (view.isAttachedToWindow()) {
                        iM45029 = (C19806.m45029("᩸֡") ^ i3) * 81;
                        i5 = ((iM45029 ^ i4) * 287) ^ (-2094767738);
                        i6 = 2024163965;
                    } else {
                        iM45029 = (C19806.m45029("֫ܽ") + i4) * (-105);
                        i5 = ((iM45029 ^ i3) * 249) ^ 830697984;
                        i6 = -2054514807;
                    }
                    break;
                case 365325712:
                case 1507640344:
                    if (C1668.f6641 >= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۚۙ")) * 21;
                        i5 = ((iM45029 ^ i4) * (-27519)) ^ 811786651;
                        i6 = 1207231330;
                    } else {
                        iM45029 = (C19806.m45029("᩻ᩳ") ^ i3) * (-117);
                        i5 = ((iM45029 ^ i4) * (-28153)) ^ (-1245345075);
                        i6 = 1225818685;
                    }
                    break;
                case 602862391:
                case 2082554103:
                    if (C0671.m3008() >= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۚۙ")) * 21;
                        i5 = ((iM45029 ^ i4) * (-27519)) ^ 811786651;
                        i6 = 1207231330;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֨᩶") + i3) * 15;
                        i5 = ((iM45029 ^ i4) * 6023) ^ 1762153498;
                        i6 = 1317573605;
                    }
                    break;
                case 607299006:
                case 859017805:
                    RunnableC1895.m6170();
                    if (AbstractC0464.m2313() != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۫᩶") ^ i4;
                        i5 = ((iM45029 ^ i3) * 11735) ^ (-742458607);
                        i6 = 1517240039;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳۗ") ^ i3) * (-97);
                        i5 = ((iM45029 ^ i4) * (-31595)) ^ 284874806;
                        i6 = 1924709260;
                    }
                    break;
                case 817181286:
                case 1421638613:
                    if (C1419.f5860 < 0) {
                        iM45029 = C19806.m45029("᩷ܰ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 20107) ^ (-2116823754);
                        i6 = 1595671164;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۫᩶") ^ i4;
                        i5 = ((iM45029 ^ i3) * 11735) ^ (-742458607);
                        i6 = 1517240039;
                    }
                    break;
                case 819683413:
                case 1356979782:
                    if (RunnableC1895.m6170() != 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳۗ") ^ i3) * (-97);
                        i5 = ((iM45029 ^ i4) * (-31595)) ^ 284874806;
                        i6 = 1924709260;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۤۜ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-27607)) ^ 32729600;
                        i6 = -492308085;
                    }
                    break;
                case 857162875:
                case 1539538446:
                    break;
                default:
                    ThreadFactoryC3888.m11300();
                    iM45029 = (ThreadFactoryC3888.m11306("ܳۗ") ^ i3) * (-97);
                    i5 = ((iM45029 ^ i4) * (-31595)) ^ 284874806;
                    i6 = 1924709260;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0083  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d8 A[PHI: r14
      0x00d8: PHI (r14v4 int) = (r14v3 int), (r14v2 int), (r14v2 int) binds: [B:29:0x00d6, B:19:0x009b, B:16:0x0080] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x01d0 A[PHI: r2 r7 r8 r11
      0x01d0: PHI (r2v3 java.lang.String) = (r2v2 java.lang.String), (r2v2 java.lang.String), (r2v4 java.lang.String) binds: [B:53:0x01ce, B:45:0x0190, B:25:0x00b8] A[DONT_GENERATE, DONT_INLINE]
      0x01d0: PHI (r7v4 int) = (r7v3 int), (r7v2 int), (r7v2 int) binds: [B:53:0x01ce, B:45:0x0190, B:25:0x00b8] A[DONT_GENERATE, DONT_INLINE]
      0x01d0: PHI (r8v4 int) = (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:53:0x01ce, B:45:0x0190, B:25:0x00b8] A[DONT_GENERATE, DONT_INLINE]
      0x01d0: PHI (r11v4 int) = (r11v2 int), (r11v3 int), (r11v2 int) binds: [B:53:0x01ce, B:45:0x0190, B:25:0x00b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0244 A[PHI: r1 r4 r5 r6 r9 r10 r13 r19
      0x0244: PHI (r1v4 java.lang.Object) = 
      (r1v2 java.lang.Object)
      (r1v2 java.lang.Object)
      (r1v2 java.lang.Object)
      (r1v2 java.lang.Object)
      (r1v2 java.lang.Object)
      (r1v2 java.lang.Object)
      (r1v6 java.lang.Object)
     binds: [B:65:0x0242, B:61:0x0224, B:57:0x0204, B:49:0x01ad, B:33:0x0109, B:9:0x005a, B:6:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x0244: PHI (r4v4 char) = (r4v3 char), (r4v2 char), (r4v2 char), (r4v2 char), (r4v2 char), (r4v2 char), (r4v2 char) binds: [B:65:0x0242, B:61:0x0224, B:57:0x0204, B:49:0x01ad, B:33:0x0109, B:9:0x005a, B:6:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x0244: PHI (r5v4 short) = (r5v2 short), (r5v3 short), (r5v2 short), (r5v2 short), (r5v2 short), (r5v2 short), (r5v2 short) binds: [B:65:0x0242, B:61:0x0224, B:57:0x0204, B:49:0x01ad, B:33:0x0109, B:9:0x005a, B:6:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x0244: PHI (r6v4 short) = (r6v2 short), (r6v2 short), (r6v3 short), (r6v2 short), (r6v2 short), (r6v2 short), (r6v2 short) binds: [B:65:0x0242, B:61:0x0224, B:57:0x0204, B:49:0x01ad, B:33:0x0109, B:9:0x005a, B:6:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x0244: PHI (r9v4 int) = (r9v2 int), (r9v2 int), (r9v2 int), (r9v3 int), (r9v2 int), (r9v2 int), (r9v2 int) binds: [B:65:0x0242, B:61:0x0224, B:57:0x0204, B:49:0x01ad, B:33:0x0109, B:9:0x005a, B:6:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x0244: PHI (r10v4 short) = (r10v2 short), (r10v2 short), (r10v2 short), (r10v3 short), (r10v2 short), (r10v2 short), (r10v2 short) binds: [B:65:0x0242, B:61:0x0224, B:57:0x0204, B:49:0x01ad, B:33:0x0109, B:9:0x005a, B:6:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x0244: PHI (r13v4 short[]) = (r13v2 short[]), (r13v2 short[]), (r13v2 short[]), (r13v2 short[]), (r13v3 short[]), (r13v2 short[]), (r13v2 short[]) binds: [B:65:0x0242, B:61:0x0224, B:57:0x0204, B:49:0x01ad, B:33:0x0109, B:9:0x005a, B:6:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x0244: PHI (r19v5 short[]) = (r19v4 short[]), (r19v3 short[]), (r19v3 short[]), (r19v3 short[]), (r19v3 short[]), (r19v3 short[]), (r19v3 short[]) binds: [B:65:0x0242, B:61:0x0224, B:57:0x0204, B:49:0x01ad, B:33:0x0109, B:9:0x005a, B:6:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final Typeface m39295() {
        int iM11306;
        int i;
        int i2;
        int i3 = C2124.f7782;
        int i4 = ThreadFactoryC3888.f14547;
        int iM45029 = (C19806.m45029("֡ۚ") ^ i3) * 33;
        int i5 = ((iM45029 ^ i4) * 30103) ^ (-2126516080);
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM45029 ^ 1535699494;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        short s3 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = -1326225403;
        String strM10790 = null;
        Object value = null;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i4) * (-23255)) >> 31));
            switch (i13) {
                case -2127886822:
                case -2108006903:
                    RunnableC1895.m6170();
                    if (C0671.f2816 == 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۗ᩹") + i4) * (-95);
                        i = ((iM11306 ^ i3) * (-3309)) ^ (-1495669138);
                        i2 = -1472554367;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֫ۜ") ^ i3) * 31;
                        i = ((iM11306 ^ i4) * (-18777)) ^ (-14308076);
                        i2 = 2055523386;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1801355316:
                case 183680270:
                    s2 = 2;
                    if (C1668.m5583()) {
                        iM11306 = (C19806.m45029("ۤۤ") ^ i4) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM11306 ^ i3) * (-6493)) ^ (-473499648);
                        i2 = 1631299116;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۨ۠") ^ i4;
                        i = ((iM11306 ^ i3) * (-23577)) ^ 1089178610;
                        i2 = -683126554;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1801214594:
                case -904836471:
                    i12 = 641;
                    if (C2249.f8050 >= 0) {
                        iM11306 = (i3 - C19806.m45029("᩷֫")) * 55;
                        i = ((iM11306 ^ i4) * EnumC23529.f76192) ^ (-361231239);
                        i2 = 1636663832;
                    } else {
                        iM11306 = C19806.m45029("᩶ۖ") ^ i3;
                        i = ((iM11306 ^ i4) * (-29961)) ^ (-41391687);
                        i2 = -1526200197;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1597216464:
                case 1686938261:
                    i7 = s * s2;
                    i8 = 1;
                    if (C3286.m9798() <= 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۨ᩺")) * (-83);
                        i = ((iM11306 ^ i4) * (-29025)) ^ 733200856;
                        i2 = -473433857;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۢᩳ")) * 115;
                        i = ((iM11306 ^ i4) * 27807) ^ (-2131386472);
                        i2 = -344987683;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1340216767:
                case -260477344:
                    s = sArr[c];
                    if (C1977.m6356()) {
                        iM11306 = ThreadFactoryC3888.m11306("ۨ۠") ^ i4;
                        i = ((iM11306 ^ i3) * (-23577)) ^ 1089178610;
                        i2 = -683126554;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩻᩶") ^ i4;
                        i = ((iM11306 ^ i3) * (-3831)) ^ (-424627402);
                        i2 = -1027491181;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1206521762:
                case 814315444:
                    sArr = f53609;
                    c = 640;
                    if (C1148.f5161 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۨ۠") ^ i4;
                        i = ((iM11306 ^ i3) * (-23577)) ^ 1089178610;
                        i2 = -683126554;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܺ᩷") ^ i3;
                        i = ((iM11306 ^ i4) * (-20413)) ^ 1463835639;
                        i2 = -947481033;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1118873128:
                case 524304039:
                    i11 = 7648;
                    iM11306 = ThreadFactoryC3888.m11306("ۗܰ") ^ i4;
                    i = ((iM11306 ^ i3) * 6511) ^ 57367208;
                    i2 = 996548716;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1096056888:
                case 137705626:
                    C1937.m6286(value, strM10790);
                    return (Typeface) value;
                case -801779703:
                case 1046707099:
                    C1066.m4023();
                    C2249.m6915();
                    return null;
                case -762268336:
                case -756397904:
                    strM10790 = C3660.m10790(sArr2, i12, 13, i11);
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM11306 = C19806.m45029("ۤۜ") ^ i4;
                        i = ((iM11306 ^ i3) * (-20037)) ^ (-1091188033);
                        i2 = 1582722790;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۨ᩺")) * (-83);
                        i = ((iM11306 ^ i4) * (-29025)) ^ 733200856;
                        i2 = -473433857;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -729437085:
                case -406446431:
                    sArr2 = f53609;
                    if (C0797.f3386) {
                        iM11306 = ThreadFactoryC3888.m11306("ۨ۠") ^ i4;
                        i = ((iM11306 ^ i3) * (-23577)) ^ 1089178610;
                        i2 = -683126554;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۘۗ") ^ i4;
                        i = ((iM11306 ^ i3) * 26017) ^ (-721865977);
                        i2 = -1027541627;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -618237638:
                case 1300353597:
                    if (C3743.f13569) {
                        iM11306 = ThreadFactoryC3888.m11306("ۨ۠") ^ i4;
                        i = ((iM11306 ^ i3) * (-23577)) ^ 1089178610;
                        i2 = -683126554;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۗ᩹") + i4) * (-95);
                        i = ((iM11306 ^ i3) * (-3309)) ^ (-1495669138);
                        i2 = -1472554367;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -164359754:
                case 254053689:
                    i11 = 10218;
                    iM11306 = ThreadFactoryC3888.m11306("ۗܰ") ^ i4;
                    i = ((iM11306 ^ i3) * 6511) ^ 57367208;
                    i2 = 996548716;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 21900956:
                case 791670310:
                    if (C1398.m4895() <= 0) {
                        iM11306 = (i3 - C19806.m45029("᩷֫")) * 55;
                        i = ((iM11306 ^ i4) * EnumC23529.f76192) ^ (-361231239);
                        i2 = 1636663832;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۗ᩹") + i4) * (-95);
                        i = ((iM11306 ^ i3) * (-3309)) ^ (-1495669138);
                        i2 = -1472554367;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 164162166:
                case 1317336221:
                    if (i9 - (i10 * i10) <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩻֫") ^ i4;
                        i = ((iM11306 ^ i3) * (-4599)) ^ 2129469720;
                        i2 = -1605066462;
                    } else {
                        iM11306 = (C19806.m45029("ۢۛ") ^ i3) * (-53);
                        i = ((iM11306 ^ i4) * 16229) ^ 2017648021;
                        i2 = 597060865;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 428518278:
                case 683044165:
                    i10 = s + s3;
                    if (RunnableC1895.m6170() != 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۨ᩺")) * (-83);
                        i = ((iM11306 ^ i4) * (-29025)) ^ 733200856;
                        i2 = -473433857;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩺ܿ") ^ i3;
                        i = ((iM11306 ^ i4) * 29341) ^ (-180554551);
                        i2 = 958156435;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 1020945950:
                case 1485692103:
                    C19806.m45024();
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    iM11306 = (i3 - C19806.m45029("᩷֫")) * 55;
                    i = ((iM11306 ^ i4) * EnumC23529.f76192) ^ (-361231239);
                    i2 = 1636663832;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 1316490365:
                case 1360960467:
                    i9 = i7 + i8;
                    s3 = 1;
                    if (C1419.f5860 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۨ۠") ^ i4;
                        i = ((iM11306 ^ i3) * (-23577)) ^ 1089178610;
                        i2 = -683126554;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩵۬") ^ i4;
                        i = ((iM11306 ^ i3) * 10129) ^ (-1248716197);
                        i2 = 1340742293;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                default:
                    value = f53613.getValue();
                    if (C3743.f13569) {
                        iM11306 = ThreadFactoryC3888.m11306("۠ۘ") ^ i3;
                        i = ((iM11306 ^ i4) * (-32417)) ^ 460794219;
                        i2 = -1558253168;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۨ۠") ^ i4;
                        i = ((iM11306 ^ i3) * (-23577)) ^ 1089178610;
                        i2 = -683126554;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final Handler m39278() {
        return f53610;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final void m39290(final View view) {
        Runnable runnable = null;
        int i = 1464059679;
        int i2 = C1875.f7103;
        int i3 = C2249.f8050;
        int iM45029 = C19806.m45029("᩶ۚ") ^ i2;
        int i4 = ((iM45029 ^ i3) * 18943) ^ 1779507144;
        int i5 = 655613161;
        while (true) {
            i = ((((i ^ i3) * 3599) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -1861177698:
                case -1419394194:
                    C2477.m7593();
                    iM45029 = (ThreadFactoryC3888.m11306("֫֡") ^ i3) * 47;
                    i4 = ((iM45029 ^ i2) * (-10549)) ^ (-359828192);
                    i5 = 753929456;
                    break;
                case -1716894217:
                case 1611928020:
                    C1025.m3861();
                    if (C0278.m1789() <= 0) {
                        iM45029 = (C19806.m45029("᩺ۧ") + i2) * (-81);
                        i4 = ((iM45029 ^ i3) * 18739) ^ (-166476901);
                        i5 = 1058482152;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֫֡") ^ i3) * 47;
                        i4 = ((iM45029 ^ i2) * (-10549)) ^ (-359828192);
                        i5 = 753929456;
                    }
                    break;
                case -1713543671:
                case 655938629:
                    if (C0817.f3443) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۨ᩵")) * 27;
                        i4 = ((iM45029 ^ i2) * (-7197)) ^ 95403934;
                        i5 = -1585050420;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩹۟") ^ i3;
                        i4 = ((iM45029 ^ i2) * 28075) ^ (-1776430659);
                        i5 = 1771030398;
                    }
                    break;
                case -1610643386:
                case -1443910249:
                    CallableC1627.m5507();
                    if (RunnableC0195.f1321 < 0) {
                        iM45029 = C19806.m45029("ۚۙ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-10287)) ^ (-16949687);
                        i5 = -1600421661;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֫֡") ^ i3) * 47;
                        i4 = ((iM45029 ^ i2) * (-10549)) ^ (-359828192);
                        i5 = 753929456;
                    }
                    break;
                case -1472203179:
                case -1302907931:
                    if (C3535.f13026 <= 0) {
                        iM45029 = (C19806.m45029("᩺ۧ") + i2) * (-81);
                        i4 = ((iM45029 ^ i3) * 18739) ^ (-166476901);
                        i5 = 1058482152;
                    } else {
                        iM45029 = C19806.m45029("֫ᩴ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 15617) ^ 1986890287;
                        i5 = -1827901970;
                    }
                    break;
                case -1458287916:
                case -423203987:
                    if (C2871.f10837 >= 0) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ܺܺ")) * 35;
                        i4 = ((iM45029 ^ i3) * (-19667)) ^ (-109927733);
                        i5 = 1199702835;
                    } else {
                        iM45029 = (i3 - C19806.m45029("᩻ܰ")) * 127;
                        i4 = ((iM45029 ^ i2) * 16327) ^ 1027978387;
                        i5 = -1948682451;
                    }
                    break;
                case -1396660011:
                case 1501336409:
                    break;
                case -1366959815:
                case 1034220961:
                    if (C1419.f5860 >= 0) {
                        iM45029 = C19806.m45029("ۚۙ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-10287)) ^ (-16949687);
                        i5 = -1600421661;
                    } else {
                        iM45029 = (i2 - C19806.m45029("ᩳۜ")) * 63;
                        i4 = ((iM45029 ^ i3) * (-9565)) ^ (-329753572);
                        i5 = 304962237;
                    }
                    break;
                case -1197529742:
                case 987575563:
                    runnable = new Runnable() { // from class: l.֡ܺۘ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C16737.m39289(0, view);
                        }
                    };
                    if (C19806.f63586) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ܺܺ")) * 35;
                        i4 = ((iM45029 ^ i3) * (-19667)) ^ (-109927733);
                        i5 = 1199702835;
                    } else {
                        iM45029 = (C19806.m45029("ۗۖ") ^ i3) * (-19);
                        i4 = ((iM45029 ^ i2) * (-7407)) ^ 1920295861;
                        i5 = -2059905967;
                    }
                    break;
                case -1111267721:
                case 1626868403:
                    if (C2124.f7782 <= 0) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ܺܺ")) * 35;
                        i4 = ((iM45029 ^ i3) * (-19667)) ^ (-109927733);
                        i5 = 1199702835;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֫֡") ^ i3) * 47;
                        i4 = ((iM45029 ^ i2) * (-10549)) ^ (-359828192);
                        i5 = 753929456;
                    }
                    break;
                case -1044436531:
                case -330740137:
                    if (C1025.f4800 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("֫֡") ^ i3) * 47;
                        i4 = ((iM45029 ^ i2) * (-10549)) ^ (-359828192);
                        i5 = 753929456;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۘۤ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 13019) ^ (-1888060042);
                        i5 = -411345370;
                    }
                    break;
                case -941889102:
                case -870189984:
                    if (view != null) {
                        iM45029 = (C19806.m45029("֡ܿ") ^ i3) * (-37);
                        i4 = ((iM45029 ^ i2) * 26189) ^ 1720531159;
                        i5 = 189978816;
                    } else {
                        iM45029 = C19806.m45029("ۧۙ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 965) ^ (-1143871012);
                        i5 = -1303552986;
                    }
                    break;
                case -610092626:
                case 2017309802:
                    if (C0216.f1393 != 0) {
                        iM45029 = C19806.m45029("ۚۙ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-10287)) ^ (-16949687);
                        i5 = -1600421661;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۡ֨") ^ i2;
                        i4 = ((iM45029 ^ i3) * 1145) ^ (-375645465);
                        i5 = 125339421;
                    }
                    break;
                case -337233126:
                case 932769429:
                    if (C3577.m10565()) {
                        iM45029 = (C19806.m45029("۠ᩴ") ^ i2) * 89;
                        i4 = ((iM45029 ^ i3) * (-3501)) ^ 919959380;
                        i5 = -1479805864;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩹۟") ^ i3;
                        i4 = ((iM45029 ^ i2) * 28075) ^ (-1776430659);
                        i5 = 1771030398;
                    }
                    break;
                case -228246879:
                case 202640516:
                    if (C1066.f4915 <= 0) {
                        iM45029 = (C19806.m45029("᩺ۧ") + i2) * (-81);
                        i4 = ((iM45029 ^ i3) * 18739) ^ (-166476901);
                        i5 = 1058482152;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("᩶ᩴ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM45029 ^ i3) * 19043) ^ (-1358301071);
                        i5 = -2118754781;
                    }
                    break;
                case 1076043591:
                case 1672174473:
                    view.postDelayed(runnable, 250L);
                    iM45029 = C19806.m45029("ۧۙ") ^ i2;
                    i4 = ((iM45029 ^ i3) * 965) ^ (-1143871012);
                    i5 = -1303552986;
                    break;
                case 1664200825:
                case 2124868231:
                    C3535.m10431();
                    break;
                default:
                    if (C3743.f13569) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳۛ") ^ i3) * (-5);
                        i4 = ((iM45029 ^ i2) * 20447) ^ 1937086720;
                        i5 = -1775067992;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩹۟") ^ i3;
                        i4 = ((iM45029 ^ i2) * 28075) ^ (-1776430659);
                        i5 = 1771030398;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00b4 A[PHI: r2
      0x00b4: PHI (r2v3 java.lang.String) = (r2v2 java.lang.String), (r2v5 java.lang.String) binds: [B:9:0x0055, B:6:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x01da A[PHI: r5 r13
      0x01da: PHI (r5v4 char) = (r5v3 char), (r5v2 char), (r5v2 char), (r5v2 char) binds: [B:57:0x01d8, B:30:0x00e5, B:16:0x007d, B:9:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x01da: PHI (r13v4 int) = (r13v2 int), (r13v3 int), (r13v2 int), (r13v2 int) binds: [B:57:0x01d8, B:30:0x00e5, B:16:0x007d, B:9:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x020a A[PHI: r3 r6 r7 r8
      0x020a: PHI (r3v3 android.app.Application) = 
      (r3v2 android.app.Application)
      (r3v2 android.app.Application)
      (r3v2 android.app.Application)
      (r3v4 android.app.Application)
     binds: [B:61:0x0208, B:53:0x01b9, B:49:0x019b, B:24:0x009b] A[DONT_GENERATE, DONT_INLINE]
      0x020a: PHI (r6v4 short) = (r6v2 short), (r6v3 short), (r6v2 short), (r6v2 short) binds: [B:61:0x0208, B:53:0x01b9, B:49:0x019b, B:24:0x009b] A[DONT_GENERATE, DONT_INLINE]
      0x020a: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int) binds: [B:61:0x0208, B:53:0x01b9, B:49:0x019b, B:24:0x009b] A[DONT_GENERATE, DONT_INLINE]
      0x020a: PHI (r8v4 int) = (r8v2 int), (r8v2 int), (r8v3 int), (r8v2 int) binds: [B:61:0x0208, B:53:0x01b9, B:49:0x019b, B:24:0x009b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x023d A[PHI: r9 r11 r12 r18
      0x023d: PHI (r9v4 short) = (r9v2 short), (r9v3 short), (r9v2 short), (r9v2 short), (r9v2 short), (r9v2 short) binds: [B:65:0x023b, B:45:0x0177, B:34:0x0108, B:18:0x0081, B:16:0x007d, B:12:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x023d: PHI (r11v4 short[]) = (r11v2 short[]), (r11v2 short[]), (r11v3 short[]), (r11v2 short[]), (r11v2 short[]), (r11v2 short[]) binds: [B:65:0x023b, B:45:0x0177, B:34:0x0108, B:18:0x0081, B:16:0x007d, B:12:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x023d: PHI (r12v4 int) = (r12v2 int), (r12v2 int), (r12v3 int), (r12v2 int), (r12v2 int), (r12v2 int) binds: [B:65:0x023b, B:45:0x0177, B:34:0x0108, B:18:0x0081, B:16:0x007d, B:12:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x023d: PHI (r18v5 short[]) = (r18v4 short[]), (r18v3 short[]), (r18v3 short[]), (r18v3 short[]), (r18v3 short[]), (r18v3 short[]) binds: [B:65:0x023b, B:45:0x0177, B:34:0x0108, B:18:0x0081, B:16:0x007d, B:12:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m39268(BroadcastReceiver broadcastReceiver) {
        int iM11306;
        int i;
        int i2;
        int i3 = MenuItemOnMenuItemClickListenerC3244.f12064;
        int i4 = C1461.f5957;
        int iM45029 = C19806.m45029("ۘ᩶") ^ i3;
        int i5 = ((iM45029 ^ i4) * (-19237)) ^ (-2096414687);
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM45029 ^ 1773128875;
        char c = 0;
        short s = 0;
        int i7 = 0;
        int i8 = 0;
        short s2 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 1481993648;
        Application applicationM4826 = null;
        String strM9869 = null;
        while (true) {
            i12 = i6 ^ (i5 & (((i12 ^ i4) * 12555) >> 31));
            switch (i12) {
                case -1911254077:
                case 959880687:
                    i11 = 8;
                    if (C2642.f10294 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩷᩻") ^ i4;
                        i = ((iM11306 ^ i3) * (-779)) ^ (-7743281);
                        i2 = -1128359145;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩵۠") ^ i3) * (-19);
                        i = ((iM11306 ^ i4) * 23689) ^ 907442125;
                        i2 = 178192910;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1854879016:
                case 484556627:
                    i9 = 1763;
                    iM11306 = (ThreadFactoryC3888.m11306("ᩴۛ") ^ i4) * 43;
                    i = ((iM11306 ^ i3) * 8073) ^ (-542936532);
                    i2 = -1783496586;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1761218217:
                case 260004350:
                    i9 = 12382;
                    iM11306 = (ThreadFactoryC3888.m11306("ᩴۛ") ^ i4) * 43;
                    i = ((iM11306 ^ i3) * 8073) ^ (-542936532);
                    i2 = -1783496586;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1157374592:
                case 1206784585:
                    C2704.m8238(broadcastReceiver, strM9869);
                    applicationM4826 = C1377.m4826();
                    if (C1460.f5948 >= 0) {
                        iM11306 = C19806.m45029("۬᩺") ^ i3;
                        i = ((iM11306 ^ i4) * (-21471)) ^ (-1120659122);
                        i2 = -851577701;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ᩴ᩹") ^ i3;
                        i = ((iM11306 ^ i4) * 15991) ^ 1593647973;
                        i2 = -376041111;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1098914000:
                case 1920965419:
                    s = sArr[c];
                    i7 = s * s;
                    if (C2788.f10625 >= 0) {
                        iM11306 = C19806.m45029("۬᩺") ^ i3;
                        i = ((iM11306 ^ i4) * (-21471)) ^ (-1120659122);
                        i2 = -851577701;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ܽܳ")) * (-103);
                        i = ((iM11306 ^ i4) * 8541) ^ 1098737696;
                        i2 = 497309398;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1037206218:
                case 1816072226:
                    if (ViewTreeObserverOnPreDrawListenerC3327.m9874()) {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("֡ᩳ")) * (-63);
                        i = ((iM11306 ^ i3) * 11447) ^ 1849880085;
                        i2 = 905058205;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩷᩻") ^ i4;
                        i = ((iM11306 ^ i3) * (-779)) ^ (-7743281);
                        i2 = -1128359145;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -948725843:
                case -928172158:
                    sArr = f53609;
                    if (ThreadFactoryC3888.m11300() <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("֡ܳ") ^ i4) * (-45);
                        i = ((iM11306 ^ i3) * (-13843)) ^ 1998890463;
                        i2 = 1292957248;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܳۖ") + i3) * (-61);
                        i = ((iM11306 ^ i4) * 16365) ^ 813601950;
                        i2 = -1501017914;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -775118807:
                case 125435717:
                    if (i8 - (s * s2) >= 0) {
                        iM11306 = C19806.m45029("᩸ܰ") ^ i4;
                        i = ((iM11306 ^ i3) * (-23653)) ^ 1007207821;
                        i2 = 1461280741;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۟ۗ") ^ i3) * 83;
                        i = ((iM11306 ^ i4) * (-14801)) ^ 272793801;
                        i2 = 789140142;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -578992891:
                case 1284585498:
                    sArr2 = f53609;
                    i10 = 184;
                    if (C0526.m2437() >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("֡ܳ") ^ i4) * (-45);
                        i = ((iM11306 ^ i3) * (-13843)) ^ 1998890463;
                        i2 = 1292957248;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩹ᩳ") ^ i3;
                        i = ((iM11306 ^ i4) * 2451) ^ 191145254;
                        i2 = 789956974;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -455546800:
                case 2880303:
                    C1189.m4368();
                    iM11306 = (ThreadFactoryC3888.m11306("֡ܳ") ^ i4) * (-45);
                    i = ((iM11306 ^ i3) * (-13843)) ^ 1998890463;
                    i2 = 1292957248;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -206903442:
                case 54337191:
                    c = 183;
                    if (C3577.f13150 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩷᩻") ^ i4;
                        i = ((iM11306 ^ i3) * (-779)) ^ (-7743281);
                        i2 = -1128359145;
                    } else {
                        iM11306 = (i4 - C19806.m45029("᩶ۘ")) * q.h;
                        i = ((iM11306 ^ i3) * (-23763)) ^ 45705241;
                        i2 = 1436853206;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 79842408:
                case 142531839:
                    if (C19806.f63586) {
                        iM11306 = C19806.m45029("۬᩺") ^ i3;
                        i = ((iM11306 ^ i4) * (-21471)) ^ (-1120659122);
                        i2 = -851577701;
                    } else {
                        iM11306 = (i4 - C19806.m45029("᩸ܽ")) * 101;
                        i = ((iM11306 ^ i3) * (-13965)) ^ (-319153382);
                        i2 = -577265103;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 179658732:
                case 1799594355:
                    C3286.m9798();
                    if (C10634.f36300 < 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("֡ܳ") ^ i4) * (-45);
                        i = ((iM11306 ^ i3) * (-13843)) ^ 1998890463;
                        i2 = 1292957248;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۚۧ") + i3) * (-117);
                        i = ((iM11306 ^ i4) * (-10757)) ^ 434622668;
                        i2 = 1151490444;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 467407421:
                case 622995055:
                    i8 = i7 + 19562929;
                    if (MenuItemOnMenuItemClickListenerC3244.m9701() >= 0) {
                        iM11306 = C19806.m45029("۬᩺") ^ i3;
                        i = ((iM11306 ^ i4) * (-21471)) ^ (-1120659122);
                        i2 = -851577701;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۧܳ") ^ i4;
                        i = ((iM11306 ^ i3) * (-16083)) ^ 1705840894;
                        i2 = 252322505;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 686334553:
                case 1217874523:
                    C21843.m48614(applicationM4826).m48616(broadcastReceiver);
                    break;
                case 755335328:
                case 961561433:
                    if (MenuItemOnMenuItemClickListenerC3244.m9701() >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("֡ܳ") ^ i4) * (-45);
                        i = ((iM11306 ^ i3) * (-13843)) ^ 1998890463;
                        i2 = 1292957248;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩷᩻") ^ i4;
                        i = ((iM11306 ^ i3) * (-779)) ^ (-7743281);
                        i2 = -1128359145;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 993518403:
                case 1980349496:
                    C0526.m2437();
                    break;
                case 1466942022:
                case 1932492896:
                    s2 = 8846;
                    if (C2477.f9839 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("֡ܳ") ^ i4) * (-45);
                        i = ((iM11306 ^ i3) * (-13843)) ^ 1998890463;
                        i2 = 1292957248;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶ܳ") + i3) * (-55);
                        i = ((iM11306 ^ i4) * 11817) ^ (-1349846429);
                        i2 = 1621258897;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                default:
                    strM9869 = ViewTreeObserverOnPreDrawListenerC3327.m9869(sArr2, i10, i11, i9);
                    if (C2871.f10837 >= 0) {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("֡ᩳ")) * (-63);
                        i = ((iM11306 ^ i3) * 11447) ^ 1849880085;
                        i2 = 905058205;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩶᩶") ^ i4;
                        i = ((iM11306 ^ i3) * (-14661)) ^ (-1847141611);
                        i2 = -479875357;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0210 A[PHI: r2 r9 r13 r14 r15 r21 r22
      0x0210: PHI (r2v3 java.lang.String) = (r2v2 java.lang.String), (r2v2 java.lang.String), (r2v2 java.lang.String), (r2v7 java.lang.String) binds: [B:55:0x020e, B:39:0x0147, B:11:0x006e, B:6:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x0210: PHI (r9v4 short) = (r9v3 short), (r9v2 short), (r9v2 short), (r9v2 short) binds: [B:55:0x020e, B:39:0x0147, B:11:0x006e, B:6:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x0210: PHI (r13v4 short[]) = (r13v2 short[]), (r13v3 short[]), (r13v2 short[]), (r13v2 short[]) binds: [B:55:0x020e, B:39:0x0147, B:11:0x006e, B:6:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x0210: PHI (r14v4 int) = (r14v2 int), (r14v3 int), (r14v2 int), (r14v2 int) binds: [B:55:0x020e, B:39:0x0147, B:11:0x006e, B:6:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x0210: PHI (r15v4 int) = (r15v2 int), (r15v3 int), (r15v2 int), (r15v2 int) binds: [B:55:0x020e, B:39:0x0147, B:11:0x006e, B:6:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x0210: PHI (r21v30 android.app.Application) = 
      (r21v8 android.app.Application)
      (r21v14 android.app.Application)
      (r21v29 android.app.Application)
      (r21v35 android.app.Application)
     binds: [B:55:0x020e, B:39:0x0147, B:11:0x006e, B:6:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x0210: PHI (r22v8 short) = (r22v4 short), (r22v3 short), (r22v3 short), (r22v3 short) binds: [B:55:0x020e, B:39:0x0147, B:11:0x006e, B:6:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0076, code lost:
    
        if (l.C2332.f8260 != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0086, code lost:
    
        if (l.C0526.f2219 == false) goto L14;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String m39264(int r25, java.lang.Object... r26) {
        /*
            Method dump skipped, instruction units count: 886
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16737.m39264(int, java.lang.Object[]):java.lang.String");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m39267(long j, Runnable runnable) {
        f53610.postDelayed(runnable, j);
    }

    /* JADX WARN: Code duplicated, block: B:62:0x01fb A[PHI: r0 r2 r6 r8
      0x01fb: PHI (r0v7 java.lang.CharSequence) = 
      (r0v2 java.lang.CharSequence)
      (r0v2 java.lang.CharSequence)
      (r0v2 java.lang.CharSequence)
      (r0v2 java.lang.CharSequence)
      (r0v5 java.lang.CharSequence)
      (r0v2 java.lang.CharSequence)
     binds: [B:61:0x01f9, B:57:0x01de, B:53:0x01c0, B:41:0x0142, B:30:0x00d0, B:11:0x003c] A[DONT_GENERATE, DONT_INLINE]
      0x01fb: PHI (r2v5 char) = (r2v2 char), (r2v2 char), (r2v3 char), (r2v2 char), (r2v2 char), (r2v2 char) binds: [B:61:0x01f9, B:57:0x01de, B:53:0x01c0, B:41:0x0142, B:30:0x00d0, B:11:0x003c] A[DONT_GENERATE, DONT_INLINE]
      0x01fb: PHI (r6v5 short) = (r6v2 short), (r6v2 short), (r6v2 short), (r6v3 short), (r6v2 short), (r6v2 short) binds: [B:61:0x01f9, B:57:0x01de, B:53:0x01c0, B:41:0x0142, B:30:0x00d0, B:11:0x003c] A[DONT_GENERATE, DONT_INLINE]
      0x01fb: PHI (r8v5 short[]) = (r8v2 short[]), (r8v2 short[]), (r8v2 short[]), (r8v2 short[]), (r8v2 short[]), (r8v6 short[]) binds: [B:61:0x01f9, B:57:0x01de, B:53:0x01c0, B:41:0x0142, B:30:0x00d0, B:11:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0230 A[PHI: r1 r3 r4
      0x0230: PHI (r1v6 short[]) = (r1v5 short[]), (r1v2 short[]) binds: [B:65:0x022e, B:49:0x019f] A[DONT_GENERATE, DONT_INLINE]
      0x0230: PHI (r3v3 short) = (r3v2 short), (r3v4 short) binds: [B:65:0x022e, B:49:0x019f] A[DONT_GENERATE, DONT_INLINE]
      0x0230: PHI (r4v3 short) = (r4v2 short), (r4v4 short) binds: [B:65:0x022e, B:49:0x019f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0064, code lost:
    
        if (l.C0671.m3008() >= 0) goto L11;
     */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.CharSequence m39283(int r17) {
        /*
            Method dump skipped, instruction units count: 752
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16737.m39283(int):java.lang.CharSequence");
    }

    /* JADX WARN: Code duplicated, block: B:39:0x016a A[PHI: r1 r4
      0x016a: PHI (r1v45 java.lang.String) = (r1v44 java.lang.String), (r1v2 java.lang.String) binds: [B:38:0x0168, B:25:0x00c1] A[DONT_GENERATE, DONT_INLINE]
      0x016a: PHI (r4v3 java.lang.String) = (r4v2 java.lang.String), (r4v7 java.lang.String) binds: [B:38:0x0168, B:25:0x00c1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x02ac A[PHI: r11 r13 r14 r15 r18 r19 r20 r24 r25
      0x02ac: PHI (r11v3 int) = (r11v2 int), (r11v2 int), (r11v2 int), (r11v5 int) binds: [B:63:0x02aa, B:51:0x0207, B:15:0x008e, B:6:0x006f] A[DONT_GENERATE, DONT_INLINE]
      0x02ac: PHI (r13v4 short[]) = (r13v2 short[]), (r13v3 short[]), (r13v2 short[]), (r13v2 short[]) binds: [B:63:0x02aa, B:51:0x0207, B:15:0x008e, B:6:0x006f] A[DONT_GENERATE, DONT_INLINE]
      0x02ac: PHI (r14v4 int) = (r14v2 int), (r14v3 int), (r14v2 int), (r14v2 int) binds: [B:63:0x02aa, B:51:0x0207, B:15:0x008e, B:6:0x006f] A[DONT_GENERATE, DONT_INLINE]
      0x02ac: PHI (r15v4 int) = (r15v2 int), (r15v3 int), (r15v2 int), (r15v2 int) binds: [B:63:0x02aa, B:51:0x0207, B:15:0x008e, B:6:0x006f] A[DONT_GENERATE, DONT_INLINE]
      0x02ac: PHI (r18v4 short) = (r18v3 short), (r18v2 short), (r18v2 short), (r18v2 short) binds: [B:63:0x02aa, B:51:0x0207, B:15:0x008e, B:6:0x006f] A[DONT_GENERATE, DONT_INLINE]
      0x02ac: PHI (r19v4 short) = (r19v3 short), (r19v2 short), (r19v2 short), (r19v2 short) binds: [B:63:0x02aa, B:51:0x0207, B:15:0x008e, B:6:0x006f] A[DONT_GENERATE, DONT_INLINE]
      0x02ac: PHI (r20v3 int) = (r20v2 int), (r20v2 int), (r20v2 int), (r20v5 int) binds: [B:63:0x02aa, B:51:0x0207, B:15:0x008e, B:6:0x006f] A[DONT_GENERATE, DONT_INLINE]
      0x02ac: PHI (r24v21 java.lang.String) = (r24v8 java.lang.String), (r24v13 java.lang.String), (r24v17 java.lang.String), (r24v24 java.lang.String) binds: [B:63:0x02aa, B:51:0x0207, B:15:0x008e, B:6:0x006f] A[DONT_GENERATE, DONT_INLINE]
      0x02ac: PHI (r25v4 int) = (r25v3 int), (r25v3 int), (r25v3 int), (r25v6 int) binds: [B:63:0x02aa, B:51:0x0207, B:15:0x008e, B:6:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0077, code lost:
    
        r24 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0099, code lost:
    
        if (l.C2788.f10625 >= 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0075, code lost:
    
        if (l.C0962.f3784 == false) goto L10;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m39275(java.lang.String r28, java.lang.String r29) {
        /*
            Method dump skipped, instruction units count: 1014
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16737.m39275(java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Code duplicated, block: B:54:0x01b3 A[PHI: r9 r11 r12
      0x01b3: PHI (r9v4 int) = (r9v3 int), (r9v2 int), (r9v2 int), (r9v2 int) binds: [B:53:0x01b1, B:38:0x0108, B:12:0x0067, B:9:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x01b3: PHI (r11v4 short[]) = (r11v2 short[]), (r11v3 short[]), (r11v2 short[]), (r11v2 short[]) binds: [B:53:0x01b1, B:38:0x0108, B:12:0x0067, B:9:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x01b3: PHI (r12v4 int) = (r12v2 int), (r12v3 int), (r12v2 int), (r12v2 int) binds: [B:53:0x01b1, B:38:0x0108, B:12:0x0067, B:9:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0222 A[PHI: r5 r14 r15
      0x0222: PHI (r5v4 short) = (r5v3 short), (r5v2 short), (r5v2 short), (r5v2 short) binds: [B:62:0x0220, B:28:0x00c2, B:15:0x006d, B:12:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x0222: PHI (r14v4 short[]) = (r14v2 short[]), (r14v3 short[]), (r14v2 short[]), (r14v2 short[]) binds: [B:62:0x0220, B:28:0x00c2, B:15:0x006d, B:12:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x0222: PHI (r15v4 int) = (r15v2 int), (r15v3 int), (r15v2 int), (r15v2 int) binds: [B:62:0x0220, B:28:0x00c2, B:15:0x006d, B:12:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x0257 A[PHI: r4
      0x0257: PHI (r4v4 short) = (r4v3 short), (r4v2 short) binds: [B:66:0x0255, B:9:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x028b A[PHI: r2 r6 r7 r8 r13 r16 r21
      0x028b: PHI (r2v5 int) = (r2v2 int), (r2v2 int), (r2v2 int), (r2v4 int), (r2v2 int) binds: [B:70:0x0289, B:57:0x01ea, B:34:0x00e8, B:24:0x00a2, B:6:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x028b: PHI (r6v3 int) = (r6v2 int), (r6v2 int), (r6v2 int), (r6v2 int), (r6v5 int) binds: [B:70:0x0289, B:57:0x01ea, B:34:0x00e8, B:24:0x00a2, B:6:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x028b: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int), (r7v2 int) binds: [B:70:0x0289, B:57:0x01ea, B:34:0x00e8, B:24:0x00a2, B:6:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x028b: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int), (r8v2 int) binds: [B:70:0x0289, B:57:0x01ea, B:34:0x00e8, B:24:0x00a2, B:6:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x028b: PHI (r13v4 int) = (r13v2 int), (r13v2 int), (r13v3 int), (r13v2 int), (r13v2 int) binds: [B:70:0x0289, B:57:0x01ea, B:34:0x00e8, B:24:0x00a2, B:6:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x028b: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:70:0x0289, B:57:0x01ea, B:34:0x00e8, B:24:0x00a2, B:6:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x028b: PHI (r21v5 char) = (r21v4 char), (r21v3 char), (r21v3 char), (r21v3 char), (r21v3 char) binds: [B:70:0x0289, B:57:0x01ea, B:34:0x00e8, B:24:0x00a2, B:6:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final boolean m39280() {
        int iM11306;
        int i;
        int i2;
        int i3 = C1148.f5161;
        int i4 = RunnableC1606.f6488;
        int iM11307 = (ThreadFactoryC3888.m11306("ᩳۧ") ^ i3) * (-61);
        int i5 = ((iM11307 ^ i4) * 10297) ^ 1943311709;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM11307 ^ (-1226799171);
        SharedPreferences sharedPreferences = null;
        int i7 = 0;
        short s = 0;
        short s2 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 2088652551;
        char c = 0;
        while (true) {
            i16 = i6 ^ (i5 & (((i16 ^ i4) * (-2733)) >> 31));
            switch (i16) {
                case -2144474563:
                case 1526885650:
                    i9 = s * s;
                    i10 = 163635264;
                    if (C19806.f63586) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۜۚ") ^ i4) * (-39);
                        i = ((iM11306 ^ i3) * (-3291)) ^ (-1254867954);
                        i2 = 640070295;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩻ۜ") ^ i4;
                        i = ((iM11306 ^ i3) * 6753) ^ 1812355180;
                        i2 = 1999258499;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -2135167012:
                case -1357943595:
                    i12 = 7718;
                    iM11306 = (C19806.m45029("ܺ᩻") ^ i3) * (-45);
                    i = ((iM11306 ^ i4) * 9533) ^ (-426578772);
                    i2 = 504632236;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -2026749939:
                case -269123896:
                    C3535.m10426(C1398.m4892(sArr2, i13, i14, i12));
                    throw null;
                case -1820360514:
                case -920666320:
                    sharedPreferences = f53615;
                    if (sharedPreferences != null) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩸᩻") + i3) * 123;
                        i = ((iM11306 ^ i4) * 7379) ^ 1207520903;
                        i2 = -1639427262;
                    } else {
                        iM11306 = (i4 - C19806.m45029("ܶ᩶")) * (-117);
                        i = ((iM11306 ^ i3) * (-18387)) ^ (-1563829812);
                        i2 = -1196862318;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1750824553:
                case 1471022898:
                    i7 = 18;
                    if (AbstractC0464.f2088 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۜۚ") ^ i4) * (-39);
                        i = ((iM11306 ^ i3) * (-3291)) ^ (-1254867954);
                        i2 = 640070295;
                    } else {
                        iM11306 = C19806.m45029("ۨۧ") ^ i4;
                        i = ((iM11306 ^ i3) * 3511) ^ 2047269247;
                        i2 = 327357413;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1728139622:
                case -876926264:
                    i11 = i9 + i10;
                    if (C2642.f10294 <= 0) {
                        iM11306 = (C19806.m45029("ᩳ֨") + i3) * (-27);
                        i = ((iM11306 ^ i4) * 21897) ^ (-1259445310);
                        i2 = 1373647223;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۖ֫") ^ i3) * (-57);
                        i = ((iM11306 ^ i4) * (-8405)) ^ 1883510908;
                        i2 = 2142428631;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1523687379:
                case -389172714:
                    s2 = 12792;
                    if (C2249.f8050 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("֫᩹") + i4) * 101;
                        i = ((iM11306 ^ i3) * 23291) ^ 902306999;
                        i2 = -1496852720;
                    } else {
                        iM11306 = (C19806.m45029("ܿۚ") + i3) * 115;
                        i = ((iM11306 ^ i4) * 28325) ^ 948813105;
                        i2 = -268067895;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1449184870:
                case 112218190:
                    C3577.m10565();
                    C2249.m6915();
                    iM11306 = C19806.m45029("᩹ܳ") ^ i3;
                    i = ((iM11306 ^ i4) * 30025) ^ (-1707859606);
                    i2 = 1806578786;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1371993088:
                case 605548388:
                    sArr = f53609;
                    c = 324;
                    if (C2704.f10408) {
                        iM11306 = ThreadFactoryC3888.m11306("ۢۡ") ^ i4;
                        i = ((iM11306 ^ i3) * 15299) ^ 602866803;
                        i2 = -332094752;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۜۚ") ^ i4) * (-39);
                        i = ((iM11306 ^ i3) * (-3291)) ^ (-1254867954);
                        i2 = 640070295;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1358142655:
                case 449894487:
                    i12 = 59540;
                    iM11306 = (C19806.m45029("ܺ᩻") ^ i3) * (-45);
                    i = ((iM11306 ^ i4) * 9533) ^ (-426578772);
                    i2 = 504632236;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1030928596:
                case 548826537:
                    sArr3 = f53609;
                    i15 = 328;
                    if (C0817.f3443) {
                        iM11306 = ThreadFactoryC3888.m11306("ۛ᩺") ^ i4;
                        i = ((iM11306 ^ i3) * 19839) ^ 342078693;
                        i2 = -1200013547;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֫᩹") + i4) * 101;
                        i = ((iM11306 ^ i3) * 23291) ^ 902306999;
                        i2 = -1496852720;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -787489067:
                case -630962726:
                    sArr2 = f53609;
                    i13 = 325;
                    if (C1148.f5161 <= 0) {
                        iM11306 = (C19806.m45029("ᩳ֨") + i3) * (-27);
                        i = ((iM11306 ^ i4) * 21897) ^ (-1259445310);
                        i2 = 1373647223;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۜ᩻") ^ i4;
                        i = ((iM11306 ^ i3) * 13607) ^ (-928177371);
                        i2 = -2101319979;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -774556761:
                case -219173276:
                    if (C3722.m10894() <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("֫᩹") + i4) * 101;
                        i = ((iM11306 ^ i3) * 23291) ^ 902306999;
                        i2 = -1496852720;
                    } else {
                        iM11306 = (C19806.m45029("ᩳ֨") + i3) * (-27);
                        i = ((iM11306 ^ i4) * 21897) ^ (-1259445310);
                        i2 = 1373647223;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -698469221:
                case 1634868621:
                    if (C2124.f7782 <= 0) {
                        iM11306 = C19806.m45029("᩹ܳ") ^ i3;
                        i = ((iM11306 ^ i4) * 30025) ^ (-1707859606);
                        i2 = 1806578786;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֫᩹") + i4) * 101;
                        i = ((iM11306 ^ i3) * 23291) ^ 902306999;
                        i2 = -1496852720;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -696403203:
                case -61597246:
                    return C1066.m4039(sharedPreferences, C0962.m3747(sArr3, i15, i7, i12), true);
                case -321886473:
                case -290103479:
                    if (i8 - (i11 + i11) > 0) {
                        iM11306 = C19806.m45029("ۖ᩻") ^ i3;
                        i = ((iM11306 ^ i4) * 14225) ^ 1964457715;
                        i2 = -16229282;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۤۜ") ^ i4) * 81;
                        i = ((iM11306 ^ i3) * (-17373)) ^ (-47649885);
                        i2 = 1275477985;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -257074790:
                case 1343904033:
                    if (C10634.f36300 < 0) {
                        iM11306 = (C19806.m45029("ᩳ֨") + i3) * (-27);
                        i = ((iM11306 ^ i4) * 21897) ^ (-1259445310);
                        i2 = 1373647223;
                    } else {
                        iM11306 = (C19806.m45029("᩻۫") ^ i3) * (-33);
                        i = ((iM11306 ^ i4) * (-31519)) ^ 986345170;
                        i2 = 1536680270;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 65251335:
                case 1014491508:
                    s = sArr[c];
                    if (C1419.f5860 >= 0) {
                        iM11306 = (C19806.m45029("᩻۫") ^ i3) * (-33);
                        i = ((iM11306 ^ i4) * (-31519)) ^ 986345170;
                        i2 = 1536680270;
                    } else {
                        iM11306 = C19806.m45029("۟֡") ^ i3;
                        i = ((iM11306 ^ i4) * (-2637)) ^ (-348093444);
                        i2 = -627185816;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 337531487:
                case 524315000:
                    ViewTreeObserverOnPreDrawListenerC3327.m9874();
                    C0962.m3746();
                    return false;
                case 1830248210:
                case 1841274071:
                    i14 = 3;
                    if (C0629.f2722 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۜۚ") ^ i4) * (-39);
                        i = ((iM11306 ^ i3) * (-3291)) ^ (-1254867954);
                        i2 = 640070295;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩶ܽ") ^ i3;
                        i = ((iM11306 ^ i4) * 27947) ^ 258881581;
                        i2 = -125688211;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                default:
                    int i17 = s + s2;
                    i8 = i17 * i17;
                    if (C1977.m6356()) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۜۚ") ^ i4) * (-39);
                        i = ((iM11306 ^ i3) * (-3291)) ^ (-1254867954);
                        i2 = 640070295;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۤ۠") ^ i4) * (-27);
                        i = ((iM11306 ^ i3) * 21229) ^ (-1163764488);
                        i2 = 880544393;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Drawable m39263(int i) {
        Drawable drawableM37904 = C15945.m37904(C0050.m939(), i);
        C0629.m2908(drawableM37904);
        return drawableM37904;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x005e A[PHI: r11
      0x005e: PHI (r11v5 short[]) = (r11v3 short[]), (r11v2 short[]) binds: [B:26:0x00a4, B:11:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x01f5 A[PHI: r4 r6 r7 r8 r16
      0x01f5: PHI (r4v4 short) = (r4v3 short), (r4v2 short), (r4v2 short) binds: [B:57:0x01f3, B:49:0x01a1, B:45:0x017e] A[DONT_GENERATE, DONT_INLINE]
      0x01f5: PHI (r6v4 int) = (r6v2 int), (r6v3 int), (r6v2 int) binds: [B:57:0x01f3, B:49:0x01a1, B:45:0x017e] A[DONT_GENERATE, DONT_INLINE]
      0x01f5: PHI (r7v3 int) = (r7v2 int), (r7v2 int), (r7v4 int) binds: [B:57:0x01f3, B:49:0x01a1, B:45:0x017e] A[DONT_GENERATE, DONT_INLINE]
      0x01f5: PHI (r8v3 int) = (r8v2 int), (r8v2 int), (r8v4 int) binds: [B:57:0x01f3, B:49:0x01a1, B:45:0x017e] A[DONT_GENERATE, DONT_INLINE]
      0x01f5: PHI (r16v7 android.content.pm.PackageManager) = 
      (r16v4 android.content.pm.PackageManager)
      (r16v6 android.content.pm.PackageManager)
      (r16v8 android.content.pm.PackageManager)
     binds: [B:57:0x01f3, B:49:0x01a1, B:45:0x017e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x025d A[PHI: r1 r2 r3
      0x025d: PHI (r1v44 android.content.pm.PackageManager) = 
      (r1v6 android.content.pm.PackageManager)
      (r1v37 android.content.pm.PackageManager)
      (r1v2 android.content.pm.PackageManager)
      (r1v2 android.content.pm.PackageManager)
     binds: [B:66:0x025b, B:30:0x00c8, B:15:0x0064, B:11:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x025d: PHI (r2v4 short[]) = (r2v3 short[]), (r2v2 short[]), (r2v2 short[]), (r2v2 short[]) binds: [B:66:0x025b, B:30:0x00c8, B:15:0x0064, B:11:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x025d: PHI (r3v4 char) = (r3v3 char), (r3v2 char), (r3v2 char), (r3v2 char) binds: [B:66:0x025b, B:30:0x00c8, B:15:0x0064, B:11:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final PackageManager m39292() {
        int iM45029;
        int i;
        int i2;
        int i3 = C1668.f6641;
        int i4 = C0629.f2722;
        int iM450210 = C19806.m45029("۠ܶ") ^ i3;
        int i5 = ((iM450210 ^ i4) * (-1751)) ^ 782462732;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM450210 ^ (-1124605243);
        PackageManager packageManager = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = -443587301;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i4) * 22927) >> 31));
            switch (i13) {
                case -1957807595:
                case 730714636:
                    packageManager = packageManager;
                    sArr = f53609;
                    c = 516;
                    if (C2249.f8050 >= 0) {
                        packageManager = packageManager;
                        iM45029 = (ThreadFactoryC3888.m11306("ܳ֨") ^ i4) * 123;
                        packageManager = packageManager;
                        i = ((iM45029 ^ i3) * (-4411)) ^ (-95341108);
                        i2 = -945121627;
                    } else {
                        iM45029 = (C19806.m45029("۟ۡ") ^ i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i = ((iM45029 ^ i4) * (-26259)) ^ (-518776462);
                        i2 = 2094163452;
                    }
                    PackageManager packageManager2 = packageManager;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    packageManager = packageManager2;
                    break;
                case -1686552987:
                case 819534523:
                    packageManager = packageManager;
                    s = sArr[c];
                    if (C2477.f9839 <= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("֡ۗ")) * (-87);
                        i = ((iM45029 ^ i4) * (-17245)) ^ 1914746399;
                        i2 = -445105266;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۜۘ") ^ i3;
                        i = ((iM45029 ^ i4) * 11565) ^ (-1536615256);
                        i2 = -639940819;
                    }
                    PackageManager packageManager3 = packageManager;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    packageManager = packageManager3;
                    break;
                case -1577332676:
                case -725091682:
                    sArr2 = f53609;
                    if (C3535.f13026 <= 0) {
                        packageManager = packageManager;
                        iM45029 = C19806.m45029("۬ᩴ") ^ i3;
                        i = ((iM45029 ^ i4) * (-20483)) ^ 1229421652;
                        i2 = 1839623264;
                    } else {
                        iM45029 = C19806.m45029("۟۟") ^ i3;
                        packageManager = packageManager;
                        i = ((iM45029 ^ i4) * (-31733)) ^ (-1714612360);
                        i2 = -1332528672;
                    }
                    PackageManager packageManager4 = packageManager;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    packageManager = packageManager4;
                    break;
                case -1556959609:
                case 1526618836:
                    packageManager = packageManager;
                    i8 = s * s;
                    i9 = 206008609;
                    if (C7105.m18985()) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("֡ۗ")) * (-87);
                        i = ((iM45029 ^ i4) * (-17245)) ^ 1914746399;
                        i2 = -445105266;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۫֨") + i4) * 15;
                        i = ((iM45029 ^ i3) * 29563) ^ 1456078237;
                        i2 = -1757531563;
                    }
                    PackageManager packageManager5 = packageManager;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    packageManager = packageManager5;
                    break;
                case -1365870354:
                case 669585055:
                    if (ThreadFactoryC3888.m11300() <= 0) {
                        packageManager = packageManager;
                        i12 = 517;
                        iM45029 = ThreadFactoryC3888.m11306("ܿ۫") ^ i4;
                        i = ((iM45029 ^ i3) * 24737) ^ 1716290510;
                        i2 = 452458136;
                        PackageManager packageManager6 = packageManager;
                        i6 = iM45029 ^ i2;
                        i5 = i;
                        packageManager = packageManager6;
                    } else {
                        int iM11306 = ThreadFactoryC3888.m11306("ܳۧ") ^ i3;
                        i6 = iM11306 ^ 1423553299;
                        i5 = ((iM11306 ^ i4) * 9575) ^ 1919683331;
                        i12 = 517;
                    }
                    break;
                case -1264315526:
                case 100994423:
                    packageManager = packageManager;
                    i10 = i8 + i9;
                    if (C3722.f13525 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܿ۫") ^ i4;
                        i = ((iM45029 ^ i3) * 24737) ^ 1716290510;
                        i2 = 452458136;
                    } else {
                        iM45029 = (i4 - C19806.m45029("᩹ܰ")) * (-105);
                        i = ((iM45029 ^ i3) * 14937) ^ 703626598;
                        i2 = 1643234489;
                    }
                    PackageManager packageManager7 = packageManager;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    packageManager = packageManager7;
                    break;
                case -1171064274:
                case 1175009757:
                    packageManager = packageManager;
                    if (C2332.f8260) {
                        iM45029 = ThreadFactoryC3888.m11306("ܳ᩸") ^ i4;
                        i = ((iM45029 ^ i3) * (-16687)) ^ (-1826943872);
                        i2 = 599143386;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۜܿ") ^ i4) * (-37);
                        i = ((iM45029 ^ i3) * (-18547)) ^ (-1627799403);
                        i2 = 1088211462;
                    }
                    PackageManager packageManager8 = packageManager;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    packageManager = packageManager8;
                    break;
                case -1053332640:
                case 1181931538:
                    i11 = 41717;
                    iM45029 = (ThreadFactoryC3888.m11306("ܶۡ") + i4) * (-127);
                    i = ((iM45029 ^ i3) * (-2393)) ^ (-2014430584);
                    i2 = 1927699115;
                    PackageManager packageManager9 = packageManager;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    packageManager = packageManager9;
                    break;
                case -1012680296:
                case -57150894:
                    C1937.m6286(packageManager, C1419.m4969(sArr2, i12, 22, i11));
                    return packageManager;
                case -502025708:
                case 1882171739:
                    C0050.m946();
                    if (MenuItemOnMenuItemClickListenerC3244.m9701() >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳ֨") ^ i4) * 123;
                        packageManager = packageManager;
                        i = ((iM45029 ^ i3) * (-4411)) ^ (-95341108);
                        i2 = -945121627;
                    } else {
                        packageManager = packageManager;
                        iM45029 = C19806.m45029("۬ᩴ") ^ i3;
                        i = ((iM45029 ^ i4) * (-20483)) ^ 1229421652;
                        i2 = 1839623264;
                    }
                    PackageManager packageManager10 = packageManager;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    packageManager = packageManager10;
                    break;
                case -424787361:
                case 1611599295:
                    if (C3577.f13150 < 0) {
                        packageManager = packageManager;
                        iM45029 = (ThreadFactoryC3888.m11306("ۜܿ") ^ i4) * (-37);
                        i = ((iM45029 ^ i3) * (-18547)) ^ (-1627799403);
                        i2 = 1088211462;
                        PackageManager packageManager11 = packageManager;
                        i6 = iM45029 ^ i2;
                        i5 = i;
                        packageManager = packageManager11;
                    }
                    packageManager = packageManager;
                    iM45029 = ThreadFactoryC3888.m11306("ܿ۫") ^ i4;
                    i = ((iM45029 ^ i3) * 24737) ^ 1716290510;
                    i2 = 452458136;
                    PackageManager packageManager12 = packageManager;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    packageManager = packageManager12;
                    break;
                case -111269494:
                case 1625103168:
                    packageManager = packageManager;
                    int i14 = s + s2;
                    i7 = i14 * i14;
                    if (C3660.f13403 >= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("֡ۗ")) * (-87);
                        i = ((iM45029 ^ i4) * (-17245)) ^ 1914746399;
                        i2 = -445105266;
                    } else {
                        iM45029 = C19806.m45029("۟ۙ") ^ i3;
                        i = ((iM45029 ^ i4) * (-8525)) ^ (-1956820640);
                        i2 = 877173186;
                    }
                    PackageManager packageManager13 = packageManager;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    packageManager = packageManager13;
                    break;
                case -86216201:
                case 269460900:
                    if (C0526.f2219) {
                        packageManager = packageManager;
                        iM45029 = ThreadFactoryC3888.m11306("ܿ۫") ^ i4;
                        i = ((iM45029 ^ i3) * 24737) ^ 1716290510;
                        i2 = 452458136;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳ֨") ^ i4) * 123;
                        packageManager = packageManager;
                        i = ((iM45029 ^ i3) * (-4411)) ^ (-95341108);
                        i2 = -945121627;
                    }
                    PackageManager packageManager14 = packageManager;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    packageManager = packageManager14;
                    break;
                case -74174311:
                case 909289956:
                    i11 = 7832;
                    iM45029 = (ThreadFactoryC3888.m11306("ܶۡ") + i4) * (-127);
                    i = ((iM45029 ^ i3) * (-2393)) ^ (-2014430584);
                    i2 = 1927699115;
                    PackageManager packageManager15 = packageManager;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    packageManager = packageManager15;
                    break;
                case -72150851:
                case 1319203022:
                    packageManager = packageManager;
                    s2 = 14353;
                    if (RunnableC1895.m6170() != 0) {
                        iM45029 = C19806.m45029("۬ᩴ") ^ i3;
                        i = ((iM45029 ^ i4) * (-20483)) ^ 1229421652;
                        i2 = 1839623264;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩻ۗ") ^ i4;
                        i = ((iM45029 ^ i3) * (-17725)) ^ 253618239;
                        i2 = 1941041208;
                    }
                    PackageManager packageManager16 = packageManager;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    packageManager = packageManager16;
                    break;
                case 161006032:
                case 737910825:
                    C0216.m1591();
                    C1461.m5080();
                    return null;
                case 703808772:
                case 1402649564:
                    packageManager = C1377.m4826().getPackageManager();
                    if (C2788.f10625 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳ֨") ^ i4) * 123;
                        packageManager = packageManager;
                        i = ((iM45029 ^ i3) * (-4411)) ^ (-95341108);
                        i2 = -945121627;
                    } else {
                        iM45029 = C19806.m45029("֫ܺ") ^ i4;
                        packageManager = packageManager;
                        i = ((iM45029 ^ i3) * (-24767)) ^ 718678294;
                        i2 = -1298876905;
                    }
                    PackageManager packageManager17 = packageManager;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    packageManager = packageManager17;
                    break;
                case 1156212768:
                case 1770466930:
                    packageManager = packageManager;
                    if ((i10 + i10) - i7 < 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩸ۘ") ^ i3) * 41;
                        i = ((iM45029 ^ i4) * (-20457)) ^ 21086663;
                        i2 = -2085290825;
                    } else {
                        iM45029 = (C19806.m45029("۬۠") ^ i3) * 5;
                        i = ((iM45029 ^ i4) * 11271) ^ 1087437880;
                        i2 = 251054350;
                    }
                    PackageManager packageManager18 = packageManager;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    packageManager = packageManager18;
                    break;
                default:
                    C1977.m6356();
                    packageManager = packageManager;
                    iM45029 = ThreadFactoryC3888.m11306("ܿ۫") ^ i4;
                    i = ((iM45029 ^ i3) * 24737) ^ 1716290510;
                    i2 = 452458136;
                    PackageManager packageManager19 = packageManager;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    packageManager = packageManager19;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00d8 A[PHI: r1 r11
      0x00d8: PHI (r1v43 android.content.res.AssetManager) = 
      (r1v30 android.content.res.AssetManager)
      (r1v2 android.content.res.AssetManager)
      (r1v2 android.content.res.AssetManager)
     binds: [B:31:0x00d6, B:27:0x00b0, B:9:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x00d8: PHI (r11v4 short[]) = (r11v2 short[]), (r11v3 short[]), (r11v2 short[]) binds: [B:31:0x00d6, B:27:0x00b0, B:9:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x0233 A[PHI: r5 r7 r8 r9 r16
      0x0233: PHI (r5v3 short) = (r5v2 short), (r5v2 short), (r5v2 short), (r5v2 short), (r5v4 short) binds: [B:59:0x0231, B:46:0x018e, B:42:0x0168, B:10:0x0056, B:6:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x0233: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int), (r7v2 int) binds: [B:59:0x0231, B:46:0x018e, B:42:0x0168, B:10:0x0056, B:6:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x0233: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int), (r8v2 int) binds: [B:59:0x0231, B:46:0x018e, B:42:0x0168, B:10:0x0056, B:6:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x0233: PHI (r9v4 int) = (r9v2 int), (r9v2 int), (r9v3 int), (r9v2 int), (r9v2 int) binds: [B:59:0x0231, B:46:0x018e, B:42:0x0168, B:10:0x0056, B:6:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x0233: PHI (r16v20 android.content.res.AssetManager) = 
      (r16v3 android.content.res.AssetManager)
      (r16v6 android.content.res.AssetManager)
      (r16v7 android.content.res.AssetManager)
      (r16v19 android.content.res.AssetManager)
      (r16v21 android.content.res.AssetManager)
     binds: [B:59:0x0231, B:46:0x018e, B:42:0x0168, B:10:0x0056, B:6:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005c, code lost:
    
        if (l.C1398.f5802 <= 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005e, code lost:
    
        r16 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0067, code lost:
    
        if (l.C3722.f13525 > 0) goto L16;
     */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.content.res.AssetManager m39286() {
        /*
            Method dump skipped, instruction units count: 818
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16737.m39286():android.content.res.AssetManager");
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final Resources m39279() {
        Resources resources = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        short[] sArr2 = null;
        int i5 = 0;
        int i6 = -1025846584;
        int i7 = C0050.f912;
        int i8 = C1419.f5860;
        int iM45029 = C19806.m45029("ܶ᩶") ^ i7;
        int i9 = ((iM45029 ^ i8) * 18281) ^ 285171294;
        int i10 = -190325283;
        while (true) {
            i6 = ((((i6 ^ i8) * (-12891)) >> 31) & i9) ^ (iM45029 ^ i10);
            switch (i6) {
                case -1691124589:
                case -758249460:
                    if (!RunnableC1564.f6300) {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩳ᩸") + i8) * 61;
                        i9 = ((iM45029 ^ i7) * 31841) ^ (-431224289);
                        i10 = 862221311;
                    } else {
                        iM45029 = (C19806.m45029("ۘ۠") ^ i8) * 77;
                        i9 = ((iM45029 ^ i7) * 7099) ^ (-1696852819);
                        i10 = 1423680118;
                    }
                    break;
                case -1630297005:
                case 1040767019:
                    s = sArr[c];
                    if (C1148.f5161 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֫۬") ^ i7;
                        i9 = ((iM45029 ^ i8) * (-7929)) ^ (-1151107420);
                        i10 = -1639878950;
                    } else {
                        iM45029 = C19806.m45029("᩻۟") ^ i8;
                        i9 = ((iM45029 ^ i7) * (-18795)) ^ (-921439333);
                        i10 = 783785595;
                    }
                    break;
                case -1595427727:
                case 1303349620:
                    if (C0817.m3399()) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۡ֫") ^ i7) * (-7);
                        i9 = ((iM45029 ^ i8) * (-10303)) ^ 990019715;
                        i10 = 1946914450;
                    } else {
                        iM45029 = (C19806.m45029("ۘ۠") ^ i8) * 77;
                        i9 = ((iM45029 ^ i7) * 7099) ^ (-1696852819);
                        i10 = 1423680118;
                    }
                    break;
                case -1550809985:
                case -82531131:
                    s2 = 1;
                    if (C1460.f5948 >= 0) {
                        iM45029 = (C19806.m45029("ۘ۠") ^ i8) * 77;
                        i9 = ((iM45029 ^ i7) * 7099) ^ (-1696852819);
                        i10 = 1423680118;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۢ᩸") ^ i7;
                        i9 = ((iM45029 ^ i8) * (-3159)) ^ (-949727350);
                        i10 = -1391077645;
                    }
                    break;
                case -1324990774:
                case 1617400325:
                    i4 = 61179;
                    iM45029 = (i8 - C19806.m45029("֫֫")) * (-97);
                    i9 = ((iM45029 ^ i7) * (-18175)) ^ (-1214537205);
                    i10 = -788844033;
                    break;
                case -1306891867:
                case 58293281:
                    C2477.m7593();
                    iM45029 = (ThreadFactoryC3888.m11306("ᩳ᩸") + i8) * 61;
                    i9 = ((iM45029 ^ i7) * 31841) ^ (-431224289);
                    i10 = 862221311;
                    break;
                case -1198670274:
                case -182138975:
                    sArr = f53609;
                    c = 306;
                    if (C0817.f3443) {
                        iM45029 = ThreadFactoryC3888.m11306("᩹᩵") ^ i8;
                        i9 = ((iM45029 ^ i7) * (-4863)) ^ (-1329906304);
                        i10 = -1743991022;
                    } else {
                        iM45029 = C19806.m45029("᩹ۨ") ^ i7;
                        i9 = ((iM45029 ^ i8) * 367) ^ 1436626965;
                        i10 = -1628984736;
                    }
                    break;
                case -978845139:
                case 2054084943:
                    if ((i2 + i3) - i > 0) {
                        iM45029 = (C19806.m45029("ۤ᩺") ^ i7) * (-61);
                        i9 = ((iM45029 ^ i8) * (-15325)) ^ 1601454720;
                        i10 = 1759706709;
                    } else {
                        iM45029 = (C19806.m45029("ܺ᩷") + i8) * (-11);
                        i9 = ((iM45029 ^ i7) * 14675) ^ 1687612077;
                        i10 = -1209380678;
                    }
                    break;
                case -936173976:
                case 1989191346:
                    i3 = 1;
                    if (C2704.f10408) {
                        iM45029 = ThreadFactoryC3888.m11306("ۗۚ") ^ i7;
                        i9 = ((iM45029 ^ i8) * 26609) ^ (-1864242760);
                        i10 = -1987952339;
                    } else {
                        iM45029 = (C19806.m45029("ۘ۠") ^ i8) * 77;
                        i9 = ((iM45029 ^ i7) * 7099) ^ (-1696852819);
                        i10 = 1423680118;
                    }
                    break;
                case -842850334:
                case 361033276:
                    C1066.m4023();
                    if (!C0797.f3386) {
                        iM45029 = ThreadFactoryC3888.m11306("֫۬") ^ i7;
                        i9 = ((iM45029 ^ i8) * (-7929)) ^ (-1151107420);
                        i10 = -1639878950;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۤܶ") ^ i8) * 83;
                        i9 = ((iM45029 ^ i7) * (-19279)) ^ 85628591;
                        i10 = -247517987;
                    }
                    break;
                case -764722792:
                case 288259252:
                    if (!C3286.f12186) {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩳ᩸") + i8) * 61;
                        i9 = ((iM45029 ^ i7) * 31841) ^ (-431224289);
                        i10 = 862221311;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۤܶ") ^ i8) * 83;
                        i9 = ((iM45029 ^ i7) * (-19279)) ^ 85628591;
                        i10 = -247517987;
                    }
                    break;
                case -728792100:
                case -247359485:
                    C1148.m4232();
                    C2249.m6915();
                    return null;
                case -708693645:
                case 954041996:
                    sArr2 = f53609;
                    if (C3722.f13525 <= 0) {
                        iM45029 = C19806.m45029("᩹ۨ") ^ i7;
                        i9 = ((iM45029 ^ i8) * 367) ^ 1436626965;
                        i10 = -1628984736;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۫ܰ") ^ i8;
                        i9 = ((iM45029 ^ i7) * 6623) ^ 2035745781;
                        i10 = 1017551485;
                    }
                    break;
                case -564522023:
                case -390485737:
                    resources = C0050.m939().getResources();
                    if (C0962.f3784) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۤܶ") ^ i8) * 83;
                        i9 = ((iM45029 ^ i7) * (-19279)) ^ 85628591;
                        i10 = -247517987;
                    } else {
                        iM45029 = (i7 - ThreadFactoryC3888.m11306("᩻۬")) * (-65);
                        i9 = ((iM45029 ^ i8) * 16793) ^ (-1069439989);
                        i10 = 2143497245;
                    }
                    break;
                case -515923770:
                case 1974265707:
                    int i11 = s + s2;
                    i = i11 * i11;
                    if (C0671.f2816 != 0) {
                        iM45029 = C19806.m45029("᩹ۨ") ^ i7;
                        i9 = ((iM45029 ^ i8) * 367) ^ 1436626965;
                        i10 = -1628984736;
                    } else {
                        iM45029 = (i7 - ThreadFactoryC3888.m11306("᩶ۘ")) * 5;
                        i9 = ((iM45029 ^ i8) * 25921) ^ 1641006530;
                        i10 = 599932450;
                    }
                    break;
                case -387807593:
                case 983626264:
                    C7105.m18988(resources, C1977.m6363(sArr2, i5, 17, i4));
                    return resources;
                case -163743398:
                case 1594288103:
                    i2 = s * 2;
                    if (C10634.m26820()) {
                        iM45029 = ThreadFactoryC3888.m11306("֫۬") ^ i7;
                        i9 = ((iM45029 ^ i8) * (-7929)) ^ (-1151107420);
                        i10 = -1639878950;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܺۘ") ^ i8;
                        i9 = ((iM45029 ^ i7) * (-23511)) ^ 1778963845;
                        i10 = 496234956;
                    }
                    break;
                case 740085492:
                case 1711178969:
                    i4 = 42240;
                    iM45029 = (i8 - C19806.m45029("֫֫")) * (-97);
                    i9 = ((iM45029 ^ i7) * (-18175)) ^ (-1214537205);
                    i10 = -788844033;
                    break;
                default:
                    i5 = 307;
                    if (C1461.m5080()) {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩳ᩸") + i8) * 61;
                        i9 = ((iM45029 ^ i7) * 31841) ^ (-431224289);
                        i10 = 862221311;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۡ᩻") ^ i7) * 31;
                        i9 = ((iM45029 ^ i8) * 25635) ^ (-655044520);
                        i10 = 59025119;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x01b8 A[PHI: r4 r5 r6 r16
      0x01b8: PHI (r4v4 short) = (r4v3 short), (r4v2 short), (r4v2 short) binds: [B:57:0x01f6, B:53:0x01d6, B:49:0x01b6] A[DONT_GENERATE, DONT_INLINE]
      0x01b8: PHI (r5v4 int) = (r5v2 int), (r5v3 int), (r5v2 int) binds: [B:57:0x01f6, B:53:0x01d6, B:49:0x01b6] A[DONT_GENERATE, DONT_INLINE]
      0x01b8: PHI (r6v3 int) = (r6v2 int), (r6v2 int), (r6v4 int) binds: [B:57:0x01f6, B:53:0x01d6, B:49:0x01b6] A[DONT_GENERATE, DONT_INLINE]
      0x01b8: PHI (r16v6 android.content.ContentResolver) = 
      (r16v4 android.content.ContentResolver)
      (r16v5 android.content.ContentResolver)
      (r16v7 android.content.ContentResolver)
     binds: [B:57:0x01f6, B:53:0x01d6, B:49:0x01b6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0063, code lost:
    
        if (l.C0050.m946() <= 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006c, code lost:
    
        if (l.C2332.f8260 == false) goto L17;
     */
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.content.ContentResolver m39259() {
        /*
            Method dump skipped, instruction units count: 808
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16737.m39259():android.content.ContentResolver");
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final File m39285() {
        File filesDir = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        short[] sArr2 = null;
        int i4 = 0;
        int i5 = 1833611435;
        int i6 = C0629.f2722;
        int i7 = RunnableC0195.f1321;
        int iM45029 = (i7 - C19806.m45029("᩻ᩴ")) * 59;
        int i8 = ((iM45029 ^ i6) * 15735) ^ (-452068321);
        int i9 = -115969027;
        while (true) {
            i5 = ((((i5 ^ i6) * (-21593)) >> 31) & i8) ^ (iM45029 ^ i9);
            switch (i5) {
                case -2083207831:
                case 1177707876:
                    sArr2 = f53609;
                    if (C19806.m45024()) {
                        iM45029 = (C19806.m45029("۫ۡ") ^ i6) * 47;
                        i8 = ((iM45029 ^ i7) * (-1631)) ^ 940950894;
                        i9 = 1856337738;
                    } else {
                        iM45029 = (C19806.m45029("ۤ᩶") ^ i6) * (-15);
                        i8 = ((iM45029 ^ i7) * 25085) ^ 400467888;
                        i9 = -1130064020;
                    }
                    break;
                case -1663301611:
                case 1287156153:
                    i3 = 2743;
                    iM45029 = C19806.m45029("ۧ᩷") ^ i6;
                    i8 = ((iM45029 ^ i7) * (-2231)) ^ (-1161347909);
                    i9 = 1229149578;
                    break;
                case -1526793000:
                case 1861026352:
                    if (C1668.m5583()) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܺܶ") ^ i6) * 77;
                        i8 = ((iM45029 ^ i7) * 30271) ^ (-363749985);
                        i9 = 396483645;
                    } else {
                        iM45029 = C19806.m45029("۬ۛ") ^ i7;
                        i8 = ((iM45029 ^ i6) * (-23637)) ^ (-1519499856);
                        i9 = -974281456;
                    }
                    break;
                case -855836507:
                case 498468150:
                    i = 43116 * s;
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM45029 = (C19806.m45029("۫ۡ") ^ i6) * 47;
                        i8 = ((iM45029 ^ i7) * (-1631)) ^ 940950894;
                        i9 = 1856337738;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۜ۠") ^ i7;
                        i8 = ((iM45029 ^ i6) * 10203) ^ 1029672986;
                        i9 = -859990493;
                    }
                    break;
                case -809455614:
                case 1314007953:
                    C1937.m6286(filesDir, C3535.m10423(sArr2, i4, 16, i3));
                    return filesDir;
                case -808318555:
                case -702999345:
                    if (C1025.f4800 >= 0) {
                        iM45029 = (C19806.m45029("۫ۧ") ^ i7) * 33;
                        i8 = ((iM45029 ^ i6) * (-27227)) ^ (-2098914948);
                        i9 = -308320582;
                    } else {
                        iM45029 = (i7 - ThreadFactoryC3888.m11306("ۛۧ")) * 75;
                        i8 = ((iM45029 ^ i6) * (-9499)) ^ 1499840886;
                        i9 = 245951615;
                    }
                    break;
                case -553886306:
                case -202831275:
                    C19806.m45024();
                    return null;
                case -543751046:
                case 245657950:
                    C3722.m10894();
                    iM45029 = (C19806.m45029("۫ۧ") ^ i7) * 33;
                    i8 = ((iM45029 ^ i6) * (-27227)) ^ (-2098914948);
                    i9 = -308320582;
                    break;
                case -522371015:
                case -256325810:
                    i3 = 32353;
                    iM45029 = C19806.m45029("ۧ᩷") ^ i6;
                    i8 = ((iM45029 ^ i7) * (-2231)) ^ (-1161347909);
                    i9 = 1229149578;
                    break;
                case -439087032:
                case 1131003863:
                    if (C0050.f912 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܶۙ") + i7) * (-27);
                        i8 = ((iM45029 ^ i6) * (-9149)) ^ (-1449024988);
                        i9 = -1987031225;
                    } else {
                        iM45029 = C19806.m45029("۫۬") ^ i6;
                        i8 = ((iM45029 ^ i7) * (-14247)) ^ 1523275374;
                        i9 = 2105675669;
                    }
                    break;
                case -374260428:
                case 1714990636:
                    if (!C0797.f3386) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܶۙ") + i7) * (-27);
                        i8 = ((iM45029 ^ i6) * (-9149)) ^ (-1449024988);
                        i9 = -1987031225;
                    } else {
                        iM45029 = (C19806.m45029("۫ۧ") ^ i7) * 33;
                        i8 = ((iM45029 ^ i6) * (-27227)) ^ (-2098914948);
                        i9 = -308320582;
                    }
                    break;
                case -238195246:
                case 898469961:
                    s = sArr[c];
                    if (C1398.f5802 <= 0) {
                        iM45029 = C19806.m45029("۬ۛ") ^ i7;
                        i8 = ((iM45029 ^ i6) * (-23637)) ^ (-1519499856);
                        i9 = -974281456;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܿ᩸") ^ i6;
                        i8 = ((iM45029 ^ i7) * (-22515)) ^ 1662840229;
                        i9 = -543960200;
                    }
                    break;
                case -172093521:
                case 1869126644:
                    i2 = s + 10779;
                    if (C2249.m6915() <= 0) {
                        iM45029 = C19806.m45029("۬ۛ") ^ i7;
                        i8 = ((iM45029 ^ i6) * (-23637)) ^ (-1519499856);
                        i9 = -974281456;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۚ᩷") ^ i6) * (-111);
                        i8 = ((iM45029 ^ i7) * (-18735)) ^ (-371111805);
                        i9 = -1128288933;
                    }
                    break;
                case -3798396:
                case 568552791:
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    if (C0671.m3008() >= 0) {
                        iM45029 = C19806.m45029("۬ۛ") ^ i7;
                        i8 = ((iM45029 ^ i6) * (-23637)) ^ (-1519499856);
                        i9 = -974281456;
                    } else {
                        iM45029 = (C19806.m45029("۫ۧ") ^ i7) * 33;
                        i8 = ((iM45029 ^ i6) * (-27227)) ^ (-2098914948);
                        i9 = -308320582;
                    }
                    break;
                case 537291946:
                case 949184611:
                    sArr = f53609;
                    c = 376;
                    if (C1419.f5860 >= 0) {
                        iM45029 = (i6 - C19806.m45029("֨ۘ")) * 41;
                        i8 = ((iM45029 ^ i7) * (-1965)) ^ (-752913727);
                        i9 = 309276906;
                    } else {
                        iM45029 = C19806.m45029("֨ܶ") ^ i7;
                        i8 = ((iM45029 ^ i6) * (-2665)) ^ (-1640930272);
                        i9 = 1174499477;
                    }
                    break;
                case 737542763:
                case 779861618:
                    if ((i2 * i2) - i >= 0) {
                        iM45029 = C19806.m45029("۫ܰ") ^ i7;
                        i8 = ((iM45029 ^ i6) * 32323) ^ 682392929;
                        i9 = 1124617167;
                    } else {
                        iM45029 = C19806.m45029("᩹ۤ") ^ i7;
                        i8 = ((iM45029 ^ i6) * (-27067)) ^ 1056676128;
                        i9 = 1057678797;
                    }
                    break;
                case 843645274:
                case 1512863038:
                    filesDir = C0050.m939().getFilesDir();
                    if (C3660.f13403 >= 0) {
                        iM45029 = (C19806.m45029("۫ۧ") ^ i7) * 33;
                        i8 = ((iM45029 ^ i6) * (-27227)) ^ (-2098914948);
                        i9 = -308320582;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۡ֡") ^ i7) * 51;
                        i8 = ((iM45029 ^ i6) * 29167) ^ 353115086;
                        i9 = -448535859;
                    }
                    break;
                case 1624867866:
                case 1803221307:
                    i4 = 377;
                    if (C2477.f9839 <= 0) {
                        iM45029 = (i6 - C19806.m45029("֨ۘ")) * 41;
                        i8 = ((iM45029 ^ i7) * (-1965)) ^ (-752913727);
                        i9 = 309276906;
                    } else {
                        iM45029 = (C19806.m45029("ۜ֫") + i6) * (-37);
                        i8 = ((iM45029 ^ i7) * (-19435)) ^ 1438835433;
                        i9 = -8915389;
                    }
                    break;
                default:
                    C2642.m8171();
                    if (C2477.m7593() < 0) {
                        iM45029 = (i6 - C19806.m45029("֨ۘ")) * 41;
                        i8 = ((iM45029 ^ i7) * (-1965)) ^ (-752913727);
                        i9 = 309276906;
                    } else {
                        iM45029 = (C19806.m45029("۫ۧ") ^ i7) * 33;
                        i8 = ((iM45029 ^ i6) * (-27227)) ^ (-2098914948);
                        i9 = -308320582;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final File m39258() {
        File filesDir = null;
        int i = -591697030;
        int i2 = C1461.f5957;
        int i3 = C10634.f36300;
        int iM45029 = C19806.m45029("᩺ۚ") ^ i3;
        int i4 = ((iM45029 ^ i2) * (-20495)) ^ (-988608614);
        int i5 = -432077933;
        while (true) {
            i = ((((i ^ i2) * (-8811)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -1720486827:
                case 217792685:
                    if (C1377.f5749) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("֡ۖ")) * 127;
                        i4 = ((iM45029 ^ i2) * (-28621)) ^ (-2008533182);
                        i5 = -389216171;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۘ֫") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-6163)) ^ 1275341732;
                        i5 = -774520459;
                    }
                    break;
                case -1688378730:
                case 1859249357:
                    ThreadFactoryC3888.m11300();
                    return null;
                case -1555854773:
                case -1114552182:
                    File parentFile = filesDir.getParentFile();
                    ViewGroupOnHierarchyChangeListenerC1916.m6243(parentFile);
                    return parentFile;
                case -1497151144:
                case 1908202810:
                    File dataDir = C1377.m4826().getDataDir();
                    ViewGroupOnHierarchyChangeListenerC1916.m6243(dataDir);
                    return dataDir;
                case -1070629490:
                case -591308218:
                    if (C1668.f6641 >= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۖܿ")) * (-45);
                        i4 = ((iM45029 ^ i2) * (-24949)) ^ (-290655790);
                        i5 = 672292145;
                    } else {
                        iM45029 = (C19806.m45029("᩺֨") + i2) * (-115);
                        i4 = ((iM45029 ^ i3) * 1723) ^ (-1894644185);
                        i5 = 1530899699;
                    }
                    break;
                case -1044560778:
                case 735202239:
                    if (C1937.f7317 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۚ᩻") ^ i2;
                        i4 = ((iM45029 ^ i3) * 28181) ^ 1646184803;
                        i5 = -1146953667;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۛܳ") + i2) * (-15);
                        i4 = ((iM45029 ^ i3) * (-14009)) ^ (-1630719843);
                        i5 = -1897729560;
                    }
                    break;
                case -780634629:
                case 304987310:
                    if (C3722.f13525 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۚ᩻") ^ i2;
                        i4 = ((iM45029 ^ i3) * 28181) ^ 1646184803;
                        i5 = -1146953667;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܺ۬") + i3) * 59;
                        i4 = ((iM45029 ^ i2) * (-27705)) ^ 933413439;
                        i5 = -673859292;
                    }
                    break;
                case -779165877:
                case 1397711584:
                    if (C3535.f13026 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۛܿ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-4931)) ^ 795562042;
                        i5 = 1485329298;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩵ᩳ") + i3) * 127;
                        i4 = ((iM45029 ^ i2) * (-22391)) ^ (-347413784);
                        i5 = 638360802;
                    }
                    break;
                case -670038587:
                case -481636368:
                    if (C1460.m5050() != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۘ֫") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-6163)) ^ 1275341732;
                        i5 = -774520459;
                    } else {
                        iM45029 = (C19806.m45029("ܿܿ") ^ i3) * 7;
                        i4 = ((iM45029 ^ i2) * 19819) ^ 100771975;
                        i5 = 170608200;
                    }
                    break;
                case -577082210:
                case 1558606403:
                    if (C2788.f10625 >= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۖܿ")) * (-45);
                        i4 = ((iM45029 ^ i2) * (-24949)) ^ (-290655790);
                        i5 = 672292145;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۟۫") ^ i2) * 95;
                        i4 = ((iM45029 ^ i3) * 29971) ^ (-1212869233);
                        i5 = 1855192346;
                    }
                    break;
                case -485382763:
                case 197849609:
                    if (C10634.f36300 >= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۖܿ")) * (-45);
                        i4 = ((iM45029 ^ i2) * (-24949)) ^ (-290655790);
                        i5 = 672292145;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۜۖ") + i2) * 39;
                        i4 = ((iM45029 ^ i3) * 25105) ^ (-297741003);
                        i5 = -1348610386;
                    }
                    break;
                case -473484417:
                case 1021675073:
                    C1977.m6356();
                    RunnableC1564.m5345();
                    iM45029 = ThreadFactoryC3888.m11306("ۘ֫") ^ i3;
                    i4 = ((iM45029 ^ i2) * (-6163)) ^ 1275341732;
                    i5 = -774520459;
                    break;
                case -410225603:
                case -197103909:
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۚ᩻") ^ i2;
                        i4 = ((iM45029 ^ i3) * 28181) ^ 1646184803;
                        i5 = -1146953667;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩺ۜ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 28923) ^ 172246090;
                        i5 = 1897175760;
                    }
                    break;
                case 145702261:
                case 695377105:
                    RunnableC3388.m10064();
                    if (C2249.f8050 < 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۚ᩻") ^ i2;
                        i4 = ((iM45029 ^ i3) * 28181) ^ 1646184803;
                        i5 = -1146953667;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۘ֫") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-6163)) ^ 1275341732;
                        i5 = -774520459;
                    }
                    break;
                case 517541930:
                case 1496892504:
                    if (Build.VERSION.SDK_INT >= 24) {
                        iM45029 = C19806.m45029("۟ۨ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-29515)) ^ 1085215031;
                        i5 = 432500442;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ۧۜ")) * 83;
                        i4 = ((iM45029 ^ i3) * (-5541)) ^ 2064867491;
                        i5 = -224647753;
                    }
                    break;
                case 695184101:
                case 1511475069:
                    filesDir = C0050.m939().getFilesDir();
                    if (C1875.f7103 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۛܿ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-4931)) ^ 795562042;
                        i5 = 1485329298;
                    } else {
                        iM45029 = C19806.m45029("ۙۗ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-13331)) ^ 112831958;
                        i5 = 2133547771;
                    }
                    break;
                case 1146387031:
                case 1948816754:
                    if (C1461.f5957 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۛܿ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-4931)) ^ 795562042;
                        i5 = 1485329298;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۚ᩻") ^ i2;
                        i4 = ((iM45029 ^ i3) * 28181) ^ 1646184803;
                        i5 = -1146953667;
                    }
                    break;
                default:
                    if (C2788.f10625 >= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۖܿ")) * (-45);
                        i4 = ((iM45029 ^ i2) * (-24949)) ^ (-290655790);
                        i5 = 672292145;
                    } else {
                        iM45029 = (i2 - C19806.m45029("ܳ᩵")) * (-127);
                        i4 = ((iM45029 ^ i3) * 12103) ^ (-363652322);
                        i5 = -1087293484;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final void m39284(View view) {
        int i = 0;
        int i2 = 490724076;
        int i3 = RunnableC3388.f12514;
        int i4 = C1460.f5948;
        int iM11306 = (ThreadFactoryC3888.m11306("᩷ᩴ") + i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
        int i5 = ((iM11306 ^ i4) * (-10961)) ^ (-355677177);
        int i6 = 810856462;
        while (true) {
            i2 = ((((i2 ^ i4) * 20287) >> 31) & i5) ^ (iM11306 ^ i6);
            switch (i2) {
                case -2113626732:
                case 1296746374:
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    if (!RunnableC1564.f6300) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۜܳ") ^ i4) * (-53);
                        i5 = ((iM11306 ^ i3) * 24781) ^ (-152959525);
                        i6 = -2112333175;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۜ᩵") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-17051)) ^ 39269277;
                        i6 = 564840022;
                    }
                    break;
                case -1997966446:
                case -277009346:
                    if (C1937.f7317 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۜܳ") ^ i4) * (-53);
                        i5 = ((iM11306 ^ i3) * 24781) ^ (-152959525);
                        i6 = -2112333175;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۘ᩹") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-31789)) ^ (-1028124617);
                        i6 = -218802252;
                    }
                    break;
                case -1933479516:
                case 610896170:
                    m39289(i, view);
                    iM11306 = (C19806.m45029("۟۬") ^ i3) * 55;
                    i5 = ((iM11306 ^ i4) * (-17673)) ^ (-1102473208);
                    i6 = -473166066;
                    break;
                case -1884015406:
                case -359297885:
                    if (view != null) {
                        iM11306 = C19806.m45029("᩺ܰ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 11287) ^ (-1686894234);
                        i6 = -1870969546;
                    } else {
                        iM11306 = (C19806.m45029("۟۬") ^ i3) * 55;
                        i5 = ((iM11306 ^ i4) * (-17673)) ^ (-1102473208);
                        i6 = -473166066;
                    }
                    break;
                case -1834538603:
                case -1488730541:
                    C0278.m1789();
                    if (C2788.f10625 >= 0) {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("᩵᩺")) * 47;
                        i5 = ((iM11306 ^ i3) * (-7427)) ^ 439569714;
                        i6 = 1568899467;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۜܳ") ^ i4) * (-53);
                        i5 = ((iM11306 ^ i3) * 24781) ^ (-152959525);
                        i6 = -2112333175;
                    }
                    break;
                case -1325877187:
                case -908302235:
                    if (C1668.f6641 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۜܳ") ^ i4) * (-53);
                        i5 = ((iM11306 ^ i3) * 24781) ^ (-152959525);
                        i6 = -2112333175;
                    } else {
                        iM11306 = C19806.m45029("ܰۨ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 18415) ^ 1525564563;
                        i6 = 1904031801;
                    }
                    break;
                case -1309975043:
                case 1162227554:
                    C0671.m3008();
                    C2124.m6673();
                    break;
                case -1256046143:
                case -1029268726:
                    if (C1668.f6641 >= 0) {
                        iM11306 = (i3 - C19806.m45029("ܽ᩻")) * 119;
                        i5 = ((iM11306 ^ i4) * (-20009)) ^ (-2068356495);
                        i6 = -692583228;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("᩵᩺")) * 47;
                        i5 = ((iM11306 ^ i3) * (-7427)) ^ 439569714;
                        i6 = 1568899467;
                    }
                    break;
                case -902108657:
                case 2109272638:
                    if (C2124.f7782 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۜܳ") ^ i4) * (-53);
                        i5 = ((iM11306 ^ i3) * 24781) ^ (-152959525);
                        i6 = -2112333175;
                    } else {
                        iM11306 = C19806.m45029("ܳܽ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-17759)) ^ 959986627;
                        i6 = -810034728;
                    }
                    break;
                case -867332785:
                case -758838629:
                    if (C1937.m6279() >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۜ᩵") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-17051)) ^ 39269277;
                        i6 = 564840022;
                    } else {
                        iM11306 = C19806.m45029("ۜ᩹") ^ i4;
                        i5 = ((iM11306 ^ i3) * 1577) ^ 2002524988;
                        i6 = -843740150;
                    }
                    break;
                case -324352247:
                case 1012550062:
                    if (C0817.m3399()) {
                        iM11306 = (C19806.m45029("ۛۤ") + i3) * (-89);
                        i5 = ((iM11306 ^ i4) * 9657) ^ (-632216652);
                        i6 = 52704414;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۜ᩵") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-17051)) ^ 39269277;
                        i6 = 564840022;
                    }
                    break;
                case -190510195:
                case 1371000333:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM11306 = (i3 - C19806.m45029("ܽ᩻")) * 119;
                        i5 = ((iM11306 ^ i4) * (-20009)) ^ (-2068356495);
                        i6 = -692583228;
                    } else {
                        iM11306 = (C19806.m45029("֫ܽ") ^ i4) * (-75);
                        i5 = ((iM11306 ^ i3) * (-29671)) ^ (-1165426668);
                        i6 = 287617722;
                    }
                    break;
                case 298129552:
                case 435393536:
                    break;
                case 310090118:
                case 479539596:
                    if (C0526.f2219) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۜܳ") ^ i4) * (-53);
                        i5 = ((iM11306 ^ i3) * 24781) ^ (-152959525);
                        i6 = -2112333175;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۧ᩹") ^ i4;
                        i5 = ((iM11306 ^ i3) * 8771) ^ (-2007379351);
                        i6 = 1424936441;
                    }
                    break;
                case 698607265:
                case 1270789033:
                    if (C0629.f2722 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۜܳ") ^ i4) * (-53);
                        i5 = ((iM11306 ^ i3) * 24781) ^ (-152959525);
                        i6 = -2112333175;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܺܿ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-20387)) ^ (-72754515);
                        i6 = 774670588;
                    }
                    break;
                case 961554661:
                case 1828014250:
                    if (AbstractC0464.f2088 <= 0) {
                        iM11306 = (i4 - C19806.m45029("ܿ֫")) * (-97);
                        i5 = ((iM11306 ^ i3) * (-16599)) ^ (-1160781286);
                        i6 = 653056279;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֡ᩳ") ^ i4) * (-113);
                        i5 = ((iM11306 ^ i3) * 1343) ^ (-1449102605);
                        i6 = 1984851414;
                    }
                    break;
                case 1320219129:
                case 1953430390:
                    i = 0;
                    if (C1025.f4800 >= 0) {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("᩵᩺")) * 47;
                        i5 = ((iM11306 ^ i3) * (-7427)) ^ 439569714;
                        i6 = 1568899467;
                    } else {
                        iM11306 = C19806.m45029("ۨ᩸") ^ i3;
                        i5 = ((iM11306 ^ i4) * 16303) ^ 512674883;
                        i6 = 1380813920;
                    }
                    break;
                default:
                    C2477.m7593();
                    RunnableC1895.m6170();
                    iM11306 = (ThreadFactoryC3888.m11306("ۜܳ") ^ i4) * (-53);
                    i5 = ((iM11306 ^ i3) * 24781) ^ (-152959525);
                    i6 = -2112333175;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final File m39282() {
        File cacheDir = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        short[] sArr2 = null;
        int i5 = 0;
        int i6 = -1739115362;
        int i7 = C2788.f10625;
        int i8 = RunnableC3388.f12514;
        int iM45029 = C19806.m45029("ۘ᩵") ^ i8;
        int i9 = ((iM45029 ^ i7) * (-3715)) ^ 738398920;
        int i10 = -375287873;
        while (true) {
            i6 = ((((i6 ^ i7) * 22005) >> 31) & i9) ^ (iM45029 ^ i10);
            switch (i6) {
                case -1881521413:
                case -410577200:
                    C2124.m6673();
                    if (C1025.f4800 < 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۨ֫") ^ i8;
                        i9 = ((iM45029 ^ i7) * 10251) ^ (-1157256302);
                        i10 = 1249069475;
                    } else {
                        iM45029 = C19806.m45029("ۖܳ") ^ i7;
                        i9 = ((iM45029 ^ i8) * (-4953)) ^ (-1676313579);
                        i10 = 2071911261;
                    }
                    break;
                case -1854623186:
                case -922221236:
                    i5 = 347;
                    if (C1977.f7413 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۨ֫") ^ i8;
                        i9 = ((iM45029 ^ i7) * 10251) ^ (-1157256302);
                        i10 = 1249069475;
                    } else {
                        iM45029 = (C19806.m45029("ܰۗ") ^ i8) * (-103);
                        i9 = ((iM45029 ^ i7) * 28695) ^ 2048467586;
                        i10 = 1911312010;
                    }
                    break;
                case -1686048750:
                case 2031988493:
                    i = s * 29892;
                    if (C1148.f5161 <= 0) {
                        iM45029 = C19806.m45029("᩷ۛ") ^ i7;
                        i9 = ((iM45029 ^ i8) * 5497) ^ (-298142091);
                        i10 = -157179845;
                    } else {
                        iM45029 = C19806.m45029("ᩴ᩷") ^ i7;
                        i9 = ((iM45029 ^ i8) * 7469) ^ 916544840;
                        i10 = -1183864685;
                    }
                    break;
                case -1681841767:
                case 592212393:
                    C3535.m10431();
                    if (C3535.m10431() <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳۛ") ^ i8) * 41;
                        i9 = ((iM45029 ^ i7) * (-20595)) ^ (-1338339986);
                        i10 = -1450911073;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۛۢ") ^ i7;
                        i9 = ((iM45029 ^ i8) * (-26251)) ^ (-742608207);
                        i10 = -1110563594;
                    }
                    break;
                case -1593054238:
                case 1760110736:
                    if (RunnableC1564.f6300) {
                        iM45029 = ThreadFactoryC3888.m11306("ۨ֫") ^ i8;
                        i9 = ((iM45029 ^ i7) * 10251) ^ (-1157256302);
                        i10 = 1249069475;
                    } else {
                        iM45029 = (i7 - ThreadFactoryC3888.m11306("᩺᩶")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i9 = ((iM45029 ^ i8) * 32765) ^ (-1872545851);
                        i10 = 1181985380;
                    }
                    break;
                case -1382901632:
                case 611844815:
                    if ((i2 + i3) - i < 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܿ֫") ^ i7;
                        i9 = ((iM45029 ^ i8) * (-11533)) ^ (-1121960730);
                        i10 = -1468447800;
                    } else {
                        iM45029 = C19806.m45029("۠֡") ^ i8;
                        i9 = ((iM45029 ^ i7) * 15879) ^ 571295897;
                        i10 = 569371557;
                    }
                    break;
                case -1366234474:
                case -751571665:
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    RunnableC3388.m10064();
                    return null;
                case -1074806565:
                case 2072998874:
                    i4 = 28512;
                    iM45029 = C19806.m45029("᩹ۙ") ^ i8;
                    i9 = ((iM45029 ^ i7) * 14269) ^ 1921229015;
                    i10 = -427986635;
                    break;
                case -628075299:
                case -136584193:
                    sArr2 = f53609;
                    if (C0278.m1789() <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳۛ") ^ i8) * 41;
                        i9 = ((iM45029 ^ i7) * (-20595)) ^ (-1338339986);
                        i10 = -1450911073;
                    } else {
                        iM45029 = C19806.m45029("ۖۢ") ^ i7;
                        i9 = ((iM45029 ^ i8) * (-12399)) ^ 391622167;
                        i10 = 1150976564;
                    }
                    break;
                case -511982126:
                case 410272293:
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۨ֫") ^ i8;
                        i9 = ((iM45029 ^ i7) * 10251) ^ (-1157256302);
                        i10 = 1249069475;
                    } else {
                        iM45029 = (i8 - ThreadFactoryC3888.m11306("֫۟")) * (-75);
                        i9 = ((iM45029 ^ i7) * 22341) ^ 1072649671;
                        i10 = -586710281;
                    }
                    break;
                case -487925845:
                case 2107068242:
                    i4 = 49121;
                    iM45029 = C19806.m45029("᩹ۙ") ^ i8;
                    i9 = ((iM45029 ^ i7) * 14269) ^ 1921229015;
                    i10 = -427986635;
                    break;
                case -114886122:
                case 2027294585:
                    if (C2332.f8260) {
                        iM45029 = (i8 - ThreadFactoryC3888.m11306("ܿ᩹")) * 21;
                        i9 = ((iM45029 ^ i7) * 4835) ^ 1233834698;
                        i10 = 344260187;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۛۢ") ^ i7;
                        i9 = ((iM45029 ^ i8) * (-26251)) ^ (-742608207);
                        i10 = -1110563594;
                    }
                    break;
                case 182337752:
                case 2021571338:
                    cacheDir = C0050.m939().getCacheDir();
                    if (C0797.m3359()) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۧ᩻") + i8) * 63;
                        i9 = ((iM45029 ^ i7) * (-28035)) ^ (-1795431091);
                        i10 = 363678066;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳۛ") ^ i8) * 41;
                        i9 = ((iM45029 ^ i7) * (-20595)) ^ (-1338339986);
                        i10 = -1450911073;
                    }
                    break;
                case 471573714:
                case 478128786:
                    C1937.m6286(cacheDir, C0962.m3747(sArr2, i5, 16, i4));
                    return cacheDir;
                case 524583824:
                case 1746933063:
                    C1977.m6356();
                    C2477.m7593();
                    iM45029 = C19806.m45029("ۖܳ") ^ i7;
                    i9 = ((iM45029 ^ i8) * (-4953)) ^ (-1676313579);
                    i10 = 2071911261;
                    break;
                case 1223052913:
                case 2007077021:
                    sArr = f53609;
                    c = 346;
                    if (CallableC1627.f6528) {
                        iM45029 = C19806.m45029("ܺܿ") ^ i7;
                        i9 = ((iM45029 ^ i8) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION) ^ 902411635;
                        i10 = -1388838166;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳۛ") ^ i8) * 41;
                        i9 = ((iM45029 ^ i7) * (-20595)) ^ (-1338339986);
                        i10 = -1450911073;
                    }
                    break;
                case 1513038254:
                case 2087257802:
                    s = sArr[c];
                    if (C1937.m6279() >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳۛ") ^ i8) * 41;
                        i9 = ((iM45029 ^ i7) * (-20595)) ^ (-1338339986);
                        i10 = -1450911073;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩻۟") ^ i8;
                        i9 = ((iM45029 ^ i7) * (-26403)) ^ (-722226618);
                        i10 = 92486249;
                    }
                    break;
                case 1632685484:
                case 1820462278:
                    i2 = s * s;
                    i3 = 223382916;
                    if (C1377.f5749) {
                        iM45029 = ThreadFactoryC3888.m11306("᩶᩶") ^ i7;
                        i9 = ((iM45029 ^ i8) * (-9503)) ^ 151759302;
                        i10 = 2021604502;
                    } else {
                        iM45029 = C19806.m45029("ۖܳ") ^ i7;
                        i9 = ((iM45029 ^ i8) * (-4953)) ^ (-1676313579);
                        i10 = 2071911261;
                    }
                    break;
                default:
                    CallableC1627.m5507();
                    if (!C1419.m4973()) {
                        iM45029 = C19806.m45029("ۖܳ") ^ i7;
                        i9 = ((iM45029 ^ i8) * (-4953)) ^ (-1676313579);
                        i10 = 2071911261;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۛۢ") ^ i7;
                        i9 = ((iM45029 ^ i8) * (-26251)) ^ (-742608207);
                        i10 = -1110563594;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x006e  */
    /* JADX WARN: Code duplicated, block: B:59:0x01f6 A[PHI: r4 r5 r11 r16
      0x01f6: PHI (r4v4 short) = (r4v3 short), (r4v2 short), (r4v2 short), (r4v2 short), (r4v2 short) binds: [B:58:0x01f4, B:54:0x01d1, B:27:0x00bd, B:19:0x0085, B:13:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x01f6: PHI (r5v4 short) = (r5v2 short), (r5v3 short), (r5v2 short), (r5v2 short), (r5v2 short) binds: [B:58:0x01f4, B:54:0x01d1, B:27:0x00bd, B:19:0x0085, B:13:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x01f6: PHI (r11v4 short[]) = (r11v2 short[]), (r11v2 short[]), (r11v3 short[]), (r11v2 short[]), (r11v2 short[]) binds: [B:58:0x01f4, B:54:0x01d1, B:27:0x00bd, B:19:0x0085, B:13:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x01f6: PHI (r16v18 int) = (r16v4 int), (r16v5 int), (r16v14 int), (r16v16 int), (r16v19 int) binds: [B:58:0x01f4, B:54:0x01d1, B:27:0x00bd, B:19:0x0085, B:13:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0228 A[PHI: r1 r12 r16
      0x0228: PHI (r1v5 android.content.pm.ApplicationInfo) = 
      (r1v2 android.content.pm.ApplicationInfo)
      (r1v3 android.content.pm.ApplicationInfo)
      (r1v2 android.content.pm.ApplicationInfo)
      (r1v2 android.content.pm.ApplicationInfo)
     binds: [B:62:0x0226, B:31:0x00e2, B:23:0x009e, B:10:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x0228: PHI (r12v5 int) = (r12v2 int), (r12v2 int), (r12v3 int), (r12v2 int) binds: [B:62:0x0226, B:31:0x00e2, B:23:0x009e, B:10:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x0228: PHI (r16v24 int) = (r16v3 int), (r16v13 int), (r16v15 int), (r16v25 int) binds: [B:62:0x0226, B:31:0x00e2, B:23:0x009e, B:10:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x025e A[PHI: r2 r3 r7 r8 r9 r16
      0x025e: PHI (r2v4 short[]) = (r2v3 short[]), (r2v2 short[]), (r2v2 short[]), (r2v2 short[]) binds: [B:66:0x025c, B:46:0x017c, B:42:0x015a, B:14:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x025e: PHI (r3v4 char) = (r3v3 char), (r3v2 char), (r3v2 char), (r3v2 char) binds: [B:66:0x025c, B:46:0x017c, B:42:0x015a, B:14:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x025e: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int) binds: [B:66:0x025c, B:46:0x017c, B:42:0x015a, B:14:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x025e: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:66:0x025c, B:46:0x017c, B:42:0x015a, B:14:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x025e: PHI (r9v4 int) = (r9v2 int), (r9v2 int), (r9v3 int), (r9v2 int) binds: [B:66:0x025c, B:46:0x017c, B:42:0x015a, B:14:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x025e: PHI (r16v17 int) = (r16v2 int), (r16v7 int), (r16v8 int), (r16v20 int) binds: [B:66:0x025c, B:46:0x017c, B:42:0x015a, B:14:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final ApplicationInfo m39261() {
        int iM11306;
        int i;
        int i2;
        int i3 = RunnableC1606.f6488;
        int i4 = C0629.f2722;
        int iM45029 = (C19806.m45029("ܶܰ") ^ i4) * (-87);
        int i5 = ((iM45029 ^ i3) * 30939) ^ (-2130830146);
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM45029 ^ 186517173;
        ApplicationInfo applicationInfo = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = -1431707699;
        while (true) {
            int i14 = i6 ^ (i5 & (((i13 ^ i3) * 8343) >> 31));
            switch (i14) {
                case -2068799268:
                case 639714358:
                    i14 = i14;
                    applicationInfo = C0050.m939().getApplicationInfo();
                    if (C2871.f10837 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩳᩴ") + i3) * 47;
                        i = ((iM11306 ^ i4) * (-28659)) ^ (-980978113);
                        i2 = -67004701;
                    } else {
                        iM11306 = (C19806.m45029("۬ܽ") + i3) * 29;
                        i = ((iM11306 ^ i4) * 17327) ^ 456355294;
                        i2 = 1993439916;
                    }
                    int i15 = i14;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    i13 = i15;
                    break;
                case -1653817913:
                case -116417960:
                    RunnableC1895.m6170();
                    if (C2332.m7079() <= 0) {
                        i14 = i14;
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("᩻ܽ")) * 39;
                        i = ((iM11306 ^ i4) * (-24141)) ^ (-1022890480);
                        i2 = 413838798;
                    } else {
                        iM11306 = C19806.m45029("ܽۨ") ^ i4;
                        i14 = i14;
                        i = ((iM11306 ^ i3) * 399) ^ 1813544975;
                        i2 = -472383430;
                    }
                    int i16 = i14;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    i13 = i16;
                    break;
                case -1552363588:
                case -180730988:
                    if (C0216.m1591() <= 0) {
                        i14 = i14;
                        iM11306 = (C19806.m45029("۠ܺ") + i3) * (-101);
                        i = ((iM11306 ^ i4) * 5267) ^ (-1255031239);
                        i2 = -1500588258;
                        int i17 = i14;
                        i6 = iM11306 ^ i2;
                        i5 = i;
                        i13 = i17;
                    }
                    i14 = i14;
                    iM11306 = (i3 - ThreadFactoryC3888.m11306("᩻ܽ")) * 39;
                    i = ((iM11306 ^ i4) * (-24141)) ^ (-1022890480);
                    i2 = 413838798;
                    int i18 = i14;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    i13 = i18;
                    break;
                case -1380266158:
                case 1188370594:
                    i14 = i14;
                    int i19 = s + s2;
                    i7 = i19 * i19;
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM11306 = C19806.m45029("᩸ۜ") ^ i4;
                        i = ((iM11306 ^ i3) * (-19613)) ^ 1145937894;
                        i2 = 1561647241;
                    } else {
                        iM11306 = C19806.m45029("᩶۟") ^ i4;
                        i = ((iM11306 ^ i3) * 32039) ^ (-979826087);
                        i2 = -246829134;
                    }
                    int i110 = i14;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    i13 = i110;
                    break;
                case -1251151815:
                case 1952723774:
                    i14 = i14;
                    s2 = 2066;
                    if (C19806.f63586) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("᩻ܽ")) * 39;
                        i = ((iM11306 ^ i4) * (-24141)) ^ (-1022890480);
                        i2 = 413838798;
                    } else {
                        iM11306 = (i3 - C19806.m45029("᩸ۖ")) * 21;
                        i = ((iM11306 ^ i4) * (-14703)) ^ (-570563882);
                        i2 = -358229600;
                    }
                    int i111 = i14;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    i13 = i111;
                    break;
                case -1220362886:
                case -732917166:
                    i14 = i14;
                    if (C0629.f2722 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩳᩴ") + i3) * 47;
                        i = ((iM11306 ^ i4) * (-28659)) ^ (-980978113);
                        i2 = -67004701;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩴۙ") ^ i4) * 27;
                        i = ((iM11306 ^ i3) * (-24943)) ^ 53858034;
                        i2 = 1699801563;
                    }
                    int i112 = i14;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    i13 = i112;
                    break;
                case -891979243:
                case -500874145:
                    i14 = i14;
                    i8 = s * s;
                    i9 = 4268356;
                    if (C0216.f1393 != 0) {
                        iM11306 = (C19806.m45029("۠ܺ") + i3) * (-101);
                        i = ((iM11306 ^ i4) * 5267) ^ (-1255031239);
                        i2 = -1500588258;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩹ۢ") + i3) * 65;
                        i = ((iM11306 ^ i4) * 26249) ^ 1344942340;
                        i2 = -1641775025;
                    }
                    int i113 = i14;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    i13 = i113;
                    break;
                case -842239292:
                case 222436561:
                    i11 = 39173;
                    iM11306 = C19806.m45029("ܳ۠") ^ i3;
                    i = ((iM11306 ^ i4) * (-4191)) ^ 200420699;
                    i2 = 1801949193;
                    int i114 = i14;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    i13 = i114;
                    break;
                case -694925262:
                case 1854670757:
                    i14 = i14;
                    if ((i10 + i10) - i7 < 0) {
                        iM11306 = C19806.m45029("֡ۗ") ^ i4;
                        i = ((iM11306 ^ i3) * 22045) ^ 1839809911;
                        i2 = 506296643;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۚ᩸") ^ i3;
                        i = ((iM11306 ^ i4) * 14349) ^ (-1226437102);
                        i2 = -405603704;
                    }
                    int i115 = i14;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    i13 = i115;
                    break;
                case -256428107:
                case 2022211875:
                    i14 = i14;
                    C1937.m6279();
                    iM11306 = (i3 - ThreadFactoryC3888.m11306("᩻ܽ")) * 39;
                    i = ((iM11306 ^ i4) * (-24141)) ^ (-1022890480);
                    i2 = 413838798;
                    int i116 = i14;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    i13 = i116;
                    break;
                case -156398266:
                case 134595214:
                    i11 = 49991;
                    iM11306 = C19806.m45029("ܳ۠") ^ i3;
                    i = ((iM11306 ^ i4) * (-4191)) ^ 200420699;
                    i2 = 1801949193;
                    int i117 = i14;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    i13 = i117;
                    break;
                case 437369145:
                case 971026877:
                    C7105.m18988(applicationInfo, C3722.m10901(sArr2, i12, 23, i11));
                    return applicationInfo;
                case 891814950:
                case 1213281301:
                    i14 = i14;
                    i12 = 25;
                    if (C0526.m2437() >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩳᩴ") + i3) * 47;
                        i = ((iM11306 ^ i4) * (-28659)) ^ (-980978113);
                        i2 = -67004701;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۫ܶ") ^ i4;
                        i = ((iM11306 ^ i3) * 28537) ^ (-1185596677);
                        i2 = 714063058;
                    }
                    int i118 = i14;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    i13 = i118;
                    break;
                case 1014029057:
                case 1764513952:
                    i14 = i14;
                    s = sArr[c];
                    if (C2332.m7079() <= 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("᩻ܽ")) * 39;
                        i = ((iM11306 ^ i4) * (-24141)) ^ (-1022890480);
                        i2 = 413838798;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۗ᩹") ^ i4;
                        i = ((iM11306 ^ i3) * (-7479)) ^ 15000329;
                        i2 = 1728777592;
                    }
                    int i119 = i14;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    i13 = i119;
                    break;
                case 1054983576:
                case 1566379401:
                    i14 = i14;
                    sArr2 = f53609;
                    if (C0526.f2219) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("᩻ܽ")) * 39;
                        i = ((iM11306 ^ i4) * (-24141)) ^ (-1022890480);
                        i2 = 413838798;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩹ۗ") ^ i4;
                        i = ((iM11306 ^ i3) * (-20639)) ^ (-100700143);
                        i2 = 642051996;
                    }
                    int i1110 = i14;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    i13 = i1110;
                    break;
                case 1189389799:
                case 2025532142:
                    i14 = i14;
                    i10 = i8 + i9;
                    if (C1025.f4800 >= 0) {
                        iM11306 = (C19806.m45029("۠ܺ") + i3) * (-101);
                        i = ((iM11306 ^ i4) * 5267) ^ (-1255031239);
                        i2 = -1500588258;
                    } else {
                        iM11306 = C19806.m45029("᩵۟") ^ i4;
                        i = ((iM11306 ^ i3) * 8869) ^ 2060649657;
                        i2 = -973560836;
                    }
                    int i1111 = i14;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    i13 = i1111;
                    break;
                case 1316500265:
                case 1625162151:
                    if (C1398.f5802 > 0) {
                        iM11306 = C19806.m45029("ܽۨ") ^ i4;
                        i14 = i14;
                        i = ((iM11306 ^ i3) * 399) ^ 1813544975;
                        i2 = -472383430;
                    } else {
                        i14 = i14;
                        iM11306 = (ThreadFactoryC3888.m11306("ᩳᩴ") + i3) * 47;
                        i = ((iM11306 ^ i4) * (-28659)) ^ (-980978113);
                        i2 = -67004701;
                    }
                    int i1112 = i14;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    i13 = i1112;
                    break;
                case 1686454359:
                case 1848278427:
                    i14 = i14;
                    sArr = f53609;
                    c = 24;
                    if (C0526.f2219) {
                        iM11306 = (C19806.m45029("۠ܺ") + i3) * (-101);
                        i = ((iM11306 ^ i4) * 5267) ^ (-1255031239);
                        i2 = -1500588258;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("֨᩵")) * (-117);
                        i = ((iM11306 ^ i4) * (-24305)) ^ 1342519483;
                        i2 = -705317757;
                    }
                    int i1113 = i14;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    i13 = i1113;
                    break;
                default:
                    C7105.m18985();
                    C0817.m3399();
                    return null;
            }
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final String m39293() {
        String packageName = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        short s2 = 0;
        int i3 = 0;
        short[] sArr2 = null;
        int i4 = 0;
        int i5 = -1652109883;
        int i6 = C1398.f5802;
        int i7 = C2642.f10294;
        int iM45029 = (C19806.m45029("ܳۡ") ^ i6) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
        int i8 = ((iM45029 ^ i7) * (-23527)) ^ (-1159018150);
        int i9 = 1784946162;
        while (true) {
            i5 = ((((i5 ^ i7) * 8605) >> 31) & i8) ^ (iM45029 ^ i9);
            switch (i5) {
                case -2052879114:
                case 415178914:
                    C1977.m6356();
                    C7105.m18985();
                    iM45029 = (C19806.m45029("۫ۢ") + i6) * (-35);
                    i8 = ((iM45029 ^ i7) * 31385) ^ 1628284995;
                    i9 = 643023118;
                    break;
                case -1856322904:
                case -716100353:
                    if (C1461.f5957 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("֨ᩳ") + i6) * 53;
                        i8 = ((iM45029 ^ i7) * 18353) ^ (-366413530);
                        i9 = 941932232;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۠ܶ") ^ i7) * (-55);
                        i8 = ((iM45029 ^ i6) * (-32547)) ^ (-1471154671);
                        i9 = 797253225;
                    }
                    break;
                case -1846901243:
                case -289535278:
                    i3 = 28797;
                    iM45029 = C19806.m45029("֫ۖ") ^ i6;
                    i8 = ((iM45029 ^ i7) * (-30887)) ^ 333879331;
                    i9 = 938158252;
                    break;
                case -1677760396:
                case 1059350050:
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM45029 = (C19806.m45029("۫ۡ") + i7) * (-25);
                        i8 = ((iM45029 ^ i6) * 22709) ^ (-1065154131);
                        i9 = -124833964;
                    } else {
                        iM45029 = (i6 - C19806.m45029("᩺ۨ")) * (-117);
                        i8 = ((iM45029 ^ i7) * (-27379)) ^ (-1619677321);
                        i9 = 2018200552;
                    }
                    break;
                case -1622813630:
                case -129727487:
                    i2 = i * i;
                    s2 = 62844;
                    if (C1377.f5749) {
                        iM45029 = C19806.m45029("᩻ᩳ") ^ i6;
                        i8 = ((iM45029 ^ i7) * (-2595)) ^ 2069185009;
                        i9 = 502191915;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֫᩹") ^ i7;
                        i8 = ((iM45029 ^ i6) * (-12873)) ^ 361388647;
                        i9 = 524448968;
                    }
                    break;
                case -1580633214:
                case -1168630338:
                    sArr2 = f53609;
                    if (C2332.f8260) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܰܽ") ^ i7) * 77;
                        i8 = ((iM45029 ^ i6) * (-19409)) ^ (-2000708500);
                        i9 = -854711642;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֨ᩳ") + i6) * 53;
                        i8 = ((iM45029 ^ i7) * 18353) ^ (-366413530);
                        i9 = 941932232;
                    }
                    break;
                case -1447160531:
                case -81548609:
                    i3 = 49454;
                    iM45029 = C19806.m45029("֫ۖ") ^ i6;
                    i8 = ((iM45029 ^ i7) * (-30887)) ^ 333879331;
                    i9 = 938158252;
                    break;
                case -1373161716:
                case 1986957438:
                    C7105.m18988(packageName, C3577.m10571(sArr2, i4, 19, i3));
                    return packageName;
                case -1094218603:
                case 486452186:
                    packageName = C0050.m939().getPackageName();
                    if (C2788.f10625 >= 0) {
                        iM45029 = (C19806.m45029("۫ۢ") + i6) * (-35);
                        i8 = ((iM45029 ^ i7) * 31385) ^ 1628284995;
                        i9 = 643023118;
                    } else {
                        iM45029 = C19806.m45029("ۤۢ") ^ i6;
                        i8 = ((iM45029 ^ i7) * (-18091)) ^ (-204483759);
                        i9 = -1857162179;
                    }
                    break;
                case -1047006375:
                case 1940872234:
                    sArr = f53609;
                    c = 539;
                    if (C0278.m1789() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֨֨") ^ i7;
                        i8 = ((iM45029 ^ i6) * 617) ^ 830916043;
                        i9 = -1707588660;
                    } else {
                        iM45029 = (C19806.m45029("۬ܳ") ^ i6) * 61;
                        i8 = ((iM45029 ^ i7) * (-5421)) ^ (-982949265);
                        i9 = -714958982;
                    }
                    break;
                case -743880032:
                case 1016108852:
                    RunnableC1564.m5345();
                    if (C1668.f6641 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֫᩹") ^ i7;
                        i8 = ((iM45029 ^ i6) * (-12873)) ^ 361388647;
                        i9 = 524448968;
                    } else {
                        iM45029 = (i6 - C19806.m45029("᩺ۨ")) * (-117);
                        i8 = ((iM45029 ^ i7) * (-27379)) ^ (-1619677321);
                        i9 = 2018200552;
                    }
                    break;
                case -685309959:
                case 436871333:
                    if (C3577.m10565()) {
                        iM45029 = C19806.m45029("ܶܺ") ^ i6;
                        i8 = ((iM45029 ^ i7) * (-12199)) ^ 557005917;
                        i9 = 338801947;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֫᩹") ^ i7;
                        i8 = ((iM45029 ^ i6) * (-12873)) ^ 361388647;
                        i9 = 524448968;
                    }
                    break;
                case -676049176:
                case 937744663:
                    i = s + 15711;
                    if (C1189.f5284 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("֨ᩳ") + i6) * 53;
                        i8 = ((iM45029 ^ i7) * 18353) ^ (-366413530);
                        i9 = 941932232;
                    } else {
                        iM45029 = (i6 - ThreadFactoryC3888.m11306("ۤ۠")) * 49;
                        i8 = ((iM45029 ^ i7) * 20379) ^ 583008874;
                        i9 = -962484816;
                    }
                    break;
                case 14271708:
                case 946327604:
                    if (C1461.f5957 > 0) {
                        iM45029 = (i6 - C19806.m45029("᩺ۨ")) * (-117);
                        i8 = ((iM45029 ^ i7) * (-27379)) ^ (-1619677321);
                        i9 = 2018200552;
                    } else {
                        iM45029 = (C19806.m45029("۫ۢ") + i6) * (-35);
                        i8 = ((iM45029 ^ i7) * 31385) ^ 1628284995;
                        i9 = 643023118;
                    }
                    break;
                case 52385852:
                case 922267022:
                    if ((s * s2) - i2 > 0) {
                        iM45029 = C19806.m45029("᩷ᩳ") ^ i7;
                        i8 = ((iM45029 ^ i6) * 13455) ^ (-1402952313);
                        i9 = -457466279;
                    } else {
                        iM45029 = C19806.m45029("ۘ᩵") ^ i7;
                        i8 = ((iM45029 ^ i6) * (-20245)) ^ (-740986551);
                        i9 = -1905192286;
                    }
                    break;
                case 288644516:
                case 1544806456:
                    s = sArr[c];
                    if (C1377.f5749) {
                        iM45029 = (i7 - C19806.m45029("᩷ۙ")) * 77;
                        i8 = ((iM45029 ^ i6) * (-27215)) ^ (-1368992726);
                        i9 = 1467924080;
                    } else {
                        iM45029 = (C19806.m45029("۫ۢ") + i6) * (-35);
                        i8 = ((iM45029 ^ i7) * 31385) ^ 1628284995;
                        i9 = 643023118;
                    }
                    break;
                case 679727629:
                case 1089609769:
                    if (C2642.f10294 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֨֨") ^ i7;
                        i8 = ((iM45029 ^ i6) * 617) ^ 830916043;
                        i9 = -1707588660;
                    } else {
                        iM45029 = (C19806.m45029("۫ۢ") + i6) * (-35);
                        i8 = ((iM45029 ^ i7) * 31385) ^ 1628284995;
                        i9 = 643023118;
                    }
                    break;
                case 825066567:
                case 1034459786:
                    C2477.m7593();
                    C1668.m5583();
                    return null;
                default:
                    i4 = 540;
                    if (C0050.f912 <= 0) {
                        iM45029 = (C19806.m45029("۫ۢ") + i6) * (-35);
                        i8 = ((iM45029 ^ i7) * 31385) ^ 1628284995;
                        i9 = 643023118;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۠ۧ") + i7) * 75;
                        i8 = ((iM45029 ^ i6) * (-14881)) ^ (-1983376584);
                        i9 = 883152245;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x011b A[PHI: r5 r6 r7 r13 r14
      0x011b: PHI (r5v4 android.content.pm.PackageInfo) = 
      (r5v2 android.content.pm.PackageInfo)
      (r5v3 android.content.pm.PackageInfo)
      (r5v2 android.content.pm.PackageInfo)
      (r5v2 android.content.pm.PackageInfo)
     binds: [B:36:0x0119, B:23:0x0099, B:12:0x006c, B:9:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x011b: PHI (r6v4 short[]) = (r6v2 short[]), (r6v3 short[]), (r6v2 short[]), (r6v2 short[]) binds: [B:36:0x0119, B:23:0x0099, B:12:0x006c, B:9:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x011b: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int) binds: [B:36:0x0119, B:23:0x0099, B:12:0x006c, B:9:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x011b: PHI (r13v4 short[]) = (r13v3 short[]), (r13v2 short[]), (r13v2 short[]), (r13v2 short[]) binds: [B:36:0x0119, B:23:0x0099, B:12:0x006c, B:9:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x011b: PHI (r14v4 int) = (r14v3 int), (r14v2 int), (r14v2 int), (r14v2 int) binds: [B:36:0x0119, B:23:0x0099, B:12:0x006c, B:9:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x01ce A[PHI: r10 r11
      0x01ce: PHI (r10v4 int) = (r10v3 int), (r10v2 int), (r10v2 int) binds: [B:51:0x01cc, B:47:0x01aa, B:15:0x0077] A[DONT_GENERATE, DONT_INLINE]
      0x01ce: PHI (r11v4 short) = (r11v2 short), (r11v3 short), (r11v2 short) binds: [B:51:0x01cc, B:47:0x01aa, B:15:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x0204 A[PHI: r3 r4 r8 r22
      0x0204: PHI (r3v3 android.content.pm.PackageManager) = (r3v2 android.content.pm.PackageManager), (r3v4 android.content.pm.PackageManager) binds: [B:55:0x0202, B:27:0x00bd] A[DONT_GENERATE, DONT_INLINE]
      0x0204: PHI (r4v3 int) = (r4v2 int), (r4v4 int) binds: [B:55:0x0202, B:27:0x00bd] A[DONT_GENERATE, DONT_INLINE]
      0x0204: PHI (r8v4 short) = (r8v3 short), (r8v2 short) binds: [B:55:0x0202, B:27:0x00bd] A[DONT_GENERATE, DONT_INLINE]
      0x0204: PHI (r22v5 int) = (r22v4 int), (r22v3 int) binds: [B:55:0x0202, B:27:0x00bd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x0237 A[PHI: r2 r15 r17
      0x0237: PHI (r2v3 java.lang.String) = 
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
      (r2v5 java.lang.String)
     binds: [B:59:0x0235, B:32:0x00f7, B:17:0x007b, B:15:0x0077, B:12:0x006c, B:6:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x0237: PHI (r15v4 int) = (r15v2 int), (r15v3 int), (r15v2 int), (r15v2 int), (r15v2 int), (r15v2 int) binds: [B:59:0x0235, B:32:0x00f7, B:17:0x007b, B:15:0x0077, B:12:0x006c, B:6:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x0237: PHI (r17v4 char) = (r17v3 char), (r17v2 char), (r17v2 char), (r17v2 char), (r17v2 char), (r17v2 char) binds: [B:59:0x0235, B:32:0x00f7, B:17:0x007b, B:15:0x0077, B:12:0x006c, B:6:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0269 A[PHI: r16
      0x0269: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]) binds: [B:63:0x0267, B:9:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final PackageInfo m39262(String str) {
        int iM45029;
        int i;
        int i2;
        int i3 = C2124.f7782;
        int i4 = C1066.f4915;
        int iM450210 = (C19806.m45029("۟᩵") ^ i3) * (-103);
        int i5 = ((iM450210 ^ i4) * (-1607)) ^ (-1525233418);
        PackageManager packageManagerM39292 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM450210 ^ 1946659920;
        String strM4230 = null;
        int i7 = 0;
        short s = 0;
        int i8 = 0;
        short s2 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        char c = 0;
        int i12 = -666819832;
        int i13 = 0;
        PackageInfo packageInfo = null;
        int i14 = 0;
        while (true) {
            i12 = i6 ^ (i5 & (((i12 ^ i4) * (-25289)) >> 31));
            switch (i12) {
                case -2142127436:
                case -1024957968:
                    sArr2 = f53609;
                    i10 = 49;
                    if (C1977.f7413 <= 0) {
                        iM45029 = (C19806.m45029("᩺ۧ") ^ i4) * 61;
                        i = ((iM45029 ^ i3) * (-5919)) ^ (-1393203408);
                        i2 = -433773958;
                    } else {
                        iM45029 = (C19806.m45029("᩸ܳ") ^ i3) * (-59);
                        i = ((iM45029 ^ i4) * (-12361)) ^ 604821109;
                        i2 = -833456365;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1939453547:
                case 1809471520:
                    CallableC1627.m5508(str, strM4230);
                    packageManagerM39292 = m39292();
                    i14 = 0;
                    if (C0629.f2722 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۤۧ") ^ i3;
                        i = ((iM45029 ^ i4) * (-30523)) ^ (-128854367);
                        i2 = -1591654256;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۜ᩹") + i4) * (-71);
                        i = ((iM45029 ^ i3) * 16037) ^ (-586771045);
                        i2 = -805077760;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1803607323:
                case 2079308368:
                    sArr = f53609;
                    if (C1398.m4895() <= 0) {
                        iM45029 = (C19806.m45029("ۤۢ") + i4) * (-37);
                        i = ((iM45029 ^ i3) * (-13389)) ^ 1216819987;
                        i2 = 1739206278;
                    } else {
                        iM45029 = (C19806.m45029("ۢܰ") + i3) * (-71);
                        i = ((iM45029 ^ i4) * 12857) ^ (-953279057);
                        i2 = 857243946;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1706669204:
                case 738462306:
                    C3660.m10791();
                    if (C1189.f5284 <= 0) {
                        iM45029 = C19806.m45029("۬ܽ") ^ i3;
                        i = ((iM45029 ^ i4) * (-30181)) ^ 1140449060;
                        i2 = -1924516790;
                    } else {
                        iM45029 = (C19806.m45029("᩺ۧ") ^ i4) * 61;
                        i = ((iM45029 ^ i3) * (-5919)) ^ (-1393203408);
                        i2 = -433773958;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1703433748:
                case 1575103689:
                    i8 = i13 + 90174016;
                    if (RunnableC0195.f1321 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۢۜ") ^ i3;
                        i = ((iM45029 ^ i4) * 22031) ^ (-1210919138);
                        i2 = 1985433036;
                    } else {
                        iM45029 = C19806.m45029("ܺ֡") ^ i4;
                        i = ((iM45029 ^ i3) * (-22435)) ^ (-424399847);
                        i2 = 827460036;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1583464605:
                case 1982613348:
                    i11 = 11;
                    if (C7105.m18985()) {
                        iM45029 = C19806.m45029("۬ܽ") ^ i3;
                        i = ((iM45029 ^ i4) * (-30181)) ^ 1140449060;
                        i2 = -1924516790;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩶ۢ") + i4) * (-47);
                        i = ((iM45029 ^ i3) * 24047) ^ (-356245957);
                        i2 = 376225269;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1538559358:
                case -817614421:
                    if (i8 - (s * s2) < 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩸֫") ^ i3) * (-27);
                        i = ((iM45029 ^ i4) * (-16593)) ^ 1025850754;
                        i2 = -1522517295;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۟ܿ") + i4) * 67;
                        i = ((iM45029 ^ i3) * 2487) ^ (-388698157);
                        i2 = -1378571288;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1530293906:
                case 1424934157:
                    s2 = 18992;
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۢۜ") ^ i3;
                        i = ((iM45029 ^ i4) * 22031) ^ (-1210919138);
                        i2 = 1985433036;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩶ܽ")) * (-61);
                        i = ((iM45029 ^ i4) * (-9793)) ^ 871047351;
                        i2 = 620579854;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1360688720:
                case 411913331:
                    packageInfo = packageManagerM39292.getPackageInfo(str, i14);
                    sArr3 = f53609;
                    i7 = 60;
                    if (C0962.f3784) {
                        iM45029 = (C19806.m45029("᩺ۧ") ^ i4) * 61;
                        i = ((iM45029 ^ i3) * (-5919)) ^ (-1393203408);
                        i2 = -433773958;
                    } else {
                        iM45029 = C19806.m45029("ۧۢ") ^ i4;
                        i = ((iM45029 ^ i3) * (-2297)) ^ 1942706517;
                        i2 = 1561340319;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1296129146:
                case 229431138:
                    i9 = 56889;
                    iM45029 = (i4 - C19806.m45029("ۘۜ")) * 61;
                    i = ((iM45029 ^ i3) * (-805)) ^ (-710543817);
                    i2 = -1108339210;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1127638046:
                case 732463429:
                    s = sArr[c];
                    i13 = s * s;
                    if (C2124.m6673() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۤۧ") ^ i3;
                        i = ((iM45029 ^ i4) * (-30523)) ^ (-128854367);
                        i2 = -1591654256;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܰ֡") ^ i3) * 31;
                        i = ((iM45029 ^ i4) * 31483) ^ 1833066141;
                        i2 = 640860175;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -945546039:
                case 129810913:
                    i9 = 43172;
                    iM45029 = (i4 - C19806.m45029("ۘۜ")) * 61;
                    i = ((iM45029 ^ i3) * (-805)) ^ (-710543817);
                    i2 = -1108339210;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -692448744:
                case 1424202567:
                    if (ThreadFactoryC3888.f14547 > 0) {
                        iM45029 = (C19806.m45029("᩺ۧ") ^ i4) * 61;
                        i = ((iM45029 ^ i3) * (-5919)) ^ (-1393203408);
                        i2 = -433773958;
                    } else {
                        iM45029 = (C19806.m45029("ۤۢ") + i4) * (-37);
                        i = ((iM45029 ^ i3) * (-13389)) ^ 1216819987;
                        i2 = 1739206278;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -660448755:
                case -17352767:
                    C1875.m6086();
                    if (C2124.m6673() <= 0) {
                        iM45029 = C19806.m45029("۬ܽ") ^ i3;
                        i = ((iM45029 ^ i4) * (-30181)) ^ 1140449060;
                        i2 = -1924516790;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۢۜ") ^ i3;
                        i = ((iM45029 ^ i4) * 22031) ^ (-1210919138);
                        i2 = 1985433036;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -524802373:
                case 132095955:
                    c = '0';
                    if (RunnableC3388.f12514 >= 0) {
                        iM45029 = C19806.m45029("۬ܽ") ^ i3;
                        i = ((iM45029 ^ i4) * (-30181)) ^ 1140449060;
                        i2 = -1924516790;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۡۘ") ^ i4;
                        i = ((iM45029 ^ i3) * (-18187)) ^ (-802654531);
                        i2 = -646615397;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -418419598:
                case 30152701:
                    C0671.m3008();
                    iM45029 = C19806.m45029("۬ܽ") ^ i3;
                    i = ((iM45029 ^ i4) * (-30181)) ^ 1140449060;
                    i2 = -1924516790;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -86937712:
                case 40013896:
                    C1461.m5080();
                    return null;
                case 950852650:
                case 1466300749:
                    C1937.m6286(packageInfo, C1977.m6363(sArr3, i7, 19, i9));
                    return packageInfo;
                default:
                    strM4230 = C1148.m4230(sArr2, i10, i11, i9);
                    if (C1148.m4232() <= 0) {
                        iM45029 = C19806.m45029("۬ܽ") ^ i3;
                        i = ((iM45029 ^ i4) * (-30181)) ^ 1140449060;
                        i2 = -1924516790;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۠᩶") + i3) * (-127);
                        i = ((iM45029 ^ i4) * (-933)) ^ (-1154239072);
                        i2 = 621276340;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x01f6 A[PHI: r5 r6 r8 r16
      0x01f6: PHI (r5v3 short) = (r5v2 short), (r5v1 short), (r5v1 short) binds: [B:58:0x01f4, B:54:0x01d4, B:46:0x0181] A[DONT_GENERATE, DONT_INLINE]
      0x01f6: PHI (r6v3 int) = (r6v1 int), (r6v2 int), (r6v1 int) binds: [B:58:0x01f4, B:54:0x01d4, B:46:0x0181] A[DONT_GENERATE, DONT_INLINE]
      0x01f6: PHI (r8v2 short) = (r8v1 short), (r8v1 short), (r8v3 short) binds: [B:58:0x01f4, B:54:0x01d4, B:46:0x0181] A[DONT_GENERATE, DONT_INLINE]
      0x01f6: PHI (r16v11 int) = (r16v8 int), (r16v9 int), (r16v12 int) binds: [B:58:0x01f4, B:54:0x01d4, B:46:0x0181] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x022b A[PHI: r4 r10 r11 r12 r16 r17
      0x022b: PHI (r4v3 char) = (r4v2 char), (r4v1 char), (r4v1 char), (r4v1 char) binds: [B:62:0x0229, B:36:0x010d, B:32:0x00ec, B:8:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x022b: PHI (r10v3 short[]) = (r10v1 short[]), (r10v2 short[]), (r10v1 short[]), (r10v1 short[]) binds: [B:62:0x0229, B:36:0x010d, B:32:0x00ec, B:8:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x022b: PHI (r11v3 int) = (r11v1 int), (r11v2 int), (r11v1 int), (r11v1 int) binds: [B:62:0x0229, B:36:0x010d, B:32:0x00ec, B:8:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x022b: PHI (r12v3 int) = (r12v1 int), (r12v1 int), (r12v2 int), (r12v1 int) binds: [B:62:0x0229, B:36:0x010d, B:32:0x00ec, B:8:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x022b: PHI (r16v21 int) = (r16v7 int), (r16v15 int), (r16v16 int), (r16v22 int) binds: [B:62:0x0229, B:36:0x010d, B:32:0x00ec, B:8:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x022b: PHI (r17v3 java.lang.String) = (r17v1 java.lang.String), (r17v1 java.lang.String), (r17v1 java.lang.String), (r17v4 java.lang.String) binds: [B:62:0x0229, B:36:0x010d, B:32:0x00ec, B:8:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0062, code lost:
    
        if (l.CallableC1627.m5507() != 0) goto L8;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m39272(java.lang.CharSequence r21) {
        /*
            Method dump skipped, instruction units count: 808
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16737.m39272(java.lang.CharSequence):void");
    }

    /* JADX WARN: Code duplicated, block: B:58:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:66:0x0264  */
    /* JADX WARN: Code duplicated, block: B:84:0x0319 A[PHI: r7 r9 r11 r13 r14 r16 r18 r23
      0x0319: PHI (r7v4 android.content.Context) = 
      (r7v2 android.content.Context)
      (r7v2 android.content.Context)
      (r7v3 android.content.Context)
      (r7v2 android.content.Context)
      (r7v2 android.content.Context)
      (r7v2 android.content.Context)
      (r7v2 android.content.Context)
     binds: [B:83:0x0317, B:75:0x02d7, B:53:0x01cd, B:44:0x0153, B:13:0x0086, B:9:0x006b, B:6:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x0319: PHI (r9v4 java.lang.String) = 
      (r9v2 java.lang.String)
      (r9v2 java.lang.String)
      (r9v2 java.lang.String)
      (r9v3 java.lang.String)
      (r9v2 java.lang.String)
      (r9v2 java.lang.String)
      (r9v2 java.lang.String)
     binds: [B:83:0x0317, B:75:0x02d7, B:53:0x01cd, B:44:0x0153, B:13:0x0086, B:9:0x006b, B:6:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x0319: PHI (r11v4 short[]) = (r11v2 short[]), (r11v2 short[]), (r11v3 short[]), (r11v2 short[]), (r11v2 short[]), (r11v2 short[]), (r11v2 short[]) binds: [B:83:0x0317, B:75:0x02d7, B:53:0x01cd, B:44:0x0153, B:13:0x0086, B:9:0x006b, B:6:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x0319: PHI (r13v4 int) = (r13v2 int), (r13v2 int), (r13v3 int), (r13v2 int), (r13v2 int), (r13v2 int), (r13v2 int) binds: [B:83:0x0317, B:75:0x02d7, B:53:0x01cd, B:44:0x0153, B:13:0x0086, B:9:0x006b, B:6:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x0319: PHI (r14v3 int) = (r14v2 int), (r14v2 int), (r14v2 int), (r14v2 int), (r14v2 int), (r14v2 int), (r14v5 int) binds: [B:83:0x0317, B:75:0x02d7, B:53:0x01cd, B:44:0x0153, B:13:0x0086, B:9:0x006b, B:6:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x0319: PHI (r16v4 short) = (r16v2 short), (r16v3 short), (r16v2 short), (r16v2 short), (r16v2 short), (r16v2 short), (r16v2 short) binds: [B:83:0x0317, B:75:0x02d7, B:53:0x01cd, B:44:0x0153, B:13:0x0086, B:9:0x006b, B:6:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x0319: PHI (r18v4 char) = (r18v3 char), (r18v2 char), (r18v2 char), (r18v2 char), (r18v2 char), (r18v2 char), (r18v2 char) binds: [B:83:0x0317, B:75:0x02d7, B:53:0x01cd, B:44:0x0153, B:13:0x0086, B:9:0x006b, B:6:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x0319: PHI (r23v7 int) = (r23v5 int), (r23v6 int), (r23v5 int), (r23v5 int), (r23v5 int), (r23v5 int), (r23v5 int) binds: [B:83:0x0317, B:75:0x02d7, B:53:0x01cd, B:44:0x0153, B:13:0x0086, B:9:0x006b, B:6:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:88:0x034b A[PHI: r17
      0x034b: PHI (r17v4 short[]) = (r17v3 short[]), (r17v2 short[]), (r17v2 short[]) binds: [B:87:0x0349, B:40:0x012e, B:16:0x008c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:92:0x0377 A[PHI: r19 r20 r25
      0x0377: PHI (r19v4 int) = (r19v2 int), (r19v3 int), (r19v2 int), (r19v2 int), (r19v2 int), (r19v2 int) binds: [B:91:0x0375, B:79:0x02f8, B:22:0x00ad, B:19:0x0092, B:16:0x008c, B:13:0x0086] A[DONT_GENERATE, DONT_INLINE]
      0x0377: PHI (r20v4 int) = (r20v2 int), (r20v3 int), (r20v2 int), (r20v2 int), (r20v2 int), (r20v2 int) binds: [B:91:0x0375, B:79:0x02f8, B:22:0x00ad, B:19:0x0092, B:16:0x008c, B:13:0x0086] A[DONT_GENERATE, DONT_INLINE]
      0x0377: PHI (r25v3 short) = (r25v1 short), (r25v2 short), (r25v1 short), (r25v1 short), (r25v1 short), (r25v1 short) binds: [B:91:0x0375, B:79:0x02f8, B:22:0x00ad, B:19:0x0092, B:16:0x008c, B:13:0x0086] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m39289(final int i, final View view) {
        int iM45029;
        int i2;
        int i3;
        int i4 = C2642.f10294;
        int i5 = C0278.f1572;
        int iM450210 = (i5 - C19806.m45029("᩵ۚ")) * (-105);
        int i6 = ((iM450210 ^ i4) * (-12849)) ^ (-1114054288);
        int i7 = iM450210 ^ (-1184265283);
        String strM2424 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        short s = 0;
        char c = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 674992433;
        short s2 = 0;
        Context contextM2423 = null;
        Object objM1777 = null;
        int i15 = 0;
        int i16 = i7;
        long j = 0;
        while (true) {
            i14 = i16 ^ (i6 & (((i14 ^ i4) * 14785) >> 31));
            switch (i14) {
                case -2116835348:
                case -1013776456:
                    i8 = 44259;
                    iM45029 = (C19806.m45029("᩶ܿ") ^ i4) * (-43);
                    i2 = ((iM45029 ^ i5) * (-21287)) ^ (-869250327);
                    i3 = -1370864586;
                    int i17 = i2;
                    i16 = iM45029 ^ i3;
                    i6 = i17;
                    break;
                case -2051166590:
                case -1751541118:
                    C1668.m5583();
                    C3577.m10565();
                    break;
                case -1796273367:
                case 143249676:
                    view.postDelayed(new Runnable() { // from class: l.᩷ܺۘ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C16737.m39265(i, view);
                        }

                        {
                            int i18 = -1892500101;
                            int i19 = C3577.f13150;
                            int i20 = C2871.f10837;
                            int iM450211 = C19806.m45029("֨᩹") ^ i20;
                            int i21 = ((iM450211 ^ i19) * 7379) ^ 1730687117;
                            int i22 = 1515036847;
                            while (true) {
                                i18 = ((((i18 ^ i19) * (-9713)) >> 31) & i21) ^ (iM450211 ^ i22);
                                switch (i18) {
                                    case -2054454215:
                                    case -1481279277:
                                        if (C0962.f3784) {
                                            iM450211 = (C19806.m45029("ۖ᩺") ^ i20) * (-79);
                                            i21 = ((iM450211 ^ i19) * (-21185)) ^ (-1156556584);
                                            i22 = -312808528;
                                        } else {
                                            iM450211 = (ThreadFactoryC3888.m11306("֫ܺ") ^ i19) * 31;
                                            i21 = ((iM450211 ^ i20) * 30275) ^ (-1328184498);
                                            i22 = 555644037;
                                        }
                                        break;
                                    case -2003703396:
                                    case 1286193504:
                                        if (C3577.f13150 >= 0) {
                                            iM450211 = (C19806.m45029("ۖ᩺") ^ i20) * (-79);
                                            i21 = ((iM450211 ^ i19) * (-21185)) ^ (-1156556584);
                                            i22 = -312808528;
                                        } else {
                                            iM450211 = C19806.m45029("֨ܰ") ^ i20;
                                            i21 = ((iM450211 ^ i19) * 7701) ^ 1278923657;
                                            i22 = 2022269552;
                                        }
                                        break;
                                    case -2000858505:
                                    case -1846458463:
                                        if (C1025.f4800 < 0) {
                                            iM450211 = (i20 - C19806.m45029("᩺ܳ")) * (-31);
                                            i21 = ((iM450211 ^ i19) * (-30251)) ^ 984780863;
                                            i22 = -2141877921;
                                        } else {
                                            iM450211 = ThreadFactoryC3888.m11306("ܿ֡") ^ i20;
                                            i21 = ((iM450211 ^ i19) * 23297) ^ 704811255;
                                            i22 = 667047788;
                                        }
                                        break;
                                    case -1757605947:
                                    case -316581027:
                                        C1189.m4368();
                                        iM450211 = ThreadFactoryC3888.m11306("ܿ֡") ^ i20;
                                        i21 = ((iM450211 ^ i19) * 23297) ^ 704811255;
                                        i22 = 667047788;
                                        break;
                                    case -1650993589:
                                    case 1771016986:
                                        if (RunnableC1895.f7152) {
                                            iM450211 = ThreadFactoryC3888.m11306("ۨۛ") ^ i20;
                                            i21 = ((iM450211 ^ i19) * 32005) ^ (-1582154771);
                                            i22 = -2137807493;
                                        } else {
                                            iM450211 = C19806.m45029("ۘۙ") ^ i19;
                                            i21 = ((iM450211 ^ i20) * (-27771)) ^ (-915377970);
                                            i22 = 2012004879;
                                        }
                                        break;
                                    case -1611737535:
                                    case 1515456471:
                                        return;
                                    case -1578892957:
                                    case -998736093:
                                        if (C0050.f912 <= 0) {
                                            iM450211 = (i19 - ThreadFactoryC3888.m11306("ܽ֫")) * (-15);
                                            i21 = ((iM450211 ^ i20) * (-19675)) ^ 1345843371;
                                            i22 = 1723581826;
                                        } else {
                                            iM450211 = (i20 - ThreadFactoryC3888.m11306("ܺ᩹")) * 49;
                                            i21 = ((iM450211 ^ i19) * (-20067)) ^ (-2024104228);
                                            i22 = -1169678780;
                                        }
                                        break;
                                    case -1186325588:
                                    case 898131347:
                                        if (C2477.f9839 <= 0) {
                                            iM450211 = (i19 - ThreadFactoryC3888.m11306("ܽ֫")) * (-15);
                                            i21 = ((iM450211 ^ i20) * (-19675)) ^ 1345843371;
                                            i22 = 1723581826;
                                        } else {
                                            iM450211 = (C19806.m45029("ۨۢ") ^ i19) * (-35);
                                            i21 = ((iM450211 ^ i20) * (-17169)) ^ (-1117404414);
                                            i22 = 288840572;
                                        }
                                        break;
                                    case -992733799:
                                    case 1865856156:
                                        if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                                            iM450211 = ThreadFactoryC3888.m11306("ܿ֡") ^ i20;
                                            i21 = ((iM450211 ^ i19) * 23297) ^ 704811255;
                                            i22 = 667047788;
                                        } else {
                                            iM450211 = (i19 - ThreadFactoryC3888.m11306("ۡۜ")) * 41;
                                            i21 = ((iM450211 ^ i20) * 6221) ^ (-1576690763);
                                            i22 = 1462470835;
                                        }
                                        break;
                                    case -897989004:
                                    case 139526878:
                                        if (C3535.f13026 <= 0) {
                                            iM450211 = C19806.m45029("ۘۙ") ^ i19;
                                            i21 = ((iM450211 ^ i20) * (-27771)) ^ (-915377970);
                                            i22 = 2012004879;
                                        } else {
                                            iM450211 = (i19 - C19806.m45029("ۧ᩷")) * 115;
                                            i21 = ((iM450211 ^ i20) * (-29113)) ^ (-530043458);
                                            i22 = 1866265458;
                                        }
                                        break;
                                    case -720925332:
                                    case 1518071987:
                                        C3577.m10565();
                                        if (C0671.f2816 != 0) {
                                            iM450211 = C19806.m45029("ۘۙ") ^ i19;
                                            i21 = ((iM450211 ^ i20) * (-27771)) ^ (-915377970);
                                            i22 = 2012004879;
                                        } else {
                                            iM450211 = ThreadFactoryC3888.m11306("ܿ֡") ^ i20;
                                            i21 = ((iM450211 ^ i19) * 23297) ^ 704811255;
                                            i22 = 667047788;
                                        }
                                        break;
                                    case -420201589:
                                    case 501246534:
                                        if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                                            iM450211 = C19806.m45029("ۘۙ") ^ i19;
                                            i21 = ((iM450211 ^ i20) * (-27771)) ^ (-915377970);
                                            i22 = 2012004879;
                                        } else {
                                            iM450211 = (C19806.m45029("᩻֡") + i20) * (-27);
                                            i21 = ((iM450211 ^ i19) * 2039) ^ 686669359;
                                            i22 = -2118984071;
                                        }
                                        break;
                                    case -390235150:
                                    case 1746396661:
                                        if (C1398.f5802 <= 0) {
                                            iM450211 = (i19 - ThreadFactoryC3888.m11306("ܽ֫")) * (-15);
                                            i21 = ((iM450211 ^ i20) * (-19675)) ^ 1345843371;
                                            i22 = 1723581826;
                                        } else {
                                            iM450211 = (C19806.m45029("۠᩶") ^ i20) * (-107);
                                            i21 = ((iM450211 ^ i19) * (-18889)) ^ (-342940552);
                                            i22 = 13521841;
                                        }
                                        break;
                                    case 721100760:
                                    case 792785029:
                                        if (C2124.f7782 > 0) {
                                            iM450211 = (i19 - ThreadFactoryC3888.m11306("ܽ֫")) * (-15);
                                            i21 = ((iM450211 ^ i20) * (-19675)) ^ 1345843371;
                                            i22 = 1723581826;
                                        } else {
                                            iM450211 = (i20 - C19806.m45029("᩺ܳ")) * (-31);
                                            i21 = ((iM450211 ^ i19) * (-30251)) ^ 984780863;
                                            i22 = -2141877921;
                                        }
                                        break;
                                    case 845376260:
                                    case 1165256757:
                                        if (RunnableC1564.f6300) {
                                            iM450211 = (i19 - ThreadFactoryC3888.m11306("ܽ֫")) * (-15);
                                            i21 = ((iM450211 ^ i20) * (-19675)) ^ 1345843371;
                                            i22 = 1723581826;
                                        } else {
                                            iM450211 = C19806.m45029("ۤܺ") ^ i19;
                                            i21 = ((iM450211 ^ i20) * 11151) ^ 350131451;
                                            i22 = -698064923;
                                        }
                                        break;
                                    default:
                                        C1419.m4973();
                                        C1977.m6356();
                                        throw new RuntimeException();
                                }
                            }
                        }
                    }, j);
                    iM45029 = C19806.m45029("۠ۙ") ^ i5;
                    i2 = ((iM45029 ^ i4) * (-4561)) ^ 1791267188;
                    i3 = 1590498749;
                    int i18 = i2;
                    i16 = iM45029 ^ i3;
                    i6 = i18;
                    break;
                case -1728853421:
                case -971331685:
                    if (((InputMethodManager) objM1777).showSoftInput(view, 0)) {
                        iM45029 = C19806.m45029("۠ۙ") ^ i5;
                        i2 = ((iM45029 ^ i4) * (-4561)) ^ 1791267188;
                        i3 = 1590498749;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩴܰ") ^ i4) * 97;
                        i2 = ((iM45029 ^ i5) * (-23329)) ^ 1888744830;
                        i3 = 1178873674;
                    }
                    int i19 = i2;
                    i16 = iM45029 ^ i3;
                    i6 = i19;
                    break;
                case -1617936242:
                case -1429323297:
                    view.postDelayed(new Runnable() { // from class: l.᩷ܺۘ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C16737.m39265(i, view);
                        }

                        {
                            int i110 = -1892500101;
                            int i111 = C3577.f13150;
                            int i20 = C2871.f10837;
                            int iM450211 = C19806.m45029("֨᩹") ^ i20;
                            int i21 = ((iM450211 ^ i111) * 7379) ^ 1730687117;
                            int i22 = 1515036847;
                            while (true) {
                                i110 = ((((i110 ^ i111) * (-9713)) >> 31) & i21) ^ (iM450211 ^ i22);
                                switch (i110) {
                                    case -2054454215:
                                    case -1481279277:
                                        if (C0962.f3784) {
                                            iM450211 = (C19806.m45029("ۖ᩺") ^ i20) * (-79);
                                            i21 = ((iM450211 ^ i111) * (-21185)) ^ (-1156556584);
                                            i22 = -312808528;
                                        } else {
                                            iM450211 = (ThreadFactoryC3888.m11306("֫ܺ") ^ i111) * 31;
                                            i21 = ((iM450211 ^ i20) * 30275) ^ (-1328184498);
                                            i22 = 555644037;
                                        }
                                        break;
                                    case -2003703396:
                                    case 1286193504:
                                        if (C3577.f13150 >= 0) {
                                            iM450211 = (C19806.m45029("ۖ᩺") ^ i20) * (-79);
                                            i21 = ((iM450211 ^ i111) * (-21185)) ^ (-1156556584);
                                            i22 = -312808528;
                                        } else {
                                            iM450211 = C19806.m45029("֨ܰ") ^ i20;
                                            i21 = ((iM450211 ^ i111) * 7701) ^ 1278923657;
                                            i22 = 2022269552;
                                        }
                                        break;
                                    case -2000858505:
                                    case -1846458463:
                                        if (C1025.f4800 < 0) {
                                            iM450211 = (i20 - C19806.m45029("᩺ܳ")) * (-31);
                                            i21 = ((iM450211 ^ i111) * (-30251)) ^ 984780863;
                                            i22 = -2141877921;
                                        } else {
                                            iM450211 = ThreadFactoryC3888.m11306("ܿ֡") ^ i20;
                                            i21 = ((iM450211 ^ i111) * 23297) ^ 704811255;
                                            i22 = 667047788;
                                        }
                                        break;
                                    case -1757605947:
                                    case -316581027:
                                        C1189.m4368();
                                        iM450211 = ThreadFactoryC3888.m11306("ܿ֡") ^ i20;
                                        i21 = ((iM450211 ^ i111) * 23297) ^ 704811255;
                                        i22 = 667047788;
                                        break;
                                    case -1650993589:
                                    case 1771016986:
                                        if (RunnableC1895.f7152) {
                                            iM450211 = ThreadFactoryC3888.m11306("ۨۛ") ^ i20;
                                            i21 = ((iM450211 ^ i111) * 32005) ^ (-1582154771);
                                            i22 = -2137807493;
                                        } else {
                                            iM450211 = C19806.m45029("ۘۙ") ^ i111;
                                            i21 = ((iM450211 ^ i20) * (-27771)) ^ (-915377970);
                                            i22 = 2012004879;
                                        }
                                        break;
                                    case -1611737535:
                                    case 1515456471:
                                        return;
                                    case -1578892957:
                                    case -998736093:
                                        if (C0050.f912 <= 0) {
                                            iM450211 = (i111 - ThreadFactoryC3888.m11306("ܽ֫")) * (-15);
                                            i21 = ((iM450211 ^ i20) * (-19675)) ^ 1345843371;
                                            i22 = 1723581826;
                                        } else {
                                            iM450211 = (i20 - ThreadFactoryC3888.m11306("ܺ᩹")) * 49;
                                            i21 = ((iM450211 ^ i111) * (-20067)) ^ (-2024104228);
                                            i22 = -1169678780;
                                        }
                                        break;
                                    case -1186325588:
                                    case 898131347:
                                        if (C2477.f9839 <= 0) {
                                            iM450211 = (i111 - ThreadFactoryC3888.m11306("ܽ֫")) * (-15);
                                            i21 = ((iM450211 ^ i20) * (-19675)) ^ 1345843371;
                                            i22 = 1723581826;
                                        } else {
                                            iM450211 = (C19806.m45029("ۨۢ") ^ i111) * (-35);
                                            i21 = ((iM450211 ^ i20) * (-17169)) ^ (-1117404414);
                                            i22 = 288840572;
                                        }
                                        break;
                                    case -992733799:
                                    case 1865856156:
                                        if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                                            iM450211 = ThreadFactoryC3888.m11306("ܿ֡") ^ i20;
                                            i21 = ((iM450211 ^ i111) * 23297) ^ 704811255;
                                            i22 = 667047788;
                                        } else {
                                            iM450211 = (i111 - ThreadFactoryC3888.m11306("ۡۜ")) * 41;
                                            i21 = ((iM450211 ^ i20) * 6221) ^ (-1576690763);
                                            i22 = 1462470835;
                                        }
                                        break;
                                    case -897989004:
                                    case 139526878:
                                        if (C3535.f13026 <= 0) {
                                            iM450211 = C19806.m45029("ۘۙ") ^ i111;
                                            i21 = ((iM450211 ^ i20) * (-27771)) ^ (-915377970);
                                            i22 = 2012004879;
                                        } else {
                                            iM450211 = (i111 - C19806.m45029("ۧ᩷")) * 115;
                                            i21 = ((iM450211 ^ i20) * (-29113)) ^ (-530043458);
                                            i22 = 1866265458;
                                        }
                                        break;
                                    case -720925332:
                                    case 1518071987:
                                        C3577.m10565();
                                        if (C0671.f2816 != 0) {
                                            iM450211 = C19806.m45029("ۘۙ") ^ i111;
                                            i21 = ((iM450211 ^ i20) * (-27771)) ^ (-915377970);
                                            i22 = 2012004879;
                                        } else {
                                            iM450211 = ThreadFactoryC3888.m11306("ܿ֡") ^ i20;
                                            i21 = ((iM450211 ^ i111) * 23297) ^ 704811255;
                                            i22 = 667047788;
                                        }
                                        break;
                                    case -420201589:
                                    case 501246534:
                                        if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                                            iM450211 = C19806.m45029("ۘۙ") ^ i111;
                                            i21 = ((iM450211 ^ i20) * (-27771)) ^ (-915377970);
                                            i22 = 2012004879;
                                        } else {
                                            iM450211 = (C19806.m45029("᩻֡") + i20) * (-27);
                                            i21 = ((iM450211 ^ i111) * 2039) ^ 686669359;
                                            i22 = -2118984071;
                                        }
                                        break;
                                    case -390235150:
                                    case 1746396661:
                                        if (C1398.f5802 <= 0) {
                                            iM450211 = (i111 - ThreadFactoryC3888.m11306("ܽ֫")) * (-15);
                                            i21 = ((iM450211 ^ i20) * (-19675)) ^ 1345843371;
                                            i22 = 1723581826;
                                        } else {
                                            iM450211 = (C19806.m45029("۠᩶") ^ i20) * (-107);
                                            i21 = ((iM450211 ^ i111) * (-18889)) ^ (-342940552);
                                            i22 = 13521841;
                                        }
                                        break;
                                    case 721100760:
                                    case 792785029:
                                        if (C2124.f7782 > 0) {
                                            iM450211 = (i111 - ThreadFactoryC3888.m11306("ܽ֫")) * (-15);
                                            i21 = ((iM450211 ^ i20) * (-19675)) ^ 1345843371;
                                            i22 = 1723581826;
                                        } else {
                                            iM450211 = (i20 - C19806.m45029("᩺ܳ")) * (-31);
                                            i21 = ((iM450211 ^ i111) * (-30251)) ^ 984780863;
                                            i22 = -2141877921;
                                        }
                                        break;
                                    case 845376260:
                                    case 1165256757:
                                        if (RunnableC1564.f6300) {
                                            iM450211 = (i111 - ThreadFactoryC3888.m11306("ܽ֫")) * (-15);
                                            i21 = ((iM450211 ^ i20) * (-19675)) ^ 1345843371;
                                            i22 = 1723581826;
                                        } else {
                                            iM450211 = C19806.m45029("ۤܺ") ^ i111;
                                            i21 = ((iM450211 ^ i20) * 11151) ^ 350131451;
                                            i22 = -698064923;
                                        }
                                        break;
                                    default:
                                        C1419.m4973();
                                        C1977.m6356();
                                        throw new RuntimeException();
                                }
                            }
                        }
                    }, j);
                    break;
                case -1522542131:
                case -1091269620:
                    if (i < i15) {
                        iM45029 = C19806.m45029("ۗܺ") ^ i4;
                        i2 = ((iM45029 ^ i5) * 13267) ^ 288572063;
                        i3 = 387084405;
                    } else {
                        iM45029 = C19806.m45029("۠ۙ") ^ i5;
                        i2 = ((iM45029 ^ i4) * (-4561)) ^ 1791267188;
                        i3 = 1590498749;
                    }
                    int i110 = i2;
                    i16 = iM45029 ^ i3;
                    i6 = i110;
                    break;
                case -1458408099:
                case 371336927:
                    if (RunnableC1564.f6300) {
                        iM45029 = (ThreadFactoryC3888.m11306("۠ܽ") ^ i5) * 69;
                        i2 = ((iM45029 ^ i4) * (-27103)) ^ (-850631521);
                        i3 = -1455982794;
                    } else {
                        iM45029 = C19806.m45029("᩷᩺") ^ i5;
                        i2 = ((iM45029 ^ i4) * 5245) ^ 218971078;
                        i3 = -1964124410;
                    }
                    int i111 = i2;
                    i16 = iM45029 ^ i3;
                    i6 = i111;
                    break;
                case -1395197948:
                case -1335075360:
                    if (C1668.f6641 < 0) {
                        iM45029 = C19806.m45029("᩷᩺") ^ i5;
                        i2 = ((iM45029 ^ i4) * 5245) ^ 218971078;
                        i3 = -1964124410;
                    } else {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("ۨܺ")) * (-19);
                        i2 = ((iM45029 ^ i5) * (-25979)) ^ 422186495;
                        i3 = -2114597695;
                    }
                    int i112 = i2;
                    i16 = iM45029 ^ i3;
                    i6 = i112;
                    break;
                case -1359404721:
                case 1391150195:
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM45029 = C19806.m45029("᩹᩹") ^ i5;
                        i2 = ((iM45029 ^ i4) * 9089) ^ (-1139400857);
                        i3 = -369667421;
                    } else {
                        iM45029 = C19806.m45029("᩷᩺") ^ i5;
                        i2 = ((iM45029 ^ i4) * 5245) ^ 218971078;
                        i3 = -1964124410;
                    }
                    int i113 = i2;
                    i16 = iM45029 ^ i3;
                    i6 = i113;
                    break;
                case -889305571:
                case 645109257:
                    C1875.m6086();
                    RunnableC1564.m5345();
                    iM45029 = C19806.m45029("᩷᩺") ^ i5;
                    i2 = ((iM45029 ^ i4) * 5245) ^ 218971078;
                    i3 = -1964124410;
                    int i114 = i2;
                    i16 = iM45029 ^ i3;
                    i6 = i114;
                    break;
                case -873429732:
                case 1470109266:
                    objM1777 = C0278.m1777(contextM2423, C2332.m7082(sArr2, i9, i10, i8));
                    sArr3 = f53609;
                    if (CallableC1627.f6528) {
                        iM45029 = (i5 - ThreadFactoryC3888.m11306("ۙܽ")) * 61;
                        i2 = ((iM45029 ^ i4) * (-25293)) ^ 192503320;
                        i3 = -726866280;
                    } else {
                        iM45029 = (C19806.m45029("ۛ֫") + i4) * (-39);
                        i2 = ((iM45029 ^ i5) * (-49)) ^ 715042641;
                        i3 = 188900795;
                    }
                    int i115 = i2;
                    i16 = iM45029 ^ i3;
                    i6 = i115;
                    break;
                case -813954997:
                case 1136315683:
                    break;
                case -780178438:
                case 688842781:
                    int i20 = i11 + i12;
                    i13 = i20 + i20;
                    s = 11538;
                    if (C1977.f7413 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("۠ܽ") ^ i5) * 69;
                        i2 = ((iM45029 ^ i4) * (-27103)) ^ (-850631521);
                        i3 = -1455982794;
                    } else {
                        iM45029 = C19806.m45029("ܶۧ") ^ i5;
                        i2 = ((iM45029 ^ i4) * 11445) ^ (-928130106);
                        i3 = 319072683;
                    }
                    int i116 = i2;
                    i16 = iM45029 ^ i3;
                    i6 = i116;
                    break;
                case -779393137:
                case -462316704:
                    strM2424 = C0526.m2424(sArr3, 436, 80, i8);
                    if (C1066.f4915 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("۠ܽ") ^ i5) * 69;
                        i2 = ((iM45029 ^ i4) * (-27103)) ^ (-850631521);
                        i3 = -1455982794;
                    } else {
                        iM45029 = (i4 - C19806.m45029("ۘۢ")) * (-67);
                        i2 = ((iM45029 ^ i5) * 14319) ^ (-590366917);
                        i3 = -267060097;
                    }
                    int i117 = i2;
                    i16 = iM45029 ^ i3;
                    i6 = i117;
                    break;
                case -683468716:
                case -573512811:
                    if (C1977.m6361(view)) {
                        iM45029 = ThreadFactoryC3888.m11306("۬ۚ") ^ i5;
                        i2 = ((iM45029 ^ i4) * 9127) ^ 485279510;
                        i3 = 70508721;
                    } else {
                        iM45029 = C19806.m45029("۠ۙ") ^ i5;
                        i2 = ((iM45029 ^ i4) * (-4561)) ^ 1791267188;
                        i3 = 1590498749;
                    }
                    int i118 = i2;
                    i16 = iM45029 ^ i3;
                    i6 = i118;
                    break;
                case -557889907:
                case 1753089370:
                    if (i <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۬ۜ") ^ i5;
                        i2 = ((iM45029 ^ i4) * (-2553)) ^ (-593673990);
                        i3 = -902511037;
                    } else {
                        iM45029 = C19806.m45029("۠ۙ") ^ i5;
                        i2 = ((iM45029 ^ i4) * (-4561)) ^ 1791267188;
                        i3 = 1590498749;
                    }
                    int i119 = i2;
                    i16 = iM45029 ^ i3;
                    i6 = i119;
                    break;
                case -446831490:
                case 1283765913:
                    contextM2423 = C0526.m2423(view);
                    sArr2 = f53609;
                    i9 = 424;
                    if (C1148.m4232() <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("۠ܽ") ^ i5) * 69;
                        i2 = ((iM45029 ^ i4) * (-27103)) ^ (-850631521);
                        i3 = -1455982794;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۜ᩺") + i4) * (-39);
                        i2 = ((iM45029 ^ i5) * (-17965)) ^ 1472065608;
                        i3 = 1997963186;
                    }
                    int i1110 = i2;
                    i16 = iM45029 ^ i3;
                    i6 = i1110;
                    break;
                case -192733468:
                case 1718127230:
                    sArr = f53609;
                    if (RunnableC1895.f7152) {
                        iM45029 = C19806.m45029("ۘ۟") ^ i4;
                        i2 = ((iM45029 ^ i5) * 8711) ^ (-1861936945);
                        i3 = 1902145202;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۨۜ") ^ i4;
                        i2 = ((iM45029 ^ i5) * 18429) ^ (-1721027871);
                        i3 = -1342702802;
                    }
                    int i1111 = i2;
                    i16 = iM45029 ^ i3;
                    i6 = i1111;
                    break;
                case -187799179:
                case 458229646:
                    s2 = sArr[c];
                    i11 = s2 * s2;
                    i12 = 133125444;
                    if (C1937.f7317 >= 0) {
                        iM45029 = C19806.m45029("᩷᩺") ^ i5;
                        i2 = ((iM45029 ^ i4) * 5245) ^ 218971078;
                        i3 = -1964124410;
                    } else {
                        iM45029 = (C19806.m45029("ܰᩳ") ^ i4) * (-57);
                        i2 = ((iM45029 ^ i5) * 29299) ^ 1034558047;
                        i3 = -548318702;
                    }
                    int i1112 = i2;
                    i16 = iM45029 ^ i3;
                    i6 = i1112;
                    break;
                case 242437309:
                case 2054589799:
                    int i21 = s2 + s;
                    if ((i21 * i21) - i13 > 0) {
                        iM45029 = C19806.m45029("ۘۖ") ^ i5;
                        i2 = ((iM45029 ^ i4) * (-1275)) ^ 318106326;
                        i3 = 1343491700;
                    } else {
                        iM45029 = C19806.m45029("᩸۬") ^ i4;
                        i2 = ((iM45029 ^ i5) * 28251) ^ (-1690600761);
                        i3 = -1639192926;
                    }
                    int i1113 = i2;
                    i16 = iM45029 ^ i3;
                    i6 = i1113;
                    break;
                case 423902904:
                case 1199239147:
                    j = 100;
                    i15 = 3;
                    if (view.hasWindowFocus()) {
                        iM45029 = C19806.m45029("۠ᩴ") ^ i5;
                        i2 = ((iM45029 ^ i4) * 25009) ^ 57621278;
                        i3 = 1374902890;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۘ۠") ^ i4) * (-107);
                        i2 = ((iM45029 ^ i5) * (-21411)) ^ (-436122990);
                        i3 = -7961778;
                    }
                    int i1114 = i2;
                    i16 = iM45029 ^ i3;
                    i6 = i1114;
                    break;
                case 522629849:
                case 1681160312:
                    if (view.isFocused()) {
                        iM45029 = ThreadFactoryC3888.m11306("۬ۚ") ^ i5;
                        i2 = ((iM45029 ^ i4) * 9127) ^ 485279510;
                        i3 = 70508721;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۘ᩹") ^ i4;
                        i2 = ((iM45029 ^ i5) * 29787) ^ (-2009500349);
                        i3 = 2011533761;
                    }
                    int i1115 = i2;
                    i16 = iM45029 ^ i3;
                    i6 = i1115;
                    break;
                case 611141217:
                case 1406292707:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 > 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("۠ܽ") ^ i5) * 69;
                        i2 = ((iM45029 ^ i4) * (-27103)) ^ (-850631521);
                        i3 = -1455982794;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩵ᩳ") ^ i5;
                        i2 = ((iM45029 ^ i4) * (-23085)) ^ (-580323525);
                        i3 = -1268369244;
                    }
                    int i1116 = i2;
                    i16 = iM45029 ^ i3;
                    i6 = i1116;
                    break;
                case 620461133:
                case 1251781135:
                    C13465.m32963(objM1777, strM2424);
                    if (C0671.f2816 != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۨۜ") ^ i4;
                        i2 = ((iM45029 ^ i5) * 18429) ^ (-1721027871);
                        i3 = -1342702802;
                    } else {
                        iM45029 = (C19806.m45029("ۡۡ") ^ i5) * 41;
                        i2 = ((iM45029 ^ i4) * 22663) ^ (-1626630005);
                        i3 = 549521420;
                    }
                    int i1117 = i2;
                    i16 = iM45029 ^ i3;
                    i6 = i1117;
                    break;
                case 821771796:
                case 1298388973:
                    i8 = 33681;
                    iM45029 = (C19806.m45029("᩶ܿ") ^ i4) * (-43);
                    i2 = ((iM45029 ^ i5) * (-21287)) ^ (-869250327);
                    i3 = -1370864586;
                    int i1118 = i2;
                    i16 = iM45029 ^ i3;
                    i6 = i1118;
                    break;
                case 913646420:
                case 2130577839:
                    if (i < i15) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩵۫") + i5) * (-113);
                        i2 = ((iM45029 ^ i4) * 10249) ^ (-1797258912);
                        i3 = 1472473868;
                    } else {
                        iM45029 = C19806.m45029("۠ۙ") ^ i5;
                        i2 = ((iM45029 ^ i4) * (-4561)) ^ 1791267188;
                        i3 = 1590498749;
                    }
                    int i1119 = i2;
                    i16 = iM45029 ^ i3;
                    i6 = i1119;
                    break;
                case 1254836883:
                case 1484283284:
                    if (C0671.f2816 == 0) {
                        iM45029 = C19806.m45029("᩷᩺") ^ i5;
                        i2 = ((iM45029 ^ i4) * 5245) ^ 218971078;
                        i3 = -1964124410;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۨۜ") ^ i4;
                        i2 = ((iM45029 ^ i5) * 18429) ^ (-1721027871);
                        i3 = -1342702802;
                    }
                    int i11110 = i2;
                    i16 = iM45029 ^ i3;
                    i6 = i11110;
                    break;
                case 1861996431:
                case 2113319734:
                    c = 423;
                    if (C1977.f7413 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("۠ܽ") ^ i5) * 69;
                        i2 = ((iM45029 ^ i4) * (-27103)) ^ (-850631521);
                        i3 = -1455982794;
                    } else {
                        iM45029 = (i5 - ThreadFactoryC3888.m11306("᩶᩺")) * 11;
                        i2 = ((iM45029 ^ i4) * (-22373)) ^ 1193979970;
                        i3 = 1487455375;
                    }
                    int i11111 = i2;
                    i16 = iM45029 ^ i3;
                    i6 = i11111;
                    break;
                default:
                    i10 = 12;
                    if (C3722.f13525 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("۠ܽ") ^ i5) * 69;
                        i2 = ((iM45029 ^ i4) * (-27103)) ^ (-850631521);
                        i3 = -1455982794;
                    } else {
                        iM45029 = (C19806.m45029("۫᩺") ^ i4) * 99;
                        i2 = ((iM45029 ^ i5) * (-7457)) ^ (-1938153850);
                        i3 = -220842685;
                    }
                    int i11112 = i2;
                    i16 = iM45029 ^ i3;
                    i6 = i11112;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final Object m39287(String str) {
        return C0278.m1777(C0050.m939(), str);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00c8 A[PHI: r2 r3 r4
      0x00c8: PHI (r2v3 android.content.ClipData) = (r2v2 android.content.ClipData), (r2v1 android.content.ClipData), (r2v1 android.content.ClipData) binds: [B:27:0x00ae, B:23:0x008b, B:20:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x00c8: PHI (r3v3 java.lang.String) = (r3v2 java.lang.String), (r3v1 java.lang.String), (r3v1 java.lang.String) binds: [B:27:0x00ae, B:23:0x008b, B:20:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x00c8: PHI (r4v2 java.lang.CharSequence) = (r4v1 java.lang.CharSequence), (r4v1 java.lang.CharSequence), (r4v3 java.lang.CharSequence) binds: [B:27:0x00ae, B:23:0x008b, B:20:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x0154 A[PHI: r1 r14 r20
      0x0154: PHI (r1v3 java.lang.Object) = (r1v1 java.lang.Object), (r1v2 java.lang.Object), (r1v1 java.lang.Object), (r1v1 java.lang.Object) binds: [B:43:0x0152, B:39:0x012f, B:12:0x004e, B:9:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x0154: PHI (r14v3 short[]) = (r14v1 short[]), (r14v2 short[]), (r14v1 short[]), (r14v1 short[]) binds: [B:43:0x0152, B:39:0x012f, B:12:0x004e, B:9:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x0154: PHI (r20v3 java.lang.String) = (r20v2 java.lang.String), (r20v1 java.lang.String), (r20v1 java.lang.String), (r20v1 java.lang.String) binds: [B:43:0x0152, B:39:0x012f, B:12:0x004e, B:9:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x01aa A[PHI: r11 r12
      0x01aa: PHI (r11v4 short[]) = (r11v2 short[]), (r11v1 short[]), (r11v1 short[]) binds: [B:51:0x01a8, B:31:0x00eb, B:6:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x01aa: PHI (r12v4 int) = (r12v2 int), (r12v1 int), (r12v1 int) binds: [B:51:0x01a8, B:31:0x00eb, B:6:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x025a A[PHI: r8 r9 r13 r15
      0x025a: PHI (r8v3 int) = (r8v2 int), (r8v1 int), (r8v1 int), (r8v1 int) binds: [B:66:0x0258, B:62:0x0236, B:47:0x0186, B:35:0x010b] A[DONT_GENERATE, DONT_INLINE]
      0x025a: PHI (r9v3 int) = (r9v1 int), (r9v2 int), (r9v1 int), (r9v1 int) binds: [B:66:0x0258, B:62:0x0236, B:47:0x0186, B:35:0x010b] A[DONT_GENERATE, DONT_INLINE]
      0x025a: PHI (r13v3 int) = (r13v1 int), (r13v1 int), (r13v2 int), (r13v1 int) binds: [B:66:0x0258, B:62:0x0236, B:47:0x0186, B:35:0x010b] A[DONT_GENERATE, DONT_INLINE]
      0x025a: PHI (r15v2 int) = (r15v1 int), (r15v1 int), (r15v1 int), (r15v3 int) binds: [B:66:0x0258, B:62:0x0236, B:47:0x0186, B:35:0x010b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x028d A[PHI: r7
      0x028d: PHI (r7v3 short) = (r7v2 short), (r7v1 short), (r7v1 short), (r7v1 short) binds: [B:70:0x028b, B:14:0x0052, B:12:0x004e, B:6:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x02c1 A[PHI: r6 r21
      0x02c1: PHI (r6v3 char) = (r6v2 char), (r6v1 char) binds: [B:74:0x02bf, B:9:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x02c1: PHI (r21v5 short[]) = (r21v4 short[]), (r21v3 short[]) binds: [B:74:0x02bf, B:9:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final String m39296() {
        int iM11306;
        int i;
        int i2;
        Object objM39287 = null;
        ClipData primaryClip = null;
        String str = null;
        CharSequence text = null;
        char c = 0;
        short s = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        short[] sArr = null;
        int i6 = 0;
        int i7 = 0;
        short[] sArr2 = null;
        int i8 = 0;
        int i9 = 287852611;
        int i10 = RunnableC0195.f1321;
        int i11 = C1419.f5860;
        int iM45029 = (C19806.m45029("ܶ֫") ^ i11) * (-57);
        int i12 = ((iM45029 ^ i10) * 9545) ^ 2009254671;
        int i13 = iM45029 ^ (-1790218435);
        short[] sArr3 = null;
        String strM5070 = null;
        while (true) {
            i9 = i13 ^ (i12 & (((i9 ^ i10) * 9295) >> 31));
            switch (i9) {
                case -1798327819:
                case -228111337:
                    if (primaryClip.getItemCount() > 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۜ᩹") ^ i11) * 87;
                        i = ((iM11306 ^ i10) * 5009) ^ (-1735576386);
                        i2 = 1437578447;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۛ֫") ^ i11) * 43;
                        i = ((iM11306 ^ i10) * 18831) ^ (-1910624110);
                        i2 = -1650633183;
                    }
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case -1737636066:
                case 671018132:
                    primaryClip = ((ClipboardManager) objM39287).getPrimaryClip();
                    str = null;
                    if (primaryClip != null) {
                        iM11306 = (C19806.m45029("֡۟") ^ i10) * 41;
                        i = ((iM11306 ^ i11) * 12491) ^ (-1456883225);
                        i2 = -817131262;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۛ֫") ^ i11) * 43;
                        i = ((iM11306 ^ i10) * 18831) ^ (-1910624110);
                        i2 = -1650633183;
                    }
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case -1556217919:
                case 1101088200:
                    if ((i4 * i4) - i3 < 0) {
                        iM11306 = (C19806.m45029("ۚۡ") ^ i10) * (-119);
                        i = ((iM11306 ^ i11) * (-25291)) ^ 1601823308;
                        i2 = -1522794285;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩴܳ") + i11) * (-87);
                        i = ((iM11306 ^ i10) * 8413) ^ (-953182177);
                        i2 = -2095079900;
                    }
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case -1418736224:
                case 2026943080:
                    i4 = s + 13951;
                    if (C0817.m3399()) {
                        iM11306 = (ThreadFactoryC3888.m11306("۠ܿ") + i11) * (-73);
                        i = ((iM11306 ^ i10) * (-31751)) ^ (-1077345563);
                        i2 = -1239184674;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۡ᩹") ^ i11) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM11306 ^ i10) * (-8567)) ^ (-1605461951);
                        i2 = 1769701763;
                    }
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case -1227964518:
                case -583392966:
                    return C2124.m6674(text);
                case -1114024523:
                case 1670116386:
                    i3 = s * 55804;
                    if (C1977.f7413 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۡ᩹") ^ i11) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM11306 ^ i10) * (-8567)) ^ (-1605461951);
                        i2 = 1769701763;
                    } else {
                        iM11306 = C19806.m45029("᩻ܰ") ^ i10;
                        i = ((iM11306 ^ i11) * 22235) ^ (-1682574436);
                        i2 = 146352102;
                    }
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case -1021760907:
                case 388598664:
                    i8 = 664;
                    if (C2788.m8472() != 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۡ᩹") ^ i11) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM11306 ^ i10) * (-8567)) ^ (-1605461951);
                        i2 = 1769701763;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۟۟") ^ i11;
                        i = ((iM11306 ^ i10) * 23517) ^ 1079806948;
                        i2 = -1811683704;
                    }
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case -921763631:
                case -94368428:
                    sArr3 = f53609;
                    c = 654;
                    if (C1937.f7317 >= 0) {
                        iM11306 = C19806.m45029("᩷֨") ^ i10;
                        i = ((iM11306 ^ i11) * 28005) ^ (-1731767459);
                        i2 = 1185984875;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۠ۖ") + i10) * 65;
                        i = ((iM11306 ^ i11) * 9645) ^ 125889026;
                        i2 = -411258041;
                    }
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case -910192739:
                case 740528361:
                    if (C1668.m5583()) {
                        iM11306 = C19806.m45029("᩷֨") ^ i10;
                        i = ((iM11306 ^ i11) * 28005) ^ (-1731767459);
                        i2 = 1185984875;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܰ֨") ^ i11;
                        i = ((iM11306 ^ i10) * 9379) ^ (-1882428595);
                        i2 = 1906094859;
                    }
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case -872285746:
                case 403096066:
                    text = primaryClip.getItemAt(0).getText();
                    if (text != null) {
                        iM11306 = (C19806.m45029("᩹ۗ") + i11) * 5;
                        i = ((iM11306 ^ i10) * 19625) ^ 1328071523;
                        i2 = -1694570686;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۛ֫") ^ i11) * 43;
                        i = ((iM11306 ^ i10) * 18831) ^ (-1910624110);
                        i2 = -1650633183;
                    }
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case -806075507:
                case 1925901159:
                    i5 = 64691;
                    iM11306 = (i10 - ThreadFactoryC3888.m11306("᩸֫")) * 33;
                    i = ((iM11306 ^ i11) * 8475) ^ (-397644909);
                    i2 = 948287472;
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case -632870029:
                case 1101214738:
                    C13465.m32963(objM39287, C2332.m7082(sArr2, i8, 69, i5));
                    if (C3722.f13525 <= 0) {
                        iM11306 = (C19806.m45029("֫ۨ") ^ i10) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i = ((iM11306 ^ i11) * 13495) ^ (-1146866595);
                        i2 = -2137093284;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳ۫") ^ i10;
                        i = ((iM11306 ^ i11) * (-6165)) ^ (-1658609487);
                        i2 = 1002122133;
                    }
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case -446276311:
                case 555764076:
                    if (C3660.f13403 >= 0) {
                        iM11306 = C19806.m45029("۟ۙ") ^ i10;
                        i = ((iM11306 ^ i11) * (-11025)) ^ (-654098695);
                        i2 = 1211817934;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܰ֨") ^ i11;
                        i = ((iM11306 ^ i10) * 9379) ^ (-1882428595);
                        i2 = 1906094859;
                    }
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case -436733569:
                case 1138328394:
                    strM5070 = C1461.m5070(sArr, i6, i7, i5);
                    if (ThreadFactoryC3888.m11300() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܰ֨") ^ i11;
                        i = ((iM11306 ^ i10) * 9379) ^ (-1882428595);
                        i2 = 1906094859;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩻ۜ") ^ i10) * 23;
                        i = ((iM11306 ^ i11) * (-28367)) ^ 931030492;
                        i2 = -1617869042;
                    }
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case -425968891:
                case 649874032:
                    i5 = 17993;
                    iM11306 = (i10 - ThreadFactoryC3888.m11306("᩸֫")) * 33;
                    i = ((iM11306 ^ i11) * 8475) ^ (-397644909);
                    i2 = 948287472;
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case -336604601:
                case 1216951907:
                    C3722.m10894();
                    return null;
                case -144649733:
                case 2130704334:
                    s = sArr3[c];
                    if (C1668.f6641 >= 0) {
                        iM11306 = C19806.m45029("۟ۙ") ^ i10;
                        i = ((iM11306 ^ i11) * (-11025)) ^ (-654098695);
                        i2 = 1211817934;
                    } else {
                        iM11306 = (C19806.m45029("ܽۢ") + i11) * 25;
                        i = ((iM11306 ^ i10) * 26383) ^ (-656177189);
                        i2 = -1086556539;
                    }
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case 205395918:
                case 2141072207:
                    return str;
                case 211094077:
                case 648255440:
                    sArr = f53609;
                    i6 = 655;
                    if (C0526.m2437() >= 0) {
                        iM11306 = (C19806.m45029("֫ۨ") ^ i10) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i = ((iM11306 ^ i11) * 13495) ^ (-1146866595);
                        i2 = -2137093284;
                    } else {
                        iM11306 = C19806.m45029("ܺ᩵") ^ i11;
                        i = ((iM11306 ^ i10) * 27857) ^ 1717753527;
                        i2 = -1323788528;
                    }
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case 599309652:
                case 1689805841:
                    i7 = 9;
                    if (C0050.f912 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۡ᩹") ^ i11) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM11306 ^ i10) * (-8567)) ^ (-1605461951);
                        i2 = 1769701763;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܺᩴ") ^ i11;
                        i = ((iM11306 ^ i10) * (-561)) ^ (-815313112);
                        i2 = 811010687;
                    }
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case 668868368:
                case 1445217000:
                    objM39287 = m39287(strM5070);
                    sArr2 = f53609;
                    if (C2477.m7593() >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܰ֨") ^ i11;
                        i = ((iM11306 ^ i10) * 9379) ^ (-1882428595);
                        i2 = 1906094859;
                    } else {
                        iM11306 = (C19806.m45029("ۙ֡") + i10) * (-5);
                        i = ((iM11306 ^ i11) * (-31247)) ^ 30604942;
                        i2 = -605616815;
                    }
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case 1466352611:
                case 1612428666:
                    C1377.m4833();
                    ThreadFactoryC3888.m11300();
                    iM11306 = C19806.m45029("۟ۙ") ^ i10;
                    i = ((iM11306 ^ i11) * (-11025)) ^ (-654098695);
                    i2 = 1211817934;
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                default:
                    if (C0797.f3386) {
                        iM11306 = C19806.m45029("۟ۙ") ^ i10;
                        i = ((iM11306 ^ i11) * (-11025)) ^ (-654098695);
                        i2 = 1211817934;
                    } else {
                        iM11306 = (C19806.m45029("֫ۨ") ^ i10) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i = ((iM11306 ^ i11) * 13495) ^ (-1146866595);
                        i2 = -2137093284;
                    }
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00c0 A[PHI: r13
      0x00c0: PHI (r13v4 int) = (r13v3 int), (r13v2 int), (r13v2 int) binds: [B:28:0x00be, B:16:0x0068, B:14:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x019d A[PHI: r2 r7 r8
      0x019d: PHI (r2v3 java.lang.String) = (r2v2 java.lang.String), (r2v2 java.lang.String), (r2v4 java.lang.String) binds: [B:51:0x019b, B:47:0x017f, B:24:0x00a0] A[DONT_GENERATE, DONT_INLINE]
      0x019d: PHI (r7v4 int) = (r7v3 int), (r7v2 int), (r7v2 int) binds: [B:51:0x019b, B:47:0x017f, B:24:0x00a0] A[DONT_GENERATE, DONT_INLINE]
      0x019d: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int) binds: [B:51:0x019b, B:47:0x017f, B:24:0x00a0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x01d2 A[PHI: r6
      0x01d2: PHI (r6v4 short) = (r6v3 short), (r6v2 short) binds: [B:55:0x01d0, B:11:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x0203 A[PHI: r3 r5
      0x0203: PHI (r3v4 android.app.Application) = 
      (r3v2 android.app.Application)
      (r3v3 android.app.Application)
      (r3v2 android.app.Application)
      (r3v2 android.app.Application)
      (r3v2 android.app.Application)
     binds: [B:59:0x0201, B:20:0x007c, B:14:0x0065, B:11:0x005d, B:8:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x0203: PHI (r5v4 char) = (r5v3 char), (r5v2 char), (r5v2 char), (r5v2 char), (r5v2 char) binds: [B:59:0x0201, B:20:0x007c, B:14:0x0065, B:11:0x005d, B:8:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0234 A[PHI: r9 r11 r12 r18
      0x0234: PHI (r9v5 short) = (r9v2 short), (r9v3 short), (r9v2 short), (r9v2 short) binds: [B:63:0x0232, B:43:0x0162, B:32:0x00f0, B:8:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x0234: PHI (r11v5 short[]) = (r11v2 short[]), (r11v2 short[]), (r11v3 short[]), (r11v2 short[]) binds: [B:63:0x0232, B:43:0x0162, B:32:0x00f0, B:8:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x0234: PHI (r12v5 int) = (r12v2 int), (r12v2 int), (r12v3 int), (r12v2 int) binds: [B:63:0x0232, B:43:0x0162, B:32:0x00f0, B:8:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x0234: PHI (r18v6 short[]) = (r18v4 short[]), (r18v3 short[]), (r18v3 short[]), (r18v3 short[]) binds: [B:63:0x0232, B:43:0x0162, B:32:0x00f0, B:8:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m39270(Intent intent) {
        int iM11306;
        int i;
        int i2;
        int i3 = C3660.f13403;
        int i4 = MenuItemOnMenuItemClickListenerC3244.f12064;
        int iM11307 = (i4 - ThreadFactoryC3888.m11306("ۗ᩺")) * (-5);
        int i5 = ((iM11307 ^ i3) * (-3395)) ^ (-33584339);
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM11307 ^ (-977575575);
        char c = 0;
        short s = 0;
        int i7 = 0;
        int i8 = 0;
        short s2 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = -628696978;
        Application applicationM4826 = null;
        String strM10423 = null;
        while (true) {
            i12 = i6 ^ (i5 & (((i12 ^ i3) * (-369)) >> 31));
            switch (i12) {
                case -2099753618:
                case 672610873:
                    int i13 = s + s2;
                    if (i8 - (i13 * i13) <= 0) {
                        iM11306 = (C19806.m45029("᩶ۛ") + i3) * (-17);
                        i = ((iM11306 ^ i4) * 15297) ^ (-83602809);
                        i2 = -591201025;
                    } else {
                        iM11306 = C19806.m45029("ۡ۠") ^ i4;
                        i = ((iM11306 ^ i3) * (-18945)) ^ (-1882992866);
                        i2 = 154845832;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1889117211:
                case 252192005:
                    i8 = i7 + 1;
                    if (C2332.f8260) {
                        iM11306 = ThreadFactoryC3888.m11306("ܺ֫") ^ i3;
                        i = ((iM11306 ^ i4) * 8225) ^ 1175047292;
                        i2 = -751613151;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֡֡") ^ i3;
                        i = ((iM11306 ^ i4) * (-2123)) ^ 100985881;
                        i2 = -1701248762;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1887117505:
                case 2013648165:
                    CallableC1627.m5508(intent, strM10423);
                    applicationM4826 = C1377.m4826();
                    if (C7105.f23796 >= 0) {
                        iM11306 = (i3 - C19806.m45029("ۤܽ")) * 31;
                        i = ((iM11306 ^ i4) * 7021) ^ 115308230;
                        i2 = 1689998963;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۛܽ")) * (-55);
                        i = ((iM11306 ^ i4) * (-28853)) ^ (-1742636323);
                        i2 = 646655389;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1671636584:
                case 221746277:
                    C0216.m1591();
                    if (C1668.f6641 < 0) {
                        iM11306 = (i3 - C19806.m45029("ۤܽ")) * 31;
                        i = ((iM11306 ^ i4) * 7021) ^ 115308230;
                        i2 = 1689998963;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩵ᩳ") ^ i4;
                        i = ((iM11306 ^ i3) * 7847) ^ 2080064828;
                        i2 = -479600352;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1625318213:
                case 524376725:
                    sArr = f53609;
                    if (RunnableC1606.f6488 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩵ᩳ") ^ i4;
                        i = ((iM11306 ^ i3) * 7847) ^ 2080064828;
                        i2 = -479600352;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۙ۫") ^ i3;
                        i = ((iM11306 ^ i4) * (-24341)) ^ (-777875599);
                        i2 = -1056100833;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1594955513:
                case 1112973584:
                    RunnableC1606.m5473();
                    C1461.m5080();
                    break;
                case -1526998454:
                case 1151176659:
                    s2 = 1;
                    if (C2249.f8050 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩵ᩳ") ^ i4;
                        i = ((iM11306 ^ i3) * 7847) ^ 2080064828;
                        i2 = -479600352;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۘ֨") ^ i4;
                        i = ((iM11306 ^ i3) * (-32395)) ^ (-1716719069);
                        i2 = -1995049378;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1472722144:
                case -368775893:
                    i9 = 40136;
                    iM11306 = ThreadFactoryC3888.m11306("ۤۖ") ^ i4;
                    i = ((iM11306 ^ i3) * 21197) ^ 1727308931;
                    i2 = 374837127;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1219148222:
                case -78578289:
                    sArr2 = f53609;
                    i10 = 202;
                    if (C2871.f10837 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩵ᩳ") ^ i4;
                        i = ((iM11306 ^ i3) * 7847) ^ 2080064828;
                        i2 = -479600352;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۬֫") ^ i3;
                        i = ((iM11306 ^ i4) * 5051) ^ (-315600292);
                        i2 = -850150031;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -831532145:
                case 838476263:
                    i9 = 63781;
                    iM11306 = ThreadFactoryC3888.m11306("ۤۖ") ^ i4;
                    i = ((iM11306 ^ i3) * 21197) ^ 1727308931;
                    i2 = 374837127;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -774602275:
                case 1453577326:
                    c = 201;
                    if (C2332.f8260) {
                        iM11306 = ThreadFactoryC3888.m11306("۟֡") ^ i4;
                        i = ((iM11306 ^ i3) * 15625) ^ 1714277245;
                        i2 = -1080474616;
                    } else {
                        iM11306 = (i3 - C19806.m45029("ۤܽ")) * 31;
                        i = ((iM11306 ^ i4) * 7021) ^ 115308230;
                        i2 = 1689998963;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -256295694:
                case 917729576:
                    strM10423 = C3535.m10423(sArr2, i10, i11, i9);
                    if (C1189.m4368() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֡֡") ^ i3;
                        i = ((iM11306 ^ i4) * (-2123)) ^ 100985881;
                        i2 = -1701248762;
                    } else {
                        iM11306 = (C19806.m45029("ᩴ֫") + i3) * (-83);
                        i = ((iM11306 ^ i4) * (-6441)) ^ 1338921193;
                        i2 = -1451600425;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 88258579:
                case 1114159625:
                    if (C1398.f5802 <= 0) {
                        iM11306 = (i3 - C19806.m45029("ۤܽ")) * 31;
                        i = ((iM11306 ^ i4) * 7021) ^ 115308230;
                        i2 = 1689998963;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܶܽ") ^ i4;
                        i = ((iM11306 ^ i3) * 16943) ^ (-2047438619);
                        i2 = -335547431;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 513510173:
                case 1483251558:
                    s = sArr[c];
                    if (C1937.m6279() >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܶܽ") ^ i4;
                        i = ((iM11306 ^ i3) * 16943) ^ (-2047438619);
                        i2 = -335547431;
                    } else {
                        iM11306 = (C19806.m45029("᩸᩶") ^ i4) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM11306 ^ i3) * 20273) ^ 1624981778;
                        i2 = -2081263995;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 960503461:
                case 1016763694:
                    AbstractC0464.m2313();
                    iM11306 = C19806.m45029("᩵ۜ") ^ i4;
                    i = ((iM11306 ^ i3) * (-28803)) ^ (-1882665296);
                    i2 = -480800864;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 1258094761:
                case 1491086609:
                    if (C0278.m1789() > 0) {
                        iM11306 = C19806.m45029("᩵ۜ") ^ i4;
                        i = ((iM11306 ^ i3) * (-28803)) ^ (-1882665296);
                        i2 = -480800864;
                    } else {
                        iM11306 = (i3 - C19806.m45029("ۤܽ")) * 31;
                        i = ((iM11306 ^ i4) * 7021) ^ 115308230;
                        i2 = 1689998963;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 1281686050:
                case 1313052564:
                    i7 = s * 2;
                    if (C2788.f10625 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֡֡") ^ i3;
                        i = ((iM11306 ^ i4) * (-2123)) ^ 100985881;
                        i2 = -1701248762;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("۫ܺ")) * (-53);
                        i = ((iM11306 ^ i4) * (-26739)) ^ 116045711;
                        i2 = -1775687847;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 1526546445:
                case 1918373656:
                    i11 = 6;
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM11306 = C19806.m45029("᩵ۜ") ^ i4;
                        i = ((iM11306 ^ i3) * (-28803)) ^ (-1882665296);
                        i2 = -480800864;
                    } else {
                        iM11306 = C19806.m45029("ۡ᩶") ^ i4;
                        i = ((iM11306 ^ i3) * 17613) ^ 1956813527;
                        i2 = -1749972182;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                default:
                    C21843.m48614(applicationM4826).m48618(intent);
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00d7 A[PHI: r4
      0x00d7: PHI (r4v4 android.net.NetworkInfo) = (r4v3 android.net.NetworkInfo), (r4v2 android.net.NetworkInfo), (r4v2 android.net.NetworkInfo) binds: [B:28:0x00bf, B:23:0x0099, B:6:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x0140 A[PHI: r2 r3
      0x0140: PHI (r2v4 java.lang.Object) = (r2v3 java.lang.Object), (r2v2 java.lang.Object), (r2v2 java.lang.Object) binds: [B:40:0x013e, B:32:0x00fb, B:12:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x0140: PHI (r3v5 java.lang.String) = (r3v2 java.lang.String), (r3v4 java.lang.String), (r3v2 java.lang.String) binds: [B:40:0x013e, B:32:0x00fb, B:12:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x0174 A[PHI: r14
      0x0174: PHI (r14v4 int) = (r14v3 int), (r14v2 int), (r14v2 int), (r14v2 int) binds: [B:44:0x0172, B:17:0x0083, B:15:0x007f, B:12:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0242 A[PHI: r9 r10
      0x0242: PHI (r9v4 int) = (r9v3 int), (r9v2 int), (r9v2 int) binds: [B:63:0x0240, B:15:0x007f, B:9:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x0242: PHI (r10v4 int) = (r10v3 int), (r10v2 int), (r10v2 int) binds: [B:63:0x0240, B:15:0x007f, B:9:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x0296 A[PHI: r1 r7 r12 r13
      0x0296: PHI (r1v4 android.app.Application) = 
      (r1v2 android.app.Application)
      (r1v3 android.app.Application)
      (r1v2 android.app.Application)
      (r1v2 android.app.Application)
     binds: [B:71:0x0294, B:52:0x01ca, B:48:0x01a6, B:9:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x0296: PHI (r7v4 short) = (r7v3 short), (r7v2 short), (r7v2 short), (r7v2 short) binds: [B:71:0x0294, B:52:0x01ca, B:48:0x01a6, B:9:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x0296: PHI (r12v4 short[]) = (r12v2 short[]), (r12v3 short[]), (r12v2 short[]), (r12v2 short[]) binds: [B:71:0x0294, B:52:0x01ca, B:48:0x01a6, B:9:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x0296: PHI (r13v4 int) = (r13v2 int), (r13v2 int), (r13v3 int), (r13v2 int) binds: [B:71:0x0294, B:52:0x01ca, B:48:0x01a6, B:9:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x02ca A[PHI: r6 r8 r15 r20
      0x02ca: PHI (r6v4 char) = (r6v3 char), (r6v2 char), (r6v2 char) binds: [B:75:0x02c8, B:67:0x0276, B:36:0x0118] A[DONT_GENERATE, DONT_INLINE]
      0x02ca: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int) binds: [B:75:0x02c8, B:67:0x0276, B:36:0x0118] A[DONT_GENERATE, DONT_INLINE]
      0x02ca: PHI (r15v3 short[]) = (r15v2 short[]), (r15v2 short[]), (r15v4 short[]) binds: [B:75:0x02c8, B:67:0x0276, B:36:0x0118] A[DONT_GENERATE, DONT_INLINE]
      0x02ca: PHI (r20v5 short[]) = (r20v4 short[]), (r20v3 short[]), (r20v3 short[]) binds: [B:75:0x02c8, B:67:0x0276, B:36:0x0118] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final boolean m39294() {
        int iM45029;
        int i;
        int i2;
        int i3 = C3660.f13403;
        int i4 = C0278.f1572;
        int iM11306 = (ThreadFactoryC3888.m11306("ܿܰ") ^ i3) * (-57);
        int i5 = ((iM11306 ^ i4) * (-6569)) ^ 760502778;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM11306 ^ 1493863365;
        char c = 0;
        short s = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1283023719;
        NetworkInfo activeNetworkInfo = null;
        String strM9869 = null;
        Object objM1777 = null;
        Application applicationM939 = null;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i4) * 4537) >> 31));
            switch (i13) {
                case -2139285773:
                case 804026323:
                    if (RunnableC0195.f1321 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܿ֡") + i3) * (-105);
                        i = ((iM45029 ^ i4) * (-8417)) ^ 851668895;
                        i2 = -810255843;
                    } else {
                        iM45029 = (C19806.m45029("۟᩷") ^ i4) * (-115);
                        i = ((iM45029 ^ i3) * 1657) ^ 1960611930;
                        i2 = -827323851;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -2005413409:
                case 547955222:
                    return false;
                case -1684999312:
                case 141133592:
                    if (C3743.f13569) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܿ֡") + i3) * (-105);
                        i = ((iM45029 ^ i4) * (-8417)) ^ 851668895;
                        i2 = -810255843;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܽۤ") ^ i3;
                        i = ((iM45029 ^ i4) * 1467) ^ 41910129;
                        i2 = -1203588649;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1675395829:
                case 1332064181:
                    applicationM939 = C0050.m939();
                    sArr2 = f53609;
                    if (C1377.f5749) {
                        iM45029 = (C19806.m45029("᩻֨") + i4) * (-83);
                        i = ((iM45029 ^ i3) * 6989) ^ (-1647222146);
                        i2 = -989378319;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۡܿ") + i3) * (-81);
                        i = ((iM45029 ^ i4) * 24807) ^ 432586960;
                        i2 = 164115191;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1489992929:
                case 869507185:
                    i10 = 12082;
                    iM45029 = C19806.m45029("᩺ۛ") ^ i3;
                    i = ((iM45029 ^ i4) * (-11657)) ^ (-1987238803);
                    i2 = -657935017;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1269128939:
                case 83309648:
                    i11 = 560;
                    if (C1398.f5802 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۡܿ") + i3) * (-81);
                        i = ((iM45029 ^ i4) * 24807) ^ 432586960;
                        i2 = 164115191;
                    } else {
                        iM45029 = (C19806.m45029("ۧ֡") ^ i3) * 49;
                        i = ((iM45029 ^ i4) * 24135) ^ (-1271274360);
                        i2 = -848747627;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1096773790:
                case -307256085:
                    s = sArr[c];
                    if (C2249.f8050 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۡܿ") + i3) * (-81);
                        i = ((iM45029 ^ i4) * 24807) ^ 432586960;
                        i2 = 164115191;
                    } else {
                        iM45029 = C19806.m45029("ܿۙ") ^ i3;
                        i = ((iM45029 ^ i4) * 23895) ^ 1694828836;
                        i2 = -1468485978;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -988340196:
                case 1392009878:
                    i12 = 12;
                    if (C2124.m6673() <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܿ֡") + i3) * (-105);
                        i = ((iM45029 ^ i4) * (-8417)) ^ 851668895;
                        i2 = -810255843;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۜ۟") ^ i4;
                        i = ((iM45029 ^ i3) * 5887) ^ (-1826549058);
                        i2 = 1974346630;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -685839824:
                case -236484637:
                    return true;
                case -538461347:
                case 727890631:
                    i8 = s * s;
                    i9 = 23155344;
                    if (C0216.f1393 != 0) {
                        iM45029 = (C19806.m45029("۟᩷") ^ i4) * (-115);
                        i = ((iM45029 ^ i3) * 1657) ^ 1960611930;
                        i2 = -827323851;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ۛ֡")) * 43;
                        i = ((iM45029 ^ i4) * 28139) ^ (-1678624191);
                        i2 = 570885530;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -406447238:
                case 811721561:
                    sArr3 = f53609;
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM45029 = (C19806.m45029("ۚۚ") + i4) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM45029 ^ i3) * 11511) ^ 1349122651;
                        i2 = 35041059;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩶ܶ") ^ i4;
                        i = ((iM45029 ^ i3) * (-28309)) ^ 102604887;
                        i2 = 1862044430;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -272722996:
                case 1993824611:
                    strM9869 = ViewTreeObserverOnPreDrawListenerC3327.m9869(sArr3, 572, 68, i10);
                    if (C1377.m4833() != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܽۤ") ^ i3;
                        i = ((iM45029 ^ i4) * 1467) ^ 41910129;
                        i2 = -1203588649;
                    } else {
                        iM45029 = C19806.m45029("֨ۙ") ^ i4;
                        i = ((iM45029 ^ i3) * (-8079)) ^ 746949864;
                        i2 = 1122991817;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -244519291:
                case 1759116130:
                    objM1777 = C0278.m1777(applicationM939, C0629.m2906(sArr2, i11, i12, i10));
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܽۤ") ^ i3;
                        i = ((iM45029 ^ i4) * 1467) ^ 41910129;
                        i2 = -1203588649;
                    } else {
                        iM45029 = C19806.m45029("ۧ᩸") ^ i3;
                        i = ((iM45029 ^ i4) * (-27875)) ^ 733567618;
                        i2 = -1479593365;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -225707108:
                case 2103467541:
                    if (activeNetworkInfo.isConnected()) {
                        iM45029 = (C19806.m45029("֫᩺") ^ i4) * 3;
                        i = ((iM45029 ^ i3) * 9855) ^ (-1829954038);
                        i2 = -330399406;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩶ۚ")) * 73;
                        i = ((iM45029 ^ i4) * (-22983)) ^ 2025967609;
                        i2 = 521321665;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 27912428:
                case 1478358085:
                    if (i7 - (i8 + i9) <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩵ܺ") ^ i3;
                        i = ((iM45029 ^ i4) * 12145) ^ 449688750;
                        i2 = -1223607193;
                    } else {
                        iM45029 = C19806.m45029("ۨۜ") ^ i4;
                        i = ((iM45029 ^ i3) * 15397) ^ (-1109805186);
                        i2 = 782532578;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 109154414:
                case 541874845:
                    RunnableC1895.m6170();
                    C0278.m1789();
                    return false;
                case 227599398:
                case 689416364:
                    C3660.m10791();
                    RunnableC3388.m10064();
                    iM45029 = (ThreadFactoryC3888.m11306("ܿ֡") + i3) * (-105);
                    i = ((iM45029 ^ i4) * (-8417)) ^ 851668895;
                    i2 = -810255843;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 228558898:
                case 1938338793:
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    if (C1419.f5860 < 0) {
                        iM45029 = (C19806.m45029("۟᩷") ^ i4) * (-115);
                        i = ((iM45029 ^ i3) * 1657) ^ 1960611930;
                        i2 = -827323851;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۡܿ") + i3) * (-81);
                        i = ((iM45029 ^ i4) * 24807) ^ 432586960;
                        i2 = 164115191;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 340213566:
                case 1662993083:
                    sArr = f53609;
                    c = 559;
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM45029 = (i4 - C19806.m45029("۫ᩴ")) * (-63);
                        i = ((iM45029 ^ i3) * 2343) ^ (-747090622);
                        i2 = 1381946901;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩶ܶ") ^ i4;
                        i = ((iM45029 ^ i3) * (-28309)) ^ 102604887;
                        i2 = 1862044430;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 375806281:
                case 1071016095:
                    i7 = s * 9624;
                    if (C3722.f13525 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩶ܶ") ^ i4;
                        i = ((iM45029 ^ i3) * (-28309)) ^ 102604887;
                        i2 = 1862044430;
                    } else {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("ۗۢ")) * 5;
                        i = ((iM45029 ^ i3) * (-30849)) ^ (-387025717);
                        i2 = 1286172977;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 549201473:
                case 1855555166:
                    i10 = 37119;
                    iM45029 = C19806.m45029("᩺ۛ") ^ i3;
                    i = ((iM45029 ^ i4) * (-11657)) ^ (-1987238803);
                    i2 = -657935017;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 1603849119:
                case 1687878194:
                    C13465.m32963(objM1777, strM9869);
                    activeNetworkInfo = ((ConnectivityManager) objM1777).getActiveNetworkInfo();
                    if (activeNetworkInfo != null) {
                        iM45029 = ThreadFactoryC3888.m11306("᩷ᩳ") ^ i3;
                        i = ((iM45029 ^ i4) * (-20007)) ^ (-999394383);
                        i2 = 1697027075;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩶ۚ")) * 73;
                        i = ((iM45029 ^ i4) * (-22983)) ^ 2025967609;
                        i2 = 521321665;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                default:
                    if (activeNetworkInfo.getState() == NetworkInfo.State.CONNECTED) {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("۫ܰ")) * (-31);
                        i = ((iM45029 ^ i3) * 1233) ^ (-113655742);
                        i2 = -1179678798;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩶ۚ")) * 73;
                        i = ((iM45029 ^ i4) * (-22983)) ^ 2025967609;
                        i2 = 521321665;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x021e A[PHI: r2 r13 r14 r15 r23
      0x021e: PHI (r2v4 java.lang.String) = (r2v1 java.lang.String), (r2v3 java.lang.String), (r2v1 java.lang.String) binds: [B:55:0x021c, B:43:0x0196, B:12:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x021e: PHI (r13v3 short[]) = (r13v2 short[]), (r13v1 short[]), (r13v1 short[]) binds: [B:55:0x021c, B:43:0x0196, B:12:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x021e: PHI (r14v3 int) = (r14v2 int), (r14v1 int), (r14v1 int) binds: [B:55:0x021c, B:43:0x0196, B:12:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x021e: PHI (r15v3 int) = (r15v2 int), (r15v1 int), (r15v1 int) binds: [B:55:0x021c, B:43:0x0196, B:12:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x021e: PHI (r23v36 java.lang.String) = (r23v24 java.lang.String), (r23v29 java.lang.String), (r23v37 java.lang.String) binds: [B:55:0x021c, B:43:0x0196, B:12:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m39266(int i, CharSequence charSequence) {
        Object obj;
        int iM11306;
        int i2;
        int i3;
        int iM45029;
        int i4;
        int i5;
        int iM450210;
        int i6;
        int i7;
        String str;
        Object objM39287 = null;
        String strM4892 = null;
        android.text.ClipboardManager clipboardManager = null;
        String strM940 = null;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        short[] sArr = null;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1286809168;
        int i14 = C0050.f912;
        int i15 = C2871.f10837;
        int iM450211 = (C19806.m45029("ۛ۫") + i14) * (-51);
        int i16 = ((iM450211 ^ i15) * (-19431)) ^ (-280560077);
        int i17 = iM450211 ^ 430505632;
        short[] sArr2 = null;
        int i18 = 0;
        int i19 = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        String strM8640 = null;
        int i20 = 0;
        short[] sArr3 = null;
        short[] sArr4 = null;
        while (true) {
            i13 = i17 ^ (i16 & (((i13 ^ i15) * 10659) >> 31));
            switch (i13) {
                case -2136169504:
                case 2062117754:
                    C2332.m7079();
                    break;
                case -2038929631:
                case 1014249161:
                    strM940 = strM940;
                    strM4892 = C1398.m4892(sArr4, 114, 66, i10);
                    if (C1398.m4895() <= 0) {
                        iM450210 = ThreadFactoryC3888.m11306("᩶ۖ") ^ i14;
                        i6 = ((iM450210 ^ i15) * 27893) ^ (-1228311787);
                        i7 = -1408609092;
                    } else {
                        iM450210 = (i14 - C19806.m45029("᩶ܳ")) * (-49);
                        i6 = ((iM450210 ^ i15) * 27419) ^ (-408974109);
                        i7 = 16265503;
                    }
                    str = strM940;
                    i17 = iM450210 ^ i7;
                    i16 = i6;
                    strM940 = str;
                    break;
                case -2016449403:
                case -1597072078:
                    sArr2 = f53609;
                    i18 = 180;
                    i19 = 3;
                    if (C1398.f5802 <= 0) {
                        iM45029 = C19806.m45029("᩺ۙ") ^ i15;
                        i4 = ((iM45029 ^ i14) * (-14059)) ^ (-1463542200);
                        i5 = -295334629;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩻֡") + i14) * (-117);
                        i4 = ((iM45029 ^ i15) * 4565) ^ (-2086806546);
                        i5 = 876423842;
                    }
                    i17 = iM45029 ^ i5;
                    i16 = i4;
                    break;
                case -2006678479:
                case 1258795897:
                    obj = objM39287;
                    strM940 = strM940;
                    s = sArr3[c];
                    s2 = 17252;
                    if (RunnableC3388.f12514 < 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܽۙ") ^ i14;
                        i2 = ((iM11306 ^ i15) * (-21727)) ^ 1723069800;
                        i3 = 214831596;
                        int i21 = iM11306 ^ i3;
                        strM940 = strM940;
                        i17 = i21;
                        i16 = i2;
                        objM39287 = obj;
                    } else {
                        objM39287 = obj;
                        iM450210 = (ThreadFactoryC3888.m11306("ᩳۤ") ^ i15) * 3;
                        i6 = ((iM450210 ^ i14) * 12601) ^ (-267979845);
                        i7 = -1892851725;
                        str = strM940;
                        i17 = iM450210 ^ i7;
                        i16 = i6;
                        strM940 = str;
                    }
                    break;
                case -1995525970:
                case 1954952342:
                    i10 = 28776;
                    iM450210 = C19806.m45029("᩻᩺") ^ i15;
                    i6 = ((iM450210 ^ i14) * (-11607)) ^ 1775033650;
                    i7 = 2061406907;
                    str = strM940;
                    i17 = iM450210 ^ i7;
                    i16 = i6;
                    strM940 = str;
                    break;
                case -1745606940:
                case -5693685:
                    if (!C1668.m5583()) {
                        strM940 = strM940;
                        iM450210 = ThreadFactoryC3888.m11306("ᩴۗ") ^ i14;
                        i6 = ((iM450210 ^ i15) * (-2403)) ^ (-84183702);
                        i7 = 167216397;
                        str = strM940;
                        i17 = iM450210 ^ i7;
                        i16 = i6;
                        strM940 = str;
                    } else {
                        int iM450212 = C19806.m45029("ܿۤ") ^ i15;
                        obj = objM39287;
                        i2 = ((iM450212 ^ i14) * (-9807)) ^ 338194256;
                        i17 = iM450212 ^ 844912361;
                        i16 = i2;
                        objM39287 = obj;
                    }
                    break;
                case -1724813567:
                case -1515559952:
                    try {
                        C1668.m5582(i);
                        strM940 = strM940;
                        iM450210 = C19806.m45029("ܳܳ") ^ i15;
                        i6 = ((iM450210 ^ i14) * 16165) ^ (-1887069285);
                        i7 = -1532001811;
                    } catch (Throwable unused) {
                        strM940 = strM940;
                        iM450210 = ThreadFactoryC3888.m11306("ۗۨ") ^ i14;
                        i6 = ((iM450210 ^ i15) * 28919) ^ 1331179205;
                        i7 = -320545248;
                    }
                    str = strM940;
                    i17 = iM450210 ^ i7;
                    i16 = i6;
                    strM940 = str;
                    break;
                case -1715880848:
                case 1822653222:
                    obj = objM39287;
                    strM940 = strM940;
                    c = 'h';
                    if (!C0817.f3443) {
                        objM39287 = obj;
                        iM450210 = (ThreadFactoryC3888.m11306("ᩳۤ") ^ i15) * 3;
                        i6 = ((iM450210 ^ i14) * 12601) ^ (-267979845);
                        i7 = -1892851725;
                        str = strM940;
                        i17 = iM450210 ^ i7;
                        i16 = i6;
                        strM940 = str;
                    } else {
                        iM11306 = C19806.m45029("ۖܽ") ^ i14;
                        i2 = ((iM11306 ^ i15) * 18335) ^ 381215728;
                        i3 = 120451517;
                        int i22 = iM11306 ^ i3;
                        strM940 = strM940;
                        i17 = i22;
                        i16 = i2;
                        objM39287 = obj;
                    }
                    break;
                case -1578703147:
                case 264700918:
                    strM940 = strM940;
                    if (i20 - (i8 + i9) <= 0) {
                        iM450210 = (C19806.m45029("᩺᩵") ^ i15) * (-77);
                        i6 = ((iM450210 ^ i14) * (-3307)) ^ (-1408798747);
                        i7 = -721061314;
                    } else {
                        iM450210 = (i14 - C19806.m45029("ۖܶ")) * (-127);
                        i6 = ((iM450210 ^ i15) * 11887) ^ (-1953019655);
                        i7 = 1137469909;
                    }
                    str = strM940;
                    i17 = iM450210 ^ i7;
                    i16 = i6;
                    strM940 = str;
                    break;
                case -1490160264:
                case 1626376063:
                    strM940 = strM940;
                    try {
                        clipboardManager.setText(charSequence);
                        int iM450213 = C19806.m45029("ۚۡ") ^ i15;
                        i16 = ((iM450213 ^ i14) * (-27603)) ^ 1726598295;
                        str = strM940;
                        i17 = iM450213 ^ (-1737321006);
                    } catch (Throwable unused2) {
                        iM450210 = ThreadFactoryC3888.m11306("ۗۨ") ^ i14;
                        i6 = ((iM450210 ^ i15) * 28919) ^ 1331179205;
                        i7 = -320545248;
                        str = strM940;
                        i17 = iM450210 ^ i7;
                        i16 = i6;
                    }
                    strM940 = str;
                    break;
                case -1117720086:
                case -936521880:
                    strM940 = strM940;
                    sArr = f53609;
                    i11 = IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i12 = 9;
                    if (C2332.f8260) {
                        iM450210 = ThreadFactoryC3888.m11306("ܿۘ") ^ i14;
                        i6 = ((iM450210 ^ i15) * 23645) ^ 1924580455;
                        i7 = 796501459;
                    } else {
                        iM450210 = ThreadFactoryC3888.m11306("᩶ۖ") ^ i14;
                        i6 = ((iM450210 ^ i15) * 27893) ^ (-1228311787);
                        i7 = -1408609092;
                    }
                    str = strM940;
                    i17 = iM450210 ^ i7;
                    i16 = i6;
                    strM940 = str;
                    break;
                case -1006803579:
                case 1254957758:
                    strM940 = strM940;
                    objM39287 = m39287(strM8640);
                    sArr4 = f53609;
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM450210 = C19806.m45029("ᩳ᩷") ^ i15;
                        i6 = ((iM450210 ^ i14) * 32361) ^ 205613675;
                        i7 = -1903728095;
                    } else {
                        iM450210 = (ThreadFactoryC3888.m11306("ᩳۤ") ^ i15) * 3;
                        i6 = ((iM450210 ^ i14) * 12601) ^ (-267979845);
                        i7 = -1892851725;
                    }
                    str = strM940;
                    i17 = iM450210 ^ i7;
                    i16 = i6;
                    strM940 = str;
                    break;
                case -896444748:
                case 456181409:
                    strM940 = C0050.m940(sArr2, i18, i19, i10);
                    if (!C19806.f63586) {
                        iM45029 = C19806.m45029("᩶ۡ") ^ i15;
                        i4 = ((iM45029 ^ i14) * (-4629)) ^ 174885471;
                        i5 = -2076647093;
                        i17 = iM45029 ^ i5;
                        i16 = i4;
                    } else {
                        int iM450214 = C19806.m45029("ܿۤ") ^ i15;
                        obj = objM39287;
                        i2 = ((iM450214 ^ i14) * (-9807)) ^ 338194256;
                        i17 = iM450214 ^ 844912361;
                        i16 = i2;
                        objM39287 = obj;
                    }
                    break;
                case -889233705:
                case -444311961:
                    obj = objM39287;
                    strM940 = strM940;
                    sArr3 = f53609;
                    if (C0216.f1393 == 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֫ܰ") ^ i15;
                        i2 = ((iM11306 ^ i14) * (-19211)) ^ (-376624572);
                        i3 = -564928689;
                        int i23 = iM11306 ^ i3;
                        strM940 = strM940;
                        i17 = i23;
                        i16 = i2;
                        objM39287 = obj;
                    } else {
                        objM39287 = obj;
                        iM450210 = (ThreadFactoryC3888.m11306("ᩳۤ") ^ i15) * 3;
                        i6 = ((iM450210 ^ i14) * 12601) ^ (-267979845);
                        i7 = -1892851725;
                        str = strM940;
                        i17 = iM450210 ^ i7;
                        i16 = i6;
                        strM940 = str;
                    }
                    break;
                case -695907856:
                case 1553376264:
                    C0526.m2437();
                    if (C0050.f912 > 0) {
                        strM940 = strM940;
                        iM450210 = ThreadFactoryC3888.m11306("᩶ۖ") ^ i14;
                        i6 = ((iM450210 ^ i15) * 27893) ^ (-1228311787);
                        i7 = -1408609092;
                        str = strM940;
                        i17 = iM450210 ^ i7;
                        i16 = i6;
                        strM940 = str;
                    } else {
                        int iM450215 = C19806.m45029("ܿۤ") ^ i15;
                        obj = objM39287;
                        i2 = ((iM450215 ^ i14) * (-9807)) ^ 338194256;
                        i17 = iM450215 ^ 844912361;
                        i16 = i2;
                        objM39287 = obj;
                    }
                    break;
                case -534514049:
                case -362968335:
                    C19806.m45024();
                    C0671.m3008();
                    int iM450216 = C19806.m45029("ܿۤ") ^ i15;
                    obj = objM39287;
                    i2 = ((iM450216 ^ i14) * (-9807)) ^ 338194256;
                    i17 = iM450216 ^ 844912361;
                    i16 = i2;
                    objM39287 = obj;
                    break;
                case -182943521:
                case 919324908:
                    C1189.m4360(ThreadFactoryC3888.m11306(strM940) ^ 2120310043);
                    break;
                case -104221237:
                case 357247968:
                    i10 = 16735;
                    iM450210 = C19806.m45029("᩻᩺") ^ i15;
                    i6 = ((iM450210 ^ i14) * (-11607)) ^ 1775033650;
                    i7 = 2061406907;
                    str = strM940;
                    i17 = iM450210 ^ i7;
                    i16 = i6;
                    strM940 = str;
                    break;
                case -18569338:
                case 713186329:
                    if (i != -1) {
                        iM450210 = ThreadFactoryC3888.m11306("ܳۧ") ^ i14;
                        strM940 = strM940;
                        i6 = ((iM450210 ^ i15) * (-12417)) ^ (-1543714316);
                        i7 = -719646474;
                    } else {
                        strM940 = strM940;
                        iM450210 = C19806.m45029("ܳܳ") ^ i15;
                        i6 = ((iM450210 ^ i14) * 16165) ^ (-1887069285);
                        i7 = -1532001811;
                    }
                    str = strM940;
                    i17 = iM450210 ^ i7;
                    i16 = i6;
                    strM940 = str;
                    break;
                case 97793232:
                case 1666440009:
                    strM940 = strM940;
                    strM8640 = C2871.m8640(sArr, i11, i12, i10);
                    if (C0629.f2722 <= 0) {
                        iM450210 = ThreadFactoryC3888.m11306("ᩴۗ") ^ i14;
                        i6 = ((iM450210 ^ i15) * (-2403)) ^ (-84183702);
                        i7 = 167216397;
                    } else {
                        iM450210 = ThreadFactoryC3888.m11306("ۗۜ") ^ i14;
                        i6 = ((iM450210 ^ i15) * (-25165)) ^ 1278140997;
                        i7 = -1881725309;
                    }
                    str = strM940;
                    i17 = iM450210 ^ i7;
                    i16 = i6;
                    strM940 = str;
                    break;
                case 1088712499:
                case 1919417832:
                    strM940 = strM940;
                    i20 = s * s2;
                    i8 = s * s;
                    i9 = 74407876;
                    if (!CallableC1627.f6528) {
                        strM940 = strM940;
                        int iM450217 = C19806.m45029("ܿۤ") ^ i15;
                        obj = objM39287;
                        i2 = ((iM450217 ^ i14) * (-9807)) ^ 338194256;
                        i17 = iM450217 ^ 844912361;
                        i16 = i2;
                        objM39287 = obj;
                    } else {
                        obj = objM39287;
                        iM11306 = ThreadFactoryC3888.m11306("ܺ۬") ^ i15;
                        i2 = ((iM11306 ^ i14) * (-31777)) ^ (-157403168);
                        i3 = 320213675;
                        int i24 = iM11306 ^ i3;
                        strM940 = strM940;
                        i17 = i24;
                        i16 = i2;
                        objM39287 = obj;
                    }
                    break;
                case 1172186637:
                case 1974942139:
                    if (C0216.f1393 == 0) {
                        iM45029 = C19806.m45029("᩺ۙ") ^ i15;
                        i4 = ((iM45029 ^ i14) * (-14059)) ^ (-1463542200);
                        i5 = -295334629;
                        i17 = iM45029 ^ i5;
                        i16 = i4;
                    } else {
                        strM940 = strM940;
                        iM450210 = ThreadFactoryC3888.m11306("᩶ۖ") ^ i14;
                        i6 = ((iM450210 ^ i15) * 27893) ^ (-1228311787);
                        i7 = -1408609092;
                        str = strM940;
                        i17 = iM450210 ^ i7;
                        i16 = i6;
                        strM940 = str;
                    }
                    break;
                case 1759915124:
                case 1821302629:
                    strM940 = strM940;
                    C13465.m32963(objM39287, strM4892);
                    clipboardManager = (android.text.ClipboardManager) objM39287;
                    iM450210 = (ThreadFactoryC3888.m11306("۟ܳ") + i15) * 7;
                    i6 = ((iM450210 ^ i14) * 28037) ^ 85599144;
                    i7 = 1136357944;
                    str = strM940;
                    i17 = iM450210 ^ i7;
                    i16 = i6;
                    strM940 = str;
                    break;
            }
            return;
        }
    }
}
