package l;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.analytics.pro.o;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import moe.shizuku.server.IShizukuService;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ۢ۬֫, reason: contains not printable characters */
/* JADX INFO: compiled from: H6HS */
/* JADX INFO: loaded from: classes3.dex */
public final class C10139 {

    /* JADX INFO: renamed from: ۘ۬֫, reason: not valid java name and contains not printable characters */
    private static final short[] f32436 = {4332, 18971, 18956, 18973, 18972, 18971, 18951, 19017, 18950, 19015, 18954, 18972, 18971, 18971, 18956, 18951, 18973, 19009, 19008, 19026, 2903, 20828, 20754, 20737, 20762, 20759, 20736, 20765, 20763, 20762, 20828, 20829, 20751, 20738, 20757, 20742, 20820, 20763, 20809, 20739, 20765, 20762, 20752, 20763, 20739, 20826, 20779, 20779, 20761, 20736, 20793, 20757, 20742, 20767, 20752, 20763, 20739, 20762, 20795, 20737, 20736, 20760, 20765, 20762, 20753, 20815, 20765, 20754, 20828, 20821, 20763, 20744, 20744, 20763, 20826, 20736, 20763, 20767, 20753, 20762, 20821, 20809, 20809, 20744, 20744, 20760, 20763, 20759, 20757, 20736, 20765, 20763, 20762, 20826, 20764, 20742, 20753, 20754, 20826, 20743, 20740, 20760, 20765, 20736, 20828, 20819, 20823, 20819, 20829, 20783, 20804, 20777, 20821, 20809, 20809, 20829, 20742, 20753, 20736, 20737, 20742, 20762, 20820, 20762, 20737, 20760, 20760, 20815, 20745, 20829, 20828, 20829, 8786, 20426, 20445, 20428, 20429, 20426, 20438, 20376, 20439, 20374, 20443, 20429, 20426, 20426, 20445, 20438, 20428, 20368, 20369, 20355, 8914, 8305, 8298, 8307, 8307, 1996, 5195, 5200, 5193, 5193, 5196, 5201, 5184, 5192, 5206, 5201, 5194, 5198, 5184, 5195, 5193, 5184, 5203, 5184, 5193, 5196, 5185, 5201, 5184, 5213, 5201, 5188, 5190, 5201, 5196, 5203, 5184, 8591, 9854, 9833, 9848, 9849, 9854, 9826, 9772, 9827, 9762, 9835, 9827, 9764, 9765, 9783, 6536, -31687, -31710, -31685, -31685, -31707, -31694, -31706, -31710, -31694, -31708, -31709, -31722, -31687, -31682, -31686, -31690, -31709, -31682, -31688, -31687, -31727, -31707, -31690, -31686, -31694, -31617, -31695, -31710, -31687, -31692, -31709, -31682, -31688, -31687, -31617, -31618, -31700, -31707, -31694, -31706, -31710, -31694, -31708, -31709, -31722, -31687, -31682, -31686, -31690, -31709, -31682, -31688, -31687, -31727, -31707, -31690, -31686, -31694, -31617, -31695, -31710, -31687, -31692, -31709, -31682, -31688, -31687, -31617, -31618, -31700, -31711, -31690, -31707, -31625, -31708, -31709, -31690, -31709, -31694, -31638, -31636, -31682, -31695, -31617, -31626, -31708, -31709, -31690, -31709, -31694, -31623, -31688, -31710, -31709, -31685, -31682, -31687, -31694, -31737, -31688, -31708, -31682, -31709, -31682, -31688, -31687, -31682, -31687, -31696, -31618, -31712, -31682, -31687, -31693, -31688, -31712, -31623, -31736, -31736, -31686, -31709, -31718, -31690, -31707, -31684, -31693, -31688, -31712, -31687, -31737, -31707, -31694, -31711, -31682, -31694, -31712, -31623, -31707, -31694, -31708, -31709, -31688, -31707, -31694, -31717, -31690, -31698, -31688, -31710, -31709, -31737, -31688, -31708, -31682, -31709, -31682, -31688, -31687, -31617, -31708, -31709, -31690, -31709, -31694, -31621, -31709, -31707, -31710, -31694, -31618, -31636, -31702, -31618, -31636, -31702, -31618, -31636, 7170, 14095, -5482, 6133, -5276, -4825, -6571, -444, 12330, 13423, 7437, -17356, -17361, -17354, -17354, 4036, 11396, 11411, 11394, 11395, 11396, 11416, 11478, 11417, 11480, 11413, 11415, 11398, 11394, 11395, 11396, 11411, 11450, 11415, 11407, 11417, 11395, 11394, 11430, 11417, 11397, 11423, 11394, 11423, 11417, 11416, 11486, 11487, 11469, 2293, -6879, -6816, -6867, -6865, -6880, -6867, -6869, -6878, -6810, -6809, -6795, -6855, -6873, -6880, -6870, -6879, -6855, -6816, -6895, -6895, -6877, -6854, -6909, -6865, -6852, -6875, -6870, -6879, -6855, -6880, -6882, -6852, -6869, -6856, -6873, -6869, -6855, -6816, -6867, -6865, -6880, -6867, -6869, -6878, -6882, -6879, -6851, -6873, -6854, -6873, -6879, -6880, -6873, -6880, -6871, -6810, -6809, -6795, 7543, 18869, 18939, 18920, 18931, 18942, 18921, 18932, 18930, 18931, 18869, 18868, 18918, 18932, 18939, 18869, 18929, 18930, 18942, 18940, 18921, 18932, 18930, 18931, 18867, 18933, 18927, 18936, 18939, 18867, 18926, 18925, 18929, 18932, 18921, 18869, 18874, 18878, 18874, 18868, 18886, 18861, 18880, 18876, 18848, 18848, 18913, 18913, 18876, 18922, 18932, 18931, 18937, 18930, 18922, 18867, 18882, 18882, 18928, 18921, 18896, 18940, 18927, 18934, 18937, 18930, 18922, 18931, 18898, 18920, 18921, 18929, 18932, 18931, 18936, 18868, 18927, 18936, 18921, 18920, 18927, 18931, 18877, 18931, 18920, 18929, 18929, 18854, 18927, 18936, 18921, 18920, 18927, 18931, 18877, 18922, 18932, 18931, 18937, 18930, 18922, 18867, 18882, 18882, 18928, 18921, 18896, 18940, 18927, 18934, 18937, 18930, 18922, 18931, 18898, 18920, 18921, 18929, 18932, 18931, 18936, 18867, 18926, 18931, 18940, 18925, 18926, 18933, 18930, 18921, 18869, 18868, 18854, 18912, 18868, 18869, 18868};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f32437;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f32438;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f32439;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public VelocityTracker f32440;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public View f32441;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public float f32442;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f32443;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f32444;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public int f32445;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final FrameLayout f32446;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final RunnableC11631 f32447;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f32448;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f32449;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C25227 f32450;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public boolean f32451;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f32452;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f32453;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final RunnableC13526 f32454;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final C19090 f32455;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f32456;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f32457;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f32458;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public Set f32459;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public C20729 f32460;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f32461;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public float f32462;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f32463;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public boolean f32464;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f32465;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public float f32466;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public boolean f32467;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f32468;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f32469;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C0445 f32470;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final RunnableC0313 f32471;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final int f32472;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public float f32473;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ArrayList f32474;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C18344 f32475;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public View f32476;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final RunnableC11209 f32477;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public String f32478;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f32479;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public float f32480;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public ValueAnimator f32481;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public final WebView f32482;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ void m26164(int i, C10139 c10139, String str, boolean z, boolean z2) {
        int i2 = -672779553;
        int i3 = C3492.f12043;
        int i4 = C0773.f2792;
        int iM3169 = C0773.m3169("֨᩷") ^ i4;
        int i5 = ((iM3169 ^ i3) * 5385) ^ 604889333;
        int i6 = 379323299;
        while (true) {
            i2 = ((((i2 ^ i3) * 10761) >> 31) & i5) ^ (iM3169 ^ i6);
            switch (i2) {
                case -1934837736:
                case -1617842259:
                    if (C3033.m9845() > 0) {
                        iM3169 = (C0619.m2761("ۢۖ") + i4) * (-63);
                        i5 = ((iM3169 ^ i3) * (-26701)) ^ 219486180;
                        i6 = 171862349;
                    } else {
                        iM3169 = C0773.m3169("ۛ᩻") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-2637)) ^ (-1955430300);
                        i6 = -280706489;
                    }
                    break;
                case -1609495770:
                case 746145259:
                    C1321.m4852();
                    if (C1321.f4751 < 0) {
                        iM3169 = (i3 - C0773.m3169("ᩴ֨")) * 5;
                        i5 = ((iM3169 ^ i4) * 25185) ^ 457228082;
                        i6 = -1237608875;
                    } else {
                        iM3169 = (C0619.m2761("ۢۖ") + i4) * (-63);
                        i5 = ((iM3169 ^ i3) * (-26701)) ^ 219486180;
                        i6 = 171862349;
                    }
                    break;
                case -1524664026:
                case 2106419129:
                    if (C23916.f77426 <= 0) {
                        iM3169 = C0619.m2761("᩻۟") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-15545)) ^ (-590824271);
                        i6 = 1592002182;
                    } else {
                        iM3169 = C0619.m2761("֨ۧ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-6967)) ^ 2132907352;
                        i6 = 1925208991;
                    }
                    break;
                case -1271468642:
                case 624013097:
                    if (C3492.m11488()) {
                        iM3169 = (i4 - C0773.m3169("֡֡")) * (-117);
                        i5 = ((iM3169 ^ i3) * 31073) ^ 117595419;
                        i6 = 1811129782;
                    } else {
                        iM3169 = C0619.m2761("᩻۟") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-15545)) ^ (-590824271);
                        i6 = 1592002182;
                    }
                    break;
                case -1201167337:
                case 1677898437:
                    if (C0773.f2792 <= 0) {
                        iM3169 = (C0619.m2761("ۢۖ") + i4) * (-63);
                        i5 = ((iM3169 ^ i3) * (-26701)) ^ 219486180;
                        i6 = 171862349;
                    } else {
                        iM3169 = C0773.m3169("᩷ۗ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-3293)) ^ 1916105063;
                        i6 = 2012830387;
                    }
                    break;
                case -1057721136:
                case -643589496:
                    C2966.m9664();
                    iM3169 = C0773.m3169("ۛ᩻") ^ i3;
                    i5 = ((iM3169 ^ i4) * (-2637)) ^ (-1955430300);
                    i6 = -280706489;
                    break;
                case -1051497155:
                case 1678572858:
                    if (C1542.m5459() >= 0) {
                        iM3169 = (i3 - C0773.m3169("ᩴ֨")) * 5;
                        i5 = ((iM3169 ^ i4) * 25185) ^ 457228082;
                        i6 = -1237608875;
                    } else {
                        iM3169 = C0619.m2761("ܿۚ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 19055) ^ (-570924030);
                        i6 = -962039220;
                    }
                    break;
                case -926940864:
                case -790480170:
                    if (C1783.f6087 <= 0) {
                        iM3169 = (C0619.m2761("ۢۖ") + i4) * (-63);
                        i5 = ((iM3169 ^ i3) * (-26701)) ^ 219486180;
                        i6 = 171862349;
                    } else {
                        iM3169 = (C0773.m3169("᩺ۢ") ^ i4) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i5 = ((iM3169 ^ i3) * 17613) ^ (-1988414893);
                        i6 = 1857619841;
                    }
                    break;
                case -729618998:
                case -55398002:
                    RunnableC3055.m9933();
                    C13473.m33144();
                    break;
                case -713326940:
                case -166295339:
                    if (C1826.f6190 <= 0) {
                        iM3169 = C0773.m3169("ۛ᩻") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-2637)) ^ (-1955430300);
                        i6 = -280706489;
                    } else {
                        iM3169 = (i3 - C0773.m3169("᩹᩵")) * 31;
                        i5 = ((iM3169 ^ i4) * 5753) ^ 1212829399;
                        i6 = 1823327925;
                    }
                    break;
                case -704939716:
                case 72694222:
                    if (C2375.f7641 > 0) {
                        iM3169 = (C0619.m2761("ۢۖ") + i4) * (-63);
                        i5 = ((iM3169 ^ i3) * (-26701)) ^ 219486180;
                        i6 = 171862349;
                    } else {
                        iM3169 = C0619.m2761("ܶۨ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 26283) ^ (-1838048845);
                        i6 = -317771402;
                    }
                    break;
                case -151428581:
                case 115056966:
                    if (C17202.f56030) {
                        iM3169 = (C0773.m3169("᩶ۗ") ^ i4) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i5 = ((iM3169 ^ i3) * 15891) ^ 991487484;
                        i6 = -1202105698;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ᩴ֨")) * 5;
                        i5 = ((iM3169 ^ i4) * 25185) ^ 457228082;
                        i6 = -1237608875;
                    }
                    break;
                case -87322562:
                case 259822342:
                    c10139.m26166(str, i, z, z2);
                    break;
                case 267496614:
                case 1630957929:
                    if (C23916.f77426 <= 0) {
                        iM3169 = C0619.m2761("᩻۟") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-15545)) ^ (-590824271);
                        i6 = 1592002182;
                    } else {
                        iM3169 = (C0773.m3169("ۡܶ") ^ i3) * (-107);
                        i5 = ((iM3169 ^ i4) * (-22543)) ^ 862061236;
                        i6 = -425482517;
                    }
                    break;
                case 1815706856:
                case 1962915227:
                    if (RunnableC3055.m9933() != 0) {
                        iM3169 = C0619.m2761("᩻۟") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-15545)) ^ (-590824271);
                        i6 = 1592002182;
                    } else {
                        iM3169 = (i3 - C0773.m3169("۠۫")) * 83;
                        i5 = ((iM3169 ^ i4) * (-20929)) ^ (-548080971);
                        i6 = -2107183708;
                    }
                    break;
                default:
                    if (C0862.f3233 != 0) {
                        iM3169 = (i3 - C0773.m3169("ᩴ֨")) * 5;
                        i5 = ((iM3169 ^ i4) * 25185) ^ 457228082;
                        i6 = -1237608875;
                    } else {
                        iM3169 = (C0619.m2761("ܽᩳ") + i4) * (-29);
                        i5 = ((iM3169 ^ i3) * (-7673)) ^ 1828085722;
                        i6 = -754069429;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x01e3 A[PHI: r7
      0x01e3: PHI (r7v42 android.view.View) = (r7v34 android.view.View), (r7v2 android.view.View), (r7v2 android.view.View) binds: [B:45:0x01e1, B:18:0x00ad, B:126:0x01e3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    private void m26186() {
        int i;
        int iM2761;
        int i2;
        int i3;
        int iM2762;
        int i4;
        int i5;
        View view;
        int iM2763;
        int i6;
        int i7;
        int iM3169;
        int i8;
        int i9;
        int iM31610;
        int i10;
        final C10139 c10139 = this;
        int i11 = C2966.f9654;
        int i12 = C3448.f11240;
        int iM2764 = (i11 - C0619.m2761("ۖᩴ")) * (-111);
        int i13 = ((iM2764 ^ i12) * 32073) ^ 42135695;
        String str = null;
        short[] sArr = null;
        int i14 = iM2764 ^ (-1619378566);
        int iM2765 = 0;
        int iM31611 = 0;
        short s = 0;
        int i15 = 0;
        int i16 = -1153812407;
        FrameLayout frameLayout = null;
        LayoutInflater layoutInflater = null;
        C20729 c20729 = null;
        int i17 = 0;
        C25227 c25227 = null;
        C20729 c207210 = null;
        long j = 0;
        C20729 c207211 = null;
        View view2 = null;
        View view3 = null;
        View viewM2061 = null;
        int i18 = 0;
        while (true) {
            i16 = i14 ^ (i13 & (((i16 ^ i12) * (-32091)) >> 31));
            switch (i16) {
                case -2075341178:
                case 402369848:
                    i = i18;
                    view2 = view2;
                    layoutInflater = layoutInflater;
                    i17 = i17;
                    frameLayout = c10139.f32446;
                    View view4 = new View(C3998.m12922(frameLayout));
                    c10139.f32476 = view4;
                    C3077.m10046(view4, 1711276032);
                    if (C2287.f7432 >= 0) {
                        iM2762 = (C0773.m3169("۬ۛ") + i11) * (-117);
                        i2 = ((iM2762 ^ i12) * (-17627)) ^ 921908860;
                        i4 = -2070776832;
                    } else {
                        iM2762 = (i11 - C0773.m3169("ۤᩳ")) * 7;
                        i2 = ((iM2762 ^ i12) * 20803) ^ (-412296986);
                        i4 = -277967956;
                    }
                    i5 = iM2762 ^ i4;
                    i18 = i;
                    frameLayout = frameLayout;
                    view = view2;
                    i14 = i5;
                    i13 = i2;
                    i17 = i17;
                    layoutInflater = layoutInflater;
                    view2 = view;
                    break;
                case -1953015253:
                case 1088070991:
                    View view5 = view2;
                    frameLayout = frameLayout;
                    i = i18;
                    short s2 = f32436[382];
                    int iM2766 = (i11 - C0619.m2761("֨᩷")) * (-47);
                    s = s2;
                    i15 = s2 + 18684;
                    i17 = i17;
                    i13 = ((iM2766 ^ i12) * (-23209)) ^ 1946566279;
                    layoutInflater = layoutInflater;
                    view2 = view5;
                    c10139 = this;
                    i14 = iM2766 ^ 934161323;
                    i18 = i;
                    frameLayout = frameLayout;
                    break;
                case -1867370960:
                case 2013851038:
                    if (C13473.f42873 == 0) {
                        view2 = view2;
                        layoutInflater = layoutInflater;
                        frameLayout = frameLayout;
                        i = i18;
                        iM2763 = (C0773.m3169("ܺᩳ") + i11) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i6 = ((iM2763 ^ i12) * (-13107)) ^ (-115531910);
                        i7 = -158746365;
                        int i19 = iM2763 ^ i7;
                        layoutInflater = layoutInflater;
                        view2 = view2;
                        i14 = i19;
                        i13 = i6;
                        i18 = i;
                        frameLayout = frameLayout;
                    } else {
                        iM31610 = C0773.m3169("ᩳۖ") ^ i12;
                        i8 = ((iM31610 ^ i11) * 11537) ^ 107498234;
                        i10 = 1327676198;
                        i14 = iM31610 ^ i10;
                        i13 = i8;
                    }
                    break;
                case -1531356096:
                case -1312949512:
                    view2 = view2;
                    layoutInflater = layoutInflater;
                    frameLayout = frameLayout;
                    i17 = i17;
                    i = i18;
                    C2375.m8070(c10139.f32476, new ViewOnClickListenerC18592(1, c10139));
                    if (!RunnableC0334.m2063()) {
                        iM2762 = C0619.m2761("ۖܿ") ^ i12;
                        i2 = ((iM2762 ^ i11) * 22943) ^ (-1992138430);
                        i4 = -1731343659;
                        i5 = iM2762 ^ i4;
                        i18 = i;
                        frameLayout = frameLayout;
                        view = view2;
                        i14 = i5;
                        i13 = i2;
                        i17 = i17;
                        layoutInflater = layoutInflater;
                        view2 = view;
                    } else {
                        i17 = i17;
                        iM2763 = (C0773.m3169("ܺᩳ") + i11) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i6 = ((iM2763 ^ i12) * (-13107)) ^ (-115531910);
                        i7 = -158746365;
                        int i110 = iM2763 ^ i7;
                        layoutInflater = layoutInflater;
                        view2 = view2;
                        i14 = i110;
                        i13 = i6;
                        i18 = i;
                        frameLayout = frameLayout;
                    }
                    break;
                case -1509728125:
                case 81467934:
                    break;
                case -1486340797:
                case 1720572863:
                    C2702.m8876();
                    if (!C2878.f9462) {
                        iM31610 = (C0773.m3169("ۛ᩶") ^ i12) * (-45);
                        i8 = ((iM31610 ^ i11) * 14381) ^ (-450013557);
                        i10 = 1027858710;
                        i14 = iM31610 ^ i10;
                        i13 = i8;
                    } else {
                        view2 = view2;
                        layoutInflater = layoutInflater;
                        frameLayout = frameLayout;
                        i17 = i17;
                        i = i18;
                        iM2762 = (C0773.m3169("۬ۛ") + i11) * (-117);
                        i2 = ((iM2762 ^ i12) * (-17627)) ^ 921908860;
                        i4 = -2070776832;
                        i5 = iM2762 ^ i4;
                        i18 = i;
                        frameLayout = frameLayout;
                        view = view2;
                        i14 = i5;
                        i13 = i2;
                        i17 = i17;
                        layoutInflater = layoutInflater;
                        view2 = view;
                    }
                    break;
                case -1459913370:
                case 386058727:
                    c207211.m53001();
                    j = 180;
                    c10139.f32460.m10754(180L);
                    c207210 = c10139.f32460;
                    if (C0950.f3488 < 0) {
                        iM31610 = C0619.m2761("֫ܽ") ^ i11;
                        i8 = ((iM31610 ^ i12) * 12845) ^ 57151880;
                        i10 = -1110313604;
                        i14 = iM31610 ^ i10;
                        i13 = i8;
                    } else {
                        view2 = view2;
                        layoutInflater = layoutInflater;
                        frameLayout = frameLayout;
                        i = i18;
                        iM2763 = (C0773.m3169("ܺᩳ") + i11) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i6 = ((iM2763 ^ i12) * (-13107)) ^ (-115531910);
                        i7 = -158746365;
                        int i111 = iM2763 ^ i7;
                        layoutInflater = layoutInflater;
                        view2 = view2;
                        i14 = i111;
                        i13 = i6;
                        i18 = i;
                        frameLayout = frameLayout;
                    }
                    break;
                case -1266213338:
                case -1108432678:
                    C1343.m4943();
                    C3033.m9845();
                    iM31610 = (C0773.m3169("ۛ᩶") ^ i12) * (-45);
                    i8 = ((iM31610 ^ i11) * 14381) ^ (-450013557);
                    i10 = 1027858710;
                    i14 = iM31610 ^ i10;
                    i13 = i8;
                    break;
                case -1217696690:
                case 550405709:
                    c207210.m10769(j);
                    c10139.f32460.m10761(220L);
                    c25227 = c10139.f32450;
                    c20729 = c10139.f32460;
                    iM31610 = C0619.m2761("ܶ۠") ^ i12;
                    i8 = ((iM31610 ^ i11) * (-21383)) ^ 437604881;
                    i10 = 446163518;
                    i14 = iM31610 ^ i10;
                    i13 = i8;
                    break;
                case -1021825848:
                case 195992098:
                    i18 = 28273;
                    iM2761 = (C0619.m2761("ܽۜ") + i11) * 127;
                    i2 = ((iM2761 ^ i12) * (-30651)) ^ (-1306786395);
                    i3 = -2128792796;
                    i5 = iM2761 ^ i3;
                    frameLayout = frameLayout;
                    view = view2;
                    i14 = i5;
                    i13 = i2;
                    i17 = i17;
                    layoutInflater = layoutInflater;
                    view2 = view;
                    break;
                case -1002474997:
                case 617824139:
                    view2 = view2;
                    frameLayout = frameLayout;
                    layoutInflater = layoutInflater;
                    viewM2061 = RunnableC0334.m2061(layoutInflater, C0619.m2761(str) ^ 2121106072, frameLayout, false);
                    if (!C3779.m12264()) {
                        i = i18;
                        iM2763 = (C0773.m3169("ܺᩳ") + i11) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i6 = ((iM2763 ^ i12) * (-13107)) ^ (-115531910);
                        i7 = -158746365;
                        int i112 = iM2763 ^ i7;
                        layoutInflater = layoutInflater;
                        view2 = view2;
                        i14 = i112;
                        i13 = i6;
                        i18 = i;
                        frameLayout = frameLayout;
                    } else {
                        iM2761 = (C0619.m2761("ۡۜ") ^ i12) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i17 = i17;
                        i2 = ((iM2761 ^ i11) * 5673) ^ (-919456630);
                        i3 = 1439607251;
                        i5 = iM2761 ^ i3;
                        frameLayout = frameLayout;
                        view = view2;
                        i14 = i5;
                        i13 = i2;
                        i17 = i17;
                        layoutInflater = layoutInflater;
                        view2 = view;
                    }
                    break;
                case -864699633:
                case 51906890:
                    view2 = view2;
                    iM2765 = C0619.m2761(C1146.m4222(sArr, 386, 3, i18));
                    if (C2702.f8586 <= 0) {
                        iM3169 = C0773.m3169("ۧ֨") ^ i12;
                        i8 = ((iM3169 ^ i11) * (-5097)) ^ 782994482;
                        i9 = -1874752871;
                    } else {
                        iM3169 = C0773.m3169("۠᩺") ^ i11;
                        i8 = ((iM3169 ^ i12) * (-11351)) ^ 836904181;
                        i9 = 1306048182;
                    }
                    int i20 = iM3169 ^ i9;
                    view2 = view2;
                    i14 = i20;
                    i13 = i8;
                    break;
                case -814551950:
                case -690554606:
                    i18 = 50756;
                    iM2761 = (C0619.m2761("ܽۜ") + i11) * 127;
                    i2 = ((iM2761 ^ i12) * (-30651)) ^ (-1306786395);
                    i3 = -2128792796;
                    i5 = iM2761 ^ i3;
                    frameLayout = frameLayout;
                    view = view2;
                    i14 = i5;
                    i13 = i2;
                    i17 = i17;
                    layoutInflater = layoutInflater;
                    view2 = view;
                    break;
                case -792224529:
                case -591699123:
                    C2375.m8070(C2834.m9333(view3, 2098069587 ^ iM2765), new View.OnClickListener() { // from class: l.ܽ۬֫
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view6) {
                            this.f57132.m26210();
                        }
                    });
                    view2 = c10139.f32441;
                    if (C3998.m12920()) {
                        iM31610 = C0773.m3169("ۘ֡") ^ i12;
                        i8 = ((iM31610 ^ i11) * 25143) ^ (-382126843);
                        i10 = -1888009944;
                    } else {
                        iM31610 = C0773.m3169("ᩳۖ") ^ i12;
                        i8 = ((iM31610 ^ i11) * 11537) ^ 107498234;
                        i10 = 1327676198;
                    }
                    i14 = iM31610 ^ i10;
                    i13 = i8;
                    break;
                case -786870858:
                case 1732125767:
                    view2 = view2;
                    iM31611 = C0773.m3169(C2834.m9343(f32436, 389, 3, i18));
                    if (C2966.f9654 < 0) {
                        iM3169 = (i12 - C0773.m3169("ᩴۘ")) * 99;
                        i8 = ((iM3169 ^ i11) * (-27587)) ^ (-1014160707);
                        i9 = -966521039;
                        int i21 = iM3169 ^ i9;
                        view2 = view2;
                        i14 = i21;
                        i13 = i8;
                    } else {
                        layoutInflater = layoutInflater;
                        frameLayout = frameLayout;
                        i = i18;
                        iM2763 = (C0773.m3169("ܺᩳ") + i11) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i6 = ((iM2763 ^ i12) * (-13107)) ^ (-115531910);
                        i7 = -158746365;
                        int i113 = iM2763 ^ i7;
                        layoutInflater = layoutInflater;
                        view2 = view2;
                        i14 = i113;
                        i13 = i6;
                        i18 = i;
                        frameLayout = frameLayout;
                    }
                    break;
                case -731109433:
                case 1915281626:
                    view2 = view2;
                    layoutInflater = layoutInflater;
                    frameLayout = frameLayout;
                    i17 = i17;
                    i = i18;
                    if (c10139.f32441 != null) {
                        iM2762 = (C0773.m3169("ᩴ۟") ^ i11) * 41;
                        i2 = ((iM2762 ^ i12) * (-355)) ^ (-1324800565);
                        i4 = 763348854;
                    } else {
                        iM2762 = C0619.m2761("ۗۖ") ^ i12;
                        i2 = ((iM2762 ^ i11) * (-173)) ^ 667171056;
                        i4 = -5059775;
                    }
                    i5 = iM2762 ^ i4;
                    i18 = i;
                    frameLayout = frameLayout;
                    view = view2;
                    i14 = i5;
                    i13 = i2;
                    i17 = i17;
                    layoutInflater = layoutInflater;
                    view2 = view;
                    break;
                case -675618041:
                case 1312177095:
                    if (C3779.m12264()) {
                        iM31610 = (C0773.m3169("ۛ᩶") ^ i12) * (-45);
                        i8 = ((iM31610 ^ i11) * 14381) ^ (-450013557);
                        i10 = 1027858710;
                    } else {
                        iM31610 = C0773.m3169("ᩳۖ") ^ i12;
                        i8 = ((iM31610 ^ i11) * 11537) ^ 107498234;
                        i10 = 1327676198;
                    }
                    i14 = iM31610 ^ i10;
                    i13 = i8;
                    break;
                case -519331596:
                case -220286734:
                    c25227.setItemAnimator(c20729);
                    c10139.f32450.addOnScrollListener(new C6412(c10139));
                    break;
                case -294857254:
                case -250413206:
                    view2 = view2;
                    layoutInflater = layoutInflater;
                    frameLayout = frameLayout;
                    i17 = i17;
                    i = i18;
                    C2375.m8066(frameLayout, c10139.f32476, new FrameLayout.LayoutParams(-1, -1));
                    if (C3734.f12817 < 0) {
                        iM2762 = (C0773.m3169("᩹ܺ") ^ i11) * 89;
                        i2 = ((iM2762 ^ i12) * (-887)) ^ 1890912533;
                        i4 = -1227763351;
                        i5 = iM2762 ^ i4;
                        i18 = i;
                        frameLayout = frameLayout;
                        view = view2;
                        i14 = i5;
                        i13 = i2;
                        i17 = i17;
                        layoutInflater = layoutInflater;
                        view2 = view;
                    } else {
                        i17 = i17;
                        iM2763 = (C0773.m3169("ܺᩳ") + i11) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i6 = ((iM2763 ^ i12) * (-13107)) ^ (-115531910);
                        i7 = -158746365;
                        int i114 = iM2763 ^ i7;
                        layoutInflater = layoutInflater;
                        view2 = view2;
                        i14 = i114;
                        i13 = i6;
                        i18 = i;
                        frameLayout = frameLayout;
                    }
                    break;
                case 41111108:
                case 1318210589:
                    C1826.m6315(c10139.f32450, c10139.f32475);
                    c207211 = new C20729();
                    c10139.f32460 = c207211;
                    iM31610 = C0773.m3169("ܳ᩷") ^ i12;
                    i8 = ((iM31610 ^ i11) * 29047) ^ 99794486;
                    i10 = -11825947;
                    i14 = iM31610 ^ i10;
                    i13 = i8;
                    break;
                case 117306668:
                case 1887743322:
                    view2 = view2;
                    layoutInflater = layoutInflater;
                    frameLayout = frameLayout;
                    i = i18;
                    c10139.f32476.setImportantForAccessibility(2);
                    i17 = 8;
                    C13473.m33140(c10139.f32476, 8);
                    if (C13473.f42873 != 0) {
                        iM2763 = (C0773.m3169("ܺᩳ") + i11) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i6 = ((iM2763 ^ i12) * (-13107)) ^ (-115531910);
                        i7 = -158746365;
                    } else {
                        iM2763 = (C0619.m2761("ۢۚ") + i11) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i6 = ((iM2763 ^ i12) * 25199) ^ 2016697541;
                        i7 = -919350121;
                    }
                    int i115 = iM2763 ^ i7;
                    layoutInflater = layoutInflater;
                    view2 = view2;
                    i14 = i115;
                    i13 = i6;
                    i18 = i;
                    frameLayout = frameLayout;
                    break;
                case 354427191:
                case 853348987:
                    c10139.f32450 = (C25227) C2834.m9333(view2, iM31611 ^ 2099453228);
                    C0445 c0445 = new C0445(c10139);
                    c10139.f32470 = c0445;
                    c10139.f32450.setLayoutManager(c0445);
                    if (RunnableC3055.m9933() == 0) {
                        iM31610 = (i11 - C0773.m3169("ۜ᩻")) * 35;
                        i8 = ((iM31610 ^ i12) * 6829) ^ (-1021566245);
                        i10 = 900011121;
                        i14 = iM31610 ^ i10;
                        i13 = i8;
                    } else {
                        view2 = view2;
                        layoutInflater = layoutInflater;
                        frameLayout = frameLayout;
                        i = i18;
                        iM2763 = (C0773.m3169("ܺᩳ") + i11) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i6 = ((iM2763 ^ i12) * (-13107)) ^ (-115531910);
                        i7 = -158746365;
                        int i116 = iM2763 ^ i7;
                        layoutInflater = layoutInflater;
                        view2 = view2;
                        i14 = i116;
                        i13 = i6;
                        i18 = i;
                        frameLayout = frameLayout;
                    }
                    break;
                case 375350449:
                case 1205470126:
                    C1519.m5403();
                    AbstractC0641.m2813();
                    break;
                case 700811451:
                case 819559098:
                    int i22 = i17;
                    FrameLayout frameLayout2 = frameLayout;
                    LayoutInflater layoutInflaterFrom = LayoutInflater.from(C3998.m12922(frameLayout2));
                    String strM8350 = C2485.m8350(f32436, 383, 3, i18);
                    int iM2767 = (C0619.m2761("ᩴܰ") + i12) * 15;
                    frameLayout = frameLayout2;
                    str = strM8350;
                    i13 = ((iM2767 ^ i11) * (-749)) ^ (-1509140153);
                    view2 = view2;
                    i14 = iM2767 ^ (-1202603595);
                    i17 = i22;
                    layoutInflater = layoutInflaterFrom;
                    break;
                case 1130743596:
                case 1827759930:
                    c10139.f32441 = viewM2061;
                    C13473.m33140(viewM2061, i17);
                    FrameLayout frameLayout3 = frameLayout;
                    C1564.m5507(frameLayout3, c10139.f32441);
                    view3 = c10139.f32441;
                    sArr = f32436;
                    int iM31612 = C0773.m3169("۬ۨ") ^ i11;
                    frameLayout = frameLayout3;
                    view = view2;
                    i14 = iM31612 ^ 1365943216;
                    i13 = ((iM31612 ^ i12) * 20119) ^ 1400363770;
                    view2 = view;
                    break;
                default:
                    view2 = view2;
                    layoutInflater = layoutInflater;
                    frameLayout = frameLayout;
                    i17 = i17;
                    i = i18;
                    if ((74736 * s) - (i15 * i15) <= 0) {
                        iM2762 = C0773.m3169("᩻ܳ") ^ i12;
                        i2 = ((iM2762 ^ i11) * 6561) ^ (-690004361);
                        i4 = -471590244;
                    } else {
                        iM2762 = C0619.m2761("۬᩹") ^ i12;
                        i2 = ((iM2762 ^ i11) * (-13511)) ^ 799195720;
                        i4 = 658219481;
                    }
                    i5 = iM2762 ^ i4;
                    i18 = i;
                    frameLayout = frameLayout;
                    view = view2;
                    i14 = i5;
                    i13 = i2;
                    i17 = i17;
                    layoutInflater = layoutInflater;
                    view2 = view;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m26206() {
        ArrayList arrayList = null;
        boolean zM10097 = false;
        int i = 227437291;
        int i2 = RunnableC0334.f1808;
        int i3 = C2288.f7433;
        int iM3169 = C0773.m3169("᩷ᩳ") ^ i2;
        int i4 = ((iM3169 ^ i3) * 16371) ^ (-600351480);
        int i5 = -667245083;
        while (true) {
            i = ((((i ^ i3) * 14253) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2108555064:
                case 1274861530:
                    if (C11235.m28309() != 0) {
                        iM3169 = (i2 - C0773.m3169("ᩳۡ")) * (-51);
                        i4 = ((iM3169 ^ i3) * (-22477)) ^ (-1236257148);
                        i5 = -475767718;
                    } else {
                        iM3169 = (i2 - C0773.m3169("᩻ܺ")) * 13;
                        i4 = ((iM3169 ^ i3) * 15479) ^ (-1767210925);
                        i5 = 642589225;
                    }
                    break;
                case -1934480451:
                case -1207926392:
                    C13473.m33144();
                    RunnableC0334.m2063();
                    return false;
                case -1830296750:
                case -488744348:
                    zM10097 = C3099.m10097(arrayList);
                    if (C2375.f7641 <= 0) {
                        iM3169 = C0619.m2761("ۙ᩶") ^ i3;
                        i4 = ((iM3169 ^ i2) * 26411) ^ (-684641698);
                        i5 = 1745268479;
                    } else {
                        iM3169 = C0773.m3169("ۗۙ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 16951) ^ 35921572;
                        i5 = 861774126;
                    }
                    break;
                case -1663516455:
                case -1656541215:
                    if (C1080.f3865 >= 0) {
                        iM3169 = C0773.m3169("ۡۡ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-1887)) ^ (-1897066491);
                        i5 = -1864449319;
                    } else {
                        iM3169 = C0619.m2761("ۗۨ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 21909) ^ 1082881540;
                        i5 = -1296365210;
                    }
                    break;
                case -1618858669:
                case -225691228:
                    if (!C2023.f6737) {
                        iM3169 = (i2 - C0773.m3169("ᩳۡ")) * (-51);
                        i4 = ((iM3169 ^ i3) * (-22477)) ^ (-1236257148);
                        i5 = -475767718;
                    } else {
                        iM3169 = C0773.m3169("ܺ֫") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-4601)) ^ (-1913617216);
                        i5 = -1916822794;
                    }
                    break;
                case -1577321476:
                case -1325105941:
                    if (AbstractC0116.f1064 <= 0) {
                        iM3169 = C0619.m2761("ۙ᩶") ^ i3;
                        i4 = ((iM3169 ^ i2) * 26411) ^ (-684641698);
                        i5 = 1745268479;
                    } else {
                        iM3169 = (C0773.m3169("᩹ۜ") + i2) * (-53);
                        i4 = ((iM3169 ^ i3) * (-17337)) ^ (-1028233171);
                        i5 = -2137054755;
                    }
                    break;
                case -1463767145:
                case 1112162723:
                    C2354.m7983();
                    if (C1542.m5459() >= 0) {
                        iM3169 = C0773.m3169("ۛ᩵") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-31851)) ^ 186438336;
                        i5 = -952514526;
                    } else {
                        iM3169 = C0773.m3169("ܺ֫") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-4601)) ^ (-1913617216);
                        i5 = -1916822794;
                    }
                    break;
                case -1227708485:
                case 956028763:
                    if (AbstractC0641.f2496 >= 0) {
                        iM3169 = C0773.m3169("ܺ֫") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-4601)) ^ (-1913617216);
                        i5 = -1916822794;
                    } else {
                        iM3169 = (C0619.m2761("ۚۚ") ^ i2) * (-45);
                        i4 = ((iM3169 ^ i3) * (-25063)) ^ (-1827952238);
                        i5 = 255091989;
                    }
                    break;
                case -789973814:
                case 1332761937:
                    if (AbstractC0641.f2496 >= 0) {
                        iM3169 = (i2 - C0773.m3169("ᩳۡ")) * (-51);
                        i4 = ((iM3169 ^ i3) * (-22477)) ^ (-1236257148);
                        i5 = -475767718;
                    } else {
                        iM3169 = (i2 - C0773.m3169("᩷᩹")) * (-117);
                        i4 = ((iM3169 ^ i3) * (-20155)) ^ 1204372794;
                        i5 = 1490218306;
                    }
                    break;
                case -345409372:
                case 173303583:
                    if (C2375.f7641 <= 0) {
                        iM3169 = C0773.m3169("ۡۡ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-1887)) ^ (-1897066491);
                        i5 = -1864449319;
                    } else {
                        iM3169 = (i2 - C0773.m3169("ᩳۡ")) * (-51);
                        i4 = ((iM3169 ^ i3) * (-22477)) ^ (-1236257148);
                        i5 = -475767718;
                    }
                    break;
                case -309979658:
                case 520395252:
                    arrayList = this.f32474;
                    if (C2354.f7599 >= 0) {
                        iM3169 = C0619.m2761("ۙ᩶") ^ i3;
                        i4 = ((iM3169 ^ i2) * 26411) ^ (-684641698);
                        i5 = 1745268479;
                    } else {
                        iM3169 = C0773.m3169("۬ܿ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 23777) ^ (-84842047);
                        i5 = 1521036757;
                    }
                    break;
                case -218683453:
                case 793854424:
                    if (C0269.f1558 <= 0) {
                        iM3169 = (i2 - C0773.m3169("ᩳۡ")) * (-51);
                        i4 = ((iM3169 ^ i3) * (-22477)) ^ (-1236257148);
                        i5 = -475767718;
                    } else {
                        iM3169 = C0773.m3169("۟۟") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-29173)) ^ 1277292496;
                        i5 = -2138265895;
                    }
                    break;
                case -100137289:
                case 115508483:
                    return !zM10097;
                case 299653067:
                case 1577831643:
                    if (C1080.f3865 >= 0) {
                        iM3169 = C0619.m2761("ۙ᩶") ^ i3;
                        i4 = ((iM3169 ^ i2) * 26411) ^ (-684641698);
                        i5 = 1745268479;
                    } else {
                        iM3169 = (C0773.m3169("ᩴۜ") ^ i3) * 29;
                        i4 = ((iM3169 ^ i2) * (-13149)) ^ (-303086415);
                        i5 = 207690841;
                    }
                    break;
                case 672232941:
                case 1758805741:
                    if (C3099.f10023 <= 0) {
                        iM3169 = C0773.m3169("ۛ᩵") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-31851)) ^ 186438336;
                        i5 = -952514526;
                    } else {
                        iM3169 = (C0619.m2761("ܶܶ") + i3) * 67;
                        i4 = ((iM3169 ^ i2) * (-16833)) ^ 144986559;
                        i5 = 440879723;
                    }
                    break;
                default:
                    RunnableC1848.m6360();
                    C3998.m12920();
                    iM3169 = C0773.m3169("ܺ֫") ^ i2;
                    i4 = ((iM3169 ^ i3) * (-4601)) ^ (-1913617216);
                    i5 = -1916822794;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m26209() {
        int i = -2086177183;
        int i2 = C3492.f12043;
        int i3 = AbstractC3624.f12429;
        int iM2761 = C0619.m2761("ۚۧ") ^ i2;
        int i4 = ((iM2761 ^ i3) * 24705) ^ (-1588216431);
        int i5 = 1601512467;
        while (true) {
            i = ((((i ^ i3) * 32253) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2073595773:
                case -2007174428:
                    if (C3998.f13671 != 0) {
                        iM2761 = C0619.m2761("ۡۙ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-11535)) ^ 1312284381;
                        i5 = 1222880337;
                    } else {
                        iM2761 = C0619.m2761("۟ۜ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 17349) ^ 792121351;
                        i5 = -1369904974;
                    }
                    break;
                case -2058316022:
                case 1972011916:
                    if (C0950.f3488 >= 0) {
                        iM2761 = C0619.m2761("ۡۙ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-11535)) ^ 1312284381;
                        i5 = 1222880337;
                    } else {
                        iM2761 = C0773.m3169("ܿܿ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 163) ^ 1886622362;
                        i5 = 773226924;
                    }
                    break;
                case -2051862522:
                case -1826692806:
                    return true;
                case -1975657226:
                case 2029226825:
                    if (C2419.f7754 >= 0) {
                        iM2761 = C0619.m2761("ۡۙ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-11535)) ^ 1312284381;
                        i5 = 1222880337;
                    } else {
                        iM2761 = (C0773.m3169("ۧۘ") ^ i3) * q.h;
                        i4 = ((iM2761 ^ i2) * (-22953)) ^ 22822088;
                        i5 = 868262492;
                    }
                    break;
                case -1875724074:
                case 1088899239:
                    if (C2878.f9462) {
                        iM2761 = C0619.m2761("ۡۙ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-11535)) ^ 1312284381;
                        i5 = 1222880337;
                    } else {
                        iM2761 = (C0619.m2761("ܺ۠") + i3) * (-95);
                        i4 = ((iM2761 ^ i2) * 8341) ^ 1676260615;
                        i5 = 1214591826;
                    }
                    break;
                case -1859223693:
                case 1572884678:
                    if (C1146.f4234 >= 0) {
                        iM2761 = C0619.m2761("ۡۙ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-11535)) ^ 1312284381;
                        i5 = 1222880337;
                    } else {
                        iM2761 = (C0773.m3169("᩸ۗ") ^ i2) * (-17);
                        i4 = ((iM2761 ^ i3) * (-3559)) ^ 486371910;
                        i5 = 704595968;
                    }
                    break;
                case -1698552862:
                case 1328444552:
                    if (C13473.m33144()) {
                        iM2761 = C0619.m2761("᩵ۘ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-8587)) ^ (-864955467);
                        i5 = 372129807;
                    } else {
                        iM2761 = C0619.m2761("۬ۧ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 9947) ^ 1092389096;
                        i5 = 1574726780;
                    }
                    break;
                case -1416935232:
                case 438095725:
                    if (this.f32467) {
                        iM2761 = (i2 - C0773.m3169("۟ᩴ")) * (-127);
                        i4 = ((iM2761 ^ i3) * 14913) ^ 590166102;
                        i5 = 1197730402;
                    } else {
                        iM2761 = C0773.m3169("᩸ۧ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 27945) ^ (-1500236756);
                        i5 = -1496052819;
                    }
                    break;
                case -1005169048:
                case -314959096:
                    if (m26210()) {
                        iM2761 = (C0773.m3169("ܳ᩹") + i3) * (-53);
                        i4 = ((iM2761 ^ i2) * (-27271)) ^ 854086381;
                        i5 = -726868246;
                    } else {
                        iM2761 = (i2 - C0773.m3169("۟ᩴ")) * (-127);
                        i4 = ((iM2761 ^ i3) * 14913) ^ 590166102;
                        i5 = 1197730402;
                    }
                    break;
                case -698969622:
                case -380476158:
                    C0950.m3785();
                    C1080.m4050();
                    iM2761 = C0619.m2761("۬ۧ") ^ i2;
                    i4 = ((iM2761 ^ i3) * 9947) ^ 1092389096;
                    i5 = 1574726780;
                    break;
                case -441116507:
                case 807086196:
                    if (C3448.f11240 >= 0) {
                        iM2761 = C0619.m2761("۬᩹") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-1167)) ^ 1409675191;
                        i5 = 991559890;
                    } else {
                        iM2761 = (i2 - C0773.m3169("ܳ֫")) * 83;
                        i4 = ((iM2761 ^ i3) * (-21537)) ^ 1531798106;
                        i5 = -752751645;
                    }
                    break;
                case 51272579:
                case 1235844917:
                    if (C3492.f12043 <= 0) {
                        iM2761 = C0619.m2761("۬ۧ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 9947) ^ 1092389096;
                        i5 = 1574726780;
                    } else {
                        iM2761 = C0619.m2761("ۘ۟") ^ i2;
                        i4 = ((iM2761 ^ i3) * 22521) ^ 996515596;
                        i5 = -979315164;
                    }
                    break;
                case 397756155:
                case 1560560190:
                    C1826.m6301();
                    if (C2375.f7641 <= 0) {
                        iM2761 = C0619.m2761("ۡۙ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-11535)) ^ 1312284381;
                        i5 = 1222880337;
                    } else {
                        iM2761 = C0619.m2761("۬ۧ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 9947) ^ 1092389096;
                        i5 = 1574726780;
                    }
                    break;
                case 448211089:
                case 552667763:
                    if (C2702.m8876()) {
                        iM2761 = C0619.m2761("ۛۖ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-10329)) ^ 431101711;
                        i5 = -1752090863;
                    } else {
                        iM2761 = C0773.m3169("ܰ۟") ^ i3;
                        i4 = ((iM2761 ^ i2) * 325) ^ (-1877020519);
                        i5 = 1549306014;
                    }
                    break;
                case 658646159:
                case 686583062:
                    if (!C2354.m7983()) {
                        iM2761 = C0773.m3169("ܰ۟") ^ i3;
                        i4 = ((iM2761 ^ i2) * 325) ^ (-1877020519);
                        i5 = 1549306014;
                    } else {
                        iM2761 = C0619.m2761("۬ۧ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 9947) ^ 1092389096;
                        i5 = 1574726780;
                    }
                    break;
                case 1038154373:
                case 1425533078:
                    if (C23916.m53419() != 0) {
                        iM2761 = C0773.m3169("ܰ۟") ^ i3;
                        i4 = ((iM2761 ^ i2) * 325) ^ (-1877020519);
                        i5 = 1549306014;
                    } else {
                        iM2761 = C0619.m2761("ۨۖ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 21175) ^ 920799188;
                        i5 = -1043321902;
                    }
                    break;
                case 1136135496:
                case 1283679127:
                    if (C3734.f12817 >= 0) {
                        iM2761 = C0619.m2761("۬᩹") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-1167)) ^ 1409675191;
                        i5 = 991559890;
                    } else {
                        iM2761 = (i2 - C0773.m3169("ܺ۫")) * 23;
                        i4 = ((iM2761 ^ i3) * (-24783)) ^ (-1815192973);
                        i5 = -1946935601;
                    }
                    break;
                case 1311387086:
                case 2121744782:
                    C3690.m11987();
                    return false;
                default:
                    return false;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0062  */
    /* JADX WARN: Code duplicated, block: B:49:0x0185  */
    /* JADX WARN: Code duplicated, block: B:71:0x0254 A[PHI: r2 r3 r4 r7 r8 r13
      0x0254: PHI (r2v4 int) = (r2v2 int), (r2v2 int), (r2v3 int), (r2v2 int) binds: [B:70:0x0252, B:66:0x0235, B:32:0x00fe, B:28:0x00da] A[DONT_GENERATE, DONT_INLINE]
      0x0254: PHI (r3v4 int) = (r3v2 int), (r3v2 int), (r3v3 int), (r3v2 int) binds: [B:70:0x0252, B:66:0x0235, B:32:0x00fe, B:28:0x00da] A[DONT_GENERATE, DONT_INLINE]
      0x0254: PHI (r4v4 android.webkit.WebView) = 
      (r4v2 android.webkit.WebView)
      (r4v2 android.webkit.WebView)
      (r4v3 android.webkit.WebView)
      (r4v2 android.webkit.WebView)
     binds: [B:70:0x0252, B:66:0x0235, B:32:0x00fe, B:28:0x00da] A[DONT_GENERATE, DONT_INLINE]
      0x0254: PHI (r7v4 short) = (r7v3 short), (r7v2 short), (r7v2 short), (r7v2 short) binds: [B:70:0x0252, B:66:0x0235, B:32:0x00fe, B:28:0x00da] A[DONT_GENERATE, DONT_INLINE]
      0x0254: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:70:0x0252, B:66:0x0235, B:32:0x00fe, B:28:0x00da] A[DONT_GENERATE, DONT_INLINE]
      0x0254: PHI (r13v3 short[]) = (r13v2 short[]), (r13v2 short[]), (r13v2 short[]), (r13v4 short[]) binds: [B:70:0x0252, B:66:0x0235, B:32:0x00fe, B:28:0x00da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x0289 A[PHI: r6 r11
      0x0289: PHI (r6v4 char) = (r6v3 char), (r6v2 char), (r6v2 char) binds: [B:74:0x0287, B:58:0x01f5, B:9:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x0289: PHI (r11v4 int) = (r11v2 int), (r11v3 int), (r11v2 int) binds: [B:74:0x0287, B:58:0x01f5, B:9:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:79:0x02b9 A[PHI: r9 r10 r14 r15 r20
      0x02b9: PHI (r9v4 int) = (r9v2 int), (r9v3 int), (r9v2 int), (r9v2 int), (r9v2 int), (r9v2 int), (r9v2 int) binds: [B:78:0x02b7, B:62:0x0215, B:24:0x00bc, B:20:0x00a8, B:16:0x0090, B:12:0x005e, B:6:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x02b9: PHI (r10v4 int) = (r10v2 int), (r10v3 int), (r10v2 int), (r10v2 int), (r10v2 int), (r10v2 int), (r10v2 int) binds: [B:78:0x02b7, B:62:0x0215, B:24:0x00bc, B:20:0x00a8, B:16:0x0090, B:12:0x005e, B:6:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x02b9: PHI (r14v4 int) = (r14v2 int), (r14v2 int), (r14v3 int), (r14v2 int), (r14v2 int), (r14v2 int), (r14v2 int) binds: [B:78:0x02b7, B:62:0x0215, B:24:0x00bc, B:20:0x00a8, B:16:0x0090, B:12:0x005e, B:6:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x02b9: PHI (r15v4 int) = (r15v2 int), (r15v2 int), (r15v3 int), (r15v2 int), (r15v2 int), (r15v2 int), (r15v2 int) binds: [B:78:0x02b7, B:62:0x0215, B:24:0x00bc, B:20:0x00a8, B:16:0x0090, B:12:0x005e, B:6:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x02b9: PHI (r20v5 short[]) = (r20v4 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]) binds: [B:78:0x02b7, B:62:0x0215, B:24:0x00bc, B:20:0x00a8, B:16:0x0090, B:12:0x005e, B:6:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m26167(final C10139 c10139) {
        int iM3169;
        int i;
        int i2;
        int i3 = C2310.f7472;
        int i4 = AbstractC0641.f2496;
        int iM31610 = (C0773.m3169("᩹۠") + i4) * (-123);
        int i5 = ((iM31610 ^ i3) * (-11393)) ^ (-461348110);
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM31610 ^ 1362474723;
        final int i7 = 0;
        char c = 0;
        short s = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = -469869;
        WebView webView = null;
        final int i16 = 0;
        while (true) {
            i15 = i6 ^ (i5 & (((i15 ^ i3) * (-3521)) >> 31));
            switch (i15) {
                case -1926286763:
                case -412068951:
                    C13473.m33144();
                    C0862.m3503();
                    break;
                case -1898106955:
                case -249570070:
                    i12 = 569;
                    iM3169 = (i4 - C0773.m3169("᩸۟")) * 77;
                    i = ((iM3169 ^ i3) * 20973) ^ (-468115491);
                    i2 = -405697911;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1774197867:
                case 1367489941:
                    sArr2 = f32436;
                    if (C17202.f56030) {
                        iM3169 = (i4 - C0619.m2761("۫ۤ")) * (-13);
                        i = ((iM3169 ^ i3) * (-19863)) ^ (-1827294092);
                        i2 = 1684148846;
                    } else {
                        iM3169 = (C0619.m2761("ۨܺ") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM3169 ^ i4) * 20633) ^ (-1752987636);
                        i2 = 2012008935;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1756319147:
                case -45389549:
                    i13 = 133;
                    i14 = 19;
                    if (C2878.m9491() <= 0) {
                        iM3169 = (C0619.m2761("᩷᩺") + i3) * (-57);
                        i = ((iM3169 ^ i4) * 19475) ^ 1846588574;
                        i2 = -1020142863;
                    } else {
                        iM3169 = C0619.m2761("ܽۛ") ^ i4;
                        i = ((iM3169 ^ i3) * (-16991)) ^ 310121509;
                        i2 = 1441152887;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1599259504:
                case -923506216:
                    c = 132;
                    if (RunnableC3646.f12471) {
                        iM3169 = C0619.m2761("ۢ֨") ^ i4;
                        i = ((iM3169 ^ i3) * 8959) ^ 399660984;
                        i2 = -2145470656;
                    } else {
                        iM3169 = C0773.m3169("ۖ۫") ^ i3;
                        i = ((iM3169 ^ i4) * 6893) ^ 157289723;
                        i2 = -85283093;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1497168622:
                case 1828779332:
                    i12 = 20408;
                    iM3169 = (i4 - C0773.m3169("᩸۟")) * 77;
                    i = ((iM3169 ^ i3) * 20973) ^ (-468115491);
                    i2 = -405697911;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1391607868:
                case 1154873377:
                    if (AbstractC0641.f2496 >= 0) {
                        iM3169 = (C0619.m2761("֡۫") ^ i4) * (-15);
                        i = ((iM3169 ^ i3) * 22241) ^ 1758525334;
                        i2 = -183257443;
                    } else {
                        iM3169 = C0619.m2761("ۢ֨") ^ i4;
                        i = ((iM3169 ^ i3) * 8959) ^ 399660984;
                        i2 = -2145470656;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1388650939:
                case 647278918:
                    c10139.f32439 = false;
                    if (c10139.f32463) {
                        iM3169 = C0773.m3169("ᩴ᩵") ^ i3;
                        i = ((iM3169 ^ i4) * (-11961)) ^ 411198226;
                        i2 = 2072834033;
                    } else {
                        iM3169 = C0773.m3169("ۡܺ") ^ i4;
                        i = ((iM3169 ^ i3) * (-16277)) ^ (-592035250);
                        i2 = -1686925839;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1380079063:
                case 1946274973:
                    break;
                case -1085837566:
                case 446021117:
                    i11 = 79691329;
                    if (C2834.f9334 <= 0) {
                        iM3169 = C0619.m2761("ۢ֨") ^ i4;
                        i = ((iM3169 ^ i3) * 8959) ^ 399660984;
                        i2 = -2145470656;
                    } else {
                        iM3169 = C0619.m2761("ܽ᩵") ^ i3;
                        i = ((iM3169 ^ i4) * (-21135)) ^ (-435762895);
                        i2 = -845070466;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -873649919:
                case 422619786:
                    i7 = c10139.f32468;
                    i16 = c10139.f32445;
                    webView = c10139.f32482;
                    if (C2966.f9654 >= 0) {
                        iM3169 = (C0619.m2761("ۨܺ") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM3169 ^ i4) * 20633) ^ (-1752987636);
                        i2 = 2012008935;
                    } else {
                        iM3169 = C0619.m2761("᩵ۗ") ^ i3;
                        i = ((iM3169 ^ i4) * (-20797)) ^ 1118294971;
                        i2 = -2018308658;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -823858190:
                case 296141946:
                    if (c10139.f32451) {
                        iM3169 = C0773.m3169("ᩴ᩵") ^ i3;
                        i = ((iM3169 ^ i4) * (-11961)) ^ 411198226;
                        i2 = 2072834033;
                    } else {
                        iM3169 = C0619.m2761("ۘᩴ") ^ i3;
                        i = ((iM3169 ^ i4) * (-1975)) ^ 704324053;
                        i2 = -2122979887;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -550285893:
                case 361639467:
                    String strM26161 = c10139.m26161(C3448.m11252(sArr2, i13, i14, i12));
                    if (C2354.f7599 >= 0) {
                        iM3169 = (C0619.m2761("᩷᩺") + i3) * (-57);
                        i = ((iM3169 ^ i4) * 19475) ^ 1846588574;
                        i2 = -1020142863;
                    } else {
                        webView.evaluateJavascript(strM26161, new ValueCallback(c10139) { // from class: l.᩵۬֫

                            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                            public final /* synthetic */ C10139 f65907;

                            {
                                int i17 = -2131515946;
                                int i18 = C0950.f3488;
                                int i19 = C2287.f7432;
                                int iM31611 = C0773.m3169("ۨ֡") ^ i19;
                                int i20 = ((iM31611 ^ i18) * 19421) ^ (-2080627589);
                                int i21 = 1965130073;
                                while (true) {
                                    i17 = ((((i17 ^ i18) * 23973) >> 31) & i20) ^ (iM31611 ^ i21);
                                    switch (i17) {
                                        case -1910856005:
                                        case 2067375683:
                                            C0619.m2763();
                                            if (C4282.f15546 <= 0) {
                                                iM31611 = C0773.m3169("ۗۚ") ^ i19;
                                                i20 = ((iM31611 ^ i18) * 3717) ^ 1164151000;
                                                i21 = -654232165;
                                            } else {
                                                iM31611 = C0619.m2761("᩹۫") ^ i18;
                                                i20 = ((iM31611 ^ i19) * (-11173)) ^ 1585705132;
                                                i21 = -545602004;
                                            }
                                            break;
                                        case -1756659394:
                                        case -180960023:
                                            this.f65907 = c10139;
                                            if (C0269.f1558 <= 0) {
                                                iM31611 = C0619.m2761("᩹۫") ^ i18;
                                                i20 = ((iM31611 ^ i19) * (-11173)) ^ 1585705132;
                                                i21 = -545602004;
                                            } else {
                                                iM31611 = C0773.m3169("ۡ᩺") ^ i18;
                                                i20 = ((iM31611 ^ i19) * 11889) ^ 559455554;
                                                i21 = -1950240599;
                                            }
                                            break;
                                        case -1745158519:
                                        case 1066542281:
                                            if (C23916.f77426 <= 0) {
                                                iM31611 = C0619.m2761("۬᩺") ^ i19;
                                                i20 = ((iM31611 ^ i18) * (-15197)) ^ 628201382;
                                                i21 = 1293709562;
                                            } else {
                                                iM31611 = C0619.m2761("ܶۤ") ^ i19;
                                                i20 = ((iM31611 ^ i18) * 28061) ^ (-714487200);
                                                i21 = -1317543120;
                                            }
                                            break;
                                        case -1645630795:
                                        case -1191665124:
                                            return;
                                        case -1642034794:
                                        case -562855366:
                                            if (C3734.f12817 >= 0) {
                                                iM31611 = C0773.m3169("ۗۚ") ^ i19;
                                                i20 = ((iM31611 ^ i18) * 3717) ^ 1164151000;
                                                i21 = -654232165;
                                            } else {
                                                iM31611 = (C0619.m2761("ۘܰ") ^ i19) * (-65);
                                                i20 = ((iM31611 ^ i18) * 18589) ^ 1528971700;
                                                i21 = 1582873593;
                                            }
                                            break;
                                        case -854908931:
                                        case 1763056186:
                                            RunnableC3055.m9933();
                                            throw new RuntimeException();
                                        case -817791423:
                                        case 621244676:
                                            if (C4282.m13644()) {
                                                iM31611 = (C0619.m2761("ۢۗ") ^ i18) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                                                i20 = ((iM31611 ^ i19) * (-453)) ^ 136635052;
                                                i21 = 1684551475;
                                            } else {
                                                iM31611 = (C0619.m2761("᩹֡") ^ i18) * (-119);
                                                i20 = ((iM31611 ^ i19) * 18737) ^ 2054365701;
                                                i21 = -953254969;
                                            }
                                            break;
                                        case -706919480:
                                        case 828414807:
                                            if (C0619.f2439) {
                                                iM31611 = C0619.m2761("ܺܳ") ^ i18;
                                                i20 = ((iM31611 ^ i19) * 31947) ^ (-2046556409);
                                                i21 = -493471941;
                                            } else {
                                                iM31611 = C0773.m3169("ᩴۖ") ^ i18;
                                                i20 = ((iM31611 ^ i19) * (-8027)) ^ (-633104567);
                                                i21 = -2035930755;
                                            }
                                            break;
                                        case -559960779:
                                        case 609213846:
                                            if (C1542.f5343 <= 0) {
                                                iM31611 = C0619.m2761("ܺܳ") ^ i18;
                                                i20 = ((iM31611 ^ i19) * 31947) ^ (-2046556409);
                                                i21 = -493471941;
                                            } else {
                                                iM31611 = (C0619.m2761("ۘ۫") ^ i18) * (-85);
                                                i20 = ((iM31611 ^ i19) * 29153) ^ 1104523317;
                                                i21 = 1400303776;
                                            }
                                            break;
                                        case -558905159:
                                        case 294553011:
                                            if (RunnableC1848.f6235) {
                                                iM31611 = C0619.m2761("ܺܳ") ^ i18;
                                                i20 = ((iM31611 ^ i19) * 31947) ^ (-2046556409);
                                                i21 = -493471941;
                                            } else {
                                                iM31611 = (C0773.m3169("ۛ۟") ^ i19) * 73;
                                                i20 = ((iM31611 ^ i18) * (-8345)) ^ 1164829546;
                                                i21 = -2109398755;
                                            }
                                            break;
                                        case -49924683:
                                        case 738513726:
                                            if (C2702.f8586 <= 0) {
                                                iM31611 = C0619.m2761("᩹۫") ^ i18;
                                                i20 = ((iM31611 ^ i19) * (-11173)) ^ 1585705132;
                                                i21 = -545602004;
                                            } else {
                                                iM31611 = (C0773.m3169("ܳ᩵") ^ i19) * 59;
                                                i20 = ((iM31611 ^ i18) * (-6947)) ^ (-196077868);
                                                i21 = -1604086419;
                                            }
                                            break;
                                        case 43674141:
                                        case 1975338542:
                                            C0269.m1775();
                                            if (C3734.f12817 >= 0) {
                                                iM31611 = (C0619.m2761("᩹֡") ^ i18) * (-119);
                                                i20 = ((iM31611 ^ i19) * 18737) ^ 2054365701;
                                                i21 = -953254969;
                                            } else {
                                                iM31611 = C0619.m2761("᩹۫") ^ i18;
                                                i20 = ((iM31611 ^ i19) * (-11173)) ^ 1585705132;
                                                i21 = -545602004;
                                            }
                                            break;
                                        case 82308360:
                                        case 405536141:
                                            if (C13473.f42873 != 0) {
                                                iM31611 = C0619.m2761("᩹۫") ^ i18;
                                                i20 = ((iM31611 ^ i19) * (-11173)) ^ 1585705132;
                                                i21 = -545602004;
                                            } else {
                                                iM31611 = (i18 - C0773.m3169("ᩴۧ")) * 47;
                                                i20 = ((iM31611 ^ i19) * 10455) ^ (-654166439);
                                                i21 = 1030654658;
                                            }
                                            break;
                                        case 238163874:
                                        case 485148988:
                                            if (AbstractC0116.f1064 <= 0) {
                                                iM31611 = C0619.m2761("۬᩺") ^ i19;
                                                i20 = ((iM31611 ^ i18) * (-15197)) ^ 628201382;
                                                i21 = 1293709562;
                                            } else {
                                                iM31611 = C0619.m2761("ۡᩳ") ^ i19;
                                                i20 = ((iM31611 ^ i18) * (-4823)) ^ (-1678231441);
                                                i21 = -1081780878;
                                            }
                                            break;
                                        case 1213361042:
                                        case 1883403571:
                                            C11235.m28309();
                                            iM31611 = C0619.m2761("۬᩺") ^ i19;
                                            i20 = ((iM31611 ^ i18) * (-15197)) ^ 628201382;
                                            i21 = 1293709562;
                                            break;
                                        default:
                                            C2966.m9664();
                                            if (C0487.f2131 > 0) {
                                                iM31611 = C0619.m2761("᩹۫") ^ i18;
                                                i20 = ((iM31611 ^ i19) * (-11173)) ^ 1585705132;
                                                i21 = -545602004;
                                            } else {
                                                iM31611 = C0619.m2761("۬᩺") ^ i19;
                                                i20 = ((iM31611 ^ i18) * (-15197)) ^ 628201382;
                                                i21 = 1293709562;
                                            }
                                            break;
                                    }
                                }
                            }

                            @Override // android.webkit.ValueCallback
                            public final void onReceiveValue(Object obj) {
                                int i17 = 0;
                                String str = null;
                                int i18 = 1483044204;
                                int i19 = C1321.f4751;
                                int i20 = C3779.f12953;
                                int iM2761 = (i19 - C0619.m2761("ܳۗ")) * 11;
                                int i21 = ((iM2761 ^ i20) * 23185) ^ 700442378;
                                int i22 = 718598728;
                                while (true) {
                                    i18 = ((((i18 ^ i20) * 27821) >> 31) & i21) ^ (iM2761 ^ i22);
                                    switch (i18) {
                                        case -2065706290:
                                        case 882000792:
                                            if (C3077.f9998) {
                                                iM2761 = (C0619.m2761("᩺ۜ") + i19) * (-121);
                                                i21 = ((iM2761 ^ i20) * (-32283)) ^ (-1652296376);
                                                i22 = -1671195840;
                                            } else {
                                                iM2761 = (i19 - C0619.m2761("۬ܺ")) * (-85);
                                                i21 = ((iM2761 ^ i20) * 23149) ^ (-677058827);
                                                i22 = -1147492657;
                                            }
                                            break;
                                        case -1788403719:
                                        case 2001176463:
                                            C3734.m12152();
                                            if (C3448.f11240 < 0) {
                                                iM2761 = (i19 - C0619.m2761("۬ܺ")) * (-85);
                                                i21 = ((iM2761 ^ i20) * 23149) ^ (-677058827);
                                                i22 = -1147492657;
                                            } else {
                                                iM2761 = (C0773.m3169("ۧۧ") + i20) * 53;
                                                i21 = ((iM2761 ^ i19) * (-5877)) ^ 1515000577;
                                                i22 = 1533260841;
                                            }
                                            break;
                                        case -1672523499:
                                        case 1528623182:
                                            if (C2419.f7754 >= 0) {
                                                iM2761 = (i19 - C0619.m2761("֨ܰ")) * 81;
                                                i21 = ((iM2761 ^ i20) * (-11425)) ^ 1557496855;
                                                i22 = -1252280577;
                                            } else {
                                                iM2761 = (i19 - C0773.m3169("ܿܳ")) * 115;
                                                i21 = ((iM2761 ^ i20) * (-17469)) ^ 2007468347;
                                                i22 = 756300151;
                                            }
                                            break;
                                        case -1606586370:
                                        case 149353874:
                                            str = (String) obj;
                                            if (C3448.f11240 >= 0) {
                                                iM2761 = C0773.m3169("ۙۚ") ^ i20;
                                                i21 = ((iM2761 ^ i19) * (-8483)) ^ 1182469624;
                                                i22 = 1303645739;
                                            } else {
                                                iM2761 = C0619.m2761("᩺ܰ") ^ i19;
                                                i21 = ((iM2761 ^ i20) * (-16045)) ^ 1390867571;
                                                i22 = -1676632745;
                                            }
                                            break;
                                        case -941914457:
                                        case 396337953:
                                            C4238.m13540();
                                            C1321.m4852();
                                            break;
                                        case -886929375:
                                        case -877808262:
                                            if (C2485.m8357() <= 0) {
                                                iM2761 = (i19 - C0619.m2761("֨ܰ")) * 81;
                                                i21 = ((iM2761 ^ i20) * (-11425)) ^ 1557496855;
                                                i22 = -1252280577;
                                            } else {
                                                iM2761 = (C0773.m3169("ᩳۜ") ^ i20) * 127;
                                                i21 = ((iM2761 ^ i19) * (-2477)) ^ 244612918;
                                                i22 = 1355670712;
                                            }
                                            break;
                                        case -869510800:
                                        case 337499968:
                                            if (C1343.f4799 != 0) {
                                                iM2761 = (i19 - C0619.m2761("֨ܰ")) * 81;
                                                i21 = ((iM2761 ^ i20) * (-11425)) ^ 1557496855;
                                                i22 = -1252280577;
                                            } else {
                                                iM2761 = (C0773.m3169("ۧۧ") + i20) * 53;
                                                i21 = ((iM2761 ^ i19) * (-5877)) ^ 1515000577;
                                                i22 = 1533260841;
                                            }
                                            break;
                                        case -598426613:
                                        case 1073460114:
                                            if (C4238.f15451 >= 0) {
                                                iM2761 = C0619.m2761("ܳ֫") ^ i20;
                                                i21 = ((iM2761 ^ i19) * (-22787)) ^ (-761687241);
                                                i22 = -1124097513;
                                            } else {
                                                iM2761 = C0773.m3169("ܳ᩸") ^ i20;
                                                i21 = ((iM2761 ^ i19) * (-26661)) ^ 2110637593;
                                                i22 = 419313384;
                                            }
                                            break;
                                        case -384735895:
                                        case -251772115:
                                            if (C2287.f7432 >= 0) {
                                                iM2761 = (i19 - C0619.m2761("۬ܺ")) * (-85);
                                                i21 = ((iM2761 ^ i20) * 23149) ^ (-677058827);
                                                i22 = -1147492657;
                                            } else {
                                                iM2761 = C0773.m3169("ۗ֨") ^ i20;
                                                i21 = ((iM2761 ^ i19) * (-12677)) ^ 304314178;
                                                i22 = 487244575;
                                            }
                                            break;
                                        case -203748860:
                                        case 39012949:
                                            if (C3734.m12152() >= 0) {
                                                iM2761 = (i19 - C0619.m2761("۬ܺ")) * (-85);
                                                i21 = ((iM2761 ^ i20) * 23149) ^ (-677058827);
                                                i22 = -1147492657;
                                            } else {
                                                iM2761 = C0773.m3169("᩻᩻") ^ i20;
                                                i21 = ((iM2761 ^ i19) * (-19755)) ^ 294194474;
                                                i22 = 1921508888;
                                            }
                                            break;
                                        case -78612110:
                                        case 489390736:
                                            if (AbstractC0641.f2496 >= 0) {
                                                iM2761 = (i19 - C0619.m2761("۬ܺ")) * (-85);
                                                i21 = ((iM2761 ^ i20) * 23149) ^ (-677058827);
                                                i22 = -1147492657;
                                            } else {
                                                iM2761 = (i19 - C0619.m2761("ۖ᩸")) * 119;
                                                i21 = ((iM2761 ^ i20) * (-21467)) ^ 26959145;
                                                i22 = -1716488202;
                                            }
                                            break;
                                        case 58671644:
                                        case 1138546432:
                                            C0269.m1775();
                                            iM2761 = (C0773.m3169("ۧۧ") + i20) * 53;
                                            i21 = ((iM2761 ^ i19) * (-5877)) ^ 1515000577;
                                            i22 = 1533260841;
                                            break;
                                        case 451474184:
                                        case 982219226:
                                            C10139.m26192(this.f65907, i7, i17, str);
                                            break;
                                        case 828806779:
                                        case 1817973530:
                                            if (C17202.f56030) {
                                                iM2761 = C0773.m3169("᩷ܰ") ^ i19;
                                                i21 = ((iM2761 ^ i20) * (-21119)) ^ (-623257969);
                                                i22 = 1840868547;
                                            } else {
                                                iM2761 = (i19 - C0619.m2761("֨ܰ")) * 81;
                                                i21 = ((iM2761 ^ i20) * (-11425)) ^ 1557496855;
                                                i22 = -1252280577;
                                            }
                                            break;
                                        case 1153421304:
                                        case 1680641084:
                                            RunnableC1848.m6360();
                                            if (RunnableC0334.f1808 > 0) {
                                                iM2761 = C0619.m2761("ܳ֫") ^ i20;
                                                i21 = ((iM2761 ^ i19) * (-22787)) ^ (-761687241);
                                                i22 = -1124097513;
                                            } else {
                                                iM2761 = (i19 - C0619.m2761("֨ܰ")) * 81;
                                                i21 = ((iM2761 ^ i20) * (-11425)) ^ 1557496855;
                                                i22 = -1252280577;
                                            }
                                            break;
                                        default:
                                            i17 = i16;
                                            if (C3099.m10095()) {
                                                iM2761 = (i19 - C0619.m2761("֨ܰ")) * 81;
                                                i21 = ((iM2761 ^ i20) * (-11425)) ^ 1557496855;
                                                i22 = -1252280577;
                                            } else {
                                                iM2761 = (C0619.m2761("ۘܿ") ^ i20) * (-89);
                                                i21 = ((iM2761 ^ i19) * 28281) ^ 433040672;
                                                i22 = 700964393;
                                            }
                                            break;
                                    }
                                    return;
                                }
                            }
                        });
                        iM3169 = C0773.m3169("ᩴ᩵") ^ i3;
                        i = ((iM3169 ^ i4) * (-11961)) ^ 411198226;
                        i2 = 2072834033;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -427572858:
                case 1592765229:
                    if (c10139.f32478 == null) {
                        iM3169 = C0773.m3169("ᩴ᩵") ^ i3;
                        i = ((iM3169 ^ i4) * (-11961)) ^ 411198226;
                        i2 = 2072834033;
                    } else {
                        iM3169 = C0619.m2761("᩶ۗ") ^ i3;
                        i = ((iM3169 ^ i4) * 29465) ^ 443329521;
                        i2 = -821978382;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -249154876:
                case 424180035:
                    C2023.m6964();
                    iM3169 = (C0619.m2761("᩷᩺") + i3) * (-57);
                    i = ((iM3169 ^ i4) * 19475) ^ 1846588574;
                    i2 = -1020142863;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -72482416:
                case 167214756:
                    i8 = s + 8927;
                    if (C1321.m4852()) {
                        iM3169 = C0619.m2761("ۢ۫") ^ i3;
                        i = ((iM3169 ^ i4) * (-14561)) ^ (-1741376007);
                        i2 = -1042787157;
                    } else {
                        iM3169 = (C0619.m2761("ۨܺ") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM3169 ^ i4) * 20633) ^ (-1752987636);
                        i2 = 2012008935;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 17238541:
                case 462671615:
                    int i17 = i10 + i11;
                    if ((i17 + i17) - i9 >= 0) {
                        iM3169 = C0619.m2761("ۙۘ") ^ i3;
                        i = ((iM3169 ^ i4) * 18097) ^ (-1288333022);
                        i2 = 1894896980;
                    } else {
                        iM3169 = (C0773.m3169("ۧ۫") + i4) * (-29);
                        i = ((iM3169 ^ i3) * 17601) ^ 1837360516;
                        i2 = -882257289;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 181139892:
                case 1552338783:
                    RunnableC3055.m9933();
                    if (C2419.f7754 >= 0) {
                        iM3169 = (C0619.m2761("᩷᩺") + i3) * (-57);
                        i = ((iM3169 ^ i4) * 19475) ^ 1846588574;
                        i2 = -1020142863;
                    } else {
                        iM3169 = (C0619.m2761("֡۫") ^ i4) * (-15);
                        i = ((iM3169 ^ i3) * 22241) ^ 1758525334;
                        i2 = -183257443;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 401245115:
                case 1304621340:
                    i9 = i8 * i8;
                    i10 = s * s;
                    if (RunnableC1848.f6235) {
                        iM3169 = (C0619.m2761("᩷᩺") + i3) * (-57);
                        i = ((iM3169 ^ i4) * 19475) ^ 1846588574;
                        i2 = -1020142863;
                    } else {
                        iM3169 = C0773.m3169("᩶ܿ") ^ i4;
                        i = ((iM3169 ^ i3) * (-25475)) ^ (-1359901851);
                        i2 = 898744697;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 417786942:
                case 1226158768:
                    sArr = f32436;
                    if (C3099.f10023 <= 0) {
                        iM3169 = (C0619.m2761("᩷᩺") + i3) * (-57);
                        i = ((iM3169 ^ i4) * 19475) ^ 1846588574;
                        i2 = -1020142863;
                    } else {
                        iM3169 = C0773.m3169("۠۬") ^ i4;
                        i = ((iM3169 ^ i3) * (-32299)) ^ (-100610373);
                        i2 = 1109467174;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 752385895:
                case 1521960762:
                    s = sArr[c];
                    if (C3779.f12953 <= 0) {
                        iM3169 = (C0619.m2761("ۨܺ") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM3169 ^ i4) * 20633) ^ (-1752987636);
                        i2 = 2012008935;
                    } else {
                        iM3169 = (C0773.m3169("ۛ۟") ^ i4) * 53;
                        i = ((iM3169 ^ i3) * (-18117)) ^ (-1714843079);
                        i2 = -1210172502;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 1019307630:
                case 1464270868:
                    if (c10139.f32452) {
                        iM3169 = C0619.m2761("ܺ۟") ^ i4;
                        i = ((iM3169 ^ i3) * (-8427)) ^ 1880537805;
                        i2 = -734341062;
                    } else {
                        iM3169 = C0773.m3169("ᩴ᩵") ^ i3;
                        i = ((iM3169 ^ i4) * (-11961)) ^ 411198226;
                        i2 = 2072834033;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                default:
                    if (AbstractC0116.f1064 <= 0) {
                        iM3169 = (C0619.m2761("᩷᩺") + i3) * (-57);
                        i = ((iM3169 ^ i4) * 19475) ^ 1846588574;
                        i2 = -1020142863;
                    } else {
                        iM3169 = C0619.m2761("֫ۖ") ^ i3;
                        i = ((iM3169 ^ i4) * (-6245)) ^ 1164206311;
                        i2 = -814037871;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m26169(C10139 c10139, int i, int i2, String str) {
        boolean zM11490 = false;
        short s = 0;
        int i3 = 0;
        short s2 = 0;
        int i4 = 0;
        int i5 = 980496843;
        int i6 = C2288.f7433;
        int i7 = C3033.f9831;
        int iM2761 = C0619.m2761("ۗ᩷") ^ i7;
        int i8 = ((iM2761 ^ i6) * 25051) ^ (-889658689);
        int i9 = -535875819;
        while (true) {
            i5 = ((((i5 ^ i6) * (-1077)) >> 31) & i8) ^ (iM2761 ^ i9);
            switch (i5) {
                case -2128672052:
                case -1199121408:
                    s = f32436[152];
                    if (C0950.f3488 >= 0) {
                        iM2761 = C0773.m3169("ܽۛ") ^ i7;
                        i8 = ((iM2761 ^ i6) * 30245) ^ (-2056312605);
                        i9 = 1132411361;
                    } else {
                        iM2761 = C0773.m3169("ۖۜ") ^ i7;
                        i8 = ((iM2761 ^ i6) * 3587) ^ (-1727989155);
                        i9 = 359567785;
                    }
                    break;
                case -2120126457:
                case 311682385:
                    if (c10139.f32463) {
                        iM2761 = C0619.m2761("ۛܳ") ^ i7;
                        i8 = ((iM2761 ^ i6) * (-31485)) ^ (-445135153);
                        i9 = 510999558;
                    } else {
                        iM2761 = (i7 - C0619.m2761("᩻ۖ")) * (-13);
                        i8 = ((iM2761 ^ i6) * (-10353)) ^ 1046059893;
                        i9 = 137956070;
                    }
                    break;
                case -2090336149:
                case 577381853:
                    if (C2419.f7754 >= 0) {
                        iM2761 = C0773.m3169("ۡ᩷") ^ i6;
                        i8 = ((iM2761 ^ i7) * 10121) ^ 1769550551;
                        i9 = -1161406969;
                    } else {
                        iM2761 = (C0773.m3169("ۢ۠") ^ i6) * 123;
                        i8 = ((iM2761 ^ i7) * (-26881)) ^ 1287290378;
                        i9 = -1559751901;
                    }
                    break;
                case -2060277171:
                case 265544255:
                    if (C1146.f4234 >= 0) {
                        iM2761 = C0773.m3169("ۢᩳ") ^ i7;
                        i8 = ((iM2761 ^ i6) * 5569) ^ 1982379100;
                        i9 = -358309620;
                    } else {
                        iM2761 = (i7 - C0773.m3169("ۡܳ")) * (-9);
                        i8 = ((iM2761 ^ i6) * 3931) ^ 1876436146;
                        i9 = 462291994;
                    }
                    break;
                case -2037722169:
                case -1356637909:
                    if (C3998.f13671 != 0) {
                        iM2761 = C0773.m3169("֨ۘ") ^ i7;
                        i8 = ((iM2761 ^ i6) * (-7617)) ^ (-1622508642);
                        i9 = -1143378962;
                    } else {
                        iM2761 = (C0619.m2761("ۧۧ") ^ i7) * (-15);
                        i8 = ((iM2761 ^ i6) * 4011) ^ 1434338864;
                        i9 = 1386160372;
                    }
                    break;
                case -2015658980:
                case 418750325:
                    zM11490 = C3492.m11490(str, C2702.m8881(f32436, 153, 4, i4));
                    iM2761 = C0619.m2761("۠۠") ^ i6;
                    i8 = ((iM2761 ^ i7) * 14677) ^ 525887892;
                    i9 = -968169604;
                    break;
                case -1966834926:
                case 868761239:
                    if (C2834.m9344() >= 0) {
                        iM2761 = C0773.m3169("ۢᩳ") ^ i7;
                        i8 = ((iM2761 ^ i6) * 5569) ^ 1982379100;
                        i9 = -358309620;
                    } else {
                        iM2761 = (C0773.m3169("᩷ܳ") ^ i6) * 27;
                        i8 = ((iM2761 ^ i7) * (-31425)) ^ 28676003;
                        i9 = -240299664;
                    }
                    break;
                case -1893149956:
                case -1418727742:
                    if (C4282.f15546 > 0) {
                        iM2761 = (i6 - C0773.m3169("۬ܿ")) * (-27);
                        i8 = ((iM2761 ^ i7) * (-16871)) ^ (-969023286);
                        i9 = -1989491083;
                    } else {
                        iM2761 = C0773.m3169("ۡ᩷") ^ i6;
                        i8 = ((iM2761 ^ i7) * 10121) ^ 1769550551;
                        i9 = -1161406969;
                    }
                    break;
                case -1839841772:
                case -1364609857:
                    try {
                        c10139.f32444 = C3099.m10089(str);
                        break;
                    } catch (NumberFormatException unused) {
                    }
                    iM2761 = (C0773.m3169("ۘۘ") ^ i6) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                    i8 = ((iM2761 ^ i7) * (-5573)) ^ 812446282;
                    i9 = -128266060;
                    break;
                case -1838384155:
                case 471438935:
                    if (C1343.f4799 != 0) {
                        iM2761 = C0619.m2761("᩷֫") ^ i7;
                        i8 = ((iM2761 ^ i6) * (-5861)) ^ 262351096;
                        i9 = -778630242;
                    } else {
                        iM2761 = (C0619.m2761("ۡ۠") + i6) * 29;
                        i8 = ((iM2761 ^ i7) * 28555) ^ 789217122;
                        i9 = 894702931;
                    }
                    break;
                case -1690135513:
                case -170745229:
                    if (i2 != c10139.f32445) {
                        iM2761 = C0619.m2761("ۛܳ") ^ i7;
                        i8 = ((iM2761 ^ i6) * (-31485)) ^ (-445135153);
                        i9 = 510999558;
                    } else {
                        iM2761 = (C0619.m2761("ۗۧ") + i7) * 7;
                        i8 = ((iM2761 ^ i6) * (-26761)) ^ 667733927;
                        i9 = 617327500;
                    }
                    break;
                case -1678116889:
                case 111561616:
                    if (C3099.f10023 <= 0) {
                        iM2761 = (C0619.m2761("ܿۚ") + i6) * 101;
                        i8 = ((iM2761 ^ i7) * (-20307)) ^ (-901269736);
                        i9 = 1487446237;
                    } else {
                        iM2761 = C0773.m3169("ܿ᩺") ^ i6;
                        i8 = ((iM2761 ^ i7) * 4753) ^ (-1834311592);
                        i9 = 372144149;
                    }
                    break;
                case -1666928178:
                case -641387973:
                    if (c10139.f32468 == i) {
                        iM2761 = C0773.m3169("᩸֡") ^ i6;
                        i8 = ((iM2761 ^ i7) * 20107) ^ (-1974931234);
                        i9 = -1752973561;
                    } else {
                        iM2761 = C0619.m2761("ۛܳ") ^ i7;
                        i8 = ((iM2761 ^ i6) * (-31485)) ^ (-445135153);
                        i9 = 510999558;
                    }
                    break;
                case -1661388472:
                case -1415637588:
                    int i10 = s + s2;
                    if ((i10 * i10) - i3 < 0) {
                        iM2761 = C0773.m3169("ۘۡ") ^ i6;
                        i8 = ((iM2761 ^ i7) * (-11397)) ^ 867013650;
                        i9 = 436498991;
                    } else {
                        iM2761 = (C0773.m3169("ۚ᩷") + i7) * (-53);
                        i8 = ((iM2761 ^ i6) * 879) ^ 1920572780;
                        i9 = -1255769283;
                    }
                    break;
                case -1630086222:
                case 703415421:
                    if (C2834.f9334 <= 0) {
                        iM2761 = C0619.m2761("᩷֫") ^ i7;
                        i8 = ((iM2761 ^ i6) * (-5861)) ^ 262351096;
                        i9 = -778630242;
                    } else {
                        iM2761 = (i7 - C0619.m2761("֡᩵")) * 109;
                        i8 = ((iM2761 ^ i6) * (-26181)) ^ 1858261222;
                        i9 = 650368238;
                    }
                    break;
                case -1541923807:
                case 1979546806:
                    if (zM11490) {
                        iM2761 = (C0773.m3169("ۘۘ") ^ i6) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i8 = ((iM2761 ^ i7) * (-5573)) ^ 812446282;
                        i9 = -128266060;
                    } else {
                        iM2761 = (i7 - C0619.m2761("ܿۖ")) * (-61);
                        i8 = ((iM2761 ^ i6) * (-24387)) ^ (-1333597217);
                        i9 = 1986728806;
                    }
                    break;
                case -1413390918:
                case 1785325472:
                    c10139.f32451 = false;
                    if (str != null) {
                        iM2761 = C0773.m3169("ܺܽ") ^ i7;
                        i8 = ((iM2761 ^ i6) * 6377) ^ (-1555497539);
                        i9 = -148284516;
                    } else {
                        iM2761 = (C0773.m3169("ۘۘ") ^ i6) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i8 = ((iM2761 ^ i7) * (-5573)) ^ 812446282;
                        i9 = -128266060;
                    }
                    break;
                case -1398538891:
                case 2070497179:
                    if (C1542.m5459() < 0) {
                        iM2761 = C0773.m3169("ۢᩳ") ^ i7;
                        i8 = ((iM2761 ^ i6) * 5569) ^ 1982379100;
                        i9 = -358309620;
                    } else {
                        iM2761 = (C0619.m2761("֫֫") ^ i6) * (-99);
                        i8 = ((iM2761 ^ i7) * (-26303)) ^ (-914656835);
                        i9 = 1367252139;
                    }
                    break;
                case -1379998877:
                case 2018938491:
                    i4 = 60972;
                    iM2761 = C0619.m2761("ۡ۟") ^ i6;
                    i8 = ((iM2761 ^ i7) * 30439) ^ 13874537;
                    i9 = 1891704338;
                    break;
                case -947977122:
                case -369997252:
                    c10139.m26178();
                    iM2761 = C0619.m2761("ۛܳ") ^ i7;
                    i8 = ((iM2761 ^ i6) * (-31485)) ^ (-445135153);
                    i9 = 510999558;
                    break;
                case -872593714:
                case 1503771879:
                    c10139.m26183();
                    if (c10139.f32458) {
                        iM2761 = (C0619.m2761("֡֫") + i7) * (-73);
                        i8 = ((iM2761 ^ i6) * (-28231)) ^ (-904544917);
                        i9 = 1568239826;
                    } else {
                        iM2761 = (C0619.m2761("ۖۚ") + i6) * 61;
                        i8 = ((iM2761 ^ i7) * 27873) ^ (-949617336);
                        i9 = 1887141420;
                    }
                    break;
                case -753153911:
                case 1491011140:
                    if (C3033.f9831 < 0) {
                        iM2761 = (C0619.m2761("֫֫") ^ i6) * (-99);
                        i8 = ((iM2761 ^ i7) * (-26303)) ^ (-914656835);
                        i9 = 1367252139;
                    } else {
                        iM2761 = (i6 - C0773.m3169("۬ܿ")) * (-27);
                        i8 = ((iM2761 ^ i7) * (-16871)) ^ (-969023286);
                        i9 = -1989491083;
                    }
                    break;
                case -698013421:
                case 1409678964:
                    C4238.m13540();
                    C3448.m11248();
                    iM2761 = C0773.m3169("ۡ᩷") ^ i6;
                    i8 = ((iM2761 ^ i7) * 10121) ^ 1769550551;
                    i9 = -1161406969;
                    break;
                case -670368722:
                case 498925553:
                    c10139.m26195(true);
                    iM2761 = C0619.m2761("ۛܳ") ^ i7;
                    i8 = ((iM2761 ^ i6) * (-31485)) ^ (-445135153);
                    i9 = 510999558;
                    break;
                case -661348628:
                case 918511858:
                    RunnableC3646.m11813();
                    break;
                case -584349529:
                case 1954325587:
                    if (C2485.f7950 != 0) {
                        iM2761 = C0773.m3169("ۢᩳ") ^ i7;
                        i8 = ((iM2761 ^ i6) * 5569) ^ 1982379100;
                        i9 = -358309620;
                    } else {
                        iM2761 = C0773.m3169("ܳܳ") ^ i7;
                        i8 = ((iM2761 ^ i6) * 12979) ^ (-625984679);
                        i9 = 1858326278;
                    }
                    break;
                case -501395152:
                case -204441108:
                    i4 = 8223;
                    iM2761 = C0619.m2761("ۡ۟") ^ i6;
                    i8 = ((iM2761 ^ i7) * 30439) ^ 13874537;
                    i9 = 1891704338;
                    break;
                case -341826859:
                case 671610887:
                    if (C2485.f7950 == 0) {
                        iM2761 = C0773.m3169("֨ۘ") ^ i7;
                        i8 = ((iM2761 ^ i6) * (-7617)) ^ (-1622508642);
                        i9 = -1143378962;
                    } else {
                        iM2761 = C0773.m3169("ۡ᩷") ^ i6;
                        i8 = ((iM2761 ^ i7) * 10121) ^ 1769550551;
                        i9 = -1161406969;
                    }
                    break;
                case -240532460:
                case 398436918:
                    break;
                case -88971067:
                case 459397643:
                    i3 = s * 2552;
                    s2 = 638;
                    if (C2878.m9491() <= 0) {
                        iM2761 = C0619.m2761("֡ۖ") ^ i7;
                        i8 = ((iM2761 ^ i6) * 29195) ^ 738134843;
                        i9 = -1224503109;
                    } else {
                        iM2761 = C0619.m2761("۬֨") ^ i6;
                        i8 = ((iM2761 ^ i7) * (-1505)) ^ (-61779343);
                        i9 = -22298071;
                    }
                    break;
                case 22658189:
                case 91778423:
                    if (!C1519.m5403()) {
                        iM2761 = C0773.m3169("ۡ᩷") ^ i6;
                        i8 = ((iM2761 ^ i7) * 10121) ^ 1769550551;
                        i9 = -1161406969;
                    } else {
                        iM2761 = (C0619.m2761("ܿۚ") + i6) * 101;
                        i8 = ((iM2761 ^ i7) * (-20307)) ^ (-901269736);
                        i9 = 1487446237;
                    }
                    break;
                case 215221801:
                case 1044910624:
                    C3998.m12920();
                    if (!C1321.m4852()) {
                        iM2761 = C0619.m2761("֡ۖ") ^ i7;
                        i8 = ((iM2761 ^ i6) * 29195) ^ 738134843;
                        i9 = -1224503109;
                    } else {
                        iM2761 = (C0619.m2761("ۡ۠") + i6) * 29;
                        i8 = ((iM2761 ^ i7) * 28555) ^ 789217122;
                        i9 = 894702931;
                    }
                    break;
                case 372469855:
                case 1684560159:
                    C0773.m3161();
                    if (AbstractC3624.m11755() == 0) {
                        iM2761 = C0619.m2761("֡ۖ") ^ i7;
                        i8 = ((iM2761 ^ i6) * 29195) ^ 738134843;
                        i9 = -1224503109;
                    } else {
                        iM2761 = C0773.m3169("ۡ᩷") ^ i6;
                        i8 = ((iM2761 ^ i7) * 10121) ^ 1769550551;
                        i9 = -1161406969;
                    }
                    break;
                default:
                    if (C2485.f7950 != 0) {
                        iM2761 = (i6 - C0773.m3169("۬ܿ")) * (-27);
                        i8 = ((iM2761 ^ i7) * (-16871)) ^ (-969023286);
                        i9 = -1989491083;
                    } else {
                        iM2761 = C0773.m3169("ܶ᩶") ^ i6;
                        i8 = ((iM2761 ^ i7) * 9113) ^ (-2041576663);
                        i9 = 1077475456;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m26183() {
        int i = 0;
        ArrayList arrayList = null;
        int i2 = 0;
        C14614 c14614 = null;
        int i3 = 0;
        Set set = null;
        Object objM11990 = null;
        C14614 c14615 = null;
        int i4 = -1421458798;
        int i5 = C23916.f77426;
        int i6 = C1542.f5343;
        int iM3169 = C0773.m3169("ۖܽ") ^ i6;
        int i7 = ((iM3169 ^ i5) * 32073) ^ 245913938;
        int i8 = 366639780;
        while (true) {
            i4 = ((((i4 ^ i5) * (-14425)) >> 31) & i7) ^ (iM3169 ^ i8);
            switch (i4) {
                case -2108012005:
                case -1127431533:
                    i3 = c14614.f46025;
                    if (i3 >= 0) {
                        iM3169 = (C0773.m3169("᩺ۧ") + i5) * (-3);
                        i7 = ((iM3169 ^ i6) * 2731) ^ 80387098;
                        i8 = -2113635208;
                    } else {
                        iM3169 = C0619.m2761("ۘۘ") ^ i6;
                        i7 = ((iM3169 ^ i5) * 12447) ^ 1065718341;
                        i8 = -6232117;
                    }
                    break;
                case -1916900663:
                case 2060214029:
                    C3690.m11987();
                    if (!C2702.m8876()) {
                        iM3169 = C0773.m3169("ܶ᩸") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-32187)) ^ 428333562;
                        i8 = -1776057582;
                    } else {
                        iM3169 = C0619.m2761("ۙᩴ") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-2995)) ^ 807986442;
                        i8 = 1121805196;
                    }
                    break;
                case -1829706229:
                case -1158048960:
                    set.remove(c14615.f46023);
                    i2 = i3;
                    iM3169 = (i6 - C0773.m3169("᩸ۛ")) * (-55);
                    i7 = ((iM3169 ^ i5) * (-13313)) ^ 1641883;
                    i8 = -705769730;
                    break;
                case -1812893982:
                case 443928343:
                    i2 = this.f32444;
                    iM3169 = (i6 - C0773.m3169("᩸ۛ")) * (-55);
                    i7 = ((iM3169 ^ i5) * (-13313)) ^ 1641883;
                    i8 = -705769730;
                    break;
                case -1793232167:
                case 1682799901:
                    m26180(true);
                    break;
                case -1717877142:
                case 1244245862:
                    C4238.m13540();
                    if (C3448.f11240 < 0) {
                        iM3169 = C0619.m2761("ۙᩴ") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-2995)) ^ 807986442;
                        i8 = 1121805196;
                    } else {
                        iM3169 = (C0773.m3169("ۨۤ") ^ i6) * 97;
                        i7 = ((iM3169 ^ i5) * (-11271)) ^ 626444245;
                        i8 = -1352098760;
                    }
                    break;
                case -1582968051:
                case -379603409:
                    c14614 = (C14614) C1542.m5457(arrayList, i2);
                    if (C2834.m9344() >= 0) {
                        iM3169 = C0773.m3169("ܶ᩸") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-32187)) ^ 428333562;
                        i8 = -1776057582;
                    } else {
                        iM3169 = (C0773.m3169("ᩴۤ") + i6) * 47;
                        i7 = ((iM3169 ^ i5) * (-4603)) ^ (-1726385237);
                        i8 = 481159439;
                    }
                    break;
                case -1563794140:
                case -1228800793:
                    m26176(false);
                    iM3169 = C0773.m3169("ۘۗ") ^ i5;
                    i7 = ((iM3169 ^ i6) * 8483) ^ 1729226411;
                    i8 = 1588524148;
                    break;
                case -1506238810:
                case -1457199296:
                    if (C3734.f12817 >= 0) {
                        iM3169 = (C0619.m2761("֡ۨ") ^ i5) * 11;
                        i7 = ((iM3169 ^ i6) * 14907) ^ (-1628176215);
                        i8 = 175408786;
                    } else {
                        iM3169 = C0619.m2761("᩺ܰ") ^ i6;
                        i7 = ((iM3169 ^ i5) * 4127) ^ (-194979977);
                        i8 = -412390162;
                    }
                    break;
                case -1396692346:
                case 1197088228:
                    if (C13473.f42873 == 0) {
                        iM3169 = C0619.m2761("ᩳۜ") ^ i6;
                        i7 = ((iM3169 ^ i5) * 2625) ^ (-1221038785);
                        i8 = -788939633;
                    } else {
                        iM3169 = C0619.m2761("ۙᩴ") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-2995)) ^ 807986442;
                        i8 = 1121805196;
                    }
                    break;
                case -1375103180:
                case 1297178999:
                    if (C1343.f4799 != 0) {
                        iM3169 = C0619.m2761("ᩳۜ") ^ i6;
                        i7 = ((iM3169 ^ i5) * 2625) ^ (-1221038785);
                        i8 = -788939633;
                    } else {
                        iM3169 = (C0773.m3169("ۛۛ") + i5) * (-95);
                        i7 = ((iM3169 ^ i6) * 25609) ^ (-461076510);
                        i8 = -1717678043;
                    }
                    break;
                case -1182294457:
                case 1119229322:
                    if (C1519.m5403()) {
                        iM3169 = C0773.m3169("۫ܽ") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-1789)) ^ (-878545459);
                        i8 = -2062133911;
                    } else {
                        iM3169 = (C0773.m3169("ۨۤ") ^ i6) * 97;
                        i7 = ((iM3169 ^ i5) * (-11271)) ^ 626444245;
                        i8 = -1352098760;
                    }
                    break;
                case -1103946600:
                case -1074406579:
                    if (C3033.f9831 >= 0) {
                        iM3169 = C0773.m3169("ܶ᩸") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-32187)) ^ 428333562;
                        i8 = -1776057582;
                    } else {
                        iM3169 = C0619.m2761("ۜۘ") ^ i6;
                        i7 = ((iM3169 ^ i5) * 22987) ^ (-327093532);
                        i8 = -532284400;
                    }
                    break;
                case -850907569:
                case 564597852:
                    set = this.f32459;
                    objM11990 = C3690.m11990(arrayList, i3);
                    if (C1321.f4751 >= 0) {
                        iM3169 = C0773.m3169("ܶ᩸") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-32187)) ^ 428333562;
                        i8 = -1776057582;
                    } else {
                        iM3169 = (C0619.m2761("ۢܿ") ^ i5) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i7 = ((iM3169 ^ i6) * 32595) ^ 1227289944;
                        i8 = -1970438647;
                    }
                    break;
                case -644157669:
                case 457253004:
                    arrayList = this.f32474;
                    if (i < C2288.m7752(arrayList)) {
                        iM3169 = (i5 - C0773.m3169("ܳۖ")) * (-11);
                        i7 = ((iM3169 ^ i6) * (-12453)) ^ (-251754396);
                        i8 = 1647347128;
                    } else {
                        iM3169 = C0773.m3169("ۘۗ") ^ i5;
                        i7 = ((iM3169 ^ i6) * 8483) ^ 1729226411;
                        i8 = 1588524148;
                    }
                    break;
                case -544709320:
                case 1555784111:
                    i = this.f32444;
                    if (i >= 0) {
                        iM3169 = C0773.m3169("᩷ۨ") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-21397)) ^ 2032120238;
                        i8 = 1378081777;
                    } else {
                        iM3169 = C0773.m3169("ۘۗ") ^ i5;
                        i7 = ((iM3169 ^ i6) * 8483) ^ 1729226411;
                        i8 = 1588524148;
                    }
                    break;
                case -394938650:
                case 2017386145:
                    C1783.m6232();
                    iM3169 = (C0773.m3169("ۨۤ") ^ i6) * 97;
                    i7 = ((iM3169 ^ i5) * (-11271)) ^ 626444245;
                    i8 = -1352098760;
                    break;
                case 86851917:
                case 1384092138:
                    if (C20932.f66974 <= 0) {
                        iM3169 = C0619.m2761("ᩳۜ") ^ i6;
                        i7 = ((iM3169 ^ i5) * 2625) ^ (-1221038785);
                        i8 = -788939633;
                    } else {
                        iM3169 = (C0773.m3169("۫ܳ") + i6) * 95;
                        i7 = ((iM3169 ^ i5) * (-4955)) ^ (-1297732433);
                        i8 = -2111893525;
                    }
                    break;
                case 367095034:
                case 1697116971:
                    if (C1826.f6190 <= 0) {
                        iM3169 = (C0773.m3169("ۨۤ") ^ i6) * 97;
                        i7 = ((iM3169 ^ i5) * (-11271)) ^ 626444245;
                        i8 = -1352098760;
                    } else {
                        iM3169 = (i5 - C0619.m2761("ܺۙ")) * 75;
                        i7 = ((iM3169 ^ i6) * (-13219)) ^ 1652991077;
                        i8 = 1359196185;
                    }
                    break;
                case 1320659367:
                case 1619861006:
                    c14615 = (C14614) objM11990;
                    if (C0862.f3233 != 0) {
                        iM3169 = (C0619.m2761("֡ۨ") ^ i5) * 11;
                        i7 = ((iM3169 ^ i6) * 14907) ^ (-1628176215);
                        i8 = 175408786;
                    } else {
                        iM3169 = C0619.m2761("ܶۡ") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-28243)) ^ 1444579958;
                        i8 = -208095993;
                    }
                    break;
                case 1654879976:
                case 2046776875:
                    C2834.m9344();
                    C2023.m6964();
                    break;
                default:
                    if (AbstractC0641.f2496 >= 0) {
                        iM3169 = (C0773.m3169("ۨۤ") ^ i6) * 97;
                        i7 = ((iM3169 ^ i5) * (-11271)) ^ 626444245;
                        i8 = -1352098760;
                    } else {
                        iM3169 = (C0619.m2761("֡۠") ^ i5) * (-95);
                        i7 = ((iM3169 ^ i6) * (-24831)) ^ (-228219166);
                        i8 = 541071908;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int m26159(int i) {
        float f = 0.0f;
        Resources resources = null;
        float f2 = 0.0f;
        int i2 = -54528748;
        int i3 = C4282.f15546;
        int i4 = AbstractC3624.f12429;
        int iM2761 = (i4 - C0619.m2761("ۤ֨")) * 3;
        int i5 = ((iM2761 ^ i3) * 22039) ^ (-82435220);
        int i6 = -1615686253;
        while (true) {
            i2 = ((((i2 ^ i3) * 5691) >> 31) & i5) ^ (iM2761 ^ i6);
            switch (i2) {
                case -1938173748:
                case -1370157351:
                    C2023.m6964();
                    if (!C0619.f2439) {
                        iM2761 = C0619.m2761("۬ۨ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-7433)) ^ (-1474011602);
                        i6 = 49954427;
                    } else {
                        iM2761 = C0619.m2761("۟۟") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-10957)) ^ 1430049690;
                        i6 = 401856747;
                    }
                    break;
                case -1809388777:
                case -919119642:
                    resources = this.f32446.getResources();
                    if (C3448.m11248() != 0) {
                        iM2761 = (C0773.m3169("ۗܰ") + i3) * 55;
                        i5 = ((iM2761 ^ i4) * 22069) ^ (-822100803);
                        i6 = 1896359963;
                    } else {
                        iM2761 = (i4 - C0619.m2761("ۚۖ")) * 123;
                        i5 = ((iM2761 ^ i3) * 18847) ^ (-95764345);
                        i6 = 1848212094;
                    }
                    break;
                case -1769341493:
                case 1712913101:
                    if (C0950.f3488 >= 0) {
                        iM2761 = (C0773.m3169("ۗܰ") + i3) * 55;
                        i5 = ((iM2761 ^ i4) * 22069) ^ (-822100803);
                        i6 = 1896359963;
                    } else {
                        iM2761 = (i3 - C0773.m3169("۠ܰ")) * 45;
                        i5 = ((iM2761 ^ i4) * (-28545)) ^ (-718455524);
                        i6 = -773294478;
                    }
                    break;
                case -1589007661:
                case -896828966:
                    f = i;
                    if (C0773.m3161() != 0) {
                        iM2761 = C0619.m2761("۬ۨ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-7433)) ^ (-1474011602);
                        i6 = 49954427;
                    } else {
                        iM2761 = C0773.m3169("۫۫") ^ i4;
                        i5 = ((iM2761 ^ i3) * 10197) ^ (-733034726);
                        i6 = -540336707;
                    }
                    break;
                case -1550439649:
                case -846655005:
                    if (C3690.f12684 <= 0) {
                        iM2761 = C0773.m3169("ܺ᩷") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-10359)) ^ 1122963682;
                        i6 = 1695737356;
                    } else {
                        iM2761 = (C0619.m2761("᩷֫") + i4) * (-47);
                        i5 = ((iM2761 ^ i3) * 997) ^ (-1305769139);
                        i6 = 2087030141;
                    }
                    break;
                case -1533633030:
                case 351605545:
                    if (C2354.f7599 >= 0) {
                        iM2761 = (C0773.m3169("ۗܰ") + i3) * 55;
                        i5 = ((iM2761 ^ i4) * 22069) ^ (-822100803);
                        i6 = 1896359963;
                    } else {
                        iM2761 = (i3 - C0773.m3169("᩹ۡ")) * (-109);
                        i5 = ((iM2761 ^ i4) * (-26953)) ^ 1924430240;
                        i6 = 1096133445;
                    }
                    break;
                case -1052289038:
                case 346279492:
                    f2 = resources.getDisplayMetrics().density;
                    if (C2375.f7641 <= 0) {
                        iM2761 = C0619.m2761("۬ۨ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-7433)) ^ (-1474011602);
                        i6 = 49954427;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ܳܳ")) * (-23);
                        i5 = ((iM2761 ^ i4) * (-16077)) ^ 1365140853;
                        i6 = 1810405969;
                    }
                    break;
                case -690723674:
                case 1226295501:
                    C2702.m8876();
                    iM2761 = (C0773.m3169("֫᩷") + i3) * 77;
                    i5 = ((iM2761 ^ i4) * (-27403)) ^ (-352627760);
                    i6 = -568575684;
                    break;
                case -614370895:
                case 2010590354:
                    RunnableC3646.m11813();
                    C0269.m1775();
                    return 0;
                case -558490132:
                case 162687532:
                    return Math.round(f * f2);
                case -545752663:
                case 1783104275:
                    if (C3779.m12264()) {
                        iM2761 = (C0773.m3169("ۘܺ") + i4) * (-127);
                        i5 = ((iM2761 ^ i3) * 11041) ^ 800468831;
                        i6 = 854756321;
                    } else {
                        iM2761 = C0619.m2761("۟۟") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-10957)) ^ 1430049690;
                        i6 = 401856747;
                    }
                    break;
                case -131681143:
                case 653416370:
                    if (C1826.f6190 <= 0) {
                        iM2761 = C0619.m2761("۟۟") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-10957)) ^ 1430049690;
                        i6 = 401856747;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ۙۘ")) * (-55);
                        i5 = ((iM2761 ^ i4) * (-6657)) ^ (-159981336);
                        i6 = -326625339;
                    }
                    break;
                case 35647796:
                case 1102160740:
                    if (C3033.f9831 < 0) {
                        iM2761 = C0619.m2761("۬ۨ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-7433)) ^ (-1474011602);
                        i6 = 49954427;
                    } else {
                        iM2761 = (C0773.m3169("֫᩷") + i3) * 77;
                        i5 = ((iM2761 ^ i4) * (-27403)) ^ (-352627760);
                        i6 = -568575684;
                    }
                    break;
                case 208195542:
                case 1545480385:
                    C4238.m13540();
                    if (C2287.m7745() <= 0) {
                        iM2761 = C0773.m3169("ܺ᩷") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-10359)) ^ 1122963682;
                        i6 = 1695737356;
                    } else {
                        iM2761 = C0619.m2761("۬ۨ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-7433)) ^ (-1474011602);
                        i6 = 49954427;
                    }
                    break;
                case 432615244:
                case 2088133633:
                    if (C1321.f4751 >= 0) {
                        iM2761 = C0773.m3169("ܺ᩷") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-10359)) ^ 1122963682;
                        i6 = 1695737356;
                    } else {
                        iM2761 = C0619.m2761("ܽ۠") ^ i4;
                        i5 = ((iM2761 ^ i3) * 21699) ^ 919777543;
                        i6 = -277130893;
                    }
                    break;
                default:
                    if (C2419.f7754 >= 0) {
                        iM2761 = (C0773.m3169("֫᩷") + i3) * 77;
                        i5 = ((iM2761 ^ i4) * (-27403)) ^ (-352627760);
                        i6 = -568575684;
                    } else {
                        iM2761 = (C0619.m2761("۫᩻") + i3) * 9;
                        i5 = ((iM2761 ^ i4) * 4919) ^ (-397846245);
                        i6 = -1766700668;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m26205() {
        RunnableC11631 runnableC11631 = null;
        int i = -1404839517;
        int i2 = C3448.f11240;
        int i3 = C3099.f10023;
        int iM3169 = C0773.m3169("ۚܺ") ^ i3;
        int i4 = ((iM3169 ^ i2) * 5409) ^ 549456358;
        int i5 = -788222947;
        while (true) {
            i = ((((i ^ i2) * 5985) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2049120445:
                case -535254655:
                    if (m26206()) {
                        iM3169 = (C0773.m3169("ۢ᩻") + i3) * 123;
                        i4 = ((iM3169 ^ i2) * 8105) ^ 1077792409;
                        i5 = -1249604921;
                    } else {
                        iM3169 = C0773.m3169("֨ܽ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 17599) ^ 1452625351;
                        i5 = 1901680085;
                    }
                    break;
                case -2036173543:
                case -1601585805:
                    C13473.m33144();
                    break;
                case -1990816453:
                case 1592543581:
                    if (this.f32463) {
                        iM3169 = C0773.m3169("֨ܽ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 17599) ^ 1452625351;
                        i5 = 1901680085;
                    } else {
                        iM3169 = (C0619.m2761("᩻᩺") ^ i3) * (-37);
                        i4 = ((iM3169 ^ i2) * 26921) ^ (-834304930);
                        i5 = -772080345;
                    }
                    break;
                case -1896150393:
                case -458024579:
                    this.f32482.postDelayed(runnableC11631, 100L);
                    iM3169 = C0773.m3169("֨ܽ") ^ i2;
                    i4 = ((iM3169 ^ i3) * 17599) ^ 1452625351;
                    i5 = 1901680085;
                    break;
                case -1889001961:
                case -305509756:
                    if (this.f32451) {
                        iM3169 = C0773.m3169("֨ܽ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 17599) ^ 1452625351;
                        i5 = 1901680085;
                    } else {
                        iM3169 = (C0619.m2761("ܺᩴ") ^ i2) * (-93);
                        i4 = ((iM3169 ^ i3) * (-29417)) ^ 1440223039;
                        i5 = 1020995150;
                    }
                    break;
                case -1881566085:
                case -1581620134:
                    if (this.f32452) {
                        iM3169 = (C0773.m3169("ܰ᩵") + i3) * 21;
                        i4 = ((iM3169 ^ i2) * 2039) ^ 816424639;
                        i5 = 1014484565;
                    } else {
                        iM3169 = C0773.m3169("֨ܽ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 17599) ^ 1452625351;
                        i5 = 1901680085;
                    }
                    break;
                case -1839422991:
                case -403485619:
                    if (RunnableC3055.f9898 >= 0) {
                        iM3169 = C0619.m2761("ᩳ۟") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-7179)) ^ 2058078068;
                        i5 = 909756360;
                    } else {
                        iM3169 = C0773.m3169("ۜۙ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-9389)) ^ 1025399885;
                        i5 = -554674974;
                    }
                    break;
                case -1726980122:
                case 525187370:
                    break;
                case -1502347712:
                case -181630617:
                    if (C3033.m9845() > 0) {
                        iM3169 = (C0619.m2761("ܿۚ") + i3) * (-69);
                        i4 = ((iM3169 ^ i2) * (-59)) ^ 1271974799;
                        i5 = 1733805985;
                    } else {
                        iM3169 = C0773.m3169("ۜۙ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-9389)) ^ 1025399885;
                        i5 = -554674974;
                    }
                    break;
                case -1326003788:
                case 1860763682:
                    if (C1146.f4234 >= 0) {
                        iM3169 = (C0773.m3169("۫ۘ") ^ i3) * 101;
                        i4 = ((iM3169 ^ i2) * 31551) ^ 1254230579;
                        i5 = 1067122522;
                    } else {
                        iM3169 = C0619.m2761("ۚᩴ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-31593)) ^ (-1260307469);
                        i5 = 1963908650;
                    }
                    break;
                case -1193310416:
                case 393296271:
                    runnableC11631 = this.f32447;
                    if (C1343.f4799 != 0) {
                        iM3169 = (C0773.m3169("۫ۘ") ^ i3) * 101;
                        i4 = ((iM3169 ^ i2) * 31551) ^ 1254230579;
                        i5 = 1067122522;
                    } else {
                        iM3169 = (i2 - C0619.m2761("ۨ۬")) * (-7);
                        i4 = ((iM3169 ^ i3) * 20993) ^ (-163474450);
                        i5 = 1119026159;
                    }
                    break;
                case -975892126:
                case -784088576:
                    if (this.f32439) {
                        iM3169 = C0773.m3169("֨ܽ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 17599) ^ 1452625351;
                        i5 = 1901680085;
                    } else {
                        iM3169 = C0619.m2761("۬ᩴ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-3267)) ^ (-314545399);
                        i5 = -479323739;
                    }
                    break;
                case -918281655:
                case 799679123:
                    if (C3690.f12684 <= 0) {
                        iM3169 = C0773.m3169("ۜۙ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-9389)) ^ 1025399885;
                        i5 = -554674974;
                    } else {
                        iM3169 = C0619.m2761("ܰᩴ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 2495) ^ 1880764417;
                        i5 = 1446522851;
                    }
                    break;
                case -562871902:
                case 1703958282:
                    if (!RunnableC1848.f6235) {
                        iM3169 = (C0619.m2761("ܿۚ") + i3) * (-69);
                        i4 = ((iM3169 ^ i2) * (-59)) ^ 1271974799;
                        i5 = 1733805985;
                    } else {
                        iM3169 = C0619.m2761("ۡ۠") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-26579)) ^ (-311430604);
                        i5 = 493218270;
                    }
                    break;
                case -445472271:
                case 1844762036:
                    if (C3690.m11987()) {
                        iM3169 = C0619.m2761("ۡ۠") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-26579)) ^ (-311430604);
                        i5 = 493218270;
                    } else {
                        iM3169 = C0619.m2761("ᩴ᩺") ^ i2;
                        i4 = ((iM3169 ^ i3) * 28783) ^ 1412198975;
                        i5 = -2013266181;
                    }
                    break;
                case -441638626:
                case 1874136283:
                    if (C3734.f12817 >= 0) {
                        iM3169 = (C0619.m2761("ܿۚ") + i3) * (-69);
                        i4 = ((iM3169 ^ i2) * (-59)) ^ 1271974799;
                        i5 = 1733805985;
                    } else {
                        iM3169 = (C0619.m2761("۫ۡ") ^ i3) * (-19);
                        i4 = ((iM3169 ^ i2) * (-8703)) ^ (-889768567);
                        i5 = 1721119263;
                    }
                    break;
                case -275177532:
                case 1446236698:
                    C3998.m12920();
                    C17202.m40372();
                    iM3169 = C0773.m3169("ۜۙ") ^ i3;
                    i4 = ((iM3169 ^ i2) * (-9389)) ^ 1025399885;
                    i5 = -554674974;
                    break;
                case -64078918:
                case 43332082:
                    if (this.f32478 != null) {
                        iM3169 = C0619.m2761("᩶᩹") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-293)) ^ 297376499;
                        i5 = 1838552358;
                    } else {
                        iM3169 = C0773.m3169("֨ܽ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 17599) ^ 1452625351;
                        i5 = 1901680085;
                    }
                    break;
                case 133465169:
                case 406161325:
                    if (AbstractC3624.f12429 <= 0) {
                        iM3169 = C0619.m2761("ۡ۠") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-26579)) ^ (-311430604);
                        i5 = 493218270;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ۗܽ")) * 75;
                        i4 = ((iM3169 ^ i2) * (-23659)) ^ 449396459;
                        i5 = -271996047;
                    }
                    break;
                case 187126795:
                case 1747624842:
                    this.f32439 = true;
                    if (RunnableC3646.f12471) {
                        iM3169 = C0619.m2761("ᩳ۟") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-7179)) ^ 2058078068;
                        i5 = 909756360;
                    } else {
                        iM3169 = (C0773.m3169("ܰܶ") + i3) * (-125);
                        i4 = ((iM3169 ^ i2) * (-22307)) ^ 1799845164;
                        i5 = 1878888976;
                    }
                    break;
                case 241839137:
                case 538858428:
                    if (C3077.f9998) {
                        iM3169 = C0773.m3169("ۙܰ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 5671) ^ (-1153694204);
                        i5 = -2051165595;
                    } else {
                        iM3169 = (C0619.m2761("ܿۚ") + i3) * (-69);
                        i4 = ((iM3169 ^ i2) * (-59)) ^ 1271974799;
                        i5 = 1733805985;
                    }
                    break;
                case 264670385:
                case 1068226052:
                    if (C1080.f3865 >= 0) {
                        iM3169 = C0619.m2761("ᩳ۟") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-7179)) ^ 2058078068;
                        i5 = 909756360;
                    } else {
                        iM3169 = (C0619.m2761("ۡ֫") + i2) * (-113);
                        i4 = ((iM3169 ^ i3) * 3467) ^ (-407616440);
                        i5 = 1488534499;
                    }
                    break;
                default:
                    if (C3690.f12684 <= 0) {
                        iM3169 = (C0619.m2761("ܿۚ") + i3) * (-69);
                        i4 = ((iM3169 ^ i2) * (-59)) ^ 1271974799;
                        i5 = 1733805985;
                    } else {
                        iM3169 = (i2 - C0619.m2761("ۡܽ")) * (-9);
                        i4 = ((iM3169 ^ i3) * 19043) ^ (-1247334404);
                        i5 = -763061545;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x01ff A[PHI: r1 r18
      0x01ff: PHI (r1v26 char) = (r1v20 char), (r1v22 char), (r1v27 char) binds: [B:60:0x01e8, B:53:0x01ac, B:34:0x00fc] A[DONT_GENERATE, DONT_INLINE]
      0x01ff: PHI (r18v18 java.lang.String) = (r18v12 java.lang.String), (r18v14 java.lang.String), (r18v19 java.lang.String) binds: [B:60:0x01e8, B:53:0x01ac, B:34:0x00fc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0233 A[PHI: r1 r3 r18
      0x0233: PHI (r1v30 char) = (r1v19 char), (r1v21 char), (r1v23 char), (r1v31 char) binds: [B:64:0x021b, B:57:0x01cb, B:50:0x0190, B:33:0x00f8] A[DONT_GENERATE, DONT_INLINE]
      0x0233: PHI (r3v4 l.᩻ᩳ᩷) = (r3v2 l.᩻ᩳ᩷), (r3v2 l.᩻ᩳ᩷), (r3v2 l.᩻ᩳ᩷), (r3v5 l.᩻ᩳ᩷) binds: [B:64:0x021b, B:57:0x01cb, B:50:0x0190, B:33:0x00f8] A[DONT_GENERATE, DONT_INLINE]
      0x0233: PHI (r18v25 java.lang.String) = (r18v11 java.lang.String), (r18v13 java.lang.String), (r18v15 java.lang.String), (r18v26 java.lang.String) binds: [B:64:0x021b, B:57:0x01cb, B:50:0x0190, B:33:0x00f8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:80:0x02d1 A[PHI: r1 r8 r9 r10 r18
      0x02d1: PHI (r1v36 char) = (r1v13 char), (r1v14 char), (r1v40 char) binds: [B:79:0x02cf, B:75:0x02ac, B:11:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x02d1: PHI (r8v4 int) = (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:79:0x02cf, B:75:0x02ac, B:11:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x02d1: PHI (r9v4 int) = (r9v3 int), (r9v2 int), (r9v2 int) binds: [B:79:0x02cf, B:75:0x02ac, B:11:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x02d1: PHI (r10v4 int) = (r10v2 int), (r10v3 int), (r10v2 int) binds: [B:79:0x02cf, B:75:0x02ac, B:11:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x02d1: PHI (r18v29 java.lang.String) = (r18v5 java.lang.String), (r18v6 java.lang.String), (r18v32 java.lang.String) binds: [B:79:0x02cf, B:75:0x02ac, B:11:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26199() {
        int iM2761;
        int i;
        int i2;
        int iM2762;
        int i3;
        int i4;
        int iM2763;
        int i5;
        int i6;
        String str;
        int i7 = RunnableC3055.f9898;
        int i8 = C3099.f10023;
        int iM2764 = (C0619.m2761("ᩴۨ") ^ i7) * 51;
        int i9 = ((iM2764 ^ i8) * (-10773)) ^ (-1836694615);
        short[] sArr = null;
        short[] sArr2 = null;
        int i10 = iM2764 ^ (-1381899513);
        char c = 0;
        short s = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = -1275511765;
        C25227 c25227 = null;
        String strM6233 = null;
        while (true) {
            i18 = i10 ^ (i9 & (((i18 ^ i8) * 12115) >> 31));
            switch (i18) {
                case -2147464314:
                case 1151356004:
                    strM6233 = strM6233;
                    c = c;
                    if (this.f32463) {
                        iM2761 = C0619.m2761("᩵ۗ") ^ i7;
                        i = ((iM2761 ^ i8) * (-31339)) ^ 1499883287;
                        i2 = -1463277998;
                    } else {
                        iM2761 = (C0773.m3169("ۛᩳ") + i7) * 45;
                        i = ((iM2761 ^ i8) * (-14551)) ^ (-1201578643);
                        i2 = -1341221735;
                    }
                    int i19 = iM2761 ^ i2;
                    c = c;
                    i9 = i;
                    str = strM6233;
                    i10 = i19;
                    strM6233 = str;
                    break;
                case -1943790429:
                case 1382276742:
                    C2310.m7813();
                    if (C20932.f66974 <= 0) {
                        c = c;
                        iM2763 = C0773.m3169("᩻ۗ") ^ i8;
                        i5 = ((iM2763 ^ i7) * 9187) ^ (-1210285229);
                        i6 = -2027466625;
                        i10 = iM2763 ^ i6;
                        int i20 = i5;
                        c = c;
                        i9 = i20;
                    } else {
                        strM6233 = strM6233;
                        c = c;
                        iM2761 = C0619.m2761("᩵ۨ") ^ i7;
                        i = ((iM2761 ^ i8) * (-28497)) ^ 71269925;
                        i2 = 1186594526;
                        int i110 = iM2761 ^ i2;
                        c = c;
                        i9 = i;
                        str = strM6233;
                        i10 = i110;
                        strM6233 = str;
                    }
                    break;
                case -1756424363:
                case 724744418:
                    strM6233 = strM6233;
                    c = c;
                    if (this.f32452) {
                        iM2761 = (C0619.m2761("ᩳ᩵") + i7) * (-61);
                        i = ((iM2761 ^ i8) * (-551)) ^ 1322765786;
                        i2 = -1845641349;
                    } else {
                        iM2761 = C0619.m2761("᩵ۗ") ^ i7;
                        i = ((iM2761 ^ i8) * (-31339)) ^ 1499883287;
                        i2 = -1463277998;
                    }
                    int i111 = iM2761 ^ i2;
                    c = c;
                    i9 = i;
                    str = strM6233;
                    i10 = i111;
                    strM6233 = str;
                    break;
                case -1694080754:
                case 2099154569:
                    strM6233 = strM6233;
                    c = c;
                    i17 = 58;
                    if (AbstractC3624.f12429 > 0) {
                        iM2761 = (C0773.m3169("֫ۘ") + i7) * (-113);
                        i = ((iM2761 ^ i8) * (-21175)) ^ (-1305866429);
                        i2 = 2126368285;
                        int i112 = iM2761 ^ i2;
                        c = c;
                        i9 = i;
                        str = strM6233;
                        i10 = i112;
                        strM6233 = str;
                    } else {
                        strM6233 = strM6233;
                        iM2763 = C0773.m3169("᩻ۗ") ^ i8;
                        i5 = ((iM2763 ^ i7) * 9187) ^ (-1210285229);
                        i6 = -2027466625;
                        i10 = iM2763 ^ i6;
                        int i21 = i5;
                        c = c;
                        i9 = i21;
                    }
                    break;
                case -1481447607:
                case 391373831:
                    strM6233 = strM6233;
                    c = c;
                    if (this.f32467) {
                        iM2761 = C0619.m2761("ۛܽ") ^ i8;
                        i = ((iM2761 ^ i7) * 5247) ^ (-717168134);
                        i2 = 513778438;
                    } else {
                        iM2761 = C0619.m2761("᩵ۗ") ^ i7;
                        i = ((iM2761 ^ i8) * (-31339)) ^ 1499883287;
                        i2 = -1463277998;
                    }
                    int i113 = iM2761 ^ i2;
                    c = c;
                    i9 = i;
                    str = strM6233;
                    i10 = i113;
                    strM6233 = str;
                    break;
                case -1403044813:
                case 1620886961:
                    C2354.m7983();
                    if (C2288.f7433 <= 0) {
                        int iM3169 = (C0773.m3169("᩺۬") ^ i7) * 3;
                        i10 = iM3169 ^ 846952449;
                        i9 = ((iM3169 ^ i8) * (-9001)) ^ (-1787493863);
                    } else {
                        c = c;
                        iM2763 = C0773.m3169("᩻ۗ") ^ i8;
                        i5 = ((iM2763 ^ i7) * 9187) ^ (-1210285229);
                        i6 = -2027466625;
                        i10 = iM2763 ^ i6;
                        int i22 = i5;
                        c = c;
                        i9 = i22;
                    }
                    break;
                case -1398394295:
                case -1279669773:
                    C3099.m10095();
                    C23916.m53419();
                    break;
                case -1349430252:
                case 1676240148:
                    strM6233 = strM6233;
                    c = c;
                    i12 = i11 * i11;
                    i13 = s * s;
                    if (C0619.m2763()) {
                        iM2761 = (C0773.m3169("ᩳܰ") ^ i8) * 95;
                        i = ((iM2761 ^ i7) * (-17931)) ^ 730247984;
                        i2 = 1950257520;
                    } else {
                        iM2761 = (C0773.m3169("ۖ᩺") ^ i7) * (-63);
                        i = ((iM2761 ^ i8) * 2659) ^ 1909437764;
                        i2 = -1631414645;
                    }
                    int i114 = iM2761 ^ i2;
                    c = c;
                    i9 = i;
                    str = strM6233;
                    i10 = i114;
                    strM6233 = str;
                    break;
                case -1301788171:
                case 1444630064:
                    C2702.m8876();
                    if (C23916.f77426 <= 0) {
                        strM6233 = strM6233;
                        c = c;
                        iM2761 = C0619.m2761("۟᩸") ^ i7;
                        i = ((iM2761 ^ i8) * (-12451)) ^ 1636647469;
                        i2 = 1178805454;
                        int i115 = iM2761 ^ i2;
                        c = c;
                        i9 = i;
                        str = strM6233;
                        i10 = i115;
                        strM6233 = str;
                    } else {
                        int iM31610 = (C0773.m3169("᩺۬") ^ i7) * 3;
                        i10 = iM31610 ^ 846952449;
                        i9 = ((iM31610 ^ i8) * (-9001)) ^ (-1787493863);
                    }
                    break;
                case -1292655988:
                case 166989399:
                    strM6233 = strM6233;
                    c = c;
                    sArr = f32436;
                    if (RunnableC0334.f1808 <= 0) {
                        iM2761 = C0619.m2761("۟᩸") ^ i7;
                        i = ((iM2761 ^ i8) * (-12451)) ^ 1636647469;
                        i2 = 1178805454;
                    } else {
                        iM2761 = C0619.m2761("ܺ᩵") ^ i8;
                        i = ((iM2761 ^ i7) * (-4711)) ^ (-1313777142);
                        i2 = 1119017574;
                    }
                    int i116 = iM2761 ^ i2;
                    c = c;
                    i9 = i;
                    str = strM6233;
                    i10 = i116;
                    strM6233 = str;
                    break;
                case -1236278333:
                case 1121446612:
                    strM6233 = strM6233;
                    c = c;
                    if (this.f32463) {
                        iM2761 = (C0773.m3169("᩷ۜ") + i8) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM2761 ^ i7) * (-32325)) ^ (-1134299578);
                        i2 = 1115706310;
                    } else {
                        iM2761 = C0619.m2761("᩶᩹") ^ i8;
                        i = ((iM2761 ^ i7) * 17561) ^ 1157149327;
                        i2 = 396122664;
                    }
                    int i117 = iM2761 ^ i2;
                    c = c;
                    i9 = i;
                    str = strM6233;
                    i10 = i117;
                    strM6233 = str;
                    break;
                case -1067870612:
                case -545877691:
                    C3448.m11248();
                    C2288.m7767();
                    strM6233 = strM6233;
                    c = c;
                    iM2761 = C0619.m2761("᩵ۨ") ^ i7;
                    i = ((iM2761 ^ i8) * (-28497)) ^ 71269925;
                    i2 = 1186594526;
                    int i118 = iM2761 ^ i2;
                    c = c;
                    i9 = i;
                    str = strM6233;
                    i10 = i118;
                    strM6233 = str;
                    break;
                case -939163916:
                case 1272888248:
                    i15 = 30758;
                    iM2761 = C0619.m2761("۫ۙ") ^ i8;
                    i = ((iM2761 ^ i7) * (-25579)) ^ 330916318;
                    i2 = -665686962;
                    int i119 = iM2761 ^ i2;
                    c = c;
                    i9 = i;
                    str = strM6233;
                    i10 = i119;
                    strM6233 = str;
                    break;
                case -698620830:
                case 1740584736:
                    c = c;
                    strM6233 = C1783.m6233(sArr2, i16, i17, i15);
                    if (RunnableC3055.f9898 >= 0) {
                        iM2763 = C0773.m3169("᩻ۗ") ^ i8;
                        i5 = ((iM2763 ^ i7) * 9187) ^ (-1210285229);
                        i6 = -2027466625;
                    } else {
                        iM2763 = (C0619.m2761("֡᩸") + i8) * (-51);
                        i5 = ((iM2763 ^ i7) * (-30177)) ^ (-353385432);
                        i6 = 1011762323;
                    }
                    i10 = iM2763 ^ i6;
                    int i23 = i5;
                    c = c;
                    i9 = i23;
                    break;
                case -501071610:
                case 402309668:
                    c = c;
                    c25227.stopScroll();
                    this.f32464 = false;
                    if (AbstractC0641.m2813() > 0) {
                        iM2763 = (C0773.m3169("ۖ۠") + i8) * 17;
                        i5 = ((iM2763 ^ i7) * (-23917)) ^ 432807984;
                        i6 = 674166103;
                        i10 = iM2763 ^ i6;
                        int i24 = i5;
                        c = c;
                        i9 = i24;
                    } else {
                        strM6233 = strM6233;
                        iM2761 = C0619.m2761("᩵ۨ") ^ i7;
                        i = ((iM2761 ^ i8) * (-28497)) ^ 71269925;
                        i2 = 1186594526;
                        int i1110 = iM2761 ^ i2;
                        c = c;
                        i9 = i;
                        str = strM6233;
                        i10 = i1110;
                        strM6233 = str;
                    }
                    break;
                case -380668708:
                case 1932305075:
                    strM6233 = strM6233;
                    c = c;
                    sArr2 = f32436;
                    i16 = 432;
                    if (C1321.f4751 < 0) {
                        iM2761 = C0619.m2761("ۚۗ") ^ i7;
                        i = ((iM2761 ^ i8) * 4897) ^ 805872792;
                        i2 = 1897549239;
                        int i1111 = iM2761 ^ i2;
                        c = c;
                        i9 = i;
                        str = strM6233;
                        i10 = i1111;
                        strM6233 = str;
                    }
                    c = c;
                    iM2762 = C0619.m2761("ۢ۬") ^ i8;
                    i3 = ((iM2762 ^ i7) * 12021) ^ 1540945794;
                    i4 = -1471980764;
                    str = strM6233;
                    i10 = iM2762 ^ i4;
                    i9 = i3;
                    strM6233 = str;
                    break;
                case -292490620:
                case 2096979470:
                    strM6233 = strM6233;
                    c = c;
                    int i25 = i13 + i14;
                    if (i12 - (i25 + i25) <= 0) {
                        iM2761 = (C0773.m3169("ۚ᩵") + i7) * 57;
                        i = ((iM2761 ^ i8) * (-15423)) ^ 1265728106;
                        i2 = 1550474265;
                    } else {
                        iM2761 = (C0773.m3169("ۢۤ") + i8) * 109;
                        i = ((iM2761 ^ i7) * (-8725)) ^ (-53772120);
                        i2 = -798177136;
                    }
                    int i1112 = iM2761 ^ i2;
                    c = c;
                    i9 = i;
                    str = strM6233;
                    i10 = i1112;
                    strM6233 = str;
                    break;
                case -267289112:
                case 1690350466:
                    if (C3690.f12684 > 0) {
                        strM6233 = strM6233;
                        c = c;
                        iM2761 = (C0773.m3169("ᩳܰ") ^ i8) * 95;
                        i = ((iM2761 ^ i7) * (-17931)) ^ 730247984;
                        i2 = 1950257520;
                        int i1113 = iM2761 ^ i2;
                        c = c;
                        i9 = i;
                        str = strM6233;
                        i10 = i1113;
                        strM6233 = str;
                    }
                    strM6233 = strM6233;
                    c = c;
                    iM2761 = C0619.m2761("۟᩸") ^ i7;
                    i = ((iM2761 ^ i8) * (-12451)) ^ 1636647469;
                    i2 = 1178805454;
                    int i1114 = iM2761 ^ i2;
                    c = c;
                    i9 = i;
                    str = strM6233;
                    i10 = i1114;
                    strM6233 = str;
                    break;
                case -171974905:
                case 594638731:
                    c = c;
                    this.f32469 = 0L;
                    m26205();
                    strM6233 = strM6233;
                    iM2761 = C0619.m2761("᩵ۗ") ^ i7;
                    i = ((iM2761 ^ i8) * (-31339)) ^ 1499883287;
                    i2 = -1463277998;
                    int i1115 = iM2761 ^ i2;
                    c = c;
                    i9 = i;
                    str = strM6233;
                    i10 = i1115;
                    strM6233 = str;
                    break;
                case -36227221:
                case 976410205:
                    strM6233 = strM6233;
                    c = c;
                    i14 = 391762849;
                    if (C13473.f42873 != 0) {
                        iM2761 = (C0773.m3169("ᩳܰ") ^ i8) * 95;
                        i = ((iM2761 ^ i7) * (-17931)) ^ 730247984;
                        i2 = 1950257520;
                    } else {
                        iM2761 = C0619.m2761("۬ܰ") ^ i8;
                        i = ((iM2761 ^ i7) * 25467) ^ (-1258861144);
                        i2 = 615479628;
                    }
                    int i1116 = iM2761 ^ i2;
                    c = c;
                    i9 = i;
                    str = strM6233;
                    i10 = i1116;
                    strM6233 = str;
                    break;
                case 242150136:
                case 1187873346:
                    c = c;
                    c25227 = this.f32450;
                    if (c25227 == null) {
                        strM6233 = strM6233;
                        iM2761 = C0619.m2761("᩵ۗ") ^ i7;
                        i = ((iM2761 ^ i8) * (-31339)) ^ 1499883287;
                        i2 = -1463277998;
                        int i1117 = iM2761 ^ i2;
                        c = c;
                        i9 = i;
                        str = strM6233;
                        i10 = i1117;
                        strM6233 = str;
                    } else {
                        iM2763 = (i7 - C0619.m2761("ܰ֡")) * (-69);
                        i5 = ((iM2763 ^ i8) * (-4753)) ^ (-263236213);
                        i6 = -241952315;
                        i10 = iM2763 ^ i6;
                        int i26 = i5;
                        c = c;
                        i9 = i26;
                    }
                    break;
                case 280122017:
                case 1528711818:
                    c = c;
                    strM6233 = strM6233;
                    this.f32482.evaluateJavascript(m26161(strM6233), null);
                    iM2761 = (C0773.m3169("᩷ۜ") + i8) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i = ((iM2761 ^ i7) * (-32325)) ^ (-1134299578);
                    i2 = 1115706310;
                    int i1118 = iM2761 ^ i2;
                    c = c;
                    i9 = i;
                    str = strM6233;
                    i10 = i1118;
                    strM6233 = str;
                    break;
                case 450943643:
                case 528641216:
                    strM6233 = strM6233;
                    c = 431;
                    if (AbstractC3624.f12429 <= 0) {
                        iM2762 = C0619.m2761("ۢ۬") ^ i8;
                        i3 = ((iM2762 ^ i7) * 12021) ^ 1540945794;
                        i4 = -1471980764;
                    } else {
                        iM2762 = (C0619.m2761("ܺ᩷") ^ i7) * (-127);
                        i3 = ((iM2762 ^ i8) * 13367) ^ 1903153696;
                        i4 = -492521578;
                    }
                    str = strM6233;
                    i10 = iM2762 ^ i4;
                    i9 = i3;
                    strM6233 = str;
                    break;
                case 488218299:
                case 1338895981:
                    strM6233 = strM6233;
                    c = c;
                    if (this.f32478 != null) {
                        iM2761 = (C0773.m3169("֫᩶") + i8) * (-23);
                        i = ((iM2761 ^ i7) * 29205) ^ 1464959886;
                        i2 = -113893179;
                    } else {
                        iM2761 = (C0773.m3169("᩷ۜ") + i8) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM2761 ^ i7) * (-32325)) ^ (-1134299578);
                        i2 = 1115706310;
                    }
                    int i1119 = iM2761 ^ i2;
                    c = c;
                    i9 = i;
                    str = strM6233;
                    i10 = i1119;
                    strM6233 = str;
                    break;
                case 1051829999:
                case 1220348678:
                    strM6233 = strM6233;
                    c = c;
                    s = sArr[c];
                    if (C0950.f3488 >= 0) {
                        iM2761 = C0619.m2761("᩵ۨ") ^ i7;
                        i = ((iM2761 ^ i8) * (-28497)) ^ 71269925;
                        i2 = 1186594526;
                    } else {
                        iM2761 = C0619.m2761("ۛܺ") ^ i7;
                        i = ((iM2761 ^ i8) * 30383) ^ 1951049301;
                        i2 = -754313352;
                    }
                    int i11110 = iM2761 ^ i2;
                    c = c;
                    i9 = i;
                    str = strM6233;
                    i10 = i11110;
                    strM6233 = str;
                    break;
                case 1327489077:
                case 2093094718:
                    i15 = 58702;
                    iM2761 = C0619.m2761("۫ۙ") ^ i8;
                    i = ((iM2761 ^ i7) * (-25579)) ^ 330916318;
                    i2 = -665686962;
                    int i11111 = iM2761 ^ i2;
                    c = c;
                    i9 = i;
                    str = strM6233;
                    i10 = i11111;
                    strM6233 = str;
                    break;
                case 1657938078:
                case 2044478341:
                    break;
                default:
                    strM6233 = strM6233;
                    c = c;
                    i11 = s + 19793;
                    if (C2354.f7599 < 0) {
                        iM2761 = (C0773.m3169("ۜۢ") ^ i8) * 69;
                        i = ((iM2761 ^ i7) * (-23177)) ^ 71147100;
                        i2 = 1639166228;
                        int i11112 = iM2761 ^ i2;
                        c = c;
                        i9 = i;
                        str = strM6233;
                        i10 = i11112;
                        strM6233 = str;
                    }
                    c = c;
                    iM2762 = C0619.m2761("ۢ۬") ^ i8;
                    i3 = ((iM2762 ^ i7) * 12021) ^ 1540945794;
                    i4 = -1471980764;
                    str = strM6233;
                    i10 = iM2762 ^ i4;
                    i9 = i3;
                    strM6233 = str;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26200() {
        boolean z = false;
        int i = -1232583772;
        int i2 = C1519.f5300;
        int i3 = C2288.f7433;
        int iM2761 = C0619.m2761("۫ۢ") ^ i3;
        int i4 = ((iM2761 ^ i2) * (-9371)) ^ (-95169858);
        int i5 = -1949054380;
        while (true) {
            i = ((((i ^ i2) * (-28111)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2117495692:
                case 2039069321:
                    if (C3448.f11240 >= 0) {
                        iM2761 = (C0773.m3169("ۢ۟") + i2) * (-91);
                        i4 = ((iM2761 ^ i3) * 11375) ^ (-758749059);
                        i5 = 5635555;
                    } else {
                        iM2761 = C0619.m2761("᩸ۛ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-3361)) ^ 489158313;
                        i5 = -518182839;
                    }
                    break;
                case -2092157833:
                case -1398201343:
                    if (C2834.f9334 <= 0) {
                        iM2761 = C0773.m3169("᩺᩻") ^ i3;
                        i4 = ((iM2761 ^ i2) * 29019) ^ 80833685;
                        i5 = 1133934280;
                    } else {
                        iM2761 = C0619.m2761("ܽܺ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-17815)) ^ 1399652438;
                        i5 = 815880308;
                    }
                    break;
                case -1914596849:
                case -965735731:
                    RunnableC3646.m11813();
                    break;
                case -1888397978:
                case -1090485552:
                    if (C3099.m10095()) {
                        iM2761 = (C0773.m3169("ۢ۟") + i2) * (-91);
                        i4 = ((iM2761 ^ i3) * 11375) ^ (-758749059);
                        i5 = 5635555;
                    } else {
                        iM2761 = C0773.m3169("ܿܳ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 12687) ^ 1735089723;
                        i5 = 553573842;
                    }
                    break;
                case -1577194267:
                case 1926076677:
                    if (C0773.f2792 > 0) {
                        iM2761 = (i2 - C0773.m3169("ۚ᩵")) * (-109);
                        i4 = ((iM2761 ^ i3) * 29483) ^ 461662093;
                        i5 = 1492327690;
                    } else {
                        iM2761 = C0773.m3169("᩺᩻") ^ i3;
                        i4 = ((iM2761 ^ i2) * 29019) ^ 80833685;
                        i5 = 1133934280;
                    }
                    break;
                case -1239631977:
                case -330681579:
                    z = false;
                    if (C0269.f1558 <= 0) {
                        iM2761 = (i3 - C0773.m3169("۬ۚ")) * 19;
                        i4 = ((iM2761 ^ i2) * (-19979)) ^ (-1092333686);
                        i5 = 1053156792;
                    } else {
                        iM2761 = C0773.m3169("ۤۖ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 11675) ^ (-16491362);
                        i5 = 2111177101;
                    }
                    break;
                case -1204419444:
                case 528808610:
                    this.f32461 = z;
                    m26199();
                    break;
                case -1055278467:
                case 527320533:
                    if (RunnableC3055.f9898 >= 0) {
                        iM2761 = (C0773.m3169("ۢ۟") + i2) * (-91);
                        i4 = ((iM2761 ^ i3) * 11375) ^ (-758749059);
                        i5 = 5635555;
                    } else {
                        iM2761 = (i3 - C0619.m2761("۬ۙ")) * (-65);
                        i4 = ((iM2761 ^ i2) * 18735) ^ 1501735825;
                        i5 = 1314121248;
                    }
                    break;
                case -933672656:
                case 1800774917:
                    if (AbstractC3624.f12429 <= 0) {
                        iM2761 = (C0773.m3169("ۢ۟") + i2) * (-91);
                        i4 = ((iM2761 ^ i3) * 11375) ^ (-758749059);
                        i5 = 5635555;
                    } else {
                        iM2761 = (i2 - C0773.m3169("ۙܳ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM2761 ^ i3) * 23277) ^ (-1841914298);
                        i5 = -1838208610;
                    }
                    break;
                case -377409442:
                case 620683017:
                    m26210();
                    if (C3077.m10041()) {
                        iM2761 = (i2 - C0773.m3169("ۚ᩵")) * (-109);
                        i4 = ((iM2761 ^ i3) * 29483) ^ 461662093;
                        i5 = 1492327690;
                    } else {
                        iM2761 = C0773.m3169("᩷᩵") ^ i2;
                        i4 = ((iM2761 ^ i3) * 31301) ^ (-1324944619);
                        i5 = -1978881755;
                    }
                    break;
                case 49588426:
                case 1118575963:
                    if (C4238.f15451 < 0) {
                        iM2761 = C0773.m3169("᩺᩻") ^ i3;
                        i4 = ((iM2761 ^ i2) * 29019) ^ 80833685;
                        i5 = 1133934280;
                    } else {
                        iM2761 = (C0773.m3169("ۢ۟") + i2) * (-91);
                        i4 = ((iM2761 ^ i3) * 11375) ^ (-758749059);
                        i5 = 5635555;
                    }
                    break;
                case 566697684:
                case 1233311024:
                    RunnableC3646.m11813();
                    iM2761 = (C0773.m3169("ۢ۟") + i2) * (-91);
                    i4 = ((iM2761 ^ i3) * 11375) ^ (-758749059);
                    i5 = 5635555;
                    break;
                case 745132544:
                case 1192221744:
                    if (C1080.f3865 >= 0) {
                        iM2761 = (C0773.m3169("ۢ۟") + i2) * (-91);
                        i4 = ((iM2761 ^ i3) * 11375) ^ (-758749059);
                        i5 = 5635555;
                    } else {
                        iM2761 = C0773.m3169("ۢۢ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-5325)) ^ 2112689565;
                        i5 = 667678474;
                    }
                    break;
                case 1048994685:
                case 1433499588:
                    if (C0487.f2131 <= 0) {
                        iM2761 = C0773.m3169("᩺᩻") ^ i3;
                        i4 = ((iM2761 ^ i2) * 29019) ^ 80833685;
                        i5 = 1133934280;
                    } else {
                        iM2761 = C0773.m3169("ܿܽ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 31701) ^ 1860075460;
                        i5 = 2101118294;
                    }
                    break;
                case 1391696052:
                case 2023351925:
                    if (C11235.f35427 >= 0) {
                        iM2761 = (i2 - C0773.m3169("ۚ᩵")) * (-109);
                        i4 = ((iM2761 ^ i3) * 29483) ^ 461662093;
                        i5 = 1492327690;
                    } else {
                        iM2761 = C0619.m2761("۫ܿ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-22349)) ^ (-1571172457);
                        i5 = 388433083;
                    }
                    break;
                default:
                    if (C1783.f6087 <= 0) {
                        iM2761 = (C0773.m3169("ۢ۟") + i2) * (-91);
                        i4 = ((iM2761 ^ i3) * 11375) ^ (-758749059);
                        i5 = 5635555;
                    } else {
                        iM2761 = (i2 - C0619.m2761("֨᩶")) * 77;
                        i4 = ((iM2761 ^ i3) * (-22895)) ^ 40569949;
                        i5 = 1096619380;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [l.ۧ۬֫] */
    public C10139(FrameLayout frameLayout, WebView webView, C19090 c19090, RunnableC0313 runnableC0313, RunnableC11209 runnableC11209, RunnableC13526 runnableC13526) {
        int iM3169;
        int i;
        int i2;
        FrameLayout frameLayout2 = frameLayout;
        final C19090 c19091 = c19090;
        int i3 = 0;
        boolean z = false;
        Context contextM6308 = null;
        ViewConfiguration viewConfiguration = null;
        int scaledTouchSlop = 0;
        int iM7764 = 0;
        int i4 = -405994948;
        int i5 = C1783.f6087;
        int i6 = C1519.f5300;
        int iM31610 = C0773.m3169("ۢۧ") ^ i5;
        int i7 = ((iM31610 ^ i6) * (-15847)) ^ (-119378616);
        int i8 = -736753719;
        while (true) {
            int i9 = iM31610 ^ i8;
            while (true) {
                i4 = ((((i4 ^ i6) * 22845) >> 31) & i7) ^ i9;
                switch (i4) {
                    case -2108407198:
                    case 768336352:
                        this.f32467 = c19091.f61806;
                        frameLayout2.addOnLayoutChangeListener(new View.OnLayoutChangeListener(this) { // from class: l.᩻۬֫

                            /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
                            public final /* synthetic */ C10139 f81044;

                            {
                                int i10 = 1346348793;
                                int i11 = C1321.f4751;
                                int i12 = C2375.f7641;
                                int iM31611 = C0773.m3169("ۘ᩷") ^ i12;
                                int i13 = ((iM31611 ^ i11) * (-29905)) ^ 1788435723;
                                int i14 = -803088403;
                                while (true) {
                                    i10 = ((((i10 ^ i11) * (-9349)) >> 31) & i13) ^ (iM31611 ^ i14);
                                    switch (i10) {
                                        case -1852871517:
                                        case 1782259695:
                                            if (C3033.f9831 >= 0) {
                                                iM31611 = C0619.m2761("֨ᩳ") ^ i12;
                                                i13 = ((iM31611 ^ i11) * (-16409)) ^ 25682855;
                                                i14 = -877566258;
                                            } else {
                                                iM31611 = (i12 - C0619.m2761("ۗ۟")) * 15;
                                                i13 = ((iM31611 ^ i11) * 4453) ^ 1747686916;
                                                i14 = -1974288557;
                                            }
                                            break;
                                        case -1785670241:
                                        case -1569884646:
                                            if (C2702.f8586 <= 0) {
                                                iM31611 = C0773.m3169("۫ۡ") ^ i11;
                                                i13 = ((iM31611 ^ i12) * (-6905)) ^ (-2124048893);
                                                i14 = -218608966;
                                            } else {
                                                iM31611 = (C0619.m2761("ᩳۗ") + i12) * 39;
                                                i13 = ((iM31611 ^ i11) * 23799) ^ 691976104;
                                                i14 = -1678940167;
                                            }
                                            break;
                                        case -1718619785:
                                        case 1090584402:
                                            if (C17202.f56030) {
                                                iM31611 = C0619.m2761("ۗܺ") ^ i11;
                                                i13 = ((iM31611 ^ i12) * (-24273)) ^ 1553071978;
                                                i14 = 83194402;
                                            } else {
                                                iM31611 = C0773.m3169("ۢ۬") ^ i12;
                                                i13 = ((iM31611 ^ i11) * (-17227)) ^ (-2141186924);
                                                i14 = -1403663383;
                                            }
                                            break;
                                        case -1709141450:
                                        case 566935117:
                                            C2375.m8065();
                                            iM31611 = C0773.m3169("ۢ۬") ^ i12;
                                            i13 = ((iM31611 ^ i11) * (-17227)) ^ (-2141186924);
                                            i14 = -1403663383;
                                            break;
                                        case -1693016360:
                                        case 1415596183:
                                            if (C2354.f7599 >= 0) {
                                                iM31611 = (C0619.m2761("ۨ᩵") + i11) * 101;
                                                i13 = ((iM31611 ^ i12) * 30783) ^ (-1095473004);
                                                i14 = -1687835291;
                                            } else {
                                                iM31611 = C0773.m3169("ۢ۬") ^ i12;
                                                i13 = ((iM31611 ^ i11) * (-17227)) ^ (-2141186924);
                                                i14 = -1403663383;
                                            }
                                            break;
                                        case -1470254148:
                                        case 1387225132:
                                            if (C4238.f15451 >= 0) {
                                                iM31611 = (C0619.m2761("ۡܽ") + i12) * (-47);
                                                i13 = ((iM31611 ^ i11) * (-4547)) ^ (-1380081924);
                                                i14 = -575992072;
                                            } else {
                                                iM31611 = C0773.m3169("ۢ۠") ^ i11;
                                                i13 = ((iM31611 ^ i12) * (-13831)) ^ 1710220509;
                                                i14 = 1963105155;
                                            }
                                            break;
                                        case -1286454618:
                                        case -661945382:
                                            RunnableC3055.m9933();
                                            C17202.m40372();
                                            throw new RuntimeException();
                                        case -1152751562:
                                        case 1714867117:
                                            if (C2287.f7432 >= 0) {
                                                iM31611 = (C0619.m2761("ۨ᩵") + i11) * 101;
                                                i13 = ((iM31611 ^ i12) * 30783) ^ (-1095473004);
                                                i14 = -1687835291;
                                            } else {
                                                iM31611 = C0773.m3169("ܽۜ") ^ i12;
                                                i13 = ((iM31611 ^ i11) * (-20719)) ^ 1636192321;
                                                i14 = -447668251;
                                            }
                                            break;
                                        case -1083229316:
                                        case 1753358980:
                                            C0487.m2356();
                                            if (C2834.f9334 <= 0) {
                                                iM31611 = C0773.m3169("۫ۡ") ^ i11;
                                                i13 = ((iM31611 ^ i12) * (-6905)) ^ (-2124048893);
                                                i14 = -218608966;
                                            } else {
                                                iM31611 = (C0619.m2761("ۨ᩵") + i11) * 101;
                                                i13 = ((iM31611 ^ i12) * 30783) ^ (-1095473004);
                                                i14 = -1687835291;
                                            }
                                            break;
                                        case -844301494:
                                        case 1435235762:
                                            if (C2287.f7432 >= 0) {
                                                iM31611 = C0773.m3169("ۢ۬") ^ i12;
                                                i13 = ((iM31611 ^ i11) * (-17227)) ^ (-2141186924);
                                                i14 = -1403663383;
                                            } else {
                                                iM31611 = (i11 - C0619.m2761("ۙ᩹")) * 27;
                                                i13 = ((iM31611 ^ i12) * 12863) ^ (-688012796);
                                                i14 = -1530355428;
                                            }
                                            break;
                                        case -805603103:
                                        case 919519909:
                                            if (C3998.f13671 != 0) {
                                                iM31611 = C0773.m3169("ۢ۬") ^ i12;
                                                i13 = ((iM31611 ^ i11) * (-17227)) ^ (-2141186924);
                                                i14 = -1403663383;
                                            } else {
                                                iM31611 = C0773.m3169("֫᩵") ^ i11;
                                                i13 = ((iM31611 ^ i12) * (-707)) ^ 1223224096;
                                                i14 = -546570944;
                                            }
                                            break;
                                        case -744843066:
                                        case -362919609:
                                            if (C0773.f2792 <= 0) {
                                                iM31611 = (C0619.m2761("ۨ᩵") + i11) * 101;
                                                i13 = ((iM31611 ^ i12) * 30783) ^ (-1095473004);
                                                i14 = -1687835291;
                                            } else {
                                                iM31611 = C0619.m2761("᩻ܽ") ^ i12;
                                                i13 = ((iM31611 ^ i11) * 28601) ^ (-900270075);
                                                i14 = 903698185;
                                            }
                                            break;
                                        case 1464946173:
                                        case 1586674951:
                                            if (!C1783.m6232()) {
                                                iM31611 = C0619.m2761("֨ᩳ") ^ i12;
                                                i13 = ((iM31611 ^ i11) * (-16409)) ^ 25682855;
                                                i14 = -877566258;
                                            } else {
                                                iM31611 = C0773.m3169("ۢ۬") ^ i12;
                                                i13 = ((iM31611 ^ i11) * (-17227)) ^ (-2141186924);
                                                i14 = -1403663383;
                                            }
                                            break;
                                        case 1729628529:
                                        case 2076605903:
                                            return;
                                        case 1985105337:
                                        case 2046027793:
                                            if (C2287.f7432 >= 0) {
                                                iM31611 = (C0619.m2761("ۡܽ") + i12) * (-47);
                                                i13 = ((iM31611 ^ i11) * (-4547)) ^ (-1380081924);
                                                i14 = -575992072;
                                            } else {
                                                iM31611 = C0773.m3169("֫ۢ") ^ i12;
                                                i13 = ((iM31611 ^ i11) * 24665) ^ (-1525121933);
                                                i14 = 331754399;
                                            }
                                            break;
                                        default:
                                            this.f81044 = this;
                                            if (RunnableC0334.m2063()) {
                                                iM31611 = (C0619.m2761("ۨ᩵") + i11) * 101;
                                                i13 = ((iM31611 ^ i12) * 30783) ^ (-1095473004);
                                                i14 = -1687835291;
                                            } else {
                                                iM31611 = C0773.m3169("ᩴۘ") ^ i11;
                                                i13 = ((iM31611 ^ i12) * (-4353)) ^ 1280764801;
                                                i14 = 500272553;
                                            }
                                            break;
                                    }
                                }
                            }

                            @Override // android.view.View.OnLayoutChangeListener
                            public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                                int i18 = 0;
                                int i19 = -795252214;
                                int i20 = C4282.f15546;
                                int i21 = AbstractC0641.f2496;
                                int iM2761 = (i21 - C0619.m2761("ۘ۠")) * 63;
                                int i22 = ((iM2761 ^ i20) * (-26789)) ^ 1023440089;
                                int i23 = 770034423;
                                while (true) {
                                    i19 = ((((i19 ^ i20) * 4655) >> 31) & i22) ^ (iM2761 ^ i23);
                                    switch (i19) {
                                        case -1940167302:
                                        case -187485536:
                                            if (RunnableC0334.f1808 <= 0) {
                                                iM2761 = C0773.m3169("ۙ۫") ^ i21;
                                                i22 = ((iM2761 ^ i20) * 28719) ^ (-1404544589);
                                                i23 = -674029851;
                                            } else {
                                                iM2761 = (C0619.m2761("֡۬") + i21) * (-19);
                                                i22 = ((iM2761 ^ i20) * (-27591)) ^ 663577865;
                                                i23 = 110358874;
                                            }
                                            break;
                                        case -1799130583:
                                        case 129774945:
                                            i18 = C2485.f7950;
                                            iM2761 = C0619.m2761("ۤ᩵") ^ i21;
                                            i22 = ((iM2761 ^ i20) * 17811) ^ 617390828;
                                            i23 = 628655883;
                                            break;
                                        case -1654699288:
                                        case -1041257357:
                                            if (C13473.m33144()) {
                                                iM2761 = C0619.m2761("ۢܽ") ^ i21;
                                                i22 = ((iM2761 ^ i20) * 27451) ^ (-1719507717);
                                                i23 = -688793272;
                                            } else {
                                                iM2761 = (C0619.m2761("ܰܶ") ^ i20) * 17;
                                                i22 = ((iM2761 ^ i21) * 18311) ^ 564859437;
                                                i23 = 545233977;
                                            }
                                            break;
                                        case -1582288080:
                                        case -1282393472:
                                            if (C1146.f4234 >= 0) {
                                                iM2761 = (C0773.m3169("۬ᩳ") + i21) * 59;
                                                i22 = ((iM2761 ^ i20) * 8345) ^ 1081369275;
                                                i23 = 1339001703;
                                            } else {
                                                iM2761 = C0773.m3169("᩺֡") ^ i20;
                                                i22 = ((iM2761 ^ i21) * (-12127)) ^ (-1441394777);
                                                i23 = 1490968059;
                                            }
                                            break;
                                        case -1347558680:
                                        case -1138407098:
                                            if (i18 != 0) {
                                                iM2761 = C0619.m2761("ۡ᩺") ^ i21;
                                                i22 = ((iM2761 ^ i20) * (-12005)) ^ 237909160;
                                                i23 = 2000686501;
                                            } else {
                                                iM2761 = (C0773.m3169("ܰۖ") + i20) * 77;
                                                i22 = ((iM2761 ^ i21) * (-30457)) ^ (-675660223);
                                                i23 = -245973345;
                                            }
                                            break;
                                        case -1329688572:
                                        case 1169815609:
                                            if (C0862.f3233 != 0) {
                                                iM2761 = (C0619.m2761("ܰܶ") ^ i20) * 17;
                                                i22 = ((iM2761 ^ i21) * 18311) ^ 564859437;
                                                i23 = 545233977;
                                            } else {
                                                iM2761 = (C0773.m3169("ۚ᩷") ^ i20) * 93;
                                                i22 = ((iM2761 ^ i21) * (-32299)) ^ 665208816;
                                                i23 = -1767973055;
                                            }
                                            break;
                                        case -1265919677:
                                        case -1038144026:
                                            if (C1343.m4943()) {
                                                iM2761 = (C0619.m2761("֨ܶ") + i20) * 57;
                                                i22 = ((iM2761 ^ i21) * 28065) ^ 1147015232;
                                                i23 = -239435975;
                                            } else {
                                                iM2761 = (C0619.m2761("ܰܶ") ^ i20) * 17;
                                                i22 = ((iM2761 ^ i21) * 18311) ^ 564859437;
                                                i23 = 545233977;
                                            }
                                            break;
                                        case -935185651:
                                        case 1541098003:
                                            if (C2354.f7599 >= 0) {
                                                iM2761 = (C0619.m2761("ܰܶ") ^ i20) * 17;
                                                i22 = ((iM2761 ^ i21) * 18311) ^ 564859437;
                                                i23 = 545233977;
                                            } else {
                                                iM2761 = (C0619.m2761("ܺۗ") ^ i21) * (-19);
                                                i22 = ((iM2761 ^ i20) * 27585) ^ (-3676506);
                                                i23 = 328745139;
                                            }
                                            break;
                                        case -827791023:
                                        case -797294140:
                                            if (C3448.f11240 >= 0) {
                                                iM2761 = C0619.m2761("ۡ᩺") ^ i21;
                                                i22 = ((iM2761 ^ i20) * (-12005)) ^ 237909160;
                                                i23 = 2000686501;
                                            } else {
                                                iM2761 = C0773.m3169("֨ᩴ") ^ i21;
                                                i22 = ((iM2761 ^ i20) * (-28765)) ^ 1416712038;
                                                i23 = -1759668043;
                                            }
                                            break;
                                        case -757783924:
                                        case 499696779:
                                            if (C1783.m6232()) {
                                                iM2761 = C0773.m3169("ۚۤ") ^ i20;
                                                i22 = ((iM2761 ^ i21) * 10647) ^ 1732524821;
                                                i23 = 2138582604;
                                            } else {
                                                iM2761 = C0773.m3169("ۙ۫") ^ i21;
                                                i22 = ((iM2761 ^ i20) * 28719) ^ (-1404544589);
                                                i23 = -674029851;
                                            }
                                            break;
                                        case -651932046:
                                        case -607190165:
                                            if (C2702.f8586 <= 0) {
                                                iM2761 = C0619.m2761("ۡ᩺") ^ i21;
                                                i22 = ((iM2761 ^ i20) * (-12005)) ^ 237909160;
                                                i23 = 2000686501;
                                            } else {
                                                iM2761 = C0619.m2761("ۤ֡") ^ i20;
                                                i22 = ((iM2761 ^ i21) * (-4319)) ^ (-873114239);
                                                i23 = -1174655296;
                                            }
                                            break;
                                        case -521298035:
                                        case 1560694821:
                                            if (C20932.m47848() != 0) {
                                                iM2761 = (C0619.m2761("ܰܶ") ^ i20) * 17;
                                                i22 = ((iM2761 ^ i21) * 18311) ^ 564859437;
                                                i23 = 545233977;
                                            } else {
                                                iM2761 = C0619.m2761("ۡ᩺") ^ i21;
                                                i22 = ((iM2761 ^ i20) * (-12005)) ^ 237909160;
                                                i23 = 2000686501;
                                            }
                                            break;
                                        case -40536082:
                                        case 1811008940:
                                            C3033.m9845();
                                            C3492.m11488();
                                            break;
                                        case 317700014:
                                        case 2088687753:
                                            C10139.m26174(this.f81044, c19091, i10, i12, i14, i16);
                                            break;
                                        case 735467086:
                                        case 1545900065:
                                            if (C3033.f9831 >= 0) {
                                                iM2761 = C0773.m3169("ۙ۫") ^ i21;
                                                i22 = ((iM2761 ^ i20) * 28719) ^ (-1404544589);
                                                i23 = -674029851;
                                            } else {
                                                iM2761 = C0773.m3169("۠ۜ") ^ i20;
                                                i22 = ((iM2761 ^ i21) * (-4013)) ^ 1068290900;
                                                i23 = -368341576;
                                            }
                                            break;
                                        case 1319597690:
                                        case 1854146816:
                                            C2023.m6964();
                                            C0269.m1775();
                                            iM2761 = C0619.m2761("ۡ᩺") ^ i21;
                                            i22 = ((iM2761 ^ i20) * (-12005)) ^ 237909160;
                                            i23 = 2000686501;
                                            break;
                                        default:
                                            if (C3033.f9831 >= 0) {
                                                iM2761 = C0773.m3169("ۙ۫") ^ i21;
                                                i22 = ((iM2761 ^ i20) * 28719) ^ (-1404544589);
                                                i23 = -674029851;
                                            } else {
                                                iM2761 = C0619.m2761("ۡ᩺") ^ i21;
                                                i22 = ((iM2761 ^ i20) * (-12005)) ^ 237909160;
                                                i23 = 2000686501;
                                            }
                                            break;
                                    }
                                    return;
                                }
                            }
                        });
                        return;
                    case -2095824499:
                    case -650734068:
                        this.f32471 = runnableC0313;
                        this.f32477 = runnableC11209;
                        this.f32454 = runnableC13526;
                        contextM6308 = C1826.m6308(frameLayout);
                        if (C2287.f7432 >= 0) {
                            iM3169 = (C0619.m2761("᩸۬") ^ i6) * 9;
                            i = ((iM3169 ^ i5) * (-30827)) ^ (-1573610348);
                            i2 = 1637494910;
                            i9 = iM3169 ^ i2;
                            i7 = i;
                            frameLayout2 = frameLayout;
                            c19091 = c19090;
                        } else {
                            int iM2761 = C0619.m2761("ܺۖ") ^ i6;
                            i7 = ((iM2761 ^ i5) * (-11037)) ^ 1357865018;
                            i9 = iM2761 ^ (-1960829723);
                            contextM6308 = contextM6308;
                        }
                        break;
                    case -2081070747:
                    case -1909647942:
                        if (C4238.f15451 < 0) {
                            iM3169 = (C0619.m2761("᩸۬") ^ i6) * 9;
                            i = ((iM3169 ^ i5) * (-30827)) ^ (-1573610348);
                            i2 = 1637494910;
                            i9 = iM3169 ^ i2;
                            i7 = i;
                            frameLayout2 = frameLayout;
                            c19091 = c19090;
                        } else {
                            iM31610 = C0773.m3169("ۡ᩵") ^ i5;
                            i7 = ((iM31610 ^ i6) * 26381) ^ 598269751;
                            i8 = 350796491;
                        }
                        break;
                    case -2065712143:
                    case 1694406088:
                        this.f32459 = new HashSet();
                        if (C1080.f3865 < 0) {
                            int iM31611 = C0773.m3169("֨ۢ") ^ i5;
                            i9 = iM31611 ^ 1825950814;
                            i7 = ((iM31611 ^ i6) * 25967) ^ (-100218737);
                            i3 = -1;
                            frameLayout2 = frameLayout;
                        } else {
                            i3 = -1;
                            iM3169 = C0619.m2761("ᩴ۬") ^ i5;
                            i = ((iM3169 ^ i6) * (-22841)) ^ 275772872;
                            i2 = -1004910924;
                            i9 = iM3169 ^ i2;
                            i7 = i;
                            frameLayout2 = frameLayout;
                            c19091 = c19090;
                        }
                        break;
                    case -1835552521:
                    case 732749925:
                        this.f32461 = z;
                        this.f32446 = frameLayout2;
                        this.f32482 = webView;
                        this.f32455 = c19091;
                        if (C2834.m9344() < 0) {
                            int iM2762 = C0619.m2761("۫ۚ") ^ i5;
                            i7 = ((iM2762 ^ i6) * 1311) ^ (-594289221);
                            i9 = iM2762 ^ (-1828576587);
                            frameLayout2 = frameLayout;
                        } else {
                            iM3169 = C0619.m2761("ᩴ۬") ^ i5;
                            i = ((iM3169 ^ i6) * (-22841)) ^ 275772872;
                            i2 = -1004910924;
                            i9 = iM3169 ^ i2;
                            i7 = i;
                            frameLayout2 = frameLayout;
                            c19091 = c19090;
                        }
                        break;
                    case -1795059061:
                    case -604943925:
                        this.f32472 = scaledTouchSlop;
                        iM7764 = C2288.m7764(m26159(400), viewConfiguration.getScaledMinimumFlingVelocity());
                        if (C23916.f77426 > 0) {
                            iM31610 = C0619.m2761("᩸᩹") ^ i5;
                            i7 = ((iM31610 ^ i6) * 10061) ^ 565075496;
                            i8 = 2046381479;
                        }
                        iM3169 = C0619.m2761("ᩴ۬") ^ i5;
                        i = ((iM3169 ^ i6) * (-22841)) ^ 275772872;
                        i2 = -1004910924;
                        i9 = iM3169 ^ i2;
                        i7 = i;
                        frameLayout2 = frameLayout;
                        c19091 = c19090;
                        break;
                        break;
                    case -1701820112:
                    case -1158597155:
                        C2354.m7983();
                        if (C11235.m28309() == 0) {
                            iM31610 = C0773.m3169("ۡ᩵") ^ i5;
                            i7 = ((iM31610 ^ i6) * 26381) ^ 598269751;
                            i8 = 350796491;
                        }
                        iM3169 = C0619.m2761("ܰܽ") ^ i5;
                        i = ((iM3169 ^ i6) * 15931) ^ (-639970817);
                        i2 = -677004951;
                        i9 = iM3169 ^ i2;
                        i7 = i;
                        frameLayout2 = frameLayout;
                        c19091 = c19090;
                        break;
                    case -1667883273:
                    case -1641013447:
                        C2485.m8357();
                        iM3169 = C0619.m2761("ܰܽ") ^ i5;
                        i = ((iM3169 ^ i6) * 15931) ^ (-639970817);
                        i2 = -677004951;
                        i9 = iM3169 ^ i2;
                        i7 = i;
                        frameLayout2 = frameLayout;
                        c19091 = c19090;
                        break;
                    case -1651427694:
                    case 529345857:
                        C2878.m9491();
                        C2702.m8876();
                        throw new RuntimeException();
                    case -1641893254:
                    case -102425186:
                        this.f32474 = new ArrayList();
                        if (C2966.f9654 >= 0) {
                            iM3169 = C0619.m2761("ܰܽ") ^ i5;
                            i = ((iM3169 ^ i6) * 15931) ^ (-639970817);
                            i2 = -677004951;
                        } else {
                            this.f32457 = new ArrayList();
                            if (C2419.m8174() >= 0) {
                                iM3169 = (C0619.m2761("᩸۬") ^ i6) * 9;
                                i = ((iM3169 ^ i5) * (-30827)) ^ (-1573610348);
                                i2 = 1637494910;
                            } else {
                                this.f32475 = new C18344(this);
                                this.f32447 = new Runnable() { // from class: l.ۧ۬֫
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        C10139.m26167(this.f36474);
                                    }
                                };
                                if (C1343.f4799 != 0) {
                                    iM3169 = C0619.m2761("ᩴ۬") ^ i5;
                                    i = ((iM3169 ^ i6) * (-22841)) ^ 275772872;
                                    i2 = -1004910924;
                                } else {
                                    iM3169 = C0773.m3169("ܺ۫") ^ i6;
                                    i = ((iM3169 ^ i5) * 14523) ^ (-1546116143);
                                    i2 = -1149181178;
                                }
                            }
                        }
                        i9 = iM3169 ^ i2;
                        i7 = i;
                        frameLayout2 = frameLayout;
                        c19091 = c19090;
                        break;
                    case -1479476829:
                    case 1415473670:
                        viewConfiguration = ViewConfiguration.get(contextM6308);
                        scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
                        if (!C0619.f2439) {
                            iM31610 = C0619.m2761("ܿۡ") ^ i5;
                            i7 = ((iM31610 ^ i6) * 11247) ^ (-1648870843);
                            i8 = -550167297;
                        } else {
                            iM31610 = C0773.m3169("ۡ᩵") ^ i5;
                            i7 = ((iM31610 ^ i6) * 26381) ^ 598269751;
                            i8 = 350796491;
                        }
                        break;
                    case -802926016:
                    case 652284818:
                        this.f32444 = i3;
                        if (!RunnableC3646.f12471) {
                            int iM31612 = C0773.m3169("ۛۢ") ^ i6;
                            i9 = iM31612 ^ (-187520195);
                            i7 = ((iM31612 ^ i5) * 27181) ^ 1230992388;
                            z = true;
                            frameLayout2 = frameLayout;
                        } else {
                            z = true;
                            iM3169 = (C0619.m2761("᩸۬") ^ i6) * 9;
                            i = ((iM3169 ^ i5) * (-30827)) ^ (-1573610348);
                            i2 = 1637494910;
                            i9 = iM3169 ^ i2;
                            i7 = i;
                            frameLayout2 = frameLayout;
                            c19091 = c19090;
                        }
                        break;
                    case 515607783:
                    case 1591491721:
                        C1343.m4943();
                        if (C20932.f66974 > 0) {
                            iM31610 = (C0773.m3169("ᩴۗ") + i6) * (-65);
                            i7 = ((iM31610 ^ i5) * 30107) ^ 51918198;
                            i8 = -593661271;
                        }
                        iM3169 = C0619.m2761("ܰܽ") ^ i5;
                        i = ((iM3169 ^ i6) * 15931) ^ (-639970817);
                        i2 = -677004951;
                        i9 = iM3169 ^ i2;
                        i7 = i;
                        frameLayout2 = frameLayout;
                        c19091 = c19090;
                        break;
                    default:
                        this.f32438 = iM7764;
                        this.f32453 = viewConfiguration.getScaledMaximumFlingVelocity();
                        this.f32452 = c19091.f61807;
                        if (C4282.f15546 > 0) {
                            iM31610 = (C0619.m2761("ۜۜ") + i6) * 123;
                            i7 = ((iM31610 ^ i5) * 24125) ^ (-1660789595);
                            i8 = -529758553;
                        }
                        iM3169 = C0619.m2761("ܰܽ") ^ i5;
                        i = ((iM3169 ^ i6) * 15931) ^ (-639970817);
                        i2 = -677004951;
                        i9 = iM3169 ^ i2;
                        i7 = i;
                        frameLayout2 = frameLayout;
                        c19091 = c19090;
                        break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m26193(boolean z) {
        boolean z2 = false;
        VelocityTracker velocityTracker = null;
        int i = -382965862;
        int i2 = C2966.f9654;
        int i3 = C3099.f10023;
        int iM2761 = C0619.m2761("ۙ᩻") ^ i2;
        int i4 = ((iM2761 ^ i3) * 10207) ^ 1820564517;
        int i5 = -560205785;
        while (true) {
            i = ((((i ^ i3) * 4453) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2140710494:
                case -826356382:
                    if (C23916.f77426 <= 0) {
                        iM2761 = (C0619.m2761("ۘۗ") + i2) * (-29);
                        i4 = ((iM2761 ^ i3) * 3627) ^ (-1009979588);
                        i5 = -306089165;
                    } else {
                        iM2761 = (i2 - C0773.m3169("᩷۬")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM2761 ^ i3) * 10633) ^ (-37610905);
                        i5 = 257321649;
                    }
                    break;
                case -2045839774:
                case -95095229:
                    m26189();
                    iM2761 = (i2 - C0773.m3169("ܶۛ")) * 87;
                    i4 = ((iM2761 ^ i3) * (-2725)) ^ (-1873519722);
                    i5 = -344212322;
                    break;
                case -1912187796:
                case -1482515258:
                    break;
                case -1844068634:
                case -1373704306:
                    C3779.m12264();
                    if (RunnableC3055.m9933() != 0) {
                        iM2761 = (C0619.m2761("֫ܰ") ^ i2) * (-3);
                        i4 = ((iM2761 ^ i3) * (-23083)) ^ (-1200494473);
                        i5 = 597693561;
                    } else {
                        iM2761 = (C0773.m3169("ۡۧ") + i3) * 59;
                        i4 = ((iM2761 ^ i2) * 12649) ^ (-978191432);
                        i5 = 1388260623;
                    }
                    break;
                case -1766698342:
                case 1132780326:
                    if (C2023.f6737) {
                        iM2761 = (C0619.m2761("ۘۗ") + i2) * (-29);
                        i4 = ((iM2761 ^ i3) * 3627) ^ (-1009979588);
                        i5 = -306089165;
                    } else {
                        iM2761 = (C0619.m2761("֡ܰ") ^ i3) * 5;
                        i4 = ((iM2761 ^ i2) * (-19493)) ^ (-205685413);
                        i5 = 2020832411;
                    }
                    break;
                case -1476735113:
                case 219042795:
                    if (C1519.f5300 >= 0) {
                        iM2761 = (C0619.m2761("֫ܰ") ^ i2) * (-3);
                        i4 = ((iM2761 ^ i3) * (-23083)) ^ (-1200494473);
                        i5 = 597693561;
                    } else {
                        iM2761 = C0619.m2761("᩶ۗ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-22427)) ^ (-311902499);
                        i5 = 1455505981;
                    }
                    break;
                case -1444933284:
                case -1121279191:
                    if (C11235.f35427 >= 0) {
                        iM2761 = (C0619.m2761("ۡܰ") + i2) * (-127);
                        i4 = ((iM2761 ^ i3) * 25491) ^ 1291549819;
                        i5 = 903332508;
                    } else {
                        iM2761 = (C0619.m2761("֡֡") ^ i3) * (-121);
                        i4 = ((iM2761 ^ i2) * (-23161)) ^ 1484188290;
                        i5 = 880112119;
                    }
                    break;
                case -1348177015:
                case -561202891:
                    C4238.m13540();
                    if (C2419.f7754 < 0) {
                        iM2761 = (C0773.m3169("ۨۘ") + i3) * 87;
                        i4 = ((iM2761 ^ i2) * 2125) ^ 240419885;
                        i5 = -1436494188;
                    } else {
                        iM2761 = (C0773.m3169("ۡۧ") + i3) * 59;
                        i4 = ((iM2761 ^ i2) * 12649) ^ (-978191432);
                        i5 = 1388260623;
                    }
                    break;
                case -1345616512:
                case 1970119293:
                    if (C17202.f56030) {
                        iM2761 = (i2 - C0619.m2761("ᩳ᩹")) * 21;
                        i4 = ((iM2761 ^ i3) * (-22127)) ^ (-683566709);
                        i5 = -295986870;
                    } else {
                        iM2761 = (C0619.m2761("ۘۗ") + i2) * (-29);
                        i4 = ((iM2761 ^ i3) * 3627) ^ (-1009979588);
                        i5 = -306089165;
                    }
                    break;
                case -1270855635:
                case -1010209755:
                    if (C1542.f5343 <= 0) {
                        iM2761 = (C0773.m3169("ۨۘ") + i3) * 87;
                        i4 = ((iM2761 ^ i2) * 2125) ^ 240419885;
                        i5 = -1436494188;
                    } else {
                        iM2761 = (i2 - C0773.m3169("ۡ᩷")) * 53;
                        i4 = ((iM2761 ^ i3) * (-5555)) ^ (-406271234);
                        i5 = 780288493;
                    }
                    break;
                case -1060518518:
                case 734258453:
                    velocityTracker.recycle();
                    this.f32440 = null;
                    iM2761 = C0619.m2761("۟᩻") ^ i3;
                    i4 = ((iM2761 ^ i2) * 3127) ^ (-447345978);
                    i5 = -2139430141;
                    break;
                case -1041694890:
                case 1138822647:
                    if (C3492.m11488()) {
                        iM2761 = C0773.m3169("ܽ֫") ^ i2;
                        i4 = ((iM2761 ^ i3) * 3411) ^ (-1566583151);
                        i5 = 1403121327;
                    } else {
                        iM2761 = (C0773.m3169("ۨۘ") + i3) * 87;
                        i4 = ((iM2761 ^ i2) * 2125) ^ 240419885;
                        i5 = -1436494188;
                    }
                    break;
                case -668403975:
                case 872715264:
                    if (z) {
                        iM2761 = C0773.m3169("֫۬") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-31459)) ^ 1691489013;
                        i5 = -1576617372;
                    } else {
                        iM2761 = (i2 - C0773.m3169("ܶۛ")) * 87;
                        i4 = ((iM2761 ^ i3) * (-2725)) ^ (-1873519722);
                        i5 = -344212322;
                    }
                    break;
                case -440572365:
                case 244351898:
                    z2 = false;
                    if (C13473.f42873 != 0) {
                        iM2761 = (C0619.m2761("ۘۗ") + i2) * (-29);
                        i4 = ((iM2761 ^ i3) * 3627) ^ (-1009979588);
                        i5 = -306089165;
                    } else {
                        iM2761 = (C0619.m2761("۫۠") + i2) * (-59);
                        i4 = ((iM2761 ^ i3) * 28073) ^ (-426908666);
                        i5 = -992666681;
                    }
                    break;
                case -236040681:
                case 229601983:
                    this.f32465 = z2;
                    this.f32458 = z2;
                    velocityTracker = this.f32440;
                    if (velocityTracker != null) {
                        iM2761 = C0773.m3169("ۚ᩶") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-22527)) ^ (-297068282);
                        i5 = -1227043318;
                    } else {
                        iM2761 = C0619.m2761("۟᩻") ^ i3;
                        i4 = ((iM2761 ^ i2) * 3127) ^ (-447345978);
                        i5 = -2139430141;
                    }
                    break;
                case -89304532:
                case 166548651:
                    C2354.m7983();
                    C20932.m47848();
                    break;
                case 264977289:
                case 957893550:
                    C4282.m13644();
                    iM2761 = (C0773.m3169("ۡۧ") + i3) * 59;
                    i4 = ((iM2761 ^ i2) * 12649) ^ (-978191432);
                    i5 = 1388260623;
                    break;
                case 643124703:
                case 1036870204:
                    if (C1783.f6087 <= 0) {
                        iM2761 = (C0773.m3169("ۨۘ") + i3) * 87;
                        i4 = ((iM2761 ^ i2) * 2125) ^ 240419885;
                        i5 = -1436494188;
                    } else {
                        iM2761 = (C0619.m2761("֫۟") ^ i3) * (-93);
                        i4 = ((iM2761 ^ i2) * 19179) ^ (-1748065233);
                        i5 = 701706579;
                    }
                    break;
                case 1093990800:
                case 2145562031:
                    if (C1542.m5459() >= 0) {
                        iM2761 = (C0619.m2761("ۘۗ") + i2) * (-29);
                        i4 = ((iM2761 ^ i3) * 3627) ^ (-1009979588);
                        i5 = -306089165;
                    } else {
                        iM2761 = (C0619.m2761("ۢܰ") + i3) * (-31);
                        i4 = ((iM2761 ^ i2) * 17305) ^ (-210866660);
                        i5 = 1804450123;
                    }
                    break;
                default:
                    if (!C3492.m11488()) {
                        iM2761 = (C0773.m3169("ۡۧ") + i3) * 59;
                        i4 = ((iM2761 ^ i2) * 12649) ^ (-978191432);
                        i5 = 1388260623;
                    } else {
                        iM2761 = (C0619.m2761("ۡܰ") + i2) * (-127);
                        i4 = ((iM2761 ^ i3) * 25491) ^ 1291549819;
                        i5 = 903332508;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m26174(C10139 c10139, C19090 c19090, int i, int i2, int i3, int i4) {
        int iM3169;
        int i5;
        int i6 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i7 = -1847278100;
        int i8 = C3033.f9831;
        int i9 = C1542.f5343;
        int iM31610 = C0773.m3169("ۖ֫") ^ i8;
        int i10 = ((iM31610 ^ i9) * (-26855)) ^ 1974579629;
        int i11 = -401283574;
        while (true) {
            int i12 = iM31610 ^ i11;
            while (true) {
                i7 = ((((i7 ^ i9) * (-20269)) >> 31) & i10) ^ i12;
                switch (i7) {
                    case -1978752155:
                    case -632920373:
                        c10139.m26195(z);
                        iM31610 = (i9 - C0619.m2761("ܳ֫")) * 97;
                        i10 = ((iM31610 ^ i8) * o.a.p) ^ 732028355;
                        i11 = -599525809;
                        break;
                    case -1939247483:
                    case 745292047:
                        if (!z3) {
                            iM31610 = C0773.m3169("ܿۡ") ^ i8;
                            i10 = ((iM31610 ^ i9) * (-2543)) ^ 872042076;
                            i11 = 781797334;
                        } else {
                            iM31610 = C0773.m3169("ۢ֨") ^ i9;
                            i10 = ((iM31610 ^ i8) * 9463) ^ (-409107253);
                            i11 = 276057573;
                        }
                        break;
                    case -1834979807:
                    case -902610605:
                        z3 = false;
                        iM31610 = C0773.m3169("ۢۛ") ^ i8;
                        i10 = ((iM31610 ^ i9) * 29149) ^ 969631612;
                        i11 = -1272720907;
                        break;
                    case -1672630841:
                    case 516025238:
                        i6 = i2 - i;
                        if (i6 >= c10139.m26159(840)) {
                            iM3169 = C0773.m3169("ۨ᩸") ^ i8;
                            i10 = ((iM3169 ^ i9) * (-32113)) ^ (-462574264);
                            i5 = 807310512;
                        } else {
                            iM3169 = (C0773.m3169("᩵ۘ") ^ i9) * 5;
                            i10 = ((iM3169 ^ i8) * 12001) ^ (-193919917);
                            i5 = -61961782;
                        }
                        i12 = iM3169 ^ i5;
                        z = false;
                        break;
                    case -1550983141:
                    case -1520256357:
                        C3734.m12152();
                        iM31610 = (C0619.m2761("֨ۢ") + i9) * 97;
                        i10 = ((iM31610 ^ i8) * (-27391)) ^ 982883081;
                        i11 = -335721106;
                    case -1479795986:
                    case -1032932836:
                        if (!C3077.m10041()) {
                            iM31610 = (C0619.m2761("᩸۟") + i8) * (-113);
                            i10 = ((iM31610 ^ i9) * 26781) ^ (-713906156);
                            i11 = 1022121609;
                        } else {
                            iM31610 = (C0619.m2761("ᩳۙ") ^ i8) * (-97);
                            i10 = ((iM31610 ^ i9) * 11933) ^ 2035648418;
                            i11 = -508453039;
                        }
                        break;
                    case -1344343603:
                    case 632525256:
                        C1146.m4231();
                        C3779.m12264();
                        break;
                    case -1315686461:
                    case 1063587944:
                        if (!z2) {
                            iM31610 = C0773.m3169("ۢ֨") ^ i9;
                            i10 = ((iM31610 ^ i8) * 9463) ^ (-409107253);
                            i11 = 276057573;
                            break;
                        }
                        iM31610 = C0773.m3169("᩶᩶") ^ i9;
                        i10 = ((iM31610 ^ i8) * 28459) ^ 254630728;
                        i11 = -989077399;
                        break;
                    case -1143054657:
                    case -37306043:
                        if (C1826.f6190 > 0) {
                            iM31610 = (C0619.m2761("ۢۜ") ^ i9) * (-7);
                            i10 = ((iM31610 ^ i8) * 22343) ^ (-956338668);
                            i11 = 1530561021;
                        } else {
                            iM31610 = (C0619.m2761("֨ۢ") + i9) * 97;
                            i10 = ((iM31610 ^ i8) * (-27391)) ^ 982883081;
                            i11 = -335721106;
                        }
                        break;
                    case -1087070816:
                    case -916648639:
                        if (c10139.f32441 == null) {
                            iM31610 = (i9 - C0619.m2761("ܳ֫")) * 97;
                            i10 = ((iM31610 ^ i8) * o.a.p) ^ 732028355;
                            i11 = -599525809;
                            break;
                            break;
                        }
                        iM31610 = (C0773.m3169("֡᩻") + i8) * (-57);
                        i10 = ((iM31610 ^ i9) * (-31511)) ^ 1329425022;
                        i11 = 1300834743;
                        break;
                    case -1076966727:
                    case 774747346:
                        if (C1321.f4751 < 0) {
                            iM31610 = (i9 - C0619.m2761("ۢ᩸")) * (-119);
                            i10 = ((iM31610 ^ i8) * (-8675)) ^ (-1506789207);
                            i11 = 1036642011;
                        } else {
                            iM31610 = (C0619.m2761("ᩳۙ") ^ i8) * (-97);
                            i10 = ((iM31610 ^ i9) * 11933) ^ 2035648418;
                            i11 = -508453039;
                        }
                        break;
                    case -1066562552:
                    case -566833443:
                        if (AbstractC3624.f12429 > 0) {
                            iM31610 = (C0619.m2761("֡۟") ^ i9) * (-123);
                            i10 = ((iM31610 ^ i8) * (-7137)) ^ 179425355;
                            i11 = -1573938025;
                        } else {
                            iM31610 = C0773.m3169("۬᩸") ^ i9;
                            i10 = ((iM31610 ^ i8) * (-14683)) ^ 1667541872;
                            i11 = -2092651258;
                        }
                        break;
                    case -1052408834:
                    case 1121636838:
                        c19090.f61807 = z;
                        c10139.f32452 = z;
                        iM31610 = C0773.m3169("ۢ֨") ^ i9;
                        i10 = ((iM31610 ^ i8) * 9463) ^ (-409107253);
                        i11 = 276057573;
                        break;
                    case -1039445628:
                    case 1494570703:
                        c19090.f61806 = z3;
                        c10139.f32467 = z3;
                        c10139.m26195(z);
                        iM31610 = (i9 - C0619.m2761("ܳ֫")) * 97;
                        i10 = ((iM31610 ^ i8) * o.a.p) ^ 732028355;
                        i11 = -599525809;
                        break;
                        break;
                    case -988525149:
                    case 1751506367:
                        if (C3998.f13671 == 0) {
                            iM31610 = C0773.m3169("᩵ۛ") ^ i8;
                            i10 = ((iM31610 ^ i9) * (-7125)) ^ (-1283251221);
                            i11 = 1343345173;
                        } else {
                            iM31610 = C0773.m3169("۬᩸") ^ i9;
                            i10 = ((iM31610 ^ i8) * (-14683)) ^ 1667541872;
                            i11 = -2092651258;
                        }
                        break;
                    case -903504858:
                    case 149461412:
                        if (!RunnableC3646.f12471) {
                            iM31610 = (C0619.m2761("ᩳۙ") ^ i8) * (-97);
                            i10 = ((iM31610 ^ i9) * 11933) ^ 2035648418;
                            i11 = -508453039;
                            break;
                        }
                        iM31610 = (C0619.m2761("ۢۜ") ^ i9) * (-7);
                        i10 = ((iM31610 ^ i8) * 22343) ^ (-956338668);
                        i11 = 1530561021;
                        break;
                    case -687155195:
                    case 579559414:
                        if (!C17202.f56030) {
                            iM31610 = (C0619.m2761("ᩳۙ") ^ i8) * (-97);
                            i10 = ((iM31610 ^ i9) * 11933) ^ 2035648418;
                            i11 = -508453039;
                            break;
                        }
                        iM31610 = (C0619.m2761("᩸ۜ") + i9) * 71;
                        i10 = ((iM31610 ^ i8) * (-4555)) ^ 2061304254;
                        i11 = 862198095;
                        break;
                    case -640594621:
                    case 130554933:
                        if (C3492.f12043 > 0) {
                            iM31610 = C0773.m3169("ۛۘ") ^ i8;
                            i10 = ((iM31610 ^ i9) * 22965) ^ (-1082701703);
                            i11 = -570356664;
                        } else {
                            iM31610 = (C0619.m2761("֨ۢ") + i9) * 97;
                            i10 = ((iM31610 ^ i8) * (-27391)) ^ 982883081;
                            i11 = -335721106;
                        }
                        break;
                    case -540915830:
                    case 798441352:
                        z3 = true;
                        iM31610 = C0773.m3169("ۢۛ") ^ i8;
                        i10 = ((iM31610 ^ i9) * 29149) ^ 969631612;
                        i11 = -1272720907;
                        break;
                        break;
                    case -536904060:
                    case 144869106:
                        if (!RunnableC1848.m6360()) {
                            iM31610 = (C0773.m3169("ܳۖ") ^ i9) * (-121);
                            i10 = ((iM31610 ^ i8) * 8305) ^ (-767812126);
                            i11 = 1339365471;
                        } else {
                            iM31610 = (C0773.m3169("۟ۡ") ^ i8) * (-21);
                            i10 = ((iM31610 ^ i9) * (-27361)) ^ 595550886;
                            i11 = -1217584737;
                        }
                        break;
                    case -441285753:
                    case 265275757:
                        C1826.m6301();
                        if (RunnableC0334.f1808 > 0) {
                            iM31610 = C0773.m3169("۬᩸") ^ i9;
                            i10 = ((iM31610 ^ i8) * (-14683)) ^ 1667541872;
                            i11 = -2092651258;
                            break;
                        }
                        iM31610 = (C0619.m2761("ᩳۙ") ^ i8) * (-97);
                        i10 = ((iM31610 ^ i9) * 11933) ^ 2035648418;
                        i11 = -508453039;
                        break;
                    case 301001883:
                    case 883706926:
                        c10139.m26197();
                        break;
                    case 414654457:
                    case 1543450214:
                        z2 = c10139.f32467;
                        if (z3 == z2) {
                            iM31610 = C0773.m3169("ᩳܺ") ^ i9;
                            i10 = ((iM31610 ^ i8) * 19095) ^ (-1061420505);
                            i11 = 936073655;
                        } else {
                            iM31610 = (C0619.m2761("ܰ֫") + i8) * 73;
                            i10 = ((iM31610 ^ i9) * 28099) ^ 1231100424;
                            i11 = 1499611877;
                        }
                        break;
                    case 573040913:
                    case 836629695:
                        if (C0269.f1558 > 0) {
                            iM31610 = C0619.m2761("ۘ۟") ^ i9;
                            i10 = ((iM31610 ^ i8) * 14389) ^ (-1943387577);
                            i11 = -290651707;
                        } else {
                            iM31610 = (C0773.m3169("۟ۡ") ^ i8) * (-21);
                            i10 = ((iM31610 ^ i9) * (-27361)) ^ 595550886;
                            i11 = -1217584737;
                        }
                        break;
                    case 765369607:
                    case 1490629812:
                        if (C4238.f15451 < 0) {
                            iM31610 = C0773.m3169("۬ۚ") ^ i8;
                            i10 = ((iM31610 ^ i9) * (-31679)) ^ 2093572254;
                            i11 = 807632960;
                        } else {
                            iM31610 = (C0619.m2761("ۢۜ") ^ i9) * (-7);
                            i10 = ((iM31610 ^ i8) * 22343) ^ (-956338668);
                            i11 = 1530561021;
                        }
                        break;
                    case 992342124:
                    case 2125046460:
                        if (i6 == i4 - i3) {
                            iM31610 = (i9 - C0619.m2761("ܳ֫")) * 97;
                            i10 = ((iM31610 ^ i8) * o.a.p) ^ 732028355;
                            i11 = -599525809;
                            break;
                            break;
                        }
                        iM31610 = (i8 - C0773.m3169("ۨܶ")) * 51;
                        i10 = ((iM31610 ^ i9) * 8163) ^ 1380658825;
                        i11 = 2006686196;
                        break;
                    default:
                        if (C0862.f3233 == 0) {
                            iM31610 = C0773.m3169("۬᩶") ^ i8;
                            i10 = ((iM31610 ^ i9) * (-7679)) ^ 198640447;
                            i11 = -1035841625;
                        } else {
                            iM31610 = (C0619.m2761("ۢۜ") ^ i9) * (-7);
                            i10 = ((iM31610 ^ i8) * 22343) ^ (-956338668);
                            i11 = 1530561021;
                        }
                        break;
                }
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0061  */
    /* JADX WARN: Code duplicated, block: B:59:0x021e A[PHI: r16
      0x021e: PHI (r16v23 int) = (r16v6 int), (r16v7 int), (r16v22 int), (r16v24 int) binds: [B:58:0x021c, B:54:0x0200, B:19:0x0082, B:17:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x028f A[PHI: r11 r12 r16
      0x028f: PHI (r11v4 float) = (r11v2 float), (r11v2 float), (r11v3 float), (r11v2 float) binds: [B:70:0x028d, B:62:0x024e, B:28:0x00c6, B:24:0x00a4] A[DONT_GENERATE, DONT_INLINE]
      0x028f: PHI (r12v4 float) = (r12v2 float), (r12v2 float), (r12v3 float), (r12v2 float) binds: [B:70:0x028d, B:62:0x024e, B:28:0x00c6, B:24:0x00a4] A[DONT_GENERATE, DONT_INLINE]
      0x028f: PHI (r16v18 int) = (r16v3 int), (r16v5 int), (r16v17 int), (r16v19 int) binds: [B:70:0x028d, B:62:0x024e, B:28:0x00c6, B:24:0x00a4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x02c2 A[PHI: r10 r16
      0x02c2: PHI (r10v3 int) = (r10v2 int), (r10v2 int), (r10v2 int), (r10v2 int), (r10v5 int) binds: [B:74:0x02c0, B:66:0x026d, B:17:0x007e, B:14:0x005d, B:6:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x02c2: PHI (r16v29 int) = (r16v2 int), (r16v4 int), (r16v24 int), (r16v25 int), (r16v32 int) binds: [B:74:0x02c0, B:66:0x026d, B:17:0x007e, B:14:0x005d, B:6:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m26163(float f, int i) {
        int iM2761;
        int i2;
        int i3;
        int i4 = C2288.f7433;
        int i5 = C3690.f12684;
        int iM3169 = (i4 - C0773.m3169("᩵ۡ")) * 43;
        int i6 = ((iM3169 ^ i5) * 6357) ^ 167927120;
        View view = null;
        int i7 = iM3169 ^ (-786339018);
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i12 = 163422564;
        FrameLayout.LayoutParams layoutParams = null;
        WebView webView = null;
        while (true) {
            int i13 = i7 ^ (i6 & (((i12 ^ i5) * 17491) >> 31));
            switch (i13) {
                case -2061103373:
                case 411834327:
                    i13 = i13;
                    if (C20932.f66974 <= 0) {
                        iM2761 = C0619.m2761("᩸ܶ") ^ i5;
                        i2 = ((iM2761 ^ i4) * (-4045)) ^ (-276264225);
                        i3 = 210619689;
                    } else {
                        iM2761 = C0773.m3169("ۢۧ") ^ i5;
                        i2 = ((iM2761 ^ i4) * 22373) ^ (-818670283);
                        i3 = 1278996965;
                    }
                    int i14 = i13;
                    i7 = iM2761 ^ i3;
                    i6 = i2;
                    i12 = i14;
                    break;
                case -2043139141:
                case -1943208121:
                    i8 = -1;
                    iM2761 = (C0773.m3169("ۚ᩺") + i4) * 89;
                    i2 = ((iM2761 ^ i5) * 6935) ^ 1973613305;
                    i3 = 709725935;
                    int i15 = i13;
                    i7 = iM2761 ^ i3;
                    i6 = i2;
                    i12 = i15;
                    break;
                case -1926949975:
                case 486145316:
                    if (C0487.f2131 > 0) {
                        i13 = i13;
                        iM2761 = C0619.m2761("۫۠") ^ i5;
                        i2 = ((iM2761 ^ i4) * (-15615)) ^ (-427489380);
                        i3 = -234455006;
                    } else {
                        iM2761 = (C0619.m2761("ۜܳ") + i4) * 119;
                        i13 = i13;
                        i2 = ((iM2761 ^ i5) * (-3741)) ^ 1407697637;
                        i3 = -794401869;
                    }
                    int i16 = i13;
                    i7 = iM2761 ^ i3;
                    i6 = i2;
                    i12 = i16;
                    break;
                case -1884891914:
                case -1669853767:
                    i13 = i13;
                    layoutParams.setMarginStart(i);
                    webView.setLayoutParams(layoutParams);
                    iM2761 = (i5 - C0619.m2761("ۡܺ")) * (-73);
                    i2 = ((iM2761 ^ i4) * 31615) ^ (-1035095917);
                    i3 = 415708707;
                    int i17 = i13;
                    i7 = iM2761 ^ i3;
                    i6 = i2;
                    i12 = i17;
                    break;
                case -1821029327:
                case 847099895:
                    RunnableC3055.m9933();
                    break;
                case -1797113694:
                case 1864561469:
                    i13 = i13;
                    if (this.f32467) {
                        iM2761 = (C0773.m3169("ۤܿ") + i5) * 127;
                        i2 = ((iM2761 ^ i4) * 22837) ^ 1890430553;
                        i3 = 1999408400;
                    } else {
                        iM2761 = C0773.m3169("ۨۤ") ^ i4;
                        i2 = ((iM2761 ^ i5) * (-21095)) ^ (-418849115);
                        i3 = -293731098;
                    }
                    int i18 = i13;
                    i7 = iM2761 ^ i3;
                    i6 = i2;
                    i12 = i18;
                    break;
                case -1638981595:
                case 1511413907:
                    i13 = i13;
                    view.setTranslationX((f3 - f) * f2);
                    if (C2702.f8586 <= 0) {
                        iM2761 = (C0619.m2761("᩵ܰ") + i5) * 19;
                        i2 = ((iM2761 ^ i4) * (-26173)) ^ (-562121993);
                        i3 = 1682431162;
                    } else {
                        iM2761 = C0619.m2761("ۛ᩵") ^ i4;
                        i2 = ((iM2761 ^ i5) * (-31413)) ^ (-101690021);
                        i3 = 1596534875;
                    }
                    int i19 = i13;
                    i7 = iM2761 ^ i3;
                    i6 = i2;
                    i12 = i19;
                    break;
                case -1588985570:
                case 1680875167:
                    i13 = i13;
                    if (C23916.f77426 > 0) {
                        iM2761 = C0619.m2761("᩸ܶ") ^ i5;
                        i2 = ((iM2761 ^ i4) * (-4045)) ^ (-276264225);
                        i3 = 210619689;
                    } else {
                        iM2761 = C0619.m2761("۫۠") ^ i5;
                        i2 = ((iM2761 ^ i4) * (-15615)) ^ (-427489380);
                        i3 = -234455006;
                    }
                    int i110 = i13;
                    i7 = iM2761 ^ i3;
                    i6 = i2;
                    i12 = i110;
                    break;
                case -1307280203:
                case 665532686:
                    i13 = i13;
                    if (C1564.m5509() <= 0) {
                        iM2761 = (C0619.m2761("᩵ܰ") + i5) * 19;
                        i2 = ((iM2761 ^ i4) * (-26173)) ^ (-562121993);
                        i3 = 1682431162;
                    } else {
                        iM2761 = (i4 - C0773.m3169("᩹ܶ")) * 71;
                        i2 = ((iM2761 ^ i5) * (-3847)) ^ 1042906052;
                        i3 = -960143757;
                    }
                    int i111 = i13;
                    i7 = iM2761 ^ i3;
                    i6 = i2;
                    i12 = i111;
                    break;
                case -1005023446:
                case 1382079149:
                    i13 = i13;
                    if (C2419.f7754 >= 0) {
                        iM2761 = C0619.m2761("۫۠") ^ i5;
                        i2 = ((iM2761 ^ i4) * (-15615)) ^ (-427489380);
                        i3 = -234455006;
                    } else {
                        iM2761 = C0619.m2761("ۖ᩷") ^ i5;
                        i2 = ((iM2761 ^ i4) * (-14987)) ^ (-512810614);
                        i3 = -543789590;
                    }
                    int i112 = i13;
                    i7 = iM2761 ^ i3;
                    i6 = i2;
                    i12 = i112;
                    break;
                case -957818507:
                case 722804513:
                    break;
                case -938697381:
                case -747523432:
                    if (C2878.f9462) {
                        iM2761 = (C0619.m2761("ۜܳ") + i4) * 119;
                        i13 = i13;
                        i2 = ((iM2761 ^ i5) * (-3741)) ^ 1407697637;
                        i3 = -794401869;
                    } else {
                        i13 = i13;
                        iM2761 = C0773.m3169("ܽ۟") ^ i4;
                        i2 = ((iM2761 ^ i5) * 31127) ^ 1755612772;
                        i3 = 2125151547;
                    }
                    int i113 = i13;
                    i7 = iM2761 ^ i3;
                    i6 = i2;
                    i12 = i113;
                    break;
                case -856351721:
                case -125179677:
                    i13 = i13;
                    RunnableC3055.m9933();
                    C0862.m3503();
                    iM2761 = C0619.m2761("᩸ܶ") ^ i5;
                    i2 = ((iM2761 ^ i4) * (-4045)) ^ (-276264225);
                    i3 = 210619689;
                    int i114 = i13;
                    i7 = iM2761 ^ i3;
                    i6 = i2;
                    i12 = i114;
                    break;
                case -513424661:
                case 460127597:
                    i13 = i13;
                    if (C0619.m2763()) {
                        iM2761 = (C0619.m2761("᩵ܰ") + i5) * 19;
                        i2 = ((iM2761 ^ i4) * (-26173)) ^ (-562121993);
                        i3 = 1682431162;
                    } else {
                        iM2761 = (i4 - C0773.m3169("ܺ۟")) * 67;
                        i2 = ((iM2761 ^ i5) * 5551) ^ 521640542;
                        i3 = -1151181042;
                    }
                    int i115 = i13;
                    i7 = iM2761 ^ i3;
                    i6 = i2;
                    i12 = i115;
                    break;
                case -206649100:
                case 1278636629:
                    i8 = 1;
                    iM2761 = (C0773.m3169("ۚ᩺") + i4) * 89;
                    i2 = ((iM2761 ^ i5) * 6935) ^ 1973613305;
                    i3 = 709725935;
                    int i116 = i13;
                    i7 = iM2761 ^ i3;
                    i6 = i2;
                    i12 = i116;
                    break;
                case -8080064:
                case 2195558:
                    i13 = i13;
                    if (C3779.f12953 <= 0) {
                        iM2761 = C0619.m2761("۫۠") ^ i5;
                        i2 = ((iM2761 ^ i4) * (-15615)) ^ (-427489380);
                        i3 = -234455006;
                    } else {
                        iM2761 = (i5 - C0773.m3169("ܰ᩸")) * 93;
                        i2 = ((iM2761 ^ i4) * 21991) ^ 304209176;
                        i3 = 1813007373;
                    }
                    int i117 = i13;
                    i7 = iM2761 ^ i3;
                    i6 = i2;
                    i12 = i117;
                    break;
                case 78591450:
                case 638169984:
                    i13 = i13;
                    i9 = -i8;
                    i10 = C1783.m6240(view).width;
                    if (AbstractC3624.f12429 <= 0) {
                        iM2761 = C0773.m3169("ܽ۟") ^ i4;
                        i2 = ((iM2761 ^ i5) * 31127) ^ 1755612772;
                        i3 = 2125151547;
                    } else {
                        iM2761 = C0619.m2761("ܶۗ") ^ i5;
                        i2 = ((iM2761 ^ i4) * (-8047)) ^ 167322016;
                        i3 = -1237869274;
                    }
                    int i118 = i13;
                    i7 = iM2761 ^ i3;
                    i6 = i2;
                    i12 = i118;
                    break;
                case 189587271:
                case 1207362353:
                    i13 = i13;
                    webView = this.f32482;
                    layoutParams = (FrameLayout.LayoutParams) C1783.m6240(webView);
                    if (layoutParams.getMarginStart() != i) {
                        iM2761 = (i4 - C0773.m3169("᩺ۢ")) * (-99);
                        i2 = ((iM2761 ^ i5) * 18921) ^ 359759878;
                        i3 = 1960578551;
                    } else {
                        iM2761 = (i5 - C0619.m2761("ۡܺ")) * (-73);
                        i2 = ((iM2761 ^ i4) * 31615) ^ (-1035095917);
                        i3 = 415708707;
                    }
                    int i119 = i13;
                    i7 = iM2761 ^ i3;
                    i6 = i2;
                    i12 = i119;
                    break;
                case 338037762:
                case 745375765:
                    i13 = i13;
                    view = this.f32441;
                    if (view != null) {
                        iM2761 = C0619.m2761("۬۠") ^ i5;
                        i2 = ((iM2761 ^ i4) * 15497) ^ (-2119000690);
                        i3 = 1372679977;
                    } else {
                        iM2761 = (C0619.m2761("᩻᩵") ^ i4) * (-9);
                        i2 = ((iM2761 ^ i5) * (-4031)) ^ (-979998539);
                        i3 = 1305185972;
                    }
                    int i1110 = i13;
                    i7 = iM2761 ^ i3;
                    i6 = i2;
                    i12 = i1110;
                    break;
                case 1031535100:
                case 1108400618:
                    i13 = i13;
                    C2287.m7735(this.f32476, f);
                    iM2761 = (C0619.m2761("᩻᩵") ^ i4) * (-9);
                    i2 = ((iM2761 ^ i5) * (-4031)) ^ (-979998539);
                    i3 = 1305185972;
                    int i1111 = i13;
                    i7 = iM2761 ^ i3;
                    i6 = i2;
                    i12 = i1111;
                    break;
                case 1070669997:
                case 1925737664:
                    i13 = i13;
                    this.f32466 = f;
                    if (C1080.f3865 >= 0) {
                        iM2761 = C0619.m2761("᩸ܶ") ^ i5;
                        i2 = ((iM2761 ^ i4) * (-4045)) ^ (-276264225);
                        i3 = 210619689;
                    } else {
                        iM2761 = C0619.m2761("ۙۢ") ^ i4;
                        i2 = ((iM2761 ^ i5) * (-22607)) ^ (-1649542494);
                        i3 = 1763582771;
                    }
                    int i1112 = i13;
                    i7 = iM2761 ^ i3;
                    i6 = i2;
                    i12 = i1112;
                    break;
                case 1180808593:
                case 2132391646:
                    i13 = i13;
                    f2 = i11;
                    f3 = 1.0f;
                    if (C0862.m3503()) {
                        iM2761 = C0619.m2761("֨᩷") ^ i5;
                        i2 = ((iM2761 ^ i4) * 27687) ^ (-1769824920);
                        i3 = -1598248822;
                    } else {
                        iM2761 = (C0619.m2761("᩵ܰ") + i5) * 19;
                        i2 = ((iM2761 ^ i4) * (-26173)) ^ (-562121993);
                        i3 = 1682431162;
                    }
                    int i1113 = i13;
                    i7 = iM2761 ^ i3;
                    i6 = i2;
                    i12 = i1113;
                    break;
                default:
                    i13 = i13;
                    i11 = i9 * i10;
                    if (C2287.f7432 >= 0) {
                        iM2761 = C0619.m2761("۫۠") ^ i5;
                        i2 = ((iM2761 ^ i4) * (-15615)) ^ (-427489380);
                        i3 = -234455006;
                    } else {
                        iM2761 = C0773.m3169("᩻۫") ^ i4;
                        i2 = ((iM2761 ^ i5) * 15317) ^ 1204143742;
                        i3 = 607168796;
                    }
                    int i1114 = i13;
                    i7 = iM2761 ^ i3;
                    i6 = i2;
                    i12 = i1114;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m26187() {
        int i = 0;
        int i2 = 0;
        C0445 c0445 = null;
        View view = null;
        int i3 = 968122920;
        int i4 = C2375.f7641;
        int i5 = C2419.f7754;
        int iM3169 = (C0773.m3169("۟ܶ") ^ i4) * 83;
        int i6 = ((iM3169 ^ i5) * 25077) ^ 1526344798;
        int i7 = 1597295145;
        while (true) {
            i3 = ((((i3 ^ i5) * (-24099)) >> 31) & i6) ^ (iM3169 ^ i7);
            switch (i3) {
                case -1939713505:
                case -934349639:
                    this.f32466 = 0.0f;
                    iM3169 = C0773.m3169("᩵ۤ") ^ i5;
                    i6 = ((iM3169 ^ i4) * 31853) ^ (-895156338);
                    i7 = 566471350;
                    break;
                case -1908204078:
                case 1951263341:
                    if (C2288.f7433 <= 0) {
                        iM3169 = (C0773.m3169("᩷ۙ") ^ i4) * 3;
                        i6 = ((iM3169 ^ i5) * (-12443)) ^ 1397743321;
                        i7 = 368441305;
                    } else {
                        iM3169 = (C0773.m3169("ܽ۟") ^ i4) * 109;
                        i6 = ((iM3169 ^ i5) * (-7653)) ^ 1012273527;
                        i7 = -1818011521;
                    }
                    break;
                case -1882468831:
                case 1925355406:
                    i = this.f32445;
                    if (C3033.f9831 >= 0) {
                        iM3169 = (C0773.m3169("ۙᩳ") ^ i4) * (-17);
                        i6 = ((iM3169 ^ i5) * 20095) ^ (-1931442463);
                        i7 = 472293816;
                    } else {
                        iM3169 = (C0619.m2761("ܿۘ") + i5) * 97;
                        i6 = ((iM3169 ^ i4) * (-29835)) ^ 663813505;
                        i7 = -1259706555;
                    }
                    break;
                case -1867881041:
                case 161977956:
                    if (RunnableC3055.f9898 >= 0) {
                        iM3169 = (i5 - C0773.m3169("֡᩵")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i6 = ((iM3169 ^ i4) * (-13313)) ^ 863900429;
                        i7 = -470295188;
                    } else {
                        iM3169 = (C0619.m2761("ܺܿ") ^ i5) * 59;
                        i6 = ((iM3169 ^ i4) * 24849) ^ (-1980040909);
                        i7 = -46732185;
                    }
                    break;
                case -1865266464:
                case 839364018:
                    C13473.m33144();
                    if (C3690.f12684 > 0) {
                        iM3169 = (i5 - C0773.m3169("֡᩵")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i6 = ((iM3169 ^ i4) * (-13313)) ^ 863900429;
                        i7 = -470295188;
                    } else {
                        iM3169 = C0773.m3169("ۛᩳ") ^ i5;
                        i6 = ((iM3169 ^ i4) * 21181) ^ 2117847345;
                        i7 = 576699178;
                    }
                    break;
                case -1804975458:
                case -1669944150:
                    if (view.getVisibility() != 0) {
                        iM3169 = (i5 - C0619.m2761("ۛ۠")) * 69;
                        i6 = ((iM3169 ^ i4) * 19789) ^ 1704950566;
                        i7 = 4387648;
                    } else {
                        iM3169 = C0773.m3169("᩵ۤ") ^ i5;
                        i6 = ((iM3169 ^ i4) * 31853) ^ (-895156338);
                        i7 = 566471350;
                    }
                    break;
                case -1741183432:
                case 1292655329:
                    view = this.f32441;
                    if (view != null) {
                        iM3169 = C0619.m2761("ۜ᩻") ^ i4;
                        i6 = ((iM3169 ^ i5) * 30417) ^ (-1968796520);
                        i7 = -525059592;
                    } else {
                        iM3169 = C0773.m3169("᩵ۤ") ^ i5;
                        i6 = ((iM3169 ^ i4) * 31853) ^ (-895156338);
                        i7 = 566471350;
                    }
                    break;
                case -1453859545:
                case 199450739:
                    this.f32445 = i + i2;
                    c0445 = this.f32470;
                    if (c0445 != null) {
                        iM3169 = C0619.m2761("ܺ᩷") ^ i4;
                        i6 = ((iM3169 ^ i5) * 21023) ^ (-1345638317);
                        i7 = 1225092887;
                    } else {
                        iM3169 = (i5 - C0773.m3169("ۛܳ")) * (-59);
                        i6 = ((iM3169 ^ i4) * (-19153)) ^ 355015799;
                        i7 = 546896614;
                    }
                    break;
                case -1447604173:
                case 1094778609:
                    this.f32451 = false;
                    if (C0487.f2131 <= 0) {
                        iM3169 = (C0773.m3169("᩷ۙ") ^ i4) * 3;
                        i6 = ((iM3169 ^ i5) * (-12443)) ^ 1397743321;
                        i7 = 368441305;
                    } else {
                        iM3169 = (C0619.m2761("۠ᩴ") ^ i4) * 67;
                        i6 = ((iM3169 ^ i5) * (-789)) ^ 1900348986;
                        i7 = -1707704854;
                    }
                    break;
                case -1440181160:
                case 858505334:
                    C4238.m13540();
                    iM3169 = (C0773.m3169("᩷ۙ") ^ i4) * 3;
                    i6 = ((iM3169 ^ i5) * (-12443)) ^ 1397743321;
                    i7 = 368441305;
                    break;
                case -1432010266:
                case -933096346:
                    if (RunnableC3055.f9898 >= 0) {
                        iM3169 = C0773.m3169("ۛᩳ") ^ i5;
                        i6 = ((iM3169 ^ i4) * 21181) ^ 2117847345;
                        i7 = 576699178;
                    } else {
                        iM3169 = (C0773.m3169("᩷ۙ") ^ i4) * 3;
                        i6 = ((iM3169 ^ i5) * (-12443)) ^ 1397743321;
                        i7 = 368441305;
                    }
                    break;
                case -1409158532:
                case 587702950:
                    break;
                case -1155155101:
                case 1189114109:
                    if (this.f32451) {
                        iM3169 = C0619.m2761("ۖۤ") ^ i4;
                        i6 = ((iM3169 ^ i5) * (-8513)) ^ 675297370;
                        i7 = 970069078;
                    } else {
                        iM3169 = C0773.m3169("᩵ۤ") ^ i5;
                        i6 = ((iM3169 ^ i4) * 31853) ^ (-895156338);
                        i7 = 566471350;
                    }
                    break;
                case -650958077:
                case 438005989:
                    if (C4238.f15451 >= 0) {
                        iM3169 = (C0773.m3169("ۙܶ") + i4) * (-83);
                        i6 = ((iM3169 ^ i5) * 31053) ^ (-873761930);
                        i7 = 696852108;
                    } else {
                        iM3169 = (C0619.m2761("ۢ֫") + i5) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i6 = ((iM3169 ^ i4) * (-1027)) ^ 1028244259;
                        i7 = -1698491170;
                    }
                    break;
                case 22179174:
                case 1531293125:
                    i2 = 1;
                    if (C3734.f12817 >= 0) {
                        iM3169 = (C0773.m3169("ۙᩳ") ^ i4) * (-17);
                        i6 = ((iM3169 ^ i5) * 20095) ^ (-1931442463);
                        i7 = 472293816;
                    } else {
                        iM3169 = (i5 - C0619.m2761("ۜۡ")) * 91;
                        i6 = ((iM3169 ^ i4) * 6485) ^ (-1652880062);
                        i7 = 722738912;
                    }
                    break;
                case 255618294:
                case 1265433192:
                    C1321.m4852();
                    break;
                case 281588397:
                case 555710645:
                    if (!C17202.f56030) {
                        iM3169 = C0773.m3169("ۛᩳ") ^ i5;
                        i6 = ((iM3169 ^ i4) * 21181) ^ 2117847345;
                        i7 = 576699178;
                    } else {
                        iM3169 = (C0773.m3169("ۙܶ") + i4) * (-83);
                        i6 = ((iM3169 ^ i5) * 31053) ^ (-873761930);
                        i7 = 696852108;
                    }
                    break;
                case 612695456:
                case 1360283744:
                    if (C0862.m3503()) {
                        iM3169 = C0619.m2761("ܺ᩹") ^ i4;
                        i6 = ((iM3169 ^ i5) * 23995) ^ 696275734;
                        i7 = 132226202;
                    } else {
                        iM3169 = (C0773.m3169("ۙᩳ") ^ i4) * (-17);
                        i6 = ((iM3169 ^ i5) * 20095) ^ (-1931442463);
                        i7 = 472293816;
                    }
                    break;
                case 915808280:
                case 1137123237:
                    if (C20932.f66974 <= 0) {
                        iM3169 = (C0773.m3169("ۙᩳ") ^ i4) * (-17);
                        i6 = ((iM3169 ^ i5) * 20095) ^ (-1931442463);
                        i7 = 472293816;
                    } else {
                        iM3169 = C0773.m3169("ۖᩴ") ^ i4;
                        i6 = ((iM3169 ^ i5) * (-24365)) ^ 1687000632;
                        i7 = 102559145;
                    }
                    break;
                case 1037762835:
                case 1624739698:
                    c0445.m2266();
                    iM3169 = (i5 - C0773.m3169("ۛܳ")) * (-59);
                    i6 = ((iM3169 ^ i4) * (-19153)) ^ 355015799;
                    i7 = 546896614;
                    break;
                case 1845933774:
                case 1933570716:
                    if (RunnableC3646.m11813() != 0) {
                        iM3169 = (C0773.m3169("ۙᩳ") ^ i4) * (-17);
                        i6 = ((iM3169 ^ i5) * 20095) ^ (-1931442463);
                        i7 = 472293816;
                    } else {
                        iM3169 = C0619.m2761("᩵ۗ") ^ i5;
                        i6 = ((iM3169 ^ i4) * 7117) ^ 998211136;
                        i7 = -877402835;
                    }
                    break;
                default:
                    if (RunnableC3646.f12471) {
                        iM3169 = (i5 - C0773.m3169("֡᩵")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i6 = ((iM3169 ^ i4) * (-13313)) ^ 863900429;
                        i7 = -470295188;
                    } else {
                        iM3169 = (i4 - C0619.m2761("֫ۡ")) * (-27);
                        i6 = ((iM3169 ^ i5) * 3757) ^ 1052855303;
                        i7 = -1232934422;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m26211() {
        return this.f32468;
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    private void m26178() {
        View view = null;
        int i = 0;
        View view2 = null;
        int i2 = 0;
        FrameLayout frameLayout = null;
        int i3 = -211910585;
        int i4 = C20932.f66974;
        int i5 = C3779.f12953;
        int iM3169 = (C0773.m3169("ܽۚ") ^ i4) * (-107);
        int i6 = ((iM3169 ^ i5) * 18371) ^ (-1558491365);
        int i7 = -321895598;
        while (true) {
            i3 = ((((i3 ^ i5) * (-17707)) >> 31) & i6) ^ (iM3169 ^ i7);
            switch (i3) {
                case -1794374408:
                case -813783576:
                    if (AbstractC0641.f2496 < 0) {
                        iM3169 = (i5 - C0773.m3169("ܺܿ")) * (-33);
                        i6 = ((iM3169 ^ i4) * (-7223)) ^ (-337598094);
                        i7 = -645437749;
                    } else {
                        iM3169 = (C0619.m2761("۬ۙ") + i4) * 81;
                        i6 = ((iM3169 ^ i5) * 535) ^ 1660649418;
                        i7 = -1901046164;
                    }
                    break;
                case -1755749141:
                case -206797404:
                    i = 0;
                    if (C13473.f42873 != 0) {
                        iM3169 = (i5 - C0619.m2761("۫ۗ")) * (-43);
                        i6 = ((iM3169 ^ i4) * (-849)) ^ 1936561033;
                        i7 = -856651174;
                    } else {
                        iM3169 = (C0773.m3169("ۢ᩺") + i4) * 5;
                        i6 = ((iM3169 ^ i5) * (-29839)) ^ (-1955771932);
                        i7 = 944283802;
                    }
                    break;
                case -1572732038:
                case 1984548314:
                    if (C3734.f12817 >= 0) {
                        iM3169 = (i4 - C0619.m2761("ܳۚ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i6 = ((iM3169 ^ i5) * (-5275)) ^ (-2062205934);
                        i7 = 794208303;
                    } else {
                        iM3169 = (C0773.m3169("ۙᩳ") + i4) * (-99);
                        i6 = ((iM3169 ^ i5) * 18731) ^ 1965533821;
                        i7 = 516185513;
                    }
                    break;
                case -1438601188:
                case 646508879:
                    C1321.m4852();
                    iM3169 = (i4 - C0619.m2761("ܳۚ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    i6 = ((iM3169 ^ i5) * (-5275)) ^ (-2062205934);
                    i7 = 794208303;
                    break;
                case -1358358248:
                case 2120908083:
                    C13473.m33140(view2, i2);
                    if (this.f32467) {
                        iM3169 = C0619.m2761("ۛ᩸") ^ i5;
                        i6 = ((iM3169 ^ i4) * 32447) ^ 900010857;
                        i7 = 1014106130;
                    } else {
                        iM3169 = C0773.m3169("ܶ᩹") ^ i4;
                        i6 = ((iM3169 ^ i5) * (-21325)) ^ (-682051448);
                        i7 = 1503956743;
                    }
                    break;
                case -1320871486:
                case 365305563:
                    if (C2375.f7641 <= 0) {
                        iM3169 = C0619.m2761("ۜۧ") ^ i5;
                        i6 = ((iM3169 ^ i4) * (-15587)) ^ (-971681525);
                        i7 = 252736498;
                    } else {
                        iM3169 = (i4 - C0773.m3169("ۘ۟")) * (-45);
                        i6 = ((iM3169 ^ i5) * 19969) ^ (-391286390);
                        i7 = 1273065531;
                    }
                    break;
                case -1249999991:
                case 419447440:
                    if (C3690.f12684 <= 0) {
                        iM3169 = C0619.m2761("ۜۧ") ^ i5;
                        i6 = ((iM3169 ^ i4) * (-15587)) ^ (-971681525);
                        i7 = 252736498;
                    } else {
                        iM3169 = (C0773.m3169("ܰۛ") + i5) * (-49);
                        i6 = ((iM3169 ^ i4) * (-31379)) ^ (-1367297428);
                        i7 = -401458000;
                    }
                    break;
                case -1112285935:
                case -507983265:
                    if (C3099.f10023 <= 0) {
                        iM3169 = (i5 - C0773.m3169("ܺܿ")) * (-33);
                        i6 = ((iM3169 ^ i4) * (-7223)) ^ (-337598094);
                        i7 = -645437749;
                    } else {
                        iM3169 = (i4 - C0773.m3169("ۙۤ")) * (-125);
                        i6 = ((iM3169 ^ i5) * 8857) ^ 1044401059;
                        i7 = 1683575113;
                    }
                    break;
                case -1084020645:
                case -260551350:
                    view = this.f32441;
                    if (C3077.m10041()) {
                        iM3169 = (i5 - C0619.m2761("۫ۗ")) * (-43);
                        i6 = ((iM3169 ^ i4) * (-849)) ^ 1936561033;
                        i7 = -856651174;
                    } else {
                        iM3169 = C0773.m3169("ۡܳ") ^ i5;
                        i6 = ((iM3169 ^ i4) * 6047) ^ 1791319996;
                        i7 = -720347236;
                    }
                    break;
                case -917956984:
                case 94492670:
                    if (!RunnableC1848.f6235) {
                        iM3169 = C0619.m2761("ۜۧ") ^ i5;
                        i6 = ((iM3169 ^ i4) * (-15587)) ^ (-971681525);
                        i7 = 252736498;
                    } else {
                        iM3169 = (i4 - C0619.m2761("ܳۚ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i6 = ((iM3169 ^ i5) * (-5275)) ^ (-2062205934);
                        i7 = 794208303;
                    }
                    break;
                case -914743643:
                case 1732223572:
                    break;
                case -535559524:
                case 2117356103:
                    if (C20932.f66974 <= 0) {
                        iM3169 = (i5 - C0773.m3169("ܺܿ")) * (-33);
                        i6 = ((iM3169 ^ i4) * (-7223)) ^ (-337598094);
                        i7 = -645437749;
                    } else {
                        iM3169 = C0619.m2761("᩺ܳ") ^ i5;
                        i6 = ((iM3169 ^ i4) * (-19541)) ^ (-1180459999);
                        i7 = -1094580700;
                    }
                    break;
                case -471543700:
                case 2063411492:
                    if (C2966.f9654 >= 0) {
                        iM3169 = (C0619.m2761("۬ۙ") + i4) * 81;
                        i6 = ((iM3169 ^ i5) * 535) ^ 1660649418;
                        i7 = -1901046164;
                    } else {
                        iM3169 = C0619.m2761("ۜۧ") ^ i5;
                        i6 = ((iM3169 ^ i4) * (-15587)) ^ (-971681525);
                        i7 = 252736498;
                    }
                    break;
                case -296994485:
                case 1428611672:
                    C13473.m33140(view, i);
                    view2 = this.f32476;
                    if (this.f32467) {
                        iM3169 = (C0773.m3169("ۙܿ") + i4) * 7;
                        i6 = ((iM3169 ^ i5) * (-14139)) ^ 1976055796;
                        i7 = -1726134328;
                    } else {
                        i2 = i;
                        iM3169 = (i5 - C0619.m2761("᩻۟")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i6 = ((iM3169 ^ i4) * (-20069)) ^ (-1176256810);
                        i7 = -1591735590;
                    }
                    break;
                case -107177451:
                case 1547044982:
                    frameLayout.getParent().requestDisallowInterceptTouchEvent(true);
                    iM3169 = C0619.m2761("֡᩹") ^ i4;
                    i6 = ((iM3169 ^ i5) * 1791) ^ (-447148220);
                    i7 = 1307812393;
                    break;
                case -58139944:
                case 840246459:
                    if (C3099.f10023 <= 0) {
                        iM3169 = (C0619.m2761("۬ۙ") + i4) * 81;
                        i6 = ((iM3169 ^ i5) * 535) ^ 1660649418;
                        i7 = -1901046164;
                    } else {
                        iM3169 = (i4 - C0619.m2761("֡ܺ")) * 27;
                        i6 = ((iM3169 ^ i5) * 22669) ^ 909378218;
                        i7 = -171166114;
                    }
                    break;
                case 75598105:
                case 1936244097:
                    this.f32482.setImportantForAccessibility(4);
                    iM3169 = C0619.m2761("ۛ᩸") ^ i5;
                    i6 = ((iM3169 ^ i4) * 32447) ^ 900010857;
                    i7 = 1014106130;
                    break;
                case 352888225:
                case 408014123:
                    C2702.m8876();
                    AbstractC0641.m2813();
                    break;
                case 367706073:
                case 855438210:
                    frameLayout = this.f32446;
                    if (frameLayout.getParent() != null) {
                        iM3169 = (C0773.m3169("ܶ᩵") + i5) * 91;
                        i6 = ((iM3169 ^ i4) * (-2533)) ^ 1490485189;
                        i7 = -1783194719;
                    } else {
                        iM3169 = C0619.m2761("֡᩹") ^ i4;
                        i6 = ((iM3169 ^ i5) * 1791) ^ (-447148220);
                        i7 = 1307812393;
                    }
                    break;
                case 835072225:
                case 1422803079:
                    if (C23916.m53419() != 0) {
                        iM3169 = (i5 - C0773.m3169("ܺܿ")) * (-33);
                        i6 = ((iM3169 ^ i4) * (-7223)) ^ (-337598094);
                        i7 = -645437749;
                    } else {
                        iM3169 = C0773.m3169("ۚۚ") ^ i5;
                        i6 = ((iM3169 ^ i4) * 10397) ^ (-1709625826);
                        i7 = 815317222;
                    }
                    break;
                case 1412557424:
                case 1823899402:
                    if (C3690.f12684 <= 0) {
                        iM3169 = (i5 - C0773.m3169("ܺܿ")) * (-33);
                        i6 = ((iM3169 ^ i4) * (-7223)) ^ (-337598094);
                        i7 = -645437749;
                    } else {
                        iM3169 = (C0619.m2761("۠᩶") ^ i5) * (-7);
                        i6 = ((iM3169 ^ i4) * (-11961)) ^ (-933103270);
                        i7 = -921362565;
                    }
                    break;
                default:
                    i2 = 8;
                    iM3169 = (i5 - C0619.m2761("᩻۟")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i6 = ((iM3169 ^ i4) * (-20069)) ^ (-1176256810);
                    i7 = -1591735590;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m26168(C10139 c10139, float f, float f2, int i, int i2, ValueAnimator valueAnimator) {
        float fFloatValue = 0.0f;
        float fM45884 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        int i3 = -1402290497;
        int i4 = C2287.f7432;
        int i5 = C2966.f9654;
        int iM2761 = (C0619.m2761("ۢۡ") + i4) * (-71);
        int i6 = ((iM2761 ^ i5) * (-12663)) ^ 1848170948;
        int i7 = 1218649279;
        while (true) {
            i3 = ((((i3 ^ i5) * (-23807)) >> 31) & i6) ^ (iM2761 ^ i7);
            switch (i3) {
                case -1855833186:
                case 999905396:
                    C3734.m12152();
                    break;
                case -1589114321:
                case -1181722711:
                    if (C3033.f9831 >= 0) {
                        iM2761 = (i4 - C0619.m2761("᩶ۙ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i6 = ((iM2761 ^ i5) * 15257) ^ 1606937409;
                        i7 = 1615460727;
                    } else {
                        iM2761 = (C0619.m2761("ܽۡ") ^ i4) * (-83);
                        i6 = ((iM2761 ^ i5) * (-27869)) ^ (-1630620143);
                        i7 = 1232428116;
                    }
                    break;
                case -1499589779:
                case -370456639:
                    C1080.m4050();
                    if (C0862.f3233 != 0) {
                        iM2761 = (C0773.m3169("ᩴᩳ") ^ i5) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i6 = ((iM2761 ^ i4) * (-20531)) ^ 1223849421;
                        i7 = 1150884882;
                    } else {
                        iM2761 = C0773.m3169("ᩳܽ") ^ i4;
                        i6 = ((iM2761 ^ i5) * 9513) ^ (-1742555448);
                        i7 = 651354759;
                    }
                    break;
                case -1496954972:
                case 1966477964:
                    C3492.m11488();
                    if (C1343.f4799 != 0) {
                        iM2761 = C0773.m3169("᩺۠") ^ i4;
                        i6 = ((iM2761 ^ i5) * 9037) ^ (-1585763839);
                        i7 = 1813092284;
                    } else {
                        iM2761 = (C0773.m3169("֡۟") ^ i5) * 31;
                        i6 = ((iM2761 ^ i4) * (-17503)) ^ (-338636128);
                        i7 = -1750296419;
                    }
                    break;
                case -1330027824:
                case 831851191:
                    if (C1321.m4852()) {
                        iM2761 = C0619.m2761("ܰܿ") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-32443)) ^ (-1877679595);
                        i7 = -678344087;
                    } else {
                        iM2761 = (C0773.m3169("ᩴᩳ") ^ i5) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i6 = ((iM2761 ^ i4) * (-20531)) ^ 1223849421;
                        i7 = 1150884882;
                    }
                    break;
                case -1073365962:
                case 1670277332:
                    fM45884 = C19967.m45884(f2, f, fFloatValue, f);
                    f3 = i;
                    f4 = i2 - i;
                    if (C3448.m11248() != 0) {
                        iM2761 = (C0773.m3169("֡۟") ^ i5) * 31;
                        i6 = ((iM2761 ^ i4) * (-17503)) ^ (-338636128);
                        i7 = -1750296419;
                    } else {
                        iM2761 = C0773.m3169("ܳۚ") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-3577)) ^ (-279255538);
                        i7 = -53245111;
                    }
                    break;
                case -1018826798:
                case 2093282119:
                    c10139.m26163(fM45884, Math.round((f4 * fFloatValue) + f3));
                    break;
                case -921286443:
                case 1850660006:
                    if (C0950.f3488 >= 0) {
                        iM2761 = C0773.m3169("᩺۠") ^ i4;
                        i6 = ((iM2761 ^ i5) * 9037) ^ (-1585763839);
                        i7 = 1813092284;
                    } else {
                        iM2761 = C0619.m2761("ܺ۟") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-1463)) ^ (-1775752337);
                        i7 = -176456420;
                    }
                    break;
                case -919653678:
                case 823586909:
                    if (C11235.m28309() != 0) {
                        iM2761 = (C0773.m3169("֡۟") ^ i5) * 31;
                        i6 = ((iM2761 ^ i4) * (-17503)) ^ (-338636128);
                        i7 = -1750296419;
                    } else {
                        iM2761 = C0773.m3169("ۛۙ") ^ i4;
                        i6 = ((iM2761 ^ i5) * 4571) ^ 2086644536;
                        i7 = -471264487;
                    }
                    break;
                case -335203821:
                case 132439150:
                    RunnableC1848.m6360();
                    iM2761 = (C0773.m3169("֡۟") ^ i5) * 31;
                    i6 = ((iM2761 ^ i4) * (-17503)) ^ (-338636128);
                    i7 = -1750296419;
                    break;
                case -314397390:
                case 1751408186:
                    if (C1321.f4751 >= 0) {
                        iM2761 = C0773.m3169("ᩳܽ") ^ i4;
                        i6 = ((iM2761 ^ i5) * 9513) ^ (-1742555448);
                        i7 = 651354759;
                    } else {
                        iM2761 = C0619.m2761("᩶᩸") ^ i5;
                        i6 = ((iM2761 ^ i4) * 29269) ^ (-1932274130);
                        i7 = 613211304;
                    }
                    break;
                case 115808206:
                case 137491602:
                    C1564.m5509();
                    if (!C3077.f9998) {
                        iM2761 = C0773.m3169("ᩳܽ") ^ i4;
                        i6 = ((iM2761 ^ i5) * 9513) ^ (-1742555448);
                        i7 = 651354759;
                    } else {
                        iM2761 = C0773.m3169("᩺۠") ^ i4;
                        i6 = ((iM2761 ^ i5) * 9037) ^ (-1585763839);
                        i7 = 1813092284;
                    }
                    break;
                case 721877453:
                case 994690411:
                    if (C3492.m11488()) {
                        iM2761 = (C0619.m2761("ܶᩳ") + i4) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i6 = ((iM2761 ^ i5) * (-5277)) ^ 540626216;
                        i7 = -408158516;
                    } else {
                        iM2761 = (C0773.m3169("ᩴᩳ") ^ i5) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i6 = ((iM2761 ^ i4) * (-20531)) ^ 1223849421;
                        i7 = 1150884882;
                    }
                    break;
                case 1488639877:
                case 1510695507:
                    fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (AbstractC3624.m11755() != 0) {
                        iM2761 = (i4 - C0619.m2761("᩶ۙ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i6 = ((iM2761 ^ i5) * 15257) ^ 1606937409;
                        i7 = 1615460727;
                    } else {
                        iM2761 = (C0773.m3169("ᩴ۟") ^ i5) * 57;
                        i6 = ((iM2761 ^ i4) * (-23145)) ^ (-621706155);
                        i7 = -1728403652;
                    }
                    break;
                case 1677612622:
                case 2037264362:
                    if (AbstractC3624.f12429 <= 0) {
                        iM2761 = (i4 - C0619.m2761("᩶ۙ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i6 = ((iM2761 ^ i5) * 15257) ^ 1606937409;
                        i7 = 1615460727;
                    } else {
                        iM2761 = C0619.m2761("۬ۚ") ^ i5;
                        i6 = ((iM2761 ^ i4) * 24307) ^ (-1304842118);
                        i7 = -978989272;
                    }
                    break;
                default:
                    if (C2702.f8586 <= 0) {
                        iM2761 = (i4 - C0619.m2761("᩶ۙ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i6 = ((iM2761 ^ i5) * 15257) ^ 1606937409;
                        i7 = 1615460727;
                    } else {
                        iM2761 = (C0773.m3169("᩵ۙ") ^ i5) * (-81);
                        i6 = ((iM2761 ^ i4) * (-14525)) ^ (-495580250);
                        i7 = 1658165956;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m26212() {
        int i = 0;
        int i2 = 0;
        boolean z = false;
        String str = null;
        C25227 c25227 = null;
        ArrayList arrayList = null;
        WebView webView = null;
        RunnableC11631 runnableC11631 = null;
        C18344 c18344 = null;
        int i3 = 2130822378;
        int i4 = AbstractC3624.f12429;
        int i5 = C4238.f15451;
        int iM3169 = C0773.m3169("ۡ۟") ^ i5;
        int i6 = ((iM3169 ^ i4) * 14735) ^ 673098701;
        int i7 = 1688573059;
        while (true) {
            i3 = ((((i3 ^ i4) * 17647) >> 31) & i6) ^ (iM3169 ^ i7);
            switch (i3) {
                case -2129795992:
                case 1994078783:
                    C3779.m12264();
                    RunnableC1848.m6360();
                    break;
                case -1992090702:
                case -944701151:
                    m26187();
                    z = false;
                    m26193(false);
                    if (C3448.f11240 >= 0) {
                        iM3169 = (i5 - C0773.m3169("᩸ܺ")) * 61;
                        i6 = ((iM3169 ^ i4) * (-22927)) ^ 1937918670;
                        i7 = 89552274;
                    } else {
                        iM3169 = C0619.m2761("ܰ᩷") ^ i4;
                        i6 = ((iM3169 ^ i5) * (-7343)) ^ (-216091654);
                        i7 = 179523920;
                    }
                    break;
                case -1917706215:
                case 1056803430:
                    C4238.m13540();
                    if (C1080.f3865 >= 0) {
                        iM3169 = (C0619.m2761("۬ᩴ") ^ i4) * 57;
                        i6 = ((iM3169 ^ i5) * (-14065)) ^ (-225161917);
                        i7 = -1149775896;
                    } else {
                        iM3169 = (C0619.m2761("ᩳܿ") ^ i5) * 23;
                        i6 = ((iM3169 ^ i4) * 22765) ^ 283948295;
                        i7 = 1450441876;
                    }
                    break;
                case -1460277925:
                case 46870221:
                    m26195(z);
                    this.f32477.run();
                    break;
                case -1352206161:
                case 225040441:
                    C3448.m11253(arrayList);
                    if (C13473.m33144()) {
                        iM3169 = (C0619.m2761("֨֫") ^ i5) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i6 = ((iM3169 ^ i4) * 15773) ^ (-1732381629);
                        i7 = -1335076318;
                    } else {
                        iM3169 = C0619.m2761("ۤᩳ") ^ i4;
                        i6 = ((iM3169 ^ i5) * 3827) ^ (-2109946797);
                        i7 = 1027006970;
                    }
                    break;
                case -1350392152:
                case 228569637:
                    this.f32468 = i + i2;
                    if (RunnableC1848.f6235) {
                        iM3169 = (C0619.m2761("ᩳܿ") ^ i5) * 23;
                        i6 = ((iM3169 ^ i4) * 22765) ^ 283948295;
                        i7 = 1450441876;
                    } else {
                        iM3169 = C0773.m3169("ۚ᩹") ^ i5;
                        i6 = ((iM3169 ^ i4) * (-4007)) ^ 737056335;
                        i7 = 1073006660;
                    }
                    break;
                case -1245696994:
                case 1990565468:
                    webView.removeCallbacks(runnableC11631);
                    this.f32439 = z;
                    c18344 = this.f32475;
                    if (C2287.f7432 >= 0) {
                        iM3169 = (C0619.m2761("۬ᩴ") ^ i4) * 57;
                        i6 = ((iM3169 ^ i5) * (-14065)) ^ (-225161917);
                        i7 = -1149775896;
                    } else {
                        iM3169 = (i4 - C0773.m3169("᩺ۙ")) * (-3);
                        i6 = ((iM3169 ^ i5) * (-17843)) ^ 294061963;
                        i7 = 1208113948;
                    }
                    break;
                case -849793153:
                case 1447266891:
                    if (c25227.getItemAnimator() != null) {
                        iM3169 = (C0773.m3169("ܶ᩻") + i5) * (-109);
                        i6 = ((iM3169 ^ i4) * (-15989)) ^ 492177238;
                        i7 = 218675305;
                    } else {
                        iM3169 = C0619.m2761("ۤᩴ") ^ i5;
                        i6 = ((iM3169 ^ i4) * (-19377)) ^ 1200157440;
                        i7 = -20006502;
                    }
                    break;
                case -827128308:
                case 630639023:
                    this.f32444 = -1;
                    c25227 = this.f32450;
                    if (c25227 != null) {
                        iM3169 = C0619.m2761("֡ۚ") ^ i5;
                        i6 = ((iM3169 ^ i4) * 4749) ^ 1903551558;
                        i7 = 2079237903;
                    } else {
                        iM3169 = C0619.m2761("ۤᩴ") ^ i5;
                        i6 = ((iM3169 ^ i4) * (-19377)) ^ 1200157440;
                        i7 = -20006502;
                    }
                    break;
                case -770542156:
                case 1189439018:
                    i = this.f32468;
                    i2 = 1;
                    if (C0773.f2792 <= 0) {
                        iM3169 = (C0619.m2761("ᩳܿ") ^ i5) * 23;
                        i6 = ((iM3169 ^ i4) * 22765) ^ 283948295;
                        i7 = 1450441876;
                    } else {
                        iM3169 = (C0773.m3169("᩺۠") ^ i4) * 41;
                        i6 = ((iM3169 ^ i5) * 259) ^ (-729928030);
                        i7 = -2036201500;
                    }
                    break;
                case -641852660:
                case 1552055002:
                    C2310.m7813();
                    if (RunnableC3055.f9898 >= 0) {
                        iM3169 = (C0619.m2761("᩶۫") ^ i4) * (-47);
                        i6 = ((iM3169 ^ i5) * (-31557)) ^ (-1732080874);
                        i7 = 1136631048;
                    } else {
                        iM3169 = C0619.m2761("ۤᩳ") ^ i4;
                        i6 = ((iM3169 ^ i5) * 3827) ^ (-2109946797);
                        i7 = 1027006970;
                    }
                    break;
                case -479620187:
                case 1012889319:
                    C2702.m8876();
                    iM3169 = C0619.m2761("ۤᩳ") ^ i4;
                    i6 = ((iM3169 ^ i5) * 3827) ^ (-2109946797);
                    i7 = 1027006970;
                    break;
                case -287722580:
                case 1272778843:
                    m26197();
                    webView = this.f32482;
                    runnableC11631 = this.f32447;
                    if (C11235.m28309() != 0) {
                        iM3169 = (C0619.m2761("ᩳܿ") ^ i5) * 23;
                        i6 = ((iM3169 ^ i4) * 22765) ^ 283948295;
                        i7 = 1450441876;
                    } else {
                        iM3169 = C0619.m2761("ۙۜ") ^ i5;
                        i6 = ((iM3169 ^ i4) * (-14551)) ^ (-1730248318);
                        i7 = 58182164;
                    }
                    break;
                case 535381152:
                case 1045398533:
                    this.f32456 = str;
                    if (C0487.m2356() >= 0) {
                        iM3169 = (C0619.m2761("᩶۫") ^ i4) * (-47);
                        i6 = ((iM3169 ^ i5) * (-31557)) ^ (-1732080874);
                        i7 = 1136631048;
                    } else {
                        iM3169 = C0773.m3169("۬ۜ") ^ i4;
                        i6 = ((iM3169 ^ i5) * (-17747)) ^ (-1986744332);
                        i7 = -2057375562;
                    }
                    break;
                case 837494611:
                case 1291156519:
                    C2310.m7813();
                    if (C2485.f7950 == 0) {
                        iM3169 = (C0619.m2761("ᩳܿ") ^ i5) * 23;
                        i6 = ((iM3169 ^ i4) * 22765) ^ 283948295;
                        i7 = 1450441876;
                    } else {
                        iM3169 = C0619.m2761("ۤᩳ") ^ i4;
                        i6 = ((iM3169 ^ i5) * 3827) ^ (-2109946797);
                        i7 = 1027006970;
                    }
                    break;
                case 1032628062:
                case 1215919267:
                    C2834.m9332(this.f32474);
                    arrayList = this.f32457;
                    if (C3077.f9998) {
                        iM3169 = C0773.m3169("᩸ܽ") ^ i4;
                        i6 = ((iM3169 ^ i5) * (-28577)) ^ (-1571290740);
                        i7 = 1183303734;
                    } else {
                        iM3169 = (C0619.m2761("۬ᩴ") ^ i4) * 57;
                        i6 = ((iM3169 ^ i5) * (-14065)) ^ (-225161917);
                        i7 = -1149775896;
                    }
                    break;
                case 1050163459:
                case 1559263925:
                    this.f32450.getItemAnimator().mo10765();
                    iM3169 = C0619.m2761("ۤᩴ") ^ i5;
                    i6 = ((iM3169 ^ i4) * (-19377)) ^ 1200157440;
                    i7 = -20006502;
                    break;
                case 1096713181:
                case 1860177603:
                    this.f32449 = z;
                    str = null;
                    this.f32478 = null;
                    if (C1146.f4234 >= 0) {
                        iM3169 = (i5 - C0773.m3169("᩸ܺ")) * 61;
                        i6 = ((iM3169 ^ i4) * (-22927)) ^ 1937918670;
                        i7 = 89552274;
                    } else {
                        iM3169 = (C0773.m3169("ۤ᩵") + i5) * 97;
                        i6 = ((iM3169 ^ i4) * 7809) ^ (-1701150315);
                        i7 = 606103130;
                    }
                    break;
                default:
                    C3033.m9852(c18344);
                    if (C3734.f12817 >= 0) {
                        iM3169 = (C0619.m2761("ᩳܿ") ^ i5) * 23;
                        i6 = ((iM3169 ^ i4) * 22765) ^ 283948295;
                        i7 = 1450441876;
                    } else {
                        iM3169 = (i4 - C0619.m2761("ۙۨ")) * (-103);
                        i6 = ((iM3169 ^ i5) * 20721) ^ 1746357884;
                        i7 = 1897971566;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0184  */
    /* JADX WARN: Code duplicated, block: B:71:0x0211 A[PHI: r4 r5
      0x0211: PHI (r4v5 short) = (r4v3 short), (r4v2 short), (r4v2 short) binds: [B:70:0x020f, B:66:0x01f0, B:115:0x0211] A[DONT_GENERATE, DONT_INLINE]
      0x0211: PHI (r5v6 int) = (r5v2 int), (r5v4 int), (r5v2 int) binds: [B:70:0x020f, B:66:0x01f0, B:115:0x0211] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26201(final int i, final String str) {
        int iM2761;
        int i2;
        int iM3169;
        int i3;
        int iM2762;
        int i4;
        short[] sArr = null;
        short s = 0;
        int i5 = 0;
        int i6 = 0;
        short[] sArr2 = null;
        int i7 = 0;
        int i8 = 0;
        int i9 = -1337421604;
        int i10 = C20932.f66974;
        int i11 = AbstractC3624.f12429;
        int iM2763 = (C0619.m2761("ۢۙ") + i11) * 57;
        int i12 = ((iM2763 ^ i10) * (-7623)) ^ (-1166101201);
        int i13 = iM2763 ^ 1632247021;
        while (true) {
            StringBuilder sb = null;
            while (true) {
                i9 = ((((i9 ^ i10) * (-4651)) >> 31) & i12) ^ i13;
                switch (i9) {
                    case -2102278476:
                    case -1069647245:
                        AbstractC0116.m1243();
                        if (C3033.f9831 >= 0) {
                            iM2762 = (i11 - C0773.m3169("ۜ۟")) * 87;
                            i12 = ((iM2762 ^ i10) * (-4199)) ^ 491710458;
                            i4 = 339679594;
                        } else {
                            iM2762 = (C0619.m2761("ۘ᩹") + i11) * 43;
                            i12 = ((iM2762 ^ i10) * (-22783)) ^ 1791905939;
                            i4 = 572968902;
                        }
                        i13 = iM2762 ^ i4;
                        break;
                    case -2059430411:
                    case -1708892095:
                        s = sArr[490];
                        if (AbstractC0641.m2813() <= 0) {
                            iM2761 = (C0773.m3169("᩺ۛ") ^ i10) * 75;
                            i12 = (-661271106) ^ ((iM2761 ^ i11) * (-9685));
                            i2 = 479761538;
                        } else {
                            iM2761 = C0619.m2761("ۧۖ") ^ i10;
                            i12 = 214121925 ^ ((iM2761 ^ i11) * 32161);
                            i2 = 1884862285;
                        }
                        i13 = i2 ^ iM2761;
                        break;
                    case -2034903852:
                    case -1970388953:
                        if (AbstractC0116.f1064 > 0) {
                            iM2761 = (C0619.m2761("ܰ۟") ^ i10) * (-53);
                            i12 = 1271869485 ^ ((iM2761 ^ i11) * (-23433));
                            i2 = -1939090423;
                            i13 = i2 ^ iM2761;
                        } else {
                            iM3169 = (C0773.m3169("᩸ۨ") + i10) * 81;
                            i12 = (-2053659766) ^ ((iM3169 ^ i11) * 29859);
                            i3 = 1273969398;
                            i13 = i3 ^ iM3169;
                        }
                        break;
                    case -1770737906:
                    case 203568498:
                        RunnableC1848.m6360();
                        C1343.m4943();
                        iM2762 = (i11 - C0773.m3169("ۜ۟")) * 87;
                        i12 = ((iM2762 ^ i10) * (-4199)) ^ 491710458;
                        i4 = 339679594;
                        i13 = iM2762 ^ i4;
                        break;
                    case -1451155546:
                    case 965448283:
                        C0487.m2356();
                        if (!C3779.m12264()) {
                            iM2762 = (i11 - C0773.m3169("ۜ۟")) * 87;
                            i12 = ((iM2762 ^ i10) * (-4199)) ^ 491710458;
                            i4 = 339679594;
                            i13 = iM2762 ^ i4;
                        } else {
                            iM2761 = (C0773.m3169("᩺ۛ") ^ i10) * 75;
                            i12 = (-661271106) ^ ((iM2761 ^ i11) * (-9685));
                            i2 = 479761538;
                            i13 = i2 ^ iM2761;
                        }
                        break;
                    case -1345228217:
                    case -305587658:
                        sArr = f32436;
                        if (C3779.f12953 > 0) {
                            iM2761 = C0619.m2761("ۘۘ") ^ i11;
                            i12 = (-947485553) ^ ((iM2761 ^ i10) * (-28331));
                            i2 = -775319413;
                            i13 = i2 ^ iM2761;
                        } else {
                            iM3169 = (C0773.m3169("᩸ۚ") + i11) * 11;
                            i12 = (-327764028) ^ ((iM3169 ^ i10) * 29401);
                            i3 = -355110590;
                            i13 = i3 ^ iM3169;
                        }
                        break;
                    case -1180515709:
                    case -480762599:
                        i6 = 18845;
                        iM2761 = C0773.m3169("֫۫") ^ i10;
                        i12 = 569725452 ^ ((iM2761 ^ i11) * (-10677));
                        i2 = 341727121;
                        i13 = i2 ^ iM2761;
                        break;
                    case -974226480:
                    case -489119681:
                        if (C0487.f2131 <= 0) {
                            iM3169 = (C0773.m3169("᩸ۚ") + i11) * 11;
                            i12 = (-327764028) ^ ((iM3169 ^ i10) * 29401);
                            i3 = -355110590;
                            i13 = i3 ^ iM3169;
                        }
                        iM2762 = (i11 - C0773.m3169("ۜ۟")) * 87;
                        i12 = ((iM2762 ^ i10) * (-4199)) ^ 491710458;
                        i4 = 339679594;
                        i13 = iM2762 ^ i4;
                        break;
                    case -850261379:
                    case -825528577:
                        break;
                    case -809365825:
                    case 193724911:
                        if (i5 - (s * 29128) < 0) {
                            iM2761 = (i10 - C0773.m3169("֨ۗ")) * (-79);
                            i12 = (-170503679) ^ ((iM2761 ^ i11) * 8177);
                            i2 = 1063395806;
                        } else {
                            iM2761 = C0773.m3169("᩻۫") ^ i11;
                            i12 = 1397122029 ^ ((iM2761 ^ i10) * 19753);
                            i2 = -229846375;
                        }
                        i13 = i2 ^ iM2761;
                        break;
                    case -646950581:
                    case 1714571445:
                        C1564.m5509();
                        break;
                    case -581505575:
                    case 1783495168:
                        C3779.m12258(sb, C2287.m7749(sArr2, i7, i8, i6));
                        if (!C3077.f9998) {
                            iM3169 = (C0773.m3169("᩸ۚ") + i11) * 11;
                            i12 = (-327764028) ^ ((iM3169 ^ i10) * 29401);
                            i3 = -355110590;
                            i13 = i3 ^ iM3169;
                        } else {
                            iM2761 = C0773.m3169("ܺᩴ") ^ i10;
                            i12 = 1757237477 ^ ((iM2761 ^ i11) * (-10625));
                            i2 = 2033885877;
                            i13 = i2 ^ iM2761;
                        }
                        break;
                    case -528935851:
                    case -194742616:
                        i6 = 59167;
                        iM2761 = C0773.m3169("֫۫") ^ i10;
                        i12 = 569725452 ^ ((iM2761 ^ i11) * (-10677));
                        i2 = 341727121;
                        i13 = i2 ^ iM2761;
                        break;
                    case -473068355:
                    case 1049766324:
                        if (this.f32463) {
                            iM2761 = C0773.m3169("ܿ۠") ^ i11;
                            i12 = (-39947424) ^ ((iM2761 ^ i10) * 30695);
                            i2 = -2034252234;
                        } else {
                            iM2761 = C0619.m2761("ܽۜ") ^ i10;
                            i12 = 1656174600 ^ ((iM2761 ^ i11) * 19323);
                            i2 = 165137097;
                        }
                        i13 = i2 ^ iM2761;
                        break;
                    case -100462620:
                    case 1408667722:
                        this.f32482.evaluateJavascript(C1080.m4058(sb), new ValueCallback(this) { // from class: l.᩹۬֫

                            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                            public final /* synthetic */ C10139 f76111;

                            {
                                int i14 = -145519195;
                                int i15 = C2375.f7641;
                                int i16 = C1826.f6190;
                                int iM2764 = (C0619.m2761("ܳۗ") + i16) * (-103);
                                int i17 = ((iM2764 ^ i15) * 27713) ^ (-769299144);
                                int i18 = -280612945;
                                while (true) {
                                    i14 = ((((i14 ^ i15) * 11015) >> 31) & i17) ^ (iM2764 ^ i18);
                                    switch (i14) {
                                        case -2141595911:
                                        case 639590213:
                                            if (C23916.f77426 <= 0) {
                                                iM2764 = (C0619.m2761("۟ܳ") ^ i16) * (-107);
                                                i17 = ((iM2764 ^ i15) * (-19883)) ^ 1529034105;
                                                i18 = 2031658547;
                                            } else {
                                                iM2764 = C0773.m3169("֫֡") ^ i16;
                                                i17 = ((iM2764 ^ i15) * 2045) ^ (-1857101494);
                                                i18 = 438397568;
                                            }
                                            break;
                                        case -2010268196:
                                        case 92934254:
                                            this.f76111 = this;
                                            if (C2966.f9654 >= 0) {
                                                iM2764 = (C0619.m2761("۟ܳ") ^ i16) * (-107);
                                                i17 = ((iM2764 ^ i15) * (-19883)) ^ 1529034105;
                                                i18 = 2031658547;
                                            } else {
                                                iM2764 = (i15 - C0619.m2761("ᩴۜ")) * 35;
                                                i17 = ((iM2764 ^ i16) * 16969) ^ (-50707609);
                                                i18 = 1469139253;
                                            }
                                            break;
                                        case -1931107180:
                                        case -1197780953:
                                            if (C3077.f9998) {
                                                iM2764 = (i16 - C0619.m2761("ܰ۠")) * (-11);
                                                i17 = ((iM2764 ^ i15) * (-11981)) ^ (-1749244187);
                                                i18 = -943602545;
                                            } else {
                                                iM2764 = (C0619.m2761("ᩴۙ") + i15) * 81;
                                                i17 = ((iM2764 ^ i16) * 14781) ^ 1838249861;
                                                i18 = -1209743312;
                                            }
                                            break;
                                        case -1844725131:
                                        case 467504437:
                                            C0619.m2763();
                                            C0619.m2763();
                                            throw new RuntimeException();
                                        case -1727352999:
                                        case 71604615:
                                            if (C2834.f9334 <= 0) {
                                                iM2764 = (C0619.m2761("ܶܽ") + i16) * (-73);
                                                i17 = ((iM2764 ^ i15) * (-22423)) ^ (-786234285);
                                                i18 = 566225239;
                                            } else {
                                                iM2764 = (i15 - C0619.m2761("᩷֡")) * 87;
                                                i17 = ((iM2764 ^ i16) * (-22705)) ^ (-843776127);
                                                i18 = -101241075;
                                            }
                                            break;
                                        case -1426299652:
                                        case 1311508459:
                                            if (!C13473.m33144()) {
                                                iM2764 = (C0773.m3169("᩷᩻") ^ i15) * (-87);
                                                i17 = ((iM2764 ^ i16) * 809) ^ (-1211152622);
                                                i18 = -1525371437;
                                            } else {
                                                iM2764 = C0773.m3169("ܳۛ") ^ i15;
                                                i17 = ((iM2764 ^ i16) * 22961) ^ 1947006668;
                                                i18 = -1613084544;
                                            }
                                            break;
                                        case -1378541739:
                                        case -1368623130:
                                            if (C2966.f9654 >= 0) {
                                                iM2764 = (C0773.m3169("᩷᩻") ^ i15) * (-87);
                                                i17 = ((iM2764 ^ i16) * 809) ^ (-1211152622);
                                                i18 = -1525371437;
                                            } else {
                                                iM2764 = C0619.m2761("֨۫") ^ i16;
                                                i17 = ((iM2764 ^ i15) * (-20697)) ^ 1847476759;
                                                i18 = -457419939;
                                            }
                                            break;
                                        case -1207933250:
                                        case 1284920462:
                                            C3492.m11488();
                                            if (C2287.f7432 >= 0) {
                                                iM2764 = (C0619.m2761("۟ܳ") ^ i16) * (-107);
                                                i17 = ((iM2764 ^ i15) * (-19883)) ^ 1529034105;
                                                i18 = 2031658547;
                                            } else {
                                                iM2764 = (C0619.m2761("ܶܽ") + i16) * (-73);
                                                i17 = ((iM2764 ^ i15) * (-22423)) ^ (-786234285);
                                                i18 = 566225239;
                                            }
                                            break;
                                        case -985452042:
                                        case -309454474:
                                            C23916.m53419();
                                            C2310.m7813();
                                            iM2764 = (C0619.m2761("ܶܽ") + i16) * (-73);
                                            i17 = ((iM2764 ^ i15) * (-22423)) ^ (-786234285);
                                            i18 = 566225239;
                                            break;
                                        case -831975938:
                                        case 1535235448:
                                            if (C2287.f7432 >= 0) {
                                                iM2764 = (C0619.m2761("ᩴۙ") + i15) * 81;
                                                i17 = ((iM2764 ^ i16) * 14781) ^ 1838249861;
                                                i18 = -1209743312;
                                            } else {
                                                iM2764 = C0773.m3169("ۗ᩸") ^ i15;
                                                i17 = ((iM2764 ^ i16) * (-4671)) ^ (-10087403);
                                                i18 = 653607890;
                                            }
                                            break;
                                        case -352044303:
                                        case 1305326219:
                                            C3033.m9845();
                                            if (C3998.f13671 != 0) {
                                                iM2764 = (C0773.m3169("᩷᩻") ^ i15) * (-87);
                                                i17 = ((iM2764 ^ i16) * 809) ^ (-1211152622);
                                                i18 = -1525371437;
                                            } else {
                                                iM2764 = (C0619.m2761("ܶܽ") + i16) * (-73);
                                                i17 = ((iM2764 ^ i15) * (-22423)) ^ (-786234285);
                                                i18 = 566225239;
                                            }
                                            break;
                                        case 8064055:
                                        case 1333564596:
                                            if (C0773.m3161() != 0) {
                                                iM2764 = (C0773.m3169("᩷᩻") ^ i15) * (-87);
                                                i17 = ((iM2764 ^ i16) * 809) ^ (-1211152622);
                                                i18 = -1525371437;
                                            } else {
                                                iM2764 = C0619.m2761("ۘۤ") ^ i16;
                                                i17 = ((iM2764 ^ i15) * 21533) ^ (-831136756);
                                                i18 = -1433606891;
                                            }
                                            break;
                                        case 1215236819:
                                        case 2126834737:
                                            if (C1321.m4852()) {
                                                iM2764 = (C0619.m2761("ۢۨ") ^ i15) * (-51);
                                                i17 = ((iM2764 ^ i16) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged) ^ (-1927541260);
                                                i18 = -820101024;
                                            } else {
                                                iM2764 = C0773.m3169("ܳۛ") ^ i15;
                                                i17 = ((iM2764 ^ i16) * 22961) ^ 1947006668;
                                                i18 = -1613084544;
                                            }
                                            break;
                                        case 1378564394:
                                        case 2064252512:
                                            return;
                                        case 1467603879:
                                        case 1844537132:
                                            if (C3077.m10041()) {
                                                iM2764 = (C0619.m2761("ܶܽ") + i16) * (-73);
                                                i17 = ((iM2764 ^ i15) * (-22423)) ^ (-786234285);
                                                i18 = 566225239;
                                            } else {
                                                iM2764 = C0619.m2761("᩸ܺ") ^ i16;
                                                i17 = ((iM2764 ^ i15) * (-5287)) ^ 1670707490;
                                                i18 = -34822276;
                                            }
                                            break;
                                        default:
                                            if (C0862.f3233 != 0) {
                                                iM2764 = (C0619.m2761("ᩴۙ") + i15) * 81;
                                                i17 = ((iM2764 ^ i16) * 14781) ^ 1838249861;
                                                i18 = -1209743312;
                                            } else {
                                                iM2764 = C0619.m2761("֨ܽ") ^ i15;
                                                i17 = ((iM2764 ^ i16) * 11757) ^ 1557349020;
                                                i18 = -130316680;
                                            }
                                            break;
                                    }
                                }
                            }

                            @Override // android.webkit.ValueCallback
                            public final void onReceiveValue(Object obj) {
                                String str2 = null;
                                String str3 = null;
                                int i14 = -1695347466;
                                int i15 = C3448.f11240;
                                int i16 = C3099.f10023;
                                int iM2764 = C0619.m2761("ۨ᩺") ^ i16;
                                int i17 = ((iM2764 ^ i15) * 30925) ^ (-240290669);
                                int i18 = -1052212911;
                                while (true) {
                                    i14 = ((((i14 ^ i15) * 27023) >> 31) & i17) ^ (iM2764 ^ i18);
                                    switch (i14) {
                                        case -1726313659:
                                        case 1801667420:
                                            if (C2287.f7432 >= 0) {
                                                iM2764 = C0619.m2761("ܳ᩸") ^ i16;
                                                i17 = ((iM2764 ^ i15) * 20833) ^ (-468133226);
                                                i18 = 478720033;
                                            } else {
                                                iM2764 = (C0619.m2761("᩹۫") + i16) * (-113);
                                                i17 = ((iM2764 ^ i15) * 14193) ^ (-1871992488);
                                                i18 = 159701630;
                                            }
                                            break;
                                        case -1536536669:
                                        case 828594368:
                                            if (AbstractC0641.m2813() <= 0) {
                                                iM2764 = (i16 - C0619.m2761("۫ܶ")) * 37;
                                                i17 = ((iM2764 ^ i15) * 10595) ^ 1708034951;
                                                i18 = 961825632;
                                            } else {
                                                iM2764 = (i15 - C0773.m3169("ܽۨ")) * (-65);
                                                i17 = ((iM2764 ^ i16) * 17553) ^ 1191774605;
                                                i18 = -576459173;
                                            }
                                            break;
                                        case -1531737824:
                                        case -668844610:
                                            if (C2287.f7432 >= 0) {
                                                iM2764 = (C0619.m2761("ۤۙ") + i15) * (-85);
                                                i17 = ((iM2764 ^ i16) * 27369) ^ 975793845;
                                                i18 = 391521980;
                                            } else {
                                                iM2764 = C0619.m2761("ܰܽ") ^ i16;
                                                i17 = ((iM2764 ^ i15) * (-8793)) ^ (-715788707);
                                                i18 = -1335387879;
                                            }
                                            break;
                                        case -1429672879:
                                        case -353509033:
                                            str2 = str;
                                            if (RunnableC3646.f12471) {
                                                iM2764 = C0619.m2761("ܳ᩸") ^ i16;
                                                i17 = ((iM2764 ^ i15) * 20833) ^ (-468133226);
                                                i18 = 478720033;
                                            } else {
                                                iM2764 = C0619.m2761("ۨۗ") ^ i15;
                                                i17 = ((iM2764 ^ i16) * (-1403)) ^ (-371737072);
                                                i18 = -236116433;
                                            }
                                            break;
                                        case -1415773986:
                                        case 1915526480:
                                            C10139.m26171(this.f76111, i, str2, str3);
                                            break;
                                        case -1153350824:
                                        case 383807222:
                                            if (C0619.f2439) {
                                                iM2764 = C0619.m2761("ܰۚ") ^ i15;
                                                i17 = ((iM2764 ^ i16) * 10049) ^ 1077197824;
                                                i18 = 1411903812;
                                            } else {
                                                iM2764 = C0619.m2761("᩻ۢ") ^ i16;
                                                i17 = ((iM2764 ^ i15) * (-21615)) ^ 152603572;
                                                i18 = 1764923777;
                                            }
                                            break;
                                        case -1133598648:
                                        case 280270914:
                                            if (C11235.f35427 < 0) {
                                                iM2764 = C0619.m2761("ܳ᩸") ^ i16;
                                                i17 = ((iM2764 ^ i15) * 20833) ^ (-468133226);
                                                i18 = 478720033;
                                            } else {
                                                iM2764 = (C0619.m2761("ۤۙ") + i15) * (-85);
                                                i17 = ((iM2764 ^ i16) * 27369) ^ 975793845;
                                                i18 = 391521980;
                                            }
                                            break;
                                        case -1115003613:
                                        case -91594553:
                                            C3998.m12920();
                                            if (C3998.f13671 != 0) {
                                                iM2764 = C0619.m2761("ܰۚ") ^ i15;
                                                i17 = ((iM2764 ^ i16) * 10049) ^ 1077197824;
                                                i18 = 1411903812;
                                            } else {
                                                iM2764 = C0619.m2761("ܳ᩸") ^ i16;
                                                i17 = ((iM2764 ^ i15) * 20833) ^ (-468133226);
                                                i18 = 478720033;
                                            }
                                            break;
                                        case -932377419:
                                        case -34706905:
                                            C2310.m7813();
                                            break;
                                        case -468065376:
                                        case 142001430:
                                            if (C1080.m4050()) {
                                                iM2764 = (C0773.m3169("ۚܳ") + i15) * (-113);
                                                i17 = ((iM2764 ^ i16) * 22549) ^ 1588742317;
                                                i18 = -866939031;
                                            } else {
                                                iM2764 = C0619.m2761("ܰۚ") ^ i15;
                                                i17 = ((iM2764 ^ i16) * 10049) ^ 1077197824;
                                                i18 = 1411903812;
                                            }
                                            break;
                                        case -399145582:
                                        case 645873044:
                                            if (C1519.f5300 >= 0) {
                                                iM2764 = C0619.m2761("ܳ᩸") ^ i16;
                                                i17 = ((iM2764 ^ i15) * 20833) ^ (-468133226);
                                                i18 = 478720033;
                                            } else {
                                                iM2764 = (i15 - C0619.m2761("ۚ֫")) * (-37);
                                                i17 = ((iM2764 ^ i16) * (-32407)) ^ 1772120317;
                                                i18 = 1775999906;
                                            }
                                            break;
                                        case 78437333:
                                        case 2041622257:
                                            if (C3077.m10041()) {
                                                iM2764 = C0619.m2761("ܰۚ") ^ i15;
                                                i17 = ((iM2764 ^ i16) * 10049) ^ 1077197824;
                                                i18 = 1411903812;
                                            } else {
                                                iM2764 = (C0773.m3169("᩺ۢ") ^ i16) * (-95);
                                                i17 = ((iM2764 ^ i15) * (-29505)) ^ (-304148478);
                                                i18 = 1557356302;
                                            }
                                            break;
                                        case 540926554:
                                        case 1702498528:
                                            if (RunnableC3646.f12471) {
                                                iM2764 = (C0619.m2761("ۤۙ") + i15) * (-85);
                                                i17 = ((iM2764 ^ i16) * 27369) ^ 975793845;
                                                i18 = 391521980;
                                            } else {
                                                iM2764 = C0619.m2761("ۖ᩵") ^ i15;
                                                i17 = ((iM2764 ^ i16) * 20439) ^ 807190191;
                                                i18 = 44348334;
                                            }
                                            break;
                                        case 585027569:
                                        case 1155183362:
                                            C0487.m2356();
                                            iM2764 = (C0619.m2761("ۤۙ") + i15) * (-85);
                                            i17 = ((iM2764 ^ i16) * 27369) ^ 975793845;
                                            i18 = 391521980;
                                            break;
                                        case 1029704751:
                                        case 1819206816:
                                            RunnableC3055.m9933();
                                            if (C2310.m7813() <= 0) {
                                                iM2764 = (i16 - C0619.m2761("۫ܶ")) * 37;
                                                i17 = ((iM2764 ^ i15) * 10595) ^ 1708034951;
                                                i18 = 961825632;
                                            } else {
                                                iM2764 = C0619.m2761("ܳ᩸") ^ i16;
                                                i17 = ((iM2764 ^ i15) * 20833) ^ (-468133226);
                                                i18 = 478720033;
                                            }
                                            break;
                                        default:
                                            str3 = (String) obj;
                                            if (AbstractC0116.f1064 <= 0) {
                                                iM2764 = C0619.m2761("ܺܰ") ^ i16;
                                                i17 = ((iM2764 ^ i15) * (-26211)) ^ (-1305536271);
                                                i18 = 876411152;
                                            } else {
                                                iM2764 = (i16 - C0773.m3169("ۧ᩻")) * (-79);
                                                i17 = ((iM2764 ^ i15) * (-14339)) ^ (-2039871478);
                                                i18 = 355722412;
                                            }
                                            break;
                                    }
                                    return;
                                }
                            }
                        });
                        iM2761 = C0773.m3169("ܿ۠") ^ i11;
                        i12 = (-39947424) ^ ((iM2761 ^ i10) * 30695);
                        i2 = -2034252234;
                        i13 = i2 ^ iM2761;
                        break;
                    case 129888578:
                    case 1519690503:
                        i5 = 212110096 + (s * s);
                        if (AbstractC0116.f1064 <= 0) {
                            iM2761 = (C0773.m3169("᩺ۛ") ^ i10) * 75;
                            i12 = (-661271106) ^ ((iM2761 ^ i11) * (-9685));
                            i2 = 479761538;
                        } else {
                            iM2761 = C0619.m2761("ۖ۟") ^ i11;
                            i12 = 1894195406 ^ ((iM2761 ^ i10) * (-10235));
                            i2 = -2077229124;
                        }
                        i13 = i2 ^ iM2761;
                        break;
                    case 253823753:
                    case 1750745618:
                        if (this.f32449) {
                            iM2761 = C0773.m3169("ܿ۠") ^ i11;
                            i12 = (-39947424) ^ ((iM2761 ^ i10) * 30695);
                            i2 = -2034252234;
                        } else {
                            iM2761 = C0619.m2761("ۤ᩹") ^ i10;
                            i12 = 192748082 ^ ((iM2761 ^ i11) * (-11175));
                            i2 = 150216699;
                        }
                        i13 = i2 ^ iM2761;
                        break;
                    case 259989580:
                    case 2066129519:
                        sArr2 = f32436;
                        i7 = 536;
                        i8 = 91;
                        if (C0487.f2131 > 0) {
                            iM2761 = (C0773.m3169("۟۠") + i11) * 49;
                            i12 = (-2126944205) ^ ((iM2761 ^ i10) * 26603);
                            i2 = 1440324194;
                            i13 = i2 ^ iM2761;
                        } else {
                            iM3169 = (C0773.m3169("᩸ۨ") + i10) * 81;
                            i12 = (-2053659766) ^ ((iM3169 ^ i11) * 29859);
                            i3 = 1273969398;
                            i13 = i3 ^ iM3169;
                        }
                        break;
                    case 377826475:
                    case 589030771:
                        if (this.f32468 == i) {
                            iM2761 = (C0619.m2761("ۤܶ") ^ i11) * (-83);
                            i12 = (-248551067) ^ ((iM2761 ^ i10) * 25515);
                            i2 = -1444830486;
                        } else {
                            iM2761 = C0773.m3169("ܿ۠") ^ i11;
                            i12 = (-39947424) ^ ((iM2761 ^ i10) * 30695);
                            i2 = -2034252234;
                        }
                        i13 = i2 ^ iM2761;
                        break;
                    case 574105451:
                    case 1013546771:
                        this.f32449 = true;
                        if (C3492.m11488()) {
                            short[] sArr3 = f32436;
                            if (C0773.f2792 <= 0 || !C13473.m33144()) {
                                iM3169 = (C0773.m3169("᩸ۚ") + i11) * 11;
                                i12 = (-327764028) ^ ((iM3169 ^ i10) * 29401);
                                i3 = -355110590;
                                i13 = i3 ^ iM3169;
                                break;
                            } else {
                                sb = new StringBuilder(C23916.m53420(sArr3, 491, 45, i6));
                                C3779.m12258(sb, JSONObject.quote(str));
                                if (C2419.f7754 < 0) {
                                    iM2761 = C0773.m3169("᩺ۖ") ^ i10;
                                    i12 = (-1464440736) ^ ((iM2761 ^ i11) * (-15663));
                                    i2 = 632345429;
                                    i13 = i2 ^ iM2761;
                                    break;
                                }
                            }
                        }
                        iM3169 = (C0773.m3169("᩸ۨ") + i10) * 81;
                        i12 = (-2053659766) ^ ((iM3169 ^ i11) * 29859);
                        i3 = 1273969398;
                        i13 = i3 ^ iM3169;
                        break;
                    default:
                        if (this.f32478 == null) {
                            iM2761 = C0773.m3169("᩷ۧ") ^ i11;
                            i12 = (-1422976662) ^ ((iM2761 ^ i10) * 1391);
                            i2 = 599020168;
                        } else {
                            iM2761 = C0773.m3169("ܿ۠") ^ i11;
                            i12 = (-39947424) ^ ((iM2761 ^ i10) * 30695);
                            i2 = -2034252234;
                        }
                        i13 = i2 ^ iM2761;
                        break;
                }
                return;
            }
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 29521. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m26171(l.C10139 r50, int r51, java.lang.String r52, java.lang.String r53) {
        /*
            Method dump skipped, instruction units count: 2952
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10139.m26171(l.ۢ۬֫, int, java.lang.String, java.lang.String):void");
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private void m26189() {
        boolean z = false;
        FrameLayout frameLayout = null;
        int i = -850785542;
        int i2 = C2702.f8586;
        int i3 = C3033.f9831;
        int iM2761 = C0619.m2761("۠ۛ") ^ i3;
        int i4 = ((iM2761 ^ i2) * 10153) ^ (-326566416);
        int i5 = -1224475849;
        while (true) {
            i = ((((i ^ i2) * 9797) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2081037804:
                case 100235322:
                    frameLayout.getParent().requestDisallowInterceptTouchEvent(z);
                    iM2761 = C0773.m3169("ܶ᩶") ^ i2;
                    i4 = ((iM2761 ^ i3) * (-7841)) ^ (-76229906);
                    i5 = -1605546797;
                    break;
                case -2013938561:
                case 1071509440:
                    frameLayout = this.f32446;
                    if (frameLayout.getParent() != null) {
                        iM2761 = C0773.m3169("᩹ۡ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-3069)) ^ 420875508;
                        i5 = 1814755894;
                    } else {
                        iM2761 = C0773.m3169("ܶ᩶") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-7841)) ^ (-76229906);
                        i5 = -1605546797;
                    }
                    break;
                case -1750921325:
                case 1638570680:
                    if (C0862.f3233 != 0) {
                        iM2761 = (C0619.m2761("ܰܶ") ^ i3) * (-39);
                        i4 = ((iM2761 ^ i2) * 29417) ^ 1805471011;
                        i5 = 1861608514;
                    } else {
                        iM2761 = C0773.m3169("ᩴۛ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-26733)) ^ (-898734271);
                        i5 = -1403512939;
                    }
                    break;
                case -1686857816:
                case 1042335784:
                    if (RunnableC3055.f9898 >= 0) {
                        iM2761 = (C0619.m2761("ܰܶ") ^ i3) * (-39);
                        i4 = ((iM2761 ^ i2) * 29417) ^ 1805471011;
                        i5 = 1861608514;
                    } else {
                        iM2761 = (C0619.m2761("ۚ᩹") ^ i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM2761 ^ i2) * (-17863)) ^ 1325860434;
                        i5 = 3857989;
                    }
                    break;
                case -1650227285:
                case 281962395:
                    if (C2485.m8357() <= 0) {
                        iM2761 = (C0619.m2761("ܰܶ") ^ i3) * (-39);
                        i4 = ((iM2761 ^ i2) * 29417) ^ 1805471011;
                        i5 = 1861608514;
                    } else {
                        iM2761 = (C0773.m3169("۠ۧ") + i3) * 21;
                        i4 = ((iM2761 ^ i2) * 5415) ^ (-353773452);
                        i5 = 1848184048;
                    }
                    break;
                case -1225268309:
                case -400338577:
                    break;
                case -1061710520:
                case 1512100256:
                    C3690.m11987();
                    if (C4282.f15546 > 0) {
                        iM2761 = (i3 - C0619.m2761("֫֡")) * 95;
                        i4 = ((iM2761 ^ i2) * 17123) ^ 1596751770;
                        i5 = -89594953;
                    } else {
                        iM2761 = (C0619.m2761("ܰܶ") ^ i3) * (-39);
                        i4 = ((iM2761 ^ i2) * 29417) ^ 1805471011;
                        i5 = 1861608514;
                    }
                    break;
                case -1022757515:
                case 2122410670:
                    if (C1783.f6087 <= 0) {
                        iM2761 = C0773.m3169("ۖۡ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 3907) ^ 406842192;
                        i5 = 309764646;
                    } else {
                        iM2761 = C0773.m3169("ܽۚ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 3903) ^ (-1950002197);
                        i5 = 384156785;
                    }
                    break;
                case -882422607:
                case -121302373:
                    C17202.m40372();
                    if (C1564.f5401 <= 0) {
                        iM2761 = C0773.m3169("ۖۡ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 3907) ^ 406842192;
                        i5 = 309764646;
                    } else {
                        iM2761 = C0773.m3169("ۖ᩺") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-15163)) ^ 1717268956;
                        i5 = 1750433563;
                    }
                    break;
                case -466236722:
                case 1744774892:
                    if (C2419.m8174() >= 0) {
                        iM2761 = C0619.m2761("ᩴۘ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-30783)) ^ (-785934694);
                        i5 = -1998960624;
                    } else {
                        iM2761 = (C0619.m2761("ۚ᩷") ^ i3) * 47;
                        i4 = ((iM2761 ^ i2) * 1135) ^ (-1113452293);
                        i5 = 424140610;
                    }
                    break;
                case 206042789:
                case 540767939:
                    C3690.m11987();
                    C13473.m33144();
                    break;
                case 261882664:
                case 920458345:
                    this.f32479 = z;
                    if (C0619.f2439) {
                        iM2761 = C0619.m2761("ᩴۘ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-30783)) ^ (-785934694);
                        i5 = -1998960624;
                    } else {
                        iM2761 = (C0773.m3169("۠۬") ^ i3) * 87;
                        i4 = ((iM2761 ^ i2) * 27045) ^ (-440500655);
                        i5 = 66018581;
                    }
                    break;
                case 290091734:
                case 1511563089:
                    C3448.m11248();
                    if (!C1783.m6232()) {
                        iM2761 = (C0619.m2761("ܰܶ") ^ i3) * (-39);
                        i4 = ((iM2761 ^ i2) * 29417) ^ 1805471011;
                        i5 = 1861608514;
                    } else {
                        iM2761 = C0773.m3169("ۖ᩺") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-15163)) ^ 1717268956;
                        i5 = 1750433563;
                    }
                    break;
                case 342688313:
                case 858188991:
                    if (C2878.f9462) {
                        iM2761 = C0619.m2761("ᩴۘ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-30783)) ^ (-785934694);
                        i5 = -1998960624;
                    } else {
                        iM2761 = (C0773.m3169("᩺᩻") ^ i2) * (-39);
                        i4 = ((iM2761 ^ i3) * (-20573)) ^ (-77958212);
                        i5 = -120110499;
                    }
                    break;
                case 463996558:
                case 468621661:
                    C1564.m5509();
                    iM2761 = C0773.m3169("ۖ᩺") ^ i2;
                    i4 = ((iM2761 ^ i3) * (-15163)) ^ 1717268956;
                    i5 = 1750433563;
                    break;
                case 1491010406:
                case 1663291619:
                    z = false;
                    if (C2878.m9491() <= 0) {
                        iM2761 = (i3 - C0619.m2761("֫֡")) * 95;
                        i4 = ((iM2761 ^ i2) * 17123) ^ 1596751770;
                        i5 = -89594953;
                    } else {
                        iM2761 = (C0619.m2761("ᩳ۠") + i2) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM2761 ^ i3) * 20665) ^ 892565325;
                        i5 = 466300215;
                    }
                    break;
                case 1586218224:
                case 1638448014:
                    if (AbstractC0641.f2496 >= 0) {
                        iM2761 = C0773.m3169("ۖ᩺") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-15163)) ^ 1717268956;
                        i5 = 1750433563;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ۢۧ")) * 27;
                        i4 = ((iM2761 ^ i2) * 22021) ^ (-1462619240);
                        i5 = 1918458304;
                    }
                    break;
                default:
                    if (C1080.m4050()) {
                        iM2761 = (C0619.m2761("᩻ܳ") ^ i2) * (-21);
                        i4 = ((iM2761 ^ i3) * (-10165)) ^ (-174944860);
                        i5 = 445774261;
                    } else {
                        iM2761 = C0619.m2761("ᩴۘ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-30783)) ^ (-785934694);
                        i5 = -1998960624;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m26191(int i) {
        int iM26196 = 0;
        int iM26197 = 0;
        ArrayList arrayList = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = -1201757430;
        int i5 = C3734.f12817;
        int i6 = C3033.f9831;
        int iM3169 = C0773.m3169("ܳ᩺") ^ i5;
        int i7 = ((iM3169 ^ i6) * (-19545)) ^ (-461579346);
        int i8 = 472548933;
        while (true) {
            i4 = ((((i4 ^ i6) * 27099) >> 31) & i7) ^ (iM3169 ^ i8);
            switch (i4) {
                case -1992642213:
                case -710854759:
                    if (C1321.f4751 >= 0) {
                        iM3169 = (i5 - C0619.m2761("ܶ۬")) * 33;
                        i7 = ((iM3169 ^ i6) * 10589) ^ 867175026;
                        i8 = 2077046042;
                    } else {
                        iM3169 = C0619.m2761("ᩴ᩶") ^ i6;
                        i7 = ((iM3169 ^ i5) * 18611) ^ 130887672;
                        i8 = -146854189;
                    }
                    break;
                case -1984354839:
                case -1115629009:
                    if (C0862.m3503()) {
                        iM3169 = C0773.m3169("۬ᩴ") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-29793)) ^ (-1158553766);
                        i8 = -555698844;
                    } else {
                        iM3169 = (i5 - C0619.m2761("ܶ۬")) * 33;
                        i7 = ((iM3169 ^ i6) * 10589) ^ 867175026;
                        i8 = 2077046042;
                    }
                    break;
                case -1880484378:
                case -1075033645:
                    if (C3492.m11488()) {
                        iM3169 = (i6 - C0773.m3169("ۛ᩵")) * 41;
                        i7 = ((iM3169 ^ i5) * 9695) ^ 308108567;
                        i8 = -949430598;
                    } else {
                        iM3169 = (i5 - C0619.m2761("ܶ۬")) * 33;
                        i7 = ((iM3169 ^ i6) * 10589) ^ 867175026;
                        i8 = 2077046042;
                    }
                    break;
                case -1669423737:
                case 1078313034:
                    if (C11235.f35427 >= 0) {
                        iM3169 = (C0773.m3169("ۛۘ") ^ i5) * (-107);
                        i7 = ((iM3169 ^ i6) * (-641)) ^ (-1387954955);
                        i8 = -28982029;
                    } else {
                        iM3169 = (C0773.m3169("۬ۗ") ^ i6) * (-3);
                        i7 = ((iM3169 ^ i5) * (-19857)) ^ (-789244505);
                        i8 = 1217811226;
                    }
                    break;
                case -1548150043:
                case -1438503044:
                    arrayList = this.f32457;
                    if (i2 < C2288.m7752(arrayList)) {
                        iM3169 = C0773.m3169("֫ۨ") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-15649)) ^ (-1284704322);
                        i8 = 712630045;
                    } else {
                        iM3169 = (i6 - C0619.m2761("ۗۗ")) * (-39);
                        i7 = ((iM3169 ^ i5) * (-15683)) ^ 1900915719;
                        i8 = 1197919409;
                    }
                    break;
                case -1384929654:
                case 1659518410:
                    if (AbstractC3624.f12429 <= 0) {
                        iM3169 = C0619.m2761("᩶ᩳ") ^ i6;
                        i7 = ((iM3169 ^ i5) * 26717) ^ 735476731;
                        i8 = -1348817571;
                    } else {
                        iM3169 = (C0619.m2761("ۡ֫") ^ i5) * (-99);
                        i7 = ((iM3169 ^ i6) * (-8461)) ^ 231469265;
                        i8 = -414647864;
                    }
                    break;
                case -1192753182:
                case 677124541:
                    if (C3492.m11488()) {
                        iM3169 = C0619.m2761("᩻ܽ") ^ i6;
                        i7 = ((iM3169 ^ i5) * 19749) ^ (-1984644556);
                        i8 = 669522323;
                    } else {
                        iM3169 = (C0773.m3169("۬ۗ") ^ i6) * (-3);
                        i7 = ((iM3169 ^ i5) * (-19857)) ^ (-789244505);
                        i8 = 1217811226;
                    }
                    break;
                case -1083594951:
                case 1976699957:
                    i3 = ((C14614) C3690.m11990(arrayList, i2)).f46028;
                    if (i3 != iM26196) {
                        iM3169 = C0773.m3169("᩵᩻") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-6175)) ^ (-292929736);
                        i8 = -1758421132;
                    } else {
                        iM3169 = C0773.m3169("۟ۖ") ^ i6;
                        i7 = ((iM3169 ^ i5) * 24689) ^ (-869973609);
                        i8 = -552518102;
                    }
                    break;
                case -997722476:
                case 2068746575:
                    i2 = 0;
                    iM3169 = (C0773.m3169("ۙۛ") + i6) * (-3);
                    i7 = ((iM3169 ^ i5) * 9329) ^ 577238220;
                    i8 = -1708446496;
                    break;
                case -935918053:
                case 7816506:
                    if (C2354.f7599 >= 0) {
                        iM3169 = (C0773.m3169("۬ۗ") ^ i6) * (-3);
                        i7 = ((iM3169 ^ i5) * (-19857)) ^ (-789244505);
                        i8 = 1217811226;
                    } else {
                        iM3169 = C0619.m2761("֡᩺") ^ i5;
                        i7 = ((iM3169 ^ i6) * 12587) ^ (-649119078);
                        i8 = -1244349852;
                    }
                    break;
                case -173109896:
                case 1580368384:
                    i2++;
                    iM3169 = (C0773.m3169("ۙۛ") + i6) * (-3);
                    i7 = ((iM3169 ^ i5) * 9329) ^ 577238220;
                    i8 = -1708446496;
                    break;
                case 50516302:
                case 2048768146:
                    this.f32444 = i;
                    iM26197 = m26196();
                    if (iM26196 == iM26197) {
                        iM3169 = (i6 - C0619.m2761("ۗۗ")) * (-39);
                        i7 = ((iM3169 ^ i5) * (-15683)) ^ 1900915719;
                        i8 = 1197919409;
                    } else {
                        iM3169 = C0619.m2761("۬۠") ^ i5;
                        i7 = ((iM3169 ^ i6) * 31399) ^ (-712126742);
                        i8 = -295796094;
                    }
                    break;
                case 135157383:
                case 1812546415:
                    C0269.m1775();
                    C1826.m6301();
                    break;
                case 189983164:
                case 2029998247:
                    C20932.m47848();
                    C0862.m3503();
                    iM3169 = (C0773.m3169("ۧ᩵") + i5) * (-21);
                    i7 = ((iM3169 ^ i6) * (-11093)) ^ 616080165;
                    i8 = -846919862;
                    break;
                case 417350651:
                case 1511869024:
                    if (C3033.f9831 >= 0) {
                        iM3169 = (C0773.m3169("۬ۗ") ^ i6) * (-3);
                        i7 = ((iM3169 ^ i5) * (-19857)) ^ (-789244505);
                        i8 = 1217811226;
                    } else {
                        iM3169 = (C0773.m3169("۫ۛ") + i5) * (-63);
                        i7 = ((iM3169 ^ i6) * 10447) ^ 1761689682;
                        i8 = -397496789;
                    }
                    break;
                case 549764132:
                case 1242017520:
                    if (C1080.m4050()) {
                        iM3169 = C0619.m2761("ܳ֫") ^ i6;
                        i7 = ((iM3169 ^ i5) * 7483) ^ 110613942;
                        i8 = -896136571;
                    } else {
                        iM3169 = (C0773.m3169("ۛۘ") ^ i5) * (-107);
                        i7 = ((iM3169 ^ i6) * (-641)) ^ (-1387954955);
                        i8 = -28982029;
                    }
                    break;
                case 625659383:
                case 1241471112:
                    if (AbstractC0116.f1064 <= 0) {
                        iM3169 = (C0773.m3169("ۛۘ") ^ i5) * (-107);
                        i7 = ((iM3169 ^ i6) * (-641)) ^ (-1387954955);
                        i8 = -28982029;
                    } else {
                        iM3169 = C0619.m2761("ۚܺ") ^ i5;
                        i7 = ((iM3169 ^ i6) * 25279) ^ (-78968392);
                        i8 = 452591871;
                    }
                    break;
                case 818792023:
                case 876948292:
                    this.f32475.notifyItemChanged(i2);
                    iM3169 = (i6 - C0619.m2761("᩹ܳ")) * 127;
                    i7 = ((iM3169 ^ i5) * (-5541)) ^ 728673227;
                    i8 = -1565949392;
                    break;
                case 826042310:
                case 1881187673:
                    iM26196 = m26196();
                    if (C2878.m9491() <= 0) {
                        iM3169 = (i5 - C0619.m2761("ܶ۬")) * 33;
                        i7 = ((iM3169 ^ i6) * 10589) ^ 867175026;
                        i8 = 2077046042;
                    } else {
                        iM3169 = (i5 - C0773.m3169("ۚۗ")) * 49;
                        i7 = ((iM3169 ^ i6) * (-24955)) ^ (-570042958);
                        i8 = -1961931790;
                    }
                    break;
                case 854664587:
                case 1267398715:
                    break;
                case 1255724174:
                case 1287767481:
                    if (!C3077.f9998) {
                        iM3169 = (C0773.m3169("ۛۘ") ^ i5) * (-107);
                        i7 = ((iM3169 ^ i6) * (-641)) ^ (-1387954955);
                        i8 = -28982029;
                    } else {
                        iM3169 = C0619.m2761("᩶ᩳ") ^ i6;
                        i7 = ((iM3169 ^ i5) * 26717) ^ 735476731;
                        i8 = -1348817571;
                    }
                    break;
                case 1275272519:
                case 2142624592:
                    C0487.m2356();
                    if (!RunnableC3646.f12471) {
                        iM3169 = (C0773.m3169("۬ۗ") ^ i6) * (-3);
                        i7 = ((iM3169 ^ i5) * (-19857)) ^ (-789244505);
                        i8 = 1217811226;
                    } else {
                        iM3169 = (C0773.m3169("ۧ᩵") + i5) * (-21);
                        i7 = ((iM3169 ^ i6) * (-11093)) ^ 616080165;
                        i8 = -846919862;
                    }
                    break;
                default:
                    if (i3 != iM26197) {
                        iM3169 = (i6 - C0619.m2761("᩹ܳ")) * 127;
                        i7 = ((iM3169 ^ i5) * (-5541)) ^ 728673227;
                        i8 = -1565949392;
                    } else {
                        iM3169 = C0773.m3169("۟ۖ") ^ i6;
                        i7 = ((iM3169 ^ i5) * 24689) ^ (-869973609);
                        i8 = -552518102;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int m26196() {
        int i = 0;
        ArrayList arrayList = null;
        C14614 c14614 = null;
        int i2 = -1944321229;
        int i3 = C2287.f7432;
        int i4 = C0269.f1558;
        int iM3169 = (C0773.m3169("᩵᩸") ^ i3) * (-67);
        int i5 = ((iM3169 ^ i4) * (-18703)) ^ (-1028007094);
        int i6 = -1207951830;
        while (true) {
            i2 = ((((i2 ^ i4) * (-10175)) >> 31) & i5) ^ (iM3169 ^ i6);
            switch (i2) {
                case -2112552689:
                case -334266228:
                    if (C3033.m9845() <= 0) {
                        iM3169 = C0773.m3169("ۢ᩹") ^ i4;
                        i5 = ((iM3169 ^ i3) * 7455) ^ (-2052190729);
                        i6 = 1361847168;
                    } else {
                        iM3169 = (i4 - C0619.m2761("ۛ᩵")) * 95;
                        i5 = ((iM3169 ^ i3) * 24223) ^ (-443239541);
                        i6 = 1218315214;
                    }
                    break;
                case -2111843031:
                case -726943303:
                    return -1;
                case -1976610466:
                case 56708451:
                    if (AbstractC3624.f12429 <= 0) {
                        iM3169 = (i4 - C0619.m2761("ۙ᩺")) * 13;
                        i5 = ((iM3169 ^ i3) * (-6699)) ^ 556950640;
                        i6 = -1424915016;
                    } else {
                        iM3169 = C0773.m3169("ۨܶ") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-22627)) ^ 1166223649;
                        i6 = -1253350866;
                    }
                    break;
                case -1824373819:
                case 1453703428:
                    if (C2288.f7433 <= 0) {
                        iM3169 = C0773.m3169("᩵᩹") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-28125)) ^ (-1867892497);
                        i6 = 987543427;
                    } else {
                        iM3169 = (i4 - C0773.m3169("ᩴۡ")) * (-9);
                        i5 = ((iM3169 ^ i3) * 14359) ^ 1481470807;
                        i6 = -922745668;
                    }
                    break;
                case -1710413953:
                case -796925274:
                    if (AbstractC0641.m2813() <= 0) {
                        iM3169 = (i4 - C0619.m2761("ۙ᩺")) * 13;
                        i5 = ((iM3169 ^ i3) * (-6699)) ^ 556950640;
                        i6 = -1424915016;
                    } else {
                        iM3169 = C0619.m2761("᩺֨") ^ i3;
                        i5 = ((iM3169 ^ i4) * 3053) ^ 308060633;
                        i6 = -693017245;
                    }
                    break;
                case -1616790142:
                case -451067100:
                    if (C2702.f8586 <= 0) {
                        iM3169 = C0773.m3169("᩵᩹") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-28125)) ^ (-1867892497);
                        i6 = 987543427;
                    } else {
                        iM3169 = C0773.m3169("ܰᩴ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-24227)) ^ 755815241;
                        i6 = 33711682;
                    }
                    break;
                case -1549963108:
                case -1447842776:
                    C0773.m3161();
                    C3033.m9845();
                    return 0;
                case -1537175005:
                case 514503551:
                    if (C0269.f1558 <= 0) {
                        iM3169 = (i4 - C0619.m2761("ۙ᩺")) * 13;
                        i5 = ((iM3169 ^ i3) * (-6699)) ^ 556950640;
                        i6 = -1424915016;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ۧ۫")) * (-111);
                        i5 = ((iM3169 ^ i4) * (-24945)) ^ (-586839413);
                        i6 = 1967328662;
                    }
                    break;
                case -1260239763:
                case 1033812725:
                    if (C3077.f9998) {
                        iM3169 = C0619.m2761("᩸᩺") ^ i4;
                        i5 = ((iM3169 ^ i3) * 779) ^ 236059430;
                        i6 = 343630901;
                    } else {
                        iM3169 = C0773.m3169("᩵᩹") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-28125)) ^ (-1867892497);
                        i6 = 987543427;
                    }
                    break;
                case -1218368617:
                case -1161271506:
                    AbstractC0116.m1243();
                    C2702.m8876();
                    iM3169 = (i4 - C0773.m3169("ܺܽ")) * 101;
                    i5 = ((iM3169 ^ i3) * (-6091)) ^ 424817789;
                    i6 = 265120484;
                    break;
                case -1035483275:
                case 1554302064:
                    if (c14614.f46022) {
                        iM3169 = (i4 - C0619.m2761("ܰᩳ")) * (-113);
                        i5 = ((iM3169 ^ i3) * 27689) ^ (-1089945744);
                        i6 = 2029844923;
                    } else {
                        iM3169 = (C0773.m3169("ۡۗ") + i3) * 55;
                        i5 = ((iM3169 ^ i4) * (-17861)) ^ 1951108983;
                        i6 = -247456509;
                    }
                    break;
                case -1030914648:
                case -830940625:
                    i = this.f32444;
                    iM3169 = (i3 - C0773.m3169("ۗܽ")) * 109;
                    i5 = ((iM3169 ^ i4) * (-17839)) ^ (-970969995);
                    i6 = -996526159;
                    break;
                case -967354919:
                case 1570426143:
                    C1783.m6232();
                    if (C2419.f7754 >= 0) {
                        iM3169 = C0773.m3169("᩵᩹") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-28125)) ^ (-1867892497);
                        i6 = 987543427;
                    } else {
                        iM3169 = (i4 - C0773.m3169("ܺܽ")) * 101;
                        i5 = ((iM3169 ^ i3) * (-6091)) ^ 424817789;
                        i6 = 265120484;
                    }
                    break;
                case -845669250:
                case -637283787:
                    C3099.m10095();
                    if (C0487.f2131 <= 0) {
                        iM3169 = C0773.m3169("᩻ᩳ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-285)) ^ 1252654316;
                        i6 = 1178829960;
                    } else {
                        iM3169 = (i4 - C0773.m3169("ܺܽ")) * 101;
                        i5 = ((iM3169 ^ i3) * (-6091)) ^ 424817789;
                        i6 = 265120484;
                    }
                    break;
                case -581178918:
                case 1522014559:
                    return i;
                case -397790803:
                case 44415038:
                    if (C2878.f9462) {
                        iM3169 = C0773.m3169("᩻ᩳ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-285)) ^ 1252654316;
                        i6 = 1178829960;
                    } else {
                        iM3169 = C0773.m3169("ܺۜ") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-28425)) ^ (-278959568);
                        i6 = 837602690;
                    }
                    break;
                case -364798161:
                case 1946296746:
                    i = c14614.f46025;
                    iM3169 = (i3 - C0773.m3169("ۗܽ")) * 109;
                    i5 = ((iM3169 ^ i4) * (-17839)) ^ (-970969995);
                    i6 = -996526159;
                    break;
                case 144309375:
                case 1646453656:
                    arrayList = this.f32474;
                    if (i < C2288.m7752(arrayList)) {
                        iM3169 = (C0619.m2761("۫ۡ") + i3) * (-119);
                        i5 = ((iM3169 ^ i4) * (-14919)) ^ (-545562251);
                        i6 = 826494973;
                    } else {
                        iM3169 = (C0773.m3169("ۙۢ") ^ i4) * (-19);
                        i5 = ((iM3169 ^ i3) * (-23505)) ^ (-842898999);
                        i6 = -2697257;
                    }
                    break;
                case 309055191:
                case 1172171050:
                    c14614 = (C14614) C3690.m11990(arrayList, i);
                    if (AbstractC0116.f1064 <= 0) {
                        iM3169 = (i4 - C0619.m2761("ۙ᩺")) * 13;
                        i5 = ((iM3169 ^ i3) * (-6699)) ^ 556950640;
                        i6 = -1424915016;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ۘۧ")) * (-3);
                        i5 = ((iM3169 ^ i4) * 11607) ^ (-1909671693);
                        i6 = 1109724647;
                    }
                    break;
                case 993964840:
                case 1246435282:
                    if (AbstractC3624.f12429 <= 0) {
                        iM3169 = C0773.m3169("ۢ᩹") ^ i4;
                        i5 = ((iM3169 ^ i3) * 7455) ^ (-2052190729);
                        i6 = 1361847168;
                    } else {
                        iM3169 = C0773.m3169("ۜܰ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-20495)) ^ (-838277071);
                        i6 = -2102198813;
                    }
                    break;
                case 2040689376:
                case 2120897608:
                    if (!C1783.m6232()) {
                        iM3169 = C0773.m3169("᩻ᩳ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-285)) ^ 1252654316;
                        i6 = 1178829960;
                    } else {
                        iM3169 = (i4 - C0619.m2761("ۙ᩺")) * 13;
                        i5 = ((iM3169 ^ i3) * (-6699)) ^ 556950640;
                        i6 = -1424915016;
                    }
                    break;
                default:
                    if (i >= 0) {
                        iM3169 = C0773.m3169("ۙۙ") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-20699)) ^ 91094313;
                        i6 = 668974912;
                    } else {
                        iM3169 = (C0773.m3169("ۙۢ") ^ i4) * (-19);
                        i5 = ((iM3169 ^ i3) * (-23505)) ^ (-842898999);
                        i6 = -2697257;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m26208() {
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i = 49143758;
        int i2 = C0950.f3488;
        int i3 = C20932.f66974;
        int iM3169 = (i3 - C0773.m3169("ܽ᩺")) * 81;
        int i4 = ((iM3169 ^ i2) * (-5469)) ^ 1537966611;
        int i5 = -785832842;
        while (true) {
            i = ((((i ^ i2) * 18313) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2088664156:
                case 581781206:
                    if (AbstractC0116.f1064 <= 0) {
                        iM3169 = C0619.m2761("ۘ᩺") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-20675)) ^ (-1951376851);
                        i5 = 1931234354;
                    } else {
                        iM3169 = C0619.m2761("ۘᩴ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-5573)) ^ (-253756526);
                        i5 = -360021581;
                    }
                    break;
                case -1948874994:
                case 881971981:
                    z = this.f32452;
                    z2 = true;
                    if (C3033.f9831 >= 0) {
                        iM3169 = (i2 - C0619.m2761("᩶᩵")) * (-121);
                        i4 = ((iM3169 ^ i3) * 14699) ^ (-1488545192);
                        i5 = 242728671;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ۖܶ")) * 53;
                        i4 = ((iM3169 ^ i2) * (-18793)) ^ (-573029166);
                        i5 = 951435848;
                    }
                    break;
                case -1646213973:
                case -551842824:
                    break;
                case -1579102127:
                case 1063117492:
                    if (C3734.f12817 >= 0) {
                        iM3169 = C0773.m3169("᩵֡") ^ i3;
                        i4 = ((iM3169 ^ i2) * 3753) ^ (-783704611);
                        i5 = 644642924;
                    } else {
                        iM3169 = C0773.m3169("ۡۛ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 14915) ^ (-515359470);
                        i5 = -658829458;
                    }
                    break;
                case -1424205021:
                case 123249131:
                    if (C2419.f7754 >= 0) {
                        iM3169 = C0619.m2761("ۘ᩺") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-20675)) ^ (-1951376851);
                        i5 = 1931234354;
                    } else {
                        iM3169 = (C0773.m3169("ܺ֫") + i3) * 73;
                        i4 = ((iM3169 ^ i2) * 191) ^ 187713780;
                        i5 = 242665986;
                    }
                    break;
                case -1342327744:
                case -460462175:
                    if (RunnableC0334.f1808 <= 0) {
                        iM3169 = (i2 - C0619.m2761("ۧܰ")) * 51;
                        i4 = ((iM3169 ^ i3) * 10045) ^ (-381027183);
                        i5 = 982989167;
                    } else {
                        iM3169 = (C0619.m2761("ۘ᩵") + i2) * 5;
                        i4 = ((iM3169 ^ i3) * (-29071)) ^ 249247264;
                        i5 = 1489161422;
                    }
                    break;
                case -1303702962:
                case -1079644959:
                    if (C2288.f7433 <= 0) {
                        iM3169 = (i2 - C0619.m2761("ۧܰ")) * 51;
                        i4 = ((iM3169 ^ i3) * 10045) ^ (-381027183);
                        i5 = 982989167;
                    } else {
                        iM3169 = C0619.m2761("ܺ᩵") ^ i3;
                        i4 = ((iM3169 ^ i2) * 28439) ^ 519827003;
                        i5 = -1959992657;
                    }
                    break;
                case -902859669:
                case -244852952:
                    this.f32455.f61807 = z3;
                    this.f32452 = z3;
                    if (z) {
                        iM3169 = C0773.m3169("ۚܺ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 29207) ^ (-546616813);
                        i5 = -1642658163;
                    } else {
                        iM3169 = (C0619.m2761("ܰ۬") ^ i3) * 77;
                        i4 = ((iM3169 ^ i2) * (-6097)) ^ (-809848267);
                        i5 = -430886228;
                    }
                    break;
                case -885806871:
                case 1756487340:
                    m26186();
                    m26158();
                    break;
                case -839527187:
                case 2042321947:
                    if (C20932.m47848() != 0) {
                        iM3169 = C0619.m2761("ۘ᩺") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-20675)) ^ (-1951376851);
                        i5 = 1931234354;
                    } else {
                        iM3169 = (i2 - C0773.m3169("ۨۢ")) * (-3);
                        i4 = ((iM3169 ^ i3) * (-28075)) ^ (-1729685516);
                        i5 = -2009807324;
                    }
                    break;
                case -589312053:
                case 655745782:
                    C2966.m9664();
                    iM3169 = C0773.m3169("᩵֡") ^ i3;
                    i4 = ((iM3169 ^ i2) * 3753) ^ (-783704611);
                    i5 = 644642924;
                    break;
                case -461551845:
                case 960014473:
                    this.f32471.run();
                    if (C1783.f6087 <= 0) {
                        iM3169 = (i2 - C0619.m2761("ۧܰ")) * 51;
                        i4 = ((iM3169 ^ i3) * 10045) ^ (-381027183);
                        i5 = 982989167;
                    } else {
                        iM3169 = C0773.m3169("ܽ᩸") ^ i2;
                        i4 = ((iM3169 ^ i3) * 5599) ^ (-825757941);
                        i5 = 1545126942;
                    }
                    break;
                case -227075087:
                case 873260090:
                    z3 = z ^ z2;
                    if (C2966.f9654 >= 0) {
                        iM3169 = (i2 - C0619.m2761("᩶᩵")) * (-121);
                        i4 = ((iM3169 ^ i3) * 14699) ^ (-1488545192);
                        i5 = 242728671;
                    } else {
                        iM3169 = (C0773.m3169("ۖۚ") ^ i2) * (-91);
                        i4 = ((iM3169 ^ i3) * (-10895)) ^ (-385088258);
                        i5 = -1292075360;
                    }
                    break;
                case -10619683:
                case 154946305:
                    m26195(true);
                    break;
                case 75879253:
                case 212044069:
                    RunnableC0334.m2063();
                    C3492.m11488();
                    break;
                case 601966503:
                case 1506830869:
                    C17202.m40372();
                    if (AbstractC0641.f2496 >= 0) {
                        iM3169 = C0619.m2761("ۘᩴ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-5573)) ^ (-253756526);
                        i5 = -360021581;
                    } else {
                        iM3169 = C0773.m3169("᩵֡") ^ i3;
                        i4 = ((iM3169 ^ i2) * 3753) ^ (-783704611);
                        i5 = 644642924;
                    }
                    break;
                case 698221249:
                case 1532311134:
                    if (m26206()) {
                        iM3169 = (i2 - C0773.m3169("ܿۧ")) * (-107);
                        i4 = ((iM3169 ^ i3) * (-13935)) ^ (-243020158);
                        i5 = 1526695546;
                    } else {
                        iM3169 = C0619.m2761("᩹᩺") ^ i3;
                        i4 = ((iM3169 ^ i2) * 661) ^ 253365115;
                        i5 = -170652580;
                    }
                    break;
                case 935269286:
                case 986736484:
                    if (C13473.f42873 != 0) {
                        iM3169 = (i2 - C0619.m2761("᩶᩵")) * (-121);
                        i4 = ((iM3169 ^ i3) * 14699) ^ (-1488545192);
                        i5 = 242728671;
                    } else {
                        iM3169 = C0773.m3169("ۖ᩻") ^ i3;
                        i4 = ((iM3169 ^ i2) * 11185) ^ (-680802146);
                        i5 = -2026560142;
                    }
                    break;
                case 1446972582:
                case 2107767043:
                    C2310.m7813();
                    if (C2702.f8586 <= 0) {
                        iM3169 = (i2 - C0619.m2761("ۧܰ")) * 51;
                        i4 = ((iM3169 ^ i3) * 10045) ^ (-381027183);
                        i5 = 982989167;
                    } else {
                        iM3169 = C0773.m3169("᩵֡") ^ i3;
                        i4 = ((iM3169 ^ i2) * 3753) ^ (-783704611);
                        i5 = 644642924;
                    }
                    break;
                default:
                    if (C1080.m4050()) {
                        iM3169 = C0619.m2761("ۨ۬") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-6165)) ^ 65499705;
                        i5 = 1524539333;
                    } else {
                        iM3169 = C0619.m2761("ۘ᩺") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-20675)) ^ (-1951376851);
                        i5 = 1931234354;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00bf A[PHI: r10
      0x00bf: PHI (r10v4 short[]) = (r10v3 short[]), (r10v2 short[]), (r10v2 short[]) binds: [B:25:0x00bd, B:14:0x0072, B:12:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x0119 A[PHI: r7 r8
      0x0119: PHI (r7v3 int) = (r7v2 int), (r7v1 int) binds: [B:33:0x0117, B:29:0x00f8] A[DONT_GENERATE, DONT_INLINE]
      0x0119: PHI (r8v2 android.webkit.WebView) = (r8v1 android.webkit.WebView), (r8v3 android.webkit.WebView) binds: [B:33:0x0117, B:29:0x00f8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x014f A[PHI: r6 r11 r12
      0x014f: PHI (r6v5 int) = (r6v2 int), (r6v1 int), (r6v1 int), (r6v1 int), (r6v1 int) binds: [B:37:0x014d, B:21:0x0098, B:12:0x006f, B:92:0x014f, B:91:0x014f] A[DONT_GENERATE, DONT_INLINE]
      0x014f: PHI (r11v6 int) = (r11v2 int), (r11v3 int), (r11v2 int), (r11v2 int), (r11v2 int) binds: [B:37:0x014d, B:21:0x0098, B:12:0x006f, B:92:0x014f, B:91:0x014f] A[DONT_GENERATE, DONT_INLINE]
      0x014f: PHI (r12v6 int) = (r12v2 int), (r12v3 int), (r12v2 int), (r12v2 int), (r12v2 int) binds: [B:37:0x014d, B:21:0x0098, B:12:0x006f, B:92:0x014f, B:91:0x014f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x02b0 A[PHI: r5 r14 r15 r18 r19 r25
      0x02b0: PHI (r5v5 int) = (r5v1 int), (r5v1 int), (r5v2 int), (r5v1 int) binds: [B:71:0x02ae, B:67:0x028f, B:105:0x02b0, B:103:0x02b0] A[DONT_GENERATE, DONT_INLINE]
      0x02b0: PHI (r14v5 int) = (r14v1 int), (r14v2 int), (r14v1 int), (r14v1 int) binds: [B:71:0x02ae, B:67:0x028f, B:105:0x02b0, B:103:0x02b0] A[DONT_GENERATE, DONT_INLINE]
      0x02b0: PHI (r15v5 int) = (r15v1 int), (r15v2 int), (r15v1 int), (r15v1 int) binds: [B:71:0x02ae, B:67:0x028f, B:105:0x02b0, B:103:0x02b0] A[DONT_GENERATE, DONT_INLINE]
      0x02b0: PHI (r18v6 short) = (r18v3 short), (r18v2 short), (r18v2 short), (r18v2 short) binds: [B:71:0x02ae, B:67:0x028f, B:105:0x02b0, B:103:0x02b0] A[DONT_GENERATE, DONT_INLINE]
      0x02b0: PHI (r19v6 short) = (r19v3 short), (r19v2 short), (r19v2 short), (r19v2 short) binds: [B:71:0x02ae, B:67:0x028f, B:105:0x02b0, B:103:0x02b0] A[DONT_GENERATE, DONT_INLINE]
      0x02b0: PHI (r25v7 int) = (r25v3 int), (r25v4 int), (r25v3 int), (r25v3 int) binds: [B:71:0x02ae, B:67:0x028f, B:105:0x02b0, B:103:0x02b0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    private void m26158() {
        int iM3169;
        int i;
        int iM31610;
        int i2;
        int i3;
        final C10139 c10139 = this;
        boolean z = false;
        int i4 = 0;
        ValueAnimator valueAnimator = null;
        int i5 = 0;
        final int i6 = 0;
        final int i7 = 0;
        WebView webView = null;
        int i8 = 0;
        int i9 = 0;
        int i10 = 1999660101;
        int i11 = C2287.f7432;
        int i12 = C1542.f5343;
        int iM31611 = (i11 - C0773.m3169("ۚܳ")) * (-117);
        int i13 = ((iM31611 ^ i12) * (-16869)) ^ 325566843;
        int i14 = iM31611 ^ (-837375953);
        short[] sArr = null;
        short[] sArr2 = null;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        C0445 c0445 = null;
        int i18 = 0;
        while (true) {
            i10 = i14 ^ (i13 & (((i10 ^ i12) * 7993) >> 31));
            switch (i10) {
                case -1849437499:
                case 297888749:
                    c10139.f32445 = i6;
                    i7 = c10139.f32468;
                    if (C0773.f2792 <= 0) {
                        iM31610 = (C0773.m3169("ܳܿ") ^ i12) * (-33);
                        i2 = ((iM31610 ^ i11) * (-155)) ^ 219316482;
                        i3 = -1274140508;
                    } else {
                        iM31610 = C0773.m3169("᩵ۘ") ^ i12;
                        i2 = ((iM31610 ^ i11) * (-13387)) ^ (-665537441);
                        i3 = 1671806807;
                    }
                    i14 = iM31610 ^ i3;
                    i13 = i2;
                    break;
                case -1739354948:
                case 2124733907:
                    i15 = 19049;
                    iM3169 = (i12 - C0619.m2761("֨ۗ")) * (-105);
                    i13 = ((iM3169 ^ i11) * 6111) ^ (-119791343);
                    i = -515110273;
                    i14 = iM3169 ^ i;
                    c10139 = this;
                    break;
                case -1689227511:
                case 428018609:
                    c0445.m2266();
                    iM3169 = (C0619.m2761("ܺᩴ") ^ i11) * (-67);
                    i13 = ((iM3169 ^ i12) * (-28799)) ^ 1175731223;
                    i = 780973569;
                    i14 = iM3169 ^ i;
                    c10139 = this;
                    break;
                case -1664136917:
                case 1047804260:
                    C3998.m12920();
                    if (!RunnableC0334.m2063()) {
                        iM31610 = C0773.m3169("᩺ᩴ") ^ i12;
                        i2 = ((iM31610 ^ i11) * 18857) ^ 600565754;
                        i3 = 1619796957;
                        i14 = iM31610 ^ i3;
                        i13 = i2;
                    } else {
                        iM3169 = C0619.m2761("ܽ᩹") ^ i11;
                        i13 = ((iM3169 ^ i12) * (-27955)) ^ 1857715470;
                        i = 545000268;
                        i14 = iM3169 ^ i;
                        c10139 = this;
                    }
                    break;
                case -1557382049:
                case 2013457248:
                    i16 = 1;
                    i17 = 19;
                    if (C2485.f7950 != 0) {
                        iM31610 = C0773.m3169("᩺ᩴ") ^ i12;
                        i2 = ((iM31610 ^ i11) * 18857) ^ 600565754;
                        i3 = 1619796957;
                    } else {
                        iM31610 = (C0619.m2761("ܺ᩺") ^ i11) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i2 = ((iM31610 ^ i12) * 15817) ^ (-206834955);
                        i3 = -178631716;
                    }
                    i14 = iM31610 ^ i3;
                    i13 = i2;
                    break;
                case -1423045706:
                case -158430705:
                    c10139.f32437 = i4;
                    valueAnimator = c10139.f32481;
                    if (valueAnimator != null) {
                        iM31610 = (i12 - C0773.m3169("ۢۤ")) * (-113);
                        i2 = ((iM31610 ^ i11) * (-10037)) ^ (-282785623);
                        i3 = 742617019;
                    } else {
                        iM31610 = C0619.m2761("ۙ᩵") ^ i11;
                        i2 = ((iM31610 ^ i12) * (-24851)) ^ (-2029683473);
                        i3 = -967434553;
                    }
                    i14 = iM31610 ^ i3;
                    i13 = i2;
                    break;
                case -1334310387:
                case 252234449:
                    valueAnimator.cancel();
                    iM31610 = C0619.m2761("ۙ᩵") ^ i11;
                    i2 = ((iM31610 ^ i12) * (-24851)) ^ (-2029683473);
                    i3 = -967434553;
                    i14 = iM31610 ^ i3;
                    i13 = i2;
                    break;
                case -1225157997:
                case 329485163:
                    c10139.f32439 = false;
                    sArr2 = f32436;
                    if (C2354.m7983()) {
                        iM31610 = (i12 - C0619.m2761("۫ۛ")) * (-113);
                        i2 = ((iM31610 ^ i11) * 8995) ^ 1008556632;
                        i3 = 1058529467;
                    } else {
                        iM31610 = C0619.m2761("ۢۡ") ^ i11;
                        i2 = ((iM31610 ^ i12) * 5851) ^ (-2078626719);
                        i3 = -1548810565;
                    }
                    i14 = iM31610 ^ i3;
                    i13 = i2;
                    break;
                case -1148220673:
                case -346901744:
                    sArr = f32436;
                    c = 0;
                    if (C2419.f7754 >= 0) {
                        iM3169 = C0619.m2761("ܽ᩹") ^ i11;
                        i13 = ((iM3169 ^ i12) * (-27955)) ^ 1857715470;
                        i = 545000268;
                    } else {
                        iM3169 = (C0773.m3169("ۡ֫") ^ i12) * (-111);
                        i13 = ((iM3169 ^ i11) * (-11725)) ^ (-1423832169);
                        i = 160134963;
                    }
                    i14 = iM3169 ^ i;
                    c10139 = this;
                    break;
                case -1119912481:
                case 661525269:
                    s = sArr[c];
                    s2 = 14496;
                    if (C0862.f3233 != 0) {
                        iM3169 = (C0619.m2761("ܰۜ") + i11) * (-123);
                        i13 = ((iM3169 ^ i12) * 10459) ^ 1828288797;
                        i = 1644815312;
                    } else {
                        iM3169 = C0773.m3169("᩹ܺ") ^ i11;
                        i13 = ((iM3169 ^ i12) * (-10785)) ^ 1806513947;
                        i = 1306416079;
                    }
                    i14 = iM3169 ^ i;
                    c10139 = this;
                    break;
                case -919937829:
                case 108981572:
                    C0445 c0446 = c10139.f32470;
                    if (c0446 != null) {
                        int iM31612 = (C0773.m3169("᩻᩻") ^ i12) * 27;
                        i14 = iM31612 ^ 641036813;
                        c0445 = c0446;
                        i13 = ((iM31612 ^ i11) * (-11789)) ^ (-814717201);
                    } else {
                        c0445 = c0446;
                        iM3169 = (C0619.m2761("ܺᩴ") ^ i11) * (-67);
                        i13 = ((iM3169 ^ i12) * (-28799)) ^ 1175731223;
                        i = 780973569;
                        i14 = iM3169 ^ i;
                    }
                    c10139 = this;
                    break;
                case -842336729:
                case 1665955968:
                    i18 = s * s2;
                    i8 = s * s;
                    i9 = 52533504;
                    if (C3077.f9998) {
                        iM3169 = (i11 - C0773.m3169("ۗ᩺")) * (-127);
                        i13 = ((iM3169 ^ i12) * (-14369)) ^ 453892819;
                        i = -1528130423;
                    } else {
                        iM3169 = (C0619.m2761("ܰۜ") + i11) * (-123);
                        i13 = ((iM3169 ^ i12) * 10459) ^ 1828288797;
                        i = 1644815312;
                    }
                    i14 = iM3169 ^ i;
                    c10139 = this;
                    break;
                case -799770609:
                case -13652790:
                    if ((i8 + i9) - i18 < 0) {
                        iM3169 = (C0773.m3169("ۙۙ") ^ i11) * (-101);
                        i13 = ((iM3169 ^ i12) * 20655) ^ (-514440486);
                        i = 2117816081;
                    } else {
                        iM3169 = C0619.m2761("ۧ۫") ^ i12;
                        i13 = ((iM3169 ^ i11) * (-3807)) ^ (-529868146);
                        i = -785215372;
                    }
                    i14 = iM3169 ^ i;
                    c10139 = this;
                    break;
                case -795060743:
                case 717702264:
                    c10139.f32451 = z;
                    RunnableC11631 runnableC11631 = c10139.f32447;
                    webView = c10139.f32482;
                    webView.removeCallbacks(runnableC11631);
                    if (C2966.f9654 >= 0) {
                        iM31610 = (C0773.m3169("ܳܿ") ^ i12) * (-33);
                        i2 = ((iM31610 ^ i11) * (-155)) ^ 219316482;
                        i3 = -1274140508;
                    } else {
                        iM31610 = C0773.m3169("֫᩵") ^ i11;
                        i2 = ((iM31610 ^ i12) * (-9565)) ^ 165417589;
                        i3 = -1816862904;
                    }
                    i14 = iM31610 ^ i3;
                    i13 = i2;
                    break;
                case -771557064:
                case 1178693234:
                    c10139.f32481 = null;
                    i5 = c10139.f32445;
                    if (C3998.f13671 == 0) {
                        iM31610 = C0619.m2761("ۚ᩻") ^ i11;
                        i2 = ((iM31610 ^ i12) * (-24117)) ^ 1809533070;
                        i3 = -1425010153;
                        i14 = iM31610 ^ i3;
                        i13 = i2;
                    } else {
                        iM3169 = (C0619.m2761("ܰۜ") + i11) * (-123);
                        i13 = ((iM3169 ^ i12) * 10459) ^ 1828288797;
                        i = 1644815312;
                        i14 = iM3169 ^ i;
                        c10139 = this;
                    }
                    break;
                case -564725011:
                case 2131307429:
                    webView.evaluateJavascript(c10139.m26161(C0773.m3166(sArr2, i16, i17, i15)), new ValueCallback(c10139) { // from class: l.ܶ۬֫

                        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ C10139 f52171;

                        @Override // android.webkit.ValueCallback
                        public final void onReceiveValue(Object obj) {
                            int i19 = 0;
                            String str = null;
                            int i20 = -1114874510;
                            int i21 = C1146.f4234;
                            int i22 = AbstractC0641.f2496;
                            int iM2761 = C0619.m2761("۟ᩳ") ^ i21;
                            int i23 = ((iM2761 ^ i22) * (-13181)) ^ (-1945077556);
                            int i24 = -339004247;
                            while (true) {
                                i20 = ((((i20 ^ i22) * (-16047)) >> 31) & i23) ^ (iM2761 ^ i24);
                                switch (i20) {
                                    case -2101328442:
                                    case 1431633444:
                                        if (C2375.f7641 <= 0) {
                                            iM2761 = C0773.m3169("ۖ۠") ^ i21;
                                            i23 = ((iM2761 ^ i22) * (-10077)) ^ 1093981613;
                                            i24 = 1613015827;
                                        } else {
                                            iM2761 = (C0619.m2761("ۛܶ") + i21) * (-21);
                                            i23 = ((iM2761 ^ i22) * 7449) ^ 931622835;
                                            i24 = -344258662;
                                        }
                                        break;
                                    case -1906953734:
                                    case -558376363:
                                        if (C4238.f15451 >= 0) {
                                            iM2761 = C0773.m3169("֨۠") ^ i22;
                                            i23 = ((iM2761 ^ i21) * (-17709)) ^ (-727723960);
                                            i24 = 1128266868;
                                        } else {
                                            iM2761 = C0619.m2761("ۖۗ") ^ i21;
                                            i23 = ((iM2761 ^ i22) * 1659) ^ 1832430062;
                                            i24 = -99541165;
                                        }
                                        break;
                                    case -1457243079:
                                    case -805674793:
                                        RunnableC3055.m9933();
                                        if (C0862.f3233 != 0) {
                                            iM2761 = C0773.m3169("֨۠") ^ i22;
                                            i23 = ((iM2761 ^ i21) * (-17709)) ^ (-727723960);
                                            i24 = 1128266868;
                                        } else {
                                            iM2761 = C0773.m3169("ۖ۠") ^ i21;
                                            i23 = ((iM2761 ^ i22) * (-10077)) ^ 1093981613;
                                            i24 = 1613015827;
                                        }
                                        break;
                                    case -907354178:
                                    case 749990958:
                                        RunnableC3055.m9933();
                                        iM2761 = C0773.m3169("ۖ۠") ^ i21;
                                        i23 = ((iM2761 ^ i22) * (-10077)) ^ 1093981613;
                                        i24 = 1613015827;
                                        break;
                                    case -799199269:
                                    case -374071912:
                                        C2354.m7983();
                                        break;
                                    case -693385325:
                                    case 1854031077:
                                        if (C1542.m5459() >= 0) {
                                            iM2761 = C0773.m3169("ۖ۠") ^ i21;
                                            i23 = ((iM2761 ^ i22) * (-10077)) ^ 1093981613;
                                            i24 = 1613015827;
                                        } else {
                                            iM2761 = (C0773.m3169("ۛܿ") ^ i22) * 91;
                                            i23 = ((iM2761 ^ i21) * 1959) ^ (-2046126359);
                                            i24 = 423556703;
                                        }
                                        break;
                                    case -653712737:
                                    case 1538426335:
                                        if (RunnableC0334.f1808 <= 0) {
                                            iM2761 = C0773.m3169("֨۠") ^ i22;
                                            i23 = ((iM2761 ^ i21) * (-17709)) ^ (-727723960);
                                            i24 = 1128266868;
                                        } else {
                                            iM2761 = C0619.m2761("ۜۨ") ^ i21;
                                            i23 = ((iM2761 ^ i22) * 5301) ^ (-88430918);
                                            i24 = 2021998885;
                                        }
                                        break;
                                    case -652871212:
                                    case 1089223533:
                                        if (C3998.f13671 != 0) {
                                            iM2761 = C0773.m3169("ۖ۠") ^ i21;
                                            i23 = ((iM2761 ^ i22) * (-10077)) ^ 1093981613;
                                            i24 = 1613015827;
                                        } else {
                                            iM2761 = (i21 - C0619.m2761("֫֫")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                                            i23 = ((iM2761 ^ i22) * (-25919)) ^ 1347354495;
                                            i24 = -176983217;
                                        }
                                        break;
                                    case -124913315:
                                    case 1459180028:
                                        if (C2485.f7950 != 0) {
                                            iM2761 = C0773.m3169("֨۠") ^ i22;
                                            i23 = ((iM2761 ^ i21) * (-17709)) ^ (-727723960);
                                            i24 = 1128266868;
                                        } else {
                                            iM2761 = C0773.m3169("ܺۙ") ^ i21;
                                            i23 = ((iM2761 ^ i22) * 17149) ^ 2079673352;
                                            i24 = -1056797151;
                                        }
                                        break;
                                    case -38411009:
                                    case 1824001761:
                                        if (C0269.f1558 <= 0) {
                                            iM2761 = C0619.m2761("۠ᩳ") ^ i22;
                                            i23 = ((iM2761 ^ i21) * (-11873)) ^ (-1327353709);
                                            i24 = 603014744;
                                        } else {
                                            iM2761 = (C0773.m3169("ۙܺ") ^ i22) * 73;
                                            i23 = ((iM2761 ^ i21) * (-31327)) ^ 1964855435;
                                            i24 = 336796429;
                                        }
                                        break;
                                    case 56004290:
                                    case 1898081649:
                                        if (C4238.m13540() <= 0) {
                                            iM2761 = C0773.m3169("֨۠") ^ i22;
                                            i23 = ((iM2761 ^ i21) * (-17709)) ^ (-727723960);
                                            i24 = 1128266868;
                                        } else {
                                            iM2761 = C0619.m2761("᩸֨") ^ i22;
                                            i23 = ((iM2761 ^ i21) * (-26727)) ^ (-1205972881);
                                            i24 = 1415673239;
                                        }
                                        break;
                                    case 507730677:
                                    case 1248369552:
                                        i19 = i6;
                                        if (C3690.m11987()) {
                                            iM2761 = (i22 - C0619.m2761("۠۠")) * (-3);
                                            i23 = ((iM2761 ^ i21) * (-21581)) ^ (-365682855);
                                            i24 = -1492374665;
                                        } else {
                                            iM2761 = (i22 - C0619.m2761("ܳ᩺")) * 83;
                                            i23 = ((iM2761 ^ i21) * 5929) ^ 847017974;
                                            i24 = 1098411852;
                                        }
                                        break;
                                    case 821162144:
                                    case 1133953821:
                                        str = (String) obj;
                                        if (C23916.f77426 <= 0) {
                                            iM2761 = (i22 - C0619.m2761("۠۠")) * (-3);
                                            i23 = ((iM2761 ^ i21) * (-21581)) ^ (-365682855);
                                            i24 = -1492374665;
                                        } else {
                                            iM2761 = C0619.m2761("ܺۧ") ^ i21;
                                            i23 = ((iM2761 ^ i22) * 7155) ^ (-316657804);
                                            i24 = -850885441;
                                        }
                                        break;
                                    case 1243738787:
                                    case 2100378704:
                                        C10139.m26169(this.f52171, i7, i19, str);
                                        break;
                                    case 1430306695:
                                    case 1903900412:
                                        C3448.m11248();
                                        if (C2878.m9491() > 0) {
                                            iM2761 = C0619.m2761("۠ᩳ") ^ i22;
                                            i23 = ((iM2761 ^ i21) * (-11873)) ^ (-1327353709);
                                            i24 = 603014744;
                                        } else {
                                            iM2761 = C0773.m3169("֨۠") ^ i22;
                                            i23 = ((iM2761 ^ i21) * (-17709)) ^ (-727723960);
                                            i24 = 1128266868;
                                        }
                                        break;
                                    default:
                                        if (C4238.f15451 >= 0) {
                                            iM2761 = C0773.m3169("֨۠") ^ i22;
                                            i23 = ((iM2761 ^ i21) * (-17709)) ^ (-727723960);
                                            i24 = 1128266868;
                                        } else {
                                            iM2761 = C0773.m3169("ܺܽ") ^ i22;
                                            i23 = ((iM2761 ^ i21) * (-22687)) ^ (-826319155);
                                            i24 = -429032368;
                                        }
                                        break;
                                }
                                return;
                            }
                        }

                        {
                            int i19 = -583801202;
                            int i20 = C1826.f6190;
                            int i21 = RunnableC3055.f9898;
                            int iM31613 = (i21 - C0773.m3169("ۤۜ")) * (-111);
                            int i22 = ((iM31613 ^ i20) * (-28275)) ^ (-1986345564);
                            int i23 = -894747720;
                            while (true) {
                                i19 = ((((i19 ^ i20) * 27157) >> 31) & i22) ^ (iM31613 ^ i23);
                                switch (i19) {
                                    case -2101315695:
                                    case 1067577980:
                                        if (C2310.f7472 >= 0) {
                                            iM31613 = (C0773.m3169("ۗۙ") + i21) * 77;
                                            i22 = ((iM31613 ^ i20) * 2749) ^ (-1963341517);
                                            i23 = 679413263;
                                        } else {
                                            iM31613 = (i20 - C0619.m2761("ܽ۫")) * 67;
                                            i22 = ((iM31613 ^ i21) * (-31977)) ^ (-657362583);
                                            i23 = -2112502769;
                                        }
                                        break;
                                    case -2054486863:
                                    case 746028453:
                                        if (C4238.f15451 >= 0) {
                                            iM31613 = C0773.m3169("ܺۗ") ^ i20;
                                            i22 = ((iM31613 ^ i21) * 5677) ^ (-124847974);
                                            i23 = -814458681;
                                        } else {
                                            iM31613 = C0773.m3169("ܽܿ") ^ i20;
                                            i22 = ((iM31613 ^ i21) * 12943) ^ (-743378644);
                                            i23 = -584594939;
                                        }
                                        break;
                                    case -1965765761:
                                    case -1216643468:
                                        this.f52171 = c10139;
                                        if (C2878.m9491() <= 0) {
                                            iM31613 = C0773.m3169("ܺۗ") ^ i20;
                                            i22 = ((iM31613 ^ i21) * 5677) ^ (-124847974);
                                            i23 = -814458681;
                                        } else {
                                            iM31613 = (C0773.m3169("᩻֡") + i21) * 93;
                                            i22 = ((iM31613 ^ i20) * 17483) ^ 1942311344;
                                            i23 = -1191899852;
                                        }
                                        break;
                                    case -1416524291:
                                    case -640148991:
                                        RunnableC1848.m6360();
                                        C2878.m9491();
                                        throw new RuntimeException();
                                    case -1253629802:
                                    case -971881711:
                                        if (C0862.f3233 != 0) {
                                            iM31613 = (C0619.m2761("ܳ֨") ^ i21) * (-105);
                                            i22 = ((iM31613 ^ i20) * (-6045)) ^ 21584737;
                                            i23 = -1182087765;
                                        } else {
                                            iM31613 = (C0619.m2761("ۙᩳ") + i20) * 91;
                                            i22 = ((iM31613 ^ i21) * (-25327)) ^ (-1964121534);
                                            i23 = 1594767530;
                                        }
                                        break;
                                    case -1198792339:
                                    case 1140250220:
                                        if (!C0619.f2439) {
                                            iM31613 = (C0773.m3169("ۗۙ") + i21) * 77;
                                            i22 = ((iM31613 ^ i20) * 2749) ^ (-1963341517);
                                            i23 = 679413263;
                                        } else {
                                            iM31613 = C0619.m2761("ۡۜ") ^ i21;
                                            i22 = ((iM31613 ^ i20) * 32235) ^ (-1657315045);
                                            i23 = -683313596;
                                        }
                                        break;
                                    case -1178460608:
                                    case -330021469:
                                        if (C2485.f7950 != 0) {
                                            iM31613 = C0619.m2761("ۡۜ") ^ i21;
                                            i22 = ((iM31613 ^ i20) * 32235) ^ (-1657315045);
                                            i23 = -683313596;
                                        } else {
                                            iM31613 = C0773.m3169("ۖ᩵") ^ i20;
                                            i22 = ((iM31613 ^ i21) * 15303) ^ (-969175800);
                                            i23 = 2047477508;
                                        }
                                        break;
                                    case -1004448542:
                                    case 1850427146:
                                        if (C1343.m4943()) {
                                            iM31613 = (C0619.m2761("ᩴ᩵") + i21) * (-121);
                                            i22 = ((iM31613 ^ i20) * (-11365)) ^ (-256513992);
                                            i23 = 2060032518;
                                        } else {
                                            iM31613 = C0619.m2761("ۡۜ") ^ i21;
                                            i22 = ((iM31613 ^ i20) * 32235) ^ (-1657315045);
                                            i23 = -683313596;
                                        }
                                        break;
                                    case -452886604:
                                    case -438974460:
                                        if (C2834.f9334 <= 0) {
                                            iM31613 = C0773.m3169("ۧۜ") ^ i20;
                                            i22 = ((iM31613 ^ i21) * 26927) ^ 655419844;
                                            i23 = 1426885780;
                                        } else {
                                            iM31613 = C0619.m2761("ܿ᩷") ^ i21;
                                            i22 = ((iM31613 ^ i20) * 239) ^ (-791130051);
                                            i23 = -2074653802;
                                        }
                                        break;
                                    case 338664815:
                                    case 970562118:
                                        return;
                                    case 517435838:
                                    case 2023025324:
                                        if (C2023.f6737) {
                                            iM31613 = C0773.m3169("ܺۗ") ^ i20;
                                            i22 = ((iM31613 ^ i21) * 5677) ^ (-124847974);
                                            i23 = -814458681;
                                        } else {
                                            iM31613 = C0619.m2761("ۧۧ") ^ i21;
                                            i22 = ((iM31613 ^ i20) * (-30173)) ^ (-1891573904);
                                            i23 = -105962782;
                                        }
                                        break;
                                    case 519035580:
                                    case 1220542224:
                                        if (C1321.f4751 >= 0) {
                                            iM31613 = (C0773.m3169("ۗۙ") + i21) * 77;
                                            i22 = ((iM31613 ^ i20) * 2749) ^ (-1963341517);
                                            i23 = 679413263;
                                        } else {
                                            iM31613 = C0619.m2761("ܶ᩹") ^ i21;
                                            i22 = ((iM31613 ^ i20) * 265) ^ 1715604082;
                                            i23 = -187990983;
                                        }
                                        break;
                                    case 837378982:
                                    case 2082972936:
                                        C0950.m3785();
                                        if (C2878.m9491() <= 0) {
                                            iM31613 = C0619.m2761("ۡۜ") ^ i21;
                                            i22 = ((iM31613 ^ i20) * 32235) ^ (-1657315045);
                                            i23 = -683313596;
                                        } else {
                                            iM31613 = C0773.m3169("ܺۗ") ^ i20;
                                            i22 = ((iM31613 ^ i21) * 5677) ^ (-124847974);
                                            i23 = -814458681;
                                        }
                                        break;
                                    case 1029266907:
                                    case 2146579176:
                                        C20932.m47848();
                                        C1826.m6301();
                                        iM31613 = C0773.m3169("ܺۗ") ^ i20;
                                        i22 = ((iM31613 ^ i21) * 5677) ^ (-124847974);
                                        i23 = -814458681;
                                        break;
                                    case 1116163745:
                                    case 1525307767:
                                        if (AbstractC0116.f1064 > 0) {
                                            iM31613 = C0773.m3169("ۧۜ") ^ i20;
                                            i22 = ((iM31613 ^ i21) * 26927) ^ 655419844;
                                            i23 = 1426885780;
                                        } else {
                                            iM31613 = C0619.m2761("ۡۜ") ^ i21;
                                            i22 = ((iM31613 ^ i20) * 32235) ^ (-1657315045);
                                            i23 = -683313596;
                                        }
                                        break;
                                    default:
                                        if (C2287.m7745() <= 0) {
                                            iM31613 = (C0619.m2761("ܳ֨") ^ i21) * (-105);
                                            i22 = ((iM31613 ^ i20) * (-6045)) ^ 21584737;
                                            i23 = -1182087765;
                                        } else {
                                            iM31613 = (C0773.m3169("֨ۢ") ^ i20) * 11;
                                            i22 = ((iM31613 ^ i21) * (-32025)) ^ 1192427092;
                                            i23 = 1812290105;
                                        }
                                        break;
                                }
                            }
                        }
                    });
                    break;
                case -178698979:
                case 721904383:
                    i6 = i5 + (z ? 1 : 0);
                    if (AbstractC3624.m11755() != 0) {
                        iM31610 = C0773.m3169("᩺ᩴ") ^ i12;
                        i2 = ((iM31610 ^ i11) * 18857) ^ 600565754;
                        i3 = 1619796957;
                    } else {
                        iM31610 = C0619.m2761("۫᩵") ^ i12;
                        i2 = ((iM31610 ^ i11) * (-6463)) ^ 1421507879;
                        i3 = 1486904107;
                    }
                    i14 = iM31610 ^ i3;
                    i13 = i2;
                    break;
                case 149617090:
                case 1198371657:
                    i15 = 46282;
                    iM3169 = (i12 - C0619.m2761("֨ۗ")) * (-105);
                    i13 = ((iM3169 ^ i11) * 6111) ^ (-119791343);
                    i = -515110273;
                    i14 = iM3169 ^ i;
                    c10139 = this;
                    break;
                case 210218339:
                case 372333529:
                    C2310.m7813();
                    if (C2702.f8586 <= 0) {
                        iM31610 = C0619.m2761("ۢۡ") ^ i11;
                        i2 = ((iM31610 ^ i12) * 5851) ^ (-2078626719);
                        i3 = -1548810565;
                    } else {
                        iM31610 = C0773.m3169("᩺ᩴ") ^ i12;
                        i2 = ((iM31610 ^ i11) * 18857) ^ 600565754;
                        i3 = 1619796957;
                    }
                    i14 = iM31610 ^ i3;
                    i13 = i2;
                    break;
                case 539844818:
                case 599278733:
                    AbstractC0116.m1243();
                    break;
                case 703507659:
                case 1779396422:
                    AbstractC3624.m11755();
                    AbstractC3624.m11755();
                    iM31610 = C0619.m2761("ۢۡ") ^ i11;
                    i2 = ((iM31610 ^ i12) * 5851) ^ (-2078626719);
                    i3 = -1548810565;
                    i14 = iM31610 ^ i3;
                    i13 = i2;
                    break;
                case 1466696678:
                case 1564868538:
                    z = true;
                    z = true;
                    i4 = c10139.f32437 + 1;
                    if (C3033.f9831 < 0) {
                        iM31610 = (i12 - C0619.m2761("᩵ܺ")) * 87;
                        i2 = ((iM31610 ^ i11) * (-1527)) ^ (-371056815);
                        i3 = 1144067095;
                        i14 = iM31610 ^ i3;
                        i13 = i2;
                    } else {
                        iM3169 = C0619.m2761("ܽ᩹") ^ i11;
                        i13 = ((iM3169 ^ i12) * (-27955)) ^ 1857715470;
                        i = 545000268;
                        i14 = iM3169 ^ i;
                        c10139 = this;
                    }
                    break;
                default:
                    AbstractC0641.m2813();
                    if (C3734.m12152() < 0) {
                        iM3169 = (C0619.m2761("ܰۜ") + i11) * (-123);
                        i13 = ((iM3169 ^ i12) * 10459) ^ 1828288797;
                        i = 1644815312;
                        i14 = iM3169 ^ i;
                        c10139 = this;
                    } else {
                        iM31610 = C0773.m3169("᩺ᩴ") ^ i12;
                        i2 = ((iM31610 ^ i11) * 18857) ^ 600565754;
                        i3 = 1619796957;
                        i14 = iM31610 ^ i3;
                        i13 = i2;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0261 A[PHI: r17 r18
      0x0261: PHI (r17v5 short[]) = (r17v3 short[]), (r17v2 short[]), (r17v2 short[]), (r17v2 short[]), (r17v2 short[]) binds: [B:67:0x025f, B:63:0x0240, B:17:0x0082, B:15:0x007e, B:91:0x0261] A[DONT_GENERATE, DONT_INLINE]
      0x0261: PHI (r18v5 char) = (r18v2 char), (r18v3 char), (r18v2 char), (r18v2 char), (r18v2 char) binds: [B:67:0x025f, B:63:0x0240, B:17:0x0082, B:15:0x007e, B:91:0x0261] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007e, code lost:
    
        if (l.C2310.f7472 >= 0) goto L68;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m26173(l.C10139 r25, l.C14614 r26) {
        /*
            Method dump skipped, instruction units count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10139.m26173(l.ۢ۬֫, l.ܰ۬֫):void");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m26210() {
        boolean z = false;
        boolean z2 = false;
        int i = 1392660169;
        int i2 = C3690.f12684;
        int i3 = C2310.f7472;
        int iM3169 = C0773.m3169("ܳ֡") ^ i2;
        int i4 = ((iM3169 ^ i3) * 24309) ^ 236662827;
        int i5 = -135709168;
        while (true) {
            i = ((((i ^ i3) * (-30085)) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2129012493:
                case -797315945:
                    C2288.m7767();
                    iM3169 = (i3 - C0619.m2761("ܿ᩶")) * (-83);
                    i4 = ((iM3169 ^ i2) * (-11659)) ^ 1207899704;
                    i5 = 1815006407;
                    break;
                case -2077118191:
                case -698884735:
                    if (this.f32458) {
                        iM3169 = C0773.m3169("ܽۚ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 26141) ^ 521115789;
                        i5 = -1471145224;
                    } else {
                        iM3169 = C0773.m3169("ۖ᩺") ^ i2;
                        i4 = ((iM3169 ^ i3) * 23101) ^ (-936414612);
                        i5 = 1269252543;
                    }
                    break;
                case -1969232373:
                case 2078419389:
                    if (C2834.f9334 <= 0) {
                        iM3169 = (C0773.m3169("᩻᩶") + i3) * 23;
                        i4 = ((iM3169 ^ i2) * (-10795)) ^ (-88007966);
                        i5 = 58037545;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ۖ᩹")) * 115;
                        i4 = ((iM3169 ^ i2) * 1565) ^ (-343309250);
                        i5 = 1486094267;
                    }
                    break;
                case -1872788067:
                case 1619262777:
                    if (C0773.f2792 <= 0) {
                        iM3169 = C0773.m3169("۠᩺") ^ i3;
                        i4 = ((iM3169 ^ i2) * 9705) ^ (-264552600);
                        i5 = 41198229;
                    } else {
                        iM3169 = (i3 - C0773.m3169("᩺ܶ")) * 53;
                        i4 = ((iM3169 ^ i2) * (-571)) ^ 79600594;
                        i5 = 1503603949;
                    }
                    break;
                case -1767654235:
                case 21763420:
                    this.f32455.f61807 = z2;
                    if (C23916.f77426 <= 0) {
                        iM3169 = C0773.m3169("۠᩺") ^ i3;
                        i4 = ((iM3169 ^ i2) * 9705) ^ (-264552600);
                        i5 = 41198229;
                    } else {
                        iM3169 = C0773.m3169("֡ۨ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-6115)) ^ 1024217746;
                        i5 = 249280123;
                    }
                    break;
                case -1147737132:
                case -6219904:
                    if (C1564.m5509() <= 0) {
                        iM3169 = C0773.m3169("۠᩺") ^ i3;
                        i4 = ((iM3169 ^ i2) * 9705) ^ (-264552600);
                        i5 = 41198229;
                    } else {
                        iM3169 = (C0773.m3169("᩸ۨ") + i3) * (-3);
                        i4 = ((iM3169 ^ i2) * (-23703)) ^ (-1656756022);
                        i5 = -1399512130;
                    }
                    break;
                case -873707663:
                case -655816635:
                    this.f32452 = z2;
                    if (C23916.f77426 <= 0) {
                        iM3169 = C0773.m3169("ܿ᩻") ^ i2;
                        i4 = ((iM3169 ^ i3) * 24951) ^ (-1348584149);
                        i5 = 287340407;
                    } else {
                        iM3169 = C0619.m2761("ᩴۧ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 29083) ^ 1215674189;
                        i5 = 680076257;
                    }
                    break;
                case -772470757:
                case 1701304604:
                    if (C3448.f11240 >= 0) {
                        iM3169 = (C0773.m3169("᩻᩶") + i3) * 23;
                        i4 = ((iM3169 ^ i2) * (-10795)) ^ (-88007966);
                        i5 = 58037545;
                    } else {
                        iM3169 = (C0619.m2761("᩸۬") + i2) * (-63);
                        i4 = ((iM3169 ^ i3) * 2197) ^ (-115066457);
                        i5 = -88773015;
                    }
                    break;
                case -743423082:
                case 525227928:
                    if (C1146.m4231()) {
                        iM3169 = (C0773.m3169("ۚۨ") ^ i2) * 77;
                        i4 = ((iM3169 ^ i3) * (-6171)) ^ (-2075438913);
                        i5 = 283396182;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ܿ᩶")) * (-83);
                        i4 = ((iM3169 ^ i2) * (-11659)) ^ 1207899704;
                        i5 = 1815006407;
                    }
                    break;
                case -733591978:
                case -246601371:
                    C2834.m9344();
                    if (!C2702.m8876()) {
                        iM3169 = C0773.m3169("ۢ᩸") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-16699)) ^ 1633494671;
                        i5 = -292928991;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ܿ᩶")) * (-83);
                        i4 = ((iM3169 ^ i2) * (-11659)) ^ 1207899704;
                        i5 = 1815006407;
                    }
                    break;
                case -499550627:
                case 380001575:
                    C2485.m8357();
                    return false;
                case -235345026:
                case 2103368988:
                    if (C2023.f6737) {
                        iM3169 = C0773.m3169("ܿ᩻") ^ i2;
                        i4 = ((iM3169 ^ i3) * 24951) ^ (-1348584149);
                        i5 = 287340407;
                    } else {
                        iM3169 = (C0619.m2761("ܺۙ") ^ i3) * 91;
                        i4 = ((iM3169 ^ i2) * (-23383)) ^ 976804636;
                        i5 = 995375418;
                    }
                    break;
                case -153506957:
                case 783280353:
                    z2 = false;
                    if (z) {
                        iM3169 = C0773.m3169("ܽۚ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 26141) ^ 521115789;
                        i5 = -1471145224;
                    } else {
                        iM3169 = C0773.m3169("ᩴ᩻") ^ i2;
                        i4 = ((iM3169 ^ i3) * q.h) ^ (-187024298);
                        i5 = -391654810;
                    }
                    break;
                case -21491125:
                case 2001654088:
                    m26195(true);
                    return true;
                case 238011052:
                case 1016674331:
                    if (C0619.m2763()) {
                        iM3169 = C0773.m3169("ۢ᩸") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-16699)) ^ 1633494671;
                        i5 = -292928991;
                    } else {
                        iM3169 = (C0619.m2761("ۛۜ") ^ i2) * q.h;
                        i4 = ((iM3169 ^ i3) * (-5453)) ^ (-955736130);
                        i5 = -1839342948;
                    }
                    break;
                case 375762195:
                case 802409739:
                    C3448.m11248();
                    if (C3779.f12953 > 0) {
                        iM3169 = (C0773.m3169("᩻᩶") + i3) * 23;
                        i4 = ((iM3169 ^ i2) * (-10795)) ^ (-88007966);
                        i5 = 58037545;
                    } else {
                        iM3169 = C0773.m3169("ۢ᩸") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-16699)) ^ 1633494671;
                        i5 = -292928991;
                    }
                    break;
                case 882327806:
                case 1968500411:
                    return z2;
                case 1035907845:
                case 1928038363:
                    C3077.m10041();
                    if (C2419.f7754 < 0) {
                        iM3169 = C0773.m3169("۠᩺") ^ i3;
                        i4 = ((iM3169 ^ i2) * 9705) ^ (-264552600);
                        i5 = 41198229;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ܿ᩶")) * (-83);
                        i4 = ((iM3169 ^ i2) * (-11659)) ^ 1207899704;
                        i5 = 1815006407;
                    }
                    break;
                default:
                    z = this.f32452;
                    if (C23916.f77426 <= 0) {
                        iM3169 = C0773.m3169("۠᩺") ^ i3;
                        i4 = ((iM3169 ^ i2) * 9705) ^ (-264552600);
                        i5 = 41198229;
                    } else {
                        iM3169 = C0773.m3169("֫۟") ^ i2;
                        i4 = ((iM3169 ^ i3) * 21595) ^ (-277109987);
                        i5 = 1135422184;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0399 A[PHI: r12 r18 r19
      0x0399: PHI (r12v4 short) = (r12v3 short), (r12v2 short) binds: [B:102:0x0397, B:98:0x036e] A[DONT_GENERATE, DONT_INLINE]
      0x0399: PHI (r18v19 int) = (r18v18 int), (r18v20 int) binds: [B:102:0x0397, B:98:0x036e] A[DONT_GENERATE, DONT_INLINE]
      0x0399: PHI (r19v4 int) = (r19v3 int), (r19v5 int) binds: [B:102:0x0397, B:98:0x036e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:123:0x046f A[PHI: r18
      0x046f: PHI (r18v36 int) = (r18v13 int), (r18v14 int), (r18v37 int) binds: [B:122:0x046d, B:118:0x0448, B:14:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:127:0x04ab A[PHI: r18
      0x04ab: PHI (r18v34 int) = (r18v12 int), (r18v15 int), (r18v35 int) binds: [B:126:0x04a9, B:114:0x0427, B:30:0x00fd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:131:0x04e3 A[PHI: r18
      0x04e3: PHI (r18v39 int) = (r18v11 int), (r18v16 int), (r18v40 int) binds: [B:130:0x04e1, B:110:0x0404, B:10:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:89:0x02e1 A[PHI: r8 r18
      0x02e1: PHI (r8v4 long) = (r8v1 long), (r8v1 long), (r8v1 long), (r8v5 long) binds: [B:84:0x02bb, B:87:0x02c7, B:6:0x0051, B:79:0x0291] A[DONT_GENERATE, DONT_INLINE]
      0x02e1: PHI (r18v65 int) = (r18v2 int), (r18v25 int), (r18v42 int), (r18v66 int) binds: [B:84:0x02bb, B:87:0x02c7, B:6:0x0051, B:79:0x0291] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0088, code lost:
    
        if (l.C3690.f12684 > 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0126, code lost:
    
        if (l.C2702.f8586 <= 0) goto L14;
     */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void m26192(l.C10139 r25, int r26, int r27, java.lang.String r28) {
        /*
            Method dump skipped, instruction units count: 1670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10139.m26192(l.ۢ۬֫, int, int, java.lang.String):void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m26170(C10139 c10139, int i, int i2, boolean z, int i3, boolean z2, String str) {
        int i4 = 1373955884;
        int i5 = C1826.f6190;
        int i6 = C2702.f8586;
        int iM2761 = C0619.m2761("ܽۖ") ^ i6;
        int i7 = ((iM2761 ^ i5) * (-24021)) ^ 1756077774;
        int i8 = -450075993;
        while (true) {
            i4 = ((((i4 ^ i5) * (-26369)) >> 31) & i7) ^ (iM2761 ^ i8);
            switch (i4) {
                case -1863088372:
                case 910858907:
                    if (c10139.f32468 == i) {
                        iM2761 = C0619.m2761("ᩴ᩵") ^ i6;
                        i7 = ((iM2761 ^ i5) * (-12935)) ^ 619890994;
                        i8 = -1903672413;
                    } else {
                        iM2761 = (i6 - C0773.m3169("ܳ᩺")) * 17;
                        i7 = ((iM2761 ^ i5) * (-15921)) ^ 981876967;
                        i8 = 219476068;
                    }
                    break;
                case -1687529062:
                case -1388158430:
                    if (C1146.m4231()) {
                        iM2761 = C0773.m3169("ۚۧ") ^ i5;
                        i7 = ((iM2761 ^ i6) * (-12023)) ^ (-642445787);
                        i8 = 1486195937;
                    } else {
                        iM2761 = (C0619.m2761("ۧܰ") ^ i6) * (-57);
                        i7 = ((iM2761 ^ i5) * 21611) ^ (-1957810506);
                        i8 = 383838954;
                    }
                    break;
                case -1600177265:
                case 1301109986:
                    if (C0619.m2763()) {
                        iM2761 = (C0619.m2761("֨ۖ") ^ i5) * (-5);
                        i7 = ((iM2761 ^ i6) * (-13213)) ^ 276811929;
                        i8 = 1278263936;
                    } else {
                        iM2761 = (i5 - C0619.m2761("۠᩸")) * 63;
                        i7 = ((iM2761 ^ i6) * 14545) ^ 2071418052;
                        i8 = -1976433744;
                    }
                    break;
                case -1499427143:
                case 113136630:
                    C3998.m12920();
                    C4282.m13644();
                    break;
                case -1457744651:
                case 1817370868:
                    if (C4282.f15546 <= 0) {
                        iM2761 = (C0773.m3169("ܳۜ") + i6) * 35;
                        i7 = ((iM2761 ^ i5) * 4815) ^ 775476255;
                        i8 = -316239048;
                    } else {
                        iM2761 = (C0619.m2761("᩷ۤ") ^ i5) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i7 = ((iM2761 ^ i6) * 2839) ^ (-879932558);
                        i8 = -152557885;
                    }
                    break;
                case -1255128400:
                case 175092439:
                    C4282.m13644();
                    iM2761 = C0619.m2761("ۤ۟") ^ i5;
                    i7 = ((iM2761 ^ i6) * 10037) ^ (-954510353);
                    i8 = 1650179178;
                    break;
                case -1034404095:
                case 26300664:
                    break;
                case -958010722:
                case 933290150:
                    if (i2 == c10139.f32437) {
                        iM2761 = C0619.m2761("ۨ۟") ^ i5;
                        i7 = ((iM2761 ^ i6) * (-31339)) ^ (-1628429559);
                        i8 = 729761800;
                    } else {
                        iM2761 = (i6 - C0773.m3169("ܳ᩺")) * 17;
                        i7 = ((iM2761 ^ i5) * (-15921)) ^ 981876967;
                        i8 = 219476068;
                    }
                    break;
                case -913039815:
                case 2039570995:
                    C3448.m11248();
                    if (C1519.f5300 >= 0) {
                        iM2761 = (C0619.m2761("ۛ᩵") + i5) * (-39);
                        i7 = ((iM2761 ^ i6) * 10561) ^ 460960084;
                        i8 = -1822883467;
                    } else {
                        iM2761 = C0619.m2761("ۤ۟") ^ i5;
                        i7 = ((iM2761 ^ i6) * 10037) ^ (-954510353);
                        i8 = 1650179178;
                    }
                    break;
                case -827593715:
                case 1335535384:
                    c10139.m26165(str, i3, i2, z, z2);
                    iM2761 = (i6 - C0773.m3169("ܳ᩺")) * 17;
                    i7 = ((iM2761 ^ i5) * (-15921)) ^ 981876967;
                    i8 = 219476068;
                    break;
                case -711307956:
                case 255446355:
                    if (C3690.f12684 <= 0) {
                        iM2761 = (C0619.m2761("֨ۖ") ^ i5) * (-5);
                        i7 = ((iM2761 ^ i6) * (-13213)) ^ 276811929;
                        i8 = 1278263936;
                    } else {
                        iM2761 = (i5 - C0619.m2761("ۡ᩻")) * (-105);
                        i7 = ((iM2761 ^ i6) * (-30919)) ^ (-680765140);
                        i8 = -532094711;
                    }
                    break;
                case -528105815:
                case 167814207:
                    if (RunnableC3055.m9933() != 0) {
                        iM2761 = (C0773.m3169("ܳۜ") + i6) * 35;
                        i7 = ((iM2761 ^ i5) * 4815) ^ 775476255;
                        i8 = -316239048;
                    } else {
                        iM2761 = C0773.m3169("֡ᩴ") ^ i5;
                        i7 = ((iM2761 ^ i6) * (-30553)) ^ (-1784638090);
                        i8 = 637041848;
                    }
                    break;
                case -339094671:
                case 799383873:
                    if (AbstractC0116.f1064 <= 0) {
                        iM2761 = (C0619.m2761("֨ۖ") ^ i5) * (-5);
                        i7 = ((iM2761 ^ i6) * (-13213)) ^ 276811929;
                        i8 = 1278263936;
                    } else {
                        iM2761 = (C0773.m3169("ܽ᩸") ^ i6) * (-3);
                        i7 = ((iM2761 ^ i5) * 30339) ^ (-23429655);
                        i8 = -2044027836;
                    }
                    break;
                case 233694018:
                case 1092454316:
                    if (RunnableC0334.f1808 <= 0) {
                        iM2761 = (C0773.m3169("ܳۜ") + i6) * 35;
                        i7 = ((iM2761 ^ i5) * 4815) ^ 775476255;
                        i8 = -316239048;
                    } else {
                        iM2761 = (i6 - C0773.m3169("᩵֡")) * (-107);
                        i7 = ((iM2761 ^ i5) * 12587) ^ 1420852892;
                        i8 = 333633605;
                    }
                    break;
                case 527872679:
                case 1270129043:
                    C23916.m53419();
                    if (C1564.f5401 <= 0) {
                        iM2761 = (C0619.m2761("ۧܰ") ^ i6) * (-57);
                        i7 = ((iM2761 ^ i5) * 21611) ^ (-1957810506);
                        i8 = 383838954;
                    } else {
                        iM2761 = (C0619.m2761("ۛ᩵") + i5) * (-39);
                        i7 = ((iM2761 ^ i6) * 10561) ^ 460960084;
                        i8 = -1822883467;
                    }
                    break;
                case 798605144:
                case 1579076801:
                    if (C2354.m7983()) {
                        iM2761 = (C0619.m2761("ۧ۠") + i6) * 75;
                        i7 = ((iM2761 ^ i5) * (-3633)) ^ (-1780903969);
                        i8 = 931617524;
                    } else {
                        iM2761 = (C0619.m2761("֨ۖ") ^ i5) * (-5);
                        i7 = ((iM2761 ^ i6) * (-13213)) ^ 276811929;
                        i8 = 1278263936;
                    }
                    break;
                case 866758348:
                case 1097402845:
                    C2966.m9664();
                    if (C13473.f42873 != 0) {
                        iM2761 = (C0773.m3169("ܳۜ") + i6) * 35;
                        i7 = ((iM2761 ^ i5) * 4815) ^ 775476255;
                        i8 = -316239048;
                    } else {
                        iM2761 = C0619.m2761("ۤ۟") ^ i5;
                        i7 = ((iM2761 ^ i6) * 10037) ^ (-954510353);
                        i8 = 1650179178;
                    }
                    break;
                case 872397457:
                case 2116610178:
                    if (c10139.f32463) {
                        iM2761 = (i6 - C0773.m3169("ܳ᩺")) * 17;
                        i7 = ((iM2761 ^ i5) * (-15921)) ^ 981876967;
                        i8 = 219476068;
                    } else {
                        iM2761 = (i5 - C0619.m2761("ۧۨ")) * (-59);
                        i7 = ((iM2761 ^ i6) * 4917) ^ 2004289181;
                        i8 = -1995085051;
                    }
                    break;
                case 1197171338:
                case 1254519357:
                    if (C1564.f5401 <= 0) {
                        iM2761 = (C0619.m2761("ۛ᩵") + i5) * (-39);
                        i7 = ((iM2761 ^ i6) * 10561) ^ 460960084;
                        i8 = -1822883467;
                    } else {
                        iM2761 = C0619.m2761("᩹۫") ^ i6;
                        i7 = ((iM2761 ^ i5) * 11429) ^ (-671350245);
                        i8 = -1461165433;
                    }
                    break;
                default:
                    if (C23916.f77426 <= 0) {
                        iM2761 = (C0619.m2761("֨ۖ") ^ i5) * (-5);
                        i7 = ((iM2761 ^ i6) * (-13213)) ^ 276811929;
                        i8 = 1278263936;
                    } else {
                        iM2761 = (C0773.m3169("ܽۘ") + i6) * 81;
                        i7 = ((iM2761 ^ i5) * 17281) ^ 999391095;
                        i8 = -1405411667;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0453 A[PHI: r9 r10 r12 r21 r25
      0x0453: PHI (r9v65 int) = (r9v52 int), (r9v69 int) binds: [B:100:0x043b, B:57:0x0202] A[DONT_GENERATE, DONT_INLINE]
      0x0453: PHI (r10v74 int) = (r10v53 int), (r10v77 int) binds: [B:100:0x043b, B:57:0x0202] A[DONT_GENERATE, DONT_INLINE]
      0x0453: PHI (r12v55 boolean) = (r12v44 boolean), (r12v58 boolean) binds: [B:100:0x043b, B:57:0x0202] A[DONT_GENERATE, DONT_INLINE]
      0x0453: PHI (r21v45 float) = (r21v38 float), (r21v48 float) binds: [B:100:0x043b, B:57:0x0202] A[DONT_GENERATE, DONT_INLINE]
      0x0453: PHI (r25v62 int) = (r25v50 int), (r25v66 int) binds: [B:100:0x043b, B:57:0x0202] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:49:0x0194  */
    /* JADX WARN: Code duplicated, block: B:55:0x01e2 A[PHI: r14
      0x01e2: PHI (r14v4 android.view.View) = (r14v3 android.view.View), (r14v2 android.view.View) binds: [B:53:0x01ca, B:43:0x0160] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:97:0x0400 A[PHI: r9 r10 r12 r21 r25
      0x0400: PHI (r9v68 int) = (r9v53 int), (r9v69 int) binds: [B:95:0x03e8, B:57:0x0202] A[DONT_GENERATE, DONT_INLINE]
      0x0400: PHI (r10v76 int) = (r10v54 int), (r10v77 int) binds: [B:95:0x03e8, B:57:0x0202] A[DONT_GENERATE, DONT_INLINE]
      0x0400: PHI (r12v57 boolean) = (r12v45 boolean), (r12v58 boolean) binds: [B:95:0x03e8, B:57:0x0202] A[DONT_GENERATE, DONT_INLINE]
      0x0400: PHI (r21v47 float) = (r21v39 float), (r21v48 float) binds: [B:95:0x03e8, B:57:0x0202] A[DONT_GENERATE, DONT_INLINE]
      0x0400: PHI (r25v65 int) = (r25v51 int), (r25v66 int) binds: [B:95:0x03e8, B:57:0x0202] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m26165(String str, final int i, int i2, boolean z, boolean z2) {
        float f;
        float f2;
        View view;
        int iM2761;
        int i3;
        int i4;
        int i5;
        int iM3169;
        int i6;
        int i7;
        int i8;
        int iM2762;
        int i9;
        int i10;
        int i11;
        boolean z3;
        int i12;
        int i13;
        float f3;
        float f4;
        View view2;
        int iM2763;
        int i14;
        int i15;
        int iM31610;
        int i16;
        int i17;
        int iM31611;
        int i18;
        int i19;
        int i20;
        float f5;
        int i21;
        int i22;
        float f6;
        int i23;
        WebView webView;
        int iM31612;
        int i24;
        int i25;
        int i26 = C2702.f8586;
        int i27 = C1826.f6190;
        int iM2764 = (C0619.m2761("֫ۧ") ^ i26) * 29;
        int i28 = ((iM2764 ^ i27) * 1637) ^ 368474179;
        WebView webView2 = null;
        View view3 = null;
        ValueAnimator valueAnimatorOfFloat = null;
        View view4 = null;
        int i29 = iM2764 ^ (-1728531949);
        float fM26159 = 0.0f;
        final float f7 = 0.0f;
        int iAbs = 0;
        float f8 = 0.0f;
        int marginStart = 0;
        int i30 = 0;
        boolean z4 = false;
        float fAbs = 0.0f;
        float f9 = 0.0f;
        int i31 = 0;
        float fMax = 0.0f;
        int i32 = 0;
        int i33 = 0;
        int i34 = 359322915;
        int i35 = 0;
        while (true) {
            i34 = i29 ^ (i28 & (((i34 ^ i27) * (-23185)) >> 31));
            switch (i34) {
                case -2105758171:
                case -580495035:
                    view4 = this.f32476;
                    if (this.f32467) {
                        iM2763 = (C0773.m3169("۠᩻") + i27) * 59;
                        i14 = ((iM2763 ^ i26) * 25) ^ 2089638741;
                        i15 = -2054253148;
                    } else {
                        iM2763 = C0773.m3169("ۨ۬") ^ i26;
                        i14 = ((iM2763 ^ i27) * 22197) ^ (-82096439);
                        i15 = 1549066943;
                    }
                    i29 = iM2763 ^ i15;
                    i28 = i14;
                    break;
                case -2000647931:
                case 1227949438:
                    C13473.m33144();
                    if (!C1783.m6232()) {
                        f2 = f8;
                        i30 = i30;
                        z4 = z4;
                        i33 = i33;
                        i35 = i35;
                        f = fM26159;
                        iAbs = iAbs;
                        view = view3;
                        i31 = i31;
                        f7 = f7;
                        iM2762 = C0619.m2761("ܳ֫") ^ i26;
                        i9 = ((iM2762 ^ i27) * 16393) ^ (-1509512996);
                        i10 = -1841957204;
                        i11 = iM2762 ^ i10;
                        view3 = view;
                        fM26159 = f;
                        f8 = f2;
                        i33 = i33;
                        z4 = z4;
                        i12 = i30;
                        i29 = i11;
                        i28 = i9;
                        f7 = f7;
                        i31 = i31;
                        iAbs = iAbs;
                        i35 = i35;
                        i30 = i12;
                    } else {
                        i5 = i30;
                        z4 = z4;
                        i8 = i35;
                        iM31612 = C0619.m2761("᩷ۡ") ^ i27;
                        i24 = ((iM31612 ^ i26) * (-22833)) ^ 882764615;
                        i25 = 1363709617;
                        int i36 = iM31612 ^ i25;
                        i35 = i8;
                        i30 = i5;
                        i29 = i36;
                        i28 = i24;
                        z4 = z4;
                    }
                    break;
                case -1924867902:
                case 1669299626:
                    i5 = i30;
                    z4 = z4;
                    i8 = i35;
                    valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.f32481 = valueAnimatorOfFloat;
                    if (C17202.f56030) {
                        iM31612 = C0619.m2761("᩵᩷") ^ i26;
                        i24 = ((iM31612 ^ i27) * (-4471)) ^ (-1853958749);
                        i25 = 1459047841;
                    } else {
                        iM31612 = (i26 - C0773.m3169("᩶۫")) * 99;
                        i24 = ((iM31612 ^ i27) * 2711) ^ (-1957685740);
                        i25 = -1621426855;
                    }
                    int i37 = iM31612 ^ i25;
                    i35 = i8;
                    i30 = i5;
                    i29 = i37;
                    i28 = i24;
                    z4 = z4;
                    break;
                case -1903012326:
                case -152107205:
                    i5 = i30;
                    z4 = z4;
                    i8 = i35;
                    fM26159 = iAbs / m26159(i8);
                    if (C0773.f2792 <= 0) {
                        iM31612 = C0619.m2761("᩷ۡ") ^ i27;
                        i24 = ((iM31612 ^ i26) * (-22833)) ^ 882764615;
                        i25 = 1363709617;
                    } else {
                        iM31612 = C0773.m3169("ۤۛ") ^ i27;
                        i24 = ((iM31612 ^ i26) * 23) ^ 273574197;
                        i25 = -1039770501;
                    }
                    int i38 = iM31612 ^ i25;
                    i35 = i8;
                    i30 = i5;
                    i29 = i38;
                    i28 = i24;
                    z4 = z4;
                    break;
                case -1816725524:
                case 1571162784:
                    z3 = true;
                    int iM31613 = C0773.m3169("ۙۧ") ^ i26;
                    view3 = view3;
                    fM26159 = fM26159;
                    i33 = i33;
                    z4 = z3;
                    i28 = ((iM31613 ^ i27) * 9381) ^ 1280520205;
                    f8 = f8;
                    i12 = i30;
                    i29 = iM31613 ^ (-1161464288);
                    f7 = f7;
                    i31 = i31;
                    iAbs = iAbs;
                    i35 = i35;
                    i30 = i12;
                    break;
                case -1795142937:
                case 2063579918:
                    int i39 = i30;
                    boolean z5 = z4;
                    int i40 = i33;
                    int i41 = i35;
                    float f10 = fM26159;
                    int i42 = iAbs;
                    View view5 = view3;
                    int i43 = i31;
                    f7 = this.f32466;
                    if (z) {
                        iM31610 = (C0773.m3169("ۛܿ") ^ i27) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i16 = ((iM31610 ^ i26) * (-6789)) ^ 1187493485;
                        i17 = 2003924538;
                    } else {
                        iM31610 = C0773.m3169("۫ܶ") ^ i27;
                        i16 = ((iM31610 ^ i26) * (-16245)) ^ 1241261009;
                        i17 = 1972609478;
                    }
                    int i44 = iM31610 ^ i17;
                    view3 = view5;
                    i31 = i43;
                    fM26159 = f10;
                    iAbs = i42;
                    i35 = i41;
                    i33 = i40;
                    z4 = z5;
                    i30 = i39;
                    i29 = i44;
                    i28 = i16;
                    f8 = f8;
                    break;
                case -1635056006:
                case -660005877:
                    i30 = i30;
                    z4 = z4;
                    i33 = i33;
                    i35 = i35;
                    f = fM26159;
                    if (this.f32441 != null) {
                        iM2761 = C0773.m3169("᩺ܰ") ^ i27;
                        i3 = ((iM2761 ^ i26) * (-29507)) ^ (-1099214776);
                        i4 = 272749205;
                    } else {
                        webView = webView2;
                        iM2761 = C0619.m2761("ܰᩳ") ^ i26;
                        webView2 = webView;
                        i3 = ((iM2761 ^ i27) * (-24883)) ^ (-1460529426);
                        i4 = -345831756;
                    }
                    int i45 = iM2761 ^ i4;
                    i35 = i35;
                    i30 = i30;
                    i29 = i45;
                    i28 = i3;
                    fM26159 = f;
                    i33 = i33;
                    z4 = z4;
                    break;
                case -1627830932:
                case 1807482790:
                    C13473.m33144();
                    if (C2354.f7599 < 0) {
                        i5 = i30;
                        z4 = z4;
                        i8 = i35;
                        iM31612 = C0619.m2761("ۧ۠") ^ i27;
                        i24 = ((iM31612 ^ i26) * (-20891)) ^ 650872100;
                        i25 = -1087012224;
                        int i310 = iM31612 ^ i25;
                        i35 = i8;
                        i30 = i5;
                        i29 = i310;
                        i28 = i24;
                        z4 = z4;
                    }
                    i5 = i30;
                    z4 = z4;
                    i8 = i35;
                    iM31612 = C0619.m2761("᩷ۡ") ^ i27;
                    i24 = ((iM31612 ^ i26) * (-22833)) ^ 882764615;
                    i25 = 1363709617;
                    int i311 = iM31612 ^ i25;
                    i35 = i8;
                    i30 = i5;
                    i29 = i311;
                    i28 = i24;
                    z4 = z4;
                    break;
                case -1615781610:
                case -368387041:
                    if (C2419.m8174() < 0) {
                        f2 = f8;
                        i30 = i30;
                        z4 = z4;
                        i33 = i33;
                        i35 = i35;
                        f = fM26159;
                        iAbs = iAbs;
                        view = view3;
                        i31 = i31;
                        f7 = f7;
                        iM2762 = C0773.m3169("᩸ܽ") ^ i26;
                        i9 = ((iM2762 ^ i27) * (-19359)) ^ 742629233;
                        i10 = 1363521383;
                        i11 = iM2762 ^ i10;
                        view3 = view;
                        fM26159 = f;
                        f8 = f2;
                        i33 = i33;
                        z4 = z4;
                        i12 = i30;
                        i29 = i11;
                        i28 = i9;
                        f7 = f7;
                        i31 = i31;
                        iAbs = iAbs;
                        i35 = i35;
                        i30 = i12;
                    }
                    f2 = f8;
                    i30 = i30;
                    z4 = z4;
                    i33 = i33;
                    i35 = i35;
                    f = fM26159;
                    iAbs = iAbs;
                    view = view3;
                    i31 = i31;
                    f7 = f7;
                    iM2762 = (i27 - C0619.m2761("᩺۬")) * (-61);
                    i9 = ((iM2762 ^ i26) * 8549) ^ (-1645746898);
                    i10 = -230535469;
                    i11 = iM2762 ^ i10;
                    view3 = view;
                    fM26159 = f;
                    f8 = f2;
                    i33 = i33;
                    z4 = z4;
                    i12 = i30;
                    i29 = i11;
                    i28 = i9;
                    f7 = f7;
                    i31 = i31;
                    iAbs = iAbs;
                    i35 = i35;
                    i30 = i12;
                    break;
                case -1559422901:
                case 1875960477:
                    m26163(f8, i);
                    m26166(str, i2, z, z4);
                    break;
                case -1495026709:
                case -1227857622:
                    i5 = i30;
                    z4 = z4;
                    fMax = Math.max(fAbs, fM26159) * 240.0f;
                    if (C2023.m6964() <= 0) {
                        iM3169 = C0773.m3169("ۗ۫") ^ i26;
                        i6 = ((iM3169 ^ i27) * (-4569)) ^ 938261433;
                        i7 = 1048285056;
                    } else {
                        iM3169 = (C0619.m2761("ܰ֫") ^ i26) * (-13);
                        i6 = ((iM3169 ^ i27) * 9719) ^ 442782957;
                        i7 = 1024649497;
                    }
                    int i46 = iM3169 ^ i7;
                    z4 = z4;
                    i12 = i5;
                    i29 = i46;
                    i28 = i6;
                    i30 = i12;
                    break;
                case -1423945545:
                case 905796984:
                    i30 = 0;
                    iM2763 = C0773.m3169("᩹᩹") ^ i27;
                    i14 = ((iM2763 ^ i26) * (-20831)) ^ (-182035746);
                    i15 = 462219456;
                    i29 = iM2763 ^ i15;
                    i28 = i14;
                    break;
                case -1400405325:
                case -777580557:
                    f2 = f8;
                    i30 = i30;
                    z4 = z4;
                    i33 = i33;
                    i35 = i35;
                    f = fM26159;
                    iAbs = iAbs;
                    view = view3;
                    i31 = i31;
                    f7 = f7;
                    if (C3779.f12953 <= 0) {
                        iM2762 = C0773.m3169("᩸ܽ") ^ i26;
                        i9 = ((iM2762 ^ i27) * (-19359)) ^ 742629233;
                        i10 = 1363521383;
                    } else {
                        iM2762 = C0619.m2761("ܽۘ") ^ i27;
                        i9 = ((iM2762 ^ i26) * 9885) ^ 1086223268;
                        i10 = -726050880;
                    }
                    i11 = iM2762 ^ i10;
                    view3 = view;
                    fM26159 = f;
                    f8 = f2;
                    i33 = i33;
                    z4 = z4;
                    i12 = i30;
                    i29 = i11;
                    i28 = i9;
                    f7 = f7;
                    i31 = i31;
                    iAbs = iAbs;
                    i35 = i35;
                    i30 = i12;
                    break;
                case -1399121354:
                case 200440791:
                    final float f11 = f8;
                    final int i47 = marginStart;
                    valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: l.ۗ۬֫

                        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ C10139 f11103;

                        {
                            int i48 = -465262155;
                            int i49 = RunnableC0334.f1808;
                            int i50 = C2288.f7433;
                            int iM2765 = (C0619.m2761("᩸ۛ") ^ i49) * (-109);
                            int i51 = ((iM2765 ^ i50) * 21413) ^ (-212777785);
                            int i52 = -25877807;
                            while (true) {
                                i48 = ((((i48 ^ i50) * 2625) >> 31) & i51) ^ (iM2765 ^ i52);
                                switch (i48) {
                                    case -1679658036:
                                    case -1174636491:
                                        if (C3448.f11240 >= 0) {
                                            iM2765 = C0619.m2761("ۡܳ") ^ i49;
                                            i51 = ((iM2765 ^ i50) * 14335) ^ 1311005108;
                                            i52 = 1155627307;
                                        } else {
                                            iM2765 = (i49 - C0773.m3169("᩵᩵")) * 95;
                                            i51 = ((iM2765 ^ i50) * (-22549)) ^ (-593149279);
                                            i52 = 1036505993;
                                        }
                                        break;
                                    case -1576154211:
                                    case -78001554:
                                        return;
                                    case -1512771257:
                                    case 1366262966:
                                        C3734.m12152();
                                        C1564.m5509();
                                        iM2765 = (C0619.m2761("֨᩸") + i49) * q.h;
                                        i51 = ((iM2765 ^ i50) * (-12741)) ^ 776828096;
                                        i52 = -51559241;
                                        break;
                                    case -1337789080:
                                    case -323394230:
                                        if (RunnableC0334.f1808 <= 0) {
                                            iM2765 = (i50 - C0773.m3169("ܽ֡")) * (-89);
                                            i51 = ((iM2765 ^ i49) * 14923) ^ 884696016;
                                            i52 = 94680452;
                                        } else {
                                            iM2765 = (C0773.m3169("ۢۜ") ^ i49) * 71;
                                            i51 = ((iM2765 ^ i50) * 8671) ^ (-1040152687);
                                            i52 = -1978157626;
                                        }
                                        break;
                                    case -1105070078:
                                    case 1902009238:
                                        C3033.m9845();
                                        if (AbstractC0641.f2496 >= 0) {
                                            iM2765 = (i50 - C0773.m3169("ܽ֡")) * (-89);
                                            i51 = ((iM2765 ^ i49) * 14923) ^ 884696016;
                                            i52 = 94680452;
                                        } else {
                                            iM2765 = C0773.m3169("֨۠") ^ i50;
                                            i51 = ((iM2765 ^ i49) * 18045) ^ 801339379;
                                            i52 = -947494878;
                                        }
                                        break;
                                    case -1009995500:
                                    case 134070622:
                                        C2966.m9664();
                                        throw new RuntimeException();
                                    case -859655432:
                                    case -102764995:
                                        if (C1080.f3865 >= 0) {
                                            iM2765 = C0773.m3169("۫֨") ^ i49;
                                            i51 = ((iM2765 ^ i50) * 13077) ^ 605079063;
                                            i52 = 331436552;
                                        } else {
                                            iM2765 = C0619.m2761("ۡۙ") ^ i50;
                                            i51 = ((iM2765 ^ i49) * (-14653)) ^ 522057197;
                                            i52 = -1727319765;
                                        }
                                        break;
                                    case -731578997:
                                    case 889883:
                                        if (C11235.f35427 < 0) {
                                            iM2765 = C0773.m3169("֨۠") ^ i50;
                                            i51 = ((iM2765 ^ i49) * 18045) ^ 801339379;
                                            i52 = -947494878;
                                        } else {
                                            iM2765 = (C0619.m2761("֨᩸") + i49) * q.h;
                                            i51 = ((iM2765 ^ i50) * (-12741)) ^ 776828096;
                                            i52 = -51559241;
                                        }
                                        break;
                                    case -521472235:
                                    case 635389007:
                                        this.f11103 = this;
                                        if (C11235.f35427 >= 0) {
                                            iM2765 = (C0619.m2761("֨᩸") + i49) * q.h;
                                            i51 = ((iM2765 ^ i50) * (-12741)) ^ 776828096;
                                            i52 = -51559241;
                                        } else {
                                            iM2765 = (i50 - C0619.m2761("ۛ֫")) * (-125);
                                            i51 = ((iM2765 ^ i49) * (-10595)) ^ 1907310169;
                                            i52 = -1647215774;
                                        }
                                        break;
                                    case -19037781:
                                    case 1410904584:
                                        if (C2354.f7599 >= 0) {
                                            iM2765 = (i50 - C0773.m3169("ܽ֡")) * (-89);
                                            i51 = ((iM2765 ^ i49) * 14923) ^ 884696016;
                                            i52 = 94680452;
                                        } else {
                                            iM2765 = C0773.m3169("᩺᩵") ^ i49;
                                            i51 = ((iM2765 ^ i50) * (-10583)) ^ (-975720344);
                                            i52 = -1941911103;
                                        }
                                        break;
                                    case 407969936:
                                    case 1293959483:
                                        if (C13473.f42873 != 0) {
                                            iM2765 = (i50 - C0773.m3169("ܽ֡")) * (-89);
                                            i51 = ((iM2765 ^ i49) * 14923) ^ 884696016;
                                            i52 = 94680452;
                                        } else {
                                            iM2765 = (C0619.m2761("ۤۨ") + i50) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                                            i51 = ((iM2765 ^ i49) * 4739) ^ 787141880;
                                            i52 = -1977756901;
                                        }
                                        break;
                                    case 526091916:
                                    case 1378038816:
                                        if (C11235.f35427 >= 0) {
                                            iM2765 = (i50 - C0773.m3169("ܽ֡")) * (-89);
                                            i51 = ((iM2765 ^ i49) * 14923) ^ 884696016;
                                            i52 = 94680452;
                                        } else {
                                            iM2765 = (C0773.m3169("ᩴۤ") ^ i50) * 93;
                                            i51 = ((iM2765 ^ i49) * 7509) ^ (-1338555923);
                                            i52 = -479234607;
                                        }
                                        break;
                                    case 645820634:
                                    case 1826768758:
                                        C1783.m6232();
                                        if (!C4282.m13644()) {
                                            iM2765 = C0619.m2761("ۡܳ") ^ i49;
                                            i51 = ((iM2765 ^ i50) * 14335) ^ 1311005108;
                                            i52 = 1155627307;
                                        } else {
                                            iM2765 = (C0619.m2761("֨᩸") + i49) * q.h;
                                            i51 = ((iM2765 ^ i50) * (-12741)) ^ 776828096;
                                            i52 = -51559241;
                                        }
                                        break;
                                    case 1097382444:
                                    case 2092323201:
                                        if (RunnableC3055.f9898 >= 0) {
                                            iM2765 = (C0619.m2761("֨᩸") + i49) * q.h;
                                            i51 = ((iM2765 ^ i50) * (-12741)) ^ 776828096;
                                            i52 = -51559241;
                                        } else {
                                            iM2765 = C0773.m3169("᩵᩷") ^ i49;
                                            i51 = ((iM2765 ^ i50) * (-22183)) ^ 702570011;
                                            i52 = 770543869;
                                        }
                                        break;
                                    case 1355671956:
                                    case 1671178853:
                                        if (C2834.f9334 <= 0) {
                                            iM2765 = (i50 - C0773.m3169("ܽ֡")) * (-89);
                                            i51 = ((iM2765 ^ i49) * 14923) ^ 884696016;
                                            i52 = 94680452;
                                        } else {
                                            iM2765 = (i49 - C0773.m3169("᩸ۧ")) * 9;
                                            i51 = ((iM2765 ^ i50) * (-20907)) ^ (-923542292);
                                            i52 = -1563794356;
                                        }
                                        break;
                                    default:
                                        if (RunnableC3055.f9898 >= 0) {
                                            iM2765 = (i50 - C0773.m3169("ܽ֡")) * (-89);
                                            i51 = ((iM2765 ^ i49) * 14923) ^ 884696016;
                                            i52 = 94680452;
                                        } else {
                                            iM2765 = (C0619.m2761("ܽۤ") + i50) * (-71);
                                            i51 = ((iM2765 ^ i49) * (-31171)) ^ 518003571;
                                            i52 = -388643676;
                                        }
                                        break;
                                }
                            }
                        }

                        /* JADX WARN: Code duplicated, block: B:36:0x00cf  */
                        /* JADX WARN: Code duplicated, block: B:44:0x011b A[PHI: r14
                          0x011b: PHI (r14v2 int) = (r14v1 int), (r14v1 int), (r14v3 int) binds: [B:43:0x0119, B:39:0x00ff, B:27:0x0091] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:48:0x0149  */
                        /* JADX WARN: Code duplicated, block: B:52:0x017d  */
                        /* JADX WARN: Code duplicated, block: B:57:0x01c3 A[PHI: r10 r11 r13
                          0x01c3: PHI (r10v5 l.ۢ۬֫) = (r10v3 l.ۢ۬֫), (r10v3 l.ۢ۬֫), (r10v4 l.ۢ۬֫), (r10v3 l.ۢ۬֫), (r10v3 l.ۢ۬֫) binds: [B:56:0x01c1, B:31:0x00b2, B:23:0x0070, B:12:0x0046, B:6:0x0034] A[DONT_GENERATE, DONT_INLINE]
                          0x01c3: PHI (r11v3 float) = (r11v1 float), (r11v1 float), (r11v2 float), (r11v1 float), (r11v1 float) binds: [B:56:0x01c1, B:31:0x00b2, B:23:0x0070, B:12:0x0046, B:6:0x0034] A[DONT_GENERATE, DONT_INLINE]
                          0x01c3: PHI (r13v3 int) = (r13v1 int), (r13v2 int), (r13v1 int), (r13v1 int), (r13v1 int) binds: [B:56:0x01c1, B:31:0x00b2, B:23:0x0070, B:12:0x0046, B:6:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            int iM31614;
                            int i48;
                            int i49 = 1990921396;
                            int i50 = C2375.f7641;
                            int i51 = RunnableC0334.f1808;
                            int iM31615 = (C0773.m3169("ۙۢ") + i50) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                            int i52 = ((iM31615 ^ i51) * 30879) ^ 1160111606;
                            int i53 = iM31615 ^ 1229366756;
                            C10139 c10139 = null;
                            float f12 = 0.0f;
                            int i54 = 0;
                            int i55 = 0;
                            while (true) {
                                i49 = i53 ^ ((((i49 ^ i51) * (-16411)) >> 31) & i52);
                                switch (i49) {
                                    case -2143539753:
                                    case -1500629981:
                                        c10139 = this.f11103;
                                        f12 = f7;
                                        if (C23916.f77426 <= 0) {
                                            iM31614 = C0619.m2761("֡۟") ^ i51;
                                            i52 = ((iM31614 ^ i50) * (-23179)) ^ (-1697127441);
                                            i48 = 1677176928;
                                        } else {
                                            iM31614 = (C0773.m3169("᩹ۜ") ^ i51) * 119;
                                            i52 = ((iM31614 ^ i50) * (-4779)) ^ (-522668544);
                                            i48 = -123156517;
                                        }
                                        i53 = iM31614 ^ i48;
                                        break;
                                    case -2128902590:
                                    case 1833399995:
                                        if (C3690.f12684 <= 0) {
                                            iM31614 = (C0619.m2761("᩻۠") + i51) * 127;
                                            i52 = ((iM31614 ^ i50) * (-29085)) ^ 657488719;
                                            i48 = -1680817312;
                                        } else {
                                            iM31614 = (C0619.m2761("۫ۛ") + i50) * (-71);
                                            i52 = ((iM31614 ^ i51) * 20959) ^ 718918776;
                                            i48 = -1756982278;
                                        }
                                        i53 = iM31614 ^ i48;
                                        break;
                                    case -1650505117:
                                    case -1376805478:
                                        C4238.m13540();
                                        C17202.m40372();
                                        break;
                                    case -1587231596:
                                    case -1375659777:
                                        if (C2702.f8586 <= 0) {
                                            iM31614 = C0773.m3169("ۜܽ") ^ i51;
                                            i52 = ((iM31614 ^ i50) * 21501) ^ (-404537549);
                                            i48 = 819264203;
                                        } else {
                                            iM31614 = C0619.m2761("ᩳ᩻") ^ i50;
                                            i52 = ((iM31614 ^ i51) * (-20051)) ^ 1905984983;
                                            i48 = -2099940810;
                                        }
                                        i53 = iM31614 ^ i48;
                                        break;
                                    case -1467771091:
                                    case 90955749:
                                        C2485.m8357();
                                        if (C1343.f4799 != 0) {
                                            iM31614 = (C0619.m2761("᩻۠") + i51) * 127;
                                            i52 = ((iM31614 ^ i50) * (-29085)) ^ 657488719;
                                            i48 = -1680817312;
                                        } else {
                                            iM31614 = (i50 - C0773.m3169("᩺᩻")) * 5;
                                            i52 = ((iM31614 ^ i51) * 9789) ^ (-937305268);
                                            i48 = 859579668;
                                        }
                                        i53 = iM31614 ^ i48;
                                        break;
                                    case -707443783:
                                    case 1519685732:
                                        if (C0950.m3785() != 0) {
                                            iM31614 = (i50 - C0773.m3169("᩺᩻")) * 5;
                                            i52 = ((iM31614 ^ i51) * 9789) ^ (-937305268);
                                            i48 = 859579668;
                                        } else {
                                            iM31614 = (i51 - C0773.m3169("᩷ᩳ")) * 65;
                                            i52 = ((iM31614 ^ i50) * 31499) ^ (-855387442);
                                            i48 = -1129607423;
                                        }
                                        i53 = iM31614 ^ i48;
                                        break;
                                    case -608385770:
                                    case 1447623665:
                                        C3099.m10095();
                                        if (C2310.f7472 >= 0) {
                                            iM31614 = (C0619.m2761("۠֫") + i50) * (-69);
                                            i52 = ((iM31614 ^ i51) * 10823) ^ (-1333335412);
                                            i48 = -769089738;
                                        } else {
                                            iM31614 = (C0619.m2761("᩻۠") + i51) * 127;
                                            i52 = ((iM31614 ^ i50) * (-29085)) ^ 657488719;
                                            i48 = -1680817312;
                                        }
                                        i53 = iM31614 ^ i48;
                                        break;
                                    case -295149688:
                                    case 819197492:
                                        i55 = i;
                                        if (C2354.m7983()) {
                                            iM31614 = (C0773.m3169("ܿܿ") ^ i50) * (-109);
                                            i52 = ((iM31614 ^ i51) * 1531) ^ (-1204796568);
                                            i48 = -1681460232;
                                        } else {
                                            iM31614 = C0773.m3169("ۜܽ") ^ i51;
                                            i52 = ((iM31614 ^ i50) * 21501) ^ (-404537549);
                                            i48 = 819264203;
                                        }
                                        i53 = iM31614 ^ i48;
                                        break;
                                    case -226965890:
                                    case 35090831:
                                        C10139.m26168(c10139, f12, f11, i54, i55, valueAnimator);
                                        break;
                                    case -167204825:
                                    case 1650574838:
                                        if (C20932.f66974 <= 0) {
                                            iM31614 = C0773.m3169("ۜܽ") ^ i51;
                                            i52 = ((iM31614 ^ i50) * 21501) ^ (-404537549);
                                            i48 = 819264203;
                                        } else {
                                            iM31614 = C0773.m3169("ܿܰ") ^ i51;
                                            i52 = ((iM31614 ^ i50) * 8781) ^ 1933821186;
                                            i48 = -1264279716;
                                        }
                                        i53 = iM31614 ^ i48;
                                        break;
                                    case 21095099:
                                    case 682151025:
                                        i54 = i47;
                                        if (C2702.m8876()) {
                                            iM31614 = C0773.m3169("ܳ᩷") ^ i51;
                                            i52 = ((iM31614 ^ i50) * 16831) ^ 1352656338;
                                            i48 = -606643997;
                                        } else {
                                            iM31614 = C0619.m2761("֡۟") ^ i51;
                                            i52 = ((iM31614 ^ i50) * (-23179)) ^ (-1697127441);
                                            i48 = 1677176928;
                                        }
                                        i53 = iM31614 ^ i48;
                                        break;
                                    case 407053234:
                                    case 719163346:
                                        if (AbstractC3624.f12429 <= 0) {
                                            iM31614 = (C0619.m2761("۠֫") + i50) * (-69);
                                            i52 = ((iM31614 ^ i51) * 10823) ^ (-1333335412);
                                            i48 = -769089738;
                                        } else {
                                            iM31614 = (C0619.m2761("ᩴۚ") + i50) * (-57);
                                            i52 = ((iM31614 ^ i51) * 3031) ^ (-1483533551);
                                            i48 = 1471793958;
                                        }
                                        i53 = iM31614 ^ i48;
                                        break;
                                    case 646064220:
                                    case 806013964:
                                        C2287.m7745();
                                        RunnableC1848.m6360();
                                        iM31614 = (C0619.m2761("۠֫") + i50) * (-69);
                                        i52 = ((iM31614 ^ i51) * 10823) ^ (-1333335412);
                                        i48 = -769089738;
                                        i53 = iM31614 ^ i48;
                                        break;
                                    case 985478979:
                                    case 1960666742:
                                        if (C2878.f9462) {
                                            iM31614 = C0619.m2761("֡۟") ^ i51;
                                            i52 = ((iM31614 ^ i50) * (-23179)) ^ (-1697127441);
                                            i48 = 1677176928;
                                        } else {
                                            iM31614 = C0773.m3169("᩷֫") ^ i50;
                                            i52 = ((iM31614 ^ i51) * 549) ^ 1489459502;
                                            i48 = -852604610;
                                        }
                                        i53 = iM31614 ^ i48;
                                        break;
                                    case 1966052731:
                                    case 2071232268:
                                        C3099.m10095();
                                        if (C2310.f7472 < 0) {
                                            iM31614 = (C0619.m2761("۠֫") + i50) * (-69);
                                            i52 = ((iM31614 ^ i51) * 10823) ^ (-1333335412);
                                            i48 = -769089738;
                                        } else {
                                            iM31614 = C0619.m2761("֡۟") ^ i51;
                                            i52 = ((iM31614 ^ i50) * (-23179)) ^ (-1697127441);
                                            i48 = 1677176928;
                                        }
                                        i53 = iM31614 ^ i48;
                                        break;
                                    default:
                                        if (C3734.f12817 >= 0) {
                                            iM31614 = C0619.m2761("֡۟") ^ i51;
                                            i52 = ((iM31614 ^ i50) * (-23179)) ^ (-1697127441);
                                            i48 = 1677176928;
                                        } else {
                                            iM31614 = C0773.m3169("᩹᩺") ^ i51;
                                            i52 = ((iM31614 ^ i50) * 11311) ^ 1346046308;
                                            i48 = -529927593;
                                        }
                                        i53 = iM31614 ^ i48;
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    valueAnimatorOfFloat.addListener(new C24312(i2, this, str, z, z4));
                    valueAnimatorOfFloat.start();
                    break;
                case -1336114404:
                case 169619800:
                    f2 = f8;
                    i30 = i30;
                    z4 = z4;
                    i33 = i33;
                    i35 = i35;
                    f = fM26159;
                    iAbs = iAbs;
                    view = view3;
                    i31 = i31;
                    f7 = f7;
                    if (C2354.f7599 >= 0) {
                        iM2762 = (i27 - C0619.m2761("᩺۬")) * (-61);
                        i9 = ((iM2762 ^ i26) * 8549) ^ (-1645746898);
                        i10 = -230535469;
                    } else {
                        iM2762 = (i26 - C0619.m2761("֨֡")) * (-51);
                        i9 = ((iM2762 ^ i27) * (-18579)) ^ 558057037;
                        i10 = 1877163230;
                    }
                    i11 = iM2762 ^ i10;
                    view3 = view;
                    fM26159 = f;
                    f8 = f2;
                    i33 = i33;
                    z4 = z4;
                    i12 = i30;
                    i29 = i11;
                    i28 = i9;
                    f7 = f7;
                    i31 = i31;
                    iAbs = iAbs;
                    i35 = i35;
                    i30 = i12;
                    break;
                case -1244570531:
                case 513467583:
                    i5 = i30;
                    z4 = z4;
                    i8 = i35;
                    fAbs = Math.abs(f8 - f7);
                    iAbs = Math.abs(i - marginStart);
                    if (C0487.m2356() >= 0) {
                        iM31612 = C0619.m2761("ۧ۠") ^ i27;
                        i24 = ((iM31612 ^ i26) * (-20891)) ^ 650872100;
                        i25 = -1087012224;
                    } else {
                        iM31612 = (C0773.m3169("ۖۧ") + i27) * (-99);
                        i24 = ((iM31612 ^ i26) * (-16361)) ^ 194864861;
                        i25 = 1973033154;
                    }
                    int i312 = iM31612 ^ i25;
                    i35 = i8;
                    i30 = i5;
                    i29 = i312;
                    i28 = i24;
                    z4 = z4;
                    break;
                case -1087857542:
                case 439638123:
                    i30 = i30;
                    z4 = z4;
                    i35 = i35;
                    i33 = i33;
                    C13473.m33140(this.f32441, i33);
                    iM2761 = (i26 - C0773.m3169("ۧ֨")) * (-79);
                    f = fM26159;
                    i3 = ((iM2761 ^ i27) * (-22623)) ^ 93439148;
                    i4 = 2070682350;
                    int i48 = iM2761 ^ i4;
                    i35 = i35;
                    i30 = i30;
                    i29 = i48;
                    i28 = i3;
                    fM26159 = f;
                    i33 = i33;
                    z4 = z4;
                    break;
                case -997934254:
                case 1390299197:
                    i30 = 8;
                    iM2763 = C0773.m3169("᩹᩹") ^ i27;
                    i14 = ((iM2763 ^ i26) * (-20831)) ^ (-182035746);
                    i15 = 462219456;
                    i29 = iM2763 ^ i15;
                    i28 = i14;
                    break;
                case -971194643:
                case 1219685323:
                    i30 = i30;
                    z4 = z4;
                    int i49 = i32;
                    i33 = i33;
                    i35 = i35;
                    f = fM26159;
                    webView = webView2;
                    webView.setImportantForAccessibility(i49);
                    if (z2) {
                        int iM31614 = (C0773.m3169("ۜۙ") ^ i27) * 95;
                        i32 = i49;
                        i28 = ((iM31614 ^ i26) * 5807) ^ (-635628233);
                        i35 = i35;
                        i30 = i30;
                        i29 = iM31614 ^ (-270903460);
                        webView2 = webView;
                    } else {
                        i32 = i49;
                        iM2761 = C0619.m2761("ܰᩳ") ^ i26;
                        webView2 = webView;
                        i3 = ((iM2761 ^ i27) * (-24883)) ^ (-1460529426);
                        i4 = -345831756;
                        int i410 = iM2761 ^ i4;
                        i35 = i35;
                        i30 = i30;
                        i29 = i410;
                        i28 = i3;
                    }
                    fM26159 = f;
                    i33 = i33;
                    z4 = z4;
                    break;
                case -900682622:
                case 2137691143:
                    C13473.m33140(view4, i30);
                    f5 = f8;
                    i21 = i30;
                    z4 = z4;
                    i33 = i33;
                    f = fM26159;
                    i23 = i35;
                    i20 = iAbs;
                    i22 = i31;
                    f6 = f7;
                    int iM31615 = C0773.m3169("ۡܿ") ^ i27;
                    i30 = i21;
                    f8 = f5;
                    i29 = iM31615 ^ 1273075029;
                    i28 = ((iM31615 ^ i26) * 10463) ^ (-2027892643);
                    f7 = f6;
                    i31 = i22;
                    iAbs = i20;
                    i35 = i23;
                    fM26159 = f;
                    i33 = i33;
                    z4 = z4;
                    break;
                case -681921246:
                case 1429111367:
                    i30 = i30;
                    z4 = z4;
                    i33 = i33;
                    i35 = i35;
                    f = fM26159;
                    if (marginStart == i) {
                        webView = webView2;
                        iM2761 = C0619.m2761("ܰᩳ") ^ i26;
                        webView2 = webView;
                        i3 = ((iM2761 ^ i27) * (-24883)) ^ (-1460529426);
                        i4 = -345831756;
                    } else {
                        iM2761 = (C0619.m2761("᩸۬") + i26) * (-55);
                        i3 = ((iM2761 ^ i27) * (-17239)) ^ (-1334051577);
                        i4 = -499210126;
                    }
                    int i411 = iM2761 ^ i4;
                    i35 = i35;
                    i30 = i30;
                    i29 = i411;
                    i28 = i3;
                    fM26159 = f;
                    i33 = i33;
                    z4 = z4;
                    break;
                case -633217977:
                case 36080376:
                    i30 = i30;
                    z4 = z4;
                    i33 = i33;
                    i35 = i35;
                    f = fM26159;
                    if (!this.f32467) {
                        iM2761 = C0619.m2761("ۘ֡") ^ i26;
                        i3 = ((iM2761 ^ i27) * 1207) ^ 83633485;
                        i4 = -1240223073;
                        int i412 = iM2761 ^ i4;
                        i35 = i35;
                        i30 = i30;
                        i29 = i412;
                        i28 = i3;
                        fM26159 = f;
                        i33 = i33;
                        z4 = z4;
                    } else {
                        iAbs = iAbs;
                        f2 = f8;
                        view = view3;
                        i31 = i31;
                        f7 = f7;
                        i32 = i33;
                        iM2762 = C0773.m3169("֡᩻") ^ i27;
                        i9 = ((iM2762 ^ i26) * 28109) ^ 1748511947;
                        i10 = -1560721936;
                        i11 = iM2762 ^ i10;
                        view3 = view;
                        fM26159 = f;
                        f8 = f2;
                        i33 = i33;
                        z4 = z4;
                        i12 = i30;
                        i29 = i11;
                        i28 = i9;
                        f7 = f7;
                        i31 = i31;
                        iAbs = iAbs;
                        i35 = i35;
                        i30 = i12;
                    }
                    break;
                case -631507512:
                case 559425935:
                    C2966.m9664();
                    if (C11235.f35427 < 0) {
                        iM2763 = C0619.m2761("᩷ۢ") ^ i27;
                        i14 = ((iM2763 ^ i26) * (-7629)) ^ (-1755292700);
                        i15 = 832712181;
                        i29 = iM2763 ^ i15;
                        i28 = i14;
                    } else {
                        i5 = i30;
                        z4 = z4;
                        i8 = i35;
                        iM31612 = C0619.m2761("᩷ۡ") ^ i27;
                        i24 = ((iM31612 ^ i26) * (-22833)) ^ 882764615;
                        i25 = 1363709617;
                        int i313 = iM31612 ^ i25;
                        i35 = i8;
                        i30 = i5;
                        i29 = i313;
                        i28 = i24;
                        z4 = z4;
                    }
                    break;
                case -607097410:
                case -147103792:
                    C0950.m3785();
                    if (C3690.f12684 > 0) {
                        iM2763 = (C0773.m3169("ܿۧ") ^ i27) * (-59);
                        i14 = ((iM2763 ^ i26) * (-21217)) ^ 1470862450;
                        i15 = 935887726;
                        i29 = iM2763 ^ i15;
                        i28 = i14;
                    } else {
                        f2 = f8;
                        i30 = i30;
                        z4 = z4;
                        i33 = i33;
                        i35 = i35;
                        f = fM26159;
                        iAbs = iAbs;
                        view = view3;
                        i31 = i31;
                        f7 = f7;
                        iM2762 = C0619.m2761("ܳ֫") ^ i26;
                        i9 = ((iM2762 ^ i27) * 16393) ^ (-1509512996);
                        i10 = -1841957204;
                        i11 = iM2762 ^ i10;
                        view3 = view;
                        fM26159 = f;
                        f8 = f2;
                        i33 = i33;
                        z4 = z4;
                        i12 = i30;
                        i29 = i11;
                        i28 = i9;
                        f7 = f7;
                        i31 = i31;
                        iAbs = iAbs;
                        i35 = i35;
                        i30 = i12;
                    }
                    break;
                case -598598427:
                case 339400711:
                    if (z) {
                        iM2763 = (i26 - C0773.m3169("۟ܿ")) * 43;
                        i14 = ((iM2763 ^ i27) * (-8843)) ^ (-1461216896);
                        i15 = -2124694173;
                    } else {
                        iM2763 = C0773.m3169("ᩳۗ") ^ i26;
                        i14 = ((iM2763 ^ i27) * 725) ^ (-1988648547);
                        i15 = 858305244;
                    }
                    i29 = iM2763 ^ i15;
                    i28 = i14;
                    break;
                case -580595183:
                case -426017163:
                    i30 = i30;
                    z4 = z4;
                    i33 = i33;
                    i35 = i35;
                    f = fM26159;
                    int iM26159 = m26159(i35);
                    i13 = i31;
                    f7 = f7;
                    int iM261510 = m26159(i13);
                    iAbs = iAbs;
                    int iM2766 = C0619.m2766(this.f32446);
                    f3 = 0.0f;
                    if (AbstractC3624.m11755() != 0) {
                        f2 = f8;
                        i31 = i13;
                        view = view3;
                        f9 = 0.0f;
                        iM2762 = C0773.m3169("᩸ܽ") ^ i26;
                        i9 = ((iM2762 ^ i27) * (-19359)) ^ 742629233;
                        i10 = 1363521383;
                        i11 = iM2762 ^ i10;
                        view3 = view;
                        fM26159 = f;
                        f8 = f2;
                        i33 = i33;
                        z4 = z4;
                        i12 = i30;
                        i29 = i11;
                        i28 = i9;
                        f7 = f7;
                        i31 = i31;
                        iAbs = iAbs;
                        i35 = i35;
                        i30 = i12;
                    } else {
                        f4 = f8;
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C23916.m53427(iM26159, C2288.m7764(iM261510, iM2766 - m26159(48))), -1, this.f32467 ? 3 : 5);
                        view2 = view3;
                        view2.setLayoutParams(layoutParams);
                        if (z) {
                            int iM31616 = C0773.m3169("᩺ܿ") ^ i26;
                            view3 = view2;
                            fM26159 = f;
                            iAbs = iAbs;
                            f8 = f4;
                            i35 = i35;
                            i33 = i33;
                            z4 = z4;
                            i30 = i30;
                            i29 = iM31616 ^ 1381598162;
                            i28 = ((iM31616 ^ i27) * 9425) ^ 963520687;
                            f7 = f7;
                            i31 = i13;
                            f9 = f3;
                        } else {
                            int iM31617 = C0773.m3169("ܽۤ") ^ i27;
                            view3 = view2;
                            fM26159 = f;
                            iAbs = iAbs;
                            f8 = f4;
                            i35 = i35;
                            i33 = i33;
                            z4 = z4;
                            i30 = i30;
                            i29 = iM31617 ^ 742349676;
                            i28 = ((iM31617 ^ i26) * 9713) ^ 184892991;
                            f7 = f7;
                            i31 = i13;
                            f9 = 0.0f;
                        }
                    }
                    break;
                case -543278620:
                case 900630044:
                    C1519.m5403();
                    break;
                case -410089319:
                case 1784832453:
                    f8 = 1.0f;
                    int iM31618 = (C0773.m3169("ۡܳ") ^ i26) * 55;
                    i9 = ((iM31618 ^ i27) * 1455) ^ 445302574;
                    i11 = iM31618 ^ (-962840302);
                    view3 = view3;
                    fM26159 = fM26159;
                    i33 = i33;
                    z4 = z4;
                    i12 = i30;
                    i29 = i11;
                    i28 = i9;
                    f7 = f7;
                    i31 = i31;
                    iAbs = iAbs;
                    i35 = i35;
                    i30 = i12;
                    break;
                case -302446990:
                case 2068148132:
                    if (f7 > f9) {
                        iM2763 = (i26 - C0773.m3169("۟ܿ")) * 43;
                        i14 = ((iM2763 ^ i27) * (-8843)) ^ (-1461216896);
                        i15 = -2124694173;
                    } else {
                        iM2763 = (C0773.m3169("۠᩻") + i27) * 59;
                        i14 = ((iM2763 ^ i26) * 25) ^ 2089638741;
                        i15 = -2054253148;
                    }
                    i29 = iM2763 ^ i15;
                    i28 = i14;
                    break;
                case -223655246:
                case -46853930:
                    i20 = iAbs;
                    f5 = f8;
                    i21 = i30;
                    z4 = z4;
                    i22 = i31;
                    i33 = i33;
                    f = fM26159;
                    f6 = f7;
                    View view6 = this.f32441;
                    i23 = 280;
                    if (view6 != null) {
                        int iM2765 = C0619.m2761("ۧܶ") ^ i26;
                        view3 = view6;
                        i28 = ((iM2765 ^ i27) * 16429) ^ (-1389230848);
                        fM26159 = f;
                        i30 = i21;
                        f8 = f5;
                        i29 = iM2765 ^ (-1794447230);
                        i33 = i33;
                        z4 = z4;
                        f7 = f6;
                        i31 = i22;
                        iAbs = i20;
                        i35 = 280;
                    } else {
                        view3 = view6;
                        int iM31619 = C0773.m3169("ۡܿ") ^ i27;
                        i30 = i21;
                        f8 = f5;
                        i29 = iM31619 ^ 1273075029;
                        i28 = ((iM31619 ^ i26) * 10463) ^ (-2027892643);
                        f7 = f6;
                        i31 = i22;
                        iAbs = i20;
                        i35 = i23;
                        fM26159 = f;
                        i33 = i33;
                        z4 = z4;
                    }
                    break;
                case -115518727:
                case -25326358:
                    i30 = i30;
                    z4 = z4;
                    i33 = i33;
                    i35 = i35;
                    f = fM26159;
                    iAbs = iAbs;
                    f2 = f8;
                    view = view3;
                    i31 = i31;
                    i32 = 4;
                    f7 = f7;
                    iM2762 = C0773.m3169("֡᩻") ^ i27;
                    i9 = ((iM2762 ^ i26) * 28109) ^ 1748511947;
                    i10 = -1560721936;
                    i11 = iM2762 ^ i10;
                    view3 = view;
                    fM26159 = f;
                    f8 = f2;
                    i33 = i33;
                    z4 = z4;
                    i12 = i30;
                    i29 = i11;
                    i28 = i9;
                    f7 = f7;
                    i31 = i31;
                    iAbs = iAbs;
                    i35 = i35;
                    i30 = i12;
                    break;
                case 73766284:
                case 440154157:
                    C0487.m2356();
                    i5 = i30;
                    z4 = z4;
                    i8 = i35;
                    iM31612 = C0619.m2761("᩷ۡ") ^ i27;
                    i24 = ((iM31612 ^ i26) * (-22833)) ^ 882764615;
                    i25 = 1363709617;
                    int i314 = iM31612 ^ i25;
                    i35 = i8;
                    i30 = i5;
                    i29 = i314;
                    i28 = i24;
                    z4 = z4;
                    break;
                case 130201781:
                case 1228070992:
                    float f12 = fM26159;
                    float f13 = f7;
                    int i50 = i30;
                    boolean z6 = z4;
                    View view7 = view3;
                    int i51 = i35;
                    int i52 = iAbs;
                    WebView webView3 = this.f32482;
                    marginStart = ((FrameLayout.LayoutParams) C3779.m12257(webView3)).getMarginStart();
                    if (marginStart != i) {
                        iM31611 = (i27 - C0619.m2761("ܶܺ")) * 49;
                        i18 = ((iM31611 ^ i26) * (-19047)) ^ (-99493189);
                        i19 = -603704225;
                    } else {
                        iM31611 = (C0773.m3169("ۙۛ") + i26) * (-113);
                        i18 = ((iM31611 ^ i27) * 32683) ^ 746510609;
                        i19 = 1327940337;
                    }
                    int i53 = iM31611 ^ i19;
                    webView2 = webView3;
                    view3 = view7;
                    i28 = i18;
                    z4 = z6;
                    f7 = f13;
                    fM26159 = f12;
                    iAbs = i52;
                    i31 = 1;
                    i33 = 0;
                    i35 = i51;
                    i30 = i50;
                    i29 = i53;
                    f8 = f8;
                    break;
                case 232001201:
                case 422081310:
                    if (C23916.f77426 > 0) {
                        f2 = f8;
                        i30 = i30;
                        z4 = z4;
                        i33 = i33;
                        i35 = i35;
                        f = fM26159;
                        iAbs = iAbs;
                        view = view3;
                        i31 = i31;
                        f7 = f7;
                        iM2762 = (i27 - C0619.m2761("᩺۬")) * (-61);
                        i9 = ((iM2762 ^ i26) * 8549) ^ (-1645746898);
                        i10 = -230535469;
                        i11 = iM2762 ^ i10;
                        view3 = view;
                        fM26159 = f;
                        f8 = f2;
                        i33 = i33;
                        z4 = z4;
                        i12 = i30;
                        i29 = i11;
                        i28 = i9;
                        f7 = f7;
                        i31 = i31;
                        iAbs = iAbs;
                        i35 = i35;
                        i30 = i12;
                    } else {
                        i5 = i30;
                        z4 = z4;
                        i8 = i35;
                        iM31612 = C0619.m2761("᩷ۡ") ^ i27;
                        i24 = ((iM31612 ^ i26) * (-22833)) ^ 882764615;
                        i25 = 1363709617;
                        int i315 = iM31612 ^ i25;
                        i35 = i8;
                        i30 = i5;
                        i29 = i315;
                        i28 = i24;
                        z4 = z4;
                    }
                    break;
                case 246640872:
                case 1436954221:
                    valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
                    if (!C2023.f6737) {
                        iM2763 = (C0619.m2761("ۗܽ") + i26) * 31;
                        i14 = ((iM2763 ^ i27) * (-4583)) ^ (-1442598704);
                        i15 = -830806295;
                        i29 = iM2763 ^ i15;
                        i28 = i14;
                    } else {
                        i5 = i30;
                        z4 = z4;
                        iM3169 = C0773.m3169("ۗ۫") ^ i26;
                        i6 = ((iM3169 ^ i27) * (-4569)) ^ 938261433;
                        i7 = 1048285056;
                        int i413 = iM3169 ^ i7;
                        z4 = z4;
                        i12 = i5;
                        i29 = i413;
                        i28 = i6;
                        i30 = i12;
                    }
                    break;
                case 292011661:
                case 1430529369:
                    RunnableC3055.m9933();
                    if (C3033.f9831 < 0) {
                        iM2763 = (i26 - C0619.m2761("ۚ۫")) * 13;
                        i14 = ((iM2763 ^ i27) * (-25287)) ^ 1554707777;
                        i15 = 1201438064;
                        i29 = iM2763 ^ i15;
                        i28 = i14;
                    } else {
                        i5 = i30;
                        z4 = z4;
                        i8 = i35;
                        iM31612 = C0619.m2761("᩷ۡ") ^ i27;
                        i24 = ((iM31612 ^ i26) * (-22833)) ^ 882764615;
                        i25 = 1363709617;
                        int i316 = iM31612 ^ i25;
                        i35 = i8;
                        i30 = i5;
                        i29 = i316;
                        i28 = i24;
                        z4 = z4;
                    }
                    break;
                case 292966282:
                case 898107659:
                    f8 = 0.0f;
                    int iM316110 = (C0773.m3169("ۡܳ") ^ i26) * 55;
                    i9 = ((iM316110 ^ i27) * 1455) ^ 445302574;
                    i11 = iM316110 ^ (-962840302);
                    view3 = view3;
                    fM26159 = fM26159;
                    i33 = i33;
                    z4 = z4;
                    i12 = i30;
                    i29 = i11;
                    i28 = i9;
                    f7 = f7;
                    i31 = i31;
                    iAbs = iAbs;
                    i35 = i35;
                    i30 = i12;
                    break;
                case 513934453:
                case 1957157508:
                    i30 = i30;
                    z4 = z4;
                    i33 = i33;
                    i35 = i35;
                    f = fM26159;
                    if (Math.abs(f7 - f8) < 0.001f) {
                        iM2761 = C0773.m3169("ۢۗ") ^ i27;
                        i3 = ((iM2761 ^ i26) * (-26469)) ^ (-21668353);
                        i4 = -1279304976;
                    } else {
                        iM2761 = (C0619.m2761("᩸۬") + i26) * (-55);
                        i3 = ((iM2761 ^ i27) * (-17239)) ^ (-1334051577);
                        i4 = -499210126;
                    }
                    int i414 = iM2761 ^ i4;
                    i35 = i35;
                    i30 = i30;
                    i29 = i414;
                    i28 = i3;
                    fM26159 = f;
                    i33 = i33;
                    z4 = z4;
                    break;
                case 645963541:
                case 1233927923:
                    z3 = false;
                    int iM316111 = C0773.m3169("ۙۧ") ^ i26;
                    view3 = view3;
                    fM26159 = fM26159;
                    i33 = i33;
                    z4 = z3;
                    i28 = ((iM316111 ^ i27) * 9381) ^ 1280520205;
                    f8 = f8;
                    i12 = i30;
                    i29 = iM316111 ^ (-1161464288);
                    f7 = f7;
                    i31 = i31;
                    iAbs = iAbs;
                    i35 = i35;
                    i30 = i12;
                    break;
                case 776293034:
                case 788822732:
                    f2 = f8;
                    i30 = i30;
                    z4 = z4;
                    i33 = i33;
                    i35 = i35;
                    f = fM26159;
                    iAbs = iAbs;
                    view = view3;
                    i31 = i31;
                    f7 = f7;
                    if (z) {
                        iM2762 = C0773.m3169("۠᩺") ^ i27;
                        i9 = ((iM2762 ^ i26) * 18471) ^ 711144664;
                        i10 = -1096548294;
                    } else {
                        i32 = i33;
                        iM2762 = C0773.m3169("֡᩻") ^ i27;
                        i9 = ((iM2762 ^ i26) * 28109) ^ 1748511947;
                        i10 = -1560721936;
                    }
                    i11 = iM2762 ^ i10;
                    view3 = view;
                    fM26159 = f;
                    f8 = f2;
                    i33 = i33;
                    z4 = z4;
                    i12 = i30;
                    i29 = i11;
                    i28 = i9;
                    f7 = f7;
                    i31 = i31;
                    iAbs = iAbs;
                    i35 = i35;
                    i30 = i12;
                    break;
                case 1138747352:
                case 1981133512:
                    C2310.m7813();
                    if (C2966.f9654 >= 0) {
                        i5 = i30;
                        z4 = z4;
                        i8 = i35;
                        iM31612 = (i26 - C0773.m3169("᩶۫")) * 99;
                        i24 = ((iM31612 ^ i27) * 2711) ^ (-1957685740);
                        i25 = -1621426855;
                        int i317 = iM31612 ^ i25;
                        i35 = i8;
                        i30 = i5;
                        i29 = i317;
                        i28 = i24;
                        z4 = z4;
                    } else {
                        f2 = f8;
                        i30 = i30;
                        z4 = z4;
                        i33 = i33;
                        i35 = i35;
                        f = fM26159;
                        iAbs = iAbs;
                        view = view3;
                        i31 = i31;
                        f7 = f7;
                        iM2762 = C0619.m2761("ܳ֫") ^ i26;
                        i9 = ((iM2762 ^ i27) * 16393) ^ (-1509512996);
                        i10 = -1841957204;
                        i11 = iM2762 ^ i10;
                        view3 = view;
                        fM26159 = f;
                        f8 = f2;
                        i33 = i33;
                        z4 = z4;
                        i12 = i30;
                        i29 = i11;
                        i28 = i9;
                        f7 = f7;
                        i31 = i31;
                        iAbs = iAbs;
                        i35 = i35;
                        i30 = i12;
                    }
                    break;
                case 1222283212:
                case 1320261807:
                    i30 = i30;
                    z4 = z4;
                    i35 = i35;
                    if (f7 <= f9) {
                        i33 = i33;
                        iM2761 = (i26 - C0773.m3169("ۧ֨")) * (-79);
                        f = fM26159;
                        i3 = ((iM2761 ^ i27) * (-22623)) ^ 93439148;
                        i4 = 2070682350;
                        int i415 = iM2761 ^ i4;
                        i35 = i35;
                        i30 = i30;
                        i29 = i415;
                        i28 = i3;
                        fM26159 = f;
                        i33 = i33;
                        z4 = z4;
                    } else {
                        iAbs = iAbs;
                        f4 = f8;
                        f3 = f9;
                        i13 = i31;
                        i33 = i33;
                        f = fM26159;
                        f7 = f7;
                        view2 = view3;
                        int iM316112 = C0773.m3169("᩺ܿ") ^ i26;
                        view3 = view2;
                        fM26159 = f;
                        iAbs = iAbs;
                        f8 = f4;
                        i35 = i35;
                        i33 = i33;
                        z4 = z4;
                        i30 = i30;
                        i29 = iM316112 ^ 1381598162;
                        i28 = ((iM316112 ^ i27) * 9425) ^ 963520687;
                        f7 = f7;
                        i31 = i13;
                        f9 = f3;
                    }
                    break;
                case 1870342140:
                case 2005276159:
                    i5 = i30;
                    z4 = z4;
                    valueAnimatorOfFloat.setDuration(C2288.m7764(1, Math.round(fMax)));
                    if (C3779.f12953 > 0) {
                        iM3169 = (C0773.m3169("ۤܳ") + i27) * 109;
                        i6 = ((iM3169 ^ i26) * (-1145)) ^ (-1437717301);
                        i7 = -79270506;
                        int i416 = iM3169 ^ i7;
                        z4 = z4;
                        i12 = i5;
                        i29 = i416;
                        i28 = i6;
                        i30 = i12;
                    } else {
                        i8 = i35;
                        iM31612 = C0619.m2761("ۧ۠") ^ i27;
                        i24 = ((iM31612 ^ i26) * (-20891)) ^ 650872100;
                        i25 = -1087012224;
                        int i318 = iM31612 ^ i25;
                        i35 = i8;
                        i30 = i5;
                        i29 = i318;
                        i28 = i24;
                        z4 = z4;
                    }
                    break;
                default:
                    f2 = f8;
                    i30 = i30;
                    z4 = z4;
                    i33 = i33;
                    i35 = i35;
                    f = fM26159;
                    iAbs = iAbs;
                    view = view3;
                    i31 = i31;
                    f7 = f7;
                    if (C2966.f9654 >= 0) {
                        iM2762 = C0619.m2761("ܳ֫") ^ i26;
                        i9 = ((iM2762 ^ i27) * 16393) ^ (-1509512996);
                        i10 = -1841957204;
                    } else {
                        iM2762 = C0773.m3169("ۛ᩶") ^ i26;
                        i9 = ((iM2762 ^ i27) * 2721) ^ (-1675235511);
                        i10 = -579976288;
                    }
                    i11 = iM2762 ^ i10;
                    view3 = view;
                    fM26159 = f;
                    f8 = f2;
                    i33 = i33;
                    z4 = z4;
                    i12 = i30;
                    i29 = i11;
                    i28 = i9;
                    f7 = f7;
                    i31 = i31;
                    iAbs = iAbs;
                    i35 = i35;
                    i30 = i12;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0147 A[PHI: r5 r7 r8 r12 r13 r14
      0x0147: PHI (r5v4 short[]) = (r5v3 short[]), (r5v2 short[]), (r5v2 short[]) binds: [B:25:0x00aa, B:9:0x0066, B:6:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x0147: PHI (r7v8 int) = (r7v3 int), (r7v2 int), (r7v2 int) binds: [B:25:0x00aa, B:9:0x0066, B:6:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x0147: PHI (r8v4 int) = (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:25:0x00aa, B:9:0x0066, B:6:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x0147: PHI (r12v2 short[]) = (r12v1 short[]), (r12v1 short[]), (r12v4 short[]) binds: [B:25:0x00aa, B:9:0x0066, B:6:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x0147: PHI (r13v2 int) = (r13v1 int), (r13v1 int), (r13v4 int) binds: [B:25:0x00aa, B:9:0x0066, B:6:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x0147: PHI (r14v2 int) = (r14v1 int), (r14v1 int), (r14v4 int) binds: [B:25:0x00aa, B:9:0x0066, B:6:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x029a A[PHI: r2 r9 r16 r17
      0x029a: PHI (r2v9 java.lang.String) = 
      (r2v2 java.lang.String)
      (r2v8 java.lang.String)
      (r2v1 java.lang.String)
      (r2v1 java.lang.String)
      (r2v1 java.lang.String)
     binds: [B:66:0x0298, B:45:0x01a7, B:91:0x029a, B:90:0x029a, B:9:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x029a: PHI (r9v4 java.lang.StringBuilder) = 
      (r9v2 java.lang.StringBuilder)
      (r9v3 java.lang.StringBuilder)
      (r9v2 java.lang.StringBuilder)
      (r9v2 java.lang.StringBuilder)
      (r9v2 java.lang.StringBuilder)
     binds: [B:66:0x0298, B:45:0x01a7, B:91:0x029a, B:90:0x029a, B:9:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x029a: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:66:0x0298, B:45:0x01a7, B:91:0x029a, B:90:0x029a, B:9:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x029a: PHI (r17v4 char) = (r17v3 char), (r17v2 char), (r17v2 char), (r17v2 char), (r17v2 char) binds: [B:66:0x0298, B:45:0x01a7, B:91:0x029a, B:90:0x029a, B:9:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private String m26161(String str) {
        int iM2761;
        int i;
        int i2;
        int iM3169;
        int i3;
        int i4;
        int i5;
        String strQuote = null;
        String str2 = null;
        short s = 0;
        int i6 = 0;
        short[] sArr = null;
        int i7 = 0;
        int i8 = 0;
        short[] sArr2 = null;
        int i9 = 465205549;
        int i10 = C23916.f77426;
        int i11 = C0487.f2131;
        int iM31610 = C0773.m3169("ܶۜ") ^ i10;
        int i12 = ((iM31610 ^ i11) * (-26161)) ^ 1128859894;
        int i13 = iM31610 ^ 1645744568;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        StringBuilder sb = null;
        char c = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        short s2 = 0;
        while (true) {
            i9 = i13 ^ (i12 & (((i9 ^ i11) * 11655) >> 31));
            switch (i9) {
                case -1943567872:
                case -1431017053:
                    strQuote = strQuote;
                    int i20 = s2 + s;
                    if ((i20 * i20) - i19 <= 0) {
                        iM2761 = (C0619.m2761("ۜۡ") ^ i10) * 87;
                        i = ((iM2761 ^ i11) * 28069) ^ 780443027;
                        i2 = 1205947794;
                    } else {
                        iM2761 = (i11 - C0773.m3169("ۙۘ")) * 67;
                        i = ((iM2761 ^ i10) * 30289) ^ 722153925;
                        i2 = 1554304210;
                    }
                    i5 = iM2761 ^ i2;
                    String str3 = strQuote;
                    i13 = i5;
                    i12 = i;
                    strQuote = str3;
                    break;
                case -1582973658:
                case 1492886600:
                    strQuote = strQuote;
                    sArr3 = f32436;
                    c = 20;
                    if (AbstractC0641.f2496 < 0) {
                        iM2761 = C0619.m2761("ۚ۠") ^ i10;
                        i = ((iM2761 ^ i11) * (-8041)) ^ 645718958;
                        i2 = 1832407923;
                        i5 = iM2761 ^ i2;
                        String str4 = strQuote;
                        i13 = i5;
                        i12 = i;
                        strQuote = str4;
                    } else {
                        strQuote = strQuote;
                        iM3169 = C0773.m3169("᩶֨") ^ i11;
                        i3 = ((iM3169 ^ i10) * 7441) ^ (-665586654);
                        i4 = 1469133911;
                        i13 = iM3169 ^ i4;
                        i12 = i3;
                    }
                    break;
                case -1517245031:
                case 1328646809:
                    String strM11252 = C3448.m11252(f32436, 21, 62, i6);
                    if (C1080.f3865 < 0) {
                        sb = new StringBuilder(strM11252);
                        strQuote = JSONObject.quote(this.f32478);
                        if (C0269.f1558 <= 0) {
                            iM3169 = C0773.m3169("᩶֨") ^ i11;
                            i3 = ((iM3169 ^ i10) * 7441) ^ (-665586654);
                            i4 = 1469133911;
                        } else {
                            iM3169 = (i11 - C0773.m3169("۠۠")) * (-91);
                            i3 = ((iM3169 ^ i10) * (-20469)) ^ 1625472793;
                            i4 = -453526313;
                        }
                        i13 = iM3169 ^ i4;
                        i12 = i3;
                    } else {
                        int iM31611 = C0773.m3169("֡ᩳ") ^ i10;
                        i = ((iM31611 ^ i11) * (-30101)) ^ (-244512983);
                        i5 = iM31611 ^ 1431903983;
                        sb = null;
                        String str5 = strQuote;
                        i13 = i5;
                        i12 = i;
                        strQuote = str5;
                    }
                    break;
                case -1277458938:
                case 773290000:
                    if (RunnableC3055.m9933() != 0) {
                        strQuote = strQuote;
                        iM2761 = C0773.m3169("ۘܽ") ^ i11;
                        i = ((iM2761 ^ i10) * (-2019)) ^ (-1561084980);
                        i2 = -823165898;
                        i5 = iM2761 ^ i2;
                        String str6 = strQuote;
                        i13 = i5;
                        i12 = i;
                        strQuote = str6;
                    } else {
                        iM3169 = C0773.m3169("᩶֨") ^ i11;
                        i3 = ((iM3169 ^ i10) * 7441) ^ (-665586654);
                        i4 = 1469133911;
                        i13 = iM3169 ^ i4;
                        i12 = i3;
                    }
                    break;
                case -1134887532:
                case 1250834039:
                    if (RunnableC3055.f9898 < 0) {
                        iM3169 = C0773.m3169("᩶֨") ^ i11;
                        i3 = ((iM3169 ^ i10) * 7441) ^ (-665586654);
                        i4 = 1469133911;
                    } else {
                        iM3169 = (i10 - C0619.m2761("ۘ֫")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i3 = ((iM3169 ^ i11) * (-30141)) ^ (-982548353);
                        i4 = -1791461635;
                    }
                    i13 = iM3169 ^ i4;
                    i12 = i3;
                    break;
                case -1005093514:
                case 1874494859:
                    RunnableC0334.m2063();
                    C3734.m12152();
                    return null;
                case -841137611:
                case 1152545767:
                    i6 = 20852;
                    iM2761 = C0773.m3169("ۛᩴ") ^ i10;
                    i = ((iM2761 ^ i11) * 5583) ^ 46493241;
                    i2 = -1619848970;
                    i5 = iM2761 ^ i2;
                    String str7 = strQuote;
                    i13 = i5;
                    i12 = i;
                    strQuote = str7;
                    break;
                case -643899317:
                case -397447656:
                    C2878.m9491();
                    if (C0269.m1775() <= 0) {
                        iM3169 = C0773.m3169("᩶֨") ^ i11;
                        i3 = ((iM3169 ^ i10) * 7441) ^ (-665586654);
                        i4 = 1469133911;
                        i13 = iM3169 ^ i4;
                        i12 = i3;
                    } else {
                        int iM31612 = C0773.m3169("֡ᩳ") ^ i10;
                        i = ((iM31612 ^ i11) * (-30101)) ^ (-244512983);
                        i5 = iM31612 ^ 1431903983;
                        sb = null;
                        String str8 = strQuote;
                        i13 = i5;
                        i12 = i;
                        strQuote = str8;
                    }
                    break;
                case -624688271:
                case 2041178909:
                    C3779.m12258(sb, C4238.m13530(sArr, i7, i8, i6));
                    str2 = this.f32456;
                    if (!C2702.m8876()) {
                        strQuote = strQuote;
                        iM2761 = (C0773.m3169("᩸ۧ") + i10) * 101;
                        i = ((iM2761 ^ i11) * 23741) ^ 1078233854;
                        i2 = -2136174227;
                        i5 = iM2761 ^ i2;
                        String str9 = strQuote;
                        i13 = i5;
                        i12 = i;
                        strQuote = str9;
                    } else {
                        iM3169 = (i10 - C0619.m2761("ܿۧ")) * 61;
                        i3 = ((iM3169 ^ i11) * (-14597)) ^ 354781363;
                        i4 = 1269690906;
                        i13 = iM3169 ^ i4;
                        i12 = i3;
                    }
                    break;
                case -581169787:
                case 1281248588:
                    C3779.m12258(sb, JSONObject.quote(str2));
                    sArr2 = f32436;
                    i14 = 115;
                    if (!RunnableC3646.f12471) {
                        iM3169 = (C0773.m3169("ۢ᩻") ^ i11) * 101;
                        i3 = ((iM3169 ^ i10) * (-8259)) ^ 945808340;
                        i4 = 1761938311;
                        i13 = iM3169 ^ i4;
                        i12 = i3;
                    } else {
                        strQuote = strQuote;
                        iM2761 = C0773.m3169("ۘܽ") ^ i11;
                        i = ((iM2761 ^ i10) * (-2019)) ^ (-1561084980);
                        i2 = -823165898;
                        i5 = iM2761 ^ i2;
                        String str10 = strQuote;
                        i13 = i5;
                        i12 = i;
                        strQuote = str10;
                    }
                    break;
                case -528765021:
                case 1088637629:
                    C1519.m5403();
                    C2878.m9491();
                    int iM31613 = C0773.m3169("֡ᩳ") ^ i10;
                    i = ((iM31613 ^ i11) * (-30101)) ^ (-244512983);
                    i5 = iM31613 ^ 1431903983;
                    sb = null;
                    String str11 = strQuote;
                    i13 = i5;
                    i12 = i;
                    strQuote = str11;
                    break;
                case -491649551:
                case 2127073017:
                    i6 = 29897;
                    iM2761 = C0773.m3169("ۛᩴ") ^ i10;
                    i = ((iM2761 ^ i11) * 5583) ^ 46493241;
                    i2 = -1619848970;
                    i5 = iM2761 ^ i2;
                    String str12 = strQuote;
                    i13 = i5;
                    i12 = i;
                    strQuote = str12;
                    break;
                case -164055307:
                case 1474026403:
                    strQuote = strQuote;
                    s2 = sArr3[c];
                    i17 = s2 * s2;
                    i18 = 387026929;
                    if (C0862.f3233 != 0) {
                        iM2761 = C0773.m3169("ۘܽ") ^ i11;
                        i = ((iM2761 ^ i10) * (-2019)) ^ (-1561084980);
                        i2 = -823165898;
                    } else {
                        iM2761 = (C0773.m3169("ܽۛ") + i11) * (-113);
                        i = ((iM2761 ^ i10) * (-8851)) ^ 1316798543;
                        i2 = 1493249347;
                    }
                    i5 = iM2761 ^ i2;
                    String str13 = strQuote;
                    i13 = i5;
                    i12 = i;
                    strQuote = str13;
                    break;
                case -6774455:
                case 1650098282:
                    strQuote = strQuote;
                    int i21 = i17 + i18;
                    i19 = i21 + i21;
                    s = 19673;
                    if (C1321.f4751 >= 0) {
                        iM2761 = (C0773.m3169("᩸ۧ") + i10) * 101;
                        i = ((iM2761 ^ i11) * 23741) ^ 1078233854;
                        i2 = -2136174227;
                    } else {
                        iM2761 = C0619.m2761("ܳܰ") ^ i11;
                        i = ((iM2761 ^ i10) * 15653) ^ (-1131760420);
                        i2 = -1111111450;
                    }
                    i5 = iM2761 ^ i2;
                    String str14 = strQuote;
                    i13 = i5;
                    i12 = i;
                    strQuote = str14;
                    break;
                case 476100836:
                case 694185752:
                    C3779.m12258(sb, C3033.m9847(sArr4, i15, i16, i6));
                    return C1080.m4058(sb);
                case 984983937:
                case 1906565371:
                    C1783.m6234(sb, str);
                    sArr4 = f32436;
                    i16 = 4;
                    if (C2023.f6737) {
                        i15 = 128;
                        iM3169 = (i10 - C0619.m2761("ۘ֫")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i3 = ((iM3169 ^ i11) * (-30141)) ^ (-982548353);
                        i4 = -1791461635;
                        i13 = iM3169 ^ i4;
                        i12 = i3;
                    } else {
                        int iM31614 = C0773.m3169("ܰۛ") ^ i11;
                        i13 = iM31614 ^ 185670231;
                        i12 = ((iM31614 ^ i10) * (-20057)) ^ 1466971103;
                        i15 = 128;
                    }
                    break;
                case 1456644002:
                case 1689526353:
                    C1783.m6234(sb, C13473.m33137(sArr2, i14, 13, i6));
                    if (RunnableC3055.f9898 >= 0) {
                        strQuote = strQuote;
                        iM2761 = (C0773.m3169("᩸ۧ") + i10) * 101;
                        i = ((iM2761 ^ i11) * 23741) ^ 1078233854;
                        i2 = -2136174227;
                        i5 = iM2761 ^ i2;
                        String str15 = strQuote;
                        i13 = i5;
                        i12 = i;
                        strQuote = str15;
                    } else {
                        int iM2762 = C0619.m2761("᩸᩻") ^ i10;
                        i12 = ((iM2762 ^ i11) * 12089) ^ (-1640362977);
                        i13 = iM2762 ^ 1262746734;
                    }
                    break;
                default:
                    C3779.m12258(sb, strQuote);
                    sArr = f32436;
                    i7 = 83;
                    i8 = 32;
                    if (C2287.m7745() <= 0) {
                        iM3169 = (i10 - C0619.m2761("ۘ֫")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i3 = ((iM3169 ^ i11) * (-30141)) ^ (-982548353);
                        i4 = -1791461635;
                    } else {
                        iM3169 = C0773.m3169("ۢ᩹") ^ i10;
                        i3 = ((iM3169 ^ i11) * (-14751)) ^ 1423112917;
                        i4 = -534266064;
                    }
                    i13 = iM3169 ^ i4;
                    i12 = i3;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m26203() {
        return this.f32479;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x04e2 A[PHI: r2 r35 r38
      0x04e2: PHI (r2v177 boolean) = (r2v45 boolean), (r2v63 boolean), (r2v183 boolean) binds: [B:104:0x04ca, B:83:0x03d5, B:6:0x0092] A[DONT_GENERATE, DONT_INLINE]
      0x04e2: PHI (r35v44 int) = (r35v5 int), (r35v9 int), (r35v48 int) binds: [B:104:0x04ca, B:83:0x03d5, B:6:0x0092] A[DONT_GENERATE, DONT_INLINE]
      0x04e2: PHI (r38v67 int) = (r38v24 int), (r38v28 int), (r38v72 int) binds: [B:104:0x04ca, B:83:0x03d5, B:6:0x0092] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:157:0x073f A[PHI: r2 r4 r5 r26 r33 r38
      0x073f: PHI (r2v197 int) = (r2v191 int), (r2v198 int) binds: [B:155:0x0725, B:136:0x0641] A[DONT_GENERATE, DONT_INLINE]
      0x073f: PHI (r4v161 int) = (r4v155 int), (r4v162 int) binds: [B:155:0x0725, B:136:0x0641] A[DONT_GENERATE, DONT_INLINE]
      0x073f: PHI (r5v114 int) = (r5v108 int), (r5v115 int) binds: [B:155:0x0725, B:136:0x0641] A[DONT_GENERATE, DONT_INLINE]
      0x073f: PHI (r26v48 boolean) = (r26v42 boolean), (r26v49 boolean) binds: [B:155:0x0725, B:136:0x0641] A[DONT_GENERATE, DONT_INLINE]
      0x073f: PHI (r33v86 int) = (r33v80 int), (r33v87 int) binds: [B:155:0x0725, B:136:0x0641] A[DONT_GENERATE, DONT_INLINE]
      0x073f: PHI (r38v82 int) = (r38v76 int), (r38v83 int) binds: [B:155:0x0725, B:136:0x0641] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:216:0x0a2a A[PHI: r2 r3 r4 r5 r26 r33 r38
      0x0a2a: PHI (r2v27 int) = (r2v18 int), (r2v28 int) binds: [B:214:0x0a11, B:195:0x0949] A[DONT_GENERATE, DONT_INLINE]
      0x0a2a: PHI (r3v15 android.view.VelocityTracker) = (r3v5 android.view.VelocityTracker), (r3v16 android.view.VelocityTracker) binds: [B:214:0x0a11, B:195:0x0949] A[DONT_GENERATE, DONT_INLINE]
      0x0a2a: PHI (r4v15 int) = (r4v9 int), (r4v16 int) binds: [B:214:0x0a11, B:195:0x0949] A[DONT_GENERATE, DONT_INLINE]
      0x0a2a: PHI (r5v15 int) = (r5v9 int), (r5v16 int) binds: [B:214:0x0a11, B:195:0x0949] A[DONT_GENERATE, DONT_INLINE]
      0x0a2a: PHI (r26v11 boolean) = (r26v5 boolean), (r26v12 boolean) binds: [B:214:0x0a11, B:195:0x0949] A[DONT_GENERATE, DONT_INLINE]
      0x0a2a: PHI (r33v12 int) = (r33v6 int), (r33v13 int) binds: [B:214:0x0a11, B:195:0x0949] A[DONT_GENERATE, DONT_INLINE]
      0x0a2a: PHI (r38v9 int) = (r38v3 int), (r38v10 int) binds: [B:214:0x0a11, B:195:0x0949] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:220:0x0a68 A[PHI: r2 r3 r4 r5 r13 r26 r33 r38
      0x0a68: PHI (r2v108 int) = (r2v17 int), (r2v24 int), (r2v28 int), (r2v109 int) binds: [B:218:0x0a51, B:205:0x09b8, B:195:0x0949, B:75:0x036b] A[DONT_GENERATE, DONT_INLINE]
      0x0a68: PHI (r3v42 android.view.VelocityTracker) = 
      (r3v4 android.view.VelocityTracker)
      (r3v9 android.view.VelocityTracker)
      (r3v16 android.view.VelocityTracker)
      (r3v43 android.view.VelocityTracker)
     binds: [B:218:0x0a51, B:205:0x09b8, B:195:0x0949, B:75:0x036b] A[DONT_GENERATE, DONT_INLINE]
      0x0a68: PHI (r4v76 int) = (r4v8 int), (r4v13 int), (r4v16 int), (r4v77 int) binds: [B:218:0x0a51, B:205:0x09b8, B:195:0x0949, B:75:0x036b] A[DONT_GENERATE, DONT_INLINE]
      0x0a68: PHI (r5v55 int) = (r5v8 int), (r5v13 int), (r5v16 int), (r5v56 int) binds: [B:218:0x0a51, B:205:0x09b8, B:195:0x0949, B:75:0x036b] A[DONT_GENERATE, DONT_INLINE]
      0x0a68: PHI (r13v8 l.ᩳ۬֫) = (r13v2 l.ᩳ۬֫), (r13v2 l.ᩳ۬֫), (r13v2 l.ᩳ۬֫), (r13v9 l.ᩳ۬֫) binds: [B:218:0x0a51, B:205:0x09b8, B:195:0x0949, B:75:0x036b] A[DONT_GENERATE, DONT_INLINE]
      0x0a68: PHI (r26v30 boolean) = (r26v4 boolean), (r26v9 boolean), (r26v12 boolean), (r26v31 boolean) binds: [B:218:0x0a51, B:205:0x09b8, B:195:0x0949, B:75:0x036b] A[DONT_GENERATE, DONT_INLINE]
      0x0a68: PHI (r33v43 int) = (r33v5 int), (r33v10 int), (r33v13 int), (r33v45 int) binds: [B:218:0x0a51, B:205:0x09b8, B:195:0x0949, B:75:0x036b] A[DONT_GENERATE, DONT_INLINE]
      0x0a68: PHI (r38v42 int) = (r38v2 int), (r38v7 int), (r38v10 int), (r38v43 int) binds: [B:218:0x0a51, B:205:0x09b8, B:195:0x0949, B:75:0x036b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x01fd A[PHI: r33 r35 r38
      0x01fd: PHI (r33v57 l.ᩳ۬֫) = (r33v53 l.ᩳ۬֫), (r33v59 l.ᩳ۬֫) binds: [B:39:0x01f9, B:31:0x01ae] A[DONT_GENERATE, DONT_INLINE]
      0x01fd: PHI (r35v31 int) = (r35v28 int), (r35v33 int) binds: [B:39:0x01f9, B:31:0x01ae] A[DONT_GENERATE, DONT_INLINE]
      0x01fd: PHI (r38v54 int) = (r38v51 int), (r38v56 int) binds: [B:39:0x01f9, B:31:0x01ae] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x0235 A[PHI: r33 r35 r38
      0x0235: PHI (r33v58 l.ᩳ۬֫) = (r33v51 l.ᩳ۬֫), (r33v59 l.ᩳ۬֫) binds: [B:43:0x021c, B:31:0x01ae] A[DONT_GENERATE, DONT_INLINE]
      0x0235: PHI (r35v32 int) = (r35v26 int), (r35v33 int) binds: [B:43:0x021c, B:31:0x01ae] A[DONT_GENERATE, DONT_INLINE]
      0x0235: PHI (r38v55 int) = (r38v49 int), (r38v56 int) binds: [B:43:0x021c, B:31:0x01ae] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x02d2, code lost:
    
        if (r27 > r7) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x02e1, code lost:
    
        if (r40.f32466 >= 0.5f) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x02e3, code lost:
    
        r2 = (l.C0619.m2761("ܿ֨") ^ r31) * (-29);
        r4 = ((r2 ^ r30) * 12907) ^ 417226254;
        r5 = 1037418508;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x02fa, code lost:
    
        r2 = r8;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m26202(android.view.MotionEvent r41) {
        /*
            Method dump skipped, instruction units count: 3400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10139.m26202(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code duplicated, block: B:80:0x02c9 A[PHI: r2 r17
      0x02c9: PHI (r2v4 android.widget.FrameLayout) = 
      (r2v3 android.widget.FrameLayout)
      (r2v2 android.widget.FrameLayout)
      (r2v2 android.widget.FrameLayout)
      (r2v2 android.widget.FrameLayout)
     binds: [B:78:0x02b3, B:73:0x028e, B:70:0x0270, B:66:0x024e] A[DONT_GENERATE, DONT_INLINE]
      0x02c9: PHI (r17v8 int) = (r17v5 int), (r17v6 int), (r17v7 int), (r17v9 int) binds: [B:78:0x02b3, B:73:0x028e, B:70:0x0270, B:66:0x024e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0067, code lost:
    
        if (l.RunnableC0334.f1808 > 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0069, code lost:
    
        r17 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0072, code lost:
    
        if (l.C2878.f9462 != false) goto L23;
     */
    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m26197() {
        /*
            Method dump skipped, instruction units count: 898
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10139.m26197():void");
    }

    /* JADX WARN: Code duplicated, block: B:55:0x019d A[PHI: r9
      0x019d: PHI (r9v3 int) = (r9v2 int), (r9v1 int) binds: [B:53:0x0185, B:47:0x0153] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x01c2 A[PHI: r6 r8 r11 r14 r15
      0x01c2: PHI (r6v5 android.widget.FrameLayout$LayoutParams) = 
      (r6v2 android.widget.FrameLayout$LayoutParams)
      (r6v4 android.widget.FrameLayout$LayoutParams)
      (r6v2 android.widget.FrameLayout$LayoutParams)
     binds: [B:170:0x01c2, B:57:0x01c0, B:44:0x0137] A[DONT_GENERATE, DONT_INLINE]
      0x01c2: PHI (r8v4 android.webkit.WebView) = (r8v2 android.webkit.WebView), (r8v3 android.webkit.WebView), (r8v2 android.webkit.WebView) binds: [B:170:0x01c2, B:57:0x01c0, B:44:0x0137] A[DONT_GENERATE, DONT_INLINE]
      0x01c2: PHI (r11v2 int) = (r11v1 int), (r11v1 int), (r11v3 int) binds: [B:170:0x01c2, B:57:0x01c0, B:44:0x0137] A[DONT_GENERATE, DONT_INLINE]
      0x01c2: PHI (r14v3 short[]) = (r14v2 short[]), (r14v2 short[]), (r14v4 short[]) binds: [B:170:0x01c2, B:57:0x01c0, B:44:0x0137] A[DONT_GENERATE, DONT_INLINE]
      0x01c2: PHI (r15v3 int) = (r15v2 int), (r15v2 int), (r15v4 int) binds: [B:170:0x01c2, B:57:0x01c0, B:44:0x0137] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x0242  */
    /* JADX WARN: Code duplicated, block: B:82:0x02de  */
    /* JADX WARN: Code duplicated, block: B:94:0x0356 A[PHI: r1 r3 r26 r27
      0x0356: PHI (r1v39 boolean) = (r1v1 boolean), (r1v1 boolean), (r1v32 boolean), (r1v1 boolean), (r1v1 boolean), (r1v1 boolean), (r1v1 boolean) binds: [B:173:0x0356, B:169:0x0356, B:93:0x0353, B:88:0x0330, B:34:0x00d3, B:188:0x0356, B:25:0x00a3] A[DONT_GENERATE, DONT_INLINE]
      0x0356: PHI (r3v3 int) = (r3v1 int), (r3v1 int), (r3v1 int), (r3v2 int), (r3v1 int), (r3v1 int), (r3v1 int) binds: [B:173:0x0356, B:169:0x0356, B:93:0x0353, B:88:0x0330, B:34:0x00d3, B:188:0x0356, B:25:0x00a3] A[DONT_GENERATE, DONT_INLINE]
      0x0356: PHI (r26v6 int) = (r26v1 int), (r26v1 int), (r26v2 int), (r26v1 int), (r26v1 int), (r26v1 int), (r26v1 int) binds: [B:173:0x0356, B:169:0x0356, B:93:0x0353, B:88:0x0330, B:34:0x00d3, B:188:0x0356, B:25:0x00a3] A[DONT_GENERATE, DONT_INLINE]
      0x0356: PHI (r27v5 int) = (r27v3 int), (r27v3 int), (r27v4 int), (r27v3 int), (r27v3 int), (r27v3 int), (r27v3 int) binds: [B:173:0x0356, B:169:0x0356, B:93:0x0353, B:88:0x0330, B:34:0x00d3, B:188:0x0356, B:25:0x00a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m26195(final boolean z) {
        int iM3169;
        int i;
        int i2;
        boolean z2;
        int iM31610;
        int i3;
        int i4;
        int i5;
        short s;
        boolean z3 = false;
        final int i6 = 0;
        ValueAnimator valueAnimator = null;
        boolean z4 = false;
        int marginStart = 0;
        int iM26159 = 0;
        int i7 = 0;
        String strM47853 = null;
        short s2 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = -1728944827;
        int i11 = C0487.f2131;
        int i12 = C1783.f6087;
        int iM2761 = (C0619.m2761("֨ܳ") + i11) * (-75);
        int i13 = ((iM2761 ^ i12) * (-13245)) ^ 1859457586;
        int i14 = iM2761 ^ 1271022554;
        short[] sArr = null;
        short[] sArr2 = null;
        int i15 = 0;
        int i16 = 0;
        char c = 0;
        short s3 = 0;
        int i17 = 0;
        int i18 = 0;
        WebView webView = null;
        FrameLayout.LayoutParams layoutParams = null;
        while (true) {
            i10 = i14 ^ (i13 & (((i10 ^ i12) * 16987) >> 31));
            switch (i10) {
                case -2095664380:
                case -901973414:
                    C1343.m4943();
                    if (AbstractC3624.f12429 > 0) {
                        iM3169 = (C0773.m3169("۠ۨ") + i11) * (-3);
                        i = ((iM3169 ^ i12) * (-24297)) ^ 1962980024;
                        i2 = 125101857;
                    } else {
                        iM3169 = (C0773.m3169("᩹ۛ") + i12) * 19;
                        i = ((iM3169 ^ i11) * (-16707)) ^ (-721845407);
                        i2 = 1084658709;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case -2053869193:
                case -1546978208:
                    strM47853 = C20932.m47853(sArr2, i16, 33, i15);
                    if (RunnableC1848.f6235) {
                        iM3169 = C0619.m2761("ܿۚ") ^ i11;
                        i = ((iM3169 ^ i12) * 25931) ^ 463371856;
                        i2 = -979947328;
                    } else {
                        iM3169 = C0773.m3169("ۢ᩻") ^ i11;
                        i = ((iM3169 ^ i12) * 11285) ^ (-679894596);
                        i2 = -1532645391;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case -2053076700:
                case -1079912588:
                    i15 = 11510;
                    iM3169 = (i11 - C0619.m2761("ۙۘ")) * q.h;
                    i = ((iM3169 ^ i12) * (-11913)) ^ (-329743671);
                    i2 = 1004708988;
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case -2035920387:
                case -1001907738:
                    C2702.m8876();
                    if (C2702.f8586 <= 0) {
                        iM3169 = C0619.m2761("ܿۚ") ^ i11;
                        i = ((iM3169 ^ i12) * 25931) ^ 463371856;
                        i2 = -979947328;
                        i14 = iM3169 ^ i2;
                        i13 = i;
                    } else {
                        s = s3;
                        int iM31611 = (i12 - C0773.m3169("ܺ᩸")) * (-105);
                        s3 = s;
                        i13 = ((iM31611 ^ i11) * 32753) ^ (-2036571327);
                        i14 = iM31611 ^ (-85338330);
                    }
                    break;
                case -2003081244:
                case -34930301:
                    if (this.f32452) {
                        iM3169 = C0619.m2761("֡֨") ^ i11;
                        i = ((iM3169 ^ i12) * (-24837)) ^ (-1217744572);
                        i2 = 1583879723;
                    } else {
                        iM3169 = C0773.m3169("ܿۘ") ^ i12;
                        i = ((iM3169 ^ i11) * 25495) ^ (-1496481848);
                        i2 = -467215895;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case -1968388733:
                case -1092783743:
                    C2485.m8357();
                    AbstractC0641.m2813();
                    break;
                case -1918074452:
                case -1031285763:
                    C2485.m8357();
                    if (AbstractC0641.f2496 >= 0) {
                        z2 = z3;
                        iM31610 = (C0773.m3169("ۨᩳ") ^ i11) * (-123);
                        i3 = ((iM31610 ^ i12) * 31037) ^ 714161104;
                        i4 = 2021201823;
                        i5 = iM31610 ^ i4;
                        boolean z5 = z2;
                        i14 = i5;
                        i13 = i3;
                        z3 = z5;
                    } else {
                        iM3169 = (C0773.m3169("۠ۨ") + i11) * (-3);
                        i = ((iM3169 ^ i12) * (-24297)) ^ 1962980024;
                        i2 = 125101857;
                        i14 = iM3169 ^ i2;
                        i13 = i;
                    }
                    break;
                case -1884942097:
                case -1785041011:
                    if (z4) {
                        iM3169 = C0773.m3169("ᩳۧ") ^ i11;
                        i = ((iM3169 ^ i12) * 13887) ^ (-825448008);
                        i2 = 347819921;
                    } else {
                        iM3169 = C0619.m2761("ۛ᩹") ^ i12;
                        i = ((iM3169 ^ i11) * 7899) ^ (-907687115);
                        i2 = -2066481557;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case -1765733985:
                case -1654689602:
                    z2 = z3;
                    sArr = f32436;
                    if (C3690.f12684 <= 0) {
                        iM31610 = (i11 - C0619.m2761("ܳۖ")) * 63;
                        i3 = ((iM31610 ^ i12) * (-7827)) ^ (-1806963710);
                        i4 = 15728077;
                    } else {
                        iM31610 = C0619.m2761("ᩴᩳ") ^ i11;
                        i3 = ((iM31610 ^ i12) * 9807) ^ (-626334460);
                        i4 = 1514150169;
                    }
                    i5 = iM31610 ^ i4;
                    boolean z6 = z2;
                    i14 = i5;
                    i13 = i3;
                    z3 = z6;
                    break;
                case -1733919953:
                case -1294823911:
                    iM26159 = 0;
                    iM3169 = C0773.m3169("ܺ۠") ^ i12;
                    i = ((iM3169 ^ i11) * (-16371)) ^ 1853593235;
                    i2 = -751482805;
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case -1727936677:
                case -1108117088:
                    webView = this.f32482;
                    layoutParams = (FrameLayout.LayoutParams) C3779.m12257(webView);
                    if (C1321.f4751 >= 0) {
                        iM3169 = C0773.m3169("ᩳ֡") ^ i12;
                        i = ((iM3169 ^ i11) * 5123) ^ (-422718628);
                        i2 = 1289403691;
                    } else {
                        iM3169 = (C0773.m3169("ᩳ۟") + i11) * 25;
                        i = ((iM3169 ^ i12) * (-24305)) ^ 1618059594;
                        i2 = -42184377;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case -1640186048:
                case -927708257:
                    i6 = i17 + i18;
                    if (C4282.m13644()) {
                        iM3169 = (i11 - C0773.m3169("ۢ᩸")) * (-15);
                        i = ((iM3169 ^ i12) * 927) ^ 1649837947;
                        i2 = 1143390928;
                    } else {
                        iM3169 = (C0773.m3169("۠ۨ") + i11) * (-3);
                        i = ((iM3169 ^ i12) * (-24297)) ^ 1962980024;
                        i2 = 125101857;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case -1505275352:
                case -1232319324:
                    z2 = z3;
                    s3 = sArr[c];
                    s2 = 70432;
                    if (C11235.f35427 >= 0) {
                        iM31610 = C0773.m3169("۬ۗ") ^ i12;
                        i3 = ((iM31610 ^ i11) * 4567) ^ 1596366658;
                        i4 = -1235659885;
                    } else {
                        iM31610 = C0773.m3169("ᩳۙ") ^ i12;
                        i3 = ((iM31610 ^ i11) * 15939) ^ 2100175493;
                        i4 = -509836565;
                    }
                    i5 = iM31610 ^ i4;
                    boolean z7 = z2;
                    i14 = i5;
                    i13 = i3;
                    z3 = z7;
                    break;
                case -1414802981:
                case -1262680794:
                    i8 = s3 * s2;
                    s = s3;
                    int i19 = s + 17608;
                    if (!C17202.f56030) {
                        i9 = i19;
                        int iM31612 = (i12 - C0773.m3169("ܺ᩸")) * (-105);
                        s3 = s;
                        i13 = ((iM31612 ^ i11) * 32753) ^ (-2036571327);
                        i14 = iM31612 ^ (-85338330);
                    } else {
                        s3 = s;
                        int iM31613 = (C0773.m3169("ܰ֫") + i12) * (-109);
                        z2 = z3;
                        i3 = ((iM31613 ^ i11) * 6875) ^ 2043348651;
                        i5 = iM31613 ^ 1344090066;
                        i9 = i19;
                        boolean z8 = z2;
                        i14 = i5;
                        i13 = i3;
                        z3 = z8;
                    }
                    break;
                case -1399478331:
                case 1295126654:
                    z2 = z3;
                    c = 397;
                    if (C2702.f8586 <= 0) {
                        iM31610 = (C0773.m3169("ۨᩳ") ^ i11) * (-123);
                        i3 = ((iM31610 ^ i12) * 31037) ^ 714161104;
                        i4 = 2021201823;
                    } else {
                        iM31610 = C0619.m2761("᩷ܶ") ^ i11;
                        i3 = ((iM31610 ^ i12) * (-6509)) ^ 1641794415;
                        i4 = -1321914705;
                    }
                    i5 = iM31610 ^ i4;
                    boolean z9 = z2;
                    i14 = i5;
                    i13 = i3;
                    z3 = z9;
                    break;
                case -1374529690:
                case 163603903:
                    z4 = false;
                    iM3169 = C0773.m3169("ۖ᩹") ^ i12;
                    i = ((iM3169 ^ i11) * (-29701)) ^ (-2007030179);
                    i2 = -542185448;
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case -1372321716:
                case 1784214245:
                    z2 = z3;
                    if (C0487.f2131 <= 0) {
                        iM31610 = (C0773.m3169("ۜܳ") ^ i12) * (-5);
                        i3 = ((iM31610 ^ i11) * (-23107)) ^ 127360498;
                        i4 = -1136541081;
                    } else {
                        iM31610 = (C0619.m2761("᩺᩻") ^ i12) * (-111);
                        i3 = ((iM31610 ^ i11) * (-27695)) ^ 362541262;
                        i4 = 1330202137;
                    }
                    i5 = iM31610 ^ i4;
                    boolean z10 = z2;
                    i14 = i5;
                    i13 = i3;
                    z3 = z10;
                    break;
                case -1277950160:
                case -951850225:
                    final int i20 = i7;
                    final boolean z11 = z4;
                    final int i21 = iM26159;
                    webView.evaluateJavascript(m26161(strM47853), new ValueCallback(this) { // from class: l.ܺ۬֫

                        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ C10139 f54328;

                        {
                            int i22 = -1058160146;
                            int i23 = RunnableC0334.f1808;
                            int i24 = C1564.f5401;
                            int iM2762 = (C0619.m2761("᩹᩷") ^ i23) * (-65);
                            int i25 = ((iM2762 ^ i24) * 20407) ^ 809792430;
                            int i26 = -1052486053;
                            while (true) {
                                i22 = ((((i22 ^ i24) * 18773) >> 31) & i25) ^ (iM2762 ^ i26);
                                switch (i22) {
                                    case -2122441013:
                                    case -67064962:
                                        if (AbstractC3624.f12429 <= 0) {
                                            iM2762 = (C0619.m2761("ۛ᩵") ^ i23) * 77;
                                            i25 = ((iM2762 ^ i24) * (-31537)) ^ 51444467;
                                            i26 = 1733311301;
                                        } else {
                                            iM2762 = (C0619.m2761("᩻ܳ") ^ i24) * (-123);
                                            i25 = ((iM2762 ^ i23) * 31177) ^ 523028895;
                                            i26 = -381735054;
                                        }
                                        break;
                                    case -1994571495:
                                    case 1294460084:
                                        C3690.m11987();
                                        C2485.m8357();
                                        iM2762 = (C0619.m2761("ۙܰ") + i24) * 85;
                                        i25 = ((iM2762 ^ i23) * 31087) ^ 2072683554;
                                        i26 = -1097328956;
                                        break;
                                    case -1864987842:
                                    case 1329551313:
                                        if (AbstractC0116.m1243() != 0) {
                                            iM2762 = (C0619.m2761("ۛ᩵") ^ i23) * 77;
                                            i25 = ((iM2762 ^ i24) * (-31537)) ^ 51444467;
                                            i26 = 1733311301;
                                        } else {
                                            iM2762 = C0619.m2761("ܳ᩵") ^ i24;
                                            i25 = ((iM2762 ^ i23) * 71) ^ (-698564077);
                                            i26 = -1564700410;
                                        }
                                        break;
                                    case -1705865292:
                                    case 2044023262:
                                        this.f54328 = this;
                                        if (C3998.m12920()) {
                                            iM2762 = C0773.m3169("ᩳ۫") ^ i24;
                                            i25 = ((iM2762 ^ i23) * 14277) ^ 1883355110;
                                            i26 = -729836897;
                                        } else {
                                            iM2762 = (C0619.m2761("ۛ᩵") ^ i23) * 77;
                                            i25 = ((iM2762 ^ i24) * (-31537)) ^ 51444467;
                                            i26 = 1733311301;
                                        }
                                        break;
                                    case -1360311820:
                                    case -270480090:
                                        if (C3033.f9831 >= 0) {
                                            iM2762 = (C0619.m2761("ۛ᩵") ^ i23) * 77;
                                            i25 = ((iM2762 ^ i24) * (-31537)) ^ 51444467;
                                            i26 = 1733311301;
                                        } else {
                                            iM2762 = C0619.m2761("ۘۧ") ^ i23;
                                            i25 = ((iM2762 ^ i24) * (-4223)) ^ 1893625680;
                                            i26 = -746354367;
                                        }
                                        break;
                                    case -1197631198:
                                    case -432231295:
                                        if (C1321.f4751 >= 0) {
                                            iM2762 = (C0619.m2761("ۙܰ") + i24) * 85;
                                            i25 = ((iM2762 ^ i23) * 31087) ^ 2072683554;
                                            i26 = -1097328956;
                                        } else {
                                            iM2762 = C0773.m3169("ۚ᩷") ^ i23;
                                            i25 = ((iM2762 ^ i24) * (-30713)) ^ (-41860797);
                                            i26 = -622426664;
                                        }
                                        break;
                                    case -1190169886:
                                    case -213495387:
                                        if (C1783.f6087 <= 0) {
                                            iM2762 = (C0773.m3169("۟ܰ") ^ i23) * (-93);
                                            i25 = ((iM2762 ^ i24) * 12545) ^ 2109210689;
                                            i26 = 1405405471;
                                        } else {
                                            iM2762 = C0619.m2761("ܺ֡") ^ i23;
                                            i25 = ((iM2762 ^ i24) * (-14753)) ^ (-927554134);
                                            i26 = -1519808426;
                                        }
                                        break;
                                    case -865438573:
                                    case 338891270:
                                        C1564.m5509();
                                        if (C3448.f11240 < 0) {
                                            iM2762 = (C0619.m2761("ۛ᩵") ^ i23) * 77;
                                            i25 = ((iM2762 ^ i24) * (-31537)) ^ 51444467;
                                            i26 = 1733311301;
                                        } else {
                                            iM2762 = (C0619.m2761("ۙܰ") + i24) * 85;
                                            i25 = ((iM2762 ^ i23) * 31087) ^ 2072683554;
                                            i26 = -1097328956;
                                        }
                                        break;
                                    case -803734667:
                                    case 695182748:
                                        return;
                                    case -654584113:
                                    case -447141346:
                                        if (C3734.m12152() >= 0) {
                                            iM2762 = (C0773.m3169("۟ܰ") ^ i23) * (-93);
                                            i25 = ((iM2762 ^ i24) * 12545) ^ 2109210689;
                                            i26 = 1405405471;
                                        } else {
                                            iM2762 = (C0773.m3169("ۘۘ") + i23) * (-17);
                                            i25 = ((iM2762 ^ i24) * 13369) ^ 455094359;
                                            i26 = -279996534;
                                        }
                                        break;
                                    case -368838674:
                                    case -279341622:
                                        if (C1343.f4799 != 0) {
                                            iM2762 = C0773.m3169("۫۫") ^ i23;
                                            i25 = ((iM2762 ^ i24) * 16311) ^ 1990081843;
                                            i26 = 598467065;
                                        } else {
                                            iM2762 = (i24 - C0773.m3169("᩺֫")) * (-55);
                                            i25 = ((iM2762 ^ i23) * (-16787)) ^ (-1070496733);
                                            i26 = -1218312963;
                                        }
                                        break;
                                    case -43165343:
                                    case 370459222:
                                        if (C2485.m8357() <= 0) {
                                            iM2762 = (C0619.m2761("ۛ᩵") ^ i23) * 77;
                                            i25 = ((iM2762 ^ i24) * (-31537)) ^ 51444467;
                                            i26 = 1733311301;
                                        } else {
                                            iM2762 = (i24 - C0773.m3169("᩹᩺")) * (-19);
                                            i25 = ((iM2762 ^ i23) * 20127) ^ 159610286;
                                            i26 = -221639380;
                                        }
                                        break;
                                    case 170842166:
                                    case 996983655:
                                        C4282.m13644();
                                        C0862.m3503();
                                        throw new RuntimeException();
                                    case 494015535:
                                    case 2143778901:
                                        if (C1080.m4050()) {
                                            iM2762 = C0773.m3169("֡ᩳ") ^ i24;
                                            i25 = ((iM2762 ^ i23) * (-4023)) ^ 948857775;
                                            i26 = -1569914994;
                                        } else {
                                            iM2762 = C0773.m3169("۫۫") ^ i23;
                                            i25 = ((iM2762 ^ i24) * 16311) ^ 1990081843;
                                            i26 = 598467065;
                                        }
                                        break;
                                    case 710181029:
                                    case 769516013:
                                        if (C3492.f12043 > 0) {
                                            iM2762 = C0773.m3169("۫۫") ^ i23;
                                            i25 = ((iM2762 ^ i24) * 16311) ^ 1990081843;
                                            i26 = 598467065;
                                        } else {
                                            iM2762 = (C0619.m2761("ۙܰ") + i24) * 85;
                                            i25 = ((iM2762 ^ i23) * 31087) ^ 2072683554;
                                            i26 = -1097328956;
                                        }
                                        break;
                                    default:
                                        if (C3033.f9831 >= 0) {
                                            iM2762 = (C0773.m3169("۟ܰ") ^ i23) * (-93);
                                            i25 = ((iM2762 ^ i24) * 12545) ^ 2109210689;
                                            i26 = 1405405471;
                                        } else {
                                            iM2762 = C0773.m3169("᩺ۧ") ^ i23;
                                            i25 = ((iM2762 ^ i24) * 20685) ^ 410359220;
                                            i26 = -441762281;
                                        }
                                        break;
                                }
                            }
                        }

                        /* JADX WARN: Code duplicated, block: B:41:0x0109 A[PHI: r13 r14
                          0x0109: PHI (r13v3 int) = (r13v1 int), (r13v2 int), (r13v1 int) binds: [B:40:0x0107, B:24:0x0086, B:9:0x0048] A[DONT_GENERATE, DONT_INLINE]
                          0x0109: PHI (r14v3 int) = (r14v1 int), (r14v2 int), (r14v1 int) binds: [B:40:0x0107, B:24:0x0086, B:9:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:45:0x0139 A[PHI: r12 r18
                          0x0139: PHI (r12v4 l.ۢ۬֫) = (r12v3 l.ۢ۬֫), (r12v3 l.ۢ۬֫), (r12v5 l.ۢ۬֫) binds: [B:44:0x0137, B:36:0x00eb, B:28:0x00a7] A[DONT_GENERATE, DONT_INLINE]
                          0x0139: PHI (r18v2 java.lang.String) = (r18v1 java.lang.String), (r18v1 java.lang.String), (r18v4 java.lang.String) binds: [B:44:0x0137, B:36:0x00eb, B:28:0x00a7] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:49:0x016b A[PHI: r15 r17
                          0x016b: PHI (r15v4 boolean) = (r15v1 boolean), (r15v2 boolean), (r15v1 boolean), (r15v1 boolean), (r15v1 boolean), (r15v1 boolean) binds: [B:48:0x0169, B:20:0x0067, B:12:0x004e, B:9:0x0048, B:6:0x003d, B:33:0x00c9] A[DONT_GENERATE, DONT_INLINE]
                          0x016b: PHI (r17v3 boolean) = (r17v1 boolean), (r17v1 boolean), (r17v1 boolean), (r17v1 boolean), (r17v1 boolean), (r17v5 boolean) binds: [B:48:0x0169, B:20:0x0067, B:12:0x004e, B:9:0x0048, B:6:0x003d, B:33:0x00c9] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:53:0x0198  */
                        /* JADX WARN: Code duplicated, block: B:57:0x01ca  */
                        @Override // android.webkit.ValueCallback
                        public final void onReceiveValue(Object obj) {
                            int iM31614;
                            int i22;
                            int i23 = 271220244;
                            int i24 = C3033.f9831;
                            int i25 = C1519.f5300;
                            int iM31615 = C0773.m3169("ۖ᩺") ^ i24;
                            int i26 = ((iM31615 ^ i25) * 11453) ^ (-586675436);
                            int i27 = iM31615 ^ (-625127548);
                            String str = null;
                            C10139 c10139 = null;
                            int i28 = 0;
                            int i29 = 0;
                            boolean z12 = false;
                            boolean z13 = false;
                            while (true) {
                                i23 = i27 ^ ((((i23 ^ i25) * (-5339)) >> 31) & i26);
                                switch (i23) {
                                    case -1971525995:
                                    case 345091404:
                                        i28 = i20;
                                        i29 = i6;
                                        if (C0487.f2131 <= 0) {
                                            iM31614 = C0773.m3169("᩸ۨ") ^ i25;
                                            i26 = ((iM31614 ^ i24) * 28749) ^ 2070292453;
                                            i22 = -1307103978;
                                        } else {
                                            iM31614 = C0773.m3169("ۜۢ") ^ i25;
                                            i26 = ((iM31614 ^ i24) * (-17795)) ^ (-2050207815);
                                            i22 = -482659717;
                                        }
                                        i27 = iM31614 ^ i22;
                                        break;
                                    case -1905121729:
                                    case 627492729:
                                        str = (String) obj;
                                        c10139 = this.f54328;
                                        if (C1519.f5300 >= 0) {
                                            iM31614 = (C0619.m2761("ܺ֫") ^ i25) * (-75);
                                            i26 = ((iM31614 ^ i24) * 14347) ^ 237824383;
                                            i22 = -394254409;
                                        } else {
                                            iM31614 = (i24 - C0619.m2761("֨ۡ")) * (-87);
                                            i26 = ((iM31614 ^ i25) * 14483) ^ 2118050443;
                                            i22 = -166647796;
                                        }
                                        i27 = iM31614 ^ i22;
                                        break;
                                    case -1775705943:
                                    case -1140355536:
                                        if (AbstractC0641.f2496 >= 0) {
                                            iM31614 = (C0619.m2761("ܺ֫") ^ i25) * (-75);
                                            i26 = ((iM31614 ^ i24) * 14347) ^ 237824383;
                                            i22 = -394254409;
                                        } else {
                                            iM31614 = C0619.m2761("ۚ֡") ^ i25;
                                            i26 = ((iM31614 ^ i24) * (-20599)) ^ (-643268429);
                                            i22 = -1871628335;
                                        }
                                        i27 = iM31614 ^ i22;
                                        break;
                                    case -1635365526:
                                    case 1836296401:
                                        C3734.m12152();
                                        if (C1146.m4231()) {
                                            iM31614 = C0773.m3169("᩸ۨ") ^ i25;
                                            i26 = ((iM31614 ^ i24) * 28749) ^ 2070292453;
                                            i22 = -1307103978;
                                        } else {
                                            iM31614 = C0619.m2761("ۡۢ") ^ i24;
                                            i26 = ((iM31614 ^ i25) * (-32017)) ^ 540873205;
                                            i22 = -1383166305;
                                        }
                                        i27 = iM31614 ^ i22;
                                        break;
                                    case -1454015308:
                                    case 2022727882:
                                        if (C3099.f10023 <= 0) {
                                            iM31614 = (C0619.m2761("ܺ֫") ^ i25) * (-75);
                                            i26 = ((iM31614 ^ i24) * 14347) ^ 237824383;
                                            i22 = -394254409;
                                        } else {
                                            iM31614 = C0619.m2761("ܽۨ") ^ i25;
                                            i26 = ((iM31614 ^ i24) * (-14657)) ^ 1836022828;
                                            i22 = 1769407435;
                                        }
                                        i27 = iM31614 ^ i22;
                                        break;
                                    case -1395656094:
                                    case -814108232:
                                        if (C2485.f7950 != 0) {
                                            iM31614 = (i25 - C0773.m3169("ᩳܿ")) * 3;
                                            i26 = ((iM31614 ^ i24) * (-19265)) ^ 2069887222;
                                            i22 = 569211686;
                                        } else {
                                            iM31614 = (i24 - C0773.m3169("᩸ۖ")) * (-43);
                                            i26 = ((iM31614 ^ i25) * 26873) ^ 758052874;
                                            i22 = 2038492128;
                                        }
                                        i27 = iM31614 ^ i22;
                                        break;
                                    case -1240894273:
                                    case 1518669105:
                                        if (C3998.m12920()) {
                                            iM31614 = (C0619.m2761("ۨܰ") ^ i24) * 79;
                                            i26 = ((iM31614 ^ i25) * (-5795)) ^ 1587346500;
                                            i22 = -1826994409;
                                        } else {
                                            iM31614 = C0773.m3169("᩸ۨ") ^ i25;
                                            i26 = ((iM31614 ^ i24) * 28749) ^ 2070292453;
                                            i22 = -1307103978;
                                        }
                                        i27 = iM31614 ^ i22;
                                        break;
                                    case -1080261601:
                                    case -134704828:
                                        C1783.m6232();
                                        break;
                                    case -821030692:
                                    case 107062589:
                                        if (C2702.m8876()) {
                                            iM31614 = C0773.m3169("᩻ܿ") ^ i24;
                                            i26 = ((iM31614 ^ i25) * (-3197)) ^ 2141558509;
                                            i22 = 1183474490;
                                        } else {
                                            iM31614 = C0619.m2761("ۡۢ") ^ i24;
                                            i26 = ((iM31614 ^ i25) * (-32017)) ^ 540873205;
                                            i22 = -1383166305;
                                        }
                                        i27 = iM31614 ^ i22;
                                        break;
                                    case -657616020:
                                    case 696925853:
                                        C10139.m26170(c10139, i28, i29, z12, i21, z13, str);
                                        break;
                                    case -279008964:
                                    case 1011186114:
                                        z12 = z11;
                                        if (C0773.f2792 <= 0) {
                                            iM31614 = C0619.m2761("ۡۢ") ^ i24;
                                            i26 = ((iM31614 ^ i25) * (-32017)) ^ 540873205;
                                            i22 = -1383166305;
                                        } else {
                                            iM31614 = C0619.m2761("᩹ۤ") ^ i24;
                                            i26 = ((iM31614 ^ i25) * 15605) ^ (-1757814457);
                                            i22 = -967498052;
                                        }
                                        i27 = iM31614 ^ i22;
                                        break;
                                    case 381997549:
                                    case 1112699156:
                                        C2023.m6964();
                                        iM31614 = (i25 - C0773.m3169("ᩳܿ")) * 3;
                                        i26 = ((iM31614 ^ i24) * (-19265)) ^ 2069887222;
                                        i22 = 569211686;
                                        i27 = iM31614 ^ i22;
                                        break;
                                    case 891596920:
                                    case 1326415337:
                                        boolean z14 = z;
                                        if (C3734.f12817 >= 0) {
                                            z13 = z14;
                                            iM31614 = C0619.m2761("ۡۢ") ^ i24;
                                            i26 = ((iM31614 ^ i25) * (-32017)) ^ 540873205;
                                            i22 = -1383166305;
                                            i27 = iM31614 ^ i22;
                                        } else {
                                            int iM2762 = (i25 - C0619.m2761("ۛۜ")) * (-53);
                                            i26 = ((iM2762 ^ i24) * (-16685)) ^ (-597804122);
                                            i27 = iM2762 ^ (-1616950925);
                                            z13 = z14;
                                        }
                                        break;
                                    case 895582794:
                                    case 946687923:
                                        if (C0950.f3488 >= 0) {
                                            iM31614 = (i24 - C0619.m2761("ܶܿ")) * (-99);
                                            i26 = ((iM31614 ^ i25) * 3207) ^ (-468521849);
                                            i22 = -1237330242;
                                        } else {
                                            iM31614 = (C0773.m3169("ܿ᩷") + i25) * (-103);
                                            i26 = ((iM31614 ^ i24) * (-25523)) ^ 1962936907;
                                            i22 = -1084156515;
                                        }
                                        i27 = iM31614 ^ i22;
                                        break;
                                    case 1517747549:
                                    case 1835697753:
                                        if (C2287.f7432 < 0) {
                                            iM31614 = C0619.m2761("ۡۢ") ^ i24;
                                            i26 = ((iM31614 ^ i25) * (-32017)) ^ 540873205;
                                            i22 = -1383166305;
                                        } else {
                                            iM31614 = (i24 - C0619.m2761("ܶܿ")) * (-99);
                                            i26 = ((iM31614 ^ i25) * 3207) ^ (-468521849);
                                            i22 = -1237330242;
                                        }
                                        i27 = iM31614 ^ i22;
                                        break;
                                    default:
                                        C11235.m28309();
                                        if (C0773.m3161() != 0) {
                                            iM31614 = (i25 - C0773.m3169("ᩳܿ")) * 3;
                                            i26 = ((iM31614 ^ i24) * (-19265)) ^ 2069887222;
                                            i22 = 569211686;
                                        } else {
                                            iM31614 = C0619.m2761("ۡۢ") ^ i24;
                                            i26 = ((iM31614 ^ i25) * (-32017)) ^ 540873205;
                                            i22 = -1383166305;
                                        }
                                        i27 = iM31614 ^ i22;
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    break;
                case -1222836733:
                case 1482082599:
                    marginStart = layoutParams.getMarginStart();
                    if (this.f32478 != null) {
                        iM3169 = C0619.m2761("۟ܳ") ^ i12;
                        i = ((iM3169 ^ i11) * (-18807)) ^ (-121234549);
                        i2 = 1046810959;
                    } else {
                        iM3169 = (i11 - C0619.m2761("ۤۨ")) * (-73);
                        i = ((iM3169 ^ i12) * 7629) ^ 875036602;
                        i2 = 1966150031;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case -1096384446:
                case -186726965:
                    int i22 = this.f32437;
                    i18 = 1;
                    if (C1783.f6087 <= 0) {
                        i17 = i22;
                        z3 = true;
                        iM3169 = (C0773.m3169("۠ۨ") + i11) * (-3);
                        i = ((iM3169 ^ i12) * (-24297)) ^ 1962980024;
                        i2 = 125101857;
                        i14 = iM3169 ^ i2;
                        i13 = i;
                    } else {
                        int iM31614 = (C0773.m3169("ۚۚ") + i12) * (-101);
                        i17 = i22;
                        i13 = ((iM31614 ^ i11) * 23549) ^ (-1265844003);
                        i14 = iM31614 ^ 1884289581;
                        z3 = true;
                    }
                    break;
                case -1088511653:
                case 534587735:
                    m26187();
                    iM3169 = C0619.m2761("ۨ۫") ^ i11;
                    i = ((iM3169 ^ i12) * (-6645)) ^ 779240958;
                    i2 = -911996156;
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case -1014449579:
                case -1004151872:
                    C0487.m2356();
                    if (C0269.m1775() <= 0) {
                        s = s3;
                        int iM31615 = (i12 - C0773.m3169("ܺ᩸")) * (-105);
                        s3 = s;
                        i13 = ((iM31615 ^ i11) * 32753) ^ (-2036571327);
                        i14 = iM31615 ^ (-85338330);
                    } else {
                        iM3169 = (C0773.m3169("۠ۨ") + i11) * (-3);
                        i = ((iM3169 ^ i12) * (-24297)) ^ 1962980024;
                        i2 = 125101857;
                        i14 = iM3169 ^ i2;
                        i13 = i;
                    }
                    break;
                case -980111196:
                case 1046245797:
                    if (this.f32467) {
                        iM3169 = (i12 - C0619.m2761("ۖ֫")) * 13;
                        i = ((iM3169 ^ i11) * (-18663)) ^ (-710698813);
                        i2 = -3071320;
                    } else {
                        iM3169 = C0773.m3169("ᩴܺ") ^ i12;
                        i = ((iM3169 ^ i11) * (-23319)) ^ (-1619681058);
                        i2 = -762238561;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case -887149159:
                case 1488704020:
                    i7 = this.f32468;
                    sArr2 = f32436;
                    i16 = 398;
                    if (C3492.m11488()) {
                        iM3169 = (C0619.m2761("᩺ܳ") ^ i12) * (-27);
                        i = ((iM3169 ^ i11) * (-23365)) ^ (-1172559850);
                        i2 = -1881103349;
                    } else {
                        iM3169 = C0773.m3169("ᩳ֡") ^ i12;
                        i = ((iM3169 ^ i11) * 5123) ^ (-422718628);
                        i2 = 1289403691;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case -876419850:
                case 2015075381:
                    i15 = 49437;
                    iM3169 = (i11 - C0619.m2761("ۙۘ")) * q.h;
                    i = ((iM3169 ^ i12) * (-11913)) ^ (-329743671);
                    i2 = 1004708988;
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case -869881076:
                case 308428798:
                    z4 = true;
                    iM3169 = C0773.m3169("ۖ᩹") ^ i12;
                    i = ((iM3169 ^ i11) * (-29701)) ^ (-2007030179);
                    i2 = -542185448;
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case -854261877:
                case 633375299:
                    m26165((String) null, iM26159, i6, z4, z);
                    break;
                case -823690909:
                case -265314330:
                    if (z4) {
                        iM3169 = (i11 - C0773.m3169("᩺ܽ")) * 21;
                        i = ((iM3169 ^ i12) * (-22345)) ^ (-1972402568);
                        i2 = -765814500;
                    } else {
                        iM3169 = C0773.m3169("ᩴܺ") ^ i12;
                        i = ((iM3169 ^ i11) * (-23319)) ^ (-1619681058);
                        i2 = -762238561;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case -771836379:
                case 1241914601:
                    m26193(false);
                    if (this.f32452) {
                        iM3169 = C0619.m2761("ۨ۫") ^ i11;
                        i = ((iM3169 ^ i12) * (-6645)) ^ 779240958;
                        i2 = -911996156;
                    } else {
                        iM3169 = C0773.m3169("۬۟") ^ i12;
                        i = ((iM3169 ^ i11) * (-25619)) ^ 1617305429;
                        i2 = 1441373650;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case -756641629:
                case 310458708:
                    if (C3734.f12817 < 0) {
                        iM3169 = C0773.m3169("ᩳ֡") ^ i12;
                        i = ((iM3169 ^ i11) * 5123) ^ (-422718628);
                        i2 = 1289403691;
                        i14 = iM3169 ^ i2;
                        i13 = i;
                    } else {
                        z2 = z3;
                        iM31610 = (C0773.m3169("ۨᩳ") ^ i11) * (-123);
                        i3 = ((iM31610 ^ i12) * 31037) ^ 714161104;
                        i4 = 2021201823;
                        i5 = iM31610 ^ i4;
                        boolean z12 = z2;
                        i14 = i5;
                        i13 = i3;
                        z3 = z12;
                    }
                    break;
                case -556429025:
                case 396148174:
                    if (this.f32451) {
                        iM3169 = C0619.m2761("֨ܽ") ^ i12;
                        i = ((iM3169 ^ i11) * 427) ^ (-1121155957);
                        i2 = -658763775;
                    } else {
                        iM3169 = (C0619.m2761("᩷᩵") + i11) * (-7);
                        i = ((iM3169 ^ i12) * (-3637)) ^ (-814226151);
                        i2 = -446077436;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case -502333313:
                case 1779339502:
                    AbstractC0641.m2813();
                    C2287.m7745();
                    iM3169 = (C0773.m3169("۠ۨ") + i11) * (-3);
                    i = ((iM3169 ^ i12) * (-24297)) ^ 1962980024;
                    i2 = 125101857;
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case -464772622:
                case 708973349:
                    this.f32437 = i6;
                    this.f32461 = z3;
                    valueAnimator = this.f32481;
                    if (valueAnimator != null) {
                        iM3169 = (C0619.m2761("᩵ۤ") + i12) * 15;
                        i = ((iM3169 ^ i11) * (-8391)) ^ 1475047076;
                        i2 = -1331357114;
                    } else {
                        iM3169 = C0619.m2761("᩹ۗ") ^ i11;
                        i = ((iM3169 ^ i12) * 21515) ^ 1952861015;
                        i2 = -1612113022;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case -370691827:
                case 101987538:
                    valueAnimator.cancel();
                    this.f32481 = null;
                    iM3169 = C0619.m2761("᩹ۗ") ^ i11;
                    i = ((iM3169 ^ i12) * 21515) ^ 1952861015;
                    i2 = -1612113022;
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case -343375687:
                case 817448764:
                    if (C2288.f7433 > 0) {
                        iM3169 = C0773.m3169("ܽۛ") ^ i11;
                        i = ((iM3169 ^ i12) * 129) ^ 1224800398;
                        i2 = -1805184222;
                        i14 = iM3169 ^ i2;
                        i13 = i;
                    } else {
                        z2 = z3;
                        iM31610 = (C0773.m3169("ۨᩳ") ^ i11) * (-123);
                        i3 = ((iM31610 ^ i12) * 31037) ^ 714161104;
                        i4 = 2021201823;
                        i5 = iM31610 ^ i4;
                        boolean z13 = z2;
                        i14 = i5;
                        i13 = i3;
                        z3 = z13;
                    }
                    break;
                case -59906290:
                case 1503666687:
                    if (C1542.m5459() >= 0) {
                        z2 = z3;
                        iM31610 = (i11 - C0619.m2761("ܳۖ")) * 63;
                        i3 = ((iM31610 ^ i12) * (-7827)) ^ (-1806963710);
                        i4 = 15728077;
                        i5 = iM31610 ^ i4;
                        boolean z14 = z2;
                        i14 = i5;
                        i13 = i3;
                        z3 = z14;
                    } else {
                        iM3169 = (C0773.m3169("۠ۨ") + i11) * (-3);
                        i = ((iM3169 ^ i12) * (-24297)) ^ 1962980024;
                        i2 = 125101857;
                        i14 = iM3169 ^ i2;
                        i13 = i;
                    }
                    break;
                case 63517277:
                case 1904651683:
                    m26186();
                    iM3169 = C0619.m2761("ۛ᩹") ^ i12;
                    i = ((iM3169 ^ i11) * 7899) ^ (-907687115);
                    i2 = -2066481557;
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case 116256083:
                case 1904605231:
                    if (AbstractC0116.f1064 > 0) {
                        z2 = z3;
                        iM31610 = (C0773.m3169("ۜܳ") ^ i12) * (-5);
                        i3 = ((iM31610 ^ i11) * (-23107)) ^ 127360498;
                        i4 = -1136541081;
                        i5 = iM31610 ^ i4;
                        boolean z15 = z2;
                        i14 = i5;
                        i13 = i3;
                        z3 = z15;
                    } else {
                        iM3169 = (C0773.m3169("᩹ۛ") + i12) * 19;
                        i = ((iM3169 ^ i11) * (-16707)) ^ (-721845407);
                        i2 = 1084658709;
                        i14 = iM3169 ^ i2;
                        i13 = i;
                    }
                    break;
                case 864978243:
                case 1226433812:
                    if (m26206()) {
                        iM3169 = C0773.m3169("ۤ֫") ^ i11;
                        i = ((iM3169 ^ i12) * 1287) ^ 888311917;
                        i2 = -615041197;
                    } else {
                        iM3169 = C0773.m3169("ܿۘ") ^ i12;
                        i = ((iM3169 ^ i11) * 25495) ^ (-1496481848);
                        i2 = -467215895;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case 928036401:
                case 2082704931:
                    if ((i9 * i9) - i8 < 0) {
                        iM3169 = C0619.m2761("ܶᩴ") ^ i12;
                        i = ((iM3169 ^ i11) * 29605) ^ (-834226797);
                        i2 = 841944125;
                    } else {
                        iM3169 = (i11 - C0619.m2761("ܿ᩸")) * (-97);
                        i = ((iM3169 ^ i12) * 32207) ^ (-999934391);
                        i2 = -1680622267;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case 995063365:
                case 1799682923:
                    iM26159 = m26159(280);
                    iM3169 = C0773.m3169("ܺ۠") ^ i12;
                    i = ((iM3169 ^ i11) * (-16371)) ^ 1853593235;
                    i2 = -751482805;
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case 1051479468:
                case 1951507597:
                    if (iM26159 != marginStart) {
                        iM3169 = C0619.m2761("֨֡") ^ i11;
                        i = ((iM3169 ^ i12) * 20993) ^ 990119834;
                        i2 = -596713864;
                    } else {
                        iM3169 = (i11 - C0619.m2761("ۤۨ")) * (-73);
                        i = ((iM3169 ^ i12) * 7629) ^ 875036602;
                        i2 = 1966150031;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x019d A[PHI: r4 r5 r7 r11 r12 r16
      0x019d: PHI (r4v7 float) = (r4v2 float), (r4v6 float), (r4v1 float), (r4v1 float), (r4v1 float) binds: [B:47:0x017b, B:50:0x019b, B:37:0x0119, B:25:0x0079, B:11:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x019d: PHI (r5v3 android.view.View) = 
      (r5v2 android.view.View)
      (r5v1 android.view.View)
      (r5v1 android.view.View)
      (r5v1 android.view.View)
      (r5v1 android.view.View)
     binds: [B:47:0x017b, B:50:0x019b, B:37:0x0119, B:25:0x0079, B:11:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x019d: PHI (r7v3 float) = (r7v1 float), (r7v1 float), (r7v2 float), (r7v1 float), (r7v1 float) binds: [B:47:0x017b, B:50:0x019b, B:37:0x0119, B:25:0x0079, B:11:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x019d: PHI (r11v2 float) = (r11v1 float), (r11v1 float), (r11v1 float), (r11v1 float), (r11v3 float) binds: [B:47:0x017b, B:50:0x019b, B:37:0x0119, B:25:0x0079, B:11:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x019d: PHI (r12v7 float) = (r12v1 float), (r12v1 float), (r12v1 float), (r12v2 float), (r12v1 float) binds: [B:47:0x017b, B:50:0x019b, B:37:0x0119, B:25:0x0079, B:11:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x019d: PHI (r16v12 float) = (r16v6 float), (r16v7 float), (r16v8 float), (r16v10 float), (r16v13 float) binds: [B:47:0x017b, B:50:0x019b, B:37:0x0119, B:25:0x0079, B:11:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
    
        if (l.C2310.f7472 >= 0) goto L17;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m26162(float r21) {
        /*
            Method dump skipped, instruction units count: 816
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10139.m26162(float):void");
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m26207() {
        int i = -1724354857;
        int i2 = AbstractC0116.f1064;
        int i3 = C2966.f9654;
        int iM2761 = C0619.m2761("ᩴ᩷") ^ i3;
        int i4 = ((iM2761 ^ i2) * 20925) ^ 1779984410;
        int i5 = -565609327;
        while (true) {
            i = ((((i ^ i2) * (-16145)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2017087506:
                case -1665552555:
                    if (C1519.f5300 >= 0) {
                        iM2761 = (i2 - C0619.m2761("ۢۛ")) * 69;
                        i4 = ((iM2761 ^ i3) * (-7623)) ^ 1644810826;
                        i5 = 314074458;
                    } else {
                        iM2761 = (C0773.m3169("ۚᩴ") + i2) * 31;
                        i4 = ((iM2761 ^ i3) * 13759) ^ 1745489031;
                        i5 = 424335538;
                    }
                    break;
                case -1978666361:
                case 118115323:
                    C2287.m7745();
                    C1321.m4852();
                    return false;
                case -1757803577:
                case 1129707473:
                    if (RunnableC3055.f9898 >= 0) {
                        iM2761 = C0619.m2761("ۢ۬") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-3161)) ^ (-895910377);
                        i5 = -1041733515;
                    } else {
                        iM2761 = C0619.m2761("ܰܰ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-15653)) ^ (-841060433);
                        i5 = 1479708917;
                    }
                    break;
                case -1697294294:
                case 1748429822:
                    return false;
                case -1486872566:
                case 566853523:
                    if (C2354.f7599 >= 0) {
                        iM2761 = C0619.m2761("ۢ۬") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-3161)) ^ (-895910377);
                        i5 = -1041733515;
                    } else {
                        iM2761 = C0619.m2761("֡۬") ^ i2;
                        i4 = ((iM2761 ^ i3) * 22271) ^ (-1109131513);
                        i5 = 1706468959;
                    }
                    break;
                case -1399789704:
                case -559785257:
                    if (this.f32481 != null) {
                        iM2761 = (C0773.m3169("ۖۗ") ^ i2) * 5;
                        i4 = ((iM2761 ^ i3) * 8097) ^ 2085857293;
                        i5 = 626629286;
                    } else {
                        iM2761 = C0773.m3169("ۤۛ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 28575) ^ 686795564;
                        i5 = -181800374;
                    }
                    break;
                case -1308873184:
                case 185398116:
                    if (C2023.m6964() <= 0) {
                        iM2761 = C0773.m3169("ܶۖ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 6487) ^ 966550867;
                        i5 = -1327981313;
                    } else {
                        iM2761 = (C0619.m2761("ᩴ۬") + i2) * 73;
                        i4 = ((iM2761 ^ i3) * 32243) ^ (-2084436692);
                        i5 = 1616860815;
                    }
                    break;
                case -1194714617:
                case -973715069:
                    C3734.m12152();
                    if (!C2023.f6737) {
                        iM2761 = (i2 - C0619.m2761("ۢۛ")) * 69;
                        i4 = ((iM2761 ^ i3) * (-7623)) ^ 1644810826;
                        i5 = 314074458;
                    } else {
                        iM2761 = (C0619.m2761("᩸ܿ") ^ i3) * 93;
                        i4 = ((iM2761 ^ i2) * (-32555)) ^ 593231146;
                        i5 = 851016898;
                    }
                    break;
                case -843455629:
                case 245853461:
                    C0950.m3785();
                    iM2761 = (C0619.m2761("ۜۜ") ^ i2) * (-61);
                    i4 = ((iM2761 ^ i3) * 20875) ^ (-2086653727);
                    i5 = 64661583;
                    break;
                case -515608509:
                case 1546423113:
                    if (C1519.f5300 >= 0) {
                        iM2761 = C0773.m3169("ܶۖ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 6487) ^ 966550867;
                        i5 = -1327981313;
                    } else {
                        iM2761 = (C0773.m3169("ۧ۠") ^ i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM2761 ^ i2) * (-7235)) ^ 2014229318;
                        i5 = -1900249760;
                    }
                    break;
                case 556874678:
                case 1097838324:
                    C4238.m13540();
                    if (C3099.f10023 <= 0) {
                        iM2761 = (i2 - C0619.m2761("ۢۛ")) * 69;
                        i4 = ((iM2761 ^ i3) * (-7623)) ^ 1644810826;
                        i5 = 314074458;
                    } else {
                        iM2761 = (C0619.m2761("ۜۜ") ^ i2) * (-61);
                        i4 = ((iM2761 ^ i3) * 20875) ^ (-2086653727);
                        i5 = 64661583;
                    }
                    break;
                case 768065372:
                case 973625734:
                    C1564.m5509();
                    if (C4238.m13540() > 0) {
                        iM2761 = C0619.m2761("ۢ۬") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-3161)) ^ (-895910377);
                        i5 = -1041733515;
                    } else {
                        iM2761 = (C0619.m2761("᩸ܿ") ^ i3) * 93;
                        i4 = ((iM2761 ^ i2) * (-32555)) ^ 593231146;
                        i5 = 851016898;
                    }
                    break;
                case 834350947:
                case 1638461064:
                    if (C3077.m10041()) {
                        iM2761 = (C0619.m2761("᩸ܿ") ^ i3) * 93;
                        i4 = ((iM2761 ^ i2) * (-32555)) ^ 593231146;
                        i5 = 851016898;
                    } else {
                        iM2761 = C0619.m2761("ᩴۤ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-14401)) ^ 253676789;
                        i5 = 752931091;
                    }
                    break;
                case 835674071:
                case 1537346088:
                    return true;
                case 969511206:
                case 1296204234:
                    if (C0269.f1558 <= 0) {
                        iM2761 = C0619.m2761("ۢ۬") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-3161)) ^ (-895910377);
                        i5 = -1041733515;
                    } else {
                        iM2761 = C0773.m3169("֫ܰ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-25855)) ^ 2098696963;
                        i5 = 981422892;
                    }
                    break;
                case 1099564418:
                case 1548379810:
                    if (C23916.f77426 <= 0) {
                        iM2761 = (C0619.m2761("᩸ܿ") ^ i3) * 93;
                        i4 = ((iM2761 ^ i2) * (-32555)) ^ 593231146;
                        i5 = 851016898;
                    } else {
                        iM2761 = (C0773.m3169("۠ۢ") ^ i2) * 69;
                        i4 = ((iM2761 ^ i3) * (-9803)) ^ 1010598257;
                        i5 = 1667091144;
                    }
                    break;
                case 1353894070:
                case 2135085822:
                    if (AbstractC0116.f1064 <= 0) {
                        iM2761 = C0773.m3169("ܶۖ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 6487) ^ 966550867;
                        i5 = -1327981313;
                    } else {
                        iM2761 = C0773.m3169("ۢ᩶") ^ i3;
                        i4 = ((iM2761 ^ i2) * 6483) ^ (-757817398);
                        i5 = 450528761;
                    }
                    break;
                case 1663743432:
                case 1721204376:
                    if (C23916.m53419() != 0) {
                        iM2761 = C0773.m3169("ܶۖ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 6487) ^ 966550867;
                        i5 = -1327981313;
                    } else {
                        iM2761 = C0619.m2761("۠ۤ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-15585)) ^ 1732397833;
                        i5 = -799172595;
                    }
                    break;
                default:
                    if (this.f32458) {
                        iM2761 = (C0773.m3169("ۖۗ") ^ i2) * 5;
                        i4 = ((iM2761 ^ i3) * 8097) ^ 2085857293;
                        i5 = 626629286;
                    } else {
                        iM2761 = (C0619.m2761("᩸ۧ") + i3) * (-61);
                        i4 = ((iM2761 ^ i2) * 32349) ^ 1858762349;
                        i5 = 574115950;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m26180(boolean z) {
        C25227 c25227 = null;
        int iM26196 = 0;
        ArrayList arrayList = null;
        int i = 0;
        View viewFindViewByPosition = null;
        int decoratedTop = 0;
        int decoratedBottom = 0;
        C25227 c25228 = null;
        int iM9482 = 0;
        int i2 = -1989870602;
        int i3 = AbstractC0641.f2496;
        int i4 = C2966.f9654;
        int iM3169 = (C0773.m3169("᩶ۖ") ^ i3) * 119;
        int i5 = ((iM3169 ^ i4) * 8077) ^ 1798985915;
        int i6 = -521794233;
        while (true) {
            i2 = ((((i2 ^ i4) * 10979) >> 31) & i5) ^ (iM3169 ^ i6);
            switch (i2) {
                case -2092860001:
                case -252336546:
                    i++;
                    iM3169 = (i3 - C0773.m3169("᩷ۖ")) * (-27);
                    i5 = ((iM3169 ^ i4) * 9127) ^ (-461713748);
                    i6 = 2043303707;
                    break;
                case -2064866827:
                case 3479085:
                    iM26196 = m26196();
                    i = 0;
                    iM3169 = (i3 - C0773.m3169("᩷ۖ")) * (-27);
                    i5 = ((iM3169 ^ i4) * 9127) ^ (-461713748);
                    i6 = 2043303707;
                    break;
                case -2058769216:
                case -2039371969:
                    C3077.m10041();
                    if (C2966.f9654 >= 0) {
                        iM3169 = C0619.m2761("ܺۧ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-27099)) ^ (-1007528486);
                        i6 = -2079677145;
                    } else {
                        iM3169 = (C0773.m3169("֡ۖ") ^ i4) * 99;
                        i5 = ((iM3169 ^ i3) * 27651) ^ (-1072653018);
                        i6 = -498756667;
                    }
                    break;
                case -2055516012:
                case 1195683050:
                    C2310.m7813();
                    if (C0773.f2792 <= 0) {
                        iM3169 = C0773.m3169("֨ܶ") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-4179)) ^ (-1712108564);
                        i6 = 460248178;
                    } else {
                        iM3169 = (C0619.m2761("ۢۘ") ^ i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i5 = ((iM3169 ^ i4) * (-30461)) ^ 830082003;
                        i6 = -661574517;
                    }
                    break;
                case -1750864732:
                case -439176406:
                    if (C2834.f9334 <= 0) {
                        iM3169 = C0773.m3169("֨ܶ") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-4179)) ^ (-1712108564);
                        i6 = 460248178;
                    } else {
                        iM3169 = (C0773.m3169("۫֫") ^ i3) * (-81);
                        i5 = ((iM3169 ^ i4) * 675) ^ 1085002597;
                        i6 = -554128567;
                    }
                    break;
                case -1724066125:
                case -226604285:
                    decoratedTop = this.f32470.getDecoratedTop(viewFindViewByPosition);
                    if (RunnableC3055.f9898 >= 0) {
                        iM3169 = (C0619.m2761("ۢۘ") ^ i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i5 = ((iM3169 ^ i4) * (-30461)) ^ 830082003;
                        i6 = -661574517;
                    } else {
                        iM3169 = C0619.m2761("᩷֨") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-12871)) ^ (-1164061303);
                        i6 = -991250887;
                    }
                    break;
                case -1468060712:
                case 1091582903:
                    if (C2419.f7754 >= 0) {
                        iM3169 = (C0619.m2761("ۢۘ") ^ i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i5 = ((iM3169 ^ i4) * (-30461)) ^ 830082003;
                        i6 = -661574517;
                    } else {
                        iM3169 = C0773.m3169("᩸᩷") ^ i4;
                        i5 = ((iM3169 ^ i3) * 15643) ^ 486279732;
                        i6 = 2026780694;
                    }
                    break;
                case -1237747975:
                case 523321211:
                    this.f32470.m2267(i);
                    break;
                case -1191314419:
                case 1551144451:
                    if (((C14614) C3690.m11990(arrayList, i)).f46028 == iM26196) {
                        iM3169 = C0619.m2761("᩶ۤ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 1073) ^ 283227268;
                        i6 = 1234111648;
                    } else {
                        iM3169 = (C0619.m2761("ۧܰ") + i4) * (-123);
                        i5 = ((iM3169 ^ i3) * (-1153)) ^ 1377548371;
                        i6 = 1906581186;
                    }
                    break;
                case -1064298022:
                case -1044098978:
                    iM9482 = C2878.m9482(c25228);
                    if (C1542.m5459() >= 0) {
                        iM3169 = (C0773.m3169("ۡ۬") ^ i3) * 109;
                        i5 = ((iM3169 ^ i4) * 11295) ^ (-1634207803);
                        i6 = 266547697;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ۛۙ")) * 7;
                        i5 = ((iM3169 ^ i4) * 28063) ^ 1095096588;
                        i6 = 78959001;
                    }
                    break;
                case -1048868842:
                case 526069994:
                    if (C3448.f11240 >= 0) {
                        iM3169 = C0619.m2761("ܺۧ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-27099)) ^ (-1007528486);
                        i6 = -2079677145;
                    } else {
                        iM3169 = (C0773.m3169("ܺۘ") + i4) * (-15);
                        i5 = ((iM3169 ^ i3) * 30095) ^ 1484652322;
                        i6 = 1667942729;
                    }
                    break;
                case -1017535876:
                case 1619126807:
                    if (z) {
                        iM3169 = (C0619.m2761("᩻ܳ") ^ i4) * 5;
                        i5 = ((iM3169 ^ i3) * 22307) ^ (-2029199315);
                        i6 = 706727553;
                    } else {
                        iM3169 = (i3 - C0619.m2761("۫ۢ")) * (-31);
                        i5 = ((iM3169 ^ i4) * (-28763)) ^ (-151214676);
                        i6 = 1732193652;
                    }
                    break;
                case -959466198:
                case 2098962068:
                    decoratedBottom = this.f32470.getDecoratedBottom(viewFindViewByPosition);
                    if (C1783.f6087 <= 0) {
                        iM3169 = (C0773.m3169("֡ۖ") ^ i4) * 99;
                        i5 = ((iM3169 ^ i3) * 27651) ^ (-1072653018);
                        i6 = -498756667;
                    } else {
                        iM3169 = C0773.m3169("ۜ᩷") ^ i4;
                        i5 = ((iM3169 ^ i3) * 13353) ^ (-1420538998);
                        i6 = -166663825;
                    }
                    break;
                case -878368197:
                case 1459783759:
                    viewFindViewByPosition = this.f32470.findViewByPosition(i);
                    if (viewFindViewByPosition != null) {
                        iM3169 = C0619.m2761("ۨ᩸") ^ i3;
                        i5 = ((iM3169 ^ i4) * 11505) ^ 1377730081;
                        i6 = 2024484449;
                    } else {
                        iM3169 = (C0773.m3169("۟ܶ") + i3) * 95;
                        i5 = ((iM3169 ^ i4) * 4831) ^ (-508631437);
                        i6 = 1503168549;
                    }
                    break;
                case -864350265:
                case 629428901:
                    c25227 = this.f32450;
                    if (c25227 == null) {
                        iM3169 = C0619.m2761("ܿܿ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 24357) ^ 411261187;
                        i6 = -744996330;
                    } else {
                        iM3169 = C0773.m3169("ܶ᩺") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-10785)) ^ (-23529011);
                        i6 = -996938586;
                    }
                    break;
                case -815412331:
                case 1911043592:
                    if (decoratedBottom <= iM9482 - this.f32450.getPaddingBottom()) {
                        iM3169 = C0619.m2761("ܿܿ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 24357) ^ 411261187;
                        i6 = -744996330;
                    } else {
                        iM3169 = (C0773.m3169("۟ܶ") + i3) * 95;
                        i5 = ((iM3169 ^ i4) * 4831) ^ (-508631437);
                        i6 = 1503168549;
                    }
                    break;
                case -743145684:
                case 572143620:
                    arrayList = this.f32457;
                    if (i < C2288.m7752(arrayList)) {
                        iM3169 = (C0773.m3169("᩺ܺ") + i4) * 93;
                        i5 = ((iM3169 ^ i3) * (-30483)) ^ 1610850895;
                        i6 = -1387634726;
                    } else {
                        iM3169 = C0619.m2761("ܿܿ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 24357) ^ 411261187;
                        i6 = -744996330;
                    }
                    break;
                case -603138798:
                case 267999213:
                    this.f32450.stopScroll();
                    if (C2878.m9491() <= 0) {
                        iM3169 = C0773.m3169("֨ܶ") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-4179)) ^ (-1712108564);
                        i6 = 460248178;
                    } else {
                        iM3169 = C0619.m2761("֫ܽ") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-2057)) ^ 1558889805;
                        i6 = 1757885699;
                    }
                    break;
                case -426254517:
                case 322125972:
                    if (C0773.m3161() != 0) {
                        iM3169 = C0619.m2761("ܺۧ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-27099)) ^ (-1007528486);
                        i6 = -2079677145;
                    } else {
                        iM3169 = (C0773.m3169("ۢ۬") + i4) * 23;
                        i5 = ((iM3169 ^ i3) * (-14325)) ^ 1402295085;
                        i6 = -1735008321;
                    }
                    break;
                case -347256526:
                case 1498230788:
                    break;
                case -217920190:
                case 1509313003:
                    if (decoratedTop >= this.f32450.getPaddingTop()) {
                        iM3169 = (C0619.m2761("۟ܳ") ^ i3) * (-45);
                        i5 = ((iM3169 ^ i4) * (-8277)) ^ (-754428603);
                        i6 = -442919258;
                    } else {
                        iM3169 = (C0773.m3169("۟ܶ") + i3) * 95;
                        i5 = ((iM3169 ^ i4) * 4831) ^ (-508631437);
                        i6 = 1503168549;
                    }
                    break;
                case -170375630:
                case 2073380954:
                    this.f32470.scrollToPosition(i);
                    break;
                case 119984265:
                case 766075938:
                    AbstractC3624.m11755();
                    RunnableC1848.m6360();
                    iM3169 = (C0773.m3169("֡ۖ") ^ i4) * 99;
                    i5 = ((iM3169 ^ i3) * 27651) ^ (-1072653018);
                    i6 = -498756667;
                    break;
                case 249550392:
                case 1303959086:
                    C2702.m8876();
                    if (AbstractC0641.f2496 >= 0) {
                        iM3169 = (C0619.m2761("ۢۘ") ^ i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i5 = ((iM3169 ^ i4) * (-30461)) ^ 830082003;
                        i6 = -661574517;
                    } else {
                        iM3169 = (C0619.m2761("ܺᩴ") ^ i4) * 79;
                        i5 = ((iM3169 ^ i3) * (-161)) ^ 675898448;
                        i6 = 2072148638;
                    }
                    break;
                case 506275766:
                case 1313243984:
                    c25227.setItemAnimator(null);
                    if (z) {
                        iM3169 = (C0619.m2761("ܿ᩸") + i4) * 35;
                        i5 = ((iM3169 ^ i3) * (-2431)) ^ 1866954046;
                        i6 = -6881311;
                    } else {
                        iM3169 = C0619.m2761("᩶ܽ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 25793) ^ (-1849961308);
                        i6 = -991828657;
                    }
                    break;
                case 560798151:
                case 1175264049:
                    C1080.m4050();
                    C2287.m7745();
                    break;
                case 927224411:
                case 1764576985:
                    if (C23916.f77426 <= 0) {
                        iM3169 = (C0773.m3169("ۡ۬") ^ i3) * 109;
                        i5 = ((iM3169 ^ i4) * 11295) ^ (-1634207803);
                        i6 = 266547697;
                    } else {
                        iM3169 = (C0773.m3169("ۛۘ") + i3) * (-23);
                        i5 = ((iM3169 ^ i4) * (-24823)) ^ 319007160;
                        i6 = 1203788273;
                    }
                    break;
                case 999239622:
                case 1772861524:
                    this.f32450.stopScroll();
                    if (C0950.f3488 >= 0) {
                        iM3169 = (C0773.m3169("֡ۖ") ^ i4) * 99;
                        i5 = ((iM3169 ^ i3) * 27651) ^ (-1072653018);
                        i6 = -498756667;
                    } else {
                        iM3169 = C0773.m3169("ۛܽ") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-27249)) ^ 145609279;
                        i6 = -2110905990;
                    }
                    break;
                case 1041673607:
                case 1796195255:
                    c25228 = this.f32450;
                    if (C2288.f7433 <= 0) {
                        iM3169 = C0619.m2761("ܺۧ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-27099)) ^ (-1007528486);
                        i6 = -2079677145;
                    } else {
                        iM3169 = (C0773.m3169("ۛܶ") ^ i3) * (-25);
                        i5 = ((iM3169 ^ i4) * 3951) ^ (-2122848096);
                        i6 = -1326511487;
                    }
                    break;
                case 1420526489:
                case 1509759755:
                    this.f32470.m2266();
                    iM3169 = (C0619.m2761("ܿ᩸") + i4) * 35;
                    i5 = ((iM3169 ^ i3) * (-2431)) ^ 1866954046;
                    i6 = -6881311;
                    break;
                default:
                    if (!C3077.f9998) {
                        iM3169 = (C0773.m3169("֡ۖ") ^ i4) * 99;
                        i5 = ((iM3169 ^ i3) * 27651) ^ (-1072653018);
                        i6 = -498756667;
                    } else {
                        iM3169 = (C0619.m2761("ܺᩴ") ^ i4) * 79;
                        i5 = ((iM3169 ^ i3) * (-161)) ^ 675898448;
                        i6 = 2072148638;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m26166(final String str, final int i, boolean z, boolean z2) {
        View view = null;
        int i2 = 488885094;
        int i3 = C2834.f9334;
        int i4 = C1542.f5343;
        int iM3169 = C0773.m3169("֨᩸") ^ i4;
        int i5 = ((iM3169 ^ i3) * 25463) ^ 1517470127;
        int i6 = 544522093;
        while (true) {
            i2 = ((((i2 ^ i3) * (-7103)) >> 31) & i5) ^ (iM3169 ^ i6);
            switch (i2) {
                case -1877136213:
                case 1130189810:
                    if (C3448.f11240 < 0) {
                        iM3169 = C0619.m2761("ܽ᩶") ^ i4;
                        i5 = ((iM3169 ^ i3) * 5407) ^ 1283963738;
                        i6 = -724109935;
                    } else {
                        iM3169 = C0773.m3169("᩷֡") ^ i4;
                        i5 = ((iM3169 ^ i3) * 27821) ^ (-1740277856);
                        i6 = 1435947021;
                    }
                    break;
                case -1648898204:
                case -1013503419:
                    C2966.m9664();
                    RunnableC3646.m11813();
                    iM3169 = C0773.m3169("᩷֡") ^ i4;
                    i5 = ((iM3169 ^ i3) * 27821) ^ (-1740277856);
                    i6 = 1435947021;
                    break;
                case -1630455707:
                case 1444262355:
                    if (C1343.f4799 != 0) {
                        iM3169 = (i3 - C0619.m2761("ۖ᩸")) * 93;
                        i5 = ((iM3169 ^ i4) * (-4341)) ^ (-1398650361);
                        i6 = 1567448669;
                    } else {
                        iM3169 = (C0773.m3169("۠᩹") ^ i3) * (-45);
                        i5 = ((iM3169 ^ i4) * (-16071)) ^ (-1517785821);
                        i6 = -422237559;
                    }
                    break;
                case -1512444594:
                case -983994499:
                    if (C3998.f13671 != 0) {
                        iM3169 = C0773.m3169("᩷֡") ^ i4;
                        i5 = ((iM3169 ^ i3) * 27821) ^ (-1740277856);
                        i6 = 1435947021;
                    } else {
                        iM3169 = C0619.m2761("ۢۧ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-9359)) ^ (-369617620);
                        i6 = -1728329544;
                    }
                    break;
                case -1501607858:
                case -1092362088:
                    if (C3734.f12817 >= 0) {
                        iM3169 = (i3 - C0619.m2761("ۖ᩸")) * 93;
                        i5 = ((iM3169 ^ i4) * (-4341)) ^ (-1398650361);
                        i6 = 1567448669;
                    } else {
                        iM3169 = (C0773.m3169("ۧ᩺") ^ i3) * 57;
                        i5 = ((iM3169 ^ i4) * 21525) ^ (-1570900530);
                        i6 = 183617505;
                    }
                    break;
                case -1381939542:
                case -1132684777:
                    if (C20932.f66974 <= 0) {
                        iM3169 = (i4 - C0619.m2761("ۤܰ")) * (-57);
                        i5 = ((iM3169 ^ i3) * 24633) ^ (-555304122);
                        i6 = -8851853;
                    } else {
                        iM3169 = (C0773.m3169("᩺۟") + i3) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i5 = ((iM3169 ^ i4) * (-29769)) ^ (-797026496);
                        i6 = 638876006;
                    }
                    break;
                case -1361900726:
                case 1763030673:
                    if (C3033.f9831 >= 0) {
                        iM3169 = C0619.m2761("ܽ᩶") ^ i4;
                        i5 = ((iM3169 ^ i3) * 5407) ^ 1283963738;
                        i6 = -724109935;
                    } else {
                        iM3169 = C0619.m2761("ᩳۛ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 3443) ^ (-989401193);
                        i6 = -1927024726;
                    }
                    break;
                case -1002367666:
                case -113393019:
                    if (C3734.f12817 >= 0) {
                        iM3169 = C0773.m3169("᩷֡") ^ i4;
                        i5 = ((iM3169 ^ i3) * 27821) ^ (-1740277856);
                        i6 = 1435947021;
                    } else {
                        iM3169 = C0773.m3169("֫ۛ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 16161) ^ (-78613398);
                        i6 = 437463406;
                    }
                    break;
                case -676159187:
                case -383673944:
                    if (C11235.f35427 >= 0) {
                        iM3169 = (i4 - C0619.m2761("ۤܰ")) * (-57);
                        i5 = ((iM3169 ^ i3) * 24633) ^ (-555304122);
                        i6 = -8851853;
                    } else {
                        iM3169 = (C0619.m2761("ۖۗ") + i4) * (-51);
                        i5 = ((iM3169 ^ i3) * 961) ^ (-346711025);
                        i6 = -953914745;
                    }
                    break;
                case -198994385:
                case 1551159850:
                    final int i7 = this.f32468;
                    this.f32482.post(new Runnable(this) { // from class: l.ۨ۬֫

                        /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ C10139 f39745;

                        {
                            int i8 = 1393283494;
                            int i9 = C3690.f12684;
                            int i10 = C4238.f15451;
                            int iM31610 = C0773.m3169("ۛ᩻") ^ i9;
                            int i11 = ((iM31610 ^ i10) * (-30375)) ^ (-812866035);
                            int i12 = 952563124;
                            while (true) {
                                i8 = ((((i8 ^ i10) * 10181) >> 31) & i11) ^ (iM31610 ^ i12);
                                switch (i8) {
                                    case -2058979130:
                                    case -1920689557:
                                        return;
                                    case -1984297521:
                                    case -188299437:
                                        C0619.m2763();
                                        if (C23916.m53419() == 0) {
                                            iM31610 = (C0773.m3169("۠᩺") + i10) * (-119);
                                            i11 = ((iM31610 ^ i9) * 10319) ^ 157000838;
                                            i12 = -847019116;
                                        } else {
                                            iM31610 = C0773.m3169("۠֫") ^ i9;
                                            i11 = ((iM31610 ^ i10) * 10719) ^ 1922237181;
                                            i12 = 1002380477;
                                        }
                                        break;
                                    case -1951021675:
                                    case 2058591232:
                                        if (RunnableC0334.m2063()) {
                                            iM31610 = C0773.m3169("۟ۜ") ^ i10;
                                            i11 = ((iM31610 ^ i9) * 5105) ^ 476937416;
                                            i12 = 1057874747;
                                        } else {
                                            iM31610 = (C0773.m3169("᩻᩶") + i10) * 77;
                                            i11 = ((iM31610 ^ i9) * (-23911)) ^ (-1891377824);
                                            i12 = -647406619;
                                        }
                                        break;
                                    case -1881096697:
                                    case -1545539514:
                                        if (!C1321.m4852()) {
                                            iM31610 = (C0619.m2761("ܽۧ") ^ i9) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                            i11 = ((iM31610 ^ i10) * (-13695)) ^ (-313815255);
                                            i12 = -1641148121;
                                        } else {
                                            iM31610 = (C0773.m3169("۠᩺") + i10) * (-119);
                                            i11 = ((iM31610 ^ i9) * 10319) ^ 157000838;
                                            i12 = -847019116;
                                        }
                                        break;
                                    case -1227245384:
                                    case 104160212:
                                        this.f39745 = this;
                                        if (C3734.m12152() >= 0) {
                                            iM31610 = C0773.m3169("۠֫") ^ i9;
                                            i11 = ((iM31610 ^ i10) * 10719) ^ 1922237181;
                                            i12 = 1002380477;
                                        } else {
                                            iM31610 = (C0619.m2761("᩵ۜ") + i10) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                            i11 = ((iM31610 ^ i9) * 5095) ^ (-224786738);
                                            i12 = 1243521629;
                                        }
                                        break;
                                    case -1201280531:
                                    case -311370093:
                                        if (C2310.f7472 >= 0) {
                                            iM31610 = C0773.m3169("۠֫") ^ i9;
                                            i11 = ((iM31610 ^ i10) * 10719) ^ 1922237181;
                                            i12 = 1002380477;
                                        } else {
                                            iM31610 = (i9 - C0773.m3169("ۧ֡")) * 33;
                                            i11 = ((iM31610 ^ i10) * (-3905)) ^ 1340450733;
                                            i12 = -68584157;
                                        }
                                        break;
                                    case -978822955:
                                    case 88901398:
                                        C1321.m4852();
                                        C13473.m33144();
                                        throw new RuntimeException();
                                    case -898065016:
                                    case -21211408:
                                        if (C1826.f6190 <= 0) {
                                            iM31610 = (C0773.m3169("۠᩺") + i10) * (-119);
                                            i11 = ((iM31610 ^ i9) * 10319) ^ 157000838;
                                            i12 = -847019116;
                                        } else {
                                            iM31610 = (C0619.m2761("᩷ܰ") ^ i10) * 39;
                                            i11 = ((iM31610 ^ i9) * 26485) ^ (-1403391771);
                                            i12 = -1344366384;
                                        }
                                        break;
                                    case -822886916:
                                    case 1448790487:
                                        if (C1519.f5300 >= 0) {
                                            iM31610 = C0773.m3169("۟ۜ") ^ i10;
                                            i11 = ((iM31610 ^ i9) * 5105) ^ 476937416;
                                            i12 = 1057874747;
                                        } else {
                                            iM31610 = (C0773.m3169("ۗ۬") ^ i9) * 39;
                                            i11 = ((iM31610 ^ i10) * (-22383)) ^ 616324649;
                                            i12 = 1197482102;
                                        }
                                        break;
                                    case -797142075:
                                    case -303687466:
                                        if (C2287.f7432 >= 0) {
                                            iM31610 = (C0619.m2761("ܽۧ") ^ i9) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                            i11 = ((iM31610 ^ i10) * (-13695)) ^ (-313815255);
                                            i12 = -1641148121;
                                        } else {
                                            iM31610 = (C0773.m3169("᩵ܽ") ^ i9) * (-83);
                                            i11 = ((iM31610 ^ i10) * 10785) ^ 1733437211;
                                            i12 = -1720194771;
                                        }
                                        break;
                                    case -572476721:
                                    case 614517884:
                                        C4282.m13644();
                                        C3734.m12152();
                                        iM31610 = C0773.m3169("۠֫") ^ i9;
                                        i11 = ((iM31610 ^ i10) * 10719) ^ 1922237181;
                                        i12 = 1002380477;
                                        break;
                                    case -546334553:
                                    case 1338062365:
                                        C0862.m3503();
                                        if (C1080.f3865 >= 0) {
                                            iM31610 = C0773.m3169("۟ۜ") ^ i10;
                                            i11 = ((iM31610 ^ i9) * 5105) ^ 476937416;
                                            i12 = 1057874747;
                                        } else {
                                            iM31610 = (C0773.m3169("۠᩺") + i10) * (-119);
                                            i11 = ((iM31610 ^ i9) * 10319) ^ 157000838;
                                            i12 = -847019116;
                                        }
                                        break;
                                    case -201843323:
                                    case 796203089:
                                        if (C3099.m10095()) {
                                            iM31610 = C0773.m3169("ᩳ۫") ^ i9;
                                            i11 = ((iM31610 ^ i10) * 12331) ^ 1832141850;
                                            i12 = -1324300865;
                                        } else {
                                            iM31610 = (C0773.m3169("ۖᩴ") ^ i9) * 47;
                                            i11 = ((iM31610 ^ i10) * (-7717)) ^ (-1337568124);
                                            i12 = 54113801;
                                        }
                                        break;
                                    case 25134661:
                                    case 201712959:
                                        if (C1826.f6190 <= 0) {
                                            iM31610 = C0773.m3169("۠֫") ^ i9;
                                            i11 = ((iM31610 ^ i10) * 10719) ^ 1922237181;
                                            i12 = 1002380477;
                                        } else {
                                            iM31610 = C0619.m2761("ۜۨ") ^ i10;
                                            i11 = ((iM31610 ^ i9) * (-30801)) ^ (-654651699);
                                            i12 = -1811045792;
                                        }
                                        break;
                                    case 582632645:
                                    case 1239554211:
                                        if (C17202.f56030) {
                                            iM31610 = (C0773.m3169("ܰܰ") ^ i9) * 79;
                                            i11 = ((iM31610 ^ i10) * 22075) ^ 306451947;
                                            i12 = -1819479984;
                                        } else {
                                            iM31610 = C0773.m3169("۟ۜ") ^ i10;
                                            i11 = ((iM31610 ^ i9) * 5105) ^ 476937416;
                                            i12 = 1057874747;
                                        }
                                        break;
                                    default:
                                        if (C1080.f3865 >= 0) {
                                            iM31610 = C0773.m3169("۠֫") ^ i9;
                                            i11 = ((iM31610 ^ i10) * 10719) ^ 1922237181;
                                            i12 = 1002380477;
                                        } else {
                                            iM31610 = C0773.m3169("᩸۟") ^ i10;
                                            i11 = ((iM31610 ^ i9) * (-26475)) ^ (-1002911251);
                                            i12 = 2017967026;
                                        }
                                        break;
                                }
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i8 = 0;
                            String str2 = null;
                            int i9 = 2018294417;
                            int i10 = C0269.f1558;
                            int i11 = C0773.f2792;
                            int iM2761 = (C0619.m2761("ۖ᩹") ^ i11) * (-75);
                            int i12 = ((iM2761 ^ i10) * 26305) ^ 77039252;
                            int i13 = -422616330;
                            while (true) {
                                i9 = ((((i9 ^ i10) * (-8759)) >> 31) & i12) ^ (iM2761 ^ i13);
                                switch (i9) {
                                    case -2106500907:
                                    case -236874038:
                                        if (AbstractC3624.m11755() != 0) {
                                            iM2761 = (C0773.m3169("ۨ۠") ^ i10) * 71;
                                            i12 = ((iM2761 ^ i11) * 507) ^ 1572286348;
                                            i13 = -439683250;
                                        } else {
                                            iM2761 = C0619.m2761("᩶ۢ") ^ i10;
                                            i12 = ((iM2761 ^ i11) * 30049) ^ 1417730656;
                                            i13 = 1555092586;
                                        }
                                        break;
                                    case -2051037782:
                                    case 1025761383:
                                        C2288.m7767();
                                        C0862.m3503();
                                        break;
                                    case -1924747228:
                                    case -238803907:
                                        i8 = i7;
                                        if (C0619.m2763()) {
                                            iM2761 = (i11 - C0773.m3169("᩻ܺ")) * 5;
                                            i12 = ((iM2761 ^ i10) * 3273) ^ (-1283471183);
                                            i13 = 1961060095;
                                        } else {
                                            iM2761 = (C0773.m3169("ᩴۘ") + i11) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                                            i12 = ((iM2761 ^ i10) * (-32289)) ^ 1730967239;
                                            i13 = -1314966305;
                                        }
                                        break;
                                    case -1818188663:
                                    case -1199192088:
                                        C10139.m26179(this.f39745, i, i8, str2);
                                        break;
                                    case -1784073529:
                                    case 490546755:
                                        if (C2310.f7472 >= 0) {
                                            iM2761 = (i10 - C0619.m2761("ܽۚ")) * 95;
                                            i12 = ((iM2761 ^ i11) * 2797) ^ (-1120551965);
                                            i13 = -1190842342;
                                        } else {
                                            iM2761 = C0619.m2761("ۗ۟") ^ i11;
                                            i12 = ((iM2761 ^ i10) * (-21287)) ^ (-1076852714);
                                            i13 = -888711732;
                                        }
                                        break;
                                    case -1620320715:
                                    case -1181091955:
                                        if (C1080.f3865 >= 0) {
                                            iM2761 = (i11 - C0773.m3169("᩻ܺ")) * 5;
                                            i12 = ((iM2761 ^ i10) * 3273) ^ (-1283471183);
                                            i13 = 1961060095;
                                        } else {
                                            iM2761 = (i10 - C0773.m3169("ܿ֡")) * 51;
                                            i12 = ((iM2761 ^ i11) * 7639) ^ (-1887706283);
                                            i13 = 460538418;
                                        }
                                        break;
                                    case -1595533100:
                                    case -1120747845:
                                        if (C0773.m3161() != 0) {
                                            iM2761 = (i11 - C0773.m3169("᩻ܺ")) * 5;
                                            i12 = ((iM2761 ^ i10) * 3273) ^ (-1283471183);
                                            i13 = 1961060095;
                                        } else {
                                            iM2761 = (C0619.m2761("ۜ۫") + i11) * 123;
                                            i12 = ((iM2761 ^ i10) * 4943) ^ 1195105574;
                                            i13 = -1862521283;
                                        }
                                        break;
                                    case -482209462:
                                    case 523546560:
                                        if (C23916.f77426 <= 0) {
                                            iM2761 = (i10 - C0773.m3169("۫ܰ")) * (-91);
                                            i12 = ((iM2761 ^ i11) * 32585) ^ (-1765379090);
                                            i13 = 253056709;
                                        } else {
                                            iM2761 = C0773.m3169("۫ۛ") ^ i10;
                                            i12 = ((iM2761 ^ i11) * (-1707)) ^ 584049969;
                                            i13 = -1837827084;
                                        }
                                        break;
                                    case -355923671:
                                    case 1240156237:
                                        RunnableC1848.m6360();
                                        if (C2375.f7641 > 0) {
                                            iM2761 = (C0773.m3169("᩹۟") ^ i11) * 93;
                                            i12 = ((iM2761 ^ i10) * (-24089)) ^ 438979969;
                                            i13 = -811032227;
                                        } else {
                                            iM2761 = (i10 - C0773.m3169("۫ܰ")) * (-91);
                                            i12 = ((iM2761 ^ i11) * 32585) ^ (-1765379090);
                                            i13 = 253056709;
                                        }
                                        break;
                                    case -56886516:
                                    case 869897156:
                                        if (AbstractC3624.f12429 > 0) {
                                            iM2761 = (i11 - C0773.m3169("᩻ܺ")) * 5;
                                            i12 = ((iM2761 ^ i10) * 3273) ^ (-1283471183);
                                            i13 = 1961060095;
                                        } else {
                                            iM2761 = (i10 - C0773.m3169("۫ܰ")) * (-91);
                                            i12 = ((iM2761 ^ i11) * 32585) ^ (-1765379090);
                                            i13 = 253056709;
                                        }
                                        break;
                                    case 687830498:
                                    case 701253051:
                                        if (C3077.f9998) {
                                            iM2761 = (C0773.m3169("۟ۢ") + i10) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                                            i12 = ((iM2761 ^ i11) * 4427) ^ 181126891;
                                            i13 = 1859533302;
                                        } else {
                                            iM2761 = (i11 - C0773.m3169("᩻ܺ")) * 5;
                                            i12 = ((iM2761 ^ i10) * 3273) ^ (-1283471183);
                                            i13 = 1961060095;
                                        }
                                        break;
                                    case 752761443:
                                    case 1945466713:
                                        if (C2702.f8586 <= 0) {
                                            iM2761 = (C0773.m3169("ۨ۠") ^ i10) * 71;
                                            i12 = ((iM2761 ^ i11) * 507) ^ 1572286348;
                                            i13 = -439683250;
                                        } else {
                                            iM2761 = C0619.m2761("ۛ᩸") ^ i10;
                                            i12 = ((iM2761 ^ i11) * 21877) ^ 686390211;
                                            i13 = -1158724571;
                                        }
                                        break;
                                    case 1202078462:
                                    case 1802081592:
                                        if (C23916.f77426 <= 0) {
                                            iM2761 = (C0773.m3169("ۨ۠") ^ i10) * 71;
                                            i12 = ((iM2761 ^ i11) * 507) ^ 1572286348;
                                            i13 = -439683250;
                                        } else {
                                            iM2761 = (i11 - C0773.m3169("ۛܺ")) * (-23);
                                            i12 = ((iM2761 ^ i10) * (-20613)) ^ 2100313485;
                                            i13 = -1394456262;
                                        }
                                        break;
                                    case 1611421506:
                                    case 1905339701:
                                        str2 = str;
                                        if (C3779.m12264()) {
                                            iM2761 = (C0773.m3169("ܺۤ") ^ i11) * (-49);
                                            i12 = ((iM2761 ^ i10) * (-9209)) ^ (-2134091969);
                                            i13 = -1677520476;
                                        } else {
                                            iM2761 = (C0773.m3169("ۨ۠") ^ i10) * 71;
                                            i12 = ((iM2761 ^ i11) * 507) ^ 1572286348;
                                            i13 = -439683250;
                                        }
                                        break;
                                    case 1763090971:
                                    case 1820969294:
                                        C1321.m4852();
                                        iM2761 = (i10 - C0773.m3169("۫ܰ")) * (-91);
                                        i12 = ((iM2761 ^ i11) * 32585) ^ (-1765379090);
                                        i13 = 253056709;
                                        break;
                                    default:
                                        AbstractC0641.m2813();
                                        if (AbstractC0116.m1243() == 0) {
                                            iM2761 = (i10 - C0619.m2761("ܽۚ")) * 95;
                                            i12 = ((iM2761 ^ i11) * 2797) ^ (-1120551965);
                                            i13 = -1190842342;
                                        } else {
                                            iM2761 = (C0773.m3169("᩹۟") ^ i11) * 93;
                                            i12 = ((iM2761 ^ i10) * (-24089)) ^ 438979969;
                                            i13 = -811032227;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    iM3169 = C0619.m2761("ۨܶ") ^ i3;
                    i5 = ((iM3169 ^ i4) * 30605) ^ 1560915785;
                    i6 = 796507658;
                    break;
                case -172913483:
                case 485763627:
                    C2375.m8065();
                    break;
                case -154268766:
                case -37943538:
                    RunnableC3055.m9933();
                    if (C3033.m9845() <= 0) {
                        iM3169 = (i3 - C0619.m2761("ۖ᩸")) * 93;
                        i5 = ((iM3169 ^ i4) * (-4341)) ^ (-1398650361);
                        i6 = 1567448669;
                    } else {
                        iM3169 = C0619.m2761("ܽ᩶") ^ i4;
                        i5 = ((iM3169 ^ i3) * 5407) ^ 1283963738;
                        i6 = -724109935;
                    }
                    break;
                case -94989080:
                case 1295567347:
                    if (C17202.m40372()) {
                        iM3169 = (i4 - C0773.m3169("ۗ۠")) * 67;
                        i5 = ((iM3169 ^ i3) * (-28401)) ^ (-260608501);
                        i6 = 321160422;
                    } else {
                        iM3169 = (i4 - C0619.m2761("ۤܰ")) * (-57);
                        i5 = ((iM3169 ^ i3) * 24633) ^ (-555304122);
                        i6 = -8851853;
                    }
                    break;
                case 54301313:
                case 604521180:
                    if (C1564.f5401 <= 0) {
                        iM3169 = C0773.m3169("᩷֡") ^ i4;
                        i5 = ((iM3169 ^ i3) * 27821) ^ (-1740277856);
                        i6 = 1435947021;
                    } else {
                        iM3169 = (C0619.m2761("᩸᩺") + i4) * (-99);
                        i5 = ((iM3169 ^ i3) * (-24759)) ^ 1375102566;
                        i6 = -1946732696;
                    }
                    break;
                case 370939486:
                case 840646574:
                    if (C2419.m8174() >= 0) {
                        iM3169 = (i3 - C0619.m2761("ۖ᩸")) * 93;
                        i5 = ((iM3169 ^ i4) * (-4341)) ^ (-1398650361);
                        i6 = 1567448669;
                    } else {
                        iM3169 = (C0619.m2761("֡ۙ") ^ i3) * 75;
                        i5 = ((iM3169 ^ i4) * (-15881)) ^ (-136929929);
                        i6 = 2002513451;
                    }
                    break;
                case 464249683:
                case 662209647:
                    if (z) {
                        iM3169 = C0619.m2761("᩻ܳ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 5073) ^ 203872715;
                        i6 = 704391007;
                    } else {
                        iM3169 = C0773.m3169("ۗۧ") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-5851)) ^ 1650279020;
                        i6 = -1533149036;
                    }
                    break;
                case 777887361:
                case 1444428989:
                    C2485.m8358(view, 8);
                    C2485.m8358(this.f32476, 8);
                    iM3169 = C0619.m2761("᩻ܳ") ^ i3;
                    i5 = ((iM3169 ^ i4) * 5073) ^ 203872715;
                    i6 = 704391007;
                    break;
                case 1430472824:
                case 1723248279:
                    if (z2) {
                        iM3169 = (C0773.m3169("ܶᩳ") ^ i4) * (-9);
                        i5 = ((iM3169 ^ i3) * 28111) ^ (-1402852036);
                        i6 = 937436557;
                    } else {
                        iM3169 = C0619.m2761("ۨܶ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 30605) ^ 1560915785;
                        i6 = 796507658;
                    }
                    break;
                case 1431972398:
                case 2102565544:
                    if (C3492.f12043 <= 0) {
                        iM3169 = C0619.m2761("ܽ᩶") ^ i4;
                        i5 = ((iM3169 ^ i3) * 5407) ^ 1283963738;
                        i6 = -724109935;
                    } else {
                        iM3169 = C0619.m2761("۫ܶ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 23029) ^ 1743771760;
                        i6 = -1942457606;
                    }
                    break;
                case 1613813396:
                case 2012664279:
                    break;
                default:
                    view = this.f32441;
                    if (view != null) {
                        iM3169 = (C0773.m3169("᩶ۤ") + i3) * 93;
                        i5 = ((iM3169 ^ i4) * (-8017)) ^ 456220234;
                        i6 = -1729384197;
                    } else {
                        iM3169 = C0619.m2761("᩻ܳ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 5073) ^ 203872715;
                        i6 = 704391007;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x01e2 A[PHI: r17
      0x01e2: PHI (r17v35 android.webkit.WebView) = 
      (r17v2 android.webkit.WebView)
      (r17v26 android.webkit.WebView)
      (r17v27 android.webkit.WebView)
      (r17v36 android.webkit.WebView)
     binds: [B:47:0x0177, B:55:0x01cb, B:51:0x01a1, B:44:0x016b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x0296 A[PHI: r6 r9 r10 r11 r17 r18
      0x0296: PHI (r6v4 short) = (r6v2 short), (r6v3 short), (r6v2 short) binds: [B:7:0x0056, B:70:0x0294, B:66:0x026c] A[DONT_GENERATE, DONT_INLINE]
      0x0296: PHI (r9v6 short[]) = (r9v5 short[]), (r9v2 short[]), (r9v2 short[]) binds: [B:7:0x0056, B:70:0x0294, B:66:0x026c] A[DONT_GENERATE, DONT_INLINE]
      0x0296: PHI (r10v6 int) = (r10v5 int), (r10v2 int), (r10v2 int) binds: [B:7:0x0056, B:70:0x0294, B:66:0x026c] A[DONT_GENERATE, DONT_INLINE]
      0x0296: PHI (r11v6 int) = (r11v5 int), (r11v2 int), (r11v2 int) binds: [B:7:0x0056, B:70:0x0294, B:66:0x026c] A[DONT_GENERATE, DONT_INLINE]
      0x0296: PHI (r17v20 android.webkit.WebView) = (r17v11 android.webkit.WebView), (r17v19 android.webkit.WebView), (r17v21 android.webkit.WebView) binds: [B:7:0x0056, B:70:0x0294, B:66:0x026c] A[DONT_GENERATE, DONT_INLINE]
      0x0296: PHI (r18v4 int) = (r18v3 int), (r18v3 int), (r18v5 int) binds: [B:7:0x0056, B:70:0x0294, B:66:0x026c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:87:0x035a A[PHI: r17
      0x035a: PHI (r17v42 android.webkit.WebView) = (r17v15 android.webkit.WebView), (r17v17 android.webkit.WebView), (r17v49 android.webkit.WebView) binds: [B:86:0x0358, B:78:0x0301, B:11:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0074, code lost:
    
        if (l.C0619.f2439 == false) goto L14;
     */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void m26179(l.C10139 r21, int r22, int r23, java.lang.String r24) {
        /*
            Method dump skipped, instruction units count: 1166
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10139.m26179(l.ۢ۬֫, int, int, java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:102:0x0396 A[PHI: r3
      0x0396: PHI (r3v3 java.util.ArrayList) = (r3v2 java.util.ArrayList), (r3v1 java.util.ArrayList) binds: [B:101:0x0394, B:17:0x0092] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:109:0x03ec A[PHI: r2 r9 r15 r16
      0x03ec: PHI (r2v3 java.util.ArrayList) = (r2v2 java.util.ArrayList), (r2v1 java.util.ArrayList), (r2v1 java.util.ArrayList) binds: [B:108:0x03ea, B:82:0x02ae, B:59:0x01ab] A[DONT_GENERATE, DONT_INLINE]
      0x03ec: PHI (r9v4 l.ܰ۬֫) = (r9v1 l.ܰ۬֫), (r9v3 l.ܰ۬֫), (r9v1 l.ܰ۬֫) binds: [B:108:0x03ea, B:82:0x02ae, B:59:0x01ab] A[DONT_GENERATE, DONT_INLINE]
      0x03ec: PHI (r15v7 java.util.ArrayList) = (r15v3 java.util.ArrayList), (r15v2 java.util.ArrayList), (r15v2 java.util.ArrayList) binds: [B:108:0x03ea, B:82:0x02ae, B:59:0x01ab] A[DONT_GENERATE, DONT_INLINE]
      0x03ec: PHI (r16v2 boolean) = (r16v1 boolean), (r16v1 boolean), (r16v3 boolean) binds: [B:108:0x03ea, B:82:0x02ae, B:59:0x01ab] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:113:0x041e  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:53:0x016f  */
    /* JADX WARN: Code duplicated, block: B:65:0x01cf A[PHI: r4 r10 r14 r25
      0x01cf: PHI (r4v4 l.ۘ۬֫) = (r4v2 l.ۘ۬֫), (r4v3 l.ۘ۬֫), (r4v2 l.ۘ۬֫), (r4v2 l.ۘ۬֫), (r4v2 l.ۘ۬֫) binds: [B:64:0x01cd, B:47:0x0137, B:33:0x00d8, B:20:0x0098, B:17:0x0092] A[DONT_GENERATE, DONT_INLINE]
      0x01cf: PHI (r10v4 java.util.Set) = (r10v2 java.util.Set), (r10v2 java.util.Set), (r10v3 java.util.Set), (r10v2 java.util.Set), (r10v2 java.util.Set) binds: [B:64:0x01cd, B:47:0x0137, B:33:0x00d8, B:20:0x0098, B:17:0x0092] A[DONT_GENERATE, DONT_INLINE]
      0x01cf: PHI (r14v5 l.ܰ۬֫) = (r14v2 l.ܰ۬֫), (r14v2 l.ܰ۬֫), (r14v4 l.ܰ۬֫), (r14v2 l.ܰ۬֫), (r14v2 l.ܰ۬֫) binds: [B:64:0x01cd, B:47:0x0137, B:33:0x00d8, B:20:0x0098, B:17:0x0092] A[DONT_GENERATE, DONT_INLINE]
      0x01cf: PHI (r25v8 int) = (r25v4 int), (r25v3 int), (r25v3 int), (r25v3 int), (r25v3 int) binds: [B:64:0x01cd, B:47:0x0137, B:33:0x00d8, B:20:0x0098, B:17:0x0092] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x0255 A[PHI: r6 r12
      0x0255: PHI (r6v5 l.᩵ܿ᩷) = (r6v2 l.᩵ܿ᩷), (r6v3 l.᩵ܿ᩷), (r6v2 l.᩵ܿ᩷) binds: [B:72:0x023b, B:42:0x010c, B:5:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x0255: PHI (r12v4 l.᩻ᩳ᩷) = (r12v2 l.᩻ᩳ᩷), (r12v1 l.᩻ᩳ᩷), (r12v1 l.᩻ᩳ᩷) binds: [B:72:0x023b, B:42:0x010c, B:5:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:98:0x0361 A[PHI: r17
      0x0361: PHI (r17v4 int) = (r17v3 int), (r17v2 int) binds: [B:97:0x035f, B:14:0x008c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m26176(boolean z) {
        int iM2761;
        int i;
        int i2;
        int iM3169;
        int i3;
        int i4;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        boolean z2 = false;
        C18344 c18344 = null;
        C14614 c14614 = null;
        int i5 = 0;
        C25227 c25227 = null;
        C25227 c25228 = null;
        boolean z3 = false;
        int i6 = 1722824895;
        int i7 = C2287.f7432;
        int i8 = C2354.f7599;
        int iM2762 = C0619.m2761("ᩴۖ") ^ i8;
        int i9 = ((iM2762 ^ i7) * 26329) ^ 823889507;
        int i10 = iM2762 ^ (-633100174);
        boolean[] zArr = null;
        C4174 c4174 = null;
        Set set = null;
        C14614 c14615 = null;
        ArrayList arrayList3 = null;
        int iM8879 = 0;
        int i11 = 0;
        boolean z4 = false;
        int i12 = 0;
        Iterator itM13647 = null;
        C20729 c20729 = null;
        while (true) {
            i6 = i10 ^ (i9 & (((i6 ^ i7) * (-2687)) >> 31));
            switch (i6) {
                case -2123421331:
                case -1928824739:
                    if (C1321.f4751 < 0) {
                        arrayList = this.f32457;
                        arrayList3 = new ArrayList(arrayList);
                        if (C1826.f6190 <= 0) {
                            iM2761 = C0773.m3169("֫᩶") ^ i8;
                            i = ((iM2761 ^ i7) * 25347) ^ 1416713342;
                            i2 = 996048177;
                        } else {
                            iM2761 = (i8 - C0619.m2761("ۙۡ")) * 55;
                            i = ((iM2761 ^ i7) * 23933) ^ (-1120075864);
                            i2 = -1464003806;
                        }
                        i10 = iM2761 ^ i2;
                        i9 = i;
                    } else {
                        int iM2763 = (C0619.m2761("᩷᩸") ^ i7) * (-91);
                        i10 = iM2763 ^ 828824322;
                        i9 = ((iM2763 ^ i8) * (-2533)) ^ 1194266887;
                        arrayList3 = null;
                    }
                    break;
                case -2118510137:
                case 10294092:
                    i4 = iM8879;
                    zArr = new boolean[i4];
                    itM13647 = C4282.m13647(arrayList2);
                    iM3169 = (C0619.m2761("ۤۚ") ^ i7) * (-65);
                    iM8879 = i4;
                    i9 = ((iM3169 ^ i8) * 11847) ^ (-298363581);
                    i3 = 1481127274;
                    i10 = iM3169 ^ i3;
                    break;
                case -1674907106:
                case -845231253:
                    C2288.m7767();
                    if (C3033.f9831 >= 0) {
                        iM2761 = C0619.m2761("ۗ۫") ^ i8;
                        i = ((iM2761 ^ i7) * (-7921)) ^ 88596853;
                        i2 = 1041604973;
                    } else {
                        iM2761 = (i7 - C0773.m3169("᩷᩵")) * (-45);
                        i = ((iM2761 ^ i8) * 31973) ^ (-1454575082);
                        i2 = -1732970700;
                    }
                    i10 = iM2761 ^ i2;
                    i9 = i;
                    break;
                case -1654831713:
                case 1952764395:
                    RunnableC1848.m6368(c18344);
                    break;
                case -1516692619:
                case 1056916687:
                    int i13 = c14614.f46028;
                    i5 = c14614.f46025;
                    if (i5 < 0) {
                        i11 = i13;
                        z4 = z2;
                        iM2761 = (C0773.m3169("ᩴ۫") ^ i8) * 15;
                        i = ((iM2761 ^ i7) * 20473) ^ (-1163349455);
                        i2 = 574605515;
                        i10 = iM2761 ^ i2;
                        i9 = i;
                    } else {
                        iM3169 = C0773.m3169("ۧۛ") ^ i8;
                        i11 = i13;
                        i9 = ((iM3169 ^ i7) * 28725) ^ (-1016318915);
                        i3 = -1483188569;
                        i10 = iM3169 ^ i3;
                    }
                    break;
                case -1511127582:
                case -1421951350:
                    if (C1783.f6087 <= 0) {
                        iM2761 = C0619.m2761("ܺ֫") ^ i7;
                        i = ((iM2761 ^ i8) * (-6441)) ^ (-771975809);
                        i2 = -935213349;
                        i10 = iM2761 ^ i2;
                        i9 = i;
                    } else {
                        int iM2764 = (C0619.m2761("᩷᩸") ^ i7) * (-91);
                        i10 = iM2764 ^ 828824322;
                        i9 = ((iM2764 ^ i8) * (-2533)) ^ 1194266887;
                        arrayList3 = null;
                    }
                    break;
                case -1490052706:
                case 1730737830:
                    c14614.f46022 = !z3;
                    if (!z3) {
                        iM2761 = C0619.m2761("ۜۗ") ^ i7;
                        i = ((iM2761 ^ i8) * 26811) ^ 1777188738;
                        i2 = -1215560686;
                        i10 = iM2761 ^ i2;
                        i9 = i;
                    } else {
                        i4 = iM8879;
                        iM3169 = (C0619.m2761("ۤۚ") ^ i7) * (-65);
                        iM8879 = i4;
                        i9 = ((iM3169 ^ i8) * 11847) ^ (-298363581);
                        i3 = 1481127274;
                        i10 = iM3169 ^ i3;
                    }
                    break;
                case -1484072806:
                case -648964721:
                    c14614 = (C14614) C0950.m3796(itM13647);
                    if (C1321.f4751 >= 0) {
                        iM2761 = C0773.m3169("֫᩶") ^ i8;
                        i = ((iM2761 ^ i7) * 25347) ^ 1416713342;
                        i2 = 996048177;
                    } else {
                        iM2761 = C0619.m2761("ۧۡ") ^ i7;
                        i = ((iM2761 ^ i8) * (-533)) ^ 751178299;
                        i2 = 630086054;
                    }
                    i10 = iM2761 ^ i2;
                    i9 = i;
                    break;
                case -1395659910:
                case 1784510047:
                    C2834.m9332(arrayList);
                    arrayList2 = this.f32474;
                    if (C0269.f1558 <= 0) {
                        iM2761 = C0773.m3169("᩵ۘ") ^ i8;
                        i = ((iM2761 ^ i7) * (-31003)) ^ 1238854020;
                        i2 = -1909508693;
                    } else {
                        iM2761 = C0619.m2761("ۗᩴ") ^ i8;
                        i = ((iM2761 ^ i7) * 28011) ^ (-1729577657);
                        i2 = 541450392;
                    }
                    i10 = iM2761 ^ i2;
                    i9 = i;
                    break;
                case -1368034807:
                case 800048415:
                    C17202.m40372();
                    break;
                case -1341769140:
                case 384252424:
                    z3 = zArr[i12];
                    if (C1080.f3865 >= 0) {
                        iM2761 = C0773.m3169("֫᩶") ^ i8;
                        i = ((iM2761 ^ i7) * 25347) ^ 1416713342;
                        i2 = 996048177;
                    } else {
                        iM2761 = C0773.m3169("᩵֨") ^ i7;
                        i = ((iM2761 ^ i8) * (-25339)) ^ (-219699638);
                        i2 = 658193988;
                    }
                    i10 = iM2761 ^ i2;
                    i9 = i;
                    break;
                case -1339750539:
                case -400835458:
                    iM8879 = C2702.m8879(arrayList2);
                    if (C2834.f9334 <= 0) {
                        iM2761 = C0773.m3169("᩻ᩳ") ^ i8;
                        i = ((iM2761 ^ i7) * (-13851)) ^ 1561006028;
                        i2 = 1530089222;
                    } else {
                        iM2761 = C0773.m3169("ܰۨ") ^ i7;
                        i = ((iM2761 ^ i8) * (-30725)) ^ 822888400;
                        i2 = -2138412803;
                    }
                    i10 = iM2761 ^ i2;
                    i9 = i;
                    break;
                case -1335429993:
                case 1997118789:
                    c4174 = new C4174(this, arrayList3);
                    if (C2354.m7983()) {
                        iM2761 = (C0619.m2761("ۨ۟") ^ i8) * 35;
                        i = ((iM2761 ^ i7) * (-1015)) ^ (-670580233);
                        i2 = 1950697456;
                    } else {
                        iM2761 = C0773.m3169("ۨܶ") ^ i7;
                        i = ((iM2761 ^ i8) * 12049) ^ (-1357035470);
                        i2 = 1300858924;
                    }
                    i10 = iM2761 ^ i2;
                    i9 = i;
                    break;
                case -1302178389:
                case -1059208346:
                    if (set.contains(c14615.f46023)) {
                        iM2761 = (C0619.m2761("ۖ᩸") + i7) * 81;
                        i = ((iM2761 ^ i8) * 7557) ^ (-1757925216);
                        i2 = -876515465;
                    } else {
                        z4 = z2;
                        iM2761 = (C0773.m3169("ᩴ۫") ^ i8) * 15;
                        i = ((iM2761 ^ i7) * 20473) ^ (-1163349455);
                        i2 = 574605515;
                    }
                    i10 = iM2761 ^ i2;
                    i9 = i;
                    break;
                case -1291733051:
                case -62574710:
                    c18344 = this.f32475;
                    if (z) {
                        iM2761 = C0773.m3169("ܽܽ") ^ i7;
                        i = ((iM2761 ^ i8) * 27669) ^ (-1828709636);
                        i2 = 1498038189;
                    } else {
                        iM2761 = (C0773.m3169("ܰ۠") + i8) * 81;
                        i = ((iM2761 ^ i7) * 8855) ^ 1994609814;
                        i2 = -1970513762;
                    }
                    i10 = iM2761 ^ i2;
                    i9 = i;
                    break;
                case -1291140842:
                case -455417275:
                    C3448.m11248();
                    AbstractC3624.m11755();
                    iM2761 = C0619.m2761("ۗ۫") ^ i8;
                    i = ((iM2761 ^ i7) * (-7921)) ^ 88596853;
                    i2 = 1041604973;
                    i10 = iM2761 ^ i2;
                    i9 = i;
                    break;
                case -914855195:
                case 1791783150:
                    C8050.m21936(c4174, z2).m35496(c18344);
                    break;
                case -883947058:
                case 196045735:
                    if (C2966.f9654 >= 0) {
                        iM2761 = C0773.m3169("ۨܶ") ^ i7;
                        i = ((iM2761 ^ i8) * 12049) ^ (-1357035470);
                        i2 = 1300858924;
                    } else {
                        iM2761 = C0773.m3169("᩵ۘ") ^ i8;
                        i = ((iM2761 ^ i7) * (-31003)) ^ 1238854020;
                        i2 = -1909508693;
                    }
                    i10 = iM2761 ^ i2;
                    i9 = i;
                    break;
                case -829990420:
                case 1440317551:
                    c25228.setItemAnimator(null);
                    iM2761 = (i7 - C0773.m3169("᩵᩹")) * 7;
                    i = ((iM2761 ^ i8) * (-28725)) ^ (-1500053339);
                    i2 = 500395612;
                    i10 = iM2761 ^ i2;
                    i9 = i;
                    break;
                case -648198652:
                case -143057835:
                    c25227 = this.f32450;
                    if (c25227 != null) {
                        iM2761 = (i8 - C0619.m2761("֨ۘ")) * 101;
                        i = ((iM2761 ^ i7) * 4315) ^ (-1735743623);
                        i2 = 137881925;
                    } else {
                        iM2761 = C0619.m2761("ܶ۬") ^ i7;
                        i = ((iM2761 ^ i8) * 28077) ^ 995469393;
                        i2 = 812748008;
                    }
                    i10 = iM2761 ^ i2;
                    i9 = i;
                    break;
                case -574171321:
                case 606596062:
                    c25228 = this.f32450;
                    if (c25228 != null) {
                        iM2761 = (C0773.m3169("ۙ᩹") + i8) * 31;
                        i = ((iM2761 ^ i7) * 23117) ^ (-707158746);
                        i2 = -1254537124;
                    } else {
                        iM2761 = (i7 - C0773.m3169("᩵᩹")) * 7;
                        i = ((iM2761 ^ i8) * (-28725)) ^ (-1500053339);
                        i2 = 500395612;
                    }
                    i10 = iM2761 ^ i2;
                    i9 = i;
                    break;
                case -543327995:
                case 1241474698:
                    C11235.m28309();
                    if (C2354.f7599 < 0) {
                        iM2761 = (i7 - C0773.m3169("᩷᩵")) * (-45);
                        i = ((iM2761 ^ i8) * 31973) ^ (-1454575082);
                        i2 = -1732970700;
                    } else {
                        iM2761 = C0773.m3169("᩻ᩳ") ^ i8;
                        i = ((iM2761 ^ i7) * (-13851)) ^ 1561006028;
                        i2 = 1530089222;
                    }
                    i10 = iM2761 ^ i2;
                    i9 = i;
                    break;
                case -39055963:
                case 872226703:
                    AbstractC3269 itemAnimator = c25227.getItemAnimator();
                    c20729 = this.f32460;
                    if (itemAnimator != c20729) {
                        iM2761 = (i7 - C0619.m2761("᩺᩹")) * 97;
                        i = ((iM2761 ^ i8) * 13185) ^ (-499756172);
                        i2 = 1974691992;
                    } else {
                        iM2761 = C0619.m2761("ܶ۬") ^ i7;
                        i = ((iM2761 ^ i8) * 28077) ^ 995469393;
                        i2 = 812748008;
                    }
                    i10 = iM2761 ^ i2;
                    i9 = i;
                    break;
                case 188553760:
                case 1243650816:
                    if (C1519.m5403()) {
                        iM2761 = C0773.m3169("ᩳۗ") ^ i7;
                        i = ((iM2761 ^ i8) * 8179) ^ (-1277590665);
                        i2 = 219995280;
                    } else {
                        iM2761 = (i7 - C0773.m3169("᩷᩵")) * (-45);
                        i = ((iM2761 ^ i8) * 31973) ^ (-1454575082);
                        i2 = -1732970700;
                    }
                    i10 = iM2761 ^ i2;
                    i9 = i;
                    break;
                case 508299064:
                case 1233547134:
                    if (C3779.f12953 <= 0) {
                        iM2761 = C0619.m2761("ۗ۫") ^ i8;
                        i = ((iM2761 ^ i7) * (-7921)) ^ 88596853;
                        i2 = 1041604973;
                    } else {
                        iM2761 = C0773.m3169("ۨܶ") ^ i7;
                        i = ((iM2761 ^ i8) * 12049) ^ (-1357035470);
                        i2 = 1300858924;
                    }
                    i10 = iM2761 ^ i2;
                    i9 = i;
                    break;
                case 538314740:
                case 932921696:
                    RunnableC0334.m2054(arrayList, c14614);
                    i4 = iM8879;
                    iM3169 = (C0619.m2761("ۤۚ") ^ i7) * (-65);
                    iM8879 = i4;
                    i9 = ((iM3169 ^ i8) * 11847) ^ (-298363581);
                    i3 = 1481127274;
                    i10 = iM3169 ^ i3;
                    break;
                case 575678635:
                case 1452494239:
                    z2 = false;
                    if (C3998.m12923(itM13647)) {
                        iM2761 = (C0773.m3169("ۖۤ") + i8) * (-23);
                        i = ((iM2761 ^ i7) * 1309) ^ 1490742878;
                        i2 = -1597922540;
                    } else {
                        iM2761 = (i8 - C0619.m2761("᩶ۡ")) * 71;
                        i = ((iM2761 ^ i7) * (-28217)) ^ 1199212937;
                        i2 = -1162049082;
                    }
                    i10 = iM2761 ^ i2;
                    i9 = i;
                    break;
                case 587299549:
                case 2015452266:
                    set = this.f32459;
                    c14615 = (C14614) C1542.m5457(arrayList2, i5);
                    if (AbstractC0116.f1064 <= 0) {
                        iM2761 = C0773.m3169("ۨܶ") ^ i7;
                        i = ((iM2761 ^ i8) * 12049) ^ (-1357035470);
                        i2 = 1300858924;
                    } else {
                        iM2761 = C0619.m2761("᩻ܿ") ^ i8;
                        i = ((iM2761 ^ i7) * 13775) ^ 123430942;
                        i2 = 570515487;
                    }
                    i10 = iM2761 ^ i2;
                    i9 = i;
                    break;
                case 722659204:
                case 1213644131:
                    C0862.m3503();
                    if (AbstractC0641.m2813() <= 0) {
                        int iM2765 = (C0619.m2761("᩷᩸") ^ i7) * (-91);
                        i10 = iM2765 ^ 828824322;
                        i9 = ((iM2765 ^ i8) * (-2533)) ^ 1194266887;
                        arrayList3 = null;
                    } else {
                        iM2761 = C0619.m2761("ۗ۫") ^ i8;
                        i = ((iM2761 ^ i7) * (-7921)) ^ 88596853;
                        i2 = 1041604973;
                        i10 = iM2761 ^ i2;
                        i9 = i;
                    }
                    break;
                case 939033571:
                case 1831924015:
                    if (zArr[i5]) {
                        iM2761 = (C0619.m2761("ۖ᩸") + i7) * 81;
                        i = ((iM2761 ^ i8) * 7557) ^ (-1757925216);
                        i2 = -876515465;
                    } else {
                        iM2761 = (C0619.m2761("ۜܶ") + i8) * (-53);
                        i = ((iM2761 ^ i7) * (-25917)) ^ (-242221342);
                        i2 = 1674698084;
                    }
                    i10 = iM2761 ^ i2;
                    i9 = i;
                    break;
                case 1022995451:
                case 1275396780:
                    z4 = true;
                    iM2761 = (C0773.m3169("ᩴ۫") ^ i8) * 15;
                    i = ((iM2761 ^ i7) * 20473) ^ (-1163349455);
                    i2 = 574605515;
                    i10 = iM2761 ^ i2;
                    i9 = i;
                    break;
                case 1172163827:
                case 1475333058:
                    zArr[i11] = z4;
                    int i14 = c14614.f46028;
                    if (C1343.f4799 != 0) {
                        i12 = i14;
                        iM2761 = C0773.m3169("ۨܶ") ^ i7;
                        i = ((iM2761 ^ i8) * 12049) ^ (-1357035470);
                        i2 = 1300858924;
                        i10 = iM2761 ^ i2;
                        i9 = i;
                    } else {
                        int iM2766 = (i7 - C0619.m2761("᩸᩻")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i9 = ((iM2766 ^ i8) * 11253) ^ 1554028294;
                        i12 = i14;
                        i10 = iM2766 ^ (-1630736030);
                    }
                    break;
                default:
                    this.f32450.setItemAnimator(c20729);
                    iM2761 = C0619.m2761("ܶ۬") ^ i7;
                    i = ((iM2761 ^ i8) * 28077) ^ 995469393;
                    i2 = 812748008;
                    i10 = iM2761 ^ i2;
                    i9 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v59, types: [l.ܰۖ֫] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.animation.ValueAnimator, l.ۢ۬֫] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m26204() {
        boolean z = false;
        FrameLayout frameLayout = null;
        ?? r2 = 0;
        int i = 0;
        int i2 = 0;
        ValueAnimator valueAnimator = null;
        C25227 c25227 = null;
        int i3 = 2137555810;
        int i4 = C1146.f4234;
        int i5 = C0487.f2131;
        int iM3169 = (C0773.m3169("ۢۜ") ^ i4) * 41;
        int i6 = ((iM3169 ^ i5) * 29769) ^ (-1407877561);
        int i7 = -932683922;
        while (true) {
            int i8 = iM3169 ^ i7;
            r2 = r2;
            while (true) {
                i3 = ((((i3 ^ i5) * 1643) >> 31) & i6) ^ i8;
                switch (i3) {
                    case -2110335267:
                    case -1926354871:
                        valueAnimator.cancel();
                        iM3169 = (C0619.m2761("᩺ᩴ") + i4) * (-25);
                        i6 = ((iM3169 ^ i5) * (-19137)) ^ 488575319;
                        i7 = 317924633;
                        break;
                    case -1960999530:
                    case 735215409:
                        z = true;
                        z = true;
                        if (!C4282.m13644()) {
                            iM3169 = (C0773.m3169("ܿ᩵") ^ i5) * 5;
                            i6 = ((iM3169 ^ i4) * (-4305)) ^ 1801778299;
                            i7 = 2146688160;
                        } else {
                            iM3169 = C0619.m2761("ۢ۬") ^ i4;
                            i6 = ((iM3169 ^ i5) * 19945) ^ 953401583;
                            i7 = 1253808308;
                        }
                        break;
                    case -1955489675:
                    case -958594715:
                        if (C2419.f7754 < 0) {
                            iM3169 = C0773.m3169("ܳۚ") ^ i4;
                            i6 = ((iM3169 ^ i5) * (-16569)) ^ 607747262;
                            i7 = -219185721;
                        } else {
                            iM3169 = C0619.m2761("ۜܺ") ^ i4;
                            i6 = ((iM3169 ^ i5) * (-28133)) ^ 1176528207;
                            i7 = -468673478;
                        }
                        break;
                    case -1893971397:
                    case 2047647757:
                        i = this.f32468 + (z ? 1 : 0);
                        if (!C2966.m9664()) {
                            iM3169 = (C0773.m3169("ܿ᩵") ^ i5) * 5;
                            i6 = ((iM3169 ^ i4) * (-4305)) ^ 1801778299;
                            i7 = 2146688160;
                            break;
                        }
                        iM3169 = C0773.m3169("ۘ᩻") ^ i5;
                        i6 = ((iM3169 ^ i4) * 29383) ^ 1852392705;
                        i7 = -2090192332;
                        break;
                    case -1828281696:
                    case -1699634056:
                        if (!(frameLayout instanceof C14286)) {
                            r2 = 0;
                            iM3169 = C0619.m2761("ᩳ۠") ^ i4;
                            i6 = ((iM3169 ^ i5) * 9833) ^ (-537692391);
                            i7 = 1063661300;
                        }
                        int iM2761 = C0619.m2761("ۡ֫") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-6859)) ^ (-384720722);
                        i8 = iM2761 ^ (-385504268);
                        r2 = 0;
                        break;
                        break;
                    case -1810130033:
                    case 742009921:
                        this.f32468 = i;
                        if (C1519.f5300 < 0) {
                            iM3169 = (C0773.m3169("ᩳ᩵") + i4) * (-77);
                            i6 = ((iM3169 ^ i5) * (-9419)) ^ (-699076716);
                            i7 = -1957872547;
                        } else {
                            iM3169 = (C0773.m3169("ܿ᩵") ^ i5) * 5;
                            i6 = ((iM3169 ^ i4) * (-4305)) ^ 1801778299;
                            i7 = 2146688160;
                        }
                        break;
                    case -1789670714:
                    case -1771653294:
                        C2878.m9491();
                        if (C2702.f8586 > 0) {
                            iM3169 = C0619.m2761("ۜܺ") ^ i4;
                            i6 = ((iM3169 ^ i5) * (-28133)) ^ 1176528207;
                            i7 = -468673478;
                            break;
                        }
                        iM3169 = (C0773.m3169("ܿ᩵") ^ i5) * 5;
                        i6 = ((iM3169 ^ i4) * (-4305)) ^ 1801778299;
                        i7 = 2146688160;
                        break;
                    case -1736800026:
                    case 1523199192:
                        this.f32450.getItemAnimator().mo10765();
                        iM3169 = C0773.m3169("ܰۚ") ^ i4;
                        i6 = ((iM3169 ^ i5) * 26857) ^ (-1380094651);
                        i7 = -290035397;
                        break;
                    case -1407704890:
                    case -144180786:
                        C0773.m3161();
                        if (!C17202.f56030) {
                            iM3169 = C0619.m2761("ۜܺ") ^ i4;
                            i6 = ((iM3169 ^ i5) * (-28133)) ^ 1176528207;
                            i7 = -468673478;
                            break;
                        }
                        iM3169 = (i4 - C0773.m3169("ۛ۟")) * 123;
                        i6 = ((iM3169 ^ i5) * 10323) ^ (-2015001490);
                        i7 = 1683278391;
                        break;
                    case -1380840483:
                    case -228515899:
                        if (!C1146.m4231()) {
                            iM3169 = C0773.m3169("᩺ۜ") ^ i5;
                            i6 = ((iM3169 ^ i4) * 22947) ^ 941387452;
                            i7 = -2129343512;
                        } else {
                            iM3169 = C0619.m2761("ۜܺ") ^ i4;
                            i6 = ((iM3169 ^ i5) * (-28133)) ^ 1176528207;
                            i7 = -468673478;
                        }
                        break;
                    case -1324512574:
                    case 950709861:
                        if (AbstractC0116.f1064 > 0) {
                            iM3169 = (i5 - C0773.m3169("֫ۚ")) * 23;
                            i6 = ((iM3169 ^ i4) * 21263) ^ (-1287659373);
                            i7 = -1871879110;
                        } else {
                            iM3169 = C0619.m2761("ۜܺ") ^ i4;
                            i6 = ((iM3169 ^ i5) * (-28133)) ^ 1176528207;
                            i7 = -468673478;
                        }
                        break;
                    case -1213500703:
                    case 181104870:
                        C3448.m11248();
                        break;
                    case -1086073320:
                    case -25938426:
                        ((C14286) frameLayout).m34694(r2);
                        r2 = r2;
                        iM3169 = C0619.m2761("ᩳ۠") ^ i4;
                        i6 = ((iM3169 ^ i5) * 9833) ^ (-537692391);
                        i7 = 1063661300;
                        break;
                    case -1071678225:
                    case 1650485768:
                        m26193(z);
                        frameLayout = this.f32446;
                        if (C1146.f4234 < 0) {
                            iM3169 = C0619.m2761("֡᩸") ^ i5;
                            i6 = ((iM3169 ^ i4) * 2767) ^ 1642202747;
                            i7 = -2072564401;
                        } else {
                            iM3169 = (C0773.m3169("ܿ᩵") ^ i5) * 5;
                            i6 = ((iM3169 ^ i4) * (-4305)) ^ 1801778299;
                            i7 = 2146688160;
                        }
                        break;
                    case -931844603:
                    case 1416174054:
                        C2485.m8357();
                        C2702.m8876();
                        iM3169 = (C0773.m3169("ܿ᩵") ^ i5) * 5;
                        i6 = ((iM3169 ^ i4) * (-4305)) ^ 1801778299;
                        i7 = 2146688160;
                        break;
                    case -786419651:
                    case 166037934:
                        this.f32481 = r2;
                        c25227 = this.f32450;
                        if (c25227 == null) {
                            iM3169 = C0773.m3169("ܰۚ") ^ i4;
                            i6 = ((iM3169 ^ i5) * 26857) ^ (-1380094651);
                            i7 = -290035397;
                            break;
                            break;
                        }
                        iM3169 = (i5 - C0619.m2761("᩸ۙ")) * 93;
                        i6 = ((iM3169 ^ i4) * (-18451)) ^ 1711396202;
                        i7 = -1686339168;
                        break;
                    case -87942404:
                    case 1749385155:
                        if (C2287.m7745() > 0) {
                            iM3169 = (C0773.m3169("ۗۚ") + i5) * (-9);
                            i6 = ((iM3169 ^ i4) * 27673) ^ 679070768;
                            i7 = -1645132561;
                        } else {
                            iM3169 = C0773.m3169("᩺ۜ") ^ i5;
                            i6 = ((iM3169 ^ i4) * 22947) ^ 941387452;
                            i7 = -2129343512;
                        }
                        break;
                    case 242606788:
                    case 448017009:
                        m26187();
                        m26197();
                        if (C1783.f6087 > 0) {
                            iM3169 = (C0773.m3169("ۨ۫") + i5) * 3;
                            i6 = ((iM3169 ^ i4) * (-20465)) ^ 259331130;
                            i7 = -2042031938;
                        } else {
                            iM3169 = C0773.m3169("ᩳۡ") ^ i5;
                            i6 = ((iM3169 ^ i4) * (-24435)) ^ (-1999838516);
                            i7 = -535460840;
                        }
                        break;
                    case 406179489:
                    case 1640831409:
                        i2 = this.f32437;
                        if (C0269.m1775() > 0) {
                            iM3169 = C0619.m2761("ۚ᩻") ^ i4;
                            i6 = ((iM3169 ^ i5) * 1549) ^ (-451001481);
                            i7 = 1284385617;
                        } else {
                            iM3169 = C0773.m3169("᩺ۜ") ^ i5;
                            i6 = ((iM3169 ^ i4) * 22947) ^ 941387452;
                            i7 = -2129343512;
                        }
                        break;
                    case 428261595:
                    case 552449972:
                        c25227.stopScroll();
                        if (this.f32450.getItemAnimator() == null) {
                            iM3169 = C0773.m3169("ܰۚ") ^ i4;
                            i6 = ((iM3169 ^ i5) * 26857) ^ (-1380094651);
                            i7 = -290035397;
                            break;
                            break;
                        }
                        iM3169 = (C0619.m2761("۟ۢ") + i4) * 119;
                        i6 = ((iM3169 ^ i5) * 21361) ^ (-1554380283);
                        i7 = -1867882091;
                        break;
                    case 1117177282:
                    case 1813503351:
                        this.f32463 = z;
                        if (C3448.f11240 < 0) {
                            iM3169 = (C0619.m2761("ۗ۬") + i4) * (-61);
                            i6 = ((iM3169 ^ i5) * (-15923)) ^ 253239148;
                            i7 = -57307167;
                        } else {
                            iM3169 = C0619.m2761("ۜܺ") ^ i4;
                            i6 = ((iM3169 ^ i5) * (-28133)) ^ 1176528207;
                            i7 = -468673478;
                        }
                        break;
                    case 1588052966:
                    case 1590678163:
                        this.f32482.removeCallbacks(this.f32447);
                        break;
                    default:
                        this.f32437 = i2 + (z ? 1 : 0);
                        valueAnimator = this.f32481;
                        if (valueAnimator == null) {
                            iM3169 = (C0619.m2761("᩺ᩴ") + i4) * (-25);
                            i6 = ((iM3169 ^ i5) * (-19137)) ^ 488575319;
                            i7 = 317924633;
                            break;
                            break;
                        }
                        iM3169 = C0619.m2761("֡۫") ^ i5;
                        i6 = ((iM3169 ^ i4) * (-12315)) ^ (-824693084);
                        i7 = -1790499665;
                        break;
                }
                return;
            }
        }
    }
}
