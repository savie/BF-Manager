package l;

import android.content.DialogInterface;
import android.graphics.Point;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.alipay.sdk.m.y.q;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.math.ec.rfc8032.Scalar25519;
import org.bouncycastle.pqc.crypto.falcon.FalconVrfy;

/* JADX INFO: renamed from: l.֡ۘۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51KR */
/* JADX INFO: loaded from: classes.dex */
public class C0168 extends AbstractC9051 implements InterfaceC16837, InterfaceC8940, InterfaceC10586 {

    /* JADX INFO: renamed from: ᩳܽ۬, reason: not valid java name and contains not printable characters */
    private static final short[] f1206;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f1207;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C23582 f1208;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public C12318 f1209;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f1210;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f1211;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public TextView f1212;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C4621 f1213;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public String f1214;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C11616 f1215;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f1216;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C24132 f1217;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public AbstractC2432 f1218;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public String f1219;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public int f1220;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public TextView f1221;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public boolean f1222;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public C22761 f1223;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C20283 f1224;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public ViewOnClickListenerC12166 f1225;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public boolean f1226;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public View f1227;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public boolean f1228;

    static {
        ApplicationC23172.m52091(2);
        f1206 = new short[]{3592, -2037, -8796, -3376, 2016, -5281, -5282, -5309, -5276, -5281, -5282, -5288, -5292, -5290, -5301, -5294, -5289, -5282, -5276, -5282, -5291, -5284, -5294, -5291, -5282, -5290, -5282, -5297, -5293, -5292, -5281, -5266, -5291, -5296, -5291, -5292, -5300, -5291, -5349, -5282, -5303, -5303, -5292, -5303, -32504, 29441, -32400, -5256, -5286, -5291, -5349, -5291, -5292, -5297, -5349, -5283, -5294, -5291, -5281, -5349, -5290, -5282, -5297, -5293, -5292, -5281, -5375, -5349, -5356, -5356, -5327, -5356, -5356, -5349, -5249, -5282, -5288, -5292, -5290, -5301, -5294, -5289, -5282, -5281, -5349, -5287, -5310, -5349, -5349, -5354, -5349, -5290, -5304, -5327, -5356, -5356, -5327, -5327, -5356, -5359, -5349, -5349, -5359, -5356, -5327, 8738, -11197, -24324, -32066, 18130, -11212, 5359, -20965, -20966, -20985, -20960, -20965, -20966, -20964, -20976, -20974, -20977, -20970, -20973, -20966, -20960, -20966, -20975, -20968, -20970, -20975, -20966, -20897, -20910, -20897, -20913, -20974, -20980, -20875, -20912, -20912, -20875, -20875, -20912, -20907, -20897, -20897, -20907, -20912, -20875, -20912, -20912, -20875, -20912, -20912, -20897, -20933, -20966, -20964, -20976, -20974, -20977, -20970, -20973, -20966, -20965, -20897, -20963, -20986, -20897, 5288, 20494, 20495, 20498, 20533, 20494, 20495, 20489, 20485, 20487, 20506, 20483, 20486, 20495, 20533, 20495, 20484, 20493, 20483, 20484, 20495, 3361, -93, -9599, -93, -83, -83, -83, -93, -85, -86, 9022, 30236, -29774, 30657, 20234, 18417, 31511, 6904, 27021, 32719, -28933, 4380, 185, -1382, 7789, 1572, 4883, -2522, 31491, 31499, 31514, 31494, 31489, 31498, -4780, -7256, 7461, 5038, 94, 9589, 4024, -6544, 9620, 1784, 5046, -2735, -5058, 7960, -7977, 31552, 31492, 31503, 31512, 31503, -974, 5278, -2840, 21, 2544, -6673, 6190, -6738, 6586, -87, 4643, 7409, 337, -3378, 11360, 261, -4588, 11426, -7465, 8505, 13731, -16184, -6118, 13448, 9869, -6622, -12593, -6041, -13701, -12289, -15231, -17573, -17574, -17577, -17590, -17567, -17591, -17583, -17588, -17574, -17567, -17591, -17588, -17569, -17586, -17567, -17580, -17569, -17592, -17569, 2417, -12765, -12707, -12772, -12712, -12715, -12712, -12707, -12772, -12763, -12712, -12734, -12712, -12707, -12789, 6310, -28279, -28282, -28277, -28263, -28263, -28262, -28277, -28258, -28286, -28281, -28273, -28258, -28286, -28283, -28274, -28263, -28273, -28282, -28273, -28279, -28258, -28273, -28274, -28253, -28284, -28284, -28273, -28264, -28247, -28282, -28277, -28263, -28263, -28273, -28263, 2201, 24235, 24253, 24244, 24253, 24251, 24236, 24253, 24252, 24209, 24246, 24246, 24253, 24234, 24219, 24244, 24249, 24235, 24235, 24253, 24235, 5222, 28168, 28160, 28177, 28173, 28170, 28161, 28235, 28175, 28164, 28179, 28164, 28235, 5977, -14704, -14689, -14702, -14720, -14720, -14717, -14702, -14713, -14693, 6250, 357, 340, 329, 325, 273, 322, 325, 350, 323, 336, 342, 340, 273, 344, 322, 273, 322, 325, 344, 349, 349, 273, 349, 350, 336, 341, 344, 351, 342, 8021, 8880, -11944, 15001, 1920, -30762, -30784, -30775, -30784, -30778, -30767, -30784, -30783, -30740, -30773, -30773, -30784, -30761, -30746, -30775, -30780, -30762, -30762, -30784, -30762};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public native String m1396();

    @Override // l.AbstractC9051
    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean mo1433() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0141 A[PHI: r6 r7
      0x0141: PHI (r6v4 int) = (r6v2 int), (r6v1 int), (r6v1 int) binds: [B:43:0x013f, B:39:0x011f, B:8:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x0141: PHI (r7v4 short) = (r7v1 short), (r7v2 short), (r7v1 short) binds: [B:43:0x013f, B:39:0x011f, B:8:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x0197 A[PHI: r3 r9 r10 r11
      0x0197: PHI (r3v3 short) = (r3v2 short), (r3v1 short), (r3v1 short), (r3v1 short), (r3v1 short), (r3v1 short) binds: [B:51:0x0195, B:28:0x00aa, B:24:0x008b, B:14:0x0051, B:11:0x004b, B:8:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x0197: PHI (r9v3 short[]) = (r9v1 short[]), (r9v2 short[]), (r9v1 short[]), (r9v1 short[]), (r9v1 short[]), (r9v1 short[]) binds: [B:51:0x0195, B:28:0x00aa, B:24:0x008b, B:14:0x0051, B:11:0x004b, B:8:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x0197: PHI (r10v3 int) = (r10v1 int), (r10v2 int), (r10v1 int), (r10v1 int), (r10v1 int), (r10v1 int) binds: [B:51:0x0195, B:28:0x00aa, B:24:0x008b, B:14:0x0051, B:11:0x004b, B:8:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x0197: PHI (r11v3 int) = (r11v1 int), (r11v1 int), (r11v2 int), (r11v1 int), (r11v1 int), (r11v1 int) binds: [B:51:0x0195, B:28:0x00aa, B:24:0x008b, B:14:0x0051, B:11:0x004b, B:8:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x01c7 A[PHI: r2 r16
      0x01c7: PHI (r2v3 char) = (r2v2 char), (r2v1 char), (r2v1 char) binds: [B:55:0x01c5, B:20:0x006b, B:11:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x01c7: PHI (r16v3 java.lang.String) = (r16v1 java.lang.String), (r16v2 java.lang.String), (r16v1 java.lang.String) binds: [B:55:0x01c5, B:20:0x006b, B:11:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x01f6 A[PHI: r4 r5
      0x01f6: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:59:0x01f4, B:47:0x0178] A[DONT_GENERATE, DONT_INLINE]
      0x01f6: PHI (r5v2 int) = (r5v1 int), (r5v3 int) binds: [B:59:0x01f4, B:47:0x0178] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0228 A[PHI: r1
      0x0228: PHI (r1v4 short[]) = (r1v3 short[]), (r1v1 short[]), (r1v1 short[]) binds: [B:63:0x0226, B:16:0x0055, B:14:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC9051
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int mo1444() {
        int iM2761;
        int i;
        int i2;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        short s2 = 0;
        int i6 = 0;
        short[] sArr2 = null;
        int i7 = 0;
        int i8 = 0;
        int i9 = 235351208;
        int i10 = C3492.f12043;
        int i11 = C1564.f5401;
        int iM3169 = (i10 - C0773.m3169("ۖᩳ")) * (-73);
        int i12 = ((iM3169 ^ i11) * (-17209)) ^ (-1439568779);
        int i13 = iM3169 ^ (-201065443);
        String strM11769 = null;
        while (true) {
            i9 = i13 ^ (i12 & (((i9 ^ i11) * 9363) >> 31));
            switch (i9) {
                case -2040782904:
                case 1598995007:
                    C3998.m12920();
                    C2834.m9344();
                    return 0;
                case -1818945668:
                case 812364550:
                    s = sArr[c];
                    if (C4282.f15546 <= 0) {
                        iM2761 = C0773.m3169("ᩳ۬") ^ i10;
                        i = ((iM2761 ^ i11) * (-12977)) ^ (-1285602173);
                        i2 = 1207882891;
                    } else {
                        iM2761 = C0773.m3169("ۛ᩶") ^ i11;
                        i = ((iM2761 ^ i10) * 7275) ^ 1866239943;
                        i2 = 138635121;
                    }
                    int i14 = i;
                    i13 = iM2761 ^ i2;
                    i12 = i14;
                    break;
                case -1481047988:
                case -112778546:
                    if (RunnableC0334.f1808 <= 0) {
                        iM2761 = C0773.m3169("ᩳ۬") ^ i10;
                        i = ((iM2761 ^ i11) * (-12977)) ^ (-1285602173);
                        i2 = 1207882891;
                    } else {
                        iM2761 = (C0619.m2761("ۘ᩶") ^ i11) * (-45);
                        i = ((iM2761 ^ i10) * (-17765)) ^ (-2046468895);
                        i2 = -899193366;
                    }
                    int i15 = i;
                    i13 = iM2761 ^ i2;
                    i12 = i15;
                    break;
                case -1442700011:
                case 1926522937:
                    i3 = s * s;
                    i4 = 25573249;
                    if (C20932.m47848() != 0) {
                        iM2761 = (C0773.m3169("ᩴ᩺") + i10) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i = ((iM2761 ^ i11) * (-21175)) ^ 117454359;
                        i2 = -806954779;
                    } else {
                        iM2761 = C0619.m2761("ۤۚ") ^ i10;
                        i = ((iM2761 ^ i11) * (-5211)) ^ 2036050126;
                        i2 = 989864625;
                    }
                    int i16 = i;
                    i13 = iM2761 ^ i2;
                    i12 = i16;
                    break;
                case -1397844991:
                case -287419394:
                    C2419.m8174();
                    if (C2287.f7432 < 0) {
                        iM2761 = C0773.m3169("ᩳ۬") ^ i10;
                        i = ((iM2761 ^ i11) * (-12977)) ^ (-1285602173);
                        i2 = 1207882891;
                    } else {
                        iM2761 = (C0619.m2761("֡᩺") ^ i11) * 109;
                        i = ((iM2761 ^ i10) * (-13561)) ^ (-384790129);
                        i2 = -887376308;
                    }
                    int i17 = i;
                    i13 = iM2761 ^ i2;
                    i12 = i17;
                    break;
                case -1306992193:
                case -628307373:
                    strM11769 = AbstractC3624.m11769(sArr2, i7, i8, i6);
                    if (C2375.f7641 <= 0) {
                        iM2761 = (C0619.m2761("ۘ᩶") ^ i11) * (-45);
                        i = ((iM2761 ^ i10) * (-17765)) ^ (-2046468895);
                        i2 = -899193366;
                    } else {
                        iM2761 = (C0773.m3169("ۧ᩹") + i11) * 59;
                        i = ((iM2761 ^ i10) * 69) ^ (-2074639762);
                        i2 = 923361359;
                    }
                    int i18 = i;
                    i13 = iM2761 ^ i2;
                    i12 = i18;
                    break;
                case -1206183300:
                case 687235598:
                    int i19 = i3 + i4;
                    i5 = i19 + i19;
                    if (C3077.f9998) {
                        iM2761 = (C0773.m3169("ܽܽ") ^ i11) * 119;
                        i = ((iM2761 ^ i10) * 17121) ^ 1181966770;
                        i2 = -242742359;
                    } else {
                        iM2761 = (C0619.m2761("֡᩺") ^ i11) * 109;
                        i = ((iM2761 ^ i10) * (-13561)) ^ (-384790129);
                        i2 = -887376308;
                    }
                    int i110 = i;
                    i13 = iM2761 ^ i2;
                    i12 = i110;
                    break;
                case -1189793539:
                case 505670006:
                    if (AbstractC0116.f1064 <= 0) {
                        iM2761 = (C0619.m2761("۬᩵") ^ i10) * 99;
                        i = ((iM2761 ^ i11) * 12753) ^ (-1024623468);
                        i2 = -419247233;
                    } else {
                        iM2761 = C0773.m3169("ᩳ۬") ^ i10;
                        i = ((iM2761 ^ i11) * (-12977)) ^ (-1285602173);
                        i2 = 1207882891;
                    }
                    int i111 = i;
                    i13 = iM2761 ^ i2;
                    i12 = i111;
                    break;
                case -1158496471:
                case 1751067053:
                    sArr = f1206;
                    if (C2485.f7950 != 0) {
                        iM2761 = (C0619.m2761("۬᩵") ^ i10) * 99;
                        i = ((iM2761 ^ i11) * 12753) ^ (-1024623468);
                        i2 = -419247233;
                    } else {
                        iM2761 = (C0619.m2761("᩶ۛ") + i10) * 87;
                        i = ((iM2761 ^ i11) * (-18361)) ^ (-1143205702);
                        i2 = -1561928507;
                    }
                    int i112 = i;
                    i13 = iM2761 ^ i2;
                    i12 = i112;
                    break;
                case -1110203673:
                case 755925107:
                    i8 = 3;
                    if (AbstractC0116.m1243() != 0) {
                        iM2761 = C0773.m3169("ᩳ۬") ^ i10;
                        i = ((iM2761 ^ i11) * (-12977)) ^ (-1285602173);
                        i2 = 1207882891;
                    } else {
                        iM2761 = C0619.m2761("ᩴ᩶") ^ i10;
                        i = ((iM2761 ^ i11) * 12577) ^ 151978260;
                        i2 = -1578290188;
                    }
                    int i113 = i;
                    i13 = iM2761 ^ i2;
                    i12 = i113;
                    break;
                case -784046510:
                case 230414716:
                    s2 = 5057;
                    if (AbstractC0641.m2813() <= 0) {
                        iM2761 = (C0619.m2761("֡᩺") ^ i11) * 109;
                        i = ((iM2761 ^ i10) * (-13561)) ^ (-384790129);
                        i2 = -887376308;
                    } else {
                        iM2761 = (C0773.m3169("ۢۚ") + i10) * 67;
                        i = ((iM2761 ^ i11) * (-6233)) ^ (-461579929);
                        i2 = 1406877427;
                    }
                    int i114 = i;
                    i13 = iM2761 ^ i2;
                    i12 = i114;
                    break;
                case -188043077:
                case 1976941478:
                    i6 = 29173;
                    iM2761 = C0619.m2761("᩻֫") ^ i11;
                    i = ((iM2761 ^ i10) * (-10431)) ^ (-475607451);
                    i2 = -1923785545;
                    int i115 = i;
                    i13 = iM2761 ^ i2;
                    i12 = i115;
                    break;
                case -138311788:
                case 268992923:
                    sArr2 = f1206;
                    i7 = 421;
                    if (C1321.f4751 >= 0) {
                        iM2761 = C0773.m3169("ᩳ۬") ^ i10;
                        i = ((iM2761 ^ i11) * (-12977)) ^ (-1285602173);
                        i2 = 1207882891;
                    } else {
                        iM2761 = (C0619.m2761("᩵᩶") + i11) * (-91);
                        i = ((iM2761 ^ i10) * 22425) ^ (-181300175);
                        i2 = 1205555799;
                    }
                    int i116 = i;
                    i13 = iM2761 ^ i2;
                    i12 = i116;
                    break;
                case 375034965:
                case 1410036379:
                    RunnableC0334.m2063();
                    C2878.m9491();
                    iM2761 = (C0619.m2761("۬᩵") ^ i10) * 99;
                    i = ((iM2761 ^ i11) * 12753) ^ (-1024623468);
                    i2 = -419247233;
                    int i117 = i;
                    i13 = iM2761 ^ i2;
                    i12 = i117;
                    break;
                case 656597053:
                case 872974932:
                    i6 = 42777;
                    iM2761 = C0619.m2761("᩻֫") ^ i11;
                    i = ((iM2761 ^ i10) * (-10431)) ^ (-475607451);
                    i2 = -1923785545;
                    int i118 = i;
                    i13 = iM2761 ^ i2;
                    i12 = i118;
                    break;
                case 855213607:
                case 1184770309:
                    c = 420;
                    if (C2878.f9462) {
                        iM2761 = (C0619.m2761("ۘ᩶") ^ i11) * (-45);
                        i = ((iM2761 ^ i10) * (-17765)) ^ (-2046468895);
                        i2 = -899193366;
                    } else {
                        iM2761 = C0619.m2761("ܽܰ") ^ i10;
                        i = ((iM2761 ^ i11) * 13577) ^ 1249774411;
                        i2 = 597543004;
                    }
                    int i119 = i;
                    i13 = iM2761 ^ i2;
                    i12 = i119;
                    break;
                case 1016554474:
                case 1796128039:
                    if (RunnableC3646.f12471) {
                        iM2761 = (C0773.m3169("ᩴ᩺") + i10) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i = ((iM2761 ^ i11) * (-21175)) ^ 117454359;
                        i2 = -806954779;
                    } else {
                        iM2761 = (C0773.m3169("ۘܶ") ^ i11) * (-7);
                        i = ((iM2761 ^ i10) * (-19319)) ^ 430350478;
                        i2 = -1759189598;
                    }
                    int i1110 = i;
                    i13 = iM2761 ^ i2;
                    i12 = i1110;
                    break;
                case 1197948487:
                case 1780454832:
                    int i20 = s + s2;
                    if (i5 - (i20 * i20) < 0) {
                        iM2761 = (C0773.m3169("ۡ۬") + i10) * (-37);
                        i = ((iM2761 ^ i11) * 29993) ^ (-439156358);
                        i2 = 1760444186;
                    } else {
                        iM2761 = C0619.m2761("᩺ۧ") ^ i11;
                        i = ((iM2761 ^ i10) * 2189) ^ 243127810;
                        i2 = 1318867018;
                    }
                    int i1111 = i;
                    i13 = iM2761 ^ i2;
                    i12 = i1111;
                    break;
                default:
                    return C0619.m2761(strM11769) ^ 2097982472;
            }
        }
    }

    @Override // l.AbstractC9051
    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean mo1446() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0238 A[PHI: r3 r13 r16
      0x0238: PHI (r3v4 android.os.Bundle) = (r3v2 android.os.Bundle), (r3v3 android.os.Bundle), (r3v2 android.os.Bundle), (r3v2 android.os.Bundle) binds: [B:42:0x0178, B:38:0x0152, B:11:0x0064, B:6:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x0238: PHI (r13v4 short[]) = (r13v2 short[]), (r13v3 short[]), (r13v2 short[]), (r13v2 short[]) binds: [B:42:0x0178, B:38:0x0152, B:11:0x0064, B:6:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x0238: PHI (r16v3 short[]) = (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v4 short[]) binds: [B:42:0x0178, B:38:0x0152, B:11:0x0064, B:6:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x026c A[PHI: r8 r10 r11 r21
      0x026c: PHI (r8v4 short) = (r8v2 short), (r8v3 short), (r8v2 short), (r8v2 short) binds: [B:63:0x026a, B:57:0x021f, B:53:0x01fa, B:34:0x012c] A[DONT_GENERATE, DONT_INLINE]
      0x026c: PHI (r10v4 int) = (r10v2 int), (r10v2 int), (r10v3 int), (r10v2 int) binds: [B:63:0x026a, B:57:0x021f, B:53:0x01fa, B:34:0x012c] A[DONT_GENERATE, DONT_INLINE]
      0x026c: PHI (r11v4 short) = (r11v2 short), (r11v2 short), (r11v3 short), (r11v2 short) binds: [B:63:0x026a, B:57:0x021f, B:53:0x01fa, B:34:0x012c] A[DONT_GENERATE, DONT_INLINE]
      0x026c: PHI (r21v5 short) = (r21v3 short), (r21v4 short), (r21v3 short), (r21v3 short) binds: [B:63:0x026a, B:57:0x021f, B:53:0x01fa, B:34:0x012c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x02bc  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008f, code lost:
    
        if (l.C3734.f12817 < 0) goto L14;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1435(java.lang.String r23, java.lang.String r24, java.util.List r25) {
        /*
            Method dump skipped, instruction units count: 906
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C0168.m1435(java.lang.String, java.lang.String, java.util.List):void");
    }

    /* JADX WARN: Code duplicated, block: B:48:0x02c3 A[PHI: r32
      0x02c3: PHI (r32v54 boolean) = (r32v39 boolean), (r32v46 boolean), (r32v55 boolean) binds: [B:47:0x02c1, B:24:0x010c, B:8:0x00a1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00d0, code lost:
    
        if (l.C3448.m11248() != 0) goto L12;
     */
    @Override // l.ComponentCallbacksC11612
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r39, android.os.Bundle r40) {
        /*
            Method dump skipped, instruction units count: 1834
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C0168.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m1407(C0168 c0168, C0408 c0408, MenuItem menuItem) {
        int i = -1788894063;
        int i2 = C3690.f12684;
        int i3 = C1080.f3865;
        int iM3169 = (C0773.m3169("ۤ֨") ^ i2) * 9;
        int i4 = ((iM3169 ^ i3) * 16301) ^ 1110590670;
        int i5 = 596500561;
        while (true) {
            i = ((((i ^ i3) * (-10143)) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2034681490:
                case 1578348876:
                    break;
                case -2029854563:
                case 2064496915:
                    C3492.m11488();
                    RunnableC0334.m2063();
                    iM3169 = C0619.m2761("ۨܳ") ^ i3;
                    i4 = ((iM3169 ^ i2) * (-32101)) ^ 1263970783;
                    i5 = 46768202;
                    break;
                case -1998369428:
                case 588332855:
                    if (C3779.f12953 > 0) {
                        iM3169 = C0773.m3169("ۖۢ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 23971) ^ (-1067908086);
                        i5 = 732624179;
                    } else {
                        iM3169 = (i2 - C0619.m2761("۬ᩳ")) * (-119);
                        i4 = ((iM3169 ^ i3) * 11355) ^ (-2077184899);
                        i5 = 979256892;
                    }
                    break;
                case -1913690652:
                case 1891464866:
                    if (c0408.m2214(menuItem)) {
                        iM3169 = C0619.m2761("᩺۬") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-20371)) ^ 196361360;
                        i5 = -1203158084;
                    } else {
                        iM3169 = C0773.m3169("ܽܳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-5717)) ^ (-1067476146);
                        i5 = 164961291;
                    }
                    break;
                case -1789567468:
                case -884963655:
                    if (C2419.f7754 >= 0) {
                        iM3169 = C0773.m3169("۫ۛ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-20209)) ^ (-205391934);
                        i5 = -773666193;
                    } else {
                        iM3169 = (C0619.m2761("֫᩶") + i2) * (-27);
                        i4 = ((iM3169 ^ i3) * 17185) ^ (-65642279);
                        i5 = -777146957;
                    }
                    break;
                case -1452926127:
                case -255035113:
                    if (C0862.f3233 != 0) {
                        iM3169 = (i2 - C0619.m2761("۬ᩳ")) * (-119);
                        i4 = ((iM3169 ^ i3) * 11355) ^ (-2077184899);
                        i5 = 979256892;
                    } else {
                        iM3169 = C0619.m2761("ۨܳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-32101)) ^ 1263970783;
                        i5 = 46768202;
                    }
                    break;
                case -1332453793:
                case 1733254904:
                    if (AbstractC3624.f12429 <= 0) {
                        iM3169 = C0619.m2761("ۨܳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-32101)) ^ 1263970783;
                        i5 = 46768202;
                    } else {
                        iM3169 = (i3 - C0773.m3169("᩺ۚ")) * (-35);
                        i4 = ((iM3169 ^ i2) * 5423) ^ 602674538;
                        i5 = -619228141;
                    }
                    break;
                case -1016361795:
                case 176439767:
                    C3690.m11987();
                    if (C2375.f7641 > 0) {
                        iM3169 = (C0773.m3169("ۛ᩷") + i2) * (-49);
                        i4 = ((iM3169 ^ i3) * (-1927)) ^ 2044721271;
                        i5 = 2074211080;
                    } else {
                        iM3169 = C0619.m2761("ۨܳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-32101)) ^ 1263970783;
                        i5 = 46768202;
                    }
                    break;
                case -953867068:
                case 1641967785:
                    if (RunnableC3646.f12471) {
                        iM3169 = C0619.m2761("ۨܳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-32101)) ^ 1263970783;
                        i5 = 46768202;
                    } else {
                        iM3169 = C0619.m2761("ۧ᩹") ^ i3;
                        i4 = ((iM3169 ^ i2) * 15163) ^ 672582707;
                        i5 = 270934051;
                    }
                    break;
                case -783108759:
                case -630976197:
                    if (C13473.f42873 != 0) {
                        iM3169 = C0619.m2761("ۨܳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-32101)) ^ 1263970783;
                        i5 = 46768202;
                    } else {
                        iM3169 = C0773.m3169("ᩳۚ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-9555)) ^ (-1449030480);
                        i5 = 620757229;
                    }
                    break;
                case -759976587:
                case -260537295:
                    c0168.f1223.m51298(c0168.m1441());
                    iM3169 = C0619.m2761("᩺۬") ^ i2;
                    i4 = ((iM3169 ^ i3) * (-20371)) ^ 196361360;
                    i5 = -1203158084;
                    break;
                case -719566809:
                case -642831383:
                    C2310.m7813();
                    C17202.m40372();
                    break;
                case -198944961:
                case 1561189325:
                    if (C4238.f15451 >= 0) {
                        iM3169 = (C0773.m3169("ۛ᩷") + i2) * (-49);
                        i4 = ((iM3169 ^ i3) * (-1927)) ^ 2044721271;
                        i5 = 2074211080;
                    } else {
                        iM3169 = (C0619.m2761("ܳ᩺") ^ i2) * (-103);
                        i4 = ((iM3169 ^ i3) * 27557) ^ 961653774;
                        i5 = 1747158732;
                    }
                    break;
                case -39335906:
                case 534372055:
                    if (C2702.f8586 <= 0) {
                        iM3169 = (i2 - C0619.m2761("۬ᩳ")) * (-119);
                        i4 = ((iM3169 ^ i3) * 11355) ^ (-2077184899);
                        i5 = 979256892;
                    } else {
                        iM3169 = C0619.m2761("ۢۡ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-11115)) ^ 1205291502;
                        i5 = -1162282370;
                    }
                    break;
                case 354257685:
                case 1069207271:
                    if (C3690.f12684 <= 0) {
                        iM3169 = (C0773.m3169("ۛ᩷") + i2) * (-49);
                        i4 = ((iM3169 ^ i3) * (-1927)) ^ 2044721271;
                        i5 = 2074211080;
                    } else {
                        iM3169 = C0773.m3169("᩵ܺ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-11407)) ^ (-400688958);
                        i5 = -1990527473;
                    }
                    break;
                case 468745034:
                case 1771246489:
                    if (C11235.m28309() != 0) {
                        iM3169 = C0773.m3169("ۖۢ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 23971) ^ (-1067908086);
                        i5 = 732624179;
                    } else {
                        iM3169 = C0773.m3169("۠᩶") ^ i2;
                        i4 = ((iM3169 ^ i3) * 10563) ^ (-125654253);
                        i5 = -1017878808;
                    }
                    break;
                case 1262897373:
                case 1379900290:
                    if (RunnableC3055.f9898 >= 0) {
                        iM3169 = (C0773.m3169("ۛ᩷") + i2) * (-49);
                        i4 = ((iM3169 ^ i3) * (-1927)) ^ 2044721271;
                        i5 = 2074211080;
                    } else {
                        iM3169 = (i2 - C0619.m2761("۬ܶ")) * (-109);
                        i4 = ((iM3169 ^ i3) * 9667) ^ (-1220217812);
                        i5 = 1875264239;
                    }
                    break;
                default:
                    if (C20932.f66974 <= 0) {
                        iM3169 = C0773.m3169("۫ۛ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-20209)) ^ (-205391934);
                        i5 = -773666193;
                    } else {
                        iM3169 = (C0773.m3169("᩷ܿ") + i3) * 79;
                        i4 = ((iM3169 ^ i2) * 22697) ^ 1313258807;
                        i5 = -757373816;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m1406(C0168 c0168, AtomicBoolean atomicBoolean, EnumC8514 enumC8514) {
        int i = 1590761692;
        int i2 = C4238.f15451;
        int i3 = C1826.f6190;
        int iM3169 = (i3 - C0773.m3169("֨ۙ")) * 17;
        int i4 = ((iM3169 ^ i2) * (-28389)) ^ 852750995;
        int i5 = -809332197;
        while (true) {
            i = ((((i ^ i2) * (-229)) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -1786310330:
                case 1955582808:
                    C13473.m33144();
                    iM3169 = (i2 - C0773.m3169("֨ۚ")) * (-15);
                    i4 = ((iM3169 ^ i3) * 25229) ^ 1511681267;
                    i5 = -2082175266;
                    break;
                case -1694465129:
                case 1235185219:
                    if (c0168.f1210) {
                        iM3169 = C0619.m2761("۟ۛ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-26197)) ^ (-492126392);
                        i5 = -552790078;
                    } else {
                        iM3169 = C0773.m3169("ۧۙ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 15333) ^ (-804253005);
                        i5 = -121109971;
                    }
                    break;
                case -1689213074:
                case 1852268720:
                    C0487.m2356();
                    if (RunnableC3055.f9898 >= 0) {
                        iM3169 = (C0773.m3169("۫ۛ") + i3) * 75;
                        i4 = ((iM3169 ^ i2) * 22965) ^ (-820117615);
                        i5 = -1638228716;
                    } else {
                        iM3169 = (C0619.m2761("ۙ᩻") ^ i2) * (-13);
                        i4 = ((iM3169 ^ i3) * 10599) ^ (-1405310748);
                        i5 = -869929399;
                    }
                    break;
                case -1657925796:
                case 289248777:
                    if (C1321.f4751 >= 0) {
                        iM3169 = (C0619.m2761("ۙ᩻") ^ i2) * (-13);
                        i4 = ((iM3169 ^ i3) * 10599) ^ (-1405310748);
                        i5 = -869929399;
                    } else {
                        iM3169 = (i2 - C0773.m3169("֨ۚ")) * (-15);
                        i4 = ((iM3169 ^ i3) * 25229) ^ 1511681267;
                        i5 = -2082175266;
                    }
                    break;
                case -1655568405:
                case -1550246086:
                    if (RunnableC3646.f12471) {
                        iM3169 = (i2 - C0619.m2761("ܶᩳ")) * 51;
                        i4 = ((iM3169 ^ i3) * 7007) ^ 83626967;
                        i5 = -676527777;
                    } else {
                        iM3169 = C0773.m3169("ܰ֫") ^ i2;
                        i4 = ((iM3169 ^ i3) * 19461) ^ 369957559;
                        i5 = 681310270;
                    }
                    break;
                case -1641275028:
                case 829254226:
                    if (C3734.m12152() >= 0) {
                        iM3169 = (C0773.m3169("۫ۛ") + i3) * 75;
                        i4 = ((iM3169 ^ i2) * 22965) ^ (-820117615);
                        i5 = -1638228716;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ۗ֫")) * (-71);
                        i4 = ((iM3169 ^ i2) * (-8765)) ^ 173915226;
                        i5 = -1009349117;
                    }
                    break;
                case -1567990919:
                case 1773859127:
                    if (c0168.f1228) {
                        iM3169 = (i3 - C0773.m3169("ۜ۫")) * (-49);
                        i4 = ((iM3169 ^ i2) * 21055) ^ 2007636128;
                        i5 = -1102622265;
                    } else {
                        iM3169 = C0773.m3169("ۧۙ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 15333) ^ (-804253005);
                        i5 = -121109971;
                    }
                    break;
                case -1366124158:
                case -328963034:
                    if (C1321.m4852()) {
                        iM3169 = (C0619.m2761("ۡ۬") ^ i2) * 115;
                        i4 = ((iM3169 ^ i3) * 20547) ^ 777434031;
                        i5 = 117317130;
                    } else {
                        iM3169 = (C0773.m3169("۫ۛ") + i3) * 75;
                        i4 = ((iM3169 ^ i2) * 22965) ^ (-820117615);
                        i5 = -1638228716;
                    }
                    break;
                case -1337969299:
                case 1784004204:
                    if (C1783.f6087 <= 0) {
                        iM3169 = (i2 - C0773.m3169("֨ۚ")) * (-15);
                        i4 = ((iM3169 ^ i3) * 25229) ^ 1511681267;
                        i5 = -2082175266;
                    } else {
                        iM3169 = C0773.m3169("ۢ۟") ^ i2;
                        i4 = ((iM3169 ^ i3) * 26865) ^ (-478405510);
                        i5 = -790242821;
                    }
                    break;
                case -1310564197:
                case 1187004593:
                    if (C3448.f11240 >= 0) {
                        iM3169 = (C0619.m2761("ۙ᩻") ^ i2) * (-13);
                        i4 = ((iM3169 ^ i3) * 10599) ^ (-1405310748);
                        i5 = -869929399;
                    } else {
                        iM3169 = C0619.m2761("ܺۢ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 14333) ^ 1593331792;
                        i5 = -4885919;
                    }
                    break;
                case -948144680:
                case 1465564628:
                    if (C0773.f2792 <= 0) {
                        iM3169 = (C0773.m3169("۫ۛ") + i3) * 75;
                        i4 = ((iM3169 ^ i2) * 22965) ^ (-820117615);
                        i5 = -1638228716;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ۙ۠")) * (-97);
                        i4 = ((iM3169 ^ i2) * (-26539)) ^ (-898410676);
                        i5 = -408447047;
                    }
                    break;
                case -928345767:
                case 1470051658:
                    C2288.m7767();
                    C1783.m6232();
                    break;
                case -342254744:
                case 584960249:
                    if (C20932.f66974 <= 0) {
                        iM3169 = (i2 - C0619.m2761("ܶᩳ")) * 51;
                        i4 = ((iM3169 ^ i3) * 7007) ^ 83626967;
                        i5 = -676527777;
                    } else {
                        iM3169 = C0773.m3169("᩷ۢ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 1393) ^ (-1984445011);
                        i5 = 1508305084;
                    }
                    break;
                case -280887551:
                case 2119987849:
                    if (enumC8514.m22827()) {
                        iM3169 = (C0619.m2761("۠۟") ^ i3) * (-31);
                        i4 = ((iM3169 ^ i2) * 23885) ^ (-184402327);
                        i5 = -2118677669;
                    } else {
                        iM3169 = C0773.m3169("ۧۙ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 15333) ^ (-804253005);
                        i5 = -121109971;
                    }
                    break;
                case -279777570:
                case 218174406:
                    if (atomicBoolean.compareAndSet(true, false)) {
                        iM3169 = C0773.m3169("ۧۙ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 15333) ^ (-804253005);
                        i5 = -121109971;
                    } else {
                        iM3169 = C0619.m2761("۟֡") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-5433)) ^ (-247702916);
                        i5 = -924084990;
                    }
                    break;
                case 69531248:
                case 235685615:
                    C3448.m11245(new C21051(c0168));
                    iM3169 = C0773.m3169("ۧۙ") ^ i3;
                    i4 = ((iM3169 ^ i2) * 15333) ^ (-804253005);
                    i5 = -121109971;
                    break;
                case 213258827:
                case 1382793641:
                    if (C2375.m8065() <= 0) {
                        iM3169 = (i2 - C0773.m3169("֨ۚ")) * (-15);
                        i4 = ((iM3169 ^ i3) * 25229) ^ 1511681267;
                        i5 = -2082175266;
                    } else {
                        iM3169 = (i2 - C0773.m3169("ܳܽ")) * 123;
                        i4 = ((iM3169 ^ i3) * 18377) ^ 347300630;
                        i5 = 1728656455;
                    }
                    break;
                case 308547052:
                case 393678336:
                    if (C1321.m4852()) {
                        iM3169 = (C0773.m3169("ܳۛ") + i3) * 57;
                        i4 = ((iM3169 ^ i2) * 22657) ^ 608784671;
                        i5 = -948178086;
                    } else {
                        iM3169 = (i2 - C0773.m3169("֨ۚ")) * (-15);
                        i4 = ((iM3169 ^ i3) * 25229) ^ 1511681267;
                        i5 = -2082175266;
                    }
                    break;
                case 545614422:
                case 1716664559:
                    if (AbstractC0116.f1064 <= 0) {
                        iM3169 = (C0619.m2761("ۙ᩻") ^ i2) * (-13);
                        i4 = ((iM3169 ^ i3) * 10599) ^ (-1405310748);
                        i5 = -869929399;
                    } else {
                        iM3169 = C0773.m3169("᩷ܰ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-18695)) ^ 693805902;
                        i5 = -947972284;
                    }
                    break;
                case 2026993723:
                case 2096024333:
                    if (C1321.f4751 >= 0) {
                        iM3169 = (C0619.m2761("ۙ᩻") ^ i2) * (-13);
                        i4 = ((iM3169 ^ i3) * 10599) ^ (-1405310748);
                        i5 = -869929399;
                    } else {
                        iM3169 = (C0773.m3169("᩻ᩳ") + i3) * 41;
                        i4 = ((iM3169 ^ i2) * 29809) ^ 1403205820;
                        i5 = 629872476;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m1405(C0168 c0168, List list, List list2, List list3, List list4) {
        int i = -994306220;
        int i2 = AbstractC0116.f1064;
        int i3 = C1519.f5300;
        int iM2761 = C0619.m2761("֡ᩴ") ^ i3;
        int i4 = ((iM2761 ^ i2) * (-13913)) ^ (-146454409);
        int i5 = -1023223612;
        while (true) {
            i = ((((i ^ i2) * 14551) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2087317208:
                case 1940187022:
                    RunnableC0334.m2063();
                    if (!C0619.f2439) {
                        iM2761 = (C0773.m3169("᩺᩹") ^ i2) * 99;
                        i4 = ((iM2761 ^ i3) * (-2293)) ^ 1262872232;
                        i5 = 818274061;
                    } else {
                        iM2761 = (C0619.m2761("᩸ۡ") ^ i2) * q.h;
                        i4 = ((iM2761 ^ i3) * 17209) ^ (-1655705590);
                        i5 = 873172415;
                    }
                    break;
                case -2034961846:
                case 1158605138:
                    if (C2485.m8357() <= 0) {
                        iM2761 = C0773.m3169("ܺ᩹") ^ i3;
                        i4 = ((iM2761 ^ i2) * 2559) ^ 448640674;
                        i5 = 1558739816;
                    } else {
                        iM2761 = (C0773.m3169("۬֫") ^ i2) * 99;
                        i4 = ((iM2761 ^ i3) * (-3233)) ^ 1793283645;
                        i5 = 1698006069;
                    }
                    break;
                case -2027609896:
                case -1179317203:
                    if (C1564.f5401 <= 0) {
                        iM2761 = (i2 - C0619.m2761("ۖ᩸")) * (-127);
                        i4 = ((iM2761 ^ i3) * (-23973)) ^ 1044959881;
                        i5 = -1276471925;
                    } else {
                        iM2761 = (C0773.m3169("۬ۗ") + i2) * 31;
                        i4 = ((iM2761 ^ i3) * (-27405)) ^ 1464192965;
                        i5 = 142994686;
                    }
                    break;
                case -1972028313:
                case -225086908:
                    c0168.f1225.m30403(list, list3, list2, list4);
                    iM2761 = (i3 - C0619.m2761("᩷᩺")) * (-7);
                    i4 = ((iM2761 ^ i2) * 32449) ^ 1400976022;
                    i5 = 1912133866;
                    break;
                case -1839599978:
                case -600193088:
                    break;
                case -1823132917:
                case -225218148:
                    if (C11235.f35427 >= 0) {
                        iM2761 = C0773.m3169("ܺ᩹") ^ i3;
                        i4 = ((iM2761 ^ i2) * 2559) ^ 448640674;
                        i5 = 1558739816;
                    } else {
                        iM2761 = C0619.m2761("ᩳᩳ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 12981) ^ 770731788;
                        i5 = -1806765437;
                    }
                    break;
                case -1694668902:
                case 1464351819:
                    C4282.m13644();
                    C2023.m6964();
                    iM2761 = (C0619.m2761("᩸ۡ") ^ i2) * q.h;
                    i4 = ((iM2761 ^ i3) * 17209) ^ (-1655705590);
                    i5 = 873172415;
                    break;
                case -1480992860:
                case -331122306:
                    C3734.m12152();
                    if (C1564.f5401 <= 0) {
                        iM2761 = (C0773.m3169("֡ܰ") ^ i3) * 67;
                        i4 = ((iM2761 ^ i2) * 15239) ^ (-798805371);
                        i5 = -453070038;
                    } else {
                        iM2761 = (C0619.m2761("᩸ۡ") ^ i2) * q.h;
                        i4 = ((iM2761 ^ i3) * 17209) ^ (-1655705590);
                        i5 = 873172415;
                    }
                    break;
                case -1279716241:
                case 477921288:
                    if (C2375.f7641 <= 0) {
                        iM2761 = C0773.m3169("ܺ᩹") ^ i3;
                        i4 = ((iM2761 ^ i2) * 2559) ^ 448640674;
                        i5 = 1558739816;
                    } else {
                        iM2761 = (C0619.m2761("᩶᩺") ^ i3) * 75;
                        i4 = ((iM2761 ^ i2) * (-20407)) ^ 1788706448;
                        i5 = 74299402;
                    }
                    break;
                case -957503214:
                case 947854167:
                    if (c0168.f1228) {
                        iM2761 = C0619.m2761("֫ۤ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 25733) ^ (-1241009503);
                        i5 = -158647967;
                    } else {
                        iM2761 = (i3 - C0619.m2761("᩷᩺")) * (-7);
                        i4 = ((iM2761 ^ i2) * 32449) ^ 1400976022;
                        i5 = 1912133866;
                    }
                    break;
                case -587584682:
                case 506358341:
                    if (RunnableC3055.m9933() != 0) {
                        iM2761 = (C0773.m3169("᩺᩹") ^ i2) * 99;
                        i4 = ((iM2761 ^ i3) * (-2293)) ^ 1262872232;
                        i5 = 818274061;
                    } else {
                        iM2761 = C0773.m3169("ܽܶ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-12731)) ^ (-2051654118);
                        i5 = 1506444780;
                    }
                    break;
                case -218548545:
                case 1190983633:
                    if (C1826.m6301() >= 0) {
                        iM2761 = C0773.m3169("ܺ᩹") ^ i3;
                        i4 = ((iM2761 ^ i2) * 2559) ^ 448640674;
                        i5 = 1558739816;
                    } else {
                        iM2761 = (C0773.m3169("᩺᩹") ^ i2) * 99;
                        i4 = ((iM2761 ^ i3) * (-2293)) ^ 1262872232;
                        i5 = 818274061;
                    }
                    break;
                case -169273168:
                case 2002675015:
                    if (C4238.f15451 >= 0) {
                        iM2761 = (C0773.m3169("֡ܰ") ^ i3) * 67;
                        i4 = ((iM2761 ^ i2) * 15239) ^ (-798805371);
                        i5 = -453070038;
                    } else {
                        iM2761 = (C0619.m2761("۬ܶ") ^ i3) * (-11);
                        i4 = ((iM2761 ^ i2) * 26325) ^ 2068337819;
                        i5 = 1434756916;
                    }
                    break;
                case 313674340:
                case 729293774:
                    if (AbstractC3624.f12429 <= 0) {
                        iM2761 = (C0773.m3169("֡ܰ") ^ i3) * 67;
                        i4 = ((iM2761 ^ i2) * 15239) ^ (-798805371);
                        i5 = -453070038;
                    } else {
                        iM2761 = C0773.m3169("ۡ᩺") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-29865)) ^ 1289196355;
                        i5 = 1724609451;
                    }
                    break;
                case 484046511:
                case 1261645020:
                    if (C2485.f7950 != 0) {
                        iM2761 = (C0773.m3169("֡ܰ") ^ i3) * 67;
                        i4 = ((iM2761 ^ i2) * 15239) ^ (-798805371);
                        i5 = -453070038;
                    } else {
                        iM2761 = (C0773.m3169("ۜ᩷") ^ i2) * 25;
                        i4 = ((iM2761 ^ i3) * 17937) ^ 857366746;
                        i5 = 1952290859;
                    }
                    break;
                case 806748493:
                case 1560710463:
                    if (C3492.f12043 <= 0) {
                        iM2761 = (i2 - C0619.m2761("ۖ᩸")) * (-127);
                        i4 = ((iM2761 ^ i3) * (-23973)) ^ 1044959881;
                        i5 = -1276471925;
                    } else {
                        iM2761 = (C0619.m2761("ᩴ᩷") ^ i2) * (-25);
                        i4 = ((iM2761 ^ i3) * (-655)) ^ 578909123;
                        i5 = 1609881547;
                    }
                    break;
                case 1077905422:
                case 2106452867:
                    if (C2023.f6737) {
                        iM2761 = (C0773.m3169("᩺᩹") ^ i2) * 99;
                        i4 = ((iM2761 ^ i3) * (-2293)) ^ 1262872232;
                        i5 = 818274061;
                    } else {
                        iM2761 = (C0619.m2761("ܿ᩸") ^ i2) * 79;
                        i4 = ((iM2761 ^ i3) * (-17065)) ^ (-804548321);
                        i5 = 1533699758;
                    }
                    break;
                default:
                    C17202.m40372();
                    C1564.m5509();
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0168() {
        boolean z = false;
        int i = -1289654942;
        int i2 = C1564.f5401;
        int i3 = C2288.f7433;
        short s = f1206[0];
        int i4 = s + 1;
        super(C0619.m2761(C2023.m6966(f1206, 1, 3, (i4 * i4) - ((s * 2) + 1) >= 0 ? 41777 : 36770)) ^ 2120948449);
        int iM3169 = (C0773.m3169("ۚۨ") ^ i3) * q.h;
        int i5 = ((iM3169 ^ i2) * 7045) ^ 1531379491;
        int i6 = 2011376247;
        while (true) {
            i = ((((i ^ i2) * 7535) >> 31) & i5) ^ (iM3169 ^ i6);
            switch (i) {
                case -1989829155:
                case -273300362:
                    C0950.m3785();
                    iM3169 = (i3 - C0773.m3169("ۘ֨")) * 85;
                    i5 = ((iM3169 ^ i2) * 18253) ^ (-69819282);
                    i6 = 843159565;
                    break;
                case -1885520572:
                case 1882061801:
                    C2310.m7813();
                    if (C2288.f7433 <= 0) {
                        iM3169 = (C0619.m2761("ᩳ᩷") + i3) * 7;
                        i5 = ((iM3169 ^ i2) * (-16015)) ^ (-393456177);
                        i6 = -667557818;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ۘ֨")) * 85;
                        i5 = ((iM3169 ^ i2) * 18253) ^ (-69819282);
                        i6 = 843159565;
                    }
                    break;
                case -1765857316:
                case 1941377736:
                    C3690.m11987();
                    throw new RuntimeException();
                case -1081994116:
                case -311470174:
                    if (C2354.m7983()) {
                        iM3169 = (i3 - C0619.m2761("ۧ֨")) * (-75);
                        i5 = ((iM3169 ^ i2) * 10147) ^ (-1377243315);
                        i6 = 890501609;
                    } else {
                        iM3169 = C0773.m3169("۠᩵") ^ i2;
                        i5 = ((iM3169 ^ i3) * (-28205)) ^ (-1957395766);
                        i6 = -1792882096;
                    }
                    break;
                case -1007245878:
                case 1289217485:
                    if (C3998.m12920()) {
                        iM3169 = (C0773.m3169("֫ۗ") + i2) * 55;
                        i5 = ((iM3169 ^ i3) * (-213)) ^ 1024338354;
                        i6 = 1553296544;
                    } else {
                        iM3169 = (C0619.m2761("ᩳ᩷") + i3) * 7;
                        i5 = ((iM3169 ^ i2) * (-16015)) ^ (-393456177);
                        i6 = -667557818;
                    }
                    break;
                case -885060162:
                case -861657169:
                    if (C0950.f3488 >= 0) {
                        iM3169 = (C0773.m3169("ۜ֨") ^ i3) * 99;
                        i5 = ((iM3169 ^ i2) * (-16825)) ^ (-2019513779);
                        i6 = -1987387177;
                    } else {
                        iM3169 = C0773.m3169("ۙ֫") ^ i2;
                        i5 = ((iM3169 ^ i3) * (-5971)) ^ 1361618267;
                        i6 = -1868096897;
                    }
                    break;
                case -365944258:
                case -111943031:
                    if (C3998.f13671 != 0) {
                        iM3169 = (i3 - C0773.m3169("ۘ֨")) * 85;
                        i5 = ((iM3169 ^ i2) * 18253) ^ (-69819282);
                        i6 = 843159565;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ۡۜ")) * (-121);
                        i5 = ((iM3169 ^ i2) * (-15789)) ^ (-1810920726);
                        i6 = -991081356;
                    }
                    break;
                case -147941450:
                case 1021127805:
                    setHasOptionsMenu(z);
                    return;
                case 121452037:
                case 690824757:
                    if (C3033.f9831 >= 0) {
                        iM3169 = (C0773.m3169("ۜ֨") ^ i3) * 99;
                        i5 = ((iM3169 ^ i2) * (-16825)) ^ (-2019513779);
                        i6 = -1987387177;
                    } else {
                        iM3169 = (C0773.m3169("ۖ֫") + i2) * (-5);
                        i5 = ((iM3169 ^ i3) * 4137) ^ (-1642601402);
                        i6 = -1478919195;
                    }
                    break;
                case 173922601:
                case 204481799:
                    if (C0487.f2131 <= 0) {
                        iM3169 = (C0773.m3169("ۜ֨") ^ i3) * 99;
                        i5 = ((iM3169 ^ i2) * (-16825)) ^ (-2019513779);
                        i6 = -1987387177;
                    } else {
                        iM3169 = C0619.m2761("ܶ᩷") ^ i3;
                        i5 = ((iM3169 ^ i2) * 18751) ^ 1366364096;
                        i6 = -1452420894;
                    }
                    break;
                case 443836031:
                case 1601944336:
                    if (C2354.f7599 >= 0) {
                        iM3169 = (C0619.m2761("ᩳ᩷") + i3) * 7;
                        i5 = ((iM3169 ^ i2) * (-16015)) ^ (-393456177);
                        i6 = -667557818;
                    } else {
                        iM3169 = C0773.m3169("۫ܿ") ^ i3;
                        i5 = ((iM3169 ^ i2) * (-24887)) ^ 1902855597;
                        i6 = 780476196;
                    }
                    break;
                case 936851426:
                case 1784860503:
                    if (C3077.f9998) {
                        iM3169 = (i3 - C0619.m2761("ܽۜ")) * (-43);
                        i5 = ((iM3169 ^ i2) * (-15797)) ^ 1910097129;
                        i6 = -1009242486;
                    } else {
                        iM3169 = C0773.m3169("ۡ֡") ^ i2;
                        i5 = ((iM3169 ^ i3) * 16085) ^ (-445751458);
                        i6 = 913874908;
                    }
                    break;
                case 956493271:
                case 1132339642:
                    if (C3099.m10095()) {
                        iM3169 = (i3 - C0773.m3169("ۘ֨")) * 85;
                        i5 = ((iM3169 ^ i2) * 18253) ^ (-69819282);
                        i6 = 843159565;
                    } else {
                        iM3169 = (C0619.m2761("֨ۤ") ^ i2) * 63;
                        i5 = ((iM3169 ^ i3) * 97) ^ (-1885795495);
                        i6 = 485080019;
                    }
                    break;
                case 1241621882:
                case 1751373825:
                    C13473.m33144();
                    if (C2419.m8174() < 0) {
                        iM3169 = C0773.m3169("ۡ֡") ^ i2;
                        i5 = ((iM3169 ^ i3) * 16085) ^ (-445751458);
                        i6 = 913874908;
                    } else {
                        iM3169 = C0773.m3169("۠᩵") ^ i2;
                        i5 = ((iM3169 ^ i3) * (-28205)) ^ (-1957395766);
                        i6 = -1792882096;
                    }
                    break;
                case 1334722263:
                case 1969635120:
                    z = true;
                    if (AbstractC3624.f12429 <= 0) {
                        iM3169 = (C0773.m3169("ۜ֨") ^ i3) * 99;
                        i5 = ((iM3169 ^ i2) * (-16825)) ^ (-2019513779);
                        i6 = -1987387177;
                    } else {
                        iM3169 = (i2 - C0773.m3169("ۡܰ")) * (-39);
                        i5 = ((iM3169 ^ i3) * (-29443)) ^ 1695759994;
                        i6 = 1217025243;
                    }
                    break;
                default:
                    C1519.m5403();
                    if (C0269.f1558 <= 0) {
                        iM3169 = C0773.m3169("۠᩵") ^ i2;
                        i5 = ((iM3169 ^ i3) * (-28205)) ^ (-1957395766);
                        i6 = -1792882096;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ۘ֨")) * 85;
                        i5 = ((iM3169 ^ i2) * 18253) ^ (-69819282);
                        i6 = 843159565;
                    }
                    break;
            }
        }
    }

    @Override // l.AbstractC9051
    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String mo1445() {
        return mo1440();
    }

    @Override // l.InterfaceC10586
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo1439(C20283 c20283) {
        String strM1441 = null;
        int i = -1331325482;
        int i2 = C3779.f12953;
        int i3 = AbstractC0641.f2496;
        int iM3169 = C0773.m3169("ۢۙ") ^ i3;
        int i4 = ((iM3169 ^ i2) * (-1235)) ^ (-39294865);
        int i5 = -2005853465;
        while (true) {
            i = ((((i ^ i2) * 28161) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2092253606:
                case 1171610226:
                    if (RunnableC3646.f12471) {
                        iM3169 = C0773.m3169("ۧ᩸") ^ i3;
                        i4 = ((iM3169 ^ i2) * 10073) ^ 696502559;
                        i5 = -1250499550;
                    } else {
                        iM3169 = C0619.m2761("᩻᩺") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-22551)) ^ 779415428;
                        i5 = -1340491996;
                    }
                    break;
                case -1673927341:
                case 1067680161:
                    C2966.m9664();
                    if (!C17202.f56030) {
                        iM3169 = C0773.m3169("۟֨") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-18871)) ^ 1712299888;
                        i5 = 1490978230;
                    } else {
                        iM3169 = C0619.m2761("᩺᩷") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-3275)) ^ (-731927257);
                        i5 = -1166091845;
                    }
                    break;
                case -1375346668:
                case -801930137:
                    if (C2287.f7432 >= 0) {
                        iM3169 = C0773.m3169("ۧ᩸") ^ i3;
                        i4 = ((iM3169 ^ i2) * 10073) ^ 696502559;
                        i5 = -1250499550;
                    } else {
                        iM3169 = C0619.m2761("ܰ֫") ^ i2;
                        i4 = ((iM3169 ^ i3) * 2765) ^ 251589339;
                        i5 = 1817044799;
                    }
                    break;
                case -1287068822:
                case 1995553722:
                    return !c20283.m46617(strM1441);
                case -1216454506:
                case 1675607325:
                    if (C4238.f15451 >= 0) {
                        iM3169 = C0619.m2761("᩺᩷") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-3275)) ^ (-731927257);
                        i5 = -1166091845;
                    } else {
                        iM3169 = (C0619.m2761("ۖ᩷") ^ i2) * 55;
                        i4 = ((iM3169 ^ i3) * (-15715)) ^ (-1891042697);
                        i5 = 22705393;
                    }
                    break;
                case -948983065:
                case -763145087:
                    if (C2287.f7432 >= 0) {
                        iM3169 = C0773.m3169("ۧ᩸") ^ i3;
                        i4 = ((iM3169 ^ i2) * 10073) ^ 696502559;
                        i5 = -1250499550;
                    } else {
                        iM3169 = C0773.m3169("᩷ᩴ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-18567)) ^ 430145882;
                        i5 = -385259982;
                    }
                    break;
                case -914703441:
                case 287937255:
                    if (C2966.f9654 >= 0) {
                        iM3169 = C0773.m3169("۟֨") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-18871)) ^ 1712299888;
                        i5 = 1490978230;
                    } else {
                        iM3169 = (i2 - C0773.m3169("۫ۙ")) * (-79);
                        i4 = ((iM3169 ^ i3) * (-12729)) ^ 2018776504;
                        i5 = 1868378012;
                    }
                    break;
                case -868548358:
                case 44323618:
                    if (C2375.f7641 <= 0) {
                        iM3169 = C0773.m3169("ۧ᩸") ^ i3;
                        i4 = ((iM3169 ^ i2) * 10073) ^ 696502559;
                        i5 = -1250499550;
                    } else {
                        iM3169 = C0773.m3169("᩹ۧ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 1853) ^ (-1208347287);
                        i5 = -971497056;
                    }
                    break;
                case -292219072:
                case 406396960:
                    strM1441 = m1441();
                    if (C2419.f7754 >= 0) {
                        iM3169 = C0619.m2761("ۗۚ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 9273) ^ 1244054358;
                        i5 = -305936282;
                    } else {
                        iM3169 = (C0773.m3169("ܽۙ") + i3) * (-65);
                        i4 = ((iM3169 ^ i2) * 5159) ^ (-1999111700);
                        i5 = -914649880;
                    }
                    break;
                case -276610280:
                case 1256891603:
                    if (C1519.f5300 >= 0) {
                        iM3169 = C0619.m2761("ۤܳ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-20217)) ^ (-923538816);
                        i5 = 1711203193;
                    } else {
                        iM3169 = C0773.m3169("᩹ܳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 25627) ^ 1877847129;
                        i5 = 617827900;
                    }
                    break;
                case 733841229:
                case 1281779328:
                    AbstractC0641.m2813();
                    iM3169 = C0619.m2761("᩺᩷") ^ i3;
                    i4 = ((iM3169 ^ i2) * (-3275)) ^ (-731927257);
                    i5 = -1166091845;
                    break;
                case 816317300:
                case 913966046:
                    C2966.m9664();
                    C3734.m12152();
                    return false;
                case 986672521:
                case 1108305694:
                    if (C0619.f2439) {
                        iM3169 = C0619.m2761("᩺᩷") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-3275)) ^ (-731927257);
                        i5 = -1166091845;
                    } else {
                        iM3169 = C0619.m2761("ۘܿ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-23129)) ^ (-944745699);
                        i5 = 1135605050;
                    }
                    break;
                case 1159589108:
                case 1674119674:
                    if (C2966.f9654 >= 0) {
                        iM3169 = C0773.m3169("۟֨") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-18871)) ^ 1712299888;
                        i5 = 1490978230;
                    } else {
                        iM3169 = C0619.m2761("ܿ֡") ^ i2;
                        i4 = ((iM3169 ^ i3) * 28619) ^ (-431215580);
                        i5 = -285796973;
                    }
                    break;
                case 1597405772:
                case 1900414505:
                    if (C2354.f7599 < 0) {
                        iM3169 = C0619.m2761("ۤܳ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-20217)) ^ (-923538816);
                        i5 = 1711203193;
                    } else {
                        iM3169 = C0619.m2761("᩺᩷") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-3275)) ^ (-731927257);
                        i5 = -1166091845;
                    }
                    break;
                default:
                    if (!C3077.f9998) {
                        iM3169 = C0773.m3169("ۧ᩸") ^ i3;
                        i4 = ((iM3169 ^ i2) * 10073) ^ 696502559;
                        i5 = -1250499550;
                    } else {
                        iM3169 = C0619.m2761("ۤܳ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-20217)) ^ (-923538816);
                        i5 = 1711203193;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m1410(C0168 c0168, C20283 c20283) {
        int i = -513853909;
        int i2 = C3492.f12043;
        int i3 = C1080.f3865;
        int iM2761 = (C0619.m2761("᩷᩹") ^ i2) * 55;
        int i4 = ((iM2761 ^ i3) * 17619) ^ (-469363434);
        int i5 = 804211500;
        while (true) {
            i = ((((i ^ i3) * 32599) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2092167998:
                case 512078088:
                    C2023.m6964();
                    if (C2485.f7950 != 0) {
                        iM2761 = (C0619.m2761("ۘ᩹") ^ i2) * 47;
                        i4 = ((iM2761 ^ i3) * 24929) ^ 1020973416;
                        i5 = -550929476;
                    } else {
                        iM2761 = (C0619.m2761("᩻᩺") + i3) * (-61);
                        i4 = ((iM2761 ^ i2) * 19731) ^ 2049942416;
                        i5 = 2073901196;
                    }
                    break;
                case -2065634756:
                case 1964407460:
                    C3448.m11248();
                    iM2761 = (C0619.m2761("᩻᩺") + i3) * (-61);
                    i4 = ((iM2761 ^ i2) * 19731) ^ 2049942416;
                    i5 = 2073901196;
                    break;
                case -1987418610:
                case -1119169041:
                    if (C4238.m13540() <= 0) {
                        iM2761 = (C0619.m2761("ۘ᩹") ^ i2) * 47;
                        i4 = ((iM2761 ^ i3) * 24929) ^ 1020973416;
                        i5 = -550929476;
                    } else {
                        iM2761 = (i2 - C0773.m3169("᩵ۙ")) * 61;
                        i4 = ((iM2761 ^ i3) * (-20753)) ^ 188166398;
                        i5 = -1348144516;
                    }
                    break;
                case -1985388195:
                case -1428761405:
                    if (C1826.f6190 <= 0) {
                        iM2761 = (C0619.m2761("ۘ᩹") ^ i2) * 47;
                        i4 = ((iM2761 ^ i3) * 24929) ^ 1020973416;
                        i5 = -550929476;
                    } else {
                        iM2761 = C0773.m3169("ܶ᩻") ^ i3;
                        i4 = ((iM2761 ^ i2) * 11367) ^ (-1238729360);
                        i5 = -157980129;
                    }
                    break;
                case -1587783814:
                case 1631784222:
                    C2834.m9339(new C14337(c0168));
                    break;
                case -1130997278:
                case 1992487259:
                    if (C1080.f3865 >= 0) {
                        iM2761 = (C0619.m2761("ۘ᩹") ^ i2) * 47;
                        i4 = ((iM2761 ^ i3) * 24929) ^ 1020973416;
                        i5 = -550929476;
                    } else {
                        iM2761 = C0773.m3169("֡᩸") ^ i3;
                        i4 = ((iM2761 ^ i2) * 21303) ^ 1441467503;
                        i5 = 936607890;
                    }
                    break;
                case -976810803:
                case -707593034:
                    c0168.f1211 = true;
                    break;
                case -867280487:
                case 709687645:
                    C3077.m10041();
                    C23916.m53419();
                    break;
                case -822847193:
                case 212512613:
                    if (C3492.f12043 <= 0) {
                        iM2761 = C0619.m2761("ۤۡ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 5691) ^ 115913470;
                        i5 = -1866838922;
                    } else {
                        iM2761 = (C0773.m3169("ۡᩳ") + i3) * (-109);
                        i4 = ((iM2761 ^ i2) * (-18015)) ^ 208515481;
                        i5 = 1070605485;
                    }
                    break;
                case -638890463:
                case 2104826821:
                    if (C1146.f4234 >= 0) {
                        iM2761 = C0619.m2761("ۤۡ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 5691) ^ 115913470;
                        i5 = -1866838922;
                    } else {
                        iM2761 = (C0619.m2761("ۘ᩹") ^ i2) * 47;
                        i4 = ((iM2761 ^ i3) * 24929) ^ 1020973416;
                        i5 = -550929476;
                    }
                    break;
                case -573194328:
                case 1983108870:
                    if (AbstractC0116.f1064 <= 0) {
                        iM2761 = C0773.m3169("ᩴܳ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 437) ^ (-1592824515);
                        i5 = -842578588;
                    } else {
                        iM2761 = (C0619.m2761("ᩴ᩹") ^ i3) * (-21);
                        i4 = ((iM2761 ^ i2) * (-5127)) ^ (-2093521617);
                        i5 = 1987448404;
                    }
                    break;
                case -567090542:
                case 464983961:
                    if (C23916.f77426 > 0) {
                        iM2761 = (i3 - C0619.m2761("᩹ܺ")) * (-47);
                        i4 = ((iM2761 ^ i2) * (-51)) ^ 1193566722;
                        i5 = 1629833110;
                    } else {
                        iM2761 = (C0619.m2761("ۘ᩹") ^ i2) * 47;
                        i4 = ((iM2761 ^ i3) * 24929) ^ 1020973416;
                        i5 = -550929476;
                    }
                    break;
                case -526049400:
                case 1715432465:
                    if (C2834.f9334 <= 0) {
                        iM2761 = C0619.m2761("ۤۡ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 5691) ^ 115913470;
                        i5 = -1866838922;
                    } else {
                        iM2761 = (C0773.m3169("۫֨") + i2) * (-97);
                        i4 = ((iM2761 ^ i3) * (-11665)) ^ (-1367562772);
                        i5 = -1580242435;
                    }
                    break;
                case -400917872:
                case -172763134:
                    c0168.f1224 = c20283;
                    if (c0168.f1228) {
                        iM2761 = (i2 - C0619.m2761("᩺ۧ")) * 101;
                        i4 = ((iM2761 ^ i3) * 30769) ^ (-2110755904);
                        i5 = -1102684910;
                    } else {
                        iM2761 = C0773.m3169("۬᩻") ^ i3;
                        i4 = ((iM2761 ^ i2) * 16795) ^ 508523169;
                        i5 = 513911594;
                    }
                    break;
                case -323674483:
                case 2122706712:
                    if (C3448.f11240 >= 0) {
                        iM2761 = C0773.m3169("ᩴܳ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 437) ^ (-1592824515);
                        i5 = -842578588;
                    } else {
                        iM2761 = (C0773.m3169("ۡܽ") + i2) * 69;
                        i4 = ((iM2761 ^ i3) * 4089) ^ 1578409851;
                        i5 = -1811908709;
                    }
                    break;
                case -294910584:
                case 1710529707:
                    if (C3033.m9845() <= 0) {
                        iM2761 = (C0619.m2761("ۘ᩹") ^ i2) * 47;
                        i4 = ((iM2761 ^ i3) * 24929) ^ 1020973416;
                        i5 = -550929476;
                    } else {
                        iM2761 = (C0773.m3169("ᩳ᩺") ^ i3) * 119;
                        i4 = ((iM2761 ^ i2) * 31685) ^ (-374548847);
                        i5 = 1186250646;
                    }
                    break;
                case 1843175716:
                case 1868216717:
                    if (C3492.f12043 <= 0) {
                        iM2761 = (C0619.m2761("ۘ᩹") ^ i2) * 47;
                        i4 = ((iM2761 ^ i3) * 24929) ^ 1020973416;
                        i5 = -550929476;
                    } else {
                        iM2761 = (i2 - C0619.m2761("۟ܰ")) * 43;
                        i4 = ((iM2761 ^ i3) * 27) ^ 899348366;
                        i5 = -2020415968;
                    }
                    break;
                default:
                    if (C0619.f2439) {
                        iM2761 = (i3 - C0619.m2761("᩹ܺ")) * (-47);
                        i4 = ((iM2761 ^ i2) * (-51)) ^ 1193566722;
                        i5 = 1629833110;
                    } else {
                        iM2761 = C0619.m2761("ۜ᩻") ^ i2;
                        i4 = ((iM2761 ^ i3) * 29275) ^ (-263569367);
                        i5 = -40208802;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0073  */
    /* JADX WARN: Code duplicated, block: B:62:0x0212 A[PHI: r7 r8 r16
      0x0212: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int) binds: [B:61:0x0210, B:49:0x01ae, B:11:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x0212: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int) binds: [B:61:0x0210, B:49:0x01ae, B:11:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x0212: PHI (r16v22 int) = (r16v5 int), (r16v8 int), (r16v23 int) binds: [B:61:0x0210, B:49:0x01ae, B:11:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x0261 A[PHI: r4 r5 r6 r9 r12 r16
      0x0261: PHI (r4v4 char) = (r4v2 char), (r4v3 char), (r4v2 char), (r4v2 char), (r4v2 char) binds: [B:69:0x025f, B:57:0x01f2, B:53:0x01d1, B:33:0x00fa, B:6:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x0261: PHI (r5v4 short) = (r5v2 short), (r5v2 short), (r5v3 short), (r5v2 short), (r5v2 short) binds: [B:69:0x025f, B:57:0x01f2, B:53:0x01d1, B:33:0x00fa, B:6:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x0261: PHI (r6v4 short) = (r6v2 short), (r6v2 short), (r6v3 short), (r6v2 short), (r6v2 short) binds: [B:69:0x025f, B:57:0x01f2, B:53:0x01d1, B:33:0x00fa, B:6:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x0261: PHI (r9v3 int) = (r9v2 int), (r9v2 int), (r9v2 int), (r9v2 int), (r9v5 int) binds: [B:69:0x025f, B:57:0x01f2, B:53:0x01d1, B:33:0x00fa, B:6:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x0261: PHI (r12v4 int) = (r12v2 int), (r12v2 int), (r12v2 int), (r12v3 int), (r12v2 int) binds: [B:69:0x025f, B:57:0x01f2, B:53:0x01d1, B:33:0x00fa, B:6:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x0261: PHI (r16v24 int) = (r16v3 int), (r16v6 int), (r16v7 int), (r16v14 int), (r16v27 int) binds: [B:69:0x025f, B:57:0x01f2, B:53:0x01d1, B:33:0x00fa, B:6:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x0293 A[PHI: r1 r3 r11 r16
      0x0293: PHI (r1v4 android.os.Bundle) = (r1v2 android.os.Bundle), (r1v2 android.os.Bundle), (r1v3 android.os.Bundle), (r1v2 android.os.Bundle) binds: [B:73:0x0291, B:65:0x0242, B:37:0x011d, B:15:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x0293: PHI (r3v4 short[]) = (r3v3 short[]), (r3v2 short[]), (r3v2 short[]), (r3v2 short[]) binds: [B:73:0x0291, B:65:0x0242, B:37:0x011d, B:15:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x0293: PHI (r11v4 short[]) = (r11v2 short[]), (r11v2 short[]), (r11v3 short[]), (r11v2 short[]) binds: [B:73:0x0291, B:65:0x0242, B:37:0x011d, B:15:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x0293: PHI (r16v19 int) = (r16v2 int), (r16v4 int), (r16v13 int), (r16v20 int) binds: [B:73:0x0291, B:65:0x0242, B:37:0x011d, B:15:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final ArrayList m1449() {
        int iM3169;
        int i;
        int i2;
        int i3 = C20932.f66974;
        int i4 = C2834.f9334;
        int iM31610 = C0773.m3169("ܺ᩻") ^ i4;
        int i5 = ((iM31610 ^ i3) * (-4603)) ^ (-553434493);
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM31610 ^ (-130716728);
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 275785068;
        ArrayList<String> stringArrayList = null;
        Bundle bundleRequireArguments = null;
        while (true) {
            int i13 = i6 ^ (i5 & (((i12 ^ i3) * 19237) >> 31));
            switch (i13) {
                case -2114260612:
                case -379429419:
                    if (C1321.m4852()) {
                        iM3169 = (C0773.m3169("ܶۚ") ^ i4) * (-63);
                        i13 = i13;
                        i = ((iM3169 ^ i3) * 22305) ^ 973765278;
                        i2 = -637952837;
                    } else {
                        i13 = i13;
                        iM3169 = (C0619.m2761("ۢܰ") + i3) * 35;
                        i = ((iM3169 ^ i4) * 12673) ^ (-45339429);
                        i2 = 887707807;
                    }
                    int i14 = i13;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i12 = i14;
                    break;
                case -2064267838:
                case 1568104280:
                    return new ArrayList();
                case -1525810673:
                case -7955520:
                    C20932.m47848();
                    iM3169 = (C0773.m3169("ۚ۠") ^ i3) * (-11);
                    i = ((iM3169 ^ i4) * 31347) ^ (-1479394712);
                    i2 = 191799713;
                    int i15 = i13;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i12 = i15;
                    break;
                case -1518536291:
                case -157532520:
                    i13 = i13;
                    stringArrayList = bundleRequireArguments.getStringArrayList(C3492.m11486(sArr2, i11, 20, i10));
                    if (stringArrayList == null) {
                        iM3169 = C0619.m2761("֡ܰ") ^ i4;
                        i = ((iM3169 ^ i3) * 30263) ^ (-1545342164);
                        i2 = -876821059;
                    } else {
                        iM3169 = C0619.m2761("ܽܰ") ^ i3;
                        i = ((iM3169 ^ i4) * (-18229)) ^ (-612816448);
                        i2 = -839739776;
                    }
                    int i16 = i13;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i12 = i16;
                    break;
                case -1417423231:
                case 34909455:
                    i10 = 34725;
                    iM3169 = C0773.m3169("᩻ܳ") ^ i4;
                    i = ((iM3169 ^ i3) * (-23231)) ^ 1736548211;
                    i2 = -1790335407;
                    int i17 = i13;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i12 = i17;
                    break;
                case -1335720601:
                case -637325415:
                    i13 = i13;
                    bundleRequireArguments = requireArguments();
                    sArr2 = f1206;
                    if (C3779.f12953 <= 0) {
                        iM3169 = C0773.m3169("᩺ۤ") ^ i3;
                        i = ((iM3169 ^ i4) * 20767) ^ 586984234;
                        i2 = 565183696;
                    } else {
                        iM3169 = C0773.m3169("۫۟") ^ i3;
                        i = ((iM3169 ^ i4) * (-3777)) ^ (-1701850440);
                        i2 = 1671785693;
                    }
                    int i18 = i13;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i12 = i18;
                    break;
                case -1216600935:
                case -260974274:
                    i13 = i13;
                    sArr = f1206;
                    if (C0619.f2439) {
                        iM3169 = C0773.m3169("᩺ۤ") ^ i3;
                        i = ((iM3169 ^ i4) * 20767) ^ 586984234;
                        i2 = 565183696;
                    } else {
                        iM3169 = (C0773.m3169("ۖ᩸") ^ i3) * (-23);
                        i = ((iM3169 ^ i4) * 31893) ^ 1698298068;
                        i2 = 401351462;
                    }
                    int i19 = i13;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i12 = i19;
                    break;
                case -1127521966:
                case -712551939:
                    i13 = i13;
                    i7 = s * s2;
                    i8 = s * s;
                    if (C0862.f3233 != 0) {
                        iM3169 = (C0619.m2761("ۢܰ") + i3) * 35;
                        i = ((iM3169 ^ i4) * 12673) ^ (-45339429);
                        i2 = 887707807;
                    } else {
                        iM3169 = (C0773.m3169("᩹ۜ") ^ i3) * 27;
                        i = ((iM3169 ^ i4) * 4071) ^ (-343691725);
                        i2 = -1177144753;
                    }
                    int i110 = i13;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i12 = i110;
                    break;
                case -1064438719:
                case 1205510034:
                    i10 = 32914;
                    iM3169 = C0773.m3169("᩻ܳ") ^ i4;
                    i = ((iM3169 ^ i3) * (-23231)) ^ 1736548211;
                    i2 = -1790335407;
                    int i111 = i13;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i12 = i111;
                    break;
                case -985893055:
                case -460882665:
                    i13 = i13;
                    c = 424;
                    if (C3779.f12953 <= 0) {
                        iM3169 = (C0773.m3169("ۤ֡") + i4) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i = ((iM3169 ^ i3) * 5191) ^ (-274361723);
                        i2 = -1125205107;
                    } else {
                        iM3169 = (C0773.m3169("᩹۫") ^ i4) * (-123);
                        i = ((iM3169 ^ i3) * (-18569)) ^ 182031688;
                        i2 = -1067249927;
                    }
                    int i112 = i13;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i12 = i112;
                    break;
                case -923917728:
                case 1967553291:
                    i13 = i13;
                    if (C3077.f9998) {
                        iM3169 = C0773.m3169("۬ۜ") ^ i3;
                        i = ((iM3169 ^ i4) * (-28283)) ^ (-330882449);
                        i2 = -833918750;
                    } else {
                        iM3169 = (C0619.m2761("ۢܰ") + i3) * 35;
                        i = ((iM3169 ^ i4) * 12673) ^ (-45339429);
                        i2 = 887707807;
                    }
                    int i113 = i13;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i12 = i113;
                    break;
                case -900213796:
                case -21406895:
                    i13 = i13;
                    if ((i8 + i9) - i7 < 0) {
                        iM3169 = C0619.m2761("ۜܳ") ^ i3;
                        i = ((iM3169 ^ i4) * 7173) ^ 512037721;
                        i2 = -364779757;
                    } else {
                        iM3169 = (C0619.m2761("ܳܺ") + i4) * 109;
                        i = ((iM3169 ^ i3) * 25049) ^ 2052780336;
                        i2 = 1766282730;
                    }
                    int i114 = i13;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i12 = i114;
                    break;
                case -785540268:
                case -415319658:
                    return new ArrayList(stringArrayList);
                case -298181836:
                case 192935935:
                    RunnableC3055.m9933();
                    if (RunnableC1848.m6360()) {
                        iM3169 = (C0773.m3169("ۚ۠") ^ i3) * (-11);
                        i = ((iM3169 ^ i4) * 31347) ^ (-1479394712);
                        i2 = 191799713;
                    } else {
                        iM3169 = (C0773.m3169("ܶۚ") ^ i4) * (-63);
                        i13 = i13;
                        i = ((iM3169 ^ i3) * 22305) ^ 973765278;
                        i2 = -637952837;
                    }
                    int i115 = i13;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i12 = i115;
                    break;
                case -285947642:
                case 1239458836:
                    AbstractC3624.m11755();
                    if (C2287.f7432 >= 0) {
                        iM3169 = (C0773.m3169("ܶۚ") ^ i4) * (-63);
                        i13 = i13;
                        i = ((iM3169 ^ i3) * 22305) ^ 973765278;
                        i2 = -637952837;
                    } else {
                        i13 = i13;
                        iM3169 = C0773.m3169("᩺ۤ") ^ i3;
                        i = ((iM3169 ^ i4) * 20767) ^ 586984234;
                        i2 = 565183696;
                    }
                    int i116 = i13;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i12 = i116;
                    break;
                case -194708853:
                case 1231649036:
                    i13 = i13;
                    i11 = 425;
                    if (AbstractC0641.f2496 >= 0) {
                        iM3169 = (C0773.m3169("ۤ֡") + i4) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i = ((iM3169 ^ i3) * 5191) ^ (-274361723);
                        i2 = -1125205107;
                    } else {
                        iM3169 = C0619.m2761("ۢ᩺") ^ i4;
                        i = ((iM3169 ^ i3) * (-11313)) ^ (-807505914);
                        i2 = -1177197424;
                    }
                    int i117 = i13;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i12 = i117;
                    break;
                case 439119659:
                case 576030526:
                    C13473.m33144();
                    C0619.m2763();
                    return null;
                case 586549369:
                case 1703789306:
                    i13 = i13;
                    if (C2375.f7641 <= 0) {
                        iM3169 = C0773.m3169("᩺ۤ") ^ i3;
                        i = ((iM3169 ^ i4) * 20767) ^ 586984234;
                        i2 = 565183696;
                    } else {
                        iM3169 = (C0619.m2761("ۗ֨") ^ i4) * (-43);
                        i = ((iM3169 ^ i3) * (-29457)) ^ (-597466949);
                        i2 = -605245250;
                    }
                    int i118 = i13;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i12 = i118;
                    break;
                case 659466419:
                case 1185302210:
                    i13 = i13;
                    s = sArr[c];
                    s2 = 38714;
                    if (AbstractC0641.f2496 >= 0) {
                        iM3169 = (C0773.m3169("ۤ֡") + i4) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i = ((iM3169 ^ i3) * 5191) ^ (-274361723);
                        i2 = -1125205107;
                    } else {
                        iM3169 = (C0619.m2761("۠ۤ") ^ i3) * (-39);
                        i = ((iM3169 ^ i4) * (-30493)) ^ (-2068148012);
                        i2 = -1351634524;
                    }
                    int i119 = i13;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i12 = i119;
                    break;
                case 809804313:
                case 1976224214:
                    i13 = i13;
                    if (C3033.f9831 >= 0) {
                        iM3169 = (C0773.m3169("ۤ֡") + i4) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i = ((iM3169 ^ i3) * 5191) ^ (-274361723);
                        i2 = -1125205107;
                    } else {
                        iM3169 = C0619.m2761("ᩳۡ") ^ i4;
                        i = ((iM3169 ^ i3) * (-30143)) ^ (-1519552808);
                        i2 = 717704676;
                    }
                    int i1110 = i13;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i12 = i1110;
                    break;
                default:
                    i13 = i13;
                    i9 = 374693449;
                    if (C3492.m11488()) {
                        iM3169 = (C0773.m3169("ܺᩳ") + i4) * 3;
                        i = ((iM3169 ^ i3) * (-12423)) ^ (-1171861789);
                        i2 = 324619146;
                    } else {
                        iM3169 = (C0773.m3169("ۤ֡") + i4) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i = ((iM3169 ^ i3) * 5191) ^ (-274361723);
                        i2 = -1125205107;
                    }
                    int i1111 = i13;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i12 = i1111;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x01cb A[PHI: r9 r13 r14
      0x01cb: PHI (r9v5 java.lang.String) = (r9v2 java.lang.String), (r9v2 java.lang.String), (r9v3 java.lang.String), (r9v2 java.lang.String) binds: [B:117:0x01cb, B:45:0x01c9, B:23:0x00c0, B:8:0x0074] A[DONT_GENERATE, DONT_INLINE]
      0x01cb: PHI (r13v5 short[]) = (r13v2 short[]), (r13v3 short[]), (r13v2 short[]), (r13v2 short[]) binds: [B:117:0x01cb, B:45:0x01c9, B:23:0x00c0, B:8:0x0074] A[DONT_GENERATE, DONT_INLINE]
      0x01cb: PHI (r14v5 int) = (r14v2 int), (r14v3 int), (r14v2 int), (r14v2 int) binds: [B:117:0x01cb, B:45:0x01c9, B:23:0x00c0, B:8:0x0074] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0074, code lost:
    
        if (l.C13473.f42873 != 0) goto L46;
     */
    @Override // l.AbstractC9051
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String mo1440() {
        /*
            Method dump skipped, instruction units count: 1254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C0168.mo1440():java.lang.String");
    }

    /* JADX WARN: Code duplicated, block: B:72:0x02b0 A[PHI: r1 r3 r5 r6 r15
      0x02b0: PHI (r1v73 short) = (r1v16 short), (r1v17 short), (r1v74 short) binds: [B:71:0x02ae, B:63:0x0256, B:9:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x02b0: PHI (r3v7 l.᩷ܿ֫) = (r3v2 l.᩷ܿ֫), (r3v2 l.᩷ܿ֫), (r3v8 l.᩷ܿ֫) binds: [B:71:0x02ae, B:63:0x0256, B:9:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x02b0: PHI (r5v6 int) = (r5v1 int), (r5v1 int), (r5v7 int) binds: [B:71:0x02ae, B:63:0x0256, B:9:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x02b0: PHI (r6v7 long) = (r6v2 long), (r6v2 long), (r6v8 long) binds: [B:71:0x02ae, B:63:0x0256, B:9:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x02b0: PHI (r15v7 int) = (r15v2 int), (r15v2 int), (r15v8 int) binds: [B:71:0x02ae, B:63:0x0256, B:9:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x005a, code lost:
    
        if (l.C1564.f5401 > 0) goto L9;
     */
    @Override // l.ComponentCallbacksC11612
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r26, android.view.ViewGroup r27, android.os.Bundle r28) {
        /*
            Method dump skipped, instruction units count: 894
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C0168.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // l.AbstractC9051
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String mo1443() {
        return C18969.m44060(150, m1441());
    }

    /* JADX WARN: Code duplicated, block: B:59:0x01fa A[PHI: r3 r4 r12 r16
      0x01fa: PHI (r3v5 char) = (r3v3 char), (r3v2 char), (r3v2 char), (r3v2 char), (r3v2 char) binds: [B:58:0x01f8, B:54:0x01da, B:23:0x009e, B:8:0x0053, B:5:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x01fa: PHI (r4v5 short) = (r4v2 short), (r4v3 short), (r4v2 short), (r4v2 short), (r4v2 short) binds: [B:58:0x01f8, B:54:0x01da, B:23:0x009e, B:8:0x0053, B:5:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x01fa: PHI (r12v5 int) = (r12v2 int), (r12v2 int), (r12v3 int), (r12v2 int), (r12v2 int) binds: [B:58:0x01f8, B:54:0x01da, B:23:0x009e, B:8:0x0053, B:5:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x01fa: PHI (r16v25 int) = (r16v4 int), (r16v5 int), (r16v16 int), (r16v21 int), (r16v26 int) binds: [B:58:0x01f8, B:54:0x01da, B:23:0x009e, B:8:0x0053, B:5:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x022e A[PHI: r5 r6 r16
      0x022e: PHI (r5v3 int) = (r5v2 int), (r5v4 int) binds: [B:62:0x022c, B:50:0x01b9] A[DONT_GENERATE, DONT_INLINE]
      0x022e: PHI (r6v3 int) = (r6v2 int), (r6v4 int) binds: [B:62:0x022c, B:50:0x01b9] A[DONT_GENERATE, DONT_INLINE]
      0x022e: PHI (r16v6 int) = (r16v3 int), (r16v7 int) binds: [B:62:0x022c, B:50:0x01b9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x0260 A[PHI: r1 r2 r7 r10 r11 r16
      0x0260: PHI (r1v4 android.os.Bundle) = 
      (r1v2 android.os.Bundle)
      (r1v2 android.os.Bundle)
      (r1v3 android.os.Bundle)
      (r1v2 android.os.Bundle)
      (r1v2 android.os.Bundle)
     binds: [B:66:0x025e, B:46:0x0195, B:31:0x00e4, B:27:0x00bf, B:13:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x0260: PHI (r2v4 short[]) = (r2v3 short[]), (r2v2 short[]), (r2v2 short[]), (r2v2 short[]), (r2v2 short[]) binds: [B:66:0x025e, B:46:0x0195, B:31:0x00e4, B:27:0x00bf, B:13:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x0260: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int), (r7v2 int) binds: [B:66:0x025e, B:46:0x0195, B:31:0x00e4, B:27:0x00bf, B:13:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x0260: PHI (r10v4 short[]) = (r10v2 short[]), (r10v2 short[]), (r10v3 short[]), (r10v2 short[]), (r10v2 short[]) binds: [B:66:0x025e, B:46:0x0195, B:31:0x00e4, B:27:0x00bf, B:13:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x0260: PHI (r11v4 int) = (r11v2 int), (r11v2 int), (r11v2 int), (r11v3 int), (r11v2 int) binds: [B:66:0x025e, B:46:0x0195, B:31:0x00e4, B:27:0x00bf, B:13:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x0260: PHI (r16v18 int) = (r16v2 int), (r16v8 int), (r16v14 int), (r16v15 int), (r16v19 int) binds: [B:66:0x025e, B:46:0x0195, B:31:0x00e4, B:27:0x00bf, B:13:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final String m1441() {
        int iM3169;
        int i;
        int i2;
        int i3 = C1783.f6087;
        int i4 = AbstractC3624.f12429;
        int iM31610 = (C0773.m3169("᩻ܺ") + i3) * 63;
        int i5 = ((iM31610 ^ i4) * (-32573)) ^ (-2090602585);
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM31610 ^ 1478897073;
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
        int i13 = 283274928;
        while (true) {
            int i14 = i6 ^ (i5 & (((i13 ^ i4) * 14411) >> 31));
            switch (i14) {
                case -1919532094:
                case 1653255598:
                    i10 = 50931;
                    iM3169 = C0773.m3169("᩶ܽ") ^ i3;
                    i = ((iM3169 ^ i4) * 4349) ^ 187681885;
                    i2 = 1633002788;
                    int i15 = i14;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i13 = i15;
                    break;
                case -1853638296:
                case 1616296058:
                    String strM28303 = C11235.m28303(bundleRequireArguments, C1542.m5471(sArr2, i11, i12, i10));
                    C1321.m4848(strM28303);
                    return strM28303;
                case -1745414926:
                case 1338986888:
                    i14 = i14;
                    c = 380;
                    if (C1080.f3865 >= 0) {
                        iM3169 = (C0619.m2761("᩷ۛ") + i4) * 69;
                        i = ((iM3169 ^ i3) * 13409) ^ (-89885321);
                        i2 = 704212420;
                    } else {
                        iM3169 = (i4 - C0773.m3169("᩺֨")) * (-29);
                        i = ((iM3169 ^ i3) * 7955) ^ (-1159413747);
                        i2 = -1091753702;
                    }
                    int i16 = i14;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i13 = i16;
                    break;
                case -1698430888:
                case 201426929:
                    i14 = i14;
                    if (C0487.f2131 <= 0) {
                        iM3169 = C0773.m3169("᩻ۘ") ^ i4;
                        i = ((iM3169 ^ i3) * (-17321)) ^ 1717340318;
                        i2 = -1581661688;
                    } else {
                        iM3169 = C0619.m2761("ܳ᩸") ^ i4;
                        i = ((iM3169 ^ i3) * 5209) ^ 2137155915;
                        i2 = 69370855;
                    }
                    int i17 = i14;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i13 = i17;
                    break;
                case -1604689314:
                case 1924629040:
                    i14 = i14;
                    s2 = 16951;
                    if (C0862.f3233 != 0) {
                        iM3169 = C0619.m2761("ۖۛ") ^ i3;
                        i = ((iM3169 ^ i4) * (-12095)) ^ 392552823;
                        i2 = 1059457298;
                    } else {
                        iM3169 = (C0619.m2761("ۛܰ") ^ i3) * (-57);
                        i = ((iM3169 ^ i4) * (-27919)) ^ 1436591594;
                        i2 = -1923263875;
                    }
                    int i18 = i14;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i13 = i18;
                    break;
                case -1509821664:
                case 1991677695:
                    i14 = i14;
                    i7 = s * s;
                    i8 = 287336401;
                    if (C2354.m7983()) {
                        iM3169 = C0619.m2761("۠ܽ") ^ i3;
                        i = ((iM3169 ^ i4) * 28167) ^ (-359901073);
                        i2 = -1628802538;
                    } else {
                        iM3169 = C0773.m3169("᩻ۘ") ^ i4;
                        i = ((iM3169 ^ i3) * (-17321)) ^ 1717340318;
                        i2 = -1581661688;
                    }
                    int i19 = i14;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i13 = i19;
                    break;
                case -1506335260:
                case -1235972533:
                    i10 = 2372;
                    iM3169 = C0773.m3169("᩶ܽ") ^ i3;
                    i = ((iM3169 ^ i4) * 4349) ^ 187681885;
                    i2 = 1633002788;
                    int i110 = i14;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i13 = i110;
                    break;
                case -1319920267:
                case -723597379:
                    i14 = i14;
                    int i20 = i7 + i8;
                    i9 = i20 + i20;
                    if (C13473.f42873 != 0) {
                        iM3169 = C0619.m2761("ܺۖ") ^ i3;
                        i = ((iM3169 ^ i4) * (-20735)) ^ (-1400522699);
                        i2 = 1958008803;
                    } else {
                        iM3169 = C0773.m3169("ۢۚ") ^ i4;
                        i = ((iM3169 ^ i3) * (-7073)) ^ 815059730;
                        i2 = 962229698;
                    }
                    int i111 = i14;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i13 = i111;
                    break;
                case -1230298084:
                case 1048598729:
                    if (C1321.f4751 < 0) {
                        i14 = i14;
                        iM3169 = (C0619.m2761("᩷ۛ") + i4) * 69;
                        i = ((iM3169 ^ i3) * 13409) ^ (-89885321);
                        i2 = 704212420;
                    } else {
                        iM3169 = (C0619.m2761("ۘۡ") ^ i4) * (-113);
                        i14 = i14;
                        i = ((iM3169 ^ i3) * 14829) ^ (-988251794);
                        i2 = 699292931;
                    }
                    int i112 = i14;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i13 = i112;
                    break;
                case -907935931:
                case 1580378882:
                    C3099.m10095();
                    C17202.m40372();
                    return null;
                case -661487218:
                case 343701957:
                    i14 = i14;
                    s = sArr[c];
                    if (C2419.m8174() >= 0) {
                        iM3169 = (C0619.m2761("᩷ۛ") + i4) * 69;
                        i = ((iM3169 ^ i3) * 13409) ^ (-89885321);
                        i2 = 704212420;
                    } else {
                        iM3169 = C0773.m3169("ۙ۟") ^ i3;
                        i = ((iM3169 ^ i4) * (-14493)) ^ (-1799876911);
                        i2 = 1015161903;
                    }
                    int i113 = i14;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i13 = i113;
                    break;
                case -363343233:
                case 351427638:
                    C0269.m1775();
                    if (C1783.f6087 > 0) {
                        i14 = i14;
                        iM3169 = C0619.m2761("ۖۛ") ^ i3;
                        i = ((iM3169 ^ i4) * (-12095)) ^ 392552823;
                        i2 = 1059457298;
                        int i114 = i14;
                        i6 = iM3169 ^ i2;
                        i5 = i;
                        i13 = i114;
                    }
                    i14 = i14;
                    iM3169 = (C0619.m2761("᩷ۛ") + i4) * 69;
                    i = ((iM3169 ^ i3) * 13409) ^ (-89885321);
                    i2 = 704212420;
                    int i115 = i14;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i13 = i115;
                    break;
                case -192730433:
                case 761611239:
                    i14 = i14;
                    i12 = 9;
                    if (C17202.m40372()) {
                        iM3169 = (C0773.m3169("۬ۖ") ^ i3) * 47;
                        i = ((iM3169 ^ i4) * 6799) ^ (-506587296);
                        i2 = -290594;
                    } else {
                        iM3169 = (C0619.m2761("᩷ۛ") + i4) * 69;
                        i = ((iM3169 ^ i3) * 13409) ^ (-89885321);
                        i2 = 704212420;
                    }
                    int i116 = i14;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i13 = i116;
                    break;
                case -149349016:
                case 1436130157:
                    i14 = i14;
                    int i21 = s + s2;
                    if ((i21 * i21) - i9 <= 0) {
                        iM3169 = (i4 - C0773.m3169("ܺ۫")) * 9;
                        i = ((iM3169 ^ i3) * (-27463)) ^ (-1758326093);
                        i2 = 651700323;
                    } else {
                        iM3169 = C0619.m2761("ۡ᩶") ^ i4;
                        i = ((iM3169 ^ i3) * (-2471)) ^ 864440590;
                        i2 = -38188492;
                    }
                    int i117 = i14;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i13 = i117;
                    break;
                case -131354130:
                case 2093620350:
                    i14 = i14;
                    i11 = 381;
                    if (RunnableC3055.f9898 >= 0) {
                        iM3169 = C0619.m2761("ܺۖ") ^ i3;
                        i = ((iM3169 ^ i4) * (-20735)) ^ (-1400522699);
                        i2 = 1958008803;
                    } else {
                        iM3169 = (C0773.m3169("ᩳ۫") + i4) * (-33);
                        i = ((iM3169 ^ i3) * (-2323)) ^ 37448592;
                        i2 = 459769593;
                    }
                    int i118 = i14;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i13 = i118;
                    break;
                case -97847057:
                case 1964161569:
                    if (C1826.f6190 > 0) {
                        i14 = i14;
                        iM3169 = C0619.m2761("ܺۖ") ^ i3;
                        i = ((iM3169 ^ i4) * (-20735)) ^ (-1400522699);
                        i2 = 1958008803;
                        int i119 = i14;
                        i6 = iM3169 ^ i2;
                        i5 = i;
                        i13 = i119;
                    }
                    i14 = i14;
                    iM3169 = (C0619.m2761("᩷ۛ") + i4) * 69;
                    i = ((iM3169 ^ i3) * 13409) ^ (-89885321);
                    i2 = 704212420;
                    int i1110 = i14;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i13 = i1110;
                    break;
                case 462942874:
                case 2091522654:
                    i14 = i14;
                    sArr = f1206;
                    if (C0862.m3503()) {
                        iM3169 = C0773.m3169("᩵ۗ") ^ i3;
                        i = ((iM3169 ^ i4) * (-17311)) ^ 1029111767;
                        i2 = -789359956;
                    } else {
                        iM3169 = C0619.m2761("ܺۖ") ^ i3;
                        i = ((iM3169 ^ i4) * (-20735)) ^ (-1400522699);
                        i2 = 1958008803;
                    }
                    int i1111 = i14;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i13 = i1111;
                    break;
                case 727906133:
                case 1556661959:
                    i14 = i14;
                    bundleRequireArguments = requireArguments();
                    sArr2 = f1206;
                    if (C3492.f12043 <= 0) {
                        iM3169 = C0619.m2761("ܺۖ") ^ i3;
                        i = ((iM3169 ^ i4) * (-20735)) ^ (-1400522699);
                        i2 = 1958008803;
                    } else {
                        iM3169 = (C0773.m3169("ۗۢ") ^ i3) * 79;
                        i = ((iM3169 ^ i4) * 11761) ^ (-1368103623);
                        i2 = 510194717;
                    }
                    int i1112 = i14;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i13 = i1112;
                    break;
                default:
                    i14 = i14;
                    C2966.m9664();
                    iM3169 = (C0619.m2761("᩷ۛ") + i4) * 69;
                    i = ((iM3169 ^ i3) * 13409) ^ (-89885321);
                    i2 = 704212420;
                    int i1113 = i14;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i13 = i1113;
                    break;
            }
        }
    }

    @Override // l.AbstractC9051
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1436(C22761 c22761) {
        c22761.m51298(m1441());
    }

    @Override // l.InterfaceC16837
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo1437() {
        C23582 c23582 = null;
        int i = 118967379;
        int i2 = C11235.f35427;
        int i3 = C3734.f12817;
        int iM2761 = C0619.m2761("۫֡") ^ i2;
        int i4 = ((iM2761 ^ i3) * (-30973)) ^ (-553723995);
        int i5 = 247976968;
        while (true) {
            i = ((((i ^ i3) * (-24735)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2130038910:
                case 1840524636:
                    if (AbstractC0116.f1064 <= 0) {
                        iM2761 = (i3 - C0619.m2761("ܰۙ")) * (-73);
                        i4 = ((iM2761 ^ i2) * (-8783)) ^ (-376686119);
                        i5 = -416705624;
                    } else {
                        iM2761 = C0619.m2761("᩷᩺") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-15921)) ^ (-1261407555);
                        i5 = 1715301921;
                    }
                    break;
                case -2063616930:
                case -159336474:
                    if (C0950.f3488 >= 0) {
                        iM2761 = C0619.m2761("᩻᩵") ^ i3;
                        i4 = ((iM2761 ^ i2) * 15633) ^ 1376918075;
                        i5 = -1921192849;
                    } else {
                        iM2761 = (C0619.m2761("᩸᩶") ^ i2) * 23;
                        i4 = ((iM2761 ^ i3) * (-22123)) ^ 1284578089;
                        i5 = 1972871400;
                    }
                    break;
                case -1753076378:
                case -1337065957:
                    if (AbstractC3624.f12429 <= 0) {
                        iM2761 = C0773.m3169("ۙ᩸") ^ i2;
                        i4 = ((iM2761 ^ i3) * 7675) ^ 1279153023;
                        i5 = -1129544618;
                    } else {
                        iM2761 = (C0619.m2761("֨ܺ") ^ i2) * 13;
                        i4 = ((iM2761 ^ i3) * 16487) ^ (-1991953969);
                        i5 = 1092857676;
                    }
                    break;
                case -1721820712:
                case 1297561061:
                    C3099.m10095();
                    if (RunnableC3055.f9898 >= 0) {
                        iM2761 = C0619.m2761("᩻᩵") ^ i3;
                        i4 = ((iM2761 ^ i2) * 15633) ^ 1376918075;
                        i5 = -1921192849;
                    } else {
                        iM2761 = C0773.m3169("ۙ᩸") ^ i2;
                        i4 = ((iM2761 ^ i3) * 7675) ^ 1279153023;
                        i5 = -1129544618;
                    }
                    break;
                case -1675281590:
                case -417518050:
                    c23582 = this.f1208;
                    if (c23582 != null) {
                        iM2761 = (C0619.m2761("᩶۠") ^ i3) * 123;
                        i4 = ((iM2761 ^ i2) * (-4033)) ^ (-2046301391);
                        i5 = 1459835335;
                    } else {
                        iM2761 = C0773.m3169("۫ᩳ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-19391)) ^ 1098057581;
                        i5 = -984742266;
                    }
                    break;
                case -1515077339:
                case -120423786:
                    return true;
                case -1319946375:
                case -186903658:
                    if (C2878.f9462) {
                        iM2761 = C0773.m3169("᩹۬") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-23489)) ^ (-1597589082);
                        i5 = -776600968;
                    } else {
                        iM2761 = C0773.m3169("֨ۢ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-31027)) ^ 1350824481;
                        i5 = 2085966472;
                    }
                    break;
                case -1059858351:
                case 809672001:
                    this.f1208.m52826();
                    if (C2354.f7599 >= 0) {
                        iM2761 = (i3 - C0619.m2761("ܰۙ")) * (-73);
                        i4 = ((iM2761 ^ i2) * (-8783)) ^ (-376686119);
                        i5 = -416705624;
                    } else {
                        iM2761 = (C0773.m3169("᩺ۢ") ^ i3) * (-23);
                        i4 = ((iM2761 ^ i2) * 16975) ^ (-526553012);
                        i5 = 1639670383;
                    }
                    break;
                case -1001893620:
                case 519774282:
                    if (C2354.m7983()) {
                        iM2761 = C0773.m3169("ۘۖ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-23821)) ^ (-2024944012);
                        i5 = 626911836;
                    } else {
                        iM2761 = C0773.m3169("᩹۬") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-23489)) ^ (-1597589082);
                        i5 = -776600968;
                    }
                    break;
                case -644970321:
                case -444662356:
                    C1826.m6301();
                    iM2761 = C0773.m3169("ۙ᩸") ^ i2;
                    i4 = ((iM2761 ^ i3) * 7675) ^ 1279153023;
                    i5 = -1129544618;
                    break;
                case -427402964:
                case 883123266:
                    if (C1146.m4231()) {
                        iM2761 = C0619.m2761("ۚ᩵") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-7483)) ^ (-496251075);
                        i5 = 815915335;
                    } else {
                        iM2761 = C0773.m3169("᩹۬") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-23489)) ^ (-1597589082);
                        i5 = -776600968;
                    }
                    break;
                case -381343221:
                case 1562680577:
                    if (C0619.m2763()) {
                        iM2761 = C0773.m3169("۬ܳ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 14635) ^ 35959821;
                        i5 = 2006717247;
                    } else {
                        iM2761 = C0619.m2761("ۧۘ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 7051) ^ 55193298;
                        i5 = 1454030473;
                    }
                    break;
                case -222617061:
                case 1129777855:
                    C1542.m5459();
                    if (AbstractC3624.m11755() == 0) {
                        iM2761 = (i3 - C0619.m2761("ܰۙ")) * (-73);
                        i4 = ((iM2761 ^ i2) * (-8783)) ^ (-376686119);
                        i5 = -416705624;
                    } else {
                        iM2761 = C0773.m3169("ۙ᩸") ^ i2;
                        i4 = ((iM2761 ^ i3) * 7675) ^ 1279153023;
                        i5 = -1129544618;
                    }
                    break;
                case -141185946:
                case 1818089756:
                    if (c23582.m52817()) {
                        iM2761 = C0619.m2761("᩵ۗ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 509) ^ 992594979;
                        i5 = -1566337769;
                    } else {
                        iM2761 = C0773.m3169("۫ᩳ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-19391)) ^ 1098057581;
                        i5 = -984742266;
                    }
                    break;
                case 409955724:
                case 1423904400:
                    if (C1519.f5300 >= 0) {
                        iM2761 = C0773.m3169("۬ܳ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 14635) ^ 35959821;
                        i5 = 2006717247;
                    } else {
                        iM2761 = C0773.m3169("ۙ᩸") ^ i2;
                        i4 = ((iM2761 ^ i3) * 7675) ^ 1279153023;
                        i5 = -1129544618;
                    }
                    break;
                case 776886717:
                case 1425617316:
                    AbstractC3624.m11755();
                    C2310.m7813();
                    return false;
                case 1044910098:
                case 1470940474:
                    return false;
                case 1205201582:
                case 1552961260:
                    if (C3998.f13671 != 0) {
                        iM2761 = C0773.m3169("᩹۬") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-23489)) ^ (-1597589082);
                        i5 = -776600968;
                    } else {
                        iM2761 = C0773.m3169("ܽۡ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 4709) ^ (-992320397);
                        i5 = -123468639;
                    }
                    break;
                default:
                    if (C0619.f2439) {
                        iM2761 = C0619.m2761("᩻᩵") ^ i3;
                        i4 = ((iM2761 ^ i2) * 15633) ^ 1376918075;
                        i5 = -1921192849;
                    } else {
                        iM2761 = (i3 - C0773.m3169("᩺ܶ")) * (-3);
                        i4 = ((iM2761 ^ i2) * (-25953)) ^ 818142267;
                        i5 = -1235750865;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00e3 A[PHI: r3
      0x00e3: PHI (r3v5 l.᩸ۧۧ) = (r3v4 l.᩸ۧۧ), (r3v2 l.᩸ۧۧ), (r3v2 l.᩸ۧۧ) binds: [B:39:0x00e1, B:13:0x0047, B:78:0x00e3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x0182 A[PHI: r2 r5 r14
      0x0182: PHI (r2v5 l.۫ܺۙ) = (r2v2 l.۫ܺۙ), (r2v4 l.۫ܺۙ), (r2v2 l.۫ܺۙ), (r2v2 l.۫ܺۙ) binds: [B:52:0x0180, B:43:0x0115, B:35:0x00c2, B:13:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x0182: PHI (r5v5 java.lang.Class<l.ۨۧۧ>) = 
      (r5v2 java.lang.Class<l.ۨۧۧ>)
      (r5v2 java.lang.Class<l.ۨۧۧ>)
      (r5v4 java.lang.Class<l.ۨۧۧ>)
      (r5v2 java.lang.Class<l.ۨۧۧ>)
     binds: [B:52:0x0180, B:43:0x0115, B:35:0x00c2, B:13:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x0182: PHI (r14v3 l.ܶܺۙ) = (r14v1 l.ܶܺۙ), (r14v1 l.ܶܺۙ), (r14v2 l.ܶܺۙ), (r14v1 l.ܶܺۙ) binds: [B:52:0x0180, B:43:0x0115, B:35:0x00c2, B:13:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x01af A[PHI: r7
      0x01af: PHI (r7v4 l.֡᩹᩸) = (r7v2 l.֡᩹᩸), (r7v3 l.֡᩹᩸), (r7v2 l.֡᩹᩸) binds: [B:56:0x01ad, B:24:0x0073, B:77:0x01af] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC9051, l.ComponentCallbacksC11612
    public final void onCreate(Bundle bundle) {
        int iM3169;
        int i;
        AbstractC13213 abstractC13213M38422 = null;
        C22761 c22761 = null;
        Class<C12318> cls = null;
        C12318 c12318 = null;
        C0747 c0747 = null;
        int i2 = 1835367947;
        int i3 = RunnableC3055.f9898;
        int i4 = C11235.f35427;
        int iM31610 = C0773.m3169("ܿᩴ") ^ i4;
        int i5 = ((iM31610 ^ i3) * 5273) ^ 1331856744;
        int i6 = iM31610 ^ 1348981229;
        C16196 c16196 = null;
        while (true) {
            C16196 c16197 = null;
            while (true) {
                i2 = ((((i2 ^ i3) * (-4457)) >> 31) & i5) ^ i6;
                switch (i2) {
                    case -2133425082:
                    case -1693460301:
                        C3099.m10095();
                        if (C1080.f3865 >= 0) {
                            iM3169 = (C0619.m2761("ۨ᩸") ^ i3) * (-97);
                            i5 = ((iM3169 ^ i4) * 7837) ^ (-62026937);
                            i = -215791158;
                            i6 = iM3169 ^ i;
                        } else {
                            int iM31611 = C0773.m3169("ܰ᩸") ^ i4;
                            i5 = ((iM31611 ^ i3) * 21897) ^ (-1740939055);
                            i6 = iM31611 ^ (-1423158055);
                            c16196 = null;
                        }
                        break;
                    case -2017917469:
                    case -509452261:
                        C1519.m5403();
                        if (!C2023.f6737) {
                            iM3169 = (C0619.m2761("ܽ᩷") ^ i3) * 61;
                            i5 = ((iM3169 ^ i4) * 25455) ^ (-3860461);
                            i = -1590221384;
                            i6 = iM3169 ^ i;
                        } else {
                            int iM31612 = C0773.m3169("ܰ᩸") ^ i4;
                            i5 = ((iM31612 ^ i3) * 21897) ^ (-1740939055);
                            i6 = iM31612 ^ (-1423158055);
                            c16196 = null;
                        }
                        break;
                    case -2003964953:
                    case 573966601:
                        super.onCreate(bundle);
                        if (C3077.f9998) {
                            iM3169 = C0773.m3169("ܶۧ") ^ i3;
                            i5 = ((iM3169 ^ i4) * (-5627)) ^ (-438786576);
                            i = 30446394;
                        } else {
                            iM3169 = (i4 - C0773.m3169("ۗۛ")) * 85;
                            i5 = ((iM3169 ^ i3) * 23193) ^ (-1168240287);
                            i = 1608353155;
                        }
                        i6 = iM3169 ^ i;
                        break;
                    case -1955098548:
                    case 969842373:
                        C1343.m4943();
                        C1080.m4050();
                        break;
                    case -1894096967:
                    case -1203627866:
                        C2878.m9491();
                        C4238.m13540();
                        int iM31613 = C0773.m3169("ܰ᩸") ^ i4;
                        i5 = ((iM31613 ^ i3) * 21897) ^ (-1740939055);
                        i6 = iM31613 ^ (-1423158055);
                        c16196 = null;
                        break;
                    case -1850384289:
                    case 471980745:
                        this.f1215 = C25043.m55863(this, c0747);
                        break;
                    case -1593303943:
                    case -1031464532:
                        if (C3998.f13671 != 0) {
                            iM3169 = (C0619.m2761("ܽ᩷") ^ i3) * 61;
                            i5 = ((iM3169 ^ i4) * 25455) ^ (-3860461);
                            i = -1590221384;
                        } else {
                            iM3169 = C0773.m3169("ۙ᩸") ^ i4;
                            i5 = ((iM3169 ^ i3) * (-24583)) ^ (-879176679);
                            i = 443495948;
                        }
                        i6 = iM3169 ^ i;
                        break;
                    case -1078703571:
                    case 541727661:
                        c22761 = (C22761) abstractC13213M38422;
                        if (C0269.f1558 <= 0) {
                            iM3169 = (C0619.m2761("ۨ᩸") ^ i3) * (-97);
                            i5 = ((iM3169 ^ i4) * 7837) ^ (-62026937);
                            i = -215791158;
                        } else {
                            iM3169 = C0773.m3169("۫ۚ") ^ i3;
                            i5 = ((iM3169 ^ i4) * 10487) ^ 1145005453;
                            i = 16206976;
                        }
                        i6 = iM3169 ^ i;
                        break;
                    case -780832745:
                    case -519925776:
                        this.f1209 = c12318;
                        c0747 = new C0747(this);
                        if (C4282.f15546 <= 0) {
                            iM3169 = (C0619.m2761("ܽ᩷") ^ i3) * 61;
                            i5 = ((iM3169 ^ i4) * 25455) ^ (-3860461);
                            i = -1590221384;
                        } else {
                            iM3169 = (C0619.m2761("ۛܳ") ^ i4) * (-21);
                            i5 = ((iM3169 ^ i3) * (-25089)) ^ 784012918;
                            i = -280805779;
                        }
                        i6 = iM3169 ^ i;
                        break;
                    case -648150348:
                    case 105472513:
                        c12318 = (C12318) c16197.m38422(cls);
                        if (C4282.f15546 > 0) {
                            iM3169 = C0619.m2761("ۙۖ") ^ i3;
                            i5 = ((iM3169 ^ i4) * 29391) ^ (-808255708);
                            i = 996760718;
                            i6 = iM3169 ^ i;
                        } else {
                            int iM31614 = C0773.m3169("ܰ᩸") ^ i4;
                            i5 = ((iM31614 ^ i3) * 21897) ^ (-1740939055);
                            i6 = iM31614 ^ (-1423158055);
                            c16196 = null;
                        }
                        break;
                    case -536898641:
                    case -353671605:
                        this.f1223 = c22761;
                        if (C2310.f7472 < 0) {
                            c16197 = new C16196(AbstractC0116.m1234(this));
                            cls = C12318.class;
                            if (C17202.f56030) {
                                iM3169 = (C0773.m3169("ᩴ֫") + i4) * 49;
                                i5 = ((iM3169 ^ i3) * (-18557)) ^ 650711784;
                                i = 463519002;
                            } else {
                                iM3169 = (i4 - C0773.m3169("ۗۛ")) * 85;
                                i5 = ((iM3169 ^ i3) * 23193) ^ (-1168240287);
                                i = 1608353155;
                            }
                            i6 = iM3169 ^ i;
                        }
                        break;
                    case 576311986:
                    case 1564336792:
                        abstractC13213M38422 = c16196.m38422(C22761.class);
                        if (C1542.f5343 <= 0) {
                            iM3169 = (i4 - C0773.m3169("ۗۛ")) * 85;
                            i5 = ((iM3169 ^ i3) * 23193) ^ (-1168240287);
                            i = 1608353155;
                        } else {
                            iM3169 = (C0619.m2761("ܺۘ") ^ i3) * (-87);
                            i5 = ((iM3169 ^ i4) * (-633)) ^ 542659634;
                            i = -809349049;
                        }
                        i6 = iM3169 ^ i;
                        break;
                    case 1771571934:
                    case 1863032163:
                        C3492.m11488();
                        if (C2485.m8357() > 0) {
                            iM3169 = (C0619.m2761("ۨ᩸") ^ i3) * (-97);
                            i5 = ((iM3169 ^ i4) * 7837) ^ (-62026937);
                            i = -215791158;
                        } else {
                            iM3169 = (i4 - C0773.m3169("ۗۛ")) * 85;
                            i5 = ((iM3169 ^ i3) * 23193) ^ (-1168240287);
                            i = 1608353155;
                        }
                        i6 = iM3169 ^ i;
                        break;
                    default:
                        if (RunnableC0334.f1808 > 0) {
                            c16196 = new C16196(AbstractC3624.m11768(this));
                            if (!C2966.m9664()) {
                            }
                            iM3169 = (C0619.m2761("᩺ۛ") ^ i4) * (-21);
                            i5 = ((iM3169 ^ i3) * (-31973)) ^ 1672781659;
                            i = -774663851;
                            i6 = iM3169 ^ i;
                        } else {
                            int iM31615 = C0773.m3169("ܰ᩸") ^ i4;
                            i5 = ((iM31615 ^ i3) * 21897) ^ (-1740939055);
                            i6 = iM31615 ^ (-1423158055);
                            c16196 = null;
                        }
                        break;
                }
                return;
            }
            int iM2761 = C0619.m2761("֫۫") ^ i3;
            i5 = ((iM2761 ^ i4) * (-14911)) ^ (-177269880);
            i6 = iM2761 ^ 1839547591;
        }
    }

    @Override // l.ComponentCallbacksC11612
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int i;
        short[] sArr;
        int i2;
        int i3;
        C2361 c2361;
        short[] sArr2;
        int iM3169;
        int i4;
        int i5;
        short[] sArr3;
        int iM2761;
        int i6;
        int i7;
        int i8;
        int i9;
        int iM31610;
        int i10;
        int i11;
        short[] sArr4;
        int i12;
        int iM31611;
        int i13;
        int i14;
        int i15;
        short[] sArr5;
        int iM31612;
        int i16;
        C2361 c2362;
        DialogInterface.OnClickListener onClickListener;
        short[] sArr6;
        int iM31613;
        int i17;
        int i18;
        short[] sArr7;
        int iM31614;
        int i19;
        int i20;
        int i21 = C2288.f7433;
        int i22 = RunnableC0334.f1808;
        int iM2762 = (i21 - C0619.m2761("ܳۖ")) * 101;
        int i23 = ((iM2762 ^ i22) * 13305) ^ 1069514860;
        Bundle bundleRequireArguments = null;
        String strM36751 = null;
        C2361 c2363 = null;
        String[] strArr = null;
        DialogInterface.OnClickListener onClickListener2 = null;
        String strM1785 = null;
        short[] sArr8 = null;
        short[] sArr9 = null;
        int i24 = iM2762 ^ 1839821588;
        int iM33146 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int iM31615 = 0;
        int i30 = 0;
        int iM31616 = 0;
        int i31 = 0;
        short s = 0;
        int i32 = 0;
        int i33 = 0;
        int i34 = 0;
        int i35 = 0;
        int i36 = -1659498332;
        int i37 = 0;
        ActivityC0848 activityC0848 = null;
        short[] sArr10 = null;
        boolean z = false;
        short[] sArr11 = null;
        String strM1441 = null;
        String strM11770 = null;
        StringBuilder sb = null;
        C11616 c11616 = null;
        while (true) {
            i36 = i24 ^ (i23 & (((i36 ^ i22) * 673) >> 31));
            switch (i36) {
                case -2104665843:
                case 2047975215:
                    sArr3 = sArr8;
                    c2363 = c2363;
                    strM11770 = strM11770;
                    int i38 = i34;
                    sArr10 = sArr10;
                    i35 = i35;
                    i3 = i38;
                    strM36751 = C15306.m36751(m1441());
                    i26 = 80;
                    if (C2966.m9671(strM36751) <= 80) {
                        strM11770 = strM36751;
                        int iM2763 = (C0619.m2761("᩵۬") ^ i21) * (-93);
                        c2363 = c2363;
                        sArr5 = sArr3;
                        i24 = iM2763 ^ 597595691;
                        i23 = ((iM2763 ^ i22) * (-23857)) ^ 549409773;
                        sArr8 = sArr5;
                        int i39 = i3;
                        i35 = i35;
                        sArr10 = sArr10;
                        i34 = i39;
                    } else {
                        iM31610 = (C0619.m2761("᩹֫") + i21) * (-9);
                        i6 = ((iM31610 ^ i22) * (-19611)) ^ (-1481999854);
                        i10 = 137985844;
                        i8 = iM31610 ^ i10;
                        sArr8 = sArr3;
                        i24 = i8;
                        i23 = i6;
                        strM11770 = strM11770;
                        c2363 = c2363;
                        int i40 = i3;
                        i35 = i35;
                        sArr10 = sArr10;
                        i34 = i40;
                    }
                    break;
                case -2100891667:
                case 908215633:
                    sArr3 = sArr8;
                    strM11770 = AbstractC3624.m11770(strM36751, 0, i26);
                    c2363 = c2363;
                    int i41 = i34;
                    sArr10 = sArr10;
                    i35 = i35;
                    i3 = i41;
                    int iM2764 = (C0619.m2761("᩵۬") ^ i21) * (-93);
                    c2363 = c2363;
                    sArr5 = sArr3;
                    i24 = iM2764 ^ 597595691;
                    i23 = ((iM2764 ^ i22) * (-23857)) ^ 549409773;
                    sArr8 = sArr5;
                    int i310 = i3;
                    i35 = i35;
                    sArr10 = sArr10;
                    i34 = i310;
                    break;
                case -2098748374:
                case 1503417107:
                    C3492.m11488();
                    iM31614 = (C0773.m3169("ܶ֡") ^ i21) * 93;
                    i19 = ((iM31614 ^ i22) * (-3095)) ^ (-1620070803);
                    i20 = 848601018;
                    i24 = iM31614 ^ i20;
                    i23 = i19;
                    break;
                case -2074056791:
                case 1030892298:
                    return super.onOptionsItemSelected(menuItem);
                case -1971045532:
                case 418220400:
                    C3492.m11488();
                    RunnableC0334.m2063();
                    return false;
                case -1865945879:
                case -288588348:
                    this.f1208.m52814();
                    return z;
                case -1863884429:
                case 1016721561:
                    sArr8 = sArr8;
                    i33 = i33;
                    c2363 = c2363;
                    strM11770 = strM11770;
                    sArr11 = sArr11;
                    z = z ? 1 : 0;
                    int i42 = i34;
                    sArr10 = sArr10;
                    i35 = i35;
                    i3 = i42;
                    iM33146 = C13473.m33146(menuItem);
                    strM1785 = C0269.m1785(f1206, 213, 3, i25);
                    if (C3077.f9998) {
                        iM3169 = C0619.m2761("᩶ۚ") ^ i22;
                        i4 = ((iM3169 ^ i21) * 18057) ^ 1247100159;
                        i5 = 138158482;
                    } else {
                        iM3169 = C0773.m3169("ᩳ᩸") ^ i21;
                        i4 = ((iM3169 ^ i22) * (-11497)) ^ (-369752851);
                        i5 = 92610145;
                    }
                    int i43 = iM3169 ^ i5;
                    strM11770 = strM11770;
                    c2363 = c2363;
                    sArr5 = sArr8;
                    i24 = i43;
                    i23 = i4;
                    z = z;
                    sArr11 = sArr11;
                    i33 = i33;
                    sArr8 = sArr5;
                    int i311 = i3;
                    i35 = i35;
                    sArr10 = sArr10;
                    i34 = i311;
                    break;
                case -1806099521:
                case 720208091:
                    activityC0848.m3430(strM1441, C2375.m8060(bundleRequireArguments, C3779.m12266(sArr11, i33, 6, i25)), m1449(), z);
                    return z;
                case -1792694572:
                case 1360676267:
                    sArr8 = sArr8;
                    c2363 = c2363;
                    strM11770 = strM11770;
                    String[] strArr2 = strArr;
                    int i44 = i35;
                    c2363.m8013(strArr2, i44, new DialogInterfaceOnClickListenerC11110(z ? 1 : 0, this));
                    onClickListener2 = null;
                    if (!RunnableC1848.f6235) {
                        int iM31617 = (C0773.m3169("ۜ᩷") ^ i21) * (-73);
                        strArr = strArr2;
                        i12 = ((iM31617 ^ i22) * (-2463)) ^ (-543836366);
                        i13 = iM31617 ^ (-466468370);
                        i35 = i44;
                        sArr8 = sArr8;
                        i24 = i13;
                        i23 = i12;
                        strM11770 = strM11770;
                        c2363 = c2363;
                    } else {
                        strArr = strArr2;
                        i3 = i34;
                        sArr10 = sArr10;
                        i35 = i44;
                        i33 = i33;
                        sArr11 = sArr11;
                        z = z ? 1 : 0;
                        iM3169 = C0773.m3169("ᩳ᩸") ^ i21;
                        i4 = ((iM3169 ^ i22) * (-11497)) ^ (-369752851);
                        i5 = 92610145;
                        int i45 = iM3169 ^ i5;
                        strM11770 = strM11770;
                        c2363 = c2363;
                        sArr5 = sArr8;
                        i24 = i45;
                        i23 = i4;
                        z = z;
                        sArr11 = sArr11;
                        i33 = i33;
                        sArr8 = sArr5;
                        int i312 = i3;
                        i35 = i35;
                        sArr10 = sArr10;
                        i34 = i312;
                    }
                    break;
                case -1727846201:
                case 722522572:
                    sArr3 = sArr8;
                    c2363 = c2363;
                    strM11770 = strM11770;
                    C13473.m33136(c2363, iM31615 ^ i30);
                    strArr = C11650.f37686;
                    i9 = this.f1216;
                    this.f1220 = i9;
                    if (C0950.f3488 >= 0) {
                        i3 = i34;
                        sArr10 = sArr10;
                        int iM2765 = (C0619.m2761("֡ۛ") + i21) * (-9);
                        i14 = ((iM2765 ^ i22) * 8613) ^ 518127279;
                        i15 = iM2765 ^ (-762679678);
                        sArr10 = sArr10;
                        i34 = i3;
                    } else {
                        int iM2766 = C0619.m2761("֨ܺ") ^ i22;
                        i14 = ((iM2766 ^ i21) * (-16943)) ^ 1626700927;
                        i15 = iM2766 ^ 1688538614;
                    }
                    i35 = i9;
                    i23 = i14;
                    sArr8 = sArr3;
                    i24 = i15;
                    strM11770 = strM11770;
                    c2363 = c2363;
                    break;
                case -1724441569:
                case -1482179690:
                    sArr8 = sArr8;
                    i33 = i33;
                    c2363 = c2363;
                    strM11770 = strM11770;
                    sArr11 = sArr11;
                    z = z ? 1 : 0;
                    int i46 = i34;
                    sArr10 = sArr10;
                    i35 = i35;
                    i3 = i46;
                    s = f1206[212];
                    i32 = s * 2;
                    if (C0773.m3161() == 0) {
                        iM3169 = C0773.m3169("᩸۫") ^ i21;
                        i4 = ((iM3169 ^ i22) * 28183) ^ (-905682138);
                        i5 = 786554071;
                        int i47 = iM3169 ^ i5;
                        strM11770 = strM11770;
                        c2363 = c2363;
                        sArr5 = sArr8;
                        i24 = i47;
                        i23 = i4;
                        z = z;
                        sArr11 = sArr11;
                        i33 = i33;
                        sArr8 = sArr5;
                        int i313 = i3;
                        i35 = i35;
                        sArr10 = sArr10;
                        i34 = i313;
                    } else {
                        c2361 = c2363;
                        sArr2 = sArr10;
                        i34 = i3;
                        int iM2767 = (C0619.m2761("ᩳ֫") ^ i22) * (-17);
                        i35 = i35;
                        sArr10 = sArr2;
                        i23 = ((iM2767 ^ i21) * (-10575)) ^ (-235893820);
                        short[] sArr12 = sArr8;
                        i24 = iM2767 ^ 22999185;
                        z = z;
                        sArr11 = sArr11;
                        i33 = i33;
                        sArr8 = sArr12;
                        String str = strM11770;
                        c2363 = c2361;
                        strM11770 = str;
                    }
                    break;
                case -1382206098:
                case -1114490704:
                    int iM31618 = C0773.m3169(C3099.m10092(sArr8, i27, i28, i25)) ^ 2102837658;
                    DialogInterface.OnClickListener onClickListener3 = onClickListener2;
                    DialogInterfaceC8327 dialogInterfaceC8327M34866 = C14442.m34866(c2363, iM31618, onClickListener3, i37, onClickListener3);
                    C2375.m8070(RunnableC3055.m9932(dialogInterfaceC8327M34866), new ViewOnClickListenerC19702(this, dialogInterfaceC8327M34866));
                    return z;
                case -1202891894:
                case 1085006097:
                    sArr8 = sArr8;
                    i33 = i33;
                    c2363 = c2363;
                    strM11770 = strM11770;
                    short[] sArr13 = sArr11;
                    int i48 = i34;
                    sArr10 = sArr10;
                    i35 = i35;
                    i3 = i48;
                    short[] sArr14 = f1206;
                    z = z ? 1 : 0;
                    sArr11 = sArr13;
                    if (iM33146 == (C0619.m2761(C1826.m6310(sArr14, 216, 3, i25)) ^ 2129232969)) {
                        iM3169 = (C0773.m3169("᩹۟") ^ i21) * (-35);
                        i4 = ((iM3169 ^ i22) * 1477) ^ 604489186;
                        i5 = 207902466;
                    } else {
                        iM3169 = (C0773.m3169("ۘ֫") ^ i22) * (-45);
                        i4 = ((iM3169 ^ i21) * 21885) ^ 611605863;
                        i5 = 1770243364;
                    }
                    int i49 = iM3169 ^ i5;
                    strM11770 = strM11770;
                    c2363 = c2363;
                    sArr5 = sArr8;
                    i24 = i49;
                    i23 = i4;
                    z = z;
                    sArr11 = sArr11;
                    i33 = i33;
                    sArr8 = sArr5;
                    int i314 = i3;
                    i35 = i35;
                    sArr10 = sArr10;
                    i34 = i314;
                    break;
                case -1199770185:
                case -450834383:
                    if (AbstractC3624.f12429 <= 0) {
                        iM31614 = (C0773.m3169("᩻ᩴ") ^ i21) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i19 = ((iM31614 ^ i22) * 18319) ^ (-1036733375);
                        i20 = 180280196;
                        i24 = iM31614 ^ i20;
                        i23 = i19;
                    } else {
                        sArr8 = sArr8;
                        i33 = i33;
                        sArr2 = sArr10;
                        i35 = i35;
                        sArr11 = sArr11;
                        z = z ? 1 : 0;
                        C2361 c2364 = c2363;
                        strM11770 = strM11770;
                        c2361 = c2364;
                        int iM2768 = (C0619.m2761("ᩳ֫") ^ i22) * (-17);
                        i35 = i35;
                        sArr10 = sArr2;
                        i23 = ((iM2768 ^ i21) * (-10575)) ^ (-235893820);
                        short[] sArr15 = sArr8;
                        i24 = iM2768 ^ 22999185;
                        z = z;
                        sArr11 = sArr11;
                        i33 = i33;
                        sArr8 = sArr15;
                        String str2 = strM11770;
                        c2363 = c2361;
                        strM11770 = str2;
                    }
                    break;
                case -1191366873:
                case 1796615989:
                    sArr8 = sArr8;
                    c11616 = this.f1215;
                    sb = new StringBuilder();
                    C1783.m6234(sb, strM11770);
                    sArr9 = f1206;
                    i29 = 240;
                    if (C1783.f6087 > 0) {
                        iM31613 = C0773.m3169("ܳܳ") ^ i22;
                        i17 = ((iM31613 ^ i21) * 30647) ^ 179124665;
                        i18 = -710888872;
                        sArr7 = sArr8;
                        i24 = iM31613 ^ i18;
                        i23 = i17;
                        sArr8 = sArr7;
                    } else {
                        c2363 = c2363;
                        strM11770 = strM11770;
                        iM31612 = C0773.m3169("ۚ᩷") ^ i22;
                        i12 = ((iM31612 ^ i21) * (-31503)) ^ (-919315001);
                        i16 = 2130236480;
                        i13 = iM31612 ^ i16;
                        sArr8 = sArr8;
                        i24 = i13;
                        i23 = i12;
                        strM11770 = strM11770;
                        c2363 = c2363;
                    }
                    break;
                case -1070044667:
                case 209678211:
                    sArr8 = sArr8;
                    if (iM33146 == (C0773.m3169(RunnableC1848.m6366(f1206, 248, 3, i25)) ^ 2127825823)) {
                        iM31613 = C0619.m2761("֫۬") ^ i22;
                        i17 = ((iM31613 ^ i21) * 24055) ^ (-1803507285);
                        i18 = 2023910664;
                    } else {
                        iM31613 = C0619.m2761("۫᩻") ^ i21;
                        i17 = ((iM31613 ^ i22) * (-11637)) ^ 770850697;
                        i18 = 1395491030;
                    }
                    sArr7 = sArr8;
                    i24 = iM31613 ^ i18;
                    i23 = i17;
                    sArr8 = sArr7;
                    break;
                case -1031276996:
                case 596674375:
                    sArr8 = sArr8;
                    i33 = i33;
                    c2363 = c2363;
                    strM11770 = strM11770;
                    sArr11 = sArr11;
                    z = z ? 1 : 0;
                    int i50 = i34;
                    sArr10 = sArr10;
                    i35 = i35;
                    i3 = i50;
                    if (this.f1226) {
                        iM3169 = C0619.m2761("ܿۤ") ^ i22;
                        i4 = ((iM3169 ^ i21) * (-23787)) ^ (-1074401216);
                        i5 = -1310753053;
                    } else {
                        iM3169 = (i21 - C0619.m2761("᩹ۜ")) * 109;
                        i4 = ((iM3169 ^ i22) * 19715) ^ (-1271600707);
                        i5 = 1266485921;
                    }
                    int i410 = iM3169 ^ i5;
                    strM11770 = strM11770;
                    c2363 = c2363;
                    sArr5 = sArr8;
                    i24 = i410;
                    i23 = i4;
                    z = z;
                    sArr11 = sArr11;
                    i33 = i33;
                    sArr8 = sArr5;
                    int i315 = i3;
                    i35 = i35;
                    sArr10 = sArr10;
                    i34 = i315;
                    break;
                case -959366840:
                case 1864905640:
                    if (C3779.f12953 <= 0) {
                        iM31614 = (C0773.m3169("ۘۖ") + i22) * 3;
                        i19 = ((iM31614 ^ i21) * 20619) ^ 1664424731;
                        i20 = -634697335;
                        i24 = iM31614 ^ i20;
                        i23 = i19;
                    } else {
                        sArr3 = sArr8;
                        i9 = i35;
                        c2363 = c2363;
                        strM11770 = strM11770;
                        i3 = i34;
                        sArr10 = sArr10;
                        int iM2769 = (C0619.m2761("֡ۛ") + i21) * (-9);
                        i14 = ((iM2769 ^ i22) * 8613) ^ 518127279;
                        i15 = iM2769 ^ (-762679678);
                        sArr10 = sArr10;
                        i34 = i3;
                        i35 = i9;
                        i23 = i14;
                        sArr8 = sArr3;
                        i24 = i15;
                        strM11770 = strM11770;
                        c2363 = c2363;
                    }
                    break;
                case -908025680:
                case -534795529:
                    C3779.m12258(sb, C20932.m47853(sArr9, i29, 5, i25));
                    c11616.m29186(C1080.m4058(sb));
                    return z;
                case -838417265:
                case 1645571802:
                    strM11770 = strM11770;
                    sArr8 = sArr8;
                    i35 = i35;
                    ActivityC3409 activityC3409M1234 = AbstractC0116.m1234(this);
                    int i51 = DialogInterfaceC8327.f27315;
                    c2361 = new C2361(activityC3409M1234);
                    sArr2 = f1206;
                    i34 = 231;
                    if (AbstractC0116.m1243() != 0) {
                        i33 = i33;
                        sArr11 = sArr11;
                        z = z ? 1 : 0;
                        int iM27610 = (C0619.m2761("ᩳ֫") ^ i22) * (-17);
                        i35 = i35;
                        sArr10 = sArr2;
                        i23 = ((iM27610 ^ i21) * (-10575)) ^ (-235893820);
                        short[] sArr16 = sArr8;
                        i24 = iM27610 ^ 22999185;
                        z = z;
                        sArr11 = sArr11;
                        i33 = i33;
                        sArr8 = sArr16;
                        String str3 = strM11770;
                        c2363 = c2361;
                        strM11770 = str3;
                    } else {
                        int iM27611 = (C0619.m2761("۟֫") + i22) * (-37);
                        i35 = i35;
                        sArr10 = sArr2;
                        i23 = ((iM27611 ^ i21) * 24047) ^ (-384533410);
                        c2363 = c2361;
                        strM11770 = strM11770;
                        i24 = iM27611 ^ (-554781210);
                        sArr8 = sArr8;
                    }
                    break;
                case -823763464:
                case 1293755750:
                    this.f1208.m52806(ActivityC18470.class);
                    return z;
                case -818889956:
                case -453209974:
                    sArr3 = sArr8;
                    int i52 = i34;
                    c2363 = c2363;
                    strM11770 = strM11770;
                    sArr10 = sArr10;
                    i35 = i35;
                    i3 = i52;
                    if (iM33146 == (C0619.m2761(C23916.m53420(f1206, 228, 3, i25)) ^ 2123530774)) {
                        iM31610 = (C0619.m2761("ۛ֡") + i22) * (-101);
                        i6 = ((iM31610 ^ i21) * (-22299)) ^ 1607471733;
                        i10 = -752270760;
                    } else {
                        iM31610 = (C0619.m2761("ۖۛ") + i22) * (-35);
                        i6 = ((iM31610 ^ i21) * 27943) ^ 1959240772;
                        i10 = -1455247488;
                    }
                    i8 = iM31610 ^ i10;
                    sArr8 = sArr3;
                    i24 = i8;
                    i23 = i6;
                    strM11770 = strM11770;
                    c2363 = c2363;
                    int i411 = i3;
                    i35 = i35;
                    sArr10 = sArr10;
                    i34 = i411;
                    break;
                case -790696056:
                case 432219407:
                    this.f1208.mo13072();
                    return z;
                case -767331342:
                case -454695632:
                    sArr3 = sArr8;
                    c2363 = c2363;
                    strM11770 = strM11770;
                    int i53 = i34;
                    sArr10 = sArr10;
                    i35 = i35;
                    i3 = i53;
                    if (iM33146 == (C0619.m2761(C2288.m7761(f1206, HideBottomViewOnScrollBehavior.DEFAULT_ENTER_ANIMATION_DURATION_MS, 3, i25)) ^ 2102187572)) {
                        iM31610 = (C0773.m3169("᩶۫") + i21) * (-13);
                        i6 = ((iM31610 ^ i22) * 31121) ^ 1253304636;
                        i10 = 1673302092;
                    } else {
                        iM31610 = (C0773.m3169("֨ܳ") + i22) * 15;
                        i6 = ((iM31610 ^ i21) * 16305) ^ 905520445;
                        i10 = -377873574;
                    }
                    i8 = iM31610 ^ i10;
                    sArr8 = sArr3;
                    i24 = i8;
                    i23 = i6;
                    strM11770 = strM11770;
                    c2363 = c2363;
                    int i412 = i3;
                    i35 = i35;
                    sArr10 = sArr10;
                    i34 = i412;
                    break;
                case -524265436:
                case 1925509728:
                    if (!RunnableC1848.m6360()) {
                        iM31614 = (C0773.m3169("ۘۖ") + i22) * 3;
                        i19 = ((iM31614 ^ i21) * 20619) ^ 1664424731;
                        i20 = -634697335;
                        i24 = iM31614 ^ i20;
                        i23 = i19;
                    } else {
                        sArr8 = sArr8;
                        i33 = i33;
                        sArr2 = sArr10;
                        i35 = i35;
                        sArr11 = sArr11;
                        z = z ? 1 : 0;
                        C2361 c2365 = c2363;
                        strM11770 = strM11770;
                        c2361 = c2365;
                        int iM27612 = (C0619.m2761("ᩳ֫") ^ i22) * (-17);
                        i35 = i35;
                        sArr10 = sArr2;
                        i23 = ((iM27612 ^ i21) * (-10575)) ^ (-235893820);
                        short[] sArr17 = sArr8;
                        i24 = iM27612 ^ 22999185;
                        z = z;
                        sArr11 = sArr11;
                        i33 = i33;
                        sArr8 = sArr17;
                        String str4 = strM11770;
                        c2363 = c2361;
                        strM11770 = str4;
                    }
                    break;
                case -439474977:
                case 578864093:
                    sArr8 = sArr8;
                    c2363 = c2363;
                    strM11770 = strM11770;
                    sArr = sArr10;
                    i2 = i35;
                    i = i34;
                    iM31615 = C0773.m3169(C3033.m9847(sArr, i, 3, i25));
                    i30 = 2128346823;
                    if (AbstractC0641.f2496 >= 0) {
                        iM31611 = C0773.m3169("ᩳۢ") ^ i21;
                        sArr4 = sArr;
                        i12 = ((iM31611 ^ i22) * 1061) ^ 1768317782;
                        i11 = 631279661;
                    } else {
                        sArr4 = sArr;
                        iM31611 = (i21 - C0619.m2761("ۜ۟")) * 127;
                        i12 = ((iM31611 ^ i22) * 27909) ^ 1232924038;
                        i11 = -314281750;
                    }
                    i13 = iM31611 ^ i11;
                    i35 = i2;
                    sArr10 = sArr4;
                    i34 = i;
                    sArr8 = sArr8;
                    i24 = i13;
                    i23 = i12;
                    strM11770 = strM11770;
                    c2363 = c2363;
                    break;
                case -432823147:
                case -252979613:
                    sArr8 = sArr8;
                    if (iM33146 == (C0773.m3169(C2287.m7749(f1206, Scalar25519.TARGET_LENGTH, 3, i25)) ^ 2130023139)) {
                        iM31613 = (i21 - C0619.m2761("ۜۙ")) * (-103);
                        i17 = ((iM31613 ^ i22) * (-24925)) ^ 795525499;
                        i18 = -2064894546;
                    } else {
                        iM31613 = (i21 - C0619.m2761("᩹᩶")) * 73;
                        i17 = ((iM31613 ^ i22) * 24487) ^ 268464991;
                        i18 = 1693132554;
                    }
                    sArr7 = sArr8;
                    i24 = iM31613 ^ i18;
                    i23 = i17;
                    sArr8 = sArr7;
                    break;
                case -173650610:
                case 809172440:
                    this.f1225.m30404();
                    return z;
                case -135271451:
                case 2132862826:
                    i3 = i34;
                    i25 = 31598;
                    iM3169 = C0773.m3169("᩷ۙ") ^ i22;
                    i4 = ((iM3169 ^ i21) * (-28085)) ^ (-57646197);
                    i5 = 371999434;
                    int i413 = iM3169 ^ i5;
                    strM11770 = strM11770;
                    c2363 = c2363;
                    sArr5 = sArr8;
                    i24 = i413;
                    i23 = i4;
                    z = z;
                    sArr11 = sArr11;
                    i33 = i33;
                    sArr8 = sArr5;
                    int i316 = i3;
                    i35 = i35;
                    sArr10 = sArr10;
                    i34 = i316;
                    break;
                case 123884171:
                case 2070529262:
                    C3998.m12920();
                    if (C2288.f7433 > 0) {
                        sArr3 = sArr8;
                        i9 = i35;
                        c2363 = c2363;
                        strM11770 = strM11770;
                        i3 = i34;
                        sArr10 = sArr10;
                        int iM27613 = (C0619.m2761("֡ۛ") + i21) * (-9);
                        i14 = ((iM27613 ^ i22) * 8613) ^ 518127279;
                        i15 = iM27613 ^ (-762679678);
                        sArr10 = sArr10;
                        i34 = i3;
                        i35 = i9;
                        i23 = i14;
                        sArr8 = sArr3;
                        i24 = i15;
                        strM11770 = strM11770;
                        c2363 = c2363;
                    } else {
                        iM31614 = (C0773.m3169("ܶ֡") ^ i21) * 93;
                        i19 = ((iM31614 ^ i22) * (-3095)) ^ (-1620070803);
                        i20 = 848601018;
                        i24 = iM31614 ^ i20;
                        i23 = i19;
                    }
                    break;
                case 222802920:
                case 1286652153:
                    sArr8 = sArr8;
                    i33 = i33;
                    c2363 = c2363;
                    strM11770 = strM11770;
                    sArr11 = sArr11;
                    z = z ? 1 : 0;
                    int i54 = i34;
                    sArr10 = sArr10;
                    i35 = i35;
                    i3 = i54;
                    int i55 = s + 1;
                    if ((i32 + 1) - (i55 * i55) > 0) {
                        iM3169 = C0619.m2761("ܳ᩻") ^ i21;
                        i4 = ((iM3169 ^ i22) * (-27589)) ^ 378458526;
                        i5 = 576548866;
                    } else {
                        iM3169 = (C0619.m2761("ܰۙ") + i22) * (-21);
                        i4 = ((iM3169 ^ i21) * 13757) ^ 398470382;
                        i5 = 1623370189;
                    }
                    int i414 = iM3169 ^ i5;
                    strM11770 = strM11770;
                    c2363 = c2363;
                    sArr5 = sArr8;
                    i24 = i414;
                    i23 = i4;
                    z = z;
                    sArr11 = sArr11;
                    i33 = i33;
                    sArr8 = sArr5;
                    int i317 = i3;
                    i35 = i35;
                    sArr10 = sArr10;
                    i34 = i317;
                    break;
                case 266399556:
                case 664577615:
                    sArr8 = sArr8;
                    if (iM33146 == (C0619.m2761(C17202.m40377(f1206, 245, 3, i25)) ^ 2097167979)) {
                        iM31613 = C0773.m3169("ܶۤ") ^ i22;
                        i17 = ((iM31613 ^ i21) * (-23363)) ^ (-652067807);
                        i18 = -613194395;
                    } else {
                        iM31613 = (i21 - C0773.m3169("۬۠")) * 67;
                        i17 = ((iM31613 ^ i22) * (-26055)) ^ (-1871908590);
                        i18 = 2071870974;
                    }
                    sArr7 = sArr8;
                    i24 = iM31613 ^ i18;
                    i23 = i17;
                    sArr8 = sArr7;
                    break;
                case 266893299:
                case 1267986768:
                    sArr3 = sArr8;
                    c2363 = c2363;
                    strM11770 = strM11770;
                    int i56 = i34;
                    sArr10 = sArr10;
                    i35 = i35;
                    i3 = i56;
                    activityC0848 = (ActivityC0848) AbstractC3624.m11768(this);
                    strM1441 = m1441();
                    bundleRequireArguments = requireArguments();
                    sArr11 = f1206;
                    i33 = 219;
                    if (C23916.m53419() == 0) {
                        iM31610 = (i21 - C0773.m3169("᩺۫")) * (-97);
                        i6 = ((iM31610 ^ i22) * 21349) ^ (-1749698621);
                        i10 = 1413589099;
                        i8 = iM31610 ^ i10;
                        sArr8 = sArr3;
                        i24 = i8;
                        i23 = i6;
                        strM11770 = strM11770;
                        c2363 = c2363;
                        int i415 = i3;
                        i35 = i35;
                        sArr10 = sArr10;
                        i34 = i415;
                    } else {
                        i9 = i35;
                        int iM27614 = (C0619.m2761("֡ۛ") + i21) * (-9);
                        i14 = ((iM27614 ^ i22) * 8613) ^ 518127279;
                        i15 = iM27614 ^ (-762679678);
                        sArr10 = sArr10;
                        i34 = i3;
                        i35 = i9;
                        i23 = i14;
                        sArr8 = sArr3;
                        i24 = i15;
                        strM11770 = strM11770;
                        c2363 = c2363;
                    }
                    break;
                case 307668452:
                case 1798987891:
                    c2363 = c2363;
                    strM11770 = strM11770;
                    sArr8 = sArr8;
                    iM31616 = C0773.m3169(C2310.m7803(f1206, 234, 3, i25));
                    i31 = 2130096412;
                    if (C0487.f2131 <= 0) {
                        iM31612 = C0773.m3169("ۚ᩷") ^ i22;
                        i12 = ((iM31612 ^ i21) * (-31503)) ^ (-919315001);
                        i16 = 2130236480;
                    } else {
                        iM31612 = (C0773.m3169("ܿۜ") ^ i22) * 101;
                        i12 = ((iM31612 ^ i21) * (-1765)) ^ (-368518291);
                        i16 = 298422770;
                    }
                    i13 = iM31612 ^ i16;
                    sArr8 = sArr8;
                    i24 = i13;
                    i23 = i12;
                    strM11770 = strM11770;
                    c2363 = c2363;
                    break;
                case 385929184:
                case 1031857273:
                    sArr3 = sArr8;
                    int i57 = i33;
                    c2363 = c2363;
                    strM11770 = strM11770;
                    short[] sArr18 = sArr11;
                    int i58 = i34;
                    sArr10 = sArr10;
                    i35 = i35;
                    i3 = i58;
                    z = true;
                    if (iM33146 == (C0619.m2761(strM1785) ^ 2129330184)) {
                        iM2761 = (C0619.m2761("ۘܶ") ^ i22) * (-125);
                        i6 = ((iM2761 ^ i21) * (-6933)) ^ 285222745;
                        i7 = -1975953053;
                    } else {
                        iM2761 = (C0619.m2761("֡ܶ") + i21) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i6 = ((iM2761 ^ i22) * (-13181)) ^ (-173560636);
                        i7 = -1351292885;
                    }
                    i8 = iM2761 ^ i7;
                    sArr11 = sArr18;
                    i33 = i57;
                    sArr8 = sArr3;
                    i24 = i8;
                    i23 = i6;
                    strM11770 = strM11770;
                    c2363 = c2363;
                    int i416 = i3;
                    i35 = i35;
                    sArr10 = sArr10;
                    i34 = i416;
                    break;
                case 632074952:
                case 1493879928:
                    c2362 = c2363;
                    onClickListener = onClickListener2;
                    i37 = iM31616 ^ i31;
                    sArr6 = f1206;
                    i28 = 3;
                    if (C0773.f2792 <= 0) {
                        i27 = 237;
                        int iM27615 = C0619.m2761("ۨۨ") ^ i22;
                        short[] sArr19 = sArr6;
                        i23 = ((iM27615 ^ i21) * (-29565)) ^ (-982840528);
                        i24 = iM27615 ^ (-794823682);
                        c2363 = c2362;
                        sArr7 = sArr19;
                        onClickListener2 = onClickListener;
                        sArr8 = sArr7;
                    } else {
                        int iM27616 = (C0619.m2761("᩸ۖ") ^ i21) * 19;
                        int i59 = ((iM27616 ^ i22) * 21619) ^ 337594716;
                        i24 = iM27616 ^ (-510123689);
                        onClickListener2 = onClickListener;
                        c2363 = c2362;
                        sArr8 = sArr6;
                        i23 = i59;
                        i27 = 237;
                    }
                    break;
                case 830429051:
                case 1020835012:
                    sArr8 = sArr8;
                    if (iM33146 == (C0619.m2761(C0269.m1785(f1206, 251, 3, i25)) ^ 2122460196)) {
                        iM31613 = C0619.m2761("ۗܿ") ^ i22;
                        i17 = ((iM31613 ^ i21) * 28433) ^ (-938833604);
                        i18 = -775505490;
                    } else {
                        iM31613 = C0619.m2761("֨֨") ^ i21;
                        i17 = ((iM31613 ^ i22) * (-15909)) ^ (-591691760);
                        i18 = -2074003768;
                    }
                    sArr7 = sArr8;
                    i24 = iM31613 ^ i18;
                    i23 = i17;
                    sArr8 = sArr7;
                    break;
                case 1074769655:
                case 1821149751:
                    i3 = i34;
                    i25 = 8705;
                    iM3169 = C0773.m3169("᩷ۙ") ^ i22;
                    i4 = ((iM3169 ^ i21) * (-28085)) ^ (-57646197);
                    i5 = 371999434;
                    int i417 = iM3169 ^ i5;
                    strM11770 = strM11770;
                    c2363 = c2363;
                    sArr5 = sArr8;
                    i24 = i417;
                    i23 = i4;
                    z = z;
                    sArr11 = sArr11;
                    i33 = i33;
                    sArr8 = sArr5;
                    int i318 = i3;
                    i35 = i35;
                    sArr10 = sArr10;
                    i34 = i318;
                    break;
                case 1110431919:
                case 1471500876:
                    this.f1208.m52816();
                    return z;
                case 1180596646:
                case 1694572071:
                    return super.onOptionsItemSelected(menuItem);
                case 1207012799:
                case 1602469528:
                    if (C0269.f1558 <= 0) {
                        sArr6 = sArr8;
                        c2362 = c2363;
                        onClickListener = onClickListener2;
                        int iM27617 = C0619.m2761("ۨۨ") ^ i22;
                        short[] sArr110 = sArr6;
                        i23 = ((iM27617 ^ i21) * (-29565)) ^ (-982840528);
                        i24 = iM27617 ^ (-794823682);
                        c2363 = c2362;
                        sArr7 = sArr110;
                        onClickListener2 = onClickListener;
                        sArr8 = sArr7;
                    } else {
                        iM31614 = (C0773.m3169("᩻ᩴ") ^ i21) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i19 = ((iM31614 ^ i22) * 18319) ^ (-1036733375);
                        i20 = 180280196;
                        i24 = iM31614 ^ i20;
                        i23 = i19;
                    }
                    break;
                case 1262994514:
                case 1576359114:
                    if (C1826.f6190 > 0) {
                        sArr8 = sArr8;
                        i = i34;
                        c2363 = c2363;
                        strM11770 = strM11770;
                        sArr = sArr10;
                        i2 = i35;
                        iM31611 = C0773.m3169("ᩳۢ") ^ i21;
                        sArr4 = sArr;
                        i12 = ((iM31611 ^ i22) * 1061) ^ 1768317782;
                        i11 = 631279661;
                        i13 = iM31611 ^ i11;
                        i35 = i2;
                        sArr10 = sArr4;
                        i34 = i;
                        sArr8 = sArr8;
                        i24 = i13;
                        i23 = i12;
                        strM11770 = strM11770;
                        c2363 = c2363;
                    } else {
                        sArr8 = sArr8;
                        i33 = i33;
                        sArr2 = sArr10;
                        i35 = i35;
                        sArr11 = sArr11;
                        z = z ? 1 : 0;
                        C2361 c2366 = c2363;
                        strM11770 = strM11770;
                        c2361 = c2366;
                        int iM27618 = (C0619.m2761("ᩳ֫") ^ i22) * (-17);
                        i35 = i35;
                        sArr10 = sArr2;
                        i23 = ((iM27618 ^ i21) * (-10575)) ^ (-235893820);
                        short[] sArr111 = sArr8;
                        i24 = iM27618 ^ 22999185;
                        z = z;
                        sArr11 = sArr11;
                        i33 = i33;
                        sArr8 = sArr111;
                        String str5 = strM11770;
                        c2363 = c2361;
                        strM11770 = str5;
                    }
                    break;
                case 1524941916:
                case 1821412682:
                    sArr8 = sArr8;
                    if (iM33146 == (C0773.m3169(C2419.m8166(f1206, 257, 3, i25)) ^ 2127684641)) {
                        iM31613 = (C0773.m3169("֡ܿ") + i22) * 123;
                        i17 = ((iM31613 ^ i21) * (-5311)) ^ 402312577;
                        i18 = -2078020109;
                    } else {
                        iM31613 = C0619.m2761("۬᩸") ^ i22;
                        i17 = ((iM31613 ^ i21) * 18041) ^ 1265369391;
                        i18 = 1354633700;
                    }
                    sArr7 = sArr8;
                    i24 = iM31613 ^ i18;
                    i23 = i17;
                    sArr8 = sArr7;
                    break;
                case 1741977433:
                case 2073776005:
                    if (C4282.f15546 <= 0) {
                        sArr8 = sArr8;
                        c2363 = c2363;
                        strM11770 = strM11770;
                        iM31612 = C0773.m3169("ۚ᩷") ^ i22;
                        i12 = ((iM31612 ^ i21) * (-31503)) ^ (-919315001);
                        i16 = 2130236480;
                        i13 = iM31612 ^ i16;
                        sArr8 = sArr8;
                        i24 = i13;
                        i23 = i12;
                        strM11770 = strM11770;
                        c2363 = c2363;
                    } else {
                        sArr8 = sArr8;
                        i33 = i33;
                        sArr2 = sArr10;
                        i35 = i35;
                        sArr11 = sArr11;
                        z = z ? 1 : 0;
                        C2361 c2367 = c2363;
                        strM11770 = strM11770;
                        c2361 = c2367;
                        int iM27619 = (C0619.m2761("ᩳ֫") ^ i22) * (-17);
                        i35 = i35;
                        sArr10 = sArr2;
                        i23 = ((iM27619 ^ i21) * (-10575)) ^ (-235893820);
                        short[] sArr112 = sArr8;
                        i24 = iM27619 ^ 22999185;
                        z = z;
                        sArr11 = sArr11;
                        i33 = i33;
                        sArr8 = sArr112;
                        String str6 = strM11770;
                        c2363 = c2361;
                        strM11770 = str6;
                    }
                    break;
                default:
                    mo24175((ActivityC0848) AbstractC0116.m1234(this));
                    return z;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m1401(C0168 c0168, int i, int i2) {
        C4621 c4621 = null;
        int i3 = 660952531;
        int i4 = C2354.f7599;
        int i5 = C2834.f9334;
        int iM2761 = (C0619.m2761("᩵ܽ") + i5) * (-77);
        int i6 = ((iM2761 ^ i4) * 32213) ^ (-60239615);
        int i7 = 142589912;
        while (true) {
            i3 = ((((i3 ^ i4) * (-25603)) >> 31) & i6) ^ (iM2761 ^ i7);
            switch (i3) {
                case -2142169902:
                case -998025305:
                    if (C2485.m8357() <= 0) {
                        iM2761 = C0619.m2761("ܽۖ") ^ i4;
                        i6 = ((iM2761 ^ i5) * 11627) ^ (-1760969205);
                        i7 = 1980268485;
                    } else {
                        iM2761 = (C0773.m3169("ۨ᩷") ^ i5) * (-123);
                        i6 = ((iM2761 ^ i4) * 11549) ^ 184832043;
                        i7 = 791474261;
                    }
                    break;
                case -1986319542:
                case -1395427403:
                    if (C2288.f7433 <= 0) {
                        iM2761 = C0619.m2761("ܽۖ") ^ i4;
                        i6 = ((iM2761 ^ i5) * 11627) ^ (-1760969205);
                        i7 = 1980268485;
                    } else {
                        iM2761 = C0619.m2761("ܺ᩸") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-21179)) ^ (-1621389797);
                        i7 = 1940329881;
                    }
                    break;
                case -1713221227:
                case -81019765:
                    if (C13473.f42873 != 0) {
                        iM2761 = C0619.m2761("ۘᩳ") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-27075)) ^ 561976334;
                        i7 = 1917567555;
                    } else {
                        iM2761 = (C0619.m2761("֨۫") + i5) * 119;
                        i6 = ((iM2761 ^ i4) * 30815) ^ (-1352908700);
                        i7 = 1375934367;
                    }
                    break;
                case -1581791197:
                case 970360137:
                    if (C2419.f7754 >= 0) {
                        iM2761 = C0619.m2761("ۘᩳ") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-27075)) ^ 561976334;
                        i7 = 1917567555;
                    } else {
                        iM2761 = C0773.m3169("᩹ۡ") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-745)) ^ (-907503219);
                        i7 = 1423992255;
                    }
                    break;
                case -1487975564:
                case 2104810915:
                    if (C4238.f15451 >= 0) {
                        iM2761 = C0619.m2761("ܺܽ") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-16069)) ^ (-271783607);
                        i7 = 1511927329;
                    } else {
                        iM2761 = C0619.m2761("᩵᩹") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-9451)) ^ 506185648;
                        i7 = -1300240287;
                    }
                    break;
                case -1195000614:
                case -473438601:
                    if (C2485.m8357() <= 0) {
                        iM2761 = (C0619.m2761("ۨۚ") ^ i4) * 101;
                        i6 = ((iM2761 ^ i5) * (-22777)) ^ (-1532152268);
                        i7 = 615060249;
                    } else {
                        iM2761 = C0619.m2761("֨ۧ") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-2227)) ^ 2009212900;
                        i7 = 842915404;
                    }
                    break;
                case -1145460406:
                case 358055090:
                    C0269.m1775();
                    if (C11235.f35427 >= 0) {
                        iM2761 = C0619.m2761("ۘᩳ") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-27075)) ^ 561976334;
                        i7 = 1917567555;
                    } else {
                        iM2761 = C0619.m2761("۠ۗ") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-28881)) ^ (-1960628938);
                        i7 = -1799890113;
                    }
                    break;
                case -924361970:
                case 2045514970:
                    c4621 = c0168.f1213;
                    if (c4621 != null) {
                        iM2761 = C0773.m3169("֨ܶ") ^ i5;
                        i6 = ((iM2761 ^ i4) * 24809) ^ 634903939;
                        i7 = -1588397328;
                    } else {
                        iM2761 = (C0619.m2761("ۧ۠") + i4) * (-123);
                        i6 = ((iM2761 ^ i5) * 18909) ^ (-870178126);
                        i7 = 1454197969;
                    }
                    break;
                case -761447245:
                case 294307281:
                    if (C2834.f9334 <= 0) {
                        iM2761 = C0619.m2761("ܺܽ") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-16069)) ^ (-271783607);
                        i7 = 1511927329;
                    } else {
                        iM2761 = C0619.m2761("ۘᩳ") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-27075)) ^ 561976334;
                        i7 = 1917567555;
                    }
                    break;
                case -599638361:
                case -136575140:
                    break;
                case -560999778:
                case 1544412778:
                    if (C2288.m7767()) {
                        iM2761 = (C0619.m2761("ۨۚ") ^ i4) * 101;
                        i6 = ((iM2761 ^ i5) * (-22777)) ^ (-1532152268);
                        i7 = 615060249;
                    } else {
                        iM2761 = (i5 - C0619.m2761("ܺ۟")) * 29;
                        i6 = ((iM2761 ^ i4) * (-30201)) ^ (-2137220490);
                        i7 = -1018762347;
                    }
                    break;
                case -429354644:
                case -96686092:
                    if (AbstractC3624.f12429 > 0) {
                        iM2761 = (C0619.m2761("ۨۚ") ^ i4) * 101;
                        i6 = ((iM2761 ^ i5) * (-22777)) ^ (-1532152268);
                        i7 = 615060249;
                    } else {
                        iM2761 = C0619.m2761("ۘᩳ") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-27075)) ^ 561976334;
                        i7 = 1917567555;
                    }
                    break;
                case -300156498:
                case 1269051731:
                    c4621.mo14425(i, i2, c0168);
                    iM2761 = (C0619.m2761("ۧ۠") + i4) * (-123);
                    i6 = ((iM2761 ^ i5) * 18909) ^ (-870178126);
                    i7 = 1454197969;
                    break;
                case 81201496:
                case 1042704375:
                    C17202.m40372();
                    break;
                case 217554217:
                case 1023580424:
                    C0269.m1775();
                    iM2761 = C0619.m2761("۠ۗ") ^ i4;
                    i6 = ((iM2761 ^ i5) * (-28881)) ^ (-1960628938);
                    i7 = -1799890113;
                    break;
                case 572305237:
                case 626888785:
                    if (C2966.f9654 >= 0) {
                        iM2761 = C0619.m2761("ܽۖ") ^ i4;
                        i6 = ((iM2761 ^ i5) * 11627) ^ (-1760969205);
                        i7 = 1980268485;
                    } else {
                        iM2761 = C0619.m2761("۬ۖ") ^ i5;
                        i6 = ((iM2761 ^ i4) * 22603) ^ 403172282;
                        i7 = -1849247196;
                    }
                    break;
                case 947493642:
                case 1428841493:
                    if (C3998.f13671 != 0) {
                        iM2761 = C0619.m2761("ܺܽ") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-16069)) ^ (-271783607);
                        i7 = 1511927329;
                    } else {
                        iM2761 = C0619.m2761("᩹᩻") ^ i4;
                        i6 = ((iM2761 ^ i5) * 25081) ^ (-828403400);
                        i7 = 836013713;
                    }
                    break;
                default:
                    if (AbstractC0116.f1064 <= 0) {
                        iM2761 = C0619.m2761("۠ۗ") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-28881)) ^ (-1960628938);
                        i7 = -1799890113;
                    } else {
                        iM2761 = (C0619.m2761("ۧ֡") ^ i4) * (-97);
                        i6 = ((iM2761 ^ i5) * 31905) ^ 2121325240;
                        i7 = -760071261;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:84:0x0325 A[PHI: r2 r16 r20 r25 r26
      0x0325: PHI (r2v11 boolean) = (r2v2 boolean), (r2v2 boolean), (r2v12 boolean) binds: [B:83:0x0323, B:71:0x0290, B:13:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x0325: PHI (r16v7 short[]) = (r16v4 short[]), (r16v3 short[]), (r16v3 short[]) binds: [B:83:0x0323, B:71:0x0290, B:13:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x0325: PHI (r20v7 int) = (r20v3 int), (r20v4 int), (r20v3 int) binds: [B:83:0x0323, B:71:0x0290, B:13:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x0325: PHI (r25v8 int) = (r25v4 int), (r25v5 int), (r25v4 int) binds: [B:83:0x0323, B:71:0x0290, B:13:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x0325: PHI (r26v6 int) = (r26v2 int), (r26v3 int), (r26v2 int) binds: [B:83:0x0323, B:71:0x0290, B:13:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0062, code lost:
    
        if (l.C2375.f7641 <= 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x005d, code lost:
    
        if (l.C2287.f7432 >= 0) goto L11;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m1402(l.C0168 r29, android.view.View r30) {
        /*
            Method dump skipped, instruction units count: 1026
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C0168.m1402(l.֡ۘۧ, android.view.View):void");
    }

    @Override // l.AbstractC9051
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C24132 mo1442() {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        short s2 = 0;
        int i3 = 0;
        int i4 = 1857871844;
        int i5 = C1783.f6087;
        int i6 = C1564.f5401;
        int iM3169 = C0773.m3169("᩹ۜ") ^ i5;
        int i7 = ((iM3169 ^ i6) * (-20877)) ^ 692265664;
        int i8 = 1674022543;
        while (true) {
            i4 = ((((i4 ^ i6) * (-3113)) >> 31) & i7) ^ (iM3169 ^ i8);
            switch (i4) {
                case -2074552536:
                case -702410543:
                    i3 = 305;
                    iM3169 = C0619.m2761("ۜ֡") ^ i5;
                    i7 = ((iM3169 ^ i6) * 18481) ^ (-1081354393);
                    i8 = -1218391149;
                    break;
                case -2053845277:
                case -975377364:
                    i = s * 2;
                    if (C23916.f77426 <= 0) {
                        iM3169 = (C0619.m2761("᩸ܽ") + i6) * (-71);
                        i7 = ((iM3169 ^ i5) * (-29045)) ^ 329695076;
                        i8 = -916889620;
                    } else {
                        iM3169 = C0619.m2761("۫᩸") ^ i5;
                        i7 = ((iM3169 ^ i6) * 28897) ^ 1412550326;
                        i8 = 644504282;
                    }
                    break;
                case -2052254460:
                case -1549783175:
                    if (this.f1228) {
                        iM3169 = (C0773.m3169("ᩳۖ") ^ i6) * (-113);
                        i7 = ((iM3169 ^ i5) * 1285) ^ 514763894;
                        i8 = 356250939;
                    } else {
                        iM3169 = (C0773.m3169("ᩳ۬") + i5) * (-93);
                        i7 = ((iM3169 ^ i6) * (-31143)) ^ 82766357;
                        i8 = -2023027236;
                    }
                    break;
                case -2031076554:
                case 2113252118:
                    if (!C0619.m2763()) {
                        iM3169 = C0619.m2761("ۤܺ") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-23287)) ^ 2134118580;
                        i8 = 155475286;
                    } else {
                        iM3169 = C0773.m3169("᩷֡") ^ i5;
                        i7 = ((iM3169 ^ i6) * 31125) ^ 1302706664;
                        i8 = 1785155969;
                    }
                    break;
                case -1984307471:
                case 1629867756:
                    C11235.m28309();
                    C1343.m4943();
                    return null;
                case -1905357188:
                case 71509059:
                    c = 390;
                    if (C2375.m8065() <= 0) {
                        iM3169 = C0619.m2761("ۤܺ") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-23287)) ^ 2134118580;
                        i8 = 155475286;
                    } else {
                        iM3169 = (C0773.m3169("ܰۙ") ^ i5) * 7;
                        i7 = ((iM3169 ^ i6) * (-26677)) ^ (-1950149492);
                        i8 = -299760988;
                    }
                    break;
                case -1901974255:
                case 2046296010:
                    return null;
                case -1695989527:
                case 1131473014:
                    C4282.m13644();
                    if (C2834.f9334 <= 0) {
                        iM3169 = C0773.m3169("᩷֡") ^ i5;
                        i7 = ((iM3169 ^ i6) * 31125) ^ 1302706664;
                        i8 = 1785155969;
                    } else {
                        iM3169 = C0619.m2761("ܺܺ") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-19491)) ^ 1009665612;
                        i8 = -215033854;
                    }
                    break;
                case -1353444330:
                case 107937892:
                    short[] sArr2 = f1206;
                    if (C2288.f7433 > 0) {
                        if (!RunnableC1848.f6235) {
                            throw new IllegalStateException(C2023.m6966(sArr2, 391, 29, i3));
                        }
                        iM3169 = C0619.m2761("ۤܺ") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-23287)) ^ 2134118580;
                        i8 = 155475286;
                    } else {
                        iM3169 = (C0619.m2761("᩸ܽ") + i6) * (-71);
                        i7 = ((iM3169 ^ i5) * (-29045)) ^ 329695076;
                        i8 = -916889620;
                    }
                    break;
                case -920162123:
                case -769525142:
                    if (C3998.f13671 != 0) {
                        iM3169 = (C0773.m3169("֡ۡ") ^ i6) * 43;
                        i7 = ((iM3169 ^ i5) * 23607) ^ 697404193;
                        i8 = -358706073;
                    } else {
                        iM3169 = (C0773.m3169("ܶ۬") + i5) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i7 = ((iM3169 ^ i6) * 8803) ^ 2076536172;
                        i8 = 645291499;
                    }
                    break;
                case -678630145:
                case 464225656:
                    int i9 = s + s2;
                    if ((i9 * i9) - i2 < 0) {
                        iM3169 = C0773.m3169("ۛ᩺") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-9929)) ^ 1549303884;
                        i8 = -1646046336;
                    } else {
                        iM3169 = (C0773.m3169("۠֡") + i6) * (-23);
                        i7 = ((iM3169 ^ i5) * 11235) ^ 2145841951;
                        i8 = 2015348412;
                    }
                    break;
                case -673721207:
                case 100396851:
                    i3 = 56608;
                    iM3169 = C0619.m2761("ۜ֡") ^ i5;
                    i7 = ((iM3169 ^ i6) * 18481) ^ (-1081354393);
                    i8 = -1218391149;
                    break;
                case -380775363:
                case 2008892671:
                    s = sArr[c];
                    if (C2375.f7641 <= 0) {
                        iM3169 = (C0619.m2761("᩸ܽ") + i6) * (-71);
                        i7 = ((iM3169 ^ i5) * (-29045)) ^ 329695076;
                        i8 = -916889620;
                    } else {
                        iM3169 = C0773.m3169("ܺ֨") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-17101)) ^ (-1434302946);
                        i8 = -1085544399;
                    }
                    break;
                case -244263253:
                case 187566883:
                    return this.f1217;
                case -194050539:
                case 1817711000:
                    if (this.f1207 == 0) {
                        iM3169 = (C0773.m3169("ۙܳ") ^ i5) * 51;
                        i7 = ((iM3169 ^ i6) * 14681) ^ (-706783422);
                        i8 = 1305642208;
                    } else {
                        iM3169 = C0619.m2761("ܰ᩵") ^ i6;
                        i7 = ((iM3169 ^ i5) * 25133) ^ (-1261975182);
                        i8 = -708637472;
                    }
                    break;
                case -44802016:
                case 2089616711:
                    if (this.f1226) {
                        iM3169 = C0619.m2761("ܰ᩵") ^ i6;
                        i7 = ((iM3169 ^ i5) * 25133) ^ (-1261975182);
                        i8 = -708637472;
                    } else {
                        iM3169 = (C0773.m3169("᩷ۘ") ^ i6) * 91;
                        i7 = ((iM3169 ^ i5) * 10069) ^ 1371060029;
                        i8 = 1720111635;
                    }
                    break;
                case 542114429:
                case 742040942:
                    C3033.m9845();
                    C1519.m5403();
                    iM3169 = C0619.m2761("ܺܺ") ^ i6;
                    i7 = ((iM3169 ^ i5) * (-19491)) ^ 1009665612;
                    i8 = -215033854;
                    break;
                case 566999894:
                case 1235984807:
                    if (C3033.f9831 >= 0) {
                        iM3169 = C0773.m3169("᩷֡") ^ i5;
                        i7 = ((iM3169 ^ i6) * 31125) ^ 1302706664;
                        i8 = 1785155969;
                    } else {
                        iM3169 = (C0773.m3169("ۤ᩸") + i6) * (-77);
                        i7 = ((iM3169 ^ i5) * 18105) ^ (-553827772);
                        i8 = -1369020071;
                    }
                    break;
                case 703651066:
                case 1579723720:
                    sArr = f1206;
                    if (AbstractC0116.f1064 <= 0) {
                        iM3169 = C0619.m2761("ۤܺ") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-23287)) ^ 2134118580;
                        i8 = 155475286;
                    } else {
                        iM3169 = C0619.m2761("᩷ۨ") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-16649)) ^ 1743202963;
                        i8 = -1464524664;
                    }
                    break;
                case 933465172:
                case 961372010:
                    if (C2834.m9344() < 0) {
                        iM3169 = (C0773.m3169("֡ۡ") ^ i6) * 43;
                        i7 = ((iM3169 ^ i5) * 23607) ^ 697404193;
                        i8 = -358706073;
                    } else {
                        iM3169 = C0773.m3169("᩷֡") ^ i5;
                        i7 = ((iM3169 ^ i6) * 31125) ^ 1302706664;
                        i8 = 1785155969;
                    }
                    break;
                case 1818149825:
                case 2082047711:
                    i2 = i + 1;
                    if (C2288.m7767()) {
                        iM3169 = (C0773.m3169("֡ۡ") ^ i6) * 43;
                        i7 = ((iM3169 ^ i5) * 23607) ^ 697404193;
                        i8 = -358706073;
                    } else {
                        iM3169 = C0619.m2761("ۨ᩵") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-863)) ^ (-1689746294);
                        i8 = -423796197;
                    }
                    break;
                default:
                    s2 = 1;
                    if (C3734.f12817 >= 0) {
                        iM3169 = C0619.m2761("ۤܺ") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-23287)) ^ 2134118580;
                        i8 = 155475286;
                    } else {
                        iM3169 = (i5 - C0773.m3169("᩶᩻")) * 65;
                        i7 = ((iM3169 ^ i6) * (-14705)) ^ 62700505;
                        i8 = 33229710;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:48:0x0178 A[PHI: r4 r15
      0x0178: PHI (r4v4 boolean) = (r4v3 boolean), (r4v2 boolean), (r4v2 boolean), (r4v2 boolean) binds: [B:47:0x0176, B:35:0x0112, B:18:0x0089, B:15:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x0178: PHI (r15v4 int) = (r15v2 int), (r15v3 int), (r15v2 int), (r15v2 int) binds: [B:47:0x0176, B:35:0x0112, B:18:0x0089, B:15:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:79:0x02df A[PHI: r9 r10 r12
      0x02df: PHI (r9v4 short) = (r9v2 short), (r9v3 short), (r9v2 short) binds: [B:78:0x02dd, B:70:0x028f, B:62:0x0231] A[DONT_GENERATE, DONT_INLINE]
      0x02df: PHI (r10v4 int) = (r10v2 int), (r10v3 int), (r10v2 int) binds: [B:78:0x02dd, B:70:0x028f, B:62:0x0231] A[DONT_GENERATE, DONT_INLINE]
      0x02df: PHI (r12v3 short) = (r12v2 short), (r12v2 short), (r12v4 short) binds: [B:78:0x02dd, B:70:0x028f, B:62:0x0231] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0062, code lost:
    
        if (l.C4238.f15451 >= 0) goto L17;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m1438(java.util.List r22, boolean r23) {
        /*
            Method dump skipped, instruction units count: 964
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C0168.m1438(java.util.List, boolean):boolean");
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:71:0x0281 A[PHI: r1 r2 r3
      0x0281: PHI (r1v2 l.ܿ᩹ۧ) = (r1v1 l.ܿ᩹ۧ), (r1v1 l.ܿ᩹ۧ), (r1v4 l.ܿ᩹ۧ) binds: [B:70:0x027f, B:50:0x01b8, B:38:0x0136] A[DONT_GENERATE, DONT_INLINE]
      0x0281: PHI (r2v2 int) = (r2v1 int), (r2v1 int), (r2v3 int) binds: [B:70:0x027f, B:50:0x01b8, B:38:0x0136] A[DONT_GENERATE, DONT_INLINE]
      0x0281: PHI (r3v2 int) = (r3v1 int), (r3v1 int), (r3v3 int) binds: [B:70:0x027f, B:50:0x01b8, B:38:0x0136] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:79:0x02e3  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m1404(C0168 c0168, Exception exc, ActivityC0848 activityC0848) {
        int iM2761;
        int i;
        int i2;
        C18636 c18636 = null;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        C15301 c15301M36736 = null;
        String strM43392 = null;
        int i7 = -2055528917;
        int i8 = C2310.f7472;
        int i9 = C3734.f12817;
        int iM3169 = C0773.m3169("ۜ۬") ^ i8;
        int i10 = ((iM3169 ^ i9) * (-28485)) ^ (-1152917999);
        int i11 = iM3169 ^ (-1989048895);
        while (true) {
            i7 = ((((i7 ^ i9) * 28107) >> 31) & i10) ^ i11;
            switch (i7) {
                case -2024957299:
                case 307620410:
                    if (C1146.f4234 >= 0) {
                        iM2761 = (i8 - C0773.m3169("ܽۜ")) * 15;
                        i = ((iM2761 ^ i9) * (-30199)) ^ 481655340;
                        i2 = -1142044583;
                    } else {
                        iM2761 = (C0619.m2761("ۜ֡") + i9) * (-105);
                        i = ((iM2761 ^ i8) * 11591) ^ 280631385;
                        i2 = -611652718;
                    }
                    i11 = iM2761 ^ i2;
                    i10 = i;
                    break;
                case -1823135421:
                case -786785460:
                    if (C1542.m5459() < 0) {
                        iM2761 = C0773.m3169("֡ۚ") ^ i8;
                        i = ((iM2761 ^ i9) * 30597) ^ 2119915065;
                        i2 = -494111534;
                        i11 = iM2761 ^ i2;
                        i10 = i;
                    }
                    iM2761 = (i8 - C0619.m2761("֨ۘ")) * 109;
                    i = ((iM2761 ^ i9) * (-6517)) ^ 527605312;
                    i2 = 1532417961;
                    i11 = iM2761 ^ i2;
                    i10 = i;
                    break;
                case -1759704923:
                case -1687145434:
                    if (C1826.f6190 <= 0) {
                        iM2761 = (i8 - C0619.m2761("֨ۘ")) * 109;
                        i = ((iM2761 ^ i9) * (-6517)) ^ 527605312;
                        i2 = 1532417961;
                    } else {
                        iM2761 = C0619.m2761("᩹ۧ") ^ i8;
                        i = ((iM2761 ^ i9) * 13087) ^ 1943390693;
                        i2 = 1367124570;
                    }
                    i11 = iM2761 ^ i2;
                    i10 = i;
                    break;
                case -1707434829:
                case 1843000302:
                    c18636 = (C18636) exc;
                    i3 = c18636.f60596;
                    i4 = c18636.f60595;
                    if (C1564.f5401 <= 0) {
                        iM2761 = (i8 - C0773.m3169("ܽۜ")) * 15;
                        i = ((iM2761 ^ i9) * (-30199)) ^ 481655340;
                        i2 = -1142044583;
                    } else {
                        iM2761 = C0619.m2761("ܽۨ") ^ i8;
                        i = ((iM2761 ^ i9) * 9543) ^ 186396620;
                        i2 = -2033750418;
                    }
                    i11 = iM2761 ^ i2;
                    i10 = i;
                    break;
                case -1705562819:
                case -614875175:
                    if (C2485.m8357() <= 0) {
                        iM2761 = (C0619.m2761("֫۫") + i9) * (-121);
                        i = ((iM2761 ^ i8) * (-5331)) ^ 1575628041;
                        i2 = -16782805;
                    } else {
                        iM2761 = (C0619.m2761("᩻ۤ") + i8) * 85;
                        i = ((iM2761 ^ i9) * (-1971)) ^ (-1452521005);
                        i2 = 763853781;
                    }
                    i11 = iM2761 ^ i2;
                    i10 = i;
                    break;
                case -1582672153:
                case 1853519523:
                    c15301M36736 = C15301.m36736(i5, i6);
                    strM43392 = c0168.m1441();
                    iM2761 = C0773.m3169("ۖۛ") ^ i9;
                    i = ((iM2761 ^ i8) * 7423) ^ 565061018;
                    i2 = -1704708588;
                    i11 = iM2761 ^ i2;
                    i10 = i;
                    break;
                case -1567732332:
                case 4932672:
                    if (exc instanceof C18636) {
                        iM2761 = (C0619.m2761("᩻ܰ") ^ i9) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i = ((iM2761 ^ i8) * 25841) ^ 1642925864;
                        i2 = 1338252146;
                    } else {
                        iM2761 = C0619.m2761("᩷ۗ") ^ i8;
                        i = ((iM2761 ^ i9) * (-14829)) ^ 336473252;
                        i2 = 1874416848;
                    }
                    i11 = iM2761 ^ i2;
                    i10 = i;
                    break;
                case -1563425748:
                case 1465002473:
                    c15301M36736 = null;
                    strM43392 = null;
                    iM2761 = C0773.m3169("ۖۛ") ^ i9;
                    i = ((iM2761 ^ i8) * 7423) ^ 565061018;
                    i2 = -1704708588;
                    i11 = iM2761 ^ i2;
                    i10 = i;
                    break;
                case -1501765978:
                case 33678071:
                    if (C1783.f6087 <= 0) {
                        iM2761 = C0773.m3169("֡ۚ") ^ i8;
                        i = ((iM2761 ^ i9) * 30597) ^ 2119915065;
                        i2 = -494111534;
                    } else {
                        iM2761 = (C0619.m2761("ۤ᩹") + i8) * (-23);
                        i = ((iM2761 ^ i9) * 2875) ^ (-1984085351);
                        i2 = 1530676259;
                    }
                    i11 = iM2761 ^ i2;
                    i10 = i;
                    break;
                case -1448143882:
                case 884918994:
                    if (C3734.f12817 < 0) {
                        iM2761 = (C0619.m2761("֫۫") + i9) * (-121);
                        i = ((iM2761 ^ i8) * (-5331)) ^ 1575628041;
                        i2 = -16782805;
                        i11 = iM2761 ^ i2;
                        i10 = i;
                    }
                    iM2761 = (i8 - C0619.m2761("֨ۘ")) * 109;
                    i = ((iM2761 ^ i9) * (-6517)) ^ 527605312;
                    i2 = 1532417961;
                    i11 = iM2761 ^ i2;
                    i10 = i;
                    break;
                case -1431912643:
                case 1517128210:
                    break;
                case -1269860444:
                case 653912147:
                    C4511 c4511 = (C4511) exc;
                    int i12 = c4511.f16093;
                    int i13 = c4511.f16098;
                    if (AbstractC0641.m2813() <= 0) {
                        i6 = i13;
                        i5 = i12;
                        iM2761 = (i8 - C0619.m2761("֨ۘ")) * 109;
                        i = ((iM2761 ^ i9) * (-6517)) ^ 527605312;
                        i2 = 1532417961;
                        i11 = iM2761 ^ i2;
                        i10 = i;
                    } else {
                        int iM2762 = (C0619.m2761("ۚۢ") + i8) * (-33);
                        i11 = iM2762 ^ (-1025895464);
                        i10 = ((iM2762 ^ i9) * (-23497)) ^ (-213257842);
                        i6 = i13;
                        i5 = i12;
                    }
                    break;
                case -1262545367:
                case 259269224:
                    if (c15301M36736 != null) {
                        iM2761 = (C0619.m2761("ۡᩳ") ^ i9) * (-17);
                        i = ((iM2761 ^ i8) * (-8747)) ^ (-902612785);
                        i2 = 1182676821;
                    } else {
                        iM2761 = (i8 - C0619.m2761("ۚ᩻")) * (-29);
                        i = ((iM2761 ^ i9) * 19273) ^ (-66745418);
                        i2 = -436056966;
                    }
                    i11 = iM2761 ^ i2;
                    i10 = i;
                    break;
                case -1182243639:
                case -363598451:
                    if (exc instanceof C4511) {
                        iM2761 = (C0619.m2761("᩺᩹") + i9) * (-69);
                        i = ((iM2761 ^ i8) * (-12135)) ^ (-1494696578);
                        i2 = 1708956556;
                    } else {
                        iM2761 = C0773.m3169("۫۬") ^ i9;
                        i = ((iM2761 ^ i8) * 22585) ^ 1585570172;
                        i2 = 935335924;
                    }
                    i11 = iM2761 ^ i2;
                    i10 = i;
                    break;
                case -929239661:
                case 1603533072:
                    if (strM43392 != null) {
                        iM2761 = (C0773.m3169("᩸ܺ") + i8) * 19;
                        i = ((iM2761 ^ i9) * (-31047)) ^ (-2014033211);
                        i2 = -1638164988;
                    } else {
                        iM2761 = (i8 - C0619.m2761("ۚ᩻")) * (-29);
                        i = ((iM2761 ^ i9) * 19273) ^ (-66745418);
                        i2 = -436056966;
                    }
                    i11 = iM2761 ^ i2;
                    i10 = i;
                    break;
                case -721173886:
                case 504283142:
                    if (C1321.f4751 >= 0) {
                        iM2761 = (C0619.m2761("֫۫") + i9) * (-121);
                        i = ((iM2761 ^ i8) * (-5331)) ^ 1575628041;
                        i2 = -16782805;
                    } else {
                        iM2761 = C0773.m3169("ۤܽ") ^ i8;
                        i = ((iM2761 ^ i9) * (-16347)) ^ (-2142846295);
                        i2 = -1808847343;
                    }
                    i11 = iM2761 ^ i2;
                    i10 = i;
                    break;
                case -694945315:
                case 1358267004:
                    c15301M36736 = C15301.m36736(i3, i4);
                    strM43392 = c18636.m43392();
                    iM2761 = C0773.m3169("ۖۛ") ^ i9;
                    i = ((iM2761 ^ i8) * 7423) ^ 565061018;
                    i2 = -1704708588;
                    i11 = iM2761 ^ i2;
                    i10 = i;
                    break;
                case -272343547:
                case 1109260689:
                    if (C13473.m33144()) {
                        iM2761 = C0773.m3169("ۢ۟") ^ i9;
                        i = ((iM2761 ^ i8) * 23697) ^ (-471781764);
                        i2 = 862768162;
                    } else {
                        iM2761 = (i8 - C0773.m3169("ܽۜ")) * 15;
                        i = ((iM2761 ^ i9) * (-30199)) ^ 481655340;
                        i2 = -1142044583;
                    }
                    i11 = iM2761 ^ i2;
                    i10 = i;
                    break;
                case -123752247:
                case 1598248200:
                    if (C2287.f7432 >= 0) {
                        iM2761 = C0619.m2761("ܳۜ") ^ i9;
                        i = ((iM2761 ^ i8) * 14575) ^ 1727384712;
                        i2 = 105185779;
                    } else {
                        iM2761 = (C0619.m2761("ᩴܰ") + i9) * 29;
                        i = ((iM2761 ^ i8) * 9943) ^ 1552100908;
                        i2 = 910615107;
                    }
                    i11 = iM2761 ^ i2;
                    i10 = i;
                    break;
                case 337621336:
                case 1750570460:
                    C2419.m8174();
                    break;
                case 842524063:
                case 887844187:
                    if (RunnableC1848.f6235) {
                        iM2761 = C0619.m2761("ܳۜ") ^ i9;
                        i = ((iM2761 ^ i8) * 14575) ^ 1727384712;
                        i2 = 105185779;
                    } else {
                        iM2761 = C0619.m2761("۫ۤ") ^ i9;
                        i = ((iM2761 ^ i8) * (-17921)) ^ 1719037380;
                        i2 = 241182662;
                    }
                    i11 = iM2761 ^ i2;
                    i10 = i;
                    break;
                case 923588063:
                case 1503186116:
                    if (C3998.m12920()) {
                        iM2761 = C0619.m2761("ܳۜ") ^ i9;
                        i = ((iM2761 ^ i8) * 14575) ^ 1727384712;
                        i2 = 105185779;
                        i11 = iM2761 ^ i2;
                        i10 = i;
                    }
                    iM2761 = (i8 - C0619.m2761("֨ۘ")) * 109;
                    i = ((iM2761 ^ i9) * (-6517)) ^ 527605312;
                    i2 = 1532417961;
                    i11 = iM2761 ^ i2;
                    i10 = i;
                    break;
                case 1474186808:
                case 2075119877:
                    c15301M36736.f50017 = false;
                    c0168.f1226 = false;
                    activityC0848.m3431(strM43392, c15301M36736);
                    iM2761 = (i8 - C0619.m2761("ۚ᩻")) * (-29);
                    i = ((iM2761 ^ i9) * 19273) ^ (-66745418);
                    i2 = -436056966;
                    i11 = iM2761 ^ i2;
                    i10 = i;
                    break;
                default:
                    C13473.m33144();
                    C3690.m11987();
                    iM2761 = (i8 - C0619.m2761("֨ۘ")) * 109;
                    i = ((iM2761 ^ i9) * (-6517)) ^ 527605312;
                    i2 = 1532417961;
                    i11 = iM2761 ^ i2;
                    i10 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0090, code lost:
    
        if (l.RunnableC3646.m11813() != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0092, code lost:
    
        r27 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0075, code lost:
    
        if (l.C1826.m6301() < 0) goto L10;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m1403(final l.C0168 r30, final java.lang.Exception r31) {
        /*
            Method dump skipped, instruction units count: 1216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C0168.m1403(l.֡ۘۧ, java.lang.Exception):void");
    }

    @Override // l.AbstractC9051, l.ComponentCallbacksC11612
    public final void onResume() {
        ActivityC3409 activityC3409M1234 = null;
        ActivityC0848 activityC0848 = null;
        CharSequence charSequence = null;
        C23582 c23582 = null;
        int i = -1011043453;
        int i2 = C3099.f10023;
        int i3 = C11235.f35427;
        int iM3169 = C0773.m3169("ܽۗ") ^ i3;
        int i4 = ((iM3169 ^ i2) * (-11283)) ^ (-1398443049);
        int i5 = -144243213;
        while (true) {
            i = ((((i ^ i2) * (-23665)) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2022331861:
                case -851210172:
                    if (C3099.f10023 <= 0) {
                        iM3169 = C0773.m3169("᩸᩸") ^ i3;
                        i4 = ((iM3169 ^ i2) * 21567) ^ 1403889809;
                        i5 = -416392017;
                    } else {
                        iM3169 = (i2 - C0773.m3169("ܺ᩺")) * (-73);
                        i4 = ((iM3169 ^ i3) * 19523) ^ 1051541734;
                        i5 = -1097027604;
                    }
                    break;
                case -1816743987:
                case -1625928461:
                    AbstractC0641.m2813();
                    C0487.m2356();
                    break;
                case -1704625162:
                case -468549114:
                    activityC3409M1234 = AbstractC0116.m1234(this);
                    if (C23916.f77426 <= 0) {
                        iM3169 = C0619.m2761("᩵᩷") ^ i3;
                        i4 = ((iM3169 ^ i2) * 1491) ^ (-41105174);
                        i5 = 848035767;
                    } else {
                        iM3169 = (C0619.m2761("ۙܳ") ^ i2) * 59;
                        i4 = ((iM3169 ^ i3) * 2735) ^ (-963530929);
                        i5 = -1558709781;
                    }
                    break;
                case -1603632575:
                case -830759941:
                    if (C1321.f4751 < 0) {
                        iM3169 = (C0773.m3169("ۘ֨") ^ i2) * 123;
                        i4 = ((iM3169 ^ i3) * (-8677)) ^ (-296740792);
                        i5 = -768911657;
                    } else {
                        iM3169 = C0773.m3169("۫ۤ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-22447)) ^ 2100676491;
                        i5 = -1883249222;
                    }
                    break;
                case -1460415633:
                case -1117934459:
                    if (C1519.f5300 < 0) {
                        iM3169 = C0773.m3169("۫ۤ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-22447)) ^ 2100676491;
                        i5 = -1883249222;
                    } else {
                        iM3169 = (C0619.m2761("۠ۙ") ^ i3) * 39;
                        i4 = ((iM3169 ^ i2) * (-4429)) ^ (-38155335);
                        i5 = -215491178;
                    }
                    break;
                case -830588291:
                case 1217091361:
                    charSequence = null;
                    if (C0269.f1558 <= 0) {
                        iM3169 = C0773.m3169("᩸᩸") ^ i3;
                        i4 = ((iM3169 ^ i2) * 21567) ^ 1403889809;
                        i5 = -416392017;
                    } else {
                        iM3169 = C0619.m2761("᩶᩷") ^ i2;
                        i4 = ((iM3169 ^ i3) * 15783) ^ (-2125619182);
                        i5 = 851616642;
                    }
                    break;
                case -773150741:
                case -625217899:
                    activityC0848 = (ActivityC0848) AbstractC3624.m11768(this);
                    if (C2419.f7754 >= 0) {
                        iM3169 = (C0773.m3169("ۘ֨") ^ i2) * 123;
                        i4 = ((iM3169 ^ i3) * (-8677)) ^ (-296740792);
                        i5 = -768911657;
                    } else {
                        iM3169 = (C0773.m3169("֨ᩳ") ^ i3) * (-3);
                        i4 = ((iM3169 ^ i2) * (-9031)) ^ 280113249;
                        i5 = 266094338;
                    }
                    break;
                case -745962339:
                case -290829537:
                    if (C2878.m9491() <= 0) {
                        iM3169 = C0773.m3169("۫ۤ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-22447)) ^ 2100676491;
                        i5 = -1883249222;
                    } else {
                        iM3169 = (C0773.m3169("ۡۜ") ^ i3) * (-77);
                        i4 = ((iM3169 ^ i2) * 3833) ^ (-1385547835);
                        i5 = -1195815455;
                    }
                    break;
                case -672284059:
                case 813609493:
                    C1519.m5403();
                    iM3169 = (C0619.m2761("۠ۙ") ^ i3) * 39;
                    i4 = ((iM3169 ^ i2) * (-4429)) ^ (-38155335);
                    i5 = -215491178;
                    break;
                case -376302670:
                case 1788024773:
                    activityC0848.m3428(charSequence);
                    c23582 = this.f1208;
                    if (c23582 != null) {
                        iM3169 = (C0773.m3169("᩸ۨ") + i2) * (-89);
                        i4 = ((iM3169 ^ i3) * 13067) ^ (-2053468278);
                        i5 = 1916711859;
                    } else {
                        iM3169 = (i3 - C0773.m3169("۫֡")) * (-69);
                        i4 = ((iM3169 ^ i2) * 29411) ^ 1529736531;
                        i5 = 168043573;
                    }
                    break;
                case -334914108:
                case 1976508667:
                    if (!RunnableC1848.f6235) {
                        iM3169 = C0619.m2761("᩵᩷") ^ i3;
                        i4 = ((iM3169 ^ i2) * 1491) ^ (-41105174);
                        i5 = 848035767;
                    } else {
                        iM3169 = C0773.m3169("۫ۤ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-22447)) ^ 2100676491;
                        i5 = -1883249222;
                    }
                    break;
                case -101044993:
                case 1589077616:
                    activityC3409M1234.setTitle(mo1440());
                    if (C3492.f12043 <= 0) {
                        iM3169 = C0773.m3169("᩸᩸") ^ i3;
                        i4 = ((iM3169 ^ i2) * 21567) ^ 1403889809;
                        i5 = -416392017;
                    } else {
                        iM3169 = (C0619.m2761("ܳۘ") + i3) * (-15);
                        i4 = ((iM3169 ^ i2) * 31641) ^ (-1536345015);
                        i5 = -1252318174;
                    }
                    break;
                case 150701978:
                case 1845580198:
                    if (C2288.f7433 <= 0) {
                        iM3169 = C0619.m2761("᩵᩷") ^ i3;
                        i4 = ((iM3169 ^ i2) * 1491) ^ (-41105174);
                        i5 = 848035767;
                    } else {
                        iM3169 = (C0619.m2761("ۨ֨") + i3) * 97;
                        i4 = ((iM3169 ^ i2) * 10967) ^ (-769184018);
                        i5 = 846056802;
                    }
                    break;
                case 353611144:
                case 998312069:
                    if (C0487.f2131 <= 0) {
                        iM3169 = C0773.m3169("᩸᩸") ^ i3;
                        i4 = ((iM3169 ^ i2) * 21567) ^ 1403889809;
                        i5 = -416392017;
                    } else {
                        iM3169 = C0773.m3169("ᩳۚ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-22199)) ^ (-276686958);
                        i5 = 1604491735;
                    }
                    break;
                case 943296201:
                case 1309263033:
                    c23582.m52804();
                    iM3169 = (i3 - C0773.m3169("۫֡")) * (-69);
                    i4 = ((iM3169 ^ i2) * 29411) ^ 1529736531;
                    i5 = 168043573;
                    break;
                case 1665620095:
                case 1761340360:
                    break;
                case 1703268765:
                case 1711015554:
                    super.onResume();
                    if (C1542.m5459() >= 0) {
                        iM3169 = C0773.m3169("۫ۤ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-22447)) ^ 2100676491;
                        i5 = -1883249222;
                    } else {
                        iM3169 = C0773.m3169("֨᩷") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-28697)) ^ 165708457;
                        i5 = -1225230250;
                    }
                    break;
                default:
                    if (C2834.m9344() >= 0) {
                        iM3169 = C0773.m3169("۫ۤ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-22447)) ^ 2100676491;
                        i5 = -1883249222;
                    } else {
                        iM3169 = C0619.m2761("ۚۧ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 8433) ^ (-58211678);
                        i5 = 1296141379;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC9051, l.ComponentCallbacksC11612
    public final void onSaveInstanceState(Bundle bundle) {
        InterfaceC19777 interfaceC19777Mo1447 = null;
        int i = 2035946311;
        int i2 = AbstractC0116.f1064;
        int i3 = C1826.f6190;
        int iM3169 = C0773.m3169("ܳ֫") ^ i2;
        int i4 = ((iM3169 ^ i3) * 9807) ^ (-1373734305);
        int i5 = 1019314917;
        while (true) {
            i = ((((i ^ i3) * (-30093)) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2065016549:
                case -561557403:
                    C1826.m6301();
                    C4282.m13644();
                    iM3169 = C0619.m2761("ܺܶ") ^ i3;
                    i4 = ((iM3169 ^ i2) * (-23083)) ^ 2002571532;
                    i5 = -1791798151;
                    break;
                case -2044707508:
                case 1479973561:
                    if (C1564.f5401 <= 0) {
                        iM3169 = (C0619.m2761("ۛ᩹") ^ i2) * 69;
                        i4 = ((iM3169 ^ i3) * (-29651)) ^ 390949968;
                        i5 = -1388363966;
                    } else {
                        iM3169 = C0773.m3169("֫ۗ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 29137) ^ 2036053418;
                        i5 = 248014460;
                    }
                    break;
                case -2040426290:
                case 1430275509:
                    super.onSaveInstanceState(bundle);
                    interfaceC19777Mo1447 = mo1447();
                    if (interfaceC19777Mo1447 != null) {
                        iM3169 = (i2 - C0773.m3169("֡ۚ")) * (-25);
                        i4 = ((iM3169 ^ i3) * 5587) ^ 1800232374;
                        i5 = 389018542;
                    } else {
                        iM3169 = C0619.m2761("ۚۢ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-7057)) ^ 1373712080;
                        i5 = 1256975668;
                    }
                    break;
                case -1923135183:
                case -1323036792:
                    if (C1564.f5401 > 0) {
                        iM3169 = C0773.m3169("ۡ֨") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-3965)) ^ 1161930645;
                        i5 = 852169172;
                    } else {
                        iM3169 = (i3 - C0619.m2761("᩵᩺")) * (-59);
                        i4 = ((iM3169 ^ i2) * 4095) ^ (-976874203);
                        i5 = 1197514216;
                    }
                    break;
                case -1910170117:
                case 478876667:
                    C18067 c18067 = (C18067) interfaceC19777Mo1447;
                    c18067.mo34769();
                    c18067.mo34768();
                    iM3169 = C0619.m2761("ۚۢ") ^ i3;
                    i4 = ((iM3169 ^ i2) * (-7057)) ^ 1373712080;
                    i5 = 1256975668;
                    break;
                case -1665446610:
                case 919942799:
                    C0487.m2356();
                    if (C20932.m47848() != 0) {
                        iM3169 = (i3 - C0619.m2761("᩵᩺")) * (-59);
                        i4 = ((iM3169 ^ i2) * 4095) ^ (-976874203);
                        i5 = 1197514216;
                    } else {
                        iM3169 = C0619.m2761("ܺܶ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-23083)) ^ 2002571532;
                        i5 = -1791798151;
                    }
                    break;
                case -1655873367:
                case -1644728684:
                    if (C23916.f77426 <= 0) {
                        iM3169 = C0619.m2761("ܺܶ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-23083)) ^ 2002571532;
                        i5 = -1791798151;
                    } else {
                        iM3169 = C0619.m2761("۠ۛ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-28189)) ^ (-7564130);
                        i5 = -1826217850;
                    }
                    break;
                case -1559203405:
                case 954178433:
                    if (C1542.m5459() >= 0) {
                        iM3169 = C0619.m2761("ܿᩴ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-6895)) ^ (-1469949616);
                        i5 = -2131468366;
                    } else {
                        iM3169 = C0619.m2761("᩸᩻") ^ i3;
                        i4 = ((iM3169 ^ i2) * 6999) ^ (-200369379);
                        i5 = -490323544;
                    }
                    break;
                case -1416935425:
                case 260872696:
                    if (C17202.f56030) {
                        iM3169 = C0773.m3169("ۡۡ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 20327) ^ (-1937115646);
                        i5 = -881751493;
                    } else {
                        iM3169 = C0773.m3169("ۡ֨") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-3965)) ^ 1161930645;
                        i5 = 852169172;
                    }
                    break;
                case -1351793504:
                case 235164819:
                    if (C17202.f56030) {
                        iM3169 = C0619.m2761("ۚۗ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-7267)) ^ (-609336075);
                        i5 = -494634988;
                    } else {
                        iM3169 = (C0619.m2761("ۛ᩹") ^ i2) * 69;
                        i4 = ((iM3169 ^ i3) * (-29651)) ^ 390949968;
                        i5 = -1388363966;
                    }
                    break;
                case -377543562:
                case 772670875:
                    break;
                case -271875043:
                case -237600606:
                    C2288.m7767();
                    C1343.m4943();
                    break;
                case -138164070:
                case 671912164:
                    if (C13473.f42873 != 0) {
                        iM3169 = (C0619.m2761("ۛ᩹") ^ i2) * 69;
                        i4 = ((iM3169 ^ i3) * (-29651)) ^ 390949968;
                        i5 = -1388363966;
                    } else {
                        iM3169 = C0619.m2761("᩹֡") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-4055)) ^ (-456054467);
                        i5 = 1376991562;
                    }
                    break;
                case -124734430:
                case 202254989:
                    C1321.m4852();
                    if (!C0619.f2439) {
                        iM3169 = C0619.m2761("ܿᩴ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-6895)) ^ (-1469949616);
                        i5 = -2131468366;
                    } else {
                        iM3169 = C0619.m2761("ܺܶ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-23083)) ^ 2002571532;
                        i5 = -1791798151;
                    }
                    break;
                case 181808460:
                case 1579751009:
                    if (C3077.f9998) {
                        iM3169 = C0619.m2761("᩶ܰ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 25759) ^ (-563675784);
                        i5 = 1802146149;
                    } else {
                        iM3169 = C0773.m3169("ۡ֨") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-3965)) ^ 1161930645;
                        i5 = 852169172;
                    }
                    break;
                case 1031693289:
                case 1155878997:
                    if (C1783.f6087 <= 0) {
                        iM3169 = (i3 - C0619.m2761("᩵᩺")) * (-59);
                        i4 = ((iM3169 ^ i2) * 4095) ^ (-976874203);
                        i5 = 1197514216;
                    } else {
                        iM3169 = C0773.m3169("ۙۜ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 7123) ^ 1787582421;
                        i5 = -1712764917;
                    }
                    break;
                case 1245851784:
                case 1443823294:
                    if (C3492.f12043 <= 0) {
                        iM3169 = C0619.m2761("ܺܶ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-23083)) ^ 2002571532;
                        i5 = -1791798151;
                    } else {
                        iM3169 = (i2 - C0619.m2761("۬᩵")) * (-111);
                        i4 = ((iM3169 ^ i3) * (-10843)) ^ (-1581983193);
                        i5 = -1718273341;
                    }
                    break;
                default:
                    if (C3492.f12043 <= 0) {
                        iM3169 = (i3 - C0619.m2761("᩵᩺")) * (-59);
                        i4 = ((iM3169 ^ i2) * 4095) ^ (-976874203);
                        i5 = 1197514216;
                    } else {
                        iM3169 = C0773.m3169("ܶۢ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-2789)) ^ 374985585;
                        i5 = 536905182;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x01ac A[PHI: r6 r7 r10
      0x01ac: PHI (r6v6 int) = (r6v3 int), (r6v2 int), (r6v2 int), (r6v2 int) binds: [B:50:0x01aa, B:42:0x0162, B:18:0x0098, B:126:0x01ac] A[DONT_GENERATE, DONT_INLINE]
      0x01ac: PHI (r7v6 int) = (r7v3 int), (r7v2 int), (r7v2 int), (r7v2 int) binds: [B:50:0x01aa, B:42:0x0162, B:18:0x0098, B:126:0x01ac] A[DONT_GENERATE, DONT_INLINE]
      0x01ac: PHI (r10v6 java.lang.Integer) = (r10v2 java.lang.Integer), (r10v3 java.lang.Integer), (r10v2 java.lang.Integer), (r10v2 java.lang.Integer) binds: [B:50:0x01aa, B:42:0x0162, B:18:0x0098, B:126:0x01ac] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x020b A[PHI: r5
      0x020b: PHI (r5v4 int) = (r5v3 int), (r5v2 int) binds: [B:56:0x01f3, B:25:0x00b2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x023c  */
    @Override // l.InterfaceC8940
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1434(int i, int i2, String str) {
        short s;
        int i3;
        int iM3169;
        int i4;
        int i5;
        short s2;
        int iM31610;
        int i6;
        int iM2761;
        int i7;
        this = this;
        int i8 = i;
        int i9 = C4238.f15451;
        int i10 = RunnableC0334.f1808;
        int iM31611 = (C0773.m3169("᩸ۗ") + i10) * (-19);
        int i11 = ((iM31611 ^ i9) * (-20915)) ^ (-575440636);
        Object[] objArr = null;
        short[] sArr = null;
        int i12 = iM31611 ^ 1999843667;
        int i13 = 0;
        int i14 = 0;
        char c = 0;
        int i15 = 0;
        short s3 = 0;
        int i16 = 0;
        int i17 = -76719612;
        int i18 = 0;
        Integer numM2764 = null;
        C24132 c24132 = null;
        Integer numM2765 = null;
        int iM54067 = 0;
        while (true) {
            i17 = i12 ^ (i11 & (((i17 ^ i9) * (-11571)) >> 31));
            switch (i17) {
                case -2137346649:
                case 1288982286:
                    if (i16 - (i18 + 33016516) <= 0) {
                        iM3169 = (C0619.m2761("ۛۜ") + i10) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM3169 ^ i9) * (-9599)) ^ 693829643;
                        i5 = -199604888;
                    } else {
                        iM3169 = C0619.m2761("ۛܽ") ^ i9;
                        i4 = ((iM3169 ^ i10) * (-19287)) ^ (-895347674);
                        i5 = 241988655;
                    }
                    i12 = iM3169 ^ i5;
                    i11 = i4;
                    break;
                case -1995825524:
                case -357043124:
                    this.f1214 = null;
                    iM3169 = C0773.m3169("ۨ۫") ^ i10;
                    i4 = ((iM3169 ^ i9) * (-24403)) ^ 1632142385;
                    i5 = -1546111728;
                    i12 = iM3169 ^ i5;
                    i11 = i4;
                    break;
                case -1932697583:
                case 752295291:
                    if (i2 == i13) {
                        iM3169 = (C0619.m2761("᩷ᩴ") ^ i9) * (-91);
                        i4 = ((iM3169 ^ i10) * (-22507)) ^ 1795330495;
                        i5 = 2116943458;
                    } else {
                        iM3169 = C0619.m2761("ۢ۫") ^ i9;
                        i4 = ((iM3169 ^ i10) * (-32017)) ^ 1621251814;
                        i5 = -1681367677;
                    }
                    i12 = iM3169 ^ i5;
                    i11 = i4;
                    break;
                case -1816811315:
                case 1966266847:
                    break;
                case -1771628836:
                case 2009633324:
                    m1418();
                    break;
                case -1714421809:
                case 109377247:
                    i13 = -1;
                    if (i8 == -1) {
                        iM3169 = C0619.m2761("۬۠") ^ i9;
                        i4 = ((iM3169 ^ i10) * 20523) ^ 737198060;
                        i5 = -1704919770;
                    } else {
                        iM3169 = C0619.m2761("ۢ۫") ^ i9;
                        i4 = ((iM3169 ^ i10) * (-32017)) ^ 1621251814;
                        i5 = -1681367677;
                    }
                    i12 = iM3169 ^ i5;
                    i11 = i4;
                    break;
                case -1653356804:
                case 1072889837:
                    numM2765 = C0619.m2764(iM54067);
                    c24132 = this.f1217;
                    if (C0487.f2131 > 0) {
                        iM3169 = (i9 - C0773.m3169("ۜۖ")) * 3;
                        i4 = ((iM3169 ^ i10) * (-23873)) ^ 2112388067;
                        i5 = -2061368784;
                        i12 = iM3169 ^ i5;
                        i11 = i4;
                    } else {
                        s = s3;
                        int iM31612 = C0773.m3169("ܳۖ") ^ i9;
                        i12 = iM31612 ^ 1215938548;
                        s3 = s;
                        i11 = ((iM31612 ^ i10) * FalconVrfy.R) ^ 6458764;
                        this = this;
                    }
                    break;
                case -1593759939:
                case 1472193888:
                    numM2764 = C0619.m2764(c24132.m54067(i2) + i14);
                    if (C3690.f12684 <= 0) {
                        iM3169 = C0773.m3169("֨ܽ") ^ i10;
                        i4 = ((iM3169 ^ i9) * 14465) ^ 1916002590;
                        i5 = 1939092086;
                    } else {
                        iM3169 = C0619.m2761("۬᩸") ^ i9;
                        i4 = ((iM3169 ^ i10) * (-4669)) ^ (-1356706313);
                        i5 = 1810400855;
                    }
                    i12 = iM3169 ^ i5;
                    i11 = i4;
                    break;
                case -1563908942:
                case 1974575045:
                    s2 = s3;
                    if (RunnableC3055.f9898 < 0) {
                        iM31610 = C0773.m3169("۬ۛ") ^ i10;
                        i3 = ((iM31610 ^ i9) * (-20911)) ^ 1166047215;
                        i6 = 1917930129;
                        i12 = iM31610 ^ i6;
                        s3 = s2;
                        i11 = i3;
                        i8 = i;
                    } else {
                        s3 = s2;
                        iM2761 = (C0619.m2761("ۛ۟") ^ i9) * 71;
                        i11 = (-570080180) ^ ((iM2761 ^ i10) * 20071);
                        i7 = -356205184;
                        i12 = iM2761 ^ i7;
                        this = this;
                        i8 = i;
                    }
                    break;
                case -1427961381:
                case 460269653:
                    objArr[0] = numM2765;
                    objArr[i14] = numM2764;
                    c = 2;
                    if (C1564.f5401 > 0) {
                        iM3169 = C0619.m2761("ۛۨ") ^ i9;
                        i4 = ((iM3169 ^ i10) * 10865) ^ 1060175504;
                        i5 = -1477043801;
                        i12 = iM3169 ^ i5;
                        i11 = i4;
                    } else {
                        iM2761 = (C0619.m2761("ۛ۟") ^ i9) * 71;
                        i11 = (-570080180) ^ ((iM2761 ^ i10) * 20071);
                        i7 = -356205184;
                        i12 = iM2761 ^ i7;
                        this = this;
                        i8 = i;
                    }
                    break;
                case -1320392053:
                case 1406747995:
                    if (this.f1228) {
                        iM3169 = (i10 - C0773.m3169("ۧ۠")) * 109;
                        i4 = ((iM3169 ^ i9) * (-15173)) ^ 353270710;
                        i5 = -1819729182;
                    } else {
                        iM3169 = C0773.m3169("᩹ᩳ") ^ i9;
                        i4 = ((iM3169 ^ i10) * (-6917)) ^ (-564078074);
                        i5 = -1014584340;
                    }
                    i12 = iM3169 ^ i5;
                    i11 = i4;
                    break;
                case -1193569596:
                case 1800714534:
                    i15 = 21285;
                    iM3169 = (i9 - C0773.m3169("ۚܰ")) * 123;
                    i4 = ((iM3169 ^ i10) * (-1283)) ^ (-1836034970);
                    i5 = 2028768042;
                    i12 = iM3169 ^ i5;
                    i11 = i4;
                    break;
                case -1125210525:
                case 30945714:
                    if (C3734.f12817 < 0) {
                        s = s3;
                        int iM31613 = C0773.m3169("ܳۖ") ^ i9;
                        i12 = iM31613 ^ 1215938548;
                        s3 = s;
                        i11 = ((iM31613 ^ i10) * FalconVrfy.R) ^ 6458764;
                        this = this;
                    } else {
                        iM2761 = (C0619.m2761("ۛ۟") ^ i9) * 71;
                        i11 = (-570080180) ^ ((iM2761 ^ i10) * 20071);
                        i7 = -356205184;
                        i12 = iM2761 ^ i7;
                        this = this;
                        i8 = i;
                    }
                    break;
                case -847767810:
                case 1945581094:
                    this.f1214 = str;
                    iM3169 = C0773.m3169("ۨ۫") ^ i10;
                    i4 = ((iM3169 ^ i9) * (-24403)) ^ 1632142385;
                    i5 = -1546111728;
                    i12 = iM3169 ^ i5;
                    i11 = i4;
                    break;
                case -722678335:
                case 1177254444:
                    C13473.m33144();
                    C3033.m9845();
                    break;
                case -643311225:
                case 1206806833:
                    s2 = s3;
                    if (C1564.f5401 <= 0) {
                        iM31610 = (C0619.m2761("֫֫") + i10) * (-73);
                        i3 = ((iM31610 ^ i9) * (-16973)) ^ (-1776725272);
                        i6 = -1751002714;
                    } else {
                        iM31610 = C0773.m3169("۫ܺ") ^ i9;
                        i3 = ((iM31610 ^ i10) * (-25041)) ^ (-1308159945);
                        i6 = -1840530434;
                    }
                    i12 = iM31610 ^ i6;
                    s3 = s2;
                    i11 = i3;
                    i8 = i;
                    break;
                case -614101337:
                case 1911052124:
                    if (i8 == 0) {
                        iM3169 = (C0773.m3169("᩺۠") ^ i10) * 21;
                        i4 = ((iM3169 ^ i9) * (-16697)) ^ 158641152;
                        i5 = 1177905369;
                    } else {
                        iM3169 = (C0619.m2761("ۤܺ") ^ i10) * 123;
                        i4 = ((iM3169 ^ i9) * (-12627)) ^ 11473522;
                        i5 = -732850980;
                    }
                    i12 = iM3169 ^ i5;
                    i11 = i4;
                    break;
                case -580957582:
                case 1091202491:
                    objArr = new Object[3];
                    if (C3779.f12953 > 0) {
                        iM3169 = (C0619.m2761("ۨ֨") ^ i10) * 59;
                        i4 = ((iM3169 ^ i9) * (-1307)) ^ 2117467330;
                        i5 = -907115602;
                        i12 = iM3169 ^ i5;
                        i11 = i4;
                    } else {
                        s2 = s3;
                        iM31610 = (C0619.m2761("֫֫") + i10) * (-73);
                        i3 = ((iM31610 ^ i9) * (-16973)) ^ (-1776725272);
                        i6 = -1751002714;
                        i12 = iM31610 ^ i6;
                        s3 = s2;
                        i11 = i3;
                        i8 = i;
                    }
                    break;
                case -445648950:
                case -134006568:
                    i15 = 52856;
                    iM3169 = (i9 - C0773.m3169("ۚܰ")) * 123;
                    i4 = ((iM3169 ^ i10) * (-1283)) ^ (-1836034970);
                    i5 = 2028768042;
                    i12 = iM3169 ^ i5;
                    i11 = i4;
                    break;
                case -240287064:
                case 776558916:
                    if (i2 == 0) {
                        iM3169 = (C0619.m2761("ۗۤ") ^ i10) * (-39);
                        i4 = ((iM3169 ^ i9) * 10063) ^ (-163062347);
                        i5 = 626428574;
                    } else {
                        iM3169 = (C0619.m2761("ۤܺ") ^ i10) * 123;
                        i4 = ((iM3169 ^ i9) * (-12627)) ^ 11473522;
                        i5 = -732850980;
                    }
                    i12 = iM3169 ^ i5;
                    i11 = i4;
                    break;
                case -20028194:
                case 228162517:
                    RunnableC1848.m6360();
                    if (!C3077.f9998) {
                        iM3169 = C0773.m3169("֨ܽ") ^ i10;
                        i4 = ((iM3169 ^ i9) * 14465) ^ 1916002590;
                        i5 = 1939092086;
                        i12 = iM3169 ^ i5;
                        i11 = i4;
                    } else {
                        iM2761 = (C0619.m2761("ۛ۟") ^ i9) * 71;
                        i11 = (-570080180) ^ ((iM2761 ^ i10) * 20071);
                        i7 = -356205184;
                        i12 = iM2761 ^ i7;
                        this = this;
                        i8 = i;
                    }
                    break;
                case 82354728:
                case 289538019:
                    objArr[c] = str;
                    sArr = f1206;
                    if (C0950.f3488 < 0) {
                        iM3169 = (i10 - C0619.m2761("۬ۧ")) * 23;
                        i4 = ((iM3169 ^ i9) * (-17641)) ^ (-1881310972);
                        i5 = -940974455;
                        i12 = iM3169 ^ i5;
                        i11 = i4;
                    } else {
                        iM2761 = (C0619.m2761("ۛ۟") ^ i9) * 71;
                        i11 = (-570080180) ^ ((iM2761 ^ i10) * 20071);
                        i7 = -356205184;
                        i12 = iM2761 ^ i7;
                        this = this;
                        i8 = i;
                    }
                    break;
                case 121979858:
                case 331489285:
                    this.f1214 = String.format(C2702.m8881(sArr, 296, 14, i15), objArr);
                    iM3169 = C0773.m3169("ۨ۫") ^ i10;
                    i4 = ((iM3169 ^ i9) * (-24403)) ^ 1632142385;
                    i5 = -1546111728;
                    i12 = iM3169 ^ i5;
                    i11 = i4;
                    break;
                case 421566564:
                case 763346147:
                    i14 = 1;
                    iM54067 = this.f1217.m54067(i8) + 1;
                    if (C3077.f9998) {
                        iM3169 = C0619.m2761("ۜ֨") ^ i10;
                        i4 = ((iM3169 ^ i9) * (-24915)) ^ (-802718989);
                        i5 = 172874606;
                    } else {
                        iM3169 = C0773.m3169("֨ܽ") ^ i10;
                        i4 = ((iM3169 ^ i9) * 14465) ^ 1916002590;
                        i5 = 1939092086;
                    }
                    i12 = iM3169 ^ i5;
                    i11 = i4;
                    break;
                case 620518264:
                case 1679742504:
                    s3 = f1206[295];
                    if (C1080.f3865 >= 0) {
                        iM2761 = (C0619.m2761("ۛ۟") ^ i9) * 71;
                        i11 = (-570080180) ^ ((iM2761 ^ i10) * 20071);
                        i7 = -356205184;
                    } else {
                        iM2761 = C0619.m2761("ۖۨ") ^ i9;
                        i11 = (-1146742353) ^ ((iM2761 ^ i10) * (-27893));
                        i7 = -616689313;
                    }
                    i12 = iM2761 ^ i7;
                    this = this;
                    i8 = i;
                    break;
                case 685816859:
                case 1204052699:
                    C1080.m4050();
                    RunnableC1848.m6360();
                    iM3169 = C0773.m3169("֨ܽ") ^ i10;
                    i4 = ((iM3169 ^ i9) * 14465) ^ 1916002590;
                    i5 = 1939092086;
                    i12 = iM3169 ^ i5;
                    i11 = i4;
                    break;
                case 954759623:
                case 1001213759:
                    C13473.m33144();
                    if (C0487.m2356() < 0) {
                        iM3169 = (C0619.m2761("۫᩹") ^ i10) * (-61);
                        i4 = ((iM3169 ^ i9) * 30845) ^ (-1756970957);
                        i5 = 815895441;
                        i12 = iM3169 ^ i5;
                        i11 = i4;
                    } else {
                        s = s3;
                        int iM31614 = C0773.m3169("ܳۖ") ^ i9;
                        i12 = iM31614 ^ 1215938548;
                        s3 = s;
                        i11 = ((iM31614 ^ i10) * FalconVrfy.R) ^ 6458764;
                        this = this;
                    }
                    break;
                default:
                    s = s3;
                    int i19 = s * 11492;
                    i18 = s * s;
                    if (C4282.f15546 > 0) {
                        int iM2762 = C0619.m2761("ᩳۤ") ^ i10;
                        i3 = ((iM2762 ^ i9) * 28183) ^ 661120856;
                        i12 = iM2762 ^ 2036894480;
                        s3 = s;
                        i16 = i19;
                        i11 = i3;
                        i8 = i;
                    } else {
                        i16 = i19;
                        int iM31615 = C0773.m3169("ܳۖ") ^ i9;
                        i12 = iM31615 ^ 1215938548;
                        s3 = s;
                        i11 = ((iM31615 ^ i10) * FalconVrfy.R) ^ 6458764;
                        this = this;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC9051
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC19777 mo1447() {
        C20283 c20283 = null;
        C9378 c9378M24173 = null;
        C24132 c24132 = null;
        C23582 c23582 = null;
        int i = -1266348965;
        int i2 = C1146.f4234;
        int i3 = RunnableC0334.f1808;
        int iM3169 = (C0773.m3169("۬ܰ") ^ i3) * (-65);
        int i4 = ((iM3169 ^ i2) * (-29819)) ^ 2039119785;
        int i5 = -1792573645;
        while (true) {
            i = ((((i ^ i2) * (-8479)) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2144459902:
                case -400743738:
                    throw new RuntimeException();
                case -2046806294:
                case 1629532405:
                    if (this.f1226) {
                        iM3169 = (C0773.m3169("ܺ᩷") + i3) * (-19);
                        i4 = ((iM3169 ^ i2) * (-12925)) ^ 1812881657;
                        i5 = -1665884812;
                    } else {
                        iM3169 = (C0619.m2761("ܰ֡") + i3) * (-57);
                        i4 = ((iM3169 ^ i2) * (-10267)) ^ (-261031068);
                        i5 = -655416489;
                    }
                    break;
                case -1991696899:
                case -569400094:
                    c9378M24173 = m24173(c20283.m11163());
                    if (C0862.f3233 != 0) {
                        iM3169 = C0619.m2761("ᩴۛ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-7261)) ^ 1287307934;
                        i5 = 1138245407;
                    } else {
                        iM3169 = C0773.m3169("ܿۙ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-31823)) ^ (-982309835);
                        i5 = -1714245963;
                    }
                    break;
                case -1833757189:
                case 1255119838:
                    C1783.m6232();
                    C3690.m11987();
                    return null;
                case -1729859176:
                case 811295029:
                    if (C1542.f5343 <= 0) {
                        iM3169 = C0619.m2761("ᩴۛ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-7261)) ^ 1287307934;
                        i5 = 1138245407;
                    } else {
                        iM3169 = C0773.m3169("ܰܽ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 25623) ^ 551759760;
                        i5 = 158055605;
                    }
                    break;
                case -1642470872:
                case -839853109:
                    return null;
                case -1565866040:
                case 561878409:
                    C0619.m2763();
                    if (C11235.f35427 < 0) {
                        iM3169 = C0773.m3169("ܰܽ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 25623) ^ 551759760;
                        i5 = 158055605;
                    } else {
                        iM3169 = (C0773.m3169("ܿ֡") ^ i3) * 11;
                        i4 = ((iM3169 ^ i2) * (-22993)) ^ 622308934;
                        i5 = 100242897;
                    }
                    break;
                case -1384074584:
                case 1053312217:
                    if (C2287.f7432 >= 0) {
                        iM3169 = (i2 - C0619.m2761("ۖ֫")) * 39;
                        i4 = ((iM3169 ^ i3) * 8057) ^ 586270709;
                        i5 = -1021200110;
                    } else {
                        iM3169 = (C0773.m3169("ܰۜ") + i3) * (-13);
                        i4 = ((iM3169 ^ i2) * 7389) ^ (-223514786);
                        i5 = 1864327787;
                    }
                    break;
                case -1197804863:
                case 1057952015:
                    if (C13473.f42873 != 0) {
                        iM3169 = (C0619.m2761("۠᩹") + i3) * (-19);
                        i4 = ((iM3169 ^ i2) * 11969) ^ (-777026713);
                        i5 = 854929277;
                    } else {
                        iM3169 = C0619.m2761("ۚۚ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-24183)) ^ (-407475724);
                        i5 = -601813354;
                    }
                    break;
                case -868628272:
                case 824579390:
                    if (C0773.f2792 <= 0) {
                        iM3169 = C0619.m2761("ᩴۛ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-7261)) ^ 1287307934;
                        i5 = 1138245407;
                    } else {
                        iM3169 = (C0619.m2761("ۡܿ") ^ i2) * (-41);
                        i4 = ((iM3169 ^ i3) * (-30823)) ^ (-1284312975);
                        i5 = -1218990773;
                    }
                    break;
                case -842996576:
                case 395702658:
                    return new C18067(this, c24132, c23582, c9378M24173);
                case -815831802:
                case 1219385148:
                    c20283 = this.f1224;
                    if (c20283 != null) {
                        iM3169 = (C0773.m3169("۟ۖ") + i2) * (-103);
                        i4 = ((iM3169 ^ i3) * (-15129)) ^ 368671917;
                        i5 = -1611527868;
                    } else {
                        iM3169 = (C0773.m3169("ܺ᩷") + i3) * (-19);
                        i4 = ((iM3169 ^ i2) * (-12925)) ^ 1812881657;
                        i5 = -1665884812;
                    }
                    break;
                case -790477417:
                case 1112345977:
                    if (this.f1228) {
                        iM3169 = (i2 - C0773.m3169("᩹ܰ")) * 93;
                        i4 = ((iM3169 ^ i3) * (-18777)) ^ 1952328751;
                        i5 = -1818004382;
                    } else {
                        iM3169 = (C0773.m3169("ܺ᩷") + i3) * (-19);
                        i4 = ((iM3169 ^ i2) * (-12925)) ^ 1812881657;
                        i5 = -1665884812;
                    }
                    break;
                case -789785460:
                case 299147744:
                    c24132 = this.f1217;
                    c23582 = this.f1208;
                    if (c24132 != null) {
                        iM3169 = (C0773.m3169("᩺᩵") ^ i2) * (-117);
                        i4 = ((iM3169 ^ i3) * 26059) ^ 419926852;
                        i5 = 1708059997;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ܺ֡")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM3169 ^ i2) * (-27297)) ^ 1964575778;
                        i5 = -1513698658;
                    }
                    break;
                case -353935422:
                case 569113851:
                    if (AbstractC0116.f1064 <= 0) {
                        iM3169 = C0619.m2761("ᩴۛ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-7261)) ^ 1287307934;
                        i5 = 1138245407;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ۛ۬")) * (-45);
                        i4 = ((iM3169 ^ i2) * 31299) ^ (-1955827034);
                        i5 = 905722555;
                    }
                    break;
                case -290225245:
                case 707463082:
                    if (C2834.f9334 <= 0) {
                        iM3169 = (i2 - C0619.m2761("ۖ֫")) * 39;
                        i4 = ((iM3169 ^ i3) * 8057) ^ 586270709;
                        i5 = -1021200110;
                    } else {
                        iM3169 = (C0619.m2761("ܰ۟") + i3) * 75;
                        i4 = ((iM3169 ^ i2) * 13815) ^ (-35852433);
                        i5 = -1666038934;
                    }
                    break;
                case -207463430:
                case 1967325146:
                    C4282.m13644();
                    if (C2702.f8586 > 0) {
                        iM3169 = (i2 - C0619.m2761("ۖ֫")) * 39;
                        i4 = ((iM3169 ^ i3) * 8057) ^ 586270709;
                        i5 = -1021200110;
                    } else {
                        iM3169 = (C0773.m3169("ܿ֡") ^ i3) * 11;
                        i4 = ((iM3169 ^ i2) * (-22993)) ^ 622308934;
                        i5 = 100242897;
                    }
                    break;
                case 199079791:
                case 816708205:
                    if (C1542.f5343 <= 0) {
                        iM3169 = (i2 - C0619.m2761("ۖ֫")) * 39;
                        i4 = ((iM3169 ^ i3) * 8057) ^ 586270709;
                        i5 = -1021200110;
                    } else {
                        iM3169 = (C0619.m2761("ܰ᩹") + i2) * (-97);
                        i4 = ((iM3169 ^ i3) * 20387) ^ (-1263631553);
                        i5 = -1943773635;
                    }
                    break;
                case 590394240:
                case 1508349239:
                    if (RunnableC3646.f12471) {
                        iM3169 = (C0619.m2761("۠᩹") + i3) * (-19);
                        i4 = ((iM3169 ^ i2) * 11969) ^ (-777026713);
                        i5 = 854929277;
                    } else {
                        iM3169 = (C0619.m2761("ۤ᩹") ^ i2) * (-125);
                        i4 = ((iM3169 ^ i3) * 28077) ^ (-899793490);
                        i5 = -985571547;
                    }
                    break;
                case 699078605:
                case 1103825279:
                    if (C20932.m47848() != 0) {
                        iM3169 = C0773.m3169("ܰܽ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 25623) ^ 551759760;
                        i5 = 158055605;
                    } else {
                        iM3169 = C0773.m3169("᩵᩹") ^ i3;
                        i4 = ((iM3169 ^ i2) * 29543) ^ 2008069126;
                        i5 = -547622999;
                    }
                    break;
                case 1039715758:
                case 1711258494:
                    if (c23582 != null) {
                        iM3169 = (C0773.m3169("۟ۜ") ^ i2) * (-59);
                        i4 = ((iM3169 ^ i3) * (-18907)) ^ 1682669062;
                        i5 = 1147917337;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ܺ֡")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM3169 ^ i2) * (-27297)) ^ 1964575778;
                        i5 = -1513698658;
                    }
                    break;
                case 1689266517:
                case 1817742292:
                    if (C2310.m7813() <= 0) {
                        iM3169 = C0619.m2761("ᩴۛ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-7261)) ^ 1287307934;
                        i5 = 1138245407;
                    } else {
                        iM3169 = C0619.m2761("ܽ᩶") ^ i3;
                        i4 = ((iM3169 ^ i2) * 19721) ^ (-1609632934);
                        i5 = 77140264;
                    }
                    break;
                default:
                    C1783.m6232();
                    C1343.m4943();
                    iM3169 = (C0773.m3169("ܿ֡") ^ i3) * 11;
                    i4 = ((iM3169 ^ i2) * (-22993)) ^ 622308934;
                    i5 = 100242897;
                    break;
            }
        }
    }

    @Override // l.AbstractC9051
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void mo1448() {
        C21051 c21051 = null;
        int i = -1252559849;
        int i2 = C2354.f7599;
        int i3 = RunnableC0334.f1808;
        int iM3169 = C0773.m3169("ۚܰ") ^ i3;
        int i4 = ((iM3169 ^ i2) * 28617) ^ 327497530;
        int i5 = -810401477;
        while (true) {
            i = ((((i ^ i2) * (-8757)) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -1999462964:
                case 1817421379:
                    if (C0950.f3488 >= 0) {
                        iM3169 = (C0619.m2761("᩻֡") ^ i3) * 89;
                        i4 = ((iM3169 ^ i2) * 19599) ^ (-321762332);
                        i5 = -1448079533;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ۡ֨")) * 9;
                        i4 = ((iM3169 ^ i2) * (-29631)) ^ 624011382;
                        i5 = -1472936135;
                    }
                    break;
                case -1901525747:
                case -1237038542:
                    if (this.f1228) {
                        iM3169 = (C0619.m2761("۠ܶ") + i2) * 109;
                        i4 = ((iM3169 ^ i3) * 19075) ^ (-1208501398);
                        i5 = -893301089;
                    } else {
                        iM3169 = C0773.m3169("ۛ۬") ^ i3;
                        i4 = ((iM3169 ^ i2) * 17581) ^ 890431215;
                        i5 = 1800266416;
                    }
                    break;
                case -1573370310:
                case -1193176167:
                    C2834.m9339(c21051);
                    iM3169 = C0773.m3169("ۛ۬") ^ i3;
                    i4 = ((iM3169 ^ i2) * 17581) ^ 890431215;
                    i5 = 1800266416;
                    break;
                case -1478003827:
                case -921521792:
                    if (C3734.m12152() >= 0) {
                        iM3169 = (C0619.m2761("᩻֡") ^ i3) * 89;
                        i4 = ((iM3169 ^ i2) * 19599) ^ (-321762332);
                        i5 = -1448079533;
                    } else {
                        iM3169 = C0619.m2761("ۙܿ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 19565) ^ (-237380645);
                        i5 = 984727794;
                    }
                    break;
                case -1429138716:
                case -1168224934:
                    C2834.m9344();
                    RunnableC3055.m9933();
                    iM3169 = (C0619.m2761("ܺۚ") ^ i3) * (-21);
                    i4 = ((iM3169 ^ i2) * (-29955)) ^ (-1399942581);
                    i5 = -377347088;
                    break;
                case -1283412879:
                case -564200968:
                    c21051 = new C21051(this);
                    if (C0619.f2439) {
                        iM3169 = (i2 - C0619.m2761("᩻ۗ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM3169 ^ i3) * (-24573)) ^ 1493104296;
                        i5 = -178998248;
                    } else {
                        iM3169 = (C0619.m2761("ۖۤ") ^ i2) * 23;
                        i4 = ((iM3169 ^ i3) * (-18069)) ^ (-1129652373);
                        i5 = -362024385;
                    }
                    break;
                case -1240140583:
                case 316215117:
                    if (C3448.f11240 >= 0) {
                        iM3169 = (C0619.m2761("ܺۚ") ^ i3) * (-21);
                        i4 = ((iM3169 ^ i2) * (-29955)) ^ (-1399942581);
                        i5 = -377347088;
                    } else {
                        iM3169 = (C0619.m2761("ۚᩴ") ^ i3) * 53;
                        i4 = ((iM3169 ^ i2) * (-8077)) ^ 745176495;
                        i5 = 1398829134;
                    }
                    break;
                case -1130064336:
                case 995077603:
                    if (C2702.f8586 <= 0) {
                        iM3169 = (i2 - C0619.m2761("᩻ۗ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM3169 ^ i3) * (-24573)) ^ 1493104296;
                        i5 = -178998248;
                    } else {
                        iM3169 = (C0773.m3169("᩻ܽ") ^ i2) * 15;
                        i4 = ((iM3169 ^ i3) * (-1841)) ^ 2132063392;
                        i5 = -50153310;
                    }
                    break;
                case -524169593:
                case 1716468291:
                    if (this.f1226) {
                        iM3169 = C0773.m3169("ۛ۬") ^ i3;
                        i4 = ((iM3169 ^ i2) * 17581) ^ 890431215;
                        i5 = 1800266416;
                    } else {
                        iM3169 = C0619.m2761("۫᩶") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-22883)) ^ 1778335323;
                        i5 = -2080685034;
                    }
                    break;
                case -467569745:
                case 1395167793:
                    if (C3734.f12817 >= 0) {
                        iM3169 = (i2 - C0619.m2761("᩻ۗ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM3169 ^ i3) * (-24573)) ^ 1493104296;
                        i5 = -178998248;
                    } else {
                        iM3169 = (i3 - C0773.m3169("֡ۤ")) * 81;
                        i4 = ((iM3169 ^ i2) * (-23265)) ^ (-256570103);
                        i5 = -758693885;
                    }
                    break;
                case -382925943:
                case -99785630:
                    if (this.f1222) {
                        iM3169 = C0773.m3169("᩸᩷") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-12285)) ^ 138860580;
                        i5 = -164856532;
                    } else {
                        iM3169 = C0773.m3169("ۛ۬") ^ i3;
                        i4 = ((iM3169 ^ i2) * 17581) ^ 890431215;
                        i5 = 1800266416;
                    }
                    break;
                case -253798157:
                case 1944986647:
                    if (AbstractC0116.f1064 <= 0) {
                        iM3169 = C0619.m2761("ۙܿ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 19565) ^ (-237380645);
                        i5 = 984727794;
                    } else {
                        iM3169 = (i2 - C0773.m3169("ۜۚ")) * 65;
                        i4 = ((iM3169 ^ i3) * 24637) ^ (-580371926);
                        i5 = -349619089;
                    }
                    break;
                case -153655479:
                case 118501938:
                    if (C13473.f42873 != 0) {
                        iM3169 = (i2 - C0619.m2761("᩻ۗ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM3169 ^ i3) * (-24573)) ^ 1493104296;
                        i5 = -178998248;
                    } else {
                        iM3169 = C0619.m2761("ۙܿ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 19565) ^ (-237380645);
                        i5 = 984727794;
                    }
                    break;
                case 112375007:
                case 1267500049:
                    if (C1564.f5401 <= 0) {
                        iM3169 = (C0619.m2761("ܰ֡") ^ i2) * 27;
                        i4 = ((iM3169 ^ i3) * 20435) ^ 51945873;
                        i5 = -1646369482;
                    } else {
                        iM3169 = (C0619.m2761("᩺ܺ") + i3) * (-21);
                        i4 = ((iM3169 ^ i2) * 9885) ^ 811520143;
                        i5 = -211419137;
                    }
                    break;
                case 392013566:
                case 1124306685:
                    if (C2878.m9491() <= 0) {
                        iM3169 = (C0619.m2761("ܺۚ") ^ i3) * (-21);
                        i4 = ((iM3169 ^ i2) * (-29955)) ^ (-1399942581);
                        i5 = -377347088;
                    } else {
                        iM3169 = (C0773.m3169("ܳۙ") ^ i3) * (-111);
                        i4 = ((iM3169 ^ i2) * 15409) ^ 399776042;
                        i5 = -1989415622;
                    }
                    break;
                case 795202869:
                case 1302490764:
                    if (C2485.f7950 == 0) {
                        iM3169 = C0619.m2761("ۙܿ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 19565) ^ (-237380645);
                        i5 = 984727794;
                    } else {
                        iM3169 = (C0619.m2761("ܺۚ") ^ i3) * (-21);
                        i4 = ((iM3169 ^ i2) * (-29955)) ^ (-1399942581);
                        i5 = -377347088;
                    }
                    break;
                case 879571703:
                case 1592968974:
                    break;
                case 1199351935:
                case 2127636437:
                    C1080.m4050();
                    break;
                case 1704579834:
                case 1861717780:
                    if (C1146.f4234 >= 0) {
                        iM3169 = (C0619.m2761("ܺۚ") ^ i3) * (-21);
                        i4 = ((iM3169 ^ i2) * (-29955)) ^ (-1399942581);
                        i5 = -377347088;
                    } else {
                        iM3169 = (C0619.m2761("۠ۨ") + i2) * (-27);
                        i4 = ((iM3169 ^ i3) * (-12105)) ^ (-322072369);
                        i5 = -1762698551;
                    }
                    break;
                default:
                    if (RunnableC0334.m2063()) {
                        iM3169 = (C0619.m2761("ܰ֡") ^ i2) * 27;
                        i4 = ((iM3169 ^ i3) * 20435) ^ 51945873;
                        i5 = -1646369482;
                    } else {
                        iM3169 = (C0773.m3169("᩵ۙ") + i2) * 73;
                        i4 = ((iM3169 ^ i3) * 3001) ^ 93109184;
                        i5 = -1800462931;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4883 m1397(C0168 c0168, C20348 c20348, C24132 c24132, C23582 c23582) throws Throwable {
        int i = 0;
        Throwable th = null;
        boolean zM46746 = false;
        boolean zMo11042 = false;
        C4883 c4883 = null;
        int i2 = 1759472565;
        int i3 = C3492.f12043;
        int i4 = C1321.f4751;
        int iM2761 = C0619.m2761("ۜܶ") ^ i3;
        int i5 = ((iM2761 ^ i4) * 4541) ^ 778961132;
        int i6 = 1421150953;
        while (true) {
            i2 = ((((i2 ^ i4) * (-8051)) >> 31) & i5) ^ (iM2761 ^ i6);
            switch (i2) {
                case -1776295695:
                case -34967427:
                    if (!C4282.m13644()) {
                        iM2761 = C0619.m2761("ۖ᩷") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-25091)) ^ 790027340;
                        i6 = -996654474;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ۢۖ")) * 27;
                        i5 = ((iM2761 ^ i4) * 30249) ^ (-695046706);
                        i6 = -1920615941;
                    }
                    break;
                case -1774938074:
                case 1145226309:
                    if (C0619.f2439) {
                        iM2761 = C0619.m2761("ۖ᩷") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-25091)) ^ 790027340;
                        i6 = -996654474;
                    } else {
                        iM2761 = C0773.m3169("ۡۡ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 23629) ^ (-23822937);
                        i6 = -622732291;
                    }
                    break;
                case -1754335668:
                case 851223342:
                    C2310.m7813();
                    iM2761 = C0619.m2761("ۖ᩷") ^ i4;
                    i5 = ((iM2761 ^ i3) * (-25091)) ^ 790027340;
                    i6 = -996654474;
                    break;
                case -1543889295:
                case -201372303:
                    if (!C0619.f2439) {
                        iM2761 = (C0773.m3169("᩷֫") + i4) * 77;
                        i5 = ((iM2761 ^ i3) * (-21821)) ^ (-1800033495);
                        i6 = -2129962664;
                    } else {
                        iM2761 = C0773.m3169("ᩴۘ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 207) ^ 2078550741;
                        i6 = 1235127802;
                    }
                    break;
                case -1524823498:
                case -1378610663:
                    C3998.m12920();
                    if (!C3099.m10095()) {
                        iM2761 = (i4 - C0619.m2761("֫۫")) * 27;
                        i5 = ((iM2761 ^ i3) * (-7713)) ^ (-1305623876);
                        i6 = 1877360484;
                    } else {
                        iM2761 = C0619.m2761("ۖ᩷") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-25091)) ^ 790027340;
                        i6 = -996654474;
                    }
                    break;
                case -1512773282:
                case 535480955:
                    if (C4282.f15546 <= 0) {
                        iM2761 = C0773.m3169("ᩳۖ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-5911)) ^ (-712378378);
                        i6 = 189790113;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ۢۖ")) * 27;
                        i5 = ((iM2761 ^ i4) * 30249) ^ (-695046706);
                        i6 = -1920615941;
                    }
                    break;
                case -1314627353:
                case 1992886222:
                    if (C0950.f3488 < 0) {
                        iM2761 = (C0773.m3169("᩷֫") + i4) * 77;
                        i5 = ((iM2761 ^ i3) * (-21821)) ^ (-1800033495);
                        i6 = -2129962664;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ۢۖ")) * 27;
                        i5 = ((iM2761 ^ i4) * 30249) ^ (-695046706);
                        i6 = -1920615941;
                    }
                    break;
                case -1163358835:
                case 143637877:
                    if (C3998.f13671 != 0) {
                        iM2761 = C0619.m2761("ۖ᩷") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-25091)) ^ 790027340;
                        i6 = -996654474;
                    } else {
                        iM2761 = C0619.m2761("ۖ᩻") ^ i3;
                        i5 = ((iM2761 ^ i4) * 11307) ^ (-150677330);
                        i6 = -959148381;
                    }
                    break;
                case -1143410687:
                case 1612332325:
                    if (C3033.f9831 >= 0) {
                        iM2761 = C0619.m2761("ۜ᩸") ^ i3;
                        i5 = ((iM2761 ^ i4) * 26575) ^ 1811083698;
                        i6 = -536265052;
                    } else {
                        iM2761 = C0773.m3169("ᩳۖ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-5911)) ^ (-712378378);
                        i6 = 189790113;
                    }
                    break;
                case -868245593:
                case 1644196716:
                    C1542.m5459();
                    return null;
                case -828706778:
                case -416209552:
                    if (C0269.f1558 <= 0) {
                        iM2761 = C0619.m2761("֡᩸") ^ i3;
                        i5 = ((iM2761 ^ i4) * 24089) ^ (-1987868524);
                        i6 = -1571670823;
                    } else {
                        iM2761 = C0619.m2761("۫ᩳ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 22427) ^ (-891478650);
                        i6 = 472949278;
                    }
                    break;
                case -780938261:
                case 2088360102:
                    if (C2702.f8586 <= 0) {
                        iM2761 = C0773.m3169("ᩴۘ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 207) ^ 2078550741;
                        i6 = 1235127802;
                    } else {
                        iM2761 = (C0773.m3169("᩵᩻") + i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i5 = ((iM2761 ^ i4) * (-22137)) ^ 1176144358;
                        i6 = 431344149;
                    }
                    break;
                case -719127537:
                case 1566442428:
                    if (C1519.f5300 >= 0) {
                        iM2761 = C0619.m2761("ۖ᩷") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-25091)) ^ 790027340;
                        i6 = -996654474;
                    } else {
                        iM2761 = (C0773.m3169("֨ܶ") + i4) * 53;
                        i5 = ((iM2761 ^ i3) * (-10597)) ^ 1937660478;
                        i6 = 560151517;
                    }
                    break;
                case -649864565:
                case 965084706:
                    try {
                        c24132.m53929(c0168.m24166(c0168.f1224.m11163()).m24699());
                        iM2761 = C0619.m2761("ᩴۡ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 26475) ^ (-680829655);
                        i6 = -305612732;
                    } catch (Throwable th2) {
                        th = th2;
                        iM2761 = (C0619.m2761("ۤ᩺") + i4) * 29;
                        i5 = ((iM2761 ^ i3) * (-23369)) ^ (-2019091292);
                        i6 = -2136751829;
                    }
                    break;
                case -634033456:
                case 1610779617:
                    zMo11042 = AbstractC3624.m11756(c24132).mo11042();
                    iM2761 = C0619.m2761("ۢۚ") ^ i3;
                    i5 = ((iM2761 ^ i4) * 99) ^ (-1334015927);
                    i6 = -326312021;
                    break;
                case -284858267:
                case 660889146:
                    if (C4282.f15546 <= 0) {
                        iM2761 = C0619.m2761("֡᩸") ^ i3;
                        i5 = ((iM2761 ^ i4) * 24089) ^ (-1987868524);
                        i6 = -1571670823;
                    } else {
                        iM2761 = C0773.m3169("ᩳۖ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-5911)) ^ (-712378378);
                        i6 = 189790113;
                    }
                    break;
                case -238087190:
                case 1153255542:
                    if (C3033.f9831 >= 0) {
                        iM2761 = (C0773.m3169("᩷֫") + i4) * 77;
                        i5 = ((iM2761 ^ i3) * (-21821)) ^ (-1800033495);
                        i6 = -2129962664;
                    } else {
                        iM2761 = (C0619.m2761("۫ۤ") + i4) * 95;
                        i5 = ((iM2761 ^ i3) * (-4547)) ^ 1648755015;
                        i6 = 876361692;
                    }
                    break;
                case -194541042:
                case 1339075648:
                    c24132.m53992(true);
                    i = 1382253410;
                    iM2761 = C0619.m2761("᩸ᩳ") ^ i3;
                    i5 = ((iM2761 ^ i4) * 21415) ^ (-828644153);
                    i6 = 1500371848;
                    break;
                case -103327518:
                case 1032372699:
                    c4883 = new C4883(AbstractC12454.m30925(c20348.m46756()));
                    iM2761 = C0773.m3169("֡ᩳ") ^ i3;
                    i5 = ((iM2761 ^ i4) * (-26735)) ^ (-699892111);
                    i6 = -909951253;
                    break;
                case -8741030:
                case 1723966797:
                    if (zMo11042) {
                        iM2761 = C0619.m2761("ᩴۡ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 26475) ^ (-680829655);
                        i6 = -305612732;
                    } else {
                        iM2761 = (C0773.m3169("ܰۨ") + i3) * 43;
                        i5 = ((iM2761 ^ i4) * (-31761)) ^ (-1317510503);
                        i6 = 1662315913;
                    }
                    break;
                case 47804543:
                case 562368109:
                    c4883 = null;
                    iM2761 = C0773.m3169("֡ᩳ") ^ i3;
                    i5 = ((iM2761 ^ i4) * (-26735)) ^ (-699892111);
                    i6 = -909951253;
                    break;
                case 111538398:
                case 1607418438:
                    c24132.m53992(false);
                    throw th;
                case 243575586:
                case 1554985984:
                    if (C0487.f2131 <= 0) {
                        iM2761 = C0619.m2761("֡ۤ") ^ i3;
                        i5 = ((iM2761 ^ i4) * 27375) ^ (-1895286213);
                        i6 = -1473324629;
                    } else {
                        iM2761 = C0619.m2761("۫۠") ^ i3;
                        i5 = ((iM2761 ^ i4) * 5581) ^ (-416737355);
                        i6 = 1546055132;
                    }
                    break;
                case 546879544:
                case 1172927580:
                    if (C2702.f8586 <= 0) {
                        iM2761 = C0619.m2761("ۜ᩸") ^ i3;
                        i5 = ((iM2761 ^ i4) * 26575) ^ 1811083698;
                        i6 = -536265052;
                    } else {
                        iM2761 = (C0773.m3169("᩺ۙ") + i4) * 59;
                        i5 = ((iM2761 ^ i3) * 16981) ^ (-1502456288);
                        i6 = -204560680;
                    }
                    break;
                case 602415582:
                case 1195593210:
                    if (C3998.f13671 != 0) {
                        iM2761 = (i3 - C0619.m2761("ۢۖ")) * 27;
                        i5 = ((iM2761 ^ i4) * 30249) ^ (-695046706);
                        i6 = -1920615941;
                    } else {
                        iM2761 = (C0773.m3169("ܳۘ") ^ i3) * (-27);
                        i5 = ((iM2761 ^ i4) * 22907) ^ (-1875632327);
                        i6 = -1595377632;
                    }
                    break;
                case 829536482:
                case 1251477946:
                    C17364.m40795((InterfaceC15872) c20348, i);
                    c0168.f1216 = C2023.m6956(c20348);
                    c0168.f1210 = C4282.m13659(c20348);
                    C17364.m40795((InterfaceC15872) c20348, i);
                    c24132.mo52303(c20348);
                    C17364.m40795((InterfaceC15872) c20348, i);
                    c23582.m52824(c20348);
                    C17364.m40795((InterfaceC15872) c20348, i);
                    c23582.m52813(c20348);
                    zM46746 = c20348.m46746(1382256833);
                    iM2761 = (C0619.m2761("᩸ܿ") + i3) * (-65);
                    i5 = ((iM2761 ^ i4) * 20351) ^ (-605892290);
                    i6 = -1961898967;
                    break;
                case 948786094:
                case 1944966408:
                    if (C4282.f15546 <= 0) {
                        iM2761 = C0619.m2761("֡᩸") ^ i3;
                        i5 = ((iM2761 ^ i4) * 24089) ^ (-1987868524);
                        i6 = -1571670823;
                    } else {
                        iM2761 = C0619.m2761("ܶۘ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-12495)) ^ 956479308;
                        i6 = 1464546013;
                    }
                    break;
                case 1211207698:
                case 1721749337:
                    if (zM46746) {
                        iM2761 = C0773.m3169("֫᩹") ^ i4;
                        i5 = ((iM2761 ^ i3) * 15515) ^ 108165197;
                        i6 = -1693395826;
                    } else {
                        iM2761 = C0773.m3169("ۗۡ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 17145) ^ (-548951926);
                        i6 = -1539213842;
                    }
                    break;
                case 1263754706:
                case 2091840334:
                    c24132.m54055();
                    return c4883;
                default:
                    if (C1321.f4751 < 0) {
                        iM2761 = (i4 - C0619.m2761("֫۫")) * 27;
                        i5 = ((iM2761 ^ i3) * (-7713)) ^ (-1305623876);
                        i6 = 1877360484;
                    } else {
                        iM2761 = (C0773.m3169("۟ۜ") ^ i3) * 35;
                        i5 = ((iM2761 ^ i4) * (-21669)) ^ 1312950424;
                        i6 = 528441058;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.view.View, android.widget.TextView, l.ۙۗۧ, l.ۨۛۧ, l.᩹۬᩸, l.᩺ۜ᩸] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    @Override // l.ComponentCallbacksC11612
    public final void onDestroyView() {
        boolean z = false;
        C4621 c4621 = null;
        C24132 c24132 = null;
        C23582 c23582 = null;
        ActivityC0848 activityC0848 = null;
        ?? r5 = 0;
        int i = -1885812752;
        int i2 = C1519.f5300;
        int i3 = C1542.f5343;
        int iM2761 = (C0619.m2761("۠۟") ^ i2) * 65;
        int i4 = ((iM2761 ^ i3) * 31399) ^ (-2021941376);
        int i5 = -1071358419;
        while (true) {
            i = ((((i ^ i3) * (-20731)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2115716202:
                case -349887906:
                    if (C0487.f2131 > 0) {
                        iM2761 = (C0773.m3169("۠۠") + i3) * (-101);
                        i4 = ((iM2761 ^ i2) * 18441) ^ 2005905778;
                        i5 = -323630059;
                    } else {
                        iM2761 = (C0773.m3169("᩶֡") ^ i2) * 57;
                        i4 = ((iM2761 ^ i3) * (-25495)) ^ (-818366897);
                        i5 = -996921062;
                    }
                    break;
                case -2061149451:
                case -552027982:
                    if (!C1080.m4050()) {
                        iM2761 = (i2 - C0773.m3169("ܽ᩵")) * (-27);
                        i4 = ((iM2761 ^ i3) * (-21669)) ^ (-98644579);
                        i5 = -333085259;
                    } else {
                        iM2761 = (C0773.m3169("۠۠") + i3) * (-101);
                        i4 = ((iM2761 ^ i2) * 18441) ^ 2005905778;
                        i5 = -323630059;
                    }
                    break;
                case -2033897802:
                case -389986047:
                    this.f1228 = z;
                    c4621 = this.f1213;
                    if (c4621 != null) {
                        iM2761 = C0619.m2761("᩸ۡ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-15927)) ^ 1349694211;
                        i5 = 1686240688;
                    } else {
                        iM2761 = C0773.m3169("ۧۗ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 195) ^ (-1263183201);
                        i5 = -1617978219;
                    }
                    break;
                case -1957993790:
                case 1140763327:
                    z = false;
                    if (C3099.f10023 <= 0) {
                        iM2761 = (i3 - C0773.m3169("ۧ۠")) * (-61);
                        i4 = ((iM2761 ^ i2) * 22209) ^ (-989401151);
                        i5 = 1559326091;
                    } else {
                        iM2761 = C0619.m2761("᩵ۨ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-17765)) ^ 1945546423;
                        i5 = -811084407;
                    }
                    break;
                case -1803978259:
                case -1778294300:
                    C1564.m5509();
                    C3690.m11987();
                    iM2761 = (C0773.m3169("᩶֡") ^ i2) * 57;
                    i4 = ((iM2761 ^ i3) * (-25495)) ^ (-818366897);
                    i5 = -996921062;
                    break;
                case -1719833239:
                case -1380201742:
                    this.f1227 = r5;
                    this.f1217 = r5;
                    if (C3779.m12264()) {
                        iM2761 = C0773.m3169("ۜ᩵") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-11961)) ^ (-1822973419);
                        i5 = -196021809;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ۧ۠")) * (-61);
                        i4 = ((iM2761 ^ i2) * 22209) ^ (-989401151);
                        i5 = 1559326091;
                    }
                    break;
                case -1605572292:
                case 769853173:
                    c4621.close();
                    iM2761 = C0773.m3169("ۧۗ") ^ i2;
                    i4 = ((iM2761 ^ i3) * 195) ^ (-1263183201);
                    i5 = -1617978219;
                    break;
                case -1550421151:
                case 1004180030:
                    r5 = 0;
                    r5 = 0;
                    if (C2878.m9491() <= 0) {
                        iM2761 = (C0773.m3169("᩶֡") ^ i2) * 57;
                        i4 = ((iM2761 ^ i3) * (-25495)) ^ (-818366897);
                        i5 = -996921062;
                    } else {
                        iM2761 = (C0773.m3169("ۘ۫") ^ i2) * (-77);
                        i4 = ((iM2761 ^ i3) * 7503) ^ 700939011;
                        i5 = 1585319597;
                    }
                    break;
                case -1488105889:
                case 548691512:
                    activityC0848.m40414();
                    if (RunnableC0334.m2063()) {
                        iM2761 = (C0773.m3169("۠۠") + i3) * (-101);
                        i4 = ((iM2761 ^ i2) * 18441) ^ 2005905778;
                        i5 = -323630059;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ۤۢ")) * 13;
                        i4 = ((iM2761 ^ i2) * 32153) ^ (-2013776354);
                        i5 = -2110710296;
                    }
                    break;
                case -1370705300:
                case 1089589370:
                    c24132 = this.f1217;
                    if (c24132 != null) {
                        iM2761 = C0773.m3169("ۘۨ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 17533) ^ 1331313600;
                        i5 = -146877168;
                    } else {
                        iM2761 = C0773.m3169("ܿܰ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 15487) ^ 1379550071;
                        i5 = 1401006004;
                    }
                    break;
                case -1120805126:
                case -522364631:
                    this.f1208 = r5;
                    this.f1225 = r5;
                    if (C4282.f15546 <= 0) {
                        iM2761 = (C0773.m3169("᩶֡") ^ i2) * 57;
                        i4 = ((iM2761 ^ i3) * (-25495)) ^ (-818366897);
                        i5 = -996921062;
                    } else {
                        iM2761 = (C0619.m2761("۠ܰ") ^ i2) * (-127);
                        i4 = ((iM2761 ^ i3) * 24165) ^ (-258184828);
                        i5 = 16898457;
                    }
                    break;
                case -917960312:
                case 675323455:
                    c24132.m53966();
                    iM2761 = C0773.m3169("ܿܰ") ^ i3;
                    i4 = ((iM2761 ^ i2) * 15487) ^ 1379550071;
                    i5 = 1401006004;
                    break;
                case -793869815:
                case 519035893:
                    activityC0848 = (ActivityC0848) AbstractC0116.m1234(this);
                    if (C1343.f4799 != 0) {
                        iM2761 = (i2 - C0773.m3169("ܽ᩵")) * (-27);
                        i4 = ((iM2761 ^ i3) * (-21669)) ^ (-98644579);
                        i5 = -333085259;
                    } else {
                        iM2761 = (i3 - C0773.m3169("֡֨")) * (-57);
                        i4 = ((iM2761 ^ i2) * 21009) ^ (-305628933);
                        i5 = -1982853925;
                    }
                    break;
                case -697814982:
                case -515307135:
                    if (AbstractC3624.f12429 <= 0) {
                        iM2761 = (C0619.m2761("᩸᩺") + i3) * 99;
                        i4 = ((iM2761 ^ i2) * 3807) ^ (-845925022);
                        i5 = -199901394;
                    } else {
                        iM2761 = C0773.m3169("۟᩺") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-31109)) ^ 201156230;
                        i5 = -809841099;
                    }
                    break;
                case -525488463:
                case -168296272:
                    C1146.m4231();
                    if (C23916.f77426 <= 0) {
                        iM2761 = (C0619.m2761("᩸᩺") + i3) * 99;
                        i4 = ((iM2761 ^ i2) * 3807) ^ (-845925022);
                        i5 = -199901394;
                    } else {
                        iM2761 = (C0773.m3169("᩶֡") ^ i2) * 57;
                        i4 = ((iM2761 ^ i3) * (-25495)) ^ (-818366897);
                        i5 = -996921062;
                    }
                    break;
                case 107929902:
                case 2030464697:
                    C2288.m7767();
                    break;
                case 281325937:
                case 456175887:
                    if (C1519.f5300 >= 0) {
                        iM2761 = (C0619.m2761("᩸᩺") + i3) * 99;
                        i4 = ((iM2761 ^ i2) * 3807) ^ (-845925022);
                        i5 = -199901394;
                    } else {
                        iM2761 = (i2 - C0619.m2761("ۘܰ")) * (-101);
                        i4 = ((iM2761 ^ i3) * (-20013)) ^ 870469598;
                        i5 = 1479328287;
                    }
                    break;
                case 559533430:
                case 1848978973:
                    this.f1213 = r5;
                    if (C3690.f12684 <= 0) {
                        iM2761 = (C0773.m3169("᩶֡") ^ i2) * 57;
                        i4 = ((iM2761 ^ i3) * (-25495)) ^ (-818366897);
                        i5 = -996921062;
                    } else {
                        iM2761 = C0773.m3169("֨ۤ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-20593)) ^ (-1970208415);
                        i5 = 1684283112;
                    }
                    break;
                case 755329272:
                case 1684593880:
                    this.f1221 = r5;
                    this.f1212 = r5;
                    break;
                case 886102156:
                case 1543892764:
                    c23582.m52821();
                    iM2761 = C0619.m2761("ᩴᩳ") ^ i2;
                    i4 = ((iM2761 ^ i3) * 10169) ^ 213199344;
                    i5 = -1047394891;
                    break;
                case 1670132889:
                case 2134205933:
                    super.onDestroyView();
                    if (C3492.m11488()) {
                        iM2761 = C0619.m2761("ۖܳ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-14195)) ^ (-2769139);
                        i5 = -1473768784;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ۧ۠")) * (-61);
                        i4 = ((iM2761 ^ i2) * 22209) ^ (-989401151);
                        i5 = 1559326091;
                    }
                    break;
                default:
                    c23582 = this.f1208;
                    if (c23582 != null) {
                        iM2761 = (i2 - C0773.m3169("᩸ܽ")) * (-95);
                        i4 = ((iM2761 ^ i3) * 12283) ^ 1370302594;
                        i5 = 636190262;
                    } else {
                        iM2761 = C0619.m2761("ᩴᩳ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 10169) ^ 213199344;
                        i5 = -1047394891;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0268 A[PHI: r4 r7 r12 r16
      0x0268: PHI (r4v5 java.lang.String) = (r4v2 java.lang.String), (r4v2 java.lang.String), (r4v4 java.lang.String), (r4v2 java.lang.String) binds: [B:63:0x0266, B:51:0x01e7, B:40:0x0168, B:14:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x0268: PHI (r7v4 int) = (r7v2 int), (r7v2 int), (r7v2 int), (r7v5 int) binds: [B:63:0x0266, B:51:0x01e7, B:40:0x0168, B:14:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x0268: PHI (r12v4 short) = (r12v2 short), (r12v3 short), (r12v2 short), (r12v2 short) binds: [B:63:0x0266, B:51:0x01e7, B:40:0x0168, B:14:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x0268: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:63:0x0266, B:51:0x01e7, B:40:0x0168, B:14:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x029c A[PHI: r2 r3 r9 r21
      0x029c: PHI (r2v3 l.ۤۢ) = (r2v2 l.ۤۢ), (r2v2 l.ۤۢ), (r2v5 l.ۤۢ) binds: [B:67:0x029a, B:59:0x0246, B:32:0x00fd] A[DONT_GENERATE, DONT_INLINE]
      0x029c: PHI (r3v3 l.᩹۬᩸) = (r3v2 l.᩹۬᩸), (r3v2 l.᩹۬᩸), (r3v4 l.᩹۬᩸) binds: [B:67:0x029a, B:59:0x0246, B:32:0x00fd] A[DONT_GENERATE, DONT_INLINE]
      0x029c: PHI (r9v4 short) = (r9v2 short), (r9v3 short), (r9v2 short) binds: [B:67:0x029a, B:59:0x0246, B:32:0x00fd] A[DONT_GENERATE, DONT_INLINE]
      0x029c: PHI (r21v5 int) = (r21v3 int), (r21v4 int), (r21v3 int) binds: [B:67:0x029a, B:59:0x0246, B:32:0x00fd] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.ComponentCallbacksC11612
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        int iM2761;
        int i;
        int i2;
        int iM2762;
        int i3;
        Menu menu2 = menu;
        int i4 = C3779.f12953;
        int i5 = C2419.f7754;
        int iM3169 = (i4 - C0773.m3169("᩶ۘ")) * 69;
        int i6 = ((iM3169 ^ i5) * 4423) ^ 1570110787;
        String strM6966 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i7 = iM3169 ^ 775926010;
        int iM31610 = 0;
        int i8 = 0;
        int iM31611 = 0;
        int i9 = 0;
        short s = 0;
        int i10 = 0;
        short s2 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = -805238007;
        int i14 = 0;
        C23582 c23582 = null;
        InterfaceMenuC10774 interfaceMenuC10774 = null;
        while (true) {
            i13 = i7 ^ (i6 & (((i13 ^ i5) * (-22457)) >> 31));
            switch (i13) {
                case -2066442286:
                case 448819042:
                    int i15 = i14 + 43164900;
                    i10 = i15 + i15;
                    if (C0950.f3488 >= 0) {
                        iM2762 = C0619.m2761("ۜ᩺") ^ i4;
                        i6 = ((iM2762 ^ i5) * (-7791)) ^ 66281432;
                        i3 = -1942693329;
                    } else {
                        iM2762 = C0619.m2761("ܶ᩷") ^ i4;
                        i6 = ((iM2762 ^ i5) * 13769) ^ 1776215858;
                        i3 = -72665096;
                    }
                    i7 = iM2762 ^ i3;
                    menu2 = menu;
                    break;
                case -1998730086:
                case 1324729749:
                    C0862.m3503();
                    break;
                case -1823648745:
                case -370552320:
                    C2878.m9491();
                    if (RunnableC0334.f1808 <= 0) {
                        iM2761 = (C0773.m3169("ܿ᩻") ^ i5) * 7;
                        i = ((iM2761 ^ i4) * 9807) ^ 1596420931;
                        i2 = 53605982;
                        i7 = iM2761 ^ i2;
                        i6 = i;
                    } else {
                        iM2762 = (C0619.m2761("ᩴ᩺") ^ i5) * 35;
                        i6 = ((iM2762 ^ i4) * 431) ^ 501999553;
                        i3 = -384152783;
                        i7 = iM2762 ^ i3;
                        menu2 = menu;
                    }
                    break;
                case -1679694532:
                case -1309737003:
                    int i16 = s + s2;
                    if (i10 - (i16 * i16) >= 0) {
                        iM2762 = (i4 - C0773.m3169("᩸۟")) * 63;
                        i6 = ((iM2762 ^ i5) * (-2581)) ^ (-2100401933);
                        i3 = -2109418683;
                    } else {
                        iM2762 = (i4 - C0619.m2761("ۘ۬")) * 57;
                        i6 = ((iM2762 ^ i5) * (-28697)) ^ (-571720606);
                        i3 = -373823357;
                    }
                    i7 = iM2762 ^ i3;
                    menu2 = menu;
                    break;
                case -1676161447:
                case -1566420378:
                    C11235.m28309();
                    if (C3033.f9831 >= 0) {
                        iM2762 = C0619.m2761("᩺ۗ") ^ i5;
                        i6 = ((iM2762 ^ i4) * 27275) ^ (-1649624324);
                        i3 = 1637689367;
                        i7 = iM2762 ^ i3;
                        menu2 = menu;
                    } else {
                        iM2761 = (C0773.m3169("ܿ᩻") ^ i5) * 7;
                        i = ((iM2761 ^ i4) * 9807) ^ 1596420931;
                        i2 = 53605982;
                        i7 = iM2761 ^ i2;
                        i6 = i;
                    }
                    break;
                case -1515426809:
                case 528029469:
                    C1343.m4943();
                    C2354.m7983();
                    iM2762 = (C0619.m2761("ᩴ᩺") ^ i5) * 35;
                    i6 = ((iM2762 ^ i4) * 431) ^ 501999553;
                    i3 = -384152783;
                    i7 = iM2762 ^ i3;
                    menu2 = menu;
                    break;
                case -1425212143:
                case -472643365:
                    i11 = 45290;
                    iM2762 = C0773.m3169("ܿᩳ") ^ i5;
                    i6 = ((iM2762 ^ i4) * 16243) ^ (-1577336768);
                    i3 = -326595936;
                    i7 = iM2762 ^ i3;
                    menu2 = menu;
                    break;
                case -1422447036:
                case -205416549:
                    iM31611 = C0773.m3169(C3448.m11252(sArr2, i12, i9, i11));
                    if (!C13473.m33144()) {
                        iM2762 = (C0619.m2761("ᩴ᩺") ^ i5) * 35;
                        i6 = ((iM2762 ^ i4) * 431) ^ 501999553;
                        i3 = -384152783;
                        i7 = iM2762 ^ i3;
                        menu2 = menu;
                    } else {
                        iM2761 = (i4 - C0619.m2761("ᩴܰ")) * (-9);
                        i = ((iM2761 ^ i5) * 1319) ^ 343094891;
                        i2 = -1569820447;
                        i7 = iM2761 ^ i2;
                        i6 = i;
                    }
                    break;
                case -1278808658:
                case -1175025996:
                    i11 = 7714;
                    iM2762 = C0773.m3169("ܿᩳ") ^ i5;
                    i6 = ((iM2762 ^ i4) * 16243) ^ (-1577336768);
                    i3 = -326595936;
                    i7 = iM2762 ^ i3;
                    menu2 = menu;
                    break;
                case -1200395196:
                case 758046099:
                    C2287.m7745();
                    if (C0950.f3488 < 0) {
                        iM2762 = C0619.m2761("ۜ᩺") ^ i4;
                        i6 = ((iM2762 ^ i5) * (-7791)) ^ 66281432;
                        i3 = -1942693329;
                        i7 = iM2762 ^ i3;
                        menu2 = menu;
                    }
                    iM2762 = (C0619.m2761("ᩴ᩺") ^ i5) * 35;
                    i6 = ((iM2762 ^ i4) * 431) ^ 501999553;
                    i3 = -384152783;
                    i7 = iM2762 ^ i3;
                    menu2 = menu;
                    break;
                case -886217308:
                case -750573456:
                    sArr = f1206;
                    if (C4238.f15451 >= 0) {
                        iM2762 = (C0619.m2761("ᩴ᩺") ^ i5) * 35;
                        i6 = ((iM2762 ^ i4) * 431) ^ 501999553;
                        i3 = -384152783;
                    } else {
                        iM2762 = (C0773.m3169("᩺ۙ") ^ i4) * (-29);
                        i6 = ((iM2762 ^ i5) * (-11317)) ^ (-1168867615);
                        i3 = 479850932;
                    }
                    i7 = iM2762 ^ i3;
                    menu2 = menu;
                    break;
                case -768371505:
                case 260625560:
                    s2 = 6570;
                    if (C4282.f15546 <= 0) {
                        iM2762 = (C0619.m2761("ᩴ᩺") ^ i5) * 35;
                        i6 = ((iM2762 ^ i4) * 431) ^ 501999553;
                        i3 = -384152783;
                    } else {
                        iM2762 = C0619.m2761("᩶᩺") ^ i5;
                        i6 = ((iM2762 ^ i4) * 16463) ^ 129709537;
                        i3 = 966422683;
                    }
                    i7 = iM2762 ^ i3;
                    menu2 = menu;
                    break;
                case -354353190:
                case 1938906721:
                    iM31610 = C0773.m3169(strM6966);
                    i8 = 2123814664;
                    if (AbstractC3624.f12429 <= 0) {
                        iM2762 = C0619.m2761("᩺ۗ") ^ i5;
                        i6 = ((iM2762 ^ i4) * 27275) ^ (-1649624324);
                        i3 = 1637689367;
                    } else {
                        iM2762 = (C0619.m2761("۬ۡ") + i4) * (-117);
                        i6 = ((iM2762 ^ i5) * 23299) ^ (-1720356715);
                        i3 = -949762428;
                    }
                    i7 = iM2762 ^ i3;
                    menu2 = menu;
                    break;
                case -300402408:
                case 732922583:
                    c23582.m52805(RunnableC0334.m2062(interfaceMenuC10774, 2117201702 ^ iM31611));
                    break;
                case 72894901:
                case 1442587503:
                    s = sArr[201];
                    i14 = s * s;
                    if (C0950.m3785() != 0) {
                        iM2762 = C0773.m3169("᩻ۡ") ^ i4;
                        i6 = ((iM2762 ^ i5) * 24135) ^ (-232931607);
                        i3 = -1959186282;
                    } else {
                        iM2762 = (C0619.m2761("ۜۨ") ^ i5) * 53;
                        i6 = ((iM2762 ^ i4) * (-13539)) ^ 1885737560;
                        i3 = 1516768348;
                    }
                    i7 = iM2762 ^ i3;
                    menu2 = menu;
                    break;
                case 453946270:
                case 1974194399:
                    if (C13473.f42873 != 0) {
                        iM2762 = C0773.m3169("᩻ۡ") ^ i4;
                        i6 = ((iM2762 ^ i5) * 24135) ^ (-232931607);
                        i3 = -1959186282;
                    } else {
                        iM2762 = C0619.m2761("ۢ᩷") ^ i5;
                        i6 = ((iM2762 ^ i4) * 12085) ^ 1695658601;
                        i3 = 1530136111;
                    }
                    i7 = iM2762 ^ i3;
                    menu2 = menu;
                    break;
                case 999933277:
                case 1666216497:
                    menuInflater.inflate(iM31610 ^ i8, menu2);
                    interfaceMenuC10774 = (InterfaceMenuC10774) menu2;
                    c23582 = this.f1208;
                    if (C2288.f7433 <= 0) {
                        iM2762 = C0773.m3169("᩻ۡ") ^ i4;
                        i6 = ((iM2762 ^ i5) * 24135) ^ (-232931607);
                        i3 = -1959186282;
                        i7 = iM2762 ^ i3;
                    } else {
                        int iM2763 = (C0619.m2761("֡֨") + i4) * 65;
                        int i17 = ((iM2763 ^ i5) * (-19053)) ^ (-234844006);
                        i7 = iM2763 ^ (-519067618);
                        i6 = i17;
                    }
                    menu2 = menu;
                    break;
                case 1694478398:
                case 1830054918:
                    strM6966 = C2023.m6966(f1206, 202, 3, i11);
                    if (C1321.m4852()) {
                        iM2762 = C0619.m2761("ܰ᩸") ^ i5;
                        i6 = ((iM2762 ^ i4) * 32161) ^ 588324815;
                        i3 = -68786525;
                    } else {
                        iM2762 = (C0619.m2761("ᩴ᩺") ^ i5) * 35;
                        i6 = ((iM2762 ^ i4) * 431) ^ 501999553;
                        i3 = -384152783;
                    }
                    i7 = iM2762 ^ i3;
                    menu2 = menu;
                    break;
                default:
                    sArr2 = f1206;
                    i12 = 205;
                    i9 = 3;
                    if (C2023.f6737) {
                        iM2761 = (C0773.m3169("ܿ᩻") ^ i5) * 7;
                        i = ((iM2761 ^ i4) * 9807) ^ 1596420931;
                        i2 = 53605982;
                    } else {
                        iM2761 = C0619.m2761("ܺܽ") ^ i5;
                        i = ((iM2761 ^ i4) * (-22249)) ^ 1894936374;
                        i2 = 591399053;
                    }
                    i7 = iM2761 ^ i2;
                    i6 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x012e  */
    /* JADX WARN: Code duplicated, block: B:52:0x01b3 A[PHI: r2 r3 r11
      0x01b3: PHI (r2v4 l.ᩳ֫ܺ) = (r2v2 l.ᩳ֫ܺ), (r2v3 l.ᩳ֫ܺ), (r2v2 l.ᩳ֫ܺ) binds: [B:51:0x01b1, B:36:0x010b, B:12:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x01b3: PHI (r3v4 int) = (r3v2 int), (r3v3 int), (r3v2 int) binds: [B:51:0x01b1, B:36:0x010b, B:12:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x01b3: PHI (r11v4 short) = (r11v3 short), (r11v2 short), (r11v2 short) binds: [B:51:0x01b1, B:36:0x010b, B:12:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x01eb A[PHI: r10
      0x01eb: PHI (r10v4 int) = (r10v3 int), (r10v2 int), (r10v2 int) binds: [B:55:0x01e9, B:15:0x0073, B:12:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x023f A[PHI: r4 r7
      0x023f: PHI (r4v4 byte) = (r4v2 byte), (r4v3 byte), (r4v2 byte) binds: [B:63:0x023d, B:32:0x00e6, B:9:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x023f: PHI (r7v4 char) = (r7v3 char), (r7v2 char), (r7v2 char) binds: [B:63:0x023d, B:32:0x00e6, B:9:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x0271 A[PHI: r5 r19
      0x0271: PHI (r5v3 l.ᩳ֫ܺ) = (r5v2 l.ᩳ֫ܺ), (r5v2 l.ᩳ֫ܺ), (r5v2 l.ᩳ֫ܺ), (r5v2 l.ᩳ֫ܺ), (r5v5 l.ᩳ֫ܺ) binds: [B:67:0x026f, B:17:0x0077, B:15:0x0073, B:9:0x0061, B:6:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x0271: PHI (r19v5 short[]) = (r19v4 short[]), (r19v3 short[]), (r19v3 short[]), (r19v3 short[]), (r19v3 short[]) binds: [B:67:0x026f, B:17:0x0077, B:15:0x0073, B:9:0x0061, B:6:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x02a2 A[PHI: r8 r9 r13 r14
      0x02a2: PHI (r8v4 short) = (r8v2 short), (r8v3 short), (r8v2 short) binds: [B:71:0x02a0, B:59:0x021f, B:28:0x00c8] A[DONT_GENERATE, DONT_INLINE]
      0x02a2: PHI (r9v4 int) = (r9v2 int), (r9v3 int), (r9v2 int) binds: [B:71:0x02a0, B:59:0x021f, B:28:0x00c8] A[DONT_GENERATE, DONT_INLINE]
      0x02a2: PHI (r13v3 short[]) = (r13v2 short[]), (r13v2 short[]), (r13v4 short[]) binds: [B:71:0x02a0, B:59:0x021f, B:28:0x00c8] A[DONT_GENERATE, DONT_INLINE]
      0x02a2: PHI (r14v3 int) = (r14v2 int), (r14v2 int), (r14v4 int) binds: [B:71:0x02a0, B:59:0x021f, B:28:0x00c8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m1409(C0168 c0168, DialogInterfaceC8327 dialogInterfaceC8327) {
        int iM3169;
        int i;
        int i2;
        int i3 = C11235.f35427;
        int i4 = C1146.f4234;
        int iM2761 = (C0619.m2761("ܶܽ") ^ i4) * (-87);
        int i5 = ((iM2761 ^ i3) * 3969) ^ (-1253102176);
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM2761 ^ (-1522791082);
        InterfaceC18752 interfaceC18752M11489 = null;
        int i7 = 0;
        char c = 0;
        short s = 0;
        int i8 = 0;
        int i9 = 0;
        short s2 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = -919822458;
        InterfaceC18752 interfaceC18752Mo3485 = null;
        byte b = 0;
        while (true) {
            i12 = i6 ^ (i5 & (((i12 ^ i3) * 22177) >> 31));
            switch (i12) {
                case -2019106742:
                case 286375664:
                    C11235.m28308(interfaceC18752Mo3485);
                    if (c0168.f1228) {
                        iM3169 = (C0773.m3169("᩷ۜ") + i3) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM3169 ^ i4) * (-17627)) ^ 377331029;
                        i2 = -258762132;
                    } else {
                        iM3169 = C0773.m3169("ܽ۫") ^ i4;
                        i = ((iM3169 ^ i3) * (-28585)) ^ (-1630508883);
                        i2 = 393855909;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1885242260:
                case -1493140759:
                    break;
                case -1787386977:
                case 882650655:
                    C3448.m11245(new C21051(c0168));
                    break;
                case -1779370328:
                case 1985958862:
                    C17202.m40372();
                    iM3169 = (C0619.m2761("ܶܳ") + i3) * (-39);
                    i = ((iM3169 ^ i4) * 3391) ^ 662744100;
                    i2 = -1343287281;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1680503428:
                case -626143506:
                    i10 = 20586;
                    iM3169 = (C0773.m3169("᩷᩵") ^ i4) * 19;
                    i = ((iM3169 ^ i3) * (-3793)) ^ (-1195656608);
                    i2 = 1724099978;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1641959052:
                case -515901848:
                    i10 = 1465;
                    iM3169 = (C0773.m3169("᩷᩵") ^ i4) * 19;
                    i = ((iM3169 ^ i3) * (-3793)) ^ (-1195656608);
                    i2 = 1724099978;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1586128618:
                case 223513724:
                    s = sArr[c];
                    i8 = s * s;
                    if (C2354.f7599 >= 0) {
                        iM3169 = C0619.m2761("ۜ֫") ^ i4;
                        i = ((iM3169 ^ i3) * (-16027)) ^ 1188798878;
                        i2 = -10863351;
                    } else {
                        iM3169 = C0619.m2761("ۨۜ") ^ i4;
                        i = ((iM3169 ^ i3) * (-19253)) ^ 1075316131;
                        i2 = -691883901;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1549911973:
                case 1651735586:
                    if (C1343.f4799 != 0) {
                        iM3169 = C0619.m2761("ۜ֫") ^ i4;
                        i = ((iM3169 ^ i3) * (-16027)) ^ 1188798878;
                        i2 = -10863351;
                    } else {
                        iM3169 = C0773.m3169("᩵ۧ") ^ i3;
                        i = ((iM3169 ^ i4) * (-24499)) ^ 1351519982;
                        i2 = 1010949541;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1365191197:
                case -1185535623:
                    sArr = f1206;
                    if (C0619.f2439) {
                        iM3169 = (C0619.m2761("ܶܳ") + i3) * (-39);
                        i = ((iM3169 ^ i4) * 3391) ^ 662744100;
                        i2 = -1343287281;
                    } else {
                        iM3169 = (C0773.m3169("᩺ܺ") ^ i4) * (-71);
                        i = ((iM3169 ^ i3) * (-16885)) ^ 1201554520;
                        i2 = 666884937;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1235376607:
                case -352324395:
                    sArr2 = f1206;
                    i11 = 171;
                    if (C20932.f66974 <= 0) {
                        iM3169 = C0619.m2761("ۜ֫") ^ i4;
                        i = ((iM3169 ^ i3) * (-16027)) ^ 1188798878;
                        i2 = -10863351;
                    } else {
                        iM3169 = (C0619.m2761("۬ᩳ") ^ i3) * (-111);
                        i = ((iM3169 ^ i4) * (-7473)) ^ 690573917;
                        i2 = -341733123;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1006664272:
                case 945874400:
                    C2966.m9664();
                    if (C3077.f9998) {
                        iM3169 = (C0619.m2761("᩵᩶") + i4) * (-31);
                        i = ((iM3169 ^ i3) * (-19533)) ^ (-2012703885);
                        i2 = 890760939;
                    } else {
                        iM3169 = (C0619.m2761("᩶ܳ") ^ i3) * 123;
                        i = ((iM3169 ^ i4) * (-19909)) ^ (-436291455);
                        i2 = -214312969;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -974084671:
                case 699468347:
                    c = 170;
                    if (C0619.f2439) {
                        iM3169 = (C0619.m2761("ܿᩴ") + i4) * q.h;
                        i = ((iM3169 ^ i3) * (-8573)) ^ (-574917731);
                        i2 = 333276635;
                    } else {
                        iM3169 = C0773.m3169("ۖ᩷") ^ i3;
                        i = ((iM3169 ^ i4) * 9529) ^ (-2102378667);
                        i2 = -1615834807;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -799836914:
                case 1629961284:
                    C3734.m12152();
                    if (C4238.f15451 < 0) {
                        iM3169 = (C0619.m2761("ܶܳ") + i3) * (-39);
                        i = ((iM3169 ^ i4) * 3391) ^ 662744100;
                        i2 = -1343287281;
                    } else {
                        iM3169 = (C0619.m2761("᩵᩶") + i4) * (-31);
                        i = ((iM3169 ^ i3) * (-19533)) ^ (-2012703885);
                        i2 = 890760939;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -433038712:
                case 802759764:
                    if (i9 - (s * s2) >= 0) {
                        iM3169 = C0773.m3169("᩻᩺") ^ i3;
                        i = ((iM3169 ^ i4) * (-5141)) ^ 128238289;
                        i2 = 154464631;
                    } else {
                        iM3169 = C0773.m3169("۟۬") ^ i4;
                        i = ((iM3169 ^ i3) * (-14543)) ^ (-1962929705);
                        i2 = 777532571;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 28068542:
                case 2144136670:
                    C11235.m28311(dialogInterfaceC8327);
                    if (c0168.f1216 == c0168.f1220) {
                        iM3169 = C0773.m3169("ܽ۫") ^ i4;
                        i = ((iM3169 ^ i3) * (-28585)) ^ (-1630508883);
                        i2 = 393855909;
                    } else {
                        iM3169 = (C0773.m3169("ۢۜ") + i3) * (-117);
                        i = ((iM3169 ^ i4) * 27395) ^ 68033210;
                        i2 = -1969404379;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 93216972:
                case 889598843:
                    s2 = 4232;
                    if (C2375.f7641 <= 0) {
                        iM3169 = (C0619.m2761("᩶ܳ") ^ i3) * 123;
                        i = ((iM3169 ^ i4) * (-19909)) ^ (-436291455);
                        i2 = -214312969;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ۚ᩺")) * (-45);
                        i = ((iM3169 ^ i4) * 28717) ^ 1814859290;
                        i2 = 29348808;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 136351437:
                case 1420075583:
                    interfaceC18752M11489 = C3492.m11489(ApplicationC17729.f58258);
                    i7 = c0168.f1220;
                    if (C1519.f5300 >= 0) {
                        iM3169 = (C0619.m2761("᩶ܳ") ^ i3) * 123;
                        i = ((iM3169 ^ i4) * (-19909)) ^ (-436291455);
                        i2 = -214312969;
                    } else {
                        iM3169 = C0773.m3169("۫ۜ") ^ i4;
                        i = ((iM3169 ^ i3) * (-28387)) ^ 121616195;
                        i2 = -1469917319;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 404444202:
                case 1969947810:
                    b = (byte) i7;
                    if (C0862.f3233 != 0) {
                        iM3169 = (C0619.m2761("ܿᩴ") + i4) * q.h;
                        i = ((iM3169 ^ i3) * (-8573)) ^ (-574917731);
                        i2 = 333276635;
                    } else {
                        iM3169 = (C0619.m2761("ۨ۠") ^ i3) * (-57);
                        i = ((iM3169 ^ i4) * (-27745)) ^ 1358964222;
                        i2 = -47905643;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 505083040:
                case 1723544181:
                    i9 = i8 + 4477456;
                    if (C0269.f1558 <= 0) {
                        iM3169 = (C0619.m2761("᩵᩶") + i4) * (-31);
                        i = ((iM3169 ^ i3) * (-19533)) ^ (-2012703885);
                        i2 = 890760939;
                    } else {
                        iM3169 = C0773.m3169("ۨ۫") ^ i4;
                        i = ((iM3169 ^ i3) * 23019) ^ (-709871440);
                        i2 = -2055229318;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 814225254:
                case 873122583:
                    C1564.m5509();
                    C1080.m4050();
                    break;
                case 1327741252:
                case 1553468679:
                    AbstractC0116.m1243();
                    if (C0269.f1558 > 0) {
                        iM3169 = (C0619.m2761("ܶܳ") + i3) * (-39);
                        i = ((iM3169 ^ i4) * 3391) ^ 662744100;
                        i2 = -1343287281;
                    } else {
                        iM3169 = (C0619.m2761("ܿᩴ") + i4) * q.h;
                        i = ((iM3169 ^ i3) * (-8573)) ^ (-574917731);
                        i2 = 333276635;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                default:
                    interfaceC18752Mo3485 = interfaceC18752M11489.mo3485(b, RunnableC3646.m11809(sArr2, i11, 20, i10));
                    if (C4238.f15451 >= 0) {
                        iM3169 = (C0619.m2761("ܶܳ") + i3) * (-39);
                        i = ((iM3169 ^ i4) * 3391) ^ 662744100;
                        i2 = -1343287281;
                    } else {
                        iM3169 = C0773.m3169("۬ܽ") ^ i4;
                        i = ((iM3169 ^ i3) * 24931) ^ (-156289649);
                        i2 = 937386905;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m1425(C0168 c0168) {
        C20283 c20283 = null;
        C12318 c12318 = null;
        C9378 c9378M11163 = null;
        C9378 c9378M24173 = null;
        byte[] bArrM24700 = null;
        C20348 c20348M46740 = null;
        int i = 0;
        C9378 c9378M11164 = null;
        int i2 = 0;
        int i3 = 38421410;
        int i4 = AbstractC0116.f1064;
        int i5 = C2310.f7472;
        int iM3169 = (C0773.m3169("ۨۧ") + i4) * (-11);
        int i6 = ((iM3169 ^ i5) * 29615) ^ 1724102796;
        int i7 = -2114000359;
        while (true) {
            i3 = ((((i3 ^ i5) * (-28725)) >> 31) & i6) ^ (iM3169 ^ i7);
            switch (i3) {
                case -2123303738:
                case 436993352:
                    bArrM24700 = c9378M24173.m24700();
                    if (C2310.m7813() <= 0) {
                        iM3169 = (C0773.m3169("᩻᩷") + i4) * 75;
                        i6 = ((iM3169 ^ i5) * 24831) ^ 1725291417;
                        i7 = 2103093098;
                    } else {
                        iM3169 = C0773.m3169("᩹ܶ") ^ i5;
                        i6 = ((iM3169 ^ i4) * (-17871)) ^ (-483636724);
                        i7 = 797187328;
                    }
                    break;
                case -2032664107:
                case -1842902187:
                    if (C22415.m50557()) {
                        iM3169 = (C0773.m3169("ܺᩳ") + i4) * 73;
                        i6 = ((iM3169 ^ i5) * (-18855)) ^ 1023901187;
                        i7 = 825980480;
                    } else {
                        iM3169 = (C0619.m2761("ܿ۬") + i5) * 81;
                        i6 = ((iM3169 ^ i4) * 13389) ^ 2094539244;
                        i7 = 2049273510;
                    }
                    break;
                case -2015434256:
                case 1488181474:
                    C17364.m40795((InterfaceC15872) c20348M46740, i);
                    if (C1080.f3865 >= 0) {
                        iM3169 = C0773.m3169("ۡ᩹") ^ i5;
                        i6 = ((iM3169 ^ i4) * 11039) ^ 759053744;
                        i7 = 1554415052;
                    } else {
                        iM3169 = C0619.m2761("ۗܰ") ^ i5;
                        i6 = ((iM3169 ^ i4) * 4821) ^ 1760300318;
                        i7 = -1943789005;
                    }
                    break;
                case -1969972947:
                case 2083722718:
                    if (C0269.f1558 <= 0) {
                        iM3169 = (C0773.m3169("᩻᩷") + i4) * 75;
                        i6 = ((iM3169 ^ i5) * 24831) ^ 1725291417;
                        i7 = 2103093098;
                    } else {
                        iM3169 = C0773.m3169("ܳۖ") ^ i4;
                        i6 = ((iM3169 ^ i5) * (-2629)) ^ 1680034335;
                        i7 = 1444936088;
                    }
                    break;
                case -1883283652:
                case -621465665:
                    SystemClock.sleep(100L);
                    if (C2310.f7472 >= 0) {
                        iM3169 = (C0773.m3169("᩻᩷") + i4) * 75;
                        i6 = ((iM3169 ^ i5) * 24831) ^ 1725291417;
                        i7 = 2103093098;
                    } else {
                        iM3169 = (i4 - C0619.m2761("ܳܳ")) * (-51);
                        i6 = ((iM3169 ^ i5) * 7029) ^ 873031546;
                        i7 = -429850880;
                    }
                    break;
                case -1820272685:
                case 670053067:
                    if (i2 < 50) {
                        iM3169 = C0619.m2761("ᩳۘ") ^ i4;
                        i6 = ((iM3169 ^ i5) * (-25569)) ^ 1431586502;
                        i7 = 1554627308;
                    } else {
                        iM3169 = (C0773.m3169("ܺᩳ") + i4) * 73;
                        i6 = ((iM3169 ^ i5) * (-18855)) ^ 1023901187;
                        i7 = 825980480;
                    }
                    break;
                case -1756045766:
                case 1375855143:
                    RunnableC0334.m2063();
                    if (C3448.f11240 < 0) {
                        iM3169 = C0619.m2761("ۜ᩹") ^ i5;
                        i6 = ((iM3169 ^ i4) * 1963) ^ (-48292369);
                        i7 = 90797944;
                    } else {
                        iM3169 = (C0619.m2761("ܺ᩷") + i4) * (-49);
                        i6 = ((iM3169 ^ i5) * (-2477)) ^ 752381888;
                        i7 = -491489374;
                    }
                    break;
                case -1624227293:
                case 404768660:
                    c9378M11164 = c20283.m11163();
                    if (AbstractC0116.f1064 <= 0) {
                        iM3169 = C0773.m3169("᩵ۚ") ^ i5;
                        i6 = ((iM3169 ^ i4) * 11347) ^ 437015279;
                        i7 = -433862316;
                    } else {
                        iM3169 = (C0619.m2761("ۙۤ") ^ i5) * 31;
                        i6 = ((iM3169 ^ i4) * (-21843)) ^ (-1664401858);
                        i7 = -818523506;
                    }
                    break;
                case -1561120194:
                case -1136937888:
                    i2 = 0;
                    iM3169 = C0773.m3169("᩶ܶ") ^ i5;
                    i6 = ((iM3169 ^ i4) * 11749) ^ (-542271167);
                    i7 = 1169286922;
                    break;
                case -1548512006:
                case 472297821:
                    if (c0168.f1228) {
                        iM3169 = C0773.m3169("ۡ۠") ^ i5;
                        i6 = ((iM3169 ^ i4) * (-9211)) ^ 763986326;
                        i7 = 1788091494;
                    } else {
                        iM3169 = (i5 - C0773.m3169("ۤܿ")) * 119;
                        i6 = ((iM3169 ^ i4) * 22799) ^ (-2085328541);
                        i7 = -1879590327;
                    }
                    break;
                case -1526226369:
                case 1517596002:
                    c9378M24173 = c0168.m24173(c9378M11163);
                    if (C0950.f3488 >= 0) {
                        iM3169 = (C0619.m2761("ܺ᩷") + i4) * (-49);
                        i6 = ((iM3169 ^ i5) * (-2477)) ^ 752381888;
                        i7 = -491489374;
                    } else {
                        iM3169 = (C0773.m3169("ۤᩴ") ^ i4) * (-123);
                        i6 = ((iM3169 ^ i5) * 32235) ^ 1112810777;
                        i7 = 528782100;
                    }
                    break;
                case -1234194821:
                case -748973252:
                    if (C2702.f8586 > 0) {
                        iM3169 = (C0619.m2761("ܺ᩷") + i4) * (-49);
                        i6 = ((iM3169 ^ i5) * (-2477)) ^ 752381888;
                        i7 = -491489374;
                    } else {
                        iM3169 = C0773.m3169("᩵ۚ") ^ i5;
                        i6 = ((iM3169 ^ i4) * 11347) ^ 437015279;
                        i7 = -433862316;
                    }
                    break;
                case -1129919712:
                case 1979638868:
                    if (c0168.f1211) {
                        iM3169 = C0773.m3169("ܺ֨") ^ i4;
                        i6 = ((iM3169 ^ i5) * (-11331)) ^ (-1955124924);
                        i7 = 164926012;
                    } else {
                        iM3169 = (i5 - C0773.m3169("ۤܿ")) * 119;
                        i6 = ((iM3169 ^ i4) * 22799) ^ (-2085328541);
                        i7 = -1879590327;
                    }
                    break;
                case -974900817:
                case 148867062:
                    c12318 = c0168.f1209;
                    if (c0168.f1228) {
                        iM3169 = (i4 - C0619.m2761("ܳۗ")) * (-67);
                        i6 = ((iM3169 ^ i5) * 9487) ^ (-1838839693);
                        i7 = 262216676;
                    } else {
                        iM3169 = (C0773.m3169("ܺᩳ") + i4) * 73;
                        i6 = ((iM3169 ^ i5) * (-18855)) ^ 1023901187;
                        i7 = 825980480;
                    }
                    break;
                case -974320461:
                case 1488223637:
                    if (c0168.f1211) {
                        iM3169 = (C0773.m3169("ܺᩳ") + i4) * 73;
                        i6 = ((iM3169 ^ i5) * (-18855)) ^ 1023901187;
                        i7 = 825980480;
                    } else {
                        iM3169 = C0773.m3169("ۨ۬") ^ i5;
                        i6 = ((iM3169 ^ i4) * 16121) ^ 1256020826;
                        i7 = 214432226;
                    }
                    break;
                case -933124180:
                case 624489775:
                    i2++;
                    iM3169 = C0773.m3169("᩶ܶ") ^ i5;
                    i6 = ((iM3169 ^ i4) * 11749) ^ (-542271167);
                    i7 = 1169286922;
                    break;
                case -889102527:
                case 1511453267:
                    c20348M46740.skipBytes(2);
                    if (C3690.f12684 <= 0) {
                        iM3169 = (C0773.m3169("᩻᩷") + i4) * 75;
                        i6 = ((iM3169 ^ i5) * 24831) ^ 1725291417;
                        i7 = 2103093098;
                    } else {
                        iM3169 = C0773.m3169("ۚᩴ") ^ i4;
                        i6 = ((iM3169 ^ i5) * 545) ^ 193042681;
                        i7 = 149118283;
                    }
                    break;
                case -682292555:
                case 1635592767:
                    C2023.m6964();
                    iM3169 = C0773.m3169("᩵ۚ") ^ i5;
                    i6 = ((iM3169 ^ i4) * 11347) ^ 437015279;
                    i7 = -433862316;
                    break;
                case -676077558:
                case 522921691:
                    c12318.m30724();
                    c9378M11163 = c20283.m11163();
                    if (C1343.f4799 != 0) {
                        iM3169 = C0619.m2761("ۜ᩹") ^ i5;
                        i6 = ((iM3169 ^ i4) * 1963) ^ (-48292369);
                        i7 = 90797944;
                    } else {
                        iM3169 = C0619.m2761("ܶ֡") ^ i5;
                        i6 = ((iM3169 ^ i4) * 25653) ^ 1169137403;
                        i7 = 1932872781;
                    }
                    break;
                case -474033860:
                case 1954456256:
                    if (c0168.f1211) {
                        iM3169 = (C0773.m3169("ܺᩳ") + i4) * 73;
                        i6 = ((iM3169 ^ i5) * (-18855)) ^ 1023901187;
                        i7 = 825980480;
                    } else {
                        iM3169 = C0619.m2761("ۖ֡") ^ i4;
                        i6 = ((iM3169 ^ i5) * (-18247)) ^ 1617485054;
                        i7 = -2100943390;
                    }
                    break;
                case -308564939:
                case 231377454:
                    return C1080.m4058(AbstractC3624.m11756(c0168.f1217));
                case -186713772:
                case 1263939938:
                    C2966.m9664();
                    if (!C1080.m4050()) {
                        iM3169 = C0773.m3169("ܳۖ") ^ i4;
                        i6 = ((iM3169 ^ i5) * (-2629)) ^ 1680034335;
                        i7 = 1444936088;
                    } else {
                        iM3169 = (C0619.m2761("ܺ᩷") + i4) * (-49);
                        i6 = ((iM3169 ^ i5) * (-2477)) ^ 752381888;
                        i7 = -491489374;
                    }
                    break;
                case -105566844:
                case 865177648:
                    c20348M46740 = C20348.m46740(bArrM24700);
                    i = 1382253410;
                    if (C2023.m6964() <= 0) {
                        iM3169 = C0619.m2761("ۜ᩹") ^ i5;
                        i6 = ((iM3169 ^ i4) * 1963) ^ (-48292369);
                        i7 = 90797944;
                    } else {
                        iM3169 = (i4 - C0619.m2761("۫֨")) * (-17);
                        i6 = ((iM3169 ^ i5) * (-16141)) ^ 1945932778;
                        i7 = 1042361729;
                    }
                    break;
                case 129667188:
                case 1058107200:
                    return C13731.m33555(c20348M46740, c0168.m24166(c9378M11164).m24699());
                case 806549768:
                case 1996264519:
                    C11235.m28309();
                    C3734.m12152();
                    return null;
                case 1398764526:
                case 1582933392:
                    c20283 = c0168.f1224;
                    if (C3734.f12817 >= 0) {
                        iM3169 = C0773.m3169("᩵ۚ") ^ i5;
                        i6 = ((iM3169 ^ i4) * 11347) ^ 437015279;
                        i7 = -433862316;
                    } else {
                        iM3169 = (C0773.m3169("ᩴ۫") + i5) * 27;
                        i6 = ((iM3169 ^ i4) * 29915) ^ (-1091437091);
                        i7 = -1623069306;
                    }
                    break;
                default:
                    C17364.m40795((InterfaceC15872) c20348M46740, i);
                    if (RunnableC3055.f9898 >= 0) {
                        iM3169 = C0773.m3169("ۡ᩹") ^ i5;
                        i6 = ((iM3169 ^ i4) * 11039) ^ 759053744;
                        i7 = 1554415052;
                    } else {
                        iM3169 = (i4 - C0773.m3169("ۙۜ")) * (-87);
                        i6 = ((iM3169 ^ i5) * (-6319)) ^ 1390103919;
                        i7 = -2115864171;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m1418() {
        int iM3169;
        int i;
        int i2;
        int iM31610;
        int i3;
        short s;
        int iM31611;
        int i4;
        int i5;
        C0168 c0168 = this;
        int i6 = AbstractC3624.f12429;
        int i7 = C1321.f4751;
        int iM2761 = C0619.m2761("ۚۙ") ^ i6;
        int i8 = ((iM2761 ^ i7) * (-19995)) ^ (-1817136916);
        StringBuilder sb = null;
        Point pointM53978 = null;
        String strM11252 = null;
        short[] sArr = null;
        int i9 = iM2761 ^ (-208958351);
        C24132 c24132 = null;
        int iM10042 = 0;
        int iM4047 = 0;
        int iAbs = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        short s2 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 1242724401;
        int i16 = 0;
        String str = null;
        String str2 = null;
        int i17 = 0;
        while (true) {
            i15 = i9 ^ (i8 & (((i15 ^ i7) * 9197) >> 31));
            switch (i15) {
                case -2120433045:
                case -1475348310:
                    C2287.m7745();
                    C2288.m7767();
                    iM31611 = (i7 - C0773.m3169("ۖ۬")) * 3;
                    i4 = ((iM31611 ^ i6) * (-25955)) ^ 7109272;
                    i5 = 1450148476;
                    i9 = iM31611 ^ i5;
                    i8 = i4;
                    break;
                case -2074192966:
                case -1515745389:
                    C0487.m2356();
                    break;
                case -2000184414:
                case 644767343:
                    break;
                case -1996133848:
                case -1807963187:
                    C2375.m8065();
                    if (!RunnableC1848.f6235) {
                        iM31611 = (i7 - C0773.m3169("ۖ۬")) * 3;
                        i4 = ((iM31611 ^ i6) * (-25955)) ^ 7109272;
                        i5 = 1450148476;
                        i9 = iM31611 ^ i5;
                        i8 = i4;
                    } else {
                        iAbs = iAbs;
                        iM31610 = C0619.m2761("᩻ܰ") ^ i7;
                        i8 = ((iM31610 ^ i6) * (-3615)) ^ 379904497;
                        i3 = 95203302;
                        int i18 = iM31610 ^ i3;
                        iAbs = iAbs;
                        i9 = i18;
                        c0168 = this;
                    }
                    break;
                case -1866082392:
                case -1161005005:
                    iAbs = iAbs;
                    C3779.m12258(sb, str);
                    C2354.m7978(c0168.f1212, C2023.m6952(sb));
                    iM3169 = C0773.m3169("᩵ܺ") ^ i6;
                    i = ((iM3169 ^ i7) * (-17157)) ^ (-354373359);
                    i2 = 1837125312;
                    int i19 = iAbs;
                    i9 = iM3169 ^ i2;
                    i8 = i;
                    iAbs = i19;
                    break;
                case -1819950000:
                case 510415920:
                    iAbs = iAbs;
                    i14 = i13 * i13;
                    i16 = s2 * s2;
                    i12 = 4129024;
                    if (!C1321.m4852()) {
                        s = s2;
                        int iM31612 = (C0773.m3169("֨ۧ") + i6) * (-37);
                        i4 = ((iM31612 ^ i7) * (-7785)) ^ (-1317273543);
                        s2 = s;
                        iAbs = iAbs;
                        i9 = iM31612 ^ (-2029873448);
                        i8 = i4;
                    } else {
                        iM3169 = C0773.m3169("֡۬") ^ i7;
                        i = ((iM3169 ^ i6) * (-27019)) ^ (-197184453);
                        i2 = -65073752;
                        int i110 = iAbs;
                        i9 = iM3169 ^ i2;
                        i8 = i;
                        iAbs = i110;
                    }
                    break;
                case -1773928938:
                case 728383924:
                    iAbs = iAbs;
                    str2 = c0168.f1214;
                    sArr = f1206;
                    i11 = 195;
                    if (C0487.f2131 > 0) {
                        iM3169 = C0773.m3169("ۙᩴ") ^ i6;
                        i = ((iM3169 ^ i7) * (-27221)) ^ (-1510653242);
                        i2 = -395661265;
                        int i111 = iAbs;
                        i9 = iM3169 ^ i2;
                        i8 = i;
                        iAbs = i111;
                    } else {
                        iAbs = iAbs;
                        iM31611 = (i7 - C0773.m3169("ܽᩳ")) * 109;
                        i4 = ((iM31611 ^ i6) * (-23083)) ^ (-2133896764);
                        i5 = -1830173935;
                        i9 = iM31611 ^ i5;
                        i8 = i4;
                    }
                    break;
                case -1556657016:
                case 171381085:
                    C1564.m5509();
                    if (C2834.f9334 > 0) {
                        iAbs = iAbs;
                        s = s2;
                        int iM31613 = (C0773.m3169("֨ۧ") + i6) * (-37);
                        i4 = ((iM31613 ^ i7) * (-7785)) ^ (-1317273543);
                        s2 = s;
                        iAbs = iAbs;
                        i9 = iM31613 ^ (-2029873448);
                        i8 = i4;
                    }
                    iM31611 = (i7 - C0773.m3169("ۖ۬")) * 3;
                    i4 = ((iM31611 ^ i6) * (-25955)) ^ 7109272;
                    i5 = 1450148476;
                    i9 = iM31611 ^ i5;
                    i8 = i4;
                    break;
                case -1551403682:
                case -1390149322:
                    iAbs = iAbs;
                    str = (String) C17359.requireNonNullElse(str2, C0487.m2361(sArr, i11, 3, i10));
                    if (RunnableC0334.f1808 <= 0) {
                        iM3169 = (C0619.m2761("ۙۖ") ^ i6) * 15;
                        i = ((iM3169 ^ i7) * (-19257)) ^ (-1523978933);
                        i2 = -67864911;
                    } else {
                        iM3169 = C0773.m3169("ᩳۜ") ^ i7;
                        i = ((iM3169 ^ i6) * (-18273)) ^ 951178003;
                        i2 = 912142874;
                    }
                    int i112 = iAbs;
                    i9 = iM3169 ^ i2;
                    i8 = i;
                    iAbs = i112;
                    break;
                case -1521495578:
                case 805200881:
                    iAbs = iAbs;
                    strM11252 = C3448.m11252(f1206, 198, 2, i10);
                    if (C1542.f5343 > 0) {
                        iM3169 = (C0773.m3169("ۤ۬") + i7) * 7;
                        i = ((iM3169 ^ i6) * 1385) ^ (-390765303);
                        i2 = 1717972749;
                        int i113 = iAbs;
                        i9 = iM3169 ^ i2;
                        i8 = i;
                        iAbs = i113;
                    } else {
                        iAbs = iAbs;
                        iM31611 = (i7 - C0773.m3169("ܽᩳ")) * 109;
                        i4 = ((iM31611 ^ i6) * (-23083)) ^ (-2133896764);
                        i5 = -1830173935;
                        i9 = iM31611 ^ i5;
                        i8 = i4;
                    }
                    break;
                case -1453328790:
                case -21960393:
                    iAbs = iAbs;
                    sb = new StringBuilder();
                    iM10042 = C3077.m10042(c24132);
                    iM4047 = C1080.m4047(c24132);
                    if (RunnableC3055.m9933() == 0) {
                        iM3169 = C0619.m2761("۠᩷") ^ i7;
                        i = ((iM3169 ^ i6) * 9827) ^ (-1194211769);
                        i2 = 1667978561;
                        int i114 = iAbs;
                        i9 = iM3169 ^ i2;
                        i8 = i;
                        iAbs = i114;
                    } else {
                        iM31610 = C0619.m2761("᩻ܰ") ^ i7;
                        i8 = ((iM31610 ^ i6) * (-3615)) ^ 379904497;
                        i3 = 95203302;
                        int i115 = iM31610 ^ i3;
                        iAbs = iAbs;
                        i9 = i115;
                        c0168 = this;
                    }
                    break;
                case -1201243004:
                case 1810920558:
                    iAbs = iAbs;
                    s2 = f1206[191];
                    if (C1542.f5343 <= 0) {
                        iM31610 = C0619.m2761("᩻ܰ") ^ i7;
                        i8 = ((iM31610 ^ i6) * (-3615)) ^ 379904497;
                        i3 = 95203302;
                    } else {
                        iM31610 = (C0773.m3169("ۡ۫") + i6) * (-31);
                        i8 = ((iM31610 ^ i7) * 12049) ^ (-419130061);
                        i3 = -1067815975;
                    }
                    int i116 = iM31610 ^ i3;
                    iAbs = iAbs;
                    i9 = i116;
                    c0168 = this;
                    break;
                case -1157102221:
                case -549999712:
                    C3779.m12269(sb, iAbs);
                    iAbs = iAbs;
                    C3779.m12258(sb, C23916.m53420(f1206, 200, 1, i10));
                    iM3169 = C0773.m3169("۬ۚ") ^ i7;
                    i = ((iM3169 ^ i6) * (-15517)) ^ 1034694595;
                    i2 = 1382079688;
                    int i117 = iAbs;
                    i9 = iM3169 ^ i2;
                    i8 = i;
                    iAbs = i117;
                    break;
                case -1110107785:
                case -508203435:
                    i10 = 64917;
                    iM3169 = C0773.m3169("᩸ۢ") ^ i6;
                    i = ((iM3169 ^ i7) * 9839) ^ 255648705;
                    i2 = 793305440;
                    int i118 = iAbs;
                    i9 = iM3169 ^ i2;
                    i8 = i;
                    iAbs = i118;
                    break;
                case -1087635359:
                case 242705069:
                    iAbs = iAbs;
                    s = s2;
                    int i20 = s + 2032;
                    if (C3779.f12953 > 0) {
                        int iM31614 = C0773.m3169("۫᩶") ^ i7;
                        i13 = i20;
                        s2 = s;
                        iAbs = iAbs;
                        i8 = ((iM31614 ^ i6) * (-25995)) ^ 1800843586;
                        i9 = iM31614 ^ 891153344;
                        c0168 = this;
                    } else {
                        i13 = i20;
                        int iM31615 = (C0773.m3169("֨ۧ") + i6) * (-37);
                        i4 = ((iM31615 ^ i7) * (-7785)) ^ (-1317273543);
                        s2 = s;
                        iAbs = iAbs;
                        i9 = iM31615 ^ (-2029873448);
                        i8 = i4;
                    }
                    break;
                case -1063401677:
                case 2084936016:
                    RunnableC3055.m9933();
                    if (!C1146.m4231()) {
                        iM31611 = (i7 - C0773.m3169("ۖ۬")) * 3;
                        i4 = ((iM31611 ^ i6) * (-25955)) ^ 7109272;
                        i5 = 1450148476;
                        i9 = iM31611 ^ i5;
                        i8 = i4;
                    } else {
                        iAbs = iAbs;
                        iM3169 = (C0619.m2761("ۙۖ") ^ i6) * 15;
                        i = ((iM3169 ^ i7) * (-19257)) ^ (-1523978933);
                        i2 = -67864911;
                        int i119 = iAbs;
                        i9 = iM3169 ^ i2;
                        i8 = i;
                        iAbs = i119;
                    }
                    break;
                case -973904467:
                case 1265860696:
                    iAbs = iAbs;
                    pointM53978 = c24132.m53978(iM10042);
                    i17 = pointM53978.x;
                    if (C1826.f6190 > 0) {
                        iM3169 = C0619.m2761("۫᩵") ^ i6;
                        i = ((iM3169 ^ i7) * (-30241)) ^ (-2126573861);
                        i2 = -61261203;
                        int i1110 = iAbs;
                        i9 = iM3169 ^ i2;
                        i8 = i;
                        iAbs = i1110;
                    } else {
                        iAbs = iAbs;
                        iM31611 = (i7 - C0773.m3169("ܽᩳ")) * 109;
                        i4 = ((iM31611 ^ i6) * (-23083)) ^ (-2133896764);
                        i5 = -1830173935;
                        i9 = iM31611 ^ i5;
                        i8 = i4;
                    }
                    break;
                case -542184161:
                case 1074935248:
                    i10 = 65411;
                    iM3169 = C0773.m3169("᩸ۢ") ^ i6;
                    i = ((iM3169 ^ i7) * 9839) ^ 255648705;
                    i2 = 793305440;
                    int i1111 = iAbs;
                    i9 = iM3169 ^ i2;
                    i8 = i;
                    iAbs = i1111;
                    break;
                case -397276392:
                case 1672590182:
                    C1783.m6234(sb, strM11252);
                    iAbs = Math.abs(iM4047 - iM10042);
                    if (RunnableC1848.f6235) {
                        iM31611 = (i7 - C0773.m3169("ܽᩳ")) * 109;
                        i4 = ((iM31611 ^ i6) * (-23083)) ^ (-2133896764);
                        i5 = -1830173935;
                    } else {
                        iM31611 = (C0773.m3169("ۜ᩺") + i6) * 99;
                        i4 = ((iM31611 ^ i7) * (-25737)) ^ 230382966;
                        i5 = -2111583208;
                    }
                    i9 = iM31611 ^ i5;
                    i8 = i4;
                    break;
                case -221989900:
                case 1688662464:
                    iAbs = iAbs;
                    c24132 = c0168.f1217;
                    if (c24132 != null) {
                        iM3169 = C0773.m3169("۫᩸") ^ i7;
                        i = ((iM3169 ^ i6) * 30927) ^ (-1941522119);
                        i2 = 264755708;
                    } else {
                        iM3169 = C0773.m3169("᩵ܺ") ^ i6;
                        i = ((iM3169 ^ i7) * (-17157)) ^ (-354373359);
                        i2 = 1837125312;
                    }
                    int i1112 = iAbs;
                    i9 = iM3169 ^ i2;
                    i8 = i;
                    iAbs = i1112;
                    break;
                case -185016611:
                case 537001763:
                    iAbs = iAbs;
                    C1783.m6234(sb, C2023.m6966(f1206, 192, 3, i10));
                    if (!C0619.m2763()) {
                        iM3169 = C0619.m2761("ܳۨ") ^ i6;
                        i = ((iM3169 ^ i7) * 24985) ^ (-98437210);
                        i2 = 1619496043;
                        int i1113 = iAbs;
                        i9 = iM3169 ^ i2;
                        i8 = i;
                        iAbs = i1113;
                    } else {
                        s = s2;
                        int iM31616 = (C0773.m3169("֨ۧ") + i6) * (-37);
                        i4 = ((iM31616 ^ i7) * (-7785)) ^ (-1317273543);
                        s2 = s;
                        iAbs = iAbs;
                        i9 = iM31616 ^ (-2029873448);
                        i8 = i4;
                    }
                    break;
                case 1474987809:
                case 1518823352:
                    iAbs = iAbs;
                    int i21 = i16 + i12;
                    if (i14 - (i21 + i21) <= 0) {
                        iM3169 = C0619.m2761("ۛۧ") ^ i6;
                        i = ((iM3169 ^ i7) * (-10049)) ^ 1162409260;
                        i2 = 201311606;
                    } else {
                        iM3169 = (i7 - C0619.m2761("۟ܶ")) * (-11);
                        i = ((iM3169 ^ i6) * (-17237)) ^ 768405096;
                        i2 = 1789052259;
                    }
                    int i1114 = iAbs;
                    i9 = iM3169 ^ i2;
                    i8 = i;
                    iAbs = i1114;
                    break;
                default:
                    iAbs = iAbs;
                    C1783.m6237(sb, i17);
                    C2023.m6955(sb, ':');
                    C3779.m12269(sb, pointM53978.y);
                    if (iM10042 != iM4047) {
                        iM3169 = C0619.m2761("֡ᩳ") ^ i6;
                        i = ((iM3169 ^ i7) * 17149) ^ 1825859104;
                        i2 = -291360034;
                    } else {
                        iM3169 = C0773.m3169("۬ۚ") ^ i7;
                        i = ((iM3169 ^ i6) * (-15517)) ^ 1034694595;
                        i2 = 1382079688;
                    }
                    int i1115 = iAbs;
                    i9 = iM3169 ^ i2;
                    i8 = i;
                    iAbs = i1115;
                    break;
            }
            return;
        }
    }
}
