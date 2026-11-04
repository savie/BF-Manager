package l;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.math.ec.custom.sec.SecP160R2Field;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.֡֨᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: X6KT */
/* JADX INFO: loaded from: classes3.dex */
public final class ActivityC0093 extends AbstractActivityC17204 {

    /* JADX INFO: renamed from: ۖۗ᩵, reason: not valid java name and contains not printable characters */
    private static final short[] f1008 = {9422, -20550, -20575, -20570, -20546, -20604, -20548, -20571, -20547, -20576, -20603, -20570, -20562, -20576, -20569, -20550, -20575, -20570, -20546, -20582, -20564, -20550, -20550, -20576, -20570, -20569, -20595, -20564, -20545, -20576, -20566, -20564, -20550, 5112, 11583, 11571, 11576, 11577, 11579, 11577, 11560, 11535, 11560, 11566, 11573, 11570, 11579, 11636, 11634, 11634, 11634, 11637, 11567, 11572, 11581, 11566, 11577, 11528, 11577, 11556, 11560, 11571, 11564, 11560, 11535, 11560, 11566, 11573, 11570, 11579, 11636, 11634, 11634, 11634, 11637, 11566, 11561, 11568, 11577, 11567, 11530, 11573, 11577, 11563, 11566, 11561, 11568, 11577, 11567, -23790, 24544, -19147, -23841, -22869, 25339, 11581, 11583, 11560, 11573, 11562, 11577, 11573, 11570, 11581, 11583, 11560, 11573, 11562, 11577, 11528, 11573, 11560, 11568, 11577, 11573, 11570, 11581, 11583, 11560, 11573, 11562, 11577, 11528, 11577, 11556, 11560, 18830, -20746, -24083, -16873, -21916, 22655, -24130, -19506, -19199, 20482, 18267, -19259, 11564, 11571, 11573, 11570, 11560, 11567, 11577, 11570, 11581, 11582, 11568, 11577, 11576, 21166, 24020, 25391, -17874, 17420, 17088, 11560, 11571, 11560, 11581, 11568, -23578, 25390, 29234, -20607, 22897, -17335, -17862, -18433, -16642, 11583, 11581, 11564, 11564, 11577, 11576, 19575, 31656, -17335, 17311, 22052, 25353, 11570, 11577, 11556, 11560, 11532, 11571, 11573, 11570, 11560, 11567, 20947, 22249, 20033, 11569, 11581, 11556, 11551, 11568, 11573, 11577, 11570, 11560, 11567, -23071, -20847, 24520, 9636, -850, -863, -853, -835, -864, -858, -853, -799, -858, -863, -837, -854, -863, -837, -799, -850, -852, -837, -858, -864, -863, -799, -868, -886, -895, -885, -837, -854, -841, -837, -800, -833, -861, -850, -858, -863, -850, -863, -853, -835, -864, -858, -853, -799, -858, -863, -837, -854, -863, -837, -799, -854, -841, -837, -835, -850, -799, -869, -886, -873, -869, -29129, 30785, 28597, 1137, -6656, -5916, -4202, -150, 12986, -5815, 9329, 10696, 10719, 10716, 10696, 10719, 10697, 10706, 10742, 10715, 10691, 10709, 10703, 10702, 9026, -26783, -31208, -21901, 25809, 32617, 24961, -19567, -27291, -27403, -27141, -17488, -18143, -6712, -6697, -6693, -6711, -6762, -6768, -6768, -6768, -6761, -6693, -6714, -6706, -6689, -6704, -6694, -6693, -6694, -6676, -6709, -6702, -6693, -6707, -6708, -6693, -6691, -6703, -6708, -6694, -6707, -6675, -6693, -6702, -6693, -6691, -6710, -6693, -6694, -6707, -6691, -6708, -6703, -6702, -6702, -6681, -29716, -32005, -19894, -32053, -17473, 25935, -19292, -18614, -28004, -27853, 28436, -30608, 31507, 28709, -31725, 29656, -31685, -29857, -19476, -28977, -17499, -25379, -18781, -31889, -31652, -29521, -28066, -32760, 25284, 30509, -6708, -6693, -6696, -6708, -6693, -6707, -6698, -6670, -6689, -6713, -6703, -6709, -6710, -28391, -19964, 26653, -25853, -31615, 26830, -19195, 32506, -30680, -31733, 27685, -16965, 26596, 28003, 28121, -6711, -6708, -6689, -6706, -6762, -6768, -6768, -6768, -6761, 32195, -28032, -20259, -25407, 32021, -19961, 4029, 6974, 6948, 6949, 6914, 6949, 6960, 6949, 6964, 6947, 6964, 6962, 6974, 6947, 6965, 6946, 6914, 6964, 6973, 6964, 6962, 6949, 6964, 6965, 6947, 6948, 6973, 6964, 6946, 6919, 6968, 6964, 6950, 6964, 6953, 6945, 6960, 6975, 6965, 6964, 6965, 6915, 6948, 6973, 6964, 6946, 25870, 17726, 26212, 6946, 6962, 6947, 6974, 6973, 6973, 6920, 4057, -6757, -6740, -6737, -6740, -6725, -6725, -6744, -6747, -6776, -6742, -6723, -6752, -6721, -6752, -6723, -6736};

    /* JADX INFO: renamed from: ܶ᩷, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f1009 = 0;

    /* JADX INFO: renamed from: ֫᩷, reason: not valid java name and contains not printable characters */
    public int f1010;

    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public final String f1011;

    /* JADX INFO: renamed from: ۧ᩷, reason: not valid java name and contains not printable characters */
    public boolean f1012;

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public boolean f1013;

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public boolean f1014;

    /* JADX INFO: renamed from: ܺ᩷, reason: not valid java name and contains not printable characters */
    public C9042 f1015;

    /* JADX INFO: renamed from: ܽ᩷, reason: not valid java name and contains not printable characters */
    public String f1016;

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public int f1017;

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public String f1018;

