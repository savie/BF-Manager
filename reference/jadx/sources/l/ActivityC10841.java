package l;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۤۨ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: K3YG */
/* JADX INFO: loaded from: classes4.dex */
public class ActivityC10841 extends AbstractActivityC17204 {

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f34329 = 0;

    /* JADX INFO: renamed from: ᩳۧ֡, reason: not valid java name and contains not printable characters */
    private static final short[] f34330 = {5286, -28264, -28269, -28268, -28204, -28265, -28274, -28204, -28278, -28266, -28273, -28259, -28269, -28268, -28204, -28279, -28285, -28279, -28274, -28257, -28265, 8063, -344, -332, -339, -321, -335, -330, -266, -332, -329, -321, -264, -267, -264, -348, -264, -348, -264, 3435, 2336, -13906, -14173, -6455, -16092, 2210, -1159, -275, -4154, -25388, -25400, -25391, -25405, -25395, -25398, -25349, -25400, -25397, -25405, 7407, -7278, 7039, 4902, -15522, 7718, -25388, -25400, -25391, -25405, -25395, -25398, -25363, -25408, 6370, 29341, 21744, 16845, 547, -18944, -30182, -16772, -22638, 20198, 20141, -20653, 22529, -16602, -19302, -17269, -18919, -30309, 23910, -25491, 20746, 17500, -32639, -21375, -30003, -30159, 21859, -24251, -28921, -22289, 22582, -29504, 16951, -19898, 22883, -11493, -11504, -11497, -11433, -11500, -11507, -11433, -11511, -11499, -11508, -11490, -11504, -11497, -11433, -11510, -11520, -11510, -11507, -11492, -11500, -11405, -11439, -11440, 24545, 16466, -31952, 7271, 14131, 14095, 14102, 14084, 14090, 14093, 14127, 14092, 14084, 14133, 14090, 14086, 14100, 14086, 14097};

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public C24132 f34331;

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public String f34332;

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public C23582 f34333;

    @Override // l.AbstractActivityC17204
    /* JADX INFO: renamed from: ᩶ */
    public final String mo122() {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        short s2 = 0;
        int i3 = 0;
        short[] sArr2 = null;
        int i4 = 0;
        int i5 = -1619306462;
        int i6 = C1080.f3865;
        int i7 = AbstractC0116.f1064;
        int iM3169 = C0773.m3169("᩺۬") ^ i6;
        int i8 = ((iM3169 ^ i7) * (-25541)) ^ 2111570063;
        int i9 = -1778443051;
        while (true) {
            i5 = ((((i5 ^ i7) * 9681) >> 31) & i8) ^ (iM3169 ^ i9);
            switch (i5) {
                case -2113884661:
                case -142426486:
                    C2310.m7813();
                    if (!C3690.m11987()) {
                        iM3169 = (C0619.m2761("ۜᩴ") + i6) * (-109);
                        i8 = ((iM3169 ^ i7) * (-5999)) ^ 664238870;
                        i9 = 1649656836;
                    } else {
                        iM3169 = C0619.m2761("᩹ۨ") ^ i7;
                        i8 = ((iM3169 ^ i6) * (-7777)) ^ 437130297;
                        i9 = -1505478447;
                    }
                    break;
                case -2052089990:
                case -738175268:
                    return C1321.m4861(sArr2, i4, 15, i3);
                case -1951380197:
                case 1062981532:
                    if (C1826.f6190 <= 0) {
                        iM3169 = (C0619.m2761("ۡ᩻") ^ i7) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i8 = ((iM3169 ^ i6) * 9283) ^ (-140892329);
                        i9 = 1258913425;
                    } else {
                        iM3169 = (C0773.m3169("ۨ֫") ^ i6) * (-23);
                        i8 = ((iM3169 ^ i7) * (-13315)) ^ (-1004416003);
                        i9 = -575727585;
                    }
                    break;
                case -1946002431:
                case -994104905:
                    if (C4282.m13644()) {
                        iM3169 = C0773.m3169("ۢ᩶") ^ i6;
                        i8 = ((iM3169 ^ i7) * (-17143)) ^ 166980504;
                        i9 = -2008334579;
                    } else {
                        iM3169 = (C0619.m2761("ۜᩴ") + i6) * (-109);
                        i8 = ((iM3169 ^ i7) * (-5999)) ^ 664238870;
                        i9 = 1649656836;
                    }
                    break;
                case -1805235908:
                case 388969698:
                    if (C0269.m1775() <= 0) {
                        iM3169 = C0619.m2761("᩹ۨ") ^ i7;
                        i8 = ((iM3169 ^ i6) * (-7777)) ^ 437130297;
                        i9 = -1505478447;
                    } else {
                        iM3169 = C0619.m2761("ۜۢ") ^ i6;
                        i8 = ((iM3169 ^ i7) * 8651) ^ (-928621211);
                        i9 = 202915829;
                    }
                    break;
                case -1724214913:
                case 1157849525:
                    i3 = 14179;
                    iM3169 = C0619.m2761("ᩳۚ") ^ i7;
                    i8 = ((iM3169 ^ i6) * 20745) ^ (-481600172);
                    i9 = -68379810;
                    break;
                case -1720709201:
                case -288007845:
                    i3 = 46389;
                    iM3169 = C0619.m2761("ᩳۚ") ^ i7;
                    i8 = ((iM3169 ^ i6) * 20745) ^ (-481600172);
                    i9 = -68379810;
                    break;
                case -1571160350:
                case 1868798430:
                    C2485.m8357();
                    AbstractC3624.m11755();
                    iM3169 = C0619.m2761("ܿۜ") ^ i6;
                    i8 = ((iM3169 ^ i7) * 15795) ^ 1231409685;
                    i9 = -165284142;
                    break;
                case -1529583752:
                case -679562597:
                    if (C1783.f6087 <= 0) {
                        iM3169 = (C0619.m2761("ۡ᩻") ^ i7) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i8 = ((iM3169 ^ i6) * 9283) ^ (-140892329);
                        i9 = 1258913425;
                    } else {
                        iM3169 = (C0619.m2761("ۧۙ") + i7) * 43;
                        i8 = ((iM3169 ^ i6) * (-7971)) ^ (-193095780);
                        i9 = 1029433819;
                    }
                    break;
                case -1383693426:
                case 640582182:
                    if (C0487.m2356() >= 0) {
                        iM3169 = C0619.m2761("᩹ۨ") ^ i7;
                        i8 = ((iM3169 ^ i6) * (-7777)) ^ 437130297;
                        i9 = -1505478447;
                    } else {
                        iM3169 = C0619.m2761("ܿۜ") ^ i6;
                        i8 = ((iM3169 ^ i7) * 15795) ^ 1231409685;
                        i9 = -165284142;
                    }
                    break;
                case -1299057012:
                case -841843110:
                    i2 = 64561225 + i;
                    if (C3033.f9831 >= 0) {
                        iM3169 = C0619.m2761("ܿۜ") ^ i6;
                        i8 = ((iM3169 ^ i7) * 15795) ^ 1231409685;
                        i9 = -165284142;
                    } else {
                        iM3169 = C0619.m2761("ۜۘ") ^ i6;
                        i8 = ((iM3169 ^ i7) * 28589) ^ (-800904766);
                        i9 = 814954534;
                    }
                    break;
                case -1188080972:
                case -175954505:
                    if (i2 - (s * s2) >= 0) {
                        iM3169 = C0773.m3169("۬۫") ^ i7;
                        i8 = ((iM3169 ^ i6) * (-12227)) ^ 1974855925;
                        i9 = 1092436342;
                    } else {
                        iM3169 = C0773.m3169("᩶ۜ") ^ i6;
                        i8 = ((iM3169 ^ i7) * (-24437)) ^ 1984559890;
                        i9 = 900740245;
                    }
                    break;
                case -388128678:
                case -959451:
                    sArr2 = f34330;
                    i4 = 135;
                    if (C2287.f7432 >= 0) {
                        iM3169 = (C0619.m2761("ۜᩴ") + i6) * (-109);
                        i8 = ((iM3169 ^ i7) * (-5999)) ^ 664238870;
                        i9 = 1649656836;
                    } else {
                        iM3169 = C0773.m3169("ۤ᩺") ^ i7;
                        i8 = ((iM3169 ^ i6) * (-17879)) ^ (-1325576140);
                        i9 = -803316874;
                    }
                    break;
                case -336218702:
                case 112443256:
                    s2 = 16070;
                    if (C1519.f5300 >= 0) {
                        iM3169 = C0619.m2761("ܿۜ") ^ i6;
                        i8 = ((iM3169 ^ i7) * 15795) ^ 1231409685;
                        i9 = -165284142;
                    } else {
                        iM3169 = (C0773.m3169("ۡۗ") ^ i6) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i8 = ((iM3169 ^ i7) * (-25511)) ^ (-1916842459);
                        i9 = 183716510;
                    }
                    break;
                case -145426940:
                case 350651502:
                    if (C2375.m8065() <= 0) {
                        iM3169 = C0619.m2761("᩸ۗ") ^ i6;
                        i8 = ((iM3169 ^ i7) * (-19129)) ^ 1136245669;
                        i9 = 1994649145;
                    } else {
                        iM3169 = C0619.m2761("᩹ۨ") ^ i7;
                        i8 = ((iM3169 ^ i6) * (-7777)) ^ 437130297;
                        i9 = -1505478447;
                    }
                    break;
                case 262601730:
                case 1318744463:
                    sArr = f34330;
                    if (C3448.m11248() != 0) {
                        iM3169 = C0619.m2761("᩸ۗ") ^ i6;
                        i8 = ((iM3169 ^ i7) * (-19129)) ^ 1136245669;
                        i9 = 1994649145;
                    } else {
                        iM3169 = C0773.m3169("ܳ۫") ^ i7;
                        i8 = ((iM3169 ^ i6) * 30497) ^ 245090379;
                        i9 = 994432056;
                    }
                    break;
                case 350701784:
                case 2046016334:
                    s = sArr[c];
                    i = s * s;
                    if (C0487.f2131 <= 0) {
                        iM3169 = (C0619.m2761("ۡ᩻") ^ i7) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i8 = ((iM3169 ^ i6) * 9283) ^ (-140892329);
                        i9 = 1258913425;
                    } else {
                        iM3169 = (i7 - C0773.m3169("ᩳܺ")) * 57;
                        i8 = ((iM3169 ^ i6) * 26317) ^ 1471845399;
                        i9 = 670838135;
                    }
                    break;
                case 999458089:
                case 1395492401:
                    c = 134;
                    if (C1080.f3865 >= 0) {
                        iM3169 = C0619.m2761("ܿۜ") ^ i6;
                        i8 = ((iM3169 ^ i7) * 15795) ^ 1231409685;
                        i9 = -165284142;
                    } else {
                        iM3169 = C0619.m2761("ܽۧ") ^ i7;
                        i8 = ((iM3169 ^ i6) * 19787) ^ (-902323876);
                        i9 = 284774958;
                    }
                    break;
                default:
                    RunnableC0334.m2063();
                    C0487.m2356();
                    return null;
            }
        }
    }

