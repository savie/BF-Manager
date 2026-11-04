package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.ۙۖ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: S5YY */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnClickListenerC4612 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡۫ۤ, reason: not valid java name and contains not printable characters */
    private static final short[] f16352 = {7750, -16943, -16941, -16956, -16935, -16954, -16935, -16956, -16951, -16932, -16929, -16937, -16935, -16930, -16908, -16935, -16943, -16932, -16929, -16937, 15370, -15457, -10868, 9347, -9513, 14546, -16938, -16935, -16930, -16940, -16922, -16935, -16939, -16953, -16910, -16951, -16903, -16940, -17000, -16994, -16994, -16994, -16999, -16955, -16957, -16939, -16958, -16913, -16930, -16943, -16931, -16939, 14835, -5557, 12759, 14997, -8388, 11260, -4968, -15793, -8503, 13977, -9523, -9663, 6170, -20228, -20245, -20227, -20229, -20254, -20230, 14617, -13934, -14991, -20243, -20254, -20249, -20226, -20244, -20255, -20241, -20228, -20246, -20256, -20229, -20254, -20254, -20306, -20243, -20241, -20256, -20256, -20255, -20230, -20306, -20244, -20245, -20306, -20243, -20241, -20227, -20230, -20306, -20230, -20255, -20306, -20256, -20255, -20256, -20317, -20256, -20229, -20254, -20254, -20306, -20230, -20233, -20226, -20245, -20306, -20241, -20256, -20246, -20228, -20255, -20249, -20246, -20320, -20230, -20245, -20234, -20230, -20320, -20275, -20254, -20249, -20226, -20244, -20255, -20241, -20228, -20246, -20285, -20241, -20256, -20241, -20247, -20245, -20228, -15540, 15022, 9437, -6972, 12895, -5976, -8440, -11992, -13028, -7102, 12606, 12431, 7598, -1065, -1088, -1066, -1072, -1079, -1071, 30590, -31458, -23230, 30432, -22886, -26682, -31111, -21395, -30598, 32565, -23067, -21792, 5038, 31228, 988, 5290, 4585, 2725, 10162, 58, 8961, 9651, -904, 943, 668, 10115, -7497, 940, 1618, -3384, -1594, -7233};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final TextInputLayout f16353;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final TextInputLayout f16354;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC17204 f16355;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC8327 f16356;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final TextInputLayout f16357;

    /* JADX WARN: Code duplicated, block: B:51:0x028f A[PHI: r20 r21
      0x028f: PHI (r20v4 int) = (r20v3 int), (r20v2 int), (r20v2 int) binds: [B:50:0x028d, B:36:0x01bf, B:119:0x028f] A[DONT_GENERATE, DONT_INLINE]
      0x028f: PHI (r21v4 int) = (r21v3 int), (r21v2 int), (r21v2 int) binds: [B:50:0x028d, B:36:0x01bf, B:119:0x028f] A[DONT_GENERATE, DONT_INLINE]] */
    public ViewOnClickListenerC4612(AbstractActivityC17204 abstractActivityC17204, final DialogInterfaceC8327 dialogInterfaceC8327) {
        int iM3169;
        int i;
        View view;
        EditText editText;
        InterfaceC9801 interfaceC9801;
        int i2;
        View view2;
        short[] sArr;
        int i3;
        int i4;
        View view3;
        int i5;
        int iM2761;
        ViewOnClickListenerC4612 viewOnClickListenerC4612 = this;
        dialogInterfaceC8327 = dialogInterfaceC8327;
        int i6 = C1080.f3865;
        int i7 = C20932.f66974;
        short s = f16352[0];
        int i8 = (s * s) + 34245904;
        int i9 = s + 5852;
        int i10 = (i8 + i8) - (i9 * i9) < 0 ? 8410 : 48560;
        C3734.m12144(abstractActivityC17204, C3779.m12266(f16352, 1, 8, i10));
        C3734.m12144(dialogInterfaceC8327, C2485.m8350(f16352, 9, 11, i10));
        int iM2762 = (C0619.m2761("ܰܳ") ^ i6) * (-103);
        EditText editTextM2350 = null;
        InterfaceC9801 interfaceC9802 = null;
        TextInputLayout textInputLayout = null;
        C2361 c2361M13539 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i11 = 0;
        String str = null;
        int iM2763 = 0;
        int iM2764 = 0;
        int i12 = 0;
        int iM2765 = 0;
        int i13 = 0;
        int iM31610 = 0;
        int iM31611 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        View viewM9333 = null;
        int i17 = 969568423;
        int i18 = ((iM2762 ^ i7) * 27153) ^ 1989595644;
        TextInputLayout textInputLayout2 = null;
        short[] sArr5 = null;
        TextInputLayout textInputLayout3 = null;
        int i19 = 0;
        int i20 = iM2762 ^ (-895928412);
        View viewM9942 = null;
        while (true) {
            i17 = i20 ^ (i18 & (((i17 ^ i7) * 18089) >> 31));
            switch (i17) {
                case -2052422223:
                case -637385237:
                    iM31611 = C0773.m3169(C1080.m4056(f16352, 58, 3, i10));
                    i14 = 2118814252;
                    iM3169 = (i6 - C0619.m2761("۬᩺")) * 91;
                    i18 = ((iM3169 ^ i7) * 18711) ^ 81174363;
                    i = 2051137806;
                    i20 = iM3169 ^ i;
                    break;
                case -2050389221:
                case -1418379838:
                    View viewM9334 = C2834.m9333(viewM9942, iM31610 ^ i19);
                    C2310.m7811(viewM9334, str);
                    textInputLayout = (TextInputLayout) viewM9334;
                    viewOnClickListenerC4612.f16357 = textInputLayout;
                    if (C1343.f4799 == 0) {
                        iM3169 = C0773.m3169("ܳ۬") ^ i7;
                        i18 = ((iM3169 ^ i6) * (-22771)) ^ 1584335294;
                        i = -1352226003;
                        i20 = iM3169 ^ i;
                    } else {
                        view = viewM9333;
                        editText = editTextM2350;
                        interfaceC9801 = interfaceC9802;
                        i2 = i11;
                        iM2761 = (i6 - C0619.m2761("ۖ۟")) * 19;
                        view3 = viewM9942;
                        i5 = ((iM2761 ^ i7) * (-797)) ^ 1380543115;
                        i4 = -569740631;
                        int i21 = iM2761 ^ i4;
                        dialogInterfaceC8327 = dialogInterfaceC8327;
                        interfaceC9802 = interfaceC9801;
                        View view4 = view;
                        i20 = i21;
                        i11 = i2;
                        editTextM2350 = editText;
                        i18 = i5;
                        viewM9942 = view3;
                        viewM9333 = view4;
                    }
                    break;
                case -2025138832:
                case -377026650:
                    C2375.m8070((Button) C2834.m9333(viewM9942, iM31611 ^ i14), viewOnClickListenerC4612);
                    sArr4 = f16352;
                    if (RunnableC0334.f1808 > 0) {
                        iM3169 = C0773.m3169("ᩳۢ") ^ i7;
                        i18 = ((iM3169 ^ i6) * (-545)) ^ (-1147848401);
                        i = -28059354;
                        i20 = iM3169 ^ i;
                    } else {
                        view = viewM9333;
                        editText = editTextM2350;
                        interfaceC9801 = interfaceC9802;
                        i2 = i11;
                        iM2761 = (i6 - C0619.m2761("ۖ۟")) * 19;
                        view3 = viewM9942;
                        i5 = ((iM2761 ^ i7) * (-797)) ^ 1380543115;
                        i4 = -569740631;
                        int i22 = iM2761 ^ i4;
                        dialogInterfaceC8327 = dialogInterfaceC8327;
                        interfaceC9802 = interfaceC9801;
                        View view5 = view;
                        i20 = i22;
                        i11 = i2;
                        editTextM2350 = editText;
                        i18 = i5;
                        viewM9942 = view3;
                        viewM9333 = view5;
                    }
                    break;
                case -1950218436:
                case 990791565:
                    iM2765 = C0619.m2761(RunnableC3646.m11809(f16352, 52, 3, i10));
                    i13 = 2129769837;
                    iM3169 = (i6 - C0619.m2761("ۢۜ")) * 55;
                    i18 = ((iM3169 ^ i7) * (-149)) ^ (-2042366591);
                    i = 806762119;
                    i20 = iM3169 ^ i;
                    break;
                case -1894775298:
                case -758065689:
                    viewOnClickListenerC4612.f16353 = textInputLayout2;
                    iM31610 = C0773.m3169(C1146.m4222(f16352, 55, 3, i10));
                    i19 = 2098057478;
                    if (AbstractC0641.f2496 >= 0) {
                        iM3169 = (i7 - C0619.m2761("ܳۜ")) * (-41);
                        i18 = ((iM3169 ^ i6) * (-25397)) ^ (-769957499);
                        i = 1012490615;
                    } else {
                        iM3169 = (C0773.m3169("ۧۛ") + i6) * (-119);
                        i18 = ((iM3169 ^ i7) * (-2169)) ^ (-1020395530);
                        i = -2033223545;
                    }
                    i20 = iM3169 ^ i;
                    break;
                case -1769847580:
                case -872815305:
                    C1080.m4050();
                    RunnableC0334.m2063();
                    iM3169 = C0773.m3169("ܶ֫") ^ i6;
                    i18 = ((iM3169 ^ i7) * (-25367)) ^ (-768669206);
                    i = 267988874;
                    i20 = iM3169 ^ i;
                    break;
                case -1709325956:
                case 947912956:
                    C11235.m28299((Button) C2834.m9333(viewM9942, iM2763), viewOnClickListenerC4612);
                    C17617.m41267(textInputLayout3);
                    C17617.m41267(textInputLayout2);
                    if (C4238.m13540() <= 0) {
                        iM3169 = (i7 - C0619.m2761("ܳۜ")) * (-41);
                        i18 = ((iM3169 ^ i6) * (-25397)) ^ (-769957499);
                        i = 1012490615;
                    } else {
                        iM3169 = (C0773.m3169("᩶᩻") ^ i6) * 91;
                        i18 = ((iM3169 ^ i7) * (-14387)) ^ (-70431281);
                        i = -1099138051;
                    }
                    i20 = iM3169 ^ i;
                    break;
                case -1556524773:
                case -1334612281:
                    viewOnClickListenerC4612.f16356 = C3099.m10090(c2361M13539);
                    EditText editTextM2351 = C0487.m2350(textInputLayout3);
                    C1146.m4233(editTextM2351);
                    if (editTextM2351.length() > 0) {
                        iM3169 = C0773.m3169("᩵ۘ") ^ i7;
                        i18 = ((iM3169 ^ i6) * (-17595)) ^ (-1870450318);
                        i = -779158365;
                    } else {
                        iM3169 = (C0773.m3169("᩶᩶") ^ i6) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i18 = ((iM3169 ^ i7) * 28307) ^ 1628832605;
                        i = -2019970302;
                    }
                    i20 = iM3169 ^ i;
                    break;
                case -1488139686:
                case 292871904:
                    C21576.m49090(C0487.m2350(textInputLayout3));
                    return;
                case -1231174354:
                case 576087703:
                    InterfaceC9801 interfaceC9803 = interfaceC9802;
                    EditText editText2 = editTextM2350;
                    C2354.m7978(editText2, C2702.m8877(interfaceC9803, C1519.m5399(sArr3, i11, 9, i10), null));
                    if (C3033.f9831 >= 0) {
                        editTextM2350 = editText2;
                        interfaceC9802 = interfaceC9803;
                        view2 = viewM9333;
                        int i23 = i16;
                        sArr = sArr5;
                        i3 = i23;
                        int iM31612 = C0773.m3169("᩺᩸") ^ i6;
                        i18 = 1817564402 ^ ((iM31612 ^ i7) * (-2203));
                        viewM9333 = view2;
                        i20 = iM31612 ^ (-217052867);
                        viewOnClickListenerC4612 = this;
                        short[] sArr6 = sArr;
                        i16 = i3;
                        sArr5 = sArr6;
                    } else {
                        int iM31613 = (C0773.m3169("ۛܿ") ^ i6) * (-113);
                        int i24 = i11;
                        int i25 = ((iM31613 ^ i7) * 28045) ^ (-244694548);
                        i20 = iM31613 ^ 481683481;
                        interfaceC9802 = interfaceC9803;
                        i18 = i25;
                        i11 = i24;
                        editTextM2350 = editText2;
                    }
                    break;
                case -1018973836:
                case 1849493582:
                    int i26 = i15;
                    int i27 = i16;
                    EditText editText3 = editTextM2350;
                    int i28 = i11;
                    short[] sArr7 = sArr5;
                    sArr = sArr7;
                    viewM9333 = C2834.m9333(viewM9942, C0619.m2761(C1564.m5510(sArr7, i26, i27, i10)) ^ 2101749102);
                    sArr2 = f16352;
                    int iM2766 = (i6 - C0619.m2761("᩸᩹")) * 21;
                    i3 = i27;
                    int i29 = ((iM2766 ^ i7) * (-21901)) ^ 263375520;
                    i15 = i26;
                    interfaceC9802 = interfaceC9802;
                    i20 = iM2766 ^ (-949382894);
                    i11 = i28;
                    editTextM2350 = editText3;
                    i18 = i29;
                    short[] sArr8 = sArr;
                    i16 = i3;
                    sArr5 = sArr8;
                    break;
                case -1014205719:
                case 316370405:
                    View viewM11246 = C3448.m11246(viewM9942, iM2765 ^ i13);
                    C2310.m7811(viewM11246, str);
                    textInputLayout2 = (TextInputLayout) viewM11246;
                    if (C3734.f12817 < 0) {
                        iM3169 = C0773.m3169("ܿܳ") ^ i7;
                        i18 = ((iM3169 ^ i6) * 6441) ^ 133193656;
                        i = -132318538;
                        i20 = iM3169 ^ i;
                    } else {
                        view2 = viewM9333;
                        int i210 = i16;
                        sArr = sArr5;
                        i3 = i210;
                        int iM31614 = C0773.m3169("᩺᩸") ^ i6;
                        i18 = 1817564402 ^ ((iM31614 ^ i7) * (-2203));
                        viewM9333 = view2;
                        i20 = iM31614 ^ (-217052867);
                        viewOnClickListenerC4612 = this;
                        short[] sArr9 = sArr;
                        i16 = i3;
                        sArr5 = sArr9;
                    }
                    break;
                case -864243950:
                case 419552083:
                    if (C3033.f9831 >= 0) {
                        view = viewM9333;
                        editText = editTextM2350;
                        interfaceC9801 = interfaceC9802;
                        i2 = i11;
                        iM2761 = (i6 - C0619.m2761("ۖ۟")) * 19;
                        view3 = viewM9942;
                        i5 = ((iM2761 ^ i7) * (-797)) ^ 1380543115;
                        i4 = -569740631;
                        int i211 = iM2761 ^ i4;
                        dialogInterfaceC8327 = dialogInterfaceC8327;
                        interfaceC9802 = interfaceC9801;
                        View view6 = view;
                        i20 = i211;
                        i11 = i2;
                        editTextM2350 = editText;
                        i18 = i5;
                        viewM9942 = view3;
                        viewM9333 = view6;
                    } else {
                        iM3169 = C0773.m3169("ܶ֫") ^ i6;
                        i18 = ((iM3169 ^ i7) * (-25367)) ^ (-768669206);
                        i = 267988874;
                        i20 = iM3169 ^ i;
                    }
                    break;
                case -727962772:
                case -355364515:
                    iM2763 = C0619.m2761(C1542.m5471(sArr4, 61, 3, i10)) ^ 2099074130;
                    iM3169 = (C0773.m3169("ۡ᩻") ^ i7) * 83;
                    i18 = ((iM3169 ^ i6) * 32669) ^ 666770961;
                    i = 2049800209;
                    i20 = iM3169 ^ i;
                    break;
                case -727737257:
                case 1565226661:
                    C3779.m12264();
                    throw new RuntimeException();
                case -79622363:
                case 48287473:
                    EditText editTextM2352 = C0487.m2350(textInputLayout2);
                    C1146.m4233(editTextM2352);
                    C2287.m7751(editTextM2352);
                    C21576.m49090(C20932.m47855(textInputLayout2));
                    return;
                case 86960029:
                case 1881202604:
                    C13473.m33144();
                    if (C1826.m6301() < 0) {
                        iM3169 = (i7 - C0619.m2761("ܳۜ")) * (-41);
                        i18 = ((iM3169 ^ i6) * (-25397)) ^ (-769957499);
                        i = 1012490615;
                        i20 = iM3169 ^ i;
                    } else {
                        view = viewM9333;
                        editText = editTextM2350;
                        interfaceC9801 = interfaceC9802;
                        i2 = i11;
                        iM2761 = (i6 - C0619.m2761("ۖ۟")) * 19;
                        view3 = viewM9942;
                        i5 = ((iM2761 ^ i7) * (-797)) ^ 1380543115;
                        i4 = -569740631;
                        int i212 = iM2761 ^ i4;
                        dialogInterfaceC8327 = dialogInterfaceC8327;
                        interfaceC9802 = interfaceC9801;
                        View view7 = view;
                        i20 = i212;
                        i11 = i2;
                        editTextM2350 = editText;
                        i18 = i5;
                        viewM9942 = view3;
                        viewM9333 = view7;
                    }
                    break;
                case 115741864:
                case 691173337:
                    view = viewM9333;
                    editText = editTextM2350;
                    interfaceC9801 = interfaceC9802;
                    i2 = i11;
                    viewM9942 = RunnableC3055.m9942(abstractActivityC17204, iM2764 ^ i12);
                    sArr5 = f16352;
                    i15 = 23;
                    i16 = 3;
                    if (C20932.f66974 <= 0) {
                        iM2761 = (i6 - C0619.m2761("ۖ۟")) * 19;
                        view3 = viewM9942;
                        i5 = ((iM2761 ^ i7) * (-797)) ^ 1380543115;
                        i4 = -569740631;
                    } else {
                        iM2761 = C0619.m2761("ۜۜ") ^ i7;
                        view3 = viewM9942;
                        i5 = ((iM2761 ^ i6) * (-12945)) ^ 1905828857;
                        i4 = 1156651851;
                    }
                    int i213 = iM2761 ^ i4;
                    dialogInterfaceC8327 = dialogInterfaceC8327;
                    interfaceC9802 = interfaceC9801;
                    View view8 = view;
                    i20 = i213;
                    i11 = i2;
                    editTextM2350 = editText;
                    i18 = i5;
                    viewM9942 = view3;
                    viewM9333 = view8;
                    break;
                case 461598374:
                case 678760683:
                    C2288.m7767();
                    if (C2485.f7950 != 0) {
                        iM3169 = C0773.m3169("᩸ܰ") ^ i7;
                        i18 = ((iM3169 ^ i6) * 4641) ^ 1636393540;
                        i = 1525623953;
                        i20 = iM3169 ^ i;
                    } else {
                        view = viewM9333;
                        editText = editTextM2350;
                        interfaceC9801 = interfaceC9802;
                        i2 = i11;
                        iM2761 = (i6 - C0619.m2761("ۖ۟")) * 19;
                        view3 = viewM9942;
                        i5 = ((iM2761 ^ i7) * (-797)) ^ 1380543115;
                        i4 = -569740631;
                        int i214 = iM2761 ^ i4;
                        dialogInterfaceC8327 = dialogInterfaceC8327;
                        interfaceC9802 = interfaceC9801;
                        View view9 = view;
                        i20 = i214;
                        i11 = i2;
                        editTextM2350 = editText;
                        i18 = i5;
                        viewM9942 = view3;
                        viewM9333 = view9;
                    }
                    break;
                case 592440191:
                case 1116990466:
                    C17617.m41267(textInputLayout);
                    c2361M13539 = C4238.m13539(abstractActivityC17204);
                    C1343.m4952(c2361M13539, viewM9942);
                    c2361M13539.m8003(new DialogInterface.OnCancelListener() { // from class: l.ۡۡ᩻
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            dialogInterfaceC8327.m22432();
                        }
                    });
                    iM3169 = (C0619.m2761("ۜ᩸") ^ i7) * 69;
                    i18 = ((iM3169 ^ i6) * (-25301)) ^ 1174666523;
                    i = 964018938;
                    i20 = iM3169 ^ i;
                    break;
                case 821065283:
                case 947270881:
                    EditText editText4 = editTextM2350;
                    InterfaceC9801 interfaceC9804 = interfaceC9802;
                    int i30 = i11;
                    short[] sArr10 = sArr2;
                    String strM6966 = C2023.m6966(sArr10, 26, 17, i10);
                    view2 = viewM9333;
                    C2310.m7811(view2, strM6966);
                    textInputLayout3 = (TextInputLayout) view2;
                    if (C2485.m8357() <= 0) {
                        sArr2 = sArr10;
                        interfaceC9802 = interfaceC9804;
                        str = strM6966;
                        i11 = i30;
                        editTextM2350 = editText4;
                        int i215 = i16;
                        sArr = sArr5;
                        i3 = i215;
                        int iM31615 = C0773.m3169("᩺᩸") ^ i6;
                        i18 = 1817564402 ^ ((iM31615 ^ i7) * (-2203));
                        viewM9333 = view2;
                        i20 = iM31615 ^ (-217052867);
                        viewOnClickListenerC4612 = this;
                        short[] sArr11 = sArr;
                        i16 = i3;
                        sArr5 = sArr11;
                    } else {
                        int iM31616 = (C0773.m3169("ۘᩴ") ^ i7) * 43;
                        int i31 = ((iM31616 ^ i6) * 24907) ^ 1510828665;
                        int i32 = iM31616 ^ (-2103135121);
                        interfaceC9802 = interfaceC9804;
                        i18 = i31;
                        i11 = i30;
                        editTextM2350 = editText4;
                        viewM9333 = view2;
                        i20 = i32;
                        sArr2 = sArr10;
                        str = strM6966;
                    }
                    break;
                case 1843569277:
                case 1933043415:
                    view2 = viewM9333;
                    EditText editText5 = editTextM2350;
                    InterfaceC9801 interfaceC9805 = interfaceC9802;
                    int i33 = i11;
                    int i34 = i16;
                    sArr = sArr5;
                    i3 = i34;
                    viewOnClickListenerC4612.f16355 = abstractActivityC17204;
                    iM2764 = C0619.m2761(C3779.m12266(f16352, 20, 3, i10));
                    i12 = 2130422318;
                    if (C3033.f9831 >= 0) {
                        interfaceC9802 = interfaceC9805;
                        i11 = i33;
                        editTextM2350 = editText5;
                        int iM31617 = C0773.m3169("᩺᩸") ^ i6;
                        i18 = 1817564402 ^ ((iM31617 ^ i7) * (-2203));
                        viewM9333 = view2;
                        i20 = iM31617 ^ (-217052867);
                        viewOnClickListenerC4612 = this;
                        short[] sArr12 = sArr;
                        i16 = i3;
                        sArr5 = sArr12;
                    } else {
                        int iM2767 = C0619.m2761("۬ܳ") ^ i6;
                        int i35 = ((iM2767 ^ i7) * (-18123)) ^ (-525353149);
                        dialogInterfaceC8327 = dialogInterfaceC8327;
                        viewM9333 = view2;
                        interfaceC9802 = interfaceC9805;
                        i20 = iM2767 ^ (-229311242);
                        viewOnClickListenerC4612 = this;
                        i18 = i35;
                        i11 = i33;
                        editTextM2350 = editText5;
                        i16 = i3;
                        sArr5 = sArr;
                    }
                    break;
                default:
                    viewOnClickListenerC4612.f16354 = textInputLayout3;
                    editTextM2350 = C0487.m2350(textInputLayout3);
                    RunnableC3646.m11808(editTextM2350);
                    interfaceC9802 = ApplicationC17729.f58258;
                    int i36 = ViewOnClickListenerC16544.f53550;
                    sArr3 = f16352;
                    i11 = 43;
                    if (C4282.f15546 > 0) {
                        iM3169 = C0773.m3169("ۙܶ") ^ i7;
                        i18 = ((iM3169 ^ i6) * 27955) ^ 815280521;
                        i = 144340335;
                        i20 = iM3169 ^ i;
                    } else {
                        view2 = viewM9333;
                        int i216 = i16;
                        sArr = sArr5;
                        i3 = i216;
                        int iM31618 = C0773.m3169("᩺᩸") ^ i6;
                        i18 = 1817564402 ^ ((iM31618 ^ i7) * (-2203));
                        viewM9333 = view2;
                        i20 = iM31618 ^ (-217052867);
                        viewOnClickListenerC4612 = this;
                        short[] sArr13 = sArr;
                        i16 = i3;
                        sArr5 = sArr13;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00de, code lost:
    
        if (l.C0950.f3488 < 0) goto L14;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m14413(android.view.View r38, l.C13511 r39, l.C13778 r40, l.ViewOnClickListenerC4612 r41) {
        /*
            Method dump skipped, instruction units count: 1756
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC4612.m14413(android.view.View, l.۬֨ᩴ, l.۬ۢ᩻, l.ۙۖ᩻):void");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x012f  */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        int iM3169;
        int i2;
        int i3;
        int iM31610;
        int i4;
        int i5;
        int i6;
        int iM2761;
        int i7;
        int iM31611;
        int i8;
        int i9;
        int i10;
        String strM9847;
        int iM13536;
        int iM31612;
        int i11;
        int i12;
        int i13;
        int iM2762;
        int i14;
        int i15;
        int i16;
        int i17;
        int iM2763;
        int i18;
        int i19;
        boolean z = false;
        TextInputLayout textInputLayout = null;
        TextInputLayout textInputLayout2 = null;
        int iM2764 = 0;
        AbstractActivityC17204 abstractActivityC17204 = null;
        int iM31613 = 0;
        String strM4058 = null;
        C2570 c2570 = null;
        String strM5510 = null;
        String str = null;
        short s = 0;
        int i20 = 1876893398;
        int i21 = C0487.f2131;
        int i22 = C0269.f1558;
        int iM31614 = (i21 - C0773.m3169("᩶۠")) * (-11);
        int i23 = ((iM31614 ^ i22) * 4585) ^ (-269734395);
        int i24 = iM31614 ^ 474406491;
        TextInputLayout textInputLayout3 = null;
        String strM4059 = null;
        short[] sArr = null;
        int iM10089 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int length = 0;
        int i29 = 0;
        TextInputLayout[] textInputLayoutArr = null;
        short s2 = 0;
        while (true) {
            i20 = i24 ^ (i23 & (((i20 ^ i22) * (-16645)) >> 31));
            switch (i20) {
                case -2140604492:
                case 996840979:
                    iM10089 = iM10089;
                    i27 = i27;
                    textInputLayout3 = textInputLayout3;
                    i29 = i29;
                    sArr = sArr;
                    textInputLayout2 = textInputLayout2;
                    i28 = i28;
                    textInputLayout = textInputLayout;
                    EditText editTextM47855 = C20932.m47855(textInputLayout3);
                    RunnableC3646.m11808(editTextM47855);
                    if (editTextM47855.length() < 4) {
                        iM2761 = (C0773.m3169("ۘ᩹") ^ i21) * (-103);
                        i2 = ((iM2761 ^ i22) * 24853) ^ (-526933242);
                        i7 = 2115491276;
                    } else {
                        iM2761 = C0619.m2761("᩹᩹") ^ i22;
                        i2 = ((iM2761 ^ i21) * (-13159)) ^ 2132334387;
                        i7 = -1284126537;
                    }
                    i13 = iM2761 ^ i7;
                    textInputLayout2 = textInputLayout2;
                    i29 = i29;
                    int i30 = i28;
                    textInputLayout3 = textInputLayout3;
                    i23 = i2;
                    textInputLayout = textInputLayout;
                    i28 = i30;
                    int i31 = iM10089;
                    i24 = i13;
                    sArr = sArr;
                    i27 = i27;
                    iM10089 = i31;
                    break;
                case -2122681931:
                case 1905852174:
                    C2288.m7767();
                    if (C0269.f1558 > 0) {
                        iM2763 = C0773.m3169("᩵֨") ^ i22;
                        i18 = ((iM2763 ^ i21) * 3679) ^ (-1779392080);
                        i19 = 1642979292;
                    } else {
                        iM2763 = C0773.m3169("᩵ۛ") ^ i21;
                        i18 = ((iM2763 ^ i22) * 30435) ^ 466621665;
                        i19 = 1105149243;
                    }
                    i24 = iM2763 ^ i19;
                    i23 = i18;
                    break;
                case -2075431203:
                case 1394839577:
                    iM10089 = iM10089;
                    iM31613 = C0773.m3169(C3734.m12149(sArr, i26, 3, i25)) ^ 2101610179;
                    int i32 = length;
                    int i33 = i29;
                    if (i32 != i33) {
                        int iM31615 = (C0773.m3169("ۧ۫") ^ i21) * (-81);
                        length = i32;
                        i23 = ((iM31615 ^ i22) * 15287) ^ (-1507547441);
                        i29 = i33;
                        i17 = iM10089;
                        i24 = iM31615 ^ 1327979003;
                    } else {
                        length = i32;
                        int iM2765 = (C0619.m2761("ۖۜ") ^ i22) * 39;
                        i14 = ((iM2765 ^ i21) * (-23109)) ^ 773117279;
                        i16 = iM2765 ^ (-2033923247);
                        i29 = i33;
                        i17 = iM10089;
                        i24 = i16;
                        i23 = i14;
                    }
                    iM10089 = i17;
                    break;
                case -1961436625:
                case -812200129:
                    C2023.m6964();
                    if (C2834.m9344() >= 0) {
                        iM10089 = iM10089;
                        textInputLayout3 = textInputLayout3;
                        i29 = i29;
                        textInputLayout2 = textInputLayout2;
                        i28 = i28;
                        textInputLayout = textInputLayout;
                        int i34 = i27;
                        sArr = sArr;
                        strM9847 = str;
                        iM13536 = i34;
                        int iM31616 = C0773.m3169("᩶۟") ^ i21;
                        int i35 = ((iM31616 ^ i22) * 28463) ^ 1081786999;
                        iM10089 = iM10089;
                        i24 = iM31616 ^ 605415853;
                        textInputLayout = textInputLayout;
                        i28 = i28;
                        textInputLayout3 = textInputLayout3;
                        i23 = i35;
                        textInputLayout2 = textInputLayout2;
                        i29 = i29;
                        int i36 = iM13536;
                        str = strM9847;
                        sArr = sArr;
                        i27 = i36;
                    } else {
                        iM10089 = iM10089;
                        i27 = i27;
                        textInputLayout3 = textInputLayout3;
                        i29 = i29;
                        sArr = sArr;
                        textInputLayout2 = textInputLayout2;
                        i28 = i28;
                        iM31612 = C0773.m3169("۫ܺ") ^ i21;
                        i11 = ((iM31612 ^ i22) * 29697) ^ 2073123879;
                        i12 = -1099893642;
                        int i37 = iM31612 ^ i12;
                        i28 = i28;
                        textInputLayout3 = textInputLayout3;
                        i23 = i11;
                        textInputLayout2 = textInputLayout2;
                        i29 = i29;
                        i17 = iM10089;
                        i24 = i37;
                        sArr = sArr;
                        i27 = i27;
                        iM10089 = i17;
                    }
                    break;
                case -1917961511:
                case 1516900308:
                    C2375.m8071(textInputLayout3, C0619.m2761(C0950.m3780(f16352, 191, 3, i25)) ^ 2127284127);
                    break;
                case -1817268857:
                case 1228227612:
                    C2375.m8071(textInputLayout2, iM31613);
                    break;
                case -1718444138:
                case 340993587:
                    iM10089 = iM10089;
                    i27 = i27;
                    textInputLayout3 = textInputLayout3;
                    i29 = i29;
                    sArr = sArr;
                    textInputLayout2 = textInputLayout2;
                    i28 = i28;
                    textInputLayout = textInputLayout;
                    C17202.m40379(view, RunnableC3646.m11809(f16352, 181, 1, i25));
                    if (C1564.m5509() > 0) {
                        iM2761 = C0773.m3169("ᩳۤ") ^ i22;
                        i2 = ((iM2761 ^ i21) * (-8719)) ^ (-741949356);
                        i7 = 622955321;
                        i13 = iM2761 ^ i7;
                        textInputLayout2 = textInputLayout2;
                        i29 = i29;
                        int i38 = i28;
                        textInputLayout3 = textInputLayout3;
                        i23 = i2;
                        textInputLayout = textInputLayout;
                        i28 = i38;
                        int i39 = iM10089;
                        i24 = i13;
                        sArr = sArr;
                        i27 = i27;
                        iM10089 = i39;
                    } else {
                        strM9847 = str;
                        iM13536 = i27;
                        int iM31617 = C0773.m3169("᩶۟") ^ i21;
                        int i310 = ((iM31617 ^ i22) * 28463) ^ 1081786999;
                        iM10089 = iM10089;
                        i24 = iM31617 ^ 605415853;
                        textInputLayout = textInputLayout;
                        i28 = i28;
                        textInputLayout3 = textInputLayout3;
                        i23 = i310;
                        textInputLayout2 = textInputLayout2;
                        i29 = i29;
                        int i311 = iM13536;
                        str = strM9847;
                        sArr = sArr;
                        i27 = i311;
                    }
                    break;
                case -1674567800:
                case 151712756:
                    iM10089 = iM10089;
                    i27 = i27;
                    textInputLayout3 = textInputLayout3;
                    i29 = i29;
                    sArr = sArr;
                    textInputLayout2 = textInputLayout2;
                    i28 = i28;
                    textInputLayout = textInputLayout;
                    EditText editTextM47856 = C20932.m47855(textInputLayout3);
                    C1146.m4233(editTextM47856);
                    strM4059 = C1080.m4058(C3998.m12928(editTextM47856));
                    if (C21766.m49339(strM4059)) {
                        iM2761 = (i22 - C0773.m3169("֨ᩴ")) * (-59);
                        i2 = ((iM2761 ^ i21) * (-16781)) ^ (-1587338122);
                        i7 = 1769329180;
                    } else {
                        iM2761 = C0619.m2761("ۡܶ") ^ i22;
                        i2 = ((iM2761 ^ i21) * (-8171)) ^ 1808874839;
                        i7 = 1965837246;
                    }
                    i13 = iM2761 ^ i7;
                    textInputLayout2 = textInputLayout2;
                    i29 = i29;
                    int i312 = i28;
                    textInputLayout3 = textInputLayout3;
                    i23 = i2;
                    textInputLayout = textInputLayout;
                    i28 = i312;
                    int i313 = iM10089;
                    i24 = i13;
                    sArr = sArr;
                    i27 = i27;
                    iM10089 = i313;
                    break;
                case -1662266358:
                case -599864291:
                    iM10089 = iM10089;
                    EditText editTextM2350 = C0487.m2350(textInputLayout);
                    C1146.m4233(editTextM2350);
                    strM4058 = C1080.m4058(C1826.m6309(editTextM2350));
                    if (C21766.m49335(strM4058)) {
                        iM2762 = C0773.m3169("ۗۡ") ^ i22;
                        i14 = ((iM2762 ^ i21) * (-6363)) ^ (-728318638);
                        i15 = 26899398;
                    } else {
                        iM2762 = (i21 - C0773.m3169("᩷֨")) * 53;
                        i14 = ((iM2762 ^ i22) * (-10103)) ^ (-87701409);
                        i15 = -505802932;
                    }
                    i16 = iM2762 ^ i15;
                    i17 = iM10089;
                    i24 = i16;
                    i23 = i14;
                    iM10089 = i17;
                    break;
                case -1636854183:
                case 1157659414:
                    C17202.m40372();
                    iM2763 = C0619.m2761("ۜܶ") ^ i21;
                    i18 = ((iM2763 ^ i22) * (-28337)) ^ (-1072392127);
                    i19 = -190034275;
                    i24 = iM2763 ^ i19;
                    i23 = i18;
                    break;
                case -1607514035:
                case -86028200:
                    iM10089 = iM10089;
                    i27 = i27;
                    textInputLayout3 = textInputLayout3;
                    i29 = i29;
                    short[] sArr2 = sArr;
                    textInputLayout2 = textInputLayout2;
                    i28 = i28;
                    short s3 = s2;
                    textInputLayout = textInputLayout;
                    int i40 = s3 + 16104;
                    if ((i40 * i40) - (s3 * s) >= 0) {
                        iM31611 = C0773.m3169("ۡ۠") ^ i22;
                        i8 = ((iM31611 ^ i21) * (-5853)) ^ (-1828624016);
                        i9 = 1669165108;
                    } else {
                        iM31611 = (C0773.m3169("ܿۡ") ^ i21) * (-117);
                        i8 = ((iM31611 ^ i22) * 31569) ^ 516392714;
                        i9 = 359873033;
                    }
                    i10 = iM31611 ^ i9;
                    s2 = s3;
                    sArr = sArr2;
                    i27 = i27;
                    iM10089 = iM10089;
                    i24 = i10;
                    textInputLayout = textInputLayout;
                    i28 = i28;
                    textInputLayout3 = textInputLayout3;
                    i23 = i8;
                    textInputLayout2 = textInputLayout2;
                    i29 = i29;
                    break;
                case -1459523903:
                case -134541234:
                    if (C1564.m5509() <= 0) {
                        iM10089 = iM10089;
                        i29 = i29;
                        i28 = i28;
                        textInputLayout = textInputLayout;
                        int iM2766 = (i22 - C0619.m2761("᩵۟")) * (-111);
                        i8 = ((iM2766 ^ i21) * (-20959)) ^ (-441411630);
                        i10 = iM2766 ^ 530920892;
                        i27 = i27;
                        iM10089 = iM10089;
                        i24 = i10;
                        textInputLayout = textInputLayout;
                        i28 = i28;
                        textInputLayout3 = textInputLayout3;
                        i23 = i8;
                        textInputLayout2 = textInputLayout2;
                        i29 = i29;
                    } else {
                        iM2763 = C0619.m2761("ۜܶ") ^ i21;
                        i18 = ((iM2763 ^ i22) * (-28337)) ^ (-1072392127);
                        i19 = -190034275;
                        i24 = iM2763 ^ i19;
                        i23 = i18;
                    }
                    break;
                case -1250892706:
                case 727116492:
                    iM10089 = iM10089;
                    try {
                        EditText editTextM47857 = C20932.m47855(textInputLayout2);
                        C1146.m4233(editTextM47857);
                        iM10089 = C3099.m10089(C1080.m4058(C1826.m6309(editTextM47857)));
                        iM2763 = C0619.m2761("ܶ᩶") ^ i22;
                        i18 = ((iM2763 ^ i21) * (-18275)) ^ (-2075387075);
                        i19 = 62529342;
                        i24 = iM2763 ^ i19;
                        i23 = i18;
                    } catch (NumberFormatException unused) {
                        iM2762 = (C0619.m2761("ۢᩳ") ^ i21) * (-71);
                        i14 = ((iM2762 ^ i22) * (-31679)) ^ 658693701;
                        i15 = 911176797;
                        i16 = iM2762 ^ i15;
                        i17 = iM10089;
                        i24 = i16;
                        i23 = i14;
                        iM10089 = i17;
                    }
                    break;
                case -1236006704:
                case -252014127:
                    C3077.m10038(new Thread(new RunnableC7726(strM4059, strM4058, abstractActivityC17204, c2570, 0)));
                    break;
                case -877178349:
                case 548210459:
                    iM10089 = iM10089;
                    i27 = i27;
                    textInputLayout3 = textInputLayout3;
                    i29 = i29;
                    sArr = sArr;
                    textInputLayout2 = textInputLayout2;
                    i28 = i28;
                    textInputLayoutArr[z ? 1 : 0] = textInputLayout3;
                    textInputLayout = this.f16353;
                    textInputLayoutArr[1] = textInputLayout;
                    if (C1826.f6190 <= 0) {
                        iM31612 = C0773.m3169("۫ܺ") ^ i21;
                        i11 = ((iM31612 ^ i22) * 29697) ^ 2073123879;
                        i12 = -1099893642;
                    } else {
                        iM31612 = (i22 - C0773.m3169("᩷ܶ")) * (-13);
                        i11 = ((iM31612 ^ i21) * 30539) ^ 628975237;
                        i12 = -35546478;
                    }
                    int i314 = iM31612 ^ i12;
                    i28 = i28;
                    textInputLayout3 = textInputLayout3;
                    i23 = i11;
                    textInputLayout2 = textInputLayout2;
                    i29 = i29;
                    i17 = iM10089;
                    i24 = i314;
                    sArr = sArr;
                    i27 = i27;
                    iM10089 = i17;
                    break;
                case -634716993:
                case -18706563:
                    C2375.m8071(textInputLayout2, iM31613);
                    break;
                case -503078243:
                case 1934769689:
                    iM10089 = iM10089;
                    i27 = i27;
                    textInputLayout3 = textInputLayout3;
                    i29 = i29;
                    sArr = sArr;
                    textInputLayout2 = textInputLayout2;
                    i28 = i28;
                    textInputLayout = textInputLayout;
                    s2 = f16352[180];
                    s = 64416;
                    if (C4282.f15546 > 0) {
                        iM2761 = C0619.m2761("ۢۧ") ^ i21;
                        i2 = ((iM2761 ^ i22) * 24357) ^ (-791089505);
                        i7 = -1218522352;
                        i13 = iM2761 ^ i7;
                        textInputLayout2 = textInputLayout2;
                        i29 = i29;
                        int i315 = i28;
                        textInputLayout3 = textInputLayout3;
                        i23 = i2;
                        textInputLayout = textInputLayout;
                        i28 = i315;
                        int i316 = iM10089;
                        i24 = i13;
                        sArr = sArr;
                        i27 = i27;
                        iM10089 = i316;
                    } else {
                        textInputLayout = textInputLayout;
                        iM31612 = C0773.m3169("۫ܺ") ^ i21;
                        i11 = ((iM31612 ^ i22) * 29697) ^ 2073123879;
                        i12 = -1099893642;
                        int i317 = iM31612 ^ i12;
                        i28 = i28;
                        textInputLayout3 = textInputLayout3;
                        i23 = i11;
                        textInputLayout2 = textInputLayout2;
                        i29 = i29;
                        i17 = iM10089;
                        i24 = i317;
                        sArr = sArr;
                        i27 = i27;
                        iM10089 = i17;
                    }
                    break;
                case -472001953:
                case 1578624813:
                    C1343.m4943();
                    break;
                case -279747747:
                case 1712676861:
                    iM10089 = iM10089;
                    i27 = i27;
                    textInputLayout3 = textInputLayout3;
                    i29 = i29;
                    sArr = sArr;
                    i28 = i28;
                    textInputLayout = textInputLayout;
                    textInputLayout2 = textInputLayout2;
                    strM5510 = C1564.m5510(f16352, 182, 3, i25);
                    if (C4282.f15546 > 0) {
                        iM2761 = (C0619.m2761("ۙ᩵") ^ i22) * 109;
                        i2 = ((iM2761 ^ i21) * (-26249)) ^ 701339656;
                        i7 = -787826894;
                        i13 = iM2761 ^ i7;
                        textInputLayout2 = textInputLayout2;
                        i29 = i29;
                        int i318 = i28;
                        textInputLayout3 = textInputLayout3;
                        i23 = i2;
                        textInputLayout = textInputLayout;
                        i28 = i318;
                        int i319 = iM10089;
                        i24 = i13;
                        sArr = sArr;
                        i27 = i27;
                        iM10089 = i319;
                    } else {
                        sArr = sArr;
                        int iM2767 = (i22 - C0619.m2761("᩵۟")) * (-111);
                        i8 = ((iM2767 ^ i21) * (-20959)) ^ (-441411630);
                        i10 = iM2767 ^ 530920892;
                        i27 = i27;
                        iM10089 = iM10089;
                        i24 = i10;
                        textInputLayout = textInputLayout;
                        i28 = i28;
                        textInputLayout3 = textInputLayout3;
                        i23 = i8;
                        textInputLayout2 = textInputLayout2;
                        i29 = i29;
                    }
                    break;
                case -267766699:
                case 1360302676:
                    C11235.m28302(textInputLayout3, C0773.m3169(strM5510) ^ 2127221009);
                    break;
                case 174336503:
                case 2009265621:
                    iM10089 = iM10089;
                    i27 = i27;
                    int i41 = i28;
                    int i42 = i29;
                    sArr = sArr;
                    textInputLayout = textInputLayout;
                    TextInputLayout textInputLayout4 = textInputLayout2;
                    TextInputLayout[] textInputLayoutArr2 = new TextInputLayout[3];
                    z = false;
                    TextInputLayout textInputLayout5 = this.f16354;
                    if (C2485.f7950 != 0) {
                        iM31610 = C0773.m3169("ۨۚ") ^ i22;
                        i4 = ((iM31610 ^ i21) * (-18565)) ^ 382606503;
                        i5 = -1538220350;
                    } else {
                        iM31610 = C0773.m3169("᩶ۢ") ^ i21;
                        i4 = ((iM31610 ^ i22) * 30043) ^ (-871459007);
                        i5 = -591057369;
                    }
                    i6 = iM31610 ^ i5;
                    textInputLayoutArr = textInputLayoutArr2;
                    i23 = i4;
                    textInputLayout2 = textInputLayout4;
                    i29 = i42;
                    i = i41;
                    textInputLayout3 = textInputLayout5;
                    sArr = sArr;
                    i27 = i27;
                    iM10089 = iM10089;
                    i24 = i6;
                    textInputLayout = textInputLayout;
                    i28 = i;
                    break;
                case 259874512:
                case 1939644611:
                    sArr = sArr;
                    iM10089 = iM10089;
                    textInputLayout3 = textInputLayout3;
                    i29 = i29;
                    i28 = i28;
                    textInputLayout = textInputLayout;
                    iM13536 = C4238.m13536(view);
                    strM9847 = C3033.m9847(f16352, 185, 3, i25);
                    if (C0269.m1775() <= 0) {
                        textInputLayout2 = textInputLayout2;
                        int iM31618 = C0773.m3169("᩶۟") ^ i21;
                        int i3110 = ((iM31618 ^ i22) * 28463) ^ 1081786999;
                        iM10089 = iM10089;
                        i24 = iM31618 ^ 605415853;
                        textInputLayout = textInputLayout;
                        i28 = i28;
                        textInputLayout3 = textInputLayout3;
                        i23 = i3110;
                        textInputLayout2 = textInputLayout2;
                        i29 = i29;
                        int i3111 = iM13536;
                        str = strM9847;
                        sArr = sArr;
                        i27 = i3111;
                    } else {
                        int iM31619 = C0773.m3169("᩹ܳ") ^ i21;
                        i29 = i29;
                        textInputLayout3 = textInputLayout3;
                        i23 = ((iM31619 ^ i22) * 26963) ^ (-827028741);
                        iM10089 = iM10089;
                        i24 = iM31619 ^ 1349941874;
                        textInputLayout = textInputLayout;
                        i28 = i28;
                        str = strM9847;
                        sArr = sArr;
                        i27 = iM13536;
                    }
                    break;
                case 332037671:
                case 1983714117:
                    iM10089 = iM10089;
                    EditText editTextM2351 = C0487.m2350(textInputLayout2);
                    RunnableC3646.m11808(editTextM2351);
                    length = editTextM2351.length();
                    i29 = 6;
                    sArr = f16352;
                    i26 = 194;
                    if (C1564.m5509() > 0) {
                        iM2762 = (i22 - C0619.m2761("ۘۤ")) * 77;
                        i14 = ((iM2762 ^ i21) * 13661) ^ (-837160617);
                        i15 = 1692028590;
                        i16 = iM2762 ^ i15;
                        i17 = iM10089;
                        i24 = i16;
                        i23 = i14;
                        iM10089 = i17;
                    } else {
                        i29 = 6;
                        i28 = i28;
                        textInputLayout = textInputLayout;
                        int iM2768 = (i22 - C0619.m2761("᩵۟")) * (-111);
                        i8 = ((iM2768 ^ i21) * (-20959)) ^ (-441411630);
                        i10 = iM2768 ^ 530920892;
                        i27 = i27;
                        iM10089 = iM10089;
                        i24 = i10;
                        textInputLayout = textInputLayout;
                        i28 = i28;
                        textInputLayout3 = textInputLayout3;
                        i23 = i8;
                        textInputLayout2 = textInputLayout2;
                        i29 = i29;
                    }
                    break;
                case 336491295:
                case 1685444370:
                    iM10089 = iM10089;
                    i27 = i27;
                    textInputLayout3 = textInputLayout3;
                    i29 = i29;
                    sArr = sArr;
                    i28 = i28;
                    textInputLayout = textInputLayout;
                    textInputLayout2 = this.f16357;
                    textInputLayoutArr[2] = textInputLayout2;
                    if (C17617.m41270(textInputLayoutArr)) {
                        iM3169 = (C0619.m2761("᩸᩸") + i21) * 109;
                        i2 = ((iM3169 ^ i22) * (-8175)) ^ 2005127381;
                        i3 = -2017371185;
                    } else {
                        iM3169 = C0773.m3169("ܿۜ") ^ i21;
                        i2 = ((iM3169 ^ i22) * (-17597)) ^ 1865974857;
                        i3 = 739980918;
                    }
                    i13 = iM3169 ^ i3;
                    i29 = i29;
                    int i3112 = i28;
                    textInputLayout3 = textInputLayout3;
                    i23 = i2;
                    textInputLayout = textInputLayout;
                    i28 = i3112;
                    int i3113 = iM10089;
                    i24 = i13;
                    sArr = sArr;
                    i27 = i27;
                    iM10089 = i3113;
                    break;
                case 454663948:
                case 1319665168:
                    if (!RunnableC1848.f6235) {
                        iM10089 = iM10089;
                        i27 = i27;
                        textInputLayout3 = textInputLayout3;
                        i29 = i29;
                        sArr = sArr;
                        textInputLayout2 = textInputLayout2;
                        i28 = i28;
                        iM31612 = C0773.m3169("۫ܺ") ^ i21;
                        i11 = ((iM31612 ^ i22) * 29697) ^ 2073123879;
                        i12 = -1099893642;
                        int i3114 = iM31612 ^ i12;
                        i28 = i28;
                        textInputLayout3 = textInputLayout3;
                        i23 = i11;
                        textInputLayout2 = textInputLayout2;
                        i29 = i29;
                        i17 = iM10089;
                        i24 = i3114;
                        sArr = sArr;
                        i27 = i27;
                        iM10089 = i17;
                    } else {
                        iM10089 = iM10089;
                        i29 = i29;
                        i28 = i28;
                        textInputLayout = textInputLayout;
                        int iM2769 = (i22 - C0619.m2761("᩵۟")) * (-111);
                        i8 = ((iM2769 ^ i21) * (-20959)) ^ (-441411630);
                        i10 = iM2769 ^ 530920892;
                        i27 = i27;
                        iM10089 = iM10089;
                        i24 = i10;
                        textInputLayout = textInputLayout;
                        i28 = i28;
                        textInputLayout3 = textInputLayout3;
                        i23 = i8;
                        textInputLayout2 = textInputLayout2;
                        i29 = i29;
                    }
                    break;
                case 754744609:
                case 1607981911:
                    C23916.m53431(view, z);
                    C13511 c13511 = new C13511(abstractActivityC17204, iM2764);
                    C1343.m4951(c13511);
                    if (C2966.f9654 < 0) {
                        C8536 c8536 = new C8536(c13511, view, this);
                        ReentrantLock reentrantLock = C11650.f37690;
                        C3077.m10038(new C13691(strM4059, iM10089, abstractActivityC17204, c8536));
                    }
                    iM10089 = iM10089;
                    i27 = i27;
                    textInputLayout3 = textInputLayout3;
                    i29 = i29;
                    sArr = sArr;
                    textInputLayout2 = textInputLayout2;
                    i28 = i28;
                    iM31612 = C0773.m3169("۫ܺ") ^ i21;
                    i11 = ((iM31612 ^ i22) * 29697) ^ 2073123879;
                    i12 = -1099893642;
                    int i3115 = iM31612 ^ i12;
                    i28 = i28;
                    textInputLayout3 = textInputLayout3;
                    i23 = i11;
                    textInputLayout2 = textInputLayout2;
                    i29 = i29;
                    i17 = iM10089;
                    i24 = i3115;
                    sArr = sArr;
                    i27 = i27;
                    iM10089 = i17;
                    break;
                case 786182451:
                case 974469664:
                    C23916.m53431(view, z);
                    C13511 c13512 = new C13511(abstractActivityC17204, iM2764);
                    C1343.m4951(c13512);
                    C2570 c2571 = new C2570(c13512, this, view);
                    ReentrantLock reentrantLock2 = C11650.f37690;
                    if (C2419.m8174() < 0) {
                        int iM27610 = C0619.m2761("ۤܽ") ^ i22;
                        iM10089 = iM10089;
                        i14 = ((iM27610 ^ i21) * (-28169)) ^ 617209907;
                        i16 = iM27610 ^ (-541272809);
                        c2570 = c2571;
                        i17 = iM10089;
                        i24 = i16;
                        i23 = i14;
                        iM10089 = i17;
                    } else {
                        c2570 = c2571;
                        iM2763 = C0773.m3169("ۤ᩹") ^ i22;
                        i18 = ((iM2763 ^ i21) * 24849) ^ (-441177853);
                        i19 = 1591476314;
                        i24 = iM2763 ^ i19;
                        i23 = i18;
                    }
                    break;
                case 810660705:
                case 1905944656:
                    if (C1321.f4751 >= 0) {
                        iM2763 = C0773.m3169("᩵֨") ^ i22;
                        i18 = ((iM2763 ^ i21) * 3679) ^ (-1779392080);
                        i19 = 1642979292;
                        i24 = iM2763 ^ i19;
                        i23 = i18;
                    } else {
                        iM10089 = iM10089;
                        i29 = i29;
                        i28 = i28;
                        textInputLayout = textInputLayout;
                        int iM27611 = (i22 - C0619.m2761("᩵۟")) * (-111);
                        i8 = ((iM27611 ^ i21) * (-20959)) ^ (-441411630);
                        i10 = iM27611 ^ 530920892;
                        i27 = i27;
                        iM10089 = iM10089;
                        i24 = i10;
                        textInputLayout = textInputLayout;
                        i28 = i28;
                        textInputLayout3 = textInputLayout3;
                        i23 = i8;
                        textInputLayout2 = textInputLayout2;
                        i29 = i29;
                    }
                    break;
                case 862426524:
                case 867729817:
                    if (C23916.f77426 > 0) {
                        iM2763 = C0619.m2761("֡ܽ") ^ i22;
                        i18 = ((iM2763 ^ i21) * (-18111)) ^ 396014272;
                        i19 = -1371775978;
                        i24 = iM2763 ^ i19;
                        i23 = i18;
                    } else {
                        iM10089 = iM10089;
                        i27 = i27;
                        textInputLayout3 = textInputLayout3;
                        i29 = i29;
                        sArr = sArr;
                        textInputLayout2 = textInputLayout2;
                        i28 = i28;
                        iM31612 = C0773.m3169("۫ܺ") ^ i21;
                        i11 = ((iM31612 ^ i22) * 29697) ^ 2073123879;
                        i12 = -1099893642;
                        int i3116 = iM31612 ^ i12;
                        i28 = i28;
                        textInputLayout3 = textInputLayout3;
                        i23 = i11;
                        textInputLayout2 = textInputLayout2;
                        i29 = i29;
                        i17 = iM10089;
                        i24 = i3116;
                        sArr = sArr;
                        i27 = i27;
                        iM10089 = i17;
                    }
                    break;
                case 940752191:
                case 2040833708:
                    C11235.m28302(textInputLayout, C0619.m2761(C17202.m40377(f16352, 197, 3, i25)) ^ 2097736351);
                    break;
                case 1191446192:
                case 1655985388:
                    textInputLayout = textInputLayout;
                    iM10089 = iM10089;
                    i27 = i27;
                    textInputLayout3 = textInputLayout3;
                    i29 = i29;
                    sArr = sArr;
                    int iM27612 = C0619.m2761(str) ^ 2125874505;
                    if (!C1783.m6232()) {
                        i28 = iM27612;
                        textInputLayout2 = textInputLayout2;
                        sArr = sArr;
                        int iM27613 = (i22 - C0619.m2761("᩵۟")) * (-111);
                        i8 = ((iM27613 ^ i21) * (-20959)) ^ (-441411630);
                        i10 = iM27613 ^ 530920892;
                        i27 = i27;
                        iM10089 = iM10089;
                        i24 = i10;
                        textInputLayout = textInputLayout;
                        i28 = i28;
                        textInputLayout3 = textInputLayout3;
                        i23 = i8;
                        textInputLayout2 = textInputLayout2;
                        i29 = i29;
                    } else {
                        int iM31620 = C0773.m3169("۠۟") ^ i21;
                        int i43 = ((iM31620 ^ i22) * (-31205)) ^ (-1088786832);
                        i6 = iM31620 ^ (-51575154);
                        i29 = i29;
                        i = iM27612;
                        textInputLayout3 = textInputLayout3;
                        i23 = i43;
                        sArr = sArr;
                        i27 = i27;
                        iM10089 = iM10089;
                        i24 = i6;
                        textInputLayout = textInputLayout;
                        i28 = i;
                    }
                    break;
                case 1278948404:
                case 1627658508:
                    i25 = 31114;
                    iM2761 = C0773.m3169("᩻֫") ^ i22;
                    i2 = ((iM2761 ^ i21) * 3935) ^ 2027206060;
                    i7 = 991331516;
                    i13 = iM2761 ^ i7;
                    textInputLayout2 = textInputLayout2;
                    i29 = i29;
                    int i3117 = i28;
                    textInputLayout3 = textInputLayout3;
                    i23 = i2;
                    textInputLayout = textInputLayout;
                    i28 = i3117;
                    int i3118 = iM10089;
                    i24 = i13;
                    sArr = sArr;
                    i27 = i27;
                    iM10089 = i3118;
                    break;
                case 1454194981:
                case 2055468839:
                    if (C2310.f7472 >= 0) {
                        iM2763 = C0773.m3169("᩵֨") ^ i22;
                        i18 = ((iM2763 ^ i21) * 3679) ^ (-1779392080);
                        i19 = 1642979292;
                    } else {
                        iM2763 = C0773.m3169("ۤ᩹") ^ i22;
                        i18 = ((iM2763 ^ i21) * 24849) ^ (-441177853);
                        i19 = 1591476314;
                    }
                    i24 = iM2763 ^ i19;
                    i23 = i18;
                    break;
                case 1549968279:
                case 1843744844:
                    i25 = 12235;
                    iM2761 = C0773.m3169("᩻֫") ^ i22;
                    i2 = ((iM2761 ^ i21) * 3935) ^ 2027206060;
                    i7 = 991331516;
                    i13 = iM2761 ^ i7;
                    textInputLayout2 = textInputLayout2;
                    i29 = i29;
                    int i3119 = i28;
                    textInputLayout3 = textInputLayout3;
                    i23 = i2;
                    textInputLayout = textInputLayout;
                    i28 = i3119;
                    int i31110 = iM10089;
                    i24 = i13;
                    sArr = sArr;
                    i27 = i27;
                    iM10089 = i31110;
                    break;
                case 1758917045:
                case 2070066167:
                    break;
                default:
                    iM10089 = iM10089;
                    textInputLayout3 = textInputLayout3;
                    i29 = i29;
                    iM2764 = 2119014488 ^ C0619.m2761(C3448.m11252(f16352, 188, 3, i25));
                    abstractActivityC17204 = this.f16355;
                    i27 = i27;
                    sArr = sArr;
                    int i44 = i28;
                    if (i27 != i44) {
                        i28 = i44;
                        iM3169 = (C0773.m3169("᩸ۘ") ^ i21) * 87;
                        textInputLayout = textInputLayout;
                        i2 = ((iM3169 ^ i22) * (-23517)) ^ (-1365329913);
                        i3 = -2116722803;
                        i13 = iM3169 ^ i3;
                        i29 = i29;
                        int i31111 = i28;
                        textInputLayout3 = textInputLayout3;
                        i23 = i2;
                        textInputLayout = textInputLayout;
                        i28 = i31111;
                        int i31112 = iM10089;
                        i24 = i13;
                        sArr = sArr;
                        i27 = i27;
                        iM10089 = i31112;
                    } else {
                        int iM31621 = (C0773.m3169("֫۫") ^ i21) * (-113);
                        i29 = i29;
                        i = i44;
                        textInputLayout3 = textInputLayout3;
                        i23 = ((iM31621 ^ i22) * (-3433)) ^ 1449084870;
                        sArr = sArr;
                        i27 = i27;
                        iM10089 = iM10089;
                        i24 = iM31621 ^ 2055897557;
                        i28 = i;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m14414(ViewOnClickListenerC4612 viewOnClickListenerC4612) {
        int i = 1020048430;
        int i2 = C3033.f9831;
        int i3 = AbstractC0641.f2496;
        int iM2761 = (C0619.m2761("ᩳۛ") ^ i2) * 27;
        int i4 = ((iM2761 ^ i3) * (-16441)) ^ 1619176929;
        int i5 = 1938875479;
        while (true) {
            i = ((((i ^ i3) * (-30537)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -1769805524:
                case 1471819407:
                    if (RunnableC0334.f1808 > 0) {
                        iM2761 = (i2 - C0773.m3169("᩹֨")) * 55;
                        i4 = ((iM2761 ^ i3) * (-13389)) ^ (-2010919939);
                        i5 = -146235281;
                    } else {
                        iM2761 = C0773.m3169("᩸ܺ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-13207)) ^ (-1849698614);
                        i5 = 648091759;
                    }
                    break;
                case -914489337:
                case 340859623:
                    if (C2485.f7950 == 0) {
                        iM2761 = C0619.m2761("ܳۚ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 13911) ^ 1097499390;
                        i5 = -360347063;
                    } else {
                        iM2761 = (i2 - C0773.m3169("᩹֨")) * 55;
                        i4 = ((iM2761 ^ i3) * (-13389)) ^ (-2010919939);
                        i5 = -146235281;
                    }
                    break;
                case 892423122:
                case 1892844258:
                    AbstractC0641.m2813();
                    C2288.m7767();
                    break;
                case 1245703475:
                case 1880326543:
                    C0773.m3161();
                    if (!C1519.m5403()) {
                        iM2761 = (i2 - C0773.m3169("᩹֨")) * 55;
                        i4 = ((iM2761 ^ i3) * (-13389)) ^ (-2010919939);
                        i5 = -146235281;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ۛ᩵")) * 53;
                        i4 = ((iM2761 ^ i2) * 5553) ^ 1239110897;
                        i5 = 679770228;
                    }
                    break;
                case 1615919548:
                case 1814307083:
                    AbstractC3624.m11755();
                    iM2761 = (i2 - C0773.m3169("᩹֨")) * 55;
                    i4 = ((iM2761 ^ i3) * (-13389)) ^ (-2010919939);
                    i5 = -146235281;
                    break;
                default:
                    if (C2354.f7599 < 0) {
                        if (C2878.m9491() > 0) {
                            if (C1826.f6190 > 0) {
                                if (!C0619.f2439 && C4282.m13644()) {
                                    if (C3448.f11240 < 0) {
                                        if (C3033.f9831 < 0) {
                                            if (C2288.f7433 > 0 && C3734.f12817 < 0) {
                                                AbstractActivityC17204 abstractActivityC17204 = viewOnClickListenerC4612.f16355;
                                                if (C3734.f12817 < 0) {
                                                    new ViewOnClickListenerC16544(abstractActivityC17204, null);
                                                } else {
                                                    iM2761 = (C0773.m3169("ۗۙ") ^ i3) * (-71);
                                                    i4 = ((iM2761 ^ i2) * 30715) ^ 1408718178;
                                                    i5 = 887685027;
                                                }
                                                break;
                                            }
                                        }
                                    }
                                }
                                break;
                            }
                            iM2761 = C0619.m2761("ܳۚ") ^ i3;
                            i4 = ((iM2761 ^ i2) * 13911) ^ 1097499390;
                            i5 = -360347063;
                            break;
                        }
                        iM2761 = (i2 - C0773.m3169("᩹֨")) * 55;
                        i4 = ((iM2761 ^ i3) * (-13389)) ^ (-2010919939);
                        i5 = -146235281;
                        break;
                    }
                    iM2761 = (i3 - C0773.m3169("ۛ᩵")) * 53;
                    i4 = ((iM2761 ^ i2) * 5553) ^ 1239110897;
                    i5 = 679770228;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00fe A[PHI: r6 r7 r8
      0x00fe: PHI (r6v4 short[]) = (r6v2 short[]), (r6v3 short[]), (r6v2 short[]), (r6v2 short[]) binds: [B:29:0x00fc, B:25:0x00d0, B:15:0x0070, B:13:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x00fe: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int) binds: [B:29:0x00fc, B:25:0x00d0, B:15:0x0070, B:13:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x00fe: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:29:0x00fc, B:25:0x00d0, B:15:0x0070, B:13:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x01b8 A[PHI: r3 r10 r11 r12 r23
      0x01b8: PHI (r3v31 l.ۖۖۧ) = (r3v1 l.ۖۖۧ), (r3v1 l.ۖۖۧ), (r3v28 l.ۖۖۧ), (r3v1 l.ۖۖۧ) binds: [B:86:0x01b8, B:47:0x01b6, B:41:0x0187, B:13:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x01b8: PHI (r10v5 short[]) = (r10v1 short[]), (r10v1 short[]), (r10v2 short[]), (r10v1 short[]) binds: [B:86:0x01b8, B:47:0x01b6, B:41:0x0187, B:13:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x01b8: PHI (r11v5 int) = (r11v1 int), (r11v1 int), (r11v2 int), (r11v1 int) binds: [B:86:0x01b8, B:47:0x01b6, B:41:0x0187, B:13:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x01b8: PHI (r12v5 int) = (r12v1 int), (r12v1 int), (r12v2 int), (r12v1 int) binds: [B:86:0x01b8, B:47:0x01b6, B:41:0x0187, B:13:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x01b8: PHI (r23v8 l.ܽ֡֫) = (r23v1 l.ܽ֡֫), (r23v2 l.ܽ֡֫), (r23v1 l.ܽ֡֫), (r23v1 l.ܽ֡֫) binds: [B:86:0x01b8, B:47:0x01b6, B:41:0x0187, B:13:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m14415(View view, C13511 c13511, C13778 c13778, ViewOnClickListenerC4612 viewOnClickListenerC4612) {
        int iM3169;
        int i;
        int iM2761;
        int i2;
        int i3;
        ViewOnClickListenerC4612 viewOnClickListenerC4613 = viewOnClickListenerC4612;
        C2361 c2361M13539 = null;
        int iM31610 = 0;
        String str = null;
        int i4 = 0;
        short[] sArr = null;
        int i5 = 0;
        int i6 = 0;
        short[] sArr2 = null;
        int i7 = 0;
        int i8 = 0;
        int i9 = 1157403871;
        int i10 = C20932.f66974;
        int i11 = C0269.f1558;
        int iM2762 = C0619.m2761("۫۠") ^ i10;
        int i12 = ((iM2762 ^ i11) * 2123) ^ 1827455226;
        int i13 = iM2762 ^ (-33221072);
        int i14 = 0;
        int i15 = 0;
        short s = 0;
        short s2 = 0;
        AbstractActivityC17204 abstractActivityC17204 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        while (true) {
            i9 = i13 ^ ((((i9 ^ i11) * (-8919)) >> 31) & i12);
            switch (i9) {
                case -2136587869:
                case -1582546056:
                    sArr4 = f16352;
                    i14 = 177;
                    i15 = 3;
                    if (C23916.m53419() != 0) {
                        iM3169 = C0773.m3169("۬᩸") ^ i10;
                        i12 = ((iM3169 ^ i11) * (-26531)) ^ (-32973938);
                        i = -426760585;
                    } else {
                        iM3169 = (C0619.m2761("ۗ᩷") + i11) * 23;
                        i12 = ((iM3169 ^ i10) * 13651) ^ 997625075;
                        i = 640473302;
                    }
                    i13 = iM3169 ^ i;
                    break;
                case -2082273522:
                case -866377730:
                    C3492.m11488();
                    break;
                case -2046868177:
                case 1045783076:
                    if (C3998.f13671 == 0) {
                        iM3169 = C0773.m3169("۬᩸") ^ i10;
                        i12 = ((iM3169 ^ i11) * (-26531)) ^ (-32973938);
                        i = -426760585;
                    } else {
                        iM3169 = C0773.m3169("ۚ֫") ^ i11;
                        i12 = ((iM3169 ^ i10) * (-32213)) ^ 95317169;
                        i = 1899746033;
                    }
                    i13 = iM3169 ^ i;
                    break;
                case -1908107326:
                case -1672686969:
                    C2485.m8345(c2361M13539, C0619.m2761(C3077.m10047(sArr, i5, i6, i4)) ^ 2097939401);
                    if (C0269.f1558 > 0) {
                        iM3169 = (i10 - C0773.m3169("ۖۧ")) * 45;
                        i12 = ((iM3169 ^ i11) * (-3685)) ^ 1566548705;
                        i = -1155890538;
                        i13 = iM3169 ^ i;
                    } else {
                        c2361M13539 = c2361M13539;
                        iM2761 = C0773.m3169("ۡ᩵") ^ i10;
                        i2 = ((iM2761 ^ i11) * (-22281)) ^ 478970473;
                        i3 = 345589013;
                        int i16 = iM2761 ^ i3;
                        i12 = i2;
                        c2361M13539 = c2361M13539;
                        viewOnClickListenerC4613 = viewOnClickListenerC4612;
                        i13 = i16;
                    }
                    break;
                case -1624589506:
                case -451891827:
                    c2361M13539 = c2361M13539;
                    C17202.m40379(c13778, C0487.m2361(f16352, 162, 6, i4));
                    C1564.m5521(c13511);
                    if (C2878.m9488(c13778)) {
                        iM2761 = C0773.m3169("᩸᩸") ^ i10;
                        i2 = ((iM2761 ^ i11) * (-23085)) ^ 502772561;
                        i3 = -1058216359;
                    } else {
                        iM2761 = C0619.m2761("᩷ۨ") ^ i11;
                        i2 = ((iM2761 ^ i10) * 24557) ^ 837515708;
                        i3 = -974561706;
                    }
                    int i17 = iM2761 ^ i3;
                    i12 = i2;
                    c2361M13539 = c2361M13539;
                    viewOnClickListenerC4613 = viewOnClickListenerC4612;
                    i13 = i17;
                    break;
                case -1619445637:
                case -1160694191:
                    i4 = 64421;
                    iM2761 = C0619.m2761("᩶ۗ") ^ i10;
                    i2 = ((iM2761 ^ i11) * 19381) ^ 1451418244;
                    i3 = -1243264870;
                    int i18 = iM2761 ^ i3;
                    i12 = i2;
                    c2361M13539 = c2361M13539;
                    viewOnClickListenerC4613 = viewOnClickListenerC4612;
                    i13 = i18;
                    break;
                case -1584946616:
                case 423739551:
                    iM31610 = C0773.m3169(C1519.m5399(sArr4, i14, i15, i4)) ^ 2129615385;
                    if (C0950.f3488 >= 0) {
                        iM3169 = C0619.m2761("ۜ֫") ^ i10;
                        i12 = ((iM3169 ^ i11) * 20405) ^ (-1994988600);
                        i = 1964214295;
                    } else {
                        iM3169 = (i11 - C0773.m3169("᩹ܳ")) * (-103);
                        i12 = ((iM3169 ^ i10) * 7745) ^ 2035379189;
                        i = -1522334486;
                    }
                    i13 = iM3169 ^ i;
                    break;
                case -1152875383:
                case 1533948422:
                    c2361M13539 = c2361M13539;
                    s = sArr3[161];
                    s2 = 2;
                    if (C13473.m33144()) {
                        iM2761 = C0619.m2761("᩻ۚ") ^ i11;
                        i2 = ((iM2761 ^ i10) * (-15785)) ^ (-46323309);
                        i3 = 568388234;
                    } else {
                        iM2761 = C0773.m3169("ۡ᩵") ^ i10;
                        i2 = ((iM2761 ^ i11) * (-22281)) ^ 478970473;
                        i3 = 345589013;
                    }
                    int i19 = iM2761 ^ i3;
                    i12 = i2;
                    c2361M13539 = c2361M13539;
                    viewOnClickListenerC4613 = viewOnClickListenerC4612;
                    i13 = i19;
                    break;
                case -998335669:
                case -357761768:
                    C2354.m7982(view, true);
                    c2361M13539 = c2361M13539;
                    String strM4861 = C1321.m4861(f16352, 168, 3, i4);
                    if (C4238.f15451 >= 0) {
                        str = strM4861;
                        iM2761 = C0773.m3169("ۡ᩵") ^ i10;
                        i2 = ((iM2761 ^ i11) * (-22281)) ^ 478970473;
                        i3 = 345589013;
                        int i110 = iM2761 ^ i3;
                        i12 = i2;
                        c2361M13539 = c2361M13539;
                        viewOnClickListenerC4613 = viewOnClickListenerC4612;
                        i13 = i110;
                    } else {
                        int iM31611 = C0773.m3169("ܿ᩸") ^ i11;
                        str = strM4861;
                        i12 = ((iM31611 ^ i10) * 11719) ^ (-1194690574);
                        c2361M13539 = c2361M13539;
                        i13 = iM31611 ^ 2125855954;
                        viewOnClickListenerC4613 = viewOnClickListenerC4612;
                    }
                    break;
                case -946850321:
                case -661694849:
                    if (C13473.f42873 != 0) {
                        iM3169 = C0619.m2761("ۜ֫") ^ i10;
                        i12 = ((iM3169 ^ i11) * 20405) ^ (-1994988600);
                        i = 1964214295;
                        i13 = iM3169 ^ i;
                    } else {
                        c2361M13539 = c2361M13539;
                        iM2761 = C0773.m3169("ۡ᩵") ^ i10;
                        i2 = ((iM2761 ^ i11) * (-22281)) ^ 478970473;
                        i3 = 345589013;
                        int i111 = iM2761 ^ i3;
                        i12 = i2;
                        c2361M13539 = c2361M13539;
                        viewOnClickListenerC4613 = viewOnClickListenerC4612;
                        i13 = i111;
                    }
                    break;
                case -921762042:
                case -241447222:
                    C1321.m4857(c2361M13539, C0773.m3169(C2354.m7980(sArr2, i7, i8, i4)) ^ 2129757961);
                    if (AbstractC0641.f2496 >= 0) {
                        iM3169 = C0773.m3169("۬᩸") ^ i10;
                        i12 = ((iM3169 ^ i11) * (-26531)) ^ (-32973938);
                        i = -426760585;
                    } else {
                        iM3169 = C0773.m3169("ܿۢ") ^ i10;
                        i12 = ((iM3169 ^ i11) * 28095) ^ 327041660;
                        i = -1435865435;
                    }
                    i13 = iM3169 ^ i;
                    break;
                case -909153894:
                case 1587995863:
                    C3492.m11487(c2361M13539, iM31610, null);
                    C5416.m16141(C3099.m10090(c2361M13539));
                    break;
                case -725023776:
                case 1277411519:
                    c2361M13539 = c2361M13539;
                    sArr3 = f16352;
                    if (C1080.f3865 >= 0) {
                        iM2761 = C0619.m2761("᩶ۧ") ^ i11;
                        i2 = ((iM2761 ^ i10) * 15137) ^ 2107124123;
                        i3 = -388655423;
                    } else {
                        iM2761 = C0619.m2761("ۘۘ") ^ i10;
                        i2 = ((iM2761 ^ i11) * (-23893)) ^ 879625553;
                        i3 = -1853581556;
                    }
                    int i112 = iM2761 ^ i3;
                    i12 = i2;
                    c2361M13539 = c2361M13539;
                    viewOnClickListenerC4613 = viewOnClickListenerC4612;
                    i13 = i112;
                    break;
                case -439933161:
                case 1585287423:
                    C20932.m47848();
                    AbstractC0641.m2813();
                    iM3169 = C0773.m3169("۬᩸") ^ i10;
                    i12 = ((iM3169 ^ i11) * (-26531)) ^ (-32973938);
                    i = -426760585;
                    i13 = iM3169 ^ i;
                    break;
                case -366779940:
                case 639475555:
                    EditText editTextM47855 = C20932.m47855(viewOnClickListenerC4613.f16357);
                    RunnableC3646.m11808(editTextM47855);
                    C0862.m3505(editTextM47855);
                    AbstractActivityC17204 abstractActivityC17205 = viewOnClickListenerC4613.f16355;
                    if (C3099.f10023 <= 0) {
                        abstractActivityC17204 = abstractActivityC17205;
                        iM3169 = C0773.m3169("ۚ֫") ^ i11;
                        i12 = ((iM3169 ^ i10) * (-32213)) ^ 95317169;
                        i = 1899746033;
                        i13 = iM3169 ^ i;
                    } else {
                        int iM31612 = C0773.m3169("᩹ܽ") ^ i10;
                        abstractActivityC17204 = abstractActivityC17205;
                        i13 = iM31612 ^ 351826344;
                        i12 = ((iM31612 ^ i11) * 31807) ^ (-2018015673);
                    }
                    break;
                case 245713194:
                case 1784156970:
                    c2361M13539 = c2361M13539;
                    int i20 = s + 1;
                    if ((i20 * i20) - ((s * s2) + 1) >= 0) {
                        iM2761 = C0773.m3169("ۘ۟") ^ i10;
                        i2 = ((iM2761 ^ i11) * 83) ^ (-297579059);
                        i3 = -1877137965;
                    } else {
                        iM2761 = (i11 - C0773.m3169("ܰۧ")) * (-65);
                        i2 = ((iM2761 ^ i10) * (-21259)) ^ (-1481726877);
                        i3 = 137582365;
                    }
                    int i113 = iM2761 ^ i3;
                    i12 = i2;
                    c2361M13539 = c2361M13539;
                    viewOnClickListenerC4613 = viewOnClickListenerC4612;
                    i13 = i113;
                    break;
                case 1043825353:
                case 1432516748:
                    c2361M13539 = C4238.m13539(abstractActivityC17204);
                    sArr = f16352;
                    i5 = 171;
                    i6 = 3;
                    if (C2023.f6737) {
                        iM3169 = C0773.m3169("ۚ֫") ^ i11;
                        i12 = ((iM3169 ^ i10) * (-32213)) ^ 95317169;
                        i = 1899746033;
                    } else {
                        iM3169 = (C0773.m3169("ۤۨ") + i11) * (-73);
                        i12 = ((iM3169 ^ i10) * 28253) ^ 580895813;
                        i = 182135367;
                    }
                    i13 = iM3169 ^ i;
                    break;
                case 1052920370:
                case 1686242538:
                    sArr2 = f16352;
                    i7 = 174;
                    i8 = 3;
                    if (C2834.f9334 > 0) {
                        iM3169 = (C0619.m2761("۬ܺ") ^ i11) * (-47);
                        i12 = ((iM3169 ^ i10) * 32283) ^ 1027617792;
                        i = -1693046361;
                        i13 = iM3169 ^ i;
                    } else {
                        c2361M13539 = c2361M13539;
                        iM2761 = C0619.m2761("᩶ۧ") ^ i11;
                        i2 = ((iM2761 ^ i10) * 15137) ^ 2107124123;
                        i3 = -388655423;
                        int i114 = iM2761 ^ i3;
                        i12 = i2;
                        c2361M13539 = c2361M13539;
                        viewOnClickListenerC4613 = viewOnClickListenerC4612;
                        i13 = i114;
                    }
                    break;
                case 1204335091:
                case 1374920660:
                    C22673.m51155(C3033.m9850(c13778, C0619.m2761(str) ^ 2100458846));
                    break;
                case 1608489693:
                case 2097322636:
                    if (C2702.f8586 <= 0) {
                        c2361M13539 = c2361M13539;
                        iM2761 = C0773.m3169("ۡ᩵") ^ i10;
                        i2 = ((iM2761 ^ i11) * (-22281)) ^ 478970473;
                        i3 = 345589013;
                        int i115 = iM2761 ^ i3;
                        i12 = i2;
                        c2361M13539 = c2361M13539;
                        viewOnClickListenerC4613 = viewOnClickListenerC4612;
                        i13 = i115;
                    } else {
                        iM3169 = C0773.m3169("ۚ֫") ^ i11;
                        i12 = ((iM3169 ^ i10) * (-32213)) ^ 95317169;
                        i = 1899746033;
                        i13 = iM3169 ^ i;
                    }
                    break;
                default:
                    i4 = 54733;
                    iM2761 = C0619.m2761("᩶ۗ") ^ i10;
                    i2 = ((iM2761 ^ i11) * 19381) ^ 1451418244;
                    i3 = -1243264870;
                    int i116 = iM2761 ^ i3;
                    i12 = i2;
                    c2361M13539 = c2361M13539;
                    viewOnClickListenerC4613 = viewOnClickListenerC4612;
                    i13 = i116;
                    break;
            }
            return;
        }
    }
}
