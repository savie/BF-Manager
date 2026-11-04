package l;

import android.app.Application;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.MenuItem;
import android.view.View;
import bin.mt.plus.Main;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.analytics.pro.o;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۘܽ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: Q649 */
/* JADX INFO: loaded from: classes3.dex */
public class ActivityC4300 extends AbstractActivityC17204 {

    /* JADX INFO: renamed from: ۖ᩻ۛ, reason: not valid java name and contains not printable characters */
    private static final short[] f15586 = {3156, 15325, 15308, 15313, 15325, 15359, 15296, 15308, 15326, 15308, 15323, 15350, 15309, 15308, 15306, 15300, 15308, 15325, 15297, 15302, 15309, 15325, 15296, 15325, 15301, 15308, 3812, 8777, 8776, 8789, 8818, 8777, 8776, 8782, 8770, 8768, 8797, 8772, 8769, 8776, 8818, 8776, 8771, 8778, 8772, 8771, 8776, 4876, -31000, -30983, -31004, -31000, -31030, -30987, -30983, -30997, -30983, -30994, -31037, -30993, -30994, -30977, -30991, -30983, -31000, -30988, -30989, -30984, -31000, -30987, -31000, -30992, -30983, -30993, -30979, -30998, -30983, -30984, -31011, -30993, -31028, -30979, -31000, -30988, -30993, -31003, -30990, -31000, -30979, -31004, -31014, -30987, -30992, -30983, -31022, -30979, -30991, -30983, -30993, -30999, -30996, -30996, -30989, -30994, -31000, -31024, -30989, -30977, -30979, -31000, -30983, 2513, 8770, 8775, 8786, 8775, 3235, 30507, -18192, 28562, 25508, -20180, 19313, 24561, 18993, 17379, 14454, 14458, 14449, 14448, 14448, 14449, 14460, 14433, 14410, 14434, 14458, 14439, 14449, 14410, 14434, 14439, 14452, 14437, 14410, 14435, 14460, 14448, 14434, 14448, 14439, -18833, -24119, 20076, 14438, 14452, 14435, 14448, 14406, 14433, 14452, 14433, 14448, 14426, 14459, 14407, 14448, 14438, 14432, 14457, 14433, 14433, 14460, 14433, 14457, 14448, 14438, 14444, 14459, 14433, 14452, 14445, 14419, 14460, 14457, 14448, 14427, 14452, 14456, 14448, 14438, 14432, 14437, 14437, 14458, 14439, 14433, 14425, 14458, 14454, 14452, 14433, 14448, 14438, 14452, 14435, 14448, 14449, 14420, 14438, 14405, 14452, 14433, 14461, 14433, 14448, 14445, 14433, 14410, 14435, 14460, 14448, 14434, 14448, 14439, 14410, 14438, 14452, 14435, 14448, 14410, 14452, 14438, 14410, 14437, 14452, 14433, 14461, 14456, 14448, 14433, 14461, 14458, 14449, 14456, 14448, 14456, 14458, 14439, 14444, 14403, 14460, 14448, 14434, 14448, 14439, 14433, 14448, 14445, 14433, 14403, 14460, 14448, 14434, 14448, 14439, 14410, 14438, 14439, 14454, 14433, 14448, 14445, 14433, 14403, 14460, 14448, 14434, 14448, 14439, 14410, 14449, 14452, 14433, 14452, 17395, -19907, 16435, 14433, 14448, 14445, 14433, 14403, 14460, 14448, 14434, 14448, 14439, 14410, 14449, 14448, 14454, 14397, 14378, 14456, 14396, 14411, 14414, 14389, 14364, 14408, 14399, 14394, 14394, 14389, 14424, 14420, 14407, 14430, 14410, 14397, 14422, 14425, 14420, 14406, 14406, 14441, 14419, 14428, 14416, 14425, 14417, 14441, 14424, 14416, 14401, 14429, 14426, 14417, 14396, 14410, 14397, 14406, 14401, 14420, 14407, 14401, 14441, 14416, 14427, 14417, 14396, 14395, 14399, 14378, 14367, 8351, 18646, -32448, 18982, -29813, -26232, 25400, 17132, -25801, 27049, 17101, 25597, 32119, 596, 8153, -2876, 3312, -7175, -3748, -7375, 13647, 5171, -1001, 3602, -7382, -6414, 13985, 15821, 13278, 7088, -633, 5804, 7671, 13655, 2438, 1034, 2653, 15090, -2932, 16154, -3201, 3719, -810, 15415, -5213, -1164, -290, 2215, 12218, 15974, 6001, -16985, -16977, -16985, -16987, -16968, -16973, -16996, -16989, -16977, -16963, -16977, -16968, -16998, -16981, -16962, -16990, -16985, -16977, -16985, -16987, -16968, -16973, -16996, -16989, -16977, -16963, -16977, -16968, -16924, -16985, -16977, -16985, -16987, -16968, -16973, -16921, -16967, -16962, -16981, -16962, -16977, 4702, -17717, -17670, -17689, -17685, -17719, -17674, -17670, -17688, -17670, -17683};

    /* JADX INFO: renamed from: ᩹᩷, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f15587 = 0;

    /* JADX INFO: renamed from: ֫᩷, reason: not valid java name and contains not printable characters */
    public int f15588;

    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public C20956 f15589;

    /* JADX INFO: renamed from: ۧ᩷, reason: not valid java name and contains not printable characters */
    public boolean f15590;

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public boolean f15591;

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public byte f15592;

    /* JADX INFO: renamed from: ܶ᩷, reason: not valid java name and contains not printable characters */
    public C24132 f15593;

    /* JADX INFO: renamed from: ܺ᩷, reason: not valid java name and contains not printable characters */
    public String f15594;

    /* JADX INFO: renamed from: ܽ᩷, reason: not valid java name and contains not printable characters */
    public boolean f15595;

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public C23582 f15596;

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public boolean f15597 = false;

    /* JADX INFO: renamed from: ᩻᩷, reason: not valid java name and contains not printable characters */
    public String f15598;

