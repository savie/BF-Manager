package l;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.File;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.math.ec.rfc8032.Scalar25519;

/* JADX INFO: renamed from: l.᩶᩷ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 02QQ */
/* JADX INFO: loaded from: classes.dex */
public final class C21576 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Handler f68927;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC0812 f68928;

    /* JADX INFO: renamed from: ۟᩸ۜ, reason: not valid java name and contains not printable characters */
    private static final short[] f68929 = {8537, 22551, 22549, 22532, 22562, 22549, 22531, 22559, 22533, 22530, 22547, 22549, 22531, 22616, 22622, 22622, 22622, 22617, 6347, 4485, 4487, 4502, 4515, 4498, 4498, 4494, 4491, 4481, 4483, 4502, 4491, 4493, 4492, 4523, 4492, 4484, 4493, 4554, 4556, 4556, 4556, 4555, 6326, 1527, 1510, 1508, 1516, 1510, 1504, 1506, 1481, 1510, 1514, 1506, 1504, 1506, 1523, 1495, 1510, 1508, 1516, 1510, 1504, 1506, 1486, 1513, 1505, 1512, 1455, 1449, 1449, 1449, 1454, 4361, -586, -577, -606, -579, -591, -604, -623, -606, -585, -605, -585, -587, -604, -637, -604, -606, -583, -578, -585, -520, -514, -514, -514, -519, 6601, -7294, -7283, -7288, -7279, -7293, -7282, -7296, -7277, -7291, -7281, -7276, -7283, -7283, -7231, -7294, -7296, -7281, -7281, -7282, -7275, -7231, -7293, -7292, -7231, -7294, -7296, -7278, -7275, -7231, -7275, -7282, -7231, -7281, -7282, -7281, -7220, -7281, -7276, -7283, -7283, -7231, -7275, -7272, -7279, -7292, -7231, -7296, -7281, -7291, -7277, -7282, -7288, -7291, -7217, -7275, -7292, -7271, -7275, -7217, -7262, -7283, -7288, -7279, -7293, -7282, -7296, -7277, -7291, -7252, -7296, -7281, -7296, -7290, -7292, -7277, 26557, 29958, 26077, 6692, 12788, 12771, 12773, 12771, 12783, 12784, 12771, 12788, 539, 20511, 20488, 20494, 20488, 20484, 20507, 20488, 20511, 2073, 9098, 9101, 9111, 9094, 9101, 9111, 9402, 29248, -31143, -20863, 4915, -21194, 611, 9346, 9712, -24, -10, -30, -26, -23, -20, -11, -25, -22, -28, -9, -31, -21, -16, -23, -23, -91, -26, -28, -21, -21, -22, -15, -91, -25, -32, -91, -26, -28, -10, -15, -91, -15, -22, -91, -21, -22, -21, -88, -21, -16, -23, -23, -91, -15, -4, -11, -32, -91, -28, -21, -31, -9, -22, -20, -31, -85, -15, -32, -3, -15, -85, -58, -23, -20, -11, -25, -22, -28, -9, -31, -56, -28, -21, -28, -30, -32, -9, -31995, -21625, 27164, 3672, 955, 953, 936, 922, 949, 944, 953, 943, 920, 949, 942, 1012, 1010, 1010, 1010, 1013, 9063, 29471, 29469, 29452, 29499, 29465, 29467, 29456, 29469, 29500, 29457, 29450, 29520, 29526, 29526, 29526, 29521, 7645, -21794, -21796, -21811, -21779, -21796, -21823, -21811, -21871, -21865, -21865, -21865, -21872, 4949, 15302, 15297, 15302, 15327, 15325, 15306, 15324, 15306, 15325, 15321, 15306, 15344, 15305, 15302, 15299, 15306, 15344, 15323, 15302, 15298, 15306, 1901, 8715, 8708, 8705, 8728, 8714, 8711, 8713, 8730, 8716, 8710, 8733, 8708, 8708, 8776, 8715, 8713, 8710, 8710, 8711, 8732, 8776, 8714, 8717, 8776, 8715, 8713, 8731, 8732, 8776, 8732, 8711, 8776, 8710, 8711, 8710, 8773, 8710, 8733, 8708, 8708, 8776, 8732, 8721, 8728, 8717, 8776, 8713, 8710, 8716, 8730, 8711, 8705, 8716, 8774, 8715, 8711, 8710, 8732, 8717, 8710, 8732, 8774, 8747, 8708, 8705, 8728, 8714, 8711, 8713, 8730, 8716, 8741, 8713, 8710, 8713, 8719, 8717, 8730, 256, -28376, -28374, -28357, -28385, -28370, -28372, -28380, -28370, -28376, -28374, -28414, -28370, -28383, -28370, -28376, -28374, -28355, -28313, -28319, -28319, -28319, -28314, 785, -17978, -17980, -17963, -17929, -17984, -17971, -17964, -17980, -18039, -18033, -18033, -18033, -18040, 2968, -6529, -6541, -6542, -6552, -6535, -6556, -6552, 2756, -24974, -24962, -24961, -24961, -24972, -24974, -24987, -24968, -24985, -24968, -24987, -24984, -24961, -24988, -24963, -24963, -25039, -24974, -24976, -24961, -24961, -24962, -24987, -25039, -24973, -24972, -25039, -24974, -24976, -24990, -24987, -25039, -24987, -24962, -25039, -24961, -24962, -24961, -25028, -24961, -24988, -24963, -24963, -25039, -24987, -24984, -24991, -24972, -25039, -24976, -24961, -24971, -24989, -24962, -24968, -24971, -25025, -24961, -24972, -24987, -25025, -25006, -24962, -24961, -24961, -24972, -24974, -24987, -24968, -24985, -24968, -24987, -24984, -24996, -24976, -24961, -24976, -24970, -24972, -24989, 1409, 21213, 21215, 21198, 21243, 21193, 21193, 21215, 21198, 21193, 21138, 21140, 21140, 21140, 21139, 6992, 3859, 3857, 3840, 3879, 3840, 3846, 3869, 3866, 3859, 3932, 3930, 3930, 3930, 3933, 1446, -20018, -20023, -20009, -20014, -20013, -19976, -20022, -20030, -20013, -20017, -20024, -20029, -20023, -20014, -20021, -20021, -20089, -20028, -20026, -20023, -20023, -20024, -20013, -20089, -20027, -20030, -20089, -20028, -20026, -20012, -20013, -20089, -20013, -20024, -20089, -20023, -20024, -20023, -20086, -20023, -20014, -20021, -20021, -20089, -20013, -20002, -20009, -20030, -20089, -20026, -20023, -20029, -20011, -20024, -20018, -20029, -20087, -20015, -20018, -20030, -20016, -20087, -20018, -20023, -20009, -20014, -20013, -20022, -20030, -20013, -20017, -20024, -20029, -20087, -19986, -20023, -20009, -20014, -20013, -19990, -20030, -20013, -20017, -20024, -20029, -19990, -20026, -20023, -20026, -20032, -20030, -20011, 7356, 15320, 15322, 15307, 15356, 15312, 15313, 15307, 15322, 15313, 15307, 15341, 15322, 15308, 15312, 15315, 15305, 15322, 15309, 15255, 15249, 15249, 15249, 15254, 4680, -27445, -27447, -27432, -27396, -27443, -27441, -27449, -27443, -27445, -27447, -27422, -27443, -27455, -27447, -27516, -27518, -27518, -27518, -27515, 7164, -1744, -1742, -1757, -1791, -1738, -1733, -1758, -1742, -1665, -1671, -1671, -1671, -1666};

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static boolean f68930;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static InterfaceC9801 f68931;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static SharedPreferences f68932;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static boolean f68933;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static ApplicationC17729 f68934;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final InterfaceC0812 f68935;

    /* JADX WARN: Code duplicated, block: B:56:0x01d3 A[PHI: r3 r6 r16
      0x01d3: PHI (r3v6 short) = (r3v3 short), (r3v2 short), (r3v2 short) binds: [B:55:0x01d1, B:47:0x0170, B:9:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x01d3: PHI (r6v6 int) = (r6v2 int), (r6v3 int), (r6v2 int) binds: [B:55:0x01d1, B:47:0x0170, B:9:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x01d3: PHI (r16v27 java.lang.String) = (r16v6 java.lang.String), (r16v8 java.lang.String), (r16v28 java.lang.String) binds: [B:55:0x01d1, B:47:0x0170, B:9:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0067, code lost:
    
        if (l.C1321.f4751 >= 0) goto L16;
     */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String m49088(int r18) {
        /*
            Method dump skipped, instruction units count: 806
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C21576.m49088(int):java.lang.String");
    }

    /* JADX WARN: Code duplicated, block: B:48:0x016d A[PHI: r2 r6
      0x016d: PHI (r2v3 java.lang.String) = (r2v2 java.lang.String), (r2v4 java.lang.String) binds: [B:47:0x016b, B:23:0x0085] A[DONT_GENERATE, DONT_INLINE]
      0x016d: PHI (r6v4 int) = (r6v3 int), (r6v2 int) binds: [B:47:0x016b, B:23:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x019d A[PHI: r5 r11 r12
      0x019d: PHI (r5v4 short) = (r5v3 short), (r5v2 short), (r5v2 short), (r5v2 short), (r5v2 short) binds: [B:51:0x019b, B:28:0x00b9, B:17:0x0067, B:15:0x0063, B:12:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x019d: PHI (r11v4 short[]) = (r11v2 short[]), (r11v3 short[]), (r11v2 short[]), (r11v2 short[]), (r11v2 short[]) binds: [B:51:0x019b, B:28:0x00b9, B:17:0x0067, B:15:0x0063, B:12:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x019d: PHI (r12v4 int) = (r12v2 int), (r12v3 int), (r12v2 int), (r12v2 int), (r12v2 int) binds: [B:51:0x019b, B:28:0x00b9, B:17:0x0067, B:15:0x0063, B:12:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x01cf A[PHI: r4 r7 r8 r9
      0x01cf: PHI (r4v4 char) = (r4v3 char), (r4v2 char), (r4v2 char), (r4v2 char) binds: [B:55:0x01cd, B:43:0x014c, B:39:0x012c, B:9:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x01cf: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int) binds: [B:55:0x01cd, B:43:0x014c, B:39:0x012c, B:9:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x01cf: PHI (r8v4 short) = (r8v2 short), (r8v3 short), (r8v2 short), (r8v2 short) binds: [B:55:0x01cd, B:43:0x014c, B:39:0x012c, B:9:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x01cf: PHI (r9v4 int) = (r9v2 int), (r9v2 int), (r9v3 int), (r9v2 int) binds: [B:55:0x01cd, B:43:0x014c, B:39:0x012c, B:9:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x01ff A[PHI: r13
      0x01ff: PHI (r13v3 int) = (r13v2 int), (r13v2 int), (r13v2 int), (r13v5 int) binds: [B:59:0x01fd, B:12:0x005d, B:9:0x0055, B:6:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x022d A[PHI: r18
      0x022d: PHI (r18v5 short[]) = (r18v4 short[]), (r18v3 short[]) binds: [B:63:0x022b, B:15:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m49068(Runnable runnable) {
        int iM3169;
        int i;
        int i2;
        int i3 = C3448.f11240;
        int i4 = C0487.f2131;
        int iM2761 = C0619.m2761("֫ᩴ") ^ i3;
        int i5 = ((iM2761 ^ i4) * 8675) ^ (-178459602);
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM2761 ^ (-1265795341);
        String strM4861 = null;
        char c = 0;
        short s = 0;
        int i7 = 0;
        int i8 = 0;
        short s2 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1797796597;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i4) * (-16535)) >> 31));
            switch (i13) {
                case -2110894462:
                case -1529480946:
                    if (C2966.f9654 >= 0) {
                        iM3169 = C0773.m3169("᩵ۧ") ^ i3;
                        i = ((iM3169 ^ i4) * (-15871)) ^ (-923382843);
                        i2 = -262084481;
                    } else {
                        iM3169 = C0773.m3169("۫ۙ") ^ i3;
                        i = ((iM3169 ^ i4) * 13725) ^ (-770713595);
                        i2 = -1886693244;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -2109790484:
                case 737664827:
                    if (i8 - (i9 + 1) < 0) {
                        iM3169 = (C0619.m2761("ۛܺ") + i4) * (-119);
                        i = ((iM3169 ^ i3) * 23763) ^ 573619641;
                        i2 = 1201962259;
                    } else {
                        iM3169 = C0619.m2761("ۖ᩸") ^ i4;
                        i = ((iM3169 ^ i3) * 25789) ^ 1923792507;
                        i2 = -1589182593;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1871709422:
                case -1237887483:
                    i10 = 44356;
                    iM3169 = C0619.m2761("ۡ۬") ^ i3;
                    i = ((iM3169 ^ i4) * (-31389)) ^ (-1006126107);
                    i2 = 846081991;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1867354023:
                case 1740781932:
                    c = 206;
                    if (C0862.m3503()) {
                        iM3169 = (C0773.m3169("۫ܰ") ^ i4) * 63;
                        i = ((iM3169 ^ i3) * 17139) ^ (-1540405621);
                        i2 = -671599512;
                    } else {
                        iM3169 = (C0773.m3169("ۗᩴ") + i3) * 7;
                        i = ((iM3169 ^ i4) * 28829) ^ (-1430503345);
                        i2 = -1919237085;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1841962495:
                case 2016115167:
                    if (C0862.m3503()) {
                        iM3169 = (C0773.m3169("ۗᩴ") + i3) * 7;
                        i = ((iM3169 ^ i4) * 28829) ^ (-1430503345);
                        i2 = -1919237085;
                    } else {
                        iM3169 = C0773.m3169("᩵ۧ") ^ i3;
                        i = ((iM3169 ^ i4) * (-15871)) ^ (-923382843);
                        i2 = -262084481;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1595764255:
                case 1288946835:
                    C2878.m9491();
                    RunnableC3646.m11813();
                    iM3169 = C0619.m2761("᩶۫") ^ i4;
                    i = ((iM3169 ^ i3) * 17555) ^ 1607210766;
                    i2 = -724116022;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1450032336:
                case -634958006:
                    sArr2 = f68929;
                    i11 = 207;
                    if (C1080.f3865 >= 0) {
                        iM3169 = C0619.m2761("᩶۫") ^ i4;
                        i = ((iM3169 ^ i3) * 17555) ^ 1607210766;
                        i2 = -724116022;
                    } else {
                        iM3169 = C0773.m3169("ۘᩴ") ^ i3;
                        i = ((iM3169 ^ i4) * (-20241)) ^ (-1409657837);
                        i2 = -681691283;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1387314305:
                case 319627499:
                    s = sArr[c];
                    if (C17202.f56030) {
                        iM3169 = C0773.m3169("ۧ۟") ^ i3;
                        i = ((iM3169 ^ i4) * 12249) ^ 740330463;
                        i2 = 1005926566;
                    } else {
                        iM3169 = C0619.m2761("᩶۫") ^ i4;
                        i = ((iM3169 ^ i3) * 17555) ^ 1607210766;
                        i2 = -724116022;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1163290910:
                case -30938899:
                    strM4861 = C1321.m4861(sArr2, i11, i12, i10);
                    if (C3492.f12043 <= 0) {
                        iM3169 = C0619.m2761("᩷ܺ") ^ i4;
                        i = ((iM3169 ^ i3) * (-26155)) ^ (-1200244993);
                        i2 = 1868105060;
                    } else {
                        iM3169 = C0773.m3169("֨᩺") ^ i3;
                        i = ((iM3169 ^ i4) * 15357) ^ 1342095602;
                        i2 = -994512165;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1012620825:
                case -232993480:
                    C2419.m8174();
                    C0862.m3503();
                    break;
                case -957683008:
                case -678401578:
                    if (C1343.m4943()) {
                        iM3169 = C0619.m2761("᩶۫") ^ i4;
                        i = ((iM3169 ^ i3) * 17555) ^ 1607210766;
                        i2 = -724116022;
                    } else {
                        iM3169 = C0773.m3169("᩵ۧ") ^ i3;
                        i = ((iM3169 ^ i4) * (-15871)) ^ (-923382843);
                        i2 = -262084481;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -742631208:
                case 1514785905:
                    i7 = s + 1;
                    if (C13473.m33144()) {
                        iM3169 = C0619.m2761("ۛۧ") ^ i4;
                        i = ((iM3169 ^ i3) * 9503) ^ 1908415744;
                        i2 = 242564996;
                    } else {
                        iM3169 = C0619.m2761("᩷ܺ") ^ i4;
                        i = ((iM3169 ^ i3) * (-26155)) ^ (-1200244993);
                        i2 = 1868105060;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -178331969:
                case 1097991950:
                    i9 = s * s2;
                    if (C2354.m7983()) {
                        iM3169 = (C0773.m3169("ܺ᩶") ^ i3) * (-91);
                        i = ((iM3169 ^ i4) * (-10413)) ^ 1741129017;
                        i2 = 1174671289;
                    } else {
                        iM3169 = (C0773.m3169("ۗᩴ") + i3) * 7;
                        i = ((iM3169 ^ i4) * 28829) ^ (-1430503345);
                        i2 = -1919237085;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -128044050:
                case 1582674716:
                    i10 = 61583;
                    iM3169 = C0619.m2761("ۡ۬") ^ i3;
                    i = ((iM3169 ^ i4) * (-31389)) ^ (-1006126107);
                    i2 = 846081991;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 405434315:
                case 1447967906:
                    if (C0950.f3488 >= 0) {
                        iM3169 = C0619.m2761("᩶۫") ^ i4;
                        i = ((iM3169 ^ i3) * 17555) ^ 1607210766;
                        i2 = -724116022;
                    } else {
                        iM3169 = (i4 - C0619.m2761("۬ܺ")) * (-53);
                        i = ((iM3169 ^ i3) * (-4059)) ^ 1735555418;
                        i2 = 1768552253;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 419734512:
                case 1817111966:
                    i8 = i7 * i7;
                    s2 = 2;
                    if (RunnableC3646.f12471) {
                        iM3169 = (C0773.m3169("ۗᩴ") + i3) * 7;
                        i = ((iM3169 ^ i4) * 28829) ^ (-1430503345);
                        i2 = -1919237085;
                    } else {
                        iM3169 = C0619.m2761("֡ۢ") ^ i3;
                        i = ((iM3169 ^ i4) * (-22097)) ^ (-526583616);
                        i2 = -1455747383;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 614501303:
                case 1556351100:
                    sArr = f68929;
                    if (C11235.f35427 >= 0) {
                        iM3169 = (i4 - C0619.m2761("۬ܺ")) * (-53);
                        i = ((iM3169 ^ i3) * (-4059)) ^ 1735555418;
                        i2 = 1768552253;
                    } else {
                        iM3169 = C0773.m3169("ۡۙ") ^ i4;
                        i = ((iM3169 ^ i3) * 32303) ^ 1479101686;
                        i2 = -1281072626;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 754026415:
                case 1294467041:
                    C17202.m40379(runnable, strM4861);
                    f68927.post(runnable);
                    break;
                default:
                    i12 = 1;
                    if (C0773.m3161() != 0) {
                        iM3169 = C0773.m3169("᩵ۧ") ^ i3;
                        i = ((iM3169 ^ i4) * (-15871)) ^ (-923382843);
                        i2 = -262084481;
                    } else {
                        iM3169 = C0619.m2761("ۘۙ") ^ i4;
                        i = ((iM3169 ^ i3) * (-7353)) ^ 676663286;
                        i2 = -380209932;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x01b2 A[PHI: r2 r4 r5 r6
      0x01b2: PHI (r2v3 java.lang.String) = (r2v2 java.lang.String), (r2v2 java.lang.String), (r2v6 java.lang.String) binds: [B:52:0x01b0, B:48:0x0193, B:25:0x00aa] A[DONT_GENERATE, DONT_INLINE]
      0x01b2: PHI (r4v4 char) = (r4v3 char), (r4v2 char), (r4v2 char) binds: [B:52:0x01b0, B:48:0x0193, B:25:0x00aa] A[DONT_GENERATE, DONT_INLINE]
      0x01b2: PHI (r5v4 short) = (r5v2 short), (r5v3 short), (r5v2 short) binds: [B:52:0x01b0, B:48:0x0193, B:25:0x00aa] A[DONT_GENERATE, DONT_INLINE]
      0x01b2: PHI (r6v4 short) = (r6v2 short), (r6v3 short), (r6v2 short) binds: [B:52:0x01b0, B:48:0x0193, B:25:0x00aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x01e2 A[PHI: r9 r11 r12 r13 r18
      0x01e2: PHI (r9v4 int) = (r9v2 int), (r9v3 int), (r9v2 int), (r9v2 int), (r9v2 int) binds: [B:56:0x01e0, B:43:0x015c, B:32:0x00ec, B:28:0x00cc, B:13:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x01e2: PHI (r11v4 short[]) = (r11v2 short[]), (r11v2 short[]), (r11v3 short[]), (r11v2 short[]), (r11v2 short[]) binds: [B:56:0x01e0, B:43:0x015c, B:32:0x00ec, B:28:0x00cc, B:13:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x01e2: PHI (r12v4 int) = (r12v2 int), (r12v2 int), (r12v3 int), (r12v2 int), (r12v2 int) binds: [B:56:0x01e0, B:43:0x015c, B:32:0x00ec, B:28:0x00cc, B:13:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x01e2: PHI (r13v4 int) = (r13v2 int), (r13v2 int), (r13v2 int), (r13v3 int), (r13v2 int) binds: [B:56:0x01e0, B:43:0x015c, B:32:0x00ec, B:28:0x00cc, B:13:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x01e2: PHI (r18v5 short[]) = (r18v4 short[]), (r18v3 short[]), (r18v3 short[]), (r18v3 short[]), (r18v3 short[]) binds: [B:56:0x01e0, B:43:0x015c, B:32:0x00ec, B:28:0x00cc, B:13:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x0210  */
    /* JADX WARN: Code duplicated, block: B:65:0x023c A[PHI: r7 r8
      0x023c: PHI (r7v3 int) = (r7v2 int), (r7v2 int), (r7v2 int), (r7v4 int) binds: [B:64:0x023a, B:18:0x0089, B:16:0x0085, B:6:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x023c: PHI (r8v3 short) = (r8v2 short), (r8v2 short), (r8v2 short), (r8v4 short) binds: [B:64:0x023a, B:18:0x0089, B:16:0x0085, B:6:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m49069(Runnable runnable, long j) {
        int iM2761;
        int i;
        Runnable runnable2 = runnable;
        int i2 = C1542.f5343;
        int i3 = C3779.f12953;
        int iM3169 = (C0773.m3169("ۜᩴ") + i2) * (-115);
        int i4 = ((iM3169 ^ i3) * 29197) ^ 249869753;
        short[] sArr = null;
        short[] sArr2 = null;
        int i5 = iM3169 ^ 864263773;
        String str = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i6 = 0;
        short s3 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 606159126;
        while (true) {
            i11 = i5 ^ (i4 & (((i11 ^ i3) * 26591) >> 31));
            switch (i11) {
                case -2090795086:
                case -2021141397:
                    sArr2 = f68929;
                    i9 = 209;
                    if (C2288.f7433 <= 0) {
                        iM2761 = (C0773.m3169("֡ܺ") + i3) * 53;
                        i4 = ((iM2761 ^ i2) * (-8955)) ^ 183963935;
                        i = 31252072;
                    } else {
                        iM2761 = (i2 - C0773.m3169("۫ܺ")) * (-37);
                        i4 = ((iM2761 ^ i3) * 7371) ^ 275585262;
                        i = -1977454370;
                    }
                    i5 = iM2761 ^ i;
                    runnable2 = runnable;
                    break;
                case -2086236699:
                case 2073320673:
                    i7 = s + s3;
                    if (C0950.f3488 >= 0) {
                        iM2761 = (C0773.m3169("֡ܺ") + i3) * 53;
                        i4 = ((iM2761 ^ i2) * (-8955)) ^ 183963935;
                        i = 31252072;
                    } else {
                        iM2761 = (C0773.m3169("᩸᩷") + i3) * 43;
                        i4 = ((iM2761 ^ i2) * 25691) ^ 1021614059;
                        i = 936544029;
                    }
                    i5 = iM2761 ^ i;
                    runnable2 = runnable;
                    break;
                case -1931180015:
                case 1510250322:
                    i8 = 46898;
                    iM2761 = (C0773.m3169("ۖۤ") ^ i3) * 19;
                    i4 = ((iM2761 ^ i2) * 3291) ^ (-1438123787);
                    i = -1848238333;
                    i5 = iM2761 ^ i;
                    runnable2 = runnable;
                    break;
                case -1857375754:
                case -258652341:
                    if (C1321.f4751 >= 0) {
                        iM2761 = C0773.m3169("֡۟") ^ i2;
                        i4 = ((iM2761 ^ i3) * 25367) ^ 1576192771;
                        i = -591243174;
                    } else {
                        iM2761 = (C0619.m2761("ۜ᩺") + i3) * 89;
                        i4 = ((iM2761 ^ i2) * 11117) ^ (-1489347981);
                        i = 1378786236;
                    }
                    i5 = iM2761 ^ i;
                    runnable2 = runnable;
                    break;
                case -1814665134:
                case 1226551765:
                    c = 208;
                    if (C2878.f9462) {
                        iM2761 = C0773.m3169("ۨۤ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 27337) ^ (-374137325);
                        i = 494469802;
                    } else {
                        iM2761 = C0619.m2761("۫ᩳ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-7075)) ^ (-219434864);
                        i = -1787609416;
                    }
                    i5 = iM2761 ^ i;
                    runnable2 = runnable;
                    break;
                case -1784468184:
                case -623861705:
                    C23916.m53419();
                    C0269.m1775();
                    iM2761 = C0773.m3169("ۖᩴ") ^ i2;
                    i4 = ((iM2761 ^ i3) * (-22687)) ^ 959550098;
                    i = -1228119748;
                    i5 = iM2761 ^ i;
                    runnable2 = runnable;
                    break;
                case -1755403305:
                case -1456922016:
                    i8 = 9456;
                    iM2761 = (C0773.m3169("ۖۤ") ^ i3) * 19;
                    i4 = ((iM2761 ^ i2) * 3291) ^ (-1438123787);
                    i = -1848238333;
                    i5 = iM2761 ^ i;
                    runnable2 = runnable;
                    break;
                case -1653815021:
                case -348940353:
                    C2288.m7767();
                    if (C0487.f2131 > 0) {
                        iM2761 = C0773.m3169("ۖᩴ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-22687)) ^ 959550098;
                        i = -1228119748;
                    } else {
                        iM2761 = C0773.m3169("֡۟") ^ i2;
                        i4 = ((iM2761 ^ i3) * 25367) ^ 1576192771;
                        i = -591243174;
                    }
                    i5 = iM2761 ^ i;
                    runnable2 = runnable;
                    break;
                case -1030532840:
                case -5419186:
                    C2375.m8065();
                    break;
                case -965380157:
                case 610582152:
                    sArr = f68929;
                    if (C1519.m5403()) {
                        iM2761 = (C0619.m2761("ۤ֨") ^ i3) * (-67);
                        i4 = ((iM2761 ^ i2) * 23177) ^ (-651115855);
                        i = -1899776904;
                    } else {
                        iM2761 = (C0773.m3169("֡ܺ") + i3) * 53;
                        i4 = ((iM2761 ^ i2) * (-8955)) ^ 183963935;
                        i = 31252072;
                    }
                    i5 = iM2761 ^ i;
                    runnable2 = runnable;
                    break;
                case -914226814:
                case 774496500:
                    C2878.m9491();
                    if (C1321.f4751 >= 0) {
                        iM2761 = C0773.m3169("֡۟") ^ i2;
                        i4 = ((iM2761 ^ i3) * 25367) ^ 1576192771;
                        i = -591243174;
                    } else {
                        iM2761 = (C0773.m3169("֡ܺ") + i3) * 53;
                        i4 = ((iM2761 ^ i2) * (-8955)) ^ 183963935;
                        i = 31252072;
                    }
                    i5 = iM2761 ^ i;
                    runnable2 = runnable;
                    break;
                case -889731078:
                case 549078072:
                    if (i6 - (i7 * i7) > 0) {
                        iM2761 = (C0619.m2761("֡ܳ") + i2) * 101;
                        i4 = ((iM2761 ^ i3) * 2163) ^ (-955327069);
                        i = -1445193788;
                    } else {
                        iM2761 = C0773.m3169("ۢ᩷") ^ i2;
                        i4 = ((iM2761 ^ i3) * 12695) ^ (-862635346);
                        i = -566262738;
                    }
                    i5 = iM2761 ^ i;
                    runnable2 = runnable;
                    break;
                case -602796420:
                case -570639866:
                    s = sArr[c];
                    s2 = 31720;
                    if (C2287.f7432 >= 0) {
                        iM2761 = C0773.m3169("ۨۤ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 27337) ^ (-374137325);
                        i = 494469802;
                    } else {
                        iM2761 = (C0619.m2761("ܿ᩵") + i3) * (-85);
                        i4 = ((iM2761 ^ i2) * (-13921)) ^ 804472962;
                        i = -839140978;
                    }
                    i5 = iM2761 ^ i;
                    runnable2 = runnable;
                    break;
                case -541482569:
                case 1401884756:
                    String strM9486 = C2878.m9486(sArr2, i9, i10, i8);
                    if (C20932.f66974 <= 0) {
                        str = strM9486;
                        iM2761 = C0773.m3169("ۨۤ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 27337) ^ (-374137325);
                        i = 494469802;
                        i5 = iM2761 ^ i;
                    } else {
                        int iM2762 = (i3 - C0619.m2761("ᩴ᩶")) * (-43);
                        int i12 = ((iM2762 ^ i2) * 25931) ^ 1521905091;
                        i5 = iM2762 ^ 410317362;
                        str = strM9486;
                        i4 = i12;
                    }
                    runnable2 = runnable;
                    break;
                case -419291649:
                case 1410866810:
                    C2966.m9664();
                    if (C1826.f6190 > 0) {
                        iM2761 = C0773.m3169("֡۟") ^ i2;
                        i4 = ((iM2761 ^ i3) * 25367) ^ 1576192771;
                        i = -591243174;
                        i5 = iM2761 ^ i;
                        runnable2 = runnable;
                    } else {
                        int iM2763 = (i3 - C0619.m2761("ܳܶ")) * 15;
                        i5 = iM2763 ^ 1106664105;
                        i4 = ((iM2763 ^ i2) * (-24481)) ^ 359591577;
                    }
                    break;
                case -287493327:
                case 1493315020:
                    i10 = 1;
                    if (C2288.f7433 <= 0) {
                        iM2761 = (C0773.m3169("֡ܺ") + i3) * 53;
                        i4 = ((iM2761 ^ i2) * (-8955)) ^ 183963935;
                        i = 31252072;
                    } else {
                        iM2761 = (C0619.m2761("֫ܺ") ^ i3) * 53;
                        i4 = ((iM2761 ^ i2) * (-10447)) ^ 1586184978;
                        i = 1125123674;
                    }
                    i5 = iM2761 ^ i;
                    runnable2 = runnable;
                    break;
                case 461619702:
                case 692474061:
                    C17202.m40379(runnable2, str);
                    f68927.postDelayed(runnable2, j);
                    break;
                case 992533033:
                case 1196658634:
                    if (C1343.f4799 != 0) {
                        iM2761 = C0773.m3169("ۖᩴ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-22687)) ^ 959550098;
                        i = -1228119748;
                    } else {
                        iM2761 = (C0619.m2761("ܶۛ") ^ i2) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM2761 ^ i3) * (-24187)) ^ 840414762;
                        i = 2045982742;
                    }
                    i5 = iM2761 ^ i;
                    runnable2 = runnable;
                    break;
                default:
                    i6 = s * s2;
                    s3 = 7930;
                    if (C11235.f35427 >= 0) {
                        iM2761 = C0773.m3169("ۖᩴ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-22687)) ^ 959550098;
                        i = -1228119748;
                    } else {
                        iM2761 = (i2 - C0773.m3169("᩸ۗ")) * 39;
                        i4 = ((iM2761 ^ i3) * 8357) ^ (-66845851);
                        i = 1458726874;
                    }
                    i5 = iM2761 ^ i;
                    runnable2 = runnable;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x01ae A[PHI: r7 r11 r12
      0x01ae: PHI (r7v4 int) = (r7v3 int), (r7v2 int) binds: [B:52:0x01ac, B:36:0x0103] A[DONT_GENERATE, DONT_INLINE]
      0x01ae: PHI (r11v3 short[]) = (r11v2 short[]), (r11v4 short[]) binds: [B:52:0x01ac, B:36:0x0103] A[DONT_GENERATE, DONT_INLINE]
      0x01ae: PHI (r12v3 int) = (r12v2 int), (r12v4 int) binds: [B:52:0x01ac, B:36:0x0103] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x01e0 A[PHI: r3 r6 r8
      0x01e0: PHI (r3v4 android.app.Application) = 
      (r3v2 android.app.Application)
      (r3v2 android.app.Application)
      (r3v3 android.app.Application)
      (r3v2 android.app.Application)
      (r3v2 android.app.Application)
     binds: [B:56:0x01de, B:48:0x018c, B:24:0x00a1, B:18:0x0084, B:16:0x0080] A[DONT_GENERATE, DONT_INLINE]
      0x01e0: PHI (r6v4 short) = (r6v3 short), (r6v2 short), (r6v2 short), (r6v2 short), (r6v2 short) binds: [B:56:0x01de, B:48:0x018c, B:24:0x00a1, B:18:0x0084, B:16:0x0080] A[DONT_GENERATE, DONT_INLINE]
      0x01e0: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int), (r8v2 int) binds: [B:56:0x01de, B:48:0x018c, B:24:0x00a1, B:18:0x0084, B:16:0x0080] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x0211 A[PHI: r5 r9 r13
      0x0211: PHI (r5v4 char) = (r5v3 char), (r5v2 char), (r5v2 char), (r5v2 char), (r5v2 char) binds: [B:60:0x020f, B:32:0x00e1, B:13:0x007a, B:9:0x0058, B:6:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x0211: PHI (r9v3 short) = (r9v2 short), (r9v2 short), (r9v2 short), (r9v2 short), (r9v5 short) binds: [B:60:0x020f, B:32:0x00e1, B:13:0x007a, B:9:0x0058, B:6:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x0211: PHI (r13v4 int) = (r13v2 int), (r13v3 int), (r13v2 int), (r13v2 int), (r13v2 int) binds: [B:60:0x020f, B:32:0x00e1, B:13:0x007a, B:9:0x0058, B:6:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0242 A[PHI: r2 r18
      0x0242: PHI (r2v4 java.lang.String) = (r2v2 java.lang.String), (r2v3 java.lang.String), (r2v2 java.lang.String), (r2v2 java.lang.String) binds: [B:64:0x0240, B:28:0x00c2, B:16:0x0080, B:13:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x0242: PHI (r18v5 short[]) = (r18v4 short[]), (r18v3 short[]), (r18v3 short[]), (r18v3 short[]) binds: [B:64:0x0240, B:28:0x00c2, B:16:0x0080, B:13:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m49065(Intent intent) {
        int iM3169;
        int i;
        int i2;
        int i3 = C2702.f8586;
        int i4 = C2966.f9654;
        int iM31610 = C0773.m3169("֨᩸") ^ i3;
        int i5 = ((iM31610 ^ i4) * (-25225)) ^ 806335693;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM31610 ^ 900922557;
        char c = 0;
        short s = 0;
        int i7 = 0;
        int i8 = 0;
        short s2 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 459018077;
        Application applicationM10096 = null;
        String strM9486 = null;
        while (true) {
            i12 = i6 ^ (i5 & (((i12 ^ i4) * 14785) >> 31));
            switch (i12) {
                case -2113850734:
                case 1055382111:
                    i9 = 9187;
                    iM3169 = C0619.m2761("ܿܽ") ^ i3;
                    i = ((iM3169 ^ i4) * (-15505)) ^ (-1654489321);
                    i2 = 666196247;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -2105248339:
                case 1876646261:
                    sArr2 = f68929;
                    i10 = 196;
                    if (RunnableC3646.f12471) {
                        iM3169 = (C0773.m3169("ۚᩳ") + i4) * (-97);
                        i = ((iM3169 ^ i3) * (-13441)) ^ 1748668124;
                        i2 = -1835214454;
                    } else {
                        iM3169 = (i4 - C0773.m3169("᩹ۜ")) * (-83);
                        i = ((iM3169 ^ i3) * 26483) ^ 1288598374;
                        i2 = -1921782756;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -2100510372:
                case 1709908238:
                    i11 = 6;
                    if (C3734.f12817 >= 0) {
                        iM3169 = (i3 - C0619.m2761("ۨ᩺")) * (-39);
                        i = ((iM3169 ^ i4) * (-25263)) ^ (-614732838);
                        i2 = 522127763;
                    } else {
                        iM3169 = (i4 - C0619.m2761("۟ۘ")) * 15;
                        i = ((iM3169 ^ i3) * 9287) ^ 256800643;
                        i2 = -1898526249;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -2096633203:
                case 826429036:
                    s = sArr[c];
                    if (C3690.f12684 <= 0) {
                        iM3169 = C0773.m3169("۠ۗ") ^ i3;
                        i = ((iM3169 ^ i4) * 6431) ^ 1940117433;
                        i2 = -998235525;
                    } else {
                        iM3169 = (C0773.m3169("֡ۜ") ^ i4) * (-53);
                        i = ((iM3169 ^ i3) * 13387) ^ 882075481;
                        i2 = -704825876;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1992490539:
                case -278241055:
                    i8 = i7 + 1;
                    if (C0487.f2131 <= 0) {
                        iM3169 = C0773.m3169("۠ۗ") ^ i3;
                        i = ((iM3169 ^ i4) * 6431) ^ 1940117433;
                        i2 = -998235525;
                    } else {
                        iM3169 = (C0619.m2761("᩸ۛ") + i3) * 97;
                        i = ((iM3169 ^ i4) * 27799) ^ (-1626543561);
                        i2 = -398454236;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1956695556:
                case -1440704294:
                    C17202.m40379(intent, strM9486);
                    applicationM10096 = C3099.m10096();
                    if (C1564.f5401 <= 0) {
                        iM3169 = C0773.m3169("۠ۗ") ^ i3;
                        i = ((iM3169 ^ i4) * 6431) ^ 1940117433;
                        i2 = -998235525;
                    } else {
                        iM3169 = (C0619.m2761("ܿۢ") + i4) * (-63);
                        i = ((iM3169 ^ i3) * 21605) ^ (-2074798640);
                        i2 = -136150554;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1930551760:
                case 90617585:
                    C1542.m5459();
                    AbstractC3624.m11755();
                    break;
                case -1703739903:
                case -1384086172:
                    i7 = s * 2;
                    if (C2023.m6964() <= 0) {
                        iM3169 = (C0773.m3169("ۚᩳ") + i4) * (-97);
                        i = ((iM3169 ^ i3) * (-13441)) ^ 1748668124;
                        i2 = -1835214454;
                    } else {
                        iM3169 = C0773.m3169("ܽ֡") ^ i3;
                        i = ((iM3169 ^ i4) * (-26603)) ^ 752109347;
                        i2 = -1051525011;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1600928113:
                case 1146454892:
                    i9 = 33208;
                    iM3169 = C0619.m2761("ܿܽ") ^ i3;
                    i = ((iM3169 ^ i4) * (-15505)) ^ (-1654489321);
                    i2 = 666196247;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1558717920:
                case 1141615570:
                    C7247.m19877(applicationM10096).m19881(intent);
                    break;
                case -1511731122:
                case -302395040:
                    C3998.m12920();
                    iM3169 = C0773.m3169("۠ۗ") ^ i3;
                    i = ((iM3169 ^ i4) * 6431) ^ 1940117433;
                    i2 = -998235525;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1172734623:
                case -180591324:
                    strM9486 = C2878.m9486(sArr2, i10, i11, i9);
                    if (C2702.f8586 <= 0) {
                        iM3169 = C0773.m3169("ᩳ۬") ^ i4;
                        i = ((iM3169 ^ i3) * 1727) ^ (-1532410124);
                        i2 = 1894067834;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ۡۖ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM3169 ^ i4) * 22807) ^ (-529198184);
                        i2 = -1905907477;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1006377734:
                case -400535287:
                    if (C3779.f12953 <= 0) {
                        iM3169 = C0773.m3169("۠ۗ") ^ i3;
                        i = ((iM3169 ^ i4) * 6431) ^ 1940117433;
                        i2 = -998235525;
                    } else {
                        iM3169 = C0773.m3169("ᩳ۬") ^ i4;
                        i = ((iM3169 ^ i3) * 1727) ^ (-1532410124);
                        i2 = 1894067834;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -960044973:
                case -667455863:
                    c = 195;
                    if (C2966.f9654 >= 0) {
                        iM3169 = (i3 - C0619.m2761("ۨ᩺")) * (-39);
                        i = ((iM3169 ^ i4) * (-25263)) ^ (-614732838);
                        i2 = 522127763;
                    } else {
                        iM3169 = C0619.m2761("᩶᩹") ^ i3;
                        i = ((iM3169 ^ i4) * (-30417)) ^ 1295201893;
                        i2 = -882228238;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -795648899:
                case 638975409:
                    C2375.m8065();
                    if (C1343.m4943()) {
                        iM3169 = C0773.m3169("ᩳ۬") ^ i4;
                        i = ((iM3169 ^ i3) * 1727) ^ (-1532410124);
                        i2 = 1894067834;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ۨ᩺")) * (-39);
                        i = ((iM3169 ^ i4) * (-25263)) ^ (-614732838);
                        i2 = 522127763;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -654575240:
                case 506255350:
                    int i13 = s + s2;
                    if (i8 - (i13 * i13) > 0) {
                        iM3169 = C0619.m2761("۬᩷") ^ i3;
                        i = ((iM3169 ^ i4) * (-27969)) ^ (-1277776273);
                        i2 = 205231579;
                    } else {
                        iM3169 = (C0619.m2761("ۨ۬") ^ i4) * 127;
                        i = ((iM3169 ^ i3) * (-18941)) ^ (-1562280510);
                        i2 = 1886156843;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -469284498:
                case -433243366:
                    C2288.m7767();
                    if (C3033.m9845() > 0) {
                        iM3169 = (i3 - C0619.m2761("ۨ᩺")) * (-39);
                        i = ((iM3169 ^ i4) * (-25263)) ^ (-614732838);
                        i2 = 522127763;
                    } else {
                        iM3169 = (C0619.m2761("ܰۛ") + i3) * 59;
                        i = ((iM3169 ^ i4) * 16641) ^ 466104498;
                        i2 = 1633094336;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 1679591237:
                case 2111623889:
                    sArr = f68929;
                    if (C3033.f9831 >= 0) {
                        iM3169 = C0773.m3169("ᩳ۬") ^ i4;
                        i = ((iM3169 ^ i3) * 1727) ^ (-1532410124);
                        i2 = 1894067834;
                    } else {
                        iM3169 = C0773.m3169("۟ۜ") ^ i4;
                        i = ((iM3169 ^ i3) * (-14769)) ^ 359455268;
                        i2 = 1541013069;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                default:
                    s2 = 1;
                    if (AbstractC0116.m1243() != 0) {
                        iM3169 = (i3 - C0619.m2761("ۨ᩺")) * (-39);
                        i = ((iM3169 ^ i4) * (-25263)) ^ (-614732838);
                        i2 = 522127763;
                    } else {
                        iM3169 = C0773.m3169("ۤۗ") ^ i4;
                        i = ((iM3169 ^ i3) * 1903) ^ 1820874170;
                        i2 = -2093756858;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x01a7 A[PHI: r7
      0x01a7: PHI (r7v4 int) = (r7v3 int), (r7v2 int), (r7v2 int), (r7v2 int) binds: [B:53:0x01a5, B:15:0x007a, B:12:0x0074, B:9:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x01db A[PHI: r6 r10 r11
      0x01db: PHI (r6v4 int) = (r6v3 int), (r6v2 int) binds: [B:57:0x01d9, B:37:0x00fe] A[DONT_GENERATE, DONT_INLINE]
      0x01db: PHI (r10v3 short[]) = (r10v2 short[]), (r10v4 short[]) binds: [B:57:0x01d9, B:37:0x00fe] A[DONT_GENERATE, DONT_INLINE]
      0x01db: PHI (r11v3 int) = (r11v2 int), (r11v4 int) binds: [B:57:0x01d9, B:37:0x00fe] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x020c A[PHI: r5 r15
      0x020c: PHI (r5v4 short) = (r5v3 short), (r5v2 short), (r5v2 short), (r5v2 short) binds: [B:61:0x020a, B:23:0x0096, B:17:0x007e, B:15:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x020c: PHI (r15v4 int) = (r15v2 int), (r15v3 int), (r15v2 int), (r15v2 int) binds: [B:61:0x020a, B:23:0x0096, B:17:0x007e, B:15:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x023f A[PHI: r4 r8
      0x023f: PHI (r4v4 short) = (r4v3 short), (r4v2 short), (r4v2 short) binds: [B:65:0x023d, B:49:0x0187, B:9:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x023f: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int) binds: [B:65:0x023d, B:49:0x0187, B:9:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x0275 A[PHI: r3 r12 r13 r14 r20
      0x0275: PHI (r3v4 char) = (r3v3 char), (r3v2 char), (r3v2 char), (r3v2 char) binds: [B:69:0x0273, B:33:0x00de, B:27:0x00b6, B:12:0x0074] A[DONT_GENERATE, DONT_INLINE]
      0x0275: PHI (r12v4 int) = (r12v2 int), (r12v3 int), (r12v2 int), (r12v2 int) binds: [B:69:0x0273, B:33:0x00de, B:27:0x00b6, B:12:0x0074] A[DONT_GENERATE, DONT_INLINE]
      0x0275: PHI (r13v4 short[]) = (r13v2 short[]), (r13v2 short[]), (r13v3 short[]), (r13v2 short[]) binds: [B:69:0x0273, B:33:0x00de, B:27:0x00b6, B:12:0x0074] A[DONT_GENERATE, DONT_INLINE]
      0x0275: PHI (r14v4 int) = (r14v2 int), (r14v2 int), (r14v3 int), (r14v2 int) binds: [B:69:0x0273, B:33:0x00de, B:27:0x00b6, B:12:0x0074] A[DONT_GENERATE, DONT_INLINE]
      0x0275: PHI (r20v5 short[]) = (r20v4 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]) binds: [B:69:0x0273, B:33:0x00de, B:27:0x00b6, B:12:0x0074] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final boolean m49078() {
        int iM3169;
        int i;
        int i2;
        int i3 = C2375.f7641;
        int i4 = C1519.f5300;
        int iM2761 = (C0619.m2761("ۙ֨") + i4) * (-59);
        int i5 = ((iM2761 ^ i3) * 27779) ^ (-632434413);
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM2761 ^ (-1393423168);
        SharedPreferences sharedPreferences = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 1932229444;
        while (true) {
            i15 = i6 ^ (i5 & (((i15 ^ i3) * 1325) >> 31));
            switch (i15) {
                case -2028782649:
                case -150141253:
                    sArr3 = f68929;
                    i13 = 343;
                    if (C2023.f6737) {
                        iM3169 = C0619.m2761("۫۠") ^ i3;
                        i = ((iM3169 ^ i4) * 1653) ^ (-2088560316);
                        i2 = -846009006;
                    } else {
                        iM3169 = (C0619.m2761("᩻۠") + i3) * (-5);
                        i = ((iM3169 ^ i4) * (-303)) ^ (-1056131429);
                        i2 = -451228354;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1967164582:
                case -1240975114:
                    int i16 = s + s2;
                    i7 = i16 * i16;
                    if (C3077.f9998) {
                        iM3169 = C0619.m2761("ۗ᩺") ^ i3;
                        i = ((iM3169 ^ i4) * (-20759)) ^ 1674492646;
                        i2 = 704259889;
                    } else {
                        iM3169 = C0773.m3169("ۘ᩸") ^ i3;
                        i = ((iM3169 ^ i4) * (-30481)) ^ 1365412889;
                        i2 = 1436996625;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1943740101:
                case -973898950:
                    if (C2419.f7754 < 0) {
                        iM3169 = C0619.m2761("۟۬") ^ i4;
                        i = ((iM3169 ^ i3) * 17513) ^ 553136648;
                        i2 = 1846946299;
                    } else {
                        iM3169 = C0619.m2761("۫۠") ^ i3;
                        i = ((iM3169 ^ i4) * 1653) ^ (-2088560316);
                        i2 = -846009006;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1839687931:
                case -1041740774:
                    s2 = 1;
                    if (C3492.f12043 <= 0) {
                        iM3169 = (C0619.m2761("ۨܿ") ^ i4) * (-111);
                        i = ((iM3169 ^ i3) * (-24573)) ^ (-361842441);
                        i2 = -1534904901;
                    } else {
                        iM3169 = C0773.m3169("ۡۨ") ^ i4;
                        i = ((iM3169 ^ i3) * 21241) ^ 1215742965;
                        i2 = 1438728002;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1800899488:
                case 1562664395:
                    i8 = s * 2;
                    if (C2354.f7599 >= 0) {
                        iM3169 = C0619.m2761("۟۬") ^ i4;
                        i = ((iM3169 ^ i3) * 17513) ^ 553136648;
                        i2 = 1846946299;
                    } else {
                        iM3169 = C0619.m2761("۫᩺") ^ i4;
                        i = ((iM3169 ^ i3) * (-13173)) ^ (-1651875238);
                        i2 = -1576925558;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1639675965:
                case 2105304666:
                    i9 = 1;
                    if (C3690.f12684 <= 0) {
                        iM3169 = (i4 - C0619.m2761("֨ܳ")) * 47;
                        i = ((iM3169 ^ i3) * (-10343)) ^ 1439796972;
                        i2 = -2076305097;
                    } else {
                        iM3169 = C0773.m3169("ܺ᩵") ^ i3;
                        i = ((iM3169 ^ i4) * (-13081)) ^ 553246137;
                        i2 = -1544471920;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1322499902:
                case 728944379:
                    sArr2 = f68929;
                    i11 = 340;
                    if (C1542.f5343 <= 0) {
                        iM3169 = C0773.m3169("ۘ᩸") ^ i3;
                        i = ((iM3169 ^ i4) * (-30481)) ^ 1365412889;
                        i2 = 1436996625;
                    } else {
                        iM3169 = (C0773.m3169("ۜ֡") + i4) * 5;
                        i = ((iM3169 ^ i3) * 19055) ^ (-322056652);
                        i2 = 346493991;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1318559191:
                case -1309312766:
                    C1343.m4943();
                    iM3169 = (C0619.m2761("ۨܿ") ^ i4) * (-111);
                    i = ((iM3169 ^ i3) * (-24573)) ^ (-361842441);
                    i2 = -1534904901;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1299480069:
                case -7821540:
                    C3448.m11257(C3448.m11252(sArr2, i11, i12, i10));
                    throw null;
                case -1186159490:
                case 257301141:
                    if (C1542.f5343 > 0) {
                        iM3169 = (C0619.m2761("ۨܿ") ^ i4) * (-111);
                        i = ((iM3169 ^ i3) * (-24573)) ^ (-361842441);
                        i2 = -1534904901;
                    } else {
                        iM3169 = C0619.m2761("۟۬") ^ i4;
                        i = ((iM3169 ^ i3) * 17513) ^ 553136648;
                        i2 = 1846946299;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1128310189:
                case 2122543127:
                    C0619.m2763();
                    return false;
                case -1123721621:
                case 561557192:
                    if (C2354.m7983()) {
                        iM3169 = C0619.m2761("۟۬") ^ i4;
                        i = ((iM3169 ^ i3) * 17513) ^ 553136648;
                        i2 = 1846946299;
                    } else {
                        iM3169 = (i4 - C0619.m2761("֨ܳ")) * 47;
                        i = ((iM3169 ^ i3) * (-10343)) ^ 1439796972;
                        i2 = -2076305097;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -783250522:
                case 965969512:
                    sArr = f68929;
                    c = 339;
                    if (C2287.m7745() <= 0) {
                        iM3169 = C0619.m2761("۫۠") ^ i3;
                        i = ((iM3169 ^ i4) * 1653) ^ (-2088560316);
                        i2 = -846009006;
                    } else {
                        iM3169 = C0773.m3169("ᩴۡ") ^ i3;
                        i = ((iM3169 ^ i4) * (-20507)) ^ 698193501;
                        i2 = 1077347316;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -684764014:
                case -579367904:
                    if ((i8 + i9) - i7 > 0) {
                        iM3169 = (i4 - C0773.m3169("ۙ۬")) * 77;
                        i = ((iM3169 ^ i3) * 20707) ^ 83388499;
                        i2 = 1136762073;
                    } else {
                        iM3169 = (C0619.m2761("֨ۧ") ^ i3) * (-87);
                        i = ((iM3169 ^ i4) * (-14117)) ^ 431711754;
                        i2 = -1496762940;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -297046030:
                case 1325323339:
                    i10 = 15279;
                    iM3169 = C0619.m2761("۫ᩴ") ^ i3;
                    i = ((iM3169 ^ i4) * 20605) ^ (-1611373309);
                    i2 = 1719830694;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -197220796:
                case 1239023795:
                    i12 = 3;
                    if (AbstractC0641.f2496 >= 0) {
                        iM3169 = C0619.m2761("۫۠") ^ i3;
                        i = ((iM3169 ^ i4) * 1653) ^ (-2088560316);
                        i2 = -846009006;
                    } else {
                        iM3169 = C0619.m2761("ܰܿ") ^ i3;
                        i = ((iM3169 ^ i4) * 7911) ^ (-172778696);
                        i2 = -967445619;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -114996890:
                case 382864878:
                    return sharedPreferences.getBoolean(C0773.m3166(sArr3, i13, i14, i10), true);
                case -12203830:
                case 887795040:
                    s = sArr[c];
                    if (C11235.f35427 >= 0) {
                        iM3169 = (i4 - C0619.m2761("֨ܳ")) * 47;
                        i = ((iM3169 ^ i3) * (-10343)) ^ 1439796972;
                        i2 = -2076305097;
                    } else {
                        iM3169 = C0619.m2761("۫᩵") ^ i4;
                        i = ((iM3169 ^ i3) * 16131) ^ (-861279973);
                        i2 = 1294399440;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 1196501354:
                case 1384915956:
                    i14 = 18;
                    if (C23916.f77426 <= 0) {
                        iM3169 = (C0619.m2761("ۨܿ") ^ i4) * (-111);
                        i = ((iM3169 ^ i3) * (-24573)) ^ (-361842441);
                        i2 = -1534904901;
                    } else {
                        iM3169 = C0773.m3169("ܳۧ") ^ i3;
                        i = ((iM3169 ^ i4) * 5173) ^ (-167115150);
                        i2 = -1912915189;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 1977056025:
                case 2064574533:
                    i10 = 17731;
                    iM3169 = C0619.m2761("۫ᩴ") ^ i3;
                    i = ((iM3169 ^ i4) * 20605) ^ (-1611373309);
                    i2 = 1719830694;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                default:
                    sharedPreferences = f68932;
                    if (sharedPreferences != null) {
                        iM3169 = (C0619.m2761("ۡ᩷") + i4) * 35;
                        i = ((iM3169 ^ i3) * 16953) ^ 497523242;
                        i2 = 2036562116;
                    } else {
                        iM3169 = C0773.m3169("ܺۖ") ^ i4;
                        i = ((iM3169 ^ i3) * (-3731)) ^ 1013447595;
                        i2 = -200493032;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final Application m49084() {
        ApplicationC17729 applicationC17729 = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        short[] sArr2 = null;
        int i4 = 0;
        int i5 = 0;
        int i6 = 853071933;
        int i7 = C1519.f5300;
        int i8 = C0487.f2131;
        int iM3169 = (i8 - C0773.m3169("۬᩶")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
        int i9 = ((iM3169 ^ i7) * 15877) ^ 1181676470;
        int i10 = 228500949;
        while (true) {
            i6 = ((((i6 ^ i7) * (-25745)) >> 31) & i9) ^ (iM3169 ^ i10);
            switch (i6) {
                case -1935159168:
                case -1024912826:
                    i = s * 9104;
                    if (C2834.f9334 <= 0) {
                        iM3169 = (i7 - C0619.m2761("֡᩷")) * (-121);
                        i9 = ((iM3169 ^ i8) * 3865) ^ 1808130374;
                        i10 = 946920229;
                    } else {
                        iM3169 = C0619.m2761("۟ܳ") ^ i8;
                        i9 = ((iM3169 ^ i7) * 2779) ^ 896554624;
                        i10 = -1600676113;
                    }
                    break;
                case -1869746581:
                case 833460824:
                    sArr = f68929;
                    c = 477;
                    if (C2419.f7754 >= 0) {
                        iM3169 = C0773.m3169("ۙۨ") ^ i8;
                        i9 = ((iM3169 ^ i7) * 15049) ^ 620759806;
                        i10 = -1181435404;
                    } else {
                        iM3169 = (C0773.m3169("ܳۢ") + i7) * 95;
                        i9 = ((iM3169 ^ i8) * 22057) ^ (-1361161881);
                        i10 = 810011889;
                    }
                    break;
                case -1778246916:
                case -1245960442:
                    AbstractC0641.m2813();
                    if (C1826.f6190 > 0) {
                        iM3169 = C0773.m3169("᩷۬") ^ i7;
                        i9 = ((iM3169 ^ i8) * (-12663)) ^ 1925648683;
                        i10 = -55077932;
                    } else {
                        iM3169 = C0619.m2761("۠ۧ") ^ i8;
                        i9 = ((iM3169 ^ i7) * 12087) ^ 1930194764;
                        i10 = -70728668;
                    }
                    break;
                case -1701600577:
                case 867147937:
                    if (C0950.f3488 >= 0) {
                        iM3169 = (i8 - C0773.m3169("ۘ֫")) * 65;
                        i9 = ((iM3169 ^ i7) * (-4013)) ^ 1663876020;
                        i10 = 1178048899;
                    } else {
                        iM3169 = C0619.m2761("۟ᩴ") ^ i7;
                        i9 = ((iM3169 ^ i8) * (-21321)) ^ 1799515447;
                        i10 = 1811393235;
                    }
                    break;
                case -1700031507:
                case -1439219612:
                    s = sArr[c];
                    if (C1321.f4751 >= 0) {
                        iM3169 = (i7 - C0619.m2761("֡᩷")) * (-121);
                        i9 = ((iM3169 ^ i8) * 3865) ^ 1808130374;
                        i10 = 946920229;
                    } else {
                        iM3169 = C0773.m3169("ۨ᩹") ^ i8;
                        i9 = ((iM3169 ^ i7) * (-26613)) ^ 1053427220;
                        i10 = -711416369;
                    }
                    break;
                case -1615502230:
                case -575518721:
                    i3 = 58908;
                    iM3169 = (i7 - C0619.m2761("ۜܰ")) * (-127);
                    i9 = ((iM3169 ^ i8) * 9135) ^ 2080224962;
                    i10 = -2137791564;
                    break;
                case -1607426721:
                case 1030552960:
                    applicationC17729 = f68934;
                    if (applicationC17729 != null) {
                        iM3169 = (C0773.m3169("᩹۬") + i7) * (-101);
                        i9 = ((iM3169 ^ i8) * (-20517)) ^ 852337810;
                        i10 = -2070836281;
                    } else {
                        iM3169 = (C0619.m2761("۬᩵") ^ i8) * (-49);
                        i9 = ((iM3169 ^ i7) * (-11759)) ^ (-1860381517);
                        i10 = 1516193914;
                    }
                    break;
                case -1360714301:
                case -143692427:
                    C2023.m6964();
                    if (!C2354.m7983()) {
                        iM3169 = C0619.m2761("۠ۧ") ^ i8;
                        i9 = ((iM3169 ^ i7) * 12087) ^ 1930194764;
                        i10 = -70728668;
                    } else {
                        iM3169 = (i8 - C0773.m3169("ۘ֫")) * 65;
                        i9 = ((iM3169 ^ i7) * (-4013)) ^ 1663876020;
                        i10 = 1178048899;
                    }
                    break;
                case -1266035303:
                case -609361360:
                    if (C0862.m3503()) {
                        iM3169 = C0773.m3169("۫ܺ") ^ i7;
                        i9 = ((iM3169 ^ i8) * (-6453)) ^ 742873681;
                        i10 = 1967721972;
                    } else {
                        iM3169 = C0773.m3169("ۙۨ") ^ i8;
                        i9 = ((iM3169 ^ i7) * 15049) ^ 620759806;
                        i10 = -1181435404;
                    }
                    break;
                case -1209662013:
                case 970679298:
                    i2 = s + 2276;
                    if (AbstractC0641.m2813() <= 0) {
                        iM3169 = C0773.m3169("ۙۨ") ^ i8;
                        i9 = ((iM3169 ^ i7) * 15049) ^ 620759806;
                        i10 = -1181435404;
                    } else {
                        iM3169 = C0619.m2761("ܽۖ") ^ i7;
                        i9 = ((iM3169 ^ i8) * (-14843)) ^ 329602330;
                        i10 = -403598456;
                    }
                    break;
                case -1073010173:
                case -745082594:
                    if (C0950.f3488 >= 0) {
                        iM3169 = (i7 - C0619.m2761("֡᩷")) * (-121);
                        i9 = ((iM3169 ^ i8) * 3865) ^ 1808130374;
                        i10 = 946920229;
                    } else {
                        iM3169 = C0619.m2761("᩷ۙ") ^ i8;
                        i9 = ((iM3169 ^ i7) * 26169) ^ 134653254;
                        i10 = 1999061733;
                    }
                    break;
                case -836272968:
                case 2077066758:
                    C3448.m11257(C3077.m10047(sArr2, i4, i5, i3));
                    throw null;
                case -649888892:
                case 1616199359:
                    if (AbstractC0641.m2813() <= 0) {
                        iM3169 = (i8 - C0773.m3169("ۘ֫")) * 65;
                        i9 = ((iM3169 ^ i7) * (-4013)) ^ 1663876020;
                        i10 = 1178048899;
                    } else {
                        iM3169 = (C0619.m2761("᩸᩻") ^ i8) * 47;
                        i9 = ((iM3169 ^ i7) * 18457) ^ (-203100764);
                        i10 = -679682486;
                    }
                    break;
                case -647795003:
                case 1809622262:
                    sArr2 = f68929;
                    i4 = 478;
                    if (C17202.f56030) {
                        iM3169 = C0619.m2761("ۡۘ") ^ i8;
                        i9 = ((iM3169 ^ i7) * (-17437)) ^ 394394236;
                        i10 = 1765019924;
                    } else {
                        iM3169 = C0619.m2761("۠ۧ") ^ i8;
                        i9 = ((iM3169 ^ i7) * 12087) ^ 1930194764;
                        i10 = -70728668;
                    }
                    break;
                case -642683753:
                case 600455358:
                    C3099.m10095();
                    iM3169 = C0619.m2761("۠ۧ") ^ i8;
                    i9 = ((iM3169 ^ i7) * 12087) ^ 1930194764;
                    i10 = -70728668;
                    break;
                case -323395781:
                case 569602967:
                    C2966.m9664();
                    return null;
                case -220079239:
                case 1432034785:
                    return applicationC17729;
                case 603357203:
                case 1711019354:
                    if (C3492.f12043 > 0) {
                        iM3169 = C0773.m3169("ۙۨ") ^ i8;
                        i9 = ((iM3169 ^ i7) * 15049) ^ 620759806;
                        i10 = -1181435404;
                    } else {
                        iM3169 = C0773.m3169("᩷۬") ^ i7;
                        i9 = ((iM3169 ^ i8) * (-12663)) ^ 1925648683;
                        i10 = -55077932;
                    }
                    break;
                case 948954254:
                case 1548719362:
                    if (i - (i2 * i2) > 0) {
                        iM3169 = (C0619.m2761("ۛۖ") ^ i7) * (-33);
                        i9 = ((iM3169 ^ i8) * 4093) ^ 167153559;
                        i10 = 354295525;
                    } else {
                        iM3169 = C0619.m2761("ܽ᩵") ^ i8;
                        i9 = ((iM3169 ^ i7) * 10153) ^ 536876482;
                        i10 = -893126081;
                    }
                    break;
                case 1050053623:
                case 2118486555:
                    i5 = 7;
                    if (C3734.m12152() >= 0) {
                        iM3169 = C0773.m3169("᩷۬") ^ i7;
                        i9 = ((iM3169 ^ i8) * (-12663)) ^ 1925648683;
                        i10 = -55077932;
                    } else {
                        iM3169 = C0619.m2761("ۗۗ") ^ i7;
                        i9 = ((iM3169 ^ i8) * (-32215)) ^ 340506721;
                        i10 = 291059303;
                    }
                    break;
                default:
                    i3 = 37107;
                    iM3169 = (i7 - C0619.m2761("ۜܰ")) * (-127);
                    i9 = ((iM3169 ^ i8) * 9135) ^ 2080224962;
                    i10 = -2137791564;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m49071(boolean z) {
        f68933 = z;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final boolean m49082() {
        return f68933;
    }

    static {
        C5328 c5328 = null;
        int i = 0;
        InterfaceC0812 interfaceC0812M24070 = null;
        C17939 c17939 = null;
        InterfaceC0812 interfaceC0812M24071 = null;
        int i2 = -687062854;
        int i3 = C0269.f1558;
        int i4 = C3099.f10023;
        int iM2761 = C0619.m2761("֡ۗ") ^ i3;
        int i5 = ((iM2761 ^ i4) * 24317) ^ 2093807100;
        int i6 = -1859603734;
        while (true) {
            int i7 = iM2761 ^ i6;
            while (true) {
                i2 = ((((i2 ^ i4) * (-23917)) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -1998556639:
                    case -1483921143:
                        interfaceC0812M24071 = C9015.m24070(c17939);
                        if (RunnableC3055.m9933() == 0) {
                            iM2761 = (C0619.m2761("֡֡") + i4) * (-39);
                            i5 = ((iM2761 ^ i3) * 22085) ^ (-5261865);
                            i6 = -1851403529;
                        } else {
                            iM2761 = C0619.m2761("ᩳۨ") ^ i4;
                            i5 = ((iM2761 ^ i3) * (-24977)) ^ (-948796098);
                            i6 = -449074212;
                        }
                        break;
                    case -1804262452:
                    case -1100046429:
                        c5328 = new C5328();
                        if (C11235.f35427 < 0) {
                            iM2761 = (C0619.m2761("ۡۜ") + i4) * (-53);
                            i5 = ((iM2761 ^ i3) * (-21365)) ^ 928438505;
                            i6 = 207248538;
                        } else {
                            iM2761 = (C0773.m3169("᩸ۖ") + i3) * 37;
                            i5 = ((iM2761 ^ i4) * 13289) ^ 1915867983;
                            i6 = -34819400;
                        }
                        break;
                    case -1530229051:
                    case 598869432:
                        f68935 = interfaceC0812M24070;
                        if (C1826.f6190 > 0) {
                            iM2761 = (i4 - C0773.m3169("ۤᩴ")) * 97;
                            i5 = ((iM2761 ^ i3) * 1631) ^ (-749185525);
                            i6 = -1341886313;
                        } else {
                            iM2761 = C0619.m2761("ᩳۨ") ^ i4;
                            i5 = ((iM2761 ^ i3) * (-24977)) ^ (-948796098);
                            i6 = -449074212;
                        }
                        break;
                    case -1345857891:
                    case -955152863:
                        c17939 = new C17939(i);
                        if (C1080.f3865 < 0) {
                            iM2761 = (C0619.m2761("᩵ܰ") + i3) * 25;
                            i5 = ((iM2761 ^ i4) * (-30641)) ^ (-369115524);
                            i6 = 968396771;
                        } else {
                            iM2761 = C0773.m3169("ܺ۬") ^ i4;
                            i5 = ((iM2761 ^ i3) * (-10633)) ^ (-1543374336);
                            i6 = 1081374940;
                        }
                        break;
                    case -1308298871:
                    case 675750825:
                        C1826.m6301();
                        if (C0950.f3488 >= 0) {
                            iM2761 = (C0619.m2761("ۜ۬") + i3) * (-63);
                            i5 = ((iM2761 ^ i4) * (-12719)) ^ 1026198052;
                            i6 = -1128170241;
                        } else {
                            iM2761 = C0773.m3169("ܺ۬") ^ i4;
                            i5 = ((iM2761 ^ i3) * (-10633)) ^ (-1543374336);
                            i6 = 1081374940;
                        }
                        break;
                    case -1157706703:
                    case -277365404:
                        if (C0269.m1775() > 0) {
                            iM2761 = (C0619.m2761("֫ۡ") + i3) * 59;
                            i5 = ((iM2761 ^ i4) * 24845) ^ (-271474866);
                            i6 = -1041013932;
                        } else {
                            iM2761 = C0773.m3169("ܺ۬") ^ i4;
                            i5 = ((iM2761 ^ i3) * (-10633)) ^ (-1543374336);
                            i6 = 1081374940;
                        }
                        break;
                    case -1117099121:
                    case -917840315:
                        if (C2834.m9344() >= 0) {
                            iM2761 = C0773.m3169("ۢ֡") ^ i4;
                            i5 = ((iM2761 ^ i3) * 21329) ^ (-343880235);
                            i6 = 1312379200;
                        } else {
                            iM2761 = C0773.m3169("ܺ۬") ^ i4;
                            i5 = ((iM2761 ^ i3) * (-10633)) ^ (-1543374336);
                            i6 = 1081374940;
                        }
                        break;
                    case -1071495216:
                    case 614220003:
                        f68931 = c5328;
                        if (!C0619.f2439) {
                            iM2761 = (C0773.m3169("۠᩹") ^ i3) * 49;
                            i5 = ((iM2761 ^ i4) * 9225) ^ (-441440169);
                            i6 = 2024075038;
                        } else {
                            iM2761 = C0619.m2761("ᩳۨ") ^ i4;
                            i5 = ((iM2761 ^ i3) * (-24977)) ^ (-948796098);
                            i6 = -449074212;
                        }
                        break;
                    case -534557489:
                    case 1960316856:
                        int i8 = 1;
                        if (C1783.f6087 <= 0) {
                            i = 1;
                            iM2761 = C0773.m3169("ܺ۬") ^ i4;
                            i5 = ((iM2761 ^ i3) * (-10633)) ^ (-1543374336);
                            i6 = 1081374940;
                        }
                        interfaceC0812M24070 = C9015.m24070(new C17193(i8));
                        if (C4282.f15546 > 0) {
                            int iM3169 = (C0773.m3169("ۖܶ") + i4) * 127;
                            i5 = 265423368 ^ ((iM3169 ^ i3) * 30321);
                            i7 = 1968993183 ^ iM3169;
                            i = 1;
                        } else {
                            i = 1;
                            iM2761 = C0773.m3169("ۢ֡") ^ i4;
                            i5 = ((iM2761 ^ i3) * 21329) ^ (-343880235);
                            i6 = 1312379200;
                        }
                        break;
                        break;
                        break;
                    case -508822768:
                    case 1122000141:
                        C3099.m10095();
                        C11235.m28309();
                        iM2761 = C0773.m3169("ܺ۬") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-10633)) ^ (-1543374336);
                        i6 = 1081374940;
                        break;
                    case 405169320:
                    case 1088971029:
                        C2966.m9664();
                        C1321.m4852();
                        throw new RuntimeException();
                    case 451262017:
                    case 1804131355:
                        f68928 = interfaceC0812M24071;
                        if (C1080.f3865 < 0) {
                            iM2761 = C0773.m3169("ۡۛ") ^ i3;
                            i5 = ((iM2761 ^ i4) * 8095) ^ 1815700375;
                            i6 = 64125689;
                        } else {
                            iM2761 = C0619.m2761("ᩳۨ") ^ i4;
                            i5 = ((iM2761 ^ i3) * (-24977)) ^ (-948796098);
                            i6 = -449074212;
                        }
                        break;
                    case 747912956:
                    case 945384758:
                        Looper looperM12268 = C3779.m12268();
                        if (C4238.f15451 < 0) {
                            f68927 = new Handler(looperM12268);
                            return;
                        }
                        iM2761 = C0773.m3169("ۢ֡") ^ i4;
                        i5 = ((iM2761 ^ i3) * 21329) ^ (-343880235);
                        i6 = 1312379200;
                        break;
                    default:
                        if (C2878.f9462) {
                            iM2761 = (C0773.m3169("᩸ۖ") + i3) * 37;
                            i5 = ((iM2761 ^ i4) * 13289) ^ 1915867983;
                            i6 = -34819400;
                            break;
                        }
                        iM2761 = C0773.m3169("ܺ۬") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-10633)) ^ (-1543374336);
                        i6 = 1081374940;
                        break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final boolean m49054() {
        return f68930;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x01f7 A[PHI: r10 r11 r13 r14 r15 r21
      0x01f7: PHI (r10v4 int) = (r10v3 int), (r10v2 int), (r10v2 int) binds: [B:50:0x01f5, B:39:0x016c, B:13:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x01f7: PHI (r11v4 short) = (r11v3 short), (r11v2 short), (r11v2 short) binds: [B:50:0x01f5, B:39:0x016c, B:13:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x01f7: PHI (r13v4 short[]) = (r13v2 short[]), (r13v3 short[]), (r13v2 short[]) binds: [B:50:0x01f5, B:39:0x016c, B:13:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x01f7: PHI (r14v4 int) = (r14v2 int), (r14v3 int), (r14v2 int) binds: [B:50:0x01f5, B:39:0x016c, B:13:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x01f7: PHI (r15v4 int) = (r15v2 int), (r15v3 int), (r15v2 int) binds: [B:50:0x01f5, B:39:0x016c, B:13:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x01f7: PHI (r21v24 android.app.Application) = (r21v6 android.app.Application), (r21v11 android.app.Application), (r21v25 android.app.Application) binds: [B:50:0x01f5, B:39:0x016c, B:13:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x02ab A[PHI: r2 r8 r16 r21 r22
      0x02ab: PHI (r2v6 java.lang.String) = 
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
      (r2v3 java.lang.String)
      (r2v2 java.lang.String)
     binds: [B:66:0x02a9, B:62:0x0288, B:54:0x022d, B:35:0x0145, B:16:0x0075] A[DONT_GENERATE, DONT_INLINE]
      0x02ab: PHI (r8v6 short) = (r8v2 short), (r8v2 short), (r8v3 short), (r8v2 short), (r8v2 short) binds: [B:66:0x02a9, B:62:0x0288, B:54:0x022d, B:35:0x0145, B:16:0x0075] A[DONT_GENERATE, DONT_INLINE]
      0x02ab: PHI (r16v6 short[]) = (r16v2 short[]), (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:66:0x02a9, B:62:0x0288, B:54:0x022d, B:35:0x0145, B:16:0x0075] A[DONT_GENERATE, DONT_INLINE]
      0x02ab: PHI (r21v29 android.app.Application) = 
      (r21v2 android.app.Application)
      (r21v3 android.app.Application)
      (r21v5 android.app.Application)
      (r21v12 android.app.Application)
      (r21v30 android.app.Application)
     binds: [B:66:0x02a9, B:62:0x0288, B:54:0x022d, B:35:0x0145, B:16:0x0075] A[DONT_GENERATE, DONT_INLINE]
      0x02ab: PHI (r22v7 int) = (r22v3 int), (r22v3 int), (r22v4 int), (r22v3 int), (r22v3 int) binds: [B:66:0x02a9, B:62:0x0288, B:54:0x022d, B:35:0x0145, B:16:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0073, code lost:
    
        if (l.C0773.m3161() == 0) goto L16;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String m49059(int r25, java.lang.Object... r26) {
        /*
            Method dump skipped, instruction units count: 880
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C21576.m49059(int, java.lang.Object[]):java.lang.String");
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final void m49073() {
        f68930 = true;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final C24363 m49093() {
        Object value = null;
        String strM6310 = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        short[] sArr2 = null;
        int i4 = 0;
        int i5 = 339949704;
        int i6 = C2419.f7754;
        int i7 = C1146.f4234;
        int iM2761 = (C0619.m2761("ۖܿ") + i6) * (-41);
        int i8 = ((iM2761 ^ i7) * 16293) ^ 1076003475;
        int i9 = 1133657414;
        while (true) {
            i5 = ((((i5 ^ i7) * 16917) >> 31) & i8) ^ (iM2761 ^ i9);
            switch (i5) {
                case -2107114319:
                case 1708315305:
                    C2485.m8357();
                    C2878.m9491();
                    return null;
                case -1737580413:
                case -213650110:
                    value = f68935.getValue();
                    if (C3690.f12684 <= 0) {
                        iM2761 = C0619.m2761("۟ۨ") ^ i6;
                        i8 = ((iM2761 ^ i7) * 25991) ^ (-1310109327);
                        i9 = 1324709513;
                    } else {
                        iM2761 = C0619.m2761("᩵᩸") ^ i6;
                        i8 = ((iM2761 ^ i7) * (-11327)) ^ 892247496;
                        i9 = -1641935373;
                    }
                    break;
                case -1659992775:
                case 796064106:
                    if (C2966.f9654 >= 0) {
                        iM2761 = (i7 - C0619.m2761("᩶ܺ")) * 99;
                        i8 = ((iM2761 ^ i6) * (-10903)) ^ (-686740409);
                        i9 = 1964575883;
                    } else {
                        iM2761 = C0773.m3169("᩵ܽ") ^ i7;
                        i8 = ((iM2761 ^ i6) * (-25223)) ^ (-1767721750);
                        i9 = 479641152;
                    }
                    break;
                case -1393763542:
                case 234758688:
                    s = sArr[c];
                    if (C1080.f3865 >= 0) {
                        iM2761 = C0773.m3169("۫֫") ^ i7;
                        i8 = ((iM2761 ^ i6) * 23727) ^ (-61338619);
                        i9 = 1423361630;
                    } else {
                        iM2761 = C0773.m3169("۬ۛ") ^ i6;
                        i8 = ((iM2761 ^ i7) * 13011) ^ 818404684;
                        i9 = -2082759378;
                    }
                    break;
                case -1043131278:
                case 18047747:
                    i3 = 56850;
                    iM2761 = (C0619.m2761("֫ܰ") ^ i7) * (-127);
                    i8 = ((iM2761 ^ i6) * (-18543)) ^ 365801724;
                    i9 = -2134474715;
                    break;
                case -964530966:
                case 1206610364:
                    C2966.m9664();
                    C0773.m3161();
                    iM2761 = (C0773.m3169("ܽܺ") ^ i6) * 71;
                    i8 = ((iM2761 ^ i7) * 18103) ^ 573945053;
                    i9 = -1126612280;
                    break;
                case -944169246:
                case 195854795:
                    i = 37332 * s;
                    if (C2485.f7950 != 0) {
                        iM2761 = C0773.m3169("۟ᩳ") ^ i6;
                        i8 = ((iM2761 ^ i7) * 10369) ^ 464083325;
                        i9 = 1682407319;
                    } else {
                        iM2761 = (i7 - C0619.m2761("᩹ۜ")) * (-75);
                        i8 = ((iM2761 ^ i6) * 4805) ^ 946083781;
                        i9 = -1093645699;
                    }
                    break;
                case -657947530:
                case -206328138:
                    i2 = s + 9333;
                    if (C3077.m10041()) {
                        iM2761 = C0773.m3169("۟ᩳ") ^ i6;
                        i8 = ((iM2761 ^ i7) * 10369) ^ 464083325;
                        i9 = 1682407319;
                    } else {
                        iM2761 = C0773.m3169("ܺۘ") ^ i6;
                        i8 = ((iM2761 ^ i7) * (-15767)) ^ 2029560384;
                        i9 = -821208133;
                    }
                    break;
                case -483130622:
                case -220718757:
                    i3 = 63831;
                    iM2761 = (C0619.m2761("֫ܰ") ^ i7) * (-127);
                    i8 = ((iM2761 ^ i6) * (-18543)) ^ 365801724;
                    i9 = -2134474715;
                    break;
                case -458275716:
                case 1793578913:
                    if (C23916.f77426 <= 0) {
                        iM2761 = C0619.m2761("۟ۨ") ^ i6;
                        i8 = ((iM2761 ^ i7) * 25991) ^ (-1310109327);
                        i9 = 1324709513;
                    } else {
                        iM2761 = (C0773.m3169("ܽܺ") ^ i6) * 71;
                        i8 = ((iM2761 ^ i7) * 18103) ^ 573945053;
                        i9 = -1126612280;
                    }
                    break;
                case -332377751:
                case 2004305640:
                    C1564.m5509();
                    if (C3779.f12953 <= 0) {
                        iM2761 = (i7 - C0619.m2761("᩶ܺ")) * 99;
                        i8 = ((iM2761 ^ i6) * (-10903)) ^ (-686740409);
                        i9 = 1964575883;
                    } else {
                        iM2761 = (C0773.m3169("ܽܺ") ^ i6) * 71;
                        i8 = ((iM2761 ^ i7) * 18103) ^ 573945053;
                        i9 = -1126612280;
                    }
                    break;
                case -292952213:
                case 685043145:
                    strM6310 = C1826.m6310(sArr2, i4, 13, i3);
                    if (C3998.f13671 != 0) {
                        iM2761 = (i7 - C0619.m2761("᩶ܺ")) * 99;
                        i8 = ((iM2761 ^ i6) * (-10903)) ^ (-686740409);
                        i9 = 1964575883;
                    } else {
                        iM2761 = (i7 - C0773.m3169("۠ۙ")) * 55;
                        i8 = ((iM2761 ^ i6) * 22903) ^ (-1133310850);
                        i9 = -710466344;
                    }
                    break;
                case -136430215:
                case 374768346:
                    sArr2 = f68929;
                    if (RunnableC3055.f9898 >= 0) {
                        iM2761 = C0773.m3169("۫֫") ^ i7;
                        i8 = ((iM2761 ^ i6) * 23727) ^ (-61338619);
                        i9 = 1423361630;
                    } else {
                        iM2761 = C0619.m2761("ܰۙ") ^ i7;
                        i8 = ((iM2761 ^ i6) * (-14753)) ^ (-980995717);
                        i9 = -340820634;
                    }
                    break;
                case 467808137:
                case 1540802253:
                    i4 = 734;
                    if (C2419.f7754 >= 0) {
                        iM2761 = C0773.m3169("۫֫") ^ i7;
                        i8 = ((iM2761 ^ i6) * 23727) ^ (-61338619);
                        i9 = 1423361630;
                    } else {
                        iM2761 = C0619.m2761("ᩴ۬") ^ i6;
                        i8 = ((iM2761 ^ i7) * 491) ^ 1148274546;
                        i9 = 1727863833;
                    }
                    break;
                case 582518419:
                case 1732041235:
                    sArr = f68929;
                    c = 733;
                    if (C2834.f9334 <= 0) {
                        iM2761 = (i7 - C0619.m2761("᩶ܺ")) * 99;
                        i8 = ((iM2761 ^ i6) * (-10903)) ^ (-686740409);
                        i9 = 1964575883;
                    } else {
                        iM2761 = (C0773.m3169("۫᩺") ^ i6) * 73;
                        i8 = ((iM2761 ^ i7) * (-2749)) ^ (-1084863612);
                        i9 = -1852374947;
                    }
                    break;
                case 1011141431:
                case 1614113466:
                    C0269.m1781(value, strM6310);
                    return (C24363) value;
                case 1125002985:
                case 1199209711:
                    if ((i2 * i2) - i < 0) {
                        iM2761 = C0773.m3169("᩶۫") ^ i6;
                        i8 = ((iM2761 ^ i7) * 7699) ^ 43063158;
                        i9 = 1235742413;
                    } else {
                        iM2761 = C0773.m3169("ܿ֫") ^ i7;
                        i8 = ((iM2761 ^ i6) * 26499) ^ (-1819660011);
                        i9 = 1397603148;
                    }
                    break;
                case 2020218256:
                case 2036444217:
                    if (C0773.f2792 <= 0) {
                        iM2761 = C0773.m3169("۫֫") ^ i7;
                        i8 = ((iM2761 ^ i6) * 23727) ^ (-61338619);
                        i9 = 1423361630;
                    } else {
                        iM2761 = (C0619.m2761("ۜۜ") ^ i7) * 43;
                        i8 = ((iM2761 ^ i6) * 3815) ^ (-816510377);
                        i9 = -1961126468;
                    }
                    break;
                default:
                    C3492.m11488();
                    if (C2354.f7599 >= 0) {
                        iM2761 = C0773.m3169("۫֫") ^ i7;
                        i8 = ((iM2761 ^ i6) * 23727) ^ (-61338619);
                        i9 = 1423361630;
                    } else {
                        iM2761 = C0619.m2761("۟ۨ") ^ i6;
                        i8 = ((iM2761 ^ i7) * 25991) ^ (-1310109327);
                        i9 = 1324709513;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Typeface m49083() {
        Object value = null;
        String strM11809 = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        short s2 = 0;
        int i3 = 0;
        short[] sArr2 = null;
        int i4 = 0;
        int i5 = 1625564101;
        int i6 = C2419.f7754;
        int i7 = C2966.f9654;
        int iM3169 = (i6 - C0773.m3169("ۚۚ")) * 83;
        int i8 = ((iM3169 ^ i7) * (-22457)) ^ (-611929755);
        int i9 = 1645865444;
        while (true) {
            i5 = ((((i5 ^ i7) * (-651)) >> 31) & i8) ^ (iM3169 ^ i9);
            switch (i5) {
                case -2100286428:
                case 73405639:
                    C17202.m40372();
                    if (!C4282.m13644()) {
                        iM3169 = C0619.m2761("ۚۗ") ^ i7;
                        i8 = ((iM3169 ^ i6) * (-5381)) ^ 1722938527;
                        i9 = 865729864;
                    } else {
                        iM3169 = C0773.m3169("ܶۛ") ^ i7;
                        i8 = ((iM3169 ^ i6) * 20011) ^ 306029265;
                        i9 = 768434462;
                    }
                    break;
                case -1979171195:
                case -856651811:
                    s = sArr[c];
                    if (C0773.m3161() != 0) {
                        iM3169 = C0773.m3169("ܶۛ") ^ i7;
                        i8 = ((iM3169 ^ i6) * 20011) ^ 306029265;
                        i9 = 768434462;
                    } else {
                        iM3169 = C0619.m2761("᩶ܿ") ^ i6;
                        i8 = ((iM3169 ^ i7) * (-17691)) ^ 2060289558;
                        i9 = -1466678403;
                    }
                    break;
                case -1931368166:
                case -1904754839:
                    value = f68928.getValue();
                    if (C2375.f7641 <= 0) {
                        iM3169 = C0619.m2761("ۚۗ") ^ i7;
                        i8 = ((iM3169 ^ i6) * (-5381)) ^ 1722938527;
                        i9 = 865729864;
                    } else {
                        iM3169 = (C0773.m3169("ۗܽ") + i6) * (-97);
                        i8 = ((iM3169 ^ i7) * 257) ^ (-417004163);
                        i9 = -2141790052;
                    }
                    break;
                case -1884505688:
                case 551598462:
                    i = s + 6743;
                    if (C1542.f5343 <= 0) {
                        iM3169 = (C0619.m2761("ۚܽ") ^ i6) * (-5);
                        i8 = ((iM3169 ^ i7) * (-1379)) ^ 1498608595;
                        i9 = -679718633;
                    } else {
                        iM3169 = C0773.m3169("֡ۡ") ^ i6;
                        i8 = ((iM3169 ^ i7) * (-8313)) ^ (-1971090828);
                        i9 = 836468024;
                    }
                    break;
                case -1851549983:
                case 2037408232:
                    C0950.m3785();
                    iM3169 = C0619.m2761("ۚۗ") ^ i7;
                    i8 = ((iM3169 ^ i6) * (-5381)) ^ 1722938527;
                    i9 = 865729864;
                    break;
                case -1366891594:
                case 849873301:
                    C1080.m4050();
                    C0950.m3785();
                    return null;
                case -1328397640:
                case 795378957:
                    if (C3734.f12817 < 0) {
                        iM3169 = (C0619.m2761("ܿ᩵") ^ i6) * (-27);
                        i8 = ((iM3169 ^ i7) * (-14509)) ^ (-316715600);
                        i9 = 1606492253;
                    } else {
                        iM3169 = C0619.m2761("ۚۗ") ^ i7;
                        i8 = ((iM3169 ^ i6) * (-5381)) ^ 1722938527;
                        i9 = 865729864;
                    }
                    break;
                case -1322283243:
                case 1130502745:
                    strM11809 = RunnableC3646.m11809(sArr2, i4, 13, i3);
                    if (C3492.f12043 <= 0) {
                        iM3169 = (C0619.m2761("ܿ᩵") ^ i6) * (-27);
                        i8 = ((iM3169 ^ i7) * (-14509)) ^ (-316715600);
                        i9 = 1606492253;
                    } else {
                        iM3169 = C0773.m3169("ۤ᩻") ^ i6;
                        i8 = ((iM3169 ^ i7) * (-30917)) ^ 906646816;
                        i9 = 498252673;
                    }
                    break;
                case -1179907630:
                case -126836679:
                    i2 = i * i;
                    s2 = 26972;
                    if (C2485.m8357() <= 0) {
                        iM3169 = C0619.m2761("ۚۗ") ^ i7;
                        i8 = ((iM3169 ^ i6) * (-5381)) ^ 1722938527;
                        i9 = 865729864;
                    } else {
                        iM3169 = C0773.m3169("۠ᩴ") ^ i7;
                        i8 = ((iM3169 ^ i6) * (-2425)) ^ 1972779616;
                        i9 = 537698618;
                    }
                    break;
                case -1164684678:
                case 554802364:
                    i3 = 26843;
                    iM3169 = C0619.m2761("ܰᩳ") ^ i7;
                    i8 = ((iM3169 ^ i6) * (-21207)) ^ 1632657129;
                    i9 = 325616617;
                    break;
                case -1122792595:
                case -107475322:
                    if ((s * s2) - i2 <= 0) {
                        iM3169 = (i7 - C0619.m2761("᩸ܰ")) * 119;
                        i8 = ((iM3169 ^ i6) * 3845) ^ (-1736966385);
                        i9 = -222398123;
                    } else {
                        iM3169 = C0773.m3169("᩹ܶ") ^ i6;
                        i8 = ((iM3169 ^ i7) * 503) ^ (-1908660982);
                        i9 = -1452972309;
                    }
                    break;
                case -995233327:
                case 1585136380:
                    if (C1783.f6087 <= 0) {
                        iM3169 = C0619.m2761("ۚۗ") ^ i7;
                        i8 = ((iM3169 ^ i6) * (-5381)) ^ 1722938527;
                        i9 = 865729864;
                    } else {
                        iM3169 = (i7 - C0773.m3169("֡֡")) * 101;
                        i8 = ((iM3169 ^ i6) * 27807) ^ 1111364946;
                        i9 = 1826775982;
                    }
                    break;
                case -904235604:
                case 127611682:
                    sArr2 = f68929;
                    if (C2375.f7641 <= 0) {
                        iM3169 = (C0619.m2761("ܿ᩵") ^ i6) * (-27);
                        i8 = ((iM3169 ^ i7) * (-14509)) ^ (-316715600);
                        i9 = 1606492253;
                    } else {
                        iM3169 = (C0619.m2761("ܽۘ") + i6) * (-101);
                        i8 = ((iM3169 ^ i7) * (-15215)) ^ 1212393943;
                        i9 = 1405720669;
                    }
                    break;
                case -488008058:
                case 1167994747:
                    if (C4238.f15451 >= 0) {
                        iM3169 = C0619.m2761("ۚۗ") ^ i7;
                        i8 = ((iM3169 ^ i6) * (-5381)) ^ 1722938527;
                        i9 = 865729864;
                    } else {
                        iM3169 = C0773.m3169("ܺ۠") ^ i6;
                        i8 = ((iM3169 ^ i7) * 7913) ^ 52866411;
                        i9 = -1465806239;
                    }
                    break;
                case -453588191:
                case 550941965:
                    if (C0862.f3233 != 0) {
                        iM3169 = (C0619.m2761("ܿ᩵") ^ i6) * (-27);
                        i8 = ((iM3169 ^ i7) * (-14509)) ^ (-316715600);
                        i9 = 1606492253;
                    } else {
                        iM3169 = (C0619.m2761("᩹۫") + i7) * (-55);
                        i8 = ((iM3169 ^ i6) * (-32289)) ^ 1315845809;
                        i9 = -1217230792;
                    }
                    break;
                case -380649292:
                case -84258232:
                    i3 = 47521;
                    iM3169 = C0619.m2761("ܰᩳ") ^ i7;
                    i8 = ((iM3169 ^ i6) * (-21207)) ^ 1632657129;
                    i9 = 325616617;
                    break;
                case 935198100:
                case 1553285146:
                    sArr = f68929;
                    c = 463;
                    if (C4238.f15451 >= 0) {
                        iM3169 = (C0619.m2761("ܿ᩵") ^ i6) * (-27);
                        i8 = ((iM3169 ^ i7) * (-14509)) ^ (-316715600);
                        i9 = 1606492253;
                    } else {
                        iM3169 = C0619.m2761("ۢۜ") ^ i7;
                        i8 = ((iM3169 ^ i6) * 1307) ^ (-381768996);
                        i9 = 2146865023;
                    }
                    break;
                case 984949257:
                case 2074931738:
                    i4 = 464;
                    if (AbstractC3624.f12429 <= 0) {
                        iM3169 = (C0619.m2761("ܿ᩵") ^ i6) * (-27);
                        i8 = ((iM3169 ^ i7) * (-14509)) ^ (-316715600);
                        i9 = 1606492253;
                    } else {
                        iM3169 = C0619.m2761("ۘ᩵") ^ i7;
                        i8 = ((iM3169 ^ i6) * 29909) ^ (-1459689688);
                        i9 = -562220793;
                    }
                    break;
                default:
                    C2310.m7811(value, strM11809);
                    return (Typeface) value;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0180 A[PHI: r3 r4 r6
      0x0180: PHI (r3v4 short) = (r3v3 short), (r3v2 short) binds: [B:50:0x017e, B:42:0x0138] A[DONT_GENERATE, DONT_INLINE]
      0x0180: PHI (r4v4 int) = (r4v3 int), (r4v2 int) binds: [B:50:0x017e, B:42:0x0138] A[DONT_GENERATE, DONT_INLINE]
      0x0180: PHI (r6v3 short) = (r6v2 short), (r6v4 short) binds: [B:50:0x017e, B:42:0x0138] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x01d3 A[PHI: r0
      0x01d3: PHI (r0v6 java.lang.CharSequence) = (r0v2 java.lang.CharSequence), (r0v5 java.lang.CharSequence), (r0v2 java.lang.CharSequence) binds: [B:58:0x01d1, B:31:0x00c4, B:14:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0207 A[PHI: r2 r5 r9
      0x0207: PHI (r2v5 char) = (r2v2 char), (r2v3 char), (r2v2 char), (r2v2 char) binds: [B:62:0x0205, B:54:0x01b2, B:46:0x015a, B:10:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x0207: PHI (r5v6 int) = (r5v2 int), (r5v2 int), (r5v4 int), (r5v2 int) binds: [B:62:0x0205, B:54:0x01b2, B:46:0x015a, B:10:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x0207: PHI (r9v6 int) = (r9v2 int), (r9v2 int), (r9v2 int), (r9v7 int) binds: [B:62:0x0205, B:54:0x01b2, B:46:0x015a, B:10:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0059, code lost:
    
        if (l.C1826.f6190 > 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0065, code lost:
    
        if (l.C2485.f7950 == 0) goto L14;
     */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.CharSequence m49075(int r17) {
        /*
            Method dump skipped, instruction units count: 764
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C21576.m49075(int):java.lang.CharSequence");
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Handler m49077() {
        return f68927;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m49062(long j, Runnable runnable) {
        f68927.postDelayed(runnable, j);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00d8 A[PHI: r2 r3 r4
      0x00d8: PHI (r2v3 android.content.ClipData) = (r2v2 android.content.ClipData), (r2v1 android.content.ClipData), (r2v1 android.content.ClipData) binds: [B:30:0x00be, B:26:0x009b, B:23:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x00d8: PHI (r3v3 java.lang.String) = (r3v2 java.lang.String), (r3v1 java.lang.String), (r3v1 java.lang.String) binds: [B:30:0x00be, B:26:0x009b, B:23:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x00d8: PHI (r4v2 java.lang.CharSequence) = (r4v1 java.lang.CharSequence), (r4v1 java.lang.CharSequence), (r4v3 java.lang.CharSequence) binds: [B:30:0x00be, B:26:0x009b, B:23:0x007d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:48:0x018d A[PHI: r14
      0x018d: PHI (r14v3 int) = (r14v2 int), (r14v1 int), (r14v1 int) binds: [B:47:0x018b, B:17:0x0062, B:15:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x025b A[PHI: r1 r8 r15
      0x025b: PHI (r1v3 java.lang.Object) = (r1v1 java.lang.Object), (r1v2 java.lang.Object), (r1v1 java.lang.Object) binds: [B:66:0x0259, B:42:0x0157, B:12:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x025b: PHI (r8v3 int) = (r8v2 int), (r8v1 int), (r8v1 int) binds: [B:66:0x0259, B:42:0x0157, B:12:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x025b: PHI (r15v3 short[]) = (r15v1 short[]), (r15v2 short[]), (r15v1 short[]) binds: [B:66:0x0259, B:42:0x0157, B:12:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x0290 A[PHI: r7 r21
      0x0290: PHI (r7v3 short) = (r7v2 short), (r7v1 short), (r7v1 short), (r7v1 short), (r7v1 short) binds: [B:70:0x028e, B:15:0x005e, B:12:0x0056, B:9:0x004d, B:6:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x0290: PHI (r21v2 java.lang.String) = 
      (r21v1 java.lang.String)
      (r21v1 java.lang.String)
      (r21v1 java.lang.String)
      (r21v1 java.lang.String)
      (r21v4 java.lang.String)
     binds: [B:70:0x028e, B:15:0x005e, B:12:0x0056, B:9:0x004d, B:6:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x02c4 A[PHI: r5 r9 r10 r12 r13 r16 r22
      0x02c4: PHI (r5v3 int) = (r5v2 int), (r5v2 int), (r5v2 int), (r5v4 int) binds: [B:74:0x02c2, B:62:0x0239, B:51:0x01c3, B:38:0x0133] A[DONT_GENERATE, DONT_INLINE]
      0x02c4: PHI (r9v3 int) = (r9v1 int), (r9v2 int), (r9v1 int), (r9v1 int) binds: [B:74:0x02c2, B:62:0x0239, B:51:0x01c3, B:38:0x0133] A[DONT_GENERATE, DONT_INLINE]
      0x02c4: PHI (r10v3 short) = (r10v1 short), (r10v2 short), (r10v1 short), (r10v1 short) binds: [B:74:0x02c2, B:62:0x0239, B:51:0x01c3, B:38:0x0133] A[DONT_GENERATE, DONT_INLINE]
      0x02c4: PHI (r12v3 short[]) = (r12v1 short[]), (r12v1 short[]), (r12v2 short[]), (r12v1 short[]) binds: [B:74:0x02c2, B:62:0x0239, B:51:0x01c3, B:38:0x0133] A[DONT_GENERATE, DONT_INLINE]
      0x02c4: PHI (r13v3 int) = (r13v1 int), (r13v1 int), (r13v2 int), (r13v1 int) binds: [B:74:0x02c2, B:62:0x0239, B:51:0x01c3, B:38:0x0133] A[DONT_GENERATE, DONT_INLINE]
      0x02c4: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:74:0x02c2, B:62:0x0239, B:51:0x01c3, B:38:0x0133] A[DONT_GENERATE, DONT_INLINE]
      0x02c4: PHI (r22v5 char) = (r22v4 char), (r22v3 char), (r22v3 char), (r22v3 char) binds: [B:74:0x02c2, B:62:0x0239, B:51:0x01c3, B:38:0x0133] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final String m49080() {
        int iM2761;
        int i;
        int i2;
        Object objM49087 = null;
        ClipData primaryClip = null;
        String str = null;
        CharSequence text = null;
        short s = 0;
        int i3 = 0;
        int i4 = 0;
        short s2 = 0;
        int i5 = 0;
        short[] sArr = null;
        int i6 = 0;
        int i7 = 0;
        short[] sArr2 = null;
        int i8 = 469403658;
        int i9 = C3033.f9831;
        int i10 = C1542.f5343;
        int iM3169 = C0773.m3169("ᩳۧ") ^ i9;
        int i11 = ((iM3169 ^ i10) * (-12103)) ^ (-1297515263);
        int i12 = iM3169 ^ 2011564552;
        short[] sArr3 = null;
        int i13 = 0;
        String strM5399 = null;
        char c = 0;
        while (true) {
            i8 = i12 ^ (i11 & (((i8 ^ i10) * 31741) >> 31));
            switch (i8) {
                case -2120655241:
                case 1647024869:
                    i5 = 8808;
                    iM2761 = C0773.m3169("ۙۢ") ^ i9;
                    i = ((iM2761 ^ i10) * 18483) ^ 1649592108;
                    i2 = 938744905;
                    i12 = iM2761 ^ i2;
                    i11 = i;
                    break;
                case -2029094393:
                case -519923897:
                    i3 = s + 7914;
                    if (C3492.f12043 <= 0) {
                        iM2761 = (C0773.m3169("ܿۡ") ^ i10) * 87;
                        i = ((iM2761 ^ i9) * 19101) ^ (-422971542);
                        i2 = 672060905;
                    } else {
                        iM2761 = C0619.m2761("ۘܶ") ^ i9;
                        i = ((iM2761 ^ i10) * 27339) ^ 1822146844;
                        i2 = -1481293890;
                    }
                    i12 = iM2761 ^ i2;
                    i11 = i;
                    break;
                case -1948311896:
                case -573626659:
                    i7 = 9;
                    if (C2834.f9334 <= 0) {
                        iM2761 = (C0619.m2761("᩹۠") + i9) * (-59);
                        i = ((iM2761 ^ i10) * (-13355)) ^ (-1068264680);
                        i2 = -1967141;
                    } else {
                        iM2761 = (C0773.m3169("ᩳ۟") ^ i9) * (-87);
                        i = ((iM2761 ^ i10) * 4797) ^ (-488779875);
                        i2 = -1918315061;
                    }
                    i12 = iM2761 ^ i2;
                    i11 = i;
                    break;
                case -1869854421:
                case -178453123:
                    if (primaryClip.getItemCount() > 0) {
                        iM2761 = (i9 - C0619.m2761("۠᩻")) * (-117);
                        i = ((iM2761 ^ i10) * 8249) ^ 631736355;
                        i2 = 175681450;
                    } else {
                        iM2761 = (C0773.m3169("ܽ۠") + i9) * 85;
                        i = ((iM2761 ^ i10) * (-18571)) ^ 37292745;
                        i2 = -3937819;
                    }
                    i12 = iM2761 ^ i2;
                    i11 = i;
                    break;
                case -1864517177:
                case -330708969:
                    if (C0773.f2792 <= 0) {
                        iM2761 = C0619.m2761("᩸۬") ^ i9;
                        i = ((iM2761 ^ i10) * (-4395)) ^ 914941258;
                        i2 = 681913614;
                    } else {
                        iM2761 = (C0773.m3169("ۚ۫") + i9) * 91;
                        i = ((iM2761 ^ i10) * 6639) ^ (-663217180);
                        i2 = 1130046477;
                    }
                    i12 = iM2761 ^ i2;
                    i11 = i;
                    break;
                case -1842746071:
                case 540228226:
                    i5 = 65032;
                    iM2761 = C0773.m3169("ۙۢ") ^ i9;
                    i = ((iM2761 ^ i10) * 18483) ^ 1649592108;
                    i2 = 938744905;
                    i12 = iM2761 ^ i2;
                    i11 = i;
                    break;
                case -1820974756:
                case 1537689940:
                    return str;
                case -1787302925:
                case -757927357:
                    C15243.m36587(objM49087, C13473.m33137(sArr2, i13, 69, i5));
                    if (C3779.m12264()) {
                        iM2761 = (C0619.m2761("ᩳۛ") + i10) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i = ((iM2761 ^ i9) * 4995) ^ (-1091087327);
                        i2 = 1532866399;
                    } else {
                        iM2761 = (C0773.m3169("ۚ۫") + i9) * 91;
                        i = ((iM2761 ^ i10) * 6639) ^ (-663217180);
                        i2 = 1130046477;
                    }
                    i12 = iM2761 ^ i2;
                    i11 = i;
                    break;
                case -1741089930:
                case -1648639435:
                    sArr3 = f68929;
                    c = 361;
                    if (C17202.m40372()) {
                        iM2761 = C0619.m2761("۠ۗ") ^ i10;
                        i = ((iM2761 ^ i9) * 22703) ^ (-594384681);
                        i2 = 1180040635;
                    } else {
                        iM2761 = (C0619.m2761("ۘܿ") ^ i10) * (-59);
                        i = ((iM2761 ^ i9) * 6651) ^ (-1738116417);
                        i2 = -86540896;
                    }
                    i12 = iM2761 ^ i2;
                    i11 = i;
                    break;
                case -1640808465:
                case -1261183338:
                    objM49087 = m49087(strM5399);
                    sArr2 = f68929;
                    if (C3734.f12817 >= 0) {
                        iM2761 = (C0773.m3169("ܿۡ") ^ i10) * 87;
                        i = ((iM2761 ^ i9) * 19101) ^ (-422971542);
                        i2 = 672060905;
                    } else {
                        iM2761 = C0619.m2761("ۡۡ") ^ i9;
                        i = ((iM2761 ^ i10) * (-21257)) ^ 468763411;
                        i2 = 844118803;
                    }
                    i12 = iM2761 ^ i2;
                    i11 = i;
                    break;
                case -1602507328:
                case -948292144:
                    C13473.m33144();
                    iM2761 = (C0619.m2761("᩹۠") + i9) * (-59);
                    i = ((iM2761 ^ i10) * (-13355)) ^ (-1068264680);
                    i2 = -1967141;
                    i12 = iM2761 ^ i2;
                    i11 = i;
                    break;
                case -1251506914:
                case 1214891850:
                    i4 = i3 * i3;
                    s2 = 31656;
                    if (C2419.f7754 >= 0) {
                        iM2761 = (C0619.m2761("ۘܿ") ^ i10) * (-59);
                        i = ((iM2761 ^ i9) * 6651) ^ (-1738116417);
                        i2 = -86540896;
                    } else {
                        iM2761 = (i10 - C0619.m2761("᩵ܶ")) * (-109);
                        i = ((iM2761 ^ i9) * (-357)) ^ 1156680321;
                        i2 = -1236893910;
                    }
                    i12 = iM2761 ^ i2;
                    i11 = i;
                    break;
                case -797237541:
                case 731807088:
                    primaryClip = ((ClipboardManager) objM49087).getPrimaryClip();
                    str = null;
                    if (primaryClip != null) {
                        iM2761 = (C0773.m3169("ۢۢ") ^ i10) * 59;
                        i = ((iM2761 ^ i9) * 29097) ^ 1212900392;
                        i2 = 2045625807;
                    } else {
                        iM2761 = (C0773.m3169("ܽ۠") + i9) * 85;
                        i = ((iM2761 ^ i10) * (-18571)) ^ 37292745;
                        i2 = -3937819;
                    }
                    i12 = iM2761 ^ i2;
                    i11 = i;
                    break;
                case -714677368:
                case 255125088:
                    s = sArr3[c];
                    if (C2419.m8174() >= 0) {
                        iM2761 = C0619.m2761("᩸۬") ^ i9;
                        i = ((iM2761 ^ i10) * (-4395)) ^ 914941258;
                        i2 = 681913614;
                    } else {
                        iM2761 = C0773.m3169("᩻᩸") ^ i9;
                        i = ((iM2761 ^ i10) * 29427) ^ 1241216161;
                        i2 = 1758533360;
                    }
                    i12 = iM2761 ^ i2;
                    i11 = i;
                    break;
                case -707157701:
                case -668408630:
                    sArr = f68929;
                    i6 = 362;
                    if (C4282.f15546 <= 0) {
                        iM2761 = (C0619.m2761("ۘܿ") ^ i10) * (-59);
                        i = ((iM2761 ^ i9) * 6651) ^ (-1738116417);
                        i2 = -86540896;
                    } else {
                        iM2761 = (i10 - C0773.m3169("᩵ۧ")) * (-19);
                        i = ((iM2761 ^ i9) * 26659) ^ (-721210019);
                        i2 = 1345534415;
                    }
                    i12 = iM2761 ^ i2;
                    i11 = i;
                    break;
                case -670389813:
                case 764197065:
                    if (AbstractC0641.m2813() <= 0) {
                        iM2761 = (C0619.m2761("᩹۠") + i9) * (-59);
                        i = ((iM2761 ^ i10) * (-13355)) ^ (-1068264680);
                        i2 = -1967141;
                    } else {
                        iM2761 = C0619.m2761("᩸۬") ^ i9;
                        i = ((iM2761 ^ i10) * (-4395)) ^ 914941258;
                        i2 = 681913614;
                    }
                    i12 = iM2761 ^ i2;
                    i11 = i;
                    break;
                case -577977191:
                case 30013088:
                    i13 = 371;
                    if (AbstractC0116.f1064 <= 0) {
                        iM2761 = (C0619.m2761("ۘܿ") ^ i10) * (-59);
                        i = ((iM2761 ^ i9) * 6651) ^ (-1738116417);
                        i2 = -86540896;
                    } else {
                        iM2761 = (i10 - C0773.m3169("ۡ᩵")) * (-3);
                        i = ((iM2761 ^ i9) * 19189) ^ (-32625302);
                        i2 = -250643237;
                    }
                    i12 = iM2761 ^ i2;
                    i11 = i;
                    break;
                case -40659151:
                case 1632359205:
                    return C2023.m6952(text);
                case 13993780:
                case 1317474635:
                    C2878.m9491();
                    if (C1564.f5401 <= 0) {
                        iM2761 = C0619.m2761("᩸۬") ^ i9;
                        i = ((iM2761 ^ i10) * (-4395)) ^ 914941258;
                        i2 = 681913614;
                    } else {
                        iM2761 = (C0773.m3169("ܿۡ") ^ i10) * 87;
                        i = ((iM2761 ^ i9) * 19101) ^ (-422971542);
                        i2 = 672060905;
                    }
                    i12 = iM2761 ^ i2;
                    i11 = i;
                    break;
                case 643841923:
                case 1955007163:
                    if ((s * s2) - i4 <= 0) {
                        iM2761 = (C0773.m3169("ۢ֫") + i10) * 11;
                        i = ((iM2761 ^ i9) * 22239) ^ (-1977343775);
                        i2 = 1159147938;
                    } else {
                        iM2761 = C0773.m3169("ۧܳ") ^ i9;
                        i = ((iM2761 ^ i10) * (-12287)) ^ (-1729656575);
                        i2 = -806370300;
                    }
                    i12 = iM2761 ^ i2;
                    i11 = i;
                    break;
                case 671727021:
                case 1789500047:
                    text = primaryClip.getItemAt(0).getText();
                    if (text != null) {
                        iM2761 = (C0773.m3169("ᩳᩳ") + i10) * (-127);
                        i = ((iM2761 ^ i9) * 1625) ^ (-2114592734);
                        i2 = 1800298429;
                    } else {
                        iM2761 = (C0773.m3169("ܽ۠") + i9) * 85;
                        i = ((iM2761 ^ i10) * (-18571)) ^ 37292745;
                        i2 = -3937819;
                    }
                    i12 = iM2761 ^ i2;
                    i11 = i;
                    break;
                case 1028745787:
                case 1214575726:
                    C1542.m5459();
                    C13473.m33144();
                    return null;
                default:
                    strM5399 = C1519.m5399(sArr, i6, i7, i5);
                    if (C0950.f3488 >= 0) {
                        iM2761 = C0619.m2761("᩸۬") ^ i9;
                        i = ((iM2761 ^ i10) * (-4395)) ^ 914941258;
                        i2 = 681913614;
                    } else {
                        iM2761 = C0619.m2761("᩸۫") ^ i10;
                        i = ((iM2761 ^ i9) * (-18657)) ^ (-270628398);
                        i2 = -682507088;
                    }
                    i12 = iM2761 ^ i2;
                    i11 = i;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Drawable m49058(int i) {
        Drawable drawableM2186 = C0385.m2186(C1321.m4856(), i);
        C1146.m4233(drawableM2186);
        return drawableM2186;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x01ab A[PHI: r5 r6 r7 r13
      0x01ab: PHI (r5v4 short) = (r5v3 short), (r5v2 short), (r5v2 short) binds: [B:52:0x01a9, B:24:0x00a0, B:6:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x01ab: PHI (r6v3 int) = (r6v2 int), (r6v2 int), (r6v5 int) binds: [B:52:0x01a9, B:24:0x00a0, B:6:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x01ab: PHI (r7v3 int) = (r7v2 int), (r7v2 int), (r7v5 int) binds: [B:52:0x01a9, B:24:0x00a0, B:6:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x01ab: PHI (r13v4 int) = (r13v2 int), (r13v3 int), (r13v2 int) binds: [B:52:0x01a9, B:24:0x00a0, B:6:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x01df A[PHI: r4
      0x01df: PHI (r4v4 short) = (r4v3 short), (r4v2 short), (r4v2 short), (r4v2 short) binds: [B:56:0x01dd, B:18:0x0082, B:16:0x007e, B:13:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x020c A[PHI: r1 r8 r9 r10 r12
      0x020c: PHI (r1v4 android.content.pm.PackageManager) = 
      (r1v2 android.content.pm.PackageManager)
      (r1v2 android.content.pm.PackageManager)
      (r1v2 android.content.pm.PackageManager)
      (r1v3 android.content.pm.PackageManager)
      (r1v2 android.content.pm.PackageManager)
      (r1v2 android.content.pm.PackageManager)
      (r1v2 android.content.pm.PackageManager)
     binds: [B:60:0x020a, B:47:0x0176, B:43:0x0156, B:32:0x00e2, B:28:0x00bd, B:13:0x0075, B:9:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x020c: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int), (r8v2 int), (r8v2 int), (r8v2 int) binds: [B:60:0x020a, B:47:0x0176, B:43:0x0156, B:32:0x00e2, B:28:0x00bd, B:13:0x0075, B:9:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x020c: PHI (r9v4 short) = (r9v2 short), (r9v3 short), (r9v2 short), (r9v2 short), (r9v2 short), (r9v2 short), (r9v2 short) binds: [B:60:0x020a, B:47:0x0176, B:43:0x0156, B:32:0x00e2, B:28:0x00bd, B:13:0x0075, B:9:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x020c: PHI (r10v4 int) = (r10v2 int), (r10v2 int), (r10v3 int), (r10v2 int), (r10v2 int), (r10v2 int), (r10v2 int) binds: [B:60:0x020a, B:47:0x0176, B:43:0x0156, B:32:0x00e2, B:28:0x00bd, B:13:0x0075, B:9:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x020c: PHI (r12v4 short[]) = (r12v2 short[]), (r12v2 short[]), (r12v2 short[]), (r12v2 short[]), (r12v3 short[]), (r12v2 short[]), (r12v2 short[]) binds: [B:60:0x020a, B:47:0x0176, B:43:0x0156, B:32:0x00e2, B:28:0x00bd, B:13:0x0075, B:9:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x023f A[PHI: r3 r18
      0x023f: PHI (r3v4 char) = (r3v3 char), (r3v2 char) binds: [B:64:0x023d, B:16:0x007e] A[DONT_GENERATE, DONT_INLINE]
      0x023f: PHI (r18v5 short[]) = (r18v4 short[]), (r18v3 short[]) binds: [B:64:0x023d, B:16:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final PackageManager m49081() {
        int iM2761;
        int i;
        int i2;
        int i3 = C3099.f10023;
        int i4 = AbstractC0116.f1064;
        int iM3169 = (i3 - C0773.m3169("ܺۨ")) * 127;
        int i5 = ((iM3169 ^ i4) * 28023) ^ (-2022021660);
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM3169 ^ 1293763049;
        PackageManager packageManager = null;
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
        int i13 = 1548413344;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i4) * 12345) >> 31));
            switch (i13) {
                case -1991208940:
                case -1504079194:
                    if (C1519.f5300 >= 0) {
                        iM2761 = (i3 - C0773.m3169("ۡᩴ")) * (-7);
                        i = ((iM2761 ^ i4) * (-28905)) ^ 40257529;
                        i2 = -1531584585;
                    } else {
                        iM2761 = C0619.m2761("᩹ۘ") ^ i3;
                        i = ((iM2761 ^ i4) * (-31479)) ^ (-290558775);
                        i2 = -1149664636;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1921776987:
                case -1637980861:
                    C11235.m28309();
                    RunnableC3055.m9933();
                    return null;
                case -1744097997:
                case 1398149658:
                    sArr2 = f68929;
                    if (C2834.f9334 <= 0) {
                        iM2761 = (i3 - C0773.m3169("ۡᩴ")) * (-7);
                        i = ((iM2761 ^ i4) * (-28905)) ^ 40257529;
                        i2 = -1531584585;
                    } else {
                        iM2761 = (C0619.m2761("ۛۘ") + i3) * (-71);
                        i = ((iM2761 ^ i4) * 28451) ^ 118966764;
                        i2 = 1652555859;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1649739391:
                case -138795543:
                    sArr = f68929;
                    c = 440;
                    if (C2966.f9654 >= 0) {
                        iM2761 = (C0773.m3169("۠ܺ") + i4) * (-71);
                        i = ((iM2761 ^ i3) * 17177) ^ 1467794639;
                        i2 = -1547866202;
                    } else {
                        iM2761 = (C0619.m2761("ۘܽ") + i4) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM2761 ^ i3) * 17617) ^ 393494157;
                        i2 = 390700079;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1198970796:
                case 829713292:
                    C2419.m8174();
                    if (C11235.f35427 < 0) {
                        iM2761 = C0773.m3169("ۘᩴ") ^ i3;
                        i = ((iM2761 ^ i4) * 28603) ^ (-698891868);
                        i2 = -718924097;
                    } else {
                        iM2761 = (C0773.m3169("۠ܺ") + i4) * (-71);
                        i = ((iM2761 ^ i3) * 17177) ^ 1467794639;
                        i2 = -1547866202;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -934932996:
                case 547756790:
                    packageManager = C1321.m4856().getPackageManager();
                    if (C2288.f7433 <= 0) {
                        iM2761 = (i3 - C0773.m3169("ۡᩴ")) * (-7);
                        i = ((iM2761 ^ i4) * (-28905)) ^ 40257529;
                        i2 = -1531584585;
                    } else {
                        iM2761 = C0619.m2761("ܽۚ") ^ i4;
                        i = ((iM2761 ^ i3) * 8309) ^ 8289306;
                        i2 = 1464338587;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -927797027:
                case 231016246:
                    i11 = 52626;
                    iM2761 = (C0619.m2761("ۛۗ") ^ i4) * (-75);
                    i = ((iM2761 ^ i3) * 21339) ^ (-1647758648);
                    i2 = 57446812;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -815919187:
                case 446341548:
                    C2310.m7811(packageManager, AbstractC3624.m11769(sArr2, i12, 22, i11));
                    return packageManager;
                case -641476627:
                case 1944289830:
                    if ((i10 * i10) - i9 < 0) {
                        iM2761 = (C0773.m3169("᩵᩸") + i3) * (-87);
                        i = ((iM2761 ^ i4) * 16091) ^ (-1229286380);
                        i2 = -144169945;
                    } else {
                        iM2761 = C0619.m2761("ۗᩳ") ^ i3;
                        i = ((iM2761 ^ i4) * 7893) ^ (-612824149);
                        i2 = 694128095;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -499143080:
                case -260952911:
                    i12 = 441;
                    if (C2702.f8586 <= 0) {
                        iM2761 = C0619.m2761("᩸֨") ^ i4;
                        i = ((iM2761 ^ i3) * 12579) ^ (-1120064344);
                        i2 = 603566504;
                    } else {
                        iM2761 = C0773.m3169("ۖ۠") ^ i4;
                        i = ((iM2761 ^ i3) * 23417) ^ 654153841;
                        i2 = -884987685;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -483900547:
                case 559274201:
                    s = sArr[c];
                    if (C23916.m53419() != 0) {
                        iM2761 = C0773.m3169("ۘᩴ") ^ i3;
                        i = ((iM2761 ^ i4) * 28603) ^ (-698891868);
                        i2 = -718924097;
                    } else {
                        iM2761 = C0773.m3169("ۡ᩸") ^ i3;
                        i = ((iM2761 ^ i4) * (-19851)) ^ (-659688100);
                        i2 = 1695250128;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -317817280:
                case 1202647303:
                    C2288.m7767();
                    if (C11235.f35427 < 0) {
                        iM2761 = C0773.m3169("ۘᩴ") ^ i3;
                        i = ((iM2761 ^ i4) * 28603) ^ (-698891868);
                        i2 = -718924097;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ۡᩴ")) * (-7);
                        i = ((iM2761 ^ i4) * (-28905)) ^ 40257529;
                        i2 = -1531584585;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -293084467:
                case 548319555:
                    i9 = i7 + i8;
                    s3 = 1;
                    if (C2023.m6964() <= 0) {
                        iM2761 = (i3 - C0773.m3169("ۡᩴ")) * (-7);
                        i = ((iM2761 ^ i4) * (-28905)) ^ 40257529;
                        i2 = -1531584585;
                    } else {
                        iM2761 = (C0773.m3169("᩹ۛ") + i4) * 55;
                        i = ((iM2761 ^ i3) * 13091) ^ (-1917176239);
                        i2 = -566166878;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -29509027:
                case 1025160944:
                    i10 = s + s3;
                    if (C23916.m53419() != 0) {
                        iM2761 = (i3 - C0773.m3169("ۡᩴ")) * (-7);
                        i = ((iM2761 ^ i4) * (-28905)) ^ 40257529;
                        i2 = -1531584585;
                    } else {
                        iM2761 = C0773.m3169("᩵ۨ") ^ i4;
                        i = ((iM2761 ^ i3) * 16025) ^ (-238241974);
                        i2 = 2013152393;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 633324748:
                case 1029268449:
                    s2 = 2;
                    if (C1519.f5300 >= 0) {
                        iM2761 = C0619.m2761("᩸֨") ^ i4;
                        i = ((iM2761 ^ i3) * 12579) ^ (-1120064344);
                        i2 = 603566504;
                    } else {
                        iM2761 = (C0773.m3169("᩵᩷") + i4) * (-79);
                        i = ((iM2761 ^ i3) * 26295) ^ (-941240507);
                        i2 = 1405926855;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 669283876:
                case 1398610130:
                    if (AbstractC3624.f12429 > 0) {
                        iM2761 = (i3 - C0773.m3169("ۡᩴ")) * (-7);
                        i = ((iM2761 ^ i4) * (-28905)) ^ 40257529;
                        i2 = -1531584585;
                    } else {
                        iM2761 = (C0619.m2761("ۗܺ") ^ i3) * (-83);
                        i = ((iM2761 ^ i4) * 29591) ^ (-295961380);
                        i2 = 452066342;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 1696651696:
                case 1896716581:
                    i11 = 37199;
                    iM2761 = (C0619.m2761("ۛۗ") ^ i4) * (-75);
                    i = ((iM2761 ^ i3) * 21339) ^ (-1647758648);
                    i2 = 57446812;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 1902957295:
                case 2023222336:
                    RunnableC0334.m2063();
                    C3998.m12920();
                    iM2761 = C0773.m3169("ۘᩴ") ^ i3;
                    i = ((iM2761 ^ i4) * 28603) ^ (-698891868);
                    i2 = -718924097;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                default:
                    i7 = s * s2;
                    i8 = 1;
                    if (C3033.f9831 >= 0) {
                        iM2761 = C0619.m2761("᩸֨") ^ i4;
                        i = ((iM2761 ^ i3) * 12579) ^ (-1120064344);
                        i2 = 603566504;
                    } else {
                        iM2761 = C0619.m2761("ܺ۟") ^ i3;
                        i = ((iM2761 ^ i4) * (-11361)) ^ 505758991;
                        i2 = -1227489618;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00eb A[PHI: r1
      0x00eb: PHI (r1v37 android.content.res.AssetManager) = (r1v27 android.content.res.AssetManager), (r1v2 android.content.res.AssetManager) binds: [B:33:0x00e9, B:13:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x025c A[PHI: r2 r3 r5 r9 r16
      0x025c: PHI (r2v4 short[]) = (r2v3 short[]), (r2v2 short[]), (r2v2 short[]), (r2v2 short[]), (r2v2 short[]) binds: [B:65:0x025a, B:61:0x0238, B:53:0x01e2, B:41:0x0156, B:11:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x025c: PHI (r3v4 char) = (r3v3 char), (r3v2 char), (r3v2 char), (r3v2 char), (r3v2 char) binds: [B:65:0x025a, B:61:0x0238, B:53:0x01e2, B:41:0x0156, B:11:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x025c: PHI (r5v4 int) = (r5v2 int), (r5v2 int), (r5v3 int), (r5v2 int), (r5v2 int) binds: [B:65:0x025a, B:61:0x0238, B:53:0x01e2, B:41:0x0156, B:11:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x025c: PHI (r9v4 int) = (r9v2 int), (r9v2 int), (r9v2 int), (r9v3 int), (r9v2 int) binds: [B:65:0x025a, B:61:0x0238, B:53:0x01e2, B:41:0x0156, B:11:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x025c: PHI (r16v18 android.content.res.AssetManager) = 
      (r16v2 android.content.res.AssetManager)
      (r16v3 android.content.res.AssetManager)
      (r16v5 android.content.res.AssetManager)
      (r16v8 android.content.res.AssetManager)
      (r16v21 android.content.res.AssetManager)
     binds: [B:65:0x025a, B:61:0x0238, B:53:0x01e2, B:41:0x0156, B:11:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final AssetManager m49086() {
        int iM3169;
        int i;
        int i2;
        int i3 = C3690.f12684;
        int i4 = C1080.f3865;
        int iM2761 = (C0619.m2761("ۜۚ") + i4) * 31;
        int i5 = ((iM2761 ^ i3) * (-24723)) ^ 1567924739;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM2761 ^ (-263545018);
        AssetManager assets = null;
        char c = 0;
        short s = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        short s2 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1132103365;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i3) * (-23551)) >> 31));
            switch (i13) {
                case -2113219184:
                case 2137302699:
                    C2702.m8876();
                    C2878.m9491();
                    return null;
                case -2111410020:
                case 1349656126:
                    if (RunnableC3055.f9898 < 0) {
                        assets = assets;
                        iM3169 = C0619.m2761("ܺܶ") ^ i3;
                        i = ((iM3169 ^ i4) * 18297) ^ (-858823618);
                        i2 = 1884963929;
                        AssetManager assetManager = assets;
                        i6 = iM3169 ^ i2;
                        i5 = i;
                        assets = assetManager;
                    }
                    assets = assets;
                    iM3169 = C0619.m2761("ᩴۙ") ^ i3;
                    i = ((iM3169 ^ i4) * (-28071)) ^ (-1260484642);
                    i2 = -1124422123;
                    AssetManager assetManager2 = assets;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    assets = assetManager2;
                    break;
                case -2021335469:
                case -467563163:
                    assets = assets;
                    i7 = s * s;
                    if (C3998.f13671 != 0) {
                        iM3169 = (i4 - C0773.m3169("ۢۚ")) * (-107);
                        i = ((iM3169 ^ i3) * (-3805)) ^ 1188850190;
                        i2 = -1590885621;
                    } else {
                        iM3169 = (C0773.m3169("ۢۤ") + i4) * 91;
                        i = ((iM3169 ^ i3) * (-1185)) ^ (-140752511);
                        i2 = 103556589;
                    }
                    AssetManager assetManager3 = assets;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    assets = assetManager3;
                    break;
                case -1924876758:
                case -668206689:
                    if (C13473.f42873 != 0) {
                        assets = assets;
                        i12 = 567;
                        iM3169 = C0619.m2761("ܺܶ") ^ i3;
                        i = ((iM3169 ^ i4) * 18297) ^ (-858823618);
                        i2 = 1884963929;
                        AssetManager assetManager4 = assets;
                        i6 = iM3169 ^ i2;
                        i5 = i;
                        assets = assetManager4;
                    } else {
                        int iM31610 = (i4 - C0773.m3169("ۙۤ")) * 91;
                        i6 = iM31610 ^ 161817699;
                        i5 = ((iM31610 ^ i3) * (-31131)) ^ (-706441362);
                        i12 = 567;
                    }
                    break;
                case -1836360439:
                case -189278132:
                    C2310.m7811(assets, C3448.m11252(sArr2, i12, 14, i11));
                    return assets;
                case -1681508561:
                case 1319756293:
                    C2310.m7813();
                    assets = assets;
                    iM3169 = C0619.m2761("ᩴۙ") ^ i3;
                    i = ((iM3169 ^ i4) * (-28071)) ^ (-1260484642);
                    i2 = -1124422123;
                    AssetManager assetManager5 = assets;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    assets = assetManager5;
                    break;
                case -1486676551:
                case 1015296591:
                    assets = assets;
                    i10 = s + s2;
                    if (RunnableC3646.f12471) {
                        iM3169 = (i4 - C0773.m3169("ۢۚ")) * (-107);
                        i = ((iM3169 ^ i3) * (-3805)) ^ 1188850190;
                        i2 = -1590885621;
                    } else {
                        iM3169 = (C0773.m3169("֫ۨ") ^ i4) * 89;
                        i = ((iM3169 ^ i3) * (-24091)) ^ (-1865984791);
                        i2 = 282799886;
                    }
                    AssetManager assetManager6 = assets;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    assets = assetManager6;
                    break;
                case -1401881939:
                case 1630897436:
                    assets = assets;
                    sArr = f68929;
                    c = 566;
                    if (RunnableC3055.f9898 >= 0) {
                        iM3169 = (i4 - C0773.m3169("ۢۚ")) * (-107);
                        i = ((iM3169 ^ i3) * (-3805)) ^ 1188850190;
                        i2 = -1590885621;
                    } else {
                        iM3169 = C0773.m3169("۟ܽ") ^ i3;
                        i = ((iM3169 ^ i4) * 22479) ^ 1395734047;
                        i2 = -1868121539;
                    }
                    AssetManager assetManager7 = assets;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    assets = assetManager7;
                    break;
                case -1376550429:
                case 1852074752:
                    i11 = 17406;
                    iM3169 = C0619.m2761("۠ܽ") ^ i4;
                    i = ((iM3169 ^ i3) * 31585) ^ 1906070681;
                    i2 = 682467346;
                    AssetManager assetManager8 = assets;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    assets = assetManager8;
                    break;
                case -1370151069:
                case 1899922262:
                    assets = assets;
                    if (C2419.m8174() >= 0) {
                        iM3169 = (i4 - C0773.m3169("ۢۚ")) * (-107);
                        i = ((iM3169 ^ i3) * (-3805)) ^ 1188850190;
                        i2 = -1590885621;
                    } else {
                        iM3169 = (i4 - C0773.m3169("᩹۫")) * 21;
                        i = ((iM3169 ^ i3) * (-12691)) ^ 146898436;
                        i2 = -163874393;
                    }
                    AssetManager assetManager9 = assets;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    assets = assetManager9;
                    break;
                case -1218309908:
                case 824869289:
                    C3492.m11488();
                    if (C1783.f6087 <= 0) {
                        assets = assets;
                        iM3169 = (i4 - C0773.m3169("ۢۚ")) * (-107);
                        i = ((iM3169 ^ i3) * (-3805)) ^ 1188850190;
                        i2 = -1590885621;
                        AssetManager assetManager10 = assets;
                        i6 = iM3169 ^ i2;
                        i5 = i;
                        assets = assetManager10;
                    }
                    assets = assets;
                    iM3169 = C0619.m2761("ᩴۙ") ^ i3;
                    i = ((iM3169 ^ i4) * (-28071)) ^ (-1260484642);
                    i2 = -1124422123;
                    AssetManager assetManager11 = assets;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    assets = assetManager11;
                    break;
                case -1120206032:
                case -75298301:
                    assets = assets;
                    i8 = i7 + 77810041;
                    if (C1542.f5343 <= 0) {
                        iM3169 = C0619.m2761("ᩴۢ") ^ i3;
                        i = ((iM3169 ^ i4) * 26463) ^ 414610335;
                        i2 = 266009127;
                    } else {
                        iM3169 = (C0619.m2761("ۜ֨") + i3) * (-89);
                        i = ((iM3169 ^ i4) * (-16659)) ^ (-1534644166);
                        i2 = 1478996325;
                    }
                    AssetManager assetManager12 = assets;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    assets = assetManager12;
                    break;
                case -943123558:
                case 1886447846:
                    sArr2 = f68929;
                    if (RunnableC3055.f9898 >= 0) {
                        assets = assets;
                        iM3169 = C0619.m2761("ᩴۢ") ^ i3;
                        i = ((iM3169 ^ i4) * 26463) ^ 414610335;
                        i2 = 266009127;
                    } else {
                        iM3169 = C0773.m3169("۬ܳ") ^ i4;
                        assets = assets;
                        i = ((iM3169 ^ i3) * (-32337)) ^ (-144223052);
                        i2 = 55407280;
                    }
                    AssetManager assetManager13 = assets;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    assets = assetManager13;
                    break;
                case -306660485:
                case 806931525:
                    if (AbstractC0641.f2496 >= 0) {
                        assets = assets;
                        iM3169 = C0619.m2761("ᩴۙ") ^ i3;
                        i = ((iM3169 ^ i4) * (-28071)) ^ (-1260484642);
                        i2 = -1124422123;
                    } else {
                        iM3169 = C0773.m3169("ۘᩳ") ^ i4;
                        assets = assets;
                        i = ((iM3169 ^ i3) * 14461) ^ 987932901;
                        i2 = 1497417967;
                    }
                    AssetManager assetManager14 = assets;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    assets = assetManager14;
                    break;
                case -204789081:
                case 1961290891:
                    assets = C1321.m4856().getAssets();
                    if (RunnableC0334.f1808 <= 0) {
                        iM3169 = C0773.m3169("ۘᩳ") ^ i4;
                        assets = assets;
                        i = ((iM3169 ^ i3) * 14461) ^ 987932901;
                        i2 = 1497417967;
                    } else {
                        iM3169 = C0773.m3169("֡ܺ") ^ i3;
                        assets = assets;
                        i = ((iM3169 ^ i4) * (-591)) ^ 1278700445;
                        i2 = 1317215295;
                    }
                    AssetManager assetManager15 = assets;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    assets = assetManager15;
                    break;
                case 152717225:
                case 1751645307:
                    assets = assets;
                    s = sArr[c];
                    if (C2966.m9664()) {
                        iM3169 = (i3 - C0773.m3169("ᩳ᩷")) * 49;
                        i = ((iM3169 ^ i4) * (-17677)) ^ (-617849334);
                        i2 = -271839399;
                    } else {
                        iM3169 = C0619.m2761("ܺܶ") ^ i3;
                        i = ((iM3169 ^ i4) * 18297) ^ (-858823618);
                        i2 = 1884963929;
                    }
                    AssetManager assetManager16 = assets;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    assets = assetManager16;
                    break;
                case 390209223:
                case 1158008913:
                    assets = assets;
                    i9 = i8 + i8;
                    s2 = 8821;
                    if (RunnableC0334.f1808 <= 0) {
                        iM3169 = C0619.m2761("ᩴۙ") ^ i3;
                        i = ((iM3169 ^ i4) * (-28071)) ^ (-1260484642);
                        i2 = -1124422123;
                    } else {
                        iM3169 = C0619.m2761("ܺ֡") ^ i4;
                        i = ((iM3169 ^ i3) * (-27847)) ^ (-576469375);
                        i2 = 2080747254;
                    }
                    AssetManager assetManager17 = assets;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    assets = assetManager17;
                    break;
                case 656076808:
                case 661525635:
                    i11 = 21178;
                    iM3169 = C0619.m2761("۠ܽ") ^ i4;
                    i = ((iM3169 ^ i3) * 31585) ^ 1906070681;
                    i2 = 682467346;
                    AssetManager assetManager18 = assets;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    assets = assetManager18;
                    break;
                default:
                    assets = assets;
                    if (i9 - (i10 * i10) >= 0) {
                        iM3169 = C0619.m2761("֡ᩴ") ^ i3;
                        i = ((iM3169 ^ i4) * (-1245)) ^ 1985266266;
                        i2 = 434731419;
                    } else {
                        iM3169 = C0619.m2761("֨֡") ^ i3;
                        i = ((iM3169 ^ i4) * 1915) ^ (-1513458520);
                        i2 = 1352113817;
                    }
                    AssetManager assetManager19 = assets;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    assets = assetManager19;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final Resources m49055() {
        Resources resources = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        short[] sArr2 = null;
        int i5 = 0;
        int i6 = 494376453;
        int i7 = C2310.f7472;
        int i8 = C3779.f12953;
        int iM2761 = (i8 - C0619.m2761("ۤܺ")) * 7;
        int i9 = ((iM2761 ^ i7) * 9563) ^ 788735728;
        int i10 = 1472513699;
        while (true) {
            i6 = ((((i6 ^ i7) * (-8247)) >> 31) & i9) ^ (iM2761 ^ i10);
            switch (i6) {
                case -2126221070:
                case 1814710149:
                    resources = C3099.m10096().getResources();
                    if (C1146.m4231()) {
                        iM2761 = C0773.m3169("ܿۚ") ^ i7;
                        i9 = ((iM2761 ^ i8) * (-28173)) ^ (-1299963863);
                        i10 = 1032203881;
                    } else {
                        iM2761 = C0619.m2761("ܺ᩷") ^ i7;
                        i9 = ((iM2761 ^ i8) * 7483) ^ (-1411214118);
                        i10 = 2132951968;
                    }
                    break;
                case -1796607606:
                case -713803104:
                    s = sArr[c];
                    if (C2287.f7432 >= 0) {
                        iM2761 = C0619.m2761("ܺ᩷") ^ i7;
                        i9 = ((iM2761 ^ i8) * 7483) ^ (-1411214118);
                        i10 = 2132951968;
                    } else {
                        iM2761 = C0619.m2761("᩻ۚ") ^ i8;
                        i9 = ((iM2761 ^ i7) * (-23509)) ^ (-741502318);
                        i10 = 1418641390;
                    }
                    break;
                case -1581889019:
                case 2098584935:
                    i = 36536 * s;
                    if (C0862.f3233 != 0) {
                        iM2761 = (i8 - C0773.m3169("ܳۢ")) * (-115);
                        i9 = ((iM2761 ^ i7) * (-27679)) ^ 768331694;
                        i10 = 1174975535;
                    } else {
                        iM2761 = (C0619.m2761("ܳ۫") + i7) * (-99);
                        i9 = ((iM2761 ^ i8) * (-1893)) ^ 1235782753;
                        i10 = -438462902;
                    }
                    break;
                case -1458523516:
                case 1135403128:
                    C2878.m9491();
                    if (C1519.f5300 < 0) {
                        iM2761 = C0619.m2761("۬֡") ^ i8;
                        i9 = ((iM2761 ^ i7) * 32181) ^ (-2098254526);
                        i10 = 1528715135;
                    } else {
                        iM2761 = (C0773.m3169("ܳۘ") ^ i8) * 13;
                        i9 = ((iM2761 ^ i7) * (-27637)) ^ 47809155;
                        i10 = 1409726669;
                    }
                    break;
                case -1444625149:
                case 1221004634:
                    C3734.m12152();
                    iM2761 = C0619.m2761("۬֡") ^ i8;
                    i9 = ((iM2761 ^ i7) * 32181) ^ (-2098254526);
                    i10 = 1528715135;
                    break;
                case -1407284062:
                case 1769025621:
                    if (AbstractC0116.m1243() != 0) {
                        iM2761 = C0619.m2761("ۘܰ") ^ i7;
                        i9 = ((iM2761 ^ i8) * 27329) ^ 150026806;
                        i10 = -446542970;
                    } else {
                        iM2761 = (C0619.m2761("ۖ᩹") ^ i8) * (-15);
                        i9 = ((iM2761 ^ i7) * (-3117)) ^ (-286129666);
                        i10 = 1165588645;
                    }
                    break;
                case -815144387:
                case -794826938:
                    if (C2834.f9334 <= 0) {
                        iM2761 = C0619.m2761("۬֡") ^ i8;
                        i9 = ((iM2761 ^ i7) * 32181) ^ (-2098254526);
                        i10 = 1528715135;
                    } else {
                        iM2761 = (C0773.m3169("ۧ۬") ^ i7) * (-73);
                        i9 = ((iM2761 ^ i8) * (-29337)) ^ 1137326341;
                        i10 = -1519755029;
                    }
                    break;
                case -812566777:
                case 739713311:
                    i2 = s * s;
                    i3 = 333719824;
                    if (C2878.f9462) {
                        iM2761 = C0619.m2761("۬֡") ^ i8;
                        i9 = ((iM2761 ^ i7) * 32181) ^ (-2098254526);
                        i10 = 1528715135;
                    } else {
                        iM2761 = C0773.m3169("۟᩻") ^ i7;
                        i9 = ((iM2761 ^ i8) * (-29147)) ^ 1009235748;
                        i10 = 353912931;
                    }
                    break;
                case -691610844:
                case 1950582721:
                    i4 = 63847;
                    iM2761 = (C0773.m3169("ۢܳ") + i8) * 9;
                    i9 = ((iM2761 ^ i7) * (-22555)) ^ (-1441771255);
                    i10 = -148466931;
                    break;
                case -340475317:
                case -206121058:
                    sArr2 = f68929;
                    if (C20932.f66974 <= 0) {
                        iM2761 = C0619.m2761("۬֡") ^ i8;
                        i9 = ((iM2761 ^ i7) * 32181) ^ (-2098254526);
                        i10 = 1528715135;
                    } else {
                        iM2761 = C0619.m2761("ۘۙ") ^ i8;
                        i9 = ((iM2761 ^ i7) * 25769) ^ (-1391217789);
                        i10 = 203241455;
                    }
                    break;
                case -304760891:
                case 629519832:
                    i5 = 1;
                    if (C4282.f15546 <= 0) {
                        iM2761 = C0619.m2761("۬֡") ^ i8;
                        i9 = ((iM2761 ^ i7) * 32181) ^ (-2098254526);
                        i10 = 1528715135;
                    } else {
                        iM2761 = C0773.m3169("֨ۨ") ^ i7;
                        i9 = ((iM2761 ^ i8) * (-691)) ^ 597683488;
                        i10 = -302266766;
                    }
                    break;
                case -117497847:
                case -105651958:
                    i4 = 22640;
                    iM2761 = (C0773.m3169("ۢܳ") + i8) * 9;
                    i9 = ((iM2761 ^ i7) * (-22555)) ^ (-1441771255);
                    i10 = -148466931;
                    break;
                case -76453732:
                case 1921438332:
                    AbstractC0641.m2813();
                    C3690.m11987();
                    return null;
                case -34831512:
                case 1003060075:
                    C0269.m1781(resources, C4282.m13650(sArr2, i5, 17, i4));
                    return resources;
                case 121475696:
                case 1960878083:
                    sArr = f68929;
                    c = 0;
                    if (AbstractC0641.m2813() <= 0) {
                        iM2761 = C0619.m2761("ۘܰ") ^ i7;
                        i9 = ((iM2761 ^ i8) * 27329) ^ 150026806;
                        i10 = -446542970;
                    } else {
                        iM2761 = C0619.m2761("ۧۖ") ^ i8;
                        i9 = ((iM2761 ^ i7) * (-27531)) ^ (-80631205);
                        i10 = -420386876;
                    }
                    break;
                case 385872212:
                case 1242631960:
                    C3690.m11987();
                    if (!C2023.f6737) {
                        iM2761 = C0619.m2761("۬֡") ^ i8;
                        i9 = ((iM2761 ^ i7) * 32181) ^ (-2098254526);
                        i10 = 1528715135;
                    } else {
                        iM2761 = C0619.m2761("ۘܰ") ^ i7;
                        i9 = ((iM2761 ^ i8) * 27329) ^ 150026806;
                        i10 = -446542970;
                    }
                    break;
                case 860920711:
                case 1740872134:
                    if (RunnableC3055.m9933() != 0) {
                        iM2761 = C0619.m2761("ܺ᩷") ^ i7;
                        i9 = ((iM2761 ^ i8) * 7483) ^ (-1411214118);
                        i10 = 2132951968;
                    } else {
                        iM2761 = C0619.m2761("۬֡") ^ i8;
                        i9 = ((iM2761 ^ i7) * 32181) ^ (-2098254526);
                        i10 = 1528715135;
                    }
                    break;
                case 1298848372:
                case 1323965327:
                    if (C0773.f2792 <= 0) {
                        iM2761 = (i8 - C0773.m3169("ܳۢ")) * (-115);
                        i9 = ((iM2761 ^ i7) * (-27679)) ^ 768331694;
                        i10 = 1174975535;
                    } else {
                        iM2761 = C0619.m2761("۫ۗ") ^ i7;
                        i9 = ((iM2761 ^ i8) * 12285) ^ 1052335712;
                        i10 = -1086069184;
                    }
                    break;
                default:
                    if (i - (i2 + i3) > 0) {
                        iM2761 = C0773.m3169("۫᩸") ^ i7;
                        i9 = ((iM2761 ^ i8) * 12585) ^ 971748407;
                        i10 = -1569620875;
                    } else {
                        iM2761 = (C0619.m2761("᩵ۤ") ^ i8) * (-43);
                        i9 = ((iM2761 ^ i7) * 17525) ^ (-1152274489);
                        i10 = -78290585;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final ContentResolver m49091() {
        ContentResolver contentResolver = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        short s2 = 0;
        int i4 = 0;
        short[] sArr2 = null;
        int i5 = 0;
        int i6 = -694526808;
        int i7 = C1146.f4234;
        int i8 = C2354.f7599;
        int iM2761 = C0619.m2761("۟֫") ^ i8;
        int i9 = ((iM2761 ^ i7) * (-23753)) ^ (-342660038);
        int i10 = 1545569567;
        while (true) {
            i6 = ((((i6 ^ i7) * 29839) >> 31) & i9) ^ (iM2761 ^ i10);
            switch (i6) {
                case -1725696073:
                case 911379662:
                    s = sArr[c];
                    if (C3448.f11240 >= 0) {
                        iM2761 = C0773.m3169("᩵ۛ") ^ i7;
                        i9 = ((iM2761 ^ i8) * 15437) ^ 985219119;
                        i10 = 2024745911;
                    } else {
                        iM2761 = C0773.m3169("֨᩹") ^ i7;
                        i9 = ((iM2761 ^ i8) * 19121) ^ (-2117893851);
                        i10 = 1415482774;
                    }
                    break;
                case -1569453678:
                case -1207322947:
                    if (C4282.f15546 > 0) {
                        iM2761 = C0773.m3169("֫۬") ^ i7;
                        i9 = ((iM2761 ^ i8) * 22363) ^ (-686947731);
                        i10 = -1398618492;
                    } else {
                        iM2761 = C0619.m2761("ۧۧ") ^ i7;
                        i9 = ((iM2761 ^ i8) * (-3597)) ^ 207316856;
                        i10 = 1850596504;
                    }
                    break;
                case -1523237447:
                case 1972060964:
                    C2310.m7811(contentResolver, C1783.m6233(sArr2, i5, 23, i4));
                    return contentResolver;
                case -1337281174:
                case 1744196098:
                    if (C1564.f5401 <= 0) {
                        iM2761 = (C0773.m3169("ۧۗ") ^ i8) * (-53);
                        i9 = ((iM2761 ^ i7) * (-26783)) ^ 934502829;
                        i10 = -1543868547;
                    } else {
                        iM2761 = C0773.m3169("ۜ֫") ^ i7;
                        i9 = ((iM2761 ^ i8) * 18091) ^ (-654843316);
                        i10 = -29380004;
                    }
                    break;
                case -1204980416:
                case 804546706:
                    contentResolver = C3099.m10096().getContentResolver();
                    if (C2834.f9334 <= 0) {
                        iM2761 = C0773.m3169("᩷᩵") ^ i8;
                        i9 = ((iM2761 ^ i7) * (-9133)) ^ (-1954098677);
                        i10 = -1565579281;
                    } else {
                        iM2761 = (C0773.m3169("ۗۘ") + i8) * 39;
                        i9 = ((iM2761 ^ i7) * (-23819)) ^ 1908273113;
                        i10 = -2096829525;
                    }
                    break;
                case -1161697205:
                case -864070109:
                    sArr = f68929;
                    c = 689;
                    if (RunnableC0334.f1808 <= 0) {
                        iM2761 = C0773.m3169("֫۬") ^ i7;
                        i9 = ((iM2761 ^ i8) * 22363) ^ (-686947731);
                        i10 = -1398618492;
                    } else {
                        iM2761 = (C0619.m2761("ܳ᩸") + i8) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i9 = ((iM2761 ^ i7) * (-14013)) ^ (-1434034621);
                        i10 = -35245575;
                    }
                    break;
                case -1131391035:
                case 910255054:
                    if (i3 - (s * s2) < 0) {
                        iM2761 = C0773.m3169("ۨܺ") ^ i7;
                        i9 = ((iM2761 ^ i8) * (-1785)) ^ 2073232161;
                        i10 = 235391295;
                    } else {
                        iM2761 = C0619.m2761("۠ۨ") ^ i8;
                        i9 = ((iM2761 ^ i7) * 1493) ^ 688122883;
                        i10 = 2120040829;
                    }
                    break;
                case -1099019665:
                case -401948146:
                    i4 = 49530;
                    iM2761 = C0773.m3169("᩷ۧ") ^ i8;
                    i9 = ((iM2761 ^ i7) * (-22739)) ^ (-485707320);
                    i10 = 676218752;
                    break;
                case -925544781:
                case 722032152:
                    C2023.m6964();
                    if (C3734.f12817 < 0) {
                        iM2761 = (C0773.m3169("ۧۗ") ^ i8) * (-53);
                        i9 = ((iM2761 ^ i7) * (-26783)) ^ 934502829;
                        i10 = -1543868547;
                    } else {
                        iM2761 = C0619.m2761("ۧۧ") ^ i7;
                        i9 = ((iM2761 ^ i8) * (-3597)) ^ 207316856;
                        i10 = 1850596504;
                    }
                    break;
                case -658565654:
                case 1764348785:
                    i5 = 690;
                    if (C4238.m13540() <= 0) {
                        iM2761 = (C0773.m3169("ۧۗ") ^ i8) * (-53);
                        i9 = ((iM2761 ^ i7) * (-26783)) ^ 934502829;
                        i10 = -1543868547;
                    } else {
                        iM2761 = (i8 - C0773.m3169("۬ۙ")) * 7;
                        i9 = ((iM2761 ^ i7) * 4199) ^ (-258930692);
                        i10 = 1471088972;
                    }
                    break;
                case -566993286:
                case 729585204:
                    C0619.m2763();
                    C0773.m3161();
                    return null;
                case -467199419:
                case -57585357:
                    i = s * s;
                    i2 = 133079296;
                    if (C1321.f4751 >= 0) {
                        iM2761 = C0773.m3169("᩷᩵") ^ i8;
                        i9 = ((iM2761 ^ i7) * (-9133)) ^ (-1954098677);
                        i10 = -1565579281;
                    } else {
                        iM2761 = C0773.m3169("ۤ۟") ^ i8;
                        i9 = ((iM2761 ^ i7) * (-21441)) ^ (-1882832441);
                        i10 = 1673683312;
                    }
                    break;
                case -297954075:
                case -205172284:
                    i4 = 15295;
                    iM2761 = C0773.m3169("᩷ۧ") ^ i8;
                    i9 = ((iM2761 ^ i7) * (-22739)) ^ (-485707320);
                    i10 = 676218752;
                    break;
                case -207440741:
                case -133951733:
                    i3 = i + i2;
                    s2 = 23072;
                    if (C0862.m3503()) {
                        iM2761 = C0619.m2761("ܶ᩶") ^ i7;
                        i9 = ((iM2761 ^ i8) * (-21687)) ^ 710946985;
                        i10 = 216658887;
                    } else {
                        iM2761 = C0773.m3169("᩵ۛ") ^ i7;
                        i9 = ((iM2761 ^ i8) * 15437) ^ 985219119;
                        i10 = 2024745911;
                    }
                    break;
                case -76684094:
                case 1313224209:
                    if (C2287.m7745() <= 0) {
                        iM2761 = C0773.m3169("᩵ۛ") ^ i7;
                        i9 = ((iM2761 ^ i8) * 15437) ^ 985219119;
                        i10 = 2024745911;
                    } else {
                        iM2761 = C0619.m2761("֨۠") ^ i8;
                        i9 = ((iM2761 ^ i7) * (-23199)) ^ (-1336336626);
                        i10 = -1812741230;
                    }
                    break;
                case -9548181:
                case 484126247:
                    C2485.m8357();
                    iM2761 = C0619.m2761("ۧۧ") ^ i7;
                    i9 = ((iM2761 ^ i8) * (-3597)) ^ 207316856;
                    i10 = 1850596504;
                    break;
                case 95236366:
                case 852254881:
                    AbstractC0641.m2813();
                    if (C3492.f12043 > 0) {
                        iM2761 = C0773.m3169("᩵ۛ") ^ i7;
                        i9 = ((iM2761 ^ i8) * 15437) ^ 985219119;
                        i10 = 2024745911;
                    } else {
                        iM2761 = (C0773.m3169("ۧۗ") ^ i8) * (-53);
                        i9 = ((iM2761 ^ i7) * (-26783)) ^ 934502829;
                        i10 = -1543868547;
                    }
                    break;
                case 1963827964:
                case 2110138012:
                    sArr2 = f68929;
                    if (C1080.f3865 >= 0) {
                        iM2761 = C0773.m3169("᩷᩵") ^ i8;
                        i9 = ((iM2761 ^ i7) * (-9133)) ^ (-1954098677);
                        i10 = -1565579281;
                    } else {
                        iM2761 = C0619.m2761("ᩴ᩻") ^ i7;
                        i9 = ((iM2761 ^ i8) * (-25119)) ^ (-1364579602);
                        i10 = 1757742447;
                    }
                    break;
                default:
                    if (C20932.m47848() != 0) {
                        iM2761 = C0773.m3169("᩷᩵") ^ i8;
                        i9 = ((iM2761 ^ i7) * (-9133)) ^ (-1954098677);
                        i10 = -1565579281;
                    } else {
                        iM2761 = C0619.m2761("֫ۖ") ^ i7;
                        i9 = ((iM2761 ^ i8) * 31231) ^ (-1705151586);
                        i10 = -2043976633;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0061  */
    /* JADX WARN: Code duplicated, block: B:49:0x0182 A[PHI: r6 r7 r12 r13
      0x0182: PHI (r6v4 int) = (r6v3 int), (r6v2 int), (r6v2 int) binds: [B:48:0x0180, B:26:0x00b4, B:22:0x0095] A[DONT_GENERATE, DONT_INLINE]
      0x0182: PHI (r7v4 int) = (r7v3 int), (r7v2 int), (r7v2 int) binds: [B:48:0x0180, B:26:0x00b4, B:22:0x0095] A[DONT_GENERATE, DONT_INLINE]
      0x0182: PHI (r12v4 short[]) = (r12v2 short[]), (r12v3 short[]), (r12v2 short[]) binds: [B:48:0x0180, B:26:0x00b4, B:22:0x0095] A[DONT_GENERATE, DONT_INLINE]
      0x0182: PHI (r13v3 int) = (r13v2 int), (r13v2 int), (r13v4 int) binds: [B:48:0x0180, B:26:0x00b4, B:22:0x0095] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x01d0 A[PHI: r4 r5 r8 r9
      0x01d0: PHI (r4v4 short) = (r4v3 short), (r4v2 short), (r4v2 short), (r4v2 short) binds: [B:56:0x01ce, B:52:0x01af, B:44:0x0163, B:7:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x01d0: PHI (r5v4 short) = (r5v2 short), (r5v3 short), (r5v2 short), (r5v2 short) binds: [B:56:0x01ce, B:52:0x01af, B:44:0x0163, B:7:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x01d0: PHI (r8v4 int) = (r8v2 int), (r8v2 int), (r8v3 int), (r8v2 int) binds: [B:56:0x01ce, B:52:0x01af, B:44:0x0163, B:7:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x01d0: PHI (r9v4 short) = (r9v2 short), (r9v2 short), (r9v3 short), (r9v2 short) binds: [B:56:0x01ce, B:52:0x01af, B:44:0x0163, B:7:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x0204  */
    /* JADX WARN: Code duplicated, block: B:65:0x0234 A[PHI: r1 r3 r10 r18
      0x0234: PHI (r1v4 java.io.File) = (r1v2 java.io.File), (r1v2 java.io.File), (r1v3 java.io.File), (r1v2 java.io.File) binds: [B:64:0x0232, B:40:0x0142, B:30:0x00dc, B:10:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x0234: PHI (r3v4 char) = (r3v3 char), (r3v2 char), (r3v2 char), (r3v2 char) binds: [B:64:0x0232, B:40:0x0142, B:30:0x00dc, B:10:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x0234: PHI (r10v4 int) = (r10v2 int), (r10v3 int), (r10v2 int), (r10v2 int) binds: [B:64:0x0232, B:40:0x0142, B:30:0x00dc, B:10:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x0234: PHI (r18v5 short[]) = (r18v4 short[]), (r18v3 short[]), (r18v3 short[]), (r18v3 short[]) binds: [B:64:0x0232, B:40:0x0142, B:30:0x00dc, B:10:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final File m49072() {
        int iM3169;
        int i;
        int i2;
        int i3 = C1321.f4751;
        int i4 = C2288.f7433;
        int iM2761 = C0619.m2761("᩵ᩳ") ^ i4;
        int i5 = ((iM2761 ^ i3) * 12609) ^ 1723743426;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM2761 ^ 1875348347;
        File filesDir = null;
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
        int i13 = -1030141980;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i3) * (-11093)) >> 31));
            switch (i13) {
                case -2102760031:
                case 2005895687:
                    if (i9 - (i10 * i10) <= 0) {
                        iM3169 = C0619.m2761("֨ۢ") ^ i3;
                        i = ((iM3169 ^ i4) * (-23347)) ^ (-387208080);
                        i2 = -11932853;
                    } else {
                        iM3169 = C0619.m2761("ۘ֫") ^ i3;
                        i = ((iM3169 ^ i4) * 27487) ^ (-458730211);
                        i2 = -1187854551;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1945824248:
                case 330110454:
                    i10 = s + s3;
                    if (RunnableC3646.f12471) {
                        iM3169 = (C0619.m2761("ۨۛ") + i3) * (-65);
                        i = ((iM3169 ^ i4) * (-12113)) ^ (-1386127013);
                        i2 = -1801038357;
                    } else {
                        iM3169 = (i4 - C0773.m3169("ۙۨ")) * (-109);
                        i = ((iM3169 ^ i3) * (-10965)) ^ (-2132374659);
                        i2 = -1580663349;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1785302616:
                case 1244364694:
                    i9 = i7 + i8;
                    s3 = 1;
                    if (C0862.f3233 != 0) {
                        iM3169 = (C0619.m2761("֡᩸") + i3) * (-27);
                        i = ((iM3169 ^ i4) * (-5463)) ^ 171740291;
                        i2 = 384064044;
                    } else {
                        iM3169 = C0773.m3169("۬ۖ") ^ i4;
                        i = ((iM3169 ^ i3) * 5217) ^ (-1003876302);
                        i2 = -296227265;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1520150794:
                case 35555842:
                    C2310.m7811(filesDir, C0487.m2361(sArr2, i12, 16, i11));
                    return filesDir;
                case -1439228738:
                case 644118987:
                    s2 = 2;
                    if (C20932.f66974 <= 0) {
                        iM3169 = (C0619.m2761("֡᩸") + i3) * (-27);
                        i = ((iM3169 ^ i4) * (-5463)) ^ 171740291;
                        i2 = 384064044;
                    } else {
                        iM3169 = (i4 - C0619.m2761("ۜܿ")) * (-83);
                        i = ((iM3169 ^ i3) * 13477) ^ (-1882299256);
                        i2 = -366672872;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1158125880:
                case -862998085:
                    i12 = 293;
                    if (C2310.m7813() <= 0) {
                        iM3169 = C0619.m2761("۟ۧ") ^ i4;
                        i = ((iM3169 ^ i3) * 13935) ^ 133430237;
                        i2 = -1298286576;
                    } else {
                        iM3169 = C0773.m3169("۠۠") ^ i4;
                        i = ((iM3169 ^ i3) * 29123) ^ (-1198222842);
                        i2 = 1615622495;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1099342750:
                case 1573726465:
                    C1146.m4231();
                    return null;
                case -1042085847:
                case 579130337:
                    filesDir = C1321.m4856().getFilesDir();
                    if (C1519.m5403()) {
                        iM3169 = C0619.m2761("ۚܰ") ^ i3;
                        i = ((iM3169 ^ i4) * 20621) ^ 312015298;
                        i2 = 1388495230;
                    } else {
                        iM3169 = (C0619.m2761("ۨۛ") + i3) * (-65);
                        i = ((iM3169 ^ i4) * (-12113)) ^ (-1386127013);
                        i2 = -1801038357;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -877971822:
                case 1582892337:
                    C3492.m11488();
                    C3779.m12264();
                    iM3169 = C0773.m3169("ᩴ᩵") ^ i3;
                    i = ((iM3169 ^ i4) * 3065) ^ (-255877108);
                    i2 = -78202629;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -791722843:
                case 537806122:
                    C1564.m5509();
                    if (C0862.f3233 == 0) {
                        iM3169 = (C0619.m2761("۫ۜ") ^ i4) * (-81);
                        i = ((iM3169 ^ i3) * (-27535)) ^ (-235829124);
                        i2 = -1108875515;
                    } else {
                        iM3169 = (C0619.m2761("֡᩸") + i3) * (-27);
                        i = ((iM3169 ^ i4) * (-5463)) ^ 171740291;
                        i2 = 384064044;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -544639441:
                case -176061590:
                    i7 = s * s2;
                    i8 = 1;
                    if (C3492.f12043 <= 0) {
                        iM3169 = C0619.m2761("۟ۧ") ^ i4;
                        i = ((iM3169 ^ i3) * 13935) ^ 133430237;
                        i2 = -1298286576;
                    } else {
                        iM3169 = C0773.m3169("ۙܺ") ^ i3;
                        i = ((iM3169 ^ i4) * 17043) ^ (-1023506213);
                        i2 = -323781780;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -195377773:
                case 1757322145:
                    sArr2 = f68929;
                    if (C2287.m7745() <= 0) {
                        iM3169 = C0619.m2761("۟ۧ") ^ i4;
                        i = ((iM3169 ^ i3) * 13935) ^ 133430237;
                        i2 = -1298286576;
                    } else {
                        iM3169 = (i4 - C0773.m3169("ۜ۫")) * (-119);
                        i = ((iM3169 ^ i3) * (-30219)) ^ 1777347706;
                        i2 = -2135264635;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -132627774:
                case 227992248:
                    sArr = f68929;
                    c = 292;
                    if (C2966.f9654 >= 0) {
                        iM3169 = (C0619.m2761("ۨۛ") + i3) * (-65);
                        i = ((iM3169 ^ i4) * (-12113)) ^ (-1386127013);
                        i2 = -1801038357;
                    } else {
                        iM3169 = C0773.m3169("ۜᩳ") ^ i4;
                        i = ((iM3169 ^ i3) * (-25989)) ^ 617233206;
                        i2 = 893609568;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 642874873:
                case 650558371:
                    if (C3998.f13671 == 0) {
                        iM3169 = C0773.m3169("ᩴ᩵") ^ i3;
                        i = ((iM3169 ^ i4) * 3065) ^ (-255877108);
                        i2 = -78202629;
                    } else {
                        iM3169 = (C0619.m2761("۫ۜ") ^ i4) * (-81);
                        i = ((iM3169 ^ i3) * (-27535)) ^ (-235829124);
                        i2 = -1108875515;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 1356091926:
                case 1506902538:
                    i11 = 988;
                    iM3169 = C0619.m2761("۫ܰ") ^ i4;
                    i = ((iM3169 ^ i3) * (-28983)) ^ (-1654340077);
                    i2 = -1548619055;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 1385069930:
                case 2066702806:
                    if (C3033.f9831 < 0) {
                        iM3169 = (C0619.m2761("۫ۜ") ^ i4) * (-81);
                        i = ((iM3169 ^ i3) * (-27535)) ^ (-235829124);
                        i2 = -1108875515;
                    } else {
                        iM3169 = (C0619.m2761("ۨۛ") + i3) * (-65);
                        i = ((iM3169 ^ i4) * (-12113)) ^ (-1386127013);
                        i2 = -1801038357;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 1460776490:
                case 1946160023:
                    if (C2419.m8174() >= 0) {
                        iM3169 = C0773.m3169("ᩴ᩵") ^ i3;
                        i = ((iM3169 ^ i4) * 3065) ^ (-255877108);
                        i2 = -78202629;
                    } else {
                        iM3169 = C0773.m3169("ۙܰ") ^ i3;
                        i = ((iM3169 ^ i4) * (-625)) ^ (-2108689851);
                        i2 = -934242733;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 1660462885:
                case 1858638431:
                    s = sArr[c];
                    if (AbstractC0641.f2496 >= 0) {
                        iM3169 = (C0619.m2761("֡᩸") + i3) * (-27);
                        i = ((iM3169 ^ i4) * (-5463)) ^ 171740291;
                        i2 = 384064044;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ۜۡ")) * (-61);
                        i = ((iM3169 ^ i4) * (-18319)) ^ (-2123490886);
                        i2 = 1805875113;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                default:
                    i11 = 4140;
                    iM3169 = C0619.m2761("۫ܰ") ^ i4;
                    i = ((iM3169 ^ i3) * (-28983)) ^ (-1654340077);
                    i2 = -1548619055;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final File m49079() {
        File filesDir = null;
        int i = 139264333;
        int i2 = C0269.f1558;
        int i3 = C0773.f2792;
        int iM3169 = C0773.m3169("ۨۜ") ^ i2;
        int i4 = ((iM3169 ^ i3) * 10857) ^ (-269624632);
        int i5 = -1483715611;
        while (true) {
            i = ((((i ^ i3) * 9813) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2037043740:
                case 59541072:
                    C3734.m12152();
                    RunnableC3646.m11813();
                    iM3169 = (C0619.m2761("۫ܽ") ^ i2) * (-89);
                    i4 = ((iM3169 ^ i3) * (-14641)) ^ 183233550;
                    i5 = 1076181236;
                    break;
                case -1999237362:
                case -1868013868:
                    if (Build.VERSION.SDK_INT >= 24) {
                        iM3169 = C0619.m2761("ۧۚ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-19581)) ^ 1114113385;
                        i5 = 1928060993;
                    } else {
                        iM3169 = C0773.m3169("۫ۗ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-21943)) ^ 116167950;
                        i5 = 1401077179;
                    }
                    break;
                case -1877163488:
                case -558888818:
                    C11235.m28309();
                    if (C0773.m3161() == 0) {
                        iM3169 = C0619.m2761("᩻᩺") ^ i3;
                        i4 = ((iM3169 ^ i2) * 10213) ^ (-397839911);
                        i5 = -200795630;
                    } else {
                        iM3169 = (C0619.m2761("۫ܽ") ^ i2) * (-89);
                        i4 = ((iM3169 ^ i3) * (-14641)) ^ 183233550;
                        i5 = 1076181236;
                    }
                    break;
                case -1840564552:
                case -892335734:
                    if (C3734.f12817 >= 0) {
                        iM3169 = (i3 - C0773.m3169("ۜۢ")) * (-9);
                        i4 = ((iM3169 ^ i2) * 22827) ^ (-1433697903);
                        i5 = 1817562781;
                    } else {
                        iM3169 = (i3 - C0773.m3169("᩻ۜ")) * (-127);
                        i4 = ((iM3169 ^ i2) * (-32211)) ^ (-679699570);
                        i5 = -2007907770;
                    }
                    break;
                case -1809795240:
                case 294686551:
                    C4282.m13644();
                    if (AbstractC0641.f2496 < 0) {
                        iM3169 = (C0619.m2761("ۛᩳ") ^ i2) * (-51);
                        i4 = ((iM3169 ^ i3) * (-20965)) ^ (-1052841912);
                        i5 = -221188773;
                    } else {
                        iM3169 = C0619.m2761("᩻᩺") ^ i3;
                        i4 = ((iM3169 ^ i2) * 10213) ^ (-397839911);
                        i5 = -200795630;
                    }
                    break;
                case -1481097066:
                case 1796310311:
                    if (C2966.f9654 >= 0) {
                        iM3169 = (C0619.m2761("۫ܽ") ^ i2) * (-89);
                        i4 = ((iM3169 ^ i3) * (-14641)) ^ 183233550;
                        i5 = 1076181236;
                    } else {
                        iM3169 = (C0773.m3169("۫᩷") ^ i3) * 33;
                        i4 = ((iM3169 ^ i2) * 26175) ^ (-994249649);
                        i5 = -584485583;
                    }
                    break;
                case -1397945682:
                case 540489803:
                    File parentFile = filesDir.getParentFile();
                    RunnableC3646.m11808(parentFile);
                    return parentFile;
                case -1381101519:
                case -1168052794:
                    if (C0950.f3488 >= 0) {
                        iM3169 = (C0619.m2761("ۛᩳ") ^ i2) * (-51);
                        i4 = ((iM3169 ^ i3) * (-20965)) ^ (-1052841912);
                        i5 = -221188773;
                    } else {
                        iM3169 = (C0619.m2761("ۢ֡") ^ i3) * 61;
                        i4 = ((iM3169 ^ i2) * (-25713)) ^ 2028601253;
                        i5 = 1518606757;
                    }
                    break;
                case -1252148752:
                case 268059292:
                    if (C2485.m8357() <= 0) {
                        iM3169 = (C0619.m2761("۠֡") + i3) * 119;
                        i4 = ((iM3169 ^ i2) * 23251) ^ (-1576482827);
                        i5 = -1765814584;
                    } else {
                        iM3169 = (C0619.m2761("֡ᩳ") ^ i3) * 61;
                        i4 = ((iM3169 ^ i2) * (-26919)) ^ 1497242255;
                        i5 = 1236717444;
                    }
                    break;
                case -793444817:
                case -473286641:
                    C0773.m3161();
                    return null;
                case -583525740:
                case 107399723:
                    if (C20932.f66974 <= 0) {
                        iM3169 = C0619.m2761("᩻᩺") ^ i3;
                        i4 = ((iM3169 ^ i2) * 10213) ^ (-397839911);
                        i5 = -200795630;
                    } else {
                        iM3169 = C0773.m3169("ۘۙ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-18967)) ^ (-588875458);
                        i5 = 1146603065;
                    }
                    break;
                case -457627829:
                case 1571660941:
                    File dataDir = C3099.m10096().getDataDir();
                    RunnableC3646.m11808(dataDir);
                    return dataDir;
                case 140596049:
                case 357087195:
                    if (C3448.m11248() != 0) {
                        iM3169 = (C0619.m2761("۠֡") + i3) * 119;
                        i4 = ((iM3169 ^ i2) * 23251) ^ (-1576482827);
                        i5 = -1765814584;
                    } else {
                        iM3169 = C0619.m2761("ۨ۫") ^ i2;
                        i4 = ((iM3169 ^ i3) * 15675) ^ 411298395;
                        i5 = 456511981;
                    }
                    break;
                case 192554781:
                case 879990001:
                    if (C1564.m5509() <= 0) {
                        iM3169 = (i3 - C0773.m3169("ۜۢ")) * (-9);
                        i4 = ((iM3169 ^ i2) * 22827) ^ (-1433697903);
                        i5 = 1817562781;
                    } else {
                        iM3169 = (C0619.m2761("᩷֡") + i2) * (-33);
                        i4 = ((iM3169 ^ i3) * (-31885)) ^ (-1234857578);
                        i5 = 119858137;
                    }
                    break;
                case 457631188:
                case 1700184093:
                    if (RunnableC3646.f12471) {
                        iM3169 = C0619.m2761("᩻᩺") ^ i3;
                        i4 = ((iM3169 ^ i2) * 10213) ^ (-397839911);
                        i5 = -200795630;
                    } else {
                        iM3169 = (C0619.m2761("ۡ᩸") + i2) * 97;
                        i4 = ((iM3169 ^ i3) * 11787) ^ 492135687;
                        i5 = 2018594478;
                    }
                    break;
                case 1281219406:
                case 1713808032:
                    if (C2485.f7950 != 0) {
                        iM3169 = (C0619.m2761("۠֡") + i3) * 119;
                        i4 = ((iM3169 ^ i2) * 23251) ^ (-1576482827);
                        i5 = -1765814584;
                    } else {
                        iM3169 = C0619.m2761("᩻᩺") ^ i3;
                        i4 = ((iM3169 ^ i2) * 10213) ^ (-397839911);
                        i5 = -200795630;
                    }
                    break;
                case 1744821676:
                case 2093283560:
                    filesDir = C3099.m10096().getFilesDir();
                    if (RunnableC3055.m9933() != 0) {
                        iM3169 = (C0619.m2761("۠֡") + i3) * 119;
                        i4 = ((iM3169 ^ i2) * 23251) ^ (-1576482827);
                        i5 = -1765814584;
                    } else {
                        iM3169 = C0619.m2761("ܶᩴ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-12463)) ^ 1128778303;
                        i5 = -922850159;
                    }
                    break;
                default:
                    if (C2966.f9654 >= 0) {
                        iM3169 = C0619.m2761("᩻᩺") ^ i3;
                        i4 = ((iM3169 ^ i2) * 10213) ^ (-397839911);
                        i5 = -200795630;
                    } else {
                        iM3169 = C0619.m2761("ܿۨ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 489) ^ (-83743685);
                        i5 = 2103762364;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:68:0x02c9 A[PHI: r4 r17 r18 r19 r23
      0x02c9: PHI (r4v6 java.lang.String) = (r4v2 java.lang.String), (r4v2 java.lang.String), (r4v7 java.lang.String) binds: [B:67:0x02c7, B:63:0x02a7, B:11:0x0075] A[DONT_GENERATE, DONT_INLINE]
      0x02c9: PHI (r17v4 char) = (r17v3 char), (r17v2 char), (r17v2 char) binds: [B:67:0x02c7, B:63:0x02a7, B:11:0x0075] A[DONT_GENERATE, DONT_INLINE]
      0x02c9: PHI (r18v4 short) = (r18v2 short), (r18v3 short), (r18v2 short) binds: [B:67:0x02c7, B:63:0x02a7, B:11:0x0075] A[DONT_GENERATE, DONT_INLINE]
      0x02c9: PHI (r19v4 int) = (r19v2 int), (r19v3 int), (r19v2 int) binds: [B:67:0x02c7, B:63:0x02a7, B:11:0x0075] A[DONT_GENERATE, DONT_INLINE]
      0x02c9: PHI (r23v23 java.lang.String) = (r23v11 java.lang.String), (r23v12 java.lang.String), (r23v24 java.lang.String) binds: [B:67:0x02c7, B:63:0x02a7, B:11:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x02ff A[PHI: r2 r7 r8 r12 r13 r14 r16 r23
      0x02ff: PHI (r2v4 java.lang.Object) = (r2v2 java.lang.Object), (r2v2 java.lang.Object), (r2v5 java.lang.Object) binds: [B:71:0x02fd, B:48:0x01e2, B:15:0x0093] A[DONT_GENERATE, DONT_INLINE]
      0x02ff: PHI (r7v4 short[]) = (r7v2 short[]), (r7v2 short[]), (r7v5 short[]) binds: [B:71:0x02fd, B:48:0x01e2, B:15:0x0093] A[DONT_GENERATE, DONT_INLINE]
      0x02ff: PHI (r8v4 int) = (r8v2 int), (r8v2 int), (r8v5 int) binds: [B:71:0x02fd, B:48:0x01e2, B:15:0x0093] A[DONT_GENERATE, DONT_INLINE]
      0x02ff: PHI (r12v4 short[]) = (r12v2 short[]), (r12v3 short[]), (r12v2 short[]) binds: [B:71:0x02fd, B:48:0x01e2, B:15:0x0093] A[DONT_GENERATE, DONT_INLINE]
      0x02ff: PHI (r13v4 int) = (r13v2 int), (r13v3 int), (r13v2 int) binds: [B:71:0x02fd, B:48:0x01e2, B:15:0x0093] A[DONT_GENERATE, DONT_INLINE]
      0x02ff: PHI (r14v4 int) = (r14v2 int), (r14v3 int), (r14v2 int) binds: [B:71:0x02fd, B:48:0x01e2, B:15:0x0093] A[DONT_GENERATE, DONT_INLINE]
      0x02ff: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:71:0x02fd, B:48:0x01e2, B:15:0x0093] A[DONT_GENERATE, DONT_INLINE]
      0x02ff: PHI (r23v21 java.lang.String) = (r23v10 java.lang.String), (r23v18 java.lang.String), (r23v22 java.lang.String) binds: [B:71:0x02fd, B:48:0x01e2, B:15:0x0093] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0091, code lost:
    
        if (l.C0269.f1558 > 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x009e, code lost:
    
        if (l.C0773.f2792 <= 0) goto L18;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m49070(java.lang.String r27, java.lang.String r28) {
        /*
            Method dump skipped, instruction units count: 990
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C21576.m49070(java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006f  */
    /* JADX WARN: Code duplicated, block: B:55:0x01d8 A[PHI: r5 r12 r16
      0x01d8: PHI (r5v4 short) = (r5v3 short), (r5v2 short), (r5v2 short) binds: [B:54:0x01d6, B:23:0x0098, B:10:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x01d8: PHI (r12v4 int) = (r12v2 int), (r12v3 int), (r12v2 int) binds: [B:54:0x01d6, B:23:0x0098, B:10:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x01d8: PHI (r16v20 int) = (r16v5 int), (r16v16 int), (r16v25 int) binds: [B:54:0x01d6, B:23:0x0098, B:10:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0229 A[PHI: r4 r9 r16
      0x0229: PHI (r4v5 short) = (r4v2 short), (r4v3 short), (r4v2 short), (r4v2 short) binds: [B:62:0x0227, B:58:0x020a, B:42:0x0170, B:9:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x0229: PHI (r9v5 int) = (r9v2 int), (r9v2 int), (r9v3 int), (r9v2 int) binds: [B:62:0x0227, B:58:0x020a, B:42:0x0170, B:9:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x0229: PHI (r16v23 int) = (r16v3 int), (r16v4 int), (r16v8 int), (r16v24 int) binds: [B:62:0x0227, B:58:0x020a, B:42:0x0170, B:9:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x0260 A[PHI: r2 r3 r6 r7 r8 r11 r16
      0x0260: PHI (r2v4 short[]) = (r2v3 short[]), (r2v2 short[]), (r2v2 short[]), (r2v2 short[]) binds: [B:66:0x025e, B:50:0x01b5, B:46:0x0192, B:27:0x00b9] A[DONT_GENERATE, DONT_INLINE]
      0x0260: PHI (r3v4 char) = (r3v3 char), (r3v2 char), (r3v2 char), (r3v2 char) binds: [B:66:0x025e, B:50:0x01b5, B:46:0x0192, B:27:0x00b9] A[DONT_GENERATE, DONT_INLINE]
      0x0260: PHI (r6v4 int) = (r6v2 int), (r6v3 int), (r6v2 int), (r6v2 int) binds: [B:66:0x025e, B:50:0x01b5, B:46:0x0192, B:27:0x00b9] A[DONT_GENERATE, DONT_INLINE]
      0x0260: PHI (r7v4 int) = (r7v2 int), (r7v2 int), (r7v3 int), (r7v2 int) binds: [B:66:0x025e, B:50:0x01b5, B:46:0x0192, B:27:0x00b9] A[DONT_GENERATE, DONT_INLINE]
      0x0260: PHI (r8v4 int) = (r8v2 int), (r8v2 int), (r8v3 int), (r8v2 int) binds: [B:66:0x025e, B:50:0x01b5, B:46:0x0192, B:27:0x00b9] A[DONT_GENERATE, DONT_INLINE]
      0x0260: PHI (r11v3 short[]) = (r11v2 short[]), (r11v2 short[]), (r11v2 short[]), (r11v4 short[]) binds: [B:66:0x025e, B:50:0x01b5, B:46:0x0192, B:27:0x00b9] A[DONT_GENERATE, DONT_INLINE]
      0x0260: PHI (r16v14 int) = (r16v2 int), (r16v6 int), (r16v7 int), (r16v15 int) binds: [B:66:0x025e, B:50:0x01b5, B:46:0x0192, B:27:0x00b9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final File m49074() {
        int iM3169;
        int i;
        int i2;
        int i3 = C3033.f9831;
        int i4 = C1146.f4234;
        int iM2761 = (C0619.m2761("ᩴۗ") ^ i4) * (-69);
        int i5 = ((iM2761 ^ i3) * (-5507)) ^ (-1864527187);
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM2761 ^ 910059030;
        File cacheDir = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = -652756331;
        while (true) {
            int i14 = i6 ^ (i5 & (((i13 ^ i3) * (-12881)) >> 31));
            switch (i14) {
                case -2104463892:
                case -1202957076:
                    i14 = i14;
                    i10 = i8 + i9;
                    if (RunnableC3646.f12471) {
                        iM3169 = (i3 - C0619.m2761("ۨܰ")) * (-65);
                        i = ((iM3169 ^ i4) * 30581) ^ (-1033237640);
                        i2 = -814810105;
                    } else {
                        iM3169 = C0773.m3169("᩵۬") ^ i4;
                        i = ((iM3169 ^ i3) * 9363) ^ (-1721057097);
                        i2 = 641403632;
                    }
                    int i15 = i14;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i13 = i15;
                    break;
                case -2069730490:
                case -1341091741:
                    i11 = 29560;
                    iM3169 = (i4 - C0619.m2761("ۚ۟")) * 97;
                    i = ((iM3169 ^ i3) * 30633) ^ 523069557;
                    i2 = 1385977466;
                    int i16 = i14;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i13 = i16;
                    break;
                case -2031048162:
                case -484384714:
                    i14 = i14;
                    if (C3492.f12043 <= 0) {
                        iM3169 = (i3 - C0619.m2761("ۨܰ")) * (-65);
                        i = ((iM3169 ^ i4) * 30581) ^ (-1033237640);
                        i2 = -814810105;
                    } else {
                        iM3169 = C0773.m3169("᩻ܰ") ^ i3;
                        i = ((iM3169 ^ i4) * (-3477)) ^ (-1582794141);
                        i2 = 645954675;
                    }
                    int i17 = i14;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i13 = i17;
                    break;
                case -1978516912:
                case -916495412:
                    i14 = i14;
                    s = sArr[c];
                    if (C2023.f6737) {
                        iM3169 = (i3 - C0619.m2761("ۨܰ")) * (-65);
                        i = ((iM3169 ^ i4) * 30581) ^ (-1033237640);
                        i2 = -814810105;
                    } else {
                        iM3169 = (C0619.m2761("᩻ܶ") + i4) * 65;
                        i = ((iM3169 ^ i3) * 7101) ^ (-573447422);
                        i2 = 740892212;
                    }
                    int i18 = i14;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i13 = i18;
                    break;
                case -1892294681:
                case -1848354595:
                    i14 = i14;
                    cacheDir = C1321.m4856().getCacheDir();
                    if (C3077.f9998) {
                        iM3169 = (C0773.m3169("ۛۖ") ^ i3) * 7;
                        i = ((iM3169 ^ i4) * 28435) ^ (-313887079);
                        i2 = -2027853383;
                    } else {
                        iM3169 = (C0773.m3169("ۘᩴ") ^ i4) * 119;
                        i = ((iM3169 ^ i3) * (-2233)) ^ (-164836752);
                        i2 = -693393775;
                    }
                    int i19 = i14;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i13 = i19;
                    break;
                case -1774096411:
                case 1095161087:
                    i14 = i14;
                    if (i7 - (i10 + i10) <= 0) {
                        iM3169 = C0619.m2761("᩵۟") ^ i3;
                        i = ((iM3169 ^ i4) * 23363) ^ 387115331;
                        i2 = 1607436483;
                    } else {
                        iM3169 = (i3 - C0619.m2761("۠۟")) * 47;
                        i = ((iM3169 ^ i4) * 28151) ^ 940599544;
                        i2 = 40230805;
                    }
                    int i110 = i14;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i13 = i110;
                    break;
                case -1736137150:
                case -343534714:
                    i14 = i14;
                    int i20 = s + s2;
                    i7 = i20 * i20;
                    if (C1564.f5401 <= 0) {
                        iM3169 = (i4 - C0619.m2761("֨֨")) * 9;
                        i = ((iM3169 ^ i3) * 13317) ^ (-594430269);
                        i2 = 696386670;
                    } else {
                        iM3169 = (C0619.m2761("ܺܿ") + i3) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM3169 ^ i4) * 17357) ^ (-1904595818);
                        i2 = -1153802651;
                    }
                    int i111 = i14;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i13 = i111;
                    break;
                case -1471076851:
                case -1163699248:
                    C0269.m1781(cacheDir, C2287.m7749(sArr2, i12, 16, i11));
                    return cacheDir;
                case -1142037564:
                case 1946697173:
                    i14 = i14;
                    i8 = s * s;
                    i9 = 126742564;
                    if (C1783.f6087 <= 0) {
                        iM3169 = (i4 - C0619.m2761("֨֨")) * 9;
                        i = ((iM3169 ^ i3) * 13317) ^ (-594430269);
                        i2 = 696386670;
                    } else {
                        iM3169 = (C0619.m2761("ᩴۛ") ^ i4) * (-25);
                        i = ((iM3169 ^ i3) * (-29075)) ^ 1044297429;
                        i2 = 1184647247;
                    }
                    int i112 = i14;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i13 = i112;
                    break;
                case -700588775:
                case 97897901:
                    C2702.m8876();
                    iM3169 = (C0619.m2761("ۗ۫") + i4) * (-63);
                    i14 = i14;
                    i = ((iM3169 ^ i3) * 9497) ^ 625548571;
                    i2 = 1371967320;
                    int i113 = i14;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i13 = i113;
                    break;
                case -566575133:
                case 1196412027:
                    C4238.m13540();
                    if (C1080.f3865 < 0) {
                        iM3169 = (C0619.m2761("ۗ۫") + i4) * (-63);
                        i14 = i14;
                        i = ((iM3169 ^ i3) * 9497) ^ 625548571;
                        i2 = 1371967320;
                    } else {
                        i14 = i14;
                        iM3169 = (i3 - C0619.m2761("ۨܰ")) * (-65);
                        i = ((iM3169 ^ i4) * 30581) ^ (-1033237640);
                        i2 = -814810105;
                    }
                    int i114 = i14;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i13 = i114;
                    break;
                case -477479063:
                case 1565450544:
                    i14 = i14;
                    s2 = 11258;
                    if (RunnableC3055.f9898 >= 0) {
                        iM3169 = C0773.m3169("۬ۙ") ^ i3;
                        i = ((iM3169 ^ i4) * 3467) ^ (-1100296237);
                        i2 = -114833692;
                    } else {
                        iM3169 = (C0773.m3169("ܽۚ") ^ i3) * 57;
                        i = ((iM3169 ^ i4) * 26035) ^ (-293008893);
                        i2 = -257727523;
                    }
                    int i115 = i14;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i13 = i115;
                    break;
                case -378633102:
                case 1216842083:
                    i14 = i14;
                    i12 = 310;
                    if (C0269.f1558 <= 0) {
                        iM3169 = C0773.m3169("۬ۙ") ^ i3;
                        i = ((iM3169 ^ i4) * 3467) ^ (-1100296237);
                        i2 = -114833692;
                    } else {
                        iM3169 = (C0773.m3169("ܳᩴ") + i3) * 57;
                        i = ((iM3169 ^ i4) * (-23543)) ^ (-2120982300);
                        i2 = -1066753090;
                    }
                    int i116 = i14;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i13 = i116;
                    break;
                case -350732761:
                case 499119484:
                    C0862.m3503();
                    if (C0950.f3488 < 0) {
                        i14 = i14;
                        iM3169 = C0773.m3169("۬ۙ") ^ i3;
                        i = ((iM3169 ^ i4) * 3467) ^ (-1100296237);
                        i2 = -114833692;
                        int i117 = i14;
                        i6 = iM3169 ^ i2;
                        i5 = i;
                        i13 = i117;
                    }
                    i14 = i14;
                    iM3169 = (i3 - C0619.m2761("ۨܰ")) * (-65);
                    i = ((iM3169 ^ i4) * 30581) ^ (-1033237640);
                    i2 = -814810105;
                    int i118 = i14;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i13 = i118;
                    break;
                case -259408889:
                case 385562659:
                    if (C0487.m2356() < 0) {
                        iM3169 = (C0619.m2761("ۗ۫") + i4) * (-63);
                        i14 = i14;
                        i = ((iM3169 ^ i3) * 9497) ^ 625548571;
                        i2 = 1371967320;
                    } else {
                        i14 = i14;
                        iM3169 = (C0773.m3169("ۘᩴ") ^ i4) * 119;
                        i = ((iM3169 ^ i3) * (-2233)) ^ (-164836752);
                        i2 = -693393775;
                    }
                    int i119 = i14;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i13 = i119;
                    break;
                case 137078574:
                case 874874808:
                    i14 = i14;
                    sArr2 = f68929;
                    if (C3099.f10023 <= 0) {
                        iM3169 = (i4 - C0619.m2761("֨֨")) * 9;
                        i = ((iM3169 ^ i3) * 13317) ^ (-594430269);
                        i2 = 696386670;
                    } else {
                        iM3169 = C0773.m3169("֡ۖ") ^ i4;
                        i = ((iM3169 ^ i3) * 11291) ^ 888054718;
                        i2 = -117546444;
                    }
                    int i1110 = i14;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i13 = i1110;
                    break;
                case 187168752:
                case 989759337:
                    i11 = 45077;
                    iM3169 = (i4 - C0619.m2761("ۚ۟")) * 97;
                    i = ((iM3169 ^ i3) * 30633) ^ 523069557;
                    i2 = 1385977466;
                    int i1111 = i14;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i13 = i1111;
                    break;
                case 228442189:
                case 1497147725:
                    i14 = i14;
                    sArr = f68929;
                    c = 309;
                    if (C11235.m28309() != 0) {
                        iM3169 = (i4 - C0619.m2761("֨֨")) * 9;
                        i = ((iM3169 ^ i3) * 13317) ^ (-594430269);
                        i2 = 696386670;
                    } else {
                        iM3169 = C0773.m3169("ۧ֡") ^ i4;
                        i = ((iM3169 ^ i3) * (-2855)) ^ 709870154;
                        i2 = 1398367662;
                    }
                    int i1112 = i14;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i13 = i1112;
                    break;
                default:
                    C3033.m9845();
                    return null;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final ApplicationInfo m49056() {
        ApplicationInfo applicationInfo = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        short s2 = 0;
        int i4 = 0;
        short[] sArr2 = null;
        int i5 = 0;
        int i6 = -77354193;
        int i7 = C1783.f6087;
        int i8 = C2287.f7432;
        int iM2761 = (C0619.m2761("᩸ܿ") + i7) * (-53);
        int i9 = ((iM2761 ^ i8) * (-2873)) ^ (-950463658);
        int i10 = -1846997132;
        while (true) {
            i6 = ((((i6 ^ i8) * 20177) >> 31) & i9) ^ (iM2761 ^ i10);
            switch (i6) {
                case -1946271205:
                case -1203845288:
                    if (C1343.f4799 != 0) {
                        iM2761 = C0773.m3169("᩺ۜ") ^ i8;
                        i9 = ((iM2761 ^ i7) * 17799) ^ (-1284104110);
                        i10 = 1211894078;
                    } else {
                        iM2761 = (C0773.m3169("۟֨") ^ i8) * (-117);
                        i9 = ((iM2761 ^ i7) * (-25665)) ^ (-17018061);
                        i10 = -1901612693;
                    }
                    break;
                case -1864099995:
                case 1250089212:
                    i4 = 26829;
                    iM2761 = (C0619.m2761("֫᩸") + i7) * 21;
                    i9 = ((iM2761 ^ i8) * 29373) ^ (-1897542231);
                    i10 = 387565812;
                    break;
                case -1761224577:
                case 1211925590:
                    sArr2 = f68929;
                    if (C3099.f10023 <= 0) {
                        iM2761 = (C0773.m3169("ۙ᩸") + i8) * (-65);
                        i9 = ((iM2761 ^ i7) * (-24099)) ^ (-1573359640);
                        i10 = -1937338672;
                    } else {
                        iM2761 = (C0619.m2761("ۚܺ") ^ i8) * (-87);
                        i9 = ((iM2761 ^ i7) * (-22215)) ^ (-2061733659);
                        i10 = 1395736766;
                    }
                    break;
                case -1748461614:
                case -67497077:
                    s = sArr[c];
                    if (C3492.m11488()) {
                        iM2761 = C0773.m3169("᩻۬") ^ i7;
                        i9 = ((iM2761 ^ i8) * 3523) ^ (-1685265220);
                        i10 = 1978342756;
                    } else {
                        iM2761 = (C0773.m3169("ۙ᩸") + i8) * (-65);
                        i9 = ((iM2761 ^ i7) * (-24099)) ^ (-1573359640);
                        i10 = -1937338672;
                    }
                    break;
                case -1631282139:
                case 723915567:
                    i5 = 19;
                    if (C3734.f12817 >= 0) {
                        iM2761 = (C0619.m2761("ۧ᩵") + i7) * (-81);
                        i9 = ((iM2761 ^ i8) * (-605)) ^ (-1623026530);
                        i10 = -218166711;
                    } else {
                        iM2761 = C0773.m3169("۬ᩴ") ^ i7;
                        i9 = ((iM2761 ^ i8) * 22185) ^ (-1132752819);
                        i10 = -1446488585;
                    }
                    break;
                case -1448769566:
                case 331772168:
                    i3 = i + i2;
                    s2 = 13724;
                    if (RunnableC1848.f6235) {
                        iM2761 = C0773.m3169("᩺ۜ") ^ i8;
                        i9 = ((iM2761 ^ i7) * 17799) ^ (-1284104110);
                        i10 = 1211894078;
                    } else {
                        iM2761 = C0619.m2761("֡۠") ^ i7;
                        i9 = ((iM2761 ^ i8) * (-21387)) ^ (-256265560);
                        i10 = 1612100833;
                    }
                    break;
                case -1266026178:
                case 1939995136:
                    if (C0269.m1775() <= 0) {
                        iM2761 = (C0773.m3169("۠ܰ") ^ i8) * (-13);
                        i9 = ((iM2761 ^ i7) * (-32377)) ^ (-1344639073);
                        i10 = 249158715;
                    } else {
                        iM2761 = C0773.m3169("۟᩸") ^ i7;
                        i9 = ((iM2761 ^ i8) * (-3705)) ^ (-1177382423);
                        i10 = -234208809;
                    }
                    break;
                case -1122464548:
                case 2002648282:
                    i4 = 4578;
                    iM2761 = (C0619.m2761("֫᩸") + i7) * 21;
                    i9 = ((iM2761 ^ i8) * 29373) ^ (-1897542231);
                    i10 = 387565812;
                    break;
                case -1028629458:
                case 453601550:
                    if (C1519.f5300 >= 0) {
                        iM2761 = (C0773.m3169("ۙ᩸") + i8) * (-65);
                        i9 = ((iM2761 ^ i7) * (-24099)) ^ (-1573359640);
                        i10 = -1937338672;
                    } else {
                        iM2761 = (C0773.m3169("۠ܰ") ^ i8) * (-13);
                        i9 = ((iM2761 ^ i7) * (-32377)) ^ (-1344639073);
                        i10 = 249158715;
                    }
                    break;
                case -965729668:
                case 21270059:
                    applicationInfo = C1321.m4856().getApplicationInfo();
                    if (C0487.f2131 <= 0) {
                        iM2761 = (C0619.m2761("ۧ᩵") + i7) * (-81);
                        i9 = ((iM2761 ^ i8) * (-605)) ^ (-1623026530);
                        i10 = -218166711;
                    } else {
                        iM2761 = (i7 - C0619.m2761("᩸ۢ")) * 13;
                        i9 = ((iM2761 ^ i8) * 4161) ^ 905151612;
                        i10 = -1941710518;
                    }
                    break;
                case -936858475:
                case 356408012:
                    C1783.m6232();
                    if (C2310.f7472 >= 0) {
                        iM2761 = (C0773.m3169("᩸ۛ") + i7) * (-55);
                        i9 = ((iM2761 ^ i8) * 11251) ^ 433925144;
                        i10 = 352456943;
                    } else {
                        iM2761 = (C0773.m3169("۠ܰ") ^ i8) * (-13);
                        i9 = ((iM2761 ^ i7) * (-32377)) ^ (-1344639073);
                        i10 = 249158715;
                    }
                    break;
                case -531339306:
                case -180170776:
                    C2966.m9664();
                    RunnableC3646.m11813();
                    iM2761 = (C0773.m3169("۠ܰ") ^ i8) * (-13);
                    i9 = ((iM2761 ^ i7) * (-32377)) ^ (-1344639073);
                    i10 = 249158715;
                    break;
                case -517425563:
                case 1627407477:
                    if (C11235.f35427 >= 0) {
                        iM2761 = C0773.m3169("᩺ۜ") ^ i8;
                        i9 = ((iM2761 ^ i7) * 17799) ^ (-1284104110);
                        i10 = 1211894078;
                    } else {
                        iM2761 = (C0619.m2761("۠ۗ") ^ i8) * 85;
                        i9 = ((iM2761 ^ i7) * (-23729)) ^ 2097544798;
                        i10 = -199506090;
                    }
                    break;
                case -469971703:
                case 1794231883:
                    C0269.m1781(applicationInfo, RunnableC3646.m11809(sArr2, i5, 23, i4));
                    return applicationInfo;
                case -2889836:
                case 2011261973:
                    C2375.m8065();
                    if (!C0862.m3503()) {
                        iM2761 = C0773.m3169("᩺ۜ") ^ i8;
                        i9 = ((iM2761 ^ i7) * 17799) ^ (-1284104110);
                        i10 = 1211894078;
                    } else {
                        iM2761 = (C0773.m3169("᩸ۛ") + i7) * (-55);
                        i9 = ((iM2761 ^ i8) * 11251) ^ 433925144;
                        i10 = 352456943;
                    }
                    break;
                case 84506357:
                case 1071402819:
                    i = s * s;
                    i2 = 47087044;
                    if (C3099.f10023 <= 0) {
                        iM2761 = (C0619.m2761("ۧ᩵") + i7) * (-81);
                        i9 = ((iM2761 ^ i8) * (-605)) ^ (-1623026530);
                        i10 = -218166711;
                    } else {
                        iM2761 = (i8 - C0619.m2761("᩷֨")) * (-27);
                        i9 = ((iM2761 ^ i7) * (-26101)) ^ 1475090960;
                        i10 = -730008774;
                    }
                    break;
                case 865312939:
                case 1346438823:
                    sArr = f68929;
                    c = 18;
                    if (C2966.f9654 >= 0) {
                        iM2761 = (C0619.m2761("ۧ᩵") + i7) * (-81);
                        i9 = ((iM2761 ^ i8) * (-605)) ^ (-1623026530);
                        i10 = -218166711;
                    } else {
                        iM2761 = (C0619.m2761("۟᩺") ^ i7) * 49;
                        i9 = ((iM2761 ^ i8) * (-4959)) ^ (-1258138268);
                        i10 = 1426949256;
                    }
                    break;
                case 964484484:
                case 1879604544:
                    C0619.m2763();
                    return null;
                default:
                    if (i3 - (s * s2) >= 0) {
                        iM2761 = C0773.m3169("۫᩶") ^ i8;
                        i9 = ((iM2761 ^ i7) * 3791) ^ (-1762614998);
                        i10 = -146107848;
                    } else {
                        iM2761 = C0619.m2761("ᩳܶ") ^ i8;
                        i9 = ((iM2761 ^ i7) * (-14409)) ^ (-172770595);
                        i10 = 284209743;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final void m49076(View view) {
        int i = 0;
        int i2 = -1510413259;
        int i3 = AbstractC3624.f12429;
        int i4 = C1542.f5343;
        int iM3169 = C0773.m3169("ܿ֨") ^ i3;
        int i5 = ((iM3169 ^ i4) * 27819) ^ (-1767717585);
        int i6 = -1756676548;
        while (true) {
            i2 = ((((i2 ^ i4) * (-6925)) >> 31) & i5) ^ (iM3169 ^ i6);
            switch (i2) {
                case -2117667920:
                case 712320771:
                    m49089(i, view);
                    iM3169 = C0619.m2761("۟֨") ^ i4;
                    i5 = ((iM3169 ^ i3) * 12153) ^ (-1024311141);
                    i6 = -2043761063;
                    break;
                case -2091466379:
                case -593038401:
                    if (view != null) {
                        iM3169 = (i3 - C0773.m3169("ۧۨ")) * 29;
                        i5 = ((iM3169 ^ i4) * 1065) ^ (-1031896066);
                        i6 = 154981971;
                    } else {
                        iM3169 = C0619.m2761("۟֨") ^ i4;
                        i5 = ((iM3169 ^ i3) * 12153) ^ (-1024311141);
                        i6 = -2043761063;
                    }
                    break;
                case -1862785482:
                case -1380746631:
                    i = 0;
                    if (C2878.m9491() <= 0) {
                        iM3169 = C0619.m2761("ۜᩳ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 25021) ^ 119736864;
                        i6 = -1835601621;
                    } else {
                        iM3169 = (C0619.m2761("ܽۤ") ^ i4) * (-39);
                        i5 = ((iM3169 ^ i3) * (-6365)) ^ 1633452521;
                        i6 = -164855801;
                    }
                    break;
                case -1828416974:
                case 2121905092:
                    if (C3033.m9845() <= 0) {
                        iM3169 = C0619.m2761("ۜᩳ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 25021) ^ 119736864;
                        i6 = -1835601621;
                    } else {
                        iM3169 = C0619.m2761("ܽ֫") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-21897)) ^ 1851184440;
                        i6 = 1926698076;
                    }
                    break;
                case -1810238581:
                case -1347656908:
                    C1146.m4231();
                    iM3169 = C0619.m2761("ۜᩳ") ^ i4;
                    i5 = ((iM3169 ^ i3) * 25021) ^ 119736864;
                    i6 = -1835601621;
                    break;
                case -1767178610:
                case 2121791121:
                    if (C2485.m8357() <= 0) {
                        iM3169 = C0619.m2761("ۜᩳ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 25021) ^ 119736864;
                        i6 = -1835601621;
                    } else {
                        iM3169 = C0619.m2761("ۡ۟") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-5051)) ^ 908636886;
                        i6 = -2031519636;
                    }
                    break;
                case -1703606815:
                case 595684515:
                    if (C2878.f9462) {
                        iM3169 = C0619.m2761("ۜᩳ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 25021) ^ 119736864;
                        i6 = -1835601621;
                    } else {
                        iM3169 = C0773.m3169("ۖᩳ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 24381) ^ 1048035968;
                        i6 = 540073641;
                    }
                    break;
                case -1623514457:
                case 820706798:
                    C1343.m4943();
                    if (C3448.m11248() != 0) {
                        iM3169 = (C0773.m3169("᩻۠") + i4) * 15;
                        i5 = ((iM3169 ^ i3) * 19865) ^ (-1354533932);
                        i6 = 797513196;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ۗ֫")) * 63;
                        i5 = ((iM3169 ^ i4) * (-23157)) ^ (-697080788);
                        i6 = -818257248;
                    }
                    break;
                case -967053097:
                case 1766977752:
                    if (C3734.f12817 >= 0) {
                        iM3169 = (C0619.m2761("ۖܶ") ^ i4) * 95;
                        i5 = ((iM3169 ^ i3) * (-15013)) ^ 583487683;
                        i6 = -1540215853;
                    } else {
                        iM3169 = C0619.m2761("ۧ֫") ^ i3;
                        i5 = ((iM3169 ^ i4) * 13205) ^ (-1031345959);
                        i6 = 1637406573;
                    }
                    break;
                case -816859940:
                case -51561712:
                    break;
                case -813144994:
                case 1120625488:
                    if (C1146.f4234 >= 0) {
                        iM3169 = (C0773.m3169("᩻۠") + i4) * 15;
                        i5 = ((iM3169 ^ i3) * 19865) ^ (-1354533932);
                        i6 = 797513196;
                    } else {
                        iM3169 = (i3 - C0619.m2761("᩻᩶")) * (-109);
                        i5 = ((iM3169 ^ i4) * (-16669)) ^ 3247118;
                        i6 = 1116201183;
                    }
                    break;
                case -604512752:
                case 870982365:
                    C2310.m7813();
                    C3077.m10041();
                    break;
                case -269826974:
                case 190448383:
                    if (C20932.m47848() != 0) {
                        iM3169 = (C0773.m3169("᩻۠") + i4) * 15;
                        i5 = ((iM3169 ^ i3) * 19865) ^ (-1354533932);
                        i6 = 797513196;
                    } else {
                        iM3169 = C0773.m3169("ۗۗ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 11497) ^ (-1317034206);
                        i6 = -1346758972;
                    }
                    break;
                case 605978292:
                case 1753457110:
                    if (C0862.m3503()) {
                        iM3169 = (i3 - C0619.m2761("ۛᩳ")) * (-27);
                        i5 = ((iM3169 ^ i4) * 21815) ^ (-403438548);
                        i6 = -2140396002;
                    } else {
                        iM3169 = (C0619.m2761("ۖܶ") ^ i4) * 95;
                        i5 = ((iM3169 ^ i3) * (-15013)) ^ 583487683;
                        i6 = -1540215853;
                    }
                    break;
                case 1001796222:
                case 2005819806:
                    if (C3779.f12953 <= 0) {
                        iM3169 = (C0773.m3169("᩻۠") + i4) * 15;
                        i5 = ((iM3169 ^ i3) * 19865) ^ (-1354533932);
                        i6 = 797513196;
                    } else {
                        iM3169 = C0773.m3169("۠ܶ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 3817) ^ 343361327;
                        i6 = -582547182;
                    }
                    break;
                case 1491246442:
                case 1667487475:
                    if (C0619.m2763()) {
                        iM3169 = C0619.m2761("ۜᩳ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 25021) ^ 119736864;
                        i6 = -1835601621;
                    } else {
                        iM3169 = (C0773.m3169("ܿܺ") + i3) * 97;
                        i5 = ((iM3169 ^ i4) * (-4981)) ^ (-1347497348);
                        i6 = 1361871374;
                    }
                    break;
                case 1611813322:
                case 1993081060:
                    if (C3492.f12043 > 0) {
                        iM3169 = (C0773.m3169("᩻۠") + i4) * 15;
                        i5 = ((iM3169 ^ i3) * 19865) ^ (-1354533932);
                        i6 = 797513196;
                    } else {
                        iM3169 = C0619.m2761("ۜᩳ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 25021) ^ 119736864;
                        i6 = -1835601621;
                    }
                    break;
                default:
                    if (RunnableC3646.f12471) {
                        iM3169 = C0619.m2761("ۜᩳ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 25021) ^ 119736864;
                        i6 = -1835601621;
                    } else {
                        iM3169 = C0773.m3169("ۧ᩹") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-8479)) ^ 412023894;
                        i6 = 1751955227;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final String m49092() {
        String packageName = null;
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
        int i6 = 1844782008;
        int i7 = C1080.f3865;
        int i8 = C2375.f7641;
        int iM2761 = C0619.m2761("ۢ᩹") ^ i8;
        int i9 = ((iM2761 ^ i7) * (-18363)) ^ 1014087438;
        int i10 = 109760835;
        while (true) {
            i6 = ((((i6 ^ i7) * 16391) >> 31) & i9) ^ (iM2761 ^ i10);
            switch (i6) {
                case -1981596507:
                case -76539225:
                    sArr2 = f68929;
                    if (C4282.m13644()) {
                        iM2761 = C0773.m3169("᩷ۖ") ^ i7;
                        i9 = ((iM2761 ^ i8) * 9971) ^ (-600479217);
                        i10 = -286248363;
                    } else {
                        iM2761 = (C0773.m3169("᩶ܺ") ^ i8) * (-125);
                        i9 = ((iM2761 ^ i7) * 4275) ^ 468423463;
                        i10 = -569901869;
                    }
                    break;
                case -1853471380:
                case 1879979037:
                    i3 = 1;
                    if (C3690.f12684 <= 0) {
                        iM2761 = (C0773.m3169("᩶ܺ") ^ i8) * (-125);
                        i9 = ((iM2761 ^ i7) * 4275) ^ 468423463;
                        i10 = -569901869;
                    } else {
                        iM2761 = (i8 - C0773.m3169("ᩴ֫")) * (-83);
                        i9 = ((iM2761 ^ i7) * 10271) ^ (-588585354);
                        i10 = -1207461360;
                    }
                    break;
                case -1625063271:
                case -1161126451:
                    packageName = C3099.m10096().getPackageName();
                    if (C0487.f2131 <= 0) {
                        iM2761 = (C0619.m2761("ܳܽ") + i7) * 51;
                        i9 = ((iM2761 ^ i8) * 4249) ^ (-1985396258);
                        i10 = 204555422;
                    } else {
                        iM2761 = (C0619.m2761("ܶۢ") ^ i8) * 89;
                        i9 = ((iM2761 ^ i7) * 23769) ^ 929159391;
                        i10 = 1512420330;
                    }
                    break;
                case -1536113664:
                case 1824902012:
                    if (C2023.f6737) {
                        iM2761 = (C0773.m3169("ۙ᩵") + i7) * (-91);
                        i9 = ((iM2761 ^ i8) * (-17441)) ^ (-175210815);
                        i10 = 749157421;
                    } else {
                        iM2761 = C0773.m3169("᩸ܺ") ^ i7;
                        i9 = ((iM2761 ^ i8) * (-1217)) ^ 13486944;
                        i10 = 934688366;
                    }
                    break;
                case -1528428278:
                case 408037170:
                    if (i - (i2 + i3) < 0) {
                        iM2761 = (C0773.m3169("۠ۡ") ^ i8) * 101;
                        i9 = ((iM2761 ^ i7) * (-2009)) ^ (-2051134183);
                        i10 = 1951601180;
                    } else {
                        iM2761 = C0619.m2761("֫ܰ") ^ i7;
                        i9 = ((iM2761 ^ i8) * 19063) ^ (-1454672924);
                        i10 = -38022601;
                    }
                    break;
                case -1295891199:
                case -1180666936:
                    C2310.m7813();
                    C1080.m4050();
                    iM2761 = (C0619.m2761("ܽ᩺") ^ i8) * 65;
                    i9 = ((iM2761 ^ i7) * 3729) ^ (-872594420);
                    i10 = 1374810548;
                    break;
                case -1134171695:
                case 842123961:
                    if (!C17202.f56030) {
                        iM2761 = (C0619.m2761("ܳܽ") + i7) * 51;
                        i9 = ((iM2761 ^ i8) * 4249) ^ (-1985396258);
                        i10 = 204555422;
                    } else {
                        iM2761 = (C0773.m3169("᩶ܺ") ^ i8) * (-125);
                        i9 = ((iM2761 ^ i7) * 4275) ^ 468423463;
                        i10 = -569901869;
                    }
                    break;
                case -1043491267:
                case 1918151405:
                    sArr = f68929;
                    c = 713;
                    if (C2878.m9491() <= 0) {
                        iM2761 = (C0619.m2761("ܽ᩺") ^ i8) * 65;
                        i9 = ((iM2761 ^ i7) * 3729) ^ (-872594420);
                        i10 = 1374810548;
                    } else {
                        iM2761 = C0773.m3169("۠᩶") ^ i8;
                        i9 = ((iM2761 ^ i7) * 16527) ^ (-73930347);
                        i10 = -793853969;
                    }
                    break;
                case -982735260:
                case 987933934:
                    i2 = s * 2;
                    if (C3492.f12043 <= 0) {
                        iM2761 = (C0773.m3169("ۙ᩵") + i7) * (-91);
                        i9 = ((iM2761 ^ i8) * (-17441)) ^ (-175210815);
                        i10 = 749157421;
                    } else {
                        iM2761 = C0619.m2761("᩹᩻") ^ i7;
                        i9 = ((iM2761 ^ i8) * (-24699)) ^ (-633881714);
                        i10 = 1256414374;
                    }
                    break;
                case -501941301:
                case 787284633:
                    C1519.m5403();
                    if (C3998.f13671 == 0) {
                        iM2761 = C0619.m2761("ᩳ᩶") ^ i8;
                        i9 = ((iM2761 ^ i7) * 29211) ^ (-2082503954);
                        i10 = 1189875875;
                    } else {
                        iM2761 = (C0619.m2761("ܳܽ") + i7) * 51;
                        i9 = ((iM2761 ^ i8) * 4249) ^ (-1985396258);
                        i10 = 204555422;
                    }
                    break;
                case -470874258:
                case 619631930:
                    C2310.m7811(packageName, C2287.m7749(sArr2, i5, 19, i4));
                    return packageName;
                case -321692860:
                case 2138909769:
                    s = sArr[c];
                    if (C3077.f9998) {
                        iM2761 = (C0773.m3169("ۤ۠") + i7) * (-33);
                        i9 = ((iM2761 ^ i8) * (-16127)) ^ 265110010;
                        i10 = -1173190075;
                    } else {
                        iM2761 = C0619.m2761("ᩳ᩶") ^ i8;
                        i9 = ((iM2761 ^ i7) * 29211) ^ (-2082503954);
                        i10 = 1189875875;
                    }
                    break;
                case -249187642:
                case 228649561:
                    s2 = 1;
                    if (C0950.m3785() != 0) {
                        iM2761 = (C0773.m3169("ۙ᩵") + i7) * (-91);
                        i9 = ((iM2761 ^ i8) * (-17441)) ^ (-175210815);
                        i10 = 749157421;
                    } else {
                        iM2761 = (C0619.m2761("۬֨") ^ i8) * (-95);
                        i9 = ((iM2761 ^ i7) * (-3367)) ^ (-1330808377);
                        i10 = -1035369442;
                    }
                    break;
                case -41163248:
                case 887457296:
                    C2023.m6964();
                    C3734.m12152();
                    return null;
                case 835120548:
                case 1868331694:
                    if (C11235.f35427 < 0) {
                        iM2761 = (C0619.m2761("ܳܽ") + i7) * 51;
                        i9 = ((iM2761 ^ i8) * 4249) ^ (-1985396258);
                        i10 = 204555422;
                    } else {
                        iM2761 = (C0619.m2761("ܽ᩺") ^ i8) * 65;
                        i9 = ((iM2761 ^ i7) * 3729) ^ (-872594420);
                        i10 = 1374810548;
                    }
                    break;
                case 898981762:
                case 1608376743:
                    i5 = 714;
                    if (C3448.f11240 >= 0) {
                        iM2761 = (C0773.m3169("᩶ܺ") ^ i8) * (-125);
                        i9 = ((iM2761 ^ i7) * 4275) ^ 468423463;
                        i10 = -569901869;
                    } else {
                        iM2761 = (C0619.m2761("᩹ۜ") + i7) * 9;
                        i9 = ((iM2761 ^ i8) * 28163) ^ (-2070293638);
                        i10 = -1839664903;
                    }
                    break;
                case 1284287033:
                case 1674226299:
                    int i11 = s + s2;
                    i = i11 * i11;
                    if (C11235.f35427 >= 0) {
                        iM2761 = (C0773.m3169("ۙ᩵") + i7) * (-91);
                        i9 = ((iM2761 ^ i8) * (-17441)) ^ (-175210815);
                        i10 = 749157421;
                    } else {
                        iM2761 = C0619.m2761("᩹ۚ") ^ i8;
                        i9 = ((iM2761 ^ i7) * 19725) ^ (-1980006566);
                        i10 = -1313797732;
                    }
                    break;
                case 1342417293:
                case 1877050692:
                    i4 = 55205;
                    iM2761 = C0619.m2761("ۚۜ") ^ i7;
                    i9 = ((iM2761 ^ i8) * (-4625)) ^ 1193045929;
                    i10 = 1145376051;
                    break;
                default:
                    i4 = 38060;
                    iM2761 = C0619.m2761("ۚۜ") ^ i7;
                    i9 = ((iM2761 ^ i8) * (-4625)) ^ 1193045929;
                    i10 = 1145376051;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0221 A[PHI: r1 r5 r13 r14 r15 r23
      0x0221: PHI (r1v3 java.lang.Object) = (r1v2 java.lang.Object), (r1v1 java.lang.Object), (r1v1 java.lang.Object) binds: [B:51:0x01e2, B:10:0x006c, B:6:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x0221: PHI (r5v4 short[]) = (r5v3 short[]), (r5v2 short[]), (r5v2 short[]) binds: [B:51:0x01e2, B:10:0x006c, B:6:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x0221: PHI (r13v2 short[]) = (r13v1 short[]), (r13v1 short[]), (r13v3 short[]) binds: [B:51:0x01e2, B:10:0x006c, B:6:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x0221: PHI (r14v2 int) = (r14v1 int), (r14v1 int), (r14v3 int) binds: [B:51:0x01e2, B:10:0x006c, B:6:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x0221: PHI (r15v2 int) = (r15v1 int), (r15v1 int), (r15v3 int) binds: [B:51:0x01e2, B:10:0x006c, B:6:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x0221: PHI (r23v23 java.lang.String) = (r23v14 java.lang.String), (r23v20 java.lang.String), (r23v24 java.lang.String) binds: [B:51:0x01e2, B:10:0x006c, B:6:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a1, code lost:
    
        if (l.C2966.f9654 < 0) goto L10;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m49061(int r28, java.lang.CharSequence r29) {
        /*
            Method dump skipped, instruction units count: 1132
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C21576.m49061(int, java.lang.CharSequence):void");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final void m49090(View view) {
        int iM3169;
        int i;
        int i2 = -1716321009;
        int i3 = C0773.f2792;
        int i4 = C2354.f7599;
        int iM2761 = (i4 - C0619.m2761("ᩴۧ")) * (-93);
        int i5 = ((iM2761 ^ i3) * (-12537)) ^ 682839694;
        int i6 = 935434996;
        while (true) {
            int i7 = iM2761 ^ i6;
            RunnableC11016 runnableC11016 = null;
            while (true) {
                i2 = ((((i2 ^ i3) * 16025) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -1880154241:
                    case 1224436583:
                        if (RunnableC3055.m9933() == 0) {
                            iM2761 = (i4 - C0773.m3169("ܽ᩷")) * (-125);
                            i5 = ((iM2761 ^ i3) * 23859) ^ (-652341746);
                            i6 = 376324327;
                        } else {
                            iM2761 = C0773.m3169("ۨۢ") ^ i3;
                            i5 = ((iM2761 ^ i4) * (-18127)) ^ (-217753346);
                            i6 = 123681816;
                        }
                        break;
                    case -1745120827:
                    case -384836998:
                        RunnableC1848.m6360();
                        if (C3690.f12684 > 0) {
                            iM2761 = C0773.m3169("ۨۢ") ^ i3;
                            i5 = ((iM2761 ^ i4) * (-18127)) ^ (-217753346);
                            i6 = 123681816;
                        } else {
                            iM2761 = C0773.m3169("۟ۢ") ^ i3;
                            i5 = ((iM2761 ^ i4) * (-21757)) ^ (-1603138553);
                            i6 = 2116473425;
                        }
                        break;
                    case -1232346222:
                    case 213414171:
                        AbstractC0116.m1243();
                        C2834.m9344();
                        break;
                    case -1182176765:
                    case 1224316959:
                        if (view != null) {
                            iM3169 = (i4 - C0773.m3169("ۛۘ")) * (-85);
                            i5 = ((iM3169 ^ i3) * (-737)) ^ 1765592915;
                            i = 928358310;
                        } else {
                            iM3169 = (i3 - C0773.m3169("ۧ۠")) * (-75);
                            i5 = ((iM3169 ^ i4) * 30937) ^ 963631296;
                            i = -2054324279;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case -1122747751:
                    case -295819815:
                        break;
                    case 657471159:
                    case 1191560364:
                        int i8 = 1;
                        if (C1146.f4234 < 0) {
                            if (C3077.f9998) {
                                if (C13473.f42873 == 0) {
                                    if (!C2878.f9462 && RunnableC3055.f9898 < 0 && !C0619.m2763()) {
                                        if (C2354.f7599 >= 0) {
                                            iM2761 = C0773.m3169("ۨۢ") ^ i3;
                                            i5 = ((iM2761 ^ i4) * (-18127)) ^ (-217753346);
                                            i6 = 123681816;
                                            break;
                                        } else if (C1519.m5403() && C3492.f12043 > 0) {
                                            runnableC11016 = new RunnableC11016(i8, view);
                                            if (C23916.f77426 <= 0) {
                                                iM3169 = (C0619.m2761("ܿ᩸") ^ i4) * 69;
                                                i5 = ((iM3169 ^ i3) * (-28761)) ^ 1495808717;
                                                i = -1893121863;
                                            } else {
                                                iM3169 = C0773.m3169("᩸᩹") ^ i4;
                                                i5 = ((iM3169 ^ i3) * 13323) ^ 1156282587;
                                                i = -1257229314;
                                            }
                                            i7 = iM3169 ^ i;
                                            break;
                                        }
                                    }
                                }
                                iM2761 = (i4 - C0773.m3169("ܽ᩷")) * (-125);
                                i5 = ((iM2761 ^ i3) * 23859) ^ (-652341746);
                                i6 = 376324327;
                                break;
                            }
                            iM2761 = C0619.m2761("ܳ᩹") ^ i3;
                            i5 = ((iM2761 ^ i4) * 27423) ^ 419001433;
                            i6 = -42885520;
                        } else {
                            iM2761 = C0773.m3169("۟ۢ") ^ i3;
                            i5 = ((iM2761 ^ i4) * (-21757)) ^ (-1603138553);
                            i6 = 2116473425;
                        }
                        break;
                    case 1447751142:
                    case 1975621707:
                        C2834.m9344();
                        iM2761 = C0773.m3169("۟ۢ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-21757)) ^ (-1603138553);
                        i6 = 2116473425;
                        break;
                    case 1695030868:
                    case 2028852933:
                        if (!RunnableC3646.f12471) {
                            iM2761 = C0619.m2761("ܳ᩹") ^ i3;
                            i5 = ((iM2761 ^ i4) * 27423) ^ 419001433;
                            i6 = -42885520;
                        } else {
                            iM2761 = (i4 - C0773.m3169("ܽ᩷")) * (-125);
                            i5 = ((iM2761 ^ i3) * 23859) ^ (-652341746);
                            i6 = 376324327;
                        }
                        break;
                    default:
                        view.postDelayed(runnableC11016, 250L);
                        iM3169 = (i3 - C0773.m3169("ۧ۠")) * (-75);
                        i5 = ((iM3169 ^ i4) * 30937) ^ 963631296;
                        i = -2054324279;
                        i7 = iM3169 ^ i;
                        break;
                }
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00e7 A[PHI: r12 r13
      0x00e7: PHI (r12v4 short[]) = (r12v3 short[]), (r12v2 short[]) binds: [B:35:0x00e5, B:9:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x00e7: PHI (r13v4 int) = (r13v3 int), (r13v2 int) binds: [B:35:0x00e5, B:9:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x016d A[PHI: r10
      0x016d: PHI (r10v4 short) = (r10v3 short), (r10v2 short), (r10v2 short), (r10v2 short) binds: [B:46:0x016b, B:17:0x0066, B:15:0x0062, B:12:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x01c3 A[PHI: r2 r3 r7 r8 r9 r14
      0x01c3: PHI (r2v4 java.lang.String) = 
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
      (r2v3 java.lang.String)
      (r2v2 java.lang.String)
     binds: [B:54:0x01c1, B:50:0x01a0, B:31:0x00c3, B:27:0x00a4, B:23:0x0080] A[DONT_GENERATE, DONT_INLINE]
      0x01c3: PHI (r3v3 android.app.Application) = 
      (r3v2 android.app.Application)
      (r3v2 android.app.Application)
      (r3v2 android.app.Application)
      (r3v2 android.app.Application)
      (r3v4 android.app.Application)
     binds: [B:54:0x01c1, B:50:0x01a0, B:31:0x00c3, B:27:0x00a4, B:23:0x0080] A[DONT_GENERATE, DONT_INLINE]
      0x01c3: PHI (r7v4 int) = (r7v3 int), (r7v2 int), (r7v2 int), (r7v2 int), (r7v2 int) binds: [B:54:0x01c1, B:50:0x01a0, B:31:0x00c3, B:27:0x00a4, B:23:0x0080] A[DONT_GENERATE, DONT_INLINE]
      0x01c3: PHI (r8v4 int) = (r8v3 int), (r8v2 int), (r8v2 int), (r8v2 int), (r8v2 int) binds: [B:54:0x01c1, B:50:0x01a0, B:31:0x00c3, B:27:0x00a4, B:23:0x0080] A[DONT_GENERATE, DONT_INLINE]
      0x01c3: PHI (r9v4 int) = (r9v2 int), (r9v3 int), (r9v2 int), (r9v2 int), (r9v2 int) binds: [B:54:0x01c1, B:50:0x01a0, B:31:0x00c3, B:27:0x00a4, B:23:0x0080] A[DONT_GENERATE, DONT_INLINE]
      0x01c3: PHI (r14v4 int) = (r14v2 int), (r14v2 int), (r14v3 int), (r14v2 int), (r14v2 int) binds: [B:54:0x01c1, B:50:0x01a0, B:31:0x00c3, B:27:0x00a4, B:23:0x0080] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x0212 A[PHI: r5 r6
      0x0212: PHI (r5v3 char) = (r5v2 char), (r5v2 char), (r5v5 char) binds: [B:58:0x01f9, B:15:0x0062, B:6:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0212: PHI (r6v4 short) = (r6v3 short), (r6v2 short), (r6v2 short) binds: [B:58:0x01f9, B:15:0x0062, B:6:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0244 A[PHI: r19
      0x0244: PHI (r19v5 short[]) = (r19v4 short[]), (r19v3 short[]), (r19v3 short[]) binds: [B:64:0x0242, B:12:0x005c, B:9:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m49063(BroadcastReceiver broadcastReceiver) {
        int iM3169;
        int i;
        int i2;
        int i3 = C0950.f3488;
        int i4 = C3779.f12953;
        int iM31610 = (C0773.m3169("᩵᩺") ^ i3) * 93;
        int i5 = ((iM31610 ^ i4) * (-13005)) ^ 780307098;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM31610 ^ (-230167096);
        char c = 0;
        short s = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        short s2 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 91752891;
        Application applicationM10096 = null;
        String strM4861 = null;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i4) * (-30879)) >> 31));
            switch (i13) {
                case -1884899876:
                case -1642866930:
                    if (C1146.f4234 < 0) {
                        iM3169 = C0619.m2761("ۤۖ") ^ i3;
                        i = ((iM3169 ^ i4) * (-18131)) ^ (-6359526);
                        i2 = 1170270559;
                    } else {
                        iM3169 = C0773.m3169("᩶ܰ") ^ i3;
                        i = ((iM3169 ^ i4) * (-7257)) ^ (-2040854229);
                        i2 = 1747114818;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1599448578:
                case 462504973:
                    sArr = f68929;
                    if (C20932.f66974 <= 0) {
                        iM3169 = C0619.m2761("ۤۖ") ^ i3;
                        i = ((iM3169 ^ i4) * (-18131)) ^ (-6359526);
                        i2 = 1170270559;
                    } else {
                        iM3169 = C0773.m3169("ܰ۟") ^ i4;
                        i = ((iM3169 ^ i3) * (-5353)) ^ (-171743983);
                        i2 = -251934974;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1557663172:
                case 1243046424:
                    int i14 = s + s2;
                    if (i9 - (i14 * i14) < 0) {
                        iM3169 = C0619.m2761("֨ۨ") ^ i4;
                        i = ((iM3169 ^ i3) * (-11327)) ^ (-1161199043);
                        i2 = -233284393;
                    } else {
                        iM3169 = (C0773.m3169("۬۫") + i3) * 11;
                        i = ((iM3169 ^ i4) * 19309) ^ 658451542;
                        i2 = -2050134642;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1392913480:
                case 290805693:
                    s2 = 1495;
                    if (RunnableC0334.f1808 <= 0) {
                        iM3169 = C0619.m2761("֡ܺ") ^ i3;
                        i = ((iM3169 ^ i4) * (-29705)) ^ 1281389548;
                        i2 = -777662256;
                    } else {
                        iM3169 = C0773.m3169("֫۟") ^ i4;
                        i = ((iM3169 ^ i3) * (-26223)) ^ 613361482;
                        i2 = -1967186530;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1313169392:
                case 1669491189:
                    C7247.m19877(applicationM10096).m19879(broadcastReceiver);
                    break;
                case -1185624994:
                case -101258130:
                    i7 = s * s;
                    i8 = 2235025;
                    if (C2966.f9654 >= 0) {
                        iM3169 = (C0773.m3169("ᩳۖ") + i4) * (-29);
                        i = ((iM3169 ^ i3) * (-12109)) ^ 795364695;
                        i2 = -680268859;
                    } else {
                        iM3169 = (C0619.m2761("ۜܿ") ^ i4) * (-55);
                        i = ((iM3169 ^ i3) * (-29617)) ^ (-540012297);
                        i2 = 65006043;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1048171244:
                case -127963497:
                    s = sArr[c];
                    if (C20932.m47848() != 0) {
                        iM3169 = C0773.m3169("ۖ᩵") ^ i4;
                        i = ((iM3169 ^ i3) * (-28325)) ^ 1933177905;
                        i2 = 1612898135;
                    } else {
                        iM3169 = (C0773.m3169("ۙۢ") + i3) * (-61);
                        i = ((iM3169 ^ i4) * (-18621)) ^ (-1734875157);
                        i2 = 1128018657;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -756309247:
                case -160578477:
                    if (RunnableC3055.f9898 >= 0) {
                        iM3169 = C0619.m2761("֡ܺ") ^ i3;
                        i = ((iM3169 ^ i4) * (-29705)) ^ 1281389548;
                        i2 = -777662256;
                    } else {
                        iM3169 = C0773.m3169("ۖ᩵") ^ i4;
                        i = ((iM3169 ^ i3) * (-28325)) ^ 1933177905;
                        i2 = 1612898135;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -612322399:
                case 1504746310:
                    i10 = 28487;
                    iM3169 = C0773.m3169("ᩳۜ") ^ i4;
                    i = ((iM3169 ^ i3) * (-30961)) ^ (-930529999);
                    i2 = 421141513;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -564784115:
                case 1346468962:
                    C17202.m40379(broadcastReceiver, strM4861);
                    applicationM10096 = C3099.m10096();
                    if (C3492.f12043 <= 0) {
                        iM3169 = (C0773.m3169("ᩳۖ") + i4) * (-29);
                        i = ((iM3169 ^ i3) * (-12109)) ^ 795364695;
                        i2 = -680268859;
                    } else {
                        iM3169 = (i4 - C0773.m3169("ۖۤ")) * (-33);
                        i = ((iM3169 ^ i3) * 22481) ^ 714230033;
                        i2 = 314709128;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -430245694:
                case -81422889:
                    i10 = 12678;
                    iM3169 = C0773.m3169("ᩳۜ") ^ i4;
                    i = ((iM3169 ^ i3) * (-30961)) ^ (-930529999);
                    i2 = 421141513;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -219130644:
                case 1183773509:
                    C1343.m4943();
                    break;
                case -162045394:
                case 333712870:
                    int i15 = i7 + i8;
                    i9 = i15 + i15;
                    if (C2310.m7813() <= 0) {
                        iM3169 = (C0773.m3169("ᩳۖ") + i4) * (-29);
                        i = ((iM3169 ^ i3) * (-12109)) ^ 795364695;
                        i2 = -680268859;
                    } else {
                        iM3169 = (C0773.m3169("ۨᩳ") ^ i3) * (-47);
                        i = ((iM3169 ^ i4) * 26993) ^ (-2077157932);
                        i2 = 777875690;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -16091628:
                case 546436511:
                    if (C3099.f10023 > 0) {
                        iM3169 = C0619.m2761("֡ܺ") ^ i3;
                        i = ((iM3169 ^ i4) * (-29705)) ^ 1281389548;
                        i2 = -777662256;
                    } else {
                        iM3169 = C0619.m2761("ۤۖ") ^ i3;
                        i = ((iM3169 ^ i4) * (-18131)) ^ (-6359526);
                        i2 = 1170270559;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 616330376:
                case 1236953150:
                    C2310.m7813();
                    iM3169 = C0619.m2761("֡ܺ") ^ i3;
                    i = ((iM3169 ^ i4) * (-29705)) ^ 1281389548;
                    i2 = -777662256;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 813793270:
                case 1881534106:
                    sArr2 = f68929;
                    i11 = 178;
                    if (RunnableC1848.f6235) {
                        iM3169 = C0773.m3169("᩶ܰ") ^ i3;
                        i = ((iM3169 ^ i4) * (-7257)) ^ (-2040854229);
                        i2 = 1747114818;
                    } else {
                        iM3169 = (C0773.m3169("֨᩸") ^ i3) * 47;
                        i = ((iM3169 ^ i4) * (-26919)) ^ 1529126846;
                        i2 = -1451347040;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 840380920:
                case 1770564836:
                    i12 = 8;
                    if (C2288.f7433 <= 0) {
                        iM3169 = (C0773.m3169("ᩳۖ") + i4) * (-29);
                        i = ((iM3169 ^ i3) * (-12109)) ^ 795364695;
                        i2 = -680268859;
                    } else {
                        iM3169 = (C0619.m2761("ܿۛ") ^ i4) * (-57);
                        i = ((iM3169 ^ i3) * 10693) ^ 2031989537;
                        i2 = -1954552924;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 931283490:
                case 1146945233:
                    strM4861 = C1321.m4861(sArr2, i11, i12, i10);
                    if (C20932.m47848() != 0) {
                        iM3169 = (C0773.m3169("ᩳۖ") + i4) * (-29);
                        i = ((iM3169 ^ i3) * (-12109)) ^ 795364695;
                        i2 = -680268859;
                    } else {
                        iM3169 = (C0619.m2761("ۡۡ") ^ i3) * 7;
                        i = ((iM3169 ^ i4) * (-28469)) ^ (-1631933735);
                        i2 = -59174311;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                default:
                    c = 177;
                    if (AbstractC0641.f2496 >= 0) {
                        iM3169 = C0773.m3169("ۖ᩵") ^ i4;
                        i = ((iM3169 ^ i3) * (-28325)) ^ 1933177905;
                        i2 = 1612898135;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ۛ᩻")) * (-7);
                        i = ((iM3169 ^ i4) * 12965) ^ (-1279083871);
                        i2 = 475218136;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:65:0x0233  */
    /* JADX WARN: Code duplicated, block: B:75:0x02a9 A[PHI: r7 r8 r11 r12 r13 r19 r24
      0x02a9: PHI (r7v4 android.content.Context) = (r7v2 android.content.Context), (r7v3 android.content.Context), (r7v2 android.content.Context) binds: [B:74:0x02a7, B:52:0x0198, B:44:0x0154] A[DONT_GENERATE, DONT_INLINE]
      0x02a9: PHI (r8v3 java.lang.Object) = (r8v2 java.lang.Object), (r8v2 java.lang.Object), (r8v4 java.lang.Object) binds: [B:74:0x02a7, B:52:0x0198, B:44:0x0154] A[DONT_GENERATE, DONT_INLINE]
      0x02a9: PHI (r11v4 short[]) = (r11v2 short[]), (r11v3 short[]), (r11v2 short[]) binds: [B:74:0x02a7, B:52:0x0198, B:44:0x0154] A[DONT_GENERATE, DONT_INLINE]
      0x02a9: PHI (r12v3 short[]) = (r12v2 short[]), (r12v2 short[]), (r12v4 short[]) binds: [B:74:0x02a7, B:52:0x0198, B:44:0x0154] A[DONT_GENERATE, DONT_INLINE]
      0x02a9: PHI (r13v4 int) = (r13v2 int), (r13v3 int), (r13v2 int) binds: [B:74:0x02a7, B:52:0x0198, B:44:0x0154] A[DONT_GENERATE, DONT_INLINE]
      0x02a9: PHI (r19v4 int) = (r19v3 int), (r19v2 int), (r19v2 int) binds: [B:74:0x02a7, B:52:0x0198, B:44:0x0154] A[DONT_GENERATE, DONT_INLINE]
      0x02a9: PHI (r24v3 short) = (r24v2 short), (r24v1 short), (r24v1 short) binds: [B:74:0x02a7, B:52:0x0198, B:44:0x0154] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:79:0x02df A[PHI: r18 r22
      0x02df: PHI (r18v4 int) = (r18v3 int), (r18v2 int), (r18v2 int), (r18v2 int) binds: [B:78:0x02dd, B:18:0x00a6, B:15:0x009b, B:8:0x0075] A[DONT_GENERATE, DONT_INLINE]
      0x02df: PHI (r22v7 short) = (r22v6 short), (r22v5 short), (r22v5 short), (r22v5 short) binds: [B:78:0x02dd, B:18:0x00a6, B:15:0x009b, B:8:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:83:0x0313 A[PHI: r17
      0x0313: PHI (r17v4 char) = (r17v3 char), (r17v2 char) binds: [B:82:0x0311, B:8:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:87:0x0344 A[PHI: r9 r16
      0x0344: PHI (r9v4 java.lang.String) = (r9v2 java.lang.String), (r9v3 java.lang.String), (r9v2 java.lang.String), (r9v2 java.lang.String) binds: [B:86:0x0342, B:40:0x012d, B:15:0x009b, B:11:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x0344: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:86:0x0342, B:40:0x012d, B:15:0x009b, B:11:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:91:0x0374 A[PHI: r14
      0x0374: PHI (r14v4 int) = (r14v2 int), (r14v3 int), (r14v2 int), (r14v2 int), (r14v2 int) binds: [B:90:0x0372, B:48:0x0173, B:36:0x010a, B:20:0x00aa, B:18:0x00a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m49089(final int i, final View view) {
        int iM2761;
        int i2;
        int i3;
        int i4 = C1542.f5343;
        int i5 = C1783.f6087;
        int iM2762 = (C0619.m2761("᩵᩶") ^ i5) * (-85);
        int i6 = ((iM2762 ^ i4) * (-17341)) ^ (-957316627);
        int i7 = iM2762 ^ (-2126748742);
        String strM6233 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        char c = 0;
        int i11 = 0;
        int i12 = 0;
        short s = 0;
        int i13 = 646407122;
        short s2 = 0;
        Context contextM12922 = null;
        Object objM53416 = null;
        int i14 = 0;
        int i15 = i7;
        long j = 0;
        while (true) {
            i13 = i15 ^ (i6 & (((i13 ^ i4) * 23193) >> 31));
            switch (i13) {
                case -2061850921:
                case -1250198604:
                    c = 596;
                    if (C3099.m10095()) {
                        iM2761 = C0619.m2761("ᩴۙ") ^ i5;
                        i2 = ((iM2761 ^ i4) * 28973) ^ (-543290724);
                        i3 = 548484126;
                    } else {
                        iM2761 = (i4 - C0619.m2761("᩺֫")) * (-115);
                        i2 = ((iM2761 ^ i5) * (-23699)) ^ (-2140303605);
                        i3 = -242391784;
                    }
                    int i16 = i2;
                    i15 = iM2761 ^ i3;
                    i6 = i16;
                    break;
                case -1973515249:
                case -1627750349:
                    view.postDelayed(new Runnable() { // from class: l.ܰ᩷ۧ
                        {
                            int i17 = -1451352682;
                            int i18 = C20932.f66974;
                            int i19 = RunnableC0334.f1808;
                            int iM3169 = (i18 - C0773.m3169("ܺۚ")) * 75;
                            int i20 = ((iM3169 ^ i19) * 8323) ^ 1519417509;
                            int i21 = -1434710993;
                            while (true) {
                                i17 = ((((i17 ^ i19) * 5223) >> 31) & i20) ^ (iM3169 ^ i21);
                                switch (i17) {
                                    case -1934555899:
                                    case 517841740:
                                        C1146.m4231();
                                        if (!C2023.f6737) {
                                            iM3169 = (i19 - C0773.m3169("ܳ۟")) * 85;
                                            i20 = ((iM3169 ^ i18) * (-4155)) ^ (-1332091365);
                                            i21 = 344907060;
                                        } else {
                                            iM3169 = (i18 - C0773.m3169("۬ۖ")) * 11;
                                            i20 = ((iM3169 ^ i19) * 10977) ^ (-997500212);
                                            i21 = -1646301915;
                                        }
                                        break;
                                    case -1618838104:
                                    case 312913470:
                                        RunnableC3646.m11813();
                                        C3779.m12264();
                                        throw new RuntimeException();
                                    case -1602889023:
                                    case -798153194:
                                        if (C1542.f5343 <= 0) {
                                            iM3169 = (i19 - C0773.m3169("ܳ۟")) * 85;
                                            i20 = ((iM3169 ^ i18) * (-4155)) ^ (-1332091365);
                                            i21 = 344907060;
                                        } else {
                                            iM3169 = C0619.m2761("ۧ᩵") ^ i19;
                                            i20 = ((iM3169 ^ i18) * 19219) ^ 347536038;
                                            i21 = 372026322;
                                        }
                                        break;
                                    case -1436347627:
                                    case 600250232:
                                        if (AbstractC3624.f12429 <= 0) {
                                            iM3169 = C0619.m2761("᩷᩶") ^ i19;
                                            i20 = ((iM3169 ^ i18) * (-19109)) ^ (-1266424223);
                                            i21 = -1438724680;
                                        } else {
                                            iM3169 = (i18 - C0773.m3169("֫᩻")) * (-89);
                                            i20 = ((iM3169 ^ i19) * 17409) ^ 153303868;
                                            i21 = -259456684;
                                        }
                                        break;
                                    case -1359979058:
                                    case 1576816283:
                                        if (RunnableC3646.f12471) {
                                            iM3169 = (C0619.m2761("ۤ᩵") + i19) * (-123);
                                            i20 = ((iM3169 ^ i18) * 15637) ^ (-303703168);
                                            i21 = -1594081435;
                                        } else {
                                            iM3169 = (i18 - C0619.m2761("ۧܽ")) * 85;
                                            i20 = ((iM3169 ^ i19) * (-17605)) ^ 1622640471;
                                            i21 = 1135099882;
                                        }
                                        break;
                                    case -1213806357:
                                    case 1711341497:
                                        if (C2702.f8586 <= 0) {
                                            iM3169 = (i19 - C0773.m3169("ܳ۟")) * 85;
                                            i20 = ((iM3169 ^ i18) * (-4155)) ^ (-1332091365);
                                            i21 = 344907060;
                                        } else {
                                            iM3169 = (C0619.m2761("۠ۚ") ^ i19) * (-41);
                                            i20 = ((iM3169 ^ i18) * 10293) ^ (-445476299);
                                            i21 = 534547488;
                                        }
                                        break;
                                    case -855775861:
                                    case 1923350834:
                                        C3779.m12264();
                                        if (!C2878.f9462) {
                                            iM3169 = C0619.m2761("ۛ۫") ^ i18;
                                            i20 = ((iM3169 ^ i19) * (-23713)) ^ 341976296;
                                            i21 = -246778529;
                                        } else {
                                            iM3169 = C0619.m2761("᩷᩶") ^ i19;
                                            i20 = ((iM3169 ^ i18) * (-19109)) ^ (-1266424223);
                                            i21 = -1438724680;
                                        }
                                        break;
                                    case -611948886:
                                    case 1093842116:
                                        C2354.m7983();
                                        C23916.m53419();
                                        iM3169 = C0619.m2761("᩷᩶") ^ i19;
                                        i20 = ((iM3169 ^ i18) * (-19109)) ^ (-1266424223);
                                        i21 = -1438724680;
                                        break;
                                    case -507131930:
                                    case 1260156684:
                                        if (C0950.f3488 < 0) {
                                            iM3169 = (i19 - C0773.m3169("ܳ۟")) * 85;
                                            i20 = ((iM3169 ^ i18) * (-4155)) ^ (-1332091365);
                                            i21 = 344907060;
                                        } else {
                                            iM3169 = C0619.m2761("᩷᩶") ^ i19;
                                            i20 = ((iM3169 ^ i18) * (-19109)) ^ (-1266424223);
                                            i21 = -1438724680;
                                        }
                                        break;
                                    case -274885337:
                                    case 1438381223:
                                        if (RunnableC1848.f6235) {
                                            iM3169 = C0619.m2761("᩷᩶") ^ i19;
                                            i20 = ((iM3169 ^ i18) * (-19109)) ^ (-1266424223);
                                            i21 = -1438724680;
                                        } else {
                                            iM3169 = C0619.m2761("֫ۤ") ^ i19;
                                            i20 = ((iM3169 ^ i18) * (-7043)) ^ 765049144;
                                            i21 = -826149613;
                                        }
                                        break;
                                    case 42877114:
                                    case 1981619921:
                                        if (C3998.f13671 != 0) {
                                            iM3169 = (i19 - C0773.m3169("ܳ۟")) * 85;
                                            i20 = ((iM3169 ^ i18) * (-4155)) ^ (-1332091365);
                                            i21 = 344907060;
                                        } else {
                                            iM3169 = C0773.m3169("ᩴ᩷") ^ i18;
                                            i20 = ((iM3169 ^ i19) * 30945) ^ (-1948362757);
                                            i21 = -1654042899;
                                        }
                                        break;
                                    case 596878707:
                                    case 2004950905:
                                        if (C2878.m9491() <= 0) {
                                            iM3169 = (i18 - C0773.m3169("۬ۖ")) * 11;
                                            i20 = ((iM3169 ^ i19) * 10977) ^ (-997500212);
                                            i21 = -1646301915;
                                        } else {
                                            iM3169 = C0619.m2761("ۛᩴ") ^ i19;
                                            i20 = ((iM3169 ^ i18) * (-31221)) ^ 1478558739;
                                            i21 = 466572835;
                                        }
                                        break;
                                    case 743362566:
                                    case 1912847803:
                                        return;
                                    case 779109909:
                                    case 1390691255:
                                        if (C0619.m2763()) {
                                            iM3169 = (C0619.m2761("ۤ᩵") + i19) * (-123);
                                            i20 = ((iM3169 ^ i18) * 15637) ^ (-303703168);
                                            i21 = -1594081435;
                                        } else {
                                            iM3169 = C0773.m3169("ᩴᩳ") ^ i18;
                                            i20 = ((iM3169 ^ i19) * 21181) ^ 1657066652;
                                            i21 = 1489779521;
                                        }
                                        break;
                                    case 1584992168:
                                    case 2076149411:
                                        if (C2966.f9654 >= 0) {
                                            iM3169 = C0619.m2761("ۛ۫") ^ i18;
                                            i20 = ((iM3169 ^ i19) * (-23713)) ^ 341976296;
                                            i21 = -246778529;
                                        } else {
                                            iM3169 = (i18 - C0619.m2761("᩻ۧ")) * (-39);
                                            i20 = ((iM3169 ^ i19) * 21137) ^ 1958170921;
                                            i21 = -616671984;
                                        }
                                        break;
                                    default:
                                        if (C2419.m8174() >= 0) {
                                            iM3169 = (i19 - C0773.m3169("ܳ۟")) * 85;
                                            i20 = ((iM3169 ^ i18) * (-4155)) ^ (-1332091365);
                                            i21 = 344907060;
                                        } else {
                                            iM3169 = (C0773.m3169("᩵ܰ") + i19) * (-17);
                                            i20 = ((iM3169 ^ i18) * 20461) ^ 1308320482;
                                            i21 = -1057390856;
                                        }
                                        break;
                                }
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C21576.m49060(i, view);
                        }
                    }, j);
                    break;
                case -1935675000:
                case 1436419326:
                    C3492.m11488();
                    if (C20932.m47848() != 0) {
                        iM2761 = (i5 - C0773.m3169("ۡ᩸")) * 41;
                        i2 = ((iM2761 ^ i4) * 22947) ^ 178849322;
                        i3 = -693521727;
                    } else {
                        iM2761 = (i4 - C0619.m2761("ᩳ᩹")) * 123;
                        i2 = ((iM2761 ^ i5) * 10155) ^ (-258868757);
                        i3 = -618499088;
                    }
                    int i17 = i2;
                    i15 = iM2761 ^ i3;
                    i6 = i17;
                    break;
                case -1772743170:
                case -1754224667:
                    contextM12922 = C3998.m12922(view);
                    sArr2 = f68929;
                    i9 = 597;
                    if (C3779.f12953 <= 0) {
                        iM2761 = (C0773.m3169("ᩳ֨") + i4) * 25;
                        i2 = ((iM2761 ^ i5) * 24677) ^ (-1549315738);
                        i3 = -1965439896;
                    } else {
                        iM2761 = (C0619.m2761("ܰۧ") ^ i4) * (-125);
                        i2 = ((iM2761 ^ i5) * (-5349)) ^ 657467511;
                        i3 = 2023024111;
                    }
                    int i18 = i2;
                    i15 = iM2761 ^ i3;
                    i6 = i18;
                    break;
                case -1746866275:
                case -1543209511:
                    break;
                case -1721182383:
                case 1787854974:
                    i12 = i11 + 66064384;
                    s2 = 16256;
                    if (C2485.m8357() <= 0) {
                        iM2761 = (C0773.m3169("ᩳ֨") + i4) * 25;
                        i2 = ((iM2761 ^ i5) * 24677) ^ (-1549315738);
                        i3 = -1965439896;
                    } else {
                        iM2761 = C0773.m3169("ܰܶ") ^ i4;
                        i2 = ((iM2761 ^ i5) * 27889) ^ (-583857985);
                        i3 = -756614296;
                    }
                    int i19 = i2;
                    i15 = iM2761 ^ i3;
                    i6 = i19;
                    break;
                case -1690117678:
                case -1146668379:
                    RunnableC3646.m11813();
                    iM2761 = (i5 - C0773.m3169("ۡ᩸")) * 41;
                    i2 = ((iM2761 ^ i4) * 22947) ^ 178849322;
                    i3 = -693521727;
                    int i110 = i2;
                    i15 = iM2761 ^ i3;
                    i6 = i110;
                    break;
                case -1685594814:
                case 1739860961:
                    if (i12 - (s * s2) >= 0) {
                        iM2761 = C0619.m2761("ܶۚ") ^ i5;
                        i2 = ((iM2761 ^ i4) * (-26955)) ^ (-1042067577);
                        i3 = 493685998;
                    } else {
                        iM2761 = C0773.m3169("ۢۗ") ^ i4;
                        i2 = ((iM2761 ^ i5) * (-13433)) ^ 1922744345;
                        i3 = -5319936;
                    }
                    int i111 = i2;
                    i15 = iM2761 ^ i3;
                    i6 = i111;
                    break;
                case -1628014163:
                case 1465484156:
                    i8 = 45479;
                    iM2761 = C0619.m2761("ۨۛ") ^ i5;
                    i2 = ((iM2761 ^ i4) * 30633) ^ 1230052017;
                    i3 = -1692704519;
                    int i112 = i2;
                    i15 = iM2761 ^ i3;
                    i6 = i112;
                    break;
                case -1610242127:
                case 1023365724:
                    if (C2834.f9334 > 0) {
                        iM2761 = (i4 - C0619.m2761("ᩳ᩹")) * 123;
                        i2 = ((iM2761 ^ i5) * 10155) ^ (-258868757);
                        i3 = -618499088;
                    } else {
                        iM2761 = C0619.m2761("ᩴۙ") ^ i5;
                        i2 = ((iM2761 ^ i4) * 28973) ^ (-543290724);
                        i3 = 548484126;
                    }
                    int i113 = i2;
                    i15 = iM2761 ^ i3;
                    i6 = i113;
                    break;
                case -1392550388:
                case -390644233:
                    C1080.m4050();
                    if (C1564.f5401 <= 0) {
                        iM2761 = (i4 - C0619.m2761("ᩳ᩹")) * 123;
                        i2 = ((iM2761 ^ i5) * 10155) ^ (-258868757);
                        i3 = -618499088;
                    } else {
                        iM2761 = (C0619.m2761("ᩴۚ") + i4) * 75;
                        i2 = ((iM2761 ^ i5) * (-5781)) ^ (-52759578);
                        i3 = 202014670;
                    }
                    int i114 = i2;
                    i15 = iM2761 ^ i3;
                    i6 = i114;
                    break;
                case -1275739564:
                case 1392789182:
                    i10 = 12;
                    if (C4238.f15451 >= 0) {
                        iM2761 = (i5 - C0773.m3169("ۡ᩸")) * 41;
                        i2 = ((iM2761 ^ i4) * 22947) ^ 178849322;
                        i3 = -693521727;
                    } else {
                        iM2761 = (i5 - C0773.m3169("ۖ᩺")) * (-77);
                        i2 = ((iM2761 ^ i4) * 14145) ^ 1262261967;
                        i3 = 1496111177;
                    }
                    int i115 = i2;
                    i15 = iM2761 ^ i3;
                    i6 = i115;
                    break;
                case -1227895015:
                case -722224887:
                    i8 = 53355;
                    iM2761 = C0619.m2761("ۨۛ") ^ i5;
                    i2 = ((iM2761 ^ i4) * 30633) ^ 1230052017;
                    i3 = -1692704519;
                    int i116 = i2;
                    i15 = iM2761 ^ i3;
                    i6 = i116;
                    break;
                case -1021050985:
                case 1110428288:
                    if (C0862.m3505(view)) {
                        iM2761 = (C0619.m2761("ۜۜ") ^ i5) * 71;
                        i2 = ((iM2761 ^ i4) * (-24127)) ^ 1773695731;
                        i3 = 1145778263;
                    } else {
                        iM2761 = C0619.m2761("᩵ۨ") ^ i5;
                        i2 = ((iM2761 ^ i4) * (-25577)) ^ 1217674827;
                        i3 = -298635460;
                    }
                    int i117 = i2;
                    i15 = iM2761 ^ i3;
                    i6 = i117;
                    break;
                case -868984519:
                case -83588633:
                    s = sArr[c];
                    i11 = s * s;
                    if (C2310.m7813() <= 0) {
                        iM2761 = (i4 - C0619.m2761("ᩳ᩹")) * 123;
                        i2 = ((iM2761 ^ i5) * 10155) ^ (-258868757);
                        i3 = -618499088;
                    } else {
                        iM2761 = C0619.m2761("ۙۤ") ^ i5;
                        i2 = ((iM2761 ^ i4) * (-20231)) ^ 2043226950;
                        i3 = 547631779;
                    }
                    int i118 = i2;
                    i15 = iM2761 ^ i3;
                    i6 = i118;
                    break;
                case -856551651:
                case 72021572:
                    sArr = f68929;
                    if (C3779.f12953 <= 0) {
                        iM2761 = (C0619.m2761("ᩴۚ") + i4) * 75;
                        i2 = ((iM2761 ^ i5) * (-5781)) ^ (-52759578);
                        i3 = 202014670;
                    } else {
                        iM2761 = (i4 - C0773.m3169("ܽ۠")) * (-41);
                        i2 = ((iM2761 ^ i5) * (-22973)) ^ (-930557144);
                        i3 = -1979303653;
                    }
                    int i119 = i2;
                    i15 = iM2761 ^ i3;
                    i6 = i119;
                    break;
                case -832224726:
                case -139522721:
                    objM53416 = C23916.m53416(contextM12922, AbstractC0641.m2820(sArr2, i9, i10, i8));
                    sArr3 = f68929;
                    if (AbstractC3624.f12429 <= 0) {
                        iM2761 = (C0773.m3169("ᩳ֨") + i4) * 25;
                        i2 = ((iM2761 ^ i5) * 24677) ^ (-1549315738);
                        i3 = -1965439896;
                    } else {
                        iM2761 = (C0773.m3169("ۜۡ") + i4) * 31;
                        i2 = ((iM2761 ^ i5) * 15235) ^ (-1010402517);
                        i3 = -870229714;
                    }
                    int i1110 = i2;
                    i15 = iM2761 ^ i3;
                    i6 = i1110;
                    break;
                case -791261459:
                case 700201224:
                    j = 100;
                    i14 = 3;
                    if (view.hasWindowFocus()) {
                        iM2761 = C0773.m3169("᩺ۧ") ^ i5;
                        i2 = ((iM2761 ^ i4) * 561) ^ 1368409308;
                        i3 = -597604443;
                    } else {
                        iM2761 = (i4 - C0619.m2761("᩻᩻")) * (-51);
                        i2 = ((iM2761 ^ i5) * 23869) ^ 635315139;
                        i3 = -1881935880;
                    }
                    int i1111 = i2;
                    i15 = iM2761 ^ i3;
                    i6 = i1111;
                    break;
                case -785394180:
                case 1956554844:
                    if (view.isFocused()) {
                        iM2761 = (C0619.m2761("ۜۜ") ^ i5) * 71;
                        i2 = ((iM2761 ^ i4) * (-24127)) ^ 1773695731;
                        i3 = 1145778263;
                    } else {
                        iM2761 = (C0773.m3169("᩹᩻") + i4) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i2 = ((iM2761 ^ i5) * (-1039)) ^ (-895625926);
                        i3 = -600599221;
                    }
                    int i1112 = i2;
                    i15 = iM2761 ^ i3;
                    i6 = i1112;
                    break;
                case -627862617:
                case 994740889:
                    if (C3998.f13671 != 0) {
                        iM2761 = (i5 - C0773.m3169("ۡ᩸")) * 41;
                        i2 = ((iM2761 ^ i4) * 22947) ^ 178849322;
                        i3 = -693521727;
                    } else {
                        iM2761 = (C0619.m2761("ܽۜ") + i5) * 67;
                        i2 = ((iM2761 ^ i4) * 8417) ^ (-583250742);
                        i3 = 1874769563;
                    }
                    int i1113 = i2;
                    i15 = iM2761 ^ i3;
                    i6 = i1113;
                    break;
                case -595239801:
                case 1461480429:
                    if (i <= 0) {
                        iM2761 = (C0773.m3169("۠ܰ") ^ i5) * 119;
                        i2 = ((iM2761 ^ i4) * 6339) ^ 946180485;
                        i3 = -1113354307;
                    } else {
                        iM2761 = C0619.m2761("᩵ۨ") ^ i5;
                        i2 = ((iM2761 ^ i4) * (-25577)) ^ 1217674827;
                        i3 = -298635460;
                    }
                    int i1114 = i2;
                    i15 = iM2761 ^ i3;
                    i6 = i1114;
                    break;
                case -451938178:
                case 1299344407:
                    view.postDelayed(new Runnable() { // from class: l.ܰ᩷ۧ
                        {
                            int i120 = -1451352682;
                            int i121 = C20932.f66974;
                            int i122 = RunnableC0334.f1808;
                            int iM3169 = (i121 - C0773.m3169("ܺۚ")) * 75;
                            int i20 = ((iM3169 ^ i122) * 8323) ^ 1519417509;
                            int i21 = -1434710993;
                            while (true) {
                                i120 = ((((i120 ^ i122) * 5223) >> 31) & i20) ^ (iM3169 ^ i21);
                                switch (i120) {
                                    case -1934555899:
                                    case 517841740:
                                        C1146.m4231();
                                        if (!C2023.f6737) {
                                            iM3169 = (i122 - C0773.m3169("ܳ۟")) * 85;
                                            i20 = ((iM3169 ^ i121) * (-4155)) ^ (-1332091365);
                                            i21 = 344907060;
                                        } else {
                                            iM3169 = (i121 - C0773.m3169("۬ۖ")) * 11;
                                            i20 = ((iM3169 ^ i122) * 10977) ^ (-997500212);
                                            i21 = -1646301915;
                                        }
                                        break;
                                    case -1618838104:
                                    case 312913470:
                                        RunnableC3646.m11813();
                                        C3779.m12264();
                                        throw new RuntimeException();
                                    case -1602889023:
                                    case -798153194:
                                        if (C1542.f5343 <= 0) {
                                            iM3169 = (i122 - C0773.m3169("ܳ۟")) * 85;
                                            i20 = ((iM3169 ^ i121) * (-4155)) ^ (-1332091365);
                                            i21 = 344907060;
                                        } else {
                                            iM3169 = C0619.m2761("ۧ᩵") ^ i122;
                                            i20 = ((iM3169 ^ i121) * 19219) ^ 347536038;
                                            i21 = 372026322;
                                        }
                                        break;
                                    case -1436347627:
                                    case 600250232:
                                        if (AbstractC3624.f12429 <= 0) {
                                            iM3169 = C0619.m2761("᩷᩶") ^ i122;
                                            i20 = ((iM3169 ^ i121) * (-19109)) ^ (-1266424223);
                                            i21 = -1438724680;
                                        } else {
                                            iM3169 = (i121 - C0773.m3169("֫᩻")) * (-89);
                                            i20 = ((iM3169 ^ i122) * 17409) ^ 153303868;
                                            i21 = -259456684;
                                        }
                                        break;
                                    case -1359979058:
                                    case 1576816283:
                                        if (RunnableC3646.f12471) {
                                            iM3169 = (C0619.m2761("ۤ᩵") + i122) * (-123);
                                            i20 = ((iM3169 ^ i121) * 15637) ^ (-303703168);
                                            i21 = -1594081435;
                                        } else {
                                            iM3169 = (i121 - C0619.m2761("ۧܽ")) * 85;
                                            i20 = ((iM3169 ^ i122) * (-17605)) ^ 1622640471;
                                            i21 = 1135099882;
                                        }
                                        break;
                                    case -1213806357:
                                    case 1711341497:
                                        if (C2702.f8586 <= 0) {
                                            iM3169 = (i122 - C0773.m3169("ܳ۟")) * 85;
                                            i20 = ((iM3169 ^ i121) * (-4155)) ^ (-1332091365);
                                            i21 = 344907060;
                                        } else {
                                            iM3169 = (C0619.m2761("۠ۚ") ^ i122) * (-41);
                                            i20 = ((iM3169 ^ i121) * 10293) ^ (-445476299);
                                            i21 = 534547488;
                                        }
                                        break;
                                    case -855775861:
                                    case 1923350834:
                                        C3779.m12264();
                                        if (!C2878.f9462) {
                                            iM3169 = C0619.m2761("ۛ۫") ^ i121;
                                            i20 = ((iM3169 ^ i122) * (-23713)) ^ 341976296;
                                            i21 = -246778529;
                                        } else {
                                            iM3169 = C0619.m2761("᩷᩶") ^ i122;
                                            i20 = ((iM3169 ^ i121) * (-19109)) ^ (-1266424223);
                                            i21 = -1438724680;
                                        }
                                        break;
                                    case -611948886:
                                    case 1093842116:
                                        C2354.m7983();
                                        C23916.m53419();
                                        iM3169 = C0619.m2761("᩷᩶") ^ i122;
                                        i20 = ((iM3169 ^ i121) * (-19109)) ^ (-1266424223);
                                        i21 = -1438724680;
                                        break;
                                    case -507131930:
                                    case 1260156684:
                                        if (C0950.f3488 < 0) {
                                            iM3169 = (i122 - C0773.m3169("ܳ۟")) * 85;
                                            i20 = ((iM3169 ^ i121) * (-4155)) ^ (-1332091365);
                                            i21 = 344907060;
                                        } else {
                                            iM3169 = C0619.m2761("᩷᩶") ^ i122;
                                            i20 = ((iM3169 ^ i121) * (-19109)) ^ (-1266424223);
                                            i21 = -1438724680;
                                        }
                                        break;
                                    case -274885337:
                                    case 1438381223:
                                        if (RunnableC1848.f6235) {
                                            iM3169 = C0619.m2761("᩷᩶") ^ i122;
                                            i20 = ((iM3169 ^ i121) * (-19109)) ^ (-1266424223);
                                            i21 = -1438724680;
                                        } else {
                                            iM3169 = C0619.m2761("֫ۤ") ^ i122;
                                            i20 = ((iM3169 ^ i121) * (-7043)) ^ 765049144;
                                            i21 = -826149613;
                                        }
                                        break;
                                    case 42877114:
                                    case 1981619921:
                                        if (C3998.f13671 != 0) {
                                            iM3169 = (i122 - C0773.m3169("ܳ۟")) * 85;
                                            i20 = ((iM3169 ^ i121) * (-4155)) ^ (-1332091365);
                                            i21 = 344907060;
                                        } else {
                                            iM3169 = C0773.m3169("ᩴ᩷") ^ i121;
                                            i20 = ((iM3169 ^ i122) * 30945) ^ (-1948362757);
                                            i21 = -1654042899;
                                        }
                                        break;
                                    case 596878707:
                                    case 2004950905:
                                        if (C2878.m9491() <= 0) {
                                            iM3169 = (i121 - C0773.m3169("۬ۖ")) * 11;
                                            i20 = ((iM3169 ^ i122) * 10977) ^ (-997500212);
                                            i21 = -1646301915;
                                        } else {
                                            iM3169 = C0619.m2761("ۛᩴ") ^ i122;
                                            i20 = ((iM3169 ^ i121) * (-31221)) ^ 1478558739;
                                            i21 = 466572835;
                                        }
                                        break;
                                    case 743362566:
                                    case 1912847803:
                                        return;
                                    case 779109909:
                                    case 1390691255:
                                        if (C0619.m2763()) {
                                            iM3169 = (C0619.m2761("ۤ᩵") + i122) * (-123);
                                            i20 = ((iM3169 ^ i121) * 15637) ^ (-303703168);
                                            i21 = -1594081435;
                                        } else {
                                            iM3169 = C0773.m3169("ᩴᩳ") ^ i121;
                                            i20 = ((iM3169 ^ i122) * 21181) ^ 1657066652;
                                            i21 = 1489779521;
                                        }
                                        break;
                                    case 1584992168:
                                    case 2076149411:
                                        if (C2966.f9654 >= 0) {
                                            iM3169 = C0619.m2761("ۛ۫") ^ i121;
                                            i20 = ((iM3169 ^ i122) * (-23713)) ^ 341976296;
                                            i21 = -246778529;
                                        } else {
                                            iM3169 = (i121 - C0619.m2761("᩻ۧ")) * (-39);
                                            i20 = ((iM3169 ^ i122) * 21137) ^ 1958170921;
                                            i21 = -616671984;
                                        }
                                        break;
                                    default:
                                        if (C2419.m8174() >= 0) {
                                            iM3169 = (i122 - C0773.m3169("ܳ۟")) * 85;
                                            i20 = ((iM3169 ^ i121) * (-4155)) ^ (-1332091365);
                                            i21 = 344907060;
                                        } else {
                                            iM3169 = (C0773.m3169("᩵ܰ") + i122) * (-17);
                                            i20 = ((iM3169 ^ i121) * 20461) ^ 1308320482;
                                            i21 = -1057390856;
                                        }
                                        break;
                                }
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C21576.m49060(i, view);
                        }
                    }, j);
                    iM2761 = C0619.m2761("᩵ۨ") ^ i5;
                    i2 = ((iM2761 ^ i4) * (-25577)) ^ 1217674827;
                    i3 = -298635460;
                    int i1115 = i2;
                    i15 = iM2761 ^ i3;
                    i6 = i1115;
                    break;
                case 785482561:
                case 1595658785:
                    strM6233 = C1783.m6233(sArr3, 609, 80, i8);
                    if (C2310.f7472 >= 0) {
                        iM2761 = (C0619.m2761("ᩴۚ") + i4) * 75;
                        i2 = ((iM2761 ^ i5) * (-5781)) ^ (-52759578);
                        i3 = 202014670;
                    } else {
                        iM2761 = (C0773.m3169("ۨ᩻") + i4) * (-43);
                        i2 = ((iM2761 ^ i5) * (-6061)) ^ 2036498170;
                        i3 = -403849537;
                    }
                    int i1116 = i2;
                    i15 = iM2761 ^ i3;
                    i6 = i1116;
                    break;
                case 882321110:
                case 2143618157:
                    C0269.m1775();
                    break;
                case 916273049:
                case 1750195101:
                    if (i < i14) {
                        iM2761 = C0773.m3169("ܶ۫") ^ i4;
                        i2 = ((iM2761 ^ i5) * (-26635)) ^ (-1702105326);
                        i3 = -1402020313;
                    } else {
                        iM2761 = C0619.m2761("᩵ۨ") ^ i5;
                        i2 = ((iM2761 ^ i4) * (-25577)) ^ 1217674827;
                        i3 = -298635460;
                    }
                    int i1117 = i2;
                    i15 = iM2761 ^ i3;
                    i6 = i1117;
                    break;
                case 1124418173:
                case 1236590474:
                    if (((InputMethodManager) objM53416).showSoftInput(view, 0)) {
                        iM2761 = C0619.m2761("᩵ۨ") ^ i5;
                        i2 = ((iM2761 ^ i4) * (-25577)) ^ 1217674827;
                        i3 = -298635460;
                    } else {
                        iM2761 = C0619.m2761("֡᩵") ^ i4;
                        i2 = ((iM2761 ^ i5) * (-569)) ^ (-906498874);
                        i3 = 2147237697;
                    }
                    int i1118 = i2;
                    i15 = iM2761 ^ i3;
                    i6 = i1118;
                    break;
                case 1266807124:
                case 1507994825:
                    C15243.m36587(objM53416, strM6233);
                    if (C3492.f12043 <= 0) {
                        iM2761 = (i5 - C0773.m3169("ۡ᩸")) * 41;
                        i2 = ((iM2761 ^ i4) * 22947) ^ 178849322;
                        i3 = -693521727;
                    } else {
                        iM2761 = C0619.m2761("᩺ۨ") ^ i5;
                        i2 = ((iM2761 ^ i4) * 7173) ^ (-2113662541);
                        i3 = 154275877;
                    }
                    int i1119 = i2;
                    i15 = iM2761 ^ i3;
                    i6 = i1119;
                    break;
                case 1787193101:
                case 2016337026:
                    if (AbstractC0641.f2496 < 0) {
                        iM2761 = (C0619.m2761("ᩴۚ") + i4) * 75;
                        i2 = ((iM2761 ^ i5) * (-5781)) ^ (-52759578);
                        i3 = 202014670;
                    } else {
                        iM2761 = (C0619.m2761("֨ܶ") ^ i5) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i2 = ((iM2761 ^ i4) * 26905) ^ 1362193039;
                        i3 = -95772081;
                    }
                    int i11110 = i2;
                    i15 = iM2761 ^ i3;
                    i6 = i11110;
                    break;
                default:
                    if (i < i14) {
                        iM2761 = C0619.m2761("ۢۙ") ^ i5;
                        i2 = ((iM2761 ^ i4) * (-27471)) ^ 1425178849;
                        i3 = -724683278;
                    } else {
                        iM2761 = C0619.m2761("᩵ۨ") ^ i5;
                        i2 = ((iM2761 ^ i4) * (-25577)) ^ 1217674827;
                        i3 = -298635460;
                    }
                    int i11111 = i2;
                    i15 = iM2761 ^ i3;
                    i6 = i11111;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49060(int i, View view) {
        int i2 = 553319678;
        int i3 = C1080.f3865;
        int i4 = C0487.f2131;
        int iM2761 = C0619.m2761("ۧܶ") ^ i3;
        int i5 = ((iM2761 ^ i4) * 12339) ^ (-2033909429);
        int i6 = 490879234;
        while (true) {
            i2 = ((((i2 ^ i4) * 25425) >> 31) & i5) ^ (iM2761 ^ i6);
            switch (i2) {
                case -2075068336:
                case 379909145:
                    if (C4238.m13540() <= 0) {
                        iM2761 = C0773.m3169("᩷᩵") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-22179)) ^ (-1946507811);
                        i6 = -168143082;
                    } else {
                        iM2761 = (C0773.m3169("ۜ۫") ^ i3) * (-77);
                        i5 = ((iM2761 ^ i4) * 29831) ^ (-1593143239);
                        i6 = -567789536;
                    }
                    break;
                case -1838671029:
                case 782192416:
                    C20932.m47848();
                    iM2761 = C0619.m2761("֫ۜ") ^ i4;
                    i5 = ((iM2761 ^ i3) * 25953) ^ 1467221962;
                    i6 = 789793785;
                    break;
                case -1792782721:
                case -622472270:
                    if (view.isFocused()) {
                        iM2761 = (C0773.m3169("᩹ۘ") + i4) * (-97);
                        i5 = ((iM2761 ^ i3) * (-26959)) ^ (-11999523);
                        i6 = -667498966;
                    } else {
                        iM2761 = C0619.m2761("ܶۨ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-5471)) ^ (-1241823165);
                        i6 = 271835487;
                    }
                    break;
                case -1650773741:
                case 194002508:
                    C2485.m8357();
                    if (C1080.f3865 < 0) {
                        iM2761 = (C0773.m3169("ۙۖ") ^ i4) * (-111);
                        i5 = ((iM2761 ^ i3) * (-23997)) ^ 1299463438;
                        i6 = 636100436;
                    } else {
                        iM2761 = C0619.m2761("֫ۜ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 25953) ^ 1467221962;
                        i6 = 789793785;
                    }
                    break;
                case -1326274447:
                case -393983275:
                    if (C0619.f2439) {
                        iM2761 = C0773.m3169("᩷᩵") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-22179)) ^ (-1946507811);
                        i6 = -168143082;
                    } else {
                        iM2761 = C0619.m2761("ܳ᩻") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-19907)) ^ (-904691535);
                        i6 = 30755497;
                    }
                    break;
                case -1306921539:
                case -123146814:
                    if (RunnableC3055.f9898 >= 0) {
                        iM2761 = (C0773.m3169("ۙۖ") ^ i4) * (-111);
                        i5 = ((iM2761 ^ i3) * (-23997)) ^ 1299463438;
                        i6 = 636100436;
                    } else {
                        iM2761 = (C0773.m3169("᩻ᩳ") ^ i3) * (-125);
                        i5 = ((iM2761 ^ i4) * 21177) ^ (-176758091);
                        i6 = -1150253400;
                    }
                    break;
                case -1227019912:
                case 815151922:
                    if (C1519.f5300 >= 0) {
                        iM2761 = (C0773.m3169("ۙ᩵") + i3) * (-87);
                        i5 = ((iM2761 ^ i4) * (-10935)) ^ (-825414247);
                        i6 = 1404637232;
                    } else {
                        iM2761 = C0773.m3169("۟ܺ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-18897)) ^ (-1351857718);
                        i6 = 86789249;
                    }
                    break;
                case -1175718611:
                case -328304783:
                    if (view.isShown()) {
                        iM2761 = (C0773.m3169("ۘܺ") + i3) * 95;
                        i5 = ((iM2761 ^ i4) * (-28601)) ^ (-473326257);
                        i6 = -1313965372;
                    } else {
                        iM2761 = C0619.m2761("ܶۨ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-5471)) ^ (-1241823165);
                        i6 = 271835487;
                    }
                    break;
                case -991149341:
                case -785433873:
                    m49089(i + 1, view);
                    iM2761 = C0619.m2761("ܶۨ") ^ i4;
                    i5 = ((iM2761 ^ i3) * (-5471)) ^ (-1241823165);
                    i6 = 271835487;
                    break;
                case -970673467:
                case 1606816739:
                    if (RunnableC1848.f6235) {
                        iM2761 = (C0773.m3169("ۙ᩵") + i3) * (-87);
                        i5 = ((iM2761 ^ i4) * (-10935)) ^ (-825414247);
                        i6 = 1404637232;
                    } else {
                        iM2761 = (C0619.m2761("۠ۛ") + i3) * 23;
                        i5 = ((iM2761 ^ i4) * (-177)) ^ 204699353;
                        i6 = 10009373;
                    }
                    break;
                case -957805189:
                case 945994352:
                    RunnableC3055.m9933();
                    break;
                case -828379784:
                case -262715775:
                    if (C0773.f2792 <= 0) {
                        iM2761 = C0773.m3169("᩷᩵") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-22179)) ^ (-1946507811);
                        i6 = -168143082;
                    } else {
                        iM2761 = C0619.m2761("֫ۜ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 25953) ^ 1467221962;
                        i6 = 789793785;
                    }
                    break;
                case -611464752:
                case 1781416927:
                    if (C3998.f13671 != 0) {
                        iM2761 = (C0773.m3169("ۙ᩵") + i3) * (-87);
                        i5 = ((iM2761 ^ i4) * (-10935)) ^ (-825414247);
                        i6 = 1404637232;
                    } else {
                        iM2761 = C0773.m3169("ۚ᩻") ^ i4;
                        i5 = ((iM2761 ^ i3) * 27089) ^ 986296495;
                        i6 = 1479230075;
                    }
                    break;
                case -602980315:
                case 672250967:
                    if (C3099.f10023 <= 0) {
                        iM2761 = C0773.m3169("᩷᩵") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-22179)) ^ (-1946507811);
                        i6 = -168143082;
                    } else {
                        iM2761 = C0773.m3169("ܰ֨") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-8153)) ^ 1380220871;
                        i6 = -1519888675;
                    }
                    break;
                case -551116591:
                case 1012811124:
                    RunnableC1848.m6360();
                    if (C4238.m13540() <= 0) {
                        iM2761 = C0619.m2761("֫ۜ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 25953) ^ 1467221962;
                        i6 = 789793785;
                    } else {
                        iM2761 = (C0773.m3169("ۤܳ") + i3) * 115;
                        i5 = ((iM2761 ^ i4) * 17073) ^ 1736276546;
                        i6 = 315034150;
                    }
                    break;
                case -109808460:
                case 121782325:
                    break;
                case 44461772:
                case 1331358594:
                    if (C0619.m2763()) {
                        iM2761 = C0619.m2761("֫ۜ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 25953) ^ 1467221962;
                        i6 = 789793785;
                    } else {
                        iM2761 = C0619.m2761("ۧᩴ") ^ i3;
                        i5 = ((iM2761 ^ i4) * 19451) ^ 1123406155;
                        i6 = 1804865268;
                    }
                    break;
                case 308139938:
                case 735282221:
                    if (C2878.f9462) {
                        iM2761 = C0773.m3169("᩷᩵") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-22179)) ^ (-1946507811);
                        i6 = -168143082;
                    } else {
                        iM2761 = (C0773.m3169("۫᩺") + i3) * (-3);
                        i5 = ((iM2761 ^ i4) * 27061) ^ 378982896;
                        i6 = 132410276;
                    }
                    break;
                case 1459726021:
                case 1691546552:
                    if (C3033.m9845() <= 0) {
                        iM2761 = (C0773.m3169("ۙ᩵") + i3) * (-87);
                        i5 = ((iM2761 ^ i4) * (-10935)) ^ (-825414247);
                        i6 = 1404637232;
                    } else {
                        iM2761 = C0619.m2761("ۖ֫") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-13817)) ^ 1892427307;
                        i6 = -1637065359;
                    }
                    break;
                default:
                    if (view.isAttachedToWindow()) {
                        iM2761 = C0773.m3169("ۛ᩷") ^ i3;
                        i5 = ((iM2761 ^ i4) * 6131) ^ (-1221284296);
                        i6 = 1653427513;
                    } else {
                        iM2761 = C0619.m2761("ܶۨ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-5471)) ^ (-1241823165);
                        i6 = 271835487;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final Object m49087(String str) {
        return C23916.m53416(C1321.m4856(), str);
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0220 A[PHI: r3 r6 r7 r8 r17 r19
      0x0220: PHI (r3v4 short[]) = (r3v2 short[]), (r3v1 short[]), (r3v1 short[]) binds: [B:66:0x02b7, B:54:0x021e, B:6:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x0220: PHI (r6v4 int) = (r6v1 int), (r6v2 int), (r6v1 int) binds: [B:66:0x02b7, B:54:0x021e, B:6:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x0220: PHI (r7v3 int) = (r7v1 int), (r7v1 int), (r7v6 int) binds: [B:66:0x02b7, B:54:0x021e, B:6:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x0220: PHI (r8v3 int) = (r8v1 int), (r8v1 int), (r8v6 int) binds: [B:66:0x02b7, B:54:0x021e, B:6:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x0220: PHI (r17v31 int) = (r17v9 int), (r17v12 int), (r17v35 int) binds: [B:66:0x02b7, B:54:0x021e, B:6:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x0220: PHI (r19v24 int) = (r19v5 int), (r19v8 int), (r19v26 int) binds: [B:66:0x02b7, B:54:0x021e, B:6:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x0246 A[PHI: r5 r11 r12 r13 r17 r19
      0x0246: PHI (r5v3 short) = (r5v2 short), (r5v1 short), (r5v1 short), (r5v1 short) binds: [B:58:0x0244, B:38:0x013d, B:34:0x0118, B:10:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x0246: PHI (r11v3 short[]) = (r11v1 short[]), (r11v2 short[]), (r11v1 short[]), (r11v1 short[]) binds: [B:58:0x0244, B:38:0x013d, B:34:0x0118, B:10:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x0246: PHI (r12v3 int) = (r12v1 int), (r12v2 int), (r12v1 int), (r12v1 int) binds: [B:58:0x0244, B:38:0x013d, B:34:0x0118, B:10:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x0246: PHI (r13v3 int) = (r13v1 int), (r13v1 int), (r13v2 int), (r13v1 int) binds: [B:58:0x0244, B:38:0x013d, B:34:0x0118, B:10:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x0246: PHI (r17v27 int) = (r17v11 int), (r17v18 int), (r17v19 int), (r17v28 int) binds: [B:58:0x0244, B:38:0x013d, B:34:0x0118, B:10:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x0246: PHI (r19v20 int) = (r19v7 int), (r19v14 int), (r19v15 int), (r19v21 int) binds: [B:58:0x0244, B:38:0x013d, B:34:0x0118, B:10:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m49067(CharSequence charSequence) {
        int iM2761;
        int i;
        int i2;
        int iM3169 = 0;
        int i3 = 0;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        short[] sArr2 = null;
        int i9 = 0;
        int i10 = 0;
        int i11 = 1953397637;
        int i12 = AbstractC3624.f12429;
        int i13 = AbstractC0116.f1064;
        int iM31610 = (i12 - C0773.m3169("ۖ᩹")) * (-101);
        int i14 = ((iM31610 ^ i13) * 25705) ^ (-1940526755);
        int i15 = iM31610 ^ (-1214478340);
        String strM11809 = null;
        while (true) {
            int i16 = i15 ^ (i14 & (((i11 ^ i13) * 12897) >> 31));
            switch (i16) {
                case -2131772563:
                case -563554954:
                    iM3169 = iM3169;
                    i16 = i16;
                    s = sArr[c];
                    if (C20932.f66974 <= 0) {
                        iM2761 = (C0773.m3169("ۛ֨") + i13) * (-21);
                        i = ((iM2761 ^ i12) * (-2631)) ^ (-1811440029);
                        i2 = 117407567;
                    } else {
                        iM2761 = (C0619.m2761("ۧۢ") + i12) * 91;
                        i = ((iM2761 ^ i13) * 6315) ^ (-1810445030);
                        i2 = -473852058;
                    }
                    i11 = i16;
                    i15 = iM2761 ^ i2;
                    i14 = i;
                    iM3169 = iM3169;
                    break;
                case -2129894296:
                case -13090787:
                    iM3169 = iM3169;
                    i16 = i16;
                    i7 = 254466304;
                    if (C20932.m47848() != 0) {
                        iM2761 = (C0773.m3169("ۛۨ") + i13) * (-99);
                        i = ((iM2761 ^ i12) * 26635) ^ 1102948345;
                        i2 = -753407989;
                    } else {
                        iM2761 = (C0773.m3169("۬᩷") ^ i13) * 47;
                        i = ((iM2761 ^ i12) * (-28541)) ^ (-155284462);
                        i2 = 1523931944;
                    }
                    i11 = i16;
                    i15 = iM2761 ^ i2;
                    i14 = i;
                    iM3169 = iM3169;
                    break;
                case -2121259850:
                case -435000216:
                    m49061(iM3169 ^ i3, charSequence);
                    break;
                case -2084472878:
                case 509380033:
                    iM3169 = iM3169;
                    i16 = i16;
                    i4 = s + 15952;
                    if (C11235.f35427 >= 0) {
                        iM3169 = iM3169;
                        iM2761 = C0773.m3169("ۢۖ") ^ i12;
                        iM3169 = iM3169;
                        i = ((iM2761 ^ i13) * 25501) ^ (-189629661);
                        i2 = -1990950800;
                    } else {
                        iM2761 = C0619.m2761("᩻ۢ") ^ i13;
                        i = ((iM2761 ^ i12) * (-31503)) ^ (-375749398);
                        i2 = 2115681358;
                    }
                    i11 = i16;
                    i15 = iM2761 ^ i2;
                    i14 = i;
                    iM3169 = iM3169;
                    break;
                case -1689186639:
                case -1051142438:
                    iM3169 = iM3169;
                    i16 = i16;
                    int i17 = i6 + i7;
                    if (i5 - (i17 + i17) <= 0) {
                        iM2761 = C0619.m2761("۠ۡ") ^ i13;
                        i = ((iM2761 ^ i12) * 16119) ^ 475831317;
                        i2 = -871972110;
                    } else {
                        iM2761 = (i12 - C0773.m3169("ۡᩳ")) * (-73);
                        i = ((iM2761 ^ i13) * 26515) ^ 298047966;
                        i2 = 525274295;
                    }
                    i11 = i16;
                    i15 = iM2761 ^ i2;
                    i14 = i;
                    iM3169 = iM3169;
                    break;
                case -1595330474:
                case 1506075235:
                    i16 = i16;
                    iM3169 = C0773.m3169(strM11809);
                    if (AbstractC0116.f1064 <= 0) {
                        i3 = 2128676531;
                        iM2761 = C0773.m3169("ۢۖ") ^ i12;
                        iM3169 = iM3169;
                        i = ((iM2761 ^ i13) * 25501) ^ (-189629661);
                        i2 = -1990950800;
                        i11 = i16;
                        i15 = iM2761 ^ i2;
                        i14 = i;
                        iM3169 = iM3169;
                    } else {
                        int iM31611 = (C0773.m3169("᩶۫") ^ i12) * (-17);
                        i11 = i16;
                        i15 = iM31611 ^ 321041273;
                        i14 = ((iM31611 ^ i13) * (-955)) ^ 795274367;
                        i3 = 2128676531;
                    }
                    break;
                case -1590262674:
                case -1348716884:
                    AbstractC0116.m1243();
                    if (!C1343.m4943()) {
                        int iM31612 = C0773.m3169("ܳ᩹") ^ i12;
                        i15 = iM31612 ^ 614036917;
                        i14 = ((iM31612 ^ i13) * (-21111)) ^ 797837201;
                        i11 = i16;
                    } else {
                        iM3169 = iM3169;
                        i16 = i16;
                        iM2761 = (C0773.m3169("ۛۨ") + i13) * (-99);
                        i = ((iM2761 ^ i12) * 26635) ^ 1102948345;
                        i2 = -753407989;
                        i11 = i16;
                        i15 = iM2761 ^ i2;
                        i14 = i;
                        iM3169 = iM3169;
                    }
                    break;
                case -1335982568:
                case 1869916121:
                    i16 = i16;
                    RunnableC3646.m11813();
                    iM3169 = iM3169;
                    iM2761 = (C0773.m3169("ۛۨ") + i13) * (-99);
                    i = ((iM2761 ^ i12) * 26635) ^ 1102948345;
                    i2 = -753407989;
                    i11 = i16;
                    i15 = iM2761 ^ i2;
                    i14 = i;
                    iM3169 = iM3169;
                    break;
                case -1262949074:
                case 1022121618:
                    C2702.m8876();
                    break;
                case -1135132255:
                case -103031883:
                    iM3169 = iM3169;
                    i16 = i16;
                    sArr = f68929;
                    if (C1080.f3865 >= 0) {
                        iM3169 = iM3169;
                        iM2761 = C0773.m3169("ۢۖ") ^ i12;
                        iM3169 = iM3169;
                        i = ((iM2761 ^ i13) * 25501) ^ (-189629661);
                        i2 = -1990950800;
                    } else {
                        iM2761 = C0619.m2761("۫ۙ") ^ i12;
                        i = ((iM2761 ^ i13) * 7341) ^ 1860314207;
                        i2 = -1812192957;
                    }
                    i11 = i16;
                    i15 = iM2761 ^ i2;
                    i14 = i;
                    iM3169 = iM3169;
                    break;
                case -1028032626:
                case 856677591:
                    C2834.m9344();
                    if (C20932.m47848() == 0) {
                        iM3169 = iM3169;
                        i16 = i16;
                        iM2761 = (C0619.m2761("᩵᩵") + i13) * (-21);
                        i = ((iM2761 ^ i12) * (-3729)) ^ (-408205723);
                        i2 = -1224126510;
                        i11 = i16;
                        i15 = iM2761 ^ i2;
                        i14 = i;
                        iM3169 = iM3169;
                    }
                    iM3169 = iM3169;
                    i16 = i16;
                    iM2761 = (C0773.m3169("ۛ֨") + i13) * (-21);
                    i = ((iM2761 ^ i12) * (-2631)) ^ (-1811440029);
                    i2 = 117407567;
                    i11 = i16;
                    i15 = iM2761 ^ i2;
                    i14 = i;
                    iM3169 = iM3169;
                    break;
                case -937893041:
                case -733768309:
                    i8 = 62289;
                    iM2761 = C0773.m3169("ۤ᩶") ^ i12;
                    i = ((iM2761 ^ i13) * 18297) ^ 813393300;
                    i2 = -1091154998;
                    i11 = i16;
                    i15 = iM2761 ^ i2;
                    i14 = i;
                    iM3169 = iM3169;
                    break;
                case -754169667:
                case 1189990815:
                    i8 = 54657;
                    iM2761 = C0773.m3169("ۤ᩶") ^ i12;
                    i = ((iM2761 ^ i13) * 18297) ^ 813393300;
                    i2 = -1091154998;
                    i11 = i16;
                    i15 = iM2761 ^ i2;
                    i14 = i;
                    iM3169 = iM3169;
                    break;
                case -669919289:
                case 713770816:
                    iM3169 = iM3169;
                    i16 = i16;
                    c = 202;
                    if (C3998.f13671 != 0) {
                        iM2761 = (C0619.m2761("᩵᩵") + i13) * (-21);
                        i = ((iM2761 ^ i12) * (-3729)) ^ (-408205723);
                        i2 = -1224126510;
                    } else {
                        iM2761 = C0619.m2761("ۘۤ") ^ i13;
                        i = ((iM2761 ^ i12) * 3309) ^ 908222441;
                        i2 = -2064540195;
                    }
                    i11 = i16;
                    i15 = iM2761 ^ i2;
                    i14 = i;
                    iM3169 = iM3169;
                    break;
                case -507547579:
                case 857705307:
                    iM3169 = iM3169;
                    i16 = i16;
                    i10 = 3;
                    if (C2834.f9334 <= 0) {
                        iM2761 = (C0773.m3169("ۛ֨") + i13) * (-21);
                        i = ((iM2761 ^ i12) * (-2631)) ^ (-1811440029);
                        i2 = 117407567;
                    } else {
                        iM2761 = C0619.m2761("ᩴᩴ") ^ i12;
                        i = ((iM2761 ^ i13) * 9023) ^ (-717568063);
                        i2 = 2083261808;
                    }
                    i11 = i16;
                    i15 = iM2761 ^ i2;
                    i14 = i;
                    iM3169 = iM3169;
                    break;
                case -182743022:
                case -51243838:
                    iM3169 = iM3169;
                    i16 = i16;
                    sArr2 = f68929;
                    i9 = 203;
                    if (C2485.f7950 != 0) {
                        iM2761 = (C0773.m3169("ۛ֨") + i13) * (-21);
                        i = ((iM2761 ^ i12) * (-2631)) ^ (-1811440029);
                        i2 = 117407567;
                    } else {
                        iM2761 = C0619.m2761("ܰ۫") ^ i13;
                        i = ((iM2761 ^ i12) * (-20249)) ^ (-152873243);
                        i2 = -442406846;
                    }
                    i11 = i16;
                    i15 = iM2761 ^ i2;
                    i14 = i;
                    iM3169 = iM3169;
                    break;
                case 318119073:
                case 505869222:
                    C3099.m10095();
                    if (C2834.m9344() < 0) {
                        iM3169 = iM3169;
                        i16 = i16;
                        iM2761 = (C0773.m3169("ۛ֨") + i13) * (-21);
                        i = ((iM2761 ^ i12) * (-2631)) ^ (-1811440029);
                        i2 = 117407567;
                        i11 = i16;
                        i15 = iM2761 ^ i2;
                        i14 = i;
                        iM3169 = iM3169;
                    } else {
                        int iM31613 = C0773.m3169("ܳ᩹") ^ i12;
                        i15 = iM31613 ^ 614036917;
                        i14 = ((iM31613 ^ i13) * (-21111)) ^ 797837201;
                        i11 = i16;
                    }
                    break;
                case 935487546:
                case 1944578417:
                    i16 = i16;
                    strM11809 = RunnableC3646.m11809(sArr2, i9, i10, i8);
                    if (C0773.m3161() != 0) {
                        iM3169 = iM3169;
                        iM2761 = (C0773.m3169("ۛۨ") + i13) * (-99);
                        i = ((iM2761 ^ i12) * 26635) ^ 1102948345;
                        i2 = -753407989;
                    } else {
                        iM2761 = (i13 - C0619.m2761("۬᩻")) * (-45);
                        iM3169 = iM3169;
                        i = ((iM2761 ^ i12) * (-7967)) ^ (-1506669176);
                        i2 = 527640564;
                    }
                    i11 = i16;
                    i15 = iM2761 ^ i2;
                    i14 = i;
                    iM3169 = iM3169;
                    break;
                default:
                    iM3169 = iM3169;
                    i16 = i16;
                    i5 = i4 * i4;
                    i6 = s * s;
                    if (RunnableC3646.f12471) {
                        iM3169 = iM3169;
                        iM2761 = C0773.m3169("ۢۖ") ^ i12;
                        iM3169 = iM3169;
                        i = ((iM2761 ^ i13) * 25501) ^ (-189629661);
                        i2 = -1990950800;
                    } else {
                        iM2761 = C0773.m3169("ܿۘ") ^ i12;
                        i = ((iM2761 ^ i13) * (-6203)) ^ (-1200722434);
                        i2 = -1261073234;
                    }
                    i11 = i16;
                    i15 = iM2761 ^ i2;
                    i14 = i;
                    iM3169 = iM3169;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0219 A[PHI: r2 r4
      0x0219: PHI (r2v4 java.lang.String) = (r2v2 java.lang.String), (r2v3 java.lang.String), (r2v2 java.lang.String) binds: [B:57:0x0217, B:25:0x0093, B:11:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x0219: PHI (r4v4 char) = (r4v3 char), (r4v2 char), (r4v2 char) binds: [B:57:0x0217, B:25:0x0093, B:11:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x026c A[PHI: r5 r6 r7 r12 r13 r19
      0x026c: PHI (r5v4 short) = (r5v2 short), (r5v2 short), (r5v3 short), (r5v2 short), (r5v2 short) binds: [B:65:0x026a, B:61:0x024c, B:53:0x01f5, B:49:0x01d1, B:6:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x026c: PHI (r6v4 short) = (r6v2 short), (r6v2 short), (r6v3 short), (r6v2 short), (r6v2 short) binds: [B:65:0x026a, B:61:0x024c, B:53:0x01f5, B:49:0x01d1, B:6:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x026c: PHI (r7v4 int) = (r7v2 int), (r7v2 int), (r7v2 int), (r7v3 int), (r7v2 int) binds: [B:65:0x026a, B:61:0x024c, B:53:0x01f5, B:49:0x01d1, B:6:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x026c: PHI (r12v3 short[]) = (r12v2 short[]), (r12v2 short[]), (r12v2 short[]), (r12v2 short[]), (r12v6 short[]) binds: [B:65:0x026a, B:61:0x024c, B:53:0x01f5, B:49:0x01d1, B:6:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x026c: PHI (r13v3 int) = (r13v2 int), (r13v2 int), (r13v2 int), (r13v2 int), (r13v6 int) binds: [B:65:0x026a, B:61:0x024c, B:53:0x01f5, B:49:0x01d1, B:6:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x026c: PHI (r19v5 short[]) = (r19v3 short[]), (r19v4 short[]), (r19v3 short[]), (r19v3 short[]), (r19v3 short[]) binds: [B:65:0x026a, B:61:0x024c, B:53:0x01f5, B:49:0x01d1, B:6:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0064, code lost:
    
        if (l.C0619.f2439 != false) goto L14;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m49064(android.content.BroadcastReceiver r20, android.content.IntentFilter r21) {
        /*
            Method dump skipped, instruction units count: 814
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C21576.m49064(android.content.BroadcastReceiver, android.content.IntentFilter):void");
    }

    /* JADX WARN: Code duplicated, block: B:15:0x006a  */
    /* JADX WARN: Code duplicated, block: B:22:0x009f A[PHI: r5 r6 r7
      0x009f: PHI (r5v5 android.content.pm.PackageInfo) = (r5v3 android.content.pm.PackageInfo), (r5v2 android.content.pm.PackageInfo) binds: [B:21:0x009d, B:6:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x009f: PHI (r6v5 short[]) = (r6v3 short[]), (r6v2 short[]) binds: [B:21:0x009d, B:6:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x009f: PHI (r7v5 int) = (r7v3 int), (r7v2 int) binds: [B:21:0x009d, B:6:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x01f9 A[PHI: r8 r22
      0x01f9: PHI (r8v4 short) = (r8v3 short), (r8v2 short) binds: [B:56:0x01f7, B:12:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x01f9: PHI (r22v5 short) = (r22v4 short), (r22v3 short) binds: [B:56:0x01f7, B:12:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x022c A[PHI: r2 r13 r14 r15 r17
      0x022c: PHI (r2v4 java.lang.String) = 
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
      (r2v3 java.lang.String)
      (r2v2 java.lang.String)
     binds: [B:60:0x022a, B:37:0x013d, B:33:0x011b, B:29:0x00fd, B:9:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x022c: PHI (r13v4 short[]) = (r13v2 short[]), (r13v3 short[]), (r13v2 short[]), (r13v2 short[]), (r13v2 short[]) binds: [B:60:0x022a, B:37:0x013d, B:33:0x011b, B:29:0x00fd, B:9:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x022c: PHI (r14v4 int) = (r14v2 int), (r14v3 int), (r14v2 int), (r14v2 int), (r14v2 int) binds: [B:60:0x022a, B:37:0x013d, B:33:0x011b, B:29:0x00fd, B:9:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x022c: PHI (r15v4 int) = (r15v2 int), (r15v2 int), (r15v3 int), (r15v2 int), (r15v2 int) binds: [B:60:0x022a, B:37:0x013d, B:33:0x011b, B:29:0x00fd, B:9:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x022c: PHI (r17v4 char) = (r17v3 char), (r17v2 char), (r17v2 char), (r17v2 char), (r17v2 char) binds: [B:60:0x022a, B:37:0x013d, B:33:0x011b, B:29:0x00fd, B:9:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0260 A[PHI: r3 r4 r10 r11 r16
      0x0260: PHI (r3v3 android.content.pm.PackageManager) = 
      (r3v2 android.content.pm.PackageManager)
      (r3v2 android.content.pm.PackageManager)
      (r3v2 android.content.pm.PackageManager)
      (r3v4 android.content.pm.PackageManager)
     binds: [B:64:0x025e, B:52:0x01d5, B:48:0x01b5, B:25:0x00d9] A[DONT_GENERATE, DONT_INLINE]
      0x0260: PHI (r4v3 int) = (r4v2 int), (r4v2 int), (r4v2 int), (r4v4 int) binds: [B:64:0x025e, B:52:0x01d5, B:48:0x01b5, B:25:0x00d9] A[DONT_GENERATE, DONT_INLINE]
      0x0260: PHI (r10v4 int) = (r10v2 int), (r10v3 int), (r10v2 int), (r10v2 int) binds: [B:64:0x025e, B:52:0x01d5, B:48:0x01b5, B:25:0x00d9] A[DONT_GENERATE, DONT_INLINE]
      0x0260: PHI (r11v4 short) = (r11v2 short), (r11v2 short), (r11v3 short), (r11v2 short) binds: [B:64:0x025e, B:52:0x01d5, B:48:0x01b5, B:25:0x00d9] A[DONT_GENERATE, DONT_INLINE]
      0x0260: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:64:0x025e, B:52:0x01d5, B:48:0x01b5, B:25:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final PackageInfo m49057(String str) throws PackageManager.NameNotFoundException {
        int iM3169;
        int i;
        int i2;
        int i3 = C2834.f9334;
        int i4 = C1783.f6087;
        int iM31610 = C0773.m3169("֨ܺ") ^ i4;
        int i5 = ((iM31610 ^ i3) * 28517) ^ (-102974085);
        PackageManager packageManagerM49081 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM31610 ^ 383659214;
        String strM7761 = null;
        int i7 = 0;
        short s = 0;
        int i8 = 0;
        short s2 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        char c = 0;
        int i12 = -235714250;
        short s3 = 0;
        PackageInfo packageInfo = null;
        int i13 = 0;
        while (true) {
            i12 = i6 ^ (i5 & (((i12 ^ i3) * 5763) >> 31));
            switch (i12) {
                case -2083343190:
                case -1722187668:
                    C3779.m12264();
                    return null;
                case -1983024076:
                case 527933800:
                    i9 = 10703;
                    iM3169 = C0619.m2761("ᩳ֨") ^ i3;
                    i = ((iM3169 ^ i4) * 13593) ^ 376730228;
                    i2 = -1237774936;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1883681776:
                case -739675745:
                    i11 = 11;
                    if (C23916.f77426 <= 0) {
                        iM3169 = (C0619.m2761("ۜۤ") + i4) * 127;
                        i = ((iM3169 ^ i3) * (-22597)) ^ (-2005384478);
                        i2 = 1212776204;
                    } else {
                        iM3169 = (i4 - C0773.m3169("۫ۙ")) * 79;
                        i = ((iM3169 ^ i3) * 4163) ^ 1085713603;
                        i2 = 295229603;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1856124055:
                case 782121420:
                    int i14 = s + s3;
                    i8 = i14 * i14;
                    if (C0862.f3233 != 0) {
                        iM3169 = C0619.m2761("ۧ֨") ^ i3;
                        i = ((iM3169 ^ i4) * (-4323)) ^ (-1923023433);
                        i2 = 270969864;
                    } else {
                        iM3169 = (C0773.m3169("ۡۜ") + i3) * (-85);
                        i = ((iM3169 ^ i4) * 4957) ^ (-1425559550);
                        i2 = 247019808;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1742469490:
                case 1686436234:
                    if (C3779.m12264()) {
                        iM3169 = (C0619.m2761("ۚۧ") ^ i3) * 75;
                        i = ((iM3169 ^ i4) * (-12117)) ^ 375652387;
                        i2 = 2051029816;
                    } else {
                        iM3169 = (C0619.m2761("᩶ۧ") + i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM3169 ^ i3) * 12399) ^ 1443157717;
                        i2 = -2037337113;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1711182194:
                case -1039806675:
                    c = '*';
                    if (C1321.f4751 >= 0) {
                        iM3169 = (C0619.m2761("ۜۤ") + i4) * 127;
                        i = ((iM3169 ^ i3) * (-22597)) ^ (-2005384478);
                        i2 = 1212776204;
                    } else {
                        iM3169 = (C0619.m2761("ۧۡ") ^ i3) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM3169 ^ i4) * (-32297)) ^ (-2097704126);
                        i2 = 1714724946;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1699955384:
                case -745848785:
                    if (i8 - (s * s2) < 0) {
                        iM3169 = (C0619.m2761("֫ܿ") ^ i4) * (-27);
                        i = ((iM3169 ^ i3) * (-16915)) ^ 1920350286;
                        i2 = -1516171522;
                    } else {
                        iM3169 = (C0773.m3169("֨ۗ") + i3) * (-101);
                        i = ((iM3169 ^ i4) * 10347) ^ 215223783;
                        i2 = 1402760311;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1593578265:
                case 1086545095:
                    C1343.m4943();
                    iM3169 = (C0619.m2761("᩶ۧ") + i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                    i = ((iM3169 ^ i3) * 12399) ^ 1443157717;
                    i2 = -2037337113;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1568360999:
                case 1142642344:
                    s2 = 40636;
                    if (C20932.m47848() != 0) {
                        iM3169 = C0619.m2761("ۧ֨") ^ i3;
                        i = ((iM3169 ^ i4) * (-4323)) ^ (-1923023433);
                        i2 = 270969864;
                    } else {
                        iM3169 = C0619.m2761("ܶۘ") ^ i4;
                        i = ((iM3169 ^ i3) * 5745) ^ 1718578531;
                        i2 = -795331876;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -526862886:
                case 2046107957:
                    if (C2023.f6737) {
                        iM3169 = (C0619.m2761("ۜۤ") + i4) * 127;
                        i = ((iM3169 ^ i3) * (-22597)) ^ (-2005384478);
                        i2 = 1212776204;
                    } else {
                        iM3169 = (C0619.m2761("᩶ۧ") + i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM3169 ^ i3) * 12399) ^ 1443157717;
                        i2 = -2037337113;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -465631214:
                case 1890230660:
                    i9 = 1415;
                    iM3169 = C0619.m2761("ᩳ֨") ^ i3;
                    i = ((iM3169 ^ i4) * 13593) ^ 376730228;
                    i2 = -1237774936;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -193937541:
                case 1908173728:
                    strM7761 = C2288.m7761(sArr2, i10, i11, i9);
                    if (AbstractC0116.m1243() != 0) {
                        iM3169 = (C0619.m2761("ۜۤ") + i4) * 127;
                        i = ((iM3169 ^ i3) * (-22597)) ^ (-2005384478);
                        i2 = 1212776204;
                    } else {
                        iM3169 = C0619.m2761("ۗᩴ") ^ i4;
                        i = ((iM3169 ^ i3) * (-16671)) ^ (-588042752);
                        i2 = 221631250;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -161002458:
                case 115354372:
                    s = sArr[c];
                    s3 = 10159;
                    if (C1826.f6190 <= 0) {
                        iM3169 = (C0619.m2761("ۚۧ") ^ i3) * 75;
                        i = ((iM3169 ^ i4) * (-12117)) ^ 375652387;
                        i2 = 2051029816;
                    } else {
                        iM3169 = C0773.m3169("ۗۘ") ^ i4;
                        i = ((iM3169 ^ i3) * Scalar25519.L4) ^ 867402236;
                        i2 = 1688898267;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -109870611:
                case 569741026:
                    sArr2 = f68929;
                    i10 = 43;
                    if (C3779.f12953 <= 0) {
                        iM3169 = (C0619.m2761("ۜۤ") + i4) * 127;
                        i = ((iM3169 ^ i3) * (-22597)) ^ (-2005384478);
                        i2 = 1212776204;
                    } else {
                        iM3169 = (C0619.m2761("ۧۤ") ^ i3) * 115;
                        i = ((iM3169 ^ i4) * (-32629)) ^ 1546246500;
                        i2 = 1309884744;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 402633058:
                case 1191269529:
                    C3734.m12144(str, strM7761);
                    packageManagerM49081 = m49081();
                    i13 = 0;
                    if (C2310.f7472 >= 0) {
                        iM3169 = C0619.m2761("ۧ֨") ^ i3;
                        i = ((iM3169 ^ i4) * (-4323)) ^ (-1923023433);
                        i2 = 270969864;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ܶܰ")) * 29;
                        i = ((iM3169 ^ i4) * (-19131)) ^ 1386261025;
                        i2 = -1876558585;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 604948454:
                case 1348364523:
                    C2310.m7811(packageInfo, C1564.m5510(sArr3, i7, 19, i9));
                    return packageInfo;
                case 780757973:
                case 1558901674:
                    sArr = f68929;
                    if (C2485.f7950 != 0) {
                        iM3169 = C0619.m2761("ۧ֨") ^ i3;
                        i = ((iM3169 ^ i4) * (-4323)) ^ (-1923023433);
                        i2 = 270969864;
                    } else {
                        iM3169 = C0773.m3169("ۙᩴ") ^ i4;
                        i = ((iM3169 ^ i3) * 1721) ^ (-1095900970);
                        i2 = -801773117;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 1327037168:
                case 1796900985:
                    packageInfo = packageManagerM49081.getPackageInfo(str, i13);
                    sArr3 = f68929;
                    i7 = 54;
                    if (C2375.m8065() <= 0) {
                        iM3169 = (C0619.m2761("ۗ֫") ^ i4) * 45;
                        i = ((iM3169 ^ i3) * (-30855)) ^ 1211798037;
                        i2 = -338014656;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ۖ֨")) * 89;
                        i = ((iM3169 ^ i4) * 19785) ^ 70409525;
                        i2 = -1269148056;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                default:
                    C3690.m11987();
                    if (C3734.f12817 >= 0) {
                        iM3169 = (C0619.m2761("᩶ۧ") + i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM3169 ^ i3) * 12399) ^ 1443157717;
                        i2 = -2037337113;
                    } else {
                        iM3169 = (C0619.m2761("ۗ֫") ^ i4) * 45;
                        i = ((iM3169 ^ i3) * (-30855)) ^ 1211798037;
                        i2 = -338014656;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00e0 A[PHI: r4
      0x00e0: PHI (r4v4 android.net.NetworkInfo) = (r4v3 android.net.NetworkInfo), (r4v2 android.net.NetworkInfo), (r4v2 android.net.NetworkInfo) binds: [B:28:0x00c6, B:23:0x00a2, B:20:0x0086] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x01e1 A[PHI: r3 r11
      0x01e1: PHI (r3v5 java.lang.String) = 
      (r3v2 java.lang.String)
      (r3v4 java.lang.String)
      (r3v2 java.lang.String)
      (r3v2 java.lang.String)
      (r3v2 java.lang.String)
     binds: [B:55:0x01df, B:32:0x0102, B:13:0x0072, B:10:0x0069, B:7:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x01e1: PHI (r11v4 int) = (r11v3 int), (r11v2 int), (r11v2 int), (r11v2 int), (r11v2 int) binds: [B:55:0x01df, B:32:0x0102, B:13:0x0072, B:10:0x0069, B:7:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0239 A[PHI: r9
      0x0239: PHI (r9v4 int) = (r9v3 int), (r9v2 int) binds: [B:63:0x0237, B:10:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x026a A[PHI: r2 r5 r8 r15
      0x026a: PHI (r2v3 java.lang.Object) = (r2v2 java.lang.Object), (r2v2 java.lang.Object), (r2v4 java.lang.Object) binds: [B:67:0x0268, B:40:0x014a, B:36:0x0128] A[DONT_GENERATE, DONT_INLINE]
      0x026a: PHI (r5v3 short[]) = (r5v2 short[]), (r5v2 short[]), (r5v4 short[]) binds: [B:67:0x0268, B:40:0x014a, B:36:0x0128] A[DONT_GENERATE, DONT_INLINE]
      0x026a: PHI (r8v4 short) = (r8v3 short), (r8v2 short), (r8v2 short) binds: [B:67:0x0268, B:40:0x014a, B:36:0x0128] A[DONT_GENERATE, DONT_INLINE]
      0x026a: PHI (r15v4 int) = (r15v2 int), (r15v3 int), (r15v2 int) binds: [B:67:0x0268, B:40:0x014a, B:36:0x0128] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x029d A[PHI: r7
      0x029d: PHI (r7v4 short) = (r7v3 short), (r7v2 short) binds: [B:71:0x029b, B:7:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x02d1 A[PHI: r1 r10 r13 r14 r16 r21
      0x02d1: PHI (r1v5 android.app.Application) = 
      (r1v2 android.app.Application)
      (r1v2 android.app.Application)
      (r1v3 android.app.Application)
      (r1v2 android.app.Application)
      (r1v2 android.app.Application)
     binds: [B:75:0x02cf, B:59:0x0215, B:44:0x016e, B:13:0x0072, B:5:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x02d1: PHI (r10v5 int) = (r10v2 int), (r10v3 int), (r10v2 int), (r10v2 int), (r10v2 int) binds: [B:75:0x02cf, B:59:0x0215, B:44:0x016e, B:13:0x0072, B:5:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x02d1: PHI (r13v5 short[]) = (r13v2 short[]), (r13v2 short[]), (r13v3 short[]), (r13v2 short[]), (r13v2 short[]) binds: [B:75:0x02cf, B:59:0x0215, B:44:0x016e, B:13:0x0072, B:5:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x02d1: PHI (r14v5 int) = (r14v2 int), (r14v2 int), (r14v3 int), (r14v2 int), (r14v2 int) binds: [B:75:0x02cf, B:59:0x0215, B:44:0x016e, B:13:0x0072, B:5:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x02d1: PHI (r16v5 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:75:0x02cf, B:59:0x0215, B:44:0x016e, B:13:0x0072, B:5:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x02d1: PHI (r21v6 char) = (r21v4 char), (r21v3 char), (r21v3 char), (r21v3 char), (r21v3 char) binds: [B:75:0x02cf, B:59:0x0215, B:44:0x016e, B:13:0x0072, B:5:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final boolean m49085() {
        int iM3169;
        int i;
        int i2;
        int i3 = C2419.f7754;
        int i4 = C4282.f15546;
        int iM31610 = (C0773.m3169("ۗ᩺") ^ i4) * (-111);
        int i5 = ((iM31610 ^ i3) * 14659) ^ 574138024;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM31610 ^ 1096059229;
        short s = 0;
        short s2 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = -1704513313;
        char c = 0;
        NetworkInfo activeNetworkInfo = null;
        String strM5510 = null;
        Object objM53416 = null;
        Application applicationM10096 = null;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i3) * 13549) >> 31));
            switch (i13) {
                case -2144517129:
                case -29574302:
                    return false;
                case -1783212695:
                case 580236010:
                    s2 = 1;
                    if (C1080.f3865 >= 0) {
                        iM3169 = (C0773.m3169("ܿۨ") ^ i3) * 73;
                        i = ((iM3169 ^ i4) * 28013) ^ 204654584;
                        i2 = -1813594195;
                    } else {
                        iM3169 = C0619.m2761("ܳۛ") ^ i4;
                        i = ((iM3169 ^ i3) * 24887) ^ 185433163;
                        i2 = 715578738;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1733923784:
                case 2048878966:
                    C3998.m12920();
                    if (C3099.f10023 > 0) {
                        iM3169 = (C0773.m3169("᩺۟") ^ i4) * (-31);
                        i = ((iM3169 ^ i3) * (-9013)) ^ (-402592052);
                        i2 = -370238089;
                    } else {
                        iM3169 = C0619.m2761("᩺ܿ") ^ i4;
                        i = ((iM3169 ^ i3) * (-14927)) ^ 337568075;
                        i2 = 1959932364;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1663568928:
                case 861728026:
                    C2354.m7983();
                    if (C2878.f9462) {
                        iM3169 = (C0773.m3169("᩺۟") ^ i4) * (-31);
                        i = ((iM3169 ^ i3) * (-9013)) ^ (-402592052);
                        i2 = -370238089;
                    } else {
                        iM3169 = C0619.m2761("۟֡") ^ i3;
                        i = ((iM3169 ^ i4) * 711) ^ (-532955218);
                        i2 = -764497605;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1609048595:
                case 1349694172:
                    C2023.m6964();
                    if (RunnableC0334.m2063()) {
                        iM3169 = C0773.m3169("ۛܰ") ^ i3;
                        i = ((iM3169 ^ i4) * 32177) ^ (-64967952);
                        i2 = 346089951;
                    } else {
                        iM3169 = (C0773.m3169("᩺۟") ^ i4) * (-31);
                        i = ((iM3169 ^ i3) * (-9013)) ^ (-402592052);
                        i2 = -370238089;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1435170987:
                case 235242607:
                    int i14 = s + s2;
                    i7 = i14 * i14;
                    if (C4282.f15546 <= 0) {
                        iM3169 = C0773.m3169("ۛܰ") ^ i3;
                        i = ((iM3169 ^ i4) * 32177) ^ (-64967952);
                        i2 = 346089951;
                    } else {
                        iM3169 = C0619.m2761("ᩴ۬") ^ i3;
                        i = ((iM3169 ^ i4) * (-6527)) ^ 28002607;
                        i2 = -877265493;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1371507053:
                case 1358245075:
                    C15243.m36587(objM53416, strM5510);
                    activeNetworkInfo = ((ConnectivityManager) objM53416).getActiveNetworkInfo();
                    if (activeNetworkInfo != null) {
                        iM3169 = (i4 - C0773.m3169("᩻۠")) * (-25);
                        i = ((iM3169 ^ i3) * (-23993)) ^ 1985185953;
                        i2 = -1776546584;
                    } else {
                        iM3169 = C0619.m2761("ܳ᩺") ^ i4;
                        i = ((iM3169 ^ i3) * (-27023)) ^ 935561005;
                        i2 = -627049008;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1196019498:
                case 1511631379:
                    C0773.m3161();
                    C1783.m6232();
                    return false;
                case -1117133193:
                case 1551570603:
                    sArr = f68929;
                    c = 485;
                    if (C11235.f35427 >= 0) {
                        iM3169 = C0619.m2761("۟֡") ^ i3;
                        i = ((iM3169 ^ i4) * 711) ^ (-532955218);
                        i2 = -764497605;
                    } else {
                        iM3169 = C0773.m3169("֨ۜ") ^ i3;
                        i = ((iM3169 ^ i4) * 17451) ^ 1310965118;
                        i2 = 1452302627;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1061432568:
                case -627882920:
                    i10 = 40465;
                    iM3169 = C0619.m2761("ۤۛ") ^ i3;
                    i = ((iM3169 ^ i4) * (-15107)) ^ 1624710481;
                    i2 = -384789859;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -958198246:
                case 1712863367:
                    return true;
                case -858452618:
                case 2034322369:
                    if ((i8 + i9) - i7 <= 0) {
                        iM3169 = C0773.m3169("֡ۧ") ^ i3;
                        i = ((iM3169 ^ i4) * (-19575)) ^ 1722799121;
                        i2 = 1390686388;
                    } else {
                        iM3169 = C0619.m2761("᩶ᩴ") ^ i4;
                        i = ((iM3169 ^ i3) * 13241) ^ (-467291384);
                        i2 = 1564683919;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -578201176:
                case -449546863:
                    i9 = 1;
                    if (C1783.f6087 <= 0) {
                        iM3169 = (C0773.m3169("᩺۟") ^ i4) * (-31);
                        i = ((iM3169 ^ i3) * (-9013)) ^ (-402592052);
                        i2 = -370238089;
                    } else {
                        iM3169 = C0773.m3169("ۙܽ") ^ i4;
                        i = ((iM3169 ^ i3) * (-21523)) ^ (-744577976);
                        i2 = 1575104336;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -555280739:
                case 500140890:
                    s = sArr[c];
                    if (C3998.f13671 != 0) {
                        iM3169 = C0619.m2761("᩺ܿ") ^ i4;
                        i = ((iM3169 ^ i3) * (-14927)) ^ 337568075;
                        i2 = 1959932364;
                    } else {
                        iM3169 = (i4 - C0619.m2761("ۡ۠")) * (-49);
                        i = ((iM3169 ^ i3) * (-27219)) ^ 212493411;
                        i2 = -565756928;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -206574805:
                case -3882601:
                    if (activeNetworkInfo.getState() == NetworkInfo.State.CONNECTED) {
                        iM3169 = C0773.m3169("ܺ᩹") ^ i4;
                        i = ((iM3169 ^ i3) * (-11161)) ^ (-1571700547);
                        i2 = -499102864;
                    } else {
                        iM3169 = C0619.m2761("ܳ᩺") ^ i4;
                        i = ((iM3169 ^ i3) * (-27023)) ^ 935561005;
                        i2 = -627049008;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -163181191:
                case 1634176864:
                    applicationM10096 = C3099.m10096();
                    sArr2 = f68929;
                    i11 = 486;
                    if (C0619.f2439) {
                        iM3169 = C0619.m2761("۟֡") ^ i3;
                        i = ((iM3169 ^ i4) * 711) ^ (-532955218);
                        i2 = -764497605;
                    } else {
                        iM3169 = C0773.m3169("᩺ۤ") ^ i4;
                        i = ((iM3169 ^ i3) * (-1931)) ^ 121487863;
                        i2 = 1794765476;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -95477288:
                case 994964207:
                    if (activeNetworkInfo.isConnected()) {
                        iM3169 = C0619.m2761("᩶ۡ") ^ i3;
                        i = ((iM3169 ^ i4) * (-18517)) ^ 478155136;
                        i2 = 2077954442;
                    } else {
                        iM3169 = C0619.m2761("ܳ᩺") ^ i4;
                        i = ((iM3169 ^ i3) * (-27023)) ^ 935561005;
                        i2 = -627049008;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 224153301:
                case 1314485787:
                    i12 = 12;
                    if (C4238.m13540() <= 0) {
                        iM3169 = (C0773.m3169("ܿۨ") ^ i3) * 73;
                        i = ((iM3169 ^ i4) * 28013) ^ 204654584;
                        i2 = -1813594195;
                    } else {
                        iM3169 = C0619.m2761("᩶۠") ^ i4;
                        i = ((iM3169 ^ i3) * (-27633)) ^ 538407163;
                        i2 = 436032437;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 1029560202:
                case 1383997162:
                    objM53416 = C23916.m53416(applicationM10096, RunnableC0334.m2049(sArr2, i11, i12, i10));
                    sArr3 = f68929;
                    if (AbstractC0641.f2496 >= 0) {
                        iM3169 = (C0773.m3169("ܿۨ") ^ i3) * 73;
                        i = ((iM3169 ^ i4) * 28013) ^ 204654584;
                        i2 = -1813594195;
                    } else {
                        iM3169 = (i3 - C0773.m3169("᩷᩷")) * (-41);
                        i = ((iM3169 ^ i4) * (-3929)) ^ (-1573632320);
                        i2 = 1411957518;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 1136723673:
                case 2045595153:
                    i8 = s * 2;
                    if (C1343.m4943()) {
                        iM3169 = (C0773.m3169("ۖܽ") + i3) * 59;
                        i = ((iM3169 ^ i4) * (-1237)) ^ (-1188029325);
                        i2 = -1371191965;
                    } else {
                        iM3169 = C0619.m2761("۟֡") ^ i3;
                        i = ((iM3169 ^ i4) * 711) ^ (-532955218);
                        i2 = -764497605;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 1541289717:
                case 2044976932:
                    i10 = 62326;
                    iM3169 = C0619.m2761("ۤۛ") ^ i3;
                    i = ((iM3169 ^ i4) * (-15107)) ^ 1624710481;
                    i2 = -384789859;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 1903256008:
                case 2064212909:
                    strM5510 = C1564.m5510(sArr3, 498, 68, i10);
                    if (C2878.m9491() <= 0) {
                        iM3169 = (C0773.m3169("᩺۟") ^ i4) * (-31);
                        i = ((iM3169 ^ i3) * (-9013)) ^ (-402592052);
                        i2 = -370238089;
                    } else {
                        iM3169 = C0619.m2761("᩹᩸") ^ i3;
                        i = ((iM3169 ^ i4) * 32377) ^ 1655062464;
                        i2 = -662592954;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                default:
                    C0862.m3503();
                    RunnableC3055.m9933();
                    iM3169 = C0619.m2761("۟֡") ^ i3;
                    i = ((iM3169 ^ i4) * 711) ^ (-532955218);
                    i2 = -764497605;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }
}
