package l;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.textfield.IndicatorViewController;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.᩻ᩴ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: X6KT */
/* JADX INFO: loaded from: classes2.dex */
public final class ActivityC23892 extends AbstractActivityC12483 {

    /* JADX INFO: renamed from: ۢ᩹ܰ, reason: not valid java name and contains not printable characters */
    private static final short[] f77392 = {6983, -30069, -30064, -30057, -30065, -30027, -30067, -30060, -30068, -30063, -30028, -30057, -30049, -30063, -30058, -30069, -30064, -30057, -30065, -30037, -30051, -30069, -30069, -30063, -30057, -30058, -30020, -30051, -30066, -30063, -30053, -30051, -30069, 9496, 23570, 23582, 23573, 23572, 23574, 23572, 23557, 23586, 23557, 23555, 23576, 23583, 23574, 23641, 23647, 23647, 23647, 23640, 23554, 23577, 23568, 23555, 23572, 23589, 23572, 23561, 23557, 23582, 23553, 23557, 23586, 23557, 23555, 23576, 23583, 23574, 23641, 23647, 23647, 23647, 23640, 23555, 23556, 23581, 23572, 23554, 23591, 23576, 23572, 23558, 23555, 23556, 23581, 23572, 23554, 3868, -14042, -15086, 15958, -13266, -14929, 23568, 23570, 23557, 23576, 23559, 23572, 23576, 23583, 23568, 23570, 23557, 23576, 23559, 23572, 23589, 23576, 23557, 23581, 23572, 23576, 23583, 23568, 23570, 23557, 23576, 23559, 23572, 23589, 23572, 23561, 23557, 16272, -11559, 14282, 14255, 604, -10455, -11688, 569, -10738, 13201, 12875, 10879, 23553, 23582, 23576, 23583, 23557, 23554, 23572, 23583, 23568, 23571, 23581, 23572, 23573, -15868, -13628, 4714, 871, 9817, 9044, 23557, 23582, 23557, 23568, 23581, -8679, -12723, 13983, -10187, -8959, 1213, -10969, 9727, -15847, 23570, 23568, 23553, 23553, 23572, 23573, 663, -14294, 8833, -13367, 2342, 20, 23583, 23572, 23561, 23557, 23585, 23582, 23576, 23583, 23557, 23554, -16197, 13968, 5114, 23580, 23568, 23561, 23602, 23581, 23576, 23572, 23583, 23557, 23554, -16000, -15133, 1068, 212, 7085, -12748, -12399, 4809, -14951, 6644, 4547, -31498, -31495, -31501, -31515, -31496, -31490, -31501, -31559, -31490, -31495, -31517, -31502, -31495, -31517, -31559, -31498, -31500, -31517, -31490, -31496, -31495, -31559, -31548, -31534, -31527, -31533, -31517, -31502, -31505, -31517, -31560, -31513, -31493, -31498, -31490, -31495, -31498, -31495, -31501, -31515, -31496, -31490, -31501, -31559, -31490, -31495, -31517, -31502, -31495, -31517, -31559, -31502, -31505, -31517, -31515, -31498, -31559, -31549, -31534, -31537, -31549, 4039, 3090, 1279, 2575, -29500, -29485, -29488, -29500, -29485, -29499, -29474, -29446, -29481, -29489, -29479, -29501, -29502, 5049, 1020, -276, -1324, 6614, 5287, 5335, 3316, 1560, 7695, 4908, -2667, -2676, 26655, 26624, 26636, 26654, 26689, 26695, 26695, 26695, 26688, 26636, 26641, 26649, 26632, 26631, 26637, 26636, 26637, 26683, 26652, 26629, 26636, 26650, 26651, 26636, 26634, 26630, 26651, 26637, 26650, 26682, 26636, 26629, 26636, 26634, 26653, 26636, 26637, 26650, 26634, 26651, 26630, 26629, 26629, 26672, -2751, 9813, -1886, 7013, 10096, 6485, -4723, -4127, -1279, 5935, 12548, -727, 2200, -8112, 680, 12910, 15600, 7115, 33, 15670, -3186, 7556, 1145, -8047, -7196, -1862, 7764, 13444, 13094, 10073, 26651, 26636, 26639, 26651, 26636, 26650, 26625, 26661, 26632, 26640, 26630, 26652, 26653, -2838, -4560, -3365, 1676, -3928, -3462, 5621, -623, -6203, 1515, -7796, -4403, 6680, 2080, 10006, 26654, 26651, 26632, 26649, 26689, 26695, 26695, 26695, 26688, -3137, -7085, -2920, 4009, 3020, -1514, 5984, 16338, 16328, 16329, 16366, 16329, 16348, 16329, 16344, 16335, 16344, 16350, 16338, 16335, 16345, 16334, 16366, 16344, 16337, 16344, 16350, 16329, 16344, 16345, 16335, 16328, 16337, 16344, 16334, 16363, 16340, 16344, 16330, 16344, 16325, 16333, 16348, 16339, 16345, 16344, 16345, 16367, 16328, 16337, 16344, 16334, -18258, -19078, -17013, 16334, 16350, 16335, 16338, 16337, 16337, 16356, 1768, 9178, 9197, 9198, 9197, 9210, 9210, 9193, 9188, 9161, 9195, 9212, 9185, 9214, 9185, 9212, 9201};

    /* JADX INFO: renamed from: ᩳܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f77393 = 0;

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public boolean f77394;

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public String f77395;

    /* JADX INFO: renamed from: ۘܰ, reason: not valid java name and contains not printable characters */
    public int f77396;

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public int f77397;

    /* JADX INFO: renamed from: ۜܰ, reason: not valid java name and contains not printable characters */
    public boolean f77398;

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public final String f77399;

    /* JADX INFO: renamed from: ܶܰ, reason: not valid java name and contains not printable characters */
    public C4531 f77400;

    /* JADX INFO: renamed from: ᩸ܰ, reason: not valid java name and contains not printable characters */
    public String f77401;

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public boolean f77402;

    /* JADX INFO: renamed from: ᩺ܰ, reason: not valid java name and contains not printable characters */
    public C6018 f77403;