    /* JADX INFO: renamed from: ᩻᩷, reason: not valid java name and contains not printable characters */
    public C3072 f1019;

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
        int i6 = -891456371;
        int i7 = C1146.f4234;
        int i8 = C1826.f6190;
        int iM2761 = (C0619.m2761("᩻ܰ") + i8) * 61;
        int i9 = ((iM2761 ^ i7) * (-12475)) ^ 1958345532;
        int i10 = 1102383016;
        while (true) {
            i6 = ((((i6 ^ i7) * (-12539)) >> 31) & i9) ^ (iM2761 ^ i10);
            switch (i6) {
                case -2035185568:
                case 170446993:
                    return C2375.m8069(sArr2, i5, 16, i4);
                case -1964704997:
                case 1231977408:
                    if (C2354.f7599 >= 0) {
                        iM2761 = (C0619.m2761("᩻ۗ") + i7) * (-41);
                        i9 = ((iM2761 ^ i8) * 18719) ^ (-2095802518);
                        i10 = -1612125466;
                    } else {
                        iM2761 = (C0773.m3169("ۗ۠") + i8) * 37;
                        i9 = ((iM2761 ^ i7) * (-27453)) ^ (-1161946847);
                        i10 = 667761785;
                    }
                    break;
                case -1941683802:
                case -1701048632:
                    sArr2 = f1008;
                    i5 = 482;
                    if (C0773.f2792 <= 0) {
                        iM2761 = C0619.m2761("᩵۫") ^ i8;
                        i9 = ((iM2761 ^ i7) * 15219) ^ (-15429390);
                        i10 = -301796374;
                    } else {
                        iM2761 = C0619.m2761("ۗۢ") ^ i7;
                        i9 = ((iM2761 ^ i8) * 21065) ^ 1607202319;
                        i10 = 919080073;
                    }
                    break;
                case -1705024203:
                case 602114676:
                    C0269.m1775();
                    iM2761 = (C0773.m3169("ۗ۠") + i8) * 37;
                    i9 = ((iM2761 ^ i7) * (-27453)) ^ (-1161946847);
                    i10 = 667761785;
                    break;
                case -1495501778:
                case 436720563:
                    s2 = 11955;
                    if (AbstractC3624.m11755() != 0) {
                        iM2761 = (C0619.m2761("ۤ֨") + i8) * 39;
                        i9 = ((iM2761 ^ i7) * (-31211)) ^ (-1338054358);
                        i10 = 59310653;
                    } else {
                        iM2761 = C0619.m2761("᩸۟") ^ i7;
                        i9 = ((iM2761 ^ i8) * 17067) ^ (-139392790);
                        i10 = 812803248;
                    }
                    break;
                case -1363110340:
                case -18665291:
                    if (RunnableC0334.f1808 <= 0) {
                        iM2761 = (C0619.m2761("ۤ֨") + i8) * 39;
                        i9 = ((iM2761 ^ i7) * (-31211)) ^ (-1338054358);
                        i10 = 59310653;
                    } else {
                        iM2761 = C0619.m2761("ܶ۠") ^ i7;
                        i9 = ((iM2761 ^ i8) * 18465) ^ (-234631695);
                        i10 = 113167246;
                    }
                    break;
                case -1299376023:
                case 326853374:
                    C3690.m11987();
                    C13473.m33144();
                    return null;
                case -1256253564:
                case 29031414:
                    s = sArr[c];
                    if (C2310.m7813() <= 0) {
                        iM2761 = (C0773.m3169("ۗ۠") + i8) * 37;
                        i9 = ((iM2761 ^ i7) * (-27453)) ^ (-1161946847);
                        i10 = 667761785;
                    } else {
                        iM2761 = (i8 - C0773.m3169("۠᩷")) * 87;
                        i9 = ((iM2761 ^ i7) * 12747) ^ 739719057;
                        i10 = -1145254917;
                    }
                    break;
                case -1233783538:
                case -478187131:
                    if (C2966.f9654 >= 0) {
                        iM2761 = (C0619.m2761("ۤ֨") + i8) * 39;
                        i9 = ((iM2761 ^ i7) * (-31211)) ^ (-1338054358);
                        i10 = 59310653;
                    } else {
                        iM2761 = C0773.m3169("ۗܳ") ^ i8;
                        i9 = ((iM2761 ^ i7) * 9749) ^ (-1845629082);
                        i10 = 1037594916;
                    }
                    break;
                case -1228442650:
                case 732597112:
                    c = 481;
                    if (C1080.f3865 >= 0) {
                        iM2761 = (C0773.m3169("ۗ۠") + i8) * 37;
                        i9 = ((iM2761 ^ i7) * (-27453)) ^ (-1161946847);
                        i10 = 667761785;
                    } else {
                        iM2761 = (i7 - C0773.m3169("᩺ܳ")) * (-125);
                        i9 = ((iM2761 ^ i8) * (-24937)) ^ (-731069610);
                        i10 = 1666086431;
                    }
                    break;
                case -1130346649:
                case 1375338682:
                    i4 = 1346;
                    iM2761 = C0619.m2761("֨᩶") ^ i7;
                    i9 = ((iM2761 ^ i8) * (-32183)) ^ (-1861883603);
                    i10 = 719689988;
                    break;
                case -717539332:
                case -231736117:
                    i = s * s;
                    i2 = 142922025;
                    if (C23916.m53419() != 0) {
                        iM2761 = (C0619.m2761("ۤ֨") + i8) * 39;
                        i9 = ((iM2761 ^ i7) * (-31211)) ^ (-1338054358);
                        i10 = 59310653;
                    } else {
                        iM2761 = C0619.m2761("ܽ֫") ^ i8;
                        i9 = ((iM2761 ^ i7) * (-9271)) ^ (-1672057792);
                        i10 = 1214919541;
                    }
                    break;
                case -26644897:
                case 747628188:
                    int i11 = i + i2;
                    i3 = i11 + i11;
                    if (C1542.f5343 <= 0) {
                        iM2761 = C0619.m2761("᩵۫") ^ i8;
                        i9 = ((iM2761 ^ i7) * 15219) ^ (-15429390);
                        i10 = -301796374;
                    } else {
                        iM2761 = (C0619.m2761("ۗ֨") ^ i7) * 83;
                        i9 = ((iM2761 ^ i8) * (-14837)) ^ 115361191;
                        i10 = 761343162;
                    }
                    break;
                case 168975805:
                case 622880547:
                    RunnableC3055.m9933();
                    if (C23916.f77426 <= 0) {
                        iM2761 = C0619.m2761("᩵۫") ^ i8;
                        i9 = ((iM2761 ^ i7) * 15219) ^ (-15429390);
                        i10 = -301796374;
                    } else {
                        iM2761 = (C0619.m2761("᩻ۗ") + i7) * (-41);
                        i9 = ((iM2761 ^ i8) * 18719) ^ (-2095802518);
                        i10 = -1612125466;
                    }
                    break;
                case 237312049:
                case 2147289921:
                    i4 = 58825;
                    iM2761 = C0619.m2761("֨᩶") ^ i7;
                    i9 = ((iM2761 ^ i8) * (-32183)) ^ (-1861883603);
                    i10 = 719689988;
                    break;
                case 722082142:
                case 1255647396:
                    sArr = f1008;
                    if (C3077.m10041()) {
                        iM2761 = C0773.m3169("ۧ֫") ^ i7;
                        i9 = ((iM2761 ^ i8) * 2833) ^ (-183574577);
                        i10 = -1167337445;
                    } else {
                        iM2761 = (C0619.m2761("ܳۙ") ^ i7) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i9 = ((iM2761 ^ i8) * (-6359)) ^ (-926858336);
                        i10 = 299166938;
                    }
                    break;
                case 914877985:
                case 1552240048:
                    RunnableC3055.m9933();
                    if (C2375.f7641 <= 0) {
                        iM2761 = C0773.m3169("ۧ֫") ^ i7;
                        i9 = ((iM2761 ^ i8) * 2833) ^ (-183574577);
                        i10 = -1167337445;
                    } else {
                        iM2761 = (C0773.m3169("ۗ۠") + i8) * 37;
                        i9 = ((iM2761 ^ i7) * (-27453)) ^ (-1161946847);
                        i10 = 667761785;
                    }
                    break;
                case 1497209343:
                case 2067743572:
                    if (C1146.f4234 >= 0) {
                        iM2761 = (C0619.m2761("᩻ۗ") + i7) * (-41);
                        i9 = ((iM2761 ^ i8) * 18719) ^ (-2095802518);
                        i10 = -1612125466;
                    } else {
                        iM2761 = (i8 - C0619.m2761("ۙۗ")) * 67;
                        i9 = ((iM2761 ^ i7) * 24719) ^ 909497854;
                        i10 = -1725952978;
                    }
                    break;
                default:
                    int i12 = s + s2;
                    if (i3 - (i12 * i12) >= 0) {
                        iM2761 = (C0619.m2761("ᩴ᩻") + i8) * 19;
                        i9 = ((iM2761 ^ i7) * 9157) ^ (-998353480);
                        i10 = 1935980059;
                    } else {
                        iM2761 = (C0773.m3169("֨᩺") + i8) * 25;
                        i9 = ((iM2761 ^ i7) * (-10017)) ^ (-2074863536);
                        i10 = -1953511509;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x01aa A[PHI: r9
      0x01aa: PHI (r9v3 int) = (r9v2 int), (r9v1 int), (r9v1 int), (r9v1 int) binds: [B:48:0x01a8, B:17:0x0075, B:15:0x0071, B:9:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x0230 A[PHI: r4 r5
      0x0230: PHI (r4v3 char) = (r4v2 char), (r4v1 char), (r4v1 char), (r4v1 char) binds: [B:61:0x022e, B:57:0x0210, B:15:0x0071, B:12:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x0230: PHI (r5v3 short) = (r5v1 short), (r5v2 short), (r5v1 short), (r5v1 short) binds: [B:61:0x022e, B:57:0x0210, B:15:0x0071, B:12:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0263 A[PHI: r7 r8 r11 r12 r13 r14
      0x0263: PHI (r7v3 int) = (r7v1 int), (r7v1 int), (r7v2 int), (r7v1 int), (r7v1 int) binds: [B:25:0x0097, B:65:0x0261, B:52:0x01dc, B:31:0x00e8, B:12:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x0263: PHI (r8v3 int) = (r8v1 int), (r8v1 int), (r8v2 int), (r8v1 int), (r8v1 int) binds: [B:25:0x0097, B:65:0x0261, B:52:0x01dc, B:31:0x00e8, B:12:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x0263: PHI (r11v3 short[]) = (r11v1 short[]), (r11v1 short[]), (r11v1 short[]), (r11v2 short[]), (r11v1 short[]) binds: [B:25:0x0097, B:65:0x0261, B:52:0x01dc, B:31:0x00e8, B:12:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x0263: PHI (r12v7 int) = (r12v1 int), (r12v1 int), (r12v1 int), (r12v2 int), (r12v1 int) binds: [B:25:0x0097, B:65:0x0261, B:52:0x01dc, B:31:0x00e8, B:12:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x0263: PHI (r13v3 short[]) = (r13v2 short[]), (r13v1 short[]), (r13v1 short[]), (r13v1 short[]), (r13v1 short[]) binds: [B:25:0x0097, B:65:0x0261, B:52:0x01dc, B:31:0x00e8, B:12:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x0263: PHI (r14v7 int) = (r14v2 int), (r14v1 int), (r14v1 int), (r14v1 int), (r14v1 int) binds: [B:25:0x0097, B:65:0x0261, B:52:0x01dc, B:31:0x00e8, B:12:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x0295 A[PHI: r19
      0x0295: PHI (r19v5 short[]) = (r19v4 short[]), (r19v3 short[]), (r19v3 short[]) binds: [B:69:0x0293, B:34:0x010f, B:9:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m1164(ActivityC0093 activityC0093) {
        int iM3169;
        int i;
        String strM6366;
        ActivityC0093 activityC0094 = activityC0093;
        String str = null;
        char c = 0;
        short s = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        short[] sArr = null;
        int i7 = 0;
        short[] sArr2 = null;
        int i8 = 0;
        int i9 = -974574004;
        int i10 = C23916.f77426;
        int i11 = C3099.f10023;
        int iM31610 = (C0773.m3169("֡۟") ^ i11) * 45;
        int i12 = ((iM31610 ^ i10) * (-20239)) ^ (-1904929487);
        int i13 = iM31610 ^ 171645886;
        short[] sArr3 = null;
        Intent intent = null;
        while (true) {
            i9 = i13 ^ (i12 & (((i9 ^ i10) * 171) >> 31));
            switch (i9) {
                case -2146943532:
                case 149322653:
                    strM6366 = RunnableC1848.m6366(sArr, i7, 14, i6);
                    String str2 = strM6366;
                    int iM31611 = C0773.m3169("ۧ᩶") ^ i10;
                    i13 = iM31611 ^ (-1282423654);
                    i12 = ((iM31611 ^ i11) * 17615) ^ 1109791577;
                    str = str2;
                    break;
                case -1989384349:
                case 577203595:
                    C3033.m9858(activityC0094, intent.putExtra(str, true));
                    break;
                case -1966244879:
                case -1208181848:
                    C3690.m11987();
                    if (AbstractC0116.m1243() == 0) {
                        iM3169 = C0619.m2761("ۜܶ") ^ i11;
                        i12 = ((iM3169 ^ i10) * (-28615)) ^ 1203293313;
                        i = 1730398866;
                        i13 = iM3169 ^ i;
                    } else {
                        int iM2761 = C0619.m2761("۫֨") ^ i10;
                        i12 = ((iM2761 ^ i11) * (-28585)) ^ (-1726060249);
                        i13 = iM2761 ^ 1891809051;
                        intent = null;
                    }
                    activityC0094 = activityC0093;
                    break;
                case -1964326301:
                case 1527332064:
                    i5 = 228644641;
                    if (AbstractC0116.m1243() != 0) {
                        iM3169 = C0619.m2761("ۜܶ") ^ i11;
                        i12 = ((iM3169 ^ i10) * (-28615)) ^ 1203293313;
                        i = 1730398866;
                    } else {
                        iM3169 = C0773.m3169("֫ᩴ") ^ i11;
                        i12 = ((iM3169 ^ i10) * 9247) ^ 272070386;
                        i = 1392540823;
                    }
                    i13 = iM3169 ^ i;
                    activityC0094 = activityC0093;
                    break;
                case -1941761210:
                case 60339449:
                    sArr3 = f1008;
                    if (C11235.f35427 >= 0) {
                        int iM2762 = C0619.m2761("۫֨") ^ i10;
                        i12 = ((iM2762 ^ i11) * (-28585)) ^ (-1726060249);
                        i13 = iM2762 ^ 1891809051;
                        intent = null;
                    } else {
                        iM3169 = C0773.m3169("᩸ܽ") ^ i11;
                        i12 = ((iM3169 ^ i10) * 19063) ^ (-623088218);
                        i = -911834668;
                        i13 = iM3169 ^ i;
                    }
                    activityC0094 = activityC0093;
                    break;
                case -1868861845:
                case -55924819:
                    if (C2966.f9654 < 0) {
                        iM3169 = C0619.m2761("ۜܶ") ^ i11;
                        i12 = ((iM3169 ^ i10) * (-28615)) ^ 1203293313;
                        i = 1730398866;
                    } else {
                        iM3169 = (i10 - C0773.m3169("᩹ܽ")) * 45;
                        i12 = ((iM3169 ^ i11) * (-3093)) ^ (-1058546599);
                        i = 1538040791;
                    }
                    i13 = iM3169 ^ i;
                    activityC0094 = activityC0093;
                    break;
                case -1846067049:
                case 878247474:
                    if (RunnableC3646.f12471) {
                        iM3169 = (i11 - C0619.m2761("᩵ۙ")) * (-95);
                        i12 = ((iM3169 ^ i10) * 22867) ^ 1021992954;
                        i = -1426292567;
                    } else {
                        iM3169 = C0773.m3169("ܿۨ") ^ i10;
                        i12 = ((iM3169 ^ i11) * 28477) ^ (-264178317);
                        i = -988515116;
                    }
                    i13 = iM3169 ^ i;
                    activityC0094 = activityC0093;
                    break;
                case -1768416640:
                case 46696861:
                    C11235.m28309();
                    C3690.m11987();
                    iM3169 = C0619.m2761("ۜܶ") ^ i11;
                    i12 = ((iM3169 ^ i10) * (-28615)) ^ 1203293313;
                    i = 1730398866;
                    i13 = iM3169 ^ i;
                    activityC0094 = activityC0093;
                    break;
                case -1759689244:
                case 700815229:
                    if (AbstractC0116.f1064 <= 0) {
                        int iM2763 = C0619.m2761("۫֨") ^ i10;
                        i12 = ((iM2763 ^ i11) * (-28585)) ^ (-1726060249);
                        i13 = iM2763 ^ 1891809051;
                        intent = null;
                    } else {
                        intent = new Intent(activityC0094, (Class<?>) ViewOnClickListenerC1057.class);
                        if (activityC0094.f1013) {
                            int iM31612 = (C0773.m3169("ܽ᩷") ^ i11) * (-115);
                            i13 = iM31612 ^ 1950189892;
                            i12 = ((iM31612 ^ i10) * (-1311)) ^ (-582453547);
                        } else {
                            iM3169 = C0619.m2761("ۨۘ") ^ i11;
                            i12 = ((iM3169 ^ i10) * (-13987)) ^ (-941431746);
                            i = 1471823594;
                            i13 = iM3169 ^ i;
                        }
                    }
                    activityC0094 = activityC0093;
                    break;
                case -1617361323:
                case -556991448:
                    i6 = 45001;
                    iM3169 = C0619.m2761("ۤ۠") ^ i11;
                    i12 = ((iM3169 ^ i10) * 2757) ^ 1610434181;
                    i = -816880866;
                    i13 = iM3169 ^ i;
                    activityC0094 = activityC0093;
                    break;
                case -1048341817:
                case 655646696:
                    sArr2 = f1008;
                    if (C1826.f6190 <= 0) {
                        i8 = 15;
                        iM3169 = (i11 - C0619.m2761("᩵ۙ")) * (-95);
                        i12 = ((iM3169 ^ i10) * 22867) ^ 1021992954;
                        i = -1426292567;
                        i13 = iM3169 ^ i;
                        activityC0094 = activityC0093;
                    } else {
                        int iM2764 = (C0619.m2761("ۜܺ") ^ i10) * 127;
                        i13 = iM2764 ^ 527478517;
                        i12 = ((iM2764 ^ i11) * (-711)) ^ (-1308049762);
                        i8 = 15;
                    }
                    break;
                case -1011453078:
                case 1373687946:
                    s = sArr3[c];
                    if (C3099.f10023 <= 0) {
                        iM3169 = (i10 - C0773.m3169("᩹ܽ")) * 45;
                        i12 = ((iM3169 ^ i11) * (-3093)) ^ (-1058546599);
                        i = 1538040791;
                    } else {
                        iM3169 = C0619.m2761("۠֡") ^ i11;
                        i12 = ((iM3169 ^ i10) * (-10387)) ^ 352873260;
                        i = -1094079143;
                    }
                    i13 = iM3169 ^ i;
                    activityC0094 = activityC0093;
                    break;
                case -246612079:
                case 138220531:
                    i3 = i2 * i2;
                    i4 = s * s;
                    if (C1343.f4799 != 0) {
                        iM3169 = (i11 - C0619.m2761("᩵ۙ")) * (-95);
                        i12 = ((iM3169 ^ i10) * 22867) ^ 1021992954;
                        i = -1426292567;
                    } else {
                        iM3169 = C0773.m3169("ۨ᩶") ^ i11;
                        i12 = ((iM3169 ^ i10) * 21719) ^ (-977672911);
                        i = 56309480;
                    }
                    i13 = iM3169 ^ i;
                    activityC0094 = activityC0093;
                    break;
                case -32883411:
                case 189942840:
                    int i14 = i4 + i5;
                    if (i3 - (i14 + i14) > 0) {
                        iM3169 = C0619.m2761("֡ۛ") ^ i10;
                        i12 = ((iM3169 ^ i11) * (-997)) ^ (-1565345218);
                        i = 1589548956;
                    } else {
                        iM3169 = (C0773.m3169("۫᩶") ^ i10) * (-97);
                        i12 = ((iM3169 ^ i11) * (-10503)) ^ 1522313856;
                        i = 807799798;
                    }
                    i13 = iM3169 ^ i;
                    activityC0094 = activityC0093;
                    break;
                case -540469:
                case 1793270989:
                    c = 0;
                    if (C1343.m4943()) {
                        iM3169 = (C0619.m2761("᩻ۜ") ^ i10) * 29;
                        i12 = ((iM3169 ^ i11) * (-19651)) ^ 1354956745;
                        i = 1759355569;
                    } else {
                        iM3169 = (i10 - C0773.m3169("᩹ܽ")) * 45;
                        i12 = ((iM3169 ^ i11) * (-3093)) ^ (-1058546599);
                        i = 1538040791;
                    }
                    i13 = iM3169 ^ i;
                    activityC0094 = activityC0093;
                    break;
                case 266868892:
                case 1915637442:
                    sArr = f1008;
                    if (C1826.f6190 <= 0) {
                        i7 = 1;
                        iM3169 = (i11 - C0619.m2761("᩵ۙ")) * (-95);
                        i12 = ((iM3169 ^ i10) * 22867) ^ 1021992954;
                        i = -1426292567;
                        i13 = iM3169 ^ i;
                        activityC0094 = activityC0093;
                    } else {
                        int iM2765 = (C0619.m2761("ۚ֫") + i10) * 25;
                        i13 = iM2765 ^ 1077954715;
                        i12 = ((iM2765 ^ i11) * 19519) ^ (-640202690);
                        i7 = 1;
                    }
                    break;
                case 353068829:
                case 697316685:
                    strM6366 = C1783.m6233(sArr2, i8, 18, i6);
                    String str3 = strM6366;
                    int iM31613 = C0773.m3169("ۧ᩶") ^ i10;
                    i13 = iM31613 ^ (-1282423654);
                    i12 = ((iM31613 ^ i11) * 17615) ^ 1109791577;
                    str = str3;
                    break;
                case 797116853:
                case 1064430542:
                    C1519.m5403();
                    break;
                case 874923740:
                case 1243691152:
                    C2375.m8065();
                    if (AbstractC0116.m1243() != 0) {
                        iM3169 = (i10 - C0773.m3169("᩹ܽ")) * 45;
                        i12 = ((iM3169 ^ i11) * (-3093)) ^ (-1058546599);
                        i = 1538040791;
                    } else {
                        iM3169 = (i11 - C0619.m2761("᩵ۙ")) * (-95);
                        i12 = ((iM3169 ^ i10) * 22867) ^ 1021992954;
                        i = -1426292567;
                    }
                    i13 = iM3169 ^ i;
                    activityC0094 = activityC0093;
                    break;
                case 1658001568:
                case 1683845456:
                    i6 = 12920;
                    iM3169 = C0619.m2761("ۤ۠") ^ i11;
                    i12 = ((iM3169 ^ i10) * 2757) ^ 1610434181;
                    i = -816880866;
                    i13 = iM3169 ^ i;
                    activityC0094 = activityC0093;
                    break;
                default:
                    i2 = s + 15121;
                    if (C0773.f2792 <= 0) {
                        iM3169 = C0773.m3169("ۜۨ") ^ i11;
                        i12 = ((iM3169 ^ i10) * 17981) ^ 883890037;
                        i = -761308421;
                    } else {
                        iM3169 = C0773.m3169("ܽᩳ") ^ i10;
                        i12 = ((iM3169 ^ i11) * (-1605)) ^ (-951309376);
                        i = 853457587;
                    }
                    i13 = iM3169 ^ i;
                    activityC0094 = activityC0093;
                    break;
            }
            return;
        }
    }

    public ActivityC0093() {
        String str = null;
        int i = 535786131;
        int i2 = C20932.f66974;
        int i3 = C1783.f6087;
        int iM3169 = (C0773.m3169("ܺ᩻") + i2) * 75;
        int i4 = ((iM3169 ^ i3) * (-14421)) ^ (-753692552);
        int i5 = -1354275020;
        while (true) {
            i = ((((i ^ i3) * 29365) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2038794736:
                case -1390423532:
                    if (C3033.m9845() <= 0) {
                        iM3169 = C0773.m3169("ܳۢ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-17757)) ^ (-1777279574);
                        i5 = 1539682561;
                    } else {
                        iM3169 = (C0619.m2761("ܶ֡") ^ i2) * 49;
                        i4 = ((iM3169 ^ i3) * (-16819)) ^ 169518827;
                        i5 = 71196730;
                    }
                    break;
                case -2036068769:
                case 1033331862:
                    if (C4282.f15546 <= 0) {
                        iM3169 = (C0773.m3169("᩷ܽ") ^ i3) * (-105);
                        i4 = ((iM3169 ^ i2) * 22343) ^ 21621027;
                        i5 = 679619003;
                    } else {
                        iM3169 = (C0773.m3169("᩷ᩳ") + i2) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM3169 ^ i3) * (-27585)) ^ 357019294;
                        i5 = -1539792259;
                    }
                    break;
                case -1990741280:
                case 285296161:
                    this.f1018 = str;
                    if (C2354.f7599 >= 0) {
                        iM3169 = (C0619.m2761("֡᩻") ^ i3) * (-43);
                        i4 = ((iM3169 ^ i2) * (-2971)) ^ (-1191095954);
                        i5 = -551322901;
                    } else {
                        iM3169 = C0773.m3169("ۧ᩶") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-7127)) ^ (-2046105945);
                        i5 = -1438404598;
                    }
                    break;
                case -1825905896:
                case -892234446:
                    if (C3077.m10041()) {
                        iM3169 = C0773.m3169("ܳۢ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-17757)) ^ (-1777279574);
                        i5 = 1539682561;
                    } else {
                        iM3169 = (C0619.m2761("ܰۡ") + i3) * 87;
                        i4 = ((iM3169 ^ i2) * (-26697)) ^ (-2026509160);
                        i5 = -311411930;
                    }
                    break;
                case -1738297692:
                case -1415703893:
                    if (C2310.f7472 >= 0) {
                        iM3169 = (C0619.m2761("֡᩻") ^ i3) * (-43);
                        i4 = ((iM3169 ^ i2) * (-2971)) ^ (-1191095954);
                        i5 = -551322901;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ܰ᩷")) * 45;
                        i4 = ((iM3169 ^ i2) * 29497) ^ (-1232933269);
                        i5 = 1069575013;
                    }
                    break;
                case -1712062480:
                case 1715421069:
                    if (C2023.m6964() <= 0) {
                        iM3169 = C0773.m3169("ۗ۬") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-22257)) ^ 401675998;
                        i5 = -416587497;
                    } else {
                        iM3169 = C0619.m2761("ܿۖ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 15433) ^ 1159408136;
                        i5 = 1840745253;
                    }
                    break;
                case -1479732085:
                case 1721587099:
                    C0269.m1775();
                    iM3169 = C0773.m3169("ܳۢ") ^ i2;
                    i4 = ((iM3169 ^ i3) * (-17757)) ^ (-1777279574);
                    i5 = 1539682561;
                    break;
                case -1412977181:
                case -714200345:
                    str = "";
                    if (C2419.m8174() >= 0) {
                        iM3169 = (C0773.m3169("᩷ܽ") ^ i3) * (-105);
                        i4 = ((iM3169 ^ i2) * 22343) ^ 21621027;
                        i5 = 679619003;
                    } else {
                        iM3169 = C0773.m3169("ܳۚ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 26997) ^ (-1097742139);
                        i5 = -1550082974;
                    }
                    break;
                case -1368192313:
                case 892001908:
                    C2419.m8174();
                    if (C4282.f15546 > 0) {
                        iM3169 = (C0773.m3169("᩷ܽ") ^ i3) * (-105);
                        i4 = ((iM3169 ^ i2) * 22343) ^ 21621027;
                        i5 = 679619003;
                    } else {
                        iM3169 = C0773.m3169("ܳۢ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-17757)) ^ (-1777279574);
                        i5 = 1539682561;
                    }
                    break;
                case -1246967672:
                case 662898084:
                    if (C23916.f77426 <= 0) {
                        iM3169 = (C0619.m2761("֡᩻") ^ i3) * (-43);
                        i4 = ((iM3169 ^ i2) * (-2971)) ^ (-1191095954);
                        i5 = -551322901;
                    } else {
                        iM3169 = C0773.m3169("ۢۜ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-32407)) ^ 641687003;
                        i5 = -1176045657;
                    }
                    break;
                case -849660676:
                case 2062921708:
                    if (C3998.f13671 != 0) {
                        iM3169 = C0773.m3169("ܳۢ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-17757)) ^ (-1777279574);
                        i5 = 1539682561;
                    } else {
                        iM3169 = C0773.m3169("᩻ܰ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-28753)) ^ (-2135558029);
                        i5 = -862757956;
                    }
                    break;
                case -73360293:
                case 885695910:
                    if (C2485.f7950 != 0) {
                        iM3169 = C0773.m3169("ܳۢ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-17757)) ^ (-1777279574);
                        i5 = 1539682561;
                    } else {
                        iM3169 = (C0619.m2761("ۡۢ") ^ i2) * 65;
                        i4 = ((iM3169 ^ i3) * (-25593)) ^ 1838777923;
                        i5 = 1143128660;
                    }
                    break;
                case 274428466:
                case 621757942:
                    this.f1011 = C0619.m2752();
                    if (RunnableC3646.m11813() != 0) {
                        iM3169 = (C0619.m2761("֡᩻") ^ i3) * (-43);
                        i4 = ((iM3169 ^ i2) * (-2971)) ^ (-1191095954);
                        i5 = -551322901;
                    } else {
                        iM3169 = C0619.m2761("۠ۛ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-11167)) ^ (-1095133544);
                        i5 = 1345961106;
                    }
                    break;
                case 424131780:
                case 1443596311:
                    if (!C1343.m4943()) {
                        iM3169 = C0773.m3169("ۗ۬") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-22257)) ^ 401675998;
                        i5 = -416587497;
                    } else {
                        iM3169 = C0773.m3169("ܳۢ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-17757)) ^ (-1777279574);
                        i5 = 1539682561;
                    }
                    break;
                case 1032903125:
                case 1896456075:
                    C17202.m40372();
                    C3099.m10095();
                    throw new RuntimeException();
                default:
                    this.f1016 = str;
                    this.f1010 = -1;
                    return;
            }
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 58341. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // l.AbstractActivityC17204, l.ActivityC7405, l.ActivityC3409, l.ActivityC5577, l.ActivityC8866, android.app.Activity
    public final void onCreate(android.os.Bundle r62) {
        /*
            Method dump skipped, instruction units count: 5834
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ActivityC0093.onCreate(android.os.Bundle):void");
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m1178(ActivityC0093 activityC0093) {
        activityC0093.m1177();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m1175(ActivityC0093 activityC0093) {
        C21576.m49067((CharSequence) activityC0093.f1018);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0178 A[PHI: r3 r6
      0x0178: PHI (r3v5 android.content.Intent) = 
      (r3v3 android.content.Intent)
      (r3v1 android.content.Intent)
      (r3v1 android.content.Intent)
      (r3v1 android.content.Intent)
     binds: [B:81:0x0178, B:44:0x0176, B:95:0x0178, B:9:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x0178: PHI (r6v5 short[]) = (r6v3 short[]), (r6v2 short[]), (r6v2 short[]), (r6v2 short[]) binds: [B:81:0x0178, B:44:0x0176, B:95:0x0178, B:9:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x0213 A[PHI: r5 r7 r9 r11 r12 r22
      0x0213: PHI (r5v8 java.lang.String) = (r5v3 java.lang.String), (r5v1 java.lang.String), (r5v1 java.lang.String), (r5v1 java.lang.String) binds: [B:83:0x0213, B:58:0x0211, B:47:0x0199, B:9:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x0213: PHI (r7v14 android.content.Intent) = 
      (r7v2 android.content.Intent)
      (r7v2 android.content.Intent)
      (r7v3 android.content.Intent)
      (r7v2 android.content.Intent)
     binds: [B:83:0x0213, B:58:0x0211, B:47:0x0199, B:9:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x0213: PHI (r9v6 short) = (r9v1 short), (r9v2 short), (r9v1 short), (r9v1 short) binds: [B:83:0x0213, B:58:0x0211, B:47:0x0199, B:9:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x0213: PHI (r11v6 short[]) = (r11v1 short[]), (r11v1 short[]), (r11v2 short[]), (r11v1 short[]) binds: [B:83:0x0213, B:58:0x0211, B:47:0x0199, B:9:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x0213: PHI (r12v6 int) = (r12v1 int), (r12v1 int), (r12v2 int), (r12v1 int) binds: [B:83:0x0213, B:58:0x0211, B:47:0x0199, B:9:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x0213: PHI (r22v7 short) = (r22v1 short), (r22v2 short), (r22v1 short), (r22v1 short) binds: [B:83:0x0213, B:58:0x0211, B:47:0x0199, B:9:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m1168(ActivityC0093 activityC0093) {
        int iM3169;
        int i;
        int i2;
        short s;
        int iM2761;
        int i3;
        int iM2762;
        int i4;
        ActivityC0093 activityC0094 = activityC0093;
        Intent type = null;
        Intent intentM8169 = null;
        int iM2763 = 0;
        String strM2361 = null;
        short s2 = 0;
        int i5 = 0;
        short[] sArr = null;
        int i6 = 0;
        short[] sArr2 = null;
        int i7 = 0;
        int i8 = 0;
        int i9 = 1043522257;
        int i10 = AbstractC0116.f1064;
        int i11 = C3779.f12953;
        int iM2764 = (C0619.m2761("ۧ֨") + i10) * (-113);
        int i12 = ((iM2764 ^ i11) * 11671) ^ (-522971747);
        int i13 = iM2764 ^ (-919576591);
        Intent intent = null;
        char c = 0;
        short s3 = 0;
        short[] sArr3 = null;
        short[] sArr4 = null;
        while (true) {
            i9 = i13 ^ (i12 & (((i9 ^ i11) * (-24737)) >> 31));
            switch (i9) {
                case -2121956516:
                case -1287456496:
                    iM2763 = 2127704679 ^ C0619.m2761(strM2361);
                    if (C1080.f3865 < 0) {
                        iM3169 = C0773.m3169("ۘۗ") ^ i10;
                        i = ((iM3169 ^ i11) * (-25339)) ^ 385624945;
                        i2 = -1453259552;
                        i13 = iM3169 ^ i2;
                        i12 = i;
                    } else {
                        int iM2765 = (C0619.m2761("ᩳۛ") + i11) * 35;
                        i13 = iM2765 ^ (-1143132575);
                        i12 = ((iM2765 ^ i10) * (-23537)) ^ (-239302814);
                        intent = null;
                    }
                    break;
                case -2076013938:
                case 441515931:
                    type = intent.setType(C3033.m9847(sArr, i6, 10, i5));
                    sArr2 = f1008;
                    if (C2375.m8065() > 0) {
                        iM3169 = C0773.m3169("᩵֨") ^ i11;
                        i = ((iM3169 ^ i10) * 23527) ^ (-1869289917);
                        i2 = 461193086;
                        i13 = iM3169 ^ i2;
                        i12 = i;
                    } else {
                        int iM2766 = (C0619.m2761("ᩳۛ") + i11) * 35;
                        i13 = iM2766 ^ (-1143132575);
                        i12 = ((iM2766 ^ i10) * (-23537)) ^ (-239302814);
                        intent = null;
                    }
                    break;
                case -1946309761:
                case 1380759039:
                    s3 = sArr3[c];
                    s2 = 6519;
                    if (C0773.f2792 <= 0) {
                        iM2762 = C0619.m2761("᩹ۚ") ^ i10;
                        i12 = ((iM2762 ^ i11) * 15187) ^ (-809772796);
                        i4 = 2071427748;
                    } else {
                        iM2762 = C0619.m2761("᩹᩸") ^ i10;
                        i12 = ((iM2762 ^ i11) * 27881) ^ (-1910725875);
                        i4 = -1230098526;
                    }
                    i13 = iM2762 ^ i4;
                    activityC0094 = activityC0093;
                    break;
                case -1384176733:
                case 1530540443:
                    C3033.m9858(activityC0094, Intent.createChooser(intentM8169, C1783.m6246(activityC0094, iM2763)));
                    break;
                case -1296851711:
                case -756451183:
                    int i14 = s3 + s2;
                    s = s3;
                    if ((s * 26076) - (i14 * i14) > 0) {
                        iM2761 = C0619.m2761("ۖۘ") ^ i10;
                        i12 = ((iM2761 ^ i11) * 19923) ^ (-634808826);
                        i3 = 1104991285;
                    } else {
                        iM2761 = C0619.m2761("᩺ۨ") ^ i11;
                        i12 = ((iM2761 ^ i10) * 2623) ^ 1701241252;
                        i3 = -1652591579;
                    }
                    i13 = iM2761 ^ i3;
                    activityC0094 = activityC0093;
                    s3 = s;
                    break;
                case -1260120387:
                case -1113889083:
                    i5 = 64719;
                    iM2762 = C0619.m2761("᩻ܰ") ^ i11;
                    i12 = ((iM2762 ^ i10) * (-9219)) ^ 1881401668;
                    i4 = -358174384;
                    i13 = iM2762 ^ i4;
                    activityC0094 = activityC0093;
                    break;
                case -1019358093:
                case 518448916:
                    short[] sArr5 = f1008;
                    if (C1146.f4234 < 0) {
                        String strM4861 = C1321.m4861(sArr5, 210, 26, i5);
                        if (C0269.m1775() <= 0) {
                            int iM31610 = C0773.m3169("ᩳܰ") ^ i10;
                            i12 = ((iM31610 ^ i11) * 4157) ^ 1194186234;
                            i13 = iM31610 ^ 1239117074;
                            intent = null;
                        } else {
                            intent = new Intent(strM4861);
                            sArr = f1008;
                            i6 = 236;
                            if (C2023.f6737) {
                                iM2762 = C0619.m2761("᩹ۚ") ^ i10;
                                i12 = ((iM2762 ^ i11) * 15187) ^ (-809772796);
                                i4 = 2071427748;
                            } else {
                                iM2762 = (C0773.m3169("ᩳۚ") + i10) * (-29);
                                i12 = ((iM2762 ^ i11) * 8001) ^ (-307626550);
                                i4 = 207426471;
                            }
                            i13 = iM2762 ^ i4;
                        }
                        activityC0094 = activityC0093;
                    } else {
                        int iM2767 = (C0619.m2761("ᩳۛ") + i11) * 35;
                        i13 = iM2767 ^ (-1143132575);
                        i12 = ((iM2767 ^ i10) * (-23537)) ^ (-239302814);
                        intent = null;
                    }
                    break;
                case -920277693:
                case 2024605094:
                    if (C0862.f3233 == 0) {
                        int iM31611 = C0773.m3169("ᩳܰ") ^ i10;
                        i12 = ((iM31611 ^ i11) * 4157) ^ 1194186234;
                        i13 = iM31611 ^ 1239117074;
                        intent = null;
                    } else {
                        iM2762 = C0619.m2761("᩹ۚ") ^ i10;
                        i12 = ((iM2762 ^ i11) * 15187) ^ (-809772796);
                        i4 = 2071427748;
                        i13 = iM2762 ^ i4;
                    }
                    activityC0094 = activityC0093;
                    break;
                case -782124418:
                case 1460192561:
                    strM2361 = C0487.m2361(sArr4, 271, 3, i5);
                    if (C1519.f5300 < 0) {
                        iM3169 = C0773.m3169("ᩳ֨") ^ i10;
                        i = ((iM3169 ^ i11) * 28029) ^ 753176943;
                        i2 = -2053617803;
                        i13 = iM3169 ^ i2;
                        i12 = i;
                    } else {
                        iM2762 = C0619.m2761("᩹ۚ") ^ i10;
                        i12 = ((iM2762 ^ i11) * 15187) ^ (-809772796);
                        i4 = 2071427748;
                        i13 = iM2762 ^ i4;
                        activityC0094 = activityC0093;
                    }
                    break;
                case -457092606:
                case 437446316:
                    s = s3;
                    sArr3 = f1008;
                    c = 209;
                    if (C1826.f6190 <= 0) {
                        iM2761 = C0619.m2761("᩵ۨ") ^ i11;
                        i12 = ((iM2761 ^ i10) * (-3699)) ^ 1682262539;
                        i3 = 1155158009;
                    } else {
                        iM2761 = C0619.m2761("ۜܶ") ^ i11;
                        i12 = ((iM2761 ^ i10) * (-7239)) ^ 1886711376;
                        i3 = -1570428525;
                    }
                    i13 = iM2761 ^ i3;
                    activityC0094 = activityC0093;
                    s3 = s;
                    break;
                case 194516443:
                case 1813176547:
                    C2287.m7745();
                    C1826.m6301();
                    s = s3;
                    iM2761 = C0619.m2761("᩵ۨ") ^ i11;
                    i12 = ((iM2761 ^ i10) * (-3699)) ^ 1682262539;
                    i3 = 1155158009;
                    i13 = iM2761 ^ i3;
                    activityC0094 = activityC0093;
                    s3 = s;
                    break;
                case 806168471:
                case 853958555:
                    i7 = 246;
                    i8 = 25;
                    if (C3734.m12152() >= 0) {
                        iM3169 = C0619.m2761("ܰܿ") ^ i11;
                        i = ((iM3169 ^ i10) * 17733) ^ (-996839876);
                        i2 = 1362475679;
                    } else {
                        iM3169 = (C0619.m2761("ۖۜ") ^ i10) * (-3);
                        i = ((iM3169 ^ i11) * (-5431)) ^ 1940206043;
                        i2 = -958109012;
                    }
                    i13 = iM3169 ^ i2;
                    i12 = i;
                    break;
                case 926586770:
                case 1832988124:
                    C1826.m6301();
                    break;
                case 943392946:
                case 1304865715:
                    if (C3492.f12043 <= 0) {
                        int iM2768 = (C0619.m2761("ᩳۛ") + i11) * 35;
                        i13 = iM2768 ^ (-1143132575);
                        i12 = ((iM2768 ^ i10) * (-23537)) ^ (-239302814);
                        intent = null;
                    } else {
                        s = s3;
                        iM2761 = C0619.m2761("᩵ۨ") ^ i11;
                        i12 = ((iM2761 ^ i10) * (-3699)) ^ 1682262539;
                        i3 = 1155158009;
                        i13 = iM2761 ^ i3;
                        activityC0094 = activityC0093;
                        s3 = s;
                    }
                    break;
                case 1026259980:
                case 2137701529:
                    C2834.m9344();
                    if (C4282.f15546 > 0) {
                        int iM31612 = C0773.m3169("ᩳܰ") ^ i10;
                        i12 = ((iM31612 ^ i11) * 4157) ^ 1194186234;
                        i13 = iM31612 ^ 1239117074;
                        intent = null;
                        activityC0094 = activityC0093;
                    } else {
                        int iM2769 = (C0619.m2761("ᩳۛ") + i11) * 35;
                        i13 = iM2769 ^ (-1143132575);
                        i12 = ((iM2769 ^ i10) * (-23537)) ^ (-239302814);
                        intent = null;
                    }
                    break;
                case 1170404171:
                case 1715394581:
                    i5 = 54272;
                    iM2762 = C0619.m2761("᩻ܰ") ^ i11;
                    i12 = ((iM2762 ^ i10) * (-9219)) ^ 1881401668;
                    i4 = -358174384;
                    i13 = iM2762 ^ i4;
                    activityC0094 = activityC0093;
                    break;
                default:
                    intentM8169 = C2419.m8169(type, C20932.m47853(sArr2, i7, i8, i5), activityC0094.f1016);
                    sArr4 = f1008;
                    if (C3033.m9845() > 0) {
                        iM3169 = C0773.m3169("ۢ᩵") ^ i11;
                        i = ((iM3169 ^ i10) * 24519) ^ (-1087117728);
                        i2 = -117896037;
                        i13 = iM3169 ^ i2;
                        i12 = i;
                    } else {
                        int iM31613 = C0773.m3169("ᩳܰ") ^ i10;
                        i12 = ((iM31613 ^ i11) * 4157) ^ 1194186234;
                        i13 = iM31613 ^ 1239117074;
                        intent = null;
                        activityC0094 = activityC0093;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractActivityC17204, l.ActivityC4348, l.ActivityC3409, android.app.Activity
    public final void onStart() {
        int i = -802163212;
        int i2 = C3690.f12684;
        int i3 = C2702.f8586;
        int iM3169 = C0773.m3169("ܶ᩸") ^ i2;
        int i4 = ((iM3169 ^ i3) * 16631) ^ 1074481161;
        int i5 = 531745056;
        while (true) {
            i = ((((i ^ i3) * (-12797)) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2107429819:
                case 325165399:
                    if (C2702.f8586 <= 0) {
                        iM3169 = (C0773.m3169("ܶܿ") ^ i3) * 13;
                        i4 = ((iM3169 ^ i2) * 12221) ^ (-229341673);
                        i5 = 322725985;
                    } else {
                        iM3169 = (C0619.m2761("۟᩸") ^ i2) * 31;
                        i4 = ((iM3169 ^ i3) * 27235) ^ 168697130;
                        i5 = -1127417181;
                    }
                    break;
                case -2096295015:
                case -606120802:
                    if (C2702.m8876()) {
                        iM3169 = C0773.m3169("ۛ۠") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-15537)) ^ 615673643;
                        i5 = 1546589145;
                    } else {
                        iM3169 = (i3 - C0773.m3169("᩹۫")) * (-101);
                        i4 = ((iM3169 ^ i2) * 20099) ^ (-510406950);
                        i5 = -1144144683;
                    }
                    break;
                case -2023724940:
                case -34180891:
                    if (C2288.f7433 <= 0) {
                        iM3169 = C0619.m2761("᩻۫") ^ i2;
                        i4 = ((iM3169 ^ i3) * 27781) ^ (-1926807055);
                        i5 = 639314867;
                    } else {
                        iM3169 = (C0619.m2761("᩶ۜ") + i2) * 85;
                        i4 = ((iM3169 ^ i3) * 29447) ^ (-1698168636);
                        i5 = 613818067;
                    }
                    break;
                case -1967270622:
                case -1261407023:
                    C0950.m3790(this);
                    break;
                case -1488918769:
                case -602914437:
                    m1177();
                    break;
                case -1471864711:
                case 558002754:
                    super.onStart();
                    if (C3033.f9831 >= 0) {
                        iM3169 = C0619.m2761("᩻۫") ^ i2;
                        i4 = ((iM3169 ^ i3) * 27781) ^ (-1926807055);
                        i5 = 639314867;
                    } else {
                        iM3169 = C0619.m2761("ܿ᩷") ^ i3;
                        i4 = ((iM3169 ^ i2) * 25643) ^ (-315513698);
                        i5 = 1793302602;
                    }
                    break;
                case -1431087204:
                case 579714286:
                    if (C2023.f6737) {
                        iM3169 = (C0773.m3169("ܶܿ") ^ i3) * 13;
                        i4 = ((iM3169 ^ i2) * 12221) ^ (-229341673);
                        i5 = 322725985;
                    } else {
                        iM3169 = C0619.m2761("֨۬") ^ i2;
                        i4 = ((iM3169 ^ i3) * 14141) ^ 2070643881;
                        i5 = -1023047743;
                    }
                    break;
                case -1268531489:
                case 592375716:
                    if (C1519.f5300 >= 0) {
                        iM3169 = (C0773.m3169("ܶܿ") ^ i3) * 13;
                        i4 = ((iM3169 ^ i2) * 12221) ^ (-229341673);
                        i5 = 322725985;
                    } else {
                        iM3169 = (i3 - C0619.m2761("۠ۨ")) * 61;
                        i4 = ((iM3169 ^ i2) * (-21879)) ^ 871215967;
                        i5 = -1525682144;
                    }
                    break;
                case -1110098881:
                case -415811132:
                    if (C0950.f3488 >= 0) {
                        iM3169 = (i3 - C0773.m3169("᩹۫")) * (-101);
                        i4 = ((iM3169 ^ i2) * 20099) ^ (-510406950);
                        i5 = -1144144683;
                    } else {
                        iM3169 = C0773.m3169("֨᩸") ^ i2;
                        i4 = ((iM3169 ^ i3) * 7373) ^ 673324812;
                        i5 = -61784396;
                    }
                    break;
                case -1029523964:
                case -558393964:
                    if (C2288.m7766()) {
                        iM3169 = C0619.m2761("ᩴ֡") ^ i2;
                        i4 = ((iM3169 ^ i3) * 5493) ^ 908206074;
                        i5 = 1960881494;
                    } else {
                        iM3169 = C0773.m3169("ۡ۬") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-28695)) ^ 1281376828;
                        i5 = -54636730;
                    }
                    break;
                case -1019132243:
                case 1722884647:
                    if (C4238.f15451 >= 0) {
                        iM3169 = (i3 - C0619.m2761("ۙ۬")) * 59;
                        i4 = ((iM3169 ^ i2) * 4447) ^ (-630296278);
                        i5 = -2011118743;
                    } else {
                        iM3169 = C0773.m3169("۟۠") ^ i3;
                        i4 = ((iM3169 ^ i2) * 18693) ^ 1629196342;
                        i5 = -882692156;
                    }
                    break;
                case -699879493:
                case -178839477:
                    if (C13473.f42873 != 0) {
                        iM3169 = C0773.m3169("᩸ۘ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-19491)) ^ 845000025;
                        i5 = -655679636;
                    } else {
                        iM3169 = (C0773.m3169("ܶܿ") ^ i3) * 13;
                        i4 = ((iM3169 ^ i2) * 12221) ^ (-229341673);
                        i5 = 322725985;
                    }
                    break;
                case -434412180:
                case 1698322297:
                    if (!C2023.f6737) {
                        iM3169 = (i3 - C0619.m2761("ۙ۬")) * 59;
                        i4 = ((iM3169 ^ i2) * 4447) ^ (-630296278);
                        i5 = -2011118743;
                    } else {
                        iM3169 = C0619.m2761("᩻۫") ^ i2;
                        i4 = ((iM3169 ^ i3) * 27781) ^ (-1926807055);
                        i5 = 639314867;
                    }
                    break;
                case 229995779:
                case 349814424:
                    if (C4282.f15546 <= 0) {
                        iM3169 = C0773.m3169("᩸ۘ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-19491)) ^ 845000025;
                        i5 = -655679636;
                    } else {
                        iM3169 = C0619.m2761("ۙ᩵") ^ i3;
                        i4 = ((iM3169 ^ i2) * 10843) ^ 1724577586;
                        i5 = -905108155;
                    }
                    break;
                case 418074883:
                case 526694350:
                    C2834.m9344();
                    iM3169 = (C0773.m3169("ܶܿ") ^ i3) * 13;
                    i4 = ((iM3169 ^ i2) * 12221) ^ (-229341673);
                    i5 = 322725985;
                    break;
                case 418237181:
                case 964436218:
                    C3492.m11488();
                    if (!RunnableC3646.f12471) {
                        iM3169 = (C0773.m3169("ܶܿ") ^ i3) * 13;
                        i4 = ((iM3169 ^ i2) * 12221) ^ (-229341673);
                        i5 = 322725985;
                    } else {
                        iM3169 = C0619.m2761("᩻۫") ^ i2;
                        i4 = ((iM3169 ^ i3) * 27781) ^ (-1926807055);
                        i5 = 639314867;
                    }
                    break;
                case 1168239044:
                case 1242617243:
                    if (C15243.m36589((Object) this.f1011, (Object) C0773.m3167())) {
                        iM3169 = C0773.m3169("۫ۘ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-13055)) ^ 1840201445;
                        i5 = -488383146;
                    } else {
                        iM3169 = C0773.m3169("ۡ۬") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-28695)) ^ 1281376828;
                        i5 = -54636730;
                    }
                    break;
                case 1439322592:
                case 1658620380:
                    if (RunnableC3646.f12471) {
                        iM3169 = (i3 - C0619.m2761("ۙ۬")) * 59;
                        i4 = ((iM3169 ^ i2) * 4447) ^ (-630296278);
                        i5 = -2011118743;
                    } else {
                        iM3169 = C0773.m3169("᩷ܿ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-1623)) ^ (-519369201);
                        i5 = 1171826967;
                    }
                    break;
                default:
                    AbstractC3624.m11755();
                    C1564.m5509();
                    break;
            }
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:37:0x012a A[PHI: r13 r14
      0x012a: PHI (r13v4 short[]) = (r13v3 short[]), (r13v2 short[]), (r13v2 short[]), (r13v2 short[]), (r13v2 short[]) binds: [B:36:0x0128, B:20:0x00ac, B:17:0x00a4, B:13:0x0083, B:9:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x012a: PHI (r14v4 int) = (r14v3 int), (r14v2 int), (r14v2 int), (r14v2 int), (r14v2 int) binds: [B:36:0x0128, B:20:0x00ac, B:17:0x00a4, B:13:0x0083, B:9:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:79:0x02ed A[PHI: r2 r10 r16 r18 r19 r26
      0x02ed: PHI (r2v82 short) = (r2v6 short), (r2v7 short), (r2v59 short), (r2v83 short) binds: [B:78:0x02eb, B:74:0x02cb, B:19:0x00a8, B:65:0x0269] A[DONT_GENERATE, DONT_INLINE]
      0x02ed: PHI (r10v6 java.lang.String) = (r10v2 java.lang.String), (r10v2 java.lang.String), (r10v4 java.lang.String), (r10v2 java.lang.String) binds: [B:78:0x02eb, B:74:0x02cb, B:19:0x00a8, B:65:0x0269] A[DONT_GENERATE, DONT_INLINE]
      0x02ed: PHI (r16v4 int) = (r16v2 int), (r16v2 int), (r16v2 int), (r16v6 int) binds: [B:78:0x02eb, B:74:0x02cb, B:19:0x00a8, B:65:0x0269] A[DONT_GENERATE, DONT_INLINE]
      0x02ed: PHI (r18v5 short[]) = (r18v3 short[]), (r18v2 short[]), (r18v2 short[]), (r18v2 short[]) binds: [B:78:0x02eb, B:74:0x02cb, B:19:0x00a8, B:65:0x0269] A[DONT_GENERATE, DONT_INLINE]
      0x02ed: PHI (r19v5 char) = (r19v2 char), (r19v3 char), (r19v2 char), (r19v2 char) binds: [B:78:0x02eb, B:74:0x02cb, B:19:0x00a8, B:65:0x0269] A[DONT_GENERATE, DONT_INLINE]
      0x02ed: PHI (r26v5 int) = (r26v3 int), (r26v3 int), (r26v3 int), (r26v6 int) binds: [B:78:0x02eb, B:74:0x02cb, B:19:0x00a8, B:65:0x0269] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a4, code lost:
    
        if (l.C2966.f9654 < 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0076, code lost:
    
        if (l.C0950.f3488 >= 0) goto L37;
     */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1176(boolean r28) {
        /*
            Method dump skipped, instruction units count: 1036
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ActivityC0093.m1176(boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m1165(ActivityC0093 activityC0093, JSONObject jSONObject) throws JSONException {
        int iM2761;
        int i;
        int i2;
        String str;
        String str2;
        String str3;
        short[] sArr;
        int i3;
        short[] sArr2;
        float f;
        short[] sArr3;
        C9042 c9042;
        int iM2762;
        int i4;
        int i5;
        int i6;
        String str4;
        int i7;
        int iM2763;
        short[] sArr4;
        short[] sArr5;
        short[] sArr6;
        int iM2764;
        int i8;
        int i9;
        ?? r6;
        boolean z;
        short[] sArr7;
        float f2;
        View viewM9476;
        Button button;
        boolean z2;
        boolean z3;
        short[] sArr8;
        float f3;
        int iM3169;
        int i10;
        int i11;
        int iM2765;
        int i12;
        int i13;
        int iM31610;
        int i14;
        ?? r7;
        ?? r8;
        ?? r9;
        ?? r10;
        ?? r11;
        String strM6246;
        int iM31611;
        int i15;
        int i16;
        TextView textView;
        int i17;
        View view;
        boolean z4;
        Button button2;
        int i18;
        short[] sArr9;
        float f4;
        short[] sArr10;
        String strOptString;
        short[] sArr11;
        int i19;
        int i20;
        String strOptString2;
        int iM31612;
        int i21;
        int i22;
        int iM2766;
        int i23;
        int i24;
        int iM31613;
        int i25;
        int i26;
        int iM31614;
        int i27;
        int i28;
        JSONObject jSONObject2 = jSONObject;
        short[] sArr12 = null;
        int i29 = -387107609;
        int i30 = C20932.f66974;
        int i31 = C1146.f4234;
        int iM2767 = (i31 - C0619.m2761("᩵᩵")) * (-119);
        int i32 = ((iM2767 ^ i30) * 10933) ^ (-1805655138);
        int i33 = iM2767 ^ 1425047548;
        View viewM9477 = null;
        TextView textView2 = null;
        View view2 = null;
        Button button3 = null;
        String strM8878 = null;
        TextView textView3 = null;
        TextView textView4 = null;
        String str5 = null;
        short[] sArr13 = null;
        short[] sArr14 = null;
        short[] sArr15 = null;
        short[] sArr16 = null;
        short[] sArr17 = null;
        int i34 = 0;
        int i35 = 0;
        char c = 0;
        int i36 = 0;
        String strM2361 = null;
        int i37 = 0;
        int i38 = 0;
        boolean z5 = false;
        boolean z6 = false;
        int i39 = 0;
        boolean z7 = false;
        float f5 = 0.0f;
        int i40 = 0;
        int i41 = 0;
        int i42 = 0;
        C9042 c9043 = null;
        String str6 = null;
        String str7 = null;
        TextView textView5 = null;
        TextView textView6 = null;
        int i43 = 0;
        int i44 = 0;
        int i45 = 0;
        while (true) {
            i29 = i33 ^ (i32 & (((i29 ^ i30) * 4049) >> 31));
            switch (i29) {
                case -2098846947:
                case -159303893:
                    textView4 = textView4;
                    str2 = str6;
                    str3 = str7;
                    sArr = sArr15;
                    i39 = i39;
                    view2 = view2;
                    z7 = z7;
                    button3 = button3;
                    i3 = i40;
                    sArr2 = sArr12;
                    f = f5;
                    sArr3 = sArr16;
                    String strM4238 = C1146.m4238(jSONObject2, C3077.m10047(f1008, 84, 5, i44));
                    str = strM2361;
                    C0269.m1781(strM4238, str);
                    c9042 = c9043;
                    c9042.m24145(strM4238);
                    sArr14 = f1008;
                    if (C1564.f5401 <= 0) {
                        iM2763 = C0619.m2761("۫ܳ") ^ i31;
                        str4 = str;
                        i7 = ((iM2763 ^ i30) * (-19141)) ^ (-2057118428);
                        i6 = 212591540;
                    } else {
                        str4 = str;
                        iM2763 = (C0619.m2761("ܿܺ") + i30) * 77;
                        i7 = ((iM2763 ^ i31) * (-6409)) ^ (-1292280116);
                        i6 = -1417304017;
                    }
                    i33 = iM2763 ^ i6;
                    i32 = i7;
                    strM2361 = str4;
                    sArr15 = sArr;
                    str7 = str3;
                    c9043 = c9042;
                    sArr16 = sArr3;
                    f5 = f;
                    sArr12 = sArr2;
                    r7 = i34;
                    i40 = i3;
                    button3 = button3;
                    z7 = z7;
                    view2 = view2;
                    i39 = i39;
                    str6 = str2;
                    i34 = r7;
                    textView4 = textView4;
                    break;
                case -2088948425:
                case 558371710:
                    button = button3;
                    z2 = false;
                    int iM2768 = C0619.m2761("ۗ᩶") ^ i31;
                    i33 = iM2768 ^ (-442569240);
                    i40 = i40;
                    button3 = button;
                    z7 = z2;
                    i32 = ((iM2768 ^ i30) * (-4183)) ^ 997928364;
                    sArr16 = sArr16;
                    f5 = f5;
                    sArr12 = sArr12;
                    i34 = i34;
                    textView4 = textView4;
                    break;
                case -2083054222:
                case -578397636:
                    f2 = f5;
                    i38 = 0;
                    iM31613 = (C0773.m3169("ۜ۠") + i30) * (-91);
                    i25 = ((iM31613 ^ i31) * 32537) ^ (-1402748716);
                    i26 = 1965592537;
                    i33 = iM31613 ^ i26;
                    i32 = i25;
                    textView4 = textView4;
                    View view3 = view2;
                    i39 = i39;
                    sArr16 = sArr16;
                    f5 = f2;
                    sArr12 = sArr12;
                    i40 = i40;
                    button3 = button3;
                    z7 = z7;
                    view2 = view3;
                    break;
                case -2082109333:
                case -1333077226:
                    if (!RunnableC0334.m2063()) {
                        textView4 = textView4;
                        i3 = i40;
                        sArr5 = sArr16;
                        int iM2769 = (C0619.m2761("ۚۡ") ^ i30) * (-61);
                        int i46 = ((iM2769 ^ i31) * 24105) ^ (-1562308193);
                        i16 = iM2769 ^ 1920647704;
                        c9043 = c9043;
                        i32 = i46;
                        sArr16 = sArr5;
                        f5 = f5;
                        sArr12 = sArr12;
                        textView4 = textView4;
                        str7 = str7;
                        sArr14 = sArr14;
                        i33 = i16;
                        i40 = i3;
                        button3 = button3;
                        z7 = z7;
                        view2 = view2;
                        i39 = i39;
                        str6 = str6;
                        strM2361 = strM2361;
                        jSONObject2 = jSONObject;
                    } else {
                        iM2761 = (C0773.m3169("ۡۘ") + i31) * (-65);
                        i = ((iM2761 ^ i30) * (-13871)) ^ 731494686;
                        i2 = 917097289;
                        i33 = iM2761 ^ i2;
                        i32 = i;
                    }
                    break;
                case -1962033315:
                case -1078013059:
                    iM31610 = C0773.m3169(C3033.m9847(f1008, 165, 3, i44));
                    i14 = 2129390187;
                    i43 = iM31610 ^ i14;
                    iM2765 = C0619.m2761("ܽۨ") ^ i30;
                    i12 = ((iM2765 ^ i31) * SecP160R2Field.PInv33) ^ (-1397851336);
                    i13 = 471093575;
                    i33 = iM2765 ^ i13;
                    i32 = i12;
                    i34 = i34;
                    textView4 = textView4;
                    break;
                case -1959325991:
                case -661537705:
                    textView4 = textView4;
                    z3 = z7;
                    button3 = button3;
                    sArr8 = sArr12;
                    i40 = i40;
                    f2 = f5;
                    sArr16 = sArr16;
                    if (!C0878.m3584((CharSequence) activityC0093.f1016)) {
                        iM31614 = C0773.m3169("ۙ۬") ^ i30;
                        i27 = ((iM31614 ^ i31) * 29069) ^ 1001819527;
                        i28 = -1054751727;
                        i33 = iM31614 ^ i28;
                        i32 = i27;
                        i40 = i40;
                        sArr16 = sArr16;
                        f5 = f2;
                        sArr12 = sArr8;
                        button3 = button3;
                        textView4 = textView4;
                        z7 = z3;
                    } else {
                        sArr12 = sArr8;
                        i39 = i39;
                        view2 = view2;
                        z7 = z3;
                        iM31613 = C0773.m3169("ۘܶ") ^ i30;
                        i25 = ((iM31613 ^ i31) * (-28085)) ^ (-912281894);
                        i26 = 193200293;
                        i33 = iM31613 ^ i26;
                        i32 = i25;
                        textView4 = textView4;
                        View view4 = view2;
                        i39 = i39;
                        sArr16 = sArr16;
                        f5 = f2;
                        sArr12 = sArr12;
                        i40 = i40;
                        button3 = button3;
                        z7 = z7;
                        view2 = view4;
                    }
                    break;
                case -1936702472:
                case -24077597:
                    textView4 = textView4;
                    C23916.m53425(textView6, strM8878);
                    textView3 = (TextView) C1564.m5518(activityC0093, C0619.m2761(C2419.m8166(f1008, 162, 3, i44)) ^ 2100011951);
                    textView3.setEnabled(i34);
                    if (activityC0093.f1013) {
                        iM2765 = C0619.m2761("᩸ۜ") ^ i31;
                        i12 = ((iM2765 ^ i30) * 13825) ^ 1361868069;
                        i13 = -378424732;
                    } else {
                        iM2765 = C0619.m2761("ۡۖ") ^ i31;
                        i12 = ((iM2765 ^ i30) * (-3403)) ^ 1286263066;
                        i13 = 264720746;
                    }
                    i33 = iM2765 ^ i13;
                    i32 = i12;
                    i34 = i34;
                    textView4 = textView4;
                    break;
                case -1893377399:
                case 1031312887:
                    Object[] objArr = new Object[i34];
                    objArr[c] = C3690.m12001(jSONObject2.getLong(C1519.m5399(f1008, 183, 10, i44)));
                    strM6246 = C13473.m33142(activityC0093, C0619.m2761(C2485.m8350(f1008, 193, 3, i44)) ^ 2129722213, objArr);
                    str5 = strM6246;
                    iM2765 = (i31 - C0773.m3169("ܶۗ")) * (-31);
                    i12 = ((iM2765 ^ i30) * (-15495)) ^ 1528229991;
                    i13 = 950370980;
                    i33 = iM2765 ^ i13;
                    i32 = i12;
                    i34 = i34;
                    textView4 = textView4;
                    break;
                case -1886322914:
                case -800909002:
                    f2 = f5;
                    i37 = 0;
                    iM2766 = (i30 - C0619.m2761("֨ۧ")) * (-95);
                    i23 = ((iM2766 ^ i31) * 1035) ^ (-986949668);
                    i24 = 2059782497;
                    i33 = iM2766 ^ i24;
                    str7 = str7;
                    i32 = i23;
                    textView4 = textView4;
                    View view5 = view2;
                    i39 = i39;
                    sArr16 = sArr16;
                    f5 = f2;
                    sArr12 = sArr12;
                    i40 = i40;
                    button3 = button3;
                    z7 = z7;
                    view2 = view5;
                    break;
                case -1879174762:
                case 1420213163:
                    textView4 = textView4;
                    z3 = z7;
                    button3 = button3;
                    sArr8 = sArr12;
                    i40 = i40;
                    f2 = f5;
                    sArr16 = sArr16;
                    if (C0878.m3584((CharSequence) str6)) {
                        iM31614 = (i30 - C0619.m2761("ۖۤ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i27 = ((iM31614 ^ i31) * 15379) ^ (-287095684);
                        i28 = -826715676;
                    } else {
                        iM31614 = C0773.m3169("ۚܶ") ^ i30;
                        i27 = ((iM31614 ^ i31) * (-30579)) ^ (-1246965764);
                        i28 = -1057236900;
                    }
                    i33 = iM31614 ^ i28;
                    i32 = i27;
                    i40 = i40;
                    sArr16 = sArr16;
                    f5 = f2;
                    sArr12 = sArr8;
                    button3 = button3;
                    textView4 = textView4;
                    z7 = z3;
                    break;
                case -1869925033:
                case -42305120:
                    textView4 = textView4;
                    if (z6) {
                        iM2765 = C0773.m3169("ܰ۠") ^ i30;
                        i12 = ((iM2765 ^ i31) * 5295) ^ 20260099;
                        i13 = 902368027;
                    } else {
                        iM2765 = C0619.m2761("᩵֨") ^ i31;
                        i12 = ((iM2765 ^ i30) * (-12213)) ^ (-1594338590);
                        i13 = -1929186778;
                    }
                    i33 = iM2765 ^ i13;
                    i32 = i12;
                    i34 = i34;
                    textView4 = textView4;
                    break;
                case -1818045203:
                case 920157833:
                    textView4 = textView4;
                    C2023.m6954(textView3, i43);
                    z6 = jSONObject2.getBoolean(C20932.m47853(f1008, 171, 6, i44));
                    sArr17 = f1008;
                    i35 = 177;
                    if (!C3690.m11987()) {
                        iM2765 = C0619.m2761("ۡۡ") ^ i31;
                        i12 = ((iM2765 ^ i30) * (-7499)) ^ 1127416410;
                        i13 = -30535395;
                        i33 = iM2765 ^ i13;
                        i32 = i12;
                        i34 = i34;
                        textView4 = textView4;
                    } else {
                        str2 = str6;
                        str7 = str7;
                        sArr4 = sArr15;
                        i39 = i39;
                        view2 = view2;
                        z7 = z7;
                        button3 = button3;
                        i3 = i40;
                        sArr12 = sArr12;
                        f5 = f5;
                        sArr5 = sArr16;
                        r6 = i34;
                        sArr6 = sArr14;
                        r11 = r6;
                        iM2764 = C0773.m3169("ۖ۠") ^ i31;
                        i8 = ((iM2764 ^ i30) * 30365) ^ 1093933636;
                        i9 = 15949790;
                        r10 = r11;
                        i33 = iM2764 ^ i9;
                        i32 = i8;
                        sArr14 = sArr6;
                        r9 = r10;
                        sArr15 = sArr4;
                        r8 = r9;
                        sArr16 = sArr5;
                        f5 = f5;
                        sArr12 = sArr12;
                        str7 = str7;
                        r7 = r8;
                        i40 = i3;
                        button3 = button3;
                        z7 = z7;
                        view2 = view2;
                        i39 = i39;
                        str6 = str2;
                        i34 = r7;
                        textView4 = textView4;
                    }
                    break;
                case -1777933757:
                case 216595872:
                    textView4 = textView4;
                    View view6 = view2;
                    short[] sArr18 = sArr12;
                    i40 = i40;
                    f2 = f5;
                    sArr16 = sArr16;
                    i39 = i39;
                    C13473.m33140(view6, i39);
                    view2 = view6;
                    z7 = z7;
                    sArr12 = sArr18;
                    Button button4 = (Button) C2878.m9476(activityC0093, C0619.m2761(C2375.m8069(f1008, 135, 3, i44)) ^ 2129529532);
                    if (!z5) {
                        button3 = button4;
                        iM31613 = C0773.m3169("ۘܶ") ^ i30;
                        i25 = ((iM31613 ^ i31) * (-28085)) ^ (-912281894);
                        i26 = 193200293;
                        i33 = iM31613 ^ i26;
                        i32 = i25;
                        textView4 = textView4;
                        View view7 = view2;
                        i39 = i39;
                        sArr16 = sArr16;
                        f5 = f2;
                        sArr12 = sArr12;
                        i40 = i40;
                        button3 = button3;
                        z7 = z7;
                        view2 = view7;
                    } else {
                        int iM31615 = (C0773.m3169("᩷ܳ") + i31) * (-33);
                        i4 = ((iM31615 ^ i30) * (-13941)) ^ 1039909027;
                        i33 = iM31615 ^ (-413036811);
                        z7 = z7;
                        view2 = view2;
                        i39 = i39;
                        sArr16 = sArr16;
                        f5 = f2;
                        sArr12 = sArr12;
                        i40 = i40;
                        button3 = button4;
                        i32 = i4;
                        i34 = i34;
                        textView4 = textView4;
                    }
                    break;
                case -1714683611:
                case 1553625510:
                    C23916.m53425(textView4, str5);
                    return;
                case -1596119251:
                case 1602711850:
                    textView4 = textView4;
                    String str8 = strM2361;
                    String str9 = str6;
                    String str10 = str7;
                    short[] sArr19 = sArr15;
                    int i47 = i39;
                    View view8 = view2;
                    boolean z8 = z7;
                    Button button5 = button3;
                    int i48 = i40;
                    short[] sArr20 = sArr12;
                    float f6 = f5;
                    short[] sArr21 = sArr16;
                    short[] sArr22 = sArr14;
                    short[] sArr23 = sArr13;
                    String strOptString3 = jSONObject2.optString(AbstractC0116.m1236(sArr23, 52, 9, i44));
                    C0269.m1781(strOptString3, C2310.m7803(f1008, 61, 14, i44));
                    activityC0093.f1016 = strOptString3;
                    C9042 c9044 = activityC0093.f1015;
                    if (c9044 != null) {
                        iM2762 = C0773.m3169("ܳ֫") ^ i30;
                        i4 = ((iM2762 ^ i31) * (-685)) ^ 2082202619;
                        i5 = -598926474;
                    } else {
                        iM2762 = (C0619.m2761("ۘ۬") ^ i31) * 123;
                        i4 = ((iM2762 ^ i30) * (-2353)) ^ 1676115569;
                        i5 = 1720824768;
                    }
                    int i49 = iM2762 ^ i5;
                    sArr15 = sArr19;
                    sArr16 = sArr21;
                    f5 = f6;
                    sArr12 = sArr20;
                    str7 = str10;
                    sArr13 = sArr23;
                    sArr14 = sArr22;
                    i33 = i49;
                    i40 = i48;
                    button3 = button5;
                    z7 = z8;
                    view2 = view8;
                    i39 = i47;
                    str6 = str9;
                    strM2361 = str8;
                    c9043 = c9044;
                    i32 = i4;
                    i34 = i34;
                    textView4 = textView4;
                    break;
                case -1524942542:
                case 106886382:
                    C2702.m8876();
                    RunnableC3646.m11813();
                    textView4 = textView4;
                    sArr12 = sArr12;
                    iM3169 = C0773.m3169("᩶ۜ") ^ i30;
                    i10 = ((iM3169 ^ i31) * (-30925)) ^ (-21466012);
                    i11 = 117244246;
                    i33 = iM3169 ^ i11;
                    i32 = i10;
                    sArr12 = sArr12;
                    i34 = i34;
                    textView4 = textView4;
                    break;
                case -1462110078:
                case 741536501:
                    C3099.m10095();
                    RunnableC3055.m9933();
                    return;
                case -1393343918:
                case 296845242:
                    C2834.m9335(C0773.m3166(f1008, 75, 9, i44));
                    throw null;
                case -1376868722:
                case 63470771:
                    textView4 = textView4;
                    c9043 = c9043;
                    strM2361 = strM2361;
                    str6 = str6;
                    str7 = str7;
                    sArr13 = sArr13;
                    sArr14 = sArr14;
                    sArr15 = sArr15;
                    i39 = i39;
                    view2 = view2;
                    z7 = z7;
                    button3 = button3;
                    i40 = i40;
                    sArr12 = sArr12;
                    f5 = f5;
                    sArr16 = sArr16;
                    short s = f1008[33];
                    int i50 = s + 14577;
                    int i51 = (s * s) + 212488929;
                    if ((i51 + i51) - (i50 * i50) < 0) {
                        iM31611 = C0619.m2761("۫۫") ^ i30;
                        i = ((iM31611 ^ i31) * 32219) ^ 741867755;
                        i15 = 579570953;
                    } else {
                        iM31611 = (i31 - C0773.m3169("ۢܰ")) * (-79);
                        i = ((iM31611 ^ i30) * 30167) ^ 2119960356;
                        i15 = 1276522576;
                    }
                    int i52 = iM31611 ^ i15;
                    sArr15 = sArr15;
                    sArr16 = sArr16;
                    f5 = f5;
                    sArr12 = sArr12;
                    textView4 = textView4;
                    str7 = str7;
                    sArr13 = sArr13;
                    sArr14 = sArr14;
                    i33 = i52;
                    i40 = i40;
                    jSONObject2 = jSONObject;
                    button3 = button3;
                    z7 = z7;
                    view2 = view2;
                    i39 = i39;
                    str6 = str6;
                    strM2361 = strM2361;
                    c9043 = c9043;
                    i32 = i;
                    break;
                case -1360967301:
                case -202200506:
                    if (!C0862.m3503()) {
                        textView = textView4;
                        strOptString2 = str7;
                        sArr11 = sArr15;
                        i19 = i41;
                        i20 = i42;
                        float f7 = f5;
                        sArr10 = sArr16;
                        strOptString = str6;
                        i17 = i39;
                        view = view2;
                        z4 = z7;
                        button2 = button3;
                        i18 = i40;
                        sArr9 = sArr12;
                        f4 = f7;
                        iM31612 = C0773.m3169("۫᩷") ^ i31;
                        i21 = ((iM31612 ^ i30) * (-32647)) ^ (-1628911388);
                        i22 = -113384875;
                        i33 = iM31612 ^ i22;
                        sArr15 = sArr11;
                        i41 = i19;
                        i42 = i20;
                        str7 = strOptString2;
                        i32 = i21;
                        textView4 = textView;
                        int i53 = i17;
                        str6 = strOptString;
                        sArr16 = sArr10;
                        f5 = f4;
                        sArr12 = sArr9;
                        i40 = i18;
                        button3 = button2;
                        z7 = z4;
                        view2 = view;
                        i39 = i53;
                    } else {
                        iM2761 = (C0773.m3169("ۡۘ") + i31) * (-65);
                        i = ((iM2761 ^ i30) * (-13871)) ^ 731494686;
                        i2 = 917097289;
                        i33 = iM2761 ^ i2;
                        i32 = i;
                    }
                    break;
                case -1284426769:
                case -1127063522:
                    if (!C1321.m4852()) {
                        iM2761 = (C0619.m2761("ۜۨ") ^ i30) * (-107);
                        i = ((iM2761 ^ i31) * 7779) ^ (-1448081653);
                        i2 = 826435501;
                        i33 = iM2761 ^ i2;
                        i32 = i;
                    } else {
                        textView4 = textView4;
                        sArr12 = sArr12;
                        iM3169 = C0773.m3169("᩶ۜ") ^ i30;
                        i10 = ((iM3169 ^ i31) * (-30925)) ^ (-21466012);
                        i11 = 117244246;
                        i33 = iM3169 ^ i11;
                        i32 = i10;
                        sArr12 = sArr12;
                        i34 = i34;
                        textView4 = textView4;
                    }
                    break;
                case -1278364707:
                case -472404505:
                    C1080.m4050();
                    if (C2966.f9654 < 0) {
                        textView4 = textView4;
                        str = strM2361;
                        str2 = str6;
                        str3 = str7;
                        sArr = sArr15;
                        i39 = i39;
                        view2 = view2;
                        z7 = z7;
                        button3 = button3;
                        i3 = i40;
                        sArr2 = sArr12;
                        f = f5;
                        sArr3 = sArr16;
                        c9042 = c9043;
                        iM2763 = C0619.m2761("۫ܳ") ^ i31;
                        str4 = str;
                        i7 = ((iM2763 ^ i30) * (-19141)) ^ (-2057118428);
                        i6 = 212591540;
                        i33 = iM2763 ^ i6;
                        i32 = i7;
                        strM2361 = str4;
                        sArr15 = sArr;
                        str7 = str3;
                        c9043 = c9042;
                        sArr16 = sArr3;
                        f5 = f;
                        sArr12 = sArr2;
                        r7 = i34;
                        i40 = i3;
                        button3 = button3;
                        z7 = z7;
                        view2 = view2;
                        i39 = i39;
                        str6 = str2;
                        i34 = r7;
                        textView4 = textView4;
                    } else {
                        iM2761 = (C0773.m3169("ۡۘ") + i31) * (-65);
                        i = ((iM2761 ^ i30) * (-13871)) ^ 731494686;
                        i2 = 917097289;
                        i33 = iM2761 ^ i2;
                        i32 = i;
                    }
                    break;
                case -1154782004:
                case 1229212859:
                    if (C1826.m6301() >= 0) {
                        iM2761 = (C0619.m2761("ۡ᩷") ^ i30) * 51;
                        i = ((iM2761 ^ i31) * (-14095)) ^ (-597467327);
                        i2 = 895909108;
                        i33 = iM2761 ^ i2;
                        i32 = i;
                    } else {
                        textView4 = textView4;
                        sArr12 = sArr12;
                        iM3169 = C0773.m3169("᩶ۜ") ^ i30;
                        i10 = ((iM3169 ^ i31) * (-30925)) ^ (-21466012);
                        i11 = 117244246;
                        i33 = iM3169 ^ i11;
                        i32 = i10;
                        sArr12 = sArr12;
                        i34 = i34;
                        textView4 = textView4;
                    }
                    break;
                case -1110556908:
                case 247135479:
                    textView4 = textView4;
                    z = z7;
                    button3 = button3;
                    i40 = i40;
                    sArr7 = sArr12;
                    f2 = f5;
                    sArr16 = sArr16;
                    int i54 = i39;
                    C2485.m8358(textView5, i38);
                    viewM9476 = C2878.m9476(activityC0093, C0619.m2761(C23916.m53420(f1008, 132, 3, i44)) ^ 2100210830);
                    if (z5) {
                        i39 = i36;
                        int iM27610 = C0619.m2761("ۢۢ") ^ i31;
                        i4 = ((iM27610 ^ i30) * (-2927)) ^ (-1145038508);
                        i33 = iM27610 ^ (-1131315230);
                    } else {
                        int iM31616 = C0773.m3169("ܺܶ") ^ i31;
                        i4 = ((iM31616 ^ i30) * (-8741)) ^ 1374884804;
                        i33 = iM31616 ^ 1065855144;
                        i39 = i54;
                    }
                    sArr16 = sArr16;
                    f5 = f2;
                    sArr12 = sArr7;
                    i40 = i40;
                    button3 = button3;
                    z7 = z;
                    view2 = viewM9476;
                    i32 = i4;
                    i34 = i34;
                    textView4 = textView4;
                    break;
                case -1088059170:
                case 461230629:
                    C1146.m4231();
                    if (C1519.f5300 < 0) {
                        iM2761 = C0619.m2761("ۢۙ") ^ i31;
                        i = ((iM2761 ^ i30) * 26361) ^ (-352049651);
                        i2 = 1133193331;
                    } else {
                        iM2761 = (i30 - C0773.m3169("֡۟")) * (-95);
                        i = ((iM2761 ^ i31) * (-21635)) ^ 348090427;
                        i2 = 1788542147;
                    }
                    i33 = iM2761 ^ i2;
                    i32 = i;
                    break;
                case -1056334068:
                case 1491460395:
                    textView4 = textView4;
                    str2 = str6;
                    str7 = str7;
                    sArr4 = sArr15;
                    i39 = i39;
                    view2 = view2;
                    z7 = z7;
                    button3 = button3;
                    i3 = i40;
                    sArr12 = sArr12;
                    f5 = f5;
                    sArr5 = sArr16;
                    C2354.m7978((TextView) viewM9477, activityC0093.f1018);
                    r6 = 1;
                    r9 = 1;
                    C23916.m53431((Button) C1564.m5518(activityC0093, C0619.m2761(RunnableC3055.m9937(f1008, 92, 3, i44)) ^ 2099378609), true);
                    if (C3734.f12817 >= 0) {
                        sArr6 = sArr14;
                        r11 = r6;
                        iM2764 = C0773.m3169("ۖ۠") ^ i31;
                        i8 = ((iM2764 ^ i30) * 30365) ^ 1093933636;
                        i9 = 15949790;
                        r10 = r11;
                        i33 = iM2764 ^ i9;
                        i32 = i8;
                        sArr14 = sArr6;
                        r9 = r10;
                    } else {
                        int iM27611 = (C0619.m2761("ۢ۠") + i31) * 39;
                        i33 = iM27611 ^ 171904855;
                        i32 = ((iM27611 ^ i30) * 10965) ^ 47739198;
                    }
                    sArr15 = sArr4;
                    r8 = r9;
                    sArr16 = sArr5;
                    f5 = f5;
                    sArr12 = sArr12;
                    str7 = str7;
                    r7 = r8;
                    i40 = i3;
                    button3 = button3;
                    z7 = z7;
                    view2 = view2;
                    i39 = i39;
                    str6 = str2;
                    i34 = r7;
                    textView4 = textView4;
                    break;
                case -1016824896:
                case 716880931:
                    textView4 = textView4;
                    z3 = z7;
                    button3 = button3;
                    sArr8 = sArr12;
                    i40 = i40;
                    f2 = f5;
                    sArr16 = sArr16;
                    if (!C0878.m3584((CharSequence) str7)) {
                        iM31614 = C0773.m3169("ۚܶ") ^ i30;
                        i27 = ((iM31614 ^ i31) * (-30579)) ^ (-1246965764);
                        i28 = -1057236900;
                        i33 = iM31614 ^ i28;
                        i32 = i27;
                        i40 = i40;
                        sArr16 = sArr16;
                        f5 = f2;
                        sArr12 = sArr8;
                        button3 = button3;
                        textView4 = textView4;
                        z7 = z3;
                    } else {
                        sArr7 = sArr8;
                        viewM9476 = view2;
                        z = z3;
                        i39 = i36;
                        int iM27612 = C0619.m2761("ۢۢ") ^ i31;
                        i4 = ((iM27612 ^ i30) * (-2927)) ^ (-1145038508);
                        i33 = iM27612 ^ (-1131315230);
                        sArr16 = sArr16;
                        f5 = f2;
                        sArr12 = sArr7;
                        i40 = i40;
                        button3 = button3;
                        z7 = z;
                        view2 = viewM9476;
                        i32 = i4;
                        i34 = i34;
                        textView4 = textView4;
                    }
                    break;
                case -998808616:
                case 1382357965:
                    f2 = f5;
                    i38 = 8;
                    iM31613 = (C0773.m3169("ۜ۠") + i30) * (-91);
                    i25 = ((iM31613 ^ i31) * 32537) ^ (-1402748716);
                    i26 = 1965592537;
                    i33 = iM31613 ^ i26;
                    i32 = i25;
                    textView4 = textView4;
                    View view9 = view2;
                    i39 = i39;
                    sArr16 = sArr16;
                    f5 = f2;
                    sArr12 = sArr12;
                    i40 = i40;
                    button3 = button3;
                    z7 = z7;
                    view2 = view9;
                    break;
                case -960086684:
                case 639227623:
                    i44 = 11612;
                    iM31611 = C0619.m2761("ܶۘ") ^ i30;
                    i = ((iM31611 ^ i31) * (-13149)) ^ (-819393058);
                    i15 = 1187286680;
                    int i55 = iM31611 ^ i15;
                    sArr15 = sArr15;
                    sArr16 = sArr16;
                    f5 = f5;
                    sArr12 = sArr12;
                    textView4 = textView4;
                    str7 = str7;
                    sArr13 = sArr13;
                    sArr14 = sArr14;
                    i33 = i55;
                    i40 = i40;
                    jSONObject2 = jSONObject;
                    button3 = button3;
                    z7 = z7;
                    view2 = view2;
                    i39 = i39;
                    str6 = str6;
                    strM2361 = strM2361;
                    c9043 = c9043;
                    i32 = i;
                    break;
                case -832106560:
                case -392048489:
                    textView4 = textView4;
                    str2 = str6;
                    i39 = i39;
                    view2 = view2;
                    z7 = z7;
                    button3 = button3;
                    i3 = i40;
                    sArr12 = sArr12;
                    f5 = f5;
                    sArr5 = sArr16;
                    str7 = str7;
                    z5 = jSONObject2.getBoolean(C2287.m7749(f1008, 95, 6, i44));
                    sArr15 = f1008;
                    i41 = 101;
                    i42 = 13;
                    if (C0487.m2356() < 0) {
                        int iM27613 = (i30 - C0619.m2761("᩸ۗ")) * (-105);
                        i33 = iM27613 ^ 1735951584;
                        i32 = ((iM27613 ^ i31) * 11589) ^ 361428920;
                        r8 = i34;
                        sArr16 = sArr5;
                        f5 = f5;
                        sArr12 = sArr12;
                        str7 = str7;
                        r7 = r8;
                        i40 = i3;
                        button3 = button3;
                        z7 = z7;
                        view2 = view2;
                        i39 = i39;
                        str6 = str2;
                        i34 = r7;
                        textView4 = textView4;
                    } else {
                        c9043 = c9043;
                        strM2361 = strM2361;
                        sArr14 = sArr14;
                        str6 = str2;
                        int iM27614 = (C0619.m2761("ۚۡ") ^ i30) * (-61);
                        int i410 = ((iM27614 ^ i31) * 24105) ^ (-1562308193);
                        i16 = iM27614 ^ 1920647704;
                        c9043 = c9043;
                        i32 = i410;
                        sArr16 = sArr5;
                        f5 = f5;
                        sArr12 = sArr12;
                        textView4 = textView4;
                        str7 = str7;
                        sArr14 = sArr14;
                        i33 = i16;
                        i40 = i3;
                        button3 = button3;
                        z7 = z7;
                        view2 = view2;
                        i39 = i39;
                        str6 = str6;
                        strM2361 = strM2361;
                        jSONObject2 = jSONObject;
                    }
                    break;
                case -831904020:
                case -428873600:
                    f3 = 0.45f;
                    int iM27615 = (i30 - C0619.m2761("᩵֡")) * (-61);
                    float f8 = f3;
                    i10 = ((iM27615 ^ i31) * (-23605)) ^ (-1834318170);
                    i33 = iM27615 ^ (-683913364);
                    i40 = i40;
                    sArr16 = sArr16;
                    f5 = f8;
                    button3 = button3;
                    i32 = i10;
                    sArr12 = sArr12;
                    i34 = i34;
                    textView4 = textView4;
                    break;
                case -811805545:
                case 1686172007:
                    textView4 = textView4;
                    float f9 = f5;
                    sArr16 = sArr16;
                    i39 = i39;
                    view2 = view2;
                    z7 = z7;
                    button3 = button3;
                    i40 = i40;
                    sArr12 = sArr12;
                    f2 = f9;
                    C13473.m33140(textView2, i37);
                    TextView textView7 = (TextView) C1564.m5518(activityC0093, C0773.m3169(C1321.m4861(f1008, 129, 3, i44)) ^ 2100544915);
                    str7 = str7;
                    C2354.m7978(textView7, str7);
                    RunnableC3646.m11808(str7);
                    if (C0878.m3584((CharSequence) str7)) {
                        int iM31617 = (C0773.m3169("ۤۛ") ^ i30) * 101;
                        textView5 = textView7;
                        i32 = ((iM31617 ^ i31) * 26699) ^ (-1305339331);
                        i33 = iM31617 ^ 653467810;
                        str7 = str7;
                    } else {
                        textView5 = textView7;
                        iM2766 = C0619.m2761("ᩴܰ") ^ i31;
                        i23 = ((iM2766 ^ i30) * (-427)) ^ (-1357021607);
                        i24 = 867006540;
                        i33 = iM2766 ^ i24;
                        str7 = str7;
                        i32 = i23;
                    }
                    textView4 = textView4;
                    View view10 = view2;
                    i39 = i39;
                    sArr16 = sArr16;
                    f5 = f2;
                    sArr12 = sArr12;
                    i40 = i40;
                    button3 = button3;
                    z7 = z7;
                    view2 = view10;
                    break;
                case -449879838:
                case 449098375:
                    textView4 = textView4;
                    Button button6 = button3;
                    float f10 = f5;
                    C0862.m3504(button6, f10);
                    i3 = i40;
                    sArr5 = sArr16;
                    int iM7759 = C2288.m7759(jSONObject2, C3998.m12925(f1008, 138, 6, i44));
                    activityC0093.f1013 = jSONObject2.getBoolean(C2023.m6966(f1008, 144, 7, i44));
                    short[] sArr24 = f1008;
                    if (C1080.f3865 >= 0) {
                        sArr12 = sArr24;
                        str2 = str6;
                        str7 = str7;
                        sArr6 = sArr14;
                        sArr4 = sArr15;
                        i39 = i39;
                        view2 = view2;
                        z7 = z7;
                        button3 = button6;
                        f5 = f10;
                        i45 = iM7759;
                        r11 = i34;
                        iM2764 = C0773.m3169("ۖ۠") ^ i31;
                        i8 = ((iM2764 ^ i30) * 30365) ^ 1093933636;
                        i9 = 15949790;
                        r10 = r11;
                        i33 = iM2764 ^ i9;
                        i32 = i8;
                        sArr14 = sArr6;
                        r9 = r10;
                        sArr15 = sArr4;
                        r8 = r9;
                        sArr16 = sArr5;
                        f5 = f5;
                        sArr12 = sArr12;
                        str7 = str7;
                        r7 = r8;
                        i40 = i3;
                        button3 = button3;
                        z7 = z7;
                        view2 = view2;
                        i39 = i39;
                        str6 = str2;
                        i34 = r7;
                        textView4 = textView4;
                    } else {
                        int iM27616 = (i31 - C0619.m2761("ܳ۬")) * (-29);
                        int i56 = ((iM27616 ^ i30) * (-16769)) ^ 1241874966;
                        i33 = iM27616 ^ 714248219;
                        i40 = i3;
                        textView4 = textView4;
                        button3 = button6;
                        i32 = i56;
                        sArr16 = sArr5;
                        f5 = f10;
                        i45 = iM7759;
                        sArr12 = sArr24;
                    }
                    break;
                case -365442235:
                case 1714277222:
                    textView4 = textView4;
                    boolean z9 = z7;
                    button3 = button3;
                    short[] sArr25 = sArr12;
                    i40 = i40;
                    f2 = f5;
                    sArr16 = sArr16;
                    sArr7 = sArr25;
                    viewM9476 = view2;
                    i39 = 0;
                    z = z9;
                    int iM27617 = C0619.m2761("ۢۢ") ^ i31;
                    i4 = ((iM27617 ^ i30) * (-2927)) ^ (-1145038508);
                    i33 = iM27617 ^ (-1131315230);
                    sArr16 = sArr16;
                    f5 = f2;
                    sArr12 = sArr7;
                    i40 = i40;
                    button3 = button3;
                    z7 = z;
                    view2 = viewM9476;
                    i32 = i4;
                    i34 = i34;
                    textView4 = textView4;
                    break;
                case -336734297:
                case -311223804:
                    button = button3;
                    z2 = true;
                    int iM27618 = C0619.m2761("ۗ᩶") ^ i31;
                    i33 = iM27618 ^ (-442569240);
                    i40 = i40;
                    button3 = button;
                    z7 = z2;
                    i32 = ((iM27618 ^ i30) * (-4183)) ^ 997928364;
                    sArr16 = sArr16;
                    f5 = f5;
                    sArr12 = sArr12;
                    i34 = i34;
                    textView4 = textView4;
                    break;
                case -247853644:
                case 520431150:
                    Object[] objArr2 = new Object[i34];
                    objArr2[c] = C0619.m2764(C2702.m8880(jSONObject2, C17202.m40377(f1008, 196, 10, i44)));
                    strM6246 = C2485.m8354(activityC0093, C0773.m3169(RunnableC3055.m9937(f1008, 206, 3, i44)) ^ 2097396803, objArr2);
                    str5 = strM6246;
                    iM2765 = (i31 - C0773.m3169("ܶۗ")) * (-31);
                    i12 = ((iM2765 ^ i30) * (-15495)) ^ 1528229991;
                    i13 = 950370980;
                    i33 = iM2765 ^ i13;
                    i32 = i12;
                    i34 = i34;
                    textView4 = textView4;
                    break;
                case -179011186:
                case 1960712260:
                    C3077.m10041();
                    if (!C17202.m40372()) {
                        textView4 = textView4;
                        str = strM2361;
                        str2 = str6;
                        str3 = str7;
                        sArr = sArr15;
                        i39 = i39;
                        view2 = view2;
                        z7 = z7;
                        button3 = button3;
                        i3 = i40;
                        sArr2 = sArr12;
                        f = f5;
                        sArr3 = sArr16;
                        c9042 = c9043;
                        iM2763 = C0619.m2761("۫ܳ") ^ i31;
                        str4 = str;
                        i7 = ((iM2763 ^ i30) * (-19141)) ^ (-2057118428);
                        i6 = 212591540;
                        i33 = iM2763 ^ i6;
                        i32 = i7;
                        strM2361 = str4;
                        sArr15 = sArr;
                        str7 = str3;
                        c9043 = c9042;
                        sArr16 = sArr3;
                        f5 = f;
                        sArr12 = sArr2;
                        r7 = i34;
                        i40 = i3;
                        button3 = button3;
                        z7 = z7;
                        view2 = view2;
                        i39 = i39;
                        str6 = str2;
                        i34 = r7;
                        textView4 = textView4;
                    } else {
                        iM2761 = C0619.m2761("ۢۙ") ^ i31;
                        i = ((iM2761 ^ i30) * 26361) ^ (-352049651);
                        i2 = 1133193331;
                        i33 = iM2761 ^ i2;
                        i32 = i;
                    }
                    break;
                case -78110310:
                case 138909932:
                    i44 = 45705;
                    iM31611 = C0619.m2761("ܶۘ") ^ i30;
                    i = ((iM31611 ^ i31) * (-13149)) ^ (-819393058);
                    i15 = 1187286680;
                    int i57 = iM31611 ^ i15;
                    sArr15 = sArr15;
                    sArr16 = sArr16;
                    f5 = f5;
                    sArr12 = sArr12;
                    textView4 = textView4;
                    str7 = str7;
                    sArr13 = sArr13;
                    sArr14 = sArr14;
                    i33 = i57;
                    i40 = i40;
                    jSONObject2 = jSONObject;
                    button3 = button3;
                    z7 = z7;
                    view2 = view2;
                    i39 = i39;
                    str6 = str6;
                    strM2361 = strM2361;
                    c9043 = c9043;
                    i32 = i;
                    break;
                case -42911388:
                case 434963172:
                    textView4 = textView4;
                    str7 = str7;
                    float f11 = f5;
                    sArr16 = sArr16;
                    i39 = i39;
                    view2 = view2;
                    z7 = z7;
                    button3 = button3;
                    i40 = i40;
                    sArr12 = sArr12;
                    f2 = f11;
                    TextView textView8 = (TextView) C2878.m9476(activityC0093, C0773.m3169(RunnableC3646.m11809(f1008, 126, 3, i44)) ^ 2122379892);
                    String str11 = str6;
                    C23916.m53425(textView8, str11);
                    RunnableC3646.m11808(str11);
                    i36 = 8;
                    if (C0878.m3584((CharSequence) str11)) {
                        int iM31618 = C0773.m3169("ܺۨ") ^ i31;
                        i32 = ((iM31618 ^ i30) * 11103) ^ (-118133909);
                        i33 = iM31618 ^ (-2023392695);
                    } else {
                        int iM31619 = (C0773.m3169("ۧ᩺") + i30) * (-105);
                        i33 = iM31619 ^ (-1579402370);
                        i32 = ((iM31619 ^ i31) * (-21517)) ^ (-649032170);
                    }
                    textView2 = textView8;
                    c = 0;
                    str6 = str11;
                    textView4 = textView4;
                    View view11 = view2;
                    i39 = i39;
                    sArr16 = sArr16;
                    f5 = f2;
                    sArr12 = sArr12;
                    i40 = i40;
                    button3 = button3;
                    z7 = z7;
                    view2 = view11;
                    break;
                case 96071790:
                case 1812504703:
                    textView4 = textView4;
                    c9043 = c9043;
                    str6 = str6;
                    str7 = str7;
                    sArr14 = sArr14;
                    short[] sArr26 = sArr15;
                    i39 = i39;
                    view2 = view2;
                    z7 = z7;
                    button3 = button3;
                    i3 = i40;
                    sArr12 = sArr12;
                    f5 = f5;
                    sArr5 = sArr16;
                    String strM11810 = RunnableC3646.m11810(jSONObject2, C2419.m8166(f1008, 34, 4, i44));
                    strM2361 = C0487.m2361(f1008, 38, 14, i44);
                    C0269.m1781(strM11810, strM2361);
                    activityC0093.f1018 = strM11810;
                    sArr13 = f1008;
                    if (C1146.m4231()) {
                        int iM27619 = (C0619.m2761("᩻֡") + i31) * 79;
                        int i58 = ((iM27619 ^ i30) * 9109) ^ (-918553914);
                        i16 = iM27619 ^ (-693225771);
                        c9043 = c9043;
                        i32 = i58;
                        sArr15 = sArr26;
                    } else {
                        sArr15 = sArr26;
                        int iM276110 = (C0619.m2761("ۚۡ") ^ i30) * (-61);
                        int i411 = ((iM276110 ^ i31) * 24105) ^ (-1562308193);
                        i16 = iM276110 ^ 1920647704;
                        c9043 = c9043;
                        i32 = i411;
                    }
                    sArr16 = sArr5;
                    f5 = f5;
                    sArr12 = sArr12;
                    textView4 = textView4;
                    str7 = str7;
                    sArr14 = sArr14;
                    i33 = i16;
                    i40 = i3;
                    button3 = button3;
                    z7 = z7;
                    view2 = view2;
                    i39 = i39;
                    str6 = str6;
                    strM2361 = strM2361;
                    jSONObject2 = jSONObject;
                    break;
                case 338534282:
                case 1652987194:
                    textView = textView4;
                    i17 = i39;
                    view = view2;
                    z4 = z7;
                    button2 = button3;
                    i18 = i40;
                    short[] sArr27 = sArr15;
                    int i59 = i41;
                    int i60 = i42;
                    sArr9 = sArr12;
                    f4 = f5;
                    sArr10 = sArr16;
                    strOptString = jSONObject2.optString(C2354.m7980(sArr27, i59, i60, i44));
                    sArr11 = sArr27;
                    i19 = i59;
                    i20 = i60;
                    strOptString2 = jSONObject2.optString(RunnableC0334.m2049(f1008, 114, 12, i44));
                    if (C3099.m10095()) {
                        iM31612 = C0773.m3169("۫᩷") ^ i31;
                        i21 = ((iM31612 ^ i30) * (-32647)) ^ (-1628911388);
                        i22 = -113384875;
                    } else {
                        iM31612 = (i31 - C0773.m3169("ܽܿ")) * (-67);
                        i21 = ((iM31612 ^ i30) * (-8669)) ^ (-987120561);
                        i22 = 755514756;
                    }
                    i33 = iM31612 ^ i22;
                    sArr15 = sArr11;
                    i41 = i19;
                    i42 = i20;
                    str7 = strOptString2;
                    i32 = i21;
                    textView4 = textView;
                    int i510 = i17;
                    str6 = strOptString;
                    sArr16 = sArr10;
                    f5 = f4;
                    sArr12 = sArr9;
                    i40 = i18;
                    button3 = button2;
                    z7 = z4;
                    view2 = view;
                    i39 = i510;
                    break;
                case 507692214:
                case 843736617:
                    textView4 = textView4;
                    int i61 = i40;
                    textView6 = (TextView) C1564.m5518(activityC0093, C0619.m2761(C13473.m33137(sArr16, i61, 3, i44)) ^ 2102376409);
                    strM8878 = C2702.m8878(C2702.m8880(jSONObject2, C0773.m3166(f1008, 157, 5, i44)));
                    if (C2375.f7641 > 0) {
                        int iM27620 = (C0619.m2761("۬ᩴ") + i30) * 7;
                        i4 = ((iM27620 ^ i31) * 20751) ^ (-1861422932);
                        i33 = iM27620 ^ (-1490005725);
                        i40 = i61;
                        i32 = i4;
                        i34 = i34;
                        textView4 = textView4;
                    } else {
                        i3 = i61;
                        sArr5 = sArr16;
                        int iM276111 = (C0619.m2761("ۚۡ") ^ i30) * (-61);
                        int i412 = ((iM276111 ^ i31) * 24105) ^ (-1562308193);
                        i16 = iM276111 ^ 1920647704;
                        c9043 = c9043;
                        i32 = i412;
                        sArr16 = sArr5;
                        f5 = f5;
                        sArr12 = sArr12;
                        textView4 = textView4;
                        str7 = str7;
                        sArr14 = sArr14;
                        i33 = i16;
                        i40 = i3;
                        button3 = button3;
                        z7 = z7;
                        view2 = view2;
                        i39 = i39;
                        str6 = str6;
                        strM2361 = strM2361;
                        jSONObject2 = jSONObject;
                    }
                    break;
                case 684259968:
                case 774097012:
                    textView4 = textView4;
                    sArr12 = sArr12;
                    C23916.m53425((TextView) C1564.m5518(activityC0093, C0619.m2761(C2485.m8350(sArr12, 151, 3, i44)) ^ 2128887483), C2288.m7760(i45));
                    sArr16 = f1008;
                    i40 = EnumC24309.f78687;
                    if (AbstractC3624.f12429 <= 0) {
                        iM3169 = C0773.m3169("᩶ۜ") ^ i30;
                        i10 = ((iM3169 ^ i31) * (-30925)) ^ (-21466012);
                        i11 = 117244246;
                    } else {
                        iM3169 = (C0773.m3169("ۧۜ") + i30) * 83;
                        i10 = ((iM3169 ^ i31) * (-14603)) ^ (-1029931389);
                        i11 = -17934184;
                    }
                    i33 = iM3169 ^ i11;
                    i32 = i10;
                    sArr12 = sArr12;
                    i34 = i34;
                    textView4 = textView4;
                    break;
                case 725822916:
                case 1493948162:
                    iM31610 = C0619.m2761(C3734.m12149(f1008, 168, 3, i44));
                    i14 = 2103028469;
                    i43 = iM31610 ^ i14;
                    iM2765 = C0619.m2761("ܽۨ") ^ i30;
                    i12 = ((iM2765 ^ i31) * SecP160R2Field.PInv33) ^ (-1397851336);
                    i13 = 471093575;
                    i33 = iM2765 ^ i13;
                    i32 = i12;
                    i34 = i34;
                    textView4 = textView4;
                    break;
                case 752873529:
                case 924631717:
                    f2 = f5;
                    i37 = 8;
                    iM2766 = (i30 - C0619.m2761("֨ۧ")) * (-95);
                    i23 = ((iM2766 ^ i31) * 1035) ^ (-986949668);
                    i24 = 2059782497;
                    i33 = iM2766 ^ i24;
                    str7 = str7;
                    i32 = i23;
                    textView4 = textView4;
                    View view12 = view2;
                    i39 = i39;
                    sArr16 = sArr16;
                    f5 = f2;
                    sArr12 = sArr12;
                    i40 = i40;
                    button3 = button3;
                    z7 = z7;
                    view2 = view12;
                    break;
                case 771124368:
                case 1730360006:
                    if (RunnableC3055.f9898 < 0) {
                        iM2761 = (C0773.m3169("ۡۘ") + i31) * (-65);
                        i = ((iM2761 ^ i30) * (-13871)) ^ 731494686;
                        i2 = 917097289;
                        i33 = iM2761 ^ i2;
                        i32 = i;
                    } else {
                        textView4 = textView4;
                        sArr12 = sArr12;
                        iM3169 = C0773.m3169("᩶ۜ") ^ i30;
                        i10 = ((iM3169 ^ i31) * (-30925)) ^ (-21466012);
                        i11 = 117244246;
                        i33 = iM3169 ^ i11;
                        i32 = i10;
                        sArr12 = sArr12;
                        i34 = i34;
                        textView4 = textView4;
                    }
                    break;
                case 772450166:
                case 1314362175:
                    textView4 = (TextView) C2878.m9476(activityC0093, C0773.m3169(C2310.m7803(sArr17, i35, 3, i44)) ^ 2122178530);
                    if (activityC0093.f1013) {
                        iM2761 = (C0773.m3169("ۢ֫") ^ i30) * 109;
                        i = ((iM2761 ^ i31) * (-30861)) ^ 1315221517;
                        i2 = -1469093941;
                    } else {
                        iM2761 = (C0773.m3169("᩺֫") + i30) * (-69);
                        i = ((iM2761 ^ i31) * 25347) ^ 1388129956;
                        i2 = 347195604;
                    }
                    i33 = iM2761 ^ i2;
                    i32 = i;
                    break;
                case 1322093778:
                case 1633614694:
                    strM6246 = C1783.m6246(activityC0093, C0773.m3169(C1519.m5399(f1008, 180, 3, i44)) ^ 2126316102);
                    str5 = strM6246;
                    iM2765 = (i31 - C0773.m3169("ܶۗ")) * (-31);
                    i12 = ((iM2765 ^ i30) * (-15495)) ^ 1528229991;
                    i13 = 950370980;
                    i33 = iM2765 ^ i13;
                    i32 = i12;
                    i34 = i34;
                    textView4 = textView4;
                    break;
                case 1441226133:
                case 2052592513:
                    textView4 = textView4;
                    z3 = z7;
                    Button button7 = button3;
                    sArr8 = sArr12;
                    i40 = i40;
                    f2 = f5;
                    sArr16 = sArr16;
                    C2354.m7982(button7, z3);
                    if (button7.isEnabled()) {
                        int iM31620 = (i31 - C0773.m3169("ۡܺ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        button3 = button7;
                        i32 = ((iM31620 ^ i30) * (-19163)) ^ (-441059292);
                        i33 = iM31620 ^ (-1806635603);
                    } else {
                        button3 = button7;
                        iM31614 = C0773.m3169("᩹֨") ^ i31;
                        i27 = ((iM31614 ^ i30) * (-19833)) ^ (-977935596);
                        i28 = 2114994849;
                        i33 = iM31614 ^ i28;
                        i32 = i27;
                    }
                    i40 = i40;
                    sArr16 = sArr16;
                    f5 = f2;
                    sArr12 = sArr8;
                    button3 = button3;
                    textView4 = textView4;
                    z7 = z3;
                    break;
                case 1952163023:
                case 2057633293:
                    textView4 = textView4;
                    str2 = str6;
                    str7 = str7;
                    sArr4 = sArr15;
                    i39 = i39;
                    view2 = view2;
                    z7 = z7;
                    button3 = button3;
                    i3 = i40;
                    sArr12 = sArr12;
                    f5 = f5;
                    sArr5 = sArr16;
                    sArr6 = sArr14;
                    viewM9477 = C2878.m9476(activityC0093, C0773.m3169(C0862.m3500(sArr6, 89, 3, i44)) ^ 2100210464);
                    r11 = i34;
                    if (C0487.f2131 <= 0) {
                        iM2764 = C0773.m3169("ۖ۠") ^ i31;
                        i8 = ((iM2764 ^ i30) * 30365) ^ 1093933636;
                        i9 = 15949790;
                        r10 = r11;
                    } else {
                        iM2764 = C0619.m2761("ܿۡ") ^ i31;
                        i8 = ((iM2764 ^ i30) * (-2707)) ^ (-1970694650);
                        i9 = 1903175308;
                        r10 = i34;
                    }
                    i33 = iM2764 ^ i9;
                    i32 = i8;
                    sArr14 = sArr6;
                    r9 = r10;
                    sArr15 = sArr4;
                    r8 = r9;
                    sArr16 = sArr5;
                    f5 = f5;
                    sArr12 = sArr12;
                    str7 = str7;
                    r7 = r8;
                    i40 = i3;
                    button3 = button3;
                    z7 = z7;
                    view2 = view2;
                    i39 = i39;
                    str6 = str2;
                    i34 = r7;
                    textView4 = textView4;
                    break;
                default:
                    f3 = 1.0f;
                    int iM276112 = (i30 - C0619.m2761("᩵֡")) * (-61);
                    float f12 = f3;
                    i10 = ((iM276112 ^ i31) * (-23605)) ^ (-1834318170);
                    i33 = iM276112 ^ (-683913364);
                    i40 = i40;
                    sArr16 = sArr16;
                    f5 = f12;
                    button3 = button3;
                    i32 = i10;
                    sArr12 = sArr12;
                    i34 = i34;
                    textView4 = textView4;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:87:0x0374 A[PHI: r5 r8 r9 r13 r19 r20 r21
      0x0374: PHI (r5v38 java.lang.String) = (r5v10 java.lang.String), (r5v33 java.lang.String), (r5v40 java.lang.String) binds: [B:11:0x006e, B:86:0x0372, B:75:0x02ee] A[DONT_GENERATE, DONT_INLINE]
      0x0374: PHI (r8v6 short[]) = (r8v4 short[]), (r8v2 short[]), (r8v2 short[]) binds: [B:11:0x006e, B:86:0x0372, B:75:0x02ee] A[DONT_GENERATE, DONT_INLINE]
      0x0374: PHI (r9v6 int) = (r9v4 int), (r9v2 int), (r9v2 int) binds: [B:11:0x006e, B:86:0x0372, B:75:0x02ee] A[DONT_GENERATE, DONT_INLINE]
      0x0374: PHI (r13v9 java.util.ArrayList<java.lang.String>) = 
      (r13v7 java.util.ArrayList<java.lang.String>)
      (r13v2 java.util.ArrayList<java.lang.String>)
      (r13v2 java.util.ArrayList<java.lang.String>)
     binds: [B:11:0x006e, B:86:0x0372, B:75:0x02ee] A[DONT_GENERATE, DONT_INLINE]
      0x0374: PHI (r19v12 short) = (r19v2 short), (r19v7 short), (r19v2 short) binds: [B:11:0x006e, B:86:0x0372, B:75:0x02ee] A[DONT_GENERATE, DONT_INLINE]
      0x0374: PHI (r20v4 short) = (r20v2 short), (r20v3 short), (r20v2 short) binds: [B:11:0x006e, B:86:0x0372, B:75:0x02ee] A[DONT_GENERATE, DONT_INLINE]
      0x0374: PHI (r21v3 java.lang.String) = (r21v2 java.lang.String), (r21v2 java.lang.String), (r21v5 java.lang.String) binds: [B:11:0x006e, B:86:0x0372, B:75:0x02ee] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:97:0x03d3 A[PHI: r1 r4 r5 r7 r17 r18
      0x03d3: PHI (r1v27 short) = (r1v2 short), (r1v3 short), (r19v2 short) binds: [B:96:0x03d1, B:92:0x03af, B:16:0x007f] A[DONT_GENERATE, DONT_INLINE]
      0x03d3: PHI (r4v22 int) = (r4v1 int), (r4v1 int), (r4v23 int) binds: [B:96:0x03d1, B:92:0x03af, B:16:0x007f] A[DONT_GENERATE, DONT_INLINE]
      0x03d3: PHI (r5v60 java.lang.String) = (r5v31 java.lang.String), (r5v32 java.lang.String), (r5v61 java.lang.String) binds: [B:96:0x03d1, B:92:0x03af, B:16:0x007f] A[DONT_GENERATE, DONT_INLINE]
      0x03d3: PHI (r7v7 int) = (r7v2 int), (r7v2 int), (r7v8 int) binds: [B:96:0x03d1, B:92:0x03af, B:16:0x007f] A[DONT_GENERATE, DONT_INLINE]
      0x03d3: PHI (r17v6 short[]) = (r17v3 short[]), (r17v2 short[]), (r17v2 short[]) binds: [B:96:0x03d1, B:92:0x03af, B:16:0x007f] A[DONT_GENERATE, DONT_INLINE]
      0x03d3: PHI (r18v6 char) = (r18v2 char), (r18v3 char), (r18v2 char) binds: [B:96:0x03d1, B:92:0x03af, B:16:0x007f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.ActivityC5577, l.ActivityC8866, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        int iM3169;
        int i;
        int i2;
        int scrollY;
        String str;
        int iM31610;
        int i3;
        int iM31611;
        int i4;
        int iM31612;
        int i5;
        short[] sArr;
        int iM31613;
        int i6;
        int iM2761;
        int i7;
        int i8;
        int i9;
        int iM31614;
        int i10;
        int i11;
        this = this;
        Bundle bundle2 = bundle;
        int i12 = C1564.f5401;
        int i13 = C3033.f9831;
        int iM2762 = C0619.m2761("ܳܰ") ^ i13;
        int i14 = ((iM2762 ^ i12) * (-20191)) ^ 2087289351;
        String strM33137 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        short[] sArr6 = null;
        int i15 = iM2762 ^ (-1953750141);
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int iM31615 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        ArrayList<String> arrayList = null;
        int i22 = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        String strM2049 = null;
        int i23 = 1841524063;
        while (true) {
            i23 = i15 ^ (i14 & (((i23 ^ i12) * 25387) >> 31));
            switch (i23) {
                case -2114872257:
                case -183268485:
                    strM33137 = strM33137;
                    strM2049 = RunnableC0334.m2049(f1008, 426, 8, i21);
                    if (C3492.f12043 <= 0) {
                        iM31611 = C0619.m2761("۫ۡ") ^ i12;
                        i14 = 2034628390 ^ ((iM31611 ^ i13) * (-25369));
                        i4 = -1525431071;
                    } else {
                        iM31611 = (C0619.m2761("ܰܿ") + i12) * (-85);
                        i14 = 1623094858 ^ ((iM31611 ^ i13) * 23469);
                        i4 = 501463900;
                    }
                    i15 = iM31611 ^ i4;
                    bundle2 = bundle;
                    strM33137 = strM33137;
                    break;
                case -1952905702:
                case -776589712:
                    sArr = sArr3;
                    strM33137 = C13473.m33137(sArr, 434, 15, i21);
                    if (C2288.f7433 <= 0) {
                        iM31613 = (i12 - C0773.m3169("᩹᩵")) * (-19);
                        i14 = ((iM31613 ^ i13) * 24677) ^ (-1050602058);
                        i6 = -1871910759;
                    } else {
                        iM31613 = (C0773.m3169("᩵ᩴ") + i12) * (-37);
                        i14 = ((iM31613 ^ i13) * (-28335)) ^ 1634516956;
                        i6 = -786626610;
                    }
                    i15 = iM31613 ^ i6;
                    this = this;
                    sArr3 = sArr;
                    break;
                case -1891057492:
                case 1012982030:
                    i9 = i17;
                    iM31615 = C0773.m3169(C3033.m9847(sArr6, i20, i16, i21));
                    if (C3033.m9845() > 0) {
                        iM31614 = (C0619.m2761("ۚۙ") ^ i13) * 85;
                        i10 = ((iM31614 ^ i12) * 29029) ^ (-2024852055);
                        i11 = 1032488502;
                        int i24 = i9;
                        i15 = iM31614 ^ i11;
                        i14 = i10;
                        i17 = i24;
                    } else {
                        i17 = i9;
                        str = strM33137;
                        iM31610 = (C0619.m2761("᩶ۗ") ^ i13) * (-125);
                        i14 = ((iM31610 ^ i12) * (-24719)) ^ (-1935995208);
                        i3 = -733588458;
                        i15 = iM31610 ^ i3;
                        this = this;
                        s = s;
                        strM33137 = str;
                        bundle2 = bundle;
                    }
                    break;
                case -1769012248:
                case -1435012232:
                    strM33137 = strM33137;
                    C2419.m8170(bundle2, strM33137, this.f1012);
                    if (this.f1015 == null) {
                        iM31612 = (i13 - C0619.m2761("ܶ۫")) * (-127);
                        i14 = ((iM31612 ^ i12) * (-31055)) ^ (-1199127086);
                        i5 = 818531146;
                        i15 = iM31612 ^ i5;
                        strM33137 = strM33137;
                    } else {
                        iM2761 = C0619.m2761("۬ۨ") ^ i13;
                        i7 = ((iM2761 ^ i12) * (-11849)) ^ (-574324043);
                        i8 = -1293842510;
                        i15 = iM2761 ^ i8;
                        i14 = i7;
                        strM33137 = strM33137;
                        this = this;
                    }
                    break;
                case -1714155697:
                case -768820396:
                    scrollY = ((ScrollView) C1564.m5518(this, 2129415086 ^ iM31615)).getScrollY();
                    i18 = scrollY;
                    iM3169 = C0619.m2761("ܶܳ") ^ i12;
                    i = ((iM3169 ^ i13) * (-29105)) ^ 1445329141;
                    i2 = 408912948;
                    i15 = iM3169 ^ i2;
                    i14 = i;
                    break;
                case -1638238693:
                case -445217524:
                    i21 = 6993;
                    iM31611 = (C0619.m2761("۬۬") + i13) * (-33);
                    i14 = (-1594805663) ^ ((iM31611 ^ i12) * 10497);
                    i4 = -1787607639;
                    i15 = iM31611 ^ i4;
                    bundle2 = bundle;
                    strM33137 = strM33137;
                    break;
                case -1606197763:
                case 878137399:
                    if (!C17202.f56030) {
                        sArr = sArr3;
                        iM31613 = (i12 - C0773.m3169("᩹᩵")) * (-19);
                        i14 = ((iM31613 ^ i13) * 24677) ^ (-1050602058);
                        i6 = -1871910759;
                        i15 = iM31613 ^ i6;
                        this = this;
                        sArr3 = sArr;
                    } else {
                        iM3169 = C0619.m2761("ۙ᩸") ^ i13;
                        i = ((iM3169 ^ i12) * (-31597)) ^ 671124325;
                        i2 = -1916708325;
                        i15 = iM3169 ^ i2;
                        i14 = i;
                    }
                    break;
                case -1468322128:
                case 831814510:
                    str = strM33137;
                    s = s;
                    int i25 = s + 17099;
                    if ((s * s2) - (i25 * i25) <= 0) {
                        iM31610 = (i13 - C0773.m3169("֨֫")) * (-37);
                        i14 = ((iM31610 ^ i12) * 24201) ^ 260214217;
                        i3 = -887916602;
                    } else {
                        iM31610 = (C0619.m2761("۬᩵") ^ i12) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i14 = ((iM31610 ^ i13) * (-19267)) ^ 624036981;
                        i3 = 532843030;
                    }
                    i15 = iM31610 ^ i3;
                    this = this;
                    s = s;
                    strM33137 = str;
                    bundle2 = bundle;
                    break;
                case -1355661997:
                case 1657307962:
                    bundle2.putInt(C2375.m8069(f1008, 474, 7, i21), i18);
                    i17 = i17;
                    iM3169 = C0619.m2761("᩹ۙ") ^ i12;
                    i = ((iM3169 ^ i13) * (-9943)) ^ 1975858245;
                    i2 = 852518621;
                    i15 = iM3169 ^ i2;
                    i14 = i;
                    break;
                case -1225961150:
                case 1243355677:
                    strM33137 = strM33137;
                    s = sArr2[c];
                    s2 = 68396;
                    if (C2702.f8586 <= 0) {
                        iM31611 = C0619.m2761("۫ۡ") ^ i12;
                        i14 = 2034628390 ^ ((iM31611 ^ i13) * (-25369));
                        i4 = -1525431071;
                    } else {
                        iM31611 = C0773.m3169("᩻۟") ^ i12;
                        i14 = (-770720921) ^ ((iM31611 ^ i13) * (-28531));
                        i4 = -756026169;
                    }
                    i15 = iM31611 ^ i4;
                    bundle2 = bundle;
                    strM33137 = strM33137;
                    break;
                case -986652565:
                case 683741519:
                    s = s;
                    str = strM33137;
                    c = 425;
                    if (C2419.m8174() >= 0) {
                        iM31610 = (C0619.m2761("᩶ۗ") ^ i13) * (-125);
                        i14 = ((iM31610 ^ i12) * (-24719)) ^ (-1935995208);
                        i3 = -733588458;
                    } else {
                        iM31610 = (i12 - C0773.m3169("֫۬")) * 17;
                        i14 = ((iM31610 ^ i13) * (-6615)) ^ 362886151;
                        i3 = -1830515344;
                    }
                    i15 = iM31610 ^ i3;
                    this = this;
                    s = s;
                    strM33137 = str;
                    bundle2 = bundle;
                    break;
                case -824968714:
                case 402878614:
                    sArr4 = f1008;
                    i22 = 449;
                    i17 = 9;
                    if (RunnableC3055.f9898 < 0) {
                        iM3169 = (i12 - C0773.m3169("ܺۡ")) * 49;
                        i = ((iM3169 ^ i13) * (-16557)) ^ (-133216214);
                        i2 = -1807098690;
                        i15 = iM3169 ^ i2;
                        i14 = i;
                    } else {
                        strM33137 = strM33137;
                        iM2761 = C0773.m3169("۬᩸") ^ i12;
                        strM2049 = strM2049;
                        i7 = ((iM2761 ^ i13) * (-2989)) ^ (-86322220);
                        i8 = 64061053;
                        i15 = iM2761 ^ i8;
                        i14 = i7;
                        strM33137 = strM33137;
                        this = this;
                    }
                    break;
                case -544933884:
                case -129012885:
                    C3998.m12920();
                    if (C1519.f5300 >= 0) {
                        str = strM33137;
                        iM31610 = (C0619.m2761("᩶ۗ") ^ i13) * (-125);
                        i14 = ((iM31610 ^ i12) * (-24719)) ^ (-1935995208);
                        i3 = -733588458;
                        i15 = iM31610 ^ i3;
                        this = this;
                        s = s;
                        strM33137 = str;
                        bundle2 = bundle;
                    } else {
                        sArr = sArr3;
                        iM31613 = (i12 - C0773.m3169("᩹᩵")) * (-19);
                        i14 = ((iM31613 ^ i13) * 24677) ^ (-1050602058);
                        i6 = -1871910759;
                        i15 = iM31613 ^ i6;
                        this = this;
                        sArr3 = sArr;
                    }
                    break;
                case -491790926:
                case -240287670:
                    C3448.m11257(C0619.m2756(sArr4, i22, i17, i21));
                    throw null;
                case -408388084:
                case 1453725642:
                    strM2049 = strM2049;
                    strM33137 = strM33137;
                    C3734.m12144(bundle2, strM2049);
                    super.onSaveInstanceState(bundle);
                    sArr3 = f1008;
                    if (C0269.m1775() > 0) {
                        strM2049 = strM2049;
                        iM31612 = (C0773.m3169("۟֨") ^ i13) * (-105);
                        i14 = ((iM31612 ^ i12) * 29099) ^ 1307136184;
                        i5 = 1340863413;
                        i15 = iM31612 ^ i5;
                        strM33137 = strM33137;
                    } else {
                        iM2761 = C0773.m3169("۬᩸") ^ i12;
                        strM2049 = strM2049;
                        i7 = ((iM2761 ^ i13) * (-2989)) ^ (-86322220);
                        i8 = 64061053;
                        i15 = iM2761 ^ i8;
                        i14 = i7;
                        strM33137 = strM33137;
                        this = this;
                    }
                    break;
                case -377169271:
                case 57468940:
                    i21 = 15000;
                    iM31611 = (C0619.m2761("۬۬") + i13) * (-33);
                    i14 = (-1594805663) ^ ((iM31611 ^ i12) * 10497);
                    i4 = -1787607639;
                    i15 = iM31611 ^ i4;
                    bundle2 = bundle;
                    strM33137 = strM33137;
                    break;
                case -148364758:
                case 1212464366:
                    return;
                case 373806263:
                case 1683023476:
                    s = s;
                    str = strM33137;
                    sArr2 = f1008;
                    if (C0619.f2439) {
                        iM31610 = (C0619.m2761("᩶ۗ") ^ i13) * (-125);
                        i14 = ((iM31610 ^ i12) * (-24719)) ^ (-1935995208);
                        i3 = -733588458;
                    } else {
                        iM31610 = C0773.m3169("ܿ᩻") ^ i13;
                        i14 = ((iM31610 ^ i12) * (-9929)) ^ 1887996983;
                        i3 = 720124125;
                    }
                    i15 = iM31610 ^ i3;
                    this = this;
                    s = s;
                    strM33137 = str;
                    bundle2 = bundle;
                    break;
                case 446113593:
                case 1646106382:
                    RunnableC3055.m9933();
                    C3734.m12152();
                    sArr = sArr3;
                    iM31613 = (i12 - C0773.m3169("᩹᩵")) * (-19);
                    i14 = ((iM31613 ^ i13) * 24677) ^ (-1050602058);
                    i6 = -1871910759;
                    i15 = iM31613 ^ i6;
                    this = this;
                    sArr3 = sArr;
                    break;
                case 625046689:
                case 1989539410:
                    C3734.m12152();
                    C2419.m8174();
                    return;
                case 663614279:
                case 1227276942:
                    bundle2.putStringArrayList(C2354.m7980(sArr5, i19, 13, i21), arrayList);
                    strM33137 = strM33137;
                    iM31612 = (i13 - C0619.m2761("ܶ۫")) * (-127);
                    i14 = ((iM31612 ^ i12) * (-31055)) ^ (-1199127086);
                    i5 = 818531146;
                    i15 = iM31612 ^ i5;
                    strM33137 = strM33137;
                    break;
                case 854944255:
                case 1510725387:
                    if (this.f1019 != null) {
                        iM3169 = C0619.m2761("ۢᩳ") ^ i12;
                        i = ((iM3169 ^ i13) * 26009) ^ 568267961;
                        i2 = -1507827128;
                    } else {
                        iM3169 = C0619.m2761("᩹ۙ") ^ i12;
                        i = ((iM3169 ^ i13) * (-9943)) ^ 1975858245;
                        i2 = 852518621;
                    }
                    i15 = iM3169 ^ i2;
                    i14 = i;
                    break;
                case 884964691:
                case 1604783826:
                    i9 = i17;
                    sArr6 = f1008;
                    i20 = 471;
                    i16 = 3;
                    if (C2354.f7599 < 0) {
                        iM31614 = (C0773.m3169("ۢܺ") ^ i13) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i10 = ((iM31614 ^ i12) * 9513) ^ (-804361961);
                        i11 = 245525938;
                        int i26 = i9;
                        i15 = iM31614 ^ i11;
                        i14 = i10;
                        i17 = i26;
                    } else {
                        i17 = i9;
                        strM33137 = strM33137;
                        iM2761 = C0773.m3169("۬᩸") ^ i12;
                        strM2049 = strM2049;
                        i7 = ((iM2761 ^ i13) * (-2989)) ^ (-86322220);
                        i8 = 64061053;
                        i15 = iM2761 ^ i8;
                        i14 = i7;
                        strM33137 = strM33137;
                        this = this;
                    }
                    break;
                case 1564309860:
                case 1830165986:
                    C9042 c9042 = this.f1015;
                    if (c9042 != null) {
                        arrayList = new ArrayList<>(c9042.m24144());
                        sArr5 = f1008;
                        i19 = 458;
                        if (C0862.f3233 != 0) {
                            strM33137 = strM33137;
                            iM31611 = C0619.m2761("۫ۡ") ^ i12;
                            i14 = 2034628390 ^ ((iM31611 ^ i13) * (-25369));
                            i4 = -1525431071;
                            i15 = iM31611 ^ i4;
                            bundle2 = bundle;
                            strM33137 = strM33137;
                        } else {
                            iM3169 = (i13 - C0773.m3169("ᩴᩳ")) * (-113);
                            i = ((iM3169 ^ i12) * (-31521)) ^ 387808323;
                            i2 = 113515330;
                            i15 = iM3169 ^ i2;
                            i14 = i;
                        }
                    } else {
                        int iM31616 = (i13 - C0773.m3169("᩷᩶")) * q.h;
                        i15 = iM31616 ^ (-770957591);
                        i14 = ((iM31616 ^ i12) * (-10891)) ^ 1931256316;
                        arrayList = null;
                    }
                    break;
                case 1667247833:
                case 2034659010:
                    if (C11235.f35427 < 0) {
                        strM33137 = strM33137;
                        iM31611 = C0619.m2761("۫ۡ") ^ i12;
                        i14 = 2034628390 ^ ((iM31611 ^ i13) * (-25369));
                        i4 = -1525431071;
                        i15 = iM31611 ^ i4;
                        bundle2 = bundle;
                        strM33137 = strM33137;
                    } else {
                        iM3169 = C0619.m2761("ۙ᩸") ^ i13;
                        i = ((iM3169 ^ i12) * (-31597)) ^ 671124325;
                        i2 = -1916708325;
                        i15 = iM3169 ^ i2;
                        i14 = i;
                    }
                    break;
                default:
                    scrollY = this.f1010;
                    if (scrollY >= 0) {
                        i18 = scrollY;
                        iM3169 = C0619.m2761("ܶܳ") ^ i12;
                        i = ((iM3169 ^ i13) * (-29105)) ^ 1445329141;
                        i2 = 408912948;
                    } else {
                        iM3169 = (i12 - C0773.m3169("ܰᩴ")) * 55;
                        i = ((iM3169 ^ i13) * (-12693)) ^ (-755266160);
                        i2 = 1658098314;
                    }
                    i15 = iM3169 ^ i2;
                    i14 = i;
                    break;
            }
        }
    }

    @Override // l.AbstractActivityC17204, l.ActivityC4348, l.ActivityC3409, android.app.Activity
    public final void onStop() {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        C3072 c3072 = null;
        int i4 = 1273804139;
        int i5 = C0950.f3488;
        int i6 = C11235.f35427;
        int iM2761 = C0619.m2761("᩺ۗ") ^ i5;
        int i7 = ((iM2761 ^ i6) * 11625) ^ (-446738000);
        int i8 = 200916843;
        while (true) {
            i4 = ((((i4 ^ i6) * 31505) >> 31) & i7) ^ (iM2761 ^ i8);
            switch (i4) {
                case -2057347177:
                case 1729622106:
                    C2310.m7813();
                    iM2761 = (i5 - C0619.m2761("᩻֫")) * (-5);
                    i7 = ((iM2761 ^ i6) * 12793) ^ 921852671;
                    i8 = -334117234;
                    break;
                case -2021183609:
                case -1664019750:
                    i = this.f1017;
                    if (C20932.f66974 <= 0) {
                        iM2761 = (C0619.m2761("۟ᩳ") ^ i5) * 31;
                        i7 = ((iM2761 ^ i6) * 24639) ^ 1214878616;
                        i8 = -1786950478;
                    } else {
                        iM2761 = C0619.m2761("ۘ֫") ^ i5;
                        i7 = ((iM2761 ^ i6) * (-12153)) ^ 1088525477;
                        i8 = -1017402816;
                    }
                    break;
                case -1847869267:
                case -1720979124:
                    C2354.m7983();
                    if (C1321.f4751 < 0) {
                        iM2761 = (C0773.m3169("ۨܶ") ^ i6) * 47;
                        i7 = ((iM2761 ^ i5) * 29533) ^ (-802259922);
                        i8 = -188727643;
                    } else {
                        iM2761 = (i5 - C0619.m2761("᩻֫")) * (-5);
                        i7 = ((iM2761 ^ i6) * 12793) ^ 921852671;
                        i8 = -334117234;
                    }
                    break;
                case -1700917226:
                case 1586268359:
                    if (C2023.m6964() <= 0) {
                        iM2761 = (C0619.m2761("۟ᩳ") ^ i5) * 31;
                        i7 = ((iM2761 ^ i6) * 24639) ^ 1214878616;
                        i8 = -1786950478;
                    } else {
                        iM2761 = C0619.m2761("ۗ֡") ^ i6;
                        i7 = ((iM2761 ^ i5) * (-5051)) ^ 1361733649;
                        i8 = -1525821914;
                    }
                    break;
                case -1509541042:
                case 1492925308:
                    if (C2966.m9664()) {
                        iM2761 = C0619.m2761("ۜܰ") ^ i6;
                        i7 = ((iM2761 ^ i5) * (-13579)) ^ (-1302991335);
                        i8 = 2065220763;
                    } else {
                        iM2761 = (C0619.m2761("ܰ᩶") ^ i6) * 97;
                        i7 = ((iM2761 ^ i5) * 3057) ^ 1752715007;
                        i8 = 1048928670;
                    }
                    break;
                case -1449619521:
                case 278534472:
                    if (C2310.f7472 >= 0) {
                        iM2761 = (C0619.m2761("۟ᩳ") ^ i5) * 31;
                        i7 = ((iM2761 ^ i6) * 24639) ^ 1214878616;
                        i8 = -1786950478;
                    } else {
                        iM2761 = (C0773.m3169("ۚ᩷") ^ i5) * (-77);
                        i7 = ((iM2761 ^ i6) * (-5361)) ^ (-111903317);
                        i8 = -552557313;
                    }
                    break;
                case -1423125873:
                case 2006429276:
                    i3 = i + i2;
                    if (C2834.f9334 <= 0) {
                        iM2761 = (C0619.m2761("ܰ᩶") ^ i6) * 97;
                        i7 = ((iM2761 ^ i5) * 3057) ^ 1752715007;
                        i8 = 1048928670;
                    } else {
                        iM2761 = C0773.m3169("ܰ֡") ^ i5;
                        i7 = ((iM2761 ^ i6) * 11599) ^ (-1586894929);
                        i8 = -808421622;
                    }
                    break;
                case -1219792813:
                case 938419416:
                    if (C3077.f9998) {
                        iM2761 = C0773.m3169("ۙ᩸") ^ i5;
                        i7 = ((iM2761 ^ i6) * 20929) ^ (-1262579984);
                        i8 = -2018418213;
                    } else {
                        iM2761 = (i5 - C0619.m2761("᩻֫")) * (-5);
                        i7 = ((iM2761 ^ i6) * 12793) ^ 921852671;
                        i8 = -334117234;
                    }
                    break;
                case -1183023699:
                case 1892962279:
                    i2 = 1;
                    if (C0950.m3785() != 0) {
                        iM2761 = (C0773.m3169("ۨܶ") ^ i6) * 47;
                        i7 = ((iM2761 ^ i5) * 29533) ^ (-802259922);
                        i8 = -188727643;
                    } else {
                        iM2761 = C0773.m3169("֫ۡ") ^ i6;
                        i7 = ((iM2761 ^ i5) * (-1793)) ^ (-1508895039);
                        i8 = 969824077;
                    }
                    break;
                case -944850907:
                case -534514822:
                    C4282.m13644();
                    break;
                case -909454326:
                case 1515548394:
                    super.onStop();
                    break;
                case -803519425:
                case 1492845911:
                    this.f1017 = i3;
                    z = false;
                    if (C0269.m1775() <= 0) {
                        iM2761 = (C0619.m2761("۟ᩳ") ^ i5) * 31;
                        i7 = ((iM2761 ^ i6) * 24639) ^ 1214878616;
                        i8 = -1786950478;
                    } else {
                        iM2761 = (C0773.m3169("֨᩷") ^ i6) * 31;
                        i7 = ((iM2761 ^ i5) * (-26595)) ^ (-1089238370);
                        i8 = -1836979022;
                    }
                    break;
                case -616628966:
                case 1334497926:
                    if (!C3077.f9998) {
                        iM2761 = (C0773.m3169("ܺᩳ") ^ i6) * 29;
                        i7 = ((iM2761 ^ i5) * 23569) ^ (-1321434040);
                        i8 = 653235598;
                    } else {
                        iM2761 = (i5 - C0619.m2761("᩻֫")) * (-5);
                        i7 = ((iM2761 ^ i6) * 12793) ^ 921852671;
                        i8 = -334117234;
                    }
                    break;
                case -369480677:
                case 1387409566:
                    if (C2287.f7432 >= 0) {
                        iM2761 = (i5 - C0619.m2761("᩻֫")) * (-5);
                        i7 = ((iM2761 ^ i6) * 12793) ^ 921852671;
                        i8 = -334117234;
                    } else {
                        iM2761 = (i5 - C0619.m2761("۠۠")) * (-37);
                        i7 = ((iM2761 ^ i6) * 1013) ^ (-807461894);
                        i8 = 1443321923;
                    }
                    break;
                case -49017829:
                case 282512030:
                    c3072.m10021(z);
                    iM2761 = (i6 - C0773.m3169("ۙ֡")) * 53;
                    i7 = ((iM2761 ^ i5) * (-30519)) ^ 1768943120;
                    i8 = -1586669738;
                    break;
                case 57247843:
                case 1464395599:
                    C0487.m2356();
                    if (C23916.m53419() == 0) {
                        iM2761 = (C0619.m2761("۟ᩳ") ^ i5) * 31;
                        i7 = ((iM2761 ^ i6) * 24639) ^ 1214878616;
                        i8 = -1786950478;
                    } else {
                        iM2761 = (C0773.m3169("ܺᩳ") ^ i6) * 29;
                        i7 = ((iM2761 ^ i5) * 23569) ^ (-1321434040);
                        i8 = 653235598;
                    }
                    break;
                case 1366417207:
                case 1416684991:
                    if (C0950.f3488 >= 0) {
                        iM2761 = (C0619.m2761("۟ᩳ") ^ i5) * 31;
                        i7 = ((iM2761 ^ i6) * 24639) ^ 1214878616;
                        i8 = -1786950478;
                    } else {
                        iM2761 = C0619.m2761("֫᩹") ^ i6;
                        i7 = ((iM2761 ^ i5) * (-14171)) ^ 1852533439;
                        i8 = 142403948;
                    }
                    break;
                default:
                    this.f1014 = z;
                    c3072 = this.f1019;
                    if (c3072 != null) {
                        iM2761 = (C0619.m2761("ۧۡ") ^ i5) * (-31);
                        i7 = ((iM2761 ^ i6) * (-18993)) ^ 172829883;
                        i8 = 1289084973;
                    } else {
                        iM2761 = (i6 - C0773.m3169("ۙ֡")) * 53;
                        i7 = ((iM2761 ^ i5) * (-30519)) ^ 1768943120;
                        i8 = -1586669738;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    private final void m1177() {
        int i;
        boolean z;
        int i2;
        int iM3169;
        int i3;
        int i4;
        int iM31610;
        int i5;
        int iM31611;
        int i6;
        int i7;
        ActivityC0093 activityC0093 = this;
        boolean z2 = false;
        int i8 = 0;
        C3072 c3072 = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i9 = 0;
        short s3 = 0;
        int i10 = 0;
        short[] sArr2 = null;
        int i11 = 0;
        int i12 = 0;
        int i13 = 892045419;
        int i14 = C2702.f8586;
        int i15 = C3779.f12953;
        int iM2761 = C0619.m2761("۠᩸") ^ i15;
        int i16 = ((iM2761 ^ i14) * 18789) ^ (-509634627);
        int i17 = iM2761 ^ 1808785339;
        int i18 = 0;
        while (true) {
            i13 = i17 ^ (i16 & (((i13 ^ i14) * (-16451)) >> 31));
            switch (i13) {
                case -2096739614:
                case 864970165:
                    c3072.m10021(z2);
                    if (C0773.f2792 > 0) {
                        C2834.m9339(new C20976(activityC0093, i8));
                        return;
                    }
                    z = z2 ? 1 : 0;
                    i2 = i8;
                    iM3169 = C0773.m3169("ۢ۫") ^ i14;
                    i16 = ((iM3169 ^ i15) * 2857) ^ (-1476751457);
                    i3 = -145912339;
                    int i19 = iM3169 ^ i3;
                    i8 = i2;
                    z2 = z;
                    i17 = i19;
                    activityC0093 = this;
                    break;
                case -2082315341:
                case 2071856155:
                    z2 = z2 ? 1 : 0;
                    i8 = i8;
                    if (i9 - (s * s3) >= 0) {
                        iM31610 = C0773.m3169("۫ܿ") ^ i14;
                        i = ((iM31610 ^ i15) * 20725) ^ (-1942953667);
                        i5 = 404530267;
                    } else {
                        iM31610 = (C0773.m3169("ܽܺ") + i14) * (-17);
                        i = ((iM31610 ^ i15) * 11787) ^ (-1644382557);
                        i5 = 390156958;
                    }
                    int i20 = iM31610 ^ i5;
                    i8 = i8;
                    i17 = i20;
                    i16 = i;
                    z2 = z2;
                    break;
                case -1973824652:
                case -1587625480:
                    z2 = z2 ? 1 : 0;
                    i8 = i8;
                    if (activityC0093.f1014) {
                        iM31610 = (C0773.m3169("ۧ᩹") + i15) * (-9);
                        i = ((iM31610 ^ i14) * (-14637)) ^ 486432610;
                        i5 = 881324017;
                    } else {
                        iM31610 = (C0619.m2761("ܿۗ") ^ i15) * (-47);
                        i = ((iM31610 ^ i14) * 9531) ^ (-695587471);
                        i5 = 89325138;
                    }
                    int i21 = iM31610 ^ i5;
                    i8 = i8;
                    i17 = i21;
                    i16 = i;
                    z2 = z2;
                    break;
                case -1773015082:
                case 1092922234:
                    z2 = z2 ? 1 : 0;
                    i8 = i8;
                    s3 = 65044;
                    if (AbstractC3624.f12429 <= 0) {
                        iM31610 = (i15 - C0619.m2761("᩹֨")) * 93;
                        i = ((iM31610 ^ i14) * (-29951)) ^ (-2100478134);
                        i5 = -1384758577;
                    } else {
                        iM31610 = C0773.m3169("᩻᩺") ^ i15;
                        i = ((iM31610 ^ i14) * (-7799)) ^ 1556740181;
                        i5 = -1434880550;
                    }
                    int i22 = iM31610 ^ i5;
                    i8 = i8;
                    i17 = i22;
                    i16 = i;
                    z2 = z2;
                    break;
                case -1649851024:
                case -788351051:
                    i8 = i18 + (z2 ? 1 : 0);
                    if (C3448.f11240 < 0) {
                        int iM2762 = (C0619.m2761("ۢۤ") ^ i14) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        z2 = z2 ? 1 : 0;
                        i = ((iM2762 ^ i15) * (-6775)) ^ 1004755414;
                        i17 = iM2762 ^ 1232896467;
                        i16 = i;
                        z2 = z2;
                    } else {
                        int iM2763 = (i14 - C0619.m2761("ۢۘ")) * 67;
                        i17 = iM2763 ^ 275811467;
                        i16 = ((iM2763 ^ i15) * (-32645)) ^ 1510323147;
                        activityC0093 = this;
                    }
                    break;
                case -1641924969:
                case -802869463:
                    if (C3448.f11240 >= 0) {
                        z2 = z2 ? 1 : 0;
                        i8 = i8;
                        i12 = 13;
                        iM31610 = (i15 - C0773.m3169("ۗܿ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i = ((iM31610 ^ i14) * (-6973)) ^ (-367154318);
                        i5 = -289650821;
                        int i23 = iM31610 ^ i5;
                        i8 = i8;
                        i17 = i23;
                        i16 = i;
                        z2 = z2;
                    } else {
                        int iM31612 = (C0773.m3169("ܳ֫") + i15) * 5;
                        i17 = iM31612 ^ 779155285;
                        i16 = ((iM31612 ^ i14) * 15761) ^ 230378119;
                        i12 = 13;
                    }
                    break;
                case -1615027423:
                case -327103811:
                    if (C23916.f77426 > 0) {
                        z2 = z2 ? 1 : 0;
                        i8 = i8;
                        iM31610 = C0773.m3169("᩷ۡ") ^ i15;
                        i = ((iM31610 ^ i14) * (-31163)) ^ 1732406633;
                        i5 = 845105796;
                        int i24 = iM31610 ^ i5;
                        i8 = i8;
                        i17 = i24;
                        i16 = i;
                        z2 = z2;
                    } else {
                        z = z2 ? 1 : 0;
                        i2 = i8;
                        iM3169 = C0773.m3169("ۢ۫") ^ i14;
                        i16 = ((iM3169 ^ i15) * 2857) ^ (-1476751457);
                        i3 = -145912339;
                        int i110 = iM3169 ^ i3;
                        i8 = i2;
                        z2 = z;
                        i17 = i110;
                        activityC0093 = this;
                    }
                    break;
                case -1523451327:
                case 668101001:
                    i10 = 5292;
                    iM31610 = (C0619.m2761("۠ۙ") + i15) * (-121);
                    i = ((iM31610 ^ i14) * 249) ^ 157009473;
                    i5 = -590606403;
                    int i25 = iM31610 ^ i5;
                    i8 = i8;
                    i17 = i25;
                    i16 = i;
                    z2 = z2;
                    break;
                case -1419533040:
                case 164341248:
                    z2 = z2 ? 1 : 0;
                    i8 = i8;
                    int i26 = s + s2;
                    i9 = i26 * i26;
                    if (C3734.f12817 >= 0) {
                        iM31610 = C0773.m3169("᩷ۡ") ^ i15;
                        i = ((iM31610 ^ i14) * (-31163)) ^ 1732406633;
                        i5 = 845105796;
                    } else {
                        iM31610 = (C0619.m2761("᩷᩸") + i15) * 27;
                        i = ((iM31610 ^ i14) * 2231) ^ 880336075;
                        i5 = -180660805;
                    }
                    int i27 = iM31610 ^ i5;
                    i8 = i8;
                    i17 = i27;
                    i16 = i;
                    z2 = z2;
                    break;
                case -1235584220:
                case -147693767:
                    C1783.m6232();
                    int iM2764 = (i14 - C0619.m2761("ۢۘ")) * 67;
                    i17 = iM2764 ^ 275811467;
                    i16 = ((iM2764 ^ i15) * (-32645)) ^ 1510323147;
                    activityC0093 = this;
                    break;
                case -1122269463:
                case 1199550631:
                    return;
                case -1088178664:
                case 1584204732:
                    if (C1564.f5401 > 0) {
                        z2 = z2 ? 1 : 0;
                        i8 = i8;
                        iM31610 = (i15 - C0619.m2761("᩹֨")) * 93;
                        i = ((iM31610 ^ i14) * (-29951)) ^ (-2100478134);
                        i5 = -1384758577;
                        int i28 = iM31610 ^ i5;
                        i8 = i8;
                        i17 = i28;
                        i16 = i;
                        z2 = z2;
                    } else {
                        int iM2765 = (i14 - C0619.m2761("ۢۘ")) * 67;
                        i17 = iM2765 ^ 275811467;
                        i16 = ((iM2765 ^ i15) * (-32645)) ^ 1510323147;
                        activityC0093 = this;
                    }
                    break;
                case -950744405:
                case 1504178684:
                    int i29 = i8;
                    int i30 = activityC0093.f1017;
                    if (C2375.f7641 > 0) {
                        int iM31613 = C0773.m3169("֫ۤ") ^ i14;
                        i18 = i30;
                        i16 = ((iM31613 ^ i15) * 28479) ^ (-2052600984);
                        z2 = true;
                        i4 = i29;
                        i17 = iM31613 ^ (-708373419);
                        i8 = i4;
                    } else {
                        i18 = i30;
                        i8 = i29;
                        z2 = true;
                        int iM2766 = (i14 - C0619.m2761("ۢۘ")) * 67;
                        i17 = iM2766 ^ 275811467;
                        i16 = ((iM2766 ^ i15) * (-32645)) ^ 1510323147;
                        activityC0093 = this;
                    }
                    break;
                case -532427306:
                case 726778995:
                    z2 = z2 ? 1 : 0;
                    i8 = i8;
                    s = sArr[c];
                    s2 = 16261;
                    if (C11235.f35427 >= 0) {
                        iM31610 = (i15 - C0773.m3169("ۗܿ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i = ((iM31610 ^ i14) * (-6973)) ^ (-367154318);
                        i5 = -289650821;
                    } else {
                        iM31610 = C0773.m3169("֫᩸") ^ i14;
                        i = ((iM31610 ^ i15) * (-31469)) ^ 2039900277;
                        i5 = -485652351;
                    }
                    int i210 = iM31610 ^ i5;
                    i8 = i8;
                    i17 = i210;
                    i16 = i;
                    z2 = z2;
                    break;
                case -457340775:
                case 399112990:
                    C0487.m2356();
                    C3077.m10041();
                    return;
                case 258970361:
                case 875921363:
                    activityC0093.f1017 = i8;
                    activityC0093.f1014 = z2;
                    c3072 = activityC0093.f1019;
                    if (c3072 != null) {
                        iM31611 = (i14 - C0773.m3169("ܰۘ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i6 = ((iM31611 ^ i15) * 26057) ^ (-1354544859);
                        i7 = 2072551478;
                    } else {
                        iM31611 = C0773.m3169("۠ۚ") ^ i14;
                        i6 = ((iM31611 ^ i15) * (-21003)) ^ (-143529961);
                        i7 = 742865108;
                    }
                    i4 = i8;
                    i17 = iM31611 ^ i7;
                    i16 = i6;
                    i8 = i4;
                    break;
                case 434751825:
                case 465840376:
                    if (C0773.f2792 > 0) {
                        int iM2767 = (i14 - C0619.m2761("ۢۘ")) * 67;
                        i17 = iM2767 ^ 275811467;
                        i16 = ((iM2767 ^ i15) * (-32645)) ^ 1510323147;
                    } else {
                        z = z2 ? 1 : 0;
                        i2 = i8;
                        iM3169 = C0773.m3169("ۢ۫") ^ i14;
                        i16 = ((iM3169 ^ i15) * 2857) ^ (-1476751457);
                        i3 = -145912339;
                        int i111 = iM3169 ^ i3;
                        i8 = i2;
                        z2 = z;
                        i17 = i111;
                    }
                    activityC0093 = this;
                    break;
                case 777874898:
                case 1176565279:
                    z = z2 ? 1 : 0;
                    i2 = i8;
                    c = 281;
                    if (C23916.f77426 > 0) {
                        iM3169 = C0619.m2761("۬ۗ") ^ i15;
                        i16 = ((iM3169 ^ i14) * 6147) ^ (-195933690);
                        i3 = -908375669;
                        int i112 = iM3169 ^ i3;
                        i8 = i2;
                        z2 = z;
                        i17 = i112;
                        activityC0093 = this;
                    } else {
                        i8 = i2;
                        z2 = z ? 1 : 0;
                        int iM2768 = (i14 - C0619.m2761("ۢۘ")) * 67;
                        i17 = iM2768 ^ 275811467;
                        i16 = ((iM2768 ^ i15) * (-32645)) ^ 1510323147;
                        activityC0093 = this;
                    }
                    break;
                case 1082450098:
                case 1113024789:
                    z = z2 ? 1 : 0;
                    i2 = i8;
                    sArr = f1008;
                    if (C2966.f9654 >= 0) {
                        iM3169 = C0773.m3169("ۢ۫") ^ i14;
                        i16 = ((iM3169 ^ i15) * 2857) ^ (-1476751457);
                        i3 = -145912339;
                    } else {
                        iM3169 = C0773.m3169("ܳᩴ") ^ i14;
                        i16 = ((iM3169 ^ i15) * 10121) ^ (-1713489714);
                        i3 = 1714648015;
                    }
                    int i113 = iM3169 ^ i3;
                    i8 = i2;
                    z2 = z;
                    i17 = i113;
                    activityC0093 = this;
                    break;
                case 1320364213:
                case 1680409746:
                    sArr2 = f1008;
                    if (C2287.f7432 >= 0) {
                        z = z2 ? 1 : 0;
                        i2 = i8;
                        i11 = 282;
                        iM3169 = C0773.m3169("ۢ۫") ^ i14;
                        i16 = ((iM3169 ^ i15) * 2857) ^ (-1476751457);
                        i3 = -145912339;
                        int i114 = iM3169 ^ i3;
                        i8 = i2;
                        z2 = z;
                        i17 = i114;
                        activityC0093 = this;
                    } else {
                        int iM2769 = (C0619.m2761("᩶ۜ") ^ i15) * (-39);
                        i17 = iM2769 ^ 2037457081;
                        i16 = ((iM2769 ^ i14) * 24713) ^ (-778983886);
                        i11 = 282;
                    }
                    break;
                case 1349688915:
                case 1670522168:
                    i10 = 10682;
                    iM31610 = (C0619.m2761("۠ۙ") + i15) * (-121);
                    i = ((iM31610 ^ i14) * 249) ^ 157009473;
                    i5 = -590606403;
                    int i211 = iM31610 ^ i5;
                    i8 = i8;
                    i17 = i211;
                    i16 = i;
                    z2 = z2;
                    break;
                default:
                    C2834.m9335(C3033.m9847(sArr2, i11, i12, i10));
                    throw null;
            }
        }
    }
}
