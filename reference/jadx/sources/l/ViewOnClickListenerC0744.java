package l;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import bin.mt.plus.Main;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.math.ec.rfc8032.Scalar25519;

/* JADX INFO: renamed from: l.֡᩻ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: D17I */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnClickListenerC0744 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܰۙ۬, reason: not valid java name and contains not printable characters */
    private static final short[] f3035 = {13, 1493, 7281, 4413, -5992, -3696, 5442, 2169, -9626, -11128, -10466, 5993, 6719, 6740, -11555, 4544, 1027, -12173, -3992, 6571, 6082, -5139, -4542, 6437, -472, -2200, 4013, 1768, -11290, -8442, -5220, -3172, 1581, 3379, -7384, 7388, 6992, -32434, -32439, -32435, -32446, -32444, -32429, -32392, -32427, -32446, -32392, -32428, -32440, -32430, -32427, -32444, -32446, -32392, -32437, -32434, -32439, -32446, -32434, -32439, -32435, -32446, -32444, -32429, -32392, -32437, -32440, -32448, -32392, -32447, -32440, -32427, -32438, -32442, -32429, -32434, -32439, -32435, -32446, -32444, -32429, -32392, -32437, -32440, -32448, -32392, -32425, -32442, -32429, -32433, -9423, 3880, -4502, -32434, -32439, -32435, -32446, -32444, -32429, -32392, -32447, -32434, -32437, -32429, -32446, -32427, -32392, 2675, 20034, 20037, 20033, 20046, 20040, 20063, 20084, 20056, 20040, 20035, 20046, 20038, 20046, 8791, 25456, 25463, 25459, 25468, 25466, 25453, 25414, 25461, 25462, 25470, 25414, 25449, 25464, 25453, 25457, 2248, 29234, -26256, 26523, -31288, -17471, -29478, 31611, -31011, -29015, 3563, -29242, -30407, -30749, -17306, -25476, -16471, -6443, -6446, -6442, -6439, -6433, -6456, -6429, -6448, -6445, -6437, -6429, -6438, -6445, -6450, -6447, -6435, -6456, -6425, -6424, -6411, -6415, -6407, -6431, -6500, -6425, -6401, -6416, -6403, -6417, -6417, -6431, -6474, -6511, -6526, -6425, -6415, -6407, -6424, -6412, -6413, -6408, -6431, -6508, -6425, -6416, -6413, -6401, -6403, -6424, -6411, -6413, -6414, -6431, -6507, -6474, -6425, -6418, -6407, -6417, -6423, -6416, -6424, -6431, -6474, -6511, -6511, -6511, -6511, -6511, -6511, -6511, -6511, -6511, -6511, -6511, -6511, -6511, -6511, -6511, -6511, -6511, -6511, -6511, -6511, -6474, -22349, -28739, 25831, -19078, -22490, 29495, 29991, -28239, -28162, 28557, -25814, 31465, 24984, -27374, -18026, 25546, -29901, -28422, -30957, 31918, 26743, -17131, -16601, -18969, 7172, -603, -606, -602, -599, -593, -584, -621, -598, -603, -608, -584, -599, -578, -621, 1502, 11847, 11858, 11862, 11834, 11852, 11784, 11779, 11796, 11779, 11864, 1049, -29982, -29979, -29983, -29970, -29976, -29953, -29996, -29960, -29976, -29981, -29970, -29978, -29970, 4392, -1836, 6606, 5165, -4535, -4530, -4534, -4539, -4541, -4524, -4481, -4532, -4529, -4537, -4481, -4528, -4543, -4524, -4536, 9654, -31387, -31386, -31378, -31366, -31450, -31406, -31399, -31416, -31414, -31422, -31416, -31410, -31412, -31404, -31452, -31406, -31395, -31424, -31420, -31412, -31404, -31449, -31387, -31386, -31378, -31450, -31406, -31398, -31411, -31414, -31416, -31397, -31411, -31404, 485, 3730, -13087, 3682, -13209, -7246, 1724, 7566, 3416, -16159, -13759, -1094, -1086, 6164, 17627, -21460, 23492, 16532, -22188, -20847, -10438, -10435, -10439, -10442, -10448, -10457, -10484, -10433, -10436, -10444, -10484, -10461, -10446, -10457, -10437, -21340, -32490, -17259, -22669, 16670, 21916, -31959, -18186, -24084, 22468, 22761, -22350, -18622, 17413, -16601, -24314, 23865, -21578, 9806, -84, 8675, -1171};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public TreeSet f3036;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C10948 f3037;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f3038;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C17741 f3039;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C11545 f3040;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Main f3041;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 f3042;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f3043;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C0733 f3044;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Spinner f3045;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ C11545 m3211(ViewOnClickListenerC0744 viewOnClickListenerC0744) {
        return viewOnClickListenerC0744.f3040;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ void m3220(ViewOnClickListenerC0744 viewOnClickListenerC0744, C17741 c17741) {
        viewOnClickListenerC0744.f3039 = c17741;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ AbstractC20745 m3223(ViewOnClickListenerC0744 viewOnClickListenerC0744) {
        return viewOnClickListenerC0744.f3042;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ String m3230(ViewOnClickListenerC0744 viewOnClickListenerC0744) {
        return viewOnClickListenerC0744.f3043;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x01ea A[PHI: r9 r10 r11 r18
      0x01ea: PHI (r9v4 int) = (r9v3 int), (r9v2 int) binds: [B:53:0x01e8, B:49:0x01c4] A[DONT_GENERATE, DONT_INLINE]
      0x01ea: PHI (r10v3 int) = (r10v2 int), (r10v4 int) binds: [B:53:0x01e8, B:49:0x01c4] A[DONT_GENERATE, DONT_INLINE]
      0x01ea: PHI (r11v3 short) = (r11v2 short), (r11v4 short) binds: [B:53:0x01e8, B:49:0x01c4] A[DONT_GENERATE, DONT_INLINE]
      0x01ea: PHI (r18v9 l.ܿۧ᩺) = (r18v8 l.ܿۧ᩺), (r18v10 l.ܿۧ᩺) binds: [B:53:0x01e8, B:49:0x01c4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x02aa A[PHI: r7 r8 r14 r18
      0x02aa: PHI (r7v4 short) = (r7v2 short), (r7v3 short), (r7v2 short), (r7v2 short) binds: [B:68:0x02a8, B:58:0x0226, B:34:0x010d, B:19:0x0090] A[DONT_GENERATE, DONT_INLINE]
      0x02aa: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:68:0x02a8, B:58:0x0226, B:34:0x010d, B:19:0x0090] A[DONT_GENERATE, DONT_INLINE]
      0x02aa: PHI (r14v4 int) = (r14v2 int), (r14v2 int), (r14v3 int), (r14v2 int) binds: [B:68:0x02a8, B:58:0x0226, B:34:0x010d, B:19:0x0090] A[DONT_GENERATE, DONT_INLINE]
      0x02aa: PHI (r18v25 l.ܿۧ᩺) = (r18v5 l.ܿۧ᩺), (r18v7 l.ܿۧ᩺), (r18v17 l.ܿۧ᩺), (r18v26 l.ܿۧ᩺) binds: [B:68:0x02a8, B:58:0x0226, B:34:0x010d, B:19:0x0090] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008e, code lost:
    
        if (l.RunnableC1564.m5345() == false) goto L19;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void m3217(l.ViewOnClickListenerC0744 r22, java.lang.String r23) {
        /*
            Method dump skipped, instruction units count: 878
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC0744.m3217(l.֡᩻ۨ, java.lang.String):void");
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0252 A[PHI: r1 r5 r6 r7 r12 r13 r19
      0x0252: PHI (r1v3 int) = (r1v2 int), (r1v2 int), (r1v4 int) binds: [B:61:0x0250, B:57:0x022f, B:38:0x0150] A[DONT_GENERATE, DONT_INLINE]
      0x0252: PHI (r5v4 char) = (r5v3 char), (r5v2 char), (r5v2 char) binds: [B:61:0x0250, B:57:0x022f, B:38:0x0150] A[DONT_GENERATE, DONT_INLINE]
      0x0252: PHI (r6v4 short) = (r6v2 short), (r6v3 short), (r6v2 short) binds: [B:61:0x0250, B:57:0x022f, B:38:0x0150] A[DONT_GENERATE, DONT_INLINE]
      0x0252: PHI (r7v4 short) = (r7v2 short), (r7v3 short), (r7v2 short) binds: [B:61:0x0250, B:57:0x022f, B:38:0x0150] A[DONT_GENERATE, DONT_INLINE]
      0x0252: PHI (r12v3 short[]) = (r12v2 short[]), (r12v2 short[]), (r12v4 short[]) binds: [B:61:0x0250, B:57:0x022f, B:38:0x0150] A[DONT_GENERATE, DONT_INLINE]
      0x0252: PHI (r13v3 int) = (r13v2 int), (r13v2 int), (r13v4 int) binds: [B:61:0x0250, B:57:0x022f, B:38:0x0150] A[DONT_GENERATE, DONT_INLINE]
      0x0252: PHI (r19v15 int) = (r19v7 int), (r19v8 int), (r19v16 int) binds: [B:61:0x0250, B:57:0x022f, B:38:0x0150] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x02a8 A[PHI: r2 r3 r4 r19
      0x02a8: PHI (r2v7 android.content.Intent) = 
      (r2v1 android.content.Intent)
      (r2v1 android.content.Intent)
      (r2v1 android.content.Intent)
      (r2v9 android.content.Intent)
     binds: [B:69:0x02a6, B:65:0x0286, B:11:0x0049, B:26:0x00a8] A[DONT_GENERATE, DONT_INLINE]
      0x02a8: PHI (r3v6 bin.mt.plus.Main) = (r3v2 bin.mt.plus.Main), (r3v2 bin.mt.plus.Main), (r3v2 bin.mt.plus.Main), (r3v11 bin.mt.plus.Main) binds: [B:69:0x02a6, B:65:0x0286, B:11:0x0049, B:26:0x00a8] A[DONT_GENERATE, DONT_INLINE]
      0x02a8: PHI (r4v6 short[]) = (r4v2 short[]), (r4v3 short[]), (r4v2 short[]), (r4v2 short[]) binds: [B:69:0x02a6, B:65:0x0286, B:11:0x0049, B:26:0x00a8] A[DONT_GENERATE, DONT_INLINE]
      0x02a8: PHI (r19v32 int) = (r19v5 int), (r19v6 int), (r19v25 int), (r19v34 int) binds: [B:69:0x02a6, B:65:0x0286, B:11:0x0049, B:26:0x00a8] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        int iM11306;
        int i2;
        int i3;
        int iM8650 = 0;
        Main main = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        short[] sArr2 = null;
        int i8 = 0;
        int i9 = 0;
        int i10 = -902840345;
        int i11 = RunnableC3388.f12514;
        int i12 = C1066.f4915;
        int iM11307 = ThreadFactoryC3888.m11306("ۗ᩵") ^ i12;
        int i13 = ((iM11307 ^ i11) * q.h) ^ 1713602863;
        int i14 = iM11307 ^ (-1799375856);
        while (true) {
            Intent intent = null;
            while (true) {
                i = i14 ^ ((((i10 ^ i11) * (-31271)) >> 31) & i13);
                switch (i) {
                    case -1991276321:
                    case -1938099519:
                        i = i;
                        i9 = 3;
                        if (C3660.f13403 >= 0) {
                            iM11306 = (ThreadFactoryC3888.m11306("᩹᩹") ^ i11) * 11;
                            i2 = ((iM11306 ^ i12) * 20089) ^ 204225811;
                            i3 = -449346101;
                        } else {
                            iM11306 = (i11 - C19806.m45029("֨ۘ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                            i2 = ((iM11306 ^ i12) * 28499) ^ 121246319;
                            i3 = -1285786304;
                        }
                        i14 = iM11306 ^ i3;
                        this = this;
                        int i15 = i;
                        i13 = i2;
                        i10 = i15;
                        break;
                    case -1980552359:
                    case -1951474503:
                        i = i;
                        Main main2 = this.f3041;
                        if (C1937.m6279() < 0) {
                            intent = new Intent(main2, (Class<?>) ActivityC11620.class);
                            if (C2249.m6915() <= 0) {
                                main = main2;
                                iM11306 = (i11 - ThreadFactoryC3888.m11306("֡۠")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                i2 = ((iM11306 ^ i12) * 6659) ^ (-1550923163);
                                i3 = 183682194;
                                i14 = iM11306 ^ i3;
                                this = this;
                                int i16 = i;
                                i13 = i2;
                                i10 = i16;
                            } else {
                                int iM11308 = (i11 - ThreadFactoryC3888.m11306("ۚۖ")) * 99;
                                int i17 = ((iM11308 ^ i12) * (-4957)) ^ 1754795195;
                                i14 = iM11308 ^ 1176481168;
                                main = main2;
                                i10 = i;
                                i13 = i17;
                                this = this;
                            }
                        } else {
                            main = main2;
                        }
                        break;
                    case -1958410017:
                    case 698049227:
                        i = i;
                        i6 = 225030001;
                        if (C1668.f6641 < 0) {
                            iM11306 = (i11 - ThreadFactoryC3888.m11306("᩺ۨ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                            i2 = ((iM11306 ^ i12) * 30961) ^ (-517023928);
                            i3 = -427619698;
                            i14 = iM11306 ^ i3;
                            this = this;
                            int i18 = i;
                            i13 = i2;
                            i10 = i18;
                        }
                        break;
                    case -1726296444:
                    case 22576686:
                        i7 = 3178;
                        iM11306 = (C19806.m45029("᩻᩵") ^ i11) * (-9);
                        i2 = ((iM11306 ^ i12) * (-3319)) ^ 2095939356;
                        i3 = 532017484;
                        i14 = iM11306 ^ i3;
                        this = this;
                        int i19 = i;
                        i13 = i2;
                        i10 = i19;
                        break;
                    case -1655157410:
                    case -1630101196:
                        i = i;
                        i4 = s * s2;
                        i5 = s * s;
                        if (C1025.f4800 < 0) {
                            iM11306 = (ThreadFactoryC3888.m11306("ۡᩴ") + i12) * 51;
                            i2 = ((iM11306 ^ i11) * (-16611)) ^ 2118279912;
                            i3 = -806811316;
                            i14 = iM11306 ^ i3;
                            this = this;
                            int i110 = i;
                            i13 = i2;
                            i10 = i110;
                        }
                        break;
                    case -1527886350:
                    case -1270625347:
                        if (C1148.m4232() <= 0) {
                            i = i;
                            iM11306 = (ThreadFactoryC3888.m11306("᩹᩹") ^ i11) * 11;
                            i2 = ((iM11306 ^ i12) * 20089) ^ 204225811;
                            i3 = -449346101;
                            i14 = iM11306 ^ i3;
                            this = this;
                        } else {
                            int iM45029 = C19806.m45029("᩹۬") ^ i12;
                            i = i;
                            i2 = ((iM45029 ^ i11) * (-3785)) ^ (-1677240053);
                            i14 = iM45029 ^ 544203913;
                        }
                        int i111 = i;
                        i13 = i2;
                        i10 = i111;
                        break;
                    case -1464163446:
                    case 814637025:
                        i7 = 32279;
                        iM11306 = (C19806.m45029("᩻᩵") ^ i11) * (-9);
                        i2 = ((iM11306 ^ i12) * (-3319)) ^ 2095939356;
                        i3 = 532017484;
                        i14 = iM11306 ^ i3;
                        this = this;
                        int i112 = i;
                        i13 = i2;
                        i10 = i112;
                        break;
                    case -1442075866:
                    case 1852553407:
                        i = i;
                        iM8650 = C2871.m8650(view);
                        sArr2 = f3035;
                        i8 = 411;
                        if (C1398.m4895() <= 0) {
                            iM11306 = (ThreadFactoryC3888.m11306("ۨ᩷") ^ i11) * 29;
                            i2 = ((iM11306 ^ i12) * 27141) ^ 2002540826;
                            i3 = 668481097;
                        } else {
                            iM11306 = (i12 - ThreadFactoryC3888.m11306("ᩴۤ")) * (-67);
                            i2 = ((iM11306 ^ i11) * 20843) ^ (-137439155);
                            i3 = -320641081;
                        }
                        i14 = iM11306 ^ i3;
                        this = this;
                        int i113 = i;
                        i13 = i2;
                        i10 = i113;
                        break;
                    case -1186688635:
                    case 434458779:
                        i = i;
                        if (iM8650 == (C19806.m45029(RunnableC1606.m5481(sArr2, i8, i9, i7)) ^ 2130256375)) {
                            iM11306 = (C19806.m45029("ۖܺ") + i12) * (-15);
                            i2 = ((iM11306 ^ i11) * (-2403)) ^ (-224384423);
                            i3 = -2109577269;
                        } else {
                            iM11306 = C19806.m45029("֫᩵") ^ i12;
                            i2 = ((iM11306 ^ i11) * 30861) ^ 295306062;
                            i3 = 1821462989;
                        }
                        i14 = iM11306 ^ i3;
                        this = this;
                        int i114 = i;
                        i13 = i2;
                        i10 = i114;
                        break;
                    case -1153282189:
                    case 1231810569:
                        i = i;
                        s = sArr[c];
                        s2 = 30002;
                        if (C0671.f2816 != 0) {
                            iM11306 = (ThreadFactoryC3888.m11306("ۨ᩷") ^ i11) * 29;
                            i2 = ((iM11306 ^ i12) * 27141) ^ 2002540826;
                            i3 = 668481097;
                        } else {
                            iM11306 = (i11 - C19806.m45029("ۤۡ")) * (-109);
                            i2 = ((iM11306 ^ i12) * (-17569)) ^ (-1860885742);
                            i3 = 656430034;
                        }
                        i14 = iM11306 ^ i3;
                        this = this;
                        int i115 = i;
                        i13 = i2;
                        i10 = i115;
                        break;
                    case -1042803655:
                    case -641536331:
                        RunnableC0195.m1431();
                        if (C2124.f7782 <= 0) {
                            i = i;
                            iM11306 = (i11 - ThreadFactoryC3888.m11306("֡۠")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                            i2 = ((iM11306 ^ i12) * 6659) ^ (-1550923163);
                            i3 = 183682194;
                            i14 = iM11306 ^ i3;
                            this = this;
                            int i116 = i;
                            i13 = i2;
                            i10 = i116;
                        }
                        i = i;
                        iM11306 = (ThreadFactoryC3888.m11306("᩹᩹") ^ i11) * 11;
                        i2 = ((iM11306 ^ i12) * 20089) ^ 204225811;
                        i3 = -449346101;
                        i14 = iM11306 ^ i3;
                        this = this;
                        int i117 = i;
                        i13 = i2;
                        i10 = i117;
                        break;
                    case -826110920:
                    case 1248330887:
                        i = i;
                        if ((i5 + i6) - i4 < 0) {
                            iM11306 = C19806.m45029("ܺ֫") ^ i11;
                            i2 = ((iM11306 ^ i12) * 18679) ^ 1268811530;
                            i3 = -1621595616;
                        } else {
                            iM11306 = C19806.m45029("ᩳ᩹") ^ i12;
                            i2 = ((iM11306 ^ i11) * (-13685)) ^ (-553072842);
                            i3 = -855260030;
                        }
                        i14 = iM11306 ^ i3;
                        this = this;
                        int i118 = i;
                        i13 = i2;
                        i10 = i118;
                        break;
                    case -674517512:
                    case 153989769:
                        break;
                    case -366135079:
                    case 818079209:
                        i = i;
                        c = 410;
                        if (AbstractC0464.f2088 <= 0) {
                            iM11306 = (ThreadFactoryC3888.m11306("ۨ᩷") ^ i11) * 29;
                            i2 = ((iM11306 ^ i12) * 27141) ^ 2002540826;
                            i3 = 668481097;
                        } else {
                            iM11306 = (i12 - ThreadFactoryC3888.m11306("ᩴۗ")) * 37;
                            i2 = ((iM11306 ^ i11) * 13615) ^ (-167717726);
                            i3 = 150484324;
                        }
                        i14 = iM11306 ^ i3;
                        this = this;
                        int i119 = i;
                        i13 = i2;
                        i10 = i119;
                        break;
                    case -251432192:
                    case 2110144860:
                        i = i;
                        if (C3286.m9798() <= 0) {
                            iM11306 = (i11 - ThreadFactoryC3888.m11306("֡۠")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                            i2 = ((iM11306 ^ i12) * 6659) ^ (-1550923163);
                            i3 = 183682194;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("᩹ۛ") ^ i11;
                            i2 = ((iM11306 ^ i12) * (-9415)) ^ 1845576022;
                            i3 = -187972242;
                        }
                        i14 = iM11306 ^ i3;
                        this = this;
                        int i1110 = i;
                        i13 = i2;
                        i10 = i1110;
                        break;
                    case 119798839:
                    case 1545017657:
                        i = i;
                        C1419.m4977(main, intent);
                        main.m30998(new RunnableC20501(this));
                        iM11306 = C19806.m45029("֫᩵") ^ i12;
                        i2 = ((iM11306 ^ i11) * 30861) ^ 295306062;
                        i3 = 1821462989;
                        i14 = iM11306 ^ i3;
                        this = this;
                        int i1111 = i;
                        i13 = i2;
                        i10 = i1111;
                        break;
                    case 239032913:
                    case 1171322484:
                        i = i;
                        if (!C19806.f63586) {
                        }
                        iM11306 = (ThreadFactoryC3888.m11306("᩹᩹") ^ i11) * 11;
                        i2 = ((iM11306 ^ i12) * 20089) ^ 204225811;
                        i3 = -449346101;
                        i14 = iM11306 ^ i3;
                        this = this;
                        int i1112 = i;
                        i13 = i2;
                        i10 = i1112;
                        break;
                    case 790541598:
                    case 1214425966:
                        i = i;
                        C2477.m7593();
                        C1977.m6356();
                        break;
                    case 1427624062:
                    case 1791496019:
                        i = i;
                        sArr = f3035;
                        if (C0216.f1393 != 0) {
                            iM11306 = (i11 - ThreadFactoryC3888.m11306("֡۠")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                            i2 = ((iM11306 ^ i12) * 6659) ^ (-1550923163);
                            i3 = 183682194;
                        } else {
                            iM11306 = (C19806.m45029("֡᩹") + i12) * 15;
                            i2 = ((iM11306 ^ i11) * 2817) ^ (-326867851);
                            i3 = 473893667;
                        }
                        i14 = iM11306 ^ i3;
                        this = this;
                        int i1113 = i;
                        i13 = i2;
                        i10 = i1113;
                        break;
                    default:
                        C3722.m10894();
                        break;
                }
                return;
            }
            int iM11309 = (ThreadFactoryC3888.m11306("ܳᩳ") ^ i12) * (-103);
            i14 = iM11309 ^ (-474310117);
            i10 = i;
            i13 = ((iM11309 ^ i11) * (-13371)) ^ 868376500;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0091, code lost:
    
        if (l.C3535.m10431() > 0) goto L9;
     */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.text.SpannableString m3227() {
        /*
            Method dump skipped, instruction units count: 1494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC0744.m3227():android.text.SpannableString");
    }

    public ViewOnClickListenerC0744(AbstractC20745 abstractC20745, C11545 c11545, String str) {
        DialogInterfaceC19356 dialogInterfaceC19356;
        int i;
        short[] sArr;
        View.OnClickListener onClickListener;
        short[] sArr2;
        int i2;
        short[] sArr3;
        short[] sArr4;
        int i3;
        int iM11306;
        int i4;
        int i5;
        int i6;
        CheckBox checkBox;
        View view;
        Main main;
        Object obj;
        C8067 c8067;
        InterfaceC6025 interfaceC6025;
        short[] sArr5;
        short[] sArr6;
        int i7;
        short[] sArr7;
        short[] sArr8;
        View.OnClickListener onClickListener2;
        int iM45029;
        int i8;
        int i9;
        InterfaceC6025 interfaceC6026;
        short[] sArr9;
        int i10;
        DialogInterfaceC19356 dialogInterfaceC19357;
        int i11;
        int i12;
        int iM11307;
        int i13;
        int i14;
        int iM450210;
        int i15;
        int i16;
        final String str2 = str;
        int i17 = 0;
        int i18 = 0;
        int i19 = 1453768298;
        int i20 = C2249.f8050;
        int i21 = C1937.f7317;
        short s = f3035[0];
        int i22 = ((s * s) + 302377321) - (34778 * s) >= 0 ? 33063 : 43583;
        int iM450211 = C19806.m45029("ᩴܶ") ^ i21;
        int i23 = ((iM450211 ^ i20) * 7311) ^ 2137724975;
        int i24 = iM450211 ^ 596926301;
        ImageView imageView = null;
        InterfaceC6025 interfaceC6027 = null;
        String strM8470 = null;
        String strM940 = null;
        short[] sArr10 = null;
        short[] sArr11 = null;
        short[] sArr12 = null;
        short[] sArr13 = null;
        short[] sArr14 = null;
        short[] sArr15 = null;
        short[] sArr16 = null;
        short[] sArr17 = null;
        short[] sArr18 = null;
        int iM450212 = 0;
        int iM450213 = 0;
        int i25 = 0;
        int iM11308 = 0;
        int i26 = 0;
        int iM11309 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        int i31 = 0;
        int i32 = 0;
        View viewM8167 = null;
        C0733 c0733 = null;
        CheckBox checkBox2 = null;
        InterfaceC6025 interfaceC6028 = null;
        C10948 c10948 = null;
        StringBuilder sb = null;
        String str3 = null;
        Main main2 = null;
        ArrayList arrayList = null;
        int i33 = 0;
        Spinner spinner = null;
        final CheckBox checkBox3 = null;
        int i34 = 0;
        final DialogInterfaceC19356 dialogInterfaceC19358 = null;
        InterfaceC6025 interfaceC6029 = null;
        Object obj2 = null;
        View viewM4976 = null;
        int i35 = i23;
        View.OnClickListener onClickListener3 = null;
        C8067 c8068 = null;
        final CheckBox checkBox4 = null;
        while (true) {
            i19 = i24 ^ (i35 & (((i19 ^ i20) * (-26855)) >> 31));
            switch (i19) {
                case -2024224812:
                case -1816717305:
                    interfaceC6026 = interfaceC6028;
                    i12 = i31;
                    sArr9 = sArr18;
                    onClickListener3 = onClickListener3;
                    int i36 = i29;
                    sArr13 = sArr13;
                    i18 = i18;
                    sArr14 = sArr14;
                    sArr16 = sArr16;
                    i30 = i30;
                    sArr15 = sArr15;
                    i4 = i36;
                    C8067 c8069 = c8068;
                    ThreadFactoryC3888.m11299(c8069, false);
                    DialogInterfaceC19356 dialogInterfaceC19356M8239 = C2704.m8239(c8069);
                    C11005.m27756(c11545, dialogInterfaceC19356M8239, str2);
                    sArr12 = f3035;
                    if (!C3286.f12186) {
                        int iM450214 = C19806.m45029("֨ۖ") ^ i21;
                        dialogInterfaceC19358 = dialogInterfaceC19356M8239;
                        i24 = iM450214 ^ 1531299422;
                        i35 = ((iM450214 ^ i20) * (-20107)) ^ 1303075899;
                        c8068 = c8069;
                        sArr18 = sArr9;
                        onClickListener3 = onClickListener3;
                        i31 = i12;
                        interfaceC6028 = interfaceC6026;
                        dialogInterfaceC19358 = dialogInterfaceC19358;
                        short[] sArr19 = sArr14;
                        i18 = i18;
                        sArr13 = sArr13;
                        i29 = i4;
                        sArr15 = sArr15;
                        i30 = i30;
                        sArr16 = sArr16;
                        sArr14 = sArr19;
                    } else {
                        c8068 = c8069;
                        checkBox4 = checkBox4;
                        viewM4976 = viewM4976;
                        obj2 = obj2;
                        sArr10 = sArr10;
                        dialogInterfaceC19358 = dialogInterfaceC19356M8239;
                        i10 = i12;
                        int iM450215 = (C19806.m45029("ۗ۟") + i20) * 35;
                        obj2 = obj2;
                        sArr18 = sArr9;
                        checkBox4 = checkBox4;
                        c8068 = c8068;
                        sArr10 = sArr10;
                        interfaceC6028 = interfaceC6026;
                        int i37 = i10;
                        i35 = ((iM450215 ^ i21) * 32227) ^ 1226044209;
                        onClickListener3 = onClickListener3;
                        i31 = i37;
                        View view2 = viewM4976;
                        i24 = iM450215 ^ (-1375129663);
                        viewM4976 = view2;
                        short[] sArr20 = sArr14;
                        i18 = i18;
                        sArr13 = sArr13;
                        i29 = i4;
                        sArr15 = sArr15;
                        i30 = i30;
                        sArr16 = sArr16;
                        sArr14 = sArr20;
                    }
                    break;
                case -1956581514:
                case 57534379:
                    dialogInterfaceC19358 = dialogInterfaceC19358;
                    interfaceC6026 = interfaceC6028;
                    i12 = i31;
                    sArr9 = sArr18;
                    onClickListener3 = onClickListener3;
                    int i38 = i29;
                    sArr13 = sArr13;
                    i18 = i18;
                    sArr14 = sArr14;
                    sArr16 = sArr16;
                    i30 = i30;
                    sArr15 = sArr15;
                    i4 = i38;
                    spinner.setAdapter((SpinnerAdapter) c0733);
                    m3213();
                    strM940 = C0050.m940(f3035, 16, 3, i22);
                    iM11307 = (ThreadFactoryC3888.m11306("ۢܰ") + i20) * 11;
                    i35 = 1979378999 ^ ((iM11307 ^ i21) * 16757);
                    i13 = 1119284400;
                    i24 = iM11307 ^ i13;
                    sArr18 = sArr9;
                    onClickListener3 = onClickListener3;
                    i31 = i12;
                    interfaceC6028 = interfaceC6026;
                    dialogInterfaceC19358 = dialogInterfaceC19358;
                    short[] sArr110 = sArr14;
                    i18 = i18;
                    sArr13 = sArr13;
                    i29 = i4;
                    sArr15 = sArr15;
                    i30 = i30;
                    sArr16 = sArr16;
                    sArr14 = sArr110;
                    break;
                case -1923240788:
                case 2013661420:
                    DialogInterfaceC19356 dialogInterfaceC19359 = dialogInterfaceC19358;
                    int i39 = i31;
                    short[] sArr21 = sArr17;
                    InterfaceC6025 interfaceC60210 = interfaceC6028;
                    ViewGroupOnHierarchyChangeListenerC1916.m6230(checkBox4, interfaceC60210.contains(C0817.m3406(sArr21, i39, 17, i22)));
                    interfaceC6029 = ApplicationC0716.f2992;
                    sArr18 = f3035;
                    int iM113010 = (ThreadFactoryC3888.m11306("ۙ᩸") ^ i21) * (-77);
                    i24 = iM113010 ^ (-1216120232);
                    sArr17 = sArr21;
                    i31 = i39;
                    i35 = ((iM113010 ^ i20) * 19311) ^ 1628252627;
                    interfaceC6028 = interfaceC60210;
                    dialogInterfaceC19358 = dialogInterfaceC19359;
                    i34 = 75;
                    break;
                case -1913106034:
                case 330277:
                    dialogInterfaceC19358 = dialogInterfaceC19358;
                    C1937.m6291(checkBox4, onClickListener3);
                    C7105.m18993(checkBox2, new ViewOnClickListenerC14741(this, checkBox2, 1));
                    iM11309 = ThreadFactoryC3888.m11306(C1148.m4230(f3035, 90, 3, i22));
                    i27 = 2120863432;
                    if (RunnableC3388.f12514 < 0) {
                        iM450210 = C19806.m45029("ᩴ᩶") ^ i21;
                        i15 = ((iM450210 ^ i20) * (-13975)) ^ 1052504696;
                        i16 = -1427098825;
                        i24 = iM450210 ^ i16;
                        i35 = i15;
                        dialogInterfaceC19358 = dialogInterfaceC19358;
                    } else {
                        interfaceC6026 = interfaceC6028;
                        i12 = i31;
                        sArr9 = sArr18;
                        onClickListener3 = onClickListener3;
                        int i40 = i29;
                        sArr13 = sArr13;
                        i18 = i18;
                        sArr14 = sArr14;
                        sArr16 = sArr16;
                        i30 = i30;
                        sArr15 = sArr15;
                        i4 = i40;
                        iM11307 = C19806.m45029("ۢ᩻") ^ i21;
                        i35 = 1884155070 ^ ((iM11307 ^ i20) * 3271);
                        i13 = -533456894;
                        i24 = iM11307 ^ i13;
                        sArr18 = sArr9;
                        onClickListener3 = onClickListener3;
                        i31 = i12;
                        interfaceC6028 = interfaceC6026;
                        dialogInterfaceC19358 = dialogInterfaceC19358;
                        short[] sArr111 = sArr14;
                        i18 = i18;
                        sArr13 = sArr13;
                        i29 = i4;
                        sArr15 = sArr15;
                        i30 = i30;
                        sArr16 = sArr16;
                        sArr14 = sArr111;
                    }
                    break;
                case -1841907341:
                case 1743496225:
                    dialogInterfaceC19358 = dialogInterfaceC19358;
                    InterfaceC6025 interfaceC60211 = interfaceC6028;
                    i12 = i31;
                    short[] sArr22 = sArr18;
                    onClickListener3 = onClickListener3;
                    short[] sArr23 = sArr14;
                    ImageView imageView2 = imageView;
                    imageView2.setImageResource(iM450213 ^ i25);
                    C7105.m18993(imageView2, this);
                    short[] sArr24 = f3035;
                    i17 = 22;
                    i28 = 3;
                    int iM450216 = (C19806.m45029("֫ۡ") ^ i21) * (-69);
                    int i41 = ((iM450216 ^ i20) * 5305) ^ (-1669008316);
                    i24 = iM450216 ^ 744211647;
                    imageView = imageView2;
                    i29 = i29;
                    sArr15 = sArr15;
                    i30 = i30;
                    i35 = i41;
                    sArr16 = sArr16;
                    sArr14 = sArr23;
                    sArr18 = sArr22;
                    interfaceC6028 = interfaceC60211;
                    i18 = i18;
                    sArr13 = sArr24;
                    onClickListener3 = onClickListener3;
                    i31 = i12;
                    dialogInterfaceC19358 = dialogInterfaceC19358;
                    break;
                case -1793807066:
                case -914851698:
                    checkBox4 = checkBox4;
                    dialogInterfaceC19358 = dialogInterfaceC19358;
                    interfaceC6026 = interfaceC6028;
                    i31 = i31;
                    onClickListener3 = onClickListener3;
                    C8067 c80610 = c8068;
                    int i42 = i29;
                    sArr13 = sArr13;
                    i18 = i18;
                    sArr14 = sArr14;
                    sArr16 = sArr16;
                    i30 = i30;
                    sArr15 = sArr15;
                    i4 = i42;
                    AbstractC0464.m2309(c80610, iM450212 ^ i33, null);
                    String strM6363 = C1977.m6363(f3035, 7, 3, i22);
                    int iM113011 = (i20 - ThreadFactoryC3888.m11306("ۧ۬")) * 33;
                    str3 = strM6363;
                    i35 = ((iM113011 ^ i21) * (-32493)) ^ (-2102697008);
                    i32 = i32;
                    sArr12 = sArr12;
                    sArr18 = sArr18;
                    viewM4976 = viewM4976;
                    sArr11 = sArr11;
                    obj2 = null;
                    c8068 = c80610;
                    i24 = iM113011 ^ 481372616;
                    interfaceC6028 = interfaceC6026;
                    onClickListener3 = onClickListener3;
                    checkBox4 = checkBox4;
                    i31 = i31;
                    dialogInterfaceC19358 = dialogInterfaceC19358;
                    short[] sArr112 = sArr14;
                    i18 = i18;
                    sArr13 = sArr13;
                    i29 = i4;
                    sArr15 = sArr15;
                    i30 = i30;
                    sArr16 = sArr16;
                    sArr14 = sArr112;
                    break;
                case -1700150394:
                case -1300240001:
                    DialogInterfaceC19356 dialogInterfaceC193510 = dialogInterfaceC19358;
                    int i43 = i30;
                    int i44 = i31;
                    View.OnClickListener onClickListener4 = onClickListener3;
                    short[] sArr25 = sArr15;
                    int i45 = i18;
                    checkBox3 = (CheckBox) C2642.m8167(viewM4976, ThreadFactoryC3888.m11306(C3660.m10790(sArr25, i45, i43, i22)) ^ 2118678497);
                    sArr16 = f3035;
                    int iM113012 = (i21 - ThreadFactoryC3888.m11306("۫ۙ")) * (-53);
                    int i46 = ((iM113012 ^ i20) * (-5519)) ^ 1165209612;
                    i24 = iM113012 ^ 1028856988;
                    i18 = i45;
                    sArr15 = sArr25;
                    onClickListener3 = onClickListener4;
                    i30 = i43;
                    i31 = i44;
                    dialogInterfaceC19358 = dialogInterfaceC193510;
                    i35 = i46;
                    sArr18 = sArr18;
                    interfaceC6028 = interfaceC6028;
                    break;
                case -1691803355:
                case 1558271416:
                    dialogInterfaceC19358 = dialogInterfaceC19358;
                    interfaceC6026 = interfaceC6028;
                    i12 = i31;
                    sArr9 = sArr18;
                    onClickListener3 = onClickListener3;
                    int i47 = i29;
                    sArr13 = sArr13;
                    i18 = i18;
                    sArr14 = sArr14;
                    sArr16 = sArr16;
                    i30 = i30;
                    sArr15 = sArr15;
                    i4 = i47;
                    iM450213 = C19806.m45029(C1461.m5070(f3035, 19, 3, i22));
                    i25 = 2101827553;
                    iM11307 = (ThreadFactoryC3888.m11306("᩹᩶") ^ i20) * 15;
                    i35 = (-1190836221) ^ ((iM11307 ^ i21) * (-29861));
                    i13 = -677940771;
                    i24 = iM11307 ^ i13;
                    sArr18 = sArr9;
                    onClickListener3 = onClickListener3;
                    i31 = i12;
                    interfaceC6028 = interfaceC6026;
                    dialogInterfaceC19358 = dialogInterfaceC19358;
                    short[] sArr113 = sArr14;
                    i18 = i18;
                    sArr13 = sArr13;
                    i29 = i4;
                    sArr15 = sArr15;
                    i30 = i30;
                    sArr16 = sArr16;
                    sArr14 = sArr113;
                    break;
                case -1360187971:
                case -716161546:
                    checkBox = checkBox4;
                    view = viewM4976;
                    dialogInterfaceC19358 = dialogInterfaceC19358;
                    main = main2;
                    obj = obj2;
                    c8067 = c8068;
                    interfaceC6025 = interfaceC6028;
                    i31 = i31;
                    sArr5 = sArr10;
                    sArr6 = sArr11;
                    i7 = i32;
                    sArr7 = sArr12;
                    sArr8 = sArr18;
                    onClickListener2 = onClickListener3;
                    int i48 = i29;
                    sArr13 = sArr13;
                    i18 = i18;
                    sArr14 = sArr14;
                    sArr16 = sArr16;
                    i30 = i30;
                    sArr15 = sArr15;
                    i4 = i48;
                    this.f3042 = abstractC20745;
                    this.f3043 = str2;
                    strM8470 = C2788.m8470(f3035, 1, 3, i22);
                    if (C1025.f4800 >= 0) {
                        iM45029 = C19806.m45029("᩵ۧ") ^ i20;
                        i8 = ((iM45029 ^ i21) * (-30859)) ^ 1542289168;
                        i9 = -288958247;
                    } else {
                        iM45029 = (C19806.m45029("ܰ᩵") + i21) * 39;
                        i8 = ((iM45029 ^ i20) * 16257) ^ (-920966000);
                        i9 = 1485285172;
                    }
                    int i49 = iM45029 ^ i9;
                    main2 = main;
                    i32 = i7;
                    sArr12 = sArr7;
                    sArr18 = sArr8;
                    viewM4976 = view;
                    sArr11 = sArr6;
                    c8068 = c8067;
                    sArr10 = sArr5;
                    i24 = i49;
                    i35 = i8;
                    obj2 = obj;
                    interfaceC6028 = interfaceC6025;
                    onClickListener3 = onClickListener2;
                    checkBox4 = checkBox;
                    str2 = str;
                    i31 = i31;
                    dialogInterfaceC19358 = dialogInterfaceC19358;
                    short[] sArr114 = sArr14;
                    i18 = i18;
                    sArr13 = sArr13;
                    i29 = i4;
                    sArr15 = sArr15;
                    i30 = i30;
                    sArr16 = sArr16;
                    sArr14 = sArr114;
                    break;
                case -1345954930:
                case 897212778:
                    dialogInterfaceC19358 = dialogInterfaceC19358;
                    ViewGroupOnHierarchyChangeListenerC1916.m6230(checkBox2, interfaceC6029.contains(RunnableC1606.m5481(sArr18, i34, 15, i22)));
                    onClickListener3 = new View.OnClickListener(this) { // from class: l.᩸᩻ۨ

                        /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ ViewOnClickListenerC0744 f71096;

                        {
                            int i50 = -389018849;
                            int i51 = C1461.f5957;
                            int i52 = ViewTreeObserverOnPreDrawListenerC3327.f12317;
                            int iM113013 = ThreadFactoryC3888.m11306("ܶ֡") ^ i51;
                            int i53 = ((iM113013 ^ i52) * (-6891)) ^ 1008535136;
                            int i54 = 1586308888;
                            while (true) {
                                i50 = ((((i50 ^ i52) * 6429) >> 31) & i53) ^ (iM113013 ^ i54);
                                switch (i50) {
                                    case -2066898971:
                                    case -1033924711:
                                        if (C7105.f23796 >= 0) {
                                            iM113013 = ThreadFactoryC3888.m11306("᩻۫") ^ i51;
                                            i53 = ((iM113013 ^ i52) * 4193) ^ 1664256532;
                                            i54 = -1701862502;
                                        } else {
                                            iM113013 = C19806.m45029("ۛ۠") ^ i52;
                                            i53 = ((iM113013 ^ i51) * (-22791)) ^ 538728401;
                                            i54 = 672529467;
                                        }
                                        break;
                                    case -1965121230:
                                    case 1625978833:
                                        if (C3286.f12186) {
                                            iM113013 = ThreadFactoryC3888.m11306("֡᩺") ^ i52;
                                            i53 = ((iM113013 ^ i51) * (-5909)) ^ 1349248030;
                                            i54 = 717396935;
                                        } else {
                                            iM113013 = (i51 - ThreadFactoryC3888.m11306("ܶۨ")) * 93;
                                            i53 = ((iM113013 ^ i52) * (-18957)) ^ 1656143674;
                                            i54 = 1440382373;
                                        }
                                        break;
                                    case -1947300991:
                                    case -625263152:
                                        if (C1148.f5161 <= 0) {
                                            iM113013 = C19806.m45029("ۚۚ") ^ i52;
                                            i53 = ((iM113013 ^ i51) * (-3903)) ^ (-168307331);
                                            i54 = -1641382744;
                                        } else {
                                            iM113013 = (C19806.m45029("ܳۖ") ^ i52) * (-95);
                                            i53 = ((iM113013 ^ i51) * (-19981)) ^ (-1987325896);
                                            i54 = -1650917891;
                                        }
                                        break;
                                    case -1907156025:
                                    case 115933072:
                                        this.f71096 = this;
                                        if (C1977.f7413 <= 0) {
                                            iM113013 = C19806.m45029("᩹֫") ^ i51;
                                            i53 = ((iM113013 ^ i52) * 27449) ^ (-1032448594);
                                            i54 = -1707505560;
                                        } else {
                                            iM113013 = (i52 - ThreadFactoryC3888.m11306("ۜۚ")) * (-19);
                                            i53 = ((iM113013 ^ i51) * 29897) ^ (-685194668);
                                            i54 = 1305280298;
                                        }
                                        break;
                                    case -1766984057:
                                    case -220595123:
                                        if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                                            iM113013 = ThreadFactoryC3888.m11306("᩻۫") ^ i51;
                                            i53 = ((iM113013 ^ i52) * 4193) ^ 1664256532;
                                            i54 = -1701862502;
                                        } else {
                                            iM113013 = (C19806.m45029("֨ᩴ") + i51) * 95;
                                            i53 = ((iM113013 ^ i52) * 26721) ^ 1049455233;
                                            i54 = -1388923424;
                                        }
                                        break;
                                    case -1167347940:
                                    case 537160819:
                                        if (C2249.f8050 >= 0) {
                                            iM113013 = C19806.m45029("ۛ۠") ^ i52;
                                            i53 = ((iM113013 ^ i51) * (-22791)) ^ 538728401;
                                            i54 = 672529467;
                                        } else {
                                            iM113013 = ThreadFactoryC3888.m11306("ܶۘ") ^ i51;
                                            i53 = ((iM113013 ^ i52) * (-15375)) ^ (-1797009565);
                                            i54 = -745844672;
                                        }
                                        break;
                                    case -1039927461:
                                    case 1613520109:
                                        if (RunnableC3388.f12514 >= 0) {
                                            iM113013 = C19806.m45029("ۚۚ") ^ i52;
                                            i53 = ((iM113013 ^ i51) * (-3903)) ^ (-168307331);
                                            i54 = -1641382744;
                                        } else {
                                            iM113013 = (C19806.m45029("ۗ۬") ^ i51) * (-105);
                                            i53 = ((iM113013 ^ i52) * 13903) ^ 568615157;
                                            i54 = -57518829;
                                        }
                                        break;
                                    case -1024875031:
                                    case 737153053:
                                        C1461.m5080();
                                        iM113013 = C19806.m45029("ۛ۠") ^ i52;
                                        i53 = ((iM113013 ^ i51) * (-22791)) ^ 538728401;
                                        i54 = 672529467;
                                        break;
                                    case -385723588:
                                    case 1399662701:
                                        return;
                                    case -276489861:
                                    case -201687049:
                                        if (C0962.f3784) {
                                            iM113013 = ThreadFactoryC3888.m11306("᩻۫") ^ i51;
                                            i53 = ((iM113013 ^ i52) * 4193) ^ 1664256532;
                                            i54 = -1701862502;
                                        } else {
                                            iM113013 = C19806.m45029("᩶۟") ^ i52;
                                            i53 = ((iM113013 ^ i51) * (-11535)) ^ 636326251;
                                            i54 = 1238171270;
                                        }
                                        break;
                                    case -149632261:
                                    case 1118193833:
                                        if (C0671.f2816 != 0) {
                                            iM113013 = C19806.m45029("ۛ۠") ^ i52;
                                            i53 = ((iM113013 ^ i51) * (-22791)) ^ 538728401;
                                            i54 = 672529467;
                                        } else {
                                            iM113013 = (i51 - ThreadFactoryC3888.m11306("ܰ᩶")) * 91;
                                            i53 = ((iM113013 ^ i52) * (-22627)) ^ (-1169308384);
                                            i54 = -1738657032;
                                        }
                                        break;
                                    case 8980540:
                                    case 503590366:
                                        if (C3722.f13525 <= 0) {
                                            iM113013 = C19806.m45029("ۛ۠") ^ i52;
                                            i53 = ((iM113013 ^ i51) * (-22791)) ^ 538728401;
                                            i54 = 672529467;
                                        } else {
                                            iM113013 = ThreadFactoryC3888.m11306("ۜܳ") ^ i52;
                                            i53 = ((iM113013 ^ i51) * (-25477)) ^ 449564983;
                                            i54 = -1147147767;
                                        }
                                        break;
                                    case 213319345:
                                    case 1632889549:
                                        ViewTreeObserverOnPreDrawListenerC3327.m9874();
                                        throw new RuntimeException();
                                    case 356224104:
                                    case 1235865960:
                                        if (C2332.f8260) {
                                            iM113013 = C19806.m45029("᩶ۢ") ^ i52;
                                            i53 = ((iM113013 ^ i51) * (-15805)) ^ 269198139;
                                            i54 = -215066205;
                                        } else {
                                            iM113013 = ThreadFactoryC3888.m11306("֡᩺") ^ i52;
                                            i53 = ((iM113013 ^ i51) * (-5909)) ^ 1349248030;
                                            i54 = 717396935;
                                        }
                                        break;
                                    case 1575825968:
                                    case 1669635757:
                                        CallableC1627.m5507();
                                        if (C1066.f4915 > 0) {
                                            iM113013 = C19806.m45029("᩹֫") ^ i51;
                                            i53 = ((iM113013 ^ i52) * 27449) ^ (-1032448594);
                                            i54 = -1707505560;
                                        } else {
                                            iM113013 = C19806.m45029("ۛ۠") ^ i52;
                                            i53 = ((iM113013 ^ i51) * (-22791)) ^ 538728401;
                                            i54 = 672529467;
                                        }
                                        break;
                                    default:
                                        RunnableC0195.m1431();
                                        if (C1189.f5284 > 0) {
                                            iM113013 = ThreadFactoryC3888.m11306("֡᩺") ^ i52;
                                            i53 = ((iM113013 ^ i51) * (-5909)) ^ 1349248030;
                                            i54 = 717396935;
                                        } else {
                                            iM113013 = C19806.m45029("ۛ۠") ^ i52;
                                            i53 = ((iM113013 ^ i51) * (-22791)) ^ 538728401;
                                            i54 = 672529467;
                                        }
                                        break;
                                }
                            }
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            ViewOnClickListenerC0744 viewOnClickListenerC0744 = null;
                            int i50 = -1393977966;
                            int i51 = C1398.f5802;
                            int i52 = C2871.f10837;
                            int iM450217 = C19806.m45029("᩶᩺") ^ i52;
                            int i53 = ((iM450217 ^ i51) * 5393) ^ 481812012;
                            int i54 = 1868770779;
                            while (true) {
                                i50 = ((((i50 ^ i51) * (-10107)) >> 31) & i53) ^ (iM450217 ^ i54);
                                switch (i50) {
                                    case -2099420267:
                                    case 631885399:
                                        if (C2249.f8050 >= 0) {
                                            iM450217 = (ThreadFactoryC3888.m11306("᩺ܿ") + i52) * (-11);
                                            i53 = ((iM450217 ^ i51) * (-9101)) ^ 1943720032;
                                            i54 = -182984022;
                                        } else {
                                            iM450217 = (C19806.m45029("ܺۛ") ^ i51) * (-21);
                                            i53 = ((iM450217 ^ i52) * 8787) ^ (-1204203377);
                                            i54 = -244898366;
                                        }
                                        break;
                                    case -2075700462:
                                    case -834430629:
                                        if (C1066.f4915 <= 0) {
                                            iM450217 = ThreadFactoryC3888.m11306("ۡۧ") ^ i52;
                                            i53 = ((iM450217 ^ i51) * 20435) ^ 106161988;
                                            i54 = -129834838;
                                        } else {
                                            iM450217 = C19806.m45029("ۚۜ") ^ i52;
                                            i53 = ((iM450217 ^ i51) * (-12595)) ^ (-1638030887);
                                            i54 = -1237215424;
                                        }
                                        break;
                                    case -2049642161:
                                    case 908066680:
                                        if (C1189.f5284 <= 0) {
                                            iM450217 = ThreadFactoryC3888.m11306("ۡۧ") ^ i52;
                                            i53 = ((iM450217 ^ i51) * 20435) ^ 106161988;
                                            i54 = -129834838;
                                        } else {
                                            iM450217 = (C19806.m45029("ۚ᩷") ^ i51) * (-63);
                                            i53 = ((iM450217 ^ i52) * (-4893)) ^ (-609152189);
                                            i54 = -956540026;
                                        }
                                        break;
                                    case -1644181263:
                                    case 1253191168:
                                        if (C2124.f7782 > 0) {
                                            iM450217 = C19806.m45029("ܰۛ") ^ i51;
                                            i53 = ((iM450217 ^ i52) * (-20125)) ^ 1561283962;
                                            i54 = 585837944;
                                        } else {
                                            iM450217 = C19806.m45029("᩺ܶ") ^ i51;
                                            i53 = ((iM450217 ^ i52) * (-27265)) ^ 298104364;
                                            i54 = 1261794654;
                                        }
                                        break;
                                    case -1553774426:
                                    case 597643361:
                                        if (RunnableC0195.f1321 >= 0) {
                                            iM450217 = ThreadFactoryC3888.m11306("ۡۧ") ^ i52;
                                            i53 = ((iM450217 ^ i51) * 20435) ^ 106161988;
                                            i54 = -129834838;
                                        } else {
                                            iM450217 = (ThreadFactoryC3888.m11306("ۧۜ") + i52) * 53;
                                            i53 = ((iM450217 ^ i51) * 22509) ^ (-39123962);
                                            i54 = 403930653;
                                        }
                                        break;
                                    case -1164149393:
                                    case 705706535:
                                        C1937.m6279();
                                        break;
                                    case -1045677211:
                                    case 1960387651:
                                        if (!C0962.f3784) {
                                            iM450217 = (ThreadFactoryC3888.m11306("᩺ܿ") + i52) * (-11);
                                            i53 = ((iM450217 ^ i51) * (-9101)) ^ 1943720032;
                                            i54 = -182984022;
                                        } else {
                                            iM450217 = ThreadFactoryC3888.m11306("ۡۧ") ^ i52;
                                            i53 = ((iM450217 ^ i51) * 20435) ^ 106161988;
                                            i54 = -129834838;
                                        }
                                        break;
                                    case -934763494:
                                    case 167705902:
                                        C1189.m4368();
                                        if (C0216.f1393 != 0) {
                                            iM450217 = C19806.m45029("᩺ܶ") ^ i51;
                                            i53 = ((iM450217 ^ i52) * (-27265)) ^ 298104364;
                                            i54 = 1261794654;
                                        } else {
                                            iM450217 = (ThreadFactoryC3888.m11306("᩺ܿ") + i52) * (-11);
                                            i53 = ((iM450217 ^ i51) * (-9101)) ^ 1943720032;
                                            i54 = -182984022;
                                        }
                                        break;
                                    case -888929920:
                                    case 78732942:
                                        if (C1460.m5050() != 0) {
                                            iM450217 = (ThreadFactoryC3888.m11306("᩺ܿ") + i52) * (-11);
                                            i53 = ((iM450217 ^ i51) * (-9101)) ^ 1943720032;
                                            i54 = -182984022;
                                        } else {
                                            iM450217 = (i51 - C19806.m45029("ۨ֡")) * (-21);
                                            i53 = ((iM450217 ^ i52) * 23589) ^ 24878167;
                                            i54 = -226465501;
                                        }
                                        break;
                                    case -829159236:
                                    case 1259399485:
                                        ViewOnClickListenerC0744.m3216(viewOnClickListenerC0744, checkBox4);
                                        break;
                                    case -577736301:
                                    case -539004486:
                                        if (C0526.f2219) {
                                            iM450217 = (ThreadFactoryC3888.m11306("ۡ۠") ^ i52) * (-57);
                                            i53 = ((iM450217 ^ i51) * (-22395)) ^ 1740258494;
                                            i54 = 1555768582;
                                        } else {
                                            iM450217 = ThreadFactoryC3888.m11306("֨ۤ") ^ i51;
                                            i53 = ((iM450217 ^ i52) * (-20431)) ^ 1422856885;
                                            i54 = -697651840;
                                        }
                                        break;
                                    case -41996735:
                                    case 507020105:
                                        if (C2788.f10625 >= 0) {
                                            iM450217 = (ThreadFactoryC3888.m11306("᩺ܿ") + i52) * (-11);
                                            i53 = ((iM450217 ^ i51) * (-9101)) ^ 1943720032;
                                            i54 = -182984022;
                                        } else {
                                            iM450217 = C19806.m45029("᩹ۢ") ^ i52;
                                            i53 = ((iM450217 ^ i51) * 3227) ^ 1356564458;
                                            i54 = 808340112;
                                        }
                                        break;
                                    case 334688520:
                                    case 1078728134:
                                        if (C1025.m3861() <= 0) {
                                            iM450217 = (ThreadFactoryC3888.m11306("ۡ۠") ^ i52) * (-57);
                                            i53 = ((iM450217 ^ i51) * (-22395)) ^ 1740258494;
                                            i54 = 1555768582;
                                        } else {
                                            iM450217 = (i52 - ThreadFactoryC3888.m11306("ۙ۫")) * 69;
                                            i53 = ((iM450217 ^ i51) * (-19667)) ^ 1531104979;
                                            i54 = 1458959396;
                                        }
                                        break;
                                    case 1524561792:
                                    case 1612938079:
                                        C0817.m3399();
                                        iM450217 = (ThreadFactoryC3888.m11306("᩺ܿ") + i52) * (-11);
                                        i53 = ((iM450217 ^ i51) * (-9101)) ^ 1943720032;
                                        i54 = -182984022;
                                        break;
                                    case 1726833958:
                                    case 1821122406:
                                        viewOnClickListenerC0744 = this.f71096;
                                        if (RunnableC3388.m10064()) {
                                            iM450217 = (ThreadFactoryC3888.m11306("۠ۘ") ^ i51) * 47;
                                            i53 = ((iM450217 ^ i52) * (-12827)) ^ (-1540614494);
                                            i54 = 663927383;
                                        } else {
                                            iM450217 = (ThreadFactoryC3888.m11306("ۡ۠") ^ i52) * (-57);
                                            i53 = ((iM450217 ^ i51) * (-22395)) ^ 1740258494;
                                            i54 = 1555768582;
                                        }
                                        break;
                                    default:
                                        if (C3577.f13150 >= 0) {
                                            iM450217 = C19806.m45029("ܰۛ") ^ i51;
                                            i53 = ((iM450217 ^ i52) * (-20125)) ^ 1561283962;
                                            i54 = 585837944;
                                        } else {
                                            iM450217 = (ThreadFactoryC3888.m11306("ܰ۠") ^ i52) * 63;
                                            i53 = ((iM450217 ^ i51) * (-26417)) ^ 146935390;
                                            i54 = -955298145;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    };
                    iM450210 = (C19806.m45029("ۨ֨") + i20) * (-107);
                    i15 = ((iM450210 ^ i21) * (-20197)) ^ 562825241;
                    i16 = -1776019586;
                    i24 = iM450210 ^ i16;
                    i35 = i15;
                    dialogInterfaceC19358 = dialogInterfaceC19358;
                    break;
                case -1325857507:
                case -230661318:
                    InterfaceC6025 interfaceC60212 = interfaceC6028;
                    short[] sArr26 = sArr18;
                    i4 = i29;
                    short[] sArr27 = sArr12;
                    viewM8167 = C2642.m8167(viewM4976, C19806.m45029(C0278.m1774(sArr27, 13, 3, i22)) ^ 2102936499);
                    int iM113013 = (ThreadFactoryC3888.m11306("ܺ۬") + i20) * 29;
                    int i50 = ((iM113013 ^ i21) * (-1275)) ^ (-1197158022);
                    i24 = iM113013 ^ 12130909;
                    sArr12 = sArr27;
                    sArr18 = sArr26;
                    i35 = i50;
                    interfaceC6028 = interfaceC60212;
                    onClickListener3 = onClickListener3;
                    i31 = i31;
                    dialogInterfaceC19358 = dialogInterfaceC19358;
                    short[] sArr115 = sArr14;
                    i18 = i18;
                    sArr13 = sArr13;
                    i29 = i4;
                    sArr15 = sArr15;
                    i30 = i30;
                    sArr16 = sArr16;
                    sArr14 = sArr115;
                    break;
                case -1319339478:
                case 147440971:
                    i4 = i29;
                    Main main3 = main2;
                    viewM4976 = C1419.m4976(main3, ThreadFactoryC3888.m11306(strM8470) ^ 2097917235);
                    C8067 c8067M5356 = RunnableC1564.m5356(main3);
                    C1977.m6349(c8067M5356, viewM4976);
                    sArr10 = f3035;
                    int iM113014 = ThreadFactoryC3888.m11306("᩹ۢ") ^ i20;
                    int i51 = ((iM113014 ^ i21) * (-11457)) ^ (-1883355904);
                    i32 = i32;
                    sArr12 = sArr12;
                    sArr18 = sArr18;
                    c8068 = c8067M5356;
                    sArr11 = sArr11;
                    obj2 = obj2;
                    interfaceC6028 = interfaceC6028;
                    i24 = iM113014 ^ 543704754;
                    checkBox4 = checkBox4;
                    main2 = main3;
                    i35 = i51;
                    onClickListener3 = onClickListener3;
                    i31 = i31;
                    dialogInterfaceC19358 = dialogInterfaceC19358;
                    short[] sArr116 = sArr14;
                    i18 = i18;
                    sArr13 = sArr13;
                    i29 = i4;
                    sArr15 = sArr15;
                    i30 = i30;
                    sArr16 = sArr16;
                    sArr14 = sArr116;
                    break;
                case -1156259468:
                case 1468487445:
                    dialogInterfaceC19356 = dialogInterfaceC19358;
                    interfaceC6028 = interfaceC6028;
                    i = i31;
                    sArr = sArr18;
                    onClickListener = onClickListener3;
                    short[] sArr28 = sArr14;
                    sArr4 = sArr16;
                    int i52 = i29;
                    sArr3 = sArr28;
                    i2 = i52;
                    C7105.m18993(C2642.m8167(viewM4976, C19806.m45029(C0797.m3361(sArr28, i52, 3, i22)) ^ 2127031643), new ViewOnClickListenerC14803(1, this));
                    sArr2 = f3035;
                    i18 = 28;
                    i30 = 3;
                    if (C0526.f2219) {
                        iM11306 = ThreadFactoryC3888.m11306("ۙܰ") ^ i21;
                        i35 = ((iM11306 ^ i20) * 26123) ^ 848715165;
                        i3 = 621028338;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۬۠") ^ i21;
                        i35 = ((iM11306 ^ i20) * (-29587)) ^ 428185031;
                        i3 = 1505968486;
                    }
                    i24 = iM11306 ^ i3;
                    sArr16 = sArr4;
                    sArr14 = sArr3;
                    i29 = i2;
                    onClickListener3 = onClickListener;
                    sArr15 = sArr2;
                    i31 = i;
                    sArr18 = sArr;
                    dialogInterfaceC19358 = dialogInterfaceC19356;
                    interfaceC6028 = interfaceC6028;
                    break;
                case -993981327:
                case 195229743:
                    DialogInterfaceC19356 dialogInterfaceC193511 = dialogInterfaceC19358;
                    sArr9 = sArr18;
                    ViewGroupOnHierarchyChangeListenerC1916.m6230(checkBox3, C1189.m4371(ApplicationC0716.f2992, C1025.m3859(f3035, 37, 21, i22), true));
                    InterfaceC6025 interfaceC60213 = ApplicationC0716.f2992;
                    sArr17 = f3035;
                    i31 = 58;
                    if (C1025.m3861() <= 0) {
                        interfaceC6026 = interfaceC60213;
                        dialogInterfaceC19358 = dialogInterfaceC193511;
                        i10 = 58;
                        int i53 = i29;
                        sArr13 = sArr13;
                        i18 = i18;
                        sArr14 = sArr14;
                        sArr16 = sArr16;
                        i30 = i30;
                        sArr15 = sArr15;
                        i4 = i53;
                        int iM450217 = (C19806.m45029("ۗ۟") + i20) * 35;
                        obj2 = obj2;
                        sArr18 = sArr9;
                        checkBox4 = checkBox4;
                        c8068 = c8068;
                        sArr10 = sArr10;
                        interfaceC6028 = interfaceC6026;
                        int i310 = i10;
                        i35 = ((iM450217 ^ i21) * 32227) ^ 1226044209;
                        onClickListener3 = onClickListener3;
                        i31 = i310;
                        View view3 = viewM4976;
                        i24 = iM450217 ^ (-1375129663);
                        viewM4976 = view3;
                        short[] sArr29 = sArr14;
                        i18 = i18;
                        sArr13 = sArr13;
                        i29 = i4;
                        sArr15 = sArr15;
                        i30 = i30;
                        sArr16 = sArr16;
                        sArr14 = sArr29;
                    } else {
                        int iM450218 = C19806.m45029("ۛ۬") ^ i20;
                        i24 = iM450218 ^ 1295918770;
                        i35 = ((iM450218 ^ i21) * 14143) ^ 425342477;
                        dialogInterfaceC19358 = dialogInterfaceC193511;
                        interfaceC6028 = interfaceC60213;
                        sArr18 = sArr9;
                    }
                    break;
                case -936701582:
                case 606109085:
                    viewM4976 = viewM4976;
                    DialogInterfaceC19356 dialogInterfaceC193512 = dialogInterfaceC19358;
                    int i54 = i31;
                    View.OnClickListener onClickListener5 = onClickListener3;
                    int i55 = i29;
                    sArr13 = sArr13;
                    i18 = i18;
                    sArr14 = sArr14;
                    sArr16 = sArr16;
                    i30 = i30;
                    sArr15 = sArr15;
                    i4 = i55;
                    ArrayList arrayList2 = new ArrayList(C14920.m35666());
                    this.f3038 = arrayList2;
                    Main mainM7591 = C2477.m7591(c11545);
                    this.f3041 = mainM7591;
                    this.f3040 = c11545;
                    int iM113015 = (ThreadFactoryC3888.m11306("ᩳ۠") ^ i20) * (-19);
                    i5 = ((iM113015 ^ i21) * (-2535)) ^ 1134483444;
                    i6 = iM113015 ^ 372584263;
                    arrayList = arrayList2;
                    main2 = mainM7591;
                    i32 = i32;
                    sArr12 = sArr12;
                    sArr18 = sArr18;
                    onClickListener3 = onClickListener5;
                    sArr11 = sArr11;
                    c8068 = c8068;
                    sArr10 = sArr10;
                    str2 = str;
                    obj2 = obj2;
                    i31 = i54;
                    interfaceC6028 = interfaceC6028;
                    dialogInterfaceC19358 = dialogInterfaceC193512;
                    checkBox4 = checkBox4;
                    View view4 = viewM4976;
                    i24 = i6;
                    i35 = i5;
                    viewM4976 = view4;
                    short[] sArr30 = sArr14;
                    i18 = i18;
                    sArr13 = sArr13;
                    i29 = i4;
                    sArr15 = sArr15;
                    i30 = i30;
                    sArr16 = sArr16;
                    sArr14 = sArr30;
                    break;
                case -874284896:
                case 1431243786:
                    dialogInterfaceC19358 = dialogInterfaceC19358;
                    interfaceC6026 = interfaceC6028;
                    i12 = i31;
                    sArr9 = sArr18;
                    onClickListener3 = onClickListener3;
                    int i56 = i29;
                    sArr13 = sArr13;
                    i18 = i18;
                    sArr14 = sArr14;
                    sArr16 = sArr16;
                    i30 = i30;
                    sArr15 = sArr15;
                    i4 = i56;
                    Spinner spinner2 = (Spinner) viewM8167;
                    this.f3045 = spinner2;
                    Context contextM10066 = RunnableC3388.m10066(spinner2);
                    spinner = spinner2;
                    ArrayList arrayList3 = arrayList;
                    C0733 c0734 = new C0733(contextM10066, arrayList3);
                    this.f3044 = c0734;
                    int iM113016 = ThreadFactoryC3888.m11306("ۜ֡") ^ i21;
                    arrayList = arrayList3;
                    i24 = iM113016 ^ 1625047134;
                    i35 = ((iM113016 ^ i20) * 32461) ^ (-376924154);
                    c0733 = c0734;
                    sArr18 = sArr9;
                    onClickListener3 = onClickListener3;
                    i31 = i12;
                    interfaceC6028 = interfaceC6026;
                    dialogInterfaceC19358 = dialogInterfaceC19358;
                    short[] sArr117 = sArr14;
                    i18 = i18;
                    sArr13 = sArr13;
                    i29 = i4;
                    sArr15 = sArr15;
                    i30 = i30;
                    sArr16 = sArr16;
                    sArr14 = sArr117;
                    break;
                case -853571838:
                case 117118319:
                    dialogInterfaceC19358 = dialogInterfaceC19358;
                    interfaceC6026 = interfaceC6028;
                    i12 = i31;
                    sArr9 = sArr18;
                    onClickListener3 = onClickListener3;
                    int i57 = i29;
                    sArr13 = sArr13;
                    i18 = i18;
                    sArr14 = sArr14;
                    sArr16 = sArr16;
                    i30 = i30;
                    sArr15 = sArr15;
                    i4 = i57;
                    imageView = (ImageView) C2642.m8167(viewM4976, ThreadFactoryC3888.m11306(strM940) ^ 2129925225);
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM11307 = C19806.m45029("ۢ᩻") ^ i21;
                        i35 = 1884155070 ^ ((iM11307 ^ i20) * 3271);
                        i13 = -533456894;
                    } else {
                        iM11307 = (C19806.m45029("ۡۘ") + i21) * 9;
                        i35 = 1932624764 ^ ((iM11307 ^ i20) * 17539);
                        i13 = -762381183;
                    }
                    i24 = iM11307 ^ i13;
                    sArr18 = sArr9;
                    onClickListener3 = onClickListener3;
                    i31 = i12;
                    interfaceC6028 = interfaceC6026;
                    dialogInterfaceC19358 = dialogInterfaceC19358;
                    short[] sArr118 = sArr14;
                    i18 = i18;
                    sArr13 = sArr13;
                    i29 = i4;
                    sArr15 = sArr15;
                    i30 = i30;
                    sArr16 = sArr16;
                    sArr14 = sArr118;
                    break;
                case -826765848:
                case -565819278:
                    C3743.m10966();
                    checkBox = checkBox4;
                    view = viewM4976;
                    dialogInterfaceC19358 = dialogInterfaceC19358;
                    main = main2;
                    obj = obj2;
                    c8067 = c8068;
                    interfaceC6025 = interfaceC6028;
                    i31 = i31;
                    sArr5 = sArr10;
                    sArr6 = sArr11;
                    i7 = i32;
                    sArr7 = sArr12;
                    sArr8 = sArr18;
                    onClickListener2 = onClickListener3;
                    int i58 = i29;
                    sArr13 = sArr13;
                    i18 = i18;
                    sArr14 = sArr14;
                    sArr16 = sArr16;
                    i30 = i30;
                    sArr15 = sArr15;
                    i4 = i58;
                    iM45029 = C19806.m45029("᩵ۧ") ^ i20;
                    i8 = ((iM45029 ^ i21) * (-30859)) ^ 1542289168;
                    i9 = -288958247;
                    int i410 = iM45029 ^ i9;
                    main2 = main;
                    i32 = i7;
                    sArr12 = sArr7;
                    sArr18 = sArr8;
                    viewM4976 = view;
                    sArr11 = sArr6;
                    c8068 = c8067;
                    sArr10 = sArr5;
                    i24 = i410;
                    i35 = i8;
                    obj2 = obj;
                    interfaceC6028 = interfaceC6025;
                    onClickListener3 = onClickListener2;
                    checkBox4 = checkBox;
                    str2 = str;
                    i31 = i31;
                    dialogInterfaceC19358 = dialogInterfaceC19358;
                    short[] sArr119 = sArr14;
                    i18 = i18;
                    sArr13 = sArr13;
                    i29 = i4;
                    sArr15 = sArr15;
                    i30 = i30;
                    sArr16 = sArr16;
                    sArr14 = sArr119;
                    break;
                case -820383905:
                case 259693833:
                    dialogInterfaceC19358 = dialogInterfaceC19358;
                    interfaceC6026 = interfaceC6028;
                    i12 = i31;
                    sArr9 = sArr18;
                    onClickListener3 = onClickListener3;
                    short[] sArr31 = sArr16;
                    iM11308 = ThreadFactoryC3888.m11306(C3660.m10790(sArr31, 31, 3, i22));
                    i26 = 2125829787;
                    if (C2124.f7782 > 0) {
                        int iM450219 = (C19806.m45029("ۚ᩹") + i20) * 57;
                        i14 = ((iM450219 ^ i21) * (-21465)) ^ 1030603816;
                        i24 = iM450219 ^ (-1318855706);
                        sArr16 = sArr31;
                        sArr18 = sArr9;
                        i35 = i14;
                        interfaceC6028 = interfaceC6026;
                        onClickListener3 = onClickListener3;
                        i31 = i12;
                        dialogInterfaceC19358 = dialogInterfaceC19358;
                    } else {
                        i30 = i30;
                        sArr15 = sArr15;
                        i4 = i29;
                        sArr13 = sArr13;
                        i18 = i18;
                        sArr14 = sArr14;
                        sArr16 = sArr31;
                        iM11307 = C19806.m45029("ۢ᩻") ^ i21;
                        i35 = 1884155070 ^ ((iM11307 ^ i20) * 3271);
                        i13 = -533456894;
                        i24 = iM11307 ^ i13;
                        sArr18 = sArr9;
                        onClickListener3 = onClickListener3;
                        i31 = i12;
                        interfaceC6028 = interfaceC6026;
                        dialogInterfaceC19358 = dialogInterfaceC19358;
                        short[] sArr1110 = sArr14;
                        i18 = i18;
                        sArr13 = sArr13;
                        i29 = i4;
                        sArr15 = sArr15;
                        i30 = i30;
                        sArr16 = sArr16;
                        sArr14 = sArr1110;
                    }
                    break;
                case -805295102:
                case 1773653175:
                    checkBox4 = checkBox4;
                    viewM4976 = viewM4976;
                    dialogInterfaceC19357 = dialogInterfaceC19358;
                    obj2 = obj2;
                    interfaceC6026 = interfaceC6028;
                    i11 = i31;
                    sArr9 = sArr18;
                    onClickListener3 = onClickListener3;
                    C8067 c80611 = c8068;
                    short[] sArr32 = sArr12;
                    int i59 = i29;
                    sArr13 = sArr13;
                    i18 = i18;
                    sArr14 = sArr14;
                    sArr16 = sArr16;
                    i30 = i30;
                    sArr15 = sArr15;
                    i4 = i59;
                    C1066.m4025(c80611, C19806.m45029(str3) ^ 2099055922, obj2);
                    sArr11 = f3035;
                    i32 = 10;
                    if (!C1977.m6356()) {
                        int iM113017 = (ThreadFactoryC3888.m11306("ܶۜ") ^ i21) * 17;
                        i5 = ((iM113017 ^ i20) * 545) ^ 1028603890;
                        i6 = iM113017 ^ (-624730362);
                        obj2 = obj2;
                        sArr12 = sArr32;
                        sArr18 = sArr9;
                        checkBox4 = checkBox4;
                        c8068 = c80611;
                        interfaceC6028 = interfaceC6026;
                        onClickListener3 = onClickListener3;
                        i31 = i11;
                        dialogInterfaceC19358 = dialogInterfaceC19357;
                        View view5 = viewM4976;
                        i24 = i6;
                        i35 = i5;
                        viewM4976 = view5;
                        short[] sArr33 = sArr14;
                        i18 = i18;
                        sArr13 = sArr13;
                        i29 = i4;
                        sArr15 = sArr15;
                        i30 = i30;
                        sArr16 = sArr16;
                        sArr14 = sArr33;
                    } else {
                        c8068 = c80611;
                        i10 = i11;
                        sArr12 = sArr32;
                        dialogInterfaceC19358 = dialogInterfaceC19357;
                        sArr10 = sArr10;
                        int iM4502110 = (C19806.m45029("ۗ۟") + i20) * 35;
                        obj2 = obj2;
                        sArr18 = sArr9;
                        checkBox4 = checkBox4;
                        c8068 = c8068;
                        sArr10 = sArr10;
                        interfaceC6028 = interfaceC6026;
                        int i311 = i10;
                        i35 = ((iM4502110 ^ i21) * 32227) ^ 1226044209;
                        onClickListener3 = onClickListener3;
                        i31 = i311;
                        View view6 = viewM4976;
                        i24 = iM4502110 ^ (-1375129663);
                        viewM4976 = view6;
                        short[] sArr210 = sArr14;
                        i18 = i18;
                        sArr13 = sArr13;
                        i29 = i4;
                        sArr15 = sArr15;
                        i30 = i30;
                        sArr16 = sArr16;
                        sArr14 = sArr210;
                    }
                    break;
                case -739561986:
                case 1214379896:
                    C1460.m5050();
                    if (!C2704.f10408) {
                        dialogInterfaceC19358 = dialogInterfaceC19358;
                        interfaceC6026 = interfaceC6028;
                        i12 = i31;
                        sArr9 = sArr18;
                        onClickListener3 = onClickListener3;
                        int i411 = i29;
                        sArr13 = sArr13;
                        i18 = i18;
                        sArr14 = sArr14;
                        sArr16 = sArr16;
                        i30 = i30;
                        sArr15 = sArr15;
                        i4 = i411;
                        iM11307 = C19806.m45029("ۢ᩻") ^ i21;
                        i35 = 1884155070 ^ ((iM11307 ^ i20) * 3271);
                        i13 = -533456894;
                        i24 = iM11307 ^ i13;
                        sArr18 = sArr9;
                        onClickListener3 = onClickListener3;
                        i31 = i12;
                        interfaceC6028 = interfaceC6026;
                        dialogInterfaceC19358 = dialogInterfaceC19358;
                        short[] sArr1111 = sArr14;
                        i18 = i18;
                        sArr13 = sArr13;
                        i29 = i4;
                        sArr15 = sArr15;
                        i30 = i30;
                        sArr16 = sArr16;
                        sArr14 = sArr1111;
                    } else {
                        dialogInterfaceC19356 = dialogInterfaceC19358;
                        interfaceC6028 = interfaceC6028;
                        i = i31;
                        sArr = sArr18;
                        onClickListener = onClickListener3;
                        sArr2 = sArr15;
                        i2 = i29;
                        sArr3 = sArr14;
                        sArr4 = sArr16;
                        iM11306 = ThreadFactoryC3888.m11306("ۙܰ") ^ i21;
                        i35 = ((iM11306 ^ i20) * 26123) ^ 848715165;
                        i3 = 621028338;
                        i24 = iM11306 ^ i3;
                        sArr16 = sArr4;
                        sArr14 = sArr3;
                        i29 = i2;
                        onClickListener3 = onClickListener;
                        sArr15 = sArr2;
                        i31 = i;
                        sArr18 = sArr;
                        dialogInterfaceC19358 = dialogInterfaceC19356;
                        interfaceC6028 = interfaceC6028;
                    }
                    break;
                case -579677152:
                case 1095698648:
                    C10948 c10949 = (C10948) C3743.m10957(viewM4976, iM11309 ^ i27);
                    this.f3037 = c10949;
                    interfaceC6027 = ApplicationC0716.f2992;
                    DialogInterfaceC19356 dialogInterfaceC193513 = dialogInterfaceC19358;
                    StringBuilder sb2 = new StringBuilder(ViewTreeObserverOnPreDrawListenerC3327.m9869(f3035, 93, 14, i22));
                    C1148.m4223(sb2, str2);
                    int iM113018 = (i20 - ThreadFactoryC3888.m11306("᩻ۢ")) * 11;
                    int i60 = ((iM113018 ^ i21) * (-4413)) ^ (-1196861925);
                    i24 = iM113018 ^ 310518768;
                    dialogInterfaceC19358 = dialogInterfaceC193513;
                    sb = sb2;
                    i35 = i60;
                    c10948 = c10949;
                    break;
                case -536335276:
                case 1981168993:
                    checkBox4 = checkBox4;
                    viewM4976 = viewM4976;
                    dialogInterfaceC19358 = dialogInterfaceC19358;
                    obj2 = obj2;
                    interfaceC6026 = interfaceC6028;
                    i31 = i31;
                    short[] sArr34 = sArr11;
                    int i61 = i32;
                    sArr9 = sArr18;
                    onClickListener3 = onClickListener3;
                    C8067 c80612 = c8068;
                    short[] sArr35 = sArr12;
                    int i62 = i29;
                    sArr13 = sArr13;
                    i18 = i18;
                    sArr14 = sArr14;
                    sArr16 = sArr16;
                    i30 = i30;
                    sArr15 = sArr15;
                    i4 = i62;
                    c8068 = c80612;
                    sArr10 = sArr10;
                    iM450212 = C19806.m45029(C0671.m3009(sArr10, 4, 3, i22));
                    i33 = 2122921863;
                    if (!C1377.f5749) {
                        i10 = i31;
                        i32 = i61;
                        sArr12 = sArr35;
                        dialogInterfaceC19358 = dialogInterfaceC19358;
                        sArr11 = sArr34;
                        int iM4502111 = (C19806.m45029("ۗ۟") + i20) * 35;
                        obj2 = obj2;
                        sArr18 = sArr9;
                        checkBox4 = checkBox4;
                        c8068 = c8068;
                        sArr10 = sArr10;
                        interfaceC6028 = interfaceC6026;
                        int i312 = i10;
                        i35 = ((iM4502111 ^ i21) * 32227) ^ 1226044209;
                        onClickListener3 = onClickListener3;
                        i31 = i312;
                        View view7 = viewM4976;
                        i24 = iM4502111 ^ (-1375129663);
                        viewM4976 = view7;
                        short[] sArr211 = sArr14;
                        i18 = i18;
                        sArr13 = sArr13;
                        i29 = i4;
                        sArr15 = sArr15;
                        i30 = i30;
                        sArr16 = sArr16;
                        sArr14 = sArr211;
                    } else {
                        int iM113019 = ThreadFactoryC3888.m11306("ۧ۫") ^ i21;
                        i35 = ((iM113019 ^ i20) * (-22831)) ^ 1211466350;
                        i32 = i61;
                        sArr12 = sArr35;
                        sArr18 = sArr9;
                        viewM4976 = viewM4976;
                        sArr11 = sArr34;
                        c8068 = c8068;
                        sArr10 = sArr10;
                        i24 = iM113019 ^ 583323911;
                        obj2 = obj2;
                        interfaceC6028 = interfaceC6026;
                        onClickListener3 = onClickListener3;
                        checkBox4 = checkBox4;
                        i31 = i31;
                        dialogInterfaceC19358 = dialogInterfaceC19358;
                        short[] sArr1112 = sArr14;
                        i18 = i18;
                        sArr13 = sArr13;
                        i29 = i4;
                        sArr15 = sArr15;
                        i30 = i30;
                        sArr16 = sArr16;
                        sArr14 = sArr1112;
                    }
                    break;
                case -482290379:
                case 193495734:
                    if (C3722.f13525 > 0) {
                        interfaceC6026 = interfaceC6028;
                        i10 = i31;
                        sArr9 = sArr18;
                        int i510 = i29;
                        sArr13 = sArr13;
                        i18 = i18;
                        sArr14 = sArr14;
                        sArr16 = sArr16;
                        i30 = i30;
                        sArr15 = sArr15;
                        i4 = i510;
                        int iM4502112 = (C19806.m45029("ۗ۟") + i20) * 35;
                        obj2 = obj2;
                        sArr18 = sArr9;
                        checkBox4 = checkBox4;
                        c8068 = c8068;
                        sArr10 = sArr10;
                        interfaceC6028 = interfaceC6026;
                        int i313 = i10;
                        i35 = ((iM4502112 ^ i21) * 32227) ^ 1226044209;
                        onClickListener3 = onClickListener3;
                        i31 = i313;
                        View view8 = viewM4976;
                        i24 = iM4502112 ^ (-1375129663);
                        viewM4976 = view8;
                        short[] sArr212 = sArr14;
                        i18 = i18;
                        sArr13 = sArr13;
                        i29 = i4;
                        sArr15 = sArr15;
                        i30 = i30;
                        sArr16 = sArr16;
                        sArr14 = sArr212;
                    } else {
                        checkBox = checkBox4;
                        view = viewM4976;
                        dialogInterfaceC19358 = dialogInterfaceC19358;
                        main = main2;
                        obj = obj2;
                        c8067 = c8068;
                        interfaceC6025 = interfaceC6028;
                        i31 = i31;
                        sArr5 = sArr10;
                        sArr6 = sArr11;
                        i7 = i32;
                        sArr7 = sArr12;
                        sArr8 = sArr18;
                        onClickListener2 = onClickListener3;
                        int i511 = i29;
                        sArr13 = sArr13;
                        i18 = i18;
                        sArr14 = sArr14;
                        sArr16 = sArr16;
                        i30 = i30;
                        sArr15 = sArr15;
                        i4 = i511;
                        iM45029 = C19806.m45029("᩵ۧ") ^ i20;
                        i8 = ((iM45029 ^ i21) * (-30859)) ^ 1542289168;
                        i9 = -288958247;
                        int i412 = iM45029 ^ i9;
                        main2 = main;
                        i32 = i7;
                        sArr12 = sArr7;
                        sArr18 = sArr8;
                        viewM4976 = view;
                        sArr11 = sArr6;
                        c8068 = c8067;
                        sArr10 = sArr5;
                        i24 = i412;
                        i35 = i8;
                        obj2 = obj;
                        interfaceC6028 = interfaceC6025;
                        onClickListener3 = onClickListener2;
                        checkBox4 = checkBox;
                        str2 = str;
                        i31 = i31;
                        dialogInterfaceC19358 = dialogInterfaceC19358;
                        short[] sArr1113 = sArr14;
                        i18 = i18;
                        sArr13 = sArr13;
                        i29 = i4;
                        sArr15 = sArr15;
                        i30 = i30;
                        sArr16 = sArr16;
                        sArr14 = sArr1113;
                    }
                    break;
                case -474275804:
                case -100409971:
                    if (C2477.m7593() >= 0) {
                        dialogInterfaceC19356 = dialogInterfaceC19358;
                        interfaceC6028 = interfaceC6028;
                        i = i31;
                        sArr = sArr18;
                        onClickListener = onClickListener3;
                        sArr2 = sArr15;
                        i2 = i29;
                        sArr3 = sArr14;
                        sArr4 = sArr16;
                        iM11306 = ThreadFactoryC3888.m11306("ۙܰ") ^ i21;
                        i35 = ((iM11306 ^ i20) * 26123) ^ 848715165;
                        i3 = 621028338;
                        i24 = iM11306 ^ i3;
                        sArr16 = sArr4;
                        sArr14 = sArr3;
                        i29 = i2;
                        onClickListener3 = onClickListener;
                        sArr15 = sArr2;
                        i31 = i;
                        sArr18 = sArr;
                        dialogInterfaceC19358 = dialogInterfaceC19356;
                        interfaceC6028 = interfaceC6028;
                    } else {
                        checkBox = checkBox4;
                        view = viewM4976;
                        dialogInterfaceC19358 = dialogInterfaceC19358;
                        main = main2;
                        obj = obj2;
                        c8067 = c8068;
                        interfaceC6025 = interfaceC6028;
                        i31 = i31;
                        sArr5 = sArr10;
                        sArr6 = sArr11;
                        i7 = i32;
                        sArr7 = sArr12;
                        sArr8 = sArr18;
                        onClickListener2 = onClickListener3;
                        int i512 = i29;
                        sArr13 = sArr13;
                        i18 = i18;
                        sArr14 = sArr14;
                        sArr16 = sArr16;
                        i30 = i30;
                        sArr15 = sArr15;
                        i4 = i512;
                        iM45029 = C19806.m45029("᩵ۧ") ^ i20;
                        i8 = ((iM45029 ^ i21) * (-30859)) ^ 1542289168;
                        i9 = -288958247;
                        int i413 = iM45029 ^ i9;
                        main2 = main;
                        i32 = i7;
                        sArr12 = sArr7;
                        sArr18 = sArr8;
                        viewM4976 = view;
                        sArr11 = sArr6;
                        c8068 = c8067;
                        sArr10 = sArr5;
                        i24 = i413;
                        i35 = i8;
                        obj2 = obj;
                        interfaceC6028 = interfaceC6025;
                        onClickListener3 = onClickListener2;
                        checkBox4 = checkBox;
                        str2 = str;
                        i31 = i31;
                        dialogInterfaceC19358 = dialogInterfaceC19358;
                        short[] sArr1114 = sArr14;
                        i18 = i18;
                        sArr13 = sArr13;
                        i29 = i4;
                        sArr15 = sArr15;
                        i30 = i30;
                        sArr16 = sArr16;
                        sArr14 = sArr1114;
                    }
                    break;
                case 289048917:
                case 1731300024:
                    dialogInterfaceC19358 = dialogInterfaceC19358;
                    interfaceC6026 = interfaceC6028;
                    i12 = i31;
                    sArr9 = sArr18;
                    checkBox4 = (CheckBox) C3743.m10957(viewM4976, iM11308 ^ i26);
                    onClickListener3 = onClickListener3;
                    checkBox2 = (CheckBox) C2642.m8167(viewM4976, C19806.m45029(C1066.m4040(f3035, 34, 3, i22)) ^ 2122962676);
                    int iM450220 = (i21 - C19806.m45029("ܿۗ")) * (-65);
                    i14 = ((iM450220 ^ i20) * 31255) ^ (-1624769054);
                    i24 = iM450220 ^ (-509478726);
                    sArr17 = sArr17;
                    sArr18 = sArr9;
                    i35 = i14;
                    interfaceC6028 = interfaceC6026;
                    onClickListener3 = onClickListener3;
                    i31 = i12;
                    dialogInterfaceC19358 = dialogInterfaceC19358;
                    break;
                case 794152044:
                case 1453510088:
                    C3286.m9797(c10948, RunnableC0195.m1433(interfaceC6027, C0817.m3407(sb), ""));
                    C8875.m23019(dialogInterfaceC19358);
                    dialogInterfaceC19358.m44367(new DialogInterface.OnDismissListener(this) { // from class: l.ᩳ᩻ۨ

                        /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ ViewOnClickListenerC0744 f58626;

                        {
                            int i63 = -631597822;
                            int i64 = C7105.f23796;
                            int i65 = RunnableC0195.f1321;
                            int iM113020 = ThreadFactoryC3888.m11306("۟ۜ") ^ i64;
                            int i66 = ((iM113020 ^ i65) * 29875) ^ 668619188;
                            int i67 = -2020802768;
                            while (true) {
                                i63 = ((((i63 ^ i65) * (-7561)) >> 31) & i66) ^ (iM113020 ^ i67);
                                switch (i63) {
                                    case -2096590633:
                                    case -1616056631:
                                        if (CallableC1627.m5507() != 0) {
                                            iM113020 = ThreadFactoryC3888.m11306("۫֫") ^ i65;
                                            i66 = ((iM113020 ^ i64) * (-22043)) ^ 63322680;
                                            i67 = 972896276;
                                        } else {
                                            iM113020 = C19806.m45029("۠֫") ^ i64;
                                            i66 = ((iM113020 ^ i65) * (-6989)) ^ 1801551991;
                                            i67 = 795743518;
                                        }
                                        break;
                                    case -1781344837:
                                    case 1739987992:
                                        if (ThreadFactoryC3888.f14547 <= 0) {
                                            iM113020 = ThreadFactoryC3888.m11306("۫֫") ^ i65;
                                            i66 = ((iM113020 ^ i64) * (-22043)) ^ 63322680;
                                            i67 = 972896276;
                                        } else {
                                            iM113020 = (ThreadFactoryC3888.m11306("۬ۨ") + i65) * (-115);
                                            i66 = ((iM113020 ^ i64) * (-24253)) ^ 319771953;
                                            i67 = -418901672;
                                        }
                                        break;
                                    case -1708641689:
                                    case -575930093:
                                        if (C1025.f4800 >= 0) {
                                            iM113020 = (i64 - ThreadFactoryC3888.m11306("ۗ֫")) * 17;
                                            i66 = ((iM113020 ^ i65) * (-18279)) ^ (-1619400656);
                                            i67 = 1149284454;
                                        } else {
                                            iM113020 = ThreadFactoryC3888.m11306("ۗۜ") ^ i65;
                                            i66 = ((iM113020 ^ i64) * 10109) ^ 1114847284;
                                            i67 = -447357747;
                                        }
                                        break;
                                    case -1530075398:
                                    case 1182847099:
                                        C0962.m3746();
                                        RunnableC1564.m5345();
                                        iM113020 = (ThreadFactoryC3888.m11306("֫֫") + i64) * 3;
                                        i66 = ((iM113020 ^ i65) * (-21735)) ^ 1976420146;
                                        i67 = -1318524087;
                                        break;
                                    case -1514933204:
                                    case -86336001:
                                        if (C0962.f3784) {
                                            iM113020 = ThreadFactoryC3888.m11306("ۗۜ") ^ i65;
                                            i66 = ((iM113020 ^ i64) * 10109) ^ 1114847284;
                                            i67 = -447357747;
                                        } else {
                                            iM113020 = (ThreadFactoryC3888.m11306("ᩳ۟") + i65) * 49;
                                            i66 = ((iM113020 ^ i64) * (-27935)) ^ (-1408936146);
                                            i67 = 740442668;
                                        }
                                        break;
                                    case -1291907131:
                                    case 874218317:
                                        if (!C0526.f2219) {
                                            iM113020 = (ThreadFactoryC3888.m11306("֫֫") + i64) * 3;
                                            i66 = ((iM113020 ^ i65) * (-21735)) ^ 1976420146;
                                            i67 = -1318524087;
                                        } else {
                                            iM113020 = (i65 - ThreadFactoryC3888.m11306("ۗ᩻")) * (-109);
                                            i66 = ((iM113020 ^ i64) * (-30621)) ^ (-971210328);
                                            i67 = 1759003657;
                                        }
                                        break;
                                    case -557122885:
                                    case -110707038:
                                        if (C1066.m4023() <= 0) {
                                            iM113020 = (ThreadFactoryC3888.m11306("֫֫") + i64) * 3;
                                            i66 = ((iM113020 ^ i65) * (-21735)) ^ 1976420146;
                                            i67 = -1318524087;
                                        } else {
                                            iM113020 = (C19806.m45029("ۨۨ") ^ i65) * (-73);
                                            i66 = ((iM113020 ^ i64) * 22981) ^ 1831900312;
                                            i67 = 1369471475;
                                        }
                                        break;
                                    case -500522327:
                                    case -21103726:
                                        return;
                                    case -452289798:
                                    case 257600632:
                                        if (C3577.m10565()) {
                                            iM113020 = (ThreadFactoryC3888.m11306("ۘۨ") ^ i65) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                                            i66 = ((iM113020 ^ i64) * 20513) ^ (-849825615);
                                            i67 = -1395444703;
                                        } else {
                                            iM113020 = (i64 - ThreadFactoryC3888.m11306("ۗ֫")) * 17;
                                            i66 = ((iM113020 ^ i65) * (-18279)) ^ (-1619400656);
                                            i67 = 1149284454;
                                        }
                                        break;
                                    case -297274140:
                                    case -186232808:
                                        C0629.m2907();
                                        C3743.m10966();
                                        throw new RuntimeException();
                                    case 429898918:
                                    case 1361035228:
                                        if (C1460.m5050() != 0) {
                                            iM113020 = (i65 - ThreadFactoryC3888.m11306("ۗ᩻")) * (-109);
                                            i66 = ((iM113020 ^ i64) * (-30621)) ^ (-971210328);
                                            i67 = 1759003657;
                                        } else {
                                            iM113020 = ThreadFactoryC3888.m11306("ۗ۬") ^ i65;
                                            i66 = ((iM113020 ^ i64) * 5637) ^ 94000846;
                                            i67 = -2093886684;
                                        }
                                        break;
                                    case 551870338:
                                    case 1800801505:
                                        if (C0962.f3784) {
                                            iM113020 = ThreadFactoryC3888.m11306("ۗۜ") ^ i65;
                                            i66 = ((iM113020 ^ i64) * 10109) ^ 1114847284;
                                            i67 = -447357747;
                                        } else {
                                            iM113020 = C19806.m45029("᩺ܳ") ^ i64;
                                            i66 = ((iM113020 ^ i65) * 1529) ^ (-1105929218);
                                            i67 = -1378782514;
                                        }
                                        break;
                                    case 689687781:
                                    case 1307079106:
                                        this.f58626 = this;
                                        if (C3743.f13569) {
                                            iM113020 = (ThreadFactoryC3888.m11306("ۢܽ") + i64) * 11;
                                            i66 = ((iM113020 ^ i65) * (-10747)) ^ 281612264;
                                            i67 = 1262460172;
                                        } else {
                                            iM113020 = ThreadFactoryC3888.m11306("۫֫") ^ i65;
                                            i66 = ((iM113020 ^ i64) * (-22043)) ^ 63322680;
                                            i67 = 972896276;
                                        }
                                        break;
                                    case 903317549:
                                    case 1890452675:
                                        if (C7105.f23796 >= 0) {
                                            iM113020 = ThreadFactoryC3888.m11306("۫֫") ^ i65;
                                            i66 = ((iM113020 ^ i64) * (-22043)) ^ 63322680;
                                            i67 = 972896276;
                                        } else {
                                            iM113020 = ThreadFactoryC3888.m11306("᩺ۗ") ^ i64;
                                            i66 = ((iM113020 ^ i65) * (-7467)) ^ 480128014;
                                            i67 = 676187163;
                                        }
                                        break;
                                    case 1451296980:
                                    case 1609175530:
                                        if (C1025.f4800 < 0) {
                                            iM113020 = ThreadFactoryC3888.m11306("ۗۜ") ^ i65;
                                            i66 = ((iM113020 ^ i64) * 10109) ^ 1114847284;
                                            i67 = -447357747;
                                        } else {
                                            iM113020 = (ThreadFactoryC3888.m11306("֫֫") + i64) * 3;
                                            i66 = ((iM113020 ^ i65) * (-21735)) ^ 1976420146;
                                            i67 = -1318524087;
                                        }
                                        break;
                                    default:
                                        if (C3743.f13569) {
                                            iM113020 = (ThreadFactoryC3888.m11306("᩵֫") ^ i64) * 39;
                                            i66 = ((iM113020 ^ i65) * 19695) ^ 1476804250;
                                            i67 = 1248687910;
                                        } else {
                                            iM113020 = (i64 - ThreadFactoryC3888.m11306("ۗ֫")) * 17;
                                            i66 = ((iM113020 ^ i65) * (-18279)) ^ (-1619400656);
                                            i67 = 1149284454;
                                        }
                                        break;
                                }
                            }
                        }

                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            ViewOnClickListenerC0744 viewOnClickListenerC0744 = null;
                            int i63 = 187027758;
                            int i64 = C2124.f7782;
                            int i65 = C0278.f1572;
                            int iM450221 = (C19806.m45029("ܿ᩵") ^ i65) * (-91);
                            int i66 = ((iM450221 ^ i64) * (-25535)) ^ (-1313522238);
                            int i67 = -1024526917;
                            while (true) {
                                i63 = ((((i63 ^ i64) * (-32489)) >> 31) & i66) ^ (iM450221 ^ i67);
                                switch (i63) {
                                    case -2117738575:
                                    case -1605806254:
                                        if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                                            iM450221 = (ThreadFactoryC3888.m11306("ܰܽ") + i64) * 3;
                                            i66 = ((iM450221 ^ i65) * (-9581)) ^ 309784654;
                                            i67 = 684974341;
                                        } else {
                                            iM450221 = (i65 - ThreadFactoryC3888.m11306("۬᩵")) * 7;
                                            i66 = ((iM450221 ^ i64) * (-8003)) ^ (-1626598566);
                                            i67 = -150172293;
                                        }
                                        break;
                                    case -2029499838:
                                    case -1012360814:
                                        if (C0629.f2722 <= 0) {
                                            iM450221 = C19806.m45029("֨ᩳ") ^ i64;
                                            i66 = ((iM450221 ^ i65) * (-24413)) ^ 1369417749;
                                            i67 = 1301685243;
                                        } else {
                                            iM450221 = (C19806.m45029("֫ۡ") ^ i64) * (-121);
                                            i66 = ((iM450221 ^ i65) * (-30253)) ^ (-145068160);
                                            i67 = -1282444070;
                                        }
                                        break;
                                    case -1595031266:
                                    case -925261293:
                                        if (C1066.f4915 <= 0) {
                                            iM450221 = (i64 - ThreadFactoryC3888.m11306("ܶ᩺")) * (-39);
                                            i66 = ((iM450221 ^ i65) * (-29907)) ^ 1789216752;
                                            i67 = 537027038;
                                        } else {
                                            iM450221 = (i64 - C19806.m45029("۠᩺")) * (-27);
                                            i66 = ((iM450221 ^ i65) * 8493) ^ (-119738197);
                                            i67 = 150147310;
                                        }
                                        break;
                                    case -1422447123:
                                    case 44414279:
                                        ViewOnClickListenerC0744.m3217(viewOnClickListenerC0744, str2);
                                        break;
                                    case -1393985477:
                                    case 1219678274:
                                        viewOnClickListenerC0744 = this.f58626;
                                        if (C0278.m1789() <= 0) {
                                            iM450221 = (i65 - ThreadFactoryC3888.m11306("۬᩵")) * 7;
                                            i66 = ((iM450221 ^ i64) * (-8003)) ^ (-1626598566);
                                            i67 = -150172293;
                                        } else {
                                            iM450221 = ThreadFactoryC3888.m11306("᩵ᩴ") ^ i64;
                                            i66 = ((iM450221 ^ i65) * (-9933)) ^ 1814103235;
                                            i67 = -592452231;
                                        }
                                        break;
                                    case -1142414321:
                                    case 778350082:
                                        if (C1977.m6356()) {
                                            iM450221 = C19806.m45029("֨ᩳ") ^ i64;
                                            i66 = ((iM450221 ^ i65) * (-24413)) ^ 1369417749;
                                            i67 = 1301685243;
                                        } else {
                                            iM450221 = C19806.m45029("֫᩷") ^ i65;
                                            i66 = ((iM450221 ^ i64) * (-3535)) ^ (-834307952);
                                            i67 = -1702919415;
                                        }
                                        break;
                                    case -1142050562:
                                    case 1309058381:
                                        if (C2788.m8472() != 0) {
                                            iM450221 = C19806.m45029("ۡۢ") ^ i65;
                                            i66 = ((iM450221 ^ i64) * (-16931)) ^ (-1112264812);
                                            i67 = -496954238;
                                        } else {
                                            iM450221 = (i65 - C19806.m45029("۬ۗ")) * 57;
                                            i66 = ((iM450221 ^ i64) * 1181) ^ (-1690955242);
                                            i67 = 799257602;
                                        }
                                        break;
                                    case -1003917039:
                                    case -748841643:
                                        if (C1419.f5860 >= 0) {
                                            iM450221 = ThreadFactoryC3888.m11306("ܿ۫") ^ i65;
                                            i66 = ((iM450221 ^ i64) * (-26799)) ^ 1010443124;
                                            i67 = -17157468;
                                        } else {
                                            iM450221 = C19806.m45029("ۘ᩹") ^ i65;
                                            i66 = ((iM450221 ^ i64) * 11999) ^ 2064324074;
                                            i67 = -1315006979;
                                        }
                                        break;
                                    case -477243825:
                                    case 1066048987:
                                        C1977.m6356();
                                        C7105.m18985();
                                        iM450221 = C19806.m45029("֨ᩳ") ^ i64;
                                        i66 = ((iM450221 ^ i65) * (-24413)) ^ 1369417749;
                                        i67 = 1301685243;
                                        break;
                                    case -411645135:
                                    case 737814569:
                                        RunnableC1564.m5345();
                                        if (C7105.f23796 >= 0) {
                                            iM450221 = ThreadFactoryC3888.m11306("ܿ۫") ^ i65;
                                            i66 = ((iM450221 ^ i64) * (-26799)) ^ 1010443124;
                                            i67 = -17157468;
                                        } else {
                                            iM450221 = C19806.m45029("֨ᩳ") ^ i64;
                                            i66 = ((iM450221 ^ i65) * (-24413)) ^ 1369417749;
                                            i67 = 1301685243;
                                        }
                                        break;
                                    case -15283260:
                                    case 806032425:
                                        if (C2249.f8050 < 0) {
                                            iM450221 = (i64 - ThreadFactoryC3888.m11306("ܶ᩺")) * (-39);
                                            i66 = ((iM450221 ^ i65) * (-29907)) ^ 1789216752;
                                            i67 = 537027038;
                                        } else {
                                            iM450221 = C19806.m45029("֨ᩳ") ^ i64;
                                            i66 = ((iM450221 ^ i65) * (-24413)) ^ 1369417749;
                                            i67 = 1301685243;
                                        }
                                        break;
                                    case 414289650:
                                    case 1152670318:
                                        if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                                            iM450221 = ThreadFactoryC3888.m11306("ܿ۫") ^ i65;
                                            i66 = ((iM450221 ^ i64) * (-26799)) ^ 1010443124;
                                            i67 = -17157468;
                                        } else {
                                            iM450221 = C19806.m45029("ۡ۠") ^ i65;
                                            i66 = ((iM450221 ^ i64) * 23787) ^ 915929202;
                                            i67 = -1119975382;
                                        }
                                        break;
                                    case 472181371:
                                    case 973958203:
                                        C10634.m26820();
                                        C1461.m5080();
                                        break;
                                    case 1282101594:
                                    case 1782657787:
                                        if (C10634.f36300 >= 0) {
                                            iM450221 = C19806.m45029("֨ᩳ") ^ i64;
                                            i66 = ((iM450221 ^ i65) * (-24413)) ^ 1369417749;
                                            i67 = 1301685243;
                                        } else {
                                            iM450221 = C19806.m45029("֡۬") ^ i64;
                                            i66 = ((iM450221 ^ i65) * 5905) ^ 2059234185;
                                            i67 = 167563181;
                                        }
                                        break;
                                    case 1428506163:
                                    case 2120744141:
                                        if (C3535.f13026 <= 0) {
                                            iM450221 = (i64 - ThreadFactoryC3888.m11306("ܶ᩺")) * (-39);
                                            i66 = ((iM450221 ^ i65) * (-29907)) ^ 1789216752;
                                            i67 = 537027038;
                                        } else {
                                            iM450221 = (i65 - C19806.m45029("᩶۬")) * (-111);
                                            i66 = ((iM450221 ^ i64) * (-12469)) ^ 1251723043;
                                            i67 = -2128341298;
                                        }
                                        break;
                                    default:
                                        if (C1025.f4800 >= 0) {
                                            iM450221 = C19806.m45029("ۡۢ") ^ i65;
                                            i66 = ((iM450221 ^ i64) * (-16931)) ^ (-1112264812);
                                            i67 = -496954238;
                                        } else {
                                            iM450221 = C19806.m45029("֨ᩳ") ^ i64;
                                            i66 = ((iM450221 ^ i65) * (-24413)) ^ 1369417749;
                                            i67 = 1301685243;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    C7105.m18993(C1398.m4897(dialogInterfaceC19358), new View.OnClickListener(this) { // from class: l.ᩴ᩻ۨ

                        /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ ViewOnClickListenerC0744 f61679;

                        {
                            int i63 = 856030129;
                            int i64 = C0629.f2722;
                            int i65 = C1875.f7103;
                            int iM113020 = ThreadFactoryC3888.m11306("᩸۬") ^ i65;
                            int i66 = ((iM113020 ^ i64) * (-14015)) ^ (-951956614);
                            int i67 = 1654855578;
                            while (true) {
                                i63 = ((((i63 ^ i64) * 18841) >> 31) & i66) ^ (iM113020 ^ i67);
                                switch (i63) {
                                    case -1986969789:
                                    case -1856065436:
                                        this.f61679 = this;
                                        if (C1377.m4833() != 0) {
                                            iM113020 = (C19806.m45029("᩸ܺ") + i65) * (-115);
                                            i66 = ((iM113020 ^ i64) * 5707) ^ (-176882454);
                                            i67 = 1727801615;
                                        } else {
                                            iM113020 = ThreadFactoryC3888.m11306("ܿ֡") ^ i64;
                                            i66 = ((iM113020 ^ i65) * 20753) ^ 1243180242;
                                            i67 = -277074041;
                                        }
                                        break;
                                    case -1980217134:
                                    case -692003947:
                                        if (C1937.m6279() >= 0) {
                                            iM113020 = (C19806.m45029("᩸ܺ") + i65) * (-115);
                                            i66 = ((iM113020 ^ i64) * 5707) ^ (-176882454);
                                            i67 = 1727801615;
                                        } else {
                                            iM113020 = (C19806.m45029("۫᩺") ^ i64) * 7;
                                            i66 = ((iM113020 ^ i65) * (-14355)) ^ (-201789101);
                                            i67 = 493097963;
                                        }
                                        break;
                                    case -1799508644:
                                    case 1444665703:
                                        if (C1461.f5957 <= 0) {
                                            iM113020 = (C19806.m45029("᩸ܺ") + i65) * (-115);
                                            i66 = ((iM113020 ^ i64) * 5707) ^ (-176882454);
                                            i67 = 1727801615;
                                        } else {
                                            iM113020 = C19806.m45029("ۢۧ") ^ i64;
                                            i66 = ((iM113020 ^ i65) * (-22977)) ^ (-791006963);
                                            i67 = -930959169;
                                        }
                                        break;
                                    case -1787956538:
                                    case 1261372181:
                                        if (C3722.m10894() <= 0) {
                                            iM113020 = ThreadFactoryC3888.m11306("ۗ۟") ^ i64;
                                            i66 = ((iM113020 ^ i65) * 1035) ^ (-717468828);
                                            i67 = -795088324;
                                        } else {
                                            iM113020 = (i64 - ThreadFactoryC3888.m11306("۠ۢ")) * 65;
                                            i66 = ((iM113020 ^ i65) * 24201) ^ 108936226;
                                            i67 = -538969093;
                                        }
                                        break;
                                    case -1724935640:
                                    case -1678307225:
                                        if (C0216.m1591() <= 0) {
                                            iM113020 = ThreadFactoryC3888.m11306("ۗۡ") ^ i65;
                                            i66 = ((iM113020 ^ i64) * (-28697)) ^ (-117625999);
                                            i67 = 1451851800;
                                        } else {
                                            iM113020 = C19806.m45029("ۡᩴ") ^ i65;
                                            i66 = ((iM113020 ^ i64) * (-5947)) ^ 326926469;
                                            i67 = 1039214475;
                                        }
                                        break;
                                    case -1640105796:
                                    case 1840992695:
                                        C7105.m18985();
                                        if (C2704.m8255() > 0) {
                                            iM113020 = ThreadFactoryC3888.m11306("ۗۡ") ^ i65;
                                            i66 = ((iM113020 ^ i64) * (-28697)) ^ (-117625999);
                                            i67 = 1451851800;
                                        } else {
                                            iM113020 = (ThreadFactoryC3888.m11306("ۨۛ") + i64) * (-13);
                                            i66 = ((iM113020 ^ i65) * (-21077)) ^ 1238919239;
                                            i67 = 1390496152;
                                        }
                                        break;
                                    case -1111996065:
                                    case -689745893:
                                        C2788.m8472();
                                        if (!C1668.m5583()) {
                                            iM113020 = (C19806.m45029("᩸ܺ") + i65) * (-115);
                                            i66 = ((iM113020 ^ i64) * 5707) ^ (-176882454);
                                            i67 = 1727801615;
                                        } else {
                                            iM113020 = ThreadFactoryC3888.m11306("ۗ۟") ^ i64;
                                            i66 = ((iM113020 ^ i65) * 1035) ^ (-717468828);
                                            i67 = -795088324;
                                        }
                                        break;
                                    case -1007362032:
                                    case 851032063:
                                        if (C2477.f9839 <= 0) {
                                            iM113020 = (ThreadFactoryC3888.m11306("ۨۛ") + i64) * (-13);
                                            i66 = ((iM113020 ^ i65) * (-21077)) ^ 1238919239;
                                            i67 = 1390496152;
                                        } else {
                                            iM113020 = (C19806.m45029("᩸ܺ") + i65) * (-115);
                                            i66 = ((iM113020 ^ i64) * 5707) ^ (-176882454);
                                            i67 = 1727801615;
                                        }
                                        break;
                                    case -846976592:
                                    case 2056739135:
                                        if (C1025.f4800 >= 0) {
                                            iM113020 = (ThreadFactoryC3888.m11306("ۨۛ") + i64) * (-13);
                                            i66 = ((iM113020 ^ i65) * (-21077)) ^ 1238919239;
                                            i67 = 1390496152;
                                        } else {
                                            iM113020 = C19806.m45029("᩷ۨ") ^ i64;
                                            i66 = ((iM113020 ^ i65) * 20323) ^ 153667559;
                                            i67 = -1975289411;
                                        }
                                        break;
                                    case -616315524:
                                    case 821288633:
                                        if (RunnableC3388.m10064()) {
                                            iM113020 = (ThreadFactoryC3888.m11306("ܳܳ") + i65) * (-5);
                                            i66 = ((iM113020 ^ i64) * 15625) ^ (-1663694998);
                                            i67 = -2082330312;
                                        } else {
                                            iM113020 = C19806.m45029("ۖۜ") ^ i64;
                                            i66 = ((iM113020 ^ i65) * (-18389)) ^ (-1290555026);
                                            i67 = 2127846325;
                                        }
                                        break;
                                    case -605176770:
                                    case 50577127:
                                        if (C0629.f2722 <= 0) {
                                            iM113020 = C19806.m45029("ۖۜ") ^ i64;
                                            i66 = ((iM113020 ^ i65) * (-18389)) ^ (-1290555026);
                                            i67 = 2127846325;
                                        } else {
                                            iM113020 = (i65 - ThreadFactoryC3888.m11306("ۤܺ")) * (-15);
                                            i66 = ((iM113020 ^ i64) * 27303) ^ (-1234155558);
                                            i67 = -173481769;
                                        }
                                        break;
                                    case -337365881:
                                    case -73614402:
                                        return;
                                    case -65857279:
                                    case -32938232:
                                        if (C1377.f5749) {
                                            iM113020 = C19806.m45029("᩷᩹") ^ i65;
                                            i66 = ((iM113020 ^ i64) * 13901) ^ 2071552201;
                                            i67 = -1111504152;
                                        } else {
                                            iM113020 = ThreadFactoryC3888.m11306("ۗ۟") ^ i64;
                                            i66 = ((iM113020 ^ i65) * 1035) ^ (-717468828);
                                            i67 = -795088324;
                                        }
                                        break;
                                    case 56388715:
                                    case 830240812:
                                        C2477.m7593();
                                        C1189.m4368();
                                        throw new RuntimeException();
                                    case 1107956641:
                                    case 1452119975:
                                        if (C0962.m3746() >= 0) {
                                            iM113020 = ThreadFactoryC3888.m11306("ۗۡ") ^ i65;
                                            i66 = ((iM113020 ^ i64) * (-28697)) ^ (-117625999);
                                            i67 = 1451851800;
                                        } else {
                                            iM113020 = (i65 - ThreadFactoryC3888.m11306("۟ܰ")) * (-119);
                                            i66 = ((iM113020 ^ i64) * 1953) ^ 1406597283;
                                            i67 = -91362245;
                                        }
                                        break;
                                    default:
                                        C3577.m10565();
                                        iM113020 = (C19806.m45029("᩸ܺ") + i65) * (-115);
                                        i66 = ((iM113020 ^ i64) * 5707) ^ (-176882454);
                                        i67 = 1727801615;
                                        break;
                                }
                            }
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view9) {
                            String str4 = null;
                            CheckBox checkBox5 = null;
                            int i63 = 2040577789;
                            int i64 = C1937.f7317;
                            int i65 = C2788.f10625;
                            int iM450221 = (C19806.m45029("ۡܳ") ^ i65) * (-47);
                            int i66 = ((iM450221 ^ i64) * (-29297)) ^ (-1006780826);
                            int i67 = 821180268;
                            while (true) {
                                i63 = ((((i63 ^ i64) * 31589) >> 31) & i66) ^ (iM450221 ^ i67);
                                switch (i63) {
                                    case -1984839544:
                                    case -547741335:
                                        if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                                            iM450221 = (C19806.m45029("ᩴۘ") + i64) * 21;
                                            i66 = ((iM450221 ^ i65) * (-16459)) ^ (-190092542);
                                            i67 = -240098300;
                                        } else {
                                            iM450221 = (ThreadFactoryC3888.m11306("ۚ۠") ^ i65) * 89;
                                            i66 = ((iM450221 ^ i64) * (-15193)) ^ (-1189666350);
                                            i67 = 1917389158;
                                        }
                                        break;
                                    case -1930412485:
                                    case -1264254897:
                                        if (RunnableC3388.m10064()) {
                                            iM450221 = ThreadFactoryC3888.m11306("᩷ۙ") ^ i64;
                                            i66 = ((iM450221 ^ i65) * 11375) ^ 699897020;
                                            i67 = 271856073;
                                        } else {
                                            iM450221 = (ThreadFactoryC3888.m11306("֫ۛ") ^ i65) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                                            i66 = ((iM450221 ^ i64) * 25017) ^ 942042867;
                                            i67 = 1599119706;
                                        }
                                        break;
                                    case -1685396675:
                                    case 852987138:
                                        if (C1875.m6086() != 0) {
                                            iM450221 = (i64 - ThreadFactoryC3888.m11306("ۗۧ")) * 67;
                                            i66 = ((iM450221 ^ i65) * (-8893)) ^ (-234585496);
                                            i67 = 2031370943;
                                        } else {
                                            iM450221 = (i64 - ThreadFactoryC3888.m11306("ۘ᩹")) * (-75);
                                            i66 = ((iM450221 ^ i65) * (-4147)) ^ (-990098377);
                                            i67 = -1321484879;
                                        }
                                        break;
                                    case -1492577631:
                                    case -845540372:
                                        if (C1398.f5802 <= 0) {
                                            iM450221 = (i64 - ThreadFactoryC3888.m11306("ۗۧ")) * 67;
                                            i66 = ((iM450221 ^ i65) * (-8893)) ^ (-234585496);
                                            i67 = 2031370943;
                                        } else {
                                            iM450221 = (ThreadFactoryC3888.m11306("֡᩵") ^ i65) * 15;
                                            i66 = ((iM450221 ^ i64) * (-4401)) ^ (-1473120521);
                                            i67 = -322742396;
                                        }
                                        break;
                                    case -1180482783:
                                    case 982756527:
                                        str4 = str2;
                                        if (C1377.f5749) {
                                            iM450221 = ThreadFactoryC3888.m11306("᩶ۨ") ^ i64;
                                            i66 = ((iM450221 ^ i65) * 179) ^ 1106441827;
                                            i67 = -166756599;
                                        } else {
                                            iM450221 = ThreadFactoryC3888.m11306("᩶ᩳ") ^ i64;
                                            i66 = ((iM450221 ^ i65) * (-20771)) ^ 112612848;
                                            i67 = -1857578004;
                                        }
                                        break;
                                    case -888329208:
                                    case 1739049987:
                                        if (!C3743.f13569) {
                                            iM450221 = (ThreadFactoryC3888.m11306("ۚ۠") ^ i65) * 89;
                                            i66 = ((iM450221 ^ i64) * (-15193)) ^ (-1189666350);
                                            i67 = 1917389158;
                                        } else {
                                            iM450221 = ThreadFactoryC3888.m11306("᩶ᩳ") ^ i64;
                                            i66 = ((iM450221 ^ i65) * (-20771)) ^ 112612848;
                                            i67 = -1857578004;
                                        }
                                        break;
                                    case -816526082:
                                    case 498086230:
                                        checkBox5 = checkBox3;
                                        if (C3722.f13525 <= 0) {
                                            iM450221 = C19806.m45029("ۖۡ") ^ i65;
                                            i66 = ((iM450221 ^ i64) * 27557) ^ (-1587364077);
                                            i67 = 549405685;
                                        } else {
                                            iM450221 = (C19806.m45029("᩶ۙ") ^ i65) * 47;
                                            i66 = ((iM450221 ^ i64) * 13539) ^ 1135348962;
                                            i67 = -1710351266;
                                        }
                                        break;
                                    case -666826024:
                                    case 1093943181:
                                        if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                                            iM450221 = ThreadFactoryC3888.m11306("᩶ᩳ") ^ i64;
                                            i66 = ((iM450221 ^ i65) * (-20771)) ^ 112612848;
                                            i67 = -1857578004;
                                        } else {
                                            iM450221 = (C19806.m45029("ܺۨ") + i65) * (-83);
                                            i66 = ((iM450221 ^ i64) * 859) ^ (-825342867);
                                            i67 = 446545493;
                                        }
                                        break;
                                    case -633381429:
                                    case -179211288:
                                        C0216.m1591();
                                        if (!C1419.m4973()) {
                                            iM450221 = (i64 - ThreadFactoryC3888.m11306("ۗۧ")) * 67;
                                            i66 = ((iM450221 ^ i65) * (-8893)) ^ (-234585496);
                                            i67 = 2031370943;
                                        } else {
                                            iM450221 = (ThreadFactoryC3888.m11306("ۚ۠") ^ i65) * 89;
                                            i66 = ((iM450221 ^ i64) * (-15193)) ^ (-1189666350);
                                            i67 = 1917389158;
                                        }
                                        break;
                                    case -592996443:
                                    case 1832692805:
                                        ViewOnClickListenerC0744.m3221(this.f61679, dialogInterfaceC19358, str4, checkBox5);
                                        break;
                                    case -537020243:
                                    case -74743834:
                                        if (C3722.f13525 <= 0) {
                                            iM450221 = (ThreadFactoryC3888.m11306("ۚ۠") ^ i65) * 89;
                                            i66 = ((iM450221 ^ i64) * (-15193)) ^ (-1189666350);
                                            i67 = 1917389158;
                                        } else {
                                            iM450221 = ThreadFactoryC3888.m11306("֫᩷") ^ i64;
                                            i66 = ((iM450221 ^ i65) * 11469) ^ 490440562;
                                            i67 = 456085448;
                                        }
                                        break;
                                    case -485750256:
                                    case -258740087:
                                        if (MenuItemOnMenuItemClickListenerC3244.m9701() >= 0) {
                                            iM450221 = (ThreadFactoryC3888.m11306("֫ۛ") ^ i65) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                                            i66 = ((iM450221 ^ i64) * 25017) ^ 942042867;
                                            i67 = 1599119706;
                                        } else {
                                            iM450221 = (C19806.m45029("֨᩵") + i65) * (-37);
                                            i66 = ((iM450221 ^ i64) * (-17733)) ^ 1222850891;
                                            i67 = 646801779;
                                        }
                                        break;
                                    case -337415198:
                                    case 2063114300:
                                        ViewTreeObserverOnPreDrawListenerC3327.m9874();
                                        CallableC1627.m5507();
                                        break;
                                    case 904933400:
                                    case 1300294172:
                                        C1461.m5080();
                                        iM450221 = ThreadFactoryC3888.m11306("᩶ᩳ") ^ i64;
                                        i66 = ((iM450221 ^ i65) * (-20771)) ^ 112612848;
                                        i67 = -1857578004;
                                        break;
                                    case 1680910458:
                                    case 2039736400:
                                        if (C1189.f5284 <= 0) {
                                            iM450221 = C19806.m45029("ۖۡ") ^ i65;
                                            i66 = ((iM450221 ^ i64) * 27557) ^ (-1587364077);
                                            i67 = 549405685;
                                        } else {
                                            iM450221 = (ThreadFactoryC3888.m11306("᩷ۜ") + i65) * (-107);
                                            i66 = ((iM450221 ^ i64) * 24279) ^ (-1647936926);
                                            i67 = 523906188;
                                        }
                                        break;
                                    default:
                                        C2642.m8171();
                                        if (C2871.f10837 >= 0) {
                                            iM450221 = (ThreadFactoryC3888.m11306("֫ۛ") ^ i65) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                                            i66 = ((iM450221 ^ i64) * 25017) ^ 942042867;
                                            i67 = 1599119706;
                                        } else {
                                            iM450221 = ThreadFactoryC3888.m11306("᩶ᩳ") ^ i64;
                                            i66 = ((iM450221 ^ i65) * (-20771)) ^ 112612848;
                                            i67 = -1857578004;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    return;
                case 1514465766:
                case 1600775844:
                    DialogInterfaceC19356 dialogInterfaceC193514 = dialogInterfaceC19358;
                    int i63 = i17;
                    short[] sArr36 = sArr16;
                    int i64 = i31;
                    View.OnClickListener onClickListener6 = onClickListener3;
                    short[] sArr37 = sArr13;
                    int i65 = i28;
                    int i66 = i30;
                    int i67 = i18;
                    short[] sArr38 = sArr15;
                    i28 = i65;
                    i17 = i63;
                    C1937.m6291(C2642.m8167(viewM4976, ThreadFactoryC3888.m11306(C1148.m4230(sArr37, i63, i65, i22)) ^ 2126451493), new ViewOnClickListenerC6505(2, this));
                    short[] sArr39 = f3035;
                    if (C7105.f23796 >= 0) {
                        int iM450221 = (C19806.m45029("ۛ۫") + i21) * 61;
                        i24 = iM450221 ^ 1685959633;
                        i35 = ((iM450221 ^ i20) * (-8207)) ^ (-631364640);
                    } else {
                        int iM113020 = ThreadFactoryC3888.m11306("᩶ܰ") ^ i20;
                        i35 = ((iM113020 ^ i21) * 2667) ^ 44589385;
                        i24 = iM113020 ^ (-1746453248);
                    }
                    i18 = i67;
                    sArr13 = sArr37;
                    sArr15 = sArr38;
                    i30 = i66;
                    onClickListener3 = onClickListener6;
                    i29 = 25;
                    i31 = i64;
                    sArr16 = sArr36;
                    dialogInterfaceC19358 = dialogInterfaceC193514;
                    sArr14 = sArr39;
                    sArr18 = sArr18;
                    interfaceC6028 = interfaceC6028;
                    break;
                case 1909929499:
                case 2101779645:
                    dialogInterfaceC19357 = dialogInterfaceC19358;
                    i11 = i31;
                    View.OnClickListener onClickListener7 = onClickListener3;
                    C8067 c80613 = c8068;
                    int i68 = i29;
                    sArr13 = sArr13;
                    i18 = i18;
                    sArr14 = sArr14;
                    sArr16 = sArr16;
                    i30 = i30;
                    sArr15 = sArr15;
                    i4 = i68;
                    CheckBox checkBox5 = checkBox4;
                    viewM4976 = viewM4976;
                    short[] sArr40 = sArr11;
                    int i69 = i32;
                    int iM450222 = C19806.m45029(C0629.m2906(sArr40, i69, 3, i22)) ^ 2118417926;
                    Object obj3 = obj2;
                    C1066.m4034(c80613, iM450222, obj3);
                    int iM450223 = (i20 - C19806.m45029("ܽ᩵")) * 9;
                    i5 = ((iM450223 ^ i21) * (-18897)) ^ 711429101;
                    i6 = iM450223 ^ 1354896200;
                    i32 = i69;
                    sArr12 = sArr12;
                    sArr18 = sArr18;
                    sArr11 = sArr40;
                    c8068 = c80613;
                    obj2 = obj3;
                    interfaceC6028 = interfaceC6028;
                    onClickListener3 = onClickListener7;
                    checkBox4 = checkBox5;
                    i31 = i11;
                    dialogInterfaceC19358 = dialogInterfaceC19357;
                    View view9 = viewM4976;
                    i24 = i6;
                    i35 = i5;
                    viewM4976 = view9;
                    short[] sArr310 = sArr14;
                    i18 = i18;
                    sArr13 = sArr13;
                    i29 = i4;
                    sArr15 = sArr15;
                    i30 = i30;
                    sArr16 = sArr16;
                    sArr14 = sArr310;
                    break;
                default:
                    C2704.m8255();
                    throw new RuntimeException();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0077  */
    /* JADX WARN: Code duplicated, block: B:35:0x0102 A[PHI: r7 r8
      0x0102: PHI (r7v4 java.lang.String) = (r7v3 java.lang.String), (r7v2 java.lang.String) binds: [B:33:0x00ea, B:25:0x00b1] A[DONT_GENERATE, DONT_INLINE]
      0x0102: PHI (r8v4 int) = (r8v3 int), (r8v2 int) binds: [B:33:0x00ea, B:25:0x00b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x0187 A[PHI: r4
      0x0187: PHI (r4v4 l.ۛۧ᩺) = (r4v3 l.ۛۧ᩺), (r4v2 l.ۛۧ᩺) binds: [B:50:0x0185, B:16:0x0094] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x022f A[PHI: r16
      0x022f: PHI (r16v3 short) = (r16v2 short), (r16v5 short) binds: [B:9:0x0069, B:6:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x0265 A[PHI: r2 r5 r6 r15 r17
      0x0265: PHI (r2v4 android.widget.Spinner) = 
      (r2v2 android.widget.Spinner)
      (r2v3 android.widget.Spinner)
      (r2v2 android.widget.Spinner)
      (r2v2 android.widget.Spinner)
      (r2v2 android.widget.Spinner)
      (r2v2 android.widget.Spinner)
      (r2v2 android.widget.Spinner)
     binds: [B:67:0x0263, B:54:0x01bd, B:42:0x0143, B:38:0x011f, B:18:0x0098, B:16:0x0094, B:12:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x0265: PHI (r5v4 java.lang.String) = 
      (r5v2 java.lang.String)
      (r5v2 java.lang.String)
      (r5v3 java.lang.String)
      (r5v2 java.lang.String)
      (r5v2 java.lang.String)
      (r5v2 java.lang.String)
      (r5v2 java.lang.String)
     binds: [B:67:0x0263, B:54:0x01bd, B:42:0x0143, B:38:0x011f, B:18:0x0098, B:16:0x0094, B:12:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x0265: PHI (r6v4 java.lang.Object) = 
      (r6v2 java.lang.Object)
      (r6v2 java.lang.Object)
      (r6v2 java.lang.Object)
      (r6v3 java.lang.Object)
      (r6v2 java.lang.Object)
      (r6v2 java.lang.Object)
      (r6v2 java.lang.Object)
     binds: [B:67:0x0263, B:54:0x01bd, B:42:0x0143, B:38:0x011f, B:18:0x0098, B:16:0x0094, B:12:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x0265: PHI (r15v4 int) = (r15v3 int), (r15v2 int), (r15v2 int), (r15v2 int), (r15v2 int), (r15v2 int), (r15v2 int) binds: [B:67:0x0263, B:54:0x01bd, B:42:0x0143, B:38:0x011f, B:18:0x0098, B:16:0x0094, B:12:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x0265: PHI (r17v4 int) = (r17v2 int), (r17v3 int), (r17v2 int), (r17v2 int), (r17v2 int), (r17v2 int), (r17v2 int) binds: [B:67:0x0263, B:54:0x01bd, B:42:0x0143, B:38:0x011f, B:18:0x0098, B:16:0x0094, B:12:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:80:0x02d2 A[PHI: r11 r12 r13 r18 r19 r24
      0x02d2: PHI (r11v3 short[]) = (r11v2 short[]), (r11v2 short[]), (r11v2 short[]), (r11v4 short[]) binds: [B:79:0x02d0, B:75:0x02b2, B:71:0x0296, B:46:0x0163] A[DONT_GENERATE, DONT_INLINE]
      0x02d2: PHI (r12v3 int) = (r12v2 int), (r12v2 int), (r12v2 int), (r12v4 int) binds: [B:79:0x02d0, B:75:0x02b2, B:71:0x0296, B:46:0x0163] A[DONT_GENERATE, DONT_INLINE]
      0x02d2: PHI (r13v4 short) = (r13v2 short), (r13v2 short), (r13v3 short), (r13v2 short) binds: [B:79:0x02d0, B:75:0x02b2, B:71:0x0296, B:46:0x0163] A[DONT_GENERATE, DONT_INLINE]
      0x02d2: PHI (r18v4 short[]) = (r18v3 short[]), (r18v2 short[]), (r18v2 short[]), (r18v2 short[]) binds: [B:79:0x02d0, B:75:0x02b2, B:71:0x0296, B:46:0x0163] A[DONT_GENERATE, DONT_INLINE]
      0x02d2: PHI (r19v4 char) = (r19v2 char), (r19v3 char), (r19v2 char), (r19v2 char) binds: [B:79:0x02d0, B:75:0x02b2, B:71:0x0296, B:46:0x0163] A[DONT_GENERATE, DONT_INLINE]
      0x02d2: PHI (r24v5 short) = (r24v3 short), (r24v3 short), (r24v4 short), (r24v3 short) binds: [B:79:0x02d0, B:75:0x02b2, B:71:0x0296, B:46:0x0163] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m3213() {
        int iM45029;
        int i;
        int i2;
        int i3 = C3535.f13026;
        int i4 = C1460.f5948;
        int iM450210 = C19806.m45029("ۚ᩷") ^ i3;
        int i5 = ((iM450210 ^ i4) * 343) ^ (-1902041795);
        String strM7076 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM450210 ^ (-1719774553);
        Spinner spinner = null;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        short s = 0;
        int i11 = 0;
        short s2 = 0;
        int selectedItemPosition = 0;
        char c = 0;
        int i12 = -2093948864;
        short s3 = 0;
        Object obj = null;
        String strM5047 = null;
        InterfaceC6025 interfaceC6025 = null;
        int i13 = 0;
        while (true) {
            i12 = i6 ^ (i5 & (((i12 ^ i4) * (-4939)) >> 31));
            switch (i12) {
                case -1901891244:
                case 867503915:
                    strM5047 = C1460.m5047(sArr2, i10, 13, i13);
                    if (C19806.m45024()) {
                        iM45029 = ThreadFactoryC3888.m11306("᩹ۗ") ^ i3;
                        i = ((iM45029 ^ i4) * 1821) ^ (-988766445);
                        i2 = -403599594;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܺ۫") ^ i4;
                        i = ((iM45029 ^ i3) * 32577) ^ 865564817;
                        i2 = -1851549680;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1870362132:
                case -746337048:
                    if ((s * s2) - i11 <= 0) {
                        iM45029 = (C19806.m45029("ۤ᩻") + i4) * 69;
                        i = ((iM45029 ^ i3) * (-29511)) ^ (-533709654);
                        i2 = -352464225;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ۙ֡")) * (-109);
                        i = ((iM45029 ^ i4) * 3863) ^ 1360730373;
                        i2 = -2146481837;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1867574562:
                case 1398991258:
                    i13 = 20011;
                    iM45029 = C19806.m45029("ۡ۬") ^ i4;
                    i = ((iM45029 ^ i3) * (-22033)) ^ 1001538749;
                    i2 = -117279096;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1741685258:
                case 487862037:
                    spinner = this.f3045;
                    selectedItemPosition = spinner.getSelectedItemPosition();
                    if (C2124.m6673() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩹ۗ") ^ i3;
                        i = ((iM45029 ^ i4) * 1821) ^ (-988766445);
                        i2 = -403599594;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۫۫") ^ i4) * 89;
                        i = ((iM45029 ^ i3) * (-21839)) ^ (-2025313634);
                        i2 = -173406584;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1624209100:
                case -962690971:
                    sArr = f3035;
                    if (C2332.f8260) {
                        iM45029 = (C19806.m45029("᩸᩷") ^ i4) * 17;
                        i = ((iM45029 ^ i3) * 10369) ^ (-1573357976);
                        i2 = -483335737;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("۠ܺ")) * 27;
                        i = ((iM45029 ^ i4) * 12679) ^ 17636999;
                        i2 = -994979957;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1576047116:
                case 1941273573:
                    sArr2 = f3035;
                    i10 = 108;
                    if (C1875.f7103 >= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("۠ܺ")) * 27;
                        i = ((iM45029 ^ i4) * 12679) ^ 17636999;
                        i2 = -994979957;
                    } else {
                        iM45029 = (C19806.m45029("۬ᩴ") ^ i3) * 33;
                        i = ((iM45029 ^ i4) * 1983) ^ 289207040;
                        i2 = -715579741;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1497307044:
                case -666970548:
                    C3577.m10565();
                    if (C0797.f3386) {
                        iM45029 = ThreadFactoryC3888.m11306("᩶᩷") ^ i4;
                        i = ((iM45029 ^ i3) * (-30153)) ^ 588593491;
                        i2 = -1077490265;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۖ᩸") ^ i3) * 123;
                        i = ((iM45029 ^ i4) * (-22273)) ^ 98660974;
                        i2 = 2134899331;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1469302090:
                case -973105513:
                    i9 = 0;
                    iM45029 = C19806.m45029("ۤۧ") ^ i3;
                    i = ((iM45029 ^ i4) * (-12663)) ^ 170223036;
                    i2 = 2100210433;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1377015866:
                case 1995314150:
                    i13 = 49084;
                    iM45029 = C19806.m45029("ۡ۬") ^ i4;
                    i = ((iM45029 ^ i3) * (-22033)) ^ 1001538749;
                    i2 = -117279096;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1276647975:
                case -1100028690:
                    interfaceC6025 = ApplicationC0716.f2992;
                    if (C2642.m8171() != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩺۫") ^ i4;
                        i = ((iM45029 ^ i3) * (-14339)) ^ 719849707;
                        i2 = -848410911;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩷ۗ") ^ i3;
                        i = ((iM45029 ^ i4) * (-7639)) ^ (-2059354304);
                        i2 = -34837845;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1258791266:
                case 1974860631:
                    obj = null;
                    if (CallableC1627.f6528) {
                        iM45029 = ThreadFactoryC3888.m11306("᩶ܽ") ^ i4;
                        i = ((iM45029 ^ i3) * (-13291)) ^ 1467135778;
                        i2 = 638638158;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩹ۗ") ^ i3;
                        i = ((iM45029 ^ i4) * 1821) ^ (-988766445);
                        i2 = -403599594;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1206744969:
                case 2086773823:
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    CallableC1627.m5507();
                    break;
                case -1039833473:
                case 432374939:
                    strM7076 = C2332.m7076(interfaceC6025, strM5047, obj);
                    i7 = -1;
                    if (strM7076 != null) {
                        iM45029 = C19806.m45029("֡ۤ") ^ i4;
                        i = ((iM45029 ^ i3) * (-16025)) ^ 849977296;
                        i2 = -1759541954;
                    } else {
                        i8 = selectedItemPosition;
                        iM45029 = (C19806.m45029("ܽ᩹") ^ i3) * q.h;
                        i = ((iM45029 ^ i4) * 17701) ^ (-248946773);
                        i2 = -1988101548;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -968712674:
                case -97386832:
                    c = 'k';
                    if (C2332.f8260) {
                        iM45029 = (ThreadFactoryC3888.m11306("۟᩷") + i3) * 27;
                        i = ((iM45029 ^ i4) * (-7677)) ^ 749685553;
                        i2 = -422580939;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("۠ܺ")) * 27;
                        i = ((iM45029 ^ i4) * 12679) ^ 17636999;
                        i2 = -994979957;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -833253128:
                case -93293096:
                    s = sArr[c];
                    s3 = 2203;
                    if (RunnableC3388.f12514 >= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("۠ܺ")) * 27;
                        i = ((iM45029 ^ i4) * 12679) ^ 17636999;
                        i2 = -994979957;
                    } else {
                        iM45029 = C19806.m45029("ܺۤ") ^ i3;
                        i = ((iM45029 ^ i4) * 19689) ^ 471507837;
                        i2 = 956858451;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 308729709:
                case 1505687395:
                    if (i8 == i7) {
                        iM45029 = C19806.m45029("᩶ۤ") ^ i4;
                        i = ((iM45029 ^ i3) * (-10489)) ^ (-1134731632);
                        i2 = 568993807;
                    } else {
                        i9 = i8;
                        iM45029 = C19806.m45029("ۤۧ") ^ i3;
                        i = ((iM45029 ^ i4) * (-12663)) ^ 170223036;
                        i2 = 2100210433;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 339331509:
                case 695990502:
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    iM45029 = ThreadFactoryC3888.m11306("᩹ۗ") ^ i3;
                    i = ((iM45029 ^ i4) * 1821) ^ (-988766445);
                    i2 = -403599594;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 583945117:
                case 1609744731:
                    spinner.setSelection(i9);
                    break;
                case 926405541:
                case 1849350284:
                    RunnableC0195.m1431();
                    if (C3286.f12186) {
                        iM45029 = ThreadFactoryC3888.m11306("᩹ۗ") ^ i3;
                        i = ((iM45029 ^ i4) * 1821) ^ (-988766445);
                        i2 = -403599594;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩺۫") ^ i4;
                        i = ((iM45029 ^ i3) * (-14339)) ^ 719849707;
                        i2 = -848410911;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 1299607072:
                case 1726503590:
                    int i14 = s + s3;
                    i11 = i14 * i14;
                    if (C1977.f7413 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩹ۗ") ^ i3;
                        i = ((iM45029 ^ i4) * 1821) ^ (-988766445);
                        i2 = -403599594;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳۤ") ^ i4;
                        i = ((iM45029 ^ i3) * 25081) ^ 559726405;
                        i2 = 1064077993;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 1400456573:
                case 1930016235:
                    int iIndexOf = this.f3038.indexOf(strM7076);
                    if (iIndexOf == i7) {
                        i8 = selectedItemPosition;
                    } else {
                        i8 = iIndexOf;
                    }
                    iM45029 = (C19806.m45029("ܽ᩹") ^ i3) * q.h;
                    i = ((iM45029 ^ i4) * 17701) ^ (-248946773);
                    i2 = -1988101548;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 1540556496:
                case 2030569691:
                    C1066.m4023();
                    if (C1189.m4368() > 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩹ۗ") ^ i3;
                        i = ((iM45029 ^ i4) * 1821) ^ (-988766445);
                        i2 = -403599594;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۖ᩸") ^ i3) * 123;
                        i = ((iM45029 ^ i4) * (-22273)) ^ 98660974;
                        i2 = 2134899331;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                default:
                    s2 = 8812;
                    if (RunnableC1606.f6488 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩶᩷") ^ i4;
                        i = ((iM45029 ^ i3) * (-30153)) ^ 588593491;
                        i2 = -1077490265;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩸ܰ") ^ i3) * (-81);
                        i = ((iM45029 ^ i4) * 5867) ^ 1285592049;
                        i2 = 967712197;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0085, code lost:
    
        if (l.C2704.f10408 == false) goto L10;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void m3215(l.ViewOnClickListenerC0744 r30) {
        /*
            Method dump skipped, instruction units count: 1066
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC0744.m3215(l.֡᩻ۨ):void");
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static void m3226(ViewOnClickListenerC0744 viewOnClickListenerC0744) {
        ArrayList arrayListM35666 = null;
        ArrayList arrayList = null;
        C0733 c0733 = null;
        int i = 416439770;
        int i2 = C1460.f5948;
        int i3 = C2477.f9839;
        int iM11306 = ThreadFactoryC3888.m11306("֫ۢ") ^ i2;
        int i4 = ((iM11306 ^ i3) * (-15833)) ^ (-1436243657);
        int i5 = -1630083171;
        while (true) {
            i = ((((i ^ i3) * 6521) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -1975515906:
                case 255242764:
                    if (C1419.f5860 >= 0) {
                        iM11306 = (C19806.m45029("۟۠") + i3) * 91;
                        i4 = ((iM11306 ^ i2) * (-701)) ^ (-302120970);
                        i5 = -1235301308;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ᩳ֡")) * (-13);
                        i4 = ((iM11306 ^ i2) * (-10025)) ^ 845149800;
                        i5 = 1626318821;
                    }
                    break;
                case -1794765712:
                case 1110862489:
                    break;
                case -1657308541:
                case 540254656:
                    C3535.m10431();
                    if (C1148.m4232() > 0) {
                        iM11306 = (C19806.m45029("۟۠") + i3) * 91;
                        i4 = ((iM11306 ^ i2) * (-701)) ^ (-302120970);
                        i5 = -1235301308;
                    } else {
                        iM11306 = C19806.m45029("᩹᩺") ^ i2;
                        i4 = ((iM11306 ^ i3) * 31489) ^ 1070468228;
                        i5 = 1332709902;
                    }
                    break;
                case -1418051431:
                case -690576540:
                    RunnableC3388.m10064();
                    C3722.m10894();
                    break;
                case -1123833341:
                case 176296596:
                    c0733 = viewOnClickListenerC0744.f3044;
                    if (C2332.f8260) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("᩸ۜ")) * 53;
                        i4 = ((iM11306 ^ i3) * 437) ^ (-1444826605);
                        i5 = -120328088;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۖ۟") + i3) * (-105);
                        i4 = ((iM11306 ^ i2) * (-23539)) ^ (-856214317);
                        i5 = 91854756;
                    }
                    break;
                case -1034588926:
                case 2059457724:
                    arrayListM35666 = C14920.m35666();
                    if (CallableC1627.f6528) {
                        iM11306 = C19806.m45029("ۧۜ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 15841) ^ (-259402431);
                        i5 = 15574206;
                    } else {
                        iM11306 = C19806.m45029("᩹᩺") ^ i2;
                        i4 = ((iM11306 ^ i3) * 31489) ^ 1070468228;
                        i5 = 1332709902;
                    }
                    break;
                case -1013831517:
                case 1308804539:
                    if (!C0817.f3443) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶ۙ") + i2) * (-103);
                        i4 = ((iM11306 ^ i3) * (-16019)) ^ (-148158928);
                        i5 = -1533799886;
                    } else {
                        iM11306 = (C19806.m45029("۟۠") + i3) * 91;
                        i4 = ((iM11306 ^ i2) * (-701)) ^ (-302120970);
                        i5 = -1235301308;
                    }
                    break;
                case -823672306:
                case 1474646993:
                    C0671.m3008();
                    iM11306 = C19806.m45029("᩹᩺") ^ i2;
                    i4 = ((iM11306 ^ i3) * 31489) ^ 1070468228;
                    i5 = 1332709902;
                    break;
                case -819096942:
                case -204867931:
                    c0733.notifyDataSetChanged();
                    viewOnClickListenerC0744.m3213();
                    iM11306 = ThreadFactoryC3888.m11306("۠ۜ") ^ i3;
                    i4 = ((iM11306 ^ i2) * 32395) ^ 432914405;
                    i5 = 839366539;
                    break;
                case -775495757:
                case 1581966272:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۖ۟") + i3) * (-105);
                        i4 = ((iM11306 ^ i2) * (-23539)) ^ (-856214317);
                        i5 = 91854756;
                    } else {
                        iM11306 = C19806.m45029("ۜܰ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-15613)) ^ (-1285005817);
                        i5 = 2046040279;
                    }
                    break;
                case -420399538:
                case 163956205:
                    if (RunnableC1895.m6170() != 0) {
                        iM11306 = (C19806.m45029("۟۠") + i3) * 91;
                        i4 = ((iM11306 ^ i2) * (-701)) ^ (-302120970);
                        i5 = -1235301308;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ۛۚ")) * 27;
                        i4 = ((iM11306 ^ i3) * (-4789)) ^ 1258010553;
                        i5 = -235826329;
                    }
                    break;
                case -84277530:
                case 1458150559:
                    if (C10634.f36300 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶ۙ") + i2) * (-103);
                        i4 = ((iM11306 ^ i3) * (-16019)) ^ (-148158928);
                        i5 = -1533799886;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("᩺۬")) * 49;
                        i4 = ((iM11306 ^ i3) * (-823)) ^ (-1216040440);
                        i5 = 770780730;
                    }
                    break;
                case -17564587:
                case 122838301:
                    C2788.m8472();
                    if (RunnableC1895.m6170() == 0) {
                        iM11306 = (C19806.m45029("۠۟") + i3) * 19;
                        i4 = ((iM11306 ^ i2) * (-26521)) ^ 934694495;
                        i5 = 498143788;
                    } else {
                        iM11306 = (C19806.m45029("۟۠") + i3) * 91;
                        i4 = ((iM11306 ^ i2) * (-701)) ^ (-302120970);
                        i5 = -1235301308;
                    }
                    break;
                case 362833628:
                case 2135194467:
                    C1461.m5085(arrayList);
                    arrayList.addAll(arrayListM35666);
                    if (C2871.m8646()) {
                        iM11306 = (C19806.m45029("ܺ۠") + i3) * (-107);
                        i4 = ((iM11306 ^ i2) * 14999) ^ (-1312452023);
                        i5 = 295930608;
                    } else {
                        iM11306 = (C19806.m45029("۟۠") + i3) * 91;
                        i4 = ((iM11306 ^ i2) * (-701)) ^ (-302120970);
                        i5 = -1235301308;
                    }
                    break;
                case 385094539:
                case 1701680015:
                    arrayList = viewOnClickListenerC0744.f3038;
                    if (AbstractC0464.m2315(arrayListM35666, arrayList)) {
                        iM11306 = ThreadFactoryC3888.m11306("۠ۜ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 32395) ^ 432914405;
                        i5 = 839366539;
                    } else {
                        iM11306 = C19806.m45029("֫֡") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-11661)) ^ (-352134667);
                        i5 = -1689105533;
                    }
                    break;
                case 403322921:
                case 1893498501:
                    if (C1668.m5583()) {
                        iM11306 = C19806.m45029("ܳ᩶") ^ i2;
                        i4 = ((iM11306 ^ i3) * 1975) ^ 1931082270;
                        i5 = 902865830;
                    } else {
                        iM11306 = (C19806.m45029("۟۠") + i3) * 91;
                        i4 = ((iM11306 ^ i2) * (-701)) ^ (-302120970);
                        i5 = -1235301308;
                    }
                    break;
                case 759379397:
                case 1753652567:
                    if (C2704.f10408) {
                        iM11306 = (ThreadFactoryC3888.m11306("۠ܰ") ^ i2) * (-47);
                        i4 = ((iM11306 ^ i3) * (-3669)) ^ 1282960060;
                        i5 = 152137037;
                    } else {
                        iM11306 = (C19806.m45029("۠۟") + i3) * 19;
                        i4 = ((iM11306 ^ i2) * (-26521)) ^ 934694495;
                        i5 = 498143788;
                    }
                    break;
                default:
                    if (C2332.f8260) {
                        iM11306 = (C19806.m45029("ܶܳ") ^ i3) * 83;
                        i4 = ((iM11306 ^ i2) * (-6533)) ^ (-51489060);
                        i5 = -1697530865;
                    } else {
                        iM11306 = (C19806.m45029("۟۠") + i3) * 91;
                        i4 = ((iM11306 ^ i2) * (-701)) ^ (-302120970);
                        i5 = -1235301308;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:79:0x032a A[PHI: r6 r13 r14 r18 r19 r20
      0x032a: PHI (r6v8 l.ܿۧ᩺) = (r6v2 l.ܿۧ᩺), (r6v2 l.ܿۧ᩺), (r6v3 l.ܿۧ᩺), (r6v2 l.ܿۧ᩺) binds: [B:78:0x0328, B:70:0x02e0, B:48:0x01c2, B:11:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x032a: PHI (r13v8 short[]) = (r13v2 short[]), (r13v2 short[]), (r13v3 short[]), (r13v2 short[]) binds: [B:78:0x0328, B:70:0x02e0, B:48:0x01c2, B:11:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x032a: PHI (r14v8 int) = (r14v2 int), (r14v2 int), (r14v3 int), (r14v2 int) binds: [B:78:0x0328, B:70:0x02e0, B:48:0x01c2, B:11:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x032a: PHI (r18v47 l.᩺֫ۨ) = (r18v14 l.᩺֫ۨ), (r18v17 l.᩺֫ۨ), (r18v27 l.᩺֫ۨ), (r18v48 l.᩺֫ۨ) binds: [B:78:0x0328, B:70:0x02e0, B:48:0x01c2, B:11:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x032a: PHI (r19v8 int) = (r19v3 int), (r19v4 int), (r19v3 int), (r19v3 int) binds: [B:78:0x0328, B:70:0x02e0, B:48:0x01c2, B:11:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x032a: PHI (r20v36 bin.mt.plus.Main) = (r20v6 bin.mt.plus.Main), (r20v9 bin.mt.plus.Main), (r20v22 bin.mt.plus.Main), (r20v37 bin.mt.plus.Main) binds: [B:78:0x0328, B:70:0x02e0, B:48:0x01c2, B:11:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:87:0x0383 A[PHI: r18 r20
      0x0383: PHI (r18v33 l.᩺֫ۨ) = (r18v12 l.᩺֫ۨ), (r18v13 l.᩺֫ۨ), (r18v38 l.᩺֫ۨ) binds: [B:86:0x0381, B:82:0x035e, B:19:0x0089] A[DONT_GENERATE, DONT_INLINE]
      0x0383: PHI (r20v29 bin.mt.plus.Main) = (r20v4 bin.mt.plus.Main), (r20v5 bin.mt.plus.Main), (r20v30 bin.mt.plus.Main) binds: [B:86:0x0381, B:82:0x035e, B:19:0x0089] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:91:0x03b4 A[PHI: r10 r18 r20
      0x03b4: PHI (r10v3 short) = (r10v2 short), (r10v4 short) binds: [B:90:0x03b2, B:74:0x0307] A[DONT_GENERATE, DONT_INLINE]
      0x03b4: PHI (r18v15 l.᩺֫ۨ) = (r18v11 l.᩺֫ۨ), (r18v16 l.᩺֫ۨ) binds: [B:90:0x03b2, B:74:0x0307] A[DONT_GENERATE, DONT_INLINE]
      0x03b4: PHI (r20v7 bin.mt.plus.Main) = (r20v3 bin.mt.plus.Main), (r20v8 bin.mt.plus.Main) binds: [B:90:0x03b2, B:74:0x0307] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m3221(final ViewOnClickListenerC0744 viewOnClickListenerC0744, DialogInterfaceC19356 dialogInterfaceC19356, String str, final CheckBox checkBox) {
        String strM6674;
        int iM11306;
        String str2;
        int i;
        int iM45029;
        int i2;
        int i3;
        int iM450210;
        int i4;
        int i5;
        int iM11307;
        int i6;
        int i7;
        int i8 = C7105.f23796;
        int i9 = C1148.f5161;
        int iM450211 = C19806.m45029("᩸᩹") ^ i9;
        int i10 = ((iM450211 ^ i8) * 25857) ^ (-324968210);
        String strM9788 = null;
        short[] sArr = null;
        int i11 = iM450211 ^ (-1982599572);
        short s = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = -1767262115;
        int i15 = 0;
        String str3 = null;
        String strM1774 = null;
        InterfaceC17314 interfaceC17314M5517 = null;
        final C22681 c22681M35665 = null;
        Exception exc = null;
        ArrayList arrayList = null;
        Main main = null;
        while (true) {
            i14 = i11 ^ (i10 & (((i14 ^ i8) * 32179) >> 31));
            switch (i14) {
                case -2146048771:
                case -338738626:
                    i12 = 49840;
                    iM45029 = ThreadFactoryC3888.m11306("ۙۙ") ^ i9;
                    i2 = ((iM45029 ^ i8) * (-1719)) ^ (-1960036770);
                    i3 = -623672492;
                    int i16 = iM45029 ^ i3;
                    c22681M35665 = c22681M35665;
                    i11 = i16;
                    i10 = i2;
                    main = main;
                    break;
                case -2139963997:
                case -1230712083:
                    C3660.m10783(C1398.m4894(interfaceC17314M5517, strM1774, c22681M35665.f73863));
                    if (C1419.m4964(c22681M35665.f73861)) {
                        iM450210 = (ThreadFactoryC3888.m11306("֡ۘ") ^ i8) * (-39);
                        c22681M35665 = c22681M35665;
                        i4 = ((iM450210 ^ i9) * 12881) ^ 1444475214;
                        i5 = 849995507;
                    } else {
                        c22681M35665 = c22681M35665;
                        iM450210 = (i8 - ThreadFactoryC3888.m11306("֡ܿ")) * (-123);
                        i4 = ((iM450210 ^ i9) * 26159) ^ 152500042;
                        i5 = 1650463569;
                    }
                    C22681 c22681 = c22681M35665;
                    i11 = iM450210 ^ i5;
                    i10 = i4;
                    c22681M35665 = c22681;
                    break;
                case -1997055298:
                case -271228733:
                    if (C0671.f2816 != 0) {
                        strM6674 = str3;
                        iM11306 = ThreadFactoryC3888.m11306("᩹ۤ") ^ i8;
                        str2 = strM6674;
                        i10 = ((iM11306 ^ i9) * 2125) ^ (-720428181);
                        i = -1774397589;
                        i11 = iM11306 ^ i;
                        str3 = str2;
                    } else {
                        c22681M35665 = c22681M35665;
                        iM450210 = ThreadFactoryC3888.m11306("۫ᩳ") ^ i8;
                        i4 = ((iM450210 ^ i9) * (-27671)) ^ 336832231;
                        i5 = -387804550;
                        C22681 c22682 = c22681M35665;
                        i11 = iM450210 ^ i5;
                        i10 = i4;
                        c22681M35665 = c22682;
                    }
                    break;
                case -1902841593:
                case -1353606672:
                    if (RunnableC1606.m5473() != 0) {
                        iM11307 = (ThreadFactoryC3888.m11306("ۡۡ") + i8) * (-45);
                        i6 = ((iM11307 ^ i9) * 25347) ^ (-686705687);
                        i7 = -1175002493;
                        i11 = iM11307 ^ i7;
                        i10 = i6;
                    } else {
                        c22681M35665 = c22681M35665;
                        iM450210 = ThreadFactoryC3888.m11306("۫ᩳ") ^ i8;
                        i4 = ((iM450210 ^ i9) * (-27671)) ^ 336832231;
                        i5 = -387804550;
                        C22681 c22683 = c22681M35665;
                        i11 = iM450210 ^ i5;
                        i10 = i4;
                        c22681M35665 = c22683;
                    }
                    break;
                case -1520433773:
                case -578017563:
                    c22681M35665 = c22681M35665;
                    main = viewOnClickListenerC0744.f3041;
                    arrayList = viewOnClickListenerC0744.f3038;
                    if (C3286.m9789(arrayList)) {
                        iM450210 = (ThreadFactoryC3888.m11306("ܿ᩺") ^ i8) * (-11);
                        i4 = ((iM450210 ^ i9) * 15295) ^ (-1348916660);
                        i5 = -1563151036;
                    } else {
                        iM450210 = C19806.m45029("ۚۙ") ^ i8;
                        i4 = ((iM450210 ^ i9) * (-4805)) ^ (-1605554330);
                        i5 = 2058818712;
                    }
                    C22681 c22684 = c22681M35665;
                    i11 = iM450210 ^ i5;
                    i10 = i4;
                    c22681M35665 = c22684;
                    break;
                case -1427662062:
                case -36956520:
                    main = main;
                    c22681M35665 = c22681M35665;
                    if (C2124.f7782 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۙۖ") ^ i9;
                        i2 = ((iM45029 ^ i8) * 9643) ^ (-806718918);
                        i3 = -146482108;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳۘ") ^ i9) * (-27);
                        i2 = ((iM45029 ^ i8) * 12501) ^ 1667474602;
                        i3 = -70754834;
                    }
                    int i17 = iM45029 ^ i3;
                    c22681M35665 = c22681M35665;
                    i11 = i17;
                    i10 = i2;
                    main = main;
                    break;
                case -1344877415:
                case -708790370:
                    C1148.m4232();
                    C0797.m3359();
                    c22681M35665 = c22681M35665;
                    iM450210 = ThreadFactoryC3888.m11306("۫ᩳ") ^ i8;
                    i4 = ((iM450210 ^ i9) * (-27671)) ^ 336832231;
                    i5 = -387804550;
                    C22681 c22685 = c22681M35665;
                    i11 = iM450210 ^ i5;
                    i10 = i4;
                    c22681M35665 = c22685;
                    break;
                case -1331607190:
                case 1066366362:
                    main = main;
                    c22681M35665 = c22681M35665;
                    int i18 = s + 412;
                    i15 = i18 * i18;
                    if (C0526.m2437() >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۙۖ") ^ i9;
                        i2 = ((iM45029 ^ i8) * 9643) ^ (-806718918);
                        i3 = -146482108;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֨ܶ") + i8) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i2 = ((iM45029 ^ i9) * (-4127)) ^ 1375452953;
                        i3 = 365332623;
                    }
                    int i19 = iM45029 ^ i3;
                    c22681M35665 = c22681M35665;
                    i11 = i19;
                    i10 = i2;
                    main = main;
                    break;
                case -1328309624:
                case -191090429:
                    c22681M35665 = c22681M35665;
                    try {
                        c22681M35665 = C14920.m35665((String) C3286.m9796(arrayList, viewOnClickListenerC0744.f3045.getSelectedItemPosition()));
                        int iM11308 = ThreadFactoryC3888.m11306("۟ܿ") ^ i8;
                        main = main;
                        i2 = ((iM11308 ^ i9) * 22243) ^ (-1068065498);
                        i11 = iM11308 ^ (-1036987791);
                    } catch (Exception e) {
                        main = main;
                        exc = e;
                        iM45029 = (C19806.m45029("ۡܽ") + i9) * 7;
                        i2 = ((iM45029 ^ i8) * 20329) ^ 1205442148;
                        i3 = -813780223;
                        int i110 = iM45029 ^ i3;
                        c22681M35665 = c22681M35665;
                        i11 = i110;
                    }
                    i10 = i2;
                    main = main;
                    break;
                case -1298977868:
                case 951937018:
                    C0671.m3019(main, exc, null);
                    break;
                case -1231128600:
                case 389194641:
                    main = main;
                    c22681M35665 = c22681M35665;
                    if (C3535.f13026 <= 0) {
                        iM45029 = C19806.m45029("ۙ֫") ^ i9;
                        i2 = ((iM45029 ^ i8) * 7397) ^ 1698031637;
                        i3 = -249072366;
                    } else {
                        iM45029 = (i8 - ThreadFactoryC3888.m11306("۟ۨ")) * 123;
                        i2 = ((iM45029 ^ i9) * (-25787)) ^ (-548594925);
                        i3 = -1073262022;
                    }
                    int i111 = iM45029 ^ i3;
                    c22681M35665 = c22681M35665;
                    i11 = i111;
                    i10 = i2;
                    main = main;
                    break;
                case -1166105478:
                case 579221437:
                    C1937.m6279();
                    break;
                case -1091536765:
                case 1360863309:
                    main = main;
                    c22681M35665 = c22681M35665;
                    if (C1875.m6086() != 0) {
                        iM45029 = C19806.m45029("ۙ֫") ^ i9;
                        i2 = ((iM45029 ^ i8) * 7397) ^ 1698031637;
                        i3 = -249072366;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩵֡") ^ i8;
                        i2 = ((iM45029 ^ i9) * 6843) ^ (-11083371);
                        i3 = 2096700171;
                    }
                    int i112 = iM45029 ^ i3;
                    c22681M35665 = c22681M35665;
                    i11 = i112;
                    i10 = i2;
                    main = main;
                    break;
                case -1027640164:
                case -640154244:
                    C1668.m5582(C19806.m45029(strM9788) ^ 2101653263);
                    break;
                case -989665782:
                case 403188555:
                    strM9788 = C3286.m9788(f3035, 303, 3, i12);
                    if (C1066.f4915 <= 0) {
                        iM11307 = (ThreadFactoryC3888.m11306("ۡۡ") + i8) * (-45);
                        i6 = ((iM11307 ^ i9) * 25347) ^ (-686705687);
                        i7 = -1175002493;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("ᩴ᩷") ^ i9;
                        i6 = ((iM11307 ^ i8) * (-21639)) ^ 1855529875;
                        i7 = -1503128040;
                    }
                    i11 = iM11307 ^ i7;
                    i10 = i6;
                    break;
                case -936560996:
                case -565824614:
                    final InterfaceC3183 interfaceC3183M30439 = C12238.m30439(str3);
                    C11005.m27761(new InterfaceC17354(viewOnClickListenerC0744) { // from class: l.۠᩻ۨ

                        /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ ViewOnClickListenerC0744 f29482;

                        @Override // l.InterfaceC17354
                        public final /* synthetic */ void onCanceled() {
                        }

                        @Override // l.InterfaceC17354
                        /* JADX INFO: renamed from: ۙ */
                        public final /* synthetic */ boolean mo6537(Exception exc2) {
                            return false;
                        }

                        {
                            int i20 = -2101943388;
                            int i21 = RunnableC3388.f12514;
                            int i22 = C2642.f10294;
                            int iM450212 = C19806.m45029("֨ۢ") ^ i22;
                            int i23 = ((iM450212 ^ i21) * 23873) ^ (-1699930166);
                            int i24 = 510463310;
                            while (true) {
                                i20 = ((((i20 ^ i21) * (-29331)) >> 31) & i23) ^ (iM450212 ^ i24);
                                switch (i20) {
                                    case -1978454272:
                                    case -1592669527:
                                        C1937.m6279();
                                        C2642.m8171();
                                        iM450212 = (C19806.m45029("ۚᩳ") ^ i21) * (-99);
                                        i23 = ((iM450212 ^ i22) * (-18515)) ^ (-1082413666);
                                        i24 = -1241368751;
                                        break;
                                    case -1947987453:
                                    case 1152673264:
                                        if (ThreadFactoryC3888.f14547 <= 0) {
                                            iM450212 = ThreadFactoryC3888.m11306("᩶᩹") ^ i22;
                                            i23 = ((iM450212 ^ i21) * (-31667)) ^ (-798520409);
                                            i24 = -1786045447;
                                        } else {
                                            iM450212 = (ThreadFactoryC3888.m11306("֫ۡ") ^ i22) * 115;
                                            i23 = ((iM450212 ^ i21) * (-27575)) ^ 382963430;
                                            i24 = 1770565207;
                                        }
                                        break;
                                    case -1911376923:
                                    case 1408363743:
                                        C2788.m8472();
                                        AbstractC0464.m2313();
                                        throw new RuntimeException();
                                    case -1773557394:
                                    case -335173768:
                                        if (C3660.f13403 >= 0) {
                                            iM450212 = (C19806.m45029("ۚᩳ") ^ i21) * (-99);
                                            i23 = ((iM450212 ^ i22) * (-18515)) ^ (-1082413666);
                                            i24 = -1241368751;
                                        } else {
                                            iM450212 = (i21 - ThreadFactoryC3888.m11306("۟֨")) * 127;
                                            i23 = ((iM450212 ^ i22) * 11809) ^ (-96824732);
                                            i24 = 1668056710;
                                        }
                                        break;
                                    case -696070405:
                                    case 32948558:
                                        this.f29482 = viewOnClickListenerC0744;
                                        if (C7105.f23796 >= 0) {
                                            iM450212 = (C19806.m45029("ۚᩳ") ^ i21) * (-99);
                                            i23 = ((iM450212 ^ i22) * (-18515)) ^ (-1082413666);
                                            i24 = -1241368751;
                                        } else {
                                            iM450212 = (ThreadFactoryC3888.m11306("ܳۘ") + i21) * 95;
                                            i23 = ((iM450212 ^ i22) * (-11769)) ^ 1313022288;
                                            i24 = 2063652569;
                                        }
                                        break;
                                    case -642791579:
                                    case 1458584223:
                                        if (C0671.f2816 != 0) {
                                            iM450212 = ThreadFactoryC3888.m11306("᩸ᩳ") ^ i22;
                                            i23 = ((iM450212 ^ i21) * 4559) ^ (-1289322689);
                                            i24 = -1768076001;
                                        } else {
                                            iM450212 = (ThreadFactoryC3888.m11306("᩷ۛ") ^ i22) * 109;
                                            i23 = ((iM450212 ^ i21) * 5967) ^ 1414774957;
                                            i24 = -1751140567;
                                        }
                                        break;
                                    case -473857587:
                                    case 210883882:
                                        if (C2788.f10625 >= 0) {
                                            iM450212 = ThreadFactoryC3888.m11306("᩶᩹") ^ i22;
                                            i23 = ((iM450212 ^ i21) * (-31667)) ^ (-798520409);
                                            i24 = -1786045447;
                                        } else {
                                            iM450212 = ThreadFactoryC3888.m11306("᩵᩹") ^ i21;
                                            i23 = ((iM450212 ^ i22) * (-20803)) ^ (-1321779817);
                                            i24 = 1661539202;
                                        }
                                        break;
                                    case -464759409:
                                    case -356141419:
                                        if (C1377.m4833() != 0) {
                                            iM450212 = C19806.m45029("ܽ᩷") ^ i21;
                                            i23 = ((iM450212 ^ i22) * (-17411)) ^ 399421307;
                                            i24 = -1793985734;
                                        } else {
                                            iM450212 = ThreadFactoryC3888.m11306("ۜۧ") ^ i22;
                                            i23 = ((iM450212 ^ i21) * (-20531)) ^ (-346271676);
                                            i24 = 662000303;
                                        }
                                        break;
                                    case -368458536:
                                    case 23590252:
                                        if (C1937.f7317 >= 0) {
                                            iM450212 = C19806.m45029("ۜ᩺") ^ i21;
                                            i23 = ((iM450212 ^ i22) * 7111) ^ 264725536;
                                            i24 = -1934359459;
                                        } else {
                                            iM450212 = C19806.m45029("ۤ۟") ^ i22;
                                            i23 = ((iM450212 ^ i21) * 11379) ^ (-28187365);
                                            i24 = 1346214888;
                                        }
                                        break;
                                    case -224827821:
                                    case -49632103:
                                        if (C1419.f5860 >= 0) {
                                            iM450212 = C19806.m45029("ܽ᩷") ^ i21;
                                            i23 = ((iM450212 ^ i22) * (-17411)) ^ 399421307;
                                            i24 = -1793985734;
                                        } else {
                                            iM450212 = (ThreadFactoryC3888.m11306("ᩴܿ") + i22) * (-89);
                                            i23 = ((iM450212 ^ i21) * (-12577)) ^ 1434611986;
                                            i24 = -1751429715;
                                        }
                                        break;
                                    case 185727071:
                                    case 768555207:
                                        C1419.m4973();
                                        if (RunnableC0195.f1321 >= 0) {
                                            iM450212 = ThreadFactoryC3888.m11306("᩸ᩳ") ^ i22;
                                            i23 = ((iM450212 ^ i21) * 4559) ^ (-1289322689);
                                            i24 = -1768076001;
                                        } else {
                                            iM450212 = ThreadFactoryC3888.m11306("᩶᩹") ^ i22;
                                            i23 = ((iM450212 ^ i21) * (-31667)) ^ (-798520409);
                                            i24 = -1786045447;
                                        }
                                        break;
                                    case 313793276:
                                    case 1041560481:
                                        if (C1419.f5860 >= 0) {
                                            iM450212 = C19806.m45029("ܽ᩷") ^ i21;
                                            i23 = ((iM450212 ^ i22) * (-17411)) ^ 399421307;
                                            i24 = -1793985734;
                                        } else {
                                            iM450212 = ThreadFactoryC3888.m11306("᩶᩹") ^ i22;
                                            i23 = ((iM450212 ^ i21) * (-31667)) ^ (-798520409);
                                            i24 = -1786045447;
                                        }
                                        break;
                                    case 955183902:
                                    case 1991773804:
                                        if (C2871.m8646()) {
                                            iM450212 = ThreadFactoryC3888.m11306("ۡ֨") ^ i21;
                                            i23 = ((iM450212 ^ i22) * (-10445)) ^ 1052308341;
                                            i24 = 367278427;
                                        } else {
                                            iM450212 = C19806.m45029("ۜ᩺") ^ i21;
                                            i23 = ((iM450212 ^ i22) * 7111) ^ 264725536;
                                            i24 = -1934359459;
                                        }
                                        break;
                                    case 1322627686:
                                    case 1534353171:
                                        if (C1460.m5050() != 0) {
                                            iM450212 = C19806.m45029("ۜ᩺") ^ i21;
                                            i23 = ((iM450212 ^ i22) * 7111) ^ 264725536;
                                            i24 = -1934359459;
                                        } else {
                                            iM450212 = (C19806.m45029("֨ۜ") + i21) * 17;
                                            i23 = ((iM450212 ^ i22) * (-15905)) ^ 1246799136;
                                            i24 = 1921905161;
                                        }
                                        break;
                                    case 1336294825:
                                    case 1512044456:
                                        return;
                                    default:
                                        if (!RunnableC1895.f7152) {
                                            iM450212 = ThreadFactoryC3888.m11306("᩶᩹") ^ i22;
                                            i23 = ((iM450212 ^ i21) * (-31667)) ^ (-798520409);
                                            i24 = -1786045447;
                                        } else {
                                            iM450212 = (C19806.m45029("ۚᩳ") ^ i21) * (-99);
                                            i23 = ((iM450212 ^ i22) * (-18515)) ^ (-1082413666);
                                            i24 = -1241368751;
                                        }
                                        break;
                                }
                            }
                        }

                        @Override // l.InterfaceC17354
                        /* JADX INFO: renamed from: ۙ */
                        public final void mo6536(C14558 c14558, boolean z) {
                            CheckBox checkBox2 = null;
                            int i20 = -731585747;
                            int i21 = RunnableC1606.f6488;
                            int i22 = C3660.f13403;
                            int iM11309 = ThreadFactoryC3888.m11306("ۚۧ") ^ i22;
                            int i23 = ((iM11309 ^ i21) * (-19137)) ^ 1381153645;
                            int i24 = 831309820;
                            while (true) {
                                i20 = ((((i20 ^ i21) * (-4883)) >> 31) & i23) ^ (iM11309 ^ i24);
                                switch (i20) {
                                    case -1810888721:
                                    case -907013264:
                                        if (RunnableC0195.f1321 < 0) {
                                            iM11309 = ThreadFactoryC3888.m11306("ۛᩴ") ^ i22;
                                            i23 = ((iM11309 ^ i21) * (-29407)) ^ 1700314916;
                                            i24 = -1286449483;
                                        } else {
                                            iM11309 = (i21 - C19806.m45029("۫᩵")) * 83;
                                            i23 = ((iM11309 ^ i22) * (-1299)) ^ 1810014000;
                                            i24 = 1487709377;
                                        }
                                        break;
                                    case -1711265557:
                                    case 1384686574:
                                        C0526.m2437();
                                        C2124.m6673();
                                        break;
                                    case -1507705358:
                                    case -773861323:
                                        if (C1066.f4915 <= 0) {
                                            iM11309 = (i21 - C19806.m45029("۫᩵")) * 83;
                                            i23 = ((iM11309 ^ i22) * (-1299)) ^ 1810014000;
                                            i24 = 1487709377;
                                        } else {
                                            iM11309 = (i21 - ThreadFactoryC3888.m11306("֨ۢ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                                            i23 = ((iM11309 ^ i22) * (-20421)) ^ 40989445;
                                            i24 = -1392079636;
                                        }
                                        break;
                                    case -1420727313:
                                    case -1250456327:
                                        if (C1875.f7103 >= 0) {
                                            iM11309 = C19806.m45029("ۗ۫") ^ i22;
                                            i23 = ((iM11309 ^ i21) * 21187) ^ 168818435;
                                            i24 = -658556531;
                                        } else {
                                            iM11309 = ThreadFactoryC3888.m11306("᩷֫") ^ i21;
                                            i23 = ((iM11309 ^ i22) * (-10495)) ^ 1133006838;
                                            i24 = -815751192;
                                        }
                                        break;
                                    case -1364010403:
                                    case 548696868:
                                        checkBox2 = checkBox;
                                        if (RunnableC1564.f6300) {
                                            iM11309 = (i22 - C19806.m45029("ܰ᩸")) * 37;
                                            i23 = ((iM11309 ^ i21) * (-4161)) ^ 297440808;
                                            i24 = -1540897851;
                                        } else {
                                            iM11309 = (C19806.m45029("֫ܶ") + i22) * (-97);
                                            i23 = ((iM11309 ^ i21) * 23959) ^ 1792469739;
                                            i24 = 977961472;
                                        }
                                        break;
                                    case -1354038261:
                                    case 1210123394:
                                        C10634.m26820();
                                        iM11309 = (i21 - C19806.m45029("۫᩵")) * 83;
                                        i23 = ((iM11309 ^ i22) * (-1299)) ^ 1810014000;
                                        i24 = 1487709377;
                                        break;
                                    case -1131768686:
                                    case 1266758623:
                                        boolean zM2909 = C0629.m2909(checkBox2);
                                        if (AbstractC0464.m2313() == 0) {
                                            ViewOnClickListenerC0744 viewOnClickListenerC0745 = this.f29482;
                                            C22681 c22686 = c22681M35665;
                                            InterfaceC3183 interfaceC3183 = interfaceC3183M30439;
                                            if (C3722.f13525 > 0) {
                                                RunnableC0195.m1442(new C7801(viewOnClickListenerC0745, c22686, c14558, z, interfaceC3183, zM2909));
                                            }
                                        }
                                        iM11309 = C19806.m45029("ۗ۫") ^ i22;
                                        i23 = ((iM11309 ^ i21) * 21187) ^ 168818435;
                                        i24 = -658556531;
                                        break;
                                    case -940348276:
                                    case -172533914:
                                        if (C3535.f13026 <= 0) {
                                            iM11309 = (i21 - C19806.m45029("᩻ۢ")) * (-61);
                                            i23 = ((iM11309 ^ i22) * 8341) ^ (-631405585);
                                            i24 = 329719683;
                                        } else {
                                            iM11309 = C19806.m45029("ۢ᩹") ^ i22;
                                            i23 = ((iM11309 ^ i21) * 31247) ^ 1821513648;
                                            i24 = -139537553;
                                        }
                                        break;
                                    case -935416257:
                                    case 1610620411:
                                        if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                                            iM11309 = (i22 - C19806.m45029("ܰ᩺")) * (-83);
                                            i23 = ((iM11309 ^ i21) * (-17295)) ^ (-104012599);
                                            i24 = 741884366;
                                        } else {
                                            iM11309 = (i21 - C19806.m45029("۫᩵")) * 83;
                                            i23 = ((iM11309 ^ i22) * (-1299)) ^ 1810014000;
                                            i24 = 1487709377;
                                        }
                                        break;
                                    case -863370737:
                                    case -18592885:
                                        if (ThreadFactoryC3888.f14547 <= 0) {
                                            iM11309 = (i22 - C19806.m45029("ܰ᩸")) * 37;
                                            i23 = ((iM11309 ^ i21) * (-4161)) ^ 297440808;
                                            i24 = -1540897851;
                                        } else {
                                            iM11309 = (C19806.m45029("ۙۨ") + i21) * 123;
                                            i23 = ((iM11309 ^ i22) * 21913) ^ (-1307080456);
                                            i24 = -2006317660;
                                        }
                                        break;
                                    case -775611212:
                                    case 1326563898:
                                        C0526.m2437();
                                        if (!CallableC1627.f6528) {
                                            iM11309 = (i21 - C19806.m45029("᩻ۢ")) * (-61);
                                            i23 = ((iM11309 ^ i22) * 8341) ^ (-631405585);
                                            i24 = 329719683;
                                        } else {
                                            iM11309 = ThreadFactoryC3888.m11306("ۛᩴ") ^ i22;
                                            i23 = ((iM11309 ^ i21) * (-29407)) ^ 1700314916;
                                            i24 = -1286449483;
                                        }
                                        break;
                                    case -622794020:
                                    case -289255668:
                                        if (RunnableC3388.f12514 >= 0) {
                                            iM11309 = (i21 - C19806.m45029("۫᩵")) * 83;
                                            i23 = ((iM11309 ^ i22) * (-1299)) ^ 1810014000;
                                            i24 = 1487709377;
                                        } else {
                                            iM11309 = (C19806.m45029("֡ۧ") ^ i21) * 119;
                                            i23 = ((iM11309 ^ i22) * 13823) ^ (-1220664827);
                                            i24 = -2002253260;
                                        }
                                        break;
                                    case 620534031:
                                    case 1620121993:
                                        if (C2788.f10625 < 0) {
                                            iM11309 = (i22 - C19806.m45029("ܰ᩸")) * 37;
                                            i23 = ((iM11309 ^ i21) * (-4161)) ^ 297440808;
                                            i24 = -1540897851;
                                        } else {
                                            iM11309 = (i21 - C19806.m45029("۫᩵")) * 83;
                                            i23 = ((iM11309 ^ i22) * (-1299)) ^ 1810014000;
                                            i24 = 1487709377;
                                        }
                                        break;
                                    default:
                                        if (C1377.f5749) {
                                            iM11309 = C19806.m45029("᩵ۘ") ^ i22;
                                            i23 = ((iM11309 ^ i21) * 1875) ^ 1598740632;
                                            i24 = 1296953500;
                                        } else {
                                            iM11309 = ThreadFactoryC3888.m11306("ۛᩴ") ^ i22;
                                            i23 = ((iM11309 ^ i21) * (-29407)) ^ 1700314916;
                                            i24 = -1286449483;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    }, main, str);
                    break;
                case -617014909:
                case 1549515215:
                    C0671.m3008();
                    if (C1461.f5957 <= 0) {
                        main = main;
                        c22681M35665 = c22681M35665;
                        iM45029 = C19806.m45029("ۙ֫") ^ i9;
                        i2 = ((iM45029 ^ i8) * 7397) ^ 1698031637;
                        i3 = -249072366;
                        int i113 = iM45029 ^ i3;
                        c22681M35665 = c22681M35665;
                        i11 = i113;
                        i10 = i2;
                        main = main;
                    } else {
                        iM11307 = (ThreadFactoryC3888.m11306("ۡۡ") + i8) * (-45);
                        i6 = ((iM11307 ^ i9) * 25347) ^ (-686705687);
                        i7 = -1175002493;
                        i11 = iM11307 ^ i7;
                        i10 = i6;
                    }
                    break;
                case -373478549:
                case 283419405:
                    if (RunnableC1606.f6488 >= 0) {
                        main = main;
                        c22681M35665 = c22681M35665;
                        iM45029 = ThreadFactoryC3888.m11306("ۙۖ") ^ i9;
                        i2 = ((iM45029 ^ i8) * 9643) ^ (-806718918);
                        i3 = -146482108;
                        int i114 = iM45029 ^ i3;
                        c22681M35665 = c22681M35665;
                        i11 = i114;
                        i10 = i2;
                        main = main;
                    } else {
                        c22681M35665 = c22681M35665;
                        iM450210 = ThreadFactoryC3888.m11306("۫ᩳ") ^ i8;
                        i4 = ((iM450210 ^ i9) * (-27671)) ^ 336832231;
                        i5 = -387804550;
                        C22681 c22686 = c22681M35665;
                        i11 = iM450210 ^ i5;
                        i10 = i4;
                        c22681M35665 = c22686;
                    }
                    break;
                case -277301632:
                case -48672303:
                    break;
                case -161219446:
                case 1826883757:
                    main = main;
                    c22681M35665 = c22681M35665;
                    if (C0050.f912 <= 0) {
                        iM45029 = (i9 - ThreadFactoryC3888.m11306("᩺֡")) * (-57);
                        i2 = ((iM45029 ^ i8) * (-21011)) ^ (-133323163);
                        i3 = 2020946923;
                    } else {
                        iM45029 = (C19806.m45029("ۚᩳ") ^ i9) * 69;
                        i2 = ((iM45029 ^ i8) * (-12017)) ^ (-1977012423);
                        i3 = -710985931;
                    }
                    int i115 = iM45029 ^ i3;
                    c22681M35665 = c22681M35665;
                    i11 = i115;
                    i10 = i2;
                    main = main;
                    break;
                case 139746078:
                case 2009457312:
                    c22681M35665 = c22681M35665;
                    interfaceC17314M5517 = CallableC1627.m5517(ApplicationC0716.f2992);
                    sArr = f3035;
                    i13 = 290;
                    if (C2332.m7079() > 0) {
                        iM450210 = (C19806.m45029("᩸۟") ^ i9) * 31;
                        i4 = ((iM450210 ^ i8) * 15891) ^ (-1453726738);
                        i5 = 576367099;
                        C22681 c22687 = c22681M35665;
                        i11 = iM450210 ^ i5;
                        i10 = i4;
                        c22681M35665 = c22687;
                    } else {
                        main = main;
                        iM45029 = ThreadFactoryC3888.m11306("ۙۖ") ^ i9;
                        i2 = ((iM45029 ^ i8) * 9643) ^ (-806718918);
                        i3 = -146482108;
                        int i116 = iM45029 ^ i3;
                        c22681M35665 = c22681M35665;
                        i11 = i116;
                        i10 = i2;
                        main = main;
                    }
                    break;
                case 362838313:
                case 1851587469:
                    i12 = 35467;
                    iM45029 = ThreadFactoryC3888.m11306("ۙۙ") ^ i9;
                    i2 = ((iM45029 ^ i8) * (-1719)) ^ (-1960036770);
                    i3 = -623672492;
                    int i117 = iM45029 ^ i3;
                    c22681M35665 = c22681M35665;
                    i11 = i117;
                    i10 = i2;
                    main = main;
                    break;
                case 1023516743:
                case 1942188740:
                    main = main;
                    c22681M35665 = c22681M35665;
                    s = f3035[289];
                    if (C1977.f7413 <= 0) {
                        iM45029 = (i9 - ThreadFactoryC3888.m11306("᩺֡")) * (-57);
                        i2 = ((iM45029 ^ i8) * (-21011)) ^ (-133323163);
                        i3 = 2020946923;
                    } else {
                        iM45029 = C19806.m45029("֡ۢ") ^ i9;
                        i2 = ((iM45029 ^ i8) * 24725) ^ 849280941;
                        i3 = -820862484;
                    }
                    int i118 = iM45029 ^ i3;
                    c22681M35665 = c22681M35665;
                    i11 = i118;
                    i10 = i2;
                    main = main;
                    break;
                case 1130145506:
                case 2120580017:
                    main = main;
                    c22681M35665 = c22681M35665;
                    if ((s * 1648) - i15 > 0) {
                        iM45029 = (C19806.m45029("ܶܰ") + i9) * (-111);
                        i2 = ((iM45029 ^ i8) * (-5943)) ^ 1741810765;
                        i3 = 549706444;
                    } else {
                        iM45029 = C19806.m45029("᩻ۡ") ^ i8;
                        i2 = ((iM45029 ^ i9) * 12901) ^ 1431069218;
                        i3 = -1539599004;
                    }
                    int i119 = iM45029 ^ i3;
                    c22681M35665 = c22681M35665;
                    i11 = i119;
                    i10 = i2;
                    main = main;
                    break;
                case 1409728635:
                case 1803665768:
                    c22681M35665 = c22681M35665;
                    strM1774 = C0278.m1774(sArr, i13, 13, i12);
                    if (C0629.f2722 <= 0) {
                        iM450210 = ThreadFactoryC3888.m11306("۫ᩳ") ^ i8;
                        i4 = ((iM450210 ^ i9) * (-27671)) ^ 336832231;
                        i5 = -387804550;
                    } else {
                        iM450210 = ThreadFactoryC3888.m11306("ܿۧ") ^ i9;
                        i4 = ((iM450210 ^ i8) * 16329) ^ (-591530482);
                        i5 = -4126772;
                    }
                    C22681 c22688 = c22681M35665;
                    i11 = iM450210 ^ i5;
                    i10 = i4;
                    c22681M35665 = c22688;
                    break;
                default:
                    C1189.m4367(dialogInterfaceC19356);
                    strM6674 = C2124.m6674(C3743.m10961(viewOnClickListenerC0744.f3037));
                    if (ThreadFactoryC3888.m11300() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩹ۤ") ^ i8;
                        str2 = strM6674;
                        i10 = ((iM11306 ^ i9) * 2125) ^ (-720428181);
                        i = -1774397589;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩵ۤ") ^ i9;
                        str2 = strM6674;
                        i10 = ((iM11306 ^ i8) * (-7251)) ^ (-1058900099);
                        i = -1214427020;
                    }
                    i11 = iM11306 ^ i;
                    str3 = str2;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00f7 A[PHI: r12 r13 r17 r18
      0x00f7: PHI (r12v3 int) = (r12v2 int), (r12v2 int), (r12v4 int) binds: [B:72:0x02db, B:68:0x02bd, B:28:0x00f5] A[DONT_GENERATE, DONT_INLINE]
      0x00f7: PHI (r13v3 int) = (r13v2 int), (r13v2 int), (r13v4 int) binds: [B:72:0x02db, B:68:0x02bd, B:28:0x00f5] A[DONT_GENERATE, DONT_INLINE]
      0x00f7: PHI (r17v16 l.ܿۧ᩺) = (r17v2 l.ܿۧ᩺), (r17v3 l.ܿۧ᩺), (r17v17 l.ܿۧ᩺) binds: [B:72:0x02db, B:68:0x02bd, B:28:0x00f5] A[DONT_GENERATE, DONT_INLINE]
      0x00f7: PHI (r18v5 short[]) = (r18v3 short[]), (r18v4 short[]), (r18v3 short[]) binds: [B:72:0x02db, B:68:0x02bd, B:28:0x00f5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x0251 A[PHI: r5 r6 r11 r17
      0x0251: PHI (r5v4 short) = (r5v3 short), (r5v2 short) binds: [B:60:0x024f, B:32:0x0118] A[DONT_GENERATE, DONT_INLINE]
      0x0251: PHI (r6v4 short) = (r6v3 short), (r6v2 short) binds: [B:60:0x024f, B:32:0x0118] A[DONT_GENERATE, DONT_INLINE]
      0x0251: PHI (r11v3 short[]) = (r11v2 short[]), (r11v4 short[]) binds: [B:60:0x024f, B:32:0x0118] A[DONT_GENERATE, DONT_INLINE]
      0x0251: PHI (r17v14 l.ܿۧ᩺) = (r17v5 l.ܿۧ᩺), (r17v15 l.ܿۧ᩺) binds: [B:60:0x024f, B:32:0x0118] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0289 A[PHI: r4 r7 r8 r9 r17
      0x0289: PHI (r4v4 char) = (r4v3 char), (r4v2 char), (r4v2 char), (r4v2 char) binds: [B:64:0x0287, B:56:0x0228, B:52:0x0203, B:11:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x0289: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int) binds: [B:64:0x0287, B:56:0x0228, B:52:0x0203, B:11:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x0289: PHI (r8v4 short) = (r8v2 short), (r8v3 short), (r8v2 short), (r8v2 short) binds: [B:64:0x0287, B:56:0x0228, B:52:0x0203, B:11:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x0289: PHI (r9v4 int) = (r9v2 int), (r9v2 int), (r9v3 int), (r9v2 int) binds: [B:64:0x0287, B:56:0x0228, B:52:0x0203, B:11:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x0289: PHI (r17v22 l.ܿۧ᩺) = (r17v4 l.ܿۧ᩺), (r17v6 l.ܿۧ᩺), (r17v7 l.ܿۧ᩺), (r17v23 l.ܿۧ᩺) binds: [B:64:0x0287, B:56:0x0228, B:52:0x0203, B:11:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m3222(C10948 c10948, CheckBox checkBox) {
        int iM11306;
        int i;
        int i2;
        int i3 = C1937.f7317;
        int i4 = C1398.f5802;
        int iM45029 = (C19806.m45029("ۤ᩹") ^ i4) * q.h;
        int i5 = ((iM45029 ^ i3) * 15479) ^ 1215665303;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM45029 ^ (-1083178355);
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i7 = 0;
        short s3 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = -759482166;
        String strM3224 = null;
        InterfaceC17314 interfaceC17314M8257 = null;
        while (true) {
            i12 = i6 ^ (i5 & (((i12 ^ i3) * (-19505)) >> 31));
            switch (i12) {
                case -2049965105:
                case 166059630:
                    C19806.m45024();
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    iM11306 = (ThreadFactoryC3888.m11306("ܽᩴ") ^ i3) * (-33);
                    interfaceC17314M8257 = interfaceC17314M8257;
                    i = ((iM11306 ^ i4) * (-19743)) ^ (-1283378514);
                    i2 = 755067437;
                    InterfaceC17314 interfaceC17314 = interfaceC17314M8257;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    interfaceC17314M8257 = interfaceC17314;
                    break;
                case -2024591708:
                case 410878673:
                    interfaceC17314M8257 = interfaceC17314M8257;
                    sArr2 = f3035;
                    if (C7105.f23796 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܺ֫") + i4) * 23;
                        i = ((iM11306 ^ i3) * (-27529)) ^ (-1094457901);
                        i2 = -6254523;
                    } else {
                        iM11306 = (i4 - C19806.m45029("ܳ֡")) * (-67);
                        i = ((iM11306 ^ i3) * (-10999)) ^ (-818901659);
                        i2 = 83170188;
                    }
                    InterfaceC17314 interfaceC17315 = interfaceC17314M8257;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    interfaceC17314M8257 = interfaceC17315;
                    break;
                case -1746370941:
                case -1041823242:
                    C2249.m6906(C1398.m4894(interfaceC17314M8257, C2249.m6918(sArr2, i10, i11, i9), strM3224));
                    if (C3577.m10565()) {
                        interfaceC17314M8257 = interfaceC17314M8257;
                        iM11306 = (i3 - C19806.m45029("ۗ۟")) * (-109);
                        i = ((iM11306 ^ i4) * (-295)) ^ 718582029;
                        i2 = -1927846435;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܽᩴ") ^ i3) * (-33);
                        interfaceC17314M8257 = interfaceC17314M8257;
                        i = ((iM11306 ^ i4) * (-19743)) ^ (-1283378514);
                        i2 = 755067437;
                    }
                    InterfaceC17314 interfaceC17316 = interfaceC17314M8257;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    interfaceC17314M8257 = interfaceC17316;
                    break;
                case -1672423321:
                case 140091424:
                    interfaceC17314M8257 = interfaceC17314M8257;
                    i7 = s * s2;
                    s3 = 18625;
                    if (C2871.f10837 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۙۙ") + i3) * 11;
                        i = ((iM11306 ^ i4) * (-10747)) ^ 179605719;
                        i2 = 1066854226;
                    } else {
                        iM11306 = (C19806.m45029("֡ܽ") + i3) * 115;
                        i = ((iM11306 ^ i4) * 29039) ^ 1348367604;
                        i2 = -1406768127;
                    }
                    InterfaceC17314 interfaceC17317 = interfaceC17314M8257;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    interfaceC17314M8257 = interfaceC17317;
                    break;
                case -1667534893:
                case -784615915:
                    interfaceC17314M8257 = interfaceC17314M8257;
                    s = sArr[c];
                    s2 = 74500;
                    if (C1461.m5080()) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܺ֫") + i4) * 23;
                        i = ((iM11306 ^ i3) * (-27529)) ^ (-1094457901);
                        i2 = -6254523;
                    } else {
                        iM11306 = (C19806.m45029("ۤܽ") ^ i3) * (-49);
                        i = ((iM11306 ^ i4) * 15043) ^ (-719996076);
                        i2 = -390454100;
                    }
                    InterfaceC17314 interfaceC17318 = interfaceC17314M8257;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    interfaceC17314M8257 = interfaceC17318;
                    break;
                case -1455585177:
                case -1103409322:
                    interfaceC17314M8257 = interfaceC17314M8257;
                    if (i7 - (i8 * i8) > 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֡۬") ^ i3;
                        i = ((iM11306 ^ i4) * (-509)) ^ (-1130296188);
                        i2 = -857150178;
                    } else {
                        iM11306 = C19806.m45029("ܳ᩸") ^ i4;
                        i = ((iM11306 ^ i3) * (-20049)) ^ (-633151360);
                        i2 = -623826086;
                    }
                    InterfaceC17314 interfaceC17319 = interfaceC17314M8257;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    interfaceC17314M8257 = interfaceC17319;
                    break;
                case -1313860821:
                case 1438781214:
                    C2642.m8171();
                    C1066.m4023();
                    break;
                case -1311366927:
                case 1630329066:
                    interfaceC17314M8257 = interfaceC17314M8257;
                    String strM3407 = C0817.m3407(C3743.m10961(c10948));
                    if (C2249.m6911(strM3407)) {
                        iM11306 = ThreadFactoryC3888.m11306("ܳۧ") ^ i4;
                        i = ((iM11306 ^ i3) * 4409) ^ (-880491810);
                        i2 = 2143237659;
                    } else {
                        strM3224 = strM3407;
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۘۚ")) * (-109);
                        i = ((iM11306 ^ i4) * 29509) ^ 1542496721;
                        i2 = 2138019881;
                    }
                    InterfaceC17314 interfaceC173110 = interfaceC17314M8257;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    interfaceC17314M8257 = interfaceC173110;
                    break;
                case -1227775803:
                case -454059423:
                    interfaceC17314M8257 = interfaceC17314M8257;
                    if (C1668.f6641 >= 0) {
                        interfaceC17314M8257 = interfaceC17314M8257;
                        iM11306 = (C19806.m45029("ۙ֨") + i3) * (-89);
                        interfaceC17314M8257 = interfaceC17314M8257;
                        i = ((iM11306 ^ i4) * (-11015)) ^ (-1216241150);
                        i2 = -767069370;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ᩴ۠") ^ i4;
                        i = ((iM11306 ^ i3) * 6063) ^ 610915859;
                        i2 = 633266142;
                    }
                    InterfaceC17314 interfaceC173111 = interfaceC17314M8257;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    interfaceC17314M8257 = interfaceC173111;
                    break;
                case -1225068472:
                case 1420486130:
                    strM3224 = m3224();
                    interfaceC17314M8257 = interfaceC17314M8257;
                    iM11306 = (i3 - ThreadFactoryC3888.m11306("ۘۚ")) * (-109);
                    i = ((iM11306 ^ i4) * 29509) ^ 1542496721;
                    i2 = 2138019881;
                    InterfaceC17314 interfaceC173112 = interfaceC17314M8257;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    interfaceC17314M8257 = interfaceC173112;
                    break;
                case -1118055617:
                case -864598892:
                    interfaceC17314M8257 = interfaceC17314M8257;
                    i10 = 307;
                    i11 = 15;
                    if (RunnableC1606.f6488 >= 0) {
                        interfaceC17314M8257 = interfaceC17314M8257;
                        iM11306 = (C19806.m45029("ۙ֨") + i3) * (-89);
                        interfaceC17314M8257 = interfaceC17314M8257;
                        i = ((iM11306 ^ i4) * (-11015)) ^ (-1216241150);
                        i2 = -767069370;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܰ᩺") ^ i4;
                        i = ((iM11306 ^ i3) * (-2185)) ^ (-1051472605);
                        i2 = -353188543;
                    }
                    InterfaceC17314 interfaceC173113 = interfaceC17314M8257;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    interfaceC17314M8257 = interfaceC173113;
                    break;
                case -563029928:
                case 1646258997:
                    interfaceC17314M8257 = C2704.m8257(ApplicationC0716.f2992);
                    if (C1461.f5957 <= 0) {
                        iM11306 = (C19806.m45029("ۙ֨") + i3) * (-89);
                        interfaceC17314M8257 = interfaceC17314M8257;
                        i = ((iM11306 ^ i4) * (-11015)) ^ (-1216241150);
                        i2 = -767069370;
                    } else {
                        iM11306 = C19806.m45029("۟ۡ") ^ i3;
                        interfaceC17314M8257 = interfaceC17314M8257;
                        i = ((iM11306 ^ i4) * (-2549)) ^ 941200787;
                        i2 = -205444002;
                    }
                    InterfaceC17314 interfaceC173114 = interfaceC17314M8257;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    interfaceC17314M8257 = interfaceC173114;
                    break;
                case -391797539:
                case 738742402:
                    C0629.m2915(checkBox, true);
                    break;
                case -238754046:
                case 2019051449:
                    i9 = 60960;
                    iM11306 = (ThreadFactoryC3888.m11306("ۚ֡") ^ i4) * 83;
                    i = ((iM11306 ^ i3) * 28473) ^ (-1057792496);
                    i2 = 1238036223;
                    InterfaceC17314 interfaceC173115 = interfaceC17314M8257;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    interfaceC17314M8257 = interfaceC173115;
                    break;
                case -38802112:
                case 1545575498:
                    interfaceC17314M8257 = interfaceC17314M8257;
                    c = 306;
                    if (C0216.f1393 != 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۙۙ") + i3) * 11;
                        i = ((iM11306 ^ i4) * (-10747)) ^ 179605719;
                        i2 = 1066854226;
                    } else {
                        iM11306 = (C19806.m45029("᩸ܽ") + i4) * 73;
                        i = ((iM11306 ^ i3) * (-4415)) ^ (-1052155975);
                        i2 = -1732000185;
                    }
                    InterfaceC17314 interfaceC173116 = interfaceC17314M8257;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    interfaceC17314M8257 = interfaceC173116;
                    break;
                case 245944527:
                case 793499672:
                    interfaceC17314M8257 = interfaceC17314M8257;
                    sArr = f3035;
                    if (C3577.f13150 >= 0) {
                        interfaceC17314M8257 = interfaceC17314M8257;
                        iM11306 = (C19806.m45029("ۙ֨") + i3) * (-89);
                        interfaceC17314M8257 = interfaceC17314M8257;
                        i = ((iM11306 ^ i4) * (-11015)) ^ (-1216241150);
                        i2 = -767069370;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۗۙ") ^ i3;
                        i = ((iM11306 ^ i4) * 12969) ^ (-242137016);
                        i2 = 370361039;
                    }
                    InterfaceC17314 interfaceC173117 = interfaceC17314M8257;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    interfaceC17314M8257 = interfaceC173117;
                    break;
                case 515150173:
                case 904830512:
                    C2704.m8255();
                    if (C2124.f7782 <= 0) {
                        iM11306 = (C19806.m45029("ۙ֨") + i3) * (-89);
                        interfaceC17314M8257 = interfaceC17314M8257;
                        i = ((iM11306 ^ i4) * (-11015)) ^ (-1216241150);
                        i2 = -767069370;
                        InterfaceC17314 interfaceC173118 = interfaceC17314M8257;
                        i6 = iM11306 ^ i2;
                        i5 = i;
                        interfaceC17314M8257 = interfaceC173118;
                    }
                    iM11306 = (ThreadFactoryC3888.m11306("ܽᩴ") ^ i3) * (-33);
                    interfaceC17314M8257 = interfaceC17314M8257;
                    i = ((iM11306 ^ i4) * (-19743)) ^ (-1283378514);
                    i2 = 755067437;
                    InterfaceC17314 interfaceC173119 = interfaceC17314M8257;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    interfaceC17314M8257 = interfaceC173119;
                    break;
                case 559738087:
                case 591278605:
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        interfaceC17314M8257 = interfaceC17314M8257;
                        iM11306 = (ThreadFactoryC3888.m11306("ۙۙ") + i3) * 11;
                        i = ((iM11306 ^ i4) * (-10747)) ^ 179605719;
                        i2 = 1066854226;
                        InterfaceC17314 interfaceC1731110 = interfaceC17314M8257;
                        i6 = iM11306 ^ i2;
                        i5 = i;
                        interfaceC17314M8257 = interfaceC1731110;
                    }
                    iM11306 = (ThreadFactoryC3888.m11306("ܽᩴ") ^ i3) * (-33);
                    interfaceC17314M8257 = interfaceC17314M8257;
                    i = ((iM11306 ^ i4) * (-19743)) ^ (-1283378514);
                    i2 = 755067437;
                    InterfaceC17314 interfaceC1731111 = interfaceC17314M8257;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    interfaceC17314M8257 = interfaceC1731111;
                    break;
                case 659827992:
                case 1977928301:
                    i9 = 40323;
                    iM11306 = (ThreadFactoryC3888.m11306("ۚ֡") ^ i4) * 83;
                    i = ((iM11306 ^ i3) * 28473) ^ (-1057792496);
                    i2 = 1238036223;
                    InterfaceC17314 interfaceC1731112 = interfaceC17314M8257;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    interfaceC17314M8257 = interfaceC1731112;
                    break;
                case 1199356564:
                case 1239158634:
                    interfaceC17314M8257 = interfaceC17314M8257;
                    i8 = s + s3;
                    if (C0629.m2907()) {
                        iM11306 = (ThreadFactoryC3888.m11306("۟ۤ") ^ i4) * 3;
                        i = ((iM11306 ^ i3) * (-3907)) ^ 912591200;
                        i2 = 679232047;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۙۙ") + i3) * 11;
                        i = ((iM11306 ^ i4) * (-10747)) ^ 179605719;
                        i2 = 1066854226;
                    }
                    InterfaceC17314 interfaceC1731113 = interfaceC17314M8257;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    interfaceC17314M8257 = interfaceC1731113;
                    break;
                default:
                    C3286.m9798();
                    if (C2704.f10408) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܽᩴ") ^ i3) * (-33);
                        interfaceC17314M8257 = interfaceC17314M8257;
                        i = ((iM11306 ^ i4) * (-19743)) ^ (-1283378514);
                        i2 = 755067437;
                        InterfaceC17314 interfaceC1731114 = interfaceC17314M8257;
                        i6 = iM11306 ^ i2;
                        i5 = i;
                        interfaceC17314M8257 = interfaceC1731114;
                    } else {
                        int iM11307 = (i4 - ThreadFactoryC3888.m11306("ܿ۟")) * (-51);
                        i6 = iM11307 ^ (-282829098);
                        i5 = ((iM11307 ^ i3) * (-32577)) ^ (-324406483);
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:163:0x0af6 A[PHI: r103 r104 r105 r106
      0x0af6: PHI (r103v7 int) = (r103v1 int), (r103v3 int), (r103v8 int) binds: [B:159:0x0ad4, B:152:0x0a78, B:145:0x09f2] A[DONT_GENERATE, DONT_INLINE]
      0x0af6: PHI (r104v7 int) = (r104v1 int), (r104v3 int), (r104v8 int) binds: [B:159:0x0ad4, B:152:0x0a78, B:145:0x09f2] A[DONT_GENERATE, DONT_INLINE]
      0x0af6: PHI (r105v7 int) = (r105v1 int), (r105v3 int), (r105v8 int) binds: [B:159:0x0ad4, B:152:0x0a78, B:145:0x09f2] A[DONT_GENERATE, DONT_INLINE]
      0x0af6: PHI (r106v7 int) = (r106v1 int), (r106v3 int), (r106v8 int) binds: [B:159:0x0ad4, B:152:0x0a78, B:145:0x09f2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0516 A[PHI: r2 r103 r104 r105 r106
      0x0516: PHI (r2v112 java.util.ArrayList) = (r2v61 java.util.ArrayList), (r2v68 java.util.ArrayList), (r2v113 java.util.ArrayList) binds: [B:62:0x04ff, B:46:0x0432, B:5:0x0171] A[DONT_GENERATE, DONT_INLINE]
      0x0516: PHI (r103v64 int) = (r103v29 int), (r103v36 int), (r103v65 int) binds: [B:62:0x04ff, B:46:0x0432, B:5:0x0171] A[DONT_GENERATE, DONT_INLINE]
      0x0516: PHI (r104v54 l.ᩴ֫ۨ) = (r104v23 l.ᩴ֫ۨ), (r104v29 l.ᩴ֫ۨ), (r104v55 l.ᩴ֫ۨ) binds: [B:62:0x04ff, B:46:0x0432, B:5:0x0171] A[DONT_GENERATE, DONT_INLINE]
      0x0516: PHI (r105v65 int) = (r105v29 int), (r105v36 int), (r105v66 int) binds: [B:62:0x04ff, B:46:0x0432, B:5:0x0171] A[DONT_GENERATE, DONT_INLINE]
      0x0516: PHI (r106v67 int) = (r106v30 int), (r106v37 int), (r106v68 int) binds: [B:62:0x04ff, B:46:0x0432, B:5:0x0171] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to find 'out' block for switch in B:236:0x10c6. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x016e. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r80v1 */
    /* JADX WARN: Type inference failed for: r80v2 */
    /* JADX WARN: Type inference failed for: r80v3 */
    /* JADX WARN: Type inference failed for: r80v4 */
    /* JADX WARN: Type inference failed for: r80v5 */
    /* JADX WARN: Type inference failed for: r80v6 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m3219(ViewOnClickListenerC0744 viewOnClickListenerC0744, C8485 c8485, C7807 c7807, C22681 c22681, boolean z, AtomicInteger atomicInteger) {
        int iM45029;
        int i;
        int i2;
        int iM11306;
        int i3;
        int i4;
        boolean z2;
        int iM11307;
        int i5;
        int i6;
        int iM450210;
        int i7;
        int i8;
        int iM450211;
        int i9;
        int i10;
        int i11;
        int iM450212;
        int i12;
        int i13;
        ArrayList arrayList;
        int i14;
        int iM11308;
        int i15;
        int i16;
        int i17;
        int iM450213;
        int i18;
        int i19;
        int iM11309;
        int i20;
        int i21;
        AtomicInteger atomicInteger2;
        List list;
        int i22;
        int i23;
        int i24;
        String str;
        C8485 c8486;
        int i25;
        String str2;
        C8485 c8487;
        InterfaceC7945 interfaceC7945;
        List list2;
        int i26;
        int i27;
        AbstractC3384 abstractC3384;
        EnumC10297 enumC10297;
        int i28;
        C8485 c8488;
        C10111 c10111;
        int i29;
        int iM450214;
        int i30;
        int i31;
        ArrayList arrayList2;
        EnumC10297 enumC10298;
        int i32;
        C8485 c8489;
        C8485 c84810;
        InterfaceC7945 interfaceC7946;
        int iM113010;
        int i33;
        InterfaceC7945 interfaceC7947;
        ArrayList arrayList3;
        int i34;
        EnumC10297 enumC10299;
        C10111 c10112;
        InterfaceC7945 interfaceC7948;
        AbstractC3384 abstractC3385;
        List list3;
        int iM450215;
        int i35;
        int i36;
        int i37;
        int i38;
        AbstractC3384 abstractC3386;
        AbstractC3384 abstractC3387;
        int i39;
        int iM450216;
        int i40;
        AbstractC3384 abstractC3388;
        int iM113011;
        int i41;
        int iM450217;
        int i42;
        int i43;
        int i44;
        int iM113012;
        int i45;
        int i46;
        boolean z3;
        int i47;
        int iM450218;
        int i48;
        int i49;
        InterfaceC4685 interfaceC4685;
        int i50;
        int i51;
        C8485 c84811;
        int i52;
        C8485 c84812;
        int iM113013;
        int i53;
        int i54;
        int iM450219;
        int i55;
        int i56;
        ViewOnClickListenerC0744 viewOnClickListenerC0745 = viewOnClickListenerC0744;
        AtomicInteger atomicInteger3 = null;
        String str3 = null;
        int i57 = C3535.f13026;
        int i58 = C0278.f1572;
        int iM113014 = (ThreadFactoryC3888.m11306("᩸ۛ") + i57) * (-15);
        int i59 = ((iM113014 ^ i58) * 3761) ^ 1000673355;
        String strMo20493 = null;
        C8485 c84813 = null;
        InterfaceC7945 interfaceC7945Mo25747 = null;
        C10111 c10113 = null;
        List listMo11508 = null;
        String str4 = null;
        C8485 c84814 = null;
        C8485 c84815 = null;
        C18447 c18447M50239 = null;
        InterfaceC7945 interfaceC7949 = null;
        AbstractC3384 abstractC3389 = null;
        EnumC10297 enumC102910 = null;
        C8485 c84816 = null;
        C8485 c84817 = null;
        InterfaceC13859 interfaceC13859 = null;
        ArrayList arrayList4 = null;
        boolean[] zArr = null;
        int i60 = iM113014 ^ (-411460235);
        int i61 = 0;
        int i62 = 0;
        int i63 = 0;
        int i64 = 0;
        int i65 = -1238606633;
        int i66 = 0;
        ArrayList arrayList5 = null;
        char c = 0;
        boolean z4 = false;
        boolean z5 = false;
        int i67 = 0;
        int i68 = 0;
        int i69 = 0;
        int i70 = 0;
        boolean z6 = false;
        boolean z7 = false;
        int i71 = 0;
        boolean z8 = false;
        int i72 = 0;
        int i73 = 0;
        boolean z9 = false;
        int i74 = 0;
        char c2 = 0;
        boolean z10 = false;
        int i75 = 0;
        boolean z11 = false;
        boolean z12 = false;
        int i76 = 0;
        char c3 = 0;
        int i77 = 0;
        boolean z13 = false;
        ?? r80 = 0;
        int i78 = 0;
        int i79 = 0;
        boolean z14 = false;
        int i80 = 0;
        int i81 = 0;
        int i82 = 0;
        int i83 = 0;
        int i84 = 0;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        boolean z19 = false;
        boolean z20 = false;
        int i85 = 0;
        int i86 = 0;
        ArrayList arrayList6 = null;
        Iterator itM4898 = null;
        Iterator itM10417 = null;
        Iterator itM10418 = null;
        C8485 c84818 = null;
        InterfaceC7945 interfaceC79410 = null;
        C8485 c84819 = null;
        InterfaceC4685 interfaceC4686 = null;
        Iterator itM10563 = null;
        int iM1590 = 0;
        int i87 = 0;
        char c4 = 0;
        String str5 = null;
        InterfaceC7945 interfaceC7945M22153 = null;
        ArrayList arrayListM41301 = null;
        C8485 c84820 = null;
        InterfaceC18528 interfaceC18528 = null;
        AbstractC3384 abstractC33810 = null;
        String strM11312 = null;
        boolean z21 = false;
        while (true) {
            i65 = i60 ^ (i59 & (((i65 ^ i58) * 17165) >> 31));
            switch (i65) {
                case -2122993947:
                case -192238927:
                    i65 = i65;
                    iM1590 = iM1590;
                    i61 = i61;
                    i87 = i87;
                    str3 = str3;
                    i62 = i62;
                    i85 = i85;
                    c84815 = c84815;
                    EnumC10297 enumC102911 = enumC102910;
                    i83 = i83;
                    if (enumC102911 != EnumC10297.f35246) {
                        enumC10298 = enumC102911;
                        i69 = i69;
                        listMo11508 = listMo11508;
                        i80 = i80;
                        abstractC3388 = abstractC33810;
                        int iM113015 = ThreadFactoryC3888.m11306("᩶ۙ") ^ i58;
                        i42 = ((iM113015 ^ i57) * (-19681)) ^ 23155018;
                        i46 = iM113015 ^ 1074373318;
                        listMo11508 = listMo11508;
                        i85 = i85;
                        abstractC33810 = abstractC3388;
                        i80 = i80;
                        c84815 = c84815;
                        str3 = str3;
                        i83 = i83;
                        enumC102910 = enumC10298;
                        i69 = i69;
                        i61 = i61;
                        i62 = i62;
                        iM1590 = iM1590;
                        viewOnClickListenerC0745 = viewOnClickListenerC0744;
                        i60 = i46;
                        i59 = i42;
                        i87 = i87;
                        i65 = i65;
                    } else {
                        enumC102910 = enumC102911;
                        i80 = i80;
                        abstractC3388 = abstractC33810;
                        int iM113016 = (i57 - ThreadFactoryC3888.m11306("ܺܺ")) * 61;
                        i42 = ((iM113016 ^ i58) * 27085) ^ (-1035290738);
                        i46 = iM113016 ^ 183292749;
                        listMo11508 = listMo11508;
                        i85 = i85;
                        abstractC33810 = abstractC3388;
                        i80 = i80;
                        c84815 = c84815;
                        str3 = str3;
                        i83 = i83;
                        i74 = i74;
                        i61 = i61;
                        i62 = i62;
                        iM1590 = iM1590;
                        viewOnClickListenerC0745 = viewOnClickListenerC0744;
                        i60 = i46;
                        i59 = i42;
                        i87 = i87;
                        i65 = i65;
                    }
                    break;
                case -2113565321:
                case 756786894:
                    i65 = i65;
                    iM1590 = iM1590;
                    i62 = i62;
                    arrayList4 = new ArrayList();
                    c4 = 4;
                    if (z10) {
                        iM450210 = C19806.m45029("ۡ᩵") ^ i58;
                        i7 = ((iM450210 ^ i57) * (-28577)) ^ (-580430820);
                        i8 = -1423520154;
                    } else {
                        iM450210 = C19806.m45029("᩷᩶") ^ i57;
                        i7 = ((iM450210 ^ i58) * (-22113)) ^ (-977975461);
                        i8 = -1853442082;
                    }
                    i60 = iM450210 ^ i8;
                    i59 = i7;
                    i65 = i65;
                    i62 = i62;
                    iM1590 = iM1590;
                    break;
                case -2109110871:
                case -362230749:
                    i65 = i65;
                    iM1590 = iM1590;
                    i62 = i62;
                    arrayList4 = arrayList4;
                    if (z10) {
                        iM11307 = ThreadFactoryC3888.m11306("ܽܰ") ^ i57;
                        i5 = ((iM11307 ^ i58) * (-15911)) ^ 2063425925;
                        i6 = -819614347;
                    } else {
                        i77 = i78;
                        iM11307 = (C19806.m45029("᩵ܳ") ^ i58) * 5;
                        i5 = ((iM11307 ^ i57) * (-7455)) ^ 1025027480;
                        i6 = -588359760;
                    }
                    i60 = iM11307 ^ i6;
                    arrayList4 = arrayList4;
                    i59 = i5;
                    i65 = i65;
                    i62 = i62;
                    iM1590 = iM1590;
                    break;
                case -2086156182:
                case 856771970:
                    ((C21269) C0216.m1584(itM10563)).m47733(c84820, c10113, i61);
                    i61++;
                    arrayList4 = arrayList4;
                    iM450211 = (i57 - C19806.m45029("֡ۢ")) * (-51);
                    i9 = ((iM450211 ^ i58) * (-7855)) ^ 1603609681;
                    i10 = -806400365;
                    i60 = iM450211 ^ i10;
                    arrayList4 = arrayList4;
                    i59 = i9;
                    i65 = i65;
                    c18447M50239 = c18447M50239;
                    i62 = i62;
                    iM1590 = iM1590;
                    break;
                case -2076261472:
                case 1500496798:
                    i65 = i65;
                    iM1590 = iM1590;
                    i62 = i62;
                    c18447M50239 = c18447M50239;
                    arrayList4 = arrayList4;
                    if (C1377.m4837(arrayList4) == 1) {
                        iM450211 = (i58 - ThreadFactoryC3888.m11306("ۛ۫")) * 115;
                        i9 = ((iM450211 ^ i57) * (-183)) ^ 393007388;
                        i10 = 332552202;
                    } else {
                        iM450211 = (C19806.m45029("۠᩷") ^ i57) * 23;
                        i9 = ((iM450211 ^ i58) * 17779) ^ (-1824917671);
                        i10 = 1576988353;
                    }
                    i60 = iM450211 ^ i10;
                    arrayList4 = arrayList4;
                    i59 = i9;
                    i65 = i65;
                    c18447M50239 = c18447M50239;
                    i62 = i62;
                    iM1590 = iM1590;
                    break;
                case -2057009055:
                case 524636593:
                    i65 = i65;
                    iM1590 = iM1590;
                    i61 = i61;
                    i25 = i87;
                    str2 = str3;
                    i62 = i62;
                    c8487 = c84813;
                    interfaceC7945 = interfaceC7945Mo25747;
                    i69 = i69;
                    list2 = listMo11508;
                    i26 = i74;
                    i27 = i80;
                    abstractC3384 = abstractC33810;
                    enumC10297 = enumC102910;
                    i28 = i83;
                    int i88 = i85;
                    c8488 = c84815;
                    c10111 = c10113;
                    i29 = i86;
                    if (RunnableC1564.m5348(itM10417)) {
                        iM450214 = C19806.m45029("֡ۚ") ^ i57;
                        i59 = ((iM450214 ^ i58) * (-28769)) ^ (-1920005501);
                        i30 = 941357821;
                    } else {
                        iM450214 = C19806.m45029("ᩴ֡") ^ i58;
                        i59 = ((iM450214 ^ i57) * 22399) ^ (-170095683);
                        i30 = 695017627;
                    }
                    i31 = iM450214 ^ i30;
                    i85 = i88;
                    i86 = i29;
                    i80 = i27;
                    c84815 = c8488;
                    i87 = i25;
                    str3 = str2;
                    i83 = i28;
                    enumC102910 = enumC10297;
                    i74 = i26;
                    interfaceC7945Mo25747 = interfaceC7945;
                    c84813 = c8487;
                    abstractC33810 = abstractC3384;
                    c10113 = c10111;
                    i65 = i65;
                    i61 = i61;
                    i62 = i62;
                    iM1590 = iM1590;
                    i60 = i31;
                    i69 = i69;
                    listMo11508 = list2;
                    viewOnClickListenerC0745 = viewOnClickListenerC0744;
                    break;
                case -2041273141:
                case -792982344:
                    i65 = i65;
                    iM1590 = iM1590;
                    i62 = i62;
                    arrayList4 = arrayList4;
                    i78 = i82;
                    z14 = true;
                    iM11307 = C19806.m45029("᩹᩹") ^ i57;
                    i5 = ((iM11307 ^ i58) * (-3315)) ^ (-1074498062);
                    i6 = -1249132772;
                    i60 = iM11307 ^ i6;
                    arrayList4 = arrayList4;
                    i59 = i5;
                    i65 = i65;
                    i62 = i62;
                    iM1590 = iM1590;
                    break;
                case -2035636822:
                case 1163228388:
                    z20 = true;
                    int iM113017 = ThreadFactoryC3888.m11306("ۤ֡") ^ i57;
                    i65 = i65;
                    i59 = ((iM113017 ^ i58) * (-30179)) ^ 1454306758;
                    i60 = iM113017 ^ (-494276901);
                    i65 = i65;
                    break;
                case -2033032681:
                case -672794839:
                    i65 = i65;
                    iM1590 = iM1590;
                    i61 = i61;
                    i87 = i87;
                    str3 = str3;
                    i62 = i62;
                    i66 = i66;
                    arrayList = arrayList5;
                    c84813 = c84813;
                    interfaceC7945Mo25747 = interfaceC7945Mo25747;
                    i69 = i69;
                    listMo11508 = listMo11508;
                    i74 = i74;
                    i80 = i80;
                    abstractC33810 = abstractC33810;
                    enumC102910 = enumC102910;
                    i83 = i83;
                    i85 = i85;
                    c84815 = c84815;
                    c10113 = c10113;
                    i14 = i86;
                    short s = f3035[278];
                    int i89 = s + 16547;
                    if ((i89 * i89) - (s * 66188) >= 0) {
                        iM11308 = (ThreadFactoryC3888.m11306("ۛ᩷") ^ i57) * (-123);
                        i15 = ((iM11308 ^ i58) * 24317) ^ (-1282146996);
                        i16 = 435996625;
                    } else {
                        iM11308 = (ThreadFactoryC3888.m11306("֫ۚ") + i58) * (-59);
                        i15 = ((iM11308 ^ i57) * (-2007)) ^ 1027588489;
                        i16 = -691899003;
                    }
                    i17 = iM11308 ^ i16;
                    arrayList5 = arrayList;
                    i86 = i14;
                    i80 = i80;
                    c84815 = c84815;
                    i87 = i87;
                    str3 = str3;
                    i83 = i83;
                    enumC102910 = enumC102910;
                    i74 = i74;
                    i85 = i85;
                    interfaceC7945Mo25747 = interfaceC7945Mo25747;
                    c84813 = c84813;
                    abstractC33810 = abstractC33810;
                    c10113 = c10113;
                    i65 = i65;
                    i62 = i62;
                    iM1590 = iM1590;
                    i60 = i17;
                    i66 = i66;
                    i59 = i15;
                    i69 = i69;
                    listMo11508 = listMo11508;
                    i61 = i61;
                    viewOnClickListenerC0745 = viewOnClickListenerC0744;
                    break;
                case -1885840001:
                case -1688189983:
                    iM1590 = iM1590;
                    i87++;
                    iM450211 = ThreadFactoryC3888.m11306("ᩴۢ") ^ i58;
                    i9 = ((iM450211 ^ i57) * 24051) ^ (-75008832);
                    i10 = -351330633;
                    i60 = iM450211 ^ i10;
                    arrayList4 = arrayList4;
                    i59 = i9;
                    i65 = i65;
                    c18447M50239 = c18447M50239;
                    i62 = i62;
                    iM1590 = iM1590;
                    break;
                case -1882179583:
                case -822987434:
                    z2 = c18447M50239.f58808;
                    z11 = z2;
                    iM11306 = (ThreadFactoryC3888.m11306("֨ܺ") ^ i57) * 69;
                    i3 = ((iM11306 ^ i58) * (-20191)) ^ (-953090567);
                    i4 = 342156030;
                    i60 = iM11306 ^ i4;
                    i59 = i3;
                    i65 = i65;
                    i61 = i61;
                    i62 = i62;
                    iM1590 = iM1590;
                    break;
                case -1867526854:
                case -1574537668:
                    i65 = i65;
                    int i90 = iM1590;
                    i62 = i62;
                    arrayList4 = arrayList4;
                    iM1590 = i90;
                    i77 = i78 + i79;
                    iM11307 = (C19806.m45029("᩵ܳ") ^ i58) * 5;
                    i5 = ((iM11307 ^ i57) * (-7455)) ^ 1025027480;
                    i6 = -588359760;
                    i60 = iM11307 ^ i6;
                    arrayList4 = arrayList4;
                    i59 = i5;
                    i65 = i65;
                    i62 = i62;
                    iM1590 = iM1590;
                    break;
                case -1866107143:
                case -26403505:
                    i65 = i65;
                    iM1590 = iM1590;
                    i62 = i62;
                    c18447M50239 = c18447M50239;
                    arrayList4 = arrayList4;
                    if (interfaceC4686 != null) {
                        iM113013 = (C19806.m45029("᩹۬") ^ i57) * (-89);
                        i53 = ((iM113013 ^ i58) * 18429) ^ 1511329920;
                        i54 = -1366647994;
                    } else {
                        iM113013 = (i58 - ThreadFactoryC3888.m11306("ۛᩳ")) * (-5);
                        i53 = ((iM113013 ^ i57) * 20487) ^ 324477272;
                        i54 = -1984473461;
                    }
                    i60 = iM113013 ^ i54;
                    arrayList4 = arrayList4;
                    i65 = i65;
                    c18447M50239 = c18447M50239;
                    iM1590 = iM1590;
                    i59 = i53;
                    i62 = i62;
                    break;
                case -1840103353:
                case 1744532411:
                    i65 = i65;
                    iM1590 = iM1590;
                    i61 = i61;
                    i87 = i87;
                    str3 = str3;
                    i62 = i62;
                    c8487 = c84813;
                    arrayList2 = arrayList6;
                    i69 = i69;
                    list2 = listMo11508;
                    i74 = i74;
                    i80 = i80;
                    abstractC3384 = abstractC33810;
                    enumC10298 = enumC102910;
                    i83 = i83;
                    i85 = i85;
                    c84815 = c84815;
                    c10111 = c10113;
                    i32 = i86;
                    interfaceC18528 = (InterfaceC18528) C0278.m1776(itM10417);
                    interfaceC7945Mo25747 = interfaceC18528.mo25747();
                    if (interfaceC7945Mo25747 != null) {
                        iM113010 = ThreadFactoryC3888.m11306("᩸ۡ") ^ i57;
                        i59 = ((iM113010 ^ i58) * (-14585)) ^ (-485837138);
                        i33 = 101037294;
                    } else {
                        c8489 = c8487;
                        c84810 = c8489;
                        interfaceC7946 = interfaceC7945Mo25747;
                        interfaceC79410 = interfaceC7946;
                        c84818 = c8489;
                        str4 = str5;
                        c84814 = c84810;
                        z4 = z21;
                        iM113010 = (C19806.m45029("ۗۧ") + i57) * (-111);
                        i59 = ((iM113010 ^ i58) * (-23055)) ^ 262711197;
                        i33 = 72613181;
                    }
                    i31 = iM113010 ^ i33;
                    i85 = i85;
                    arrayList6 = arrayList2;
                    i86 = i32;
                    i80 = i80;
                    c84815 = c84815;
                    i87 = i87;
                    str3 = str3;
                    i83 = i83;
                    enumC102910 = enumC10298;
                    i74 = i74;
                    c84813 = c8487;
                    abstractC33810 = abstractC3384;
                    c10113 = c10111;
                    i65 = i65;
                    i61 = i61;
                    i62 = i62;
                    iM1590 = iM1590;
                    i60 = i31;
                    i69 = i69;
                    listMo11508 = list2;
                    viewOnClickListenerC0745 = viewOnClickListenerC0744;
                    break;
                case -1811654841:
                case 874060369:
                    break;
                case -1804451960:
                case 786954193:
                    z19 = false;
                    iM450212 = ThreadFactoryC3888.m11306("ܰ᩹") ^ i57;
                    i12 = ((iM450212 ^ i58) * 10755) ^ (-683825054);
                    i13 = 1920101709;
                    i60 = iM450212 ^ i13;
                    i59 = i12;
                    i65 = i65;
                    c18447M50239 = c18447M50239;
                    i62 = i62;
                    iM1590 = iM1590;
                    break;
                case -1774129255:
                case -705360384:
                    i65 = i65;
                    iM1590 = iM1590;
                    i61 = i61;
                    i87 = i87;
                    str3 = str3;
                    i62 = i62;
                    i80 = i80;
                    i83 = i83;
                    i85 = i85;
                    c84815 = c84815;
                    C2249.m6903(atomicInteger);
                    enumC10298 = enumC102910;
                    c84818 = c84815;
                    str4 = str3;
                    c8487 = c84813;
                    c84814 = c84819;
                    arrayList2 = arrayList6;
                    interfaceC79410 = interfaceC7949;
                    i69 = i69;
                    list2 = listMo11508;
                    i74 = i74;
                    abstractC3384 = abstractC33810;
                    z4 = false;
                    c10111 = c10113;
                    i32 = i86;
                    iM113010 = (C19806.m45029("ۗۧ") + i57) * (-111);
                    i59 = ((iM113010 ^ i58) * (-23055)) ^ 262711197;
                    i33 = 72613181;
                    i31 = iM113010 ^ i33;
                    i85 = i85;
                    arrayList6 = arrayList2;
                    i86 = i32;
                    i80 = i80;
                    c84815 = c84815;
                    i87 = i87;
                    str3 = str3;
                    i83 = i83;
                    enumC102910 = enumC10298;
                    i74 = i74;
                    c84813 = c8487;
                    abstractC33810 = abstractC3384;
                    c10113 = c10111;
                    i65 = i65;
                    i61 = i61;
                    i62 = i62;
                    iM1590 = iM1590;
                    i60 = i31;
                    i69 = i69;
                    listMo11508 = list2;
                    viewOnClickListenerC0745 = viewOnClickListenerC0744;
                    break;
                case -1716514638:
                case -85661907:
                    i65 = i65;
                    iM1590 = iM1590;
                    i61 = i61;
                    i62 = i62;
                    z3 = true;
                    i87 = i87;
                    str3 = str3;
                    i67 = i67;
                    i69 = i69;
                    listMo11508 = listMo11508;
                    i47 = i73;
                    i74 = i74;
                    i80 = i80;
                    enumC10298 = enumC102910;
                    i85 = i85;
                    c84815 = c84815;
                    c10113 = c10113;
                    i38 = i86;
                    z7 = z3;
                    c84817 = c84815;
                    i70 = i47;
                    c84816 = c84819;
                    z6 = z8;
                    int iM113018 = (i57 - ThreadFactoryC3888.m11306("ۡܶ")) * 87;
                    i67 = i67;
                    i85 = i85;
                    i86 = i38;
                    i80 = i80;
                    c84815 = c84815;
                    i87 = i87;
                    str3 = str3;
                    enumC102910 = enumC10298;
                    i74 = i74;
                    i69 = i69;
                    c10113 = c10113;
                    i65 = i65;
                    i62 = i62;
                    iM1590 = iM1590;
                    listMo11508 = listMo11508;
                    i60 = iM113018 ^ (-231646801);
                    i59 = ((iM113018 ^ i58) * (-28183)) ^ 434960571;
                    i61 = i61;
                    viewOnClickListenerC0745 = viewOnClickListenerC0744;
                    break;
                case -1660565807:
                case -1340962889:
                    i65 = i65;
                    iM1590 = iM1590;
                    i61 = i61;
                    i62 = i62;
                    if (c18447M50239.f58809) {
                        iM11306 = (i57 - ThreadFactoryC3888.m11306("֫᩸")) * 109;
                        i3 = ((iM11306 ^ i58) * 13951) ^ (-1253365963);
                        i4 = 695936903;
                    } else {
                        i72 = i63;
                        z9 = z12;
                        iM11306 = (C19806.m45029("ܿۤ") ^ i57) * (-19);
                        i3 = ((iM11306 ^ i58) * 22783) ^ (-175670697);
                        i4 = 827472;
                    }
                    i60 = iM11306 ^ i4;
                    i59 = i3;
                    i65 = i65;
                    i61 = i61;
                    i62 = i62;
                    iM1590 = iM1590;
                    break;
                case -1619878879:
                case -536959897:
                    z10 = false;
                    iM11306 = (ThreadFactoryC3888.m11306("᩹ۛ") ^ i58) * 79;
                    i3 = ((iM11306 ^ i57) * (-4325)) ^ (-1895631288);
                    i4 = -491591563;
                    i60 = iM11306 ^ i4;
                    i59 = i3;
                    i65 = i65;
                    i61 = i61;
                    i62 = i62;
                    iM1590 = iM1590;
                    break;
                case -1597721843:
                case -1060245511:
                    i65 = i65;
                    iM1590 = iM1590;
                    i62 = i62;
                    c18447M50239 = c18447M50239;
                    arrayList4 = arrayList4;
                    if (C1377.m4837(arrayList4) <= 1) {
                        c18447M50239 = c18447M50239;
                        i78 = i63;
                        z14 = z12;
                        iM11307 = C19806.m45029("᩹᩹") ^ i57;
                        i5 = ((iM11307 ^ i58) * (-3315)) ^ (-1074498062);
                        i6 = -1249132772;
                        i60 = iM11307 ^ i6;
                        arrayList4 = arrayList4;
                        i59 = i5;
                        i65 = i65;
                        i62 = i62;
                        iM1590 = iM1590;
                    } else {
                        iM450211 = ThreadFactoryC3888.m11306("۬ᩳ") ^ i58;
                        i9 = ((iM450211 ^ i57) * 28419) ^ 1761730104;
                        i10 = -63200727;
                        i60 = iM450211 ^ i10;
                        arrayList4 = arrayList4;
                        i59 = i9;
                        i65 = i65;
                        c18447M50239 = c18447M50239;
                        i62 = i62;
                        iM1590 = iM1590;
                    }
                    break;
                case -1591133124:
                case -1133359606:
                    i65 = i65;
                    iM1590 = iM1590;
                    i62 = i62;
                    i61 = i61;
                    i72 = i75;
                    z9 = true;
                    iM11306 = (C19806.m45029("ܿۤ") ^ i57) * (-19);
                    i3 = ((iM11306 ^ i58) * 22783) ^ (-175670697);
                    i4 = 827472;
                    i60 = iM11306 ^ i4;
                    i59 = i3;
                    i65 = i65;
                    i61 = i61;
                    i62 = i62;
                    iM1590 = iM1590;
                    break;
                case -1587547168:
                case -544438617:
                    i65 = i65;
                    iM1590 = iM1590;
                    i62 = i62;
                    c18447M50239 = c18447M50239;
                    i84 = i61 + 1;
                    c10113.m25731(i61, new C10256(EnumC10297.f35162, 0, 0, 0, 0, 0, 0, c84820.f51694.m30444(viewOnClickListenerC0745.f3039.f56303)));
                    if (atomicInteger3 == null) {
                        arrayList4 = arrayList4;
                        i11 = i84;
                        i82 = i84;
                        i84 = i11;
                        iM450211 = (C19806.m45029("۬ۘ") ^ i58) * (-35);
                        i9 = ((iM450211 ^ i57) * (-18577)) ^ 1098521043;
                        i10 = 2127036596;
                        i60 = iM450211 ^ i10;
                        arrayList4 = arrayList4;
                        i59 = i9;
                        i65 = i65;
                        c18447M50239 = c18447M50239;
                        i62 = i62;
                        iM1590 = iM1590;
                    } else {
                        iM450212 = ThreadFactoryC3888.m11306("᩻ۛ") ^ i57;
                        i12 = ((iM450212 ^ i58) * (-9599)) ^ 479460864;
                        i13 = 376323479;
                        i60 = iM450212 ^ i13;
                        i59 = i12;
                        i65 = i65;
                        c18447M50239 = c18447M50239;
                        i62 = i62;
                        iM1590 = iM1590;
                    }
                    break;
                case -1586783345:
                case 1040256025:
                    i66 = i66;
                    atomicInteger2 = new AtomicInteger(i66);
                    atomicInteger3 = atomicInteger2;
                    iM11309 = C19806.m45029("ۖۘ") ^ i58;
                    i20 = ((iM11309 ^ i57) * (-4411)) ^ (-1425218644);
                    i21 = 1832485427;
                    i86 = i86;
                    str3 = str3;
                    i85 = i85;
                    c84813 = c84813;
                    i60 = iM11309 ^ i21;
                    i66 = i66;
                    i59 = i20;
                    listMo11508 = listMo11508;
                    iM1590 = iM1590;
                    viewOnClickListenerC0745 = viewOnClickListenerC0744;
                    break;
                case -1584917090:
                case -498920510:
                    i65 = i65;
                    iM1590 = iM1590;
                    i61 = i61;
                    i62 = i62;
                    i70 = i72 - 1;
                    i87 = i87;
                    str3 = str3;
                    c84816 = c8485;
                    c84817 = c84816;
                    i67 = i67;
                    i69 = i69;
                    listMo11508 = listMo11508;
                    z7 = z9;
                    i74 = i74;
                    i80 = i80;
                    enumC10298 = enumC102910;
                    i85 = i85;
                    c84815 = c84815;
                    z6 = true;
                    c10113 = c10113;
                    i38 = i86;
                    int iM113019 = (i57 - ThreadFactoryC3888.m11306("ۡܶ")) * 87;
                    i67 = i67;
                    i85 = i85;
                    i86 = i38;
                    i80 = i80;
                    c84815 = c84815;
                    i87 = i87;
                    str3 = str3;
                    enumC102910 = enumC10298;
                    i74 = i74;
                    i69 = i69;
                    c10113 = c10113;
                    i65 = i65;
                    i62 = i62;
                    iM1590 = iM1590;
                    listMo11508 = listMo11508;
                    i60 = iM113019 ^ (-231646801);
                    i59 = ((iM113019 ^ i58) * (-28183)) ^ 434960571;
                    i61 = i61;
                    viewOnClickListenerC0745 = viewOnClickListenerC0744;
                    break;
                case -1561574452:
                case -1473935146:
                    i65 = i65;
                    iM1590 = iM1590;
                    i61 = i61;
                    i25 = i87;
                    str2 = str3;
                    i62 = i62;
                    i69 = i69;
                    list3 = listMo11508;
                    i26 = i74;
                    i27 = i80;
                    abstractC3384 = abstractC33810;
                    enumC10297 = enumC102910;
                    i28 = i83;
                    i34 = i85;
                    c8488 = c84815;
                    c10111 = c10113;
                    i29 = i86;
                    interfaceC7949 = z5 ? c10111 : interfaceC7945M22153;
                    iM450215 = ThreadFactoryC3888.m11306("ۛܺ") ^ i57;
                    i35 = ((iM450215 ^ i58) * 30925) ^ (-601596608);
                    i36 = 104637890;
                    i37 = iM450215 ^ i36;
                    i85 = i34;
                    i86 = i29;
                    i80 = i27;
                    c84815 = c8488;
                    i87 = i25;
                    str3 = str2;
                    i83 = i28;
                    enumC102910 = enumC10297;
                    i74 = i26;
                    abstractC33810 = abstractC3384;
                    c10113 = c10111;
                    i65 = i65;
                    i62 = i62;
                    iM1590 = iM1590;
                    listMo11508 = list3;
                    i60 = i37;
                    i59 = i35;
                    i69 = i69;
                    i61 = i61;
                    viewOnClickListenerC0745 = viewOnClickListenerC0744;
                    break;
                case -1557932805:
                case 1792707445:
                    i65 = i65;
                    iM1590 = iM1590;
                    i61 = i61;
                    i62 = i62;
                    if (i62 == 0) {
                        iM11306 = (i58 - C19806.m45029("ᩳۤ")) * (-69);
                        i3 = ((iM11306 ^ i57) * 1253) ^ (-446972997);
                        i4 = 1455648620;
                    } else {
                        iM11306 = (C19806.m45029("ۖۡ") + i58) * (-107);
                        i3 = ((iM11306 ^ i57) * 23027) ^ (-1469550343);
                        i4 = 831831355;
                    }
                    i60 = iM11306 ^ i4;
                    i59 = i3;
                    i65 = i65;
                    i61 = i61;
                    i62 = i62;
                    iM1590 = iM1590;
                    break;
                case -1544549626:
                case 127675918:
                    z17 = true;
                    iM450211 = (C19806.m45029("ۨۘ") ^ i57) * 25;
                    i9 = ((iM450211 ^ i58) * 14549) ^ 749586759;
                    i10 = -1826289801;
                    i60 = iM450211 ^ i10;
                    arrayList4 = arrayList4;
                    i59 = i9;
                    i65 = i65;
                    c18447M50239 = c18447M50239;
                    i62 = i62;
                    iM1590 = iM1590;
                    break;
                case -1544421894:
                case 766739208:
                    i65 = i65;
                    iM1590 = iM1590;
                    i61 = i61;
                    i25 = i87;
                    str2 = str3;
                    i62 = i62;
                    i69 = i69;
                    list3 = listMo11508;
                    i26 = i74;
                    i27 = i80;
                    enumC10297 = enumC102910;
                    i28 = i83;
                    i34 = i85;
                    c8488 = c84815;
                    boolean z22 = c18447M50239.f58805;
                    abstractC3384 = abstractC33810;
                    c10111 = c10113;
                    i29 = i86;
                    strM11312 = ThreadFactoryC3888.m11312(f3035, 288, 1, i29);
                    if (z22) {
                        iM450216 = ThreadFactoryC3888.m11306("ۤۡ") ^ i58;
                        i35 = ((iM450216 ^ i57) * 24891) ^ (-178759883);
                        i40 = -1268961781;
                    } else {
                        iM450216 = (C19806.m45029("ۤܶ") + i58) * (-113);
                        i35 = ((iM450216 ^ i57) * 26041) ^ 2082823125;
                        i40 = 397259735;
                    }
                    i37 = iM450216 ^ i40;
                    i85 = i34;
                    i86 = i29;
                    i80 = i27;
                    c84815 = c8488;
                    i87 = i25;
                    str3 = str2;
                    i83 = i28;
                    enumC102910 = enumC10297;
                    i74 = i26;
                    abstractC33810 = abstractC3384;
                    c10113 = c10111;
                    i65 = i65;
                    i62 = i62;
                    iM1590 = iM1590;
                    listMo11508 = list3;
                    i60 = i37;
                    i59 = i35;
                    i69 = i69;
                    i61 = i61;
                    viewOnClickListenerC0745 = viewOnClickListenerC0744;
                    break;
                case -1528522849:
                case 2021486212:
                    i65 = i65;
                    iM1590 = iM1590;
                    i61 = i61;
                    i87 = i87;
                    str3 = str3;
                    i62 = i62;
                    int i91 = i69;
                    listMo11508 = listMo11508;
                    i74 = i74;
                    i80 = i80;
                    abstractC3388 = abstractC33810;
                    enumC10298 = enumC102910;
                    i83 = i83;
                    i85 = i85;
                    c84815 = c84815;
                    if (i80 == i91) {
                        i69 = i91;
                        abstractC3387 = abstractC3388;
                        i80 = i80;
                        i39 = i86;
                        int iM450220 = (C19806.m45029("᩷۠") ^ i57) * (-65);
                        i85 = i85;
                        i67 = i67;
                        i86 = i39;
                        c84815 = c84815;
                        str3 = str3;
                        i83 = i83;
                        enumC102910 = enumC10298;
                        i74 = i74;
                        abstractC33810 = abstractC3387;
                        c10113 = c10113;
                        i61 = i61;
                        i62 = i62;
                        iM1590 = iM1590;
                        listMo11508 = listMo11508;
                        i60 = iM450220 ^ 468483778;
                        i59 = ((iM450220 ^ i58) * (-17995)) ^ 548811780;
                        i87 = i87;
                        i69 = i69;
                        i65 = i65;
                        viewOnClickListenerC0745 = viewOnClickListenerC0744;
                    } else {
                        iM113011 = (C19806.m45029("ۜ᩻") ^ i57) * 9;
                        i69 = i91;
                        i59 = ((iM113011 ^ i58) * (-6993)) ^ (-1362127860);
                        i41 = -425813862;
                        listMo11508 = listMo11508;
                        i85 = i85;
                        abstractC33810 = abstractC3388;
                        i80 = i80;
                        c84815 = c84815;
                        str3 = str3;
                        i83 = i83;
                        enumC102910 = enumC10298;
                        i74 = i74;
                        i69 = i69;
                        i61 = i61;
                        i62 = i62;
                        iM1590 = iM1590;
                        viewOnClickListenerC0745 = viewOnClickListenerC0744;
                        i60 = iM113011 ^ i41;
                        i87 = i87;
                        i65 = i65;
                    }
                    break;
                case -1514173347:
                case -373574400:
                    i65 = i65;
                    iM1590 = iM1590;
                    i61 = i61;
                    i87 = i87;
                    str3 = str3;
                    i62 = i62;
                    i69 = i69;
                    listMo11508 = listMo11508;
                    i80 = i80;
                    abstractC3388 = abstractC33810;
                    enumC10298 = enumC102910;
                    i83 = i83;
                    i85 = i85;
                    c84815 = c84815;
                    int i92 = i85 + 1;
                    if (i92 >= C1937.m6276(listMo11508)) {
                        i74 = i92;
                        int iM1130110 = ThreadFactoryC3888.m11306("᩶ۙ") ^ i58;
                        i42 = ((iM1130110 ^ i57) * (-19681)) ^ 23155018;
                        i46 = iM1130110 ^ 1074373318;
                        listMo11508 = listMo11508;
                        i85 = i85;
                        abstractC33810 = abstractC3388;
                        i80 = i80;
                        c84815 = c84815;
                        str3 = str3;
                        i83 = i83;
                        enumC102910 = enumC10298;
                        i69 = i69;
                        i61 = i61;
                        i62 = i62;
                        iM1590 = iM1590;
                        viewOnClickListenerC0745 = viewOnClickListenerC0744;
                        i60 = i46;
                        i59 = i42;
                        i87 = i87;
                        i65 = i65;
                    } else {
                        iM113011 = ThreadFactoryC3888.m11306("᩷ᩳ") ^ i57;
                        i74 = i92;
                        i59 = ((iM113011 ^ i58) * (-31659)) ^ (-1771446151);
                        i41 = -1687830424;
                        listMo11508 = listMo11508;
                        i85 = i85;
                        abstractC33810 = abstractC3388;
                        i80 = i80;
                        c84815 = c84815;
                        str3 = str3;
                        i83 = i83;
                        enumC102910 = enumC10298;
                        i74 = i74;
                        i69 = i69;
                        i61 = i61;
                        i62 = i62;
                        iM1590 = iM1590;
                        viewOnClickListenerC0745 = viewOnClickListenerC0744;
                        i60 = iM113011 ^ i41;
                        i87 = i87;
                        i65 = i65;
                    }
                    break;
                case -1507405455:
                case -993651132:
                    i65 = i65;
                    iM1590 = iM1590;
                    i61 = i61;
                    i62 = i62;
                    if (viewOnClickListenerC0745.f3039.m41303(c8485, interfaceC13859, interfaceC4686, c10113, i63)) {
                        iM11306 = C19806.m45029("᩶ܶ") ^ i57;
                        i3 = ((iM11306 ^ i58) * (-6069)) ^ (-1073742256);
                        i4 = 297352558;
                    } else {
                        i72 = i63;
                        z9 = z12;
                        iM11306 = (C19806.m45029("ܿۤ") ^ i57) * (-19);
                        i3 = ((iM11306 ^ i58) * 22783) ^ (-175670697);
                        i4 = 827472;
                    }
                    i60 = iM11306 ^ i4;
                    i59 = i3;
                    i65 = i65;
                    i61 = i61;
                    i62 = i62;
                    iM1590 = iM1590;
                    break;
                case -1496992206:
                case -907847433:
                    abstractC3385 = abstractC33810;
                    i68 = 5;
                    int iM450221 = (C19806.m45029("ۖۢ") + i58) * 5;
                    i44 = ((iM450221 ^ i57) * 12919) ^ (-1780202999);
                    i85 = i85;
                    arrayList6 = arrayList6;
                    i86 = i86;
                    i80 = i80;
                    c84815 = c84815;
                    i87 = i87;
                    str3 = str3;
                    i83 = i83;
                    enumC102910 = enumC102910;
                    i74 = i74;
                    abstractC33810 = abstractC3385;
                    c10113 = c10113;
                    i65 = i65;
                    i61 = i61;
                    i62 = i62;
                    iM1590 = iM1590;
                    i60 = iM450221 ^ (-384182132);
                    i69 = i69;
                    listMo11508 = listMo11508;
                    i59 = i44;
                    viewOnClickListenerC0745 = viewOnClickListenerC0744;
                    break;
                case -1461079902:
                case 75729901:
                    z19 = true;
                    iM450212 = ThreadFactoryC3888.m11306("ܰ᩹") ^ i57;
                    i12 = ((iM450212 ^ i58) * 10755) ^ (-683825054);
                    i13 = 1920101709;
                    i60 = iM450212 ^ i13;
                    i59 = i12;
                    i65 = i65;
                    c18447M50239 = c18447M50239;
                    i62 = i62;
                    iM1590 = iM1590;
                    break;
                case -1456803567:
                case -1166765821:
                    i65 = i65;
                    iM1590 = iM1590;
                    i61 = i61;
                    i87 = i87;
                    str3 = str3;
                    i62 = i62;
                    i69 = i69;
                    listMo11508 = listMo11508;
                    i74 = i74;
                    i80 = i80;
                    abstractC33810 = abstractC33810;
                    enumC10298 = enumC102910;
                    i83 = i83;
                    i85 = i85;
                    c84815 = c84815;
                    switch (C16268.f52430[C1189.m4357(C2332.m7080(abstractC33810))]) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                            iM450217 = (C19806.m45029("۫ۗ") + i58) * (-27);
                            i42 = ((iM450217 ^ i57) * (-12701)) ^ (-277833205);
                            i43 = 719281550;
                            i46 = iM450217 ^ i43;
                            listMo11508 = listMo11508;
                            i85 = i85;
                            abstractC33810 = abstractC33810;
                            i80 = i80;
                            c84815 = c84815;
                            str3 = str3;
                            i83 = i83;
                            enumC102910 = enumC10298;
                            i74 = i74;
                            i69 = i69;
                            i61 = i61;
                            i62 = i62;
                            iM1590 = iM1590;
                            viewOnClickListenerC0745 = viewOnClickListenerC0744;
                            i60 = i46;
                            i59 = i42;
                            i87 = i87;
                            i65 = i65;
                            break;
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                            iM450217 = C19806.m45029("ۚ᩵") ^ i58;
                            i42 = ((iM450217 ^ i57) * 1993) ^ 1330344537;
                            i43 = -420093600;
                            i46 = iM450217 ^ i43;
                            listMo11508 = listMo11508;
                            i85 = i85;
                            abstractC33810 = abstractC33810;
                            i80 = i80;
                            c84815 = c84815;
                            str3 = str3;
                            i83 = i83;
                            enumC102910 = enumC10298;
                            i74 = i74;
                            i69 = i69;
                            i61 = i61;
                            i62 = i62;
                            iM1590 = iM1590;
                            viewOnClickListenerC0745 = viewOnClickListenerC0744;
                            i60 = i46;
                            i59 = i42;
                            i87 = i87;
                            i65 = i65;
                            break;
                        default:
                            abstractC3386 = abstractC33810;
                            i67 = i67;
                            i38 = i86;
                            abstractC33810 = abstractC3386;
                            i83 = i83;
                            z3 = z5;
                            i47 = i85;
                            z7 = z3;
                            c84817 = c84815;
                            i70 = i47;
                            c84816 = c84819;
                            z6 = z8;
                            int iM1130111 = (i57 - ThreadFactoryC3888.m11306("ۡܶ")) * 87;
                            i67 = i67;
                            i85 = i85;
                            i86 = i38;
                            i80 = i80;
                            c84815 = c84815;
                            i87 = i87;
                            str3 = str3;
                            enumC102910 = enumC10298;
                            i74 = i74;
                            i69 = i69;
                            c10113 = c10113;
                            i65 = i65;
                            i62 = i62;
                            iM1590 = iM1590;
                            listMo11508 = listMo11508;
                            i60 = iM1130111 ^ (-231646801);
                            i59 = ((iM1130111 ^ i58) * (-28183)) ^ 434960571;
                            i61 = i61;
                            viewOnClickListenerC0745 = viewOnClickListenerC0744;
                            break;
                    }
                    break;
                case -1446626593:
                case -174144129:
                    i65 = i65;
                    iM1590 = iM1590;
                    i61 = i61;
                    i87 = i87;
                    str3 = str3;
                    i62 = i62;
                    i80 = i80;
                    enumC102910 = enumC102910;
                    i83 = i83;
                    i85 = i85;
                    c84815 = c84815;
                    if (atomicInteger3 != null) {
                        iM450218 = (i57 - ThreadFactoryC3888.m11306("ۢܶ")) * (-29);
                        i48 = ((iM450218 ^ i58) * 17433) ^ 2307244;
                        i49 = -91003498;
                    } else {
                        i73 = i83;
                        iM450218 = (C19806.m45029("᩺۟") ^ i58) * 97;
                        i48 = ((iM450218 ^ i57) * 24585) ^ (-1241088742);
                        i49 = -1330015952;
                    }
                    i85 = i85;
                    enumC102910 = enumC102910;
                    i80 = i80;
                    c84815 = c84815;
                    i87 = i87;
                    str3 = str3;
                    i83 = i83;
                    i65 = i65;
                    i62 = i62;
                    iM1590 = iM1590;
                    i60 = iM450218 ^ i49;
                    i59 = i48;
                    i61 = i61;
                    break;
                case -1419429049:
                case 1765080386:
                    i22 = i86;
                    C2249.m6905(arrayList6, c84818.m22155(interfaceC18528.mo9700(), C0962.m3752(interfaceC18528), interfaceC18528.getParameters(), interfaceC18528.mo9698(), interfaceC18528.mo25750(), interfaceC18528.getAnnotations(), interfaceC18528.mo25749(), interfaceC79410));
                    list = listMo11508;
                    str = str3;
                    i23 = i66;
                    z21 = z4;
                    str5 = str4;
                    i24 = i85;
                    c8486 = c84814;
                    int iM450222 = (i57 - C19806.m45029("֨ۚ")) * 85;
                    i60 = iM450222 ^ (-898488832);
                    i86 = i22;
                    i85 = i24;
                    str3 = str;
                    i66 = i23;
                    c84813 = c8486;
                    i59 = ((iM450222 ^ i58) * 27725) ^ (-158550642);
                    listMo11508 = list;
                    iM1590 = iM1590;
                    viewOnClickListenerC0745 = viewOnClickListenerC0744;
                    break;
                case -1419139093:
                case 1780400352:
                    i65 = i65;
                    iM1590 = iM1590;
                    i61 = i61;
                    i87 = i87;
                    str3 = str3;
                    i62 = i62;
                    i80 = i80;
                    enumC102910 = enumC102910;
                    int i93 = i83;
                    i85 = i85;
                    c84815 = c84815;
                    i71 = i85 + 1;
                    if (atomicInteger3 != null) {
                        iM450218 = (ThreadFactoryC3888.m11306("ۘۗ") ^ i58) * (-61);
                        i83 = i93;
                        i48 = ((iM450218 ^ i57) * (-8653)) ^ 520502546;
                        i49 = -1862901911;
                    } else {
                        i83 = i93;
                        i73 = i71;
                        iM450218 = (C19806.m45029("᩺۟") ^ i58) * 97;
                        i48 = ((iM450218 ^ i57) * 24585) ^ (-1241088742);
                        i49 = -1330015952;
                    }
                    i85 = i85;
                    enumC102910 = enumC102910;
                    i80 = i80;
                    c84815 = c84815;
                    i87 = i87;
                    str3 = str3;
                    i83 = i83;
                    i65 = i65;
                    i62 = i62;
                    iM1590 = iM1590;
                    i60 = iM450218 ^ i49;
                    i59 = i48;
                    i61 = i61;
                    break;
                case -1382122241:
                case 269409597:
                    abstractC3385 = abstractC33810;
                    itM10418 = C3535.m10417(interfaceC7945M22153.mo11510());
                    i68 = i64;
                    int iM450223 = (C19806.m45029("ۖۢ") + i58) * 5;
                    i44 = ((iM450223 ^ i57) * 12919) ^ (-1780202999);
                    i85 = i85;
                    arrayList6 = arrayList6;
                    i86 = i86;
                    i80 = i80;
                    c84815 = c84815;
                    i87 = i87;
                    str3 = str3;
                    i83 = i83;
                    enumC102910 = enumC102910;
                    i74 = i74;
                    abstractC33810 = abstractC3385;
                    c10113 = c10113;
                    i65 = i65;
                    i61 = i61;
                    i62 = i62;
                    iM1590 = iM1590;
                    i60 = iM450223 ^ (-384182132);
                    i69 = i69;
                    listMo11508 = listMo11508;
                    i59 = i44;
                    viewOnClickListenerC0745 = viewOnClickListenerC0744;
                    break;
                case -1376182169:
                case 73006535:
                    i65 = i65;
                    iM1590 = iM1590;
                    i61 = i61;
                    i87 = i87;
                    str3 = str3;
                    i62 = i62;
                    i66 = i66;
                    arrayList = arrayList5;
                    c84813 = c84813;
                    interfaceC7945Mo25747 = interfaceC7945Mo25747;
                    i69 = i69;
                    listMo11508 = listMo11508;
                    i74 = i74;
                    i80 = i80;
                    abstractC33810 = abstractC33810;
                    enumC102910 = enumC102910;
                    i83 = i83;
                    i85 = i85;
                    c84815 = c84815;
                    c10113 = c10113;
                    i14 = i86;
                    if (C0962.m3748(itM4898)) {
                        iM11308 = ThreadFactoryC3888.m11306("ۤۧ") ^ i58;
                        i15 = ((iM11308 ^ i57) * (-9093)) ^ 1875435582;
                        i16 = 737409568;
                    } else {
                        iM11308 = ThreadFactoryC3888.m11306("᩺ᩳ") ^ i57;
                        i15 = ((iM11308 ^ i58) * (-20027)) ^ 1546728758;
                        i16 = -2006026940;
                    }
                    i17 = iM11308 ^ i16;
                    arrayList5 = arrayList;
                    i86 = i14;
                    i80 = i80;
                    c84815 = c84815;
                    i87 = i87;
                    str3 = str3;
                    i83 = i83;
                    enumC102910 = enumC102910;
                    i74 = i74;
                    i85 = i85;
                    interfaceC7945Mo25747 = interfaceC7945Mo25747;
                    c84813 = c84813;
                    abstractC33810 = abstractC33810;
                    c10113 = c10113;
                    i65 = i65;
                    i62 = i62;
                    iM1590 = iM1590;
                    i60 = i17;
                    i66 = i66;
                    i59 = i15;
                    i69 = i69;
                    listMo11508 = listMo11508;
                    i61 = i61;
                    viewOnClickListenerC0745 = viewOnClickListenerC0744;
                    break;
                case -1353017470:
                case 1548206419:
                    i65 = i65;
                    iM1590 = iM1590;
                    i61 = i61;
                    i87 = i87;
                    str3 = str3;
                    i62 = i62;
                    i69 = i69;
                    listMo11508 = listMo11508;
                    i74 = i74;
                    abstractC3387 = abstractC33810;
                    enumC10298 = enumC102910;
                    i83 = i83;
                    i85 = i85;
                    c84815 = c84815;
                    c10113 = c10113;
                    i39 = i86;
                    int iMo1599 = ((InterfaceC7239) C0216.m1584(itM10418)).mo1599();
                    i67 = i67;
                    if (iMo1599 != i67) {
                        int iM113020 = ThreadFactoryC3888.m11306("ۘۢ") ^ i58;
                        i80 = iMo1599;
                        i85 = i85;
                        i67 = i67;
                        i86 = i39;
                        i59 = ((iM113020 ^ i57) * 23455) ^ (-161731119);
                        c84815 = c84815;
                        str3 = str3;
                        i83 = i83;
                        enumC102910 = enumC10298;
                        i74 = i74;
                        abstractC33810 = abstractC3387;
                        c10113 = c10113;
                        i61 = i61;
                        i62 = i62;
                        iM1590 = iM1590;
                        listMo11508 = listMo11508;
                        i60 = iM113020 ^ 1374064692;
                    } else {
                        i80 = iMo1599;
                        int iM450224 = (C19806.m45029("᩷۠") ^ i57) * (-65);
                        i85 = i85;
                        i67 = i67;
                        i86 = i39;
                        c84815 = c84815;
                        str3 = str3;
                        i83 = i83;
                        enumC102910 = enumC10298;
                        i74 = i74;
                        abstractC33810 = abstractC3387;
                        c10113 = c10113;
                        i61 = i61;
                        i62 = i62;
                        iM1590 = iM1590;
                        listMo11508 = listMo11508;
                        i60 = iM450224 ^ 468483778;
                        i59 = ((iM450224 ^ i58) * (-17995)) ^ 548811780;
                    }
                    i87 = i87;
                    i69 = i69;
                    i65 = i65;
                    viewOnClickListenerC0745 = viewOnClickListenerC0744;
                    break;
                case -1273289383:
                case 801221631:
                    i65 = i65;
                    iM1590 = iM1590;
                    i62 = i62;
                    c18447M50239 = c18447M50239;
                    arrayList4 = arrayList4;
                    i81 = i63 + 1;
                    ((C21269) C3286.m9796(arrayList4, 0)).m47734(c84820, c10113, i63);
                    if (atomicInteger3 != null) {
                        iM450211 = ThreadFactoryC3888.m11306("ۧ۠") ^ i57;
                        i9 = ((iM450211 ^ i58) * 32633) ^ 835460220;
                        i10 = 2040791848;
                    } else {
                        i11 = i84;
                        i84 = i81;
                        i82 = i84;
                        i84 = i11;
                        iM450211 = (C19806.m45029("۬ۘ") ^ i58) * (-35);
                        i9 = ((iM450211 ^ i57) * (-18577)) ^ 1098521043;
                        i10 = 2127036596;
                    }
                    i60 = iM450211 ^ i10;
                    arrayList4 = arrayList4;
                    i59 = i9;
                    i65 = i65;
                    c18447M50239 = c18447M50239;
                    i62 = i62;
                    iM1590 = iM1590;
                    break;
                case -1240503485:
                case 479725565:
                    i65 = i65;
                    iM1590 = iM1590;
                    i61 = i61;
                    i25 = i87;
                    str2 = str3;
                    i62 = i62;
                    i69 = i69;
                    list3 = listMo11508;
                    i26 = i74;
                    i27 = i80;
                    abstractC3384 = abstractC33810;
                    enumC10297 = enumC102910;
                    i28 = i83;
                    i34 = i85;
                    c8488 = c84815;
                    c10111 = c10113;
                    i29 = i86;
                    if (i34 < C1937.m6276(list3)) {
                        iM450215 = C19806.m45029("ۡ۟") ^ i57;
                        i35 = ((iM450215 ^ i58) * 26121) ^ (-266164354);
                        i36 = 994545846;
                    } else {
                        iM450215 = (C19806.m45029("֨֡") + i58) * (-107);
                        i35 = ((iM450215 ^ i57) * (-23851)) ^ (-1718089167);
                        i36 = 203009068;
                    }
                    i37 = iM450215 ^ i36;
                    i85 = i34;
                    i86 = i29;
                    i80 = i27;
                    c84815 = c8488;
                    i87 = i25;
                    str3 = str2;
                    i83 = i28;
                    enumC102910 = enumC10297;
                    i74 = i26;
                    abstractC33810 = abstractC3384;
                    c10113 = c10111;
                    i65 = i65;
                    i62 = i62;
                    iM1590 = iM1590;
                    listMo11508 = list3;
                    i60 = i37;
                    i59 = i35;
                    i69 = i69;
                    i61 = i61;
                    viewOnClickListenerC0745 = viewOnClickListenerC0744;
                    break;
                case -1236196683:
                case 566971677:
                    i65 = i65;
                    int i94 = iM1590;
                    i62 = i62;
                    ArrayList arrayList7 = arrayList4;
                    int i95 = c18447M50239.f58806;
                    if ((i95 & 1) != 0) {
                        int iM450225 = C19806.m45029("ۡۢ") ^ i58;
                        iM1590 = i94;
                        i59 = ((iM450225 ^ i57) * (-1503)) ^ 917107984;
                        i60 = iM450225 ^ (-19915066);
                        arrayList4 = arrayList7;
                        i76 = i95;
                    } else {
                        iM1590 = i94;
                        int iM113021 = (i57 - ThreadFactoryC3888.m11306("ᩴۜ")) * 25;
                        i60 = iM113021 ^ (-1769403122);
                        arrayList4 = arrayList7;
                        i76 = i95;
                        i59 = ((iM113021 ^ i58) * 27297) ^ (-1049099685);
                    }
                    i65 = i65;
                    i62 = i62;
                    iM1590 = iM1590;
                    break;
                case -1227221243:
                case 1559837663:
                    enumC10299 = enumC102910;
                    interfaceC7948 = interfaceC7945M22153;
                    c10112 = new C10111(interfaceC7948);
                    listMo11508 = c10112.mo11508();
                    c84819 = c84813;
                    c84815 = c84819;
                    c = 3;
                    z5 = false;
                    z8 = true;
                    c3 = 5;
                    i85 = 0;
                    int iM450226 = (i57 - C19806.m45029("ۗ᩺")) * 47;
                    interfaceC7945M22153 = interfaceC7948;
                    arrayList6 = arrayList6;
                    i86 = i86;
                    i80 = i80;
                    i87 = i87;
                    str3 = str3;
                    i83 = i83;
                    enumC102910 = enumC10299;
                    i74 = i74;
                    abstractC33810 = abstractC33810;
                    i65 = i65;
                    i61 = i61;
                    i62 = i62;
                    iM1590 = iM1590;
                    i60 = iM450226 ^ (-2056832935);
                    c10113 = c10112;
                    i59 = ((iM450226 ^ i58) * (-4625)) ^ 876162483;
                    i69 = i69;
                    viewOnClickListenerC0745 = viewOnClickListenerC0744;
                    break;
                case -1199967334:
                case 1929018879:
                    i65 = i65;
                    iM1590 = iM1590;
                    i61 = i61;
                    i87 = i87;
                    str3 = str3;
                    i62 = i62;
                    i80 = i80;
                    enumC102910 = enumC102910;
                    i83 = i83;
                    i85 = i85;
                    c84815 = c84815;
                    if (i80 == 9) {
                        enumC10298 = enumC102910;
                        i80 = i80;
                        i69 = i69;
                        listMo11508 = listMo11508;
                        i74 = i74;
                        abstractC3387 = abstractC33810;
                        i39 = i86;
                        int iM450227 = (C19806.m45029("᩷۠") ^ i57) * (-65);
                        i85 = i85;
                        i67 = i67;
                        i86 = i39;
                        c84815 = c84815;
                        str3 = str3;
                        i83 = i83;
                        enumC102910 = enumC10298;
                        i74 = i74;
                        abstractC33810 = abstractC3387;
                        c10113 = c10113;
                        i61 = i61;
                        i62 = i62;
                        iM1590 = iM1590;
                        listMo11508 = listMo11508;
                        i60 = iM450227 ^ 468483778;
                        i59 = ((iM450227 ^ i58) * (-17995)) ^ 548811780;
                        i87 = i87;
                        i69 = i69;
                        i65 = i65;
                        viewOnClickListenerC0745 = viewOnClickListenerC0744;
                    } else {
                        iM450218 = (i58 - C19806.m45029("᩺ۘ")) * 35;
                        i48 = ((iM450218 ^ i57) * (-14659)) ^ (-1853974344);
                        i49 = 1085345063;
                        i85 = i85;
                        enumC102910 = enumC102910;
                        i80 = i80;
                        c84815 = c84815;
                        i87 = i87;
                        str3 = str3;
                        i83 = i83;
                        i65 = i65;
                        i62 = i62;
                        iM1590 = iM1590;
                        i60 = iM450218 ^ i49;
                        i59 = i48;
                        i61 = i61;
                    }
                    break;
                case -1128833560:
                case -130280803:
                    i65 = i65;
                    iM1590 = iM1590;
                    i61 = i61;
                    i87 = i87;
                    str3 = str3;
                    i62 = i62;
                    i80 = i80;
                    enumC10298 = enumC102910;
                    i83 = i83;
                    i85 = i85;
                    c84815 = c84815;
                    itM10418.remove();
                    iM450217 = C19806.m45029("ᩳ᩵") ^ i57;
                    i42 = ((iM450217 ^ i58) * (-16595)) ^ 1816570199;
                    i43 = -114899889;
                    i46 = iM450217 ^ i43;
                    listMo11508 = listMo11508;
                    i85 = i85;
                    abstractC33810 = abstractC33810;
                    i80 = i80;
                    c84815 = c84815;
                    str3 = str3;
                    i83 = i83;
                    enumC102910 = enumC10298;
                    i74 = i74;
                    i69 = i69;
                    i61 = i61;
                    i62 = i62;
                    iM1590 = iM1590;
                    viewOnClickListenerC0745 = viewOnClickListenerC0744;
                    i60 = i46;
                    i59 = i42;
                    i87 = i87;
                    i65 = i65;
                    break;
                case -1128690173:
                case -445594399:
                    i65 = i65;
                    iM1590 = iM1590;
                    i62 = i62;
                    c18447M50239 = c18447M50239;
                    if ((i76 & 16) != 0) {
                        iM450212 = (i58 - ThreadFactoryC3888.m11306("ܳ֡")) * (-19);
                        i12 = ((iM450212 ^ i57) * 8157) ^ 1773793245;
                        i13 = 2027031047;
                    } else {
                        iM450212 = (i57 - ThreadFactoryC3888.m11306("ۡۧ")) * (-103);
                        i12 = ((iM450212 ^ i58) * (-18951)) ^ 298348639;
                        i13 = 1137153280;
                    }
                    i60 = iM450212 ^ i13;
                    i59 = i12;
                    i65 = i65;
                    c18447M50239 = c18447M50239;
                    i62 = i62;
                    iM1590 = iM1590;
                    break;
                case -1127280001:
                case 2086542504:
                    i87 = 0;
                    iM1590 = C0216.m1590(zArr.length, C1377.m4837(arrayListM41301));
                    iM450211 = ThreadFactoryC3888.m11306("ᩴۢ") ^ i58;
                    i9 = ((iM450211 ^ i57) * 24051) ^ (-75008832);
                    i10 = -351330633;
                    i60 = iM450211 ^ i10;
                    arrayList4 = arrayList4;
                    i59 = i9;
                    i65 = i65;
                    c18447M50239 = c18447M50239;
                    i62 = i62;
                    iM1590 = iM1590;
                    break;
                case -1117189639:
                case 1815802350:
                    boolean[] zArr2 = new boolean[6];
                    zArr2[0] = z15;
                    zArr2[r80] = z16;
                    zArr2[c2] = z17;
                    zArr2[c] = z18;
                    zArr2[c4] = z19;
                    zArr2[c3] = z20;
                    zArr = zArr2;
                    iM113013 = (C19806.m45029("ۜ۟") + i58) * 99;
                    i53 = ((iM113013 ^ i57) * (-12185)) ^ 1329537488;
                    i54 = 419768534;
                    i60 = iM113013 ^ i54;
                    arrayList4 = arrayList4;
                    i65 = i65;
                    c18447M50239 = c18447M50239;
                    iM1590 = iM1590;
                    i59 = i53;
                    i62 = i62;
                    break;
                case -1081876378:
                case 1450492529:
                    i50 = iM1590;
                    i51 = i85;
                    c84811 = c84815;
                    InterfaceC13859 interfaceC138510 = (InterfaceC13859) abstractC33810;
                    i52 = 0;
                    arrayListM41301 = viewOnClickListenerC0745.f3039.m41301(interfaceC138510);
                    i63 = i51;
                    interfaceC13859 = interfaceC138510;
                    c84812 = c84811;
                    z12 = z5;
                    r80 = z8;
                    int iM450228 = (C19806.m45029("ܳ᩸") ^ i57) * (-65);
                    C8485 c84821 = c84812;
                    i59 = ((iM450228 ^ i58) * 7961) ^ 1918575491;
                    i85 = i51;
                    i83 = i83;
                    enumC102910 = enumC102910;
                    c84815 = c84811;
                    i62 = i52;
                    i87 = i87;
                    c84820 = c84821;
                    i65 = i65;
                    i61 = i61;
                    iM1590 = i50;
                    i60 = iM450228 ^ 1800035080;
                    str3 = str3;
                    break;
                case -1009349018:
                case 1787263393:
                    i65 = i65;
                    iM1590 = iM1590;
                    i61 = i61;
                    StringBuilder sbM8976 = C3012.m8976(str3, strM11312);
                    C0817.m3408(sbM8976, C0629.m2913(atomicInteger3));
                    c84815 = c84815;
                    i62 = i62;
                    i87 = i87;
                    i85 = i85;
                    c10113.m25732(i85, new C17166(0, c84815.m22164(C0817.m3407(sbM8976)), null, null));
                    c10113.m25732(i85, new C19989(atomicInteger3.getAndIncrement()));
                    str3 = str3;
                    i80 = i80;
                    enumC102910 = enumC102910;
                    i83 = i83;
                    i73 = i71;
                    iM450218 = (C19806.m45029("᩺۟") ^ i58) * 97;
                    i48 = ((iM450218 ^ i57) * 24585) ^ (-1241088742);
                    i49 = -1330015952;
                    i85 = i85;
                    enumC102910 = enumC102910;
                    i80 = i80;
                    c84815 = c84815;
                    i87 = i87;
                    str3 = str3;
                    i83 = i83;
                    i65 = i65;
                    i62 = i62;
                    iM1590 = iM1590;
                    i60 = iM450218 ^ i49;
                    i59 = i48;
                    i61 = i61;
                    break;
                case -1008616705:
                case 1540884768:
                    i65 = i65;
                    iM1590 = iM1590;
                    i62 = i62;
                    arrayList4 = arrayList4;
                    if (z11) {
                        iM11307 = (ThreadFactoryC3888.m11306("ۡۗ") + i58) * 43;
                        i5 = ((iM11307 ^ i57) * (-25319)) ^ 1034946905;
                        i6 = 1898382472;
                    } else {
                        i78 = i63;
                        z14 = z12;
                        iM11307 = C19806.m45029("᩹᩹") ^ i57;
                        i5 = ((iM11307 ^ i58) * (-3315)) ^ (-1074498062);
                        i6 = -1249132772;
                    }
                    i60 = iM11307 ^ i6;
                    arrayList4 = arrayList4;
                    i59 = i5;
                    i65 = i65;
                    i62 = i62;
                    iM1590 = iM1590;
                    break;
                case -1004367209:
                case -808390624:
                    i65 = i65;
                    iM1590 = iM1590;
                    i62 = i62;
                    c18447M50239 = c18447M50239;
                    arrayList4 = arrayList4;
                    if ((i76 & 8) != 0) {
                        iM450211 = (ThreadFactoryC3888.m11306("ۚᩴ") + i57) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i9 = ((iM450211 ^ i58) * (-13521)) ^ (-870941127);
                        i10 = -866761452;
                    } else {
                        iM450211 = (C19806.m45029("᩹ۘ") + i58) * 47;
                        i9 = ((iM450211 ^ i57) * (-8011)) ^ 2029913292;
                        i10 = -1226443795;
                    }
                    i60 = iM450211 ^ i10;
                    arrayList4 = arrayList4;
                    i59 = i9;
                    i65 = i65;
                    c18447M50239 = c18447M50239;
                    i62 = i62;
                    iM1590 = iM1590;
                    break;
                case -1002468981:
                case 642049006:
                    i65 = i65;
                    iM1590 = iM1590;
                    i62 = i62;
                    c18447M50239 = c18447M50239;
                    arrayList4 = arrayList4;
                    StringBuilder sbM8977 = C3012.m8976(str3, strM11312);
                    C0817.m3408(sbM8977, ViewGroupOnHierarchyChangeListenerC1916.m6238(atomicInteger3));
                    c10113.m25732(i63, new C17166(0, c84820.m22164(C2124.m6674(sbM8977)), null, null));
                    c10113.m25732(i63, new C19989(atomicInteger3.getAndIncrement()));
                    i11 = i84;
                    i84 = i81;
                    i82 = i84;
                    i84 = i11;
                    iM450211 = (C19806.m45029("۬ۘ") ^ i58) * (-35);
                    i9 = ((iM450211 ^ i57) * (-18577)) ^ 1098521043;
                    i10 = 2127036596;
                    i60 = iM450211 ^ i10;
                    arrayList4 = arrayList4;
                    i59 = i9;
                    i65 = i65;
                    c18447M50239 = c18447M50239;
                    i62 = i62;
                    iM1590 = iM1590;
                    break;
                case -997805397:
                case 1724979622:
                    i65 = i65;
                    iM1590 = iM1590;
                    i61 = i61;
                    i87 = i87;
                    str3 = str3;
                    i62 = i62;
                    listMo11508 = listMo11508;
                    int i96 = i74;
                    i80 = i80;
                    abstractC3388 = abstractC33810;
                    i83 = i83;
                    i85 = i85;
                    c84815 = c84815;
                    abstractC3389 = (AbstractC3384) RunnableC1606.m5478(listMo11508, i96);
                    EnumC10297 enumC10297M7080 = C2332.m7080(abstractC3389);
                    i74 = i96;
                    if (enumC10297M7080 == EnumC10297.f35238) {
                        enumC102910 = enumC10297M7080;
                        int iM1130112 = (i57 - ThreadFactoryC3888.m11306("ܺܺ")) * 61;
                        i42 = ((iM1130112 ^ i58) * 27085) ^ (-1035290738);
                        i46 = iM1130112 ^ 183292749;
                        listMo11508 = listMo11508;
                        i85 = i85;
                        abstractC33810 = abstractC3388;
                        i80 = i80;
                        c84815 = c84815;
                        str3 = str3;
                        i83 = i83;
                        i74 = i74;
                        i61 = i61;
                        i62 = i62;
                        iM1590 = iM1590;
                        viewOnClickListenerC0745 = viewOnClickListenerC0744;
                        i60 = i46;
                        i59 = i42;
                        i87 = i87;
                        i65 = i65;
                    } else {
                        iM113012 = C19806.m45029("ۙ۫") ^ i58;
                        enumC10298 = enumC10297M7080;
                        i42 = ((iM113012 ^ i57) * (-22229)) ^ 1372513370;
                        i45 = -237859069;
                        i46 = iM113012 ^ i45;
                        listMo11508 = listMo11508;
                        i85 = i85;
                        abstractC33810 = abstractC3388;
                        i80 = i80;
                        c84815 = c84815;
                        str3 = str3;
                        i83 = i83;
                        enumC102910 = enumC10298;
                        i74 = i74;
                        i61 = i61;
                        i62 = i62;
                        iM1590 = iM1590;
                        viewOnClickListenerC0745 = viewOnClickListenerC0744;
                        i60 = i46;
                        i59 = i42;
                        i87 = i87;
                        i65 = i65;
                    }
                    break;
                case -956443408:
                case 1233992264:
                    i65 = i65;
                    int iM4837 = i61 - C1377.m4837(arrayList4);
                    c18447M50239 = c18447M50239;
                    StringBuilder sbM8978 = C3012.m8976(str3, strM11312);
                    i62 = i62;
                    C0817.m3408(sbM8978, C0629.m2913(atomicInteger3));
                    iM1590 = iM1590;
                    c10113.m25732(iM4837, new C17166(0, c84820.m22164(C0817.m3407(sbM8978)), null, null));
                    c10113.m25732(i61 - C1377.m4837(arrayList4), new C19989(atomicInteger3.getAndIncrement()));
                    arrayList4 = arrayList4;
                    i82 = i84;
                    iM450211 = (C19806.m45029("۬ۘ") ^ i58) * (-35);
                    i9 = ((iM450211 ^ i57) * (-18577)) ^ 1098521043;
                    i10 = 2127036596;
                    i60 = iM450211 ^ i10;
                    arrayList4 = arrayList4;
                    i59 = i9;
                    i65 = i65;
                    c18447M50239 = c18447M50239;
                    i62 = i62;
                    iM1590 = iM1590;
                    break;
                case -904129711:
                case 69828914:
                    z15 = false;
                    iM113013 = (i57 - C19806.m45029("֡۬")) * 45;
                    i53 = ((iM113013 ^ i58) * 9139) ^ (-1352501911);
                    i54 = -1281063071;
                    i60 = iM113013 ^ i54;
                    arrayList4 = arrayList4;
                    i65 = i65;
                    c18447M50239 = c18447M50239;
                    iM1590 = iM1590;
                    i59 = i53;
                    i62 = i62;
                    break;
                case -861433650:
                case 1234544116:
                    iM1590 = iM1590;
                    int i97 = i61;
                    int i98 = i62;
                    if (i98 < 2) {
                        iM45029 = (i58 - ThreadFactoryC3888.m11306("᩶ᩳ")) * 97;
                        i = ((iM45029 ^ i57) * (-29413)) ^ 1957776089;
                        i2 = -1946902383;
                    } else {
                        iM45029 = (C19806.m45029("ۨܺ") + i57) * (-127);
                        i = ((iM45029 ^ i58) * 25183) ^ (-900324916);
                        i2 = -549001402;
                    }
                    i60 = iM45029 ^ i2;
                    i62 = i98;
                    i59 = i;
                    i65 = i65;
                    i61 = i97;
                    iM1590 = iM1590;
                    break;
                case -832191202:
                case -331196420:
                    i65 = i65;
                    iM1590 = iM1590;
                    i62 = i62;
                    arrayList4 = arrayList4;
                    if ((c18447M50239.f58804 & 1) != 0) {
                        iM11307 = C19806.m45029("᩹ܽ") ^ i57;
                        i5 = ((iM11307 ^ i58) * 19709) ^ (-1486522895);
                        i6 = 1456830264;
                    } else {
                        iM11307 = C19806.m45029("۠۠") ^ i58;
                        i5 = ((iM11307 ^ i57) * (-19967)) ^ 2126338813;
                        i6 = 2110276306;
                    }
                    i60 = iM11307 ^ i6;
                    arrayList4 = arrayList4;
                    i59 = i5;
                    i65 = i65;
                    i62 = i62;
                    iM1590 = iM1590;
                    break;
                case -830205807:
                case -593610342:
                    i65 = i65;
                    iM1590 = iM1590;
                    i61 = i61;
                    i87 = i87;
                    str3 = str3;
                    i62 = i62;
                    i80 = i80;
                    AbstractC3384 abstractC33811 = abstractC33810;
                    enumC10298 = enumC102910;
                    i85 = i85;
                    c84815 = c84815;
                    int i99 = i85 + 1;
                    if (!viewOnClickListenerC0745.f3039.m41302(c84815, abstractC33811, c10113, i99)) {
                        abstractC3386 = abstractC33811;
                        i83 = i99;
                        i38 = i86;
                        abstractC33810 = abstractC3386;
                        i83 = i83;
                        z3 = z5;
                        i47 = i85;
                        z7 = z3;
                        c84817 = c84815;
                        i70 = i47;
                        c84816 = c84819;
                        z6 = z8;
                        int iM1130113 = (i57 - ThreadFactoryC3888.m11306("ۡܶ")) * 87;
                        i67 = i67;
                        i85 = i85;
                        i86 = i38;
                        i80 = i80;
                        c84815 = c84815;
                        i87 = i87;
                        str3 = str3;
                        enumC102910 = enumC10298;
                        i74 = i74;
                        i69 = i69;
                        c10113 = c10113;
                        i65 = i65;
                        i62 = i62;
                        iM1590 = iM1590;
                        listMo11508 = listMo11508;
                        i60 = iM1130113 ^ (-231646801);
                        i59 = ((iM1130113 ^ i58) * (-28183)) ^ 434960571;
                        i61 = i61;
                        viewOnClickListenerC0745 = viewOnClickListenerC0744;
                    } else {
                        int iM113022 = ThreadFactoryC3888.m11306("ۘۜ") ^ i57;
                        i44 = ((iM113022 ^ i58) * 11383) ^ 1404598788;
                        i85 = i85;
                        abstractC33810 = abstractC33811;
                        i83 = i99;
                        i80 = i80;
                        c84815 = c84815;
                        i87 = i87;
                        str3 = str3;
                        enumC102910 = enumC10298;
                        i65 = i65;
                        i61 = i61;
                        i62 = i62;
                        iM1590 = iM1590;
                        i60 = iM113022 ^ (-165225020);
                        i59 = i44;
                        viewOnClickListenerC0745 = viewOnClickListenerC0744;
                    }
                    break;
                case -797208769:
                case -120236067:
                    z20 = false;
                    int iM1130114 = ThreadFactoryC3888.m11306("ۤ֡") ^ i57;
                    i65 = i65;
                    i59 = ((iM1130114 ^ i58) * (-30179)) ^ 1454306758;
                    i60 = iM1130114 ^ (-494276901);
                    i65 = i65;
                    break;
                case -757339538:
                case 1556468116:
                    interfaceC4685 = (InterfaceC4685) abstractC3389;
                    interfaceC4686 = interfaceC4685;
                    iM450218 = (ThreadFactoryC3888.m11306("ᩴۧ") ^ i57) * 43;
                    i48 = ((iM450218 ^ i58) * 29507) ^ 59303966;
                    i49 = 1297542101;
                    i85 = i85;
                    enumC102910 = enumC102910;
                    i80 = i80;
                    c84815 = c84815;
                    i87 = i87;
                    str3 = str3;
                    i83 = i83;
                    i65 = i65;
                    i62 = i62;
                    iM1590 = iM1590;
                    i60 = iM450218 ^ i49;
                    i59 = i48;
                    i61 = i61;
                    break;
                case -749859607:
                case -475545216:
                    z15 = true;
                    iM113013 = (i57 - C19806.m45029("֡۬")) * 45;
                    i53 = ((iM113013 ^ i58) * 9139) ^ (-1352501911);
                    i54 = -1281063071;
                    i60 = iM113013 ^ i54;
                    arrayList4 = arrayList4;
                    i65 = i65;
                    c18447M50239 = c18447M50239;
                    iM1590 = iM1590;
                    i59 = i53;
                    i62 = i62;
                    break;
                case -736047202:
                case 388302056:
                    i65 = i65;
                    iM1590 = iM1590;
                    i62 = i62;
                    c18447M50239 = c18447M50239;
                    arrayList4 = arrayList4;
                    if (((C21269) C3286.m9796(arrayListM41301, i87)).f69258 != -1) {
                        iM450211 = (i58 - C19806.m45029("ۛ۬")) * 83;
                        i9 = ((iM450211 ^ i57) * (-32013)) ^ 652410625;
                        i10 = -408093232;
                    } else {
                        iM450211 = (ThreadFactoryC3888.m11306("ܿۜ") ^ i57) * 71;
                        i9 = ((iM450211 ^ i58) * 6381) ^ 332448779;
                        i10 = 415532369;
                    }
                    i60 = iM450211 ^ i10;
                    arrayList4 = arrayList4;
                    i59 = i9;
                    i65 = i65;
                    c18447M50239 = c18447M50239;
                    i62 = i62;
                    iM1590 = iM1590;
                    break;
                case -696130611:
                case 1568512642:
                    interfaceC4685 = null;
                    interfaceC4686 = interfaceC4685;
                    iM450218 = (ThreadFactoryC3888.m11306("ᩴۧ") ^ i57) * 43;
                    i48 = ((iM450218 ^ i58) * 29507) ^ 59303966;
                    i49 = 1297542101;
                    i85 = i85;
                    enumC102910 = enumC102910;
                    i80 = i80;
                    c84815 = c84815;
                    i87 = i87;
                    str3 = str3;
                    i83 = i83;
                    i65 = i65;
                    i62 = i62;
                    iM1590 = iM1590;
                    i60 = iM450218 ^ i49;
                    i59 = i48;
                    i61 = i61;
                    break;
                case -690586587:
                case -423369553:
                    z2 = c18447M50239.f58807;
                    z11 = z2;
                    iM11306 = (ThreadFactoryC3888.m11306("֨ܺ") ^ i57) * 69;
                    i3 = ((iM11306 ^ i58) * (-20191)) ^ (-953090567);
                    i4 = 342156030;
                    i60 = iM11306 ^ i4;
                    i59 = i3;
                    i65 = i65;
                    i61 = i61;
                    i62 = i62;
                    iM1590 = iM1590;
                    break;
                case -678623646:
                case -433430447:
                    int i100 = iM1590;
                    i61 = i61;
                    int i101 = i87;
                    String str6 = str3;
                    int i102 = i62;
                    ArrayList arrayList8 = arrayList5;
                    C8485 c84822 = c84813;
                    InterfaceC7945 interfaceC79411 = interfaceC7945Mo25747;
                    int i103 = i69;
                    List list4 = listMo11508;
                    int i104 = i74;
                    int i105 = i80;
                    AbstractC3384 abstractC33812 = abstractC33810;
                    EnumC10297 enumC102912 = enumC102910;
                    int i106 = i83;
                    int i107 = i85;
                    C8485 c84823 = c84815;
                    C10111 c10114 = c10113;
                    int i108 = i86;
                    if (z) {
                        iM450213 = ThreadFactoryC3888.m11306("᩹ܳ") ^ i58;
                        i18 = ((iM450213 ^ i57) * (-25175)) ^ 713490276;
                        i19 = 594883748;
                    } else {
                        iM450213 = (i57 - C19806.m45029("ۢۢ")) * (-69);
                        i18 = ((iM450213 ^ i58) * (-27643)) ^ (-1849495622);
                        i19 = 1492427321;
                    }
                    int i109 = iM450213 ^ i19;
                    viewOnClickListenerC0745 = viewOnClickListenerC0744;
                    arrayList5 = arrayList8;
                    i86 = i108;
                    i80 = i105;
                    c84815 = c84823;
                    i87 = i101;
                    str3 = str6;
                    i83 = i106;
                    enumC102910 = enumC102912;
                    i74 = i104;
                    i85 = i107;
                    interfaceC7945Mo25747 = interfaceC79411;
                    c84813 = c84822;
                    abstractC33810 = abstractC33812;
                    c10113 = c10114;
                    i65 = i65;
                    i62 = i102;
                    iM1590 = i100;
                    i66 = 1;
                    i60 = i109;
                    i59 = i18;
                    i69 = i103;
                    listMo11508 = list4;
                    i61 = i61;
                    break;
                case -652130089:
                case 1484907981:
                    i65 = i65;
                    iM1590 = iM1590;
                    i61 = i61;
                    i87 = i87;
                    i62 = i62;
                    i85 = i85;
                    c84815 = c84815;
                    StringBuilder sbM8979 = C3012.m8976(str3, strM11312);
                    C0817.m3408(sbM8979, ViewGroupOnHierarchyChangeListenerC1916.m6238(atomicInteger3));
                    str3 = str3;
                    C17166 c17166 = new C17166(0, c84815.m22164(C2124.m6674(sbM8979)), null, null);
                    int i110 = i83;
                    c10113.m25732(i110, c17166);
                    c10113.m25732(i110, new C19989(atomicInteger3.getAndIncrement()));
                    i83 = i110;
                    i80 = i80;
                    enumC102910 = enumC102910;
                    i73 = i83;
                    iM450218 = (C19806.m45029("᩺۟") ^ i58) * 97;
                    i48 = ((iM450218 ^ i57) * 24585) ^ (-1241088742);
                    i49 = -1330015952;
                    i85 = i85;
                    enumC102910 = enumC102910;
                    i80 = i80;
                    c84815 = c84815;
                    i87 = i87;
                    str3 = str3;
                    i83 = i83;
                    i65 = i65;
                    i62 = i62;
                    iM1590 = iM1590;
                    i60 = iM450218 ^ i49;
                    i59 = i48;
                    i61 = i61;
                    break;
                case -646649540:
                case 966006573:
                    z17 = false;
                    iM450211 = (C19806.m45029("ۨۘ") ^ i57) * 25;
                    i9 = ((iM450211 ^ i58) * 14549) ^ 749586759;
                    i10 = -1826289801;
                    i60 = iM450211 ^ i10;
                    arrayList4 = arrayList4;
                    i59 = i9;
                    i65 = i65;
                    c18447M50239 = c18447M50239;
                    i62 = i62;
                    iM1590 = iM1590;
                    break;
                case -618237058:
                case -75363108:
                    i65 = i65;
                    iM1590 = iM1590;
                    i61 = i61;
                    i87 = i87;
                    str3 = str3;
                    i62 = i62;
                    i80 = i80;
                    EnumC10297 enumC102913 = enumC102910;
                    i83 = i83;
                    i85 = i85;
                    c84815 = c84815;
                    AbstractC3384 abstractC33813 = abstractC33810;
                    if (!viewOnClickListenerC0745.f3039.m41304(c84815, abstractC33813, c10113, i85)) {
                        enumC10298 = enumC102913;
                        abstractC3386 = abstractC33813;
                        i38 = i86;
                        abstractC33810 = abstractC3386;
                        i83 = i83;
                        z3 = z5;
                        i47 = i85;
                        z7 = z3;
                        c84817 = c84815;
                        i70 = i47;
                        c84816 = c84819;
                        z6 = z8;
                        int iM1130115 = (i57 - ThreadFactoryC3888.m11306("ۡܶ")) * 87;
                        i67 = i67;
                        i85 = i85;
                        i86 = i38;
                        i80 = i80;
                        c84815 = c84815;
                        i87 = i87;
                        str3 = str3;
                        enumC102910 = enumC10298;
                        i74 = i74;
                        i69 = i69;
                        c10113 = c10113;
                        i65 = i65;
                        i62 = i62;
                        iM1590 = iM1590;
                        listMo11508 = listMo11508;
                        i60 = iM1130115 ^ (-231646801);
                        i59 = ((iM1130115 ^ i58) * (-28183)) ^ 434960571;
                        i61 = i61;
                        viewOnClickListenerC0745 = viewOnClickListenerC0744;
                    } else {
                        int iM113023 = ThreadFactoryC3888.m11306("ۤ᩷") ^ i57;
                        i42 = ((iM113023 ^ i58) * 951) ^ (-1601904266);
                        i46 = iM113023 ^ (-192320537);
                        i85 = i85;
                        abstractC33810 = abstractC33813;
                        i80 = i80;
                        c84815 = c84815;
                        str3 = str3;
                        i83 = i83;
                        enumC102910 = enumC102913;
                        i61 = i61;
                        i62 = i62;
                        iM1590 = iM1590;
                        i60 = i46;
                        i59 = i42;
                        i87 = i87;
                        i65 = i65;
                    }
                    break;
                case -607226774:
                case -194025762:
                    i65 = i65;
                    iM1590 = iM1590;
                    i61 = i61;
                    i62 = i62;
                    c2 = 2;
                    if (z10) {
                        iM11306 = (i57 - ThreadFactoryC3888.m11306("ۙ᩻")) * 109;
                        i3 = ((iM11306 ^ i58) * 1365) ^ (-446864932);
                        i4 = 80055484;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܶ۬") ^ i58;
                        i3 = ((iM11306 ^ i57) * 28433) ^ 34633401;
                        i4 = -746205113;
                    }
                    i60 = iM11306 ^ i4;
                    i59 = i3;
                    i65 = i65;
                    i61 = i61;
                    i62 = i62;
                    iM1590 = iM1590;
                    break;
                case -573617564:
                case 1493795070:
                    z10 = true;
                    iM11306 = (ThreadFactoryC3888.m11306("᩹ۛ") ^ i58) * 79;
                    i3 = ((iM11306 ^ i57) * (-4325)) ^ (-1895631288);
                    i4 = -491591563;
                    i60 = iM11306 ^ i4;
                    i59 = i3;
                    i65 = i65;
                    i61 = i61;
                    i62 = i62;
                    iM1590 = iM1590;
                    break;
                case -548752633:
                case 1599979890:
                    z18 = true;
                    iM450212 = C19806.m45029("֨᩻") ^ i58;
                    i12 = ((iM450212 ^ i57) * 14657) ^ (-414646647);
                    i13 = -1580317513;
                    i60 = iM450212 ^ i13;
                    i59 = i12;
                    i65 = i65;
                    c18447M50239 = c18447M50239;
                    i62 = i62;
                    iM1590 = iM1590;
                    break;
                case -543916073:
                case -107572942:
                    z18 = false;
                    iM450212 = C19806.m45029("֨᩻") ^ i58;
                    i12 = ((iM450212 ^ i57) * 14657) ^ (-414646647);
                    i13 = -1580317513;
                    i60 = iM450212 ^ i13;
                    i59 = i12;
                    i65 = i65;
                    c18447M50239 = c18447M50239;
                    i62 = i62;
                    iM1590 = iM1590;
                    break;
                case -532279994:
                case 1284589657:
                    i65 = i65;
                    iM1590 = iM1590;
                    i61 = i61;
                    i87 = i87;
                    str3 = str3;
                    i62 = i62;
                    int i111 = i68;
                    i69 = i69;
                    listMo11508 = listMo11508;
                    i74 = i74;
                    i80 = i80;
                    abstractC3388 = abstractC33810;
                    enumC10298 = enumC102910;
                    i83 = i83;
                    i85 = i85;
                    c84815 = c84815;
                    if (i80 == i111) {
                        i68 = i111;
                        abstractC3387 = abstractC3388;
                        i80 = i80;
                        i39 = i86;
                        int iM450229 = (C19806.m45029("᩷۠") ^ i57) * (-65);
                        i85 = i85;
                        i67 = i67;
                        i86 = i39;
                        c84815 = c84815;
                        str3 = str3;
                        i83 = i83;
                        enumC102910 = enumC10298;
                        i74 = i74;
                        abstractC33810 = abstractC3387;
                        c10113 = c10113;
                        i61 = i61;
                        i62 = i62;
                        iM1590 = iM1590;
                        listMo11508 = listMo11508;
                        i60 = iM450229 ^ 468483778;
                        i59 = ((iM450229 ^ i58) * (-17995)) ^ 548811780;
                        i87 = i87;
                        i69 = i69;
                        i65 = i65;
                        viewOnClickListenerC0745 = viewOnClickListenerC0744;
                    } else {
                        iM113011 = (i57 - ThreadFactoryC3888.m11306("ۧ۟")) * (-45);
                        i68 = i111;
                        i59 = ((iM113011 ^ i58) * 18529) ^ 1820701113;
                        i41 = -2124884198;
                        listMo11508 = listMo11508;
                        i85 = i85;
                        abstractC33810 = abstractC3388;
                        i80 = i80;
                        c84815 = c84815;
                        str3 = str3;
                        i83 = i83;
                        enumC102910 = enumC10298;
                        i74 = i74;
                        i69 = i69;
                        i61 = i61;
                        i62 = i62;
                        iM1590 = iM1590;
                        viewOnClickListenerC0745 = viewOnClickListenerC0744;
                        i60 = iM113011 ^ i41;
                        i87 = i87;
                        i65 = i65;
                    }
                    break;
                case -515092407:
                case 303952396:
                    arrayList4 = arrayList4;
                    itM10563 = C3577.m10563(arrayList4);
                    i61 = i63;
                    iM450211 = (i57 - C19806.m45029("֡ۢ")) * (-51);
                    i9 = ((iM450211 ^ i58) * (-7855)) ^ 1603609681;
                    i10 = -806400365;
                    i60 = iM450211 ^ i10;
                    arrayList4 = arrayList4;
                    i59 = i9;
                    i65 = i65;
                    c18447M50239 = c18447M50239;
                    i62 = i62;
                    iM1590 = iM1590;
                    break;
                case -510416469:
                case -78077043:
                    i65 = i65;
                    iM1590 = iM1590;
                    i61 = i61;
                    i62 = i62;
                    if (interfaceC4686 != null) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܳᩴ") + i57) * (-61);
                        i3 = ((iM11306 ^ i58) * 10719) ^ (-1861080628);
                        i4 = -2123309007;
                    } else {
                        i72 = i63;
                        z9 = z12;
                        iM11306 = (C19806.m45029("ܿۤ") ^ i57) * (-19);
                        i3 = ((iM11306 ^ i58) * 22783) ^ (-175670697);
                        i4 = 827472;
                    }
                    i60 = iM11306 ^ i4;
                    i59 = i3;
                    i65 = i65;
                    i61 = i61;
                    i62 = i62;
                    iM1590 = iM1590;
                    break;
                case -486094145:
                case -65372807:
                    i65 = i65;
                    iM1590 = iM1590;
                    i62 = i62;
                    StringBuilder sbM89710 = C3012.m8976(str3, strM11312);
                    C0817.m3408(sbM89710, ViewGroupOnHierarchyChangeListenerC1916.m6238(atomicInteger3));
                    i61 = i61;
                    c10113.m25732(i63, new C17166(0, c8485.m22164(C2124.m6674(sbM89710)), null, null));
                    c10113.m25732(i63, new C19989(atomicInteger3.getAndIncrement()));
                    iM11306 = ThreadFactoryC3888.m11306("֡ܽ") ^ i58;
                    i3 = ((iM11306 ^ i57) * (-10251)) ^ 1754602402;
                    i4 = -1134654745;
                    i60 = iM11306 ^ i4;
                    i59 = i3;
                    i65 = i65;
                    i61 = i61;
                    i62 = i62;
                    iM1590 = iM1590;
                    break;
                case -475377205:
                case 295488699:
                    i86 = 61110;
                    int iM113024 = ThreadFactoryC3888.m11306("᩷ۡ") ^ i58;
                    i15 = ((iM113024 ^ i57) * 26147) ^ (-1791422604);
                    i17 = iM113024 ^ (-71048573);
                    arrayList5 = arrayList5;
                    i80 = i80;
                    c84815 = c84815;
                    i87 = i87;
                    str3 = str3;
                    i83 = i83;
                    enumC102910 = enumC102910;
                    i74 = i74;
                    i85 = i85;
                    interfaceC7945Mo25747 = interfaceC7945Mo25747;
                    c84813 = c84813;
                    abstractC33810 = abstractC33810;
                    c10113 = c10113;
                    i65 = i65;
                    i62 = i62;
                    iM1590 = iM1590;
                    i60 = i17;
                    i66 = i66;
                    i59 = i15;
                    i69 = i69;
                    listMo11508 = listMo11508;
                    i61 = i61;
                    viewOnClickListenerC0745 = viewOnClickListenerC0744;
                    break;
                case -452538530:
                case 492521088:
                    i79 = 1;
                    iM113013 = (i57 - ThreadFactoryC3888.m11306("ܰ۟")) * (-121);
                    i53 = ((iM113013 ^ i58) * 29039) ^ 1805488031;
                    i54 = 1071638570;
                    i60 = iM113013 ^ i54;
                    arrayList4 = arrayList4;
                    i65 = i65;
                    c18447M50239 = c18447M50239;
                    iM1590 = iM1590;
                    i59 = i53;
                    i62 = i62;
                    break;
                case -448031696:
                case 1623170485:
                    z13 = false;
                    iM113013 = (ThreadFactoryC3888.m11306("ۧᩳ") + i58) * (-19);
                    i53 = ((iM113013 ^ i57) * 10987) ^ (-1934068987);
                    i54 = -1521592412;
                    i60 = iM113013 ^ i54;
                    arrayList4 = arrayList4;
                    i65 = i65;
                    c18447M50239 = c18447M50239;
                    iM1590 = iM1590;
                    i59 = i53;
                    i62 = i62;
                    break;
                case -424158546:
                case 1617341196:
                    arrayList5 = new ArrayList();
                    arrayList6 = new ArrayList();
                    strMo20493 = c7807.mo20493();
                    itM4898 = C1398.m4898(c7807.getFields());
                    iM11309 = ThreadFactoryC3888.m11306("᩸ۢ") ^ i57;
                    i20 = ((iM11309 ^ i58) * 19937) ^ (-1594875790);
                    i21 = -233167086;
                    i86 = i86;
                    str3 = str3;
                    i85 = i85;
                    c84813 = c84813;
                    i60 = iM11309 ^ i21;
                    i66 = i66;
                    i59 = i20;
                    listMo11508 = listMo11508;
                    iM1590 = iM1590;
                    viewOnClickListenerC0745 = viewOnClickListenerC0744;
                    break;
                case -324708522:
                case 763724130:
                    i65 = i65;
                    iM1590 = iM1590;
                    i61 = i61;
                    i87 = i87;
                    str3 = str3;
                    i62 = i62;
                    i80 = i80;
                    enumC102910 = enumC102910;
                    i83 = i83;
                    i85 = i85;
                    c84815 = c84815;
                    if (enumC102910 == EnumC10297.f35189) {
                        enumC102910 = enumC102910;
                        abstractC3388 = abstractC33810;
                        int iM1130116 = (i57 - ThreadFactoryC3888.m11306("ܺܺ")) * 61;
                        i42 = ((iM1130116 ^ i58) * 27085) ^ (-1035290738);
                        i46 = iM1130116 ^ 183292749;
                        listMo11508 = listMo11508;
                        i85 = i85;
                        abstractC33810 = abstractC3388;
                        i80 = i80;
                        c84815 = c84815;
                        str3 = str3;
                        i83 = i83;
                        i74 = i74;
                        i61 = i61;
                        i62 = i62;
                        iM1590 = iM1590;
                        viewOnClickListenerC0745 = viewOnClickListenerC0744;
                        i60 = i46;
                        i59 = i42;
                        i87 = i87;
                        i65 = i65;
                    } else {
                        iM450218 = (ThreadFactoryC3888.m11306("֡ۜ") ^ i58) * 55;
                        i48 = ((iM450218 ^ i57) * 15669) ^ 575955107;
                        i49 = -1607300011;
                        i85 = i85;
                        enumC102910 = enumC102910;
                        i80 = i80;
                        c84815 = c84815;
                        i87 = i87;
                        str3 = str3;
                        i83 = i83;
                        i65 = i65;
                        i62 = i62;
                        iM1590 = iM1590;
                        i60 = iM450218 ^ i49;
                        i59 = i48;
                        i61 = i61;
                    }
                    break;
                case -312632833:
                case 1786973877:
                    z16 = false;
                    iM113013 = (i57 - C19806.m45029("ᩳۚ")) * (-9);
                    i53 = ((iM113013 ^ i58) * 22221) ^ (-646390525);
                    i54 = -613763201;
                    i60 = iM113013 ^ i54;
                    arrayList4 = arrayList4;
                    i65 = i65;
                    c18447M50239 = c18447M50239;
                    iM1590 = iM1590;
                    i59 = i53;
                    i62 = i62;
                    break;
                case -275934603:
                case 697788085:
                    i65 = i65;
                    iM1590 = iM1590;
                    i62 = i62;
                    c18447M50239 = c18447M50239;
                    if (C0962.m3748(itM10563)) {
                        iM450212 = (C19806.m45029("ܰ᩻") + i57) * 75;
                        i12 = ((iM450212 ^ i58) * 15685) ^ 1830887333;
                        i13 = -1789039004;
                    } else {
                        iM450212 = ThreadFactoryC3888.m11306("᩵ۛ") ^ i58;
                        i12 = ((iM450212 ^ i57) * 3945) ^ (-2077602583);
                        i13 = -1023885626;
                    }
                    i60 = iM450212 ^ i13;
                    i59 = i12;
                    i65 = i65;
                    c18447M50239 = c18447M50239;
                    i62 = i62;
                    iM1590 = iM1590;
                    break;
                case -260265481:
                case 1336626861:
                    i50 = iM1590;
                    i52 = i62 + 1;
                    i63 = i77;
                    z12 = z14;
                    i51 = i85;
                    c84811 = c84815;
                    r80 = 1;
                    c84812 = c8485;
                    int iM4502210 = (C19806.m45029("ܳ᩸") ^ i57) * (-65);
                    C8485 c84824 = c84812;
                    i59 = ((iM4502210 ^ i58) * 7961) ^ 1918575491;
                    i85 = i51;
                    i83 = i83;
                    enumC102910 = enumC102910;
                    c84815 = c84811;
                    i62 = i52;
                    i87 = i87;
                    c84820 = c84824;
                    i65 = i65;
                    i61 = i61;
                    iM1590 = i50;
                    i60 = iM4502210 ^ 1800035080;
                    str3 = str3;
                    break;
                case -176908132:
                case -159701186:
                    i65 = i65;
                    iM1590 = iM1590;
                    i62 = i62;
                    c18447M50239 = c18447M50239;
                    arrayList4 = arrayList4;
                    if (i87 < iM1590) {
                        iM113013 = ThreadFactoryC3888.m11306("ۗܽ") ^ i58;
                        i53 = ((iM113013 ^ i57) * (-20727)) ^ 2013557406;
                        i54 = 1143352300;
                    } else {
                        iM113013 = C19806.m45029("۟ۖ") ^ i57;
                        i53 = ((iM113013 ^ i58) * 22521) ^ (-1188698359);
                        i54 = 110044246;
                    }
                    i60 = iM113013 ^ i54;
                    arrayList4 = arrayList4;
                    i65 = i65;
                    c18447M50239 = c18447M50239;
                    iM1590 = iM1590;
                    i59 = i53;
                    i62 = i62;
                    break;
                case -150574274:
                case -34603238:
                    i86 = 11874;
                    int iM113025 = ThreadFactoryC3888.m11306("᩷ۡ") ^ i58;
                    i15 = ((iM113025 ^ i57) * 26147) ^ (-1791422604);
                    i17 = iM113025 ^ (-71048573);
                    arrayList5 = arrayList5;
                    i80 = i80;
                    c84815 = c84815;
                    i87 = i87;
                    str3 = str3;
                    i83 = i83;
                    enumC102910 = enumC102910;
                    i74 = i74;
                    i85 = i85;
                    interfaceC7945Mo25747 = interfaceC7945Mo25747;
                    c84813 = c84813;
                    abstractC33810 = abstractC33810;
                    c10113 = c10113;
                    i65 = i65;
                    i62 = i62;
                    iM1590 = iM1590;
                    i60 = i17;
                    i66 = i66;
                    i59 = i15;
                    i69 = i69;
                    listMo11508 = listMo11508;
                    i61 = i61;
                    viewOnClickListenerC0745 = viewOnClickListenerC0744;
                    break;
                case -130347173:
                case 1725487977:
                    i85 = i70 + 1;
                    enumC10299 = enumC102910;
                    c10112 = c10113;
                    interfaceC7948 = interfaceC7945M22153;
                    z8 = z6;
                    c84819 = c84816;
                    c84815 = c84817;
                    z5 = z7;
                    c3 = 5;
                    int iM4502211 = (i57 - C19806.m45029("ۗ᩺")) * 47;
                    interfaceC7945M22153 = interfaceC7948;
                    arrayList6 = arrayList6;
                    i86 = i86;
                    i80 = i80;
                    i87 = i87;
                    str3 = str3;
                    i83 = i83;
                    enumC102910 = enumC10299;
                    i74 = i74;
                    abstractC33810 = abstractC33810;
                    i65 = i65;
                    i61 = i61;
                    i62 = i62;
                    iM1590 = iM1590;
                    i60 = iM4502211 ^ (-2056832935);
                    c10113 = c10112;
                    i59 = ((iM4502211 ^ i58) * (-4625)) ^ 876162483;
                    i69 = i69;
                    viewOnClickListenerC0745 = viewOnClickListenerC0744;
                    break;
                case -72877981:
                case 914630084:
                    InterfaceC17822 interfaceC17822 = (InterfaceC17822) C0216.m1584(itM4898);
                    C2249.m6905(arrayList5, c8485.m22157(interfaceC17822.mo1183(), interfaceC17822.getName(), interfaceC17822.getType(), interfaceC17822.mo28400(), interfaceC17822.mo28399(), interfaceC17822.getAnnotations(), interfaceC17822.mo28398()));
                    iM11309 = ThreadFactoryC3888.m11306("᩸ۢ") ^ i57;
                    i20 = ((iM11309 ^ i58) * 19937) ^ (-1594875790);
                    i21 = -233167086;
                    i86 = i86;
                    str3 = str3;
                    i85 = i85;
                    c84813 = c84813;
                    i60 = iM11309 ^ i21;
                    i66 = i66;
                    i59 = i20;
                    listMo11508 = listMo11508;
                    iM1590 = iM1590;
                    viewOnClickListenerC0745 = viewOnClickListenerC0744;
                    break;
                case 52913273:
                case 1507607138:
                    i65 = i65;
                    iM1590 = iM1590;
                    i61 = i61;
                    i87 = i87;
                    str3 = str3;
                    i62 = i62;
                    InterfaceC7945 interfaceC79412 = interfaceC7949;
                    i69 = i69;
                    listMo11508 = listMo11508;
                    i74 = i74;
                    i80 = i80;
                    abstractC3388 = abstractC33810;
                    enumC10298 = enumC102910;
                    i83 = i83;
                    i85 = i85;
                    c84815 = c84815;
                    if (!(interfaceC79412 instanceof C10111)) {
                        interfaceC7949 = interfaceC79412;
                        list2 = listMo11508;
                        abstractC3384 = abstractC3388;
                        c10111 = c10113;
                        c8489 = c84815;
                        c8487 = c84813;
                        c84810 = c84819;
                        arrayList2 = arrayList6;
                        interfaceC7946 = interfaceC7949;
                        i32 = i86;
                        interfaceC79410 = interfaceC7946;
                        c84818 = c8489;
                        str4 = str5;
                        c84814 = c84810;
                        z4 = z21;
                        iM113010 = (C19806.m45029("ۗۧ") + i57) * (-111);
                        i59 = ((iM113010 ^ i58) * (-23055)) ^ 262711197;
                        i33 = 72613181;
                        i31 = iM113010 ^ i33;
                        i85 = i85;
                        arrayList6 = arrayList2;
                        i86 = i32;
                        i80 = i80;
                        c84815 = c84815;
                        i87 = i87;
                        str3 = str3;
                        i83 = i83;
                        enumC102910 = enumC10298;
                        i74 = i74;
                        c84813 = c8487;
                        abstractC33810 = abstractC3384;
                        c10113 = c10111;
                        i65 = i65;
                        i61 = i61;
                        i62 = i62;
                        iM1590 = iM1590;
                        i60 = i31;
                        i69 = i69;
                        listMo11508 = list2;
                        viewOnClickListenerC0745 = viewOnClickListenerC0744;
                    } else {
                        iM113011 = (ThreadFactoryC3888.m11306("۫ۜ") ^ i58) * 35;
                        interfaceC7949 = interfaceC79412;
                        i59 = ((iM113011 ^ i57) * (-6241)) ^ 2040101036;
                        i41 = 212152569;
                        listMo11508 = listMo11508;
                        i85 = i85;
                        abstractC33810 = abstractC3388;
                        i80 = i80;
                        c84815 = c84815;
                        str3 = str3;
                        i83 = i83;
                        enumC102910 = enumC10298;
                        i74 = i74;
                        i69 = i69;
                        i61 = i61;
                        i62 = i62;
                        iM1590 = iM1590;
                        viewOnClickListenerC0745 = viewOnClickListenerC0744;
                        i60 = iM113011 ^ i41;
                        i87 = i87;
                        i65 = i65;
                    }
                    break;
                case 54248949:
                case 77134610:
                    i79 = 2;
                    iM113013 = (i57 - ThreadFactoryC3888.m11306("ܰ۟")) * (-121);
                    i53 = ((iM113013 ^ i58) * 29039) ^ 1805488031;
                    i54 = 1071638570;
                    i60 = iM113013 ^ i54;
                    arrayList4 = arrayList4;
                    i65 = i65;
                    c18447M50239 = c18447M50239;
                    iM1590 = iM1590;
                    i59 = i53;
                    i62 = i62;
                    break;
                case 60654837:
                case 1042899480:
                    z16 = true;
                    iM113013 = (i57 - C19806.m45029("ᩳۚ")) * (-9);
                    i53 = ((iM113013 ^ i58) * 22221) ^ (-646390525);
                    i54 = -613763201;
                    i60 = iM113013 ^ i54;
                    arrayList4 = arrayList4;
                    i65 = i65;
                    c18447M50239 = c18447M50239;
                    iM1590 = iM1590;
                    i59 = i53;
                    i62 = i62;
                    break;
                case 75880686:
                case 1968615667:
                    boolean[] zArr3 = new boolean[6];
                    zArr3[0] = z13;
                    zArr3[r80] = false;
                    zArr3[c2] = false;
                    zArr3[c] = false;
                    zArr3[c4] = false;
                    zArr3[c3] = false;
                    zArr = zArr3;
                    iM113013 = (C19806.m45029("ۜ۟") + i58) * 99;
                    i53 = ((iM113013 ^ i57) * (-12185)) ^ 1329537488;
                    i54 = 419768534;
                    i60 = iM113013 ^ i54;
                    arrayList4 = arrayList4;
                    i65 = i65;
                    c18447M50239 = c18447M50239;
                    iM1590 = iM1590;
                    i59 = i53;
                    i62 = i62;
                    break;
                case 154562755:
                case 334879518:
                    z13 = true;
                    iM113013 = (ThreadFactoryC3888.m11306("ۧᩳ") + i58) * (-19);
                    i53 = ((iM113013 ^ i57) * 10987) ^ (-1934068987);
                    i54 = -1521592412;
                    i60 = iM113013 ^ i54;
                    arrayList4 = arrayList4;
                    i65 = i65;
                    c18447M50239 = c18447M50239;
                    iM1590 = iM1590;
                    i59 = i53;
                    i62 = i62;
                    break;
                case 197546395:
                case 1462432404:
                    i65 = i65;
                    iM1590 = iM1590;
                    i61 = i61;
                    i87 = i87;
                    str3 = str3;
                    i62 = i62;
                    listMo11508 = listMo11508;
                    i74 = i74;
                    i80 = i80;
                    abstractC3388 = abstractC33810;
                    enumC10298 = enumC102910;
                    i83 = i83;
                    i85 = i85;
                    c84815 = c84815;
                    if (!z21) {
                        i69 = i69;
                        list2 = listMo11508;
                        abstractC3384 = abstractC3388;
                        c10111 = c10113;
                        c8489 = c84815;
                        c8487 = c84813;
                        c84810 = c84819;
                        arrayList2 = arrayList6;
                        interfaceC7946 = interfaceC7949;
                        i32 = i86;
                        interfaceC79410 = interfaceC7946;
                        c84818 = c8489;
                        str4 = str5;
                        c84814 = c84810;
                        z4 = z21;
                        iM113010 = (C19806.m45029("ۗۧ") + i57) * (-111);
                        i59 = ((iM113010 ^ i58) * (-23055)) ^ 262711197;
                        i33 = 72613181;
                        i31 = iM113010 ^ i33;
                        i85 = i85;
                        arrayList6 = arrayList2;
                        i86 = i32;
                        i80 = i80;
                        c84815 = c84815;
                        i87 = i87;
                        str3 = str3;
                        i83 = i83;
                        enumC102910 = enumC10298;
                        i74 = i74;
                        c84813 = c8487;
                        abstractC33810 = abstractC3384;
                        c10113 = c10111;
                        i65 = i65;
                        i61 = i61;
                        i62 = i62;
                        iM1590 = iM1590;
                        i60 = i31;
                        i69 = i69;
                        listMo11508 = list2;
                        viewOnClickListenerC0745 = viewOnClickListenerC0744;
                    } else {
                        iM113012 = ThreadFactoryC3888.m11306("ۤ۠") ^ i58;
                        i42 = ((iM113012 ^ i57) * 6615) ^ (-2129728059);
                        i45 = -930950885;
                        i46 = iM113012 ^ i45;
                        listMo11508 = listMo11508;
                        i85 = i85;
                        abstractC33810 = abstractC3388;
                        i80 = i80;
                        c84815 = c84815;
                        str3 = str3;
                        i83 = i83;
                        enumC102910 = enumC10298;
                        i74 = i74;
                        i61 = i61;
                        i62 = i62;
                        iM1590 = iM1590;
                        viewOnClickListenerC0745 = viewOnClickListenerC0744;
                        i60 = i46;
                        i59 = i42;
                        i87 = i87;
                        i65 = i65;
                    }
                    break;
                case 327721562:
                case 2051968627:
                    i65 = i65;
                    iM1590 = iM1590;
                    i61 = i61;
                    i25 = i87;
                    str2 = str3;
                    i62 = i62;
                    i69 = i69;
                    list3 = listMo11508;
                    i26 = i74;
                    i27 = i80;
                    abstractC3384 = abstractC33810;
                    enumC10297 = enumC102910;
                    i28 = i83;
                    i34 = i85;
                    c8488 = c84815;
                    c10111 = c10113;
                    i29 = i86;
                    if (!RunnableC1564.m5348(itM10418)) {
                        list2 = list3;
                        c8487 = c84813;
                        interfaceC7947 = interfaceC7945Mo25747;
                        arrayList3 = arrayList6;
                        int iM450230 = C19806.m45029("۟ۗ") ^ i58;
                        interfaceC7945 = interfaceC7947;
                        i59 = ((iM450230 ^ i57) * (-12899)) ^ 2126019322;
                        i31 = iM450230 ^ 1099883360;
                        i85 = i34;
                        arrayList6 = arrayList3;
                        i86 = i29;
                        i80 = i27;
                        c84815 = c8488;
                        i87 = i25;
                        str3 = str2;
                        i83 = i28;
                        enumC102910 = enumC10297;
                        i74 = i26;
                        interfaceC7945Mo25747 = interfaceC7945;
                        c84813 = c8487;
                        abstractC33810 = abstractC3384;
                        c10113 = c10111;
                        i65 = i65;
                        i61 = i61;
                        i62 = i62;
                        iM1590 = iM1590;
                        i60 = i31;
                        i69 = i69;
                        listMo11508 = list2;
                        viewOnClickListenerC0745 = viewOnClickListenerC0744;
                    } else {
                        iM450215 = (C19806.m45029("᩺۫") ^ i58) * (-75);
                        i35 = ((iM450215 ^ i57) * (-26943)) ^ 884379328;
                        i36 = -240529716;
                        i37 = iM450215 ^ i36;
                        i85 = i34;
                        i86 = i29;
                        i80 = i27;
                        c84815 = c8488;
                        i87 = i25;
                        str3 = str2;
                        i83 = i28;
                        enumC102910 = enumC10297;
                        i74 = i26;
                        abstractC33810 = abstractC3384;
                        c10113 = c10111;
                        i65 = i65;
                        i62 = i62;
                        iM1590 = iM1590;
                        listMo11508 = list3;
                        i60 = i37;
                        i59 = i35;
                        i69 = i69;
                        i61 = i61;
                        viewOnClickListenerC0745 = viewOnClickListenerC0744;
                    }
                    break;
                case 742299696:
                case 1181048156:
                    i65 = i65;
                    iM1590 = iM1590;
                    i61 = i61;
                    i87 = i87;
                    str3 = str3;
                    i62 = i62;
                    i85 = i85;
                    c84815 = c84815;
                    i80 = i80;
                    i83 = i83;
                    enumC10298 = enumC102910;
                    if (i80 == 10) {
                        i80 = i80;
                        i69 = i69;
                        listMo11508 = listMo11508;
                        i74 = i74;
                        abstractC3387 = abstractC33810;
                        i39 = i86;
                        int iM4502212 = (C19806.m45029("᩷۠") ^ i57) * (-65);
                        i85 = i85;
                        i67 = i67;
                        i86 = i39;
                        c84815 = c84815;
                        str3 = str3;
                        i83 = i83;
                        enumC102910 = enumC10298;
                        i74 = i74;
                        abstractC33810 = abstractC3387;
                        c10113 = c10113;
                        i61 = i61;
                        i62 = i62;
                        iM1590 = iM1590;
                        listMo11508 = listMo11508;
                        i60 = iM4502212 ^ 468483778;
                        i59 = ((iM4502212 ^ i58) * (-17995)) ^ 548811780;
                        i87 = i87;
                        i69 = i69;
                        i65 = i65;
                        viewOnClickListenerC0745 = viewOnClickListenerC0744;
                    } else {
                        iM450217 = C19806.m45029("ᩳ᩵") ^ i57;
                        i42 = ((iM450217 ^ i58) * (-16595)) ^ 1816570199;
                        i43 = -114899889;
                        i46 = iM450217 ^ i43;
                        listMo11508 = listMo11508;
                        i85 = i85;
                        abstractC33810 = abstractC33810;
                        i80 = i80;
                        c84815 = c84815;
                        str3 = str3;
                        i83 = i83;
                        enumC102910 = enumC10298;
                        i74 = i74;
                        i69 = i69;
                        i61 = i61;
                        i62 = i62;
                        iM1590 = iM1590;
                        viewOnClickListenerC0745 = viewOnClickListenerC0744;
                        i60 = i46;
                        i59 = i42;
                        i87 = i87;
                        i65 = i65;
                    }
                    break;
                case 764586011:
                case 1424252138:
                    i65 = i65;
                    if ((i76 & 32) != 0) {
                        iM450219 = ThreadFactoryC3888.m11306("۟ۜ") ^ i58;
                        i55 = ((iM450219 ^ i57) * 28999) ^ 1207103373;
                        i56 = 1478667358;
                    } else {
                        iM450219 = C19806.m45029("ۧ᩷") ^ i58;
                        i55 = ((iM450219 ^ i57) * 8207) ^ (-932644454);
                        i56 = -854819800;
                    }
                    i60 = iM450219 ^ i56;
                    i59 = i55;
                    i65 = i65;
                    break;
                case 1269785836:
                case 1883212508:
                    i66 = i66;
                    atomicInteger2 = null;
                    atomicInteger3 = atomicInteger2;
                    iM11309 = C19806.m45029("ۖۘ") ^ i58;
                    i20 = ((iM11309 ^ i57) * (-4411)) ^ (-1425218644);
                    i21 = 1832485427;
                    i86 = i86;
                    str3 = str3;
                    i85 = i85;
                    c84813 = c84813;
                    i60 = iM11309 ^ i21;
                    i66 = i66;
                    i59 = i20;
                    listMo11508 = listMo11508;
                    iM1590 = iM1590;
                    viewOnClickListenerC0745 = viewOnClickListenerC0744;
                    break;
                case 1274940440:
                case 1884183446:
                    list = listMo11508;
                    i22 = i86;
                    i23 = i66;
                    Object[] objArr = new Object[i23];
                    objArr[0] = C1148.m4234(ViewGroupOnHierarchyChangeListenerC1916.m6238(atomicInteger));
                    i24 = i85;
                    str = String.format(AbstractC0464.m2308(f3035, 279, 9, i22), objArr);
                    z21 = z;
                    itM10417 = C3535.m10417(c7807.getMethods());
                    c8486 = c8485;
                    str5 = strMo20493;
                    int iM4502213 = (i57 - C19806.m45029("֨ۚ")) * 85;
                    i60 = iM4502213 ^ (-898488832);
                    i86 = i22;
                    i85 = i24;
                    str3 = str;
                    i66 = i23;
                    c84813 = c8486;
                    i59 = ((iM4502213 ^ i58) * 27725) ^ (-158550642);
                    listMo11508 = list;
                    iM1590 = iM1590;
                    viewOnClickListenerC0745 = viewOnClickListenerC0744;
                    break;
                case 1314536177:
                case 1363406857:
                    i65 = i65;
                    iM1590 = iM1590;
                    i61 = i61;
                    i62 = i62;
                    i75 = i63 + 1;
                    if (atomicInteger3 != null) {
                        iM11306 = ThreadFactoryC3888.m11306("۫۬") ^ i58;
                        i3 = ((iM11306 ^ i57) * (-16325)) ^ 2137418757;
                        i4 = -26143559;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֡ܽ") ^ i58;
                        i3 = ((iM11306 ^ i57) * (-10251)) ^ 1754602402;
                        i4 = -1134654745;
                    }
                    i60 = iM11306 ^ i4;
                    i59 = i3;
                    i65 = i65;
                    i61 = i61;
                    i62 = i62;
                    iM1590 = iM1590;
                    break;
                case 1333032287:
                case 1688694967:
                    i65 = i65;
                    iM1590 = iM1590;
                    i61 = i61;
                    i87 = i87;
                    str3 = str3;
                    i62 = i62;
                    i67 = i67;
                    i69 = i69;
                    listMo11508 = listMo11508;
                    i74 = i74;
                    i80 = i80;
                    enumC10298 = enumC102910;
                    i83 = i83;
                    i85 = i85;
                    c84815 = c84815;
                    c10113 = c10113;
                    i38 = i86;
                    abstractC3386 = (AbstractC3384) RunnableC1606.m5478(listMo11508, i85);
                    c18447M50239 = c22681.m50239(abstractC3386);
                    if (c18447M50239 == null) {
                        abstractC33810 = abstractC3386;
                        i83 = i83;
                        z3 = z5;
                        i47 = i85;
                        z7 = z3;
                        c84817 = c84815;
                        i70 = i47;
                        c84816 = c84819;
                        z6 = z8;
                        int iM1130117 = (i57 - ThreadFactoryC3888.m11306("ۡܶ")) * 87;
                        i67 = i67;
                        i85 = i85;
                        i86 = i38;
                        i80 = i80;
                        c84815 = c84815;
                        i87 = i87;
                        str3 = str3;
                        enumC102910 = enumC10298;
                        i74 = i74;
                        i69 = i69;
                        c10113 = c10113;
                        i65 = i65;
                        i62 = i62;
                        iM1590 = iM1590;
                        listMo11508 = listMo11508;
                        i60 = iM1130117 ^ (-231646801);
                        i59 = ((iM1130117 ^ i58) * (-28183)) ^ 434960571;
                    } else {
                        i67 = i67;
                        int iM450231 = C19806.m45029("᩸᩸") ^ i57;
                        i59 = ((iM450231 ^ i58) * 24069) ^ 1081097386;
                        i85 = i85;
                        i86 = i38;
                        i80 = i80;
                        c84815 = c84815;
                        i87 = i87;
                        str3 = str3;
                        i83 = i83;
                        enumC102910 = enumC10298;
                        i74 = i74;
                        i69 = i69;
                        abstractC33810 = abstractC3386;
                        c10113 = c10113;
                        i65 = i65;
                        i62 = i62;
                        iM1590 = iM1590;
                        listMo11508 = listMo11508;
                        i60 = iM450231 ^ 1917906967;
                    }
                    i61 = i61;
                    viewOnClickListenerC0745 = viewOnClickListenerC0744;
                    break;
                case 1498543053:
                case 1766517117:
                    i65 = i65;
                    iM1590 = iM1590;
                    i62 = i62;
                    c18447M50239 = c18447M50239;
                    arrayList4 = arrayList4;
                    if (zArr[i87]) {
                        iM450211 = C19806.m45029("ۧۚ") ^ i58;
                        i9 = ((iM450211 ^ i57) * (-27053)) ^ 1912588551;
                        i10 = 173202268;
                    } else {
                        iM450211 = (ThreadFactoryC3888.m11306("ܿۜ") ^ i57) * 71;
                        i9 = ((iM450211 ^ i58) * 6381) ^ 332448779;
                        i10 = 415532369;
                    }
                    i60 = iM450211 ^ i10;
                    arrayList4 = arrayList4;
                    i59 = i9;
                    i65 = i65;
                    c18447M50239 = c18447M50239;
                    i62 = i62;
                    iM1590 = iM1590;
                    break;
                case 1508291480:
                case 1741182529:
                    i65 = i65;
                    iM1590 = iM1590;
                    i61 = i61;
                    i25 = i87;
                    str2 = str3;
                    i62 = i62;
                    C8485 c84825 = c84813;
                    interfaceC7947 = interfaceC7945Mo25747;
                    arrayList3 = arrayList6;
                    list2 = listMo11508;
                    i26 = i74;
                    i27 = i80;
                    abstractC3384 = abstractC33810;
                    enumC10297 = enumC102910;
                    i28 = i83;
                    i34 = i85;
                    c8488 = c84815;
                    c10111 = c10113;
                    i29 = i86;
                    interfaceC7945M22153 = c84825.m22153(interfaceC7947);
                    i67 = 3;
                    if (atomicInteger3 != null) {
                        int iM450232 = (C19806.m45029("ۘ۠") + i58) * 91;
                        int i112 = ((iM450232 ^ i57) * (-12797)) ^ (-1895467524);
                        interfaceC7945Mo25747 = interfaceC7947;
                        i85 = i34;
                        arrayList6 = arrayList3;
                        i86 = i29;
                        i80 = i27;
                        c84815 = c8488;
                        i87 = i25;
                        str3 = str2;
                        i83 = i28;
                        enumC102910 = enumC10297;
                        i74 = i26;
                        i60 = iM450232 ^ (-738038390);
                        c84813 = c84825;
                        abstractC33810 = abstractC3384;
                        c10113 = c10111;
                        i65 = i65;
                        i61 = i61;
                        i62 = i62;
                        iM1590 = iM1590;
                        i64 = 5;
                        i69 = 6;
                        i59 = i112;
                    } else {
                        c8487 = c84825;
                        i64 = 5;
                        i69 = 6;
                        int iM450233 = C19806.m45029("۟ۗ") ^ i58;
                        interfaceC7945 = interfaceC7947;
                        i59 = ((iM450233 ^ i57) * (-12899)) ^ 2126019322;
                        i31 = iM450233 ^ 1099883360;
                        i85 = i34;
                        arrayList6 = arrayList3;
                        i86 = i29;
                        i80 = i27;
                        c84815 = c8488;
                        i87 = i25;
                        str3 = str2;
                        i83 = i28;
                        enumC102910 = enumC10297;
                        i74 = i26;
                        interfaceC7945Mo25747 = interfaceC7945;
                        c84813 = c8487;
                        abstractC33810 = abstractC3384;
                        c10113 = c10111;
                        i65 = i65;
                        i61 = i61;
                        i62 = i62;
                        iM1590 = iM1590;
                        i60 = i31;
                        i69 = i69;
                    }
                    listMo11508 = list2;
                    viewOnClickListenerC0745 = viewOnClickListenerC0744;
                    break;
                case 1511077143:
                case 2052080791:
                    i65 = i65;
                    iM1590 = iM1590;
                    i62 = i62;
                    c18447M50239 = c18447M50239;
                    arrayList4 = arrayList4;
                    if ((i76 & 4) != 0) {
                        iM450211 = (i57 - ThreadFactoryC3888.m11306("ۙ᩷")) * (-53);
                        i9 = ((iM450211 ^ i58) * 2253) ^ (-897118188);
                        i10 = 559469797;
                    } else {
                        iM450211 = C19806.m45029("ۢۧ") ^ i58;
                        i9 = ((iM450211 ^ i57) * 10569) ^ (-1336643724);
                        i10 = 618907663;
                    }
                    i60 = iM450211 ^ i10;
                    arrayList4 = arrayList4;
                    i59 = i9;
                    i65 = i65;
                    c18447M50239 = c18447M50239;
                    i62 = i62;
                    iM1590 = iM1590;
                    break;
                case 1777216197:
                case 2039055605:
                    i65 = i65;
                    iM1590 = iM1590;
                    i62 = i62;
                    c18447M50239 = c18447M50239;
                    arrayList4 = arrayList4;
                    if ((i76 & 2) != 0) {
                        iM113013 = ThreadFactoryC3888.m11306("ۨۢ") ^ i58;
                        i53 = ((iM113013 ^ i57) * (-26391)) ^ (-630872129);
                        i54 = 593411461;
                    } else {
                        iM113013 = (i57 - ThreadFactoryC3888.m11306("۬ۗ")) * 27;
                        i53 = ((iM113013 ^ i58) * (-6051)) ^ (-1073363963);
                        i54 = -237804285;
                    }
                    i60 = iM113013 ^ i54;
                    arrayList4 = arrayList4;
                    i65 = i65;
                    c18447M50239 = c18447M50239;
                    iM1590 = iM1590;
                    i59 = i53;
                    i62 = i62;
                    break;
                default:
                    i65 = i65;
                    iM1590 = iM1590;
                    i62 = i62;
                    c18447M50239 = c18447M50239;
                    arrayList4 = arrayList4;
                    C3660.m10788(arrayList4, (C21269) C3286.m9796(arrayListM41301, i87));
                    iM450211 = (ThreadFactoryC3888.m11306("ܿۜ") ^ i57) * 71;
                    i9 = ((iM450211 ^ i58) * 6381) ^ 332448779;
                    i10 = 415532369;
                    i60 = iM450211 ^ i10;
                    arrayList4 = arrayList4;
                    i59 = i9;
                    i65 = i65;
                    c18447M50239 = c18447M50239;
                    i62 = i62;
                    iM1590 = iM1590;
                    break;
            }
            c8485.m22159(C1189.m4356(c7807), c7807.mo20491(), c7807.mo20494(), c7807.mo20500(), str5, c7807.getAnnotations(), arrayList5, arrayList6);
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00cc, code lost:
    
        if (l.C0050.f912 <= 0) goto L18;
     */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m3229(l.ViewOnClickListenerC0744 r38, final android.widget.CheckBox r39) {
        /*
            Method dump skipped, instruction units count: 1722
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC0744.m3229(l.֡᩻ۨ, android.widget.CheckBox):void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m3216(ViewOnClickListenerC0744 viewOnClickListenerC0744, CheckBox checkBox) {
        int iM11306;
        int i;
        int i2;
        int i3;
        int iM11307;
        int i4;
        int iM45029;
        int i5;
        int i6;
        int i7;
        C10948 c10948;
        int i8;
        short[] sArr;
        C10948 c10949;
        int iM11308;
        int i9;
        int i10;
        int i11;
        final CheckBox checkBox2 = checkBox;
        int i12 = 0;
        int i13 = -1334464717;
        int i14 = RunnableC1606.f6488;
        int i15 = C2124.f7782;
        int iM450210 = C19806.m45029("ܶۨ") ^ i14;
        int i16 = ((iM450210 ^ i15) * 13401) ^ 1317377214;
        int i17 = iM450210 ^ (-1209741658);
        C10948 c109410 = null;
        InterfaceC6025 interfaceC6025 = null;
        String strM5047 = null;
        ViewOnClickListenerC22734 viewOnClickListenerC22734 = null;
        DialogInterface.OnClickListener onClickListener = null;
        String str = null;
        String strM3009 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        Main main = null;
        int i18 = 0;
        int iM450211 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int iM11309 = 0;
        int i22 = 0;
        int i23 = 0;
        short s = 0;
        View viewM4976 = null;
        C8067 c8067M5356 = null;
        DialogInterfaceOnClickListenerC16572 dialogInterfaceOnClickListenerC16572 = null;
        short[] sArr5 = null;
        int iM113010 = 0;
        View view = null;
        short[] sArr6 = null;
        int i24 = 0;
        short[] sArr7 = null;
        short[] sArr8 = null;
        int iM113011 = 0;
        while (true) {
            i13 = i17 ^ (i16 & (((i13 ^ i15) * (-23407)) >> 31));
            switch (i13) {
                case -2108650843:
                case -1571303479:
                    short[] sArr9 = sArr6;
                    int i25 = i22;
                    c10949 = c109410;
                    sArr5 = sArr5;
                    int i26 = i23;
                    sArr6 = sArr9;
                    C7105.m18993(C3743.m10957(viewM4976, ThreadFactoryC3888.m11306(ViewTreeObserverOnPreDrawListenerC3327.m9869(sArr9, i25, i26, i18)) ^ 2098780035), viewOnClickListenerC22734);
                    short[] sArr10 = f3035;
                    if (C1398.f5802 <= 0) {
                        sArr2 = sArr10;
                        i23 = i26;
                        i22 = i25;
                        c109410 = c10949;
                        main = main;
                        int i27 = i21;
                        sArr7 = sArr7;
                        i20 = i20;
                        i3 = i27;
                        iM11307 = C19806.m45029("۟ܰ") ^ i14;
                        i16 = ((iM11307 ^ i15) * (-25583)) ^ 426029633;
                        i4 = -514305992;
                        i7 = iM11307 ^ i4;
                        c109410 = c109410;
                        main = main;
                        strM5047 = strM5047;
                        interfaceC6025 = interfaceC6025;
                        sArr5 = sArr5;
                        sArr6 = sArr6;
                        sArr2 = sArr2;
                        i23 = i23;
                        i22 = i22;
                        i17 = i7;
                        checkBox2 = checkBox;
                        int i28 = i3;
                        i20 = i20;
                        sArr7 = sArr7;
                        i21 = i28;
                    } else {
                        int iM450212 = C19806.m45029("᩸֡") ^ i14;
                        int i29 = ((iM450212 ^ i15) * 8441) ^ 433489465;
                        i17 = iM450212 ^ (-941075941);
                        c109410 = c10949;
                        i22 = i25;
                        i16 = i29;
                        checkBox2 = checkBox;
                        i23 = i26;
                        sArr5 = sArr5;
                        sArr6 = sArr6;
                        sArr2 = sArr10;
                    }
                    break;
                case -2081946809:
                case -576088817:
                    int i30 = i22;
                    i23 = i23;
                    sArr2 = sArr2;
                    c10949 = c109410;
                    sArr6 = sArr6;
                    sArr5 = sArr5;
                    C7105.m18993(C2642.m8167(viewM4976, iM11309), viewOnClickListenerC22734);
                    i22 = i30;
                    strM3009 = C0671.m3009(f3035, 245, 3, i18);
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 < 0) {
                        iM11308 = (ThreadFactoryC3888.m11306("۟۟") + i15) * (-127);
                        i9 = ((iM11308 ^ i14) * (-4285)) ^ (-36895630);
                        i10 = -1926955355;
                        i11 = iM11308 ^ i10;
                        c109410 = c10949;
                        i16 = i9;
                        sArr5 = sArr5;
                        sArr6 = sArr6;
                        sArr2 = sArr2;
                        i23 = i23;
                        i22 = i22;
                        i17 = i11;
                        checkBox2 = checkBox;
                    } else {
                        c109410 = c10949;
                        main = main;
                        int i210 = i21;
                        sArr7 = sArr7;
                        i20 = i20;
                        i3 = i210;
                        iM11307 = C19806.m45029("۟ܰ") ^ i14;
                        i16 = ((iM11307 ^ i15) * (-25583)) ^ 426029633;
                        i4 = -514305992;
                        i7 = iM11307 ^ i4;
                        c109410 = c109410;
                        main = main;
                        strM5047 = strM5047;
                        interfaceC6025 = interfaceC6025;
                        sArr5 = sArr5;
                        sArr6 = sArr6;
                        sArr2 = sArr2;
                        i23 = i23;
                        i22 = i22;
                        i17 = i7;
                        checkBox2 = checkBox;
                        int i211 = i3;
                        i20 = i20;
                        sArr7 = sArr7;
                        i21 = i211;
                    }
                    break;
                case -2020406426:
                case -1047429273:
                    ThreadFactoryC3888.m11300();
                    if (C2124.f7782 <= 0) {
                        iM11306 = C19806.m45029("ܰۢ") ^ i14;
                        i = ((iM11306 ^ i15) * 10257) ^ 1029787124;
                        i2 = 89187609;
                        i17 = iM11306 ^ i2;
                        i16 = i;
                    } else {
                        interfaceC6025 = interfaceC6025;
                        i22 = i22;
                        i23 = i23;
                        sArr2 = sArr2;
                        c109410 = c109410;
                        sArr6 = sArr6;
                        sArr5 = sArr5;
                        strM5047 = strM5047;
                        main = main;
                        int i31 = i21;
                        sArr7 = sArr7;
                        i20 = i20;
                        i3 = i31;
                        iM11307 = ThreadFactoryC3888.m11306("֫ܰ") ^ i15;
                        i16 = ((iM11307 ^ i14) * (-18327)) ^ (-2054868800);
                        i4 = 628678056;
                        i7 = iM11307 ^ i4;
                        c109410 = c109410;
                        main = main;
                        strM5047 = strM5047;
                        interfaceC6025 = interfaceC6025;
                        sArr5 = sArr5;
                        sArr6 = sArr6;
                        sArr2 = sArr2;
                        i23 = i23;
                        i22 = i22;
                        i17 = i7;
                        checkBox2 = checkBox;
                        int i212 = i3;
                        i20 = i20;
                        sArr7 = sArr7;
                        i21 = i212;
                    }
                    break;
                case -1980710306:
                case -1741295577:
                    i3 = i21;
                    i18 = 49286;
                    iM11307 = (i15 - C19806.m45029("ᩴۜ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i16 = ((iM11307 ^ i14) * (-9789)) ^ (-442295190);
                    i4 = 524526913;
                    i7 = iM11307 ^ i4;
                    c109410 = c109410;
                    main = main;
                    strM5047 = strM5047;
                    interfaceC6025 = interfaceC6025;
                    sArr5 = sArr5;
                    sArr6 = sArr6;
                    sArr2 = sArr2;
                    i23 = i23;
                    i22 = i22;
                    i17 = i7;
                    checkBox2 = checkBox;
                    int i213 = i3;
                    i20 = i20;
                    sArr7 = sArr7;
                    i21 = i213;
                    break;
                case -1863192265:
                case 635281137:
                    C1066.m4025(c8067M5356, iM113010, null);
                    dialogInterfaceOnClickListenerC16572 = new DialogInterfaceOnClickListenerC16572(1, checkBox2);
                    sArr4 = f3035;
                    i24 = 260;
                    iM11306 = C19806.m45029("ܳ֡") ^ i14;
                    i = ((iM11306 ^ i15) * (-17459)) ^ 1887550599;
                    i2 = -975654427;
                    i17 = iM11306 ^ i2;
                    i16 = i;
                    break;
                case -1854776501:
                case 1479802380:
                    interfaceC6025 = interfaceC6025;
                    i22 = i22;
                    i23 = i23;
                    sArr2 = sArr2;
                    c109410 = c109410;
                    sArr6 = sArr6;
                    sArr5 = sArr5;
                    strM5047 = strM5047;
                    main = main;
                    int i32 = i21;
                    sArr7 = sArr7;
                    i20 = i20;
                    i3 = i32;
                    s = f3035[147];
                    i12 = (s * s) + 112741924;
                    iM11307 = ThreadFactoryC3888.m11306("ᩴᩴ") ^ i14;
                    i16 = ((iM11307 ^ i15) * 4703) ^ 1869150763;
                    i4 = 683164348;
                    i7 = iM11307 ^ i4;
                    c109410 = c109410;
                    main = main;
                    strM5047 = strM5047;
                    interfaceC6025 = interfaceC6025;
                    sArr5 = sArr5;
                    sArr6 = sArr6;
                    sArr2 = sArr2;
                    i23 = i23;
                    i22 = i22;
                    i17 = i7;
                    checkBox2 = checkBox;
                    int i214 = i3;
                    i20 = i20;
                    sArr7 = sArr7;
                    i21 = i214;
                    break;
                case -1853521502:
                case -300287785:
                    AbstractC0464.m2313();
                    C2642.m8171();
                    interfaceC6025 = interfaceC6025;
                    i22 = i22;
                    i23 = i23;
                    sArr2 = sArr2;
                    c109410 = c109410;
                    sArr6 = sArr6;
                    sArr5 = sArr5;
                    strM5047 = strM5047;
                    main = main;
                    int i33 = i21;
                    sArr7 = sArr7;
                    i20 = i20;
                    i3 = i33;
                    iM11307 = ThreadFactoryC3888.m11306("֫ܰ") ^ i15;
                    i16 = ((iM11307 ^ i14) * (-18327)) ^ (-2054868800);
                    i4 = 628678056;
                    i7 = iM11307 ^ i4;
                    c109410 = c109410;
                    main = main;
                    strM5047 = strM5047;
                    interfaceC6025 = interfaceC6025;
                    sArr5 = sArr5;
                    sArr6 = sArr6;
                    sArr2 = sArr2;
                    i23 = i23;
                    i22 = i22;
                    i17 = i7;
                    checkBox2 = checkBox;
                    int i215 = i3;
                    i20 = i20;
                    sArr7 = sArr7;
                    i21 = i215;
                    break;
                case -1685932417:
                case 2061756872:
                    C1460.m5055(c8067M5356, ThreadFactoryC3888.m11306(C19806.m45020(sArr5, Scalar25519.TARGET_LENGTH, 3, i18)) ^ 2098249095, onClickListener);
                    sArr3 = f3035;
                    iM11306 = C19806.m45029("ۢۨ") ^ i15;
                    i = ((iM11306 ^ i14) * (-2587)) ^ 252910917;
                    i2 = 2047839455;
                    i17 = iM11306 ^ i2;
                    i16 = i;
                    break;
                case -1647942703:
                case -688887580:
                    sArr5 = sArr5;
                    sArr2 = sArr2;
                    C10948 c109411 = c109410;
                    sArr = f3035;
                    i22 = 248;
                    if (!C1419.m4973()) {
                        int iM450213 = (C19806.m45029("᩹᩶") + i14) * (-33);
                        i17 = iM450213 ^ (-1231563614);
                        c109410 = c109411;
                        i16 = ((iM450213 ^ i15) * (-3995)) ^ 1497912204;
                        sArr5 = sArr5;
                        sArr2 = sArr2;
                        i23 = 3;
                        sArr6 = sArr;
                        checkBox2 = checkBox;
                    } else {
                        c10948 = c109411;
                        i8 = 3;
                        int i34 = i21;
                        sArr7 = sArr7;
                        i20 = i20;
                        i3 = i34;
                        int iM450214 = (i15 - C19806.m45029("ۘۗ")) * (-23);
                        short[] sArr11 = sArr;
                        int i35 = ((iM450214 ^ i14) * 3181) ^ 1225803045;
                        i17 = iM450214 ^ (-2138317173);
                        sArr8 = sArr8;
                        c109410 = c10948;
                        sArr5 = sArr5;
                        sArr6 = sArr11;
                        interfaceC6025 = interfaceC6025;
                        sArr2 = sArr2;
                        i23 = i8;
                        i16 = i35;
                        checkBox2 = checkBox;
                        int i216 = i3;
                        i20 = i20;
                        sArr7 = sArr7;
                        i21 = i216;
                    }
                    break;
                case -1574902582:
                case 1504336767:
                    interfaceC6025 = interfaceC6025;
                    i22 = i22;
                    i23 = i23;
                    sArr2 = sArr2;
                    c10948 = c109410;
                    sArr6 = sArr6;
                    sArr5 = sArr5;
                    int i36 = i21;
                    sArr7 = sArr7;
                    i20 = i20;
                    i3 = i36;
                    sArr8 = sArr8;
                    strM5047 = C1460.m5047(sArr8, EnumC2300.f8185, 17, i18);
                    if (C2704.m8255() > 0) {
                        int iM450215 = (C19806.m45029("᩶ۜ") ^ i14) * (-7);
                        i16 = ((iM450215 ^ i15) * (-9)) ^ (-264642179);
                        i7 = iM450215 ^ 2069593049;
                        sArr8 = sArr8;
                        c109410 = c10948;
                        sArr5 = sArr5;
                        sArr6 = sArr6;
                        interfaceC6025 = interfaceC6025;
                        sArr2 = sArr2;
                        i23 = i23;
                        i22 = i22;
                        i17 = i7;
                        checkBox2 = checkBox;
                        int i217 = i3;
                        i20 = i20;
                        sArr7 = sArr7;
                        i21 = i217;
                    } else {
                        i8 = i23;
                        sArr = sArr6;
                        i22 = i22;
                        int iM450216 = (i15 - C19806.m45029("ۘۗ")) * (-23);
                        short[] sArr12 = sArr;
                        int i37 = ((iM450216 ^ i14) * 3181) ^ 1225803045;
                        i17 = iM450216 ^ (-2138317173);
                        sArr8 = sArr8;
                        c109410 = c10948;
                        sArr5 = sArr5;
                        sArr6 = sArr12;
                        interfaceC6025 = interfaceC6025;
                        sArr2 = sArr2;
                        i23 = i8;
                        i16 = i37;
                        checkBox2 = checkBox;
                        int i218 = i3;
                        i20 = i20;
                        sArr7 = sArr7;
                        i21 = i218;
                    }
                    break;
                case -1116064254:
                case -949167388:
                    interfaceC6025 = interfaceC6025;
                    i22 = i22;
                    i23 = i23;
                    sArr2 = sArr2;
                    c109410 = c109410;
                    sArr6 = sArr6;
                    sArr5 = sArr5;
                    strM5047 = strM5047;
                    main = main;
                    int i38 = i21;
                    sArr7 = sArr7;
                    i20 = i20;
                    i3 = i38;
                    short s2 = s;
                    int i39 = s2 + 10618;
                    if ((i39 * i39) - (i12 + i12) <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۬֨") ^ i15;
                        i5 = ((iM45029 ^ i14) * 3459) ^ 1641440969;
                        i6 = -1525090668;
                    } else {
                        iM45029 = C19806.m45029("ۡܳ") ^ i14;
                        i5 = ((iM45029 ^ i15) * (-19301)) ^ 1834773250;
                        i6 = 1713883380;
                    }
                    i7 = iM45029 ^ i6;
                    s = s2;
                    i16 = i5;
                    c109410 = c109410;
                    main = main;
                    strM5047 = strM5047;
                    interfaceC6025 = interfaceC6025;
                    sArr5 = sArr5;
                    sArr6 = sArr6;
                    sArr2 = sArr2;
                    i23 = i23;
                    i22 = i22;
                    i17 = i7;
                    checkBox2 = checkBox;
                    int i219 = i3;
                    i20 = i20;
                    sArr7 = sArr7;
                    i21 = i219;
                    break;
                case -993766520:
                case -382302719:
                    interfaceC6025 = interfaceC6025;
                    i22 = i22;
                    i23 = i23;
                    sArr2 = sArr2;
                    c109410 = c109410;
                    sArr6 = sArr6;
                    sArr5 = sArr5;
                    strM5047 = strM5047;
                    main = main;
                    int i40 = i21;
                    sArr7 = sArr7;
                    i20 = i20;
                    i3 = i40;
                    iM113011 = ThreadFactoryC3888.m11306(str) ^ 2125223858;
                    if (C1460.f5948 >= 0) {
                        iM11307 = C19806.m45029("۟ܰ") ^ i14;
                        i16 = ((iM11307 ^ i15) * (-25583)) ^ 426029633;
                        i4 = -514305992;
                    } else {
                        iM11307 = (ThreadFactoryC3888.m11306("᩵᩹") + i15) * 61;
                        i16 = ((iM11307 ^ i14) * 14527) ^ (-1122675134);
                        i4 = -221056637;
                    }
                    i7 = iM11307 ^ i4;
                    c109410 = c109410;
                    main = main;
                    strM5047 = strM5047;
                    interfaceC6025 = interfaceC6025;
                    sArr5 = sArr5;
                    sArr6 = sArr6;
                    sArr2 = sArr2;
                    i23 = i23;
                    i22 = i22;
                    i17 = i7;
                    checkBox2 = checkBox;
                    int i2110 = i3;
                    i20 = i20;
                    sArr7 = sArr7;
                    i21 = i2110;
                    break;
                case -783066533:
                case 1950629859:
                    short[] sArr13 = sArr7;
                    int i41 = i21;
                    i22 = i22;
                    i23 = i23;
                    sArr2 = sArr2;
                    C10948 c109412 = c109410;
                    sArr6 = sArr6;
                    sArr5 = sArr5;
                    int i42 = i20;
                    sArr7 = sArr13;
                    C7105.m18993(C3743.m10957(viewM4976, ThreadFactoryC3888.m11306(MenuItemOnMenuItemClickListenerC3244.m9715(sArr13, i42, i41, i18)) ^ 2117614125), viewOnClickListenerC22734);
                    if (C2788.f10625 < 0) {
                        int iM450217 = C19806.m45029("ۛۙ") ^ i15;
                        int i43 = ((iM450217 ^ i14) * (-20983)) ^ 1462222669;
                        i11 = iM450217 ^ (-1637101642);
                        c109410 = c109412;
                        i16 = i43;
                        i20 = i42;
                        sArr7 = sArr7;
                        sArr5 = sArr5;
                        sArr6 = sArr6;
                        i21 = i41;
                        sArr2 = sArr2;
                        i23 = i23;
                        i22 = i22;
                        i17 = i11;
                        checkBox2 = checkBox;
                    } else {
                        i20 = i42;
                        i3 = i41;
                        interfaceC6025 = interfaceC6025;
                        strM5047 = strM5047;
                        c109410 = c109412;
                        main = main;
                        iM11307 = C19806.m45029("۟ܰ") ^ i14;
                        i16 = ((iM11307 ^ i15) * (-25583)) ^ 426029633;
                        i4 = -514305992;
                        i7 = iM11307 ^ i4;
                        c109410 = c109410;
                        main = main;
                        strM5047 = strM5047;
                        interfaceC6025 = interfaceC6025;
                        sArr5 = sArr5;
                        sArr6 = sArr6;
                        sArr2 = sArr2;
                        i23 = i23;
                        i22 = i22;
                        i17 = i7;
                        checkBox2 = checkBox;
                        int i2111 = i3;
                        i20 = i20;
                        sArr7 = sArr7;
                        i21 = i2111;
                    }
                    break;
                case -763122525:
                case 1627491111:
                    i3 = i21;
                    i18 = 59068;
                    iM11307 = (i15 - C19806.m45029("ᩴۜ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i16 = ((iM11307 ^ i14) * (-9789)) ^ (-442295190);
                    i4 = 524526913;
                    i7 = iM11307 ^ i4;
                    c109410 = c109410;
                    main = main;
                    strM5047 = strM5047;
                    interfaceC6025 = interfaceC6025;
                    sArr5 = sArr5;
                    sArr6 = sArr6;
                    sArr2 = sArr2;
                    i23 = i23;
                    i22 = i22;
                    i17 = i7;
                    checkBox2 = checkBox;
                    int i2112 = i3;
                    i20 = i20;
                    sArr7 = sArr7;
                    i21 = i2112;
                    break;
                case -689040013:
                case 1425854013:
                    i22 = i22;
                    i23 = i23;
                    sArr2 = sArr2;
                    sArr6 = sArr6;
                    sArr5 = sArr5;
                    int i44 = i21;
                    sArr7 = sArr7;
                    i20 = i20;
                    i3 = i44;
                    c109410 = (C10948) C3743.m10957(viewM4976, iM450211 ^ i19);
                    interfaceC6025 = ApplicationC0716.f2992;
                    sArr8 = f3035;
                    int iM450218 = C19806.m45029("֡ܰ") ^ i14;
                    i16 = ((iM450218 ^ i15) * (-25215)) ^ (-108392247);
                    i7 = iM450218 ^ (-1233307640);
                    strM5047 = strM5047;
                    sArr5 = sArr5;
                    sArr6 = sArr6;
                    sArr2 = sArr2;
                    i23 = i23;
                    i22 = i22;
                    i17 = i7;
                    checkBox2 = checkBox;
                    int i2113 = i3;
                    i20 = i20;
                    sArr7 = sArr7;
                    i21 = i2113;
                    break;
                case -370109725:
                case 1797951579:
                    i22 = i22;
                    i23 = i23;
                    sArr2 = sArr2;
                    c10949 = c109410;
                    sArr6 = sArr6;
                    sArr5 = sArr5;
                    iM11309 = ThreadFactoryC3888.m11306(C1977.m6363(f3035, 242, 3, i18)) ^ 2119078296;
                    iM11308 = (C19806.m45029("֡ܿ") + i14) * (-111);
                    i9 = ((iM11308 ^ i15) * (-17275)) ^ 890740025;
                    i10 = -592273415;
                    i11 = iM11308 ^ i10;
                    c109410 = c10949;
                    i16 = i9;
                    sArr5 = sArr5;
                    sArr6 = sArr6;
                    sArr2 = sArr2;
                    i23 = i23;
                    i22 = i22;
                    i17 = i11;
                    checkBox2 = checkBox;
                    break;
                case -283792455:
                case 305493018:
                    int i45 = i22;
                    int i46 = i23;
                    short[] sArr14 = sArr2;
                    int i47 = i21;
                    sArr7 = sArr7;
                    i20 = i20;
                    i3 = i47;
                    Main main2 = viewOnClickListenerC0744.f3041;
                    String strM3406 = C0817.m3406(f3035, 148, 3, i18);
                    int iM113012 = (ThreadFactoryC3888.m11306("ۢۤ") ^ i14) * (-27);
                    strM5047 = strM5047;
                    c109410 = c109410;
                    sArr5 = sArr5;
                    sArr6 = sArr6;
                    interfaceC6025 = interfaceC6025;
                    sArr2 = sArr14;
                    i23 = i46;
                    i22 = i45;
                    i17 = iM113012 ^ 1567057859;
                    i16 = ((iM113012 ^ i15) * 16619) ^ 2035109898;
                    main = main2;
                    str = strM3406;
                    checkBox2 = checkBox;
                    int i2114 = i3;
                    i20 = i20;
                    sArr7 = sArr7;
                    i21 = i2114;
                    break;
                case -258771289:
                case 1913281584:
                    interfaceC6025 = interfaceC6025;
                    i22 = i22;
                    i23 = i23;
                    sArr2 = sArr2;
                    c109410 = c109410;
                    sArr6 = sArr6;
                    sArr5 = sArr5;
                    strM5047 = strM5047;
                    int i48 = i21;
                    sArr7 = sArr7;
                    i20 = i20;
                    i3 = i48;
                    viewM4976 = C1419.m4976(main, iM113011);
                    main = main;
                    iM450211 = C19806.m45029(C0278.m1774(f3035, 151, 3, i18));
                    i19 = 2121155539;
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM11307 = ThreadFactoryC3888.m11306("֫ܰ") ^ i15;
                        i16 = ((iM11307 ^ i14) * (-18327)) ^ (-2054868800);
                        i4 = 628678056;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("᩷ܺ") ^ i15;
                        i16 = ((iM11307 ^ i14) * (-27739)) ^ (-664578946);
                        i4 = 593785749;
                    }
                    i7 = iM11307 ^ i4;
                    c109410 = c109410;
                    main = main;
                    strM5047 = strM5047;
                    interfaceC6025 = interfaceC6025;
                    sArr5 = sArr5;
                    sArr6 = sArr6;
                    sArr2 = sArr2;
                    i23 = i23;
                    i22 = i22;
                    i17 = i7;
                    checkBox2 = checkBox;
                    int i2115 = i3;
                    i20 = i20;
                    sArr7 = sArr7;
                    i21 = i2115;
                    break;
                case -253193826:
                case 227858066:
                    iM113010 = ThreadFactoryC3888.m11306(C1189.m4365(sArr3, 257, 3, i18)) ^ 2123622838;
                    if (C0671.f2816 == 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۛܰ") ^ i15;
                        i = ((iM11306 ^ i14) * 30183) ^ (-571799348);
                        i2 = -412439415;
                        i17 = iM11306 ^ i2;
                        i16 = i;
                    } else {
                        interfaceC6025 = interfaceC6025;
                        i22 = i22;
                        i23 = i23;
                        sArr2 = sArr2;
                        c109410 = c109410;
                        sArr6 = sArr6;
                        sArr5 = sArr5;
                        strM5047 = strM5047;
                        main = main;
                        int i310 = i21;
                        sArr7 = sArr7;
                        i20 = i20;
                        i3 = i310;
                        iM11307 = ThreadFactoryC3888.m11306("֫ܰ") ^ i15;
                        i16 = ((iM11307 ^ i14) * (-18327)) ^ (-2054868800);
                        i4 = 628678056;
                        i7 = iM11307 ^ i4;
                        c109410 = c109410;
                        main = main;
                        strM5047 = strM5047;
                        interfaceC6025 = interfaceC6025;
                        sArr5 = sArr5;
                        sArr6 = sArr6;
                        sArr2 = sArr2;
                        i23 = i23;
                        i22 = i22;
                        i17 = i7;
                        checkBox2 = checkBox;
                        int i2116 = i3;
                        i20 = i20;
                        sArr7 = sArr7;
                        i21 = i2116;
                    }
                    break;
                case 28172704:
                case 1390669126:
                    RunnableC1895.m6170();
                    break;
                case 175506903:
                case 970892153:
                    int i49 = i21;
                    i22 = i22;
                    i23 = i23;
                    sArr2 = sArr2;
                    C10948 c109413 = c109410;
                    sArr7 = sArr7;
                    i20 = i20;
                    sArr6 = sArr6;
                    sArr5 = sArr5;
                    i3 = i49;
                    interfaceC6025 = interfaceC6025;
                    strM5047 = strM5047;
                    C1419.m4968(c109413, C2332.m7076(interfaceC6025, strM5047, C0817.m3406(f3035, 171, 68, i18)));
                    if (!C0817.f3443) {
                        c109410 = c109413;
                        main = main;
                        iM11307 = ThreadFactoryC3888.m11306("֫ܰ") ^ i15;
                        i16 = ((iM11307 ^ i14) * (-18327)) ^ (-2054868800);
                        i4 = 628678056;
                        i7 = iM11307 ^ i4;
                        c109410 = c109410;
                        main = main;
                        strM5047 = strM5047;
                        interfaceC6025 = interfaceC6025;
                        sArr5 = sArr5;
                        sArr6 = sArr6;
                        sArr2 = sArr2;
                        i23 = i23;
                        i22 = i22;
                        i17 = i7;
                        checkBox2 = checkBox;
                        int i2117 = i3;
                        i20 = i20;
                        sArr7 = sArr7;
                        i21 = i2117;
                    } else {
                        int iM450219 = C19806.m45029("᩻᩺") ^ i15;
                        c10948 = c109413;
                        i16 = ((iM450219 ^ i14) * (-21931)) ^ (-1761334848);
                        i7 = iM450219 ^ 671249655;
                        strM5047 = strM5047;
                        c109410 = c10948;
                        sArr5 = sArr5;
                        sArr6 = sArr6;
                        interfaceC6025 = interfaceC6025;
                        sArr2 = sArr2;
                        i23 = i23;
                        i22 = i22;
                        i17 = i7;
                        checkBox2 = checkBox;
                        int i2118 = i3;
                        i20 = i20;
                        sArr7 = sArr7;
                        i21 = i2118;
                    }
                    break;
                case 244275921:
                case 568785810:
                    if (C0050.f912 <= 0) {
                        sArr = sArr6;
                        i8 = i23;
                        sArr2 = sArr2;
                        c10948 = c109410;
                        sArr5 = sArr5;
                        int i311 = i21;
                        sArr7 = sArr7;
                        i20 = i20;
                        i3 = i311;
                        int iM4502110 = (i15 - C19806.m45029("ۘۗ")) * (-23);
                        short[] sArr15 = sArr;
                        int i312 = ((iM4502110 ^ i14) * 3181) ^ 1225803045;
                        i17 = iM4502110 ^ (-2138317173);
                        sArr8 = sArr8;
                        c109410 = c10948;
                        sArr5 = sArr5;
                        sArr6 = sArr15;
                        interfaceC6025 = interfaceC6025;
                        sArr2 = sArr2;
                        i23 = i8;
                        i16 = i312;
                        checkBox2 = checkBox;
                        int i2119 = i3;
                        i20 = i20;
                        sArr7 = sArr7;
                        i21 = i2119;
                    }
                    interfaceC6025 = interfaceC6025;
                    i22 = i22;
                    i23 = i23;
                    sArr2 = sArr2;
                    c109410 = c109410;
                    sArr6 = sArr6;
                    sArr5 = sArr5;
                    strM5047 = strM5047;
                    main = main;
                    int i313 = i21;
                    sArr7 = sArr7;
                    i20 = i20;
                    i3 = i313;
                    iM11307 = ThreadFactoryC3888.m11306("֫ܰ") ^ i15;
                    i16 = ((iM11307 ^ i14) * (-18327)) ^ (-2054868800);
                    i4 = 628678056;
                    i7 = iM11307 ^ i4;
                    c109410 = c109410;
                    main = main;
                    strM5047 = strM5047;
                    interfaceC6025 = interfaceC6025;
                    sArr5 = sArr5;
                    sArr6 = sArr6;
                    sArr2 = sArr2;
                    i23 = i23;
                    i22 = i22;
                    i17 = i7;
                    checkBox2 = checkBox;
                    int i21110 = i3;
                    i20 = i20;
                    sArr7 = sArr7;
                    i21 = i21110;
                    break;
                case 252623547:
                case 1238353204:
                    C7105.m18993(view, viewOnClickListenerC22734);
                    c8067M5356 = RunnableC1564.m5356(main);
                    C1977.m6349(c8067M5356, viewM4976);
                    final C10948 c109414 = c109410;
                    onClickListener = new DialogInterface.OnClickListener() { // from class: l.ܶ᩻ۨ

                        /* JADX INFO: renamed from: ۗ᩶۬, reason: not valid java name and contains not printable characters */
                        private static final short[] f50621 = {9887, 14236, 14285, 14274, 14303, 14299, 14291, 14283, 14262, 14285, 14293, 14298, 14295, 14277, 14277, 14283, 14236, 14267, 14248, 14285, 14299, 14291, 14274, 14302, 14297, 14290, 14283, 14270, 14285, 14298, 14297, 14293, 14295, 14274, 14303, 14297, 14296, 14283, 14271, 14236, 14285, 14276, 14291, 14277, 14275, 14298, 14274, 14283, 14236, 14267, 14267, 14267, 14267, 14267, 14267, 14267, 14267, 14267, 14267, 14267, 14267, 14267, 14267, 14267, 14267, 14267, 14267, 14267, 14267, 14236, 14335, 14328, 14332, 14323, 14325, 14306, 14281, 14330, 14329, 14321, 14281, 14320, 14329, 14308, 14331, 14327, 14306};

                        {
                            int i50 = -904777210;
                            int i51 = RunnableC1606.f6488;
                            int i52 = C7105.f23796;
                            int iM113013 = ThreadFactoryC3888.m11306("᩻ۛ") ^ i51;
                            int i53 = ((iM113013 ^ i52) * (-24277)) ^ 855333895;
                            int i54 = -658528403;
                            while (true) {
                                i50 = ((((i50 ^ i52) * (-3987)) >> 31) & i53) ^ (iM113013 ^ i54);
                                switch (i50) {
                                    case -2082427054:
                                    case -855712222:
                                        if (C2249.f8050 >= 0) {
                                            iM113013 = (ThreadFactoryC3888.m11306("ܶۗ") + i51) * 35;
                                            i53 = ((iM113013 ^ i52) * (-8893)) ^ (-212060480);
                                            i54 = 762126223;
                                        } else {
                                            iM113013 = (C19806.m45029("᩷ܶ") + i52) * (-101);
                                            i53 = ((iM113013 ^ i51) * (-32525)) ^ (-1948122860);
                                            i54 = -589219782;
                                        }
                                        break;
                                    case -1778538840:
                                    case 18431178:
                                        if (C2124.m6673() <= 0) {
                                            iM113013 = (ThreadFactoryC3888.m11306("ܳۚ") + i52) * (-21);
                                            i53 = ((iM113013 ^ i51) * (-30675)) ^ 1466512654;
                                            i54 = -898561276;
                                        } else {
                                            iM113013 = (ThreadFactoryC3888.m11306("ܶ᩻") + i51) * 75;
                                            i53 = ((iM113013 ^ i52) * (-9463)) ^ (-911843740);
                                            i54 = 1563871758;
                                        }
                                        break;
                                    case -1574213947:
                                    case 431225521:
                                        if (C2642.f10294 <= 0) {
                                            iM113013 = (i52 - C19806.m45029("ᩴ֨")) * (-7);
                                            i53 = ((iM113013 ^ i51) * (-5763)) ^ (-1233391707);
                                            i54 = 1704031554;
                                        } else {
                                            iM113013 = ThreadFactoryC3888.m11306("ۜ᩻") ^ i52;
                                            i53 = ((iM113013 ^ i51) * 18149) ^ (-1282790828);
                                            i54 = -591516115;
                                        }
                                        break;
                                    case -1429899661:
                                    case -1018820531:
                                        if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                                            iM113013 = ThreadFactoryC3888.m11306("۠ܽ") ^ i51;
                                            i53 = ((iM113013 ^ i52) * 18643) ^ 291189628;
                                            i54 = -288475569;
                                        } else {
                                            iM113013 = (ThreadFactoryC3888.m11306("ܶۗ") + i51) * 35;
                                            i53 = ((iM113013 ^ i52) * (-8893)) ^ (-212060480);
                                            i54 = 762126223;
                                        }
                                        break;
                                    case -977101233:
                                    case 929778293:
                                        if (C1668.m5583()) {
                                            iM113013 = (i51 - ThreadFactoryC3888.m11306("ܳۢ")) * 3;
                                            i53 = ((iM113013 ^ i52) * (-3993)) ^ 1845193284;
                                            i54 = 805144311;
                                        } else {
                                            iM113013 = (ThreadFactoryC3888.m11306("ܶۗ") + i51) * 35;
                                            i53 = ((iM113013 ^ i52) * (-8893)) ^ (-212060480);
                                            i54 = 762126223;
                                        }
                                        break;
                                    case -749596014:
                                    case -104667520:
                                        if (C3722.f13525 <= 0) {
                                            iM113013 = C19806.m45029("᩷ۡ") ^ i52;
                                            i53 = ((iM113013 ^ i51) * 9937) ^ 872985779;
                                            i54 = -206449335;
                                        } else {
                                            iM113013 = (i51 - C19806.m45029("᩹ۖ")) * (-61);
                                            i53 = ((iM113013 ^ i52) * 1165) ^ (-1953949981);
                                            i54 = 213122920;
                                        }
                                        break;
                                    case -689634247:
                                    case -339213892:
                                        if (C2332.f8260) {
                                            iM113013 = (ThreadFactoryC3888.m11306("ܽ᩸") ^ i52) * (-33);
                                            i53 = ((iM113013 ^ i51) * 11537) ^ 474463914;
                                            i54 = 1136666623;
                                        } else {
                                            iM113013 = (ThreadFactoryC3888.m11306("ܶۗ") + i51) * 35;
                                            i53 = ((iM113013 ^ i52) * (-8893)) ^ (-212060480);
                                            i54 = 762126223;
                                        }
                                        break;
                                    case -648216252:
                                    case -528919380:
                                        if (C1875.f7103 >= 0) {
                                            iM113013 = C19806.m45029("᩷ۡ") ^ i52;
                                            i53 = ((iM113013 ^ i51) * 9937) ^ 872985779;
                                            i54 = -206449335;
                                        } else {
                                            iM113013 = ThreadFactoryC3888.m11306("ۤܺ") ^ i52;
                                            i53 = ((iM113013 ^ i51) * (-32353)) ^ 556320527;
                                            i54 = 1233397419;
                                        }
                                        break;
                                    case -406011580:
                                    case 620988200:
                                        C3743.m10966();
                                        C1189.m4368();
                                        throw new RuntimeException();
                                    case 130906837:
                                    case 2117118278:
                                        C3660.m10791();
                                        if (RunnableC1606.m5473() != 0) {
                                            iM113013 = (ThreadFactoryC3888.m11306("ܳۚ") + i52) * (-21);
                                            i53 = ((iM113013 ^ i51) * (-30675)) ^ 1466512654;
                                            i54 = -898561276;
                                        } else {
                                            iM113013 = (ThreadFactoryC3888.m11306("ܶۗ") + i51) * 35;
                                            i53 = ((iM113013 ^ i52) * (-8893)) ^ (-212060480);
                                            i54 = 762126223;
                                        }
                                        break;
                                    case 225243090:
                                    case 970373932:
                                        if (C2788.f10625 >= 0) {
                                            iM113013 = (i52 - C19806.m45029("ᩴ֨")) * (-7);
                                            i53 = ((iM113013 ^ i51) * (-5763)) ^ (-1233391707);
                                            i54 = 1704031554;
                                        } else {
                                            iM113013 = (ThreadFactoryC3888.m11306("ܶۗ") + i51) * 35;
                                            i53 = ((iM113013 ^ i52) * (-8893)) ^ (-212060480);
                                            i54 = 762126223;
                                        }
                                        break;
                                    case 315181793:
                                    case 888688971:
                                        C7105.m18985();
                                        if (RunnableC3388.f12514 >= 0) {
                                            iM113013 = (ThreadFactoryC3888.m11306("ܳۚ") + i52) * (-21);
                                            i53 = ((iM113013 ^ i51) * (-30675)) ^ 1466512654;
                                            i54 = -898561276;
                                        } else {
                                            iM113013 = ThreadFactoryC3888.m11306("۟ܿ") ^ i51;
                                            i53 = ((iM113013 ^ i52) * (-31185)) ^ 162303754;
                                            i54 = -1847090210;
                                        }
                                        break;
                                    case 382268063:
                                    case 432383284:
                                        if (C1977.m6356()) {
                                            iM113013 = C19806.m45029("᩷ۡ") ^ i52;
                                            i53 = ((iM113013 ^ i51) * 9937) ^ 872985779;
                                            i54 = -206449335;
                                        } else {
                                            iM113013 = ThreadFactoryC3888.m11306("᩵ܽ") ^ i51;
                                            i53 = ((iM113013 ^ i52) * 26867) ^ (-87474091);
                                            i54 = -1282282031;
                                        }
                                        break;
                                    case 383423517:
                                    case 1813472705:
                                        if (C0216.f1393 != 0) {
                                            iM113013 = (i52 - C19806.m45029("ᩴ֨")) * (-7);
                                            i53 = ((iM113013 ^ i51) * (-5763)) ^ (-1233391707);
                                            i54 = 1704031554;
                                        } else {
                                            iM113013 = (C19806.m45029("֫ۢ") ^ i52) * (-31);
                                            i53 = ((iM113013 ^ i51) * 28665) ^ (-307842869);
                                            i54 = 1678625164;
                                        }
                                        break;
                                    case 926127833:
                                    case 1548025953:
                                        return;
                                    default:
                                        C2477.m7593();
                                        C0216.m1591();
                                        iM113013 = (ThreadFactoryC3888.m11306("ܶۗ") + i51) * 35;
                                        i53 = ((iM113013 ^ i52) * (-8893)) ^ (-212060480);
                                        i54 = 762126223;
                                        break;
                                }
                            }
                        }

                        /* JADX WARN: Code duplicated, block: B:34:0x00e6 A[PHI: r5 r11
                          0x00e6: PHI (r5v4 java.lang.String) = 
                          (r5v2 java.lang.String)
                          (r5v3 java.lang.String)
                          (r5v2 java.lang.String)
                          (r5v2 java.lang.String)
                          (r5v2 java.lang.String)
                         binds: [B:33:0x00e4, B:29:0x00c5, B:18:0x007e, B:16:0x007b, B:102:0x00e6] A[DONT_GENERATE, DONT_INLINE]
                          0x00e6: PHI (r11v4 int) = (r11v3 int), (r11v2 int), (r11v2 int), (r11v2 int), (r11v2 int) binds: [B:33:0x00e4, B:29:0x00c5, B:18:0x007e, B:16:0x007b, B:102:0x00e6] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:61:0x0223 A[PHI: r12
                          0x0223: PHI (r12v4 short) = (r12v3 short), (r12v2 short), (r12v2 short) binds: [B:60:0x0221, B:16:0x007b, B:101:0x0223] A[DONT_GENERATE, DONT_INLINE]] */
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i50) {
                            int iM450220;
                            int i51;
                            short[] sArr16;
                            int iM113013;
                            int i52;
                            int i53;
                            int iM450221;
                            int i54;
                            int i55;
                            String strM8640;
                            int i56;
                            DialogInterfaceOnClickListenerC15563 dialogInterfaceOnClickListenerC15563 = this;
                            int i57 = 570888351;
                            int i58 = C1668.f6641;
                            int i59 = C3535.f13026;
                            int iM113014 = ThreadFactoryC3888.m11306("ۡ֨") ^ i59;
                            int i60 = ((iM113014 ^ i58) * (-26513)) ^ 1267613020;
                            int i61 = iM113014 ^ (-291038381);
                            String str2 = null;
                            short[] sArr17 = null;
                            short[] sArr18 = null;
                            short[] sArr19 = null;
                            int i62 = 0;
                            boolean z = false;
                            int i63 = 0;
                            int i64 = 0;
                            short s3 = 0;
                            int i65 = 0;
                            int i66 = 0;
                            int i67 = 0;
                            short s4 = 0;
                            String strM9788 = null;
                            InterfaceC17314 interfaceC17314M5517 = null;
                            String strM8470 = null;
                            String strM6674 = null;
                            while (true) {
                                i57 = i61 ^ (i60 & (((i57 ^ i58) * 4851) >> 31));
                                switch (i57) {
                                    case -2125375359:
                                    case 249391268:
                                        int i68 = s4 + s3;
                                        if ((i68 * i68) - i67 <= 0) {
                                            iM450221 = C19806.m45029("ۜ֫") ^ i59;
                                            i54 = ((iM450221 ^ i58) * (-29567)) ^ 645700001;
                                            i55 = -1375948436;
                                        } else {
                                            iM450221 = (i59 - ThreadFactoryC3888.m11306("۫ᩳ")) * (-17);
                                            i54 = ((iM450221 ^ i58) * 24441) ^ (-1277018245);
                                            i55 = -541149464;
                                        }
                                        i61 = iM450221 ^ i55;
                                        i60 = i54;
                                        break;
                                    case -1878813068:
                                    case -471626350:
                                        strM6674 = C2124.m6674(C3743.m10961(c109414));
                                        if (C3660.m10786(strM6674)) {
                                            iM450221 = ThreadFactoryC3888.m11306("ᩳۡ") ^ i58;
                                            i54 = ((iM450221 ^ i59) * 17477) ^ 1182376375;
                                            i55 = 1387018569;
                                        } else {
                                            iM450221 = ThreadFactoryC3888.m11306("ۨ۠") ^ i58;
                                            i54 = ((iM450221 ^ i59) * 21533) ^ (-1098920049);
                                            i55 = -1647659451;
                                        }
                                        i61 = iM450221 ^ i55;
                                        i60 = i54;
                                        break;
                                    case -1851910483:
                                    case 1191017800:
                                        strM8470 = C2788.m8470(sArr18, i66, i63, i65);
                                        if (C3722.m10902(strM6674, strM8470)) {
                                            str2 = strM6674;
                                            iM450221 = ThreadFactoryC3888.m11306("֫᩷") ^ i59;
                                            i54 = ((iM450221 ^ i58) * 9139) ^ (-1206381343);
                                            i55 = 1397899039;
                                        } else {
                                            iM450221 = ThreadFactoryC3888.m11306("ᩳ᩷") ^ i58;
                                            i54 = ((iM450221 ^ i59) * (-16779)) ^ (-301922165);
                                            i55 = 1435223995;
                                        }
                                        i61 = iM450221 ^ i55;
                                        i60 = i54;
                                        break;
                                    case -1848591384:
                                    case 213707038:
                                        if (C2704.f10408) {
                                            iM450221 = (C19806.m45029("᩷ᩳ") + i59) * 79;
                                            i54 = ((iM450221 ^ i58) * 6421) ^ 1409855927;
                                            i55 = -721047982;
                                        } else {
                                            iM450221 = C19806.m45029("ۛܿ") ^ i59;
                                            i54 = ((iM450221 ^ i58) * 26657) ^ (-878185194);
                                            i55 = 1892326731;
                                        }
                                        i61 = iM450221 ^ i55;
                                        i60 = i54;
                                        break;
                                    case -1797088190:
                                    case 791313040:
                                        C0526.m2437();
                                        MenuItemOnMenuItemClickListenerC3244.m9701();
                                        break;
                                    case -1758291267:
                                    case 1587055792:
                                        s3 = 16306;
                                        if (C0817.f3443) {
                                            iM450221 = C19806.m45029("᩺᩻") ^ i58;
                                            i54 = ((iM450221 ^ i59) * 22395) ^ 412510366;
                                            i55 = -1717253254;
                                        } else {
                                            iM450221 = (C19806.m45029("᩷ᩳ") + i59) * 79;
                                            i54 = ((iM450221 ^ i58) * 6421) ^ 1409855927;
                                            i55 = -721047982;
                                        }
                                        i61 = iM450221 ^ i55;
                                        i60 = i54;
                                        break;
                                    case -1696934750:
                                    case 1110592807:
                                        C1937.m6279();
                                        C0817.m3399();
                                        iM450221 = C19806.m45029("ۛܿ") ^ i59;
                                        i54 = ((iM450221 ^ i58) * 26657) ^ (-878185194);
                                        i55 = 1892326731;
                                        i61 = iM450221 ^ i55;
                                        i60 = i54;
                                        break;
                                    case -1671861666:
                                    case -1320682069:
                                        if (RunnableC0195.m1431()) {
                                            iM450220 = (i58 - C19806.m45029("᩻ۗ")) * 71;
                                            i60 = ((iM450220 ^ i59) * (-1485)) ^ (-1225769218);
                                            i51 = 345263548;
                                        } else {
                                            iM450220 = C19806.m45029("۫֨") ^ i58;
                                            i60 = ((iM450220 ^ i59) * 30757) ^ (-1455343545);
                                            i51 = 111840106;
                                        }
                                        i61 = iM450220 ^ i51;
                                        dialogInterfaceOnClickListenerC15563 = this;
                                        break;
                                    case -1663473454:
                                    case -233023684:
                                        i65 = 14230;
                                        iM450221 = (i58 - C19806.m45029("᩵᩺")) * (-21);
                                        i54 = ((iM450221 ^ i59) * 20137) ^ (-706383889);
                                        i55 = 53713930;
                                        i61 = iM450221 ^ i55;
                                        i60 = i54;
                                        break;
                                    case -1416933140:
                                    case -528577664:
                                        int i69 = i62 + 265885636;
                                        i67 = i69 + i69;
                                        if (C2124.f7782 > 0) {
                                            iM450221 = ThreadFactoryC3888.m11306("۠֨") ^ i58;
                                            i54 = ((iM450221 ^ i59) * (-26851)) ^ 1116845093;
                                            i55 = -907887897;
                                            i61 = iM450221 ^ i55;
                                            i60 = i54;
                                        } else {
                                            iM450220 = C19806.m45029("۫֨") ^ i58;
                                            i60 = ((iM450220 ^ i59) * 30757) ^ (-1455343545);
                                            i51 = 111840106;
                                            i61 = iM450220 ^ i51;
                                            dialogInterfaceOnClickListenerC15563 = this;
                                        }
                                        break;
                                    case -1310194514:
                                    case -647515215:
                                        C2249.m6906(C1398.m4894(interfaceC17314M5517, strM9788, str2));
                                        z = true;
                                        if (C3722.f13525 > 0) {
                                            iM450221 = (C19806.m45029("ܺܿ") ^ i58) * (-65);
                                            i54 = ((iM450221 ^ i59) * (-27107)) ^ 553801329;
                                            i55 = -187317070;
                                            i61 = iM450221 ^ i55;
                                            i60 = i54;
                                        } else {
                                            i56 = i62;
                                            int iM450222 = (i59 - C19806.m45029("ۘ֨")) * (-11);
                                            i61 = iM450222 ^ 469645194;
                                            i62 = i56;
                                            i60 = ((iM450222 ^ i58) * (-25985)) ^ (-667270086);
                                            dialogInterfaceOnClickListenerC15563 = this;
                                        }
                                        break;
                                    case -1305761285:
                                    case 232186672:
                                        strM9788 = C3286.m9788(sArr19, i64, 17, i65);
                                        if (C2704.f10408) {
                                            iM450221 = (C19806.m45029("ۧۖ") ^ i59) * (-71);
                                            i54 = ((iM450221 ^ i58) * (-25815)) ^ 487909176;
                                            i55 = -649485570;
                                        } else {
                                            iM450221 = C19806.m45029("ۛܿ") ^ i59;
                                            i54 = ((iM450221 ^ i58) * 26657) ^ (-878185194);
                                            i55 = 1892326731;
                                        }
                                        i61 = iM450221 ^ i55;
                                        i60 = i54;
                                        break;
                                    case -1239264164:
                                    case 2106767281:
                                        i65 = 54742;
                                        iM450221 = (i58 - C19806.m45029("᩵᩺")) * (-21);
                                        i54 = ((iM450221 ^ i59) * 20137) ^ (-706383889);
                                        i55 = 53713930;
                                        i61 = iM450221 ^ i55;
                                        i60 = i54;
                                        break;
                                    case -1024301760:
                                    case 1070447615:
                                        strM8640 = ViewTreeObserverOnPreDrawListenerC3327.m9865(strM6674, strM8470);
                                        str2 = strM8640;
                                        iM450221 = ThreadFactoryC3888.m11306("֫᩷") ^ i59;
                                        i54 = ((iM450221 ^ i58) * 9139) ^ (-1206381343);
                                        i55 = 1397899039;
                                        i61 = iM450221 ^ i55;
                                        i60 = i54;
                                        break;
                                    case -975835368:
                                    case 1880396201:
                                        strM8640 = C2871.m8640(f50621, 2, 68, i65);
                                        str2 = strM8640;
                                        iM450221 = ThreadFactoryC3888.m11306("֫᩷") ^ i59;
                                        i54 = ((iM450221 ^ i58) * 9139) ^ (-1206381343);
                                        i55 = 1397899039;
                                        i61 = iM450221 ^ i55;
                                        i60 = i54;
                                        break;
                                    case -975791110:
                                    case -913648588:
                                        s4 = sArr17[0];
                                        i56 = s4 * s4;
                                        if (C1398.f5802 > 0) {
                                            int iM113015 = (i59 - ThreadFactoryC3888.m11306("۠ۘ")) * 51;
                                            i54 = ((iM113015 ^ i58) * 13763) ^ (-1630053150);
                                            i61 = iM113015 ^ (-1307871447);
                                            dialogInterfaceOnClickListenerC15563 = this;
                                            i62 = i56;
                                            i60 = i54;
                                        } else {
                                            int iM450223 = (i59 - C19806.m45029("ۘ֨")) * (-11);
                                            i61 = iM450223 ^ 469645194;
                                            i62 = i56;
                                            i60 = ((iM450223 ^ i58) * (-25985)) ^ (-667270086);
                                            dialogInterfaceOnClickListenerC15563 = this;
                                        }
                                        break;
                                    case -287871730:
                                    case 1791532699:
                                        i64 = 70;
                                        if (C0278.f1572 <= 0) {
                                            iM450221 = C19806.m45029("ۛܿ") ^ i59;
                                            i54 = ((iM450221 ^ i58) * 26657) ^ (-878185194);
                                            i55 = 1892326731;
                                        } else {
                                            iM450221 = ThreadFactoryC3888.m11306("ۗ᩷") ^ i59;
                                            i54 = ((iM450221 ^ i58) * 21489) ^ 1689457867;
                                            i55 = 1379283375;
                                        }
                                        i61 = iM450221 ^ i55;
                                        i60 = i54;
                                        break;
                                    case -247103435:
                                    case 179340834:
                                        sArr18 = f50621;
                                        i66 = 1;
                                        i63 = 1;
                                        if (C0216.f1393 == 0) {
                                            iM450221 = ThreadFactoryC3888.m11306("᩶ۡ") ^ i59;
                                            i54 = ((iM450221 ^ i58) * 4233) ^ 779789670;
                                            i55 = -830664295;
                                            i61 = iM450221 ^ i55;
                                            i60 = i54;
                                        } else {
                                            sArr16 = sArr17;
                                            iM113013 = (i58 - C19806.m45029("ܿۨ")) * 47;
                                            i52 = ((iM113013 ^ i59) * (-13801)) ^ (-2142665102);
                                            i53 = 928434362;
                                            i61 = iM113013 ^ i53;
                                            sArr17 = sArr16;
                                            i60 = i52;
                                            dialogInterfaceOnClickListenerC15563 = this;
                                        }
                                        break;
                                    case -202430175:
                                    case -131061840:
                                        C1937.m6279();
                                        if (C1937.f7317 >= 0) {
                                            iM450220 = C19806.m45029("۫֨") ^ i58;
                                            i60 = ((iM450220 ^ i59) * 30757) ^ (-1455343545);
                                            i51 = 111840106;
                                            i61 = iM450220 ^ i51;
                                            dialogInterfaceOnClickListenerC15563 = this;
                                        } else {
                                            iM450221 = C19806.m45029("ۛܿ") ^ i59;
                                            i54 = ((iM450221 ^ i58) * 26657) ^ (-878185194);
                                            i55 = 1892326731;
                                            i61 = iM450221 ^ i55;
                                            i60 = i54;
                                        }
                                        break;
                                    case -90640111:
                                    case 2107214551:
                                        if (!C1668.m5583()) {
                                            sArr16 = sArr17;
                                            iM113013 = (i58 - C19806.m45029("ܿۨ")) * 47;
                                            i52 = ((iM113013 ^ i59) * (-13801)) ^ (-2142665102);
                                            i53 = 928434362;
                                            i61 = iM113013 ^ i53;
                                            sArr17 = sArr16;
                                            i60 = i52;
                                            dialogInterfaceOnClickListenerC15563 = this;
                                        } else {
                                            iM450221 = (C19806.m45029("᩷ᩳ") + i59) * 79;
                                            i54 = ((iM450221 ^ i58) * 6421) ^ 1409855927;
                                            i55 = -721047982;
                                            i61 = iM450221 ^ i55;
                                            i60 = i54;
                                        }
                                        break;
                                    case 162281616:
                                    case 2128034068:
                                        C0629.m2915(checkBox2, z);
                                        break;
                                    case 379994953:
                                    case 1677251881:
                                        sArr16 = f50621;
                                        if (C1066.m4023() <= 0) {
                                            iM113013 = (i58 - C19806.m45029("ܿۨ")) * 47;
                                            i52 = ((iM113013 ^ i59) * (-13801)) ^ (-2142665102);
                                            i53 = 928434362;
                                        } else {
                                            iM113013 = (ThreadFactoryC3888.m11306("֨᩻") ^ i59) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                            i52 = ((iM113013 ^ i58) * (-27585)) ^ 1360750035;
                                            i53 = 408584712;
                                        }
                                        i61 = iM113013 ^ i53;
                                        sArr17 = sArr16;
                                        i60 = i52;
                                        dialogInterfaceOnClickListenerC15563 = this;
                                        break;
                                    default:
                                        interfaceC17314M5517 = CallableC1627.m5517(ApplicationC0716.f2992);
                                        sArr19 = f50621;
                                        if (RunnableC1606.m5473() == 0) {
                                            iM450221 = ThreadFactoryC3888.m11306("ᩴ۟") ^ i58;
                                            i54 = ((iM450221 ^ i59) * 26017) ^ 1717000158;
                                            i55 = -38713105;
                                            i61 = iM450221 ^ i55;
                                            i60 = i54;
                                        } else {
                                            i56 = i62;
                                            int iM450224 = (i59 - C19806.m45029("ۘ֨")) * (-11);
                                            i61 = iM450224 ^ 469645194;
                                            i62 = i56;
                                            i60 = ((iM450224 ^ i58) * (-25985)) ^ (-667270086);
                                            dialogInterfaceOnClickListenerC15563 = this;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    };
                    sArr5 = f3035;
                    if (!C3286.f12186) {
                        int iM450220 = (i14 - C19806.m45029("ۚܰ")) * (-15);
                        i17 = iM450220 ^ (-2004570390);
                        c109410 = c109414;
                        i16 = ((iM450220 ^ i15) * 31585) ^ (-722289602);
                        checkBox2 = checkBox;
                    } else {
                        i22 = i22;
                        i23 = i23;
                        sArr2 = sArr2;
                        c109410 = c109414;
                        sArr6 = sArr6;
                        sArr5 = sArr5;
                        main = main;
                        int i2120 = i21;
                        sArr7 = sArr7;
                        i20 = i20;
                        i3 = i2120;
                        iM11307 = C19806.m45029("۟ܰ") ^ i14;
                        i16 = ((iM11307 ^ i15) * (-25583)) ^ 426029633;
                        i4 = -514305992;
                        i7 = iM11307 ^ i4;
                        c109410 = c109410;
                        main = main;
                        strM5047 = strM5047;
                        interfaceC6025 = interfaceC6025;
                        sArr5 = sArr5;
                        sArr6 = sArr6;
                        sArr2 = sArr2;
                        i23 = i23;
                        i22 = i22;
                        i17 = i7;
                        checkBox2 = checkBox;
                        int i21111 = i3;
                        i20 = i20;
                        sArr7 = sArr7;
                        i21 = i21111;
                    }
                    break;
                case 309220685:
                case 705659891:
                    C10634.m26823(c8067M5356, C19806.m45029(RunnableC1895.m6164(sArr4, i24, 3, i18)) ^ 2121353789, dialogInterfaceOnClickListenerC16572);
                    CallableC1627.m5514(c8067M5356);
                    break;
                case 594834937:
                case 675069674:
                    short[] sArr16 = sArr2;
                    View viewM10957 = C3743.m10957(viewM4976, ThreadFactoryC3888.m11306(C3743.m10964(sArr16, 251, 3, i18)) ^ 2097392277);
                    int iM113013 = ThreadFactoryC3888.m11306("ᩴ۫") ^ i15;
                    i17 = iM113013 ^ 2023097927;
                    c109410 = c109410;
                    i16 = ((iM113013 ^ i14) * 21013) ^ (-1472052357);
                    checkBox2 = checkBox;
                    sArr2 = sArr16;
                    view = viewM10957;
                    break;
                case 595357541:
                case 609194702:
                    short[] sArr17 = sArr6;
                    short[] sArr18 = sArr5;
                    C7105.m18993(C2642.m8167(viewM4976, C19806.m45029(strM3009) ^ 2100494145), viewOnClickListenerC22734);
                    int iM450221 = (i15 - C19806.m45029("᩶ۧ")) * (-113);
                    int i50 = ((iM450221 ^ i14) * 1473) ^ (-139656021);
                    i17 = iM450221 ^ (-482960094);
                    checkBox2 = checkBox;
                    c109410 = c109410;
                    i16 = i50;
                    sArr5 = sArr18;
                    sArr6 = sArr17;
                    sArr2 = sArr2;
                    i23 = i23;
                    i22 = i22;
                    break;
                case 892527903:
                case 1603976611:
                    i22 = i22;
                    i23 = i23;
                    sArr2 = sArr2;
                    c10949 = c109410;
                    sArr6 = sArr6;
                    sArr5 = sArr5;
                    c10949.mo17029(c10949.m16842());
                    viewOnClickListenerC22734 = new ViewOnClickListenerC22734(1, c10949);
                    sArr7 = f3035;
                    i20 = 239;
                    i21 = 3;
                    iM11308 = (ThreadFactoryC3888.m11306("ܶܰ") ^ i14) * (-115);
                    i9 = ((iM11308 ^ i15) * (-27845)) ^ (-109616077);
                    i10 = -1828316767;
                    i11 = iM11308 ^ i10;
                    c109410 = c10949;
                    i16 = i9;
                    sArr5 = sArr5;
                    sArr6 = sArr6;
                    sArr2 = sArr2;
                    i23 = i23;
                    i22 = i22;
                    i17 = i11;
                    checkBox2 = checkBox;
                    break;
                default:
                    RunnableC0195.m1431();
                    if (!C19806.f63586) {
                        interfaceC6025 = interfaceC6025;
                        i22 = i22;
                        i23 = i23;
                        sArr2 = sArr2;
                        c109410 = c109410;
                        sArr6 = sArr6;
                        sArr5 = sArr5;
                        strM5047 = strM5047;
                        main = main;
                        int i314 = i21;
                        sArr7 = sArr7;
                        i20 = i20;
                        i3 = i314;
                        iM11307 = ThreadFactoryC3888.m11306("֫ܰ") ^ i15;
                        i16 = ((iM11307 ^ i14) * (-18327)) ^ (-2054868800);
                        i4 = 628678056;
                        i7 = iM11307 ^ i4;
                        c109410 = c109410;
                        main = main;
                        strM5047 = strM5047;
                        interfaceC6025 = interfaceC6025;
                        sArr5 = sArr5;
                        sArr6 = sArr6;
                        sArr2 = sArr2;
                        i23 = i23;
                        i22 = i22;
                        i17 = i7;
                        checkBox2 = checkBox;
                        int i21112 = i3;
                        i20 = i20;
                        sArr7 = sArr7;
                        i21 = i21112;
                    } else {
                        iM11306 = (C19806.m45029("ۤ֫") + i14) * (-115);
                        i = ((iM11306 ^ i15) * (-12571)) ^ (-874709491);
                        i2 = -1346501436;
                        i17 = iM11306 ^ i2;
                        i16 = i;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x01ee A[PHI: r1 r10 r16
      0x01ee: PHI (r1v4 l.ۛۧ᩺) = (r1v2 l.ۛۧ᩺), (r1v3 l.ۛۧ᩺), (r1v2 l.ۛۧ᩺), (r1v2 l.ۛۧ᩺) binds: [B:57:0x01ec, B:34:0x010f, B:17:0x0076, B:12:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x01ee: PHI (r10v4 short[]) = (r10v2 short[]), (r10v3 short[]), (r10v2 short[]), (r10v2 short[]) binds: [B:57:0x01ec, B:34:0x010f, B:17:0x0076, B:12:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x01ee: PHI (r16v22 int) = (r16v5 int), (r16v13 int), (r16v20 int), (r16v23 int) binds: [B:57:0x01ec, B:34:0x010f, B:17:0x0076, B:12:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x0222 A[PHI: r7 r8 r12 r16
      0x0222: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int) binds: [B:61:0x0220, B:45:0x0189, B:26:0x00cd, B:9:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x0222: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:61:0x0220, B:45:0x0189, B:26:0x00cd, B:9:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x0222: PHI (r12v4 int) = (r12v2 int), (r12v2 int), (r12v3 int), (r12v2 int) binds: [B:61:0x0220, B:45:0x0189, B:26:0x00cd, B:9:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x0222: PHI (r16v24 int) = (r16v4 int), (r16v8 int), (r16v16 int), (r16v29 int) binds: [B:61:0x0220, B:45:0x0189, B:26:0x00cd, B:9:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0255 A[PHI: r5 r16
      0x0255: PHI (r5v5 short) = (r5v2 short), (r5v3 short), (r5v2 short) binds: [B:65:0x0253, B:53:0x01cb, B:8:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x0255: PHI (r16v27 int) = (r16v3 int), (r16v6 int), (r16v28 int) binds: [B:65:0x0253, B:53:0x01cb, B:8:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x028c A[PHI: r3 r4 r6 r11 r16
      0x028c: PHI (r3v4 short[]) = (r3v3 short[]), (r3v2 short[]), (r3v2 short[]) binds: [B:69:0x028a, B:49:0x01a8, B:30:0x00ec] A[DONT_GENERATE, DONT_INLINE]
      0x028c: PHI (r4v4 char) = (r4v3 char), (r4v2 char), (r4v2 char) binds: [B:69:0x028a, B:49:0x01a8, B:30:0x00ec] A[DONT_GENERATE, DONT_INLINE]
      0x028c: PHI (r6v4 int) = (r6v2 int), (r6v3 int), (r6v2 int) binds: [B:69:0x028a, B:49:0x01a8, B:30:0x00ec] A[DONT_GENERATE, DONT_INLINE]
      0x028c: PHI (r11v3 int) = (r11v2 int), (r11v2 int), (r11v4 int) binds: [B:69:0x028a, B:49:0x01a8, B:30:0x00ec] A[DONT_GENERATE, DONT_INLINE]
      0x028c: PHI (r16v14 int) = (r16v2 int), (r16v7 int), (r16v15 int) binds: [B:69:0x028a, B:49:0x01a8, B:30:0x00ec] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0054, code lost:
    
        if (l.C0278.f1572 > 0) goto L12;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m3214() {
        /*
            Method dump skipped, instruction units count: 868
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC0744.m3214():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0066, code lost:
    
        if (l.C3722.f13525 > 0) goto L14;
     */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m3224() {
        /*
            Method dump skipped, instruction units count: 912
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC0744.m3224():java.lang.String");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m3228(ViewOnClickListenerC0744 viewOnClickListenerC0744) {
        C10948 c10948 = null;
        InterfaceC2916 interfaceC2916M8158 = null;
        String strM3407 = null;
        int i = -580575268;
        int i2 = C1189.f5284;
        int i3 = C1460.f5948;
        int iM45029 = (C19806.m45029("ܺܶ") ^ i3) * (-39);
        int i4 = ((iM45029 ^ i2) * (-32637)) ^ (-466377723);
        int i5 = -222975198;
        while (true) {
            i = ((((i ^ i2) * (-7065)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2126624196:
                case -1306306600:
                    c10948 = viewOnClickListenerC0744.f3037;
                    if (C0216.f1393 != 0) {
                        iM45029 = C19806.m45029("ۙ֨") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-7245)) ^ (-745150691);
                        i5 = -2045019759;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("֡ۡ")) * (-103);
                        i4 = ((iM45029 ^ i2) * 581) ^ (-1567525112);
                        i5 = -2022486382;
                    }
                    break;
                case -1796436870:
                case -874207935:
                    if (!C0962.f3784) {
                        iM45029 = C19806.m45029("ۙ֨") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-7245)) ^ (-745150691);
                        i5 = -2045019759;
                    } else {
                        iM45029 = (C19806.m45029("۫ܰ") ^ i2) * 13;
                        i4 = ((iM45029 ^ i3) * (-9287)) ^ (-147799218);
                        i5 = -927819981;
                    }
                    break;
                case -1177704774:
                case 730911596:
                    C2642.m8171();
                    C1025.m3861();
                    iM45029 = C19806.m45029("ۙ֨") ^ i3;
                    i4 = ((iM45029 ^ i2) * (-7245)) ^ (-745150691);
                    i5 = -2045019759;
                    break;
                case -1135975436:
                case 1179217039:
                    if (C3535.f13026 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۚۖ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 1247) ^ (-464036045);
                        i5 = 1540797025;
                    } else {
                        iM45029 = C19806.m45029("ܽۗ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-17617)) ^ 155286394;
                        i5 = 744748510;
                    }
                    break;
                case -615418252:
                case 195710936:
                    C0962.m3746();
                    if (!C0629.m2907()) {
                        iM45029 = (C19806.m45029("۫ܰ") ^ i2) * 13;
                        i4 = ((iM45029 ^ i3) * (-9287)) ^ (-147799218);
                        i5 = -927819981;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۠ۙ") ^ i3) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM45029 ^ i2) * 9095) ^ 600781867;
                        i5 = 777404672;
                    }
                    break;
                case -537617483:
                case -509658151:
                    if (C7105.f23796 >= 0) {
                        iM45029 = (C19806.m45029("ۚۨ") + i2) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM45029 ^ i3) * (-8867)) ^ 1211117793;
                        i5 = -897261709;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۗۡ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 13803) ^ 232944977;
                        i5 = -1727143298;
                    }
                    break;
                case -380927323:
                case 23845883:
                    if (C1398.m4895() <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("۠ۙ") ^ i3) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM45029 ^ i2) * 9095) ^ 600781867;
                        i5 = 777404672;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۬ܶ") ^ i2) * 13;
                        i4 = ((iM45029 ^ i3) * 24355) ^ (-1093385863);
                        i5 = -2032092270;
                    }
                    break;
                case -92370593:
                case 991361804:
                    if (C3535.f13026 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۚۖ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 1247) ^ (-464036045);
                        i5 = 1540797025;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֡ۧ") + i2) * (-59);
                        i4 = ((iM45029 ^ i3) * 29557) ^ 346484052;
                        i5 = -467220993;
                    }
                    break;
                case -72380980:
                case 642960465:
                    if (C1148.f5161 <= 0) {
                        iM45029 = (C19806.m45029("ۚۨ") + i2) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM45029 ^ i3) * (-8867)) ^ 1211117793;
                        i5 = -897261709;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۖۜ") ^ i3) * 115;
                        i4 = ((iM45029 ^ i2) * 17315) ^ 211179207;
                        i5 = 1824637118;
                    }
                    break;
                case 281611329:
                case 727863156:
                    strM3407 = C0817.m3407(interfaceC2916M8158);
                    if (RunnableC1895.f7152) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ܳۢ")) * (-103);
                        i4 = ((iM45029 ^ i2) * 2197) ^ 1200167893;
                        i5 = 651805330;
                    } else {
                        iM45029 = (C19806.m45029("ۚۨ") + i2) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM45029 ^ i3) * (-8867)) ^ 1211117793;
                        i5 = -897261709;
                    }
                    break;
                case 300770159:
                case 896793645:
                    if (C3577.m10565()) {
                        iM45029 = C19806.m45029("۬ۨ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 28185) ^ (-66685232);
                        i5 = 510185877;
                    } else {
                        iM45029 = C19806.m45029("ۙ֨") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-7245)) ^ (-745150691);
                        i5 = -2045019759;
                    }
                    break;
                case 449650670:
                case 1874700010:
                    interfaceC2916M8158 = C2642.m8158(c10948);
                    if (RunnableC0195.m1431()) {
                        iM45029 = C19806.m45029("ۚܶ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 26751) ^ 1265066576;
                        i5 = 1529097945;
                    } else {
                        iM45029 = (C19806.m45029("۫ܰ") ^ i2) * 13;
                        i4 = ((iM45029 ^ i3) * (-9287)) ^ (-147799218);
                        i5 = -927819981;
                    }
                    break;
                case 496304477:
                case 1526000222:
                    RunnableC0195.m1442(new C21206(viewOnClickListenerC0744, strM3407));
                    break;
                case 621283868:
                case 1545971925:
                    if (C2871.f10837 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۚۖ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 1247) ^ (-464036045);
                        i5 = 1540797025;
                    } else {
                        iM45029 = (C19806.m45029("֡۬") ^ i3) * (-27);
                        i4 = ((iM45029 ^ i2) * (-26815)) ^ 155919084;
                        i5 = 777798404;
                    }
                    break;
                case 1005555821:
                case 1645028808:
                    C0526.m2437();
                    break;
                default:
                    if (RunnableC0195.f1321 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۚۖ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 1247) ^ (-464036045);
                        i5 = 1540797025;
                    } else {
                        iM45029 = C19806.m45029("ۙ֨") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-7245)) ^ (-745150691);
                        i5 = -2045019759;
                    }
                    break;
            }
            return;
        }
    }
}