    @Override // l.AbstractActivityC12483
    /* JADX INFO: renamed from: ۡ */
    public final String mo126() {
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
        int i6 = 367538847;
        int i7 = AbstractC0464.f2088;
        int i8 = C0629.f2722;
        int iM11306 = ThreadFactoryC3888.m11306("ۗۤ") ^ i8;
        int i9 = ((iM11306 ^ i7) * (-29577)) ^ 1695796172;
        int i10 = 1536739225;
        while (true) {
            i6 = ((((i6 ^ i7) * 31631) >> 31) & i9) ^ (iM11306 ^ i10);
            switch (i6) {
                case -2084595976:
                case -574872074:
                    i = s * s2;
                    i2 = s * s;
                    if (C2124.f7782 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۖۘ") ^ i7) * 57;
                        i9 = ((iM11306 ^ i8) * (-28755)) ^ (-302744775);
                        i10 = -1213688768;
                    } else {
                        iM11306 = C19806.m45029("ۢ᩵") ^ i8;
                        i9 = ((iM11306 ^ i7) * 5301) ^ 2067620205;
                        i10 = 1826071268;
                    }
                    break;
                case -2074308610:
                case 1224199600:
                    sArr = f77392;
                    if (C0797.f3386) {
                        iM11306 = C19806.m45029("ܳ֫") ^ i8;
                        i9 = ((iM11306 ^ i7) * 29043) ^ (-1850339805);
                        i10 = 314175910;
                    } else {
                        iM11306 = (i8 - ThreadFactoryC3888.m11306("ᩴۨ")) * (-73);
                        i9 = ((iM11306 ^ i7) * (-30387)) ^ 1627650163;
                        i10 = -1743962042;
                    }
                    break;
                case -1974659135:
                case -1638710330:
                    if (!C2704.f10408) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۖۘ") ^ i7) * 57;
                        i9 = ((iM11306 ^ i8) * (-28755)) ^ (-302744775);
                        i10 = -1213688768;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩵۬") + i7) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i9 = ((iM11306 ^ i8) * (-3801)) ^ (-616090394);
                        i10 = -821535733;
                    }
                    break;
                case -1784655082:
                case -700826564:
                    if ((i2 + i3) - i < 0) {
                        iM11306 = (i7 - C19806.m45029("۟ᩴ")) * (-49);
                        i9 = ((iM11306 ^ i8) * 20861) ^ (-1799171368);
                        i10 = 2082254112;
                    } else {
                        iM11306 = (C19806.m45029("᩵ܿ") ^ i7) * (-31);
                        i9 = ((iM11306 ^ i8) * 6477) ^ 45155191;
                        i10 = 20121670;
                    }
                    break;
                case -1567644268:
                case 1767140302:
                    i4 = 21376;
                    iM11306 = C19806.m45029("ۗۗ") ^ i8;
                    i9 = ((iM11306 ^ i7) * 18595) ^ 655836322;
                    i10 = 1923864773;
                    break;
                case -1261994639:
                case 916109403:
                    ViewTreeObserverOnPreDrawListenerC3327.m9874();
                    iM11306 = C19806.m45029("ܳ֫") ^ i8;
                    i9 = ((iM11306 ^ i7) * 29043) ^ (-1850339805);
                    i10 = 314175910;
                    break;
                case -1178809004:
                case -741723787:
                    c = 481;
                    if (C0526.m2437() >= 0) {
                        iM11306 = C19806.m45029("ܳ֫") ^ i8;
                        i9 = ((iM11306 ^ i7) * 29043) ^ (-1850339805);
                        i10 = 314175910;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۤۢ") ^ i7;
                        i9 = ((iM11306 ^ i8) * (-22957)) ^ (-684299543);
                        i10 = 872407081;
                    }
                    break;
                case -971568639:
                case 232231679:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۖۘ") ^ i7) * 57;
                        i9 = ((iM11306 ^ i8) * (-28755)) ^ (-302744775);
                        i10 = -1213688768;
                    } else {
                        iM11306 = (C19806.m45029("ᩳ᩻") ^ i8) * (-79);
                        i9 = ((iM11306 ^ i7) * (-13303)) ^ (-878974320);
                        i10 = 428638125;
                    }
                    break;
                case -940119803:
                case 1033135073:
                    C0671.m3008();
                    if (RunnableC3388.f12514 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۗܳ") ^ i8;
                        i9 = ((iM11306 ^ i7) * 12031) ^ (-1195183861);
                        i10 = 636859299;
                    } else {
                        iM11306 = C19806.m45029("ܳ֫") ^ i8;
                        i9 = ((iM11306 ^ i7) * 29043) ^ (-1850339805);
                        i10 = 314175910;
                    }
                    break;
                case -532961622:
                case 1640288993:
                    sArr2 = f77392;
                    i5 = 482;
                    if (C1398.f5802 <= 0) {
                        iM11306 = C19806.m45029("ܳ֫") ^ i8;
                        i9 = ((iM11306 ^ i7) * 29043) ^ (-1850339805);
                        i10 = 314175910;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܽ᩸") ^ i7;
                        i9 = ((iM11306 ^ i8) * 9685) ^ 944641869;
                        i10 = -1561303698;
                    }
                    break;
                case -301725706:
                case 1185338350:
                    if (C19806.f63586) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۖۘ") ^ i7) * 57;
                        i9 = ((iM11306 ^ i8) * (-28755)) ^ (-302744775);
                        i10 = -1213688768;
                    } else {
                        iM11306 = (C19806.m45029("ܳۤ") + i7) * (-127);
                        i9 = ((iM11306 ^ i8) * 11845) ^ (-1153615072);
                        i10 = 1946333206;
                    }
                    break;
                case 30852538:
                case 1033778456:
                    C2124.m6673();
                    return null;
                case 418871105:
                case 899555314:
                    if (C7105.m18985()) {
                        iM11306 = C19806.m45029("ܳ֫") ^ i8;
                        i9 = ((iM11306 ^ i7) * 29043) ^ (-1850339805);
                        i10 = 314175910;
                    } else {
                        iM11306 = (i8 - ThreadFactoryC3888.m11306("ܽ᩷")) * (-63);
                        i9 = ((iM11306 ^ i7) * (-21339)) ^ (-2059340416);
                        i10 = -1912236482;
                    }
                    break;
                case 440591293:
                case 909590529:
                    if (!C2704.f10408) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩵۬") + i7) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i9 = ((iM11306 ^ i8) * (-3801)) ^ (-616090394);
                        i10 = -821535733;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۗܳ") ^ i8;
                        i9 = ((iM11306 ^ i7) * 12031) ^ (-1195183861);
                        i10 = 636859299;
                    }
                    break;
                case 464581998:
                case 2142805491:
                    i3 = 333135504;
                    if (C2477.f9839 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩵۬") + i7) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i9 = ((iM11306 ^ i8) * (-3801)) ^ (-616090394);
                        i10 = -821535733;
                    } else {
                        iM11306 = (i8 - C19806.m45029("ܿ᩶")) * 51;
                        i9 = ((iM11306 ^ i7) * (-6353)) ^ 392779674;
                        i10 = 1253360225;
                    }
                    break;
                case 1037385854:
                case 1805486960:
                    s = sArr[c];
                    s2 = 36504;
                    if (C0797.f3386) {
                        iM11306 = ThreadFactoryC3888.m11306("ۚ᩺") ^ i8;
                        i9 = ((iM11306 ^ i7) * 8813) ^ (-722737088);
                        i10 = -1925415454;
                    } else {
                        iM11306 = (C19806.m45029("᩹ۗ") ^ i7) * (-35);
                        i9 = ((iM11306 ^ i8) * (-22799)) ^ 580187663;
                        i10 = 1763072301;
                    }
                    break;
                case 1156350729:
                case 1292045035:
                    i4 = 9096;
                    iM11306 = C19806.m45029("ۗۗ") ^ i8;
                    i9 = ((iM11306 ^ i7) * 18595) ^ 655836322;
                    i10 = 1923864773;
                    break;
                case 1385673006:
                case 2013227746:
                    if (C3535.f13026 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۚ᩺") ^ i8;
                        i9 = ((iM11306 ^ i7) * 8813) ^ (-722737088);
                        i10 = -1925415454;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۬ۜ") ^ i7;
                        i9 = ((iM11306 ^ i8) * (-7901)) ^ 1384656359;
                        i10 = -1636474794;
                    }
                    break;
                default:
                    return C1189.m4365(sArr2, i5, 16, i4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:45:0x0186 A[PHI: r3 r10
      0x0186: PHI (r3v7 int) = (r3v4 int), (r3v2 int), (r3v2 int) binds: [B:44:0x0184, B:29:0x00e2, B:101:0x0186] A[DONT_GENERATE, DONT_INLINE]
      0x0186: PHI (r10v6 java.lang.String) = (r10v2 java.lang.String), (r10v3 java.lang.String), (r10v2 java.lang.String) binds: [B:44:0x0184, B:29:0x00e2, B:101:0x0186] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x01de A[PHI: r9 r11 r12
      0x01de: PHI (r9v4 java.lang.String) = (r9v2 java.lang.String), (r9v3 java.lang.String), (r9v2 java.lang.String), (r9v2 java.lang.String) binds: [B:52:0x01dc, B:48:0x01b9, B:17:0x0087, B:102:0x01de] A[DONT_GENERATE, DONT_INLINE]
      0x01de: PHI (r11v4 short[]) = (r11v3 short[]), (r11v2 short[]), (r11v2 short[]), (r11v2 short[]) binds: [B:52:0x01dc, B:48:0x01b9, B:17:0x0087, B:102:0x01de] A[DONT_GENERATE, DONT_INLINE]
      0x01de: PHI (r12v4 int) = (r12v3 int), (r12v2 int), (r12v2 int), (r12v2 int) binds: [B:52:0x01dc, B:48:0x01b9, B:17:0x0087, B:102:0x01de] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x02e8 A[PHI: r16 r17 r19 r27
      0x02e8: PHI (r16v6 int) = (r16v2 int), (r16v2 int), (r16v3 int), (r16v2 int) binds: [B:77:0x02e6, B:12:0x007a, B:110:0x02e8, B:108:0x02e8] A[DONT_GENERATE, DONT_INLINE]
      0x02e8: PHI (r17v6 int) = (r17v2 int), (r17v2 int), (r17v3 int), (r17v2 int) binds: [B:77:0x02e6, B:12:0x007a, B:110:0x02e8, B:108:0x02e8] A[DONT_GENERATE, DONT_INLINE]
      0x02e8: PHI (r19v6 short[]) = (r19v3 short[]), (r19v2 short[]), (r19v2 short[]), (r19v2 short[]) binds: [B:77:0x02e6, B:12:0x007a, B:110:0x02e8, B:108:0x02e8] A[DONT_GENERATE, DONT_INLINE]
      0x02e8: PHI (r27v7 int) = (r27v3 int), (r27v3 int), (r27v4 int), (r27v3 int) binds: [B:77:0x02e6, B:12:0x007a, B:110:0x02e8, B:108:0x02e8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:80:0x0310 A[PHI: r20
      0x0310: PHI (r20v4 char) = (r20v3 char), (r20v2 char), (r20v2 char), (r20v2 char) binds: [B:73:0x02cb, B:12:0x007a, B:6:0x006b, B:109:0x0310] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52656(boolean z) {
        int iM11306;
        int i;
        int iM45029;
        int i2;
        int i3;
        ActivityC23892 activityC23892 = this;
        int i4 = C1668.f6641;
        int i5 = C3660.f13403;
        int iM11307 = ThreadFactoryC3888.m11306("᩵ۙ") ^ i5;
        int i6 = ((iM11307 ^ i4) * 7919) ^ (-1500782716);
        View viewM1436 = null;
        View viewM7083 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i7 = iM11307 ^ 1723009010;
        int iM450210 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        char c = 0;
        short s = 0;
        int i15 = 0;
        int i16 = -629473888;
        int i17 = 0;
        String strM4365 = null;
        String strM4892 = null;
        int i18 = 0;
        while (true) {
            i16 = i7 ^ (i6 & (((i16 ^ i4) * (-17201)) >> 31));
            switch (i16) {
                case -2106903340:
                case -1250679029:
                    i17 = i15 * i15;
                    i12 = s * s;
                    i13 = 73530625;
                    if (C1875.f7103 < 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۛ֡") ^ i5;
                        i2 = ((iM45029 ^ i4) * 15333) ^ 1078290686;
                        i3 = -1288729194;
                        i7 = iM45029 ^ i3;
                        i6 = i2;
                    } else {
                        iM11306 = C19806.m45029("ܿۙ") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-28911)) ^ (-2111072092);
                        i = -1708235943;
                        i7 = iM11306 ^ i;
                        activityC23892 = this;
                    }
                    break;
                case -1953545971:
                case 599142424:
                    i9 = 0;
                    iM45029 = ThreadFactoryC3888.m11306("᩻ۚ") ^ i4;
                    i2 = ((iM45029 ^ i5) * 681) ^ (-721659060);
                    i3 = -1535669659;
                    i7 = iM45029 ^ i3;
                    i6 = i2;
                    break;
                case -1800400341:
                case 1502119833:
                    strM4892 = C1398.m4892(sArr2, i10, 3, i8);
                    if (C3722.f13525 <= 0) {
                        iM45029 = C19806.m45029("᩸᩻") ^ i4;
                        i2 = ((iM45029 ^ i5) * 1253) ^ (-1872454491);
                        i3 = -401272153;
                    } else {
                        iM45029 = (i5 - C19806.m45029("ۘۢ")) * (-49);
                        i2 = ((iM45029 ^ i4) * 11255) ^ (-847122564);
                        i3 = 1523142775;
                    }
                    i7 = iM45029 ^ i3;
                    i6 = i2;
                    break;
                case -1777149012:
                case 601969843:
                    viewM7083 = C2332.m7083(activityC23892, C19806.m45029(strM4365) ^ 2121407397);
                    if (z) {
                        i18 = i14;
                        iM45029 = (ThreadFactoryC3888.m11306("᩶ۛ") + i4) * (-69);
                        i2 = ((iM45029 ^ i5) * 537) ^ 710467658;
                        i3 = 1544951124;
                    } else {
                        iM45029 = (i5 - ThreadFactoryC3888.m11306("ۢۤ")) * (-81);
                        i2 = ((iM45029 ^ i4) * (-26063)) ^ (-1229554829);
                        i3 = -1038146909;
                    }
                    i7 = iM45029 ^ i3;
                    i6 = i2;
                    break;
                case -1657072072:
                case -662759086:
                    C1148.m4232();
                    iM45029 = C19806.m45029("᩸᩻") ^ i4;
                    i2 = ((iM45029 ^ i5) * 1253) ^ (-1872454491);
                    i3 = -401272153;
                    i7 = iM45029 ^ i3;
                    i6 = i2;
                    break;
                case -1390616736:
                case -563228636:
                    iM450210 = 2119981609 ^ C19806.m45029(strM4892);
                    if (C19806.m45024()) {
                        iM45029 = ThreadFactoryC3888.m11306("ۛ᩺") ^ i4;
                        i2 = ((iM45029 ^ i5) * 6057) ^ (-2090854438);
                        i3 = 1171291446;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֫۟") ^ i5;
                        i2 = ((iM45029 ^ i4) * (-16443)) ^ 757720640;
                        i3 = 966218881;
                    }
                    i7 = iM45029 ^ i3;
                    i6 = i2;
                    break;
                case -1371946154:
                case 858108798:
                    viewM1436 = RunnableC0195.m1436(activityC23892, iM450210);
                    i14 = 0;
                    if (z) {
                        iM45029 = C19806.m45029("۟ۖ") ^ i5;
                        i2 = ((iM45029 ^ i4) * 27661) ^ (-1344654745);
                        i3 = 1266138823;
                    } else {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("ۗۚ")) * (-43);
                        i2 = ((iM45029 ^ i5) * (-22433)) ^ 404042852;
                        i3 = 99632225;
                    }
                    i7 = iM45029 ^ i3;
                    i6 = i2;
                    break;
                case -1204897594:
                case 127835224:
                    sArr = f77392;
                    if (C3660.f13403 >= 0) {
                        iM11306 = C19806.m45029("ܿۙ") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-28911)) ^ (-2111072092);
                        i = -1708235943;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۟᩻") ^ i5;
                        i6 = ((iM11306 ^ i4) * 13507) ^ 156631002;
                        i = 672129471;
                    }
                    i7 = iM11306 ^ i;
                    activityC23892 = this;
                    break;
                case -1142980157:
                case -980961941:
                    i8 = 19832;
                    iM45029 = (i5 - C19806.m45029("ۖܺ")) * (-69);
                    i2 = ((iM45029 ^ i4) * (-26081)) ^ 1337387708;
                    i3 = 451942660;
                    i7 = iM45029 ^ i3;
                    i6 = i2;
                    break;
                case -1079955584:
                case 241831866:
                    c = 209;
                    if (C1668.f6641 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩷۬") ^ i5;
                        i6 = ((iM11306 ^ i4) * 15919) ^ 807370317;
                        i = 1339163460;
                    } else {
                        iM11306 = C19806.m45029("ᩴܿ") ^ i5;
                        i6 = ((iM11306 ^ i4) * 22973) ^ 661000169;
                        i = -35330038;
                    }
                    i7 = iM11306 ^ i;
                    activityC23892 = this;
                    break;
                case -1070462964:
                case -363742129:
                    i18 = 8;
                    iM45029 = (ThreadFactoryC3888.m11306("᩶ۛ") + i4) * (-69);
                    i2 = ((iM45029 ^ i5) * 537) ^ 710467658;
                    i3 = 1544951124;
                    i7 = iM45029 ^ i3;
                    i6 = i2;
                    break;
                case -929828176:
                case 1148846122:
                    strM4365 = C1189.m4365(sArr3, i11, 3, i8);
                    if (C1066.m4023() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۛ᩺") ^ i4;
                        i2 = ((iM45029 ^ i5) * 6057) ^ (-2090854438);
                        i3 = 1171291446;
                    } else {
                        iM45029 = (i4 - C19806.m45029("ܽ᩹")) * 15;
                        i2 = ((iM45029 ^ i5) * 25097) ^ (-606564479);
                        i3 = -1010532642;
                    }
                    i7 = iM45029 ^ i3;
                    i6 = i2;
                    break;
                case -889634921:
                case -760578218:
                    if (C3722.f13525 > 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩷۬") ^ i5;
                        i6 = ((iM11306 ^ i4) * 15919) ^ 807370317;
                        i = 1339163460;
                    } else {
                        iM11306 = C19806.m45029("ܿۙ") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-28911)) ^ (-2111072092);
                        i = -1708235943;
                    }
                    i7 = iM11306 ^ i;
                    activityC23892 = this;
                    break;
                case -687481570:
                case 943377065:
                    C2249.m6915();
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۛ᩺") ^ i4;
                        i2 = ((iM45029 ^ i5) * 6057) ^ (-2090854438);
                        i3 = 1171291446;
                        i7 = iM45029 ^ i3;
                        i6 = i2;
                    } else {
                        iM11306 = C19806.m45029("ܿۙ") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-28911)) ^ (-2111072092);
                        i = -1708235943;
                        i7 = iM11306 ^ i;
                        activityC23892 = this;
                    }
                    break;
                case -645108910:
                case 856579397:
                    C3722.m10890(viewM1436, i9);
                    sArr3 = f77392;
                    i11 = 213;
                    if (C7105.m18985()) {
                        iM45029 = (i5 - ThreadFactoryC3888.m11306("۫᩹")) * (-17);
                        i2 = ((iM45029 ^ i4) * 23465) ^ (-1928244013);
                        i3 = 981079877;
                    } else {
                        iM45029 = (i5 - ThreadFactoryC3888.m11306("᩻۠")) * (-43);
                        i2 = ((iM45029 ^ i4) * 28821) ^ 997742567;
                        i3 = 1322811750;
                    }
                    i7 = iM45029 ^ i3;
                    i6 = i2;
                    break;
                case -589740973:
                case -149769029:
                    i9 = 8;
                    iM45029 = ThreadFactoryC3888.m11306("᩻ۚ") ^ i4;
                    i2 = ((iM45029 ^ i5) * 681) ^ (-721659060);
                    i3 = -1535669659;
                    i7 = iM45029 ^ i3;
                    i6 = i2;
                    break;
                case -387403070:
                case 226534752:
                    RunnableC1895.m6170();
                    if (!C3286.f12186) {
                        iM45029 = C19806.m45029("᩸᩻") ^ i4;
                        i2 = ((iM45029 ^ i5) * 1253) ^ (-1872454491);
                        i3 = -401272153;
                        i7 = iM45029 ^ i3;
                        i6 = i2;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩷۬") ^ i5;
                        i6 = ((iM11306 ^ i4) * 15919) ^ 807370317;
                        i = 1339163460;
                        i7 = iM11306 ^ i;
                        activityC23892 = this;
                    }
                    break;
                case -237264667:
                case 2137829691:
                    C0216.m1591();
                    break;
                case -117149296:
                case 1783230978:
                    short s2 = sArr[c];
                    int i19 = s2 + 8575;
                    if (AbstractC0464.f2088 > 0) {
                        int iM450211 = (C19806.m45029("᩶۠") + i4) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        int i20 = ((iM450211 ^ i5) * 27709) ^ (-1130723597);
                        i7 = iM450211 ^ 1906914571;
                        s = s2;
                        i15 = i19;
                        i6 = i20;
                        activityC23892 = this;
                    } else {
                        s = s2;
                        i15 = i19;
                        iM45029 = (i5 - ThreadFactoryC3888.m11306("۫᩹")) * (-17);
                        i2 = ((iM45029 ^ i4) * 23465) ^ (-1928244013);
                        i3 = 981079877;
                        i7 = iM45029 ^ i3;
                        i6 = i2;
                    }
                    break;
                case -75231569:
                case 612464371:
                    int i21 = i12 + i13;
                    if (i17 - (i21 + i21) <= 0) {
                        iM45029 = (C19806.m45029("ܽܽ") + i4) * (-21);
                        i2 = ((iM45029 ^ i5) * 29627) ^ (-751220678);
                        i3 = 1464869822;
                    } else {
                        iM45029 = C19806.m45029("۟ۢ") ^ i4;
                        i2 = ((iM45029 ^ i5) * (-31761)) ^ 2136809921;
                        i3 = -1744005656;
                    }
                    i7 = iM45029 ^ i3;
                    i6 = i2;
                    break;
                case -50824165:
                case 79429793:
                    activityC23892.f77398 = z;
                    sArr2 = f77392;
                    i10 = 210;
                    if (C0962.f3784) {
                        iM45029 = C19806.m45029("᩸᩻") ^ i4;
                        i2 = ((iM45029 ^ i5) * 1253) ^ (-1872454491);
                        i3 = -401272153;
                    } else {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("ۡ᩺")) * (-101);
                        i2 = ((iM45029 ^ i5) * 5917) ^ 1506761391;
                        i3 = 1700249307;
                    }
                    i7 = iM45029 ^ i3;
                    i6 = i2;
                    break;
                case 259433108:
                case 1192198788:
                    i8 = 2011;
                    iM45029 = (i5 - C19806.m45029("ۖܺ")) * (-69);
                    i2 = ((iM45029 ^ i4) * (-26081)) ^ 1337387708;
                    i3 = 451942660;
                    i7 = iM45029 ^ i3;
                    i6 = i2;
                    break;
                case 1131910373:
                case 1995005304:
                    RunnableC1895.m6165(viewM7083, i18);
                    break;
                default:
                    if (C0526.f2219) {
                        iM11306 = ThreadFactoryC3888.m11306("᩷۬") ^ i5;
                        i6 = ((iM11306 ^ i4) * 15919) ^ 807370317;
                        i = 1339163460;
                    } else {
                        iM11306 = C19806.m45029("᩶֨") ^ i4;
                        i6 = ((iM11306 ^ i5) * 7813) ^ 25107320;
                        i = -1863890635;
                    }
                    i7 = iM11306 ^ i;
                    activityC23892 = this;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x01c7 A[PHI: r7 r8 r9 r13 r14 r18
      0x01c7: PHI (r7v5 int) = (r7v3 int), (r7v2 int), (r7v2 int), (r7v2 int), (r7v2 int) binds: [B:52:0x01c5, B:48:0x01a4, B:24:0x009a, B:15:0x0071, B:8:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x01c7: PHI (r8v5 int) = (r8v3 int), (r8v2 int), (r8v2 int), (r8v2 int), (r8v2 int) binds: [B:52:0x01c5, B:48:0x01a4, B:24:0x009a, B:15:0x0071, B:8:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x01c7: PHI (r9v5 int) = (r9v2 int), (r9v3 int), (r9v2 int), (r9v2 int), (r9v2 int) binds: [B:52:0x01c5, B:48:0x01a4, B:24:0x009a, B:15:0x0071, B:8:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x01c7: PHI (r13v5 short[]) = (r13v2 short[]), (r13v2 short[]), (r13v3 short[]), (r13v2 short[]), (r13v2 short[]) binds: [B:52:0x01c5, B:48:0x01a4, B:24:0x009a, B:15:0x0071, B:8:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x01c7: PHI (r14v5 int) = (r14v2 int), (r14v2 int), (r14v3 int), (r14v2 int), (r14v2 int) binds: [B:52:0x01c5, B:48:0x01a4, B:24:0x009a, B:15:0x0071, B:8:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x01c7: PHI (r18v33 int) = (r18v11 int), (r18v12 int), (r18v21 int), (r18v26 int), (r18v34 int) binds: [B:52:0x01c5, B:48:0x01a4, B:24:0x009a, B:15:0x0071, B:8:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x01ff A[PHI: r6 r11 r12 r18
      0x01ff: PHI (r6v4 int) = (r6v3 int), (r6v2 int) binds: [B:56:0x01fd, B:30:0x00dc] A[DONT_GENERATE, DONT_INLINE]
      0x01ff: PHI (r11v3 short[]) = (r11v2 short[]), (r11v4 short[]) binds: [B:56:0x01fd, B:30:0x00dc] A[DONT_GENERATE, DONT_INLINE]
      0x01ff: PHI (r12v3 int) = (r12v2 int), (r12v4 int) binds: [B:56:0x01fd, B:30:0x00dc] A[DONT_GENERATE, DONT_INLINE]
      0x01ff: PHI (r18v18 int) = (r18v10 int), (r18v19 int) binds: [B:56:0x01fd, B:30:0x00dc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x02ad A[PHI: r4 r18 r19
      0x02ad: PHI (r4v4 char) = (r4v2 char), (r4v2 char), (r4v3 char), (r4v2 char), (r4v2 char) binds: [B:72:0x02ab, B:68:0x0289, B:64:0x026d, B:17:0x0075, B:15:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x02ad: PHI (r18v25 int) = (r18v6 int), (r18v7 int), (r18v8 int), (r18v24 int), (r18v26 int) binds: [B:72:0x02ab, B:68:0x0289, B:64:0x026d, B:17:0x0075, B:15:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x02ad: PHI (r19v6 short[]) = (r19v5 short[]), (r19v4 short[]), (r19v4 short[]), (r19v4 short[]), (r19v4 short[]) binds: [B:72:0x02ab, B:68:0x0289, B:64:0x026d, B:17:0x0075, B:15:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52653(ActivityC23892 activityC23892) {
        int i;
        int iM11306;
        int i2;
        int i3;
        String strM6685;
        String str = null;
        char c = 0;
        short s = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        short[] sArr = null;
        int i9 = 0;
        short[] sArr2 = null;
        int i10 = 0;
        int i11 = -1515639408;
        int i12 = C2642.f10294;
        int i13 = C10634.f36300;
        int iM45029 = C19806.m45029("᩵ܽ") ^ i12;
        int i14 = ((iM45029 ^ i13) * 31743) ^ 86291946;
        int i15 = iM45029 ^ (-24657445);
        short[] sArr3 = null;
        while (true) {
            Intent intent = null;
            while (true) {
                i = i15 ^ (i14 & (((i11 ^ i13) * (-14441)) >> 31));
                switch (i) {
                    case -2060831608:
                    case 1782374415:
                        i = i;
                        i7 = 265429264;
                        if (C0629.f2722 <= 0) {
                            iM11306 = (ThreadFactoryC3888.m11306("֫ۜ") + i13) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                            i2 = ((iM11306 ^ i12) * (-915)) ^ 1784042945;
                            i3 = -404907327;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("ܰ۫") ^ i12;
                            i2 = ((iM11306 ^ i13) * 8325) ^ (-663993628);
                            i3 = 179959264;
                        }
                        int i16 = i;
                        i15 = iM11306 ^ i3;
                        i14 = i2;
                        i11 = i16;
                        break;
                    case -2014636339:
                    case -298672778:
                        i = i;
                        if (C2642.f10294 > 0) {
                            intent = new Intent(activityC23892, (Class<?>) ViewOnClickListenerC23604.class);
                            if (activityC23892.f77394) {
                                iM11306 = (i13 - ThreadFactoryC3888.m11306("ܶᩴ")) * (-37);
                                i2 = ((iM11306 ^ i12) * 3259) ^ 1902868641;
                                i3 = 1964157358;
                            } else {
                                iM11306 = (C19806.m45029("᩻ۨ") ^ i13) * (-63);
                                i2 = ((iM11306 ^ i12) * 2299) ^ 1860672729;
                                i3 = 1588720836;
                            }
                            int i17 = i;
                            i15 = iM11306 ^ i3;
                            i14 = i2;
                            i11 = i17;
                        }
                        break;
                    case -1937415473:
                    case 1288716958:
                        strM6685 = C2124.m6685(sArr, i9, 14, i8);
                        str = strM6685;
                        iM11306 = C19806.m45029("۬ܿ") ^ i12;
                        i2 = ((iM11306 ^ i13) * 7003) ^ 1323706648;
                        i3 = -665271753;
                        int i18 = i;
                        i15 = iM11306 ^ i3;
                        i14 = i2;
                        i11 = i18;
                        break;
                    case -1911559931:
                    case 518829189:
                        strM6685 = C2332.m7082(sArr2, i10, 18, i8);
                        str = strM6685;
                        iM11306 = C19806.m45029("۬ܿ") ^ i12;
                        i2 = ((iM11306 ^ i13) * 7003) ^ 1323706648;
                        i3 = -665271753;
                        int i19 = i;
                        i15 = iM11306 ^ i3;
                        i14 = i2;
                        i11 = i19;
                        break;
                    case -1845362665:
                    case 354576993:
                        i = i;
                        int i20 = i6 + i7;
                        if (i5 - (i20 + i20) > 0) {
                            iM11306 = (C19806.m45029("᩷ۘ") ^ i13) * 55;
                            i2 = ((iM11306 ^ i12) * 5447) ^ 2077537234;
                            i3 = -1671967690;
                        } else {
                            iM11306 = (C19806.m45029("ᩳۘ") + i13) * (-45);
                            i2 = ((iM11306 ^ i12) * (-26875)) ^ 1720529616;
                            i3 = -1785827858;
                        }
                        int i110 = i;
                        i15 = iM11306 ^ i3;
                        i14 = i2;
                        i11 = i110;
                        break;
                    case -1761868240:
                    case 870152518:
                        i8 = 53226;
                        iM11306 = (ThreadFactoryC3888.m11306("ۡ۫") + i12) * (-123);
                        i2 = ((iM11306 ^ i13) * 20981) ^ (-1840982128);
                        i3 = 1208576825;
                        int i111 = i;
                        i15 = iM11306 ^ i3;
                        i14 = i2;
                        i11 = i111;
                        break;
                    case -1719584264:
                    case -1647427484:
                        i = i;
                        i4 = s + 16292;
                        if (CallableC1627.f6528) {
                            iM11306 = C19806.m45029("۟ۙ") ^ i13;
                            i2 = ((iM11306 ^ i12) * 18981) ^ (-1450789463);
                            i3 = 428059853;
                        } else {
                            iM11306 = (C19806.m45029("ܰۘ") + i13) * (-13);
                            i2 = ((iM11306 ^ i12) * (-31285)) ^ (-844770308);
                            i3 = 2047109942;
                        }
                        int i112 = i;
                        i15 = iM11306 ^ i3;
                        i14 = i2;
                        i11 = i112;
                        break;
                    case -1599946591:
                    case -1382233466:
                        i = i;
                        if (RunnableC3388.f12514 >= 0) {
                            iM11306 = (ThreadFactoryC3888.m11306("ۢܳ") ^ i13) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                            i2 = ((iM11306 ^ i12) * (-18281)) ^ (-295427299);
                            i3 = 1971176256;
                        } else {
                            iM11306 = (i13 - ThreadFactoryC3888.m11306("ۛۧ")) * (-15);
                            i2 = ((iM11306 ^ i12) * (-2861)) ^ (-58412670);
                            i3 = -1314086701;
                        }
                        int i113 = i;
                        i15 = iM11306 ^ i3;
                        i14 = i2;
                        i11 = i113;
                        break;
                    case -1549522206:
                    case 1538814287:
                        i = i;
                        sArr = f77392;
                        i9 = 1;
                        if (RunnableC1895.m6170() != 0) {
                            iM11306 = (C19806.m45029("ܰۘ") + i13) * (-13);
                            i2 = ((iM11306 ^ i12) * (-31285)) ^ (-844770308);
                            i3 = 2047109942;
                        } else {
                            iM11306 = (i12 - C19806.m45029("ۖۧ")) * 85;
                            i2 = ((iM11306 ^ i13) * (-12025)) ^ (-139775573);
                            i3 = -221016302;
                        }
                        int i114 = i;
                        i15 = iM11306 ^ i3;
                        i14 = i2;
                        i11 = i114;
                        break;
                    case -1501066372:
                    case 1192463810:
                        i = i;
                        i5 = i4 * i4;
                        i6 = s * s;
                        if (C3577.f13150 >= 0) {
                            iM11306 = (ThreadFactoryC3888.m11306("֫ۜ") + i13) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                            i2 = ((iM11306 ^ i12) * (-915)) ^ 1784042945;
                            i3 = -404907327;
                        } else {
                            iM11306 = (i12 - ThreadFactoryC3888.m11306("ۘ֡")) * (-87);
                            i2 = ((iM11306 ^ i13) * (-26547)) ^ 1100885325;
                            i3 = 676305302;
                        }
                        int i115 = i;
                        i15 = iM11306 ^ i3;
                        i14 = i2;
                        i11 = i115;
                        break;
                    case -1355682908:
                    case -518029175:
                        i = i;
                        sArr3 = f77392;
                        if (C2788.m8472() != 0) {
                            iM11306 = (ThreadFactoryC3888.m11306("ۢܳ") ^ i13) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                            i2 = ((iM11306 ^ i12) * (-18281)) ^ (-295427299);
                            i3 = 1971176256;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("ܿܽ") ^ i12;
                            i2 = ((iM11306 ^ i13) * (-7239)) ^ 136202096;
                            i3 = -1086759611;
                        }
                        int i116 = i;
                        i15 = iM11306 ^ i3;
                        i14 = i2;
                        i11 = i116;
                        break;
                    case -1286437737:
                    case 293146513:
                        i = i;
                        sArr2 = f77392;
                        i10 = 15;
                        if (RunnableC1895.f7152) {
                            iM11306 = ThreadFactoryC3888.m11306("ܽ֡") ^ i12;
                            i2 = ((iM11306 ^ i13) * 1053) ^ 1064067105;
                            i3 = -1852541637;
                        } else {
                            iM11306 = (ThreadFactoryC3888.m11306("֫ۜ") + i13) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                            i2 = ((iM11306 ^ i12) * (-915)) ^ 1784042945;
                            i3 = -404907327;
                        }
                        int i117 = i;
                        i15 = iM11306 ^ i3;
                        i14 = i2;
                        i11 = i117;
                        break;
                    case -1047355109:
                    case 515233945:
                        i = i;
                        C3286.m9798();
                        if (C1189.m4368() > 0) {
                            iM11306 = (ThreadFactoryC3888.m11306("ۢܳ") ^ i13) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                            i2 = ((iM11306 ^ i12) * (-18281)) ^ (-295427299);
                            i3 = 1971176256;
                        } else {
                            iM11306 = (ThreadFactoryC3888.m11306("֫ۜ") + i13) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                            i2 = ((iM11306 ^ i12) * (-915)) ^ 1784042945;
                            i3 = -404907327;
                        }
                        int i118 = i;
                        i15 = iM11306 ^ i3;
                        i14 = i2;
                        i11 = i118;
                        break;
                    case -973676110:
                    case 918023743:
                        if (C0962.m3746() < 0) {
                            i = i;
                        }
                        iM11306 = (ThreadFactoryC3888.m11306("᩻ۚ") + i12) * (-111);
                        i = i;
                        i2 = ((iM11306 ^ i13) * (-10867)) ^ 1988270456;
                        i3 = 1419428240;
                        int i119 = i;
                        i15 = iM11306 ^ i3;
                        i14 = i2;
                        i11 = i119;
                        break;
                    case -943495714:
                    case 1852404208:
                        C1419.m4977(activityC23892, intent.putExtra(str, true));
                        break;
                    case -666443535:
                    case 2137960924:
                        i = i;
                        c = 0;
                        if (C1398.f5802 <= 0) {
                            iM11306 = (ThreadFactoryC3888.m11306("ۢܳ") ^ i13) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                            i2 = ((iM11306 ^ i12) * (-18281)) ^ (-295427299);
                            i3 = 1971176256;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("ۙ᩷") ^ i13;
                            i2 = ((iM11306 ^ i12) * (-17985)) ^ (-416011514);
                            i3 = -802880808;
                        }
                        int i1110 = i;
                        i15 = iM11306 ^ i3;
                        i14 = i2;
                        i11 = i1110;
                        break;
                    case -210608414:
                    case 883229061:
                        i = i;
                        C0629.m2907();
                        iM11306 = (ThreadFactoryC3888.m11306("ۢܳ") ^ i13) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i2 = ((iM11306 ^ i12) * (-18281)) ^ (-295427299);
                        i3 = 1971176256;
                        int i1111 = i;
                        i15 = iM11306 ^ i3;
                        i14 = i2;
                        i11 = i1111;
                        break;
                    case -33545858:
                    case 141772028:
                        i8 = 35576;
                        iM11306 = (ThreadFactoryC3888.m11306("ۡ۫") + i12) * (-123);
                        i2 = ((iM11306 ^ i13) * 20981) ^ (-1840982128);
                        i3 = 1208576825;
                        int i1112 = i;
                        i15 = iM11306 ^ i3;
                        i14 = i2;
                        i11 = i1112;
                        break;
                    case 551677191:
                    case 768361930:
                        C0526.m2437();
                        break;
                    case 683686490:
                    case 1864437773:
                        i = i;
                        s = sArr3[c];
                        if (C1066.f4915 > 0) {
                            iM11306 = C19806.m45029("ᩳ۫") ^ i12;
                            i2 = ((iM11306 ^ i13) * (-7475)) ^ 992317993;
                            i3 = -2045150950;
                            int i1113 = i;
                            i15 = iM11306 ^ i3;
                            i14 = i2;
                            i11 = i1113;
                        }
                        break;
                    default:
                        if (C1148.f5161 > 0) {
                            i = i;
                            iM11306 = (ThreadFactoryC3888.m11306("֫ۜ") + i13) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                            i2 = ((iM11306 ^ i12) * (-915)) ^ 1784042945;
                            i3 = -404907327;
                        } else {
                            iM11306 = (ThreadFactoryC3888.m11306("᩻ۚ") + i12) * (-111);
                            i = i;
                            i2 = ((iM11306 ^ i13) * (-10867)) ^ 1988270456;
                            i3 = 1419428240;
                        }
                        int i1114 = i;
                        i15 = iM11306 ^ i3;
                        i14 = i2;
                        i11 = i1114;
                        break;
                }
                return;
            }
            int iM11307 = (ThreadFactoryC3888.m11306("ܿ֫") + i12) * 49;
            i11 = i;
            i15 = iM11307 ^ 638704562;
            i14 = ((iM11307 ^ i13) * 27567) ^ (-938859128);
        }
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0251 A[PHI: r5 r16 r21
      0x0251: PHI (r5v2 short) = (r5v1 short), (r5v1 short), (r5v1 short), (r5v5 short) binds: [B:91:0x0251, B:61:0x023a, B:17:0x006f, B:6:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x0251: PHI (r16v4 int) = (r16v2 int), (r16v3 int), (r16v2 int), (r16v2 int) binds: [B:91:0x0251, B:61:0x023a, B:17:0x006f, B:6:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x0251: PHI (r21v5 int) = (r21v3 int), (r21v4 int), (r21v3 int), (r21v3 int) binds: [B:91:0x0251, B:61:0x023a, B:17:0x006f, B:6:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m52659(ActivityC23892 activityC23892) {
        int iM45029;
        int i;
        int iM11306;
        int i2;
        int i3;
        ActivityC23892 activityC23893 = activityC23892;
        Intent type = null;
        Intent intentM5574 = null;
        String strM9788 = null;
        short s = 0;
        short s2 = 0;
        int i4 = 0;
        short[] sArr = null;
        int i5 = 0;
        short[] sArr2 = null;
        int i6 = 0;
        int i7 = 0;
        int i8 = -1992655880;
        int i9 = C1025.f4800;
        int i10 = MenuItemOnMenuItemClickListenerC3244.f12064;
        int iM450210 = C19806.m45029("۫᩻") ^ i9;
        int i11 = ((iM450210 ^ i10) * 13809) ^ (-1031234467);
        int i12 = iM450210 ^ 456406463;
        short[] sArr3 = null;
        Intent intent = null;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            i8 = i12 ^ (i11 & (((i8 ^ i10) * (-25327)) >> 31));
            switch (i8) {
                case -2112035619:
                case 1206849464:
                    C0797.m3359();
                    if (!C1668.m5583()) {
                        int iM11307 = ThreadFactoryC3888.m11306("ۗ֫") ^ i10;
                        i12 = iM11307 ^ (-415628837);
                        i11 = ((iM11307 ^ i9) * (-7435)) ^ (-1293605600);
                        intent = null;
                    } else {
                        int iM450211 = C19806.m45029("ܽ֨") ^ i9;
                        i11 = ((iM450211 ^ i10) * 1125) ^ (-266430775);
                        i12 = iM450211 ^ 1000975181;
                        intent = null;
                        activityC23893 = activityC23892;
                    }
                    break;
                case -2070509821:
                case 1033903324:
                    i4 = 33943;
                    iM45029 = (C19806.m45029("ۤ۟") + i10) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                    i11 = ((iM45029 ^ i9) * 31535) ^ 1713837892;
                    i = -14705580;
                    i12 = iM45029 ^ i;
                    activityC23893 = activityC23892;
                    break;
                case -2025398037:
                case 1882670308:
                    C0797.m3359();
                    break;
                case -1768279703:
                case -1265853243:
                    strM9788 = C3286.m9788(sArr3, 278, 3, i4);
                    if (C2124.f7782 > 0) {
                        iM11306 = C19806.m45029("᩶۠") ^ i10;
                        i2 = ((iM11306 ^ i9) * 15779) ^ (-1587222705);
                        i3 = -556227476;
                        i12 = iM11306 ^ i3;
                        i11 = i2;
                    } else {
                        int iM11308 = ThreadFactoryC3888.m11306("ۗ֫") ^ i10;
                        i12 = iM11308 ^ (-415628837);
                        i11 = ((iM11308 ^ i9) * (-7435)) ^ (-1293605600);
                        intent = null;
                    }
                    break;
                case -1766808316:
                case -278146647:
                    int i16 = i13 + i14;
                    i15 = i16 + i16;
                    s2 = 2465;
                    if (C2704.f10408) {
                        iM45029 = (C19806.m45029("ۢ᩷") + i9) * 49;
                        i11 = ((iM45029 ^ i10) * (-22451)) ^ (-865038340);
                        i = 274710510;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֡᩺") + i9) * 7;
                        i11 = ((iM45029 ^ i10) * 11589) ^ (-160336465);
                        i = 1650561745;
                    }
                    i12 = iM45029 ^ i;
                    activityC23893 = activityC23892;
                    break;
                case -1622373007:
                case 794337274:
                    short[] sArr4 = f77392;
                    if (!C1668.m5583()) {
                        int iM11309 = ThreadFactoryC3888.m11306("ۗ֫") ^ i10;
                        i12 = iM11309 ^ (-415628837);
                        i11 = ((iM11309 ^ i9) * (-7435)) ^ (-1293605600);
                        intent = null;
                    } else {
                        String strM4040 = C1066.m4040(sArr4, IndicatorViewController.DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION, 26, i4);
                        if (C0216.f1393 != 0) {
                            int iM450212 = C19806.m45029("ܽ֨") ^ i9;
                            i11 = ((iM450212 ^ i10) * 1125) ^ (-266430775);
                            i12 = iM450212 ^ 1000975181;
                            intent = null;
                        } else {
                            intent = new Intent(strM4040);
                            sArr = f77392;
                            i5 = 243;
                            if (C1419.f5860 >= 0) {
                                iM45029 = ThreadFactoryC3888.m11306("ܺ᩹") ^ i10;
                                i11 = ((iM45029 ^ i9) * 23811) ^ (-1608960144);
                                i = -420618128;
                            } else {
                                iM45029 = (C19806.m45029("۫֡") ^ i9) * (-13);
                                i11 = ((iM45029 ^ i10) * (-28419)) ^ (-945455773);
                                i = 29499814;
                            }
                            i12 = iM45029 ^ i;
                        }
                        activityC23893 = activityC23892;
                    }
                    break;
                case -1481758097:
                case 838624549:
                    intentM5574 = C1668.m5574(type, C1875.m6105(sArr2, i6, i7, i4), activityC23893.f77401);
                    sArr3 = f77392;
                    if (!RunnableC3388.m10064()) {
                        int iM450213 = C19806.m45029("ܽ֨") ^ i9;
                        i11 = ((iM450213 ^ i10) * 1125) ^ (-266430775);
                        i12 = iM450213 ^ 1000975181;
                        intent = null;
                        activityC23893 = activityC23892;
                    } else {
                        iM11306 = C19806.m45029("۫ܿ") ^ i9;
                        i2 = ((iM11306 ^ i10) * 13405) ^ (-1805636688);
                        i3 = 1177229330;
                        i12 = iM11306 ^ i3;
                        i11 = i2;
                    }
                    break;
                case -1168542375:
                case 1501330137:
                    i6 = 253;
                    i7 = 25;
                    if (!C7105.m18985()) {
                        iM11306 = (i10 - C19806.m45029("ᩴۨ")) * (-123);
                        i2 = ((iM11306 ^ i9) * (-8383)) ^ 1932722122;
                        i3 = 35835424;
                        i12 = iM11306 ^ i3;
                        i11 = i2;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܺ᩹") ^ i10;
                        i11 = ((iM45029 ^ i9) * 23811) ^ (-1608960144);
                        i = -420618128;
                        i12 = iM45029 ^ i;
                        activityC23893 = activityC23892;
                    }
                    break;
                case -1128688865:
                case -350701175:
                    C2642.m8171();
                    if (RunnableC0195.f1321 < 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("֡᩺") + i9) * 7;
                        i11 = ((iM45029 ^ i10) * 11589) ^ (-160336465);
                        i = 1650561745;
                        i12 = iM45029 ^ i;
                        activityC23893 = activityC23892;
                    } else {
                        int iM113010 = ThreadFactoryC3888.m11306("ۗ֫") ^ i10;
                        i12 = iM113010 ^ (-415628837);
                        i11 = ((iM113010 ^ i9) * (-7435)) ^ (-1293605600);
                        intent = null;
                    }
                    break;
                case -1028091870:
                case 1724042589:
                    type = intent.setType(C0050.m940(sArr, i5, 10, i4));
                    sArr2 = f77392;
                    if (RunnableC1606.f6488 < 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩻᩷") ^ i10;
                        i2 = ((iM11306 ^ i9) * 21583) ^ (-309558628);
                        i3 = -126017486;
                        i12 = iM11306 ^ i3;
                        i11 = i2;
                    } else {
                        int iM450214 = C19806.m45029("ܽ֨") ^ i9;
                        i11 = ((iM450214 ^ i10) * 1125) ^ (-266430775);
                        i12 = iM450214 ^ 1000975181;
                        intent = null;
                        activityC23893 = activityC23892;
                    }
                    break;
                case -696081751:
                case 1504134349:
                    RunnableC1564.m5345();
                    if (!C2704.f10408) {
                        iM45029 = (C19806.m45029("ܽ֫") ^ i9) * (-37);
                        i11 = ((iM45029 ^ i10) * (-9643)) ^ 728733715;
                        i = -1503719681;
                        i12 = iM45029 ^ i;
                        activityC23893 = activityC23892;
                    } else {
                        int iM113011 = ThreadFactoryC3888.m11306("ۗ֫") ^ i10;
                        i12 = iM113011 ^ (-415628837);
                        i11 = ((iM113011 ^ i9) * (-7435)) ^ (-1293605600);
                        intent = null;
                    }
                    break;
                case -496862070:
                case 910812673:
                    int i17 = s + s2;
                    if (i15 - (i17 * i17) < 0) {
                        iM45029 = (C19806.m45029("᩸֨") ^ i9) * (-59);
                        i11 = ((iM45029 ^ i10) * (-7757)) ^ (-2083237328);
                        i = -85370902;
                    } else {
                        iM45029 = C19806.m45029("ܳۢ") ^ i10;
                        i11 = ((iM45029 ^ i9) * 16369) ^ (-1588147240);
                        i = 630486203;
                    }
                    i12 = iM45029 ^ i;
                    activityC23893 = activityC23892;
                    break;
                case -219859445:
                case 1305364669:
                    i13 = s * s;
                    i14 = 6076225;
                    if (C1148.f5161 <= 0) {
                        iM45029 = (C19806.m45029("ܽ֫") ^ i9) * (-37);
                        i11 = ((iM45029 ^ i10) * (-9643)) ^ 728733715;
                        i = -1503719681;
                    } else {
                        iM45029 = C19806.m45029("ᩳۜ") ^ i10;
                        i11 = ((iM45029 ^ i9) * 15817) ^ 300867156;
                        i = 1315634903;
                    }
                    i12 = iM45029 ^ i;
                    activityC23893 = activityC23892;
                    break;
                case 472063185:
                case 1917872389:
                    i4 = 61274;
                    iM45029 = (C19806.m45029("ۤ۟") + i10) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                    i11 = ((iM45029 ^ i9) * 31535) ^ 1713837892;
                    i = -14705580;
                    i12 = iM45029 ^ i;
                    activityC23893 = activityC23892;
                    break;
                case 989895620:
                case 1178127832:
                    RunnableC3388.m10064();
                    C0526.m2437();
                    iM45029 = (C19806.m45029("ܽ֫") ^ i9) * (-37);
                    i11 = ((iM45029 ^ i10) * (-9643)) ^ 728733715;
                    i = -1503719681;
                    i12 = iM45029 ^ i;
                    activityC23893 = activityC23892;
                    break;
                case 1495130504:
                case 2144963313:
                    C3286.m9800(activityC23893, Intent.createChooser(intentM5574, C2124.m6690(activityC23893, ThreadFactoryC3888.m11306(strM9788) ^ 2097805781)));
                    break;
                default:
                    s = f77392[216];
                    if (C1066.m4023() <= 0) {
                        iM45029 = (C19806.m45029("ܽ֫") ^ i9) * (-37);
                        i11 = ((iM45029 ^ i10) * (-9643)) ^ 728733715;
                        i = -1503719681;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩻ۘ") ^ i9;
                        i11 = ((iM45029 ^ i10) * (-32429)) ^ (-1595650967);
                        i = 576190841;
                    }
                    i12 = iM45029 ^ i;
                    activityC23893 = activityC23892;
                    break;
            }
            return;
        }
    }

    public ActivityC23892() {
        String str = null;
        int i = 456846558;
        int i2 = C2871.f10837;
        int i3 = C1875.f7103;
        int iM11306 = ThreadFactoryC3888.m11306("᩻᩹") ^ i2;
        int i4 = ((iM11306 ^ i3) * 13515) ^ (-1301217648);
        int i5 = -300092393;
        while (true) {
            i = ((((i ^ i3) * (-9797)) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -1951334825:
                case 211729538:
                    C3743.m10966();
                    if (C3577.f13150 < 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۖۢ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 1509) ^ 725532430;
                        i5 = -623440416;
                    } else {
                        iM11306 = (C19806.m45029("۫ۛ") + i3) * 37;
                        i4 = ((iM11306 ^ i2) * (-3557)) ^ (-135609459);
                        i5 = 1459782292;
                    }
                    break;
                case -1664570795:
                case -1593061022:
                    if (C0216.m1591() <= 0) {
                        iM11306 = C19806.m45029("᩻ۚ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-7695)) ^ (-1645782551);
                        i5 = -71344652;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("֡ܶ")) * 25;
                        i4 = ((iM11306 ^ i2) * 21451) ^ (-1476000602);
                        i5 = 691867676;
                    }
                    break;
                case -1456122363:
                case 1927535239:
                    C19806.m45024();
                    iM11306 = C19806.m45029("᩻ۚ") ^ i2;
                    i4 = ((iM11306 ^ i3) * (-7695)) ^ (-1645782551);
                    i5 = -71344652;
                    break;
                case -1443124148:
                case -553498840:
                    this.f77395 = str;
                    if (C0050.f912 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܰ۠") ^ i3) * (-95);
                        i4 = ((iM11306 ^ i2) * (-4959)) ^ 1861792846;
                        i5 = -997775150;
                    } else {
                        iM11306 = C19806.m45029("ܳ֨") ^ i3;
                        i4 = ((iM11306 ^ i2) * 19519) ^ (-1781933519);
                        i5 = -111035230;
                    }
                    break;
                case -1376442334:
                case -1112696894:
                    if (RunnableC1895.m6170() != 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۖۢ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 1509) ^ 725532430;
                        i5 = -623440416;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("۟ۛ")) * 49;
                        i4 = ((iM11306 ^ i3) * 16845) ^ 1170847995;
                        i5 = -930096682;
                    }
                    break;
                case -968956354:
                case -561758940:
                    if (C1377.f5749) {
                        iM11306 = C19806.m45029("ۨۜ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-32033)) ^ (-1981808546);
                        i5 = -43566063;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۖۢ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 1509) ^ 725532430;
                        i5 = -623440416;
                    }
                    break;
                case -146362778:
                case 786210468:
                    if (C1398.f5802 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۖۢ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 1509) ^ 725532430;
                        i5 = -623440416;
                    } else {
                        iM11306 = C19806.m45029("ܿۡ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 15631) ^ 1267868090;
                        i5 = 1245324621;
                    }
                    break;
                case 46568636:
                case 1335358057:
                    if (C0526.m2437() >= 0) {
                        iM11306 = C19806.m45029("᩻ۚ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-7695)) ^ (-1645782551);
                        i5 = -71344652;
                    } else {
                        iM11306 = (i3 - C19806.m45029("ܳ᩵")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM11306 ^ i2) * 18147) ^ 204794676;
                        i5 = 706922886;
                    }
                    break;
                case 158148494:
                case 837207169:
                    C3660.m10791();
                    if (C2477.f9839 > 0) {
                        iM11306 = (C19806.m45029("۫ۛ") + i3) * 37;
                        i4 = ((iM11306 ^ i2) * (-3557)) ^ (-135609459);
                        i5 = 1459782292;
                    } else {
                        iM11306 = C19806.m45029("᩻ۚ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-7695)) ^ (-1645782551);
                        i5 = -71344652;
                    }
                    break;
                case 307252186:
                case 560305895:
                    this.f77401 = str;
                    this.f77396 = -1;
                    return;
                case 756832124:
                case 1553491717:
                    if (C1066.f4915 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܰ۠") ^ i3) * (-95);
                        i4 = ((iM11306 ^ i2) * (-4959)) ^ 1861792846;
                        i5 = -997775150;
                    } else {
                        iM11306 = (C19806.m45029("ۖ֫") + i2) * (-15);
                        i4 = ((iM11306 ^ i3) * (-15317)) ^ 1694944045;
                        i5 = 298989452;
                    }
                    break;
                case 778772880:
                case 1229747399:
                    C1377.m4833();
                    C0216.m1591();
                    throw new RuntimeException();
                case 966640624:
                case 2096268271:
                    if (C3722.f13525 <= 0) {
                        iM11306 = (C19806.m45029("ۗ᩶") + i2) * 57;
                        i4 = ((iM11306 ^ i3) * (-4685)) ^ (-1804444689);
                        i5 = 1545192740;
                    } else {
                        iM11306 = C19806.m45029("᩻ۚ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-7695)) ^ (-1645782551);
                        i5 = -71344652;
                    }
                    break;
                case 1129647008:
                case 1768573488:
                    if (ThreadFactoryC3888.m11300() <= 0) {
                        iM11306 = (C19806.m45029("۫ۛ") + i3) * 37;
                        i4 = ((iM11306 ^ i2) * (-3557)) ^ (-135609459);
                        i5 = 1459782292;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ܿۛ")) * 73;
                        i4 = ((iM11306 ^ i3) * 10377) ^ 590357317;
                        i5 = -1413058638;
                    }
                    break;
                case 1268342240:
                case 1559210437:
                    this.f77399 = C0671.m3006();
                    if (C2477.f9839 <= 0) {
                        iM11306 = (C19806.m45029("ۗ᩶") + i2) * 57;
                        i4 = ((iM11306 ^ i3) * (-4685)) ^ (-1804444689);
                        i5 = 1545192740;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܿ۬") ^ i3) * 91;
                        i4 = ((iM11306 ^ i2) * 6147) ^ 245162068;
                        i5 = -644559680;
                    }
                    break;
                default:
                    str = "";
                    if (C1025.f4800 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۖۢ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 1509) ^ 725532430;
                        i5 = -623440416;
                    } else {
                        iM11306 = C19806.m45029("ۙۜ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 20883) ^ (-1766639038);
                        i5 = 1844612743;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:93:0x03c9 A[PHI: r1 r5 r17 r18
      0x03c9: PHI (r1v29 short) = (r1v2 short), (r1v3 short), (r1v30 short) binds: [B:92:0x03c7, B:88:0x03a5, B:14:0x008c] A[DONT_GENERATE, DONT_INLINE]
      0x03c9: PHI (r5v57 java.lang.String) = (r5v33 java.lang.String), (r5v34 java.lang.String), (r5v58 java.lang.String) binds: [B:92:0x03c7, B:88:0x03a5, B:14:0x008c] A[DONT_GENERATE, DONT_INLINE]
      0x03c9: PHI (r17v7 short[]) = (r17v3 short[]), (r17v2 short[]), (r17v2 short[]) binds: [B:92:0x03c7, B:88:0x03a5, B:14:0x008c] A[DONT_GENERATE, DONT_INLINE]
      0x03c9: PHI (r18v7 char) = (r18v2 char), (r18v3 char), (r18v2 char) binds: [B:92:0x03c7, B:88:0x03a5, B:14:0x008c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.ActivityC1086, l.ActivityC16858, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        int iM11306;
        int i;
        int i2;
        int scrollY;
        short s;
        String str;
        int iM45029;
        int i3;
        int iM11307;
        int i4;
        int iM11308;
        int i5;
        int i6;
        int i7;
        int iM11309;
        int i8;
        int i9;
        this = this;
        Bundle bundle2 = bundle;
        int i10 = C1977.f7413;
        int i11 = C1398.f5802;
        int iM113010 = (i10 - ThreadFactoryC3888.m11306("ۛ۬")) * (-105);
        int i12 = ((iM113010 ^ i11) * (-8019)) ^ (-1045212386);
        String strM5577 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        int i13 = iM113010 ^ (-859664288);
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int iM113011 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        ArrayList<String> arrayList = null;
        int i20 = 0;
        char c = 0;
        short s2 = 0;
        short s3 = 0;
        String strM5481 = null;
        int i21 = -498916233;
        while (true) {
            i21 = i13 ^ (i12 & (((i21 ^ i11) * (-19861)) >> 31));
            switch (i21) {
                case -2131787962:
                case -661991321:
                    strM5577 = strM5577;
                    strM5481 = RunnableC1606.m5481(f77392, 426, 8, i19);
                    if (C0216.f1393 == 0) {
                        iM11307 = (ThreadFactoryC3888.m11306("ۘۖ") + i10) * (-27);
                        i12 = 1151922177 ^ ((iM11307 ^ i11) * (-29073));
                        i4 = -614106117;
                        i13 = iM11307 ^ i4;
                        bundle2 = bundle;
                        strM5577 = strM5577;
                    } else {
                        strM5577 = strM5577;
                        int iM113012 = ThreadFactoryC3888.m11306("᩸֡") ^ i10;
                        i12 = (-737309227) ^ ((iM113012 ^ i11) * (-11187));
                        i13 = iM113012 ^ 200981545;
                        bundle2 = bundle;
                    }
                    break;
                case -2110508623:
                case -867228695:
                    String str2 = strM5481;
                    strM5577 = strM5577;
                    C2704.m8238(bundle2, str2);
                    super.onSaveInstanceState(bundle);
                    sArr2 = f77392;
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 > 0) {
                        iM11308 = (ThreadFactoryC3888.m11306("ܿ᩵") + i11) * (-89);
                        strM5481 = str2;
                        i5 = ((iM11308 ^ i10) * (-9025)) ^ 1471184519;
                        i6 = -990208093;
                        i13 = iM11308 ^ i6;
                        i12 = i5;
                        strM5577 = strM5577;
                        this = this;
                    } else {
                        strM5481 = str2;
                        iM11307 = (C19806.m45029("ۢ۬") + i11) * (-25);
                        i12 = (-1136910036) ^ ((iM11307 ^ i10) * 18901);
                        i4 = -387083922;
                        i13 = iM11307 ^ i4;
                        bundle2 = bundle;
                        strM5577 = strM5577;
                    }
                    break;
                case -2018814692:
                case 1126412805:
                    s = s2;
                    str = strM5577;
                    c = 425;
                    if (C3286.f12186) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۨۖ") ^ i10) * (-95);
                        i12 = ((iM45029 ^ i11) * 14369) ^ 2093294421;
                        i3 = -125738243;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۧܿ") ^ i10) * (-123);
                        i12 = ((iM45029 ^ i11) * 26465) ^ (-1248118214);
                        i3 = 216929728;
                    }
                    i13 = iM45029 ^ i3;
                    s2 = s;
                    strM5577 = str;
                    bundle2 = bundle;
                    break;
                case -1969803943:
                case -1873958071:
                    if (C2477.f9839 > 0) {
                        s = s2;
                        str = strM5577;
                        iM45029 = (ThreadFactoryC3888.m11306("ۨۖ") ^ i10) * (-95);
                        i12 = ((iM45029 ^ i11) * 14369) ^ 2093294421;
                        i3 = -125738243;
                        i13 = iM45029 ^ i3;
                        s2 = s;
                        strM5577 = str;
                    } else {
                        int iM113013 = ThreadFactoryC3888.m11306("᩸֡") ^ i10;
                        i12 = (-737309227) ^ ((iM113013 ^ i11) * (-11187));
                        i13 = iM113013 ^ 200981545;
                    }
                    bundle2 = bundle;
                    break;
                case -1894062539:
                case 795587340:
                    bundle2.putStringArrayList(C3535.m10423(sArr4, i17, 13, i19), arrayList);
                    strM5577 = strM5577;
                    int iM450210 = (C19806.m45029("ᩴ۟") ^ i10) * 23;
                    i12 = ((iM450210 ^ i11) * (-10753)) ^ (-1110243265);
                    i13 = iM450210 ^ 30556416;
                    strM5577 = strM5577;
                    break;
                case -1865484715:
                case 14236515:
                    s = s2;
                    str = strM5577;
                    sArr = f77392;
                    if (C3535.f13026 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۨۖ") ^ i10) * (-95);
                        i12 = ((iM45029 ^ i11) * 14369) ^ 2093294421;
                        i3 = -125738243;
                    } else {
                        iM45029 = C19806.m45029("ۚۡ") ^ i11;
                        i12 = ((iM45029 ^ i10) * 20787) ^ (-1774881725);
                        i3 = -1396786266;
                    }
                    i13 = iM45029 ^ i3;
                    s2 = s;
                    strM5577 = str;
                    bundle2 = bundle;
                    break;
                case -1834561801:
                case -1723444874:
                    bundle2.putInt(C1419.m4969(f77392, 474, 7, i19), i16);
                    i15 = i15;
                    iM11306 = ThreadFactoryC3888.m11306("ۤ᩷") ^ i10;
                    i = ((iM11306 ^ i11) * (-2203)) ^ (-250547094);
                    i2 = -858790665;
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case -1757363487:
                case 316888970:
                    i7 = i15;
                    sArr5 = f77392;
                    i18 = 471;
                    i14 = 3;
                    if (C1419.f5860 < 0) {
                        iM11309 = (i10 - ThreadFactoryC3888.m11306("ۚᩴ")) * 11;
                        i8 = ((iM11309 ^ i11) * 17689) ^ (-164300662);
                        i9 = 1769955773;
                        int i22 = i7;
                        i13 = iM11309 ^ i9;
                        i12 = i8;
                        i15 = i22;
                    } else {
                        i15 = i7;
                        strM5577 = strM5577;
                        iM11307 = (C19806.m45029("ۢ۬") + i11) * (-25);
                        i12 = (-1136910036) ^ ((iM11307 ^ i10) * 18901);
                        i4 = -387083922;
                        i13 = iM11307 ^ i4;
                        bundle2 = bundle;
                        strM5577 = strM5577;
                    }
                    break;
                case -1684541332:
                case 50810855:
                    strM5577 = strM5577;
                    s2 = sArr[c];
                    s3 = 11628;
                    if (C2788.f10625 >= 0) {
                        iM11307 = (C19806.m45029("ۢ۬") + i11) * (-25);
                        i12 = (-1136910036) ^ ((iM11307 ^ i10) * 18901);
                        i4 = -387083922;
                    } else {
                        iM11307 = (ThreadFactoryC3888.m11306("᩷ۛ") ^ i11) * (-95);
                        i12 = (-1384447664) ^ ((iM11307 ^ i10) * (-26739));
                        i4 = -55622722;
                    }
                    i13 = iM11307 ^ i4;
                    bundle2 = bundle;
                    strM5577 = strM5577;
                    break;
                case -1630893728:
                case 1603099352:
                    return;
                case -1598625995:
                case 1754127191:
                    C0817.m3399();
                    return;
                case -1536576885:
                case 1259152273:
                    strM5577 = strM5577;
                    C1460.m5053(bundle2, strM5577, this.f77398);
                    if (this.f77400 == null) {
                        int iM450211 = (C19806.m45029("ᩴ۟") ^ i10) * 23;
                        i12 = ((iM450211 ^ i11) * (-10753)) ^ (-1110243265);
                        i13 = iM450211 ^ 30556416;
                        strM5577 = strM5577;
                    } else {
                        iM11308 = (i11 - ThreadFactoryC3888.m11306("ۛ֫")) * 85;
                        i5 = ((iM11308 ^ i10) * (-6943)) ^ (-314438310);
                        i6 = -45200900;
                        i13 = iM11308 ^ i6;
                        i12 = i5;
                        strM5577 = strM5577;
                        this = this;
                    }
                    break;
                case -1522264306:
                case 1849555811:
                    scrollY = this.f77396;
                    if (scrollY >= 0) {
                        i16 = scrollY;
                        iM11306 = ThreadFactoryC3888.m11306("֡֡") ^ i10;
                        i = ((iM11306 ^ i11) * (-6049)) ^ 1639101062;
                        i2 = -884770606;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩸۠") ^ i11) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM11306 ^ i10) * 24161) ^ 2077154696;
                        i2 = 282808269;
                    }
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case -1454159970:
                case -1045270586:
                    short[] sArr6 = sArr2;
                    strM5577 = C1668.m5577(sArr6, 434, 15, i19);
                    if (C1419.f5860 >= 0) {
                        sArr2 = sArr6;
                        int iM113014 = ThreadFactoryC3888.m11306("᩸֡") ^ i10;
                        i12 = (-737309227) ^ ((iM113014 ^ i11) * (-11187));
                        i13 = iM113014 ^ 200981545;
                        bundle2 = bundle;
                    } else {
                        int iM450212 = (C19806.m45029("ۚ᩹") ^ i11) * 13;
                        i12 = ((iM450212 ^ i10) * 12293) ^ 1385743148;
                        i13 = iM450212 ^ (-1804234191);
                        this = this;
                        sArr2 = sArr6;
                    }
                    break;
                case -1332989203:
                case 1287086914:
                    C4531 c4531 = this.f77400;
                    if (c4531 != null) {
                        arrayList = new ArrayList<>(c4531.m12661());
                        sArr4 = f77392;
                        i17 = 458;
                        if (C1377.f5749) {
                            iM11306 = (i10 - ThreadFactoryC3888.m11306("֫ᩴ")) * 77;
                            i = ((iM11306 ^ i11) * 4085) ^ 1180809523;
                            i2 = 610890858;
                            i13 = iM11306 ^ i2;
                            i12 = i;
                        } else {
                            int iM113015 = ThreadFactoryC3888.m11306("᩸֡") ^ i10;
                            i12 = (-737309227) ^ ((iM113015 ^ i11) * (-11187));
                            i13 = iM113015 ^ 200981545;
                            bundle2 = bundle;
                        }
                    } else {
                        int iM450213 = (C19806.m45029("ᩳܿ") ^ i11) * 115;
                        i13 = iM450213 ^ (-1378381927);
                        i12 = ((iM450213 ^ i10) * 15099) ^ (-355626037);
                        arrayList = null;
                    }
                    break;
                case -1130903944:
                case 1371728227:
                    C0050.m946();
                    C2642.m8171();
                    s = s2;
                    str = strM5577;
                    iM45029 = (ThreadFactoryC3888.m11306("ۨۖ") ^ i10) * (-95);
                    i12 = ((iM45029 ^ i11) * 14369) ^ 2093294421;
                    i3 = -125738243;
                    i13 = iM45029 ^ i3;
                    s2 = s;
                    strM5577 = str;
                    bundle2 = bundle;
                    break;
                case -862063910:
                case 1707704820:
                    i19 = 55494;
                    iM11307 = (i10 - C19806.m45029("ᩴۛ")) * q.h;
                    i12 = (-909817611) ^ ((iM11307 ^ i11) * (-20319));
                    i4 = -1950000657;
                    i13 = iM11307 ^ i4;
                    bundle2 = bundle;
                    strM5577 = strM5577;
                    break;
                case -280174349:
                case 1308883970:
                    i7 = i15;
                    iM113011 = ThreadFactoryC3888.m11306(ThreadFactoryC3888.m11312(sArr5, i18, i14, i19));
                    if (C1460.f5948 < 0) {
                        iM11309 = (i11 - C19806.m45029("ܳۖ")) * (-21);
                        i8 = ((iM11309 ^ i10) * 26273) ^ (-1520089770);
                        i9 = 1583671565;
                        int i23 = i7;
                        i13 = iM11309 ^ i9;
                        i12 = i8;
                        i15 = i23;
                    } else {
                        i15 = i7;
                        int iM113016 = ThreadFactoryC3888.m11306("᩸֡") ^ i10;
                        i12 = (-737309227) ^ ((iM113016 ^ i11) * (-11187));
                        i13 = iM113016 ^ 200981545;
                        bundle2 = bundle;
                    }
                    break;
                case -146855814:
                case 1646338892:
                    sArr3 = f77392;
                    i20 = 449;
                    i15 = 9;
                    if (RunnableC3388.f12514 < 0) {
                        iM11306 = (C19806.m45029("ܿ᩹") + i11) * 47;
                        i = ((iM11306 ^ i10) * 14563) ^ (-1578267532);
                        i2 = -1919866981;
                        i13 = iM11306 ^ i2;
                        i12 = i;
                    } else {
                        strM5577 = strM5577;
                        iM11307 = (C19806.m45029("ۢ۬") + i11) * (-25);
                        i12 = (-1136910036) ^ ((iM11307 ^ i10) * 18901);
                        i4 = -387083922;
                        i13 = iM11307 ^ i4;
                        bundle2 = bundle;
                        strM5577 = strM5577;
                    }
                    break;
                case -132452950:
                case 573941375:
                    if (RunnableC1895.f7152) {
                        iM11306 = C19806.m45029("ۖ۠") ^ i11;
                        i = ((iM11306 ^ i10) * (-7833)) ^ 1525634590;
                        i2 = 2060912212;
                    } else {
                        iM11306 = (i11 - ThreadFactoryC3888.m11306("۠ۨ")) * (-93);
                        i = ((iM11306 ^ i10) * (-18191)) ^ 1545691611;
                        i2 = -754156378;
                    }
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case -25179417:
                case 1288246030:
                    str = strM5577;
                    s = s2;
                    int i24 = s + 2907;
                    if ((i24 * i24) - (s2 * s3) < 0) {
                        iM45029 = C19806.m45029("ۡۘ") ^ i11;
                        i12 = ((iM45029 ^ i10) * 14957) ^ (-281670152);
                        i3 = -410510544;
                    } else {
                        iM45029 = C19806.m45029("ܶۖ") ^ i10;
                        i12 = ((iM45029 ^ i11) * (-1223)) ^ (-370978482);
                        i3 = 1427470915;
                    }
                    i13 = iM45029 ^ i3;
                    s2 = s;
                    strM5577 = str;
                    bundle2 = bundle;
                    break;
                case 118489511:
                case 1307162232:
                    i19 = 16317;
                    iM11307 = (i10 - C19806.m45029("ᩴۛ")) * q.h;
                    i12 = (-909817611) ^ ((iM11307 ^ i11) * (-20319));
                    i4 = -1950000657;
                    i13 = iM11307 ^ i4;
                    bundle2 = bundle;
                    strM5577 = strM5577;
                    break;
                case 312979777:
                case 1686250658:
                    C1398.m4902(C1977.m6363(sArr3, i20, i15, i19));
                    throw null;
                case 691116403:
                case 987994655:
                    scrollY = ((ScrollView) C2332.m7083(this, 2097568318 ^ iM113011)).getScrollY();
                    i16 = scrollY;
                    iM11306 = ThreadFactoryC3888.m11306("֡֡") ^ i10;
                    i = ((iM11306 ^ i11) * (-6049)) ^ 1639101062;
                    i2 = -884770606;
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case 1598770169:
                case 1787124538:
                    if (this.f77403 != null) {
                        iM11306 = ThreadFactoryC3888.m11306("᩷ۚ") ^ i10;
                        i = ((iM11306 ^ i11) * (-14021)) ^ 2040042547;
                        i2 = 1010523556;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۤ᩷") ^ i10;
                        i = ((iM11306 ^ i11) * (-2203)) ^ (-250547094);
                        i2 = -858790665;
                    }
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                default:
                    if (C3722.f13525 <= 0) {
                        iM11306 = C19806.m45029("ۖ۠") ^ i11;
                        i = ((iM11306 ^ i10) * (-7833)) ^ 1525634590;
                        i2 = 2060912212;
                        i13 = iM11306 ^ i2;
                        i12 = i;
                    } else {
                        s = s2;
                        str = strM5577;
                        iM45029 = (ThreadFactoryC3888.m11306("ۨۖ") ^ i10) * (-95);
                        i12 = ((iM45029 ^ i11) * 14369) ^ 2093294421;
                        i3 = -125738243;
                        i13 = iM45029 ^ i3;
                        s2 = s;
                        strM5577 = str;
                        bundle2 = bundle;
                    }
                    break;
            }
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 54981. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // l.AbstractActivityC12483, l.ActivityC4866, l.ActivityC19126, l.ActivityC1086, l.ActivityC16858, android.app.Activity
    public final void onCreate(android.os.Bundle r62) {
        /*
            Method dump skipped, instruction units count: 5498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ActivityC23892.onCreate(android.os.Bundle):void");
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m52651(ActivityC23892 activityC23892) {
        activityC23892.m52662();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m52661(ActivityC23892 activityC23892) {
        C16737.m39272((CharSequence) activityC23892.f77395);
    }

    @Override // l.AbstractActivityC12483, l.ActivityC10074, l.ActivityC19126, android.app.Activity
    public final void onStart() {
        int i = 972941583;
        int i2 = C2124.f7782;
        int i3 = C7105.f23796;
        int iM45029 = C19806.m45029("ۚ֨") ^ i3;
        int i4 = ((iM45029 ^ i2) * 4015) ^ (-1751327546);
        int i5 = 1494710526;
        while (true) {
            i = ((((i ^ i2) * (-11661)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2128899365:
                case 849411143:
                    if (C3577.f13150 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۘ۟") ^ i3;
                        i4 = ((iM45029 ^ i2) * 499) ^ 1698676626;
                        i5 = 1412132508;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۫᩸") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-9921)) ^ 783301027;
                        i5 = 1464802309;
                    }
                    break;
                case -2128281214:
                case -526416938:
                    if (C19806.f63586) {
                        iM45029 = ThreadFactoryC3888.m11306("ۘ۟") ^ i3;
                        i4 = ((iM45029 ^ i2) * 499) ^ 1698676626;
                        i5 = 1412132508;
                    } else {
                        iM45029 = C19806.m45029("᩹۫") ^ i3;
                        i4 = ((iM45029 ^ i2) * 12933) ^ 612803424;
                        i5 = -621525252;
                    }
                    break;
                case -2068707663:
                case 642598305:
                    C0278.m1783(this);
                    break;
                case -2030568373:
                case 221048733:
                    if (C2642.f10294 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩸ᩳ") + i2) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM45029 ^ i3) * (-4315)) ^ (-817630798);
                        i5 = -333615626;
                    } else {
                        iM45029 = C19806.m45029("ܽۜ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-28377)) ^ 737392969;
                        i5 = -1761287454;
                    }
                    break;
                case -1931428337:
                case 1200240200:
                    C2788.m8472();
                    break;
                case -1821116449:
                case -703622481:
                    super.onStart();
                    if (C0629.f2722 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩸ᩳ") + i2) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM45029 ^ i3) * (-4315)) ^ (-817630798);
                        i5 = -333615626;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳۤ") + i2) * 91;
                        i4 = ((iM45029 ^ i3) * (-25663)) ^ (-226420601);
                        i5 = 92405551;
                    }
                    break;
                case -1808403403:
                case 675247271:
                    if (!C2332.f8260) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩸ᩳ") + i2) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM45029 ^ i3) * (-4315)) ^ (-817630798);
                        i5 = -333615626;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۘ۟") ^ i3;
                        i4 = ((iM45029 ^ i2) * 499) ^ 1698676626;
                        i5 = 1412132508;
                    }
                    break;
                case -1716707719:
                case 1683574468:
                    if (MenuItemOnMenuItemClickListenerC3244.m9707()) {
                        iM45029 = C19806.m45029("ۘ۠") ^ i3;
                        i4 = ((iM45029 ^ i2) * 27527) ^ (-567298735);
                        i5 = -917742893;
                    } else {
                        iM45029 = C19806.m45029("᩷᩶") ^ i2;
                        i4 = ((iM45029 ^ i3) * 30247) ^ (-1062043603);
                        i5 = 1372949877;
                    }
                    break;
                case -1658078777:
                case 1355656979:
                    if (C1461.m5080()) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩸ᩳ") + i2) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM45029 ^ i3) * (-4315)) ^ (-817630798);
                        i5 = -333615626;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ۜ۬")) * (-75);
                        i4 = ((iM45029 ^ i2) * 30403) ^ 368706294;
                        i5 = -1174949386;
                    }
                    break;
                case -1632270970:
                case -1119855470:
                    m52662();
                    break;
                case -1185470589:
                case 2055951795:
                    C2642.m8171();
                    if (ThreadFactoryC3888.f14547 > 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֫᩻") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-1063)) ^ (-1380688538);
                        i5 = 1604597916;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩸ᩳ") + i2) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM45029 ^ i3) * (-4315)) ^ (-817630798);
                        i5 = -333615626;
                    }
                    break;
                case -1139432312:
                case -663413641:
                    if (C1398.f5802 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֫᩻") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-1063)) ^ (-1380688538);
                        i5 = 1604597916;
                    } else {
                        iM45029 = C19806.m45029("ۚܽ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-6421)) ^ (-694237044);
                        i5 = 1223468922;
                    }
                    break;
                case 53007604:
                case 350278289:
                    if (C13465.m32965((Object) this.f77399, (Object) C0671.m3006())) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۙ᩻") + i3) * 119;
                        i4 = ((iM45029 ^ i2) * 22131) ^ 1812746096;
                        i5 = -1470969451;
                    } else {
                        iM45029 = C19806.m45029("᩷᩶") ^ i2;
                        i4 = ((iM45029 ^ i3) * 30247) ^ (-1062043603);
                        i5 = 1372949877;
                    }
                    break;
                case 274699547:
                case 1486963313:
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    if (C1377.f5749) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩸ᩳ") + i2) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM45029 ^ i3) * (-4315)) ^ (-817630798);
                        i5 = -333615626;
                    } else {
                        iM45029 = C19806.m45029("ۨ֡") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-28701)) ^ 629875719;
                        i5 = 1932765461;
                    }
                    break;
                case 278079553:
                case 768473519:
                    if (C0629.m2907()) {
                        iM45029 = (i2 - C19806.m45029("ۙ᩶")) * 33;
                        i4 = ((iM45029 ^ i3) * 28637) ^ 958678586;
                        i5 = 557043583;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۘ۟") ^ i3;
                        i4 = ((iM45029 ^ i2) * 499) ^ 1698676626;
                        i5 = 1412132508;
                    }
                    break;
                case 722233142:
                case 1272860273:
                    if (C0526.m2437() >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֫᩻") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-1063)) ^ (-1380688538);
                        i5 = 1604597916;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩶ܿ") + i3) * 67;
                        i4 = ((iM45029 ^ i2) * 3791) ^ 710359218;
                        i5 = 560987231;
                    }
                    break;
                case 990424994:
                case 1257908772:
                    if (C3660.f13403 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۖܿ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 5053) ^ 2048868339;
                        i5 = 792338259;
                    } else {
                        iM45029 = (C19806.m45029("ܳ᩺") ^ i2) * (-57);
                        i4 = ((iM45029 ^ i3) * 28775) ^ 1488211936;
                        i5 = 976870512;
                    }
                    break;
                case 1064827602:
                case 1809199027:
                    if (C0050.f912 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۖܿ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 5053) ^ 2048868339;
                        i5 = 792338259;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۤۛ") ^ i3) * (-45);
                        i4 = ((iM45029 ^ i2) * (-5417)) ^ 1825555075;
                        i5 = 648671660;
                    }
                    break;
                default:
                    C0629.m2907();
                    iM45029 = (ThreadFactoryC3888.m11306("᩸ᩳ") + i2) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                    i4 = ((iM45029 ^ i3) * (-4315)) ^ (-817630798);
                    i5 = -333615626;
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractActivityC12483, l.ActivityC10074, l.ActivityC19126, android.app.Activity
    public final void onStop() {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        C6018 c6018 = null;
        int i4 = 1126317312;
        int i5 = C0050.f912;
        int i6 = C7105.f23796;
        int iM45029 = (C19806.m45029("ۜ֫") + i5) * (-25);
        int i7 = ((iM45029 ^ i6) * 20171) ^ 1954227078;
        int i8 = -367310998;
        while (true) {
            i4 = ((((i4 ^ i6) * 12943) >> 31) & i7) ^ (iM45029 ^ i8);
            switch (i4) {
                case -1889222081:
                case -1738356659:
                    i3 = i + i2;
                    if (C1937.f7317 >= 0) {
                        iM45029 = C19806.m45029("ۜۢ") ^ i6;
                        i7 = ((iM45029 ^ i5) * 24095) ^ (-274507480);
                        i8 = 1942957527;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۡܿ") ^ i6) * q.h;
                        i7 = ((iM45029 ^ i5) * 14829) ^ (-261537412);
                        i8 = -917484737;
                    }
                    break;
                case -1777474722:
                case -506446792:
                    if (C3535.m10431() <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("۫۫") + i6) * 7;
                        i7 = ((iM45029 ^ i5) * 11627) ^ 1510003917;
                        i8 = -106068642;
                    } else {
                        iM45029 = C19806.m45029("ܶۤ") ^ i6;
                        i7 = ((iM45029 ^ i5) * (-25575)) ^ (-1837394168);
                        i8 = -1506183290;
                    }
                    break;
                case -1509357664:
                case -1179933826:
                    RunnableC0195.m1431();
                    if (C1875.f7103 >= 0) {
                        iM45029 = (C19806.m45029("۬ܶ") ^ i6) * (-17);
                        i7 = ((iM45029 ^ i5) * 27295) ^ 1689587445;
                        i8 = -1530319686;
                    } else {
                        iM45029 = (i5 - ThreadFactoryC3888.m11306("۟ᩳ")) * 123;
                        i7 = ((iM45029 ^ i6) * 11543) ^ (-813940763);
                        i8 = -969686734;
                    }
                    break;
                case -1497404900:
                case 1254790376:
                    if (C0962.f3784) {
                        iM45029 = (C19806.m45029("۬ܶ") ^ i6) * (-17);
                        i7 = ((iM45029 ^ i5) * 27295) ^ 1689587445;
                        i8 = -1530319686;
                    } else {
                        iM45029 = C19806.m45029("ۙۜ") ^ i5;
                        i7 = ((iM45029 ^ i6) * (-15267)) ^ (-1944021731);
                        i8 = 1328717137;
                    }
                    break;
                case -1285951679:
                case -1241354107:
                    C0050.m946();
                    if (C1937.m6279() >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("۫۫") + i6) * 7;
                        i7 = ((iM45029 ^ i5) * 11627) ^ 1510003917;
                        i8 = -106068642;
                    } else {
                        iM45029 = (i5 - ThreadFactoryC3888.m11306("۟ᩳ")) * 123;
                        i7 = ((iM45029 ^ i6) * 11543) ^ (-813940763);
                        i8 = -969686734;
                    }
                    break;
                case -1188034488:
                case 29706043:
                    i2 = 1;
                    if (C0278.m1789() <= 0) {
                        iM45029 = (i5 - ThreadFactoryC3888.m11306("۟ᩳ")) * 123;
                        i7 = ((iM45029 ^ i6) * 11543) ^ (-813940763);
                        i8 = -969686734;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۚܽ") + i6) * (-117);
                        i7 = ((iM45029 ^ i5) * 31341) ^ (-1515392269);
                        i8 = -408782773;
                    }
                    break;
                case -1159365104:
                case 344476233:
                    super.onStop();
                    break;
                case -932785640:
                case 440879026:
                    this.f77397 = i3;
                    z = false;
                    if (C2704.f10408) {
                        iM45029 = C19806.m45029("ۜܶ") ^ i5;
                        i7 = ((iM45029 ^ i6) * 29391) ^ 1857635547;
                        i8 = 1172707411;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۫۫") + i6) * 7;
                        i7 = ((iM45029 ^ i5) * 11627) ^ 1510003917;
                        i8 = -106068642;
                    }
                    break;
                case -658807037:
                case 1014922793:
                    if (C0797.f3386) {
                        iM45029 = (i5 - ThreadFactoryC3888.m11306("۟ᩳ")) * 123;
                        i7 = ((iM45029 ^ i6) * 11543) ^ (-813940763);
                        i8 = -969686734;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۫֫") ^ i6) * (-119);
                        i7 = ((iM45029 ^ i5) * 26351) ^ 255424186;
                        i8 = 177501759;
                    }
                    break;
                case -608159447:
                case 1708843124:
                    i = this.f77397;
                    if (C0050.m946() <= 0) {
                        iM45029 = (i5 - ThreadFactoryC3888.m11306("۟ᩳ")) * 123;
                        i7 = ((iM45029 ^ i6) * 11543) ^ (-813940763);
                        i8 = -969686734;
                    } else {
                        iM45029 = C19806.m45029("ۨܶ") ^ i6;
                        i7 = ((iM45029 ^ i5) * (-11877)) ^ 276317506;
                        i8 = 1826349693;
                    }
                    break;
                case -201660577:
                case 51961745:
                    if (C0050.f912 <= 0) {
                        iM45029 = (i5 - ThreadFactoryC3888.m11306("۟ᩳ")) * 123;
                        i7 = ((iM45029 ^ i6) * 11543) ^ (-813940763);
                        i8 = -969686734;
                    } else {
                        iM45029 = C19806.m45029("ۗ۟") ^ i5;
                        i7 = ((iM45029 ^ i6) * (-8675)) ^ 857908030;
                        i8 = -1802427384;
                    }
                    break;
                case -142029964:
                case 1580671591:
                    CallableC1627.m5507();
                    C2477.m7593();
                    break;
                case 159784284:
                case 731628657:
                    if (C2788.f10625 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("۫۫") + i6) * 7;
                        i7 = ((iM45029 ^ i5) * 11627) ^ 1510003917;
                        i8 = -106068642;
                    } else {
                        iM45029 = C19806.m45029("᩻ܽ") ^ i5;
                        i7 = ((iM45029 ^ i6) * 32147) ^ 675156334;
                        i8 = -97790652;
                    }
                    break;
                case 164387434:
                case 941189243:
                    this.f77402 = z;
                    c6018 = this.f77403;
                    if (c6018 != null) {
                        iM45029 = C19806.m45029("ۗ᩶") ^ i6;
                        i7 = ((iM45029 ^ i5) * (-30519)) ^ (-73898142);
                        i8 = -1774272410;
                    } else {
                        iM45029 = (i5 - C19806.m45029("ܿۨ")) * 49;
                        i7 = ((iM45029 ^ i6) * (-28757)) ^ (-737562786);
                        i8 = -2022479501;
                    }
                    break;
                case 880451189:
                case 1977938185:
                    if (C0216.m1591() <= 0) {
                        iM45029 = (C19806.m45029("۬ܶ") ^ i6) * (-17);
                        i7 = ((iM45029 ^ i5) * 27295) ^ 1689587445;
                        i8 = -1530319686;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۜۚ") ^ i5) * 95;
                        i7 = ((iM45029 ^ i6) * (-3055)) ^ 464386911;
                        i8 = 1114374008;
                    }
                    break;
                case 1549433654:
                case 1960266463:
                    c6018.m16335(z);
                    iM45029 = (i5 - C19806.m45029("ܿۨ")) * 49;
                    i7 = ((iM45029 ^ i6) * (-28757)) ^ (-737562786);
                    i8 = -2022479501;
                    break;
                case 1792848413:
                case 1818084551:
                    if (C1066.f4915 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("۫۫") + i6) * 7;
                        i7 = ((iM45029 ^ i5) * 11627) ^ 1510003917;
                        i8 = -106068642;
                    } else {
                        iM45029 = C19806.m45029("᩸ᩴ") ^ i5;
                        i7 = ((iM45029 ^ i6) * 24637) ^ 1356098060;
                        i8 = 2018724202;
                    }
                    break;
                default:
                    ViewTreeObserverOnPreDrawListenerC3327.m9874();
                    iM45029 = (i5 - ThreadFactoryC3888.m11306("۟ᩳ")) * 123;
                    i7 = ((iM45029 ^ i6) * 11543) ^ (-813940763);
                    i8 = -969686734;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x005b  */
    /* JADX WARN: Code duplicated, block: B:63:0x01ff A[PHI: r9 r10 r13 r14 r15
      0x01ff: PHI (r9v3 int) = (r9v2 int), (r9v1 int), (r9v1 int), (r9v1 int), (r9v1 int), (r9v1 int) binds: [B:62:0x01fd, B:30:0x00b9, B:26:0x0097, B:17:0x0073, B:14:0x0057, B:8:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x01ff: PHI (r10v3 int) = (r10v2 int), (r10v1 int), (r10v1 int), (r10v1 int), (r10v1 int), (r10v1 int) binds: [B:62:0x01fd, B:30:0x00b9, B:26:0x0097, B:17:0x0073, B:14:0x0057, B:8:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x01ff: PHI (r13v3 short[]) = (r13v1 short[]), (r13v2 short[]), (r13v1 short[]), (r13v1 short[]), (r13v1 short[]), (r13v1 short[]) binds: [B:62:0x01fd, B:30:0x00b9, B:26:0x0097, B:17:0x0073, B:14:0x0057, B:8:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x01ff: PHI (r14v3 int) = (r14v1 int), (r14v2 int), (r14v1 int), (r14v1 int), (r14v1 int), (r14v1 int) binds: [B:62:0x01fd, B:30:0x00b9, B:26:0x0097, B:17:0x0073, B:14:0x0057, B:8:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x01ff: PHI (r15v3 int) = (r15v1 int), (r15v1 int), (r15v2 int), (r15v1 int), (r15v1 int), (r15v1 int) binds: [B:62:0x01fd, B:30:0x00b9, B:26:0x0097, B:17:0x0073, B:14:0x0057, B:8:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x0268 A[PHI: r6 r11
      0x0268: PHI (r6v3 char) = (r6v2 char), (r6v1 char), (r6v1 char) binds: [B:70:0x0266, B:58:0x01dd, B:11:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x0268: PHI (r11v3 int) = (r11v1 int), (r11v2 int), (r11v1 int) binds: [B:70:0x0266, B:58:0x01dd, B:11:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x0298 A[PHI: r3 r21
      0x0298: PHI (r3v3 int) = (r3v1 int), (r3v2 int), (r3v1 int), (r3v1 int) binds: [B:74:0x0296, B:39:0x0110, B:19:0x007f, B:8:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x0298: PHI (r21v5 short[]) = (r21v4 short[]), (r21v3 short[]), (r21v3 short[]), (r21v3 short[]) binds: [B:74:0x0296, B:39:0x0110, B:19:0x007f, B:8:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private final void m52662() {
        int iM11306;
        int i;
        int i2;
        boolean z = false;
        int i3 = 0;
        C6018 c6018 = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        short[] sArr = null;
        int i8 = 0;
        int i9 = 0;
        int i10 = -458452403;
        int i11 = C7105.f23796;
        int i12 = C1025.f4800;
        int iM11307 = ThreadFactoryC3888.m11306("ᩴۖ") ^ i12;
        int i13 = ((iM11307 ^ i11) * 19399) ^ (-928716392);
        int i14 = iM11307 ^ (-913925479);
        short[] sArr2 = null;
        int i15 = 0;
        while (true) {
            i10 = i14 ^ (i13 & (((i10 ^ i11) * (-25509)) >> 31));
            switch (i10) {
                case -1965081298:
                case -704123118:
                    i7 = 7552;
                    iM11306 = C19806.m45029("᩵ۘ") ^ i12;
                    i = ((iM11306 ^ i11) * 16377) ^ 623533782;
                    i2 = -1343286032;
                    i14 = iM11306 ^ i2;
                    i13 = i;
                    break;
                case -1961960618:
                case -1570852284:
                    sArr = f77392;
                    i8 = 282;
                    if (CallableC1627.f6528) {
                        iM11306 = (i12 - C19806.m45029("ۖ᩹")) * (-67);
                        i = ((iM11306 ^ i11) * (-20203)) ^ 618325409;
                        i2 = 31522685;
                    } else {
                        iM11306 = (C19806.m45029("᩹ܺ") + i11) * (-127);
                        i = ((iM11306 ^ i12) * 4367) ^ (-476824965);
                        i2 = -248704210;
                    }
                    i14 = iM11306 ^ i2;
                    i13 = i;
                    break;
                case -1862096257:
                case -1483592069:
                    c = 281;
                    if (C2871.f10837 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۢۖ") ^ i11;
                        i = ((iM11306 ^ i12) * 3059) ^ (-658793192);
                        i2 = 1897469524;
                    } else {
                        iM11306 = C19806.m45029("ܽܿ") ^ i12;
                        i = ((iM11306 ^ i11) * 25473) ^ (-2050150517);
                        i2 = 1126856141;
                    }
                    i14 = iM11306 ^ i2;
                    i13 = i;
                    break;
                case -1837928242:
                case 1664056681:
                    c6018.m16335(z);
                    if (!C19806.f63586) {
                        RunnableC0195.m1442(new C6252(this, i3));
                        return;
                    }
                    iM11306 = C19806.m45029("ᩳᩴ") ^ i12;
                    i = ((iM11306 ^ i11) * (-25865)) ^ (-774844469);
                    i2 = 147721870;
                    i14 = iM11306 ^ i2;
                    i13 = i;
                    break;
                case -1818532192:
                case -369777559:
                    s = sArr2[c];
                    s2 = 3660;
                    if (C1189.f5284 <= 0) {
                        iM11306 = C19806.m45029("֡ۧ") ^ i11;
                        i = ((iM11306 ^ i12) * 8537) ^ (-109597119);
                        i2 = -1515511798;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܽۙ") ^ i12;
                        i = ((iM11306 ^ i11) * 24437) ^ 1861235058;
                        i2 = -505362256;
                    }
                    i14 = iM11306 ^ i2;
                    i13 = i;
                    break;
                case -1704563554:
                case 1326100689:
                    if (i4 - (i5 + i6) <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֫ܽ") ^ i11;
                        i = ((iM11306 ^ i12) * 26301) ^ (-1856017255);
                        i2 = -1720743333;
                    } else {
                        iM11306 = C19806.m45029("۬᩺") ^ i11;
                        i = ((iM11306 ^ i12) * 30279) ^ (-1733299138);
                        i2 = 476269363;
                    }
                    i14 = iM11306 ^ i2;
                    i13 = i;
                    break;
                case -1330837983:
                case 2136857404:
                    if (this.f77402) {
                        iM11306 = C19806.m45029("᩶֡") ^ i11;
                        i = ((iM11306 ^ i12) * (-20767)) ^ (-381116638);
                        i2 = 662716327;
                    } else {
                        iM11306 = (i11 - C19806.m45029("᩹֡")) * 115;
                        i = ((iM11306 ^ i12) * (-15665)) ^ 818813381;
                        i2 = 842615370;
                    }
                    i14 = iM11306 ^ i2;
                    i13 = i;
                    break;
                case -1149395121:
                case -959934869:
                    RunnableC1606.m5473();
                    if (CallableC1627.f6528) {
                        iM11306 = (C19806.m45029("᩹ܺ") + i11) * (-127);
                        i = ((iM11306 ^ i12) * 4367) ^ (-476824965);
                        i2 = -248704210;
                    } else {
                        iM11306 = (C19806.m45029("۬᩷") ^ i12) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM11306 ^ i11) * 24789) ^ (-26457742);
                        i2 = -1676449453;
                    }
                    i14 = iM11306 ^ i2;
                    i13 = i;
                    break;
                case -1016629726:
                case 1069076727:
                    C0278.m1789();
                    iM11306 = (C19806.m45029("᩹ܺ") + i11) * (-127);
                    i = ((iM11306 ^ i12) * 4367) ^ (-476824965);
                    i2 = -248704210;
                    i14 = iM11306 ^ i2;
                    i13 = i;
                    break;
                case -662916064:
                case 1214239900:
                    C7105.m18985();
                    if (C2332.f8260) {
                        iM11306 = (C19806.m45029("۬᩷") ^ i12) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM11306 ^ i11) * 24789) ^ (-26457742);
                        i2 = -1676449453;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۢۖ") ^ i11;
                        i = ((iM11306 ^ i12) * 3059) ^ (-658793192);
                        i2 = 1897469524;
                    }
                    i14 = iM11306 ^ i2;
                    i13 = i;
                    break;
                case -631765858:
                case 438639481:
                    i3 = i15 + (z ? 1 : 0);
                    if (RunnableC0195.m1431()) {
                        iM11306 = C19806.m45029("֨۬") ^ i12;
                        i = ((iM11306 ^ i11) * 2435) ^ 216689996;
                        i2 = -298600160;
                    } else {
                        iM11306 = C19806.m45029("ᩳᩴ") ^ i12;
                        i = ((iM11306 ^ i11) * (-25865)) ^ (-774844469);
                        i2 = 147721870;
                    }
                    i14 = iM11306 ^ i2;
                    i13 = i;
                    break;
                case -609853553:
                case 152030556:
                    int i16 = this.f77397;
                    if (C1461.f5957 <= 0) {
                        i15 = i16;
                        z = true;
                        iM11306 = C19806.m45029("֡ۧ") ^ i11;
                        i = ((iM11306 ^ i12) * 8537) ^ (-109597119);
                        i2 = -1515511798;
                        i14 = iM11306 ^ i2;
                        i13 = i;
                    } else {
                        int iM11308 = ThreadFactoryC3888.m11306("ۨܿ") ^ i12;
                        i15 = i16;
                        i13 = ((iM11308 ^ i11) * (-8597)) ^ 483904922;
                        i14 = iM11308 ^ 183053574;
                        z = true;
                    }
                    break;
                case -582494230:
                case -303606941:
                    return;
                case 17657746:
                case 166919594:
                    C3535.m10426(C2124.m6685(sArr, i8, i9, i7));
                    throw null;
                case 179784203:
                case 1048771499:
                    this.f77397 = i3;
                    this.f77402 = z;
                    c6018 = this.f77403;
                    if (c6018 != null) {
                        iM11306 = ThreadFactoryC3888.m11306("ۤ֫") ^ i12;
                        i = ((iM11306 ^ i11) * (-25823)) ^ (-847453920);
                        i2 = -1281469727;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩶֨") ^ i11;
                        i = ((iM11306 ^ i12) * 12563) ^ 945345092;
                        i2 = 1097447307;
                    }
                    i14 = iM11306 ^ i2;
                    i13 = i;
                    break;
                case 422859956:
                case 1840032162:
                    sArr2 = f77392;
                    if (C2477.f9839 <= 0) {
                        iM11306 = C19806.m45029("ᩳᩴ") ^ i12;
                        i = ((iM11306 ^ i11) * (-25865)) ^ (-774844469);
                        i2 = 147721870;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩹᩹") ^ i11;
                        i = ((iM11306 ^ i12) * 17413) ^ (-1425199676);
                        i2 = 1533390960;
                    }
                    i14 = iM11306 ^ i2;
                    i13 = i;
                    break;
                case 827448131:
                case 929361085:
                    i4 = s * s2;
                    i5 = s * s;
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM11306 = (C19806.m45029("᩹ܺ") + i11) * (-127);
                        i = ((iM11306 ^ i12) * 4367) ^ (-476824965);
                        i2 = -248704210;
                    } else {
                        iM11306 = (C19806.m45029("ۙ۬") ^ i11) * 57;
                        i = ((iM11306 ^ i12) * (-21157)) ^ 1222326376;
                        i2 = 1134136130;
                    }
                    i14 = iM11306 ^ i2;
                    i13 = i;
                    break;
                case 1101195895:
                case 1408905086:
                    i6 = 3348900;
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM11306 = C19806.m45029("ᩳ᩻") ^ i12;
                        i = ((iM11306 ^ i11) * 22871) ^ 222131063;
                        i2 = -1615328650;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۢۖ") ^ i11;
                        i = ((iM11306 ^ i12) * 3059) ^ (-658793192);
                        i2 = 1897469524;
                    }
                    i14 = iM11306 ^ i2;
                    i13 = i;
                    break;
                case 1393256838:
                case 1960259925:
                    i7 = 36022;
                    iM11306 = C19806.m45029("᩵ۘ") ^ i12;
                    i = ((iM11306 ^ i11) * 16377) ^ 623533782;
                    i2 = -1343286032;
                    i14 = iM11306 ^ i2;
                    i13 = i;
                    break;
                case 1560348308:
                case 1875886147:
                    RunnableC1564.m5345();
                    if (C7105.f23796 >= 0) {
                        iM11306 = (C19806.m45029("᩹ܺ") + i11) * (-127);
                        i = ((iM11306 ^ i12) * 4367) ^ (-476824965);
                        i2 = -248704210;
                    } else {
                        iM11306 = C19806.m45029("ᩳᩴ") ^ i12;
                        i = ((iM11306 ^ i11) * (-25865)) ^ (-774844469);
                        i2 = 147721870;
                    }
                    i14 = iM11306 ^ i2;
                    i13 = i;
                    break;
                case 1615572673:
                case 1896040559:
                    i9 = 13;
                    if (RunnableC0195.f1321 >= 0) {
                        iM11306 = (C19806.m45029("᩹ܺ") + i11) * (-127);
                        i = ((iM11306 ^ i12) * 4367) ^ (-476824965);
                        i2 = -248704210;
                    } else {
                        iM11306 = (i11 - C19806.m45029("ۡܺ")) * (-121);
                        i = ((iM11306 ^ i12) * (-12757)) ^ 294983647;
                        i2 = 1594428496;
                    }
                    i14 = iM11306 ^ i2;
                    i13 = i;
                    break;
                default:
                    C2124.m6673();
                    return;
            }
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 37321. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m52654(l.ActivityC23892 r50, org.json.JSONObject r51) {
        /*
            Method dump skipped, instruction units count: 3732
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ActivityC23892.m52654(l.᩻ᩴ᩺, org.json.JSONObject):void");
    }
}
