package l;

import android.view.View;
import bin.mt.plus.Main;
import com.alipay.sdk.m.y.q;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: renamed from: l.ۨ֡᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 164Z */
/* JADX INFO: loaded from: classes4.dex */
public final class C11359 extends AbstractViewOnClickListenerC6314 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f38310 = 0;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final HashSet f38311;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public static final C16609 f38312;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final LinkedHashMap f38313;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public static boolean f38314;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public static boolean f38315;

    /* JADX INFO: renamed from: ᩵ۛۘ, reason: not valid java name and contains not printable characters */
    private static final short[] f38316 = {100, 22397, 22378, -13722, 15863, -8479, 22395, 22368, 22368, 22371, 22306, 22397, 22378, 22380, 22390, 22380, 22371, 22378, 22306, 22381, 22374, 22369, 22399, 22395, 1751, -12413, -13252, 22395, 22368, 22368, 22371, 22306, 22382, 22399, 22399, 22306, 22399, 22397, 22368, 22395, 22378, 22380, 22395, 22399, 22370, 11445, -14461, -13679, 22395, 22368, 22368, 22371, 22306, 22399, 22371, 22394, 22376, 22374, 22369, 22306, 22370, 22382, 22369, 22382, 22376, 22378, 22397, 22370, 11386, 2704, -9088, 22395, 22368, 22368, 22371, 22306, 22397, 22378, 22370, 22368, 22395, 22378, 22306, 22370, 22382, 22369, 22382, 22376, 22378, 22380, 22368, -11357, 9513, 9328, 22395, 22368, 22368, 22371, 22306, 22380, 22368, 22371, 22368, 22397, 22306, 22399, 22374, 22380, 22372, 22378, 22397, 22396, 22372, 9068, 15272, 12564, 22395, 22368, 22368, 22371, 22306, 22396, 22374, 22376, 22369, 22382, 22395, 22394, 22397, 22378, 22306, 22372, 22378, 22390, 22380, 22399, 15842, 16166, -12167, 22395, 22368, 22368, 22371, 22306, 22380, 22368, 22370, 22370, 22368, 22369, 22306, 22399, 22382, 22396, 22396, 22392, 22368, 22397, 22379, 22396, 22395, 22394, 3130, -11849, 10440, 22395, 22368, 22368, 22371, 22306, 22395, 22394, 22395, 22368, 22397, 22374, 22382, 22371, 22378, 22382, 8626, 1972, 3675, 22395, 22368, 22368, 22371, 22306, 22378, 22391, 22395, 22397, 22382, 22380, 22395, 22306, 22382, 22399, 22372, 22395, 22391, 13311, 11477, 2669, 22395, 22368, 22368, 22371, 22306, 22395, 22378, 22391, 22395, 22306, 22378, 22379, 22374, 22395, 22368, 22397, 22370, 22399, 15239, -10205, 2706, 22395, 22368, 22368, 22371, 22306, 22370, 22394, 22396, 22374, 22380, 22306, 22399, 22371, 22382, 22390, 22378, 22397, 22396, 22399, 10896, 14281, -11240, 22395, 22368, 22368, 22371, 22306, 22396, 22395, 22397, 22378, 22382, 22370, 22306, 22370, 22378, 22379, 22374, 22382, 22395, 22378, -9691, 14305, 1043, 22395, 22368, 22368, 22371, 22306, 22395, 22378, 22397, 22370, 22374, 22369, 22382, 22371, 22370, 22380, 13671, 1408, -15572, 22395, 22368, 22368, 22371, 22306, 22382, 22399, 22372, 22306, 22370, 22380, 22399, 22382, 22397, 3943, -14807, 6145, 22395, 22368, 22368, 22371, 22306, 22382, 22380, 22395, 22374, 22393, 22374, 22395, 22390, 22306, 22397, 22378, 22380, 22368, 22397, 22379, 22396, 22398, -9772, 816, -9626, 22395, 22368, 22368, 22371, 22306, 22396, 22370, 22382, 22371, 22374, 22306, 22398, 22394, 22378, 22397, 22390, 22397, 22399, 5, 3785, 1373, 22395, 22368, 22368, 22371, 22306, 22397, 22378, 22370, 22368, 22395, 22378, 22306, 22399, 22382, 22390, 22371, 22368, 22382, 22379, 904, -29840, -29573, 24809, 5892, -28506, 25544, -32334, 29770, -26245, -27440, -29273, -29866, -26581, 7039, 8548, 8556, 8567, 8567, 8564, 8555, 8519, 8560, 8561, 8572, 8572, 8573, 8566, 8565, 8567, 1270, -1464, -1472, -1445, -1445, -1448, -1465, -1429, -1444, -1443, -1456, -1456, -1455, -1446, 7906, 8947, -4313, -11917, -9866, 13468, -16075, -4205, -11290, -15929, -10483, 13860, 14967, -15660, 14771, -14747, -8494, 13753, 12135, -14423, 12434, 9435, 10763, -15482, 9413, -11694, 10908, 8954, 12640, -6706, 9980, 4442, 22163, -19941, -16691, 12806, 12804, 17214, -19539, -22231, 16816, 32234, 28637, -23899, 26977, 26618, 3695, -16085, 13503, 16192, 1202, -11311, 16058, -9500, 3800, 12370, -10834, -16086, -14600, 10458, -11462, -10403, 5903, 11544, 11523, 11523, 11520, 11551, 11571, 11551, 11523, 11550, 11544, 11568, 11536, 2722, -3094, -3096, 1291, -20610, -20618, -20627, -20627, -20626, -20623, -20643, -20623, -20627, -20624, -20618, 715, 26090, 26097, 26097, 26098, 26093, 26049, 26102, 26103, 26106, 26106, 26107, 26096, 26050, 26082, 26109, 26097, 26082, 26093, 26101, 26082, 26109, 26094, 26082, 26099, 26094, 26082, 26093, 26094, 26082, 26093, 26095, 26082, 26092, 26094, 714, 30389, 30391, 30378, 30385, 30368, 30374, 30385, 30441, 30385, 30384, 30385, 30378, 30391, 30380, 30372, 30377, 30372, 30369, 30372, 30369, 30362, 30381, 30380, 30369, 30368, 30362, 30378, 30375, 30383, 30390, 30381, 30378, 30386, 30362, 30372, 30369, 30362, 30380, 30379, 30362, 30385, 30378, 30378, 30377, 30390, 30376, 30378, 4737, -20409, 28293, 26138, 32135, -19263, -22808, 3432, -26673, 20454, 23528};

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C14600 f38317;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C2059 f38318;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C14600 f38319;

    /* JADX WARN: Code duplicated, block: B:99:0x050c A[PHI: r4 r16 r17 r21 r22
      0x050c: PHI (r4v18 int) = (r4v6 int), (r4v7 int), (r4v8 int), (r4v19 int) binds: [B:98:0x050a, B:94:0x04e7, B:90:0x04c5, B:20:0x008e] A[DONT_GENERATE, DONT_INLINE]
      0x050c: PHI (r16v4 short[]) = (r16v2 short[]), (r16v2 short[]), (r16v3 short[]), (r16v2 short[]) binds: [B:98:0x050a, B:94:0x04e7, B:90:0x04c5, B:20:0x008e] A[DONT_GENERATE, DONT_INLINE]
      0x050c: PHI (r17v19 int) = (r17v7 int), (r17v8 int), (r17v9 int), (r17v20 int) binds: [B:98:0x050a, B:94:0x04e7, B:90:0x04c5, B:20:0x008e] A[DONT_GENERATE, DONT_INLINE]
      0x050c: PHI (r21v34 int) = (r21v5 int), (r21v6 int), (r21v7 int), (r21v35 int) binds: [B:98:0x050a, B:94:0x04e7, B:90:0x04c5, B:20:0x008e] A[DONT_GENERATE, DONT_INLINE]
      0x050c: PHI (r22v30 l.۫۬) = (r22v8 l.۫۬), (r22v9 l.۫۬), (r22v10 l.۫۬), (r22v31 l.۫۬) binds: [B:98:0x050a, B:94:0x04e7, B:90:0x04c5, B:20:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0071, code lost:
    
        if (l.MenuItemOnMenuItemClickListenerC3244.f12064 < 0) goto L12;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m28449(final l.C11359 r26, android.view.View r27, final l.InterfaceC4302 r28, boolean r29, final l.DialogInterfaceC19356 r30, final java.lang.Runnable r31, final l.RunnableC20405 r32) {
        /*
            Method dump skipped, instruction units count: 1650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11359.m28449(l.ۨ֡᩹, android.view.View, l.ۙ֡᩹, boolean, l.᩵ۡۜ, java.lang.Runnable, l.᩶᩶᩹):void");
    }

    /* JADX WARN: Code duplicated, block: B:116:0x043d A[PHI: r11 r12
      0x043d: PHI (r11v76 int) = (r11v17 int), (r11v2 int), (r11v2 int) binds: [B:115:0x043b, B:32:0x00d8, B:20:0x008d] A[DONT_GENERATE, DONT_INLINE]
      0x043d: PHI (r12v4 int) = (r12v3 int), (r12v2 int), (r12v2 int) binds: [B:115:0x043b, B:32:0x00d8, B:20:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:139:0x0545 A[PHI: r20
      0x0545: PHI (r20v36 int) = (r20v3 int), (r20v5 int), (r20v33 int), (r20v39 int) binds: [B:138:0x0543, B:128:0x04c9, B:42:0x0108, B:30:0x00cf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:143:0x0577 A[PHI: r20
      0x0577: PHI (r20v37 int) = (r20v2 int), (r20v6 int), (r20v38 int) binds: [B:142:0x0575, B:124:0x04a8, B:29:0x00cb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x0210 A[PHI: r20
      0x0210: PHI (r20v26 int) = (r20v23 int), (r20v27 int) binds: [B:71:0x01f7, B:57:0x0168] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0085, code lost:
    
        if (l.C2249.f8050 < 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d8, code lost:
    
        if (l.MenuItemOnMenuItemClickListenerC3244.f12064 < 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e0, code lost:
    
        if (l.AbstractC0464.f2088 > 0) goto L29;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m28453(l.C11359 r23, java.lang.Runnable r24, l.DialogInterfaceC19356 r25, java.lang.String r26, java.lang.Runnable r27, l.InterfaceC4302 r28, android.view.MenuItem r29) {
        /*
            Method dump skipped, instruction units count: 1794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11359.m28453(l.ۨ֡᩹, java.lang.Runnable, l.᩵ۡۜ, java.lang.String, java.lang.Runnable, l.ۙ֡᩹, android.view.MenuItem):boolean");
    }

    static {
        C0690 c0690;
        C14637 c14637;
        String str;
        C9698 c9698;
        String str2;
        short[] sArr;
        C0690 c0691;
        int i;
        int i2;
        short[] sArr2;
        C0690 c0692;
        int i3;
        C15467 c15467;
        int i4;
        String str3;
        C12520 c12520;
        C0690 c0693;
        int i5;
        int i6;
        C4882 c4882;
        C0690 c0694;
        short[] sArr3;
        String str4;
        String str5;
        int i7;
        C0690 c0695;
        String str6;
        int i8;
        C0690 c0696;
        String str7;
        String str8;
        C4882 c4883;
        String str9;
        C0690 c0697;
        C0690 c0698;
        String str10;
        C1935 c1935;
        String str11;
        String str12;
        C0690 c0699;
        C6999 c6999;
        short[] sArr4;
        short[] sArr5;
        short[] sArr6;
        short[] sArr7;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        C0690 c06910;
        C23809 c23809;
        C22522 c22522;
        String str13;
        C0690 c06911;
        C1354 c1354;
        String str14;
        C22522 c22523;
        String str15;
        int i16;
        int i17;
        short[] sArr8;
        String str16;
        int i18;
        C0690 c06912;
        C13350 c13350;
        String str17;
        C0690 c06913;
        C12520 c12521;
        C0690 c06914;
        C14637 c14638;
        String str18;
        C0690 c06915;
        C0690 c06916;
        C1935 c1936;
        String str19;
        short[] sArr9;
        short[] sArr10;
        short[] sArr11;
        short[] sArr12;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        C0690 c06917;
        C23809 c238010;
        C6999 c69910;
        short[] sArr13;
        int i29;
        String str20;
        String str21;
        short[] sArr14;
        short[] sArr15;
        int i30;
        int i31;
        int iM45029;
        int i32;
        int i33;
        String str22;
        int i34;
        String str23;
        C4882 c4884;
        int iM11306;
        int i35;
        C0690 c06918;
        String str24;
        C17458 c17458;
        C0690 c06919;
        int i36;
        short[] sArr16;
        int i37;
        C0690 c06920;
        C14637 c14639;
        String str25;
        int i38;
        C0690 c06921;
        C0690 c06922;
        short[] sArr17;
        int i39;
        String strM5070 = null;
        int i40 = -882169818;
        int i41 = C1148.f5161;
        int i42 = C3535.f13026;
        int iM11307 = (ThreadFactoryC3888.m11306("ۢ֡") ^ i41) * 101;
        int i43 = ((iM11307 ^ i42) * (-1735)) ^ (-2144992715);
        int i44 = iM11307 ^ (-719234582);
        int iM11308 = 0;
        int i45 = 0;
        int i46 = 0;
        int i47 = 0;
        int iM450210 = 0;
        C0690 c06923 = null;
        C23809 c238011 = null;
        String str26 = null;
        C0690 c06924 = null;
        C1935 c1937 = null;
        String strM6918 = null;
        C0690 c06925 = null;
        C22522 c22524 = null;
        String strM4892 = null;
        C0690 c06926 = null;
        C1354 c1355 = null;
        String strM940 = null;
        C0690 c06927 = null;
        C13350 c13351 = null;
        String strM7604 = null;
        C0690 c06928 = null;
        C4176 c4176 = null;
        String str27 = null;
        C0690 c06929 = null;
        C6999 c69911 = null;
        String strM6241 = null;
        String strM5577 = null;
        short[] sArr18 = null;
        short[] sArr19 = null;
        short[] sArr20 = null;
        short[] sArr21 = null;
        short[] sArr22 = null;
        short[] sArr23 = null;
        short[] sArr24 = null;
        short[] sArr25 = null;
        short[] sArr26 = null;
        short[] sArr27 = null;
        C0690 c06930 = null;
        int i48 = 0;
        int iM450211 = 0;
        int iM450212 = 0;
        int iM11309 = 0;
        int iM113010 = 0;
        int iM450213 = 0;
        int i49 = 0;
        int i50 = 0;
        int i51 = 0;
        int i52 = 0;
        int i53 = 0;
        int i54 = 0;
        int i55 = 0;
        int i56 = 0;
        int i57 = 0;
        int iM113011 = 0;
        int iM450214 = 0;
        String str28 = null;
        C15467 c15468 = null;
        String str29 = null;
        C0690 c06931 = null;
        C0690 c06932 = null;
        C6169 c6169 = null;
        String str30 = null;
        C11109 c11109 = null;
        C0690 c06933 = null;
        C0690 c06934 = null;
        C9698 c9699 = null;
        String str31 = null;
        short[] sArr28 = null;
        short[] sArr29 = null;
        int i58 = 0;
        int i59 = 0;
        int i60 = 0;
        C12520 c12522 = null;
        C0690 c06935 = null;
        C0690 c06936 = null;
        C14637 c146310 = null;
        String str32 = null;
        C0690 c06937 = null;
        String str33 = null;
        short[] sArr30 = null;
        int i61 = 0;
        C0690 c06938 = null;
        String str34 = null;
        C17458 c17459 = null;
        String str35 = null;
        C5588 c5588 = null;
        short[] sArr31 = null;
        C4882 c4885 = null;
        String str36 = null;
        short[] sArr32 = null;
        while (true) {
            i40 = i44 ^ (i43 & (((i40 ^ i42) * (-28545)) >> 31));
            switch (i40) {
                case -2137781581:
                case -819241225:
                    str8 = str31;
                    c0696 = c06934;
                    i59 = 22287;
                    iM45029 = (i41 - ThreadFactoryC3888.m11306("ۛ᩻")) * (-109);
                    i32 = ((iM45029 ^ i42) * 32327) ^ (-227734526);
                    i33 = -1939884242;
                    i39 = iM45029 ^ i33;
                    c06926 = c06926;
                    c1355 = c1355;
                    strM940 = strM940;
                    c06930 = c06930;
                    str22 = str28;
                    c4884 = c4885;
                    i34 = i39;
                    i43 = i32;
                    i49 = i49;
                    str23 = str8;
                    str36 = str36;
                    iM113011 = iM113011;
                    sArr18 = sArr18;
                    iM450212 = iM450212;
                    sArr19 = sArr19;
                    sArr22 = sArr22;
                    i51 = i51;
                    i53 = i53;
                    i50 = i50;
                    i52 = i52;
                    iM11309 = iM11309;
                    iM113010 = iM113010;
                    c06931 = c06931;
                    sArr24 = sArr24;
                    i55 = i55;
                    i56 = i56;
                    c1937 = c1937;
                    strM6918 = strM6918;
                    iM450214 = iM450214;
                    c06929 = c06929;
                    c69911 = c69911;
                    c06923 = c06923;
                    sArr25 = sArr25;
                    sArr26 = sArr26;
                    str26 = str26;
                    c238011 = c238011;
                    sArr21 = sArr21;
                    sArr27 = sArr27;
                    c06927 = c06927;
                    c13351 = c13351;
                    i57 = i57;
                    strM7604 = strM7604;
                    iM450213 = iM450213;
                    c06928 = c06928;
                    c4176 = c4176;
                    str27 = str27;
                    i48 = i48;
                    c06925 = c06925;
                    c22524 = c22524;
                    strM4892 = strM4892;
                    i44 = i34;
                    c9699 = c9699;
                    c06933 = c06933;
                    c06932 = c06932;
                    c06935 = c06935;
                    str30 = str30;
                    i58 = i58;
                    sArr29 = sArr29;
                    str32 = str32;
                    c12522 = c12522;
                    c4885 = c4884;
                    c146310 = c146310;
                    sArr30 = sArr30;
                    c17459 = c17459;
                    str34 = str34;
                    str28 = str22;
                    str35 = str35;
                    short[] sArr33 = sArr20;
                    str31 = str23;
                    c11109 = c11109;
                    c06934 = c0696;
                    sArr20 = sArr33;
                    break;
                case -2123926164:
                case -1842920719:
                    str35 = str35;
                    i58 = i58;
                    sArr29 = sArr29;
                    c4883 = c4885;
                    str9 = str28;
                    c0697 = c06931;
                    c12522 = c12522;
                    str34 = str34;
                    c06933 = c06933;
                    c146310 = c146310;
                    str32 = str32;
                    c06935 = c06935;
                    c17459 = c17459;
                    str36 = str36;
                    sArr30 = sArr30;
                    c06932 = c06932;
                    str30 = str30;
                    c9699 = c9699;
                    str8 = str31;
                    c0698 = c06923;
                    str10 = str26;
                    c1935 = c1937;
                    str11 = strM6918;
                    str12 = strM7604;
                    c0699 = c06929;
                    c6999 = c69911;
                    sArr4 = sArr18;
                    sArr5 = sArr19;
                    sArr22 = sArr22;
                    sArr6 = sArr24;
                    sArr7 = sArr26;
                    i9 = iM450212;
                    iM11309 = iM11309;
                    iM113010 = iM113010;
                    i10 = iM450213;
                    i11 = i49;
                    i50 = i50;
                    i51 = i51;
                    i52 = i52;
                    i53 = i53;
                    i12 = i55;
                    i13 = i56;
                    i14 = iM113011;
                    i15 = iM450214;
                    c06910 = c06930;
                    c23809 = c238011;
                    sArr20 = sArr20;
                    c0696 = c06934;
                    c11109 = c11109;
                    c22522 = c22524;
                    str13 = strM4892;
                    c06911 = c06926;
                    c1354 = c1355;
                    str14 = strM940;
                    m28445(str14, iM450210 ^ 2098196693, c06911, C2704.m8240(f38316, 269, 13, i59), c1354);
                    C0690 c06939 = C0690.f2910;
                    C13350 c13352 = new C13350();
                    short[] sArr34 = f38316;
                    int iM113012 = (ThreadFactoryC3888.m11306("ۛۚ") + i42) * (-79);
                    i43 = ((iM113012 ^ i41) * 21077) ^ (-1376632519);
                    c13351 = c13352;
                    sArr25 = sArr34;
                    i44 = iM113012 ^ (-207557942);
                    c06927 = c06939;
                    c06926 = c06911;
                    c1355 = c1354;
                    strM940 = str14;
                    c06930 = c06910;
                    i49 = i11;
                    sArr22 = sArr22;
                    i51 = i51;
                    i53 = i53;
                    i50 = i50;
                    c11109 = c11109;
                    i52 = i52;
                    i58 = i58;
                    str35 = str35;
                    iM11309 = iM11309;
                    iM113010 = iM113010;
                    iM113011 = i14;
                    sArr18 = sArr4;
                    iM450212 = i9;
                    c06931 = c0697;
                    sArr24 = sArr6;
                    i55 = i12;
                    i56 = i13;
                    c1937 = c1935;
                    strM6918 = str11;
                    iM450214 = i15;
                    sArr19 = sArr5;
                    str28 = str9;
                    c06929 = c0699;
                    c69911 = c6999;
                    c06923 = c0698;
                    sArr26 = sArr7;
                    str26 = str10;
                    c238011 = c23809;
                    sArr21 = sArr21;
                    strM7604 = str12;
                    iM450213 = i10;
                    c06925 = c06925;
                    c22524 = c22522;
                    strM4892 = str13;
                    c9699 = c9699;
                    c06933 = c06933;
                    c06932 = c06932;
                    c06935 = c06935;
                    str30 = str30;
                    c06934 = c0696;
                    sArr20 = sArr20;
                    sArr29 = sArr29;
                    str32 = str32;
                    c12522 = c12522;
                    c146310 = c146310;
                    sArr30 = sArr30;
                    str31 = str8;
                    c17459 = c17459;
                    str36 = str36;
                    str34 = str34;
                    c4885 = c4883;
                    break;
                case -2121749532:
                case 1248322587:
                    str35 = str35;
                    i58 = i58;
                    sArr29 = sArr29;
                    c4883 = c4885;
                    String str37 = str28;
                    c06931 = c06931;
                    c12522 = c12522;
                    str34 = str34;
                    c06933 = c06933;
                    c146310 = c146310;
                    str32 = str32;
                    c06935 = c06935;
                    c17459 = c17459;
                    str36 = str36;
                    sArr30 = sArr30;
                    c06932 = c06932;
                    str30 = str30;
                    c9699 = c9699;
                    str8 = str31;
                    c06923 = c06923;
                    str26 = str26;
                    c1937 = c1937;
                    strM6918 = strM6918;
                    c06927 = c06927;
                    c13351 = c13351;
                    strM7604 = strM7604;
                    c06928 = c06928;
                    c4176 = c4176;
                    c06929 = c06929;
                    c69911 = c69911;
                    sArr18 = sArr18;
                    sArr19 = sArr19;
                    sArr21 = sArr21;
                    sArr22 = sArr22;
                    sArr24 = sArr24;
                    sArr25 = sArr25;
                    sArr26 = sArr26;
                    sArr27 = sArr27;
                    iM450212 = iM450212;
                    iM11309 = iM11309;
                    iM113010 = iM113010;
                    iM450213 = iM450213;
                    i49 = i49;
                    i50 = i50;
                    i51 = i51;
                    i52 = i52;
                    i53 = i53;
                    i55 = i55;
                    i56 = i56;
                    i57 = i57;
                    iM113011 = iM113011;
                    iM450214 = iM450214;
                    C0690 c06940 = c06930;
                    c238011 = c238011;
                    sArr20 = sArr20;
                    c0696 = c06934;
                    c11109 = c11109;
                    str27 = str27;
                    i48 = i48;
                    C0690 c06941 = c06925;
                    c22523 = c22524;
                    str15 = strM4892;
                    m28445(str15, C19806.m45029(strM5070) ^ 2129773833, c06941, C2477.m7604(f38316, 247, 17, i59), c22523);
                    c06926 = C0690.f2931;
                    c1355 = new C1354();
                    c06925 = c06941;
                    strM940 = C0050.m940(f38316, 264, 2, i59);
                    iM450210 = C19806.m45029(ThreadFactoryC3888.m11312(f38316, 266, 3, i59));
                    if (RunnableC1895.m6170() == 0) {
                        int iM113013 = (i41 - ThreadFactoryC3888.m11306("ۙۙ")) * 25;
                        i16 = ((iM113013 ^ i42) * (-25263)) ^ 713468909;
                        i17 = iM113013 ^ (-116805629);
                        c22524 = c22523;
                        strM4892 = str15;
                        c06930 = c06940;
                        i49 = i49;
                        sArr22 = sArr22;
                        i51 = i51;
                        i53 = i53;
                        i50 = i50;
                        i52 = i52;
                        i58 = i58;
                        str35 = str35;
                        iM11309 = iM11309;
                        iM113010 = iM113010;
                        iM113011 = iM113011;
                        sArr18 = sArr18;
                        iM450212 = iM450212;
                        c06931 = c06931;
                        sArr24 = sArr24;
                        i55 = i55;
                        i56 = i56;
                        c1937 = c1937;
                        strM6918 = strM6918;
                        iM450214 = iM450214;
                        sArr19 = sArr19;
                        str28 = str37;
                        c06929 = c06929;
                        c69911 = c69911;
                        c06923 = c06923;
                        sArr25 = sArr25;
                        sArr26 = sArr26;
                        str26 = str26;
                        c238011 = c238011;
                        sArr21 = sArr21;
                        sArr27 = sArr27;
                        c06927 = c06927;
                        c13351 = c13351;
                        i57 = i57;
                        strM7604 = strM7604;
                        iM450213 = iM450213;
                        c06928 = c06928;
                        c4176 = c4176;
                        str27 = str27;
                        i48 = i48;
                        c06925 = c06925;
                        i44 = i17;
                        i43 = i16;
                        c9699 = c9699;
                        c06933 = c06933;
                        c06932 = c06932;
                        c06935 = c06935;
                        str30 = str30;
                        c11109 = c11109;
                        sArr29 = sArr29;
                        str32 = str32;
                        c12522 = c12522;
                        c146310 = c146310;
                        sArr30 = sArr30;
                        c06934 = c0696;
                        sArr20 = sArr20;
                        c17459 = c17459;
                        str34 = str34;
                        c4885 = c4883;
                        str31 = str8;
                        str36 = str36;
                    } else {
                        c06930 = c06940;
                        str28 = str37;
                        c4885 = c4883;
                        iM11306 = (ThreadFactoryC3888.m11306("ᩳܿ") ^ i41) * (-117);
                        c4884 = c4885;
                        i32 = ((iM11306 ^ i42) * 21979) ^ (-1616115319);
                        c06918 = c06936;
                        str24 = str28;
                        i35 = -908706470;
                        i39 = iM11306 ^ i35;
                        c22524 = c22523;
                        strM4892 = str15;
                        str22 = str24;
                        c06936 = c06918;
                        i34 = i39;
                        i43 = i32;
                        i49 = i49;
                        str23 = str8;
                        str36 = str36;
                        iM113011 = iM113011;
                        sArr18 = sArr18;
                        iM450212 = iM450212;
                        sArr19 = sArr19;
                        sArr22 = sArr22;
                        i51 = i51;
                        i53 = i53;
                        i50 = i50;
                        i52 = i52;
                        iM11309 = iM11309;
                        iM113010 = iM113010;
                        c06931 = c06931;
                        sArr24 = sArr24;
                        i55 = i55;
                        i56 = i56;
                        c1937 = c1937;
                        strM6918 = strM6918;
                        iM450214 = iM450214;
                        c06929 = c06929;
                        c69911 = c69911;
                        c06923 = c06923;
                        sArr25 = sArr25;
                        sArr26 = sArr26;
                        str26 = str26;
                        c238011 = c238011;
                        sArr21 = sArr21;
                        sArr27 = sArr27;
                        c06927 = c06927;
                        c13351 = c13351;
                        i57 = i57;
                        strM7604 = strM7604;
                        iM450213 = iM450213;
                        c06928 = c06928;
                        c4176 = c4176;
                        str27 = str27;
                        i48 = i48;
                        c06925 = c06925;
                        c22524 = c22524;
                        strM4892 = strM4892;
                        i44 = i34;
                        c9699 = c9699;
                        c06933 = c06933;
                        c06932 = c06932;
                        c06935 = c06935;
                        str30 = str30;
                        i58 = i58;
                        sArr29 = sArr29;
                        str32 = str32;
                        c12522 = c12522;
                        c4885 = c4884;
                        c146310 = c146310;
                        sArr30 = sArr30;
                        c17459 = c17459;
                        str34 = str34;
                        str28 = str22;
                        str35 = str35;
                        short[] sArr35 = sArr20;
                        str31 = str23;
                        c11109 = c11109;
                        c06934 = c0696;
                        sArr20 = sArr35;
                    }
                    break;
                case -2113816126:
                case 1856080951:
                    String str38 = str35;
                    sArr29 = sArr29;
                    c4883 = c4885;
                    c12522 = c12522;
                    str34 = str34;
                    c06933 = c06933;
                    c146310 = c146310;
                    str32 = str32;
                    c06935 = c06935;
                    c17459 = c17459;
                    str36 = str36;
                    sArr30 = sArr30;
                    c06932 = c06932;
                    str30 = str30;
                    c9699 = c9699;
                    str8 = str31;
                    sArr20 = sArr20;
                    c0696 = c06934;
                    c11109 = c11109;
                    short[] sArr36 = sArr27;
                    int i62 = i57;
                    String strM4832 = C1377.m4832(sArr36, i62, 20, i59);
                    C0690 c06942 = c06928;
                    C4176 c4177 = c4176;
                    m28445(str27, i48, c06942, strM4832, c4177);
                    c06929 = C0690.f2897;
                    c69911 = new C6999();
                    strM6241 = ViewGroupOnHierarchyChangeListenerC1916.m6241(f38316, 324, 2, i59);
                    iM450211 = C19806.m45029(CallableC1627.m5502(f38316, 326, 3, i59)) ^ 2100366474;
                    strM5577 = C1668.m5577(f38316, 329, 16, i59);
                    int iM450215 = (C19806.m45029("ܰ۟") ^ i42) * 45;
                    i16 = ((iM450215 ^ i41) * (-17141)) ^ (-698212013);
                    i17 = iM450215 ^ 1910869309;
                    i58 = i58;
                    str35 = str38;
                    c06931 = c06931;
                    str28 = str28;
                    sArr27 = sArr36;
                    i57 = i62;
                    strM7604 = strM7604;
                    iM450213 = iM450213;
                    c06928 = c06942;
                    c4176 = c4177;
                    i44 = i17;
                    i43 = i16;
                    c9699 = c9699;
                    c06933 = c06933;
                    c06932 = c06932;
                    c06935 = c06935;
                    str30 = str30;
                    c11109 = c11109;
                    sArr29 = sArr29;
                    str32 = str32;
                    c12522 = c12522;
                    c146310 = c146310;
                    sArr30 = sArr30;
                    c06934 = c0696;
                    sArr20 = sArr20;
                    c17459 = c17459;
                    str34 = str34;
                    c4885 = c4883;
                    str31 = str8;
                    str36 = str36;
                    break;
                case -1798320914:
                case 1021886082:
                    str35 = str35;
                    i58 = i58;
                    sArr29 = sArr29;
                    c0693 = c06933;
                    c146310 = c146310;
                    c06935 = c06935;
                    c17459 = c17459;
                    str36 = str36;
                    sArr30 = sArr30;
                    c06932 = c06932;
                    str30 = str30;
                    c9698 = c9699;
                    str2 = str31;
                    iM11309 = iM11309;
                    i50 = i50;
                    i51 = i51;
                    i52 = i52;
                    i53 = i53;
                    sArr20 = sArr20;
                    c0691 = c06934;
                    c11109 = c11109;
                    short[] sArr37 = sArr21;
                    String strM10056 = RunnableC3388.m10056(sArr37, DHParameters.DEFAULT_MINIMUM_LENGTH, 2, i59);
                    sArr21 = sArr37;
                    iM113010 = ThreadFactoryC3888.m11306(C19806.m45020(f38316, 162, 3, i59)) ^ 2121611418;
                    sArr22 = f38316;
                    int iM113014 = ThreadFactoryC3888.m11306("ۖ֫") ^ i42;
                    i5 = ((iM113014 ^ i41) * (-22605)) ^ (-693185570);
                    i6 = iM113014 ^ (-2088029521);
                    str = strM10056;
                    c06923 = c06923;
                    c238011 = c238011;
                    str6 = strM7604;
                    i8 = iM450213;
                    sArr24 = sArr24;
                    i55 = i55;
                    i56 = i56;
                    strM6918 = strM6918;
                    iM450214 = iM450214;
                    c0695 = c06926;
                    str32 = str;
                    c06933 = c0693;
                    sArr21 = sArr21;
                    i7 = i6;
                    i43 = i5;
                    c1355 = c1355;
                    strM940 = strM940;
                    c12522 = c12522;
                    c06930 = c0694;
                    i49 = i49;
                    i51 = i51;
                    i53 = i53;
                    i50 = i50;
                    c11109 = c11109;
                    i52 = i52;
                    i58 = i58;
                    iM11309 = iM11309;
                    iM113011 = iM113011;
                    sArr18 = sArr18;
                    iM450212 = iM450212;
                    c06931 = c06931;
                    c06926 = c0695;
                    sArr19 = sArr3;
                    str28 = str4;
                    c06929 = c06929;
                    c69911 = c69911;
                    sArr25 = sArr25;
                    c4885 = c4882;
                    sArr26 = sArr26;
                    str26 = str5;
                    sArr27 = sArr27;
                    c06927 = c06927;
                    c13351 = c13351;
                    i57 = i57;
                    strM7604 = str6;
                    iM450213 = i8;
                    c06928 = c06928;
                    c4176 = c4176;
                    str27 = str27;
                    i48 = i48;
                    c06925 = c06925;
                    c22524 = c22524;
                    strM4892 = strM4892;
                    i44 = i7;
                    c9699 = c9698;
                    c06932 = c06932;
                    c06935 = c06935;
                    str30 = str30;
                    c06934 = c0691;
                    sArr20 = sArr20;
                    sArr29 = sArr29;
                    str35 = str35;
                    str32 = str32;
                    c146310 = c146310;
                    sArr30 = sArr30;
                    str31 = str2;
                    c17459 = c17459;
                    str36 = str36;
                    str34 = str34;
                    break;
                case -1724867413:
                case 189956281:
                    str35 = str35;
                    i58 = i58;
                    sArr29 = sArr29;
                    c4883 = c4885;
                    str9 = str28;
                    c0697 = c06931;
                    c12522 = c12522;
                    str34 = str34;
                    c06933 = c06933;
                    c146310 = c146310;
                    str32 = str32;
                    c06935 = c06935;
                    c17459 = c17459;
                    str36 = str36;
                    sArr30 = sArr30;
                    c06932 = c06932;
                    str30 = str30;
                    c9699 = c9699;
                    str8 = str31;
                    c0698 = c06923;
                    c1935 = c1937;
                    str11 = strM6918;
                    c0699 = c06929;
                    c6999 = c69911;
                    sArr4 = sArr18;
                    sArr5 = sArr19;
                    sArr22 = sArr22;
                    sArr6 = sArr24;
                    sArr8 = sArr25;
                    i9 = iM450212;
                    iM11309 = iM11309;
                    iM113010 = iM113010;
                    i11 = i49;
                    i50 = i50;
                    i51 = i51;
                    i52 = i52;
                    i53 = i53;
                    i12 = i55;
                    i13 = i56;
                    i14 = iM113011;
                    i15 = iM450214;
                    c06910 = c06930;
                    sArr20 = sArr20;
                    c0696 = c06934;
                    c11109 = c11109;
                    short[] sArr38 = sArr26;
                    String strM3361 = C0797.m3361(sArr38, 287, 12, i59);
                    sArr7 = sArr38;
                    str10 = str26;
                    c23809 = c238011;
                    C0690 c06943 = c06927;
                    C13350 c13353 = c13351;
                    str16 = strM7604;
                    i18 = iM450213;
                    m28445(str16, i18, c06943, strM3361, c13353);
                    C0690 c06944 = C0690.f2923;
                    C4176 c4178 = new C4176();
                    c06912 = c06943;
                    c13350 = c13353;
                    String strM6164 = RunnableC1895.m6164(f38316, 299, 2, i59);
                    int iM113015 = ThreadFactoryC3888.m11306(MenuItemOnMenuItemClickListenerC3244.m9715(f38316, 301, 3, i59)) ^ 2119156024;
                    short[] sArr39 = f38316;
                    if (C3660.m10791() == 0) {
                        int iM450216 = C19806.m45029("ܶ֡") ^ i41;
                        i43 = ((iM450216 ^ i42) * 20709) ^ (-392694454);
                        sArr27 = sArr39;
                        i10 = i18;
                        sArr25 = sArr8;
                        c4176 = c4178;
                        c06928 = c06944;
                        c06927 = c06912;
                        c13351 = c13350;
                        str27 = strM6164;
                        i48 = iM113015;
                        c22522 = c22524;
                        str13 = strM4892;
                        str14 = strM940;
                        i57 = 304;
                        i44 = iM450216 ^ (-38665970);
                        str12 = str16;
                        c06911 = c06926;
                        c1354 = c1355;
                        c06926 = c06911;
                        c1355 = c1354;
                        strM940 = str14;
                        c06930 = c06910;
                        i49 = i11;
                        sArr22 = sArr22;
                        i51 = i51;
                        i53 = i53;
                        i50 = i50;
                        c11109 = c11109;
                        i52 = i52;
                        i58 = i58;
                        str35 = str35;
                        iM11309 = iM11309;
                        iM113010 = iM113010;
                        iM113011 = i14;
                        sArr18 = sArr4;
                        iM450212 = i9;
                        c06931 = c0697;
                        sArr24 = sArr6;
                        i55 = i12;
                        i56 = i13;
                        c1937 = c1935;
                        strM6918 = str11;
                        iM450214 = i15;
                        sArr19 = sArr5;
                        str28 = str9;
                        c06929 = c0699;
                        c69911 = c6999;
                        c06923 = c0698;
                        sArr26 = sArr7;
                        str26 = str10;
                        c238011 = c23809;
                        sArr21 = sArr21;
                        strM7604 = str12;
                        iM450213 = i10;
                        c06925 = c06925;
                        c22524 = c22522;
                        strM4892 = str13;
                        c9699 = c9699;
                        c06933 = c06933;
                        c06932 = c06932;
                        c06935 = c06935;
                        str30 = str30;
                        c06934 = c0696;
                        sArr20 = sArr20;
                        sArr29 = sArr29;
                        str32 = str32;
                        c12522 = c12522;
                        c146310 = c146310;
                        sArr30 = sArr30;
                        str31 = str8;
                        c17459 = c17459;
                        str36 = str36;
                        str34 = str34;
                        c4885 = c4883;
                    } else {
                        i48 = iM113015;
                        sArr27 = sArr39;
                        c4176 = c4178;
                        c06928 = c06944;
                        str27 = strM6164;
                        i57 = 304;
                        int iM450217 = C19806.m45029("ᩳۧ") ^ i42;
                        i16 = ((iM450217 ^ i41) * 31169) ^ (-1551417952);
                        i17 = iM450217 ^ (-2119299928);
                        strM7604 = str16;
                        iM450213 = i18;
                        c06930 = c06910;
                        i49 = i11;
                        sArr22 = sArr22;
                        i51 = i51;
                        i53 = i53;
                        i50 = i50;
                        i52 = i52;
                        i58 = i58;
                        str35 = str35;
                        iM11309 = iM11309;
                        iM113010 = iM113010;
                        iM113011 = i14;
                        sArr18 = sArr4;
                        iM450212 = i9;
                        c06931 = c0697;
                        sArr24 = sArr6;
                        i55 = i12;
                        i56 = i13;
                        c1937 = c1935;
                        strM6918 = str11;
                        iM450214 = i15;
                        sArr19 = sArr5;
                        str28 = str9;
                        c06929 = c0699;
                        c69911 = c6999;
                        c06923 = c0698;
                        sArr25 = sArr8;
                        sArr26 = sArr7;
                        str26 = str10;
                        c238011 = c23809;
                        c06927 = c06912;
                        c13351 = c13350;
                        i44 = i17;
                        i43 = i16;
                        c9699 = c9699;
                        c06933 = c06933;
                        c06932 = c06932;
                        c06935 = c06935;
                        str30 = str30;
                        c11109 = c11109;
                        sArr29 = sArr29;
                        str32 = str32;
                        c12522 = c12522;
                        c146310 = c146310;
                        sArr30 = sArr30;
                        c06934 = c0696;
                        sArr20 = sArr20;
                        c17459 = c17459;
                        str34 = str34;
                        c4885 = c4883;
                        str31 = str8;
                        str36 = str36;
                    }
                    break;
                case -1708578092:
                case 533421632:
                    String str39 = str35;
                    sArr29 = sArr29;
                    c4883 = c4885;
                    c12522 = c12522;
                    str34 = str34;
                    c06933 = c06933;
                    c146310 = c146310;
                    str32 = str32;
                    c06935 = c06935;
                    c17459 = c17459;
                    str36 = str36;
                    sArr30 = sArr30;
                    c06932 = c06932;
                    str30 = str30;
                    c9699 = c9699;
                    str8 = str31;
                    sArr20 = sArr20;
                    c0696 = c06934;
                    c11109 = c11109;
                    short[] sArr40 = sArr25;
                    strM7604 = C2477.m7604(sArr40, 282, 2, i59);
                    iM450213 = C19806.m45029(C2332.m7082(f38316, 284, 3, i59)) ^ 2120875701;
                    sArr26 = f38316;
                    int iM113016 = ThreadFactoryC3888.m11306("ۖۤ") ^ i42;
                    i16 = ((iM113016 ^ i41) * (-19449)) ^ (-1798043032);
                    i17 = iM113016 ^ 1420977768;
                    i58 = i58;
                    str35 = str39;
                    c06931 = c06931;
                    str28 = str28;
                    c06923 = c06923;
                    sArr25 = sArr40;
                    i44 = i17;
                    i43 = i16;
                    c9699 = c9699;
                    c06933 = c06933;
                    c06932 = c06932;
                    c06935 = c06935;
                    str30 = str30;
                    c11109 = c11109;
                    sArr29 = sArr29;
                    str32 = str32;
                    c12522 = c12522;
                    c146310 = c146310;
                    sArr30 = sArr30;
                    c06934 = c0696;
                    sArr20 = sArr20;
                    c17459 = c17459;
                    str34 = str34;
                    c4885 = c4883;
                    str31 = str8;
                    str36 = str36;
                    break;
                case -1649765291:
                case -1550080037:
                    str35 = str35;
                    c4883 = c4885;
                    str17 = str28;
                    c06913 = c06931;
                    c12521 = c12522;
                    str34 = str34;
                    c06914 = c06933;
                    c14638 = c146310;
                    str18 = str32;
                    c06915 = c06935;
                    c17459 = c17459;
                    str36 = str36;
                    sArr30 = sArr30;
                    c06916 = c06932;
                    str30 = str30;
                    c9699 = c9699;
                    str8 = str31;
                    c06923 = c06923;
                    str26 = str26;
                    c1936 = c1937;
                    str19 = strM6918;
                    c06929 = c06929;
                    sArr9 = sArr18;
                    sArr10 = sArr19;
                    sArr11 = sArr22;
                    sArr12 = sArr24;
                    i19 = iM450212;
                    i20 = iM11309;
                    i21 = iM113010;
                    i22 = i49;
                    i23 = i50;
                    i24 = i51;
                    i52 = i52;
                    i53 = i53;
                    i25 = i55;
                    i26 = i56;
                    i27 = iM113011;
                    i28 = iM450214;
                    c06917 = c06930;
                    c238010 = c238011;
                    sArr20 = sArr20;
                    c0696 = c06934;
                    c11109 = c11109;
                    c69911 = c69911;
                    C0690 c06945 = C0690.f2914;
                    C5588 c5589 = new C5588();
                    String strM3362 = C0797.m3361(f38316, 220, 2, i59);
                    short[] sArr41 = f38316;
                    if (C0216.m1591() > 0) {
                        c69910 = c69911;
                        int iM113017 = (ThreadFactoryC3888.m11306("᩹᩵") + i41) * (-21);
                        int i63 = ((iM113017 ^ i42) * 2773) ^ 209988862;
                        i44 = iM113017 ^ (-310329092);
                        sArr13 = sArr41;
                        c11109 = c11109;
                        c5588 = c5589;
                        c06937 = c06945;
                        i29 = 222;
                        str33 = strM3362;
                        i43 = i63;
                        c06923 = c06923;
                        str26 = str26;
                        c238011 = c238010;
                        c06930 = c06917;
                        i49 = i22;
                        sArr22 = sArr11;
                        i51 = i24;
                        i53 = i53;
                        i50 = i23;
                        c06934 = c0696;
                        i52 = i52;
                        sArr20 = sArr20;
                        i58 = i29;
                        str35 = str35;
                        iM11309 = i20;
                        iM113010 = i21;
                        iM113011 = i27;
                        sArr18 = sArr9;
                        iM450212 = i19;
                        c06931 = c06913;
                        sArr24 = sArr12;
                        i55 = i25;
                        i56 = i26;
                        c1937 = c1936;
                        strM6918 = str19;
                        iM450214 = i28;
                        sArr19 = sArr10;
                        str28 = str17;
                        c06929 = c06929;
                        c69911 = c69910;
                        c9699 = c9699;
                        c06933 = c06914;
                        c06932 = c06916;
                        c06935 = c06915;
                        str31 = str8;
                        str30 = str30;
                        sArr29 = sArr13;
                        str36 = str36;
                        str32 = str18;
                        c12522 = c12521;
                        c146310 = c14638;
                        sArr30 = sArr30;
                        c17459 = c17459;
                        str34 = str34;
                        c4885 = c4883;
                    } else {
                        str33 = strM3362;
                        sArr29 = sArr41;
                        i51 = i24;
                        i50 = i23;
                        iM11309 = i20;
                        c5588 = c5589;
                        c06937 = c06945;
                        i58 = 222;
                        int iM113018 = ThreadFactoryC3888.m11306("ۤ᩺") ^ i42;
                        C6999 c69912 = c69911;
                        i44 = iM113018 ^ 133551627;
                        i43 = ((iM113018 ^ i41) * 27711) ^ (-997921131);
                        c06923 = c06923;
                        str26 = str26;
                        c238011 = c238010;
                        c06930 = c06917;
                        i49 = i22;
                        sArr22 = sArr11;
                        c06935 = c06915;
                        str30 = str30;
                        i53 = i53;
                        c11109 = c11109;
                        i52 = i52;
                        i58 = i58;
                        str35 = str35;
                        iM113010 = i21;
                        iM113011 = i27;
                        str32 = str18;
                        sArr18 = sArr9;
                        iM450212 = i19;
                        c06931 = c06913;
                        sArr24 = sArr12;
                        i55 = i25;
                        i56 = i26;
                        c1937 = c1936;
                        strM6918 = str19;
                        iM450214 = i28;
                        sArr19 = sArr10;
                        str28 = str17;
                        c06929 = c06929;
                        c69911 = c69912;
                        c9699 = c9699;
                        c06933 = c06914;
                        c06932 = c06916;
                        sArr30 = sArr30;
                        c06934 = c0696;
                        sArr20 = sArr20;
                        sArr29 = sArr29;
                        c17459 = c17459;
                        c12522 = c12521;
                        c146310 = c14638;
                        str31 = str8;
                        str36 = str36;
                        str34 = str34;
                        c4885 = c4883;
                    }
                    break;
                case -1431263995:
                case 1477777922:
                    str35 = str35;
                    i58 = i58;
                    sArr29 = sArr29;
                    c9699 = c9699;
                    str7 = str31;
                    c0696 = c06934;
                    c11109 = c11109;
                    C2249.m6915();
                    iM113011 = iM113011;
                    int iM450218 = C19806.m45029("ۙۢ") ^ i41;
                    short[] sArr42 = sArr28;
                    i37 = ((iM450218 ^ i42) * 18689) ^ 1405964806;
                    i36 = iM450218 ^ 1889992369;
                    sArr16 = sArr42;
                    i49 = i49;
                    sArr18 = sArr18;
                    iM450212 = iM450212;
                    sArr19 = sArr19;
                    C17458 c174510 = c17459;
                    c06919 = c06935;
                    c17458 = c174510;
                    c69911 = c69911;
                    c06923 = c06923;
                    str26 = str26;
                    c238011 = c238011;
                    c06930 = c06930;
                    str23 = str7;
                    str36 = str36;
                    str22 = str28;
                    c4884 = c4885;
                    c06925 = c06925;
                    c22524 = c22524;
                    strM4892 = strM4892;
                    c06927 = c06927;
                    c13351 = c13351;
                    strM7604 = strM7604;
                    c06928 = c06928;
                    c4176 = c4176;
                    str27 = str27;
                    sArr21 = sArr21;
                    sArr25 = sArr25;
                    sArr26 = sArr26;
                    sArr27 = sArr27;
                    i48 = i48;
                    iM450213 = iM450213;
                    i57 = i57;
                    i34 = i36;
                    i43 = i37;
                    sArr28 = sArr16;
                    C0690 c06946 = c06919;
                    c17459 = c17458;
                    c06935 = c06946;
                    sArr22 = sArr22;
                    i51 = i51;
                    i53 = i53;
                    i50 = i50;
                    i52 = i52;
                    iM11309 = iM11309;
                    iM113010 = iM113010;
                    c06931 = c06931;
                    sArr24 = sArr24;
                    i55 = i55;
                    i56 = i56;
                    c1937 = c1937;
                    strM6918 = strM6918;
                    iM450214 = iM450214;
                    c06929 = c06929;
                    c69911 = c69911;
                    c06923 = c06923;
                    sArr25 = sArr25;
                    sArr26 = sArr26;
                    str26 = str26;
                    c238011 = c238011;
                    sArr21 = sArr21;
                    sArr27 = sArr27;
                    c06927 = c06927;
                    c13351 = c13351;
                    i57 = i57;
                    strM7604 = strM7604;
                    iM450213 = iM450213;
                    c06928 = c06928;
                    c4176 = c4176;
                    str27 = str27;
                    i48 = i48;
                    c06925 = c06925;
                    c22524 = c22524;
                    strM4892 = strM4892;
                    i44 = i34;
                    c9699 = c9699;
                    c06933 = c06933;
                    c06932 = c06932;
                    c06935 = c06935;
                    str30 = str30;
                    i58 = i58;
                    sArr29 = sArr29;
                    str32 = str32;
                    c12522 = c12522;
                    c4885 = c4884;
                    c146310 = c146310;
                    sArr30 = sArr30;
                    c17459 = c17459;
                    str34 = str34;
                    str28 = str22;
                    str35 = str35;
                    short[] sArr310 = sArr20;
                    str31 = str23;
                    c11109 = c11109;
                    c06934 = c0696;
                    sArr20 = sArr310;
                    break;
                case -1419522355:
                case 1332324963:
                    m28445(strM6241, iM450211, c06929, strM5577, c69911);
                    m28445(C3577.m10571(f38316, 345, 2, i59), ThreadFactoryC3888.m11306(C0629.m2906(f38316, 347, 3, i59)) ^ 2118378886, C0690.f2894, C19806.m45020(f38316, 350, 19, i59), new C23228());
                    return;
                case -1412331545:
                case -1388036097:
                    str35 = str35;
                    i58 = i58;
                    sArr29 = sArr29;
                    c4882 = c4885;
                    String str40 = str28;
                    c06931 = c06931;
                    c12522 = c12522;
                    str32 = str32;
                    c06935 = c06935;
                    c17459 = c17459;
                    str36 = str36;
                    sArr30 = sArr30;
                    c06932 = c06932;
                    str30 = str30;
                    c9698 = c9699;
                    str2 = str31;
                    sArr18 = sArr18;
                    iM450212 = iM450212;
                    iM11309 = iM11309;
                    i49 = i49;
                    i50 = i50;
                    i51 = i51;
                    i52 = i52;
                    i53 = i53;
                    iM113011 = iM113011;
                    c0694 = c06930;
                    sArr20 = sArr20;
                    c0691 = c06934;
                    c11109 = c11109;
                    sArr3 = sArr19;
                    str4 = str40;
                    str34 = str34;
                    String str41 = str26;
                    m28445(str41, i46 ^ i47, c06923, C0817.m3406(f38316, 139, 21, i59), c238011);
                    C0690 c06947 = C0690.f2925;
                    C14637 c146311 = new C14637();
                    short[] sArr43 = f38316;
                    int iM113019 = (ThreadFactoryC3888.m11306("ۖ᩻") + i41) * (-95);
                    i43 = ((iM113019 ^ i42) * (-4901)) ^ (-451310611);
                    str5 = str41;
                    sArr21 = sArr43;
                    i7 = iM113019 ^ (-1593896626);
                    c06933 = c06947;
                    c06925 = c06925;
                    c22524 = c22524;
                    strM4892 = strM4892;
                    c0695 = c06926;
                    c1355 = c1355;
                    strM940 = strM940;
                    c06927 = c06927;
                    c13351 = c13351;
                    str6 = strM7604;
                    c06928 = c06928;
                    c4176 = c4176;
                    str27 = str27;
                    c06929 = c06929;
                    c69911 = c69911;
                    sArr25 = sArr25;
                    sArr26 = sArr26;
                    sArr27 = sArr27;
                    i48 = i48;
                    i8 = iM450213;
                    i57 = i57;
                    c146310 = c146311;
                    c1355 = c1355;
                    strM940 = strM940;
                    c12522 = c12522;
                    c06930 = c0694;
                    i49 = i49;
                    i51 = i51;
                    i53 = i53;
                    i50 = i50;
                    c11109 = c11109;
                    i52 = i52;
                    i58 = i58;
                    iM11309 = iM11309;
                    iM113011 = iM113011;
                    sArr18 = sArr18;
                    iM450212 = iM450212;
                    c06931 = c06931;
                    c06926 = c0695;
                    sArr19 = sArr3;
                    str28 = str4;
                    c06929 = c06929;
                    c69911 = c69911;
                    sArr25 = sArr25;
                    c4885 = c4882;
                    sArr26 = sArr26;
                    str26 = str5;
                    sArr27 = sArr27;
                    c06927 = c06927;
                    c13351 = c13351;
                    i57 = i57;
                    strM7604 = str6;
                    iM450213 = i8;
                    c06928 = c06928;
                    c4176 = c4176;
                    str27 = str27;
                    i48 = i48;
                    c06925 = c06925;
                    c22524 = c22524;
                    strM4892 = strM4892;
                    i44 = i7;
                    c9699 = c9698;
                    c06932 = c06932;
                    c06935 = c06935;
                    str30 = str30;
                    c06934 = c0691;
                    sArr20 = sArr20;
                    sArr29 = sArr29;
                    str35 = str35;
                    str32 = str32;
                    c146310 = c146310;
                    sArr30 = sArr30;
                    str31 = str2;
                    c17459 = c17459;
                    str36 = str36;
                    str34 = str34;
                    break;
                case -1393374150:
                case 1488049203:
                    str35 = str35;
                    i58 = i58;
                    sArr29 = sArr29;
                    c4883 = c4885;
                    str20 = str28;
                    c06913 = c06931;
                    c12521 = c12522;
                    str21 = str34;
                    c06914 = c06933;
                    c14638 = c146310;
                    str18 = str32;
                    c06915 = c06935;
                    c17459 = c17459;
                    str36 = str36;
                    c06916 = c06932;
                    str30 = str30;
                    c9699 = c9699;
                    str8 = str31;
                    c1936 = c1937;
                    str19 = strM6918;
                    sArr9 = sArr18;
                    sArr11 = sArr22;
                    sArr12 = sArr24;
                    i19 = iM450212;
                    i21 = iM113010;
                    i22 = i49;
                    i52 = i52;
                    i53 = i53;
                    i25 = i55;
                    i26 = i56;
                    i27 = iM113011;
                    i28 = iM450214;
                    sArr20 = sArr20;
                    c0696 = c06934;
                    c11109 = c11109;
                    c06917 = c06930;
                    sArr14 = sArr19;
                    iM11309 = ThreadFactoryC3888.m11306(C0817.m3406(sArr14, 68, 3, i59)) ^ 2127125579;
                    short[] sArr44 = f38316;
                    i50 = 71;
                    i51 = 18;
                    if (C1189.f5284 > 0) {
                        int iM113020 = (i41 - ThreadFactoryC3888.m11306("ۖܰ")) * 71;
                        sArr15 = sArr44;
                        int i64 = ((iM113020 ^ i42) * 14247) ^ 1065647769;
                        int i65 = iM113020 ^ 1193610769;
                        i30 = i64;
                        i31 = i65;
                        i44 = i31;
                        i43 = i30;
                        str30 = str30;
                        i53 = i53;
                        i52 = i52;
                        sArr17 = sArr20;
                        c06932 = c06916;
                        sArr30 = sArr15;
                        sArr19 = sArr14;
                        c9699 = c9699;
                        c06930 = c06917;
                        i49 = i22;
                        c146310 = c14638;
                        sArr22 = sArr11;
                        c06935 = c06915;
                        str31 = str8;
                        sArr29 = sArr29;
                        str35 = str35;
                        c17459 = c17459;
                        str36 = str36;
                        iM113010 = i21;
                        iM113011 = i27;
                        str32 = str18;
                        sArr18 = sArr9;
                        iM450212 = i19;
                        c06931 = c06913;
                        sArr24 = sArr12;
                        i55 = i25;
                        i56 = i26;
                        c1937 = c1936;
                        strM6918 = str19;
                        iM450214 = i28;
                        str28 = str20;
                        str34 = str21;
                        c06933 = c06914;
                        i58 = i58;
                        c12522 = c12521;
                        c4885 = c4883;
                        C0690 c06948 = c0696;
                        sArr20 = sArr17;
                        c11109 = c11109;
                        c06934 = c06948;
                    } else {
                        sArr30 = sArr44;
                        sArr10 = sArr14;
                        str17 = str20;
                        str34 = str21;
                        c238010 = c238011;
                        int iM1130110 = ThreadFactoryC3888.m11306("ۤ᩺") ^ i42;
                        C6999 c69913 = c69911;
                        i44 = iM1130110 ^ 133551627;
                        i43 = ((iM1130110 ^ i41) * 27711) ^ (-997921131);
                        c06923 = c06923;
                        str26 = str26;
                        c238011 = c238010;
                        c06930 = c06917;
                        i49 = i22;
                        sArr22 = sArr11;
                        c06935 = c06915;
                        str30 = str30;
                        i53 = i53;
                        c11109 = c11109;
                        i52 = i52;
                        i58 = i58;
                        str35 = str35;
                        iM113010 = i21;
                        iM113011 = i27;
                        str32 = str18;
                        sArr18 = sArr9;
                        iM450212 = i19;
                        c06931 = c06913;
                        sArr24 = sArr12;
                        i55 = i25;
                        i56 = i26;
                        c1937 = c1936;
                        strM6918 = str19;
                        iM450214 = i28;
                        sArr19 = sArr10;
                        str28 = str17;
                        c06929 = c06929;
                        c69911 = c69913;
                        c9699 = c9699;
                        c06933 = c06914;
                        c06932 = c06916;
                        sArr30 = sArr30;
                        c06934 = c0696;
                        sArr20 = sArr20;
                        sArr29 = sArr29;
                        c17459 = c17459;
                        c12522 = c12521;
                        c146310 = c14638;
                        str31 = str8;
                        str36 = str36;
                        str34 = str34;
                        c4885 = c4883;
                    }
                    break;
                case -1259006574:
                case 1581851208:
                    str35 = str35;
                    i58 = i58;
                    sArr29 = sArr29;
                    c4885 = c4885;
                    String str42 = str28;
                    c06931 = c06931;
                    c12522 = c12522;
                    String str43 = str34;
                    c06933 = c06933;
                    c146310 = c146310;
                    str32 = str32;
                    c06935 = c06935;
                    c17459 = c17459;
                    str36 = str36;
                    sArr30 = sArr30;
                    c06932 = c06932;
                    str30 = str30;
                    c9699 = c9699;
                    str8 = str31;
                    c1937 = c1937;
                    strM6918 = strM6918;
                    sArr18 = sArr18;
                    sArr22 = sArr22;
                    sArr24 = sArr24;
                    iM450212 = iM450212;
                    iM11309 = iM11309;
                    iM113010 = iM113010;
                    i49 = i49;
                    i50 = i50;
                    i51 = i51;
                    i52 = i52;
                    i53 = i53;
                    i55 = i55;
                    i56 = i56;
                    iM113011 = iM113011;
                    iM450214 = iM450214;
                    C0690 c06949 = c06930;
                    sArr20 = sArr20;
                    c0696 = c06934;
                    c11109 = c11109;
                    short s = f38316[0];
                    int i66 = s + 15287;
                    int i67 = (s * s) + 233692369;
                    if ((i67 + i67) - (i66 * i66) < 0) {
                        iM45029 = (i41 - ThreadFactoryC3888.m11306("ۙ᩵")) * (-7);
                        i32 = ((iM45029 ^ i42) * 14893) ^ (-222968585);
                        c06930 = c06949;
                        str28 = str42;
                        str34 = str43;
                        c06923 = c06923;
                        str26 = str26;
                        c06925 = c06925;
                        c22524 = c22524;
                        strM4892 = strM4892;
                        c06926 = c06926;
                        c1355 = c1355;
                        strM940 = strM940;
                        c06927 = c06927;
                        c13351 = c13351;
                        strM7604 = strM7604;
                        c06928 = c06928;
                        c4176 = c4176;
                        str27 = str27;
                        c06929 = c06929;
                        c69911 = c69911;
                        sArr19 = sArr19;
                        sArr21 = sArr21;
                        sArr25 = sArr25;
                        sArr26 = sArr26;
                        sArr27 = sArr27;
                        i48 = i48;
                        iM450213 = iM450213;
                        i57 = i57;
                        c238011 = c238011;
                        i33 = -1905673176;
                    } else {
                        iM45029 = (C19806.m45029("ܳܶ") + i42) * 47;
                        i32 = ((iM45029 ^ i41) * 28315) ^ 1181756615;
                        c06930 = c06949;
                        str28 = str42;
                        str34 = str43;
                        c06923 = c06923;
                        str26 = str26;
                        c06925 = c06925;
                        c22524 = c22524;
                        strM4892 = strM4892;
                        c06926 = c06926;
                        c1355 = c1355;
                        strM940 = strM940;
                        c06927 = c06927;
                        c13351 = c13351;
                        strM7604 = strM7604;
                        c06928 = c06928;
                        c4176 = c4176;
                        str27 = str27;
                        c06929 = c06929;
                        c69911 = c69911;
                        sArr19 = sArr19;
                        sArr21 = sArr21;
                        sArr25 = sArr25;
                        sArr26 = sArr26;
                        sArr27 = sArr27;
                        i48 = i48;
                        iM450213 = iM450213;
                        i57 = i57;
                        c238011 = c238011;
                        i33 = 448880493;
                    }
                    i39 = iM45029 ^ i33;
                    c06926 = c06926;
                    c1355 = c1355;
                    strM940 = strM940;
                    c06930 = c06930;
                    str22 = str28;
                    c4884 = c4885;
                    i34 = i39;
                    i43 = i32;
                    i49 = i49;
                    str23 = str8;
                    str36 = str36;
                    iM113011 = iM113011;
                    sArr18 = sArr18;
                    iM450212 = iM450212;
                    sArr19 = sArr19;
                    sArr22 = sArr22;
                    i51 = i51;
                    i53 = i53;
                    i50 = i50;
                    i52 = i52;
                    iM11309 = iM11309;
                    iM113010 = iM113010;
                    c06931 = c06931;
                    sArr24 = sArr24;
                    i55 = i55;
                    i56 = i56;
                    c1937 = c1937;
                    strM6918 = strM6918;
                    iM450214 = iM450214;
                    c06929 = c06929;
                    c69911 = c69911;
                    c06923 = c06923;
                    sArr25 = sArr25;
                    sArr26 = sArr26;
                    str26 = str26;
                    c238011 = c238011;
                    sArr21 = sArr21;
                    sArr27 = sArr27;
                    c06927 = c06927;
                    c13351 = c13351;
                    i57 = i57;
                    strM7604 = strM7604;
                    iM450213 = iM450213;
                    c06928 = c06928;
                    c4176 = c4176;
                    str27 = str27;
                    i48 = i48;
                    c06925 = c06925;
                    c22524 = c22524;
                    strM4892 = strM4892;
                    i44 = i34;
                    c9699 = c9699;
                    c06933 = c06933;
                    c06932 = c06932;
                    c06935 = c06935;
                    str30 = str30;
                    i58 = i58;
                    sArr29 = sArr29;
                    str32 = str32;
                    c12522 = c12522;
                    c4885 = c4884;
                    c146310 = c146310;
                    sArr30 = sArr30;
                    c17459 = c17459;
                    str34 = str34;
                    str28 = str22;
                    str35 = str35;
                    short[] sArr311 = sArr20;
                    str31 = str23;
                    c11109 = c11109;
                    c06934 = c0696;
                    sArr20 = sArr311;
                    break;
                case -1240218687:
                case -842948436:
                    str35 = str35;
                    i58 = i58;
                    sArr29 = sArr29;
                    c06931 = c06931;
                    C12520 c12523 = c12522;
                    String str44 = str34;
                    c06933 = c06933;
                    c146310 = c146310;
                    str32 = str32;
                    c06935 = c06935;
                    c17459 = c17459;
                    String str45 = str36;
                    sArr30 = sArr30;
                    c06932 = c06932;
                    str30 = str30;
                    c9699 = c9699;
                    String str46 = str31;
                    c1937 = c1937;
                    strM6918 = strM6918;
                    sArr22 = sArr22;
                    sArr24 = sArr24;
                    iM11309 = iM11309;
                    iM113010 = iM113010;
                    i50 = i50;
                    i51 = i51;
                    i52 = i52;
                    i53 = i53;
                    i55 = i55;
                    i56 = i56;
                    iM450214 = iM450214;
                    sArr20 = sArr20;
                    c0696 = c06934;
                    c11109 = c11109;
                    C4882 c4886 = c4885;
                    c12522 = c12523;
                    String str47 = str28;
                    m28445(str47, iM11308 ^ 2102289088, c06930, C7105.m18989(f38316, 6, 16, i59), c4886);
                    C0690 c06950 = C0690.f2937;
                    C15467 c15469 = new C15467();
                    short[] sArr45 = f38316;
                    int iM113021 = ThreadFactoryC3888.m11306("ܽ᩵") ^ i42;
                    i43 = ((iM113021 ^ i41) * (-27183)) ^ 940152274;
                    str22 = str47;
                    str34 = str44;
                    i34 = iM113021 ^ 234874997;
                    c06938 = c06950;
                    c06923 = c06923;
                    str26 = str26;
                    c06925 = c06925;
                    c22524 = c22524;
                    strM4892 = strM4892;
                    c06927 = c06927;
                    c13351 = c13351;
                    strM7604 = strM7604;
                    c06928 = c06928;
                    c4176 = c4176;
                    str27 = str27;
                    c06929 = c06929;
                    c69911 = c69911;
                    sArr21 = sArr21;
                    sArr25 = sArr25;
                    sArr26 = sArr26;
                    sArr27 = sArr27;
                    i48 = i48;
                    iM450213 = iM450213;
                    i57 = i57;
                    c238011 = c238011;
                    c15468 = c15469;
                    str23 = str46;
                    str36 = str45;
                    c4884 = c4886;
                    sArr31 = sArr45;
                    sArr22 = sArr22;
                    i51 = i51;
                    i53 = i53;
                    i50 = i50;
                    i52 = i52;
                    iM11309 = iM11309;
                    iM113010 = iM113010;
                    c06931 = c06931;
                    sArr24 = sArr24;
                    i55 = i55;
                    i56 = i56;
                    c1937 = c1937;
                    strM6918 = strM6918;
                    iM450214 = iM450214;
                    c06929 = c06929;
                    c69911 = c69911;
                    c06923 = c06923;
                    sArr25 = sArr25;
                    sArr26 = sArr26;
                    str26 = str26;
                    c238011 = c238011;
                    sArr21 = sArr21;
                    sArr27 = sArr27;
                    c06927 = c06927;
                    c13351 = c13351;
                    i57 = i57;
                    strM7604 = strM7604;
                    iM450213 = iM450213;
                    c06928 = c06928;
                    c4176 = c4176;
                    str27 = str27;
                    i48 = i48;
                    c06925 = c06925;
                    c22524 = c22524;
                    strM4892 = strM4892;
                    i44 = i34;
                    c9699 = c9699;
                    c06933 = c06933;
                    c06932 = c06932;
                    c06935 = c06935;
                    str30 = str30;
                    i58 = i58;
                    sArr29 = sArr29;
                    str32 = str32;
                    c12522 = c12522;
                    c4885 = c4884;
                    c146310 = c146310;
                    sArr30 = sArr30;
                    c17459 = c17459;
                    str34 = str34;
                    str28 = str22;
                    str35 = str35;
                    short[] sArr312 = sArr20;
                    str31 = str23;
                    c11109 = c11109;
                    c06934 = c0696;
                    sArr20 = sArr312;
                    break;
                case -1156412385:
                case 2025804366:
                    c11109 = c11109;
                    str35 = str35;
                    i58 = i58;
                    sArr29 = sArr29;
                    c06931 = c06931;
                    C12520 c12524 = c12522;
                    String str48 = str34;
                    c06933 = c06933;
                    c146310 = c146310;
                    str32 = str32;
                    c06935 = c06935;
                    c17459 = c17459;
                    str36 = str36;
                    sArr30 = sArr30;
                    c06932 = c06932;
                    str30 = str30;
                    sArr20 = sArr20;
                    sArr18 = sArr18;
                    sArr22 = sArr22;
                    short[] sArr46 = sArr24;
                    iM450212 = iM450212;
                    iM11309 = iM11309;
                    iM113010 = iM113010;
                    i49 = i49;
                    i50 = i50;
                    i51 = i51;
                    i52 = i52;
                    i53 = i53;
                    int i68 = i55;
                    int i69 = i56;
                    iM113011 = iM113011;
                    String strM10571 = C3577.m10571(sArr46, i68, i69, i59);
                    sArr24 = sArr46;
                    i55 = i68;
                    i56 = i69;
                    C0690 c06951 = c06924;
                    C1935 c1938 = c1937;
                    String str49 = strM6918;
                    int i70 = iM450214;
                    m28445(str49, i70, c06951, strM10571, c1938);
                    C0690 c06952 = C0690.f2917;
                    C9698 c96910 = new C9698();
                    c1937 = c1938;
                    strM6918 = str49;
                    iM450214 = i70;
                    String strM6105 = C1875.m6105(f38316, 199, 2, i59);
                    short[] sArr47 = f38316;
                    if (C1377.m4833() == 0) {
                        int iM113022 = (ThreadFactoryC3888.m11306("֫ۨ") ^ i42) * 73;
                        i43 = ((iM113022 ^ i41) * (-5611)) ^ (-442775466);
                        i7 = iM113022 ^ 2025768320;
                        str34 = str48;
                        c06924 = c06951;
                        c4882 = c4885;
                        str4 = str28;
                        sArr22 = sArr22;
                        c9698 = c96910;
                        str2 = strM6105;
                        iM113010 = iM113010;
                        sArr24 = sArr24;
                        i55 = i55;
                        i56 = i56;
                        c1937 = c1937;
                        strM6918 = strM6918;
                        iM450214 = iM450214;
                        str5 = str26;
                        c06925 = c06925;
                        c22524 = c22524;
                        strM4892 = strM4892;
                        c0695 = c06926;
                        strM940 = strM940;
                        c06927 = c06927;
                        c13351 = c13351;
                        str6 = strM7604;
                        c06928 = c06928;
                        c4176 = c4176;
                        str27 = str27;
                        c06929 = c06929;
                        c69911 = c69911;
                        sArr3 = sArr19;
                        sArr25 = sArr25;
                        sArr26 = sArr26;
                        sArr27 = sArr27;
                        i48 = i48;
                        i8 = iM450213;
                        i57 = i57;
                        c0694 = c06930;
                        c12522 = c12524;
                        c0691 = c06952;
                        c06933 = c06933;
                        c1355 = c1355;
                        sArr28 = sArr47;
                        c1355 = c1355;
                        strM940 = strM940;
                        c12522 = c12522;
                        c06930 = c0694;
                        i49 = i49;
                        i51 = i51;
                        i53 = i53;
                        i50 = i50;
                        c11109 = c11109;
                        i52 = i52;
                        i58 = i58;
                        iM11309 = iM11309;
                        iM113011 = iM113011;
                        sArr18 = sArr18;
                        iM450212 = iM450212;
                        c06931 = c06931;
                        c06926 = c0695;
                        sArr19 = sArr3;
                        str28 = str4;
                        c06929 = c06929;
                        c69911 = c69911;
                        sArr25 = sArr25;
                        c4885 = c4882;
                        sArr26 = sArr26;
                        str26 = str5;
                        sArr27 = sArr27;
                        c06927 = c06927;
                        c13351 = c13351;
                        i57 = i57;
                        strM7604 = str6;
                        iM450213 = i8;
                        c06928 = c06928;
                        c4176 = c4176;
                        str27 = str27;
                        i48 = i48;
                        c06925 = c06925;
                        c22524 = c22524;
                        strM4892 = strM4892;
                        i44 = i7;
                        c9699 = c9698;
                        c06932 = c06932;
                        c06935 = c06935;
                        str30 = str30;
                        c06934 = c0691;
                        sArr20 = sArr20;
                        sArr29 = sArr29;
                        str35 = str35;
                        str32 = str32;
                        c146310 = c146310;
                        sArr30 = sArr30;
                        str31 = str2;
                        c17459 = c17459;
                        str36 = str36;
                        str34 = str34;
                    } else {
                        str34 = str48;
                        c0696 = c06952;
                        c06924 = c06951;
                        c9699 = c96910;
                        iM113011 = iM113011;
                        str7 = strM6105;
                        sArr28 = sArr47;
                        c12522 = c12524;
                        c69911 = c69911;
                        int iM450219 = C19806.m45029("ۙۢ") ^ i41;
                        short[] sArr48 = sArr28;
                        i37 = ((iM450219 ^ i42) * 18689) ^ 1405964806;
                        i36 = iM450219 ^ 1889992369;
                        sArr16 = sArr48;
                        i49 = i49;
                        sArr18 = sArr18;
                        iM450212 = iM450212;
                        sArr19 = sArr19;
                        C17458 c174511 = c17459;
                        c06919 = c06935;
                        c17458 = c174511;
                        c69911 = c69911;
                        c06923 = c06923;
                        str26 = str26;
                        c238011 = c238011;
                        c06930 = c06930;
                        str23 = str7;
                        str36 = str36;
                        str22 = str28;
                        c4884 = c4885;
                        c06925 = c06925;
                        c22524 = c22524;
                        strM4892 = strM4892;
                        c06927 = c06927;
                        c13351 = c13351;
                        strM7604 = strM7604;
                        c06928 = c06928;
                        c4176 = c4176;
                        str27 = str27;
                        sArr21 = sArr21;
                        sArr25 = sArr25;
                        sArr26 = sArr26;
                        sArr27 = sArr27;
                        i48 = i48;
                        iM450213 = iM450213;
                        i57 = i57;
                        i34 = i36;
                        i43 = i37;
                        sArr28 = sArr16;
                        C0690 c069410 = c06919;
                        c17459 = c17458;
                        c06935 = c069410;
                        sArr22 = sArr22;
                        i51 = i51;
                        i53 = i53;
                        i50 = i50;
                        i52 = i52;
                        iM11309 = iM11309;
                        iM113010 = iM113010;
                        c06931 = c06931;
                        sArr24 = sArr24;
                        i55 = i55;
                        i56 = i56;
                        c1937 = c1937;
                        strM6918 = strM6918;
                        iM450214 = iM450214;
                        c06929 = c06929;
                        c69911 = c69911;
                        c06923 = c06923;
                        sArr25 = sArr25;
                        sArr26 = sArr26;
                        str26 = str26;
                        c238011 = c238011;
                        sArr21 = sArr21;
                        sArr27 = sArr27;
                        c06927 = c06927;
                        c13351 = c13351;
                        i57 = i57;
                        strM7604 = strM7604;
                        iM450213 = iM450213;
                        c06928 = c06928;
                        c4176 = c4176;
                        str27 = str27;
                        i48 = i48;
                        c06925 = c06925;
                        c22524 = c22524;
                        strM4892 = strM4892;
                        i44 = i34;
                        c9699 = c9699;
                        c06933 = c06933;
                        c06932 = c06932;
                        c06935 = c06935;
                        str30 = str30;
                        i58 = i58;
                        sArr29 = sArr29;
                        str32 = str32;
                        c12522 = c12522;
                        c4885 = c4884;
                        c146310 = c146310;
                        sArr30 = sArr30;
                        c17459 = c17459;
                        str34 = str34;
                        str28 = str22;
                        str35 = str35;
                        short[] sArr313 = sArr20;
                        str31 = str23;
                        c11109 = c11109;
                        c06934 = c0696;
                        sArr20 = sArr313;
                    }
                    break;
                case -1094639585:
                case 760836235:
                    str35 = str35;
                    i58 = i58;
                    sArr29 = sArr29;
                    c06931 = c06931;
                    C12520 c12525 = c12522;
                    String str50 = str34;
                    c06933 = c06933;
                    c146310 = c146310;
                    str32 = str32;
                    c06935 = c06935;
                    c17459 = c17459;
                    str36 = str36;
                    sArr30 = sArr30;
                    c06932 = c06932;
                    str30 = str30;
                    c9699 = c9699;
                    str8 = str31;
                    sArr18 = sArr18;
                    sArr22 = sArr22;
                    iM450212 = iM450212;
                    iM11309 = iM11309;
                    iM113010 = iM113010;
                    i49 = i49;
                    i50 = i50;
                    i51 = i51;
                    i52 = i52;
                    i53 = i53;
                    iM113011 = iM113011;
                    sArr20 = sArr20;
                    c0696 = c06934;
                    c11109 = c11109;
                    f38311 = new HashSet();
                    f38313 = new LinkedHashMap();
                    f38312 = new C16609();
                    m28461();
                    c06930 = C0690.f2933;
                    C4882 c4887 = new C4882();
                    String strM7082 = C2332.m7082(f38316, 1, 2, i59);
                    iM11308 = ThreadFactoryC3888.m11306(C1875.m6105(f38316, 3, 3, i59));
                    if (RunnableC1564.f6300) {
                        str34 = str50;
                        c4885 = c4887;
                        str28 = strM7082;
                        c06923 = c06923;
                        str26 = str26;
                        c1937 = c1937;
                        strM6918 = strM6918;
                        c06925 = c06925;
                        str15 = strM4892;
                        c06927 = c06927;
                        c13351 = c13351;
                        strM7604 = strM7604;
                        c06928 = c06928;
                        c4176 = c4176;
                        str27 = str27;
                        c06929 = c06929;
                        c69911 = c69911;
                        sArr19 = sArr19;
                        sArr21 = sArr21;
                        sArr24 = sArr24;
                        sArr25 = sArr25;
                        sArr26 = sArr26;
                        sArr27 = sArr27;
                        i48 = i48;
                        iM450213 = iM450213;
                        i55 = i55;
                        i56 = i56;
                        i57 = i57;
                        iM450214 = iM450214;
                        c238011 = c238011;
                        c12522 = c12525;
                        c22523 = c22524;
                        iM11306 = (ThreadFactoryC3888.m11306("ᩳܿ") ^ i41) * (-117);
                        c4884 = c4885;
                        i32 = ((iM11306 ^ i42) * 21979) ^ (-1616115319);
                        c06918 = c06936;
                        str24 = str28;
                        i35 = -908706470;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩺ᩴ") ^ i42;
                        i32 = ((iM11306 ^ i41) * (-15853)) ^ (-2123227381);
                        i35 = -1843211383;
                        str34 = str50;
                        c06918 = c06936;
                        str24 = strM7082;
                        c06923 = c06923;
                        str26 = str26;
                        c1937 = c1937;
                        strM6918 = strM6918;
                        c06925 = c06925;
                        str15 = strM4892;
                        c06927 = c06927;
                        c13351 = c13351;
                        strM7604 = strM7604;
                        c06928 = c06928;
                        c4176 = c4176;
                        str27 = str27;
                        c06929 = c06929;
                        c69911 = c69911;
                        sArr19 = sArr19;
                        sArr21 = sArr21;
                        sArr24 = sArr24;
                        sArr25 = sArr25;
                        sArr26 = sArr26;
                        sArr27 = sArr27;
                        i48 = i48;
                        iM450213 = iM450213;
                        i55 = i55;
                        i56 = i56;
                        i57 = i57;
                        iM450214 = iM450214;
                        c238011 = c238011;
                        c4884 = c4887;
                        c12522 = c12525;
                        c22523 = c22524;
                    }
                    i39 = iM11306 ^ i35;
                    c22524 = c22523;
                    strM4892 = str15;
                    str22 = str24;
                    c06936 = c06918;
                    i34 = i39;
                    i43 = i32;
                    i49 = i49;
                    str23 = str8;
                    str36 = str36;
                    iM113011 = iM113011;
                    sArr18 = sArr18;
                    iM450212 = iM450212;
                    sArr19 = sArr19;
                    sArr22 = sArr22;
                    i51 = i51;
                    i53 = i53;
                    i50 = i50;
                    i52 = i52;
                    iM11309 = iM11309;
                    iM113010 = iM113010;
                    c06931 = c06931;
                    sArr24 = sArr24;
                    i55 = i55;
                    i56 = i56;
                    c1937 = c1937;
                    strM6918 = strM6918;
                    iM450214 = iM450214;
                    c06929 = c06929;
                    c69911 = c69911;
                    c06923 = c06923;
                    sArr25 = sArr25;
                    sArr26 = sArr26;
                    str26 = str26;
                    c238011 = c238011;
                    sArr21 = sArr21;
                    sArr27 = sArr27;
                    c06927 = c06927;
                    c13351 = c13351;
                    i57 = i57;
                    strM7604 = strM7604;
                    iM450213 = iM450213;
                    c06928 = c06928;
                    c4176 = c4176;
                    str27 = str27;
                    i48 = i48;
                    c06925 = c06925;
                    c22524 = c22524;
                    strM4892 = strM4892;
                    i44 = i34;
                    c9699 = c9699;
                    c06933 = c06933;
                    c06932 = c06932;
                    c06935 = c06935;
                    str30 = str30;
                    i58 = i58;
                    sArr29 = sArr29;
                    str32 = str32;
                    c12522 = c12522;
                    c4885 = c4884;
                    c146310 = c146310;
                    sArr30 = sArr30;
                    c17459 = c17459;
                    str34 = str34;
                    str28 = str22;
                    str35 = str35;
                    short[] sArr314 = sArr20;
                    str31 = str23;
                    c11109 = c11109;
                    c06934 = c0696;
                    sArr20 = sArr314;
                    break;
                case -874128012:
                case 30799128:
                    str35 = str35;
                    i58 = i58;
                    sArr29 = sArr29;
                    C0690 c06953 = c06933;
                    C14637 c146312 = c146310;
                    sArr30 = sArr30;
                    c06932 = c06932;
                    str30 = str30;
                    c9699 = c9699;
                    str7 = str31;
                    sArr22 = sArr22;
                    iM11309 = iM11309;
                    iM113010 = iM113010;
                    i50 = i50;
                    i51 = i51;
                    i52 = i52;
                    i53 = i53;
                    sArr20 = sArr20;
                    c0696 = c06934;
                    c11109 = c11109;
                    str32 = str32;
                    short[] sArr49 = sArr18;
                    int i71 = i49;
                    String strM10572 = C3577.m10571(sArr49, i71, 18, i59);
                    int i72 = iM450212;
                    C0690 c06954 = c06931;
                    C12520 c12526 = c12522;
                    c06933 = c06953;
                    String str51 = str34;
                    c146310 = c146312;
                    m28445(str51, i72, c06954, strM10572, c12526);
                    C0690 c06955 = C0690.f2889;
                    c17458 = new C17458();
                    c06919 = c06955;
                    c06931 = c06954;
                    String strM9788 = C3286.m9788(f38316, 66, 2, i59);
                    sArr19 = f38316;
                    int iM113023 = (ThreadFactoryC3888.m11306("ᩴ᩻") + i42) * (-75);
                    int i73 = ((iM113023 ^ i41) * 1999) ^ (-481939298);
                    str36 = strM9788;
                    i36 = iM113023 ^ 1151642980;
                    str34 = str51;
                    c4885 = c4885;
                    str28 = str28;
                    i49 = i71;
                    iM113011 = iM113011;
                    sArr18 = sArr49;
                    iM450212 = i72;
                    c1937 = c1937;
                    strM6918 = strM6918;
                    c06929 = c06929;
                    c69911 = c69911;
                    sArr24 = sArr24;
                    i55 = i55;
                    i56 = i56;
                    iM450214 = iM450214;
                    c06930 = c06930;
                    c238011 = c238011;
                    c12522 = c12526;
                    sArr16 = sArr28;
                    str26 = str26;
                    i37 = i73;
                    c06923 = c06923;
                    c69911 = c69911;
                    c06923 = c06923;
                    str26 = str26;
                    c238011 = c238011;
                    c06930 = c06930;
                    str23 = str7;
                    str36 = str36;
                    str22 = str28;
                    c4884 = c4885;
                    c06925 = c06925;
                    c22524 = c22524;
                    strM4892 = strM4892;
                    c06927 = c06927;
                    c13351 = c13351;
                    strM7604 = strM7604;
                    c06928 = c06928;
                    c4176 = c4176;
                    str27 = str27;
                    sArr21 = sArr21;
                    sArr25 = sArr25;
                    sArr26 = sArr26;
                    sArr27 = sArr27;
                    i48 = i48;
                    iM450213 = iM450213;
                    i57 = i57;
                    i34 = i36;
                    i43 = i37;
                    sArr28 = sArr16;
                    C0690 c069411 = c06919;
                    c17459 = c17458;
                    c06935 = c069411;
                    sArr22 = sArr22;
                    i51 = i51;
                    i53 = i53;
                    i50 = i50;
                    i52 = i52;
                    iM11309 = iM11309;
                    iM113010 = iM113010;
                    c06931 = c06931;
                    sArr24 = sArr24;
                    i55 = i55;
                    i56 = i56;
                    c1937 = c1937;
                    strM6918 = strM6918;
                    iM450214 = iM450214;
                    c06929 = c06929;
                    c69911 = c69911;
                    c06923 = c06923;
                    sArr25 = sArr25;
                    sArr26 = sArr26;
                    str26 = str26;
                    c238011 = c238011;
                    sArr21 = sArr21;
                    sArr27 = sArr27;
                    c06927 = c06927;
                    c13351 = c13351;
                    i57 = i57;
                    strM7604 = strM7604;
                    iM450213 = iM450213;
                    c06928 = c06928;
                    c4176 = c4176;
                    str27 = str27;
                    i48 = i48;
                    c06925 = c06925;
                    c22524 = c22524;
                    strM4892 = strM4892;
                    i44 = i34;
                    c9699 = c9699;
                    c06933 = c06933;
                    c06932 = c06932;
                    c06935 = c06935;
                    str30 = str30;
                    i58 = i58;
                    sArr29 = sArr29;
                    str32 = str32;
                    c12522 = c12522;
                    c4885 = c4884;
                    c146310 = c146310;
                    sArr30 = sArr30;
                    c17459 = c17459;
                    str34 = str34;
                    str28 = str22;
                    str35 = str35;
                    short[] sArr315 = sArr20;
                    str31 = str23;
                    c11109 = c11109;
                    c06934 = c0696;
                    sArr20 = sArr315;
                    break;
                case -852493638:
                case 1804085701:
                    str35 = str35;
                    i58 = i58;
                    sArr29 = sArr29;
                    c06920 = c06933;
                    c14639 = c146310;
                    str25 = str32;
                    c06935 = c06935;
                    c17459 = c17459;
                    str36 = str36;
                    sArr30 = sArr30;
                    c06932 = c06932;
                    str30 = str30;
                    c9699 = c9699;
                    str8 = str31;
                    sArr22 = sArr22;
                    iM11309 = iM11309;
                    iM113010 = iM113010;
                    i50 = i50;
                    i51 = i51;
                    i52 = i52;
                    i53 = i53;
                    sArr20 = sArr20;
                    c0696 = c06934;
                    c11109 = c11109;
                    i38 = iM113011;
                    if (RunnableC3388.f12514 >= 0) {
                        i14 = i38;
                        str32 = str25;
                        c4883 = c4885;
                        str9 = str28;
                        c0697 = c06931;
                        c12522 = c12522;
                        str34 = str34;
                        c0698 = c06923;
                        str10 = str26;
                        c1935 = c1937;
                        str11 = strM6918;
                        c06912 = c06927;
                        c13350 = c13351;
                        c0699 = c06929;
                        c6999 = c69911;
                        sArr4 = sArr18;
                        sArr5 = sArr19;
                        sArr6 = sArr24;
                        sArr8 = sArr25;
                        sArr7 = sArr26;
                        i9 = iM450212;
                        i11 = i49;
                        i12 = i55;
                        i13 = i56;
                        i15 = iM450214;
                        c06910 = c06930;
                        c23809 = c238011;
                        c06933 = c06920;
                        c146310 = c14639;
                        str16 = strM7604;
                        i18 = iM450213;
                        int iM4502110 = C19806.m45029("ᩳۧ") ^ i42;
                        i16 = ((iM4502110 ^ i41) * 31169) ^ (-1551417952);
                        i17 = iM4502110 ^ (-2119299928);
                        strM7604 = str16;
                        iM450213 = i18;
                        c06930 = c06910;
                        i49 = i11;
                        sArr22 = sArr22;
                        i51 = i51;
                        i53 = i53;
                        i50 = i50;
                        i52 = i52;
                        i58 = i58;
                        str35 = str35;
                        iM11309 = iM11309;
                        iM113010 = iM113010;
                        iM113011 = i14;
                        sArr18 = sArr4;
                        iM450212 = i9;
                        c06931 = c0697;
                        sArr24 = sArr6;
                        i55 = i12;
                        i56 = i13;
                        c1937 = c1935;
                        strM6918 = str11;
                        iM450214 = i15;
                        sArr19 = sArr5;
                        str28 = str9;
                        c06929 = c0699;
                        c69911 = c6999;
                        c06923 = c0698;
                        sArr25 = sArr8;
                        sArr26 = sArr7;
                        str26 = str10;
                        c238011 = c23809;
                        c06927 = c06912;
                        c13351 = c13350;
                        i44 = i17;
                        i43 = i16;
                        c9699 = c9699;
                        c06933 = c06933;
                        c06932 = c06932;
                        c06935 = c06935;
                        str30 = str30;
                        c11109 = c11109;
                        sArr29 = sArr29;
                        str32 = str32;
                        c12522 = c12522;
                        c146310 = c146310;
                        sArr30 = sArr30;
                        c06934 = c0696;
                        sArr20 = sArr20;
                        c17459 = c17459;
                        str34 = str34;
                        c4885 = c4883;
                        str31 = str8;
                        str36 = str36;
                    } else {
                        iM113011 = i38;
                        str32 = str25;
                        c06933 = c06920;
                        c146310 = c14639;
                        c22523 = c22524;
                        str15 = strM4892;
                        iM11306 = (ThreadFactoryC3888.m11306("ᩳܿ") ^ i41) * (-117);
                        c4884 = c4885;
                        i32 = ((iM11306 ^ i42) * 21979) ^ (-1616115319);
                        c06918 = c06936;
                        str24 = str28;
                        i35 = -908706470;
                        i39 = iM11306 ^ i35;
                        c22524 = c22523;
                        strM4892 = str15;
                        str22 = str24;
                        c06936 = c06918;
                        i34 = i39;
                        i43 = i32;
                        i49 = i49;
                        str23 = str8;
                        str36 = str36;
                        iM113011 = iM113011;
                        sArr18 = sArr18;
                        iM450212 = iM450212;
                        sArr19 = sArr19;
                        sArr22 = sArr22;
                        i51 = i51;
                        i53 = i53;
                        i50 = i50;
                        i52 = i52;
                        iM11309 = iM11309;
                        iM113010 = iM113010;
                        c06931 = c06931;
                        sArr24 = sArr24;
                        i55 = i55;
                        i56 = i56;
                        c1937 = c1937;
                        strM6918 = strM6918;
                        iM450214 = iM450214;
                        c06929 = c06929;
                        c69911 = c69911;
                        c06923 = c06923;
                        sArr25 = sArr25;
                        sArr26 = sArr26;
                        str26 = str26;
                        c238011 = c238011;
                        sArr21 = sArr21;
                        sArr27 = sArr27;
                        c06927 = c06927;
                        c13351 = c13351;
                        i57 = i57;
                        strM7604 = strM7604;
                        iM450213 = iM450213;
                        c06928 = c06928;
                        c4176 = c4176;
                        str27 = str27;
                        i48 = i48;
                        c06925 = c06925;
                        c22524 = c22524;
                        strM4892 = strM4892;
                        i44 = i34;
                        c9699 = c9699;
                        c06933 = c06933;
                        c06932 = c06932;
                        c06935 = c06935;
                        str30 = str30;
                        i58 = i58;
                        sArr29 = sArr29;
                        str32 = str32;
                        c12522 = c12522;
                        c4885 = c4884;
                        c146310 = c146310;
                        sArr30 = sArr30;
                        c17459 = c17459;
                        str34 = str34;
                        str28 = str22;
                        str35 = str35;
                        short[] sArr316 = sArr20;
                        str31 = str23;
                        c11109 = c11109;
                        c06934 = c0696;
                        sArr20 = sArr316;
                    }
                    break;
                case -704308383:
                case -96100435:
                    i58 = i58;
                    sArr29 = sArr29;
                    c0692 = c06938;
                    c15467 = c15468;
                    str3 = str29;
                    i2 = iM113011;
                    m28445(str3, i2, c0692, ViewGroupOnHierarchyChangeListenerC1916.m6241(f38316, 27, 16, i59), c15467);
                    C0690 c06956 = C0690.f2878;
                    C12520 c12527 = new C12520();
                    sArr2 = f38316;
                    i3 = 43;
                    i4 = 2;
                    int iM450220 = (i41 - C19806.m45029("᩵᩷")) * (-3);
                    i43 = ((iM450220 ^ i42) * (-21111)) ^ 1519285787;
                    i44 = iM450220 ^ (-901250704);
                    c12520 = c12527;
                    c06931 = c06956;
                    iM113011 = i2;
                    sArr22 = sArr22;
                    i51 = i51;
                    i53 = i53;
                    i50 = i50;
                    c11109 = c11109;
                    i52 = i52;
                    iM11309 = iM11309;
                    iM113010 = iM113010;
                    c06933 = c06933;
                    c9699 = c9699;
                    c06932 = c06932;
                    c06935 = c06935;
                    str30 = str30;
                    c06934 = c06934;
                    sArr20 = sArr20;
                    i58 = i58;
                    sArr29 = sArr29;
                    str32 = str32;
                    c146310 = c146310;
                    sArr30 = sArr30;
                    str31 = str31;
                    str35 = str35;
                    c17459 = c17459;
                    str36 = str36;
                    int i74 = i3;
                    c06938 = c0692;
                    sArr32 = sArr2;
                    c12522 = c12520;
                    str29 = str3;
                    i60 = i4;
                    c15468 = c15467;
                    i61 = i74;
                    break;
                case -596912347:
                case 1974012876:
                    str35 = str35;
                    i58 = i58;
                    sArr29 = sArr29;
                    C0690 c06957 = c06935;
                    c17459 = c17459;
                    str36 = str36;
                    sArr30 = sArr30;
                    C0690 c06958 = c06932;
                    str30 = str30;
                    c9698 = c9699;
                    str2 = str31;
                    iM11309 = iM11309;
                    i50 = i50;
                    i51 = i51;
                    i52 = i52;
                    i53 = i53;
                    sArr20 = sArr20;
                    c0691 = c06934;
                    c11109 = c11109;
                    short[] sArr50 = sArr22;
                    String strM3363 = C0797.m3361(sArr50, 165, 13, i59);
                    i = iM113010;
                    C0690 c06959 = c06933;
                    sArr = sArr50;
                    str = str32;
                    c06935 = c06957;
                    c14637 = c146310;
                    c06932 = c06958;
                    c0690 = c06959;
                    m28445(str, i, c0690, strM3363, c14637);
                    c06924 = C0690.f2936;
                    c1937 = new C1935();
                    sArr23 = f38316;
                    i54 = 178;
                    if (C0216.m1591() > 0) {
                        int iM450221 = (i41 - C19806.m45029("ܶܰ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i5 = ((iM450221 ^ i42) * (-10789)) ^ (-2061554178);
                        i6 = iM450221 ^ 1565355684;
                        sArr22 = sArr;
                        iM113010 = i;
                        sArr21 = sArr21;
                        c0693 = c0690;
                        c146310 = c14637;
                        c06923 = c06923;
                        c238011 = c238011;
                        str6 = strM7604;
                        i8 = iM450213;
                        sArr24 = sArr24;
                        i55 = i55;
                        i56 = i56;
                        strM6918 = strM6918;
                        iM450214 = iM450214;
                        c0695 = c06926;
                        str32 = str;
                        c06933 = c0693;
                        sArr21 = sArr21;
                        i7 = i6;
                        i43 = i5;
                        c1355 = c1355;
                        strM940 = strM940;
                        c12522 = c12522;
                        c06930 = c0694;
                        i49 = i49;
                        i51 = i51;
                        i53 = i53;
                        i50 = i50;
                        c11109 = c11109;
                        i52 = i52;
                        i58 = i58;
                        iM11309 = iM11309;
                        iM113011 = iM113011;
                        sArr18 = sArr18;
                        iM450212 = iM450212;
                        c06931 = c06931;
                        c06926 = c0695;
                        sArr19 = sArr3;
                        str28 = str4;
                        c06929 = c06929;
                        c69911 = c69911;
                        sArr25 = sArr25;
                        c4885 = c4882;
                        sArr26 = sArr26;
                        str26 = str5;
                        sArr27 = sArr27;
                        c06927 = c06927;
                        c13351 = c13351;
                        i57 = i57;
                        strM7604 = str6;
                        iM450213 = i8;
                        c06928 = c06928;
                        c4176 = c4176;
                        str27 = str27;
                        i48 = i48;
                        c06925 = c06925;
                        c22524 = c22524;
                        strM4892 = strM4892;
                        i44 = i7;
                        c9699 = c9698;
                        c06932 = c06932;
                        c06935 = c06935;
                        str30 = str30;
                        c06934 = c0691;
                        sArr20 = sArr20;
                        sArr29 = sArr29;
                        str35 = str35;
                        str32 = str32;
                        c146310 = c146310;
                        sArr30 = sArr30;
                        str31 = str2;
                        c17459 = c17459;
                        str36 = str36;
                        str34 = str34;
                    }
                    int iM450222 = (i41 - C19806.m45029("۬ۖ")) * (-79);
                    int i75 = i;
                    i5 = ((iM450222 ^ i42) * (-4243)) ^ (-585675531);
                    i6 = iM450222 ^ 1522901975;
                    c238011 = null;
                    sArr22 = sArr;
                    iM113010 = i75;
                    c0693 = c0690;
                    c146310 = c14637;
                    strM7604 = strM7604;
                    iM450213 = iM450213;
                    str6 = strM7604;
                    i8 = iM450213;
                    sArr24 = sArr24;
                    i55 = i55;
                    i56 = i56;
                    strM6918 = strM6918;
                    iM450214 = iM450214;
                    c0695 = c06926;
                    str32 = str;
                    c06933 = c0693;
                    sArr21 = sArr21;
                    i7 = i6;
                    i43 = i5;
                    c1355 = c1355;
                    strM940 = strM940;
                    c12522 = c12522;
                    c06930 = c0694;
                    i49 = i49;
                    i51 = i51;
                    i53 = i53;
                    i50 = i50;
                    c11109 = c11109;
                    i52 = i52;
                    i58 = i58;
                    iM11309 = iM11309;
                    iM113011 = iM113011;
                    sArr18 = sArr18;
                    iM450212 = iM450212;
                    c06931 = c06931;
                    c06926 = c0695;
                    sArr19 = sArr3;
                    str28 = str4;
                    c06929 = c06929;
                    c69911 = c69911;
                    sArr25 = sArr25;
                    c4885 = c4882;
                    sArr26 = sArr26;
                    str26 = str5;
                    sArr27 = sArr27;
                    c06927 = c06927;
                    c13351 = c13351;
                    i57 = i57;
                    strM7604 = str6;
                    iM450213 = i8;
                    c06928 = c06928;
                    c4176 = c4176;
                    str27 = str27;
                    i48 = i48;
                    c06925 = c06925;
                    c22524 = c22524;
                    strM4892 = strM4892;
                    i44 = i7;
                    c9699 = c9698;
                    c06932 = c06932;
                    c06935 = c06935;
                    str30 = str30;
                    c06934 = c0691;
                    sArr20 = sArr20;
                    sArr29 = sArr29;
                    str35 = str35;
                    str32 = str32;
                    c146310 = c146310;
                    sArr30 = sArr30;
                    str31 = str2;
                    c17459 = c17459;
                    str36 = str36;
                    str34 = str34;
                    break;
                case -565376413:
                case 711376879:
                    str35 = str35;
                    i58 = i58;
                    sArr29 = sArr29;
                    c06921 = c06935;
                    c17459 = c17459;
                    str36 = str36;
                    sArr30 = sArr30;
                    c06922 = c06932;
                    str30 = str30;
                    c9699 = c9699;
                    str8 = str31;
                    iM11309 = iM11309;
                    i50 = i50;
                    i51 = i51;
                    i52 = i52;
                    i53 = i53;
                    sArr20 = sArr20;
                    c0696 = c06934;
                    c11109 = c11109;
                    C0962.m3746();
                    if (C0278.f1572 > 0) {
                        str25 = str32;
                        iM113010 = iM113010;
                        i38 = iM113011;
                        c06935 = c06921;
                        c14639 = c146310;
                        c06932 = c06922;
                        c06920 = c06933;
                        sArr22 = sArr22;
                        iM113011 = i38;
                        str32 = str25;
                        c06933 = c06920;
                        c146310 = c14639;
                        c22523 = c22524;
                        str15 = strM4892;
                        iM11306 = (ThreadFactoryC3888.m11306("ᩳܿ") ^ i41) * (-117);
                        c4884 = c4885;
                        i32 = ((iM11306 ^ i42) * 21979) ^ (-1616115319);
                        c06918 = c06936;
                        str24 = str28;
                        i35 = -908706470;
                        i39 = iM11306 ^ i35;
                        c22524 = c22523;
                        strM4892 = str15;
                        str22 = str24;
                        c06936 = c06918;
                        i34 = i39;
                        i43 = i32;
                        i49 = i49;
                        str23 = str8;
                        str36 = str36;
                        iM113011 = iM113011;
                        sArr18 = sArr18;
                        iM450212 = iM450212;
                        sArr19 = sArr19;
                        sArr22 = sArr22;
                        i51 = i51;
                        i53 = i53;
                        i50 = i50;
                        i52 = i52;
                        iM11309 = iM11309;
                        iM113010 = iM113010;
                        c06931 = c06931;
                        sArr24 = sArr24;
                        i55 = i55;
                        i56 = i56;
                        c1937 = c1937;
                        strM6918 = strM6918;
                        iM450214 = iM450214;
                        c06929 = c06929;
                        c69911 = c69911;
                        c06923 = c06923;
                        sArr25 = sArr25;
                        sArr26 = sArr26;
                        str26 = str26;
                        c238011 = c238011;
                        sArr21 = sArr21;
                        sArr27 = sArr27;
                        c06927 = c06927;
                        c13351 = c13351;
                        i57 = i57;
                        strM7604 = strM7604;
                        iM450213 = iM450213;
                        c06928 = c06928;
                        c4176 = c4176;
                        str27 = str27;
                        i48 = i48;
                        c06925 = c06925;
                        c22524 = c22524;
                        strM4892 = strM4892;
                        i44 = i34;
                        c9699 = c9699;
                        c06933 = c06933;
                        c06932 = c06932;
                        c06935 = c06935;
                        str30 = str30;
                        i58 = i58;
                        sArr29 = sArr29;
                        str32 = str32;
                        c12522 = c12522;
                        c4885 = c4884;
                        c146310 = c146310;
                        sArr30 = sArr30;
                        c17459 = c17459;
                        str34 = str34;
                        str28 = str22;
                        str35 = str35;
                        short[] sArr317 = sArr20;
                        str31 = str23;
                        c11109 = c11109;
                        c06934 = c0696;
                        sArr20 = sArr317;
                    } else {
                        c4883 = c4885;
                        str17 = str28;
                        c06913 = c06931;
                        c12521 = c12522;
                        str34 = str34;
                        c06914 = c06933;
                        c14638 = c146310;
                        str18 = str32;
                        i51 = i51;
                        i50 = i50;
                        iM11309 = iM11309;
                        c1936 = c1937;
                        str19 = strM6918;
                        sArr9 = sArr18;
                        sArr10 = sArr19;
                        sArr11 = sArr22;
                        sArr12 = sArr24;
                        i19 = iM450212;
                        i21 = iM113010;
                        i22 = i49;
                        i25 = i55;
                        i26 = i56;
                        i27 = iM113011;
                        i28 = iM450214;
                        c06917 = c06930;
                        c06916 = c06922;
                        c06915 = c06921;
                        c238010 = c238011;
                        int iM1130111 = ThreadFactoryC3888.m11306("ۤ᩺") ^ i42;
                        C6999 c69914 = c69911;
                        i44 = iM1130111 ^ 133551627;
                        i43 = ((iM1130111 ^ i41) * 27711) ^ (-997921131);
                        c06923 = c06923;
                        str26 = str26;
                        c238011 = c238010;
                        c06930 = c06917;
                        i49 = i22;
                        sArr22 = sArr11;
                        c06935 = c06915;
                        str30 = str30;
                        i53 = i53;
                        c11109 = c11109;
                        i52 = i52;
                        i58 = i58;
                        str35 = str35;
                        iM113010 = i21;
                        iM113011 = i27;
                        str32 = str18;
                        sArr18 = sArr9;
                        iM450212 = i19;
                        c06931 = c06913;
                        sArr24 = sArr12;
                        i55 = i25;
                        i56 = i26;
                        c1937 = c1936;
                        strM6918 = str19;
                        iM450214 = i28;
                        sArr19 = sArr10;
                        str28 = str17;
                        c06929 = c06929;
                        c69911 = c69914;
                        c9699 = c9699;
                        c06933 = c06914;
                        c06932 = c06916;
                        sArr30 = sArr30;
                        c06934 = c0696;
                        sArr20 = sArr20;
                        sArr29 = sArr29;
                        c17459 = c17459;
                        c12522 = c12521;
                        c146310 = c14638;
                        str31 = str8;
                        str36 = str36;
                        str34 = str34;
                        c4885 = c4883;
                    }
                    break;
                case -373487729:
                case 765937866:
                    str35 = str35;
                    i58 = i58;
                    sArr29 = sArr29;
                    short[] sArr51 = sArr30;
                    c0696 = c06934;
                    c9699 = c9699;
                    int i76 = i50;
                    c11109 = c11109;
                    int i77 = i51;
                    String strM7605 = C2477.m7604(sArr51, i76, i77, i59);
                    int i78 = iM11309;
                    C0690 c06960 = c06935;
                    C17458 c174512 = c17459;
                    String str52 = str36;
                    str8 = str31;
                    m28445(str52, i78, c06960, strM7605, c174512);
                    C0690 c06961 = C0690.f2922;
                    C6169 c61610 = new C6169();
                    c17459 = c174512;
                    str36 = str52;
                    String strM3859 = C1025.m3859(f38316, 89, 2, i59);
                    sArr17 = f38316;
                    int iM113024 = (ThreadFactoryC3888.m11306("᩶ܺ") + i42) * 77;
                    c06932 = c06961;
                    c4883 = c4885;
                    str20 = str28;
                    c06913 = c06931;
                    c12521 = c12522;
                    c06914 = c06933;
                    str18 = str32;
                    i51 = i77;
                    i44 = iM113024 ^ 668098685;
                    i50 = i76;
                    iM11309 = i78;
                    c1936 = c1937;
                    str19 = strM6918;
                    sArr9 = sArr18;
                    sArr11 = sArr22;
                    sArr12 = sArr24;
                    i19 = iM450212;
                    i21 = iM113010;
                    i22 = i49;
                    i25 = i55;
                    i26 = i56;
                    i27 = iM113011;
                    i28 = iM450214;
                    c06917 = c06930;
                    i52 = 91;
                    i53 = 3;
                    str30 = strM3859;
                    i43 = ((iM113024 ^ i41) * (-9905)) ^ 2146674967;
                    c06915 = c06960;
                    str21 = str34;
                    c14638 = c146310;
                    c6169 = c61610;
                    sArr14 = sArr19;
                    sArr30 = sArr51;
                    sArr19 = sArr14;
                    c9699 = c9699;
                    c06930 = c06917;
                    i49 = i22;
                    c146310 = c14638;
                    sArr22 = sArr11;
                    c06935 = c06915;
                    str31 = str8;
                    sArr29 = sArr29;
                    str35 = str35;
                    c17459 = c17459;
                    str36 = str36;
                    iM113010 = i21;
                    iM113011 = i27;
                    str32 = str18;
                    sArr18 = sArr9;
                    iM450212 = i19;
                    c06931 = c06913;
                    sArr24 = sArr12;
                    i55 = i25;
                    i56 = i26;
                    c1937 = c1936;
                    strM6918 = str19;
                    iM450214 = i28;
                    str28 = str20;
                    str34 = str21;
                    c06933 = c06914;
                    i58 = i58;
                    c12522 = c12521;
                    c4885 = c4883;
                    C0690 c069412 = c0696;
                    sArr20 = sArr17;
                    c11109 = c11109;
                    c06934 = c069412;
                    break;
                case -256336774:
                case 2083840333:
                    i58 = i58;
                    sArr29 = sArr29;
                    c9699 = c9699;
                    String str53 = str31;
                    int i79 = i52;
                    int i80 = i53;
                    C0690 c06962 = c06934;
                    c11109 = c11109;
                    short[] sArr52 = sArr20;
                    c0696 = c06962;
                    i52 = i79;
                    sArr20 = sArr52;
                    str35 = str35;
                    C6169 c61611 = c6169;
                    String str54 = str30;
                    C0690 c06963 = c06932;
                    i53 = i80;
                    m28445(str54, ThreadFactoryC3888.m11306(C1460.m5047(sArr52, i79, i80, i59)) ^ 2098349871, c06963, C1461.m5070(f38316, 94, 17, i59), c61611);
                    c06936 = C0690.f2912;
                    if (C1875.m6086() == 0) {
                        int iM450223 = (C19806.m45029("ۜۢ") + i41) * 55;
                        c6169 = c61611;
                        i30 = ((iM450223 ^ i42) * (-23435)) ^ (-682522885);
                        i31 = iM450223 ^ (-1695007527);
                        c4883 = c4885;
                        c06913 = c06931;
                        c12521 = c12522;
                        c06914 = c06933;
                        str18 = str32;
                        c06915 = c06935;
                        c17459 = c17459;
                        str36 = str36;
                        sArr15 = sArr30;
                        c1936 = c1937;
                        str19 = strM6918;
                        sArr9 = sArr18;
                        sArr11 = sArr22;
                        sArr12 = sArr24;
                        i19 = iM450212;
                        i21 = iM113010;
                        i22 = i49;
                        i25 = i55;
                        i26 = i56;
                        i27 = iM113011;
                        i28 = iM450214;
                        str30 = str54;
                        str8 = str53;
                        str21 = str34;
                        c14638 = c146310;
                        sArr14 = sArr19;
                        c06916 = c06963;
                        str20 = str28;
                        c06917 = c06930;
                        i44 = i31;
                        i43 = i30;
                        str30 = str30;
                        i53 = i53;
                        i52 = i52;
                        sArr17 = sArr20;
                        c06932 = c06916;
                        sArr30 = sArr15;
                        sArr19 = sArr14;
                        c9699 = c9699;
                        c06930 = c06917;
                        i49 = i22;
                        c146310 = c14638;
                        sArr22 = sArr11;
                        c06935 = c06915;
                        str31 = str8;
                        sArr29 = sArr29;
                        str35 = str35;
                        c17459 = c17459;
                        str36 = str36;
                        iM113010 = i21;
                        iM113011 = i27;
                        str32 = str18;
                        sArr18 = sArr9;
                        iM450212 = i19;
                        c06931 = c06913;
                        sArr24 = sArr12;
                        i55 = i25;
                        i56 = i26;
                        c1937 = c1936;
                        strM6918 = str19;
                        iM450214 = i28;
                        str28 = str20;
                        str34 = str21;
                        c06933 = c06914;
                        i58 = i58;
                        c12522 = c12521;
                        c4885 = c4883;
                        C0690 c069413 = c0696;
                        sArr20 = sArr17;
                        c11109 = c11109;
                        c06934 = c069413;
                    } else {
                        c6169 = c61611;
                        c06933 = c06933;
                        c146310 = c146310;
                        str32 = str32;
                        c06935 = c06935;
                        c17459 = c17459;
                        str36 = str36;
                        sArr30 = sArr30;
                        sArr22 = sArr22;
                        iM11309 = iM11309;
                        iM113010 = iM113010;
                        i50 = i50;
                        i51 = i51;
                        iM113011 = iM113011;
                        str30 = str54;
                        c06932 = c06963;
                        str8 = str53;
                        c22523 = c22524;
                        str15 = strM4892;
                        iM11306 = (ThreadFactoryC3888.m11306("ᩳܿ") ^ i41) * (-117);
                        c4884 = c4885;
                        i32 = ((iM11306 ^ i42) * 21979) ^ (-1616115319);
                        c06918 = c06936;
                        str24 = str28;
                        i35 = -908706470;
                        i39 = iM11306 ^ i35;
                        c22524 = c22523;
                        strM4892 = str15;
                        str22 = str24;
                        c06936 = c06918;
                        i34 = i39;
                        i43 = i32;
                        i49 = i49;
                        str23 = str8;
                        str36 = str36;
                        iM113011 = iM113011;
                        sArr18 = sArr18;
                        iM450212 = iM450212;
                        sArr19 = sArr19;
                        sArr22 = sArr22;
                        i51 = i51;
                        i53 = i53;
                        i50 = i50;
                        i52 = i52;
                        iM11309 = iM11309;
                        iM113010 = iM113010;
                        c06931 = c06931;
                        sArr24 = sArr24;
                        i55 = i55;
                        i56 = i56;
                        c1937 = c1937;
                        strM6918 = strM6918;
                        iM450214 = iM450214;
                        c06929 = c06929;
                        c69911 = c69911;
                        c06923 = c06923;
                        sArr25 = sArr25;
                        sArr26 = sArr26;
                        str26 = str26;
                        c238011 = c238011;
                        sArr21 = sArr21;
                        sArr27 = sArr27;
                        c06927 = c06927;
                        c13351 = c13351;
                        i57 = i57;
                        strM7604 = strM7604;
                        iM450213 = iM450213;
                        c06928 = c06928;
                        c4176 = c4176;
                        str27 = str27;
                        i48 = i48;
                        c06925 = c06925;
                        c22524 = c22524;
                        strM4892 = strM4892;
                        i44 = i34;
                        c9699 = c9699;
                        c06933 = c06933;
                        c06932 = c06932;
                        c06935 = c06935;
                        str30 = str30;
                        i58 = i58;
                        sArr29 = sArr29;
                        str32 = str32;
                        c12522 = c12522;
                        c4885 = c4884;
                        c146310 = c146310;
                        sArr30 = sArr30;
                        c17459 = c17459;
                        str34 = str34;
                        str28 = str22;
                        str35 = str35;
                        short[] sArr318 = sArr20;
                        str31 = str23;
                        c11109 = c11109;
                        c06934 = c0696;
                        sArr20 = sArr318;
                    }
                    break;
                case -180327758:
                case 1882659661:
                    i29 = i58;
                    sArr13 = sArr29;
                    c9699 = c9699;
                    String str55 = str31;
                    C11109 c111010 = new C11109();
                    String strM8470 = C2788.m8470(f38316, UMErrorCode.E_UM_BE_CREATE_FAILED, 2, i59);
                    int iM113025 = ThreadFactoryC3888.m11306(ViewGroupOnHierarchyChangeListenerC1916.m6241(f38316, UMErrorCode.E_UM_BE_RAW_OVERSIZE, 3, i59));
                    int iM450224 = (C19806.m45029("ܺ᩵") ^ i42) * 77;
                    i45 = iM113025;
                    i44 = iM450224 ^ (-447811400);
                    i43 = ((iM450224 ^ i41) * 10389) ^ (-988819097);
                    c4883 = c4885;
                    str17 = str28;
                    c06913 = c06931;
                    c12521 = c12522;
                    str34 = str34;
                    c06914 = c06933;
                    c14638 = c146310;
                    str18 = str32;
                    c06915 = c06935;
                    c17459 = c17459;
                    str36 = str36;
                    sArr30 = sArr30;
                    c06916 = c06932;
                    str30 = str30;
                    sArr20 = sArr20;
                    str35 = strM8470;
                    c06923 = c06923;
                    str26 = str26;
                    c1936 = c1937;
                    str19 = strM6918;
                    c06929 = c06929;
                    c69910 = c69911;
                    sArr9 = sArr18;
                    sArr10 = sArr19;
                    sArr11 = sArr22;
                    sArr12 = sArr24;
                    i19 = iM450212;
                    i20 = iM11309;
                    i21 = iM113010;
                    i22 = i49;
                    i23 = i50;
                    i24 = i51;
                    i52 = i52;
                    i53 = i53;
                    i25 = i55;
                    i26 = i56;
                    i27 = iM113011;
                    i28 = iM450214;
                    c06917 = c06930;
                    c0696 = c06934;
                    str8 = str55;
                    c11109 = c111010;
                    c238010 = c238011;
                    c06923 = c06923;
                    str26 = str26;
                    c238011 = c238010;
                    c06930 = c06917;
                    i49 = i22;
                    sArr22 = sArr11;
                    i51 = i24;
                    i53 = i53;
                    i50 = i23;
                    c06934 = c0696;
                    i52 = i52;
                    sArr20 = sArr20;
                    i58 = i29;
                    str35 = str35;
                    iM11309 = i20;
                    iM113010 = i21;
                    iM113011 = i27;
                    sArr18 = sArr9;
                    iM450212 = i19;
                    c06931 = c06913;
                    sArr24 = sArr12;
                    i55 = i25;
                    i56 = i26;
                    c1937 = c1936;
                    strM6918 = str19;
                    iM450214 = i28;
                    sArr19 = sArr10;
                    str28 = str17;
                    c06929 = c06929;
                    c69911 = c69910;
                    c9699 = c9699;
                    c06933 = c06914;
                    c06932 = c06916;
                    c06935 = c06915;
                    str31 = str8;
                    str30 = str30;
                    sArr29 = sArr13;
                    str36 = str36;
                    str32 = str18;
                    c12522 = c12521;
                    c146310 = c14638;
                    sArr30 = sArr30;
                    c17459 = c17459;
                    str34 = str34;
                    c4885 = c4883;
                    break;
                case -39931800:
                case 1840724067:
                    i58 = i58;
                    sArr29 = sArr29;
                    c9699 = c9699;
                    String str56 = str31;
                    C0690 c06964 = c06934;
                    c11109 = c11109;
                    str35 = str35;
                    if (C1937.f7317 < 0) {
                        c17459 = c17459;
                        str36 = str36;
                        sArr30 = sArr30;
                        c06922 = c06932;
                        str30 = str30;
                        sArr20 = sArr20;
                        iM11309 = iM11309;
                        i50 = i50;
                        i52 = i52;
                        i53 = i53;
                        c0696 = c06964;
                        str8 = str56;
                        c06921 = c06935;
                        i51 = i51;
                        c4883 = c4885;
                        str17 = str28;
                        c06913 = c06931;
                        c12521 = c12522;
                        str34 = str34;
                        c06914 = c06933;
                        c14638 = c146310;
                        str18 = str32;
                        i51 = i51;
                        i50 = i50;
                        iM11309 = iM11309;
                        c1936 = c1937;
                        str19 = strM6918;
                        sArr9 = sArr18;
                        sArr10 = sArr19;
                        sArr11 = sArr22;
                        sArr12 = sArr24;
                        i19 = iM450212;
                        i21 = iM113010;
                        i22 = i49;
                        i25 = i55;
                        i26 = i56;
                        i27 = iM113011;
                        i28 = iM450214;
                        c06917 = c06930;
                        c06916 = c06922;
                        c06915 = c06921;
                        c238010 = c238011;
                        int iM1130112 = ThreadFactoryC3888.m11306("ۤ᩺") ^ i42;
                        C6999 c69915 = c69911;
                        i44 = iM1130112 ^ 133551627;
                        i43 = ((iM1130112 ^ i41) * 27711) ^ (-997921131);
                        c06923 = c06923;
                        str26 = str26;
                        c238011 = c238010;
                        c06930 = c06917;
                        i49 = i22;
                        sArr22 = sArr11;
                        c06935 = c06915;
                        str30 = str30;
                        i53 = i53;
                        c11109 = c11109;
                        i52 = i52;
                        i58 = i58;
                        str35 = str35;
                        iM113010 = i21;
                        iM113011 = i27;
                        str32 = str18;
                        sArr18 = sArr9;
                        iM450212 = i19;
                        c06931 = c06913;
                        sArr24 = sArr12;
                        i55 = i25;
                        i56 = i26;
                        c1937 = c1936;
                        strM6918 = str19;
                        iM450214 = i28;
                        sArr19 = sArr10;
                        str28 = str17;
                        c06929 = c06929;
                        c69911 = c69915;
                        c9699 = c9699;
                        c06933 = c06914;
                        c06932 = c06916;
                        sArr30 = sArr30;
                        c06934 = c0696;
                        sArr20 = sArr20;
                        sArr29 = sArr29;
                        c17459 = c17459;
                        c12522 = c12521;
                        c146310 = c14638;
                        str31 = str8;
                        str36 = str36;
                        str34 = str34;
                        c4885 = c4883;
                    } else {
                        c0696 = c06964;
                        str7 = str56;
                        iM113011 = iM113011;
                        int iM4502111 = C19806.m45029("ۙۢ") ^ i41;
                        short[] sArr410 = sArr28;
                        i37 = ((iM4502111 ^ i42) * 18689) ^ 1405964806;
                        i36 = iM4502111 ^ 1889992369;
                        sArr16 = sArr410;
                        i49 = i49;
                        sArr18 = sArr18;
                        iM450212 = iM450212;
                        sArr19 = sArr19;
                        C17458 c174513 = c17459;
                        c06919 = c06935;
                        c17458 = c174513;
                        c69911 = c69911;
                        c06923 = c06923;
                        str26 = str26;
                        c238011 = c238011;
                        c06930 = c06930;
                        str23 = str7;
                        str36 = str36;
                        str22 = str28;
                        c4884 = c4885;
                        c06925 = c06925;
                        c22524 = c22524;
                        strM4892 = strM4892;
                        c06927 = c06927;
                        c13351 = c13351;
                        strM7604 = strM7604;
                        c06928 = c06928;
                        c4176 = c4176;
                        str27 = str27;
                        sArr21 = sArr21;
                        sArr25 = sArr25;
                        sArr26 = sArr26;
                        sArr27 = sArr27;
                        i48 = i48;
                        iM450213 = iM450213;
                        i57 = i57;
                        i34 = i36;
                        i43 = i37;
                        sArr28 = sArr16;
                        C0690 c069414 = c06919;
                        c17459 = c17458;
                        c06935 = c069414;
                        sArr22 = sArr22;
                        i51 = i51;
                        i53 = i53;
                        i50 = i50;
                        i52 = i52;
                        iM11309 = iM11309;
                        iM113010 = iM113010;
                        c06931 = c06931;
                        sArr24 = sArr24;
                        i55 = i55;
                        i56 = i56;
                        c1937 = c1937;
                        strM6918 = strM6918;
                        iM450214 = iM450214;
                        c06929 = c06929;
                        c69911 = c69911;
                        c06923 = c06923;
                        sArr25 = sArr25;
                        sArr26 = sArr26;
                        str26 = str26;
                        c238011 = c238011;
                        sArr21 = sArr21;
                        sArr27 = sArr27;
                        c06927 = c06927;
                        c13351 = c13351;
                        i57 = i57;
                        strM7604 = strM7604;
                        iM450213 = iM450213;
                        c06928 = c06928;
                        c4176 = c4176;
                        str27 = str27;
                        i48 = i48;
                        c06925 = c06925;
                        c22524 = c22524;
                        strM4892 = strM4892;
                        i44 = i34;
                        c9699 = c9699;
                        c06933 = c06933;
                        c06932 = c06932;
                        c06935 = c06935;
                        str30 = str30;
                        i58 = i58;
                        sArr29 = sArr29;
                        str32 = str32;
                        c12522 = c12522;
                        c4885 = c4884;
                        c146310 = c146310;
                        sArr30 = sArr30;
                        c17459 = c17459;
                        str34 = str34;
                        str28 = str22;
                        str35 = str35;
                        short[] sArr319 = sArr20;
                        str31 = str23;
                        c11109 = c11109;
                        c06934 = c0696;
                        sArr20 = sArr319;
                    }
                    break;
                case 209144315:
                case 1094925776:
                    i59 = 63229;
                    c0696 = c06934;
                    str8 = str31;
                    iM45029 = (i41 - ThreadFactoryC3888.m11306("ۛ᩻")) * (-109);
                    i32 = ((iM45029 ^ i42) * 32327) ^ (-227734526);
                    i33 = -1939884242;
                    i39 = iM45029 ^ i33;
                    c06926 = c06926;
                    c1355 = c1355;
                    strM940 = strM940;
                    c06930 = c06930;
                    str22 = str28;
                    c4884 = c4885;
                    i34 = i39;
                    i43 = i32;
                    i49 = i49;
                    str23 = str8;
                    str36 = str36;
                    iM113011 = iM113011;
                    sArr18 = sArr18;
                    iM450212 = iM450212;
                    sArr19 = sArr19;
                    sArr22 = sArr22;
                    i51 = i51;
                    i53 = i53;
                    i50 = i50;
                    i52 = i52;
                    iM11309 = iM11309;
                    iM113010 = iM113010;
                    c06931 = c06931;
                    sArr24 = sArr24;
                    i55 = i55;
                    i56 = i56;
                    c1937 = c1937;
                    strM6918 = strM6918;
                    iM450214 = iM450214;
                    c06929 = c06929;
                    c69911 = c69911;
                    c06923 = c06923;
                    sArr25 = sArr25;
                    sArr26 = sArr26;
                    str26 = str26;
                    c238011 = c238011;
                    sArr21 = sArr21;
                    sArr27 = sArr27;
                    c06927 = c06927;
                    c13351 = c13351;
                    i57 = i57;
                    strM7604 = strM7604;
                    iM450213 = iM450213;
                    c06928 = c06928;
                    c4176 = c4176;
                    str27 = str27;
                    i48 = i48;
                    c06925 = c06925;
                    c22524 = c22524;
                    strM4892 = strM4892;
                    i44 = i34;
                    c9699 = c9699;
                    c06933 = c06933;
                    c06932 = c06932;
                    c06935 = c06935;
                    str30 = str30;
                    i58 = i58;
                    sArr29 = sArr29;
                    str32 = str32;
                    c12522 = c12522;
                    c4885 = c4884;
                    c146310 = c146310;
                    sArr30 = sArr30;
                    c17459 = c17459;
                    str34 = str34;
                    str28 = str22;
                    str35 = str35;
                    short[] sArr3110 = sArr20;
                    str31 = str23;
                    c11109 = c11109;
                    c06934 = c0696;
                    sArr20 = sArr3110;
                    break;
                case 253065343:
                case 1547794856:
                    C3286.m9798();
                    throw new RuntimeException();
                case 300393181:
                case 800701074:
                    i58 = i58;
                    sArr29 = sArr29;
                    c9698 = c9699;
                    String str57 = str31;
                    C0690 c06965 = c06934;
                    c11109 = c11109;
                    m28445(str57, C19806.m45029(C0797.m3361(sArr28, 201, 3, i59)) ^ 2123911151, c06965, C1460.m5047(f38316, 204, 16, i59), c9698);
                    int iM450225 = C19806.m45029("ۙۜ") ^ i41;
                    int i81 = ((iM450225 ^ i42) * 18137) ^ 1914730029;
                    i6 = iM450225 ^ (-501673327);
                    str35 = str35;
                    c0693 = c06933;
                    c146310 = c146310;
                    str = str32;
                    c06935 = c06935;
                    c17459 = c17459;
                    str36 = str36;
                    sArr30 = sArr30;
                    c06932 = c06932;
                    str30 = str30;
                    sArr20 = sArr20;
                    iM11309 = iM11309;
                    i50 = i50;
                    i51 = i51;
                    i52 = i52;
                    i53 = i53;
                    c0691 = c06965;
                    i5 = i81;
                    str2 = str57;
                    strM7604 = strM7604;
                    iM450213 = iM450213;
                    str6 = strM7604;
                    i8 = iM450213;
                    sArr24 = sArr24;
                    i55 = i55;
                    i56 = i56;
                    strM6918 = strM6918;
                    iM450214 = iM450214;
                    c0695 = c06926;
                    str32 = str;
                    c06933 = c0693;
                    sArr21 = sArr21;
                    i7 = i6;
                    i43 = i5;
                    c1355 = c1355;
                    strM940 = strM940;
                    c12522 = c12522;
                    c06930 = c0694;
                    i49 = i49;
                    i51 = i51;
                    i53 = i53;
                    i50 = i50;
                    c11109 = c11109;
                    i52 = i52;
                    i58 = i58;
                    iM11309 = iM11309;
                    iM113011 = iM113011;
                    sArr18 = sArr18;
                    iM450212 = iM450212;
                    c06931 = c06931;
                    c06926 = c0695;
                    sArr19 = sArr3;
                    str28 = str4;
                    c06929 = c06929;
                    c69911 = c69911;
                    sArr25 = sArr25;
                    c4885 = c4882;
                    sArr26 = sArr26;
                    str26 = str5;
                    sArr27 = sArr27;
                    c06927 = c06927;
                    c13351 = c13351;
                    i57 = i57;
                    strM7604 = str6;
                    iM450213 = i8;
                    c06928 = c06928;
                    c4176 = c4176;
                    str27 = str27;
                    i48 = i48;
                    c06925 = c06925;
                    c22524 = c22524;
                    strM4892 = strM4892;
                    i44 = i7;
                    c9699 = c9698;
                    c06932 = c06932;
                    c06935 = c06935;
                    str30 = str30;
                    c06934 = c0691;
                    sArr20 = sArr20;
                    sArr29 = sArr29;
                    str35 = str35;
                    str32 = str32;
                    c146310 = c146310;
                    sArr30 = sArr30;
                    str31 = str2;
                    c17459 = c17459;
                    str36 = str36;
                    str34 = str34;
                    break;
                case 410910272:
                case 1377775282:
                    i58 = i58;
                    sArr29 = sArr29;
                    String strM7606 = C2477.m7604(sArr31, 22, 2, i59);
                    iM113011 = ThreadFactoryC3888.m11306(C1398.m4892(f38316, 24, 3, i59)) ^ 2119454574;
                    if (C1875.m6086() != 0) {
                        str35 = str35;
                        str29 = strM7606;
                        c06931 = c06931;
                        c12522 = c12522;
                        str34 = str34;
                        c06933 = c06933;
                        c146310 = c146310;
                        str32 = str32;
                        c06935 = c06935;
                        c17459 = c17459;
                        str36 = str36;
                        sArr30 = sArr30;
                        c06932 = c06932;
                        str30 = str30;
                        c9699 = c9699;
                        str7 = str31;
                        c1937 = c1937;
                        strM6918 = strM6918;
                        sArr18 = sArr18;
                        sArr22 = sArr22;
                        sArr24 = sArr24;
                        iM450212 = iM450212;
                        iM11309 = iM11309;
                        iM113010 = iM113010;
                        i49 = i49;
                        i50 = i50;
                        i51 = i51;
                        i52 = i52;
                        i53 = i53;
                        i55 = i55;
                        i56 = i56;
                        iM450214 = iM450214;
                        sArr20 = sArr20;
                        c0696 = c06934;
                        c11109 = c11109;
                        c69911 = c69911;
                        int iM4502112 = C19806.m45029("ۙۢ") ^ i41;
                        short[] sArr411 = sArr28;
                        i37 = ((iM4502112 ^ i42) * 18689) ^ 1405964806;
                        i36 = iM4502112 ^ 1889992369;
                        sArr16 = sArr411;
                    } else {
                        int iM113026 = (i41 - ThreadFactoryC3888.m11306("֨֫")) * 59;
                        int i82 = ((iM113026 ^ i42) * (-24835)) ^ (-472817781);
                        i36 = iM113026 ^ (-1205209107);
                        str35 = str35;
                        str29 = strM7606;
                        sArr16 = sArr28;
                        c4885 = c4885;
                        str28 = str28;
                        c06931 = c06931;
                        c12522 = c12522;
                        str34 = str34;
                        c06933 = c06933;
                        c146310 = c146310;
                        str32 = str32;
                        c06935 = c06935;
                        c17459 = c17459;
                        str36 = str36;
                        sArr30 = sArr30;
                        c06932 = c06932;
                        str30 = str30;
                        c9699 = c9699;
                        str7 = str31;
                        c06923 = c06923;
                        c1937 = c1937;
                        strM6918 = strM6918;
                        sArr18 = sArr18;
                        sArr19 = sArr19;
                        sArr22 = sArr22;
                        sArr24 = sArr24;
                        iM450212 = iM450212;
                        iM11309 = iM11309;
                        iM113010 = iM113010;
                        i49 = i49;
                        i50 = i50;
                        i51 = i51;
                        i52 = i52;
                        i53 = i53;
                        i55 = i55;
                        i56 = i56;
                        iM450214 = iM450214;
                        c06930 = c06930;
                        c238011 = c238011;
                        i37 = i82;
                        sArr20 = sArr20;
                        c0696 = c06934;
                        str26 = str26;
                        c11109 = c11109;
                        c69911 = c69911;
                    }
                    i49 = i49;
                    sArr18 = sArr18;
                    iM450212 = iM450212;
                    sArr19 = sArr19;
                    C17458 c174514 = c17459;
                    c06919 = c06935;
                    c17458 = c174514;
                    c69911 = c69911;
                    c06923 = c06923;
                    str26 = str26;
                    c238011 = c238011;
                    c06930 = c06930;
                    str23 = str7;
                    str36 = str36;
                    str22 = str28;
                    c4884 = c4885;
                    c06925 = c06925;
                    c22524 = c22524;
                    strM4892 = strM4892;
                    c06927 = c06927;
                    c13351 = c13351;
                    strM7604 = strM7604;
                    c06928 = c06928;
                    c4176 = c4176;
                    str27 = str27;
                    sArr21 = sArr21;
                    sArr25 = sArr25;
                    sArr26 = sArr26;
                    sArr27 = sArr27;
                    i48 = i48;
                    iM450213 = iM450213;
                    i57 = i57;
                    i34 = i36;
                    i43 = i37;
                    sArr28 = sArr16;
                    C0690 c069415 = c06919;
                    c17459 = c17458;
                    c06935 = c069415;
                    sArr22 = sArr22;
                    i51 = i51;
                    i53 = i53;
                    i50 = i50;
                    i52 = i52;
                    iM11309 = iM11309;
                    iM113010 = iM113010;
                    c06931 = c06931;
                    sArr24 = sArr24;
                    i55 = i55;
                    i56 = i56;
                    c1937 = c1937;
                    strM6918 = strM6918;
                    iM450214 = iM450214;
                    c06929 = c06929;
                    c69911 = c69911;
                    c06923 = c06923;
                    sArr25 = sArr25;
                    sArr26 = sArr26;
                    str26 = str26;
                    c238011 = c238011;
                    sArr21 = sArr21;
                    sArr27 = sArr27;
                    c06927 = c06927;
                    c13351 = c13351;
                    i57 = i57;
                    strM7604 = strM7604;
                    iM450213 = iM450213;
                    c06928 = c06928;
                    c4176 = c4176;
                    str27 = str27;
                    i48 = i48;
                    c06925 = c06925;
                    c22524 = c22524;
                    strM4892 = strM4892;
                    i44 = i34;
                    c9699 = c9699;
                    c06933 = c06933;
                    c06932 = c06932;
                    c06935 = c06935;
                    str30 = str30;
                    i58 = i58;
                    sArr29 = sArr29;
                    str32 = str32;
                    c12522 = c12522;
                    c4885 = c4884;
                    c146310 = c146310;
                    sArr30 = sArr30;
                    c17459 = c17459;
                    str34 = str34;
                    str28 = str22;
                    str35 = str35;
                    short[] sArr3111 = sArr20;
                    str31 = str23;
                    c11109 = c11109;
                    c06934 = c0696;
                    sArr20 = sArr3111;
                    break;
                case 627321284:
                case 1252512577:
                    i58 = i58;
                    sArr29 = sArr29;
                    String strM6106 = C1875.m6105(sArr32, i61, i60, i59);
                    iM450212 = C19806.m45029(C1460.m5047(f38316, 45, 3, i59)) ^ 2129695907;
                    sArr18 = f38316;
                    i49 = 48;
                    int iM113027 = (ThreadFactoryC3888.m11306("ܺۙ") ^ i42) * 77;
                    int i83 = ((iM113027 ^ i41) * 30177) ^ (-574233813);
                    str34 = strM6106;
                    str35 = str35;
                    i36 = iM113027 ^ (-680247592);
                    sArr16 = sArr28;
                    c4885 = c4885;
                    str28 = str28;
                    c06931 = c06931;
                    c12522 = c12522;
                    c06933 = c06933;
                    c146310 = c146310;
                    str32 = str32;
                    c06935 = c06935;
                    c17459 = c17459;
                    str36 = str36;
                    sArr30 = sArr30;
                    c06932 = c06932;
                    str30 = str30;
                    c9699 = c9699;
                    str7 = str31;
                    c06923 = c06923;
                    str26 = str26;
                    c1937 = c1937;
                    strM6918 = strM6918;
                    c06929 = c06929;
                    sArr19 = sArr19;
                    sArr22 = sArr22;
                    sArr24 = sArr24;
                    iM11309 = iM11309;
                    iM113010 = iM113010;
                    i50 = i50;
                    i51 = i51;
                    i52 = i52;
                    i53 = i53;
                    i55 = i55;
                    i56 = i56;
                    iM450214 = iM450214;
                    c06930 = c06930;
                    i37 = i83;
                    sArr20 = sArr20;
                    c0696 = c06934;
                    c238011 = c238011;
                    c11109 = c11109;
                    c69911 = c69911;
                    sArr19 = sArr19;
                    C17458 c174515 = c17459;
                    c06919 = c06935;
                    c17458 = c174515;
                    c69911 = c69911;
                    c06923 = c06923;
                    str26 = str26;
                    c238011 = c238011;
                    c06930 = c06930;
                    str23 = str7;
                    str36 = str36;
                    str22 = str28;
                    c4884 = c4885;
                    c06925 = c06925;
                    c22524 = c22524;
                    strM4892 = strM4892;
                    c06927 = c06927;
                    c13351 = c13351;
                    strM7604 = strM7604;
                    c06928 = c06928;
                    c4176 = c4176;
                    str27 = str27;
                    sArr21 = sArr21;
                    sArr25 = sArr25;
                    sArr26 = sArr26;
                    sArr27 = sArr27;
                    i48 = i48;
                    iM450213 = iM450213;
                    i57 = i57;
                    i34 = i36;
                    i43 = i37;
                    sArr28 = sArr16;
                    C0690 c069416 = c06919;
                    c17459 = c17458;
                    c06935 = c069416;
                    sArr22 = sArr22;
                    i51 = i51;
                    i53 = i53;
                    i50 = i50;
                    i52 = i52;
                    iM11309 = iM11309;
                    iM113010 = iM113010;
                    c06931 = c06931;
                    sArr24 = sArr24;
                    i55 = i55;
                    i56 = i56;
                    c1937 = c1937;
                    strM6918 = strM6918;
                    iM450214 = iM450214;
                    c06929 = c06929;
                    c69911 = c69911;
                    c06923 = c06923;
                    sArr25 = sArr25;
                    sArr26 = sArr26;
                    str26 = str26;
                    c238011 = c238011;
                    sArr21 = sArr21;
                    sArr27 = sArr27;
                    c06927 = c06927;
                    c13351 = c13351;
                    i57 = i57;
                    strM7604 = strM7604;
                    iM450213 = iM450213;
                    c06928 = c06928;
                    c4176 = c4176;
                    str27 = str27;
                    i48 = i48;
                    c06925 = c06925;
                    c22524 = c22524;
                    strM4892 = strM4892;
                    i44 = i34;
                    c9699 = c9699;
                    c06933 = c06933;
                    c06932 = c06932;
                    c06935 = c06935;
                    str30 = str30;
                    i58 = i58;
                    sArr29 = sArr29;
                    str32 = str32;
                    c12522 = c12522;
                    c4885 = c4884;
                    c146310 = c146310;
                    sArr30 = sArr30;
                    c17459 = c17459;
                    str34 = str34;
                    str28 = str22;
                    str35 = str35;
                    short[] sArr3112 = sArr20;
                    str31 = str23;
                    c11109 = c11109;
                    c06934 = c0696;
                    sArr20 = sArr3112;
                    break;
                case 746080164:
                case 869620908:
                    i58 = i58;
                    sArr29 = sArr29;
                    m28445(str35, i45 ^ 2127592571, c06936, C2642.m8172(f38316, 116, 18, i59), c11109);
                    c06923 = C0690.f2880;
                    if (!C0817.f3443) {
                        str35 = str35;
                        c0690 = c06933;
                        c14637 = c146310;
                        str = str32;
                        c06935 = c06935;
                        c17459 = c17459;
                        str36 = str36;
                        sArr30 = sArr30;
                        c06932 = c06932;
                        str30 = str30;
                        c9698 = c9699;
                        str2 = str31;
                        sArr = sArr22;
                        iM11309 = iM11309;
                        i50 = i50;
                        i51 = i51;
                        i52 = i52;
                        i53 = i53;
                        sArr20 = sArr20;
                        c0691 = c06934;
                        c11109 = c11109;
                        i = iM113010;
                        int iM450226 = (i41 - C19806.m45029("۬ۖ")) * (-79);
                        int i710 = i;
                        i5 = ((iM450226 ^ i42) * (-4243)) ^ (-585675531);
                        i6 = iM450226 ^ 1522901975;
                        c238011 = null;
                        sArr22 = sArr;
                        iM113010 = i710;
                        c0693 = c0690;
                        c146310 = c14637;
                        strM7604 = strM7604;
                        iM450213 = iM450213;
                        str6 = strM7604;
                        i8 = iM450213;
                        sArr24 = sArr24;
                        i55 = i55;
                        i56 = i56;
                        strM6918 = strM6918;
                        iM450214 = iM450214;
                        c0695 = c06926;
                        str32 = str;
                        c06933 = c0693;
                        sArr21 = sArr21;
                        i7 = i6;
                        i43 = i5;
                        c1355 = c1355;
                        strM940 = strM940;
                        c12522 = c12522;
                        c06930 = c0694;
                        i49 = i49;
                        i51 = i51;
                        i53 = i53;
                        i50 = i50;
                        c11109 = c11109;
                        i52 = i52;
                        i58 = i58;
                        iM11309 = iM11309;
                        iM113011 = iM113011;
                        sArr18 = sArr18;
                        iM450212 = iM450212;
                        c06931 = c06931;
                        c06926 = c0695;
                        sArr19 = sArr3;
                        str28 = str4;
                        c06929 = c06929;
                        c69911 = c69911;
                        sArr25 = sArr25;
                        c4885 = c4882;
                        sArr26 = sArr26;
                        str26 = str5;
                        sArr27 = sArr27;
                        c06927 = c06927;
                        c13351 = c13351;
                        i57 = i57;
                        strM7604 = str6;
                        iM450213 = i8;
                        c06928 = c06928;
                        c4176 = c4176;
                        str27 = str27;
                        i48 = i48;
                        c06925 = c06925;
                        c22524 = c22524;
                        strM4892 = strM4892;
                        i44 = i7;
                        c9699 = c9698;
                        c06932 = c06932;
                        c06935 = c06935;
                        str30 = str30;
                        c06934 = c0691;
                        sArr20 = sArr20;
                        sArr29 = sArr29;
                        str35 = str35;
                        str32 = str32;
                        c146310 = c146310;
                        sArr30 = sArr30;
                        str31 = str2;
                        c17459 = c17459;
                        str36 = str36;
                        str34 = str34;
                    } else {
                        c238011 = new C23809();
                        String strM3747 = C0962.m3747(f38316, 134, 2, i59);
                        int iM450227 = C19806.m45029(C2477.m7604(f38316, 136, 3, i59));
                        int iM450228 = C19806.m45029("۠ۖ") ^ i41;
                        str26 = strM3747;
                        i46 = iM450227;
                        i43 = ((iM450228 ^ i42) * 21315) ^ (-1649835086);
                        i44 = iM450228 ^ (-731774474);
                        i47 = 2123139500;
                        i2 = iM113011;
                        C12520 c12528 = c12522;
                        sArr2 = sArr32;
                        c0692 = c06938;
                        i3 = i61;
                        c15467 = c15468;
                        i4 = i60;
                        str3 = str29;
                        c12520 = c12528;
                        iM113011 = i2;
                        sArr22 = sArr22;
                        i51 = i51;
                        i53 = i53;
                        i50 = i50;
                        c11109 = c11109;
                        i52 = i52;
                        iM11309 = iM11309;
                        iM113010 = iM113010;
                        c06933 = c06933;
                        c9699 = c9699;
                        c06932 = c06932;
                        c06935 = c06935;
                        str30 = str30;
                        c06934 = c06934;
                        sArr20 = sArr20;
                        i58 = i58;
                        sArr29 = sArr29;
                        str32 = str32;
                        c146310 = c146310;
                        sArr30 = sArr30;
                        str31 = str31;
                        str35 = str35;
                        c17459 = c17459;
                        str36 = str36;
                        int i711 = i3;
                        c06938 = c0692;
                        sArr32 = sArr2;
                        c12522 = c12520;
                        str29 = str3;
                        i60 = i4;
                        c15468 = c15467;
                        i61 = i711;
                    }
                    break;
                case 1428331637:
                case 1803750973:
                    m28445(str33, ThreadFactoryC3888.m11306(C0671.m3009(sArr29, i58, 3, i59)) ^ 2126190809, c06937, C1460.m5047(f38316, HideBottomViewOnScrollBehavior.DEFAULT_ENTER_ANIMATION_DURATION_MS, 17, i59), c5588);
                    c06925 = C0690.f2919;
                    c22524 = new C22522();
                    strM4892 = C1398.m4892(f38316, 242, 2, i59);
                    strM5070 = C1461.m5070(f38316, 244, 3, i59);
                    int iM450229 = C19806.m45029("ᩳ۬") ^ i42;
                    i44 = iM450229 ^ (-563368670);
                    i43 = ((iM450229 ^ i41) * (-22453)) ^ 332928340;
                    i58 = i58;
                    sArr29 = sArr29;
                    break;
                default:
                    str35 = str35;
                    i58 = i58;
                    sArr29 = sArr29;
                    c4882 = c4885;
                    str4 = str28;
                    c06931 = c06931;
                    c12522 = c12522;
                    str34 = str34;
                    c0693 = c06933;
                    c146310 = c146310;
                    String str58 = str32;
                    c06935 = c06935;
                    c17459 = c17459;
                    str36 = str36;
                    sArr30 = sArr30;
                    c06932 = c06932;
                    str30 = str30;
                    c9698 = c9699;
                    str2 = str31;
                    C0690 c06966 = c06923;
                    str5 = str26;
                    C1935 c1939 = c1937;
                    c06927 = c06927;
                    c13351 = c13351;
                    str6 = strM7604;
                    c06929 = c06929;
                    c69911 = c69911;
                    sArr18 = sArr18;
                    sArr3 = sArr19;
                    sArr21 = sArr21;
                    short[] sArr53 = sArr22;
                    sArr25 = sArr25;
                    sArr26 = sArr26;
                    iM450212 = iM450212;
                    iM11309 = iM11309;
                    int i84 = iM113010;
                    i8 = iM450213;
                    i49 = i49;
                    i50 = i50;
                    i51 = i51;
                    i52 = i52;
                    i53 = i53;
                    iM113011 = iM113011;
                    c0694 = c06930;
                    C23809 c238012 = c238011;
                    sArr20 = sArr20;
                    c0691 = c06934;
                    c11109 = c11109;
                    c0695 = c06926;
                    short[] sArr54 = sArr23;
                    int i85 = i54;
                    strM6918 = C2249.m6918(sArr54, i85, 2, i59);
                    iM450214 = C19806.m45029(C3660.m10790(f38316, 180, 3, i59)) ^ 2127943721;
                    sArr24 = f38316;
                    i55 = 183;
                    i56 = 16;
                    int iM113028 = (ThreadFactoryC3888.m11306("ۡܶ") + i42) * (-119);
                    i5 = ((iM113028 ^ i41) * 6015) ^ (-1717546500);
                    i6 = iM113028 ^ 383959418;
                    sArr22 = sArr53;
                    iM113010 = i84;
                    str = str58;
                    sArr23 = sArr54;
                    i54 = i85;
                    c1937 = c1939;
                    c06923 = c06966;
                    c238011 = c238012;
                    str32 = str;
                    c06933 = c0693;
                    sArr21 = sArr21;
                    i7 = i6;
                    i43 = i5;
                    c1355 = c1355;
                    strM940 = strM940;
                    c12522 = c12522;
                    c06930 = c0694;
                    i49 = i49;
                    i51 = i51;
                    i53 = i53;
                    i50 = i50;
                    c11109 = c11109;
                    i52 = i52;
                    i58 = i58;
                    iM11309 = iM11309;
                    iM113011 = iM113011;
                    sArr18 = sArr18;
                    iM450212 = iM450212;
                    c06931 = c06931;
                    c06926 = c0695;
                    sArr19 = sArr3;
                    str28 = str4;
                    c06929 = c06929;
                    c69911 = c69911;
                    sArr25 = sArr25;
                    c4885 = c4882;
                    sArr26 = sArr26;
                    str26 = str5;
                    sArr27 = sArr27;
                    c06927 = c06927;
                    c13351 = c13351;
                    i57 = i57;
                    strM7604 = str6;
                    iM450213 = i8;
                    c06928 = c06928;
                    c4176 = c4176;
                    str27 = str27;
                    i48 = i48;
                    c06925 = c06925;
                    c22524 = c22524;
                    strM4892 = strM4892;
                    i44 = i7;
                    c9699 = c9698;
                    c06932 = c06932;
                    c06935 = c06935;
                    str30 = str30;
                    c06934 = c0691;
                    sArr20 = sArr20;
                    sArr29 = sArr29;
                    str35 = str35;
                    str32 = str32;
                    c146310 = c146310;
                    sArr30 = sArr30;
                    str31 = str2;
                    c17459 = c17459;
                    str36 = str36;
                    str34 = str34;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0139 A[PHI: r13 r14 r15
      0x0139: PHI (r13v4 short[]) = (r13v3 short[]), (r13v2 short[]), (r13v2 short[]) binds: [B:36:0x0137, B:14:0x008c, B:11:0x0081] A[DONT_GENERATE, DONT_INLINE]
      0x0139: PHI (r14v4 int) = (r14v3 int), (r14v2 int), (r14v2 int) binds: [B:36:0x0137, B:14:0x008c, B:11:0x0081] A[DONT_GENERATE, DONT_INLINE]
      0x0139: PHI (r15v4 int) = (r15v3 int), (r15v2 int), (r15v2 int) binds: [B:36:0x0137, B:14:0x008c, B:11:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:79:0x0326 A[PHI: r4 r16
      0x0326: PHI (r4v4 java.util.HashSet) = (r4v2 java.util.HashSet), (r4v3 java.util.HashSet), (r4v2 java.util.HashSet) binds: [B:78:0x0324, B:44:0x0196, B:11:0x0081] A[DONT_GENERATE, DONT_INLINE]
      0x0326: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:78:0x0324, B:44:0x0196, B:11:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:83:0x0354 A[PHI: r5 r7 r8 r9 r17
      0x0354: PHI (r5v6 l.ܿۧ᩺) = (r5v2 l.ܿۧ᩺), (r5v2 l.ܿۧ᩺), (r5v2 l.ܿۧ᩺), (r5v3 l.ܿۧ᩺), (r5v2 l.ܿۧ᩺), (r5v2 l.ܿۧ᩺), (r5v2 l.ܿۧ᩺) binds: [B:114:0x0354, B:82:0x0352, B:74:0x0309, B:40:0x0171, B:28:0x00f4, B:14:0x008c, B:5:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x0354: PHI (r7v6 java.lang.String) = 
      (r7v2 java.lang.String)
      (r7v2 java.lang.String)
      (r7v2 java.lang.String)
      (r7v2 java.lang.String)
      (r7v3 java.lang.String)
      (r7v2 java.lang.String)
      (r7v2 java.lang.String)
     binds: [B:114:0x0354, B:82:0x0352, B:74:0x0309, B:40:0x0171, B:28:0x00f4, B:14:0x008c, B:5:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x0354: PHI (r8v6 short[]) = (r8v2 short[]), (r8v2 short[]), (r8v2 short[]), (r8v2 short[]), (r8v3 short[]), (r8v2 short[]), (r8v2 short[]) binds: [B:114:0x0354, B:82:0x0352, B:74:0x0309, B:40:0x0171, B:28:0x00f4, B:14:0x008c, B:5:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x0354: PHI (r9v6 int) = (r9v2 int), (r9v2 int), (r9v2 int), (r9v2 int), (r9v3 int), (r9v2 int), (r9v2 int) binds: [B:114:0x0354, B:82:0x0352, B:74:0x0309, B:40:0x0171, B:28:0x00f4, B:14:0x008c, B:5:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x0354: PHI (r17v11 short) = (r17v2 short), (r17v2 short), (r17v3 short), (r17v2 short), (r17v2 short), (r17v2 short), (r17v2 short) binds: [B:114:0x0354, B:82:0x0352, B:74:0x0309, B:40:0x0171, B:28:0x00f4, B:14:0x008c, B:5:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28444(int i, boolean[] zArr, ArrayList arrayList) {
        int iM11306;
        int i2;
        int i3;
        int iM11307;
        int i4;
        short s;
        int i5 = i;
        int i6 = RunnableC3388.f12514;
        int i7 = RunnableC0195.f1321;
        int iM11308 = ThreadFactoryC3888.m11306("ܺۘ") ^ i6;
        int i8 = ((iM11308 ^ i7) * (-15979)) ^ (-758488189);
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i9 = iM11308 ^ (-617596728);
        HashSet hashSet = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        short s2 = 0;
        int i15 = 0;
        int i16 = -2095383105;
        int i17 = 0;
        String strM18456 = null;
        String strM3009 = null;
        InterfaceC17314 interfaceC17314M5517 = null;
        HashSet hashSet2 = null;
        int i18 = 0;
        while (true) {
            i16 = i9 ^ (i8 & (((i16 ^ i7) * (-9193)) >> 31));
            switch (i16) {
                case -1967475703:
                case 1128985006:
                    C2249.m6906(C1398.m4894(interfaceC17314M5517, C1025.m3859(sArr3, i10, i11, i12), strM18456));
                    m28442();
                    break;
                case -1960819898:
                case -405512954:
                    C19806.m45024();
                    break;
                case -1931949527:
                case 1495960754:
                    sArr2 = f38316;
                    i13 = MLKEMEngine.KyberPolyBytes;
                    i14 = 1;
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM11307 = (ThreadFactoryC3888.m11306("ܶ۠") + i6) * 37;
                        i8 = ((iM11307 ^ i7) * 4291) ^ 766241150;
                        i4 = 1566906783;
                    } else {
                        iM11307 = (ThreadFactoryC3888.m11306("᩶ۢ") ^ i6) * (-55);
                        i8 = ((iM11307 ^ i7) * (-653)) ^ 199003034;
                        i4 = 1844742092;
                    }
                    i9 = iM11307 ^ i4;
                    i5 = i;
                    break;
                case -1735294274:
                case 1056773852:
                    hashSet2 = f38311;
                    hashSet2.clear();
                    hashSet2.addAll(hashSet);
                    if (C3743.f13569) {
                        iM11307 = ThreadFactoryC3888.m11306("᩸᩹") ^ i7;
                        i8 = ((iM11307 ^ i6) * 29205) ^ (-114216672);
                        i4 = -39781176;
                    } else {
                        iM11307 = C19806.m45029("۠۫") ^ i6;
                        i8 = ((iM11307 ^ i7) * 17635) ^ (-602940846);
                        i4 = 740852493;
                    }
                    i9 = iM11307 ^ i4;
                    i5 = i;
                    break;
                case -1653969855:
                case 1411214126:
                    if (zArr[i5]) {
                        iM11306 = (i6 - C19806.m45029("ۡ᩹")) * (-91);
                        i2 = ((iM11306 ^ i7) * 4125) ^ (-1383919374);
                        i3 = 1299105085;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩴ۬") + i6) * (-85);
                        i2 = ((iM11306 ^ i7) * 29669) ^ 219949634;
                        i3 = -1063089723;
                    }
                    i9 = iM11306 ^ i3;
                    i8 = i2;
                    break;
                case -1612201041:
                case -1339050957:
                    i11 = 12;
                    if (C2124.f7782 > 0) {
                        iM11307 = (C19806.m45029("ۤᩴ") ^ i7) * 45;
                        i8 = ((iM11307 ^ i6) * (-15929)) ^ 1980991727;
                        i4 = -1891809175;
                        i9 = iM11307 ^ i4;
                        i5 = i;
                    }
                    s = s2;
                    int iM45029 = (C19806.m45029("֫۬") ^ i7) * (-105);
                    i9 = iM45029 ^ (-637216832);
                    s2 = s;
                    i8 = ((iM45029 ^ i6) * 11655) ^ 156889006;
                    i5 = i;
                    break;
                case -1581271307:
                case 1227447655:
                    if (i15 - (i17 + 144841225) > 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩹ۨ") ^ i6;
                        i2 = ((iM11306 ^ i7) * (-21121)) ^ (-1703590083);
                        i3 = 1257664920;
                    } else {
                        iM11306 = C19806.m45029("᩵֫") ^ i7;
                        i2 = ((iM11306 ^ i6) * 18975) ^ (-549798630);
                        i3 = 1329534951;
                    }
                    i9 = iM11306 ^ i3;
                    i8 = i2;
                    break;
                case -1504044438:
                case 116010667:
                    i18++;
                    iM11306 = C19806.m45029("ۖ᩻") ^ i6;
                    i2 = ((iM11306 ^ i7) * (-7705)) ^ 282773949;
                    i3 = 1491249539;
                    i9 = iM11306 ^ i3;
                    i8 = i2;
                    break;
                case -1435832803:
                case -204941773:
                    hashSet = new HashSet();
                    i18 = 0;
                    iM11306 = C19806.m45029("ۖ᩻") ^ i6;
                    i2 = ((iM11306 ^ i7) * (-7705)) ^ 282773949;
                    i3 = 1491249539;
                    i9 = iM11306 ^ i3;
                    i8 = i2;
                    break;
                case -1305956679:
                case -981414594:
                    C1977.m6356();
                    if (C1977.m6356()) {
                        iM11307 = (ThreadFactoryC3888.m11306("ܶ۠") + i6) * 37;
                        i8 = ((iM11307 ^ i7) * 4291) ^ 766241150;
                        i4 = 1566906783;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("ۜ᩸") ^ i7;
                        i8 = ((iM11307 ^ i6) * (-26555)) ^ (-1140214032);
                        i4 = 1140941897;
                    }
                    i9 = iM11307 ^ i4;
                    i5 = i;
                    break;
                case -1215150768:
                case 1086211940:
                    C1148.m4232();
                    if (C3286.f12186) {
                        iM11307 = C19806.m45029("۠۫") ^ i6;
                        i8 = ((iM11307 ^ i7) * 17635) ^ (-602940846);
                        i4 = 740852493;
                    } else {
                        iM11307 = (ThreadFactoryC3888.m11306("ܶ۠") + i6) * 37;
                        i8 = ((iM11307 ^ i7) * 4291) ^ 766241150;
                        i4 = 1566906783;
                    }
                    i9 = iM11307 ^ i4;
                    i5 = i;
                    break;
                case -1091354394:
                case 1797280621:
                    s = s2;
                    int i19 = s * 24070;
                    i17 = s * s;
                    if (C0671.m3008() >= 0) {
                        i15 = i19;
                        int iM450210 = (C19806.m45029("֫۬") ^ i7) * (-105);
                        i9 = iM450210 ^ (-637216832);
                        s2 = s;
                        i8 = ((iM450210 ^ i6) * 11655) ^ 156889006;
                        i5 = i;
                    } else {
                        int iM450211 = (i6 - C19806.m45029("ᩳۗ")) * (-5);
                        s2 = s;
                        i8 = ((iM450211 ^ i7) * 13575) ^ (-917792108);
                        i9 = iM450211 ^ (-1558040450);
                        i5 = i;
                        i15 = i19;
                    }
                    break;
                case -1047411947:
                case 1625030055:
                    strM3009 = C0671.m3009(sArr2, i13, i14, i12);
                    if (!C0962.f3784) {
                        iM11307 = ThreadFactoryC3888.m11306("᩵ۚ") ^ i6;
                        i8 = ((iM11307 ^ i7) * (-6761)) ^ 1118578995;
                        i4 = 1432224927;
                        i9 = iM11307 ^ i4;
                        i5 = i;
                    }
                    s = s2;
                    int iM450212 = (C19806.m45029("֫۬") ^ i7) * (-105);
                    i9 = iM450212 ^ (-637216832);
                    s2 = s;
                    i8 = ((iM450212 ^ i6) * 11655) ^ 156889006;
                    i5 = i;
                    break;
                case -958220711:
                case 1052327035:
                    if (i18 < i5) {
                        iM11306 = (ThreadFactoryC3888.m11306("֫ۜ") ^ i6) * 5;
                        i2 = ((iM11306 ^ i7) * (-2761)) ^ 570974263;
                        i3 = 608143842;
                    } else {
                        iM11306 = (i7 - ThreadFactoryC3888.m11306("ۙܰ")) * (-39);
                        i2 = ((iM11306 ^ i6) * (-20573)) ^ 802296646;
                        i3 = 1586537298;
                    }
                    i9 = iM11306 ^ i3;
                    i8 = i2;
                    break;
                case -883044827:
                case 1842322809:
                    strM18456 = C6851.m18456(hashSet2, strM3009);
                    sArr3 = f38316;
                    i10 = 385;
                    if (C2477.m7593() >= 0) {
                        iM11307 = ThreadFactoryC3888.m11306("ۜ᩸") ^ i7;
                        i8 = ((iM11307 ^ i6) * (-26555)) ^ (-1140214032);
                        i4 = 1140941897;
                    } else {
                        iM11307 = C19806.m45029("ۤۤ") ^ i7;
                        i8 = ((iM11307 ^ i6) * (-24393)) ^ (-630829656);
                        i4 = 335199968;
                    }
                    i9 = iM11307 ^ i4;
                    i5 = i;
                    break;
                case -722093144:
                case 209911944:
                    i12 = 11677;
                    iM11306 = (i7 - C19806.m45029("ܺܶ")) * (-87);
                    i2 = ((iM11306 ^ i6) * 27605) ^ 1078179326;
                    i3 = -121089742;
                    i9 = iM11306 ^ i3;
                    i8 = i2;
                    break;
                case -680244137:
                case 394259326:
                    if (C0216.m1591() <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۢܳ") + i7) * 5;
                        i2 = ((iM11306 ^ i6) * (-31003)) ^ (-1176313693);
                        i3 = 1938766096;
                        i9 = iM11306 ^ i3;
                        i8 = i2;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("ۜ᩸") ^ i7;
                        i8 = ((iM11307 ^ i6) * (-26555)) ^ (-1140214032);
                        i4 = 1140941897;
                        i9 = iM11307 ^ i4;
                        i5 = i;
                    }
                    break;
                case -541441843:
                case -526561019:
                    sArr = f38316;
                    if (C1977.f7413 <= 0) {
                        iM11307 = C19806.m45029("۠۫") ^ i6;
                        i8 = ((iM11307 ^ i7) * 17635) ^ (-602940846);
                        i4 = 740852493;
                    } else {
                        iM11307 = C19806.m45029("᩶֨") ^ i7;
                        i8 = ((iM11307 ^ i6) * 18639) ^ 1826633878;
                        i4 = -606280088;
                    }
                    i9 = iM11307 ^ i4;
                    i5 = i;
                    break;
                case -328723733:
                case 1785598437:
                    C1875.m6103(hashSet, ((C13476) C3286.m9796(arrayList, i18)).f44543);
                    iM11307 = ThreadFactoryC3888.m11306("ᩳۘ") ^ i6;
                    i8 = ((iM11307 ^ i7) * 27147) ^ (-252310014);
                    i4 = -1729501743;
                    i9 = iM11307 ^ i4;
                    i5 = i;
                    break;
                case -320210846:
                case 1383671934:
                    i12 = 8472;
                    iM11306 = (i7 - C19806.m45029("ܺܶ")) * (-87);
                    i2 = ((iM11306 ^ i6) * 27605) ^ 1078179326;
                    i3 = -121089742;
                    i9 = iM11306 ^ i3;
                    i8 = i2;
                    break;
                case -182163408:
                case 1160785833:
                    if (C0216.m1591() <= 0) {
                        iM11307 = ThreadFactoryC3888.m11306("ۜ᩸") ^ i7;
                        i8 = ((iM11307 ^ i6) * (-26555)) ^ (-1140214032);
                        i4 = 1140941897;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("ۢ᩶") ^ i6;
                        i8 = ((iM11307 ^ i7) * (-29459)) ^ 1595402768;
                        i4 = 1102732966;
                    }
                    i9 = iM11307 ^ i4;
                    i5 = i;
                    break;
                case -53294896:
                case 842983940:
                    if (zArr[i18]) {
                        iM11307 = ThreadFactoryC3888.m11306("ᩳۘ") ^ i6;
                        i8 = ((iM11307 ^ i7) * 27147) ^ (-252310014);
                        i4 = -1729501743;
                    } else {
                        iM11307 = (i7 - ThreadFactoryC3888.m11306("ۙ۬")) * 3;
                        i8 = ((iM11307 ^ i6) * (-29597)) ^ (-783070925);
                        i4 = 118940555;
                    }
                    i9 = iM11307 ^ i4;
                    i5 = i;
                    break;
                case 706179531:
                case 1584817562:
                    interfaceC17314M5517 = CallableC1627.m5517(ApplicationC0716.f2992);
                    if (C2477.m7593() >= 0) {
                        iM11307 = ThreadFactoryC3888.m11306("ۜ᩸") ^ i7;
                        i8 = ((iM11307 ^ i6) * (-26555)) ^ (-1140214032);
                        i4 = 1140941897;
                    } else {
                        iM11307 = (i7 - C19806.m45029("᩷ۛ")) * (-31);
                        i8 = ((iM11307 ^ i6) * (-14409)) ^ 1833044075;
                        i4 = 1884665245;
                    }
                    i9 = iM11307 ^ i4;
                    i5 = i;
                    break;
                case 745601821:
                case 2013923785:
                    s2 = sArr[383];
                    if (C0962.f3784) {
                        iM11307 = ThreadFactoryC3888.m11306("ۜ᩸") ^ i7;
                        i8 = ((iM11307 ^ i6) * (-26555)) ^ (-1140214032);
                        i4 = 1140941897;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("ܽۧ") ^ i7;
                        i8 = ((iM11307 ^ i6) * (-19219)) ^ 476119589;
                        i4 = 489058815;
                    }
                    i9 = iM11307 ^ i4;
                    i5 = i;
                    break;
                case 966256092:
                case 1212133112:
                    C0671.m3018(hashSet, C1668.m5577(f38316, 397, 2, i12));
                    i5 = i;
                    iM11306 = (i6 - C19806.m45029("ۡ᩹")) * (-91);
                    i2 = ((iM11306 ^ i7) * 4125) ^ (-1383919374);
                    i3 = 1299105085;
                    i9 = iM11306 ^ i3;
                    i8 = i2;
                    break;
                default:
                    C3660.m10791();
                    iM11307 = ThreadFactoryC3888.m11306("ۜ᩸") ^ i7;
                    i8 = ((iM11307 ^ i6) * (-26555)) ^ (-1140214032);
                    i4 = 1140941897;
                    i9 = iM11307 ^ i4;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28445(String str, int i, C0690 c0690, String str2, InterfaceC17295 interfaceC17295) {
        int i2 = 1150650166;
        int i3 = C1977.f7413;
        int i4 = AbstractC0464.f2088;
        int iM11306 = ThreadFactoryC3888.m11306("֡ܿ") ^ i4;
        int i5 = ((iM11306 ^ i3) * 5849) ^ (-998702251);
        int i6 = 526626458;
        while (true) {
            i2 = ((((i2 ^ i3) * 32317) >> 31) & i5) ^ (iM11306 ^ i6);
            switch (i2) {
                case -1857619985:
                case 1786954278:
                    if (C3286.f12186) {
                        iM11306 = (i4 - C19806.m45029("ۢۧ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i5 = ((iM11306 ^ i3) * (-27245)) ^ 1209941247;
                        i6 = 913373805;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩺ܳ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-28235)) ^ 1359218590;
                        i6 = 1845610184;
                    }
                    break;
                case -1741071991:
                case 1007116469:
                    if (C0050.f912 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩷᩵") + i4) * 99;
                        i5 = ((iM11306 ^ i3) * 19609) ^ (-25890602);
                        i6 = 938913477;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩸ܶ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-13199)) ^ 853212653;
                        i6 = 1140007295;
                    }
                    break;
                case -1492002569:
                case 300857866:
                    if (C2871.f10837 >= 0) {
                        iM11306 = (i4 - C19806.m45029("ۢۧ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i5 = ((iM11306 ^ i3) * (-27245)) ^ 1209941247;
                        i6 = 913373805;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۖ۟") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-24217)) ^ 1153679881;
                        i6 = 928334962;
                    }
                    break;
                case -1345830789:
                case -717828862:
                    if (C2704.m8255() <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩷᩵") + i4) * 99;
                        i5 = ((iM11306 ^ i3) * 19609) ^ (-25890602);
                        i6 = 938913477;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩵֫") ^ i4;
                        i5 = ((iM11306 ^ i3) * 21661) ^ 1061213423;
                        i6 = -1597905070;
                    }
                    break;
                case -1204652056:
                case 1966342563:
                    if (C0278.f1572 <= 0) {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("᩷ܿ")) * (-101);
                        i5 = ((iM11306 ^ i3) * (-8453)) ^ 760687224;
                        i6 = 152229646;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۖܶ") ^ i4) * 59;
                        i5 = ((iM11306 ^ i3) * 5721) ^ 1494248392;
                        i6 = -1952962401;
                    }
                    break;
                case -1140218480:
                case 1699742527:
                    f38313.put(str, new C13476(str, i, c0690, str2, interfaceC17295));
                    break;
                case -1114284476:
                case 1401730215:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۤܺ") ^ i3) * 73;
                        i5 = ((iM11306 ^ i4) * (-1879)) ^ (-1264889619);
                        i6 = 884231581;
                    } else {
                        iM11306 = (i4 - C19806.m45029("ۨ۫")) * (-7);
                        i5 = ((iM11306 ^ i3) * 32393) ^ 271044293;
                        i6 = -807440902;
                    }
                    break;
                case -952775134:
                case 1985101023:
                    if (C3743.m10966() <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩷᩵") + i4) * 99;
                        i5 = ((iM11306 ^ i3) * 19609) ^ (-25890602);
                        i6 = 938913477;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۢۜ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-30625)) ^ 2012582780;
                        i6 = -1066753877;
                    }
                    break;
                case -232591475:
                case -123704925:
                    if (C1189.m4368() <= 0) {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("᩷ܿ")) * (-101);
                        i5 = ((iM11306 ^ i3) * (-8453)) ^ 760687224;
                        i6 = 152229646;
                    } else {
                        iM11306 = C19806.m45029("ۗۡ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-13503)) ^ (-463417280);
                        i6 = -1018974079;
                    }
                    break;
                case -30766689:
                case 1472982527:
                    C0278.m1789();
                    break;
                case 13095611:
                case 1519150334:
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۤܺ") ^ i3) * 73;
                        i5 = ((iM11306 ^ i4) * (-1879)) ^ (-1264889619);
                        i6 = 884231581;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۙ᩸") ^ i3;
                        i5 = ((iM11306 ^ i4) * 12271) ^ 250039407;
                        i6 = 657552024;
                    }
                    break;
                case 411237674:
                case 616180751:
                    if (!C0817.f3443) {
                        iM11306 = ThreadFactoryC3888.m11306("ۢۜ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-30625)) ^ 2012582780;
                        i6 = -1066753877;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("᩷ܿ")) * (-101);
                        i5 = ((iM11306 ^ i3) * (-8453)) ^ 760687224;
                        i6 = 152229646;
                    }
                    break;
                case 462597606:
                case 1811544518:
                    if (C0671.m3008() >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩷᩵") + i4) * 99;
                        i5 = ((iM11306 ^ i3) * 19609) ^ (-25890602);
                        i6 = 938913477;
                    } else {
                        iM11306 = C19806.m45029("᩷۟") ^ i4;
                        i5 = ((iM11306 ^ i3) * 28673) ^ 1690665750;
                        i6 = 1234122341;
                    }
                    break;
                case 726045163:
                case 1192136072:
                    C0050.m946();
                    C0526.m2437();
                    iM11306 = (ThreadFactoryC3888.m11306("ۤܺ") ^ i3) * 73;
                    i5 = ((iM11306 ^ i4) * (-1879)) ^ (-1264889619);
                    i6 = 884231581;
                    break;
                case 989524675:
                case 1191291907:
                    if (C1668.f6641 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۢۜ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-30625)) ^ 2012582780;
                        i6 = -1066753877;
                    } else {
                        iM11306 = (C19806.m45029("᩵ۜ") ^ i3) * (-45);
                        i5 = ((iM11306 ^ i4) * (-25525)) ^ 905097961;
                        i6 = 692184253;
                    }
                    break;
                default:
                    C1148.m4232();
                    if (!C2704.f10408) {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("᩷ܿ")) * (-101);
                        i5 = ((iM11306 ^ i3) * (-8453)) ^ 760687224;
                        i6 = 152229646;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۤܺ") ^ i3) * 73;
                        i5 = ((iM11306 ^ i4) * (-1879)) ^ (-1264889619);
                        i6 = 884231581;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x01dc A[PHI: r1 r2 r10 r11
      0x01dc: PHI (r1v3 int) = (r1v2 int), (r1v2 int), (r1v2 int), (r1v2 int), (r1v2 int), (r1v4 int) binds: [B:53:0x018b, B:45:0x0136, B:37:0x00f5, B:33:0x00d9, B:11:0x0064, B:61:0x01da] A[DONT_GENERATE, DONT_INLINE]
      0x01dc: PHI (r2v4 l.ܰ᩷ۜ) = (r2v3 l.ܰ᩷ۜ), (r2v2 l.ܰ᩷ۜ), (r2v2 l.ܰ᩷ۜ), (r2v2 l.ܰ᩷ۜ), (r2v2 l.ܰ᩷ۜ), (r2v2 l.ܰ᩷ۜ) binds: [B:53:0x018b, B:45:0x0136, B:37:0x00f5, B:33:0x00d9, B:11:0x0064, B:61:0x01da] A[DONT_GENERATE, DONT_INLINE]
      0x01dc: PHI (r10v11 l.ۙ᩷ۜ) = (r10v10 l.ۙ᩷ۜ), (r10v10 l.ۙ᩷ۜ), (r10v10 l.ۙ᩷ۜ), (r10v10 l.ۙ᩷ۜ), (r10v10 l.ۙ᩷ۜ), (r10v12 l.ۙ᩷ۜ) binds: [B:53:0x018b, B:45:0x0136, B:37:0x00f5, B:33:0x00d9, B:11:0x0064, B:61:0x01da] A[DONT_GENERATE, DONT_INLINE]
      0x01dc: PHI (r11v7 l.ۗۜ᩺) = (r11v3 l.ۗۜ᩺), (r11v3 l.ۗۜ᩺), (r11v3 l.ۗۜ᩺), (r11v4 l.ۗۜ᩺), (r11v3 l.ۗۜ᩺), (r11v3 l.ۗۜ᩺) binds: [B:53:0x018b, B:45:0x0136, B:37:0x00f5, B:33:0x00d9, B:11:0x0064, B:61:0x01da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Illegal instructions before constructor call */
    public C11359(Main main, C12665 c12665) {
        int iM11306;
        int i;
        int i2 = 0;
        C14064 c14064 = null;
        C14600 c14600M35071 = null;
        C2059 c2059 = null;
        int i3 = 1739304143;
        int i4 = RunnableC3388.f12514;
        int i5 = C3660.f13403;
        short s = f38316[369];
        String strM6085 = C1875.m6085(ThreadFactoryC3888.m11306(C0526.m2424(f38316, 370, 3, ((s * s) + 117939600) - (s * 21720) >= 0 ? 3476 : 17325)) ^ 2098761178);
        super(main, strM6085, strM6085, c12665);
        int iM11307 = (ThreadFactoryC3888.m11306("ܺ᩷") + i5) * (-31);
        int i6 = ((iM11307 ^ i4) * 20163) ^ 975464905;
        int i7 = iM11307 ^ (-1401350320);
        C4890 c4890 = null;
        while (true) {
            C3078 c3078 = null;
            while (true) {
                i3 = ((((i3 ^ i4) * (-20783)) >> 31) & i6) ^ i7;
                switch (i3) {
                    case -2112824961:
                    case 1272007226:
                        f38312.m39052(main, c3078);
                        return;
                    case -1935745166:
                    case -40549851:
                        C3722.m10894();
                        if (C2642.f10294 <= 0) {
                            int iM11308 = ThreadFactoryC3888.m11306("᩶֡") ^ i5;
                            i6 = ((iM11308 ^ i4) * (-25547)) ^ (-1170051344);
                            i7 = iM11308 ^ (-520152788);
                            c4890 = null;
                        } else {
                            iM11306 = (ThreadFactoryC3888.m11306("᩶ۡ") ^ i4) * (-29);
                            i6 = ((iM11306 ^ i5) * 32351) ^ (-1263933251);
                            i = -174450393;
                            i7 = iM11306 ^ i;
                        }
                        break;
                    case -1336208330:
                    case -585311452:
                        RunnableC1895.m6170();
                        if (C3286.m9798() > 0) {
                            iM11306 = (ThreadFactoryC3888.m11306("ܳ۟") ^ i5) * 47;
                            i6 = ((iM11306 ^ i4) * (-23517)) ^ (-631623891);
                            i = 612619684;
                            i7 = iM11306 ^ i;
                        } else {
                            int iM11309 = ThreadFactoryC3888.m11306("᩶֡") ^ i5;
                            i6 = ((iM11309 ^ i4) * (-25547)) ^ (-1170051344);
                            i7 = iM11309 ^ (-520152788);
                            c4890 = null;
                        }
                        break;
                    case -1294577254:
                    case -556149637:
                        RunnableC1564.m5345();
                        if (C1875.m6086() == 0) {
                        }
                        iM11306 = (ThreadFactoryC3888.m11306("ܳ۟") ^ i5) * 47;
                        i6 = ((iM11306 ^ i4) * (-23517)) ^ (-631623891);
                        i = 612619684;
                        i7 = iM11306 ^ i;
                        break;
                    case -1131129372:
                    case 229815440:
                        i2 = 1;
                        if (C1460.m5050() == 0) {
                            c4890 = new C4890(i2);
                            if (RunnableC1606.f6488 >= 0) {
                                iM11306 = ThreadFactoryC3888.m11306("ۡܳ") ^ i5;
                                i6 = ((iM11306 ^ i4) * 32737) ^ (-1237516497);
                                i = 628665515;
                            } else {
                                iM11306 = C19806.m45029("ܰۘ") ^ i4;
                                i6 = ((iM11306 ^ i5) * (-24657)) ^ (-1976291634);
                                i = -572500847;
                            }
                            i7 = iM11306 ^ i;
                        } else {
                            int iM113010 = ThreadFactoryC3888.m11306("᩶֡") ^ i5;
                            i6 = ((iM113010 ^ i4) * (-25547)) ^ (-1170051344);
                            i7 = iM113010 ^ (-520152788);
                            c4890 = null;
                        }
                        break;
                    case -839298241:
                    case 949698313:
                        this.f38318 = c2059;
                        if (C1025.f4800 >= 0) {
                            iM11306 = ThreadFactoryC3888.m11306("ۡܳ") ^ i5;
                            i6 = ((iM11306 ^ i4) * 32737) ^ (-1237516497);
                            i = 628665515;
                        } else {
                            iM11306 = (i5 - C19806.m45029("᩻ᩳ")) * 91;
                            i6 = ((iM11306 ^ i4) * (-18681)) ^ (-1281426125);
                            i = -1059662100;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    case -589026633:
                    case 2001863044:
                        C2642.m8171();
                        iM11306 = (ThreadFactoryC3888.m11306("᩶ۡ") ^ i4) * (-29);
                        i6 = ((iM11306 ^ i5) * 32351) ^ (-1263933251);
                        i = -174450393;
                        i7 = iM11306 ^ i;
                        break;
                    case -442099025:
                    case 1785219347:
                        this.f38317 = c14600M35071;
                        if (C3743.f13569) {
                            iM11306 = C19806.m45029("֡ۤ") ^ i4;
                            i6 = ((iM11306 ^ i5) * 29193) ^ 474382335;
                            i = 2016654059;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("ۡܳ") ^ i5;
                            i6 = ((iM11306 ^ i4) * 32737) ^ (-1237516497);
                            i = 628665515;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    case -432802249:
                    case -99096225:
                        c2059 = new C2059(this);
                        if (C2871.f10837 < 0) {
                            iM11306 = (i5 - ThreadFactoryC3888.m11306("ۤ֨")) * (-77);
                            i6 = ((iM11306 ^ i4) * 15423) ^ (-2094080840);
                            i = 1484442948;
                            i7 = iM11306 ^ i;
                        } else {
                            int iM113011 = ThreadFactoryC3888.m11306("᩶֡") ^ i5;
                            i6 = ((iM113011 ^ i4) * (-25547)) ^ (-1170051344);
                            i7 = iM113011 ^ (-520152788);
                            c4890 = null;
                        }
                        break;
                    case -335014885:
                    case 1050343815:
                        C1668.m5583();
                        C0050.m946();
                        throw new RuntimeException();
                    case 69592659:
                    case 1677463208:
                        c14600M35071 = C14600.m35071(c14064);
                        if (C1668.f6641 < 0) {
                            iM11306 = (C19806.m45029("᩷ۛ") + i5) * 19;
                            i6 = ((iM11306 ^ i4) * (-31969)) ^ 56665658;
                            i = -1483750230;
                            i7 = iM11306 ^ i;
                        }
                        break;
                    case 148520645:
                    case 1053119120:
                        c14064 = new C14064(i2);
                        if (C0817.f3443) {
                            iM11306 = ThreadFactoryC3888.m11306("۟ۛ") ^ i4;
                            i6 = ((iM11306 ^ i5) * 10503) ^ 1146324251;
                            i = -1708798928;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("ۡܳ") ^ i5;
                            i6 = ((iM11306 ^ i4) * 32737) ^ (-1237516497);
                            i = 628665515;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    case 695093349:
                    case 883167532:
                        m28463();
                        if (C0526.m2437() < 0) {
                            c3078 = new C3078(2, this);
                            if (C1461.f5957 <= 0) {
                                iM11306 = ThreadFactoryC3888.m11306("ۡܳ") ^ i5;
                                i6 = ((iM11306 ^ i4) * 32737) ^ (-1237516497);
                                i = 628665515;
                            } else {
                                iM11306 = ThreadFactoryC3888.m11306("ܳۚ") ^ i4;
                                i6 = ((iM11306 ^ i5) * 1623) ^ (-1765867000);
                                i = 470863559;
                            }
                            i7 = iM11306 ^ i;
                        }
                        break;
                    default:
                        this.f38319 = C14600.m35071(c4890);
                        if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                            iM11306 = ThreadFactoryC3888.m11306("ۡܳ") ^ i5;
                            i6 = ((iM11306 ^ i4) * 32737) ^ (-1237516497);
                            i = 628665515;
                        } else {
                            iM11306 = (C19806.m45029("ᩴ۠") + i5) * 5;
                            i6 = ((iM11306 ^ i4) * 25311) ^ 1952905337;
                            i = -22220242;
                        }
                        i7 = iM11306 ^ i;
                        break;
                }
            }
            int iM113012 = (i4 - ThreadFactoryC3888.m11306("ۗ᩶")) * (-13);
            i6 = ((iM113012 ^ i5) * (-12261)) ^ 697038531;
            i7 = iM113012 ^ 618860260;
        }
    }

    /* JADX WARN: Code duplicated, block: B:66:0x02c4 A[PHI: r3 r7 r12 r16 r20 r25 r26
      0x02c4: PHI (r3v3 l.ܺ᩸) = (r3v2 l.ܺ᩸), (r3v2 l.ܺ᩸), (r3v7 l.ܺ᩸) binds: [B:65:0x02c2, B:18:0x00b9, B:6:0x007f] A[DONT_GENERATE, DONT_INLINE]
      0x02c4: PHI (r7v6 l.᩷᩸) = (r7v2 l.᩷᩸), (r7v5 l.᩷᩸), (r7v2 l.᩷᩸) binds: [B:65:0x02c2, B:18:0x00b9, B:6:0x007f] A[DONT_GENERATE, DONT_INLINE]
      0x02c4: PHI (r12v38 short[]) = (r12v24 short[]), (r12v32 short[]), (r12v41 short[]) binds: [B:65:0x02c2, B:18:0x00b9, B:6:0x007f] A[DONT_GENERATE, DONT_INLINE]
      0x02c4: PHI (r16v4 short) = (r16v3 short), (r16v2 short), (r16v2 short) binds: [B:65:0x02c2, B:18:0x00b9, B:6:0x007f] A[DONT_GENERATE, DONT_INLINE]
      0x02c4: PHI (r20v4 int) = (r20v3 int), (r20v2 int), (r20v2 int) binds: [B:65:0x02c2, B:18:0x00b9, B:6:0x007f] A[DONT_GENERATE, DONT_INLINE]
      0x02c4: PHI (r25v32 boolean) = (r25v18 boolean), (r25v26 boolean), (r25v37 boolean) binds: [B:65:0x02c2, B:18:0x00b9, B:6:0x007f] A[DONT_GENERATE, DONT_INLINE]
      0x02c4: PHI (r26v22 l.۫۬) = (r26v8 l.۫۬), (r26v17 l.۫۬), (r26v26 l.۫۬) binds: [B:65:0x02c2, B:18:0x00b9, B:6:0x007f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00ae, code lost:
    
        if (l.C2124.f7782 <= 0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b7, code lost:
    
        if (l.C0629.f2722 <= 0) goto L18;
     */
    @Override // l.AbstractViewOnClickListenerC6314, android.view.View.OnLongClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onLongClick(android.view.View r30) {
        /*
            Method dump skipped, instruction units count: 1052
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11359.onLongClick(android.view.View):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f8, code lost:
    
        if (l.C3286.f12186 == false) goto L14;
     */
    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m28463() {
        /*
            Method dump skipped, instruction units count: 1954
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11359.m28463():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:38:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:55:0x0274 A[PHI: r29 r30
      0x0274: PHI (r29v4 int) = (r29v2 int), (r29v1 int), (r29v1 int), (r29v1 int), (r29v1 int) binds: [B:54:0x0272, B:39:0x01f8, B:36:0x01df, B:32:0x01c1, B:338:0x0274] A[DONT_GENERATE, DONT_INLINE]
      0x0274: PHI (r30v3 java.lang.Object) = 
      (r30v2 java.lang.Object)
      (r30v1 java.lang.Object)
      (r30v1 java.lang.Object)
      (r30v1 java.lang.Object)
      (r30v1 java.lang.Object)
     binds: [B:54:0x0272, B:39:0x01f8, B:36:0x01df, B:32:0x01c1, B:338:0x0274] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m28446(String str, boolean z) {
        int iM45029;
        int i;
        int i2;
        int i3;
        int iM11306;
        int i4;
        int iM11307;
        int i5;
        int i6;
        C8411 c8411;
        int i7;
        ArrayList arrayList;
        int iM938;
        C8411 c8412;
        short[] sArr;
        ArrayList arrayList2;
        int i8;
        int i9;
        int i10;
        int iM11308;
        int i11;
        int i12;
        int i13;
        short[] sArr2;
        int i14;
        int i15;
        int i16;
        int iM450210;
        int i17;
        int i18;
        int iM11309;
        int i19;
        HashSet hashSet;
        boolean zRemove;
        int i20;
        int i21;
        short[] sArr3;
        int iM113010;
        int i22;
        int i23;
        ArrayList arrayList3;
        int i24;
        String str2;
        int i25;
        C8411 c8413;
        short[] sArr4;
        int i26;
        int i27;
        int i28;
        int i29;
        ArrayList arrayList4;
        String str3;
        int i30;
        int i31;
        int i32;
        int i33;
        HashSet hashSet2;
        String str4;
        InterfaceC17314 interfaceC17314M8257;
        String str5;
        int i34;
        C8411 c8414;
        int i35;
        ArrayList arrayList5;
        int i36;
        String str6;
        int i37;
        int i38;
        int i39;
        int iM113011;
        int i40;
        int i41;
        C8411 c8415;
        String str7;
        int i42;
        int i43;
        int iM450211;
        int i44;
        int i45;
        int i46;
        int iM113012;
        int i47;
        C11359 c11359 = this;
        Iterator itM9863 = null;
        int i48 = 0;
        Iterator itM9864 = null;
        int iM6682 = 0;
        int i49 = 0;
        Iterator itM10563 = null;
        int i50 = 0;
        Object objM9796 = null;
        short[] sArr5 = null;
        int i51 = -674107064;
        int i52 = ThreadFactoryC3888.f14547;
        int i53 = AbstractC0464.f2088;
        int iM450212 = (C19806.m45029("۬ۨ") ^ i53) * (-59);
        int i54 = ((iM450212 ^ i52) * 4373) ^ (-1376993828);
        int i55 = iM450212 ^ 822539655;
        ArrayList arrayList6 = null;
        InterfaceC17314 interfaceC17314 = null;
        String strM18456 = null;
        ArrayList arrayList7 = null;
        Main main = null;
        C8411 c8416 = null;
        ArrayList arrayList8 = null;
        String str8 = null;
        short[] sArr6 = null;
        short[] sArr7 = null;
        int i56 = 0;
        ArrayList arrayList9 = null;
        int iM939 = 0;
        int i57 = 0;
        int iM31486 = 0;
        boolean z2 = false;
        int i58 = 0;
        int iM4837 = 0;
        int i59 = 0;
        short s = 0;
        int i60 = 0;
        int i61 = 0;
        int i62 = 0;
        int i63 = 0;
        String str9 = null;
        ArrayList arrayList10 = null;
        int i64 = 0;
        HashSet hashSet3 = null;
        C12665 c12665 = null;
        int i65 = 0;
        while (true) {
            i51 = i55 ^ (i54 & (((i51 ^ i52) * 30705) >> 31));
            switch (i51) {
                case -2119913647:
                case -1801389775:
                    i48 = i48;
                    i59 = i59;
                    c8416 = c8416;
                    i57 = i57;
                    i49 = i49;
                    arrayList10 = arrayList10;
                    str8 = str8;
                    i64 = i64;
                    if (iM4837 <= 0) {
                        iM4837 = iM4837;
                        iM45029 = (ThreadFactoryC3888.m11306("ܿ۠") ^ i53) * (-49);
                        i = ((iM45029 ^ i52) * (-31435)) ^ 1286217422;
                        i2 = 403427261;
                        i55 = iM45029 ^ i2;
                        iM4837 = iM4837;
                        str8 = str8;
                        i64 = i64;
                        i49 = i49;
                        i59 = i59;
                        arrayList10 = arrayList10;
                        i57 = i57;
                        c8416 = c8416;
                        i48 = i48;
                        i54 = i;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۨᩳ") ^ i53;
                        i3 = ((iM11306 ^ i52) * 11385) ^ (-1438710517);
                        i4 = -1247835994;
                        i55 = iM11306 ^ i4;
                        str8 = str8;
                        i49 = i49;
                        i59 = i59;
                        c8412 = c8416;
                        i48 = i48;
                        i54 = i3;
                        i64 = i64;
                        arrayList10 = arrayList10;
                        i57 = i57;
                        c8416 = c8412;
                    }
                    break;
                case -2116664114:
                case 134276028:
                    if (C3535.f13026 > 0) {
                        iM113012 = (i53 - C19806.m45029("ۖۢ")) * (-73);
                        i = ((iM113012 ^ i52) * (-30069)) ^ (-1009592878);
                        i47 = -2144487184;
                    } else {
                        iM113012 = C19806.m45029("ۗۛ") ^ i52;
                        i = ((iM113012 ^ i53) * 10965) ^ (-967284872);
                        i47 = -1852883410;
                    }
                    i55 = iM113012 ^ i47;
                    i54 = i;
                    break;
                case -2097440208:
                case 302794874:
                    break;
                case -2067072804:
                case 1931710130:
                    int iM3400 = C0817.m3400((Integer) C0216.m1584(itM10563));
                    objM9796 = C3286.m9796(arrayList7, iM3400);
                    if (C1025.f4800 >= 0) {
                        i50 = iM3400;
                        iM113012 = (i53 - C19806.m45029("ۖۢ")) * (-73);
                        i = ((iM113012 ^ i52) * (-30069)) ^ (-1009592878);
                        i47 = -2144487184;
                        i55 = iM113012 ^ i47;
                        i54 = i;
                    } else {
                        int iM450213 = C19806.m45029("᩹֫") ^ i53;
                        i50 = iM3400;
                        i54 = ((iM450213 ^ i52) * (-10947)) ^ 1363916061;
                        i55 = iM450213 ^ (-2108755187);
                    }
                    break;
                case -2041864033:
                case -1466814735:
                    int i66 = i49;
                    str6 = str8;
                    i39 = iM939 + i56;
                    i37 = i59;
                    i38 = i66;
                    i34 = i48;
                    c8414 = c8416;
                    i35 = i57;
                    arrayList5 = arrayList10;
                    iM113011 = ThreadFactoryC3888.m11306("ۘܺ") ^ i53;
                    i36 = i39;
                    i40 = ((iM113011 ^ i52) * 28995) ^ 1002165775;
                    i41 = -43241923;
                    i55 = iM113011 ^ i41;
                    C8411 c8417 = c8414;
                    i48 = i34;
                    i54 = i40;
                    i64 = i36;
                    arrayList10 = arrayList5;
                    i57 = i35;
                    c8416 = c8417;
                    int i67 = i38;
                    i59 = i37;
                    str8 = str6;
                    i49 = i67;
                    break;
                case -2016489073:
                case 186063565:
                    arrayList8 = new ArrayList();
                    i49 = i59;
                    iM11307 = C19806.m45029("᩻ᩴ") ^ i53;
                    i = ((iM11307 ^ i52) * (-4729)) ^ (-875293080);
                    i5 = -932342630;
                    i55 = iM11307 ^ i5;
                    str8 = str8;
                    i49 = i49;
                    i54 = i;
                    break;
                case -2011934489:
                case -1336934359:
                    i48 = i48;
                    String str10 = str9;
                    interfaceC17314 = interfaceC17314;
                    i59 = i59;
                    c8416 = c8416;
                    arrayList9 = arrayList9;
                    i57 = i57;
                    i49 = i49;
                    arrayList10 = arrayList10;
                    str8 = str8;
                    i64 = i64;
                    iM4837 = iM4837;
                    i60 = i60;
                    i56 = i56;
                    HashSet hashSet4 = hashSet3;
                    strM18456 = C6851.m18456(hashSet4, str10);
                    sArr7 = f38316;
                    i62 = 401;
                    i63 = 12;
                    if (C1419.m4973()) {
                        hashSet3 = hashSet4;
                        i65 = i65;
                        strM18456 = strM18456;
                        sArr6 = sArr6;
                        i61 = i61;
                        str9 = str10;
                        int iM113013 = (i53 - ThreadFactoryC3888.m11306("ۨܳ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        int i68 = ((iM113013 ^ i52) * 1945) ^ (-358679338);
                        i55 = iM113013 ^ 1191995601;
                        c11359 = this;
                        i54 = i68;
                        i61 = i61;
                        i60 = i60;
                        i65 = i65;
                        arrayList9 = arrayList9;
                        str9 = str9;
                        i56 = i56;
                        i64 = i64;
                        interfaceC17314 = interfaceC17314;
                        sArr6 = sArr6;
                        iM4837 = iM4837;
                        arrayList10 = arrayList10;
                        strM18456 = strM18456;
                        str8 = str8;
                        i49 = i49;
                        i57 = i57;
                        i59 = i59;
                        hashSet3 = hashSet3;
                    } else {
                        int iM113014 = ThreadFactoryC3888.m11306("֡ۙ") ^ i53;
                        i55 = iM113014 ^ (-1160806098);
                        hashSet3 = hashSet4;
                        str9 = str10;
                        i60 = i60;
                        i54 = ((iM113014 ^ i52) * (-30447)) ^ 141019911;
                        arrayList9 = arrayList9;
                        i56 = i56;
                        i64 = i64;
                        interfaceC17314 = interfaceC17314;
                        iM4837 = iM4837;
                        arrayList10 = arrayList10;
                        str8 = str8;
                        i49 = i49;
                        i57 = i57;
                        i59 = i59;
                    }
                    c8416 = c8416;
                    i48 = i48;
                    break;
                case -1988808220:
                case -854976536:
                    hashSet3 = hashSet3;
                    i48 = i48;
                    interfaceC17314 = interfaceC17314;
                    strM18456 = strM18456;
                    i59 = i59;
                    c8416 = c8416;
                    s = s;
                    sArr6 = sArr6;
                    sArr = sArr7;
                    i63 = i63;
                    arrayList2 = arrayList9;
                    i57 = i57;
                    str9 = str9;
                    i49 = i49;
                    arrayList10 = arrayList10;
                    i8 = i65;
                    str8 = str8;
                    i64 = i64;
                    iM4837 = iM4837;
                    i9 = i60;
                    i10 = i61;
                    i56 = i56;
                    if ((s * 9198) - ((s * s) + 21150801) > 0) {
                        iM11308 = (ThreadFactoryC3888.m11306("ᩴܿ") ^ i53) * (-101);
                        i11 = ((iM11308 ^ i52) * (-5931)) ^ 957036909;
                        i12 = 1090126144;
                    } else {
                        iM11308 = (C19806.m45029("ۤ᩷") + i52) * (-125);
                        i11 = ((iM11308 ^ i53) * 2065) ^ (-1815382188);
                        i12 = 722982097;
                    }
                    i55 = iM11308 ^ i12;
                    s = s;
                    i54 = i11;
                    i61 = i10;
                    i60 = i9;
                    sArr7 = sArr;
                    i65 = i8;
                    arrayList9 = arrayList2;
                    str9 = str9;
                    i56 = i56;
                    i64 = i64;
                    i63 = i63;
                    interfaceC17314 = interfaceC17314;
                    sArr6 = sArr6;
                    c11359 = this;
                    iM4837 = iM4837;
                    arrayList10 = arrayList10;
                    strM18456 = strM18456;
                    str8 = str8;
                    i49 = i49;
                    i57 = i57;
                    i59 = i59;
                    hashSet3 = hashSet3;
                    c8416 = c8416;
                    i48 = i48;
                    break;
                case -1948255854:
                case -1934156261:
                    i48 = i48;
                    i59 = i59;
                    c8416 = c8416;
                    i57 = i57;
                    i49 = i49;
                    arrayList10 = arrayList10;
                    str8 = str8;
                    i64 = i64;
                    if (i48 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۚۜ") + i53) * (-67);
                        i3 = ((iM11306 ^ i52) * (-12075)) ^ (-2087203602);
                        i4 = -414769172;
                    } else {
                        iM11306 = C19806.m45029("۟ۗ") ^ i52;
                        i3 = ((iM11306 ^ i53) * 17025) ^ (-345945377);
                        i4 = -298981686;
                    }
                    i55 = iM11306 ^ i4;
                    str8 = str8;
                    i49 = i49;
                    i59 = i59;
                    c8412 = c8416;
                    i48 = i48;
                    i54 = i3;
                    i64 = i64;
                    arrayList10 = arrayList10;
                    i57 = i57;
                    c8416 = c8412;
                    break;
                case -1878233884:
                case 1863527130:
                    i49 = i49;
                    str8 = str8;
                    if (i49 < C0050.m938(arrayList7)) {
                        iM11307 = (i52 - C19806.m45029("ᩴ֫")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM11307 ^ i53) * 32259) ^ 1499840984;
                        i5 = -1917998000;
                    } else {
                        iM11307 = (i53 - C19806.m45029("ۡܺ")) * 9;
                        i = ((iM11307 ^ i52) * 423) ^ (-1417862109);
                        i5 = 811573239;
                    }
                    i55 = iM11307 ^ i5;
                    str8 = str8;
                    i49 = i49;
                    i54 = i;
                    break;
                case -1873311616:
                case -1808907421:
                    hashSet3 = hashSet3;
                    i48 = i48;
                    interfaceC17314 = interfaceC17314;
                    strM18456 = strM18456;
                    i59 = i59;
                    c8416 = c8416;
                    s = s;
                    sArr6 = sArr6;
                    sArr = sArr7;
                    i63 = i63;
                    arrayList2 = arrayList9;
                    i57 = i57;
                    str9 = str9;
                    i49 = i49;
                    arrayList10 = arrayList10;
                    i8 = i65;
                    str8 = str8;
                    i64 = i64;
                    iM4837 = iM4837;
                    i9 = i60;
                    i10 = i61;
                    i56 = i56;
                    sArr5 = f38316;
                    if (RunnableC1606.f6488 >= 0) {
                        iM11308 = (ThreadFactoryC3888.m11306("᩵᩻") ^ i53) * (-47);
                        i11 = ((iM11308 ^ i52) * (-7057)) ^ (-587099875);
                        i12 = -1070338808;
                    } else {
                        iM11308 = (ThreadFactoryC3888.m11306("᩺ᩳ") ^ i53) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i11 = ((iM11308 ^ i52) * 16943) ^ (-596443111);
                        i12 = -1652219433;
                    }
                    i55 = iM11308 ^ i12;
                    s = s;
                    i54 = i11;
                    i61 = i10;
                    i60 = i9;
                    sArr7 = sArr;
                    i65 = i8;
                    arrayList9 = arrayList2;
                    str9 = str9;
                    i56 = i56;
                    i64 = i64;
                    i63 = i63;
                    interfaceC17314 = interfaceC17314;
                    sArr6 = sArr6;
                    c11359 = this;
                    iM4837 = iM4837;
                    arrayList10 = arrayList10;
                    strM18456 = strM18456;
                    str8 = str8;
                    i49 = i49;
                    i57 = i57;
                    i59 = i59;
                    hashSet3 = hashSet3;
                    c8416 = c8416;
                    i48 = i48;
                    break;
                case -1866564478:
                case -93731011:
                    C8411 c8418 = c8416;
                    i57 = i57;
                    int i69 = i49;
                    str8 = str8;
                    int i70 = i59;
                    i49 = i69;
                    arrayList10 = arrayList10;
                    C2249.m6905(arrayList10, C1148.m4234(i48));
                    i59 = i70;
                    i64 = i64;
                    i48 = i48;
                    c8416 = c8418;
                    iM11306 = ThreadFactoryC3888.m11306("۟᩹") ^ i53;
                    i3 = ((iM11306 ^ i52) * (-16097)) ^ (-1614007503);
                    i4 = -1749046300;
                    i55 = iM11306 ^ i4;
                    str8 = str8;
                    i49 = i49;
                    i59 = i59;
                    c8412 = c8416;
                    i48 = i48;
                    i54 = i3;
                    i64 = i64;
                    arrayList10 = arrayList10;
                    i57 = i57;
                    c8416 = c8412;
                    break;
                case -1825513054:
                case -880712051:
                    i48 = i48;
                    interfaceC17314 = interfaceC17314;
                    strM18456 = strM18456;
                    i59 = i59;
                    c8416 = c8416;
                    sArr6 = sArr6;
                    sArr7 = sArr7;
                    i63 = i63;
                    arrayList9 = arrayList9;
                    i57 = i57;
                    str9 = str9;
                    i49 = i49;
                    arrayList10 = arrayList10;
                    i65 = i65;
                    str8 = str8;
                    i64 = i64;
                    iM4837 = iM4837;
                    i60 = i60;
                    i61 = i61;
                    i56 = i56;
                    HashSet hashSet5 = f38311;
                    if (!z) {
                        hashSet3 = hashSet5;
                        iM450210 = (ThreadFactoryC3888.m11306("ܶۙ") ^ i53) * 119;
                        i17 = ((iM450210 ^ i52) * 13023) ^ (-265529818);
                        i18 = -1041096370;
                        i55 = iM450210 ^ i18;
                        i54 = i17;
                        i61 = i61;
                        i60 = i60;
                        sArr7 = sArr7;
                        i65 = i65;
                        arrayList9 = arrayList9;
                        str9 = str9;
                        i56 = i56;
                        i64 = i64;
                        i63 = i63;
                        interfaceC17314 = interfaceC17314;
                        sArr6 = sArr6;
                        iM4837 = iM4837;
                        arrayList10 = arrayList10;
                        strM18456 = strM18456;
                        str8 = str8;
                        i49 = i49;
                        i57 = i57;
                        i59 = i59;
                        hashSet3 = hashSet3;
                        c8416 = c8416;
                        i48 = i48;
                    } else {
                        iM11309 = (i52 - ThreadFactoryC3888.m11306("᩹᩷")) * q.h;
                        hashSet3 = hashSet5;
                        i13 = ((iM11309 ^ i53) * 17307) ^ 1657789100;
                        i19 = 2061686572;
                        i55 = iM11309 ^ i19;
                        i54 = i13;
                        i61 = i61;
                        i60 = i60;
                        sArr7 = sArr7;
                        i65 = i65;
                        arrayList9 = arrayList9;
                        str9 = str9;
                        i56 = i56;
                        i64 = i64;
                        i63 = i63;
                        interfaceC17314 = interfaceC17314;
                        sArr6 = sArr6;
                        iM4837 = iM4837;
                        arrayList10 = arrayList10;
                        strM18456 = strM18456;
                        str8 = str8;
                        i49 = i49;
                        i57 = i57;
                        i59 = i59;
                        hashSet3 = hashSet3;
                        c8416 = c8416;
                        i48 = i48;
                    }
                    break;
                case -1820879816:
                case 494621751:
                    i48 = i48;
                    i59 = i59;
                    c8416 = c8416;
                    i57 = i57;
                    i49 = i49;
                    arrayList10 = arrayList10;
                    str8 = str8;
                    i64 = i64;
                    if (!C1460.m5058(arrayList6, arrayList7)) {
                        iM11306 = (i53 - ThreadFactoryC3888.m11306("۫᩸")) * 71;
                        i3 = ((iM11306 ^ i52) * 28295) ^ 1266918589;
                        i4 = -315549131;
                        i55 = iM11306 ^ i4;
                        str8 = str8;
                        i49 = i49;
                        i59 = i59;
                        c8412 = c8416;
                        i48 = i48;
                        i54 = i3;
                        i64 = i64;
                        arrayList10 = arrayList10;
                        i57 = i57;
                        c8416 = c8412;
                    } else {
                        iM4837 = iM4837;
                        iM45029 = (i52 - ThreadFactoryC3888.m11306("ܽۖ")) * 99;
                        i = ((iM45029 ^ i53) * 26607) ^ 1238667700;
                        i2 = 91168390;
                        i55 = iM45029 ^ i2;
                        iM4837 = iM4837;
                        str8 = str8;
                        i64 = i64;
                        i49 = i49;
                        i59 = i59;
                        arrayList10 = arrayList10;
                        i57 = i57;
                        c8416 = c8416;
                        i48 = i48;
                        i54 = i;
                    }
                    break;
                case -1749851922:
                case -1216770948:
                    C3660.m10788(arrayList9, new C8411(c11359, main, c11359.m28458((String) C0216.m1584(itM9863))));
                    iM45029 = ThreadFactoryC3888.m11306("᩸ܰ") ^ i52;
                    i = ((iM45029 ^ i53) * 29423) ^ 1758997882;
                    i2 = 1052976914;
                    i55 = iM45029 ^ i2;
                    iM4837 = iM4837;
                    str8 = str8;
                    i64 = i64;
                    i49 = i49;
                    i59 = i59;
                    arrayList10 = arrayList10;
                    i57 = i57;
                    c8416 = c8416;
                    i48 = i48;
                    i54 = i;
                    break;
                case -1721774832:
                case -43622994:
                    C3743.m10966();
                    if (C1977.f7413 > 0) {
                        hashSet3 = hashSet3;
                        i48 = i48;
                        interfaceC17314 = interfaceC17314;
                        strM18456 = strM18456;
                        i59 = i59;
                        c8416 = c8416;
                        sArr6 = sArr6;
                        sArr2 = sArr7;
                        i63 = i63;
                        i57 = i57;
                        str9 = str9;
                        i49 = i49;
                        arrayList10 = arrayList10;
                        i14 = i65;
                        str8 = str8;
                        i64 = i64;
                        iM4837 = iM4837;
                        i15 = i60;
                        i16 = i61;
                        i56 = i56;
                        int iM450214 = (i53 - C19806.m45029("ۖ֨")) * (-77);
                        i55 = iM450214 ^ (-1242615601);
                        i54 = ((iM450214 ^ i52) * (-14371)) ^ (-2059582709);
                        i61 = i16;
                        i60 = i15;
                        sArr7 = sArr2;
                        i65 = i14;
                        str9 = str9;
                        i56 = i56;
                        i64 = i64;
                        i63 = i63;
                        interfaceC17314 = interfaceC17314;
                        sArr6 = sArr6;
                        c11359 = this;
                        iM4837 = iM4837;
                        arrayList10 = arrayList10;
                        strM18456 = strM18456;
                        str8 = str8;
                        i49 = i49;
                        i57 = i57;
                        i59 = i59;
                        hashSet3 = hashSet3;
                        c8416 = c8416;
                        i48 = i48;
                    } else {
                        iM113012 = (i53 - C19806.m45029("ۖۢ")) * (-73);
                        i = ((iM113012 ^ i52) * (-30069)) ^ (-1009592878);
                        i47 = -2144487184;
                        i55 = iM113012 ^ i47;
                        i54 = i;
                    }
                    break;
                case -1642109307:
                case 1478338089:
                    iM31486 = c12665.m31486(c11359);
                    iM450210 = C19806.m45029("֡ۚ") ^ i52;
                    i17 = ((iM450210 ^ i53) * (-31825)) ^ (-1948697015);
                    i18 = -1646110256;
                    i55 = iM450210 ^ i18;
                    i54 = i17;
                    i61 = i61;
                    i60 = i60;
                    sArr7 = sArr7;
                    i65 = i65;
                    arrayList9 = arrayList9;
                    str9 = str9;
                    i56 = i56;
                    i64 = i64;
                    i63 = i63;
                    interfaceC17314 = interfaceC17314;
                    sArr6 = sArr6;
                    iM4837 = iM4837;
                    arrayList10 = arrayList10;
                    strM18456 = strM18456;
                    str8 = str8;
                    i49 = i49;
                    i57 = i57;
                    i59 = i59;
                    hashSet3 = hashSet3;
                    c8416 = c8416;
                    i48 = i48;
                    break;
                case -1615307652:
                case 275361030:
                    i48 = i48;
                    interfaceC17314 = interfaceC17314;
                    i59 = i59;
                    c8416 = c8416;
                    sArr = sArr7;
                    i63 = i63;
                    arrayList2 = arrayList9;
                    i57 = i57;
                    i49 = i49;
                    arrayList10 = arrayList10;
                    str8 = str8;
                    i64 = i64;
                    iM4837 = iM4837;
                    i9 = i60;
                    i56 = i56;
                    HashSet hashSet6 = hashSet3;
                    strM18456 = strM18456;
                    i8 = i65;
                    short[] sArr8 = sArr6;
                    i10 = i61;
                    String strM10571 = C3577.m10571(sArr8, i10, 1, i9);
                    if (C0629.m2907()) {
                        int iM450215 = (i52 - C19806.m45029("۫᩻")) * q.h;
                        i54 = ((iM450215 ^ i53) * 22695) ^ 55716827;
                        i55 = iM450215 ^ (-1506742749);
                        sArr6 = sArr8;
                        i61 = i10;
                        i60 = i9;
                        sArr7 = sArr;
                        strM18456 = strM18456;
                        i65 = i8;
                        arrayList9 = arrayList2;
                        i64 = i64;
                        i63 = i63;
                        interfaceC17314 = interfaceC17314;
                        str9 = strM10571;
                        hashSet3 = hashSet6;
                        arrayList10 = arrayList10;
                        i56 = i56;
                        i57 = i57;
                        iM4837 = iM4837;
                        c8416 = c8416;
                        str8 = str8;
                        i49 = i49;
                        i59 = i59;
                    } else {
                        hashSet3 = hashSet6;
                        str9 = strM10571;
                        sArr6 = sArr8;
                        iM11308 = (ThreadFactoryC3888.m11306("᩵᩻") ^ i53) * (-47);
                        i11 = ((iM11308 ^ i52) * (-7057)) ^ (-587099875);
                        i12 = -1070338808;
                        i55 = iM11308 ^ i12;
                        s = s;
                        i54 = i11;
                        i61 = i10;
                        i60 = i9;
                        sArr7 = sArr;
                        i65 = i8;
                        arrayList9 = arrayList2;
                        str9 = str9;
                        i56 = i56;
                        i64 = i64;
                        i63 = i63;
                        interfaceC17314 = interfaceC17314;
                        sArr6 = sArr6;
                        c11359 = this;
                        iM4837 = iM4837;
                        arrayList10 = arrayList10;
                        strM18456 = strM18456;
                        str8 = str8;
                        i49 = i49;
                        i57 = i57;
                        i59 = i59;
                        hashSet3 = hashSet3;
                        c8416 = c8416;
                    }
                    i48 = i48;
                    break;
                case -1591661618:
                case 1581436427:
                    i48 = i48;
                    i59 = i59;
                    c8416 = c8416;
                    i57 = i57;
                    i49 = i49;
                    arrayList10 = arrayList10;
                    str8 = str8;
                    i64 = i64;
                    iM4837 = iM4837;
                    if (iM939 == 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("۫᩶") ^ i52) * (-5);
                        i = ((iM45029 ^ i53) * (-13885)) ^ 963163318;
                        i2 = -995205020;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܿ۠") ^ i53) * (-49);
                        i = ((iM45029 ^ i52) * (-31435)) ^ 1286217422;
                        i2 = 403427261;
                    }
                    i55 = iM45029 ^ i2;
                    iM4837 = iM4837;
                    str8 = str8;
                    i64 = i64;
                    i49 = i49;
                    i59 = i59;
                    arrayList10 = arrayList10;
                    i57 = i57;
                    c8416 = c8416;
                    i48 = i48;
                    i54 = i;
                    break;
                case -1563040353:
                case 220553095:
                    i48 = i48;
                    i59 = i59;
                    c8416 = c8416;
                    i57 = i57;
                    i49 = i49;
                    arrayList10 = arrayList10;
                    str8 = str8;
                    i64 = i64;
                    if (iM939 <= 0) {
                        i48 = i48;
                        i20 = i65;
                        i21 = i61;
                        iM113010 = C19806.m45029("ܳۖ") ^ i52;
                        sArr3 = sArr6;
                        i22 = ((iM113010 ^ i53) * (-6251)) ^ 1750711274;
                        i23 = -728173001;
                        i55 = iM113010 ^ i23;
                        i54 = i22;
                        i61 = i21;
                        i60 = i60;
                        sArr7 = sArr7;
                        i65 = i20;
                        arrayList9 = arrayList9;
                        str9 = str9;
                        i64 = i64;
                        i63 = i63;
                        interfaceC17314 = interfaceC17314;
                        sArr6 = sArr3;
                        arrayList10 = arrayList10;
                        strM18456 = strM18456;
                        i57 = i57;
                        hashSet3 = hashSet3;
                        c8416 = c8416;
                        i56 = i56;
                        i48 = i48;
                        iM4837 = iM4837;
                        str8 = str8;
                        i49 = i49;
                        i59 = i59;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܰܶ") ^ i52) * 123;
                        i3 = ((iM11306 ^ i53) * 4349) ^ 1704983566;
                        i4 = 1060141409;
                        i55 = iM11306 ^ i4;
                        str8 = str8;
                        i49 = i49;
                        i59 = i59;
                        c8412 = c8416;
                        i48 = i48;
                        i54 = i3;
                        i64 = i64;
                        arrayList10 = arrayList10;
                        i57 = i57;
                        c8416 = c8412;
                    }
                    break;
                case -1560116733:
                case -934097067:
                    C7105.m18985();
                    if (C1025.f4800 < 0) {
                        iM113012 = (i52 - ThreadFactoryC3888.m11306("ۤۘ")) * (-45);
                        i = ((iM113012 ^ i53) * (-26733)) ^ (-1511406039);
                        i47 = 234983277;
                        i55 = iM113012 ^ i47;
                        i54 = i;
                    } else {
                        hashSet3 = hashSet3;
                        i48 = i48;
                        interfaceC17314 = interfaceC17314;
                        strM18456 = strM18456;
                        i59 = i59;
                        c8416 = c8416;
                        sArr6 = sArr6;
                        sArr2 = sArr7;
                        i63 = i63;
                        i57 = i57;
                        str9 = str9;
                        i49 = i49;
                        arrayList10 = arrayList10;
                        i14 = i65;
                        str8 = str8;
                        i64 = i64;
                        iM4837 = iM4837;
                        i15 = i60;
                        i16 = i61;
                        i56 = i56;
                        int iM450216 = (i53 - C19806.m45029("ۖ֨")) * (-77);
                        i55 = iM450216 ^ (-1242615601);
                        i54 = ((iM450216 ^ i52) * (-14371)) ^ (-2059582709);
                        i61 = i16;
                        i60 = i15;
                        sArr7 = sArr2;
                        i65 = i14;
                        str9 = str9;
                        i56 = i56;
                        i64 = i64;
                        i63 = i63;
                        interfaceC17314 = interfaceC17314;
                        sArr6 = sArr6;
                        c11359 = this;
                        iM4837 = iM4837;
                        arrayList10 = arrayList10;
                        strM18456 = strM18456;
                        str8 = str8;
                        i49 = i49;
                        i57 = i57;
                        i59 = i59;
                        hashSet3 = hashSet3;
                        c8416 = c8416;
                        i48 = i48;
                    }
                    break;
                case -1545419452:
                case -125583272:
                    c12665.notifyItemRangeInserted(c12665.m31486(c11359), i58);
                    break;
                case -1525792136:
                case 529817716:
                    i46 = i49;
                    c12665.notifyItemRangeRemoved(iM31486, i64);
                    i48 = i48;
                    i59 = i59;
                    c8416 = c8416;
                    i49 = i46;
                    i57 = i57;
                    arrayList10 = arrayList10;
                    i64 = i64;
                    i20 = i65;
                    i21 = i61;
                    iM113010 = C19806.m45029("ܳۖ") ^ i52;
                    sArr3 = sArr6;
                    i22 = ((iM113010 ^ i53) * (-6251)) ^ 1750711274;
                    i23 = -728173001;
                    i55 = iM113010 ^ i23;
                    i54 = i22;
                    i61 = i21;
                    i60 = i60;
                    sArr7 = sArr7;
                    i65 = i20;
                    arrayList9 = arrayList9;
                    str9 = str9;
                    i64 = i64;
                    i63 = i63;
                    interfaceC17314 = interfaceC17314;
                    sArr6 = sArr3;
                    arrayList10 = arrayList10;
                    strM18456 = strM18456;
                    i57 = i57;
                    hashSet3 = hashSet3;
                    c8416 = c8416;
                    i56 = i56;
                    i48 = i48;
                    iM4837 = iM4837;
                    str8 = str8;
                    i49 = i49;
                    i59 = i59;
                    break;
                case -1510570988:
                case -1091265129:
                    i48 = i48;
                    i59 = i59;
                    c8416 = c8416;
                    i57 = i57;
                    i49 = i49;
                    arrayList10 = arrayList10;
                    str8 = str8;
                    i64 = i64;
                    if (iM4837 != 0) {
                        i48 = i48;
                        i20 = i65;
                        i21 = i61;
                        iM113010 = C19806.m45029("ܳۖ") ^ i52;
                        sArr3 = sArr6;
                        i22 = ((iM113010 ^ i53) * (-6251)) ^ 1750711274;
                        i23 = -728173001;
                        i55 = iM113010 ^ i23;
                        i54 = i22;
                        i61 = i21;
                        i60 = i60;
                        sArr7 = sArr7;
                        i65 = i20;
                        arrayList9 = arrayList9;
                        str9 = str9;
                        i64 = i64;
                        i63 = i63;
                        interfaceC17314 = interfaceC17314;
                        sArr6 = sArr3;
                        arrayList10 = arrayList10;
                        strM18456 = strM18456;
                        i57 = i57;
                        hashSet3 = hashSet3;
                        c8416 = c8416;
                        i56 = i56;
                        i48 = i48;
                        iM4837 = iM4837;
                        str8 = str8;
                        i49 = i49;
                        i59 = i59;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۜ۬") ^ i52;
                        i3 = ((iM11306 ^ i53) * 26059) ^ (-1873374726);
                        i4 = 474176331;
                        i55 = iM11306 ^ i4;
                        str8 = str8;
                        i49 = i49;
                        i59 = i59;
                        c8412 = c8416;
                        i48 = i48;
                        i54 = i3;
                        i64 = i64;
                        arrayList10 = arrayList10;
                        i57 = i57;
                        c8416 = c8412;
                    }
                    break;
                case -1495667509:
                case 769587236:
                    C0216.m1591();
                    if (C1875.f7103 >= 0) {
                        hashSet3 = hashSet3;
                        i48 = i48;
                        interfaceC17314 = interfaceC17314;
                        strM18456 = strM18456;
                        i59 = i59;
                        c8416 = c8416;
                        s = s;
                        sArr6 = sArr6;
                        sArr = sArr7;
                        i63 = i63;
                        arrayList2 = arrayList9;
                        i57 = i57;
                        str9 = str9;
                        i49 = i49;
                        arrayList10 = arrayList10;
                        i8 = i65;
                        str8 = str8;
                        i64 = i64;
                        iM4837 = iM4837;
                        i9 = i60;
                        i10 = i61;
                        i56 = i56;
                        iM11308 = (ThreadFactoryC3888.m11306("᩵᩻") ^ i53) * (-47);
                        i11 = ((iM11308 ^ i52) * (-7057)) ^ (-587099875);
                        i12 = -1070338808;
                        i55 = iM11308 ^ i12;
                        s = s;
                        i54 = i11;
                        i61 = i10;
                        i60 = i9;
                        sArr7 = sArr;
                        i65 = i8;
                        arrayList9 = arrayList2;
                        str9 = str9;
                        i56 = i56;
                        i64 = i64;
                        i63 = i63;
                        interfaceC17314 = interfaceC17314;
                        sArr6 = sArr6;
                        c11359 = this;
                        iM4837 = iM4837;
                        arrayList10 = arrayList10;
                        strM18456 = strM18456;
                        str8 = str8;
                        i49 = i49;
                        i57 = i57;
                        i59 = i59;
                        hashSet3 = hashSet3;
                        c8416 = c8416;
                        i48 = i48;
                    } else {
                        iM113012 = C19806.m45029("ۗۛ") ^ i52;
                        i = ((iM113012 ^ i53) * 10965) ^ (-967284872);
                        i47 = -1852883410;
                        i55 = iM113012 ^ i47;
                        i54 = i;
                    }
                    break;
                case -1443766679:
                case -302133494:
                    i48 = i48;
                    i59 = i59;
                    c8416 = c8416;
                    i57 = i57;
                    i49 = i49;
                    arrayList10 = arrayList10;
                    str8 = str8;
                    i64 = i64;
                    if (c11359.f21341) {
                        iM11306 = (C19806.m45029("ܺܰ") + i52) * (-29);
                        i3 = ((iM11306 ^ i53) * (-17709)) ^ 244163234;
                        i4 = -484324096;
                    } else {
                        i58 = i56;
                        iM11306 = (i53 - C19806.m45029("۠ۛ")) * (-67);
                        i3 = ((iM11306 ^ i52) * (-19955)) ^ (-2143384060);
                        i4 = 652239652;
                    }
                    i55 = iM11306 ^ i4;
                    str8 = str8;
                    i49 = i49;
                    i59 = i59;
                    c8412 = c8416;
                    i48 = i48;
                    i54 = i3;
                    i64 = i64;
                    arrayList10 = arrayList10;
                    i57 = i57;
                    c8416 = c8412;
                    break;
                case -1405091779:
                case 318869187:
                    hashSet3 = hashSet3;
                    i48 = i48;
                    interfaceC17314 = interfaceC17314;
                    strM18456 = strM18456;
                    i59 = i59;
                    c8416 = c8416;
                    sArr6 = sArr6;
                    i61 = i61;
                    sArr7 = sArr7;
                    i63 = i63;
                    arrayList9 = arrayList9;
                    i57 = i57;
                    str9 = str9;
                    i49 = i49;
                    arrayList10 = arrayList10;
                    str8 = str8;
                    i64 = i64;
                    iM4837 = iM4837;
                    i60 = i60;
                    i56 = i56;
                    int iM4838 = iM939 - C1377.m4837(arrayList6);
                    c12665 = c11359.f21343;
                    if (iM939 != 0) {
                        i65 = iM4838;
                        iM450210 = (i52 - C19806.m45029("᩵ܺ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i17 = ((iM450210 ^ i53) * (-15585)) ^ (-2073709228);
                        i18 = -1096953174;
                        i55 = iM450210 ^ i18;
                        i54 = i17;
                        i61 = i61;
                        i60 = i60;
                        sArr7 = sArr7;
                        i65 = i65;
                        arrayList9 = arrayList9;
                        str9 = str9;
                        i56 = i56;
                        i64 = i64;
                        i63 = i63;
                        interfaceC17314 = interfaceC17314;
                        sArr6 = sArr6;
                        iM4837 = iM4837;
                        arrayList10 = arrayList10;
                        strM18456 = strM18456;
                        str8 = str8;
                        i49 = i49;
                        i57 = i57;
                        i59 = i59;
                        hashSet3 = hashSet3;
                        c8416 = c8416;
                        i48 = i48;
                    } else {
                        iM11309 = ThreadFactoryC3888.m11306("ܺ֡") ^ i53;
                        i65 = iM4838;
                        i13 = ((iM11309 ^ i52) * 26023) ^ (-1600404877);
                        i19 = -1845650970;
                        i55 = iM11309 ^ i19;
                        i54 = i13;
                        i61 = i61;
                        i60 = i60;
                        sArr7 = sArr7;
                        i65 = i65;
                        arrayList9 = arrayList9;
                        str9 = str9;
                        i56 = i56;
                        i64 = i64;
                        i63 = i63;
                        interfaceC17314 = interfaceC17314;
                        sArr6 = sArr6;
                        iM4837 = iM4837;
                        arrayList10 = arrayList10;
                        strM18456 = strM18456;
                        str8 = str8;
                        i49 = i49;
                        i57 = i57;
                        i59 = i59;
                        hashSet3 = hashSet3;
                        c8416 = c8416;
                        i48 = i48;
                    }
                    break;
                case -1389437523:
                case 2127543547:
                    i49 = i49;
                    str8 = str8;
                    if (MenuItemOnMenuItemClickListenerC3244.m9713(arrayList6, C3286.m9796(arrayList7, i49))) {
                        iM11307 = (C19806.m45029("ܳۚ") ^ i53) * (-53);
                        i = ((iM11307 ^ i52) * 22563) ^ (-658090284);
                        i5 = -643261635;
                    } else {
                        iM11307 = (ThreadFactoryC3888.m11306("۬ᩳ") ^ i53) * (-17);
                        i = ((iM11307 ^ i52) * 10305) ^ 435576210;
                        i5 = -1762828470;
                    }
                    i55 = iM11307 ^ i5;
                    str8 = str8;
                    i49 = i49;
                    i54 = i;
                    break;
                case -1264297207:
                case -912274586:
                    iM31486 = -1;
                    iM450210 = C19806.m45029("֡ۚ") ^ i52;
                    i17 = ((iM450210 ^ i53) * (-31825)) ^ (-1948697015);
                    i18 = -1646110256;
                    i55 = iM450210 ^ i18;
                    i54 = i17;
                    i61 = i61;
                    i60 = i60;
                    sArr7 = sArr7;
                    i65 = i65;
                    arrayList9 = arrayList9;
                    str9 = str9;
                    i56 = i56;
                    i64 = i64;
                    i63 = i63;
                    interfaceC17314 = interfaceC17314;
                    sArr6 = sArr6;
                    iM4837 = iM4837;
                    arrayList10 = arrayList10;
                    strM18456 = strM18456;
                    str8 = str8;
                    i49 = i49;
                    i57 = i57;
                    i59 = i59;
                    hashSet3 = hashSet3;
                    c8416 = c8416;
                    i48 = i48;
                    break;
                case -1215035222:
                case -568351780:
                    C2249.m6905(arrayList8, C2788.m8476(i49));
                    i49 = i49;
                    str8 = str8;
                    iM11307 = (C19806.m45029("ܳۚ") ^ i53) * (-53);
                    i = ((iM11307 ^ i52) * 22563) ^ (-658090284);
                    i5 = -643261635;
                    i55 = iM11307 ^ i5;
                    str8 = str8;
                    i49 = i49;
                    i54 = i;
                    break;
                case -1212941797:
                case 1476006618:
                    arrayList9.remove(i59);
                    c12665.notifyItemRemoved(iM31486 + i56);
                    break;
                case -1211134634:
                case 1836553565:
                    hashSet3 = hashSet3;
                    i48 = i48;
                    interfaceC17314 = interfaceC17314;
                    strM18456 = strM18456;
                    i59 = i59;
                    c8416 = c8416;
                    sArr6 = sArr6;
                    sArr7 = sArr7;
                    i63 = i63;
                    arrayList9 = arrayList9;
                    i57 = i57;
                    str9 = str9;
                    i49 = i49;
                    arrayList10 = arrayList10;
                    i65 = i65;
                    str8 = str8;
                    i64 = i64;
                    iM4837 = iM4837;
                    i60 = i60;
                    i61 = i61;
                    i56 = i56;
                    s = sArr5[399];
                    if (C2477.f9839 > 0) {
                        int iM450217 = (i52 - C19806.m45029("ۗ۬")) * 69;
                        i13 = ((iM450217 ^ i53) * 17637) ^ 1090906448;
                        i55 = iM450217 ^ (-1041490193);
                        c11359 = this;
                        i54 = i13;
                        i61 = i61;
                        i60 = i60;
                        sArr7 = sArr7;
                        i65 = i65;
                        arrayList9 = arrayList9;
                        str9 = str9;
                        i56 = i56;
                        i64 = i64;
                        i63 = i63;
                        interfaceC17314 = interfaceC17314;
                        sArr6 = sArr6;
                        iM4837 = iM4837;
                        arrayList10 = arrayList10;
                        strM18456 = strM18456;
                        str8 = str8;
                        i49 = i49;
                        i57 = i57;
                        i59 = i59;
                        hashSet3 = hashSet3;
                        c8416 = c8416;
                        i48 = i48;
                    } else {
                        sArr7 = sArr7;
                        i63 = i63;
                        int iM113015 = (i53 - ThreadFactoryC3888.m11306("ۨܳ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        int i610 = ((iM113015 ^ i52) * 1945) ^ (-358679338);
                        i55 = iM113015 ^ 1191995601;
                        c11359 = this;
                        i54 = i610;
                        i61 = i61;
                        i60 = i60;
                        i65 = i65;
                        arrayList9 = arrayList9;
                        str9 = str9;
                        i56 = i56;
                        i64 = i64;
                        interfaceC17314 = interfaceC17314;
                        sArr6 = sArr6;
                        iM4837 = iM4837;
                        arrayList10 = arrayList10;
                        strM18456 = strM18456;
                        str8 = str8;
                        i49 = i49;
                        i57 = i57;
                        i59 = i59;
                        hashSet3 = hashSet3;
                        c8416 = c8416;
                        i48 = i48;
                    }
                    break;
                case -1202800874:
                case -542251086:
                    i49 = i49;
                    arrayList10 = arrayList10;
                    str8 = str8;
                    itM9864 = ViewTreeObserverOnPreDrawListenerC3327.m9863(arrayList10);
                    iM11306 = (C19806.m45029("ۧ᩹") + i52) * 53;
                    i3 = ((iM11306 ^ i53) * 11501) ^ (-309637154);
                    i4 = -525342392;
                    i55 = iM11306 ^ i4;
                    str8 = str8;
                    i49 = i49;
                    i59 = i59;
                    c8412 = c8416;
                    i48 = i48;
                    i54 = i3;
                    i64 = i64;
                    arrayList10 = arrayList10;
                    i57 = i57;
                    c8416 = c8412;
                    break;
                case -1141174097:
                case -866755264:
                    arrayList9.add(i57, new C8411(c11359, main, c11359.m28458(str8)));
                    if (c11359.f21341) {
                        iM113012 = (i52 - C19806.m45029("ۤܿ")) * (-127);
                        i = ((iM113012 ^ i53) * 22253) ^ (-1270210943);
                        i47 = -9734355;
                        i55 = iM113012 ^ i47;
                        i54 = i;
                    }
                    iM11307 = C19806.m45029("ۚ۟") ^ i52;
                    i = ((iM11307 ^ i53) * 10691) ^ (-706184682);
                    i5 = 1308426917;
                    i55 = iM11307 ^ i5;
                    str8 = str8;
                    i49 = i49;
                    i54 = i;
                    break;
                case -1069316798:
                case -68700652:
                    i60 = 64052;
                    int iM450218 = C19806.m45029("᩻֡") ^ i52;
                    int i71 = ((iM450218 ^ i53) * (-21537)) ^ (-703975714);
                    i55 = iM450218 ^ 1229042878;
                    c11359 = this;
                    i54 = i71;
                    i61 = i61;
                    sArr7 = sArr7;
                    i65 = i65;
                    arrayList9 = arrayList9;
                    str9 = str9;
                    i56 = i56;
                    i64 = i64;
                    i63 = i63;
                    interfaceC17314 = interfaceC17314;
                    sArr6 = sArr6;
                    iM4837 = iM4837;
                    arrayList10 = arrayList10;
                    strM18456 = strM18456;
                    str8 = str8;
                    i49 = i49;
                    i57 = i57;
                    i59 = i59;
                    hashSet3 = hashSet3;
                    c8416 = c8416;
                    i48 = i48;
                    break;
                case -1038699709:
                case 1910579943:
                    i49 = i49;
                    str8 = str8;
                    c12665.notifyItemRemoved(iM31486 + 1 + i65 + iM6682);
                    i49 = i49;
                    arrayList10 = arrayList10;
                    iM11306 = (C19806.m45029("ۧ᩹") + i52) * 53;
                    i3 = ((iM11306 ^ i53) * 11501) ^ (-309637154);
                    i4 = -525342392;
                    i55 = iM11306 ^ i4;
                    str8 = str8;
                    i49 = i49;
                    i59 = i59;
                    c8412 = c8416;
                    i48 = i48;
                    i54 = i3;
                    i64 = i64;
                    arrayList10 = arrayList10;
                    i57 = i57;
                    c8416 = c8412;
                    break;
                case -940806450:
                case -165120219:
                    C0962.m3746();
                    C2642.m8171();
                    iM113012 = (i53 - C19806.m45029("ۖۢ")) * (-73);
                    i = ((iM113012 ^ i52) * (-30069)) ^ (-1009592878);
                    i47 = -2144487184;
                    i55 = iM113012 ^ i47;
                    i54 = i;
                    break;
                case -864316960:
                case 1848434723:
                    int i72 = i57;
                    i48 = i48;
                    ArrayList arrayList11 = arrayList10;
                    int i73 = i64;
                    int i74 = i49;
                    String str11 = str8;
                    int i75 = i59;
                    C8411 c8419 = new C8411(c11359, main, c11359.m28458((String) C1419.m4967(arrayList7, i75)));
                    if (c11359.f21341) {
                        int iM113016 = ThreadFactoryC3888.m11306("ᩳ᩷") ^ i52;
                        i55 = iM113016 ^ 358454291;
                        i54 = ((iM113016 ^ i53) * 23675) ^ (-375877607);
                    } else {
                        int iM450219 = (C19806.m45029("֨ۤ") + i53) * (-93);
                        i55 = iM450219 ^ 80419238;
                        i54 = ((iM450219 ^ i52) * 26665) ^ 983348919;
                    }
                    str8 = str11;
                    i64 = i73;
                    i49 = i74;
                    i59 = i75;
                    arrayList10 = arrayList11;
                    i57 = i72;
                    c8416 = c8419;
                    break;
                case -807537735:
                case 1868910927:
                    int i76 = i59;
                    i7 = i49;
                    i6 = i76;
                    arrayList = arrayList10;
                    iM938 = i48 - 1;
                    c8411 = c8416;
                    int iM450220 = (C19806.m45029("᩺۫") + i53) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                    int i77 = ((iM450220 ^ i52) * (-20527)) ^ 573920997;
                    i55 = iM450220 ^ (-662481485);
                    iM4837 = iM4837;
                    str8 = str8;
                    i64 = i64;
                    i49 = i7;
                    i59 = i6;
                    arrayList10 = arrayList;
                    i54 = i77;
                    c8412 = c8411;
                    i48 = iM938;
                    i57 = i57;
                    c8416 = c8412;
                    break;
                case -733878318:
                case -452601444:
                    hashSet = hashSet3;
                    zRemove = hashSet.remove(str);
                    z2 = zRemove;
                    iM11309 = ThreadFactoryC3888.m11306("ۚ᩸") ^ i53;
                    hashSet3 = hashSet;
                    i13 = ((iM11309 ^ i52) * 31859) ^ (-112155739);
                    i19 = -1880056399;
                    i55 = iM11309 ^ i19;
                    i54 = i13;
                    i61 = i61;
                    i60 = i60;
                    sArr7 = sArr7;
                    i65 = i65;
                    arrayList9 = arrayList9;
                    str9 = str9;
                    i56 = i56;
                    i64 = i64;
                    i63 = i63;
                    interfaceC17314 = interfaceC17314;
                    sArr6 = sArr6;
                    iM4837 = iM4837;
                    arrayList10 = arrayList10;
                    strM18456 = strM18456;
                    str8 = str8;
                    i49 = i49;
                    i57 = i57;
                    i59 = i59;
                    hashSet3 = hashSet3;
                    c8416 = c8416;
                    i48 = i48;
                    break;
                case -708910738:
                case -106806041:
                    i48 = i48;
                    c8416 = c8416;
                    i57 = i57;
                    arrayList10 = arrayList10;
                    i64 = i64;
                    int i78 = i49;
                    str8 = str8;
                    int i79 = i59;
                    i49 = i78;
                    i59 = i79;
                    i58 = iM4837 + i56;
                    iM11306 = (i53 - C19806.m45029("۠ۛ")) * (-67);
                    i3 = ((iM11306 ^ i52) * (-19955)) ^ (-2143384060);
                    i4 = 652239652;
                    i55 = iM11306 ^ i4;
                    str8 = str8;
                    i49 = i49;
                    i59 = i59;
                    c8412 = c8416;
                    i48 = i48;
                    i54 = i3;
                    i64 = i64;
                    arrayList10 = arrayList10;
                    i57 = i57;
                    c8416 = c8412;
                    break;
                case -678247352:
                case 54698314:
                    i48 = i48;
                    interfaceC17314 = interfaceC17314;
                    i59 = i59;
                    c8416 = c8416;
                    sArr7 = sArr7;
                    i63 = i63;
                    arrayList9 = arrayList9;
                    i57 = i57;
                    i49 = i49;
                    arrayList10 = arrayList10;
                    sArr6 = sArr6;
                    str8 = str8;
                    i64 = i64;
                    iM4837 = iM4837;
                    i60 = i60;
                    i56 = i56;
                    hashSet3 = hashSet3;
                    strM18456 = strM18456;
                    str9 = str9;
                    i20 = i65;
                    i21 = i61;
                    if (z2) {
                        sArr3 = sArr6;
                        iM113010 = (ThreadFactoryC3888.m11306("᩶᩵") ^ i52) * (-59);
                        i22 = ((iM113010 ^ i53) * 23293) ^ 1204726192;
                        i23 = 809569248;
                    } else {
                        iM113010 = C19806.m45029("ܳۖ") ^ i52;
                        sArr3 = sArr6;
                        i22 = ((iM113010 ^ i53) * (-6251)) ^ 1750711274;
                        i23 = -728173001;
                    }
                    i55 = iM113010 ^ i23;
                    i54 = i22;
                    i61 = i21;
                    i60 = i60;
                    sArr7 = sArr7;
                    i65 = i20;
                    arrayList9 = arrayList9;
                    str9 = str9;
                    i64 = i64;
                    i63 = i63;
                    interfaceC17314 = interfaceC17314;
                    sArr6 = sArr3;
                    arrayList10 = arrayList10;
                    strM18456 = strM18456;
                    i57 = i57;
                    hashSet3 = hashSet3;
                    c8416 = c8416;
                    i56 = i56;
                    i48 = i48;
                    iM4837 = iM4837;
                    str8 = str8;
                    i49 = i49;
                    i59 = i59;
                    break;
                case -634421640:
                case 1952383368:
                    str8 = (String) objM9796;
                    i57 = i65 + i50;
                    if (!C2332.f8260) {
                        hashSet3 = hashSet3;
                        i48 = i48;
                        interfaceC17314 = interfaceC17314;
                        strM18456 = strM18456;
                        i59 = i59;
                        c8416 = c8416;
                        s = s;
                        sArr6 = sArr6;
                        sArr = sArr7;
                        i63 = i63;
                        arrayList2 = arrayList9;
                        i57 = i57;
                        str9 = str9;
                        i49 = i49;
                        arrayList10 = arrayList10;
                        i8 = i65;
                        str8 = str8;
                        i64 = i64;
                        iM4837 = iM4837;
                        i9 = i60;
                        i10 = i61;
                        i56 = i56;
                        iM11308 = (ThreadFactoryC3888.m11306("᩵᩻") ^ i53) * (-47);
                        i11 = ((iM11308 ^ i52) * (-7057)) ^ (-587099875);
                        i12 = -1070338808;
                        i55 = iM11308 ^ i12;
                        s = s;
                        i54 = i11;
                        i61 = i10;
                        i60 = i9;
                        sArr7 = sArr;
                        i65 = i8;
                        arrayList9 = arrayList2;
                        str9 = str9;
                        i56 = i56;
                        i64 = i64;
                        i63 = i63;
                        interfaceC17314 = interfaceC17314;
                        sArr6 = sArr6;
                        c11359 = this;
                        iM4837 = iM4837;
                        arrayList10 = arrayList10;
                        strM18456 = strM18456;
                        str8 = str8;
                        i49 = i49;
                        i57 = i57;
                        i59 = i59;
                        hashSet3 = hashSet3;
                        c8416 = c8416;
                        i48 = i48;
                    } else {
                        iM113012 = (i52 - ThreadFactoryC3888.m11306("֡۫")) * (-63);
                        i = ((iM113012 ^ i53) * 1579) ^ 63825616;
                        i47 = 106348213;
                        i55 = iM113012 ^ i47;
                        i54 = i;
                    }
                    break;
                case -630755452:
                case 543116147:
                    c12665.notifyItemInserted(iM31486 + 1 + i65 + i50);
                    iM11307 = C19806.m45029("ۚ۟") ^ i52;
                    i = ((iM11307 ^ i53) * 10691) ^ (-706184682);
                    i5 = 1308426917;
                    i55 = iM11307 ^ i5;
                    str8 = str8;
                    i49 = i49;
                    i54 = i;
                    break;
                case -627635396:
                case 724512745:
                    itM10563 = C3577.m10563(arrayList8);
                    iM11307 = C19806.m45029("ۚ۟") ^ i52;
                    i = ((iM11307 ^ i53) * 10691) ^ (-706184682);
                    i5 = 1308426917;
                    i55 = iM11307 ^ i5;
                    str8 = str8;
                    i49 = i49;
                    i54 = i;
                    break;
                case -580736131:
                case -491945135:
                    i48 = i48;
                    i59 = i59;
                    c8416 = c8416;
                    sArr = sArr7;
                    int i80 = i62;
                    i57 = i57;
                    i49 = i49;
                    arrayList10 = arrayList10;
                    str8 = str8;
                    i64 = i64;
                    iM4837 = iM4837;
                    i9 = i60;
                    i56 = i56;
                    int i81 = i63;
                    String strM4230 = C1148.m4230(sArr, i80, i81, i9);
                    i63 = i81;
                    InterfaceC17314 interfaceC17315 = interfaceC17314;
                    arrayList2 = arrayList9;
                    String str12 = strM18456;
                    C3660.m10783(C3535.m10429(interfaceC17315, strM4230, str12));
                    ArrayList arrayList12 = m28440().f12743;
                    if (RunnableC1606.m5473() == 0) {
                        int iM450221 = C19806.m45029("ۜܺ") ^ i52;
                        int i82 = ((iM450221 ^ i53) * 25259) ^ 942594888;
                        i55 = iM450221 ^ (-223241228);
                        strM18456 = str12;
                        i60 = i9;
                        sArr7 = sArr;
                        i62 = i80;
                        arrayList9 = arrayList2;
                        i64 = i64;
                        i63 = i63;
                        interfaceC17314 = interfaceC17315;
                        arrayList7 = arrayList12;
                        arrayList10 = arrayList10;
                        i57 = i57;
                        i54 = i82;
                        c8416 = c8416;
                        i56 = i56;
                        i48 = i48;
                        iM4837 = iM4837;
                        str8 = str8;
                        i49 = i49;
                        i59 = i59;
                    } else {
                        interfaceC17314 = interfaceC17315;
                        i62 = i80;
                        hashSet3 = hashSet3;
                        str9 = str9;
                        sArr6 = sArr6;
                        arrayList7 = arrayList12;
                        strM18456 = str12;
                        i8 = i65;
                        i10 = i61;
                        iM11308 = (ThreadFactoryC3888.m11306("᩵᩻") ^ i53) * (-47);
                        i11 = ((iM11308 ^ i52) * (-7057)) ^ (-587099875);
                        i12 = -1070338808;
                        i55 = iM11308 ^ i12;
                        s = s;
                        i54 = i11;
                        i61 = i10;
                        i60 = i9;
                        sArr7 = sArr;
                        i65 = i8;
                        arrayList9 = arrayList2;
                        str9 = str9;
                        i56 = i56;
                        i64 = i64;
                        i63 = i63;
                        interfaceC17314 = interfaceC17314;
                        sArr6 = sArr6;
                        c11359 = this;
                        iM4837 = iM4837;
                        arrayList10 = arrayList10;
                        strM18456 = strM18456;
                        str8 = str8;
                        i49 = i49;
                        i57 = i57;
                        i59 = i59;
                        hashSet3 = hashSet3;
                        c8416 = c8416;
                        i48 = i48;
                    }
                    break;
                case -566058849:
                case 103865433:
                    if (C0797.f3386) {
                        iM113012 = (C19806.m45029("۠֫") ^ i52) * (-115);
                        i = ((iM113012 ^ i53) * (-31539)) ^ 797978055;
                        i47 = 1280576414;
                    } else {
                        iM113012 = C19806.m45029("ۗۛ") ^ i52;
                        i = ((iM113012 ^ i53) * 10965) ^ (-967284872);
                        i47 = -1852883410;
                    }
                    i55 = iM113012 ^ i47;
                    i54 = i;
                    break;
                case -561969578:
                case 1726764311:
                    i48 = i48;
                    i59 = i59;
                    c8416 = c8416;
                    i57 = i57;
                    i49 = i49;
                    arrayList10 = arrayList10;
                    str8 = str8;
                    i64 = i64;
                    iM4837 = iM4837;
                    if (iM4837 == i56) {
                        iM45029 = C19806.m45029("᩸ܽ") ^ i52;
                        i = ((iM45029 ^ i53) * 15495) ^ 1386433349;
                        i2 = 1260119542;
                    } else {
                        iM45029 = (i52 - ThreadFactoryC3888.m11306("ܽۖ")) * 99;
                        i = ((iM45029 ^ i53) * 26607) ^ 1238667700;
                        i2 = 91168390;
                    }
                    i55 = iM45029 ^ i2;
                    iM4837 = iM4837;
                    str8 = str8;
                    i64 = i64;
                    i49 = i49;
                    i59 = i59;
                    arrayList10 = arrayList10;
                    i57 = i57;
                    c8416 = c8416;
                    i48 = i48;
                    i54 = i;
                    break;
                case -559484195:
                case 305418561:
                    if (C1025.f4800 < 0) {
                        i24 = i48;
                        str2 = str9;
                        i25 = i59;
                        c8413 = c8416;
                        sArr4 = sArr7;
                        i26 = i63;
                        i27 = i65;
                        i28 = i57;
                        i29 = i49;
                        arrayList4 = arrayList10;
                        str3 = str8;
                        i30 = i64;
                        i31 = iM4837;
                        i32 = i60;
                        i33 = i56;
                        hashSet2 = hashSet3;
                        str4 = strM18456;
                        InterfaceC17314 interfaceC17316 = interfaceC17314;
                        arrayList3 = arrayList9;
                        interfaceC17314M8257 = interfaceC17316;
                        int iM450222 = C19806.m45029("ۗۘ") ^ i53;
                        str5 = str2;
                        i54 = ((iM450222 ^ i52) * 15043) ^ 2110581880;
                        i55 = iM450222 ^ (-1052925738);
                        i60 = i32;
                        sArr7 = sArr4;
                        i65 = i27;
                        str9 = str5;
                        i64 = i30;
                        i63 = i26;
                        arrayList10 = arrayList4;
                        strM18456 = str4;
                        i57 = i28;
                        hashSet3 = hashSet2;
                        c8416 = c8413;
                        i56 = i33;
                        i48 = i24;
                        iM4837 = i31;
                        str8 = str3;
                        i49 = i29;
                        i59 = i25;
                        ArrayList arrayList13 = arrayList3;
                        interfaceC17314 = interfaceC17314M8257;
                        arrayList9 = arrayList13;
                    } else {
                        hashSet3 = hashSet3;
                        i48 = i48;
                        interfaceC17314 = interfaceC17314;
                        strM18456 = strM18456;
                        i59 = i59;
                        c8416 = c8416;
                        sArr6 = sArr6;
                        sArr2 = sArr7;
                        i63 = i63;
                        i57 = i57;
                        str9 = str9;
                        i49 = i49;
                        arrayList10 = arrayList10;
                        i14 = i65;
                        str8 = str8;
                        i64 = i64;
                        iM4837 = iM4837;
                        i15 = i60;
                        i16 = i61;
                        i56 = i56;
                        int iM4502110 = (i53 - C19806.m45029("ۖ֨")) * (-77);
                        i55 = iM4502110 ^ (-1242615601);
                        i54 = ((iM4502110 ^ i52) * (-14371)) ^ (-2059582709);
                        i61 = i16;
                        i60 = i15;
                        sArr7 = sArr2;
                        i65 = i14;
                        str9 = str9;
                        i56 = i56;
                        i64 = i64;
                        i63 = i63;
                        interfaceC17314 = interfaceC17314;
                        sArr6 = sArr6;
                        c11359 = this;
                        iM4837 = iM4837;
                        arrayList10 = arrayList10;
                        strM18456 = strM18456;
                        str8 = str8;
                        i49 = i49;
                        i57 = i57;
                        i59 = i59;
                        hashSet3 = hashSet3;
                        c8416 = c8416;
                        i48 = i48;
                    }
                    break;
                case -545297696:
                case 258149364:
                    C3743.m10966();
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 > 0) {
                        c8415 = c8416;
                        int i83 = i49;
                        str7 = str8;
                        i42 = i59;
                        i43 = i83;
                        iM450211 = (C19806.m45029("ᩴۛ") + i52) * (-39);
                        i44 = ((iM450211 ^ i53) * (-7207)) ^ 1644232475;
                        i45 = -75040745;
                        i55 = iM450211 ^ i45;
                        i54 = i44;
                        i57 = i57;
                        c8416 = c8415;
                        int i84 = i43;
                        i59 = i42;
                        str8 = str7;
                        i49 = i84;
                    } else {
                        iM113012 = (C19806.m45029("۠֫") ^ i52) * (-115);
                        i = ((iM113012 ^ i53) * (-31539)) ^ 797978055;
                        i47 = 1280576414;
                        i55 = iM113012 ^ i47;
                        i54 = i;
                    }
                    break;
                case -470958167:
                case 1635358756:
                    i60 = 40727;
                    int iM4502111 = C19806.m45029("᩻֡") ^ i52;
                    int i710 = ((iM4502111 ^ i53) * (-21537)) ^ (-703975714);
                    i55 = iM4502111 ^ 1229042878;
                    c11359 = this;
                    i54 = i710;
                    i61 = i61;
                    sArr7 = sArr7;
                    i65 = i65;
                    arrayList9 = arrayList9;
                    str9 = str9;
                    i56 = i56;
                    i64 = i64;
                    i63 = i63;
                    interfaceC17314 = interfaceC17314;
                    sArr6 = sArr6;
                    iM4837 = iM4837;
                    arrayList10 = arrayList10;
                    strM18456 = strM18456;
                    str8 = str8;
                    i49 = i49;
                    i57 = i57;
                    i59 = i59;
                    hashSet3 = hashSet3;
                    c8416 = c8416;
                    i48 = i48;
                    break;
                case -416654673:
                case -299264243:
                    arrayList9.set(i59, c8416);
                    break;
                case -409840939:
                case -36333864:
                    i48 = i48;
                    i59 = i59;
                    c8416 = c8416;
                    i57 = i57;
                    i49 = i49;
                    arrayList10 = arrayList10;
                    str8 = str8;
                    i64 = i64;
                    iM4837 = iM4837;
                    if (iM4837 != 0) {
                        iM45029 = (C19806.m45029("ܳۢ") + i53) * 69;
                        i = ((iM45029 ^ i52) * 11913) ^ (-2019579407);
                        i2 = -1921795475;
                        i55 = iM45029 ^ i2;
                        iM4837 = iM4837;
                        str8 = str8;
                        i64 = i64;
                        i49 = i49;
                        i59 = i59;
                        arrayList10 = arrayList10;
                        i57 = i57;
                        c8416 = c8416;
                        i48 = i48;
                        i54 = i;
                    } else {
                        iM4837 = iM4837;
                        iM11306 = ThreadFactoryC3888.m11306("᩸᩹") ^ i53;
                        i3 = ((iM11306 ^ i52) * 14895) ^ 568779222;
                        i4 = 1326403259;
                        i55 = iM11306 ^ i4;
                        str8 = str8;
                        i49 = i49;
                        i59 = i59;
                        c8412 = c8416;
                        i48 = i48;
                        i54 = i3;
                        i64 = i64;
                        arrayList10 = arrayList10;
                        i57 = i57;
                        c8416 = c8412;
                    }
                    break;
                case -89224351:
                case 1755551406:
                    i48 = i48;
                    i59 = i59;
                    c8416 = c8416;
                    i57 = i57;
                    i49 = i49;
                    arrayList10 = arrayList10;
                    str8 = str8;
                    i64 = i64;
                    iM4837 = iM4837;
                    if (RunnableC1564.m5348(itM9863)) {
                        iM45029 = (C19806.m45029("ۨۚ") + i52) * 29;
                        i = ((iM45029 ^ i53) * (-32299)) ^ (-1514679617);
                        i2 = 1592576304;
                    } else {
                        iM45029 = (C19806.m45029("۫ۘ") ^ i53) * 37;
                        i = ((iM45029 ^ i52) * (-27015)) ^ 1793358435;
                        i2 = -1736724647;
                    }
                    i55 = iM45029 ^ i2;
                    iM4837 = iM4837;
                    str8 = str8;
                    i64 = i64;
                    i49 = i49;
                    i59 = i59;
                    arrayList10 = arrayList10;
                    i57 = i57;
                    c8416 = c8416;
                    i48 = i48;
                    i54 = i;
                    break;
                case -28392339:
                case 40022822:
                    int i85 = i48;
                    c8415 = c8416;
                    i57 = i57;
                    ArrayList arrayList14 = arrayList10;
                    int i86 = i49;
                    str7 = str8;
                    i42 = i59;
                    i43 = i86;
                    if (RunnableC1564.m5348(itM9864)) {
                        int iM450223 = (C19806.m45029("۬ܿ") + i52) * 7;
                        int i87 = i64;
                        int i88 = ((iM450223 ^ i53) * 6825) ^ (-2133851918);
                        i55 = iM450223 ^ 1802252980;
                        i48 = i85;
                        i54 = i88;
                        i64 = i87;
                        arrayList10 = arrayList14;
                        i57 = i57;
                        c8416 = c8415;
                    } else {
                        int i89 = i64;
                        int iM113017 = (ThreadFactoryC3888.m11306("۟ܶ") + i53) * (-7);
                        int i90 = ((iM113017 ^ i52) * (-13065)) ^ 557455108;
                        i55 = iM113017 ^ (-1638800733);
                        i64 = i89;
                        arrayList10 = arrayList14;
                        i57 = i57;
                        c8416 = c8415;
                        i48 = i85;
                        i54 = i90;
                    }
                    int i810 = i43;
                    i59 = i42;
                    str8 = str7;
                    i49 = i810;
                    break;
                case 32511444:
                case 1243613919:
                    i34 = i48;
                    c8414 = c8416;
                    i35 = i57;
                    arrayList5 = arrayList10;
                    i36 = i64;
                    int i91 = i58;
                    int i92 = i49;
                    str6 = str8;
                    i37 = i59;
                    i38 = i92;
                    if (c11359.f21341) {
                        iM113011 = ThreadFactoryC3888.m11306("᩶ۜ") ^ i52;
                        i58 = i91;
                        i40 = ((iM113011 ^ i53) * (-16407)) ^ 311016419;
                        i41 = -17653805;
                    } else {
                        i58 = i91;
                        i39 = i56;
                        iM113011 = ThreadFactoryC3888.m11306("ۘܺ") ^ i53;
                        i36 = i39;
                        i40 = ((iM113011 ^ i52) * 28995) ^ 1002165775;
                        i41 = -43241923;
                    }
                    i55 = iM113011 ^ i41;
                    C8411 c84110 = c8414;
                    i48 = i34;
                    i54 = i40;
                    i64 = i36;
                    arrayList10 = arrayList5;
                    i57 = i35;
                    c8416 = c84110;
                    int i611 = i38;
                    i59 = i37;
                    str8 = str6;
                    i49 = i611;
                    break;
                case 156605989:
                case 1779281757:
                    i49++;
                    iM11307 = C19806.m45029("᩻ᩴ") ^ i53;
                    i = ((iM11307 ^ i52) * (-4729)) ^ (-875293080);
                    i5 = -932342630;
                    i55 = iM11307 ^ i5;
                    str8 = str8;
                    i49 = i49;
                    i54 = i;
                    break;
                case 382140277:
                case 393131677:
                    arrayList9.subList(i65, C0050.m938(arrayList9)).clear();
                    itM9863 = ViewTreeObserverOnPreDrawListenerC3327.m9863(arrayList7);
                    iM45029 = ThreadFactoryC3888.m11306("᩸ܰ") ^ i52;
                    i = ((iM45029 ^ i53) * 29423) ^ 1758997882;
                    i2 = 1052976914;
                    i55 = iM45029 ^ i2;
                    iM4837 = iM4837;
                    str8 = str8;
                    i64 = i64;
                    i49 = i49;
                    i59 = i59;
                    arrayList10 = arrayList10;
                    i57 = i57;
                    c8416 = c8416;
                    i48 = i48;
                    i54 = i;
                    break;
                case 463360996:
                case 925826112:
                    i46 = i49;
                    if (C0962.m3748(itM10563)) {
                        int iM113018 = ThreadFactoryC3888.m11306("ܳܿ") ^ i52;
                        i55 = iM113018 ^ 625009370;
                        i49 = i46;
                        i54 = ((iM113018 ^ i53) * 22595) ^ (-1170801725);
                        str8 = str8;
                    } else {
                        i48 = i48;
                        i59 = i59;
                        c8416 = c8416;
                        i49 = i46;
                        i57 = i57;
                        arrayList10 = arrayList10;
                        i64 = i64;
                        i20 = i65;
                        i21 = i61;
                        iM113010 = C19806.m45029("ܳۖ") ^ i52;
                        sArr3 = sArr6;
                        i22 = ((iM113010 ^ i53) * (-6251)) ^ 1750711274;
                        i23 = -728173001;
                        i55 = iM113010 ^ i23;
                        i54 = i22;
                        i61 = i21;
                        i60 = i60;
                        sArr7 = sArr7;
                        i65 = i20;
                        arrayList9 = arrayList9;
                        str9 = str9;
                        i64 = i64;
                        i63 = i63;
                        interfaceC17314 = interfaceC17314;
                        sArr6 = sArr3;
                        arrayList10 = arrayList10;
                        strM18456 = strM18456;
                        i57 = i57;
                        hashSet3 = hashSet3;
                        c8416 = c8416;
                        i56 = i56;
                        i48 = i48;
                        iM4837 = iM4837;
                        str8 = str8;
                        i49 = i49;
                        i59 = i59;
                    }
                    break;
                case 522257468:
                case 1309799769:
                    hashSet3 = hashSet3;
                    i48 = i48;
                    interfaceC17314 = interfaceC17314;
                    strM18456 = strM18456;
                    i59 = i59;
                    c8416 = c8416;
                    sArr6 = sArr6;
                    sArr2 = sArr7;
                    i63 = i63;
                    i57 = i57;
                    str9 = str9;
                    i49 = i49;
                    arrayList10 = arrayList10;
                    i14 = i65;
                    str8 = str8;
                    i64 = i64;
                    iM4837 = iM4837;
                    i15 = i60;
                    i16 = i61;
                    i56 = i56;
                    C3470 c3470M28440 = m28440();
                    arrayList9 = c11359.f21338;
                    iM939 = C0050.m938(arrayList9);
                    arrayList6 = c3470M28440.f12743;
                    if (!RunnableC1564.f6300) {
                        int iM113019 = (ThreadFactoryC3888.m11306("ᩳ᩻") ^ i53) * (-23);
                        int i93 = ((iM113019 ^ i52) * (-30931)) ^ (-543441639);
                        i55 = iM113019 ^ (-1552770598);
                        c11359 = this;
                        i54 = i93;
                        i61 = i16;
                        i60 = i15;
                        sArr7 = sArr2;
                        i65 = i14;
                        str9 = str9;
                        i56 = i56;
                        i64 = i64;
                        i63 = i63;
                        interfaceC17314 = interfaceC17314;
                        sArr6 = sArr6;
                        iM4837 = iM4837;
                        arrayList10 = arrayList10;
                        strM18456 = strM18456;
                        str8 = str8;
                        i49 = i49;
                        i57 = i57;
                        i59 = i59;
                        hashSet3 = hashSet3;
                        c8416 = c8416;
                        i48 = i48;
                    }
                    int iM4502112 = (i53 - C19806.m45029("ۖ֨")) * (-77);
                    i55 = iM4502112 ^ (-1242615601);
                    i54 = ((iM4502112 ^ i52) * (-14371)) ^ (-2059582709);
                    i61 = i16;
                    i60 = i15;
                    sArr7 = sArr2;
                    i65 = i14;
                    str9 = str9;
                    i56 = i56;
                    i64 = i64;
                    i63 = i63;
                    interfaceC17314 = interfaceC17314;
                    sArr6 = sArr6;
                    c11359 = this;
                    iM4837 = iM4837;
                    arrayList10 = arrayList10;
                    strM18456 = strM18456;
                    str8 = str8;
                    i49 = i49;
                    i57 = i57;
                    i59 = i59;
                    hashSet3 = hashSet3;
                    c8416 = c8416;
                    i48 = i48;
                    break;
                case 543703825:
                case 936567893:
                    i49 = i49;
                    str8 = str8;
                    iM6682 = C2124.m6682((Integer) C0278.m1776(itM9864));
                    arrayList9.remove(i65 + iM6682);
                    if (!c11359.f21341) {
                        i49 = i49;
                        arrayList10 = arrayList10;
                        iM11306 = (C19806.m45029("ۧ᩹") + i52) * 53;
                        i3 = ((iM11306 ^ i53) * 11501) ^ (-309637154);
                        i4 = -525342392;
                        i55 = iM11306 ^ i4;
                        str8 = str8;
                        i49 = i49;
                        i59 = i59;
                        c8412 = c8416;
                        i48 = i48;
                        i54 = i3;
                        i64 = i64;
                        arrayList10 = arrayList10;
                        i57 = i57;
                        c8416 = c8412;
                    } else {
                        iM11307 = (i52 - ThreadFactoryC3888.m11306("᩶ۨ")) * (-81);
                        i = ((iM11307 ^ i53) * 17897) ^ 1429016437;
                        i5 = 1771158733;
                        i55 = iM11307 ^ i5;
                        str8 = str8;
                        i49 = i49;
                        i54 = i;
                    }
                    break;
                case 544890461:
                case 1444812130:
                    hashSet = hashSet3;
                    zRemove = C0671.m3018(hashSet, str);
                    z2 = zRemove;
                    iM11309 = ThreadFactoryC3888.m11306("ۚ᩸") ^ i53;
                    hashSet3 = hashSet;
                    i13 = ((iM11309 ^ i52) * 31859) ^ (-112155739);
                    i19 = -1880056399;
                    i55 = iM11309 ^ i19;
                    i54 = i13;
                    i61 = i61;
                    i60 = i60;
                    sArr7 = sArr7;
                    i65 = i65;
                    arrayList9 = arrayList9;
                    str9 = str9;
                    i56 = i56;
                    i64 = i64;
                    i63 = i63;
                    interfaceC17314 = interfaceC17314;
                    sArr6 = sArr6;
                    iM4837 = iM4837;
                    arrayList10 = arrayList10;
                    strM18456 = strM18456;
                    str8 = str8;
                    i49 = i49;
                    i57 = i57;
                    i59 = i59;
                    hashSet3 = hashSet3;
                    c8416 = c8416;
                    i48 = i48;
                    break;
                case 670278407:
                case 1810229879:
                    arrayList3 = arrayList9;
                    i24 = i48;
                    str2 = str9;
                    i25 = i59;
                    c8413 = c8416;
                    sArr4 = sArr7;
                    i26 = i63;
                    i27 = i65;
                    i28 = i57;
                    i29 = i49;
                    arrayList4 = arrayList10;
                    str3 = str8;
                    i30 = i64;
                    i31 = iM4837;
                    i32 = i60;
                    i33 = i56;
                    hashSet2 = hashSet3;
                    str4 = strM18456;
                    interfaceC17314M8257 = C2704.m8257(ApplicationC0716.f2992);
                    sArr6 = f38316;
                    i61 = 400;
                    if (C0216.f1393 != 0) {
                        int iM450224 = C19806.m45029("ۗۘ") ^ i53;
                        str5 = str2;
                        i54 = ((iM450224 ^ i52) * 15043) ^ 2110581880;
                        i55 = iM450224 ^ (-1052925738);
                    } else {
                        str5 = str2;
                        int iM450225 = (i53 - C19806.m45029("ܰ֡")) * (-41);
                        i55 = iM450225 ^ (-935531044);
                        i54 = ((iM450225 ^ i52) * (-5945)) ^ (-431811608);
                    }
                    i60 = i32;
                    sArr7 = sArr4;
                    i65 = i27;
                    str9 = str5;
                    i64 = i30;
                    i63 = i26;
                    arrayList10 = arrayList4;
                    strM18456 = str4;
                    i57 = i28;
                    hashSet3 = hashSet2;
                    c8416 = c8413;
                    i56 = i33;
                    i48 = i24;
                    iM4837 = i31;
                    str8 = str3;
                    i49 = i29;
                    i59 = i25;
                    ArrayList arrayList15 = arrayList3;
                    interfaceC17314 = interfaceC17314M8257;
                    arrayList9 = arrayList15;
                    break;
                case 867521234:
                case 985117033:
                    i48 = i48;
                    i59 = i59;
                    c8416 = c8416;
                    i57 = i57;
                    i49 = i49;
                    arrayList10 = arrayList10;
                    str8 = str8;
                    i64 = i64;
                    if (C1461.m5078(arrayList7, C1419.m4967(arrayList6, i48))) {
                        iM11306 = ThreadFactoryC3888.m11306("۟᩹") ^ i53;
                        i3 = ((iM11306 ^ i52) * (-16097)) ^ (-1614007503);
                        i4 = -1749046300;
                    } else {
                        iM11306 = (C19806.m45029("ۛۜ") + i53) * (-109);
                        i3 = ((iM11306 ^ i52) * 4255) ^ 1807859931;
                        i4 = -1477223643;
                    }
                    i55 = iM11306 ^ i4;
                    str8 = str8;
                    i49 = i49;
                    i59 = i59;
                    c8412 = c8416;
                    i48 = i48;
                    i54 = i3;
                    i64 = i64;
                    arrayList10 = arrayList10;
                    i57 = i57;
                    c8416 = c8412;
                    break;
                case 910108535:
                case 1128091763:
                    int i94 = i49;
                    c8415 = c8416;
                    str7 = str8;
                    i42 = i59;
                    C3660.m10788(arrayList9, c8415);
                    i43 = i94;
                    c12665.notifyItemInserted(iM31486 + 2);
                    if (C3535.f13026 <= 0) {
                        iM450211 = (C19806.m45029("ᩴۛ") + i52) * (-39);
                        i44 = ((iM450211 ^ i53) * (-7207)) ^ 1644232475;
                        i45 = -75040745;
                    } else {
                        iM450211 = C19806.m45029("᩷᩻") ^ i52;
                        i44 = ((iM450211 ^ i53) * 25545) ^ 318452990;
                        i45 = 26924602;
                    }
                    i55 = iM450211 ^ i45;
                    i54 = i44;
                    i57 = i57;
                    c8416 = c8415;
                    int i811 = i43;
                    i59 = i42;
                    str8 = str7;
                    i49 = i811;
                    break;
                case 1101493646:
                case 2100738205:
                    C1419.m4973();
                    if (C2704.f10408) {
                        iM113012 = (i53 - C19806.m45029("ܶܿ")) * (-93);
                        i = ((iM113012 ^ i52) * (-1907)) ^ (-421166540);
                        i47 = 1705052436;
                    } else {
                        iM113012 = (i53 - C19806.m45029("ۖۢ")) * (-73);
                        i = ((iM113012 ^ i52) * (-30069)) ^ (-1009592878);
                        i47 = -2144487184;
                    }
                    i55 = iM113012 ^ i47;
                    i54 = i;
                    break;
                case 1114529480:
                case 1605035491:
                    i48 = i48;
                    i49 = i49;
                    c8416 = c8416;
                    str8 = str8;
                    i57 = i57;
                    iM4837 = iM4837;
                    arrayList10 = arrayList10;
                    i64 = i64;
                    if (iM939 != i56) {
                        i59 = 0;
                        iM45029 = (i52 - ThreadFactoryC3888.m11306("ܽۖ")) * 99;
                        i = ((iM45029 ^ i53) * 26607) ^ 1238667700;
                        i2 = 91168390;
                        i55 = iM45029 ^ i2;
                        iM4837 = iM4837;
                        str8 = str8;
                        i64 = i64;
                        i49 = i49;
                        i59 = i59;
                        arrayList10 = arrayList10;
                        i57 = i57;
                        c8416 = c8416;
                        i48 = i48;
                        i54 = i;
                    } else {
                        int iM450226 = C19806.m45029("ᩴ᩵") ^ i53;
                        i3 = ((iM450226 ^ i52) * 2347) ^ (-937996937);
                        i55 = iM450226 ^ (-2032074768);
                        iM4837 = iM4837;
                        str8 = str8;
                        i49 = i49;
                        i59 = 0;
                        c8412 = c8416;
                        i48 = i48;
                        i54 = i3;
                        i64 = i64;
                        arrayList10 = arrayList10;
                        i57 = i57;
                        c8416 = c8412;
                    }
                    break;
                case 1278579453:
                case 1790769612:
                    AbstractC0464.m2313();
                    break;
                case 1833691655:
                case 1917815369:
                    i6 = i59;
                    c8411 = c8416;
                    i7 = i49;
                    arrayList = new ArrayList();
                    iM938 = C0050.m938(arrayList6) - i56;
                    int iM450227 = (C19806.m45029("᩺۫") + i53) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                    int i711 = ((iM450227 ^ i52) * (-20527)) ^ 573920997;
                    i55 = iM450227 ^ (-662481485);
                    iM4837 = iM4837;
                    str8 = str8;
                    i64 = i64;
                    i49 = i7;
                    i59 = i6;
                    arrayList10 = arrayList;
                    i54 = i711;
                    c8412 = c8411;
                    i48 = iM938;
                    i57 = i57;
                    c8416 = c8412;
                    break;
                default:
                    i48 = i48;
                    i59 = i59;
                    c8416 = c8416;
                    i57 = i57;
                    i49 = i49;
                    arrayList10 = arrayList10;
                    str8 = str8;
                    i64 = i64;
                    iM4837 = C1377.m4837(arrayList7) + i65;
                    main = c11359.f47137;
                    i56 = 1;
                    if (iM939 != 0) {
                        iM11306 = C19806.m45029("ۢܰ") ^ i53;
                        i3 = ((iM11306 ^ i52) * 13709) ^ 8771908;
                        i4 = -1074775684;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩸᩹") ^ i53;
                        i3 = ((iM11306 ^ i52) * 14895) ^ 568779222;
                        i4 = 1326403259;
                    }
                    i55 = iM11306 ^ i4;
                    str8 = str8;
                    i49 = i49;
                    i59 = i59;
                    c8412 = c8416;
                    i48 = i48;
                    i54 = i3;
                    i64 = i64;
                    arrayList10 = arrayList10;
                    i57 = i57;
                    c8416 = c8412;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x01e2 A[PHI: r5 r6 r7 r16
      0x01e2: PHI (r5v3 int) = (r5v2 int), (r5v1 int) binds: [B:52:0x01e0, B:48:0x01c0] A[DONT_GENERATE, DONT_INLINE]
      0x01e2: PHI (r6v2 int) = (r6v1 int), (r6v3 int) binds: [B:52:0x01e0, B:48:0x01c0] A[DONT_GENERATE, DONT_INLINE]
      0x01e2: PHI (r7v2 short) = (r7v1 short), (r7v3 short) binds: [B:52:0x01e0, B:48:0x01c0] A[DONT_GENERATE, DONT_INLINE]
      0x01e2: PHI (r16v12 int) = (r16v11 int), (r16v13 int) binds: [B:52:0x01e0, B:48:0x01c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x021c A[PHI: r3 r4 r10 r11 r12 r16
      0x021c: PHI (r3v3 short) = (r3v2 short), (r3v1 short), (r3v1 short), (r3v1 short) binds: [B:56:0x021a, B:36:0x013a, B:32:0x0115, B:14:0x008f] A[DONT_GENERATE, DONT_INLINE]
      0x021c: PHI (r4v3 short) = (r4v2 short), (r4v1 short), (r4v1 short), (r4v1 short) binds: [B:56:0x021a, B:36:0x013a, B:32:0x0115, B:14:0x008f] A[DONT_GENERATE, DONT_INLINE]
      0x021c: PHI (r10v3 short[]) = (r10v1 short[]), (r10v2 short[]), (r10v1 short[]), (r10v1 short[]) binds: [B:56:0x021a, B:36:0x013a, B:32:0x0115, B:14:0x008f] A[DONT_GENERATE, DONT_INLINE]
      0x021c: PHI (r11v3 int) = (r11v1 int), (r11v2 int), (r11v1 int), (r11v1 int) binds: [B:56:0x021a, B:36:0x013a, B:32:0x0115, B:14:0x008f] A[DONT_GENERATE, DONT_INLINE]
      0x021c: PHI (r12v3 int) = (r12v1 int), (r12v1 int), (r12v2 int), (r12v1 int) binds: [B:56:0x021a, B:36:0x013a, B:32:0x0115, B:14:0x008f] A[DONT_GENERATE, DONT_INLINE]
      0x021c: PHI (r16v24 int) = (r16v10 int), (r16v18 int), (r16v19 int), (r16v25 int) binds: [B:56:0x021a, B:36:0x013a, B:32:0x0115, B:14:0x008f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x0292 A[PHI: r8 r16 r17
      0x0292: PHI (r8v3 int) = (r8v1 int), (r8v1 int), (r8v2 int), (r8v1 int) binds: [B:68:0x0290, B:64:0x0271, B:44:0x019c, B:18:0x009f] A[DONT_GENERATE, DONT_INLINE]
      0x0292: PHI (r16v21 int) = (r16v7 int), (r16v8 int), (r16v14 int), (r16v22 int) binds: [B:68:0x0290, B:64:0x0271, B:44:0x019c, B:18:0x009f] A[DONT_GENERATE, DONT_INLINE]
      0x0292: PHI (r17v3 short[]) = (r17v1 short[]), (r17v2 short[]), (r17v1 short[]), (r17v1 short[]) binds: [B:68:0x0290, B:64:0x0271, B:44:0x019c, B:18:0x009f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x02c4 A[PHI: r2 r16
      0x02c4: PHI (r2v5 char) = (r2v1 char), (r2v2 char), (r2v1 char), (r2v1 char) binds: [B:72:0x02c2, B:60:0x024e, B:15:0x0093, B:10:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x02c4: PHI (r16v32 int) = (r16v6 int), (r16v9 int), (r16v26 int), (r16v35 int) binds: [B:72:0x02c2, B:60:0x024e, B:15:0x0093, B:10:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x009d, code lost:
    
        if (l.ViewTreeObserverOnPreDrawListenerC3327.m9874() == false) goto L18;
     */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private l.InterfaceC4302 m28458(java.lang.String r21) {
        /*
            Method dump skipped, instruction units count: 920
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11359.m28458(java.lang.String):l.ۙ֡᩹");
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m28441(C11359 c11359) {
        int iM11306;
        int i;
        int i2;
        int i3;
        short s;
        Main main;
        C13476 c13476;
        int iM11307;
        int i4;
        int i5;
        int iM45029;
        int i6;
        int i7;
        int iM450210;
        int i8;
        int i9;
        int iM450211;
        int i10;
        int i11;
        C11359 c113510 = c11359;
        short s2 = 0;
        int i12 = 462987873;
        int i13 = C1668.f6641;
        int i14 = C1398.f5802;
        int iM450212 = C19806.m45029("۬ۗ") ^ i13;
        int i15 = ((iM450212 ^ i14) * (-17083)) ^ 284452253;
        int i16 = iM450212 ^ 1866813340;
        Iterator itM9863 = null;
        View viewM4976 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i17 = 0;
        int i18 = 0;
        char c = 0;
        int iM11308 = 0;
        int i19 = 0;
        int i20 = 0;
        int iM11309 = 0;
        short s3 = 0;
        ArrayList arrayList = null;
        C13476 c13477 = null;
        String strM10901 = null;
        Main main2 = null;
        int i21 = 0;
        C4647 c4647 = null;
        C6293 c6293 = null;
        C17492 c17492 = null;
        View viewM10957 = null;
        View viewM10958 = null;
        while (true) {
            i12 = i16 ^ (i15 & (((i12 ^ i14) * (-4355)) >> 31));
            switch (i12) {
                case -2132912989:
                case 1840867280:
                    C8067 c8067M5356 = RunnableC1564.m5356(main2);
                    C1977.m6349(c8067M5356, viewM4976);
                    C6293.m17365(c6293, CallableC1627.m5514(c8067M5356), c4647, viewM10958);
                    break;
                case -2026981601:
                case 1172605085:
                    if (C2249.f8050 < 0) {
                        sArr2 = sArr2;
                        i3 = iM11309;
                        s = s3;
                        main = main2;
                        c13476 = c13477;
                        iM11307 = ThreadFactoryC3888.m11306("ۜ۟") ^ i14;
                        i4 = ((iM11307 ^ i13) * (-23169)) ^ (-1819702017);
                        i5 = 662179402;
                        i7 = iM11307 ^ i5;
                        s3 = s;
                        c13477 = c13476;
                        c113510 = c11359;
                        sArr2 = sArr2;
                        int i22 = i3;
                        i16 = i7;
                        i15 = i4;
                        main2 = main;
                        iM11309 = i22;
                    } else {
                        iM11306 = (C19806.m45029("ܳۡ") ^ i13) * 43;
                        i = ((iM11306 ^ i14) * 13445) ^ (-520760711);
                        i2 = 92448490;
                        i16 = iM11306 ^ i2;
                        i15 = i;
                    }
                    break;
                case -1823307659:
                case 1788162790:
                    sArr2 = sArr2;
                    i3 = iM11309;
                    Main main3 = c113510.f47137;
                    ArrayList arrayList2 = new ArrayList();
                    itM9863 = ViewTreeObserverOnPreDrawListenerC3327.m9863(m28440().f12742);
                    arrayList = arrayList2;
                    main2 = main3;
                    int iM450213 = C19806.m45029("ᩴۢ") ^ i14;
                    sArr2 = sArr2;
                    iM11309 = i3;
                    i16 = iM450213 ^ (-1889013022);
                    i15 = ((iM450213 ^ i13) * 26675) ^ (-989254107);
                    c113510 = c11359;
                    break;
                case -1722518220:
                case -989291227:
                    C1398.m4895();
                    if (C3286.m9798() > 0) {
                        sArr2 = sArr2;
                        iM11309 = iM11309;
                        main2 = main2;
                        c13477 = c13477;
                        iM45029 = (C19806.m45029("ۗ᩻") ^ i14) * q.h;
                        i15 = ((iM45029 ^ i13) * 22099) ^ 693682979;
                        i6 = -1111660079;
                        int i23 = iM45029 ^ i6;
                        c13477 = c13477;
                        main2 = main2;
                        sArr2 = sArr2;
                        iM11309 = iM11309;
                        i16 = i23;
                        c113510 = c11359;
                    } else {
                        iM11306 = (C19806.m45029("ܳۡ") ^ i13) * 43;
                        i = ((iM11306 ^ i14) * 13445) ^ (-520760711);
                        i2 = 92448490;
                        i16 = iM11306 ^ i2;
                        i15 = i;
                    }
                    break;
                case -1696063916:
                case 208527412:
                    if (C1189.f5284 > 0) {
                        sArr2 = sArr2;
                        i3 = iM11309;
                        main = main2;
                        c13477 = c13477;
                        iM450210 = C19806.m45029("ᩴ᩹") ^ i13;
                        i4 = ((iM450210 ^ i14) * 18479) ^ 2129933176;
                        i8 = 237885230;
                        i7 = iM450210 ^ i8;
                        c13477 = c13477;
                        sArr2 = sArr2;
                        int i24 = i3;
                        i16 = i7;
                        i15 = i4;
                        main2 = main;
                        iM11309 = i24;
                    } else {
                        sArr2 = sArr2;
                        iM11309 = iM11309;
                        main2 = main2;
                        c13477 = c13477;
                        iM45029 = (C19806.m45029("ۗ᩻") ^ i14) * q.h;
                        i15 = ((iM45029 ^ i13) * 22099) ^ 693682979;
                        i6 = -1111660079;
                        int i25 = iM45029 ^ i6;
                        c13477 = c13477;
                        main2 = main2;
                        sArr2 = sArr2;
                        iM11309 = iM11309;
                        i16 = i25;
                        c113510 = c11359;
                    }
                    break;
                case -1691917803:
                case -601707830:
                    c17492 = (C17492) viewM10957;
                    c6293 = new C6293(c113510, c17492, arrayList);
                    C2124.m6688(c17492, c6293);
                    if (!C19806.f63586) {
                        iM11306 = ThreadFactoryC3888.m11306("֨۬") ^ i14;
                        i = ((iM11306 ^ i13) * 3787) ^ 911629952;
                        i2 = 859936426;
                        i16 = iM11306 ^ i2;
                        i15 = i;
                    } else {
                        sArr2 = sArr2;
                        i3 = iM11309;
                        s = s3;
                        main = main2;
                        c13476 = c13477;
                        iM11307 = ThreadFactoryC3888.m11306("ۜ۟") ^ i14;
                        i4 = ((iM11307 ^ i13) * (-23169)) ^ (-1819702017);
                        i5 = 662179402;
                        i7 = iM11307 ^ i5;
                        s3 = s;
                        c13477 = c13476;
                        c113510 = c11359;
                        sArr2 = sArr2;
                        int i26 = i3;
                        i16 = i7;
                        i15 = i4;
                        main2 = main;
                        iM11309 = i26;
                    }
                    break;
                case -1667461796:
                case -1511633919:
                    sArr2 = sArr2;
                    i3 = iM11309;
                    main = main2;
                    c13477 = c13477;
                    if (C1419.m4964(arrayList)) {
                        iM450210 = ThreadFactoryC3888.m11306("ۛ᩵") ^ i13;
                        i4 = ((iM450210 ^ i14) * (-3123)) ^ (-2074666872);
                        i8 = -1822827395;
                    } else {
                        iM450210 = ThreadFactoryC3888.m11306("᩹ۘ") ^ i13;
                        i4 = ((iM450210 ^ i14) * 29325) ^ (-445600417);
                        i8 = -308716500;
                    }
                    i7 = iM450210 ^ i8;
                    c13477 = c13477;
                    sArr2 = sArr2;
                    int i27 = i3;
                    i16 = i7;
                    i15 = i4;
                    main2 = main;
                    iM11309 = i27;
                    break;
                case -1634111138:
                case 1206723478:
                    i21 = 57815;
                    iM45029 = (C19806.m45029("ۙ᩵") + i13) * (-125);
                    i15 = ((iM45029 ^ i14) * 7489) ^ (-1766206721);
                    i6 = -1680380700;
                    int i28 = iM45029 ^ i6;
                    c13477 = c13477;
                    main2 = main2;
                    sArr2 = sArr2;
                    iM11309 = iM11309;
                    i16 = i28;
                    c113510 = c11359;
                    break;
                case -1536033295:
                case -1487214800:
                    sArr2 = sArr2;
                    i3 = iM11309;
                    main = main2;
                    c13477 = c13477;
                    if (RunnableC1564.m5348(itM9863)) {
                        iM450210 = (i13 - ThreadFactoryC3888.m11306("ۢۨ")) * (-95);
                        i4 = ((iM450210 ^ i14) * (-32657)) ^ (-1540004813);
                        i8 = -606094823;
                    } else {
                        iM450210 = (i14 - C19806.m45029("ۨ᩹")) * (-101);
                        i4 = ((iM450210 ^ i13) * 27129) ^ (-1407969666);
                        i8 = -1528377243;
                    }
                    i7 = iM450210 ^ i8;
                    c13477 = c13477;
                    sArr2 = sArr2;
                    int i29 = i3;
                    i16 = i7;
                    i15 = i4;
                    main2 = main;
                    iM11309 = i29;
                    break;
                case -1435272015:
                case 408163603:
                    c4647 = new C4647(new C21816(c6293, arrayList));
                    c4647.m12825(c17492);
                    if (C1148.m4232() > 0) {
                        iM11306 = (C19806.m45029("ܺܺ") ^ i14) * (-53);
                        i = ((iM11306 ^ i13) * (-13617)) ^ 2141360819;
                        i2 = -1801123204;
                        i16 = iM11306 ^ i2;
                        i15 = i;
                    } else {
                        sArr2 = sArr2;
                        i3 = iM11309;
                        main = main2;
                        c13477 = c13477;
                        iM450210 = C19806.m45029("ᩴ᩹") ^ i13;
                        i4 = ((iM450210 ^ i14) * 18479) ^ 2129933176;
                        i8 = 237885230;
                        i7 = iM450210 ^ i8;
                        c13477 = c13477;
                        sArr2 = sArr2;
                        int i210 = i3;
                        i16 = i7;
                        i15 = i4;
                        main2 = main;
                        iM11309 = i210;
                    }
                    break;
                case -1274346412:
                case 1355133261:
                    c13477 = c13477;
                    int i30 = iM11309;
                    viewM4976 = C1419.m4976(main2, iM11308 ^ i19);
                    short[] sArr4 = f38316;
                    i20 = 377;
                    if (C2249.f8050 >= 0) {
                        i3 = i30;
                        main = main2;
                        sArr2 = sArr4;
                        iM450210 = C19806.m45029("ᩴ᩹") ^ i13;
                        i4 = ((iM450210 ^ i14) * 18479) ^ 2129933176;
                        i8 = 237885230;
                        i7 = iM450210 ^ i8;
                        c13477 = c13477;
                        sArr2 = sArr2;
                        int i211 = i3;
                        i16 = i7;
                        i15 = i4;
                        main2 = main;
                        iM11309 = i211;
                    } else {
                        int iM113010 = (ThreadFactoryC3888.m11306("ۡ۬") ^ i13) * 25;
                        i15 = ((iM113010 ^ i14) * 32343) ^ (-429058235);
                        iM11309 = i30;
                        i16 = iM113010 ^ 379719094;
                        sArr2 = sArr4;
                        c13477 = c13477;
                    }
                    break;
                case -1273936956:
                case 991771225:
                    C0962.m3746();
                    iM11306 = (C19806.m45029("ܳۡ") ^ i13) * 43;
                    i = ((iM11306 ^ i14) * 13445) ^ (-520760711);
                    i2 = 92448490;
                    i16 = iM11306 ^ i2;
                    i15 = i;
                    break;
                case -1085797848:
                case 69459480:
                    c11359.m28463();
                    break;
                case -903705057:
                case -284786176:
                    sArr2 = sArr2;
                    i3 = iM11309;
                    s = s3;
                    main = main2;
                    c13476 = c13477;
                    int i31 = s + 3185;
                    if ((s * s2) - (i31 * i31) > 0) {
                        iM11307 = (C19806.m45029("֫ۙ") ^ i14) * (-61);
                        i4 = ((iM11307 ^ i13) * 13405) ^ (-1599134565);
                        i5 = -992523945;
                    } else {
                        iM11307 = (C19806.m45029("۫ᩳ") ^ i13) * (-91);
                        i4 = ((iM11307 ^ i14) * (-8999)) ^ (-327242538);
                        i5 = 1618657829;
                    }
                    i7 = iM11307 ^ i5;
                    s3 = s;
                    c13477 = c13476;
                    c113510 = c11359;
                    sArr2 = sArr2;
                    int i212 = i3;
                    i16 = i7;
                    i15 = i4;
                    main2 = main;
                    iM11309 = i212;
                    break;
                case -616999574:
                case 2061536204:
                    sArr2 = sArr2;
                    i3 = iM11309;
                    c13477 = c13477;
                    main = main2;
                    strM10901 = C3722.m10901(f38316, 374, 3, i21);
                    if (C2642.m8171() != 0) {
                        iM450210 = C19806.m45029("ᩴ᩹") ^ i13;
                        i4 = ((iM450210 ^ i14) * 18479) ^ 2129933176;
                        i8 = 237885230;
                    } else {
                        iM450210 = ThreadFactoryC3888.m11306("ۜܿ") ^ i14;
                        i4 = ((iM450210 ^ i13) * (-15915)) ^ (-1233653491);
                        i8 = 137765699;
                    }
                    i7 = iM450210 ^ i8;
                    c13477 = c13477;
                    sArr2 = sArr2;
                    int i213 = i3;
                    i16 = i7;
                    i15 = i4;
                    main2 = main;
                    iM11309 = i213;
                    break;
                case -598946782:
                case -188062008:
                    sArr2 = sArr2;
                    c13477 = c13477;
                    int i32 = i20;
                    iM11309 = ThreadFactoryC3888.m11306(ThreadFactoryC3888.m11312(sArr2, i32, 3, i21)) ^ 2102047097;
                    if (!C19806.f63586) {
                        int iM113011 = (ThreadFactoryC3888.m11306("ܰܳ") ^ i13) * 127;
                        i20 = i32;
                        i9 = ((iM113011 ^ i14) * 7439) ^ (-1722433639);
                        i16 = iM113011 ^ 1245300873;
                        i15 = i9;
                        c13477 = c13477;
                        sArr2 = sArr2;
                    } else {
                        i20 = i32;
                        iM11309 = iM11309;
                        main2 = main2;
                        iM45029 = (C19806.m45029("ۗ᩻") ^ i14) * q.h;
                        i15 = ((iM45029 ^ i13) * 22099) ^ 693682979;
                        i6 = -1111660079;
                        int i214 = iM45029 ^ i6;
                        c13477 = c13477;
                        main2 = main2;
                        sArr2 = sArr2;
                        iM11309 = iM11309;
                        i16 = i214;
                        c113510 = c11359;
                    }
                    break;
                case -471111163:
                case 589548893:
                    sArr2 = sArr2;
                    i3 = iM11309;
                    c13477 = c13477;
                    iM11308 = ThreadFactoryC3888.m11306(strM10901);
                    i19 = 2125790187;
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 > 0) {
                        int iM113012 = ThreadFactoryC3888.m11306("ۚ۬") ^ i14;
                        i9 = ((iM113012 ^ i13) * 30075) ^ (-1583658999);
                        iM11309 = i3;
                        i16 = iM113012 ^ (-1625363717);
                        i15 = i9;
                        c13477 = c13477;
                        sArr2 = sArr2;
                    } else {
                        main = main2;
                        iM450210 = C19806.m45029("ᩴ᩹") ^ i13;
                        i4 = ((iM450210 ^ i14) * 18479) ^ 2129933176;
                        i8 = 237885230;
                        i7 = iM450210 ^ i8;
                        c13477 = c13477;
                        sArr2 = sArr2;
                        int i215 = i3;
                        i16 = i7;
                        i15 = i4;
                        main2 = main;
                        iM11309 = i215;
                    }
                    break;
                case -130056600:
                case 1393991832:
                    sArr2 = sArr2;
                    i3 = iM11309;
                    s = s3;
                    main = main2;
                    c13476 = c13477;
                    sArr = f38316;
                    c = 373;
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM11307 = ThreadFactoryC3888.m11306("ۜ۟") ^ i14;
                        i4 = ((iM11307 ^ i13) * (-23169)) ^ (-1819702017);
                        i5 = 662179402;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("۫ۚ") ^ i14;
                        i4 = ((iM11307 ^ i13) * 22307) ^ 557524203;
                        i5 = 1302060951;
                    }
                    i7 = iM11307 ^ i5;
                    s3 = s;
                    c13477 = c13476;
                    c113510 = c11359;
                    sArr2 = sArr2;
                    int i216 = i3;
                    i16 = i7;
                    i15 = i4;
                    main2 = main;
                    iM11309 = i216;
                    break;
                case 309089504:
                case 1854916207:
                    sArr2 = sArr2;
                    i3 = iM11309;
                    main = main2;
                    c13477 = (C13476) f38313.get((String) C0216.m1584(itM9863));
                    if (c13477 == null) {
                        main2 = main;
                        int iM450214 = C19806.m45029("ᩴۢ") ^ i14;
                        sArr2 = sArr2;
                        iM11309 = i3;
                        i16 = iM450214 ^ (-1889013022);
                        i15 = ((iM450214 ^ i13) * 26675) ^ (-989254107);
                        c113510 = c11359;
                    } else {
                        int iM113013 = (i14 - ThreadFactoryC3888.m11306("᩷᩻")) * (-99);
                        i4 = ((iM113013 ^ i13) * 20613) ^ (-1798810680);
                        i7 = iM113013 ^ 2142266403;
                        sArr2 = sArr2;
                        int i217 = i3;
                        i16 = i7;
                        i15 = i4;
                        main2 = main;
                        iM11309 = i217;
                    }
                    break;
                case 379197307:
                case 2131289294:
                    i21 = 51073;
                    iM45029 = (C19806.m45029("ۙ᩵") + i13) * (-125);
                    i15 = ((iM45029 ^ i14) * 7489) ^ (-1766206721);
                    i6 = -1680380700;
                    int i218 = iM45029 ^ i6;
                    c13477 = c13477;
                    main2 = main2;
                    sArr2 = sArr2;
                    iM11309 = iM11309;
                    i16 = i218;
                    c113510 = c11359;
                    break;
                case 426712908:
                case 665044342:
                    C2249.m6905(arrayList, c13477);
                    sArr2 = sArr2;
                    i3 = iM11309;
                    int iM450215 = C19806.m45029("ᩴۢ") ^ i14;
                    sArr2 = sArr2;
                    iM11309 = i3;
                    i16 = iM450215 ^ (-1889013022);
                    i15 = ((iM450215 ^ i13) * 26675) ^ (-989254107);
                    c113510 = c11359;
                    break;
                case 654770166:
                case 1962762417:
                    C0278.m1789();
                    C7105.m18985();
                    break;
                case 945779587:
                case 1873972205:
                    int i33 = iM11309;
                    viewM10958 = C3743.m10957(viewM4976, i33);
                    sArr3 = f38316;
                    i18 = 3;
                    if (RunnableC1606.f6488 >= 0) {
                        iM450211 = (C19806.m45029("ۤۤ") + i13) * (-39);
                        i10 = ((iM450211 ^ i14) * (-26603)) ^ (-2033179712);
                        i11 = -1446980390;
                    } else {
                        iM450211 = C19806.m45029("᩷ۖ") ^ i14;
                        i10 = ((iM450211 ^ i13) * (-13263)) ^ (-501497090);
                        i11 = 1584991143;
                    }
                    int i34 = iM450211 ^ i11;
                    iM11309 = i33;
                    i16 = i34;
                    i15 = i10;
                    i17 = 380;
                    break;
                case 976080617:
                case 1720596261:
                    sArr2 = sArr2;
                    iM11309 = iM11309;
                    main2 = main2;
                    c13477 = c13477;
                    s3 = sArr[c];
                    s2 = 12740;
                    if (C0526.f2219) {
                        iM45029 = (C19806.m45029("ۗ᩻") ^ i14) * q.h;
                        i15 = ((iM45029 ^ i13) * 22099) ^ 693682979;
                        i6 = -1111660079;
                    } else {
                        iM45029 = (C19806.m45029("᩵ۧ") ^ i13) * (-39);
                        i15 = ((iM45029 ^ i14) * 6607) ^ 1068347671;
                        i6 = 642951066;
                    }
                    int i219 = iM45029 ^ i6;
                    c13477 = c13477;
                    main2 = main2;
                    sArr2 = sArr2;
                    iM11309 = iM11309;
                    i16 = i219;
                    c113510 = c11359;
                    break;
                default:
                    viewM10957 = C3743.m10957(viewM4976, C19806.m45029(RunnableC1606.m5481(sArr3, i17, i18, i21)) ^ 2125362317);
                    if (MenuItemOnMenuItemClickListenerC3244.m9701() < 0) {
                        iM11306 = C19806.m45029("۫۫") ^ i13;
                        i = ((iM11306 ^ i14) * (-3695)) ^ 2124476413;
                        i2 = 207442922;
                        i16 = iM11306 ^ i2;
                        i15 = i;
                    } else {
                        sArr2 = sArr2;
                        i3 = iM11309;
                        main = main2;
                        c13477 = c13477;
                        iM450210 = C19806.m45029("ᩴ᩹") ^ i13;
                        i4 = ((iM450210 ^ i14) * 18479) ^ 2129933176;
                        i8 = 237885230;
                        i7 = iM450210 ^ i8;
                        c13477 = c13477;
                        sArr2 = sArr2;
                        int i2110 = i3;
                        i16 = i7;
                        i15 = i4;
                        main2 = main;
                        iM11309 = i2110;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00b4, code lost:
    
        if (l.C1398.f5802 > 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x009f, code lost:
    
        if (l.ThreadFactoryC3888.m11300() <= 0) goto L10;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m28452(l.AbstractActivityC12483 r31) {
        /*
            Method dump skipped, instruction units count: 1324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11359.m28452(l.۫ܶۘ):void");
    }

    /* JADX WARN: Code duplicated, block: B:62:0x022f A[PHI: r9 r11 r13
      0x022f: PHI (r9v4 int) = (r9v2 int), (r9v3 int), (r9v2 int), (r9v2 int) binds: [B:61:0x022d, B:37:0x0123, B:25:0x00ad, B:9:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x022f: PHI (r11v4 java.util.ArrayList) = (r11v2 java.util.ArrayList), (r11v3 java.util.ArrayList), (r11v2 java.util.ArrayList), (r11v2 java.util.ArrayList) binds: [B:61:0x022d, B:37:0x0123, B:25:0x00ad, B:9:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x022f: PHI (r13v5 l.۠᩶᩹) = (r13v2 l.۠᩶᩹), (r13v2 l.۠᩶᩹), (r13v4 l.۠᩶᩹), (r13v2 l.۠᩶᩹) binds: [B:61:0x022d, B:37:0x0123, B:25:0x00ad, B:9:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x025e  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28451(C11359 c11359, C14761 c14761, C14761 c14762) {
        int iM11306;
        int i;
        int i2;
        int i3 = C7105.f23796;
        int i4 = C1977.f7413;
        int iM11307 = (i4 - ThreadFactoryC3888.m11306("ۖ᩻")) * (-117);
        int i5 = ((iM11307 ^ i3) * (-25527)) ^ (-1629016706);
        C12665 c12665 = null;
        InterfaceC4302 interfaceC4302 = null;
        int i6 = iM11307 ^ 1952053169;
        int bindingAdapterPosition = 0;
        int bindingAdapterPosition2 = 0;
        int i7 = 0;
        int iM31486 = 0;
        int i8 = 0;
        ArrayList arrayList = null;
        int i9 = 1678103890;
        int iM31487 = 0;
        C8411 c8411 = null;
        Iterator itM9863 = null;
        ArrayList arrayList2 = null;
        int i10 = 0;
        while (true) {
            i9 = i6 ^ (i5 & (((i9 ^ i3) * (-19167)) >> 31));
            switch (i9) {
                case -2091549766:
                case -163543805:
                    i10 = iM31486 + i8;
                    arrayList2 = c11359.f21338;
                    if (C1066.f4915 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۤ᩻") ^ i3;
                        i = ((iM11306 ^ i4) * (-21927)) ^ 2113488072;
                        i2 = -1651144233;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۨۡ")) * 81;
                        i = ((iM11306 ^ i4) * (-24975)) ^ (-1445593557);
                        i2 = 1823053836;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1998990654:
                case -151866032:
                    i7 = iM31487 - 1;
                    if (C2871.m8646()) {
                        iM11306 = C19806.m45029("۠ۙ") ^ i3;
                        i = ((iM11306 ^ i4) * (-7445)) ^ 325339489;
                        i2 = 2133792893;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ܶ۟")) * (-69);
                        i = ((iM11306 ^ i3) * 32303) ^ 94441134;
                        i2 = 518255491;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1906461532:
                case 1062893486:
                    if (C2704.f10408) {
                        iM11306 = (C19806.m45029("ᩴۚ") + i4) * (-107);
                        i = ((iM11306 ^ i3) * 10843) ^ 1917809200;
                        i2 = -1919416130;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۤ᩻") ^ i3;
                        i = ((iM11306 ^ i4) * (-21927)) ^ 2113488072;
                        i2 = -1651144233;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1875474644:
                case -1752853774:
                    c12665 = c11359.f21343;
                    iM31487 = bindingAdapterPosition - c12665.m31486(c11359);
                    if (C0278.m1789() <= 0) {
                        iM11306 = (i3 - C19806.m45029("۫ܶ")) * 75;
                        i = ((iM11306 ^ i4) * 8359) ^ (-980053907);
                        i2 = -289856953;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶ܶ") + i4) * 27;
                        i = ((iM11306 ^ i3) * 17503) ^ 1640499535;
                        i2 = 775369134;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1787485570:
                case -31405620:
                    C2871.m8646();
                    RunnableC3388.m10064();
                    break;
                case -1684425212:
                case -923868764:
                    if (C0962.m3748(itM9863)) {
                        iM11306 = ThreadFactoryC3888.m11306("ܰۖ") ^ i3;
                        i = ((iM11306 ^ i4) * (-5737)) ^ 736507190;
                        i2 = 231974151;
                    } else {
                        iM11306 = (C19806.m45029("᩻֫") ^ i3) * (-89);
                        i = ((iM11306 ^ i4) * (-19043)) ^ (-1461458296);
                        i2 = 1342036072;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1516428821:
                case -121922146:
                    C3722.m10894();
                    C2332.m7079();
                    int iM11308 = ThreadFactoryC3888.m11306("ܺᩳ") ^ i3;
                    i6 = iM11308 ^ 876897946;
                    i5 = ((iM11308 ^ i4) * (-15205)) ^ 296052372;
                    arrayList = null;
                    break;
                case -1431328994:
                case -94808518:
                    if (C0526.f2219) {
                        iM11306 = (C19806.m45029("֫ܽ") ^ i4) * 83;
                        i = ((iM11306 ^ i3) * 1067) ^ (-1738865889);
                        i2 = 1550832863;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۤ᩻") ^ i3;
                        i = ((iM11306 ^ i4) * (-21927)) ^ 2113488072;
                        i2 = -1651144233;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1253337429:
                case 653721484:
                    iM31486 = bindingAdapterPosition2 - c12665.m31486(c11359);
                    i8 = -1;
                    if (!RunnableC1895.f7152) {
                        int iM11309 = ThreadFactoryC3888.m11306("ܺᩳ") ^ i3;
                        i6 = iM11309 ^ 876897946;
                        i5 = ((iM11309 ^ i4) * (-15205)) ^ 296052372;
                        arrayList = null;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֡᩸") ^ i4;
                        i = ((iM11306 ^ i3) * 17177) ^ 830792261;
                        i2 = -783274295;
                        i6 = iM11306 ^ i2;
                        i5 = i;
                    }
                    break;
                case -1236394803:
                case -876428387:
                    if (!RunnableC3388.m10064()) {
                        int iM113010 = ThreadFactoryC3888.m11306("ܺᩳ") ^ i3;
                        i6 = iM113010 ^ 876897946;
                        i5 = ((iM113010 ^ i4) * (-15205)) ^ 296052372;
                        arrayList = null;
                    } else {
                        iM11306 = (i3 - C19806.m45029("۫ܶ")) * 75;
                        i = ((iM11306 ^ i4) * 8359) ^ (-980053907);
                        i2 = -289856953;
                        i6 = iM11306 ^ i2;
                        i5 = i;
                    }
                    break;
                case -944302706:
                case -904640749:
                    c8411 = (C8411) ((AbstractViewOnClickListenerC10549) C0216.m1584(itM9863));
                    if (C1460.f5948 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۤ᩻") ^ i3;
                        i = ((iM11306 ^ i4) * (-21927)) ^ 2113488072;
                        i2 = -1651144233;
                    } else {
                        iM11306 = C19806.m45029("֨֫") ^ i4;
                        i = ((iM11306 ^ i3) * 28395) ^ (-1429860235);
                        i2 = 261578735;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -658483792:
                case -302514447:
                    m28460(arrayList);
                    break;
                case -142474908:
                case 1123890768:
                    if (C2642.f10294 <= 0) {
                        iM11306 = (C19806.m45029("֫ܽ") ^ i4) * 83;
                        i = ((iM11306 ^ i3) * 1067) ^ (-1738865889);
                        i2 = 1550832863;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۙ֨") ^ i3) * 37;
                        i = ((iM11306 ^ i4) * 17755) ^ 2129459494;
                        i2 = 2144477294;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -130000431:
                case 423668797:
                    C3660.m10788(arrayList, (C13476) interfaceC4302);
                    iM11306 = (i4 - ThreadFactoryC3888.m11306("ܶܺ")) * (-121);
                    i = ((iM11306 ^ i3) * 3591) ^ 654953641;
                    i2 = -215253276;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 256758671:
                case 712706592:
                    bindingAdapterPosition = c14761.getBindingAdapterPosition();
                    bindingAdapterPosition2 = c14762.getBindingAdapterPosition();
                    if (C2249.f8050 < 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܶۜ") ^ i4;
                        i = ((iM11306 ^ i3) * (-26787)) ^ 2024341159;
                        i2 = -981407472;
                        i6 = iM11306 ^ i2;
                        i5 = i;
                    } else {
                        int iM113011 = ThreadFactoryC3888.m11306("ܺᩳ") ^ i3;
                        i6 = iM113011 ^ 876897946;
                        i5 = ((iM113011 ^ i4) * (-15205)) ^ 296052372;
                        arrayList = null;
                    }
                    break;
                case 841543205:
                case 1569879912:
                    interfaceC4302 = c8411.f29159;
                    if (interfaceC4302 instanceof C13476) {
                        iM11306 = ThreadFactoryC3888.m11306("ܽۘ") ^ i4;
                        i = ((iM11306 ^ i3) * (-16749)) ^ (-1869882788);
                        i2 = 1262868098;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ܶܺ")) * (-121);
                        i = ((iM11306 ^ i3) * 3591) ^ 654953641;
                        i2 = -215253276;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 1003848460:
                case 1224545011:
                    C0526.m2429(c11359);
                    if (C1460.f5948 < 0) {
                        iM11306 = C19806.m45029("֨ܶ") ^ i3;
                        i = ((iM11306 ^ i4) * (-11415)) ^ 2045175170;
                        i2 = -534779519;
                        i6 = iM11306 ^ i2;
                        i5 = i;
                    } else {
                        int iM113012 = ThreadFactoryC3888.m11306("ܺᩳ") ^ i3;
                        i6 = iM113012 ^ 876897946;
                        i5 = ((iM113012 ^ i4) * (-15205)) ^ 296052372;
                        arrayList = null;
                    }
                    break;
                case 1475423471:
                case 2058746235:
                    if (C2477.f9839 > 0) {
                        iM11306 = (C19806.m45029("֫ܽ") ^ i4) * 83;
                        i = ((iM11306 ^ i3) * 1067) ^ (-1738865889);
                        i2 = 1550832863;
                        i6 = iM11306 ^ i2;
                        i5 = i;
                    } else {
                        int iM113013 = ThreadFactoryC3888.m11306("ܺᩳ") ^ i3;
                        i6 = iM113013 ^ 876897946;
                        i5 = ((iM113013 ^ i4) * (-15205)) ^ 296052372;
                        arrayList = null;
                    }
                    break;
                default:
                    C23520.m51798(i7, i10, arrayList2);
                    c12665.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
                    if (C1066.f4915 > 0) {
                        arrayList = new ArrayList();
                        itM9863 = ViewTreeObserverOnPreDrawListenerC3327.m9863(arrayList2);
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ܶܺ")) * (-121);
                        i = ((iM11306 ^ i3) * 3591) ^ 654953641;
                        i2 = -215253276;
                        i6 = iM11306 ^ i2;
                        i5 = i;
                    } else {
                        int iM113014 = ThreadFactoryC3888.m11306("ܺᩳ") ^ i3;
                        i6 = iM113014 ^ 876897946;
                        i5 = ((iM113014 ^ i4) * (-15205)) ^ 296052372;
                        arrayList = null;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0145  */
    /* JADX WARN: Code duplicated, block: B:52:0x01f8 A[PHI: r6 r12 r13
      0x01f8: PHI (r6v4 l.ۧܶۘ) = (r6v3 l.ۧܶۘ), (r6v2 l.ۧܶۘ) binds: [B:51:0x01f6, B:27:0x00d4] A[DONT_GENERATE, DONT_INLINE]
      0x01f8: PHI (r12v3 short[]) = (r12v2 short[]), (r12v4 short[]) binds: [B:51:0x01f6, B:27:0x00d4] A[DONT_GENERATE, DONT_INLINE]
      0x01f8: PHI (r13v3 int) = (r13v2 int), (r13v4 int) binds: [B:51:0x01f6, B:27:0x00d4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x033a A[PHI: r15 r17 r18 r23
      0x033a: PHI (r15v4 int) = (r15v2 int), (r15v3 int), (r15v2 int) binds: [B:75:0x0338, B:71:0x0314, B:15:0x009f] A[DONT_GENERATE, DONT_INLINE]
      0x033a: PHI (r17v4 short) = (r17v3 short), (r17v2 short), (r17v2 short) binds: [B:75:0x0338, B:71:0x0314, B:15:0x009f] A[DONT_GENERATE, DONT_INLINE]
      0x033a: PHI (r18v4 short) = (r18v3 short), (r18v2 short), (r18v2 short) binds: [B:75:0x0338, B:71:0x0314, B:15:0x009f] A[DONT_GENERATE, DONT_INLINE]
      0x033a: PHI (r23v5 int) = (r23v3 int), (r23v4 int), (r23v3 int) binds: [B:75:0x0338, B:71:0x0314, B:15:0x009f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x009c, code lost:
    
        if (l.C0817.f3443 != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x008d, code lost:
    
        if (l.RunnableC0195.m1431() != false) goto L10;
     */
    @Override // l.AbstractViewOnClickListenerC6314
    /* JADX INFO: renamed from: ۙ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo15483(l.AbstractViewOnLongClickListenerC22543 r25, int r26) {
        /*
            Method dump skipped, instruction units count: 1114
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11359.mo15483(l.᩹᩷᩹, int):void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m28443(String str) {
        LinkedHashMap linkedHashMap = null;
        Iterator itM7605 = null;
        C13476 c13476 = null;
        int i = -235907597;
        int i2 = C1460.f5948;
        int i3 = C7105.f23796;
        int iM11306 = (i2 - ThreadFactoryC3888.m11306("۬ۘ")) * 75;
        int i4 = ((iM11306 ^ i3) * (-29615)) ^ 1714063262;
        int i5 = -1446043969;
        while (true) {
            i = ((((i ^ i3) * 9587) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2001062258:
                case -537990913:
                    if (C2249.f8050 >= 0) {
                        iM11306 = (C19806.m45029("ۢۜ") ^ i3) * (-101);
                        i4 = ((iM11306 ^ i2) * 18229) ^ 599399865;
                        i5 = -372020710;
                    } else {
                        iM11306 = C19806.m45029("ܰۖ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 19653) ^ 69692887;
                        i5 = 477441012;
                    }
                    break;
                case -1636104534:
                case -1618464458:
                    if (C0962.m3748(itM7605)) {
                        iM11306 = (C19806.m45029("ܳۗ") + i2) * (-45);
                        i4 = ((iM11306 ^ i3) * (-23581)) ^ 1752673877;
                        i5 = 1255217594;
                    } else {
                        iM11306 = C19806.m45029("۠ۢ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 2791) ^ 1650668901;
                        i5 = 634207783;
                    }
                    break;
                case -1492005239:
                case 99682941:
                    if (C1148.f5161 > 0) {
                        iM11306 = (C19806.m45029("ۢۜ") ^ i3) * (-101);
                        i4 = ((iM11306 ^ i2) * 18229) ^ 599399865;
                        i5 = -372020710;
                    } else {
                        iM11306 = C19806.m45029("ۡܺ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 20185) ^ (-1677479358);
                        i5 = 397821797;
                    }
                    break;
                case -1454198571:
                case 1555432849:
                    if (C2477.f9839 <= 0) {
                        iM11306 = (C19806.m45029("ۢۜ") ^ i3) * (-101);
                        i4 = ((iM11306 ^ i2) * 18229) ^ 599399865;
                        i5 = -372020710;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ۛۙ")) * 87;
                        i4 = ((iM11306 ^ i3) * 22031) ^ 15552984;
                        i5 = 1555172119;
                    }
                    break;
                case -1389164044:
                case 1402990498:
                    c13476 = (C13476) C0216.m1584(itM7605);
                    if (C0671.m3008() >= 0) {
                        iM11306 = (C19806.m45029("᩵۠") ^ i2) * 27;
                        i4 = ((iM11306 ^ i3) * 9759) ^ 1428148888;
                        i5 = -134187633;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܺܳ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 21461) ^ (-1378695512);
                        i5 = -129819526;
                    }
                    break;
                case -1148071452:
                case 449678966:
                    if (C0817.f3443) {
                        iM11306 = C19806.m45029("ۛܳ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-32465)) ^ 109975883;
                        i5 = 1664499266;
                    } else {
                        iM11306 = C19806.m45029("᩻۬") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-11529)) ^ (-180103540);
                        i5 = -812227453;
                    }
                    break;
                case -813268819:
                case 126082849:
                    if (C1419.f5860 < 0) {
                        iM11306 = (C19806.m45029("᩵۠") ^ i2) * 27;
                        i4 = ((iM11306 ^ i3) * 9759) ^ 1428148888;
                        i5 = -134187633;
                    } else {
                        iM11306 = C19806.m45029("ۡܺ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 20185) ^ (-1677479358);
                        i5 = 397821797;
                    }
                    break;
                case -793907278:
                case -274090230:
                    return null;
                case -703489155:
                case 2005359569:
                    if (ViewTreeObserverOnPreDrawListenerC3327.m9874()) {
                        iM11306 = C19806.m45029("᩻۬") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-11529)) ^ (-180103540);
                        i5 = -812227453;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۛܺ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 9407) ^ (-1797826143);
                        i5 = -1044873836;
                    }
                    break;
                case -491250372:
                case 1088684405:
                    itM7605 = C2477.m7605(linkedHashMap.values());
                    iM11306 = (ThreadFactoryC3888.m11306("ۛۗ") + i3) * 85;
                    i4 = ((iM11306 ^ i2) * (-26967)) ^ (-695165147);
                    i5 = -1408159983;
                    break;
                case -207610198:
                case 1899660552:
                    C19806.m45024();
                    return null;
                case -162830240:
                case 1708324280:
                    C2788.m8472();
                    if (C1148.m4232() > 0) {
                        iM11306 = C19806.m45029("ܳܽ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 29243) ^ (-1871239547);
                        i5 = -1563902274;
                    } else {
                        iM11306 = C19806.m45029("ۡܺ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 20185) ^ (-1677479358);
                        i5 = 397821797;
                    }
                    break;
                case 69913649:
                case 957520358:
                    return C1875.m6085(c13476.f44546);
                case 199029508:
                case 799802367:
                    if (C1419.m4973()) {
                        iM11306 = (C19806.m45029("ۢۜ") ^ i3) * (-101);
                        i4 = ((iM11306 ^ i2) * 18229) ^ 599399865;
                        i5 = -372020710;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ᩴ᩵") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-14255)) ^ (-2143556414);
                        i5 = -1030982087;
                    }
                    break;
                case 404257638:
                case 2078503292:
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM11306 = C19806.m45029("ᩴ֡") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-20235)) ^ (-2126440555);
                        i5 = -930762165;
                    } else {
                        iM11306 = (C19806.m45029("ۢۜ") ^ i3) * (-101);
                        i4 = ((iM11306 ^ i2) * 18229) ^ 599399865;
                        i5 = -372020710;
                    }
                    break;
                case 475365109:
                case 479629437:
                    if (AbstractC0464.m2315(c13476.f44542, str)) {
                        iM11306 = (ThreadFactoryC3888.m11306("۫֡") ^ i3) * 69;
                        i4 = ((iM11306 ^ i2) * (-32109)) ^ 242614822;
                        i5 = -1993199508;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۛۗ") + i3) * 85;
                        i4 = ((iM11306 ^ i2) * (-26967)) ^ (-695165147);
                        i5 = -1408159983;
                    }
                    break;
                case 647609614:
                case 1912575060:
                    if (C1460.f5948 >= 0) {
                        iM11306 = C19806.m45029("ܳܽ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 29243) ^ (-1871239547);
                        i5 = -1563902274;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("᩷֫")) * (-103);
                        i4 = ((iM11306 ^ i3) * 27743) ^ (-1108287495);
                        i5 = 606399156;
                    }
                    break;
                case 1745996671:
                case 1756106235:
                    C0050.m946();
                    C0278.m1789();
                    iM11306 = C19806.m45029("ۡܺ") ^ i2;
                    i4 = ((iM11306 ^ i3) * 20185) ^ (-1677479358);
                    i5 = 397821797;
                    break;
                case 1918146654:
                case 2073514769:
                    linkedHashMap = f38313;
                    if (C0278.m1789() <= 0) {
                        iM11306 = C19806.m45029("᩻۬") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-11529)) ^ (-180103540);
                        i5 = -812227453;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳۗ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-22339)) ^ (-2133438149);
                        i5 = -19386108;
                    }
                    break;
                default:
                    if (C2477.f9839 <= 0) {
                        iM11306 = C19806.m45029("᩻۬") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-11529)) ^ (-180103540);
                        i5 = -812227453;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩷ۧ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-3311)) ^ (-288657648);
                        i5 = 112042970;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static C3470 m28440() {
        HashSet hashSet = null;
        LinkedHashMap linkedHashMap = null;
        Iterator itM7605 = null;
        C13476 c13476 = null;
        int i = 191235588;
        int i2 = C0278.f1572;
        int i3 = C2788.f10625;
        int iM45029 = C19806.m45029("ۚܽ") ^ i2;
        int i4 = ((iM45029 ^ i3) * 10501) ^ 1531142106;
        int i5 = -1355259087;
        while (true) {
            i = ((((i ^ i3) * (-139)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -1761063853:
                case -1103384544:
                    C0050.m946();
                    return null;
                case -1731692852:
                case -1373345653:
                    itM7605 = C2477.m7605(linkedHashMap.values());
                    iM45029 = (ThreadFactoryC3888.m11306("֡۠") + i3) * 109;
                    i4 = ((iM45029 ^ i2) * 16129) ^ (-2118284526);
                    i5 = 701623524;
                    break;
                case -1721719371:
                case 1279982477:
                    if (C0671.f2816 != 0) {
                        iM45029 = C19806.m45029("ۖۨ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 26745) ^ (-2143348565);
                        i5 = 1946156219;
                    } else {
                        iM45029 = C19806.m45029("ۜۜ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-20461)) ^ (-1441982280);
                        i5 = -58978380;
                    }
                    break;
                case -1511817279:
                case 429900516:
                    if (C0671.f2816 != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩷ۨ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-1259)) ^ (-316185129);
                        i5 = 1054817762;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩻ܿ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-3005)) ^ 1736866874;
                        i5 = -10562746;
                    }
                    break;
                case -1479833482:
                case 697732092:
                    if (C1460.f5948 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۢ᩻") ^ i3) * (-5);
                        i4 = ((iM45029 ^ i2) * (-13871)) ^ (-1207642102);
                        i5 = -1701484708;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩳۙ") ^ i3) * 115;
                        i4 = ((iM45029 ^ i2) * (-10901)) ^ (-586092726);
                        i5 = 1235055639;
                    }
                    break;
                case -1218300300:
                case -1108696868:
                    c13476 = (C13476) C0278.m1776(itM7605);
                    if (c13476.m32971()) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ᩳۢ")) * (-17);
                        i4 = ((iM45029 ^ i2) * (-28169)) ^ (-2111712087);
                        i5 = 149149143;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֡۠") + i3) * 109;
                        i4 = ((iM45029 ^ i2) * 16129) ^ (-2118284526);
                        i5 = 701623524;
                    }
                    break;
                case -1011180962:
                case -758494891:
                    C1875.m6103(hashSet, c13476.f44543);
                    iM45029 = (ThreadFactoryC3888.m11306("֡۠") + i3) * 109;
                    i4 = ((iM45029 ^ i2) * 16129) ^ (-2118284526);
                    i5 = 701623524;
                    break;
                case -721897177:
                case 544159691:
                    if (C0962.f3784) {
                        iM45029 = ThreadFactoryC3888.m11306("᩷ۨ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-1259)) ^ (-316185129);
                        i5 = 1054817762;
                    } else {
                        iM45029 = C19806.m45029("ܿۚ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 26425) ^ 298794623;
                        i5 = -834191315;
                    }
                    break;
                case -519317677:
                case 1219077704:
                    if (C3743.f13569) {
                        iM45029 = (i3 - C19806.m45029("᩵ۚ")) * (-121);
                        i4 = ((iM45029 ^ i2) * (-16017)) ^ 1269904220;
                        i5 = -1007234564;
                    } else {
                        iM45029 = C19806.m45029("ۖۨ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 26745) ^ (-2143348565);
                        i5 = 1946156219;
                    }
                    break;
                case -517874799:
                case 1221362153:
                    C1419.m4973();
                    if (C0050.f912 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩷ۨ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-1259)) ^ (-316185129);
                        i5 = 1054817762;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۤ֨") + i2) * 41;
                        i4 = ((iM45029 ^ i3) * 13043) ^ 1686004412;
                        i5 = 101259587;
                    }
                    break;
                case -496534257:
                case 2065815109:
                    if (C3577.f13150 < 0) {
                        iM45029 = C19806.m45029("ۖۨ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 26745) ^ (-2143348565);
                        i5 = 1946156219;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۤ֨") + i2) * 41;
                        i4 = ((iM45029 ^ i3) * 13043) ^ 1686004412;
                        i5 = 101259587;
                    }
                    break;
                case -469844882:
                case 1854416142:
                    C3660.m10791();
                    if (C0526.m2437() < 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۢ᩻") ^ i3) * (-5);
                        i4 = ((iM45029 ^ i2) * (-13871)) ^ (-1207642102);
                        i5 = -1701484708;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۤ֨") + i2) * 41;
                        i4 = ((iM45029 ^ i3) * 13043) ^ 1686004412;
                        i5 = 101259587;
                    }
                    break;
                case -348984219:
                case 1753310674:
                    RunnableC1895.m6170();
                    C0526.m2437();
                    iM45029 = (ThreadFactoryC3888.m11306("ۤ֨") + i2) * 41;
                    i4 = ((iM45029 ^ i3) * 13043) ^ 1686004412;
                    i5 = 101259587;
                    break;
                case -157356240:
                case 1346962215:
                    if (C7105.f23796 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩸ܽ") + i3) * (-97);
                        i4 = ((iM45029 ^ i2) * (-25145)) ^ (-1009200348);
                        i5 = -1809938176;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۟ۡ") + i2) * 31;
                        i4 = ((iM45029 ^ i3) * (-6751)) ^ 342750873;
                        i5 = -573640102;
                    }
                    break;
                case 193763212:
                case 2000599607:
                    return C3470.m10188(m28457(), hashSet, f38311);
                case 366780370:
                case 414296619:
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = C19806.m45029("ۖۨ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 26745) ^ (-2143348565);
                        i5 = 1946156219;
                    } else {
                        iM45029 = C19806.m45029("᩸ܿ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-31025)) ^ (-490802464);
                        i5 = -59024659;
                    }
                    break;
                case 417132177:
                case 1054268021:
                    if (RunnableC1564.m5348(itM7605)) {
                        iM45029 = (i2 - C19806.m45029("ܽ᩻")) * 87;
                        i4 = ((iM45029 ^ i3) * (-22709)) ^ (-669631557);
                        i5 = -1266757381;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩹ۘ") ^ i2) * (-119);
                        i4 = ((iM45029 ^ i3) * (-29903)) ^ 1427238677;
                        i5 = 969365231;
                    }
                    break;
                case 464080256:
                case 895607557:
                    linkedHashMap = f38313;
                    if (C7105.f23796 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩸ܽ") + i3) * (-97);
                        i4 = ((iM45029 ^ i2) * (-25145)) ^ (-1009200348);
                        i5 = -1809938176;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۡۛ") + i2) * 115;
                        i4 = ((iM45029 ^ i3) * (-1799)) ^ 743061946;
                        i5 = -1542385601;
                    }
                    break;
                case 716375476:
                case 1941409905:
                    if (C1937.f7317 >= 0) {
                        iM45029 = C19806.m45029("ۖۨ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 26745) ^ (-2143348565);
                        i5 = 1946156219;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩵᩷") ^ i2;
                        i4 = ((iM45029 ^ i3) * 8537) ^ (-1608467102);
                        i5 = 145281559;
                    }
                    break;
                default:
                    hashSet = new HashSet();
                    if (C3660.m10791() != 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۢ᩻") ^ i3) * (-5);
                        i4 = ((iM45029 ^ i2) * (-13871)) ^ (-1207642102);
                        i5 = -1701484708;
                    } else {
                        iM45029 = C19806.m45029("ۜ᩹") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-18411)) ^ (-690908871);
                        i5 = 82325150;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0186 A[PHI: r11
      0x0186: PHI (r11v4 java.lang.String) = (r11v3 java.lang.String), (r11v2 java.lang.String), (r11v2 java.lang.String) binds: [B:37:0x016e, B:29:0x0114, B:23:0x00e5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:90:0x0480 A[PHI: r0 r3 r16 r22 r23 r24 r25 r29
      0x0480: PHI (r0v37 short) = (r0v8 short), (r0v9 short), (r0v38 short) binds: [B:89:0x047e, B:85:0x0455, B:10:0x0092] A[DONT_GENERATE, DONT_INLINE]
      0x0480: PHI (r3v23 java.lang.String) = (r3v6 java.lang.String), (r3v7 java.lang.String), (r3v24 java.lang.String) binds: [B:89:0x047e, B:85:0x0455, B:10:0x0092] A[DONT_GENERATE, DONT_INLINE]
      0x0480: PHI (r16v6 int) = (r16v2 int), (r16v3 int), (r16v2 int) binds: [B:89:0x047e, B:85:0x0455, B:10:0x0092] A[DONT_GENERATE, DONT_INLINE]
      0x0480: PHI (r22v16 int) = (r22v6 int), (r22v7 int), (r22v17 int) binds: [B:89:0x047e, B:85:0x0455, B:10:0x0092] A[DONT_GENERATE, DONT_INLINE]
      0x0480: PHI (r23v21 l.ۛۧ᩺) = (r23v6 l.ۛۧ᩺), (r23v7 l.ۛۧ᩺), (r23v22 l.ۛۧ᩺) binds: [B:89:0x047e, B:85:0x0455, B:10:0x0092] A[DONT_GENERATE, DONT_INLINE]
      0x0480: PHI (r24v25 java.util.ArrayList) = (r24v6 java.util.ArrayList), (r24v7 java.util.ArrayList), (r24v26 java.util.ArrayList) binds: [B:89:0x047e, B:85:0x0455, B:10:0x0092] A[DONT_GENERATE, DONT_INLINE]
      0x0480: PHI (r25v28 int) = (r25v6 int), (r25v7 int), (r25v29 int) binds: [B:89:0x047e, B:85:0x0455, B:10:0x0092] A[DONT_GENERATE, DONT_INLINE]
      0x0480: PHI (r29v26 short[]) = (r29v5 short[]), (r29v6 short[]), (r29v27 short[]) binds: [B:89:0x047e, B:85:0x0455, B:10:0x0092] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0092, code lost:
    
        r0 = r22;
        r29 = r23;
        r23 = r25;
        r3 = r30;
        r22 = r2;
        r25 = r24;
        r24 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00d1, code lost:
    
        if (l.C0797.f3386 != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0090, code lost:
    
        if (l.C1398.m4895() > 0) goto L10;
     */
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList m28457() {
        /*
            Method dump skipped, instruction units count: 1514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11359.m28457():java.util.ArrayList");
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static void m28455() {
        m28461();
        m28442();
    }

    /* JADX WARN: Code duplicated, block: B:64:0x026d A[PHI: r1 r2 r21 r22
      0x026d: PHI (r1v4 java.util.HashSet) = (r1v2 java.util.HashSet), (r1v3 java.util.HashSet), (r1v2 java.util.HashSet) binds: [B:63:0x026b, B:48:0x01d5, B:9:0x008e] A[DONT_GENERATE, DONT_INLINE]
      0x026d: PHI (r2v4 l.ۛۧ᩺) = (r2v2 l.ۛۧ᩺), (r2v3 l.ۛۧ᩺), (r2v2 l.ۛۧ᩺) binds: [B:63:0x026b, B:48:0x01d5, B:9:0x008e] A[DONT_GENERATE, DONT_INLINE]
      0x026d: PHI (r21v4 int) = (r21v3 int), (r21v2 int), (r21v2 int) binds: [B:63:0x026b, B:48:0x01d5, B:9:0x008e] A[DONT_GENERATE, DONT_INLINE]
      0x026d: PHI (r22v4 int) = (r22v3 int), (r22v2 int), (r22v2 int) binds: [B:63:0x026b, B:48:0x01d5, B:9:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x02a5 A[PHI: r14 r15 r27
      0x02a5: PHI (r14v3 int) = (r14v2 int), (r14v4 int) binds: [B:67:0x02a3, B:32:0x012f] A[DONT_GENERATE, DONT_INLINE]
      0x02a5: PHI (r15v3 int) = (r15v2 int), (r15v4 int) binds: [B:67:0x02a3, B:32:0x012f] A[DONT_GENERATE, DONT_INLINE]
      0x02a5: PHI (r27v5 int) = (r27v4 int), (r27v3 int) binds: [B:67:0x02a3, B:32:0x012f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x02db A[PHI: r19
      0x02db: PHI (r19v4 short) = (r19v3 short), (r19v2 short), (r19v2 short), (r19v2 short) binds: [B:71:0x02d9, B:17:0x00a1, B:15:0x009d, B:9:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x0312 A[PHI: r16 r20
      0x0312: PHI (r16v4 int) = (r16v2 int), (r16v3 int), (r16v2 int), (r16v2 int) binds: [B:75:0x0310, B:59:0x024a, B:15:0x009d, B:12:0x0094] A[DONT_GENERATE, DONT_INLINE]
      0x0312: PHI (r20v4 short) = (r20v3 short), (r20v2 short), (r20v2 short), (r20v2 short) binds: [B:75:0x0310, B:59:0x024a, B:15:0x009d, B:12:0x0094] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:80:0x0348 A[PHI: r3 r10 r11 r12 r17 r18
      0x0348: PHI (r3v4 java.util.HashSet) = (r3v2 java.util.HashSet), (r3v2 java.util.HashSet), (r3v3 java.util.HashSet), (r3v2 java.util.HashSet) binds: [B:79:0x0346, B:44:0x01b0, B:36:0x0152, B:12:0x0094] A[DONT_GENERATE, DONT_INLINE]
      0x0348: PHI (r10v4 short[]) = (r10v2 short[]), (r10v3 short[]), (r10v2 short[]), (r10v2 short[]) binds: [B:79:0x0346, B:44:0x01b0, B:36:0x0152, B:12:0x0094] A[DONT_GENERATE, DONT_INLINE]
      0x0348: PHI (r11v4 short[]) = (r11v2 short[]), (r11v2 short[]), (r11v3 short[]), (r11v2 short[]) binds: [B:79:0x0346, B:44:0x01b0, B:36:0x0152, B:12:0x0094] A[DONT_GENERATE, DONT_INLINE]
      0x0348: PHI (r12v4 int) = (r12v2 int), (r12v3 int), (r12v2 int), (r12v2 int) binds: [B:79:0x0346, B:44:0x01b0, B:36:0x0152, B:12:0x0094] A[DONT_GENERATE, DONT_INLINE]
      0x0348: PHI (r17v4 short[]) = (r17v3 short[]), (r17v2 short[]), (r17v2 short[]), (r17v2 short[]) binds: [B:79:0x0346, B:44:0x01b0, B:36:0x0152, B:12:0x0094] A[DONT_GENERATE, DONT_INLINE]
      0x0348: PHI (r18v4 char) = (r18v3 char), (r18v2 char), (r18v2 char), (r18v2 char) binds: [B:79:0x0346, B:44:0x01b0, B:36:0x0152, B:12:0x0094] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static void m28461() {
        int iM11306;
        int i;
        int i2;
        String strM1433;
        int i3 = C1977.f7413;
        int i4 = ViewTreeObserverOnPreDrawListenerC3327.f12317;
        int iM45029 = (i4 - C19806.m45029("ۚۧ")) * (-109);
        int i5 = ((iM45029 ^ i3) * 14137) ^ (-1335360362);
        String[] strArr = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM45029 ^ (-179338792);
        int length = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = -295840281;
        int i15 = 0;
        String str = null;
        short[] sArr3 = null;
        HashSet hashSet = null;
        String str2 = null;
        int i16 = 0;
        InterfaceC6025 interfaceC6025 = null;
        HashSet hashSet2 = null;
        while (true) {
            i14 = i6 ^ (i5 & (((i14 ^ i3) * 1769) >> 31));
            switch (i14) {
                case -1980382621:
                case -1570415233:
                    String[] strArrM5056 = C1460.m5056(str, C2642.m8172(sArr2, i9, i10, i7));
                    length = strArrM5056.length;
                    i16 = 0;
                    strArr = strArrM5056;
                    iM11306 = C19806.m45029("ۗۘ") ^ i3;
                    i = ((iM11306 ^ i4) * (-26893)) ^ (-1172123775);
                    i2 = 503786289;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1927539866:
                case -1015630590:
                    if ((i11 + i11) - i15 >= 0) {
                        iM11306 = C19806.m45029("ܳ᩻") ^ i3;
                        i = ((iM11306 ^ i4) * (-27271)) ^ (-2058577299);
                        i2 = -2051248801;
                    } else {
                        iM11306 = (C19806.m45029("۫ᩴ") ^ i4) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM11306 ^ i3) * 30737) ^ (-723535249);
                        i2 = -591586693;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1913581622:
                case 412935249:
                    RunnableC3388.m10064();
                    if (RunnableC0195.f1321 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܳᩴ") ^ i3) * 97;
                        i = ((iM11306 ^ i4) * (-30889)) ^ (-171307749);
                        i2 = -1427978870;
                    } else {
                        iM11306 = (C19806.m45029("֫۟") ^ i4) * 41;
                        i = ((iM11306 ^ i3) * 20015) ^ (-1669974270);
                        i2 = -361468254;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1824940734:
                case 1675923673:
                    strM1433 = RunnableC0195.m1433(interfaceC6025, C1460.m5047(sArr, i8, 12, i7), null);
                    if (strM1433 == null) {
                        iM11306 = ThreadFactoryC3888.m11306("ۤ᩶") ^ i4;
                        i = ((iM11306 ^ i3) * (-24435)) ^ (-1463417197);
                        i2 = 965508684;
                    } else {
                        str = strM1433;
                        iM11306 = (C19806.m45029("ۧۤ") ^ i3) * 79;
                        i = ((iM11306 ^ i4) * (-23245)) ^ (-1208980924);
                        i2 = 375757819;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1819813564:
                case 1357380838:
                    int i17 = s2 + s;
                    i15 = i17 * i17;
                    if (C2332.m7079() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳܰ") ^ i4;
                        i = ((iM11306 ^ i3) * (-14271)) ^ (-1015427865);
                        i2 = -1487937797;
                    } else {
                        iM11306 = (C19806.m45029("᩷ܽ") ^ i3) * (-109);
                        i = ((iM11306 ^ i4) * (-15743)) ^ (-840343997);
                        i2 = -1538289130;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1770005540:
                case -1714948349:
                    i9 = 516;
                    i10 = 2;
                    if (C0962.f3784) {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳܰ") ^ i4;
                        i = ((iM11306 ^ i3) * (-14271)) ^ (-1015427865);
                        i2 = -1487937797;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩵ۙ") ^ i3;
                        i = ((iM11306 ^ i4) * (-28389)) ^ (-623996643);
                        i2 = -604805917;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1610765421:
                case 1887673120:
                    s = 13793;
                    if (ViewTreeObserverOnPreDrawListenerC3327.m9874()) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܳᩴ") ^ i3) * 97;
                        i = ((iM11306 ^ i4) * (-30889)) ^ (-171307749);
                        i2 = -1427978870;
                    } else {
                        iM11306 = (i4 - C19806.m45029("ᩳ᩹")) * (-73);
                        i = ((iM11306 ^ i3) * (-10611)) ^ (-1989348671);
                        i2 = 1260863693;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1308950066:
                case 985261972:
                    i16++;
                    iM11306 = C19806.m45029("ۗۘ") ^ i3;
                    i = ((iM11306 ^ i4) * (-26893)) ^ (-1172123775);
                    i2 = 503786289;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1274559514:
                case -970650399:
                    s2 = sArr3[c];
                    if (C1066.m4023() <= 0) {
                        iM11306 = (C19806.m45029("֫۟") ^ i4) * 41;
                        i = ((iM11306 ^ i3) * 20015) ^ (-1669974270);
                        i2 = -361468254;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܽۢ") + i3) * (-27);
                        i = ((iM11306 ^ i4) * 16213) ^ 2043412613;
                        i2 = 701261293;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1220820230:
                case 947411434:
                    sArr3 = f38316;
                    c = 503;
                    if (C2704.f10408) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܶ֡") ^ i4) * 53;
                        i = ((iM11306 ^ i3) * (-17741)) ^ (-1870372589);
                        i2 = -1618891266;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۖ᩸") ^ i4;
                        i = ((iM11306 ^ i3) * 25879) ^ (-1202213352);
                        i2 = -994628549;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1218129520:
                case 1917193542:
                    i12 = s2 * s2;
                    i13 = 190246849;
                    if (C0671.f2816 != 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۘܺ") ^ i3;
                        i = ((iM11306 ^ i4) * (-5673)) ^ 653632805;
                        i2 = -1311340044;
                    } else {
                        iM11306 = (C19806.m45029("ۨ᩺") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM11306 ^ i4) * 13953) ^ (-1887938324);
                        i2 = 1389717956;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1092077681:
                case -503738514:
                    C2788.m8472();
                    break;
                case -906103463:
                case -675739277:
                    i7 = 26014;
                    iM11306 = ThreadFactoryC3888.m11306("ۤܶ") ^ i3;
                    i = ((iM11306 ^ i4) * (-13007)) ^ 1926689159;
                    i2 = 682862749;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -897406215:
                case 2058807755:
                    hashSet2 = f38311;
                    hashSet2.clear();
                    interfaceC6025 = ApplicationC0716.f2992;
                    if (C0962.f3784) {
                        iM11306 = ThreadFactoryC3888.m11306("ۘܺ") ^ i3;
                        i = ((iM11306 ^ i4) * (-5673)) ^ 653632805;
                        i2 = -1311340044;
                    } else {
                        iM11306 = (i4 - C19806.m45029("ۗ᩶")) * q.h;
                        i = ((iM11306 ^ i3) * 9419) ^ (-36743567);
                        i2 = -1661672093;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -472658158:
                case 286586484:
                    if (CallableC1627.f6528) {
                        iM11306 = (C19806.m45029("֫۟") ^ i4) * 41;
                        i = ((iM11306 ^ i3) * 20015) ^ (-1669974270);
                        i2 = -361468254;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۖ᩸") ^ i4;
                        i = ((iM11306 ^ i3) * 25879) ^ (-1202213352);
                        i2 = -994628549;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -301324171:
                case -24962792:
                    RunnableC0195.m1431();
                    if (C0671.f2816 == 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܳᩴ") ^ i3) * 97;
                        i = ((iM11306 ^ i4) * (-30889)) ^ (-171307749);
                        i2 = -1427978870;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۘܺ") ^ i3;
                        i = ((iM11306 ^ i4) * (-5673)) ^ 653632805;
                        i2 = -1311340044;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -179915580:
                case 63624297:
                    hashSet2.addAll(hashSet);
                    break;
                case 166854052:
                case 1509601676:
                    hashSet = new HashSet();
                    sArr2 = f38316;
                    if (C0050.f912 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۖ᩸") ^ i4;
                        i = ((iM11306 ^ i3) * 25879) ^ (-1202213352);
                        i2 = -994628549;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܳۨ") ^ i4) * (-125);
                        i = ((iM11306 ^ i3) * (-5603)) ^ 565367969;
                        i2 = -1585756015;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 208179734:
                case 1541999015:
                    sArr = f38316;
                    i8 = 504;
                    if (C2788.f10625 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۖ᩸") ^ i4;
                        i = ((iM11306 ^ i3) * 25879) ^ (-1202213352);
                        i2 = -994628549;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("֫۫")) * 127;
                        i = ((iM11306 ^ i3) * 8807) ^ (-1403469052);
                        i2 = 975303252;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 531867735:
                case 1275227220:
                    if (i16 < length) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۖᩴ") + i4) * (-45);
                        i = ((iM11306 ^ i3) * 7091) ^ 1535087361;
                        i2 = 1006378250;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܰᩳ") ^ i3;
                        i = ((iM11306 ^ i4) * 18101) ^ 833605833;
                        i2 = 1372565678;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 583858352:
                case 2123240657:
                    i7 = 33380;
                    iM11306 = ThreadFactoryC3888.m11306("ۤܶ") ^ i3;
                    i = ((iM11306 ^ i4) * (-13007)) ^ 1926689159;
                    i2 = 682862749;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 963301001:
                case 1295757623:
                    C0671.m3018(hashSet, str2);
                    iM11306 = ThreadFactoryC3888.m11306("ۚۜ") ^ i3;
                    i = ((iM11306 ^ i4) * (-27341)) ^ (-1199907659);
                    i2 = 1757192530;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 1055076554:
                case 1446894269:
                    C0526.m2437();
                    iM11306 = (ThreadFactoryC3888.m11306("ܳᩴ") ^ i3) * 97;
                    i = ((iM11306 ^ i4) * (-30889)) ^ (-171307749);
                    i2 = -1427978870;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 1383482142:
                case 1722608187:
                    i11 = i12 + i13;
                    if (C2332.f8260) {
                        iM11306 = ThreadFactoryC3888.m11306("ۧ᩺") ^ i4;
                        i = ((iM11306 ^ i3) * (-31037)) ^ (-998694328);
                        i2 = -1000722810;
                    } else {
                        iM11306 = (C19806.m45029("֫۟") ^ i4) * 41;
                        i = ((iM11306 ^ i3) * 20015) ^ (-1669974270);
                        i2 = -361468254;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 1882261407:
                case 1892303821:
                    strM1433 = C0671.m3009(f38316, 518, 20, i7);
                    str = strM1433;
                    iM11306 = (C19806.m45029("ۧۤ") ^ i3) * 79;
                    i = ((iM11306 ^ i4) * (-23245)) ^ (-1208980924);
                    i2 = 375757819;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                default:
                    str2 = strArr[i16];
                    if (C3660.m10786(str2)) {
                        iM11306 = ThreadFactoryC3888.m11306("ۚۜ") ^ i3;
                        i = ((iM11306 ^ i4) * (-27341)) ^ (-1199907659);
                        i2 = 1757192530;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۧۚ") ^ i4;
                        i = ((iM11306 ^ i3) * 11977) ^ (-16399782);
                        i2 = 75341943;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:83:0x0369 A[PHI: r5 r8 r16 r22 r27 r28
      0x0369: PHI (r5v4 java.util.HashSet) = (r5v2 java.util.HashSet), (r5v3 java.util.HashSet), (r5v2 java.util.HashSet) binds: [B:82:0x0367, B:56:0x023e, B:34:0x0147] A[DONT_GENERATE, DONT_INLINE]
      0x0369: PHI (r8v3 java.lang.String) = (r8v2 java.lang.String), (r8v2 java.lang.String), (r8v4 java.lang.String) binds: [B:82:0x0367, B:56:0x023e, B:34:0x0147] A[DONT_GENERATE, DONT_INLINE]
      0x0369: PHI (r16v5 short) = (r16v3 short), (r16v2 short), (r16v2 short) binds: [B:82:0x0367, B:56:0x023e, B:34:0x0147] A[DONT_GENERATE, DONT_INLINE]
      0x0369: PHI (r22v5 int) = (r22v3 int), (r22v2 int), (r22v2 int) binds: [B:82:0x0367, B:56:0x023e, B:34:0x0147] A[DONT_GENERATE, DONT_INLINE]
      0x0369: PHI (r27v6 short) = (r27v5 short), (r27v3 short), (r27v3 short) binds: [B:82:0x0367, B:56:0x023e, B:34:0x0147] A[DONT_GENERATE, DONT_INLINE]
      0x0369: PHI (r28v22 java.util.ArrayList) = (r28v8 java.util.ArrayList), (r28v21 java.util.ArrayList), (r28v1 java.util.ArrayList) binds: [B:82:0x0367, B:56:0x023e, B:34:0x0147] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0093, code lost:
    
        if (l.C1937.f7317 >= 0) goto L8;
     */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m28460(java.util.ArrayList r29) {
        /*
            Method dump skipped, instruction units count: 1182
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11359.m28460(java.util.ArrayList):void");
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static void m28442() {
        f38312.m39051((Object) null);
    }
}
