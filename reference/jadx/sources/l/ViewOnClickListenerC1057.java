package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.alipay.sdk.m.y.q;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.textfield.TextInputLayout;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.ReentrantLock;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.engines.TwofishEngine;
import org.bouncycastle.math.ec.rfc8032.Ed448;
import org.bouncycastle.math.ec.rfc8032.Scalar448;
import org.bouncycastle.pqc.crypto.snova.GF16Utils;

/* JADX INFO: renamed from: l.֨۠᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: H1R6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC1057 extends AbstractActivityC17204 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۧ᩷, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f3785 = 0;

    /* JADX INFO: renamed from: ܶۗ۟, reason: not valid java name and contains not printable characters */
    private static final short[] f3786 = {4928, 21870, 21983, 26819, 1858, 3578, 6760, -8153, 97, -9769, -8201, 16382, -17673, -17675, -17692, -17725, -17692, -17694, -17671, -17666, -17673, -17736, -17730, -17730, -17730, -17735, -17716, -17676, -17733, 12164, -2644, 16017, 5055, -19098, 31434, 17295, 12088, 12032, 12111, -17090, 19251, 25042, 246, 2453, 14053, 15927, 13159, 3825, 4256, 9223, -31014, -31027, -31013, -31016, -31033, -31034, -31013, -31027, -619, -8567, 4213, 4071, 18355, 18340, 18354, 18353, 18350, 18351, 18354, 18340, -13610, 12343, 14042, 4612, -10309, 11971, 4997, 10484, 9975, 2002, 15033, 15022, 15032, 15035, 15012, 15013, 15032, 15022, 22486, 27069, -16526, 20017, -18198, -19339, 15034, 15034, 15010, 15013, 15021, 15012, 15002, 15002, 26235, 20519, 25329, 7521, 12853, 12834, 12852, 12855, 12840, 12841, 12852, 12834, -21382, -22319, -21913, -16720, 25949, -16508, -24039, -23217, 17645, 7864, 6090, -15744, 14654, -9488, -8484, 6016, 20398, 20374, 20441, 11035, 7941, 92, 5345, 13337, 15924, -5050, -24046, -24022, -23963, -13757, -15543, 11685, -1599, 11199, 9407, -8499, 10395, 10644, 6498, 8474, 16073, -13801, 7362, -30138, -30127, -30137, -30140, -30117, -30118, -30137, -30127, -7192, -8513, 4186, -4119, -610, -4273, -30141, -30132, -30115, -30118, -30126, -30117, -30109, -30100, 436, 6099, -2939, 9074, -17363, -17366, -17374, -17365, -17407, -17367, -17371, -17363, -17368, -12210, -13596, -13889, 2920, -6308, -6309, -6317, -6310, -6277, -6308, -6314, -6306, -6309, -6316, -6312, -6320, -6332, -6332, -25385, -19855, -20247, -6308, -6309, -6317, -6310, -6300, -6300, -6334, -6323, -6308, -6309, -6317, -6310, -6302, -6291, -6308, -6309, -6317, -6310, -6280, -6336, -6311, -6335, -6308, -6279, -6310, -6318, -6308, -6309, 32144, 29170, -26590, 25396, 25257, 25004, 3620, 27126, 26120, 29632, 2863, 29692, 31324, -19301, 28884, -22809, -19616, 18337, 31282, 20711, 6558, 29084, 21401, -21432, 5204, 32035, 29328, -25100, -29640, -25951, 29546, 2472, -5957, 10447, -12321, 14425, -6463, 11245, -16046, -11021, 15504, 3539, -21314, -21335, -21313, -21316, -21341, -21342, -21313, -21335, -586, 8448, 12563, -9952, 15870, -2050, 168, -11520, 14116, -12017, 4017, -22896, -22905, -22895, -22894, -22899, -22900, -22895, -22905, -14702, 9344, 11111, -22901, -22900, -22908, -22899, -22868, -22901, -22911, -22903, -22900, -22909, -22897, -22905, -1497, 14043, -12663, 4646, 17874, -19816, 19584, -21880, 20412, -18925, 15932, 15923, 15924, 15934, 15884, 15923, 15935, 15917, 15896, 15907, 15891, 15934, 15986, 15988, 15988, 15988, 15987, -18117, 25826, 21463, -18350, 29072, 22377, -20713, -22891, -19576, 22231, 28108, 26407, 28150, 27454, -23527, -19258, -24399, -17512, 3852, -6152, 6088, -4666, -2780, -4377, 3655, 31836, 31827, 31828, 31838, 31852, 31827, 31839, 31821, 31864, 31811, 31859, 31838, 31762, 31764, 31764, 31764, 31763, -3833, 4035, 227, -3374, 7563, -1425, -7795, 4305, -5425, -8159, -5085, 9783, 9515, -883, 8915, 7347, -1206, -6178, 5301, 12354, -1063, 5011, 15088, -8001, -6535, -4883, 1728, 13392, 7574, -6402, 4740, -722, 4723, -3773, 26847, 26847, 15227, 13113, 14021, 4619, -2218, -6247, 5961, -5206, 9900, 499, -22007, 12540, 13500, -11745, 9632, 13302, 9488, 14364, 14733, -11224, -16195, 9851, -9, -21991, -21994, -21999, -21989, -21975, -21994, -21990, -22008, -21955, -22010, -21962, -21989, -21929, -21935, -21935, -21935, -21930, -11763, -13084, 9291, -15491, -13362, 15192, -15087, 8331, -10157, 15931, 9349, 16380, -2960, 12577, -14973, 13589, 14867, -12663, -10664, -12915, 11130, -3507, 12766, -10489, 11215, -8632, -13332, 14860, -1591, 9529, 9834, 16046, 9119, 8932, -2485, -1299, 12978, 14616, 13872, 12968, -15504, -6998, 13092, -3545, 9386, 16285, 16351, -9410, -21992, -21990, -22005, -21972, -22005, -22003, -21994, -21999, -21992, -21929, -21935, -21935, -21935, -21930, -11696, -8435, -8657, -22002, -22002, -12368, -11491, 16306, -22008, -22009, -13142, -10750, 11944, -8533, -265, 13247, -11977, -8399, -11364, -12694, -16318, -2567, -13791, 12121, -3524, 9224, 12843, -10618, -13511, -15406, -8492, 13322, 14121, 13126, -733, 10383, 10514, -3878, -15147, -15093, -3114, 11217, -11374, -21899, -9632, 12938, -10427, -21899, -21921, -21899, -953, -16129, 14125, -903, -1956, -3215, 11639, -14863, -3181, -13138, 10360, -11330, -2452, -1271, -3634, 7544, 28387, 22503, 17910, 21412, -21318, 22301, -16888, 27675, -16670, -23228, 24217, 18511, -22583, 27775, 27661, 28267, 22953, 20035, 20257, 27268, 21088, 27879, 16655, 17589, 22581, 22487, -21269, -16400, 17683, -23391, -21683, 16537, 27875, 22679, 22081, 23000, 24021, 18528, -16851, 14397, 14383, 14370, 14460, -21675, 27073, -20300, -22029, 25510, 16846, 18534, 21182, 16986, -20764, 21131, -20160, -19006, -16579, -18352, -21458, 21067, -18152, 14392, 14375, 14379, 14393, 14438, 14432, 14432, 14432, 14439, -18802, 26738, 24807, 20809, 28526, 21281, 30610, 27413, 27988, 19419, 21931, 22363, 14397, 14374, 14369, 14393, 14351, 14381, 14394, 14375, 14392, 14379, 14347, 14371, 14383, 14375, 14370, 3041, -26295, -26290, -26284, -26299, -26290, -26284, 8899, 10934, 10925, 10922, 10930, 10888, 10928, 10921, 10929, 10924, 10889, 10922, 10914, 10924, 10923, 10934, 10925, 10922, 10930, 10902, 10912, 10934, 10934, 10924, 10922, 10923, 10881, 10912, 10931, 10924, 10918, 10912, 10934, 9941, 1861, 1891, 1909, 1890, 1885, 1919, 1890, 1909, 1873, 1907, 1892, 1913, 1894, 1913, 1892, 1897};

    /* JADX INFO: renamed from: ֫᩷, reason: not valid java name and contains not printable characters */
    public final C24720 f3787 = C24720.m55197();

    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public TextView f3788;

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public TextView f3789;

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public TextView f3790;

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public TextView f3791;

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public TextView f3792;

    @Override // l.AbstractActivityC17204
    /* JADX INFO: renamed from: ᩶ */
    public final String mo122() {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        short[] sArr2 = null;
        int i6 = 0;
        int i7 = -1626024746;
        int i8 = C0487.f2131;
        int i9 = C2702.f8586;
        int iM3169 = (C0773.m3169("᩶֫") ^ i8) * 73;
        int i10 = ((iM3169 ^ i9) * (-18673)) ^ (-660639782);
        int i11 = 1717807984;
        while (true) {
            i7 = ((((i7 ^ i9) * 32719) >> 31) & i10) ^ (iM3169 ^ i11);
            switch (i7) {
                case -1815183767:
                case 455813379:
                    return C2419.m8166(sArr2, i6, 16, i5);
                case -1739560294:
                case 1136584264:
                    i5 = 1808;
                    iM3169 = C0773.m3169("ۡۚ") ^ i9;
                    i10 = ((iM3169 ^ i8) * 7955) ^ 845083237;
                    i11 = 1132803928;
                    break;
                case -1632086690:
                case 1350685645:
                    c = 735;
                    if (C1343.f4799 != 0) {
                        iM3169 = (C0773.m3169("֨ᩴ") ^ i9) * (-49);
                        i10 = ((iM3169 ^ i8) * (-17351)) ^ 505104090;
                        i11 = -375490636;
                    } else {
                        iM3169 = C0773.m3169("ۗܺ") ^ i8;
                        i10 = ((iM3169 ^ i9) * (-25757)) ^ 490169111;
                        i11 = 30970457;
                    }
                    break;
                case -1584303675:
                case 1661129355:
                    if (C3099.m10095()) {
                        iM3169 = (C0773.m3169("֨ᩴ") ^ i9) * (-49);
                        i10 = ((iM3169 ^ i8) * (-17351)) ^ 505104090;
                        i11 = -375490636;
                    } else {
                        iM3169 = C0619.m2761("ܰ۠") ^ i8;
                        i10 = ((iM3169 ^ i9) * 9685) ^ (-714163877);
                        i11 = 1342984784;
                    }
                    break;
                case -1544524618:
                case -881366236:
                    AbstractC3624.m11755();
                    if (!RunnableC1848.f6235) {
                        iM3169 = (C0619.m2761("ۜ᩻") + i8) * (-69);
                        i10 = ((iM3169 ^ i9) * 14181) ^ 1762310717;
                        i11 = -1308420973;
                    } else {
                        iM3169 = C0619.m2761("ܶܽ") ^ i8;
                        i10 = ((iM3169 ^ i9) * 24515) ^ 1266560085;
                        i11 = 1207165527;
                    }
                    break;
                case -909796635:
                case 1592274520:
                    sArr = f3786;
                    if (C0619.m2763()) {
                        iM3169 = (C0773.m3169("֨ᩴ") ^ i9) * (-49);
                        i10 = ((iM3169 ^ i8) * (-17351)) ^ 505104090;
                        i11 = -375490636;
                    } else {
                        iM3169 = C0619.m2761("ۖ֡") ^ i9;
                        i10 = ((iM3169 ^ i8) * (-27477)) ^ (-2139767509);
                        i11 = 728558780;
                    }
                    break;
                case -874416712:
                case 241148431:
                    i4 = 123609924;
                    if (C0487.f2131 <= 0) {
                        iM3169 = (C0619.m2761("ۜ᩻") + i8) * (-69);
                        i10 = ((iM3169 ^ i9) * 14181) ^ 1762310717;
                        i11 = -1308420973;
                    } else {
                        iM3169 = C0619.m2761("᩷֫") ^ i9;
                        i10 = ((iM3169 ^ i8) * (-16441)) ^ 1400474575;
                        i11 = 1869261321;
                    }
                    break;
                case -738922173:
                case 1844797447:
                    if (C2287.f7432 >= 0) {
                        iM3169 = (i8 - C0773.m3169("ۨ᩵")) * (-117);
                        i10 = ((iM3169 ^ i9) * (-29425)) ^ (-1753804554);
                        i11 = 1443708766;
                    } else {
                        iM3169 = C0619.m2761("ۤ᩶") ^ i8;
                        i10 = ((iM3169 ^ i9) * 22939) ^ (-1254317407);
                        i11 = -1983258028;
                    }
                    break;
                case -544509250:
                case 654800801:
                    int i12 = i3 + i4;
                    if ((i12 + i12) - i2 < 0) {
                        iM3169 = (C0619.m2761("ܿ۟") ^ i8) * (-19);
                        i10 = ((iM3169 ^ i9) * (-16553)) ^ 1103504663;
                        i11 = -1099675649;
                    } else {
                        iM3169 = C0619.m2761("֨ܰ") ^ i8;
                        i10 = ((iM3169 ^ i9) * (-22555)) ^ (-1812527730);
                        i11 = 1422858200;
                    }
                    break;
                case -423306337:
                case 199953661:
                    sArr2 = f3786;
                    i6 = 736;
                    if (RunnableC3055.m9933() != 0) {
                        iM3169 = (C0773.m3169("۟᩸") ^ i9) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i10 = ((iM3169 ^ i8) * (-15379)) ^ (-1114821827);
                        i11 = -1546120952;
                    } else {
                        iM3169 = C0773.m3169("ۘۘ") ^ i9;
                        i10 = ((iM3169 ^ i8) * (-12121)) ^ (-1363169130);
                        i11 = 1397036479;
                    }
                    break;
                case -52079801:
                case 2103763980:
                    i5 = 1347;
                    iM3169 = C0773.m3169("ۡۚ") ^ i9;
                    i10 = ((iM3169 ^ i8) * 7955) ^ 845083237;
                    i11 = 1132803928;
                    break;
                case 336410036:
                case 1350714248:
                    C2310.m7813();
                    iM3169 = (i8 - C0773.m3169("ۨ᩵")) * (-117);
                    i10 = ((iM3169 ^ i9) * (-29425)) ^ (-1753804554);
                    i11 = 1443708766;
                    break;
                case 380177922:
                case 1456777792:
                    s = sArr[c];
                    if (C3998.f13671 != 0) {
                        iM3169 = (C0619.m2761("ۜ᩻") + i8) * (-69);
                        i10 = ((iM3169 ^ i9) * 14181) ^ 1762310717;
                        i11 = -1308420973;
                    } else {
                        iM3169 = (C0619.m2761("ۡۨ") ^ i9) * (-121);
                        i10 = ((iM3169 ^ i8) * (-8959)) ^ (-310000593);
                        i11 = -436853404;
                    }
                    break;
                case 385452485:
                case 1425921481:
                    if (C3448.f11240 < 0) {
                        iM3169 = C0619.m2761("ܶܽ") ^ i8;
                        i10 = ((iM3169 ^ i9) * 24515) ^ 1266560085;
                        i11 = 1207165527;
                    } else {
                        iM3169 = (i8 - C0773.m3169("ۨ᩵")) * (-117);
                        i10 = ((iM3169 ^ i9) * (-29425)) ^ (-1753804554);
                        i11 = 1443708766;
                    }
                    break;
                case 473200574:
                case 1777514934:
                    C2966.m9664();
                    if (C0862.f3233 == 0) {
                        iM3169 = (C0773.m3169("۟᩸") ^ i9) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i10 = ((iM3169 ^ i8) * (-15379)) ^ (-1114821827);
                        i11 = -1546120952;
                    } else {
                        iM3169 = C0619.m2761("ܶܽ") ^ i8;
                        i10 = ((iM3169 ^ i9) * 24515) ^ 1266560085;
                        i11 = 1207165527;
                    }
                    break;
                case 530926887:
                case 1837701722:
                    C4282.m13644();
                    return null;
                case 661400507:
                case 1775786618:
                    i2 = i * i;
                    i3 = s * s;
                    if (C1146.f4234 >= 0) {
                        iM3169 = (C0773.m3169("۟᩸") ^ i9) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i10 = ((iM3169 ^ i8) * (-15379)) ^ (-1114821827);
                        i11 = -1546120952;
                    } else {
                        iM3169 = (i9 - C0619.m2761("ܿ֡")) * 31;
                        i10 = ((iM3169 ^ i8) * (-9625)) ^ (-1881285403);
                        i11 = 246634622;
                    }
                    break;
                case 940774407:
                case 1199436024:
                    if (C1343.f4799 != 0) {
                        iM3169 = C0619.m2761("ܶܽ") ^ i8;
                        i10 = ((iM3169 ^ i9) * 24515) ^ 1266560085;
                        i11 = 1207165527;
                    } else {
                        iM3169 = (i9 - C0619.m2761("ۜۗ")) * (-65);
                        i10 = ((iM3169 ^ i8) * 10619) ^ (-911610567);
                        i11 = 1341788732;
                    }
                    break;
                default:
                    i = s + 11118;
                    if (C2878.f9462) {
                        iM3169 = (C0773.m3169("֨ᩴ") ^ i9) * (-49);
                        i10 = ((iM3169 ^ i8) * (-17351)) ^ 505104090;
                        i11 = -375490636;
                    } else {
                        iM3169 = C0773.m3169("ۛ᩷") ^ i8;
                        i10 = ((iM3169 ^ i9) * (-13925)) ^ (-1867778423);
                        i11 = 807240287;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0205 A[PHI: r1 r2 r6 r16
      0x0205: PHI (r1v4 short[]) = (r1v3 short[]), (r1v2 short[]), (r1v2 short[]), (r1v2 short[]) binds: [B:60:0x0203, B:56:0x01e3, B:47:0x0182, B:19:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x0205: PHI (r2v4 char) = (r2v2 char), (r2v3 char), (r2v2 char), (r2v2 char) binds: [B:60:0x0203, B:56:0x01e3, B:47:0x0182, B:19:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x0205: PHI (r6v4 short) = (r6v2 short), (r6v2 short), (r6v3 short), (r6v2 short) binds: [B:60:0x0203, B:56:0x01e3, B:47:0x0182, B:19:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x0205: PHI (r16v16 java.lang.String) = (r16v5 java.lang.String), (r16v6 java.lang.String), (r16v9 java.lang.String), (r16v17 java.lang.String) binds: [B:60:0x0203, B:56:0x01e3, B:47:0x0182, B:19:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x026c A[PHI: r5 r8 r9 r16
      0x026c: PHI (r5v3 int) = (r5v2 int), (r5v2 int), (r5v2 int), (r5v6 int) binds: [B:69:0x026a, B:36:0x00f5, B:16:0x0063, B:7:0x003c] A[DONT_GENERATE, DONT_INLINE]
      0x026c: PHI (r8v4 short[]) = (r8v2 short[]), (r8v3 short[]), (r8v2 short[]), (r8v2 short[]) binds: [B:69:0x026a, B:36:0x00f5, B:16:0x0063, B:7:0x003c] A[DONT_GENERATE, DONT_INLINE]
      0x026c: PHI (r9v8 int) = (r9v2 int), (r9v3 int), (r9v2 int), (r9v2 int) binds: [B:69:0x026a, B:36:0x00f5, B:16:0x0063, B:7:0x003c] A[DONT_GENERATE, DONT_INLINE]
      0x026c: PHI (r16v19 java.lang.String) = (r16v3 java.lang.String), (r16v12 java.lang.String), (r16v18 java.lang.String), (r16v22 java.lang.String) binds: [B:69:0x026a, B:36:0x00f5, B:16:0x0063, B:7:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.ActivityC5577, android.app.Activity
    public final void onNewIntent(Intent intent) {
        String str;
        int iM3169;
        int i;
        int iM31610;
        int i2;
        int i3;
        String strM40377 = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i4 = 0;
        int i5 = 0;
        short s2 = 0;
        int i6 = 0;
        short[] sArr2 = null;
        int i7 = 0;
        int i8 = 0;
        int i9 = -1035729212;
        int i10 = C0269.f1558;
        int i11 = RunnableC0334.f1808;
        int iM31611 = C0773.m3169("ܽ֡") ^ i10;
        int i12 = ((iM31611 ^ i11) * 889) ^ (-1541357573);
        int i13 = 1991817794;
        while (true) {
            int i14 = iM31611 ^ i13;
            while (true) {
                i9 = ((((i9 ^ i11) * (-1847)) >> 31) & i12) ^ i14;
                switch (i9) {
                    case -1897736125:
                    case -1372768318:
                        str = strM40377;
                        if (C2288.f7433 > 0) {
                            iM3169 = C0773.m3169("۬ܺ") ^ i10;
                            i12 = ((iM3169 ^ i11) * (-11789)) ^ 116394870;
                            i = -1175076974;
                            i14 = iM3169 ^ i;
                            strM40377 = str;
                        }
                        strM40377 = str;
                        iM31610 = (C0773.m3169("֫ۙ") + i10) * 69;
                        str = strM40377;
                        i2 = ((iM31610 ^ i11) * 20781) ^ (-2146341303);
                        i3 = 428898023;
                        i14 = iM31610 ^ i3;
                        i12 = i2;
                        strM40377 = str;
                        break;
                    case -1817752861:
                    case 2077384980:
                        i6 = 886;
                        int iM2761 = (i10 - C0619.m2761("᩸᩵")) * (-59);
                        i14 = iM2761 ^ (-497734454);
                        i12 = ((iM2761 ^ i11) * 53) ^ (-477519996);
                        break;
                    case -1766589885:
                    case 1374808655:
                        str = strM40377;
                        sArr = f3786;
                        if (C3033.f9831 >= 0) {
                            iM3169 = C0619.m2761("᩻᩹") ^ i11;
                            i12 = ((iM3169 ^ i10) * (-19411)) ^ 2043539731;
                            i = 1939417936;
                        } else {
                            iM3169 = C0773.m3169("ܺ᩶") ^ i11;
                            i12 = ((iM3169 ^ i10) * (-479)) ^ (-1394255104);
                            i = 604718289;
                        }
                        i14 = iM3169 ^ i;
                        strM40377 = str;
                        break;
                    case -1748426107:
                    case -840049645:
                        i6 = 39200;
                        int iM2762 = (i10 - C0619.m2761("᩸᩵")) * (-59);
                        i14 = iM2762 ^ (-497734454);
                        i12 = ((iM2762 ^ i11) * 53) ^ (-477519996);
                        break;
                    case -1482145210:
                    case 1515343705:
                        if (C11235.f35427 < 0) {
                            iM31611 = C0619.m2761("ܿ᩸") ^ i11;
                            i12 = ((iM31611 ^ i10) * 27207) ^ 2031488303;
                            i13 = -976181616;
                        } else {
                            iM31611 = C0773.m3169("ᩳۧ") ^ i11;
                            i12 = ((iM31611 ^ i10) * (-28991)) ^ 693783210;
                            i13 = -579539885;
                        }
                        break;
                    case -1266675699:
                    case -114619936:
                        sArr2 = f3786;
                        if (C23916.f77426 <= 0) {
                            str = strM40377;
                            i7 = 696;
                            iM3169 = (C0773.m3169("۫ۧ") ^ i10) * 71;
                            i12 = ((iM3169 ^ i11) * (-13675)) ^ 614297672;
                            i = 1257298213;
                            i14 = iM3169 ^ i;
                            strM40377 = str;
                        } else {
                            int iM31612 = (C0773.m3169("᩻ۜ") + i10) * (-111);
                            i14 = iM31612 ^ 256266085;
                            i12 = ((iM31612 ^ i11) * (-32401)) ^ 439112741;
                            i7 = 696;
                        }
                        break;
                    case -1083503451:
                    case -709308228:
                        if ((s * s2) - i5 <= 0) {
                            str = strM40377;
                            iM3169 = (C0619.m2761("ܰܽ") ^ i10) * (-69);
                            i12 = ((iM3169 ^ i11) * 16331) ^ 1847584341;
                            i = -708237405;
                            i14 = iM3169 ^ i;
                            strM40377 = str;
                        } else {
                            iM31610 = C0773.m3169("ۘۧ") ^ i11;
                            str = strM40377;
                            i2 = ((iM31610 ^ i10) * (-24275)) ^ (-133843772);
                            i3 = -1508348125;
                            i14 = iM31610 ^ i3;
                            i12 = i2;
                            strM40377 = str;
                        }
                        break;
                    case -1000798039:
                    case 324894295:
                        C3734.m12144(intent, strM40377);
                        super.onNewIntent(intent);
                        setIntent(intent);
                        break;
                    case -389535672:
                    case 408417766:
                        C3492.m11488();
                        str = strM40377;
                        iM3169 = C0619.m2761("᩻᩹") ^ i11;
                        i12 = ((iM3169 ^ i10) * (-19411)) ^ 2043539731;
                        i = 1939417936;
                        i14 = iM3169 ^ i;
                        strM40377 = str;
                        break;
                    case -261119162:
                    case 1609978582:
                        C3448.m11248();
                        if (C11235.m28309() != 0) {
                            str = strM40377;
                            iM3169 = (C0773.m3169("۫ۧ") ^ i10) * 71;
                            i12 = ((iM3169 ^ i11) * (-13675)) ^ 614297672;
                            i = 1257298213;
                            i14 = iM3169 ^ i;
                            strM40377 = str;
                        } else {
                            iM31611 = C0773.m3169("ᩳۧ") ^ i11;
                            i12 = ((iM31611 ^ i10) * (-28991)) ^ 693783210;
                            i13 = -579539885;
                        }
                        break;
                    case -172683641:
                    case 172554726:
                        str = strM40377;
                        s = sArr[c];
                        i4 = s * s;
                        if (C4238.f15451 < 0) {
                            iM3169 = (i11 - C0773.m3169("ܺ۫")) * 59;
                            i12 = ((iM3169 ^ i10) * 17275) ^ (-1952626468);
                            i = -369794726;
                            i14 = iM3169 ^ i;
                            strM40377 = str;
                        }
                        strM40377 = str;
                        iM31610 = (C0773.m3169("֫ۙ") + i10) * 69;
                        str = strM40377;
                        i2 = ((iM31610 ^ i11) * 20781) ^ (-2146341303);
                        i3 = 428898023;
                        i14 = iM31610 ^ i3;
                        i12 = i2;
                        strM40377 = str;
                        break;
                    case 294115313:
                    case 1193933945:
                        strM40377 = C17202.m40377(sArr2, i7, i8, i6);
                        if (C3448.f11240 >= 0) {
                            iM31610 = (C0773.m3169("֫ۙ") + i10) * 69;
                            str = strM40377;
                            i2 = ((iM31610 ^ i11) * 20781) ^ (-2146341303);
                            i3 = 428898023;
                        } else {
                            iM31610 = (C0773.m3169("ᩳۛ") ^ i10) * 17;
                            str = strM40377;
                            i2 = ((iM31610 ^ i11) * 15393) ^ (-1307989642);
                            i3 = -406398738;
                        }
                        i14 = iM31610 ^ i3;
                        i12 = i2;
                        strM40377 = str;
                        break;
                    case 297025634:
                    case 1000522062:
                        str = strM40377;
                        c = 695;
                        if (RunnableC1848.f6235) {
                            iM3169 = C0619.m2761("᩻᩹") ^ i11;
                            i12 = ((iM3169 ^ i10) * (-19411)) ^ 2043539731;
                            i = 1939417936;
                        } else {
                            iM3169 = C0773.m3169("ۛ᩶") ^ i10;
                            i12 = ((iM3169 ^ i11) * (-12223)) ^ (-265390710);
                            i = -621578141;
                        }
                        i14 = iM3169 ^ i;
                        strM40377 = str;
                        break;
                    case 508064491:
                    case 1370817408:
                        str = strM40377;
                        s2 = 1348;
                        if (C1519.f5300 >= 0) {
                            iM3169 = C0619.m2761("᩻᩹") ^ i11;
                            i12 = ((iM3169 ^ i10) * (-19411)) ^ 2043539731;
                            i = 1939417936;
                        } else {
                            iM3169 = C0773.m3169("ᩳ֡") ^ i11;
                            i12 = ((iM3169 ^ i10) * (-8679)) ^ 186320951;
                            i = -1965569052;
                        }
                        i14 = iM3169 ^ i;
                        strM40377 = str;
                        break;
                    case 517033665:
                    case 1908108933:
                        if (C11235.f35427 >= 0) {
                            i8 = 6;
                            iM31610 = (C0773.m3169("֫ۙ") + i10) * 69;
                            str = strM40377;
                            i2 = ((iM31610 ^ i11) * 20781) ^ (-2146341303);
                            i3 = 428898023;
                            i14 = iM31610 ^ i3;
                            i12 = i2;
                            strM40377 = str;
                        } else {
                            int iM2763 = (C0619.m2761("᩶֡") ^ i11) * 57;
                            i14 = iM2763 ^ (-1339970691);
                            i12 = ((iM2763 ^ i10) * (-31791)) ^ 1268305283;
                            i8 = 6;
                        }
                        break;
                    case 1164690330:
                    case 1452141744:
                        C0773.m3161();
                        if (C1519.m5403()) {
                            iM31611 = C0773.m3169("ᩳۧ") ^ i11;
                            i12 = ((iM31611 ^ i10) * (-28991)) ^ 693783210;
                            i13 = -579539885;
                        }
                        str = strM40377;
                        iM3169 = C0619.m2761("᩻᩹") ^ i11;
                        i12 = ((iM3169 ^ i10) * (-19411)) ^ 2043539731;
                        i = 1939417936;
                        i14 = iM3169 ^ i;
                        strM40377 = str;
                        break;
                    case 1176869569:
                    case 1179340324:
                        C1146.m4231();
                        C1564.m5509();
                        break;
                    case 1370364822:
                    case 1509868633:
                        str = strM40377;
                        if (C1343.f4799 != 0) {
                            iM3169 = (C0773.m3169("۫ۧ") ^ i10) * 71;
                            i12 = ((iM3169 ^ i11) * (-13675)) ^ 614297672;
                            i = 1257298213;
                        } else {
                            iM3169 = C0773.m3169("۟ᩳ") ^ i11;
                            i12 = ((iM3169 ^ i10) * 20029) ^ 1437215637;
                            i = -1151481352;
                        }
                        i14 = iM3169 ^ i;
                        strM40377 = str;
                        break;
                    default:
                        str = strM40377;
                        i5 = i4 + 454276;
                        if (C0773.f2792 <= 0) {
                            iM3169 = (C0773.m3169("۫ۧ") ^ i10) * 71;
                            i12 = ((iM3169 ^ i11) * (-13675)) ^ 614297672;
                            i = 1257298213;
                        } else {
                            iM3169 = (i10 - C0773.m3169("᩶ܽ")) * (-39);
                            i12 = ((iM3169 ^ i11) * 16121) ^ (-1146584268);
                            i = -755722701;
                        }
                        i14 = iM3169 ^ i;
                        strM40377 = str;
                        break;
                }
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x01b7 A[PHI: r16 r17
      0x01b7: PHI (r16v14 java.lang.String) = (r16v12 java.lang.String), (r16v13 java.lang.String), (r16v15 java.lang.String) binds: [B:55:0x01b5, B:51:0x0190, B:42:0x011e] A[DONT_GENERATE, DONT_INLINE]
      0x01b7: PHI (r17v12 java.lang.String) = (r17v10 java.lang.String), (r17v11 java.lang.String), (r17v13 java.lang.String) binds: [B:55:0x01b5, B:51:0x0190, B:42:0x011e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:87:0x0344 A[PHI: r16 r17
      0x0344: PHI (r16v25 java.lang.String) = (r16v2 java.lang.String), (r16v3 java.lang.String), (r16v5 java.lang.String), (r16v31 java.lang.String) binds: [B:86:0x0342, B:82:0x0323, B:74:0x02c7, B:10:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x0344: PHI (r17v23 java.lang.String) = (r17v0 java.lang.String), (r17v1 java.lang.String), (r17v3 java.lang.String), (r17v29 java.lang.String) binds: [B:86:0x0342, B:82:0x0323, B:74:0x02c7, B:10:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0060, code lost:
    
        if (l.C1321.f4751 >= 0) goto L17;
     */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m3976(android.widget.EditText r18, android.widget.EditText r19, l.DialogInterfaceC8327 r20, l.ViewOnClickListenerC1057 r21, com.google.android.material.textfield.TextInputLayout r22, com.google.android.material.textfield.TextInputLayout r23) {
        /*
            Method dump skipped, instruction units count: 1066
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC1057.m3976(android.widget.EditText, android.widget.EditText, l.۠ۖۧ, l.֨۠᩻, com.google.android.material.textfield.TextInputLayout, com.google.android.material.textfield.TextInputLayout):void");
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0276 A[PHI: r4
      0x0276: PHI (r4v3 short[]) = (r4v2 short[]), (r4v4 short[]) binds: [B:63:0x0274, B:51:0x01fe] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x02ef A[PHI: r1 r2
      0x02ef: PHI (r1v6 int) = (r1v2 int), (r1v2 int), (r1v2 int), (r1v5 int), (r1v2 int) binds: [B:75:0x02ed, B:71:0x02cd, B:55:0x0220, B:32:0x0100, B:12:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x02ef: PHI (r2v5 int) = (r2v2 int), (r2v2 int), (r2v2 int), (r2v4 int), (r2v2 int) binds: [B:75:0x02ed, B:71:0x02cd, B:55:0x0220, B:32:0x0100, B:12:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:80:0x0323  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m3960(C13511 c13511, ViewOnClickListenerC1057 viewOnClickListenerC1057, View view, EditText editText, EditText editText2, TextInputLayout textInputLayout, C13778 c13778) {
        int iM3169;
        int i;
        int i2;
        int iM31610 = 0;
        int i3 = 0;
        int iM2761 = 0;
        short[] sArr = null;
        int i4 = 0;
        int i5 = 1897323434;
        int i6 = C1321.f4751;
        int i7 = C1826.f6190;
        int iM31611 = C0773.m3169("᩸ۧ") ^ i7;
        int i8 = ((iM31611 ^ i6) * (-343)) ^ (-112906819);
        int i9 = -949518319;
        while (true) {
            int i10 = iM31611 ^ i9;
            while (true) {
                i5 = ((((i5 ^ i6) * 25189) >> 31) & i8) ^ i10;
                switch (i5) {
                    case -2144922860:
                    case -1962361967:
                        C2375.m8071(textInputLayout, C0773.m3169(C11235.m28300(f3786, 76, 3, i4)) ^ 2119706454);
                        break;
                    case -1974003110:
                    case 1501937880:
                        C3077.m10041();
                        break;
                    case -1874939429:
                    case -496293919:
                        C3734.m12142(RunnableC1848.m6367(c13778, 2118249652 ^ iM2761));
                        break;
                    case -1840576942:
                    case -1227552757:
                        i4 = 30574;
                        iM3169 = C0773.m3169("ۡۛ") ^ i7;
                        i = ((iM3169 ^ i6) * (-15679)) ^ 1703636977;
                        i2 = 968507751;
                        i10 = iM3169 ^ i2;
                        i8 = i;
                        break;
                    case -1808371191:
                    case 357663261:
                        if (RunnableC3055.m9938(c13778) == 1100) {
                            iM3169 = C0619.m2761("ۧ᩷") ^ i6;
                            i = ((iM3169 ^ i7) * 29061) ^ 1340840473;
                            i2 = 764449946;
                        } else {
                            iM3169 = C0619.m2761("۫ܺ") ^ i6;
                            i = ((iM3169 ^ i7) * 7179) ^ 1626777228;
                            i2 = 340607154;
                        }
                        i10 = iM3169 ^ i2;
                        i8 = i;
                        break;
                    case -1733021380:
                    case 1307052922:
                        C2354.m7982(C3448.m11246(view, iM31610 ^ i3), false);
                        C2354.m7982(editText, false);
                        C2287.m7751(editText2);
                        viewOnClickListenerC1057.m3974();
                        break;
                    case -1551791975:
                    case 851971151:
                        if (C3690.f12684 <= 0) {
                            iM3169 = C0773.m3169("֡ܳ") ^ i7;
                            i = ((iM3169 ^ i6) * 32061) ^ (-1126590482);
                            i2 = 909417344;
                        } else {
                            iM3169 = C0773.m3169("ܰᩴ") ^ i7;
                            i = ((iM3169 ^ i6) * (-24833)) ^ (-868627598);
                            i2 = 1402369061;
                        }
                        i10 = iM3169 ^ i2;
                        i8 = i;
                        break;
                    case -1294646682:
                    case -555657765:
                        iM2761 = C0619.m2761(C2288.m7761(f3786, 73, 3, i4));
                        if (C3690.m11987()) {
                            iM3169 = C0619.m2761("ۘܶ") ^ i6;
                            i = ((iM3169 ^ i7) * (-3983)) ^ 1672778629;
                            i2 = -238838487;
                            i10 = iM3169 ^ i2;
                            i8 = i;
                        } else {
                            int iM31612 = (C0773.m3169("ۢ᩸") ^ i7) * (-35);
                            i10 = iM31612 ^ (-1532210026);
                            i8 = ((iM31612 ^ i6) * 26723) ^ (-741350184);
                        }
                        break;
                    case -1003398217:
                    case 1498606730:
                        if (AbstractC3624.f12429 <= 0) {
                            iM3169 = C0773.m3169("֡ܳ") ^ i7;
                            i = ((iM3169 ^ i6) * 32061) ^ (-1126590482);
                            i2 = 909417344;
                        } else {
                            iM3169 = C0773.m3169("ܰۡ") ^ i6;
                            i = ((iM3169 ^ i7) * (-4327)) ^ (-1293355856);
                            i2 = -1782677180;
                        }
                        i10 = iM3169 ^ i2;
                        i8 = i;
                        break;
                    case -656872433:
                    case 1761594555:
                        viewOnClickListenerC1057.m3968();
                        iM31610 = C0773.m3169(C1343.m4939(f3786, 70, 3, i4));
                        i3 = 2099944338;
                        if (C0487.m2356() >= 0) {
                            iM3169 = (C0619.m2761("۟ۖ") + i7) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                            i = ((iM3169 ^ i6) * 1901) ^ (-1509221997);
                            i2 = -382160874;
                        } else {
                            iM3169 = C0619.m2761("ܿܰ") ^ i7;
                            i = ((iM3169 ^ i6) * (-29017)) ^ (-438947971);
                            i2 = 688774988;
                        }
                        i10 = iM3169 ^ i2;
                        i8 = i;
                        break;
                    case -631292042:
                    case -480056088:
                        if (C0269.f1558 <= 0) {
                            iM3169 = (C0619.m2761("۟ۖ") + i7) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                            i = ((iM3169 ^ i6) * 1901) ^ (-1509221997);
                            i2 = -382160874;
                        } else {
                            iM3169 = (C0773.m3169("ۛۚ") + i7) * (-21);
                            i = ((iM3169 ^ i6) * (-23275)) ^ 1915636190;
                            i2 = -892987731;
                        }
                        i10 = iM3169 ^ i2;
                        i8 = i;
                        break;
                    case -579997581:
                    case -111537886:
                        C1564.m5509();
                        iM3169 = (C0619.m2761("۟ۖ") + i7) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM3169 ^ i6) * 1901) ^ (-1509221997);
                        i2 = -382160874;
                        i10 = iM3169 ^ i2;
                        i8 = i;
                        break;
                    case -231916913:
                    case 1985216857:
                        if (C3492.m11488()) {
                            iM3169 = (C0619.m2761("ۚܳ") + i7) * (-111);
                            i = ((iM3169 ^ i6) * 11829) ^ 1129083594;
                            i2 = -2079450057;
                        } else {
                            iM3169 = (C0619.m2761("۟ۖ") + i7) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                            i = ((iM3169 ^ i6) * 1901) ^ (-1509221997);
                            i2 = -382160874;
                        }
                        i10 = iM3169 ^ i2;
                        i8 = i;
                        break;
                    case -17183863:
                    case 1183327822:
                        i4 = 18369;
                        iM3169 = C0773.m3169("ۡۛ") ^ i7;
                        i = ((iM3169 ^ i6) * (-15679)) ^ 1703636977;
                        i2 = 968507751;
                        i10 = iM3169 ^ i2;
                        i8 = i;
                        break;
                    case 237191580:
                    case 1944496623:
                        sArr = f3786;
                        if (C4238.f15451 >= 0) {
                            iM3169 = (C0619.m2761("ۨ֨") ^ i6) * (-43);
                            i = ((iM3169 ^ i7) * 23335) ^ (-2055987068);
                            i2 = 225510710;
                        } else {
                            iM3169 = (C0773.m3169("֨ۚ") + i6) * (-61);
                            i = ((iM3169 ^ i7) * 28137) ^ 442634036;
                            i2 = 1760021815;
                        }
                        i10 = iM3169 ^ i2;
                        i8 = i;
                        break;
                    case 594962396:
                    case 930332294:
                        if (C3099.f10023 <= 0) {
                            iM3169 = (C0619.m2761("۟ۖ") + i7) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                            i = ((iM3169 ^ i6) * 1901) ^ (-1509221997);
                            i2 = -382160874;
                        } else {
                            iM3169 = (C0619.m2761("֫ۚ") ^ i6) * (-93);
                            i = ((iM3169 ^ i7) * (-543)) ^ 1211252621;
                            i2 = -2004043565;
                        }
                        i10 = iM3169 ^ i2;
                        i8 = i;
                        break;
                    case 629184752:
                    case 1925711076:
                        short s = sArr[61];
                        int i11 = s * 26444;
                        int i12 = s + 6611;
                        if ((i12 * i12) - i11 < 0) {
                            iM3169 = C0619.m2761("᩹ۘ") ^ i6;
                            i = ((iM3169 ^ i7) * 419) ^ 1896175312;
                            i2 = 273607695;
                        } else {
                            iM3169 = C0619.m2761("᩺᩹") ^ i7;
                            i = ((iM3169 ^ i6) * (-12651)) ^ (-808547816);
                            i2 = -1709197487;
                        }
                        i10 = iM3169 ^ i2;
                        i8 = i;
                        break;
                    case 806277443:
                    case 859461918:
                        if (C1146.f4234 >= 0) {
                            iM3169 = C0619.m2761("ۘܶ") ^ i6;
                            i = ((iM3169 ^ i7) * (-3983)) ^ 1672778629;
                            i2 = -238838487;
                        } else {
                            iM3169 = C0619.m2761("ܿܽ") ^ i7;
                            i = ((iM3169 ^ i6) * (-27493)) ^ 969419624;
                            i2 = -1095046321;
                        }
                        i10 = iM3169 ^ i2;
                        i8 = i;
                        break;
                    case 824604203:
                    case 1465620748:
                        C3492.m11488();
                        if (C3492.f12043 > 0) {
                        }
                        iM3169 = (C0619.m2761("۟ۖ") + i7) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM3169 ^ i6) * 1901) ^ (-1509221997);
                        i2 = -382160874;
                        i10 = iM3169 ^ i2;
                        i8 = i;
                        break;
                    case 827828059:
                    case 858176398:
                        if (C2419.f7754 >= 0) {
                            iM3169 = (C0619.m2761("ۨ֨") ^ i6) * (-43);
                            i = ((iM3169 ^ i7) * 23335) ^ (-2055987068);
                            i2 = 225510710;
                        } else {
                            iM3169 = (i6 - C0619.m2761("᩸ᩴ")) * (-29);
                            i = ((iM3169 ^ i7) * (-20159)) ^ 229114535;
                            i2 = 305461379;
                        }
                        i10 = iM3169 ^ i2;
                        i8 = i;
                        break;
                    case 1389436373:
                    case 1650540493:
                        if (RunnableC3646.m11813() != 0) {
                            iM3169 = C0619.m2761("ۘܶ") ^ i6;
                            i = ((iM3169 ^ i7) * (-3983)) ^ 1672778629;
                            i2 = -238838487;
                            i10 = iM3169 ^ i2;
                            i8 = i;
                        }
                        iM3169 = (C0619.m2761("۟ۖ") + i7) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM3169 ^ i6) * 1901) ^ (-1509221997);
                        i2 = -382160874;
                        i10 = iM3169 ^ i2;
                        i8 = i;
                        break;
                    case 1566551706:
                    case 1987436653:
                        C3734.m12144(c13778, RunnableC3646.m11809(f3786, 62, 8, i4));
                        C1564.m5521(c13511);
                        if (C2878.m9488(c13778)) {
                            iM3169 = (C0773.m3169("ᩴ᩻") ^ i6) * (-85);
                            i = ((iM3169 ^ i7) * (-31143)) ^ (-1544444785);
                            i2 = 1988127579;
                        } else {
                            iM3169 = C0619.m2761("۬֫") ^ i6;
                            i = ((iM3169 ^ i7) * 29877) ^ (-1108685013);
                            i2 = 850293069;
                        }
                        i10 = iM3169 ^ i2;
                        i8 = i;
                        break;
                    default:
                        C3033.m9845();
                        if (!RunnableC3646.f12471) {
                        }
                        iM3169 = C0773.m3169("֡ܳ") ^ i7;
                        i = ((iM3169 ^ i6) * 32061) ^ (-1126590482);
                        i2 = 909417344;
                        i10 = iM3169 ^ i2;
                        i8 = i;
                        break;
                        break;
                }
                return;
            }
            iM31611 = C0619.m2761("֡ۖ") ^ i7;
            i8 = ((iM31611 ^ i6) * 27683) ^ 1563685674;
            i9 = -1182239039;
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x016d A[PHI: r4 r7 r9 r15
      0x016d: PHI (r4v4 android.content.Intent) = 
      (r4v2 android.content.Intent)
      (r4v3 android.content.Intent)
      (r4v2 android.content.Intent)
      (r4v2 android.content.Intent)
      (r4v2 android.content.Intent)
     binds: [B:42:0x016b, B:28:0x00f3, B:17:0x008b, B:15:0x0087, B:12:0x0081] A[DONT_GENERATE, DONT_INLINE]
      0x016d: PHI (r7v4 short[]) = (r7v2 short[]), (r7v3 short[]), (r7v2 short[]), (r7v2 short[]), (r7v2 short[]) binds: [B:42:0x016b, B:28:0x00f3, B:17:0x008b, B:15:0x0087, B:12:0x0081] A[DONT_GENERATE, DONT_INLINE]
      0x016d: PHI (r9v4 int) = (r9v2 int), (r9v3 int), (r9v2 int), (r9v2 int), (r9v2 int) binds: [B:42:0x016b, B:28:0x00f3, B:17:0x008b, B:15:0x0087, B:12:0x0081] A[DONT_GENERATE, DONT_INLINE]
      0x016d: PHI (r15v4 int) = (r15v3 int), (r15v2 int), (r15v2 int), (r15v2 int), (r15v2 int) binds: [B:42:0x016b, B:28:0x00f3, B:17:0x008b, B:15:0x0087, B:12:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x01a7 A[PHI: r1 r6 r14
      0x01a7: PHI (r1v4 android.content.Intent) = (r1v3 android.content.Intent), (r1v2 android.content.Intent), (r1v2 android.content.Intent) binds: [B:46:0x01a5, B:38:0x014c, B:9:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x01a7: PHI (r6v4 int) = (r6v2 int), (r6v3 int), (r6v2 int) binds: [B:46:0x01a5, B:38:0x014c, B:9:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x01a7: PHI (r14v4 short[]) = (r14v3 short[]), (r14v2 short[]), (r14v2 short[]) binds: [B:46:0x01a5, B:38:0x014c, B:9:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x026a A[PHI: r11
      0x026a: PHI (r11v4 int) = (r11v3 int), (r11v2 int) binds: [B:62:0x0268, B:12:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x02dc A[PHI: r12 r17 r18 r23
      0x02dc: PHI (r12v3 short) = (r12v2 short), (r12v2 short), (r12v4 short) binds: [B:74:0x02da, B:66:0x029d, B:58:0x0248] A[DONT_GENERATE, DONT_INLINE]
      0x02dc: PHI (r17v4 char) = (r17v3 char), (r17v2 char), (r17v2 char) binds: [B:74:0x02da, B:66:0x029d, B:58:0x0248] A[DONT_GENERATE, DONT_INLINE]
      0x02dc: PHI (r18v4 int) = (r18v2 int), (r18v3 int), (r18v2 int) binds: [B:74:0x02da, B:66:0x029d, B:58:0x0248] A[DONT_GENERATE, DONT_INLINE]
      0x02dc: PHI (r23v5 int) = (r23v3 int), (r23v4 int), (r23v3 int) binds: [B:74:0x02da, B:66:0x029d, B:58:0x0248] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:79:0x030e A[PHI: r8 r16
      0x030e: PHI (r8v4 short) = (r8v2 short), (r8v3 short), (r8v2 short), (r8v2 short) binds: [B:78:0x030c, B:70:0x02bc, B:15:0x0087, B:9:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x030e: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:78:0x030c, B:70:0x02bc, B:15:0x0087, B:9:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractActivityC17204, l.ActivityC3409, android.app.Activity
    public final void onResume() {
        int iM2761;
        int i;
        int i2;
        int i3 = C1146.f4234;
        int i4 = C1826.f6190;
        int iM2762 = (i3 - C0619.m2761("ܽ᩵")) * (-5);
        int i5 = ((iM2762 ^ i4) * 25645) ^ (-495719247);
        String strM8166 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM2762 ^ 155679187;
        Intent intentM8359 = null;
        int i7 = 0;
        short s = 0;
        int i8 = 0;
        int i9 = 0;
        short s2 = 0;
        int i10 = 0;
        int i11 = 0;
        char c = 0;
        int i12 = 0;
        int i13 = 1719624032;
        int i14 = 0;
        short[] sArr3 = null;
        String strM6366 = null;
        Intent intentM83510 = null;
        boolean z = false;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i4) * (-25251)) >> 31));
            switch (i13) {
                case -2120259803:
                case 145515936:
                    C1783.m6232();
                    iM2761 = (C0773.m3169("ᩴܶ") + i4) * (-21);
                    i = ((iM2761 ^ i3) * (-11071)) ^ 2130530218;
                    i2 = 645120090;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -2089623916:
                case -125964143:
                    strM6366 = RunnableC1848.m6366(sArr2, i8, 18, i10);
                    if (intentM83510.getBooleanExtra(strM6366, z)) {
                        iM2761 = C0773.m3169("ܶ᩹") ^ i3;
                        i = ((iM2761 ^ i4) * (-10663)) ^ (-1512248475);
                        i2 = -2040205437;
                    } else {
                        iM2761 = (C0773.m3169("ܳۚ") + i3) * 5;
                        i = ((iM2761 ^ i4) * 14401) ^ 291822837;
                        i2 = -1553551370;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -2065602051:
                case 1549093657:
                    sArr3 = f3786;
                    if (C1783.f6087 <= 0) {
                        iM2761 = C0619.m2761("ۨ֡") ^ i3;
                        i = ((iM2761 ^ i4) * (-20511)) ^ (-1053153191);
                        i2 = 837214878;
                    } else {
                        iM2761 = (C0619.m2761("᩹ܿ") ^ i3) * (-13);
                        i = ((iM2761 ^ i4) * (-16253)) ^ (-1134617154);
                        i2 = 2040305190;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -2062048718:
                case -1633869319:
                    C3099.m10095();
                    RunnableC3055.m9933();
                    break;
                case -2000097698:
                case 166320115:
                    i7 = 14;
                    if (C1519.f5300 >= 0) {
                        iM2761 = (i4 - C0773.m3169("ܶ᩻")) * (-13);
                        i = ((iM2761 ^ i3) * (-29709)) ^ (-2054213117);
                        i2 = -946008873;
                    } else {
                        iM2761 = (C0619.m2761("۫۬") + i3) * (-71);
                        i = ((iM2761 ^ i4) * (-16263)) ^ 491737886;
                        i2 = -876607895;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1982197551:
                case 1758246336:
                    i12 = s * s;
                    i14 = 98763844;
                    if (C1343.f4799 != 0) {
                        iM2761 = C0619.m2761("ۨ᩻") ^ i3;
                        i = ((iM2761 ^ i4) * 16499) ^ (-2082217080);
                        i2 = 2007989888;
                    } else {
                        iM2761 = (C0619.m2761("ۚۚ") + i3) * 51;
                        i = ((iM2761 ^ i4) * 31793) ^ 93157749;
                        i2 = 288566111;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1656641236:
                case -810602770:
                    if (C1542.f5343 > 0) {
                        iM2761 = (C0773.m3169("ᩴܶ") + i4) * (-21);
                        i = ((iM2761 ^ i3) * (-11071)) ^ 2130530218;
                        i2 = 645120090;
                    } else {
                        iM2761 = C0619.m2761("ۨ֡") ^ i3;
                        i = ((iM2761 ^ i4) * (-20511)) ^ (-1053153191);
                        i2 = 837214878;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1438338543:
                case 907889538:
                    C2485.m8359(this).removeExtra(strM6366);
                    m3972();
                    iM2761 = (C0773.m3169("ܳۚ") + i3) * 5;
                    i = ((iM2761 ^ i4) * 14401) ^ 291822837;
                    i2 = -1553551370;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1436778539:
                case 1884570954:
                    c = 702;
                    if (C3077.f9998) {
                        iM2761 = (C0619.m2761("᩵۬") ^ i4) * (-57);
                        i = ((iM2761 ^ i3) * 17623) ^ 957013108;
                        i2 = -1486943597;
                    } else {
                        iM2761 = C0619.m2761("ۨ᩻") ^ i3;
                        i = ((iM2761 ^ i4) * 16499) ^ (-2082217080);
                        i2 = 2007989888;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1357491479:
                case 798427139:
                    s = sArr3[c];
                    if (C3690.f12684 <= 0) {
                        iM2761 = C0619.m2761("ۨ֡") ^ i3;
                        i = ((iM2761 ^ i4) * (-20511)) ^ (-1053153191);
                        i2 = 837214878;
                    } else {
                        iM2761 = (i4 - C0619.m2761("ۖۨ")) * (-31);
                        i = ((iM2761 ^ i3) * 7703) ^ 1982984608;
                        i2 = 1099114148;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1128229392:
                case -975601182:
                    strM8166 = C2419.m8166(sArr, i11, i7, i10);
                    z = false;
                    if (intentM8359.getBooleanExtra(strM8166, false)) {
                        iM2761 = C0773.m3169("ܶۚ") ^ i4;
                        i = ((iM2761 ^ i3) * (-6545)) ^ (-1567230616);
                        i2 = -1808757974;
                    } else {
                        iM2761 = C0773.m3169("᩸ۜ") ^ i3;
                        i = ((iM2761 ^ i4) * (-12923)) ^ 1172048248;
                        i2 = -1263783572;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -942583747:
                case 1060126715:
                    int i15 = s + s2;
                    if (i9 - (i15 * i15) >= 0) {
                        iM2761 = (C0773.m3169("۫ᩳ") ^ i3) * (-35);
                        i = ((iM2761 ^ i4) * (-3721)) ^ (-1644697159);
                        i2 = -531923689;
                    } else {
                        iM2761 = C0619.m2761("ۙܺ") ^ i4;
                        i = ((iM2761 ^ i3) * 17003) ^ (-287053204);
                        i2 = 468451961;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -942223343:
                case -309522533:
                    if (C1542.f5343 <= 0) {
                        iM2761 = C0619.m2761("ۨ֡") ^ i3;
                        i = ((iM2761 ^ i4) * (-20511)) ^ (-1053153191);
                        i2 = 837214878;
                    } else {
                        iM2761 = (i4 - C0773.m3169("ܶ᩻")) * (-13);
                        i = ((iM2761 ^ i3) * (-29709)) ^ (-2054213117);
                        i2 = -946008873;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -795332099:
                case 963265401:
                    int i16 = i12 + i14;
                    i9 = i16 + i16;
                    if (C2878.f9462) {
                        iM2761 = C0619.m2761("ܿۗ") ^ i4;
                        i = ((iM2761 ^ i3) * (-18153)) ^ (-42963239);
                        i2 = -106660429;
                    } else {
                        iM2761 = C0619.m2761("ۨۘ") ^ i4;
                        i = ((iM2761 ^ i3) * 13325) ^ 1840152383;
                        i2 = -1954611976;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -788136997:
                case -558518940:
                    break;
                case -714341441:
                case 2131356191:
                    i10 = 20032;
                    iM2761 = (i4 - C0773.m3169("ᩳܽ")) * 63;
                    i = ((iM2761 ^ i3) * (-26521)) ^ (-1773303908);
                    i2 = -1972969979;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -629100321:
                case 1058433813:
                    i10 = 10949;
                    iM2761 = (i4 - C0773.m3169("ᩳܽ")) * 63;
                    i = ((iM2761 ^ i3) * (-26521)) ^ (-1773303908);
                    i2 = -1972969979;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -275049489:
                case 500707009:
                    s2 = 9938;
                    if (C1542.f5343 <= 0) {
                        iM2761 = C0619.m2761("ۨ᩻") ^ i3;
                        i = ((iM2761 ^ i4) * 16499) ^ (-2082217080);
                        i2 = 2007989888;
                    } else {
                        iM2761 = C0773.m3169("۬᩵") ^ i3;
                        i = ((iM2761 ^ i4) * 16481) ^ 1316166314;
                        i2 = -1891004176;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -254452055:
                case 469092654:
                    C2485.m8359(this).removeExtra(strM8166);
                    m3985();
                    iM2761 = C0773.m3169("᩸ۜ") ^ i3;
                    i = ((iM2761 ^ i4) * (-12923)) ^ 1172048248;
                    i2 = -1263783572;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -112574928:
                case 717384577:
                    intentM8359 = C2485.m8359(this);
                    sArr = f3786;
                    if (RunnableC3055.m9933() != 0) {
                        iM2761 = (i4 - C0773.m3169("ܶ᩻")) * (-13);
                        i = ((iM2761 ^ i3) * (-29709)) ^ (-2054213117);
                        i2 = -946008873;
                    } else {
                        iM2761 = C0773.m3169("᩵֨") ^ i4;
                        i = ((iM2761 ^ i3) * 3223) ^ (-1076058244);
                        i2 = 485397046;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -108633225:
                case 81155082:
                    intentM83510 = C2485.m8359(this);
                    sArr2 = f3786;
                    i8 = 717;
                    if (C2288.f7433 <= 0) {
                        iM2761 = (C0773.m3169("ᩴܶ") + i4) * (-21);
                        i = ((iM2761 ^ i3) * (-11071)) ^ 2130530218;
                        i2 = 645120090;
                    } else {
                        iM2761 = C0773.m3169("ᩴ᩵") ^ i4;
                        i = ((iM2761 ^ i3) * 5355) ^ (-405380407);
                        i2 = -409689102;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 641272996:
                case 2013829122:
                    i11 = 703;
                    if (C1783.f6087 <= 0) {
                        iM2761 = (C0773.m3169("ᩴܶ") + i4) * (-21);
                        i = ((iM2761 ^ i3) * (-11071)) ^ 2130530218;
                        i2 = 645120090;
                    } else {
                        iM2761 = C0619.m2761("ܶۧ") ^ i3;
                        i = ((iM2761 ^ i4) * (-13723)) ^ 1567678665;
                        i2 = 951146029;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 670303057:
                case 675757342:
                    if (C0773.f2792 > 0) {
                        iM2761 = (C0773.m3169("ᩴܶ") + i4) * (-21);
                        i = ((iM2761 ^ i3) * (-11071)) ^ 2130530218;
                        i2 = 645120090;
                    } else {
                        iM2761 = C0619.m2761("ܿۗ") ^ i4;
                        i = ((iM2761 ^ i3) * (-18153)) ^ (-42963239);
                        i2 = -106660429;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 1176171216:
                case 1870553758:
                    C0950.m3790(this);
                    break;
                default:
                    super.onResume();
                    if (C2702.m8873()) {
                        iM2761 = (C0619.m2761("ۤᩳ") ^ i3) * 47;
                        i = ((iM2761 ^ i4) * (-25371)) ^ (-479609691);
                        i2 = -1625503149;
                    } else {
                        iM2761 = C0619.m2761("۫ۗ") ^ i4;
                        i = ((iM2761 ^ i3) * 2473) ^ (-188612385);
                        i2 = 587144315;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004b, code lost:
    
        if (l.RunnableC3055.f9898 >= 0) goto L13;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m3953(final android.view.View r19, final android.widget.EditText r20, final l.ViewOnClickListenerC1057 r21) {
        /*
            Method dump skipped, instruction units count: 858
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC1057.m3953(android.view.View, android.widget.EditText, l.֨۠᩻):void");
    }

    /* JADX WARN: Code duplicated, block: B:72:0x0410 A[PHI: r9 r10 r16 r26
      0x0410: PHI (r9v5 android.view.View) = (r9v2 android.view.View), (r9v2 android.view.View), (r9v4 android.view.View), (r9v2 android.view.View) binds: [B:8:0x006f, B:71:0x040e, B:40:0x01c6, B:36:0x017f] A[DONT_GENERATE, DONT_INLINE]
      0x0410: PHI (r10v3 android.widget.TextView) = 
      (r10v2 android.widget.TextView)
      (r10v2 android.widget.TextView)
      (r10v2 android.widget.TextView)
      (r10v6 android.widget.TextView)
     binds: [B:8:0x006f, B:71:0x040e, B:40:0x01c6, B:36:0x017f] A[DONT_GENERATE, DONT_INLINE]
      0x0410: PHI (r16v4 java.lang.String) = (r16v2 java.lang.String), (r16v3 java.lang.String), (r16v2 java.lang.String), (r16v2 java.lang.String) binds: [B:8:0x006f, B:71:0x040e, B:40:0x01c6, B:36:0x017f] A[DONT_GENERATE, DONT_INLINE]
      0x0410: PHI (r26v28 android.widget.TextView) = 
      (r26v8 android.widget.TextView)
      (r26v16 android.widget.TextView)
      (r26v27 android.widget.TextView)
      (r26v29 android.widget.TextView)
     binds: [B:8:0x006f, B:71:0x040e, B:40:0x01c6, B:36:0x017f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:89:0x0539 A[PHI: r13 r22 r26
      0x0539: PHI (r13v3 short[]) = (r13v2 short[]), (r13v2 short[]), (r13v5 short[]) binds: [B:14:0x0089, B:88:0x0537, B:50:0x028b] A[DONT_GENERATE, DONT_INLINE]
      0x0539: PHI (r22v9 short[]) = (r22v2 short[]), (r22v8 short[]), (r22v2 short[]) binds: [B:14:0x0089, B:88:0x0537, B:50:0x028b] A[DONT_GENERATE, DONT_INLINE]
      0x0539: PHI (r26v25 android.widget.TextView) = (r26v7 android.widget.TextView), (r26v11 android.widget.TextView), (r26v26 android.widget.TextView) binds: [B:14:0x0089, B:88:0x0537, B:50:0x028b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractActivityC17204, l.ActivityC7405, l.ActivityC3409, l.ActivityC5577, l.ActivityC8866, android.app.Activity
    public final void onCreate(Bundle bundle) throws Throwable {
        int i;
        int i2;
        int iM3169;
        int i3;
        int iM2761;
        int i4;
        int i5;
        int iM2762;
        int i6;
        int i7;
        int i8;
        int iM2763;
        int i9;
        TextView textView;
        int iM31610;
        int i10;
        int iM31611;
        int i11;
        int i12 = -1918627632;
        int i13 = C0487.f2131;
        int i14 = C1783.f6087;
        int iM2764 = C0619.m2761("ܰ᩻") ^ i13;
        int i15 = ((iM2764 ^ i14) * 18745) ^ (-1272665522);
        int i16 = iM2764 ^ (-226482649);
        TextView textView2 = null;
        String strM47853 = null;
        String str = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i17 = 0;
        int iM31612 = 0;
        int i18 = 0;
        int i19 = 0;
        boolean z = false;
        int i20 = 0;
        int i21 = 0;
        int iM31613 = 0;
        int i22 = 0;
        int iM31614 = 0;
        int iM2765 = 0;
        View viewM9476 = null;
        short[] sArr3 = null;
        int i23 = 0;
        String strM4056 = null;
        TextView textView3 = null;
        int iM2766 = 0;
        while (true) {
            i12 = i16 ^ (i15 & (((i12 ^ i14) * 28583) >> 31));
            switch (i12) {
                case -2142815211:
                case -1058413771:
                    textView3 = textView3;
                    C11235.m28299(C1564.m5518(this, iM31614 ^ i23), this);
                    C11235.m28299(C1564.m5518(this, C0773.m3169(C4282.m13650(f3786, 613, 3, i20)) ^ 2118496683), this);
                    sArr3 = f3786;
                    if (C2702.f8586 <= 0) {
                        iM3169 = C0619.m2761("ܰۨ") ^ i14;
                        i = ((iM3169 ^ i13) * (-31353)) ^ (-1775850120);
                        i3 = -931128013;
                    } else {
                        iM3169 = (C0619.m2761("᩵ۡ") ^ i14) * 25;
                        i = ((iM3169 ^ i13) * (-9055)) ^ 878829034;
                        i3 = 1049278922;
                    }
                    i2 = iM3169 ^ i3;
                    TextView textView4 = textView3;
                    i16 = i2;
                    i15 = i;
                    textView3 = textView4;
                    break;
                case -2128912323:
                case 1580198876:
                    textView3 = textView3;
                    i17 = iM2765 ^ i21;
                    C2375.m8070(C2878.m9476(this, i17), this);
                    iM31612 = 2121418148 ^ C0773.m3169(C3998.m12925(f3786, 622, 3, i20));
                    C2375.m8070(C1564.m5518(this, iM31612), this);
                    i18 = 8;
                    if (C18978.m44075()) {
                        iM3169 = C0619.m2761("ۤۚ") ^ i13;
                        i = ((iM3169 ^ i14) * 6601) ^ (-1402642415);
                        i3 = -1840060884;
                    } else {
                        iM3169 = (C0619.m2761("ۘۡ") ^ i13) * 57;
                        i = ((iM3169 ^ i14) * (-32443)) ^ (-194160733);
                        i3 = 1929769610;
                    }
                    i2 = iM3169 ^ i3;
                    TextView textView5 = textView3;
                    i16 = i2;
                    i15 = i;
                    textView3 = textView5;
                    break;
                case -2102095491:
                case -1282812833:
                    if (C3492.f12043 > 0) {
                        iM2761 = (C0619.m2761("֡ۧ") ^ i13) * (-73);
                        i4 = ((iM2761 ^ i14) * (-9617)) ^ (-554020685);
                        i5 = -979875321;
                        i16 = iM2761 ^ i5;
                        i15 = i4;
                    } else {
                        textView = textView3;
                        sArr3 = sArr3;
                        i17 = i17;
                        iM31610 = (i14 - C0619.m2761("ۗ֫")) * (-35);
                        i6 = ((iM31610 ^ i13) * (-21549)) ^ (-1648774995);
                        i10 = 1837165000;
                        i9 = iM31610 ^ i10;
                        textView3 = textView;
                        i16 = i9;
                        i15 = i6;
                        i17 = i17;
                        sArr3 = sArr3;
                    }
                    break;
                case -2061271742:
                case 970607627:
                    C2485.m8358(C2878.m9476(this, iM31612), i18);
                    iM3169 = (i14 - C0773.m3169("ᩳۘ")) * 99;
                    i = ((iM3169 ^ i13) * (-24649)) ^ (-1122235752);
                    i3 = -1791430240;
                    i2 = iM3169 ^ i3;
                    TextView textView6 = textView3;
                    i16 = i2;
                    i15 = i;
                    textView3 = textView6;
                    break;
                case -2049821184:
                case -1832303932:
                    C2485.m8358(C2878.m9476(this, iM2766), i18);
                    iM3169 = C0619.m2761("ܿۖ") ^ i14;
                    i = ((iM3169 ^ i13) * 29671) ^ (-628493156);
                    i3 = -1468283954;
                    i2 = iM3169 ^ i3;
                    TextView textView7 = textView3;
                    i16 = i2;
                    i15 = i;
                    textView3 = textView7;
                    break;
                case -1978115282:
                case -1505679598:
                    if (!C18978.m44069()) {
                        iM2761 = (C0619.m2761("ۘ۟") + i13) * 7;
                        i4 = ((iM2761 ^ i14) * (-14699)) ^ 1647827697;
                        i5 = 1620741658;
                        i16 = iM2761 ^ i5;
                        i15 = i4;
                    } else {
                        textView3 = textView3;
                        iM3169 = (C0619.m2761("ۛ᩹") ^ i14) * (-67);
                        i = ((iM3169 ^ i13) * 2357) ^ (-537918761);
                        i3 = -303580725;
                        i2 = iM3169 ^ i3;
                        TextView textView8 = textView3;
                        i16 = i2;
                        i15 = i;
                        textView3 = textView8;
                    }
                    break;
                case -1973832061:
                case 1076737985:
                    textView3 = textView3;
                    C2375.m8070(C2878.m9476(this, C0773.m3169(strM47853) ^ 2121483330), this);
                    int iM31615 = 2122417902 ^ C0773.m3169(C1080.m4056(f3786, 634, 3, i20));
                    C2375.m8070(C1564.m5518(this, iM31615), this);
                    if (C4238.m13535(ApplicationC17729.f58258, AbstractC3624.m11769(f3786, 637, 4, i20), true)) {
                        i19 = iM31615;
                        iM3169 = C0619.m2761("ۤۗ") ^ i13;
                        i = ((iM3169 ^ i14) * (-16113)) ^ (-242367845);
                        i3 = -2031306721;
                        i2 = iM3169 ^ i3;
                        TextView textView9 = textView3;
                        i16 = i2;
                        i15 = i;
                        textView3 = textView9;
                    } else {
                        int iM31616 = C0773.m3169("۠ۜ") ^ i13;
                        textView3 = textView3;
                        i16 = iM31616 ^ (-259718562);
                        i15 = ((iM31616 ^ i14) * (-20765)) ^ (-374549810);
                        i19 = iM31615;
                    }
                    break;
                case -1863069186:
                case 24392885:
                    iM31612 = iM31612;
                    textView3 = textView3;
                    sArr3 = sArr3;
                    i17 = i17;
                    super.onCreate(bundle);
                    C1564.m5518(this, C0619.m2761(RunnableC1848.m6366(f3786, 598, 3, i20)) ^ 2118217255);
                    C1564.m5518(this, C0619.m2761(C1519.m5399(f3786, 601, 3, i20)) ^ 2125107729);
                    sArr = f3786;
                    if (AbstractC3624.m11755() != 0) {
                        iM2763 = (C0619.m2761("ۖۗ") + i13) * (-55);
                        i6 = ((iM2763 ^ i14) * (-26951)) ^ 528171169;
                        i8 = 215503640;
                    } else {
                        iM2763 = C0619.m2761("ۚ֡") ^ i13;
                        i6 = ((iM2763 ^ i14) * (-26199)) ^ 76624504;
                        i8 = 736162975;
                    }
                    i9 = iM2763 ^ i8;
                    textView3 = textView3;
                    iM31612 = iM31612;
                    i16 = i9;
                    i15 = i6;
                    i17 = i17;
                    sArr3 = sArr3;
                    break;
                case -1851972748:
                case 544503260:
                    textView3 = textView3;
                    boolean zM14714 = C4767.m14714();
                    iM2766 = C0619.m2761(RunnableC3055.m9937(f3786, 641, 3, i20)) ^ 2100863387;
                    if (zM14714) {
                        iM3169 = (C0619.m2761("ۙۡ") + i13) * 123;
                        i = ((iM3169 ^ i14) * 17443) ^ 1235733273;
                        i3 = -795741827;
                    } else {
                        iM3169 = C0773.m3169("᩺ܽ") ^ i14;
                        i = ((iM3169 ^ i13) * (-20041)) ^ 442175663;
                        i3 = -807050251;
                    }
                    i2 = iM3169 ^ i3;
                    TextView textView10 = textView3;
                    i16 = i2;
                    i15 = i;
                    textView3 = textView10;
                    break;
                case -1824029251:
                case -1286858554:
                    C2375.m8070(C2878.m9476(this, iM2766), this);
                    iM3169 = C0619.m2761("ܿۖ") ^ i14;
                    i = ((iM3169 ^ i13) * 29671) ^ (-628493156);
                    i3 = -1468283954;
                    i2 = iM3169 ^ i3;
                    TextView textView11 = textView3;
                    i16 = i2;
                    i15 = i;
                    textView3 = textView11;
                    break;
                case -1803301945:
                case -89986695:
                    if (C1826.f6190 <= 0) {
                        textView3 = textView3;
                        iM3169 = C0619.m2761("ܰۨ") ^ i14;
                        i = ((iM3169 ^ i13) * (-31353)) ^ (-1775850120);
                        i3 = -931128013;
                        i2 = iM3169 ^ i3;
                        TextView textView12 = textView3;
                        i16 = i2;
                        i15 = i;
                        textView3 = textView12;
                    } else {
                        textView = textView3;
                        sArr3 = sArr3;
                        i17 = i17;
                        iM31610 = (i14 - C0619.m2761("ۗ֫")) * (-35);
                        i6 = ((iM31610 ^ i13) * (-21549)) ^ (-1648774995);
                        i10 = 1837165000;
                        i9 = iM31610 ^ i10;
                        textView3 = textView;
                        i16 = i9;
                        i15 = i6;
                        i17 = i17;
                        sArr3 = sArr3;
                    }
                    break;
                case -1793486827:
                case -671684742:
                    if (!C3077.f9998) {
                        textView3 = textView3;
                        iM3169 = (i13 - C0619.m2761("ۡ᩹")) * 69;
                        i = ((iM3169 ^ i14) * 845) ^ (-713204622);
                        i3 = -1467092134;
                        i2 = iM3169 ^ i3;
                        TextView textView13 = textView3;
                        i16 = i2;
                        i15 = i;
                        textView3 = textView13;
                    } else {
                        textView = textView3;
                        sArr3 = sArr3;
                        i17 = i17;
                        iM31610 = (i14 - C0619.m2761("ۗ֫")) * (-35);
                        i6 = ((iM31610 ^ i13) * (-21549)) ^ (-1648774995);
                        i10 = 1837165000;
                        i9 = iM31610 ^ i10;
                        textView3 = textView;
                        i16 = i9;
                        i15 = i6;
                        i17 = i17;
                        sArr3 = sArr3;
                    }
                    break;
                case -1745978386:
                case 223094599:
                    this.f3789 = textView2;
                    View viewM5518 = C1564.m5518(this, C0773.m3169(C1080.m4056(f3786, 677, 3, i20)) ^ 2125832849);
                    C2310.m7811(viewM5518, strM4056);
                    this.f3788 = (TextView) viewM5518;
                    C2354.m7978(textView3, C0773.m3167());
                    m3970();
                    C3448.m11245(new C24178(new WeakReference(this)));
                    textView3 = textView3;
                    z = false;
                    if (C13473.m33143(this).getBooleanExtra(C2834.m9343(f3786, 680, 15, i20), false)) {
                        iM3169 = C0773.m3169("֨ܿ") ^ i14;
                        i = ((iM3169 ^ i13) * 20369) ^ 1646383029;
                        i3 = -1070824369;
                    } else {
                        iM3169 = (C0619.m2761("ۛ᩹") ^ i14) * (-67);
                        i = ((iM3169 ^ i13) * 2357) ^ (-537918761);
                        i3 = -303580725;
                    }
                    i2 = iM3169 ^ i3;
                    TextView textView14 = textView3;
                    i16 = i2;
                    i15 = i;
                    textView3 = textView14;
                    break;
                case -1372972040:
                case -523193585:
                    i20 = 14414;
                    iM2762 = C0619.m2761("᩻ۘ") ^ i14;
                    i6 = ((iM2762 ^ i13) * 25797) ^ (-1228590700);
                    i7 = 1262708478;
                    i9 = iM2762 ^ i7;
                    sArr = sArr;
                    textView3 = textView3;
                    iM31612 = iM31612;
                    i16 = i9;
                    i15 = i6;
                    i17 = i17;
                    sArr3 = sArr3;
                    break;
                case -1321465258:
                case -104169542:
                    C2702.m8876();
                    C0950.m3785();
                    textView = textView3;
                    sArr3 = sArr3;
                    i17 = i17;
                    iM31610 = (i14 - C0619.m2761("ۗ֫")) * (-35);
                    i6 = ((iM31610 ^ i13) * (-21549)) ^ (-1648774995);
                    i10 = 1837165000;
                    i9 = iM31610 ^ i10;
                    textView3 = textView;
                    i16 = i9;
                    i15 = i6;
                    i17 = i17;
                    sArr3 = sArr3;
                    break;
                case -1259812458:
                case 1086490303:
                    TextView textView15 = (TextView) C2878.m9476(this, C0619.m2761(C1519.m5399(sArr2, 653, 3, i20)) ^ 2100183844);
                    View viewM5519 = C1564.m5518(this, C0619.m2761(C2878.m9486(f3786, 656, 3, i20)) ^ 2100319969);
                    strM4056 = C1080.m4056(f3786, 659, 9, i20);
                    C2310.m7811(viewM5519, strM4056);
                    this.f3790 = (TextView) viewM5519;
                    String strM2049 = RunnableC0334.m2049(f3786, 668, 3, i20);
                    if (C17202.m40372()) {
                        iM31611 = (C0773.m3169("᩹֫") + i13) * 3;
                        i4 = ((iM31611 ^ i14) * 10821) ^ 379797906;
                        i11 = -66593814;
                    } else {
                        iM31611 = (C0773.m3169("ܳۡ") ^ i14) * (-75);
                        i4 = ((iM31611 ^ i13) * 7327) ^ (-1493700444);
                        i11 = 1559094241;
                    }
                    i16 = iM31611 ^ i11;
                    textView3 = textView15;
                    str = strM2049;
                    i15 = i4;
                    break;
                case -1217155278:
                case 491625689:
                    C4238.m13540();
                    break;
                case -1168482348:
                case 360118446:
                    textView3 = textView3;
                    View viewM55110 = C1564.m5518(this, C0773.m3169(str) ^ 2100030464);
                    C2310.m7811(viewM55110, strM4056);
                    this.f3792 = (TextView) viewM55110;
                    viewM9476 = C2878.m9476(this, C0773.m3169(C0487.m2361(f3786, 671, 3, i20)) ^ 2124364089);
                    if (C2834.m9344() >= 0) {
                        iM3169 = (i13 - C0619.m2761("ۡ᩹")) * 69;
                        i = ((iM3169 ^ i14) * 845) ^ (-713204622);
                        i3 = -1467092134;
                    } else {
                        iM3169 = (i14 - C0619.m2761("ۤܿ")) * (-51);
                        i = ((iM3169 ^ i13) * 11825) ^ (-316092977);
                        i3 = 592890342;
                    }
                    i2 = iM3169 ^ i3;
                    TextView textView16 = textView3;
                    i16 = i2;
                    i15 = i;
                    textView3 = textView16;
                    break;
                case -1152508452:
                case -498119345:
                    textView3 = textView3;
                    C2375.m8070(C1564.m5518(this, C0773.m3169(C1080.m4056(f3786, 644, 3, i20)) ^ 2099556652), this);
                    iM31613 = C0773.m3169(C1080.m4056(f3786, 647, 3, i20));
                    i22 = 2126017288;
                    if (C4282.f15546 > 0) {
                        iM3169 = C0773.m3169("ۜۙ") ^ i13;
                        i = ((iM3169 ^ i14) * 6377) ^ 970700481;
                        i3 = 1710036669;
                        i2 = iM3169 ^ i3;
                        TextView textView17 = textView3;
                        i16 = i2;
                        i15 = i;
                        textView3 = textView17;
                    } else {
                        sArr3 = sArr3;
                        i17 = i17;
                        iM2763 = (C0619.m2761("ۖۗ") + i13) * (-55);
                        i6 = ((iM2763 ^ i14) * (-26951)) ^ 528171169;
                        i8 = 215503640;
                        i9 = iM2763 ^ i8;
                        textView3 = textView3;
                        iM31612 = iM31612;
                        i16 = i9;
                        i15 = i6;
                        i17 = i17;
                        sArr3 = sArr3;
                    }
                    break;
                case -997957437:
                case 1519628905:
                    m3982(z);
                    textView3 = textView3;
                    iM3169 = (C0619.m2761("ۛ᩹") ^ i14) * (-67);
                    i = ((iM3169 ^ i13) * 2357) ^ (-537918761);
                    i3 = -303580725;
                    i2 = iM3169 ^ i3;
                    TextView textView18 = textView3;
                    i16 = i2;
                    i15 = i;
                    textView3 = textView18;
                    break;
                case -838310117:
                case 1263422787:
                    C13473.m33140(C1564.m5518(this, i17), i18);
                    iM3169 = (i14 - C0773.m3169("ᩳۘ")) * 99;
                    i = ((iM3169 ^ i13) * (-24649)) ^ (-1122235752);
                    i3 = -1791430240;
                    i2 = iM3169 ^ i3;
                    TextView textView19 = textView3;
                    i16 = i2;
                    i15 = i;
                    textView3 = textView19;
                    break;
                case -800607136:
                case 707755905:
                    textView = textView3;
                    sArr3 = sArr3;
                    i17 = i17;
                    C11235.m28299(C2878.m9476(this, C0773.m3169(C1343.m4939(f3786, 607, 3, i20)) ^ 2102421163), this);
                    iM31614 = C0773.m3169(RunnableC1848.m6366(f3786, 610, 3, i20));
                    i23 = 2104188867;
                    if (AbstractC0641.f2496 >= 0) {
                        iM31610 = (i14 - C0619.m2761("ۗ֫")) * (-35);
                        i6 = ((iM31610 ^ i13) * (-21549)) ^ (-1648774995);
                        i10 = 1837165000;
                    } else {
                        iM31610 = C0773.m3169("۫ۘ") ^ i14;
                        i6 = ((iM31610 ^ i13) * (-14237)) ^ (-2073080023);
                        i10 = -898398034;
                    }
                    i9 = iM31610 ^ i10;
                    textView3 = textView;
                    i16 = i9;
                    i15 = i6;
                    i17 = i17;
                    sArr3 = sArr3;
                    break;
                case -437151628:
                case -18996601:
                    iM31612 = iM31612;
                    textView3 = textView3;
                    sArr3 = sArr3;
                    sArr = sArr;
                    i17 = i17;
                    short s = f3786[597];
                    int i24 = s + 19015;
                    int i25 = (s * s) + 361570225;
                    if ((i25 + i25) - (i24 * i24) >= 0) {
                        iM2762 = (i13 - C0773.m3169("ܳܽ")) * 3;
                        i6 = ((iM2762 ^ i14) * (-20159)) ^ (-1379979765);
                        i7 = -394577422;
                    } else {
                        iM2762 = (C0619.m2761("ܽ֨") + i14) * 115;
                        i6 = ((iM2762 ^ i13) * (-32433)) ^ 1089620647;
                        i7 = 1612645397;
                    }
                    i9 = iM2762 ^ i7;
                    sArr = sArr;
                    textView3 = textView3;
                    iM31612 = iM31612;
                    i16 = i9;
                    i15 = i6;
                    i17 = i17;
                    sArr3 = sArr3;
                    break;
                case -403398982:
                case 1120978562:
                    textView3 = textView3;
                    C2485.m8358(C2878.m9476(this, i19), i18);
                    iM3169 = C0619.m2761("ۤۗ") ^ i13;
                    i = ((iM3169 ^ i14) * (-16113)) ^ (-242367845);
                    i3 = -2031306721;
                    i2 = iM3169 ^ i3;
                    TextView textView110 = textView3;
                    i16 = i2;
                    i15 = i;
                    textView3 = textView110;
                    break;
                case 32351136:
                case 627098360:
                    textView3 = textView3;
                    sArr3 = sArr3;
                    C2375.m8070(C1564.m5518(this, C0773.m3169(C20932.m47853(sArr3, 616, 3, i20)) ^ 2126563350), this);
                    iM2765 = C0619.m2761(C1542.m5471(f3786, 619, 3, i20));
                    i21 = 2118580859;
                    if (AbstractC0641.f2496 < 0) {
                        int iM31617 = (i13 - C0773.m3169("᩺ۙ")) * (-23);
                        i = ((iM31617 ^ i14) * 28817) ^ 721166630;
                        i2 = iM31617 ^ 1678219292;
                        sArr3 = sArr3;
                        TextView textView111 = textView3;
                        i16 = i2;
                        i15 = i;
                        textView3 = textView111;
                    } else {
                        i17 = i17;
                        iM31612 = iM31612;
                        iM2763 = (C0619.m2761("ۖۗ") + i13) * (-55);
                        i6 = ((iM2763 ^ i14) * (-26951)) ^ 528171169;
                        i8 = 215503640;
                        i9 = iM2763 ^ i8;
                        textView3 = textView3;
                        iM31612 = iM31612;
                        i16 = i9;
                        i15 = i6;
                        i17 = i17;
                        sArr3 = sArr3;
                    }
                    break;
                case 351021689:
                case 659445857:
                    textView3 = textView3;
                    C2310.m7811(viewM9476, strM4056);
                    this.f3791 = (TextView) viewM9476;
                    View viewM55111 = C1564.m5518(this, C0773.m3169(C0773.m3166(f3786, 674, 3, i20)) ^ 2117875530);
                    C0269.m1781(viewM55111, strM4056);
                    textView2 = (TextView) viewM55111;
                    if (C20932.f66974 <= 0) {
                        iM3169 = (i13 - C0619.m2761("ۡ᩹")) * 69;
                        i = ((iM3169 ^ i14) * 845) ^ (-713204622);
                        i3 = -1467092134;
                    } else {
                        iM3169 = C0619.m2761("ۤ᩻") ^ i13;
                        i = ((iM3169 ^ i14) * 16157) ^ 1483462044;
                        i3 = 440242248;
                    }
                    i2 = iM3169 ^ i3;
                    TextView textView112 = textView3;
                    i16 = i2;
                    i15 = i;
                    textView3 = textView112;
                    break;
                case 510931385:
                case 1933865949:
                    C2354.m7983();
                    if (!C0619.f2439) {
                        textView3 = textView3;
                        iM3169 = (i13 - C0619.m2761("ۡ᩹")) * 69;
                        i = ((iM3169 ^ i14) * 845) ^ (-713204622);
                        i3 = -1467092134;
                        i2 = iM3169 ^ i3;
                        TextView textView113 = textView3;
                        i16 = i2;
                        i15 = i;
                        textView3 = textView113;
                    } else {
                        textView3 = textView3;
                        sArr3 = sArr3;
                        i17 = i17;
                        iM2763 = (C0619.m2761("ۖۗ") + i13) * (-55);
                        i6 = ((iM2763 ^ i14) * (-26951)) ^ 528171169;
                        i8 = 215503640;
                        i9 = iM2763 ^ i8;
                        textView3 = textView3;
                        iM31612 = iM31612;
                        i16 = i9;
                        i15 = i6;
                        i17 = i17;
                        sArr3 = sArr3;
                    }
                    break;
                case 608030291:
                case 1112580150:
                    textView3 = textView3;
                    C2375.m8070(C2878.m9476(this, C0619.m2761(C0269.m1785(f3786, 625, 3, i20)) ^ 2097634097), this);
                    C11235.m28299(C2878.m9476(this, C0619.m2761(C2878.m9486(f3786, 628, 3, i20)) ^ 2101138626), this);
                    strM47853 = C20932.m47853(f3786, 631, 3, i20);
                    if (C23916.f77426 <= 0) {
                        iM3169 = (i13 - C0619.m2761("ۡ᩹")) * 69;
                        i = ((iM3169 ^ i14) * 845) ^ (-713204622);
                        i3 = -1467092134;
                    } else {
                        iM3169 = C0619.m2761("ܰۜ") ^ i14;
                        i = ((iM3169 ^ i13) * 24563) ^ (-1512477468);
                        i3 = 169425819;
                    }
                    i2 = iM3169 ^ i3;
                    TextView textView114 = textView3;
                    i16 = i2;
                    i15 = i;
                    textView3 = textView114;
                    break;
                case 762528788:
                case 1332896365:
                    C4238.m13537(this);
                    break;
                case 904787046:
                case 1538800580:
                    i20 = 5487;
                    iM2762 = C0619.m2761("᩻ۘ") ^ i14;
                    i6 = ((iM2762 ^ i13) * 25797) ^ (-1228590700);
                    i7 = 1262708478;
                    i9 = iM2762 ^ i7;
                    sArr = sArr;
                    textView3 = textView3;
                    iM31612 = iM31612;
                    i16 = i9;
                    i15 = i6;
                    i17 = i17;
                    sArr3 = sArr3;
                    break;
                case 955610834:
                case 1922861784:
                    textView3 = textView3;
                    C2375.m8070(C2878.m9476(this, iM31613 ^ i22), this);
                    C2375.m8070(C1564.m5518(this, C0773.m3169(C1146.m4222(f3786, 650, 3, i20)) ^ 2101938991), this);
                    sArr2 = f3786;
                    if (C1783.f6087 <= 0) {
                        iM3169 = C0619.m2761("ܰۨ") ^ i14;
                        i = ((iM3169 ^ i13) * (-31353)) ^ (-1775850120);
                        i3 = -931128013;
                    } else {
                        iM3169 = C0619.m2761("᩶᩷") ^ i14;
                        i = ((iM3169 ^ i13) * 30429) ^ 37551546;
                        i3 = 183869832;
                    }
                    i2 = iM3169 ^ i3;
                    TextView textView115 = textView3;
                    i16 = i2;
                    i15 = i;
                    textView3 = textView115;
                    break;
                case 1016162688:
                case 1436857641:
                    textView3 = textView3;
                    sArr3 = sArr3;
                    i17 = i17;
                    sArr = sArr;
                    C16390 c16390 = (C16390) C2878.m9476(this, C0773.m3169(C2310.m7803(sArr, 604, 3, i20)) ^ 2097729335);
                    this.f56046 = c16390;
                    C2375.m8067(this, c16390);
                    AbstractC0116.m1238(this);
                    iM31612 = iM31612;
                    C1321.m4850(this.f56046, new ViewOnClickListenerC15798(0, this));
                    if (C2702.m8873()) {
                        iM2762 = C0619.m2761("ܿۙ") ^ i13;
                        i6 = ((iM2762 ^ i14) * (-29099)) ^ 503369157;
                        i7 = -952757246;
                    } else {
                        iM2762 = (C0773.m3169("᩻ۨ") + i14) * 79;
                        i6 = ((iM2762 ^ i13) * 26939) ^ (-738472114);
                        i7 = -899718343;
                    }
                    i9 = iM2762 ^ i7;
                    sArr = sArr;
                    textView3 = textView3;
                    iM31612 = iM31612;
                    i16 = i9;
                    i15 = i6;
                    i17 = i17;
                    sArr3 = sArr3;
                    break;
            }
            return;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 19701. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m3977(android.widget.EditText r32, l.DialogInterfaceC8327 r33, l.ViewOnClickListenerC1057 r34, com.google.android.material.textfield.TextInputLayout r35) {
        /*
            Method dump skipped, instruction units count: 1970
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC1057.m3977(android.widget.EditText, l.۠ۖۧ, l.֨۠᩻, com.google.android.material.textfield.TextInputLayout):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0101, code lost:
    
        if (l.C3033.f9831 >= 0) goto L25;
     */
    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3970() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2140
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC1057.m3970():void");
    }

    /* JADX WARN: Code duplicated, block: B:94:0x03d7 A[PHI: r2 r13 r14 r16 r17 r23
      0x03d7: PHI (r2v80 short) = (r2v5 short), (r2v9 short), (r2v81 short) binds: [B:93:0x03d5, B:84:0x037e, B:14:0x0089] A[DONT_GENERATE, DONT_INLINE]
      0x03d7: PHI (r13v4 int) = (r13v2 int), (r13v2 int), (r13v5 int) binds: [B:93:0x03d5, B:84:0x037e, B:14:0x0089] A[DONT_GENERATE, DONT_INLINE]
      0x03d7: PHI (r14v4 int) = (r14v2 int), (r14v2 int), (r14v5 int) binds: [B:93:0x03d5, B:84:0x037e, B:14:0x0089] A[DONT_GENERATE, DONT_INLINE]
      0x03d7: PHI (r16v5 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:93:0x03d5, B:84:0x037e, B:14:0x0089] A[DONT_GENERATE, DONT_INLINE]
      0x03d7: PHI (r17v4 int) = (r17v1 int), (r17v2 int), (r17v1 int) binds: [B:93:0x03d5, B:84:0x037e, B:14:0x0089] A[DONT_GENERATE, DONT_INLINE]
      0x03d7: PHI (r23v42 short[]) = (r23v6 short[]), (r23v8 short[]), (r23v43 short[]) binds: [B:93:0x03d5, B:84:0x037e, B:14:0x0089] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0081, code lost:
    
        if (l.C23916.f77426 <= 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0083, code lost:
    
        r23 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0096, code lost:
    
        if (l.C2419.f7754 >= 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x006e, code lost:
    
        if (l.C2834.f9334 <= 0) goto L9;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m3961(l.C13511 r27, l.ViewOnClickListenerC1057 r28, l.C13778 r29) {
        /*
            Method dump skipped, instruction units count: 1250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC1057.m3961(l.۬֨ᩴ, l.֨۠᩻, l.۬ۢ᩻):void");
    }

    /* JADX WARN: Code duplicated, block: B:61:0x01fd A[PHI: r3 r4
      0x01fd: PHI (r3v2 short[]) = (r3v1 short[]), (r3v3 short[]) binds: [B:60:0x01fb, B:48:0x01a4] A[DONT_GENERATE, DONT_INLINE]
      0x01fd: PHI (r4v2 char) = (r4v1 char), (r4v3 char) binds: [B:60:0x01fb, B:48:0x01a4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x0247 A[PHI: r1
      0x0247: PHI (r1v6 java.lang.String) = (r1v1 java.lang.String), (r1v1 java.lang.String), (r1v5 java.lang.String), (r1v1 java.lang.String) binds: [B:68:0x0245, B:64:0x0229, B:34:0x00fd, B:8:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x0277  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m3959(C13511 c13511, View view, EditText editText, ViewOnClickListenerC1057 viewOnClickListenerC1057, C13778 c13778) {
        int iM2761;
        int i;
        int i2;
        String strM4222 = null;
        int iM3169 = 0;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = -430736912;
        int i6 = C0950.f3488;
        int i7 = C4238.f15451;
        int iM2762 = (C0619.m2761("᩶ۨ") + i7) * 69;
        int i8 = ((iM2762 ^ i6) * (-71)) ^ (-1105533320);
        int i9 = iM2762 ^ 1460427274;
        while (true) {
            i5 = ((((i5 ^ i6) * (-32701)) >> 31) & i8) ^ i9;
            switch (i5) {
                case -1934264432:
                case -762962428:
                    strM4222 = C1146.m4222(f3786, 50, 8, i4);
                    if (C1542.f5343 <= 0) {
                        iM2761 = (C0619.m2761("ᩴܽ") + i6) * 3;
                        i = ((iM2761 ^ i7) * 23033) ^ 478847728;
                        i2 = 2078064439;
                    } else {
                        iM2761 = (C0619.m2761("᩸᩺") + i7) * (-79);
                        i = ((iM2761 ^ i6) * (-4155)) ^ 1459079774;
                        i2 = -539167293;
                    }
                    i9 = iM2761 ^ i2;
                    i8 = i;
                    break;
                case -1780263117:
                case -1189538067:
                    i4 = 34472;
                    iM2761 = (C0619.m2761("᩶ܶ") ^ i6) * q.h;
                    i = ((iM2761 ^ i7) * (-17549)) ^ 1585205307;
                    i2 = 475714296;
                    i9 = iM2761 ^ i2;
                    i8 = i;
                    break;
                case -1581543957:
                case -278081699:
                    if (C2310.f7472 >= 0) {
                        iM2761 = (C0773.m3169("ᩴ᩸") ^ i7) * (-75);
                        i = ((iM2761 ^ i6) * (-18847)) ^ (-1555652818);
                        i2 = -1449122585;
                    } else {
                        iM2761 = (C0619.m2761("ۛ᩹") + i6) * (-81);
                        i = ((iM2761 ^ i7) * (-29887)) ^ 842803252;
                        i2 = -319394133;
                    }
                    i9 = iM2761 ^ i2;
                    i8 = i;
                    break;
                case -1555184010:
                case -971001059:
                    sArr = f3786;
                    c = '1';
                    if (C17202.f56030) {
                        iM2761 = C0773.m3169("۬ۧ") ^ i7;
                        i = ((iM2761 ^ i6) * (-7747)) ^ 1832601182;
                        i2 = -26162379;
                    } else {
                        iM2761 = C0773.m3169("ۧ֨") ^ i6;
                        i = ((iM2761 ^ i7) * (-22109)) ^ (-933397655);
                        i2 = 1961711638;
                    }
                    i9 = iM2761 ^ i2;
                    i8 = i;
                    break;
                case -1352435455:
                case -1061955311:
                    if (!RunnableC1848.m6360()) {
                        iM2761 = (C0773.m3169("ᩴ᩸") ^ i7) * (-75);
                        i = ((iM2761 ^ i6) * (-18847)) ^ (-1555652818);
                        i2 = -1449122585;
                        i9 = iM2761 ^ i2;
                        i8 = i;
                    }
                    iM2761 = (C0619.m2761("ᩴܽ") + i6) * 3;
                    i = ((iM2761 ^ i7) * 23033) ^ 478847728;
                    i2 = 2078064439;
                    i9 = iM2761 ^ i2;
                    i8 = i;
                    break;
                case -1262317738:
                case -1032048833:
                    if (RunnableC1848.f6235) {
                        iM2761 = C0773.m3169("ۧ֨") ^ i6;
                        i = ((iM2761 ^ i7) * (-22109)) ^ (-933397655);
                        i2 = 1961711638;
                    } else {
                        iM2761 = C0619.m2761("֫۠") ^ i6;
                        i = ((iM2761 ^ i7) * 23479) ^ 1499911562;
                        i2 = -1708353459;
                    }
                    i9 = iM2761 ^ i2;
                    i8 = i;
                    break;
                case -1102001304:
                case 334368862:
                    C3077.m10041();
                    break;
                case -1091032795:
                case 877072861:
                    C17202.m40373(C3033.m9850(c13778, 2127293984 ^ iM3169));
                    break;
                case -970057662:
                case 533231985:
                    if (C2287.f7432 >= 0) {
                        iM2761 = C0773.m3169("ۗ۫") ^ i6;
                        i = ((iM2761 ^ i7) * 15869) ^ 286500925;
                        i2 = 1469617609;
                        i9 = iM2761 ^ i2;
                        i8 = i;
                    }
                    iM2761 = (C0619.m2761("ᩴܽ") + i6) * 3;
                    i = ((iM2761 ^ i7) * 23033) ^ 478847728;
                    i2 = 2078064439;
                    i9 = iM2761 ^ i2;
                    i8 = i;
                    break;
                case -796772170:
                case 475132101:
                    C0487.m2356();
                    iM2761 = (C0619.m2761("ᩴܽ") + i6) * 3;
                    i = ((iM2761 ^ i7) * 23033) ^ 478847728;
                    i2 = 2078064439;
                    i9 = iM2761 ^ i2;
                    i8 = i;
                    break;
                case -780518258:
                case 218609908:
                    if (C3448.f11240 >= 0) {
                        iM2761 = (C0773.m3169("ᩴ᩸") ^ i7) * (-75);
                        i = ((iM2761 ^ i6) * (-18847)) ^ (-1555652818);
                        i2 = -1449122585;
                    } else {
                        iM2761 = (C0619.m2761("᩺ۙ") ^ i7) * 23;
                        i = ((iM2761 ^ i6) * (-18849)) ^ (-1831550596);
                        i2 = -879290447;
                    }
                    i9 = iM2761 ^ i2;
                    i8 = i;
                    break;
                case -473557605:
                case 399020702:
                    AbstractC0641.m2813();
                    if (RunnableC1848.f6235) {
                        iM2761 = C0773.m3169("ۡ᩵") ^ i7;
                        i = ((iM2761 ^ i6) * (-31053)) ^ (-564015888);
                        i2 = -1451250708;
                        i9 = iM2761 ^ i2;
                        i8 = i;
                    }
                    iM2761 = (C0619.m2761("ᩴܽ") + i6) * 3;
                    i = ((iM2761 ^ i7) * 23033) ^ 478847728;
                    i2 = 2078064439;
                    i9 = iM2761 ^ i2;
                    i8 = i;
                    break;
                case -386545050:
                case 390998669:
                    if (C3492.f12043 <= 0) {
                        iM2761 = (C0773.m3169("ᩴ᩸") ^ i7) * (-75);
                        i = ((iM2761 ^ i6) * (-18847)) ^ (-1555652818);
                        i2 = -1449122585;
                    } else {
                        iM2761 = C0619.m2761("۫֫") ^ i7;
                        i = ((iM2761 ^ i6) * 2475) ^ (-1042528263);
                        i2 = -1814694895;
                    }
                    i9 = iM2761 ^ i2;
                    i8 = i;
                    break;
                case -229027837:
                case 962429246:
                    if ((78168 * s) - i3 <= 0) {
                        iM2761 = (C0619.m2761("ۙۧ") ^ i7) * (-5);
                        i = ((iM2761 ^ i6) * (-8047)) ^ (-520606113);
                        i2 = -680421584;
                    } else {
                        iM2761 = C0619.m2761("۬ۢ") ^ i6;
                        i = ((iM2761 ^ i7) * (-16787)) ^ 1900049452;
                        i2 = 412963221;
                    }
                    i9 = iM2761 ^ i2;
                    i8 = i;
                    break;
                case -219708904:
                case 1367657438:
                    if (C2354.f7599 >= 0) {
                        iM2761 = (C0619.m2761("ᩴܽ") + i6) * 3;
                        i = ((iM2761 ^ i7) * 23033) ^ 478847728;
                        i2 = 2078064439;
                    } else {
                        iM2761 = C0773.m3169("۠᩹") ^ i7;
                        i = ((iM2761 ^ i6) * 9097) ^ 750562069;
                        i2 = 41246182;
                    }
                    i9 = iM2761 ^ i2;
                    i8 = i;
                    break;
                case -69839809:
                case 1221012327:
                    s = sArr[c];
                    int i10 = s + 19542;
                    i3 = i10 * i10;
                    if (C2287.f7432 >= 0) {
                        iM2761 = C0773.m3169("ۗ۫") ^ i6;
                        i = ((iM2761 ^ i7) * 15869) ^ 286500925;
                        i2 = 1469617609;
                    } else {
                        iM2761 = (C0619.m2761("ۨ᩷") ^ i6) * 49;
                        i = ((iM2761 ^ i7) * (-20987)) ^ 69432767;
                        i2 = 488109360;
                    }
                    i9 = iM2761 ^ i2;
                    i8 = i;
                    break;
                case 29602837:
                case 1135758200:
                    C17202.m40379(c13778, strM4222);
                    C1564.m5521(c13511);
                    if (C1564.m5516(c13778)) {
                        iM2761 = C0773.m3169("۟ۛ") ^ i7;
                        i = ((iM2761 ^ i6) * (-10037)) ^ 6367347;
                        i2 = -461308927;
                    } else {
                        iM2761 = (i6 - C0773.m3169("ۨۗ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM2761 ^ i7) * (-26297)) ^ (-594977272);
                        i2 = 869755824;
                    }
                    i9 = iM2761 ^ i2;
                    i8 = i;
                    break;
                case 189401481:
                case 1088874085:
                    iM3169 = C0773.m3169(C0619.m2756(f3786, 58, 3, i4));
                    if (C3734.f12817 >= 0) {
                        iM2761 = C0773.m3169("ۡ᩵") ^ i7;
                        i = ((iM2761 ^ i6) * (-31053)) ^ (-564015888);
                        i2 = -1451250708;
                    } else {
                        iM2761 = (i7 - C0773.m3169("᩺ܰ")) * (-19);
                        i = ((iM2761 ^ i6) * (-25889)) ^ (-939602307);
                        i2 = 1155856618;
                    }
                    i9 = iM2761 ^ i2;
                    i8 = i;
                    break;
                case 386773078:
                case 627184920:
                    if (C2375.m8065() <= 0) {
                        iM2761 = (C0619.m2761("ᩴܽ") + i6) * 3;
                        i = ((iM2761 ^ i7) * 23033) ^ 478847728;
                        i2 = 2078064439;
                    } else {
                        iM2761 = (C0619.m2761("ᩴܳ") ^ i6) * 41;
                        i = ((iM2761 ^ i7) * (-10733)) ^ (-1133706176);
                        i2 = 1678210005;
                    }
                    i9 = iM2761 ^ i2;
                    i8 = i;
                    break;
                case 1379343092:
                case 1732093588:
                    C23916.m53431(view, false);
                    C2287.m7751(editText);
                    viewOnClickListenerC1057.m3974();
                    break;
                default:
                    i4 = 589;
                    iM2761 = (C0619.m2761("᩶ܶ") ^ i6) * q.h;
                    i = ((iM2761 ^ i7) * (-17549)) ^ 1585205307;
                    i2 = 475714296;
                    i9 = iM2761 ^ i2;
                    i8 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0205 A[PHI: r1
      0x0205: PHI (r1v8 java.lang.String) = (r1v7 java.lang.String), (r1v2 java.lang.String), (r1v2 java.lang.String) binds: [B:43:0x0150, B:15:0x0057, B:7:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0236 A[PHI: r4 r5
      0x0236: PHI (r4v4 int) = (r4v2 int), (r4v3 int), (r4v2 int) binds: [B:64:0x0234, B:25:0x008c, B:11:0x003c] A[DONT_GENERATE, DONT_INLINE]
      0x0236: PHI (r5v4 int) = (r5v2 int), (r5v3 int), (r5v2 int) binds: [B:64:0x0234, B:25:0x008c, B:11:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x0265 A[PHI: r2 r3 r6 r7
      0x0265: PHI (r2v6 int) = (r2v2 int), (r2v2 int), (r2v2 int), (r2v5 int), (r2v2 int) binds: [B:68:0x0263, B:58:0x01ed, B:54:0x01c8, B:35:0x00ea, B:29:0x00b3] A[DONT_GENERATE, DONT_INLINE]
      0x0265: PHI (r3v3 java.lang.String) = 
      (r3v2 java.lang.String)
      (r3v2 java.lang.String)
      (r3v2 java.lang.String)
      (r3v2 java.lang.String)
      (r3v5 java.lang.String)
     binds: [B:68:0x0263, B:58:0x01ed, B:54:0x01c8, B:35:0x00ea, B:29:0x00b3] A[DONT_GENERATE, DONT_INLINE]
      0x0265: PHI (r6v5 short) = (r6v2 short), (r6v4 short), (r6v2 short), (r6v2 short), (r6v2 short) binds: [B:68:0x0263, B:58:0x01ed, B:54:0x01c8, B:35:0x00ea, B:29:0x00b3] A[DONT_GENERATE, DONT_INLINE]
      0x0265: PHI (r7v6 int) = (r7v2 int), (r7v2 int), (r7v5 int), (r7v2 int), (r7v2 int) binds: [B:68:0x0263, B:58:0x01ed, B:54:0x01c8, B:35:0x00ea, B:29:0x00b3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
    
        if (l.C0950.f3488 < 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
    
        if (l.C1146.f4234 >= 0) goto L18;
     */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m3979(l.C13511 r16, android.view.View r17, android.widget.EditText r18, l.ViewOnClickListenerC1057 r19, l.C13778 r20) {
        /*
            Method dump skipped, instruction units count: 866
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC1057.m3979(l.۬֨ᩴ, android.view.View, android.widget.EditText, l.֨۠᩻, l.۬ۢ᩻):void");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private final void m3982(boolean z) {
        short[] sArr;
        int i;
        short[] sArr2;
        int iM3169;
        int i2;
        int i3;
        short s;
        int i4;
        TextInputLayout textInputLayout;
        int i5;
        short[] sArr3;
        short[] sArr4;
        int iM31610;
        int i6;
        int i7;
        int i8;
        int iM31611;
        int i9;
        int i10;
        int iM31612;
        int i11;
        int i12;
        int iM31613;
        int i13;
        int i14;
        int i15;
        int i16 = C2834.f9334;
        int i17 = C1542.f5343;
        int iM31614 = (C0773.m3169("ܿܿ") ^ i16) * 75;
        int i18 = ((iM31614 ^ i17) * 1277) ^ 2077408888;
        String strM4222 = null;
        EditText editText = null;
        View viewM11246 = null;
        final EditText editText2 = null;
        final DialogInterfaceC8327 dialogInterfaceC8327M10090 = null;
        EditText editText3 = null;
        String strM10092 = null;
        short[] sArr5 = null;
        short[] sArr6 = null;
        int i19 = iM31614 ^ (-1912213708);
        View viewM9942 = null;
        int iM31615 = 0;
        boolean z2 = false;
        int iM2761 = 0;
        int iM31616 = 0;
        int i20 = 0;
        int iM2762 = 0;
        int iM31617 = 0;
        int i21 = 0;
        int iM2763 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 980319275;
        TextInputLayout textInputLayout2 = null;
        final TextInputLayout textInputLayout3 = null;
        int i26 = 0;
        short s2 = 0;
        while (true) {
            i25 = i19 ^ (i18 & (((i25 ^ i17) * (-12243)) >> 31));
            switch (i25) {
                case -1996307461:
                case 1319548989:
                    textInputLayout2.setHint(iM2762 ^ 2122382659);
                    C2354.m7982(editText, z2);
                    iM3169 = (i17 - C0773.m3169("ۖܰ")) * 53;
                    i2 = ((iM3169 ^ i16) * 32679) ^ (-1095832969);
                    i3 = -283297928;
                    i15 = iM3169 ^ i3;
                    i26 = i26;
                    strM4222 = strM4222;
                    iM31615 = iM31615;
                    sArr5 = sArr5;
                    textInputLayout3 = textInputLayout3;
                    s2 = s2;
                    dialogInterfaceC8327M10090 = dialogInterfaceC8327M10090;
                    sArr6 = sArr6;
                    i19 = i15;
                    i18 = i2;
                    break;
                case -1730382454:
                case -1145103878:
                    s = s2;
                    dialogInterfaceC8327M10090 = dialogInterfaceC8327M10090;
                    int i27 = iM31615;
                    textInputLayout = textInputLayout3;
                    int i28 = i26;
                    short[] sArr7 = sArr5;
                    short[] sArr8 = sArr6;
                    iM31616 = C0773.m3169(C0269.m1785(f3786, 352, 3, i28));
                    i20 = 2098043605;
                    if (AbstractC3624.f12429 <= 0) {
                        iM31613 = (C0773.m3169("ܿ۫") + i16) * (-17);
                        i13 = ((iM31613 ^ i17) * 19759) ^ (-1011970443);
                        i14 = -1912745089;
                    } else {
                        iM31613 = (C0773.m3169("֡۫") + i16) * (-67);
                        i13 = ((iM31613 ^ i17) * 29527) ^ (-499337500);
                        i14 = -611358978;
                    }
                    i19 = iM31613 ^ i14;
                    i18 = i13;
                    sArr6 = sArr8;
                    sArr5 = sArr7;
                    i26 = i28;
                    iM31615 = i27;
                    textInputLayout3 = textInputLayout;
                    s2 = s;
                    dialogInterfaceC8327M10090 = dialogInterfaceC8327M10090;
                    break;
                case -1685109911:
                case 391272482:
                    short[] sArr9 = sArr5;
                    s = s2;
                    dialogInterfaceC8327M10090 = dialogInterfaceC8327M10090;
                    int i29 = iM31615;
                    textInputLayout = textInputLayout3;
                    sArr4 = sArr6;
                    i5 = i26;
                    String str = strM4222;
                    sArr3 = sArr9;
                    strM10092 = C3099.m10092(sArr3, 355, 3, i5);
                    if (C0487.m2356() >= 0) {
                        strM4222 = str;
                        iM31615 = i29;
                        iM31612 = (C0619.m2761("۬ۤ") ^ i17) * (-21);
                        i11 = ((iM31612 ^ i16) * (-16071)) ^ 865976942;
                        i12 = 310964731;
                        i19 = iM31612 ^ i12;
                        i18 = i11;
                        sArr6 = sArr4;
                        sArr5 = sArr3;
                        i26 = i5;
                        textInputLayout3 = textInputLayout;
                        s2 = s;
                        dialogInterfaceC8327M10090 = dialogInterfaceC8327M10090;
                    } else {
                        int iM2764 = (i16 - C0619.m2761("֨ܺ")) * 67;
                        i19 = iM2764 ^ 750086449;
                        i18 = ((iM2764 ^ i17) * (-30169)) ^ 1692524500;
                        strM4222 = str;
                        iM31615 = i29;
                        s2 = s;
                        dialogInterfaceC8327M10090 = dialogInterfaceC8327M10090;
                        sArr6 = sArr4;
                        sArr5 = sArr3;
                        i26 = i5;
                        textInputLayout3 = textInputLayout;
                    }
                    break;
                case -1658363153:
                case 927444031:
                    C1564.m5509();
                    C0487.m2356();
                    dialogInterfaceC8327M10090 = dialogInterfaceC8327M10090;
                    i = iM31615;
                    textInputLayout3 = textInputLayout3;
                    i26 = i26;
                    sArr2 = sArr5;
                    sArr = sArr6;
                    iM31610 = C0773.m3169("ܳ۫") ^ i16;
                    i6 = ((iM31610 ^ i17) * 18989) ^ 1944829951;
                    i7 = 1068420249;
                    i19 = iM31610 ^ i7;
                    iM31615 = i;
                    sArr6 = sArr;
                    sArr5 = sArr2;
                    i18 = i6;
                    i26 = i26;
                    textInputLayout3 = textInputLayout3;
                    dialogInterfaceC8327M10090 = dialogInterfaceC8327M10090;
                    break;
                case -1604645751:
                case -106815285:
                    sArr5 = sArr5;
                    s = s2;
                    dialogInterfaceC8327M10090 = dialogInterfaceC8327M10090;
                    int i30 = iM31615;
                    textInputLayout = textInputLayout3;
                    short[] sArr10 = sArr6;
                    i5 = i26;
                    String str2 = strM4222;
                    sArr4 = sArr10;
                    viewM11246 = C3448.m11246(viewM9942, C0773.m3169(C0619.m2756(sArr4, 358, 3, i5)) ^ 2101248376);
                    if (C2419.f7754 < 0) {
                        int iM2765 = (i17 - C0619.m2761("ۤ۟")) * 99;
                        i19 = iM2765 ^ 2012020730;
                        i18 = ((iM2765 ^ i16) * 1131) ^ (-286411268);
                        i26 = i5;
                        strM4222 = str2;
                        iM31615 = i30;
                        textInputLayout3 = textInputLayout;
                        s2 = s;
                        dialogInterfaceC8327M10090 = dialogInterfaceC8327M10090;
                        sArr6 = sArr4;
                        sArr5 = sArr5;
                    } else {
                        strM4222 = str2;
                        i4 = i30;
                        sArr3 = sArr5;
                        iM31611 = C0619.m2761("᩵ܽ") ^ i16;
                        i9 = ((iM31611 ^ i17) * 3831) ^ 1692055840;
                        i10 = 913916316;
                        i19 = iM31611 ^ i10;
                        iM31615 = i4;
                        sArr6 = sArr4;
                        sArr5 = sArr3;
                        i18 = i9;
                        i26 = i5;
                        textInputLayout3 = textInputLayout;
                        s2 = s;
                        dialogInterfaceC8327M10090 = dialogInterfaceC8327M10090;
                    }
                    break;
                case -1534593864:
                case 635429751:
                    s = s2;
                    dialogInterfaceC8327M10090 = dialogInterfaceC8327M10090;
                    i4 = iM31615;
                    textInputLayout = textInputLayout3;
                    i5 = i26;
                    sArr3 = sArr5;
                    sArr4 = sArr6;
                    View viewM11247 = C3448.m11246(viewM9942, i4);
                    strM4222 = C1146.m4222(f3786, 335, 17, i5);
                    C2310.m7811(viewM11247, strM4222);
                    textInputLayout2 = (TextInputLayout) viewM11247;
                    if (AbstractC0641.f2496 >= 0) {
                        iM31611 = C0619.m2761("᩵ܽ") ^ i16;
                        i9 = ((iM31611 ^ i17) * 3831) ^ 1692055840;
                        i10 = 913916316;
                    } else {
                        iM31611 = (C0773.m3169("ᩴ᩶") ^ i17) * (-113);
                        i9 = ((iM31611 ^ i16) * 32283) ^ 1873842086;
                        i10 = 61042872;
                    }
                    i19 = iM31611 ^ i10;
                    iM31615 = i4;
                    sArr6 = sArr4;
                    sArr5 = sArr3;
                    i18 = i9;
                    i26 = i5;
                    textInputLayout3 = textInputLayout;
                    s2 = s;
                    dialogInterfaceC8327M10090 = dialogInterfaceC8327M10090;
                    break;
                case -1516798572:
                case 267986887:
                    sArr5 = sArr5;
                    s2 = s2;
                    dialogInterfaceC8327M10090 = dialogInterfaceC8327M10090;
                    iM31615 = iM31615;
                    textInputLayout3 = textInputLayout3;
                    sArr6 = sArr6;
                    i26 = i26;
                    strM4222 = strM4222;
                    iM2762 = C0619.m2761(C11235.m28300(f3786, TwofishEngine.GF256_FDBK, 3, i26));
                    iM3169 = C0619.m2761("ܽ֫") ^ i16;
                    i2 = ((iM3169 ^ i17) * (-12899)) ^ 1993211564;
                    i3 = -968126427;
                    i15 = iM3169 ^ i3;
                    i26 = i26;
                    strM4222 = strM4222;
                    iM31615 = iM31615;
                    sArr5 = sArr5;
                    textInputLayout3 = textInputLayout3;
                    s2 = s2;
                    dialogInterfaceC8327M10090 = dialogInterfaceC8327M10090;
                    sArr6 = sArr6;
                    i19 = i15;
                    i18 = i2;
                    break;
                case -1487621625:
                case 2000617403:
                    i8 = 15962;
                    int iM31618 = (C0773.m3169("ܿ᩵") + i17) * (-45);
                    int i31 = ((iM31618 ^ i16) * 16047) ^ 1694567250;
                    i19 = iM31618 ^ 830567669;
                    iM31615 = iM31615;
                    sArr6 = sArr6;
                    sArr5 = sArr5;
                    textInputLayout3 = textInputLayout3;
                    s2 = s2;
                    i26 = i8;
                    i18 = i31;
                    dialogInterfaceC8327M10090 = dialogInterfaceC8327M10090;
                    break;
                case -1476109956:
                case 2054918816:
                    i8 = 44667;
                    int iM31619 = (C0773.m3169("ܿ᩵") + i17) * (-45);
                    int i32 = ((iM31619 ^ i16) * 16047) ^ 1694567250;
                    i19 = iM31619 ^ 830567669;
                    iM31615 = iM31615;
                    sArr6 = sArr6;
                    sArr5 = sArr5;
                    textInputLayout3 = textInputLayout3;
                    s2 = s2;
                    i26 = i8;
                    i18 = i32;
                    dialogInterfaceC8327M10090 = dialogInterfaceC8327M10090;
                    break;
                case -1387039841:
                case -908594505:
                    sArr5 = sArr5;
                    s2 = s2;
                    dialogInterfaceC8327M10090 = dialogInterfaceC8327M10090;
                    iM31615 = iM31615;
                    textInputLayout3 = textInputLayout3;
                    sArr6 = sArr6;
                    i26 = i26;
                    strM4222 = strM4222;
                    C21576.m49090(editText3);
                    iM31617 = C0773.m3169(RunnableC1848.m6366(f3786, 364, 3, i26));
                    i21 = 2119109285;
                    if (C11235.f35427 >= 0) {
                        iM3169 = C0773.m3169("᩵ۖ") ^ i17;
                        i2 = ((iM3169 ^ i16) * (-1601)) ^ (-1052259053);
                        i3 = -733636158;
                    } else {
                        iM3169 = (C0773.m3169("ۗܺ") + i17) * 67;
                        i2 = ((iM3169 ^ i16) * (-27)) ^ (-1393962580);
                        i3 = 749388507;
                    }
                    i15 = iM3169 ^ i3;
                    i26 = i26;
                    strM4222 = strM4222;
                    iM31615 = iM31615;
                    sArr5 = sArr5;
                    textInputLayout3 = textInputLayout3;
                    s2 = s2;
                    dialogInterfaceC8327M10090 = dialogInterfaceC8327M10090;
                    sArr6 = sArr6;
                    i19 = i15;
                    i18 = i2;
                    break;
                case -1309105787:
                case -324033525:
                    sArr5 = sArr5;
                    s2 = s2;
                    dialogInterfaceC8327M10090 = dialogInterfaceC8327M10090;
                    iM31615 = iM31615;
                    strM4222 = strM4222;
                    textInputLayout3 = textInputLayout3;
                    i26 = i26;
                    editText = (EditText) C3448.m11246(viewM9942, C0773.m3169(strM10092) ^ 2097887030);
                    short[] sArr11 = f3786;
                    if (C11235.f35427 < 0) {
                        int iM31620 = C0773.m3169("ܽܶ") ^ i17;
                        i19 = iM31620 ^ (-1329395842);
                        i26 = i26;
                        strM4222 = strM4222;
                        iM31615 = iM31615;
                        textInputLayout3 = textInputLayout3;
                        s2 = s2;
                        dialogInterfaceC8327M10090 = dialogInterfaceC8327M10090;
                        sArr6 = sArr11;
                        i18 = ((iM31620 ^ i16) * (-29899)) ^ (-494466645);
                        sArr5 = sArr5;
                    } else {
                        sArr6 = sArr11;
                        iM3169 = C0773.m3169("᩵ۖ") ^ i17;
                        i2 = ((iM3169 ^ i16) * (-1601)) ^ (-1052259053);
                        i3 = -733636158;
                        i15 = iM3169 ^ i3;
                        i26 = i26;
                        strM4222 = strM4222;
                        iM31615 = iM31615;
                        sArr5 = sArr5;
                        textInputLayout3 = textInputLayout3;
                        s2 = s2;
                        dialogInterfaceC8327M10090 = dialogInterfaceC8327M10090;
                        sArr6 = sArr6;
                        i19 = i15;
                        i18 = i2;
                    }
                    break;
                case -1038068251:
                case -377460249:
                    if (C0950.f3488 < 0) {
                        s = s2;
                        dialogInterfaceC8327M10090 = dialogInterfaceC8327M10090;
                        i4 = iM31615;
                        textInputLayout = textInputLayout3;
                        i5 = i26;
                        sArr3 = sArr5;
                        sArr4 = sArr6;
                        iM31611 = C0619.m2761("᩵ܽ") ^ i16;
                        i9 = ((iM31611 ^ i17) * 3831) ^ 1692055840;
                        i10 = 913916316;
                        i19 = iM31611 ^ i10;
                        iM31615 = i4;
                        sArr6 = sArr4;
                        sArr5 = sArr3;
                        i18 = i9;
                        i26 = i5;
                        textInputLayout3 = textInputLayout;
                        s2 = s;
                        dialogInterfaceC8327M10090 = dialogInterfaceC8327M10090;
                    } else {
                        sArr5 = sArr5;
                        s2 = s2;
                        dialogInterfaceC8327M10090 = dialogInterfaceC8327M10090;
                        iM31615 = iM31615;
                        textInputLayout3 = textInputLayout3;
                        sArr6 = sArr6;
                        i26 = i26;
                        strM4222 = strM4222;
                        iM3169 = C0773.m3169("᩵ۖ") ^ i17;
                        i2 = ((iM3169 ^ i16) * (-1601)) ^ (-1052259053);
                        i3 = -733636158;
                        i15 = iM3169 ^ i3;
                        i26 = i26;
                        strM4222 = strM4222;
                        iM31615 = iM31615;
                        sArr5 = sArr5;
                        textInputLayout3 = textInputLayout3;
                        s2 = s2;
                        dialogInterfaceC8327M10090 = dialogInterfaceC8327M10090;
                        sArr6 = sArr6;
                        i19 = i15;
                        i18 = i2;
                    }
                    break;
                case -856832070:
                case 1894227793:
                    C3690.m11987();
                    break;
                case -700209916:
                case 2057035611:
                    C11235.m28299(C2834.m9333(viewM9942, iM2763 ^ i22), new View.OnClickListener() { // from class: l.ܿۖ᩻
                        {
                            int i33 = 1465222391;
                            int i34 = C2375.f7641;
                            int i35 = C1321.f4751;
                            int iM2766 = (C0619.m2761("ۖ֫") ^ i34) * (-35);
                            int i36 = ((iM2766 ^ i35) * (-31997)) ^ 467921936;
                            int i37 = 1661180565;
                            while (true) {
                                i33 = ((((i33 ^ i35) * (-24197)) >> 31) & i36) ^ (iM2766 ^ i37);
                                switch (i33) {
                                    case -2063647406:
                                    case -15416457:
                                        if (C3448.m11248() != 0) {
                                            iM2766 = (C0773.m3169("۬ᩳ") ^ i35) * (-93);
                                            i36 = ((iM2766 ^ i34) * (-7857)) ^ (-576623894);
                                            i37 = 1881994645;
                                        } else {
                                            iM2766 = (i35 - C0773.m3169("᩶ۛ")) * 75;
                                            i36 = ((iM2766 ^ i34) * 32351) ^ (-1951385863);
                                            i37 = -1366708713;
                                        }
                                        break;
                                    case -2026567415:
                                    case 1667140389:
                                        return;
                                    case -2025286977:
                                    case 226181458:
                                        C0269.m1775();
                                        throw new RuntimeException();
                                    case -1954799805:
                                    case 1009987646:
                                        C1321.m4852();
                                        RunnableC1848.m6360();
                                        iM2766 = C0773.m3169("۫᩺") ^ i34;
                                        i36 = ((iM2766 ^ i35) * 14983) ^ 1674778646;
                                        i37 = 2040866244;
                                        break;
                                    case -1570434659:
                                    case 1652452152:
                                        if (C3779.m12264()) {
                                            iM2766 = (C0619.m2761("ۙ۠") ^ i35) * (-119);
                                            i36 = ((iM2766 ^ i34) * (-16571)) ^ (-414601994);
                                            i37 = -532678211;
                                        } else {
                                            iM2766 = C0619.m2761("ܳܺ") ^ i34;
                                            i36 = ((iM2766 ^ i35) * 10229) ^ (-938328183);
                                            i37 = -1490788862;
                                        }
                                        break;
                                    case -1438562883:
                                    case 1629968065:
                                        if (RunnableC3055.m9933() == 0) {
                                            iM2766 = C0619.m2761("ܳܺ") ^ i34;
                                            i36 = ((iM2766 ^ i35) * 10229) ^ (-938328183);
                                            i37 = -1490788862;
                                        } else {
                                            iM2766 = C0773.m3169("۫᩺") ^ i34;
                                            i36 = ((iM2766 ^ i35) * 14983) ^ 1674778646;
                                            i37 = 2040866244;
                                        }
                                        break;
                                    case -1307567252:
                                    case 1661663763:
                                        if (C3734.f12817 >= 0) {
                                            iM2766 = (C0773.m3169("۬ᩳ") ^ i35) * (-93);
                                            i36 = ((iM2766 ^ i34) * (-7857)) ^ (-576623894);
                                            i37 = 1881994645;
                                        } else {
                                            iM2766 = C0619.m2761("۫᩸") ^ i34;
                                            i36 = ((iM2766 ^ i35) * (-19107)) ^ (-783761674);
                                            i37 = -266249786;
                                        }
                                        break;
                                    case -965934337:
                                    case 1159453133:
                                        if (C1146.m4231()) {
                                            iM2766 = (C0619.m2761("ۡۡ") ^ i35) * 43;
                                            i36 = ((iM2766 ^ i34) * (-6739)) ^ 464856335;
                                            i37 = 1234733861;
                                        } else {
                                            iM2766 = C0619.m2761("ܳܺ") ^ i34;
                                            i36 = ((iM2766 ^ i35) * 10229) ^ (-938328183);
                                            i37 = -1490788862;
                                        }
                                        break;
                                    case -738579428:
                                    case 434521916:
                                        if (C2702.f8586 <= 0) {
                                            iM2766 = (i35 - C0773.m3169("᩻ۖ")) * (-91);
                                            i36 = ((iM2766 ^ i34) * 30171) ^ (-368788930);
                                            i37 = 1135793539;
                                        } else {
                                            iM2766 = C0773.m3169("۫᩺") ^ i34;
                                            i36 = ((iM2766 ^ i35) * 14983) ^ 1674778646;
                                            i37 = 2040866244;
                                        }
                                        break;
                                    case -394689349:
                                    case -224940892:
                                        if (C1321.f4751 >= 0) {
                                            iM2766 = (i35 - C0773.m3169("᩻ۖ")) * (-91);
                                            i36 = ((iM2766 ^ i34) * 30171) ^ (-368788930);
                                            i37 = 1135793539;
                                        } else {
                                            iM2766 = C0619.m2761("ۛ᩶") ^ i35;
                                            i36 = ((iM2766 ^ i34) * 20579) ^ (-1523284498);
                                            i37 = 83697693;
                                        }
                                        break;
                                    case -302628114:
                                    case 1869217921:
                                        if (C2288.f7433 <= 0) {
                                            iM2766 = (i35 - C0773.m3169("᩻ۖ")) * (-91);
                                            i36 = ((iM2766 ^ i34) * 30171) ^ (-368788930);
                                            i37 = 1135793539;
                                        } else {
                                            iM2766 = (i34 - C0773.m3169("ۢ۟")) * (-81);
                                            i36 = ((iM2766 ^ i35) * 6973) ^ (-1006095483);
                                            i37 = 884368825;
                                        }
                                        break;
                                    case -215589202:
                                    case 1038141584:
                                        if (C0487.f2131 <= 0) {
                                            iM2766 = C0619.m2761("ܳܺ") ^ i34;
                                            i36 = ((iM2766 ^ i35) * 10229) ^ (-938328183);
                                            i37 = -1490788862;
                                        } else {
                                            iM2766 = C0619.m2761("ۜۖ") ^ i34;
                                            i36 = ((iM2766 ^ i35) * 20575) ^ 263926935;
                                            i37 = -2041977945;
                                        }
                                        break;
                                    case -130743050:
                                    case 219152037:
                                        if (C3099.f10023 <= 0) {
                                            iM2766 = (i35 - C0773.m3169("᩻ۖ")) * (-91);
                                            i36 = ((iM2766 ^ i34) * 30171) ^ (-368788930);
                                            i37 = 1135793539;
                                        } else {
                                            iM2766 = (C0619.m2761("۫ۧ") + i34) * (-17);
                                            i36 = ((iM2766 ^ i35) * 4697) ^ 1373231262;
                                            i37 = 13219915;
                                        }
                                        break;
                                    case 829345981:
                                    case 1156720251:
                                        if (C2287.f7432 >= 0) {
                                            iM2766 = (i35 - C0773.m3169("᩻ۖ")) * (-91);
                                            i36 = ((iM2766 ^ i34) * 30171) ^ (-368788930);
                                            i37 = 1135793539;
                                        } else {
                                            iM2766 = C0773.m3169("֡֫") ^ i34;
                                            i36 = ((iM2766 ^ i35) * 10259) ^ 810939594;
                                            i37 = -1296883028;
                                        }
                                        break;
                                    case 1388659308:
                                    case 1721287209:
                                        if (C1080.f3865 >= 0) {
                                            iM2766 = (C0619.m2761("ۘ۬") + i35) * 91;
                                            i36 = ((iM2766 ^ i34) * 18951) ^ 358222792;
                                            i37 = -1830546072;
                                        } else {
                                            iM2766 = (C0773.m3169("ۙ۫") ^ i35) * 67;
                                            i36 = ((iM2766 ^ i34) * (-10155)) ^ (-30208551);
                                            i37 = 1643912173;
                                        }
                                        break;
                                    default:
                                        C11235.m28309();
                                        if (C3448.f11240 >= 0) {
                                            iM2766 = (C0619.m2761("ۘ۬") + i35) * 91;
                                            i36 = ((iM2766 ^ i34) * 18951) ^ 358222792;
                                            i37 = -1830546072;
                                        } else {
                                            iM2766 = C0619.m2761("ܳܺ") ^ i34;
                                            i36 = ((iM2766 ^ i35) * 10229) ^ (-938328183);
                                            i37 = -1490788862;
                                        }
                                        break;
                                }
                            }
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            ViewOnClickListenerC1057 viewOnClickListenerC1057 = null;
                            DialogInterfaceC8327 dialogInterfaceC8327 = null;
                            int i33 = 1765234354;
                            int i34 = C20932.f66974;
                            int i35 = C1321.f4751;
                            int iM2766 = (i34 - C0619.m2761("ܶ۠")) * 87;
                            int i36 = ((iM2766 ^ i35) * (-30199)) ^ (-1280971308);
                            int i37 = -367290755;
                            while (true) {
                                i33 = ((((i33 ^ i35) * (-25477)) >> 31) & i36) ^ (iM2766 ^ i37);
                                switch (i33) {
                                    case -2104613924:
                                    case 1416641565:
                                        C3492.m11488();
                                        if (C0862.f3233 != 0) {
                                            iM2766 = (i35 - C0773.m3169("ܽ᩹")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                                            i36 = ((iM2766 ^ i34) * 14857) ^ 66679628;
                                            i37 = 802668888;
                                        } else {
                                            iM2766 = C0773.m3169("ۛۤ") ^ i34;
                                            i36 = ((iM2766 ^ i35) * (-15797)) ^ 1398421537;
                                            i37 = 1613365132;
                                        }
                                        break;
                                    case -1963685252:
                                    case 1256582240:
                                        AbstractC0116.m1243();
                                        iM2766 = C0773.m3169("᩷ۖ") ^ i35;
                                        i36 = ((iM2766 ^ i34) * 32013) ^ 193708797;
                                        i37 = -1248731364;
                                        break;
                                    case -1924024391:
                                    case 34740874:
                                        C11235.m28309();
                                        if (AbstractC0641.f2496 >= 0) {
                                            iM2766 = C0773.m3169("ۛۤ") ^ i34;
                                            i36 = ((iM2766 ^ i35) * (-15797)) ^ 1398421537;
                                            i37 = 1613365132;
                                        } else {
                                            iM2766 = C0773.m3169("᩷ۖ") ^ i35;
                                            i36 = ((iM2766 ^ i34) * 32013) ^ 193708797;
                                            i37 = -1248731364;
                                        }
                                        break;
                                    case -1871311998:
                                    case 1632780624:
                                        if (AbstractC0116.f1064 <= 0) {
                                            iM2766 = C0619.m2761("᩷۠") ^ i35;
                                            i36 = ((iM2766 ^ i34) * 26195) ^ (-353732972);
                                            i37 = 605407214;
                                        } else {
                                            iM2766 = (C0773.m3169("᩸᩸") ^ i34) * (-35);
                                            i36 = ((iM2766 ^ i35) * (-9849)) ^ (-2028550714);
                                            i37 = 799026034;
                                        }
                                        break;
                                    case -1744565457:
                                    case 869602733:
                                        if (C1542.f5343 <= 0) {
                                            iM2766 = C0619.m2761("ۘۘ") ^ i34;
                                            i36 = ((iM2766 ^ i35) * (-21177)) ^ (-498258623);
                                            i37 = 685639951;
                                        } else {
                                            iM2766 = (i34 - C0773.m3169("ۗᩳ")) * (-75);
                                            i36 = ((iM2766 ^ i35) * (-6807)) ^ 1742679581;
                                            i37 = 1982864896;
                                        }
                                        break;
                                    case -1653900431:
                                    case -810379483:
                                        ViewOnClickListenerC1057.m3955(editText2, dialogInterfaceC8327, viewOnClickListenerC1057, textInputLayout3);
                                        break;
                                    case -1602942096:
                                    case 1671484917:
                                        if (RunnableC3055.f9898 >= 0) {
                                            iM2766 = C0619.m2761("ۘۘ") ^ i34;
                                            i36 = ((iM2766 ^ i35) * (-21177)) ^ (-498258623);
                                            i37 = 685639951;
                                        } else {
                                            iM2766 = (C0619.m2761("ۙᩳ") + i35) * 45;
                                            i36 = ((iM2766 ^ i34) * (-24599)) ^ (-1192674735);
                                            i37 = 27945961;
                                        }
                                        break;
                                    case -1495520393:
                                    case 2063590337:
                                        C3779.m12264();
                                        if (AbstractC3624.f12429 > 0) {
                                            iM2766 = C0619.m2761("ۘۘ") ^ i34;
                                            i36 = ((iM2766 ^ i35) * (-21177)) ^ (-498258623);
                                            i37 = 685639951;
                                        } else {
                                            iM2766 = C0773.m3169("ۛۤ") ^ i34;
                                            i36 = ((iM2766 ^ i35) * (-15797)) ^ 1398421537;
                                            i37 = 1613365132;
                                        }
                                        break;
                                    case -1446610072:
                                    case 319437656:
                                        C3492.m11488();
                                        break;
                                    case -800500609:
                                    case -537372185:
                                        if (C3448.f11240 >= 0) {
                                            iM2766 = (i35 - C0773.m3169("ܽ᩹")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                                            i36 = ((iM2766 ^ i34) * 14857) ^ 66679628;
                                            i37 = 802668888;
                                        } else {
                                            iM2766 = C0773.m3169("ܿܳ") ^ i35;
                                            i36 = ((iM2766 ^ i34) * 20233) ^ (-1479503974);
                                            i37 = -836446597;
                                        }
                                        break;
                                    case -578422206:
                                    case 1358203279:
                                        if (C4282.f15546 <= 0) {
                                            iM2766 = (i35 - C0773.m3169("ܽ᩹")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                                            i36 = ((iM2766 ^ i34) * 14857) ^ 66679628;
                                            i37 = 802668888;
                                        } else {
                                            iM2766 = (C0619.m2761("۬ۢ") ^ i34) * 15;
                                            i36 = ((iM2766 ^ i35) * (-8107)) ^ (-1487930437);
                                            i37 = -497705784;
                                        }
                                        break;
                                    case -385050669:
                                    case 908231475:
                                        dialogInterfaceC8327 = dialogInterfaceC8327M10090;
                                        if (RunnableC3646.f12471) {
                                            iM2766 = C0619.m2761("᩷۠") ^ i35;
                                            i36 = ((iM2766 ^ i34) * 26195) ^ (-353732972);
                                            i37 = 605407214;
                                        } else {
                                            iM2766 = C0773.m3169("֡ۖ") ^ i35;
                                            i36 = ((iM2766 ^ i34) * 21267) ^ (-1982042139);
                                            i37 = 1764424971;
                                        }
                                        break;
                                    case -361429452:
                                    case 1757212372:
                                        viewOnClickListenerC1057 = this;
                                        if (C1343.f4799 != 0) {
                                            iM2766 = C0773.m3169("ۛۤ") ^ i34;
                                            i36 = ((iM2766 ^ i35) * (-15797)) ^ 1398421537;
                                            i37 = 1613365132;
                                        } else {
                                            iM2766 = C0773.m3169("ۨۢ") ^ i34;
                                            i36 = ((iM2766 ^ i35) * (-26447)) ^ 1258858788;
                                            i37 = 485398348;
                                        }
                                        break;
                                    case 167793571:
                                    case 474157763:
                                        if (C3033.f9831 >= 0) {
                                            iM2766 = (i35 - C0773.m3169("ܽ᩹")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                                            i36 = ((iM2766 ^ i34) * 14857) ^ 66679628;
                                            i37 = 802668888;
                                        } else {
                                            iM2766 = (i35 - C0773.m3169("ۗ֡")) * 7;
                                            i36 = ((iM2766 ^ i34) * (-31691)) ^ (-316986152);
                                            i37 = 371991448;
                                        }
                                        break;
                                    case 1007506717:
                                    case 1218663608:
                                        if (C2878.f9462) {
                                            iM2766 = C0619.m2761("ۘۘ") ^ i34;
                                            i36 = ((iM2766 ^ i35) * (-21177)) ^ (-498258623);
                                            i37 = 685639951;
                                        } else {
                                            iM2766 = (C0773.m3169("ܶ᩷") ^ i34) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                            i36 = ((iM2766 ^ i35) * 26973) ^ (-885174133);
                                            i37 = 1595556395;
                                        }
                                        break;
                                    default:
                                        if (C0619.f2439) {
                                            iM2766 = C0773.m3169("᩷ۖ") ^ i35;
                                            i36 = ((iM2766 ^ i34) * 32013) ^ 193708797;
                                            i37 = -1248731364;
                                        } else {
                                            iM2766 = (C0619.m2761("ᩴᩴ") + i35) * (-83);
                                            i36 = ((iM2766 ^ i34) * 2197) ^ 95345135;
                                            i37 = -1414947312;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    break;
                case -569222206:
                case -424682605:
                    short[] sArr12 = sArr5;
                    short s3 = s2;
                    int i33 = iM31615;
                    TextInputLayout textInputLayout4 = textInputLayout3;
                    sArr6 = sArr6;
                    int i34 = i26;
                    String str3 = strM4222;
                    C2361 c2361M3794 = C0950.m3794(this);
                    C4282.m13657(c2361M3794, viewM9942);
                    c2361M3794.m8004(new DialogInterface.OnDismissListener() { // from class: l.ܰۖ᩻
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            ViewOnClickListenerC1057.m3966(this.f45171);
                        }
                    });
                    dialogInterfaceC8327M10090 = C3099.m10090(c2361M3794);
                    editText3 = editText.isEnabled() ? editText : editText2;
                    int iM31621 = C0773.m3169("ۚ֫") ^ i16;
                    i2 = ((iM31621 ^ i17) * (-23665)) ^ (-866800309);
                    i15 = iM31621 ^ (-2036425354);
                    i26 = i34;
                    strM4222 = str3;
                    iM31615 = i33;
                    sArr5 = sArr12;
                    textInputLayout3 = textInputLayout4;
                    s2 = s3;
                    sArr6 = sArr6;
                    i19 = i15;
                    i18 = i2;
                    break;
                case -469071572:
                case -282241382:
                    int i35 = i26;
                    short s4 = s2;
                    View viewM9333 = C2834.m9333(viewM9942, iM31616 ^ i20);
                    C2310.m7811(viewM9333, strM4222);
                    short[] sArr13 = f3786;
                    int iM31622 = (i17 - C0773.m3169("֫ܰ")) * 69;
                    int i36 = ((iM31622 ^ i16) * 28967) ^ (-498638770);
                    i19 = iM31622 ^ (-797583359);
                    sArr6 = sArr6;
                    i26 = i35;
                    iM31615 = iM31615;
                    dialogInterfaceC8327M10090 = dialogInterfaceC8327M10090;
                    textInputLayout3 = (TextInputLayout) viewM9333;
                    sArr5 = sArr13;
                    i18 = i36;
                    s2 = s4;
                    break;
                case -381274892:
                case 602549339:
                    iM2763 = C0619.m2761(RunnableC3055.m9937(f3786, 367, 3, i26));
                    i22 = 2098599804;
                    int iM31623 = (C0773.m3169("᩺۫") ^ i17) * 77;
                    i2 = ((iM31623 ^ i16) * 19827) ^ (-2037521164);
                    i15 = iM31623 ^ (-997848259);
                    sArr5 = sArr5;
                    i19 = i15;
                    i18 = i2;
                    break;
                case -192985722:
                case 223972858:
                    s = s2;
                    dialogInterfaceC8327M10090 = dialogInterfaceC8327M10090;
                    textInputLayout = textInputLayout3;
                    i5 = i26;
                    sArr3 = sArr5;
                    sArr4 = sArr6;
                    iM31615 = C0773.m3169(AbstractC3624.m11769(f3786, 332, 3, i5)) ^ 2100755799;
                    if (C2485.f7950 != 0) {
                        iM31612 = (C0619.m2761("۬ۤ") ^ i17) * (-21);
                        i11 = ((iM31612 ^ i16) * (-16071)) ^ 865976942;
                        i12 = 310964731;
                    } else {
                        iM31612 = (i16 - C0773.m3169("ܿ۟")) * (-31);
                        i11 = ((iM31612 ^ i17) * (-28487)) ^ 950905427;
                        i12 = -1029115672;
                    }
                    i19 = iM31612 ^ i12;
                    i18 = i11;
                    sArr6 = sArr4;
                    sArr5 = sArr3;
                    i26 = i5;
                    textInputLayout3 = textInputLayout;
                    s2 = s;
                    dialogInterfaceC8327M10090 = dialogInterfaceC8327M10090;
                    break;
                case -171667114:
                case 838229915:
                    if (!C1080.m4050()) {
                        s = s2;
                        dialogInterfaceC8327M10090 = dialogInterfaceC8327M10090;
                        textInputLayout = textInputLayout3;
                        i5 = i26;
                        sArr3 = sArr5;
                        sArr4 = sArr6;
                        iM31612 = (C0619.m2761("۬ۤ") ^ i17) * (-21);
                        i11 = ((iM31612 ^ i16) * (-16071)) ^ 865976942;
                        i12 = 310964731;
                        i19 = iM31612 ^ i12;
                        i18 = i11;
                        sArr6 = sArr4;
                        sArr5 = sArr3;
                        i26 = i5;
                        textInputLayout3 = textInputLayout;
                        s2 = s;
                        dialogInterfaceC8327M10090 = dialogInterfaceC8327M10090;
                    }
                    dialogInterfaceC8327M10090 = dialogInterfaceC8327M10090;
                    i = iM31615;
                    textInputLayout3 = textInputLayout3;
                    i26 = i26;
                    sArr2 = sArr5;
                    sArr = sArr6;
                    iM31610 = C0773.m3169("ܳ۫") ^ i16;
                    i6 = ((iM31610 ^ i17) * 18989) ^ 1944829951;
                    i7 = 1068420249;
                    i19 = iM31610 ^ i7;
                    iM31615 = i;
                    sArr6 = sArr;
                    sArr5 = sArr2;
                    i18 = i6;
                    i26 = i26;
                    textInputLayout3 = textInputLayout3;
                    dialogInterfaceC8327M10090 = dialogInterfaceC8327M10090;
                    break;
                case -142042453:
                case 673472915:
                    s = s2;
                    dialogInterfaceC8327M10090 = dialogInterfaceC8327M10090;
                    i4 = iM31615;
                    textInputLayout = textInputLayout3;
                    i5 = i26;
                    sArr3 = sArr5;
                    sArr4 = sArr6;
                    iM2761 = C0619.m2761(C3492.m11486(f3786, 329, 3, i5));
                    iM31611 = C0773.m3169("ۗۖ") ^ i17;
                    i9 = ((iM31611 ^ i16) * 2685) ^ 458858042;
                    i10 = -1337294250;
                    i19 = iM31611 ^ i10;
                    iM31615 = i4;
                    sArr6 = sArr4;
                    sArr5 = sArr3;
                    i18 = i9;
                    i26 = i5;
                    textInputLayout3 = textInputLayout;
                    s2 = s;
                    dialogInterfaceC8327M10090 = dialogInterfaceC8327M10090;
                    break;
                case -114583387:
                case 2059854984:
                    s = s2;
                    dialogInterfaceC8327M10090 = dialogInterfaceC8327M10090;
                    i4 = iM31615;
                    textInputLayout = textInputLayout3;
                    i5 = i26;
                    sArr3 = sArr5;
                    sArr4 = sArr6;
                    viewM9942 = RunnableC3055.m9942(this, iM2761 ^ 2129409768);
                    if (C11235.m28309() == 0) {
                        iM31611 = (C0619.m2761("۫۫") + i16) * (-49);
                        i9 = ((iM31611 ^ i17) * 14077) ^ 1642340464;
                        i10 = 650548822;
                        i19 = iM31611 ^ i10;
                        iM31615 = i4;
                        sArr6 = sArr4;
                        sArr5 = sArr3;
                        i18 = i9;
                        i26 = i5;
                        textInputLayout3 = textInputLayout;
                        s2 = s;
                        dialogInterfaceC8327M10090 = dialogInterfaceC8327M10090;
                    } else {
                        iM31615 = i4;
                        iM31612 = (C0619.m2761("۬ۤ") ^ i17) * (-21);
                        i11 = ((iM31612 ^ i16) * (-16071)) ^ 865976942;
                        i12 = 310964731;
                        i19 = iM31612 ^ i12;
                        i18 = i11;
                        sArr6 = sArr4;
                        sArr5 = sArr3;
                        i26 = i5;
                        textInputLayout3 = textInputLayout;
                        s2 = s;
                        dialogInterfaceC8327M10090 = dialogInterfaceC8327M10090;
                    }
                    break;
                case 395637385:
                case 2043936596:
                    sArr5 = sArr5;
                    s2 = s2;
                    dialogInterfaceC8327M10090 = dialogInterfaceC8327M10090;
                    iM31615 = iM31615;
                    textInputLayout3 = textInputLayout3;
                    sArr6 = sArr6;
                    i26 = i26;
                    strM4222 = strM4222;
                    editText2 = (EditText) viewM11246;
                    C17617.m41267(textInputLayout2);
                    C17617.m41267(textInputLayout3);
                    C2354.m7978(editText, C18978.m44074());
                    z2 = false;
                    z2 = false;
                    if (z) {
                        iM3169 = C0619.m2761("֫ۜ") ^ i17;
                        i2 = ((iM3169 ^ i16) * 14657) ^ 162707966;
                        i3 = -319419607;
                    } else {
                        iM3169 = C0773.m3169("᩺ۛ") ^ i16;
                        i2 = ((iM3169 ^ i17) * (-20151)) ^ 1444230411;
                        i3 = 743630732;
                    }
                    i15 = iM3169 ^ i3;
                    i26 = i26;
                    strM4222 = strM4222;
                    iM31615 = iM31615;
                    sArr5 = sArr5;
                    textInputLayout3 = textInputLayout3;
                    s2 = s2;
                    dialogInterfaceC8327M10090 = dialogInterfaceC8327M10090;
                    sArr6 = sArr6;
                    i19 = i15;
                    i18 = i2;
                    break;
                case 409234646:
                case 1280160459:
                    iM31615 = iM31615;
                    short[] sArr14 = sArr6;
                    strM4222 = strM4222;
                    final TextInputLayout textInputLayout5 = textInputLayout2;
                    sArr5 = sArr5;
                    sArr6 = sArr14;
                    final EditText editText4 = editText;
                    textInputLayout3 = textInputLayout3;
                    i26 = i26;
                    s2 = s2;
                    final View view = viewM9942;
                    dialogInterfaceC8327M10090 = dialogInterfaceC8327M10090;
                    final EditText editText5 = editText2;
                    C11235.m28299(C3448.m11246(viewM9942, iM31617 ^ i21), new View.OnClickListener() { // from class: l.᩶ۖ᩻
                        {
                            int i37 = -1186993473;
                            int i38 = C3099.f10023;
                            int i39 = C2419.f7754;
                            int iM2766 = (i38 - C0619.m2761("ܿܶ")) * 63;
                            int i40 = ((iM2766 ^ i39) * 30073) ^ (-832735164);
                            int i41 = 616311584;
                            while (true) {
                                i37 = ((((i37 ^ i39) * (-24255)) >> 31) & i40) ^ (iM2766 ^ i41);
                                switch (i37) {
                                    case -2026720571:
                                    case 782519111:
                                        if (C2310.f7472 >= 0) {
                                            iM2766 = (i38 - C0619.m2761("᩹ۛ")) * 61;
                                            i40 = ((iM2766 ^ i39) * (-12049)) ^ (-1274123185);
                                            i41 = 197712476;
                                        } else {
                                            iM2766 = (C0619.m2761("᩸᩻") ^ i39) * (-29);
                                            i40 = ((iM2766 ^ i38) * (-22713)) ^ 1003527178;
                                            i41 = -267802281;
                                        }
                                        break;
                                    case -1812517241:
                                    case 1045684481:
                                        if (C2419.f7754 >= 0) {
                                            iM2766 = (i39 - C0619.m2761("᩷ۗ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                            i40 = ((iM2766 ^ i38) * (-32279)) ^ (-130741572);
                                            i41 = -791486601;
                                        } else {
                                            iM2766 = C0773.m3169("۟ۘ") ^ i39;
                                            i40 = ((iM2766 ^ i38) * 24699) ^ (-853866370);
                                            i41 = 277260082;
                                        }
                                        break;
                                    case -1735478735:
                                    case 815166006:
                                        if (RunnableC3055.m9933() != 0) {
                                            iM2766 = (i39 - C0773.m3169("ۢ᩹")) * 49;
                                            i40 = ((iM2766 ^ i38) * (-16133)) ^ 1518726382;
                                            i41 = 1323980980;
                                        } else {
                                            iM2766 = (C0619.m2761("᩹ᩳ") + i38) * (-39);
                                            i40 = ((iM2766 ^ i39) * (-14553)) ^ 292846161;
                                            i41 = 1943375215;
                                        }
                                        break;
                                    case -1409069904:
                                    case 2086194539:
                                        return;
                                    case -1393451016:
                                    case 919759833:
                                        C3690.m11987();
                                        C1519.m5403();
                                        iM2766 = (C0773.m3169("᩺ۚ") ^ i39) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                        i40 = ((iM2766 ^ i38) * (-9191)) ^ (-713853436);
                                        i41 = 179358791;
                                        break;
                                    case -1346263155:
                                    case 1829802989:
                                        if (C2310.f7472 >= 0) {
                                            iM2766 = C0619.m2761("ۗۧ") ^ i38;
                                            i40 = ((iM2766 ^ i39) * (-32295)) ^ 1059290813;
                                            i41 = -190595186;
                                        } else {
                                            iM2766 = (C0773.m3169("᩺ۚ") ^ i39) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                            i40 = ((iM2766 ^ i38) * (-9191)) ^ (-713853436);
                                            i41 = 179358791;
                                        }
                                        break;
                                    case -1334120127:
                                    case 1993909836:
                                        if (C3734.f12817 >= 0) {
                                            iM2766 = C0619.m2761("ۗۧ") ^ i38;
                                            i40 = ((iM2766 ^ i39) * (-32295)) ^ 1059290813;
                                            i41 = -190595186;
                                        } else {
                                            iM2766 = (C0619.m2761("ܽۘ") + i39) * (-95);
                                            i40 = ((iM2766 ^ i38) * (-13215)) ^ (-1010703867);
                                            i41 = -925994910;
                                        }
                                        break;
                                    case -350665147:
                                    case 13130152:
                                        if (!C3690.m11987()) {
                                            iM2766 = (i39 - C0619.m2761("᩷ۗ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                            i40 = ((iM2766 ^ i38) * (-32279)) ^ (-130741572);
                                            i41 = -791486601;
                                        } else {
                                            iM2766 = (C0773.m3169("᩺ۚ") ^ i39) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                            i40 = ((iM2766 ^ i38) * (-9191)) ^ (-713853436);
                                            i41 = 179358791;
                                        }
                                        break;
                                    case -116439601:
                                    case 153695480:
                                        if (C3448.f11240 >= 0) {
                                            iM2766 = (i39 - C0619.m2761("᩷ۗ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                            i40 = ((iM2766 ^ i38) * (-32279)) ^ (-130741572);
                                            i41 = -791486601;
                                        } else {
                                            iM2766 = C0773.m3169("ᩴ᩵") ^ i39;
                                            i40 = ((iM2766 ^ i38) * 20317) ^ 1920873049;
                                            i41 = -1600699724;
                                        }
                                        break;
                                    case -45459587:
                                    case 1368013349:
                                        C13473.m33144();
                                        C3779.m12264();
                                        throw new RuntimeException();
                                    case 12179906:
                                    case 1093025643:
                                        if (AbstractC3624.m11755() != 0) {
                                            iM2766 = (i39 - C0773.m3169("ۢ᩹")) * 49;
                                            i40 = ((iM2766 ^ i38) * (-16133)) ^ 1518726382;
                                            i41 = 1323980980;
                                        } else {
                                            iM2766 = (C0773.m3169("֨ܳ") + i39) * 11;
                                            i40 = ((iM2766 ^ i38) * 261) ^ (-888472258);
                                            i41 = 1898865751;
                                        }
                                        break;
                                    case 240593388:
                                    case 748993720:
                                        if (C3779.m12264()) {
                                            iM2766 = C0619.m2761("ܳۖ") ^ i38;
                                            i40 = ((iM2766 ^ i39) * (-13967)) ^ (-5784522);
                                            i41 = 1491846471;
                                        } else {
                                            iM2766 = (C0773.m3169("᩺ۚ") ^ i39) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                            i40 = ((iM2766 ^ i38) * (-9191)) ^ (-713853436);
                                            i41 = 179358791;
                                        }
                                        break;
                                    case 648202463:
                                    case 686017983:
                                        if (C3448.f11240 >= 0) {
                                            iM2766 = C0619.m2761("ۗۧ") ^ i38;
                                            i40 = ((iM2766 ^ i39) * (-32295)) ^ 1059290813;
                                            i41 = -190595186;
                                        } else {
                                            iM2766 = C0773.m3169("ܽۙ") ^ i38;
                                            i40 = ((iM2766 ^ i39) * 4127) ^ 1425735389;
                                            i41 = 780844022;
                                        }
                                        break;
                                    case 1347714039:
                                    case 1494864702:
                                        C3734.m12152();
                                        if (C1542.f5343 <= 0) {
                                            iM2766 = (i38 - C0619.m2761("᩹ۛ")) * 61;
                                            i40 = ((iM2766 ^ i39) * (-12049)) ^ (-1274123185);
                                            i41 = 197712476;
                                        } else {
                                            iM2766 = C0619.m2761("ۗۧ") ^ i38;
                                            i40 = ((iM2766 ^ i39) * (-32295)) ^ 1059290813;
                                            i41 = -190595186;
                                        }
                                        break;
                                    case 1829953037:
                                    case 2059563820:
                                        if (C2288.m7767()) {
                                            iM2766 = (i39 - C0619.m2761("᩷ۗ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                            i40 = ((iM2766 ^ i38) * (-32279)) ^ (-130741572);
                                            i41 = -791486601;
                                        } else {
                                            iM2766 = C0619.m2761("᩸ۘ") ^ i38;
                                            i40 = ((iM2766 ^ i39) * 19251) ^ (-1153291056);
                                            i41 = 1962245470;
                                        }
                                        break;
                                    default:
                                        if (C2310.f7472 >= 0) {
                                            iM2766 = (i39 - C0619.m2761("᩷ۗ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                            i40 = ((iM2766 ^ i38) * (-32279)) ^ (-130741572);
                                            i41 = -791486601;
                                        } else {
                                            iM2766 = (C0619.m2761("ۧ᩷") + i38) * (-47);
                                            i40 = ((iM2766 ^ i39) * 12737) ^ 1728202718;
                                            i41 = -432826479;
                                        }
                                        break;
                                }
                            }
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            View view3 = null;
                            EditText editText6 = null;
                            TextInputLayout textInputLayout6 = null;
                            EditText editText7 = null;
                            int i37 = 581971758;
                            int i38 = C1321.f4751;
                            int i39 = C0487.f2131;
                            int iM2766 = C0619.m2761("ۗ۬") ^ i38;
                            int i40 = ((iM2766 ^ i39) * 13557) ^ 586609032;
                            int i41 = -1654063542;
                            while (true) {
                                i37 = ((((i37 ^ i39) * 13325) >> 31) & i40) ^ (iM2766 ^ i41);
                                switch (i37) {
                                    case -2014058707:
                                    case 113696309:
                                        editText6 = editText5;
                                        if (C11235.f35427 >= 0) {
                                            iM2766 = (C0773.m3169("ۡ۟") + i38) * 51;
                                            i40 = ((iM2766 ^ i39) * 13271) ^ (-1186119107);
                                            i41 = -1039811754;
                                        } else {
                                            iM2766 = C0773.m3169("᩹᩵") ^ i38;
                                            i40 = ((iM2766 ^ i39) * (-2139)) ^ 1120058920;
                                            i41 = -1846184656;
                                        }
                                        break;
                                    case -1412150054:
                                    case -100817420:
                                        if (C1080.m4050()) {
                                            iM2766 = C0773.m3169("ܰۙ") ^ i38;
                                            i40 = ((iM2766 ^ i39) * (-29965)) ^ 1586074401;
                                            i41 = 1095509125;
                                        } else {
                                            iM2766 = C0773.m3169("ܿ᩻") ^ i39;
                                            i40 = ((iM2766 ^ i38) * 21841) ^ 100610225;
                                            i41 = -150471767;
                                        }
                                        break;
                                    case -1256996268:
                                    case -254403389:
                                        if (C3690.m11987()) {
                                            iM2766 = C0773.m3169("ܿ᩻") ^ i39;
                                            i40 = ((iM2766 ^ i38) * 21841) ^ 100610225;
                                            i41 = -150471767;
                                        } else {
                                            iM2766 = C0773.m3169("ۗۢ") ^ i38;
                                            i40 = ((iM2766 ^ i39) * 32591) ^ 725525100;
                                            i41 = -602504934;
                                        }
                                        break;
                                    case -1006354752:
                                    case 134080360:
                                        C3779.m12264();
                                        iM2766 = (C0619.m2761("ܽۜ") + i39) * (-71);
                                        i40 = ((iM2766 ^ i38) * 26663) ^ (-921376259);
                                        i41 = -1267811849;
                                        break;
                                    case -885285848:
                                    case -568542423:
                                        C4238.m13540();
                                        break;
                                    case -817047266:
                                    case 2056160394:
                                        view3 = view;
                                        if (C2287.m7745() <= 0) {
                                            iM2766 = (C0773.m3169("᩷ۡ") + i38) * (-5);
                                            i40 = ((iM2766 ^ i39) * (-31175)) ^ 1865827503;
                                            i41 = -1190224561;
                                        } else {
                                            iM2766 = (C0619.m2761("֫ۙ") ^ i39) * 87;
                                            i40 = ((iM2766 ^ i38) * 22165) ^ 274916877;
                                            i41 = 1883963095;
                                        }
                                        break;
                                    case -728603094:
                                    case 1574371075:
                                        if (C2354.m7983()) {
                                            iM2766 = C0773.m3169("᩻۫") ^ i38;
                                            i40 = ((iM2766 ^ i39) * 31159) ^ 1407140194;
                                            i41 = 327689983;
                                        } else {
                                            iM2766 = (C0619.m2761("ܽۜ") + i39) * (-71);
                                            i40 = ((iM2766 ^ i38) * 26663) ^ (-921376259);
                                            i41 = -1267811849;
                                        }
                                        break;
                                    case -529119315:
                                    case 761844019:
                                        if (!C1519.m5403()) {
                                            iM2766 = (C0619.m2761("ܽۜ") + i39) * (-71);
                                            i40 = ((iM2766 ^ i38) * 26663) ^ (-921376259);
                                            i41 = -1267811849;
                                        } else {
                                            iM2766 = (C0773.m3169("᩷ۡ") + i38) * (-5);
                                            i40 = ((iM2766 ^ i39) * (-31175)) ^ 1865827503;
                                            i41 = -1190224561;
                                        }
                                        break;
                                    case -457935059:
                                    case 670052834:
                                        if (C1343.m4943()) {
                                            iM2766 = C0619.m2761("᩹ۗ") ^ i39;
                                            i40 = ((iM2766 ^ i38) * (-16337)) ^ 1399151485;
                                            i41 = -292562542;
                                        } else {
                                            iM2766 = C0773.m3169("ۜܿ") ^ i38;
                                            i40 = ((iM2766 ^ i39) * 16239) ^ (-106424547);
                                            i41 = -1762006398;
                                        }
                                        break;
                                    case -405529001:
                                    case -101005368:
                                        if (RunnableC3055.f9898 >= 0) {
                                            iM2766 = C0773.m3169("ܿ᩻") ^ i39;
                                            i40 = ((iM2766 ^ i38) * 21841) ^ 100610225;
                                            i41 = -150471767;
                                        } else {
                                            iM2766 = C0773.m3169("ᩴ֨") ^ i39;
                                            i40 = ((iM2766 ^ i38) * 15333) ^ (-1284781190);
                                            i41 = -1008723834;
                                        }
                                        break;
                                    case -224009171:
                                    case 1402966581:
                                        if (!C13473.m33144()) {
                                            iM2766 = C0773.m3169("ۜܿ") ^ i38;
                                            i40 = ((iM2766 ^ i39) * 16239) ^ (-106424547);
                                            i41 = -1762006398;
                                        } else {
                                            iM2766 = (C0773.m3169("᩷ۡ") + i38) * (-5);
                                            i40 = ((iM2766 ^ i39) * (-31175)) ^ 1865827503;
                                            i41 = -1190224561;
                                        }
                                        break;
                                    case 501366385:
                                    case 1750358308:
                                        ViewOnClickListenerC1057.m3956(textInputLayout6, editText7, this, view3, editText6);
                                        break;
                                    case 526726820:
                                    case 930014551:
                                        textInputLayout6 = textInputLayout5;
                                        editText7 = editText4;
                                        if (C3492.f12043 <= 0) {
                                            iM2766 = (C0619.m2761("ܽۜ") + i39) * (-71);
                                            i40 = ((iM2766 ^ i38) * 26663) ^ (-921376259);
                                            i41 = -1267811849;
                                        } else {
                                            iM2766 = (C0619.m2761("֡ܺ") ^ i39) * 67;
                                            i40 = ((iM2766 ^ i38) * (-30209)) ^ 1182103549;
                                            i41 = 1060159058;
                                        }
                                        break;
                                    case 811724314:
                                    case 1107901831:
                                        if (C1080.f3865 < 0) {
                                            iM2766 = C0773.m3169("ܿ᩻") ^ i39;
                                            i40 = ((iM2766 ^ i38) * 21841) ^ 100610225;
                                            i41 = -150471767;
                                        } else {
                                            iM2766 = (C0773.m3169("᩷ۡ") + i38) * (-5);
                                            i40 = ((iM2766 ^ i39) * (-31175)) ^ 1865827503;
                                            i41 = -1190224561;
                                        }
                                        break;
                                    case 866857597:
                                    case 1292517213:
                                        if (C2354.f7599 >= 0) {
                                            iM2766 = C0773.m3169("ۜܿ") ^ i38;
                                            i40 = ((iM2766 ^ i39) * 16239) ^ (-106424547);
                                            i41 = -1762006398;
                                        } else {
                                            iM2766 = C0619.m2761("۫ۨ") ^ i39;
                                            i40 = ((iM2766 ^ i38) * 22627) ^ 1044860981;
                                            i41 = -205132440;
                                        }
                                        break;
                                    default:
                                        if (C17202.f56030) {
                                            iM2766 = C0619.m2761("᩻۠") ^ i38;
                                            i40 = ((iM2766 ^ i39) * 26219) ^ (-1528330430);
                                            i41 = -1791961405;
                                        } else {
                                            iM2766 = (C0773.m3169("ۡ۟") + i38) * 51;
                                            i40 = ((iM2766 ^ i39) * 13271) ^ (-1186119107);
                                            i41 = -1039811754;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    if (C2023.m6964() > 0) {
                        iM3169 = C0773.m3169("᩺᩻") ^ i16;
                        i2 = ((iM3169 ^ i17) * (-31879)) ^ 74212090;
                        i3 = 1822480074;
                        i15 = iM3169 ^ i3;
                        i26 = i26;
                        strM4222 = strM4222;
                        iM31615 = iM31615;
                        sArr5 = sArr5;
                        textInputLayout3 = textInputLayout3;
                        s2 = s2;
                        dialogInterfaceC8327M10090 = dialogInterfaceC8327M10090;
                        sArr6 = sArr6;
                        i19 = i15;
                        i18 = i2;
                    } else {
                        sArr = sArr6;
                        strM4222 = strM4222;
                        i = iM31615;
                        sArr2 = sArr5;
                        s2 = s2;
                        iM31610 = C0773.m3169("ܳ۫") ^ i16;
                        i6 = ((iM31610 ^ i17) * 18989) ^ 1944829951;
                        i7 = 1068420249;
                        i19 = iM31610 ^ i7;
                        iM31615 = i;
                        sArr6 = sArr;
                        sArr5 = sArr2;
                        i18 = i6;
                        i26 = i26;
                        textInputLayout3 = textInputLayout3;
                        dialogInterfaceC8327M10090 = dialogInterfaceC8327M10090;
                    }
                    break;
                case 638322342:
                case 933681597:
                    dialogInterfaceC8327M10090 = dialogInterfaceC8327M10090;
                    i = iM31615;
                    textInputLayout3 = textInputLayout3;
                    i26 = i26;
                    sArr2 = sArr5;
                    sArr = sArr6;
                    int i37 = i23 + i24;
                    int i38 = s2 + 9546;
                    if ((i37 + i37) - (i38 * i38) < 0) {
                        iM31610 = (C0619.m2761("᩶᩻") + i16) * 81;
                        i6 = ((iM31610 ^ i17) * (-25721)) ^ 1133188963;
                        i7 = -1084609959;
                    } else {
                        iM31610 = C0773.m3169("ۢ֡") ^ i17;
                        i6 = ((iM31610 ^ i16) * (-5965)) ^ (-1369417051);
                        i7 = 1046472040;
                    }
                    i19 = iM31610 ^ i7;
                    iM31615 = i;
                    sArr6 = sArr;
                    sArr5 = sArr2;
                    i18 = i6;
                    i26 = i26;
                    textInputLayout3 = textInputLayout3;
                    dialogInterfaceC8327M10090 = dialogInterfaceC8327M10090;
                    break;
                case 1342021320:
                case 2033438500:
                    C2287.m7745();
                    if (!C1146.m4231()) {
                        sArr5 = sArr5;
                        s2 = s2;
                        dialogInterfaceC8327M10090 = dialogInterfaceC8327M10090;
                        iM31615 = iM31615;
                        textInputLayout3 = textInputLayout3;
                        sArr6 = sArr6;
                        i26 = i26;
                        strM4222 = strM4222;
                        iM3169 = C0773.m3169("᩵ۖ") ^ i17;
                        i2 = ((iM3169 ^ i16) * (-1601)) ^ (-1052259053);
                        i3 = -733636158;
                        i15 = iM3169 ^ i3;
                        i26 = i26;
                        strM4222 = strM4222;
                        iM31615 = iM31615;
                        sArr5 = sArr5;
                        textInputLayout3 = textInputLayout3;
                        s2 = s2;
                        dialogInterfaceC8327M10090 = dialogInterfaceC8327M10090;
                        sArr6 = sArr6;
                        i19 = i15;
                        i18 = i2;
                    } else {
                        dialogInterfaceC8327M10090 = dialogInterfaceC8327M10090;
                        i = iM31615;
                        textInputLayout3 = textInputLayout3;
                        i26 = i26;
                        sArr2 = sArr5;
                        sArr = sArr6;
                        iM31610 = C0773.m3169("ܳ۫") ^ i16;
                        i6 = ((iM31610 ^ i17) * 18989) ^ 1944829951;
                        i7 = 1068420249;
                        i19 = iM31610 ^ i7;
                        iM31615 = i;
                        sArr6 = sArr;
                        sArr5 = sArr2;
                        i18 = i6;
                        i26 = i26;
                        textInputLayout3 = textInputLayout3;
                        dialogInterfaceC8327M10090 = dialogInterfaceC8327M10090;
                    }
                    break;
                case 1344797043:
                case 1662544381:
                    editText.setSelection(z2 ? 1 : 0, editText.length());
                    iM3169 = (i17 - C0773.m3169("ۖܰ")) * 53;
                    i2 = ((iM3169 ^ i16) * 32679) ^ (-1095832969);
                    i3 = -283297928;
                    i15 = iM3169 ^ i3;
                    i26 = i26;
                    strM4222 = strM4222;
                    iM31615 = iM31615;
                    sArr5 = sArr5;
                    textInputLayout3 = textInputLayout3;
                    s2 = s2;
                    dialogInterfaceC8327M10090 = dialogInterfaceC8327M10090;
                    sArr6 = sArr6;
                    i19 = i15;
                    i18 = i2;
                    break;
                default:
                    dialogInterfaceC8327M10090 = dialogInterfaceC8327M10090;
                    i = iM31615;
                    textInputLayout3 = textInputLayout3;
                    i26 = i26;
                    sArr2 = sArr5;
                    sArr = sArr6;
                    s2 = f3786[328];
                    i23 = s2 * s2;
                    i24 = 91126116;
                    if (C3448.f11240 >= 0) {
                        iM31610 = C0773.m3169("ܳ۫") ^ i16;
                        i6 = ((iM31610 ^ i17) * 18989) ^ 1944829951;
                        i7 = 1068420249;
                    } else {
                        iM31610 = C0773.m3169("ۘܽ") ^ i16;
                        i6 = ((iM31610 ^ i17) * 8701) ^ 1159502126;
                        i7 = 2028975880;
                    }
                    i19 = iM31610 ^ i7;
                    iM31615 = i;
                    sArr6 = sArr;
                    sArr5 = sArr2;
                    i18 = i6;
                    i26 = i26;
                    textInputLayout3 = textInputLayout3;
                    dialogInterfaceC8327M10090 = dialogInterfaceC8327M10090;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x018b A[PHI: r8 r9 r15
      0x018b: PHI (r8v4 int) = (r8v3 int), (r8v2 int), (r8v2 int), (r8v2 int) binds: [B:46:0x0189, B:17:0x008f, B:15:0x008b, B:11:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x018b: PHI (r9v4 int) = (r9v3 int), (r9v2 int), (r9v2 int), (r9v2 int) binds: [B:46:0x0189, B:17:0x008f, B:15:0x008b, B:11:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x018b: PHI (r15v4 short[]) = (r15v3 short[]), (r15v2 short[]), (r15v2 short[]), (r15v2 short[]) binds: [B:46:0x0189, B:17:0x008f, B:15:0x008b, B:11:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x028a A[PHI: r13 r18 r19 r24
      0x028a: PHI (r13v4 int) = (r13v2 int), (r13v2 int), (r13v3 int), (r13v2 int), (r13v2 int) binds: [B:69:0x0288, B:65:0x026b, B:61:0x024e, B:15:0x008b, B:8:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x028a: PHI (r18v4 short) = (r18v3 short), (r18v2 short), (r18v2 short), (r18v2 short), (r18v2 short) binds: [B:69:0x0288, B:65:0x026b, B:61:0x024e, B:15:0x008b, B:8:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x028a: PHI (r19v4 int) = (r19v2 int), (r19v3 int), (r19v2 int), (r19v2 int), (r19v2 int) binds: [B:69:0x0288, B:65:0x026b, B:61:0x024e, B:15:0x008b, B:8:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x028a: PHI (r24v5 int) = (r24v3 int), (r24v3 int), (r24v4 int), (r24v3 int), (r24v3 int) binds: [B:69:0x0288, B:65:0x026b, B:61:0x024e, B:15:0x008b, B:8:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x02bb A[PHI: r5 r7 r17
      0x02bb: PHI (r5v5 char) = (r5v2 char), (r5v3 char), (r5v2 char), (r5v2 char) binds: [B:73:0x02b9, B:34:0x0110, B:26:0x00d1, B:8:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x02bb: PHI (r7v5 int) = (r7v2 int), (r7v2 int), (r7v3 int), (r7v2 int) binds: [B:73:0x02b9, B:34:0x0110, B:26:0x00d1, B:8:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x02bb: PHI (r17v5 char) = (r17v3 char), (r17v2 char), (r17v2 char), (r17v2 char) binds: [B:73:0x02b9, B:34:0x0110, B:26:0x00d1, B:8:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x02eb A[PHI: r3 r4 r10 r11 r16
      0x02eb: PHI (r3v4 java.lang.String) = (r3v2 java.lang.String), (r3v3 java.lang.String), (r3v2 java.lang.String) binds: [B:77:0x02e9, B:38:0x0133, B:30:0x00f3] A[DONT_GENERATE, DONT_INLINE]
      0x02eb: PHI (r4v4 java.lang.Object[]) = (r4v2 java.lang.Object[]), (r4v3 java.lang.Object[]), (r4v2 java.lang.Object[]) binds: [B:77:0x02e9, B:38:0x0133, B:30:0x00f3] A[DONT_GENERATE, DONT_INLINE]
      0x02eb: PHI (r10v3 short[]) = (r10v2 short[]), (r10v2 short[]), (r10v4 short[]) binds: [B:77:0x02e9, B:38:0x0133, B:30:0x00f3] A[DONT_GENERATE, DONT_INLINE]
      0x02eb: PHI (r11v3 int) = (r11v2 int), (r11v2 int), (r11v4 int) binds: [B:77:0x02e9, B:38:0x0133, B:30:0x00f3] A[DONT_GENERATE, DONT_INLINE]
      0x02eb: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:77:0x02e9, B:38:0x0133, B:30:0x00f3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    private final void m3968() {
        int iM3169;
        int i;
        int i2;
        String strM33142;
        int i3 = C3099.f10023;
        int i4 = C2375.f7641;
        int iM31610 = C0773.m3169("۟᩵") ^ i3;
        int i5 = ((iM31610 ^ i4) * 2227) ^ (-325557242);
        Object[] objArr = null;
        String str = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM31610 ^ 2017860864;
        char c = 0;
        int iM31611 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        char c2 = 0;
        short s = 0;
        int i12 = 0;
        int i13 = -1188288744;
        int i14 = 0;
        String strM44074 = null;
        TextView textView = null;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i4) * (-23585)) >> 31));
            switch (i13) {
                case -2097091215:
                case -313016942:
                    C2354.m7978(textView, str);
                    return;
                case -2053782347:
                case 1752236293:
                    objArr[c] = strM44074;
                    sArr3 = f3786;
                    i9 = 192;
                    if (C2354.f7599 >= 0) {
                        iM3169 = (C0619.m2761("ۜ۠") + i3) * 47;
                        i = ((iM3169 ^ i4) * 29117) ^ 1788773945;
                        i2 = -1431248200;
                    } else {
                        iM3169 = C0619.m2761("᩻᩵") ^ i4;
                        i = ((iM3169 ^ i3) * (-21641)) ^ 1089954455;
                        i2 = -1267221526;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -2016750445:
                case -707154429:
                    strM33142 = C18978.m44074();
                    str = strM33142;
                    iM3169 = C0619.m2761("ۖ֡") ^ i4;
                    i = ((iM3169 ^ i3) * 9649) ^ 1301924823;
                    i2 = -1719013280;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1974568363:
                case 1274479999:
                    i14 = i12 * i12;
                    i10 = s * 2;
                    if (C2702.f8586 <= 0) {
                        iM3169 = C0773.m3169("᩸ܳ") ^ i4;
                        i = ((iM3169 ^ i3) * 28159) ^ 867275839;
                        i2 = 2128350819;
                    } else {
                        iM3169 = C0773.m3169("ۚۘ") ^ i3;
                        i = ((iM3169 ^ i4) * (-10781)) ^ (-241879417);
                        i2 = -2091563488;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1963373468:
                case -1647007378:
                    if (C0269.f1558 > 0) {
                        iM3169 = C0773.m3169("᩸ܳ") ^ i4;
                        i = ((iM3169 ^ i3) * 28159) ^ 867275839;
                        i2 = 2128350819;
                    } else {
                        iM3169 = C0773.m3169("ۢ᩷") ^ i3;
                        i = ((iM3169 ^ i4) * 15211) ^ 874627915;
                        i2 = 520909323;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1619346744:
                case 1079364352:
                    strM33142 = C13473.m33142(this, 2125883475 ^ iM31611, objArr);
                    str = strM33142;
                    iM3169 = C0619.m2761("ۖ֡") ^ i4;
                    i = ((iM3169 ^ i3) * 9649) ^ 1301924823;
                    i2 = -1719013280;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1598286606:
                case -1236782559:
                    textView = this.f3792;
                    if (textView != null) {
                        iM3169 = (C0773.m3169("ܽ֡") + i3) * (-21);
                        i = ((iM3169 ^ i4) * 28129) ^ 802945696;
                        i2 = -1684898637;
                    } else {
                        iM3169 = (C0773.m3169("᩵۫") + i3) * 71;
                        i = ((iM3169 ^ i4) * (-3101)) ^ 1524087398;
                        i2 = -1406909568;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1505387339:
                case -741564988:
                    sArr2 = f3786;
                    i7 = 183;
                    i8 = 9;
                    if (C1826.f6190 <= 0) {
                        iM3169 = (C0773.m3169("ᩴ᩸") + i3) * (-9);
                        i = ((iM3169 ^ i4) * 26261) ^ (-389528765);
                        i2 = 1115505367;
                    } else {
                        iM3169 = (i4 - C0619.m2761("ۡ᩷")) * 39;
                        i = ((iM3169 ^ i3) * 17403) ^ (-1672036670);
                        i2 = -842560695;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1500894095:
                case -333335815:
                    C11235.m28309();
                    C4282.m13644();
                    return;
                case -1433070750:
                case 245873749:
                    s = sArr[c2];
                    if (C11235.f35427 >= 0) {
                        iM3169 = C0773.m3169("᩸ܳ") ^ i4;
                        i = ((iM3169 ^ i3) * 28159) ^ 867275839;
                        i2 = 2128350819;
                    } else {
                        iM3169 = C0773.m3169("᩷᩷") ^ i4;
                        i = ((iM3169 ^ i3) * 5699) ^ (-689124639);
                        i2 = 798291516;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1342056211:
                case -1062575927:
                    iM31611 = C0773.m3169(C11235.m28300(sArr3, i9, 3, i11));
                    if (C4238.f15451 >= 0) {
                        iM3169 = C0773.m3169("ۢ᩷") ^ i3;
                        i = ((iM3169 ^ i4) * 15211) ^ 874627915;
                        i2 = 520909323;
                    } else {
                        iM3169 = C0773.m3169("ܰ֫") ^ i3;
                        i = ((iM3169 ^ i4) * 17105) ^ 1163684876;
                        i2 = -953637835;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1263961662:
                case 1543907867:
                    if (C3998.f13671 != 0) {
                        iM3169 = (C0773.m3169("ᩴ᩸") + i3) * (-9);
                        i = ((iM3169 ^ i4) * 26261) ^ (-389528765);
                        i2 = 1115505367;
                    } else {
                        iM3169 = C0773.m3169("᩸ܳ") ^ i4;
                        i = ((iM3169 ^ i3) * 28159) ^ 867275839;
                        i2 = 2128350819;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1253542889:
                case 156317485:
                    strM44074 = C18978.m44074();
                    objArr = new Object[1];
                    if (C13473.f42873 != 0) {
                        iM3169 = (C0619.m2761("ۜ۠") + i3) * 47;
                        i = ((iM3169 ^ i4) * 29117) ^ 1788773945;
                        i2 = -1431248200;
                    } else {
                        iM3169 = C0619.m2761("ۛ۟") ^ i3;
                        i = ((iM3169 ^ i4) * (-16921)) ^ (-1227239060);
                        i2 = -2083829218;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1111261612:
                case -575229687:
                    i11 = 1016;
                    iM3169 = (i4 - C0619.m2761("ۘۤ")) * 57;
                    i = ((iM3169 ^ i3) * 6847) ^ (-1605383506);
                    i2 = -1511891529;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -620271720:
                case -189796804:
                    if ((i10 + 1) - i14 <= 0) {
                        iM3169 = (C0619.m2761("ۙ֨") ^ i4) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM3169 ^ i3) * (-20595)) ^ 2095402465;
                        i2 = 1208634406;
                    } else {
                        iM3169 = (i3 - C0773.m3169("᩷۬")) * (-69);
                        i = ((iM3169 ^ i4) * (-30845)) ^ (-804803253);
                        i2 = -281557310;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -610702340:
                case 842069837:
                    c = 0;
                    if (C1321.f4751 >= 0) {
                        iM3169 = C0773.m3169("ۢ᩷") ^ i3;
                        i = ((iM3169 ^ i4) * 15211) ^ 874627915;
                        i2 = 520909323;
                    } else {
                        iM3169 = C0619.m2761("ۢۜ") ^ i4;
                        i = ((iM3169 ^ i3) * 29605) ^ 119108169;
                        i2 = 481249606;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 167879073:
                case 1403246370:
                    C2834.m9344();
                    C1343.m4943();
                    iM3169 = (C0773.m3169("ᩴ᩸") + i3) * (-9);
                    i = ((iM3169 ^ i4) * 26261) ^ (-389528765);
                    i2 = 1115505367;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 189486410:
                case 1519183901:
                    if (C18978.m44069()) {
                        iM3169 = C0773.m3169("ۢۡ") ^ i3;
                        i = ((iM3169 ^ i4) * 17669) ^ (-1728166064);
                        i2 = -543624662;
                    } else {
                        iM3169 = (C0773.m3169("ᩳۚ") ^ i4) * 43;
                        i = ((iM3169 ^ i3) * (-24719)) ^ (-1846315626);
                        i2 = -1469223225;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 538183920:
                case 1187427901:
                    sArr = f3786;
                    if (C2288.f7433 <= 0) {
                        iM3169 = (C0619.m2761("ۜ۠") + i3) * 47;
                        i = ((iM3169 ^ i4) * 29117) ^ 1788773945;
                        i2 = -1431248200;
                    } else {
                        iM3169 = C0773.m3169("֡᩺") ^ i3;
                        i = ((iM3169 ^ i4) * (-28255)) ^ 467089708;
                        i2 = 603124546;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 1197369176:
                case 1929449117:
                    if (C1826.f6190 <= 0) {
                        iM3169 = (C0773.m3169("ᩴ᩸") + i3) * (-9);
                        i = ((iM3169 ^ i4) * 26261) ^ (-389528765);
                        i2 = 1115505367;
                    } else {
                        iM3169 = (C0773.m3169("֫ۗ") + i4) * 53;
                        i = ((iM3169 ^ i3) * 16681) ^ 1736438846;
                        i2 = 1849467410;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 1531522213:
                case 2073949273:
                    i12 = s + 1;
                    if (C2834.f9334 <= 0) {
                        iM3169 = C0773.m3169("᩸ܳ") ^ i4;
                        i = ((iM3169 ^ i3) * 28159) ^ 867275839;
                        i2 = 2128350819;
                    } else {
                        iM3169 = C0619.m2761("۠ܿ") ^ i3;
                        i = ((iM3169 ^ i4) * (-23255)) ^ (-558840694);
                        i2 = -769893236;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 1666243521:
                case 1964566464:
                    i11 = 48196;
                    iM3169 = (i4 - C0619.m2761("ۘۤ")) * 57;
                    i = ((iM3169 ^ i3) * 6847) ^ (-1605383506);
                    i2 = -1511891529;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 1744844759:
                case 2074132797:
                    c2 = 182;
                    if (RunnableC1848.f6235) {
                        iM3169 = C0773.m3169("ۢ᩷") ^ i3;
                        i = ((iM3169 ^ i4) * 15211) ^ 874627915;
                        i2 = 520909323;
                    } else {
                        iM3169 = C0773.m3169("᩹ۧ") ^ i4;
                        i = ((iM3169 ^ i3) * 30321) ^ 412378070;
                        i2 = -565658475;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                default:
                    C2834.m9335(C11235.m28300(sArr2, i7, i8, i11));
                    throw null;
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m3966(ViewOnClickListenerC1057 viewOnClickListenerC1057) {
        viewOnClickListenerC1057.m3968();
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0192 A[PHI: r9 r20
      0x0192: PHI (r9v11 int) = (r9v10 int), (r9v12 int) binds: [B:50:0x0190, B:40:0x012f] A[DONT_GENERATE, DONT_INLINE]
      0x0192: PHI (r20v11 java.lang.String) = (r20v10 java.lang.String), (r20v12 java.lang.String) binds: [B:50:0x0190, B:40:0x012f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x024c A[PHI: r9 r10 r11 r14 r15 r16 r17 r20
      0x024c: PHI (r9v14 int) = (r9v7 int), (r9v8 int), (r9v13 int), (r9v16 int) binds: [B:65:0x024a, B:61:0x0227, B:36:0x010b, B:29:0x00b3] A[DONT_GENERATE, DONT_INLINE]
      0x024c: PHI (r10v4 java.lang.String) = (r10v2 java.lang.String), (r10v2 java.lang.String), (r10v3 java.lang.String), (r10v2 java.lang.String) binds: [B:65:0x024a, B:61:0x0227, B:36:0x010b, B:29:0x00b3] A[DONT_GENERATE, DONT_INLINE]
      0x024c: PHI (r11v4 short[]) = (r11v3 short[]), (r11v2 short[]), (r11v2 short[]), (r11v2 short[]) binds: [B:65:0x024a, B:61:0x0227, B:36:0x010b, B:29:0x00b3] A[DONT_GENERATE, DONT_INLINE]
      0x024c: PHI (r14v7 char) = (r14v6 char), (r14v5 char), (r14v5 char), (r14v5 char) binds: [B:65:0x024a, B:61:0x0227, B:36:0x010b, B:29:0x00b3] A[DONT_GENERATE, DONT_INLINE]
      0x024c: PHI (r15v6 short) = (r15v4 short), (r15v5 short), (r15v4 short), (r15v4 short) binds: [B:65:0x024a, B:61:0x0227, B:36:0x010b, B:29:0x00b3] A[DONT_GENERATE, DONT_INLINE]
      0x024c: PHI (r16v5 int) = (r16v3 int), (r16v4 int), (r16v3 int), (r16v3 int) binds: [B:65:0x024a, B:61:0x0227, B:36:0x010b, B:29:0x00b3] A[DONT_GENERATE, DONT_INLINE]
      0x024c: PHI (r17v3 short) = (r17v1 short), (r17v2 short), (r17v1 short), (r17v1 short) binds: [B:65:0x024a, B:61:0x0227, B:36:0x010b, B:29:0x00b3] A[DONT_GENERATE, DONT_INLINE]
      0x024c: PHI (r20v14 java.lang.String) = (r20v4 java.lang.String), (r20v5 java.lang.String), (r20v13 java.lang.String), (r20v16 java.lang.String) binds: [B:65:0x024a, B:61:0x0227, B:36:0x010b, B:29:0x00b3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:82:0x02fe A[PHI: r9 r20
      0x02fe: PHI (r9v21 int) = (r9v3 int), (r9v6 int), (r9v22 int) binds: [B:81:0x02fc, B:69:0x027b, B:13:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x02fe: PHI (r20v19 java.lang.String) = (r20v0 java.lang.String), (r20v3 java.lang.String), (r20v20 java.lang.String) binds: [B:81:0x02fc, B:69:0x027b, B:13:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [l.ۚ۠᩻] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m3956(final TextInputLayout textInputLayout, final EditText editText, final ViewOnClickListenerC1057 viewOnClickListenerC1057, final View view, final EditText editText2) {
        int i;
        int iM3169;
        int i2;
        ?? r1;
        int iM31610;
        int i3;
        ?? r2;
        ?? r3;
        ?? r4 = 0;
        int i4 = AbstractC0641.f2496;
        int i5 = C4282.f15546;
        int iM31611 = C0773.m3169("֫᩶") ^ i5;
        String str = null;
        String strM5399 = null;
        short[] sArr = null;
        int i6 = iM31611 ^ 1515253688;
        int i7 = ((iM31611 ^ i4) * (-28435)) ^ 2039757970;
        int i8 = 1953990650;
        int i9 = 0;
        char c = 0;
        short s = 0;
        int i10 = 0;
        short s2 = 0;
        while (true) {
            i8 = i6 ^ ((((i8 ^ i4) * (-16945)) >> 31) & i7);
            switch (i8) {
                case -2118463085:
                case -556922737:
                    if (!RunnableC1848.f6235) {
                        int iM31612 = C0773.m3169("֡ۤ") ^ i5;
                        i7 = 1798035649 ^ ((iM31612 ^ i4) * 1155);
                        i6 = (-1700295214) ^ iM31612;
                        i8 = i8;
                    } else {
                        str = str;
                        i = i9;
                        r1 = r4;
                        iM3169 = (i4 - C0619.m2761("ᩴۤ")) * (-75);
                        i7 = 882055857 ^ ((iM3169 ^ i5) * (-6383));
                        i2 = 201496056;
                        r3 = r1;
                        i6 = i2 ^ iM3169;
                        i9 = i;
                        r2 = r3;
                        r4 = r2;
                        str = str;
                    }
                    break;
                case -2032960824:
                case 2129894022:
                    str = str;
                    i = i9;
                    if (C1321.m4852()) {
                        iM3169 = (C0773.m3169("ۖۢ") + i4) * 49;
                        i7 = (-1727490380) ^ ((iM3169 ^ i5) * (-2021));
                        i2 = 1773057502;
                        r3 = r4;
                    } else {
                        iM3169 = (C0773.m3169("᩶۬") ^ i4) * 9;
                        i7 = (-280069757) ^ ((iM3169 ^ i5) * (-4519));
                        i2 = -1881023598;
                        r3 = r4;
                    }
                    i6 = i2 ^ iM3169;
                    i9 = i;
                    r2 = r3;
                    r4 = r2;
                    str = str;
                    break;
                case -2017204003:
                case -1954326244:
                    str = str;
                    i = i9;
                    strM5399 = C1519.m5399(f3786, 43, 3, i);
                    if (C3077.f9998) {
                        iM3169 = (i5 - C0619.m2761("ܰۡ")) * (-7);
                        i7 = 1327550219 ^ ((iM3169 ^ i4) * (-2115));
                        i2 = 725155730;
                        r3 = r4;
                    } else {
                        iM3169 = C0619.m2761("ۛۘ") ^ i4;
                        i7 = (-1253980630) ^ ((iM3169 ^ i5) * 26327);
                        i2 = 1411073568;
                        r3 = r4;
                    }
                    i6 = i2 ^ iM3169;
                    i9 = i;
                    r2 = r3;
                    r4 = r2;
                    str = str;
                    break;
                case -2006643347:
                case 208086257:
                    str = str;
                    i = i9;
                    if (C17617.m41270(textInputLayout)) {
                        iM3169 = (i4 - C0773.m3169("᩶ۚ")) * (-101);
                        i7 = 1930016023 ^ ((iM3169 ^ i5) * (-18799));
                        i2 = -1479989496;
                        r3 = r4;
                    } else {
                        iM3169 = (i4 - C0619.m2761("ܶۜ")) * (-127);
                        i7 = 502786574 ^ ((iM3169 ^ i5) * 23125);
                        i2 = 1233193504;
                        r3 = r4;
                    }
                    i6 = i2 ^ iM3169;
                    i9 = i;
                    r2 = r3;
                    r4 = r2;
                    str = str;
                    break;
                case -1952964548:
                case -1020605992:
                    String strM4861 = C1321.m4861(f3786, 46, 3, i9);
                    if (C13473.m33144()) {
                        int iM2761 = C0619.m2761(strM4861) ^ 2121630515;
                        if (C0487.f2131 <= 0) {
                            str = str;
                            i = i9;
                            iM3169 = C0619.m2761("ۛۘ") ^ i4;
                            i7 = (-1253980630) ^ ((iM3169 ^ i5) * 26327);
                            i2 = 1411073568;
                            r3 = r4;
                            i6 = i2 ^ iM3169;
                            i9 = i;
                            r2 = r3;
                            r4 = r2;
                        } else {
                            final C13511 c13511 = new C13511(viewOnClickListenerC1057, iM2761);
                            C4282.m13648(c13511);
                            str = str;
                            i = i9;
                            InterfaceC15379 interfaceC15379 = new InterfaceC15379() { // from class: l.ۚ۠᩻
                                {
                                    int i11 = -1131705073;
                                    int i12 = C1080.f3865;
                                    int i13 = C23916.f77426;
                                    int iM2762 = C0619.m2761("ۖ᩶") ^ i12;
                                    int i14 = ((iM2762 ^ i13) * 26061) ^ (-1713131026);
                                    int i15 = 1232914685;
                                    while (true) {
                                        i11 = ((((i11 ^ i13) * 17971) >> 31) & i14) ^ (iM2762 ^ i15);
                                        switch (i11) {
                                            case -2121180684:
                                            case 75848658:
                                                if (C0269.f1558 <= 0) {
                                                    iM2762 = (i12 - C0773.m3169("᩹ۨ")) * (-65);
                                                    i14 = ((iM2762 ^ i13) * 1513) ^ 1522118901;
                                                    i15 = -603751045;
                                                } else {
                                                    iM2762 = (C0773.m3169("ᩳۜ") ^ i13) * (-95);
                                                    i14 = ((iM2762 ^ i12) * 28139) ^ (-707313326);
                                                    i15 = -996865495;
                                                }
                                                break;
                                            case -2043910642:
                                            case 366112136:
                                                C4238.m13540();
                                                throw new RuntimeException();
                                            case -1871787743:
                                            case 746653577:
                                                if (AbstractC3624.f12429 <= 0) {
                                                    iM2762 = (C0773.m3169("᩶᩵") + i13) * 83;
                                                    i14 = ((iM2762 ^ i12) * (-12607)) ^ (-1983574484);
                                                    i15 = 1204354727;
                                                } else {
                                                    iM2762 = (i13 - C0619.m2761("ۖ۠")) * (-83);
                                                    i14 = ((iM2762 ^ i12) * (-29865)) ^ (-2112820348);
                                                    i15 = -1178827297;
                                                }
                                                break;
                                            case -1843761035:
                                            case 1710873757:
                                                if (RunnableC0334.f1808 <= 0) {
                                                    iM2762 = (i12 - C0619.m2761("᩶᩺")) * 9;
                                                    i14 = ((iM2762 ^ i13) * 21) ^ 461650108;
                                                    i15 = 811020106;
                                                } else {
                                                    iM2762 = (C0773.m3169("ܺ᩷") ^ i12) * 101;
                                                    i14 = ((iM2762 ^ i13) * (-8267)) ^ 918605581;
                                                    i15 = 236146493;
                                                }
                                                break;
                                            case -1798483252:
                                            case 2114011454:
                                                if (AbstractC3624.f12429 <= 0) {
                                                    iM2762 = (i12 - C0619.m2761("᩶᩺")) * 9;
                                                    i14 = ((iM2762 ^ i13) * 21) ^ 461650108;
                                                    i15 = 811020106;
                                                } else {
                                                    iM2762 = (C0619.m2761("᩷۠") ^ i13) * (-61);
                                                    i14 = ((iM2762 ^ i12) * (-15869)) ^ (-1170778712);
                                                    i15 = -1697375700;
                                                }
                                                break;
                                            case -1786660947:
                                            case 120647204:
                                                if (C3099.m10095()) {
                                                    iM2762 = (i12 - C0619.m2761("᩶᩺")) * 9;
                                                    i14 = ((iM2762 ^ i13) * 21) ^ 461650108;
                                                    i15 = 811020106;
                                                } else {
                                                    iM2762 = (C0773.m3169("᩷ۜ") + i12) * (-25);
                                                    i14 = ((iM2762 ^ i13) * (-31873)) ^ 1653919873;
                                                    i15 = 108915543;
                                                }
                                                break;
                                            case -1722067576:
                                            case -69173306:
                                                if (RunnableC3055.f9898 < 0) {
                                                    iM2762 = C0773.m3169("۟ܽ") ^ i13;
                                                    i14 = ((iM2762 ^ i12) * (-2095)) ^ (-1342378515);
                                                    i15 = -95943751;
                                                } else {
                                                    iM2762 = (i12 - C0619.m2761("᩶᩺")) * 9;
                                                    i14 = ((iM2762 ^ i13) * 21) ^ 461650108;
                                                    i15 = 811020106;
                                                }
                                                break;
                                            case -1420471369:
                                            case -650571368:
                                                if (C0619.f2439) {
                                                    iM2762 = C0773.m3169("۟ܽ") ^ i13;
                                                    i14 = ((iM2762 ^ i12) * (-2095)) ^ (-1342378515);
                                                    i15 = -95943751;
                                                } else {
                                                    iM2762 = (i12 - C0773.m3169("۠۬")) * (-37);
                                                    i14 = ((iM2762 ^ i13) * 25107) ^ (-1888622162);
                                                    i15 = -633604331;
                                                }
                                                break;
                                            case -1062499311:
                                            case 116686012:
                                                if (C2419.m8174() < 0) {
                                                    iM2762 = (i12 - C0773.m3169("᩹ۨ")) * (-65);
                                                    i14 = ((iM2762 ^ i13) * 1513) ^ 1522118901;
                                                    i15 = -603751045;
                                                } else {
                                                    iM2762 = (C0773.m3169("᩶᩵") + i13) * 83;
                                                    i14 = ((iM2762 ^ i12) * (-12607)) ^ (-1983574484);
                                                    i15 = 1204354727;
                                                }
                                                break;
                                            case -624740445:
                                            case 1594777384:
                                                C23916.m53419();
                                                iM2762 = (i12 - C0619.m2761("᩶᩺")) * 9;
                                                i14 = ((iM2762 ^ i13) * 21) ^ 461650108;
                                                i15 = 811020106;
                                                break;
                                            case -500306026:
                                            case -365951719:
                                                if (C11235.f35427 >= 0) {
                                                    iM2762 = (C0619.m2761("ܶ۫") + i12) * 65;
                                                    i14 = ((iM2762 ^ i13) * (-15707)) ^ (-1943041447);
                                                    i15 = 745390357;
                                                } else {
                                                    iM2762 = C0773.m3169("ܽ֡") ^ i13;
                                                    i14 = ((iM2762 ^ i12) * 25621) ^ 1583745163;
                                                    i15 = 1037261750;
                                                }
                                                break;
                                            case -490847272:
                                            case 1403083036:
                                                if (C1826.f6190 <= 0) {
                                                    iM2762 = (C0619.m2761("ܶ۫") + i12) * 65;
                                                    i14 = ((iM2762 ^ i13) * (-15707)) ^ (-1943041447);
                                                    i15 = 745390357;
                                                } else {
                                                    iM2762 = C0773.m3169("᩹ܺ") ^ i13;
                                                    i14 = ((iM2762 ^ i12) * (-709)) ^ 1598139;
                                                    i15 = 385265406;
                                                }
                                                break;
                                            case 22768582:
                                            case 1649613041:
                                                if (C0773.f2792 <= 0) {
                                                    iM2762 = (i12 - C0619.m2761("᩶᩺")) * 9;
                                                    i14 = ((iM2762 ^ i13) * 21) ^ 461650108;
                                                    i15 = 811020106;
                                                } else {
                                                    iM2762 = (i12 - C0619.m2761("۬ۖ")) * (-97);
                                                    i14 = ((iM2762 ^ i13) * (-5695)) ^ 1110472187;
                                                    i15 = 129361626;
                                                }
                                                break;
                                            case 739690121:
                                            case 1262106007:
                                                return;
                                            case 991914283:
                                            case 1361989635:
                                                if (C0773.f2792 <= 0) {
                                                    iM2762 = (i12 - C0773.m3169("᩹ۨ")) * (-65);
                                                    i14 = ((iM2762 ^ i13) * 1513) ^ 1522118901;
                                                    i15 = -603751045;
                                                } else {
                                                    iM2762 = C0773.m3169("ۢ᩵") ^ i12;
                                                    i14 = ((iM2762 ^ i13) * 31553) ^ 736013865;
                                                    i15 = 970521315;
                                                }
                                                break;
                                            default:
                                                if (C1564.f5401 <= 0) {
                                                    iM2762 = (C0773.m3169("᩶᩵") + i13) * 83;
                                                    i14 = ((iM2762 ^ i12) * (-12607)) ^ (-1983574484);
                                                    i15 = 1204354727;
                                                } else {
                                                    iM2762 = (i12 - C0619.m2761("᩶᩺")) * 9;
                                                    i14 = ((iM2762 ^ i13) * 21) ^ 461650108;
                                                    i15 = 811020106;
                                                }
                                                break;
                                        }
                                    }
                                }

                                /* JADX WARN: Code duplicated, block: B:21:0x0068 A[PHI: r12 r13
                                  0x0068: PHI (r12v3 l.֨۠᩻) = (r12v2 l.֨۠᩻), (r12v1 l.֨۠᩻) binds: [B:20:0x0066, B:7:0x0041] A[DONT_GENERATE, DONT_INLINE]
                                  0x0068: PHI (r13v3 android.view.View) = (r13v2 android.view.View), (r13v1 android.view.View) binds: [B:20:0x0066, B:7:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
                                /* JADX WARN: Code duplicated, block: B:37:0x00fa  */
                                /* JADX WARN: Code duplicated, block: B:49:0x0160  */
                                /* JADX WARN: Code duplicated, block: B:53:0x018e  */
                                /* JADX WARN: Code duplicated, block: B:57:0x01bc A[PHI: r11 r15 r16
                                  0x01bc: PHI (r11v5 l.۬֨ᩴ) = (r11v3 l.۬֨ᩴ), (r11v3 l.۬֨ᩴ), (r11v3 l.۬֨ᩴ), (r11v7 l.۬֨ᩴ) binds: [B:56:0x01ba, B:40:0x0126, B:28:0x00bd, B:25:0x009a] A[DONT_GENERATE, DONT_INLINE]
                                  0x01bc: PHI (r15v4 android.widget.EditText) = 
                                  (r15v1 android.widget.EditText)
                                  (r15v1 android.widget.EditText)
                                  (r15v2 android.widget.EditText)
                                  (r15v1 android.widget.EditText)
                                 binds: [B:56:0x01ba, B:40:0x0126, B:28:0x00bd, B:25:0x009a] A[DONT_GENERATE, DONT_INLINE]
                                  0x01bc: PHI (r16v3 com.google.android.material.textfield.TextInputLayout) = 
                                  (r16v1 com.google.android.material.textfield.TextInputLayout)
                                  (r16v1 com.google.android.material.textfield.TextInputLayout)
                                  (r16v1 com.google.android.material.textfield.TextInputLayout)
                                  (r16v5 com.google.android.material.textfield.TextInputLayout)
                                 binds: [B:56:0x01ba, B:40:0x0126, B:28:0x00bd, B:25:0x009a] A[DONT_GENERATE, DONT_INLINE]] */
                                @Override // l.InterfaceC15379
                                /* JADX INFO: renamed from: ۙ */
                                public final void mo5773(C13778 c13778) {
                                    int iM31613;
                                    int i11;
                                    int i12 = 969518549;
                                    int i13 = C3099.f10023;
                                    int i14 = C20932.f66974;
                                    int iM31614 = (C0773.m3169("ۤۛ") + i13) * (-9);
                                    int i15 = ((iM31614 ^ i14) * 11351) ^ 1368103293;
                                    int i16 = iM31614 ^ 1690908661;
                                    EditText editText3 = null;
                                    TextInputLayout textInputLayout2 = null;
                                    C13511 c13512 = null;
                                    ViewOnClickListenerC1057 viewOnClickListenerC1058 = null;
                                    View view2 = null;
                                    while (true) {
                                        i12 = i16 ^ ((((i12 ^ i14) * (-6463)) >> 31) & i15);
                                        switch (i12) {
                                            case -2134286205:
                                            case 681518286:
                                                C2023.m6964();
                                                if (AbstractC3624.m11755() == 0) {
                                                    iM31613 = (C0619.m2761("᩶᩹") + i13) * 109;
                                                    i15 = ((iM31613 ^ i14) * (-27797)) ^ (-55566918);
                                                    i11 = -2091746343;
                                                } else {
                                                    iM31613 = C0619.m2761("ۚ᩶") ^ i14;
                                                    i15 = ((iM31613 ^ i13) * 13021) ^ 916899593;
                                                    i11 = 522961359;
                                                }
                                                i16 = iM31613 ^ i11;
                                                break;
                                            case -2117843218:
                                            case 921887521:
                                                if (C1146.f4234 >= 0) {
                                                    iM31613 = (i14 - C0619.m2761("ᩳ᩻")) * (-99);
                                                    i15 = ((iM31613 ^ i13) * 26125) ^ 166973006;
                                                    i11 = 1552605703;
                                                } else {
                                                    iM31613 = C0773.m3169("֫ܰ") ^ i14;
                                                    i15 = ((iM31613 ^ i13) * (-8053)) ^ (-401069540);
                                                    i11 = -2060705835;
                                                }
                                                i16 = iM31613 ^ i11;
                                                break;
                                            case -1920853833:
                                            case 1579290538:
                                                editText3 = editText2;
                                                if (C3099.m10095()) {
                                                    iM31613 = (i14 - C0619.m2761("ᩳ᩻")) * (-99);
                                                    i15 = ((iM31613 ^ i13) * 26125) ^ 166973006;
                                                    i11 = 1552605703;
                                                } else {
                                                    iM31613 = (C0773.m3169("᩵֫") + i14) * 9;
                                                    i15 = ((iM31613 ^ i13) * (-13841)) ^ 1451004322;
                                                    i11 = 1006234822;
                                                }
                                                i16 = iM31613 ^ i11;
                                                break;
                                            case -1784005770:
                                            case -104471431:
                                                if (C3779.f12953 <= 0) {
                                                    iM31613 = C0773.m3169("ۙ֫") ^ i13;
                                                    i15 = ((iM31613 ^ i14) * 2267) ^ 1322710457;
                                                    i11 = -468116061;
                                                } else {
                                                    iM31613 = C0619.m2761("ۡܰ") ^ i14;
                                                    i15 = ((iM31613 ^ i13) * (-23879)) ^ 1451065273;
                                                    i11 = -413192865;
                                                }
                                                i16 = iM31613 ^ i11;
                                                break;
                                            case -1344249419:
                                            case 747447115:
                                                if (C0950.f3488 >= 0) {
                                                    iM31613 = (C0619.m2761("᩶᩹") + i13) * 109;
                                                    i15 = ((iM31613 ^ i14) * (-27797)) ^ (-55566918);
                                                    i11 = -2091746343;
                                                } else {
                                                    iM31613 = C0773.m3169("ᩴ۠") ^ i13;
                                                    i15 = ((iM31613 ^ i14) * (-28587)) ^ 1247884133;
                                                    i11 = 28982660;
                                                }
                                                i16 = iM31613 ^ i11;
                                                break;
                                            case -1304463651:
                                            case -1171471799:
                                                if (C2288.f7433 <= 0) {
                                                    iM31613 = (i14 - C0619.m2761("ᩳ᩻")) * (-99);
                                                    i15 = ((iM31613 ^ i13) * 26125) ^ 166973006;
                                                    i11 = 1552605703;
                                                } else {
                                                    iM31613 = C0619.m2761("ۜۨ") ^ i13;
                                                    i15 = ((iM31613 ^ i14) * (-31339)) ^ 808051764;
                                                    i11 = -1583889037;
                                                }
                                                i16 = iM31613 ^ i11;
                                                break;
                                            case -1163265547:
                                            case 350785196:
                                                TextInputLayout textInputLayout3 = textInputLayout;
                                                c13512 = c13511;
                                                if (RunnableC3055.f9898 >= 0) {
                                                    textInputLayout2 = textInputLayout3;
                                                    iM31613 = (i14 - C0619.m2761("ᩳ᩻")) * (-99);
                                                    i15 = ((iM31613 ^ i13) * 26125) ^ 166973006;
                                                    i11 = 1552605703;
                                                    i16 = iM31613 ^ i11;
                                                } else {
                                                    int iM31615 = C0773.m3169("ܰ֡") ^ i13;
                                                    i15 = ((iM31615 ^ i14) * 287) ^ 39046280;
                                                    i16 = iM31615 ^ 748006148;
                                                    textInputLayout2 = textInputLayout3;
                                                }
                                                break;
                                            case -1135919401:
                                            case -137456571:
                                                C2287.m7745();
                                                break;
                                            case -845989451:
                                            case -492772864:
                                                if (C2288.m7767()) {
                                                    iM31613 = C0773.m3169("ۙ֫") ^ i13;
                                                    i15 = ((iM31613 ^ i14) * 2267) ^ 1322710457;
                                                    i11 = -468116061;
                                                } else {
                                                    iM31613 = (C0773.m3169("۫۫") + i13) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                                    i15 = ((iM31613 ^ i14) * (-22075)) ^ 1669396002;
                                                    i11 = 841159425;
                                                }
                                                i16 = iM31613 ^ i11;
                                                break;
                                            case -532475037:
                                            case 1453117975:
                                                if (C0269.f1558 <= 0) {
                                                    iM31613 = (C0773.m3169("᩵ܺ") ^ i14) * (-113);
                                                    i15 = ((iM31613 ^ i13) * 20337) ^ (-1974897122);
                                                    i11 = -455799117;
                                                } else {
                                                    iM31613 = (i13 - C0773.m3169("֫۟")) * (-63);
                                                    i15 = ((iM31613 ^ i14) * 27281) ^ 374957171;
                                                    i11 = -234999377;
                                                }
                                                i16 = iM31613 ^ i11;
                                                break;
                                            case -158986059:
                                            case 1959245299:
                                                viewOnClickListenerC1058 = viewOnClickListenerC1057;
                                                view2 = view;
                                                if (C3734.f12817 >= 0) {
                                                    iM31613 = C0619.m2761("ۚ᩶") ^ i14;
                                                    i15 = ((iM31613 ^ i13) * 13021) ^ 916899593;
                                                    i11 = 522961359;
                                                } else {
                                                    iM31613 = C0619.m2761("ۖۜ") ^ i14;
                                                    i15 = ((iM31613 ^ i13) * 8545) ^ (-228174989);
                                                    i11 = 232793691;
                                                }
                                                i16 = iM31613 ^ i11;
                                                break;
                                            case -116844004:
                                            case 904390550:
                                                C3690.m11987();
                                                if (C2288.f7433 <= 0) {
                                                    iM31613 = C0773.m3169("ۙ֫") ^ i13;
                                                    i15 = ((iM31613 ^ i14) * 2267) ^ 1322710457;
                                                    i11 = -468116061;
                                                } else {
                                                    iM31613 = (C0619.m2761("᩶᩹") + i13) * 109;
                                                    i15 = ((iM31613 ^ i14) * (-27797)) ^ (-55566918);
                                                    i11 = -2091746343;
                                                }
                                                i16 = iM31613 ^ i11;
                                                break;
                                            case 535777228:
                                            case 1514410566:
                                                if (C3033.f9831 >= 0) {
                                                    iM31613 = C0773.m3169("ۙ֫") ^ i13;
                                                    i15 = ((iM31613 ^ i14) * 2267) ^ 1322710457;
                                                    i11 = -468116061;
                                                } else {
                                                    iM31613 = (C0773.m3169("᩵ܺ") ^ i14) * (-113);
                                                    i15 = ((iM31613 ^ i13) * 20337) ^ (-1974897122);
                                                    i11 = -455799117;
                                                }
                                                i16 = iM31613 ^ i11;
                                                break;
                                            case 657208344:
                                            case 1065218254:
                                                ViewOnClickListenerC1057.m3960(c13512, viewOnClickListenerC1058, view2, editText, editText3, textInputLayout2, c13778);
                                                break;
                                            case 1236380112:
                                            case 1508638190:
                                                if (C3690.f12684 <= 0) {
                                                    iM31613 = (C0773.m3169("᩵ܺ") ^ i14) * (-113);
                                                    i15 = ((iM31613 ^ i13) * 20337) ^ (-1974897122);
                                                    i11 = -455799117;
                                                } else {
                                                    iM31613 = C0773.m3169("᩹ۚ") ^ i14;
                                                    i15 = ((iM31613 ^ i13) * (-9479)) ^ (-1651822074);
                                                    i11 = -896737177;
                                                }
                                                i16 = iM31613 ^ i11;
                                                break;
                                            default:
                                                C2878.m9491();
                                                iM31613 = C0773.m3169("ۙ֫") ^ i13;
                                                i15 = ((iM31613 ^ i14) * 2267) ^ 1322710457;
                                                i11 = -468116061;
                                                i16 = iM31613 ^ i11;
                                                break;
                                        }
                                        return;
                                    }
                                }
                            };
                            if (C0619.m2763()) {
                                r1 = interfaceC15379;
                            } else {
                                int iM31613 = (i4 - C0773.m3169("᩺᩺")) * (-5);
                                i7 = ((iM31613 ^ i5) * (-27773)) ^ (-1050555085);
                                i6 = iM31613 ^ 305085600;
                                i9 = i;
                                r4 = interfaceC15379;
                            }
                        }
                        str = str;
                    } else {
                        str = str;
                        i = i9;
                        r1 = r4;
                    }
                    iM3169 = (i4 - C0619.m2761("ᩴۤ")) * (-75);
                    i7 = 882055857 ^ ((iM3169 ^ i5) * (-6383));
                    i2 = 201496056;
                    r3 = r1;
                    i6 = i2 ^ iM3169;
                    i9 = i;
                    r2 = r3;
                    r4 = r2;
                    str = str;
                    break;
                case -1856632743:
                case 1034093316:
                    if (!C3998.m12920()) {
                        int iM31614 = C0773.m3169("֡ۤ") ^ i5;
                        i7 = 1798035649 ^ ((iM31614 ^ i4) * 1155);
                        i6 = (-1700295214) ^ iM31614;
                        i8 = i8;
                    } else {
                        str = str;
                        i = i9;
                        iM3169 = (C0773.m3169("᩶۬") ^ i4) * 9;
                        i7 = (-280069757) ^ ((iM3169 ^ i5) * (-4519));
                        i2 = -1881023598;
                        r3 = r4;
                        i6 = i2 ^ iM3169;
                        i9 = i;
                        r2 = r3;
                        r4 = r2;
                        str = str;
                    }
                    break;
                case -1741038136:
                case 232003169:
                    str = str;
                    i = i9;
                    s = sArr[c];
                    i10 = s * 33792;
                    s2 = 8448;
                    if (C1146.f4234 >= 0) {
                        iM3169 = C0619.m2761("ۛۘ") ^ i4;
                        i7 = (-1253980630) ^ ((iM3169 ^ i5) * 26327);
                        i2 = 1411073568;
                        r3 = r4;
                    } else {
                        iM3169 = (i4 - C0619.m2761("ۚܶ")) * (-121);
                        i7 = (-1970071930) ^ ((iM3169 ^ i5) * (-7837));
                        i2 = -1716205273;
                        r3 = r4;
                    }
                    i6 = i2 ^ iM3169;
                    i9 = i;
                    r2 = r3;
                    r4 = r2;
                    str = str;
                    break;
                case -1689716980:
                case 788523319:
                    i9 = 38689;
                    int iM2762 = C0619.m2761("ܿۧ") ^ i5;
                    i7 = 1653176805 ^ ((iM2762 ^ i4) * 7319);
                    i6 = (-1396288016) ^ iM2762;
                    r2 = r4;
                    r4 = r2;
                    str = str;
                    break;
                case -1664414798:
                case -636047686:
                    break;
                case -1590906632:
                case -1235768929:
                    str = str;
                    i = i9;
                    sArr = f3786;
                    c = '*';
                    if (C0619.f2439) {
                        iM3169 = C0619.m2761("ۛۘ") ^ i4;
                        i7 = (-1253980630) ^ ((iM3169 ^ i5) * 26327);
                        i2 = 1411073568;
                        r3 = r4;
                    } else {
                        iM3169 = C0619.m2761("֡ۡ") ^ i5;
                        i7 = (-1836808214) ^ ((iM3169 ^ i4) * (-15259));
                        i2 = -1130702915;
                        r3 = r4;
                    }
                    i6 = i2 ^ iM3169;
                    i9 = i;
                    r2 = r3;
                    r4 = r2;
                    str = str;
                    break;
                case -1590639796:
                case 1482539922:
                    if (C1321.f4751 >= 0) {
                        str = str;
                        i = i9;
                        iM3169 = C0619.m2761("᩷᩶") ^ i5;
                        i7 = 314832325 ^ ((iM3169 ^ i4) * 29013);
                        i2 = 419689166;
                        r3 = r4;
                        i6 = i2 ^ iM3169;
                        i9 = i;
                        r2 = r3;
                        r4 = r2;
                        str = str;
                    }
                    str = str;
                    i = i9;
                    iM3169 = (C0773.m3169("᩶۬") ^ i4) * 9;
                    i7 = (-280069757) ^ ((iM3169 ^ i5) * (-4519));
                    i2 = -1881023598;
                    r3 = r4;
                    i6 = i2 ^ iM3169;
                    i9 = i;
                    r2 = r3;
                    r4 = r2;
                    str = str;
                    break;
                case -1532469737:
                case -1112946880:
                    str = str;
                    i = i9;
                    if (viewOnClickListenerC1057.f3787.m55200()) {
                        iM3169 = (i4 - C0773.m3169("᩶ۚ")) * (-101);
                        i7 = 1930016023 ^ ((iM3169 ^ i5) * (-18799));
                        i2 = -1479989496;
                        r3 = r4;
                    } else {
                        iM3169 = C0619.m2761("۠ۤ") ^ i5;
                        i7 = 25244231 ^ ((iM3169 ^ i4) * (-7103));
                        i2 = -1355070675;
                        r3 = r4;
                    }
                    i6 = i2 ^ iM3169;
                    i9 = i;
                    r2 = r3;
                    r4 = r2;
                    str = str;
                    break;
                case -1246379460:
                case 1852702582:
                    C3033.m9845();
                    int iM31615 = C0773.m3169("֡ۤ") ^ i5;
                    i7 = 1798035649 ^ ((iM31615 ^ i4) * 1155);
                    i6 = (-1700295214) ^ iM31615;
                    i8 = i8;
                    break;
                case -1211338378:
                case -121166723:
                    str = str;
                    i = i9;
                    int i11 = s + s2;
                    if ((i11 * i11) - i10 >= 0) {
                        iM3169 = (C0773.m3169("ۜۖ") + i4) * (-127);
                        i7 = 1597170250 ^ ((iM3169 ^ i5) * 5155);
                        i2 = -956473271;
                        r3 = r4;
                    } else {
                        iM3169 = C0619.m2761("᩵ۜ") ^ i5;
                        i7 = (-754327013) ^ ((iM3169 ^ i4) * 12431);
                        i2 = -1075285218;
                        r3 = r4;
                    }
                    i6 = i2 ^ iM3169;
                    i9 = i;
                    r2 = r3;
                    r4 = r2;
                    str = str;
                    break;
                case -1106999388:
                case -199299095:
                    C2878.m9491();
                    break;
                case -866520302:
                case -292311335:
                    str = str;
                    i = i9;
                    if (C17202.m40372()) {
                        iM3169 = (C0619.m2761("֫ۛ") ^ i4) * (-121);
                        i7 = (-6560768) ^ ((iM3169 ^ i5) * 10821);
                        i2 = -686428367;
                        r3 = r4;
                    } else {
                        iM3169 = (C0773.m3169("᩶۬") ^ i4) * 9;
                        i7 = (-280069757) ^ ((iM3169 ^ i5) * (-4519));
                        i2 = -1881023598;
                        r3 = r4;
                    }
                    i6 = i2 ^ iM3169;
                    i9 = i;
                    r2 = r3;
                    r4 = r2;
                    str = str;
                    break;
                case -736578549:
                case 1796378256:
                    str = str;
                    i = i9;
                    if (C1343.f4799 != 0) {
                        iM3169 = C0619.m2761("᩷᩶") ^ i5;
                        i7 = 314832325 ^ ((iM3169 ^ i4) * 29013);
                        i2 = 419689166;
                        r3 = r4;
                    } else {
                        iM3169 = (C0619.m2761("۟᩺") + i5) * (-119);
                        i7 = (-681591039) ^ ((iM3169 ^ i4) * 14133);
                        i2 = 434206153;
                        r3 = r4;
                    }
                    i6 = i2 ^ iM3169;
                    i9 = i;
                    r2 = r3;
                    r4 = r2;
                    str = str;
                    break;
                case -647963867:
                case 2005281252:
                    i9 = 28441;
                    int iM2763 = C0619.m2761("ܿۧ") ^ i5;
                    i7 = 1653176805 ^ ((iM2763 ^ i4) * 7319);
                    i6 = (-1396288016) ^ iM2763;
                    r2 = r4;
                    r4 = r2;
                    str = str;
                    break;
                case -89841280:
                case 2127531997:
                    str = str;
                    i = i9;
                    r1 = r4;
                    if (C20932.f66974 <= 0) {
                        iM3169 = (i4 - C0619.m2761("ᩴۤ")) * (-75);
                        i7 = 882055857 ^ ((iM3169 ^ i5) * (-6383));
                        i2 = 201496056;
                        r3 = r1;
                    } else {
                        iM3169 = C0773.m3169("ۚᩴ") ^ i5;
                        i7 = 976594094 ^ ((iM3169 ^ i4) * 18777);
                        i2 = 1337057119;
                        r3 = r4;
                    }
                    i6 = i2 ^ iM3169;
                    i9 = i;
                    r2 = r3;
                    r4 = r2;
                    str = str;
                    break;
                case 951121964:
                case 1540071974:
                    ReentrantLock reentrantLock = C11650.f37690;
                    C2966.m9674(new C4939(str, viewOnClickListenerC1057, r4));
                    break;
                case 1452508015:
                case 1778246572:
                    int i12 = i9;
                    String strM4058 = C1080.m4058(C3998.m12928(editText));
                    if (C21766.m49335(strM4058)) {
                        iM31610 = (C0773.m3169("᩸ܿ") + i4) * 95;
                        i7 = ((iM31610 ^ i5) * 28383) ^ (-495144359);
                        i3 = 584945072;
                    } else {
                        iM31610 = C0773.m3169("ۚۧ") ^ i5;
                        i7 = ((iM31610 ^ i4) * 9435) ^ (-168028753);
                        i3 = -1356841660;
                    }
                    i6 = iM31610 ^ i3;
                    i9 = i12;
                    str = strM4058;
                    i8 = i8;
                    break;
                default:
                    C11235.m28302(textInputLayout, C0773.m3169(strM5399) ^ 2124293770);
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:67:0x02c7 A[PHI: r3 r12 r15 r25 r29 r30
      0x02c7: PHI (r3v6 l.۬֨ᩴ) = (r3v3 l.۬֨ᩴ), (r3v2 l.۬֨ᩴ), (r3v2 l.۬֨ᩴ) binds: [B:66:0x02c5, B:57:0x0271, B:15:0x00a6] A[DONT_GENERATE, DONT_INLINE]
      0x02c7: PHI (r12v6 l.ۖۖۧ) = (r12v2 l.ۖۖۧ), (r12v3 l.ۖۖۧ), (r12v2 l.ۖۖۧ) binds: [B:66:0x02c5, B:57:0x0271, B:15:0x00a6] A[DONT_GENERATE, DONT_INLINE]
      0x02c7: PHI (r15v6 java.lang.String) = (r15v2 java.lang.String), (r15v3 java.lang.String), (r15v2 java.lang.String) binds: [B:66:0x02c5, B:57:0x0271, B:15:0x00a6] A[DONT_GENERATE, DONT_INLINE]
      0x02c7: PHI (r25v45 int) = (r25v22 int), (r25v23 int), (r25v46 int) binds: [B:66:0x02c5, B:57:0x0271, B:15:0x00a6] A[DONT_GENERATE, DONT_INLINE]
      0x02c7: PHI (r29v44 java.lang.Object) = (r29v30 java.lang.Object), (r29v31 java.lang.Object), (r29v45 java.lang.Object) binds: [B:66:0x02c5, B:57:0x0271, B:15:0x00a6] A[DONT_GENERATE, DONT_INLINE]
      0x02c7: PHI (r30v38 int) = (r30v27 int), (r30v28 int), (r30v39 int) binds: [B:66:0x02c5, B:57:0x0271, B:15:0x00a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    private final void m3985() {
        int iM2761;
        int i;
        int iM2762;
        int i2;
        int i3;
        short[] sArr;
        int i4;
        int i5;
        short[] sArr2;
        int i6;
        int i7;
        Object[] objArr;
        int iM3169;
        int i8;
        int i9;
        int iM2763;
        int i10;
        int iM2764;
        int i11;
        int i12;
        int iM31610;
        int i13;
        int i14;
        this = this;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        Integer numM3159 = null;
        String strM6246 = null;
        Object[] objArr2 = null;
        String strM33142 = null;
        C2361 c2361M3794 = null;
        Object obj = null;
        int iM2765 = 0;
        String strM4861 = null;
        short s = 0;
        int i18 = 0;
        int i19 = -1635945288;
        int i20 = AbstractC0641.f2496;
        int i21 = C2375.f7641;
        int iM31611 = (i20 - C0773.m3169("ܳۙ")) * (-3);
        int i22 = ((iM31611 ^ i21) * (-29455)) ^ 2042691975;
        int i23 = iM31611 ^ (-1652114565);
        Object[] objArr3 = null;
        short[] sArr3 = null;
        int i24 = 0;
        boolean zM44080 = false;
        int i25 = 0;
        int i26 = 0;
        C21962 c21962M8361 = null;
        while (true) {
            C13511 c13511 = null;
            while (true) {
                i19 = i23 ^ (i22 & (((i19 ^ i21) * (-26439)) >> 31));
                switch (i19) {
                    case -1984094009:
                    case 1186854954:
                        i17 = i17;
                        obj = obj;
                        i4 = iM2765;
                        Object[] objArr4 = new Object[i15];
                        objArr4[i16] = C0773.m3159(i17);
                        sArr3 = f3786;
                        i26 = 410;
                        i25 = 3;
                        if (C1826.f6190 <= 0) {
                            objArr3 = objArr4;
                            int iM2766 = (C0619.m2761("ܽܺ") ^ i20) * 15;
                            i22 = ((iM2766 ^ i21) * 16063) ^ (-268346158);
                            i5 = iM2766 ^ 1779533680;
                        } else {
                            int iM31612 = C0773.m3169("᩺۟") ^ i20;
                            int i27 = ((iM31612 ^ i21) * 21581) ^ (-1515961500);
                            i5 = iM31612 ^ (-1465666490);
                            objArr3 = objArr4;
                            i22 = i27;
                        }
                        i17 = i17;
                        obj = obj;
                        iM2765 = i4;
                        i23 = i5;
                        this = this;
                        break;
                    case -1864367031:
                    case -1394863497:
                        obj = obj;
                        int i28 = iM2765;
                        C21962 c21962 = c21962M8361;
                        objArr3 = objArr3;
                        short[] sArr4 = sArr3;
                        int i29 = i25;
                        int i30 = i17;
                        int i31 = i26;
                        if (zM44080) {
                            iM2762 = (C0619.m2761("᩶ۧ") ^ i20) * 15;
                            i2 = ((iM2762 ^ i21) * (-9181)) ^ (-174509379);
                            i3 = 688299806;
                        } else {
                            iM2762 = (i21 - C0619.m2761("֡᩻")) * (-123);
                            i2 = ((iM2762 ^ i20) * 5903) ^ 1650735978;
                            i3 = -1613577775;
                        }
                        i23 = iM2762 ^ i3;
                        c21962M8361 = c21962;
                        i22 = i2;
                        i26 = i31;
                        i25 = i29;
                        i17 = i30;
                        sArr3 = sArr4;
                        iM2765 = i28;
                        i16 = 0;
                        objArr3 = objArr3;
                        obj = obj;
                        break;
                    case -1764695457:
                    case 1062919395:
                        C20448 c20448 = new C20448(c13511, this);
                        ReentrantLock reentrantLock = C11650.f37690;
                        C3077.m10038(new Thread(new RunnableC11879(4, this, c20448)));
                        break;
                    case -1726722399:
                    case 875340889:
                        obj = obj;
                        iM2765 = iM2765;
                        objArr3 = objArr3;
                        sArr3 = sArr3;
                        i25 = i25;
                        i17 = i17;
                        i26 = i26;
                        zM44080 = C18978.m44080();
                        i15 = 1;
                        ReentrantLock reentrantLock2 = C11650.f37690;
                        if (zM44080) {
                            iM2761 = (C0773.m3169("ۡۚ") ^ i20) * 93;
                            i22 = ((iM2761 ^ i21) * 23531) ^ (-185433729);
                            i = 1945457721;
                        } else {
                            iM2761 = C0619.m2761("ܳ᩷") ^ i21;
                            i22 = ((iM2761 ^ i20) * (-2325)) ^ 588609506;
                            i = 778352749;
                        }
                        i23 = iM2761 ^ i;
                        i26 = i26;
                        i25 = i25;
                        i17 = i17;
                        sArr3 = sArr3;
                        iM2765 = iM2765;
                        objArr3 = objArr3;
                        obj = obj;
                        break;
                    case -1673408861:
                    case 578099729:
                        sArr2 = sArr3;
                        i6 = i25;
                        i7 = i26;
                        objArr = objArr3;
                        strM33142 = C13473.m33142(this, C0773.m3169(AbstractC0641.m2820(sArr2, i7, i6, i24)) ^ 2099904193, objArr);
                        int iM31613 = C0773.m3169("᩶ܶ") ^ i20;
                        sArr3 = sArr2;
                        i26 = i7;
                        i25 = i6;
                        objArr3 = objArr;
                        i17 = i17;
                        obj = obj;
                        i22 = ((iM31613 ^ i21) * 5395) ^ 606566275;
                        i23 = iM31613 ^ 1200060849;
                        iM2765 = iM2765;
                        this = this;
                        break;
                    case -1635275339:
                    case 1990120055:
                        obj = obj;
                        iM2765 = iM2765;
                        C21962 c21963 = c21962M8361;
                        objArr3 = objArr3;
                        short[] sArr5 = sArr3;
                        i25 = i25;
                        i17 = i17;
                        i26 = i26;
                        if (i17 > i15) {
                            sArr3 = sArr5;
                            c21962M8361 = c21963;
                            iM2761 = (C0773.m3169("۬ۢ") + i20) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                            i22 = ((iM2761 ^ i21) * (-26389)) ^ 1790409829;
                            i = 864067167;
                            i23 = iM2761 ^ i;
                            i26 = i26;
                            i25 = i25;
                            i17 = i17;
                            sArr3 = sArr3;
                            iM2765 = iM2765;
                            objArr3 = objArr3;
                            obj = obj;
                        } else {
                            int iM31614 = C0773.m3169("ᩴܶ") ^ i21;
                            sArr3 = sArr5;
                            i22 = ((iM31614 ^ i20) * 20727) ^ (-696773724);
                            i23 = iM31614 ^ (-1565332591);
                            c21962M8361 = c21963;
                            i26 = i26;
                            i25 = i25;
                            i17 = i17;
                            sArr3 = sArr3;
                            iM2765 = iM2765;
                            objArr3 = objArr3;
                            obj = obj;
                        }
                        break;
                    case -1588607126:
                    case 724350585:
                        i17 = i17;
                        obj = obj;
                        String strM6247 = C1783.m6246(this, C0619.m2761(C2288.m7761(f3786, 425, 3, i24)) ^ 2102427320);
                        if (C3492.f12043 > 0) {
                            StringBuilder sb = new StringBuilder();
                            C1783.m6234(sb, strM33142);
                            i4 = iM2765;
                            C3779.m12258(sb, C2310.m7803(f3786, 428, 2, i24));
                            C1783.m6234(sb, strM6247);
                            C1519.m5410(c2361M3794, C2023.m6952(sb));
                            if (C2288.f7433 <= 0) {
                                iM2763 = (i21 - C0619.m2761("֨ۤ")) * (-57);
                                i8 = ((iM2763 ^ i20) * 17341) ^ 947184959;
                                i10 = -1255341619;
                            } else {
                                iM2763 = C0619.m2761("֫֡") ^ i21;
                                i8 = ((iM2763 ^ i20) * (-31345)) ^ (-1598816595);
                                i10 = -1187024834;
                            }
                            i12 = iM2763 ^ i10;
                            obj = obj;
                            iM2765 = i4;
                            int i32 = i17;
                            i23 = i12;
                            i22 = i8;
                            i17 = i32;
                        } else {
                            i4 = iM2765;
                            int iM2767 = (C0619.m2761("ܽܺ") ^ i20) * 15;
                            i22 = ((iM2767 ^ i21) * 16063) ^ (-268346158);
                            i5 = iM2767 ^ 1779533680;
                            i17 = i17;
                            obj = obj;
                            iM2765 = i4;
                            i23 = i5;
                            this = this;
                        }
                        break;
                    case -1557137265:
                    case -116770709:
                        C2419.m8168(c2361M3794, C0619.m2761(C2419.m8166(f3786, 436, 3, i24)) ^ 2130526970, obj);
                        iM3169 = C0773.m3169("ۡᩴ") ^ i21;
                        i8 = ((iM3169 ^ i20) * (-14839)) ^ (-719498146);
                        i9 = 889594237;
                        i12 = iM3169 ^ i9;
                        obj = obj;
                        int i33 = i17;
                        i23 = i12;
                        i22 = i8;
                        i17 = i33;
                        break;
                    case -1511415193:
                    case -672537911:
                        objArr2[i16] = numM3159;
                        objArr2[i15] = strM6246;
                        strM33142 = C2485.m8354(this, C0619.m2761(C4238.m13530(f3786, 416, 3, i24)) ^ 2119661619, objArr2);
                        objArr = objArr3;
                        sArr2 = sArr3;
                        i6 = i25;
                        i7 = i26;
                        int iM31615 = C0773.m3169("᩶ܶ") ^ i20;
                        sArr3 = sArr2;
                        i26 = i7;
                        i25 = i6;
                        objArr3 = objArr;
                        i17 = i17;
                        obj = obj;
                        i22 = ((iM31615 ^ i21) * 5395) ^ 606566275;
                        i23 = iM31615 ^ 1200060849;
                        iM2765 = iM2765;
                        this = this;
                        break;
                    case -1492883348:
                    case 1337230758:
                        if (C0862.f3233 != 0) {
                            obj = obj;
                            iM2765 = iM2765;
                            objArr3 = objArr3;
                            sArr3 = sArr3;
                            i25 = i25;
                            i17 = i17;
                            i26 = i26;
                            iM2761 = (C0619.m2761("ۙۖ") + i21) * 33;
                            i22 = ((iM2761 ^ i20) * (-2245)) ^ 1294703735;
                            i = 1216094201;
                            i23 = iM2761 ^ i;
                            i26 = i26;
                            i25 = i25;
                            i17 = i17;
                            sArr3 = sArr3;
                            iM2765 = iM2765;
                            objArr3 = objArr3;
                            obj = obj;
                        } else {
                            iM31610 = C0773.m3169("۠ۗ") ^ i20;
                            i13 = ((iM31610 ^ i21) * (-4367)) ^ (-445039262);
                            i14 = -1957007277;
                            i23 = iM31610 ^ i14;
                            i22 = i13;
                        }
                        break;
                    case -1403465503:
                    case -697350998:
                        i17 = i17;
                        obj = obj;
                        i4 = iM2765;
                        int iM2768 = C0619.m2761(C1080.m4056(f3786, 419, 3, i24));
                        if (AbstractC0641.f2496 < 0) {
                            c13511 = new C13511(this, iM2768 ^ 2129398708);
                            C4282.m13648(c13511);
                            if (C3779.f12953 <= 0) {
                                iM2763 = (C0773.m3169("۠᩶") ^ i20) * (-11);
                                i8 = ((iM2763 ^ i21) * 27779) ^ 1129421619;
                                i10 = 1558904397;
                            } else {
                                iM2763 = (C0773.m3169("۬ۧ") + i21) * (-91);
                                i8 = ((iM2763 ^ i20) * 29329) ^ (-1539723094);
                                i10 = -498951141;
                            }
                            i12 = iM2763 ^ i10;
                            obj = obj;
                            iM2765 = i4;
                            int i34 = i17;
                            i23 = i12;
                            i22 = i8;
                            i17 = i34;
                        } else {
                            iM2765 = i4;
                        }
                        break;
                    case -1363697391:
                    case 1104698039:
                        C2375.m8070(C0269.m1782(C3099.m10090(c2361M3794)), new ViewOnClickListenerC6278(i16, this));
                        break;
                    case -1301947022:
                    case 194159219:
                        i17 = i17;
                        obj = obj;
                        numM3159 = C0773.m3159(i17);
                        iM2765 = C0619.m2761(C0862.m3500(f3786, 413, 3, i24));
                        if (C1080.f3865 < 0) {
                            iM3169 = (C0773.m3169("֫ۙ") ^ i21) * (-101);
                            i8 = ((iM3169 ^ i20) * (-7807)) ^ (-1693623096);
                            i9 = 433403925;
                            i12 = iM3169 ^ i9;
                            obj = obj;
                            int i35 = i17;
                            i23 = i12;
                            i22 = i8;
                            i17 = i35;
                        }
                        break;
                    case -1231638764:
                    case 1488027055:
                        C2834.m9344();
                        C1321.m4852();
                        iM31610 = C0773.m3169("۠ۗ") ^ i20;
                        i13 = ((iM31610 ^ i21) * (-4367)) ^ (-445039262);
                        i14 = -1957007277;
                        i23 = iM31610 ^ i14;
                        i22 = i13;
                        break;
                    case -1220676216:
                    case 26164822:
                        C3033.m9845();
                        C23916.m53419();
                        break;
                    case -1039709369:
                    case 546859573:
                        obj = obj;
                        iM2765 = iM2765;
                        objArr3 = objArr3;
                        sArr3 = sArr3;
                        i25 = i25;
                        i17 = i17;
                        i26 = i26;
                        s = f3786[409];
                        i18 = s * 2;
                        if (C23916.f77426 <= 0) {
                            iM2761 = (C0619.m2761("ۙۖ") + i21) * 33;
                            i22 = ((iM2761 ^ i20) * (-2245)) ^ 1294703735;
                            i = 1216094201;
                        } else {
                            iM2761 = C0619.m2761("ۢۜ") ^ i20;
                            i22 = ((iM2761 ^ i21) * 27123) ^ 709732552;
                            i = -1741742099;
                        }
                        i23 = iM2761 ^ i;
                        i26 = i26;
                        i25 = i25;
                        i17 = i17;
                        sArr3 = sArr3;
                        iM2765 = iM2765;
                        objArr3 = objArr3;
                        obj = obj;
                        break;
                    case -1033583061:
                    case 1217410033:
                        if (C2419.f7754 < 0) {
                            iM31610 = (C0619.m2761("ۚ᩸") + i21) * (-127);
                            i13 = ((iM31610 ^ i20) * 637) ^ 518930272;
                            i14 = -669538549;
                            i23 = iM31610 ^ i14;
                            i22 = i13;
                        } else {
                            i17 = i17;
                            obj = obj;
                        }
                        break;
                    case -1018128031:
                    case -821451459:
                        int i36 = i17;
                        obj = obj;
                        iM2765 = iM2765;
                        C21962 c21964 = c21962M8361;
                        objArr3 = objArr3;
                        sArr = sArr3;
                        i25 = i25;
                        i26 = i26;
                        try {
                            i17 = c21964.f70882;
                            c21962M8361 = c21964;
                            sArr3 = sArr;
                            iM2761 = C0619.m2761("ۜۨ") ^ i20;
                            i22 = ((iM2761 ^ i21) * (-3765)) ^ 1682751113;
                            i = 1878120137;
                        } catch (IOException unused) {
                            c21962M8361 = c21964;
                            sArr3 = sArr;
                            i17 = i36;
                            iM2761 = (C0773.m3169("ۖ᩻") ^ i20) * (-69);
                            i22 = ((iM2761 ^ i21) * 31481) ^ 100013824;
                            i = -34908463;
                        }
                        i23 = iM2761 ^ i;
                        i26 = i26;
                        i25 = i25;
                        i17 = i17;
                        sArr3 = sArr3;
                        iM2765 = iM2765;
                        objArr3 = objArr3;
                        obj = obj;
                        break;
                    case -991600777:
                    case 1522193840:
                        obj = obj;
                        iM2765 = iM2765;
                        objArr3 = objArr3;
                        sArr3 = sArr3;
                        i25 = i25;
                        i26 = i26;
                        i17 = C25077.f81096;
                        iM2761 = C0619.m2761("ۜۨ") ^ i20;
                        i22 = ((iM2761 ^ i21) * (-3765)) ^ 1682751113;
                        i = 1878120137;
                        i23 = iM2761 ^ i;
                        i26 = i26;
                        i25 = i25;
                        i17 = i17;
                        sArr3 = sArr3;
                        iM2765 = iM2765;
                        objArr3 = objArr3;
                        obj = obj;
                        break;
                    case -926459346:
                    case 33603522:
                        i24 = 3560;
                        iM2761 = C0773.m3169("ۧۧ") ^ i20;
                        i22 = ((iM2761 ^ i21) * (-7289)) ^ 219434645;
                        i = 331417523;
                        i23 = iM2761 ^ i;
                        i26 = i26;
                        i25 = i25;
                        i17 = i17;
                        sArr3 = sArr3;
                        iM2765 = iM2765;
                        objArr3 = objArr3;
                        obj = obj;
                        break;
                    case -872795653:
                    case 479104614:
                        obj = obj;
                        iM2765 = iM2765;
                        objArr3 = objArr3;
                        sArr3 = sArr3;
                        i25 = i25;
                        i17 = i17;
                        i26 = i26;
                        try {
                            c21962M8361 = C2485.m8361();
                            iM2761 = (i21 - C0773.m3169("ܰܳ")) * (-37);
                            i22 = ((iM2761 ^ i20) * 18091) ^ 1687562931;
                            i = 1417222697;
                        } catch (IOException unused2) {
                            iM2761 = (C0773.m3169("ۖ᩻") ^ i20) * (-69);
                            i22 = ((iM2761 ^ i21) * 31481) ^ 100013824;
                            i = -34908463;
                        }
                        i23 = iM2761 ^ i;
                        i26 = i26;
                        i25 = i25;
                        i17 = i17;
                        sArr3 = sArr3;
                        iM2765 = iM2765;
                        objArr3 = objArr3;
                        obj = obj;
                        break;
                    case -850274365:
                    case 1848219025:
                        i17 = i17;
                        obj = obj;
                        i4 = iM2765;
                        RunnableC3646.m11808(strM33142);
                        c2361M3794 = C0950.m3794(this);
                        strM4861 = C1321.m4861(f3786, 422, 3, i24);
                        if (C0487.m2356() >= 0) {
                            iM2763 = (C0773.m3169("۠᩶") ^ i20) * (-11);
                            i8 = ((iM2763 ^ i21) * 27779) ^ 1129421619;
                            i10 = 1558904397;
                        } else {
                            iM2763 = C0773.m3169("۟۫") ^ i21;
                            i8 = ((iM2763 ^ i20) * 7383) ^ (-245494455);
                            i10 = 1335494723;
                        }
                        i12 = iM2763 ^ i10;
                        obj = obj;
                        iM2765 = i4;
                        int i37 = i17;
                        i23 = i12;
                        i22 = i8;
                        i17 = i37;
                        break;
                    case -840871663:
                    case 636581839:
                        i17 = i17;
                        obj = null;
                        C11235.m28307(c2361M3794, C0773.m3169(RunnableC1848.m6366(f3786, 430, 3, i24)) ^ 2119671069, null);
                        if (zM44080) {
                            iM2764 = C0773.m3169("ܰۗ") ^ i20;
                            i8 = ((iM2764 ^ i21) * (-29319)) ^ (-432352216);
                            i11 = 1944012862;
                        } else {
                            iM2764 = C0619.m2761("ۙܶ") ^ i20;
                            i8 = ((iM2764 ^ i21) * (-25021)) ^ (-1213032765);
                            i11 = -381490761;
                        }
                        i12 = iM2764 ^ i11;
                        int i38 = i17;
                        i23 = i12;
                        i22 = i8;
                        i17 = i38;
                        break;
                    case -586518308:
                    case 111729069:
                        C2310.m7813();
                        if (C1519.m5403()) {
                            i17 = i17;
                            obj = obj;
                        }
                        i17 = i17;
                        obj = obj;
                        i4 = iM2765;
                        iM2763 = (C0773.m3169("۠᩶") ^ i20) * (-11);
                        i8 = ((iM2763 ^ i21) * 27779) ^ 1129421619;
                        i10 = 1558904397;
                        i12 = iM2763 ^ i10;
                        obj = obj;
                        iM2765 = i4;
                        int i39 = i17;
                        i23 = i12;
                        i22 = i8;
                        i17 = i39;
                        break;
                    case -518592664:
                    case 1334629083:
                        obj = obj;
                        iM2765 = iM2765;
                        C21962 c21965 = c21962M8361;
                        objArr3 = objArr3;
                        sArr3 = sArr3;
                        i25 = i25;
                        i17 = i17;
                        i26 = i26;
                        if (c21965 != null) {
                            int iM31616 = (i21 - C0773.m3169("֡۬")) * (-15);
                            c21962M8361 = c21965;
                            i23 = iM31616 ^ (-441485489);
                            i22 = ((iM31616 ^ i20) * (-27123)) ^ 713428592;
                            i26 = i26;
                            i25 = i25;
                            i17 = i17;
                            sArr3 = sArr3;
                            iM2765 = iM2765;
                            objArr3 = objArr3;
                            obj = obj;
                        } else {
                            c21962M8361 = c21965;
                            iM2761 = (C0773.m3169("ۖ᩻") ^ i20) * (-69);
                            i22 = ((iM2761 ^ i21) * 31481) ^ 100013824;
                            i = -34908463;
                            i23 = iM2761 ^ i;
                            i26 = i26;
                            i25 = i25;
                            i17 = i17;
                            sArr3 = sArr3;
                            iM2765 = iM2765;
                            objArr3 = objArr3;
                            obj = obj;
                        }
                        break;
                    case -484510249:
                    case 374212717:
                        if (C1783.f6087 > 0) {
                            i17 = i17;
                            obj = obj;
                            i4 = iM2765;
                            iM2763 = (C0773.m3169("۠᩶") ^ i20) * (-11);
                            i8 = ((iM2763 ^ i21) * 27779) ^ 1129421619;
                            i10 = 1558904397;
                            i12 = iM2763 ^ i10;
                            obj = obj;
                            iM2765 = i4;
                            int i310 = i17;
                            i23 = i12;
                            i22 = i8;
                            i17 = i310;
                        } else {
                            iM31610 = C0773.m3169("۠ۗ") ^ i20;
                            i13 = ((iM31610 ^ i21) * (-4367)) ^ (-445039262);
                            i14 = -1957007277;
                            i23 = iM31610 ^ i14;
                            i22 = i13;
                        }
                        break;
                    case -305106218:
                    case 1612994519:
                        i24 = 26837;
                        iM2761 = C0773.m3169("ۧۧ") ^ i20;
                        i22 = ((iM2761 ^ i21) * (-7289)) ^ 219434645;
                        i = 331417523;
                        i23 = iM2761 ^ i;
                        i26 = i26;
                        i25 = i25;
                        i17 = i17;
                        sArr3 = sArr3;
                        iM2765 = iM2765;
                        objArr3 = objArr3;
                        obj = obj;
                        break;
                    case -41349992:
                    case 1850716079:
                        i17 = i17;
                        obj = obj;
                        i4 = iM2765;
                        strM6246 = C1783.m6246(this, i4 ^ 2118963821);
                        objArr2 = new Object[2];
                        if (!C2966.m9664()) {
                            int iM2769 = (C0619.m2761("ܽܺ") ^ i20) * 15;
                            i22 = ((iM2769 ^ i21) * 16063) ^ (-268346158);
                            i5 = iM2769 ^ 1779533680;
                            i17 = i17;
                            obj = obj;
                            iM2765 = i4;
                            i23 = i5;
                            this = this;
                        } else {
                            iM2763 = (C0619.m2761("۟ۡ") ^ i20) * 85;
                            i8 = ((iM2763 ^ i21) * 4495) ^ 1567391817;
                            i10 = -1120188105;
                            i12 = iM2763 ^ i10;
                            obj = obj;
                            iM2765 = i4;
                            int i311 = i17;
                            i23 = i12;
                            i22 = i8;
                            i17 = i311;
                        }
                        break;
                    case 318395941:
                    case 998700782:
                        obj = obj;
                        iM2765 = iM2765;
                        objArr3 = objArr3;
                        sArr3 = sArr3;
                        i25 = i25;
                        i17 = i17;
                        i26 = i26;
                        int i40 = s + 1;
                        if ((i40 * i40) - (i18 + 1) < 0) {
                            iM2761 = C0773.m3169("ܳۢ") ^ i21;
                            i22 = ((iM2761 ^ i20) * (-20663)) ^ 1742972232;
                            i = 1994313140;
                        } else {
                            iM2761 = C0619.m2761("ܽ᩶") ^ i21;
                            i22 = ((iM2761 ^ i20) * (-28035)) ^ 1747475979;
                            i = -1727128458;
                        }
                        i23 = iM2761 ^ i;
                        i26 = i26;
                        i25 = i25;
                        i17 = i17;
                        sArr3 = sArr3;
                        iM2765 = iM2765;
                        objArr3 = objArr3;
                        obj = obj;
                        break;
                    case 523634477:
                    case 1413039097:
                        if (!C3492.m11488()) {
                            iM31610 = C0773.m3169("۠ۗ") ^ i20;
                            i13 = ((iM31610 ^ i21) * (-4367)) ^ (-445039262);
                            i14 = -1957007277;
                            i23 = iM31610 ^ i14;
                            i22 = i13;
                        } else {
                            i17 = i17;
                            obj = obj;
                            i4 = iM2765;
                            iM2763 = (i21 - C0619.m2761("֨ۤ")) * (-57);
                            i8 = ((iM2763 ^ i20) * 17341) ^ 947184959;
                            i10 = -1255341619;
                            i12 = iM2763 ^ i10;
                            obj = obj;
                            iM2765 = i4;
                            int i312 = i17;
                            i23 = i12;
                            i22 = i8;
                            i17 = i312;
                        }
                        break;
                    case 661459865:
                    case 1670883128:
                        C3492.m11487(c2361M3794, C0619.m2761(C11235.m28300(f3786, 433, 3, i24)) ^ 2129859529, new DialogInterface.OnClickListener() { // from class: l.ۨ۠᩻
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i41) {
                                int i42 = -601651770;
                                int i43 = C4282.f15546;
                                int i44 = C2419.f7754;
                                int iM27610 = (i43 - C0619.m2761("ܿ۬")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                                int i45 = ((iM27610 ^ i44) * (-12717)) ^ (-1007321517);
                                int i46 = -1603255925;
                                while (true) {
                                    i42 = ((((i42 ^ i44) * 18469) >> 31) & i45) ^ (iM27610 ^ i46);
                                    switch (i42) {
                                        case -2141798294:
                                        case 1923105790:
                                            int i47 = ViewOnClickListenerC1057.f3785;
                                            if (C3734.f12817 >= 0) {
                                                iM27610 = (i43 - C0619.m2761("֨᩷")) * (-5);
                                                i45 = ((iM27610 ^ i44) * (-16615)) ^ (-1513344452);
                                                i46 = -1517348469;
                                            } else {
                                                iM27610 = C0619.m2761("᩺᩺") ^ i44;
                                                i45 = ((iM27610 ^ i43) * (-12169)) ^ 1465866268;
                                                i46 = -1387154013;
                                            }
                                            break;
                                        case -2034920868:
                                        case -85203522:
                                            if (C17202.f56030) {
                                                iM27610 = (i43 - C0619.m2761("ۖ᩶")) * (-113);
                                                i45 = ((iM27610 ^ i44) * 15829) ^ 603747142;
                                                i46 = 613281274;
                                            } else {
                                                iM27610 = (C0773.m3169("֨᩻") + i43) * q.h;
                                                i45 = ((iM27610 ^ i44) * 4341) ^ 40363740;
                                                i46 = 118338586;
                                            }
                                            break;
                                        case -1983200324:
                                        case -1522799379:
                                            if (C2966.f9654 >= 0) {
                                                iM27610 = (C0619.m2761("᩷᩻") + i44) * (-25);
                                                i45 = ((iM27610 ^ i43) * (-7183)) ^ (-131904957);
                                                i46 = 1092365211;
                                            } else {
                                                iM27610 = C0773.m3169("ܶᩳ") ^ i43;
                                                i45 = ((iM27610 ^ i44) * 17139) ^ 1187385165;
                                                i46 = 825657070;
                                            }
                                            break;
                                        case -1963391998:
                                        case -257159711:
                                            if (C2834.f9334 <= 0) {
                                                iM27610 = C0619.m2761("֫᩸") ^ i44;
                                                i45 = ((iM27610 ^ i43) * 7699) ^ 1320049498;
                                                i46 = -1031690960;
                                            } else {
                                                iM27610 = (i44 - C0619.m2761("᩹ۜ")) * (-97);
                                                i45 = ((iM27610 ^ i43) * (-8995)) ^ (-1378026945);
                                                i46 = 1594000718;
                                            }
                                            break;
                                        case -1932247588:
                                        case 623197033:
                                            C3448.m11245(new C7769(this.f39399));
                                            break;
                                        case -1219634834:
                                        case -409269790:
                                            if (C1564.f5401 <= 0) {
                                                iM27610 = (C0619.m2761("۫ۖ") ^ i43) * (-53);
                                                i45 = ((iM27610 ^ i44) * (-29123)) ^ (-1477472618);
                                                i46 = -1368071102;
                                            } else {
                                                iM27610 = C0773.m3169("ܿۧ") ^ i43;
                                                i45 = ((iM27610 ^ i44) * (-30377)) ^ (-1790434765);
                                                i46 = -565658333;
                                            }
                                            break;
                                        case -1197755980:
                                        case 349942295:
                                            if (C3690.f12684 <= 0) {
                                                iM27610 = (C0619.m2761("۫ۖ") ^ i43) * (-53);
                                                i45 = ((iM27610 ^ i44) * (-29123)) ^ (-1477472618);
                                                i46 = -1368071102;
                                            } else {
                                                iM27610 = (i43 - C0773.m3169("᩷֨")) * 67;
                                                i45 = ((iM27610 ^ i44) * (-9781)) ^ (-1545602858);
                                                i46 = 374607974;
                                            }
                                            break;
                                        case -1000847672:
                                        case 1577541470:
                                            if (C13473.f42873 != 0) {
                                                iM27610 = (C0619.m2761("᩷᩻") + i44) * (-25);
                                                i45 = ((iM27610 ^ i43) * (-7183)) ^ (-131904957);
                                                i46 = 1092365211;
                                            } else {
                                                iM27610 = (C0773.m3169("֨᩻") + i43) * q.h;
                                                i45 = ((iM27610 ^ i44) * 4341) ^ 40363740;
                                                i46 = 118338586;
                                            }
                                            break;
                                        case -995184389:
                                        case 1257680535:
                                            C3690.m11987();
                                            break;
                                        case -888395851:
                                        case -161643614:
                                            if (C2354.f7599 >= 0) {
                                                iM27610 = C0619.m2761("֫᩸") ^ i44;
                                                i45 = ((iM27610 ^ i43) * 7699) ^ 1320049498;
                                                i46 = -1031690960;
                                            } else {
                                                iM27610 = (i44 - C0773.m3169("ۗ᩹")) * (-127);
                                                i45 = ((iM27610 ^ i43) * 11619) ^ (-1305814170);
                                                i46 = -399072283;
                                            }
                                            break;
                                        case -480547502:
                                        case 1812224548:
                                            C2288.m7767();
                                            C3448.m11248();
                                            iM27610 = C0619.m2761("֫᩸") ^ i44;
                                            i45 = ((iM27610 ^ i43) * 7699) ^ 1320049498;
                                            i46 = -1031690960;
                                            break;
                                        case -353939751:
                                        case -215108483:
                                            C1343.m4943();
                                            if (!C17202.f56030) {
                                                iM27610 = (C0773.m3169("֨᩻") + i43) * q.h;
                                                i45 = ((iM27610 ^ i44) * 4341) ^ 40363740;
                                                i46 = 118338586;
                                            } else {
                                                iM27610 = C0619.m2761("֫᩸") ^ i44;
                                                i45 = ((iM27610 ^ i43) * 7699) ^ 1320049498;
                                                i46 = -1031690960;
                                            }
                                            break;
                                        case -312595415:
                                        case 618508797:
                                            if (C23916.f77426 <= 0) {
                                                iM27610 = (C0619.m2761("۫ۖ") ^ i43) * (-53);
                                                i45 = ((iM27610 ^ i44) * (-29123)) ^ (-1477472618);
                                                i46 = -1368071102;
                                            } else {
                                                iM27610 = (C0773.m3169("֨᩻") + i43) * q.h;
                                                i45 = ((iM27610 ^ i44) * 4341) ^ 40363740;
                                                i46 = 118338586;
                                            }
                                            break;
                                        case -285353258:
                                        case 1122710131:
                                            if (C0619.f2439) {
                                                iM27610 = C0619.m2761("֫᩸") ^ i44;
                                                i45 = ((iM27610 ^ i43) * 7699) ^ 1320049498;
                                                i46 = -1031690960;
                                            } else {
                                                iM27610 = (C0773.m3169("֨ۡ") + i43) * 83;
                                                i45 = ((iM27610 ^ i44) * (-15799)) ^ (-65805497);
                                                i46 = -927492584;
                                            }
                                            break;
                                        case 18643669:
                                        case 702914130:
                                            if (RunnableC3055.f9898 >= 0) {
                                                iM27610 = (C0619.m2761("۫ۖ") ^ i43) * (-53);
                                                i45 = ((iM27610 ^ i44) * (-29123)) ^ (-1477472618);
                                                i46 = -1368071102;
                                            } else {
                                                iM27610 = (C0619.m2761("۟ᩳ") + i44) * (-113);
                                                i45 = ((iM27610 ^ i43) * (-81)) ^ 217511374;
                                                i46 = 162920535;
                                            }
                                            break;
                                        default:
                                            if (C2834.f9334 <= 0) {
                                                iM27610 = (C0619.m2761("᩷᩻") + i44) * (-25);
                                                i45 = ((iM27610 ^ i43) * (-7183)) ^ (-131904957);
                                                i46 = 1092365211;
                                            } else {
                                                iM27610 = C0773.m3169("ۛᩴ") ^ i44;
                                                i45 = ((iM27610 ^ i43) * (-20751)) ^ (-854748022);
                                                i46 = 1877747345;
                                            }
                                            break;
                                    }
                                    return;
                                }
                            }
                        });
                        iM3169 = C0773.m3169("ۡᩴ") ^ i21;
                        i8 = ((iM3169 ^ i20) * (-14839)) ^ (-719498146);
                        i9 = 889594237;
                        i12 = iM3169 ^ i9;
                        obj = obj;
                        int i313 = i17;
                        i23 = i12;
                        i22 = i8;
                        i17 = i313;
                        break;
                    case 748485584:
                    case 1814438169:
                        if (AbstractC3624.f12429 > 0) {
                            iM31610 = (C0773.m3169("۟᩵") ^ i21) * (-73);
                            i13 = ((iM31610 ^ i20) * 15189) ^ 655368029;
                            i14 = 1334844782;
                            i23 = iM31610 ^ i14;
                            i22 = i13;
                        } else {
                            i17 = i17;
                            obj = obj;
                            i4 = iM2765;
                            iM2763 = (i21 - C0619.m2761("֨ۤ")) * (-57);
                            i8 = ((iM2763 ^ i20) * 17341) ^ 947184959;
                            i10 = -1255341619;
                            i12 = iM2763 ^ i10;
                            obj = obj;
                            iM2765 = i4;
                            int i314 = i17;
                            i23 = i12;
                            i22 = i8;
                            i17 = i314;
                        }
                        break;
                    case 994330582:
                    case 1842215454:
                        i17 = i17;
                        obj = obj;
                        i4 = iM2765;
                        C2485.m8345(c2361M3794, C0773.m3169(strM4861) ^ 2128341572);
                        if (RunnableC0334.f1808 > 0) {
                            iM2763 = (i20 - C0619.m2761("ۘܺ")) * (-45);
                            i8 = ((iM2763 ^ i21) * (-21211)) ^ 411853598;
                            i10 = -1279819063;
                            i12 = iM2763 ^ i10;
                            obj = obj;
                            iM2765 = i4;
                            int i315 = i17;
                            i23 = i12;
                            i22 = i8;
                            i17 = i315;
                        } else {
                            iM2765 = i4;
                        }
                        break;
                    case 1772021404:
                    case 2044595976:
                        obj = obj;
                        iM2765 = iM2765;
                        objArr3 = objArr3;
                        sArr = sArr3;
                        i25 = i25;
                        i26 = i26;
                        i17 = 1;
                        sArr3 = sArr;
                        iM2761 = C0619.m2761("ۜۨ") ^ i20;
                        i22 = ((iM2761 ^ i21) * (-3765)) ^ 1682751113;
                        i = 1878120137;
                        i23 = iM2761 ^ i;
                        i26 = i26;
                        i25 = i25;
                        i17 = i17;
                        sArr3 = sArr3;
                        iM2765 = iM2765;
                        objArr3 = objArr3;
                        obj = obj;
                        break;
                    default:
                        obj = obj;
                        iM2765 = iM2765;
                        objArr3 = objArr3;
                        sArr3 = sArr3;
                        i25 = i25;
                        i17 = i17;
                        i26 = i26;
                        if (zM44080) {
                            iM2761 = (C0773.m3169("۬ۢ") + i20) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                            i22 = ((iM2761 ^ i21) * (-26389)) ^ 1790409829;
                            i = 864067167;
                        } else {
                            iM2761 = (C0773.m3169("ۘۙ") + i21) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                            i22 = ((iM2761 ^ i20) * (-3491)) ^ (-2009599466);
                            i = -1688045661;
                        }
                        i23 = iM2761 ^ i;
                        i26 = i26;
                        i25 = i25;
                        i17 = i17;
                        sArr3 = sArr3;
                        iM2765 = iM2765;
                        objArr3 = objArr3;
                        obj = obj;
                        break;
                }
                return;
            }
            int iM31617 = C0773.m3169("֡ᩴ") ^ i20;
            i17 = i17;
            obj = obj;
            i23 = iM31617 ^ (-1505122607);
            i22 = ((iM31617 ^ i21) * (-31245)) ^ 1004097057;
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x019c A[PHI: r2
      0x019c: PHI (r2v5 java.lang.String) = (r2v3 java.lang.String), (r2v2 java.lang.String) binds: [B:56:0x0186, B:46:0x0119] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:84:0x02b3 A[PHI: r7
      0x02b3: PHI (r7v7 int) = (r7v2 int), (r7v2 int), (r7v4 int), (r7v2 int) binds: [B:83:0x02b1, B:79:0x0297, B:71:0x024a, B:11:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v2, types: [l.۠ۖ᩻] */
    /* JADX WARN: Type inference failed for: r4v3, types: [l.۠ۖ᩻] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m3955(EditText editText, final DialogInterfaceC8327 dialogInterfaceC8327, ViewOnClickListenerC1057 viewOnClickListenerC1057, final TextInputLayout textInputLayout) {
        int iM2761;
        int i;
        int i2;
        int iM3169;
        int i3;
        int i4;
        ViewOnClickListenerC1057 viewOnClickListenerC1058 = viewOnClickListenerC1057;
        String strM4058 = null;
        int iM4845 = 0;
        ?? r4 = 0;
        String strM11769 = null;
        short s = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = -735772359;
        int i8 = C3690.f12684;
        int i9 = C2966.f9654;
        int iM31610 = C0773.m3169("᩵ۜ") ^ i9;
        int i10 = ((iM31610 ^ i8) * 21357) ^ 263338625;
        int i11 = -1165279645;
        while (true) {
            int i12 = iM31610 ^ i11;
            while (true) {
                i7 = ((((i7 ^ i8) * 7383) >> 31) & i10) ^ i12;
                switch (i7) {
                    case -1921505227:
                    case -365704213:
                        if (AbstractC0641.f2496 >= 0) {
                            iM2761 = (C0619.m2761("᩵֨") ^ i8) * 35;
                            i = ((iM2761 ^ i9) * (-15679)) ^ 828008221;
                            i2 = 1705243811;
                        } else {
                            iM2761 = C0773.m3169("ۤ۟") ^ i8;
                            i = ((iM2761 ^ i9) * 8899) ^ (-1724826868);
                            i2 = 1927691596;
                        }
                        i10 = i;
                        i12 = iM2761 ^ i2;
                        viewOnClickListenerC1058 = viewOnClickListenerC1057;
                        break;
                    case -1779382317:
                    case 1276485719:
                        s = f3786[32];
                        if (C0862.f3233 != 0) {
                            iM2761 = C0619.m2761("֫᩸") ^ i9;
                            i = ((iM2761 ^ i8) * (-10891)) ^ (-1738038081);
                            i2 = -1557370829;
                        } else {
                            iM2761 = C0773.m3169("ܳۡ") ^ i9;
                            i = ((iM2761 ^ i8) * 4729) ^ 855985555;
                            i2 = 1354685029;
                        }
                        i10 = i;
                        i12 = iM2761 ^ i2;
                        viewOnClickListenerC1058 = viewOnClickListenerC1057;
                        break;
                    case -1617244284:
                    case 1043556317:
                        AbstractC3624.m11755();
                        AbstractC0116.m1243();
                        iM3169 = C0619.m2761("ۢ᩸") ^ i8;
                        i3 = ((iM3169 ^ i9) * (-24079)) ^ (-1651085767);
                        i4 = 188548100;
                        r4 = r4;
                        i12 = iM3169 ^ i4;
                        i10 = i3;
                        break;
                    case -1609351438:
                    case 664256679:
                        if (C2287.f7432 >= 0) {
                            iM2761 = (C0619.m2761("᩵֨") ^ i8) * 35;
                            i = ((iM2761 ^ i9) * (-15679)) ^ 828008221;
                            i2 = 1705243811;
                        } else {
                            iM2761 = C0619.m2761("ۗۛ") ^ i9;
                            i = ((iM2761 ^ i8) * 5037) ^ 921770277;
                            i2 = 1999426764;
                        }
                        i10 = i;
                        i12 = iM2761 ^ i2;
                        viewOnClickListenerC1058 = viewOnClickListenerC1057;
                        break;
                    case -1272779926:
                    case 1991804880:
                        RunnableC3646.m11813();
                        if (!C3077.f9998) {
                            iM2761 = C0619.m2761("֫᩸") ^ i9;
                            i = ((iM2761 ^ i8) * (-10891)) ^ (-1738038081);
                            i2 = -1557370829;
                            i10 = i;
                            i12 = iM2761 ^ i2;
                            viewOnClickListenerC1058 = viewOnClickListenerC1057;
                        } else {
                            iM3169 = C0619.m2761("ۢ᩸") ^ i8;
                            i3 = ((iM3169 ^ i9) * (-24079)) ^ (-1651085767);
                            i4 = 188548100;
                            r4 = r4;
                            i12 = iM3169 ^ i4;
                            i10 = i3;
                        }
                        break;
                    case -1232949917:
                    case -663793290:
                        iM4845 = C1321.m4845(strM4058);
                        short[] sArr = f3786;
                        if (C3734.f12817 < 0) {
                            if (C0862.m3503()) {
                                int iM2762 = C0619.m2761(C0619.m2756(sArr, 39, 3, i6)) ^ 2099500428;
                                if (C2354.f7599 < 0) {
                                    final C13511 c13511 = new C13511(viewOnClickListenerC1058, iM2762);
                                    C4282.m13648(c13511);
                                    r4 = new InterfaceC15379() { // from class: l.۠ۖ᩻

                                        /* JADX INFO: renamed from: ۧۜ᩵, reason: not valid java name and contains not printable characters */
                                        private static final short[] f27331 = {7163, -10570, -10591, -10569, -10572, -10581, -10582, -10569, -10591, 19895, 23843, -20095, -23583, 18674, -20127};

                                        {
                                            int i13 = -508334899;
                                            int i14 = C1080.f3865;
                                            int i15 = RunnableC3055.f9898;
                                            int iM31611 = C0773.m3169("ܰ᩶") ^ i14;
                                            int i16 = ((iM31611 ^ i15) * (-21675)) ^ (-1975245866);
                                            int i17 = -374483591;
                                            while (true) {
                                                i13 = ((((i13 ^ i15) * (-9521)) >> 31) & i16) ^ (iM31611 ^ i17);
                                                switch (i13) {
                                                    case -2002152658:
                                                    case 635279839:
                                                        if (C4282.f15546 <= 0) {
                                                            iM31611 = (i14 - C0619.m2761("ܰᩳ")) * (-83);
                                                            i16 = ((iM31611 ^ i15) * 11039) ^ 1538323870;
                                                            i17 = -313359271;
                                                        } else {
                                                            iM31611 = (C0773.m3169("ᩴۢ") ^ i15) * (-47);
                                                            i16 = ((iM31611 ^ i14) * 11015) ^ (-107896375);
                                                            i17 = -840732581;
                                                        }
                                                        break;
                                                    case -1731668731:
                                                    case 677040150:
                                                        if (C2834.f9334 <= 0) {
                                                            iM31611 = C0773.m3169("۟ܽ") ^ i14;
                                                            i16 = ((iM31611 ^ i15) * (-1993)) ^ (-1121045461);
                                                            i17 = 937481074;
                                                        } else {
                                                            iM31611 = (i14 - C0619.m2761("ۚۘ")) * (-123);
                                                            i16 = ((iM31611 ^ i15) * (-8683)) ^ (-1478371403);
                                                            i17 = -1872571302;
                                                        }
                                                        break;
                                                    case -1664208623:
                                                    case -326739548:
                                                        C3099.m10095();
                                                        throw new RuntimeException();
                                                    case -1634274335:
                                                    case -888349551:
                                                        if (C1564.f5401 <= 0) {
                                                            iM31611 = (i15 - C0773.m3169("ܶ֫")) * 115;
                                                            i16 = ((iM31611 ^ i14) * 14239) ^ (-286894667);
                                                            i17 = -1254812102;
                                                        } else {
                                                            iM31611 = C0773.m3169("ܶۢ") ^ i15;
                                                            i16 = ((iM31611 ^ i14) * (-5187)) ^ 1780160023;
                                                            i17 = -225713620;
                                                        }
                                                        break;
                                                    case -1616302265:
                                                    case 1774922361:
                                                        if (RunnableC3055.f9898 >= 0) {
                                                            iM31611 = (i15 - C0773.m3169("ۡ۠")) * 37;
                                                            i16 = ((iM31611 ^ i14) * (-8535)) ^ (-221125145);
                                                            i17 = 796191222;
                                                        } else {
                                                            iM31611 = C0773.m3169("۟ܽ") ^ i14;
                                                            i16 = ((iM31611 ^ i15) * (-1993)) ^ (-1121045461);
                                                            i17 = 937481074;
                                                        }
                                                        break;
                                                    case -1553346083:
                                                    case 862988248:
                                                        AbstractC3624.m11755();
                                                        if (C2375.m8065() > 0) {
                                                            iM31611 = C0773.m3169("۟ܽ") ^ i14;
                                                            i16 = ((iM31611 ^ i15) * (-1993)) ^ (-1121045461);
                                                            i17 = 937481074;
                                                        } else {
                                                            iM31611 = C0619.m2761("۟ۢ") ^ i15;
                                                            i16 = ((iM31611 ^ i14) * (-25853)) ^ 1413827305;
                                                            i17 = -1720442591;
                                                        }
                                                        break;
                                                    case -1107998313:
                                                    case 459738297:
                                                        if (AbstractC0116.f1064 <= 0) {
                                                            iM31611 = (i15 - C0773.m3169("ۡ۠")) * 37;
                                                            i16 = ((iM31611 ^ i14) * (-8535)) ^ (-221125145);
                                                            i17 = 796191222;
                                                        } else {
                                                            iM31611 = (C0619.m2761("᩶֫") + i15) * (-7);
                                                            i16 = ((iM31611 ^ i14) * (-18869)) ^ 864392192;
                                                            i17 = -1320913497;
                                                        }
                                                        break;
                                                    case -909493807:
                                                    case 1429522870:
                                                        if (C0619.f2439) {
                                                            iM31611 = (i15 - C0773.m3169("ܶ֫")) * 115;
                                                            i16 = ((iM31611 ^ i14) * 14239) ^ (-286894667);
                                                            i17 = -1254812102;
                                                        } else {
                                                            iM31611 = C0773.m3169("ۛ۠") ^ i14;
                                                            i16 = ((iM31611 ^ i15) * (-21167)) ^ (-429035463);
                                                            i17 = -1023621489;
                                                        }
                                                        break;
                                                    case -742283714:
                                                    case 835593570:
                                                        if (C2354.f7599 >= 0) {
                                                            iM31611 = (i14 - C0619.m2761("ܰᩳ")) * (-83);
                                                            i16 = ((iM31611 ^ i15) * 11039) ^ 1538323870;
                                                            i17 = -313359271;
                                                        } else {
                                                            iM31611 = (C0619.m2761("᩺۠") ^ i15) * 71;
                                                            i16 = ((iM31611 ^ i14) * (-29959)) ^ 713112487;
                                                            i17 = -888404815;
                                                        }
                                                        break;
                                                    case -659744239:
                                                    case -109372305:
                                                        if (C1343.f4799 != 0) {
                                                            iM31611 = (i14 - C0619.m2761("ܰᩳ")) * (-83);
                                                            i16 = ((iM31611 ^ i15) * 11039) ^ 1538323870;
                                                            i17 = -313359271;
                                                        } else {
                                                            iM31611 = C0773.m3169("۟ܽ") ^ i14;
                                                            i16 = ((iM31611 ^ i15) * (-1993)) ^ (-1121045461);
                                                            i17 = 937481074;
                                                        }
                                                        break;
                                                    case -144719071:
                                                    case 1248993262:
                                                        return;
                                                    case 106905864:
                                                    case 505559347:
                                                        if (C1519.f5300 >= 0) {
                                                            iM31611 = C0773.m3169("۟ܽ") ^ i14;
                                                            i16 = ((iM31611 ^ i15) * (-1993)) ^ (-1121045461);
                                                            i17 = 937481074;
                                                        } else {
                                                            iM31611 = C0619.m2761("֨ۧ") ^ i15;
                                                            i16 = ((iM31611 ^ i14) * (-31019)) ^ (-1360136833);
                                                            i17 = 1955246682;
                                                        }
                                                        break;
                                                    case 232295138:
                                                    case 429542146:
                                                        if (C2287.f7432 >= 0) {
                                                            iM31611 = (i15 - C0773.m3169("ܶ֫")) * 115;
                                                            i16 = ((iM31611 ^ i14) * 14239) ^ (-286894667);
                                                            i17 = -1254812102;
                                                        } else {
                                                            iM31611 = C0619.m2761("ܿܿ") ^ i14;
                                                            i16 = ((iM31611 ^ i15) * (-2517)) ^ 777659562;
                                                            i17 = 1720973471;
                                                        }
                                                        break;
                                                    case 852196055:
                                                    case 1993738995:
                                                        if (C2702.f8586 <= 0) {
                                                            iM31611 = (i15 - C0773.m3169("ۡ۠")) * 37;
                                                            i16 = ((iM31611 ^ i14) * (-8535)) ^ (-221125145);
                                                            i17 = 796191222;
                                                        } else {
                                                            iM31611 = C0773.m3169("᩹ܳ") ^ i14;
                                                            i16 = ((iM31611 ^ i15) * 573) ^ 1595984386;
                                                            i17 = 145017612;
                                                        }
                                                        break;
                                                    case 1698185986:
                                                    case 1936198982:
                                                        C1826.m6301();
                                                        C1542.m5459();
                                                        iM31611 = C0773.m3169("۟ܽ") ^ i14;
                                                        i16 = ((iM31611 ^ i15) * (-1993)) ^ (-1121045461);
                                                        i17 = 937481074;
                                                        break;
                                                    default:
                                                        if (C0773.m3161() != 0) {
                                                            iM31611 = (i15 - C0773.m3169("ܶ֫")) * 115;
                                                            i16 = ((iM31611 ^ i14) * 14239) ^ (-286894667);
                                                            i17 = -1254812102;
                                                        } else {
                                                            iM31611 = C0773.m3169("ܶۨ") ^ i14;
                                                            i16 = ((iM31611 ^ i15) * 18887) ^ (-377943395);
                                                            i17 = -1860915340;
                                                        }
                                                        break;
                                                }
                                            }
                                        }

                                        /* JADX WARN: Code duplicated, block: B:50:0x01a9 A[PHI: r13 r14
                                          0x01a9: PHI (r13v4 short[]) = (r13v3 short[]), (r13v2 short[]) binds: [B:49:0x01a7, B:9:0x0073] A[DONT_GENERATE, DONT_INLINE]
                                          0x01a9: PHI (r14v4 int) = (r14v3 int), (r14v2 int) binds: [B:49:0x01a7, B:9:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
                                        /* JADX WARN: Code duplicated, block: B:59:0x0230 A[PHI: r4 r19 r25
                                          0x0230: PHI (r4v4 int) = (r4v3 int), (r4v2 int), (r4v2 int), (r4v2 int), (r4v2 int) binds: [B:33:0x0103, B:17:0x0086, B:15:0x0082, B:12:0x007c, B:6:0x006a] A[DONT_GENERATE, DONT_INLINE]
                                          0x0230: PHI (r19v3 int) = (r19v2 int), (r19v2 int), (r19v2 int), (r19v2 int), (r19v5 int) binds: [B:33:0x0103, B:17:0x0086, B:15:0x0082, B:12:0x007c, B:6:0x006a] A[DONT_GENERATE, DONT_INLINE]
                                          0x0230: PHI (r25v4 short) = (r25v3 short), (r25v3 short), (r25v3 short), (r25v3 short), (r25v6 short) binds: [B:33:0x0103, B:17:0x0086, B:15:0x0082, B:12:0x007c, B:6:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
                                        /* JADX WARN: Code duplicated, block: B:67:0x0299 A[PHI: r6 r7 r15 r17
                                          0x0299: PHI (r6v4 int) = (r6v2 int), (r6v3 int), (r6v2 int) binds: [B:66:0x0297, B:37:0x0126, B:15:0x0082] A[DONT_GENERATE, DONT_INLINE]
                                          0x0299: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int) binds: [B:66:0x0297, B:37:0x0126, B:15:0x0082] A[DONT_GENERATE, DONT_INLINE]
                                          0x0299: PHI (r15v4 short[]) = (r15v2 short[]), (r15v3 short[]), (r15v2 short[]) binds: [B:66:0x0297, B:37:0x0126, B:15:0x0082] A[DONT_GENERATE, DONT_INLINE]
                                          0x0299: PHI (r17v4 char) = (r17v3 char), (r17v2 char), (r17v2 char) binds: [B:66:0x0297, B:37:0x0126, B:15:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
                                        /* JADX WARN: Code duplicated, block: B:71:0x02cd A[PHI: r3 r5 r8 r9 r10 r16
                                          0x02cd: PHI (r3v4 java.lang.String) = 
                                          (r3v2 java.lang.String)
                                          (r3v3 java.lang.String)
                                          (r3v2 java.lang.String)
                                          (r3v2 java.lang.String)
                                          (r3v2 java.lang.String)
                                          (r3v2 java.lang.String)
                                         binds: [B:70:0x02cb, B:45:0x0182, B:27:0x00cf, B:23:0x00ac, B:12:0x007c, B:9:0x0073] A[DONT_GENERATE, DONT_INLINE]
                                          0x02cd: PHI (r5v4 int) = (r5v2 int), (r5v2 int), (r5v2 int), (r5v3 int), (r5v2 int), (r5v2 int) binds: [B:70:0x02cb, B:45:0x0182, B:27:0x00cf, B:23:0x00ac, B:12:0x007c, B:9:0x0073] A[DONT_GENERATE, DONT_INLINE]
                                          0x02cd: PHI (r8v4 int) = (r8v2 int), (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int), (r8v2 int) binds: [B:70:0x02cb, B:45:0x0182, B:27:0x00cf, B:23:0x00ac, B:12:0x007c, B:9:0x0073] A[DONT_GENERATE, DONT_INLINE]
                                          0x02cd: PHI (r9v4 short[]) = (r9v2 short[]), (r9v2 short[]), (r9v3 short[]), (r9v2 short[]), (r9v2 short[]), (r9v2 short[]) binds: [B:70:0x02cb, B:45:0x0182, B:27:0x00cf, B:23:0x00ac, B:12:0x007c, B:9:0x0073] A[DONT_GENERATE, DONT_INLINE]
                                          0x02cd: PHI (r10v4 int) = (r10v2 int), (r10v2 int), (r10v3 int), (r10v2 int), (r10v2 int), (r10v2 int) binds: [B:70:0x02cb, B:45:0x0182, B:27:0x00cf, B:23:0x00ac, B:12:0x007c, B:9:0x0073] A[DONT_GENERATE, DONT_INLINE]
                                          0x02cd: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:70:0x02cb, B:45:0x0182, B:27:0x00cf, B:23:0x00ac, B:12:0x007c, B:9:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
                                        @Override // l.InterfaceC15379
                                        /* JADX INFO: renamed from: ۙ */
                                        public final void mo5773(C13778 c13778) {
                                            int iM31611;
                                            int i13;
                                            int i14;
                                            int i15 = C1321.f4751;
                                            int i16 = RunnableC3055.f9898;
                                            int iM31612 = C0773.m3169("۠ۨ") ^ i16;
                                            int i17 = ((iM31612 ^ i15) * 13757) ^ (-357548673);
                                            short[] sArr2 = null;
                                            short[] sArr3 = null;
                                            short[] sArr4 = null;
                                            short[] sArr5 = null;
                                            int i18 = iM31612 ^ 773298065;
                                            String strM12149 = null;
                                            int iM2763 = 0;
                                            int iM31613 = 0;
                                            int i19 = 0;
                                            int i20 = 0;
                                            int i21 = 0;
                                            int i22 = 0;
                                            int i23 = 0;
                                            int i24 = 0;
                                            char c = 0;
                                            int i25 = 0;
                                            int i26 = 0;
                                            short s2 = 0;
                                            int i27 = 1128117743;
                                            short s3 = 0;
                                            while (true) {
                                                i27 = i18 ^ (i17 & (((i27 ^ i15) * 4499) >> 31));
                                                switch (i27) {
                                                    case -2127060076:
                                                    case -1078405417:
                                                        s2 = sArr2[c];
                                                        i25 = s2 * s2;
                                                        if (C2023.f6737) {
                                                            iM31611 = (C0773.m3169("ۚ᩻") + i15) * (-125);
                                                            i13 = ((iM31611 ^ i16) * 21003) ^ (-2057968358);
                                                            i14 = 756340531;
                                                        } else {
                                                            iM31611 = (C0773.m3169("ۡۧ") ^ i16) * (-41);
                                                            i13 = ((iM31611 ^ i15) * 10897) ^ (-1071033749);
                                                            i14 = 881719207;
                                                        }
                                                        i18 = iM31611 ^ i14;
                                                        i17 = i13;
                                                        break;
                                                    case -1974101696:
                                                    case -1836888204:
                                                        C3077.m10039(2128174220 ^ iM31613);
                                                        C2375.m8064(dialogInterfaceC8327);
                                                        break;
                                                    case -1973895788:
                                                    case 1881388002:
                                                        if (C11235.f35427 < 0) {
                                                            iM31611 = C0619.m2761("۠ۙ") ^ i16;
                                                            i13 = ((iM31611 ^ i15) * (-3205)) ^ (-404162732);
                                                            i14 = -631539621;
                                                        } else {
                                                            iM31611 = (C0773.m3169("᩺֡") ^ i15) * (-77);
                                                            i13 = ((iM31611 ^ i16) * (-10493)) ^ (-1420518858);
                                                            i14 = -505361540;
                                                        }
                                                        i18 = iM31611 ^ i14;
                                                        i17 = i13;
                                                        break;
                                                    case -1958462517:
                                                    case 1518496260:
                                                        int i28 = ViewOnClickListenerC1057.f3785;
                                                        sArr3 = f27331;
                                                        i24 = 1;
                                                        if (C1343.m4943()) {
                                                            iM31611 = (C0773.m3169("᩸۠") ^ i15) * 65;
                                                            i13 = ((iM31611 ^ i16) * (-13045)) ^ 594629216;
                                                            i14 = 260496529;
                                                        } else {
                                                            iM31611 = (i16 - C0773.m3169("ۨܺ")) * 79;
                                                            i13 = ((iM31611 ^ i15) * 16135) ^ (-1719814556);
                                                            i14 = -1322486624;
                                                        }
                                                        i18 = iM31611 ^ i14;
                                                        i17 = i13;
                                                        break;
                                                    case -1947014617:
                                                    case -1391469811:
                                                        C23916.m53419();
                                                        if (C11235.f35427 >= 0) {
                                                            iM31611 = (i16 - C0619.m2761("ۗۡ")) * (-111);
                                                            i13 = ((iM31611 ^ i15) * (-12157)) ^ 436718901;
                                                            i14 = -141089618;
                                                        } else {
                                                            iM31611 = (i16 - C0773.m3169("ۨܺ")) * 79;
                                                            i13 = ((iM31611 ^ i15) * 16135) ^ (-1719814556);
                                                            i14 = -1322486624;
                                                        }
                                                        i18 = iM31611 ^ i14;
                                                        i17 = i13;
                                                        break;
                                                    case -1887411762:
                                                    case 835806777:
                                                        RunnableC0334.m2063();
                                                        if (C0862.f3233 != 0) {
                                                            iM31611 = C0619.m2761("۠ۙ") ^ i16;
                                                            i13 = ((iM31611 ^ i15) * (-3205)) ^ (-404162732);
                                                            i14 = -631539621;
                                                        } else {
                                                            iM31611 = (i16 - C0619.m2761("ۗۡ")) * (-111);
                                                            i13 = ((iM31611 ^ i15) * (-12157)) ^ 436718901;
                                                            i14 = -141089618;
                                                        }
                                                        i18 = iM31611 ^ i14;
                                                        i17 = i13;
                                                        break;
                                                    case -1883780704:
                                                    case -1520637101:
                                                        C17617.m41269(textInputLayout, C3033.m9850(c13778, 2102062684 ^ iM2763));
                                                        break;
                                                    case -1851237860:
                                                    case 1031138987:
                                                        sArr4 = f27331;
                                                        i19 = 9;
                                                        i20 = 3;
                                                        if (C20932.f66974 <= 0) {
                                                            iM31611 = (C0773.m3169("᩺֡") ^ i15) * (-77);
                                                            i13 = ((iM31611 ^ i16) * (-10493)) ^ (-1420518858);
                                                            i14 = -505361540;
                                                        } else {
                                                            iM31611 = C0619.m2761("֡ܳ") ^ i15;
                                                            i13 = ((iM31611 ^ i16) * (-15647)) ^ 1486710887;
                                                            i14 = -715184109;
                                                        }
                                                        i18 = iM31611 ^ i14;
                                                        i17 = i13;
                                                        break;
                                                    case -1719556926:
                                                    case 1162703510:
                                                        i23 = 54980;
                                                        iM31611 = (C0619.m2761("ۚۨ") ^ i16) * (-27);
                                                        i13 = ((iM31611 ^ i15) * (-21957)) ^ (-338117988);
                                                        i14 = -1002209927;
                                                        i18 = iM31611 ^ i14;
                                                        i17 = i13;
                                                        break;
                                                    case -1283934128:
                                                    case 1518640365:
                                                        c = 0;
                                                        if (RunnableC1848.f6235) {
                                                            iM31611 = (C0773.m3169("᩺֡") ^ i15) * (-77);
                                                            i13 = ((iM31611 ^ i16) * (-10493)) ^ (-1420518858);
                                                            i14 = -505361540;
                                                        } else {
                                                            iM31611 = C0773.m3169("᩸᩶") ^ i16;
                                                            i13 = ((iM31611 ^ i15) * (-22665)) ^ (-1091214284);
                                                            i14 = 1797790446;
                                                        }
                                                        i18 = iM31611 ^ i14;
                                                        i17 = i13;
                                                        break;
                                                    case -1005863907:
                                                    case 711228473:
                                                        sArr2 = f27331;
                                                        if (AbstractC0116.m1243() != 0) {
                                                            iM31611 = (i16 - C0619.m2761("ۗۡ")) * (-111);
                                                            i13 = ((iM31611 ^ i15) * (-12157)) ^ 436718901;
                                                            i14 = -141089618;
                                                        } else {
                                                            iM31611 = (i15 - C0773.m3169("۟ۗ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                                            i13 = ((iM31611 ^ i16) * (-21087)) ^ (-742944942);
                                                            i14 = -413326106;
                                                        }
                                                        i18 = iM31611 ^ i14;
                                                        i17 = i13;
                                                        break;
                                                    case -735652208:
                                                    case 809980966:
                                                        C2310.m7813();
                                                        RunnableC1848.m6360();
                                                        break;
                                                    case -518209047:
                                                    case 1150418216:
                                                        C3734.m12144(c13778, strM12149);
                                                        C2878.m9489(c13511);
                                                        if (C1564.m5516(c13778)) {
                                                            iM31611 = C0619.m2761("᩶֫") ^ i16;
                                                            i13 = ((iM31611 ^ i15) * (-16437)) ^ 1112242806;
                                                            i14 = -1387715913;
                                                        } else {
                                                            iM31611 = C0619.m2761("ۖ۬") ^ i16;
                                                            i13 = ((iM31611 ^ i15) * (-8961)) ^ 713213536;
                                                            i14 = -680934407;
                                                        }
                                                        i18 = iM31611 ^ i14;
                                                        i17 = i13;
                                                        break;
                                                    case -227322506:
                                                    case 1452788954:
                                                        i23 = 24993;
                                                        iM31611 = (C0619.m2761("ۚۨ") ^ i16) * (-27);
                                                        i13 = ((iM31611 ^ i15) * (-21957)) ^ (-338117988);
                                                        i14 = -1002209927;
                                                        i18 = iM31611 ^ i14;
                                                        i17 = i13;
                                                        break;
                                                    case 50126312:
                                                    case 1600083182:
                                                        C1783.m6232();
                                                        C2310.m7813();
                                                        iM31611 = C0619.m2761("۠ۙ") ^ i16;
                                                        i13 = ((iM31611 ^ i15) * (-3205)) ^ (-404162732);
                                                        i14 = -631539621;
                                                        i18 = iM31611 ^ i14;
                                                        i17 = i13;
                                                        break;
                                                    case 154120208:
                                                    case 1942438618:
                                                        iM2763 = C0619.m2761(C1343.m4939(sArr4, i19, i20, i23));
                                                        if (C17202.m40372()) {
                                                            iM31611 = (C0619.m2761("ܿۛ") + i16) * 43;
                                                            i13 = ((iM31611 ^ i15) * 25645) ^ 1976115564;
                                                            i14 = -161964461;
                                                        } else {
                                                            iM31611 = C0619.m2761("۠ۙ") ^ i16;
                                                            i13 = ((iM31611 ^ i15) * (-3205)) ^ (-404162732);
                                                            i14 = -631539621;
                                                        }
                                                        i18 = iM31611 ^ i14;
                                                        i17 = i13;
                                                        break;
                                                    case 276966232:
                                                    case 875878736:
                                                        iM31613 = C0773.m3169(C2023.m6966(sArr5, i22, i21, i23));
                                                        if (C0269.f1558 <= 0) {
                                                            iM31611 = (i16 - C0619.m2761("ۗۡ")) * (-111);
                                                            i13 = ((iM31611 ^ i15) * (-12157)) ^ 436718901;
                                                            i14 = -141089618;
                                                        } else {
                                                            iM31611 = (C0773.m3169("۠۟") + i15) * 35;
                                                            i13 = ((iM31611 ^ i16) * 4069) ^ (-620273754);
                                                            i14 = 1434971866;
                                                        }
                                                        i18 = iM31611 ^ i14;
                                                        i17 = i13;
                                                        break;
                                                    case 1108489282:
                                                    case 1979213215:
                                                        strM12149 = C3734.m12149(sArr3, i24, 8, i23);
                                                        if (C2354.f7599 >= 0) {
                                                            iM31611 = (i16 - C0619.m2761("ۗۡ")) * (-111);
                                                            i13 = ((iM31611 ^ i15) * (-12157)) ^ 436718901;
                                                            i14 = -141089618;
                                                        } else {
                                                            iM31611 = (i15 - C0773.m3169("ۖۙ")) * (-15);
                                                            i13 = ((iM31611 ^ i16) * 19849) ^ (-566848931);
                                                            i14 = -603227951;
                                                        }
                                                        i18 = iM31611 ^ i14;
                                                        i17 = i13;
                                                        break;
                                                    case 1196879046:
                                                    case 1725656670:
                                                        sArr5 = f27331;
                                                        i22 = 12;
                                                        i21 = 3;
                                                        if (C1542.f5343 <= 0) {
                                                            iM31611 = (i16 - C0619.m2761("ۗۡ")) * (-111);
                                                            i13 = ((iM31611 ^ i15) * (-12157)) ^ 436718901;
                                                            i14 = -141089618;
                                                        } else {
                                                            iM31611 = C0619.m2761("ۛܿ") ^ i15;
                                                            i13 = ((iM31611 ^ i16) * (-25887)) ^ 1665578707;
                                                            i14 = -1239797785;
                                                        }
                                                        i18 = iM31611 ^ i14;
                                                        i17 = i13;
                                                        break;
                                                    case 1385121915:
                                                    case 2011422441:
                                                        if ((s2 * s3) - i26 <= 0) {
                                                            iM31611 = C0619.m2761("ۖܺ") ^ i16;
                                                            i13 = ((iM31611 ^ i15) * 32563) ^ (-272961547);
                                                            i14 = 1939703906;
                                                        } else {
                                                            iM31611 = (C0773.m3169("֫ۘ") + i15) * (-57);
                                                            i13 = ((iM31611 ^ i16) * (-17035)) ^ 614286656;
                                                            i14 = -1319480094;
                                                        }
                                                        i18 = iM31611 ^ i14;
                                                        i17 = i13;
                                                        break;
                                                    default:
                                                        i26 = i25 + 268664881;
                                                        s3 = 32782;
                                                        if (C4238.f15451 >= 0) {
                                                            iM31611 = C0619.m2761("۠ۙ") ^ i16;
                                                            i13 = ((iM31611 ^ i15) * (-3205)) ^ (-404162732);
                                                            i14 = -631539621;
                                                        } else {
                                                            iM31611 = C0619.m2761("᩹ۚ") ^ i15;
                                                            i13 = ((iM31611 ^ i16) * (-2075)) ^ (-1874225372);
                                                            i14 = -199971711;
                                                        }
                                                        i18 = iM31611 ^ i14;
                                                        i17 = i13;
                                                        break;
                                                }
                                                return;
                                            }
                                        }
                                    };
                                    if (C1321.f4751 >= 0) {
                                        iM3169 = C0619.m2761("ۢ᩸") ^ i8;
                                        i3 = ((iM3169 ^ i9) * (-24079)) ^ (-1651085767);
                                        i4 = 188548100;
                                        r4 = r4;
                                    } else {
                                        iM3169 = C0773.m3169("۫ܰ") ^ i9;
                                        i3 = ((iM3169 ^ i8) * (-10687)) ^ (-1859244214);
                                        i4 = 2052156443;
                                        r4 = r4;
                                    }
                                }
                            } else {
                                iM3169 = C0619.m2761("ۢ᩸") ^ i8;
                                i3 = ((iM3169 ^ i9) * (-24079)) ^ (-1651085767);
                                i4 = 188548100;
                                r4 = r4;
                            }
                            i12 = iM3169 ^ i4;
                            i10 = i3;
                            break;
                        }
                        iM2761 = C0619.m2761("ۚ֫") ^ i9;
                        i = ((iM2761 ^ i8) * 4633) ^ 2126934415;
                        i2 = 2131912971;
                        i10 = i;
                        i12 = iM2761 ^ i2;
                        viewOnClickListenerC1058 = viewOnClickListenerC1057;
                        break;
                    case -1131046156:
                    case -946308178:
                        i6 = 12132;
                        iM2761 = C0773.m3169("᩷ᩳ") ^ i8;
                        i = ((iM2761 ^ i9) * (-2763)) ^ (-138714353);
                        i2 = 166154440;
                        i10 = i;
                        i12 = iM2761 ^ i2;
                        viewOnClickListenerC1058 = viewOnClickListenerC1057;
                        break;
                    case -1114253944:
                    case -585637070:
                        strM11769 = AbstractC3624.m11769(f3786, 33, 3, i6);
                        if (C2375.f7641 <= 0) {
                            iM2761 = C0619.m2761("ۚ֫") ^ i9;
                            i = ((iM2761 ^ i8) * 4633) ^ 2126934415;
                            i2 = 2131912971;
                        } else {
                            iM2761 = C0773.m3169("ܽܰ") ^ i8;
                            i = ((iM2761 ^ i9) * (-3163)) ^ 1463354053;
                            i2 = 1051312231;
                        }
                        i10 = i;
                        i12 = iM2761 ^ i2;
                        viewOnClickListenerC1058 = viewOnClickListenerC1057;
                        break;
                    case -845022808:
                    case -418481666:
                        i5 = 316555264 + (s * s);
                        if (AbstractC3624.f12429 <= 0) {
                            iM2761 = (C0619.m2761("᩵֨") ^ i8) * 35;
                            i = ((iM2761 ^ i9) * (-15679)) ^ 828008221;
                            i2 = 1705243811;
                        } else {
                            iM2761 = C0773.m3169("ܺ֡") ^ i8;
                            i = ((iM2761 ^ i9) * (-16597)) ^ 555085705;
                            i2 = -1002092110;
                        }
                        i10 = i;
                        i12 = iM2761 ^ i2;
                        viewOnClickListenerC1058 = viewOnClickListenerC1057;
                        break;
                    case -502434087:
                    case 1014416436:
                        C1343.m4943();
                        if (C0487.f2131 > 0) {
                            iM2761 = (C0619.m2761("᩵֨") ^ i8) * 35;
                            i = ((iM2761 ^ i9) * (-15679)) ^ 828008221;
                            i2 = 1705243811;
                            i10 = i;
                            i12 = iM2761 ^ i2;
                            viewOnClickListenerC1058 = viewOnClickListenerC1057;
                        } else {
                            iM3169 = C0619.m2761("ۢ᩸") ^ i8;
                            i3 = ((iM3169 ^ i9) * (-24079)) ^ (-1651085767);
                            i4 = 188548100;
                            r4 = r4;
                            i12 = iM3169 ^ i4;
                            i10 = i3;
                        }
                        break;
                    case -385885951:
                    case 1117053350:
                        short[] sArr2 = f3786;
                        if (C0950.f3488 < 0) {
                            if (new C9826(C2966.m9670(sArr2, 36, 3, i6)).m25600((CharSequence) strM4058)) {
                                iM2761 = (i8 - C0619.m2761("ܰۤ")) * 11;
                                i = ((iM2761 ^ i9) * (-18111)) ^ (-96806745);
                                i2 = -1301447533;
                            } else {
                                iM2761 = C0773.m3169("ܰۖ") ^ i9;
                                i = ((iM2761 ^ i8) * (-26885)) ^ (-1206568099);
                                i2 = 545977837;
                            }
                            i10 = i;
                            i12 = iM2761 ^ i2;
                            viewOnClickListenerC1058 = viewOnClickListenerC1057;
                        } else {
                            iM3169 = C0619.m2761("ۢ᩸") ^ i8;
                            i3 = ((iM3169 ^ i9) * (-24079)) ^ (-1651085767);
                            i4 = 188548100;
                            r4 = r4;
                            i12 = iM3169 ^ i4;
                            i10 = i3;
                        }
                        break;
                    case -337493560:
                    case 1975093720:
                        i6 = 5126;
                        iM2761 = C0773.m3169("᩷ᩳ") ^ i8;
                        i = ((iM2761 ^ i9) * (-2763)) ^ (-138714353);
                        i2 = 166154440;
                        i10 = i;
                        i12 = iM2761 ^ i2;
                        viewOnClickListenerC1058 = viewOnClickListenerC1057;
                        break;
                    case -248440415:
                    case 5924500:
                        C11235.m28302(textInputLayout, C0619.m2761(strM11769) ^ 2103370451);
                        break;
                    case -91646211:
                    case -12356390:
                        C2485.m8357();
                        if (C2419.f7754 < 0) {
                        }
                        iM3169 = C0619.m2761("ۢ᩸") ^ i8;
                        i3 = ((iM3169 ^ i9) * (-24079)) ^ (-1651085767);
                        i4 = 188548100;
                        r4 = r4;
                        i12 = iM3169 ^ i4;
                        i10 = i3;
                        break;
                    case -88674955:
                    case 1605453136:
                        if (i5 - (35584 * s) >= 0) {
                            iM2761 = (i8 - C0773.m3169("ܶۨ")) * (-9);
                            i = ((iM2761 ^ i9) * 31995) ^ (-736898495);
                            i2 = 249738764;
                        } else {
                            iM2761 = C0773.m3169("ۚ۟") ^ i9;
                            i = ((iM2761 ^ i8) * 3961) ^ (-905181786);
                            i2 = 1996316494;
                        }
                        i10 = i;
                        i12 = iM2761 ^ i2;
                        viewOnClickListenerC1058 = viewOnClickListenerC1057;
                        break;
                    case 100961527:
                    case 1109137975:
                        if (!viewOnClickListenerC1058.f3787.m55200()) {
                            iM3169 = C0773.m3169("֨ܺ") ^ i9;
                            i3 = ((iM3169 ^ i8) * 27581) ^ (-793348808);
                            i4 = 731766322;
                            r4 = r4;
                            i12 = iM3169 ^ i4;
                            i10 = i3;
                        } else {
                            iM2761 = C0619.m2761("ۘۨ") ^ i8;
                            i = ((iM2761 ^ i9) * 29595) ^ 1972920067;
                            i2 = 1562143183;
                            i10 = i;
                            i12 = iM2761 ^ i2;
                            viewOnClickListenerC1058 = viewOnClickListenerC1057;
                        }
                        break;
                    case 130595312:
                    case 1354025390:
                        strM4058 = C1080.m4058(C1826.m6309(editText));
                        if (C3077.m10045(strM4058) == 6) {
                            iM2761 = C0773.m3169("ۨ۬") ^ i9;
                            i = ((iM2761 ^ i8) * (-14427)) ^ (-1389059836);
                            i2 = -544474783;
                        } else {
                            iM2761 = C0773.m3169("ܰۖ") ^ i9;
                            i = ((iM2761 ^ i8) * (-26885)) ^ (-1206568099);
                            i2 = 545977837;
                        }
                        i10 = i;
                        i12 = iM2761 ^ i2;
                        viewOnClickListenerC1058 = viewOnClickListenerC1057;
                        break;
                    case 902736562:
                    case 1038645934:
                        C1542.m5459();
                        break;
                    case 924278644:
                    case 1650281264:
                        if (C17617.m41270(textInputLayout)) {
                            iM2761 = C0619.m2761("ۘۨ") ^ i8;
                            i = ((iM2761 ^ i9) * 29595) ^ 1972920067;
                            i2 = 1562143183;
                        } else {
                            iM2761 = (i9 - C0773.m3169("᩵ۛ")) * 3;
                            i = ((iM2761 ^ i8) * (-12123)) ^ 422747469;
                            i2 = -795010617;
                        }
                        i10 = i;
                        i12 = iM2761 ^ i2;
                        viewOnClickListenerC1058 = viewOnClickListenerC1057;
                        break;
                    case 1676669887:
                    case 2037184221:
                        break;
                    default:
                        ReentrantLock reentrantLock = C11650.f37690;
                        C2966.m9674(new C22093(iM4845, viewOnClickListenerC1058, r4));
                        break;
                }
                return;
            }
            iM31610 = C0773.m3169("ۗۢ") ^ i8;
            i10 = ((iM31610 ^ i9) * 23159) ^ (-1902161982);
            i11 = 1212882011;
            r4 = r4;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m3978(ViewOnClickListenerC1057 viewOnClickListenerC1057) {
        viewOnClickListenerC1057.m3968();
    }

    /* JADX WARN: Code duplicated, block: B:107:0x044a A[PHI: r0 r8 r18 r20
      0x044a: PHI (r0v10 short) = (r0v2 short), (r0v3 short), (r0v11 short) binds: [B:106:0x0448, B:102:0x0425, B:24:0x00a8] A[DONT_GENERATE, DONT_INLINE]
      0x044a: PHI (r8v4 java.lang.String) = (r8v2 java.lang.String), (r8v2 java.lang.String), (r8v5 java.lang.String) binds: [B:106:0x0448, B:102:0x0425, B:24:0x00a8] A[DONT_GENERATE, DONT_INLINE]
      0x044a: PHI (r18v9 java.lang.String) = (r18v5 java.lang.String), (r18v6 java.lang.String), (r18v10 java.lang.String) binds: [B:106:0x0448, B:102:0x0425, B:24:0x00a8] A[DONT_GENERATE, DONT_INLINE]
      0x044a: PHI (r20v5 ??) = (r20v70 ??), (r20v71 ??), (r20v72 ??) binds: [B:106:0x0448, B:102:0x0425, B:24:0x00a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:80:0x02d6 A[PHI: r4 r18 r20
      0x02d6: PHI (r4v4 java.lang.String) = (r4v3 java.lang.String), (r4v2 java.lang.String) binds: [B:78:0x02c0, B:68:0x025f] A[DONT_GENERATE, DONT_INLINE]
      0x02d6: PHI (r18v24 java.lang.String) = (r18v23 java.lang.String), (r18v25 java.lang.String) binds: [B:78:0x02c0, B:68:0x025f] A[DONT_GENERATE, DONT_INLINE]
      0x02d6: PHI (r20v19 ??) = (r20v60 ??), (r20v61 ??) binds: [B:78:0x02c0, B:68:0x025f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a0, code lost:
    
        if (l.C3998.f13671 == 0) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v10 */
    /* JADX WARN: Type inference failed for: r20v11 */
    /* JADX WARN: Type inference failed for: r20v12 */
    /* JADX WARN: Type inference failed for: r20v13 */
    /* JADX WARN: Type inference failed for: r20v17 */
    /* JADX WARN: Type inference failed for: r20v18 */
    /* JADX WARN: Type inference failed for: r20v19 */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v20 */
    /* JADX WARN: Type inference failed for: r20v21 */
    /* JADX WARN: Type inference failed for: r20v22 */
    /* JADX WARN: Type inference failed for: r20v23 */
    /* JADX WARN: Type inference failed for: r20v24 */
    /* JADX WARN: Type inference failed for: r20v25 */
    /* JADX WARN: Type inference failed for: r20v26 */
    /* JADX WARN: Type inference failed for: r20v27 */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r20v36 */
    /* JADX WARN: Type inference failed for: r20v37 */
    /* JADX WARN: Type inference failed for: r20v38 */
    /* JADX WARN: Type inference failed for: r20v39 */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r20v40 */
    /* JADX WARN: Type inference failed for: r20v41 */
    /* JADX WARN: Type inference failed for: r20v42 */
    /* JADX WARN: Type inference failed for: r20v43 */
    /* JADX WARN: Type inference failed for: r20v44 */
    /* JADX WARN: Type inference failed for: r20v45 */
    /* JADX WARN: Type inference failed for: r20v46 */
    /* JADX WARN: Type inference failed for: r20v47 */
    /* JADX WARN: Type inference failed for: r20v48 */
    /* JADX WARN: Type inference failed for: r20v49 */
    /* JADX WARN: Type inference failed for: r20v5 */
    /* JADX WARN: Type inference failed for: r20v50 */
    /* JADX WARN: Type inference failed for: r20v51 */
    /* JADX WARN: Type inference failed for: r20v52 */
    /* JADX WARN: Type inference failed for: r20v53 */
    /* JADX WARN: Type inference failed for: r20v54 */
    /* JADX WARN: Type inference failed for: r20v55 */
    /* JADX WARN: Type inference failed for: r20v56 */
    /* JADX WARN: Type inference failed for: r20v57 */
    /* JADX WARN: Type inference failed for: r20v58 */
    /* JADX WARN: Type inference failed for: r20v59 */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r20v60 */
    /* JADX WARN: Type inference failed for: r20v61 */
    /* JADX WARN: Type inference failed for: r20v62 */
    /* JADX WARN: Type inference failed for: r20v63 */
    /* JADX WARN: Type inference failed for: r20v64 */
    /* JADX WARN: Type inference failed for: r20v65 */
    /* JADX WARN: Type inference failed for: r20v66 */
    /* JADX WARN: Type inference failed for: r20v67 */
    /* JADX WARN: Type inference failed for: r20v68 */
    /* JADX WARN: Type inference failed for: r20v69 */
    /* JADX WARN: Type inference failed for: r20v7 */
    /* JADX WARN: Type inference failed for: r20v70 */
    /* JADX WARN: Type inference failed for: r20v71 */
    /* JADX WARN: Type inference failed for: r20v72 */
    /* JADX WARN: Type inference failed for: r20v8 */
    /* JADX WARN: Type inference failed for: r20v9 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v2, types: [l.֫۠᩻] */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r7v42 */
    /* JADX WARN: Type inference failed for: r7v43 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v53 */
    /* JADX WARN: Type inference failed for: r7v54 */
    /* JADX WARN: Type inference failed for: r7v55 */
    /* JADX WARN: Type inference failed for: r7v56 */
    /* JADX WARN: Type inference failed for: r7v57 */
    /* JADX WARN: Type inference failed for: r7v58 */
    /* JADX WARN: Type inference failed for: r7v59 */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m3964(android.widget.EditText r23, android.widget.EditText r24, final l.DialogInterfaceC8327 r25, l.ViewOnClickListenerC1057 r26, com.google.android.material.textfield.TextInputLayout r27, final com.google.android.material.textfield.TextInputLayout r28) {
        /*
            Method dump skipped, instruction units count: 1374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC1057.m3964(android.widget.EditText, android.widget.EditText, l.۠ۖۧ, l.֨۠᩻, com.google.android.material.textfield.TextInputLayout, com.google.android.material.textfield.TextInputLayout):void");
    }

    /* JADX WARN: Code duplicated, block: B:74:0x02f7 A[PHI: r6 r7 r16
      0x02f7: PHI (r6v5 int) = (r6v2 int), (r6v2 int), (r6v4 int), (r6v2 int), (r6v2 int) binds: [B:73:0x02f5, B:69:0x02d8, B:31:0x00d9, B:25:0x00a3, B:15:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x02f7: PHI (r7v5 java.lang.String) = 
      (r7v2 java.lang.String)
      (r7v2 java.lang.String)
      (r7v2 java.lang.String)
      (r7v4 java.lang.String)
      (r7v2 java.lang.String)
     binds: [B:73:0x02f5, B:69:0x02d8, B:31:0x00d9, B:25:0x00a3, B:15:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x02f7: PHI (r16v17 int) = (r16v3 int), (r16v4 int), (r16v15 int), (r16v16 int), (r16v20 int) binds: [B:73:0x02f5, B:69:0x02d8, B:31:0x00d9, B:25:0x00a3, B:15:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x0325 A[PHI: r2 r4 r5 r16
      0x0325: PHI (r2v7 java.lang.String) = (r2v2 java.lang.String), (r2v4 java.lang.String), (r2v2 java.lang.String), (r2v2 java.lang.String) binds: [B:77:0x0323, B:50:0x01e7, B:11:0x0061, B:7:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x0325: PHI (r4v5 int) = (r4v2 int), (r4v2 int), (r4v2 int), (r4v6 int) binds: [B:77:0x0323, B:50:0x01e7, B:11:0x0061, B:7:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x0325: PHI (r5v5 int) = (r5v2 int), (r5v2 int), (r5v2 int), (r5v10 int) binds: [B:77:0x0323, B:50:0x01e7, B:11:0x0061, B:7:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x0325: PHI (r16v27 int) = (r16v2 int), (r16v11 int), (r16v23 int), (r16v28 int) binds: [B:77:0x0323, B:50:0x01e7, B:11:0x0061, B:7:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0078, code lost:
    
        if (l.C2288.m7767() == false) goto L10;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m3962(l.C13511 r20, l.DialogInterfaceC8327 r21, l.C13778 r22, l.ViewOnClickListenerC1057 r23, com.google.android.material.textfield.TextInputLayout r24) {
        /*
            Method dump skipped, instruction units count: 1036
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC1057.m3962(l.۬֨ᩴ, l.۠ۖۧ, l.۬ۢ᩻, l.֨۠᩻, com.google.android.material.textfield.TextInputLayout):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:59:0x01cf A[PHI: r7 r8 r11 r12 r17
      0x01cf: PHI (r7v3 int) = (r7v2 int), (r7v1 int), (r7v1 int) binds: [B:58:0x01cd, B:37:0x00ed, B:14:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x01cf: PHI (r8v3 int) = (r8v2 int), (r8v1 int), (r8v1 int) binds: [B:58:0x01cd, B:37:0x00ed, B:14:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x01cf: PHI (r11v3 short[]) = (r11v1 short[]), (r11v2 short[]), (r11v1 short[]) binds: [B:58:0x01cd, B:37:0x00ed, B:14:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x01cf: PHI (r12v3 int) = (r12v1 int), (r12v2 int), (r12v1 int) binds: [B:58:0x01cd, B:37:0x00ed, B:14:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x01cf: PHI (r17v22 int) = (r17v9 int), (r17v16 int), (r17v23 int) binds: [B:58:0x01cd, B:37:0x00ed, B:14:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0201 A[PHI: r6 r13 r17
      0x0201: PHI (r6v3 int) = (r6v2 int), (r6v1 int) binds: [B:62:0x01ff, B:33:0x00cb] A[DONT_GENERATE, DONT_INLINE]
      0x0201: PHI (r13v2 int) = (r13v1 int), (r13v3 int) binds: [B:62:0x01ff, B:33:0x00cb] A[DONT_GENERATE, DONT_INLINE]
      0x0201: PHI (r17v17 int) = (r17v8 int), (r17v18 int) binds: [B:62:0x01ff, B:33:0x00cb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x0260 A[PHI: r1 r2 r4
      0x0260: PHI (r1v61 int) = (r1v1 int), (r1v1 int), (r1v57 int), (r1v66 int) binds: [B:17:0x0064, B:9:0x004b, B:7:0x0042, B:26:0x0082] A[DONT_GENERATE, DONT_INLINE]
      0x0260: PHI (r2v3 int) = (r2v1 int), (r2v1 int), (r2v1 int), (r2v5 int) binds: [B:17:0x0064, B:9:0x004b, B:7:0x0042, B:26:0x0082] A[DONT_GENERATE, DONT_INLINE]
      0x0260: PHI (r4v4 char) = (r4v1 char), (r4v1 char), (r4v2 char), (r4v1 char) binds: [B:17:0x0064, B:9:0x004b, B:7:0x0042, B:26:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x0297 A[PHI: r3 r9 r17 r18
      0x0297: PHI (r3v3 short[]) = (r3v2 short[]), (r3v1 short[]), (r3v1 short[]) binds: [B:72:0x0295, B:54:0x01a9, B:15:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x0297: PHI (r9v3 int) = (r9v1 int), (r9v2 int), (r9v1 int) binds: [B:72:0x0295, B:54:0x01a9, B:15:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x0297: PHI (r17v20 int) = (r17v6 int), (r17v10 int), (r17v21 int) binds: [B:72:0x0295, B:54:0x01a9, B:15:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x0297: PHI (r18v3 java.lang.String) = (r18v1 java.lang.String), (r18v1 java.lang.String), (r18v4 java.lang.String) binds: [B:72:0x0295, B:54:0x01a9, B:15:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0055, code lost:
    
        if (l.C2310.f7472 >= 0) goto L14;
     */
    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3972() {
        /*
            Method dump skipped, instruction units count: 876
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC1057.m3972():void");
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0280 A[PHI: r3 r16
      0x0280: PHI (r3v6 java.lang.String) = (r3v2 java.lang.String), (r3v4 java.lang.String), (r3v2 java.lang.String) binds: [B:63:0x027e, B:36:0x0113, B:10:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x0280: PHI (r16v20 android.widget.TextView) = (r16v4 android.widget.TextView), (r16v13 android.widget.TextView), (r16v21 android.widget.TextView) binds: [B:63:0x027e, B:36:0x0113, B:10:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x02d9 A[PHI: r1 r16
      0x02d9: PHI (r1v5 java.lang.String) = (r1v2 java.lang.String), (r1v2 java.lang.String), (r1v4 java.lang.String), (r1v2 java.lang.String) binds: [B:71:0x02d7, B:67:0x02b4, B:44:0x017f, B:14:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x02d9: PHI (r16v16 android.widget.TextView) = 
      (r16v2 android.widget.TextView)
      (r16v3 android.widget.TextView)
      (r16v11 android.widget.TextView)
      (r16v17 android.widget.TextView)
     binds: [B:71:0x02d7, B:67:0x02b4, B:44:0x017f, B:14:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:80:0x0330 A[PHI: r16
      0x0330: PHI (r16v18 android.widget.TextView) = (r16v0 android.widget.TextView), (r16v1 android.widget.TextView), (r16v22 android.widget.TextView) binds: [B:79:0x032e, B:75:0x030b, B:11:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0059, code lost:
    
        if (l.C0619.f2439 == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0072, code lost:
    
        if (l.C0269.m1775() <= 0) goto L14;
     */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m3981(l.C13511 r18, l.DialogInterfaceC8327 r19, l.C13778 r20, l.ViewOnClickListenerC1057 r21, com.google.android.material.textfield.TextInputLayout r22) {
        /*
            Method dump skipped, instruction units count: 1042
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC1057.m3981(l.۬֨ᩴ, l.۠ۖۧ, l.۬ۢ᩻, l.֨۠᩻, com.google.android.material.textfield.TextInputLayout):void");
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0144 A[PHI: r0 r3 r4
      0x0144: PHI (r0v6 int) = (r0v1 int), (r0v5 int), (r0v1 int) binds: [B:43:0x0142, B:24:0x007b, B:17:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x0144: PHI (r3v3 int) = (r3v2 int), (r3v1 int), (r3v1 int) binds: [B:43:0x0142, B:24:0x007b, B:17:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x0144: PHI (r4v3 int) = (r4v2 int), (r4v1 int), (r4v1 int) binds: [B:43:0x0142, B:24:0x007b, B:17:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x01eb A[PHI: r6 r7 r8
      0x01eb: PHI (r6v3 short[]) = (r6v1 short[]), (r6v2 short[]), (r6v1 short[]) binds: [B:59:0x01e9, B:28:0x009c, B:13:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x01eb: PHI (r7v3 int) = (r7v1 int), (r7v2 int), (r7v1 int) binds: [B:59:0x01e9, B:28:0x009c, B:13:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x01eb: PHI (r8v3 int) = (r8v1 int), (r8v2 int), (r8v1 int) binds: [B:59:0x01e9, B:28:0x009c, B:13:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x0238 A[PHI: r1
      0x0238: PHI (r1v5 short[]) = (r1v1 short[]), (r1v3 short[]), (r1v1 short[]) binds: [B:67:0x0236, B:51:0x0198, B:9:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x0267 A[PHI: r2
      0x0267: PHI (r2v2 short) = (r2v1 short), (r2v1 short), (r2v4 short) binds: [B:71:0x0265, B:63:0x0219, B:47:0x0176] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        if (l.C23916.f77426 <= 0) goto L13;
     */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m3980(l.C13511 r16, l.ViewOnClickListenerC1057 r17, l.C13778 r18) {
        /*
            Method dump skipped, instruction units count: 820
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC1057.m3980(l.۬֨ᩴ, l.֨۠᩻, l.۬ۢ᩻):void");
    }

    /* JADX WARN: Code duplicated, block: B:38:0x013b A[PHI: r7 r9 r14 r15
      0x013b: PHI (r7v5 java.lang.String) = (r7v2 java.lang.String), (r7v4 java.lang.String), (r7v2 java.lang.String) binds: [B:37:0x0139, B:25:0x00b6, B:7:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x013b: PHI (r9v4 int) = (r9v3 int), (r9v2 int), (r9v2 int) binds: [B:37:0x0139, B:25:0x00b6, B:7:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x013b: PHI (r14v4 short[]) = (r14v3 short[]), (r14v2 short[]), (r14v2 short[]) binds: [B:37:0x0139, B:25:0x00b6, B:7:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x013b: PHI (r15v4 int) = (r15v3 int), (r15v2 int), (r15v2 int) binds: [B:37:0x0139, B:25:0x00b6, B:7:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x0216 A[PHI: r12 r22
      0x0216: PHI (r12v4 short) = (r12v3 short), (r12v2 short), (r12v2 short), (r12v2 short) binds: [B:55:0x0214, B:13:0x006d, B:10:0x0064, B:7:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x0216: PHI (r22v5 int) = (r22v4 int), (r22v3 int), (r22v3 int), (r22v3 int) binds: [B:55:0x0214, B:13:0x006d, B:10:0x0064, B:7:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x024e A[PHI: r2 r3 r4 r10 r16 r17
      0x024e: PHI (r2v5 int) = (r2v2 int), (r2v4 int), (r2v2 int), (r2v2 int), (r2v2 int) binds: [B:59:0x024c, B:41:0x0173, B:29:0x00db, B:21:0x0093, B:10:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x024e: PHI (r3v5 int) = (r3v2 int), (r3v2 int), (r3v2 int), (r3v4 int), (r3v2 int) binds: [B:59:0x024c, B:41:0x0173, B:29:0x00db, B:21:0x0093, B:10:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x024e: PHI (r4v4 java.lang.Object) = 
      (r4v2 java.lang.Object)
      (r4v2 java.lang.Object)
      (r4v2 java.lang.Object)
      (r4v3 java.lang.Object)
      (r4v2 java.lang.Object)
     binds: [B:59:0x024c, B:41:0x0173, B:29:0x00db, B:21:0x0093, B:10:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x024e: PHI (r10v4 short[]) = (r10v2 short[]), (r10v2 short[]), (r10v3 short[]), (r10v2 short[]), (r10v2 short[]) binds: [B:59:0x024c, B:41:0x0173, B:29:0x00db, B:21:0x0093, B:10:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x024e: PHI (r16v4 int) = (r16v3 int), (r16v2 int), (r16v2 int), (r16v2 int), (r16v2 int) binds: [B:59:0x024c, B:41:0x0173, B:29:0x00db, B:21:0x0093, B:10:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x024e: PHI (r17v4 int) = (r17v3 int), (r17v2 int), (r17v2 int), (r17v2 int), (r17v2 int) binds: [B:59:0x024c, B:41:0x0173, B:29:0x00db, B:21:0x0093, B:10:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0284 A[PHI: r1 r5 r8
      0x0284: PHI (r1v4 l.ۖۖۧ) = (r1v2 l.ۖۖۧ), (r1v3 l.ۖۖۧ), (r1v2 l.ۖۖۧ), (r1v2 l.ۖۖۧ) binds: [B:63:0x0282, B:45:0x01a0, B:15:0x0071, B:13:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x0284: PHI (r5v5 java.lang.String) = (r5v2 java.lang.String), (r5v4 java.lang.String), (r5v2 java.lang.String), (r5v2 java.lang.String) binds: [B:63:0x0282, B:45:0x01a0, B:15:0x0071, B:13:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x0284: PHI (r8v5 short) = (r8v4 short), (r8v2 short), (r8v2 short), (r8v2 short) binds: [B:63:0x0282, B:45:0x01a0, B:15:0x0071, B:13:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    private final void m3974() {
        int iM2761;
        int i;
        int i2;
        int i3 = C1321.f4751;
        int i4 = RunnableC3055.f9898;
        int iM3169 = (i3 - C0773.m3169("۠ۗ")) * 73;
        int i5 = ((iM3169 ^ i4) * (-12425)) ^ 1846276564;
        String strM5471 = null;
        String strM11769 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM3169 ^ (-141925856);
        C2361 c2361M13539 = null;
        int iM2762 = 0;
        int iM2763 = 0;
        short s = 0;
        int i7 = 0;
        short s2 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = -1519216317;
        int i13 = 0;
        Object obj = null;
        int iM2764 = 0;
        while (true) {
            i12 = i6 ^ (i5 & (((i12 ^ i4) * (-22819)) >> 31));
            switch (i12) {
                case -2101327362:
                case -1731598498:
                    if (C17202.f56030) {
                        iM2761 = (C0773.m3169("۫ᩴ") + i4) * (-79);
                        i = ((iM2761 ^ i3) * 12169) ^ 1889858138;
                        i2 = 2033468158;
                    } else {
                        iM2761 = (i4 - C0773.m3169("ۧܳ")) * (-63);
                        i = ((iM2761 ^ i3) * 1255) ^ 1114803636;
                        i2 = -1105094810;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -2037229383:
                case 394423363:
                    C0619.m2763();
                    C2485.m8357();
                    break;
                case -1711972920:
                case -110988774:
                    C1542.m5459();
                    if (C2310.f7472 < 0) {
                        iM2761 = C0619.m2761("ۙ۠") ^ i4;
                        i = ((iM2761 ^ i3) * (-20763)) ^ 1304609986;
                        i2 = -39960352;
                    } else {
                        iM2761 = (i4 - C0773.m3169("ۧܳ")) * (-63);
                        i = ((iM2761 ^ i3) * 1255) ^ 1114803636;
                        i2 = -1105094810;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1670881784:
                case -877523185:
                    C3099.m10082(c2361M13539, 2119295678 ^ iM2763);
                    sArr2 = f3786;
                    if (C1146.f4234 >= 0) {
                        iM2761 = (C0619.m2761("۠ܰ") + i3) * (-31);
                        i = ((iM2761 ^ i4) * (-7771)) ^ (-701202983);
                        i2 = 704655473;
                    } else {
                        iM2761 = C0773.m3169("ܽ᩵") ^ i4;
                        i = ((iM2761 ^ i3) * 18423) ^ 2092696552;
                        i2 = -576281593;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1595721796:
                case 1084453547:
                    i10 = s * s;
                    i11 = 139428864;
                    if (C2310.f7472 >= 0) {
                        iM2761 = (C0619.m2761("۠ܰ") + i3) * (-31);
                        i = ((iM2761 ^ i4) * (-7771)) ^ (-701202983);
                        i2 = 704655473;
                    } else {
                        iM2761 = C0619.m2761("ۡܿ") ^ i3;
                        i = ((iM2761 ^ i4) * (-11079)) ^ (-1502427958);
                        i2 = -1238119833;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1526391513:
                case -11066059:
                    C2419.m8168(c2361M13539, iM2764, obj);
                    C5416.m16141(C1321.m4860(c2361M13539));
                    break;
                case -1175386973:
                case 1046550959:
                    if (C23916.f77426 > 0) {
                        iM2761 = (i4 - C0773.m3169("ۧܳ")) * (-63);
                        i = ((iM2761 ^ i3) * 1255) ^ 1114803636;
                        i2 = -1105094810;
                    } else {
                        iM2761 = (C0619.m2761("۠ܰ") + i3) * (-31);
                        i = ((iM2761 ^ i4) * (-7771)) ^ (-701202983);
                        i2 = 704655473;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1025723220:
                case 1465280832:
                    iM2762 = 2119230670 ^ C0619.m2761(strM5471);
                    if (RunnableC1848.f6235) {
                        iM2761 = (C0619.m2761("۠ܰ") + i3) * (-31);
                        i = ((iM2761 ^ i4) * (-7771)) ^ (-701202983);
                        i2 = 704655473;
                    } else {
                        iM2761 = (C0773.m3169("۠ۜ") ^ i3) * 17;
                        i = ((iM2761 ^ i4) * (-10591)) ^ 745622163;
                        i2 = 1414244562;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -992507759:
                case 279693666:
                    int i14 = i10 + i11;
                    i13 = i14 + i14;
                    s2 = 11808;
                    if (C1146.f4234 >= 0) {
                        iM2761 = (i4 - C0773.m3169("ۧܳ")) * (-63);
                        i = ((iM2761 ^ i3) * 1255) ^ 1114803636;
                        i2 = -1105094810;
                    } else {
                        iM2761 = (C0619.m2761("ܰܿ") ^ i3) * (-83);
                        i = ((iM2761 ^ i4) * (-26497)) ^ (-1189533643);
                        i2 = -347426595;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -680168840:
                case 1375497786:
                    iM2763 = C0619.m2761(C11235.m28300(sArr, i9, i7, i8));
                    if (C3690.f12684 <= 0) {
                        iM2761 = C0773.m3169("᩶ܰ") ^ i3;
                        i = ((iM2761 ^ i4) * (-12469)) ^ (-1965036457);
                        i2 = 1045562207;
                    } else {
                        iM2761 = (C0773.m3169("۫ܽ") ^ i3) * (-93);
                        i = ((iM2761 ^ i4) * (-28403)) ^ (-2016619148);
                        i2 = -424762637;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -583789762:
                case -390113761:
                    C0619.m2763();
                    iM2761 = C0619.m2761("ۙ۠") ^ i4;
                    i = ((iM2761 ^ i3) * (-20763)) ^ 1304609986;
                    i2 = -39960352;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -513196526:
                case 934979931:
                    strM11769 = AbstractC3624.m11769(sArr2, 258, 3, i8);
                    if (RunnableC3646.f12471) {
                        iM2761 = (C0773.m3169("۫ᩴ") + i4) * (-79);
                        i = ((iM2761 ^ i3) * 12169) ^ 1889858138;
                        i2 = 2033468158;
                    } else {
                        iM2761 = C0619.m2761("ܿ۟") ^ i3;
                        i = ((iM2761 ^ i4) * (-12099)) ^ (-869668245);
                        i2 = -268799215;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -267054044:
                case 1551471993:
                    c2361M13539 = C4238.m13539(this);
                    strM5471 = C1542.m5471(f3786, 252, 3, i8);
                    if (C3033.m9845() <= 0) {
                        iM2761 = C0619.m2761("ۙ۠") ^ i4;
                        i = ((iM2761 ^ i3) * (-20763)) ^ 1304609986;
                        i2 = -39960352;
                    } else {
                        iM2761 = C0773.m3169("ܽ۬") ^ i4;
                        i = ((iM2761 ^ i3) * 30155) ^ (-172556932);
                        i2 = 683713639;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -192843616:
                case 327550994:
                    i8 = 54862;
                    iM2761 = C0773.m3169("ۗ۠") ^ i4;
                    i = ((iM2761 ^ i3) * 27947) ^ (-654014737);
                    i2 = 436812105;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 309248322:
                case 1231178730:
                    iM2764 = 2124352918 ^ C0619.m2761(strM11769);
                    obj = null;
                    if (AbstractC3624.f12429 <= 0) {
                        iM2761 = (C0619.m2761("۠ܰ") + i3) * (-31);
                        i = ((iM2761 ^ i4) * (-7771)) ^ (-701202983);
                        i2 = 704655473;
                    } else {
                        iM2761 = C0619.m2761("ۗۖ") ^ i3;
                        i = ((iM2761 ^ i4) * 28021) ^ (-913805134);
                        i2 = 1506746513;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 401600441:
                case 2005467308:
                    int i15 = s + s2;
                    if (i13 - (i15 * i15) < 0) {
                        iM2761 = (C0619.m2761("᩹ۧ") + i3) * (-127);
                        i = ((iM2761 ^ i4) * (-26831)) ^ (-1020180785);
                        i2 = 1258856091;
                    } else {
                        iM2761 = C0773.m3169("ۢ֫") ^ i4;
                        i = ((iM2761 ^ i3) * 16261) ^ 32196218;
                        i2 = -1891366517;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 505129957:
                case 1146348581:
                    C2485.m8345(c2361M13539, iM2762);
                    sArr = f3786;
                    i9 = 255;
                    i7 = 3;
                    if (RunnableC1848.f6235) {
                        iM2761 = (C0773.m3169("۫ᩴ") + i4) * (-79);
                        i = ((iM2761 ^ i3) * 12169) ^ 1889858138;
                        i2 = 2033468158;
                    } else {
                        iM2761 = C0773.m3169("᩵ۚ") ^ i4;
                        i = ((iM2761 ^ i3) * 30485) ^ (-1747663424);
                        i2 = -1142709573;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 1642081456:
                case 1993564804:
                    s = f3786[251];
                    if (C4238.f15451 >= 0) {
                        iM2761 = C0619.m2761("ۙ۠") ^ i4;
                        i = ((iM2761 ^ i3) * (-20763)) ^ 1304609986;
                        i2 = -39960352;
                    } else {
                        iM2761 = C0619.m2761("ۙܿ") ^ i4;
                        i = ((iM2761 ^ i3) * 8953) ^ (-169433178);
                        i2 = 1258232766;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                default:
                    i8 = 8469;
                    iM2761 = C0773.m3169("ۗ۠") ^ i4;
                    i = ((iM2761 ^ i3) * 27947) ^ (-654014737);
                    i2 = 436812105;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0276 A[PHI: r3 r5 r6 r7 r8 r17 r18 r19
      0x0276: PHI (r3v3 short[]) = (r3v2 short[]), (r3v1 short[]), (r3v1 short[]), (r3v1 short[]) binds: [B:66:0x02bc, B:58:0x0274, B:54:0x024e, B:29:0x010c] A[DONT_GENERATE, DONT_INLINE]
      0x0276: PHI (r5v3 short) = (r5v1 short), (r5v2 short), (r5v1 short), (r5v1 short) binds: [B:66:0x02bc, B:58:0x0274, B:54:0x024e, B:29:0x010c] A[DONT_GENERATE, DONT_INLINE]
      0x0276: PHI (r6v3 short) = (r6v1 short), (r6v2 short), (r6v1 short), (r6v1 short) binds: [B:66:0x02bc, B:58:0x0274, B:54:0x024e, B:29:0x010c] A[DONT_GENERATE, DONT_INLINE]
      0x0276: PHI (r7v3 int) = (r7v1 int), (r7v1 int), (r7v2 int), (r7v1 int) binds: [B:66:0x02bc, B:58:0x0274, B:54:0x024e, B:29:0x010c] A[DONT_GENERATE, DONT_INLINE]
      0x0276: PHI (r8v3 int) = (r8v1 int), (r8v1 int), (r8v2 int), (r8v1 int) binds: [B:66:0x02bc, B:58:0x0274, B:54:0x024e, B:29:0x010c] A[DONT_GENERATE, DONT_INLINE]
      0x0276: PHI (r17v20 int) = (r17v9 int), (r17v11 int), (r17v12 int), (r17v21 int) binds: [B:66:0x02bc, B:58:0x0274, B:54:0x024e, B:29:0x010c] A[DONT_GENERATE, DONT_INLINE]
      0x0276: PHI (r18v2 java.lang.String) = (r18v1 java.lang.String), (r18v1 java.lang.String), (r18v1 java.lang.String), (r18v3 java.lang.String) binds: [B:66:0x02bc, B:58:0x0274, B:54:0x024e, B:29:0x010c] A[DONT_GENERATE, DONT_INLINE]
      0x0276: PHI (r19v14 int) = (r19v3 int), (r19v5 int), (r19v6 int), (r19v15 int) binds: [B:66:0x02bc, B:58:0x0274, B:54:0x024e, B:29:0x010c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x02f9 A[PHI: r4 r17 r19
      0x02f9: PHI (r4v3 char) = (r4v1 char), (r4v2 char), (r4v1 char) binds: [B:71:0x02f7, B:62:0x0297, B:14:0x0083] A[DONT_GENERATE, DONT_INLINE]
      0x02f9: PHI (r17v30 int) = (r17v8 int), (r17v10 int), (r17v31 int) binds: [B:71:0x02f7, B:62:0x0297, B:14:0x0083] A[DONT_GENERATE, DONT_INLINE]
      0x02f9: PHI (r19v22 int) = (r19v2 int), (r19v4 int), (r19v23 int) binds: [B:71:0x02f7, B:62:0x0297, B:14:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0095, code lost:
    
        if (l.C3690.m11987() == false) goto L18;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C11471 m3952(l.ViewOnClickListenerC1057 r22, l.C24706 r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 978
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC1057.m3952(l.֨۠᩻, l.᩻֨᩻):l.ۧ۟᩵");
    }

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    private final void m3983() {
        DialogInterfaceC8327 dialogInterfaceC8327;
        String str;
        short[] sArr;
        int i;
        short s;
        int i2;
        int i3;
        View view;
        View.OnClickListener onClickListener;
        View view2;
        int i4;
        short[] sArr2;
        int iM2761;
        int i5;
        int i6;
        int i7;
        String str2;
        short[] sArr3;
        int i8;
        String str3;
        int iM2762;
        int i9;
        int i10;
        int iM2763;
        int i11;
        int i12;
        int iM2764;
        int i13;
        int i14;
        int i15 = 1014661631;
        int i16 = C2354.f7599;
        int i17 = C1080.f3865;
        int iM3169 = C0773.m3169("ۛܺ") ^ i17;
        int i18 = ((iM3169 ^ i16) * 11939) ^ (-2065357505);
        int i19 = iM3169 ^ 1198493653;
        View viewM9333 = null;
        View viewM9334 = null;
        EditText editText = null;
        EditText editText2 = null;
        final DialogInterfaceC8327 dialogInterfaceC8327M10090 = null;
        View view3 = null;
        String strM4939 = null;
        String strM7761 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        short[] sArr6 = null;
        View viewM2812 = null;
        int i20 = 0;
        int iM31610 = 0;
        int i21 = 0;
        int iM31611 = 0;
        int iM2765 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        String str4 = null;
        TextInputLayout textInputLayout = null;
        View view4 = null;
        View.OnClickListener onClickListener2 = null;
        View viewM9335 = null;
        int i26 = 0;
        int i27 = 0;
        TextInputLayout textInputLayout2 = null;
        short s2 = 0;
        while (true) {
            i15 = i19 ^ (i18 & (((i15 ^ i16) * (-12253)) >> 31));
            switch (i15) {
                case -2039020695:
                case -314226429:
                    C2485.m8357();
                    if (C2834.f9334 <= 0) {
                        dialogInterfaceC8327 = dialogInterfaceC8327M10090;
                        sArr6 = sArr6;
                        i27 = i27;
                        sArr = sArr4;
                        s = s2;
                        i2 = i20;
                        i3 = i26;
                        iM2763 = (C0619.m2761("᩹֡") + i17) * 33;
                        i11 = ((iM2763 ^ i16) * 31277) ^ 2002305665;
                        i12 = 741437566;
                        i19 = iM2763 ^ i12;
                        i18 = i11;
                        i26 = i3;
                        s2 = s;
                        i20 = i2;
                        i27 = i27;
                        dialogInterfaceC8327M10090 = dialogInterfaceC8327;
                        sArr4 = sArr;
                        sArr6 = sArr6;
                    } else {
                        onClickListener = onClickListener2;
                        dialogInterfaceC8327 = dialogInterfaceC8327M10090;
                        sArr6 = sArr6;
                        i27 = i27;
                        str = str4;
                        sArr = sArr4;
                        i = i25;
                        view = view3;
                        s = s2;
                        i2 = i20;
                        view2 = viewM9333;
                        i4 = i24;
                        i3 = i26;
                        int iM31612 = C0773.m3169("ۧۨ") ^ i16;
                        i19 = iM31612 ^ (-918686307);
                        i18 = ((iM31612 ^ i17) * (-24457)) ^ 794491880;
                        i25 = i;
                        i26 = i3;
                        i24 = i4;
                        view3 = view;
                        i20 = i2;
                        onClickListener2 = onClickListener;
                        dialogInterfaceC8327M10090 = dialogInterfaceC8327;
                        str4 = str;
                        viewM9333 = view2;
                        sArr4 = sArr;
                        s2 = s;
                        sArr6 = sArr6;
                        i27 = i27;
                    }
                    break;
                case -1924452821:
                case 1144538253:
                    C0950.m3785();
                    dialogInterfaceC8327 = dialogInterfaceC8327M10090;
                    sArr6 = sArr6;
                    i27 = i27;
                    sArr = sArr4;
                    s = s2;
                    i2 = i20;
                    i3 = i26;
                    sArr3 = sArr5;
                    int iM2766 = (i16 - C0619.m2761("ܰۤ")) * 21;
                    i19 = iM2766 ^ (-1114981428);
                    i18 = ((iM2766 ^ i17) * (-20203)) ^ (-370297138);
                    sArr5 = sArr3;
                    viewM9333 = viewM9333;
                    i26 = i3;
                    s2 = s;
                    i20 = i2;
                    i27 = i27;
                    dialogInterfaceC8327M10090 = dialogInterfaceC8327;
                    sArr4 = sArr;
                    sArr6 = sArr6;
                    break;
                case -1903582134:
                case 1091948142:
                    i7 = 31802;
                    int iM31613 = (C0773.m3169("ۗ۬") + i16) * (-11);
                    int i28 = ((iM31613 ^ i17) * (-22213)) ^ 1634677749;
                    i19 = iM31613 ^ (-1944586326);
                    sArr5 = sArr5;
                    i25 = i25;
                    i24 = i24;
                    view3 = view3;
                    i20 = i20;
                    dialogInterfaceC8327M10090 = dialogInterfaceC8327M10090;
                    i26 = i7;
                    i18 = i28;
                    str4 = str4;
                    viewM9333 = viewM9333;
                    sArr4 = sArr4;
                    s2 = s2;
                    onClickListener2 = onClickListener2;
                    sArr6 = sArr6;
                    i27 = i27;
                    break;
                case -1852999745:
                case 1221682292:
                    dialogInterfaceC8327 = dialogInterfaceC8327M10090;
                    sArr6 = sArr6;
                    i27 = i27;
                    sArr = sArr4;
                    s = s2;
                    i2 = i20;
                    i3 = i26;
                    textInputLayout2 = (TextInputLayout) view4;
                    strM4939 = C1343.m4939(f3786, 397, 3, i3);
                    iM2763 = C0619.m2761("ۘ֨") ^ i16;
                    i11 = ((iM2763 ^ i17) * (-3999)) ^ (-1883134820);
                    i12 = -1046205775;
                    i19 = iM2763 ^ i12;
                    i18 = i11;
                    i26 = i3;
                    s2 = s;
                    i20 = i2;
                    i27 = i27;
                    dialogInterfaceC8327M10090 = dialogInterfaceC8327;
                    sArr4 = sArr;
                    sArr6 = sArr6;
                    break;
                case -1829792326:
                case 1783057088:
                    C2310.m7813();
                    C0269.m1775();
                    break;
                case -1819987172:
                case -513985655:
                    sArr6 = sArr6;
                    sArr = sArr4;
                    C17617.m41267(textInputLayout2);
                    C2361 c2361M13539 = C4238.m13539(this);
                    C4282.m13657(c2361M13539, viewM2812);
                    dialogInterfaceC8327M10090 = C3099.m10090(c2361M13539);
                    C21576.m49090(editText);
                    int iM31614 = (C0773.m3169("᩷᩹") + i16) * 95;
                    i19 = iM31614 ^ 570056702;
                    i18 = ((iM31614 ^ i17) * 16699) ^ 2133128077;
                    i26 = i26;
                    s2 = s2;
                    i20 = i20;
                    i27 = i27;
                    sArr4 = sArr;
                    sArr6 = sArr6;
                    break;
                case -1677131134:
                case -370251000:
                    View.OnClickListener onClickListener3 = onClickListener2;
                    short[] sArr7 = sArr6;
                    String str5 = str4;
                    short[] sArr8 = sArr4;
                    View view5 = view3;
                    short s3 = f3786[370];
                    i22 = s3 * s3;
                    i23 = 9078169;
                    int iM2767 = C0619.m2761("۟ۨ") ^ i16;
                    int i29 = ((iM2767 ^ i17) * (-8391)) ^ (-285112258);
                    i19 = iM2767 ^ 1066271632;
                    sArr5 = sArr5;
                    i25 = i25;
                    i26 = i26;
                    i24 = i24;
                    view3 = view5;
                    i20 = i20;
                    i27 = i27;
                    dialogInterfaceC8327M10090 = dialogInterfaceC8327M10090;
                    str4 = str5;
                    viewM9333 = viewM9333;
                    sArr4 = sArr8;
                    sArr6 = sArr7;
                    s2 = s3;
                    i18 = i29;
                    onClickListener2 = onClickListener3;
                    break;
                case -1649177954:
                case -1343303191:
                    onClickListener = onClickListener2;
                    dialogInterfaceC8327 = dialogInterfaceC8327M10090;
                    sArr6 = sArr6;
                    i27 = i27;
                    str = str4;
                    sArr = sArr4;
                    i = i25;
                    view = view3;
                    s = s2;
                    i2 = i20;
                    view2 = viewM9333;
                    i4 = i24;
                    i3 = i26;
                    sArr2 = sArr5;
                    if ((i22 + i23) - (s * 6026) >= 0) {
                        iM2761 = (C0773.m3169("ۖܳ") + i17) * 123;
                        i5 = ((iM2761 ^ i16) * 23875) ^ 1615484033;
                        i6 = -467882963;
                    } else {
                        iM2761 = C0619.m2761("ۛܰ") ^ i17;
                        i5 = ((iM2761 ^ i16) * 27323) ^ (-269005933);
                        i6 = 73547378;
                    }
                    i19 = iM2761 ^ i6;
                    i18 = i5;
                    sArr5 = sArr2;
                    i25 = i;
                    i26 = i3;
                    i24 = i4;
                    view3 = view;
                    i20 = i2;
                    onClickListener2 = onClickListener;
                    dialogInterfaceC8327M10090 = dialogInterfaceC8327;
                    str4 = str;
                    viewM9333 = view2;
                    sArr4 = sArr;
                    s2 = s;
                    sArr6 = sArr6;
                    i27 = i27;
                    break;
                case -1350425029:
                case -1258918608:
                    C11235.m28299(view3, onClickListener2);
                    sArr6 = f3786;
                    i20 = 406;
                    i27 = 3;
                    if (C1826.f6190 > 0) {
                        iM2764 = (C0619.m2761("ۚۚ") ^ i16) * (-121);
                        i13 = ((iM2764 ^ i17) * (-16543)) ^ (-2072294181);
                        i14 = 71263435;
                        i19 = iM2764 ^ i14;
                        i18 = i13;
                    } else {
                        i3 = i26;
                        s = s2;
                        dialogInterfaceC8327 = dialogInterfaceC8327M10090;
                        sArr6 = sArr6;
                        viewM9333 = viewM9333;
                        sArr = sArr4;
                        sArr3 = sArr5;
                        i2 = 406;
                        i27 = 3;
                        int iM2768 = (i16 - C0619.m2761("ܰۤ")) * 21;
                        i19 = iM2768 ^ (-1114981428);
                        i18 = ((iM2768 ^ i17) * (-20203)) ^ (-370297138);
                        sArr5 = sArr3;
                        viewM9333 = viewM9333;
                        i26 = i3;
                        s2 = s;
                        i20 = i2;
                        i27 = i27;
                        dialogInterfaceC8327M10090 = dialogInterfaceC8327;
                        sArr4 = sArr;
                        sArr6 = sArr6;
                    }
                    break;
                case -1337189629:
                case -553340113:
                    i7 = 39706;
                    int iM31615 = (C0773.m3169("ۗ۬") + i16) * (-11);
                    int i210 = ((iM31615 ^ i17) * (-22213)) ^ 1634677749;
                    i19 = iM31615 ^ (-1944586326);
                    sArr5 = sArr5;
                    i25 = i25;
                    i24 = i24;
                    view3 = view3;
                    i20 = i20;
                    dialogInterfaceC8327M10090 = dialogInterfaceC8327M10090;
                    i26 = i7;
                    i18 = i210;
                    str4 = str4;
                    viewM9333 = viewM9333;
                    sArr4 = sArr4;
                    s2 = s2;
                    onClickListener2 = onClickListener2;
                    sArr6 = sArr6;
                    i27 = i27;
                    break;
                case -1286456621:
                case 2122687288:
                    dialogInterfaceC8327 = dialogInterfaceC8327M10090;
                    sArr6 = sArr6;
                    i2 = i20;
                    i27 = i27;
                    str2 = str4;
                    i3 = i26;
                    s = s2;
                    viewM9333 = viewM9333;
                    sArr3 = sArr5;
                    viewM2812 = AbstractC0641.m2812(this, iM31610 ^ i21);
                    short[] sArr9 = f3786;
                    i24 = 374;
                    i25 = 3;
                    if (C1146.m4231()) {
                        int iM2769 = C0619.m2761("ܽܰ") ^ i16;
                        int i30 = ((iM2769 ^ i17) * 31067) ^ 1647904246;
                        i19 = iM2769 ^ (-717249084);
                        str4 = str2;
                        sArr5 = sArr3;
                        viewM9333 = viewM9333;
                        i26 = i3;
                        s2 = s;
                        i20 = i2;
                        i27 = i27;
                        dialogInterfaceC8327M10090 = dialogInterfaceC8327;
                        sArr4 = sArr9;
                        i18 = i30;
                    } else {
                        sArr = sArr9;
                        int iM27610 = (C0619.m2761("ܰۡ") ^ i16) * 57;
                        i8 = ((iM27610 ^ i17) * (-2671)) ^ (-1842277333);
                        i19 = iM27610 ^ (-1545367504);
                        str4 = str2;
                        sArr5 = sArr3;
                        viewM9333 = viewM9333;
                        i18 = i8;
                        i26 = i3;
                        s2 = s;
                        i20 = i2;
                        i27 = i27;
                        dialogInterfaceC8327M10090 = dialogInterfaceC8327;
                        sArr4 = sArr;
                    }
                    sArr6 = sArr6;
                    break;
                case -1255699024:
                case 921093759:
                    dialogInterfaceC8327 = dialogInterfaceC8327M10090;
                    sArr6 = sArr6;
                    i27 = i27;
                    sArr = sArr4;
                    s = s2;
                    i2 = i20;
                    i3 = i26;
                    strM7761 = C2288.m7761(f3786, 403, 3, i3);
                    if (!C0619.f2439) {
                        iM2763 = C0619.m2761("ܿ᩸") ^ i17;
                        i11 = ((iM2763 ^ i16) * 28101) ^ 910113659;
                        i12 = 160523482;
                        i19 = iM2763 ^ i12;
                        i18 = i11;
                        i26 = i3;
                        s2 = s;
                        i20 = i2;
                        i27 = i27;
                        dialogInterfaceC8327M10090 = dialogInterfaceC8327;
                        sArr4 = sArr;
                        sArr6 = sArr6;
                    }
                    viewM9333 = viewM9333;
                    str2 = str4;
                    sArr3 = sArr5;
                    int iM27611 = (C0619.m2761("ܰۡ") ^ i16) * 57;
                    i8 = ((iM27611 ^ i17) * (-2671)) ^ (-1842277333);
                    i19 = iM27611 ^ (-1545367504);
                    str4 = str2;
                    sArr5 = sArr3;
                    viewM9333 = viewM9333;
                    i18 = i8;
                    i26 = i3;
                    s2 = s;
                    i20 = i2;
                    i27 = i27;
                    dialogInterfaceC8327M10090 = dialogInterfaceC8327;
                    sArr4 = sArr;
                    sArr6 = sArr6;
                    break;
                case -972865669:
                case -3947016:
                    viewM9335 = C2834.m9333(viewM2812, C0773.m3169(C1080.m4056(sArr6, i20, i27, i26)) ^ 2119454028);
                    iM2764 = (i17 - C0773.m3169("᩷ۡ")) * (-111);
                    i13 = ((iM2764 ^ i16) * 11311) ^ (-1669808019);
                    i14 = 2064674702;
                    i19 = iM2764 ^ i14;
                    i18 = i13;
                    break;
                case -884518215:
                case 1922157529:
                    dialogInterfaceC8327 = dialogInterfaceC8327M10090;
                    sArr6 = sArr6;
                    i27 = i27;
                    sArr = sArr4;
                    s = s2;
                    i2 = i20;
                    i3 = i26;
                    editText2 = (EditText) C2834.m9333(viewM2812, iM2765 ^ 2102907622);
                    C17617.m41267(textInputLayout);
                    if (C1826.f6190 <= 0) {
                        iM2763 = (C0619.m2761("᩹֡") + i17) * 33;
                        i11 = ((iM2763 ^ i16) * 31277) ^ 2002305665;
                        i12 = 741437566;
                    } else {
                        iM2763 = C0619.m2761("ᩴۙ") ^ i17;
                        i11 = ((iM2763 ^ i16) * (-3789)) ^ (-741930030);
                        i12 = 976772996;
                    }
                    i19 = iM2763 ^ i12;
                    i18 = i11;
                    i26 = i3;
                    s2 = s;
                    i20 = i2;
                    i27 = i27;
                    dialogInterfaceC8327M10090 = dialogInterfaceC8327;
                    sArr4 = sArr;
                    sArr6 = sArr6;
                    break;
                case -755513045:
                case 1959868917:
                    View viewM9336 = C2834.m9333(viewM2812, C0619.m2761(strM7761) ^ 2102513345);
                    final EditText editText3 = editText;
                    final EditText editText4 = editText2;
                    sArr6 = sArr6;
                    final DialogInterfaceC8327 dialogInterfaceC8328 = dialogInterfaceC8327M10090;
                    int i31 = i27;
                    short s4 = s2;
                    final TextInputLayout textInputLayout3 = textInputLayout;
                    DialogInterfaceC8327 dialogInterfaceC8329 = dialogInterfaceC8327M10090;
                    final TextInputLayout textInputLayout4 = textInputLayout2;
                    View.OnClickListener onClickListener4 = new View.OnClickListener() { // from class: l.۟ۖ᩻
                        {
                            int i32 = 333689441;
                            int i33 = C1564.f5401;
                            int i34 = C3734.f12817;
                            int iM31616 = (i34 - C0773.m3169("᩶ܰ")) * (-111);
                            int i35 = ((iM31616 ^ i33) * (-18185)) ^ (-1080771924);
                            int i36 = -1145200158;
                            while (true) {
                                i32 = ((((i32 ^ i33) * 21569) >> 31) & i35) ^ (iM31616 ^ i36);
                                switch (i32) {
                                    case -1843868012:
                                    case -1406148374:
                                        if (C4282.f15546 <= 0) {
                                            iM31616 = (C0619.m2761("᩻ܳ") + i33) * 23;
                                            i35 = ((iM31616 ^ i34) * 12193) ^ 255657159;
                                            i36 = 1770623722;
                                        } else {
                                            iM31616 = (C0619.m2761("᩵᩸") + i33) * 93;
                                            i35 = ((iM31616 ^ i34) * 28777) ^ 1093014212;
                                            i36 = 2132786525;
                                        }
                                        break;
                                    case -1615121769:
                                    case 1087612876:
                                        if (!C1321.m4852()) {
                                            iM31616 = C0619.m2761("ۧ֫") ^ i34;
                                            i35 = ((iM31616 ^ i33) * (-16737)) ^ 2045136165;
                                            i36 = 1941606905;
                                        } else {
                                            iM31616 = (i33 - C0619.m2761("ۡܽ")) * (-113);
                                            i35 = ((iM31616 ^ i34) * 29863) ^ 1503464115;
                                            i36 = -1557168872;
                                        }
                                        break;
                                    case -1501648726:
                                    case 1978003097:
                                        return;
                                    case -1494845022:
                                    case 795872206:
                                        if (RunnableC3646.m11813() != 0) {
                                            iM31616 = C0619.m2761("ܿܽ") ^ i34;
                                            i35 = ((iM31616 ^ i33) * (-24347)) ^ 202803388;
                                            i36 = 640536747;
                                        } else {
                                            iM31616 = (i33 - C0619.m2761("᩸᩸")) * 17;
                                            i35 = ((iM31616 ^ i34) * 18059) ^ (-221036265);
                                            i36 = -1764750149;
                                        }
                                        break;
                                    case -1353090164:
                                    case 715001692:
                                        if (C1519.f5300 >= 0) {
                                            iM31616 = (C0619.m2761("᩻ܳ") + i33) * 23;
                                            i35 = ((iM31616 ^ i34) * 12193) ^ 255657159;
                                            i36 = 1770623722;
                                        } else {
                                            iM31616 = C0619.m2761("ܽ۬") ^ i34;
                                            i35 = ((iM31616 ^ i33) * 2617) ^ (-961035686);
                                            i36 = -256972397;
                                        }
                                        break;
                                    case -1287783988:
                                    case -435399468:
                                        if (C2419.f7754 >= 0) {
                                            iM31616 = (C0619.m2761("᩻ܳ") + i33) * 23;
                                            i35 = ((iM31616 ^ i34) * 12193) ^ 255657159;
                                            i36 = 1770623722;
                                        } else {
                                            iM31616 = C0619.m2761("ۧ֫") ^ i34;
                                            i35 = ((iM31616 ^ i33) * (-16737)) ^ 2045136165;
                                            i36 = 1941606905;
                                        }
                                        break;
                                    case -1242771208:
                                    case -176213405:
                                        if (C2310.f7472 >= 0) {
                                            iM31616 = (C0619.m2761("᩻ܳ") + i33) * 23;
                                            i35 = ((iM31616 ^ i34) * 12193) ^ 255657159;
                                            i36 = 1770623722;
                                        } else {
                                            iM31616 = (C0773.m3169("֡ܳ") + i34) * 79;
                                            i35 = ((iM31616 ^ i33) * 26823) ^ (-1465429646);
                                            i36 = -725745159;
                                        }
                                        break;
                                    case -1128666860:
                                    case 1785085911:
                                        C3779.m12264();
                                        iM31616 = C0619.m2761("ۧ֫") ^ i34;
                                        i35 = ((iM31616 ^ i33) * (-16737)) ^ 2045136165;
                                        i36 = 1941606905;
                                        break;
                                    case -723919620:
                                    case 1427614964:
                                        if (C3779.f12953 <= 0) {
                                            iM31616 = (i33 - C0619.m2761("ۡܽ")) * (-113);
                                            i35 = ((iM31616 ^ i34) * 29863) ^ 1503464115;
                                            i36 = -1557168872;
                                        } else {
                                            iM31616 = (i33 - C0619.m2761("᩻ۙ")) * (-123);
                                            i35 = ((iM31616 ^ i34) * (-13777)) ^ (-425583680);
                                            i36 = 805981205;
                                        }
                                        break;
                                    case -459241907:
                                    case 1780054501:
                                        if (C3448.f11240 >= 0) {
                                            iM31616 = (i33 - C0619.m2761("ۡܽ")) * (-113);
                                            i35 = ((iM31616 ^ i34) * 29863) ^ 1503464115;
                                            i36 = -1557168872;
                                        } else {
                                            iM31616 = (i33 - C0619.m2761("᩶ܿ")) * (-81);
                                            i35 = ((iM31616 ^ i34) * 10657) ^ 312321691;
                                            i36 = 2133355939;
                                        }
                                        break;
                                    case -425032476:
                                    case 655414739:
                                        C20932.m47848();
                                        throw new RuntimeException();
                                    case -196362462:
                                    case -94351383:
                                        if (C17202.m40372()) {
                                            iM31616 = (C0773.m3169("֡ۗ") ^ i34) * 13;
                                            i35 = ((iM31616 ^ i33) * 9681) ^ (-1334566418);
                                            i36 = 1039772617;
                                        } else {
                                            iM31616 = (C0619.m2761("᩻ܳ") + i33) * 23;
                                            i35 = ((iM31616 ^ i34) * 12193) ^ 255657159;
                                            i36 = 1770623722;
                                        }
                                        break;
                                    case 478050:
                                    case 1706999909:
                                        if (C4282.f15546 <= 0) {
                                            iM31616 = (i34 - C0773.m3169("ܳۘ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                                            i35 = ((iM31616 ^ i33) * 23649) ^ 1837009956;
                                            i36 = -1179318368;
                                        } else {
                                            iM31616 = (C0773.m3169("ܰۡ") + i33) * (-85);
                                            i35 = ((iM31616 ^ i34) * 29389) ^ 1863650013;
                                            i36 = 1681244162;
                                        }
                                        break;
                                    case 30286098:
                                    case 1081724833:
                                        C1146.m4231();
                                        if (!C17202.f56030) {
                                            iM31616 = C0619.m2761("ܿܽ") ^ i34;
                                            i35 = ((iM31616 ^ i33) * (-24347)) ^ 202803388;
                                            i36 = 640536747;
                                        } else {
                                            iM31616 = (C0619.m2761("᩻ܳ") + i33) * 23;
                                            i35 = ((iM31616 ^ i34) * 12193) ^ 255657159;
                                            i36 = 1770623722;
                                        }
                                        break;
                                    case 1239351573:
                                    case 1994651105:
                                        if (C2287.f7432 >= 0) {
                                            iM31616 = C0619.m2761("ۧ֫") ^ i34;
                                            i35 = ((iM31616 ^ i33) * (-16737)) ^ 2045136165;
                                            i36 = 1941606905;
                                        } else {
                                            iM31616 = C0773.m3169("ۖ۠") ^ i34;
                                            i35 = ((iM31616 ^ i33) * (-29815)) ^ 39465739;
                                            i36 = 1869634458;
                                        }
                                        break;
                                    default:
                                        if (C23916.f77426 <= 0) {
                                            iM31616 = (i34 - C0773.m3169("ܳۘ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                                            i35 = ((iM31616 ^ i33) * 23649) ^ 1837009956;
                                            i36 = -1179318368;
                                        } else {
                                            iM31616 = C0619.m2761("ᩳۘ") ^ i34;
                                            i35 = ((iM31616 ^ i33) * (-30417)) ^ 1082625586;
                                            i36 = 862805206;
                                        }
                                        break;
                                }
                            }
                        }

                        /* JADX WARN: Code duplicated, block: B:42:0x0110  */
                        /* JADX WARN: Code duplicated, block: B:46:0x0140 A[PHI: r11 r13
                          0x0140: PHI (r11v4 android.widget.EditText) = (r11v3 android.widget.EditText), (r11v5 android.widget.EditText) binds: [B:45:0x013e, B:25:0x009f] A[DONT_GENERATE, DONT_INLINE]
                          0x0140: PHI (r13v2 l.۠ۖۧ) = (r13v1 l.۠ۖۧ), (r13v3 l.۠ۖۧ) binds: [B:45:0x013e, B:25:0x009f] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:54:0x0191 A[PHI: r12 r14 r15
                          0x0191: PHI (r12v3 android.widget.EditText) = 
                          (r12v1 android.widget.EditText)
                          (r12v1 android.widget.EditText)
                          (r12v1 android.widget.EditText)
                          (r12v2 android.widget.EditText)
                          (r12v1 android.widget.EditText)
                          (r12v1 android.widget.EditText)
                          (r12v1 android.widget.EditText)
                          (r12v1 android.widget.EditText)
                          (r12v1 android.widget.EditText)
                         binds: [B:53:0x018f, B:49:0x0172, B:37:0x00f3, B:29:0x00be, B:21:0x007e, B:15:0x0064, B:13:0x0060, B:9:0x0040, B:6:0x0037] A[DONT_GENERATE, DONT_INLINE]
                          0x0191: PHI (r14v3 l.֨۠᩻) = 
                          (r14v1 l.֨۠᩻)
                          (r14v1 l.֨۠᩻)
                          (r14v1 l.֨۠᩻)
                          (r14v1 l.֨۠᩻)
                          (r14v2 l.֨۠᩻)
                          (r14v1 l.֨۠᩻)
                          (r14v1 l.֨۠᩻)
                          (r14v1 l.֨۠᩻)
                          (r14v1 l.֨۠᩻)
                         binds: [B:53:0x018f, B:49:0x0172, B:37:0x00f3, B:29:0x00be, B:21:0x007e, B:15:0x0064, B:13:0x0060, B:9:0x0040, B:6:0x0037] A[DONT_GENERATE, DONT_INLINE]
                          0x0191: PHI (r15v3 com.google.android.material.textfield.TextInputLayout) = 
                          (r15v1 com.google.android.material.textfield.TextInputLayout)
                          (r15v1 com.google.android.material.textfield.TextInputLayout)
                          (r15v1 com.google.android.material.textfield.TextInputLayout)
                          (r15v1 com.google.android.material.textfield.TextInputLayout)
                          (r15v2 com.google.android.material.textfield.TextInputLayout)
                          (r15v1 com.google.android.material.textfield.TextInputLayout)
                          (r15v1 com.google.android.material.textfield.TextInputLayout)
                          (r15v1 com.google.android.material.textfield.TextInputLayout)
                          (r15v1 com.google.android.material.textfield.TextInputLayout)
                         binds: [B:53:0x018f, B:49:0x0172, B:37:0x00f3, B:29:0x00be, B:21:0x007e, B:15:0x0064, B:13:0x0060, B:9:0x0040, B:6:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:58:0x01c3  */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view6) {
                            int iM27612;
                            int i32;
                            int i33 = -1626729024;
                            int i34 = C0773.f2792;
                            int i35 = C20932.f66974;
                            int iM31616 = (i34 - C0773.m3169("۫ܿ")) * (-21);
                            int i36 = ((iM31616 ^ i35) * (-29017)) ^ (-1464869054);
                            int i37 = iM31616 ^ (-965002282);
                            EditText editText5 = null;
                            DialogInterfaceC8327 dialogInterfaceC83210 = null;
                            EditText editText6 = null;
                            ViewOnClickListenerC1057 viewOnClickListenerC1057 = null;
                            TextInputLayout textInputLayout5 = null;
                            while (true) {
                                i33 = i37 ^ ((((i33 ^ i35) * 7927) >> 31) & i36);
                                switch (i33) {
                                    case -1699989027:
                                    case 571877711:
                                        if (C0862.f3233 != 0) {
                                            iM27612 = (C0619.m2761("ۤܿ") ^ i34) * 45;
                                            i36 = ((iM27612 ^ i35) * (-7289)) ^ 670274477;
                                            i32 = -702598839;
                                        } else {
                                            iM27612 = C0619.m2761("ۡ᩻") ^ i34;
                                            i36 = ((iM27612 ^ i35) * (-31619)) ^ 1276237506;
                                            i32 = -996870463;
                                        }
                                        i37 = iM27612 ^ i32;
                                        break;
                                    case -1581241185:
                                    case -302590500:
                                        dialogInterfaceC83210 = dialogInterfaceC8328;
                                        editText6 = editText3;
                                        if (C4282.f15546 <= 0) {
                                            iM27612 = (C0619.m2761("᩵ۨ") + i34) * (-67);
                                            i36 = ((iM27612 ^ i35) * 31833) ^ 29150044;
                                            i32 = -1065283201;
                                        } else {
                                            iM27612 = (C0619.m2761("ܽܰ") + i35) * (-17);
                                            i36 = ((iM27612 ^ i34) * 31337) ^ (-1248544217);
                                            i32 = 129470481;
                                        }
                                        i37 = iM27612 ^ i32;
                                        break;
                                    case -1364041511:
                                    case 89542738:
                                        if (C1343.f4799 != 0) {
                                            iM27612 = (C0619.m2761("᩵ۨ") + i34) * (-67);
                                            i36 = ((iM27612 ^ i35) * 31833) ^ 29150044;
                                            i32 = -1065283201;
                                        } else {
                                            iM27612 = (C0619.m2761("۫ۛ") + i35) * 27;
                                            i36 = ((iM27612 ^ i34) * 11613) ^ 209336116;
                                            i32 = 421282986;
                                        }
                                        i37 = iM27612 ^ i32;
                                        break;
                                    case -1240833582:
                                    case -1007176914:
                                        if (C2834.f9334 <= 0) {
                                            iM27612 = (i35 - C0619.m2761("ۨۢ")) * (-79);
                                            i36 = ((iM27612 ^ i34) * 25209) ^ (-540907908);
                                            i32 = -1154051500;
                                        } else {
                                            iM27612 = C0619.m2761("֨ܺ") ^ i35;
                                            i36 = ((iM27612 ^ i34) * (-14589)) ^ 1275734899;
                                            i32 = 1201495900;
                                        }
                                        i37 = iM27612 ^ i32;
                                        break;
                                    case -1219596387:
                                    case 1600746033:
                                        if (C2419.f7754 >= 0) {
                                            iM27612 = (C0619.m2761("۠ۖ") ^ i34) * 67;
                                            i36 = ((iM27612 ^ i35) * (-7953)) ^ 1199810253;
                                            i32 = -749171155;
                                        } else {
                                            iM27612 = C0619.m2761("۬ۧ") ^ i35;
                                            i36 = ((iM27612 ^ i34) * 3701) ^ (-43742591);
                                            i32 = -366158459;
                                        }
                                        i37 = iM27612 ^ i32;
                                        break;
                                    case -1159001225:
                                    case 803266169:
                                        viewOnClickListenerC1057 = this;
                                        textInputLayout5 = textInputLayout3;
                                        if (C2310.f7472 >= 0) {
                                            iM27612 = (i35 - C0619.m2761("ۨۢ")) * (-79);
                                            i36 = ((iM27612 ^ i34) * 25209) ^ (-540907908);
                                            i32 = -1154051500;
                                        } else {
                                            iM27612 = (C0619.m2761("᩺ܺ") ^ i34) * (-7);
                                            i36 = ((iM27612 ^ i35) * 19209) ^ (-793374469);
                                            i32 = -938791955;
                                        }
                                        i37 = iM27612 ^ i32;
                                        break;
                                    case -1059010437:
                                    case -501024711:
                                        if (C20932.m47848() != 0) {
                                            iM27612 = (i35 - C0619.m2761("ۨۢ")) * (-79);
                                            i36 = ((iM27612 ^ i34) * 25209) ^ (-540907908);
                                            i32 = -1154051500;
                                        } else {
                                            iM27612 = (i34 - C0619.m2761("ۖ֡")) * (-53);
                                            i36 = ((iM27612 ^ i35) * 6123) ^ (-1182543641);
                                            i32 = 1167668885;
                                        }
                                        i37 = iM27612 ^ i32;
                                        break;
                                    case -836099143:
                                    case -738930522:
                                        if (C1542.m5459() < 0) {
                                            iM27612 = (i35 - C0619.m2761("ۨۢ")) * (-79);
                                            i36 = ((iM27612 ^ i34) * 25209) ^ (-540907908);
                                            i32 = -1154051500;
                                        } else {
                                            iM27612 = (C0619.m2761("ۤܿ") ^ i34) * 45;
                                            i36 = ((iM27612 ^ i35) * (-7289)) ^ 670274477;
                                            i32 = -702598839;
                                        }
                                        i37 = iM27612 ^ i32;
                                        break;
                                    case -491763853:
                                    case 364393612:
                                        ViewOnClickListenerC1057.m3976(editText6, editText5, dialogInterfaceC83210, viewOnClickListenerC1057, textInputLayout5, textInputLayout4);
                                        break;
                                    case -466695166:
                                    case 1834033483:
                                        if (C2966.f9654 >= 0) {
                                            iM27612 = (C0619.m2761("ۤܿ") ^ i34) * 45;
                                            i36 = ((iM27612 ^ i35) * (-7289)) ^ 670274477;
                                            i32 = -702598839;
                                        } else {
                                            iM27612 = C0773.m3169("᩻ۘ") ^ i35;
                                            i36 = ((iM27612 ^ i34) * (-17997)) ^ (-1112612964);
                                            i32 = 1284683799;
                                        }
                                        i37 = iM27612 ^ i32;
                                        break;
                                    case -201467581:
                                    case 330084999:
                                        C3077.m10041();
                                        RunnableC0334.m2063();
                                        iM27612 = (i35 - C0619.m2761("ۨۢ")) * (-79);
                                        i36 = ((iM27612 ^ i34) * 25209) ^ (-540907908);
                                        i32 = -1154051500;
                                        i37 = iM27612 ^ i32;
                                        break;
                                    case -181025775:
                                    case 1881457231:
                                        C2375.m8065();
                                        break;
                                    case -121844784:
                                    case 1717390127:
                                        editText5 = editText4;
                                        if (AbstractC0641.f2496 >= 0) {
                                            iM27612 = (i35 - C0619.m2761("ۨۢ")) * (-79);
                                            i36 = ((iM27612 ^ i34) * 25209) ^ (-540907908);
                                            i32 = -1154051500;
                                        } else {
                                            iM27612 = C0773.m3169("᩻֫") ^ i34;
                                            i36 = ((iM27612 ^ i35) * (-22323)) ^ (-38960689);
                                            i32 = -1620338715;
                                        }
                                        i37 = iM27612 ^ i32;
                                        break;
                                    case 13056095:
                                    case 583650109:
                                        if (C2966.m9664()) {
                                            iM27612 = (C0773.m3169("ܿۡ") ^ i34) * (-87);
                                            i36 = ((iM27612 ^ i35) * (-2455)) ^ (-881610019);
                                            i32 = 155301937;
                                        } else {
                                            iM27612 = (i35 - C0619.m2761("ۨۢ")) * (-79);
                                            i36 = ((iM27612 ^ i34) * 25209) ^ (-540907908);
                                            i32 = -1154051500;
                                        }
                                        i37 = iM27612 ^ i32;
                                        break;
                                    case 1059906739:
                                    case 1995277710:
                                        C1783.m6232();
                                        if (C17202.f56030) {
                                            iM27612 = (i35 - C0619.m2761("ۨۢ")) * (-79);
                                            i36 = ((iM27612 ^ i34) * 25209) ^ (-540907908);
                                            i32 = -1154051500;
                                        } else {
                                            iM27612 = (C0619.m2761("۠ۖ") ^ i34) * 67;
                                            i36 = ((iM27612 ^ i35) * (-7953)) ^ 1199810253;
                                            i32 = -749171155;
                                        }
                                        i37 = iM27612 ^ i32;
                                        break;
                                    default:
                                        if (C0950.f3488 >= 0) {
                                            iM27612 = (i35 - C0619.m2761("ۨۢ")) * (-79);
                                            i36 = ((iM27612 ^ i34) * 25209) ^ (-540907908);
                                            i32 = -1154051500;
                                        } else {
                                            iM27612 = (i35 - C0619.m2761("ܳۖ")) * 19;
                                            i36 = ((iM27612 ^ i34) * (-22951)) ^ (-23745240);
                                            i32 = -19587328;
                                        }
                                        i37 = iM27612 ^ i32;
                                        break;
                                }
                                return;
                            }
                        }
                    };
                    int iM27612 = (i17 - C0619.m2761("ᩴܺ")) * (-29);
                    i26 = i26;
                    s2 = s4;
                    i20 = i20;
                    onClickListener2 = onClickListener4;
                    i27 = i31;
                    dialogInterfaceC8327M10090 = dialogInterfaceC8329;
                    i19 = iM27612 ^ (-1974994787);
                    i18 = ((iM27612 ^ i16) * (-4813)) ^ (-94071095);
                    sArr4 = sArr4;
                    view3 = viewM9336;
                    sArr6 = sArr6;
                    break;
                case -619979835:
                case 1371863793:
                    dialogInterfaceC8327 = dialogInterfaceC8327M10090;
                    sArr6 = sArr6;
                    i27 = i27;
                    sArr = sArr4;
                    s = s2;
                    i2 = i20;
                    i3 = i26;
                    viewM9334 = C2834.m9333(viewM2812, C0619.m2761(strM4939) ^ 2100219434);
                    if (C1146.f4234 < 0) {
                        iM2763 = C0619.m2761("ۢۘ") ^ i17;
                        i11 = ((iM2763 ^ i16) * (-25577)) ^ 796147951;
                        i12 = -567966170;
                        i19 = iM2763 ^ i12;
                        i18 = i11;
                        i26 = i3;
                        s2 = s;
                        i20 = i2;
                        i27 = i27;
                        dialogInterfaceC8327M10090 = dialogInterfaceC8327;
                        sArr4 = sArr;
                        sArr6 = sArr6;
                    }
                    viewM9333 = viewM9333;
                    str2 = str4;
                    sArr3 = sArr5;
                    int iM27613 = (C0619.m2761("ܰۡ") ^ i16) * 57;
                    i8 = ((iM27613 ^ i17) * (-2671)) ^ (-1842277333);
                    i19 = iM27613 ^ (-1545367504);
                    str4 = str2;
                    sArr5 = sArr3;
                    viewM9333 = viewM9333;
                    i18 = i8;
                    i26 = i3;
                    s2 = s;
                    i20 = i2;
                    i27 = i27;
                    dialogInterfaceC8327M10090 = dialogInterfaceC8327;
                    sArr4 = sArr;
                    sArr6 = sArr6;
                    break;
                case -452221288:
                case -276092601:
                    dialogInterfaceC8327 = dialogInterfaceC8327M10090;
                    sArr6 = sArr6;
                    i27 = i27;
                    sArr = sArr4;
                    s = s2;
                    i2 = i20;
                    i3 = i26;
                    sArr3 = sArr5;
                    String strM1785 = C0269.m1785(sArr3, 377, 17, i3);
                    viewM9333 = viewM9333;
                    C2310.m7811(viewM9333, strM1785);
                    if (RunnableC0334.f1808 > 0) {
                        int iM31616 = (C0773.m3169("۫ۨ") ^ i17) * (-11);
                        i8 = ((iM31616 ^ i16) * 4289) ^ 472458583;
                        i19 = iM31616 ^ (-563265891);
                        str4 = strM1785;
                        sArr5 = sArr3;
                        viewM9333 = viewM9333;
                        i18 = i8;
                        i26 = i3;
                        s2 = s;
                        i20 = i2;
                        i27 = i27;
                        dialogInterfaceC8327M10090 = dialogInterfaceC8327;
                        sArr4 = sArr;
                        sArr6 = sArr6;
                    } else {
                        str4 = strM1785;
                        int iM27614 = (i16 - C0619.m2761("ܰۤ")) * 21;
                        i19 = iM27614 ^ (-1114981428);
                        i18 = ((iM27614 ^ i17) * (-20203)) ^ (-370297138);
                        sArr5 = sArr3;
                        viewM9333 = viewM9333;
                        i26 = i3;
                        s2 = s;
                        i20 = i2;
                        i27 = i27;
                        dialogInterfaceC8327M10090 = dialogInterfaceC8327;
                        sArr4 = sArr;
                        sArr6 = sArr6;
                    }
                    break;
                case -326606438:
                case 1291501988:
                    dialogInterfaceC8327 = dialogInterfaceC8327M10090;
                    sArr6 = sArr6;
                    i27 = i27;
                    str3 = str4;
                    sArr = sArr4;
                    s = s2;
                    i2 = i20;
                    i3 = i26;
                    textInputLayout = (TextInputLayout) viewM9333;
                    iM31611 = C0773.m3169(C3099.m10092(f3786, 394, 3, i3));
                    iM2762 = (i17 - C0619.m2761("۠ۚ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                    i9 = ((iM2762 ^ i16) * (-8717)) ^ (-1277502657);
                    i10 = -1308535737;
                    i19 = iM2762 ^ i10;
                    str4 = str3;
                    i18 = i9;
                    i26 = i3;
                    s2 = s;
                    i20 = i2;
                    i27 = i27;
                    dialogInterfaceC8327M10090 = dialogInterfaceC8327;
                    sArr4 = sArr;
                    sArr6 = sArr6;
                    break;
                case -144672127:
                case 1124939036:
                    dialogInterfaceC8327 = dialogInterfaceC8327M10090;
                    sArr6 = sArr6;
                    i27 = i27;
                    sArr = sArr4;
                    s = s2;
                    i2 = i20;
                    i3 = i26;
                    View viewM11246 = C3448.m11246(viewM2812, iM31611 ^ 2099953631);
                    str3 = str4;
                    C2310.m7811(viewM11246, str3);
                    if (C3690.f12684 <= 0) {
                        view4 = viewM11246;
                        iM2762 = (C0619.m2761("᩹ۗ") + i17) * 43;
                        i9 = ((iM2762 ^ i16) * 27769) ^ (-1045270396);
                        i10 = 1475393801;
                        i19 = iM2762 ^ i10;
                        str4 = str3;
                        i18 = i9;
                    } else {
                        int iM31617 = C0773.m3169("ۚܶ") ^ i16;
                        i19 = iM31617 ^ (-659442056);
                        view4 = viewM11246;
                        str4 = str3;
                        i18 = ((iM31617 ^ i17) * 3215) ^ (-276629353);
                    }
                    i26 = i3;
                    s2 = s;
                    i20 = i2;
                    i27 = i27;
                    dialogInterfaceC8327M10090 = dialogInterfaceC8327;
                    sArr4 = sArr;
                    sArr6 = sArr6;
                    break;
                case -117179379:
                case 1203886563:
                    dialogInterfaceC8327 = dialogInterfaceC8327M10090;
                    sArr6 = sArr6;
                    i27 = i27;
                    str = str4;
                    sArr = sArr4;
                    i = i25;
                    s = s2;
                    i2 = i20;
                    view2 = viewM9333;
                    i4 = i24;
                    i3 = i26;
                    sArr2 = sArr5;
                    view = view3;
                    onClickListener = onClickListener2;
                    iM31610 = C0773.m3169(C1146.m4222(f3786, 371, 3, i3));
                    i21 = 2103137948;
                    if (!C2023.f6737) {
                        iM2761 = C0619.m2761("ܺܽ") ^ i17;
                        i5 = ((iM2761 ^ i16) * (-235)) ^ (-318539716);
                        i6 = 1748274040;
                        i19 = iM2761 ^ i6;
                        i18 = i5;
                        sArr5 = sArr2;
                        i25 = i;
                        i26 = i3;
                        i24 = i4;
                        view3 = view;
                        i20 = i2;
                        onClickListener2 = onClickListener;
                        dialogInterfaceC8327M10090 = dialogInterfaceC8327;
                        str4 = str;
                        viewM9333 = view2;
                        sArr4 = sArr;
                        s2 = s;
                        sArr6 = sArr6;
                        i27 = i27;
                    } else {
                        sArr5 = sArr2;
                        int iM31618 = C0773.m3169("ۧۨ") ^ i16;
                        i19 = iM31618 ^ (-918686307);
                        i18 = ((iM31618 ^ i17) * (-24457)) ^ 794491880;
                        i25 = i;
                        i26 = i3;
                        i24 = i4;
                        view3 = view;
                        i20 = i2;
                        onClickListener2 = onClickListener;
                        dialogInterfaceC8327M10090 = dialogInterfaceC8327;
                        str4 = str;
                        viewM9333 = view2;
                        sArr4 = sArr;
                        s2 = s;
                        sArr6 = sArr6;
                        i27 = i27;
                    }
                    break;
                case -5472072:
                case 1163873223:
                    dialogInterfaceC8327 = dialogInterfaceC8327M10090;
                    sArr6 = sArr6;
                    i27 = i27;
                    str = str4;
                    sArr = sArr4;
                    int i32 = i24;
                    i = i25;
                    s = s2;
                    i2 = i20;
                    i3 = i26;
                    viewM9333 = C2834.m9333(viewM2812, C0619.m2761(C0619.m2756(sArr, i32, i, i3)) ^ 2099180286);
                    sArr5 = f3786;
                    if (!C0619.f2439) {
                        int iM27615 = C0619.m2761("֨۠") ^ i16;
                        i19 = iM27615 ^ 1969953072;
                        i24 = i32;
                        str4 = str;
                        i18 = ((iM27615 ^ i17) * 30593) ^ 241747615;
                        i25 = i;
                        i26 = i3;
                        s2 = s;
                        i20 = i2;
                        i27 = i27;
                        dialogInterfaceC8327M10090 = dialogInterfaceC8327;
                        sArr4 = sArr;
                        sArr6 = sArr6;
                    } else {
                        view = view3;
                        onClickListener = onClickListener2;
                        view2 = viewM9333;
                        i4 = i32;
                        int iM31619 = C0773.m3169("ۧۨ") ^ i16;
                        i19 = iM31619 ^ (-918686307);
                        i18 = ((iM31619 ^ i17) * (-24457)) ^ 794491880;
                        i25 = i;
                        i26 = i3;
                        i24 = i4;
                        view3 = view;
                        i20 = i2;
                        onClickListener2 = onClickListener;
                        dialogInterfaceC8327M10090 = dialogInterfaceC8327;
                        str4 = str;
                        viewM9333 = view2;
                        sArr4 = sArr;
                        s2 = s;
                        sArr6 = sArr6;
                        i27 = i27;
                    }
                    break;
                case 88280312:
                case 410785813:
                    dialogInterfaceC8327 = dialogInterfaceC8327M10090;
                    sArr6 = sArr6;
                    i27 = i27;
                    sArr = sArr4;
                    s = s2;
                    i2 = i20;
                    i3 = i26;
                    editText = (EditText) viewM9334;
                    iM2765 = C0619.m2761(RunnableC3646.m11809(f3786, 400, 3, i3));
                    if (C1146.f4234 < 0) {
                        iM2763 = C0619.m2761("ۤܳ") ^ i16;
                        i11 = ((iM2763 ^ i17) * 26183) ^ (-559945567);
                        i12 = -487514490;
                        i19 = iM2763 ^ i12;
                        i18 = i11;
                        i26 = i3;
                        s2 = s;
                        i20 = i2;
                        i27 = i27;
                        dialogInterfaceC8327M10090 = dialogInterfaceC8327;
                        sArr4 = sArr;
                        sArr6 = sArr6;
                    } else {
                        sArr3 = sArr5;
                        int iM27616 = (i16 - C0619.m2761("ܰۤ")) * 21;
                        i19 = iM27616 ^ (-1114981428);
                        i18 = ((iM27616 ^ i17) * (-20203)) ^ (-370297138);
                        sArr5 = sArr3;
                        viewM9333 = viewM9333;
                        i26 = i3;
                        s2 = s;
                        i20 = i2;
                        i27 = i27;
                        dialogInterfaceC8327M10090 = dialogInterfaceC8327;
                        sArr4 = sArr;
                        sArr6 = sArr6;
                    }
                    break;
                case 250267631:
                case 1688913742:
                    if (!C17202.f56030) {
                        dialogInterfaceC8327 = dialogInterfaceC8327M10090;
                        sArr6 = sArr6;
                        i27 = i27;
                        sArr = sArr4;
                        s = s2;
                        i2 = i20;
                        i3 = i26;
                        sArr3 = sArr5;
                        int iM27617 = (i16 - C0619.m2761("ܰۤ")) * 21;
                        i19 = iM27617 ^ (-1114981428);
                        i18 = ((iM27617 ^ i17) * (-20203)) ^ (-370297138);
                        sArr5 = sArr3;
                        viewM9333 = viewM9333;
                        i26 = i3;
                        s2 = s;
                        i20 = i2;
                        i27 = i27;
                        dialogInterfaceC8327M10090 = dialogInterfaceC8327;
                        sArr4 = sArr;
                        sArr6 = sArr6;
                    } else {
                        onClickListener = onClickListener2;
                        dialogInterfaceC8327 = dialogInterfaceC8327M10090;
                        sArr6 = sArr6;
                        i27 = i27;
                        str = str4;
                        sArr = sArr4;
                        i = i25;
                        view = view3;
                        s = s2;
                        i2 = i20;
                        view2 = viewM9333;
                        i4 = i24;
                        i3 = i26;
                        int iM316110 = C0773.m3169("ۧۨ") ^ i16;
                        i19 = iM316110 ^ (-918686307);
                        i18 = ((iM316110 ^ i17) * (-24457)) ^ 794491880;
                        i25 = i;
                        i26 = i3;
                        i24 = i4;
                        view3 = view;
                        i20 = i2;
                        onClickListener2 = onClickListener;
                        dialogInterfaceC8327M10090 = dialogInterfaceC8327;
                        str4 = str;
                        viewM9333 = view2;
                        sArr4 = sArr;
                        s2 = s;
                        sArr6 = sArr6;
                        i27 = i27;
                    }
                    break;
                case 413800219:
                case 1499275500:
                    C2288.m7767();
                    if (C1826.m6301() < 0) {
                        dialogInterfaceC8327 = dialogInterfaceC8327M10090;
                        sArr6 = sArr6;
                        i27 = i27;
                        str3 = str4;
                        sArr = sArr4;
                        s = s2;
                        i2 = i20;
                        i3 = i26;
                        iM2762 = (C0619.m2761("᩹ۗ") + i17) * 43;
                        i9 = ((iM2762 ^ i16) * 27769) ^ (-1045270396);
                        i10 = 1475393801;
                        i19 = iM2762 ^ i10;
                        str4 = str3;
                        i18 = i9;
                        i26 = i3;
                        s2 = s;
                        i20 = i2;
                        i27 = i27;
                        dialogInterfaceC8327M10090 = dialogInterfaceC8327;
                        sArr4 = sArr;
                        sArr6 = sArr6;
                    }
                    dialogInterfaceC8327 = dialogInterfaceC8327M10090;
                    sArr6 = sArr6;
                    i27 = i27;
                    sArr = sArr4;
                    s = s2;
                    i2 = i20;
                    i3 = i26;
                    sArr3 = sArr5;
                    int iM27618 = (i16 - C0619.m2761("ܰۤ")) * 21;
                    i19 = iM27618 ^ (-1114981428);
                    i18 = ((iM27618 ^ i17) * (-20203)) ^ (-370297138);
                    sArr5 = sArr3;
                    viewM9333 = viewM9333;
                    i26 = i3;
                    s2 = s;
                    i20 = i2;
                    i27 = i27;
                    dialogInterfaceC8327M10090 = dialogInterfaceC8327;
                    sArr4 = sArr;
                    sArr6 = sArr6;
                    break;
                default:
                    TextView textView = (TextView) viewM9335;
                    C2930.m9576(textView);
                    C2375.m8070(textView, new View.OnClickListener() { // from class: l.ᩳۖ᩻

                        /* JADX INFO: renamed from: ᩶ܿۡ, reason: not valid java name and contains not printable characters */
                        private static final short[] f60996 = {6869, -6681, 3491, 3320, 7056, -7626, -2760, -26681, -26680, -26673, -26683, -26633, -26680, -26684, -26666, -26653, -26664, -26648, -26683, -26743, -26737, -26737, -26737, -26744, 3361, 6292, -12984, 4281, -6381, -4016, 696, -15725, -16073, -15769, -6544, 4954, -2172, -15359, -13779, 5284, -3791, -12915};

                        {
                            int i33 = 471839844;
                            int i34 = C1321.f4751;
                            int i35 = C2354.f7599;
                            int iM27619 = C0619.m2761("۟ۨ") ^ i35;
                            int i36 = ((iM27619 ^ i34) * (-1109)) ^ (-2060842695);
                            int i37 = 900737250;
                            while (true) {
                                i33 = ((((i33 ^ i34) * (-24589)) >> 31) & i36) ^ (iM27619 ^ i37);
                                switch (i33) {
                                    case -2095912377:
                                    case 168282933:
                                        if (C11235.f35427 >= 0) {
                                            iM27619 = C0619.m2761("ۧۚ") ^ i34;
                                            i36 = ((iM27619 ^ i35) * 13173) ^ 1166456926;
                                            i37 = -178190832;
                                        } else {
                                            iM27619 = (C0773.m3169("֫᩺") + i35) * 75;
                                            i36 = ((iM27619 ^ i34) * 26205) ^ 1998938445;
                                            i37 = 1559524826;
                                        }
                                        break;
                                    case -2011083418:
                                    case 1329604424:
                                        C0619.m2763();
                                        throw new RuntimeException();
                                    case -1751411524:
                                    case 332766250:
                                        if (C2702.f8586 <= 0) {
                                            iM27619 = C0619.m2761("ۧۚ") ^ i34;
                                            i36 = ((iM27619 ^ i35) * 13173) ^ 1166456926;
                                            i37 = -178190832;
                                        } else {
                                            iM27619 = C0619.m2761("᩶ۗ") ^ i35;
                                            i36 = ((iM27619 ^ i34) * (-1203)) ^ 1497430508;
                                            i37 = -551348743;
                                        }
                                        break;
                                    case -1711454031:
                                    case 1842886733:
                                        return;
                                    case -1625657730:
                                    case 1408828856:
                                        C2966.m9664();
                                        C2310.m7813();
                                        iM27619 = C0619.m2761("᩶ۗ") ^ i35;
                                        i36 = ((iM27619 ^ i34) * (-1203)) ^ 1497430508;
                                        i37 = -551348743;
                                        break;
                                    case -1613357107:
                                    case 273252273:
                                        if (C23916.f77426 <= 0) {
                                            iM27619 = (C0619.m2761("ܽ۟") + i35) * 87;
                                            i36 = ((iM27619 ^ i34) * (-27433)) ^ 1720202117;
                                            i37 = 52710260;
                                        } else {
                                            iM27619 = (C0619.m2761("᩵ۘ") + i34) * 119;
                                            i36 = ((iM27619 ^ i35) * 21363) ^ (-1077759942);
                                            i37 = 1362085239;
                                        }
                                        break;
                                    case -1586352190:
                                    case 1501801641:
                                        if (C23916.f77426 <= 0) {
                                            iM27619 = C0619.m2761("ۧۚ") ^ i34;
                                            i36 = ((iM27619 ^ i35) * 13173) ^ 1166456926;
                                            i37 = -178190832;
                                        } else {
                                            iM27619 = (C0619.m2761("ܿᩴ") ^ i35) * 123;
                                            i36 = ((iM27619 ^ i34) * (-27259)) ^ 845310611;
                                            i37 = -525232869;
                                        }
                                        break;
                                    case -1513031013:
                                    case -6990348:
                                        if (C0487.f2131 <= 0) {
                                            iM27619 = C0619.m2761("᩶ۗ") ^ i35;
                                            i36 = ((iM27619 ^ i34) * (-1203)) ^ 1497430508;
                                            i37 = -551348743;
                                        } else {
                                            iM27619 = (C0773.m3169("۫ܿ") + i34) * (-113);
                                            i36 = ((iM27619 ^ i35) * 23129) ^ 1030070978;
                                            i37 = -682536573;
                                        }
                                        break;
                                    case -1242383364:
                                    case 1437890861:
                                        if (C2966.f9654 >= 0) {
                                            iM27619 = (C0619.m2761("ܽ۟") + i35) * 87;
                                            i36 = ((iM27619 ^ i34) * (-27433)) ^ 1720202117;
                                            i37 = 52710260;
                                        } else {
                                            iM27619 = C0619.m2761("᩶ۗ") ^ i35;
                                            i36 = ((iM27619 ^ i34) * (-1203)) ^ 1497430508;
                                            i37 = -551348743;
                                        }
                                        break;
                                    case -1204399038:
                                    case 1359319601:
                                        if (C3033.f9831 >= 0) {
                                            iM27619 = C0773.m3169("᩻ۡ") ^ i35;
                                            i36 = ((iM27619 ^ i34) * 11851) ^ 847120739;
                                            i37 = -1602485615;
                                        } else {
                                            iM27619 = C0619.m2761("ܿ᩷") ^ i35;
                                            i36 = ((iM27619 ^ i34) * 8333) ^ (-1203053013);
                                            i37 = -38221115;
                                        }
                                        break;
                                    case -1104867076:
                                    case 952935779:
                                        if (AbstractC0116.m1243() != 0) {
                                            iM27619 = (C0619.m2761("ܽ۟") + i35) * 87;
                                            i36 = ((iM27619 ^ i34) * (-27433)) ^ 1720202117;
                                            i37 = 52710260;
                                        } else {
                                            iM27619 = C0619.m2761("ۚ֨") ^ i34;
                                            i36 = ((iM27619 ^ i35) * (-22769)) ^ (-1014266649);
                                            i37 = -598082121;
                                        }
                                        break;
                                    case -409472499:
                                    case 1284738154:
                                        if (RunnableC3055.f9898 >= 0) {
                                            iM27619 = (C0619.m2761("ܽ۟") + i35) * 87;
                                            i36 = ((iM27619 ^ i34) * (-27433)) ^ 1720202117;
                                            i37 = 52710260;
                                        } else {
                                            iM27619 = (C0619.m2761("֨ۙ") ^ i34) * 65;
                                            i36 = ((iM27619 ^ i35) * 10513) ^ (-509910904);
                                            i37 = -811576947;
                                        }
                                        break;
                                    case 599758309:
                                    case 1118733369:
                                        if (C2702.f8586 <= 0) {
                                            iM27619 = C0619.m2761("ۧۚ") ^ i34;
                                            i36 = ((iM27619 ^ i35) * 13173) ^ 1166456926;
                                            i37 = -178190832;
                                        } else {
                                            iM27619 = (C0773.m3169("ۧᩳ") ^ i35) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                            i36 = ((iM27619 ^ i34) * 7013) ^ 825951940;
                                            i37 = -633218543;
                                        }
                                        break;
                                    case 807350471:
                                    case 1645063051:
                                        if (C3099.f10023 <= 0) {
                                            iM27619 = (i34 - C0773.m3169("ۙۖ")) * (-49);
                                            i36 = ((iM27619 ^ i35) * 3173) ^ 649929291;
                                            i37 = 1230197551;
                                        } else {
                                            iM27619 = (C0619.m2761("ܽ۟") + i35) * 87;
                                            i36 = ((iM27619 ^ i34) * (-27433)) ^ 1720202117;
                                            i37 = 52710260;
                                        }
                                        break;
                                    case 1162303566:
                                    case 2059532482:
                                        if (C0950.f3488 >= 0) {
                                            iM27619 = (i34 - C0773.m3169("ۙۖ")) * (-49);
                                            i36 = ((iM27619 ^ i35) * 3173) ^ 649929291;
                                            i37 = 1230197551;
                                        } else {
                                            iM27619 = (C0619.m2761("᩵ܶ") ^ i35) * 81;
                                            i36 = ((iM27619 ^ i34) * 8349) ^ 403939566;
                                            i37 = -1087741456;
                                        }
                                        break;
                                    default:
                                        if (C3492.f12043 <= 0) {
                                            iM27619 = (C0619.m2761("ܽ۟") + i35) * 87;
                                            i36 = ((iM27619 ^ i34) * (-27433)) ^ 1720202117;
                                            i37 = 52710260;
                                        } else {
                                            iM27619 = (i34 - C0619.m2761("֫۠")) * (-23);
                                            i36 = ((iM27619 ^ i35) * 4047) ^ (-896219543);
                                            i37 = 1498530151;
                                        }
                                        break;
                                }
                            }
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view6) {
                            int i33;
                            int i34;
                            int i35;
                            DialogInterfaceC8327 dialogInterfaceC83210;
                            int i36;
                            int i37;
                            int iM31620;
                            int i38;
                            EditText editText5;
                            short[] sArr10;
                            int iM27619;
                            int i39;
                            int i40;
                            int i41;
                            View view7;
                            short[] sArr11;
                            String str6;
                            int i42;
                            int i43;
                            int i44;
                            View view8;
                            short[] sArr12;
                            int i45;
                            int i46;
                            short[] sArr13;
                            short[] sArr14;
                            int i47;
                            int i48;
                            int i49;
                            int i50;
                            int i51;
                            short s5;
                            int i52;
                            int i53;
                            int i54;
                            DialogInterfaceC8327 dialogInterfaceC83211;
                            int i55;
                            String str7;
                            int i56;
                            int i57;
                            int i58;
                            EditText editText6;
                            int i59;
                            int iM31621;
                            int i60;
                            short s6;
                            int i61;
                            int i62;
                            int i63;
                            int i64;
                            DialogInterfaceC8327 dialogInterfaceC83212;
                            int i65;
                            String str8;
                            int i66;
                            EditText editText7;
                            int iM27620;
                            int iM27621;
                            int i67;
                            int i68;
                            int i69;
                            EditText editText8 = null;
                            short[] sArr15 = null;
                            int i70 = 803832764;
                            int i71 = C2310.f7472;
                            int i72 = C1542.f5343;
                            int iM31622 = (C0773.m3169("ۧ۬") ^ i71) * (-115);
                            int i73 = ((iM31622 ^ i72) * (-7517)) ^ 350573819;
                            int i74 = iM31622 ^ (-1201842624);
                            View view9 = null;
                            TextInputLayout textInputLayout5 = null;
                            TextInputLayout textInputLayout6 = null;
                            EditText editText9 = null;
                            DialogInterfaceC8327 dialogInterfaceC8327M10091 = null;
                            short[] sArr16 = null;
                            short[] sArr17 = null;
                            short[] sArr18 = null;
                            short[] sArr19 = null;
                            short s7 = 0;
                            int i75 = 0;
                            int iM31623 = 0;
                            final ViewOnClickListenerC1057 viewOnClickListenerC1057 = null;
                            int i76 = 0;
                            int i77 = 0;
                            int iM27622 = 0;
                            int iM31624 = 0;
                            int i78 = 0;
                            int i79 = 0;
                            int i80 = 0;
                            int i81 = 0;
                            View viewM2813 = null;
                            String str9 = null;
                            int i82 = 0;
                            int iM27623 = 0;
                            while (true) {
                                i70 = i74 ^ (i73 & (((i70 ^ i72) * (-23485)) >> 31));
                                switch (i70) {
                                    case -2023794956:
                                    case -1812740762:
                                        short s8 = s7;
                                        i59 = i75;
                                        int i83 = iM27623;
                                        int i84 = iM31623;
                                        DialogInterfaceC8327 dialogInterfaceC83213 = dialogInterfaceC8327M10091;
                                        int i85 = i76;
                                        i77 = i77;
                                        View view10 = view9;
                                        short[] sArr20 = sArr15;
                                        String str10 = str9;
                                        int i86 = i80;
                                        short[] sArr21 = sArr16;
                                        int i87 = i82;
                                        EditText editText10 = editText8;
                                        int i88 = i79;
                                        short[] sArr22 = sArr19;
                                        int i89 = i81;
                                        int i90 = s8 + 5774;
                                        if ((i90 * i90) - i78 >= 0) {
                                            int iM27624 = C0619.m2761("᩷ܰ") ^ i71;
                                            i81 = i89;
                                            str9 = str10;
                                            sArr19 = sArr22;
                                            i80 = i86;
                                            sArr16 = sArr21;
                                            iM27623 = i83;
                                            view9 = view10;
                                            sArr15 = sArr20;
                                            i79 = i88;
                                            editText8 = editText10;
                                            iM31623 = i84;
                                            dialogInterfaceC8327M10091 = dialogInterfaceC83213;
                                            i76 = i85;
                                            i74 = iM27624 ^ (-978545797);
                                            s7 = s8;
                                            i73 = ((iM27624 ^ i72) * (-16083)) ^ 1464417776;
                                            i82 = i87;
                                            i75 = i59;
                                            i77 = i77;
                                        } else {
                                            int iM27625 = C0619.m2761("᩺ۚ") ^ i72;
                                            int i91 = ((iM27625 ^ i71) * (-19271)) ^ 1145286104;
                                            i81 = i89;
                                            str9 = str10;
                                            sArr19 = sArr22;
                                            i80 = i86;
                                            sArr16 = sArr21;
                                            iM27623 = i83;
                                            view9 = view10;
                                            sArr15 = sArr20;
                                            i79 = i88;
                                            editText8 = editText10;
                                            iM31623 = i84;
                                            dialogInterfaceC8327M10091 = dialogInterfaceC83213;
                                            i76 = i85;
                                            s7 = s8;
                                            i74 = iM27625 ^ (-324297620);
                                            i82 = i87;
                                            i73 = i91;
                                            i77 = i77;
                                            i75 = i59;
                                        }
                                        break;
                                    case -1882860936:
                                    case 957188868:
                                        C2419.m8174();
                                        if (C20932.f66974 > 0) {
                                            s7 = s7;
                                            i42 = i75;
                                            i34 = iM27623;
                                            i35 = iM31623;
                                            dialogInterfaceC83210 = dialogInterfaceC8327M10091;
                                            i77 = i77;
                                            view7 = view9;
                                            sArr11 = sArr15;
                                            str6 = str9;
                                            i43 = i80;
                                            i38 = i82;
                                            i41 = i76;
                                            editText5 = editText8;
                                            iM31621 = C0773.m3169("᩺᩻") ^ i71;
                                            i59 = i42;
                                            i73 = ((iM31621 ^ i72) * (-17111)) ^ (-1480637709);
                                            i60 = -731351190;
                                            int i92 = iM31621 ^ i60;
                                            str9 = str6;
                                            sArr15 = sArr11;
                                            editText8 = editText5;
                                            i80 = i43;
                                            iM27623 = i34;
                                            s7 = s7;
                                            dialogInterfaceC8327M10091 = dialogInterfaceC83210;
                                            i76 = i41;
                                            view9 = view7;
                                            i82 = i38;
                                            iM31623 = i35;
                                            i74 = i92;
                                            i77 = i77;
                                            i75 = i59;
                                        } else {
                                            s7 = s7;
                                            i33 = i75;
                                            i34 = iM27623;
                                            i35 = iM31623;
                                            dialogInterfaceC83210 = dialogInterfaceC8327M10091;
                                            i36 = i76;
                                            i37 = i77;
                                            iM31620 = i80;
                                            i38 = i82;
                                            editText5 = editText8;
                                            sArr10 = sArr18;
                                            iM27619 = C0619.m2761("ܶۤ") ^ i71;
                                            i39 = ((iM27619 ^ i72) * (-9611)) ^ (-668029047);
                                            i40 = 1990983772;
                                            i44 = iM27619 ^ i40;
                                            editText8 = editText5;
                                            sArr18 = sArr10;
                                            iM27623 = i34;
                                            iM31623 = i35;
                                            dialogInterfaceC8327M10091 = dialogInterfaceC83210;
                                            i76 = i36;
                                            i80 = iM31620;
                                            i74 = i44;
                                            i73 = i39;
                                            i82 = i38;
                                            i77 = i37;
                                            i75 = i33;
                                            s7 = s7;
                                        }
                                        break;
                                    case -1613361672:
                                    case 1057492618:
                                        s7 = s7;
                                        i33 = i75;
                                        i34 = iM27623;
                                        i35 = iM31623;
                                        dialogInterfaceC83210 = dialogInterfaceC8327M10091;
                                        i36 = i76;
                                        i37 = i77;
                                        iM31620 = i80;
                                        i38 = i82;
                                        editText5 = editText8;
                                        sArr10 = sArr18;
                                        editText9 = (EditText) C2834.m9333(viewM2813, iM31624 ^ 2100321274);
                                        C17617.m41267(textInputLayout5);
                                        C17617.m41267(textInputLayout6);
                                        C21576.m49090(editText5);
                                        if (RunnableC0334.f1808 > 0) {
                                            iM27619 = C0619.m2761("֡ۛ") ^ i72;
                                            i39 = ((iM27619 ^ i71) * 18193) ^ 1288855996;
                                            i40 = -470343079;
                                            i44 = iM27619 ^ i40;
                                            editText8 = editText5;
                                            sArr18 = sArr10;
                                            iM27623 = i34;
                                            iM31623 = i35;
                                            dialogInterfaceC8327M10091 = dialogInterfaceC83210;
                                            i76 = i36;
                                            i80 = iM31620;
                                            i74 = i44;
                                            i73 = i39;
                                            i82 = i38;
                                            i77 = i37;
                                            i75 = i33;
                                            s7 = s7;
                                        } else {
                                            i41 = i36;
                                            view7 = view9;
                                            sArr11 = sArr15;
                                            str6 = str9;
                                            sArr18 = sArr10;
                                            i77 = i37;
                                            i42 = i33;
                                            i43 = iM31620;
                                            iM31621 = C0773.m3169("᩺᩻") ^ i71;
                                            i59 = i42;
                                            i73 = ((iM31621 ^ i72) * (-17111)) ^ (-1480637709);
                                            i60 = -731351190;
                                            int i93 = iM31621 ^ i60;
                                            str9 = str6;
                                            sArr15 = sArr11;
                                            editText8 = editText5;
                                            i80 = i43;
                                            iM27623 = i34;
                                            s7 = s7;
                                            dialogInterfaceC8327M10091 = dialogInterfaceC83210;
                                            i76 = i41;
                                            view9 = view7;
                                            i82 = i38;
                                            iM31623 = i35;
                                            i74 = i93;
                                            i77 = i77;
                                            i75 = i59;
                                        }
                                        break;
                                    case -1600197269:
                                    case 14801333:
                                        C2702.m8876();
                                        break;
                                    case -1513527328:
                                    case -126613547:
                                        i82 = 12626;
                                        int iM27626 = C0619.m2761("᩵ۛ") ^ i71;
                                        i81 = i81;
                                        str9 = str9;
                                        sArr19 = sArr19;
                                        i80 = i80;
                                        sArr16 = sArr16;
                                        iM27623 = iM27623;
                                        i75 = i75;
                                        view9 = view9;
                                        sArr15 = sArr15;
                                        i79 = i79;
                                        editText8 = editText8;
                                        iM31623 = iM31623;
                                        dialogInterfaceC8327M10091 = dialogInterfaceC8327M10091;
                                        i76 = i76;
                                        i74 = iM27626 ^ (-847561094);
                                        i73 = ((iM27626 ^ i72) * 11023) ^ (-1896689501);
                                        s7 = s7;
                                        i77 = i77;
                                        break;
                                    case -1432987857:
                                    case 1523473548:
                                        s7 = s7;
                                        i33 = i75;
                                        i34 = iM27623;
                                        i35 = iM31623;
                                        i36 = i76;
                                        i37 = i77;
                                        iM31620 = i80;
                                        i38 = i82;
                                        editText5 = editText8;
                                        sArr10 = sArr18;
                                        C2361 c2361M135310 = C4238.m13539(viewOnClickListenerC1057);
                                        C4282.m13657(c2361M135310, viewM2813);
                                        c2361M135310.m8004(new DialogInterface.OnDismissListener() { // from class: l.ۙ۠᩻
                                            @Override // android.content.DialogInterface.OnDismissListener
                                            public final void onDismiss(DialogInterface dialogInterface) {
                                                ViewOnClickListenerC1057.m3957(viewOnClickListenerC1057);
                                            }
                                        });
                                        dialogInterfaceC8327M10091 = C3099.m10090(c2361M135310);
                                        if (!RunnableC1848.m6360()) {
                                            int iM27627 = C0619.m2761("֫᩷") ^ i72;
                                            i39 = ((iM27627 ^ i71) * (-2187)) ^ (-625240070);
                                            i44 = iM27627 ^ 366483033;
                                            editText8 = editText5;
                                            sArr18 = sArr10;
                                            iM27623 = i34;
                                            iM31623 = i35;
                                            i76 = i36;
                                            i80 = iM31620;
                                            i74 = i44;
                                            i73 = i39;
                                            i82 = i38;
                                            i77 = i37;
                                            i75 = i33;
                                            s7 = s7;
                                        } else {
                                            i41 = i36;
                                            dialogInterfaceC83210 = dialogInterfaceC8327M10091;
                                            view7 = view9;
                                            sArr11 = sArr15;
                                            str6 = str9;
                                            sArr18 = sArr10;
                                            i77 = i37;
                                            i42 = i33;
                                            i43 = iM31620;
                                            iM31621 = C0773.m3169("᩺᩻") ^ i71;
                                            i59 = i42;
                                            i73 = ((iM31621 ^ i72) * (-17111)) ^ (-1480637709);
                                            i60 = -731351190;
                                            int i94 = iM31621 ^ i60;
                                            str9 = str6;
                                            sArr15 = sArr11;
                                            editText8 = editText5;
                                            i80 = i43;
                                            iM27623 = i34;
                                            s7 = s7;
                                            dialogInterfaceC8327M10091 = dialogInterfaceC83210;
                                            i76 = i41;
                                            view9 = view7;
                                            i82 = i38;
                                            iM31623 = i35;
                                            i74 = i94;
                                            i77 = i77;
                                            i75 = i59;
                                        }
                                        break;
                                    case -1301382433:
                                    case 1686956100:
                                        int i95 = i75;
                                        int i96 = iM27623;
                                        int i97 = i77;
                                        int i98 = i82;
                                        int i99 = i76;
                                        editText8 = (EditText) C3448.m11246(viewM2813, C0619.m2761(C4238.m13530(sArr18, i95, i99, i98)) ^ 2097360657);
                                        int iM31625 = (C0773.m3169("ۨܳ") ^ i72) * (-33);
                                        i80 = i80;
                                        i75 = i95;
                                        i76 = i99;
                                        i73 = ((iM31625 ^ i71) * 9951) ^ 916228949;
                                        i82 = i98;
                                        i77 = i97;
                                        iM31623 = iM31623;
                                        s7 = s7;
                                        dialogInterfaceC8327M10091 = dialogInterfaceC8327M10091;
                                        i74 = iM31625 ^ 807310913;
                                        iM27623 = i96;
                                        break;
                                    case -1167744008:
                                    case -807785075:
                                        s7 = s7;
                                        i33 = i75;
                                        i34 = iM27623;
                                        i35 = iM31623;
                                        dialogInterfaceC83210 = dialogInterfaceC8327M10091;
                                        i36 = i76;
                                        i37 = i77;
                                        iM31620 = i80;
                                        i38 = i82;
                                        editText5 = editText8;
                                        sArr10 = sArr18;
                                        iM31624 = C0773.m3169(C17202.m40377(f60996, 30, 3, i38));
                                        if (C23916.f77426 > 0) {
                                            iM27619 = (C0619.m2761("ᩳܳ") + i71) * (-31);
                                            i39 = ((iM27619 ^ i72) * 30789) ^ 751782395;
                                            i40 = 813988307;
                                            i44 = iM27619 ^ i40;
                                            editText8 = editText5;
                                            sArr18 = sArr10;
                                            iM27623 = i34;
                                            iM31623 = i35;
                                            dialogInterfaceC8327M10091 = dialogInterfaceC83210;
                                            i76 = i36;
                                            i80 = iM31620;
                                            i74 = i44;
                                            i73 = i39;
                                            i82 = i38;
                                            i77 = i37;
                                            i75 = i33;
                                            s7 = s7;
                                        }
                                        i46 = i79;
                                        view8 = view9;
                                        sArr12 = sArr15;
                                        sArr18 = sArr10;
                                        i77 = i37;
                                        sArr14 = sArr16;
                                        i45 = iM31620;
                                        sArr13 = sArr19;
                                        i47 = i81;
                                        int iM31626 = (C0773.m3169("ۗ᩷") ^ i72) * (-11);
                                        sArr16 = sArr14;
                                        i81 = i47;
                                        sArr15 = sArr12;
                                        i82 = i38;
                                        sArr19 = sArr13;
                                        i80 = i45;
                                        i75 = i33;
                                        dialogInterfaceC8327M10091 = dialogInterfaceC83210;
                                        view9 = view8;
                                        i77 = i77;
                                        i79 = i46;
                                        editText8 = editText5;
                                        iM31623 = i35;
                                        i76 = i36;
                                        i74 = iM31626 ^ (-934135797);
                                        i73 = ((iM31626 ^ i71) * 20459) ^ 1918892530;
                                        iM27623 = i34;
                                        s7 = s7;
                                        break;
                                    case -966792042:
                                    case 1494484333:
                                        C3492.m11488();
                                        C0773.m3161();
                                        s7 = s7;
                                        i33 = i75;
                                        i34 = iM27623;
                                        i35 = iM31623;
                                        dialogInterfaceC83210 = dialogInterfaceC8327M10091;
                                        i36 = i76;
                                        i37 = i77;
                                        iM31620 = i80;
                                        i38 = i82;
                                        editText5 = editText8;
                                        sArr10 = sArr18;
                                        iM27619 = C0619.m2761("ܶۤ") ^ i71;
                                        i39 = ((iM27619 ^ i72) * (-9611)) ^ (-668029047);
                                        i40 = 1990983772;
                                        i44 = iM27619 ^ i40;
                                        editText8 = editText5;
                                        sArr18 = sArr10;
                                        iM27623 = i34;
                                        iM31623 = i35;
                                        dialogInterfaceC8327M10091 = dialogInterfaceC83210;
                                        i76 = i36;
                                        i80 = iM31620;
                                        i74 = i44;
                                        i73 = i39;
                                        i82 = i38;
                                        i77 = i37;
                                        i75 = i33;
                                        s7 = s7;
                                        break;
                                    case -837016500:
                                    case -789628897:
                                        s7 = s7;
                                        i33 = i75;
                                        i34 = iM27623;
                                        i35 = iM31623;
                                        dialogInterfaceC83210 = dialogInterfaceC8327M10091;
                                        i77 = i77;
                                        view8 = view9;
                                        sArr12 = sArr15;
                                        String str11 = str9;
                                        i45 = i80;
                                        i38 = i82;
                                        int i100 = i76;
                                        editText5 = editText8;
                                        i46 = i79;
                                        i36 = i100;
                                        sArr13 = sArr19;
                                        sArr14 = sArr16;
                                        i47 = i81;
                                        iM27622 = C0619.m2761(AbstractC3624.m11769(sArr14, i47, 3, i38));
                                        if (C1564.f5401 > 0) {
                                            int iM31627 = C0773.m3169("֫֨") ^ i72;
                                            i48 = ((iM31627 ^ i71) * (-28663)) ^ (-10460126);
                                            i49 = iM31627 ^ 1232245598;
                                            i81 = i47;
                                            str9 = str11;
                                            sArr19 = sArr13;
                                            i80 = i45;
                                            sArr16 = sArr14;
                                            iM27623 = i34;
                                            i75 = i33;
                                            view9 = view8;
                                            sArr15 = sArr12;
                                            i79 = i46;
                                            editText8 = editText5;
                                            iM31623 = i35;
                                            dialogInterfaceC8327M10091 = dialogInterfaceC83210;
                                            i76 = i36;
                                            i74 = i49;
                                            i73 = i48;
                                            i82 = i38;
                                            s7 = s7;
                                            i77 = i77;
                                        } else {
                                            str9 = str11;
                                            int iM31628 = (C0773.m3169("ۗ᩷") ^ i72) * (-11);
                                            sArr16 = sArr14;
                                            i81 = i47;
                                            sArr15 = sArr12;
                                            i82 = i38;
                                            sArr19 = sArr13;
                                            i80 = i45;
                                            i75 = i33;
                                            dialogInterfaceC8327M10091 = dialogInterfaceC83210;
                                            view9 = view8;
                                            i77 = i77;
                                            i79 = i46;
                                            editText8 = editText5;
                                            iM31623 = i35;
                                            i76 = i36;
                                            i74 = iM31628 ^ (-934135797);
                                            i73 = ((iM31628 ^ i71) * 20459) ^ 1918892530;
                                            iM27623 = i34;
                                            s7 = s7;
                                        }
                                        break;
                                    case -746663438:
                                    case 968429518:
                                        iM27623 = 2129828814 ^ C0619.m2761(C0862.m3500(sArr19, 39, 3, i82));
                                        int iM31629 = (C0773.m3169("ܿܶ") + i71) * 5;
                                        i74 = iM31629 ^ 1661746010;
                                        i73 = ((iM31629 ^ i72) * 5245) ^ 901297656;
                                        break;
                                    case -726801963:
                                    case 39400306:
                                        if (AbstractC0641.m2813() <= 0) {
                                            s5 = s7;
                                            i52 = i75;
                                            i53 = iM27623;
                                            i54 = iM31623;
                                            dialogInterfaceC83211 = dialogInterfaceC8327M10091;
                                            i55 = i77;
                                            str7 = str9;
                                            i56 = i80;
                                            i57 = i82;
                                            i58 = i76;
                                            editText6 = editText8;
                                            int iM27628 = (C0619.m2761("ᩳۜ") + i72) * (-19);
                                            int i101 = ((iM27628 ^ i71) * 23257) ^ 1509007027;
                                            i69 = iM27628 ^ (-728409412);
                                            i80 = i56;
                                            i75 = i52;
                                            str9 = str7;
                                            i73 = i101;
                                            editText8 = editText6;
                                            iM27623 = i53;
                                            s7 = s5;
                                            dialogInterfaceC8327M10091 = dialogInterfaceC83211;
                                            i76 = i58;
                                            i82 = i57;
                                            i77 = i55;
                                            int i102 = i54;
                                            i74 = i69;
                                            iM31623 = i102;
                                        } else {
                                            s7 = s7;
                                            i33 = i75;
                                            i34 = iM27623;
                                            i35 = iM31623;
                                            dialogInterfaceC83210 = dialogInterfaceC8327M10091;
                                            i36 = i76;
                                            i37 = i77;
                                            iM31620 = i80;
                                            i38 = i82;
                                            editText5 = editText8;
                                            sArr10 = sArr18;
                                            iM27619 = C0619.m2761("ܶۤ") ^ i71;
                                            i39 = ((iM27619 ^ i72) * (-9611)) ^ (-668029047);
                                            i40 = 1990983772;
                                            i44 = iM27619 ^ i40;
                                            editText8 = editText5;
                                            sArr18 = sArr10;
                                            iM27623 = i34;
                                            iM31623 = i35;
                                            dialogInterfaceC8327M10091 = dialogInterfaceC83210;
                                            i76 = i36;
                                            i80 = iM31620;
                                            i74 = i44;
                                            i73 = i39;
                                            i82 = i38;
                                            i77 = i37;
                                            i75 = i33;
                                            s7 = s7;
                                        }
                                        break;
                                    case -555476532:
                                    case 302065637:
                                        s7 = s7;
                                        i33 = i75;
                                        int i103 = i77;
                                        int i104 = i82;
                                        iM31623 = C0773.m3169(C2834.m9343(f60996, 36, 3, i104)) ^ 2121885823;
                                        int iM27629 = (C0619.m2761("ۘ᩵") ^ i72) * (-23);
                                        i74 = iM27629 ^ (-342071657);
                                        i73 = ((iM27629 ^ i71) * 12713) ^ (-1116578707);
                                        editText8 = editText8;
                                        i82 = i104;
                                        sArr18 = sArr18;
                                        i77 = i103;
                                        iM27623 = iM27623;
                                        dialogInterfaceC8327M10091 = dialogInterfaceC8327M10091;
                                        i76 = i76;
                                        i80 = i80;
                                        i75 = i33;
                                        s7 = s7;
                                        break;
                                    case -404192382:
                                    case 705970615:
                                        s6 = s7;
                                        i61 = i75;
                                        i62 = i82;
                                        i63 = iM27623;
                                        i64 = iM31623;
                                        dialogInterfaceC83212 = dialogInterfaceC8327M10091;
                                        i65 = i76;
                                        str8 = str9;
                                        i66 = i80;
                                        editText7 = editText8;
                                        iM27620 = C0619.m2761(C0862.m3500(f60996, 24, 3, i62)) ^ 2103421686;
                                        if (C0773.m3161() != 0) {
                                            iM27621 = (i72 - C0619.m2761("ۚᩴ")) * (-99);
                                            i67 = ((iM27621 ^ i71) * 27609) ^ 873221735;
                                            i68 = -1501395378;
                                        } else {
                                            iM27621 = C0619.m2761("ۖۨ") ^ i72;
                                            i67 = ((iM27621 ^ i71) * 11289) ^ (-1536811726);
                                            i68 = 1002451784;
                                        }
                                        int i105 = iM27621 ^ i68;
                                        i80 = i66;
                                        i75 = i61;
                                        str9 = str8;
                                        i73 = i67;
                                        editText8 = editText7;
                                        iM27623 = i63;
                                        s7 = s6;
                                        dialogInterfaceC8327M10091 = dialogInterfaceC83212;
                                        i76 = i65;
                                        i82 = i62;
                                        i77 = iM27620;
                                        iM31623 = i64;
                                        i74 = i105;
                                        break;
                                    case -380688972:
                                    case 1300730562:
                                        s7 = s7;
                                        i50 = i75;
                                        i34 = iM27623;
                                        i35 = iM31623;
                                        dialogInterfaceC83210 = dialogInterfaceC8327M10091;
                                        i77 = i77;
                                        int i106 = i80;
                                        i38 = i82;
                                        int i107 = i76;
                                        editText5 = editText8;
                                        sArr12 = sArr15;
                                        String strM8069 = C2375.m8069(sArr12, 7, 17, i38);
                                        view8 = view9;
                                        C0269.m1781(view8, strM8069);
                                        textInputLayout5 = (TextInputLayout) view8;
                                        if (C11235.m28309() == 0) {
                                            int iM27630 = C0619.m2761("ۛ᩸") ^ i71;
                                            i51 = ((iM27630 ^ i72) * 24575) ^ 1128470605;
                                            str9 = strM8069;
                                            sArr15 = sArr12;
                                            i80 = i106;
                                            iM27623 = i34;
                                            s7 = s7;
                                            dialogInterfaceC8327M10091 = dialogInterfaceC83210;
                                            view9 = view8;
                                            iM31623 = i35;
                                            i74 = iM27630 ^ 836396582;
                                            editText8 = editText5;
                                            i76 = i107;
                                            i82 = i38;
                                            i77 = i77;
                                            int i108 = i50;
                                            i73 = i51;
                                            i75 = i108;
                                        } else {
                                            i45 = i106;
                                            i33 = i50;
                                            i36 = i107;
                                            str9 = strM8069;
                                            i46 = i79;
                                            sArr14 = sArr16;
                                            sArr13 = sArr19;
                                            i47 = i81;
                                            int iM316210 = (C0773.m3169("ۗ᩷") ^ i72) * (-11);
                                            sArr16 = sArr14;
                                            i81 = i47;
                                            sArr15 = sArr12;
                                            i82 = i38;
                                            sArr19 = sArr13;
                                            i80 = i45;
                                            i75 = i33;
                                            dialogInterfaceC8327M10091 = dialogInterfaceC83210;
                                            view9 = view8;
                                            i77 = i77;
                                            i79 = i46;
                                            editText8 = editText5;
                                            iM31623 = i35;
                                            i76 = i36;
                                            i74 = iM316210 ^ (-934135797);
                                            i73 = ((iM316210 ^ i71) * 20459) ^ 1918892530;
                                            iM27623 = i34;
                                            s7 = s7;
                                        }
                                        break;
                                    case -305238683:
                                    case 1304111:
                                        s7 = s7;
                                        i42 = i75;
                                        i34 = iM27623;
                                        i35 = iM31623;
                                        dialogInterfaceC83210 = dialogInterfaceC8327M10091;
                                        i77 = i77;
                                        view7 = view9;
                                        sArr11 = sArr15;
                                        str6 = str9;
                                        i43 = i80;
                                        i38 = i82;
                                        i41 = i76;
                                        editText5 = editText8;
                                        viewOnClickListenerC1057 = this;
                                        viewM2813 = AbstractC0641.m2812(viewOnClickListenerC1057, iM27622 ^ 2127379276);
                                        sArr17 = f60996;
                                        i79 = 4;
                                        if (AbstractC0641.f2496 >= 0) {
                                            iM31621 = C0773.m3169("᩺᩻") ^ i71;
                                            i59 = i42;
                                            i73 = ((iM31621 ^ i72) * (-17111)) ^ (-1480637709);
                                            i60 = -731351190;
                                        } else {
                                            i59 = i42;
                                            iM31621 = (C0773.m3169("᩷۠") + i71) * (-99);
                                            i73 = ((iM31621 ^ i72) * 29005) ^ (-851686219);
                                            i60 = 1428924605;
                                        }
                                        int i910 = iM31621 ^ i60;
                                        str9 = str6;
                                        sArr15 = sArr11;
                                        editText8 = editText5;
                                        i80 = i43;
                                        iM27623 = i34;
                                        s7 = s7;
                                        dialogInterfaceC8327M10091 = dialogInterfaceC83210;
                                        i76 = i41;
                                        view9 = view7;
                                        i82 = i38;
                                        iM31623 = i35;
                                        i74 = i910;
                                        i77 = i77;
                                        i75 = i59;
                                        break;
                                    case 14834123:
                                    case 1923164598:
                                        s5 = s7;
                                        i53 = iM27623;
                                        i54 = iM31623;
                                        dialogInterfaceC83211 = dialogInterfaceC8327M10091;
                                        editText6 = editText8;
                                        i55 = i77;
                                        i56 = i80;
                                        i57 = i82;
                                        View viewM11247 = C3448.m11246(viewM2813, i55);
                                        str7 = str9;
                                        C2310.m7811(viewM11247, str7);
                                        textInputLayout6 = (TextInputLayout) viewM11247;
                                        sArr18 = f60996;
                                        i52 = 27;
                                        i58 = 3;
                                        if (C3690.m11987()) {
                                            int iM276210 = (C0619.m2761("ᩳۜ") + i72) * (-19);
                                            int i109 = ((iM276210 ^ i71) * 23257) ^ 1509007027;
                                            i69 = iM276210 ^ (-728409412);
                                            i80 = i56;
                                            i75 = i52;
                                            str9 = str7;
                                            i73 = i109;
                                            editText8 = editText6;
                                            iM27623 = i53;
                                            s7 = s5;
                                            dialogInterfaceC8327M10091 = dialogInterfaceC83211;
                                            i76 = i58;
                                            i82 = i57;
                                        } else {
                                            int iM31630 = C0773.m3169("᩹۟") ^ i71;
                                            int i110 = ((iM31630 ^ i72) * (-14997)) ^ 967714314;
                                            i69 = iM31630 ^ (-1296181093);
                                            i80 = i56;
                                            str9 = str7;
                                            i73 = i110;
                                            editText8 = editText6;
                                            i82 = i57;
                                            iM27623 = i53;
                                            s7 = s5;
                                            dialogInterfaceC8327M10091 = dialogInterfaceC83211;
                                            i75 = 27;
                                            i76 = 3;
                                        }
                                        i77 = i55;
                                        int i1010 = i54;
                                        i74 = i69;
                                        iM31623 = i1010;
                                        break;
                                    case 276874903:
                                    case 1988516274:
                                        if (!C2023.f6737) {
                                            s7 = s7;
                                            i42 = i75;
                                            i34 = iM27623;
                                            i35 = iM31623;
                                            dialogInterfaceC83210 = dialogInterfaceC8327M10091;
                                            i77 = i77;
                                            view7 = view9;
                                            sArr11 = sArr15;
                                            str6 = str9;
                                            i43 = i80;
                                            i38 = i82;
                                            i41 = i76;
                                            editText5 = editText8;
                                            iM31621 = C0773.m3169("᩺᩻") ^ i71;
                                            i59 = i42;
                                            i73 = ((iM31621 ^ i72) * (-17111)) ^ (-1480637709);
                                            i60 = -731351190;
                                            int i911 = iM31621 ^ i60;
                                            str9 = str6;
                                            sArr15 = sArr11;
                                            editText8 = editText5;
                                            i80 = i43;
                                            iM27623 = i34;
                                            s7 = s7;
                                            dialogInterfaceC8327M10091 = dialogInterfaceC83210;
                                            i76 = i41;
                                            view9 = view7;
                                            i82 = i38;
                                            iM31623 = i35;
                                            i74 = i911;
                                            i77 = i77;
                                            i75 = i59;
                                        } else {
                                            s6 = s7;
                                            i61 = i75;
                                            i63 = iM27623;
                                            i64 = iM31623;
                                            dialogInterfaceC83212 = dialogInterfaceC8327M10091;
                                            iM27620 = i77;
                                            str8 = str9;
                                            i66 = i80;
                                            i62 = i82;
                                            i65 = i76;
                                            editText7 = editText8;
                                            iM27621 = (i72 - C0619.m2761("ۚᩴ")) * (-99);
                                            i67 = ((iM27621 ^ i71) * 27609) ^ 873221735;
                                            i68 = -1501395378;
                                            int i1011 = iM27621 ^ i68;
                                            i80 = i66;
                                            i75 = i61;
                                            str9 = str8;
                                            i73 = i67;
                                            editText8 = editText7;
                                            iM27623 = i63;
                                            s7 = s6;
                                            dialogInterfaceC8327M10091 = dialogInterfaceC83212;
                                            i76 = i65;
                                            i82 = i62;
                                            i77 = iM27620;
                                            iM31623 = i64;
                                            i74 = i1011;
                                        }
                                        break;
                                    case 329098171:
                                    case 1361369911:
                                        i82 = 38817;
                                        int iM276211 = C0619.m2761("᩵ۛ") ^ i71;
                                        i81 = i81;
                                        str9 = str9;
                                        sArr19 = sArr19;
                                        i80 = i80;
                                        sArr16 = sArr16;
                                        iM27623 = iM27623;
                                        i75 = i75;
                                        view9 = view9;
                                        sArr15 = sArr15;
                                        i79 = i79;
                                        editText8 = editText8;
                                        iM31623 = iM31623;
                                        dialogInterfaceC8327M10091 = dialogInterfaceC8327M10091;
                                        i76 = i76;
                                        i74 = iM276211 ^ (-847561094);
                                        i73 = ((iM276211 ^ i72) * 11023) ^ (-1896689501);
                                        s7 = s7;
                                        i77 = i77;
                                        break;
                                    case 457838117:
                                    case 2073671995:
                                        s7 = s7;
                                        i36 = i76;
                                        i77 = i77;
                                        i38 = i82;
                                        int i111 = ViewOnClickListenerC1057.f3785;
                                        C2375.m8064(dialogInterfaceC8327M10090);
                                        sArr16 = f60996;
                                        i81 = 1;
                                        int iM31631 = (i71 - C0773.m3169("ܳ۫")) * (-123);
                                        i48 = ((iM31631 ^ i72) * 6511) ^ 1735860564;
                                        i49 = iM31631 ^ (-963894822);
                                        str9 = str9;
                                        sArr15 = sArr15;
                                        sArr19 = sArr19;
                                        i80 = i80;
                                        iM27623 = iM27623;
                                        i75 = i75;
                                        dialogInterfaceC8327M10091 = dialogInterfaceC8327M10091;
                                        view9 = view9;
                                        i79 = i79;
                                        editText8 = editText8;
                                        iM31623 = iM31623;
                                        i76 = i36;
                                        i74 = i49;
                                        i73 = i48;
                                        i82 = i38;
                                        s7 = s7;
                                        i77 = i77;
                                        break;
                                    case 680534942:
                                    case 1545225506:
                                        s7 = s7;
                                        i33 = i75;
                                        i34 = iM27623;
                                        i35 = iM31623;
                                        dialogInterfaceC83210 = dialogInterfaceC8327M10091;
                                        i36 = i76;
                                        i37 = i77;
                                        iM31620 = i80;
                                        i38 = i82;
                                        editText5 = editText8;
                                        sArr10 = sArr18;
                                        C2375.m8070(C3448.m11246(viewM2813, iM31620), new ViewOnClickListenerC10751(viewOnClickListenerC1057, viewM2813, editText5, 0));
                                        if (RunnableC0334.f1808 > 0) {
                                            iM27619 = C0773.m3169("ۗ۫") ^ i71;
                                            i39 = ((iM27619 ^ i72) * (-17523)) ^ (-1846681308);
                                            i40 = 148293729;
                                            i44 = iM27619 ^ i40;
                                            editText8 = editText5;
                                            sArr18 = sArr10;
                                            iM27623 = i34;
                                            iM31623 = i35;
                                            dialogInterfaceC8327M10091 = dialogInterfaceC83210;
                                            i76 = i36;
                                            i80 = iM31620;
                                            i74 = i44;
                                            i73 = i39;
                                            i82 = i38;
                                            i77 = i37;
                                            i75 = i33;
                                            s7 = s7;
                                        }
                                        i46 = i79;
                                        view8 = view9;
                                        sArr12 = sArr15;
                                        sArr18 = sArr10;
                                        i77 = i37;
                                        sArr14 = sArr16;
                                        i45 = iM31620;
                                        sArr13 = sArr19;
                                        i47 = i81;
                                        int iM316211 = (C0773.m3169("ۗ᩷") ^ i72) * (-11);
                                        sArr16 = sArr14;
                                        i81 = i47;
                                        sArr15 = sArr12;
                                        i82 = i38;
                                        sArr19 = sArr13;
                                        i80 = i45;
                                        i75 = i33;
                                        dialogInterfaceC8327M10091 = dialogInterfaceC83210;
                                        view9 = view8;
                                        i77 = i77;
                                        i79 = i46;
                                        editText8 = editText5;
                                        iM31623 = i35;
                                        i76 = i36;
                                        i74 = iM316211 ^ (-934135797);
                                        i73 = ((iM316211 ^ i71) * 20459) ^ 1918892530;
                                        iM27623 = i34;
                                        s7 = s7;
                                        break;
                                    case 1307739306:
                                    case 1989455678:
                                        TextView textView2 = (TextView) C3448.m11246(viewM2813, iM27623);
                                        C2930.m9576(textView2);
                                        C11235.m28299(textView2, new ViewOnClickListenerC19702(dialogInterfaceC8327M10091, viewOnClickListenerC1057));
                                        break;
                                    case 1555635289:
                                    case 1675753230:
                                        s7 = s7;
                                        i33 = i75;
                                        i34 = iM27623;
                                        i35 = iM31623;
                                        dialogInterfaceC83210 = dialogInterfaceC8327M10091;
                                        sArr10 = sArr18;
                                        i36 = i76;
                                        i37 = i77;
                                        i38 = i82;
                                        editText5 = editText8;
                                        iM31620 = C0773.m3169(AbstractC3624.m11769(f60996, 33, 3, i38)) ^ 2119846176;
                                        iM27619 = C0619.m2761("᩶ۗ") ^ i71;
                                        i39 = ((iM27619 ^ i72) * (-7747)) ^ (-1523768136);
                                        i40 = -1976863398;
                                        i44 = iM27619 ^ i40;
                                        editText8 = editText5;
                                        sArr18 = sArr10;
                                        iM27623 = i34;
                                        iM31623 = i35;
                                        dialogInterfaceC8327M10091 = dialogInterfaceC83210;
                                        i76 = i36;
                                        i80 = iM31620;
                                        i74 = i44;
                                        i73 = i39;
                                        i82 = i38;
                                        i77 = i37;
                                        i75 = i33;
                                        s7 = s7;
                                        break;
                                    case 1688794071:
                                    case 2138325196:
                                        i59 = i75;
                                        int i112 = i76;
                                        int i113 = i77;
                                        int i114 = i82;
                                        EditText editText11 = editText8;
                                        short s9 = f60996[0];
                                        int i115 = s9 * 23096;
                                        int iM31632 = C0773.m3169("۫᩷") ^ i72;
                                        int i116 = ((iM31632 ^ i71) * (-19135)) ^ 83942731;
                                        i81 = i81;
                                        str9 = str9;
                                        sArr19 = sArr19;
                                        i80 = i80;
                                        sArr16 = sArr16;
                                        iM27623 = iM27623;
                                        view9 = view9;
                                        sArr15 = sArr15;
                                        i79 = i79;
                                        editText8 = editText11;
                                        iM31623 = iM31623;
                                        dialogInterfaceC8327M10091 = dialogInterfaceC8327M10091;
                                        i76 = i112;
                                        i74 = iM31632 ^ (-627903066);
                                        i82 = i114;
                                        s7 = s9;
                                        i78 = i115;
                                        i77 = i113;
                                        i73 = i116;
                                        i75 = i59;
                                        break;
                                    case 1744492332:
                                    case 2085488615:
                                        i50 = i75;
                                        int i117 = iM31623;
                                        DialogInterfaceC8327 dialogInterfaceC83214 = dialogInterfaceC8327M10091;
                                        i77 = i77;
                                        int i118 = i82;
                                        int i119 = i76;
                                        EditText editText12 = editText8;
                                        short[] sArr23 = sArr17;
                                        int i120 = i79;
                                        View viewM9337 = C2834.m9333(viewM2813, C0773.m3169(C2287.m7749(sArr23, i120, 3, i118)) ^ 2098652659);
                                        sArr15 = f60996;
                                        int iM31633 = C0773.m3169("᩶֨") ^ i72;
                                        i51 = ((iM31633 ^ i71) * 10087) ^ (-900951513);
                                        str9 = str9;
                                        sArr17 = sArr23;
                                        i79 = i120;
                                        editText8 = editText12;
                                        i80 = i80;
                                        iM27623 = iM27623;
                                        iM31623 = i117;
                                        view9 = viewM9337;
                                        i76 = i119;
                                        i74 = iM31633 ^ (-1607607190);
                                        i82 = i118;
                                        s7 = s7;
                                        dialogInterfaceC8327M10091 = dialogInterfaceC83214;
                                        i77 = i77;
                                        int i1012 = i50;
                                        i73 = i51;
                                        i75 = i1012;
                                        break;
                                    default:
                                        s7 = s7;
                                        i37 = i77;
                                        i38 = i82;
                                        i34 = iM27623;
                                        i35 = iM31623;
                                        i33 = i75;
                                        iM31620 = i80;
                                        sArr10 = sArr18;
                                        dialogInterfaceC83210 = dialogInterfaceC8327M10091;
                                        i36 = i76;
                                        editText5 = editText8;
                                        C2375.m8070(C2834.m9333(viewM2813, iM31623), new ViewOnClickListenerC22686(editText8, editText9, dialogInterfaceC8327M10091, viewOnClickListenerC1057, textInputLayout6, textInputLayout5));
                                        sArr19 = f60996;
                                        if (C2702.f8586 <= 0) {
                                            iM27619 = C0619.m2761("ܶۤ") ^ i71;
                                            i39 = ((iM27619 ^ i72) * (-9611)) ^ (-668029047);
                                            i40 = 1990983772;
                                        } else {
                                            iM27619 = (C0773.m3169("ۙۗ") ^ i72) * 17;
                                            i39 = ((iM27619 ^ i71) * 12019) ^ (-2128290483);
                                            i40 = -422854244;
                                        }
                                        i44 = iM27619 ^ i40;
                                        editText8 = editText5;
                                        sArr18 = sArr10;
                                        iM27623 = i34;
                                        iM31623 = i35;
                                        dialogInterfaceC8327M10091 = dialogInterfaceC83210;
                                        i76 = i36;
                                        i80 = iM31620;
                                        i74 = i44;
                                        i73 = i39;
                                        i82 = i38;
                                        i77 = i37;
                                        i75 = i33;
                                        s7 = s7;
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m3957(ViewOnClickListenerC1057 viewOnClickListenerC1057) {
        viewOnClickListenerC1057.m3968();
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0265 A[PHI: r3 r6 r7 r16 r17
      0x0265: PHI (r3v4 short[]) = (r3v3 short[]), (r3v2 short[]), (r3v2 short[]) binds: [B:64:0x0263, B:56:0x0203, B:16:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x0265: PHI (r6v4 int) = (r6v2 int), (r6v3 int), (r6v2 int) binds: [B:64:0x0263, B:56:0x0203, B:16:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x0265: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int) binds: [B:64:0x0263, B:56:0x0203, B:16:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x0265: PHI (r16v13 l.ܳ۬᩻) = (r16v1 l.ܳ۬᩻), (r16v3 l.ܳ۬᩻), (r16v14 l.ܳ۬᩻) binds: [B:64:0x0263, B:56:0x0203, B:16:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x0265: PHI (r17v12 int) = (r17v1 int), (r17v3 int), (r17v13 int) binds: [B:64:0x0263, B:56:0x0203, B:16:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005f, code lost:
    
        if (l.C2485.m8357() > 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
    
        r16 = r2;
        r17 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006f, code lost:
    
        if (l.C2702.m8876() == false) goto L19;
     */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m3975(final android.view.View r19, final android.widget.EditText r20, final l.ViewOnClickListenerC1057 r21) {
        /*
            Method dump skipped, instruction units count: 858
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC1057.m3975(android.view.View, android.widget.EditText, l.֨۠᩻):void");
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0224 A[PHI: r5 r17 r19 r20
      0x0224: PHI (r5v4 java.lang.String) = (r5v3 java.lang.String), (r5v2 java.lang.String) binds: [B:54:0x020e, B:6:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x0224: PHI (r17v17 java.lang.String) = (r17v11 java.lang.String), (r17v18 java.lang.String) binds: [B:54:0x020e, B:6:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x0224: PHI (r19v16 int) = (r19v9 int), (r19v17 int) binds: [B:54:0x020e, B:6:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x0224: PHI (r20v14 l.ۧ۠᩻) = (r20v9 l.ۧ۠᩻), (r20v15 l.ۧ۠᩻) binds: [B:54:0x020e, B:6:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0275 A[PHI: r4 r17 r19 r20
      0x0275: PHI (r4v4 boolean) = (r4v3 boolean), (r4v2 boolean), (r4v2 boolean) binds: [B:62:0x0273, B:58:0x0247, B:38:0x013e] A[DONT_GENERATE, DONT_INLINE]
      0x0275: PHI (r17v14 java.lang.String) = (r17v9 java.lang.String), (r17v10 java.lang.String), (r17v16 java.lang.String) binds: [B:62:0x0273, B:58:0x0247, B:38:0x013e] A[DONT_GENERATE, DONT_INLINE]
      0x0275: PHI (r19v12 int) = (r19v7 int), (r19v8 int), (r19v15 int) binds: [B:62:0x0273, B:58:0x0247, B:38:0x013e] A[DONT_GENERATE, DONT_INLINE]
      0x0275: PHI (r20v12 l.ۧ۠᩻) = (r20v7 l.ۧ۠᩻), (r20v8 l.ۧ۠᩻), (r20v13 l.ۧ۠᩻) binds: [B:62:0x0273, B:58:0x0247, B:38:0x013e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x038f A[PHI: r10 r12 r17 r18 r19 r20
      0x038f: PHI (r10v4 java.lang.String) = 
      (r10v2 java.lang.String)
      (r10v2 java.lang.String)
      (r10v2 java.lang.String)
      (r10v3 java.lang.String)
      (r10v2 java.lang.String)
     binds: [B:85:0x038d, B:81:0x0368, B:73:0x031d, B:49:0x01de, B:18:0x0089] A[DONT_GENERATE, DONT_INLINE]
      0x038f: PHI (r12v4 char) = (r12v2 char), (r12v2 char), (r12v3 char), (r12v2 char), (r12v2 char) binds: [B:85:0x038d, B:81:0x0368, B:73:0x031d, B:49:0x01de, B:18:0x0089] A[DONT_GENERATE, DONT_INLINE]
      0x038f: PHI (r17v25 java.lang.String) = 
      (r17v2 java.lang.String)
      (r17v3 java.lang.String)
      (r17v4 java.lang.String)
      (r17v12 java.lang.String)
      (r17v26 java.lang.String)
     binds: [B:85:0x038d, B:81:0x0368, B:73:0x031d, B:49:0x01de, B:18:0x0089] A[DONT_GENERATE, DONT_INLINE]
      0x038f: PHI (r18v5 short[]) = (r18v3 short[]), (r18v3 short[]), (r18v4 short[]), (r18v3 short[]), (r18v3 short[]) binds: [B:85:0x038d, B:81:0x0368, B:73:0x031d, B:49:0x01de, B:18:0x0089] A[DONT_GENERATE, DONT_INLINE]
      0x038f: PHI (r19v26 int) = (r19v0 int), (r19v1 int), (r19v2 int), (r19v10 int), (r19v27 int) binds: [B:85:0x038d, B:81:0x0368, B:73:0x031d, B:49:0x01de, B:18:0x0089] A[DONT_GENERATE, DONT_INLINE]
      0x038f: PHI (r20v20 l.ۧ۠᩻) = (r20v0 l.ۧ۠᩻), (r20v1 l.ۧ۠᩻), (r20v2 l.ۧ۠᩻), (r20v10 l.ۧ۠᩻), (r20v21 l.ۧ۠᩻) binds: [B:85:0x038d, B:81:0x0368, B:73:0x031d, B:49:0x01de, B:18:0x0089] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m3954(EditText editText, EditText editText2, DialogInterfaceC8327 dialogInterfaceC8327, ViewOnClickListenerC1057 viewOnClickListenerC1057, TextInputLayout textInputLayout, TextInputLayout textInputLayout2) {
        int iM2761;
        int i;
        int i2;
        int iM3169;
        int i3;
        int i4;
        int iM31610;
        int i5;
        int i6 = AbstractC0116.f1064;
        int i7 = C4282.f15546;
        int iM2762 = C0619.m2761("ۙۙ") ^ i6;
        int i8 = ((iM2762 ^ i7) * 12045) ^ 783659988;
        String strM4058 = null;
        String str = null;
        short[] sArr = null;
        int i9 = iM2762 ^ 1830402819;
        boolean z = false;
        int iM31611 = 0;
        char c = 0;
        int i10 = 0;
        int i11 = 1420707833;
        String strM40377 = null;
        C11497 c11497 = null;
        int iM4845 = 0;
        while (true) {
            i11 = i9 ^ (i8 & (((i11 ^ i7) * (-2025)) >> 31));
            switch (i11) {
                case -2125549467:
                case 2033502651:
                    if (!C3077.f9998) {
                        str = str;
                        iM4845 = iM4845;
                        c11497 = c11497;
                        iM2761 = C0773.m3169("ۚۖ") ^ i7;
                        i = ((iM2761 ^ i6) * 26925) ^ 527121627;
                        i2 = 1853560360;
                        i4 = iM2761 ^ i2;
                        iM4845 = iM4845;
                        c11497 = c11497;
                        String str2 = str;
                        i9 = i4;
                        i8 = i;
                        str = str2;
                    } else {
                        c11497 = c11497;
                        int iM31612 = (i7 - C0773.m3169("֨ᩳ")) * 81;
                        i9 = iM31612 ^ (-588722301);
                        i8 = ((iM31612 ^ i6) * (-19953)) ^ 1476842886;
                        c11497 = c11497;
                    }
                    break;
                case -2094100671:
                case -2078520599:
                    str = str;
                    iM4845 = iM4845;
                    c11497 = c11497;
                    if (C3033.f9831 >= 0) {
                        iM2761 = (C0773.m3169("ۗۢ") + i6) * 55;
                        i = ((iM2761 ^ i7) * 5843) ^ (-1450476562);
                        i2 = 126983222;
                    } else {
                        iM2761 = (C0773.m3169("ۚ۫") + i6) * 33;
                        i = ((iM2761 ^ i7) * (-13835)) ^ (-1160184219);
                        i2 = 1227587313;
                    }
                    i4 = iM2761 ^ i2;
                    iM4845 = iM4845;
                    c11497 = c11497;
                    String str3 = str;
                    i9 = i4;
                    i8 = i;
                    str = str3;
                    break;
                case -2034251133:
                case 1046586435:
                    if (!viewOnClickListenerC1057.f3787.m55200()) {
                        iM3169 = (C0773.m3169("ܶۧ") + i7) * 97;
                        str = str;
                        i = ((iM3169 ^ i6) * 12661) ^ (-2041159762);
                        i3 = -1114803237;
                        i4 = iM3169 ^ i3;
                        String str4 = str;
                        i9 = i4;
                        i8 = i;
                        str = str4;
                    } else {
                        str = str;
                        iM4845 = iM4845;
                        c11497 = c11497;
                        iM2761 = C0773.m3169("ܺܰ") ^ i6;
                        i = ((iM2761 ^ i7) * (-17509)) ^ (-1577917634);
                        i2 = -605338637;
                        i4 = iM2761 ^ i2;
                        iM4845 = iM4845;
                        c11497 = c11497;
                        String str5 = str;
                        i9 = i4;
                        i8 = i;
                        str = str5;
                    }
                    break;
                case -1973566439:
                case 424607676:
                    str = str;
                    iM4845 = iM4845;
                    c11497 = c11497;
                    z = false;
                    if (C17617.m41270(textInputLayout, textInputLayout2)) {
                        iM2761 = C0773.m3169("ܺܰ") ^ i6;
                        i = ((iM2761 ^ i7) * (-17509)) ^ (-1577917634);
                        i2 = -605338637;
                    } else {
                        iM2761 = C0619.m2761("ۖ۠") ^ i6;
                        i = ((iM2761 ^ i7) * (-3643)) ^ (-744388137);
                        i2 = -1696819905;
                    }
                    i4 = iM2761 ^ i2;
                    iM4845 = iM4845;
                    c11497 = c11497;
                    String str6 = str;
                    i9 = i4;
                    i8 = i;
                    str = str6;
                    break;
                case -1854978392:
                case -1381707331:
                    str = str;
                    iM4845 = iM4845;
                    c11497 = c11497;
                    sArr = f3786;
                    c = '\b';
                    if (C0487.f2131 <= 0) {
                        iM2761 = (C0773.m3169("ۗۢ") + i6) * 55;
                        i = ((iM2761 ^ i7) * 5843) ^ (-1450476562);
                        i2 = 126983222;
                    } else {
                        iM2761 = (i6 - C0619.m2761("ۡۤ")) * (-93);
                        i = ((iM2761 ^ i7) * (-27441)) ^ (-916857223);
                        i2 = -567182186;
                    }
                    i4 = iM2761 ^ i2;
                    iM4845 = iM4845;
                    c11497 = c11497;
                    String str7 = str;
                    i9 = i4;
                    i8 = i;
                    str = str7;
                    break;
                case -1631407543:
                case 1486572721:
                    str = str;
                    iM4845 = iM4845;
                    c11497 = c11497;
                    if (m3963(textInputLayout, z)) {
                        iM2761 = C0619.m2761("᩺ܰ") ^ i7;
                        i = ((iM2761 ^ i6) * 6753) ^ 1674318276;
                        i2 = -2088878733;
                    } else {
                        iM2761 = C0773.m3169("ܺܰ") ^ i6;
                        i = ((iM2761 ^ i7) * (-17509)) ^ (-1577917634);
                        i2 = -605338637;
                    }
                    i4 = iM2761 ^ i2;
                    iM4845 = iM4845;
                    c11497 = c11497;
                    String str8 = str;
                    i9 = i4;
                    i8 = i;
                    str = str8;
                    break;
                case -1478575728:
                case 74255019:
                    str = str;
                    iM4845 = iM4845;
                    c11497 = c11497;
                    strM4058 = C1080.m4058(C3998.m12928(editText));
                    if (C3077.m10045(strM4058) == 6) {
                        iM2761 = C0773.m3169("ۙ᩷") ^ i6;
                        i = ((iM2761 ^ i7) * 2401) ^ 149236092;
                        i2 = -75842313;
                    } else {
                        iM2761 = (i7 - C0619.m2761("ܳ᩵")) * (-77);
                        i = ((iM2761 ^ i6) * 18927) ^ (-83618221);
                        i2 = 1271650353;
                    }
                    i4 = iM2761 ^ i2;
                    iM4845 = iM4845;
                    c11497 = c11497;
                    String str9 = str;
                    i9 = i4;
                    i8 = i;
                    str = str9;
                    break;
                case -1329511336:
                case -1205321520:
                    str = str;
                    iM4845 = iM4845;
                    c11497 = c11497;
                    strM40377 = C17202.m40377(f3786, 9, 3, i10);
                    if (C0619.f2439) {
                        iM2761 = (C0773.m3169("ۗۢ") + i6) * 55;
                        i = ((iM2761 ^ i7) * 5843) ^ (-1450476562);
                        i2 = 126983222;
                    } else {
                        iM2761 = (C0773.m3169("֨ۤ") ^ i7) * 75;
                        i = ((iM2761 ^ i6) * (-23891)) ^ (-719809999);
                        i2 = 1951153953;
                    }
                    i4 = iM2761 ^ i2;
                    iM4845 = iM4845;
                    c11497 = c11497;
                    String str10 = str;
                    i9 = i4;
                    i8 = i;
                    str = str10;
                    break;
                case -1053719460:
                case 79448865:
                    str = str;
                    iM4845 = iM4845;
                    c11497 = c11497;
                    if (C3033.f9831 < 0) {
                        iM2761 = C0773.m3169("֡ᩳ") ^ i7;
                        i = ((iM2761 ^ i6) * 11183) ^ 184896032;
                        i2 = -1244909233;
                        i4 = iM2761 ^ i2;
                        iM4845 = iM4845;
                        c11497 = c11497;
                        String str11 = str;
                        i9 = i4;
                        i8 = i;
                        str = str11;
                    } else {
                        str = str;
                        iM4845 = iM4845;
                        int iM31613 = (i7 - C0773.m3169("֨ᩳ")) * 81;
                        i9 = iM31613 ^ (-588722301);
                        i8 = ((iM31613 ^ i6) * (-19953)) ^ 1476842886;
                        c11497 = c11497;
                    }
                    break;
                case -1030098651:
                case -448391209:
                    C2310.m7813();
                    RunnableC3646.m11813();
                    c11497 = c11497;
                    int iM31614 = (i7 - C0773.m3169("֨ᩳ")) * 81;
                    i9 = iM31614 ^ (-588722301);
                    i8 = ((iM31614 ^ i6) * (-19953)) ^ 1476842886;
                    c11497 = c11497;
                    break;
                case -930193306:
                case 1597814781:
                    str = str;
                    iM4845 = iM4845;
                    c11497 = c11497;
                    short s = sArr[c];
                    if (((s * s) + 17288964) - (s * 8316) >= 0) {
                        iM2761 = C0619.m2761("֫ۖ") ^ i7;
                        i = ((iM2761 ^ i6) * (-17419)) ^ (-1798100107);
                        i2 = 1309125125;
                    } else {
                        iM2761 = (i7 - C0773.m3169("ܽܺ")) * (-13);
                        i = ((iM2761 ^ i6) * 23497) ^ 228889098;
                        i2 = 888188978;
                    }
                    i4 = iM2761 ^ i2;
                    iM4845 = iM4845;
                    c11497 = c11497;
                    String str12 = str;
                    i9 = i4;
                    i8 = i;
                    str = str12;
                    break;
                case -886516222:
                case -537568903:
                    break;
                case -823735161:
                case 1623023700:
                    String strM6246 = C1783.m6246(viewOnClickListenerC1057, iM31611);
                    C0269.m1781(strM6246, C0269.m1785(f3786, 12, 14, i10));
                    C17617.m41269(textInputLayout2, strM6246);
                    break;
                case -812675038:
                case 2126105344:
                    str = str;
                    iM4845 = iM4845;
                    c11497 = c11497;
                    iM31611 = 2123593410 ^ C0773.m3169(strM40377);
                    if (C1826.f6190 <= 0) {
                        iM2761 = C0773.m3169("ۚۖ") ^ i7;
                        i = ((iM2761 ^ i6) * 26925) ^ 527121627;
                        i2 = 1853560360;
                    } else {
                        iM2761 = (C0619.m2761("ᩴۛ") ^ i6) * (-37);
                        i = ((iM2761 ^ i7) * 32719) ^ 1548936231;
                        i2 = 118443917;
                    }
                    i4 = iM2761 ^ i2;
                    iM4845 = iM4845;
                    c11497 = c11497;
                    String str13 = str;
                    i9 = i4;
                    i8 = i;
                    str = str13;
                    break;
                case -790539541:
                case 1255698945:
                    if (C2354.f7599 >= 0) {
                        str = str;
                        iM4845 = iM4845;
                        c11497 = c11497;
                        iM2761 = (C0773.m3169("ۗۢ") + i6) * 55;
                        i = ((iM2761 ^ i7) * 5843) ^ (-1450476562);
                        i2 = 126983222;
                        i4 = iM2761 ^ i2;
                        iM4845 = iM4845;
                        c11497 = c11497;
                        String str14 = str;
                        i9 = i4;
                        i8 = i;
                        str = str14;
                    } else {
                        c11497 = c11497;
                        int iM31615 = (i7 - C0773.m3169("֨ᩳ")) * 81;
                        i9 = iM31615 ^ (-588722301);
                        i8 = ((iM31615 ^ i6) * (-19953)) ^ 1476842886;
                        c11497 = c11497;
                    }
                    break;
                case -594873756:
                case 1789174683:
                    i10 = 47760;
                    iM2761 = (i6 - C0619.m2761("֫ۘ")) * (-5);
                    i = ((iM2761 ^ i7) * 3877) ^ 2088383653;
                    i2 = -232365143;
                    i4 = iM2761 ^ i2;
                    iM4845 = iM4845;
                    c11497 = c11497;
                    String str15 = str;
                    i9 = i4;
                    i8 = i;
                    str = str15;
                    break;
                case -199427965:
                case 2017909269:
                    ReentrantLock reentrantLock = C11650.f37690;
                    C3077.m10038(new C22839(iM4845, str, viewOnClickListenerC1057, c11497));
                    break;
                case -122226575:
                case 1609548829:
                    String strM4059 = C1080.m4058(C3998.m12928(editText2));
                    iM4845 = C1321.m4845(strM4058);
                    short[] sArr2 = f3786;
                    str = strM4059;
                    if (!RunnableC3646.f12471) {
                        int iM2763 = C0619.m2761(C3033.m9847(sArr2, 29, 3, i10));
                        if (C3033.f9831 >= 0) {
                            iM31610 = (i7 - C0773.m3169("ۢ۠")) * (-7);
                            i = ((iM31610 ^ i6) * (-731)) ^ (-32734353);
                            i5 = -1854559923;
                        } else {
                            C13511 c13511 = new C13511(viewOnClickListenerC1057, iM2763 ^ 2100015241);
                            C4282.m13648(c13511);
                            c11497 = new C11497(c13511, dialogInterfaceC8327);
                            if (C1783.f6087 <= 0) {
                                str = str;
                                iM4845 = iM4845;
                                iM3169 = C0773.m3169("ۤ᩺") ^ i6;
                                str = str;
                                i = ((iM3169 ^ i7) * 16999) ^ (-334343929);
                                i3 = -2058306097;
                                i4 = iM3169 ^ i3;
                                String str16 = str;
                                i9 = i4;
                                i8 = i;
                                str = str16;
                            } else {
                                iM31610 = C0773.m3169("ۡᩴ") ^ i6;
                                i = ((iM31610 ^ i7) * (-11761)) ^ 1515739664;
                                i5 = 2086193178;
                            }
                        }
                        i4 = iM31610 ^ i5;
                        iM4845 = iM4845;
                        String str17 = str;
                        i9 = i4;
                        i8 = i;
                        str = str17;
                    } else {
                        c11497 = c11497;
                        str = str;
                        int iM31616 = (i7 - C0773.m3169("֨ᩳ")) * 81;
                        i9 = iM31616 ^ (-588722301);
                        i8 = ((iM31616 ^ i6) * (-19953)) ^ 1476842886;
                        c11497 = c11497;
                    }
                    break;
                case 69583908:
                case 390840026:
                    i10 = 4158;
                    iM2761 = (i6 - C0619.m2761("֫ۘ")) * (-5);
                    i = ((iM2761 ^ i7) * 3877) ^ 2088383653;
                    i2 = -232365143;
                    i4 = iM2761 ^ i2;
                    iM4845 = iM4845;
                    c11497 = c11497;
                    String str18 = str;
                    i9 = i4;
                    i8 = i;
                    str = str18;
                    break;
                case 201958834:
                case 1862165842:
                    if (C3448.m11248() == 0) {
                        iM3169 = C0773.m3169("ۤ᩺") ^ i6;
                        str = str;
                        i = ((iM3169 ^ i7) * 16999) ^ (-334343929);
                        i3 = -2058306097;
                        i4 = iM3169 ^ i3;
                        String str19 = str;
                        i9 = i4;
                        i8 = i;
                        str = str19;
                    }
                    str = str;
                    iM4845 = iM4845;
                    c11497 = c11497;
                    iM2761 = C0773.m3169("ۚۖ") ^ i7;
                    i = ((iM2761 ^ i6) * 26925) ^ 527121627;
                    i2 = 1853560360;
                    i4 = iM2761 ^ i2;
                    iM4845 = iM4845;
                    c11497 = c11497;
                    String str110 = str;
                    i9 = i4;
                    i8 = i;
                    str = str110;
                    break;
                case 888447442:
                case 1129041721:
                    str = str;
                    iM4845 = iM4845;
                    c11497 = c11497;
                    if (C4282.m13644()) {
                        iM2761 = (i7 - C0619.m2761("᩷᩸")) * (-85);
                        i = ((iM2761 ^ i6) * 1349) ^ (-56112472);
                        i2 = 1386673237;
                    } else {
                        iM2761 = (C0773.m3169("ۗۢ") + i6) * 55;
                        i = ((iM2761 ^ i7) * 5843) ^ (-1450476562);
                        i2 = 126983222;
                    }
                    i4 = iM2761 ^ i2;
                    iM4845 = iM4845;
                    c11497 = c11497;
                    String str111 = str;
                    i9 = i4;
                    i8 = i;
                    str = str111;
                    break;
                case 1063443646:
                case 1762106783:
                    str = str;
                    iM4845 = iM4845;
                    c11497 = c11497;
                    if (C0862.f3233 == 0) {
                        iM2761 = (C0773.m3169("᩺ۚ") ^ i6) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM2761 ^ i7) * (-5191)) ^ 1022571050;
                        i2 = -1838170779;
                        i4 = iM2761 ^ i2;
                        iM4845 = iM4845;
                        c11497 = c11497;
                        String str112 = str;
                        i9 = i4;
                        i8 = i;
                        str = str112;
                    } else {
                        str = str;
                        iM4845 = iM4845;
                        int iM31617 = (i7 - C0773.m3169("֨ᩳ")) * 81;
                        i9 = iM31617 ^ (-588722301);
                        i8 = ((iM31617 ^ i6) * (-19953)) ^ 1476842886;
                        c11497 = c11497;
                    }
                    break;
                case 1255408101:
                case 1265062889:
                    C2702.m8876();
                    break;
                default:
                    str = str;
                    iM4845 = iM4845;
                    c11497 = c11497;
                    if (new C9826(AbstractC0116.m1236(f3786, 26, 3, i10)).m25600((CharSequence) strM4058)) {
                        iM2761 = (i7 - C0619.m2761("ۗ֡")) * 19;
                        i = ((iM2761 ^ i6) * 2657) ^ 457659629;
                        i2 = -2039045454;
                    } else {
                        iM2761 = (i7 - C0619.m2761("ܳ᩵")) * (-77);
                        i = ((iM2761 ^ i6) * 18927) ^ (-83618221);
                        i2 = 1271650353;
                    }
                    i4 = iM2761 ^ i2;
                    iM4845 = iM4845;
                    c11497 = c11497;
                    String str113 = str;
                    i9 = i4;
                    i8 = i;
                    str = str113;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m3958(DialogInterfaceC8327 dialogInterfaceC8327, ViewOnClickListenerC1057 viewOnClickListenerC1057) {
        C11235.m28311(dialogInterfaceC8327);
        viewOnClickListenerC1057.m3983();
    }

    /* JADX WARN: Code duplicated, block: B:50:0x01af A[PHI: r21 r24
      0x01af: PHI (r21v27 boolean) = (r21v22 boolean), (r21v28 boolean) binds: [B:48:0x0196, B:31:0x00eb] A[DONT_GENERATE, DONT_INLINE]
      0x01af: PHI (r24v16 java.lang.String) = (r24v11 java.lang.String), (r24v17 java.lang.String) binds: [B:48:0x0196, B:31:0x00eb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:81:0x0348 A[PHI: r2 r7 r15 r16 r21 r22 r24
      0x0348: PHI (r2v3 java.lang.String) = 
      (r2v1 java.lang.String)
      (r2v1 java.lang.String)
      (r2v2 java.lang.String)
      (r2v1 java.lang.String)
      (r2v1 java.lang.String)
     binds: [B:80:0x0346, B:70:0x02c6, B:66:0x0298, B:44:0x0179, B:8:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x0348: PHI (r7v4 java.lang.String) = 
      (r7v1 java.lang.String)
      (r7v1 java.lang.String)
      (r7v1 java.lang.String)
      (r7v3 java.lang.String)
      (r7v1 java.lang.String)
     binds: [B:80:0x0346, B:70:0x02c6, B:66:0x0298, B:44:0x0179, B:8:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x0348: PHI (r15v3 int) = (r15v2 int), (r15v1 int), (r15v1 int), (r15v1 int), (r15v1 int) binds: [B:80:0x0346, B:70:0x02c6, B:66:0x0298, B:44:0x0179, B:8:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x0348: PHI (r16v3 short) = (r16v2 short), (r16v1 short), (r16v1 short), (r16v1 short), (r16v1 short) binds: [B:80:0x0346, B:70:0x02c6, B:66:0x0298, B:44:0x0179, B:8:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x0348: PHI (r21v35 boolean) = (r21v14 boolean), (r21v17 boolean), (r21v18 boolean), (r21v23 boolean), (r21v36 boolean) binds: [B:80:0x0346, B:70:0x02c6, B:66:0x0298, B:44:0x0179, B:8:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x0348: PHI (r22v3 android.text.Editable) = 
      (r22v1 android.text.Editable)
      (r22v2 android.text.Editable)
      (r22v1 android.text.Editable)
      (r22v1 android.text.Editable)
      (r22v1 android.text.Editable)
     binds: [B:80:0x0346, B:70:0x02c6, B:66:0x0298, B:44:0x0179, B:8:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x0348: PHI (r24v22 java.lang.String) = 
      (r24v3 java.lang.String)
      (r24v6 java.lang.String)
      (r24v7 java.lang.String)
      (r24v12 java.lang.String)
      (r24v23 java.lang.String)
     binds: [B:80:0x0346, B:70:0x02c6, B:66:0x0298, B:44:0x0179, B:8:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:94:0x03ed A[PHI: r8 r17 r21 r24
      0x03ed: PHI (r8v4 java.lang.String) = (r8v1 java.lang.String), (r8v3 java.lang.String), (r8v1 java.lang.String) binds: [B:93:0x03eb, B:37:0x0125, B:12:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x03ed: PHI (r17v4 short[]) = (r17v3 short[]), (r17v2 short[]), (r17v2 short[]) binds: [B:93:0x03eb, B:37:0x0125, B:12:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x03ed: PHI (r21v33 boolean) = (r21v11 boolean), (r21v25 boolean), (r21v34 boolean) binds: [B:93:0x03eb, B:37:0x0125, B:12:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x03ed: PHI (r24v20 java.lang.String) = (r24v0 java.lang.String), (r24v14 java.lang.String), (r24v21 java.lang.String) binds: [B:93:0x03eb, B:37:0x0125, B:12:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0071, code lost:
    
        if (l.C1321.f4751 >= 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007e, code lost:
    
        if (l.C3033.f9831 < 0) goto L12;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m3963(com.google.android.material.textfield.TextInputLayout r27, boolean r28) {
        /*
            Method dump skipped, instruction units count: 1282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC1057.m3963(com.google.android.material.textfield.TextInputLayout, boolean):boolean");
    }

    /* JADX WARN: Code duplicated, block: B:49:0x01c2 A[PHI: r1 r4 r15
      0x01c2: PHI (r1v19 short[]) = (r1v18 short[]), (r1v2 short[]) binds: [B:48:0x01c0, B:26:0x00ce] A[DONT_GENERATE, DONT_INLINE]
      0x01c2: PHI (r4v4 java.util.Map) = (r4v3 java.util.Map), (r4v2 java.util.Map) binds: [B:48:0x01c0, B:26:0x00ce] A[DONT_GENERATE, DONT_INLINE]
      0x01c2: PHI (r15v3 java.lang.String) = (r15v2 java.lang.String), (r15v5 java.lang.String) binds: [B:48:0x01c0, B:26:0x00ce] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:97:0x03e2 A[PHI: r16 r19 r24 r27
      0x03e2: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:96:0x03e0, B:90:0x03bc, B:71:0x02d6, B:14:0x0098] A[DONT_GENERATE, DONT_INLINE]
      0x03e2: PHI (r19v7 java.lang.String) = (r19v2 java.lang.String), (r19v2 java.lang.String), (r19v6 java.lang.String), (r19v2 java.lang.String) binds: [B:96:0x03e0, B:90:0x03bc, B:71:0x02d6, B:14:0x0098] A[DONT_GENERATE, DONT_INLINE]
      0x03e2: PHI (r24v13 short[]) = (r24v5 short[]), (r24v6 short[]), (r24v11 short[]), (r24v17 short[]) binds: [B:96:0x03e0, B:90:0x03bc, B:71:0x02d6, B:14:0x0098] A[DONT_GENERATE, DONT_INLINE]
      0x03e2: PHI (r27v8 short) = (r27v2 short), (r27v3 short), (r27v1 short), (r27v1 short) binds: [B:96:0x03e0, B:90:0x03bc, B:71:0x02d6, B:14:0x0098] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a2, code lost:
    
        if (l.C1146.m4231() == false) goto L9;
     */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m3967(l.C13511 r28, l.ViewOnClickListenerC1057 r29, l.C13778 r30) {
        /*
            Method dump skipped, instruction units count: 1260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC1057.m3967(l.۬֨ᩴ, l.֨۠᩻, l.۬ۢ᩻):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        short[] sArr;
        int iM2761;
        int i;
        int i2;
        int i3;
        int iM3169;
        int i4;
        int iM2762;
        int i5;
        int i6;
        int i7;
        View view2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        EditText editText;
        int i13;
        String str;
        View view3;
        int i14;
        int i15;
        int i16;
        SpannableString spannableString;
        int iM2763;
        int iM2764;
        int i17;
        int i18;
        int iM31610;
        int i19;
        int i20;
        C2361 c2361;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        short[] sArr2;
        int i26;
        int i27;
        String str2;
        int i28;
        int i29;
        View view4;
        EditText editText2;
        int i30;
        String str3;
        String str4;
        View view5;
        int i31;
        int i32;
        int i33;
        SpannableString spannableString2;
        short[] sArr3;
        int iM31611;
        int i34;
        int i35;
        C2361 c2362;
        int i36;
        int i37;
        int i38;
        short[] sArr4;
        int i39;
        int i40;
        String str5;
        EditText editText3;
        int i41;
        String str6;
        View view6;
        SpannableString spannableString3;
        int i42;
        C2361 c2363;
        int i43;
        int i44;
        int i45;
        int i46;
        int i47;
        int i48;
        short[] sArr5;
        SpannableString spannableString4;
        int i49;
        EditText editText4;
        int i50;
        String str7;
        View viewM2812;
        String str8;
        int iM2765;
        int i51;
        int i52;
        int i53;
        C2361 c2364;
        int i54;
        int i55;
        int i56;
        int i57;
        int i58;
        View view7;
        SpannableString spannableString5;
        int i59;
        int i60;
        int i61;
        short[] sArr6;
        int i62;
        EditText editText5;
        int iM2766;
        int i63;
        int i64;
        int iM2767;
        int i65;
        int i66;
        C2361 c2365;
        int i67;
        int i68;
        int i69;
        int i70;
        SpannableString spannableString6;
        int i71;
        int i72;
        int iM31612;
        int i73;
        int i74;
        TextInputLayout textInputLayout = null;
        EditText editText6 = null;
        int i75 = -1597072422;
        int i76 = C0950.f3488;
        int i77 = C0773.f2792;
        int iM31613 = C0773.m3169("ۙۖ") ^ i76;
        int i78 = ((iM31613 ^ i77) * (-28643)) ^ 896421633;
        int i79 = iM31613 ^ (-1221514398);
        TextInputLayout textInputLayout2 = null;
        EditText editText7 = null;
        View view8 = null;
        View viewM9333 = null;
        View view9 = null;
        EditText editText8 = null;
        C2361 c2366 = null;
        String strM5510 = null;
        String str9 = null;
        SpannableString spannableString7 = null;
        C2361 c2361M13539 = null;
        short[] sArr7 = null;
        int i80 = 0;
        int i81 = 0;
        int iM9671 = 0;
        int i82 = 0;
        int iM31614 = 0;
        int i83 = 0;
        int i84 = 0;
        int i85 = 0;
        int i86 = 0;
        int iM31615 = 0;
        int iM31616 = 0;
        int i87 = 0;
        int i88 = 0;
        int i89 = 0;
        int iM2768 = 0;
        int iM31617 = 0;
        int i90 = 0;
        int i91 = 0;
        String strM10047 = null;
        View view10 = null;
        TextInputLayout textInputLayout3 = null;
        String[] strArr = null;
        int length = 0;
        int i92 = 0;
        int iM31618 = 0;
        TextInputLayout textInputLayout4 = null;
        int i93 = 0;
        while (true) {
            i75 = i79 ^ (i78 & (((i75 ^ i77) * 6389) >> 31));
            switch (i75) {
                case -2087203198:
                case 705100772:
                    C3492.m11487(c2361M13539, iM31617 ^ 2122329767, str9);
                    C11235.m28307(c2361M13539, C0773.m3169(C1826.m6310(f3786, 594, 3, i92)) ^ 2121388047, new DialogInterfaceOnClickListenerC24070(i81, this));
                    C5416.m16141(C3099.m10090(c2361M13539));
                    break;
                case -2086765285:
                case 85501687:
                    i3 = i93;
                    if (i80 == (C0773.m3169(C3448.m11252(f3786, 576, 3, i92)) ^ 2126374781)) {
                        iM3169 = C0773.m3169("ܳ᩹") ^ i77;
                        i = ((iM3169 ^ i76) * 7853) ^ (-1385837733);
                        i4 = 1505746530;
                    } else {
                        iM3169 = (i77 - C0619.m2761("ۙ᩺")) * (-125);
                        i = ((iM3169 ^ i76) * 15277) ^ 1048961905;
                        i4 = -1742414875;
                    }
                    int i94 = iM3169 ^ i4;
                    i93 = i3;
                    i79 = i94;
                    i78 = i;
                    break;
                case -2054804027:
                case 2135725665:
                    c2361M13539 = c2361M13539;
                    i93 = i93;
                    i89 = i89;
                    i90 = i90;
                    i91 = i91;
                    i81 = i81;
                    iM9671 = iM9671;
                    i84 = i84;
                    view8 = view8;
                    editText8 = editText8;
                    length = length;
                    strM10047 = strM10047;
                    view9 = view9;
                    i86 = i86;
                    iM31616 = iM31616;
                    i87 = i87;
                    spannableString7 = spannableString7;
                    short[] sArr8 = sArr7;
                    strM5510 = strM5510;
                    textInputLayout2 = textInputLayout2;
                    i85 = i85;
                    str9 = str9;
                    editText7 = editText7;
                    view10 = view10;
                    iM31615 = iM31615;
                    sArr = sArr8;
                    C17202.m40379(view, C4238.m13530(f3786, 440, 1, i92));
                    int iM13536 = C4238.m13536(view);
                    iM2768 = C0619.m2761(C2287.m7749(f3786, 441, 3, i92));
                    if (C2485.f7950 == 0) {
                        int iM31619 = C0773.m3169("ۚ᩵") ^ i77;
                        spannableString7 = spannableString7;
                        i81 = i81;
                        i89 = i89;
                        i87 = i87;
                        i93 = i93;
                        i79 = iM31619 ^ 1977035687;
                        i78 = ((iM31619 ^ i76) * (-27071)) ^ (-566949798);
                        i80 = iM13536;
                        iM31616 = iM31616;
                        i86 = i86;
                        view8 = view8;
                        view9 = view9;
                        i84 = i84;
                        strM10047 = strM10047;
                        length = length;
                        editText8 = editText8;
                        iM9671 = iM9671;
                        i90 = i90;
                        i91 = i91;
                        c2361M13539 = c2361M13539;
                        int i95 = i85;
                        textInputLayout2 = textInputLayout2;
                        strM5510 = strM5510;
                        sArr7 = sArr;
                        iM31615 = iM31615;
                        view10 = view10;
                        editText7 = editText7;
                        str9 = str9;
                        i85 = i95;
                    } else {
                        i80 = iM13536;
                        iM2762 = (C0773.m3169("֨ۛ") + i77) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i5 = ((iM2762 ^ i76) * (-26659)) ^ 907194823;
                        i6 = 252878532;
                        int i96 = iM2762 ^ i6;
                        view8 = view8;
                        spannableString7 = spannableString7;
                        i84 = i84;
                        i87 = i87;
                        iM9671 = iM9671;
                        i91 = i91;
                        iM31616 = iM31616;
                        i86 = i86;
                        view9 = view9;
                        strM10047 = strM10047;
                        length = length;
                        editText8 = editText8;
                        i90 = i90;
                        c2361M13539 = c2361M13539;
                        int i97 = i93;
                        i79 = i96;
                        i78 = i5;
                        i81 = i81;
                        i89 = i89;
                        i93 = i97;
                        int i98 = i85;
                        textInputLayout2 = textInputLayout2;
                        strM5510 = strM5510;
                        sArr7 = sArr;
                        iM31615 = iM31615;
                        view10 = view10;
                        editText7 = editText7;
                        str9 = str9;
                        i85 = i98;
                    }
                    break;
                case -1858637219:
                case 1293451816:
                    i3 = i93;
                    if (i80 == (C0619.m2761(C2966.m9670(f3786, 582, 3, i92)) ^ 2119904055)) {
                        iM3169 = C0773.m3169("ۨ۟") ^ i77;
                        i = ((iM3169 ^ i76) * (-14065)) ^ 1367764598;
                        i4 = 38757099;
                    } else {
                        iM3169 = (C0773.m3169("ۘܺ") + i76) * 31;
                        i = ((iM3169 ^ i77) * 31145) ^ 512000258;
                        i4 = 2046789436;
                    }
                    int i99 = iM3169 ^ i4;
                    i93 = i3;
                    i79 = i99;
                    i78 = i;
                    break;
                case -1803060160:
                case -62583587:
                    i3 = i93;
                    iM9671 = i88 + C2966.m9671(strArr[i82]) + i81;
                    if (iM9671 < spannableString7.length()) {
                        iM3169 = (i77 - C0773.m3169("ۙۢ")) * (-65);
                        i = ((iM3169 ^ i76) * (-20315)) ^ 1857907856;
                        i4 = -196605445;
                    } else {
                        iM3169 = (C0619.m2761("ᩳ֡") ^ i77) * (-97);
                        i = ((iM3169 ^ i76) * (-19003)) ^ 1084691528;
                        i4 = -1048485785;
                    }
                    int i910 = iM3169 ^ i4;
                    i93 = i3;
                    i79 = i910;
                    i78 = i;
                    break;
                case -1794798192:
                case 929704391:
                    c2363 = c2361M13539;
                    i36 = i93;
                    i43 = i86;
                    i44 = iM31615;
                    i45 = iM31616;
                    i46 = i87;
                    i37 = i89;
                    i47 = i90;
                    i48 = i91;
                    sArr5 = sArr7;
                    spannableString4 = spannableString7;
                    i39 = i81;
                    i49 = iM9671;
                    editText4 = editText8;
                    i50 = length;
                    str7 = strM10047;
                    viewM2812 = AbstractC0641.m2812(this, C0773.m3169(C2485.m8350(f3786, 485, 3, i92)) ^ 2103791610);
                    str8 = strM5510;
                    View viewM11246 = C3448.m11246(viewM2812, C0773.m3169(C1542.m5471(f3786, 488, 3, i92)) ^ 2127897496);
                    C0269.m1781(viewM11246, str7);
                    textInputLayout4 = (TextInputLayout) viewM11246;
                    if (C17202.m40372()) {
                        iM2765 = (i76 - C0619.m2761("ۗܺ")) * q.h;
                        i51 = ((iM2765 ^ i77) * (-11387)) ^ 864481127;
                        i52 = -1437790722;
                    } else {
                        iM2765 = C0773.m3169("᩹᩺") ^ i76;
                        i51 = ((iM2765 ^ i77) * 29753) ^ (-1760794403);
                        i52 = 144142514;
                    }
                    i53 = iM2765 ^ i52;
                    strM10047 = str7;
                    length = i50;
                    editText8 = editText4;
                    strM5510 = str8;
                    i90 = i47;
                    sArr7 = sArr5;
                    c2361M13539 = c2363;
                    iM31615 = i44;
                    i78 = i51;
                    iM9671 = i49;
                    i91 = i48;
                    int i100 = i43;
                    view9 = viewM2812;
                    spannableString7 = spannableString4;
                    i87 = i46;
                    iM31616 = i45;
                    i86 = i100;
                    int i101 = i36;
                    i79 = i53;
                    i81 = i39;
                    i89 = i37;
                    i93 = i101;
                    break;
                case -1756363312:
                case -855282127:
                    C2287.m7745();
                    if (RunnableC3055.f9898 < 0) {
                        c2361 = c2361M13539;
                        i21 = i93;
                        i22 = iM31615;
                        i23 = i89;
                        i24 = i90;
                        i25 = i91;
                        sArr2 = sArr7;
                        i26 = i81;
                        i27 = iM9671;
                        str2 = strM5510;
                        i28 = i84;
                        i29 = i85;
                        view4 = view8;
                        editText2 = editText8;
                        i30 = length;
                        str3 = str9;
                        str4 = strM10047;
                        view5 = view9;
                        i31 = i86;
                        i32 = iM31616;
                        i33 = i87;
                        spannableString2 = spannableString7;
                        iM31611 = (C0619.m2761("᩷᩸") ^ i77) * 81;
                        i34 = ((iM31611 ^ i76) * 16515) ^ 1285137290;
                        i35 = 1088577165;
                        int i102 = iM31611 ^ i35;
                        view8 = view4;
                        str9 = str3;
                        i85 = i29;
                        i84 = i28;
                        i81 = i26;
                        iM9671 = i27;
                        i91 = i25;
                        i89 = i23;
                        i93 = i21;
                        i79 = i102;
                        spannableString7 = spannableString2;
                        i87 = i33;
                        iM31616 = i32;
                        i86 = i31;
                        view9 = view5;
                        strM10047 = str4;
                        length = i30;
                        editText8 = editText2;
                        i90 = i24;
                        c2361M13539 = c2361;
                        sArr3 = sArr2;
                        iM31615 = i22;
                        i78 = i34;
                        strM5510 = str2;
                        sArr7 = sArr3;
                    } else {
                        c2363 = c2361M13539;
                        i36 = i93;
                        i44 = iM31615;
                        i37 = i89;
                        i47 = i90;
                        i48 = i91;
                        sArr5 = sArr7;
                        i39 = i81;
                        i49 = iM9671;
                        str8 = strM5510;
                        editText4 = editText8;
                        i50 = length;
                        str7 = strM10047;
                        int i103 = i87;
                        spannableString4 = spannableString7;
                        viewM2812 = view9;
                        i43 = i86;
                        i45 = iM31616;
                        i46 = i103;
                        iM2765 = C0773.m3169("᩹᩺") ^ i76;
                        i51 = ((iM2765 ^ i77) * 29753) ^ (-1760794403);
                        i52 = 144142514;
                        i53 = iM2765 ^ i52;
                        strM10047 = str7;
                        length = i50;
                        editText8 = editText4;
                        strM5510 = str8;
                        i90 = i47;
                        sArr7 = sArr5;
                        c2361M13539 = c2363;
                        iM31615 = i44;
                        i78 = i51;
                        iM9671 = i49;
                        i91 = i48;
                        int i104 = i43;
                        view9 = viewM2812;
                        spannableString7 = spannableString4;
                        i87 = i46;
                        iM31616 = i45;
                        i86 = i104;
                        int i105 = i36;
                        i79 = i53;
                        i81 = i39;
                        i89 = i37;
                        i93 = i105;
                    }
                    break;
                case -1754899985:
                case -425823501:
                    m3983();
                    break;
                case -1726574396:
                case -207922959:
                    i3 = i93;
                    if (i80 == (C0619.m2761(C2966.m9670(f3786, 563, 3, i92)) ^ 2104261530)) {
                        iM3169 = C0619.m2761("ۛ۫") ^ i76;
                        i = ((iM3169 ^ i77) * (-10155)) ^ (-327261978);
                        i4 = 2002551620;
                    } else {
                        iM3169 = (C0773.m3169("ۤۙ") + i76) * (-7);
                        i = ((iM3169 ^ i77) * (-21737)) ^ 905698848;
                        i4 = -1151641150;
                    }
                    int i911 = iM3169 ^ i4;
                    i93 = i3;
                    i79 = i911;
                    i78 = i;
                    break;
                case -1617235297:
                case -890008012:
                    C2361 c2361M3794 = C0950.m3794(this);
                    String strM6246 = C1783.m6246(this, iM31618);
                    C2310.m7811(strM6246, strM5510);
                    String strM6247 = C1783.m6246(this, iM31614);
                    C0269.m1781(strM6247, strM5510);
                    CharSequence[] charSequenceArr = new CharSequence[i91];
                    charSequenceArr[i90] = strM6246;
                    charSequenceArr[i89] = strM6247;
                    c2361M3794.m8014(charSequenceArr, new DialogInterface.OnClickListener() { // from class: l.֡ۖ᩻

                        /* JADX INFO: renamed from: ܿ᩸᩵, reason: not valid java name and contains not printable characters */
                        private static final short[] f1102 = {8839, 20318, 29525, -31606, 31647, 18692, 29656, 18448, -30937, 19063, -24701, 26163, 27348, -26613, 27955, -32765, -26305, -30093, 17948};

                        /* JADX WARN: Code duplicated, block: B:29:0x00ce  */
                        /* JADX WARN: Code duplicated, block: B:40:0x0145 A[PHI: r6 r7 r9
                          0x0145: PHI (r6v5 int) = (r6v2 int), (r6v4 int), (r6v2 int), (r6v2 int) binds: [B:96:0x0145, B:39:0x0143, B:24:0x00a3, B:14:0x0067] A[DONT_GENERATE, DONT_INLINE]
                          0x0145: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int) binds: [B:96:0x0145, B:39:0x0143, B:24:0x00a3, B:14:0x0067] A[DONT_GENERATE, DONT_INLINE]
                          0x0145: PHI (r9v5 int) = (r9v2 int), (r9v2 int), (r9v4 int), (r9v2 int) binds: [B:96:0x0145, B:39:0x0143, B:24:0x00a3, B:14:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i106) {
                            int iM2769;
                            int i107;
                            int i108;
                            int iM27610;
                            int i109;
                            int i110;
                            int iM31620;
                            int i111;
                            int i112;
                            int i113;
                            int i114 = RunnableC0334.f1808;
                            int i115 = C1542.f5343;
                            int iM31621 = (C0773.m3169("۟᩷") ^ i115) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                            int i116 = ((iM31621 ^ i114) * (-32185)) ^ (-680046278);
                            C2361 c2361M135310 = null;
                            String strM2756 = null;
                            short[] sArr9 = null;
                            short[] sArr10 = null;
                            int i117 = iM31621 ^ 35437348;
                            DialogInterfaceOnClickListenerC3866 dialogInterfaceOnClickListenerC3866 = null;
                            int iM27611 = 0;
                            int iM27612 = 0;
                            int i118 = 0;
                            int iM31622 = 0;
                            short s = 0;
                            short s2 = 0;
                            int i119 = 0;
                            int i120 = -1804344;
                            Runnable runnable = null;
                            ViewOnClickListenerC1057 viewOnClickListenerC1057 = null;
                            while (true) {
                                i120 = i117 ^ (i116 & (((i120 ^ i114) * (-3139)) >> 31));
                                switch (i120) {
                                    case -1946311108:
                                    case 457101702:
                                        c2361M135310 = C4238.m13539(viewOnClickListenerC1057);
                                        iM27611 = C0619.m2761(C23916.m53420(f1102, 4, 3, i119));
                                        if (AbstractC0641.f2496 < 0) {
                                            iM2769 = C0619.m2761("ܺ۬") ^ i114;
                                            i107 = ((iM2769 ^ i115) * (-12009)) ^ (-292864333);
                                            i108 = 1347248985;
                                            i117 = iM2769 ^ i108;
                                            i116 = i107;
                                        } else {
                                            int iM31623 = (C0773.m3169("᩷ܶ") ^ i115) * (-95);
                                            i111 = ((iM31623 ^ i114) * (-7517)) ^ (-841110876);
                                            i113 = iM31623 ^ 1936879224;
                                            DialogInterfaceOnClickListenerC3866 dialogInterfaceOnClickListenerC3867 = dialogInterfaceOnClickListenerC3866;
                                            i117 = i113;
                                            i116 = i111;
                                            dialogInterfaceOnClickListenerC3866 = dialogInterfaceOnClickListenerC3867;
                                        }
                                        break;
                                    case -1922874598:
                                    case -888703052:
                                        iM27612 = C0619.m2761(C13473.m33137(sArr10, 7, 3, i119));
                                        i118 = 2118620443;
                                        if (C2288.f7433 <= 0) {
                                            iM2769 = C0773.m3169("ܰ۠") ^ i114;
                                            i107 = ((iM2769 ^ i115) * (-4277)) ^ 2104708919;
                                            i108 = -757473465;
                                        } else {
                                            iM2769 = C0619.m2761("ۖ֡") ^ i114;
                                            i107 = ((iM2769 ^ i115) * 15347) ^ 1750815817;
                                            i108 = -1719234560;
                                        }
                                        i117 = iM2769 ^ i108;
                                        i116 = i107;
                                        break;
                                    case -1834142187:
                                    case -199094536:
                                        C2419.m8168(c2361M135310, C0773.m3169(strM2756) ^ 2129348692, dialogInterfaceOnClickListenerC3866);
                                        if (C3779.f12953 <= 0) {
                                            iM2769 = C0619.m2761("ܳ᩹") ^ i114;
                                            i107 = ((iM2769 ^ i115) * 25747) ^ 869607964;
                                            i108 = 460386947;
                                        } else {
                                            iM2769 = C0619.m2761("۬ۖ") ^ i114;
                                            i107 = ((iM2769 ^ i115) * (-5965)) ^ (-872568823);
                                            i108 = 234306714;
                                        }
                                        i117 = iM2769 ^ i108;
                                        i116 = i107;
                                        break;
                                    case -1724778499:
                                    case 944250687:
                                        iM31622 = C0773.m3169(AbstractC0641.m2820(f1102, 13, 3, i119));
                                        if (C2834.m9344() >= 0) {
                                            iM2769 = C0773.m3169("ܰ۠") ^ i114;
                                            i107 = ((iM2769 ^ i115) * (-4277)) ^ 2104708919;
                                            i108 = -757473465;
                                        } else {
                                            iM2769 = (C0619.m2761("ۖ᩺") + i115) * 119;
                                            i107 = ((iM2769 ^ i114) * (-2433)) ^ 1404375375;
                                            i108 = -1326718355;
                                        }
                                        i117 = iM2769 ^ i108;
                                        i116 = i107;
                                        break;
                                    case -1529233559:
                                    case 785380842:
                                        C2354.m7983();
                                        break;
                                    case -1405827427:
                                    case 1090787475:
                                        C3033.m9848(c2361M135310, 2098665091 ^ iM31622, runnable);
                                        C1321.m4860(c2361M135310);
                                        break;
                                    case -1405503676:
                                    case 579370165:
                                        C1321.m4857(c2361M135310, iM27612 ^ i118);
                                        int i121 = 0;
                                        if (C3779.f12953 > 0) {
                                            dialogInterfaceOnClickListenerC3866 = new DialogInterfaceOnClickListenerC3866(i121, viewOnClickListenerC1057);
                                            strM2756 = C0619.m2756(f1102, 10, 3, i119);
                                            if (AbstractC0641.f2496 < 0) {
                                                iM2769 = (C0619.m2761("ܿۙ") ^ i115) * 45;
                                                i107 = ((iM2769 ^ i114) * (-13001)) ^ 1465773322;
                                                i108 = 1958665227;
                                                i117 = iM2769 ^ i108;
                                                i116 = i107;
                                            } else {
                                                dialogInterfaceOnClickListenerC3866 = dialogInterfaceOnClickListenerC3866;
                                                c2361M135310 = c2361M135310;
                                                iM27610 = (C0619.m2761("᩶ۨ") ^ i115) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                                                i109 = ((iM27610 ^ i114) * 7329) ^ 878365489;
                                                i110 = -1997544714;
                                                dialogInterfaceOnClickListenerC3866 = dialogInterfaceOnClickListenerC3866;
                                                i117 = iM27610 ^ i110;
                                                i116 = i109;
                                                c2361M135310 = c2361M135310;
                                            }
                                        } else {
                                            c2361M135310 = c2361M135310;
                                            int iM31624 = C0773.m3169("ۖ֫") ^ i114;
                                            i117 = iM31624 ^ (-1014159242);
                                            i116 = ((iM31624 ^ i115) * (-26763)) ^ (-1338244062);
                                            c2361M135310 = c2361M135310;
                                            dialogInterfaceOnClickListenerC3866 = null;
                                        }
                                        break;
                                    case -1381079329:
                                    case -284029244:
                                        dialogInterfaceOnClickListenerC3866 = dialogInterfaceOnClickListenerC3866;
                                        c2361M135310 = c2361M135310;
                                        int i122 = ViewOnClickListenerC1057.f3785;
                                        viewOnClickListenerC1057 = this.f1103;
                                        runnable = null;
                                        if (i106 == 0) {
                                            iM27610 = (i114 - C0773.m3169("۠᩸")) * 79;
                                            i109 = ((iM27610 ^ i115) * 17697) ^ (-1377712697);
                                            i110 = 708952354;
                                        } else {
                                            iM27610 = (C0773.m3169("᩶᩶") + i114) * (-5);
                                            i109 = ((iM27610 ^ i115) * 16737) ^ 830773938;
                                            i110 = 509092238;
                                        }
                                        dialogInterfaceOnClickListenerC3866 = dialogInterfaceOnClickListenerC3866;
                                        i117 = iM27610 ^ i110;
                                        i116 = i109;
                                        c2361M135310 = c2361M135310;
                                        break;
                                    case -1300818817:
                                    case -749342286:
                                        dialogInterfaceOnClickListenerC3866 = dialogInterfaceOnClickListenerC3866;
                                        c2361M135310 = c2361M135310;
                                        s = sArr9[0];
                                        s2 = 14730;
                                        if (C3448.f11240 < 0) {
                                            iM27610 = (C0773.m3169("᩷ܽ") ^ i114) * (-89);
                                            i109 = ((iM27610 ^ i115) * (-12967)) ^ (-106534785);
                                            i110 = 998954126;
                                            dialogInterfaceOnClickListenerC3866 = dialogInterfaceOnClickListenerC3866;
                                            i117 = iM27610 ^ i110;
                                            i116 = i109;
                                            c2361M135310 = c2361M135310;
                                        } else {
                                            int iM31625 = C0773.m3169("ۖ֫") ^ i114;
                                            i117 = iM31625 ^ (-1014159242);
                                            i116 = ((iM31625 ^ i115) * (-26763)) ^ (-1338244062);
                                            c2361M135310 = c2361M135310;
                                            dialogInterfaceOnClickListenerC3866 = null;
                                        }
                                        break;
                                    case -1233861089:
                                    case -849833226:
                                        i119 = 7673;
                                        iM27610 = C0773.m3169("᩵ۘ") ^ i115;
                                        i109 = ((iM27610 ^ i114) * 1039) ^ (-2018070469);
                                        i110 = -1502546453;
                                        dialogInterfaceOnClickListenerC3866 = dialogInterfaceOnClickListenerC3866;
                                        i117 = iM27610 ^ i110;
                                        i116 = i109;
                                        c2361M135310 = c2361M135310;
                                        break;
                                    case -1221134613:
                                    case -403162917:
                                        if (AbstractC0641.f2496 >= 0) {
                                            iM2769 = C0619.m2761("ܳ᩹") ^ i114;
                                            i107 = ((iM2769 ^ i115) * 25747) ^ 869607964;
                                            i108 = 460386947;
                                        } else {
                                            iM2769 = C0773.m3169("ܰ۠") ^ i114;
                                            i107 = ((iM2769 ^ i115) * (-4277)) ^ 2104708919;
                                            i108 = -757473465;
                                        }
                                        i117 = iM2769 ^ i108;
                                        i116 = i107;
                                        break;
                                    case -1078693669:
                                    case 1669636201:
                                        C2361 c2367 = c2361M135310;
                                        int iM31626 = C0773.m3169(C3492.m11486(f1102, 1, 3, i119));
                                        if (C2288.f7433 > 0) {
                                            C13511 c13511 = new C13511(viewOnClickListenerC1057, iM31626 ^ 2119581781);
                                            C1343.m4951(c13511);
                                            c13511.m33188(runnable);
                                            C7791.m21182(new C4040(c13511, viewOnClickListenerC1057), viewOnClickListenerC1057);
                                        } else {
                                            c2361M135310 = c2367;
                                            int iM31627 = (C0773.m3169("᩷ܶ") ^ i115) * (-95);
                                            i111 = ((iM31627 ^ i114) * (-7517)) ^ (-841110876);
                                            i113 = iM31627 ^ 1936879224;
                                            DialogInterfaceOnClickListenerC3866 dialogInterfaceOnClickListenerC3868 = dialogInterfaceOnClickListenerC3866;
                                            i117 = i113;
                                            i116 = i111;
                                            dialogInterfaceOnClickListenerC3866 = dialogInterfaceOnClickListenerC3868;
                                        }
                                        break;
                                    case -987558064:
                                    case 1710390116:
                                        C2485.m8345(c2361M135310, 2123960558 ^ iM27611);
                                        sArr10 = f1102;
                                        if (C3099.f10023 > 0) {
                                            iM2769 = C0773.m3169("ۘۨ") ^ i115;
                                            i107 = ((iM2769 ^ i114) * (-23665)) ^ (-2137186541);
                                            i108 = -2107216760;
                                            i117 = iM2769 ^ i108;
                                            i116 = i107;
                                        } else {
                                            c2361M135310 = c2361M135310;
                                            int iM31628 = C0773.m3169("ۖ֫") ^ i114;
                                            i117 = iM31628 ^ (-1014159242);
                                            i116 = ((iM31628 ^ i115) * (-26763)) ^ (-1338244062);
                                            c2361M135310 = c2361M135310;
                                            dialogInterfaceOnClickListenerC3866 = null;
                                        }
                                        break;
                                    case -561560381:
                                    case 629534209:
                                        C3077.m10039(C0619.m2761(AbstractC0641.m2820(f1102, 16, 3, i119)) ^ 2098671074);
                                        break;
                                    case -412695496:
                                    case 1387017566:
                                        C1783.m6232();
                                        iM2769 = C0619.m2761("ܳ᩹") ^ i114;
                                        i107 = ((iM2769 ^ i115) * 25747) ^ 869607964;
                                        i108 = 460386947;
                                        i117 = iM2769 ^ i108;
                                        i116 = i107;
                                        break;
                                    case -310944325:
                                    case 1231313264:
                                        dialogInterfaceOnClickListenerC3866 = dialogInterfaceOnClickListenerC3866;
                                        C2361 c2368 = c2361M135310;
                                        if (C18978.m44075()) {
                                            iM31620 = C0773.m3169("ۛۙ") ^ i115;
                                            i111 = ((iM31620 ^ i114) * (-30689)) ^ 864964185;
                                            i112 = 1382009588;
                                        } else {
                                            iM31620 = (i115 - C0619.m2761("ۖ۠")) * 85;
                                            i111 = ((iM31620 ^ i114) * 16943) ^ (-1415125655);
                                            i112 = -2085917367;
                                        }
                                        i113 = iM31620 ^ i112;
                                        c2361M135310 = c2368;
                                        DialogInterfaceOnClickListenerC3866 dialogInterfaceOnClickListenerC3869 = dialogInterfaceOnClickListenerC3866;
                                        i117 = i113;
                                        i116 = i111;
                                        dialogInterfaceOnClickListenerC3866 = dialogInterfaceOnClickListenerC3869;
                                        break;
                                    case 615585660:
                                    case 1932033576:
                                        if (C0269.f1558 <= 0) {
                                            int iM31629 = (C0773.m3169("᩷ܶ") ^ i115) * (-95);
                                            i111 = ((iM31629 ^ i114) * (-7517)) ^ (-841110876);
                                            i113 = iM31629 ^ 1936879224;
                                            DialogInterfaceOnClickListenerC3866 dialogInterfaceOnClickListenerC38610 = dialogInterfaceOnClickListenerC3866;
                                            i117 = i113;
                                            i116 = i111;
                                            dialogInterfaceOnClickListenerC3866 = dialogInterfaceOnClickListenerC38610;
                                        } else {
                                            iM2769 = C0619.m2761("ܳ᩹") ^ i114;
                                            i107 = ((iM2769 ^ i115) * 25747) ^ 869607964;
                                            i108 = 460386947;
                                            i117 = iM2769 ^ i108;
                                            i116 = i107;
                                        }
                                        break;
                                    case 793487031:
                                    case 1643732784:
                                        dialogInterfaceOnClickListenerC3866 = dialogInterfaceOnClickListenerC3866;
                                        c2361M135310 = c2361M135310;
                                        sArr9 = f1102;
                                        if (C1826.f6190 <= 0) {
                                            iM27610 = (C0619.m2761("᩶ۨ") ^ i115) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                                            i109 = ((iM27610 ^ i114) * 7329) ^ 878365489;
                                            i110 = -1997544714;
                                        } else {
                                            iM27610 = (C0773.m3169("۬۬") ^ i115) * (-89);
                                            i109 = ((iM27610 ^ i114) * 12955) ^ (-324580044);
                                            i110 = -817120437;
                                        }
                                        dialogInterfaceOnClickListenerC3866 = dialogInterfaceOnClickListenerC3866;
                                        i117 = iM27610 ^ i110;
                                        i116 = i109;
                                        c2361M135310 = c2361M135310;
                                        break;
                                    case 880663184:
                                    case 1687681746:
                                        i119 = 9034;
                                        iM27610 = C0773.m3169("᩵ۘ") ^ i115;
                                        i109 = ((iM27610 ^ i114) * 1039) ^ (-2018070469);
                                        i110 = -1502546453;
                                        dialogInterfaceOnClickListenerC3866 = dialogInterfaceOnClickListenerC3866;
                                        i117 = iM27610 ^ i110;
                                        i116 = i109;
                                        c2361M135310 = c2361M135310;
                                        break;
                                    case 1732862805:
                                    case 1792379633:
                                        dialogInterfaceOnClickListenerC3866 = dialogInterfaceOnClickListenerC3866;
                                        c2361M135310 = c2361M135310;
                                        int i123 = s + s2;
                                        int i124 = (s * s) + 216972900;
                                        if ((i123 * i123) - (i124 + i124) <= 0) {
                                            iM27610 = (C0773.m3169("ۘ᩵") + i115) * (-117);
                                            i109 = ((iM27610 ^ i114) * (-12919)) ^ (-211415387);
                                            i110 = -1013786564;
                                        } else {
                                            iM27610 = C0619.m2761("᩶ܿ") ^ i114;
                                            i109 = ((iM27610 ^ i115) * 1285) ^ (-1853485744);
                                            i110 = 1361788820;
                                        }
                                        dialogInterfaceOnClickListenerC3866 = dialogInterfaceOnClickListenerC3866;
                                        i117 = iM27610 ^ i110;
                                        i116 = i109;
                                        c2361M135310 = c2361M135310;
                                        break;
                                    default:
                                        C11235.m28309();
                                        if (C2354.f7599 >= 0) {
                                            dialogInterfaceOnClickListenerC3866 = dialogInterfaceOnClickListenerC3866;
                                            c2361M135310 = c2361M135310;
                                            iM27610 = (C0619.m2761("᩶ۨ") ^ i115) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                                            i109 = ((iM27610 ^ i114) * 7329) ^ 878365489;
                                            i110 = -1997544714;
                                            dialogInterfaceOnClickListenerC3866 = dialogInterfaceOnClickListenerC3866;
                                            i117 = iM27610 ^ i110;
                                            i116 = i109;
                                            c2361M135310 = c2361M135310;
                                        } else {
                                            iM2769 = C0773.m3169("ܰ۠") ^ i114;
                                            i107 = ((iM2769 ^ i115) * (-4277)) ^ 2104708919;
                                            i108 = -757473465;
                                            i117 = iM2769 ^ i108;
                                            i116 = i107;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    C3099.m10090(c2361M3794);
                    break;
                case -1614829121:
                case -295990042:
                    AbstractC0641.m2813();
                    if (!C3099.m10095()) {
                        iM2761 = (C0619.m2761("ۢۖ") + i76) * (-39);
                        i = ((iM2761 ^ i77) * 13951) ^ (-1453496995);
                        i2 = -373923125;
                        i79 = iM2761 ^ i2;
                        i78 = i;
                    } else {
                        c2364 = c2361M13539;
                        i54 = i93;
                        i55 = iM31615;
                        i56 = i89;
                        i57 = i90;
                        i38 = i91;
                        sArr6 = sArr7;
                        i58 = i81;
                        i40 = iM9671;
                        view7 = view9;
                        i61 = i86;
                        i59 = iM31616;
                        i60 = i87;
                        spannableString5 = spannableString7;
                        editText5 = editText8;
                        i62 = length;
                        int iM31620 = (i77 - C0773.m3169("᩵ۛ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i90 = i57;
                        sArr7 = sArr6;
                        c2361M13539 = c2364;
                        iM31615 = i55;
                        i78 = ((iM31620 ^ i76) * 3121) ^ 622784677;
                        length = i62;
                        editText8 = editText5;
                        spannableString7 = spannableString5;
                        i87 = i60;
                        iM31616 = i59;
                        i86 = i61;
                        view9 = view7;
                        i81 = i58;
                        i89 = i56;
                        i93 = i54;
                        i79 = iM31620 ^ 1433084936;
                        iM9671 = i40;
                        i91 = i38;
                    }
                    break;
                case -1589606641:
                case 976988329:
                    C2361 c2367 = c2361M13539;
                    int i106 = i93;
                    int i107 = i87;
                    int i108 = i89;
                    int i109 = i91;
                    SpannableString spannableString8 = spannableString7;
                    int i110 = i81;
                    int i111 = iM9671;
                    int i112 = iM31616;
                    short[] sArr9 = sArr7;
                    if (i80 == (C0773.m3169(C0862.m3500(f3786, 503, 3, i92)) ^ 2097563778)) {
                        iM2766 = C0619.m2761("᩺ۘ") ^ i77;
                        i63 = ((iM2766 ^ i76) * (-989)) ^ (-1967711478);
                        i64 = 147031708;
                    } else {
                        iM2766 = C0619.m2761("ܳ᩵") ^ i77;
                        i63 = ((iM2766 ^ i76) * (-31575)) ^ 569063722;
                        i64 = -1759921000;
                    }
                    int i113 = iM2766 ^ i64;
                    sArr7 = sArr9;
                    iM9671 = i111;
                    c2361M13539 = c2367;
                    i91 = i109;
                    i79 = i113;
                    i78 = i63;
                    i81 = i110;
                    i89 = i108;
                    i93 = i106;
                    iM31616 = i112;
                    spannableString7 = spannableString8;
                    i87 = i107;
                    break;
                case -1500455315:
                case 1892796085:
                    i3 = i93;
                    if (C18978.m44085()) {
                        iM3169 = C0773.m3169("۟ۛ") ^ i76;
                        i = ((iM3169 ^ i77) * (-5251)) ^ (-1091918171);
                        i4 = 1374688559;
                    } else {
                        iM3169 = C0619.m2761("᩵ܳ") ^ i77;
                        i = ((iM3169 ^ i76) * 30555) ^ (-773649480);
                        i4 = 1829770560;
                    }
                    int i912 = iM3169 ^ i4;
                    i93 = i3;
                    i79 = i912;
                    i78 = i;
                    break;
                case -1482246460:
                case 1163599608:
                    String strM12271 = C3779.m12271(this, C0773.m3169(C1542.m5471(f3786, 572, 3, i92)) ^ 2121453051);
                    int iM8177 = C2419.m8177(6.0f);
                    String[] strArrM9484 = C2878.m9484(C1080.m4058(strM12271), C3734.m12149(f3786, 575, 1, i92));
                    int i114 = C24276.f78588;
                    SpannableString spannableString9 = new SpannableString(strArrM9484 != null ? C24276.m54282(strArrM9484.length, C1343.m4939(f3786, 579, 3, i92), strArrM9484) : str9);
                    i93 = iM8177;
                    i82 = i90;
                    i88 = 0;
                    strArr = strArrM9484;
                    length = strArrM9484.length;
                    spannableString7 = spannableString9;
                    iM2761 = (C0619.m2761("۠۟") ^ i76) * (-123);
                    i = ((iM2761 ^ i77) * (-23377)) ^ (-1715375998);
                    i2 = -198682036;
                    i79 = iM2761 ^ i2;
                    i78 = i;
                    break;
                case -1467499221:
                case 1720943707:
                    i3 = i93;
                    if (i80 == (C0773.m3169(C1146.m4222(f3786, 566, 3, i92)) ^ 2119323367)) {
                        iM3169 = (C0773.m3169("᩸ۧ") ^ i76) * (-115);
                        i = ((iM3169 ^ i77) * (-7543)) ^ 1765232514;
                        i4 = 1575040031;
                    } else {
                        iM3169 = C0619.m2761("ܿ۫") ^ i77;
                        i = ((iM3169 ^ i76) * 19547) ^ 1502354667;
                        i4 = 1164030554;
                    }
                    int i913 = iM3169 ^ i4;
                    i93 = i3;
                    i79 = i913;
                    i78 = i;
                    break;
                case -1464899545:
                case 1138419789:
                    c2365 = c2361M13539;
                    i67 = i93;
                    i68 = i87;
                    i69 = i89;
                    i70 = i91;
                    spannableString6 = spannableString7;
                    i71 = i81;
                    i72 = iM9671;
                    if (i80 == (C0619.m2761(C23916.m53420(f3786, 545, 3, i92)) ^ 2127259213)) {
                        iM31612 = (C0619.m2761("ۤܿ") ^ i77) * (-83);
                        i73 = ((iM31612 ^ i76) * (-4073)) ^ 73265587;
                        i74 = 813063517;
                    } else {
                        iM31612 = (C0619.m2761("᩹ۙ") ^ i76) * 73;
                        i73 = ((iM31612 ^ i77) * (-3703)) ^ 1591104376;
                        i74 = -385687811;
                    }
                    int i115 = iM31612 ^ i74;
                    iM9671 = i72;
                    c2361M13539 = c2365;
                    i91 = i70;
                    SpannableString spannableString10 = spannableString6;
                    i87 = i68;
                    i78 = i73;
                    i81 = i71;
                    i89 = i69;
                    i93 = i67;
                    i79 = i115;
                    spannableString7 = spannableString10;
                    break;
                case -1441152557:
                case 1699502267:
                    i3 = i93;
                    i81 = 3;
                    if (i82 < length) {
                        iM3169 = (C0619.m2761("᩶᩵") ^ i76) * 31;
                        i = ((iM3169 ^ i77) * (-20583)) ^ (-809500583);
                        i4 = -646625907;
                    } else {
                        iM3169 = C0619.m2761("۫ۤ") ^ i77;
                        i = ((iM3169 ^ i76) * (-1119)) ^ (-1473201712);
                        i4 = 35612712;
                    }
                    int i914 = iM3169 ^ i4;
                    i93 = i3;
                    i79 = i914;
                    i78 = i;
                    break;
                case -1419723926:
                case 538601043:
                    c2361M13539 = c2361M13539;
                    i93 = i93;
                    i89 = i89;
                    i90 = i90;
                    i91 = i91;
                    i81 = i81;
                    iM9671 = iM9671;
                    i84 = i84;
                    view8 = view8;
                    editText8 = editText8;
                    length = length;
                    strM10047 = strM10047;
                    view9 = view9;
                    i86 = i86;
                    iM31616 = iM31616;
                    i87 = i87;
                    spannableString7 = spannableString7;
                    short[] sArr10 = sArr7;
                    strM5510 = strM5510;
                    textInputLayout2 = textInputLayout2;
                    i85 = i85;
                    str9 = str9;
                    editText7 = editText7;
                    view10 = view10;
                    iM31615 = iM31615;
                    sArr = sArr10;
                    short s = f3786[439];
                    if ((s * 23722) - ((s * s) + 140683321) <= 0) {
                        iM2762 = (C0619.m2761("ۢۜ") + i76) * (-81);
                        i5 = ((iM2762 ^ i77) * (-14423)) ^ 1390805202;
                        i6 = 863288137;
                    } else {
                        iM2762 = C0619.m2761("᩵ۜ") ^ i77;
                        i5 = ((iM2762 ^ i76) * 549) ^ (-1078798175);
                        i6 = 909402095;
                    }
                    int i915 = iM2762 ^ i6;
                    view8 = view8;
                    spannableString7 = spannableString7;
                    i84 = i84;
                    i87 = i87;
                    iM9671 = iM9671;
                    i91 = i91;
                    iM31616 = iM31616;
                    i86 = i86;
                    view9 = view9;
                    strM10047 = strM10047;
                    length = length;
                    editText8 = editText8;
                    i90 = i90;
                    c2361M13539 = c2361M13539;
                    int i916 = i93;
                    i79 = i915;
                    i78 = i5;
                    i81 = i81;
                    i89 = i89;
                    i93 = i916;
                    int i917 = i85;
                    textInputLayout2 = textInputLayout2;
                    strM5510 = strM5510;
                    sArr7 = sArr;
                    iM31615 = iM31615;
                    view10 = view10;
                    editText7 = editText7;
                    str9 = str9;
                    i85 = i917;
                    break;
                case -1390866433:
                case -747440403:
                    C2361 c2361M3795 = C0950.m3794(this);
                    String strM6248 = C1783.m6246(this, iM31618);
                    C2310.m7811(strM6248, strM5510);
                    String strM12272 = C3779.m12271(this, iM31614);
                    C0269.m1781(strM12272, strM5510);
                    CharSequence[] charSequenceArr2 = new CharSequence[i91];
                    charSequenceArr2[i90] = strM6248;
                    charSequenceArr2[i89] = strM12272;
                    c2361M3795.m8014(charSequenceArr2, new DialogInterface.OnClickListener() { // from class: l.ܽ۠᩻

                        /* JADX INFO: renamed from: ܰ᩻ۘ, reason: not valid java name and contains not printable characters */
                        private static final short[] f56783 = {5313, -22747, -29692, -20330, 19757, 22166, -29763, -30823, 16473, -29465, 22598, 23710, 18648, 17871, -23888, -20783, 22639, -17826, -18779};

                        /* JADX WARN: Code duplicated, block: B:29:0x00eb A[PHI: r9
                          0x00eb: PHI (r9v5 int) = (r9v4 int), (r9v2 int) binds: [B:28:0x00e9, B:17:0x0095] A[DONT_GENERATE, DONT_INLINE]] */
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i116) {
                            int iM2769;
                            int i117;
                            int i118;
                            int iM31621;
                            int i119;
                            int i120;
                            int iM31622;
                            int i121;
                            int i122;
                            int i123 = C23916.f77426;
                            int i124 = C3099.f10023;
                            int iM31623 = (C0773.m3169("ᩴۗ") ^ i124) * (-25);
                            int i125 = ((iM31623 ^ i123) * (-16965)) ^ 866332957;
                            C2361 c2361M135310 = null;
                            String strM6233 = null;
                            short[] sArr11 = null;
                            short[] sArr12 = null;
                            int i126 = iM31623 ^ 2033886046;
                            DialogInterface.OnClickListener onClickListener = null;
                            int iM31624 = 0;
                            int iM31625 = 0;
                            int i127 = 0;
                            int iM31626 = 0;
                            short s2 = 0;
                            short s3 = 0;
                            int i128 = 0;
                            int i129 = 798752471;
                            Runnable runnable = null;
                            final ViewOnClickListenerC1057 viewOnClickListenerC1057 = null;
                            while (true) {
                                i129 = i126 ^ (i125 & (((i129 ^ i123) * 28909) >> 31));
                                switch (i129) {
                                    case -2108112579:
                                    case -1664201105:
                                        C17202.m40372();
                                        break;
                                    case -2017001614:
                                    case -804101692:
                                        if (C1343.f4799 == 0) {
                                            onClickListener = onClickListener;
                                            c2361M135310 = c2361M135310;
                                            iM2769 = (C0619.m2761("᩻᩶") + i123) * 71;
                                            i117 = ((iM2769 ^ i124) * (-17017)) ^ (-552401989);
                                            i118 = 1420031195;
                                            onClickListener = onClickListener;
                                            i126 = iM2769 ^ i118;
                                            i125 = i117;
                                            c2361M135310 = c2361M135310;
                                        } else {
                                            iM31622 = (C0773.m3169("ۖ۠") ^ i124) * (-37);
                                            i121 = ((iM31622 ^ i123) * (-26973)) ^ (-397986396);
                                            i122 = -1099328455;
                                            i126 = iM31622 ^ i122;
                                            i125 = i121;
                                        }
                                        break;
                                    case -1984088003:
                                    case 1125263031:
                                        iM31626 = C0773.m3169(C1146.m4222(f56783, 13, 3, i128));
                                        if (C4282.f15546 <= 0) {
                                            iM31622 = (C0619.m2761("᩻ۛ") + i124) * 29;
                                            i121 = ((iM31622 ^ i123) * (-29445)) ^ 194353335;
                                            i122 = -510929821;
                                        } else {
                                            iM31622 = C0619.m2761("ۘ᩸") ^ i124;
                                            i121 = ((iM31622 ^ i123) * (-14521)) ^ (-1857116763);
                                            i122 = -2082389881;
                                        }
                                        i126 = iM31622 ^ i122;
                                        i125 = i121;
                                        break;
                                    case -1826867658:
                                    case 908909747:
                                        i128 = 54869;
                                        iM2769 = (C0619.m2761("ۨ᩻") + i124) * 19;
                                        i117 = ((iM2769 ^ i123) * 27737) ^ 256550144;
                                        i118 = 1839353566;
                                        onClickListener = onClickListener;
                                        i126 = iM2769 ^ i118;
                                        i125 = i117;
                                        c2361M135310 = c2361M135310;
                                        break;
                                    case -1789159744:
                                    case -476562427:
                                        onClickListener = onClickListener;
                                        c2361M135310 = c2361M135310;
                                        int i130 = ViewOnClickListenerC1057.f3785;
                                        viewOnClickListenerC1057 = this.f56784;
                                        runnable = null;
                                        if (i116 == 0) {
                                            iM2769 = C0773.m3169("᩹ܶ") ^ i124;
                                            i117 = ((iM2769 ^ i123) * (-19043)) ^ (-702275695);
                                            i118 = 1904043518;
                                        } else {
                                            iM2769 = (i123 - C0773.m3169("ۜܳ")) * 3;
                                            i117 = ((iM2769 ^ i124) * (-28621)) ^ 911254030;
                                            i118 = 235115275;
                                        }
                                        onClickListener = onClickListener;
                                        i126 = iM2769 ^ i118;
                                        i125 = i117;
                                        c2361M135310 = c2361M135310;
                                        break;
                                    case -1739729382:
                                    case 2086996943:
                                        C2966.m9668(C0619.m2761(C0862.m3500(f56783, 16, 3, i128)) ^ 2100383996);
                                        break;
                                    case -1396096812:
                                    case -609004383:
                                        RunnableC1848.m6359(c2361M135310, 2099950648 ^ iM31626, runnable);
                                        C3099.m10090(c2361M135310);
                                        break;
                                    case -1338203203:
                                    case -998402001:
                                        C3492.m11487(c2361M135310, C0619.m2761(strM6233) ^ 2100611772, onClickListener);
                                        if (AbstractC0116.f1064 > 0) {
                                            iM31622 = C0773.m3169("ۛۡ") ^ i123;
                                            i121 = ((iM31622 ^ i124) * 1955) ^ 2075264424;
                                            i122 = -1285639987;
                                            i126 = iM31622 ^ i122;
                                            i125 = i121;
                                        } else {
                                            int iM31627 = C0773.m3169("֨۠") ^ i124;
                                            i126 = iM31627 ^ (-543902772);
                                            i125 = ((iM31627 ^ i123) * 435) ^ (-450662834);
                                            onClickListener = null;
                                        }
                                        break;
                                    case -1213769019:
                                    case 545112847:
                                        C3099.m10095();
                                        if (C2023.m6964() <= 0) {
                                            iM31622 = (C0773.m3169("ۖ۠") ^ i124) * (-37);
                                            i121 = ((iM31622 ^ i123) * (-26973)) ^ (-397986396);
                                            i122 = -1099328455;
                                        } else {
                                            iM31622 = (C0619.m2761("᩻ۛ") + i124) * 29;
                                            i121 = ((iM31622 ^ i123) * (-29445)) ^ 194353335;
                                            i122 = -510929821;
                                        }
                                        i126 = iM31622 ^ i122;
                                        i125 = i121;
                                        break;
                                    case -1116706395:
                                    case 625751104:
                                        c2361M135310 = C4238.m13539(viewOnClickListenerC1057);
                                        iM31624 = C0773.m3169(C2966.m9670(f56783, 4, 3, i128));
                                        if (C4282.f15546 > 0) {
                                            iM31622 = C0773.m3169("ۚ۠") ^ i123;
                                            i121 = ((iM31622 ^ i124) * (-1673)) ^ 625629520;
                                            i122 = 458465881;
                                            i126 = iM31622 ^ i122;
                                            i125 = i121;
                                        } else {
                                            int iM31628 = C0773.m3169("֨۠") ^ i124;
                                            i126 = iM31628 ^ (-543902772);
                                            i125 = ((iM31628 ^ i123) * 435) ^ (-450662834);
                                            onClickListener = null;
                                        }
                                        break;
                                    case -1096485834:
                                    case 2065222265:
                                        onClickListener = onClickListener;
                                        c2361M135310 = c2361M135310;
                                        if (C18978.m44075()) {
                                            iM31621 = (C0773.m3169("֡֫") + i123) * (-83);
                                            i119 = ((iM31621 ^ i124) * 15817) ^ (-465615085);
                                            i120 = 1432425829;
                                        } else {
                                            iM31621 = (C0773.m3169("ۨۖ") + i123) * (-107);
                                            i119 = ((iM31621 ^ i124) * 9247) ^ 403067451;
                                            i120 = 519746331;
                                        }
                                        int i131 = iM31621 ^ i120;
                                        c2361M135310 = c2361M135310;
                                        DialogInterface.OnClickListener onClickListener2 = onClickListener;
                                        i126 = i131;
                                        i125 = i119;
                                        onClickListener = onClickListener2;
                                        break;
                                    case -913751155:
                                    case 690791589:
                                        int iM27610 = C0619.m2761(C1564.m5510(f56783, 1, 3, i128));
                                        if (C0950.f3488 < 0) {
                                            C13511 c13511 = new C13511(viewOnClickListenerC1057, iM27610 ^ 2124884345);
                                            C1343.m4951(c13511);
                                            c13511.m33188(runnable);
                                            C7791.m21183(new C14480(c13511, viewOnClickListenerC1057), viewOnClickListenerC1057);
                                        }
                                        iM31621 = C0773.m3169("ۗۨ") ^ i123;
                                        i119 = ((iM31621 ^ i124) * 7509) ^ 1221685119;
                                        i120 = 446581352;
                                        int i132 = iM31621 ^ i120;
                                        c2361M135310 = c2361M135310;
                                        DialogInterface.OnClickListener onClickListener3 = onClickListener;
                                        i126 = i132;
                                        i125 = i119;
                                        onClickListener = onClickListener3;
                                        break;
                                    case -531631731:
                                    case -170348910:
                                        C3033.m9845();
                                        C20932.m47848();
                                        iM31622 = (C0773.m3169("ۖ۠") ^ i124) * (-37);
                                        i121 = ((iM31622 ^ i123) * (-26973)) ^ (-397986396);
                                        i122 = -1099328455;
                                        i126 = iM31622 ^ i122;
                                        i125 = i121;
                                        break;
                                    case -502865822:
                                    case 1584559042:
                                        onClickListener = onClickListener;
                                        c2361M135310 = c2361M135310;
                                        s2 = sArr11[0];
                                        s3 = 1;
                                        if (C3033.m9845() > 0) {
                                            iM2769 = C0773.m3169("֡ۙ") ^ i123;
                                            i117 = ((iM2769 ^ i124) * 17227) ^ (-915501385);
                                            i118 = 2141242420;
                                            onClickListener = onClickListener;
                                            i126 = iM2769 ^ i118;
                                            i125 = i117;
                                            c2361M135310 = c2361M135310;
                                        } else {
                                            c2361M135310 = c2361M135310;
                                            int iM31629 = C0773.m3169("֨۠") ^ i124;
                                            i126 = iM31629 ^ (-543902772);
                                            i125 = ((iM31629 ^ i123) * 435) ^ (-450662834);
                                            onClickListener = null;
                                        }
                                        break;
                                    case -391032635:
                                    case 680098755:
                                        C1321.m4857(c2361M135310, iM31625 ^ i127);
                                        if (C2966.f9654 < 0) {
                                            onClickListener = new DialogInterface.OnClickListener() { // from class: l.ۢۖ᩻

                                                /* JADX INFO: renamed from: ۜܳ֫, reason: not valid java name and contains not printable characters */
                                                private static final short[] f31646 = {2599, -25640, 26810, -25558};

                                                @Override // android.content.DialogInterface.OnClickListener
                                                public final void onClick(DialogInterface dialogInterface2, int i133) {
                                                    int iM31630;
                                                    int i134;
                                                    int i135;
                                                    int iM31631;
                                                    int i136;
                                                    int i137;
                                                    ViewOnClickListenerC1057 viewOnClickListenerC1058 = null;
                                                    C6849 c6849 = null;
                                                    short[] sArr13 = null;
                                                    short s4 = 0;
                                                    short s5 = 0;
                                                    int i138 = 0;
                                                    int i139 = 0;
                                                    int i140 = 0;
                                                    int i141 = 751737976;
                                                    int i142 = C2419.f7754;
                                                    int i143 = C3448.f11240;
                                                    int iM27611 = (C0619.m2761("۠֫") + i143) * (-101);
                                                    int i144 = ((iM27611 ^ i142) * 9225) ^ 111396477;
                                                    int i145 = iM27611 ^ 1790242452;
                                                    while (true) {
                                                        C13511 c13512 = null;
                                                        while (true) {
                                                            i141 = ((((i141 ^ i142) * 3241) >> 31) & i144) ^ i145;
                                                            switch (i141) {
                                                                case -2033165205:
                                                                case 807841535:
                                                                    if (C3448.f11240 >= 0) {
                                                                        iM31630 = (C0773.m3169("ܺۛ") + i142) * 45;
                                                                        i134 = ((iM31630 ^ i143) * 21453) ^ 1960204449;
                                                                        i135 = 1114164171;
                                                                    } else {
                                                                        iM31630 = C0773.m3169("ۧۢ") ^ i142;
                                                                        i134 = ((iM31630 ^ i143) * (-25303)) ^ 10937766;
                                                                        i135 = -1980210180;
                                                                    }
                                                                    i145 = iM31630 ^ i135;
                                                                    i144 = i134;
                                                                    break;
                                                                case -1955202218:
                                                                case 1580367298:
                                                                    C3492.m11488();
                                                                    iM31631 = C0773.m3169("ۚܰ") ^ i142;
                                                                    i136 = ((iM31631 ^ i143) * (-17253)) ^ (-1899506802);
                                                                    i137 = 339559604;
                                                                    i145 = iM31631 ^ i137;
                                                                    i144 = i136;
                                                                    break;
                                                                case -1887892473:
                                                                case -1468135384:
                                                                    int i146 = ViewOnClickListenerC1057.f3785;
                                                                    short[] sArr14 = f31646;
                                                                    if (C0773.m3161() == 0) {
                                                                        String strM8881 = C2702.m8881(sArr14, 1, 3, i140);
                                                                        if (C20932.f66974 > 0) {
                                                                            int iM27612 = C0619.m2761(strM8881) ^ 2128759009;
                                                                            if (C4282.f15546 > 0) {
                                                                                viewOnClickListenerC1058 = viewOnClickListenerC1057;
                                                                                c13512 = new C13511(viewOnClickListenerC1058, iM27612);
                                                                                if (C3448.f11240 < 0) {
                                                                                    iM31630 = C0619.m2761("ܺ۬") ^ i143;
                                                                                    i134 = ((iM31630 ^ i142) * 823) ^ (-1346247102);
                                                                                    i135 = -5741981;
                                                                                    i145 = iM31630 ^ i135;
                                                                                    i144 = i134;
                                                                                    break;
                                                                                }
                                                                            }
                                                                            iM31631 = (C0773.m3169("۬᩹") ^ i143) * (-71);
                                                                            i136 = ((iM31631 ^ i142) * 8371) ^ (-1136342956);
                                                                            i137 = -290083857;
                                                                            i145 = iM31631 ^ i137;
                                                                            i144 = i136;
                                                                        } else {
                                                                            iM31631 = C0773.m3169("ۚܰ") ^ i142;
                                                                            i136 = ((iM31631 ^ i143) * (-17253)) ^ (-1899506802);
                                                                            i137 = 339559604;
                                                                            i145 = iM31631 ^ i137;
                                                                            i144 = i136;
                                                                        }
                                                                    } else {
                                                                        iM31631 = C0619.m2761("۟ۡ") ^ i143;
                                                                        i136 = ((iM31631 ^ i142) * (-9969)) ^ (-1777498573);
                                                                        i137 = -548368273;
                                                                        i145 = iM31631 ^ i137;
                                                                        i144 = i136;
                                                                    }
                                                                    break;
                                                                case -1672847704:
                                                                case -1289222216:
                                                                    C3998.m12920();
                                                                    break;
                                                                case -1185540854:
                                                                case 924448555:
                                                                    if (C3033.f9831 >= 0) {
                                                                        iM31631 = C0773.m3169("ۚܰ") ^ i142;
                                                                        i136 = ((iM31631 ^ i143) * (-17253)) ^ (-1899506802);
                                                                        i137 = 339559604;
                                                                        i145 = iM31631 ^ i137;
                                                                        i144 = i136;
                                                                    }
                                                                    iM31630 = (C0773.m3169("ۜ۫") + i142) * 127;
                                                                    i134 = ((iM31630 ^ i143) * (-26961)) ^ 812175483;
                                                                    i135 = 950015025;
                                                                    i145 = iM31630 ^ i135;
                                                                    i144 = i134;
                                                                    break;
                                                                case -1084898128:
                                                                case -1084403452:
                                                                    if (C1826.f6190 <= 0) {
                                                                        iM31631 = C0619.m2761("۟ۡ") ^ i143;
                                                                        i136 = ((iM31631 ^ i142) * (-9969)) ^ (-1777498573);
                                                                        i137 = -548368273;
                                                                        i145 = iM31631 ^ i137;
                                                                        i144 = i136;
                                                                    }
                                                                    iM31630 = (C0773.m3169("ۜ۫") + i142) * 127;
                                                                    i134 = ((iM31630 ^ i143) * (-26961)) ^ 812175483;
                                                                    i135 = 950015025;
                                                                    i145 = iM31630 ^ i135;
                                                                    i144 = i134;
                                                                    break;
                                                                case -795927725:
                                                                case 2099175036:
                                                                    C2419.m8174();
                                                                    if (C1542.f5343 > 0) {
                                                                        iM31630 = (C0773.m3169("ܺۛ") + i142) * 45;
                                                                        i134 = ((iM31630 ^ i143) * 21453) ^ 1960204449;
                                                                        i135 = 1114164171;
                                                                        i145 = iM31630 ^ i135;
                                                                        i144 = i134;
                                                                    } else {
                                                                        iM31631 = C0619.m2761("۟ۡ") ^ i143;
                                                                        i136 = ((iM31631 ^ i142) * (-9969)) ^ (-1777498573);
                                                                        i137 = -548368273;
                                                                        i145 = iM31631 ^ i137;
                                                                        i144 = i136;
                                                                    }
                                                                    break;
                                                                case 26181293:
                                                                case 810348676:
                                                                    sArr13 = f31646;
                                                                    if (!C1146.m4231()) {
                                                                        iM31631 = C0619.m2761("۟ۡ") ^ i143;
                                                                        i136 = ((iM31631 ^ i142) * (-9969)) ^ (-1777498573);
                                                                        i137 = -548368273;
                                                                        i145 = iM31631 ^ i137;
                                                                        i144 = i136;
                                                                    } else {
                                                                        iM31630 = (i143 - C0773.m3169("۟ۜ")) * (-125);
                                                                        i134 = ((iM31630 ^ i142) * 30497) ^ (-2062559883);
                                                                        i135 = -1298432955;
                                                                        i145 = iM31630 ^ i135;
                                                                        i144 = i134;
                                                                    }
                                                                    break;
                                                                case 280708650:
                                                                case 333587257:
                                                                    i140 = 13288;
                                                                    iM31630 = C0773.m3169("᩶۫") ^ i142;
                                                                    i134 = ((iM31630 ^ i143) * 3785) ^ (-822713458);
                                                                    i135 = 118355640;
                                                                    i145 = iM31630 ^ i135;
                                                                    i144 = i134;
                                                                    break;
                                                                case 631896342:
                                                                case 1971001053:
                                                                    i140 = 58450;
                                                                    iM31630 = C0773.m3169("᩶۫") ^ i142;
                                                                    i134 = ((iM31630 ^ i143) * 3785) ^ (-822713458);
                                                                    i135 = 118355640;
                                                                    i145 = iM31630 ^ i135;
                                                                    i144 = i134;
                                                                    break;
                                                                case 653345182:
                                                                case 869906842:
                                                                    s4 = sArr13[0];
                                                                    s5 = 1;
                                                                    if (C0487.f2131 <= 0) {
                                                                        iM31630 = (C0773.m3169("ۜ۫") + i142) * 127;
                                                                        i134 = ((iM31630 ^ i143) * (-26961)) ^ 812175483;
                                                                        i135 = 950015025;
                                                                    } else {
                                                                        iM31630 = C0619.m2761("ܿ۠") ^ i143;
                                                                        i134 = ((iM31630 ^ i142) * 14315) ^ (-977453013);
                                                                        i135 = -1518759035;
                                                                    }
                                                                    i145 = iM31630 ^ i135;
                                                                    i144 = i134;
                                                                    break;
                                                                case 1102692484:
                                                                case 1384982410:
                                                                    ReentrantLock reentrantLock = C11650.f37690;
                                                                    if (RunnableC3055.f9898 < 0) {
                                                                        C2966.m9674(new Thread(new RunnableC1014(0, viewOnClickListenerC1058, c6849)));
                                                                    }
                                                                    iM31631 = (C0773.m3169("۬᩹") ^ i143) * (-71);
                                                                    i136 = ((iM31631 ^ i142) * 8371) ^ (-1136342956);
                                                                    i137 = -290083857;
                                                                    i145 = iM31631 ^ i137;
                                                                    i144 = i136;
                                                                    break;
                                                                case 1144958790:
                                                                case 1295042722:
                                                                    int i147 = s4 + s5;
                                                                    i138 = i147 * i147;
                                                                    i139 = s4 * 2;
                                                                    if (C1564.m5509() > 0) {
                                                                        iM31630 = (C0773.m3169("᩺ܳ") ^ i142) * (-111);
                                                                        i134 = ((iM31630 ^ i143) * (-28031)) ^ 1337054953;
                                                                        i135 = -1219471475;
                                                                        i145 = iM31630 ^ i135;
                                                                        i144 = i134;
                                                                    } else {
                                                                        iM31631 = C0773.m3169("ۚܰ") ^ i142;
                                                                        i136 = ((iM31631 ^ i143) * (-17253)) ^ (-1899506802);
                                                                        i137 = 339559604;
                                                                        i145 = iM31631 ^ i137;
                                                                        i144 = i136;
                                                                    }
                                                                    break;
                                                                case 1216419906:
                                                                case 1645690798:
                                                                    if ((i139 + 1) - i138 <= 0) {
                                                                        iM31630 = (C0773.m3169("ܺۤ") ^ i143) * 15;
                                                                        i134 = ((iM31630 ^ i142) * 6899) ^ 275726801;
                                                                        i135 = -382247767;
                                                                    } else {
                                                                        iM31630 = C0773.m3169("۟ۚ") ^ i142;
                                                                        i134 = ((iM31630 ^ i143) * 30953) ^ (-200221732);
                                                                        i135 = -1684719256;
                                                                    }
                                                                    i145 = iM31630 ^ i135;
                                                                    i144 = i134;
                                                                    break;
                                                                default:
                                                                    C1343.m4951(c13512);
                                                                    c6849 = new C6849(c13512, viewOnClickListenerC1058);
                                                                    if (C2702.f8586 > 0) {
                                                                        int iM31632 = C0773.m3169("ۖ֨") ^ i143;
                                                                        i144 = ((iM31632 ^ i142) * (-30305)) ^ (-1151277300);
                                                                        i145 = iM31632 ^ (-1443846736);
                                                                    } else {
                                                                        iM31631 = C0619.m2761("۟ۡ") ^ i143;
                                                                        i136 = ((iM31631 ^ i142) * (-9969)) ^ (-1777498573);
                                                                        i137 = -548368273;
                                                                        i145 = iM31631 ^ i137;
                                                                        i144 = i136;
                                                                    }
                                                                    break;
                                                            }
                                                            return;
                                                        }
                                                    }
                                                }
                                            };
                                            strM6233 = C1783.m6233(f56783, 10, 3, i128);
                                            if (C2485.m8357() > 0) {
                                                iM31622 = C0773.m3169("ܺۛ") ^ i124;
                                                i121 = ((iM31622 ^ i123) * (-1953)) ^ 1628183037;
                                                i122 = -395395110;
                                                i126 = iM31622 ^ i122;
                                                i125 = i121;
                                                break;
                                            }
                                        }
                                        int iM316210 = C0773.m3169("֨۠") ^ i124;
                                        i126 = iM316210 ^ (-543902772);
                                        i125 = ((iM316210 ^ i123) * 435) ^ (-450662834);
                                        onClickListener = null;
                                        break;
                                    case -355706421:
                                    case 1152716197:
                                        iM31625 = C0773.m3169(AbstractC3624.m11769(sArr12, 7, 3, i128));
                                        i127 = 2119670256;
                                        if (C3448.m11248() == 0) {
                                            iM31622 = C0773.m3169("ܽ᩶") ^ i123;
                                            i121 = ((iM31622 ^ i124) * (-15749)) ^ (-1194280811);
                                            i122 = 308990604;
                                            i126 = iM31622 ^ i122;
                                            i125 = i121;
                                        } else {
                                            iM31621 = C0773.m3169("ۗۨ") ^ i123;
                                            i119 = ((iM31621 ^ i124) * 7509) ^ 1221685119;
                                            i120 = 446581352;
                                            int i133 = iM31621 ^ i120;
                                            c2361M135310 = c2361M135310;
                                            DialogInterface.OnClickListener onClickListener4 = onClickListener;
                                            i126 = i133;
                                            i125 = i119;
                                            onClickListener = onClickListener4;
                                        }
                                        break;
                                    case -34256809:
                                    case 423531901:
                                        onClickListener = onClickListener;
                                        c2361M135310 = c2361M135310;
                                        sArr11 = f56783;
                                        if (C3033.f9831 >= 0) {
                                            iM2769 = (C0619.m2761("᩻᩶") + i123) * 71;
                                            i117 = ((iM2769 ^ i124) * (-17017)) ^ (-552401989);
                                            i118 = 1420031195;
                                        } else {
                                            iM2769 = (C0619.m2761("᩵ۢ") + i124) * (-107);
                                            i117 = ((iM2769 ^ i123) * (-19085)) ^ (-507378789);
                                            i118 = 1300621389;
                                        }
                                        onClickListener = onClickListener;
                                        i126 = iM2769 ^ i118;
                                        i125 = i117;
                                        c2361M135310 = c2361M135310;
                                        break;
                                    case 22332428:
                                    case 272480768:
                                        C0619.m2763();
                                        if (RunnableC0334.f1808 > 0) {
                                            iM31621 = C0773.m3169("ۗۨ") ^ i123;
                                            i119 = ((iM31621 ^ i124) * 7509) ^ 1221685119;
                                            i120 = 446581352;
                                            int i134 = iM31621 ^ i120;
                                            c2361M135310 = c2361M135310;
                                            DialogInterface.OnClickListener onClickListener5 = onClickListener;
                                            i126 = i134;
                                            i125 = i119;
                                            onClickListener = onClickListener5;
                                        } else {
                                            iM31622 = (C0773.m3169("ۖ۠") ^ i124) * (-37);
                                            i121 = ((iM31622 ^ i123) * (-26973)) ^ (-397986396);
                                            i122 = -1099328455;
                                            i126 = iM31622 ^ i122;
                                            i125 = i121;
                                        }
                                        break;
                                    case 44152867:
                                    case 565193353:
                                        C2485.m8345(c2361M135310, 2101714873 ^ iM31624);
                                        sArr12 = f56783;
                                        if (C3099.f10023 > 0) {
                                            iM31622 = (i124 - C0619.m2761("ܿ᩹")) * 89;
                                            i121 = ((iM31622 ^ i123) * (-11915)) ^ 1504027788;
                                            i122 = 1582142791;
                                            i126 = iM31622 ^ i122;
                                            i125 = i121;
                                        } else {
                                            iM31621 = C0773.m3169("ۗۨ") ^ i123;
                                            i119 = ((iM31621 ^ i124) * 7509) ^ 1221685119;
                                            i120 = 446581352;
                                            int i135 = iM31621 ^ i120;
                                            c2361M135310 = c2361M135310;
                                            DialogInterface.OnClickListener onClickListener6 = onClickListener;
                                            i126 = i135;
                                            i125 = i119;
                                            onClickListener = onClickListener6;
                                        }
                                        break;
                                    case 898132329:
                                    case 1555512799:
                                        i128 = 54832;
                                        iM2769 = (C0619.m2761("ۨ᩻") + i124) * 19;
                                        i117 = ((iM2769 ^ i123) * 27737) ^ 256550144;
                                        i118 = 1839353566;
                                        onClickListener = onClickListener;
                                        i126 = iM2769 ^ i118;
                                        i125 = i117;
                                        c2361M135310 = c2361M135310;
                                        break;
                                    default:
                                        onClickListener = onClickListener;
                                        c2361M135310 = c2361M135310;
                                        int i136 = s2 + s3;
                                        if ((i136 * i136) - ((s2 * 2) + 1) < 0) {
                                            iM2769 = (i123 - C0619.m2761("ۧۨ")) * (-19);
                                            i117 = ((iM2769 ^ i124) * 21219) ^ 1929954515;
                                            i118 = -1799792136;
                                        } else {
                                            iM2769 = C0619.m2761("᩸۫") ^ i124;
                                            i117 = ((iM2769 ^ i123) * 24839) ^ (-110532304);
                                            i118 = -884082749;
                                        }
                                        onClickListener = onClickListener;
                                        i126 = iM2769 ^ i118;
                                        i125 = i117;
                                        c2361M135310 = c2361M135310;
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    C3099.m10090(c2361M3795);
                    break;
                case -1385412170:
                case 835241337:
                    int i116 = i89;
                    C2361 c2361M3796 = C0950.m3794(this);
                    Object[] objArr = new Object[i116];
                    objArr[i90] = C3779.m12271(this, C0773.m3169(C3033.m9847(f3786, 542, 3, i92)) ^ 2122552328);
                    String strM33142 = C13473.m33142(this, i87, objArr);
                    C0269.m1781(strM33142, strM5510);
                    CharSequence[] charSequenceArr3 = new CharSequence[i116];
                    charSequenceArr3[i90] = strM33142;
                    c2361M3796.m8014(charSequenceArr3, new DialogInterface.OnClickListener() { // from class: l.᩷۠᩻

                        /* JADX INFO: renamed from: ۖ֫ۤ, reason: not valid java name and contains not printable characters */
                        private static final short[] f70815 = {3183, 19081, -24573, -24188};

                        /* JADX WARN: Code duplicated, block: B:38:0x00d5 A[PHI: r10 r15
                          0x00d5: PHI (r10v14 l.۬֨ᩴ) = (r10v7 l.۬֨ᩴ), (r10v4 l.۬֨ᩴ) binds: [B:37:0x00d3, B:9:0x003f] A[DONT_GENERATE, DONT_INLINE]
                          0x00d5: PHI (r15v6 l.֨۠᩻) = (r15v4 l.֨۠᩻), (r15v3 l.֨۠᩻) binds: [B:37:0x00d3, B:9:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:61:0x01b8 A[PHI: r2 r3
                          0x01b8: PHI (r2v5 short) = (r2v2 short), (r2v4 short), (r2v2 short), (r2v2 short), (r2v2 short) binds: [B:60:0x01b6, B:52:0x016a, B:48:0x014e, B:12:0x0045, B:9:0x003f] A[DONT_GENERATE, DONT_INLINE]
                          0x01b8: PHI (r3v5 int) = (r3v2 int), (r3v2 int), (r3v4 int), (r3v2 int), (r3v2 int) binds: [B:60:0x01b6, B:52:0x016a, B:48:0x014e, B:12:0x0045, B:9:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i117) {
                            int iM2769;
                            int i118;
                            ViewOnClickListenerC1057 viewOnClickListenerC1057 = null;
                            Runnable runnable = null;
                            short[] sArr11 = null;
                            short s2 = 0;
                            int i119 = 0;
                            int i120 = 0;
                            int i121 = 409243557;
                            int i122 = C2702.f8586;
                            int i123 = C2288.f7433;
                            int iM27610 = (C0619.m2761("۟ᩳ") + i122) * (-3);
                            int i124 = ((iM27610 ^ i123) * 303) ^ (-709512120);
                            int i125 = -589405056;
                            while (true) {
                                int i126 = iM27610 ^ i125;
                                C13511 c13511 = null;
                                while (true) {
                                    i121 = ((((i121 ^ i123) * 17053) >> 31) & i124) ^ i126;
                                    switch (i121) {
                                        case -2129961071:
                                        case 937537815:
                                            if ((s2 * 17010) - i119 <= 0) {
                                                iM2769 = (C0619.m2761("ۖ֫") + i122) * (-43);
                                                i124 = ((iM2769 ^ i123) * (-5561)) ^ 1863104787;
                                                i118 = 1079516377;
                                            } else {
                                                iM2769 = C0773.m3169("ۨ۠") ^ i123;
                                                i124 = ((iM2769 ^ i122) * 14773) ^ 1894971561;
                                                i118 = -1907069787;
                                            }
                                            i126 = iM2769 ^ i118;
                                            break;
                                        case -1960203246:
                                        case 2092629154:
                                            C0269.m1775();
                                            if (C1321.f4751 >= 0) {
                                                iM2769 = C0619.m2761("֡᩶") ^ i122;
                                                i124 = ((iM2769 ^ i123) * (-13485)) ^ (-893685640);
                                                i118 = -964814409;
                                            } else {
                                                iM2769 = C0619.m2761("۬۟") ^ i122;
                                                i124 = ((iM2769 ^ i123) * (-1737)) ^ 1575733510;
                                                i118 = -1410185152;
                                            }
                                            i126 = iM2769 ^ i118;
                                            break;
                                        case -1911539970:
                                        case 123813114:
                                            if (C3448.f11240 < 0) {
                                                iM27610 = (i123 - C0773.m3169("֡᩻")) * (-85);
                                                i124 = ((iM27610 ^ i122) * (-23679)) ^ 1918552026;
                                                i125 = 1012853763;
                                            } else {
                                                iM27610 = (C0619.m2761("ۗ۬") + i123) * (-77);
                                                i124 = ((iM27610 ^ i122) * (-6793)) ^ 1502517457;
                                                i125 = 205568471;
                                            }
                                            break;
                                        case -1882457480:
                                        case -347590480:
                                            int i127 = ViewOnClickListenerC1057.f3785;
                                            short[] sArr12 = f70815;
                                            if (C1542.f5343 > 0) {
                                                if (AbstractC0116.f1064 <= 0) {
                                                    iM27610 = (i123 - C0773.m3169("֡᩻")) * (-85);
                                                    i124 = ((iM27610 ^ i122) * (-23679)) ^ 1918552026;
                                                    i125 = 1012853763;
                                                    break;
                                                } else {
                                                    int iM27611 = C0619.m2761(C3779.m12266(sArr12, 1, 3, i120));
                                                    if (C1564.f5401 <= 0) {
                                                        iM27610 = (C0619.m2761("ۗ۬") + i123) * (-77);
                                                        i124 = ((iM27610 ^ i122) * (-6793)) ^ 1502517457;
                                                        i125 = 205568471;
                                                        break;
                                                    } else {
                                                        int i128 = iM27611 ^ 2102299593;
                                                        if (C2310.f7472 < 0) {
                                                            viewOnClickListenerC1057 = this.f70816;
                                                            c13511 = new C13511(viewOnClickListenerC1057, i128);
                                                            C1343.m4951(c13511);
                                                            if (C2287.m7745() <= 0) {
                                                                iM2769 = C0619.m2761("۬۟") ^ i122;
                                                                i124 = ((iM2769 ^ i123) * (-1737)) ^ 1575733510;
                                                                i118 = -1410185152;
                                                            } else {
                                                                iM2769 = C0619.m2761("ۜۤ") ^ i123;
                                                                i124 = ((iM2769 ^ i122) * 7739) ^ 1174184735;
                                                                i118 = 87097174;
                                                            }
                                                            i126 = iM2769 ^ i118;
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            iM27610 = (i123 - C0773.m3169("ۜۙ")) * (-37);
                                            i124 = ((iM27610 ^ i122) * 32179) ^ 100830244;
                                            i125 = -1225067518;
                                            break;
                                        case -1788699716:
                                        case 441564455:
                                            i120 = 55192;
                                            iM2769 = C0773.m3169("ۚ᩸") ^ i122;
                                            i124 = ((iM2769 ^ i123) * 9791) ^ 925856073;
                                            i118 = -1557775918;
                                            i126 = iM2769 ^ i118;
                                            break;
                                        case -1573584636:
                                        case -335112448:
                                            i120 = 6969;
                                            iM2769 = C0773.m3169("ۚ᩸") ^ i122;
                                            i124 = ((iM2769 ^ i123) * 9791) ^ 925856073;
                                            i118 = -1557775918;
                                            i126 = iM2769 ^ i118;
                                            break;
                                        case -1472732421:
                                        case -93446416:
                                            if (AbstractC0116.f1064 <= 0) {
                                                iM2769 = C0619.m2761("֡᩶") ^ i122;
                                                i124 = ((iM2769 ^ i123) * (-13485)) ^ (-893685640);
                                                i118 = -964814409;
                                            } else {
                                                iM2769 = C0619.m2761("ۨۧ") ^ i123;
                                                i124 = ((iM2769 ^ i122) * 13833) ^ 97100242;
                                                i118 = 1819055651;
                                            }
                                            i126 = iM2769 ^ i118;
                                            break;
                                        case -1233868650:
                                        case 1632171137:
                                            C1321.m4852();
                                            C2354.m7983();
                                            break;
                                        case -828757616:
                                        case 1755848207:
                                            s2 = sArr11[0];
                                            if (C2419.f7754 >= 0) {
                                                iM2769 = C0619.m2761("֡᩶") ^ i122;
                                                i124 = ((iM2769 ^ i123) * (-13485)) ^ (-893685640);
                                                i118 = -964814409;
                                            } else {
                                                iM2769 = (C0619.m2761("ܿ֫") + i123) * 123;
                                                i124 = ((iM2769 ^ i122) * (-8141)) ^ (-559513495);
                                                i118 = -323388511;
                                            }
                                            i126 = iM2769 ^ i118;
                                            break;
                                        case -798169129:
                                        case -476286321:
                                            if (C0487.f2131 > 0) {
                                                iM27610 = (i123 - C0773.m3169("֡᩻")) * (-85);
                                                i124 = ((iM27610 ^ i122) * (-23679)) ^ 1918552026;
                                                i125 = 1012853763;
                                            }
                                            iM2769 = C0619.m2761("֡᩶") ^ i122;
                                            i124 = ((iM2769 ^ i123) * (-13485)) ^ (-893685640);
                                            i118 = -964814409;
                                            i126 = iM2769 ^ i118;
                                            break;
                                        case -782308462:
                                        case 881367686:
                                            i119 = (s2 * s2) + 72335025;
                                            if (RunnableC3055.f9898 >= 0) {
                                                iM2769 = C0619.m2761("֡᩶") ^ i122;
                                                i124 = ((iM2769 ^ i123) * (-13485)) ^ (-893685640);
                                                i118 = -964814409;
                                            } else {
                                                iM2769 = C0619.m2761("᩺ܳ") ^ i122;
                                                i124 = ((iM2769 ^ i123) * 14507) ^ (-2126309490);
                                                i118 = 2139909458;
                                            }
                                            i126 = iM2769 ^ i118;
                                            break;
                                        case -443662417:
                                        case 1734476675:
                                            runnable = null;
                                            if (C1826.f6190 > 0) {
                                                iM2769 = C0619.m2761("۠֡") ^ i122;
                                                i124 = ((iM2769 ^ i123) * (-30799)) ^ 1231041510;
                                                i118 = 1916772561;
                                                i126 = iM2769 ^ i118;
                                            } else {
                                                iM27610 = (i123 - C0773.m3169("ۜۙ")) * (-37);
                                                i124 = ((iM27610 ^ i122) * 32179) ^ 100830244;
                                                i125 = -1225067518;
                                            }
                                            break;
                                        case 189929189:
                                        case 1722107170:
                                            C0619.m2763();
                                            iM27610 = (C0619.m2761("ۗ۬") + i123) * (-77);
                                            i124 = ((iM27610 ^ i122) * (-6793)) ^ 1502517457;
                                            i125 = 205568471;
                                            break;
                                        case 238972289:
                                        case 570203485:
                                            sArr11 = f70815;
                                            if (C2354.f7599 < 0) {
                                                iM2769 = (C0773.m3169("ۚܶ") ^ i122) * 97;
                                                i124 = ((iM2769 ^ i123) * (-5817)) ^ 2036991796;
                                                i118 = 426563119;
                                                i126 = iM2769 ^ i118;
                                            } else {
                                                iM27610 = (i123 - C0773.m3169("֡᩻")) * (-85);
                                                i124 = ((iM27610 ^ i122) * (-23679)) ^ 1918552026;
                                                i125 = 1012853763;
                                            }
                                            break;
                                        default:
                                            c13511.m33188(runnable);
                                            C7791.m21182(new C4040(c13511, viewOnClickListenerC1057), viewOnClickListenerC1057);
                                            break;
                                    }
                                    return;
                                }
                            }
                        }
                    });
                    C1321.m4860(c2361M3796);
                    break;
                case -1368204064:
                case 11087797:
                    c2361M13539 = c2361M13539;
                    str9 = str9;
                    i93 = i93;
                    editText7 = editText7;
                    view9 = view9;
                    EditText editText9 = editText8;
                    i89 = i89;
                    i91 = i91;
                    sArr7 = sArr7;
                    i81 = i81;
                    iM9671 = iM9671;
                    int i117 = length;
                    strM5510 = strM5510;
                    view10 = view10;
                    textInputLayout2 = textInputLayout2;
                    i84 = i84;
                    view8 = view8;
                    i86 = i86;
                    iM31616 = iM31616;
                    i87 = i87;
                    spannableString7 = spannableString7;
                    int iM2769 = C0619.m2761(C0619.m2756(f3786, Scalar448.TARGET_LENGTH, 3, i92)) ^ 2101209192;
                    iM31615 = C0773.m3169(C2375.m8069(f3786, Ed448.PRECOMP_RANGE, 3, i92)) ^ 2124942568;
                    strM10047 = C3077.m10047(f3786, 453, 17, i92);
                    i83 = i83;
                    if (i80 == i83) {
                        int iM31621 = (i77 - C0773.m3169("۫ܺ")) * (-73);
                        i78 = ((iM31621 ^ i76) * (-19771)) ^ 521622673;
                        i85 = iM2769;
                        i79 = iM31621 ^ 1540210077;
                    } else {
                        int iM27610 = (i77 - C0619.m2761("ۨ۫")) * 7;
                        i85 = iM2769;
                        i79 = iM27610 ^ (-343893053);
                        i78 = ((iM27610 ^ i76) * 14505) ^ 82302098;
                    }
                    length = i117;
                    editText8 = editText9;
                    i90 = 0;
                    break;
                case -1359710921:
                case 296946555:
                    i3 = i93;
                    spannableString7.setSpan(new AbsoluteSizeSpan(i93), iM9671 - 3, iM9671, 17);
                    iM3169 = (C0619.m2761("ᩳ֡") ^ i77) * (-97);
                    i = ((iM3169 ^ i76) * (-19003)) ^ 1084691528;
                    i4 = -1048485785;
                    int i918 = iM3169 ^ i4;
                    i93 = i3;
                    i79 = i918;
                    i78 = i;
                    break;
                case -1324705687:
                case -676369892:
                    C2361 c2361M135310 = C4238.m13539(this);
                    int i118 = i89;
                    Object[] objArr2 = new Object[i118];
                    objArr2[i90] = C1783.m6246(this, C0773.m3169(RunnableC1848.m6366(f3786, 560, 3, i92)) ^ 2120770856);
                    String strM8354 = C2485.m8354(this, i87, objArr2);
                    C2310.m7811(strM8354, strM5510);
                    CharSequence[] charSequenceArr4 = new CharSequence[i118];
                    charSequenceArr4[i90] = strM8354;
                    c2361M135310.m8014(charSequenceArr4, new DialogInterface.OnClickListener() { // from class: l.᩹۠᩻

                        /* JADX INFO: renamed from: ֡֫᩻, reason: not valid java name and contains not printable characters */
                        private static final short[] f75858 = {3350, 7911, 4910, -7710};

                        /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
                        
                            if (l.C3998.f13671 == 0) goto L18;
                         */
                        @Override // android.content.DialogInterface.OnClickListener
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void onClick(android.content.DialogInterface r18, int r19) {
                            /*
                                Method dump skipped, instruction units count: 656
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: l.DialogInterfaceOnClickListenerC23432.onClick(android.content.DialogInterface, int):void");
                        }
                    });
                    C1321.m4860(c2361M135310);
                    break;
                case -1179476399:
                case 122273237:
                    c2361M13539 = c2361M13539;
                    i7 = i93;
                    view2 = view8;
                    i8 = i89;
                    i9 = i90;
                    i10 = i91;
                    i11 = i81;
                    i12 = iM9671;
                    editText = editText8;
                    i13 = length;
                    str = strM10047;
                    view3 = view9;
                    i14 = i86;
                    i15 = iM31616;
                    i16 = i87;
                    spannableString = spannableString7;
                    short[] sArr11 = sArr7;
                    strM5510 = strM5510;
                    textInputLayout2 = textInputLayout2;
                    i85 = i85;
                    str9 = str9;
                    editText7 = editText7;
                    view10 = view10;
                    iM31615 = iM31615;
                    sArr = sArr11;
                    i83 = iM2768 ^ 2103293951;
                    iM2763 = C0619.m2761(C1542.m5471(f3786, 444, 3, i92)) ^ 2099591843;
                    if (C1080.f3865 >= 0) {
                        iM2764 = C0619.m2761("ܶ۟") ^ i76;
                        i17 = ((iM2764 ^ i77) * (-2507)) ^ 568158182;
                        i18 = -1913622390;
                    } else {
                        iM2764 = C0619.m2761("᩵۫") ^ i76;
                        i17 = ((iM2764 ^ i77) * (-17917)) ^ 476429804;
                        i18 = 962228698;
                    }
                    int i119 = iM2764 ^ i18;
                    view8 = view2;
                    iM9671 = i12;
                    i84 = iM2763;
                    i78 = i17;
                    i91 = i10;
                    i81 = i11;
                    i89 = i8;
                    i93 = i7;
                    i79 = i119;
                    spannableString7 = spannableString;
                    i87 = i16;
                    iM31616 = i15;
                    i86 = i14;
                    view9 = view3;
                    strM10047 = str;
                    length = i13;
                    editText8 = editText;
                    i90 = i9;
                    c2361M13539 = c2361M13539;
                    int i919 = i85;
                    textInputLayout2 = textInputLayout2;
                    strM5510 = strM5510;
                    sArr7 = sArr;
                    iM31615 = iM31615;
                    view10 = view10;
                    editText7 = editText7;
                    str9 = str9;
                    i85 = i919;
                    break;
                case -1153583366:
                case 1937732210:
                    RunnableC1848.m6360();
                    iM2761 = (C0619.m2761("ۢۖ") + i76) * (-39);
                    i = ((iM2761 ^ i77) * 13951) ^ (-1453496995);
                    i2 = -373923125;
                    i79 = iM2761 ^ i2;
                    i78 = i;
                    break;
                case -971072322:
                case 1774807613:
                    c2362 = c2361M13539;
                    i36 = i93;
                    iM31615 = iM31615;
                    i37 = i89;
                    i90 = i90;
                    i38 = i91;
                    sArr4 = sArr7;
                    i39 = i81;
                    i40 = iM9671;
                    str5 = strM5510;
                    editText3 = editText8;
                    i41 = length;
                    str6 = strM10047;
                    view6 = view9;
                    int i120 = i86;
                    int i121 = iM31616;
                    int i122 = i87;
                    spannableString3 = spannableString7;
                    View viewM9942 = RunnableC3055.m9942(this, C0773.m3169(C2354.m7980(f3786, 482, 3, i92)) ^ 2121881535);
                    i85 = i85;
                    View viewM9334 = C2834.m9333(viewM9942, i85);
                    C0269.m1781(viewM9334, str6);
                    textInputLayout3 = (TextInputLayout) viewM9334;
                    i84 = i84;
                    viewM9333 = C2834.m9333(viewM9942, i84);
                    if (C0862.f3233 != 0) {
                        view8 = viewM9942;
                        i42 = i122;
                        iM31616 = i121;
                        i86 = i120;
                        int iM27611 = (i77 - C0619.m2761("᩵᩺")) * 119;
                        int i123 = i42;
                        int i124 = ((iM27611 ^ i76) * 30861) ^ 164891345;
                        i85 = i85;
                        view9 = view6;
                        i81 = i39;
                        strM10047 = str6;
                        i89 = i37;
                        length = i41;
                        editText8 = editText3;
                        i93 = i36;
                        i90 = i90;
                        i79 = iM27611 ^ (-781155828);
                        c2361M13539 = c2362;
                        strM5510 = str5;
                        sArr7 = sArr4;
                        iM31615 = iM31615;
                        i78 = i124;
                        spannableString7 = spannableString3;
                        i87 = i123;
                        i84 = i84;
                        iM9671 = i40;
                        i91 = i38;
                    } else {
                        int iM27612 = (C0619.m2761("ۡ۟") ^ i76) * (-79);
                        int i125 = ((iM27612 ^ i77) * 7791) ^ (-724126727);
                        i85 = i85;
                        view8 = viewM9942;
                        i81 = i39;
                        i84 = i84;
                        i89 = i37;
                        i93 = i36;
                        iM9671 = i40;
                        i79 = iM27612 ^ 1469975754;
                        i91 = i38;
                        strM5510 = str5;
                        sArr7 = sArr4;
                        iM31615 = iM31615;
                        i78 = i125;
                        spannableString7 = spannableString3;
                        i87 = i122;
                        iM31616 = i121;
                        i86 = i120;
                        view9 = view6;
                        strM10047 = str6;
                        length = i41;
                        editText8 = editText3;
                        i90 = i90;
                        c2361M13539 = c2362;
                    }
                    break;
                case -961565078:
                case 1304234239:
                    c2361 = c2361M13539;
                    i21 = i93;
                    i22 = iM31615;
                    i23 = i89;
                    i24 = i90;
                    i25 = i91;
                    sArr2 = sArr7;
                    i26 = i81;
                    i27 = iM9671;
                    str2 = strM5510;
                    i28 = i84;
                    i29 = i85;
                    view4 = view8;
                    editText2 = editText8;
                    i30 = length;
                    str3 = str9;
                    str4 = strM10047;
                    view5 = view9;
                    i31 = i86;
                    i32 = iM31616;
                    i33 = i87;
                    spannableString2 = spannableString7;
                    if (i80 == (C0619.m2761(C2702.m8881(f3786, 476, 3, i92)) ^ 2126090725)) {
                        iM31611 = (C0619.m2761("֫ܽ") ^ i76) * (-109);
                        i34 = ((iM31611 ^ i77) * (-10273)) ^ 584951118;
                        i35 = 1690148292;
                    } else {
                        iM31611 = (C0773.m3169("ܺۜ") ^ i77) * (-81);
                        i34 = ((iM31611 ^ i76) * 25371) ^ 1384917069;
                        i35 = -2135785678;
                    }
                    int i1010 = iM31611 ^ i35;
                    view8 = view4;
                    str9 = str3;
                    i85 = i29;
                    i84 = i28;
                    i81 = i26;
                    iM9671 = i27;
                    i91 = i25;
                    i89 = i23;
                    i93 = i21;
                    i79 = i1010;
                    spannableString7 = spannableString2;
                    i87 = i33;
                    iM31616 = i32;
                    i86 = i31;
                    view9 = view5;
                    strM10047 = str4;
                    length = i30;
                    editText8 = editText2;
                    i90 = i24;
                    c2361M13539 = c2361;
                    sArr3 = sArr2;
                    iM31615 = i22;
                    i78 = i34;
                    strM5510 = str2;
                    sArr7 = sArr3;
                    break;
                case -958703393:
                case 875249935:
                    i3 = i93;
                    C3448.m11245(new C18210(this));
                    iM3169 = (C0773.m3169("ۘܺ") + i76) * 31;
                    i = ((iM3169 ^ i77) * 31145) ^ 512000258;
                    i4 = 2046789436;
                    int i9110 = iM3169 ^ i4;
                    i93 = i3;
                    i79 = i9110;
                    i78 = i;
                    break;
                case -909125047:
                case 60203597:
                    c2361M13539 = c2361M13539;
                    int i126 = i93;
                    int i127 = i89;
                    i9 = i90;
                    int i128 = i91;
                    int i129 = i81;
                    int i130 = iM9671;
                    int i131 = i84;
                    int i132 = i85;
                    View view11 = view8;
                    editText = editText8;
                    i13 = length;
                    str9 = str9;
                    editText7 = editText7;
                    str = strM10047;
                    view3 = view9;
                    i14 = i86;
                    i15 = iM31616;
                    i16 = i87;
                    spannableString = spannableString7;
                    View view12 = view10;
                    iM31615 = iM31615;
                    sArr = sArr7;
                    strM5510 = strM5510;
                    textInputLayout2 = textInputLayout2;
                    view10 = view12;
                    i85 = i132;
                    if (i80 == (C0773.m3169(C0862.m3500(f3786, FloatingActionButton.AUTO_MINI_LARGEST_SCREEN_WIDTH, 3, i92)) ^ 2128289489)) {
                        iM31610 = (C0773.m3169("᩸۠") + i76) * 119;
                        i19 = ((iM31610 ^ i77) * (-19897)) ^ (-1895400787);
                        i20 = 921238553;
                    } else {
                        iM31610 = C0773.m3169("ܳۙ") ^ i77;
                        i19 = ((iM31610 ^ i76) * 7393) ^ 974678454;
                        i20 = 1059296848;
                    }
                    int i133 = iM31610 ^ i20;
                    view8 = view11;
                    i81 = i129;
                    i84 = i131;
                    i89 = i127;
                    i93 = i126;
                    iM9671 = i130;
                    i79 = i133;
                    i78 = i19;
                    i91 = i128;
                    spannableString7 = spannableString;
                    i87 = i16;
                    iM31616 = i15;
                    i86 = i14;
                    view9 = view3;
                    strM10047 = str;
                    length = i13;
                    editText8 = editText;
                    i90 = i9;
                    c2361M13539 = c2361M13539;
                    int i9111 = i85;
                    textInputLayout2 = textInputLayout2;
                    strM5510 = strM5510;
                    sArr7 = sArr;
                    iM31615 = iM31615;
                    view10 = view10;
                    editText7 = editText7;
                    str9 = str9;
                    i85 = i9111;
                    break;
                case -904336812:
                case 580090119:
                    i36 = i93;
                    int i134 = i87;
                    i37 = i89;
                    i38 = i91;
                    spannableString3 = spannableString7;
                    C2361 c2361M135311 = C4238.m13539(this);
                    i39 = i81;
                    i40 = iM9671;
                    c2362 = c2361M13539;
                    C13473.m33136(c2361M135311, C0619.m2761(C13473.m33137(f3786, 548, 3, i92)) ^ 2127526617);
                    C3099.m10082(c2361M135311, C0773.m3169(C4238.m13530(f3786, 551, 3, i92)) ^ 2123817843);
                    if (!C2023.f6737) {
                        C2419.m8168(c2361M135311, C0773.m3169(C23916.m53420(f3786, 554, 3, i92)) ^ 2120757362, new DialogInterface.OnClickListener() { // from class: l.ۗ۠᩻

                            /* JADX INFO: renamed from: ᩴۖܶ, reason: not valid java name and contains not printable characters */
                            private static final short[] f10720 = {1201, 28581, -29602, -28513};

                            /* JADX WARN: Code duplicated, block: B:50:0x0137 A[PHI: r3 r10 r14
                              0x0137: PHI (r3v5 int) = (r3v4 int), (r3v2 int) binds: [B:49:0x0135, B:38:0x00c9] A[DONT_GENERATE, DONT_INLINE]
                              0x0137: PHI (r10v5 l.۬֨ᩴ) = (r10v4 l.۬֨ᩴ), (r10v6 l.۬֨ᩴ) binds: [B:49:0x0135, B:38:0x00c9] A[DONT_GENERATE, DONT_INLINE]
                              0x0137: PHI (r14v4 l.֨۠᩻) = (r14v3 l.֨۠᩻), (r14v5 l.֨۠᩻) binds: [B:49:0x0135, B:38:0x00c9] A[DONT_GENERATE, DONT_INLINE]] */
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i135) {
                                int iM27613;
                                int i136;
                                ViewOnClickListenerC1057 viewOnClickListenerC1057 = null;
                                C24004 c24004 = null;
                                short[] sArr12 = null;
                                short s2 = 0;
                                int i137 = 0;
                                int i138 = 0;
                                int i139 = -298809711;
                                int i140 = AbstractC0641.f2496;
                                int i141 = C1519.f5300;
                                int iM27614 = C0619.m2761("ܳ᩺") ^ i141;
                                int i142 = ((iM27614 ^ i140) * 30109) ^ (-1498640591);
                                int i143 = -1329869315;
                                while (true) {
                                    int i144 = iM27614 ^ i143;
                                    C13511 c13511 = null;
                                    while (true) {
                                        i139 = ((((i139 ^ i140) * (-18713)) >> 31) & i142) ^ i144;
                                        switch (i139) {
                                            case -2082416545:
                                            case 512957197:
                                                if (C3033.f9831 >= 0) {
                                                    iM27614 = (C0773.m3169("ۘۘ") + i141) * 19;
                                                    i142 = ((iM27614 ^ i140) * (-7409)) ^ 798930334;
                                                    i143 = 534182025;
                                                }
                                                iM27613 = C0773.m3169("۟ۨ") ^ i140;
                                                i142 = ((iM27613 ^ i141) * (-1593)) ^ 828398618;
                                                i136 = -55881679;
                                                i144 = iM27613 ^ i136;
                                                break;
                                            case -1985868508:
                                            case -1011525077:
                                                C2023.m6964();
                                                if (C0862.f3233 != 0) {
                                                    iM27614 = C0773.m3169("ۡ֫") ^ i141;
                                                    i142 = ((iM27614 ^ i140) * (-17111)) ^ (-1386911015);
                                                    i143 = -912965381;
                                                }
                                                iM27613 = C0773.m3169("۟ۨ") ^ i140;
                                                i142 = ((iM27613 ^ i141) * (-1593)) ^ 828398618;
                                                i136 = -55881679;
                                                i144 = iM27613 ^ i136;
                                                break;
                                            case -1759422734:
                                            case -1726691456:
                                                C4282.m13648(c13511);
                                                c24004 = new C24004(c13511, viewOnClickListenerC1057);
                                                if (RunnableC0334.f1808 > 0) {
                                                    iM27613 = C0773.m3169("ۧۙ") ^ i140;
                                                    i142 = ((iM27613 ^ i141) * 20391) ^ (-466726719);
                                                    i136 = 896380013;
                                                    i144 = iM27613 ^ i136;
                                                } else {
                                                    iM27614 = (C0773.m3169("ۘۘ") + i141) * 19;
                                                    i142 = ((iM27614 ^ i140) * (-7409)) ^ 798930334;
                                                    i143 = 534182025;
                                                }
                                                break;
                                            case -1567034420:
                                            case 1987976746:
                                                C3998.m12920();
                                                iM27614 = C0773.m3169("ۡ֫") ^ i141;
                                                i142 = ((iM27614 ^ i140) * (-17111)) ^ (-1386911015);
                                                i143 = -912965381;
                                                break;
                                            case -1332903499:
                                            case -1078401715:
                                                ReentrantLock reentrantLock = C11650.f37690;
                                                if (AbstractC0641.m2813() > 0) {
                                                    C2966.m9674(new Thread(new RunnableC11478(2, viewOnClickListenerC1057, c24004)));
                                                }
                                                iM27614 = (C0773.m3169("᩵֡") ^ i140) * 15;
                                                i142 = ((iM27614 ^ i141) * (-30255)) ^ (-635601025);
                                                i143 = -1586180099;
                                                break;
                                            case -1183130533:
                                            case 932532860:
                                                i138 = 19264;
                                                iM27613 = C0773.m3169("ܰܶ") ^ i140;
                                                i142 = ((iM27613 ^ i141) * 10901) ^ (-597410200);
                                                i136 = 2134483307;
                                                i144 = iM27613 ^ i136;
                                                break;
                                            case -815009157:
                                            case 1766505442:
                                                if ((34086 * s2) - i137 > 0) {
                                                    iM27613 = (C0773.m3169("ۤܺ") + i140) * 127;
                                                    i142 = ((iM27613 ^ i141) * 19053) ^ (-1647387684);
                                                    i136 = -671636668;
                                                } else {
                                                    iM27613 = C0773.m3169("ܽܽ") ^ i141;
                                                    i142 = ((iM27613 ^ i140) * (-11689)) ^ (-130904968);
                                                    i136 = -38842293;
                                                }
                                                i144 = iM27613 ^ i136;
                                                break;
                                            case -530975065:
                                            case 584132564:
                                                i138 = 3750;
                                                iM27613 = C0773.m3169("ܰܶ") ^ i140;
                                                i142 = ((iM27613 ^ i141) * 10901) ^ (-597410200);
                                                i136 = 2134483307;
                                                i144 = iM27613 ^ i136;
                                                break;
                                            case -306244522:
                                            case 1875223653:
                                                if (C4282.f15546 > 0) {
                                                    iM27613 = (C0619.m2761("᩺᩶") + i140) * 127;
                                                    i142 = ((iM27613 ^ i141) * 14227) ^ (-1926777820);
                                                    i136 = -1256024666;
                                                    i144 = iM27613 ^ i136;
                                                } else {
                                                    iM27614 = C0773.m3169("ۡ֫") ^ i141;
                                                    i142 = ((iM27614 ^ i140) * (-17111)) ^ (-1386911015);
                                                    i143 = -912965381;
                                                }
                                                break;
                                            case -169028961:
                                            case 971116496:
                                                int i145 = ViewOnClickListenerC1057.f3785;
                                                short[] sArr13 = f10720;
                                                if (C1343.f4799 == 0) {
                                                    String strM3166 = C0773.m3166(sArr13, 1, 3, i138);
                                                    if (!RunnableC1848.f6235) {
                                                        int iM27615 = C0619.m2761(strM3166) ^ 2121181766;
                                                        if (C3734.m12152() < 0) {
                                                            viewOnClickListenerC1057 = this.f10721;
                                                            c13511 = new C13511(viewOnClickListenerC1057, iM27615);
                                                            if (C3077.f9998) {
                                                                iM27613 = (C0773.m3169("ۖۧ") ^ i141) * (-45);
                                                                i142 = ((iM27613 ^ i140) * 14689) ^ 1796119466;
                                                                i136 = 569213656;
                                                            } else {
                                                                iM27613 = (C0619.m2761("ܿۗ") ^ i141) * 49;
                                                                i142 = ((iM27613 ^ i140) * (-1167)) ^ (-1561893383);
                                                                i136 = -2066636977;
                                                            }
                                                            i144 = iM27613 ^ i136;
                                                        } else {
                                                            iM27614 = C0773.m3169("ۡ֫") ^ i141;
                                                            i142 = ((iM27614 ^ i140) * (-17111)) ^ (-1386911015);
                                                            i143 = -912965381;
                                                        }
                                                    } else {
                                                        iM27614 = (C0773.m3169("᩵֡") ^ i140) * 15;
                                                        i142 = ((iM27614 ^ i141) * (-30255)) ^ (-635601025);
                                                        i143 = -1586180099;
                                                    }
                                                } else {
                                                    iM27614 = (C0773.m3169("ۘۘ") + i141) * 19;
                                                    i142 = ((iM27614 ^ i140) * (-7409)) ^ 798930334;
                                                    i143 = 534182025;
                                                }
                                                break;
                                            case 221774378:
                                            case 1801068126:
                                                i137 = (s2 * s2) + 290463849;
                                                if (C3492.f12043 <= 0) {
                                                    iM27613 = (C0619.m2761("ܿۗ") ^ i141) * 49;
                                                    i142 = ((iM27613 ^ i140) * (-1167)) ^ (-1561893383);
                                                    i136 = -2066636977;
                                                } else {
                                                    iM27613 = (C0619.m2761("֫ۢ") + i140) * (-15);
                                                    i142 = ((iM27613 ^ i141) * (-18745)) ^ (-1742705805);
                                                    i136 = 303722882;
                                                }
                                                i144 = iM27613 ^ i136;
                                                break;
                                            case 455396020:
                                            case 1139100632:
                                                if (C2287.f7432 >= 0) {
                                                    iM27614 = (C0773.m3169("᩵֡") ^ i140) * 15;
                                                    i142 = ((iM27614 ^ i141) * (-30255)) ^ (-635601025);
                                                    i143 = -1586180099;
                                                }
                                                iM27613 = C0773.m3169("۟ۨ") ^ i140;
                                                i142 = ((iM27613 ^ i141) * (-1593)) ^ 828398618;
                                                i136 = -55881679;
                                                i144 = iM27613 ^ i136;
                                                break;
                                            case 513734215:
                                            case 1421550708:
                                                sArr12 = f10720;
                                                if (C2702.f8586 > 0) {
                                                    iM27613 = C0619.m2761("᩵ۧ") ^ i141;
                                                    i142 = ((iM27613 ^ i140) * (-12561)) ^ 1940015178;
                                                    i136 = -2084971816;
                                                    i144 = iM27613 ^ i136;
                                                } else {
                                                    iM27614 = (C0773.m3169("᩵֡") ^ i140) * 15;
                                                    i142 = ((iM27614 ^ i141) * (-30255)) ^ (-635601025);
                                                    i143 = -1586180099;
                                                }
                                                break;
                                            case 883760526:
                                            case 1556378101:
                                                s2 = sArr12[0];
                                                if (C20932.f66974 > 0) {
                                                    iM27613 = C0619.m2761("ܽ᩺") ^ i141;
                                                    i142 = ((iM27613 ^ i140) * 24389) ^ (-1923042524);
                                                    i136 = -1272679236;
                                                    i144 = iM27613 ^ i136;
                                                } else {
                                                    iM27614 = (C0773.m3169("ۘۘ") + i141) * 19;
                                                    i142 = ((iM27614 ^ i140) * (-7409)) ^ 798930334;
                                                    i143 = 534182025;
                                                }
                                                break;
                                            default:
                                                C0487.m2356();
                                                C2419.m8174();
                                                break;
                                        }
                                        return;
                                    }
                                }
                            }
                        });
                        RunnableC1848.m6359(c2361M135311, C0619.m2761(C3998.m12925(f3786, 557, 3, i92)) ^ 2101066429, str9);
                        C3099.m10090(c2361M135311);
                    } else {
                        i42 = i134;
                        sArr4 = sArr7;
                        str5 = strM5510;
                        editText3 = editText8;
                        i41 = length;
                        str6 = strM10047;
                        view6 = view9;
                        int iM27613 = (i77 - C0619.m2761("᩵᩺")) * 119;
                        int i1210 = i42;
                        int i1211 = ((iM27613 ^ i76) * 30861) ^ 164891345;
                        i85 = i85;
                        view9 = view6;
                        i81 = i39;
                        strM10047 = str6;
                        i89 = i37;
                        length = i41;
                        editText8 = editText3;
                        i93 = i36;
                        i90 = i90;
                        i79 = iM27613 ^ (-781155828);
                        c2361M13539 = c2362;
                        strM5510 = str5;
                        sArr7 = sArr4;
                        iM31615 = iM31615;
                        i78 = i1211;
                        spannableString7 = spannableString3;
                        i87 = i1210;
                        i84 = i84;
                        iM9671 = i40;
                        i91 = i38;
                    }
                    break;
                case -899854671:
                case -467362395:
                    C1146.m4231();
                    if (C1826.f6190 <= 0) {
                        iM2761 = (C0619.m2761("ۢۖ") + i76) * (-39);
                        i = ((iM2761 ^ i77) * 13951) ^ (-1453496995);
                        i2 = -373923125;
                    } else {
                        iM2761 = (i76 - C0773.m3169("ۗۨ")) * 75;
                        i = ((iM2761 ^ i77) * (-32245)) ^ (-1514636504);
                        i2 = 989571131;
                    }
                    i79 = iM2761 ^ i2;
                    i78 = i;
                    break;
                case -844684123:
                case 940788644:
                    c2365 = c2361M13539;
                    i67 = i93;
                    i68 = i87;
                    i69 = i89;
                    i70 = i91;
                    spannableString6 = spannableString7;
                    i71 = i81;
                    i72 = iM9671;
                    if (C18978.m44070().containsKey(C1080.m4056(f3786, 540, 2, i92))) {
                        iM31612 = C0619.m2761("ܰ᩻") ^ i77;
                        i73 = ((iM31612 ^ i76) * (-10061)) ^ 797740056;
                        i74 = -544764387;
                    } else {
                        iM31612 = (C0773.m3169("ܽܽ") ^ i76) * 95;
                        i73 = ((iM31612 ^ i77) * 15241) ^ 1051277488;
                        i74 = -1474970979;
                    }
                    int i1110 = iM31612 ^ i74;
                    iM9671 = i72;
                    c2361M13539 = c2365;
                    i91 = i70;
                    SpannableString spannableString11 = spannableString6;
                    i87 = i68;
                    i78 = i73;
                    i81 = i71;
                    i89 = i69;
                    i93 = i67;
                    i79 = i1110;
                    spannableString7 = spannableString11;
                    break;
                case -799894893:
                case 951986321:
                    final DialogInterfaceC8327 dialogInterfaceC8327M4860 = C1321.m4860(c2366);
                    C21576.m49090(editText8);
                    View view13 = view9;
                    final EditText editText10 = editText8;
                    C11235.m28299(C3448.m11246(view13, iM31615), new View.OnClickListener(this) { // from class: l.ۨۖ᩻

                        /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ ViewOnClickListenerC1057 f38870;

                        {
                            int i135 = 1638758828;
                            int i136 = C1564.f5401;
                            int i137 = C1146.f4234;
                            int iM27614 = C0619.m2761("ۛ᩶") ^ i136;
                            int i138 = ((iM27614 ^ i137) * 25551) ^ 725614170;
                            int i139 = -2032978660;
                            while (true) {
                                i135 = ((((i135 ^ i137) * (-29999)) >> 31) & i138) ^ (iM27614 ^ i139);
                                switch (i135) {
                                    case -2042280129:
                                    case -1709486966:
                                        if (C3998.f13671 != 0) {
                                            iM27614 = (i137 - C0773.m3169("᩺᩹")) * (-45);
                                            i138 = ((iM27614 ^ i136) * 12537) ^ 300749736;
                                            i139 = 1376783175;
                                        } else {
                                            iM27614 = C0619.m2761("ۚۜ") ^ i136;
                                            i138 = ((iM27614 ^ i137) * (-1557)) ^ (-332893272);
                                            i139 = -1937576414;
                                        }
                                        break;
                                    case -2019713002:
                                    case 1089537179:
                                        C2878.m9491();
                                        C3033.m9845();
                                        iM27614 = C0619.m2761("֫᩶") ^ i136;
                                        i138 = ((iM27614 ^ i137) * (-30867)) ^ (-1474743108);
                                        i139 = -1587583128;
                                        break;
                                    case -1755800360:
                                    case -62637484:
                                        this.f38870 = this;
                                        if (C0487.f2131 <= 0) {
                                            iM27614 = C0619.m2761("֫᩶") ^ i136;
                                            i138 = ((iM27614 ^ i137) * (-30867)) ^ (-1474743108);
                                            i139 = -1587583128;
                                        } else {
                                            iM27614 = (C0773.m3169("ܶ᩵") ^ i137) * (-17);
                                            i138 = ((iM27614 ^ i136) * 14245) ^ (-685008930);
                                            i139 = -1936504384;
                                        }
                                        break;
                                    case -1585712648:
                                    case 397861267:
                                        if (C2834.f9334 <= 0) {
                                            iM27614 = (C0619.m2761("᩻᩺") ^ i137) * (-29);
                                            i138 = ((iM27614 ^ i136) * (-31713)) ^ 1592457777;
                                            i139 = 1121783020;
                                        } else {
                                            iM27614 = C0773.m3169("ۙ᩵") ^ i136;
                                            i138 = ((iM27614 ^ i137) * 7749) ^ (-2082122444);
                                            i139 = -527678587;
                                        }
                                        break;
                                    case -1491114890:
                                    case 700363839:
                                        C3099.m10095();
                                        if (C4282.f15546 > 0) {
                                            iM27614 = (C0619.m2761("᩻᩺") ^ i137) * (-29);
                                            i138 = ((iM27614 ^ i136) * (-31713)) ^ 1592457777;
                                            i139 = 1121783020;
                                        } else {
                                            iM27614 = C0619.m2761("֫᩶") ^ i136;
                                            i138 = ((iM27614 ^ i137) * (-30867)) ^ (-1474743108);
                                            i139 = -1587583128;
                                        }
                                        break;
                                    case -1456509698:
                                    case 248398060:
                                        C1321.m4852();
                                        if (C4238.m13540() <= 0) {
                                            iM27614 = C0773.m3169("֡֫") ^ i136;
                                            i138 = ((iM27614 ^ i137) * (-20857)) ^ 672245653;
                                            i139 = -638735610;
                                        } else {
                                            iM27614 = C0619.m2761("֫᩶") ^ i136;
                                            i138 = ((iM27614 ^ i137) * (-30867)) ^ (-1474743108);
                                            i139 = -1587583128;
                                        }
                                        break;
                                    case -1037881122:
                                    case -607630096:
                                        C2702.m8876();
                                        throw new RuntimeException();
                                    case -993272009:
                                    case -203537408:
                                        if (C1542.f5343 <= 0) {
                                            iM27614 = (i137 - C0773.m3169("᩺᩹")) * (-45);
                                            i138 = ((iM27614 ^ i136) * 12537) ^ 300749736;
                                            i139 = 1376783175;
                                        } else {
                                            iM27614 = (C0773.m3169("ۗܿ") ^ i137) * 79;
                                            i138 = ((iM27614 ^ i136) * 26303) ^ 263051568;
                                            i139 = 1647755333;
                                        }
                                        break;
                                    case -881290765:
                                    case 1295550893:
                                        if (RunnableC1848.f6235) {
                                            iM27614 = C0773.m3169("֡֫") ^ i136;
                                            i138 = ((iM27614 ^ i137) * (-20857)) ^ 672245653;
                                            i139 = -638735610;
                                        } else {
                                            iM27614 = C0773.m3169("ܽۧ") ^ i136;
                                            i138 = ((iM27614 ^ i137) * 3163) ^ (-997746226);
                                            i139 = 217683765;
                                        }
                                        break;
                                    case -857792277:
                                    case -832811099:
                                        if (C0487.f2131 <= 0) {
                                            iM27614 = C0773.m3169("֡֫") ^ i136;
                                            i138 = ((iM27614 ^ i137) * (-20857)) ^ 672245653;
                                            i139 = -638735610;
                                        } else {
                                            iM27614 = C0619.m2761("᩸ᩴ") ^ i137;
                                            i138 = ((iM27614 ^ i136) * 18639) ^ 894852724;
                                            i139 = 1957810121;
                                        }
                                        break;
                                    case -764769156:
                                    case 391553759:
                                        if (RunnableC3055.f9898 >= 0) {
                                            iM27614 = C0773.m3169("֡֫") ^ i136;
                                            i138 = ((iM27614 ^ i137) * (-20857)) ^ 672245653;
                                            i139 = -638735610;
                                        } else {
                                            iM27614 = C0773.m3169("ᩳܺ") ^ i136;
                                            i138 = ((iM27614 ^ i137) * 25907) ^ 539228332;
                                            i139 = -1236534657;
                                        }
                                        break;
                                    case -567697046:
                                    case -166341421:
                                        if (C23916.m53419() != 0) {
                                            iM27614 = (i137 - C0773.m3169("᩺᩹")) * (-45);
                                            i138 = ((iM27614 ^ i136) * 12537) ^ 300749736;
                                            i139 = 1376783175;
                                        } else {
                                            iM27614 = (C0773.m3169("᩶ۗ") + i137) * (-33);
                                            i138 = ((iM27614 ^ i136) * (-15177)) ^ (-654309533);
                                            i139 = 1479262322;
                                        }
                                        break;
                                    case -328575698:
                                    case 1742438927:
                                        return;
                                    case -66294469:
                                    case 1986957772:
                                        if (C2287.f7432 >= 0) {
                                            iM27614 = (C0619.m2761("᩻᩺") ^ i137) * (-29);
                                            i138 = ((iM27614 ^ i136) * (-31713)) ^ 1592457777;
                                            i139 = 1121783020;
                                        } else {
                                            iM27614 = (C0773.m3169("᩵ۚ") ^ i137) * 29;
                                            i138 = ((iM27614 ^ i136) * 12735) ^ 1583994570;
                                            i139 = -737331295;
                                        }
                                        break;
                                    case 701515370:
                                    case 1106333992:
                                        if (C0619.f2439) {
                                            iM27614 = (i137 - C0773.m3169("᩺᩹")) * (-45);
                                            i138 = ((iM27614 ^ i136) * 12537) ^ 300749736;
                                            i139 = 1376783175;
                                        } else {
                                            iM27614 = (C0619.m2761("᩻ܰ") ^ i136) * 109;
                                            i138 = ((iM27614 ^ i137) * 25617) ^ (-632397105);
                                            i139 = 641006961;
                                        }
                                        break;
                                    default:
                                        if (AbstractC0641.f2496 < 0) {
                                            iM27614 = (C0619.m2761("᩻᩺") ^ i137) * (-29);
                                            i138 = ((iM27614 ^ i136) * (-31713)) ^ 1592457777;
                                            i139 = 1121783020;
                                        } else {
                                            iM27614 = C0619.m2761("ۙ᩻") ^ i137;
                                            i138 = ((iM27614 ^ i136) * (-19727)) ^ (-483888374);
                                            i139 = 392615094;
                                        }
                                        break;
                                }
                            }
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view14) {
                            ViewOnClickListenerC1057 viewOnClickListenerC1057 = null;
                            int i135 = 1449988562;
                            int i136 = C2354.f7599;
                            int i137 = C3033.f9831;
                            int iM31622 = C0773.m3169("ᩴ۠") ^ i136;
                            int i138 = ((iM31622 ^ i137) * (-16721)) ^ 1816710012;
                            int i139 = -769009672;
                            while (true) {
                                i135 = ((((i135 ^ i137) * 391) >> 31) & i138) ^ (iM31622 ^ i139);
                                switch (i135) {
                                    case -2068789004:
                                    case -726222305:
                                        AbstractC0641.m2813();
                                        if (C13473.f42873 == 0) {
                                            iM31622 = C0619.m2761("ܽܽ") ^ i137;
                                            i138 = ((iM31622 ^ i136) * 19061) ^ (-2022223171);
                                            i139 = -585944349;
                                        } else {
                                            iM31622 = C0773.m3169("ۡۧ") ^ i136;
                                            i138 = ((iM31622 ^ i137) * 7849) ^ (-838242880);
                                            i139 = 924261984;
                                        }
                                        break;
                                    case -1964808705:
                                    case 316329288:
                                        C3690.m11987();
                                        break;
                                    case -1861814886:
                                    case -1742640257:
                                        if (C2023.f6737) {
                                            iM31622 = C0619.m2761("ۙ᩹") ^ i137;
                                            i138 = ((iM31622 ^ i136) * 25603) ^ 1814135813;
                                            i139 = 996833141;
                                        } else {
                                            iM31622 = C0773.m3169("ܿܶ") ^ i137;
                                            i138 = ((iM31622 ^ i136) * (-29565)) ^ 299035951;
                                            i139 = -874101658;
                                        }
                                        break;
                                    case -1755958135:
                                    case 9379985:
                                        C13473.m33144();
                                        C0862.m3503();
                                        iM31622 = C0773.m3169("ۛۖ") ^ i137;
                                        i138 = ((iM31622 ^ i136) * (-29033)) ^ (-1395882368);
                                        i139 = -49924679;
                                        break;
                                    case -1712819113:
                                    case 662846870:
                                        if (C2702.f8586 <= 0) {
                                            iM31622 = C0773.m3169("ۛۖ") ^ i137;
                                            i138 = ((iM31622 ^ i136) * (-29033)) ^ (-1395882368);
                                            i139 = -49924679;
                                        } else {
                                            iM31622 = C0619.m2761("֨᩵") ^ i137;
                                            i138 = ((iM31622 ^ i136) * (-27017)) ^ (-681008586);
                                            i139 = 1553734079;
                                        }
                                        break;
                                    case -1485321258:
                                    case 300639850:
                                        C2310.m7813();
                                        if (!C1783.m6232()) {
                                            iM31622 = C0619.m2761("ܽܽ") ^ i137;
                                            i138 = ((iM31622 ^ i136) * 19061) ^ (-2022223171);
                                            i139 = -585944349;
                                        } else {
                                            iM31622 = C0773.m3169("ۛۖ") ^ i137;
                                            i138 = ((iM31622 ^ i136) * (-29033)) ^ (-1395882368);
                                            i139 = -49924679;
                                        }
                                        break;
                                    case -1287588904:
                                    case 1312940095:
                                        if (C1564.f5401 <= 0) {
                                            iM31622 = C0619.m2761("ۙ᩹") ^ i137;
                                            i138 = ((iM31622 ^ i136) * 25603) ^ 1814135813;
                                            i139 = 996833141;
                                        } else {
                                            iM31622 = (C0619.m2761("ۜۘ") ^ i137) * q.h;
                                            i138 = ((iM31622 ^ i136) * 7915) ^ (-2023406512);
                                            i139 = -1467436713;
                                        }
                                        break;
                                    case -1261729625:
                                    case 435437897:
                                        if (C2966.f9654 >= 0) {
                                            iM31622 = C0773.m3169("ۜᩳ") ^ i136;
                                            i138 = ((iM31622 ^ i137) * (-30225)) ^ 374160923;
                                            i139 = 121033230;
                                        } else {
                                            iM31622 = C0773.m3169("ۙܽ") ^ i136;
                                            i138 = ((iM31622 ^ i137) * (-20041)) ^ 139506231;
                                            i139 = 138525035;
                                        }
                                        break;
                                    case -1234357975:
                                    case 1270346755:
                                        if (C0862.f3233 != 0) {
                                            iM31622 = C0619.m2761("ܽܽ") ^ i137;
                                            i138 = ((iM31622 ^ i136) * 19061) ^ (-2022223171);
                                            i139 = -585944349;
                                        } else {
                                            iM31622 = C0773.m3169("᩻֡") ^ i136;
                                            i138 = ((iM31622 ^ i137) * (-24401)) ^ 1598276327;
                                            i139 = 1345800005;
                                        }
                                        break;
                                    case -1228086739:
                                    case -295279638:
                                        if (C11235.f35427 >= 0) {
                                            iM31622 = C0773.m3169("ۛۖ") ^ i137;
                                            i138 = ((iM31622 ^ i136) * (-29033)) ^ (-1395882368);
                                            i139 = -49924679;
                                        } else {
                                            iM31622 = (C0773.m3169("֨᩺") ^ i136) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                            i138 = ((iM31622 ^ i137) * (-20859)) ^ (-2072145888);
                                            i139 = 817622650;
                                        }
                                        break;
                                    case -1068207021:
                                    case 843204144:
                                        if (C0487.f2131 <= 0) {
                                            iM31622 = C0773.m3169("ۛۖ") ^ i137;
                                            i138 = ((iM31622 ^ i136) * (-29033)) ^ (-1395882368);
                                            i139 = -49924679;
                                        } else {
                                            iM31622 = C0619.m2761("᩶֡") ^ i137;
                                            i138 = ((iM31622 ^ i136) * 13755) ^ (-2029568148);
                                            i139 = 28932523;
                                        }
                                        break;
                                    case -987084660:
                                    case 1176219718:
                                        ViewOnClickListenerC1057.m3953(view14, editText10, viewOnClickListenerC1057);
                                        break;
                                    case -605803632:
                                    case 218181960:
                                        if (C2310.m7813() <= 0) {
                                            iM31622 = C0773.m3169("ۜᩳ") ^ i136;
                                            i138 = ((iM31622 ^ i137) * (-30225)) ^ 374160923;
                                            i139 = 121033230;
                                        } else {
                                            iM31622 = (C0773.m3169("ܰۙ") ^ i137) * (-67);
                                            i138 = ((iM31622 ^ i136) * (-12273)) ^ (-931849177);
                                            i139 = 550268030;
                                        }
                                        break;
                                    case -442134157:
                                    case 607813659:
                                        viewOnClickListenerC1057 = this.f38870;
                                        if (C0487.f2131 <= 0) {
                                            iM31622 = C0619.m2761("ۙ᩹") ^ i137;
                                            i138 = ((iM31622 ^ i136) * 25603) ^ 1814135813;
                                            i139 = 996833141;
                                        } else {
                                            iM31622 = (i136 - C0619.m2761("ۤۘ")) * (-25);
                                            i138 = ((iM31622 ^ i137) * 24591) ^ 1353562680;
                                            i139 = -1599133694;
                                        }
                                        break;
                                    case 852489961:
                                    case 1090576182:
                                        C11235.m28309();
                                        if (C4282.f15546 <= 0) {
                                            iM31622 = C0773.m3169("ۜᩳ") ^ i136;
                                            i138 = ((iM31622 ^ i137) * (-30225)) ^ 374160923;
                                            i139 = 121033230;
                                        } else {
                                            iM31622 = C0773.m3169("ۛۖ") ^ i137;
                                            i138 = ((iM31622 ^ i136) * (-29033)) ^ (-1395882368);
                                            i139 = -49924679;
                                        }
                                        break;
                                    default:
                                        if (C2966.f9654 >= 0) {
                                            iM31622 = C0619.m2761("ۙ᩹") ^ i137;
                                            i138 = ((iM31622 ^ i136) * 25603) ^ 1814135813;
                                            i139 = 996833141;
                                        } else {
                                            iM31622 = (i136 - C0773.m3169("֫۠")) * 33;
                                            i138 = ((iM31622 ^ i137) * 19073) ^ (-991658576);
                                            i139 = 94488076;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    final EditText editText11 = editText6;
                    final TextInputLayout textInputLayout5 = textInputLayout;
                    final TextInputLayout textInputLayout6 = textInputLayout4;
                    C2375.m8070(C3448.m11246(view13, C0619.m2761(C2354.m7980(f3786, 500, 3, i92)) ^ 2099931819), new View.OnClickListener() { // from class: l.ۛۖ᩻
                        {
                            int i135 = -497527569;
                            int i136 = C1321.f4751;
                            int i137 = C11235.f35427;
                            int iM27614 = (C0619.m2761("ܰۘ") ^ i137) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                            int i138 = ((iM27614 ^ i136) * (-10965)) ^ (-1185529547);
                            int i139 = 913672779;
                            while (true) {
                                i135 = ((((i135 ^ i136) * 15023) >> 31) & i138) ^ (iM27614 ^ i139);
                                switch (i135) {
                                    case -2047387150:
                                    case 635906139:
                                        if (C0950.f3488 >= 0) {
                                            iM27614 = C0619.m2761("ۛ᩹") ^ i136;
                                            i138 = ((iM27614 ^ i137) * (-14043)) ^ 1256848928;
                                            i139 = -1398314216;
                                        } else {
                                            iM27614 = C0773.m3169("֫ᩴ") ^ i136;
                                            i138 = ((iM27614 ^ i137) * (-1163)) ^ 829502312;
                                            i139 = 1606395688;
                                        }
                                        break;
                                    case -1996800314:
                                    case -1610317514:
                                        if (C2287.f7432 >= 0) {
                                            iM27614 = C0619.m2761("ۛ᩹") ^ i136;
                                            i138 = ((iM27614 ^ i137) * (-14043)) ^ 1256848928;
                                            i139 = -1398314216;
                                        } else {
                                            iM27614 = (C0619.m2761("ۚۤ") + i137) * (-93);
                                            i138 = ((iM27614 ^ i136) * 24199) ^ (-221097975);
                                            i139 = 1549071765;
                                        }
                                        break;
                                    case -1885854765:
                                    case 2136863870:
                                        if (!C4282.m13644()) {
                                            iM27614 = (C0773.m3169("ܿܳ") + i136) * (-91);
                                            i138 = ((iM27614 ^ i137) * 20817) ^ (-1153496390);
                                            i139 = 2046361904;
                                        } else {
                                            iM27614 = C0619.m2761("ۛ᩹") ^ i136;
                                            i138 = ((iM27614 ^ i137) * (-14043)) ^ 1256848928;
                                            i139 = -1398314216;
                                        }
                                        break;
                                    case -1541082449:
                                    case -531271817:
                                        if (C17202.m40372()) {
                                            iM27614 = (C0773.m3169("۟ۨ") ^ i137) * (-53);
                                            i138 = ((iM27614 ^ i136) * (-28793)) ^ (-1126249510);
                                            i139 = 669147111;
                                        } else {
                                            iM27614 = (i137 - C0773.m3169("᩷᩹")) * 97;
                                            i138 = ((iM27614 ^ i136) * (-6929)) ^ (-216846454);
                                            i139 = -651592884;
                                        }
                                        break;
                                    case -1483315741:
                                    case -478657002:
                                        if (C3998.f13671 != 0) {
                                            iM27614 = C0773.m3169("ۨᩳ") ^ i137;
                                            i138 = ((iM27614 ^ i136) * 12407) ^ (-749616087);
                                            i139 = -276250664;
                                        } else {
                                            iM27614 = C0773.m3169("ۖ᩵") ^ i136;
                                            i138 = ((iM27614 ^ i137) * (-10157)) ^ 30515475;
                                            i139 = -1410239929;
                                        }
                                        break;
                                    case -1327001800:
                                    case -640508002:
                                        if (C3033.m9845() <= 0) {
                                            iM27614 = C0773.m3169("ۨᩳ") ^ i137;
                                            i138 = ((iM27614 ^ i136) * 12407) ^ (-749616087);
                                            i139 = -276250664;
                                        } else {
                                            iM27614 = (i136 - C0619.m2761("֡ۙ")) * 89;
                                            i138 = ((iM27614 ^ i137) * 21673) ^ (-331166530);
                                            i139 = -656588424;
                                        }
                                        break;
                                    case -1095817253:
                                    case 491552014:
                                        if (!RunnableC3646.f12471) {
                                            iM27614 = C0773.m3169("ۨᩳ") ^ i137;
                                            i138 = ((iM27614 ^ i136) * 12407) ^ (-749616087);
                                            i139 = -276250664;
                                        } else {
                                            iM27614 = C0619.m2761("᩺ۛ") ^ i137;
                                            i138 = ((iM27614 ^ i136) * 4277) ^ 970562077;
                                            i139 = -463139014;
                                        }
                                        break;
                                    case -913733471:
                                    case -2669297:
                                        if (C2834.f9334 <= 0) {
                                            iM27614 = C0619.m2761("᩺ۛ") ^ i137;
                                            i138 = ((iM27614 ^ i136) * 4277) ^ 970562077;
                                            i139 = -463139014;
                                        } else {
                                            iM27614 = (C0619.m2761("ܽ֨") + i137) * 47;
                                            i138 = ((iM27614 ^ i136) * 21505) ^ 1277742755;
                                            i139 = 1917251971;
                                        }
                                        break;
                                    case -468080622:
                                    case 2104130567:
                                        C3099.m10095();
                                        C13473.m33144();
                                        iM27614 = C0619.m2761("ۛ᩹") ^ i136;
                                        i138 = ((iM27614 ^ i137) * (-14043)) ^ 1256848928;
                                        i139 = -1398314216;
                                        break;
                                    case -114838918:
                                    case 1363395500:
                                        if (C2375.f7641 <= 0) {
                                            iM27614 = (C0773.m3169("ܿܳ") + i136) * (-91);
                                            i138 = ((iM27614 ^ i137) * 20817) ^ (-1153496390);
                                            i139 = 2046361904;
                                        } else {
                                            iM27614 = (i136 - C0619.m2761("ۜ۠")) * (-53);
                                            i138 = ((iM27614 ^ i137) * 7601) ^ (-215589298);
                                            i139 = -581913144;
                                        }
                                        break;
                                    case -6969312:
                                    case 225002339:
                                        if (C2966.f9654 >= 0) {
                                            iM27614 = C0619.m2761("ۛ᩹") ^ i136;
                                            i138 = ((iM27614 ^ i137) * (-14043)) ^ 1256848928;
                                            i139 = -1398314216;
                                        } else {
                                            iM27614 = C0619.m2761("۫۫") ^ i136;
                                            i138 = ((iM27614 ^ i137) * 8603) ^ (-1364675035);
                                            i139 = 110920493;
                                        }
                                        break;
                                    case 171924125:
                                    case 533800328:
                                        AbstractC3624.m11755();
                                        C1080.m4050();
                                        throw new RuntimeException();
                                    case 842786643:
                                    case 1651341114:
                                        if (C2966.f9654 >= 0) {
                                            iM27614 = C0773.m3169("ۨᩳ") ^ i137;
                                            i138 = ((iM27614 ^ i136) * 12407) ^ (-749616087);
                                            i139 = -276250664;
                                        } else {
                                            iM27614 = (C0619.m2761("᩻ܽ") + i137) * (-105);
                                            i138 = ((iM27614 ^ i136) * 13263) ^ (-450788838);
                                            i139 = 1553796748;
                                        }
                                        break;
                                    case 1009445606:
                                    case 2044968082:
                                        return;
                                    case 1607964693:
                                    case 1722705890:
                                        if (C0487.f2131 <= 0) {
                                            iM27614 = (i137 - C0773.m3169("᩷᩹")) * 97;
                                            i138 = ((iM27614 ^ i136) * (-6929)) ^ (-216846454);
                                            i139 = -651592884;
                                        } else {
                                            iM27614 = C0619.m2761("֫ܶ") ^ i137;
                                            i138 = ((iM27614 ^ i136) * (-9195)) ^ 1552725088;
                                            i139 = -352241363;
                                        }
                                        break;
                                    default:
                                        C0862.m3503();
                                        if (!C17202.m40372()) {
                                            iM27614 = C0773.m3169("ۨᩳ") ^ i137;
                                            i138 = ((iM27614 ^ i136) * 12407) ^ (-749616087);
                                            i139 = -276250664;
                                        } else {
                                            iM27614 = C0619.m2761("ۛ᩹") ^ i136;
                                            i138 = ((iM27614 ^ i137) * (-14043)) ^ 1256848928;
                                            i139 = -1398314216;
                                        }
                                        break;
                                }
                            }
                        }

                        /* JADX WARN: Code duplicated, block: B:15:0x0064  */
                        /* JADX WARN: Code duplicated, block: B:46:0x0134  */
                        /* JADX WARN: Code duplicated, block: B:52:0x0179 A[PHI: r11 r13 r14
                          0x0179: PHI (r11v5 android.widget.EditText) = 
                          (r11v3 android.widget.EditText)
                          (r11v3 android.widget.EditText)
                          (r11v4 android.widget.EditText)
                          (r11v3 android.widget.EditText)
                         binds: [B:41:0x0116, B:33:0x00dc, B:29:0x00bd, B:6:0x0036] A[DONT_GENERATE, DONT_INLINE]
                          0x0179: PHI (r13v3 l.۠ۖۧ) = (r13v1 l.۠ۖۧ), (r13v1 l.۠ۖۧ), (r13v2 l.۠ۖۧ), (r13v1 l.۠ۖۧ) binds: [B:41:0x0116, B:33:0x00dc, B:29:0x00bd, B:6:0x0036] A[DONT_GENERATE, DONT_INLINE]
                          0x0179: PHI (r14v3 l.֨۠᩻) = (r14v1 l.֨۠᩻), (r14v2 l.֨۠᩻), (r14v1 l.֨۠᩻), (r14v1 l.֨۠᩻) binds: [B:41:0x0116, B:33:0x00dc, B:29:0x00bd, B:6:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:60:0x01c0 A[PHI: r12 r15
                          0x01c0: PHI (r12v3 android.widget.EditText) = 
                          (r12v1 android.widget.EditText)
                          (r12v1 android.widget.EditText)
                          (r12v1 android.widget.EditText)
                          (r12v1 android.widget.EditText)
                          (r12v2 android.widget.EditText)
                          (r12v1 android.widget.EditText)
                          (r12v1 android.widget.EditText)
                          (r12v1 android.widget.EditText)
                         binds: [B:59:0x01be, B:55:0x01a5, B:49:0x0160, B:37:0x00fb, B:25:0x009b, B:19:0x0081, B:17:0x007d, B:13:0x0060] A[DONT_GENERATE, DONT_INLINE]
                          0x01c0: PHI (r15v3 com.google.android.material.textfield.TextInputLayout) = 
                          (r15v1 com.google.android.material.textfield.TextInputLayout)
                          (r15v1 com.google.android.material.textfield.TextInputLayout)
                          (r15v1 com.google.android.material.textfield.TextInputLayout)
                          (r15v1 com.google.android.material.textfield.TextInputLayout)
                          (r15v2 com.google.android.material.textfield.TextInputLayout)
                          (r15v1 com.google.android.material.textfield.TextInputLayout)
                          (r15v1 com.google.android.material.textfield.TextInputLayout)
                          (r15v1 com.google.android.material.textfield.TextInputLayout)
                         binds: [B:59:0x01be, B:55:0x01a5, B:49:0x0160, B:37:0x00fb, B:25:0x009b, B:19:0x0081, B:17:0x007d, B:13:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view14) {
                            int iM31622;
                            int i135;
                            int i136 = 1762857309;
                            int i137 = C0773.f2792;
                            int i138 = RunnableC3055.f9898;
                            int iM27614 = C0619.m2761("ᩳܰ") ^ i137;
                            int i139 = ((iM27614 ^ i138) * (-14845)) ^ (-240321781);
                            int i140 = iM27614 ^ 368531603;
                            ViewOnClickListenerC1057 viewOnClickListenerC1057 = null;
                            DialogInterfaceC8327 dialogInterfaceC8327 = null;
                            EditText editText12 = null;
                            EditText editText13 = null;
                            TextInputLayout textInputLayout7 = null;
                            while (true) {
                                i136 = i140 ^ ((((i136 ^ i138) * (-25135)) >> 31) & i139);
                                switch (i136) {
                                    case -2132179288:
                                    case 1171094755:
                                        editText13 = editText11;
                                        textInputLayout7 = textInputLayout5;
                                        if (C1783.f6087 <= 0) {
                                            iM31622 = C0773.m3169("ۖ᩺") ^ i137;
                                            i139 = ((iM31622 ^ i138) * 12623) ^ 1065328313;
                                            i135 = -124056564;
                                        } else {
                                            iM31622 = (i137 - C0619.m2761("᩸֫")) * (-61);
                                            i139 = ((iM31622 ^ i138) * (-29901)) ^ (-1445455332);
                                            i135 = -2107384807;
                                        }
                                        i140 = iM31622 ^ i135;
                                        break;
                                    case -1999369018:
                                    case -1392940626:
                                        viewOnClickListenerC1057 = this;
                                        if (C2310.m7813() <= 0) {
                                            iM31622 = C0619.m2761("ᩴܶ") ^ i137;
                                            i139 = ((iM31622 ^ i138) * (-12791)) ^ (-2060766759);
                                            i135 = -724413387;
                                        } else {
                                            iM31622 = (C0619.m2761("ۙܳ") + i138) * (-35);
                                            i139 = ((iM31622 ^ i137) * (-4797)) ^ 528926872;
                                            i135 = 1248187533;
                                        }
                                        i140 = iM31622 ^ i135;
                                        break;
                                    case -1979344191:
                                    case -1314850049:
                                        C11235.m28309();
                                        C1321.m4852();
                                        break;
                                    case -1953486203:
                                    case -694570499:
                                        C1519.m5403();
                                        if (C3998.f13671 != 0) {
                                            iM31622 = C0773.m3169("ۖ᩺") ^ i137;
                                            i139 = ((iM31622 ^ i138) * 12623) ^ 1065328313;
                                            i135 = -124056564;
                                        } else {
                                            iM31622 = (C0619.m2761("۫ۙ") ^ i138) * (-21);
                                            i139 = ((iM31622 ^ i137) * (-25647)) ^ (-189447382);
                                            i135 = 1544178026;
                                        }
                                        i140 = iM31622 ^ i135;
                                        break;
                                    case -1901207054:
                                    case -1016503508:
                                        if (C3734.f12817 >= 0) {
                                            iM31622 = C0619.m2761("ᩴܶ") ^ i137;
                                            i139 = ((iM31622 ^ i138) * (-12791)) ^ (-2060766759);
                                            i135 = -724413387;
                                        } else {
                                            iM31622 = (C0773.m3169("ۢۛ") ^ i137) * 21;
                                            i139 = ((iM31622 ^ i138) * 9117) ^ (-1238417935);
                                            i135 = 1453478809;
                                        }
                                        i140 = iM31622 ^ i135;
                                        break;
                                    case -1749404668:
                                    case 1698972505:
                                        if (C3492.f12043 > 0) {
                                            iM31622 = C0773.m3169("ۖ᩺") ^ i137;
                                            i139 = ((iM31622 ^ i138) * 12623) ^ 1065328313;
                                            i135 = -124056564;
                                        } else {
                                            iM31622 = C0619.m2761("ᩴ᩶") ^ i138;
                                            i139 = ((iM31622 ^ i137) * 11997) ^ 1826923060;
                                            i135 = 1602488074;
                                        }
                                        i140 = iM31622 ^ i135;
                                        break;
                                    case -1666068555:
                                    case 862044667:
                                        ViewOnClickListenerC1057.m3964(editText12, editText13, dialogInterfaceC8327, viewOnClickListenerC1057, textInputLayout7, textInputLayout6);
                                        break;
                                    case -1512086050:
                                    case -1215695925:
                                        dialogInterfaceC8327 = dialogInterfaceC8327M4860;
                                        editText12 = editText10;
                                        if (C3099.f10023 <= 0) {
                                            iM31622 = C0619.m2761("ᩴܶ") ^ i137;
                                            i139 = ((iM31622 ^ i138) * (-12791)) ^ (-2060766759);
                                            i135 = -724413387;
                                        } else {
                                            iM31622 = C0773.m3169("ۙ᩺") ^ i138;
                                            i139 = ((iM31622 ^ i137) * 32575) ^ (-208742561);
                                            i135 = 1794482157;
                                        }
                                        i140 = iM31622 ^ i135;
                                        break;
                                    case -1504765986:
                                    case 607490016:
                                        C0269.m1775();
                                        if (C0487.m2356() >= 0) {
                                            iM31622 = (C0619.m2761("۫ۙ") ^ i138) * (-21);
                                            i139 = ((iM31622 ^ i137) * (-25647)) ^ (-189447382);
                                            i135 = 1544178026;
                                        } else {
                                            iM31622 = (C0773.m3169("۟֡") ^ i137) * (-59);
                                            i139 = ((iM31622 ^ i138) * (-13057)) ^ (-1317347979);
                                            i135 = 518032882;
                                        }
                                        i140 = iM31622 ^ i135;
                                        break;
                                    case -1248084468:
                                    case 565099051:
                                        C2287.m7745();
                                        iM31622 = C0773.m3169("ۖ᩺") ^ i137;
                                        i139 = ((iM31622 ^ i138) * 12623) ^ 1065328313;
                                        i135 = -124056564;
                                        i140 = iM31622 ^ i135;
                                        break;
                                    case -1171032910:
                                    case 817060240:
                                        if (C0269.f1558 <= 0) {
                                            iM31622 = C0773.m3169("ۖ᩺") ^ i137;
                                            i139 = ((iM31622 ^ i138) * 12623) ^ 1065328313;
                                            i135 = -124056564;
                                        } else {
                                            iM31622 = (C0619.m2761("ۨܽ") ^ i137) * (-53);
                                            i139 = ((iM31622 ^ i138) * 29797) ^ (-1789679850);
                                            i135 = 1755844639;
                                        }
                                        i140 = iM31622 ^ i135;
                                        break;
                                    case -1110639283:
                                    case 764392139:
                                        if (AbstractC0116.f1064 <= 0) {
                                            iM31622 = C0619.m2761("ᩴ᩶") ^ i138;
                                            i139 = ((iM31622 ^ i137) * 11997) ^ 1826923060;
                                            i135 = 1602488074;
                                        } else {
                                            iM31622 = C0773.m3169("۟ܶ") ^ i138;
                                            i139 = ((iM31622 ^ i137) * (-9467)) ^ 1766612828;
                                            i135 = 695552159;
                                        }
                                        i140 = iM31622 ^ i135;
                                        break;
                                    case -260776772:
                                    case 1735007015:
                                        if (C2310.f7472 >= 0) {
                                            iM31622 = C0773.m3169("ۖ᩺") ^ i137;
                                            i139 = ((iM31622 ^ i138) * 12623) ^ 1065328313;
                                            i135 = -124056564;
                                        } else {
                                            iM31622 = C0773.m3169("᩵֡") ^ i137;
                                            i139 = ((iM31622 ^ i138) * 11303) ^ (-2079530278);
                                            i135 = 1918621487;
                                        }
                                        i140 = iM31622 ^ i135;
                                        break;
                                    case 13014602:
                                    case 66845911:
                                        if (C3492.f12043 <= 0) {
                                            iM31622 = C0773.m3169("ۖ᩺") ^ i137;
                                            i139 = ((iM31622 ^ i138) * 12623) ^ 1065328313;
                                            i135 = -124056564;
                                        } else {
                                            iM31622 = C0619.m2761("֨۫") ^ i138;
                                            i139 = ((iM31622 ^ i137) * 18371) ^ (-446154776);
                                            i135 = -564972674;
                                        }
                                        i140 = iM31622 ^ i135;
                                        break;
                                    case 832646217:
                                    case 1551107644:
                                        if (C3033.m9845() <= 0) {
                                            iM31622 = C0773.m3169("ۖ᩺") ^ i137;
                                            i139 = ((iM31622 ^ i138) * 12623) ^ 1065328313;
                                            i135 = -124056564;
                                        } else {
                                            iM31622 = C0619.m2761("ۤۙ") ^ i137;
                                            i139 = ((iM31622 ^ i138) * 24011) ^ 1672637344;
                                            i135 = -95770598;
                                        }
                                        i140 = iM31622 ^ i135;
                                        break;
                                    default:
                                        if (C1519.m5403()) {
                                            iM31622 = (C0773.m3169("ܰᩳ") + i138) * 53;
                                            i139 = ((iM31622 ^ i137) * 7433) ^ 1692405064;
                                            i135 = 1216446627;
                                        } else {
                                            iM31622 = C0619.m2761("ᩴܶ") ^ i137;
                                            i139 = ((iM31622 ^ i138) * (-12791)) ^ (-2060766759);
                                            i135 = -724413387;
                                        }
                                        i140 = iM31622 ^ i135;
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    break;
                case -731037120:
                case 1703956027:
                    c2362 = c2361M13539;
                    i36 = i93;
                    iM31615 = iM31615;
                    int i135 = iM31616;
                    int i136 = i87;
                    i37 = i89;
                    i90 = i90;
                    i38 = i91;
                    sArr4 = sArr7;
                    spannableString3 = spannableString7;
                    i39 = i81;
                    i40 = iM9671;
                    View view14 = view9;
                    EditText editText12 = editText8;
                    i41 = length;
                    editText3 = editText12;
                    View viewM11247 = C3448.m11246(view14, C0773.m3169(C2702.m8881(f3786, 491, 3, i92)) ^ 2119462794);
                    str6 = strM10047;
                    C2310.m7811(viewM11247, str6);
                    textInputLayout = (TextInputLayout) viewM11247;
                    view6 = view14;
                    int iM27614 = C0619.m2761(C2702.m8881(f3786, 494, 3, i92)) ^ 2130659435;
                    if (!C17202.m40372()) {
                        str5 = strM5510;
                        i84 = i84;
                        i85 = i85;
                        i86 = iM27614;
                        i42 = i136;
                        iM31616 = i135;
                        int iM27615 = (i77 - C0619.m2761("᩵᩺")) * 119;
                        int i1212 = i42;
                        int i1213 = ((iM27615 ^ i76) * 30861) ^ 164891345;
                        i85 = i85;
                        view9 = view6;
                        i81 = i39;
                        strM10047 = str6;
                        i89 = i37;
                        length = i41;
                        editText8 = editText3;
                        i93 = i36;
                        i90 = i90;
                        i79 = iM27615 ^ (-781155828);
                        c2361M13539 = c2362;
                        strM5510 = str5;
                        sArr7 = sArr4;
                        iM31615 = iM31615;
                        i78 = i1213;
                        spannableString7 = spannableString3;
                        i87 = i1212;
                        i84 = i84;
                        iM9671 = i40;
                        i91 = i38;
                    } else {
                        int iM31622 = (C0773.m3169("ۧ᩶") + i77) * 57;
                        int i137 = ((iM31622 ^ i76) * 21639) ^ 180548340;
                        i53 = iM31622 ^ 2038356085;
                        view9 = view6;
                        sArr7 = sArr4;
                        iM31615 = iM31615;
                        i78 = i137;
                        strM10047 = str6;
                        length = i41;
                        editText8 = editText3;
                        iM9671 = i40;
                        i90 = i90;
                        i91 = i38;
                        c2361M13539 = c2362;
                        i86 = iM27614;
                        spannableString7 = spannableString3;
                        i87 = i136;
                        iM31616 = i135;
                        int i1011 = i36;
                        i79 = i53;
                        i81 = i39;
                        i89 = i37;
                        i93 = i1011;
                    }
                    break;
                case -707173569:
                case 1407922270:
                    i82++;
                    i88 = iM9671;
                    iM2761 = (C0619.m2761("۠۟") ^ i76) * (-123);
                    i = ((iM2761 ^ i77) * (-23377)) ^ (-1715375998);
                    i2 = -198682036;
                    i79 = iM2761 ^ i2;
                    i78 = i;
                    break;
                case -695942770:
                case -421072297:
                    C3033.m9858(this, new Intent(this, (Class<?>) ActivityC0093.class));
                    break;
                case -691374469:
                case 1881905109:
                    c2361 = c2361M13539;
                    i21 = i93;
                    i22 = iM31615;
                    i23 = i89;
                    i24 = i90;
                    i25 = i91;
                    sArr2 = sArr7;
                    i26 = i81;
                    i27 = iM9671;
                    str2 = strM5510;
                    i28 = i84;
                    i29 = i85;
                    view4 = view8;
                    editText2 = editText8;
                    i30 = length;
                    str3 = str9;
                    str4 = strM10047;
                    view5 = view9;
                    i31 = i86;
                    i32 = iM31616;
                    i33 = i87;
                    spannableString2 = spannableString7;
                    if (C18978.m44069()) {
                        iM31611 = (i77 - C0773.m3169("ۡܿ")) * 61;
                        i34 = ((iM31611 ^ i76) * (-17867)) ^ 854283704;
                        i35 = 2028216312;
                    } else {
                        iM31611 = (C0773.m3169("᩹۫") + i77) * (-87);
                        i34 = ((iM31611 ^ i76) * (-24525)) ^ 471890193;
                        i35 = 2021685386;
                    }
                    int i1012 = iM31611 ^ i35;
                    view8 = view4;
                    str9 = str3;
                    i85 = i29;
                    i84 = i28;
                    i81 = i26;
                    iM9671 = i27;
                    i91 = i25;
                    i89 = i23;
                    i93 = i21;
                    i79 = i1012;
                    spannableString7 = spannableString2;
                    i87 = i33;
                    iM31616 = i32;
                    i86 = i31;
                    view9 = view5;
                    strM10047 = str4;
                    length = i30;
                    editText8 = editText2;
                    i90 = i24;
                    c2361M13539 = c2361;
                    sArr3 = sArr2;
                    iM31615 = i22;
                    i78 = i34;
                    strM5510 = str2;
                    sArr7 = sArr3;
                    break;
                case -668170169:
                case -588941621:
                    C17617.m41267(textInputLayout2);
                    final EditText editText13 = editText7;
                    C23916.m53425(editText13, C18978.m44083());
                    editText13.setSelection(i90, editText13.length());
                    C2361 c2361M3797 = C0950.m3794(this);
                    View view15 = view10;
                    C4282.m13657(c2361M3797, view15);
                    final DialogInterfaceC8327 dialogInterfaceC8327M10090 = C3099.m10090(c2361M3797);
                    C21576.m49090(editText13);
                    final TextInputLayout textInputLayout7 = textInputLayout2;
                    C2375.m8070(C2834.m9333(view15, iM31615), new View.OnClickListener() { // from class: l.᩹ۖ᩻
                        {
                            int i138 = 433051725;
                            int i139 = C2966.f9654;
                            int i140 = C1080.f3865;
                            int iM27616 = C0619.m2761("᩸ܽ") ^ i140;
                            int i141 = ((iM27616 ^ i139) * (-12811)) ^ (-966957103);
                            int i142 = -718917933;
                            while (true) {
                                i138 = ((((i138 ^ i139) * 24947) >> 31) & i141) ^ (iM27616 ^ i142);
                                switch (i138) {
                                    case -2114282373:
                                    case -713809551:
                                        if (C4238.f15451 >= 0) {
                                            iM27616 = C0773.m3169("ᩳۨ") ^ i140;
                                            i141 = ((iM27616 ^ i139) * 25095) ^ 1049056609;
                                            i142 = -2091246748;
                                        } else {
                                            iM27616 = C0773.m3169("ۤܶ") ^ i140;
                                            i141 = ((iM27616 ^ i139) * (-30237)) ^ (-933511443);
                                            i142 = -39342255;
                                        }
                                        break;
                                    case -2066365494:
                                    case 1480554329:
                                        C2023.m6964();
                                        RunnableC1848.m6360();
                                        iM27616 = C0619.m2761("֫֫") ^ i139;
                                        i141 = ((iM27616 ^ i140) * (-20381)) ^ (-1865196851);
                                        i142 = 781588457;
                                        break;
                                    case -2055967830:
                                    case 1357088444:
                                        if (C2834.m9344() >= 0) {
                                            iM27616 = (C0619.m2761("ۨ۫") + i139) * (-23);
                                            i141 = ((iM27616 ^ i140) * 3463) ^ (-1637128243);
                                            i142 = -815167057;
                                        } else {
                                            iM27616 = (C0619.m2761("ۛۡ") ^ i140) * 23;
                                            i141 = ((iM27616 ^ i139) * (-12037)) ^ (-721747676);
                                            i142 = -58384315;
                                        }
                                        break;
                                    case -1897857377:
                                    case 1817652823:
                                        if (C3448.f11240 >= 0) {
                                            iM27616 = C0619.m2761("֨֨") ^ i140;
                                            i141 = ((iM27616 ^ i139) * 8447) ^ (-996647320);
                                            i142 = 1298078451;
                                        } else {
                                            iM27616 = (C0773.m3169("ᩴ۠") + i140) * (-27);
                                            i141 = ((iM27616 ^ i139) * 22575) ^ (-1326380500);
                                            i142 = -1370280686;
                                        }
                                        break;
                                    case -1774585573:
                                    case 97764262:
                                        if (C1564.f5401 <= 0) {
                                            iM27616 = (C0619.m2761("ۨ۫") + i139) * (-23);
                                            i141 = ((iM27616 ^ i140) * 3463) ^ (-1637128243);
                                            i142 = -815167057;
                                        } else {
                                            iM27616 = C0773.m3169("ᩳۨ") ^ i140;
                                            i141 = ((iM27616 ^ i139) * 25095) ^ 1049056609;
                                            i142 = -2091246748;
                                        }
                                        break;
                                    case -1608250738:
                                    case -461519684:
                                        return;
                                    case -1282840758:
                                    case 1203266182:
                                        RunnableC3646.m11813();
                                        C2485.m8357();
                                        throw new RuntimeException();
                                    case -1236729984:
                                    case -1027166631:
                                        C17202.m40372();
                                        if (C3779.f12953 <= 0) {
                                            iM27616 = C0619.m2761("֨֨") ^ i140;
                                            i141 = ((iM27616 ^ i139) * 8447) ^ (-996647320);
                                            i142 = 1298078451;
                                        } else {
                                            iM27616 = C0773.m3169("ᩳۨ") ^ i140;
                                            i141 = ((iM27616 ^ i139) * 25095) ^ 1049056609;
                                            i142 = -2091246748;
                                        }
                                        break;
                                    case -878549527:
                                    case 239289342:
                                        if (C2288.f7433 <= 0) {
                                            iM27616 = (C0619.m2761("ۨ۫") + i139) * (-23);
                                            i141 = ((iM27616 ^ i140) * 3463) ^ (-1637128243);
                                            i142 = -815167057;
                                        } else {
                                            iM27616 = (C0619.m2761("֫ۙ") ^ i140) * 93;
                                            i141 = ((iM27616 ^ i139) * 11829) ^ 276504478;
                                            i142 = -284849336;
                                        }
                                        break;
                                    case -761057589:
                                    case 400690576:
                                        if (RunnableC3055.f9898 >= 0) {
                                            iM27616 = C0619.m2761("֨֨") ^ i140;
                                            i141 = ((iM27616 ^ i139) * 8447) ^ (-996647320);
                                            i142 = 1298078451;
                                        } else {
                                            iM27616 = C0619.m2761("᩸᩷") ^ i139;
                                            i141 = ((iM27616 ^ i140) * (-29257)) ^ 1688267654;
                                            i142 = 1214818893;
                                        }
                                        break;
                                    case -390808762:
                                    case 762898841:
                                        C1080.m4050();
                                        if (C0950.m3785() == 0) {
                                            iM27616 = C0773.m3169("ᩳۨ") ^ i140;
                                            i141 = ((iM27616 ^ i139) * 25095) ^ 1049056609;
                                            i142 = -2091246748;
                                        } else {
                                            iM27616 = C0619.m2761("֫֫") ^ i139;
                                            i141 = ((iM27616 ^ i140) * (-20381)) ^ (-1865196851);
                                            i142 = 781588457;
                                        }
                                        break;
                                    case -134237875:
                                    case 650192235:
                                        if (C0269.f1558 <= 0) {
                                            iM27616 = C0773.m3169("ᩳۨ") ^ i140;
                                            i141 = ((iM27616 ^ i139) * 25095) ^ 1049056609;
                                            i142 = -2091246748;
                                        } else {
                                            iM27616 = C0619.m2761("ܳ֫") ^ i139;
                                            i141 = ((iM27616 ^ i140) * 4195) ^ 986661425;
                                            i142 = 335536004;
                                        }
                                        break;
                                    case 140875379:
                                    case 1972286390:
                                        if (C1080.m4050()) {
                                            iM27616 = (C0619.m2761("ۨ᩸") + i140) * (-107);
                                            i141 = ((iM27616 ^ i139) * 22979) ^ (-999088550);
                                            i142 = 1233144294;
                                        } else {
                                            iM27616 = (C0773.m3169("۫᩶") ^ i140) * (-73);
                                            i141 = ((iM27616 ^ i139) * 11337) ^ (-345127857);
                                            i142 = -1384380548;
                                        }
                                        break;
                                    case 302645336:
                                    case 1253283719:
                                        if (AbstractC0641.f2496 >= 0) {
                                            iM27616 = (C0773.m3169("۫᩶") ^ i140) * (-73);
                                            i141 = ((iM27616 ^ i139) * 11337) ^ (-345127857);
                                            i142 = -1384380548;
                                        } else {
                                            iM27616 = C0619.m2761("ܰۧ") ^ i139;
                                            i141 = ((iM27616 ^ i140) * (-7191)) ^ 642025934;
                                            i142 = 2036524232;
                                        }
                                        break;
                                    case 1532628550:
                                    case 1590907305:
                                        if (C1564.f5401 <= 0) {
                                            iM27616 = (C0619.m2761("ۨ۫") + i139) * (-23);
                                            i141 = ((iM27616 ^ i140) * 3463) ^ (-1637128243);
                                            i142 = -815167057;
                                        } else {
                                            iM27616 = (C0619.m2761("۟ۨ") ^ i139) * (-87);
                                            i141 = ((iM27616 ^ i140) * 2177) ^ (-661978871);
                                            i142 = -1920028118;
                                        }
                                        break;
                                    default:
                                        if (C2310.f7472 >= 0) {
                                            iM27616 = (C0773.m3169("۫᩶") ^ i140) * (-73);
                                            i141 = ((iM27616 ^ i139) * 11337) ^ (-345127857);
                                            i142 = -1384380548;
                                        } else {
                                            iM27616 = (i139 - C0773.m3169("᩶᩶")) * 75;
                                            i141 = ((iM27616 ^ i140) * (-2979)) ^ 1653209939;
                                            i142 = 1471503197;
                                        }
                                        break;
                                }
                            }
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view16) {
                            DialogInterfaceC8327 dialogInterfaceC8327 = null;
                            ViewOnClickListenerC1057 viewOnClickListenerC1057 = null;
                            int i138 = -61816091;
                            int i139 = AbstractC0116.f1064;
                            int i140 = C0950.f3488;
                            int iM27616 = (C0619.m2761("ۨۘ") + i139) * (-45);
                            int i141 = ((iM27616 ^ i140) * (-23543)) ^ (-1138942268);
                            int i142 = -1802641597;
                            while (true) {
                                i138 = ((((i138 ^ i140) * 30313) >> 31) & i141) ^ (iM27616 ^ i142);
                                switch (i138) {
                                    case -1992595323:
                                    case 1956650981:
                                        if (C3448.f11240 >= 0) {
                                            iM27616 = C0619.m2761("ܿۧ") ^ i140;
                                            i141 = ((iM27616 ^ i139) * (-13403)) ^ 1555946937;
                                            i142 = 1690620182;
                                        } else {
                                            iM27616 = C0619.m2761("ۜۢ") ^ i139;
                                            i141 = ((iM27616 ^ i140) * 6371) ^ (-1887433138);
                                            i142 = 891063360;
                                        }
                                        break;
                                    case -1967641112:
                                    case -1459334984:
                                        if (C1542.f5343 <= 0) {
                                            iM27616 = C0619.m2761("ۜ۟") ^ i139;
                                            i141 = ((iM27616 ^ i140) * 16797) ^ (-2062124199);
                                            i142 = 1003326699;
                                        } else {
                                            iM27616 = (i140 - C0619.m2761("ۧۛ")) * (-75);
                                            i141 = ((iM27616 ^ i139) * (-26153)) ^ (-1105862836);
                                            i142 = -106218411;
                                        }
                                        break;
                                    case -1687919968:
                                    case 750864217:
                                        dialogInterfaceC8327 = dialogInterfaceC8327M10090;
                                        if (C1146.f4234 >= 0) {
                                            iM27616 = (i140 - C0619.m2761("ۧۛ")) * (-75);
                                            i141 = ((iM27616 ^ i139) * (-26153)) ^ (-1105862836);
                                            i142 = -106218411;
                                        } else {
                                            iM27616 = (C0773.m3169("ۨ᩷") ^ i140) * (-19);
                                            i141 = ((iM27616 ^ i139) * 18441) ^ 158847554;
                                            i142 = -810342097;
                                        }
                                        break;
                                    case -1297884593:
                                    case 498436881:
                                        C1564.m5509();
                                        if (C3033.f9831 >= 0) {
                                            iM27616 = (i140 - C0619.m2761("ᩴۙ")) * 85;
                                            i141 = ((iM27616 ^ i139) * 24029) ^ 116834243;
                                            i142 = -1721622997;
                                        } else {
                                            iM27616 = C0619.m2761("ۜ۟") ^ i139;
                                            i141 = ((iM27616 ^ i140) * 16797) ^ (-2062124199);
                                            i142 = 1003326699;
                                        }
                                        break;
                                    case -930035861:
                                    case -756330361:
                                        if (C2702.m8876()) {
                                            iM27616 = C0773.m3169("ۧ۬") ^ i139;
                                            i141 = ((iM27616 ^ i140) * 29261) ^ 985863405;
                                            i142 = -667642372;
                                        } else {
                                            iM27616 = (i140 - C0619.m2761("ᩴۙ")) * 85;
                                            i141 = ((iM27616 ^ i139) * 24029) ^ 116834243;
                                            i142 = -1721622997;
                                        }
                                        break;
                                    case -734795655:
                                    case -601181019:
                                        if (C2288.f7433 <= 0) {
                                            iM27616 = (C0773.m3169("ۙᩴ") + i139) * (-77);
                                            i141 = ((iM27616 ^ i140) * 465) ^ 1553125943;
                                            i142 = -539989212;
                                        } else {
                                            iM27616 = (i140 - C0773.m3169("ܿᩴ")) * (-69);
                                            i141 = ((iM27616 ^ i139) * (-20989)) ^ 1201106632;
                                            i142 = 612137468;
                                        }
                                        break;
                                    case -508001027:
                                    case 1339068269:
                                        RunnableC3646.m11813();
                                        break;
                                    case -229760916:
                                    case 1488379533:
                                        if (C0862.f3233 != 0) {
                                            iM27616 = (i140 - C0619.m2761("ᩴۙ")) * 85;
                                            i141 = ((iM27616 ^ i139) * 24029) ^ 116834243;
                                            i142 = -1721622997;
                                        } else {
                                            iM27616 = C0773.m3169("ۘۗ") ^ i139;
                                            i141 = ((iM27616 ^ i140) * 20871) ^ (-2064022756);
                                            i142 = 1264675814;
                                        }
                                        break;
                                    case -203594820:
                                    case 2002069874:
                                        if (C3690.m11987()) {
                                            iM27616 = (i140 - C0619.m2761("ۧۛ")) * (-75);
                                            i141 = ((iM27616 ^ i139) * (-26153)) ^ (-1105862836);
                                            i142 = -106218411;
                                        } else {
                                            iM27616 = (C0773.m3169("ܰ֡") ^ i140) * 29;
                                            i141 = ((iM27616 ^ i139) * (-15335)) ^ (-77570092);
                                            i142 = -2070964695;
                                        }
                                        break;
                                    case -202399566:
                                    case 1691364979:
                                        C1826.m6301();
                                        if (C2354.f7599 < 0) {
                                            iM27616 = (C0773.m3169("ۙᩴ") + i139) * (-77);
                                            i141 = ((iM27616 ^ i140) * 465) ^ 1553125943;
                                            i142 = -539989212;
                                        } else {
                                            iM27616 = C0619.m2761("ۜ۟") ^ i139;
                                            i141 = ((iM27616 ^ i140) * 16797) ^ (-2062124199);
                                            i142 = 1003326699;
                                        }
                                        break;
                                    case 141838536:
                                    case 396594617:
                                        viewOnClickListenerC1057 = this;
                                        if (C20932.f66974 <= 0) {
                                            iM27616 = C0619.m2761("ܿۧ") ^ i140;
                                            i141 = ((iM27616 ^ i139) * (-13403)) ^ 1555946937;
                                            i142 = 1690620182;
                                        } else {
                                            iM27616 = C0773.m3169("ۗ᩷") ^ i139;
                                            i141 = ((iM27616 ^ i140) * 15909) ^ 1971845895;
                                            i142 = -1529787068;
                                        }
                                        break;
                                    case 405871018:
                                    case 1710770993:
                                        if (C3998.f13671 != 0) {
                                            iM27616 = (i140 - C0619.m2761("ۧۛ")) * (-75);
                                            i141 = ((iM27616 ^ i139) * (-26153)) ^ (-1105862836);
                                            i142 = -106218411;
                                        } else {
                                            iM27616 = C0619.m2761("ۡۚ") ^ i140;
                                            i141 = ((iM27616 ^ i139) * (-10677)) ^ (-1388626877);
                                            i142 = -477407792;
                                        }
                                        break;
                                    case 798988214:
                                    case 822258298:
                                        if (C2310.f7472 >= 0) {
                                            iM27616 = C0619.m2761("ܿۧ") ^ i140;
                                            i141 = ((iM27616 ^ i139) * (-13403)) ^ 1555946937;
                                            i142 = 1690620182;
                                        } else {
                                            iM27616 = C0773.m3169("ۗܳ") ^ i140;
                                            i141 = ((iM27616 ^ i139) * (-7951)) ^ 1972186893;
                                            i142 = 1701145980;
                                        }
                                        break;
                                    case 1070836436:
                                    case 1399070506:
                                        C3448.m11248();
                                        iM27616 = (i140 - C0619.m2761("ۧۛ")) * (-75);
                                        i141 = ((iM27616 ^ i139) * (-26153)) ^ (-1105862836);
                                        i142 = -106218411;
                                        break;
                                    case 1333742757:
                                    case 1441955632:
                                        if (C4282.m13644()) {
                                            iM27616 = (C0773.m3169("ܳ۠") + i139) * (-101);
                                            i141 = ((iM27616 ^ i140) * (-5939)) ^ (-837523299);
                                            i142 = 675154113;
                                        } else {
                                            iM27616 = C0619.m2761("ܿۧ") ^ i140;
                                            i141 = ((iM27616 ^ i139) * (-13403)) ^ 1555946937;
                                            i142 = 1690620182;
                                        }
                                        break;
                                    default:
                                        ViewOnClickListenerC1057.m3977(editText13, dialogInterfaceC8327, viewOnClickListenerC1057, textInputLayout7);
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    break;
                case -551865853:
                case 314570923:
                    C3734.m12152();
                    if (C1542.f5343 > 0) {
                        i3 = i93;
                        iM3169 = (C0773.m3169("ۧܽ") + i77) * 45;
                        i = ((iM3169 ^ i76) * (-32239)) ^ 1705905887;
                        i4 = 2059996830;
                        int i9112 = iM3169 ^ i4;
                        i93 = i3;
                        i79 = i9112;
                        i78 = i;
                    } else {
                        c2361M13539 = c2361M13539;
                        i7 = i93;
                        iM2763 = i84;
                        view2 = view8;
                        i8 = i89;
                        i9 = i90;
                        i10 = i91;
                        i11 = i81;
                        i12 = iM9671;
                        editText = editText8;
                        i13 = length;
                        str = strM10047;
                        view3 = view9;
                        i14 = i86;
                        i15 = iM31616;
                        i16 = i87;
                        spannableString = spannableString7;
                        short[] sArr12 = sArr7;
                        strM5510 = strM5510;
                        textInputLayout2 = textInputLayout2;
                        i85 = i85;
                        str9 = str9;
                        editText7 = editText7;
                        view10 = view10;
                        iM31615 = iM31615;
                        sArr = sArr12;
                        iM2764 = C0619.m2761("ܶ۟") ^ i76;
                        i17 = ((iM2764 ^ i77) * (-2507)) ^ 568158182;
                        i18 = -1913622390;
                        int i1111 = iM2764 ^ i18;
                        view8 = view2;
                        iM9671 = i12;
                        i84 = iM2763;
                        i78 = i17;
                        i91 = i10;
                        i81 = i11;
                        i89 = i8;
                        i93 = i7;
                        i79 = i1111;
                        spannableString7 = spannableString;
                        i87 = i16;
                        iM31616 = i15;
                        i86 = i14;
                        view9 = view3;
                        strM10047 = str;
                        length = i13;
                        editText8 = editText;
                        i90 = i9;
                        c2361M13539 = c2361M13539;
                        int i9113 = i85;
                        textInputLayout2 = textInputLayout2;
                        strM5510 = strM5510;
                        sArr7 = sArr;
                        iM31615 = iM31615;
                        view10 = view10;
                        editText7 = editText7;
                        str9 = str9;
                        i85 = i9113;
                    }
                    break;
                case -529019368:
                case -122352473:
                    m3972();
                    break;
                case -466580210:
                case 924371922:
                    C2361 c2368 = c2361M13539;
                    int i138 = i93;
                    int i139 = i87;
                    int i140 = i89;
                    int i141 = i91;
                    SpannableString spannableString12 = spannableString7;
                    int i142 = i81;
                    int i143 = iM9671;
                    short[] sArr13 = sArr7;
                    iM31614 = C0773.m3169(C1343.m4939(sArr13, 512, 3, i92)) ^ 2102983961;
                    iM31618 = C0773.m3169(RunnableC0334.m2049(f3786, 515, 3, i92)) ^ 2102868390;
                    strM5510 = C1564.m5510(f3786, 518, 14, i92);
                    int i144 = iM31616;
                    if (i80 == i144) {
                        iM2767 = C0619.m2761("ۛ᩶") ^ i77;
                        i65 = ((iM2767 ^ i76) * (-8143)) ^ 1390098035;
                        i66 = 511380517;
                    } else {
                        iM2767 = C0619.m2761("֡ۛ") ^ i76;
                        i65 = ((iM2767 ^ i77) * 25051) ^ (-110435513);
                        i66 = -1127341455;
                    }
                    int i145 = iM2767 ^ i66;
                    iM31616 = i144;
                    sArr7 = sArr13;
                    spannableString7 = spannableString12;
                    iM9671 = i143;
                    i87 = i139;
                    i78 = i65;
                    i91 = i141;
                    c2361M13539 = c2368;
                    i79 = i145;
                    i81 = i142;
                    i89 = i140;
                    i93 = i138;
                    break;
                case -444121709:
                case 691625990:
                    spannableString3 = spannableString7;
                    i39 = i81;
                    i40 = iM9671;
                    c2362 = c2361M13539;
                    i36 = i93;
                    iM31616 = C0773.m3169(C3998.m12925(f3786, 506, 3, i92)) ^ 2103054101;
                    int iM31623 = C0773.m3169(C0773.m3166(f3786, 509, 3, i92)) ^ 2102970905;
                    sArr7 = f3786;
                    if (C3779.m12264()) {
                        int iM27616 = (C0619.m2761("ۖۚ") + i76) * 81;
                        i78 = ((iM27616 ^ i77) * (-24443)) ^ (-1236182047);
                        spannableString7 = spannableString3;
                        i93 = i36;
                        c2361M13539 = c2362;
                        i87 = iM31623;
                        i79 = iM27616 ^ 826226430;
                        i81 = i39;
                        iM9671 = i40;
                        i89 = 1;
                        i91 = 2;
                    } else {
                        i42 = iM31623;
                        sArr4 = sArr7;
                        i38 = 2;
                        i37 = 1;
                        str5 = strM5510;
                        editText3 = editText8;
                        i41 = length;
                        str6 = strM10047;
                        view6 = view9;
                        int iM27617 = (i77 - C0619.m2761("᩵᩺")) * 119;
                        int i1214 = i42;
                        int i1215 = ((iM27617 ^ i76) * 30861) ^ 164891345;
                        i85 = i85;
                        view9 = view6;
                        i81 = i39;
                        strM10047 = str6;
                        i89 = i37;
                        length = i41;
                        editText8 = editText3;
                        i93 = i36;
                        i90 = i90;
                        i79 = iM27617 ^ (-781155828);
                        c2361M13539 = c2362;
                        strM5510 = str5;
                        sArr7 = sArr4;
                        iM31615 = iM31615;
                        i78 = i1215;
                        spannableString7 = spannableString3;
                        i87 = i1214;
                        i84 = i84;
                        iM9671 = i40;
                        i91 = i38;
                    }
                    break;
                case -344263547:
                case 736428295:
                    c2365 = c2361M13539;
                    i67 = i93;
                    i68 = i87;
                    i69 = i89;
                    i70 = i91;
                    spannableString6 = spannableString7;
                    i71 = i81;
                    i72 = iM9671;
                    if (i80 == (C0619.m2761(C2375.m8069(f3786, 532, 3, i92)) ^ 2128336328)) {
                        iM31612 = C0773.m3169("ᩳ᩷") ^ i77;
                        i73 = ((iM31612 ^ i76) * 12907) ^ 1534418698;
                        i74 = -1086713240;
                    } else {
                        iM31612 = (i76 - C0773.m3169("֡ۚ")) * 21;
                        i73 = ((iM31612 ^ i77) * 24123) ^ 291049592;
                        i74 = 266925063;
                    }
                    int i1112 = iM31612 ^ i74;
                    iM9671 = i72;
                    c2361M13539 = c2365;
                    i91 = i70;
                    SpannableString spannableString13 = spannableString6;
                    i87 = i68;
                    i78 = i73;
                    i81 = i71;
                    i89 = i69;
                    i93 = i67;
                    i79 = i1112;
                    spannableString7 = spannableString13;
                    break;
                case -229496687:
                case 723607405:
                    RunnableC1848.m6363(this, new Intent(this, (Class<?>) ActivityC10358.class));
                    break;
                case -67060179:
                case 687182325:
                    c2364 = c2361M13539;
                    i54 = i93;
                    i55 = iM31615;
                    i56 = i89;
                    i57 = i90;
                    i38 = i91;
                    i58 = i81;
                    i40 = iM9671;
                    view7 = view9;
                    int i146 = i87;
                    spannableString5 = spannableString7;
                    int i147 = i86;
                    i59 = iM31616;
                    i60 = i146;
                    editText6 = (EditText) C2834.m9333(view7, i147);
                    i61 = i147;
                    sArr6 = sArr7;
                    i62 = length;
                    editText5 = (EditText) C3448.m11246(view7, C0773.m3169(C1080.m4056(f3786, 497, 3, i92)) ^ 2099442571);
                    C17617.m41267(textInputLayout4);
                    C17617.m41267(textInputLayout);
                    C2361 c2361M3798 = C0950.m3794(this);
                    C1343.m4952(c2361M3798, view7);
                    c2361M3798.m8004(new DialogInterface.OnDismissListener() { // from class: l.᩵ۖ᩻
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            ViewOnClickListenerC1057.m3978(this.f65095);
                        }
                    });
                    if (C2023.f6737) {
                        c2366 = c2361M3798;
                        int iM31624 = (i77 - C0773.m3169("᩵ۛ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i90 = i57;
                        sArr7 = sArr6;
                        c2361M13539 = c2364;
                        iM31615 = i55;
                        i78 = ((iM31624 ^ i76) * 3121) ^ 622784677;
                        length = i62;
                        editText8 = editText5;
                        spannableString7 = spannableString5;
                        i87 = i60;
                        iM31616 = i59;
                        i86 = i61;
                        view9 = view7;
                        i81 = i58;
                        i89 = i56;
                        i93 = i54;
                        i79 = iM31624 ^ 1433084936;
                    } else {
                        int iM27618 = C0619.m2761("ܳ֨") ^ i76;
                        i90 = i57;
                        sArr7 = sArr6;
                        c2361M13539 = c2364;
                        iM31615 = i55;
                        i78 = ((iM27618 ^ i77) * (-25687)) ^ (-543259438);
                        spannableString7 = spannableString5;
                        i87 = i60;
                        iM31616 = i59;
                        i86 = i61;
                        view9 = view7;
                        i81 = i58;
                        i89 = i56;
                        i93 = i54;
                        i79 = iM27618 ^ 1199169642;
                        length = i62;
                        editText8 = editText5;
                        c2366 = c2361M3798;
                    }
                    iM9671 = i40;
                    i91 = i38;
                    break;
                case 56390213:
                case 2022863715:
                    if (C3734.m12152() >= 0) {
                        iM2761 = C0619.m2761("۬֫") ^ i76;
                        i = ((iM2761 ^ i77) * 24191) ^ (-1340031762);
                        i2 = 1211136016;
                        i79 = iM2761 ^ i2;
                        i78 = i;
                    } else {
                        c2361M13539 = c2361M13539;
                        i93 = i93;
                        i89 = i89;
                        i90 = i90;
                        i91 = i91;
                        i81 = i81;
                        iM9671 = iM9671;
                        i84 = i84;
                        view8 = view8;
                        editText8 = editText8;
                        length = length;
                        strM10047 = strM10047;
                        view9 = view9;
                        i86 = i86;
                        iM31616 = iM31616;
                        i87 = i87;
                        spannableString7 = spannableString7;
                        short[] sArr14 = sArr7;
                        strM5510 = strM5510;
                        textInputLayout2 = textInputLayout2;
                        i85 = i85;
                        str9 = str9;
                        editText7 = editText7;
                        view10 = view10;
                        iM31615 = iM31615;
                        sArr = sArr14;
                        iM2762 = (C0773.m3169("֨ۛ") + i77) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i5 = ((iM2762 ^ i76) * (-26659)) ^ 907194823;
                        i6 = 252878532;
                        int i9114 = iM2762 ^ i6;
                        view8 = view8;
                        spannableString7 = spannableString7;
                        i84 = i84;
                        i87 = i87;
                        iM9671 = iM9671;
                        i91 = i91;
                        iM31616 = iM31616;
                        i86 = i86;
                        view9 = view9;
                        strM10047 = strM10047;
                        length = length;
                        editText8 = editText8;
                        i90 = i90;
                        c2361M13539 = c2361M13539;
                        int i9115 = i93;
                        i79 = i9114;
                        i78 = i5;
                        i81 = i81;
                        i89 = i89;
                        i93 = i9115;
                        int i9116 = i85;
                        textInputLayout2 = textInputLayout2;
                        strM5510 = strM5510;
                        sArr7 = sArr;
                        iM31615 = iM31615;
                        view10 = view10;
                        editText7 = editText7;
                        str9 = str9;
                        i85 = i9116;
                    }
                    break;
                case 108703887:
                case 286868544:
                    if (C3448.f11240 < 0) {
                        c2363 = c2361M13539;
                        i36 = i93;
                        i44 = iM31615;
                        i37 = i89;
                        i47 = i90;
                        i48 = i91;
                        sArr5 = sArr7;
                        i39 = i81;
                        i49 = iM9671;
                        str8 = strM5510;
                        editText4 = editText8;
                        i50 = length;
                        str7 = strM10047;
                        int i1013 = i87;
                        spannableString4 = spannableString7;
                        viewM2812 = view9;
                        i43 = i86;
                        i45 = iM31616;
                        i46 = i1013;
                        iM2765 = C0773.m3169("᩹᩺") ^ i76;
                        i51 = ((iM2765 ^ i77) * 29753) ^ (-1760794403);
                        i52 = 144142514;
                        i53 = iM2765 ^ i52;
                        strM10047 = str7;
                        length = i50;
                        editText8 = editText4;
                        strM5510 = str8;
                        i90 = i47;
                        sArr7 = sArr5;
                        c2361M13539 = c2363;
                        iM31615 = i44;
                        i78 = i51;
                        iM9671 = i49;
                        i91 = i48;
                        int i1014 = i43;
                        view9 = viewM2812;
                        spannableString7 = spannableString4;
                        i87 = i46;
                        iM31616 = i45;
                        i86 = i1014;
                        int i1015 = i36;
                        i79 = i53;
                        i81 = i39;
                        i89 = i37;
                        i93 = i1015;
                    } else {
                        iM2761 = (i76 - C0773.m3169("ۗۨ")) * 75;
                        i = ((iM2761 ^ i77) * (-32245)) ^ (-1514636504);
                        i2 = 989571131;
                        i79 = iM2761 ^ i2;
                        i78 = i;
                    }
                    break;
                case 114597119:
                case 1945638076:
                    new C13042(this).m32469();
                    break;
                case 142332839:
                case 939470207:
                    i3 = i93;
                    if (i80 == (C0773.m3169(RunnableC3055.m9937(f3786, 569, 3, i92)) ^ 2120751915)) {
                        iM3169 = C0773.m3169("ۙܰ") ^ i76;
                        i = ((iM3169 ^ i77) * (-7671)) ^ (-1574960703);
                        i4 = -1845505628;
                    } else {
                        iM3169 = (C0619.m2761("᩹۟") + i77) * (-67);
                        i = ((iM3169 ^ i76) * (-8743)) ^ (-1202570965);
                        i4 = 2083760808;
                    }
                    int i9117 = iM3169 ^ i4;
                    i93 = i3;
                    i79 = i9117;
                    i78 = i;
                    break;
                case 168355679:
                case 933119758:
                    break;
                case 180581163:
                case 208299320:
                    c2361 = c2361M13539;
                    i21 = i93;
                    i22 = iM31615;
                    i23 = i89;
                    i24 = i90;
                    i25 = i91;
                    sArr2 = sArr7;
                    i26 = i81;
                    i27 = iM9671;
                    str2 = strM5510;
                    i28 = i84;
                    i29 = i85;
                    view4 = view8;
                    editText2 = editText8;
                    i30 = length;
                    str3 = str9;
                    str4 = strM10047;
                    view5 = view9;
                    i31 = i86;
                    i32 = iM31616;
                    i33 = i87;
                    spannableString2 = spannableString7;
                    View viewM9943 = RunnableC3055.m9942(this, C0619.m2761(RunnableC1848.m6366(f3786, 473, 3, i92)) ^ 2124125975);
                    View viewM9335 = C2834.m9333(viewM9943, i29);
                    C2310.m7811(viewM9335, str4);
                    textInputLayout2 = (TextInputLayout) viewM9335;
                    editText7 = (EditText) C3448.m11246(viewM9943, i28);
                    if (C2310.m7813() <= 0) {
                        view10 = viewM9943;
                        iM31611 = (C0619.m2761("᩷᩸") ^ i77) * 81;
                        i34 = ((iM31611 ^ i76) * 16515) ^ 1285137290;
                        i35 = 1088577165;
                        int i1016 = iM31611 ^ i35;
                        view8 = view4;
                        str9 = str3;
                        i85 = i29;
                        i84 = i28;
                        i81 = i26;
                        iM9671 = i27;
                        i91 = i25;
                        i89 = i23;
                        i93 = i21;
                        i79 = i1016;
                        spannableString7 = spannableString2;
                        i87 = i33;
                        iM31616 = i32;
                        i86 = i31;
                        view9 = view5;
                        strM10047 = str4;
                        length = i30;
                        editText8 = editText2;
                        i90 = i24;
                        c2361M13539 = c2361;
                        sArr3 = sArr2;
                        iM31615 = i22;
                        i78 = i34;
                    } else {
                        int iM27619 = (i76 - C0619.m2761("ۛۨ")) * 27;
                        view10 = viewM9943;
                        view8 = view4;
                        spannableString7 = spannableString2;
                        i84 = i28;
                        i87 = i33;
                        iM9671 = i27;
                        i91 = i25;
                        iM31616 = i32;
                        i86 = i31;
                        view9 = view5;
                        strM10047 = str4;
                        length = i30;
                        editText8 = editText2;
                        i90 = i24;
                        c2361M13539 = c2361;
                        sArr3 = sArr2;
                        iM31615 = i22;
                        i78 = ((iM27619 ^ i77) * (-5575)) ^ 1919283104;
                        str9 = str3;
                        i85 = i29;
                        i81 = i26;
                        i89 = i23;
                        i93 = i21;
                        i79 = iM27619 ^ 761578734;
                    }
                    strM5510 = str2;
                    sArr7 = sArr3;
                    break;
                case 238687832:
                case 1329538100:
                    final EditText editText14 = (EditText) viewM9333;
                    C17617.m41267(textInputLayout3);
                    C2361 c2361M3799 = C0950.m3794(this);
                    View view16 = view8;
                    C1343.m4952(c2361M3799, view16);
                    final DialogInterfaceC8327 dialogInterfaceC8327M4861 = C1321.m4860(c2361M3799);
                    C21576.m49090(editText14);
                    View viewM9336 = C2834.m9333(view16, iM31615);
                    final int i148 = 0;
                    final TextInputLayout textInputLayout8 = textInputLayout3;
                    C11235.m28299(viewM9336, new View.OnClickListener() { // from class: l.ۗۖ᩻
                        {
                            int i149 = 195184801;
                            int i150 = C2702.f8586;
                            int i151 = C1519.f5300;
                            int iM27620 = (i150 - C0619.m2761("ᩴۧ")) * 93;
                            int i152 = ((iM27620 ^ i151) * (-14207)) ^ (-1784131699);
                            int i153 = -193273945;
                            while (true) {
                                i149 = (iM27620 ^ i153) ^ (i152 & (((i149 ^ i151) * 22905) >> 31));
                                switch (i149) {
                                    case -1768307728:
                                    case 1294175010:
                                        C1321.m4852();
                                        AbstractC3624.m11755();
                                        iM27620 = C0773.m3169("᩸֨") ^ i150;
                                        i152 = ((iM27620 ^ i151) * 17379) ^ 640965114;
                                        i153 = 462953598;
                                        break;
                                    case -1150870878:
                                    case 698750741:
                                        if (C1564.f5401 <= 0) {
                                            iM27620 = C0619.m2761("ܺ᩷") ^ i151;
                                            i152 = ((iM27620 ^ i150) * (-2511)) ^ 1038151348;
                                            i153 = -883935384;
                                        } else {
                                            iM27620 = C0619.m2761("۠۬") ^ i151;
                                            i152 = ((iM27620 ^ i150) * (-15189)) ^ (-813293540);
                                            i153 = 737200984;
                                        }
                                        break;
                                    case 63192599:
                                    case 1421552769:
                                        if (C3998.f13671 != 0) {
                                            iM27620 = C0619.m2761("᩺᩸") ^ i150;
                                            i152 = ((iM27620 ^ i151) * 6003) ^ (-1217197338);
                                            i153 = 847885606;
                                        } else {
                                            iM27620 = C0773.m3169("᩸֨") ^ i150;
                                            i152 = ((iM27620 ^ i151) * 17379) ^ 640965114;
                                            i153 = 462953598;
                                        }
                                        break;
                                    case 338582826:
                                    case 1834086912:
                                        if (C3099.m10095()) {
                                            iM27620 = C0619.m2761("۟ܳ") ^ i150;
                                            i152 = ((iM27620 ^ i151) * (-32505)) ^ (-1959003241);
                                            i153 = 483727113;
                                        } else {
                                            iM27620 = C0619.m2761("᩺᩸") ^ i150;
                                            i152 = ((iM27620 ^ i151) * 6003) ^ (-1217197338);
                                            i153 = 847885606;
                                        }
                                        break;
                                    case 1408614898:
                                    case 1991386801:
                                        C3690.m11987();
                                        throw new RuntimeException();
                                    case 1512857765:
                                    case 2061770148:
                                        if (C23916.f77426 <= 0) {
                                            iM27620 = C0773.m3169("᩸֨") ^ i150;
                                            i152 = ((iM27620 ^ i151) * 17379) ^ 640965114;
                                            i153 = 462953598;
                                        } else {
                                            iM27620 = C0773.m3169("֡᩵") ^ i151;
                                            i152 = ((iM27620 ^ i150) * (-10697)) ^ 1855312963;
                                            i153 = -1839344663;
                                        }
                                        break;
                                    default:
                                        return;
                                }
                            }
                        }

                        /* JADX WARN: Code duplicated, block: B:50:0x01a7 A[PHI: r6 r7 r8 r9 r10 r11 r15
                          0x01a7: PHI (r6v5 l.ۡۤۧ) = (r6v4 l.ۡۤۧ), (r6v2 l.ۡۤۧ), (r6v2 l.ۡۤۧ), (r6v2 l.ۡۤۧ), (r6v2 l.ۡۤۧ), (r6v2 l.ۡۤۧ) binds: [B:49:0x01a5, B:45:0x0183, B:41:0x0161, B:21:0x00a6, B:16:0x0085, B:14:0x0081] A[DONT_GENERATE, DONT_INLINE]
                          0x01a7: PHI (r7v4 android.view.View) = 
                          (r7v3 android.view.View)
                          (r7v2 android.view.View)
                          (r7v2 android.view.View)
                          (r7v2 android.view.View)
                          (r7v2 android.view.View)
                          (r7v2 android.view.View)
                         binds: [B:49:0x01a5, B:45:0x0183, B:41:0x0161, B:21:0x00a6, B:16:0x0085, B:14:0x0081] A[DONT_GENERATE, DONT_INLINE]
                          0x01a7: PHI (r8v5 android.widget.ImageView) = 
                          (r8v2 android.widget.ImageView)
                          (r8v4 android.widget.ImageView)
                          (r8v2 android.widget.ImageView)
                          (r8v2 android.widget.ImageView)
                          (r8v2 android.widget.ImageView)
                          (r8v2 android.widget.ImageView)
                         binds: [B:49:0x01a5, B:45:0x0183, B:41:0x0161, B:21:0x00a6, B:16:0x0085, B:14:0x0081] A[DONT_GENERATE, DONT_INLINE]
                          0x01a7: PHI (r9v4 java.lang.Object) = 
                          (r9v2 java.lang.Object)
                          (r9v3 java.lang.Object)
                          (r9v2 java.lang.Object)
                          (r9v2 java.lang.Object)
                          (r9v2 java.lang.Object)
                          (r9v2 java.lang.Object)
                         binds: [B:49:0x01a5, B:45:0x0183, B:41:0x0161, B:21:0x00a6, B:16:0x0085, B:14:0x0081] A[DONT_GENERATE, DONT_INLINE]
                          0x01a7: PHI (r10v5 l.ᩴ᩸ۧ) = (r10v2 l.ᩴ᩸ۧ), (r10v2 l.ᩴ᩸ۧ), (r10v4 l.ᩴ᩸ۧ), (r10v2 l.ᩴ᩸ۧ), (r10v2 l.ᩴ᩸ۧ), (r10v2 l.ᩴ᩸ۧ) binds: [B:49:0x01a5, B:45:0x0183, B:41:0x0161, B:21:0x00a6, B:16:0x0085, B:14:0x0081] A[DONT_GENERATE, DONT_INLINE]
                          0x01a7: PHI (r11v5 l.۬ۖ᩹) = (r11v2 l.۬ۖ᩹), (r11v2 l.۬ۖ᩹), (r11v4 l.۬ۖ᩹), (r11v2 l.۬ۖ᩹), (r11v2 l.۬ۖ᩹), (r11v2 l.۬ۖ᩹) binds: [B:49:0x01a5, B:45:0x0183, B:41:0x0161, B:21:0x00a6, B:16:0x0085, B:14:0x0081] A[DONT_GENERATE, DONT_INLINE]
                          0x01a7: PHI (r15v5 l.۠ۖۧ) = (r15v2 l.۠ۖۧ), (r15v2 l.۠ۖۧ), (r15v2 l.۠ۖۧ), (r15v4 l.۠ۖۧ), (r15v2 l.۠ۖۧ), (r15v2 l.۠ۖۧ) binds: [B:49:0x01a5, B:45:0x0183, B:41:0x0161, B:21:0x00a6, B:16:0x0085, B:14:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:55:0x01f9 A[PHI: r4 r5 r14
                          0x01f9: PHI (r4v5 com.google.android.material.textfield.TextInputLayout) = 
                          (r4v4 com.google.android.material.textfield.TextInputLayout)
                          (r4v2 com.google.android.material.textfield.TextInputLayout)
                          (r4v2 com.google.android.material.textfield.TextInputLayout)
                          (r4v2 com.google.android.material.textfield.TextInputLayout)
                          (r4v2 com.google.android.material.textfield.TextInputLayout)
                         binds: [B:54:0x01f7, B:29:0x00ee, B:14:0x0081, B:10:0x0062, B:7:0x005c] A[DONT_GENERATE, DONT_INLINE]
                          0x01f9: PHI (r5v4 java.lang.Object) = 
                          (r5v3 java.lang.Object)
                          (r5v2 java.lang.Object)
                          (r5v2 java.lang.Object)
                          (r5v2 java.lang.Object)
                          (r5v2 java.lang.Object)
                         binds: [B:54:0x01f7, B:29:0x00ee, B:14:0x0081, B:10:0x0062, B:7:0x005c] A[DONT_GENERATE, DONT_INLINE]
                          0x01f9: PHI (r14v4 l.֨ۤۧ) = (r14v2 l.֨ۤۧ), (r14v3 l.֨ۤۧ), (r14v2 l.֨ۤۧ), (r14v2 l.֨ۤۧ), (r14v2 l.֨ۤۧ) binds: [B:54:0x01f7, B:29:0x00ee, B:14:0x0081, B:10:0x0062, B:7:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:60:0x022f A[PHI: r12 r13 r20
                          0x022f: PHI (r12v6 android.widget.ImageView) = (r12v4 android.widget.ImageView), (r12v2 android.widget.ImageView), (r12v2 android.widget.ImageView) binds: [B:37:0x0139, B:33:0x0115, B:59:0x022d] A[DONT_GENERATE, DONT_INLINE]
                          0x022f: PHI (r13v5 int) = (r13v2 int), (r13v3 int), (r13v2 int) binds: [B:37:0x0139, B:33:0x0115, B:59:0x022d] A[DONT_GENERATE, DONT_INLINE]
                          0x022f: PHI (r20v5 android.view.View) = (r20v3 android.view.View), (r20v3 android.view.View), (r20v7 android.view.View) binds: [B:37:0x0139, B:33:0x0115, B:59:0x022d] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:64:0x026e A[PHI: r2
                          0x026e: PHI (r2v5 l.֨۠᩻) = (r2v4 l.֨۠᩻), (r2v2 l.֨۠᩻) binds: [B:63:0x026c, B:7:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view17) {
                            int iM27620;
                            int i149;
                            int i150;
                            int i151 = C1080.f3865;
                            int i152 = C2310.f7472;
                            int iM27621 = (C0619.m2761("ۡ۫") + i152) * 67;
                            int i153 = ((iM27621 ^ i151) * (-21483)) ^ (-1747667119);
                            View view18 = null;
                            ImageView imageView = null;
                            DialogInterfaceC8327 dialogInterfaceC8327 = null;
                            int i154 = iM27621 ^ (-10004983);
                            ViewOnClickListenerC1057 viewOnClickListenerC1057 = null;
                            int i155 = -1634596148;
                            C13558 c13558 = null;
                            EnumC1110 enumC1110 = null;
                            int defaultColor = 0;
                            InterfaceC20106 interfaceC20106 = null;
                            Object obj = null;
                            ImageView imageView2 = null;
                            View view19 = null;
                            C9312 c9312 = null;
                            Object obj2 = null;
                            TextInputLayout textInputLayout9 = null;
                            while (true) {
                                i155 = i154 ^ (i153 & (((i155 ^ i151) * 14357) >> 31));
                                switch (i155) {
                                    case -2144481191:
                                    case -1624130616:
                                        interfaceC20106 = (InterfaceC20106) obj;
                                        c13558 = (C13558) dialogInterfaceC8327M4861;
                                        if (C3077.m10041()) {
                                            iM27620 = (i152 - C0619.m2761("ۘ᩺")) * 123;
                                            i149 = ((iM27620 ^ i151) * 1279) ^ 365775419;
                                            i150 = -613340985;
                                        } else {
                                            iM27620 = (C0773.m3169("ܶܿ") ^ i152) * 67;
                                            i149 = ((iM27620 ^ i151) * (-20871)) ^ (-2054750855);
                                            i150 = 3328180;
                                        }
                                        i154 = iM27620 ^ i150;
                                        i153 = i149;
                                        break;
                                    case -2133967532:
                                    case 2060584543:
                                        break;
                                    case -1907409113:
                                    case -11893320:
                                        enumC1110 = EnumC1110.IMMUTABLE;
                                        c9312.f30254 = defaultColor;
                                        if (RunnableC3646.f12471) {
                                            iM27620 = (C0619.m2761("۠ۧ") + i151) * 27;
                                            i149 = ((iM27620 ^ i152) * (-30761)) ^ (-670360895);
                                            i150 = 1572114020;
                                        } else {
                                            iM27620 = C0619.m2761("᩷۫") ^ i151;
                                            i149 = ((iM27620 ^ i152) * 30071) ^ (-1440339568);
                                            i150 = -318997247;
                                        }
                                        i154 = iM27620 ^ i150;
                                        i153 = i149;
                                        break;
                                    case -1827680543:
                                    case 1638511175:
                                        textInputLayout9 = (TextInputLayout) view18;
                                        obj2 = editText14;
                                        if (C3033.m9845() <= 0) {
                                            iM27620 = (C0619.m2761("۠ۧ") + i151) * 27;
                                            i149 = ((iM27620 ^ i152) * (-30761)) ^ (-670360895);
                                            i150 = 1572114020;
                                        } else {
                                            iM27620 = C0619.m2761("֨᩻") ^ i152;
                                            i149 = ((iM27620 ^ i151) * 25945) ^ (-124275564);
                                            i150 = -775358599;
                                        }
                                        i154 = iM27620 ^ i150;
                                        i153 = i149;
                                        break;
                                    case -1823369205:
                                    case -673954868:
                                        dialogInterfaceC8327.m22431(false);
                                        iM27620 = C0619.m2761("֨ܿ") ^ i152;
                                        i149 = ((iM27620 ^ i151) * (-23361)) ^ (-1748635055);
                                        i150 = 1459388570;
                                        i154 = iM27620 ^ i150;
                                        i153 = i149;
                                        break;
                                    case -1745759251:
                                    case 720275879:
                                        View view20 = textInputLayout8;
                                        if (C2288.f7433 <= 0) {
                                            view18 = view20;
                                            iM27620 = C0773.m3169("֡۠") ^ i151;
                                            i149 = ((iM27620 ^ i152) * 18309) ^ 896500457;
                                            i150 = -902110439;
                                            i154 = iM27620 ^ i150;
                                            i153 = i149;
                                        } else {
                                            int iM27622 = (C0619.m2761("᩷ۚ") ^ i151) * 35;
                                            i153 = ((iM27622 ^ i152) * (-12459)) ^ 1528483646;
                                            view18 = view20;
                                            i154 = iM27622 ^ 1842491520;
                                        }
                                        break;
                                    case -1485313109:
                                    case -69950057:
                                        c13558.m33269();
                                        dialogInterfaceC8327 = (DialogInterfaceC8327) c13558.mo2556();
                                        if (C1564.f5401 <= 0) {
                                            iM27620 = (i152 - C0619.m2761("ۘ᩺")) * 123;
                                            i149 = ((iM27620 ^ i151) * 1279) ^ 365775419;
                                            i150 = -613340985;
                                        } else {
                                            iM27620 = (C0619.m2761("ۡۖ") + i151) * (-107);
                                            i149 = ((iM27620 ^ i152) * (-5743)) ^ (-1367602337);
                                            i150 = -1677069427;
                                        }
                                        i154 = iM27620 ^ i150;
                                        i153 = i149;
                                        break;
                                    case -1437877531:
                                    case 258401284:
                                        imageView = (ImageView) view17;
                                        if (C0487.m2356() >= 0) {
                                            iM27620 = C0773.m3169("֡۠") ^ i151;
                                            i149 = ((iM27620 ^ i152) * 18309) ^ 896500457;
                                            i150 = -902110439;
                                        } else {
                                            iM27620 = (C0773.m3169("ۨ۠") + i151) * 23;
                                            i149 = ((iM27620 ^ i152) * (-31487)) ^ 159625290;
                                            i150 = -1422642501;
                                        }
                                        i154 = iM27620 ^ i150;
                                        i153 = i149;
                                        break;
                                    case -1368884835:
                                    case 2053340001:
                                        C2966.m9664();
                                        if (C2419.f7754 >= 0) {
                                            iM27620 = (i152 - C0619.m2761("ۘ᩺")) * 123;
                                            i149 = ((iM27620 ^ i151) * 1279) ^ 365775419;
                                            i150 = -613340985;
                                        } else {
                                            iM27620 = (C0619.m2761("۠ۧ") + i151) * 27;
                                            i149 = ((iM27620 ^ i152) * (-30761)) ^ (-670360895);
                                            i150 = 1572114020;
                                        }
                                        i154 = iM27620 ^ i150;
                                        i153 = i149;
                                        break;
                                    case -1206369186:
                                    case 932778173:
                                        c9312.f30255 = enumC1110;
                                        imageView2.setImageBitmap(interfaceC20106.mo21304(c9312));
                                        if (c13558.mo14758()) {
                                            iM27620 = C0773.m3169("᩷ܶ") ^ i152;
                                            i149 = ((iM27620 ^ i151) * 841) ^ (-2000821470);
                                            i150 = 770020689;
                                        } else {
                                            iM27620 = C0619.m2761("֨ܿ") ^ i152;
                                            i149 = ((iM27620 ^ i151) * (-23361)) ^ (-1748635055);
                                            i150 = 1459388570;
                                        }
                                        i154 = iM27620 ^ i150;
                                        i153 = i149;
                                        break;
                                    case -1010287320:
                                    case 126329024:
                                        imageView2 = (ImageView) view19;
                                        obj = editText14;
                                        if (C0619.f2439) {
                                            iM27620 = (i152 - C0619.m2761("ۘ᩺")) * 123;
                                            i149 = ((iM27620 ^ i151) * 1279) ^ 365775419;
                                            i150 = -613340985;
                                        } else {
                                            iM27620 = C0773.m3169("۠۠") ^ i151;
                                            i149 = ((iM27620 ^ i152) * 30905) ^ 566287224;
                                            i150 = 1146564896;
                                        }
                                        i154 = iM27620 ^ i150;
                                        i153 = i149;
                                        break;
                                    case -777425191:
                                    case -101111344:
                                        c9312 = (C9312) this;
                                        view19 = textInputLayout8;
                                        if (C1343.f4799 != 0) {
                                            iM27620 = (i152 - C0619.m2761("ۘ᩺")) * 123;
                                            i149 = ((iM27620 ^ i151) * 1279) ^ 365775419;
                                            i150 = -613340985;
                                        } else {
                                            iM27620 = (i151 - C0773.m3169("ᩳ᩻")) * (-41);
                                            i149 = ((iM27620 ^ i152) * (-25253)) ^ (-558594101);
                                            i150 = -626785472;
                                        }
                                        i154 = iM27620 ^ i150;
                                        i153 = i149;
                                        break;
                                    case -516500758:
                                    case 854188842:
                                        C1343.m4943();
                                        C2375.m8065();
                                        break;
                                    case -403902828:
                                    case 1076998661:
                                        viewOnClickListenerC1057 = (ViewOnClickListenerC1057) this;
                                        if (C3734.f12817 >= 0) {
                                            iM27620 = (i152 - C0773.m3169("ܿ᩹")) * 83;
                                            i149 = ((iM27620 ^ i151) * (-22957)) ^ (-1460404126);
                                            i150 = 2109726821;
                                        } else {
                                            iM27620 = (i151 - C0773.m3169("֫ۤ")) * (-101);
                                            i149 = ((iM27620 ^ i152) * (-3313)) ^ 1445956478;
                                            i150 = -417983688;
                                        }
                                        i154 = iM27620 ^ i150;
                                        i153 = i149;
                                        break;
                                    case -264912576:
                                    case 2133489700:
                                        switch (i148) {
                                            case 0:
                                                iM27620 = (C0619.m2761("᩸ۧ") + i152) * 99;
                                                i149 = ((iM27620 ^ i151) * (-1895)) ^ (-594995551);
                                                i150 = 829862348;
                                                break;
                                            default:
                                                iM27620 = (C0619.m2761("᩹᩹") ^ i152) * (-37);
                                                i149 = ((iM27620 ^ i151) * 10755) ^ (-1890634680);
                                                i150 = -216517805;
                                                break;
                                        }
                                        i154 = iM27620 ^ i150;
                                        i153 = i149;
                                        break;
                                    case -241871704:
                                    case 493984667:
                                        ColorStateList imageTintList = imageView.getImageTintList();
                                        C1321.m4848(imageTintList);
                                        defaultColor = imageTintList.getDefaultColor();
                                        if (C0487.f2131 <= 0) {
                                            iM27620 = C0773.m3169("֡۠") ^ i151;
                                            i149 = ((iM27620 ^ i152) * 18309) ^ 896500457;
                                            i150 = -902110439;
                                        } else {
                                            iM27620 = (C0773.m3169("᩸ۛ") ^ i152) * (-61);
                                            i149 = ((iM27620 ^ i151) * 28253) ^ (-1615665807);
                                            i150 = 151848854;
                                        }
                                        i154 = iM27620 ^ i150;
                                        i153 = i149;
                                        break;
                                    case -47277195:
                                    case 207070216:
                                        if (C2878.f9462) {
                                            iM27620 = C0619.m2761("ۢܿ") ^ i151;
                                            i149 = ((iM27620 ^ i152) * 28737) ^ (-1896673584);
                                            i150 = 1963914216;
                                        } else {
                                            iM27620 = (C0619.m2761("۠ۧ") + i151) * 27;
                                            i149 = ((iM27620 ^ i152) * (-30761)) ^ (-670360895);
                                            i150 = 1572114020;
                                        }
                                        i154 = iM27620 ^ i150;
                                        i153 = i149;
                                        break;
                                    case 291242158:
                                    case 1568966625:
                                        if (C0773.f2792 <= 0) {
                                            iM27620 = (C0619.m2761("۠ۧ") + i151) * 27;
                                            i149 = ((iM27620 ^ i152) * (-30761)) ^ (-670360895);
                                            i150 = 1572114020;
                                        } else {
                                            iM27620 = (i152 - C0773.m3169("ܿ᩹")) * 83;
                                            i149 = ((iM27620 ^ i151) * (-22957)) ^ (-1460404126);
                                            i150 = 2109726821;
                                        }
                                        i154 = iM27620 ^ i150;
                                        i153 = i149;
                                        break;
                                    case 1548882212:
                                    case 2119618897:
                                        C4282.m13644();
                                        C0773.m3161();
                                        iM27620 = (i152 - C0619.m2761("ۘ᩺")) * 123;
                                        i149 = ((iM27620 ^ i151) * 1279) ^ 365775419;
                                        i150 = -613340985;
                                        i154 = iM27620 ^ i150;
                                        i153 = i149;
                                        break;
                                    default:
                                        ViewOnClickListenerC1057.m3965((EditText) obj2, (DialogInterfaceC8327) dialogInterfaceC8327M4861, viewOnClickListenerC1057, textInputLayout9);
                                        iM27620 = C0619.m2761("֨ܿ") ^ i152;
                                        i149 = ((iM27620 ^ i151) * (-23361)) ^ (-1748635055);
                                        i150 = 1459388570;
                                        i154 = iM27620 ^ i150;
                                        i153 = i149;
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    break;
                case 294449579:
                case 693946945:
                    RunnableC3055.m9933();
                    break;
                case 429618931:
                case 1522677930:
                    sArr = sArr7;
                    i92 = 43647;
                    iM2762 = C0773.m3169("ۗ۫") ^ i76;
                    i5 = ((iM2762 ^ i77) * (-7251)) ^ 1313413369;
                    i6 = -395846983;
                    int i9118 = iM2762 ^ i6;
                    view8 = view8;
                    spannableString7 = spannableString7;
                    i84 = i84;
                    i87 = i87;
                    iM9671 = iM9671;
                    i91 = i91;
                    iM31616 = iM31616;
                    i86 = i86;
                    view9 = view9;
                    strM10047 = strM10047;
                    length = length;
                    editText8 = editText8;
                    i90 = i90;
                    c2361M13539 = c2361M13539;
                    int i9119 = i93;
                    i79 = i9118;
                    i78 = i5;
                    i81 = i81;
                    i89 = i89;
                    i93 = i9119;
                    int i91110 = i85;
                    textInputLayout2 = textInputLayout2;
                    strM5510 = strM5510;
                    sArr7 = sArr;
                    iM31615 = iM31615;
                    view10 = view10;
                    editText7 = editText7;
                    str9 = str9;
                    i85 = i91110;
                    break;
                case 450560207:
                case 1193789429:
                    if (C11235.m28309() == 0) {
                        c2361M13539 = c2361M13539;
                        i93 = i93;
                        i89 = i89;
                        i90 = i90;
                        i91 = i91;
                        i81 = i81;
                        iM9671 = iM9671;
                        i84 = i84;
                        view8 = view8;
                        editText8 = editText8;
                        length = length;
                        strM10047 = strM10047;
                        view9 = view9;
                        i86 = i86;
                        iM31616 = iM31616;
                        i87 = i87;
                        spannableString7 = spannableString7;
                        short[] sArr15 = sArr7;
                        strM5510 = strM5510;
                        textInputLayout2 = textInputLayout2;
                        i85 = i85;
                        str9 = str9;
                        editText7 = editText7;
                        view10 = view10;
                        iM31615 = iM31615;
                        sArr = sArr15;
                        iM2762 = (C0773.m3169("֨ۛ") + i77) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i5 = ((iM2762 ^ i76) * (-26659)) ^ 907194823;
                        i6 = 252878532;
                        int i91111 = iM2762 ^ i6;
                        view8 = view8;
                        spannableString7 = spannableString7;
                        i84 = i84;
                        i87 = i87;
                        iM9671 = iM9671;
                        i91 = i91;
                        iM31616 = iM31616;
                        i86 = i86;
                        view9 = view9;
                        strM10047 = strM10047;
                        length = length;
                        editText8 = editText8;
                        i90 = i90;
                        c2361M13539 = c2361M13539;
                        int i91112 = i93;
                        i79 = i91111;
                        i78 = i5;
                        i81 = i81;
                        i89 = i89;
                        i93 = i91112;
                        int i91113 = i85;
                        textInputLayout2 = textInputLayout2;
                        strM5510 = strM5510;
                        sArr7 = sArr;
                        iM31615 = iM31615;
                        view10 = view10;
                        editText7 = editText7;
                        str9 = str9;
                        i85 = i91113;
                    } else {
                        iM2761 = (C0619.m2761("ۢۖ") + i76) * (-39);
                        i = ((iM2761 ^ i77) * 13951) ^ (-1453496995);
                        i2 = -373923125;
                        i79 = iM2761 ^ i2;
                        i78 = i;
                    }
                    break;
                case 529356471:
                case 1795722454:
                    C2966.m9668(C0773.m3169(C2878.m9486(f3786, GF16Utils.GF16_MASK, 3, i92)) ^ 2120168338);
                    break;
                case 998086007:
                case 1908672297:
                    c2361 = c2361M13539;
                    i21 = i93;
                    i22 = iM31615;
                    i23 = i89;
                    i24 = i90;
                    i25 = i91;
                    sArr2 = sArr7;
                    i26 = i81;
                    i27 = iM9671;
                    str2 = strM5510;
                    i28 = i84;
                    i29 = i85;
                    editText2 = editText8;
                    i30 = length;
                    str4 = strM10047;
                    view5 = view9;
                    i31 = i86;
                    i32 = iM31616;
                    i33 = i87;
                    spannableString2 = spannableString7;
                    view4 = view8;
                    str3 = str9;
                    if (i80 == (C0773.m3169(C1146.m4222(f3786, 479, 3, i92)) ^ 2100590901)) {
                        iM31611 = (i76 - C0773.m3169("ܰۗ")) * (-93);
                        i34 = ((iM31611 ^ i77) * (-17335)) ^ 1450517418;
                        i35 = -203182756;
                    } else {
                        iM31611 = (C0773.m3169("ܰ۬") ^ i77) * (-47);
                        i34 = ((iM31611 ^ i76) * 18421) ^ 662666555;
                        i35 = -824540788;
                    }
                    int i1017 = iM31611 ^ i35;
                    view8 = view4;
                    str9 = str3;
                    i85 = i29;
                    i84 = i28;
                    i81 = i26;
                    iM9671 = i27;
                    i91 = i25;
                    i89 = i23;
                    i93 = i21;
                    i79 = i1017;
                    spannableString7 = spannableString2;
                    i87 = i33;
                    iM31616 = i32;
                    i86 = i31;
                    view9 = view5;
                    strM10047 = str4;
                    length = i30;
                    editText8 = editText2;
                    i90 = i24;
                    c2361M13539 = c2361;
                    sArr3 = sArr2;
                    iM31615 = i22;
                    i78 = i34;
                    strM5510 = str2;
                    sArr7 = sArr3;
                    break;
                case 1151933505:
                case 1510742826:
                    sArr = sArr7;
                    i92 = 11988;
                    iM2762 = C0773.m3169("ۗ۫") ^ i76;
                    i5 = ((iM2762 ^ i77) * (-7251)) ^ 1313413369;
                    i6 = -395846983;
                    int i91114 = iM2762 ^ i6;
                    view8 = view8;
                    spannableString7 = spannableString7;
                    i84 = i84;
                    i87 = i87;
                    iM9671 = iM9671;
                    i91 = i91;
                    iM31616 = iM31616;
                    i86 = i86;
                    view9 = view9;
                    strM10047 = strM10047;
                    length = length;
                    editText8 = editText8;
                    i90 = i90;
                    c2361M13539 = c2361M13539;
                    int i91115 = i93;
                    i79 = i91114;
                    i78 = i5;
                    i81 = i81;
                    i89 = i89;
                    i93 = i91115;
                    int i91116 = i85;
                    textInputLayout2 = textInputLayout2;
                    strM5510 = strM5510;
                    sArr7 = sArr;
                    iM31615 = iM31615;
                    view10 = view10;
                    editText7 = editText7;
                    str9 = str9;
                    i85 = i91116;
                    break;
                case 1234643250:
                case 1768719688:
                    c2365 = c2361M13539;
                    i67 = i93;
                    i68 = i87;
                    i69 = i89;
                    i70 = i91;
                    spannableString6 = spannableString7;
                    i71 = i81;
                    i72 = iM9671;
                    str9 = null;
                    if (i80 == (C0619.m2761(C2310.m7803(f3786, 537, 3, i92)) ^ 2122806918)) {
                        iM31612 = (C0619.m2761("᩸ܳ") + i77) * 11;
                        i73 = ((iM31612 ^ i76) * (-23333)) ^ 1063909235;
                        i74 = -832456373;
                    } else {
                        iM31612 = (C0619.m2761("᩻ۤ") + i77) * (-27);
                        i73 = ((iM31612 ^ i76) * 12179) ^ 1764358024;
                        i74 = -1423237193;
                    }
                    int i1113 = iM31612 ^ i74;
                    iM9671 = i72;
                    c2361M13539 = c2365;
                    i91 = i70;
                    SpannableString spannableString14 = spannableString6;
                    i87 = i68;
                    i78 = i73;
                    i81 = i71;
                    i89 = i69;
                    i93 = i67;
                    i79 = i1113;
                    spannableString7 = spannableString14;
                    break;
                case 1556813485:
                case 1990866557:
                    if (!C3099.m10095()) {
                        c2361M13539 = c2361M13539;
                        i7 = i93;
                        iM2763 = i84;
                        view2 = view8;
                        i8 = i89;
                        i9 = i90;
                        i10 = i91;
                        i11 = i81;
                        i12 = iM9671;
                        editText = editText8;
                        i13 = length;
                        str = strM10047;
                        view3 = view9;
                        i14 = i86;
                        i15 = iM31616;
                        i16 = i87;
                        spannableString = spannableString7;
                        short[] sArr16 = sArr7;
                        strM5510 = strM5510;
                        textInputLayout2 = textInputLayout2;
                        i85 = i85;
                        str9 = str9;
                        editText7 = editText7;
                        view10 = view10;
                        iM31615 = iM31615;
                        sArr = sArr16;
                        iM2764 = C0619.m2761("ܶ۟") ^ i76;
                        i17 = ((iM2764 ^ i77) * (-2507)) ^ 568158182;
                        i18 = -1913622390;
                        int i1114 = iM2764 ^ i18;
                        view8 = view2;
                        iM9671 = i12;
                        i84 = iM2763;
                        i78 = i17;
                        i91 = i10;
                        i81 = i11;
                        i89 = i8;
                        i93 = i7;
                        i79 = i1114;
                        spannableString7 = spannableString;
                        i87 = i16;
                        iM31616 = i15;
                        i86 = i14;
                        view9 = view3;
                        strM10047 = str;
                        length = i13;
                        editText8 = editText;
                        i90 = i9;
                        c2361M13539 = c2361M13539;
                        int i91117 = i85;
                        textInputLayout2 = textInputLayout2;
                        strM5510 = strM5510;
                        sArr7 = sArr;
                        iM31615 = iM31615;
                        view10 = view10;
                        editText7 = editText7;
                        str9 = str9;
                        i85 = i91117;
                    } else {
                        c2364 = c2361M13539;
                        i54 = i93;
                        i55 = iM31615;
                        i56 = i89;
                        i57 = i90;
                        i38 = i91;
                        sArr6 = sArr7;
                        i58 = i81;
                        i40 = iM9671;
                        view7 = view9;
                        i61 = i86;
                        i59 = iM31616;
                        i60 = i87;
                        spannableString5 = spannableString7;
                        editText5 = editText8;
                        i62 = length;
                        int iM31625 = (i77 - C0773.m3169("᩵ۛ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i90 = i57;
                        sArr7 = sArr6;
                        c2361M13539 = c2364;
                        iM31615 = i55;
                        i78 = ((iM31625 ^ i76) * 3121) ^ 622784677;
                        length = i62;
                        editText8 = editText5;
                        spannableString7 = spannableString5;
                        i87 = i60;
                        iM31616 = i59;
                        i86 = i61;
                        view9 = view7;
                        i81 = i58;
                        i89 = i56;
                        i93 = i54;
                        i79 = iM31625 ^ 1433084936;
                        iM9671 = i40;
                        i91 = i38;
                    }
                    break;
                case 1696532741:
                case 1938540409:
                    m3982((boolean) i90);
                    break;
                case 1772876826:
                case 1826986615:
                    c2365 = c2361M13539;
                    i67 = i93;
                    i68 = i87;
                    i69 = i89;
                    i70 = i91;
                    spannableString6 = spannableString7;
                    i71 = i81;
                    i72 = iM9671;
                    if (C18978.m44070().containsKey(C1564.m5510(f3786, 535, 2, i92))) {
                        iM31612 = C0773.m3169("ܽۧ") ^ i76;
                        i73 = ((iM31612 ^ i77) * 27865) ^ 1139923164;
                        i74 = 145851385;
                    } else {
                        iM31612 = C0619.m2761("۠᩻") ^ i76;
                        i73 = ((iM31612 ^ i77) * 16011) ^ 321409925;
                        i74 = -1495024434;
                    }
                    int i1115 = iM31612 ^ i74;
                    iM9671 = i72;
                    c2361M13539 = c2365;
                    i91 = i70;
                    SpannableString spannableString15 = spannableString6;
                    i87 = i68;
                    i78 = i73;
                    i81 = i71;
                    i89 = i69;
                    i93 = i67;
                    i79 = i1115;
                    spannableString7 = spannableString15;
                    break;
                case 2053031339:
                case 2084792336:
                    m3985();
                    break;
                default:
                    i3 = i93;
                    c2361M13539 = C4238.m13539(this);
                    C13473.m33136(c2361M13539, C0619.m2761(C3734.m12149(f3786, 588, 3, i92)) ^ 2098908596);
                    RunnableC0334.m2055(c2361M13539, spannableString7);
                    iM31617 = C0773.m3169(C11235.m28300(f3786, 591, 3, i92));
                    if (C20932.f66974 <= 0) {
                        iM3169 = (C0773.m3169("ۧܽ") + i77) * 45;
                        i = ((iM3169 ^ i76) * (-32239)) ^ 1705905887;
                        i4 = 2059996830;
                    } else {
                        iM3169 = C0773.m3169("᩹ܿ") ^ i76;
                        i = ((iM3169 ^ i77) * (-10973)) ^ 464961263;
                        i4 = -1121036754;
                    }
                    int i91118 = iM3169 ^ i4;
                    i93 = i3;
                    i79 = i91118;
                    i78 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2, types: [l.ܳ۠᩻] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v3, types: [l.ܳ۠᩻] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m3965(EditText editText, final DialogInterfaceC8327 dialogInterfaceC8327, ViewOnClickListenerC1057 viewOnClickListenerC1057, TextInputLayout textInputLayout) {
        int iM3169;
        int i;
        int i2;
        int iM31610;
        int i3;
        int i4;
        ?? r3;
        ?? r4;
        final ViewOnClickListenerC1057 viewOnClickListenerC1058 = viewOnClickListenerC1057;
        String strM6952 = null;
        ?? r5 = 0;
        short[] sArr = null;
        short s = 0;
        int i5 = 0;
        int i6 = 0;
        short s2 = 0;
        int i7 = 0;
        int i8 = -285620759;
        int i9 = C3099.f10023;
        int i10 = C3448.f11240;
        int iM2761 = C0619.m2761("ۙܽ") ^ i9;
        int i11 = ((iM2761 ^ i10) * 17405) ^ 1241834940;
        int i12 = iM2761 ^ (-1450294531);
        while (true) {
            final C13511 c13511 = null;
            while (true) {
                i8 = ((((i8 ^ i10) * (-32743)) >> 31) & i11) ^ i12;
                switch (i8) {
                    case -2127796135:
                    case -1675051516:
                        r5 = new InterfaceC15379() { // from class: l.ܳ۠᩻

                            /* JADX INFO: renamed from: ۙ᩶ᩴ, reason: not valid java name and contains not printable characters */
                            private static final short[] f49686 = {1833, 26509, 26522, 26508, 26511, 26512, 26513, 26508, 26522, 5526, -5140, -7716, -6005, 622, 10340, -7584, 12659, -2699, -3506, -6713, -211};

                            {
                                int i13 = 750278245;
                                int i14 = C20932.f66974;
                                int i15 = C2966.f9654;
                                int iM31611 = C0773.m3169("ܶ۠") ^ i14;
                                int i16 = ((iM31611 ^ i15) * (-2057)) ^ 2064609715;
                                int i17 = -862648739;
                                while (true) {
                                    i13 = ((((i13 ^ i15) * (-25241)) >> 31) & i16) ^ (iM31611 ^ i17);
                                    switch (i13) {
                                        case -2100012883:
                                        case -1033047212:
                                            C3033.m9845();
                                            if (C0773.f2792 <= 0) {
                                                iM31611 = C0773.m3169("᩸ۤ") ^ i15;
                                                i16 = ((iM31611 ^ i14) * (-6953)) ^ 1293234488;
                                                i17 = 1655690177;
                                            } else {
                                                iM31611 = C0773.m3169("֨ۨ") ^ i14;
                                                i16 = ((iM31611 ^ i15) * (-29623)) ^ (-1422426326);
                                                i17 = 84847255;
                                            }
                                            break;
                                        case -1937769768:
                                        case 499487934:
                                            C2288.m7767();
                                            C2375.m8065();
                                            throw new RuntimeException();
                                        case -1536816145:
                                        case 1330312892:
                                            if (C3998.m12920()) {
                                                iM31611 = (i14 - C0619.m2761("֨ܳ")) * (-5);
                                                i16 = ((iM31611 ^ i15) * (-11541)) ^ 1247626914;
                                                i17 = -549237764;
                                            } else {
                                                iM31611 = C0773.m3169("᩶ۜ") ^ i15;
                                                i16 = ((iM31611 ^ i14) * 24701) ^ 1152705158;
                                                i17 = 291701821;
                                            }
                                            break;
                                        case -1322768470:
                                        case 768310180:
                                            if (C1783.f6087 <= 0) {
                                                iM31611 = C0773.m3169("֨ۨ") ^ i14;
                                                i16 = ((iM31611 ^ i15) * (-29623)) ^ (-1422426326);
                                                i17 = 84847255;
                                            } else {
                                                iM31611 = (C0619.m2761("ۜ᩹") + i15) * 109;
                                                i16 = ((iM31611 ^ i14) * (-1771)) ^ (-1611163938);
                                                i17 = 504706122;
                                            }
                                            break;
                                        case -1320592398:
                                        case -807362930:
                                            if (C3033.f9831 >= 0) {
                                                iM31611 = C0773.m3169("۠۟") ^ i15;
                                                i16 = ((iM31611 ^ i14) * (-18265)) ^ 376807766;
                                                i17 = 1601432936;
                                            } else {
                                                iM31611 = (C0773.m3169("᩷᩷") ^ i15) * (-79);
                                                i16 = ((iM31611 ^ i14) * 8921) ^ (-1983548500);
                                                i17 = -836979198;
                                            }
                                            break;
                                        case -1254238403:
                                        case -117950678:
                                            if (C0269.m1775() <= 0) {
                                                iM31611 = C0773.m3169("֨ۨ") ^ i14;
                                                i16 = ((iM31611 ^ i15) * (-29623)) ^ (-1422426326);
                                                i17 = 84847255;
                                            } else {
                                                iM31611 = C0773.m3169("᩹᩹") ^ i14;
                                                i16 = ((iM31611 ^ i15) * 31087) ^ (-914096791);
                                                i17 = -1901491126;
                                            }
                                            break;
                                        case -900002776:
                                        case 1353810855:
                                            if (C3734.f12817 >= 0) {
                                                iM31611 = C0773.m3169("᩸ۤ") ^ i15;
                                                i16 = ((iM31611 ^ i14) * (-6953)) ^ 1293234488;
                                                i17 = 1655690177;
                                            } else {
                                                iM31611 = (C0773.m3169("ᩴ᩷") ^ i15) * 65;
                                                i16 = ((iM31611 ^ i14) * 1029) ^ (-1139526550);
                                                i17 = -1393571163;
                                            }
                                            break;
                                        case -898970215:
                                        case 568543837:
                                            if (C2419.f7754 >= 0) {
                                                iM31611 = C0773.m3169("۠۟") ^ i15;
                                                i16 = ((iM31611 ^ i14) * (-18265)) ^ 376807766;
                                                i17 = 1601432936;
                                            } else {
                                                iM31611 = (i14 - C0619.m2761("ۚ᩶")) * 11;
                                                i16 = ((iM31611 ^ i15) * 10105) ^ 98987023;
                                                i17 = 479811179;
                                            }
                                            break;
                                        case -430364494:
                                        case 2003108469:
                                            if (AbstractC0116.f1064 <= 0) {
                                                iM31611 = C0773.m3169("۠۟") ^ i15;
                                                i16 = ((iM31611 ^ i14) * (-18265)) ^ 376807766;
                                                i17 = 1601432936;
                                            } else {
                                                iM31611 = (C0619.m2761("֨ۛ") ^ i15) * (-55);
                                                i16 = ((iM31611 ^ i14) * (-19103)) ^ 602116881;
                                                i17 = 534601005;
                                            }
                                            break;
                                        case -180935339:
                                        case 735870738:
                                            if (C3077.m10041()) {
                                                iM31611 = C0773.m3169("᩸ۤ") ^ i15;
                                                i16 = ((iM31611 ^ i14) * (-6953)) ^ 1293234488;
                                                i17 = 1655690177;
                                            } else {
                                                iM31611 = C0773.m3169("᩻֡") ^ i14;
                                                i16 = ((iM31611 ^ i15) * (-17003)) ^ 53540796;
                                                i17 = -1685673487;
                                            }
                                            break;
                                        case -180294174:
                                        case 1107320479:
                                            if (C1080.f3865 >= 0) {
                                                iM31611 = (C0619.m2761("ۙۢ") ^ i14) * (-97);
                                                i16 = ((iM31611 ^ i15) * (-21585)) ^ 1855314215;
                                                i17 = -2142204404;
                                            } else {
                                                iM31611 = C0773.m3169("᩺ۗ") ^ i15;
                                                i16 = ((iM31611 ^ i14) * (-551)) ^ (-2144160540);
                                                i17 = -1228897972;
                                            }
                                            break;
                                        case -28035122:
                                        case 801297490:
                                            RunnableC1848.m6360();
                                            if (C11235.f35427 < 0) {
                                                iM31611 = (C0619.m2761("ۙۢ") ^ i14) * (-97);
                                                i16 = ((iM31611 ^ i15) * (-21585)) ^ 1855314215;
                                                i17 = -2142204404;
                                            } else {
                                                iM31611 = C0773.m3169("᩶ۜ") ^ i15;
                                                i16 = ((iM31611 ^ i14) * 24701) ^ 1152705158;
                                                i17 = 291701821;
                                            }
                                            break;
                                        case -5034642:
                                        case 727120144:
                                            C23916.m53419();
                                            if (AbstractC0641.f2496 >= 0) {
                                                iM31611 = C0773.m3169("֨ۨ") ^ i14;
                                                i16 = ((iM31611 ^ i15) * (-29623)) ^ (-1422426326);
                                                i17 = 84847255;
                                            } else {
                                                iM31611 = (C0619.m2761("ۙۢ") ^ i14) * (-97);
                                                i16 = ((iM31611 ^ i15) * (-21585)) ^ 1855314215;
                                                i17 = -2142204404;
                                            }
                                            break;
                                        case 718103110:
                                        case 1224476120:
                                            C2485.m8357();
                                            iM31611 = C0773.m3169("᩶ۜ") ^ i15;
                                            i16 = ((iM31611 ^ i14) * 24701) ^ 1152705158;
                                            i17 = 291701821;
                                            break;
                                        case 768889686:
                                        case 1221628389:
                                            if (C2288.f7433 <= 0) {
                                                iM31611 = C0773.m3169("۠۟") ^ i15;
                                                i16 = ((iM31611 ^ i14) * (-18265)) ^ 376807766;
                                                i17 = 1601432936;
                                            } else {
                                                iM31611 = (C0619.m2761("᩻᩸") ^ i14) * (-101);
                                                i16 = ((iM31611 ^ i15) * (-21691)) ^ 331176441;
                                                i17 = 835984492;
                                            }
                                            break;
                                        default:
                                            return;
                                    }
                                }
                            }

                            /* JADX WARN: Code duplicated, block: B:18:0x008e  */
                            /* JADX WARN: Code duplicated, block: B:57:0x021e A[PHI: r3 r4 r5 r7 r10
                              0x021e: PHI (r3v6 java.lang.String) = 
                              (r3v5 java.lang.String)
                              (r3v2 java.lang.String)
                              (r3v2 java.lang.String)
                              (r3v2 java.lang.String)
                              (r3v2 java.lang.String)
                              (r3v2 java.lang.String)
                              (r3v2 java.lang.String)
                             binds: [B:56:0x021c, B:48:0x01b8, B:38:0x0151, B:25:0x00cb, B:19:0x00a4, B:16:0x008a, B:12:0x0069] A[DONT_GENERATE, DONT_INLINE]
                              0x021e: PHI (r4v4 int) = (r4v2 int), (r4v2 int), (r4v3 int), (r4v2 int), (r4v2 int), (r4v2 int), (r4v2 int) binds: [B:56:0x021c, B:48:0x01b8, B:38:0x0151, B:25:0x00cb, B:19:0x00a4, B:16:0x008a, B:12:0x0069] A[DONT_GENERATE, DONT_INLINE]
                              0x021e: PHI (r5v4 l.֨۠᩻) = (r5v2 l.֨۠᩻), (r5v2 l.֨۠᩻), (r5v3 l.֨۠᩻), (r5v2 l.֨۠᩻), (r5v2 l.֨۠᩻), (r5v2 l.֨۠᩻), (r5v2 l.֨۠᩻) binds: [B:56:0x021c, B:48:0x01b8, B:38:0x0151, B:25:0x00cb, B:19:0x00a4, B:16:0x008a, B:12:0x0069] A[DONT_GENERATE, DONT_INLINE]
                              0x021e: PHI (r7v5 java.lang.String) = 
                              (r7v2 java.lang.String)
                              (r7v4 java.lang.String)
                              (r7v2 java.lang.String)
                              (r7v2 java.lang.String)
                              (r7v2 java.lang.String)
                              (r7v2 java.lang.String)
                              (r7v2 java.lang.String)
                             binds: [B:56:0x021c, B:48:0x01b8, B:38:0x0151, B:25:0x00cb, B:19:0x00a4, B:16:0x008a, B:12:0x0069] A[DONT_GENERATE, DONT_INLINE]
                              0x021e: PHI (r10v4 short[]) = (r10v2 short[]), (r10v2 short[]), (r10v2 short[]), (r10v3 short[]), (r10v2 short[]), (r10v2 short[]), (r10v2 short[]) binds: [B:56:0x021c, B:48:0x01b8, B:38:0x0151, B:25:0x00cb, B:19:0x00a4, B:16:0x008a, B:12:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
                            /* JADX WARN: Code duplicated, block: B:68:0x02b4 A[PHI: r9 r12 r13 r15
                              0x02b4: PHI (r9v5 java.lang.String) = (r9v2 java.lang.String), (r9v4 java.lang.String), (r9v2 java.lang.String) binds: [B:67:0x02b2, B:33:0x0116, B:6:0x005e] A[DONT_GENERATE, DONT_INLINE]
                              0x02b4: PHI (r12v4 short) = (r12v3 short), (r12v2 short), (r12v2 short) binds: [B:67:0x02b2, B:33:0x0116, B:6:0x005e] A[DONT_GENERATE, DONT_INLINE]
                              0x02b4: PHI (r13v4 short) = (r13v3 short), (r13v2 short), (r13v2 short) binds: [B:67:0x02b2, B:33:0x0116, B:6:0x005e] A[DONT_GENERATE, DONT_INLINE]
                              0x02b4: PHI (r15v3 short[]) = (r15v2 short[]), (r15v2 short[]), (r15v5 short[]) binds: [B:67:0x02b2, B:33:0x0116, B:6:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
                            /* JADX WARN: Code duplicated, block: B:72:0x02ea A[PHI: r6 r8 r16 r21
                              0x02ea: PHI (r6v5 android.view.View) = (r6v2 android.view.View), (r6v2 android.view.View), (r6v4 android.view.View), (r6v2 android.view.View) binds: [B:71:0x02e8, B:42:0x017c, B:29:0x00f3, B:9:0x0064] A[DONT_GENERATE, DONT_INLINE]
                              0x02ea: PHI (r8v5 int) = (r8v2 int), (r8v4 int), (r8v2 int), (r8v2 int) binds: [B:71:0x02e8, B:42:0x017c, B:29:0x00f3, B:9:0x0064] A[DONT_GENERATE, DONT_INLINE]
                              0x02ea: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:71:0x02e8, B:42:0x017c, B:29:0x00f3, B:9:0x0064] A[DONT_GENERATE, DONT_INLINE]
                              0x02ea: PHI (r21v5 char) = (r21v4 char), (r21v3 char), (r21v3 char), (r21v3 char) binds: [B:71:0x02e8, B:42:0x017c, B:29:0x00f3, B:9:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
                            @Override // l.InterfaceC15379
                            /* JADX INFO: renamed from: ۙ */
                            public final void mo5773(C13778 c13778) {
                                int iM31611;
                                int i13;
                                int i14;
                                int i15 = C2310.f7472;
                                int i16 = C1519.f5300;
                                int iM2762 = C0619.m2761("ۢᩴ") ^ i16;
                                int i17 = ((iM2762 ^ i15) * 25873) ^ 2120097168;
                                String strM10047 = null;
                                short[] sArr2 = null;
                                short[] sArr3 = null;
                                int i18 = iM2762 ^ (-824542931);
                                String strM7980 = null;
                                short s3 = 0;
                                short s4 = 0;
                                int i19 = -1855770008;
                                char c = 0;
                                View viewM5518 = null;
                                String strM2820 = null;
                                short[] sArr4 = null;
                                int iM31612 = 0;
                                int i20 = 0;
                                ViewOnClickListenerC1057 viewOnClickListenerC1059 = null;
                                int i21 = 0;
                                while (true) {
                                    i19 = i18 ^ (i17 & (((i19 ^ i15) * (-24763)) >> 31));
                                    switch (i19) {
                                        case -2135401422:
                                        case -660740951:
                                            viewM5518 = C1564.m5518(viewOnClickListenerC1059, C0619.m2761(strM2820) ^ 2097850213);
                                            if (C20932.f66974 <= 0) {
                                                iM31611 = (C0619.m2761("۟ᩴ") ^ i15) * 93;
                                                i13 = ((iM31611 ^ i16) * 26533) ^ 215213515;
                                                i14 = 1573131924;
                                            } else {
                                                iM31611 = C0773.m3169("ۛ᩶") ^ i15;
                                                i13 = ((iM31611 ^ i16) * 24905) ^ 3748446;
                                                i14 = -1117723116;
                                            }
                                            i18 = iM31611 ^ i14;
                                            i17 = i13;
                                            break;
                                        case -2125292775:
                                        case -1366515592:
                                            C2287.m7745();
                                            break;
                                        case -2109154243:
                                        case -1734963682:
                                            i20 = 52055;
                                            iM31611 = (C0619.m2761("ۡۧ") ^ i15) * (-33);
                                            i13 = ((iM31611 ^ i16) * (-11907)) ^ 1337372152;
                                            i14 = 533022436;
                                            i18 = iM31611 ^ i14;
                                            i17 = i13;
                                            break;
                                        case -1917258392:
                                        case 675479820:
                                            if (C2419.f7754 >= 0) {
                                                iM31611 = (C0773.m3169("᩵ۧ") + i16) * 99;
                                                i13 = ((iM31611 ^ i15) * 19959) ^ (-1289604153);
                                                i14 = -1044578261;
                                            } else {
                                                iM31611 = (C0619.m2761("ᩳ᩺") + i15) * 39;
                                                i13 = ((iM31611 ^ i16) * 10241) ^ (-1135647848);
                                                i14 = -1721759219;
                                            }
                                            i18 = iM31611 ^ i14;
                                            i17 = i13;
                                            break;
                                        case -1733718748:
                                        case 687083670:
                                            C2966.m9668(C0619.m2761(C3690.m11996(sArr3, 18, 3, i20)) ^ 2102413252);
                                            break;
                                        case -1638743155:
                                        case -1089565514:
                                            iM31612 = C0773.m3169(C2419.m8166(f49686, 12, 3, i20));
                                            if (C0269.f1558 <= 0) {
                                                iM31611 = (C0619.m2761("۟ᩴ") ^ i15) * 93;
                                                i13 = ((iM31611 ^ i16) * 26533) ^ 215213515;
                                                i14 = 1573131924;
                                            } else {
                                                iM31611 = (C0619.m2761("ۧ۟") ^ i16) * 65;
                                                i13 = ((iM31611 ^ i15) * (-11003)) ^ (-1315730647);
                                                i14 = -59244812;
                                            }
                                            i18 = iM31611 ^ i14;
                                            i17 = i13;
                                            break;
                                        case -1507947334:
                                        case -310851835:
                                            C3734.m12142(C3033.m9850(c13778, C0773.m3169(strM10047) ^ 2125266410));
                                            break;
                                        case -1478174556:
                                        case 295962304:
                                            sArr2 = f49686;
                                            c = 0;
                                            if (C2485.m8357() <= 0) {
                                                iM31611 = (C0619.m2761("۟ᩴ") ^ i15) * 93;
                                                i13 = ((iM31611 ^ i16) * 26533) ^ 215213515;
                                                i14 = 1573131924;
                                            } else {
                                                iM31611 = C0773.m3169("ۡۜ") ^ i15;
                                                i13 = ((iM31611 ^ i16) * 2075) ^ (-1332984466);
                                                i14 = 1696651790;
                                            }
                                            i18 = iM31611 ^ i14;
                                            i17 = i13;
                                            break;
                                        case -1346890145:
                                        case -1062828674:
                                            strM2820 = AbstractC0641.m2820(sArr4, 15, 3, i20);
                                            if (C20932.f66974 <= 0) {
                                                iM31611 = (i16 - C0619.m2761("᩷ܳ")) * (-7);
                                                i13 = ((iM31611 ^ i15) * 5409) ^ (-1241038578);
                                                i14 = -738526105;
                                            } else {
                                                iM31611 = C0619.m2761("᩸۬") ^ i16;
                                                i13 = ((iM31611 ^ i15) * 18517) ^ 609258849;
                                                i14 = 1606809465;
                                            }
                                            i18 = iM31611 ^ i14;
                                            i17 = i13;
                                            break;
                                        case -1310862934:
                                        case 994092621:
                                            AbstractC3624.m11755();
                                            if (C1343.f4799 != 0) {
                                                iM31611 = (C0773.m3169("᩵ۧ") + i16) * 99;
                                                i13 = ((iM31611 ^ i15) * 19959) ^ (-1289604153);
                                                i14 = -1044578261;
                                            } else {
                                                iM31611 = C0773.m3169("ܿܽ") ^ i16;
                                                i13 = ((iM31611 ^ i15) * (-2653)) ^ (-285784917);
                                                i14 = -1014337265;
                                            }
                                            i18 = iM31611 ^ i14;
                                            i17 = i13;
                                            break;
                                        case -1290662580:
                                        case 1591294477:
                                            s3 = sArr2[c];
                                            s4 = 16260;
                                            if (C2310.f7472 >= 0) {
                                                iM31611 = (i16 - C0619.m2761("᩷ܳ")) * (-7);
                                                i13 = ((iM31611 ^ i15) * 5409) ^ (-1241038578);
                                                i14 = -738526105;
                                            } else {
                                                iM31611 = C0773.m3169("᩺ۚ") ^ i16;
                                                i13 = ((iM31611 ^ i15) * (-3971)) ^ (-1344733482);
                                                i14 = -964121647;
                                            }
                                            i18 = iM31611 ^ i14;
                                            i17 = i13;
                                            break;
                                        case -1026475297:
                                        case -680609029:
                                            i20 = 26623;
                                            iM31611 = (C0619.m2761("ۡۧ") ^ i15) * (-33);
                                            i13 = ((iM31611 ^ i16) * (-11907)) ^ 1337372152;
                                            i14 = 533022436;
                                            i18 = iM31611 ^ i14;
                                            i17 = i13;
                                            break;
                                        case -930115667:
                                        case -299237637:
                                            dialogInterfaceC8327.m22432();
                                            strM10047 = C3077.m10047(f49686, 9, 3, i20);
                                            if (RunnableC3055.f9898 >= 0) {
                                                iM31611 = (C0773.m3169("᩵ۧ") + i16) * 99;
                                                i13 = ((iM31611 ^ i15) * 19959) ^ (-1289604153);
                                                i14 = -1044578261;
                                            } else {
                                                iM31611 = (C0773.m3169("ۜۗ") ^ i16) * (-117);
                                                i13 = ((iM31611 ^ i15) * (-22009)) ^ (-1786216628);
                                                i14 = 2102990166;
                                            }
                                            i18 = iM31611 ^ i14;
                                            i17 = i13;
                                            break;
                                        case -433198964:
                                        case 1130788947:
                                            i21 = iM31612 ^ 2100109021;
                                            viewOnClickListenerC1059 = viewOnClickListenerC1058;
                                            if (C1542.f5343 <= 0) {
                                                iM31611 = (C0773.m3169("᩵ۧ") + i16) * 99;
                                                i13 = ((iM31611 ^ i15) * 19959) ^ (-1289604153);
                                                i14 = -1044578261;
                                            } else {
                                                iM31611 = (i16 - C0619.m2761("ܰ۫")) * (-41);
                                                i13 = ((iM31611 ^ i15) * (-30109)) ^ (-1209691229);
                                                i14 = -1137078634;
                                            }
                                            i18 = iM31611 ^ i14;
                                            i17 = i13;
                                            break;
                                        case -197839059:
                                        case 1800537014:
                                            C13473.m33140(viewM5518, 0);
                                            sArr3 = f49686;
                                            if (C2023.f6737) {
                                                iM31611 = (C0773.m3169("᩵ۧ") + i16) * 99;
                                                i13 = ((iM31611 ^ i15) * 19959) ^ (-1289604153);
                                                i14 = -1044578261;
                                            } else {
                                                iM31611 = C0773.m3169("ۙܰ") ^ i15;
                                                i13 = ((iM31611 ^ i16) * (-2731)) ^ 2144147223;
                                                i14 = 1318804746;
                                            }
                                            i18 = iM31611 ^ i14;
                                            i17 = i13;
                                            break;
                                        case 435486798:
                                        case 670621238:
                                            if ((s3 * s4) - ((s3 * s3) + 66096900) <= 0) {
                                                iM31611 = (i16 - C0773.m3169("۫ܺ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                                                i13 = ((iM31611 ^ i15) * 2081) ^ (-316786195);
                                                i14 = 692317487;
                                            } else {
                                                iM31611 = (i15 - C0619.m2761("ܳ֨")) * 37;
                                                i13 = ((iM31611 ^ i16) * 14045) ^ (-1437972932);
                                                i14 = 2001882409;
                                            }
                                            i18 = iM31611 ^ i14;
                                            i17 = i13;
                                            break;
                                        case 485754606:
                                        case 1347732333:
                                            C0950.m3785();
                                            C2310.m7813();
                                            iM31611 = (C0773.m3169("᩵ۧ") + i16) * 99;
                                            i13 = ((iM31611 ^ i15) * 19959) ^ (-1289604153);
                                            i14 = -1044578261;
                                            i18 = iM31611 ^ i14;
                                            i17 = i13;
                                            break;
                                        case 811226092:
                                        case 1764846576:
                                            if (C20932.f66974 <= 0) {
                                                iM31611 = C0773.m3169("ܿܽ") ^ i16;
                                                i13 = ((iM31611 ^ i15) * (-2653)) ^ (-285784917);
                                                i14 = -1014337265;
                                            } else {
                                                iM31611 = (C0619.m2761("۟ᩴ") ^ i15) * 93;
                                                i13 = ((iM31611 ^ i16) * 26533) ^ 215213515;
                                                i14 = 1573131924;
                                            }
                                            i18 = iM31611 ^ i14;
                                            i17 = i13;
                                            break;
                                        case 1278771355:
                                        case 2092400197:
                                            int i22 = ViewOnClickListenerC1057.f3785;
                                            strM7980 = C2354.m7980(f49686, 1, 8, i20);
                                            if (C11235.f35427 >= 0) {
                                                iM31611 = (C0773.m3169("᩵ۧ") + i16) * 99;
                                                i13 = ((iM31611 ^ i15) * 19959) ^ (-1289604153);
                                                i14 = -1044578261;
                                            } else {
                                                iM31611 = (C0619.m2761("ۜ᩷") + i16) * 35;
                                                i13 = ((iM31611 ^ i15) * 20117) ^ (-1297486982);
                                                i14 = -31605628;
                                            }
                                            i18 = iM31611 ^ i14;
                                            i17 = i13;
                                            break;
                                        case 1366435795:
                                        case 1886639562:
                                            C17202.m40379(c13778, strM7980);
                                            C1564.m5521(c13511);
                                            if (C2878.m9488(c13778)) {
                                                iM31611 = C0619.m2761("֫ۜ") ^ i15;
                                                i13 = ((iM31611 ^ i16) * (-26023)) ^ (-1065885724);
                                                i14 = 1765552510;
                                            } else {
                                                iM31611 = (C0773.m3169("ᩳܰ") + i15) * 123;
                                                i13 = ((iM31611 ^ i16) * (-8199)) ^ (-490461325);
                                                i14 = 588731679;
                                            }
                                            i18 = iM31611 ^ i14;
                                            i17 = i13;
                                            break;
                                        default:
                                            C13473.m33140(C2878.m9476(viewOnClickListenerC1059, i21), 8);
                                            sArr4 = f49686;
                                            if (C1783.m6232()) {
                                                iM31611 = (i15 - C0773.m3169("ܰ᩶")) * (-13);
                                                i13 = ((iM31611 ^ i16) * (-25883)) ^ 1808873071;
                                                i14 = -1338375338;
                                            } else {
                                                iM31611 = (i16 - C0619.m2761("᩷ܳ")) * (-7);
                                                i13 = ((iM31611 ^ i15) * 5409) ^ (-1241038578);
                                                i14 = -738526105;
                                            }
                                            i18 = iM31611 ^ i14;
                                            i17 = i13;
                                            break;
                                    }
                                    return;
                                }
                            }
                        };
                        if (C23916.f77426 <= 0) {
                            r4 = r5;
                            iM3169 = C0619.m2761("ۡܿ") ^ i10;
                            i = ((iM3169 ^ i9) * (-25501)) ^ 607259268;
                            i2 = 2022585119;
                            r3 = r4;
                            i12 = iM3169 ^ i2;
                            i11 = i;
                            r5 = r3;
                            viewOnClickListenerC1058 = viewOnClickListenerC1057;
                        } else {
                            int iM31611 = (C0773.m3169("ۚܿ") + i9) * (-63);
                            i12 = iM31611 ^ 814253005;
                            i11 = ((iM31611 ^ i10) * (-28435)) ^ (-356680571);
                        }
                        break;
                    case -2060614834:
                    case -222881835:
                        s = sArr[152];
                        i5 = s * s;
                        if (C1564.f5401 > 0) {
                            iM3169 = (C0773.m3169("ۘ۟") + i10) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                            i = ((iM3169 ^ i9) * 7149) ^ 780382650;
                            i2 = -1744130557;
                            r3 = r5;
                            i12 = iM3169 ^ i2;
                            i11 = i;
                            r5 = r3;
                            viewOnClickListenerC1058 = viewOnClickListenerC1057;
                        }
                        iM31610 = (C0773.m3169("ۛܺ") ^ i9) * 59;
                        i3 = ((iM31610 ^ i10) * (-6359)) ^ (-1930174748);
                        i4 = 2068041288;
                        i12 = iM31610 ^ i4;
                        i11 = i3;
                        c13511 = null;
                        r5 = r5;
                        viewOnClickListenerC1058 = viewOnClickListenerC1057;
                        break;
                    case -1982853771:
                    case -1251069079:
                        if (viewOnClickListenerC1058.f3787.m55200()) {
                            int iM2762 = (C0619.m2761("ܿܺ") ^ i10) * 87;
                            i11 = ((iM2762 ^ i9) * 13803) ^ (-2087336281);
                            i12 = iM2762 ^ (-1156804924);
                            r5 = r5;
                            viewOnClickListenerC1058 = viewOnClickListenerC1057;
                        } else {
                            int iM31612 = C0773.m3169("ۚ᩻") ^ i10;
                            i11 = ((iM31612 ^ i9) * 28991) ^ (-1468565728);
                            i12 = iM31612 ^ 496625487;
                        }
                        break;
                    case -1865985081:
                    case -425024743:
                        AbstractC0641.m2813();
                        C3099.m10095();
                        break;
                    case -1852650125:
                    case 1347255245:
                        C1826.m6301();
                        if (C1146.f4234 >= 0) {
                            iM3169 = (C0619.m2761("ܺ᩹") ^ i10) * 99;
                            i = ((iM3169 ^ i9) * (-26019)) ^ 453360056;
                            i2 = -274670116;
                            r3 = r5;
                            i12 = iM3169 ^ i2;
                            i11 = i;
                            r5 = r3;
                            viewOnClickListenerC1058 = viewOnClickListenerC1057;
                        }
                        r4 = r5;
                        iM3169 = C0619.m2761("ۡܿ") ^ i10;
                        i = ((iM3169 ^ i9) * (-25501)) ^ 607259268;
                        i2 = 2022585119;
                        r3 = r4;
                        i12 = iM3169 ^ i2;
                        i11 = i;
                        r5 = r3;
                        viewOnClickListenerC1058 = viewOnClickListenerC1057;
                        break;
                    case -1688851434:
                    case 1076627611:
                        sArr = f3786;
                        r4 = r5;
                        if (C1343.m4943()) {
                            iM3169 = (C0773.m3169("ۜ֨") + i9) * (-29);
                            i = ((iM3169 ^ i10) * (-7065)) ^ 1388868971;
                            i2 = 204993507;
                            r3 = r5;
                        } else {
                            iM3169 = C0619.m2761("ۡܿ") ^ i10;
                            i = ((iM3169 ^ i9) * (-25501)) ^ 607259268;
                            i2 = 2022585119;
                            r3 = r4;
                        }
                        i12 = iM3169 ^ i2;
                        i11 = i;
                        r5 = r3;
                        viewOnClickListenerC1058 = viewOnClickListenerC1057;
                        break;
                    case -1148670949:
                    case 1568319514:
                        if (C2966.f9654 < 0) {
                            iM3169 = (i10 - C0619.m2761("ۛ֡")) * (-105);
                            i = ((iM3169 ^ i9) * 24037) ^ (-1729403181);
                            i2 = -97054437;
                            r3 = r5;
                            i12 = iM3169 ^ i2;
                            i11 = i;
                            r5 = r3;
                            viewOnClickListenerC1058 = viewOnClickListenerC1057;
                        }
                        iM31610 = (C0773.m3169("ۛܺ") ^ i9) * 59;
                        i3 = ((iM31610 ^ i10) * (-6359)) ^ (-1930174748);
                        i4 = 2068041288;
                        i12 = iM31610 ^ i4;
                        i11 = i3;
                        c13511 = null;
                        r5 = r5;
                        viewOnClickListenerC1058 = viewOnClickListenerC1057;
                        break;
                    case -1082939688:
                    case -201587256:
                        i7 = 20423;
                        iM3169 = (C0773.m3169("۫᩵") ^ i10) * 79;
                        i = ((iM3169 ^ i9) * 7155) ^ (-214749742);
                        i2 = -201168639;
                        r3 = r5;
                        i12 = iM3169 ^ i2;
                        i11 = i;
                        r5 = r3;
                        viewOnClickListenerC1058 = viewOnClickListenerC1057;
                        break;
                    case -893090009:
                    case 1273141695:
                        break;
                    case -773031337:
                    case -170871544:
                        strM6952 = C2023.m6952(C1826.m6309(editText));
                        C2375.m8064(dialogInterfaceC8327);
                        if (C2485.f7950 == 0) {
                            short[] sArr2 = f3786;
                            if (C2354.f7599 >= 0) {
                                iM31610 = (C0773.m3169("ۛܺ") ^ i9) * 59;
                                i3 = ((iM31610 ^ i10) * (-6359)) ^ (-1930174748);
                                i4 = 2068041288;
                                i12 = iM31610 ^ i4;
                                i11 = i3;
                                c13511 = null;
                                r5 = r5;
                                viewOnClickListenerC1058 = viewOnClickListenerC1057;
                            } else {
                                int iM31613 = C0773.m3169(C1343.m4939(sArr2, 153, 3, i7));
                                if (C1321.m4852()) {
                                    c13511 = new C13511(viewOnClickListenerC1058, iM31613 ^ 2124190479);
                                    C4282.m13648(c13511);
                                    if (C4282.m13644()) {
                                        int iM31614 = (C0773.m3169("᩻֨") ^ i9) * (-79);
                                        i11 = 1438982442 ^ ((iM31614 ^ i10) * 32195);
                                        i12 = iM31614 ^ 1072288962;
                                        strM6952 = strM6952;
                                    } else {
                                        strM6952 = strM6952;
                                        iM31610 = (C0773.m3169("ۛܺ") ^ i9) * 59;
                                        i3 = ((iM31610 ^ i10) * (-6359)) ^ (-1930174748);
                                        i4 = 2068041288;
                                        i12 = iM31610 ^ i4;
                                        i11 = i3;
                                        c13511 = null;
                                        r5 = r5;
                                        viewOnClickListenerC1058 = viewOnClickListenerC1057;
                                    }
                                } else {
                                    strM6952 = strM6952;
                                    iM31610 = C0773.m3169("ۜۗ") ^ i9;
                                    i3 = ((iM31610 ^ i10) * 27649) ^ 205941864;
                                    i4 = 313126895;
                                    i12 = iM31610 ^ i4;
                                    i11 = i3;
                                    c13511 = null;
                                    r5 = r5;
                                    viewOnClickListenerC1058 = viewOnClickListenerC1057;
                                }
                            }
                        }
                        break;
                    case -769589420:
                    case 1470136045:
                        int i13 = s + s2;
                        if (i6 - (i13 * i13) >= 0) {
                            iM3169 = (i9 - C0773.m3169("ᩳ۟")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                            i = ((iM3169 ^ i10) * 31769) ^ (-966939090);
                            i2 = -1427926746;
                            r3 = r5;
                        } else {
                            iM3169 = C0773.m3169("ۚ֫") ^ i9;
                            i = ((iM3169 ^ i10) * 27473) ^ 260785553;
                            i2 = -417233329;
                            r3 = r5;
                        }
                        i12 = iM3169 ^ i2;
                        i11 = i;
                        r5 = r3;
                        viewOnClickListenerC1058 = viewOnClickListenerC1057;
                        break;
                    case -237214721:
                    case -28036777:
                        if (C3734.m12152() < 0) {
                            iM3169 = C0773.m3169("ۖᩳ") ^ i9;
                            i = ((iM3169 ^ i10) * (-1797)) ^ 724061838;
                            i2 = -472205120;
                            r3 = r5;
                            i12 = iM3169 ^ i2;
                            i11 = i;
                            r5 = r3;
                            viewOnClickListenerC1058 = viewOnClickListenerC1057;
                        }
                        iM31610 = C0773.m3169("ۜۗ") ^ i9;
                        i3 = ((iM31610 ^ i10) * 27649) ^ 205941864;
                        i4 = 313126895;
                        i12 = iM31610 ^ i4;
                        i11 = i3;
                        c13511 = null;
                        r5 = r5;
                        viewOnClickListenerC1058 = viewOnClickListenerC1057;
                        break;
                    case 565077611:
                    case 991687874:
                        C3448.m11248();
                        C2310.m7813();
                        r4 = r5;
                        iM3169 = C0619.m2761("ۡܿ") ^ i10;
                        i = ((iM3169 ^ i9) * (-25501)) ^ 607259268;
                        i2 = 2022585119;
                        r3 = r4;
                        i12 = iM3169 ^ i2;
                        i11 = i;
                        r5 = r3;
                        viewOnClickListenerC1058 = viewOnClickListenerC1057;
                        break;
                    case 651918614:
                    case 1006024759:
                        if (!C3690.m11987()) {
                            iM31610 = (C0773.m3169("ۛܺ") ^ i9) * 59;
                            i3 = ((iM31610 ^ i10) * (-6359)) ^ (-1930174748);
                            i4 = 2068041288;
                            i12 = iM31610 ^ i4;
                            i11 = i3;
                            c13511 = null;
                            r5 = r5;
                            viewOnClickListenerC1058 = viewOnClickListenerC1057;
                        }
                        r4 = r5;
                        iM3169 = C0619.m2761("ۡܿ") ^ i10;
                        i = ((iM3169 ^ i9) * (-25501)) ^ 607259268;
                        i2 = 2022585119;
                        r3 = r4;
                        i12 = iM3169 ^ i2;
                        i11 = i;
                        r5 = r3;
                        viewOnClickListenerC1058 = viewOnClickListenerC1057;
                        break;
                    case 1136047000:
                    case 2108952046:
                        i7 = 18183;
                        iM3169 = (C0773.m3169("۫᩵") ^ i10) * 79;
                        i = ((iM3169 ^ i9) * 7155) ^ (-214749742);
                        i2 = -201168639;
                        r3 = r5;
                        i12 = iM3169 ^ i2;
                        i11 = i;
                        r5 = r3;
                        viewOnClickListenerC1058 = viewOnClickListenerC1057;
                        break;
                    case 1282965115:
                    case 1397432006:
                        int i14 = 314707600 + i5;
                        i6 = i14 + i14;
                        s2 = 17740;
                        if (C1321.f4751 >= 0) {
                            iM3169 = (C0619.m2761("ܺ᩹") ^ i10) * 99;
                            i = ((iM3169 ^ i9) * (-26019)) ^ 453360056;
                            i2 = -274670116;
                            r3 = r5;
                        } else {
                            iM3169 = (i10 - C0619.m2761("ܿ۟")) * 127;
                            i = ((iM3169 ^ i9) * (-21627)) ^ 1823606645;
                            i2 = 1803666231;
                            r3 = r5;
                        }
                        i12 = iM3169 ^ i2;
                        i11 = i;
                        r5 = r3;
                        viewOnClickListenerC1058 = viewOnClickListenerC1057;
                        break;
                    case 1520231029:
                    case 2109432081:
                        if (m3963(textInputLayout, false)) {
                            iM3169 = C0619.m2761("ܳ᩷") ^ i9;
                            i = ((iM3169 ^ i10) * (-18047)) ^ 929291160;
                            i2 = -780005801;
                            r3 = r5;
                            i12 = iM3169 ^ i2;
                            i11 = i;
                            r5 = r3;
                        } else {
                            int iM2763 = (C0619.m2761("ܿܺ") ^ i10) * 87;
                            i11 = ((iM2763 ^ i9) * 13803) ^ (-2087336281);
                            i12 = iM2763 ^ (-1156804924);
                            r5 = r5;
                        }
                        viewOnClickListenerC1058 = viewOnClickListenerC1057;
                        break;
                    case 1907166442:
                    case 1943455910:
                        ReentrantLock reentrantLock = C11650.f37690;
                        C2966.m9674(new C19855(strM6952, viewOnClickListenerC1058, r5));
                        break;
                    default:
                        if (C2966.f9654 >= 0) {
                        }
                        r4 = r5;
                        iM3169 = C0619.m2761("ۡܿ") ^ i10;
                        i = ((iM3169 ^ i9) * (-25501)) ^ 607259268;
                        i2 = 2022585119;
                        r3 = r4;
                        i12 = iM3169 ^ i2;
                        i11 = i;
                        r5 = r3;
                        viewOnClickListenerC1058 = viewOnClickListenerC1057;
                        break;
                }
                return;
            }
            int iM2764 = C0619.m2761("ۗܰ") ^ i10;
            i11 = ((iM2764 ^ i9) * 7709) ^ (-296349845);
            i12 = iM2764 ^ (-1207690158);
            r5 = r5;
        }
    }
}
