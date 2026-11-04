package l;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.TextView;
import com.alipay.sdk.m.y.q;
import com.google.android.material.navigation.DrawerLayoutUtils;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۖ᩷ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 751X */
/* JADX INFO: loaded from: classes2.dex */
public final class C2930 {

    /* JADX INFO: renamed from: ۖۛ᩺, reason: not valid java name and contains not printable characters */
    private static final short[] f9594 = {3756, -1032, 4139, 1468, 2827, 2649, 3522, 3765, 10466, 8421, 8691, -10255, 9669, -15855, -11741, -12927, -8545, -16136, 7655, 7334, -12805, 6453, -12068, 14913, 15312, 10171, 12475, -10212, 10755, 10148, -13293, 14295, 14546, 15787, 11879, 16363, 14186, -9667, 9856, 15198, 13640, 16134, 4404, 15160, -11497, -11191, -10751, 16321, 11723, 12152, -13741, -9657, 11716, -10546, 7752, -12538, 7383, 5788, 15037, 13332, 12747, -10982, -8691, -9405, -16122, 11055, 6888, 4732, 7607, -10854, 6476, 13401, -12129, 8584, 12646, -9673, -12583, 12089, 7153, -15002, 6640, 13747, -8722, 4291, 4437, -9874, 6256, -14627, -16095, 12430, 9319, 11582, -15541, -13449, -10194, 14255, 16254, 15146, -8437, 6285, 13731, -8570, 7645, -12667, 7758, -11641, 14991, -9398, -12221, -12965, -9913, 11344, 11371, 16254, -12085, -16071, 11032, 11882, 6379, -10477, 6595, 4893, -13189, 2629, 10955};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static PorterDuffColorFilter m9575(int i) {
        int i2 = 1531498927;
        int i3 = AbstractC3624.f12429;
        int i4 = C1783.f6087;
        int iM2761 = (i3 - C0619.m2761("֨ܺ")) * 65;
        int i5 = ((iM2761 ^ i4) * (-22541)) ^ (-1710755034);
        int i6 = 2013337770;
        while (true) {
            i2 = ((((i2 ^ i4) * (-7335)) >> 31) & i5) ^ (iM2761 ^ i6);
            switch (i2) {
                case -2077709506:
                case 1057545106:
                    int i7 = C23434.f75861;
                    if (C23916.m53419() != 0) {
                        iM2761 = (C0773.m3169("۟۫") ^ i4) * 49;
                        i5 = ((iM2761 ^ i3) * 25651) ^ 685327008;
                        i6 = -1473236679;
                    } else {
                        iM2761 = C0619.m2761("۫ܽ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 26989) ^ (-1226356437);
                        i6 = -741620624;
                    }
                    break;
                case -2025490202:
                case -1149890239:
                    C1564.m5509();
                    AbstractC3624.m11755();
                    iM2761 = (C0773.m3169("۟۫") ^ i4) * 49;
                    i5 = ((iM2761 ^ i3) * 25651) ^ 685327008;
                    i6 = -1473236679;
                    break;
                case -1711312844:
                case 587338857:
                    if (C11235.f35427 >= 0) {
                        iM2761 = C0773.m3169("ۚۨ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 1513) ^ 266805676;
                        i6 = 340372379;
                    } else {
                        iM2761 = (C0619.m2761("֨ۜ") + i3) * (-93);
                        i5 = ((iM2761 ^ i4) * (-4753)) ^ 446116336;
                        i6 = 1644527789;
                    }
                    break;
                case -1513308953:
                case 162463330:
                    if (!C2288.m7767()) {
                        iM2761 = (C0773.m3169("۟۫") ^ i4) * 49;
                        i5 = ((iM2761 ^ i3) * 25651) ^ 685327008;
                        i6 = -1473236679;
                    } else {
                        iM2761 = C0619.m2761("ܺᩳ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 29215) ^ 987703225;
                        i6 = -1558005256;
                    }
                    break;
                case -1497598802:
                case 1228612760:
                    if (AbstractC3624.f12429 <= 0) {
                        iM2761 = (i3 - C0773.m3169("᩷ܺ")) * 69;
                        i5 = ((iM2761 ^ i4) * 229) ^ (-477540850);
                        i6 = -246889883;
                    } else {
                        iM2761 = (C0773.m3169("ۘܿ") + i3) * (-55);
                        i5 = ((iM2761 ^ i4) * (-16485)) ^ (-1607902168);
                        i6 = -1711589598;
                    }
                    break;
                case -1480722186:
                case -1070667720:
                    if (C2375.m8065() > 0) {
                        return new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
                    }
                    iM2761 = C0619.m2761("᩺ܶ") ^ i3;
                    i5 = ((iM2761 ^ i4) * 16789) ^ 561045061;
                    i6 = -299717423;
                    break;
                    break;
                case -1263595773:
                case 260916056:
                    if (C3099.f10023 <= 0) {
                        iM2761 = (i3 - C0773.m3169("᩷ܺ")) * 69;
                        i5 = ((iM2761 ^ i4) * 229) ^ (-477540850);
                        i6 = -246889883;
                    } else {
                        iM2761 = C0619.m2761("ۢܰ") ^ i3;
                        i5 = ((iM2761 ^ i4) * 19393) ^ 1092475644;
                        i6 = -330297422;
                    }
                    break;
                case -1247490906:
                case 1406446926:
                    if (C3690.f12684 <= 0) {
                        iM2761 = C0619.m2761("ܺᩳ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 29215) ^ 987703225;
                        i6 = -1558005256;
                    } else {
                        iM2761 = C0773.m3169("۟ۘ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-13629)) ^ (-2102713465);
                        i6 = -138121475;
                    }
                    break;
                case -1138123026:
                case -1127524858:
                    if (C2966.m9664()) {
                        iM2761 = (i4 - C0619.m2761("ܰۡ")) * 65;
                        i5 = ((iM2761 ^ i3) * (-6011)) ^ (-865130691);
                        i6 = -1641041635;
                    } else {
                        iM2761 = (C0773.m3169("۟۫") ^ i4) * 49;
                        i5 = ((iM2761 ^ i3) * 25651) ^ 685327008;
                        i6 = -1473236679;
                    }
                    break;
                case -1097737651:
                case 1585256739:
                    if (C0487.f2131 <= 0) {
                        iM2761 = (i3 - C0773.m3169("᩷ܺ")) * 69;
                        i5 = ((iM2761 ^ i4) * 229) ^ (-477540850);
                        i6 = -246889883;
                    } else {
                        iM2761 = (C0773.m3169("۟۫") ^ i4) * 49;
                        i5 = ((iM2761 ^ i3) * 25651) ^ 685327008;
                        i6 = -1473236679;
                    }
                    break;
                case -771323418:
                case 908542811:
                    if (C1519.f5300 >= 0) {
                        iM2761 = C0773.m3169("ۚۨ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 1513) ^ 266805676;
                        i6 = 340372379;
                    } else {
                        iM2761 = (i4 - C0619.m2761("ܰۤ")) * 3;
                        i5 = ((iM2761 ^ i3) * (-22809)) ^ (-687084918);
                        i6 = -50093933;
                    }
                    break;
                case -384423305:
                case -22739051:
                    if (C1564.f5401 <= 0) {
                        iM2761 = C0773.m3169("ۚۨ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 1513) ^ 266805676;
                        i6 = 340372379;
                    } else {
                        iM2761 = (C0773.m3169("۟۫") ^ i4) * 49;
                        i5 = ((iM2761 ^ i3) * 25651) ^ 685327008;
                        i6 = -1473236679;
                    }
                    break;
                case 143746583:
                case 687680019:
                    if (C1564.f5401 <= 0) {
                        iM2761 = (C0773.m3169("۟۫") ^ i4) * 49;
                        i5 = ((iM2761 ^ i3) * 25651) ^ 685327008;
                        i6 = -1473236679;
                    } else {
                        iM2761 = C0773.m3169("ۙᩴ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 16129) ^ 1967031407;
                        i6 = -7320597;
                    }
                    break;
                case 597240917:
                case 984565003:
                    if (C0950.f3488 >= 0) {
                        iM2761 = (C0773.m3169("۟۫") ^ i4) * 49;
                        i5 = ((iM2761 ^ i3) * 25651) ^ 685327008;
                        i6 = -1473236679;
                    } else {
                        iM2761 = C0619.m2761("֡۫") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-28765)) ^ 1287244185;
                        i6 = -12414557;
                    }
                    break;
                default:
                    C4238.m13540();
                    return null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v14 */
    /* JADX WARN: Type inference failed for: r16v15 */
    /* JADX WARN: Type inference failed for: r16v16 */
    /* JADX WARN: Type inference failed for: r16v17 */
    /* JADX WARN: Type inference failed for: r16v18 */
    /* JADX WARN: Type inference failed for: r16v19 */
    /* JADX WARN: Type inference failed for: r16v20 */
    /* JADX WARN: Type inference failed for: r16v21 */
    /* JADX WARN: Type inference failed for: r16v22 */
    /* JADX WARN: Type inference failed for: r16v23 */
    /* JADX WARN: Type inference failed for: r16v24 */
    /* JADX WARN: Type inference failed for: r16v25 */
    /* JADX WARN: Type inference failed for: r16v26 */
    /* JADX WARN: Type inference failed for: r16v27 */
    /* JADX WARN: Type inference failed for: r16v28 */
    /* JADX WARN: Type inference failed for: r16v29 */
    /* JADX WARN: Type inference failed for: r16v30 */
    /* JADX WARN: Type inference failed for: r16v31 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m9577(AbstractActivityC17204 abstractActivityC17204) {
        float f;
        short[] sArr;
        short[] sArr2;
        short[] sArr3;
        int i;
        Resources resources;
        int i2;
        int i3;
        int i4;
        int iM3169;
        int i5;
        int i6;
        int i7;
        short[] sArr4;
        int i8;
        int iM31610;
        int i9;
        int iM31611;
        int i10;
        int i11;
        int iM31612;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        short[] sArr5;
        int i17;
        short[] sArr6;
        int i18;
        Resources resources2;
        int iM31613;
        int i19;
        int i20;
        float f2;
        int iM2761;
        int i21;
        int i22;
        char c;
        ?? r16;
        Resources.Theme theme = null;
        float[] fArr = null;
        int i23 = 0;
        char c2 = 0;
        float f3 = 0.0f;
        boolean z = 0;
        int i24 = 0;
        int iM2762 = 0;
        int i25 = 0;
        String strM9847 = null;
        int iM2763 = 0;
        int i26 = -1133189372;
        int i27 = C2288.f7433;
        int i28 = C4238.f15451;
        int iM2764 = (C0619.m2761("᩻ᩳ") ^ i27) * q.h;
        int i29 = ((iM2764 ^ i28) * (-30837)) ^ (-720103281);
        int i30 = iM2764 ^ 1769791179;
        Resources resources3 = null;
        float[] fArr2 = null;
        ColorStateList colorStateListM52628 = null;
        short[] sArr7 = null;
        short[] sArr8 = null;
        short[] sArr9 = null;
        short[] sArr10 = null;
        int i31 = 0;
        int iM2765 = 0;
        int i32 = 0;
        int i33 = 0;
        int iM2766 = 0;
        int i34 = 0;
        int i35 = 0;
        float f4 = 0.0f;
        float f5 = 0.0f;
        char c3 = 0;
        int i36 = 0;
        boolean zM10878 = false;
        boolean z2 = false;
        ColorStateList colorStateListM52629 = null;
        short[] sArr11 = null;
        int i37 = 0;
        int i38 = 0;
        while (true) {
            i26 = i30 ^ (i29 & (((i26 ^ i28) * 8697) >> 31));
            switch (i26) {
                case -2121696938:
                case -1878900097:
                    z2 = false;
                    iM2761 = C0773.m3169("ۨۤ") ^ i28;
                    i21 = ((iM2761 ^ i27) * 30889) ^ (-1330242);
                    i22 = 1977900212;
                    r16 = z;
                    f2 = f3;
                    i30 = iM2761 ^ i22;
                    i29 = i21;
                    z = r16;
                    f3 = f2;
                    break;
                case -2073570843:
                case 1154211237:
                    if (C2375.f7641 > 0) {
                        f = f3;
                        sArr = sArr8;
                        sArr2 = sArr10;
                        sArr3 = sArr11;
                        int i39 = i36;
                        i = i31;
                        resources = resources3;
                        i2 = iM2765;
                        i3 = i39;
                        int iM31614 = C0773.m3169("ۤ۬") ^ i28;
                        sArr11 = sArr3;
                        sArr10 = sArr2;
                        sArr8 = sArr;
                        i29 = ((iM31614 ^ i27) * (-11707)) ^ (-1764013858);
                        int i40 = i2;
                        resources3 = resources;
                        i31 = i;
                        i36 = i3;
                        iM2765 = i40;
                        float f6 = f;
                        i30 = iM31614 ^ 260646158;
                        f3 = f6;
                    } else {
                        f3 = f3;
                        i36 = i36;
                        sArr8 = sArr8;
                        i31 = i31;
                        sArr4 = sArr10;
                        resources3 = resources3;
                        iM2765 = iM2765;
                        iM31610 = (i28 - C0773.m3169("ۗܺ")) * 67;
                        i5 = ((iM31610 ^ i27) * (-28695)) ^ (-1162707433);
                        i9 = -1390856310;
                        i7 = iM31610 ^ i9;
                        sArr10 = sArr4;
                        sArr8 = sArr8;
                        f3 = f3;
                        i30 = i7;
                        i29 = i5;
                        iM2765 = iM2765;
                        resources3 = resources3;
                        i31 = i31;
                        i36 = i36;
                    }
                    break;
                case -2054116547:
                case -453446488:
                    f3 = f3;
                    i36 = i36;
                    sArr8 = sArr8;
                    i31 = i31;
                    sArr4 = sArr10;
                    resources3 = resources3;
                    iM2765 = iM2765;
                    C3296.f10768 = C9217.m24386(resources3, C0619.m2761(C11235.m28300(f9594, 26, 3, i32)) ^ 2127257311, theme);
                    C3296.f10764 = C23916.m53417(theme, C0773.m3169(C1826.m6310(f9594, 29, 3, i32)) ^ 2122802616);
                    sArr7 = f9594;
                    iM31610 = C0773.m3169("ۨ۫") ^ i28;
                    i5 = ((iM31610 ^ i27) * 25069) ^ (-1001107270);
                    i9 = 1476318239;
                    i7 = iM31610 ^ i9;
                    sArr10 = sArr4;
                    sArr8 = sArr8;
                    f3 = f3;
                    i30 = i7;
                    i29 = i5;
                    iM2765 = iM2765;
                    resources3 = resources3;
                    i31 = i31;
                    i36 = i36;
                    break;
                case -1835908104:
                case -1780416121:
                    f3 = f3;
                    C3296.f10756 = C2354.m7979(theme, C0773.m3169(strM9847) ^ 2125989650);
                    C3296.f10735 = C23916.m53417(theme, C0773.m3169(RunnableC1848.m6366(f9594, 74, 3, i32)) ^ 2127347759);
                    iM2765 = 2124333365 ^ C0619.m2761(C20932.m47853(f9594, 77, 3, i32));
                    if (C0487.f2131 > 0) {
                        iM2761 = C0619.m2761("ۛۡ") ^ i27;
                        i21 = ((iM2761 ^ i28) * 2809) ^ (-905995660);
                        i22 = 2052909664;
                        r16 = z;
                        f2 = f3;
                        i30 = iM2761 ^ i22;
                        i29 = i21;
                        z = r16;
                        f3 = f2;
                    }
                    i36 = i36;
                    sArr8 = sArr8;
                    i31 = i31;
                    sArr4 = sArr10;
                    i8 = i38;
                    resources3 = resources3;
                    int iM2767 = C0619.m2761("ۧ᩻") ^ i28;
                    resources3 = resources3;
                    i31 = i31;
                    i36 = i36;
                    f2 = f3;
                    i30 = iM2767 ^ (-1208745978);
                    i29 = ((iM2767 ^ i27) * 30297) ^ 1530201492;
                    iM2765 = iM2765;
                    i38 = i8;
                    sArr10 = sArr4;
                    sArr8 = sArr8;
                    z = z;
                    f3 = f2;
                    break;
                case -1833618310:
                case 1515979401:
                    f3 = f3;
                    i36 = i36;
                    sArr8 = sArr8;
                    i31 = i31;
                    sArr4 = sArr10;
                    resources3 = resources3;
                    iM2765 = iM2765;
                    C3296.f10760 = C9217.m24386(resources3, C0619.m2761(C0862.m3500(f9594, 38, 3, i32)) ^ 2122534902, theme);
                    C3296.f10748 = C23916.m53417(theme, C0773.m3169(C4282.m13650(f9594, 41, 3, i32)) ^ 2127609169);
                    sArr11 = f9594;
                    iM31610 = (C0619.m2761("ᩳ᩶") ^ i27) * (-9);
                    i5 = ((iM31610 ^ i28) * (-3667)) ^ 1104193722;
                    i9 = -283837454;
                    i7 = iM31610 ^ i9;
                    sArr10 = sArr4;
                    sArr8 = sArr8;
                    f3 = f3;
                    i30 = i7;
                    i29 = i5;
                    iM2765 = iM2765;
                    resources3 = resources3;
                    i31 = i31;
                    i36 = i36;
                    break;
                case -1796303975:
                case -425519078:
                    sArr9 = sArr9;
                    f3 = f3;
                    i36 = i36;
                    sArr8 = sArr8;
                    i31 = i31;
                    sArr10 = sArr10;
                    i4 = i38;
                    resources3 = resources3;
                    iM2765 = iM2765;
                    if (zM10878) {
                        iM3169 = C0773.m3169("ܳ֨") ^ i27;
                        i5 = ((iM3169 ^ i28) * 359) ^ 480199288;
                        i6 = 329983752;
                    } else {
                        iM3169 = C0773.m3169("ۛ۬") ^ i28;
                        i5 = ((iM3169 ^ i27) * 14485) ^ 2123741274;
                        i6 = -827211206;
                    }
                    i7 = iM3169 ^ i6;
                    i38 = i4;
                    sArr10 = sArr10;
                    sArr9 = sArr9;
                    sArr8 = sArr8;
                    f3 = f3;
                    i30 = i7;
                    i29 = i5;
                    iM2765 = iM2765;
                    resources3 = resources3;
                    i31 = i31;
                    i36 = i36;
                    break;
                case -1754655383:
                case -800410255:
                    f3 = f3;
                    C3296.f10744 = C23916.m53417(theme, C0773.m3169(C20932.m47853(f9594, 101, 3, i32)) ^ 2102861554);
                    C3296.f10745 = C2354.m7979(theme, C0773.m3169(C1826.m6310(f9594, IShizukuService.Stub.TRANSACTION_isHidden, 3, i32)) ^ 2121111280);
                    sArr10 = f9594;
                    i37 = IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                    i34 = 3;
                    if (C3448.f11240 >= 0) {
                        iM2761 = (C0619.m2761("᩷᩸") + i28) * (-9);
                        i21 = ((iM2761 ^ i27) * 20289) ^ (-261848265);
                        i22 = 1069835464;
                        r16 = z;
                    } else {
                        iM2761 = C0773.m3169("ۙۢ") ^ i27;
                        i21 = ((iM2761 ^ i28) * (-19483)) ^ 375967238;
                        i22 = -1890522712;
                        r16 = z;
                    }
                    f2 = f3;
                    i30 = iM2761 ^ i22;
                    i29 = i21;
                    z = r16;
                    f3 = f2;
                    break;
                case -1725777667:
                case 1757615290:
                    sArr9 = sArr9;
                    f3 = f3;
                    i36 = i36;
                    sArr8 = sArr8;
                    i31 = i31;
                    sArr10 = sArr10;
                    i38 = i38;
                    resources3 = resources3;
                    iM2765 = iM2765;
                    i35 = i35;
                    short s = f9594[7];
                    int i41 = (s * s) + 220077225;
                    int i42 = s + 14835;
                    if ((i42 * i42) - (i41 + i41) > 0) {
                        iM31612 = (C0619.m2761("᩶ܳ") ^ i27) * (-97);
                        i12 = ((iM31612 ^ i28) * 30099) ^ 368811513;
                        i13 = -2058302379;
                    } else {
                        iM31612 = (C0773.m3169("ۜ᩸") + i28) * 31;
                        i12 = ((iM31612 ^ i27) * (-29915)) ^ (-881550213);
                        i13 = 2013767563;
                    }
                    int i43 = iM31612 ^ i13;
                    i35 = i35;
                    i38 = i38;
                    iM2765 = iM2765;
                    sArr10 = sArr10;
                    resources3 = resources3;
                    sArr8 = sArr8;
                    i31 = i31;
                    f3 = f3;
                    i30 = i43;
                    i29 = i12;
                    i36 = i36;
                    sArr9 = sArr9;
                    break;
                case -1700636442:
                case -320257404:
                    C0950.m3785();
                    C2485.m8357();
                    break;
                case -1480813873:
                case 21220699:
                    C0862.m3503();
                    if (C2485.f7950 != 0) {
                        f3 = f3;
                        iM2761 = (C0619.m2761("᩷᩸") + i28) * (-9);
                        i21 = ((iM2761 ^ i27) * 20289) ^ (-261848265);
                        i22 = 1069835464;
                        r16 = z;
                        f2 = f3;
                        i30 = iM2761 ^ i22;
                        i29 = i21;
                        z = r16;
                        f3 = f2;
                    } else {
                        f3 = f3;
                        i16 = i36;
                        sArr5 = sArr8;
                        i17 = i31;
                        sArr6 = sArr10;
                        i18 = i38;
                        Resources resources4 = resources3;
                        i14 = iM2765;
                        i15 = i35;
                        resources2 = resources4;
                        iM31613 = (C0619.m2761("۠᩸") ^ i27) * (-11);
                        i19 = ((iM31613 ^ i28) * 19107) ^ (-1116206529);
                        i20 = 250422215;
                        int i44 = iM31613 ^ i20;
                        i38 = i18;
                        sArr10 = sArr6;
                        sArr9 = sArr9;
                        sArr8 = sArr5;
                        f3 = f3;
                        i30 = i44;
                        i29 = i19;
                        i31 = i17;
                        i36 = i16;
                        Resources resources5 = resources2;
                        i35 = i15;
                        iM2765 = i14;
                        resources3 = resources5;
                    }
                    break;
                case -1438736230:
                case 2125964896:
                    f3 = f3;
                    i36 = i36;
                    sArr8 = sArr8;
                    i31 = i31;
                    sArr4 = sArr10;
                    resources3 = resources3;
                    iM2765 = iM2765;
                    C3296.f10751 = colorStateListM52629;
                    C3296.f10779 = C23434.m52628(theme, R.attr.textColorSecondary);
                    C3296.f10758 = C3296.f10751.getDefaultColor();
                    C3296.f10741 = C3296.f10779.getDefaultColor();
                    int[] iArr = {-16842910};
                    i8 = i38;
                    C3296.f10754 = C3296.f10751.getColorForState(iArr, i8);
                    C3296.f10733 = C3296.f10779.getColorForState(iArr, i8);
                    if (C2966.f9654 < 0) {
                        int iM31615 = (C0773.m3169("ۢ᩺") + i27) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i5 = ((iM31615 ^ i28) * 20077) ^ 53035921;
                        i7 = iM31615 ^ (-779866240);
                        i38 = i8;
                        sArr10 = sArr4;
                        sArr8 = sArr8;
                        f3 = f3;
                        i30 = i7;
                        i29 = i5;
                        iM2765 = iM2765;
                        resources3 = resources3;
                        i31 = i31;
                        i36 = i36;
                    } else {
                        iM2765 = iM2765;
                        int iM2768 = C0619.m2761("ۧ᩻") ^ i28;
                        resources3 = resources3;
                        i31 = i31;
                        i36 = i36;
                        f2 = f3;
                        i30 = iM2768 ^ (-1208745978);
                        i29 = ((iM2768 ^ i27) * 30297) ^ 1530201492;
                        iM2765 = iM2765;
                        i38 = i8;
                        sArr10 = sArr4;
                        sArr8 = sArr8;
                        z = z;
                        f3 = f2;
                    }
                    break;
                case -1397393554:
                case 1268260066:
                    if (C4282.f15546 <= 0) {
                        f3 = f3;
                        i16 = i36;
                        sArr5 = sArr8;
                        i17 = i31;
                        sArr6 = sArr10;
                        i18 = i38;
                        Resources resources6 = resources3;
                        i14 = iM2765;
                        i15 = i35;
                        resources2 = resources6;
                        iM31613 = (C0619.m2761("۠᩸") ^ i27) * (-11);
                        i19 = ((iM31613 ^ i28) * 19107) ^ (-1116206529);
                        i20 = 250422215;
                        int i45 = iM31613 ^ i20;
                        i38 = i18;
                        sArr10 = sArr6;
                        sArr9 = sArr9;
                        sArr8 = sArr5;
                        f3 = f3;
                        i30 = i45;
                        i29 = i19;
                        i31 = i17;
                        i36 = i16;
                        Resources resources7 = resources2;
                        i35 = i15;
                        iM2765 = i14;
                        resources3 = resources7;
                    } else {
                        f3 = f3;
                        iM2761 = C0619.m2761("֨ܰ") ^ i27;
                        i21 = ((iM2761 ^ i28) * (-31299)) ^ (-1523009426);
                        i22 = -1900293295;
                        r16 = z;
                        f2 = f3;
                        i30 = iM2761 ^ i22;
                        i29 = i21;
                        z = r16;
                        f3 = f2;
                    }
                    break;
                case -1388960533:
                case -318630436:
                    f3 = f3;
                    C3296.f10746 = C23916.m53417(theme, C0619.m2761(AbstractC3624.m11769(sArr10, i37, i34, i32)) ^ 2103494978);
                    C3296.f10747 = C23916.m53417(theme, C0773.m3169(C3448.m11252(f9594, UMErrorCode.E_UM_BE_JSON_FAILED, 3, i32)) ^ 2102642648);
                    iM2766 = 2128245961 ^ C0619.m2761(RunnableC0334.m2049(f9594, UMErrorCode.E_UM_BE_RAW_OVERSIZE, 3, i32));
                    iM2761 = C0619.m2761("ܶ᩵") ^ i28;
                    i21 = ((iM2761 ^ i27) * (-25573)) ^ 933447598;
                    i22 = 2091119594;
                    r16 = z;
                    f2 = f3;
                    i30 = iM2761 ^ i22;
                    i29 = i21;
                    z = r16;
                    f3 = f2;
                    break;
                case -1200787851:
                case 1481309136:
                    i32 = 17667;
                    iM31612 = (C0619.m2761("᩻ۜ") ^ i27) * (-105);
                    i12 = ((iM31612 ^ i28) * (-2213)) ^ 2145112539;
                    i13 = 1518844297;
                    int i46 = iM31612 ^ i13;
                    i35 = i35;
                    i38 = i38;
                    iM2765 = iM2765;
                    sArr10 = sArr10;
                    resources3 = resources3;
                    sArr8 = sArr8;
                    i31 = i31;
                    f3 = f3;
                    i30 = i46;
                    i29 = i12;
                    i36 = i36;
                    sArr9 = sArr9;
                    break;
                case -1187068753:
                case 935908765:
                    if (C1519.f5300 < 0) {
                        f3 = f3;
                        iM2761 = C0619.m2761("֨ܰ") ^ i27;
                        i21 = ((iM2761 ^ i28) * (-31299)) ^ (-1523009426);
                        i22 = -1900293295;
                        r16 = z;
                        f2 = f3;
                        i30 = iM2761 ^ i22;
                        i29 = i21;
                        z = r16;
                        f3 = f2;
                    } else {
                        int iM2769 = (i27 - C0619.m2761("ᩳۗ")) * (-17);
                        i30 = iM2769 ^ 428324664;
                        i29 = ((iM2769 ^ i28) * 22221) ^ (-1558317961);
                    }
                    break;
                case -1176579651:
                case 1903580222:
                    f3 = f3;
                    C3296.f10775 = C23916.m53417(theme, C0773.m3169(C13473.m33137(sArr9, i31, 3, i32)) ^ 2120960739);
                    C3296.f10737 = C23916.m53417(theme, C0619.m2761(C3998.m12925(f9594, 89, 3, i32)) ^ 2126609404);
                    iM2763 = C0619.m2761(C3448.m11252(f9594, 92, 3, i32));
                    if (C4282.f15546 <= 0) {
                        iM2761 = (C0773.m3169("۫ۤ") + i27) * (-97);
                        i21 = ((iM2761 ^ i28) * 19153) ^ 200941713;
                        i22 = -1537768424;
                        r16 = z;
                    } else {
                        iM2761 = C0619.m2761("᩻ۡ") ^ i28;
                        i21 = ((iM2761 ^ i27) * (-32359)) ^ (-2072770245);
                        i22 = -338039985;
                        r16 = z;
                    }
                    f2 = f3;
                    i30 = iM2761 ^ i22;
                    i29 = i21;
                    z = r16;
                    f3 = f2;
                    break;
                case -1126240716:
                case 1829836809:
                    f3 = f3;
                    i24 = ~i33;
                    iM2761 = C0773.m3169("۟ۜ") ^ i27;
                    i21 = ((iM2761 ^ i28) * 14103) ^ (-847775279);
                    i22 = -2060401418;
                    r16 = z;
                    f2 = f3;
                    i30 = iM2761 ^ i22;
                    i29 = i21;
                    z = r16;
                    f3 = f2;
                    break;
                case -1017922207:
                case 2080882967:
                    f3 = f3;
                    C3296.f10759 = z2;
                    if (C2354.m7979(theme, C0619.m2761(C3998.m12925(f9594, 62, 3, i32)) ^ 2103295801) != 0) {
                        c = c3;
                        iM2761 = (i27 - C0619.m2761("ܰ᩻")) * (-25);
                        i21 = ((iM2761 ^ i28) * 2639) ^ 1634368895;
                        i22 = 606066394;
                        r16 = c;
                    } else {
                        iM2761 = C0773.m3169("֫᩶") ^ i27;
                        i21 = ((iM2761 ^ i28) * 18113) ^ 1089052580;
                        i22 = 1259871036;
                        r16 = z;
                    }
                    f2 = f3;
                    i30 = iM2761 ^ i22;
                    i29 = i21;
                    z = r16;
                    f3 = f2;
                    break;
                case -934198302:
                case 451425559:
                    i36 = i36;
                    int i47 = i31;
                    Resources resources8 = resources3;
                    C8420.m22613(C3296.f10738, fArr);
                    fArr[c2] = fArr[c2] * 0.9f;
                    C3296.f10767 = Color.HSVToColor(fArr);
                    C3296.f10757 = C9217.m24386(resources8, C0773.m3169(C1542.m5471(f9594, 23, 3, i32)) ^ 2129360213, theme);
                    colorStateListM52629 = C23434.m52628(theme, R.attr.textColorPrimary);
                    int iM31616 = (C0773.m3169("ۙ֫") ^ i28) * 89;
                    i30 = iM31616 ^ 802173113;
                    i29 = ((iM31616 ^ i27) * (-30449)) ^ 239741080;
                    i38 = i38;
                    iM2765 = iM2765;
                    sArr10 = sArr10;
                    sArr9 = sArr9;
                    resources3 = resources8;
                    sArr8 = sArr8;
                    i31 = i47;
                    f3 = 0.9f;
                    i36 = i36;
                    break;
                case -929268658:
                case 1396145553:
                    if (!RunnableC0334.m2063()) {
                        f3 = f3;
                        iM2761 = C0619.m2761("֨ܰ") ^ i27;
                        i21 = ((iM2761 ^ i28) * (-31299)) ^ (-1523009426);
                        i22 = -1900293295;
                        r16 = z;
                        f2 = f3;
                        i30 = iM2761 ^ i22;
                        i29 = i21;
                        z = r16;
                        f3 = f2;
                    } else {
                        f3 = f3;
                        i36 = i36;
                        sArr8 = sArr8;
                        i31 = i31;
                        sArr4 = sArr10;
                        resources3 = resources3;
                        iM2765 = iM2765;
                        iM31610 = (i28 - C0773.m3169("ۗܺ")) * 67;
                        i5 = ((iM31610 ^ i27) * (-28695)) ^ (-1162707433);
                        i9 = -1390856310;
                        i7 = iM31610 ^ i9;
                        sArr10 = sArr4;
                        sArr8 = sArr8;
                        f3 = f3;
                        i30 = i7;
                        i29 = i5;
                        iM2765 = iM2765;
                        resources3 = resources3;
                        i31 = i31;
                        i36 = i36;
                    }
                    break;
                case -904644804:
                case 1525400379:
                    f3 = f3;
                    C3296.f10743 = C2354.m7979(theme, iM2766);
                    C3296.f10731 = C23916.m53417(theme, C0773.m3169(C2287.m7749(f9594, 116, 3, i32)) ^ 2125377688);
                    C3296.f10777 = C23916.m53417(theme, C0773.m3169(C3734.m12149(f9594, 119, 3, i32)) ^ 2100026679);
                    if (C3296.f10770 == 0) {
                        iM2761 = (i27 - C0773.m3169("ܶ۠")) * 17;
                        i21 = ((iM2761 ^ i28) * 6097) ^ 2059819880;
                        i22 = -1855466001;
                        r16 = z;
                    } else {
                        iM2761 = C0619.m2761("ۗ֡") ^ i28;
                        i21 = ((iM2761 ^ i27) * (-22057)) ^ (-1094731108);
                        i22 = -725962154;
                        r16 = z;
                    }
                    f2 = f3;
                    i30 = iM2761 ^ i22;
                    i29 = i21;
                    z = r16;
                    f3 = f2;
                    break;
                case -875875847:
                case 1567485344:
                    f3 = f3;
                    C3296.f10752 = C23916.m53417(theme, iM2763 ^ 2098066390);
                    C3296.f10736 = C23916.m53417(theme, C0773.m3169(C1542.m5471(f9594, 95, 3, i32)) ^ 2126104749);
                    C3296.f10730 = C2354.m7979(theme, C0619.m2761(C0269.m1785(f9594, 98, 3, i32)) ^ 2102001284);
                    if (C3448.f11240 < 0) {
                        iM2761 = C0773.m3169("ۘۢ") ^ i27;
                        i21 = ((iM2761 ^ i28) * (-14291)) ^ 1831850814;
                        i22 = -1307031258;
                        r16 = z;
                        f2 = f3;
                        i30 = iM2761 ^ i22;
                        i29 = i21;
                        z = r16;
                        f3 = f2;
                    } else {
                        i16 = i36;
                        sArr5 = sArr8;
                        i17 = i31;
                        sArr6 = sArr10;
                        i18 = i38;
                        Resources resources9 = resources3;
                        i14 = iM2765;
                        i15 = i35;
                        resources2 = resources9;
                        iM31613 = (C0619.m2761("۠᩸") ^ i27) * (-11);
                        i19 = ((iM31613 ^ i28) * 19107) ^ (-1116206529);
                        i20 = 250422215;
                        int i48 = iM31613 ^ i20;
                        i38 = i18;
                        sArr10 = sArr6;
                        sArr9 = sArr9;
                        sArr8 = sArr5;
                        f3 = f3;
                        i30 = i48;
                        i29 = i19;
                        i31 = i17;
                        i36 = i16;
                        Resources resources10 = resources2;
                        i35 = i15;
                        iM2765 = i14;
                        resources3 = resources10;
                    }
                    break;
                case -817607163:
                case 1681372960:
                    i = i31;
                    sArr2 = sArr10;
                    f = f3;
                    resources = resources3;
                    i2 = iM2765;
                    sArr3 = sArr11;
                    C2354.m7979(theme, C0619.m2761(C3448.m11252(sArr3, 44, 3, i32)) ^ 2101447931);
                    C3296.f10773 = C9217.m24386(resources, C0773.m3169(C2375.m8069(f9594, 47, 3, i32)) ^ 2128604331, theme);
                    sArr = f9594;
                    i3 = 50;
                    if (!C0619.f2439) {
                        int iM31617 = C0773.m3169("۠ۤ") ^ i27;
                        sArr11 = sArr3;
                        iM2765 = i2;
                        sArr10 = sArr2;
                        sArr8 = sArr;
                        resources3 = resources;
                        i29 = ((iM31617 ^ i28) * 22115) ^ (-1414750468);
                        i31 = i;
                        i36 = 50;
                        f2 = f;
                        i30 = iM31617 ^ 903122124;
                        z = z;
                        f3 = f2;
                    } else {
                        int iM31618 = C0773.m3169("ۤ۬") ^ i28;
                        sArr11 = sArr3;
                        sArr10 = sArr2;
                        sArr8 = sArr;
                        i29 = ((iM31618 ^ i27) * (-11707)) ^ (-1764013858);
                        int i49 = i2;
                        resources3 = resources;
                        i31 = i;
                        i36 = i3;
                        iM2765 = i49;
                        float f7 = f;
                        i30 = iM31618 ^ 260646158;
                        f3 = f7;
                    }
                    break;
                case -646240217:
                case 974429109:
                    i32 = 43201;
                    iM31612 = (C0619.m2761("᩻ۜ") ^ i27) * (-105);
                    i12 = ((iM31612 ^ i28) * (-2213)) ^ 2145112539;
                    i13 = 1518844297;
                    int i410 = iM31612 ^ i13;
                    i35 = i35;
                    i38 = i38;
                    iM2765 = iM2765;
                    sArr10 = sArr10;
                    resources3 = resources3;
                    sArr8 = sArr8;
                    i31 = i31;
                    f3 = f3;
                    i30 = i410;
                    i29 = i12;
                    i36 = i36;
                    sArr9 = sArr9;
                    break;
                case -644718967:
                case 891115578:
                    C8420.m22613(C3296.f10750, fArr);
                    fArr[c2] = fArr[c2] * f3;
                    C3296.f10770 = Color.HSVToColor(fArr);
                    f3 = f3;
                    iM2761 = C0619.m2761("ۗ֡") ^ i28;
                    i21 = ((iM2761 ^ i27) * (-22057)) ^ (-1094731108);
                    i22 = -725962154;
                    r16 = z;
                    f2 = f3;
                    i30 = iM2761 ^ i22;
                    i29 = i21;
                    z = r16;
                    f3 = f2;
                    break;
                case -588057939:
                case 403576411:
                    f3 = f3;
                    C3296.f10742 = C2354.m7979(theme, iM2765);
                    C3296.f10766 = C23916.m53417(theme, C0773.m3169(C2023.m6966(f9594, 80, 3, i32)) ^ 2121213968);
                    C3296.f10769 = C23916.m53417(theme, C0773.m3169(C2702.m8881(f9594, 83, 3, i32)) ^ 2118695617);
                    sArr9 = f9594;
                    i31 = 86;
                    if (C0950.f3488 >= 0) {
                        iM2761 = C0619.m2761("֨ܰ") ^ i27;
                        i21 = ((iM2761 ^ i28) * (-31299)) ^ (-1523009426);
                        i22 = -1900293295;
                        r16 = z;
                    } else {
                        iM2761 = (C0773.m3169("ۤۢ") + i28) * 49;
                        i21 = ((iM2761 ^ i27) * (-24609)) ^ (-1602224491);
                        i22 = 1088567626;
                        r16 = z;
                    }
                    f2 = f3;
                    i30 = iM2761 ^ i22;
                    i29 = i21;
                    z = r16;
                    f3 = f2;
                    break;
                case -561414890:
                case -12409633:
                    i4 = i38;
                    fArr[i4] = fArr[i4] * 0.9424f;
                    fArr[c3] = fArr[c3] * 1.1285f;
                    fArr[c2] = ((fArr2[c2] * f5) + f4) * fArr[c2];
                    C3296.f10761 = Color.HSVToColor(72, fArr);
                    iM3169 = (C0619.m2761("ᩳۨ") + i27) * 123;
                    i5 = ((iM3169 ^ i28) * (-12977)) ^ (-462686092);
                    i6 = -145265180;
                    i7 = iM3169 ^ i6;
                    i38 = i4;
                    sArr10 = sArr10;
                    sArr9 = sArr9;
                    sArr8 = sArr8;
                    f3 = f3;
                    i30 = i7;
                    i29 = i5;
                    iM2765 = iM2765;
                    resources3 = resources3;
                    i31 = i31;
                    i36 = i36;
                    break;
                case -515296203:
                case 206611620:
                    f3 = f3;
                    i36 = i36;
                    sArr8 = sArr8;
                    i31 = i31;
                    sArr4 = sArr10;
                    resources3 = resources3;
                    iM2765 = iM2765;
                    C3296.f10762 = C23916.m53417(theme, C0619.m2761(C1564.m5510(sArr7, 32, 3, i32)) ^ 2128826679);
                    C3296.f10774 = C9217.m24386(resources3, C0619.m2761(C1321.m4861(f9594, 35, 3, i32)) ^ 2128468345, theme);
                    if (C11235.f35427 >= 0) {
                        iM31610 = (i28 - C0773.m3169("ۗܺ")) * 67;
                        i5 = ((iM31610 ^ i27) * (-28695)) ^ (-1162707433);
                        i9 = -1390856310;
                    } else {
                        iM31610 = C0773.m3169("۬ܿ") ^ i28;
                        i5 = ((iM31610 ^ i27) * 11387) ^ 6199246;
                        i9 = -320085389;
                    }
                    i7 = iM31610 ^ i9;
                    sArr10 = sArr4;
                    sArr8 = sArr8;
                    f3 = f3;
                    i30 = i7;
                    i29 = i5;
                    iM2765 = iM2765;
                    resources3 = resources3;
                    i31 = i31;
                    i36 = i36;
                    break;
                case -470895297:
                case 1912202368:
                    i4 = i38;
                    C3296.f10761 = (C3296.f10738 & i23) | 1207959552;
                    iM3169 = (C0619.m2761("ᩳۨ") + i27) * 123;
                    i5 = ((iM3169 ^ i28) * (-12977)) ^ (-462686092);
                    i6 = -145265180;
                    i7 = iM3169 ^ i6;
                    i38 = i4;
                    sArr10 = sArr10;
                    sArr9 = sArr9;
                    sArr8 = sArr8;
                    f3 = f3;
                    i30 = i7;
                    i29 = i5;
                    iM2765 = iM2765;
                    resources3 = resources3;
                    i31 = i31;
                    i36 = i36;
                    break;
                case -454995852:
                case 1636131676:
                    short[] sArr12 = sArr9;
                    f3 = f3;
                    i36 = i36;
                    sArr8 = sArr8;
                    int i50 = i31;
                    sArr10 = sArr10;
                    i38 = i38;
                    resources3 = resources3;
                    iM2765 = iM2765;
                    i35 = i35;
                    float[] fArr3 = new float[i35];
                    C8420.m22613(C3296.f10738, fArr);
                    C8420.m22613(C3296.f10750, fArr3);
                    f5 = 0.2f;
                    f4 = 0.8f;
                    if (zM10878) {
                        int iM27610 = C0619.m2761("ۤ᩷") ^ i27;
                        i29 = ((iM27610 ^ i28) * (-18729)) ^ 1990053704;
                        fArr2 = fArr3;
                        i30 = iM27610 ^ (-1659866223);
                    } else {
                        int iM31619 = (i28 - C0773.m3169("ܿۤ")) * 17;
                        fArr2 = fArr3;
                        i30 = iM31619 ^ (-834578807);
                        i29 = ((iM31619 ^ i27) * 17665) ^ (-1003266330);
                    }
                    i31 = i50;
                    sArr9 = sArr12;
                    i36 = i36;
                    break;
                case -412993418:
                case 1462400136:
                    C3296.f10776 = i24;
                    break;
                case -345774601:
                case 1575478915:
                    f3 = f3;
                    if (C2354.m7979(theme, C0619.m2761(C1826.m6310(f9594, 122, 3, i32)) ^ 2097811538) != 0) {
                        iM2761 = (i28 - C0773.m3169("ۢܰ")) * 21;
                        i21 = ((iM2761 ^ i27) * 11303) ^ (-300724715);
                        i22 = 627552830;
                        r16 = z;
                    } else {
                        iM2761 = (i27 - C0619.m2761("۟ۢ")) * (-71);
                        i21 = ((iM2761 ^ i28) * 29131) ^ 559832720;
                        i22 = -825140068;
                        r16 = z;
                    }
                    f2 = f3;
                    i30 = iM2761 ^ i22;
                    i29 = i21;
                    z = r16;
                    f3 = f2;
                    break;
                case -329582227:
                case 977977906:
                    i4 = i38;
                    fArr[i4] = fArr[i4] * 0.9425f;
                    fArr[c3] = fArr[c3] * 1.3619f;
                    fArr[c2] = ((fArr2[c2] * f5) + f4) * fArr[c2];
                    C3296.f10761 = Color.HSVToColor(153, fArr);
                    iM3169 = (C0619.m2761("ᩳۨ") + i27) * 123;
                    i5 = ((iM3169 ^ i28) * (-12977)) ^ (-462686092);
                    i6 = -145265180;
                    i7 = iM3169 ^ i6;
                    i38 = i4;
                    sArr10 = sArr10;
                    sArr9 = sArr9;
                    sArr8 = sArr8;
                    f3 = f3;
                    i30 = i7;
                    i29 = i5;
                    iM2765 = iM2765;
                    resources3 = resources3;
                    i31 = i31;
                    i36 = i36;
                    break;
                case -228172864:
                case 865230478:
                    f3 = f3;
                    C3296.f10740 = colorStateListM52628;
                    C3296.f10732 = C23434.m52628(theme, C0619.m2761(C1343.m4939(f9594, 56, 3, i32)) ^ 2120209873);
                    if (C23916.m53417(theme, C0619.m2761(C1321.m4861(f9594, 59, 3, i32)) ^ 2125676367) != 0) {
                        iM2761 = (C0619.m2761("ۖܰ") ^ i28) * (-19);
                        i21 = ((iM2761 ^ i27) * 6461) ^ (-518236672);
                        i22 = 516386121;
                        r16 = z;
                    } else {
                        iM2761 = C0619.m2761("᩺᩵") ^ i27;
                        i21 = ((iM2761 ^ i28) * (-4291)) ^ 2125672442;
                        i22 = -472379088;
                        r16 = z;
                    }
                    f2 = f3;
                    i30 = iM2761 ^ i22;
                    i29 = i21;
                    z = r16;
                    f3 = f2;
                    break;
                case -163775091:
                case 1540051369:
                    i14 = iM2765;
                    sArr9 = sArr9;
                    f3 = f3;
                    i15 = i35;
                    i16 = i36;
                    sArr5 = sArr8;
                    i17 = i31;
                    sArr6 = sArr10;
                    i18 = i38;
                    zM10878 = C3296.m10878();
                    Resources resources11 = abstractActivityC17204.getResources();
                    theme = abstractActivityC17204.getTheme();
                    resources2 = resources11;
                    C3296.f10750 = C2354.m7979(theme, C0773.m3169(C0619.m2756(f9594, 8, 3, i32)) ^ 2125280369);
                    C3296.f10738 = C23916.m53417(theme, C0773.m3169(C2287.m7749(f9594, 11, 3, i32)) ^ 2100813197);
                    iM2762 = C0619.m2761(C1783.m6233(f9594, 14, 3, i32));
                    i25 = 2102162266;
                    if (C2966.m9664()) {
                        iM31613 = C0773.m3169("۟۬") ^ i28;
                        i19 = ((iM31613 ^ i27) * (-25631)) ^ 765099909;
                        i20 = -966298964;
                    } else {
                        iM31613 = (C0619.m2761("۠᩸") ^ i27) * (-11);
                        i19 = ((iM31613 ^ i28) * 19107) ^ (-1116206529);
                        i20 = 250422215;
                    }
                    int i411 = iM31613 ^ i20;
                    i38 = i18;
                    sArr10 = sArr6;
                    sArr9 = sArr9;
                    sArr8 = sArr5;
                    f3 = f3;
                    i30 = i411;
                    i29 = i19;
                    i31 = i17;
                    i36 = i16;
                    Resources resources12 = resources2;
                    i35 = i15;
                    iM2765 = i14;
                    resources3 = resources12;
                    break;
                case -128830066:
                case 369264076:
                    f3 = f3;
                    if (zM10878) {
                        iM2761 = C0773.m3169("۟ܳ") ^ i28;
                        i21 = ((iM2761 ^ i27) * (-2755)) ^ (-521735570);
                        i22 = -35147059;
                        r16 = z;
                    } else {
                        iM2761 = (i27 - C0619.m2761("֫۟")) * (-105);
                        i21 = ((iM2761 ^ i28) * (-16569)) ^ (-2063168642);
                        i22 = 1207654520;
                        r16 = z;
                    }
                    f2 = f3;
                    i30 = iM2761 ^ i22;
                    i29 = i21;
                    z = r16;
                    f3 = f2;
                    break;
                case -60973764:
                case 1855883134:
                    z2 = true;
                    iM2761 = C0773.m3169("ۨۤ") ^ i28;
                    i21 = ((iM2761 ^ i27) * 30889) ^ (-1330242);
                    i22 = 1977900212;
                    r16 = z;
                    f2 = f3;
                    i30 = iM2761 ^ i22;
                    i29 = i21;
                    z = r16;
                    f3 = f2;
                    break;
                case -1086590:
                case 1108170468:
                    f3 = f3;
                    C3296.f10755 = z;
                    C3296.f10770 = C2354.m7979(theme, C0773.m3169(C1542.m5471(f9594, 65, 3, i32)) ^ 2125302396);
                    C3296.f10765 = C2354.m7979(theme, C0619.m2761(AbstractC3624.m11769(f9594, 68, 3, i32)) ^ 2119882967);
                    strM9847 = C3033.m9847(f9594, 71, 3, i32);
                    if (C3734.f12817 >= 0) {
                        iM2761 = C0619.m2761("ۡۤ") ^ i27;
                        i21 = ((iM2761 ^ i28) * (-29055)) ^ 903495575;
                        i22 = -432723301;
                        r16 = z;
                    } else {
                        iM2761 = (C0619.m2761("ۙۖ") ^ i28) * 49;
                        i21 = ((iM2761 ^ i27) * (-5577)) ^ 252867632;
                        i22 = 1825705587;
                        r16 = z;
                    }
                    f2 = f3;
                    i30 = iM2761 ^ i22;
                    i29 = i21;
                    z = r16;
                    f3 = f2;
                    break;
                case 47511312:
                case 450671378:
                    C2702.m8876();
                    if (RunnableC0334.f1808 <= 0) {
                        f3 = f3;
                        iM2761 = C0619.m2761("ۡۤ") ^ i27;
                        i21 = ((iM2761 ^ i28) * (-29055)) ^ 903495575;
                        i22 = -432723301;
                        r16 = z;
                        f2 = f3;
                        i30 = iM2761 ^ i22;
                        i29 = i21;
                        z = r16;
                        f3 = f2;
                    }
                    f3 = f3;
                    iM2761 = (C0619.m2761("᩷᩸") + i28) * (-9);
                    i21 = ((iM2761 ^ i27) * 20289) ^ (-261848265);
                    i22 = 1069835464;
                    r16 = z;
                    f2 = f3;
                    i30 = iM2761 ^ i22;
                    i29 = i21;
                    z = r16;
                    f3 = f2;
                    break;
                case 184814078:
                case 1631977199:
                    C0862.m3503();
                    if (AbstractC3624.f12429 > 0) {
                        f3 = f3;
                        i36 = i36;
                        sArr8 = sArr8;
                        i31 = i31;
                        sArr4 = sArr10;
                        i8 = i38;
                        resources3 = resources3;
                        int iM27611 = C0619.m2761("ۧ᩻") ^ i28;
                        resources3 = resources3;
                        i31 = i31;
                        i36 = i36;
                        f2 = f3;
                        i30 = iM27611 ^ (-1208745978);
                        i29 = ((iM27611 ^ i27) * 30297) ^ 1530201492;
                        iM2765 = iM2765;
                        i38 = i8;
                        sArr10 = sArr4;
                        sArr8 = sArr8;
                        z = z;
                        f3 = f2;
                    } else {
                        f3 = f3;
                        i16 = i36;
                        sArr5 = sArr8;
                        i17 = i31;
                        sArr6 = sArr10;
                        i18 = i38;
                        Resources resources13 = resources3;
                        i14 = iM2765;
                        i15 = i35;
                        resources2 = resources13;
                        iM31613 = (C0619.m2761("۠᩸") ^ i27) * (-11);
                        i19 = ((iM31613 ^ i28) * 19107) ^ (-1116206529);
                        i20 = 250422215;
                        int i412 = iM31613 ^ i20;
                        i38 = i18;
                        sArr10 = sArr6;
                        sArr9 = sArr9;
                        sArr8 = sArr5;
                        f3 = f3;
                        i30 = i412;
                        i29 = i19;
                        i31 = i17;
                        i36 = i16;
                        Resources resources14 = resources2;
                        i35 = i15;
                        iM2765 = i14;
                        resources3 = resources14;
                    }
                    break;
                case 692778570:
                case 832534641:
                    f3 = f3;
                    c = 0;
                    iM2761 = (i27 - C0619.m2761("ܰ᩻")) * (-25);
                    i21 = ((iM2761 ^ i28) * 2639) ^ 1634368895;
                    i22 = 606066394;
                    r16 = c;
                    f2 = f3;
                    i30 = iM2761 ^ i22;
                    i29 = i21;
                    z = r16;
                    f3 = f2;
                    break;
                case 761394129:
                case 2013668450:
                    i4 = i38;
                    C3296.f10761 = (C3296.f10738 & i23) | DrawerLayoutUtils.DEFAULT_SCRIM_COLOR;
                    iM3169 = (C0619.m2761("ᩳۨ") + i27) * 123;
                    i5 = ((iM3169 ^ i28) * (-12977)) ^ (-462686092);
                    i6 = -145265180;
                    i7 = iM3169 ^ i6;
                    i38 = i4;
                    sArr10 = sArr10;
                    sArr9 = sArr9;
                    sArr8 = sArr8;
                    f3 = f3;
                    i30 = i7;
                    i29 = i5;
                    iM2765 = iM2765;
                    resources3 = resources3;
                    i31 = i31;
                    i36 = i36;
                    break;
                case 1154099783:
                case 1973767606:
                    C3296.f10770 = C3296.f10750;
                    f3 = f3;
                    iM2761 = C0619.m2761("ۗ֡") ^ i28;
                    i21 = ((iM2761 ^ i27) * (-22057)) ^ (-1094731108);
                    i22 = -725962154;
                    r16 = z;
                    f2 = f3;
                    i30 = iM2761 ^ i22;
                    i29 = i21;
                    z = r16;
                    f3 = f2;
                    break;
                case 1263555536:
                case 1888345342:
                    C3296.f10770 = C3296.f10750;
                    f3 = f3;
                    iM2761 = C0619.m2761("ۗ֡") ^ i28;
                    i21 = ((iM2761 ^ i27) * (-22057)) ^ (-1094731108);
                    i22 = -725962154;
                    r16 = z;
                    f2 = f3;
                    i30 = iM2761 ^ i22;
                    i29 = i21;
                    z = r16;
                    f3 = f2;
                    break;
                case 1398737064:
                case 2091034808:
                    C17202.m40372();
                    C3099.m10095();
                    f3 = f3;
                    iM2761 = C0619.m2761("֨ܰ") ^ i27;
                    i21 = ((iM2761 ^ i28) * (-31299)) ^ (-1523009426);
                    i22 = -1900293295;
                    r16 = z;
                    f2 = f3;
                    i30 = iM2761 ^ i22;
                    i29 = i21;
                    z = r16;
                    f3 = f2;
                    break;
                case 1468430229:
                case 2041558073:
                    f3 = f3;
                    i36 = i36;
                    sArr8 = sArr8;
                    i31 = i31;
                    resources3 = resources3;
                    C3296.f10753 = C9217.m24386(resources3, C0619.m2761(C0619.m2756(sArr8, i36, 3, i32)) ^ 2100014343, theme);
                    C3296.f10763 = C2354.m7979(theme, R.attr.colorBackground);
                    iM2765 = iM2765;
                    sArr4 = sArr10;
                    colorStateListM52628 = C23434.m52628(theme, C0619.m2761(C0619.m2756(f9594, 53, 3, i32)) ^ 2100456870);
                    iM31610 = (C0773.m3169("᩶֫") ^ i28) * 101;
                    i5 = ((iM31610 ^ i27) * (-23363)) ^ 1275505987;
                    i9 = 647476290;
                    i7 = iM31610 ^ i9;
                    sArr10 = sArr4;
                    sArr8 = sArr8;
                    f3 = f3;
                    i30 = i7;
                    i29 = i5;
                    iM2765 = iM2765;
                    resources3 = resources3;
                    i31 = i31;
                    i36 = i36;
                    break;
                case 1645041365:
                case 1809178939:
                    f3 = f3;
                    i33 = (C3296.f10738 & i23) + ((C3296.f10750 & i23) * 31);
                    if (zM10878) {
                        iM2761 = C0619.m2761("۟᩷") ^ i28;
                        i21 = ((iM2761 ^ i27) * (-1939)) ^ (-1483800543);
                        i22 = 174668901;
                        r16 = z;
                    } else {
                        i24 = i33;
                        iM2761 = C0773.m3169("۟ۜ") ^ i27;
                        i21 = ((iM2761 ^ i28) * 14103) ^ (-847775279);
                        i22 = -2060401418;
                        r16 = z;
                    }
                    f2 = f3;
                    i30 = iM2761 ^ i22;
                    i29 = i21;
                    z = r16;
                    f3 = f2;
                    break;
                default:
                    short[] sArr13 = sArr9;
                    float f8 = f3;
                    i36 = i36;
                    short[] sArr14 = sArr8;
                    i31 = i31;
                    short[] sArr15 = sArr10;
                    resources3 = resources3;
                    iM2765 = iM2765;
                    C3296.f10778 = C2354.m7979(theme, iM2762 ^ i25);
                    C3296.f10771 = C2354.m7979(theme, C0773.m3169(C2287.m7749(f9594, 17, 3, i32)) ^ 2097549448);
                    fArr = new float[3];
                    c3 = 1;
                    i23 = 16777215;
                    c2 = 2;
                    i38 = 0;
                    if (C23916.m53417(theme, C0773.m3169(RunnableC1848.m6366(f9594, 20, 3, i32)) ^ 2097803143) != 0) {
                        iM31611 = C0619.m2761("ܰܳ") ^ i28;
                        i10 = ((iM31611 ^ i27) * (-16227)) ^ 1671667576;
                        i11 = 1343537968;
                    } else {
                        iM31611 = C0773.m3169("ۛۙ") ^ i27;
                        i10 = ((iM31611 ^ i28) * (-22837)) ^ (-1994171546);
                        i11 = -2035045257;
                    }
                    int i51 = iM31611 ^ i11;
                    i29 = i10;
                    sArr10 = sArr15;
                    sArr9 = sArr13;
                    i35 = 3;
                    sArr8 = sArr14;
                    f3 = f8;
                    i30 = i51;
                    iM2765 = iM2765;
                    resources3 = resources3;
                    i31 = i31;
                    i36 = i36;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00c6 A[PHI: r3 r11 r12
      0x00c6: PHI (r3v4 android.content.Context) = 
      (r3v3 android.content.Context)
      (r3v2 android.content.Context)
      (r3v2 android.content.Context)
      (r3v2 android.content.Context)
     binds: [B:24:0x00c4, B:14:0x007c, B:12:0x0079, B:9:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x00c6: PHI (r11v4 short[]) = (r11v3 short[]), (r11v2 short[]), (r11v2 short[]), (r11v2 short[]) binds: [B:24:0x00c4, B:14:0x007c, B:12:0x0079, B:9:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x00c6: PHI (r12v4 int) = (r12v3 int), (r12v2 int), (r12v2 int), (r12v2 int) binds: [B:24:0x00c4, B:14:0x007c, B:12:0x0079, B:9:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x015f A[PHI: r4 r7
      0x015f: PHI (r4v5 java.lang.String) = (r4v3 java.lang.String), (r4v2 java.lang.String), (r4v2 java.lang.String) binds: [B:40:0x015d, B:20:0x00a1, B:6:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x015f: PHI (r7v5 java.lang.String) = (r7v2 java.lang.String), (r7v3 java.lang.String), (r7v2 java.lang.String) binds: [B:40:0x015d, B:20:0x00a1, B:6:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x0197 A[PHI: r2 r5 r6 r8 r9 r10
      0x0197: PHI (r2v5 android.content.res.ColorStateList) = 
      (r2v2 android.content.res.ColorStateList)
      (r2v2 android.content.res.ColorStateList)
      (r2v4 android.content.res.ColorStateList)
      (r2v2 android.content.res.ColorStateList)
     binds: [B:44:0x0195, B:36:0x013e, B:32:0x011b, B:28:0x00f9] A[DONT_GENERATE, DONT_INLINE]
      0x0197: PHI (r5v4 int) = (r5v2 int), (r5v3 int), (r5v2 int), (r5v2 int) binds: [B:44:0x0195, B:36:0x013e, B:32:0x011b, B:28:0x00f9] A[DONT_GENERATE, DONT_INLINE]
      0x0197: PHI (r6v4 int) = (r6v2 int), (r6v3 int), (r6v2 int), (r6v2 int) binds: [B:44:0x0195, B:36:0x013e, B:32:0x011b, B:28:0x00f9] A[DONT_GENERATE, DONT_INLINE]
      0x0197: PHI (r8v4 short[]) = (r8v3 short[]), (r8v2 short[]), (r8v2 short[]), (r8v2 short[]) binds: [B:44:0x0195, B:36:0x013e, B:32:0x011b, B:28:0x00f9] A[DONT_GENERATE, DONT_INLINE]
      0x0197: PHI (r9v4 int) = (r9v3 int), (r9v2 int), (r9v2 int), (r9v2 int) binds: [B:44:0x0195, B:36:0x013e, B:32:0x011b, B:28:0x00f9] A[DONT_GENERATE, DONT_INLINE]
      0x0197: PHI (r10v4 int) = (r10v3 int), (r10v2 int), (r10v2 int), (r10v2 int) binds: [B:44:0x0195, B:36:0x013e, B:32:0x011b, B:28:0x00f9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x0245 A[PHI: r14 r18 r19 r20 r25
      0x0245: PHI (r14v4 int) = (r14v2 int), (r14v3 int), (r14v2 int), (r14v2 int) binds: [B:59:0x0243, B:55:0x0221, B:12:0x0079, B:6:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x0245: PHI (r18v4 short) = (r18v3 short), (r18v2 short), (r18v2 short), (r18v2 short) binds: [B:59:0x0243, B:55:0x0221, B:12:0x0079, B:6:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x0245: PHI (r19v4 short) = (r19v3 short), (r19v2 short), (r19v2 short), (r19v2 short) binds: [B:59:0x0243, B:55:0x0221, B:12:0x0079, B:6:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x0245: PHI (r20v4 int) = (r20v2 int), (r20v3 int), (r20v2 int), (r20v2 int) binds: [B:59:0x0243, B:55:0x0221, B:12:0x0079, B:6:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x0245: PHI (r25v5 int) = (r25v3 int), (r25v4 int), (r25v3 int), (r25v3 int) binds: [B:59:0x0243, B:55:0x0221, B:12:0x0079, B:6:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x027b A[PHI: r16 r17
      0x027b: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]) binds: [B:63:0x0279, B:9:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x027b: PHI (r17v4 char) = (r17v3 char), (r17v2 char) binds: [B:63:0x0279, B:9:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m9576(TextView textView) {
        int iM3169;
        int i;
        int i2;
        int i3 = C2375.f7641;
        int i4 = C0950.f3488;
        int iM31610 = (C0773.m3169("ᩴ᩸") + i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
        int i5 = ((iM31610 ^ i3) * (-16333)) ^ (-401523759);
        String strM2361 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM31610 ^ (-1790453661);
        int iM2761 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i12 = 0;
        int i13 = -1316418366;
        int i14 = 0;
        Context contextM6308 = null;
        String strM3780 = null;
        ColorStateList colorStateList = null;
        int i15 = 0;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i3) * (-21807)) >> 31));
            switch (i13) {
                case -1875762609:
                case 1332921290:
                    textView.setTextColor(C7508.m20564(contextM6308, C0773.m3169(strM3780) ^ 2104475401));
                    break;
                case -1805363383:
                case -1512157709:
                    sArr = f9594;
                    c = 0;
                    if (AbstractC0116.m1243() != 0) {
                        iM3169 = (C0619.m2761("֡ۧ") ^ i4) * 11;
                        i = ((iM3169 ^ i3) * (-12635)) ^ 263306800;
                        i2 = -1117766021;
                    } else {
                        iM3169 = (C0773.m3169("ᩴ۠") + i4) * 29;
                        i = ((iM3169 ^ i3) * (-15231)) ^ (-2127889151);
                        i2 = 1252715615;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1525878693:
                case -117609658:
                    i11 = 24253;
                    iM3169 = (i3 - C0619.m2761("ۗܰ")) * (-13);
                    i = ((iM3169 ^ i4) * (-31427)) ^ (-1359576301);
                    i2 = 571622945;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1484045362:
                case 850383329:
                    sArr2 = f9594;
                    i7 = 1;
                    i8 = 3;
                    if (C2288.m7767()) {
                        iM3169 = C0619.m2761("۬᩸") ^ i3;
                        i = ((iM3169 ^ i4) * (-5199)) ^ (-270634286);
                        i2 = -1834685748;
                    } else {
                        iM3169 = C0773.m3169("ܳۧ") ^ i3;
                        i = ((iM3169 ^ i4) * 15037) ^ 826654727;
                        i2 = -1262088964;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1269420114:
                case -547500701:
                    C23916.m53419();
                    C2966.m9664();
                    iM3169 = C0773.m3169("ۖܿ") ^ i4;
                    i = ((iM3169 ^ i3) * 2303) ^ 998389651;
                    i2 = 1281602382;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1081435679:
                case 266449369:
                    C3448.m11248();
                    if (C23916.f77426 <= 0) {
                        iM3169 = C0773.m3169("ۖܿ") ^ i4;
                        i = ((iM3169 ^ i3) * 2303) ^ 998389651;
                        i2 = 1281602382;
                    } else {
                        iM3169 = (C0619.m2761("ۛۗ") ^ i4) * 71;
                        i = ((iM3169 ^ i3) * (-27705)) ^ (-500073390);
                        i2 = 845133683;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1072136559:
                case -216169621:
                    strM2361 = C0487.m2361(sArr2, i7, i8, i11);
                    if (C3734.f12817 >= 0) {
                        iM3169 = C0773.m3169("֫᩻") ^ i3;
                        i = ((iM3169 ^ i4) * (-25301)) ^ (-1918717489);
                        i2 = -883636312;
                    } else {
                        iM3169 = (i4 - C0619.m2761("ۘۘ")) * 89;
                        i = ((iM3169 ^ i3) * (-32703)) ^ 1987337162;
                        i2 = -1192175902;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1034732845:
                case -194967920:
                    textView.setBackgroundTintList(colorStateList);
                    if (RunnableC3055.m9933() != 0) {
                        iM3169 = C0619.m2761("۬᩸") ^ i3;
                        i = ((iM3169 ^ i4) * (-5199)) ^ (-270634286);
                        i2 = -1834685748;
                    } else {
                        iM3169 = C0619.m2761("ܿۘ") ^ i3;
                        i = ((iM3169 ^ i4) * (-7489)) ^ 1905742525;
                        i2 = 907703811;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -615973301:
                case 543509340:
                    C2310.m7813();
                    C13473.m33144();
                    break;
                case -520817603:
                case 89835103:
                    strM3780 = C0950.m3780(sArr3, i9, 3, i11);
                    if (C4238.f15451 >= 0) {
                        iM3169 = C0773.m3169("֫᩻") ^ i3;
                        i = ((iM3169 ^ i4) * (-25301)) ^ (-1918717489);
                        i2 = -883636312;
                    } else {
                        iM3169 = C0619.m2761("ۚۗ") ^ i3;
                        i = ((iM3169 ^ i4) * 5365) ^ (-2147102451);
                        i2 = -454267637;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -428175431:
                case 2041712354:
                    C0619.m2763();
                    if (C1564.m5509() <= 0) {
                        iM3169 = C0773.m3169("ۖܿ") ^ i4;
                        i = ((iM3169 ^ i3) * 2303) ^ 998389651;
                        i2 = 1281602382;
                    } else {
                        iM3169 = (C0619.m2761("֡ۧ") ^ i4) * 11;
                        i = ((iM3169 ^ i3) * (-12635)) ^ 263306800;
                        i2 = -1117766021;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -136159577:
                case 1793541095:
                    s = sArr[c];
                    s2 = 3070;
                    if (C4282.m13644()) {
                        iM3169 = C0619.m2761("ܽܶ") ^ i3;
                        i = ((iM3169 ^ i4) * 12531) ^ 457913671;
                        i2 = 1852192331;
                    } else {
                        iM3169 = (C0619.m2761("ۛۗ") ^ i4) * 71;
                        i = ((iM3169 ^ i3) * (-27705)) ^ (-500073390);
                        i2 = 845133683;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 270443507:
                case 1416961853:
                    textView.setBackgroundResource(iM2761 ^ i15);
                    colorStateList = null;
                    if (C0487.f2131 <= 0) {
                        iM3169 = C0619.m2761("۬᩸") ^ i3;
                        i = ((iM3169 ^ i4) * (-5199)) ^ (-270634286);
                        i2 = -1834685748;
                    } else {
                        iM3169 = C0773.m3169("ۗ۫") ^ i4;
                        i = ((iM3169 ^ i3) * (-14101)) ^ 1299750792;
                        i2 = 1665813064;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 448284075:
                case 2089553992:
                    i12 = s * s2;
                    i14 = s * s;
                    i10 = 2356225;
                    if (C1321.f4751 >= 0) {
                        iM3169 = (C0619.m2761("ۛۗ") ^ i4) * 71;
                        i = ((iM3169 ^ i3) * (-27705)) ^ (-500073390);
                        i2 = 845133683;
                    } else {
                        iM3169 = (i4 - C0773.m3169("۠ᩴ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM3169 ^ i3) * (-4459)) ^ 796739334;
                        i2 = -403221098;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 552057164:
                case 2010684136:
                    i11 = 37958;
                    iM3169 = (i3 - C0619.m2761("ۗܰ")) * (-13);
                    i = ((iM3169 ^ i4) * (-31427)) ^ (-1359576301);
                    i2 = 571622945;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 873663505:
                case 892060846:
                    iM2761 = C0619.m2761(strM2361);
                    i15 = 2126254871;
                    if (RunnableC3055.f9898 >= 0) {
                        iM3169 = C0619.m2761("۬᩸") ^ i3;
                        i = ((iM3169 ^ i4) * (-5199)) ^ (-270634286);
                        i2 = -1834685748;
                    } else {
                        iM3169 = C0773.m3169("ۜ᩵") ^ i3;
                        i = ((iM3169 ^ i4) * 7369) ^ (-1503650718);
                        i2 = 1690359955;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 1071240221:
                case 1820946046:
                    if (i12 - (i14 + i10) <= 0) {
                        iM3169 = C0619.m2761("۫᩺") ^ i3;
                        i = ((iM3169 ^ i4) * 16139) ^ 91361370;
                        i2 = 1413078490;
                    } else {
                        iM3169 = C0773.m3169("ۡۜ") ^ i4;
                        i = ((iM3169 ^ i3) * 28135) ^ 1064523135;
                        i2 = 841464428;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 1120142595:
                case 1892254826:
                    contextM6308 = C1826.m6308(textView);
                    sArr3 = f9594;
                    i9 = 4;
                    if (C2375.f7641 <= 0) {
                        iM3169 = C0773.m3169("ۖܿ") ^ i4;
                        i = ((iM3169 ^ i3) * 2303) ^ 998389651;
                        i2 = 1281602382;
                    } else {
                        iM3169 = C0773.m3169("᩺᩶") ^ i4;
                        i = ((iM3169 ^ i3) * (-10485)) ^ (-1132351263);
                        i2 = -1838014641;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                default:
                    if (AbstractC0641.m2813() <= 0) {
                        iM3169 = (C0619.m2761("ۛۗ") ^ i4) * 71;
                        i = ((iM3169 ^ i3) * (-27705)) ^ (-500073390);
                        i2 = 845133683;
                    } else {
                        iM3169 = C0773.m3169("֫᩻") ^ i3;
                        i = ((iM3169 ^ i4) * (-25301)) ^ (-1918717489);
                        i2 = -883636312;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }
}