    @Override // l.AbstractActivityC17204, l.ActivityC7405, l.ActivityC3409, l.ActivityC5577, l.ActivityC8866, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int iM3169;
        int i;
        short[] sArr;
        int i2;
        int iM2761;
        int i3;
        int i4;
        int i5;
        int i6;
        View view;
        C16390 c16390;
        View.OnClickListener onClickListener;
        View view2;
        C16390 c16391;
        View.OnClickListener onClickListener2;
        short[] sArr2;
        int i7;
        int i8;
        C16390 c16392;
        int i9;
        int iM2762;
        int i10;
        int iM2763;
        int i11;
        int i12;
        short[] sArr3;
        final ActivityC10841 activityC10841 = this;
        int i13 = 85334592;
        int i14 = C2375.f7641;
        int i15 = C1783.f6087;
        int iM2764 = (C0619.m2761("ۜ᩶") ^ i14) * (-83);
        int i16 = ((iM2764 ^ i15) * (-4341)) ^ 1581580777;
        int i17 = iM2764 ^ (-1354634620);
        C16390 c16393 = null;
        View viewM5518 = null;
        C24132 c24132 = null;
        Intent intentM8359 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        int i18 = 0;
        boolean z = false;
        int i19 = 0;
        int i20 = 0;
        int iM2765 = 0;
        short s = 0;
        int i21 = 0;
        int iM31610 = 0;
        C16390 c16394 = null;
        int iM31611 = 0;
        int i22 = 0;
        int i23 = 0;
        View.OnClickListener onClickListener3 = null;
        C7068 onBackPressedDispatcher = null;
        C24132 c24133 = null;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        while (true) {
            i13 = i17 ^ (i16 & (((i13 ^ i15) * (-25391)) >> 31));
            switch (i13) {
                case -2016311699:
                case 1952145604:
                    activityC10841.f34331.m54025(z);
                    activityC10841.f34331.m53951(z);
                    c24133 = activityC10841.f34331;
                    if (C1542.m5459() < 0) {
                        iM2763 = (C0619.m2761("ܽۡ") ^ i15) * (-5);
                        i11 = ((iM2763 ^ i14) * (-14213)) ^ (-2075337671);
                        i12 = -1300586151;
                        i17 = iM2763 ^ i12;
                        i16 = i11;
                    } else {
                        sArr = sArr5;
                        i2 = i24;
                        view = viewM5518;
                        c16392 = c16394;
                        int iM2766 = C0619.m2761("ۡ۫") ^ i15;
                        int i27 = ((iM2766 ^ i14) * 2647) ^ 52951107;
                        i6 = iM2766 ^ (-1618024549);
                        c16394 = c16392;
                        i16 = i27;
                        viewM5518 = view;
                        i24 = i2;
                        sArr3 = sArr;
                        i17 = i6;
                        sArr5 = sArr3;
                    }
                    break;
                case -1998722161:
                case -1829077483:
                    activityC10841.m27568(C0773.m3168(intentM8359, C0619.m2756(f34330, 65, 8, i19)));
                    break;
                case -1869253883:
                case -1613032115:
                    if (!C3077.m10041()) {
                        sArr = sArr5;
                        i2 = i24;
                        view = viewM5518;
                        c16392 = c16394;
                        int iM2767 = C0619.m2761("ۡ۫") ^ i15;
                        int i28 = ((iM2767 ^ i14) * 2647) ^ 52951107;
                        i6 = iM2767 ^ (-1618024549);
                        c16394 = c16392;
                        i16 = i28;
                        viewM5518 = view;
                        i24 = i2;
                        sArr3 = sArr;
                        i17 = i6;
                        sArr5 = sArr3;
                    } else {
                        i2 = i24;
                        view = viewM5518;
                        c16390 = c16394;
                        onClickListener = onClickListener3;
                        int iM31612 = (i14 - C0773.m3169("ܿܰ")) * 7;
                        i17 = iM31612 ^ (-1851650001);
                        c16394 = c16390;
                        onClickListener3 = onClickListener;
                        i16 = ((iM31612 ^ i15) * 8949) ^ (-20567370);
                        viewM5518 = view;
                        i24 = i2;
                    }
                    break;
                case -1819640837:
                case 667431278:
                    c24132.m54107(z);
                    i26 = 0;
                    activityC10841.f34331.m54096(false);
                    activityC10841.f34331.m53897(10.0f, 0);
                    iM2763 = C0773.m3169("᩵ۘ") ^ i14;
                    i11 = ((iM2763 ^ i15) * 7515) ^ 723356013;
                    i12 = 8835006;
                    i17 = iM2763 ^ i12;
                    i16 = i11;
                    break;
                case -1606794571:
                case 2022610839:
                    sArr = sArr5;
                    i2 = i24;
                    view = viewM5518;
                    c16390 = c16394;
                    onClickListener = onClickListener3;
                    C2878.m9476(activityC10841, iM31610 ^ 2100749466);
                    sArr4 = f34330;
                    i22 = 43;
                    i23 = 3;
                    if (C1321.f4751 < 0) {
                        int iM2768 = C0619.m2761("ۧ᩹") ^ i15;
                        int i29 = ((iM2768 ^ i14) * (-3723)) ^ 904720849;
                        i6 = iM2768 ^ (-1936590354);
                        c16394 = c16390;
                        onClickListener3 = onClickListener;
                        i16 = i29;
                        viewM5518 = view;
                        i24 = i2;
                        sArr3 = sArr;
                        i17 = i6;
                        sArr5 = sArr3;
                    } else {
                        sArr5 = sArr;
                        int iM31613 = (i14 - C0773.m3169("ܿܰ")) * 7;
                        i17 = iM31613 ^ (-1851650001);
                        c16394 = c16390;
                        onClickListener3 = onClickListener;
                        i16 = ((iM31613 ^ i15) * 8949) ^ (-20567370);
                        viewM5518 = view;
                        i24 = i2;
                    }
                    break;
                case -1548900169:
                case 1585154119:
                    C2287.m7745();
                    AbstractC3624.m11755();
                    viewM5518 = viewM5518;
                    onClickListener3 = onClickListener3;
                    sArr4 = sArr4;
                    i22 = i22;
                    iM3169 = (C0619.m2761("ۖۗ") + i14) * 81;
                    i16 = ((iM3169 ^ i15) * (-4311)) ^ 642436675;
                    i = -1873355950;
                    int i30 = iM3169 ^ i;
                    onClickListener3 = onClickListener3;
                    sArr4 = sArr4;
                    i22 = i22;
                    viewM5518 = viewM5518;
                    sArr5 = sArr5;
                    i24 = i24;
                    i17 = i30;
                    activityC10841 = this;
                    break;
                case -1540513795:
                case 1629137150:
                    viewM5518 = C1564.m5518(activityC10841, C0773.m3169(C1343.m4939(sArr5, i24, i25, i19)) ^ 2130415086);
                    i18 = 8;
                    if (C20932.f66974 > 0) {
                        iM2763 = (i14 - C0619.m2761("ۛ۬")) * 89;
                        i11 = ((iM2763 ^ i15) * (-15963)) ^ 336266808;
                        i12 = 1464854537;
                        i17 = iM2763 ^ i12;
                        i16 = i11;
                    } else {
                        sArr = sArr5;
                        i2 = i24;
                        view2 = viewM5518;
                        c16391 = c16393;
                        onClickListener2 = onClickListener3;
                        sArr2 = sArr4;
                        i7 = i22;
                        i8 = i23;
                        int iM2769 = (C0619.m2761("۬۫") ^ i15) * 93;
                        c16393 = c16391;
                        i3 = ((iM2769 ^ i14) * 8405) ^ (-1992190172);
                        i5 = iM2769 ^ 1706092224;
                        sArr4 = sArr2;
                        i22 = i7;
                        i23 = i8;
                        viewM5518 = view2;
                        onClickListener3 = onClickListener2;
                        i24 = i2;
                        sArr3 = sArr;
                        i17 = i5;
                        i16 = i3;
                        sArr5 = sArr3;
                    }
                    break;
                case -1381002910:
                case 482369135:
                    if (!C0619.m2763()) {
                        i2 = i24;
                        view = viewM5518;
                        c16390 = c16394;
                        onClickListener = onClickListener3;
                        int iM31614 = (i14 - C0773.m3169("ܿܰ")) * 7;
                        i17 = iM31614 ^ (-1851650001);
                        c16394 = c16390;
                        onClickListener3 = onClickListener;
                        i16 = ((iM31614 ^ i15) * 8949) ^ (-20567370);
                        viewM5518 = view;
                        i24 = i2;
                    } else {
                        sArr = sArr5;
                        i2 = i24;
                        view2 = viewM5518;
                        c16391 = c16393;
                        onClickListener2 = onClickListener3;
                        sArr2 = sArr4;
                        i7 = i22;
                        i8 = i23;
                        int iM27610 = (C0619.m2761("۬۫") ^ i15) * 93;
                        c16393 = c16391;
                        i3 = ((iM27610 ^ i14) * 8405) ^ (-1992190172);
                        i5 = iM27610 ^ 1706092224;
                        sArr4 = sArr2;
                        i22 = i7;
                        i23 = i8;
                        viewM5518 = view2;
                        onClickListener3 = onClickListener2;
                        i24 = i2;
                        sArr3 = sArr;
                        i17 = i5;
                        i16 = i3;
                        sArr5 = sArr3;
                    }
                    break;
                case -1264839581:
                case -388478671:
                    sArr = sArr5;
                    short s2 = f34330[39];
                    int i31 = s2 + 13540;
                    int iM27611 = (C0619.m2761("ᩴۜ") + i14) * (-67);
                    s = s2;
                    int i32 = ((iM27611 ^ i15) * (-28903)) ^ (-994600147);
                    i6 = iM27611 ^ 1125247265;
                    i21 = i31;
                    onClickListener3 = onClickListener3;
                    sArr4 = sArr4;
                    i22 = i22;
                    viewM5518 = viewM5518;
                    i24 = i24;
                    i16 = i32;
                    activityC10841 = this;
                    sArr3 = sArr;
                    i17 = i6;
                    sArr5 = sArr3;
                    break;
                case -1119553009:
                case -161825855:
                    C13473.m33140(viewM5518, i18);
                    view = viewM5518;
                    iM2765 = C0619.m2761(C3077.m10047(f34330, 62, 3, i19));
                    iM2762 = (i15 - C0773.m3169("᩶ۛ")) * (-25);
                    i9 = ((iM2762 ^ i14) * (-18399)) ^ 407944574;
                    i10 = -565722975;
                    i17 = iM2762 ^ i10;
                    i16 = i9;
                    viewM5518 = view;
                    break;
                case -962240406:
                case -110165990:
                    sArr = sArr5;
                    i2 = i24;
                    view2 = viewM5518;
                    c16391 = c16393;
                    onClickListener2 = onClickListener3;
                    sArr2 = sArr4;
                    i7 = i22;
                    int i33 = i23;
                    i8 = i33;
                    C16390 c16395 = (C16390) C1564.m5518(activityC10841, C0619.m2761(C20932.m47853(sArr2, i7, i33, i19)) ^ 2128445241);
                    activityC10841.f56046 = c16395;
                    if (!RunnableC3646.f12471) {
                        c16393 = c16391;
                        int iM27612 = C0619.m2761("۫᩸") ^ i14;
                        c16394 = c16395;
                        i16 = ((iM27612 ^ i15) * 7101) ^ (-189065672);
                        i6 = iM27612 ^ (-1898895857);
                        sArr4 = sArr2;
                        i22 = i7;
                        i23 = i8;
                        viewM5518 = view2;
                        onClickListener3 = onClickListener2;
                        i24 = i2;
                        sArr3 = sArr;
                        i17 = i6;
                        sArr5 = sArr3;
                    } else {
                        c16394 = c16395;
                        int iM27613 = (C0619.m2761("۬۫") ^ i15) * 93;
                        c16393 = c16391;
                        i3 = ((iM27613 ^ i14) * 8405) ^ (-1992190172);
                        i5 = iM27613 ^ 1706092224;
                        sArr4 = sArr2;
                        i22 = i7;
                        i23 = i8;
                        viewM5518 = view2;
                        onClickListener3 = onClickListener2;
                        i24 = i2;
                        sArr3 = sArr;
                        i17 = i5;
                        i16 = i3;
                        sArr5 = sArr3;
                    }
                    break;
                case -899393562:
                case 527805750:
                    C2878.m9476(activityC10841, iM2765 ^ 2100616527);
                    c24132 = activityC10841.f34331;
                    z = true;
                    if (C13473.f42873 == 0) {
                        iM2763 = C0619.m2761("۬ۗ") ^ i14;
                        i11 = ((iM2763 ^ i15) * (-29567)) ^ 693176433;
                        i12 = 1393981564;
                        i17 = iM2763 ^ i12;
                        i16 = i11;
                    } else {
                        sArr = sArr5;
                        i2 = i24;
                        view2 = viewM5518;
                        c16391 = c16393;
                        onClickListener2 = onClickListener3;
                        sArr2 = sArr4;
                        i7 = i22;
                        i8 = i23;
                        int iM27614 = (C0619.m2761("۬۫") ^ i15) * 93;
                        c16393 = c16391;
                        i3 = ((iM27614 ^ i14) * 8405) ^ (-1992190172);
                        i5 = iM27614 ^ 1706092224;
                        sArr4 = sArr2;
                        i22 = i7;
                        i23 = i8;
                        viewM5518 = view2;
                        onClickListener3 = onClickListener2;
                        i24 = i2;
                        sArr3 = sArr;
                        i17 = i5;
                        i16 = i3;
                        sArr5 = sArr3;
                    }
                    break;
                case -709209529:
                case 1350322967:
                    if (!RunnableC1848.f6235) {
                        i2 = i24;
                        view = viewM5518;
                        c16390 = c16394;
                        onClickListener = onClickListener3;
                        int iM31615 = (i14 - C0773.m3169("ܿܰ")) * 7;
                        i17 = iM31615 ^ (-1851650001);
                        c16394 = c16390;
                        onClickListener3 = onClickListener;
                        i16 = ((iM31615 ^ i15) * 8949) ^ (-20567370);
                        viewM5518 = view;
                        i24 = i2;
                    } else {
                        viewM5518 = viewM5518;
                        onClickListener3 = onClickListener3;
                        sArr4 = sArr4;
                        i22 = i22;
                        iM3169 = (C0619.m2761("ۖۗ") + i14) * 81;
                        i16 = ((iM3169 ^ i15) * (-4311)) ^ 642436675;
                        i = -1873355950;
                        int i34 = iM3169 ^ i;
                        onClickListener3 = onClickListener3;
                        sArr4 = sArr4;
                        i22 = i22;
                        viewM5518 = viewM5518;
                        sArr5 = sArr5;
                        i24 = i24;
                        i17 = i34;
                        activityC10841 = this;
                    }
                    break;
                case -276251909:
                case 2016422536:
                    viewM5518 = viewM5518;
                    activityC10841.f34331 = (C24132) C2878.m9476(activityC10841, iM31611 ^ i20);
                    if (RunnableC0334.f1808 > 0) {
                        sArr = sArr5;
                        i2 = i24;
                        activityC10841.f34333 = new C23582(activityC10841, activityC10841.f34331, C1146.m4222(f34330, 49, 10, i19), new C19403(3, activityC10841));
                        onBackPressedDispatcher = getOnBackPressedDispatcher();
                        if (C2023.f6737) {
                            iM2761 = (C0619.m2761("ۗۗ") + i14) * (-53);
                            i3 = ((iM2761 ^ i15) * (-10189)) ^ 827187730;
                            i4 = 1611817969;
                        } else {
                            iM2761 = C0619.m2761("ܳ᩻") ^ i15;
                            i3 = ((iM2761 ^ i14) * (-30581)) ^ (-1256330576);
                            i4 = -1269835194;
                        }
                        i5 = iM2761 ^ i4;
                        viewM5518 = viewM5518;
                        i24 = i2;
                        sArr3 = sArr;
                        i17 = i5;
                        i16 = i3;
                        sArr5 = sArr3;
                    } else {
                        onClickListener3 = onClickListener3;
                        sArr4 = sArr4;
                        i22 = i22;
                        iM3169 = (C0619.m2761("ۖۗ") + i14) * 81;
                        i16 = ((iM3169 ^ i15) * (-4311)) ^ 642436675;
                        i = -1873355950;
                        int i35 = iM3169 ^ i;
                        onClickListener3 = onClickListener3;
                        sArr4 = sArr4;
                        i22 = i22;
                        viewM5518 = viewM5518;
                        sArr5 = sArr5;
                        i24 = i24;
                        i17 = i35;
                        activityC10841 = this;
                    }
                    break;
                case -99663205:
                case 746677241:
                    sArr = sArr5;
                    i2 = i24;
                    view = viewM5518;
                    c16392 = c16394;
                    C11235.m28312(activityC10841, c16392);
                    AbstractC3624.m11759(this);
                    C16390 c16396 = activityC10841.f56046;
                    View.OnClickListener onClickListener4 = new View.OnClickListener() { // from class: l.ۜ᩵֫
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            int i36 = 1362781678;
                            int i37 = C2419.f7754;
                            int i38 = C1542.f5343;
                            int iM31616 = C0773.m3169("۫ۨ") ^ i38;
                            int i39 = ((iM31616 ^ i37) * (-17025)) ^ 1925007511;
                            int i40 = -479171976;
                            while (true) {
                                i36 = ((((i36 ^ i37) * (-17449)) >> 31) & i39) ^ (iM31616 ^ i40);
                                switch (i36) {
                                    case -2011295665:
                                    case -1656359459:
                                        if (RunnableC3055.f9898 >= 0) {
                                            iM31616 = C0619.m2761("ۡۖ") ^ i38;
                                            i39 = ((iM31616 ^ i37) * (-6125)) ^ (-2122380651);
                                            i40 = -1378079666;
                                        } else {
                                            iM31616 = (C0619.m2761("ۢۚ") ^ i38) * 21;
                                            i39 = ((iM31616 ^ i37) * (-13177)) ^ 188479798;
                                            i40 = -1429489313;
                                        }
                                        break;
                                    case -1988661815:
                                    case 756640674:
                                        if (C23916.f77426 <= 0) {
                                            iM31616 = C0619.m2761("ۙᩴ") ^ i37;
                                            i39 = ((iM31616 ^ i38) * (-32527)) ^ (-355327192);
                                            i40 = -561427180;
                                        } else {
                                            iM31616 = (i37 - C0773.m3169("ۚܽ")) * (-65);
                                            i39 = ((iM31616 ^ i38) * 30253) ^ 410562752;
                                            i40 = -354626194;
                                        }
                                        break;
                                    case -1811490050:
                                    case 1174526132:
                                        int i41 = ActivityC10841.f34329;
                                        if (C4238.f15451 >= 0) {
                                            iM31616 = C0619.m2761("ۡۖ") ^ i38;
                                            i39 = ((iM31616 ^ i37) * (-6125)) ^ (-2122380651);
                                            i40 = -1378079666;
                                        } else {
                                            iM31616 = (C0619.m2761("ۙ᩺") + i37) * (-113);
                                            i39 = ((iM31616 ^ i38) * 20187) ^ 1738229844;
                                            i40 = -222224597;
                                        }
                                        break;
                                    case -1441695991:
                                    case 372101147:
                                        if (C3492.f12043 <= 0) {
                                            iM31616 = C0773.m3169("᩹ܳ") ^ i37;
                                            i39 = ((iM31616 ^ i38) * (-15411)) ^ (-1568540094);
                                            i40 = 1279876253;
                                        } else {
                                            iM31616 = C0619.m2761("ܿ֡") ^ i37;
                                            i39 = ((iM31616 ^ i38) * 19439) ^ (-284578738);
                                            i40 = 6895495;
                                        }
                                        break;
                                    case -1371736837:
                                    case 1582799247:
                                        if (C3998.f13671 != 0) {
                                            iM31616 = (i38 - C0619.m2761("ۖ᩵")) * (-19);
                                            i39 = ((iM31616 ^ i37) * (-14355)) ^ 2065256013;
                                            i40 = -954260728;
                                        } else {
                                            iM31616 = (C0619.m2761("᩸ܳ") ^ i37) * (-69);
                                            i39 = ((iM31616 ^ i38) * 23621) ^ (-1509398244);
                                            i40 = 1370047686;
                                        }
                                        break;
                                    case -1318523847:
                                    case -538983162:
                                        if (C0950.f3488 >= 0) {
                                            iM31616 = C0619.m2761("ۙᩴ") ^ i37;
                                            i39 = ((iM31616 ^ i38) * (-32527)) ^ (-355327192);
                                            i40 = -561427180;
                                        } else {
                                            iM31616 = (C0619.m2761("᩷᩶") + i37) * (-71);
                                            i39 = ((iM31616 ^ i38) * 27575) ^ (-2000044822);
                                            i40 = 966190129;
                                        }
                                        break;
                                    case -1290570441:
                                    case -461953178:
                                        if (C2419.f7754 >= 0) {
                                            iM31616 = C0619.m2761("ۡۖ") ^ i38;
                                            i39 = ((iM31616 ^ i37) * (-6125)) ^ (-2122380651);
                                            i40 = -1378079666;
                                        } else {
                                            iM31616 = (C0773.m3169("᩸ᩳ") ^ i38) * 9;
                                            i39 = ((iM31616 ^ i37) * (-24727)) ^ 1555933234;
                                            i40 = 1269350537;
                                        }
                                        break;
                                    case -1002592563:
                                    case -374598205:
                                        if (C3033.f9831 < 0) {
                                            iM31616 = (C0619.m2761("ᩳ᩺") ^ i38) * (-107);
                                            i39 = ((iM31616 ^ i37) * (-363)) ^ (-1670574164);
                                            i40 = -1175134229;
                                        } else {
                                            iM31616 = C0619.m2761("ۙᩴ") ^ i37;
                                            i39 = ((iM31616 ^ i38) * (-32527)) ^ (-355327192);
                                            i40 = -561427180;
                                        }
                                        break;
                                    case -848944796:
                                    case -96175432:
                                        if (C3033.f9831 >= 0) {
                                            iM31616 = C0619.m2761("ۙᩴ") ^ i37;
                                            i39 = ((iM31616 ^ i38) * (-32527)) ^ (-355327192);
                                            i40 = -561427180;
                                        } else {
                                            iM31616 = (C0619.m2761("ܿۤ") ^ i38) * 53;
                                            i39 = ((iM31616 ^ i37) * (-15109)) ^ 520080070;
                                            i40 = -1200990156;
                                        }
                                        break;
                                    case -687239285:
                                    case 1255100097:
                                        if (C2702.f8586 > 0) {
                                            iM31616 = C0773.m3169("᩹ܳ") ^ i37;
                                            i39 = ((iM31616 ^ i38) * (-15411)) ^ (-1568540094);
                                            i40 = 1279876253;
                                        } else {
                                            iM31616 = (C0619.m2761("ᩳ᩺") ^ i38) * (-107);
                                            i39 = ((iM31616 ^ i37) * (-363)) ^ (-1670574164);
                                            i40 = -1175134229;
                                        }
                                        break;
                                    case -457363337:
                                    case 1244370603:
                                        C3690.m11987();
                                        if (C11235.m28309() != 0) {
                                            iM31616 = (i38 - C0619.m2761("ۖ᩵")) * (-19);
                                            i39 = ((iM31616 ^ i37) * (-14355)) ^ 2065256013;
                                            i40 = -954260728;
                                        } else {
                                            iM31616 = (C0619.m2761("ᩳ᩺") ^ i38) * (-107);
                                            i39 = ((iM31616 ^ i37) * (-363)) ^ (-1670574164);
                                            i40 = -1175134229;
                                        }
                                        break;
                                    case -365274804:
                                    case 102712785:
                                        C0487.m2356();
                                        iM31616 = C0619.m2761("ۙᩴ") ^ i37;
                                        i39 = ((iM31616 ^ i38) * (-32527)) ^ (-355327192);
                                        i40 = -561427180;
                                        break;
                                    case -267978135:
                                    case 813380046:
                                        C0950.m3790(this.f24195);
                                        break;
                                    case -215688384:
                                    case 1459511845:
                                        C2485.m8357();
                                        break;
                                    case 474519248:
                                    case 1212503473:
                                        if (C23916.f77426 <= 0) {
                                            iM31616 = (C0619.m2761("ᩳ᩺") ^ i38) * (-107);
                                            i39 = ((iM31616 ^ i37) * (-363)) ^ (-1670574164);
                                            i40 = -1175134229;
                                        } else {
                                            iM31616 = C0773.m3169("֡۬") ^ i38;
                                            i39 = ((iM31616 ^ i37) * (-12017)) ^ (-148506807);
                                            i40 = 257994227;
                                        }
                                        break;
                                    default:
                                        if (C0269.f1558 <= 0) {
                                            iM31616 = (i38 - C0619.m2761("ۖ᩵")) * (-19);
                                            i39 = ((iM31616 ^ i37) * (-14355)) ^ 2065256013;
                                            i40 = -954260728;
                                        } else {
                                            iM31616 = C0773.m3169("ܿܽ") ^ i38;
                                            i39 = ((iM31616 ^ i37) * (-1419)) ^ (-2127372540);
                                            i40 = -2079914346;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    };
                    if (!C2023.f6737) {
                        int iM27615 = C0619.m2761("᩺ᩳ") ^ i15;
                        c16394 = c16392;
                        c16393 = c16396;
                        onClickListener3 = onClickListener4;
                        i16 = ((iM27615 ^ i14) * 24819) ^ 319883823;
                        sArr5 = sArr;
                        i24 = i2;
                        i17 = iM27615 ^ 957113890;
                        viewM5518 = view;
                    } else {
                        c16393 = c16396;
                        onClickListener3 = onClickListener4;
                        int iM27616 = C0619.m2761("ۡ۫") ^ i15;
                        int i210 = ((iM27616 ^ i14) * 2647) ^ 52951107;
                        i6 = iM27616 ^ (-1618024549);
                        c16394 = c16392;
                        i16 = i210;
                        viewM5518 = view;
                        i24 = i2;
                        sArr3 = sArr;
                        i17 = i6;
                        sArr5 = sArr3;
                    }
                    break;
                case -25474536:
                case 1014716805:
                    view = viewM5518;
                    C4876 c4876 = new C4876(activityC10841);
                    C3734.m12155(onBackPressedDispatcher);
                    onBackPressedDispatcher.m19400(c4876);
                    sArr5 = f34330;
                    i24 = 59;
                    i25 = 3;
                    if (C11235.f35427 < 0) {
                        iM2762 = C0619.m2761("᩵ۚ") ^ i15;
                        i9 = ((iM2762 ^ i14) * (-19851)) ^ 1131316753;
                        i10 = -300233458;
                        i17 = iM2762 ^ i10;
                        i16 = i9;
                        viewM5518 = view;
                    } else {
                        c16390 = c16394;
                        onClickListener = onClickListener3;
                        i2 = 59;
                        int iM31616 = (i14 - C0773.m3169("ܿܰ")) * 7;
                        i17 = iM31616 ^ (-1851650001);
                        c16394 = c16390;
                        onClickListener3 = onClickListener;
                        i16 = ((iM31616 ^ i15) * 8949) ^ (-20567370);
                        viewM5518 = view;
                        i24 = i2;
                    }
                    break;
                case 33057337:
                case 268877612:
                    i19 = 40100;
                    iM3169 = (i14 - C0773.m3169("ܳۛ")) * (-35);
                    i16 = ((iM3169 ^ i15) * 23385) ^ 1091745804;
                    i = 844176991;
                    int i36 = iM3169 ^ i;
                    onClickListener3 = onClickListener3;
                    sArr4 = sArr4;
                    i22 = i22;
                    viewM5518 = viewM5518;
                    sArr5 = sArr5;
                    i24 = i24;
                    i17 = i36;
                    activityC10841 = this;
                    break;
                case 353297351:
                case 1793387016:
                    C0950.m3785();
                    break;
                case 900514659:
                case 1048811487:
                    c24133.mo52291(i26);
                    activityC10841.f34331.m53912(new C22030());
                    intentM8359 = C2485.m8359(this);
                    iM2763 = C0619.m2761("֫᩸") ^ i15;
                    i11 = ((iM2763 ^ i14) * 11563) ^ (-1489418324);
                    i12 = -1024898988;
                    i17 = iM2763 ^ i12;
                    i16 = i11;
                    break;
                case 937441490:
                case 2120997405:
                    sArr5 = sArr5;
                    i24 = i24;
                    viewM5518 = viewM5518;
                    onClickListener3 = onClickListener3;
                    sArr4 = sArr4;
                    i22 = i22;
                    super.onCreate(bundle);
                    m40415();
                    iM31610 = C0773.m3169(C17202.m40377(f34330, 40, 3, i19));
                    if (RunnableC0334.f1808 <= 0) {
                        iM3169 = (C0619.m2761("ۖۗ") + i14) * 81;
                        i16 = ((iM3169 ^ i15) * (-4311)) ^ 642436675;
                        i = -1873355950;
                    } else {
                        iM3169 = C0773.m3169("۬ۤ") ^ i14;
                        i16 = ((iM3169 ^ i15) * 24463) ^ (-542062629);
                        i = 206626454;
                    }
                    int i37 = iM3169 ^ i;
                    onClickListener3 = onClickListener3;
                    sArr4 = sArr4;
                    i22 = i22;
                    viewM5518 = viewM5518;
                    sArr5 = sArr5;
                    i24 = i24;
                    i17 = i37;
                    activityC10841 = this;
                    break;
                case 988981248:
                case 1933263085:
                    short[] sArr6 = sArr5;
                    int i38 = i24;
                    view = viewM5518;
                    C16390 c16397 = c16393;
                    View.OnClickListener onClickListener5 = onClickListener3;
                    C3099.m10093(c16397, onClickListener5);
                    iM31611 = C0773.m3169(C17202.m40377(f34330, 46, 3, i19));
                    i20 = 2123906899;
                    int iM27617 = (C0619.m2761("ܺܳ") ^ i14) * (-39);
                    i9 = ((iM27617 ^ i15) * 23823) ^ 216727769;
                    c16393 = c16397;
                    onClickListener3 = onClickListener5;
                    sArr5 = sArr6;
                    i24 = i38;
                    i17 = iM27617 ^ 1244421064;
                    i16 = i9;
                    viewM5518 = view;
                    break;
                case 1148415896:
                case 1812374687:
                    i19 = 9540;
                    iM3169 = (i14 - C0773.m3169("ܳۛ")) * (-35);
                    i16 = ((iM3169 ^ i15) * 23385) ^ 1091745804;
                    i = 844176991;
                    int i39 = iM3169 ^ i;
                    onClickListener3 = onClickListener3;
                    sArr4 = sArr4;
                    i22 = i22;
                    viewM5518 = viewM5518;
                    sArr5 = sArr5;
                    i24 = i24;
                    i17 = i39;
                    activityC10841 = this;
                    break;
                default:
                    sArr5 = sArr5;
                    i24 = i24;
                    viewM5518 = viewM5518;
                    onClickListener3 = onClickListener3;
                    sArr4 = sArr4;
                    i22 = i22;
                    if ((54160 * s) - (i21 * i21) > 0) {
                        iM3169 = C0773.m3169("֨᩻") ^ i15;
                        i16 = ((iM3169 ^ i14) * (-15261)) ^ 1480156307;
                        i = 640812218;
                    } else {
                        iM3169 = C0619.m2761("֨ۙ") ^ i15;
                        i16 = ((iM3169 ^ i14) * 27879) ^ (-1935649433);
                        i = 1271707134;
                    }
                    int i310 = iM3169 ^ i;
                    onClickListener3 = onClickListener3;
                    sArr4 = sArr4;
                    i22 = i22;
                    viewM5518 = viewM5518;
                    sArr5 = sArr5;
                    i24 = i24;
                    i17 = i310;
                    activityC10841 = this;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m27565(ActivityC10841 activityC10841) {
        C24132 c24132 = null;
        String str = null;
        C24132 c24133 = null;
        int i = 1884757610;
        int i2 = RunnableC0334.f1808;
        int i3 = C1519.f5300;
        int iM2761 = (C0619.m2761("᩺ۤ") ^ i3) * 27;
        int i4 = ((iM2761 ^ i2) * (-641)) ^ (-1558705602);
        int i5 = 1654244780;
        while (true) {
            i = ((((i ^ i2) * 16557) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2074793436:
                case -370532953:
                    if (C3690.f12684 <= 0) {
                        iM2761 = C0773.m3169("ۡۨ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-19855)) ^ 9960380;
                        i5 = 1463952590;
                    } else {
                        iM2761 = (C0619.m2761("᩵ܽ") + i3) * 15;
                        i4 = ((iM2761 ^ i2) * 8607) ^ 460866639;
                        i5 = 976438061;
                    }
                    break;
                case -2029851766:
                case 294104114:
                    C2287.m7745();
                    C2375.m8065();
                    iM2761 = (C0619.m2761("᩵ܽ") + i3) * 15;
                    i4 = ((iM2761 ^ i2) * 8607) ^ 460866639;
                    i5 = 976438061;
                    break;
                case -2009306922:
                case 329907597:
                    C2702.m8876();
                    if (C0269.f1558 > 0) {
                        iM2761 = C0619.m2761("᩹֫") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-5671)) ^ 530213098;
                        i5 = 607873199;
                    } else {
                        iM2761 = (C0619.m2761("᩵ܽ") + i3) * 15;
                        i4 = ((iM2761 ^ i2) * 8607) ^ 460866639;
                        i5 = 976438061;
                    }
                    break;
                case -1857116903:
                case -1786469076:
                    if (C3998.f13671 != 0) {
                        iM2761 = (C0773.m3169("᩵ۨ") ^ i2) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM2761 ^ i3) * (-12617)) ^ (-494995738);
                        i5 = -496193832;
                    } else {
                        iM2761 = C0773.m3169("᩹ᩳ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-19315)) ^ (-1409128864);
                        i5 = -1906665464;
                    }
                    break;
                case -1314990698:
                case 1458477230:
                    c24133.scrollTo(0, 0);
                    break;
                case -1174398910:
                case 157602648:
                    if (AbstractC3624.f12429 <= 0) {
                        iM2761 = C0619.m2761("᩹֫") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-5671)) ^ 530213098;
                        i5 = 607873199;
                    } else {
                        iM2761 = (i2 - C0773.m3169("ۗۗ")) * 75;
                        i4 = ((iM2761 ^ i3) * 9131) ^ (-1068147509);
                        i5 = -2125476899;
                    }
                    break;
                case -811079249:
                case 1946351924:
                    if (C3033.f9831 >= 0) {
                        iM2761 = C0773.m3169("ۡۨ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-19855)) ^ 9960380;
                        i5 = 1463952590;
                    } else {
                        iM2761 = C0773.m3169("۠֡") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-30063)) ^ 373329357;
                        i5 = -693592190;
                    }
                    break;
                case -607244791:
                case 754658527:
                    C0269.m1786(c24132, str);
                    c24133 = activityC10841.f34331;
                    if (C3690.m11987()) {
                        iM2761 = (C0773.m3169("᩵ۨ") ^ i2) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM2761 ^ i3) * (-12617)) ^ (-494995738);
                        i5 = -496193832;
                    } else {
                        iM2761 = (C0619.m2761("ۡ᩻") + i3) * (-93);
                        i4 = ((iM2761 ^ i2) * 3053) ^ (-923354164);
                        i5 = 2133874461;
                    }
                    break;
                case -484983924:
                case 1543458688:
                    c24132 = activityC10841.f34331;
                    if (AbstractC0116.f1064 <= 0) {
                        iM2761 = (C0773.m3169("ܽܶ") ^ i3) * 63;
                        i4 = ((iM2761 ^ i2) * 26715) ^ (-232411800);
                        i5 = -676228563;
                    } else {
                        iM2761 = C0619.m2761("᩸ܶ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 11127) ^ (-1205346392);
                        i5 = -1273182944;
                    }
                    break;
                case -389787631:
                case 581545444:
                    C1343.m4943();
                    break;
                case -254223077:
                case 151009965:
                    C5448.m16276();
                    if (C1519.f5300 >= 0) {
                        iM2761 = (C0773.m3169("ܽܶ") ^ i3) * 63;
                        i4 = ((iM2761 ^ i2) * 26715) ^ (-232411800);
                        i5 = -676228563;
                    } else {
                        iM2761 = C0773.m3169("֨ܰ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-3971)) ^ (-2016070995);
                        i5 = -1606685333;
                    }
                    break;
                case 401567819:
                case 1801547425:
                    str = "";
                    if (C1080.f3865 >= 0) {
                        iM2761 = (C0773.m3169("ܽܶ") ^ i3) * 63;
                        i4 = ((iM2761 ^ i2) * 26715) ^ (-232411800);
                        i5 = -676228563;
                    } else {
                        iM2761 = (C0773.m3169("ۘ֫") + i2) * (-111);
                        i4 = ((iM2761 ^ i3) * (-11245)) ^ (-1292686575);
                        i5 = 1789673419;
                    }
                    break;
                case 492417984:
                case 999710747:
                    if (C1146.f4234 >= 0) {
                        iM2761 = (C0619.m2761("᩵ܽ") + i3) * 15;
                        i4 = ((iM2761 ^ i2) * 8607) ^ 460866639;
                        i5 = 976438061;
                    } else {
                        iM2761 = C0773.m3169("ᩳܳ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-7605)) ^ (-1153051797);
                        i5 = -98882496;
                    }
                    break;
                case 948068781:
                case 1068518616:
                    if (C0773.f2792 <= 0) {
                        iM2761 = C0619.m2761("᩹֫") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-5671)) ^ 530213098;
                        i5 = 607873199;
                    } else {
                        iM2761 = (i3 - C0773.m3169("۫ᩳ")) * 21;
                        i4 = ((iM2761 ^ i2) * (-18737)) ^ 1408076047;
                        i5 = 1209508323;
                    }
                    break;
                case 1361528621:
                case 1476269231:
                    if (C3998.f13671 != 0) {
                        iM2761 = (C0773.m3169("ܽܶ") ^ i3) * 63;
                        i4 = ((iM2761 ^ i2) * 26715) ^ (-232411800);
                        i5 = -676228563;
                    } else {
                        iM2761 = (C0619.m2761("ܶۖ") ^ i3) * (-109);
                        i4 = ((iM2761 ^ i2) * 4573) ^ 252202720;
                        i5 = 1831305679;
                    }
                    break;
                default:
                    C2878.m9491();
                    if (!C2878.f9462) {
                        iM2761 = (C0619.m2761("᩵ܽ") + i3) * 15;
                        i4 = ((iM2761 ^ i2) * 8607) ^ 460866639;
                        i5 = 976438061;
                    } else {
                        iM2761 = (C0773.m3169("᩵ۨ") ^ i2) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM2761 ^ i3) * (-12617)) ^ (-494995738);
                        i5 = -496193832;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x015c A[PHI: r9
      0x015c: PHI (r9v4 int) = (r9v3 int), (r9v2 int), (r9v2 int) binds: [B:43:0x015a, B:15:0x0067, B:13:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x01e0 A[PHI: r3 r5 r10
      0x01e0: PHI (r3v4 java.lang.String) = 
      (r3v2 java.lang.String)
      (r3v2 java.lang.String)
      (r3v3 java.lang.String)
      (r3v2 java.lang.String)
      (r3v2 java.lang.String)
     binds: [B:55:0x01de, B:39:0x0139, B:25:0x00aa, B:13:0x0063, B:10:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x01e0: PHI (r5v4 char) = (r5v3 char), (r5v2 char), (r5v2 char), (r5v2 char), (r5v2 char) binds: [B:55:0x01de, B:39:0x0139, B:25:0x00aa, B:13:0x0063, B:10:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x01e0: PHI (r10v4 short) = (r10v2 short), (r10v3 short), (r10v2 short), (r10v2 short), (r10v2 short) binds: [B:55:0x01de, B:39:0x0139, B:25:0x00aa, B:13:0x0063, B:10:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x0214 A[PHI: r1 r6 r7 r12 r13 r18
      0x0214: PHI (r1v4 android.view.MenuInflater) = 
      (r1v2 android.view.MenuInflater)
      (r1v2 android.view.MenuInflater)
      (r1v3 android.view.MenuInflater)
      (r1v2 android.view.MenuInflater)
      (r1v2 android.view.MenuInflater)
     binds: [B:59:0x0212, B:51:0x01c0, B:29:0x00d1, B:10:0x0058, B:7:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x0214: PHI (r6v4 short) = (r6v2 short), (r6v3 short), (r6v2 short), (r6v2 short), (r6v2 short) binds: [B:59:0x0212, B:51:0x01c0, B:29:0x00d1, B:10:0x0058, B:7:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x0214: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int), (r7v2 int) binds: [B:59:0x0212, B:51:0x01c0, B:29:0x00d1, B:10:0x0058, B:7:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x0214: PHI (r12v4 short[]) = (r12v2 short[]), (r12v2 short[]), (r12v3 short[]), (r12v2 short[]), (r12v2 short[]) binds: [B:59:0x0212, B:51:0x01c0, B:29:0x00d1, B:10:0x0058, B:7:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x0214: PHI (r13v4 int) = (r13v2 int), (r13v2 int), (r13v3 int), (r13v2 int), (r13v2 int) binds: [B:59:0x0212, B:51:0x01c0, B:29:0x00d1, B:10:0x0058, B:7:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x0214: PHI (r18v5 short[]) = (r18v4 short[]), (r18v3 short[]), (r18v3 short[]), (r18v3 short[]), (r18v3 short[]) binds: [B:59:0x0212, B:51:0x01c0, B:29:0x00d1, B:10:0x0058, B:7:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0240 A[PHI: r2
      0x0240: PHI (r2v4 int) = (r2v2 int), (r2v2 int), (r2v7 int) binds: [B:63:0x023e, B:7:0x0052, B:86:0x0240] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        int iM3169;
        int i;
        int i2;
        int i3 = C3492.f12043;
        int i4 = C3448.f11240;
        int iM2761 = (C0619.m2761("ۤۛ") + i4) * 91;
        int i5 = ((iM2761 ^ i3) * 21599) ^ (-1366075978);
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM2761 ^ (-87331097);
        MenuInflater menuInflater = null;
        char c = 0;
        short s = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        short s2 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = -835696826;
        String strM5510 = null;
        int iM31610 = 0;
        while (true) {
            i12 = i6 ^ (i5 & (((i12 ^ i3) * (-3221)) >> 31));
            switch (i12) {
                case -2106359124:
                case 663586807:
                    int i13 = s + s2;
                    if (i9 - (i13 * i13) >= 0) {
                        iM3169 = C0619.m2761("᩺ۖ") ^ i4;
                        i = ((iM3169 ^ i3) * (-18599)) ^ 1594469436;
                        i2 = 575324847;
                    } else {
                        iM3169 = C0619.m2761("۠ۛ") ^ i4;
                        i = ((iM3169 ^ i3) * 11097) ^ 1269146374;
                        i2 = -331090654;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -2007205486:
                case -1326857996:
                    menuInflater = getMenuInflater();
                    sArr2 = f34330;
                    i11 = 74;
                    if (C4282.m13644()) {
                        iM3169 = C0619.m2761("ۘ᩷") ^ i3;
                        i = ((iM3169 ^ i4) * (-27055)) ^ (-669099706);
                        i2 = -556764282;
                    } else {
                        iM3169 = C0619.m2761("ܶ᩷") ^ i4;
                        i = ((iM3169 ^ i3) * 1119) ^ 1658916919;
                        i2 = -899379700;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1993926656:
                case 851000577:
                    menuInflater.inflate(iM31610, menu);
                    return true;
                case -1968217331:
                case 67801727:
                    i10 = 29580;
                    iM3169 = C0619.m2761("֨֫") ^ i3;
                    i = ((iM3169 ^ i4) * 31377) ^ (-603151542);
                    i2 = -1558189762;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1839230279:
                case 1075941766:
                    s2 = 7963;
                    if (C23916.f77426 <= 0) {
                        iM3169 = (C0619.m2761("ۨ᩷") + i3) * (-17);
                        i = ((iM3169 ^ i4) * (-31757)) ^ 818541266;
                        i2 = -1152856144;
                    } else {
                        iM3169 = (C0619.m2761("۟᩸") + i3) * 95;
                        i = ((iM3169 ^ i4) * 11531) ^ 210211859;
                        i2 = 1330678665;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1600758767:
                case -962769114:
                    iM31610 = C0773.m3169(strM5510) ^ 2120187291;
                    if (C3077.f9998) {
                        int iM31611 = (C0773.m3169("ۡۧ") + i4) * (-119);
                        i5 = ((iM31611 ^ i3) * (-27935)) ^ (-114619068);
                        i6 = iM31611 ^ 938198061;
                    } else {
                        iM3169 = C0773.m3169("ۧܰ") ^ i3;
                        i = ((iM3169 ^ i4) * 10933) ^ (-805033479);
                        i2 = 406950521;
                        i6 = iM3169 ^ i2;
                        i5 = i;
                    }
                    break;
                case -1526686502:
                case 1130722227:
                    int i14 = i7 + i8;
                    i9 = i14 + i14;
                    if (AbstractC0641.f2496 >= 0) {
                        iM3169 = C0773.m3169("ܿܰ") ^ i3;
                        i = ((iM3169 ^ i4) * 17189) ^ 1849048583;
                        i2 = 772657657;
                    } else {
                        iM3169 = C0619.m2761("᩸֫") ^ i3;
                        i = ((iM3169 ^ i4) * (-7441)) ^ 737923291;
                        i2 = 1406416764;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1510444002:
                case 196596633:
                    if (C1783.f6087 > 0) {
                        iM3169 = (C0619.m2761("ۨ᩷") + i3) * (-17);
                        i = ((iM3169 ^ i4) * (-31757)) ^ 818541266;
                        i2 = -1152856144;
                    } else {
                        iM3169 = C0619.m2761("ܶ᩷") ^ i4;
                        i = ((iM3169 ^ i3) * 1119) ^ 1658916919;
                        i2 = -899379700;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1417853695:
                case 1041389775:
                    sArr = f34330;
                    if (C2834.m9344() >= 0) {
                        iM3169 = C0619.m2761("ܶ᩷") ^ i4;
                        i = ((iM3169 ^ i3) * 1119) ^ 1658916919;
                        i2 = -899379700;
                    } else {
                        iM3169 = C0773.m3169("ۙۖ") ^ i3;
                        i = ((iM3169 ^ i4) * 28211) ^ (-505138157);
                        i2 = 1898599557;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1365171328:
                case 398938776:
                    C3077.m10041();
                    RunnableC1848.m6360();
                    iM3169 = C0773.m3169("ܿܰ") ^ i3;
                    i = ((iM3169 ^ i4) * 17189) ^ 1849048583;
                    i2 = 772657657;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1070396272:
                case 1039903457:
                    C3077.m10041();
                    return false;
                case -853147184:
                case 691618150:
                    strM5510 = C1564.m5510(sArr2, i11, 3, i10);
                    if (C3690.f12684 <= 0) {
                        iM3169 = (C0619.m2761("ۨ᩷") + i3) * (-17);
                        i = ((iM3169 ^ i4) * (-31757)) ^ 818541266;
                        i2 = -1152856144;
                    } else {
                        iM3169 = (C0619.m2761("᩶᩶") ^ i4) * (-127);
                        i = ((iM3169 ^ i3) * 22083) ^ (-2060438534);
                        i2 = 72151104;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -688247177:
                case 904495337:
                    i8 = 63409369;
                    if (C2375.f7641 <= 0) {
                        iM3169 = (i4 - C0773.m3169("ᩴ֫")) * (-41);
                        i = ((iM3169 ^ i3) * 10827) ^ 2080178110;
                        i2 = -596690460;
                    } else {
                        iM3169 = C0773.m3169("ۗۚ") ^ i4;
                        i = ((iM3169 ^ i3) * (-28385)) ^ (-654750307);
                        i2 = 1296693919;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -512135500:
                case 1170866014:
                    s = sArr[c];
                    i7 = s * s;
                    if (C3779.f12953 <= 0) {
                        iM3169 = C0619.m2761("ܶ᩷") ^ i4;
                        i = ((iM3169 ^ i3) * 1119) ^ 1658916919;
                        i2 = -899379700;
                    } else {
                        iM3169 = C0773.m3169("᩸᩸") ^ i3;
                        i = ((iM3169 ^ i4) * (-5295)) ^ (-764900991);
                        i2 = -988807746;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -345495501:
                case 282738269:
                    if (C1542.f5343 > 0) {
                        iM3169 = C0619.m2761("ܶ᩷") ^ i4;
                        i = ((iM3169 ^ i3) * 1119) ^ 1658916919;
                        i2 = -899379700;
                    } else {
                        iM3169 = C0773.m3169("ۧܰ") ^ i3;
                        i = ((iM3169 ^ i4) * 10933) ^ (-805033479);
                        i2 = 406950521;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 104582820:
                case 1750008744:
                    if (C4282.f15546 <= 0) {
                        iM3169 = C0773.m3169("ۧܰ") ^ i3;
                        i = ((iM3169 ^ i4) * 10933) ^ (-805033479);
                        i2 = 406950521;
                    } else {
                        iM3169 = C0773.m3169("ᩴۜ") ^ i4;
                        i = ((iM3169 ^ i3) * 11167) ^ 1730558743;
                        i2 = -698818943;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 573425835:
                case 727129678:
                    C1564.m5509();
                    if (C2287.m7745() <= 0) {
                        iM3169 = C0773.m3169("ܿܰ") ^ i3;
                        i = ((iM3169 ^ i4) * 17189) ^ 1849048583;
                        i2 = 772657657;
                    } else {
                        iM3169 = (C0619.m2761("ۨ᩷") + i3) * (-17);
                        i = ((iM3169 ^ i4) * (-31757)) ^ 818541266;
                        i2 = -1152856144;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 645018868:
                case 1658590033:
                    c = 'I';
                    if (C3033.m9845() <= 0) {
                        iM3169 = (C0619.m2761("ۨ᩷") + i3) * (-17);
                        i = ((iM3169 ^ i4) * (-31757)) ^ 818541266;
                        i2 = -1152856144;
                    } else {
                        iM3169 = (C0773.m3169("֫֫") + i4) * 9;
                        i = ((iM3169 ^ i3) * 6775) ^ (-344498333);
                        i2 = 1868037480;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                default:
                    i10 = 10064;
                    iM3169 = C0619.m2761("֨֫") ^ i3;
                    i = ((iM3169 ^ i4) * 31377) ^ (-603151542);
                    i2 = -1558189762;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 39841. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m27568(java.lang.String r50) {
        /*
            Method dump skipped, instruction units count: 3984
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ActivityC10841.m27568(java.lang.String):void");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m27569(ActivityC10841 activityC10841) {
        C24132 c24132 = activityC10841.f34331;
        c24132.setScrollY(c24132.m53965());
    }

    /* JADX WARN: Code duplicated, block: B:56:0x01de A[PHI: r2 r3
      0x01de: PHI (r2v5 java.lang.Object) = (r2v2 java.lang.Object), (r2v4 java.lang.Object), (r2v2 java.lang.Object) binds: [B:55:0x01dc, B:27:0x00a0, B:9:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x01de: PHI (r3v4 short[]) = (r3v3 short[]), (r3v2 short[]), (r3v2 short[]) binds: [B:55:0x01dc, B:27:0x00a0, B:9:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x0250  */
    /* JADX WARN: Code duplicated, block: B:80:0x02d3 A[PHI: r4 r5 r6 r7 r8
      0x02d3: PHI (r4v5 short) = (r4v2 short), (r4v2 short), (r4v2 short), (r4v4 short), (r4v2 short) binds: [B:79:0x02d1, B:71:0x0283, B:59:0x020e, B:51:0x01bb, B:47:0x0197] A[DONT_GENERATE, DONT_INLINE]
      0x02d3: PHI (r5v4 short) = (r5v2 short), (r5v2 short), (r5v2 short), (r5v3 short), (r5v2 short) binds: [B:79:0x02d1, B:71:0x0283, B:59:0x020e, B:51:0x01bb, B:47:0x0197] A[DONT_GENERATE, DONT_INLINE]
      0x02d3: PHI (r6v3 int) = (r6v2 int), (r6v2 int), (r6v2 int), (r6v2 int), (r6v5 int) binds: [B:79:0x02d1, B:71:0x0283, B:59:0x020e, B:51:0x01bb, B:47:0x0197] A[DONT_GENERATE, DONT_INLINE]
      0x02d3: PHI (r7v3 int) = (r7v2 int), (r7v2 int), (r7v2 int), (r7v2 int), (r7v4 int) binds: [B:79:0x02d1, B:71:0x0283, B:59:0x020e, B:51:0x01bb, B:47:0x0197] A[DONT_GENERATE, DONT_INLINE]
      0x02d3: PHI (r8v3 int) = (r8v2 int), (r8v2 int), (r8v2 int), (r8v2 int), (r8v4 int) binds: [B:79:0x02d1, B:71:0x0283, B:59:0x020e, B:51:0x01bb, B:47:0x0197] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0065, code lost:
    
        if (l.C3690.f12684 <= 0) goto L9;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void m27566(l.ActivityC10841 r17, java.util.List r18, android.content.DialogInterface r19, int r20) {
        /*
            Method dump skipped, instruction units count: 954
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ActivityC10841.m27566(l.ۤۨ֫, java.util.List, android.content.DialogInterface, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r26v21 */
    /* JADX WARN: Type inference failed for: r26v22 */
    /* JADX WARN: Type inference failed for: r26v26 */
    /* JADX WARN: Type inference failed for: r26v28 */
    /* JADX WARN: Type inference failed for: r26v29 */
    /* JADX WARN: Type inference failed for: r26v30 */
    /* JADX WARN: Type inference failed for: r26v31 */
    /* JADX WARN: Type inference failed for: r26v32 */
    /* JADX WARN: Type inference failed for: r26v34 */
    /* JADX WARN: Type inference failed for: r26v35 */
    /* JADX WARN: Type inference failed for: r26v36 */
    /* JADX WARN: Type inference failed for: r26v37 */
    /* JADX WARN: Type inference failed for: r26v42 */
    /* JADX WARN: Type inference failed for: r26v43 */
    /* JADX WARN: Type inference failed for: r26v45 */
    /* JADX WARN: Type inference failed for: r26v46 */
    /* JADX WARN: Type inference failed for: r26v47 */
    /* JADX WARN: Type inference failed for: r26v49 */
    /* JADX WARN: Type inference failed for: r26v50 */
    /* JADX WARN: Type inference failed for: r26v51 */
    /* JADX WARN: Type inference failed for: r26v54 */
    /* JADX WARN: Type inference failed for: r26v55 */
    /* JADX WARN: Type inference failed for: r26v56 */
    /* JADX WARN: Type inference failed for: r26v57 */
    /* JADX WARN: Type inference failed for: r26v58 */
    /* JADX WARN: Type inference failed for: r26v60 */
    /* JADX WARN: Type inference failed for: r26v62 */
    /* JADX WARN: Type inference failed for: r26v63 */
    /* JADX WARN: Type inference failed for: r26v64 */
    /* JADX WARN: Type inference failed for: r26v65 */
    /* JADX WARN: Type inference failed for: r26v70 */
    /* JADX WARN: Type inference failed for: r26v71 */
    /* JADX WARN: Type inference failed for: r26v72 */
    /* JADX WARN: Type inference failed for: r26v73 */
    /* JADX WARN: Type inference failed for: r26v74 */
    /* JADX WARN: Type inference failed for: r26v75 */
    /* JADX WARN: Type inference failed for: r26v76 */
    /* JADX WARN: Type inference failed for: r26v77 */
    /* JADX WARN: Type inference failed for: r26v78 */
    /* JADX WARN: Type inference failed for: r26v79 */
    /* JADX WARN: Type inference failed for: r26v80 */
    /* JADX WARN: Type inference failed for: r26v81 */
    /* JADX WARN: Type inference failed for: r26v82 */
    /* JADX WARN: Type inference failed for: r26v83 */
    /* JADX WARN: Type inference failed for: r26v84 */
    /* JADX WARN: Type inference failed for: r26v85 */
    /* JADX WARN: Type inference failed for: r26v86 */
    /* JADX WARN: Type inference failed for: r26v87 */
    /* JADX WARN: Type inference failed for: r26v88 */
    /* JADX WARN: Type inference failed for: r26v89 */
    /* JADX WARN: Type inference failed for: r26v90 */
    /* JADX WARN: Type inference failed for: r26v91 */
    /* JADX WARN: Type inference failed for: r26v92 */
    /* JADX WARN: Type inference failed for: r26v93 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v100 */
    /* JADX WARN: Type inference failed for: r5v101 */
    /* JADX WARN: Type inference failed for: r5v102 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v64 */
    /* JADX WARN: Type inference failed for: r5v69 */
    /* JADX WARN: Type inference failed for: r5v70 */
    /* JADX WARN: Type inference failed for: r5v71 */
    /* JADX WARN: Type inference failed for: r5v73 */
    /* JADX WARN: Type inference failed for: r5v76 */
    /* JADX WARN: Type inference failed for: r5v80 */
    /* JADX WARN: Type inference failed for: r5v81 */
    /* JADX WARN: Type inference failed for: r5v82 */
    /* JADX WARN: Type inference failed for: r5v84 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r5v91 */
    /* JADX WARN: Type inference failed for: r5v93 */
    /* JADX WARN: Type inference failed for: r5v98 */
    /* JADX WARN: Type inference failed for: r5v99 */
    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int iM3169;
        int i;
        int i2;
        int iM2761;
        int i3;
        int i4;
        int iM2762;
        int i5;
        C2361 c2361;
        int i6;
        StringBuilder sb;
        int i7;
        String str;
        short[] sArr;
        int i8;
        int i9;
        short[] sArr2;
        int i10;
        short[] sArr3;
        int i11;
        ?? r5;
        int iM31610;
        int iM31611;
        int i12;
        int i13;
        int iM31612;
        int i14;
        ?? r6;
        int iM2763;
        int i15;
        int i16;
        ?? r26;
        int i17;
        ?? r7;
        int i18;
        StringBuilder sb2;
        int i19;
        String str2;
        short[] sArr4;
        int i20;
        short[] sArr5;
        int i21;
        int i22;
        int iM2764;
        int i23;
        int i24;
        StringBuilder sb3;
        int i25;
        short[] sArr6;
        int i26;
        short[] sArr7;
        int i27;
        int i28;
        int i29;
        int i30;
        int iM2765;
        int i31;
        int i32;
        String str3;
        HashSet hashSet;
        short[] sArr8;
        int iM2766;
        int i33;
        int i34;
        ?? r8;
        C2361 c2362;
        StringBuilder sb4;
        HashSet hashSet2;
        String str4;
        short[] sArr9;
        C2361 c2363;
        int iM2767;
        int i35;
        int i36;
        C2361 c2364;
        StringBuilder sb5;
        C2361 c2365;
        int i37;
        short[] sArr10;
        int i38;
        ?? r27;
        int iM31613;
        int i39;
        int i40;
        int iM2768;
        int i41;
        ?? r28;
        ?? r29;
        ?? r210;
        ?? r211;
        ?? r212;
        ?? r213;
        ?? r214;
        ?? r215;
        ?? r216;
        ?? r217;
        ?? r218;
        ?? r219;
        ActivityC10841 activityC10841 = this;
        int i42 = -612560665;
        int i43 = C20932.f66974;
        int i44 = C1542.f5343;
        int iM31614 = C0773.m3169("۟ۚ") ^ i44;
        int i45 = ((iM31614 ^ i43) * (-18577)) ^ (-1151491422);
        int i46 = iM31614 ^ (-318567110);
        ArrayList arrayList = null;
        Iterator itM7968 = null;
        C2361 c2366 = null;
        String str5 = null;
        C2361 c2367 = null;
        short[] sArr11 = null;
        short[] sArr12 = null;
        short[] sArr13 = null;
        boolean z = false;
        int i47 = 0;
        int i48 = 0;
        int i49 = 0;
        int i50 = 0;
        int i51 = 0;
        int i52 = 0;
        short s = 0;
        int i53 = 0;
        int i54 = 0;
        int i55 = 0;
        int i56 = 0;
        int i57 = 0;
        List listM52723 = null;
        HashSet hashSet3 = null;
        HashSet hashSet4 = null;
        Iterator itM7969 = null;
        StringBuilder sb6 = null;
        int i58 = 0;
        int i59 = 0;
        int i60 = 0;
        C18300 c18300 = null;
        String str6 = null;
        while (true) {
            i42 = i46 ^ (i45 & (((i42 ^ i43) * (-9825)) >> 31));
            switch (i42) {
                case -2128052616:
                case -1606589282:
                    c2367 = c2367;
                    hashSet3 = hashSet3;
                    String str7 = str5;
                    if (!C3998.m12923(itM7969)) {
                        str5 = str7;
                        iM2761 = (C0619.m2761("᩶᩺") ^ i43) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i3 = ((iM2761 ^ i44) * 24301) ^ (-220155189);
                        i4 = 407645693;
                        i46 = iM2761 ^ i4;
                        i45 = i3;
                        str5 = str5;
                        hashSet3 = hashSet3;
                        c2367 = c2367;
                    } else {
                        iM2762 = C0619.m2761("ۚᩴ") ^ i44;
                        str5 = str7;
                        i45 = ((iM2762 ^ i43) * (-4391)) ^ 216639752;
                        i5 = 788483409;
                        i46 = iM2762 ^ i5;
                        str5 = str5;
                        hashSet3 = hashSet3;
                        c2367 = c2367;
                    }
                    break;
                case -2113272005:
                case -1406944329:
                    i32 = i49;
                    str3 = str5;
                    RunnableC0334.m2054(arrayList, C3779.m12271(activityC10841, i32));
                    hashSet = new HashSet();
                    hashSet4 = new HashSet();
                    itM7968 = C2354.m7968(listM52723);
                    int iM2769 = C0619.m2761("ۡۡ") ^ i43;
                    int i61 = i32;
                    i45 = ((iM2769 ^ i44) * 26387) ^ 720397827;
                    i46 = iM2769 ^ 1525113923;
                    i56 = i56;
                    i57 = i57;
                    sArr13 = sArr13;
                    i49 = i61;
                    i58 = i58;
                    sb6 = sb6;
                    c2366 = c2366;
                    sArr12 = sArr12;
                    i50 = i50;
                    str5 = str3;
                    c2367 = c2367;
                    hashSet3 = hashSet;
                    i47 = i47;
                    break;
                case -2100363974:
                case 247015336:
                    c2367 = c2367;
                    if (C3492.m11490(str6, C2023.m6966(f34330, 108, 20, i59))) {
                        iM3169 = C0619.m2761("ۨᩴ") ^ i44;
                        i = ((iM3169 ^ i43) * (-2227)) ^ 1464620389;
                        i2 = 2048832211;
                    } else {
                        iM3169 = C0619.m2761("᩸ܰ") ^ i44;
                        i = ((iM3169 ^ i43) * (-2885)) ^ (-572101516);
                        i2 = 1310671324;
                    }
                    i46 = iM3169 ^ i2;
                    i45 = i;
                    c2367 = c2367;
                    break;
                case -2031288685:
                case -813320589:
                    C2361 c2368 = c2366;
                    RunnableC1848.m6359(c2368, C0773.m3169(C11235.m28300(sArr13, IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult, 3, i59)) ^ 2101331944, null);
                    C3099.m10090(c2368);
                    return z;
                case -1977160235:
                case 792717041:
                    c2367 = c2367;
                    hashSet3 = hashSet3;
                    String strM42687 = ((C18300) C4238.m13529(itM7968)).m42687();
                    if (!C0487.m2352(hashSet3, strM42687)) {
                        str5 = strM42687;
                        iM2761 = C0619.m2761("ۚۡ") ^ i43;
                        i3 = ((iM2761 ^ i44) * 6031) ^ 1978616510;
                        i4 = -447370909;
                        i46 = iM2761 ^ i4;
                        i45 = i3;
                        str5 = str5;
                        hashSet3 = hashSet3;
                        c2367 = c2367;
                    } else {
                        iM2762 = (C0619.m2761("᩺᩸") + i44) * (-97);
                        str5 = strM42687;
                        i45 = ((iM2762 ^ i43) * (-975)) ^ 249547606;
                        i5 = 1194199307;
                        i46 = iM2762 ^ i5;
                        str5 = str5;
                        hashSet3 = hashSet3;
                        c2367 = c2367;
                    }
                    break;
                case -1813494203:
                case -508921259:
                    c2367 = c2367;
                    itM7969 = C2354.m7968(listM52723);
                    iM2761 = (C0619.m2761("ܺᩴ") + i44) * (-69);
                    i3 = ((iM2761 ^ i43) * (-21779)) ^ 2023750109;
                    i4 = -1738615332;
                    i46 = iM2761 ^ i4;
                    i45 = i3;
                    str5 = str5;
                    hashSet3 = hashSet3;
                    c2367 = c2367;
                    break;
                case -1759695697:
                case 291155203:
                    RunnableC1848.m6360();
                    return false;
                case -1671569965:
                case 344137189:
                    C2361 c2369 = c2367;
                    StringBuilder sb7 = sb6;
                    c2366 = c2366;
                    hashSet3 = hashSet3;
                    str = str5;
                    sArr8 = sArr12;
                    int i62 = i57;
                    short[] sArr14 = sArr13;
                    ?? r220 = i58;
                    int i63 = i56;
                    int i64 = i47;
                    int i65 = i50;
                    if (i65 == (C0619.m2761(C2419.m8166(f34330, 93, 3, i59)) ^ 2130071688)) {
                        iM2766 = (C0773.m3169("᩻᩸") ^ i43) * 91;
                        i33 = ((iM2766 ^ i44) * (-10663)) ^ 1173235248;
                        i34 = 48102037;
                    } else {
                        iM2766 = (C0619.m2761("۟۠") ^ i44) * 27;
                        i33 = ((iM2766 ^ i43) * 20265) ^ (-582731982);
                        i34 = -101003354;
                    }
                    i46 = iM2766 ^ i34;
                    i50 = i65;
                    i45 = i33;
                    i56 = i63;
                    i57 = i62;
                    sArr13 = sArr14;
                    r8 = r220 == true ? 1 : 0;
                    c2367 = c2369;
                    sb6 = sb7;
                    i47 = i64;
                    sArr12 = sArr8;
                    r5 = r8;
                    str5 = str;
                    i58 = r5;
                    hashSet3 = hashSet3;
                    c2366 = c2366;
                    break;
                case -1647399379:
                case -292385523:
                    c2361 = c2367;
                    i6 = i47;
                    sb = sb6;
                    i7 = i50;
                    c2366 = c2366;
                    hashSet3 = hashSet3;
                    str = str5;
                    sArr2 = sArr12;
                    i10 = i57;
                    sArr3 = sArr13;
                    ?? r221 = i58;
                    i11 = i56;
                    iM31610 = C0773.m3169(C2288.m7761(f34330, 90, 3, i59)) ^ 2121574011;
                    if (C0487.m2356() >= 0) {
                        sArr = sArr11;
                        i8 = i54;
                        i9 = i55;
                        r28 = r221;
                        int iM27610 = C0619.m2761("᩹ۖ") ^ i44;
                        i50 = i7;
                        i57 = i10;
                        sArr13 = sArr3;
                        i56 = i11;
                        c2367 = c2361;
                        sb6 = sb;
                        sArr12 = sArr2;
                        i54 = i8;
                        i55 = i9;
                        sArr11 = sArr;
                        i49 = iM31610;
                        i46 = iM27610 ^ 1235930516;
                        i45 = ((iM27610 ^ i43) * 29411) ^ 114551353;
                        r5 = r28;
                        i47 = i6;
                    } else {
                        int iM27611 = C0619.m2761("ۧۚ") ^ i43;
                        int i66 = ((iM27611 ^ i44) * (-1573)) ^ (-1429417262);
                        i46 = iM27611 ^ (-1463413907);
                        i50 = i7;
                        i57 = i10;
                        sArr13 = sArr3;
                        i56 = i11;
                        c2367 = c2361;
                        sb6 = sb;
                        i47 = i6;
                        sArr12 = sArr2;
                        i49 = iM31610;
                        i45 = i66;
                        r5 = r221 == true ? 1 : 0;
                    }
                    str5 = str;
                    i58 = r5;
                    hashSet3 = hashSet3;
                    c2366 = c2366;
                    break;
                case -1595100505:
                case -708739479:
                    C1321.m4852();
                    if (C1321.f4751 >= 0) {
                        iM2768 = C0619.m2761("ۤۤ") ^ i44;
                        i40 = ((iM2768 ^ i43) * (-20245)) ^ (-156683033);
                        i41 = -1230319978;
                        i46 = iM2768 ^ i41;
                        i45 = i40;
                    } else {
                        c2367 = c2367;
                        i47 = i47;
                        sb3 = sb6;
                        i50 = i50;
                        c2366 = c2366;
                        hashSet3 = hashSet3;
                        str5 = str5;
                        sArr11 = sArr11;
                        i25 = i54;
                        sArr6 = sArr12;
                        i26 = i57;
                        sArr7 = sArr13;
                        r214 = i58;
                        i27 = i49;
                        i28 = i55;
                        i29 = i56;
                        iM2765 = (i43 - C0619.m2761("ۗ֫")) * (-61);
                        i30 = i25;
                        i12 = ((iM2765 ^ i44) * 19389) ^ 1963356996;
                        i31 = -1495791024;
                        r213 = r214;
                        i17 = iM2765 ^ i31;
                        i55 = i28;
                        i57 = i26;
                        sArr13 = sArr7;
                        i56 = i29;
                        i49 = i27;
                        r7 = r213;
                        sb6 = sb3;
                        sArr12 = sArr6;
                        i54 = i30;
                        sArr11 = sArr11;
                        i46 = i17;
                        i50 = i50;
                        r6 = r7;
                        i45 = i12;
                        str5 = str5;
                        c2367 = c2367;
                        i47 = i47;
                        i58 = r6;
                        hashSet3 = hashSet3;
                        c2366 = c2366;
                    }
                    break;
                case -1538356934:
                case 173620177:
                    c2367 = c2367;
                    i47 = i47;
                    StringBuilder sb8 = sb6;
                    int i67 = i49;
                    c2366 = c2366;
                    hashSet3 = hashSet3;
                    str5 = str5;
                    short[] sArr15 = sArr11;
                    int i68 = i54;
                    int i69 = i55;
                    short[] sArr16 = sArr12;
                    int i70 = i56;
                    int i71 = i57;
                    short[] sArr17 = sArr13;
                    ?? r222 = i58;
                    int iM8344 = C2485.m8344(menuItem);
                    z = true;
                    if (iM8344 == (C0773.m3169(RunnableC3646.m11809(f34330, 78, 3, i59)) ^ 2122459270)) {
                        iM31612 = (i43 - C0773.m3169("᩻ۜ")) * (-113);
                        i12 = ((iM31612 ^ i44) * (-2955)) ^ (-1340577501);
                        i14 = -654155371;
                    } else {
                        iM31612 = (C0773.m3169("ܳۡ") + i44) * (-73);
                        i12 = ((iM31612 ^ i43) * 3627) ^ 1970359844;
                        i14 = -1172054918;
                    }
                    int i72 = iM31612 ^ i14;
                    i57 = i71;
                    sArr13 = sArr17;
                    i56 = i70;
                    i49 = i67;
                    r6 = r222 == true ? 1 : 0;
                    sb6 = sb8;
                    sArr12 = sArr16;
                    i54 = i68;
                    i55 = i69;
                    sArr11 = sArr15;
                    i50 = iM8344;
                    i46 = i72;
                    i45 = i12;
                    str5 = str5;
                    c2367 = c2367;
                    i47 = i47;
                    i58 = r6;
                    hashSet3 = hashSet3;
                    c2366 = c2366;
                    break;
                case -1537075507:
                case -1205037055:
                    c2361 = c2367;
                    i6 = i47;
                    sb = sb6;
                    i7 = i50;
                    c2366 = c2366;
                    hashSet3 = hashSet3;
                    str = str5;
                    sArr = sArr11;
                    i8 = i54;
                    i9 = i55;
                    sArr2 = sArr12;
                    i10 = i57;
                    sArr3 = sArr13;
                    ?? r223 = i58;
                    int i73 = i49;
                    i11 = i56;
                    short s2 = f34330[77];
                    int i74 = s2 + 6852;
                    if (RunnableC3646.m11813() != 0) {
                        s = s2;
                        i53 = i74;
                        iM31610 = i73;
                        r28 = r223;
                        int iM27612 = C0619.m2761("᩹ۖ") ^ i44;
                        i50 = i7;
                        i57 = i10;
                        sArr13 = sArr3;
                        i56 = i11;
                        c2367 = c2361;
                        sb6 = sb;
                        sArr12 = sArr2;
                        i54 = i8;
                        i55 = i9;
                        sArr11 = sArr;
                        i49 = iM31610;
                        i46 = iM27612 ^ 1235930516;
                        i45 = ((iM27612 ^ i43) * 29411) ^ 114551353;
                        r5 = r28;
                        i47 = i6;
                    } else {
                        int iM27613 = (C0619.m2761("᩶ᩳ") ^ i44) * 43;
                        s = s2;
                        i53 = i74;
                        i57 = i10;
                        sArr13 = sArr3;
                        i56 = i11;
                        i49 = i73;
                        sb6 = sb;
                        i47 = i6;
                        sArr12 = sArr2;
                        i54 = i8;
                        i55 = i9;
                        sArr11 = sArr;
                        i45 = ((iM27613 ^ i43) * (-29871)) ^ 1457078103;
                        i50 = i7;
                        i46 = iM27613 ^ 1200619383;
                        r5 = r223 == true ? 1 : 0;
                        c2367 = c2361;
                        activityC10841 = this;
                    }
                    str5 = str;
                    i58 = r5;
                    hashSet3 = hashSet3;
                    c2366 = c2366;
                    break;
                case -1459796724:
                case -1241315591:
                    C2361 c23610 = c2367;
                    StringBuilder sb9 = sb6;
                    int i75 = i50;
                    C2361 c23611 = c2366;
                    HashSet hashSet5 = hashSet3;
                    String str8 = str5;
                    short[] sArr18 = sArr11;
                    int i76 = i54;
                    int i77 = i55;
                    short[] sArr19 = sArr12;
                    int i78 = i57;
                    short[] sArr20 = sArr13;
                    int i79 = i49;
                    int i80 = i56;
                    i58 = 0;
                    if (i75 == (C0619.m2761(C0487.m2361(f34330, 81, 3, i59)) ^ 2126551488)) {
                        iM2763 = C0619.m2761("ۙᩳ") ^ i44;
                        i15 = ((iM2763 ^ i43) * 25303) ^ (-1442033812);
                        i16 = 375816776;
                    } else {
                        iM2763 = (C0619.m2761("ۢܶ") ^ i43) * (-107);
                        i15 = ((iM2763 ^ i44) * (-23051)) ^ (-218410679);
                        i16 = -1540834521;
                    }
                    i57 = i78;
                    sArr13 = sArr20;
                    i56 = i80;
                    i49 = i79;
                    str5 = str8;
                    sb6 = sb9;
                    sArr12 = sArr19;
                    i54 = i76;
                    i55 = i77;
                    sArr11 = sArr18;
                    i46 = iM2763 ^ i16;
                    i50 = i75;
                    i45 = i15;
                    hashSet3 = hashSet5;
                    c2367 = c23610;
                    c2366 = c23611;
                    i47 = 2;
                    break;
                case -1319714172:
                case -1232860108:
                    i60 = -1;
                    iM3169 = C0619.m2761("ۤۘ") ^ i43;
                    i = ((iM3169 ^ i44) * 795) ^ (-1147778008);
                    i2 = -351069183;
                    i46 = iM3169 ^ i2;
                    i45 = i;
                    c2367 = c2367;
                    break;
                case -1280973494:
                case -543112473:
                    C11235.m28309();
                    if (C1519.m5403()) {
                        iM2768 = (i43 - C0619.m2761("ۨ᩶")) * (-35);
                        i40 = ((iM2768 ^ i44) * 28341) ^ 1688637107;
                        i41 = -821169158;
                    } else {
                        iM2768 = (C0619.m2761("֫ۛ") ^ i44) * (-87);
                        i40 = ((iM2768 ^ i43) * 22825) ^ (-522754515);
                        i41 = -1728214349;
                    }
                    i46 = iM2768 ^ i41;
                    i45 = i40;
                    break;
                case -1197791294:
                case 288829398:
                    c2367 = c2367;
                    i47 = i47;
                    sb6 = sb6;
                    i50 = i50;
                    c2366 = c2366;
                    hashSet3 = hashSet3;
                    str5 = str5;
                    sArr11 = sArr11;
                    i54 = i54;
                    sArr12 = sArr12;
                    i57 = i57;
                    sArr13 = sArr13;
                    ?? r224 = i58;
                    i49 = i49;
                    i56 = i56;
                    i55 = i55;
                    if (i50 == (C0773.m3169(C3033.m9847(f34330, 84, 3, i59)) ^ 2129226494)) {
                        iM31611 = C0773.m3169("᩺᩻") ^ i44;
                        i12 = ((iM31611 ^ i43) * (-4631)) ^ (-129626243);
                        i13 = 1783875173;
                        r26 = r224;
                    } else {
                        iM31611 = (C0773.m3169("֫ܽ") + i44) * 127;
                        i12 = ((iM31611 ^ i43) * (-23751)) ^ (-1083665703);
                        i13 = 1935280647;
                        r26 = r224;
                    }
                    i17 = iM31611 ^ i13;
                    i57 = i57;
                    sArr13 = sArr13;
                    i56 = i56;
                    i49 = i49;
                    r7 = r26;
                    sb6 = sb6;
                    sArr12 = sArr12;
                    i54 = i54;
                    i55 = i55;
                    sArr11 = sArr11;
                    i46 = i17;
                    i50 = i50;
                    r6 = r7;
                    i45 = i12;
                    str5 = str5;
                    c2367 = c2367;
                    i47 = i47;
                    i58 = r6;
                    hashSet3 = hashSet3;
                    c2366 = c2366;
                    break;
                case -1180073673:
                case 863994483:
                    i60 = 1;
                    iM3169 = C0619.m2761("ۤۘ") ^ i43;
                    i = ((iM3169 ^ i44) * 795) ^ (-1147778008);
                    i2 = -351069183;
                    i46 = iM3169 ^ i2;
                    i45 = i;
                    c2367 = c2367;
                    break;
                case -1148346807:
                case 1735423601:
                    c2364 = c2367;
                    sb5 = sb6;
                    c2365 = c2366;
                    hashSet3 = hashSet3;
                    str = str5;
                    short[] sArr21 = sArr12;
                    i37 = i57;
                    sArr10 = sArr13;
                    ?? r225 = i58;
                    i38 = i56;
                    sArr8 = sArr21;
                    C2485.m8345(c2365, C0619.m2761(C2485.m8350(sArr21, i38, i37, i59)) ^ 2130285896);
                    r210 = r225;
                    if (AbstractC0641.f2496 >= 0) {
                        int iM31615 = C0773.m3169("ܽܺ") ^ i43;
                        c2366 = c2365;
                        i45 = ((iM31615 ^ i44) * 6949) ^ 1654138353;
                        i46 = iM31615 ^ 2088247919;
                        r29 = r210;
                    } else {
                        c2366 = c2365;
                        int iM31616 = C0773.m3169("۫֡") ^ i43;
                        i46 = iM31616 ^ (-444600580);
                        i45 = ((iM31616 ^ i44) * 8239) ^ (-968055306);
                        r29 = r225;
                    }
                    i56 = i38;
                    i57 = i37;
                    sArr13 = sArr10;
                    r8 = r29;
                    c2367 = c2364;
                    sb6 = sb5;
                    sArr12 = sArr8;
                    r5 = r8;
                    str5 = str;
                    i58 = r5;
                    hashSet3 = hashSet3;
                    c2366 = c2366;
                    break;
                case -1139499961:
                case 1594338526:
                    c2367 = c2367;
                    i18 = i47;
                    sb2 = sb6;
                    i19 = i50;
                    c2366 = c2366;
                    hashSet3 = hashSet3;
                    str2 = str5;
                    sArr4 = sArr12;
                    i20 = i57;
                    sArr5 = sArr13;
                    ?? r226 = i58;
                    i21 = i49;
                    i22 = i56;
                    listM52723 = C23522.m52723();
                    arrayList = new ArrayList(C2834.m9336(listM52723) + (z ? 1 : 0));
                    sArr11 = f34330;
                    i54 = 87;
                    i55 = 3;
                    r212 = r226;
                    if (C2288.f7433 <= 0) {
                        iM2764 = (C0619.m2761("ۜ۬") ^ i43) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i23 = ((iM2764 ^ i44) * 31013) ^ (-984465181);
                        i24 = 836047404;
                        r211 = r212;
                    } else {
                        iM2764 = (i44 - C0619.m2761("ۡ᩷")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i23 = ((iM2764 ^ i43) * (-2577)) ^ 1559687617;
                        i24 = -2096366830;
                        r211 = r226;
                    }
                    i46 = iM2764 ^ i24;
                    i45 = i23;
                    i57 = i20;
                    sArr13 = sArr5;
                    i56 = i22;
                    i49 = i21;
                    i58 = r211;
                    sb6 = sb2;
                    i47 = i18;
                    sArr12 = sArr4;
                    i50 = i19;
                    str5 = str2;
                    c2367 = c2367;
                    hashSet3 = hashSet3;
                    c2366 = c2366;
                    break;
                case -1091368949:
                case -803374391:
                    C1519.m5406(arrayList, c18300.m42687());
                    iM2761 = (C0619.m2761("ܺᩴ") + i44) * (-69);
                    i3 = ((iM2761 ^ i43) * (-21779)) ^ 2023750109;
                    i4 = -1738615332;
                    i46 = iM2761 ^ i4;
                    i45 = i3;
                    str5 = str5;
                    hashSet3 = hashSet3;
                    c2367 = c2367;
                    break;
                case -1080832785:
                case 1972598490:
                    C3779.m12258(sb6, C2310.m7812(c18300));
                    C3779.m12258(sb6, AbstractC0641.m2820(f34330, 130, 1, i59));
                    RunnableC0334.m2054(arrayList, C2023.m6952(sb6));
                    iM2761 = (C0619.m2761("ܺᩴ") + i44) * (-69);
                    i3 = ((iM2761 ^ i43) * (-21779)) ^ 2023750109;
                    i4 = -1738615332;
                    i46 = iM2761 ^ i4;
                    i45 = i3;
                    str5 = str5;
                    hashSet3 = hashSet3;
                    c2367 = c2367;
                    break;
                case -1042347792:
                case -157462889:
                    int i81 = DialogInterfaceC8327.f27315;
                    C2361 c23612 = new C2361(activityC10841);
                    int iM27614 = C0619.m2761(C2966.m9670(f34330, 131, 3, i59));
                    i52 = 2100554447;
                    if (C1146.f4234 >= 0) {
                        c2367 = c23612;
                        i51 = iM27614;
                        iM2768 = (C0619.m2761("֫ۛ") ^ i44) * (-87);
                        i40 = ((iM2768 ^ i43) * 22825) ^ (-522754515);
                        i41 = -1728214349;
                        i46 = iM2768 ^ i41;
                    } else {
                        int iM27615 = (i43 - C0619.m2761("᩹۬")) * (-83);
                        i40 = ((iM27615 ^ i44) * 14857) ^ (-1467085939);
                        i46 = iM27615 ^ (-565390065);
                        c2367 = c23612;
                        i51 = iM27614;
                    }
                    i45 = i40;
                    break;
                case -1005929239:
                case -759664550:
                    activityC10841.f34333.mo13072();
                    return z;
                case -884108528:
                case 1731877870:
                    if (C3492.m11490(C0269.m1784((C18300) C1542.m5473(listM52723, i48)), activityC10841.f34332)) {
                        iM2768 = C0773.m3169("ۧ֫") ^ i43;
                        i40 = ((iM2768 ^ i44) * (-5981)) ^ (-734823354);
                        i41 = 457038391;
                    } else {
                        iM2768 = (C0619.m2761("ܶۛ") ^ i44) * (-37);
                        i40 = ((iM2768 ^ i43) * 29325) ^ (-761447653);
                        i41 = 1843902440;
                    }
                    i46 = iM2768 ^ i41;
                    i45 = i40;
                    break;
                case -836330473:
                case 837929238:
                    i60 = i48 + i47;
                    iM3169 = C0619.m2761("ۤۘ") ^ i43;
                    i = ((iM3169 ^ i44) * 795) ^ (-1147778008);
                    i2 = -351069183;
                    i46 = iM3169 ^ i2;
                    i45 = i;
                    c2367 = c2367;
                    break;
                case -815327163:
                case 335678764:
                    c2367 = c2367;
                    i47 = i47;
                    sb6 = sb6;
                    i50 = i50;
                    c2366 = c2366;
                    hashSet3 = hashSet3;
                    str5 = str5;
                    sArr11 = sArr11;
                    i54 = i54;
                    i55 = i55;
                    sArr12 = sArr12;
                    i57 = i57;
                    sArr13 = sArr13;
                    ?? r227 = i58;
                    i49 = i49;
                    i56 = i56;
                    int i82 = (s * s) + 46949904;
                    if ((i82 + i82) - (i53 * i53) >= 0) {
                        iM31611 = (C0619.m2761("ۨܳ") + i43) * (-19);
                        i12 = ((iM31611 ^ i44) * 27269) ^ 1000696906;
                        i13 = 184884429;
                        r26 = r227;
                    } else {
                        iM31611 = C0773.m3169("᩻ۡ") ^ i44;
                        i12 = ((iM31611 ^ i43) * 5283) ^ 908815100;
                        i13 = 45352829;
                        r26 = r227;
                    }
                    i17 = iM31611 ^ i13;
                    i57 = i57;
                    sArr13 = sArr13;
                    i56 = i56;
                    i49 = i49;
                    r7 = r26;
                    sb6 = sb6;
                    sArr12 = sArr12;
                    i54 = i54;
                    i55 = i55;
                    sArr11 = sArr11;
                    i46 = i17;
                    i50 = i50;
                    r6 = r7;
                    i45 = i12;
                    str5 = str5;
                    c2367 = c2367;
                    i47 = i47;
                    i58 = r6;
                    hashSet3 = hashSet3;
                    c2366 = c2366;
                    break;
                case -812008799:
                case -162188307:
                    HashSet hashSet6 = hashSet3;
                    String str9 = str5;
                    C0862.m3502(hashSet6, str9);
                    str3 = str9;
                    i32 = i49;
                    hashSet = hashSet6;
                    int iM27616 = C0619.m2761("ۡۡ") ^ i43;
                    int i610 = i32;
                    i45 = ((iM27616 ^ i44) * 26387) ^ 720397827;
                    i46 = iM27616 ^ 1525113923;
                    i56 = i56;
                    i57 = i57;
                    sArr13 = sArr13;
                    i49 = i610;
                    i58 = i58;
                    sb6 = sb6;
                    c2366 = c2366;
                    sArr12 = sArr12;
                    i50 = i50;
                    str5 = str3;
                    c2367 = c2367;
                    hashSet3 = hashSet;
                    i47 = i47;
                    break;
                case -810288529:
                case 243183752:
                    c2362 = c2367;
                    c2363 = c2366;
                    hashSet2 = hashSet3;
                    str4 = str5;
                    sArr9 = sArr13;
                    r27 = i58;
                    sb4 = sb6;
                    C3099.m10082(c2363, C0619.m2761(C1826.m6310(f34330, 99, 3, i59)) ^ 2098698457);
                    if (C1519.f5300 < 0) {
                        C2419.m8168(c2363, C0773.m3169(AbstractC0116.m1236(f34330, IShizukuService.Stub.TRANSACTION_attachUserService, 3, i59)) ^ 2129863849, new DialogInterfaceOnClickListenerC23692(activityC10841, i47));
                        sArr13 = f34330;
                        if (C23916.f77426 <= 0) {
                            r216 = r27;
                            iM31613 = (i43 - C0619.m2761("ܺܰ")) * (-121);
                            i35 = ((iM31613 ^ i44) * 3463) ^ 1229875598;
                            i39 = 1980196067;
                            r215 = r216;
                        } else {
                            r216 = r27;
                            iM31613 = (C0773.m3169("ܽܽ") + i44) * 73;
                            i35 = ((iM31613 ^ i43) * (-30393)) ^ 1994595903;
                            i39 = 581201759;
                            r215 = r27;
                        }
                        i46 = iM31613 ^ i39;
                        r217 = r215;
                        c2367 = c2362;
                        sb6 = sb4;
                        HashSet hashSet7 = hashSet2;
                        c2366 = c2363;
                        i45 = i35;
                        i58 = r217;
                        str5 = str4;
                        hashSet3 = hashSet7;
                    } else {
                        iM2767 = (i44 - C0773.m3169("ۢ᩸")) * (-47);
                        i35 = ((iM2767 ^ i43) * 8233) ^ (-587406915);
                        i36 = 1537956357;
                        r218 = r27;
                        i46 = iM2767 ^ i36;
                        sArr13 = sArr9;
                        r217 = r218;
                        c2367 = c2362;
                        sb6 = sb4;
                        HashSet hashSet8 = hashSet2;
                        c2366 = c2363;
                        i45 = i35;
                        i58 = r217;
                        str5 = str4;
                        hashSet3 = hashSet8;
                    }
                    break;
                case -721576943:
                case -306491922:
                    c2367 = c2367;
                    sb6 = new StringBuilder();
                    C1783.m6234(sb6, c18300.m42687());
                    C1783.m6234(sb6, C2966.m9670(f34330, 128, 2, i59));
                    if (AbstractC0641.m2813() > 0) {
                        iM3169 = C0773.m3169("ۘۖ") ^ i43;
                        i = ((iM3169 ^ i44) * (-20909)) ^ 1778118144;
                        i2 = 1600087201;
                        i46 = iM3169 ^ i2;
                        i45 = i;
                        c2367 = c2367;
                    } else {
                        i18 = i47;
                        sb2 = sb6;
                        i19 = i50;
                        c2366 = c2366;
                        hashSet3 = hashSet3;
                        str2 = str5;
                        sArr4 = sArr12;
                        i20 = i57;
                        sArr5 = sArr13;
                        r212 = i58;
                        i21 = i49;
                        i22 = i56;
                        iM2764 = (C0619.m2761("ۜ۬") ^ i43) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i23 = ((iM2764 ^ i44) * 31013) ^ (-984465181);
                        i24 = 836047404;
                        r211 = r212;
                        i46 = iM2764 ^ i24;
                        i45 = i23;
                        i57 = i20;
                        sArr13 = sArr5;
                        i56 = i22;
                        i49 = i21;
                        i58 = r211;
                        sb6 = sb2;
                        i47 = i18;
                        sArr12 = sArr4;
                        i50 = i19;
                        str5 = str2;
                        c2367 = c2367;
                        hashSet3 = hashSet3;
                        c2366 = c2366;
                    }
                    break;
                case -642142883:
                case 1228877755:
                    i59 = 54137;
                    iM31611 = C0619.m2761("ܳ۟") ^ i43;
                    i12 = ((iM31611 ^ i44) * (-21377)) ^ (-823358160);
                    i13 = 546641240;
                    r26 = i58;
                    i17 = iM31611 ^ i13;
                    i57 = i57;
                    sArr13 = sArr13;
                    i56 = i56;
                    i49 = i49;
                    r7 = r26;
                    sb6 = sb6;
                    sArr12 = sArr12;
                    i54 = i54;
                    i55 = i55;
                    sArr11 = sArr11;
                    i46 = i17;
                    i50 = i50;
                    r6 = r7;
                    i45 = i12;
                    str5 = str5;
                    c2367 = c2367;
                    i47 = i47;
                    i58 = r6;
                    hashSet3 = hashSet3;
                    c2366 = c2366;
                    break;
                case -594372045:
                case 2101002021:
                    C3690.m11987();
                    if (C3779.f12953 > 0) {
                        c2362 = c2367;
                        sb4 = sb6;
                        c2363 = c2366;
                        hashSet2 = hashSet3;
                        str4 = str5;
                        r216 = i58;
                        r216 = r27;
                        iM31613 = (i43 - C0619.m2761("ܺܰ")) * (-121);
                        i35 = ((iM31613 ^ i44) * 3463) ^ 1229875598;
                        i39 = 1980196067;
                        r215 = r216;
                        i46 = iM31613 ^ i39;
                        r217 = r215;
                        c2367 = c2362;
                        sb6 = sb4;
                        HashSet hashSet9 = hashSet2;
                        c2366 = c2363;
                        i45 = i35;
                        i58 = r217;
                        str5 = str4;
                        hashSet3 = hashSet9;
                    }
                    c2362 = c2367;
                    sb4 = sb6;
                    c2363 = c2366;
                    hashSet2 = hashSet3;
                    str4 = str5;
                    sArr9 = sArr13;
                    r219 = i58;
                    iM2767 = (C0619.m2761("ܺۙ") ^ i44) * (-127);
                    i35 = ((iM2767 ^ i43) * (-10041)) ^ 1925754064;
                    i36 = -2145558481;
                    r218 = r219;
                    i46 = iM2767 ^ i36;
                    sArr13 = sArr9;
                    r217 = r218;
                    c2367 = c2362;
                    sb6 = sb4;
                    HashSet hashSet10 = hashSet2;
                    c2366 = c2363;
                    i45 = i35;
                    i58 = r217;
                    str5 = str4;
                    hashSet3 = hashSet10;
                    break;
                case -524812540:
                case 197501688:
                    c2367 = c2367;
                    i47 = i47;
                    sb3 = sb6;
                    i50 = i50;
                    c2366 = c2366;
                    hashSet3 = hashSet3;
                    str5 = str5;
                    short[] sArr22 = sArr11;
                    i25 = i54;
                    sArr6 = sArr12;
                    i26 = i57;
                    sArr7 = sArr13;
                    ?? r228 = i58;
                    i27 = i49;
                    i28 = i55;
                    i29 = i56;
                    sArr11 = sArr22;
                    C1519.m5406(arrayList, C3779.m12271(activityC10841, C0619.m2761(C1080.m4056(sArr22, i25, i28, i59)) ^ 2122442697));
                    r214 = r228;
                    if (AbstractC0641.f2496 >= 0) {
                        iM2765 = (i43 - C0619.m2761("ۗ֫")) * (-61);
                        i30 = i25;
                        i12 = ((iM2765 ^ i44) * 19389) ^ 1963356996;
                        i31 = -1495791024;
                        r213 = r214;
                    } else {
                        i30 = i25;
                        iM2765 = (C0619.m2761("֨᩸") + i43) * (-43);
                        i12 = ((iM2765 ^ i44) * (-753)) ^ (-48075365);
                        i31 = 1387709844;
                        r213 = r228;
                    }
                    i17 = iM2765 ^ i31;
                    i55 = i28;
                    i57 = i26;
                    sArr13 = sArr7;
                    i56 = i29;
                    i49 = i27;
                    r7 = r213;
                    sb6 = sb3;
                    sArr12 = sArr6;
                    i54 = i30;
                    sArr11 = sArr11;
                    i46 = i17;
                    i50 = i50;
                    r6 = r7;
                    i45 = i12;
                    str5 = str5;
                    c2367 = c2367;
                    i47 = i47;
                    i58 = r6;
                    hashSet3 = hashSet3;
                    c2366 = c2366;
                    break;
                case -508353796:
                case -432682911:
                    i60 = 0;
                    iM3169 = C0619.m2761("ۤۘ") ^ i43;
                    i = ((iM3169 ^ i44) * 795) ^ (-1147778008);
                    i2 = -351069183;
                    i46 = iM3169 ^ i2;
                    i45 = i;
                    c2367 = c2367;
                    break;
                case -495516194:
                case -18114427:
                    C13473.m33136(c2367, i51 ^ i52);
                    c2367.m8013((CharSequence[]) arrayList.toArray(new String[i58]), i60, new DialogInterfaceOnClickListenerC8845(i58, activityC10841, listM52723));
                    C3099.m10090(c2367);
                    return z;
                case -382956863:
                case -171918543:
                    C2485.m8357();
                    if (AbstractC0641.m2813() > 0) {
                        c2362 = c2367;
                        sb4 = sb6;
                        c2363 = c2366;
                        hashSet2 = hashSet3;
                        str4 = str5;
                        sArr9 = sArr13;
                        r219 = i58;
                        iM2767 = (C0619.m2761("ܺۙ") ^ i44) * (-127);
                        i35 = ((iM2767 ^ i43) * (-10041)) ^ 1925754064;
                        i36 = -2145558481;
                        r218 = r219;
                        i46 = iM2767 ^ i36;
                        sArr13 = sArr9;
                        r217 = r218;
                        c2367 = c2362;
                        sb6 = sb4;
                        HashSet hashSet11 = hashSet2;
                        c2366 = c2363;
                        i45 = i35;
                        i58 = r217;
                        str5 = str4;
                        hashSet3 = hashSet11;
                    } else {
                        c2367 = c2367;
                        i47 = i47;
                        sb3 = sb6;
                        i50 = i50;
                        c2366 = c2366;
                        hashSet3 = hashSet3;
                        str5 = str5;
                        sArr11 = sArr11;
                        i25 = i54;
                        sArr6 = sArr12;
                        i26 = i57;
                        sArr7 = sArr13;
                        r214 = i58;
                        i27 = i49;
                        i28 = i55;
                        i29 = i56;
                        iM2765 = (i43 - C0619.m2761("ۗ֫")) * (-61);
                        i30 = i25;
                        i12 = ((iM2765 ^ i44) * 19389) ^ 1963356996;
                        i31 = -1495791024;
                        r213 = r214;
                        i17 = iM2765 ^ i31;
                        i55 = i28;
                        i57 = i26;
                        sArr13 = sArr7;
                        i56 = i29;
                        i49 = i27;
                        r7 = r213;
                        sb6 = sb3;
                        sArr12 = sArr6;
                        i54 = i30;
                        sArr11 = sArr11;
                        i46 = i17;
                        i50 = i50;
                        r6 = r7;
                        i45 = i12;
                        str5 = str5;
                        c2367 = c2367;
                        i47 = i47;
                        i58 = r6;
                        hashSet3 = hashSet3;
                        c2366 = c2366;
                    }
                    break;
                case -378315972:
                case 1146730824:
                    if (i48 < C3448.m11247(listM52723)) {
                        iM2768 = C0773.m3169("ۡۧ") ^ i44;
                        i40 = ((iM2768 ^ i43) * (-10665)) ^ (-146534809);
                        i41 = 777734116;
                    } else {
                        iM2768 = (C0619.m2761("ۜۢ") ^ i43) * (-99);
                        i40 = ((iM2768 ^ i44) * (-16767)) ^ 923755467;
                        i41 = -980375069;
                    }
                    i46 = iM2768 ^ i41;
                    i45 = i40;
                    break;
                case -258506752:
                case 13121221:
                    if (!C17202.f56030) {
                        iM2768 = C0619.m2761("ۤۤ") ^ i44;
                        i40 = ((iM2768 ^ i43) * (-20245)) ^ (-156683033);
                        i41 = -1230319978;
                        i46 = iM2768 ^ i41;
                        i45 = i40;
                    } else {
                        c2367 = c2367;
                        i18 = i47;
                        sb2 = sb6;
                        i19 = i50;
                        c2366 = c2366;
                        hashSet3 = hashSet3;
                        str2 = str5;
                        sArr4 = sArr12;
                        i20 = i57;
                        sArr5 = sArr13;
                        r212 = i58;
                        i21 = i49;
                        i22 = i56;
                        iM2764 = (C0619.m2761("ۜ۬") ^ i43) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i23 = ((iM2764 ^ i44) * 31013) ^ (-984465181);
                        i24 = 836047404;
                        r211 = r212;
                        i46 = iM2764 ^ i24;
                        i45 = i23;
                        i57 = i20;
                        sArr13 = sArr5;
                        i56 = i22;
                        i49 = i21;
                        i58 = r211;
                        sb6 = sb2;
                        i47 = i18;
                        sArr12 = sArr4;
                        i50 = i19;
                        str5 = str2;
                        c2367 = c2367;
                        hashSet3 = hashSet3;
                        c2366 = c2366;
                    }
                    break;
                case -193845758:
                case 1454640503:
                    C3690.m11987();
                    if (C2485.f7950 == 0) {
                        c2361 = c2367;
                        i6 = i47;
                        sb = sb6;
                        iM31610 = i49;
                        i7 = i50;
                        c2366 = c2366;
                        hashSet3 = hashSet3;
                        str = str5;
                        sArr = sArr11;
                        i8 = i54;
                        i9 = i55;
                        sArr2 = sArr12;
                        i11 = i56;
                        i10 = i57;
                        sArr3 = sArr13;
                        r28 = i58;
                        int iM27617 = C0619.m2761("᩹ۖ") ^ i44;
                        i50 = i7;
                        i57 = i10;
                        sArr13 = sArr3;
                        i56 = i11;
                        c2367 = c2361;
                        sb6 = sb;
                        sArr12 = sArr2;
                        i54 = i8;
                        i55 = i9;
                        sArr11 = sArr;
                        i49 = iM31610;
                        i46 = iM27617 ^ 1235930516;
                        i45 = ((iM27617 ^ i43) * 29411) ^ 114551353;
                        r5 = r28;
                        i47 = i6;
                        str5 = str;
                        i58 = r5;
                        hashSet3 = hashSet3;
                        c2366 = c2366;
                    }
                    c2367 = c2367;
                    i47 = i47;
                    sb3 = sb6;
                    i50 = i50;
                    c2366 = c2366;
                    hashSet3 = hashSet3;
                    str5 = str5;
                    sArr11 = sArr11;
                    i25 = i54;
                    sArr6 = sArr12;
                    i26 = i57;
                    sArr7 = sArr13;
                    r214 = i58;
                    i27 = i49;
                    i28 = i55;
                    i29 = i56;
                    iM2765 = (i43 - C0619.m2761("ۗ֫")) * (-61);
                    i30 = i25;
                    i12 = ((iM2765 ^ i44) * 19389) ^ 1963356996;
                    i31 = -1495791024;
                    r213 = r214;
                    i17 = iM2765 ^ i31;
                    i55 = i28;
                    i57 = i26;
                    sArr13 = sArr7;
                    i56 = i29;
                    i49 = i27;
                    r7 = r213;
                    sb6 = sb3;
                    sArr12 = sArr6;
                    i54 = i30;
                    sArr11 = sArr11;
                    i46 = i17;
                    i50 = i50;
                    r6 = r7;
                    i45 = i12;
                    str5 = str5;
                    c2367 = c2367;
                    i47 = i47;
                    i58 = r6;
                    hashSet3 = hashSet3;
                    c2366 = c2366;
                    break;
                case -3419590:
                case 656807806:
                    if (C2419.f7754 < 0) {
                        c2367 = c2367;
                        i47 = i47;
                        sb3 = sb6;
                        i50 = i50;
                        c2366 = c2366;
                        hashSet3 = hashSet3;
                        str5 = str5;
                        sArr11 = sArr11;
                        i25 = i54;
                        sArr6 = sArr12;
                        i26 = i57;
                        sArr7 = sArr13;
                        r214 = i58;
                        i27 = i49;
                        i28 = i55;
                        i29 = i56;
                        iM2765 = (i43 - C0619.m2761("ۗ֫")) * (-61);
                        i30 = i25;
                        i12 = ((iM2765 ^ i44) * 19389) ^ 1963356996;
                        i31 = -1495791024;
                        r213 = r214;
                        i17 = iM2765 ^ i31;
                        i55 = i28;
                        i57 = i26;
                        sArr13 = sArr7;
                        i56 = i29;
                        i49 = i27;
                        r7 = r213;
                        sb6 = sb3;
                        sArr12 = sArr6;
                        i54 = i30;
                        sArr11 = sArr11;
                        i46 = i17;
                        i50 = i50;
                        r6 = r7;
                        i45 = i12;
                        str5 = str5;
                        c2367 = c2367;
                        i47 = i47;
                        i58 = r6;
                        hashSet3 = hashSet3;
                        c2366 = c2366;
                    } else {
                        iM2768 = (C0619.m2761("֫ۛ") ^ i44) * (-87);
                        i40 = ((iM2768 ^ i43) * 22825) ^ (-522754515);
                        i41 = -1728214349;
                        i46 = iM2768 ^ i41;
                        i45 = i40;
                    }
                    break;
                case 125680200:
                case 2134988631:
                    i48 = 0;
                    iM2768 = (i44 - C0773.m3169("᩸᩶")) * (-99);
                    i40 = ((iM2768 ^ i43) * (-10819)) ^ 50870355;
                    i41 = -467434882;
                    i46 = iM2768 ^ i41;
                    i45 = i40;
                    break;
                case 152223899:
                case 382057982:
                    i48++;
                    iM2768 = (i44 - C0773.m3169("᩸᩶")) * (-99);
                    i40 = ((iM2768 ^ i43) * (-10819)) ^ 50870355;
                    i41 = -467434882;
                    i46 = iM2768 ^ i41;
                    i45 = i40;
                    break;
                case 213054414:
                case 1881895142:
                    c2367 = c2367;
                    hashSet3 = hashSet3;
                    str5 = str5;
                    if (C3998.m12923(itM7968)) {
                        iM2761 = (i43 - C0619.m2761("֡ܳ")) * (-101);
                        i3 = ((iM2761 ^ i44) * 2011) ^ 1732468891;
                        i4 = -1755676908;
                    } else {
                        iM2761 = (C0619.m2761("᩶ᩴ") + i44) * (-61);
                        i3 = ((iM2761 ^ i43) * (-1749)) ^ 1523809401;
                        i4 = 1665206379;
                    }
                    i46 = iM2761 ^ i4;
                    i45 = i3;
                    str5 = str5;
                    hashSet3 = hashSet3;
                    c2367 = c2367;
                    break;
                case 289307741:
                case 590432520:
                    c2362 = c2367;
                    sb4 = sb6;
                    hashSet2 = hashSet3;
                    str4 = str5;
                    sArr9 = sArr13;
                    ?? r229 = i58;
                    int i83 = DialogInterfaceC8327.f27315;
                    c2363 = new C2361(activityC10841);
                    sArr12 = f34330;
                    i56 = 96;
                    i57 = 3;
                    r219 = r229;
                    if (C1080.m4050()) {
                        iM2767 = (C0619.m2761("ۙܽ") ^ i43) * 49;
                        i35 = ((iM2767 ^ i44) * 25993) ^ (-590310467);
                        i36 = 1451218240;
                        r218 = r229;
                    } else {
                        iM2767 = (C0619.m2761("ܺۙ") ^ i44) * (-127);
                        i35 = ((iM2767 ^ i43) * (-10041)) ^ 1925754064;
                        i36 = -2145558481;
                        r218 = r219;
                    }
                    i46 = iM2767 ^ i36;
                    sArr13 = sArr9;
                    r217 = r218;
                    c2367 = c2362;
                    sb6 = sb4;
                    HashSet hashSet12 = hashSet2;
                    c2366 = c2363;
                    i45 = i35;
                    i58 = r217;
                    str5 = str4;
                    hashSet3 = hashSet12;
                    break;
                case 416337244:
                case 1296020406:
                    if (RunnableC0334.f1808 <= 0) {
                        c2364 = c2367;
                        sb5 = sb6;
                        c2365 = c2366;
                        hashSet3 = hashSet3;
                        str = str5;
                        sArr8 = sArr12;
                        i37 = i57;
                        sArr10 = sArr13;
                        r210 = i58;
                        i38 = i56;
                        int iM31617 = C0773.m3169("ܽܺ") ^ i43;
                        c2366 = c2365;
                        i45 = ((iM31617 ^ i44) * 6949) ^ 1654138353;
                        i46 = iM31617 ^ 2088247919;
                        r29 = r210;
                        i56 = i38;
                        i57 = i37;
                        sArr13 = sArr10;
                        r8 = r29;
                        c2367 = c2364;
                        sb6 = sb5;
                        sArr12 = sArr8;
                        r5 = r8;
                        str5 = str;
                        i58 = r5;
                        hashSet3 = hashSet3;
                        c2366 = c2366;
                    }
                    c2367 = c2367;
                    i18 = i47;
                    sb2 = sb6;
                    i19 = i50;
                    c2366 = c2366;
                    hashSet3 = hashSet3;
                    str2 = str5;
                    sArr4 = sArr12;
                    i20 = i57;
                    sArr5 = sArr13;
                    r212 = i58;
                    i21 = i49;
                    i22 = i56;
                    iM2764 = (C0619.m2761("ۜ۬") ^ i43) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                    i23 = ((iM2764 ^ i44) * 31013) ^ (-984465181);
                    i24 = 836047404;
                    r211 = r212;
                    i46 = iM2764 ^ i24;
                    i45 = i23;
                    i57 = i20;
                    sArr13 = sArr5;
                    i56 = i22;
                    i49 = i21;
                    i58 = r211;
                    sb6 = sb2;
                    i47 = i18;
                    sArr12 = sArr4;
                    i50 = i19;
                    str5 = str2;
                    c2367 = c2367;
                    hashSet3 = hashSet3;
                    c2366 = c2366;
                    break;
                case 609900868:
                case 1654261886:
                    c2367 = c2367;
                    str6 = activityC10841.f34332;
                    if (str6 == null) {
                        iM3169 = (i44 - C0773.m3169("ۙۘ")) * (-13);
                        i = ((iM3169 ^ i43) * 17277) ^ (-759402473);
                        i2 = -1608411594;
                    } else {
                        iM3169 = C0619.m2761("᩹᩹") ^ i43;
                        i = ((iM3169 ^ i44) * 1333) ^ (-2045925681);
                        i2 = 611753997;
                    }
                    i46 = iM3169 ^ i2;
                    i45 = i;
                    c2367 = c2367;
                    break;
                case 890811229:
                case 2019695913:
                    activityC10841.m27568(activityC10841.f34332);
                    return z;
                case 1126417092:
                case 1806701155:
                    AbstractC0641.m2813();
                    iM2768 = (C0619.m2761("֫ۛ") ^ i44) * (-87);
                    i40 = ((iM2768 ^ i43) * 22825) ^ (-522754515);
                    i41 = -1728214349;
                    i46 = iM2768 ^ i41;
                    i45 = i40;
                    break;
                case 1153900857:
                case 1507997217:
                    return i58;
                case 1272380567:
                case 1846738374:
                    i59 = 16165;
                    iM31611 = C0619.m2761("ܳ۟") ^ i43;
                    i12 = ((iM31611 ^ i44) * (-21377)) ^ (-823358160);
                    i13 = 546641240;
                    r26 = i58;
                    i17 = iM31611 ^ i13;
                    i57 = i57;
                    sArr13 = sArr13;
                    i56 = i56;
                    i49 = i49;
                    r7 = r26;
                    sb6 = sb6;
                    sArr12 = sArr12;
                    i54 = i54;
                    i55 = i55;
                    sArr11 = sArr11;
                    i46 = i17;
                    i50 = i50;
                    r6 = r7;
                    i45 = i12;
                    str5 = str5;
                    c2367 = c2367;
                    i47 = i47;
                    i58 = r6;
                    hashSet3 = hashSet3;
                    c2366 = c2366;
                    break;
                case 1352026472:
                case 2006655453:
                    String str10 = str5;
                    C2287.m7748(hashSet4, str10);
                    hashSet = hashSet3;
                    str3 = str10;
                    i32 = i49;
                    int iM27618 = C0619.m2761("ۡۡ") ^ i43;
                    int i611 = i32;
                    i45 = ((iM27618 ^ i44) * 26387) ^ 720397827;
                    i46 = iM27618 ^ 1525113923;
                    i56 = i56;
                    i57 = i57;
                    sArr13 = sArr13;
                    i49 = i611;
                    i58 = i58;
                    sb6 = sb6;
                    c2366 = c2366;
                    sArr12 = sArr12;
                    i50 = i50;
                    str5 = str3;
                    c2367 = c2367;
                    hashSet3 = hashSet;
                    i47 = i47;
                    break;
                default:
                    c2367 = c2367;
                    c18300 = (C18300) C0950.m3796(itM7969);
                    if (C0487.m2352(hashSet4, c18300.m42687())) {
                        iM3169 = C0773.m3169("ۘܺ") ^ i43;
                        i = ((iM3169 ^ i44) * (-9957)) ^ 827832470;
                        i2 = -948478455;
                    } else {
                        iM3169 = (i44 - C0773.m3169("ۡۤ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM3169 ^ i43) * 11523) ^ (-1445395314);
                        i2 = 2127999624;
                    }
                    i46 = iM3169 ^ i2;
                    i45 = i;
                    c2367 = c2367;
                    break;
            }
        }
    }
}
