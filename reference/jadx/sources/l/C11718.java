package l;

import android.graphics.Point;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.alipay.sdk.m.y.q;
import com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment;
import com.google.android.material.slider.BaseSlider;
import com.umeng.analytics.pro.o;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.math.ec.custom.sec.SecP256K1Field;

/* JADX INFO: renamed from: l.ۨ۬ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51KR */
/* JADX INFO: loaded from: classes.dex */
public class C11718 extends AbstractC22611 implements InterfaceC19601, InterfaceC3976, InterfaceC18088 {

    /* JADX INFO: renamed from: ۨ᩹ܽ, reason: not valid java name and contains not printable characters */
    private static final short[] f39370;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public int f39371;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C18895 f39372;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public View f39373;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public TextView f39374;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public C6382 f39375;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f39376;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public ViewOnClickListenerC0201 f39377;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C6111 f39378;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public String f39379;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C15267 f39380;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C20556 f39381;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public AbstractC3492 f39382;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f39383;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public TextView f39384;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public boolean f39385;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f39386;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public C18377 f39387;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f39388;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C6094 f39389;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public boolean f39390;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public boolean f39391;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f39392;

    static {
        ApplicationC6132.m17119(UMErrorCode.E_UM_BE_RAW_OVERSIZE);
        f39370 = new short[]{9463, -4322, 15829, 9875, 6417, 24679, 3720, -5305, -4517, 24592, 7461, -31629, -31630, -31633, -31672, -31629, -31630, -31628, -31624, -31622, -31641, -31618, -31621, -31630, -31672, -31630, -31623, -31632, -31618, -31623, -31630, -31689, -31686, -31689, -31705, -31622, -31644, -31715, -31688, -31688, -31715, -31715, -31688, -31683, -31689, -31689, -31683, -31688, -31715, -31688, -31688, -31715, -31688, -31688, -31689, -31661, -31630, -31628, -31624, -31622, -31641, -31618, -31621, -31630, -31629, -31689, -31627, -31634, -31689, 3400, 5952, 5953, 5980, 6011, 5952, 5953, 5959, 5963, 5961, 5972, 5965, 5960, 5953, 6011, 5953, 5962, 5955, 5965, 5962, 5953, 5516, -16822, -25752, -16822, -16828, -16828, -16828, -16822, -16830, -16829, 2127, -30716, -30715, -30696, -30657, -30716, -30715, -30717, -30705, -30707, -30704, -30711, -30708, -30715, -30657, -30715, -30706, -30713, -30711, -30706, -30715, -30707, -30715, -30700, -30712, -30705, -30716, -30667, -30706, -30709, -30706, -30705, -30697, -30706, -30656, -30715, -30702, -30702, -30705, -30702, 1727, -4410, 8052, -30685, -30719, -30706, -30656, -30706, -30705, -30700, -30656, -30714, -30711, -30706, -30716, -30656, -30707, -30715, -30700, -30712, -30705, -30716, -30630, -30656, -30641, -30641, -30614, -30641, -30641, -30656, -30684, -30715, -30717, -30705, -30707, -30704, -30711, -30708, -30715, -30716, -30656, -30718, -30695, -30656, -30656, -30643, -30656, -30707, -30701, -30614, -30641, -30641, -30614, -30614, -30641, -30646, -30656, -30656, -30646, -30641, -30614, 9364, 29530, 24700, 25394, 27240, -19628, 30150, 1757, 26108, -21299, -22378, 6645, -971, 362, 7094, 13010, 4333, 2515, 27085, 27077, 27092, 27080, 27087, 27076, -4176, 15241, 5271, 1390, 5307, 2497, 14089, 1076, 15271, 6523, 15457, 2385, -1511, 3162, 619, 27022, 27082, 27073, 27094, 27073, -6874, -933, 12680, 9796, 3199, -3628, -3545, 6687, 3685, 1489, -1291, -7996, 14041, -647, 4100, 4363, -11963, -1525, -2111, -8933, -16292, 8663, -9866, 8638, -1375, -10858, 9680, 10612, -1204, -1623, -8578, -23917, -23918, -23905, -23934, -23895, -23935, -23911, -23932, -23918, -23895, -23935, -23932, -23913, -23930, -23895, -23908, -23913, -23936, -23913, 7099, -6146, -6154, -6169, -6149, -6148, -6153, -6211, -6151, -6158, -6171, -6158, -6211, 9041, 30512, 30542, 30479, 30539, 30534, 30539, 30542, 30479, 30518, 30539, 30545, 30539, 30542, 30488, 2422, -28677, -28684, -28679, -28693, -28693, -28696, -28679, -28692, -28688, -28683, -28675, -28692, -28688, -28681, -28676, -28693, -28675, -28684, -28675, -28677, -28692, -28675, -28676, -28719, -28682, -28682, -28675, -28694, -28709, -28684, -28679, -28693, -28693, -28675, -28693, 7849, -6825, -6847, -6840, -6847, -6841, -6832, -6847, -6848, -6803, -6838, -6838, -6847, -6826, -6809, -6840, -6843, -6825, -6825, -6847, -6825, 1024, -10375, -10385, -10394, -10385, -10391, -10370, -10385, -10386, -10429, -10396, -10396, -10385, -10376, -10423, -10394, -10389, -10375, -10375, -10385, -10375, 7400, -32500, -32509, -32498, -32484, -32484, -32481, -32498, -32485, -32505, 9900, -12103, 12282, 14104, 8471, -6492, -6507, -6520, -6524, -6448, -6525, -6524, -6497, -6526, -6511, -6505, -6507, -6448, -6503, -6525, -6448, -6525, -6524, -6503, -6500, -6500, -6448, -6500, -6497, -6511, -6508, -6503, -6498, -6505};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public native String m29292();

    @Override // l.AbstractC22611
    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final boolean mo29300() {
        return true;
    }

    @Override // l.AbstractC22611
    /* JADX INFO: renamed from: ᩵ */
    public final boolean mo3621() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0073 A[PHI: r16
      0x0073: PHI (r16v4 java.lang.String) = (r16v2 java.lang.String), (r16v1 java.lang.String) binds: [B:20:0x0071, B:8:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x0133 A[PHI: r7
      0x0133: PHI (r7v3 int) = (r7v2 int), (r7v1 int) binds: [B:39:0x0131, B:14:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x01c5 A[PHI: r3 r4 r11
      0x01c5: PHI (r3v3 short) = (r3v1 short), (r3v2 short), (r3v1 short) binds: [B:55:0x01c3, B:47:0x018b, B:24:0x00a0] A[DONT_GENERATE, DONT_INLINE]
      0x01c5: PHI (r4v3 short) = (r4v1 short), (r4v2 short), (r4v1 short) binds: [B:55:0x01c3, B:47:0x018b, B:24:0x00a0] A[DONT_GENERATE, DONT_INLINE]
      0x01c5: PHI (r11v2 int) = (r11v1 int), (r11v1 int), (r11v3 int) binds: [B:55:0x01c3, B:47:0x018b, B:24:0x00a0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x01f8 A[PHI: r2
      0x01f8: PHI (r2v3 char) = (r2v1 char), (r2v2 char), (r2v1 char), (r2v1 char) binds: [B:59:0x01f6, B:51:0x01a9, B:11:0x004f, B:8:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0228 A[PHI: r1 r5 r6 r9 r10
      0x0228: PHI (r1v4 short[]) = (r1v3 short[]), (r1v1 short[]), (r1v1 short[]), (r1v1 short[]), (r1v1 short[]), (r1v1 short[]) binds: [B:63:0x0226, B:43:0x0167, B:28:0x00c1, B:16:0x005b, B:14:0x0057, B:11:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x0228: PHI (r5v3 int) = (r5v1 int), (r5v2 int), (r5v1 int), (r5v1 int), (r5v1 int), (r5v1 int) binds: [B:63:0x0226, B:43:0x0167, B:28:0x00c1, B:16:0x005b, B:14:0x0057, B:11:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x0228: PHI (r6v3 short) = (r6v1 short), (r6v2 short), (r6v1 short), (r6v1 short), (r6v1 short), (r6v1 short) binds: [B:63:0x0226, B:43:0x0167, B:28:0x00c1, B:16:0x005b, B:14:0x0057, B:11:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x0228: PHI (r9v3 short[]) = (r9v1 short[]), (r9v1 short[]), (r9v2 short[]), (r9v1 short[]), (r9v1 short[]), (r9v1 short[]) binds: [B:63:0x0226, B:43:0x0167, B:28:0x00c1, B:16:0x005b, B:14:0x0057, B:11:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x0228: PHI (r10v3 int) = (r10v1 int), (r10v1 int), (r10v2 int), (r10v1 int), (r10v1 int), (r10v1 int) binds: [B:63:0x0226, B:43:0x0167, B:28:0x00c1, B:16:0x005b, B:14:0x0057, B:11:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC22611
    /* JADX INFO: renamed from: ᩹ */
    public final int mo3622() {
        int iM11306;
        int i;
        int i2;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i3 = 0;
        short s3 = 0;
        int i4 = 0;
        int i5 = 0;
        short[] sArr2 = null;
        int i6 = 0;
        int i7 = 0;
        int i8 = -537640003;
        int i9 = C1189.f5284;
        int i10 = ViewTreeObserverOnPreDrawListenerC3327.f12317;
        int iM11307 = (ThreadFactoryC3888.m11306("۠ۛ") ^ i9) * (-75);
        int i11 = ((iM11307 ^ i10) * (-23393)) ^ (-1753004708);
        int i12 = iM11307 ^ (-711898693);
        String strM5047 = null;
        while (true) {
            i8 = i12 ^ (i11 & (((i8 ^ i10) * 20329) >> 31));
            switch (i8) {
                case -2123206753:
                case -295256628:
                    i4 = s + s3;
                    if (C0216.f1393 != 0) {
                        iM11306 = C19806.m45029("᩵᩺") ^ i10;
                        i = ((iM11306 ^ i9) * (-23843)) ^ 709895343;
                        i2 = -2074733991;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩺ۤ") + i9) * (-67);
                        i = ((iM11306 ^ i10) * (-14177)) ^ 314086643;
                        i2 = -52143375;
                    }
                    int i13 = i;
                    i12 = iM11306 ^ i2;
                    i11 = i13;
                    break;
                case -1929560618:
                case 1791854607:
                    sArr2 = f39370;
                    i6 = 412;
                    if (C0050.f912 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩻۬") ^ i9) * 25;
                        i = ((iM11306 ^ i10) * (-10141)) ^ 1127633977;
                        i2 = 1727883198;
                    } else {
                        iM11306 = (i9 - C19806.m45029("֡᩷")) * (-67);
                        i = ((iM11306 ^ i10) * 18389) ^ 1274475880;
                        i2 = 979262652;
                    }
                    int i14 = i;
                    i12 = iM11306 ^ i2;
                    i11 = i14;
                    break;
                case -1875588770:
                case 2146164766:
                    C1398.m4895();
                    C1460.m5050();
                    return 0;
                case -1807815318:
                case -823127959:
                    sArr = f39370;
                    if (MenuItemOnMenuItemClickListenerC3244.m9701() >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩻۬") ^ i9) * 25;
                        i = ((iM11306 ^ i10) * (-10141)) ^ 1127633977;
                        i2 = 1727883198;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩸ܶ") ^ i10;
                        i = ((iM11306 ^ i9) * 21011) ^ (-371942801);
                        i2 = -1085606493;
                    }
                    int i15 = i;
                    i12 = iM11306 ^ i2;
                    i11 = i15;
                    break;
                case -1477476045:
                case 1527865111:
                    i7 = 3;
                    if (RunnableC1564.f6300) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩺ۨ") + i10) * (-117);
                        i = ((iM11306 ^ i9) * 18303) ^ 660040625;
                        i2 = -226196282;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܺۛ") ^ i10) * (-57);
                        i = ((iM11306 ^ i9) * 16799) ^ (-996127808);
                        i2 = -568455380;
                    }
                    int i16 = i;
                    i12 = iM11306 ^ i2;
                    i11 = i16;
                    break;
                case -1424094966:
                case 404668929:
                    C19806.m45024();
                    if (C1977.f7413 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩻۬") ^ i9) * 25;
                        i = ((iM11306 ^ i10) * (-10141)) ^ 1127633977;
                        i2 = 1727883198;
                    } else {
                        iM11306 = C19806.m45029("ܺ᩻") ^ i9;
                        i = ((iM11306 ^ i10) * 163) ^ (-2000506809);
                        i2 = 1980656772;
                    }
                    int i17 = i;
                    i12 = iM11306 ^ i2;
                    i11 = i17;
                    break;
                case -976010950:
                case 105393204:
                    if (C3286.m9798() > 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩻۬") ^ i9) * 25;
                        i = ((iM11306 ^ i10) * (-10141)) ^ 1127633977;
                        i2 = 1727883198;
                    } else {
                        iM11306 = C19806.m45029("᩵᩺") ^ i10;
                        i = ((iM11306 ^ i9) * (-23843)) ^ 709895343;
                        i2 = -2074733991;
                    }
                    int i18 = i;
                    i12 = iM11306 ^ i2;
                    i11 = i18;
                    break;
                case -916918908:
                case -636837269:
                    i5 = 24492;
                    iM11306 = ThreadFactoryC3888.m11306("᩷ܿ") ^ i9;
                    i = ((iM11306 ^ i10) * (-1239)) ^ (-147173821);
                    i2 = 445122966;
                    int i19 = i;
                    i12 = iM11306 ^ i2;
                    i11 = i19;
                    break;
                case -854355601:
                case -275505973:
                    C2477.m7593();
                    C19806.m45024();
                    iM11306 = (ThreadFactoryC3888.m11306("᩻۬") ^ i9) * 25;
                    i = ((iM11306 ^ i10) * (-10141)) ^ 1127633977;
                    i2 = 1727883198;
                    int i110 = i;
                    i12 = iM11306 ^ i2;
                    i11 = i110;
                    break;
                case -821611566:
                case -92011023:
                    if (C1875.f7103 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩺ۨ") + i10) * (-117);
                        i = ((iM11306 ^ i9) * 18303) ^ 660040625;
                        i2 = -226196282;
                    } else {
                        iM11306 = (C19806.m45029("ܽ֫") ^ i10) * 67;
                        i = ((iM11306 ^ i9) * (-20993)) ^ 1276438687;
                        i2 = -596523811;
                    }
                    int i111 = i;
                    i12 = iM11306 ^ i2;
                    i11 = i111;
                    break;
                case -815888957:
                case 1904106674:
                    strM5047 = C1460.m5047(sArr2, i6, i7, i5);
                    if (C2871.f10837 >= 0) {
                        iM11306 = C19806.m45029("ۧ᩹") ^ i9;
                        i = ((iM11306 ^ i10) * (-7831)) ^ (-473608357);
                        i2 = 1750632514;
                    } else {
                        iM11306 = C19806.m45029("ܳ֨") ^ i10;
                        i = ((iM11306 ^ i9) * 9731) ^ (-1267899500);
                        i2 = -1621814307;
                    }
                    int i112 = i;
                    i12 = iM11306 ^ i2;
                    i11 = i112;
                    break;
                case -430884422:
                case 1940734349:
                    C1460.m5050();
                    if (CallableC1627.m5507() == 0) {
                        iM11306 = C19806.m45029("ܺ᩻") ^ i9;
                        i = ((iM11306 ^ i10) * 163) ^ (-2000506809);
                        i2 = 1980656772;
                    } else {
                        iM11306 = C19806.m45029("ۧ᩹") ^ i9;
                        i = ((iM11306 ^ i10) * (-7831)) ^ (-473608357);
                        i2 = 1750632514;
                    }
                    int i113 = i;
                    i12 = iM11306 ^ i2;
                    i11 = i113;
                    break;
                case -248729910:
                case 117458319:
                    c = 411;
                    if (C1025.m3861() <= 0) {
                        iM11306 = C19806.m45029("ܺ᩻") ^ i9;
                        i = ((iM11306 ^ i10) * 163) ^ (-2000506809);
                        i2 = 1980656772;
                    } else {
                        iM11306 = C19806.m45029("ۙܽ") ^ i9;
                        i = ((iM11306 ^ i10) * (-9633)) ^ (-235520595);
                        i2 = -1924917637;
                    }
                    int i114 = i;
                    i12 = iM11306 ^ i2;
                    i11 = i114;
                    break;
                case -166788210:
                case 1447299061:
                    if (C0629.m2907()) {
                        iM11306 = ThreadFactoryC3888.m11306("᩺᩹") ^ i9;
                        i = ((iM11306 ^ i10) * 30113) ^ 1717923230;
                        i2 = -1967001345;
                    } else {
                        iM11306 = C19806.m45029("ܺ᩻") ^ i9;
                        i = ((iM11306 ^ i10) * 163) ^ (-2000506809);
                        i2 = 1980656772;
                    }
                    int i115 = i;
                    i12 = iM11306 ^ i2;
                    i11 = i115;
                    break;
                case -50169906:
                case 21394553:
                    s = sArr[c];
                    s2 = 67884;
                    if (C1977.m6356()) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩺ۨ") + i10) * (-117);
                        i = ((iM11306 ^ i9) * 18303) ^ 660040625;
                        i2 = -226196282;
                    } else {
                        iM11306 = C19806.m45029("᩺᩵") ^ i9;
                        i = ((iM11306 ^ i10) * (-22439)) ^ (-1615954521);
                        i2 = 1996536910;
                    }
                    int i116 = i;
                    i12 = iM11306 ^ i2;
                    i11 = i116;
                    break;
                case 61115988:
                case 924805771:
                    i5 = 5647;
                    iM11306 = ThreadFactoryC3888.m11306("᩷ܿ") ^ i9;
                    i = ((iM11306 ^ i10) * (-1239)) ^ (-147173821);
                    i2 = 445122966;
                    int i117 = i;
                    i12 = iM11306 ^ i2;
                    i11 = i117;
                    break;
                case 121981252:
                case 776020434:
                    i3 = s * s2;
                    s3 = 16971;
                    if (C0278.m1789() <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩻۬") ^ i9) * 25;
                        i = ((iM11306 ^ i10) * (-10141)) ^ 1127633977;
                        i2 = 1727883198;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۛۛ") ^ i10) * 35;
                        i = ((iM11306 ^ i9) * (-19155)) ^ (-465019845);
                        i2 = -2048439130;
                    }
                    int i118 = i;
                    i12 = iM11306 ^ i2;
                    i11 = i118;
                    break;
                case 580563689:
                case 1614871902:
                    if ((i4 * i4) - i3 >= 0) {
                        iM11306 = C19806.m45029("ۖ᩻") ^ i10;
                        i = ((iM11306 ^ i9) * 11335) ^ (-87386658);
                        i2 = -1823702627;
                    } else {
                        iM11306 = (i10 - ThreadFactoryC3888.m11306("֨ۨ")) * (-95);
                        i = ((iM11306 ^ i9) * (-16773)) ^ 12252713;
                        i2 = -102616392;
                    }
                    int i119 = i;
                    i12 = iM11306 ^ i2;
                    i11 = i119;
                    break;
                default:
                    return ThreadFactoryC3888.m11306(strM5047) ^ 2100240976;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m29271(C11718 c11718, C1529 c1529, MenuItem menuItem) {
        int i = 168816370;
        int i2 = C2477.f9839;
        int i3 = RunnableC3388.f12514;
        int iM11306 = (i2 - ThreadFactoryC3888.m11306("᩵ܽ")) * 87;
        int i4 = ((iM11306 ^ i3) * 8409) ^ (-135275525);
        int i5 = -2114629139;
        while (true) {
            i = ((((i ^ i3) * (-731)) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2034577551:
                case -1637516441:
                    if (C3660.f13403 >= 0) {
                        iM11306 = (C19806.m45029("ᩳ᩹") ^ i3) * 99;
                        i4 = ((iM11306 ^ i2) * (-10421)) ^ (-1499623603);
                        i5 = -34036637;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("۟֡")) * 97;
                        i4 = ((iM11306 ^ i3) * (-4157)) ^ (-906383362);
                        i5 = -35147297;
                    }
                    break;
                case -2026470342:
                case -440198045:
                    if (C1668.m5583()) {
                        iM11306 = C19806.m45029("ܿۖ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-865)) ^ 462961556;
                        i5 = 1664988536;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩺ۤ") ^ i2) * (-21);
                        i4 = ((iM11306 ^ i3) * 23433) ^ (-1212649263);
                        i5 = 1064099157;
                    }
                    break;
                case -2003559357:
                case -1889147089:
                    C0797.m3359();
                    break;
                case -1849902926:
                case 418376261:
                    if (C0962.f3784) {
                        iM11306 = ThreadFactoryC3888.m11306("۠᩵") ^ i2;
                        i4 = ((iM11306 ^ i3) * 30999) ^ (-1662245136);
                        i5 = -11268524;
                    } else {
                        iM11306 = (i3 - C19806.m45029("۠ܽ")) * (-37);
                        i4 = ((iM11306 ^ i2) * 14807) ^ (-494091124);
                        i5 = -354252265;
                    }
                    break;
                case -1229934778:
                case 1032055638:
                    if (C2871.m8646()) {
                        iM11306 = ThreadFactoryC3888.m11306("᩻ۡ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-14413)) ^ 915766036;
                        i5 = -1613472286;
                    } else {
                        iM11306 = C19806.m45029("ۜۗ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-2177)) ^ (-769648608);
                        i5 = 1690840027;
                    }
                    break;
                case -1062404307:
                case -1021226557:
                    if (c1529.m5303(menuItem)) {
                        iM11306 = C19806.m45029("ۨ۬") ^ i2;
                        i4 = ((iM11306 ^ i3) * 7019) ^ (-710714867);
                        i5 = 322332056;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֨ۤ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 15823) ^ 983356965;
                        i5 = -1857715261;
                    }
                    break;
                case -1021418815:
                case 1685008197:
                    if (C2477.f9839 <= 0) {
                        iM11306 = C19806.m45029("ۜۗ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-2177)) ^ (-769648608);
                        i5 = 1690840027;
                    } else {
                        iM11306 = (C19806.m45029("ۗ᩸") + i2) * 45;
                        i4 = ((iM11306 ^ i3) * (-21905)) ^ (-767489772);
                        i5 = 242781125;
                    }
                    break;
                case -895617090:
                case -46292048:
                    if (RunnableC1564.m5345()) {
                        iM11306 = C19806.m45029("ۜۗ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-2177)) ^ (-769648608);
                        i5 = 1690840027;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۠ۧ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-3371)) ^ (-610540071);
                        i5 = 989078430;
                    }
                    break;
                case -617353981:
                case -192142279:
                    if (!C0962.f3784) {
                        iM11306 = (C19806.m45029("ᩳ᩹") ^ i3) * 99;
                        i4 = ((iM11306 ^ i2) * (-10421)) ^ (-1499623603);
                        i5 = -34036637;
                    } else {
                        iM11306 = C19806.m45029("ۜۗ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-2177)) ^ (-769648608);
                        i5 = 1690840027;
                    }
                    break;
                case -271301088:
                case 1254488439:
                    if (C1025.f4800 >= 0) {
                        iM11306 = C19806.m45029("ۜۗ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-2177)) ^ (-769648608);
                        i5 = 1690840027;
                    } else {
                        iM11306 = C19806.m45029("ܰ֫") ^ i2;
                        i4 = ((iM11306 ^ i3) * 14653) ^ 236442520;
                        i5 = -2091175270;
                    }
                    break;
                case -211103729:
                case 1401481365:
                    if (C1937.m6279() >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶ۢ") + i2) * 53;
                        i4 = ((iM11306 ^ i3) * 20329) ^ (-1915036045);
                        i5 = -1045741356;
                    } else {
                        iM11306 = C19806.m45029("ۙۛ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-11251)) ^ 763899680;
                        i5 = 264016431;
                    }
                    break;
                case -146421388:
                case 2141681939:
                    if (RunnableC1564.f6300) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶ۢ") + i2) * 53;
                        i4 = ((iM11306 ^ i3) * 20329) ^ (-1915036045);
                        i5 = -1045741356;
                    } else {
                        iM11306 = C19806.m45029("ۧ۟") ^ i3;
                        i4 = ((iM11306 ^ i2) * 19659) ^ 455059962;
                        i5 = 2076389636;
                    }
                    break;
                case -87555809:
                case 1195341801:
                    C1977.m6356();
                    if (ThreadFactoryC3888.m11300() <= 0) {
                        iM11306 = (C19806.m45029("ᩳ᩹") ^ i3) * 99;
                        i4 = ((iM11306 ^ i2) * (-10421)) ^ (-1499623603);
                        i5 = -34036637;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۠᩵") ^ i2;
                        i4 = ((iM11306 ^ i3) * 30999) ^ (-1662245136);
                        i5 = -11268524;
                    }
                    break;
                case -75829322:
                case 1082534496:
                    C2477.m7593();
                    if (RunnableC0195.f1321 < 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩺ۤ") ^ i2) * (-21);
                        i4 = ((iM11306 ^ i3) * 23433) ^ (-1212649263);
                        i5 = 1064099157;
                    } else {
                        iM11306 = (C19806.m45029("ᩳ᩹") ^ i3) * 99;
                        i4 = ((iM11306 ^ i2) * (-10421)) ^ (-1499623603);
                        i5 = -34036637;
                    }
                    break;
                case 30906267:
                case 179667482:
                    if (C3286.f12186) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶ۢ") + i2) * 53;
                        i4 = ((iM11306 ^ i3) * 20329) ^ (-1915036045);
                        i5 = -1045741356;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩷ܳ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 26323) ^ (-1829383143);
                        i5 = -1290572623;
                    }
                    break;
                case 145181944:
                case 1661451890:
                    break;
                case 256230464:
                case 1672737350:
                    c11718.f39387.m42626(c11718.m29301());
                    iM11306 = C19806.m45029("ۨ۬") ^ i2;
                    i4 = ((iM11306 ^ i3) * 7019) ^ (-710714867);
                    i5 = 322332056;
                    break;
                default:
                    C3722.m10894();
                    C2477.m7593();
                    iM11306 = ThreadFactoryC3888.m11306("۠᩵") ^ i2;
                    i4 = ((iM11306 ^ i3) * 30999) ^ (-1662245136);
                    i5 = -11268524;
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC22611
    /* JADX INFO: renamed from: ۖ */
    public final InterfaceC19083 mo19340() {
        C6094 c6094 = null;
        C13626 c13626M50132 = null;
        C6111 c6111 = null;
        C20556 c20556 = null;
        int i = 1390580077;
        int i2 = RunnableC3388.f12514;
        int i3 = C3722.f13525;
        int iM45029 = C19806.m45029("ۧܶ") ^ i2;
        int i4 = ((iM45029 ^ i3) * 5775) ^ (-1199004069);
        int i5 = -1538736185;
        while (true) {
            i = ((((i ^ i3) * 1921) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2113762168:
                case -169094355:
                    if (C2642.f10294 <= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩺ۤ")) * (-3);
                        i4 = ((iM45029 ^ i2) * (-29821)) ^ 9254800;
                        i5 = -208238109;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܿ۠") ^ i3;
                        i4 = ((iM45029 ^ i2) * 8335) ^ (-403149819);
                        i5 = -1423389224;
                    }
                    break;
                case -2000653155:
                case 1284369227:
                    if (c20556 != null) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩶ۤ")) * 33;
                        i4 = ((iM45029 ^ i2) * (-19179)) ^ (-1416757601);
                        i5 = -1001975824;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩷۬") + i2) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM45029 ^ i3) * 19227) ^ (-2071817567);
                        i5 = -1628131269;
                    }
                    break;
                case -1906958973:
                case 371138522:
                    if (RunnableC1895.f7152) {
                        iM45029 = ThreadFactoryC3888.m11306("ۡۢ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-11395)) ^ (-1318873862);
                        i5 = -29256095;
                    } else {
                        iM45029 = C19806.m45029("ᩴᩴ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 28233) ^ 368293589;
                        i5 = 755539123;
                    }
                    break;
                case -1860370981:
                case 403146702:
                    if (C0797.f3386) {
                        iM45029 = C19806.m45029("ۡܳ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-925)) ^ (-1097773106);
                        i5 = -555291461;
                    } else {
                        iM45029 = (C19806.m45029("ܰ֫") ^ i3) * (-35);
                        i4 = ((iM45029 ^ i2) * 15963) ^ 1216305305;
                        i5 = -337682706;
                    }
                    break;
                case -1817282228:
                case 278765020:
                    return new C13835(this, c6111, c20556, c13626M50132);
                case -1538685860:
                case -19719815:
                    if (C3743.m10966() > 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩺ۤ")) * (-3);
                        i4 = ((iM45029 ^ i2) * (-29821)) ^ 9254800;
                        i5 = -208238109;
                    } else {
                        iM45029 = C19806.m45029("ᩴᩴ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 28233) ^ 368293589;
                        i5 = 755539123;
                    }
                    break;
                case -1538514920:
                case 1333024578:
                    if (C0526.f2219) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ۘ᩶")) * (-87);
                        i4 = ((iM45029 ^ i3) * (-22887)) ^ 1938876542;
                        i5 = -373855339;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۛ᩻") ^ i2;
                        i4 = ((iM45029 ^ i3) * 23121) ^ 502929373;
                        i5 = 1648581463;
                    }
                    break;
                case -1507220556:
                case 368526163:
                    c13626M50132 = m50132(c6094.m47183());
                    if (C3577.f13150 >= 0) {
                        iM45029 = C19806.m45029("ۡܳ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-925)) ^ (-1097773106);
                        i5 = -555291461;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۠ܳ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-14773)) ^ (-719713337);
                        i5 = -2046318046;
                    }
                    break;
                case -1417857707:
                case 786275062:
                    if (this.f39391) {
                        iM45029 = ThreadFactoryC3888.m11306("۟ۢ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-5053)) ^ (-2073189643);
                        i5 = 942246376;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩶᩹") + i3) * 57;
                        i4 = ((iM45029 ^ i2) * 1441) ^ (-1941900230);
                        i5 = 2099778525;
                    }
                    break;
                case -1291115636:
                case -1050215916:
                    C2124.m6673();
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    return null;
                case -688365927:
                case -167778404:
                    if (this.f39385) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩶᩹") + i3) * 57;
                        i4 = ((iM45029 ^ i2) * 1441) ^ (-1941900230);
                        i5 = 2099778525;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܿ֫") ^ i3;
                        i4 = ((iM45029 ^ i2) * 11251) ^ (-1379940792);
                        i5 = -1912347453;
                    }
                    break;
                case -62700056:
                case 1287768256:
                    if (C3660.m10791() != 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩺ۤ")) * (-3);
                        i4 = ((iM45029 ^ i2) * (-29821)) ^ 9254800;
                        i5 = -208238109;
                    } else {
                        iM45029 = C19806.m45029("ۘۤ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 15073) ^ 728300780;
                        i5 = 469935675;
                    }
                    break;
                case 104583443:
                case 1183442673:
                    if (C1937.m6279() >= 0) {
                        iM45029 = C19806.m45029("ۡܳ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-925)) ^ (-1097773106);
                        i5 = -555291461;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩺᩶") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-32621)) ^ (-1098924577);
                        i5 = 1622587687;
                    }
                    break;
                case 133699836:
                case 880168467:
                    if (C2332.f8260) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩺᩹") + i3) * (-77);
                        i4 = ((iM45029 ^ i2) * 15277) ^ (-1069573330);
                        i5 = 474381667;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ۘ᩶")) * (-87);
                        i4 = ((iM45029 ^ i3) * (-22887)) ^ 1938876542;
                        i5 = -373855339;
                    }
                    break;
                case 319401818:
                case 977834839:
                    c6094 = this.f39389;
                    if (c6094 != null) {
                        iM45029 = C19806.m45029("ۗ᩷") ^ i2;
                        i4 = ((iM45029 ^ i3) * 16473) ^ (-1710043496);
                        i5 = 1811937443;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩶᩹") + i3) * 57;
                        i4 = ((iM45029 ^ i2) * 1441) ^ (-1941900230);
                        i5 = 2099778525;
                    }
                    break;
                case 467854957:
                case 1850543261:
                    if (C0278.f1572 <= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩺ۤ")) * (-3);
                        i4 = ((iM45029 ^ i2) * (-29821)) ^ 9254800;
                        i5 = -208238109;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۬֨") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-18233)) ^ 120538317;
                        i5 = -662058126;
                    }
                    break;
                case 490421143:
                case 1062001476:
                    throw new RuntimeException();
                case 534585861:
                case 1170981313:
                    c6111 = this.f39378;
                    c20556 = this.f39381;
                    if (c6111 != null) {
                        iM45029 = ThreadFactoryC3888.m11306("᩶ۧ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-7397)) ^ 1155181578;
                        i5 = 1777395616;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩷۬") + i2) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM45029 ^ i3) * 19227) ^ (-2071817567);
                        i5 = -1628131269;
                    }
                    break;
                case 620686120:
                case 1937004184:
                    return null;
                case 1088864630:
                case 1999385693:
                    if (C0216.f1393 == 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩺ۤ")) * (-3);
                        i4 = ((iM45029 ^ i2) * (-29821)) ^ 9254800;
                        i5 = -208238109;
                    } else {
                        iM45029 = (C19806.m45029("ۛܽ") ^ i3) * 13;
                        i4 = ((iM45029 ^ i2) * 15421) ^ 1850833964;
                        i5 = -1635773640;
                    }
                    break;
                case 1402472942:
                case 2082046611:
                    C2871.m8646();
                    iM45029 = C19806.m45029("ᩴᩴ") ^ i2;
                    i4 = ((iM45029 ^ i3) * 28233) ^ 368293589;
                    i5 = 755539123;
                    break;
                case 2038379015:
                case 2045898240:
                    if (C2249.f8050 >= 0) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ۘ᩶")) * (-87);
                        i4 = ((iM45029 ^ i3) * (-22887)) ^ 1938876542;
                        i5 = -373855339;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩺ۤ")) * (-3);
                        i4 = ((iM45029 ^ i2) * (-29821)) ^ 9254800;
                        i5 = -208238109;
                    }
                    break;
                default:
                    if (C0050.f912 <= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩺ۤ")) * (-3);
                        i4 = ((iM45029 ^ i2) * (-29821)) ^ 9254800;
                        i5 = -208238109;
                    } else {
                        iM45029 = C19806.m45029("᩺ܳ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-27705)) ^ 1817924276;
                        i5 = 1261437118;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0072  */
    /* JADX WARN: Code duplicated, block: B:47:0x0186 A[PHI: r1 r7 r10 r16
      0x0186: PHI (r1v4 android.os.Bundle) = (r1v2 android.os.Bundle), (r1v3 android.os.Bundle), (r1v2 android.os.Bundle) binds: [B:46:0x0184, B:31:0x00e1, B:13:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x0186: PHI (r7v4 int) = (r7v3 int), (r7v2 int), (r7v2 int) binds: [B:46:0x0184, B:31:0x00e1, B:13:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x0186: PHI (r10v4 short[]) = (r10v2 short[]), (r10v3 short[]), (r10v2 short[]) binds: [B:46:0x0184, B:31:0x00e1, B:13:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x0186: PHI (r16v17 int) = (r16v7 int), (r16v13 int), (r16v18 int) binds: [B:46:0x0184, B:31:0x00e1, B:13:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x0211 A[PHI: r3 r11 r16
      0x0211: PHI (r3v5 char) = (r3v3 char), (r3v2 char), (r3v2 char) binds: [B:58:0x020f, B:27:0x00bc, B:10:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x0211: PHI (r11v5 int) = (r11v2 int), (r11v3 int), (r11v2 int) binds: [B:58:0x020f, B:27:0x00bc, B:10:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x0211: PHI (r16v23 int) = (r16v4 int), (r16v14 int), (r16v24 int) binds: [B:58:0x020f, B:27:0x00bc, B:10:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x025e A[PHI: r2 r4 r8 r12 r16
      0x025e: PHI (r2v4 short[]) = (r2v3 short[]), (r2v2 short[]), (r2v2 short[]), (r2v2 short[]), (r2v2 short[]), (r2v2 short[]) binds: [B:66:0x025c, B:62:0x023f, B:54:0x01f1, B:42:0x015f, B:23:0x009b, B:14:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x025e: PHI (r4v4 short) = (r4v2 short), (r4v2 short), (r4v3 short), (r4v2 short), (r4v2 short), (r4v2 short) binds: [B:66:0x025c, B:62:0x023f, B:54:0x01f1, B:42:0x015f, B:23:0x009b, B:14:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x025e: PHI (r8v4 short) = (r8v2 short), (r8v2 short), (r8v2 short), (r8v3 short), (r8v2 short), (r8v2 short) binds: [B:66:0x025c, B:62:0x023f, B:54:0x01f1, B:42:0x015f, B:23:0x009b, B:14:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x025e: PHI (r12v4 int) = (r12v2 int), (r12v2 int), (r12v2 int), (r12v2 int), (r12v3 int), (r12v2 int) binds: [B:66:0x025c, B:62:0x023f, B:54:0x01f1, B:42:0x015f, B:23:0x009b, B:14:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x025e: PHI (r16v16 int) = (r16v2 int), (r16v3 int), (r16v5 int), (r16v8 int), (r16v15 int), (r16v19 int) binds: [B:66:0x025c, B:62:0x023f, B:54:0x01f1, B:42:0x015f, B:23:0x009b, B:14:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m29301() {
        int iM45029;
        int i;
        int i2;
        int i3 = C1460.f5948;
        int i4 = RunnableC1606.f6488;
        int iM450210 = (C19806.m45029("ۚܰ") ^ i4) * 89;
        int i5 = ((iM450210 ^ i3) * (-28467)) ^ (-126853123);
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM450210 ^ (-2095702077);
        Bundle bundleRequireArguments = null;
        char c = 0;
        short s = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        short s2 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 2056844341;
        while (true) {
            int i14 = i6 ^ (i5 & (((i13 ^ i3) * (-15893)) >> 31));
            switch (i14) {
                case -2135599330:
                case -341040009:
                    if (ThreadFactoryC3888.f14547 > 0) {
                        iM45029 = C19806.m45029("ۖ۟") ^ i4;
                        i14 = i14;
                        i = ((iM45029 ^ i3) * 13213) ^ 885534660;
                        i2 = -1657366337;
                    } else {
                        i14 = i14;
                        iM45029 = (ThreadFactoryC3888.m11306("ܿ᩹") ^ i4) * 21;
                        i = ((iM45029 ^ i3) * (-31509)) ^ 1097396206;
                        i2 = -994134901;
                    }
                    int i15 = i14;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    i13 = i15;
                    break;
                case -2102282929:
                case 1411287714:
                    i10 = 17798;
                    iM45029 = (i4 - C19806.m45029("ܰᩳ")) * (-77);
                    i = ((iM45029 ^ i3) * 11725) ^ (-319037771);
                    i2 = -1708878965;
                    int i16 = i14;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    i13 = i16;
                    break;
                case -1776740059:
                case 1625833197:
                    String strM6902 = C2249.m6902(bundleRequireArguments, C3577.m10571(sArr2, i11, i12, i10));
                    C3286.m9779(strM6902);
                    return strM6902;
                case -1587151660:
                case -1138825870:
                    i14 = i14;
                    int i17 = s + s2;
                    if (i9 - (i17 * i17) >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩵ܶ") + i4) * (-25);
                        i = ((iM45029 ^ i3) * 30645) ^ (-946969030);
                        i2 = 1343743787;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܳᩳ") ^ i3;
                        i = ((iM45029 ^ i4) * (-26259)) ^ (-1022105509);
                        i2 = 1722272089;
                    }
                    int i18 = i14;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    i13 = i18;
                    break;
                case -1510611564:
                case 1182517668:
                    i14 = i14;
                    bundleRequireArguments = requireArguments();
                    sArr2 = f39370;
                    if (C3286.f12186) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܿ᩹") ^ i4) * 21;
                        i = ((iM45029 ^ i3) * (-31509)) ^ 1097396206;
                        i2 = -994134901;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩴۗ") ^ i4) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM45029 ^ i3) * 15851) ^ 1863856962;
                        i2 = 2109730808;
                    }
                    int i19 = i14;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    i13 = i19;
                    break;
                case -1405746707:
                case -213146603:
                    C3577.m10565();
                    if (C1977.m6356()) {
                        i14 = i14;
                        iM45029 = C19806.m45029("᩻᩷") ^ i3;
                        i = ((iM45029 ^ i4) * (-6567)) ^ (-261576625);
                        i2 = 667608560;
                    } else {
                        iM45029 = C19806.m45029("ۖ۟") ^ i4;
                        i14 = i14;
                        i = ((iM45029 ^ i3) * 13213) ^ 885534660;
                        i2 = -1657366337;
                    }
                    int i110 = i14;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    i13 = i110;
                    break;
                case -1235108149:
                case 664913303:
                    i14 = i14;
                    i12 = 9;
                    if (C2642.f10294 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩷֡") + i3) * 57;
                        i = ((iM45029 ^ i4) * 11623) ^ (-391790143);
                        i2 = 571970999;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۠᩵") ^ i3;
                        i = ((iM45029 ^ i4) * 13445) ^ (-2131030609);
                        i2 = -2063706930;
                    }
                    int i111 = i14;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    i13 = i111;
                    break;
                case -1014177980:
                case 1853202451:
                    i10 = 33135;
                    iM45029 = (i4 - C19806.m45029("ܰᩳ")) * (-77);
                    i = ((iM45029 ^ i3) * 11725) ^ (-319037771);
                    i2 = -1708878965;
                    int i112 = i14;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    i13 = i112;
                    break;
                case -1008783590:
                case 1814642231:
                    if (C0629.f2722 > 0) {
                        i14 = i14;
                        iM45029 = (ThreadFactoryC3888.m11306("᩷֡") + i3) * 57;
                        i = ((iM45029 ^ i4) * 11623) ^ (-391790143);
                        i2 = 571970999;
                        int i113 = i14;
                        i6 = iM45029 ^ i2;
                        i5 = i;
                        i13 = i113;
                    }
                    i14 = i14;
                    iM45029 = (ThreadFactoryC3888.m11306("ܿ᩹") ^ i4) * 21;
                    i = ((iM45029 ^ i3) * (-31509)) ^ 1097396206;
                    i2 = -994134901;
                    int i114 = i14;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    i13 = i114;
                    break;
                case -689712699:
                case -85072380:
                    i14 = i14;
                    if (C1937.f7317 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩷֡") + i3) * 57;
                        i = ((iM45029 ^ i4) * 11623) ^ (-391790143);
                        i2 = 571970999;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܽ᩶") ^ i3;
                        i = ((iM45029 ^ i4) * (-26869)) ^ 890531427;
                        i2 = -2060850688;
                    }
                    int i115 = i14;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    i13 = i115;
                    break;
                case -679982503:
                case 847661050:
                    i14 = i14;
                    i7 = s * s;
                    i8 = 59706529;
                    if (C3722.f13525 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۢ᩸") ^ i4;
                        i = ((iM45029 ^ i3) * 2039) ^ (-76826512);
                        i2 = 1138833635;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܺܰ") ^ i4;
                        i = ((iM45029 ^ i3) * 803) ^ 1201617013;
                        i2 = 359847219;
                    }
                    int i116 = i14;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    i13 = i116;
                    break;
                case -489308195:
                case -242202712:
                    i14 = i14;
                    sArr = f39370;
                    if (C1937.f7317 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩷֡") + i3) * 57;
                        i = ((iM45029 ^ i4) * 11623) ^ (-391790143);
                        i2 = 571970999;
                    } else {
                        iM45029 = C19806.m45029("֨ܺ") ^ i4;
                        i = ((iM45029 ^ i3) * (-18983)) ^ 83175773;
                        i2 = 959754639;
                    }
                    int i117 = i14;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    i13 = i117;
                    break;
                case -278587360:
                case 1613830964:
                    i14 = i14;
                    s = sArr[c];
                    if (C1025.m3861() <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩷֡") + i3) * 57;
                        i = ((iM45029 ^ i4) * 11623) ^ (-391790143);
                        i2 = 571970999;
                    } else {
                        iM45029 = C19806.m45029("᩵ۚ") ^ i3;
                        i = ((iM45029 ^ i4) * (-20615)) ^ (-299404752);
                        i2 = -694945463;
                    }
                    int i118 = i14;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    i13 = i118;
                    break;
                case -89791267:
                case 1570925728:
                    i14 = i14;
                    int i20 = i7 + i8;
                    i9 = i20 + i20;
                    if (C0216.m1591() <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܿ᩹") ^ i4) * 21;
                        i = ((iM45029 ^ i3) * (-31509)) ^ 1097396206;
                        i2 = -994134901;
                    } else {
                        iM45029 = (C19806.m45029("ᩳۧ") ^ i3) * 61;
                        i = ((iM45029 ^ i4) * 13963) ^ (-1886111875);
                        i2 = 642176706;
                    }
                    int i119 = i14;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    i13 = i119;
                    break;
                case 51700805:
                case 1524028446:
                    i14 = i14;
                    i11 = 402;
                    if (RunnableC1564.m5345()) {
                        iM45029 = C19806.m45029("᩻᩷") ^ i3;
                        i = ((iM45029 ^ i4) * (-6567)) ^ (-261576625);
                        i2 = 667608560;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩴ᩹") ^ i3) * 35;
                        i = ((iM45029 ^ i4) * (-16073)) ^ (-122162101);
                        i2 = 156959342;
                    }
                    int i1110 = i14;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    i13 = i1110;
                    break;
                case 528715123:
                case 2137541784:
                    i14 = i14;
                    s2 = 7727;
                    if (C1066.f4915 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩷֡") + i3) * 57;
                        i = ((iM45029 ^ i4) * 11623) ^ (-391790143);
                        i2 = 571970999;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩴ۫") ^ i3) * 101;
                        i = ((iM45029 ^ i4) * (-23005)) ^ (-966501199);
                        i2 = 1082823127;
                    }
                    int i1111 = i14;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    i13 = i1111;
                    break;
                case 1184743633:
                case 1631556975:
                    i14 = i14;
                    c = 401;
                    if (C2249.f8050 >= 0) {
                        iM45029 = C19806.m45029("᩻᩷") ^ i3;
                        i = ((iM45029 ^ i4) * (-6567)) ^ (-261576625);
                        i2 = 667608560;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩶ᩳ") ^ i4) * (-99);
                        i = ((iM45029 ^ i3) * 3051) ^ 2080118329;
                        i2 = 553126853;
                    }
                    int i1112 = i14;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    i13 = i1112;
                    break;
                case 1746433121:
                case 1900511483:
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    CallableC1627.m5507();
                    iM45029 = C19806.m45029("ۖ۟") ^ i4;
                    i14 = i14;
                    i = ((iM45029 ^ i3) * 13213) ^ 885534660;
                    i2 = -1657366337;
                    int i1113 = i14;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    i13 = i1113;
                    break;
                default:
                    C0671.m3008();
                    AbstractC0464.m2313();
                    return null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:74:0x02a3 A[PHI: r4 r7 r12 r18
      0x02a3: PHI (r4v7 boolean) = (r4v2 boolean), (r4v2 boolean), (r4v8 boolean) binds: [B:73:0x02a1, B:69:0x0282, B:10:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x02a3: PHI (r7v7 java.util.ArrayList<java.lang.String>) = 
      (r7v2 java.util.ArrayList<java.lang.String>)
      (r7v2 java.util.ArrayList<java.lang.String>)
      (r7v8 java.util.ArrayList<java.lang.String>)
     binds: [B:73:0x02a1, B:69:0x0282, B:10:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x02a3: PHI (r12v7 short[]) = (r12v2 short[]), (r12v2 short[]), (r12v8 short[]) binds: [B:73:0x02a1, B:69:0x0282, B:10:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x02a3: PHI (r18v7 short[]) = (r18v3 short[]), (r18v4 short[]), (r18v3 short[]) binds: [B:73:0x02a1, B:69:0x0282, B:10:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x02d3 A[PHI: r5 r6 r10
      0x02d3: PHI (r5v3 boolean) = (r5v2 boolean), (r5v2 boolean), (r5v4 boolean) binds: [B:77:0x02d1, B:61:0x0228, B:42:0x0142] A[DONT_GENERATE, DONT_INLINE]
      0x02d3: PHI (r6v3 android.os.Bundle) = (r6v2 android.os.Bundle), (r6v2 android.os.Bundle), (r6v4 android.os.Bundle) binds: [B:77:0x02d1, B:61:0x0228, B:42:0x0142] A[DONT_GENERATE, DONT_INLINE]
      0x02d3: PHI (r10v4 int) = (r10v2 int), (r10v3 int), (r10v2 int) binds: [B:77:0x02d1, B:61:0x0228, B:42:0x0142] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0079, code lost:
    
        if (l.C7105.f23796 < 0) goto L16;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m29297(java.util.List r20, boolean r21) {
        /*
            Method dump skipped, instruction units count: 950
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11718.m29297(java.util.List, boolean):boolean");
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final ArrayList m29299() {
        Bundle bundleRequireArguments = null;
        ArrayList<String> stringArrayList = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        short s2 = 0;
        int i3 = 0;
        short[] sArr2 = null;
        int i4 = 0;
        int i5 = -82662893;
        int i6 = C2124.f7782;
        int i7 = C7105.f23796;
        int iM11306 = ThreadFactoryC3888.m11306("֫ۨ") ^ i7;
        int i8 = ((iM11306 ^ i6) * 15549) ^ (-1414692917);
        int i9 = 911135452;
        while (true) {
            i5 = ((((i5 ^ i6) * (-1487)) >> 31) & i8) ^ (iM11306 ^ i9);
            switch (i5) {
                case -2081086676:
                case 2016018299:
                    i2 = 163481796 + i;
                    if (C3286.f12186) {
                        iM11306 = ThreadFactoryC3888.m11306("ܰۙ") ^ i7;
                        i8 = ((iM11306 ^ i6) * (-3685)) ^ 675770090;
                        i9 = -1821324872;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ᩴ᩺") ^ i6;
                        i8 = ((iM11306 ^ i7) * (-18005)) ^ (-1887872947);
                        i9 = -1027824996;
                    }
                    break;
                case -1963457231:
                case 1201833022:
                    C3743.m10966();
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    return null;
                case -1821446846:
                case -503006354:
                    if (C1066.f4915 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܰۙ") ^ i7;
                        i8 = ((iM11306 ^ i6) * (-3685)) ^ 675770090;
                        i9 = -1821324872;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܽۢ") + i6) * 89;
                        i8 = ((iM11306 ^ i7) * (-28449)) ^ 1909233029;
                        i9 = -132954023;
                    }
                    break;
                case -1817575966:
                case -1688070686:
                    ViewTreeObserverOnPreDrawListenerC3327.m9874();
                    if (ViewTreeObserverOnPreDrawListenerC3327.m9874()) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۚ᩷") + i7) * (-15);
                        i8 = ((iM11306 ^ i6) * (-1595)) ^ (-1297539156);
                        i9 = 1672710002;
                    } else {
                        iM11306 = (C19806.m45029("ᩴܳ") ^ i6) * (-55);
                        i8 = ((iM11306 ^ i7) * (-11197)) ^ 1830921568;
                        i9 = 1451984750;
                    }
                    break;
                case -1712943522:
                case -1567724035:
                    bundleRequireArguments = requireArguments();
                    sArr2 = f39370;
                    if (C0671.f2816 != 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܰۙ") ^ i7;
                        i8 = ((iM11306 ^ i6) * (-3685)) ^ 675770090;
                        i9 = -1821324872;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۫᩸") + i7) * 57;
                        i8 = ((iM11306 ^ i6) * 29531) ^ 1114015522;
                        i9 = 469746843;
                    }
                    break;
                case -1536819592:
                case -608491187:
                    if (C2788.m8472() != 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۘ᩸") ^ i7;
                        i8 = ((iM11306 ^ i6) * (-12961)) ^ (-1598197764);
                        i9 = 1359392365;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩺֫") + i6) * 71;
                        i8 = ((iM11306 ^ i7) * 23675) ^ 544967167;
                        i9 = -896001748;
                    }
                    break;
                case -1255904751:
                case -497520790:
                    s2 = 25572;
                    if (C0216.f1393 != 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۘ᩸") ^ i7;
                        i8 = ((iM11306 ^ i6) * (-12961)) ^ (-1598197764);
                        i9 = 1359392365;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۜۡ") ^ i7;
                        i8 = ((iM11306 ^ i6) * 5147) ^ 702797937;
                        i9 = 464882311;
                    }
                    break;
                case -1137180166:
                case -490532179:
                    i3 = 13854;
                    iM11306 = ThreadFactoryC3888.m11306("ܽܰ") ^ i6;
                    i8 = ((iM11306 ^ i7) * (-32625)) ^ (-1134947942);
                    i9 = -720040859;
                    break;
                case -857105401:
                case -557871314:
                    i3 = 55050;
                    iM11306 = ThreadFactoryC3888.m11306("ܽܰ") ^ i6;
                    i8 = ((iM11306 ^ i7) * (-32625)) ^ (-1134947942);
                    i9 = -720040859;
                    break;
                case -856933781:
                case 413458106:
                    C1977.m6356();
                    RunnableC0195.m1431();
                    iM11306 = (ThreadFactoryC3888.m11306("ۚ᩷") + i7) * (-15);
                    i8 = ((iM11306 ^ i6) * (-1595)) ^ (-1297539156);
                    i9 = 1672710002;
                    break;
                case -774831059:
                case 245407911:
                    if (i2 - (s * s2) < 0) {
                        iM11306 = (C19806.m45029("֡ۙ") ^ i7) * 13;
                        i8 = ((iM11306 ^ i6) * (-22875)) ^ (-803245225);
                        i9 = -1512278874;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩹֫") ^ i6;
                        i8 = ((iM11306 ^ i7) * 14437) ^ 1435498663;
                        i9 = -1457048713;
                    }
                    break;
                case -519364388:
                case 467108040:
                    return new ArrayList(stringArrayList);
                case -408978616:
                case 326006718:
                    if (C0817.f3443) {
                        iM11306 = (i7 - ThreadFactoryC3888.m11306("᩶ᩳ")) * 49;
                        i8 = ((iM11306 ^ i6) * 9659) ^ (-907780945);
                        i9 = 1586921660;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۘ᩸") ^ i7;
                        i8 = ((iM11306 ^ i6) * (-12961)) ^ (-1598197764);
                        i9 = 1359392365;
                    }
                    break;
                case -351996460:
                case 901071237:
                    stringArrayList = bundleRequireArguments.getStringArrayList(C3286.m9788(sArr2, i4, 20, i3));
                    if (stringArrayList == null) {
                        iM11306 = ThreadFactoryC3888.m11306("ܽ֡") ^ i6;
                        i8 = ((iM11306 ^ i7) * 24331) ^ 1254741660;
                        i9 = 446872370;
                    } else {
                        iM11306 = (C19806.m45029("۫ۘ") ^ i6) * 35;
                        i8 = ((iM11306 ^ i7) * (-32123)) ^ (-502634715);
                        i9 = 1105918554;
                    }
                    break;
                case -111270463:
                case 1832508221:
                    return new ArrayList();
                case -64343698:
                case 1994537776:
                    sArr = f39370;
                    if (RunnableC1606.f6488 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩴܿ") ^ i6) * (-127);
                        i8 = ((iM11306 ^ i7) * (-8825)) ^ 39714633;
                        i9 = -401869716;
                    } else {
                        iM11306 = C19806.m45029("ۙ᩷") ^ i7;
                        i8 = ((iM11306 ^ i6) * 22531) ^ (-1997242373);
                        i9 = 299864796;
                    }
                    break;
                case 192108711:
                case 1290328328:
                    i4 = 381;
                    if (C1461.f5957 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܰۙ") ^ i7;
                        i8 = ((iM11306 ^ i6) * (-3685)) ^ 675770090;
                        i9 = -1821324872;
                    } else {
                        iM11306 = (i7 - C19806.m45029("ܰܶ")) * 89;
                        i8 = ((iM11306 ^ i6) * (-32557)) ^ (-1190682193);
                        i9 = 1764025540;
                    }
                    break;
                case 475563053:
                case 1836140681:
                    c = 380;
                    if (RunnableC1606.f6488 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩴܿ") ^ i6) * (-127);
                        i8 = ((iM11306 ^ i7) * (-8825)) ^ 39714633;
                        i9 = -401869716;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۧᩴ") ^ i6;
                        i8 = ((iM11306 ^ i7) * 20341) ^ (-422035134);
                        i9 = -266075402;
                    }
                    break;
                case 901583852:
                case 1127344428:
                    C2249.m6915();
                    if (C1460.f5948 < 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۘ᩸") ^ i7;
                        i8 = ((iM11306 ^ i6) * (-12961)) ^ (-1598197764);
                        i9 = 1359392365;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۚ᩷") + i7) * (-15);
                        i8 = ((iM11306 ^ i6) * (-1595)) ^ (-1297539156);
                        i9 = 1672710002;
                    }
                    break;
                case 1494513982:
                case 1677775755:
                    C1460.m5050();
                    if (!CallableC1627.f6528) {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩴܿ") ^ i6) * (-127);
                        i8 = ((iM11306 ^ i7) * (-8825)) ^ 39714633;
                        i9 = -401869716;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۚ᩷") + i7) * (-15);
                        i8 = ((iM11306 ^ i6) * (-1595)) ^ (-1297539156);
                        i9 = 1672710002;
                    }
                    break;
                default:
                    s = sArr[c];
                    i = s * s;
                    if (C2332.m7079() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܰۙ") ^ i7;
                        i8 = ((iM11306 ^ i6) * (-3685)) ^ 675770090;
                        i9 = -1821324872;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۙۧ") ^ i7;
                        i8 = ((iM11306 ^ i6) * 22517) ^ 2064829381;
                        i9 = 1234283821;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C11718() {
        boolean z = false;
        int i = -708921770;
        int i2 = C2477.f9839;
        int i3 = ViewTreeObserverOnPreDrawListenerC3327.f12317;
        short s = f39370[0];
        int i4 = s + 2133;
        int i5 = (s * s) + 4549689;
        super(C19806.m45029(C3660.m10790(f39370, 1, 3, (i4 * i4) - (i5 + i5) > 0 ? 9726 : 26771)) ^ 2097838479);
        int iM45029 = C19806.m45029("ۤܰ") ^ i3;
        int i6 = ((iM45029 ^ i2) * 10619) ^ 1931482605;
        int i7 = -1460375925;
        while (true) {
            i = ((((i ^ i2) * 17897) >> 31) & i6) ^ (iM45029 ^ i7);
            switch (i) {
                case -1950046166:
                case 1275541500:
                    C2477.m7593();
                    if (!C19806.f63586) {
                        iM45029 = (i2 - C19806.m45029("ۡܿ")) * 71;
                        i6 = ((iM45029 ^ i3) * 20085) ^ 1166326344;
                        i7 = 349460111;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ۨ᩸")) * (-43);
                        i6 = ((iM45029 ^ i3) * 6243) ^ 1270046036;
                        i7 = -2075213503;
                    }
                    break;
                case -1722135964:
                case 1438301266:
                    if (C1025.f4800 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۬ۗ") ^ i3;
                        i6 = ((iM45029 ^ i2) * (-4885)) ^ 1671287972;
                        i7 = -1597464743;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩹֡") + i3) * 35;
                        i6 = ((iM45029 ^ i2) * (-10115)) ^ (-1452865285);
                        i7 = 354741802;
                    }
                    break;
                case -1549598857:
                case 987894508:
                    if (RunnableC0195.f1321 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۬ۗ") ^ i3;
                        i6 = ((iM45029 ^ i2) * (-4885)) ^ 1671287972;
                        i7 = -1597464743;
                    } else {
                        iM45029 = (C19806.m45029("֡ۡ") ^ i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i6 = ((iM45029 ^ i2) * 31781) ^ (-779210078);
                        i7 = -1854794679;
                    }
                    break;
                case -1185666812:
                case -238726137:
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۬ۗ") ^ i3;
                        i6 = ((iM45029 ^ i2) * (-4885)) ^ 1671287972;
                        i7 = -1597464743;
                    } else {
                        iM45029 = (i2 - C19806.m45029("۠۠")) * (-107);
                        i6 = ((iM45029 ^ i3) * (-4463)) ^ (-969936173);
                        i7 = 1315222228;
                    }
                    break;
                case -915835126:
                case 1334262697:
                    C2477.m7593();
                    ViewTreeObserverOnPreDrawListenerC3327.m9874();
                    throw new RuntimeException();
                case -749391854:
                case 98255594:
                    if (C0671.f2816 != 0) {
                        iM45029 = (i2 - C19806.m45029("ۡܿ")) * 71;
                        i6 = ((iM45029 ^ i3) * 20085) ^ 1166326344;
                        i7 = 349460111;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("᩻ᩳ")) * 19;
                        i6 = ((iM45029 ^ i3) * 4465) ^ (-502833119);
                        i7 = -1258583366;
                    }
                    break;
                case -672962920:
                case -408999272:
                    if (C10634.f36300 >= 0) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ۨ᩸")) * (-43);
                        i6 = ((iM45029 ^ i3) * 6243) ^ 1270046036;
                        i7 = -2075213503;
                    } else {
                        iM45029 = (i2 - C19806.m45029("ᩴܶ")) * (-95);
                        i6 = ((iM45029 ^ i3) * (-10149)) ^ 897831626;
                        i7 = -1464972156;
                    }
                    break;
                case -508395564:
                case 1032966450:
                    z = true;
                    if (C1025.f4800 >= 0) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ۨ᩸")) * (-43);
                        i6 = ((iM45029 ^ i3) * 6243) ^ 1270046036;
                        i7 = -2075213503;
                    } else {
                        iM45029 = C19806.m45029("ۖ᩻") ^ i3;
                        i6 = ((iM45029 ^ i2) * 12409) ^ 1456175776;
                        i7 = -1710025756;
                    }
                    break;
                case -450240332:
                case 1142461680:
                    setHasOptionsMenu(z);
                    return;
                case -376533087:
                case -125512393:
                    RunnableC1564.m5345();
                    if (C1066.f4915 > 0) {
                        iM45029 = (i2 - C19806.m45029("ۡܿ")) * 71;
                        i6 = ((iM45029 ^ i3) * 20085) ^ 1166326344;
                        i7 = 349460111;
                    } else {
                        iM45029 = (C19806.m45029("֡ۡ") ^ i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i6 = ((iM45029 ^ i2) * 31781) ^ (-779210078);
                        i7 = -1854794679;
                    }
                    break;
                case -139515992:
                case 2068224135:
                    if (C1461.f5957 <= 0) {
                        iM45029 = (i2 - C19806.m45029("ۡܿ")) * 71;
                        i6 = ((iM45029 ^ i3) * 20085) ^ 1166326344;
                        i7 = 349460111;
                    } else {
                        iM45029 = (C19806.m45029("ۖ᩺") + i3) * 13;
                        i6 = ((iM45029 ^ i2) * (-13359)) ^ (-1445588898);
                        i7 = -697476075;
                    }
                    break;
                case 98034696:
                case 160404383:
                    C1066.m4023();
                    iM45029 = (C19806.m45029("֡ۡ") ^ i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                    i6 = ((iM45029 ^ i2) * 31781) ^ (-779210078);
                    i7 = -1854794679;
                    break;
                case 214778293:
                case 1858721694:
                    if (C0278.f1572 <= 0) {
                        iM45029 = (C19806.m45029("֡ۡ") ^ i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i6 = ((iM45029 ^ i2) * 31781) ^ (-779210078);
                        i7 = -1854794679;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ۖۚ")) * (-25);
                        i6 = ((iM45029 ^ i2) * 2187) ^ 1347637038;
                        i7 = 703471054;
                    }
                    break;
                case 230029518:
                case 561964172:
                    if (C0797.f3386) {
                        iM45029 = (i3 - C19806.m45029("۠۫")) * (-79);
                        i6 = ((iM45029 ^ i2) * 5829) ^ 116127272;
                        i7 = -391192798;
                    } else {
                        iM45029 = (C19806.m45029("ۢ۠") + i3) * 7;
                        i6 = ((iM45029 ^ i2) * 26509) ^ 720423036;
                        i7 = 586366500;
                    }
                    break;
                case 570858131:
                case 828991722:
                    if (C2704.f10408) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩸۟") + i2) * (-49);
                        i6 = ((iM45029 ^ i3) * (-11261)) ^ 622122044;
                        i7 = 1624681743;
                    } else {
                        iM45029 = (i3 - C19806.m45029("۠۫")) * (-79);
                        i6 = ((iM45029 ^ i2) * 5829) ^ 116127272;
                        i7 = -391192798;
                    }
                    break;
                default:
                    if (C2249.f8050 >= 0) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ۨ᩸")) * (-43);
                        i6 = ((iM45029 ^ i3) * 6243) ^ 1270046036;
                        i7 = -2075213503;
                    } else {
                        iM45029 = (C19806.m45029("ۤۡ") ^ i2) * (-41);
                        i6 = ((iM45029 ^ i3) * 91) ^ 525495936;
                        i7 = 95815355;
                    }
                    break;
            }
        }
    }

    @Override // l.AbstractC22611
    /* JADX INFO: renamed from: ܶ */
    public final String mo3620() {
        return mo3615();
    }

    @Override // l.AbstractC22611, l.ComponentCallbacksC22654
    public final void onSaveInstanceState(Bundle bundle) {
        InterfaceC19083 interfaceC19083Mo19340 = null;
        int i = 1514970958;
        int i2 = C10634.f36300;
        int i3 = C3577.f13150;
        int iM11306 = ThreadFactoryC3888.m11306("ܶ᩸") ^ i3;
        int i4 = ((iM11306 ^ i2) * (-20377)) ^ (-1713113359);
        int i5 = 1922593509;
        while (true) {
            i = ((((i ^ i2) * (-24199)) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -1901860010:
                case 1659556285:
                    C13835 c13835 = (C13835) interfaceC19083Mo19340;
                    c13835.mo30475();
                    c13835.mo30474();
                    iM11306 = (i3 - C19806.m45029("ۛۖ")) * (-85);
                    i4 = ((iM11306 ^ i2) * (-7825)) ^ (-163960879);
                    i5 = 1555233778;
                    break;
                case -1553866883:
                case 791783526:
                    C0962.m3746();
                    break;
                case -1451899130:
                case -963431334:
                    break;
                case -1374562599:
                case 839704228:
                    if (C0817.f3443) {
                        iM11306 = C19806.m45029("ܰܺ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 5009) ^ 869148581;
                        i5 = -635622115;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۛۚ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-11399)) ^ 2027857077;
                        i5 = -1380953857;
                    }
                    break;
                case -1234339343:
                case 1923583033:
                    C3577.m10565();
                    if (CallableC1627.m5507() != 0) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ۘܶ")) * 69;
                        i4 = ((iM11306 ^ i3) * (-26537)) ^ 1534342354;
                        i5 = 1324230337;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۛۚ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-11399)) ^ 2027857077;
                        i5 = -1380953857;
                    }
                    break;
                case -884617845:
                case -558136417:
                    if (C1977.m6356()) {
                        iM11306 = ThreadFactoryC3888.m11306("ۡ᩵") ^ i3;
                        i4 = ((iM11306 ^ i2) * 29185) ^ 1078582935;
                        i5 = -1241774719;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۢܺ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 2285) ^ 225711;
                        i5 = -1285579985;
                    }
                    break;
                case -397030732:
                case 1058959123:
                    if (C1460.f5948 >= 0) {
                        iM11306 = (C19806.m45029("۠ۖ") + i3) * 21;
                        i4 = ((iM11306 ^ i2) * 3133) ^ 296303723;
                        i5 = -1145781645;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶ۜ") + i3) * (-31);
                        i4 = ((iM11306 ^ i2) * (-2967)) ^ (-446767967);
                        i5 = 1686258845;
                    }
                    break;
                case 19730457:
                case 1445940156:
                    if (C2788.m8472() != 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩷᩷") ^ i2;
                        i4 = ((iM11306 ^ i3) * 17689) ^ (-1485748016);
                        i5 = 157993850;
                    } else {
                        iM11306 = (C19806.m45029("֨᩵") + i3) * (-89);
                        i4 = ((iM11306 ^ i2) * (-29105)) ^ 887037681;
                        i5 = -253342849;
                    }
                    break;
                case 157071758:
                case 2135085915:
                    if (!C0817.f3443) {
                        iM11306 = ThreadFactoryC3888.m11306("ۡ᩵") ^ i3;
                        i4 = ((iM11306 ^ i2) * 29185) ^ 1078582935;
                        i5 = -1241774719;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۛۚ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-11399)) ^ 2027857077;
                        i5 = -1380953857;
                    }
                    break;
                case 207338460:
                case 1256031315:
                    if (C1668.f6641 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۛۚ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-11399)) ^ 2027857077;
                        i5 = -1380953857;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֡ܽ") ^ i3) * (-5);
                        i4 = ((iM11306 ^ i2) * 4293) ^ (-1588707418);
                        i5 = -911656731;
                    }
                    break;
                case 313817035:
                case 523698641:
                    C0216.m1591();
                    iM11306 = ThreadFactoryC3888.m11306("ۡ᩵") ^ i3;
                    i4 = ((iM11306 ^ i2) * 29185) ^ 1078582935;
                    i5 = -1241774719;
                    break;
                case 507518112:
                case 810750128:
                    if (C7105.f23796 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩷᩷") ^ i2;
                        i4 = ((iM11306 ^ i3) * 17689) ^ (-1485748016);
                        i5 = 157993850;
                    } else {
                        iM11306 = (i2 - C19806.m45029("᩸ۗ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM11306 ^ i3) * (-12535)) ^ 820018561;
                        i5 = 1997044179;
                    }
                    break;
                case 608340676:
                case 1946314983:
                    if (C3535.m10431() <= 0) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ۘܶ")) * 69;
                        i4 = ((iM11306 ^ i3) * (-26537)) ^ 1534342354;
                        i5 = 1324230337;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩹ᩳ") + i2) * 123;
                        i4 = ((iM11306 ^ i3) * (-3383)) ^ 1173784361;
                        i5 = -84896189;
                    }
                    break;
                case 710756300:
                case 854773312:
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM11306 = (C19806.m45029("۠ۖ") + i3) * 21;
                        i4 = ((iM11306 ^ i2) * 3133) ^ 296303723;
                        i5 = -1145781645;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۛۚ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-11399)) ^ 2027857077;
                        i5 = -1380953857;
                    }
                    break;
                case 730334387:
                case 1087408452:
                    if (C1377.f5749) {
                        iM11306 = C19806.m45029("᩷֡") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-16003)) ^ 25724252;
                        i5 = -1960085446;
                    } else {
                        iM11306 = (C19806.m45029("۠ۖ") + i3) * 21;
                        i4 = ((iM11306 ^ i2) * 3133) ^ 296303723;
                        i5 = -1145781645;
                    }
                    break;
                case 1019560879:
                case 1311114377:
                    if (RunnableC3388.f12514 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩷᩷") ^ i2;
                        i4 = ((iM11306 ^ i3) * 17689) ^ (-1485748016);
                        i5 = 157993850;
                    } else {
                        iM11306 = (C19806.m45029("᩸ᩳ") ^ i3) * 11;
                        i4 = ((iM11306 ^ i2) * (-21497)) ^ (-1939048786);
                        i5 = -1044991473;
                    }
                    break;
                case 1592674524:
                case 1735145783:
                    super.onSaveInstanceState(bundle);
                    interfaceC19083Mo19340 = mo19340();
                    if (interfaceC19083Mo19340 != null) {
                        iM11306 = C19806.m45029("ܳۜ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-9679)) ^ (-1271160438);
                        i5 = 833089844;
                    } else {
                        iM11306 = (i3 - C19806.m45029("ۛۖ")) * (-85);
                        i4 = ((iM11306 ^ i2) * (-7825)) ^ (-163960879);
                        i5 = 1555233778;
                    }
                    break;
                default:
                    if (C1668.f6641 >= 0) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ۘܶ")) * 69;
                        i4 = ((iM11306 ^ i3) * (-26537)) ^ 1534342354;
                        i5 = 1324230337;
                    } else {
                        iM11306 = C19806.m45029("ۢۤ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-8973)) ^ (-615708053);
                        i5 = -383030379;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0146 A[PHI: r4 r7 r8 r15
      0x0146: PHI (r4v6 android.os.Bundle) = (r4v2 android.os.Bundle), (r4v3 android.os.Bundle), (r4v2 android.os.Bundle) binds: [B:39:0x0144, B:27:0x00cb, B:9:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x0146: PHI (r7v6 int) = (r7v2 int), (r7v3 int), (r7v2 int) binds: [B:39:0x0144, B:27:0x00cb, B:9:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x0146: PHI (r8v6 int) = (r8v2 int), (r8v3 int), (r8v2 int) binds: [B:39:0x0144, B:27:0x00cb, B:9:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x0146: PHI (r15v6 short[]) = (r15v2 short[]), (r15v3 short[]), (r15v2 short[]) binds: [B:39:0x0144, B:27:0x00cb, B:9:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x022a A[PHI: r16
      0x022a: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]) binds: [B:58:0x0228, B:31:0x00fa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x025e A[PHI: r10 r11 r12 r17 r22
      0x025e: PHI (r10v4 int) = (r10v2 int), (r10v2 int), (r10v3 int), (r10v2 int) binds: [B:62:0x025c, B:54:0x0209, B:50:0x01e1, B:13:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x025e: PHI (r11v4 int) = (r11v2 int), (r11v2 int), (r11v3 int), (r11v2 int) binds: [B:62:0x025c, B:54:0x0209, B:50:0x01e1, B:13:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x025e: PHI (r12v4 int) = (r12v2 int), (r12v2 int), (r12v3 int), (r12v2 int) binds: [B:62:0x025c, B:54:0x0209, B:50:0x01e1, B:13:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x025e: PHI (r17v4 short) = (r17v2 short), (r17v3 short), (r17v2 short), (r17v2 short) binds: [B:62:0x025c, B:54:0x0209, B:50:0x01e1, B:13:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x025e: PHI (r22v5 short) = (r22v3 short), (r22v4 short), (r22v3 short), (r22v3 short) binds: [B:62:0x025c, B:54:0x0209, B:50:0x01e1, B:13:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x02c1 A[PHI: r3 r14
      0x02c1: PHI (r3v5 android.os.Bundle) = (r3v2 android.os.Bundle), (r3v4 android.os.Bundle), (r3v2 android.os.Bundle) binds: [B:70:0x02bf, B:35:0x011e, B:10:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x02c1: PHI (r14v4 short[]) = (r14v2 short[]), (r14v3 short[]), (r14v2 short[]) binds: [B:70:0x02bf, B:35:0x011e, B:10:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0075, code lost:
    
        if (l.C1377.m4833() == 0) goto L9;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m29296(java.lang.String r24, java.lang.String r25, java.util.List r26) {
        /*
            Method dump skipped, instruction units count: 908
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11718.m29296(java.lang.String, java.lang.String, java.util.List):void");
    }

    @Override // l.AbstractC22611
    /* JADX INFO: renamed from: ۬ */
    public final String mo3618() {
        return C13012.m32189(150, m29301());
    }

    /* JADX WARN: Code duplicated, block: B:48:0x01e3 A[PHI: r5 r6 r13 r14
      0x01e3: PHI (r5v4 java.lang.StringBuilder) = 
      (r5v2 java.lang.StringBuilder)
      (r5v2 java.lang.StringBuilder)
      (r5v3 java.lang.StringBuilder)
      (r5v2 java.lang.StringBuilder)
     binds: [B:119:0x01e3, B:117:0x01e3, B:47:0x01e1, B:43:0x01b6] A[DONT_GENERATE, DONT_INLINE]
      0x01e3: PHI (r6v4 java.lang.String) = (r6v2 java.lang.String), (r6v2 java.lang.String), (r6v3 java.lang.String), (r6v2 java.lang.String) binds: [B:119:0x01e3, B:117:0x01e3, B:47:0x01e1, B:43:0x01b6] A[DONT_GENERATE, DONT_INLINE]
      0x01e3: PHI (r13v3 short[]) = (r13v2 short[]), (r13v2 short[]), (r13v2 short[]), (r13v4 short[]) binds: [B:119:0x01e3, B:117:0x01e3, B:47:0x01e1, B:43:0x01b6] A[DONT_GENERATE, DONT_INLINE]
      0x01e3: PHI (r14v3 int) = (r14v2 int), (r14v2 int), (r14v2 int), (r14v4 int) binds: [B:119:0x01e3, B:117:0x01e3, B:47:0x01e1, B:43:0x01b6] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC22611
    /* JADX INFO: renamed from: ۘ */
    public final String mo3615() {
        int iM45029;
        int i;
        int i2;
        int iM9878;
        Bundle bundle;
        short[] sArr;
        int i3;
        short s;
        int iM450210;
        int i4;
        int i5;
        int i6;
        C11718 c11718 = this;
        int i7 = C1148.f5161;
        int i8 = AbstractC0464.f2088;
        int iM11306 = ThreadFactoryC3888.m11306("᩵֫") ^ i8;
        int i9 = ((iM11306 ^ i7) * 27533) ^ 51938994;
        String str = null;
        StringBuilder sb = null;
        String strM10952 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i10 = iM11306 ^ 1726291756;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        short s2 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        Bundle bundleRequireArguments = null;
        int i20 = 0;
        int i21 = 896067449;
        int i22 = 0;
        String strM50150 = null;
        StringBuilder sb2 = null;
        int i23 = 0;
        while (true) {
            i21 = i10 ^ (i9 & (((i21 ^ i7) * (-20871)) >> 31));
            switch (i21) {
                case -2052961700:
                case -1478233580:
                    if (RunnableC3388.f12514 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۫᩸") ^ i7;
                        i = ((iM45029 ^ i8) * (-9309)) ^ 1479975283;
                        i2 = 553627358;
                        i10 = iM45029 ^ i2;
                        i9 = i;
                    } else {
                        s = s2;
                        bundle = bundleRequireArguments;
                        i20 = i20;
                        sArr = sArr4;
                        int iM11307 = (i8 - ThreadFactoryC3888.m11306("ۤۜ")) * (-83);
                        s2 = s;
                        bundleRequireArguments = bundle;
                        i9 = ((iM11307 ^ i7) * (-19993)) ^ (-1516856781);
                        i10 = iM11307 ^ 359318853;
                        sArr4 = sArr;
                        c11718 = this;
                        i20 = i20;
                    }
                    break;
                case -1999194690:
                case 1131317571:
                    C1148.m4223(sb, strM10952);
                    c11718.f39379 = C13012.m32189(i23, C0817.m3407(sb));
                    bundleRequireArguments = bundleRequireArguments;
                    i20 = i20;
                    sArr4 = sArr4;
                    iM450210 = C19806.m45029("᩷᩷") ^ i7;
                    i4 = ((iM450210 ^ i8) * (-7553)) ^ (-2126479883);
                    i5 = -2047607263;
                    i6 = iM450210 ^ i5;
                    bundleRequireArguments = bundleRequireArguments;
                    i10 = i6;
                    i9 = i4;
                    sArr4 = sArr4;
                    i20 = i20;
                    break;
                case -1959835743:
                case -1777322907:
                    iM9878 = C2871.m8641(str);
                    i11 = iM9878;
                    iM45029 = (i8 - C19806.m45029("ܺۡ")) * (-77);
                    i = ((iM45029 ^ i7) * (-31155)) ^ (-354469303);
                    i2 = -572190558;
                    i10 = iM45029 ^ i2;
                    i9 = i;
                    break;
                case -1865747941:
                case 1972770018:
                    iM9878 = ViewTreeObserverOnPreDrawListenerC3327.m9878(str, 40);
                    if (iM9878 == -1) {
                        iM45029 = C19806.m45029("۬֡") ^ i7;
                        i = ((iM45029 ^ i8) * 1187) ^ (-2110873029);
                        i2 = -375147081;
                    } else {
                        i11 = iM9878;
                        iM45029 = (i8 - C19806.m45029("ܺۡ")) * (-77);
                        i = ((iM45029 ^ i7) * (-31155)) ^ (-354469303);
                        i2 = -572190558;
                    }
                    i10 = iM45029 ^ i2;
                    i9 = i;
                    break;
                case -1860351828:
                case -805738753:
                    bundle = bundleRequireArguments;
                    i20 = i20;
                    sArr = sArr4;
                    s = s2;
                    int i24 = s + 14430;
                    if (!C19806.f63586) {
                        int iM11308 = ThreadFactoryC3888.m11306("ۖ۠") ^ i8;
                        s2 = s;
                        i9 = ((iM11308 ^ i7) * 20513) ^ 1886794155;
                        i3 = iM11308 ^ 1398763442;
                        i16 = i24;
                        sArr4 = sArr;
                        bundleRequireArguments = bundle;
                        i10 = i3;
                        i20 = i20;
                        c11718 = this;
                    } else {
                        i16 = i24;
                        int iM11309 = (i8 - ThreadFactoryC3888.m11306("ۤۜ")) * (-83);
                        s2 = s;
                        bundleRequireArguments = bundle;
                        i9 = ((iM11309 ^ i7) * (-19993)) ^ (-1516856781);
                        i10 = iM11309 ^ 359318853;
                        sArr4 = sArr;
                        c11718 = this;
                        i20 = i20;
                    }
                    break;
                case -1745639209:
                case 845596278:
                    short[] sArr5 = sArr4;
                    bundleRequireArguments = requireArguments();
                    sArr2 = f39370;
                    i22 = 6;
                    if (RunnableC0195.f1321 >= 0) {
                        sArr4 = sArr5;
                        i20 = 296;
                        int iM450211 = C19806.m45029("֨᩻") ^ i8;
                        i9 = ((iM450211 ^ i7) * 18573) ^ (-498331329);
                        i10 = iM450211 ^ (-8287008);
                        c11718 = this;
                    } else {
                        int iM113010 = (ThreadFactoryC3888.m11306("᩺ۡ") + i8) * (-25);
                        i10 = iM113010 ^ 1732883715;
                        i9 = ((iM113010 ^ i7) * 1503) ^ (-533229113);
                        sArr4 = sArr5;
                        i20 = 296;
                    }
                    break;
                case -1686063984:
                case -1217311646:
                    sb = new StringBuilder();
                    C2788.m8480(sb, C22627.m50150(m29301()));
                    if (C1025.f4800 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۫᩸") ^ i7;
                        i = ((iM45029 ^ i8) * (-9309)) ^ 1479975283;
                        i2 = 553627358;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۫ۧ") ^ i7;
                        i = ((iM45029 ^ i8) * 4555) ^ (-2092507173);
                        i2 = 1551362531;
                    }
                    i10 = iM45029 ^ i2;
                    i9 = i;
                    break;
                case -1679082201:
                case 1758902403:
                    C1460.m5050();
                    s = s2;
                    bundle = bundleRequireArguments;
                    i20 = i20;
                    sArr = sArr4;
                    int iM113011 = (i8 - ThreadFactoryC3888.m11306("ۤۜ")) * (-83);
                    s2 = s;
                    bundleRequireArguments = bundle;
                    i9 = ((iM113011 ^ i7) * (-19993)) ^ (-1516856781);
                    i10 = iM113011 ^ 359318853;
                    sArr4 = sArr;
                    c11718 = this;
                    i20 = i20;
                    break;
                case -1368502565:
                case 229894716:
                    bundleRequireArguments = bundleRequireArguments;
                    i20 = i20;
                    sArr4 = sArr4;
                    if (c11718.f39379 == null) {
                        iM450210 = C19806.m45029("֫ۢ") ^ i8;
                        i4 = ((iM450210 ^ i7) * (-603)) ^ (-1873931854);
                        i5 = -812537497;
                    } else {
                        iM450210 = C19806.m45029("᩷᩷") ^ i7;
                        i4 = ((iM450210 ^ i8) * (-7553)) ^ (-2126479883);
                        i5 = -2047607263;
                    }
                    i6 = iM450210 ^ i5;
                    bundleRequireArguments = bundleRequireArguments;
                    i10 = i6;
                    i9 = i4;
                    sArr4 = sArr4;
                    i20 = i20;
                    break;
                case -1231546935:
                case 1294785542:
                    C1668.m5583();
                    return null;
                case -1214851473:
                case 1937930231:
                    bundleRequireArguments = bundleRequireArguments;
                    i20 = i20;
                    sArr4 = sArr4;
                    int i25 = i18 + i19;
                    if (i17 - (i25 + i25) <= 0) {
                        iM450210 = ThreadFactoryC3888.m11306("᩸ܶ") ^ i7;
                        i4 = ((iM450210 ^ i8) * (-7817)) ^ (-655936881);
                        i5 = 1330813700;
                    } else {
                        iM450210 = (C19806.m45029("᩷ᩳ") ^ i7) * 101;
                        i4 = ((iM450210 ^ i8) * 11557) ^ (-1277682533);
                        i5 = 1813583090;
                    }
                    i6 = iM450210 ^ i5;
                    bundleRequireArguments = bundleRequireArguments;
                    i10 = i6;
                    i9 = i4;
                    sArr4 = sArr4;
                    i20 = i20;
                    break;
                case -788997523:
                case 313432411:
                    C2788.m8480(sb, C0797.m3361(sArr4, i12, i13, i15));
                    strM10952 = C3743.m10952(str, 0, i11);
                    if (!C2332.f8260) {
                        s = s2;
                        bundle = bundleRequireArguments;
                        i20 = i20;
                        sArr = sArr4;
                        int iM113012 = (i8 - ThreadFactoryC3888.m11306("ۤۜ")) * (-83);
                        s2 = s;
                        bundleRequireArguments = bundle;
                        i9 = ((iM113012 ^ i7) * (-19993)) ^ (-1516856781);
                        i10 = iM113012 ^ 359318853;
                        sArr4 = sArr;
                        c11718 = this;
                        i20 = i20;
                    } else {
                        iM45029 = C19806.m45029("ܽܰ") ^ i8;
                        i = ((iM45029 ^ i7) * 12471) ^ 1665673896;
                        i2 = -793451254;
                        i10 = iM45029 ^ i2;
                        i9 = i;
                    }
                    break;
                case -686112201:
                case 600074584:
                    sArr4 = f39370;
                    i12 = 307;
                    i13 = 1;
                    if (C0629.f2722 > 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩳ۬") + i7) * 49;
                        i = ((iM45029 ^ i8) * 12541) ^ (-1656434563);
                        i2 = 1667081627;
                        i10 = iM45029 ^ i2;
                        i9 = i;
                    } else {
                        int iM450212 = C19806.m45029("֨᩻") ^ i8;
                        i9 = ((iM450212 ^ i7) * 18573) ^ (-498331329);
                        i10 = iM450212 ^ (-8287008);
                        c11718 = this;
                    }
                    break;
                case -498693992:
                case 202368437:
                    sb2 = new StringBuilder();
                    strM50150 = C22627.m50150(m29301());
                    if (C7105.m18985()) {
                        iM45029 = ThreadFactoryC3888.m11306("۟ᩴ") ^ i8;
                        i = ((iM45029 ^ i7) * (-21297)) ^ 1863957759;
                        i2 = 817160401;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳܶ") ^ i8;
                        i = ((iM45029 ^ i7) * 19933) ^ 884401384;
                        i2 = -1305502640;
                    }
                    i10 = iM45029 ^ i2;
                    i9 = i;
                    break;
                case -363982764:
                case 349733707:
                    C1148.m4223(sb2, strM50150);
                    sArr3 = f39370;
                    i14 = 302;
                    if (C0817.f3443) {
                        iM45029 = (i7 - ThreadFactoryC3888.m11306("ۧۚ")) * 5;
                        i = ((iM45029 ^ i8) * 3835) ^ 404840842;
                        i2 = -1892369389;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۟ᩴ") ^ i8;
                        i = ((iM45029 ^ i7) * (-21297)) ^ 1863957759;
                        i2 = 817160401;
                    }
                    i10 = iM45029 ^ i2;
                    i9 = i;
                    break;
                case -281826996:
                case -246924937:
                    C2788.m8480(sb2, MenuItemOnMenuItemClickListenerC3244.m9715(sArr3, i14, 5, i15));
                    if (C1398.f5802 > 0) {
                        iM45029 = (C19806.m45029("ܿ᩹") + i8) * 45;
                        i = ((iM45029 ^ i7) * 6987) ^ (-1556554835);
                        i2 = -372623828;
                        i10 = iM45029 ^ i2;
                        i9 = i;
                    } else {
                        bundleRequireArguments = bundleRequireArguments;
                        i20 = i20;
                        sArr4 = sArr4;
                        iM450210 = (C19806.m45029("֨ۢ") ^ i7) * (-103);
                        i4 = ((iM450210 ^ i8) * (-23575)) ^ (-152903341);
                        i5 = 1622736402;
                        i6 = iM450210 ^ i5;
                        bundleRequireArguments = bundleRequireArguments;
                        i10 = i6;
                        i9 = i4;
                        sArr4 = sArr4;
                        i20 = i20;
                    }
                    break;
                case -96211674:
                case 1765817139:
                    return c11718.f39379;
                case -72260930:
                case 188547679:
                    bundleRequireArguments = bundleRequireArguments;
                    i20 = i20;
                    sArr4 = sArr4;
                    i17 = i16 * i16;
                    i18 = s2 * s2;
                    i19 = 208224900;
                    if (C0278.f1572 <= 0) {
                        iM450210 = (C19806.m45029("֨ۢ") ^ i7) * (-103);
                        i4 = ((iM450210 ^ i8) * (-23575)) ^ (-152903341);
                        i5 = 1622736402;
                    } else {
                        iM450210 = C19806.m45029("ۤۗ") ^ i8;
                        i4 = ((iM450210 ^ i7) * 9831) ^ (-681626211);
                        i5 = 736107683;
                    }
                    i6 = iM450210 ^ i5;
                    bundleRequireArguments = bundleRequireArguments;
                    i10 = i6;
                    i9 = i4;
                    sArr4 = sArr4;
                    i20 = i20;
                    break;
                case 208569013:
                case 1851600078:
                    i15 = 16771;
                    iM450210 = (C19806.m45029("ۡ۬") + i8) * 123;
                    i4 = ((iM450210 ^ i7) * 1659) ^ (-1073119716);
                    i5 = -642152771;
                    i6 = iM450210 ^ i5;
                    bundleRequireArguments = bundleRequireArguments;
                    i10 = i6;
                    i9 = i4;
                    sArr4 = sArr4;
                    i20 = i20;
                    break;
                case 329568320:
                case 820182365:
                    i15 = 59283;
                    iM450210 = (C19806.m45029("ۡ۬") + i8) * 123;
                    i4 = ((iM450210 ^ i7) * 1659) ^ (-1073119716);
                    i5 = -642152771;
                    i6 = iM450210 ^ i5;
                    bundleRequireArguments = bundleRequireArguments;
                    i10 = i6;
                    i9 = i4;
                    sArr4 = sArr4;
                    i20 = i20;
                    break;
                case 639732480:
                case 1598817236:
                    C0278.m1789();
                    if (C2249.m6915() > 0) {
                        bundleRequireArguments = bundleRequireArguments;
                        i20 = i20;
                        sArr4 = sArr4;
                        iM450210 = (C19806.m45029("֨ۢ") ^ i7) * (-103);
                        i4 = ((iM450210 ^ i8) * (-23575)) ^ (-152903341);
                        i5 = 1622736402;
                        i6 = iM450210 ^ i5;
                        bundleRequireArguments = bundleRequireArguments;
                        i10 = i6;
                        i9 = i4;
                        sArr4 = sArr4;
                        i20 = i20;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۟ᩴ") ^ i8;
                        i = ((iM45029 ^ i7) * (-21297)) ^ 1863957759;
                        i2 = 817160401;
                        i10 = iM45029 ^ i2;
                        i9 = i;
                    }
                    break;
                case 784917629:
                case 960691425:
                    i20 = i20;
                    int i26 = i22;
                    Bundle bundle2 = bundleRequireArguments;
                    String strM10776 = C3660.m10776(bundle2, RunnableC1895.m6164(sArr2, i20, i26, i15));
                    if (strM10776 != null) {
                        int iM450213 = C19806.m45029("᩷۬") ^ i7;
                        i9 = ((iM450213 ^ i8) * (-19777)) ^ (-1624105262);
                        i22 = i26;
                        str = strM10776;
                        bundleRequireArguments = bundle2;
                        i23 = 80;
                        i10 = iM450213 ^ 170291792;
                    } else {
                        int iM113013 = (ThreadFactoryC3888.m11306("֨ۜ") + i7) * (-33);
                        sArr4 = sArr4;
                        i4 = ((iM113013 ^ i8) * 22291) ^ 378063403;
                        i6 = iM113013 ^ 1804591133;
                        i22 = i26;
                        str = strM10776;
                        bundleRequireArguments = bundle2;
                        i23 = 80;
                        i10 = i6;
                        i9 = i4;
                        sArr4 = sArr4;
                    }
                    i20 = i20;
                    break;
                case 818176625:
                case 1048875485:
                    bundle = bundleRequireArguments;
                    i20 = i20;
                    sArr = sArr4;
                    s2 = f39370[295];
                    if (C1189.f5284 > 0) {
                        int iM113014 = (i7 - ThreadFactoryC3888.m11306("ۧܶ")) * (-65);
                        i9 = ((iM113014 ^ i8) * 20485) ^ (-1376379272);
                        i3 = iM113014 ^ 1549023159;
                        sArr4 = sArr;
                        bundleRequireArguments = bundle;
                        i10 = i3;
                        i20 = i20;
                        c11718 = this;
                    } else {
                        sArr4 = sArr;
                        bundleRequireArguments = bundle;
                        i20 = i20;
                        int iM450214 = C19806.m45029("֨᩻") ^ i8;
                        i9 = ((iM450214 ^ i7) * 18573) ^ (-498331329);
                        i10 = iM450214 ^ (-8287008);
                        c11718 = this;
                    }
                    break;
                case 1615618881:
                case 2047129218:
                    c11718.f39379 = C13012.m32189(i23, C0817.m3407(sb2));
                    bundleRequireArguments = bundleRequireArguments;
                    i20 = i20;
                    sArr4 = sArr4;
                    iM450210 = C19806.m45029("᩷᩷") ^ i7;
                    i4 = ((iM450210 ^ i8) * (-7553)) ^ (-2126479883);
                    i5 = -2047607263;
                    i6 = iM450210 ^ i5;
                    bundleRequireArguments = bundleRequireArguments;
                    i10 = i6;
                    i9 = i4;
                    sArr4 = sArr4;
                    i20 = i20;
                    break;
                default:
                    C3286.m9798();
                    if (!RunnableC1564.f6300) {
                        iM45029 = ThreadFactoryC3888.m11306("۟ᩴ") ^ i8;
                        i = ((iM45029 ^ i7) * (-21297)) ^ 1863957759;
                        i2 = 817160401;
                        i10 = iM45029 ^ i2;
                        i9 = i;
                    } else {
                        s = s2;
                        bundle = bundleRequireArguments;
                        i20 = i20;
                        sArr = sArr4;
                        int iM113015 = (i8 - ThreadFactoryC3888.m11306("ۤۜ")) * (-83);
                        s2 = s;
                        bundleRequireArguments = bundle;
                        i9 = ((iM113015 ^ i7) * (-19993)) ^ (-1516856781);
                        i10 = iM113015 ^ 359318853;
                        sArr4 = sArr;
                        c11718 = this;
                        i20 = i20;
                    }
                    break;
            }
        }
    }

    @Override // l.AbstractC22611
    /* JADX INFO: renamed from: ۙ */
    public final void mo19344(C18377 c18377) {
        c18377.m42626(m29301());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m29270(C11718 c11718, AtomicBoolean atomicBoolean, EnumC9493 enumC9493) {
        int i = 1337745930;
        int i2 = RunnableC3388.f12514;
        int i3 = C2249.f8050;
        int iM45029 = (i2 - C19806.m45029("ܺܺ")) * (-15);
        int i4 = ((iM45029 ^ i3) * (-23161)) ^ 2035860379;
        int i5 = -1045740805;
        while (true) {
            i = ((((i ^ i3) * 7945) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -1754042955:
                case -697589628:
                    if (c11718.f39386) {
                        iM45029 = (C19806.m45029("ۗܶ") ^ i2) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM45029 ^ i3) * 16611) ^ 2141682712;
                        i5 = -1360531963;
                    } else {
                        iM45029 = (i3 - C19806.m45029("᩷֨")) * 51;
                        i4 = ((iM45029 ^ i2) * (-32479)) ^ (-123011153);
                        i5 = -1478617051;
                    }
                    break;
                case -1672556879:
                case 1699210864:
                    if (atomicBoolean.compareAndSet(true, false)) {
                        iM45029 = (i3 - C19806.m45029("᩷֨")) * 51;
                        i4 = ((iM45029 ^ i2) * (-32479)) ^ (-123011153);
                        i5 = -1478617051;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܿ۬") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-15677)) ^ 7001499;
                        i5 = 1302435596;
                    }
                    break;
                case -1527370363:
                case -217753488:
                    if (c11718.f39391) {
                        iM45029 = ThreadFactoryC3888.m11306("֫ۢ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-15153)) ^ (-266912655);
                        i5 = -1034550023;
                    } else {
                        iM45029 = (i3 - C19806.m45029("᩷֨")) * 51;
                        i4 = ((iM45029 ^ i2) * (-32479)) ^ (-123011153);
                        i5 = -1478617051;
                    }
                    break;
                case -1426057236:
                case -1249046886:
                    RunnableC1606.m5473();
                    if (!RunnableC1895.f7152) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܺܽ") ^ i3) * 19;
                        i4 = ((iM45029 ^ i2) * 9949) ^ (-604961376);
                        i5 = 611081373;
                    } else {
                        iM45029 = C19806.m45029("۟۫") ^ i2;
                        i4 = ((iM45029 ^ i3) * 1209) ^ (-1296979187);
                        i5 = -1042985695;
                    }
                    break;
                case -1422127447:
                case 915748800:
                    if (RunnableC1895.f7152) {
                        iM45029 = ThreadFactoryC3888.m11306("۬ܽ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 29343) ^ (-679138481);
                        i5 = -1529349616;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۛۤ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-26551)) ^ (-1331749851);
                        i5 = 1156501389;
                    }
                    break;
                case -1277011761:
                case 2085888116:
                    if (RunnableC0195.f1321 >= 0) {
                        iM45029 = C19806.m45029("۟۫") ^ i2;
                        i4 = ((iM45029 ^ i3) * 1209) ^ (-1296979187);
                        i5 = -1042985695;
                    } else {
                        iM45029 = C19806.m45029("ۙܶ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 8035) ^ 6243908;
                        i5 = -253473910;
                    }
                    break;
                case -1192412001:
                case 1169952943:
                    if (C0671.f2816 != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۛۤ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-26551)) ^ (-1331749851);
                        i5 = 1156501389;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۖ᩶")) * (-31);
                        i4 = ((iM45029 ^ i2) * 12759) ^ (-616777122);
                        i5 = 1877075635;
                    }
                    break;
                case -1129692869:
                case 814203288:
                    if (C2477.f9839 <= 0) {
                        iM45029 = C19806.m45029("۠ܳ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-32619)) ^ 791208265;
                        i5 = 730669942;
                    } else {
                        iM45029 = (C19806.m45029("᩶ۛ") ^ i2) * 69;
                        i4 = ((iM45029 ^ i3) * (-14119)) ^ (-1811207189);
                        i5 = 1510599993;
                    }
                    break;
                case -1115372238:
                case -604510308:
                    if (RunnableC0195.m1431()) {
                        iM45029 = C19806.m45029("ۨ֡") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-3623)) ^ (-686727744);
                        i5 = 38724791;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۛۤ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-26551)) ^ (-1331749851);
                        i5 = 1156501389;
                    }
                    break;
                case -1061587019:
                case -854821189:
                    if (C2704.m8255() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۛۤ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-26551)) ^ (-1331749851);
                        i5 = 1156501389;
                    } else {
                        iM45029 = C19806.m45029("ܿۤ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-7661)) ^ 1481968257;
                        i5 = 1761490411;
                    }
                    break;
                case -1028480489:
                case -603640569:
                    if (!C1461.m5080()) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܺܽ") ^ i3) * 19;
                        i4 = ((iM45029 ^ i2) * 9949) ^ (-604961376);
                        i5 = 611081373;
                    } else {
                        iM45029 = C19806.m45029("۠ܳ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-32619)) ^ 791208265;
                        i5 = 730669942;
                    }
                    break;
                case -744390338:
                case 161317234:
                    if (enumC9493.m24320()) {
                        iM45029 = (i3 - C19806.m45029("ۡ۬")) * (-105);
                        i4 = ((iM45029 ^ i2) * 4841) ^ 176807274;
                        i5 = -1040824424;
                    } else {
                        iM45029 = (i3 - C19806.m45029("᩷֨")) * 51;
                        i4 = ((iM45029 ^ i2) * (-32479)) ^ (-123011153);
                        i5 = -1478617051;
                    }
                    break;
                case -621877925:
                case -362092865:
                    if (C3577.f13150 >= 0) {
                        iM45029 = (C19806.m45029("ܶ᩻") + i3) * (-89);
                        i4 = ((iM45029 ^ i2) * 23761) ^ (-476534893);
                        i5 = -543988037;
                    } else {
                        iM45029 = C19806.m45029("۟۫") ^ i2;
                        i4 = ((iM45029 ^ i3) * 1209) ^ (-1296979187);
                        i5 = -1042985695;
                    }
                    break;
                case -356220903:
                case 37085953:
                    C2332.m7081(new C4661(c11718));
                    iM45029 = (i3 - C19806.m45029("᩷֨")) * 51;
                    i4 = ((iM45029 ^ i2) * (-32479)) ^ (-123011153);
                    i5 = -1478617051;
                    break;
                case -240550881:
                case -151116847:
                    if (C3743.m10966() <= 0) {
                        iM45029 = C19806.m45029("۠ܳ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-32619)) ^ 791208265;
                        i5 = 730669942;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۢܰ") + i3) * (-121);
                        i4 = ((iM45029 ^ i2) * (-27629)) ^ (-549131051);
                        i5 = 640906411;
                    }
                    break;
                case -223652445:
                case 1584610413:
                    if (C1460.f5948 >= 0) {
                        iM45029 = (C19806.m45029("ܶ᩻") + i3) * (-89);
                        i4 = ((iM45029 ^ i2) * 23761) ^ (-476534893);
                        i5 = -543988037;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֡֫") ^ i2;
                        i4 = ((iM45029 ^ i3) * 23201) ^ 763878582;
                        i5 = -531778098;
                    }
                    break;
                case -184893537:
                case 1733483413:
                    break;
                case 783561251:
                case 1607821170:
                    ThreadFactoryC3888.m11300();
                    break;
                case 1581533310:
                case 1689548462:
                    if (C2249.f8050 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܺܽ") ^ i3) * 19;
                        i4 = ((iM45029 ^ i2) * 9949) ^ (-604961376);
                        i5 = 611081373;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۛܺ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 15643) ^ 71245435;
                        i5 = 1823178659;
                    }
                    break;
                case 1652177367:
                case 2119037019:
                    if (C2642.m8171() != 0) {
                        iM45029 = (C19806.m45029("ܶ᩻") + i3) * (-89);
                        i4 = ((iM45029 ^ i2) * 23761) ^ (-476534893);
                        i5 = -543988037;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۢ᩵") ^ i3) * 83;
                        i4 = ((iM45029 ^ i2) * 29127) ^ 1090620029;
                        i5 = -658773397;
                    }
                    break;
                default:
                    C1668.m5583();
                    C7105.m18985();
                    iM45029 = C19806.m45029("۟۫") ^ i2;
                    i4 = ((iM45029 ^ i3) * 1209) ^ (-1296979187);
                    i5 = -1042985695;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x008b  */
    /* JADX WARN: Code duplicated, block: B:43:0x015e A[PHI: r10 r12
      0x015e: PHI (r10v4 java.lang.Integer) = (r10v3 java.lang.Integer), (r10v2 java.lang.Integer), (r10v2 java.lang.Integer) binds: [B:42:0x015c, B:34:0x0119, B:15:0x0082] A[DONT_GENERATE, DONT_INLINE]
      0x015e: PHI (r12v4 char) = (r12v2 char), (r12v3 char), (r12v2 char) binds: [B:42:0x015c, B:34:0x0119, B:15:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x0208 A[PHI: r5
      0x0208: PHI (r5v4 int) = (r5v3 int), (r5v2 int) binds: [B:56:0x01f0, B:25:0x00b5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x023b  */
    /* JADX WARN: Code duplicated, block: B:77:0x02ee A[PHI: r17
      0x02ee: PHI (r17v4 short) = (r17v3 short), (r17v2 short), (r17v2 short) binds: [B:76:0x02ec, B:12:0x007d, B:9:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:81:0x031f A[PHI: r8 r9 r16 r22
      0x031f: PHI (r8v4 java.lang.Integer) = (r8v2 java.lang.Integer), (r8v2 java.lang.Integer), (r8v3 java.lang.Integer), (r8v2 java.lang.Integer) binds: [B:80:0x031d, B:72:0x02c9, B:46:0x0194, B:9:0x0077] A[DONT_GENERATE, DONT_INLINE]
      0x031f: PHI (r9v4 l.ۛܳۖ) = (r9v2 l.ۛܳۖ), (r9v2 l.ۛܳۖ), (r9v3 l.ۛܳۖ), (r9v2 l.ۛܳۖ) binds: [B:80:0x031d, B:72:0x02c9, B:46:0x0194, B:9:0x0077] A[DONT_GENERATE, DONT_INLINE]
      0x031f: PHI (r16v4 int) = (r16v2 int), (r16v3 int), (r16v2 int), (r16v2 int) binds: [B:80:0x031d, B:72:0x02c9, B:46:0x0194, B:9:0x0077] A[DONT_GENERATE, DONT_INLINE]
      0x031f: PHI (r22v5 short) = (r22v3 short), (r22v4 short), (r22v3 short), (r22v3 short) binds: [B:80:0x031d, B:72:0x02c9, B:46:0x0194, B:9:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:85:0x034d A[PHI: r6 r7 r11 r13
      0x034d: PHI (r6v4 int) = (r6v2 int), (r6v3 int), (r6v2 int), (r6v2 int) binds: [B:84:0x034b, B:50:0x01bb, B:38:0x0137, B:30:0x00f7] A[DONT_GENERATE, DONT_INLINE]
      0x034d: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int) binds: [B:84:0x034b, B:50:0x01bb, B:38:0x0137, B:30:0x00f7] A[DONT_GENERATE, DONT_INLINE]
      0x034d: PHI (r11v4 java.lang.Object[]) = (r11v2 java.lang.Object[]), (r11v2 java.lang.Object[]), (r11v3 java.lang.Object[]), (r11v2 java.lang.Object[]) binds: [B:84:0x034b, B:50:0x01bb, B:38:0x0137, B:30:0x00f7] A[DONT_GENERATE, DONT_INLINE]
      0x034d: PHI (r13v3 short[]) = (r13v2 short[]), (r13v2 short[]), (r13v2 short[]), (r13v4 short[]) binds: [B:84:0x034b, B:50:0x01bb, B:38:0x0137, B:30:0x00f7] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.InterfaceC3976
    /* JADX INFO: renamed from: ۙ */
    public final void mo11470(int i, int i2, String str) {
        int iM45029;
        int i3;
        int i4;
        int i5 = C2788.f10625;
        int i6 = C2477.f9839;
        int iM11306 = ThreadFactoryC3888.m11306("۬ᩴ") ^ i6;
        int i7 = ((iM11306 ^ i5) * 21243) ^ 787316275;
        Object[] objArr = null;
        short[] sArr = null;
        int i8 = iM11306 ^ 1000419864;
        int i9 = 0;
        int i10 = 0;
        char c = 0;
        int i11 = 0;
        int i12 = 0;
        short s = 0;
        int i13 = 1706516456;
        short s2 = 0;
        Integer numM4234 = null;
        C6111 c6111 = null;
        Integer numM8476 = null;
        int iM16981 = 0;
        while (true) {
            i13 = i8 ^ (i7 & (((i13 ^ i5) * 25629) >> 31));
            switch (i13) {
                case -2120381451:
                case -1158855663:
                    this.f39383 = str;
                    iM45029 = ThreadFactoryC3888.m11306("᩶ۡ") ^ i5;
                    i3 = ((iM45029 ^ i6) * (-9873)) ^ (-451427466);
                    i4 = -1377080825;
                    i8 = iM45029 ^ i4;
                    i7 = i3;
                    break;
                case -2097797137:
                case 1804709050:
                    s = f39370[308];
                    if (C1937.f7317 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۛ᩹") ^ i5;
                        i3 = ((iM45029 ^ i6) * 16973) ^ 1135809120;
                        i4 = -479624245;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۧۗ") ^ i5) * 57;
                        i3 = ((iM45029 ^ i6) * (-23259)) ^ (-95310904);
                        i4 = -1486157687;
                    }
                    i8 = iM45029 ^ i4;
                    i7 = i3;
                    break;
                case -1988432058:
                case 1612107890:
                    if (i == 0) {
                        iM45029 = (i6 - ThreadFactoryC3888.m11306("ۤ۬")) * (-97);
                        i3 = ((iM45029 ^ i5) * 10003) ^ 251224447;
                        i4 = -2147300065;
                    } else {
                        iM45029 = C19806.m45029("ܿܺ") ^ i6;
                        i3 = ((iM45029 ^ i5) * (-2743)) ^ (-234104303);
                        i4 = 2056971684;
                    }
                    i8 = iM45029 ^ i4;
                    i7 = i3;
                    break;
                case -1814884336:
                case 714215329:
                    if (RunnableC1606.f6488 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۚᩳ") ^ i6;
                        i3 = ((iM45029 ^ i5) * 13259) ^ (-686213241);
                        i4 = 1231379002;
                    } else {
                        iM45029 = C19806.m45029("ۧ᩺") ^ i6;
                        i3 = ((iM45029 ^ i5) * (-667)) ^ 987153346;
                        i4 = -221785742;
                    }
                    i8 = iM45029 ^ i4;
                    i7 = i3;
                    break;
                case -1747291249:
                case 90247135:
                    i12 = s * 62392;
                    s2 = 15598;
                    if (C1066.m4023() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۚᩳ") ^ i6;
                        i3 = ((iM45029 ^ i5) * 13259) ^ (-686213241);
                        i4 = 1231379002;
                    } else {
                        iM45029 = (C19806.m45029("ۖ֡") ^ i6) * 109;
                        i3 = ((iM45029 ^ i5) * 18943) ^ 146407682;
                        i4 = -1211701791;
                    }
                    i8 = iM45029 ^ i4;
                    i7 = i3;
                    break;
                case -1732021023:
                case 1876271098:
                    objArr[0] = numM8476;
                    objArr[i10] = numM4234;
                    c = 2;
                    if (C1668.f6641 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩴۘ") + i6) * (-107);
                        i3 = ((iM45029 ^ i5) * 1429) ^ (-725056872);
                        i4 = -354274140;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩺֡") ^ i6;
                        i3 = ((iM45029 ^ i5) * (-13015)) ^ (-1965797844);
                        i4 = 340266711;
                    }
                    i8 = iM45029 ^ i4;
                    i7 = i3;
                    break;
                case -1551072629:
                case 963614693:
                    i10 = 1;
                    iM16981 = this.f39378.m16981(i) + 1;
                    if (RunnableC3388.f12514 >= 0) {
                        iM45029 = C19806.m45029("ۙۜ") ^ i5;
                        i3 = ((iM45029 ^ i6) * 20821) ^ 1727827045;
                        i4 = 867104072;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܽ᩻") ^ i6;
                        i3 = ((iM45029 ^ i5) * (-25271)) ^ (-1550833262);
                        i4 = -835802108;
                    }
                    i8 = iM45029 ^ i4;
                    i7 = i3;
                    break;
                case -1491758338:
                case -51361186:
                    break;
                case -1372812868:
                case 1147064804:
                    i11 = 64399;
                    iM45029 = (ThreadFactoryC3888.m11306("ۡ᩺") ^ i6) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i3 = ((iM45029 ^ i5) * 24467) ^ 918832215;
                    i4 = 848062407;
                    i8 = iM45029 ^ i4;
                    i7 = i3;
                    break;
                case -1300321340:
                case 1551326764:
                    C1398.m4895();
                    ViewTreeObserverOnPreDrawListenerC3327.m9874();
                    break;
                case -1105244108:
                case 458091568:
                    numM8476 = C2788.m8476(iM16981);
                    c6111 = this.f39378;
                    if (C2124.f7782 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۚᩳ") ^ i6;
                        i3 = ((iM45029 ^ i5) * 13259) ^ (-686213241);
                        i4 = 1231379002;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֡֨") + i5) * (-23);
                        i3 = ((iM45029 ^ i6) * (-31659)) ^ 595516761;
                        i4 = -1505859534;
                    }
                    i8 = iM45029 ^ i4;
                    i7 = i3;
                    break;
                case -1098627434:
                case 168979170:
                    this.f39383 = String.format(C1461.m5070(sArr, 309, 14, i11), objArr);
                    iM45029 = ThreadFactoryC3888.m11306("᩶ۡ") ^ i5;
                    i3 = ((iM45029 ^ i6) * (-9873)) ^ (-451427466);
                    i4 = -1377080825;
                    i8 = iM45029 ^ i4;
                    i7 = i3;
                    break;
                case -655612751:
                case 2013707258:
                    m29288();
                    break;
                case -600613091:
                case 481529267:
                    objArr = new Object[3];
                    if (RunnableC1895.f7152) {
                        iM45029 = ThreadFactoryC3888.m11306("۫᩶") ^ i6;
                        i3 = ((iM45029 ^ i5) * (-12813)) ^ (-149112750);
                        i4 = 535063039;
                    } else {
                        iM45029 = C19806.m45029("ۙۜ") ^ i5;
                        i3 = ((iM45029 ^ i6) * 20821) ^ 1727827045;
                        i4 = 867104072;
                    }
                    i8 = iM45029 ^ i4;
                    i7 = i3;
                    break;
                case -499219317:
                case 1594920589:
                    i11 = 30571;
                    iM45029 = (ThreadFactoryC3888.m11306("ۡ᩺") ^ i6) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i3 = ((iM45029 ^ i5) * 24467) ^ 918832215;
                    i4 = 848062407;
                    i8 = iM45029 ^ i4;
                    i7 = i3;
                    break;
                case -431962947:
                case 858824239:
                    C10634.m26820();
                    if (RunnableC1606.f6488 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۛ᩹") ^ i5;
                        i3 = ((iM45029 ^ i6) * 16973) ^ 1135809120;
                        i4 = -479624245;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۚᩳ") ^ i6;
                        i3 = ((iM45029 ^ i5) * 13259) ^ (-686213241);
                        i4 = 1231379002;
                    }
                    i8 = iM45029 ^ i4;
                    i7 = i3;
                    break;
                case -343096486:
                case -255178338:
                    C7105.m18985();
                    C10634.m26820();
                    iM45029 = (i5 - C19806.m45029("᩷ۗ")) * 119;
                    i3 = ((iM45029 ^ i6) * (-24893)) ^ (-676779500);
                    i4 = -1024445058;
                    i8 = iM45029 ^ i4;
                    i7 = i3;
                    break;
                case -42468845:
                case 52934943:
                    this.f39383 = null;
                    iM45029 = ThreadFactoryC3888.m11306("᩶ۡ") ^ i5;
                    i3 = ((iM45029 ^ i6) * (-9873)) ^ (-451427466);
                    i4 = -1377080825;
                    i8 = iM45029 ^ i4;
                    i7 = i3;
                    break;
                case -37936571:
                case 648019550:
                    if (i2 == 0) {
                        iM45029 = (C19806.m45029("ۙ᩹") + i5) * (-97);
                        i3 = ((iM45029 ^ i6) * (-12417)) ^ (-2143873488);
                        i4 = -214354123;
                    } else {
                        iM45029 = C19806.m45029("ܿܺ") ^ i6;
                        i3 = ((iM45029 ^ i5) * (-2743)) ^ (-234104303);
                        i4 = 2056971684;
                    }
                    i8 = iM45029 ^ i4;
                    i7 = i3;
                    break;
                case 178979985:
                case 1337424955:
                    i9 = -1;
                    if (i == -1) {
                        iM45029 = ThreadFactoryC3888.m11306("۠۠") ^ i6;
                        i3 = ((iM45029 ^ i5) * (-23709)) ^ 408456738;
                        i4 = 413757229;
                    } else {
                        iM45029 = (C19806.m45029("ܰܳ") + i5) * 119;
                        i3 = ((iM45029 ^ i6) * (-17569)) ^ 118988353;
                        i4 = 1259701050;
                    }
                    i8 = iM45029 ^ i4;
                    i7 = i3;
                    break;
                case 402551821:
                case 914851811:
                    if (C1025.f4800 >= 0) {
                        iM45029 = (i5 - C19806.m45029("᩷ۗ")) * 119;
                        i3 = ((iM45029 ^ i6) * (-24893)) ^ (-676779500);
                        i4 = -1024445058;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩴۘ") + i6) * (-107);
                        i3 = ((iM45029 ^ i5) * 1429) ^ (-725056872);
                        i4 = -354274140;
                    }
                    i8 = iM45029 ^ i4;
                    i7 = i3;
                    break;
                case 455581409:
                case 961851917:
                    if (C0050.f912 > 0) {
                        iM45029 = (i5 - C19806.m45029("᩷ۗ")) * 119;
                        i3 = ((iM45029 ^ i6) * (-24893)) ^ (-676779500);
                        i4 = -1024445058;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۛ᩹") ^ i5;
                        i3 = ((iM45029 ^ i6) * 16973) ^ 1135809120;
                        i4 = -479624245;
                    }
                    i8 = iM45029 ^ i4;
                    i7 = i3;
                    break;
                case 643281220:
                case 922014568:
                    if (this.f39391) {
                        iM45029 = (C19806.m45029("ۗ۫") + i5) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i3 = ((iM45029 ^ i6) * (-589)) ^ 782939968;
                        i4 = 1341098516;
                    } else {
                        iM45029 = (i5 - ThreadFactoryC3888.m11306("۫᩻")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i3 = ((iM45029 ^ i6) * (-22221)) ^ 1736273672;
                        i4 = 428797352;
                    }
                    i8 = iM45029 ^ i4;
                    i7 = i3;
                    break;
                case 1267779070:
                case 2087142877:
                    if (RunnableC3388.f12514 >= 0) {
                        iM45029 = C19806.m45029("ۙۜ") ^ i5;
                        i3 = ((iM45029 ^ i6) * 20821) ^ 1727827045;
                        i4 = 867104072;
                    } else {
                        iM45029 = (i5 - C19806.m45029("۫᩵")) * (-51);
                        i3 = ((iM45029 ^ i6) * (-2577)) ^ (-323553153);
                        i4 = -230414868;
                    }
                    i8 = iM45029 ^ i4;
                    i7 = i3;
                    break;
                case 1611363913:
                case 1754838467:
                    if (i2 == i9) {
                        iM45029 = ThreadFactoryC3888.m11306("֫ۡ") ^ i6;
                        i3 = ((iM45029 ^ i5) * 21897) ^ (-690781446);
                        i4 = -240370803;
                    } else {
                        iM45029 = (C19806.m45029("ܰܳ") + i5) * 119;
                        i3 = ((iM45029 ^ i6) * (-17569)) ^ 118988353;
                        i4 = 1259701050;
                    }
                    i8 = iM45029 ^ i4;
                    i7 = i3;
                    break;
                case 1632034679:
                case 1800481769:
                    numM4234 = C1148.m4234(c6111.m16981(i2) + i10);
                    if (C1460.f5948 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩴۘ") + i6) * (-107);
                        i3 = ((iM45029 ^ i5) * 1429) ^ (-725056872);
                        i4 = -354274140;
                    } else {
                        iM45029 = C19806.m45029("ܽܿ") ^ i5;
                        i3 = ((iM45029 ^ i6) * (-7005)) ^ (-146843232);
                        i4 = 165499497;
                    }
                    i8 = iM45029 ^ i4;
                    i7 = i3;
                    break;
                case 1685729886:
                case 2131170373:
                    objArr[c] = str;
                    sArr = f39370;
                    if (C1977.f7413 <= 0) {
                        iM45029 = C19806.m45029("ۙۜ") ^ i5;
                        i3 = ((iM45029 ^ i6) * 20821) ^ 1727827045;
                        i4 = 867104072;
                    } else {
                        iM45029 = C19806.m45029("ܰᩳ") ^ i5;
                        i3 = ((iM45029 ^ i6) * (-9727)) ^ 1010368271;
                        i4 = -537101961;
                    }
                    i8 = iM45029 ^ i4;
                    i7 = i3;
                    break;
                default:
                    int i14 = s + s2;
                    if ((i14 * i14) - i12 < 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩸ܶ") ^ i5;
                        i3 = ((iM45029 ^ i6) * 14237) ^ (-1060130954);
                        i4 = 2076268756;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۛ۠") ^ i6;
                        i3 = ((iM45029 ^ i5) * (-3697)) ^ 778007541;
                        i4 = -1844487936;
                    }
                    i8 = iM45029 ^ i4;
                    i7 = i3;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00e7 A[PHI: r4 r5
      0x00e7: PHI (r4v4 byte) = (r4v3 byte), (r4v2 byte), (r4v2 byte) binds: [B:32:0x00e5, B:24:0x00a5, B:12:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x00e7: PHI (r5v4 l.ܿۧ᩺) = (r5v2 l.ܿۧ᩺), (r5v3 l.ܿۧ᩺), (r5v2 l.ܿۧ᩺) binds: [B:32:0x00e5, B:24:0x00a5, B:12:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x0142  */
    /* JADX WARN: Code duplicated, block: B:60:0x020f A[PHI: r8 r9 r10 r11
      0x020f: PHI (r8v4 short) = (r8v3 short), (r8v2 short) binds: [B:59:0x020d, B:55:0x01ee] A[DONT_GENERATE, DONT_INLINE]
      0x020f: PHI (r9v4 short) = (r9v3 short), (r9v2 short) binds: [B:59:0x020d, B:55:0x01ee] A[DONT_GENERATE, DONT_INLINE]
      0x020f: PHI (r10v3 int) = (r10v2 int), (r10v4 int) binds: [B:59:0x020d, B:55:0x01ee] A[DONT_GENERATE, DONT_INLINE]
      0x020f: PHI (r11v3 int) = (r11v2 int), (r11v4 int) binds: [B:59:0x020d, B:55:0x01ee] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0243 A[PHI: r7 r14 r15
      0x0243: PHI (r7v5 char) = (r7v3 char), (r7v2 char), (r7v2 char) binds: [B:63:0x0241, B:28:0x00c6, B:6:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x0243: PHI (r14v5 short[]) = (r14v2 short[]), (r14v3 short[]), (r14v2 short[]) binds: [B:63:0x0241, B:28:0x00c6, B:6:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x0243: PHI (r15v5 int) = (r15v2 int), (r15v3 int), (r15v2 int) binds: [B:63:0x0241, B:28:0x00c6, B:6:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x0274 A[PHI: r2 r3 r20
      0x0274: PHI (r2v4 l.ܿۧ᩺) = (r2v2 l.ܿۧ᩺), (r2v3 l.ܿۧ᩺), (r2v2 l.ܿۧ᩺) binds: [B:67:0x0272, B:36:0x011f, B:9:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x0274: PHI (r3v4 int) = (r3v2 int), (r3v3 int), (r3v2 int) binds: [B:67:0x0272, B:36:0x011f, B:9:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x0274: PHI (r20v5 short[]) = (r20v4 short[]), (r20v3 short[]), (r20v3 short[]) binds: [B:67:0x0272, B:36:0x011f, B:9:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x02a6 A[PHI: r12
      0x02a6: PHI (r12v4 int) = (r12v2 int), (r12v3 int), (r12v2 int), (r12v2 int), (r12v2 int), (r12v2 int) binds: [B:71:0x02a4, B:51:0x01cc, B:14:0x0063, B:12:0x005f, B:9:0x0059, B:6:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m29274(C11718 c11718, DialogInterfaceC19356 dialogInterfaceC19356) {
        int iM45029;
        int i;
        int i2;
        int i3 = RunnableC1606.f6488;
        int i4 = C1668.f6641;
        int iM11306 = (ThreadFactoryC3888.m11306("ۜۛ") ^ i4) * 49;
        int i5 = ((iM11306 ^ i3) * 10515) ^ 131524655;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM11306 ^ (-753786121);
        InterfaceC17314 interfaceC17314M8257 = null;
        int i7 = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = -534584936;
        InterfaceC17314 interfaceC17314Mo4064 = null;
        byte b = 0;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i3) * (-20865)) >> 31));
            switch (i13) {
                case -2142530951:
                case 1179036986:
                    C1668.m5572(dialogInterfaceC19356);
                    if (c11718.f39392 == c11718.f39371) {
                        iM45029 = C19806.m45029("᩶ۛ") ^ i3;
                        i = ((iM45029 ^ i4) * 25563) ^ 644178727;
                        i2 = 993712541;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܶ֨") ^ i4;
                        i = ((iM45029 ^ i3) * 3973) ^ (-805516997);
                        i2 = -504620491;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -2077313939:
                case 1905051921:
                    if (i8 - (i9 + i10) > 0) {
                        iM45029 = (C19806.m45029("ۙܳ") ^ i4) * (-99);
                        i = ((iM45029 ^ i3) * (-27117)) ^ 478089180;
                        i2 = 1617662045;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩻ᩴ") + i3) * (-63);
                        i = ((iM45029 ^ i4) * (-10991)) ^ (-568469937);
                        i2 = -1718561093;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1987573280:
                case 1919036963:
                    if (C19806.f63586) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩶ۙ")) * (-23);
                        i = ((iM45029 ^ i4) * (-32509)) ^ (-1878932436);
                        i2 = -760738315;
                    } else {
                        iM45029 = (i4 - C19806.m45029("ܽۢ")) * 97;
                        i = ((iM45029 ^ i3) * 18971) ^ 552947876;
                        i2 = -835057700;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1769111849:
                case -1487896807:
                    b = (byte) i7;
                    if (C1377.m4833() != 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩶ۙ")) * (-23);
                        i = ((iM45029 ^ i4) * (-32509)) ^ (-1878932436);
                        i2 = -760738315;
                    } else {
                        iM45029 = C19806.m45029("֨᩻") ^ i4;
                        i = ((iM45029 ^ i3) * 2171) ^ (-633906726);
                        i2 = -928187780;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1588719800:
                case -486791422:
                    C0629.m2907();
                    C2871.m8646();
                    iM45029 = (i4 - C19806.m45029("ܽۢ")) * 97;
                    i = ((iM45029 ^ i3) * 18971) ^ 552947876;
                    i2 = -835057700;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1580213441:
                case 995681033:
                    s = sArr[c];
                    s2 = 3454;
                    if (C1377.f5749) {
                        iM45029 = ThreadFactoryC3888.m11306("۠ۜ") ^ i4;
                        i = ((iM45029 ^ i3) * (-921)) ^ 1599280430;
                        i2 = 561966257;
                    } else {
                        iM45029 = (C19806.m45029("᩶֨") + i4) * (-61);
                        i = ((iM45029 ^ i3) * (-8555)) ^ (-1114171669);
                        i2 = -1863475164;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1425669946:
                case 1517445908:
                    C0817.m3399();
                    break;
                case -1241195566:
                case 1060710593:
                    i8 = s * s2;
                    i9 = s * s;
                    if (C1937.f7317 >= 0) {
                        iM45029 = (C19806.m45029("᩶֨") + i4) * (-61);
                        i = ((iM45029 ^ i3) * (-8555)) ^ (-1114171669);
                        i2 = -1863475164;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩹᩶") ^ i3;
                        i = ((iM45029 ^ i4) * 28881) ^ (-992747702);
                        i2 = -1015456816;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1203690005:
                case 1784077590:
                    interfaceC17314Mo4064 = interfaceC17314M8257.mo4064(b, ViewGroupOnHierarchyChangeListenerC1916.m6241(sArr2, i12, 20, i11));
                    if (C3286.f12186) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩶ۙ")) * (-23);
                        i = ((iM45029 ^ i4) * (-32509)) ^ (-1878932436);
                        i2 = -760738315;
                    } else {
                        iM45029 = (C19806.m45029("ܶۤ") + i3) * 85;
                        i = ((iM45029 ^ i4) * (-13121)) ^ 938778700;
                        i2 = -1858911878;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -722586528:
                case 1978614673:
                    break;
                case -372030661:
                case 1981640535:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 > 0) {
                        iM45029 = (i4 - C19806.m45029("ܽۢ")) * 97;
                        i = ((iM45029 ^ i3) * 18971) ^ 552947876;
                        i2 = -835057700;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۟ۚ") ^ i4) * (-93);
                        i = ((iM45029 ^ i3) * 27243) ^ 1331644443;
                        i2 = 406529448;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -330533834:
                case 81874539:
                    c = 'E';
                    if (C1460.f5948 >= 0) {
                        iM45029 = C19806.m45029("۟֫") ^ i3;
                        i = ((iM45029 ^ i4) * 19911) ^ (-533028242);
                        i2 = -1649073577;
                    } else {
                        iM45029 = C19806.m45029("᩺ۨ") ^ i3;
                        i = ((iM45029 ^ i4) * (-1625)) ^ 1843587017;
                        i2 = -729018753;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -288280842:
                case 1607917360:
                    sArr2 = f39370;
                    i12 = 70;
                    if (C1937.f7317 >= 0) {
                        iM45029 = C19806.m45029("۟֫") ^ i3;
                        i = ((iM45029 ^ i4) * 19911) ^ (-533028242);
                        i2 = -1649073577;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۖۨ") ^ i4;
                        i = ((iM45029 ^ i3) * (-22271)) ^ (-1286814360);
                        i2 = -47387813;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -151663797:
                case 1619087178:
                    i11 = 5924;
                    iM45029 = (ThreadFactoryC3888.m11306("ۜۚ") + i3) * 115;
                    i = ((iM45029 ^ i4) * (-7575)) ^ 18897990;
                    i2 = -132206184;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -134795656:
                case 999849256:
                    sArr = f39370;
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("۟ۚ") ^ i4) * (-93);
                        i = ((iM45029 ^ i3) * 27243) ^ 1331644443;
                        i2 = 406529448;
                    } else {
                        iM45029 = C19806.m45029("ۜ᩺") ^ i3;
                        i = ((iM45029 ^ i4) * 10917) ^ (-1515837952);
                        i2 = 60509680;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 198701612:
                case 748196731:
                    i11 = 14066;
                    iM45029 = (ThreadFactoryC3888.m11306("ۜۚ") + i3) * 115;
                    i = ((iM45029 ^ i4) * (-7575)) ^ 18897990;
                    i2 = -132206184;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 561568272:
                case 762745623:
                    if (CallableC1627.m5507() != 0) {
                        iM45029 = (i4 - C19806.m45029("ܽۢ")) * 97;
                        i = ((iM45029 ^ i3) * 18971) ^ 552947876;
                        i2 = -835057700;
                    } else {
                        iM45029 = C19806.m45029("᩵ۡ") ^ i4;
                        i = ((iM45029 ^ i3) * (-9177)) ^ 641529149;
                        i2 = -1394496837;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 741000984:
                case 1507025316:
                    C2332.m7081(new C4661(c11718));
                    break;
                case 749584917:
                case 834351909:
                    i10 = 2982529;
                    if (C3535.m10431() <= 0) {
                        iM45029 = (i4 - C19806.m45029("ܽۢ")) * 97;
                        i = ((iM45029 ^ i3) * 18971) ^ 552947876;
                        i2 = -835057700;
                    } else {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("ۘܶ")) * 37;
                        i = ((iM45029 ^ i3) * 11243) ^ 86104323;
                        i2 = -1792493708;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 868587844:
                case 2094770455:
                    C3660.m10783(interfaceC17314Mo4064);
                    if (c11718.f39391) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܰۜ") ^ i4) * 9;
                        i = ((iM45029 ^ i3) * (-23731)) ^ (-140741621);
                        i2 = 177812335;
                    } else {
                        iM45029 = C19806.m45029("᩶ۛ") ^ i3;
                        i = ((iM45029 ^ i4) * 25563) ^ 644178727;
                        i2 = 993712541;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 1527130218:
                case 1989546904:
                    interfaceC17314M8257 = C2704.m8257(ApplicationC0716.f2992);
                    i7 = c11718.f39371;
                    if (C10634.f36300 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("۟ۚ") ^ i4) * (-93);
                        i = ((iM45029 ^ i3) * 27243) ^ 1331644443;
                        i2 = 406529448;
                    } else {
                        iM45029 = C19806.m45029("ܺܺ") ^ i3;
                        i = ((iM45029 ^ i4) * 18975) ^ (-282277865);
                        i2 = 1216827009;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                default:
                    C1875.m6086();
                    if (RunnableC1895.f7152) {
                        iM45029 = C19806.m45029("۟֫") ^ i3;
                        i = ((iM45029 ^ i4) * 19911) ^ (-533028242);
                        i2 = -1649073577;
                    } else {
                        iM45029 = (i4 - C19806.m45029("ܽۢ")) * 97;
                        i = ((iM45029 ^ i3) * 18971) ^ 552947876;
                        i2 = -835057700;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0099 A[PHI: r4
      0x0099: PHI (r4v4 l.ۡܶۙ) = (r4v3 l.ۡܶۙ), (r4v2 l.ۡܶۙ), (r4v2 l.ۡܶۙ), (r4v2 l.ۡܶۙ) binds: [B:29:0x0097, B:15:0x0045, B:12:0x003d, B:9:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x00fc A[PHI: r1
      0x00fc: PHI (r1v6 l.ᩳ᩻ۘ) = (r1v5 l.ᩳ᩻ۘ), (r1v2 l.ᩳ᩻ۘ), (r1v2 l.ᩳ᩻ۘ) binds: [B:40:0x00fa, B:25:0x0079, B:12:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x014c A[PHI: r11
      0x014c: PHI (r11v9 l.ܽܶۙ) = (r11v5 l.ܽܶۙ), (r11v4 l.ܽܶۙ) binds: [B:47:0x014a, B:9:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x0197  */
    @Override // l.AbstractC22611, l.ComponentCallbacksC22654
    public final void onCreate(Bundle bundle) {
        int iM11306;
        int i;
        C18377 c18377 = null;
        Class<C6382> cls = null;
        AbstractC8956 abstractC8956M39205 = null;
        C15101 c15101 = null;
        int i2 = 1168612032;
        int i3 = C1066.f4915;
        int i4 = C0278.f1572;
        int iM11307 = (i4 - ThreadFactoryC3888.m11306("ۚܿ")) * 27;
        int i5 = ((iM11307 ^ i3) * 14031) ^ 2125485439;
        int i6 = 1949136273;
        while (true) {
            int i7 = iM11307 ^ i6;
            C16717 c16717 = null;
            C16717 c16718 = null;
            while (true) {
                i2 = ((((i2 ^ i3) * 8203) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2136191842:
                    case -1950682039:
                        C1977.m6356();
                        break;
                    case -1347024165:
                    case 1009214664:
                        super.onCreate(bundle);
                        if (C1148.f5161 <= 0) {
                            iM11306 = C19806.m45029("ۡ᩷") ^ i3;
                            i5 = ((iM11306 ^ i4) * (-2847)) ^ (-1765449720);
                            i = -451900858;
                        } else {
                            iM11306 = (C19806.m45029("᩵᩶") ^ i3) * 29;
                            i5 = ((iM11306 ^ i4) * 19727) ^ 59614877;
                            i = -457658267;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    case -1058709456:
                    case 515972851:
                        C2704.m8255();
                        iM11306 = C19806.m45029("ۡ᩷") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-2847)) ^ (-1765449720);
                        i = -451900858;
                        i7 = iM11306 ^ i;
                        break;
                    case -1051819865:
                    case 1645638166:
                        if (!C0817.f3443) {
                        }
                        c16717 = new C16717(C1460.m5049(this));
                        if (C0278.f1572 <= 0) {
                            iM11306 = (ThreadFactoryC3888.m11306("ۡܺ") + i4) * 19;
                            i5 = ((iM11306 ^ i3) * 19715) ^ (-2053359576);
                            i = 250180889;
                        } else {
                            iM11306 = (ThreadFactoryC3888.m11306("ۧܶ") ^ i4) * (-117);
                            i5 = ((iM11306 ^ i3) * (-815)) ^ 966951492;
                            i = -1099278740;
                        }
                        i7 = iM11306 ^ i;
                        break;
                        break;
                    case -868037639:
                    case -238643217:
                        c15101 = new C15101(7, this);
                        if (ViewTreeObserverOnPreDrawListenerC3327.f12317 > 0) {
                            iM11306 = C19806.m45029("᩺֨") ^ i4;
                            i5 = ((iM11306 ^ i3) * (-4307)) ^ (-1457910487);
                            i = -425128446;
                            i7 = iM11306 ^ i;
                        }
                        break;
                    case -834505370:
                    case 911032180:
                        c18377 = (C18377) c16717.m39205(C18377.class);
                        if (C2249.f8050 >= 0) {
                            iM11306 = (i3 - C19806.m45029("۠ۙ")) * 99;
                            i5 = ((iM11306 ^ i4) * 23469) ^ 2093774358;
                            i = -1310840857;
                        } else {
                            iM11306 = C19806.m45029("ܽ۫") ^ i3;
                            i5 = ((iM11306 ^ i4) * (-21925)) ^ (-764052756);
                            i = 343833847;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    case -737883210:
                    case -424619048:
                        C2704.m8255();
                        if (C0629.f2722 <= 0) {
                            iM11306 = C19806.m45029("ۡ᩷") ^ i3;
                            i5 = ((iM11306 ^ i4) * (-2847)) ^ (-1765449720);
                            i = -451900858;
                        } else {
                            iM11306 = (ThreadFactoryC3888.m11306("ۡܶ") + i4) * 53;
                            i5 = ((iM11306 ^ i3) * 6123) ^ (-745101643);
                            i = -650889028;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    case -624175610:
                    case 1908585175:
                        this.f39387 = c18377;
                        if (!CallableC1627.f6528) {
                        }
                        c16718 = new C16717(AbstractC0464.m2305(this));
                        cls = C6382.class;
                        if (C2788.m8472() == 0) {
                            iM11306 = ThreadFactoryC3888.m11306("ۖ۟") ^ i3;
                            i5 = ((iM11306 ^ i4) * 27719) ^ 1142161210;
                            i = -1711063277;
                            i7 = iM11306 ^ i;
                        }
                        break;
                        break;
                        break;
                    case -4207436:
                    case 831321806:
                        abstractC8956M39205 = c16718.m39205(cls);
                        if (C3535.f13026 <= 0) {
                            iM11306 = (ThreadFactoryC3888.m11306("ۡܶ") + i4) * 53;
                            i5 = ((iM11306 ^ i3) * 6123) ^ (-745101643);
                            i = -650889028;
                        } else {
                            iM11306 = C19806.m45029("֫۟") ^ i4;
                            i5 = ((iM11306 ^ i3) * 32499) ^ (-1450185003);
                            i = 1863256582;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    case 554494137:
                    case 2130691323:
                        if (C2332.f8260) {
                            iM11306 = (ThreadFactoryC3888.m11306("ۡܶ") + i4) * 53;
                            i5 = ((iM11306 ^ i3) * 6123) ^ (-745101643);
                            i = -650889028;
                        } else {
                            iM11306 = (i3 - C19806.m45029("۠ۙ")) * 99;
                            i5 = ((iM11306 ^ i4) * 23469) ^ 2093774358;
                            i = -1310840857;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    case 932551408:
                    case 1868252391:
                        if (C0817.f3443) {
                            iM11306 = (ThreadFactoryC3888.m11306("֨۟") + i4) * (-47);
                            i5 = ((iM11306 ^ i3) * (-30937)) ^ 901709283;
                            i = 951247141;
                        } else {
                            iM11306 = C19806.m45029("ۡ᩷") ^ i3;
                            i5 = ((iM11306 ^ i4) * (-2847)) ^ (-1765449720);
                            i = -451900858;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    case 1001242151:
                    case 1920516085:
                        this.f39375 = (C6382) abstractC8956M39205;
                        if (C1461.f5957 <= 0) {
                            iM11306 = (i3 - C19806.m45029("۠ۙ")) * 99;
                            i5 = ((iM11306 ^ i4) * 23469) ^ 2093774358;
                            i = -1310840857;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("᩻۟") ^ i3;
                            i5 = ((iM11306 ^ i4) * 26055) ^ (-284169395);
                            i = -1803975355;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    case 1171961072:
                    case 1664507894:
                        if (C0278.f1572 <= 0) {
                            iM11306 = (ThreadFactoryC3888.m11306("ۡܶ") + i4) * 53;
                            i5 = ((iM11306 ^ i3) * 6123) ^ (-745101643);
                            i = -650889028;
                        } else {
                            iM11306 = (ThreadFactoryC3888.m11306("ۡܺ") + i4) * 19;
                            i5 = ((iM11306 ^ i3) * 19715) ^ (-2053359576);
                            i = 250180889;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    default:
                        this.f39372 = C8312.m21739(this, c15101);
                        break;
                }
                return;
            }
            iM11307 = ThreadFactoryC3888.m11306("᩵ܽ") ^ i4;
            i5 = ((iM11307 ^ i3) * (-5445)) ^ 776646877;
            i6 = 1487834367;
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x015d A[PHI: r2 r4 r5 r8 r13
      0x015d: PHI (r2v5 l.ۚ᩻ۘ) = (r2v2 l.ۚ᩻ۘ), (r2v4 l.ۚ᩻ۘ), (r2v2 l.ۚ᩻ۘ), (r2v2 l.ۚ᩻ۘ) binds: [B:16:0x0084, B:6:0x0058, B:28:0x00bb, B:96:0x015d] A[DONT_GENERATE, DONT_INLINE]
      0x015d: PHI (r4v3 l.ۡ᩺ۙ) = (r4v1 l.ۡ᩺ۙ), (r4v1 l.ۡ᩺ۙ), (r4v2 l.ۡ᩺ۙ), (r4v1 l.ۡ᩺ۙ) binds: [B:16:0x0084, B:6:0x0058, B:28:0x00bb, B:96:0x015d] A[DONT_GENERATE, DONT_INLINE]
      0x015d: PHI (r5v3 java.util.concurrent.atomic.AtomicBoolean) = 
      (r5v1 java.util.concurrent.atomic.AtomicBoolean)
      (r5v1 java.util.concurrent.atomic.AtomicBoolean)
      (r5v2 java.util.concurrent.atomic.AtomicBoolean)
      (r5v1 java.util.concurrent.atomic.AtomicBoolean)
     binds: [B:16:0x0084, B:6:0x0058, B:28:0x00bb, B:96:0x015d] A[DONT_GENERATE, DONT_INLINE]
      0x015d: PHI (r8v4 l.֨᩺ۙ) = (r8v2 l.֨᩺ۙ), (r8v2 l.֨᩺ۙ), (r8v3 l.֨᩺ۙ), (r8v2 l.֨᩺ۙ) binds: [B:16:0x0084, B:6:0x0058, B:28:0x00bb, B:96:0x015d] A[DONT_GENERATE, DONT_INLINE]
      0x015d: PHI (r13v4 short[]) = (r13v2 short[]), (r13v3 short[]), (r13v2 short[]), (r13v2 short[]) binds: [B:16:0x0084, B:6:0x0058, B:28:0x00bb, B:96:0x015d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x0241 A[PHI: r3 r6 r14 r15
      0x0241: PHI (r3v4 l.᩹᩸ۖ) = (r3v2 l.᩹᩸ۖ), (r3v2 l.᩹᩸ۖ), (r3v3 l.᩹᩸ۖ), (r3v2 l.᩹᩸ۖ), (r3v2 l.᩹᩸ۖ) binds: [B:61:0x023f, B:40:0x0141, B:32:0x00e1, B:18:0x0088, B:16:0x0084] A[DONT_GENERATE, DONT_INLINE]
      0x0241: PHI (r6v4 long) = (r6v2 long), (r6v2 long), (r6v3 long), (r6v2 long), (r6v2 long) binds: [B:61:0x023f, B:40:0x0141, B:32:0x00e1, B:18:0x0088, B:16:0x0084] A[DONT_GENERATE, DONT_INLINE]
      0x0241: PHI (r14v4 int) = (r14v2 int), (r14v3 int), (r14v2 int), (r14v2 int), (r14v2 int) binds: [B:61:0x023f, B:40:0x0141, B:32:0x00e1, B:18:0x0088, B:16:0x0084] A[DONT_GENERATE, DONT_INLINE]
      0x0241: PHI (r15v4 int) = (r15v2 int), (r15v3 int), (r15v2 int), (r15v2 int), (r15v2 int) binds: [B:61:0x023f, B:40:0x0141, B:32:0x00e1, B:18:0x0088, B:16:0x0084] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.ComponentCallbacksC22654
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int iM45029;
        int i;
        int i2;
        View viewM15651;
        int i3 = C3535.f13026;
        int i4 = C1419.f5860;
        int iM11306 = ThreadFactoryC3888.m11306("ܿ۫") ^ i3;
        int i5 = ((iM11306 ^ i4) * (-1473)) ^ 1934502503;
        View view = null;
        short[] sArr = null;
        int i6 = iM11306 ^ (-1049827864);
        final AtomicBoolean atomicBoolean = null;
        short s = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = -1715199572;
        int i11 = 0;
        InterfaceC1423 viewLifecycleOwner = null;
        RunnableC22547 runnableC22547 = null;
        C9186 c9186 = null;
        ActivityC5677 activityC5677 = null;
        long j = 0;
        while (true) {
            i10 = i6 ^ (i5 & (((i10 ^ i4) * 29825) >> 31));
            switch (i10) {
                case -1852575221:
                case -168023357:
                    runnableC22547 = new RunnableC22547(2, this);
                    j = 600;
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM45029 = ThreadFactoryC3888.m11306("᩺᩷") ^ i3;
                        i = ((iM45029 ^ i4) * 20859) ^ (-105593988);
                        i2 = 449938107;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩷֫") + i4) * 11;
                        i = ((iM45029 ^ i3) * (-28513)) ^ 431158337;
                        i2 = 42110213;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1645980025:
                case -660251678:
                    C7105.m18983(c9186, viewLifecycleOwner, new InterfaceC10597() { // from class: l.᩶֨ۜ
                        @Override // l.InterfaceC10597
                        /* JADX INFO: renamed from: ۙ */
                        public final void mo1473(Object obj) {
                            C11718.m29270(this.f63654, atomicBoolean, (EnumC9493) obj);
                        }
                    });
                    return view;
                case -1634976133:
                case 1824548171:
                    if (!C19806.f63586) {
                        iM45029 = (i3 - C19806.m45029("᩹᩷")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM45029 ^ i4) * 2959) ^ 740929014;
                        i2 = 1308662084;
                        i6 = iM45029 ^ i2;
                        i5 = i;
                    } else {
                        int iM450210 = (C19806.m45029("ۤ᩶") ^ i4) * (-43);
                        i6 = iM450210 ^ 1059014630;
                        i5 = ((iM450210 ^ i3) * (-12347)) ^ 1483323789;
                        atomicBoolean = null;
                    }
                    break;
                case -1224394284:
                case -258022967:
                    i8 = 209;
                    i9 = 3;
                    if (C1189.f5284 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩷֫") + i4) * 11;
                        i = ((iM45029 ^ i3) * (-28513)) ^ 431158337;
                        i2 = 42110213;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۘۜ") + i4) * 25;
                        i = ((iM45029 ^ i3) * 23357) ^ 1832346359;
                        i2 = -962109483;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1016691994:
                case 511968309:
                    if (C2249.f8050 < 0) {
                        iM45029 = (C19806.m45029("᩸ܽ") + i4) * (-109);
                        i = ((iM45029 ^ i3) * (-11403)) ^ (-1843841717);
                        i2 = -399137317;
                        i6 = iM45029 ^ i2;
                        i5 = i;
                    } else {
                        int iM450211 = (C19806.m45029("ۤ᩶") ^ i4) * (-43);
                        i6 = iM450211 ^ 1059014630;
                        i5 = ((iM450211 ^ i3) * (-12347)) ^ 1483323789;
                        atomicBoolean = null;
                    }
                    break;
                case -869899060:
                case -68205075:
                    s = f39370[208];
                    if (C2249.f8050 >= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("֫۫")) * (-59);
                        i = ((iM45029 ^ i4) * 32375) ^ (-86888289);
                        i2 = -846691720;
                    } else {
                        iM45029 = (i4 - C19806.m45029("᩵ܶ")) * 37;
                        i = ((iM45029 ^ i3) * (-31313)) ^ 573537203;
                        i2 = -2063747225;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -714072853:
                case 720681411:
                    if (C3660.m10791() != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۛۙ") ^ i3;
                        i = ((iM45029 ^ i4) * (-22369)) ^ 1176969993;
                        i2 = 1977632122;
                        i6 = iM45029 ^ i2;
                        i5 = i;
                    } else {
                        int iM450212 = (C19806.m45029("ۤ᩶") ^ i4) * (-43);
                        i6 = iM450212 ^ 1059014630;
                        i5 = ((iM450212 ^ i3) * (-12347)) ^ 1483323789;
                        atomicBoolean = null;
                    }
                    break;
                case -620348681:
                case 1892520826:
                    if (i11 - (s * 2304) < 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩵᩹") ^ i3;
                        i = ((iM45029 ^ i4) * (-11497)) ^ 2050082433;
                        i2 = -2079643567;
                    } else {
                        iM45029 = C19806.m45029("ܰۜ") ^ i4;
                        i = ((iM45029 ^ i3) * (-11943)) ^ 449879646;
                        i2 = -1128048932;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -605529366:
                case 781626684:
                    i7 = 893;
                    iM45029 = ThreadFactoryC3888.m11306("᩸ܳ") ^ i4;
                    i = ((iM45029 ^ i3) * 12801) ^ (-1795400808);
                    i2 = 910000148;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -534121299:
                case -408633644:
                    viewM15651 = super.onCreateView(layoutInflater, viewGroup, bundle);
                    C3286.m9779(viewM15651);
                    view = viewM15651;
                    iM45029 = (ThreadFactoryC3888.m11306("ܽۖ") ^ i4) * (-85);
                    i = ((iM45029 ^ i3) * (-20795)) ^ 1363734814;
                    i2 = -462632702;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -532140137:
                case 704684603:
                    if (C3743.m10966() <= 0) {
                        int iM450213 = (C19806.m45029("ۤ᩶") ^ i4) * (-43);
                        i6 = iM450213 ^ 1059014630;
                        i5 = ((iM450213 ^ i3) * (-12347)) ^ 1483323789;
                        atomicBoolean = null;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܶۧ") ^ i3) * (-61);
                        i = ((iM45029 ^ i4) * 12309) ^ 795198213;
                        i2 = 2070170463;
                        i6 = iM45029 ^ i2;
                        i5 = i;
                    }
                    break;
                case -514973194:
                case 1184723047:
                    if (C7105.m18985()) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩷֫") + i4) * 11;
                        i = ((iM45029 ^ i3) * (-28513)) ^ 431158337;
                        i2 = 42110213;
                    } else {
                        iM45029 = C19806.m45029("ۖ֡") ^ i3;
                        i = ((iM45029 ^ i4) * 5321) ^ (-1464483841);
                        i2 = -1815707304;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -403147312:
                case 585718894:
                    if (RunnableC1606.f6488 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩷֫") + i4) * 11;
                        i = ((iM45029 ^ i3) * (-28513)) ^ 431158337;
                        i2 = 42110213;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܶۧ") ^ i3) * (-61);
                        i = ((iM45029 ^ i4) * 12309) ^ 795198213;
                        i2 = 2070170463;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 437325723:
                case 1933506337:
                    viewM15651 = activityC5677.m15651(C19806.m45029(AbstractC0464.m2308(sArr, i8, i9, i7)) ^ 2120503662);
                    if (viewM15651 == null) {
                        iM45029 = ThreadFactoryC3888.m11306("۬۠") ^ i4;
                        i = ((iM45029 ^ i3) * 27449) ^ (-285242192);
                        i2 = 839150298;
                    } else {
                        view = viewM15651;
                        iM45029 = (ThreadFactoryC3888.m11306("ܽۖ") ^ i4) * (-85);
                        i = ((iM45029 ^ i3) * (-20795)) ^ 1363734814;
                        i2 = -462632702;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 746678815:
                case 964773445:
                    C3660.m10791();
                    return null;
                case 1160966553:
                case 1957139117:
                    C0817.m3402(runnableC22547, j);
                    if (ThreadFactoryC3888.f14547 > 0) {
                        atomicBoolean = new AtomicBoolean(true);
                        c9186 = C3141.f11846;
                        viewLifecycleOwner = getViewLifecycleOwner();
                        if (C3722.f13525 <= 0) {
                            iM45029 = (ThreadFactoryC3888.m11306("ܶۧ") ^ i3) * (-61);
                            i = ((iM45029 ^ i4) * 12309) ^ 795198213;
                            i2 = 2070170463;
                        } else {
                            iM45029 = (i3 - ThreadFactoryC3888.m11306("ۨ᩷")) * 85;
                            i = ((iM45029 ^ i4) * 4121) ^ 195083007;
                            i2 = 226577714;
                        }
                        i6 = iM45029 ^ i2;
                        i5 = i;
                    } else {
                        int iM450214 = (C19806.m45029("ۤ᩶") ^ i4) * (-43);
                        i6 = iM450214 ^ 1059014630;
                        i5 = ((iM450214 ^ i3) * (-12347)) ^ 1483323789;
                        atomicBoolean = null;
                    }
                    break;
                case 1357011095:
                case 1532264186:
                    i11 = (s * s) + 1327104;
                    if (C2788.f10625 < 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("۬ܰ")) * (-63);
                        i = ((iM45029 ^ i4) * (-23691)) ^ 474113624;
                        i2 = 415913185;
                        i6 = iM45029 ^ i2;
                        i5 = i;
                    } else {
                        int iM450215 = (C19806.m45029("ۤ᩶") ^ i4) * (-43);
                        i6 = iM450215 ^ 1059014630;
                        i5 = ((iM450215 ^ i3) * (-12347)) ^ 1483323789;
                        atomicBoolean = null;
                    }
                    break;
                case 1501596341:
                case 1768143370:
                    i7 = 16035;
                    iM45029 = ThreadFactoryC3888.m11306("᩸ܳ") ^ i4;
                    i = ((iM45029 ^ i3) * 12801) ^ (-1795400808);
                    i2 = 910000148;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 1524034528:
                case 1544534165:
                    C10634.m26820();
                    iM45029 = (ThreadFactoryC3888.m11306("᩷֫") + i4) * 11;
                    i = ((iM45029 ^ i3) * (-28513)) ^ 431158337;
                    i2 = 42110213;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                default:
                    activityC5677 = (ActivityC5677) AbstractC0464.m2305(this);
                    sArr = f39370;
                    if (C0216.f1393 != 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܶۧ") ^ i3) * (-61);
                        i = ((iM45029 ^ i4) * 12309) ^ 795198213;
                        i2 = 2070170463;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۙܿ") ^ i3;
                        i = ((iM45029 ^ i4) * 7275) ^ (-1528859396);
                        i2 = -1350695344;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:124:0x059c A[PHI: r9 r11 r12 r13 r14 r17 r18 r21 r22 r23 r24 r25 r29 r34
      0x059c: PHI (r9v6 short[]) = (r9v2 short[]), (r9v2 short[]), (r9v7 short[]) binds: [B:123:0x059a, B:86:0x0379, B:26:0x010d] A[DONT_GENERATE, DONT_INLINE]
      0x059c: PHI (r11v6 int) = (r11v2 int), (r11v2 int), (r11v7 int) binds: [B:123:0x059a, B:86:0x0379, B:26:0x010d] A[DONT_GENERATE, DONT_INLINE]
      0x059c: PHI (r12v70 l.۠ۡۜ) = (r12v27 l.۠ۡۜ), (r12v34 l.۠ۡۜ), (r12v71 l.۠ۡۜ) binds: [B:123:0x059a, B:86:0x0379, B:26:0x010d] A[DONT_GENERATE, DONT_INLINE]
      0x059c: PHI (r13v6 l.ᩴܿۘ) = (r13v2 l.ᩴܿۘ), (r13v2 l.ᩴܿۘ), (r13v7 l.ᩴܿۘ) binds: [B:123:0x059a, B:86:0x0379, B:26:0x010d] A[DONT_GENERATE, DONT_INLINE]
      0x059c: PHI (r14v6 java.lang.StringBuilder) = (r14v2 java.lang.StringBuilder), (r14v2 java.lang.StringBuilder), (r14v7 java.lang.StringBuilder) binds: [B:123:0x059a, B:86:0x0379, B:26:0x010d] A[DONT_GENERATE, DONT_INLINE]
      0x059c: PHI (r17v5 int) = (r17v2 int), (r17v3 int), (r17v2 int) binds: [B:123:0x059a, B:86:0x0379, B:26:0x010d] A[DONT_GENERATE, DONT_INLINE]
      0x059c: PHI (r18v5 int) = (r18v2 int), (r18v3 int), (r18v2 int) binds: [B:123:0x059a, B:86:0x0379, B:26:0x010d] A[DONT_GENERATE, DONT_INLINE]
      0x059c: PHI (r21v6 l.ۚ᩻ۘ) = (r21v4 l.ۚ᩻ۘ), (r21v2 l.ۚ᩻ۘ), (r21v2 l.ۚ᩻ۘ) binds: [B:123:0x059a, B:86:0x0379, B:26:0x010d] A[DONT_GENERATE, DONT_INLINE]
      0x059c: PHI (r22v5 java.lang.String) = (r22v3 java.lang.String), (r22v2 java.lang.String), (r22v2 java.lang.String) binds: [B:123:0x059a, B:86:0x0379, B:26:0x010d] A[DONT_GENERATE, DONT_INLINE]
      0x059c: PHI (r23v5 android.os.Bundle) = (r23v3 android.os.Bundle), (r23v2 android.os.Bundle), (r23v2 android.os.Bundle) binds: [B:123:0x059a, B:86:0x0379, B:26:0x010d] A[DONT_GENERATE, DONT_INLINE]
      0x059c: PHI (r24v26 short[]) = (r24v24 short[]), (r24v2 short[]), (r24v2 short[]) binds: [B:123:0x059a, B:86:0x0379, B:26:0x010d] A[DONT_GENERATE, DONT_INLINE]
      0x059c: PHI (r25v23 int) = (r25v21 int), (r25v2 int), (r25v2 int) binds: [B:123:0x059a, B:86:0x0379, B:26:0x010d] A[DONT_GENERATE, DONT_INLINE]
      0x059c: PHI (r29v42 int) = (r29v28 int), (r29v34 int), (r29v43 int) binds: [B:123:0x059a, B:86:0x0379, B:26:0x010d] A[DONT_GENERATE, DONT_INLINE]
      0x059c: PHI (r34v54 short[]) = (r34v33 short[]), (r34v39 short[]), (r34v55 short[]) binds: [B:123:0x059a, B:86:0x0379, B:26:0x010d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0143, code lost:
    
        if (l.C3743.f13569 == false) goto L21;
     */
    @Override // l.ComponentCallbacksC22654
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onOptionsItemSelected(android.view.MenuItem r40) {
        /*
            Method dump skipped, instruction units count: 2346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11718.onOptionsItemSelected(android.view.MenuItem):boolean");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m29269(C11718 c11718, List list, List list2, List list3, List list4) {
        int i = 1824221857;
        int i2 = C1668.f6641;
        int i3 = C0278.f1572;
        int iM45029 = C19806.m45029("ۘܶ") ^ i3;
        int i4 = ((iM45029 ^ i2) * 21203) ^ 1715027402;
        int i5 = 813738792;
        while (true) {
            i = ((((i ^ i2) * (-26761)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2101641460:
                case 1908681788:
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("۫֡")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM45029 ^ i3) * 29955) ^ (-1398933608);
                        i5 = 1049523102;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۟ۤ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 22625) ^ 1282110538;
                        i5 = 1426050066;
                    }
                    break;
                case -2089136599:
                case -535807373:
                    c11718.f39377.m1508(list, list3, list2, list4);
                    iM45029 = (i3 - C19806.m45029("۟᩸")) * 123;
                    i4 = ((iM45029 ^ i2) * 231) ^ (-2123766743);
                    i5 = 530779927;
                    break;
                case -1938806889:
                case 762138969:
                    C2332.m7079();
                    if (C1025.f4800 < 0) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("۫֡")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM45029 ^ i3) * 29955) ^ (-1398933608);
                        i5 = 1049523102;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۡ֡") ^ i2;
                        i4 = ((iM45029 ^ i3) * 30081) ^ (-1584488421);
                        i5 = -370234068;
                    }
                    break;
                case -1857782161:
                case 1344345419:
                    if (C1461.f5957 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۜ۫") ^ i3;
                        i4 = ((iM45029 ^ i2) * 11413) ^ 1597533556;
                        i5 = 890551028;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("۬ܳ")) * 51;
                        i4 = ((iM45029 ^ i3) * 12669) ^ (-72781279);
                        i5 = 1460578642;
                    }
                    break;
                case -1499004580:
                case 1195639090:
                    if (C0671.f2816 != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۜ۫") ^ i3;
                        i4 = ((iM45029 ^ i2) * 11413) ^ 1597533556;
                        i5 = 890551028;
                    } else {
                        iM45029 = (i2 - C19806.m45029("᩸ۧ")) * (-37);
                        i4 = ((iM45029 ^ i3) * (-20907)) ^ (-249942498);
                        i5 = -766437939;
                    }
                    break;
                case -1470513848:
                case 2053004378:
                    if (RunnableC0195.f1321 >= 0) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("۫֡")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM45029 ^ i3) * 29955) ^ (-1398933608);
                        i5 = 1049523102;
                    } else {
                        iM45029 = C19806.m45029("۫ܰ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-10525)) ^ (-1467047773);
                        i5 = 637671570;
                    }
                    break;
                case -1317525080:
                case 646377340:
                    if (C2477.f9839 <= 0) {
                        iM45029 = C19806.m45029("۫ۛ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 11173) ^ (-1826707322);
                        i5 = -1861748320;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۙ᩸") + i3) * (-49);
                        i4 = ((iM45029 ^ i2) * 3745) ^ (-1213422616);
                        i5 = -1675904002;
                    }
                    break;
                case -1289998686:
                case 978748101:
                    if (C0962.f3784) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("۫֡")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM45029 ^ i3) * 29955) ^ (-1398933608);
                        i5 = 1049523102;
                    } else {
                        iM45029 = C19806.m45029("᩸ۡ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 4985) ^ (-1154860057);
                        i5 = -1143785134;
                    }
                    break;
                case -1130670556:
                case -511597282:
                    if (C1066.f4915 <= 0) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("۫֡")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM45029 ^ i3) * 29955) ^ (-1398933608);
                        i5 = 1049523102;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ᩴܿ")) * (-83);
                        i4 = ((iM45029 ^ i2) * 21207) ^ 633526514;
                        i5 = 1226873897;
                    }
                    break;
                case -1072620220:
                case 1645287913:
                    if (c11718.f39391) {
                        iM45029 = (C19806.m45029("᩺۫") ^ i2) * 83;
                        i4 = ((iM45029 ^ i3) * (-8203)) ^ (-1859949141);
                        i5 = -1610969661;
                    } else {
                        iM45029 = (i3 - C19806.m45029("۟᩸")) * 123;
                        i4 = ((iM45029 ^ i2) * 231) ^ (-2123766743);
                        i5 = 530779927;
                    }
                    break;
                case -981901021:
                case 482092609:
                    C0629.m2907();
                    if (!C0797.f3386) {
                        iM45029 = ThreadFactoryC3888.m11306("ۜ۫") ^ i3;
                        i4 = ((iM45029 ^ i2) * 11413) ^ 1597533556;
                        i5 = 890551028;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۡ֡") ^ i2;
                        i4 = ((iM45029 ^ i3) * 30081) ^ (-1584488421);
                        i5 = -370234068;
                    }
                    break;
                case -907906595:
                case 1860854592:
                    if (C0671.f2816 != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۡ֡") ^ i2;
                        i4 = ((iM45029 ^ i3) * 30081) ^ (-1584488421);
                        i5 = -370234068;
                    } else {
                        iM45029 = C19806.m45029("ᩳۧ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 28945) ^ 1147912412;
                        i5 = -423757193;
                    }
                    break;
                case -586557913:
                case 1233654928:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM45029 = C19806.m45029("۫ۛ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 11173) ^ (-1826707322);
                        i5 = -1861748320;
                    } else {
                        iM45029 = (C19806.m45029("ۡܰ") ^ i3) * 55;
                        i4 = ((iM45029 ^ i2) * SecP256K1Field.PInv33) ^ 966005235;
                        i5 = -981166889;
                    }
                    break;
                case -370609621:
                case 677601820:
                    C2477.m7593();
                    iM45029 = ThreadFactoryC3888.m11306("ۡ֡") ^ i2;
                    i4 = ((iM45029 ^ i3) * 30081) ^ (-1584488421);
                    i5 = -370234068;
                    break;
                case 71826691:
                case 650436981:
                    if (!C1461.m5080()) {
                        iM45029 = ThreadFactoryC3888.m11306("ۜ۫") ^ i3;
                        i4 = ((iM45029 ^ i2) * 11413) ^ 1597533556;
                        i5 = 890551028;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩶֡") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-15347)) ^ 1364274581;
                        i5 = 29891789;
                    }
                    break;
                case 771191569:
                case 1215421961:
                    if (C1025.f4800 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩶֡") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-15347)) ^ 1364274581;
                        i5 = 29891789;
                    } else {
                        iM45029 = C19806.m45029("᩷֡") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-5095)) ^ 262213528;
                        i5 = 1995993995;
                    }
                    break;
                case 1190232656:
                case 2123668307:
                    C1937.m6279();
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m29283(C11718 c11718) {
        C6094 c6094 = null;
        C6382 c6382 = null;
        C13626 c13626M47183 = null;
        C13626 c13626M50132 = null;
        byte[] bArrM33327 = null;
        C17367 c17367M40441 = null;
        int i = 0;
        C13626 c13626M47184 = null;
        int i2 = 0;
        int i3 = 1072194567;
        int i4 = RunnableC3388.f12514;
        int i5 = C1668.f6641;
        int iM11306 = (ThreadFactoryC3888.m11306("᩻ܳ") + i4) * (-31);
        int i6 = ((iM11306 ^ i5) * (-23289)) ^ (-1867268992);
        int i7 = 460425863;
        while (true) {
            i3 = ((((i3 ^ i5) * (-21243)) >> 31) & i6) ^ (iM11306 ^ i7);
            switch (i3) {
                case -2043409576:
                case -812092444:
                    c17367M40441 = C17367.m40441(bArrM33327);
                    i = 1382253410;
                    if (C19806.f63586) {
                        iM11306 = ThreadFactoryC3888.m11306("ܽ۬") ^ i4;
                        i6 = ((iM11306 ^ i5) * 25035) ^ (-2092389255);
                        i7 = 1979356738;
                    } else {
                        iM11306 = (i4 - C19806.m45029("ۙۡ")) * (-109);
                        i6 = ((iM11306 ^ i5) * (-10487)) ^ 859828558;
                        i7 = 485669748;
                    }
                    break;
                case -2036416587:
                case 1019792416:
                    if (c11718.f39376) {
                        iM11306 = (ThreadFactoryC3888.m11306("۫ۛ") ^ i5) * (-47);
                        i6 = ((iM11306 ^ i4) * (-21333)) ^ (-101476181);
                        i7 = 1103026227;
                    } else {
                        iM11306 = (C19806.m45029("᩹ܳ") + i4) * 29;
                        i6 = ((iM11306 ^ i5) * 9543) ^ 635952840;
                        i7 = -392974460;
                    }
                    break;
                case -1945139324:
                case 583157202:
                    C2871.m8646();
                    return null;
                case -1930336781:
                case -1241821771:
                    C3535.m10431();
                    C2642.m8171();
                    iM11306 = (C19806.m45029("᩷۬") ^ i4) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                    i6 = ((iM11306 ^ i5) * 31615) ^ 256280389;
                    i7 = 360315168;
                    break;
                case -1627150416:
                case -1017755259:
                    return C13167.m32559(c17367M40441, c11718.m50130(c13626M47184).m33318());
                case -1594299119:
                case -673139733:
                    i2++;
                    iM11306 = (i4 - C19806.m45029("ۡᩳ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                    i6 = ((iM11306 ^ i5) * 30017) ^ 2422911;
                    i7 = 309399842;
                    break;
                case -1526408511:
                case -1234298891:
                    C20190.m45649((InterfaceC0433) c17367M40441, i);
                    if (C1937.f7317 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܽ۬") ^ i4;
                        i6 = ((iM11306 ^ i5) * 25035) ^ (-2092389255);
                        i7 = 1979356738;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۛᩴ") ^ i5) * (-9);
                        i6 = ((iM11306 ^ i4) * 25087) ^ (-2132342770);
                        i7 = 1095560101;
                    }
                    break;
                case -1490601630:
                case -1208866664:
                    if (c11718.f39376) {
                        iM11306 = (i5 - ThreadFactoryC3888.m11306("ۖۗ")) * (-69);
                        i6 = ((iM11306 ^ i4) * (-28367)) ^ 1721232843;
                        i7 = 1355078798;
                    } else {
                        iM11306 = (i4 - C19806.m45029("ܶ۬")) * (-111);
                        i6 = ((iM11306 ^ i5) * o.a.z) ^ (-1698376463);
                        i7 = 313931974;
                    }
                    break;
                case -1376681165:
                case 1705900395:
                    c6382 = c11718.f39375;
                    if (c11718.f39391) {
                        iM11306 = (C19806.m45029("ۘۚ") + i5) * 53;
                        i6 = ((iM11306 ^ i4) * (-16073)) ^ (-1597165411);
                        i7 = -1447540618;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۫ۛ") ^ i5) * (-47);
                        i6 = ((iM11306 ^ i4) * (-21333)) ^ (-101476181);
                        i7 = 1103026227;
                    }
                    break;
                case -993625689:
                case 1898840780:
                    if (c11718.f39391) {
                        iM11306 = (i5 - C19806.m45029("᩻᩶")) * 49;
                        i6 = ((iM11306 ^ i4) * 12713) ^ (-466454391);
                        i7 = 1243034268;
                    } else {
                        iM11306 = (i4 - C19806.m45029("ܶ۬")) * (-111);
                        i6 = ((iM11306 ^ i5) * o.a.z) ^ (-1698376463);
                        i7 = 313931974;
                    }
                    break;
                case -985996822:
                case 2094920612:
                    return C2124.m6674(C3743.m10961(c11718.f39378));
                case -972031888:
                case 929896488:
                    c6094 = c11718.f39389;
                    if (C3577.f13150 >= 0) {
                        iM11306 = C19806.m45029("ۘۨ") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-25145)) ^ 2011950989;
                        i7 = -788792184;
                    } else {
                        iM11306 = (C19806.m45029("֨ۗ") + i4) * (-65);
                        i6 = ((iM11306 ^ i5) * 5737) ^ (-2091177715);
                        i7 = 1281744801;
                    }
                    break;
                case -926281953:
                case 250250705:
                    SystemClock.sleep(100L);
                    if (C0050.f912 <= 0) {
                        iM11306 = C19806.m45029("ۘۨ") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-25145)) ^ 2011950989;
                        i7 = -788792184;
                    } else {
                        iM11306 = C19806.m45029("ܳ᩵") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-30377)) ^ 1871930580;
                        i7 = 931330092;
                    }
                    break;
                case -921744915:
                case 1670198200:
                    RunnableC1564.m5345();
                    if (!C1461.m5080()) {
                        iM11306 = (C19806.m45029("ۤܰ") ^ i5) * 29;
                        i6 = ((iM11306 ^ i4) * (-11151)) ^ (-1486495099);
                        i7 = -948521008;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۛۢ") ^ i5;
                        i6 = ((iM11306 ^ i4) * 27601) ^ 923903153;
                        i7 = 578910797;
                    }
                    break;
                case -780908223:
                case 187690152:
                    c13626M47184 = c6094.m47183();
                    if (C10634.m26820()) {
                        iM11306 = ThreadFactoryC3888.m11306("ۛۢ") ^ i5;
                        i6 = ((iM11306 ^ i4) * 27601) ^ 923903153;
                        i7 = 578910797;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֫ۤ") ^ i4;
                        i6 = ((iM11306 ^ i5) * (-25529)) ^ (-375082374);
                        i7 = 1565920931;
                    }
                    break;
                case -744399910:
                case 1199688455:
                    C2642.m8171();
                    if (C1189.f5284 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۛۢ") ^ i5;
                        i6 = ((iM11306 ^ i4) * 27601) ^ 923903153;
                        i7 = 578910797;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ᩴ᩸") ^ i4;
                        i6 = ((iM11306 ^ i5) * 29735) ^ (-1042253911);
                        i7 = 1460467414;
                    }
                    break;
                case -514167958:
                case -274608457:
                    if (C2788.f10625 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۛۢ") ^ i5;
                        i6 = ((iM11306 ^ i4) * 27601) ^ 923903153;
                        i7 = 578910797;
                    } else {
                        iM11306 = (C19806.m45029("᩷۬") ^ i4) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i6 = ((iM11306 ^ i5) * 31615) ^ 256280389;
                        i7 = 360315168;
                    }
                    break;
                case -405200318:
                case 611450579:
                    if (i2 < 50) {
                        iM11306 = (i5 - C19806.m45029("ܶۡ")) * 53;
                        i6 = ((iM11306 ^ i4) * (-6791)) ^ 388284854;
                        i7 = -622987407;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۫ۛ") ^ i5) * (-47);
                        i6 = ((iM11306 ^ i4) * (-21333)) ^ (-101476181);
                        i7 = 1103026227;
                    }
                    break;
                case -349601488:
                case 1158260295:
                    c13626M50132 = c11718.m50132(c13626M47183);
                    if (C2124.f7782 <= 0) {
                        iM11306 = C19806.m45029("ۘۨ") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-25145)) ^ 2011950989;
                        i7 = -788792184;
                    } else {
                        iM11306 = C19806.m45029("ۡ۫") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-19753)) ^ (-1359624624);
                        i7 = -872775583;
                    }
                    break;
                case -335904590:
                case 1977256398:
                    if (C1668.f6641 >= 0) {
                        iM11306 = C19806.m45029("ۘۨ") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-25145)) ^ 2011950989;
                        i7 = -788792184;
                    } else {
                        iM11306 = (C19806.m45029("ۤܰ") ^ i5) * 29;
                        i6 = ((iM11306 ^ i4) * (-11151)) ^ (-1486495099);
                        i7 = -948521008;
                    }
                    break;
                case -302448177:
                case 1290561514:
                    c17367M40441.skipBytes(2);
                    if (C1668.f6641 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܽ۬") ^ i4;
                        i6 = ((iM11306 ^ i5) * 25035) ^ (-2092389255);
                        i7 = 1979356738;
                    } else {
                        iM11306 = (i4 - C19806.m45029("ܳܰ")) * (-111);
                        i6 = ((iM11306 ^ i5) * 16243) ^ (-1829994145);
                        i7 = 1225840138;
                    }
                    break;
                case -211278896:
                case 887867016:
                    C20190.m45649((InterfaceC0433) c17367M40441, i);
                    if (C7105.f23796 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۛۢ") ^ i5;
                        i6 = ((iM11306 ^ i4) * 27601) ^ 923903153;
                        i7 = 578910797;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩺᩸") + i5) * (-117);
                        i6 = ((iM11306 ^ i4) * (-19017)) ^ 448769577;
                        i7 = 305851070;
                    }
                    break;
                case -182969309:
                case 309994488:
                    if (c11718.f39376) {
                        iM11306 = (ThreadFactoryC3888.m11306("۫ۛ") ^ i5) * (-47);
                        i6 = ((iM11306 ^ i4) * (-21333)) ^ (-101476181);
                        i7 = 1103026227;
                    } else {
                        iM11306 = (i4 - C19806.m45029("ܳ᩶")) * 63;
                        i6 = ((iM11306 ^ i5) * 3533) ^ (-2033035232);
                        i7 = -1103755962;
                    }
                    break;
                case 605274952:
                case 1867326367:
                    c6382.m17521();
                    c13626M47183 = c6094.m47183();
                    if (RunnableC1564.m5345()) {
                        iM11306 = C19806.m45029("ۘۨ") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-25145)) ^ 2011950989;
                        i7 = -788792184;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩸ۛ") ^ i4;
                        i6 = ((iM11306 ^ i5) * 31641) ^ 1894393980;
                        i7 = 1965706220;
                    }
                    break;
                case 1551937748:
                case 2100454882:
                    bArrM33327 = c13626M50132.m33327();
                    if (C2642.f10294 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܽ۬") ^ i4;
                        i6 = ((iM11306 ^ i5) * 25035) ^ (-2092389255);
                        i7 = 1979356738;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֡᩶") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-11063)) ^ 488452225;
                        i7 = 1491228558;
                    }
                    break;
                case 1606945698:
                case 2129905917:
                    if (C13890.m33728()) {
                        iM11306 = (ThreadFactoryC3888.m11306("۫ۛ") ^ i5) * (-47);
                        i6 = ((iM11306 ^ i4) * (-21333)) ^ (-101476181);
                        i7 = 1103026227;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܺܶ") + i4) * 25;
                        i6 = ((iM11306 ^ i5) * (-29851)) ^ 1914083235;
                        i7 = -1478485727;
                    }
                    break;
                default:
                    i2 = 0;
                    iM11306 = (i4 - C19806.m45029("ۡᩳ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                    i6 = ((iM11306 ^ i5) * 30017) ^ 2422911;
                    i7 = 309399842;
                    break;
            }
        }
    }

    @Override // l.ComponentCallbacksC22654
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        int i;
        int i2;
        short[] sArr;
        short[] sArr2;
        int i3;
        int i4;
        int i5;
        int i6;
        TextView textView;
        int i7;
        int iM11306;
        int i8;
        int i9;
        int i10;
        short[] sArr3;
        int iM45029;
        int i11;
        int i12;
        int i13;
        int i14;
        int iM450210;
        int i15;
        int iM11307;
        int i16;
        int iM450211;
        int i17;
        final C11718 c11718 = this;
        int i18 = -1002686819;
        int i19 = C3722.f13525;
        int i20 = C0629.f2722;
        int iM11308 = ThreadFactoryC3888.m11306("ۗۙ") ^ i20;
        int i21 = ((iM11308 ^ i19) * (-4929)) ^ 2057667739;
        int i22 = iM11308 ^ (-773481691);
        TextView textView2 = null;
        String strM50150 = null;
        TextView textView3 = null;
        ViewOnClickListenerC8182 viewOnClickListenerC8182 = null;
        String strM3406 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        short[] sArr6 = null;
        View viewM8167 = null;
        int iM11309 = 0;
        int i23 = 0;
        short s = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        View viewM8168 = null;
        View viewM8169 = null;
        ActivityC5677 activityC5677 = null;
        InterfaceC7191 interfaceC7191 = null;
        TextView textView4 = null;
        String strM2308 = null;
        int i31 = 0;
        boolean z = false;
        int iM113010 = 0;
        int i32 = 0;
        C6111 c6111 = null;
        C23229 c23229M51233 = null;
        String str2 = null;
        C20556 c20556 = null;
        C15267 c15267 = null;
        while (true) {
            i18 = i22 ^ ((((i18 ^ i19) * 1547) >> 31) & i21);
            switch (i18) {
                case -2115926937:
                case -1516784420:
                    C2788.m8472();
                    if (ThreadFactoryC3888.m11300() > 0) {
                        str = strM50150;
                        i = i32;
                        i2 = i26;
                        sArr = sArr4;
                        i5 = i30;
                        i6 = i31;
                        textView = textView4;
                        i7 = i27;
                        int iM450212 = (C19806.m45029("ۗ֨") ^ i19) * (-21);
                        i8 = ((iM450212 ^ i20) * (-10119)) ^ (-1244318995);
                        i22 = iM450212 ^ 1491362596;
                        c11718 = this;
                        i27 = i7;
                        textView4 = textView;
                        i31 = i6;
                        strM50150 = str;
                        i32 = i;
                        i30 = i5;
                        sArr4 = sArr;
                        i26 = i2;
                        i21 = i8;
                    } else {
                        iM450211 = C19806.m45029("ۧۘ") ^ i20;
                        i21 = ((iM450211 ^ i19) * (-29581)) ^ 252313628;
                        i17 = 158067843;
                        i22 = iM450211 ^ i17;
                    }
                    break;
                case -1618416312:
                case -1343389582:
                    str = strM50150;
                    int i33 = i32;
                    i2 = i26;
                    short[] sArr7 = sArr5;
                    int i34 = i28;
                    TextView textView5 = textView4;
                    int i35 = i29;
                    viewM8168 = C2642.m8167(view, C19806.m45029(C2871.m8640(sArr7, i34, i35, i2)) ^ 2128284871);
                    int iM113011 = (ThreadFactoryC3888.m11306("ۧۚ") + i20) * 23;
                    i11 = ((iM113011 ^ i19) * (-15961)) ^ (-1370361003);
                    i22 = iM113011 ^ (-190375208);
                    i29 = i35;
                    textView4 = textView5;
                    i31 = i31;
                    i32 = i33;
                    i30 = i30;
                    i28 = i34;
                    sArr5 = sArr7;
                    i26 = i2;
                    i21 = i11;
                    strM50150 = str;
                    break;
                case -1606793712:
                case 1128174138:
                    str = strM50150;
                    c20556.m46370(str2, false);
                    if (C3577.m10565()) {
                        c15267 = new C15267(new C3645());
                        c11718.f39380 = c15267;
                        c23229M51233 = C23229.m51233(getViewLifecycleOwner());
                        iM11307 = ThreadFactoryC3888.m11306("᩻֡") ^ i19;
                        i21 = ((iM11307 ^ i20) * 23855) ^ (-1801318526);
                        i16 = 1968003477;
                        i22 = iM11307 ^ i16;
                        strM50150 = str;
                    }
                    i = i32;
                    i2 = i26;
                    sArr3 = sArr4;
                    sArr2 = sArr5;
                    i3 = i28;
                    i4 = i29;
                    i5 = i30;
                    i6 = i31;
                    textView = textView4;
                    i7 = i27;
                    int iM113012 = (ThreadFactoryC3888.m11306("۟ۗ") + i20) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                    i11 = ((iM113012 ^ i19) * 20815) ^ (-1785511434);
                    i13 = iM113012 ^ 781569023;
                    i27 = i7;
                    textView4 = textView;
                    i31 = i6;
                    i32 = i;
                    i30 = i5;
                    i28 = i3;
                    sArr5 = sArr2;
                    i29 = i4;
                    sArr4 = sArr3;
                    c15267 = null;
                    i22 = i13;
                    i26 = i2;
                    i21 = i11;
                    strM50150 = str;
                    break;
                case -1488733072:
                case -1265033726:
                    str = strM50150;
                    i = i32;
                    i2 = i26;
                    sArr = sArr4;
                    sArr2 = sArr5;
                    i3 = i28;
                    i4 = i29;
                    i5 = i30;
                    i6 = i31;
                    textView = textView4;
                    i7 = i27;
                    i24 = s * 2;
                    i25 = 1;
                    iM11306 = C19806.m45029("ۤۖ") ^ i20;
                    i8 = ((iM11306 ^ i19) * 21337) ^ (-872604790);
                    i9 = -1201818936;
                    int i36 = iM11306 ^ i9;
                    i27 = i7;
                    textView4 = textView;
                    i31 = i6;
                    strM50150 = str;
                    i32 = i;
                    i30 = i5;
                    i28 = i3;
                    sArr5 = sArr2;
                    i29 = i4;
                    sArr4 = sArr;
                    i22 = i36;
                    i26 = i2;
                    c11718 = this;
                    i21 = i8;
                    break;
                case -1422737794:
                case 42862968:
                    str = strM50150;
                    i = i32;
                    i2 = i26;
                    sArr = sArr4;
                    sArr2 = sArr5;
                    i3 = i28;
                    i4 = i29;
                    i5 = i30;
                    i6 = i31;
                    textView = textView4;
                    i7 = i27;
                    int i37 = s + 1;
                    if ((i24 + i25) - (i37 * i37) <= 0) {
                        iM11306 = C19806.m45029("ۨ᩻") ^ i19;
                        i8 = ((iM11306 ^ i20) * 21347) ^ 416942883;
                        i9 = 1662397909;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۖۗ") ^ i20) * 73;
                        i8 = ((iM11306 ^ i19) * (-10141)) ^ 1117731887;
                        i9 = -1859173225;
                    }
                    int i38 = iM11306 ^ i9;
                    i27 = i7;
                    textView4 = textView;
                    i31 = i6;
                    strM50150 = str;
                    i32 = i;
                    i30 = i5;
                    i28 = i3;
                    sArr5 = sArr2;
                    i29 = i4;
                    sArr4 = sArr;
                    i22 = i38;
                    i26 = i2;
                    c11718 = this;
                    i21 = i8;
                    break;
                case -1291497747:
                case -670674662:
                    C1461.m5083(textView2, C13012.m32189(i31, strM50150));
                    C1937.m6291(c11718.f39374, new View.OnClickListener() { // from class: l.ۛ֨ۜ
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            C11718.m29266(this.f19489, view2);
                        }
                    });
                    textView4 = c11718.f39374;
                    if (!RunnableC3388.m10064()) {
                        str = strM50150;
                        i = i32;
                        i2 = i26;
                        sArr3 = sArr4;
                        sArr2 = sArr5;
                        i3 = i28;
                        i4 = i29;
                        i5 = i30;
                        i6 = i31;
                        textView = textView4;
                        i7 = i27;
                        int iM113013 = (ThreadFactoryC3888.m11306("۟ۗ") + i20) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i11 = ((iM113013 ^ i19) * 20815) ^ (-1785511434);
                        i13 = iM113013 ^ 781569023;
                        i27 = i7;
                        textView4 = textView;
                        i31 = i6;
                        i32 = i;
                        i30 = i5;
                        i28 = i3;
                        sArr5 = sArr2;
                        i29 = i4;
                        sArr4 = sArr3;
                        c15267 = null;
                        i22 = i13;
                        i26 = i2;
                        i21 = i11;
                        strM50150 = str;
                    } else {
                        iM450211 = C19806.m45029("ᩴ֡") ^ i20;
                        i21 = ((iM450211 ^ i19) * (-28197)) ^ (-76515142);
                        i17 = -113358849;
                        i22 = iM450211 ^ i17;
                    }
                    break;
                case -1267592675:
                case -100063131:
                    if (C1875.f7103 >= 0) {
                        iM450211 = C19806.m45029("۠۬") ^ i19;
                        i21 = ((iM450211 ^ i20) * 23259) ^ (-17007338);
                        i17 = -91008965;
                    } else {
                        iM450211 = C19806.m45029("ۧۘ") ^ i20;
                        i21 = ((iM450211 ^ i19) * (-29581)) ^ 252313628;
                        i17 = 158067843;
                    }
                    i22 = iM450211 ^ i17;
                    break;
                case -1192004378:
                case -820777888:
                    str = strM50150;
                    i = i32;
                    i2 = i26;
                    sArr = sArr4;
                    sArr2 = sArr5;
                    i3 = i28;
                    i4 = i29;
                    i5 = i30;
                    i6 = i31;
                    textView = textView4;
                    i7 = i27;
                    c11718.f39373 = viewM8167;
                    strM3406 = C0817.m3406(f39370, 264, 3, i2);
                    iM11306 = (i19 - ThreadFactoryC3888.m11306("᩷ۨ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                    i8 = ((iM11306 ^ i20) * 21765) ^ (-60531902);
                    i9 = -365177536;
                    int i39 = iM11306 ^ i9;
                    i27 = i7;
                    textView4 = textView;
                    i31 = i6;
                    strM50150 = str;
                    i32 = i;
                    i30 = i5;
                    i28 = i3;
                    sArr5 = sArr2;
                    i29 = i4;
                    sArr4 = sArr;
                    i22 = i39;
                    i26 = i2;
                    c11718 = this;
                    i21 = i8;
                    break;
                case -1166660221:
                case 1520733203:
                    str = strM50150;
                    i2 = i26;
                    i6 = i31;
                    textView = textView4;
                    short[] sArr8 = sArr6;
                    int i40 = i30;
                    viewM8169 = C2642.m8167(view, ThreadFactoryC3888.m11306(AbstractC0464.m2308(sArr8, i40, 3, i2)) ^ 2119591391);
                    if (C0278.f1572 > 0) {
                        int iM450213 = (C19806.m45029("۬ۧ") ^ i20) * (-105);
                        i8 = ((iM450213 ^ i19) * 6999) ^ 483598454;
                        i22 = iM450213 ^ (-1115387489);
                        sArr6 = sArr8;
                        i30 = i40;
                        textView4 = textView;
                        i31 = i6;
                        strM50150 = str;
                        i32 = 8;
                        i26 = i2;
                        i21 = i8;
                    } else {
                        sArr6 = sArr8;
                        i5 = i40;
                        sArr3 = sArr4;
                        i7 = i27;
                        sArr2 = sArr5;
                        i3 = i28;
                        i4 = i29;
                        i = 8;
                        int iM113014 = (ThreadFactoryC3888.m11306("۟ۗ") + i20) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i11 = ((iM113014 ^ i19) * 20815) ^ (-1785511434);
                        i13 = iM113014 ^ 781569023;
                        i27 = i7;
                        textView4 = textView;
                        i31 = i6;
                        i32 = i;
                        i30 = i5;
                        i28 = i3;
                        sArr5 = sArr2;
                        i29 = i4;
                        sArr4 = sArr3;
                        c15267 = null;
                        i22 = i13;
                        i26 = i2;
                        i21 = i11;
                        strM50150 = str;
                    }
                    break;
                case -1158163146:
                case 1522552917:
                    String str3 = strM50150;
                    int i41 = i32;
                    i2 = i26;
                    RunnableC1895.m6165(viewM8169, i41);
                    c11718.f39378.m17065(true);
                    c11718.f39378.m17021();
                    activityC5677 = (ActivityC5677) AbstractC0464.m2305(this);
                    int iM113015 = ThreadFactoryC3888.m11306("۫ۗ") ^ i19;
                    i8 = ((iM113015 ^ i20) * (-5337)) ^ (-1324401018);
                    i22 = iM113015 ^ 14131252;
                    i32 = i41;
                    i31 = i31;
                    strM50150 = str3;
                    z = true;
                    i26 = i2;
                    i21 = i8;
                    break;
                case -1031106301:
                case 1177197212:
                    str = strM50150;
                    i = i32;
                    i2 = i26;
                    sArr = sArr4;
                    sArr2 = sArr5;
                    i3 = i28;
                    i4 = i29;
                    i5 = i30;
                    i6 = i31;
                    textView = textView4;
                    i7 = i27;
                    s = f39370[260];
                    iM11306 = (ThreadFactoryC3888.m11306("۟ܿ") ^ i19) * 61;
                    i8 = ((iM11306 ^ i20) * (-31031)) ^ 495667668;
                    i9 = 1537686960;
                    int i310 = iM11306 ^ i9;
                    i27 = i7;
                    textView4 = textView;
                    i31 = i6;
                    strM50150 = str;
                    i32 = i;
                    i30 = i5;
                    i28 = i3;
                    sArr5 = sArr2;
                    i29 = i4;
                    sArr4 = sArr;
                    i22 = i310;
                    i26 = i2;
                    c11718 = this;
                    i21 = i8;
                    break;
                case -893802252:
                case 1243416523:
                    c6111.m16864(interfaceC7191);
                    c11718.f39378.m16868(new C9251(c11718));
                    iM450211 = (C19806.m45029("ۙۗ") + i20) * 23;
                    i21 = ((iM450211 ^ i19) * 24971) ^ (-464275134);
                    i17 = -1580777657;
                    i22 = iM450211 ^ i17;
                    break;
                case -857003853:
                case -167937777:
                    C1148.m4232();
                    RunnableC0195.m1431();
                    break;
                case -706527682:
                case -95884808:
                    c11718.f39378.m16862(new C1488(c11718));
                    c6111 = c11718.f39378;
                    interfaceC7191 = new InterfaceC7191() { // from class: l.ܿ֨ۜ
                        @Override // l.InterfaceC7191
                        /* JADX INFO: renamed from: ۙ */
                        public final void mo4041(int i42, int i43) {
                            C11718.m29265(this.f54363, i42, i43);
                        }
                    };
                    if (!C1977.m6356()) {
                        iM450211 = C19806.m45029("᩹ۨ") ^ i19;
                        i21 = ((iM450211 ^ i20) * 11319) ^ 1532157976;
                        i17 = -272325471;
                        i22 = iM450211 ^ i17;
                    } else {
                        str = strM50150;
                        i = i32;
                        i2 = i26;
                        sArr = sArr4;
                        i5 = i30;
                        i6 = i31;
                        textView = textView4;
                        i7 = i27;
                        int iM450214 = (C19806.m45029("ۗ֨") ^ i19) * (-21);
                        i8 = ((iM450214 ^ i20) * (-10119)) ^ (-1244318995);
                        i22 = iM450214 ^ 1491362596;
                        c11718 = this;
                        i27 = i7;
                        textView4 = textView;
                        i31 = i6;
                        strM50150 = str;
                        i32 = i;
                        i30 = i5;
                        sArr4 = sArr;
                        i26 = i2;
                        i21 = i8;
                    }
                    break;
                case -642251706:
                case 1059620688:
                    str = strM50150;
                    i = i32;
                    i2 = i26;
                    sArr = sArr4;
                    sArr2 = sArr5;
                    i3 = i28;
                    i4 = i29;
                    i5 = i30;
                    i6 = i31;
                    textView = textView4;
                    i7 = i27;
                    viewM8167 = C2642.m8167(view, C19806.m45029(strM2308) ^ 2125949992);
                    if (C3535.f13026 > 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("֡ۛ") ^ i20) * 77;
                        i8 = ((iM11306 ^ i19) * 29921) ^ 1650941786;
                        i9 = 395476198;
                        int i311 = iM11306 ^ i9;
                        i27 = i7;
                        textView4 = textView;
                        i31 = i6;
                        strM50150 = str;
                        i32 = i;
                        i30 = i5;
                        i28 = i3;
                        sArr5 = sArr2;
                        i29 = i4;
                        sArr4 = sArr;
                        i22 = i311;
                        i26 = i2;
                        c11718 = this;
                        i21 = i8;
                    }
                    i28 = i3;
                    sArr5 = sArr2;
                    i29 = i4;
                    int iM450215 = (C19806.m45029("ۗ֨") ^ i19) * (-21);
                    i8 = ((iM450215 ^ i20) * (-10119)) ^ (-1244318995);
                    i22 = iM450215 ^ 1491362596;
                    c11718 = this;
                    i27 = i7;
                    textView4 = textView;
                    i31 = i6;
                    strM50150 = str;
                    i32 = i;
                    i30 = i5;
                    sArr4 = sArr;
                    i26 = i2;
                    i21 = i8;
                    break;
                case -538067987:
                case 1854937757:
                    C2704.m8255();
                    C3660.m10791();
                    str = strM50150;
                    i = i32;
                    i2 = i26;
                    sArr3 = sArr4;
                    sArr2 = sArr5;
                    i3 = i28;
                    i4 = i29;
                    i5 = i30;
                    i6 = i31;
                    textView = textView4;
                    i7 = i27;
                    int iM113016 = (ThreadFactoryC3888.m11306("۟ۗ") + i20) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                    i11 = ((iM113016 ^ i19) * 20815) ^ (-1785511434);
                    i13 = iM113016 ^ 781569023;
                    i27 = i7;
                    textView4 = textView;
                    i31 = i6;
                    i32 = i;
                    i30 = i5;
                    i28 = i3;
                    sArr5 = sArr2;
                    i29 = i4;
                    sArr4 = sArr3;
                    c15267 = null;
                    i22 = i13;
                    i26 = i2;
                    i21 = i11;
                    strM50150 = str;
                    break;
                case -363680106:
                case 45494285:
                    textView4.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.ۧ֨ۜ
                        @Override // android.view.View.OnLongClickListener
                        public final boolean onLongClick(View view2) {
                            C11718 c11719 = this.f36370;
                            String strM29301 = c11719.m29301();
                            C8067 c8067BuildDialog = ((ActivityC5677) c11719.requireActivity()).buildDialog();
                            c8067BuildDialog.m21261(strM29301);
                            c8067BuildDialog.m21269();
                            return true;
                        }
                    });
                    m29288();
                    textView3 = c11718.f39384;
                    viewOnClickListenerC8182 = new ViewOnClickListenerC8182(2, c11718);
                    iM450211 = ThreadFactoryC3888.m11306("۫۠") ^ i19;
                    i21 = ((iM450211 ^ i20) * (-2359)) ^ (-437623392);
                    i17 = 1824303269;
                    i22 = iM450211 ^ i17;
                    break;
                case -184604008:
                case 193413071:
                    str = strM50150;
                    i = i32;
                    i2 = i26;
                    i5 = i30;
                    i6 = i31;
                    textView = textView4;
                    c11718.f39374 = (TextView) C3743.m10957(view, iM11309 ^ i23);
                    sArr5 = f39370;
                    i28 = BottomAppBarTopEdgeTreatment.ANGLE_UP;
                    i29 = 3;
                    if (!CallableC1627.f6528) {
                        sArr = sArr4;
                        i7 = i27;
                        int iM450216 = (C19806.m45029("ۗ֨") ^ i19) * (-21);
                        i8 = ((iM450216 ^ i20) * (-10119)) ^ (-1244318995);
                        i22 = iM450216 ^ 1491362596;
                        c11718 = this;
                        i27 = i7;
                        textView4 = textView;
                        i31 = i6;
                        strM50150 = str;
                        i32 = i;
                        i30 = i5;
                        sArr4 = sArr;
                        i26 = i2;
                        i21 = i8;
                    } else {
                        int iM450217 = C19806.m45029("ᩴۛ") ^ i20;
                        i11 = ((iM450217 ^ i19) * 131) ^ (-1681720495);
                        i22 = iM450217 ^ (-1132369327);
                        textView4 = textView;
                        i31 = i6;
                        i32 = i;
                        i30 = i5;
                        i26 = i2;
                        i21 = i11;
                        strM50150 = str;
                    }
                    break;
                case 56933795:
                case 1345344713:
                    c15267.mo30284(c23229M51233);
                    C6111 c6112 = c11718.f39378;
                    if (C1461.f5957 > 0) {
                        str = strM50150;
                        c11718.f39377 = new ViewOnClickListenerC0201(c11718, c6112, c11718.f39380);
                        c11718.f39380.mo36571(new C3145(3, c11718));
                        iM11307 = C19806.m45029("ۚ᩵") ^ i20;
                        i21 = ((iM11307 ^ i19) * (-8553)) ^ (-1888792843);
                        i16 = -383264793;
                        i22 = iM11307 ^ i16;
                        strM50150 = str;
                    } else {
                        str = strM50150;
                        i2 = i26;
                        i14 = i31;
                        iM450210 = (ThreadFactoryC3888.m11306("ۡ᩷") + i20) * 45;
                        i11 = ((iM450210 ^ i19) * 18549) ^ (-950540685);
                        i15 = -349155051;
                        i22 = iM450210 ^ i15;
                        i31 = i14;
                        i26 = i2;
                        i21 = i11;
                        strM50150 = str;
                    }
                    break;
                case 436527254:
                case 1873473911:
                    if (!C0817.f3443) {
                        str = strM50150;
                        i = i32;
                        i2 = i26;
                        sArr3 = sArr4;
                        sArr2 = sArr5;
                        i3 = i28;
                        i4 = i29;
                        i5 = i30;
                        i6 = i31;
                        textView = textView4;
                        i7 = i27;
                        int iM113017 = (ThreadFactoryC3888.m11306("۟ۗ") + i20) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i11 = ((iM113017 ^ i19) * 20815) ^ (-1785511434);
                        i13 = iM113017 ^ 781569023;
                        i27 = i7;
                        textView4 = textView;
                        i31 = i6;
                        i32 = i;
                        i30 = i5;
                        i28 = i3;
                        sArr5 = sArr2;
                        i29 = i4;
                        sArr4 = sArr3;
                        c15267 = null;
                        i22 = i13;
                        i26 = i2;
                        i21 = i11;
                        strM50150 = str;
                    } else {
                        iM450211 = C19806.m45029("۠۬") ^ i19;
                        i21 = ((iM450211 ^ i20) * 23259) ^ (-17007338);
                        i17 = -91008965;
                        i22 = iM450211 ^ i17;
                    }
                    break;
                case 446320912:
                case 461807610:
                    i10 = 45484;
                    int iM450218 = C19806.m45029("᩻۠") ^ i20;
                    i21 = ((iM450218 ^ i19) * (-31725)) ^ (-1102963534);
                    i27 = i27;
                    textView4 = textView4;
                    i31 = i31;
                    strM50150 = strM50150;
                    i32 = i32;
                    i30 = i30;
                    i28 = i28;
                    sArr5 = sArr5;
                    i29 = i29;
                    sArr4 = sArr4;
                    i26 = i10;
                    i22 = iM450218 ^ 2028906766;
                    c11718 = this;
                    break;
                case 517492233:
                case 1409585431:
                    textView2 = c11718.f39374;
                    strM50150 = C22627.m50150(m29301());
                    i31 = 80;
                    iM450211 = ThreadFactoryC3888.m11306("᩶ۨ") ^ i19;
                    i21 = ((iM450211 ^ i20) * (-20625)) ^ 293639395;
                    i17 = -1770503675;
                    i22 = iM450211 ^ i17;
                    break;
                case 631851682:
                case 1181834330:
                    str = strM50150;
                    activityC5677.m31019(c11718.f39378);
                    i2 = i26;
                    i14 = i31;
                    c20556 = new C20556((ActivityC5677) C1460.m5049(this), c11718.f39378, view);
                    if (C19806.f63586) {
                        iM450210 = (ThreadFactoryC3888.m11306("ۡ᩷") + i20) * 45;
                        i11 = ((iM450210 ^ i19) * 18549) ^ (-950540685);
                        i15 = -349155051;
                    } else {
                        iM450210 = (i20 - C19806.m45029("᩸ᩴ")) * 69;
                        i11 = ((iM450210 ^ i19) * 29577) ^ 1877050799;
                        i15 = -1803225676;
                    }
                    i22 = iM450210 ^ i15;
                    i31 = i14;
                    i26 = i2;
                    i21 = i11;
                    strM50150 = str;
                    break;
                case 764162872:
                case 1181280924:
                    i10 = 41718;
                    int iM450219 = C19806.m45029("᩻۠") ^ i20;
                    i21 = ((iM450219 ^ i19) * (-31725)) ^ (-1102963534);
                    i27 = i27;
                    textView4 = textView4;
                    i31 = i31;
                    strM50150 = strM50150;
                    i32 = i32;
                    i30 = i30;
                    i28 = i28;
                    sArr5 = sArr5;
                    i29 = i29;
                    sArr4 = sArr4;
                    i26 = i10;
                    i22 = iM450219 ^ 2028906766;
                    c11718 = this;
                    break;
                case 900468476:
                case 1803698703:
                    str = strM50150;
                    i = i32;
                    i2 = i26;
                    sArr = sArr4;
                    sArr2 = sArr5;
                    i3 = i28;
                    i4 = i29;
                    i5 = i30;
                    i6 = i31;
                    textView = textView4;
                    i7 = i27;
                    super.onViewCreated(view, bundle);
                    strM2308 = AbstractC0464.m2308(f39370, 261, 3, i2);
                    iM11306 = (ThreadFactoryC3888.m11306("ܿۚ") ^ i19) * (-113);
                    i8 = ((iM11306 ^ i20) * (-9199)) ^ (-1850266163);
                    i9 = 1278046143;
                    int i312 = iM11306 ^ i9;
                    i27 = i7;
                    textView4 = textView;
                    i31 = i6;
                    strM50150 = str;
                    i32 = i;
                    i30 = i5;
                    i28 = i3;
                    sArr5 = sArr2;
                    i29 = i4;
                    sArr4 = sArr;
                    i22 = i312;
                    i26 = i2;
                    c11718 = this;
                    i21 = i8;
                    break;
                case 995486719:
                case 1830000533:
                    String str4 = strM50150;
                    int i42 = iM113010;
                    int i43 = i32;
                    c11718.f39378 = (C6111) C3743.m10957(view, i42);
                    sArr4 = f39370;
                    i27 = 267;
                    int iM113018 = ThreadFactoryC3888.m11306("ܺۘ") ^ i20;
                    iM113010 = i42;
                    i31 = i31;
                    strM50150 = str4;
                    i30 = i30;
                    i28 = i28;
                    sArr5 = sArr5;
                    i29 = i29;
                    i22 = iM113018 ^ 1243267374;
                    i26 = i26;
                    i21 = ((iM113018 ^ i19) * 15497) ^ (-1985417871);
                    textView4 = textView4;
                    i32 = i43;
                    break;
                case 996144517:
                case 1500903220:
                    str = strM50150;
                    i = i32;
                    i2 = i26;
                    sArr2 = sArr5;
                    i3 = i28;
                    i5 = i30;
                    i6 = i31;
                    textView = textView4;
                    i4 = i29;
                    short[] sArr9 = sArr4;
                    i7 = i27;
                    iM11309 = ThreadFactoryC3888.m11306(C1419.m4969(sArr9, i7, 3, i2));
                    i23 = 2127944542;
                    if (!C2332.f8260) {
                        sArr = sArr9;
                        i28 = i3;
                        sArr5 = sArr2;
                        i29 = i4;
                        int iM4502110 = (C19806.m45029("ۗ֨") ^ i19) * (-21);
                        i8 = ((iM4502110 ^ i20) * (-10119)) ^ (-1244318995);
                        i22 = iM4502110 ^ 1491362596;
                        c11718 = this;
                        i27 = i7;
                        textView4 = textView;
                        i31 = i6;
                        strM50150 = str;
                        i32 = i;
                        i30 = i5;
                        sArr4 = sArr;
                        i26 = i2;
                        i21 = i8;
                    } else {
                        iM45029 = (i19 - ThreadFactoryC3888.m11306("ܶۢ")) * (-85);
                        sArr3 = sArr9;
                        i11 = ((iM45029 ^ i20) * 10499) ^ 857798509;
                        i12 = 2040323298;
                        i13 = iM45029 ^ i12;
                        i27 = i7;
                        textView4 = textView;
                        i31 = i6;
                        i32 = i;
                        i30 = i5;
                        i28 = i3;
                        sArr5 = sArr2;
                        i29 = i4;
                        sArr4 = sArr3;
                        i22 = i13;
                        i26 = i2;
                        i21 = i11;
                        strM50150 = str;
                    }
                    break;
                case 1237467690:
                case 1796731241:
                    C7105.m18993(textView3, viewOnClickListenerC8182);
                    c11718.f39391 = z;
                    C1937.m6282(c11718.f39387.m42622(), getViewLifecycleOwner(), new InterfaceC10597() { // from class: l.᩻֨ۜ
                        @Override // l.InterfaceC10597
                        /* JADX INFO: renamed from: ۙ */
                        public final void mo1473(Object obj) {
                            C11718.m29273(this.f75684, (C6094) obj);
                        }
                    });
                    break;
                case 1270383177:
                case 1316787697:
                    str = strM50150;
                    c11718.f39384 = (TextView) viewM8168;
                    sArr6 = f39370;
                    i30 = 273;
                    int iM113019 = (ThreadFactoryC3888.m11306("ܿܶ") + i19) * 71;
                    i22 = iM113019 ^ 1021658628;
                    i31 = i31;
                    i26 = i26;
                    i21 = ((iM113019 ^ i20) * 19915) ^ 695344577;
                    textView4 = textView4;
                    i32 = i32;
                    strM50150 = str;
                    break;
                case 1407122122:
                case 1634905401:
                    str = strM50150;
                    i = i32;
                    i2 = i26;
                    sArr3 = sArr4;
                    sArr2 = sArr5;
                    i3 = i28;
                    i4 = i29;
                    i5 = i30;
                    i6 = i31;
                    textView = textView4;
                    i7 = i27;
                    iM113010 = ThreadFactoryC3888.m11306(strM3406) ^ 2129045623;
                    if (C3660.f13403 >= 0) {
                        int iM1130110 = (ThreadFactoryC3888.m11306("۟ۗ") + i20) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i11 = ((iM1130110 ^ i19) * 20815) ^ (-1785511434);
                        i13 = iM1130110 ^ 781569023;
                        i27 = i7;
                        textView4 = textView;
                        i31 = i6;
                        i32 = i;
                        i30 = i5;
                        i28 = i3;
                        sArr5 = sArr2;
                        i29 = i4;
                        sArr4 = sArr3;
                        c15267 = null;
                    } else {
                        iM45029 = (C19806.m45029("᩶᩷") ^ i19) * (-107);
                        i11 = ((iM45029 ^ i20) * 11167) ^ (-608306425);
                        i12 = 966653474;
                        i13 = iM45029 ^ i12;
                        i27 = i7;
                        textView4 = textView;
                        i31 = i6;
                        i32 = i;
                        i30 = i5;
                        i28 = i3;
                        sArr5 = sArr2;
                        i29 = i4;
                        sArr4 = sArr3;
                    }
                    i22 = i13;
                    i26 = i2;
                    i21 = i11;
                    strM50150 = str;
                    break;
                default:
                    String str5 = strM50150;
                    c11718.f39381 = c20556;
                    int i44 = i26;
                    String strM3859 = C1025.m3859(f39370, 276, 19, i44);
                    int iM450220 = C19806.m45029("ܶ֨") ^ i19;
                    i22 = iM450220 ^ 1715486930;
                    i21 = ((iM450220 ^ i20) * (-22453)) ^ 490231502;
                    i26 = i44;
                    strM50150 = str5;
                    str2 = strM3859;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m29265(C11718 c11718, int i, int i2) {
        C15267 c15267 = null;
        int i3 = -1214371971;
        int i4 = RunnableC3388.f12514;
        int i5 = ThreadFactoryC3888.f14547;
        int iM45029 = (C19806.m45029("ᩳ֫") ^ i5) * 57;
        int i6 = ((iM45029 ^ i4) * 7853) ^ 392031542;
        int i7 = -753245093;
        while (true) {
            i3 = ((((i3 ^ i4) * (-27845)) >> 31) & i6) ^ (iM45029 ^ i7);
            switch (i3) {
                case -1885329519:
                case 556018546:
                    if (RunnableC1564.m5345()) {
                        iM45029 = (i5 - C19806.m45029("ۡ᩹")) * 21;
                        i6 = ((iM45029 ^ i4) * 14799) ^ (-129417129);
                        i7 = 1942136117;
                    } else {
                        iM45029 = (i5 - ThreadFactoryC3888.m11306("֫᩻")) * 19;
                        i6 = ((iM45029 ^ i4) * 12943) ^ 1676523633;
                        i7 = 783371751;
                    }
                    break;
                case -1881466415:
                case 1728482997:
                    c15267.mo10752(i, i2, c11718);
                    iM45029 = C19806.m45029("᩻ۙ") ^ i5;
                    i6 = ((iM45029 ^ i4) * 9029) ^ 1608432997;
                    i7 = 1614587266;
                    break;
                case -1875436499:
                case -865668936:
                    if (C2642.f10294 <= 0) {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("ܽۢ")) * (-33);
                        i6 = ((iM45029 ^ i5) * (-9509)) ^ (-1041554722);
                        i7 = -351909843;
                    } else {
                        iM45029 = (C19806.m45029("ۡܿ") + i4) * q.h;
                        i6 = ((iM45029 ^ i5) * (-30587)) ^ (-1895969062);
                        i7 = -1116804476;
                    }
                    break;
                case -1717713229:
                case 1708395785:
                    C1066.m4023();
                    if (!C2704.f10408) {
                        iM45029 = (i5 - ThreadFactoryC3888.m11306("ۢ᩶")) * (-49);
                        i6 = ((iM45029 ^ i4) * 28069) ^ 1113753374;
                        i7 = -417898243;
                    } else {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("ܽۢ")) * (-33);
                        i6 = ((iM45029 ^ i5) * (-9509)) ^ (-1041554722);
                        i7 = -351909843;
                    }
                    break;
                case -1685104307:
                case 2113763350:
                    C3535.m10431();
                    iM45029 = (C19806.m45029("۫ۙ") ^ i5) * 11;
                    i6 = ((iM45029 ^ i4) * 27795) ^ (-1440435166);
                    i7 = -1644449548;
                    break;
                case -1671310457:
                case 1206219099:
                    if (C2788.m8472() != 0) {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("ܽۢ")) * (-33);
                        i6 = ((iM45029 ^ i5) * (-9509)) ^ (-1041554722);
                        i7 = -351909843;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܳܺ") ^ i4;
                        i6 = ((iM45029 ^ i5) * 7703) ^ (-1123413568);
                        i7 = -539350217;
                    }
                    break;
                case -1621501101:
                case 1814399745:
                    if (C1977.m6356()) {
                        iM45029 = (C19806.m45029("ۡܿ") + i4) * q.h;
                        i6 = ((iM45029 ^ i5) * (-30587)) ^ (-1895969062);
                        i7 = -1116804476;
                    } else {
                        iM45029 = (C19806.m45029("᩸۫") ^ i5) * (-55);
                        i6 = ((iM45029 ^ i4) * (-10243)) ^ 89006749;
                        i7 = -1326036327;
                    }
                    break;
                case -1402789789:
                case -660590482:
                    c15267 = c11718.f39380;
                    if (c15267 != null) {
                        iM45029 = (C19806.m45029("᩵ᩴ") ^ i4) * (-103);
                        i6 = ((iM45029 ^ i5) * 1761) ^ 763433152;
                        i7 = -475724815;
                    } else {
                        iM45029 = C19806.m45029("᩻ۙ") ^ i5;
                        i6 = ((iM45029 ^ i4) * 9029) ^ 1608432997;
                        i7 = 1614587266;
                    }
                    break;
                case -1379065638:
                case -850058352:
                    if (C1460.m5050() != 0) {
                        iM45029 = (C19806.m45029("۫ۙ") ^ i5) * 11;
                        i6 = ((iM45029 ^ i4) * 27795) ^ (-1440435166);
                        i7 = -1644449548;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩷ۛ") ^ i4;
                        i6 = ((iM45029 ^ i5) * 21077) ^ (-1346694407);
                        i7 = 22679976;
                    }
                    break;
                case -821124485:
                case 727341948:
                    if (C7105.f23796 >= 0) {
                        iM45029 = (i5 - C19806.m45029("ۡ᩹")) * 21;
                        i6 = ((iM45029 ^ i4) * 14799) ^ (-129417129);
                        i7 = 1942136117;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩶ۗ") ^ i4;
                        i6 = ((iM45029 ^ i5) * (-26521)) ^ (-256344581);
                        i7 = 1185151728;
                    }
                    break;
                case -392324633:
                case 1349192918:
                    if (C0050.f912 <= 0) {
                        iM45029 = (C19806.m45029("ۡܿ") + i4) * q.h;
                        i6 = ((iM45029 ^ i5) * (-30587)) ^ (-1895969062);
                        i7 = -1116804476;
                    } else {
                        iM45029 = (i4 - C19806.m45029("۠ᩴ")) * (-93);
                        i6 = ((iM45029 ^ i5) * 27973) ^ 1443762530;
                        i7 = -1928315813;
                    }
                    break;
                case -208350367:
                case 351210042:
                    if (C1668.f6641 >= 0) {
                        iM45029 = (i5 - ThreadFactoryC3888.m11306("ۢ᩶")) * (-49);
                        i6 = ((iM45029 ^ i4) * 28069) ^ 1113753374;
                        i7 = -417898243;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩳܳ") + i5) * 77;
                        i6 = ((iM45029 ^ i4) * 30989) ^ 790146664;
                        i7 = -320973433;
                    }
                    break;
                case -168764221:
                case 1257827947:
                    C0671.m3008();
                    if (!C1377.f5749) {
                        iM45029 = (C19806.m45029("۫ۙ") ^ i5) * 11;
                        i6 = ((iM45029 ^ i4) * 27795) ^ (-1440435166);
                        i7 = -1644449548;
                    } else {
                        iM45029 = (C19806.m45029("ۡܿ") + i4) * q.h;
                        i6 = ((iM45029 ^ i5) * (-30587)) ^ (-1895969062);
                        i7 = -1116804476;
                    }
                    break;
                case 272047699:
                case 1104460372:
                    if (RunnableC3388.f12514 >= 0) {
                        iM45029 = (C19806.m45029("۫ۙ") ^ i5) * 11;
                        i6 = ((iM45029 ^ i4) * 27795) ^ (-1440435166);
                        i7 = -1644449548;
                    } else {
                        iM45029 = (i5 - C19806.m45029("ܳۖ")) * (-9);
                        i6 = ((iM45029 ^ i4) * (-6039)) ^ 1841050818;
                        i7 = 1004345447;
                    }
                    break;
                case 733966554:
                case 1703569083:
                    C1461.m5080();
                    C2477.m7593();
                    break;
                case 912004152:
                case 1127438596:
                    break;
                case 1104821487:
                case 1369627627:
                    if (C3660.m10791() != 0) {
                        iM45029 = (i5 - ThreadFactoryC3888.m11306("ۢ᩶")) * (-49);
                        i6 = ((iM45029 ^ i4) * 28069) ^ 1113753374;
                        i7 = -417898243;
                    } else {
                        iM45029 = (i5 - C19806.m45029("۫ۘ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i6 = ((iM45029 ^ i4) * 27925) ^ (-1776188455);
                        i7 = 1603450917;
                    }
                    break;
                default:
                    if (C2124.f7782 <= 0) {
                        iM45029 = (i5 - ThreadFactoryC3888.m11306("ۢ᩶")) * (-49);
                        i6 = ((iM45029 ^ i4) * 28069) ^ 1113753374;
                        i7 = -417898243;
                    } else {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("ۛ۬")) * 75;
                        i6 = ((iM45029 ^ i5) * 4727) ^ (-475791919);
                        i7 = 1797432232;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x013f A[PHI: r4 r6 r7 r23
      0x013f: PHI (r4v3 l.֫ۖۜ) = (r4v2 l.֫ۖۜ), (r4v1 l.֫ۖۜ), (r4v1 l.֫ۖۜ) binds: [B:38:0x013d, B:30:0x00f4, B:25:0x00d8] A[DONT_GENERATE, DONT_INLINE]
      0x013f: PHI (r6v3 l.۫۬) = (r6v2 l.۫۬), (r6v1 l.۫۬), (r6v1 l.۫۬) binds: [B:38:0x013d, B:30:0x00f4, B:25:0x00d8] A[DONT_GENERATE, DONT_INLINE]
      0x013f: PHI (r7v3 int) = (r7v1 int), (r7v2 int), (r7v1 int) binds: [B:38:0x013d, B:30:0x00f4, B:25:0x00d8] A[DONT_GENERATE, DONT_INLINE]
      0x013f: PHI (r23v41 int) = (r23v39 int), (r23v40 int), (r23v42 int) binds: [B:38:0x013d, B:30:0x00f4, B:25:0x00d8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:79:0x0303 A[PHI: r1 r17 r18 r24
      0x0303: PHI (r1v18 int) = (r1v7 int), (r1v8 int), (r1v19 int) binds: [B:78:0x0301, B:74:0x02e2, B:15:0x007f] A[DONT_GENERATE, DONT_INLINE]
      0x0303: PHI (r17v4 char) = (r17v3 char), (r17v2 char), (r17v2 char) binds: [B:78:0x0301, B:74:0x02e2, B:15:0x007f] A[DONT_GENERATE, DONT_INLINE]
      0x0303: PHI (r18v4 int) = (r18v2 int), (r18v3 int), (r18v2 int) binds: [B:78:0x0301, B:74:0x02e2, B:15:0x007f] A[DONT_GENERATE, DONT_INLINE]
      0x0303: PHI (r24v5 short) = (r24v3 short), (r24v4 short), (r24v3 short) binds: [B:78:0x0301, B:74:0x02e2, B:15:0x007f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007d, code lost:
    
        if (l.C1419.f5860 < 0) goto L15;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m29266(l.C11718 r28, android.view.View r29) {
        /*
            Method dump skipped, instruction units count: 1050
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11718.m29266(l.ۨ۬ۜ, android.view.View):void");
    }

    @Override // l.InterfaceC18088
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo29298(C6094 c6094) {
        String strM29301 = null;
        int i = -454676294;
        int i2 = C1461.f5957;
        int i3 = C1875.f7103;
        int iM45029 = (C19806.m45029("֫ۛ") ^ i2) * (-15);
        int i4 = ((iM45029 ^ i3) * 18431) ^ 1585012109;
        int i5 = -424263888;
        while (true) {
            i = ((((i ^ i3) * (-30393)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2079164202:
                case -900816144:
                    if (C1875.f7103 >= 0) {
                        iM45029 = C19806.m45029("ۤܶ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 1445) ^ 723613829;
                        i5 = 346787883;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۠ܽ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 32179) ^ (-1154901270);
                        i5 = -394659524;
                    }
                    break;
                case -2055721990:
                case 1617719690:
                    C0526.m2437();
                    RunnableC1606.m5473();
                    return false;
                case -2042206114:
                case -279034564:
                    return !c6094.m16563(strM29301);
                case -2003109621:
                case -261186775:
                    if (C1066.f4915 > 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۢۖ") ^ i2) * 83;
                        i4 = ((iM45029 ^ i3) * (-32447)) ^ 1920280006;
                        i5 = -1856618311;
                    } else {
                        iM45029 = C19806.m45029("ۤܶ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 1445) ^ 723613829;
                        i5 = 346787883;
                    }
                    break;
                case -1921950530:
                case -1411064311:
                    AbstractC0464.m2313();
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    iM45029 = (C19806.m45029("ۜ᩻") ^ i2) * 109;
                    i4 = ((iM45029 ^ i3) * (-823)) ^ (-923406055);
                    i5 = 639799798;
                    break;
                case -1566667689:
                case -590949431:
                    if (C7105.f23796 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۢۖ") ^ i2) * 83;
                        i4 = ((iM45029 ^ i3) * (-32447)) ^ 1920280006;
                        i5 = -1856618311;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۧ۫") ^ i3;
                        i4 = ((iM45029 ^ i2) * 3251) ^ 1498568748;
                        i5 = -2043017915;
                    }
                    break;
                case -1402260618:
                case 200868932:
                    strM29301 = m29301();
                    if (C1461.m5080()) {
                        iM45029 = C19806.m45029("ܶܿ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 11287) ^ (-673947709);
                        i5 = -1475657661;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܺ᩺") ^ i2;
                        i4 = ((iM45029 ^ i3) * 31305) ^ (-110861028);
                        i5 = -1220836833;
                    }
                    break;
                case -1023828771:
                case 564582649:
                    if (C0962.f3784) {
                        iM45029 = ThreadFactoryC3888.m11306("ܶ᩻") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-25777)) ^ (-116352302);
                        i5 = 1087715233;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ܳܰ")) * q.h;
                        i4 = ((iM45029 ^ i3) * (-893)) ^ (-1968980329);
                        i5 = -1973415559;
                    }
                    break;
                case -948656741:
                case -299881285:
                    if (C2124.m6673() <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۢۖ") ^ i2) * 83;
                        i4 = ((iM45029 ^ i3) * (-32447)) ^ 1920280006;
                        i5 = -1856618311;
                    } else {
                        iM45029 = C19806.m45029("ۚ᩹") ^ i3;
                        i4 = ((iM45029 ^ i2) * 14981) ^ (-114970201);
                        i5 = 1197133316;
                    }
                    break;
                case -356125667:
                case -6660268:
                    C3660.m10791();
                    if (C1025.m3861() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܶ᩻") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-25777)) ^ (-116352302);
                        i5 = 1087715233;
                    } else {
                        iM45029 = (C19806.m45029("ۜ᩻") ^ i2) * 109;
                        i4 = ((iM45029 ^ i3) * (-823)) ^ (-923406055);
                        i5 = 639799798;
                    }
                    break;
                case 55064268:
                case 1725324079:
                    if (C7105.m18985()) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۢۖ") ^ i2) * 83;
                        i4 = ((iM45029 ^ i3) * (-32447)) ^ 1920280006;
                        i5 = -1856618311;
                    } else {
                        iM45029 = (i2 - C19806.m45029("ᩴ᩶")) * (-41);
                        i4 = ((iM45029 ^ i3) * (-26185)) ^ 1510634934;
                        i5 = 522458668;
                    }
                    break;
                case 674490108:
                case 1912386414:
                    if (C0278.f1572 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܶ᩻") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-25777)) ^ (-116352302);
                        i5 = 1087715233;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۚ᩺") ^ i3;
                        i4 = ((iM45029 ^ i2) * 20697) ^ (-1669419622);
                        i5 = 700998032;
                    }
                    break;
                case 884664115:
                case 1120444140:
                    if (C1937.f7317 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܶ᩻") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-25777)) ^ (-116352302);
                        i5 = 1087715233;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩷ܺ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-24299)) ^ (-311920951);
                        i5 = 2111704806;
                    }
                    break;
                case 945709900:
                case 1000528082:
                    RunnableC1606.m5473();
                    if (C1148.f5161 <= 0) {
                        iM45029 = C19806.m45029("ۤܶ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 1445) ^ 723613829;
                        i5 = 346787883;
                    } else {
                        iM45029 = (C19806.m45029("ۜ᩻") ^ i2) * 109;
                        i4 = ((iM45029 ^ i3) * (-823)) ^ (-923406055);
                        i5 = 639799798;
                    }
                    break;
                case 1804682174:
                case 1829489164:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM45029 = (C19806.m45029("ۜ᩻") ^ i2) * 109;
                        i4 = ((iM45029 ^ i3) * (-823)) ^ (-923406055);
                        i5 = 639799798;
                    } else {
                        iM45029 = C19806.m45029("᩵۫") ^ i2;
                        i4 = ((iM45029 ^ i3) * 22487) ^ 2014381326;
                        i5 = -1842830267;
                    }
                    break;
                default:
                    if (C1189.f5284 <= 0) {
                        iM45029 = (C19806.m45029("ۜ᩻") ^ i2) * 109;
                        i4 = ((iM45029 ^ i3) * (-823)) ^ (-923406055);
                        i5 = 639799798;
                    } else {
                        iM45029 = (C19806.m45029("۫ܳ") + i2) * 43;
                        i4 = ((iM45029 ^ i3) * 7475) ^ (-47385138);
                        i5 = -250252443;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m29273(C11718 c11718, C6094 c6094) {
        int i = 560722948;
        int i2 = AbstractC0464.f2088;
        int i3 = C1875.f7103;
        int iM11306 = (ThreadFactoryC3888.m11306("ܽۜ") ^ i2) * 63;
        int i4 = ((iM11306 ^ i3) * 25491) ^ 885852183;
        int i5 = -1151250656;
        while (true) {
            i = ((((i ^ i3) * (-7243)) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2068371502:
                case 85154890:
                    C2332.m7079();
                    break;
                case -2048729091:
                case -1407638839:
                    C0278.m1789();
                    if (!C0797.f3386) {
                        iM11306 = C19806.m45029("ܽܶ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-10909)) ^ 1001477705;
                        i5 = -1698587610;
                    } else {
                        iM11306 = C19806.m45029("᩷ܺ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-4165)) ^ (-445617537);
                        i5 = 908582072;
                    }
                    break;
                case -1972525596:
                case 1581891712:
                    if (C3660.f13403 >= 0) {
                        iM11306 = C19806.m45029("ܽܶ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-10909)) ^ 1001477705;
                        i5 = -1698587610;
                    } else {
                        iM11306 = (C19806.m45029("۬ܰ") + i3) * 17;
                        i4 = ((iM11306 ^ i2) * (-8769)) ^ (-460081170);
                        i5 = 464770940;
                    }
                    break;
                case -1970931886:
                case 927454738:
                    RunnableC0195.m1442(new C2899(c11718));
                    break;
                case -1834043710:
                case 1425533918:
                    if (C2477.m7593() >= 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ܽܳ")) * (-61);
                        i4 = ((iM11306 ^ i2) * 7325) ^ (-720370370);
                        i5 = -1412645371;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩵᩺") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-28889)) ^ 776165754;
                        i5 = -1224568697;
                    }
                    break;
                case -1724442822:
                case -585763658:
                    C1460.m5050();
                    iM11306 = (C19806.m45029("᩺᩺") ^ i2) * (-35);
                    i4 = ((iM11306 ^ i3) * 9515) ^ 1559952474;
                    i5 = 1848389177;
                    break;
                case -1723910985:
                case 1786505306:
                    if (C1148.m4232() <= 0) {
                        iM11306 = C19806.m45029("ܽܶ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-10909)) ^ 1001477705;
                        i5 = -1698587610;
                    } else {
                        iM11306 = (i2 - C19806.m45029("᩵֫")) * (-17);
                        i4 = ((iM11306 ^ i3) * (-17749)) ^ (-1419311253);
                        i5 = 309890639;
                    }
                    break;
                case -1510201976:
                case -1029452648:
                    C0671.m3008();
                    if (!C1419.m4973()) {
                        iM11306 = C19806.m45029("᩷ܺ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-4165)) ^ (-445617537);
                        i5 = 908582072;
                    } else {
                        iM11306 = (C19806.m45029("᩺᩺") ^ i2) * (-35);
                        i4 = ((iM11306 ^ i3) * 9515) ^ 1559952474;
                        i5 = 1848389177;
                    }
                    break;
                case -1377370127:
                case 330893827:
                    if (C0817.f3443) {
                        iM11306 = ThreadFactoryC3888.m11306("ۧۘ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-12823)) ^ 2032232486;
                        i5 = -2040276349;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ܽܳ")) * (-61);
                        i4 = ((iM11306 ^ i2) * 7325) ^ (-720370370);
                        i5 = -1412645371;
                    }
                    break;
                case -1191270685:
                case 717664888:
                    if (C0278.f1572 <= 0) {
                        iM11306 = (C19806.m45029("᩺᩺") ^ i2) * (-35);
                        i4 = ((iM11306 ^ i3) * 9515) ^ 1559952474;
                        i5 = 1848389177;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("᩹᩺")) * 81;
                        i4 = ((iM11306 ^ i2) * (-1779)) ^ 344896165;
                        i5 = 2092597174;
                    }
                    break;
                case -1104029120:
                case 2068904648:
                    if (C3743.f13569) {
                        iM11306 = (i3 - C19806.m45029("֡᩸")) * (-17);
                        i4 = ((iM11306 ^ i2) * (-30521)) ^ (-1295522378);
                        i5 = -118211235;
                    } else {
                        iM11306 = C19806.m45029("ܽܶ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-10909)) ^ 1001477705;
                        i5 = -1698587610;
                    }
                    break;
                case -1031365535:
                case 1858847854:
                    if (C1937.f7317 >= 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ܽܳ")) * (-61);
                        i4 = ((iM11306 ^ i2) * 7325) ^ (-720370370);
                        i5 = -1412645371;
                    } else {
                        iM11306 = C19806.m45029("ܳۧ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-24729)) ^ 605952608;
                        i5 = 1188497992;
                    }
                    break;
                case -771261475:
                case 869278672:
                    if (C2871.m8646()) {
                        iM11306 = ThreadFactoryC3888.m11306("ܶܺ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 1765) ^ (-818923683);
                        i5 = -526584064;
                    } else {
                        iM11306 = (C19806.m45029("᩺᩺") ^ i2) * (-35);
                        i4 = ((iM11306 ^ i3) * 9515) ^ 1559952474;
                        i5 = 1848389177;
                    }
                    break;
                case -570314379:
                case 853454976:
                    if (C3286.f12186) {
                        iM11306 = C19806.m45029("᩷ܺ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-4165)) ^ (-445617537);
                        i5 = 908582072;
                    } else {
                        iM11306 = C19806.m45029("ۢۨ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 12401) ^ 136826640;
                        i5 = -1077533643;
                    }
                    break;
                case -357407747:
                case 1565712864:
                    if (C2704.m8255() <= 0) {
                        iM11306 = C19806.m45029("᩷ܺ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-4165)) ^ (-445617537);
                        i5 = 908582072;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶ܳ") + i3) * (-25);
                        i4 = ((iM11306 ^ i2) * (-22643)) ^ 517697602;
                        i5 = 1764720776;
                    }
                    break;
                case -278697723:
                case 1490345558:
                    c11718.f39389 = c6094;
                    if (c11718.f39391) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("᩷᩷")) * 75;
                        i4 = ((iM11306 ^ i3) * 12815) ^ 994719712;
                        i5 = -726377761;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֫ܿ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 10335) ^ (-1747021327);
                        i5 = -1275842062;
                    }
                    break;
                case 1236044184:
                case 1489343659:
                    c11718.f39376 = true;
                    break;
                default:
                    if (AbstractC0464.m2313() != 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ܽܳ")) * (-61);
                        i4 = ((iM11306 ^ i2) * 7325) ^ (-720370370);
                        i5 = -1412645371;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۠֡") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-9129)) ^ (-2072126112);
                        i5 = -1294987749;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC22611
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void mo29302() {
        C4661 c4661 = null;
        int i = -1595039711;
        int i2 = RunnableC1606.f6488;
        int i3 = C1460.f5948;
        int iM11306 = ThreadFactoryC3888.m11306("᩶ܶ") ^ i3;
        int i4 = ((iM11306 ^ i2) * 30205) ^ 577616371;
        int i5 = -842668946;
        while (true) {
            i = ((((i ^ i2) * 21495) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2056731913:
                case -1303557437:
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM11306 = C19806.m45029("ۡ۫") ^ i3;
                        i4 = ((iM11306 ^ i2) * 19709) ^ (-574985792);
                        i5 = 2119401129;
                    } else {
                        iM11306 = C19806.m45029("ۡۨ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 9695) ^ (-1454416180);
                        i5 = 1427811946;
                    }
                    break;
                case -2048445174:
                case 1548826752:
                    if (C2124.f7782 <= 0) {
                        iM11306 = (C19806.m45029("ۘܿ") ^ i3) * 95;
                        i4 = ((iM11306 ^ i2) * (-18857)) ^ (-1048314215);
                        i5 = -332325881;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۘۘ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-25407)) ^ 1115843204;
                        i5 = -407866703;
                    }
                    break;
                case -1928581198:
                case -91089344:
                    if (C1419.m4973()) {
                        iM11306 = ThreadFactoryC3888.m11306("ۛۤ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 28089) ^ (-11963075);
                        i5 = 805953515;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ۧۖ")) * 109;
                        i4 = ((iM11306 ^ i3) * 10343) ^ (-1666734111);
                        i5 = -1396359402;
                    }
                    break;
                case -1861349314:
                case 1244048738:
                    if (this.f39391) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("᩸᩺")) * 127;
                        i4 = ((iM11306 ^ i3) * 12089) ^ (-1118783340);
                        i5 = 236961343;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩷᩻") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-24847)) ^ 1674155770;
                        i5 = 327709790;
                    }
                    break;
                case -1813514532:
                case 2025975817:
                    if (C2124.f7782 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩶᩷") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-27525)) ^ (-908215327);
                        i5 = -1060674374;
                    } else {
                        iM11306 = (i3 - C19806.m45029("ܺܰ")) * (-109);
                        i4 = ((iM11306 ^ i2) * 5139) ^ (-629699941);
                        i5 = 778704660;
                    }
                    break;
                case -1706744011:
                case 1395493057:
                    C0671.m3008();
                    RunnableC3388.m10064();
                    break;
                case -1619525152:
                case -188395923:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM11306 = (C19806.m45029("ۘܿ") ^ i3) * 95;
                        i4 = ((iM11306 ^ i2) * (-18857)) ^ (-1048314215);
                        i5 = -332325881;
                    } else {
                        iM11306 = C19806.m45029("᩷ܽ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 1701) ^ (-1132659729);
                        i5 = 1025724276;
                    }
                    break;
                case -1259713048:
                case 5952184:
                    if (this.f39385) {
                        iM11306 = ThreadFactoryC3888.m11306("᩷᩻") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-24847)) ^ 1674155770;
                        i5 = 327709790;
                    } else {
                        iM11306 = C19806.m45029("֫ܿ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 4563) ^ 1244121778;
                        i5 = 1964516220;
                    }
                    break;
                case -1250603091:
                case -1119609116:
                    RunnableC0195.m1442(c4661);
                    iM11306 = ThreadFactoryC3888.m11306("᩷᩻") ^ i3;
                    i4 = ((iM11306 ^ i2) * (-24847)) ^ 1674155770;
                    i5 = 327709790;
                    break;
                case -1160928107:
                case 617850830:
                    if (C2332.f8260) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۧۘ")) * (-43);
                        i4 = ((iM11306 ^ i2) * 23507) ^ (-1964298423);
                        i5 = -334653175;
                    } else {
                        iM11306 = (C19806.m45029("ۢܽ") + i2) * 69;
                        i4 = ((iM11306 ^ i3) * (-28319)) ^ (-899302508);
                        i5 = -1628724559;
                    }
                    break;
                case -984486040:
                case -539045286:
                    C2249.m6915();
                    C1148.m4232();
                    iM11306 = C19806.m45029("ۡ۫") ^ i3;
                    i4 = ((iM11306 ^ i2) * 19709) ^ (-574985792);
                    i5 = 2119401129;
                    break;
                case -755523062:
                case 1279877389:
                    if (C1398.m4895() <= 0) {
                        iM11306 = (C19806.m45029("ۢܽ") + i2) * 69;
                        i4 = ((iM11306 ^ i3) * (-28319)) ^ (-899302508);
                        i5 = -1628724559;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۤᩳ") ^ i2) * (-105);
                        i4 = ((iM11306 ^ i3) * (-20077)) ^ (-338138896);
                        i5 = 858187533;
                    }
                    break;
                case -193929963:
                case 1666881853:
                    c4661 = new C4661(this);
                    if (C10634.f36300 >= 0) {
                        iM11306 = C19806.m45029("ۡ۫") ^ i3;
                        i4 = ((iM11306 ^ i2) * 19709) ^ (-574985792);
                        i5 = 2119401129;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۛܽ") ^ i3) * 5;
                        i4 = ((iM11306 ^ i2) * (-29451)) ^ (-885390143);
                        i5 = -350758492;
                    }
                    break;
                case -140656884:
                case 1446695708:
                    break;
                case 141000553:
                case 158988035:
                    if (C3577.f13150 >= 0) {
                        iM11306 = (C19806.m45029("ۢܽ") + i2) * 69;
                        i4 = ((iM11306 ^ i3) * (-28319)) ^ (-899302508);
                        i5 = -1628724559;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ܶ᩶")) * 89;
                        i4 = ((iM11306 ^ i2) * (-6497)) ^ (-218512533);
                        i5 = -32973333;
                    }
                    break;
                case 548276339:
                case 998506318:
                    C10634.m26820();
                    if (C3577.f13150 < 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩶᩷") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-27525)) ^ (-908215327);
                        i5 = -1060674374;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۛۤ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 28089) ^ (-11963075);
                        i5 = 805953515;
                    }
                    break;
                case 661661783:
                case 789839011:
                    if (C3722.m10894() <= 0) {
                        iM11306 = (C19806.m45029("ۘܿ") ^ i3) * 95;
                        i4 = ((iM11306 ^ i2) * (-18857)) ^ (-1048314215);
                        i5 = -332325881;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۛۤ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 28089) ^ (-11963075);
                        i5 = 805953515;
                    }
                    break;
                case 701520472:
                case 1923848861:
                    if (this.f39390) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ۗ֡")) * (-51);
                        i4 = ((iM11306 ^ i3) * 2717) ^ (-949517392);
                        i5 = 946953582;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩷᩻") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-24847)) ^ 1674155770;
                        i5 = 327709790;
                    }
                    break;
                case 1216099208:
                case 1818778496:
                    if (!C0817.f3443) {
                        iM11306 = C19806.m45029("ۡ۫") ^ i3;
                        i4 = ((iM11306 ^ i2) * 19709) ^ (-574985792);
                        i5 = 2119401129;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۛۤ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 28089) ^ (-11963075);
                        i5 = 805953515;
                    }
                    break;
                default:
                    if (C1668.m5583()) {
                        iM11306 = (C19806.m45029("ۚۡ") ^ i3) * (-55);
                        i4 = ((iM11306 ^ i2) * (-17011)) ^ 2133282079;
                        i5 = 1916646795;
                    } else {
                        iM11306 = (C19806.m45029("ۘܿ") ^ i3) * 95;
                        i4 = ((iM11306 ^ i2) * (-18857)) ^ (-1048314215);
                        i5 = -332325881;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m29267(C11718 c11718, Exception exc) {
        int iM11306;
        int i;
        int i2;
        InterfaceC6025 interfaceC6025;
        short[] sArr;
        int i3;
        int iM45029;
        int i4;
        int iM11307;
        int i5;
        int i6;
        int i7;
        short[] sArr2;
        int iM450210;
        int i8;
        String strM3407;
        final C11718 c11719 = c11718;
        final Exception exc2 = exc;
        int i9 = C0278.f1572;
        int i10 = C2788.f10625;
        int iM11308 = ThreadFactoryC3888.m11306("᩺ۜ") ^ i9;
        int i11 = ((iM11308 ^ i10) * (-27077)) ^ (-712977427);
        short[] sArr3 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        int i12 = iM11308 ^ (-478707844);
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        char c = 0;
        short s = 0;
        int i18 = 0;
        int i19 = 0;
        InterfaceC6025 interfaceC6026 = null;
        int i20 = 0;
        int i21 = 869641698;
        byte bMo16345 = 0;
        short[] sArr6 = null;
        short[] sArr7 = null;
        C6111 c6111 = null;
        String strM1617 = null;
        String str = null;
        String strM26821 = null;
        String strM3747 = null;
        String str2 = null;
        while (true) {
            i21 = i12 ^ (i11 & (((i21 ^ i10) * 18195) >> 31));
            switch (i21) {
                case -2142145820:
                case -274196286:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM11307 = (C19806.m45029("֨۬") ^ i9) * (-45);
                        i5 = ((iM11307 ^ i10) * (-8159)) ^ 1414692787;
                        i6 = -1367236406;
                        i12 = iM11307 ^ i6;
                        i11 = i5;
                    } else {
                        interfaceC6026 = interfaceC6026;
                        sArr6 = sArr6;
                        i13 = i13;
                        iM11306 = (i9 - ThreadFactoryC3888.m11306("ܽ۟")) * 71;
                        i = ((iM11306 ^ i10) * 13379) ^ (-1316361927);
                        i2 = -1022244329;
                        int i22 = iM11306 ^ i2;
                        interfaceC6026 = interfaceC6026;
                        short[] sArr8 = sArr6;
                        i12 = i22;
                        i11 = i;
                        i13 = i13;
                        sArr6 = sArr8;
                    }
                    break;
                case -2093538173:
                case -581117048:
                    i14 = 35289;
                    iM11306 = (ThreadFactoryC3888.m11306("ᩳ֫") ^ i9) * (-47);
                    i = ((iM11306 ^ i10) * 7277) ^ 1603753642;
                    i2 = 728152146;
                    int i23 = iM11306 ^ i2;
                    interfaceC6026 = interfaceC6026;
                    short[] sArr9 = sArr6;
                    i12 = i23;
                    i11 = i;
                    i13 = i13;
                    sArr6 = sArr9;
                    break;
                case -1825600268:
                case 1932809574:
                    str2 = C21444.f69718[bMo16345];
                    if (exc2 instanceof C4987) {
                        iM11307 = ThreadFactoryC3888.m11306("ܳ֨") ^ i10;
                        i5 = ((iM11307 ^ i9) * (-26161)) ^ (-1932998944);
                        i6 = -1951043379;
                    } else {
                        iM11307 = C19806.m45029("ܺ᩵") ^ i9;
                        i5 = ((iM11307 ^ i10) * (-18563)) ^ 2120621135;
                        i6 = -406951043;
                    }
                    i12 = iM11307 ^ i6;
                    i11 = i5;
                    break;
                case -1570793721:
                case -335778426:
                    short[] sArr10 = sArr6;
                    i13 = i13;
                    String strM7604 = C2477.m7604(sArr10, i20, 20, i14);
                    sArr6 = sArr10;
                    interfaceC6026 = interfaceC6026;
                    bMo16345 = interfaceC6026.mo16345((byte) 0, strM7604);
                    if (!RunnableC1564.f6300) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܰ۬") + i10) * 119;
                        i = ((iM11306 ^ i9) * (-29071)) ^ (-1099037125);
                        i2 = 21866168;
                        int i24 = iM11306 ^ i2;
                        interfaceC6026 = interfaceC6026;
                        short[] sArr11 = sArr6;
                        i12 = i24;
                        i11 = i;
                        i13 = i13;
                        sArr6 = sArr11;
                    } else {
                        i13 = i13;
                        int iM11309 = (i10 - ThreadFactoryC3888.m11306("ۨۤ")) * 27;
                        interfaceC6026 = interfaceC6026;
                        sArr6 = sArr6;
                        i12 = iM11309 ^ (-207456512);
                        i11 = ((iM11309 ^ i9) * 31247) ^ (-1607112407);
                        c11719 = c11718;
                    }
                    break;
                case -1469853346:
                case 1867203328:
                    i14 = 33815;
                    iM11306 = (ThreadFactoryC3888.m11306("ᩳ֫") ^ i9) * (-47);
                    i = ((iM11306 ^ i10) * 7277) ^ 1603753642;
                    i2 = 728152146;
                    int i25 = iM11306 ^ i2;
                    interfaceC6026 = interfaceC6026;
                    short[] sArr12 = sArr6;
                    i12 = i25;
                    i11 = i;
                    i13 = i13;
                    sArr6 = sArr12;
                    break;
                case -1127246979:
                case -224651566:
                    interfaceC6026 = interfaceC6026;
                    sArr6 = sArr6;
                    i13 = i13;
                    if (c11719.f39391) {
                        iM11306 = (ThreadFactoryC3888.m11306("۫ۗ") ^ i10) * (-49);
                        i = ((iM11306 ^ i9) * (-10661)) ^ 845639274;
                        i2 = 2036308730;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩺ۤ") ^ i10;
                        i = ((iM11306 ^ i9) * (-16679)) ^ (-1495106884);
                        i2 = 227828735;
                    }
                    int i26 = iM11306 ^ i2;
                    interfaceC6026 = interfaceC6026;
                    short[] sArr13 = sArr6;
                    i12 = i26;
                    i11 = i;
                    i13 = i13;
                    sArr6 = sArr13;
                    break;
                case -1041618532:
                case 1410722040:
                    interfaceC6026 = interfaceC6026;
                    sArr6 = sArr6;
                    i13 = i13;
                    i19 = i18 * i18;
                    i16 = s * s;
                    i17 = 102252544;
                    if (!C0797.f3386) {
                        iM11306 = (i10 - ThreadFactoryC3888.m11306("ᩴۙ")) * (-47);
                        i = ((iM11306 ^ i9) * 10755) ^ 1030462105;
                        i2 = 1545488445;
                        int i27 = iM11306 ^ i2;
                        interfaceC6026 = interfaceC6026;
                        short[] sArr14 = sArr6;
                        i12 = i27;
                        i11 = i;
                        i13 = i13;
                        sArr6 = sArr14;
                    } else {
                        i13 = i13;
                        int iM113010 = (i10 - ThreadFactoryC3888.m11306("ۨۤ")) * 27;
                        interfaceC6026 = interfaceC6026;
                        sArr6 = sArr6;
                        i12 = iM113010 ^ (-207456512);
                        i11 = ((iM113010 ^ i9) * 31247) ^ (-1607112407);
                        c11719 = c11718;
                    }
                    break;
                case -927628916:
                case -87453087:
                    strM3407 = C0817.m3407(exc);
                    str = strM3407;
                    iM11307 = (ThreadFactoryC3888.m11306("ۘ᩹") + i9) * 63;
                    i5 = ((iM11307 ^ i10) * 27545) ^ (-881856936);
                    i6 = -1248835691;
                    i12 = iM11307 ^ i6;
                    i11 = i5;
                    break;
                case -776845853:
                case 2090440282:
                    C3286.m9797(c6111, strM1617);
                    c11719.m50125(new Consumer() { // from class: l.۫֨ۜ
                        @Override // java.util.function.Consumer
                        /* JADX INFO: renamed from: accept */
                        public final void n(Object obj) {
                            C11718.m29268(this.f40408, exc2, (ActivityC5677) obj);
                        }

                        public /* synthetic */ Consumer andThen(Consumer consumer) {
                            return C1455.$default$andThen(this, consumer);
                        }
                    });
                    break;
                case -698283120:
                case 1824456230:
                    strM26821 = C10634.m26821(sArr4, 45, 4, i14);
                    sArr5 = f39370;
                    if (C3722.f13525 > 0) {
                        iM11307 = (ThreadFactoryC3888.m11306("᩶᩻") + i9) * 101;
                        i5 = ((iM11307 ^ i10) * 29143) ^ (-1547618765);
                        i6 = -703881966;
                        i12 = iM11307 ^ i6;
                        i11 = i5;
                    } else {
                        interfaceC6025 = interfaceC6026;
                        sArr = sArr6;
                        i3 = i13;
                        iM45029 = C19806.m45029("֨۟") ^ i10;
                        i11 = (-84757764) ^ ((iM45029 ^ i9) * (-8177));
                        i4 = 977683491;
                        int i28 = iM45029 ^ i4;
                        exc2 = exc;
                        interfaceC6026 = interfaceC6025;
                        i13 = i3;
                        sArr6 = sArr;
                        i12 = i28;
                        c11719 = c11718;
                    }
                    break;
                case -663113085:
                case 1602939612:
                    break;
                case -538915698:
                case 398207109:
                    strM3747 = C0962.m3747(sArr3, i15, i13, i14);
                    sArr4 = f39370;
                    if (MenuItemOnMenuItemClickListenerC3244.m9701() >= 0) {
                        iM11307 = (C19806.m45029("֨۬") ^ i9) * (-45);
                        i5 = ((iM11307 ^ i10) * (-8159)) ^ 1414692787;
                        i6 = -1367236406;
                    } else {
                        iM11307 = C19806.m45029("֫᩷") ^ i9;
                        i5 = ((iM11307 ^ i10) * (-15959)) ^ 126560787;
                        i6 = 1909012333;
                    }
                    i12 = iM11307 ^ i6;
                    i11 = i5;
                    break;
                case -442172676:
                case 1967206551:
                    interfaceC6026 = interfaceC6026;
                    sArr6 = sArr6;
                    i13 = i13;
                    int i29 = i16 + i17;
                    if ((i29 + i29) - i19 < 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳܽ") ^ i10;
                        i = ((iM11306 ^ i9) * 6657) ^ (-543854704);
                        i2 = 1457190271;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܿ۠") ^ i9;
                        i = ((iM11306 ^ i10) * 2909) ^ (-1273060050);
                        i2 = 1916577766;
                    }
                    int i210 = iM11306 ^ i2;
                    interfaceC6026 = interfaceC6026;
                    short[] sArr15 = sArr6;
                    i12 = i210;
                    i11 = i;
                    i13 = i13;
                    sArr6 = sArr15;
                    break;
                case -389020588:
                case 1084046226:
                    C1398.m4895();
                    C1977.m6356();
                    break;
                case -183187347:
                case -90467253:
                    sArr3 = f39370;
                    i15 = 31;
                    i13 = 14;
                    if (C2788.f10625 < 0) {
                        iM11307 = ThreadFactoryC3888.m11306("ۜ᩺") ^ i10;
                        i5 = ((iM11307 ^ i9) * 5295) ^ (-578954838);
                        i6 = -1034801843;
                        i12 = iM11307 ^ i6;
                        i11 = i5;
                    } else {
                        interfaceC6026 = interfaceC6026;
                        sArr6 = sArr6;
                        int iM113011 = (i10 - ThreadFactoryC3888.m11306("ۨۤ")) * 27;
                        interfaceC6026 = interfaceC6026;
                        sArr6 = sArr6;
                        i12 = iM113011 ^ (-207456512);
                        i11 = ((iM113011 ^ i9) * 31247) ^ (-1607112407);
                        c11719 = c11718;
                    }
                    break;
                case -158960485:
                case 2001335886:
                    strM1617 = C0242.m1617(C1460.m5047(sArr5, 49, 20, i14), str2, strM3747, str, strM26821);
                    c6111 = c11719.f39378;
                    if (C2642.m8171() == 0) {
                        iM11307 = (i10 - ThreadFactoryC3888.m11306("ۢܳ")) * 27;
                        i5 = ((iM11307 ^ i9) * (-23947)) ^ 1743022873;
                        i6 = 1101644964;
                        i12 = iM11307 ^ i6;
                        i11 = i5;
                    } else {
                        interfaceC6026 = interfaceC6026;
                        sArr6 = sArr6;
                        i13 = i13;
                        iM11306 = (i9 - ThreadFactoryC3888.m11306("ܽ۟")) * 71;
                        i = ((iM11306 ^ i10) * 13379) ^ (-1316361927);
                        i2 = -1022244329;
                        int i211 = iM11306 ^ i2;
                        interfaceC6026 = interfaceC6026;
                        short[] sArr16 = sArr6;
                        i12 = i211;
                        i11 = i;
                        i13 = i13;
                        sArr6 = sArr16;
                    }
                    break;
                case -141824636:
                case 1446561485:
                    i7 = i13;
                    interfaceC6026 = ApplicationC0716.f2992;
                    sArr2 = f39370;
                    i20 = 11;
                    if (RunnableC1606.f6488 >= 0) {
                        iM450210 = C19806.m45029("۫᩷") ^ i10;
                        i5 = ((iM450210 ^ i9) * (-1673)) ^ (-1667033725);
                        i8 = -1922454516;
                    } else {
                        iM450210 = C19806.m45029("ۤ᩻") ^ i9;
                        i5 = ((iM450210 ^ i10) * (-30657)) ^ (-805010085);
                        i8 = -1087871881;
                    }
                    i12 = iM450210 ^ i8;
                    i13 = i7;
                    sArr6 = sArr2;
                    i11 = i5;
                    break;
                case -33339463:
                case 187766837:
                    interfaceC6025 = interfaceC6026;
                    sArr = sArr6;
                    i3 = i13;
                    sArr7 = f39370;
                    c = '\n';
                    if (C1461.f5957 <= 0) {
                        iM45029 = C19806.m45029("֨۟") ^ i10;
                        i11 = (-84757764) ^ ((iM45029 ^ i9) * (-8177));
                        i4 = 977683491;
                    } else {
                        iM45029 = (C19806.m45029("۠᩷") + i10) * (-91);
                        i11 = 8574932 ^ ((iM45029 ^ i9) * (-20573));
                        i4 = -297778113;
                    }
                    int i212 = iM45029 ^ i4;
                    exc2 = exc;
                    interfaceC6026 = interfaceC6025;
                    i13 = i3;
                    sArr6 = sArr;
                    i12 = i212;
                    c11719 = c11718;
                    break;
                case 428724888:
                case 503127934:
                    interfaceC6026 = interfaceC6026;
                    sArr6 = sArr6;
                    i13 = i13;
                    short s2 = sArr7[c];
                    int i30 = s2 + 10112;
                    if (RunnableC1606.f6488 >= 0) {
                        s = s2;
                        i18 = i30;
                        i13 = i13;
                        int iM113012 = (i10 - ThreadFactoryC3888.m11306("ۨۤ")) * 27;
                        interfaceC6026 = interfaceC6026;
                        sArr6 = sArr6;
                        i12 = iM113012 ^ (-207456512);
                        i11 = ((iM113012 ^ i9) * 31247) ^ (-1607112407);
                        c11719 = c11718;
                    } else {
                        int iM113013 = ThreadFactoryC3888.m11306("ۗ᩷") ^ i9;
                        s = s2;
                        i18 = i30;
                        interfaceC6026 = interfaceC6026;
                        i13 = i13;
                        sArr6 = sArr6;
                        i12 = iM113013 ^ 1231160607;
                        i11 = ((iM113013 ^ i10) * 21691) ^ 735810991;
                        c11719 = c11718;
                        exc2 = exc;
                    }
                    break;
                case 611636303:
                case 2138343443:
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    if (C1668.f6641 >= 0) {
                        sArr2 = sArr6;
                        i7 = i13;
                        iM450210 = C19806.m45029("۫᩷") ^ i10;
                        i5 = ((iM450210 ^ i9) * (-1673)) ^ (-1667033725);
                        i8 = -1922454516;
                        i12 = iM450210 ^ i8;
                        i13 = i7;
                        sArr6 = sArr2;
                        i11 = i5;
                    } else {
                        interfaceC6026 = interfaceC6026;
                        sArr6 = sArr6;
                        i13 = i13;
                        iM11306 = (i9 - ThreadFactoryC3888.m11306("ܽ۟")) * 71;
                        i = ((iM11306 ^ i10) * 13379) ^ (-1316361927);
                        i2 = -1022244329;
                        int i213 = iM11306 ^ i2;
                        interfaceC6026 = interfaceC6026;
                        short[] sArr17 = sArr6;
                        i12 = i213;
                        i11 = i;
                        i13 = i13;
                        sArr6 = sArr17;
                    }
                    break;
                case 978564896:
                case 1673069310:
                    ViewTreeObserverOnPreDrawListenerC3327.m9874();
                    C0962.m3746();
                    interfaceC6026 = interfaceC6026;
                    sArr6 = sArr6;
                    i13 = i13;
                    iM11306 = (i9 - ThreadFactoryC3888.m11306("ܽ۟")) * 71;
                    i = ((iM11306 ^ i10) * 13379) ^ (-1316361927);
                    i2 = -1022244329;
                    int i214 = iM11306 ^ i2;
                    interfaceC6026 = interfaceC6026;
                    short[] sArr18 = sArr6;
                    i12 = i214;
                    i11 = i;
                    i13 = i13;
                    sArr6 = sArr18;
                    break;
                case 1097138925:
                case 1949876604:
                    interfaceC6026 = interfaceC6026;
                    sArr6 = sArr6;
                    i13 = i13;
                    c11719.f39386 = true;
                    c11719.f39387.m42627((Throwable) exc2);
                    if (C1377.f5749) {
                        iM11306 = ThreadFactoryC3888.m11306("ܶۗ") ^ i9;
                        i = ((iM11306 ^ i10) * (-5137)) ^ 422221945;
                        i2 = -352581502;
                    } else {
                        iM11306 = (i9 - ThreadFactoryC3888.m11306("ܽ۟")) * 71;
                        i = ((iM11306 ^ i10) * 13379) ^ (-1316361927);
                        i2 = -1022244329;
                    }
                    int i215 = iM11306 ^ i2;
                    interfaceC6026 = interfaceC6026;
                    short[] sArr19 = sArr6;
                    i12 = i215;
                    i11 = i;
                    i13 = i13;
                    sArr6 = sArr19;
                    break;
                case 1305292786:
                case 1583054542:
                    strM3407 = C1398.m4893(exc);
                    str = strM3407;
                    iM11307 = (ThreadFactoryC3888.m11306("ۘ᩹") + i9) * 63;
                    i5 = ((iM11307 ^ i10) * 27545) ^ (-881856936);
                    i6 = -1248835691;
                    i12 = iM11307 ^ i6;
                    i11 = i5;
                    break;
                default:
                    if (C2788.m8472() == 0) {
                        interfaceC6026 = interfaceC6026;
                        sArr6 = sArr6;
                        int iM113014 = (i10 - ThreadFactoryC3888.m11306("ۨۤ")) * 27;
                        interfaceC6026 = interfaceC6026;
                        sArr6 = sArr6;
                        i12 = iM113014 ^ (-207456512);
                        i11 = ((iM113014 ^ i9) * 31247) ^ (-1607112407);
                        c11719 = c11718;
                    } else {
                        interfaceC6026 = interfaceC6026;
                        sArr6 = sArr6;
                        i13 = i13;
                        iM11306 = (i9 - ThreadFactoryC3888.m11306("ܽ۟")) * 71;
                        i = ((iM11306 ^ i10) * 13379) ^ (-1316361927);
                        i2 = -1022244329;
                        int i216 = iM11306 ^ i2;
                        interfaceC6026 = interfaceC6026;
                        short[] sArr110 = sArr6;
                        i12 = i216;
                        i11 = i;
                        i13 = i13;
                        sArr6 = sArr110;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.InterfaceC19601
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo3616() {
        C20556 c20556 = null;
        int i = -1047518463;
        int i2 = ThreadFactoryC3888.f14547;
        int i3 = RunnableC1606.f6488;
        int iM11306 = ThreadFactoryC3888.m11306("۠ۗ") ^ i2;
        int i4 = ((iM11306 ^ i3) * 5397) ^ 348829164;
        int i5 = 1150954506;
        while (true) {
            i = ((((i ^ i3) * 13939) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2104446077:
                case 1719205553:
                    if (C19806.f63586) {
                        iM11306 = ThreadFactoryC3888.m11306("ۘᩳ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 20183) ^ (-1155015737);
                        i5 = 1407359218;
                    } else {
                        iM11306 = (C19806.m45029("֨ᩳ") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM11306 ^ i3) * (-11613)) ^ (-777615635);
                        i5 = -1310988668;
                    }
                    break;
                case -1863251456:
                case 355265584:
                    return true;
                case -1352151300:
                case 1509756285:
                    if (C3535.f13026 <= 0) {
                        iM11306 = C19806.m45029("᩵ܽ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-10865)) ^ 631828600;
                        i5 = -1914616652;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۛܳ") ^ i2) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM11306 ^ i3) * 13071) ^ 1148856909;
                        i5 = -909731996;
                    }
                    break;
                case -1220291642:
                case 605815036:
                    if (c20556.m46385()) {
                        iM11306 = C19806.m45029("᩶᩵") ^ i3;
                        i4 = ((iM11306 ^ i2) * 5987) ^ 1875190069;
                        i5 = -1525113507;
                    } else {
                        iM11306 = (C19806.m45029("ۤۤ") ^ i3) * (-3);
                        i4 = ((iM11306 ^ i2) * 10521) ^ (-1863076643);
                        i5 = 1392625617;
                    }
                    break;
                case -1218925388:
                case 1604225774:
                    if (CallableC1627.f6528) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩸ܿ") ^ i3) * 101;
                        i4 = ((iM11306 ^ i2) * (-31213)) ^ (-566571361);
                        i5 = -109481078;
                    } else {
                        iM11306 = C19806.m45029("۫۫") ^ i3;
                        i4 = ((iM11306 ^ i2) * 19309) ^ (-1131989331);
                        i5 = -1392633106;
                    }
                    break;
                case -1145734133:
                case 92404845:
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    if (C0629.m2907()) {
                        iM11306 = C19806.m45029("᩵ܽ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-10865)) ^ 631828600;
                        i5 = -1914616652;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۨۘ") ^ i3) * 71;
                        i4 = ((iM11306 ^ i2) * (-30133)) ^ (-165634769);
                        i5 = 1824991195;
                    }
                    break;
                case -956951685:
                case 690361567:
                    if (C1377.f5749) {
                        iM11306 = (i3 - C19806.m45029("۠֡")) * 47;
                        i4 = ((iM11306 ^ i2) * (-11205)) ^ 496601998;
                        i5 = 1367688516;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܽۘ") ^ i3) * (-119);
                        i4 = ((iM11306 ^ i2) * (-14061)) ^ (-1236526324);
                        i5 = -921879926;
                    }
                    break;
                case -947543002:
                case 1779302256:
                    if (C0629.f2722 <= 0) {
                        iM11306 = C19806.m45029("۫۫") ^ i3;
                        i4 = ((iM11306 ^ i2) * 19309) ^ (-1131989331);
                        i5 = -1392633106;
                    } else {
                        iM11306 = C19806.m45029("ۤܺ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 4941) ^ (-1357166938);
                        i5 = 690035061;
                    }
                    break;
                case -612239912:
                case 288273452:
                    if (C2249.f8050 < 0) {
                        iM11306 = C19806.m45029("۫۫") ^ i3;
                        i4 = ((iM11306 ^ i2) * 19309) ^ (-1131989331);
                        i5 = -1392633106;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܽۘ") ^ i3) * (-119);
                        i4 = ((iM11306 ^ i2) * (-14061)) ^ (-1236526324);
                        i5 = -921879926;
                    }
                    break;
                case -546494109:
                case -528322925:
                    if (C1977.f7413 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۘᩳ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 20183) ^ (-1155015737);
                        i5 = 1407359218;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۜۚ") + i2) * (-13);
                        i4 = ((iM11306 ^ i3) * 27611) ^ (-1979916102);
                        i5 = 202887782;
                    }
                    break;
                case -396036413:
                case 169845464:
                    if (!C0817.f3443) {
                        iM11306 = C19806.m45029("۫۫") ^ i3;
                        i4 = ((iM11306 ^ i2) * 19309) ^ (-1131989331);
                        i5 = -1392633106;
                    } else {
                        iM11306 = C19806.m45029("᩵ܽ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-10865)) ^ 631828600;
                        i5 = -1914616652;
                    }
                    break;
                case -141783829:
                case 1918914837:
                    if (C3743.m10966() <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܽۘ") ^ i3) * (-119);
                        i4 = ((iM11306 ^ i2) * (-14061)) ^ (-1236526324);
                        i5 = -921879926;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۟ۢ") ^ i2) * 73;
                        i4 = ((iM11306 ^ i3) * 30971) ^ 907790731;
                        i5 = -933255761;
                    }
                    break;
                case -116040344:
                case 1669015337:
                    return false;
                case 215373202:
                case 318340601:
                    c20556 = this.f39381;
                    if (c20556 != null) {
                        iM11306 = (i2 - C19806.m45029("֨᩻")) * (-93);
                        i4 = ((iM11306 ^ i3) * (-20933)) ^ 1161087763;
                        i5 = -1170460977;
                    } else {
                        iM11306 = (C19806.m45029("ۤۤ") ^ i3) * (-3);
                        i4 = ((iM11306 ^ i2) * 10521) ^ (-1863076643);
                        i5 = 1392625617;
                    }
                    break;
                case 295973264:
                case 1274738161:
                    C1066.m4023();
                    C2704.m8255();
                    return false;
                case 490157752:
                case 2042354121:
                    if (C1668.f6641 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۘᩳ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 20183) ^ (-1155015737);
                        i5 = 1407359218;
                    } else {
                        iM11306 = (C19806.m45029("᩷֨") + i2) * (-87);
                        i4 = ((iM11306 ^ i3) * 6575) ^ (-1817175494);
                        i5 = -312439504;
                    }
                    break;
                case 1254884666:
                case 1635394886:
                    this.f39381.m46378();
                    if (C1419.f5860 >= 0) {
                        iM11306 = C19806.m45029("᩵ܽ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-10865)) ^ 631828600;
                        i5 = -1914616652;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܳᩴ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 18181) ^ 1065368463;
                        i5 = 604185264;
                    }
                    break;
                case 1316213229:
                case 1981226428:
                    if (C0526.f2219) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܽۘ") ^ i3) * (-119);
                        i4 = ((iM11306 ^ i2) * (-14061)) ^ (-1236526324);
                        i5 = -921879926;
                    } else {
                        iM11306 = (C19806.m45029("ᩳۛ") ^ i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM11306 ^ i2) * (-14655)) ^ (-190490322);
                        i5 = 557084830;
                    }
                    break;
                default:
                    RunnableC1895.m6170();
                    iM11306 = (ThreadFactoryC3888.m11306("ܽۘ") ^ i3) * (-119);
                    i4 = ((iM11306 ^ i2) * (-14061)) ^ (-1236526324);
                    i5 = -921879926;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:51:0x01c4 A[PHI: r1 r2 r3 r4 r5
      0x01c4: PHI (r1v6 l.ۙܰۜ) = (r1v2 l.ۙܰۜ), (r1v4 l.ۙܰۜ), (r1v2 l.ۙܰۜ) binds: [B:50:0x01c2, B:38:0x013e, B:32:0x00e0] A[DONT_GENERATE, DONT_INLINE]
      0x01c4: PHI (r2v5 int) = (r2v2 int), (r2v3 int), (r2v2 int) binds: [B:50:0x01c2, B:38:0x013e, B:32:0x00e0] A[DONT_GENERATE, DONT_INLINE]
      0x01c4: PHI (r3v5 int) = (r3v2 int), (r3v3 int), (r3v2 int) binds: [B:50:0x01c2, B:38:0x013e, B:32:0x00e0] A[DONT_GENERATE, DONT_INLINE]
      0x01c4: PHI (r4v4 int) = (r4v2 int), (r4v2 int), (r4v9 int) binds: [B:50:0x01c2, B:38:0x013e, B:32:0x00e0] A[DONT_GENERATE, DONT_INLINE]
      0x01c4: PHI (r5v4 int) = (r5v2 int), (r5v2 int), (r5v7 int) binds: [B:50:0x01c2, B:38:0x013e, B:32:0x00e0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x0211  */
    /* JADX WARN: Code duplicated, block: B:75:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:79:0x02d6  */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007b, code lost:
    
        if (l.RunnableC1606.f6488 >= 0) goto L11;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void m29268(l.C11718 r17, java.lang.Exception r18, l.ActivityC5677 r19) {
        /*
            Method dump skipped, instruction units count: 960
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11718.m29268(l.ۨ۬ۜ, java.lang.Exception, l.ۚ᩻ۘ):void");
    }

    @Override // l.AbstractC22611
    /* JADX INFO: renamed from: ᩺ */
    public final C6111 mo19352() {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        short s2 = 0;
        int i3 = 0;
        int i4 = 1616499054;
        int i5 = ViewTreeObserverOnPreDrawListenerC3327.f12317;
        int i6 = C3660.f13403;
        int iM45029 = (i5 - C19806.m45029("ۗ֨")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
        int i7 = ((iM45029 ^ i6) * 7345) ^ 643474480;
        int i8 = 1189205573;
        while (true) {
            i4 = ((((i4 ^ i6) * 6495) >> 31) & i7) ^ (iM45029 ^ i8);
            switch (i4) {
                case -2085263173:
                case 1831784742:
                    sArr = f39370;
                    if (C0216.m1591() <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩻᩸") ^ i5) * (-75);
                        i7 = ((iM45029 ^ i6) * 29205) ^ 469909088;
                        i8 = 276107248;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۚ֡") ^ i6;
                        i7 = ((iM45029 ^ i5) * 29305) ^ 2088052340;
                        i8 = 565766495;
                    }
                    break;
                case -2041271445:
                case -415704631:
                    if (RunnableC1564.f6300) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩻᩸") ^ i5) * (-75);
                        i7 = ((iM45029 ^ i6) * 29205) ^ 469909088;
                        i8 = 276107248;
                    } else {
                        iM45029 = C19806.m45029("ۖ۟") ^ i6;
                        i7 = ((iM45029 ^ i5) * 22357) ^ (-1073629862);
                        i8 = 33512467;
                    }
                    break;
                case -1893392340:
                case 2067491212:
                    ThreadFactoryC3888.m11300();
                    if (MenuItemOnMenuItemClickListenerC3244.m9701() < 0) {
                        iM45029 = C19806.m45029("ۨ᩶") ^ i6;
                        i7 = ((iM45029 ^ i5) * (-31845)) ^ 210640282;
                        i8 = 1130978580;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩻᩸") ^ i5) * (-75);
                        i7 = ((iM45029 ^ i6) * 29205) ^ 469909088;
                        i8 = 276107248;
                    }
                    break;
                case -1773033575:
                case -1154717810:
                    c = 415;
                    if (C1460.f5948 >= 0) {
                        iM45029 = C19806.m45029("ۨ᩶") ^ i6;
                        i7 = ((iM45029 ^ i5) * (-31845)) ^ 210640282;
                        i8 = 1130978580;
                    } else {
                        iM45029 = (C19806.m45029("᩵ܿ") + i6) * 51;
                        i7 = ((iM45029 ^ i5) * (-14793)) ^ (-205773563);
                        i8 = 1660912242;
                    }
                    break;
                case -1753282836:
                case 991948059:
                    if (this.f39388 == 0) {
                        iM45029 = C19806.m45029("֨᩺") ^ i5;
                        i7 = ((iM45029 ^ i6) * (-32489)) ^ (-1450406886);
                        i8 = 965765215;
                    } else {
                        iM45029 = (i6 - C19806.m45029("ᩳ֫")) * 35;
                        i7 = ((iM45029 ^ i5) * (-28199)) ^ (-985786812);
                        i8 = -500554127;
                    }
                    break;
                case -1730698666:
                case -1508895489:
                    C1668.m5583();
                    return null;
                case -1619767093:
                case 1997952701:
                    i2 = 11115556 + i;
                    if (C0629.f2722 <= 0) {
                        iM45029 = C19806.m45029("ۨ᩶") ^ i6;
                        i7 = ((iM45029 ^ i5) * (-31845)) ^ 210640282;
                        i8 = 1130978580;
                    } else {
                        iM45029 = (i5 - ThreadFactoryC3888.m11306("ܽᩴ")) * (-125);
                        i7 = ((iM45029 ^ i6) * 26415) ^ (-1117389866);
                        i8 = 1403832936;
                    }
                    break;
                case -1240067557:
                case 240033264:
                    if (C19806.f63586) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۢᩳ") + i5) * 95;
                        i7 = ((iM45029 ^ i6) * 4575) ^ (-116108959);
                        i8 = -1095079888;
                    } else {
                        iM45029 = C19806.m45029("ۤܳ") ^ i5;
                        i7 = ((iM45029 ^ i6) * 24563) ^ 196241987;
                        i8 = -1692165149;
                    }
                    break;
                case -1175396269:
                case 1799671900:
                    s2 = 6668;
                    if (C0050.f912 <= 0) {
                        iM45029 = C19806.m45029("ۘ᩷") ^ i6;
                        i7 = ((iM45029 ^ i5) * 3339) ^ 1489854522;
                        i8 = 1969081695;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۗۤ") ^ i6;
                        i7 = ((iM45029 ^ i5) * (-19099)) ^ 1626319065;
                        i8 = -126639625;
                    }
                    break;
                case -993038804:
                case 512267624:
                    return this.f39378;
                case -991883502:
                case 912369425:
                    C3722.m10894();
                    if (C0629.f2722 > 0) {
                        iM45029 = C19806.m45029("ۘ᩷") ^ i6;
                        i7 = ((iM45029 ^ i5) * 3339) ^ 1489854522;
                        i8 = 1969081695;
                    } else {
                        iM45029 = C19806.m45029("ۨ᩶") ^ i6;
                        i7 = ((iM45029 ^ i5) * (-31845)) ^ 210640282;
                        i8 = 1130978580;
                    }
                    break;
                case -765097281:
                case 429313681:
                    if (C2124.f7782 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۢᩳ") + i5) * 95;
                        i7 = ((iM45029 ^ i6) * 4575) ^ (-116108959);
                        i8 = -1095079888;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۗ᩺") ^ i5;
                        i7 = ((iM45029 ^ i6) * 28807) ^ 1815214951;
                        i8 = -1367409959;
                    }
                    break;
                case -725119783:
                case 2028394409:
                    C0629.m2907();
                    C2642.m8171();
                    iM45029 = (ThreadFactoryC3888.m11306("᩻᩸") ^ i5) * (-75);
                    i7 = ((iM45029 ^ i6) * 29205) ^ 469909088;
                    i8 = 276107248;
                    break;
                case -487390589:
                case -433553700:
                    C1377.m4833();
                    if (C0671.m3008() >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۢᩳ") + i5) * 95;
                        i7 = ((iM45029 ^ i6) * 4575) ^ (-116108959);
                        i8 = -1095079888;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩻᩸") ^ i5) * (-75);
                        i7 = ((iM45029 ^ i6) * 29205) ^ 469909088;
                        i8 = 276107248;
                    }
                    break;
                case -427068015:
                case 1876777561:
                    if ((s * s2) - i2 > 0) {
                        iM45029 = (i5 - C19806.m45029("ܿۘ")) * 81;
                        i7 = ((iM45029 ^ i6) * 27605) ^ (-1087605609);
                        i8 = 1868285663;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܳܶ") ^ i6;
                        i7 = ((iM45029 ^ i5) * (-4405)) ^ (-660817448);
                        i8 = 1902846578;
                    }
                    break;
                case -423238318:
                case 1332132219:
                    i3 = 59120;
                    iM45029 = C19806.m45029("ۢܳ") ^ i5;
                    i7 = ((iM45029 ^ i6) * (-6491)) ^ 1976970361;
                    i8 = 1147670377;
                    break;
                case 221126251:
                case 1849183735:
                    if (this.f39385) {
                        iM45029 = (i6 - C19806.m45029("ᩳ֫")) * 35;
                        i7 = ((iM45029 ^ i5) * (-28199)) ^ (-985786812);
                        i8 = -500554127;
                    } else {
                        iM45029 = C19806.m45029("᩹᩹") ^ i6;
                        i7 = ((iM45029 ^ i5) * 9989) ^ (-319608761);
                        i8 = 13789327;
                    }
                    break;
                case 409982080:
                case 840707494:
                    return null;
                case 497528543:
                case 1078331621:
                    i3 = 46142;
                    iM45029 = C19806.m45029("ۢܳ") ^ i5;
                    i7 = ((iM45029 ^ i6) * (-6491)) ^ 1976970361;
                    i8 = 1147670377;
                    break;
                case 1521153029:
                case 2076009724:
                    s = sArr[c];
                    i = s * s;
                    if (C1377.f5749) {
                        iM45029 = (i5 - C19806.m45029("ۘ۬")) * 69;
                        i7 = ((iM45029 ^ i6) * (-12107)) ^ 716452782;
                        i8 = -926152058;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֡ۧ") ^ i6) * (-117);
                        i7 = ((iM45029 ^ i5) * 11935) ^ (-393221121);
                        i8 = -1688736762;
                    }
                    break;
                case 1584892432:
                case 2146927734:
                    short[] sArr2 = f39370;
                    if (C0050.f912 > 0) {
                        if (C3743.f13569) {
                            throw new IllegalStateException(C3660.m10790(sArr2, 416, 29, i3));
                        }
                        iM45029 = C19806.m45029("ۘ᩷") ^ i6;
                        i7 = ((iM45029 ^ i5) * 3339) ^ 1489854522;
                        i8 = 1969081695;
                    } else {
                        iM45029 = C19806.m45029("ۨ᩶") ^ i6;
                        i7 = ((iM45029 ^ i5) * (-31845)) ^ 210640282;
                        i8 = 1130978580;
                    }
                    break;
                default:
                    if (this.f39391) {
                        iM45029 = ThreadFactoryC3888.m11306("۠ܶ") ^ i5;
                        i7 = ((iM45029 ^ i6) * 15503) ^ 894794142;
                        i8 = -1920368663;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩻ۖ") ^ i6;
                        i7 = ((iM45029 ^ i5) * 26173) ^ 1014304601;
                        i8 = -1515112610;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.view.View, android.widget.TextView, l.֡ۚۜ, l.ۛܳۖ, l.ܶܰۜ, l.᩷֫ۖ] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    @Override // l.ComponentCallbacksC22654
    public final void onDestroyView() {
        boolean z = false;
        C15267 c15267 = null;
        C6111 c6111 = null;
        C20556 c20556 = null;
        ActivityC5677 activityC5677 = null;
        ?? r5 = 0;
        int i = 1581602092;
        int i2 = RunnableC1606.f6488;
        int i3 = ThreadFactoryC3888.f14547;
        int iM11306 = (ThreadFactoryC3888.m11306("᩶֫") ^ i3) * 41;
        int i4 = ((iM11306 ^ i2) * (-10831)) ^ 1370468449;
        int i5 = -1207179835;
        while (true) {
            i = ((((i ^ i2) * (-21135)) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2123133559:
                case -663298177:
                    C0050.m946();
                    if (C2249.f8050 >= 0) {
                        iM11306 = (i2 - C19806.m45029("ۨܽ")) * (-85);
                        i4 = ((iM11306 ^ i3) * 17371) ^ 268863456;
                        i5 = -1002487394;
                    } else {
                        iM11306 = (C19806.m45029("ܳ᩷") ^ i3) * 37;
                        i4 = ((iM11306 ^ i2) * 28289) ^ (-393536049);
                        i5 = 310539634;
                    }
                    break;
                case -2025499058:
                case -62730040:
                    z = false;
                    if (C1668.f6641 >= 0) {
                        iM11306 = (i2 - C19806.m45029("ۨܽ")) * (-85);
                        i4 = ((iM11306 ^ i3) * 17371) ^ 268863456;
                        i5 = -1002487394;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩷ۨ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 19421) ^ (-1959561431);
                        i5 = -878356573;
                    }
                    break;
                case -2022648829:
                case -633083846:
                    activityC5677 = (ActivityC5677) C1460.m5049(this);
                    if (C1377.f5749) {
                        iM11306 = ThreadFactoryC3888.m11306("ܰᩳ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-2215)) ^ (-920158801);
                        i5 = 1370027350;
                    } else {
                        iM11306 = (i2 - C19806.m45029("ۨܽ")) * (-85);
                        i4 = ((iM11306 ^ i3) * 17371) ^ 268863456;
                        i5 = -1002487394;
                    }
                    break;
                case -1717541345:
                case -348856776:
                    C0526.m2437();
                    iM11306 = (C19806.m45029("ܳ᩷") ^ i3) * 37;
                    i4 = ((iM11306 ^ i2) * 28289) ^ (-393536049);
                    i5 = 310539634;
                    break;
                case -1647974666:
                case 408691302:
                    this.f39391 = z;
                    c15267 = this.f39380;
                    if (c15267 != null) {
                        iM11306 = C19806.m45029("ܺ֨") ^ i3;
                        i4 = ((iM11306 ^ i2) * 2479) ^ (-469368599);
                        i5 = -147979362;
                    } else {
                        iM11306 = C19806.m45029("᩻᩵") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-3455)) ^ (-391983653);
                        i5 = -1374792281;
                    }
                    break;
                case -1634249928:
                case 290927637:
                    this.f39380 = r5;
                    if (C0278.f1572 <= 0) {
                        iM11306 = (C19806.m45029("ܳ᩷") ^ i3) * 37;
                        i4 = ((iM11306 ^ i2) * 28289) ^ (-393536049);
                        i5 = 310539634;
                    } else {
                        iM11306 = C19806.m45029("ۨ᩸") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-13701)) ^ 1760633749;
                        i5 = -941909673;
                    }
                    break;
                case -1602096657:
                case 387978166:
                    r5 = 0;
                    r5 = 0;
                    if (C2704.f10408) {
                        iM11306 = C19806.m45029("ۛۤ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 15935) ^ 101807971;
                        i5 = -305948095;
                    } else {
                        iM11306 = (i2 - C19806.m45029("ۨܽ")) * (-85);
                        i4 = ((iM11306 ^ i3) * 17371) ^ 268863456;
                        i5 = -1002487394;
                    }
                    break;
                case -1588761548:
                case 138717747:
                    c15267.close();
                    iM11306 = C19806.m45029("᩻᩵") ^ i2;
                    i4 = ((iM11306 ^ i3) * (-3455)) ^ (-391983653);
                    i5 = -1374792281;
                    break;
                case -1098917171:
                case 1117936165:
                    activityC5677.m31015();
                    if (C1398.f5802 <= 0) {
                        iM11306 = (C19806.m45029("ܳ᩷") ^ i3) * 37;
                        i4 = ((iM11306 ^ i2) * 28289) ^ (-393536049);
                        i5 = 310539634;
                    } else {
                        iM11306 = (C19806.m45029("ۧۚ") + i3) * 65;
                        i4 = ((iM11306 ^ i2) * (-20579)) ^ 415232298;
                        i5 = -128053471;
                    }
                    break;
                case -1066566150:
                case 468819283:
                    c6111.m16940();
                    iM11306 = (ThreadFactoryC3888.m11306("ۖܳ") ^ i2) * 79;
                    i4 = ((iM11306 ^ i3) * (-27069)) ^ 1598835307;
                    i5 = 554827620;
                    break;
                case -920082557:
                case 936035096:
                    if (C2871.f10837 >= 0) {
                        iM11306 = (i2 - C19806.m45029("ۨܽ")) * (-85);
                        i4 = ((iM11306 ^ i3) * 17371) ^ 268863456;
                        i5 = -1002487394;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۧ᩻")) * 61;
                        i4 = ((iM11306 ^ i2) * 21053) ^ 1551509735;
                        i5 = -1422616565;
                    }
                    break;
                case -355427124:
                case 1836528732:
                    super.onDestroyView();
                    if (C0526.f2219) {
                        iM11306 = (i2 - C19806.m45029("ܳ۬")) * (-109);
                        i4 = ((iM11306 ^ i3) * (-27495)) ^ (-2128208650);
                        i5 = -1626553900;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܺۢ") + i2) * 13;
                        i4 = ((iM11306 ^ i3) * 3139) ^ (-444874793);
                        i5 = 432759256;
                    }
                    break;
                case -25443570:
                case 1702229146:
                    this.f39381 = r5;
                    this.f39377 = r5;
                    if (C1398.f5802 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܳۘ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-24327)) ^ (-2084761625);
                        i5 = 1856290132;
                    } else {
                        iM11306 = (C19806.m45029("ۛۜ") ^ i2) * 31;
                        i4 = ((iM11306 ^ i3) * 5911) ^ 1499493832;
                        i5 = -1784808865;
                    }
                    break;
                case 34904048:
                case 1749998360:
                    this.f39373 = r5;
                    this.f39378 = r5;
                    if (C2332.m7079() <= 0) {
                        iM11306 = (i2 - C19806.m45029("ܳ۬")) * (-109);
                        i4 = ((iM11306 ^ i3) * (-27495)) ^ (-2128208650);
                        i5 = -1626553900;
                    } else {
                        iM11306 = C19806.m45029("ܺۡ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-15153)) ^ 1450374689;
                        i5 = 857118841;
                    }
                    break;
                case 325192404:
                case 1045040987:
                    if (C1461.m5080()) {
                        iM11306 = ThreadFactoryC3888.m11306("ܳۘ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-24327)) ^ (-2084761625);
                        i5 = 1856290132;
                    } else {
                        iM11306 = (i2 - C19806.m45029("ܿ۠")) * 9;
                        i4 = ((iM11306 ^ i3) * 28317) ^ 1528866361;
                        i5 = -372556735;
                    }
                    break;
                case 434327182:
                case 2121777017:
                    RunnableC0195.m1431();
                    if (C1377.m4833() != 0) {
                        iM11306 = (C19806.m45029("ܳ᩷") ^ i3) * 37;
                        i4 = ((iM11306 ^ i2) * 28289) ^ (-393536049);
                        i5 = 310539634;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۠ۤ") ^ i3) * (-119);
                        i4 = ((iM11306 ^ i2) * (-14293)) ^ 1577518617;
                        i5 = -490568353;
                    }
                    break;
                case 575455407:
                case 622941673:
                    c20556 = this.f39381;
                    if (c20556 != null) {
                        iM11306 = ThreadFactoryC3888.m11306("᩺ۚ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-28021)) ^ (-1199419682);
                        i5 = -1973851146;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۖ᩺") ^ i3) * 11;
                        i4 = ((iM11306 ^ i2) * 3219) ^ 272899153;
                        i5 = 1812379674;
                    }
                    break;
                case 671923999:
                case 1569414158:
                    this.f39374 = r5;
                    this.f39384 = r5;
                    break;
                case 805916942:
                case 890340191:
                    if (C2871.f10837 < 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܳۘ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-24327)) ^ (-2084761625);
                        i5 = 1856290132;
                    } else {
                        iM11306 = (C19806.m45029("ܳ᩷") ^ i3) * 37;
                        i4 = ((iM11306 ^ i2) * 28289) ^ (-393536049);
                        i5 = 310539634;
                    }
                    break;
                case 995591032:
                case 1104858149:
                    c6111 = this.f39378;
                    if (c6111 != null) {
                        iM11306 = C19806.m45029("۫ܽ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 27241) ^ 859587255;
                        i5 = -1777456564;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۖܳ") ^ i2) * 79;
                        i4 = ((iM11306 ^ i3) * (-27069)) ^ 1598835307;
                        i5 = 554827620;
                    }
                    break;
                case 1860027218:
                case 2000007781:
                    AbstractC0464.m2313();
                    break;
                default:
                    c20556.m46365();
                    iM11306 = (ThreadFactoryC3888.m11306("ۖ᩺") ^ i3) * 11;
                    i4 = ((iM11306 ^ i2) * 3219) ^ 272899153;
                    i5 = 1812379674;
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC22611, l.ComponentCallbacksC22654
    public final void onResume() {
        ActivityC19126 activityC19126M2305 = null;
        ActivityC5677 activityC5677 = null;
        CharSequence charSequence = null;
        C20556 c20556 = null;
        int i = -477740621;
        int i2 = C3722.f13525;
        int i3 = C2871.f10837;
        int iM11306 = ThreadFactoryC3888.m11306("᩺۟") ^ i2;
        int i4 = ((iM11306 ^ i3) * 2979) ^ (-2079985940);
        int i5 = 353233670;
        while (true) {
            i = ((((i ^ i3) * 9783) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2143887955:
                case 2120925089:
                    C10634.m26820();
                    C0050.m946();
                    iM11306 = ThreadFactoryC3888.m11306("۫ۙ") ^ i2;
                    i4 = ((iM11306 ^ i3) * (-14751)) ^ 759748088;
                    i5 = 1960715846;
                    break;
                case -2108953719:
                case -210357737:
                    if (C0216.f1393 != 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩹ܰ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-23459)) ^ (-1458447663);
                        i5 = 851834102;
                    } else {
                        iM11306 = (C19806.m45029("ܶ᩻") + i2) * 47;
                        i4 = ((iM11306 ^ i3) * 22501) ^ 288535054;
                        i5 = -653554414;
                    }
                    break;
                case -1901258744:
                case 378004799:
                    if (C2642.f10294 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܿۧ") ^ i2) * 99;
                        i4 = ((iM11306 ^ i3) * (-25495)) ^ (-390931385);
                        i5 = 501491981;
                    } else {
                        iM11306 = C19806.m45029("ۡ֨") ^ i3;
                        i4 = ((iM11306 ^ i2) * 4571) ^ 1694858597;
                        i5 = -550124078;
                    }
                    break;
                case -1645304133:
                case 1979952694:
                    CallableC1627.m5507();
                    if (C2788.f10625 >= 0) {
                        iM11306 = C19806.m45029("ۡ֨") ^ i3;
                        i4 = ((iM11306 ^ i2) * 4571) ^ 1694858597;
                        i5 = -550124078;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۫ۙ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-14751)) ^ 759748088;
                        i5 = 1960715846;
                    }
                    break;
                case -1597043010:
                case -1594876108:
                    break;
                case -1151063564:
                case 842283055:
                    c20556.m46379();
                    iM11306 = ThreadFactoryC3888.m11306("֡ᩳ") ^ i2;
                    i4 = ((iM11306 ^ i3) * 18737) ^ (-1004514834);
                    i5 = -2051935850;
                    break;
                case -1080562982:
                case -770344156:
                    charSequence = null;
                    if (C2124.m6673() <= 0) {
                        iM11306 = C19806.m45029("ۡ֨") ^ i3;
                        i4 = ((iM11306 ^ i2) * 4571) ^ 1694858597;
                        i5 = -550124078;
                    } else {
                        iM11306 = (C19806.m45029("ܺ᩷") ^ i3) * (-19);
                        i4 = ((iM11306 ^ i2) * (-15157)) ^ 813589746;
                        i5 = -1813681386;
                    }
                    break;
                case -186323049:
                case 267941517:
                    if (C1148.f5161 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۫ۙ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-14751)) ^ 759748088;
                        i5 = 1960715846;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۤ᩻") ^ i3) * 39;
                        i4 = ((iM11306 ^ i2) * (-26955)) ^ (-901391118);
                        i5 = 1823774083;
                    }
                    break;
                case -77677684:
                case 1794536029:
                    if (C1148.f5161 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܿۧ") ^ i2) * 99;
                        i4 = ((iM11306 ^ i3) * (-25495)) ^ (-390931385);
                        i5 = 501491981;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܰۙ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-24101)) ^ (-1461014187);
                        i5 = 547988939;
                    }
                    break;
                case 12435400:
                case 98006968:
                    if (C2477.m7593() >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩹ܰ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-23459)) ^ (-1458447663);
                        i5 = 851834102;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۧᩴ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-16213)) ^ 2080716659;
                        i5 = -778426336;
                    }
                    break;
                case 608830328:
                case 1775239114:
                    activityC5677 = (ActivityC5677) C1460.m5049(this);
                    if (C1377.f5749) {
                        iM11306 = ThreadFactoryC3888.m11306("ۢܳ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 27081) ^ (-835310143);
                        i5 = -1696005743;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܿۧ") ^ i2) * 99;
                        i4 = ((iM11306 ^ i3) * (-25495)) ^ (-390931385);
                        i5 = 501491981;
                    }
                    break;
                case 705448764:
                case 995207907:
                    if (C1875.f7103 >= 0) {
                        iM11306 = C19806.m45029("ۡ֨") ^ i3;
                        i4 = ((iM11306 ^ i2) * 4571) ^ 1694858597;
                        i5 = -550124078;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۜ᩸") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-26383)) ^ 982947451;
                        i5 = 1236157980;
                    }
                    break;
                case 737926411:
                case 916061492:
                    activityC5677.m15657(charSequence);
                    c20556 = this.f39381;
                    if (c20556 != null) {
                        iM11306 = ThreadFactoryC3888.m11306("ۖ᩵") ^ i3;
                        i4 = ((iM11306 ^ i2) * 8953) ^ (-376783846);
                        i5 = 160748839;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֡ᩳ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 18737) ^ (-1004514834);
                        i5 = -2051935850;
                    }
                    break;
                case 772149278:
                case 1168861919:
                    activityC19126M2305 = AbstractC0464.m2305(this);
                    if (C0278.m1789() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩹ܰ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-23459)) ^ (-1458447663);
                        i5 = 851834102;
                    } else {
                        iM11306 = (C19806.m45029("᩶ۢ") ^ i3) * (-85);
                        i4 = ((iM11306 ^ i2) * (-3805)) ^ 466000018;
                        i5 = 66483127;
                    }
                    break;
                case 781127095:
                case 1841630649:
                    C0817.m3399();
                    if (C3577.f13150 < 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩹ܰ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-23459)) ^ (-1458447663);
                        i5 = 851834102;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۫ۙ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-14751)) ^ 759748088;
                        i5 = 1960715846;
                    }
                    break;
                case 812705657:
                case 995765292:
                    super.onResume();
                    if (C1189.f5284 <= 0) {
                        iM11306 = C19806.m45029("ۨ᩸") ^ i3;
                        i4 = ((iM11306 ^ i2) * 7541) ^ (-363471799);
                        i5 = 1012791828;
                    } else {
                        iM11306 = (i3 - C19806.m45029("᩷۠")) * 87;
                        i4 = ((iM11306 ^ i2) * (-19491)) ^ (-2064232867);
                        i5 = 1278659660;
                    }
                    break;
                case 1369492690:
                case 1948158002:
                    C3286.m9798();
                    C1937.m6279();
                    break;
                default:
                    activityC19126M2305.setTitle(mo3615());
                    if (C1977.f7413 <= 0) {
                        iM11306 = C19806.m45029("ۨ᩸") ^ i3;
                        i4 = ((iM11306 ^ i2) * 7541) ^ (-363471799);
                        i5 = 1012791828;
                    } else {
                        iM11306 = (C19806.m45029("ۤۤ") ^ i2) * (-9);
                        i4 = ((iM11306 ^ i3) * (-4301)) ^ (-631647140);
                        i5 = -951695844;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x011a A[PHI: r2 r3 r5 r6
      0x011a: PHI (r2v3 l.֫ܿ) = (r2v2 l.֫ܿ), (r2v5 l.֫ܿ) binds: [B:35:0x0118, B:6:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x011a: PHI (r3v3 l.᩷֫ۖ) = (r3v2 l.᩷֫ۖ), (r3v4 l.᩷֫ۖ) binds: [B:35:0x0118, B:6:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x011a: PHI (r5v4 int) = (r5v3 int), (r5v2 int) binds: [B:35:0x0118, B:6:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x011a: PHI (r6v4 int) = (r6v3 int), (r6v2 int) binds: [B:35:0x0118, B:6:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x026a A[PHI: r4 r16
      0x026a: PHI (r4v4 java.lang.String) = (r4v2 java.lang.String), (r4v3 java.lang.String), (r4v2 java.lang.String) binds: [B:62:0x0268, B:39:0x014e, B:11:0x0078] A[DONT_GENERATE, DONT_INLINE]
      0x026a: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:62:0x0268, B:39:0x014e, B:11:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x029c A[PHI: r13 r14 r15
      0x029c: PHI (r13v4 short[]) = (r13v2 short[]), (r13v3 short[]), (r13v2 short[]) binds: [B:66:0x029a, B:43:0x0173, B:15:0x0084] A[DONT_GENERATE, DONT_INLINE]
      0x029c: PHI (r14v4 int) = (r14v2 int), (r14v3 int), (r14v2 int) binds: [B:66:0x029a, B:43:0x0173, B:15:0x0084] A[DONT_GENERATE, DONT_INLINE]
      0x029c: PHI (r15v4 int) = (r15v2 int), (r15v3 int), (r15v2 int) binds: [B:66:0x029a, B:43:0x0173, B:15:0x0084] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008c, code lost:
    
        if (l.C1977.m6356() == false) goto L10;
     */
    @Override // l.ComponentCallbacksC22654
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreateOptionsMenu(android.view.Menu r26, android.view.MenuInflater r27) {
        /*
            Method dump skipped, instruction units count: 862
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11718.onCreateOptionsMenu(android.view.Menu, android.view.MenuInflater):void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12819 m29261(C11718 c11718, C17367 c17367, C6111 c6111, C20556 c20556) throws Throwable {
        int i = 0;
        Throwable th = null;
        boolean zM40447 = false;
        boolean zMo8731 = false;
        C12819 c12819 = null;
        int i2 = -1412836074;
        int i3 = ViewTreeObserverOnPreDrawListenerC3327.f12317;
        int i4 = C2477.f9839;
        int iM45029 = (C19806.m45029("ۙۚ") ^ i4) * 9;
        int i5 = ((iM45029 ^ i3) * 9273) ^ 1498491477;
        int i6 = -594361479;
        while (true) {
            i2 = ((((i2 ^ i3) * 11243) >> 31) & i5) ^ (iM45029 ^ i6);
            switch (i2) {
                case -2067456181:
                case -272774598:
                    c6111.m16882(c11718.m50130(c11718.f39389.m47183()).m33318());
                    iM45029 = C19806.m45029("ۗᩳ") ^ i4;
                    i5 = ((iM45029 ^ i3) * (-16823)) ^ 443906194;
                    i6 = 664214736;
                    break;
                case -2042716893:
                case 1527074836:
                    C1398.m4895();
                    if (C3535.f13026 <= 0) {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("۟᩵")) * 29;
                        i5 = ((iM45029 ^ i3) * (-6551)) ^ (-794734224);
                        i6 = -2060124770;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܺۖ") ^ i3) * 95;
                        i5 = ((iM45029 ^ i4) * 6629) ^ (-76765979);
                        i6 = 645833354;
                    }
                    break;
                case -2038064789:
                case -391006359:
                    if (C3722.m10894() > 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܺۖ") ^ i3) * 95;
                        i5 = ((iM45029 ^ i4) * 6629) ^ (-76765979);
                        i6 = 645833354;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۘۤ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 21563) ^ 434786777;
                        i6 = -115390652;
                    }
                    break;
                case -2005324447:
                case 125189449:
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    if (C0817.m3399()) {
                        iM45029 = (C19806.m45029("᩵᩵") + i3) * (-67);
                        i5 = ((iM45029 ^ i4) * 27635) ^ 1086078537;
                        i6 = 959130062;
                    } else {
                        iM45029 = C19806.m45029("᩵᩶") ^ i3;
                        i5 = ((iM45029 ^ i4) * 27371) ^ 542651843;
                        i6 = 306238246;
                    }
                    break;
                case -1993434458:
                case -552528524:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 > 0) {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("۟᩵")) * 29;
                        i5 = ((iM45029 ^ i3) * (-6551)) ^ (-794734224);
                        i6 = -2060124770;
                    } else {
                        iM45029 = (C19806.m45029("ܶۡ") + i4) * 95;
                        i5 = ((iM45029 ^ i3) * 22279) ^ 1387554922;
                        i6 = -935352578;
                    }
                    break;
                case -1770711484:
                case -485950323:
                    c6111.m16922(true);
                    i = 1382253410;
                    iM45029 = (ThreadFactoryC3888.m11306("᩵᩸") ^ i3) * 75;
                    i5 = ((iM45029 ^ i4) * (-19811)) ^ 790890290;
                    i6 = -220239507;
                    break;
                case -1769010656:
                case 1397862060:
                    if (C1025.f4800 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܺۖ") ^ i3) * 95;
                        i5 = ((iM45029 ^ i4) * 6629) ^ (-76765979);
                        i6 = 645833354;
                    } else {
                        iM45029 = C19806.m45029("ۜ᩶") ^ i4;
                        i5 = ((iM45029 ^ i3) * 30733) ^ (-453387501);
                        i6 = 677913807;
                    }
                    break;
                case -1709499041:
                case 760352574:
                    if (RunnableC1895.m6170() != 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۡۖ") + i3) * 127;
                        i5 = ((iM45029 ^ i4) * 30095) ^ (-1805947743);
                        i6 = 254351773;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۟۬") ^ i4) * (-75);
                        i5 = ((iM45029 ^ i3) * (-12299)) ^ 1354609743;
                        i6 = 1151072266;
                    }
                    break;
                case -1678932795:
                case 940703323:
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = (C19806.m45029("ܶۢ") + i3) * 9;
                        i5 = ((iM45029 ^ i4) * 26993) ^ (-1295069112);
                        i6 = -1497481008;
                    } else {
                        iM45029 = C19806.m45029("ܰ֨") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-617)) ^ (-1536051014);
                        i6 = -1396112415;
                    }
                    break;
                case -1295620486:
                case 1608261949:
                    if (zM40447) {
                        iM45029 = C19806.m45029("ܳ۟") ^ i4;
                        i5 = ((iM45029 ^ i3) * 22213) ^ 2131775509;
                        i6 = 788881316;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ܶܳ")) * 17;
                        i5 = ((iM45029 ^ i4) * (-4633)) ^ (-1811195915);
                        i6 = 654022772;
                    }
                    break;
                case -1193949969:
                case -42229020:
                    if (C1398.m4895() <= 0) {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("۟᩵")) * 29;
                        i5 = ((iM45029 ^ i3) * (-6551)) ^ (-794734224);
                        i6 = -2060124770;
                    } else {
                        iM45029 = (C19806.m45029("ۗۘ") ^ i4) * 17;
                        i5 = ((iM45029 ^ i3) * (-7527)) ^ (-1267093106);
                        i6 = 1767392281;
                    }
                    break;
                case -1112173285:
                case 258028981:
                    C1460.m5050();
                    if (C1189.f5284 <= 0) {
                        iM45029 = (i3 - C19806.m45029("ܿ᩺")) * 31;
                        i5 = ((iM45029 ^ i4) * 28837) ^ (-765750378);
                        i6 = -670940735;
                    } else {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("۟᩵")) * 29;
                        i5 = ((iM45029 ^ i3) * (-6551)) ^ (-794734224);
                        i6 = -2060124770;
                    }
                    break;
                case -806762408:
                case -329459150:
                    if (C0962.f3784) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܺۖ") ^ i3) * 95;
                        i5 = ((iM45029 ^ i4) * 6629) ^ (-76765979);
                        i6 = 645833354;
                    } else {
                        iM45029 = (C19806.m45029("ۘۡ") ^ i3) * 47;
                        i5 = ((iM45029 ^ i4) * (-22071)) ^ (-1760956957);
                        i6 = -888413527;
                    }
                    break;
                case -692225802:
                case 1126235294:
                    if (RunnableC1606.f6488 >= 0) {
                        iM45029 = C19806.m45029("᩵᩶") ^ i3;
                        i5 = ((iM45029 ^ i4) * 27371) ^ 542651843;
                        i6 = 306238246;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۛۡ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-11015)) ^ 1304368169;
                        i6 = -1076357680;
                    }
                    break;
                case -587669129:
                case 121042238:
                    if (C0671.m3008() >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܺۖ") ^ i3) * 95;
                        i5 = ((iM45029 ^ i4) * 6629) ^ (-76765979);
                        i6 = 645833354;
                    } else {
                        iM45029 = C19806.m45029("᩷۫") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-15667)) ^ 1973732953;
                        i6 = 437540971;
                    }
                    break;
                case -473750689:
                case -77607870:
                    c12819 = null;
                    iM45029 = C19806.m45029("᩶ۢ") ^ i3;
                    i5 = ((iM45029 ^ i4) * (-31075)) ^ (-1745070218);
                    i6 = -1553773798;
                    break;
                case -423835751:
                case 1470559298:
                    c6111.m16998();
                    return c12819;
                case -366559835:
                case -1430146:
                    zMo8731 = C3743.m10961(c6111).mo8731();
                    iM45029 = (i3 - C19806.m45029("ᩳᩳ")) * (-47);
                    i5 = ((iM45029 ^ i4) * 16977) ^ 1819388309;
                    i6 = -482619788;
                    break;
                case -218619419:
                case 393523419:
                    RunnableC1895.m6170();
                    return null;
                case -205109473:
                case 1872784343:
                    if (zMo8731) {
                        iM45029 = C19806.m45029("ۗᩳ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-16823)) ^ 443906194;
                        i6 = 664214736;
                    } else {
                        iM45029 = C19806.m45029("᩸۫") ^ i4;
                        i5 = ((iM45029 ^ i3) * 25379) ^ 2024468123;
                        i6 = -1617954905;
                    }
                    break;
                case -25882010:
                case 893063975:
                    if (C0278.m1789() <= 0) {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("۟᩵")) * 29;
                        i5 = ((iM45029 ^ i3) * (-6551)) ^ (-794734224);
                        i6 = -2060124770;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܿۚ") ^ i4) * 101;
                        i5 = ((iM45029 ^ i3) * 6871) ^ (-1133458120);
                        i6 = -31954222;
                    }
                    break;
                case -2271243:
                case 809915654:
                    C1668.m5583();
                    C2704.m8255();
                    iM45029 = (ThreadFactoryC3888.m11306("ܺۖ") ^ i3) * 95;
                    i5 = ((iM45029 ^ i4) * 6629) ^ (-76765979);
                    i6 = 645833354;
                    break;
                case 437770470:
                case 912877796:
                    if (C1377.m4833() != 0) {
                        iM45029 = (C19806.m45029("ܶۢ") + i3) * 9;
                        i5 = ((iM45029 ^ i4) * 26993) ^ (-1295069112);
                        i6 = -1497481008;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۬᩹") ^ i3;
                        i5 = ((iM45029 ^ i4) * 14051) ^ 1852939161;
                        i6 = -1437679597;
                    }
                    break;
                case 510884046:
                case 1436824517:
                    if (C3660.f13403 >= 0) {
                        iM45029 = C19806.m45029("᩵᩶") ^ i3;
                        i5 = ((iM45029 ^ i4) * 27371) ^ 542651843;
                        i6 = 306238246;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܺۖ") ^ i3) * 95;
                        i5 = ((iM45029 ^ i4) * 6629) ^ (-76765979);
                        i6 = 645833354;
                    }
                    break;
                case 927858421:
                case 1997153858:
                    c6111.m16922(false);
                    throw th;
                case 1052485286:
                case 1711257621:
                    if (C3577.f13150 >= 0) {
                        iM45029 = (i3 - C19806.m45029("ܿ᩺")) * 31;
                        i5 = ((iM45029 ^ i4) * 28837) ^ (-765750378);
                        i6 = -670940735;
                    } else {
                        iM45029 = C19806.m45029("ۗۧ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 25523) ^ (-1711884791);
                        i6 = 1901586744;
                    }
                    break;
                case 1482280251:
                case 2025666323:
                    if (C7105.f23796 >= 0) {
                        iM45029 = (C19806.m45029("ܶۢ") + i3) * 9;
                        i5 = ((iM45029 ^ i4) * 26993) ^ (-1295069112);
                        i6 = -1497481008;
                    } else {
                        iM45029 = C19806.m45029("ܺۡ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 2519) ^ (-433311170);
                        i6 = -1610919038;
                    }
                    break;
                case 1597292358:
                case 1641874086:
                    c12819 = new C12819(AbstractC8620.m22396(c17367.m40442()));
                    iM45029 = C19806.m45029("᩶ۢ") ^ i3;
                    i5 = ((iM45029 ^ i4) * (-31075)) ^ (-1745070218);
                    i6 = -1553773798;
                    break;
                case 1790489337:
                case 1798497695:
                    C2704.m8255();
                    if (AbstractC0464.f2088 > 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۡۖ") + i3) * 127;
                        i5 = ((iM45029 ^ i4) * 30095) ^ (-1805947743);
                        i6 = 254351773;
                    } else {
                        iM45029 = C19806.m45029("᩵᩶") ^ i3;
                        i5 = ((iM45029 ^ i4) * 27371) ^ 542651843;
                        i6 = 306238246;
                    }
                    break;
                default:
                    try {
                        C20190.m45649((InterfaceC0433) c17367, i);
                        c11718.f39392 = C2249.m6917(c17367);
                        c11718.f39386 = C3660.m10781(c17367);
                        C20190.m45649((InterfaceC0433) c17367, i);
                        c6111.mo16878(c17367);
                        C20190.m45649((InterfaceC0433) c17367, i);
                        c20556.m46382(c17367);
                        C20190.m45649((InterfaceC0433) c17367, i);
                        c20556.m46375(c17367);
                        zM40447 = c17367.m40447(1382256833);
                        iM45029 = C19806.m45029("ۛ᩷") ^ i4;
                        i5 = ((iM45029 ^ i3) * 28139) ^ (-1773331156);
                        i6 = 804112687;
                    } catch (Throwable th2) {
                        th = th2;
                        iM45029 = C19806.m45029("᩶֫") ^ i4;
                        i5 = ((iM45029 ^ i3) * 27841) ^ (-415506369);
                        i6 = 121117017;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    private void m29288() {
        int iM11306;
        int i;
        int i2;
        int iM11307;
        int i3;
        short s;
        int iM11308;
        int i4;
        int i5;
        int iM11309;
        int i6;
        int iM113010;
        int i7;
        int i8;
        int i9;
        C6111 c6111;
        int i10;
        int i11 = C0629.f2722;
        int i12 = RunnableC1606.f6488;
        int iM113011 = ThreadFactoryC3888.m11306("᩸ۖ") ^ i12;
        int i13 = ((iM113011 ^ i11) * 32191) ^ (-1266740568);
        StringBuilder sb = null;
        Point point = null;
        String strM4040 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i14 = iM113011 ^ (-1752408055);
        int iM6689 = 0;
        int iM7598 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        char c = 0;
        short s2 = 0;
        short s3 = 0;
        C6111 c6112 = null;
        int i19 = -349979619;
        int i20 = 0;
        String str = null;
        short[] sArr3 = null;
        int iAbs = 0;
        String str2 = null;
        while (true) {
            i19 = i14 ^ (i13 & (((i19 ^ i11) * 21571) >> 31));
            switch (i19) {
                case -2131101189:
                case 1875879690:
                    C2788.m8480(sb, strM4040);
                    iAbs = Math.abs(iM7598 - iM6689);
                    if (RunnableC1606.f6488 < 0) {
                        iM11307 = C19806.m45029("᩷ۚ") ^ i11;
                        i = ((iM11307 ^ i12) * (-11417)) ^ (-548371503);
                        i3 = -1302536610;
                        i14 = iM11307 ^ i3;
                        i13 = i;
                    } else {
                        i20 = i20;
                        sArr2 = sArr2;
                        int iM45029 = C19806.m45029("ۗ᩸") ^ i11;
                        c6112 = c6112;
                        i13 = ((iM45029 ^ i12) * 24925) ^ 525552173;
                        i14 = iM45029 ^ (-2118449644);
                        sArr2 = sArr2;
                        i20 = i20;
                        point = point;
                    }
                    break;
                case -2120804548:
                case -1663934080:
                    iAbs = iAbs;
                    point = point;
                    i20 = i20;
                    sArr2 = sArr2;
                    s2 = sArr3[c];
                    s3 = 11892;
                    if (C3577.f13150 < 0) {
                        iM113010 = (i11 - ThreadFactoryC3888.m11306("ܶ۬")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i7 = ((iM113010 ^ i12) * 827) ^ 143970089;
                        i8 = 519475639;
                        int i21 = iM113010 ^ i8;
                        iAbs = iAbs;
                        i14 = i21;
                        i13 = i7;
                        sArr2 = sArr2;
                        i20 = i20;
                        point = point;
                    } else {
                        sArr2 = sArr2;
                        iM11309 = (ThreadFactoryC3888.m11306("ۛ۬") ^ i12) * 75;
                        i4 = ((iM11309 ^ i11) * 15383) ^ 2095860312;
                        i6 = -1379440229;
                        i9 = iM11309 ^ i6;
                        i20 = i20;
                        point = point;
                        i10 = iAbs;
                        i14 = i9;
                        i13 = i4;
                        iAbs = i10;
                    }
                    break;
                case -1932928516:
                case -498037756:
                    iAbs = iAbs;
                    sArr = f39370;
                    i17 = 91;
                    i18 = 3;
                    if (RunnableC1606.f6488 < 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۢ֡") ^ i11;
                        i = ((iM11306 ^ i12) * (-31099)) ^ (-1208781316);
                        i2 = 1883931302;
                        int i22 = iM11306 ^ i2;
                        iAbs = iAbs;
                        i14 = i22;
                        i13 = i;
                    } else {
                        c6111 = c6112;
                        int iM450210 = C19806.m45029("֨᩵") ^ i11;
                        c6112 = c6111;
                        i13 = ((iM450210 ^ i12) * (-2129)) ^ 1196743114;
                        iAbs = iAbs;
                        i14 = iM450210 ^ (-1198461403);
                    }
                    break;
                case -1831585711:
                case 1388874869:
                    if (C1377.m4833() == 0) {
                        iM11307 = (ThreadFactoryC3888.m11306("ۧۘ") ^ i12) * 31;
                        i = ((iM11307 ^ i11) * (-24303)) ^ 434798136;
                        i3 = -875731635;
                        i14 = iM11307 ^ i3;
                        i13 = i;
                    } else {
                        iAbs = iAbs;
                        c6111 = c6112;
                        int iM450211 = C19806.m45029("֨᩵") ^ i11;
                        c6112 = c6111;
                        i13 = ((iM450211 ^ i12) * (-2129)) ^ 1196743114;
                        iAbs = iAbs;
                        i14 = iM450211 ^ (-1198461403);
                    }
                    break;
                case -1590676007:
                case -1142208463:
                    C0817.m3408(sb, iAbs);
                    iAbs = iAbs;
                    C2788.m8480(sb, C2477.m7604(f39370, 99, 1, i16));
                    point = point;
                    i20 = i20;
                    iM11309 = C19806.m45029("᩻᩸") ^ i12;
                    i4 = ((iM11309 ^ i11) * (-26221)) ^ (-1417102165);
                    i6 = 1662861433;
                    i9 = iM11309 ^ i6;
                    i20 = i20;
                    point = point;
                    i10 = iAbs;
                    i14 = i9;
                    i13 = i4;
                    iAbs = i10;
                    break;
                case -1409288404:
                case -1347643335:
                    C2124.m6673();
                    iAbs = iAbs;
                    iM11306 = C19806.m45029("᩷ܶ") ^ i12;
                    i = ((iM11306 ^ i11) * 24431) ^ 1375377333;
                    i2 = -1500431019;
                    int i23 = iM11306 ^ i2;
                    iAbs = iAbs;
                    i14 = i23;
                    i13 = i;
                    break;
                case -1379044592:
                case -879328472:
                    iAbs = iAbs;
                    str2 = this.f39383;
                    sArr2 = f39370;
                    i15 = 94;
                    if (!CallableC1627.f6528) {
                        point = point;
                        i20 = i20;
                        iM11309 = (ThreadFactoryC3888.m11306("ۛ۬") ^ i12) * 75;
                        i4 = ((iM11309 ^ i11) * 15383) ^ 2095860312;
                        i6 = -1379440229;
                        i9 = iM11309 ^ i6;
                        i20 = i20;
                        point = point;
                        i10 = iAbs;
                        i14 = i9;
                        i13 = i4;
                        iAbs = i10;
                    } else {
                        iM11306 = C19806.m45029("ۤۤ") ^ i12;
                        i = ((iM11306 ^ i11) * 5979) ^ 1075607261;
                        i2 = -733171094;
                        int i24 = iM11306 ^ i2;
                        iAbs = iAbs;
                        i14 = i24;
                        i13 = i;
                    }
                    break;
                case -1258010381:
                case -538443764:
                    iAbs = iAbs;
                    C1148.m4223(sb, str);
                    MenuItemOnMenuItemClickListenerC3244.m9704(this.f39384, C0817.m3407(sb));
                    point = point;
                    i20 = i20;
                    sArr2 = sArr2;
                    iM113010 = C19806.m45029("֨ۛ") ^ i12;
                    i7 = ((iM113010 ^ i11) * 10173) ^ (-1391805670);
                    i8 = 430369866;
                    int i25 = iM113010 ^ i8;
                    iAbs = iAbs;
                    i14 = i25;
                    i13 = i7;
                    sArr2 = sArr2;
                    i20 = i20;
                    point = point;
                    break;
                case -1060679078:
                case 344994913:
                    if (C1066.f4915 <= 0) {
                        iAbs = iAbs;
                        c6111 = c6112;
                        int iM450212 = C19806.m45029("֨᩵") ^ i11;
                        c6112 = c6111;
                        i13 = ((iM450212 ^ i12) * (-2129)) ^ 1196743114;
                        iAbs = iAbs;
                        i14 = iM450212 ^ (-1198461403);
                    } else {
                        iAbs = iAbs;
                        iM11306 = C19806.m45029("᩷ܶ") ^ i12;
                        i = ((iM11306 ^ i11) * 24431) ^ 1375377333;
                        i2 = -1500431019;
                        int i26 = iM11306 ^ i2;
                        iAbs = iAbs;
                        i14 = i26;
                        i13 = i;
                    }
                    break;
                case -804980657:
                case 1849355949:
                    iAbs = iAbs;
                    int i27 = i20;
                    C2124.m6683(sb, i27);
                    ThreadFactoryC3888.m11302(sb, ':');
                    point = point;
                    C0817.m3408(sb, point.y);
                    if (iM6689 != iM7598) {
                        int iM113012 = ThreadFactoryC3888.m11306("᩻ۤ") ^ i12;
                        i13 = ((iM113012 ^ i11) * (-24795)) ^ (-1117663019);
                        i20 = i27;
                        point = point;
                        i10 = iAbs;
                        i14 = iM113012 ^ (-2005346305);
                    } else {
                        i20 = i27;
                        iM11309 = C19806.m45029("᩻᩸") ^ i12;
                        i4 = ((iM11309 ^ i11) * (-26221)) ^ (-1417102165);
                        i6 = 1662861433;
                        i9 = iM11309 ^ i6;
                        i20 = i20;
                        point = point;
                        i10 = iAbs;
                        i14 = i9;
                        i13 = i4;
                    }
                    iAbs = i10;
                    break;
                case -435130738:
                case 1663404189:
                    iAbs = iAbs;
                    C1148.m4223(sb, C1668.m5577(sArr, i17, i18, i16));
                    if (!RunnableC1564.f6300) {
                        iM11306 = ThreadFactoryC3888.m11306("ۛ᩹") ^ i12;
                        i = ((iM11306 ^ i11) * (-681)) ^ (-565735690);
                        i2 = 1109019446;
                        int i28 = iM11306 ^ i2;
                        iAbs = iAbs;
                        i14 = i28;
                        i13 = i;
                    } else {
                        c6111 = c6112;
                        int iM450213 = C19806.m45029("֨᩵") ^ i11;
                        c6112 = c6111;
                        i13 = ((iM450213 ^ i12) * (-2129)) ^ 1196743114;
                        iAbs = iAbs;
                        i14 = iM450213 ^ (-1198461403);
                    }
                    break;
                case -372872936:
                case 1190099233:
                    if (C1025.f4800 < 0) {
                        i20 = i20;
                        sArr2 = sArr2;
                        int iM450214 = C19806.m45029("ۗ᩸") ^ i11;
                        c6112 = c6112;
                        i13 = ((iM450214 ^ i12) * 24925) ^ 525552173;
                        i14 = iM450214 ^ (-2118449644);
                        sArr2 = sArr2;
                        i20 = i20;
                        point = point;
                    } else {
                        iAbs = iAbs;
                        c6111 = c6112;
                        int iM450215 = C19806.m45029("֨᩵") ^ i11;
                        c6112 = c6111;
                        i13 = ((iM450215 ^ i12) * (-2129)) ^ 1196743114;
                        iAbs = iAbs;
                        i14 = iM450215 ^ (-1198461403);
                    }
                    break;
                case -330691576:
                case -160330591:
                    break;
                case -72096260:
                case 978527973:
                    iAbs = iAbs;
                    point = point;
                    i20 = i20;
                    sArr2 = sArr2;
                    C6111 c6113 = this.f39378;
                    if (c6113 != null) {
                        int iM450216 = C19806.m45029("᩶ܳ") ^ i12;
                        c6112 = c6113;
                        i13 = ((iM450216 ^ i11) * (-7903)) ^ (-1362866252);
                        iAbs = iAbs;
                        i14 = iM450216 ^ (-1887839892);
                    } else {
                        c6112 = c6113;
                        iM113010 = C19806.m45029("֨ۛ") ^ i12;
                        i7 = ((iM113010 ^ i11) * 10173) ^ (-1391805670);
                        i8 = 430369866;
                        int i29 = iM113010 ^ i8;
                        iAbs = iAbs;
                        i14 = i29;
                        i13 = i7;
                    }
                    sArr2 = sArr2;
                    i20 = i20;
                    point = point;
                    break;
                case 163319658:
                case 1229312018:
                    C0962.m3746();
                    break;
                case 409457154:
                case 1944127077:
                    iAbs = iAbs;
                    point = point;
                    i20 = i20;
                    sArr2 = sArr2;
                    s = s2;
                    int i30 = s + 2973;
                    if ((s2 * s3) - (i30 * i30) <= 0) {
                        iM11308 = ThreadFactoryC3888.m11306("۠ܶ") ^ i11;
                        i4 = ((iM11308 ^ i12) * (-17983)) ^ 2043287707;
                        i5 = 1898526801;
                    } else {
                        iM11308 = C19806.m45029("֡֨") ^ i12;
                        i4 = ((iM11308 ^ i11) * 9041) ^ 1338246996;
                        i5 = -1364570592;
                    }
                    i9 = iM11308 ^ i5;
                    s2 = s;
                    sArr2 = sArr2;
                    i20 = i20;
                    point = point;
                    i10 = iAbs;
                    i14 = i9;
                    i13 = i4;
                    iAbs = i10;
                    break;
                case 702370300:
                case 1621963977:
                    iAbs = iAbs;
                    c6112 = c6112;
                    point = point;
                    i20 = i20;
                    sArr2 = sArr2;
                    sb = new StringBuilder();
                    iM6689 = C2124.m6689(c6112);
                    iM7598 = C2477.m7598(c6112);
                    if (!ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iAbs = iAbs;
                        int iM450217 = C19806.m45029("ۗ᩸") ^ i11;
                        c6112 = c6112;
                        i13 = ((iM450217 ^ i12) * 24925) ^ 525552173;
                        i14 = iM450217 ^ (-2118449644);
                        sArr2 = sArr2;
                        i20 = i20;
                        point = point;
                    } else {
                        c6112 = c6112;
                        iM113010 = (i11 - ThreadFactoryC3888.m11306("᩺۬")) * (-113);
                        i7 = ((iM113010 ^ i12) * 7319) ^ (-615152416);
                        i8 = 608904733;
                        int i210 = iM113010 ^ i8;
                        iAbs = iAbs;
                        i14 = i210;
                        i13 = i7;
                        sArr2 = sArr2;
                        i20 = i20;
                        point = point;
                    }
                    break;
                case 817656089:
                case 2019069327:
                    iAbs = iAbs;
                    point = point;
                    i20 = i20;
                    sArr2 = sArr2;
                    s = s2;
                    sArr3 = f39370;
                    c = 'Z';
                    if (C0278.f1572 > 0) {
                        iM11308 = ThreadFactoryC3888.m11306("ۡۢ") ^ i12;
                        i4 = ((iM11308 ^ i11) * 11917) ^ 1950506789;
                        i5 = 1929735033;
                        i9 = iM11308 ^ i5;
                        s2 = s;
                        sArr2 = sArr2;
                        i20 = i20;
                        point = point;
                        i10 = iAbs;
                        i14 = i9;
                        i13 = i4;
                        iAbs = i10;
                    } else {
                        s2 = s;
                        sArr2 = sArr2;
                        iM11309 = (ThreadFactoryC3888.m11306("ۛ۬") ^ i12) * 75;
                        i4 = ((iM11309 ^ i11) * 15383) ^ 2095860312;
                        i6 = -1379440229;
                        i9 = iM11309 ^ i6;
                        i20 = i20;
                        point = point;
                        i10 = iAbs;
                        i14 = i9;
                        i13 = i4;
                        iAbs = i10;
                    }
                    break;
                case 947346976:
                case 1098722527:
                    i16 = 40894;
                    iM113010 = (ThreadFactoryC3888.m11306("᩹ܶ") + i11) * 41;
                    i7 = ((iM113010 ^ i12) * (-3493)) ^ (-784410094);
                    i8 = 658383660;
                    int i211 = iM113010 ^ i8;
                    iAbs = iAbs;
                    i14 = i211;
                    i13 = i7;
                    sArr2 = sArr2;
                    i20 = i20;
                    point = point;
                    break;
                case 1230574867:
                case 1439787209:
                    iAbs = iAbs;
                    c6111 = c6112;
                    Point pointM16956 = c6111.m16956(iM6689);
                    int i31 = pointM16956.x;
                    if (C0629.f2722 <= 0) {
                        point = pointM16956;
                        i20 = i31;
                        int iM450218 = C19806.m45029("֨᩵") ^ i11;
                        c6112 = c6111;
                        i13 = ((iM450218 ^ i12) * (-2129)) ^ 1196743114;
                        iAbs = iAbs;
                        i14 = iM450218 ^ (-1198461403);
                    } else {
                        int iM113013 = ThreadFactoryC3888.m11306("۫ܰ") ^ i11;
                        short[] sArr4 = sArr2;
                        int i32 = ((iM113013 ^ i12) * (-3757)) ^ (-1523485927);
                        int i33 = iM113013 ^ (-1016335058);
                        point = pointM16956;
                        c6112 = c6111;
                        i13 = i32;
                        sArr2 = sArr4;
                        i20 = i31;
                        iAbs = iAbs;
                        i14 = i33;
                    }
                    break;
                case 1315950834:
                case 1739340526:
                    iAbs = iAbs;
                    strM4040 = C1066.m4040(f39370, 97, 2, i16);
                    if (!ViewTreeObserverOnPreDrawListenerC3327.m9874()) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩹ۛ") + i11) * 89;
                        i = ((iM11306 ^ i12) * (-31959)) ^ (-2067366833);
                        i2 = -1389304996;
                        int i212 = iM11306 ^ i2;
                        iAbs = iAbs;
                        i14 = i212;
                        i13 = i;
                    } else {
                        iAbs = iAbs;
                        i20 = i20;
                        sArr2 = sArr2;
                        int iM450219 = C19806.m45029("ۗ᩸") ^ i11;
                        c6112 = c6112;
                        i13 = ((iM450219 ^ i12) * 24925) ^ 525552173;
                        i14 = iM450219 ^ (-2118449644);
                        sArr2 = sArr2;
                        i20 = i20;
                        point = point;
                    }
                    break;
                case 1499342738:
                case 1648768195:
                    i16 = 48746;
                    iM113010 = (ThreadFactoryC3888.m11306("᩹ܶ") + i11) * 41;
                    i7 = ((iM113010 ^ i12) * (-3493)) ^ (-784410094);
                    i8 = 658383660;
                    int i213 = iM113010 ^ i8;
                    iAbs = iAbs;
                    i14 = i213;
                    i13 = i7;
                    sArr2 = sArr2;
                    i20 = i20;
                    point = point;
                    break;
                default:
                    iAbs = iAbs;
                    str = (String) C13638.requireNonNullElse(str2, C0216.m1588(sArr2, i15, 3, i16));
                    if (C10634.f36300 >= 0) {
                        iM11306 = C19806.m45029("᩷ܶ") ^ i12;
                        i = ((iM11306 ^ i11) * 24431) ^ 1375377333;
                        i2 = -1500431019;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩻ۘ") ^ i11;
                        i = ((iM11306 ^ i12) * 4489) ^ (-978852650);
                        i2 = -863704203;
                    }
                    int i214 = iM11306 ^ i2;
                    iAbs = iAbs;
                    i14 = i214;
                    i13 = i;
                    break;
            }
            return;
        }
    }
}