    @Override // l.AbstractActivityC17204
    /* JADX INFO: renamed from: ᩶ */
    public final String mo122() {
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
        int i6 = -200095363;
        int i7 = C1080.f3865;
        int i8 = AbstractC0116.f1064;
        int iM3169 = (C0773.m3169("᩵ۧ") + i8) * (-117);
        int i9 = ((iM3169 ^ i7) * 5419) ^ 629662426;
        int i10 = 735164373;
        while (true) {
            i6 = ((((i6 ^ i7) * (-25319)) >> 31) & i9) ^ (iM3169 ^ i10);
            switch (i6) {
                case -2022369063:
                case 491410936:
                    C2375.m8065();
                    C1321.m4852();
                    iM3169 = C0773.m3169("۬ۚ") ^ i7;
                    i9 = ((iM3169 ^ i8) * 9123) ^ 1043595218;
                    i10 = 1228516426;
                    break;
                case -1934918671:
                case 1673373071:
                    c = 448;
                    if (C0619.f2439) {
                        iM3169 = C0773.m3169("۬ۚ") ^ i7;
                        i9 = ((iM3169 ^ i8) * 9123) ^ 1043595218;
                        i10 = 1228516426;
                    } else {
                        iM3169 = C0619.m2761("ۢܿ") ^ i8;
                        i9 = ((iM3169 ^ i7) * 8383) ^ 489730360;
                        i10 = 1731383994;
                    }
                    break;
                case -1839257652:
                case 1840377072:
                    AbstractC0116.m1243();
                    return null;
                case -1463358520:
                case -651937214:
                    i4 = 47775;
                    iM3169 = C0619.m2761("ܰۧ") ^ i7;
                    i9 = ((iM3169 ^ i8) * (-19457)) ^ 1972287831;
                    i10 = 1334240509;
                    break;
                case -1400847385:
                case 526981116:
                    s2 = 1768;
                    if (C1826.f6190 <= 0) {
                        iM3169 = (C0773.m3169("ܿۘ") + i7) * (-107);
                        i9 = ((iM3169 ^ i8) * (-2631)) ^ (-604414097);
                        i10 = -2087816378;
                    } else {
                        iM3169 = C0773.m3169("᩶ۙ") ^ i8;
                        i9 = ((iM3169 ^ i7) * (-23057)) ^ (-1490238413);
                        i10 = -949488518;
                    }
                    break;
                case -1276439904:
                case 2003117382:
                    if (C0950.m3785() != 0) {
                        iM3169 = C0773.m3169("۬ۚ") ^ i7;
                        i9 = ((iM3169 ^ i8) * 9123) ^ 1043595218;
                        i10 = 1228516426;
                    } else {
                        iM3169 = (i8 - C0773.m3169("᩶᩸")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i9 = ((iM3169 ^ i7) * 11683) ^ 91604544;
                        i10 = 1812825011;
                    }
                    break;
                case -1270462113:
                case -943084687:
                    int i11 = i + i2;
                    i3 = i11 + i11;
                    if (C4238.m13540() <= 0) {
                        iM3169 = C0773.m3169("۬ۚ") ^ i7;
                        i9 = ((iM3169 ^ i8) * 9123) ^ 1043595218;
                        i10 = 1228516426;
                    } else {
                        iM3169 = C0619.m2761("ۢ֡") ^ i7;
                        i9 = ((iM3169 ^ i8) * 1951) ^ (-1526492626);
                        i10 = -1005610005;
                    }
                    break;
                case -1211745196:
                case 1663890331:
                    s = sArr[c];
                    if (C3033.f9831 >= 0) {
                        iM3169 = C0619.m2761("֡᩹") ^ i7;
                        i9 = ((iM3169 ^ i8) * (-20763)) ^ 2098525211;
                        i10 = -1519702982;
                    } else {
                        iM3169 = C0773.m3169("᩶᩶") ^ i7;
                        i9 = ((iM3169 ^ i8) * (-17197)) ^ 257715630;
                        i10 = -2033619692;
                    }
                    break;
                case -1015401755:
                case -598252337:
                    int i12 = s + s2;
                    if (i3 - (i12 * i12) < 0) {
                        iM3169 = (i8 - C0619.m2761("᩺ۢ")) * (-115);
                        i9 = ((iM3169 ^ i7) * (-5541)) ^ (-1346676520);
                        i10 = 2043120740;
                    } else {
                        iM3169 = (i7 - C0773.m3169("۬֡")) * (-53);
                        i9 = ((iM3169 ^ i8) * 17811) ^ (-268288579);
                        i10 = 993751865;
                    }
                    break;
                case -933847501:
                case 818331421:
                    if (C3033.f9831 >= 0) {
                        iM3169 = C0619.m2761("֡᩹") ^ i7;
                        i9 = ((iM3169 ^ i8) * (-20763)) ^ 2098525211;
                        i10 = -1519702982;
                    } else {
                        iM3169 = C0773.m3169("۬ۚ") ^ i7;
                        i9 = ((iM3169 ^ i8) * 9123) ^ 1043595218;
                        i10 = 1228516426;
                    }
                    break;
                case -363790336:
                case 455925188:
                    return RunnableC3646.m11809(sArr2, i5, 10, i4);
                case -145540091:
                case 529017921:
                    if (C1519.m5403()) {
                        iM3169 = (i7 - C0619.m2761("ᩳۤ")) * 39;
                        i9 = ((iM3169 ^ i8) * 20711) ^ (-1918752019);
                        i10 = 461136583;
                    } else {
                        iM3169 = C0619.m2761("֡᩹") ^ i7;
                        i9 = ((iM3169 ^ i8) * (-20763)) ^ 2098525211;
                        i10 = -1519702982;
                    }
                    break;
                case 416477294:
                case 1571583292:
                    i = s * s;
                    i2 = 3125824;
                    if (C3492.f12043 <= 0) {
                        iM3169 = C0773.m3169("֫ۡ") ^ i8;
                        i9 = ((iM3169 ^ i7) * 16559) ^ (-1119195291);
                        i10 = 1224260921;
                    } else {
                        iM3169 = C0773.m3169("᩵ۤ") ^ i8;
                        i9 = ((iM3169 ^ i7) * (-465)) ^ 1661020315;
                        i10 = -1009488446;
                    }
                    break;
                case 932036111:
                case 1385647027:
                    sArr = f15586;
                    if (C3077.f9998) {
                        iM3169 = (C0619.m2761("۬۠") + i8) * 19;
                        i9 = ((iM3169 ^ i7) * 32111) ^ (-1533281487);
                        i10 = 1024059425;
                    } else {
                        iM3169 = C0619.m2761("֡᩹") ^ i7;
                        i9 = ((iM3169 ^ i8) * (-20763)) ^ 2098525211;
                        i10 = -1519702982;
                    }
                    break;
                case 991973096:
                case 1290204691:
                    if (RunnableC0334.f1808 > 0) {
                        iM3169 = (C0773.m3169("ܿۘ") + i7) * (-107);
                        i9 = ((iM3169 ^ i8) * (-2631)) ^ (-604414097);
                        i10 = -2087816378;
                    } else {
                        iM3169 = C0773.m3169("۬ۚ") ^ i7;
                        i9 = ((iM3169 ^ i8) * 9123) ^ 1043595218;
                        i10 = 1228516426;
                    }
                    break;
                case 1440569069:
                case 2114826794:
                    C1564.m5509();
                    if (!RunnableC3646.f12471) {
                        iM3169 = C0773.m3169("ۨܽ") ^ i8;
                        i9 = ((iM3169 ^ i7) * (-25557)) ^ (-518249718);
                        i10 = -2090125264;
                    } else {
                        iM3169 = C0773.m3169("۬ۚ") ^ i7;
                        i9 = ((iM3169 ^ i8) * 9123) ^ 1043595218;
                        i10 = 1228516426;
                    }
                    break;
                case 1533988232:
                case 1934929073:
                    if (C11235.f35427 >= 0) {
                        iM3169 = C0773.m3169("ۨܽ") ^ i8;
                        i9 = ((iM3169 ^ i7) * (-25557)) ^ (-518249718);
                        i10 = -2090125264;
                    } else {
                        iM3169 = (i7 - C0619.m2761("ۡ۬")) * 61;
                        i9 = ((iM3169 ^ i8) * 12621) ^ 1647584565;
                        i10 = 1487278920;
                    }
                    break;
                case 1581276512:
                case 1938165084:
                    i4 = 36304;
                    iM3169 = C0619.m2761("ܰۧ") ^ i7;
                    i9 = ((iM3169 ^ i8) * (-19457)) ^ 1972287831;
                    i10 = 1334240509;
                    break;
                default:
                    sArr2 = f15586;
                    i5 = 449;
                    if (C2419.f7754 >= 0) {
                        iM3169 = (C0773.m3169("ܿۘ") + i7) * (-107);
                        i9 = ((iM3169 ^ i8) * (-2631)) ^ (-604414097);
                        i10 = -2087816378;
                    } else {
                        iM3169 = C0619.m2761("᩺᩸") ^ i8;
                        i9 = ((iM3169 ^ i7) * 31517) ^ 649728966;
                        i10 = 523333446;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0071  */
    /* JADX WARN: Code duplicated, block: B:49:0x01b5 A[PHI: r11
      0x01b5: PHI (r11v4 int) = (r11v3 int), (r11v2 int), (r11v2 int) binds: [B:48:0x01b3, B:24:0x00a4, B:9:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x01e9 A[PHI: r9 r10 r13 r14 r15
      0x01e9: PHI (r9v4 int) = (r9v3 int), (r9v2 int) binds: [B:52:0x01e7, B:28:0x00ca] A[DONT_GENERATE, DONT_INLINE]
      0x01e9: PHI (r10v4 short) = (r10v3 short), (r10v2 short) binds: [B:52:0x01e7, B:28:0x00ca] A[DONT_GENERATE, DONT_INLINE]
      0x01e9: PHI (r13v3 short[]) = (r13v2 short[]), (r13v4 short[]) binds: [B:52:0x01e7, B:28:0x00ca] A[DONT_GENERATE, DONT_INLINE]
      0x01e9: PHI (r14v3 int) = (r14v2 int), (r14v4 int) binds: [B:52:0x01e7, B:28:0x00ca] A[DONT_GENERATE, DONT_INLINE]
      0x01e9: PHI (r15v3 int) = (r15v2 int), (r15v4 int) binds: [B:52:0x01e7, B:28:0x00ca] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x021e A[PHI: r4 r7 r8
      0x021e: PHI (r4v3 byte) = (r4v2 byte), (r4v2 byte), (r4v2 byte), (r4v5 byte) binds: [B:56:0x021c, B:15:0x006b, B:12:0x0062, B:6:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x021e: PHI (r7v4 short) = (r7v3 short), (r7v2 short), (r7v2 short), (r7v2 short) binds: [B:56:0x021c, B:15:0x006b, B:12:0x0062, B:6:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x021e: PHI (r8v4 short) = (r8v3 short), (r8v2 short), (r8v2 short), (r8v2 short) binds: [B:56:0x021c, B:15:0x006b, B:12:0x0062, B:6:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x0289 A[PHI: r2 r3 r6 r20
      0x0289: PHI (r2v4 l.ᩳ֫ܺ) = (r2v2 l.ᩳ֫ܺ), (r2v2 l.ᩳ֫ܺ), (r2v2 l.ᩳ֫ܺ), (r2v3 l.ᩳ֫ܺ), (r2v2 l.ᩳ֫ܺ) binds: [B:68:0x0287, B:64:0x026b, B:60:0x024f, B:33:0x0106, B:12:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x0289: PHI (r3v4 int) = (r3v2 int), (r3v2 int), (r3v2 int), (r3v3 int), (r3v2 int) binds: [B:68:0x0287, B:64:0x026b, B:60:0x024f, B:33:0x0106, B:12:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x0289: PHI (r6v4 char) = (r6v2 char), (r6v2 char), (r6v3 char), (r6v2 char), (r6v2 char) binds: [B:68:0x0287, B:64:0x026b, B:60:0x024f, B:33:0x0106, B:12:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x0289: PHI (r20v5 short[]) = (r20v3 short[]), (r20v4 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]) binds: [B:68:0x0287, B:64:0x026b, B:60:0x024f, B:33:0x0106, B:12:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m13684(ActivityC4300 activityC4300, DialogInterfaceC8327 dialogInterfaceC8327) {
        int iM3169;
        int i;
        int i2;
        int i3 = C3099.f10023;
        int i4 = C3779.f12953;
        int iM2761 = (C0619.m2761("ۜۢ") + i3) * 25;
        int i5 = ((iM2761 ^ i4) * 29735) ^ 1270408817;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM2761 ^ (-2144383551);
        InterfaceC18752 interfaceC18752M8173 = null;
        int i7 = 0;
        byte b = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i8 = 0;
        short s3 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = -1401549606;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i4) * 265) >> 31));
            switch (i13) {
                case -2018521783:
                case -1971527880:
                    s = sArr[c];
                    s2 = 51648;
                    if (C1343.f4799 != 0) {
                        iM3169 = C0619.m2761("ۛ᩵") ^ i4;
                        i = ((iM3169 ^ i3) * 3799) ^ 832838925;
                        i2 = 1532996732;
                    } else {
                        iM3169 = (C0773.m3169("֨ۘ") ^ i4) * (-93);
                        i = ((iM3169 ^ i3) * 21999) ^ (-1924658777);
                        i2 = -47601919;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1934662332:
                case 2007140799:
                    i10 = 25806;
                    iM3169 = (i3 - C0773.m3169("ۜ֡")) * (-35);
                    i = ((iM3169 ^ i4) * (-1229)) ^ (-1347700884);
                    i2 = -1684880122;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1537876250:
                case 2002211355:
                    C11235.m28311(dialogInterfaceC8327);
                    if (activityC4300.f15592 == activityC4300.f15588) {
                        iM3169 = (C0619.m2761("᩻ۘ") ^ i3) * 21;
                        i = ((iM3169 ^ i4) * (-1007)) ^ (-1438351007);
                        i2 = 1442916865;
                    } else {
                        iM3169 = C0773.m3169("ۖ᩺") ^ i4;
                        i = ((iM3169 ^ i3) * 18465) ^ 1155321037;
                        i2 = -601367387;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1512954480:
                case 1102844161:
                    C1321.m4852();
                    if (C0862.f3233 == 0) {
                        iM3169 = C0619.m2761("ۛ᩵") ^ i4;
                        i = ((iM3169 ^ i3) * 3799) ^ 832838925;
                        i2 = 1532996732;
                    } else {
                        iM3169 = C0773.m3169("ᩳ֨") ^ i3;
                        i = ((iM3169 ^ i4) * 7961) ^ 147529936;
                        i2 = 437422712;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1003612415:
                case 1935235225:
                    activityC4300.setResult(2);
                    super.finish();
                    break;
                case -942397437:
                case 1983821600:
                    C2834.m9344();
                    if (AbstractC0641.f2496 < 0) {
                        iM3169 = (i4 - C0619.m2761("᩶ۖ")) * (-15);
                        i = ((iM3169 ^ i3) * 15207) ^ (-890134904);
                        i2 = -1432696097;
                    } else {
                        iM3169 = C0773.m3169("ۧۡ") ^ i4;
                        i = ((iM3169 ^ i3) * (-19889)) ^ (-1899679449);
                        i2 = 1747227885;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -858595034:
                case 1111705963:
                    C20932.m47848();
                    if (C0862.f3233 != 0) {
                        iM3169 = (i4 - C0619.m2761("᩶ۖ")) * (-15);
                        i = ((iM3169 ^ i3) * 15207) ^ (-890134904);
                        i2 = -1432696097;
                    } else {
                        iM3169 = C0619.m2761("ۛ᩵") ^ i4;
                        i = ((iM3169 ^ i3) * 3799) ^ 832838925;
                        i2 = 1532996732;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -639064125:
                case 1278405473:
                    sArr2 = f15586;
                    i11 = 27;
                    i12 = 20;
                    if (C3690.m11987()) {
                        iM3169 = C0619.m2761("ܿۧ") ^ i3;
                        i = ((iM3169 ^ i4) * 20175) ^ 314353259;
                        i2 = 778873390;
                    } else {
                        iM3169 = (C0619.m2761("ܶ᩵") + i4) * 23;
                        i = ((iM3169 ^ i3) * (-26065)) ^ 1859387618;
                        i2 = 1402253215;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -505982645:
                case 859169891:
                    if ((i9 * i9) - i8 >= 0) {
                        iM3169 = (i4 - C0619.m2761("᩵ܳ")) * (-13);
                        i = ((iM3169 ^ i3) * (-16413)) ^ (-1919437788);
                        i2 = -1926739367;
                    } else {
                        iM3169 = (C0773.m3169("᩺֫") + i3) * 119;
                        i = ((iM3169 ^ i4) * (-8415)) ^ 2081624380;
                        i2 = 1739593582;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -498863205:
                case 1925651376:
                    C11235.m28309();
                    iM3169 = (i4 - C0619.m2761("᩶ۖ")) * (-15);
                    i = ((iM3169 ^ i3) * 15207) ^ (-890134904);
                    i2 = -1432696097;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -279783844:
                case 1265650965:
                    C11235.m28308(interfaceC18752M8173.mo3485(b, C1519.m5399(sArr2, i11, i12, i10)));
                    if (C20932.m47848() != 0) {
                        iM3169 = C0773.m3169("ۧۡ") ^ i4;
                        i = ((iM3169 ^ i3) * (-19889)) ^ (-1899679449);
                        i2 = 1747227885;
                    } else {
                        iM3169 = (C0773.m3169("᩵᩺") ^ i3) * 29;
                        i = ((iM3169 ^ i4) * (-16933)) ^ (-1592040573);
                        i2 = -982552330;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -172004361:
                case 563351406:
                    interfaceC18752M8173 = C2419.m8173(ApplicationC17729.f58258);
                    i7 = activityC4300.f15588;
                    if (C3077.f9998) {
                        iM3169 = (C0619.m2761("ܽۖ") + i3) * (-101);
                        i = ((iM3169 ^ i4) * (-9889)) ^ 1051847284;
                        i2 = 1585100665;
                    } else {
                        iM3169 = C0773.m3169("ᩳ֨") ^ i3;
                        i = ((iM3169 ^ i4) * 7961) ^ 147529936;
                        i2 = 437422712;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 97944014:
                case 1347773519:
                    c = 26;
                    if (C2485.f7950 != 0) {
                        iM3169 = C0773.m3169("ᩳ֨") ^ i3;
                        i = ((iM3169 ^ i4) * 7961) ^ 147529936;
                        i2 = 437422712;
                    } else {
                        iM3169 = C0773.m3169("֫֨") ^ i3;
                        i = ((iM3169 ^ i4) * 13883) ^ (-675654418);
                        i2 = -768700189;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 160163352:
                case 509119955:
                    i8 = s * s2;
                    s3 = 12912;
                    if (C2023.f6737) {
                        iM3169 = C0619.m2761("ܿۧ") ^ i3;
                        i = ((iM3169 ^ i4) * 20175) ^ 314353259;
                        i2 = 778873390;
                    } else {
                        iM3169 = C0619.m2761("ۡۙ") ^ i3;
                        i = ((iM3169 ^ i4) * (-11409)) ^ (-1115582636);
                        i2 = 540010732;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 200852383:
                case 1850029649:
                    i10 = 8749;
                    iM3169 = (i3 - C0773.m3169("ۜ֡")) * (-35);
                    i = ((iM3169 ^ i4) * (-1229)) ^ (-1347700884);
                    i2 = -1684880122;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 352352326:
                case 1756754902:
                    break;
                case 382628837:
                case 888843462:
                    sArr = f15586;
                    if (C1542.f5343 <= 0) {
                        iM3169 = C0773.m3169("ᩳ֨") ^ i3;
                        i = ((iM3169 ^ i4) * 7961) ^ 147529936;
                        i2 = 437422712;
                    } else {
                        iM3169 = (C0773.m3169("ۧۧ") ^ i4) * 61;
                        i = ((iM3169 ^ i3) * 31669) ^ (-833336231);
                        i2 = -1191016527;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 536914669:
                case 1452929386:
                    if (C0862.f3233 != 0) {
                        iM3169 = C0773.m3169("ᩳ֨") ^ i3;
                        i = ((iM3169 ^ i4) * 7961) ^ 147529936;
                        i2 = 437422712;
                    } else {
                        iM3169 = C0773.m3169("᩶ܿ") ^ i3;
                        i = ((iM3169 ^ i4) * 17141) ^ (-48644178);
                        i2 = 1823174089;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 987362921:
                case 1744545201:
                    C2834.m9344();
                    break;
                case 2021510770:
                case 2074120446:
                    i9 = s + s3;
                    if (C20932.f66974 <= 0) {
                        iM3169 = C0773.m3169("ۧۡ") ^ i4;
                        i = ((iM3169 ^ i3) * (-19889)) ^ (-1899679449);
                        i2 = 1747227885;
                    } else {
                        iM3169 = C0773.m3169("ܽۘ") ^ i4;
                        i = ((iM3169 ^ i3) * 14203) ^ (-234193183);
                        i2 = 447568494;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                default:
                    b = (byte) i7;
                    if (C2287.f7432 >= 0) {
                        iM3169 = C0619.m2761("ۛ᩵") ^ i4;
                        i = ((iM3169 ^ i3) * 3799) ^ 832838925;
                        i2 = 1532996732;
                    } else {
                        iM3169 = C0773.m3169("ۘ۠") ^ i4;
                        i = ((iM3169 ^ i3) * 21089) ^ 1840832794;
                        i2 = 1705666911;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    private byte[] m13692() {
        int iM2761;
        int i;
        C24132 c24132 = null;
        boolean z = false;
        int i2 = 60434826;
        int i3 = C1564.f5401;
        int i4 = C3779.f12953;
        int iM2762 = C0619.m2761("۫᩸") ^ i3;
        int i5 = ((iM2762 ^ i4) * 7021) ^ (-927842221);
        int i6 = -1188607593;
        while (true) {
            int i7 = iM2762 ^ i6;
            C6178 c6178 = null;
            while (true) {
                i2 = ((((i2 ^ i4) * (-5419)) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -1873497491:
                    case -1317842552:
                        c24132 = this.f15593;
                        z = false;
                        if (C3779.f12953 > 0) {
                            iM2761 = (i4 - C0773.m3169("۬ۨ")) * (-101);
                            i5 = ((iM2761 ^ i3) * 14683) ^ (-1085867303);
                            i = 5923786;
                            i7 = iM2761 ^ i;
                        } else {
                            iM2762 = (C0773.m3169("ۙۡ") ^ i4) * (-19);
                            i5 = ((iM2762 ^ i3) * 24091) ^ (-1246550158);
                            i6 = -1178662520;
                        }
                        break;
                    case -1830688361:
                    case 65790705:
                        AbstractC3624.m11762(c6178, this.f15592);
                        iM2761 = C0773.m3169("᩸֡") ^ i3;
                        i5 = ((iM2761 ^ i4) * 23647) ^ 1908256305;
                        i = -356488713;
                        i7 = iM2761 ^ i;
                        break;
                    case -1797588878:
                    case -1754903468:
                        c24132.m53910(c6178, z);
                        return c6178.m17799();
                    case -1700800216:
                    case 769999164:
                        C23916.m53419();
                        if (C3492.f12043 <= 0) {
                            iM2762 = C0773.m3169("ۗܺ") ^ i4;
                            i5 = ((iM2762 ^ i3) * 5797) ^ (-1698615961);
                            i6 = 1148588125;
                        } else {
                            iM2762 = (C0773.m3169("ۙۡ") ^ i4) * (-19);
                            i5 = ((iM2762 ^ i3) * 24091) ^ (-1246550158);
                            i6 = -1178662520;
                        }
                        break;
                    case -1549347045:
                    case -721874169:
                        C20932.m47848();
                        C4282.m13644();
                        iM2762 = (C0773.m3169("ۙۡ") ^ i4) * (-19);
                        i5 = ((iM2762 ^ i3) * 24091) ^ (-1246550158);
                        i6 = -1178662520;
                        break;
                    case -1011853111:
                    case -249113390:
                        if (C3033.f9831 >= 0) {
                            iM2762 = C0773.m3169("ۗܺ") ^ i4;
                            i5 = ((iM2762 ^ i3) * 5797) ^ (-1698615961);
                            i6 = 1148588125;
                        } else {
                            if (!RunnableC1848.m6360() && C0269.f1558 > 0) {
                                if (C3998.f13671 != 0) {
                                    iM2762 = C0773.m3169("ܿ֡") ^ i3;
                                    i5 = ((iM2762 ^ i4) * 18917) ^ (-644267233);
                                    i6 = -1368517386;
                                } else {
                                    if (RunnableC3055.f9898 < 0 && !C2023.f6737) {
                                        if (C0950.f3488 < 0) {
                                            if (C1783.m6232()) {
                                                c6178 = new C6178();
                                                if (C2375.f7641 > 0) {
                                                    iM2761 = (C0619.m2761("֡۫") ^ i4) * (-99);
                                                    i5 = ((iM2761 ^ i3) * 8011) ^ 1498988071;
                                                    i = -463117154;
                                                    i7 = iM2761 ^ i;
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    iM2762 = (C0773.m3169("ۙۡ") ^ i4) * (-19);
                                    i5 = ((iM2762 ^ i3) * 24091) ^ (-1246550158);
                                    i6 = -1178662520;
                                }
                            }
                            iM2762 = (i4 - C0773.m3169("ᩳܽ")) * (-3);
                            i5 = ((iM2762 ^ i3) * 19841) ^ 309610235;
                            i6 = 434076916;
                        }
                        break;
                    case 230292722:
                    case 507508608:
                        c6178.m17789(this.f15591);
                        if (this.f15591) {
                            iM2761 = C0773.m3169("ۜۨ") ^ i3;
                            i5 = ((iM2761 ^ i4) * 10757) ^ (-1266261429);
                            i = -394865752;
                        } else {
                            iM2761 = C0773.m3169("᩸֡") ^ i3;
                            i5 = ((iM2761 ^ i4) * 23647) ^ 1908256305;
                            i = -356488713;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case 743566801:
                    case 1844351528:
                        if (!RunnableC1848.f6235) {
                            iM2762 = C0773.m3169("ܿ֡") ^ i3;
                            i5 = ((iM2762 ^ i4) * 18917) ^ (-644267233);
                            i6 = -1368517386;
                        } else {
                            iM2761 = (i3 - C0773.m3169("᩹֫")) * (-41);
                            i5 = ((iM2761 ^ i4) * (-4645)) ^ (-164517535);
                            i = 980331766;
                            i7 = iM2761 ^ i;
                        }
                        break;
                    case 1497458811:
                    case 1683987841:
                        if (!RunnableC1848.f6235) {
                            iM2762 = C0773.m3169("ܿ֡") ^ i3;
                            i5 = ((iM2762 ^ i4) * 18917) ^ (-644267233);
                            i6 = -1368517386;
                        } else {
                            iM2762 = (C0773.m3169("ۙۡ") ^ i4) * (-19);
                            i5 = ((iM2762 ^ i3) * 24091) ^ (-1246550158);
                            i6 = -1178662520;
                        }
                        break;
                    default:
                        C0269.m1775();
                        return null;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0081, code lost:
    
        if (l.RunnableC3055.f9898 >= 0) goto L14;
     */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onCreateOptionsMenu(android.view.Menu r29) {
        /*
            Method dump skipped, instruction units count: 1062
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ActivityC4300.onCreateOptionsMenu(android.view.Menu):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r29v13 */
    /* JADX WARN: Type inference failed for: r29v24 */
    /* JADX WARN: Type inference failed for: r29v27 */
    /* JADX WARN: Type inference failed for: r29v28 */
    /* JADX WARN: Type inference failed for: r29v32 */
    /* JADX WARN: Type inference failed for: r29v33 */
    /* JADX WARN: Type inference failed for: r29v34 */
    /* JADX WARN: Type inference failed for: r29v35 */
    /* JADX WARN: Type inference failed for: r29v38 */
    /* JADX WARN: Type inference failed for: r29v39 */
    /* JADX WARN: Type inference failed for: r29v41 */
    /* JADX WARN: Type inference failed for: r29v43 */
    /* JADX WARN: Type inference failed for: r29v44 */
    /* JADX WARN: Type inference failed for: r29v45 */
    /* JADX WARN: Type inference failed for: r29v48 */
    /* JADX WARN: Type inference failed for: r29v49 */
    /* JADX WARN: Type inference failed for: r29v50 */
    /* JADX WARN: Type inference failed for: r29v51 */
    /* JADX WARN: Type inference failed for: r29v52 */
    /* JADX WARN: Type inference failed for: r29v53 */
    /* JADX WARN: Type inference failed for: r29v54 */
    /* JADX WARN: Type inference failed for: r29v55 */
    /* JADX WARN: Type inference failed for: r29v56 */
    /* JADX WARN: Type inference failed for: r29v57 */
    /* JADX WARN: Type inference failed for: r29v58 */
    /* JADX WARN: Type inference failed for: r29v59 */
    /* JADX WARN: Type inference failed for: r29v60 */
    /* JADX WARN: Type inference failed for: r29v61 */
    /* JADX WARN: Type inference failed for: r35v2 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v50 */
    /* JADX WARN: Type inference failed for: r4v55 */
    /* JADX WARN: Type inference failed for: r4v60 */
    /* JADX WARN: Type inference failed for: r4v61 */
    /* JADX WARN: Type inference failed for: r4v62 */
    /* JADX WARN: Type inference failed for: r4v63 */
    /* JADX WARN: Type inference failed for: r4v64 */
    /* JADX WARN: Type inference failed for: r4v65 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        ?? r4;
        int iM3169;
        int i;
        int i2;
        short[] sArr;
        int i3;
        int i4;
        ?? r29;
        int i5;
        int i6;
        ?? r210;
        int iM31610;
        int i7;
        int i8;
        int iM31611;
        int i9;
        AbstractC22044 abstractC22044;
        C2361 c2361;
        DialogInterface.OnClickListener onClickListener;
        int iM2761;
        int i10;
        int i11;
        int i12;
        int iM31612;
        int i13;
        int i14;
        ?? r211;
        ?? r212;
        AbstractC22044 abstractC22044M4846 = null;
        int i15 = -522795076;
        int i16 = C2354.f7599;
        int i17 = C2419.f7754;
        int iM2762 = C0619.m2761("᩹۠") ^ i16;
        int i18 = ((iM2762 ^ i17) * 1233) ^ 1993109779;
        int i19 = iM2762 ^ (-601262717);
        DialogInterface.OnClickListener onClickListener2 = null;
        final DialogInterfaceC8327 dialogInterfaceC8327M34866 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int iM8344 = 0;
        boolean z = false;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        short s = 0;
        short s2 = 0;
        int iM31613 = 0;
        int iM31614 = 0;
        int i25 = 0;
        int i26 = 0;
        C2361 c2362 = null;
        String strM9670 = null;
        int i27 = 0;
        String parent = null;
        C20956 c20956 = null;
        int iM2763 = 0;
        while (true) {
            i15 = i19 ^ (i18 & (((i15 ^ i17) * 14025) >> 31));
            switch (i15) {
                case -2147426016:
                case -1984576722:
                    this.f15596.m52816();
                    return z;
                case -1990087269:
                case 2128819564:
                    return i27;
                case -1923572980:
                case 201000527:
                    this.f15596.m52814();
                    return z;
                case -1841614640:
                case 688525204:
                    i22 = 24912;
                    iM31611 = (C0773.m3169("᩻֨") + i17) * (-113);
                    i5 = ((iM31611 ^ i16) * 30623) ^ (-1259010404);
                    i9 = 614137702;
                    r211 = i27;
                    i6 = iM31611 ^ i9;
                    i26 = i26;
                    i20 = i20;
                    sArr4 = sArr4;
                    sArr2 = sArr2;
                    i25 = i25;
                    r29 = r211;
                    c2362 = c2362;
                    onClickListener2 = onClickListener2;
                    abstractC22044M4846 = abstractC22044M4846;
                    ?? r35 = r29;
                    i19 = i6;
                    i18 = i5;
                    i27 = r35 == true ? 1 : 0;
                    break;
                case -1805694740:
                case -659182646:
                    this.f15596.m52806(ActivityC18470.class);
                    return z;
                case -1787998096:
                case 1392511654:
                    abstractC22044M4846 = abstractC22044M4846;
                    c2362 = c2362;
                    onClickListener2 = onClickListener2;
                    short[] sArr5 = sArr2;
                    int i28 = i25;
                    int i29 = i20;
                    short[] sArr6 = sArr4;
                    int i30 = i26;
                    r4 = 0;
                    if (iM8344 == (C0619.m2761(AbstractC3624.m11769(f15586, 373, 3, i22)) ^ 2130080757)) {
                        iM3169 = C0773.m3169("᩸ۤ") ^ i17;
                        i = ((iM3169 ^ i16) * (-28903)) ^ (-408289534);
                        i2 = -367743885;
                    } else {
                        iM3169 = C0773.m3169("ۤۧ") ^ i16;
                        i = ((iM3169 ^ i17) * (-18499)) ^ 1984766246;
                        i2 = 920012728;
                    }
                    i19 = iM3169 ^ i2;
                    i18 = i;
                    i26 = i30;
                    i20 = i29;
                    sArr4 = sArr6;
                    sArr2 = sArr5;
                    i25 = i28;
                    c2362 = c2362;
                    onClickListener2 = onClickListener2;
                    i27 = r4;
                    abstractC22044M4846 = abstractC22044M4846;
                    break;
                case -1621288687:
                case 1650480789:
                    ?? r213 = i27;
                    i20 = i20;
                    abstractC22044M4846 = abstractC22044M4846;
                    onClickListener2 = onClickListener2;
                    sArr4 = sArr4;
                    int i31 = DialogInterfaceC8327.f27315;
                    C2361 c2363 = new C2361(this);
                    sArr2 = f15586;
                    i25 = 379;
                    i26 = 3;
                    if (C2878.f9462) {
                        c2362 = c2363;
                        r210 = r213;
                        int iM31615 = C0773.m3169("ܰ֨") ^ i17;
                        i5 = ((iM31615 ^ i16) * (-15063)) ^ (-1873386714);
                        i6 = iM31615 ^ (-81757952);
                        i20 = i20;
                        sArr4 = sArr4;
                        r29 = r210;
                        c2362 = c2362;
                        onClickListener2 = onClickListener2;
                        abstractC22044M4846 = abstractC22044M4846;
                        ?? r36 = r29;
                        i19 = i6;
                        i18 = i5;
                        i27 = r36 == true ? 1 : 0;
                    } else {
                        int iM31616 = (C0773.m3169("۫ܿ") ^ i16) * 71;
                        sArr4 = sArr4;
                        onClickListener2 = onClickListener2;
                        abstractC22044M4846 = abstractC22044M4846;
                        c2362 = c2363;
                        i18 = ((iM31616 ^ i17) * (-22681)) ^ (-1499102241);
                        i20 = i20;
                        i19 = iM31616 ^ (-339972076);
                        i27 = r213;
                    }
                    break;
                case -1529654882:
                case 997878989:
                    abstractC22044M4846 = C1321.m4846(this.f15598, new String[i27]);
                    c20956 = this.f15589;
                    parent = abstractC22044M4846.getParent();
                    if (C2419.m8174() < 0) {
                        iM31612 = (i17 - C0773.m3169("ᩳܺ")) * 17;
                        i13 = ((iM31612 ^ i16) * 6681) ^ (-675879589);
                        i14 = 593015669;
                        i19 = iM31612 ^ i14;
                        i18 = i13;
                    } else {
                        r212 = i27;
                        abstractC22044M4846 = abstractC22044M4846;
                        c2362 = c2362;
                        onClickListener2 = onClickListener2;
                        sArr2 = sArr2;
                        i25 = i25;
                        i20 = i20;
                        sArr4 = sArr4;
                        i26 = i26;
                        iM31611 = C0773.m3169("ܳܽ") ^ i16;
                        i5 = ((iM31611 ^ i17) * 14783) ^ (-341541501);
                        i9 = 620832244;
                        r211 = r212;
                        i6 = iM31611 ^ i9;
                        i26 = i26;
                        i20 = i20;
                        sArr4 = sArr4;
                        sArr2 = sArr2;
                        i25 = i25;
                        r29 = r211;
                        c2362 = c2362;
                        onClickListener2 = onClickListener2;
                        abstractC22044M4846 = abstractC22044M4846;
                        ?? r37 = r29;
                        i19 = i6;
                        i18 = i5;
                        i27 = r37 == true ? 1 : 0;
                    }
                    break;
                case -1513148120:
                case 258228938:
                    ?? r214 = i27;
                    abstractC22044M4846 = abstractC22044M4846;
                    c2362 = c2362;
                    onClickListener2 = onClickListener2;
                    sArr2 = sArr2;
                    i25 = i25;
                    i20 = i20;
                    sArr4 = sArr4;
                    i26 = i26;
                    if ((s * s2) - ((s * s) + 297390025) <= 0) {
                        iM31611 = C0773.m3169("ۛᩳ") ^ i17;
                        i5 = ((iM31611 ^ i16) * 7789) ^ 1130050942;
                        i9 = 441196450;
                        r211 = r214;
                    } else {
                        iM31611 = C0619.m2761("᩸ܰ") ^ i16;
                        i5 = ((iM31611 ^ i17) * (-1135)) ^ 1898528833;
                        i9 = -343248717;
                        r211 = r214;
                    }
                    i6 = iM31611 ^ i9;
                    i26 = i26;
                    i20 = i20;
                    sArr4 = sArr4;
                    sArr2 = sArr2;
                    i25 = i25;
                    r29 = r211;
                    c2362 = c2362;
                    onClickListener2 = onClickListener2;
                    abstractC22044M4846 = abstractC22044M4846;
                    ?? r38 = r29;
                    i19 = i6;
                    i18 = i5;
                    i27 = r38 == true ? 1 : 0;
                    break;
                case -1497984341:
                case -456056712:
                    ?? r215 = i27;
                    abstractC22044M4846 = abstractC22044M4846;
                    c2362 = c2362;
                    onClickListener2 = onClickListener2;
                    sArr2 = sArr2;
                    i20 = i20;
                    sArr4 = sArr4;
                    i26 = i26;
                    i25 = i25;
                    if (iM8344 == (C0773.m3169(C2966.m9670(f15586, 376, 3, i22)) ^ 2118164254)) {
                        iM31611 = C0773.m3169("ܽۡ") ^ i17;
                        i5 = ((iM31611 ^ i16) * (-21799)) ^ 744452510;
                        i9 = -1117087090;
                        r211 = r215;
                    } else {
                        iM31611 = (C0619.m2761("֫ۧ") ^ i16) * (-117);
                        i5 = ((iM31611 ^ i17) * 3355) ^ 841614069;
                        i9 = -1452283679;
                        r211 = r215;
                    }
                    i6 = iM31611 ^ i9;
                    i26 = i26;
                    i20 = i20;
                    sArr4 = sArr4;
                    sArr2 = sArr2;
                    i25 = i25;
                    r29 = r211;
                    c2362 = c2362;
                    onClickListener2 = onClickListener2;
                    abstractC22044M4846 = abstractC22044M4846;
                    ?? r39 = r29;
                    i19 = i6;
                    i18 = i5;
                    i27 = r39 == true ? 1 : 0;
                    break;
                case -1485930339:
                case 1280098025:
                    finish();
                    return z;
                case -1454391656:
                case -753255142:
                    setResult(2);
                    super.finish();
                    return z;
                case -1431877787:
                case -313912086:
                    abstractC22044M4846 = abstractC22044M4846;
                    if (iM8344 == (C0619.m2761(C1564.m5510(f15586, 388, 3, i22)) ^ 2127857423)) {
                        iM31610 = C0773.m3169("۫ܰ") ^ i17;
                        i7 = ((iM31610 ^ i16) * (-4029)) ^ 1510825406;
                        i8 = -2087970208;
                    } else {
                        iM31610 = (C0773.m3169("ۚ᩷") ^ i16) * (-33);
                        i7 = ((iM31610 ^ i17) * (-28181)) ^ 1726102499;
                        i8 = -649770798;
                    }
                    i19 = iM31610 ^ i8;
                    i18 = i7;
                    i27 = i27;
                    abstractC22044M4846 = abstractC22044M4846;
                    break;
                case -1342155123:
                case 329846616:
                    abstractC22044 = abstractC22044M4846;
                    c2361 = c2362;
                    onClickListener = onClickListener2;
                    dialogInterfaceC8327M34866 = C14442.m34866(c2361, C0773.m3169(C0773.m3166(sArr4, i23, i20, i22)) ^ 2129834028, onClickListener, i21, onClickListener);
                    if (C0619.f2439) {
                        iM2761 = (i16 - C0619.m2761("֡᩹")) * 31;
                        i10 = i20;
                        i11 = ((iM2761 ^ i17) * 29121) ^ (-37812961);
                        i12 = 1069635826;
                    } else {
                        iM2761 = (C0619.m2761("۬ܳ") ^ i17) * 45;
                        i10 = i20;
                        i11 = ((iM2761 ^ i16) * 29479) ^ (-1246675716);
                        i12 = -1724076747;
                    }
                    i19 = iM2761 ^ i12;
                    i18 = i11;
                    onClickListener2 = onClickListener;
                    i20 = i10;
                    abstractC22044M4846 = abstractC22044;
                    c2362 = c2361;
                    break;
                case -1251882482:
                case 2087133725:
                    RunnableC3646.m11813();
                    if (!C1783.m6232()) {
                        r210 = i27;
                        abstractC22044M4846 = abstractC22044M4846;
                        c2362 = c2362;
                        onClickListener2 = onClickListener2;
                        i20 = i20;
                        sArr4 = sArr4;
                        int iM31617 = C0773.m3169("ܰ֨") ^ i17;
                        i5 = ((iM31617 ^ i16) * (-15063)) ^ (-1873386714);
                        i6 = iM31617 ^ (-81757952);
                        i20 = i20;
                        sArr4 = sArr4;
                        r29 = r210;
                        c2362 = c2362;
                        onClickListener2 = onClickListener2;
                        abstractC22044M4846 = abstractC22044M4846;
                        ?? r310 = r29;
                        i19 = i6;
                        i18 = i5;
                        i27 = r310 == true ? 1 : 0;
                    } else {
                        abstractC22044 = abstractC22044M4846;
                        c2361 = c2362;
                        onClickListener = onClickListener2;
                        iM2761 = (i16 - C0619.m2761("֡᩹")) * 31;
                        i10 = i20;
                        i11 = ((iM2761 ^ i17) * 29121) ^ (-37812961);
                        i12 = 1069635826;
                        i19 = iM2761 ^ i12;
                        i18 = i11;
                        onClickListener2 = onClickListener;
                        i20 = i10;
                        abstractC22044M4846 = abstractC22044;
                        c2362 = c2361;
                    }
                    break;
                case -1191223440:
                case 891141184:
                    this.f15597 = z;
                    this.f15596.mo13072();
                    return z;
                case -1161336895:
                case 610857809:
                    abstractC22044M4846 = abstractC22044M4846;
                    if (iM8344 == (C0773.m3169(C23916.m53420(f15586, 391, 3, i22)) ^ 2122566350)) {
                        iM31610 = C0619.m2761("֨᩸") ^ i17;
                        i7 = ((iM31610 ^ i16) * (-12971)) ^ 648198452;
                        i8 = 1354933136;
                    } else {
                        iM31610 = C0773.m3169("ۚۡ") ^ i16;
                        i7 = ((iM31610 ^ i17) * (-9181)) ^ 2049328814;
                        i8 = -557286078;
                    }
                    i19 = iM31610 ^ i8;
                    i18 = i7;
                    i27 = i27;
                    abstractC22044M4846 = abstractC22044M4846;
                    break;
                case -1116326072:
                case 369447622:
                    abstractC22044M4846 = abstractC22044M4846;
                    c2362 = c2362;
                    i20 = i20;
                    sArr4 = sArr4;
                    C2485.m8345(c2362, iM31613);
                    String[] strArr = C11650.f37686;
                    byte b = this.f15592;
                    this.f15588 = b;
                    if (C2354.f7599 >= 0) {
                        int iM31618 = (C0773.m3169("۬ۧ") + i17) * 19;
                        i19 = iM31618 ^ (-329746628);
                        i18 = ((iM31618 ^ i16) * (-31049)) ^ (-608256055);
                        i20 = i20;
                        sArr4 = sArr4;
                        r4 = i27;
                        c2362 = c2362;
                        onClickListener2 = onClickListener2;
                        i27 = r4;
                        abstractC22044M4846 = abstractC22044M4846;
                    } else {
                        c2362.m8013(strArr, b, new DialogInterfaceOnClickListenerC23692(this, i27));
                        sArr3 = f15586;
                        if (C0862.f3233 != 0) {
                            onClickListener2 = null;
                            sArr = sArr2;
                            i3 = i25;
                            i4 = i26;
                            int iM2764 = C0619.m2761("᩷ۛ") ^ i16;
                            short[] sArr7 = sArr;
                            i18 = ((iM2764 ^ i17) * 4485) ^ (-1458383709);
                            i19 = iM2764 ^ (-2007172615);
                            i25 = i3;
                            i26 = i4;
                            i20 = i20;
                            sArr4 = sArr4;
                            sArr2 = sArr7;
                            r4 = i27;
                            c2362 = c2362;
                            onClickListener2 = onClickListener2;
                            i27 = r4;
                            abstractC22044M4846 = abstractC22044M4846;
                        } else {
                            int iM31619 = (C0773.m3169("ۗܺ") + i16) * (-71);
                            int i32 = ((iM31619 ^ i17) * (-14897)) ^ 965849938;
                            i19 = iM31619 ^ (-629608299);
                            i20 = i20;
                            abstractC22044M4846 = abstractC22044M4846;
                            c2362 = c2362;
                            onClickListener2 = null;
                            i18 = i32;
                            sArr4 = sArr4;
                        }
                    }
                    break;
                case -965779030:
                case 1279936404:
                    ?? r216 = i27;
                    abstractC22044M4846 = abstractC22044M4846;
                    c2362 = c2362;
                    onClickListener2 = onClickListener2;
                    sArr2 = sArr2;
                    i25 = i25;
                    i20 = i20;
                    sArr4 = sArr4;
                    i26 = i26;
                    s = f15586[369];
                    s2 = 34490;
                    if (!C3077.f9998) {
                        i26 = i26;
                        sArr2 = sArr2;
                        i25 = i25;
                        r210 = r216;
                        int iM316110 = C0773.m3169("ܰ֨") ^ i17;
                        i5 = ((iM316110 ^ i16) * (-15063)) ^ (-1873386714);
                        i6 = iM316110 ^ (-81757952);
                        i20 = i20;
                        sArr4 = sArr4;
                        r29 = r210;
                        c2362 = c2362;
                        onClickListener2 = onClickListener2;
                        abstractC22044M4846 = abstractC22044M4846;
                        ?? r311 = r29;
                        i19 = i6;
                        i18 = i5;
                        i27 = r311 == true ? 1 : 0;
                    } else {
                        iM31611 = C0773.m3169("۠ۖ") ^ i16;
                        i5 = ((iM31611 ^ i17) * 19591) ^ 616489622;
                        i9 = -1627090772;
                        r211 = r216;
                        i6 = iM31611 ^ i9;
                        i26 = i26;
                        i20 = i20;
                        sArr4 = sArr4;
                        sArr2 = sArr2;
                        i25 = i25;
                        r29 = r211;
                        c2362 = c2362;
                        onClickListener2 = onClickListener2;
                        abstractC22044M4846 = abstractC22044M4846;
                        ?? r312 = r29;
                        i19 = i6;
                        i18 = i5;
                        i27 = r312 == true ? 1 : 0;
                    }
                    break;
                case -861160861:
                case -624817069:
                    C2834.m9344();
                    if (C0487.m2356() < 0) {
                        iM31612 = (C0773.m3169("ܺ᩹") + i17) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i13 = ((iM31612 ^ i16) * 32331) ^ (-762860611);
                        i14 = -2132139330;
                        i19 = iM31612 ^ i14;
                        i18 = i13;
                    } else {
                        r212 = i27;
                        abstractC22044M4846 = abstractC22044M4846;
                        c2362 = c2362;
                        onClickListener2 = onClickListener2;
                        sArr2 = sArr2;
                        i25 = i25;
                        i20 = i20;
                        sArr4 = sArr4;
                        i26 = i26;
                        iM31611 = C0773.m3169("ܳܽ") ^ i16;
                        i5 = ((iM31611 ^ i17) * 14783) ^ (-341541501);
                        i9 = 620832244;
                        r211 = r212;
                        i6 = iM31611 ^ i9;
                        i26 = i26;
                        i20 = i20;
                        sArr4 = sArr4;
                        sArr2 = sArr2;
                        i25 = i25;
                        r29 = r211;
                        c2362 = c2362;
                        onClickListener2 = onClickListener2;
                        abstractC22044M4846 = abstractC22044M4846;
                        ?? r313 = r29;
                        i19 = i6;
                        i18 = i5;
                        i27 = r313 == true ? 1 : 0;
                    }
                    break;
                case -713704350:
                case -702367014:
                    abstractC22044M4846 = abstractC22044M4846;
                    if (iM8344 == (C0773.m3169(C4282.m13650(f15586, 397, 3, i22)) ^ 2126333300)) {
                        iM31610 = C0619.m2761("ۙۘ") ^ i17;
                        i7 = ((iM31610 ^ i16) * 28819) ^ (-467191343);
                        i8 = 142080949;
                    } else {
                        iM31610 = (i16 - C0773.m3169("᩵ܳ")) * 83;
                        i7 = ((iM31610 ^ i17) * 23245) ^ 1452354140;
                        i8 = -1291436866;
                    }
                    i19 = iM31610 ^ i8;
                    i18 = i7;
                    i27 = i27;
                    abstractC22044M4846 = abstractC22044M4846;
                    break;
                case -678176255:
                case 810903180:
                    boolean zM2349 = C0487.m2349(this.f15598);
                    abstractC22044M4846 = abstractC22044M4846;
                    iM2763 = C0619.m2761(C2354.m7980(f15586, 403, 3, i22)) ^ 2122691153;
                    if (zM2349) {
                        iM31610 = (i16 - C0773.m3169("ܿۘ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i7 = ((iM31610 ^ i17) * 8235) ^ 73463404;
                        i8 = 1320219273;
                    } else {
                        iM31610 = C0773.m3169("۬᩷") ^ i16;
                        i7 = ((iM31610 ^ i17) * 7153) ^ (-1085753006);
                        i8 = 884189445;
                    }
                    i19 = iM31610 ^ i8;
                    i18 = i7;
                    i27 = i27;
                    abstractC22044M4846 = abstractC22044M4846;
                    break;
                case -513366552:
                case 541397837:
                    abstractC22044M4846 = abstractC22044M4846;
                    c2362 = c2362;
                    onClickListener2 = onClickListener2;
                    sArr = sArr2;
                    i20 = i20;
                    sArr4 = sArr4;
                    i3 = i25;
                    i4 = i26;
                    iM31613 = C0773.m3169(C11235.m28300(sArr, i3, i4, i22)) ^ 2124675359;
                    if (C11235.f35427 < 0) {
                        int iM31620 = (C0773.m3169("ۗ֫") + i17) * 67;
                        r29 = i27;
                        i5 = ((iM31620 ^ i16) * (-8163)) ^ (-631324980);
                        i6 = iM31620 ^ (-1584008196);
                        i25 = i3;
                        i26 = i4;
                        i20 = i20;
                        sArr4 = sArr4;
                        sArr2 = sArr;
                        c2362 = c2362;
                        onClickListener2 = onClickListener2;
                        abstractC22044M4846 = abstractC22044M4846;
                        ?? r314 = r29;
                        i19 = i6;
                        i18 = i5;
                        i27 = r314 == true ? 1 : 0;
                    } else {
                        int iM2765 = C0619.m2761("᩷ۛ") ^ i16;
                        short[] sArr8 = sArr;
                        i18 = ((iM2765 ^ i17) * 4485) ^ (-1458383709);
                        i19 = iM2765 ^ (-2007172615);
                        i25 = i3;
                        i26 = i4;
                        i20 = i20;
                        sArr4 = sArr4;
                        sArr2 = sArr8;
                        r4 = i27;
                        c2362 = c2362;
                        onClickListener2 = onClickListener2;
                        i27 = r4;
                        abstractC22044M4846 = abstractC22044M4846;
                    }
                    break;
                case -492132721:
                case 1708348604:
                    C11235.m28299(RunnableC3055.m9932(dialogInterfaceC8327M34866), new View.OnClickListener() { // from class: l.ۗܽ᩸
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            ActivityC4300.m13684(this.f12178, dialogInterfaceC8327M34866);
                        }
                    });
                    return z;
                case -450083137:
                case -242209676:
                    ?? r217 = i27;
                    abstractC22044M4846 = abstractC22044M4846;
                    c2362 = c2362;
                    onClickListener2 = onClickListener2;
                    sArr2 = sArr2;
                    i25 = i25;
                    i20 = i20;
                    sArr4 = sArr4;
                    i26 = i26;
                    iM8344 = C2485.m8344(menuItem);
                    strM9670 = C2966.m9670(f15586, 370, 3, i22);
                    r212 = r217;
                    if (C2288.f7433 <= 0) {
                        iM31611 = C0773.m3169("ܳܽ") ^ i16;
                        i5 = ((iM31611 ^ i17) * 14783) ^ (-341541501);
                        i9 = 620832244;
                        r211 = r212;
                    } else {
                        iM31611 = C0773.m3169("᩵ۧ") ^ i17;
                        i5 = ((iM31611 ^ i16) * 19719) ^ 2017969922;
                        i9 = 1997877351;
                        r211 = r217;
                    }
                    i6 = iM31611 ^ i9;
                    i26 = i26;
                    i20 = i20;
                    sArr4 = sArr4;
                    sArr2 = sArr2;
                    i25 = i25;
                    r29 = r211;
                    c2362 = c2362;
                    onClickListener2 = onClickListener2;
                    abstractC22044M4846 = abstractC22044M4846;
                    ?? r315 = r29;
                    i19 = i6;
                    i18 = i5;
                    i27 = r315 == true ? 1 : 0;
                    break;
                case -336868472:
                case -150339928:
                    abstractC22044 = abstractC22044M4846;
                    c2361 = c2362;
                    onClickListener = onClickListener2;
                    i21 = iM31614 ^ i24;
                    sArr4 = f15586;
                    i23 = 385;
                    if (AbstractC0641.f2496 >= 0) {
                        i20 = 3;
                        iM2761 = (i16 - C0619.m2761("֡᩹")) * 31;
                        i10 = i20;
                        i11 = ((iM2761 ^ i17) * 29121) ^ (-37812961);
                        i12 = 1069635826;
                        i19 = iM2761 ^ i12;
                        i18 = i11;
                        onClickListener2 = onClickListener;
                        i20 = i10;
                        abstractC22044M4846 = abstractC22044;
                        c2362 = c2361;
                    } else {
                        int iM2766 = (C0619.m2761("֫ܶ") ^ i16) * 51;
                        i19 = iM2766 ^ (-789632295);
                        i18 = ((iM2766 ^ i17) * 9657) ^ 782908198;
                        c2362 = c2361;
                        onClickListener2 = onClickListener;
                        abstractC22044M4846 = abstractC22044;
                        i20 = 3;
                    }
                    break;
                case -259649034:
                case 753164262:
                    String strM12926 = C3998.m12926(abstractC22044M4846);
                    C17202.m40369(c20956);
                    C20956.m47908(c20956, iM2763, parent, strM12926, (String[]) null, 24);
                    return z;
                case -10368257:
                case 1921646789:
                    ?? r218 = i27;
                    abstractC22044M4846 = abstractC22044M4846;
                    c2362 = c2362;
                    onClickListener2 = onClickListener2;
                    sArr2 = sArr2;
                    i25 = i25;
                    i20 = i20;
                    sArr4 = sArr4;
                    i26 = i26;
                    z = true;
                    if (iM8344 == (C0773.m3169(strM9670) ^ 2129103227)) {
                        iM31611 = C0619.m2761("ۢ᩷") ^ i17;
                        i5 = ((iM31611 ^ i16) * (-9391)) ^ 1019686653;
                        i9 = 557355207;
                        r211 = r218;
                    } else {
                        iM31611 = (C0619.m2761("۬ۨ") + i16) * 119;
                        i5 = ((iM31611 ^ i17) * (-863)) ^ (-693765368);
                        i9 = -2006567196;
                        r211 = r218;
                    }
                    i6 = iM31611 ^ i9;
                    i26 = i26;
                    i20 = i20;
                    sArr4 = sArr4;
                    sArr2 = sArr2;
                    i25 = i25;
                    r29 = r211;
                    c2362 = c2362;
                    onClickListener2 = onClickListener2;
                    abstractC22044M4846 = abstractC22044M4846;
                    ?? r316 = r29;
                    i19 = i6;
                    i18 = i5;
                    i27 = r316 == true ? 1 : 0;
                    break;
                case 180588868:
                case 1938028111:
                    RunnableC3646.m11813();
                    if (C3492.f12043 <= 0) {
                        abstractC22044M4846 = abstractC22044M4846;
                        c2362 = c2362;
                        i20 = i20;
                        sArr4 = sArr4;
                        int iM316111 = (C0773.m3169("۬ۧ") + i17) * 19;
                        i19 = iM316111 ^ (-329746628);
                        i18 = ((iM316111 ^ i16) * (-31049)) ^ (-608256055);
                        i20 = i20;
                        sArr4 = sArr4;
                        r4 = i27;
                        c2362 = c2362;
                        onClickListener2 = onClickListener2;
                        i27 = r4;
                        abstractC22044M4846 = abstractC22044M4846;
                    } else {
                        abstractC22044 = abstractC22044M4846;
                        c2361 = c2362;
                        onClickListener = onClickListener2;
                        iM2761 = (i16 - C0619.m2761("֡᩹")) * 31;
                        i10 = i20;
                        i11 = ((iM2761 ^ i17) * 29121) ^ (-37812961);
                        i12 = 1069635826;
                        i19 = iM2761 ^ i12;
                        i18 = i11;
                        onClickListener2 = onClickListener;
                        i20 = i10;
                        abstractC22044M4846 = abstractC22044;
                        c2362 = c2361;
                    }
                    break;
                case 406833965:
                case 1445376600:
                    C17202.m40372();
                    if (C20932.m47848() == 0) {
                        iM31612 = (i16 - C0619.m2761("֡᩷")) * (-35);
                        i13 = ((iM31612 ^ i17) * (-22479)) ^ (-2055686413);
                        i14 = 1211743158;
                        i19 = iM31612 ^ i14;
                        i18 = i13;
                    } else {
                        r212 = i27;
                        abstractC22044M4846 = abstractC22044M4846;
                        c2362 = c2362;
                        onClickListener2 = onClickListener2;
                        sArr2 = sArr2;
                        i25 = i25;
                        i20 = i20;
                        sArr4 = sArr4;
                        i26 = i26;
                        iM31611 = C0773.m3169("ܳܽ") ^ i16;
                        i5 = ((iM31611 ^ i17) * 14783) ^ (-341541501);
                        i9 = 620832244;
                        r211 = r212;
                        i6 = iM31611 ^ i9;
                        i26 = i26;
                        i20 = i20;
                        sArr4 = sArr4;
                        sArr2 = sArr2;
                        i25 = i25;
                        r29 = r211;
                        c2362 = c2362;
                        onClickListener2 = onClickListener2;
                        abstractC22044M4846 = abstractC22044M4846;
                        ?? r317 = r29;
                        i19 = i6;
                        i18 = i5;
                        i27 = r317 == true ? 1 : 0;
                    }
                    break;
                case 459855229:
                case 1917316694:
                    C20956 c20957 = this.f15589;
                    String str = this.f15594;
                    String strM4058 = C1080.m4058(getTitle());
                    C17202.m40369(c20957);
                    C20956.m47908(c20957, iM2763, str, strM4058, (String[]) null, 24);
                    return z;
                case 755869027:
                case 794327534:
                    abstractC22044M4846 = abstractC22044M4846;
                    c2362 = c2362;
                    onClickListener2 = onClickListener2;
                    i20 = i20;
                    sArr4 = sArr4;
                    short[] sArr9 = sArr3;
                    iM31614 = C0773.m3169(C13473.m33137(sArr9, 382, 3, i22));
                    i24 = 2118625315;
                    if (!RunnableC1848.f6235) {
                        int iM2767 = (C0619.m2761("ۢ֡") + i17) * 33;
                        i19 = iM2767 ^ 2087183905;
                        i18 = ((iM2767 ^ i16) * 26855) ^ 136962639;
                        sArr3 = sArr9;
                        i20 = i20;
                        sArr4 = sArr4;
                        r4 = i27;
                        c2362 = c2362;
                        onClickListener2 = onClickListener2;
                        i27 = r4;
                        abstractC22044M4846 = abstractC22044M4846;
                    } else {
                        r210 = i27;
                        sArr3 = sArr9;
                        int iM316112 = C0773.m3169("ܰ֨") ^ i17;
                        i5 = ((iM316112 ^ i16) * (-15063)) ^ (-1873386714);
                        i6 = iM316112 ^ (-81757952);
                        i20 = i20;
                        sArr4 = sArr4;
                        r29 = r210;
                        c2362 = c2362;
                        onClickListener2 = onClickListener2;
                        abstractC22044M4846 = abstractC22044M4846;
                        ?? r318 = r29;
                        i19 = i6;
                        i18 = i5;
                        i27 = r318 == true ? 1 : 0;
                    }
                    break;
                case 836490776:
                case 2078884507:
                    i22 = 37373;
                    iM31611 = (C0773.m3169("᩻֨") + i17) * (-113);
                    i5 = ((iM31611 ^ i16) * 30623) ^ (-1259010404);
                    i9 = 614137702;
                    r211 = i27;
                    i6 = iM31611 ^ i9;
                    i26 = i26;
                    i20 = i20;
                    sArr4 = sArr4;
                    sArr2 = sArr2;
                    i25 = i25;
                    r29 = r211;
                    c2362 = c2362;
                    onClickListener2 = onClickListener2;
                    abstractC22044M4846 = abstractC22044M4846;
                    ?? r319 = r29;
                    i19 = i6;
                    i18 = i5;
                    i27 = r319 == true ? 1 : 0;
                    break;
                case 853684455:
                case 1145670298:
                    RunnableC3055.m9933();
                    C2485.m8357();
                    return false;
                case 1409450328:
                case 2098259592:
                    abstractC22044M4846 = abstractC22044M4846;
                    if (iM8344 == (C0619.m2761(C0773.m3166(f15586, 400, 3, i22)) ^ 2098653025)) {
                        iM31610 = C0619.m2761("֫۟") ^ i17;
                        i7 = ((iM31610 ^ i16) * (-19615)) ^ (-401571517);
                        i8 = 1608822047;
                    } else {
                        iM31610 = C0619.m2761("ܳۤ") ^ i16;
                        i7 = ((iM31610 ^ i17) * 30009) ^ 45539204;
                        i8 = 419512858;
                    }
                    i19 = iM31610 ^ i8;
                    i18 = i7;
                    i27 = i27;
                    abstractC22044M4846 = abstractC22044M4846;
                    break;
                case 1736096358:
                case 1935105266:
                    C4238.m13540();
                    abstractC22044 = abstractC22044M4846;
                    c2361 = c2362;
                    onClickListener = onClickListener2;
                    iM2761 = (i16 - C0619.m2761("֡᩹")) * 31;
                    i10 = i20;
                    i11 = ((iM2761 ^ i17) * 29121) ^ (-37812961);
                    i12 = 1069635826;
                    i19 = iM2761 ^ i12;
                    i18 = i11;
                    onClickListener2 = onClickListener;
                    i20 = i10;
                    abstractC22044M4846 = abstractC22044;
                    c2362 = c2361;
                    break;
                case 1827221273:
                case 2037333263:
                    if (!C17202.m40372()) {
                        abstractC22044 = abstractC22044M4846;
                        c2361 = c2362;
                        onClickListener = onClickListener2;
                        iM2761 = (i16 - C0619.m2761("֡᩹")) * 31;
                        i10 = i20;
                        i11 = ((iM2761 ^ i17) * 29121) ^ (-37812961);
                        i12 = 1069635826;
                        i19 = iM2761 ^ i12;
                        i18 = i11;
                        onClickListener2 = onClickListener;
                        i20 = i10;
                        abstractC22044M4846 = abstractC22044;
                        c2362 = c2361;
                    } else {
                        r212 = i27;
                        abstractC22044M4846 = abstractC22044M4846;
                        c2362 = c2362;
                        onClickListener2 = onClickListener2;
                        sArr2 = sArr2;
                        i25 = i25;
                        i20 = i20;
                        sArr4 = sArr4;
                        i26 = i26;
                        iM31611 = C0773.m3169("ܳܽ") ^ i16;
                        i5 = ((iM31611 ^ i17) * 14783) ^ (-341541501);
                        i9 = 620832244;
                        r211 = r212;
                        i6 = iM31611 ^ i9;
                        i26 = i26;
                        i20 = i20;
                        sArr4 = sArr4;
                        sArr2 = sArr2;
                        i25 = i25;
                        r29 = r211;
                        c2362 = c2362;
                        onClickListener2 = onClickListener2;
                        abstractC22044M4846 = abstractC22044M4846;
                        ?? r3110 = r29;
                        i19 = i6;
                        i18 = i5;
                        i27 = r3110 == true ? 1 : 0;
                    }
                    break;
                default:
                    abstractC22044M4846 = abstractC22044M4846;
                    if (iM8344 == (C0773.m3169(AbstractC0116.m1236(f15586, 394, 3, i22)) ^ 2100596602)) {
                        iM31610 = C0773.m3169("᩺ᩴ") ^ i17;
                        i7 = ((iM31610 ^ i16) * (-18763)) ^ (-61442092);
                        i8 = -1002950567;
                    } else {
                        iM31610 = (C0619.m2761("᩶ۘ") ^ i16) * 19;
                        i7 = ((iM31610 ^ i17) * (-27207)) ^ (-1465425052);
                        i8 = 1646886740;
                    }
                    i19 = iM31610 ^ i8;
                    i18 = i7;
                    i27 = i27;
                    abstractC22044M4846 = abstractC22044M4846;
                    break;
            }
        }
    }

    @Override // l.AbstractActivityC17204, l.ActivityC4348, l.ActivityC3409, android.app.Activity
    public final void onDestroy() {
        C24132 c24132 = null;
        C23582 c23582 = null;
        int i = -1112988033;
        int i2 = C1542.f5343;
        int i3 = C2834.f9334;
        int iM3169 = C0773.m3169("᩵ۡ") ^ i2;
        int i4 = ((iM3169 ^ i3) * 21979) ^ (-1524577229);
        int i5 = -1877272515;
        while (true) {
            i = ((((i ^ i3) * (-24027)) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2128343669:
                case -377103820:
                    C3734.m12152();
                    if (C20932.f66974 > 0) {
                        iM3169 = C0773.m3169("ۤۙ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 26413) ^ (-1639729645);
                        i5 = 1633162175;
                    } else {
                        iM3169 = C0773.m3169("᩺᩹") ^ i3;
                        i4 = ((iM3169 ^ i2) * 24467) ^ (-207126244);
                        i5 = -1400970468;
                    }
                    break;
                case -2110489839:
                case 2038116574:
                    if (C4282.f15546 <= 0) {
                        iM3169 = C0619.m2761("ۙ᩸") ^ i2;
                        i4 = ((iM3169 ^ i3) * 26721) ^ (-1634300720);
                        i5 = -770340557;
                    } else {
                        iM3169 = (i3 - C0773.m3169("᩻ۖ")) * (-49);
                        i4 = ((iM3169 ^ i2) * (-7947)) ^ (-1480583812);
                        i5 = 973568975;
                    }
                    break;
                case -2060287466:
                case -483124749:
                    C1826.m6301();
                    break;
                case -1929469002:
                case 385225218:
                    if (C1146.f4234 >= 0) {
                        iM3169 = C0773.m3169("ۤۙ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 26413) ^ (-1639729645);
                        i5 = 1633162175;
                    } else {
                        iM3169 = C0619.m2761("۬ܳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-29289)) ^ 1377392505;
                        i5 = -66370172;
                    }
                    break;
                case -1871278123:
                case 294268647:
                    if (C1321.f4751 >= 0) {
                        iM3169 = C0619.m2761("ۙ᩸") ^ i2;
                        i4 = ((iM3169 ^ i3) * 26721) ^ (-1634300720);
                        i5 = -770340557;
                    } else {
                        iM3169 = (C0773.m3169("ܶܽ") ^ i3) * (-19);
                        i4 = ((iM3169 ^ i2) * (-16651)) ^ 1453778596;
                        i5 = 808188957;
                    }
                    break;
                case -1686853728:
                case -778819821:
                    C0619.m2763();
                    if (C1783.f6087 <= 0) {
                        iM3169 = (i3 - C0773.m3169("᩻ۖ")) * (-49);
                        i4 = ((iM3169 ^ i2) * (-7947)) ^ (-1480583812);
                        i5 = 973568975;
                    } else {
                        iM3169 = C0773.m3169("᩺᩹") ^ i3;
                        i4 = ((iM3169 ^ i2) * 24467) ^ (-207126244);
                        i5 = -1400970468;
                    }
                    break;
                case -1436796813:
                case -165797791:
                    super.onDestroy();
                    c23582 = this.f15596;
                    if (c23582 != null) {
                        iM3169 = C0619.m2761("ۛ᩹") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-30813)) ^ (-1871430278);
                        i5 = -1214869318;
                    } else {
                        iM3169 = C0773.m3169("ܺܰ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-26325)) ^ 376698366;
                        i5 = -1550372667;
                    }
                    break;
                case -1287508589:
                case -1087126745:
                    if (C0773.f2792 <= 0) {
                        iM3169 = C0773.m3169("ۤۙ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 26413) ^ (-1639729645);
                        i5 = 1633162175;
                    } else {
                        iM3169 = C0619.m2761("᩹᩶") ^ i2;
                        i4 = ((iM3169 ^ i3) * 11701) ^ (-1392626363);
                        i5 = 417181341;
                    }
                    break;
                case -1222393240:
                case 138523283:
                    c24132.m53966();
                    iM3169 = C0773.m3169("ۖۤ") ^ i3;
                    i4 = ((iM3169 ^ i2) * (-9579)) ^ (-672230392);
                    i5 = -451586195;
                    break;
                case -1088527310:
                case 1915822632:
                    if (AbstractC0116.f1064 <= 0) {
                        iM3169 = C0619.m2761("ۙ᩸") ^ i2;
                        i4 = ((iM3169 ^ i3) * 26721) ^ (-1634300720);
                        i5 = -770340557;
                    } else {
                        iM3169 = C0619.m2761("ۢۢ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 465) ^ (-1573756308);
                        i5 = 674338360;
                    }
                    break;
                case -954116640:
                case 674828262:
                    C3448.m11248();
                    iM3169 = C0773.m3169("᩺᩹") ^ i3;
                    i4 = ((iM3169 ^ i2) * 24467) ^ (-207126244);
                    i5 = -1400970468;
                    break;
                case -736804012:
                case -17318296:
                    c23582.m52821();
                    iM3169 = C0773.m3169("ܺܰ") ^ i3;
                    i4 = ((iM3169 ^ i2) * (-26325)) ^ 376698366;
                    i5 = -1550372667;
                    break;
                case -565632415:
                case 765798742:
                    if (C1146.f4234 >= 0) {
                        iM3169 = C0773.m3169("֨ܰ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-13005)) ^ (-530473005);
                        i5 = -847415223;
                    } else {
                        iM3169 = C0619.m2761("ۛ۠") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-13207)) ^ 1145818478;
                        i5 = 502576912;
                    }
                    break;
                case -323049916:
                case 1632668244:
                    if (C2419.f7754 >= 0) {
                        iM3169 = C0773.m3169("֨ܰ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-13005)) ^ (-530473005);
                        i5 = -847415223;
                    } else {
                        iM3169 = C0773.m3169("ۙ᩺") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-25811)) ^ (-1779660531);
                        i5 = -979399333;
                    }
                    break;
                case -320970205:
                case 1332540979:
                    break;
                case 145439484:
                case 1371480492:
                    if (C2023.f6737) {
                        iM3169 = C0773.m3169("ۤۙ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 26413) ^ (-1639729645);
                        i5 = 1633162175;
                    } else {
                        iM3169 = (C0619.m2761("ܽܶ") ^ i3) * q.h;
                        i4 = ((iM3169 ^ i2) * 20463) ^ 899096353;
                        i5 = -425580408;
                    }
                    break;
                case 975420280:
                case 1117572266:
                    if (C0773.f2792 <= 0) {
                        iM3169 = C0619.m2761("ۙ᩸") ^ i2;
                        i4 = ((iM3169 ^ i3) * 26721) ^ (-1634300720);
                        i5 = -770340557;
                    } else {
                        iM3169 = C0773.m3169("۟ۢ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 16329) ^ 1496774245;
                        i5 = -652766182;
                    }
                    break;
                case 1349453101:
                case 1783043051:
                    if (RunnableC3055.f9898 >= 0) {
                        iM3169 = (i3 - C0773.m3169("᩻ۖ")) * (-49);
                        i4 = ((iM3169 ^ i2) * (-7947)) ^ (-1480583812);
                        i5 = 973568975;
                    } else {
                        iM3169 = C0773.m3169("ۗۙ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 18813) ^ (-479037324);
                        i5 = 1969935434;
                    }
                    break;
                case 1407642102:
                case 1419095129:
                    c24132 = this.f15593;
                    if (c24132 != null) {
                        iM3169 = C0773.m3169("ܿ᩹") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-31241)) ^ (-887411439);
                        i5 = -29165218;
                    } else {
                        iM3169 = C0773.m3169("ۖۤ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-9579)) ^ (-672230392);
                        i5 = -451586195;
                    }
                    break;
                default:
                    if (C0269.f1558 <= 0) {
                        iM3169 = C0773.m3169("֨ܰ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-13005)) ^ (-530473005);
                        i5 = -847415223;
                    } else {
                        iM3169 = C0619.m2761("֫ۖ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 29173) ^ 778424825;
                        i5 = 1031283059;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00c8 A[PHI: r11
      0x00c8: PHI (r11v4 short[]) = (r11v3 short[]), (r11v2 short[]), (r11v2 short[]) binds: [B:27:0x00c6, B:15:0x0073, B:12:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:49:0x019e A[PHI: r9
      0x019e: PHI (r9v4 short) = (r9v3 short), (r9v2 short) binds: [B:48:0x019c, B:9:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x01d2 A[PHI: r8
      0x01d2: PHI (r8v4 int) = (r8v3 int), (r8v2 int), (r8v2 int), (r8v2 int) binds: [B:52:0x01d0, B:12:0x006b, B:9:0x0062, B:6:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x020a A[PHI: r6 r7 r12 r13
      0x020a: PHI (r6v4 int) = (r6v3 int), (r6v2 int) binds: [B:56:0x0208, B:23:0x00a6] A[DONT_GENERATE, DONT_INLINE]
      0x020a: PHI (r7v4 int) = (r7v3 int), (r7v2 int) binds: [B:56:0x0208, B:23:0x00a6] A[DONT_GENERATE, DONT_INLINE]
      0x020a: PHI (r12v3 int) = (r12v2 int), (r12v4 int) binds: [B:56:0x0208, B:23:0x00a6] A[DONT_GENERATE, DONT_INLINE]
      0x020a: PHI (r13v3 int) = (r13v2 int), (r13v4 int) binds: [B:56:0x0208, B:23:0x00a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x027b A[PHI: r2 r4 r5 r18
      0x027b: PHI (r2v4 android.content.Intent) = 
      (r2v2 android.content.Intent)
      (r2v2 android.content.Intent)
      (r2v2 android.content.Intent)
      (r2v3 android.content.Intent)
      (r2v2 android.content.Intent)
      (r2v2 android.content.Intent)
     binds: [B:68:0x0279, B:64:0x025c, B:60:0x023e, B:31:0x00f9, B:17:0x0077, B:15:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x027b: PHI (r4v4 char) = (r4v2 char), (r4v3 char), (r4v2 char), (r4v2 char), (r4v2 char), (r4v2 char) binds: [B:68:0x0279, B:64:0x025c, B:60:0x023e, B:31:0x00f9, B:17:0x0077, B:15:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x027b: PHI (r5v4 short) = (r5v2 short), (r5v2 short), (r5v3 short), (r5v2 short), (r5v2 short), (r5v2 short) binds: [B:68:0x0279, B:64:0x025c, B:60:0x023e, B:31:0x00f9, B:17:0x0077, B:15:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x027b: PHI (r18v5 short[]) = (r18v4 short[]), (r18v3 short[]), (r18v3 short[]), (r18v3 short[]), (r18v3 short[]), (r18v3 short[]) binds: [B:68:0x0279, B:64:0x025c, B:60:0x023e, B:31:0x00f9, B:17:0x0077, B:15:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.app.Activity
    public final void finish() {
        int iM3169;
        int i;
        int i2;
        int i3 = AbstractC0116.f1064;
        int i4 = C2419.f7754;
        int iM31610 = (i4 - C0773.m3169("֨ۜ")) * 47;
        int i5 = ((iM31610 ^ i3) * (-31681)) ^ (-1157087171);
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM31610 ^ 959601456;
        Intent intent = null;
        char c = 0;
        short s = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        short s2 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 70253674;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i3) * 8809) >> 31));
            switch (i13) {
                case -2116634452:
                case 1149284437:
                    int i14 = s + s2;
                    if (i9 - (i14 * i14) >= 0) {
                        iM3169 = C0619.m2761("ۖ᩶") ^ i3;
                        i = ((iM3169 ^ i4) * (-4957)) ^ (-752275136);
                        i2 = 1390151625;
                    } else {
                        iM3169 = C0773.m3169("۬ܺ") ^ i4;
                        i = ((iM3169 ^ i3) * (-26263)) ^ 29021988;
                        i2 = -2002754297;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1687395005:
                case -1490449106:
                    C3734.m12152();
                    if (RunnableC0334.f1808 > 0) {
                        iM3169 = (i3 - C0773.m3169("ۤ۬")) * (-43);
                        i = ((iM3169 ^ i4) * 15163) ^ 1324313446;
                        i2 = 1429904557;
                    } else {
                        iM3169 = C0619.m2761("ۘۨ") ^ i3;
                        i = ((iM3169 ^ i4) * 6855) ^ 342681377;
                        i2 = 28560163;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1667330491:
                case -110764956:
                    int i15 = i7 + i8;
                    i9 = i15 + i15;
                    if (C0773.f2792 <= 0) {
                        iM3169 = (C0773.m3169("ۗ֫") + i4) * 81;
                        i = ((iM3169 ^ i3) * (-18023)) ^ (-2027046593);
                        i2 = -1996450896;
                    } else {
                        iM3169 = (C0773.m3169("۫᩻") ^ i3) * (-81);
                        i = ((iM3169 ^ i4) * (-15561)) ^ (-1847657742);
                        i2 = 1385573293;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1590500272:
                case 725890808:
                    c = 'o';
                    if (C2354.f7599 >= 0) {
                        iM3169 = (i3 - C0773.m3169("ۤ۬")) * (-43);
                        i = ((iM3169 ^ i4) * 15163) ^ 1324313446;
                        i2 = 1429904557;
                    } else {
                        iM3169 = (C0773.m3169("᩹ۛ") + i4) * (-103);
                        i = ((iM3169 ^ i3) * (-29453)) ^ (-1442098629);
                        i2 = 1277995082;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1582924304:
                case -267196448:
                    setResult(1, intent);
                    iM3169 = C0773.m3169("ۨܺ") ^ i4;
                    i = ((iM3169 ^ i3) * 12103) ^ 1937941177;
                    i2 = 876746369;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1491529321:
                case 1455559701:
                    i10 = 8742;
                    iM3169 = (C0619.m2761("᩺ܺ") + i3) * 97;
                    i = ((iM3169 ^ i4) * 24507) ^ 1806849700;
                    i2 = -1787062499;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1375111588:
                case -1137374631:
                    super.finish();
                    break;
                case -1040726188:
                case 1305062597:
                    intent = new Intent();
                    if (C3448.f11240 >= 0) {
                        iM3169 = (i3 - C0773.m3169("ۤ۬")) * (-43);
                        i = ((iM3169 ^ i4) * 15163) ^ 1324313446;
                        i2 = 1429904557;
                    } else {
                        iM3169 = C0619.m2761("ᩴۗ") ^ i3;
                        i = ((iM3169 ^ i4) * (-11827)) ^ (-474549506);
                        i2 = 124507454;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1026622550:
                case -809798056:
                    i7 = s * s;
                    i8 = 12769;
                    if (C3734.m12152() >= 0) {
                        iM3169 = (i3 - C0773.m3169("֡ۛ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM3169 ^ i4) * 3305) ^ 637836004;
                        i2 = -85692589;
                    } else {
                        iM3169 = (C0619.m2761("۠ۛ") + i3) * (-19);
                        i = ((iM3169 ^ i4) * (-28805)) ^ (-541851846);
                        i2 = 758929710;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -521412263:
                case 1650354617:
                    s2 = 113;
                    if (C1519.f5300 >= 0) {
                        iM3169 = C0619.m2761("ۤۜ") ^ i4;
                        i = ((iM3169 ^ i3) * (-30801)) ^ 2097921631;
                        i2 = -78463117;
                    } else {
                        iM3169 = (C0773.m3169("ۛᩴ") ^ i4) * 33;
                        i = ((iM3169 ^ i3) * 8979) ^ (-252781116);
                        i2 = 378250623;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -166887388:
                case 95284623:
                    C1343.m4943();
                    C4238.m13540();
                    iM3169 = (i3 - C0773.m3169("ۤ۬")) * (-43);
                    i = ((iM3169 ^ i4) * 15163) ^ 1324313446;
                    i2 = 1429904557;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -51427105:
                case 14121283:
                    i10 = 42356;
                    iM3169 = (C0619.m2761("᩺ܺ") + i3) * 97;
                    i = ((iM3169 ^ i4) * 24507) ^ 1806849700;
                    i2 = -1787062499;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -9081972:
                case 1931846273:
                    C1146.m4231();
                    if (AbstractC3624.f12429 > 0) {
                        iM3169 = C0619.m2761("ۘۨ") ^ i3;
                        i = ((iM3169 ^ i4) * 6855) ^ 342681377;
                        i2 = 28560163;
                    } else {
                        iM3169 = (C0773.m3169("ۗ֫") + i4) * 81;
                        i = ((iM3169 ^ i3) * (-18023)) ^ (-2027046593);
                        i2 = -1996450896;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 54225955:
                case 1606278411:
                    i11 = UMErrorCode.E_UM_BE_DEFLATE_FAILED;
                    i12 = 4;
                    if (C1826.f6190 <= 0) {
                        iM3169 = (i3 - C0773.m3169("֡ۛ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM3169 ^ i4) * 3305) ^ 637836004;
                        i2 = -85692589;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ۜ۫")) * (-51);
                        i = ((iM3169 ^ i4) * 57) ^ (-1854385428);
                        i2 = 18880079;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 58069601:
                case 426163470:
                    sArr2 = f15586;
                    if (C1146.f4234 >= 0) {
                        iM3169 = C0619.m2761("ۘۨ") ^ i3;
                        i = ((iM3169 ^ i4) * 6855) ^ 342681377;
                        i2 = 28560163;
                    } else {
                        iM3169 = C0773.m3169("ᩴ᩺") ^ i4;
                        i = ((iM3169 ^ i3) * 17737) ^ (-406678248);
                        i2 = -674672121;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 92160973:
                case 887705594:
                    sArr = f15586;
                    if (C3779.f12953 <= 0) {
                        iM3169 = (i3 - C0773.m3169("ۤ۬")) * (-43);
                        i = ((iM3169 ^ i4) * 15163) ^ 1324313446;
                        i2 = 1429904557;
                    } else {
                        iM3169 = (C0773.m3169("ۤۘ") + i3) * 27;
                        i = ((iM3169 ^ i4) * 22245) ^ (-135127702);
                        i2 = -831592640;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 93091617:
                case 472189047:
                    if (this.f15590) {
                        iM3169 = C0619.m2761("۠ܺ") ^ i4;
                        i = ((iM3169 ^ i3) * 7915) ^ (-1052524363);
                        i2 = -977358571;
                    } else {
                        iM3169 = C0773.m3169("ۨܺ") ^ i4;
                        i = ((iM3169 ^ i3) * 12103) ^ 1937941177;
                        i2 = 876746369;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 196306429:
                case 1250942817:
                    C0773.m3161();
                    if (C11235.f35427 >= 0) {
                        iM3169 = (C0773.m3169("ۗ֫") + i4) * 81;
                        i = ((iM3169 ^ i3) * (-18023)) ^ (-2027046593);
                        i2 = -1996450896;
                    } else {
                        iM3169 = C0619.m2761("ۤۜ") ^ i4;
                        i = ((iM3169 ^ i3) * (-30801)) ^ 2097921631;
                        i2 = -78463117;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 466284777:
                case 1400247285:
                    C3033.m9845();
                    break;
                case 1520998502:
                case 1936201197:
                    s = sArr[c];
                    if (C17202.m40372()) {
                        iM3169 = (i4 - C0773.m3169("֨ۡ")) * (-115);
                        i = ((iM3169 ^ i3) * 17873) ^ (-324252925);
                        i2 = 2101255365;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ۤ۬")) * (-43);
                        i = ((iM3169 ^ i4) * 15163) ^ 1324313446;
                        i2 = 1429904557;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                default:
                    intent.putExtra(RunnableC0334.m2049(sArr2, i11, i12, i10), m13692());
                    if (C0619.m2763()) {
                        iM3169 = (C0773.m3169("ۗ֫") + i4) * 81;
                        i = ((iM3169 ^ i3) * (-18023)) ^ (-2027046593);
                        i2 = -1996450896;
                    } else {
                        iM3169 = (i4 - C0773.m3169("ۙۧ")) * (-67);
                        i = ((iM3169 ^ i3) * (-1609)) ^ 1580604192;
                        i2 = -1192013300;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:80:0x03a3 A[PHI: r16 r17 r18
      0x03a3: PHI (r16v11 int) = (r16v4 int), (r16v5 int), (r16v12 int) binds: [B:79:0x03a1, B:75:0x037a, B:12:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x03a3: PHI (r17v13 short[]) = (r17v6 short[]), (r17v7 short[]), (r17v14 short[]) binds: [B:79:0x03a1, B:75:0x037a, B:12:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x03a3: PHI (r18v12 android.content.Intent) = (r18v5 android.content.Intent), (r18v6 android.content.Intent), (r18v13 android.content.Intent) binds: [B:79:0x03a1, B:75:0x037a, B:12:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13685(AbstractActivityC17204 abstractActivityC17204, String str, String str2, String str3, String str4) {
        int iM3169;
        int i;
        int i2;
        int iM31610;
        int i3;
        int i4;
        int iM2761;
        int i5;
        int i6;
        int i7;
        int iM31611;
        int i8;
        int i9;
        int iM2762;
        int i10;
        int i11;
        AbstractActivityC17204 abstractActivityC17205 = abstractActivityC17204;
        String strM3780 = null;
        Intent intent = null;
        short s = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        short[] sArr = null;
        int i15 = 0;
        short[] sArr2 = null;
        int i16 = -435470824;
        int i17 = C4282.f15546;
        int i18 = C1783.f6087;
        int iM31612 = C0773.m3169("۬ۚ") ^ i17;
        int i19 = ((iM31612 ^ i18) * (-13269)) ^ (-979991762);
        int i20 = 41668112;
        while (true) {
            int i21 = iM31612 ^ i20;
            while (true) {
                i16 = ((((i16 ^ i18) * 6401) >> 31) & i19) ^ i21;
                switch (i16) {
                    case -2146961314:
                    case -2012074056:
                        intent = intent;
                        sArr2 = sArr2;
                        i16 = i16;
                        int i22 = 56490256 + i13;
                        if ((i22 + i22) - i12 < 0) {
                            iM3169 = (C0619.m2761("ۖ᩸") + i18) * (-13);
                            i = ((iM3169 ^ i17) * (-12853)) ^ (-736840545);
                            i2 = 1053584647;
                        } else {
                            iM3169 = (C0619.m2761("֫ۖ") + i17) * 101;
                            i = ((iM3169 ^ i18) * 7851) ^ (-1967975969);
                            i2 = 1068490071;
                        }
                        i21 = iM3169 ^ i2;
                        i19 = i;
                        i16 = i16;
                        sArr2 = sArr2;
                        intent = intent;
                        break;
                    case -2120962819:
                    case 1698795067:
                        intent = intent;
                        sArr2 = sArr2;
                        i16 = i16;
                        strM3780 = C0950.m3780(f15586, 48, 14, i14);
                        if (C2485.f7950 == 0) {
                            iM3169 = (C0773.m3169("ۡۨ") ^ i18) * 87;
                            i = ((iM3169 ^ i17) * (-9853)) ^ 1203217993;
                            i2 = 846003210;
                            i21 = iM3169 ^ i2;
                            i19 = i;
                            i16 = i16;
                            sArr2 = sArr2;
                            intent = intent;
                        } else {
                            iM31610 = (C0619.m2761("᩶ܳ") ^ i17) * (-11);
                            i3 = ((iM31610 ^ i18) * 21875) ^ (-1896077091);
                            i4 = 1533496849;
                            i21 = iM31610 ^ i4;
                            i19 = i3;
                            i16 = i16;
                            sArr2 = sArr2;
                            intent = intent;
                            abstractActivityC17205 = abstractActivityC17204;
                        }
                        break;
                    case -1986383416:
                    case 501909890:
                        C3492.m11491(intent, RunnableC3055.m9937(f15586, 84, 14, i14), str4);
                        i7 = i16;
                        iM31611 = (i17 - C0619.m2761("ۢ۫")) * (-123);
                        i8 = ((iM31611 ^ i18) * 5429) ^ (-1301073523);
                        i9 = -947968411;
                        i21 = iM31611 ^ i9;
                        i19 = i8;
                        i16 = i7;
                        break;
                    case -1890154867:
                    case -114659569:
                        sArr2 = sArr2;
                        i16 = i16;
                        intent = new Intent(abstractActivityC17205, (Class<?>) ActivityC4300.class);
                        sArr = f15586;
                        i15 = 62;
                        if (C3448.f11240 < 0) {
                            iM2761 = (C0619.m2761("۟ܶ") + i18) * (-109);
                            i5 = ((iM2761 ^ i17) * (-31253)) ^ 903768657;
                            i6 = -617658626;
                            i21 = iM2761 ^ i6;
                            i19 = i5;
                            i16 = i16;
                            sArr2 = sArr2;
                        } else {
                            int iM2763 = C0619.m2761("᩻᩸") ^ i17;
                            i19 = ((iM2763 ^ i18) * (-23821)) ^ (-635273680);
                            i21 = iM2763 ^ 251967316;
                            i16 = i16;
                            sArr2 = sArr2;
                            abstractActivityC17205 = abstractActivityC17204;
                        }
                        break;
                    case -1878530996:
                    case -1736029899:
                        if (C0862.f3233 == 0) {
                            sArr2 = sArr2;
                            i16 = i16;
                            iM31610 = (C0619.m2761("᩶ܳ") ^ i17) * (-11);
                            i3 = ((iM31610 ^ i18) * 21875) ^ (-1896077091);
                            i4 = 1533496849;
                            i21 = iM31610 ^ i4;
                            i19 = i3;
                            i16 = i16;
                            sArr2 = sArr2;
                            intent = intent;
                            abstractActivityC17205 = abstractActivityC17204;
                        } else {
                            intent = intent;
                            sArr2 = sArr2;
                            i16 = i16;
                            iM3169 = (C0619.m2761("ۜܶ") ^ i17) * (-91);
                            i = ((iM3169 ^ i18) * 24201) ^ (-1829935667);
                            i2 = 1179931443;
                            i21 = iM3169 ^ i2;
                            i19 = i;
                            i16 = i16;
                            sArr2 = sArr2;
                            intent = intent;
                        }
                        break;
                    case -1759767946:
                    case 732186396:
                        if (C3099.f10023 > 0) {
                            intent = intent;
                            sArr2 = sArr2;
                            i16 = i16;
                            iM3169 = C0773.m3169("֨᩷") ^ i18;
                            i = ((iM3169 ^ i17) * 29971) ^ (-545319436);
                            i2 = -73785222;
                            i21 = iM3169 ^ i2;
                            i19 = i;
                            i16 = i16;
                            sArr2 = sArr2;
                            intent = intent;
                        }
                        break;
                    case -1564335719:
                    case 231442950:
                        if (abstractActivityC17205 instanceof Main) {
                            iM2762 = C0619.m2761("ܽ᩷") ^ i18;
                            i10 = ((iM2762 ^ i17) * (-11723)) ^ (-775571353);
                            i11 = 1419295188;
                        } else {
                            iM2762 = C0619.m2761("֨ۖ") ^ i18;
                            i10 = ((iM2762 ^ i17) * 22603) ^ 2040231375;
                            i11 = -1351626605;
                        }
                        i21 = iM2762 ^ i11;
                        i19 = i10;
                        break;
                    case -1313963965:
                    case 682097139:
                        if (!C2702.m8876()) {
                        }
                        sArr2 = sArr2;
                        i16 = i16;
                        iM31610 = (C0619.m2761("᩶ܳ") ^ i17) * (-11);
                        i3 = ((iM31610 ^ i18) * 21875) ^ (-1896077091);
                        i4 = 1533496849;
                        i21 = iM31610 ^ i4;
                        i19 = i3;
                        i16 = i16;
                        sArr2 = sArr2;
                        intent = intent;
                        abstractActivityC17205 = abstractActivityC17204;
                        break;
                    case -1132570583:
                    case 1168274798:
                        i16 = i16;
                        intent.putExtra(RunnableC3646.m11809(sArr, i15, 6, i14), 0);
                        sArr2 = f15586;
                        if (C2354.f7599 < 0) {
                            int iM2764 = C0619.m2761("ۨ֫") ^ i17;
                            intent = intent;
                            i19 = ((iM2764 ^ i18) * 15147) ^ 151066505;
                            i21 = iM2764 ^ 94370840;
                            i16 = i16;
                            intent = intent;
                        } else {
                            sArr2 = sArr2;
                            iM31610 = (C0619.m2761("᩶ܳ") ^ i17) * (-11);
                            i3 = ((iM31610 ^ i18) * 21875) ^ (-1896077091);
                            i4 = 1533496849;
                            i21 = iM31610 ^ i4;
                            i19 = i3;
                            i16 = i16;
                            sArr2 = sArr2;
                            intent = intent;
                            abstractActivityC17205 = abstractActivityC17204;
                        }
                        break;
                    case -1077970600:
                    case 270322064:
                        C1519.m5403();
                        C1826.m6301();
                        break;
                    case -982074766:
                    case 92616205:
                        intent = intent;
                        sArr2 = sArr2;
                        i16 = i16;
                        C23391.m52569(C3734.m12155(abstractActivityC17204), str, strM3780);
                        if (C20932.f66974 > 0) {
                            iM3169 = (C0619.m2761("᩸᩵") ^ i17) * (-125);
                            i = ((iM3169 ^ i18) * 23541) ^ (-1383348956);
                            i2 = -1841338571;
                            i21 = iM3169 ^ i2;
                            i19 = i;
                            i16 = i16;
                            sArr2 = sArr2;
                            intent = intent;
                        } else {
                            intent = intent;
                            int iM2765 = C0619.m2761("᩻᩸") ^ i17;
                            i19 = ((iM2765 ^ i18) * (-23821)) ^ (-635273680);
                            i21 = iM2765 ^ 251967316;
                            i16 = i16;
                            sArr2 = sArr2;
                            abstractActivityC17205 = abstractActivityC17204;
                        }
                        break;
                    case -928843041:
                    case 2050127342:
                        intent = intent;
                        sArr2 = sArr2;
                        i16 = i16;
                        if (RunnableC1848.f6235) {
                            iM3169 = C0773.m3169("֨᩷") ^ i18;
                            i = ((iM3169 ^ i17) * 29971) ^ (-545319436);
                            i2 = -73785222;
                        } else {
                            iM3169 = (C0619.m2761("᩺۫") + i17) * (-95);
                            i = ((iM3169 ^ i18) * 23617) ^ 619009919;
                            i2 = 1470916054;
                        }
                        i21 = iM3169 ^ i2;
                        i19 = i;
                        i16 = i16;
                        sArr2 = sArr2;
                        intent = intent;
                        break;
                    case -858461862:
                    case 1263383927:
                        i14 = 34460;
                        iM3169 = C0773.m3169("֨᩺") ^ i17;
                        i = ((iM3169 ^ i18) * (-29117)) ^ 1098675477;
                        i2 = 1105393916;
                        i21 = iM3169 ^ i2;
                        i19 = i;
                        i16 = i16;
                        sArr2 = sArr2;
                        intent = intent;
                        break;
                    case -603058374:
                    case -91398440:
                        i7 = i16;
                        if (C0487.m2349(str4)) {
                            iM31611 = (i17 - C0619.m2761("ۢ۫")) * (-123);
                            i8 = ((iM31611 ^ i18) * 5429) ^ (-1301073523);
                            i9 = -947968411;
                        } else {
                            iM31611 = (i17 - C0773.m3169("ۛۛ")) * 35;
                            i8 = ((iM31611 ^ i18) * 6883) ^ 700070641;
                            i9 = -1948315529;
                        }
                        i21 = iM31611 ^ i9;
                        i19 = i8;
                        i16 = i7;
                        break;
                    case -555363186:
                    case 610318829:
                        intent = intent;
                        sArr2 = sArr2;
                        i16 = i16;
                        s = f15586[47];
                        if (C3033.f9831 < 0) {
                            iM3169 = (i18 - C0773.m3169("ܺ۫")) * (-33);
                            i = ((iM3169 ^ i17) * (-12923)) ^ (-389905501);
                            i2 = 638467265;
                            i21 = iM3169 ^ i2;
                            i19 = i;
                            i16 = i16;
                            sArr2 = sArr2;
                            intent = intent;
                        } else {
                            intent = intent;
                            int iM2766 = C0619.m2761("᩻᩸") ^ i17;
                            i19 = ((iM2766 ^ i18) * (-23821)) ^ (-635273680);
                            i21 = iM2766 ^ 251967316;
                            i16 = i16;
                            sArr2 = sArr2;
                            abstractActivityC17205 = abstractActivityC17204;
                        }
                        break;
                    case -447017141:
                    case -211833205:
                        RunnableC1848.m6363(abstractActivityC17205, intent);
                        break;
                    case -369987262:
                    case 14576744:
                        intent = intent;
                        sArr2 = sArr2;
                        i16 = i16;
                        if (AbstractC0116.m1243() == 0) {
                            iM31610 = (C0619.m2761("ۨᩳ") ^ i17) * 91;
                            i3 = ((iM31610 ^ i18) * (-32507)) ^ (-1857807491);
                            i4 = 2084518084;
                            i21 = iM31610 ^ i4;
                            i19 = i3;
                            i16 = i16;
                            sArr2 = sArr2;
                            intent = intent;
                            abstractActivityC17205 = abstractActivityC17204;
                        }
                        intent = intent;
                        int iM2767 = C0619.m2761("᩻᩸") ^ i17;
                        i19 = ((iM2767 ^ i18) * (-23821)) ^ (-635273680);
                        i21 = iM2767 ^ 251967316;
                        i16 = i16;
                        sArr2 = sArr2;
                        abstractActivityC17205 = abstractActivityC17204;
                        break;
                    case 92728975:
                    case 122524527:
                        i14 = 50534;
                        iM3169 = C0773.m3169("֨᩺") ^ i17;
                        i = ((iM3169 ^ i18) * (-29117)) ^ 1098675477;
                        i2 = 1105393916;
                        i21 = iM3169 ^ i2;
                        i19 = i;
                        i16 = i16;
                        sArr2 = sArr2;
                        intent = intent;
                        break;
                    case 105407466:
                    case 651734123:
                        intent = intent;
                        sArr2 = sArr2;
                        i16 = i16;
                        if (C1343.f4799 != 0) {
                            iM31610 = (C0619.m2761("᩶ܳ") ^ i17) * (-11);
                            i3 = ((iM31610 ^ i18) * 21875) ^ (-1896077091);
                            i4 = 1533496849;
                        } else {
                            iM31610 = (C0773.m3169("֨۠") + i18) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                            i3 = ((iM31610 ^ i17) * 6705) ^ (-826876687);
                            i4 = -2043133028;
                        }
                        i21 = iM31610 ^ i4;
                        i19 = i3;
                        i16 = i16;
                        sArr2 = sArr2;
                        intent = intent;
                        abstractActivityC17205 = abstractActivityC17204;
                        break;
                    case 398915423:
                    case 832869712:
                        intent = intent;
                        sArr2 = sArr2;
                        i16 = i16;
                        if (C3690.f12684 <= 0) {
                            iM3169 = C0773.m3169("֨᩷") ^ i18;
                            i = ((iM3169 ^ i17) * 29971) ^ (-545319436);
                            i2 = -73785222;
                        } else {
                            iM3169 = C0619.m2761("ܰܿ") ^ i18;
                            i = ((iM3169 ^ i17) * (-25105)) ^ 1035863351;
                            i2 = -1798218889;
                        }
                        i21 = iM3169 ^ i2;
                        i19 = i;
                        i16 = i16;
                        sArr2 = sArr2;
                        intent = intent;
                        break;
                    case 514599672:
                    case 1949334354:
                        intent.putExtra(C1826.m6310(f15586, 98, 13, i14), true);
                        iM2762 = C0619.m2761("֨ۖ") ^ i18;
                        i10 = ((iM2762 ^ i17) * 22603) ^ 2040231375;
                        i11 = -1351626605;
                        i21 = iM2762 ^ i11;
                        i19 = i10;
                        break;
                    case 557619406:
                    case 1264065319:
                        i16 = i16;
                        C3492.m11491(intent, C2375.m8069(sArr2, 68, 5, i14), str2);
                        if (C0487.m2349(str3)) {
                            sArr2 = sArr2;
                            iM2761 = C0619.m2761("᩸ᩳ") ^ i18;
                            i5 = ((iM2761 ^ i17) * (-16477)) ^ (-1954681174);
                            i6 = -1774639049;
                            i21 = iM2761 ^ i6;
                            i19 = i5;
                        } else {
                            int iM2768 = C0619.m2761("ۡ᩶") ^ i18;
                            sArr2 = sArr2;
                            i19 = ((iM2768 ^ i17) * (-949)) ^ 296405450;
                            i21 = iM2768 ^ 1751652074;
                        }
                        i16 = i16;
                        sArr2 = sArr2;
                        break;
                    case 576491689:
                    case 983444817:
                        i16 = i16;
                        C2419.m8169(intent, C2287.m7749(f15586, 73, 11, i14), str3);
                        sArr2 = sArr2;
                        iM2761 = C0619.m2761("᩸ᩳ") ^ i18;
                        i5 = ((iM2761 ^ i17) * (-16477)) ^ (-1954681174);
                        i6 = -1774639049;
                        i21 = iM2761 ^ i6;
                        i19 = i5;
                        i16 = i16;
                        sArr2 = sArr2;
                        break;
                    case 914162073:
                    case 1409419742:
                        C3033.m9845();
                        C3448.m11248();
                        intent = intent;
                        sArr2 = sArr2;
                        i16 = i16;
                        iM3169 = (C0619.m2761("ۜܶ") ^ i17) * (-91);
                        i = ((iM3169 ^ i18) * 24201) ^ (-1829935667);
                        i2 = 1179931443;
                        i21 = iM3169 ^ i2;
                        i19 = i;
                        i16 = i16;
                        sArr2 = sArr2;
                        intent = intent;
                        break;
                    default:
                        intent = intent;
                        sArr2 = sArr2;
                        i16 = i16;
                        int i23 = s + 7516;
                        i12 = i23 * i23;
                        i13 = s * s;
                        if (C2288.m7767()) {
                            iM3169 = (C0619.m2761("ۜܶ") ^ i17) * (-91);
                            i = ((iM3169 ^ i18) * 24201) ^ (-1829935667);
                            i2 = 1179931443;
                        } else {
                            iM3169 = (i17 - C0773.m3169("ܳ᩹")) * 43;
                            i = ((iM3169 ^ i18) * (-13847)) ^ 882270573;
                            i2 = -1354430947;
                        }
                        i21 = iM3169 ^ i2;
                        i19 = i;
                        i16 = i16;
                        sArr2 = sArr2;
                        intent = intent;
                        break;
                }
                return;
            }
            iM31612 = C0619.m2761("ۛۚ") ^ i18;
            i19 = ((iM31612 ^ i17) * (-11167)) ^ (-128038587);
            i20 = -760022116;
        }
    }

    /* JADX WARN: Code duplicated, block: B:78:0x0360 A[PHI: r7 r11 r12 r13 r16 r18 r21 r22 r24 r29
      0x0360: PHI (r7v4 l.᩷ۨᩴ) = (r7v2 l.᩷ۨᩴ), (r7v2 l.᩷ۨᩴ), (r7v2 l.᩷ۨᩴ), (r7v5 l.᩷ۨᩴ) binds: [B:77:0x035e, B:69:0x02e7, B:47:0x01e9, B:11:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x0360: PHI (r11v4 short[]) = (r11v2 short[]), (r11v2 short[]), (r11v2 short[]), (r11v5 short[]) binds: [B:77:0x035e, B:69:0x02e7, B:47:0x01e9, B:11:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x0360: PHI (r12v4 int) = (r12v2 int), (r12v2 int), (r12v2 int), (r12v5 int) binds: [B:77:0x035e, B:69:0x02e7, B:47:0x01e9, B:11:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x0360: PHI (r13v24 short[]) = (r13v7 short[]), (r13v9 short[]), (r13v17 short[]), (r13v25 short[]) binds: [B:77:0x035e, B:69:0x02e7, B:47:0x01e9, B:11:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x0360: PHI (r16v4 int) = (r16v2 int), (r16v3 int), (r16v2 int), (r16v2 int) binds: [B:77:0x035e, B:69:0x02e7, B:47:0x01e9, B:11:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x0360: PHI (r18v4 char) = (r18v3 char), (r18v2 char), (r18v2 char), (r18v2 char) binds: [B:77:0x035e, B:69:0x02e7, B:47:0x01e9, B:11:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x0360: PHI (r21v4 int) = (r21v2 int), (r21v3 int), (r21v2 int), (r21v2 int) binds: [B:77:0x035e, B:69:0x02e7, B:47:0x01e9, B:11:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x0360: PHI (r22v4 int) = (r22v2 int), (r22v3 int), (r22v2 int), (r22v2 int) binds: [B:77:0x035e, B:69:0x02e7, B:47:0x01e9, B:11:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x0360: PHI (r24v4 int) = (r24v2 int), (r24v2 int), (r24v3 int), (r24v2 int) binds: [B:77:0x035e, B:69:0x02e7, B:47:0x01e9, B:11:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x0360: PHI (r29v5 int) = (r29v3 int), (r29v3 int), (r29v4 int), (r29v3 int) binds: [B:77:0x035e, B:69:0x02e7, B:47:0x01e9, B:11:0x009d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x03b2 A[PHI: r2 r3 r4 r13 r17
      0x03b2: PHI (r2v4 byte[]) = (r2v2 byte[]), (r2v2 byte[]), (r2v3 byte[]), (r2v2 byte[]) binds: [B:85:0x03b0, B:81:0x0394, B:56:0x0247, B:10:0x0099] A[DONT_GENERATE, DONT_INLINE]
      0x03b2: PHI (r3v4 int) = (r3v2 int), (r3v2 int), (r3v3 int), (r3v2 int) binds: [B:85:0x03b0, B:81:0x0394, B:56:0x0247, B:10:0x0099] A[DONT_GENERATE, DONT_INLINE]
      0x03b2: PHI (r4v4 int) = (r4v2 int), (r4v2 int), (r4v3 int), (r4v2 int) binds: [B:85:0x03b0, B:81:0x0394, B:56:0x0247, B:10:0x0099] A[DONT_GENERATE, DONT_INLINE]
      0x03b2: PHI (r13v26 short[]) = (r13v5 short[]), (r13v6 short[]), (r13v14 short[]), (r13v27 short[]) binds: [B:85:0x03b0, B:81:0x0394, B:56:0x0247, B:10:0x0099] A[DONT_GENERATE, DONT_INLINE]
      0x03b2: PHI (r17v4 short[]) = (r17v2 short[]), (r17v3 short[]), (r17v2 short[]), (r17v2 short[]) binds: [B:85:0x03b0, B:81:0x0394, B:56:0x0247, B:10:0x0099] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0097, code lost:
    
        if (l.C3998.f13671 != 0) goto L10;
     */
    @Override // l.ActivityC5577, l.ActivityC8866, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSaveInstanceState(android.os.Bundle r32) {
        /*
            Method dump skipped, instruction units count: 1200
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ActivityC4300.onSaveInstanceState(android.os.Bundle):void");
    }

    /* JADX WARN: Code duplicated, block: B:108:0x04c1 A[PHI: r3 r20 r21 r30
      0x04c1: PHI (r3v32 java.lang.String) = (r3v2 java.lang.String), (r3v34 java.lang.String) binds: [B:106:0x04ab, B:96:0x0408] A[DONT_GENERATE, DONT_INLINE]
      0x04c1: PHI (r20v47 l.᩵ۚۤ) = (r20v45 l.᩵ۚۤ), (r20v48 l.᩵ۚۤ) binds: [B:106:0x04ab, B:96:0x0408] A[DONT_GENERATE, DONT_INLINE]
      0x04c1: PHI (r21v47 l.᩵ۚۤ) = (r21v45 l.᩵ۚۤ), (r21v48 l.᩵ۚۤ) binds: [B:106:0x04ab, B:96:0x0408] A[DONT_GENERATE, DONT_INLINE]
      0x04c1: PHI (r30v63 l.ۜ֨᩻) = (r30v61 l.ۜ֨᩻), (r30v64 l.ۜ֨᩻) binds: [B:106:0x04ab, B:96:0x0408] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x017c, code lost:
    
        if (l.C2834.f9334 > 0) goto L10;
     */
    @Override // l.AbstractActivityC17204, l.ActivityC7405, l.ActivityC3409, l.ActivityC5577, l.ActivityC8866, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r38) {
        /*
            Method dump skipped, instruction units count: 2820
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ActivityC4300.onCreate(android.os.Bundle):void");
    }

    @Override // l.AbstractActivityC17204, l.ActivityC3409, android.app.Activity
    public final void onResume() {
        C23582 c23582 = null;
        int i = -61720514;
        int i2 = C0773.f2792;
        int i3 = C20932.f66974;
        int iM3169 = C0773.m3169("ۚܽ") ^ i3;
        int i4 = ((iM3169 ^ i2) * (-31053)) ^ 481066277;
        int i5 = -1959800948;
        while (true) {
            i = ((((i ^ i2) * (-2021)) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -1992082873:
                case -265483493:
                    if (!C1783.m6232()) {
                        iM3169 = (C0619.m2761("ۗ۬") ^ i2) * (-63);
                        i4 = ((iM3169 ^ i3) * (-22973)) ^ (-1782305393);
                        i5 = 1651722244;
                    } else {
                        iM3169 = (C0773.m3169("ܺ᩵") ^ i3) * 101;
                        i4 = ((iM3169 ^ i2) * 8989) ^ 597488508;
                        i5 = -649780627;
                    }
                    break;
                case -1965759010:
                case -1425628132:
                    if (C3448.f11240 >= 0) {
                        iM3169 = C0773.m3169("ۛܿ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-10023)) ^ 1746968015;
                        i5 = -1274059222;
                    } else {
                        iM3169 = C0619.m2761("ۡ۟") ^ i2;
                        i4 = ((iM3169 ^ i3) * 7621) ^ 998682156;
                        i5 = -26665811;
                    }
                    break;
                case -1955211255:
                case -1597527501:
                    if (C3077.f9998) {
                        iM3169 = C0773.m3169("ۢ۫") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-4263)) ^ 447134687;
                        i5 = -2117422896;
                    } else {
                        iM3169 = (C0773.m3169("۬᩷") + i3) * 79;
                        i4 = ((iM3169 ^ i2) * (-27873)) ^ (-1768675923);
                        i5 = -748059382;
                    }
                    break;
                case -1929922534:
                case -85984692:
                    if (RunnableC1848.f6235) {
                        iM3169 = (C0773.m3169("۬᩷") + i3) * 79;
                        i4 = ((iM3169 ^ i2) * (-27873)) ^ (-1768675923);
                        i5 = -748059382;
                    } else {
                        iM3169 = (C0773.m3169("ۧۨ") + i3) * 37;
                        i4 = ((iM3169 ^ i2) * (-20191)) ^ 1209427761;
                        i5 = 1334265911;
                    }
                    break;
                case -1611605301:
                case 388721270:
                    if (C4282.m13644()) {
                        iM3169 = C0773.m3169("֡֡") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-6809)) ^ 1328184246;
                        i5 = -1253564986;
                    } else {
                        iM3169 = (C0773.m3169("۬᩷") + i3) * 79;
                        i4 = ((iM3169 ^ i2) * (-27873)) ^ (-1768675923);
                        i5 = -748059382;
                    }
                    break;
                case -1578902358:
                case -955207822:
                    super.onResume();
                    if (C0773.f2792 <= 0) {
                        iM3169 = (C0619.m2761("ۗ۬") ^ i2) * (-63);
                        i4 = ((iM3169 ^ i3) * (-22973)) ^ (-1782305393);
                        i5 = 1651722244;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ۜ᩸")) * (-89);
                        i4 = ((iM3169 ^ i2) * (-7669)) ^ (-68263677);
                        i5 = 1859687683;
                    }
                    break;
                case -1516410900:
                case 1613117982:
                    if (C1542.m5459() >= 0) {
                        iM3169 = C0619.m2761("ᩳᩴ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-26929)) ^ 242126623;
                        i5 = -69333873;
                    } else {
                        iM3169 = (i3 - C0619.m2761("᩷ܶ")) * (-11);
                        i4 = ((iM3169 ^ i2) * (-10695)) ^ (-1554600315);
                        i5 = -1574753769;
                    }
                    break;
                case -1467661480:
                case 1002936604:
                    C0862.m3503();
                    C2310.m7813();
                    iM3169 = C0773.m3169("ۛܿ") ^ i3;
                    i4 = ((iM3169 ^ i2) * (-10023)) ^ 1746968015;
                    i5 = -1274059222;
                    break;
                case -1255282042:
                case 1529086375:
                    if (C3734.f12817 >= 0) {
                        iM3169 = C0619.m2761("ᩳᩴ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-26929)) ^ 242126623;
                        i5 = -69333873;
                    } else {
                        iM3169 = (C0619.m2761("ۘۢ") ^ i3) * (-51);
                        i4 = ((iM3169 ^ i2) * 30651) ^ 1498450451;
                        i5 = 1853059317;
                    }
                    break;
                case -1103701500:
                case 1707491528:
                    c23582.m52804();
                    iM3169 = C0773.m3169("ᩴᩳ") ^ i3;
                    i4 = ((iM3169 ^ i2) * 32113) ^ (-1393283348);
                    i5 = 2000632287;
                    break;
                case -942223025:
                case 1785656877:
                    c23582 = this.f15596;
                    if (c23582 != null) {
                        iM3169 = (i2 - C0773.m3169("ܶܰ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM3169 ^ i3) * (-29841)) ^ (-1966724756);
                        i5 = -2111979987;
                    } else {
                        iM3169 = C0773.m3169("ᩴᩳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 32113) ^ (-1393283348);
                        i5 = 2000632287;
                    }
                    break;
                case -755270295:
                case 111500577:
                    if (C2310.f7472 >= 0) {
                        iM3169 = C0619.m2761("ᩳᩴ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-26929)) ^ 242126623;
                        i5 = -69333873;
                    } else {
                        iM3169 = C0773.m3169("ܽۢ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 1813) ^ (-1164028049);
                        i5 = 314090994;
                    }
                    break;
                case -652794547:
                case 1912209276:
                    if (C2702.f8586 <= 0) {
                        iM3169 = (C0773.m3169("ܺ᩵") ^ i3) * 101;
                        i4 = ((iM3169 ^ i2) * 8989) ^ 597488508;
                        i5 = -649780627;
                    } else {
                        iM3169 = C0773.m3169("᩸᩺") ^ i2;
                        i4 = ((iM3169 ^ i3) * 15823) ^ 541420666;
                        i5 = 1949854346;
                    }
                    break;
                case -434780550:
                case 275265936:
                    C3734.m12152();
                    if (C0269.m1775() > 0) {
                        iM3169 = C0619.m2761("ᩳᩴ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-26929)) ^ 242126623;
                        i5 = -69333873;
                    } else {
                        iM3169 = C0773.m3169("ۛܿ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-10023)) ^ 1746968015;
                        i5 = -1274059222;
                    }
                    break;
                case -195340182:
                case 1576058661:
                    break;
                case 1003830363:
                case 1373671972:
                    C0487.m2356();
                    if (!C3077.f9998) {
                        iM3169 = (C0619.m2761("ۗ۬") ^ i2) * (-63);
                        i4 = ((iM3169 ^ i3) * (-22973)) ^ (-1782305393);
                        i5 = 1651722244;
                    } else {
                        iM3169 = C0773.m3169("ۛܿ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-10023)) ^ 1746968015;
                        i5 = -1274059222;
                    }
                    break;
                case 1053532239:
                case 1614786441:
                    if (C1826.f6190 <= 0) {
                        iM3169 = C0619.m2761("ᩳᩴ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-26929)) ^ 242126623;
                        i5 = -69333873;
                    } else {
                        iM3169 = (C0773.m3169("ܶۜ") ^ i2) * (-57);
                        i4 = ((iM3169 ^ i3) * (-32605)) ^ 385715941;
                        i5 = 562733646;
                    }
                    break;
                default:
                    C2485.m8357();
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13681(C3347 c3347, C6806 c6806, String str) {
        String str2;
        int iM3169;
        int i;
        int i2;
        int iM31610;
        int i3;
        int i4;
        String strM4056 = null;
        String strM8069 = null;
        int i5 = 0;
        short[] sArr = null;
        short s = 0;
        int i6 = 0;
        short s2 = 0;
        int i7 = 0;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i8 = 2076922002;
        int i9 = C3033.f9831;
        int i10 = AbstractC3624.f12429;
        int iM2761 = C0619.m2761("ۗۧ") ^ i10;
        int i11 = ((iM2761 ^ i9) * 23347) ^ 972645674;
        int i12 = iM2761 ^ (-952792032);
        while (true) {
            Intent intent = null;
            while (true) {
                i8 = ((((i8 ^ i9) * (-14271)) >> 31) & i11) ^ i12;
                switch (i8) {
                    case -2015114800:
                    case 1486606130:
                        C3690.m11987();
                        if (C0269.f1558 <= 0) {
                            strM8069 = strM8069;
                            i5 = i5;
                        }
                        intent = intent;
                        strM8069 = strM8069;
                        i5 = i5;
                        iM31610 = C0773.m3169("ᩴۘ") ^ i9;
                        i3 = ((iM31610 ^ i10) * (-17865)) ^ 650509854;
                        i4 = 1390490878;
                        i12 = iM31610 ^ i4;
                        i11 = i3;
                        strM8069 = strM8069;
                        intent = intent;
                        i5 = i5;
                        break;
                    case -1931969254:
                    case -555271552:
                        str2 = strM4056;
                        intent = intent;
                        strM8069 = strM8069;
                        i5 = i5;
                        if (!C2966.m9664()) {
                            intent = intent;
                            strM4056 = str2;
                            int iM2762 = (i10 - C0619.m2761("᩺ۨ")) * q.h;
                            String str3 = strM4056;
                            i11 = ((iM2762 ^ i9) * (-27735)) ^ 2109706847;
                            i12 = iM2762 ^ 1602238;
                            strM8069 = strM8069;
                            strM4056 = str3;
                            i5 = i5;
                        } else {
                            iM3169 = (C0773.m3169("᩺᩺") ^ i9) * (-11);
                            i = ((iM3169 ^ i10) * 31527) ^ 1738219382;
                            i2 = 1604410919;
                            i12 = iM3169 ^ i2;
                            i11 = i;
                            strM8069 = strM8069;
                            intent = intent;
                            i5 = i5;
                            strM4056 = str2;
                        }
                        break;
                    case -1879972671:
                    case 937897319:
                        C2419.m8169(intent, C2834.m9343(sArr3, 21, 5, i7), str);
                        c3347.m10999(intent);
                        break;
                    case -1584613685:
                    case 207112664:
                        intent = intent;
                        strM8069 = strM8069;
                        i5 = i5;
                        s = sArr[0];
                        if (C0950.f3488 < 0) {
                            str2 = strM4056;
                            iM3169 = (C0619.m2761("֫֫") + i10) * 63;
                            i = ((iM3169 ^ i9) * (-3133)) ^ 1364002274;
                            i2 = 2012680377;
                            i12 = iM3169 ^ i2;
                            i11 = i;
                            strM8069 = strM8069;
                            intent = intent;
                            i5 = i5;
                            strM4056 = str2;
                        }
                        i5 = i5;
                        int iM2763 = (i9 - C0619.m2761("۠ܰ")) * 9;
                        str2 = strM4056;
                        i11 = ((iM2763 ^ i10) * 4975) ^ (-1770227275);
                        i12 = iM2763 ^ 739837281;
                        strM8069 = strM8069;
                        intent = intent;
                        strM4056 = str2;
                        break;
                    case -1482385877:
                    case -288944171:
                        str2 = strM4056;
                        intent = intent;
                        strM8069 = strM8069;
                        i5 = i5;
                        sArr = f15586;
                        if (C0862.f3233 != 0) {
                            iM3169 = (C0619.m2761("᩵֨") + i10) * (-75);
                            i = ((iM3169 ^ i9) * 3763) ^ (-2020827277);
                            i2 = 1198650065;
                        } else {
                            iM3169 = (C0773.m3169("ܿۧ") ^ i10) * 19;
                            i = ((iM3169 ^ i9) * 16073) ^ (-832849473);
                            i2 = 53124653;
                        }
                        i12 = iM3169 ^ i2;
                        i11 = i;
                        strM8069 = strM8069;
                        intent = intent;
                        i5 = i5;
                        strM4056 = str2;
                        break;
                    case -1119998544:
                    case 386077170:
                        RunnableC0334.m2063();
                        C2419.m8174();
                        break;
                    case -816214158:
                    case 590548858:
                        intent = intent;
                        strM8069 = strM8069;
                        i5 = i5;
                        C23391.m52569(ActivityC18143.class, c6806, strM4056);
                        if (C1826.f6190 <= 0) {
                            iM31610 = C0773.m3169("ᩴۘ") ^ i9;
                            i3 = ((iM31610 ^ i10) * (-17865)) ^ 650509854;
                            i4 = 1390490878;
                        } else {
                            iM31610 = (i10 - C0619.m2761("ܰۡ")) * 77;
                            i3 = ((iM31610 ^ i9) * (-5005)) ^ (-1109706602);
                            i4 = -118823084;
                        }
                        i12 = iM31610 ^ i4;
                        i11 = i3;
                        strM8069 = strM8069;
                        intent = intent;
                        i5 = i5;
                        break;
                    case -760357939:
                    case -723812651:
                        RunnableC3055.m9933();
                        C23916.m53419();
                        intent = intent;
                        strM8069 = strM8069;
                        i5 = i5;
                        iM31610 = C0773.m3169("ᩴۘ") ^ i9;
                        i3 = ((iM31610 ^ i10) * (-17865)) ^ 650509854;
                        i4 = 1390490878;
                        i12 = iM31610 ^ i4;
                        i11 = i3;
                        strM8069 = strM8069;
                        intent = intent;
                        i5 = i5;
                        break;
                    case -707255220:
                    case 1932024051:
                        i7 = 15273;
                        iM31610 = C0773.m3169("ۖۤ") ^ i9;
                        i3 = ((iM31610 ^ i10) * 15819) ^ (-1912043273);
                        i4 = -1692536591;
                        i12 = iM31610 ^ i4;
                        i11 = i3;
                        strM8069 = strM8069;
                        intent = intent;
                        i5 = i5;
                        break;
                    case -662865425:
                    case 383528441:
                        intent = intent;
                        strM8069 = strM8069;
                        i5 = i5;
                        i6 = s * 54444;
                        s2 = 13611;
                        if (C2375.f7641 > 0) {
                            iM31610 = (i9 - C0773.m3169("ۡ۬")) * q.h;
                            i3 = ((iM31610 ^ i10) * (-11825)) ^ (-1516648694);
                            i4 = -428545377;
                            i12 = iM31610 ^ i4;
                            i11 = i3;
                            strM8069 = strM8069;
                            intent = intent;
                            i5 = i5;
                        } else {
                            i5 = i5;
                            int iM2764 = (i9 - C0619.m2761("۠ܰ")) * 9;
                            str2 = strM4056;
                            i11 = ((iM2764 ^ i10) * 4975) ^ (-1770227275);
                            i12 = iM2764 ^ 739837281;
                            strM8069 = strM8069;
                            intent = intent;
                            strM4056 = str2;
                        }
                        break;
                    case -394525544:
                    case 1958807957:
                        intent = intent;
                        strM8069 = strM8069;
                        i5 = i5;
                        strM4056 = C1080.m4056(f15586, 1, 14, i7);
                        if (!C1321.m4852()) {
                            intent = intent;
                            int iM2765 = (i10 - C0619.m2761("᩺ۨ")) * q.h;
                            String str4 = strM4056;
                            i11 = ((iM2765 ^ i9) * (-27735)) ^ 2109706847;
                            i12 = iM2765 ^ 1602238;
                            strM8069 = strM8069;
                            strM4056 = str4;
                            i5 = i5;
                        } else {
                            iM31610 = (C0773.m3169("֫᩵") ^ i10) * (-105);
                            i3 = ((iM31610 ^ i9) * (-18245)) ^ (-1608663866);
                            i4 = 339203154;
                            i12 = iM31610 ^ i4;
                            i11 = i3;
                            strM8069 = strM8069;
                            intent = intent;
                            i5 = i5;
                        }
                        break;
                    case -152860753:
                    case 780203739:
                        intent = intent;
                        strM8069 = C2375.m8069(sArr2, 15, 6, i7);
                        if (C3077.f9998) {
                            int iM31611 = C0773.m3169("ۜܰ") ^ i9;
                            i12 = iM31611 ^ (-2112224667);
                            i11 = ((iM31611 ^ i10) * (-23609)) ^ (-357259491);
                            intent = intent;
                            i5 = 2;
                        } else {
                            strM8069 = strM8069;
                            i5 = 2;
                            int iM2766 = (i9 - C0619.m2761("۠ܰ")) * 9;
                            str2 = strM4056;
                            i11 = ((iM2766 ^ i10) * 4975) ^ (-1770227275);
                            i12 = iM2766 ^ 739837281;
                            strM8069 = strM8069;
                            intent = intent;
                            strM4056 = str2;
                        }
                        break;
                    case 262238698:
                    case 1841756699:
                        intent.putExtra(strM8069, i5);
                        sArr3 = f15586;
                        if (RunnableC0334.f1808 <= 0) {
                            str2 = strM4056;
                            intent = intent;
                            strM8069 = strM8069;
                            i5 = i5;
                            iM3169 = (C0619.m2761("᩵֨") + i10) * (-75);
                            i = ((iM3169 ^ i9) * 3763) ^ (-2020827277);
                            i2 = 1198650065;
                            i12 = iM3169 ^ i2;
                            i11 = i;
                            strM8069 = strM8069;
                            intent = intent;
                            i5 = i5;
                            strM4056 = str2;
                        } else {
                            int iM31612 = (C0773.m3169("ᩳ۠") + i10) * 109;
                            Intent intent2 = intent;
                            i11 = ((iM31612 ^ i9) * o.a.x) ^ 949409103;
                            i12 = iM31612 ^ 1656521516;
                            intent = intent2;
                        }
                        break;
                    case 287461138:
                    case 666672827:
                        if (C3779.f12953 <= 0) {
                            intent = intent;
                            strM8069 = strM8069;
                            int iM2767 = (i9 - C0619.m2761("۠ܰ")) * 9;
                            str2 = strM4056;
                            i11 = ((iM2767 ^ i10) * 4975) ^ (-1770227275);
                            i12 = iM2767 ^ 739837281;
                            strM8069 = strM8069;
                            intent = intent;
                            strM4056 = str2;
                        }
                        str2 = strM4056;
                        intent = intent;
                        strM8069 = strM8069;
                        i5 = i5;
                        iM3169 = (C0619.m2761("᩵֨") + i10) * (-75);
                        i = ((iM3169 ^ i9) * 3763) ^ (-2020827277);
                        i2 = 1198650065;
                        i12 = iM3169 ^ i2;
                        i11 = i;
                        strM8069 = strM8069;
                        intent = intent;
                        i5 = i5;
                        strM4056 = str2;
                        break;
                    case 316520158:
                    case 1118603083:
                        if (RunnableC3055.m9933() != 0) {
                            str2 = strM4056;
                            intent = intent;
                            strM8069 = strM8069;
                            i5 = i5;
                            iM3169 = (C0619.m2761("᩵֨") + i10) * (-75);
                            i = ((iM3169 ^ i9) * 3763) ^ (-2020827277);
                            i2 = 1198650065;
                            i12 = iM3169 ^ i2;
                            i11 = i;
                            strM8069 = strM8069;
                            intent = intent;
                            i5 = i5;
                            strM4056 = str2;
                        } else {
                            intent = intent;
                            strM8069 = strM8069;
                            i5 = i5;
                            iM31610 = C0773.m3169("ᩴۘ") ^ i9;
                            i3 = ((iM31610 ^ i10) * (-17865)) ^ 650509854;
                            i4 = 1390490878;
                            i12 = iM31610 ^ i4;
                            i11 = i3;
                            strM8069 = strM8069;
                            intent = intent;
                            i5 = i5;
                        }
                        break;
                    case 337414330:
                    case 1895676771:
                        i7 = 51418;
                        iM31610 = C0773.m3169("ۖۤ") ^ i9;
                        i3 = ((iM31610 ^ i10) * 15819) ^ (-1912043273);
                        i4 = -1692536591;
                        i12 = iM31610 ^ i4;
                        i11 = i3;
                        strM8069 = strM8069;
                        intent = intent;
                        i5 = i5;
                        break;
                    case 788263633:
                    case 2111005018:
                        strM8069 = strM8069;
                        Application applicationM4856 = C1321.m4856();
                        i5 = i5;
                        if (C20932.m47848() == 0) {
                            intent = new Intent(applicationM4856, (Class<?>) ActivityC4300.class);
                            sArr2 = f15586;
                            if (C1542.f5343 <= 0) {
                                int iM2768 = (i10 - C0619.m2761("᩺ۨ")) * q.h;
                                String str5 = strM4056;
                                i11 = ((iM2768 ^ i9) * (-27735)) ^ 2109706847;
                                i12 = iM2768 ^ 1602238;
                                strM8069 = strM8069;
                                strM4056 = str5;
                            } else {
                                int iM31613 = (i9 - C0773.m3169("᩹۫")) * 19;
                                i12 = iM31613 ^ (-476459245);
                                i11 = ((iM31613 ^ i10) * (-26551)) ^ (-1943329818);
                                strM8069 = strM8069;
                            }
                            i5 = i5;
                        }
                        break;
                    default:
                        intent = intent;
                        strM8069 = strM8069;
                        i5 = i5;
                        int i13 = s + s2;
                        if (i6 - (i13 * i13) <= 0) {
                            iM31610 = C0619.m2761("۟᩶") ^ i10;
                            i3 = ((iM31610 ^ i9) * (-7093)) ^ 61362946;
                            i4 = 952474702;
                        } else {
                            iM31610 = C0773.m3169("ۛۚ") ^ i9;
                            i3 = ((iM31610 ^ i10) * (-13235)) ^ 552767018;
                            i4 = -1625209962;
                        }
                        i12 = iM31610 ^ i4;
                        i11 = i3;
                        strM8069 = strM8069;
                        intent = intent;
                        i5 = i5;
                        break;
                }
                return;
            }
            int iM31614 = (i10 - C0773.m3169("ܽܺ")) * (-65);
            i12 = iM31614 ^ 1806658398;
            i11 = ((iM31614 ^ i9) * (-24257)) ^ (-833441505);
            strM8069 = strM8069;
            i5 = i5;
        }
    }
}
