package l;

import android.view.KeyEvent;
import android.view.View;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۨ֨᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: X6KT */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC12025 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩺᩺֫, reason: not valid java name and contains not printable characters */
    private static final short[] f38759 = {5792, -29072, 29286, 18993, 26432, -28004, -31127, 18562, 23325, 29587};

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f38760;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ KeyEvent.Callback f38761;

    public /* synthetic */ ViewOnClickListenerC12025(KeyEvent.Callback callback, int i) {
        int i2 = 1900395883;
        int i3 = AbstractC0116.f1064;
        int i4 = C2419.f7754;
        this.f38760 = i;
        this.f38761 = callback;
        int iM3169 = (C0773.m3169("ܺ᩶") ^ i4) * 53;
        int i5 = ((iM3169 ^ i3) * (-32645)) ^ 1614905640;
        int i6 = 279376754;
        while (true) {
            i2 = (iM3169 ^ i6) ^ (i5 & (((i2 ^ i3) * 19921) >> 31));
            switch (i2) {
                case -1780692864:
                case -1262899253:
                    C2288.m7767();
                    iM3169 = (i4 - C0619.m2761("ۤ֡")) * (-13);
                    i5 = ((iM3169 ^ i3) * (-11661)) ^ 1473683613;
                    i6 = -1156770632;
                    break;
                case -1474558601:
                case 300571753:
                    if (C3099.f10023 <= 0) {
                        iM3169 = C0773.m3169("ܶۢ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 6687) ^ 1538470475;
                        i6 = 1061204129;
                    } else {
                        iM3169 = (i4 - C0619.m2761("ۤ֡")) * (-13);
                        i5 = ((iM3169 ^ i3) * (-11661)) ^ 1473683613;
                        i6 = -1156770632;
                    }
                    break;
                case -1430674963:
                case 618093805:
                    if (C17202.m40372()) {
                        iM3169 = C0773.m3169("ܶۢ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 6687) ^ 1538470475;
                        i6 = 1061204129;
                    } else {
                        iM3169 = C0773.m3169("ܺۗ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-27325)) ^ 952257439;
                        i6 = 368330504;
                    }
                    break;
                case -1221093561:
                case 746205674:
                    if (C2878.f9462) {
                        iM3169 = (i4 - C0619.m2761("ۤ֡")) * (-13);
                        i5 = ((iM3169 ^ i3) * (-11661)) ^ 1473683613;
                        i6 = -1156770632;
                    } else {
                        iM3169 = (C0773.m3169("۟ۖ") ^ i3) * 101;
                        i5 = ((iM3169 ^ i4) * 6981) ^ (-128284230);
                        i6 = 727484412;
                    }
                    break;
                case -250094276:
                case 1906562734:
                    return;
                case 123820242:
                case 1342806684:
                    if (C1826.m6301() >= 0) {
                        iM3169 = C0619.m2761("ᩳ֨") ^ i4;
                        i5 = ((iM3169 ^ i3) * 2821) ^ (-1036066769);
                        i6 = -1398561550;
                    } else {
                        iM3169 = (C0619.m2761("֫ۤ") ^ i3) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i5 = ((iM3169 ^ i4) * (-1711)) ^ (-704364989);
                        i6 = 943015991;
                    }
                    break;
                default:
                    C1080.m4050();
                    throw new RuntimeException();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x01d3 A[PHI: r3 r8 r9 r13 r14 r21
      0x01d3: PHI (r3v3 l.ۖۖۧ) = (r3v2 l.ۖۖۧ), (r3v2 l.ۖۖۧ), (r3v5 l.ۖۖۧ) binds: [B:39:0x0159, B:31:0x00f9, B:6:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x01d3: PHI (r8v4 int) = (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:39:0x0159, B:31:0x00f9, B:6:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x01d3: PHI (r9v5 java.lang.String) = (r9v2 java.lang.String), (r9v4 java.lang.String), (r9v2 java.lang.String) binds: [B:39:0x0159, B:31:0x00f9, B:6:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x01d3: PHI (r13v3 int) = (r13v2 int), (r13v2 int), (r13v5 int) binds: [B:39:0x0159, B:31:0x00f9, B:6:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x01d3: PHI (r14v3 int) = (r14v2 int), (r14v2 int), (r14v5 int) binds: [B:39:0x0159, B:31:0x00f9, B:6:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x01d3: PHI (r21v3 short[]) = (r21v2 short[]), (r21v2 short[]), (r21v5 short[]) binds: [B:39:0x0159, B:31:0x00f9, B:6:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int iM2761;
        int i;
        int i2;
        short[] sArr;
        short[] sArr2;
        int iM3169;
        int i3;
        int i4;
        int iM31610;
        int i5;
        int iM31611;
        int i6;
        int i7;
        int i8 = 1458854962;
        int i9 = C2702.f8586;
        int i10 = C3099.f10023;
        int iM2762 = (C0619.m2761("᩺᩸") ^ i10) * (-101);
        int i11 = ((iM2762 ^ i9) * 8711) ^ (-103407953);
        int i12 = iM2762 ^ (-1537058001);
        C2361 c2361M3794 = null;
        Object obj = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        KeyEvent.Callback callback = null;
        int iM31612 = 0;
        int iM31613 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        short s = 0;
        short s2 = 0;
        String strM9486 = null;
        short[] sArr6 = null;
        int iM2763 = 0;
        char c = 0;
        while (true) {
            i8 = i12 ^ (i11 & (((i8 ^ i9) * 21659) >> 31));
            switch (i8) {
                case -2123113532:
                case -402090551:
                    if (!C3690.m11987()) {
                        sArr = sArr6;
                        sArr5 = sArr5;
                        iM31610 = (C0773.m3169("᩺ܺ") + i9) * 11;
                        i11 = ((iM31610 ^ i10) * (-337)) ^ (-2119736960);
                        i5 = 1461664444;
                        short[] sArr7 = sArr;
                        i12 = iM31610 ^ i5;
                        sArr5 = sArr5;
                        sArr6 = sArr7;
                    } else {
                        sArr = sArr6;
                        sArr5 = sArr5;
                        sArr2 = sArr3;
                        iM3169 = C0773.m3169("ܿ۫") ^ i10;
                        sArr3 = sArr2;
                        i3 = ((iM3169 ^ i9) * 30057) ^ (-728116283);
                        i4 = 1205785860;
                        int i20 = iM3169 ^ i4;
                        i11 = i3;
                        sArr5 = sArr5;
                        sArr6 = sArr;
                        i12 = i20;
                    }
                    break;
                case -2122932350:
                case -639439435:
                    if (C2834.f9334 > 0) {
                        iM2761 = C0619.m2761("᩻ۤ") ^ i9;
                        i = ((iM2761 ^ i10) * (-20153)) ^ 1829084776;
                        i2 = -920778831;
                        i12 = iM2761 ^ i2;
                        i11 = i;
                    } else {
                        sArr = sArr6;
                        sArr5 = sArr5;
                        iM31610 = (C0773.m3169("᩺ܺ") + i9) * 11;
                        i11 = ((iM31610 ^ i10) * (-337)) ^ (-2119736960);
                        i5 = 1461664444;
                        short[] sArr8 = sArr;
                        i12 = iM31610 ^ i5;
                        sArr5 = sArr5;
                        sArr6 = sArr8;
                    }
                    break;
                case -2086595257:
                case 1681573668:
                    sArr = sArr6;
                    sArr5 = sArr5;
                    sArr2 = f38759;
                    c = 0;
                    if (C2419.f7754 >= 0) {
                        iM3169 = C0773.m3169("ܿ۫") ^ i10;
                        sArr3 = sArr2;
                        i3 = ((iM3169 ^ i9) * 30057) ^ (-728116283);
                        i4 = 1205785860;
                    } else {
                        iM3169 = (i9 - C0773.m3169("ۨܺ")) * (-95);
                        sArr3 = sArr2;
                        i3 = ((iM3169 ^ i10) * (-19441)) ^ (-394555369);
                        i4 = -63477715;
                    }
                    int i21 = iM3169 ^ i4;
                    i11 = i3;
                    sArr5 = sArr5;
                    sArr6 = sArr;
                    i12 = i21;
                    break;
                case -1601026289:
                case -1013313812:
                    i14 = 5371;
                    iM31610 = C0619.m2761("֨ۙ") ^ i10;
                    sArr = sArr6;
                    i11 = ((iM31610 ^ i9) * (-13787)) ^ (-147204654);
                    i5 = 185889458;
                    short[] sArr9 = sArr;
                    i12 = iM31610 ^ i5;
                    sArr5 = sArr5;
                    sArr6 = sArr9;
                    break;
                case -1551559836:
                case 1675941500:
                    sArr = sArr6;
                    sArr5 = sArr5;
                    int i22 = s + s2;
                    if (i19 - (i22 * i22) > 0) {
                        iM31610 = C0619.m2761("᩺ۜ") ^ i9;
                        i11 = ((iM31610 ^ i10) * (-7959)) ^ 15191381;
                        i5 = 77971123;
                    } else {
                        iM31610 = (i10 - C0619.m2761("᩺ۢ")) * 83;
                        i11 = ((iM31610 ^ i9) * 29327) ^ (-715987719);
                        i5 = 1648422678;
                    }
                    short[] sArr10 = sArr;
                    i12 = iM31610 ^ i5;
                    sArr5 = sArr5;
                    sArr6 = sArr10;
                    break;
                case -1511867172:
                case 1569535611:
                    short[] sArr11 = sArr6;
                    iM31613 = C0773.m3169(C2419.m8166(sArr11, i15, i16, i14));
                    if (C1321.f4751 >= 0) {
                        sArr5 = sArr5;
                        sArr = sArr11;
                        i13 = 2101537737;
                        iM31610 = (C0773.m3169("᩺ܺ") + i9) * 11;
                        i11 = ((iM31610 ^ i10) * (-337)) ^ (-2119736960);
                        i5 = 1461664444;
                        short[] sArr12 = sArr;
                        i12 = iM31610 ^ i5;
                        sArr5 = sArr5;
                        sArr6 = sArr12;
                    } else {
                        int iM31614 = (i10 - C0773.m3169("ۙ᩻")) * (-37);
                        i12 = iM31614 ^ 785335007;
                        sArr6 = sArr11;
                        i11 = ((iM31614 ^ i9) * (-16099)) ^ 1716072650;
                        i13 = 2101537737;
                    }
                    break;
                case -1511784453:
                case 1558120950:
                    int i23 = ActivityC0093.f1009;
                    C4238.m13537((ActivityC0093) callback);
                    break;
                case -1467445344:
                case 1288200877:
                    i14 = 26550;
                    iM31610 = C0619.m2761("֨ۙ") ^ i10;
                    sArr = sArr6;
                    i11 = ((iM31610 ^ i9) * (-13787)) ^ (-147204654);
                    i5 = 185889458;
                    short[] sArr13 = sArr;
                    i12 = iM31610 ^ i5;
                    sArr5 = sArr5;
                    sArr6 = sArr13;
                    break;
                case -1327858100:
                case 988197117:
                    C3492.m11487(c2361M3794, iM31612, obj);
                    C5416.m16141(C3099.m10090(c2361M3794));
                    break;
                case -1289082535:
                case 22148749:
                    iM2763 = C0619.m2761(AbstractC0641.m2820(sArr4, i17, 3, i14));
                    if (AbstractC0641.f2496 >= 0) {
                        iM2761 = C0619.m2761("۠ۡ") ^ i9;
                        i = ((iM2761 ^ i10) * 31851) ^ 1852384670;
                        i2 = -1853041144;
                    } else {
                        iM2761 = (C0619.m2761("ۤ֨") + i10) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM2761 ^ i9) * 31201) ^ 2071568082;
                        i2 = -1339284006;
                    }
                    i12 = iM2761 ^ i2;
                    i11 = i;
                    break;
                case -1191293335:
                case 317394547:
                    C13473.m33136(c2361M3794, iM31613 ^ i13);
                    sArr4 = f38759;
                    i17 = 4;
                    if (C13473.f42873 == 0) {
                        iM2761 = (C0619.m2761("᩺۬") + i9) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM2761 ^ i10) * 11769) ^ (-866580664);
                        i2 = 1189427319;
                        i12 = iM2761 ^ i2;
                        i11 = i;
                    } else {
                        sArr = sArr6;
                        sArr5 = sArr5;
                        iM31610 = (C0773.m3169("᩺ܺ") + i9) * 11;
                        i11 = ((iM31610 ^ i10) * (-337)) ^ (-2119736960);
                        i5 = 1461664444;
                        short[] sArr14 = sArr;
                        i12 = iM31610 ^ i5;
                        sArr5 = sArr5;
                        sArr6 = sArr14;
                    }
                    break;
                case -948702362:
                case 265506858:
                    int i24 = ActivityC22993.f74642;
                    C4238.m13537((ActivityC22993) callback);
                    break;
                case -926711969:
                case 7303051:
                    sArr = sArr6;
                    sArr5 = sArr5;
                    i19 = i18 + 1;
                    s2 = 1;
                    if (C1080.m4050()) {
                        iM31610 = (i9 - C0773.m3169("ۘ֫")) * (-13);
                        i11 = ((iM31610 ^ i10) * (-1507)) ^ 49862529;
                        i5 = 831364439;
                    } else {
                        iM31610 = (C0773.m3169("᩺ܺ") + i9) * 11;
                        i11 = ((iM31610 ^ i10) * (-337)) ^ (-2119736960);
                        i5 = 1461664444;
                    }
                    short[] sArr15 = sArr;
                    i12 = iM31610 ^ i5;
                    sArr5 = sArr5;
                    sArr6 = sArr15;
                    break;
                case -484619641:
                case 1149321220:
                    sArr = sArr6;
                    sArr5 = sArr5;
                    s = sArr3[c];
                    i18 = s * 2;
                    if (!C3077.f9998) {
                        sArr2 = sArr3;
                        iM3169 = C0773.m3169("ܿ۫") ^ i10;
                        sArr3 = sArr2;
                        i3 = ((iM3169 ^ i9) * 30057) ^ (-728116283);
                        i4 = 1205785860;
                        int i25 = iM3169 ^ i4;
                        i11 = i3;
                        sArr5 = sArr5;
                        sArr6 = sArr;
                        i12 = i25;
                    } else {
                        iM31610 = C0773.m3169("ܽۖ") ^ i10;
                        i11 = ((iM31610 ^ i9) * (-6131)) ^ (-754681101);
                        i5 = -1869520160;
                        short[] sArr16 = sArr;
                        i12 = iM31610 ^ i5;
                        sArr5 = sArr5;
                        sArr6 = sArr16;
                    }
                    break;
                case -420178725:
                case 1335309093:
                    int i26 = ActivityC3838.f13072;
                    C0950.m3790((ActivityC3838) callback);
                    break;
                case -289900428:
                case 260843936:
                    C1321.m4857(c2361M3794, 2127643331 ^ iM2763);
                    sArr5 = f38759;
                    if (C2023.f6737) {
                        iM2761 = C0619.m2761("᩻ۤ") ^ i9;
                        i = ((iM2761 ^ i10) * (-20153)) ^ 1829084776;
                        i2 = -920778831;
                    } else {
                        iM2761 = C0619.m2761("ۡۚ") ^ i9;
                        i = ((iM2761 ^ i10) * (-26851)) ^ 908540186;
                        i2 = -1159792243;
                    }
                    i12 = iM2761 ^ i2;
                    i11 = i;
                    break;
                case -223296984:
                case 792559301:
                    strM9486 = C2878.m9486(sArr5, 7, 3, i14);
                    if (C2702.f8586 <= 0) {
                        iM2761 = C0619.m2761("۠ۡ") ^ i9;
                        i = ((iM2761 ^ i10) * 31851) ^ 1852384670;
                        i2 = -1853041144;
                    } else {
                        iM2761 = (i10 - C0619.m2761("۠۠")) * 49;
                        i = ((iM2761 ^ i9) * (-29705)) ^ (-615021667);
                        i2 = 347633431;
                    }
                    i12 = iM2761 ^ i2;
                    i11 = i;
                    break;
                case -217079631:
                case 1338614842:
                    iM31612 = 2121742327 ^ C0773.m3169(strM9486);
                    obj = null;
                    if (C3492.f12043 <= 0) {
                        iM2761 = (i10 - C0619.m2761("ۛۡ")) * (-87);
                        i = ((iM2761 ^ i9) * 177) ^ (-1442022814);
                        i2 = -730063870;
                    } else {
                        iM2761 = C0619.m2761("ۘܶ") ^ i9;
                        i = ((iM2761 ^ i10) * 32257) ^ 1943875797;
                        i2 = 1921551391;
                    }
                    i12 = iM2761 ^ i2;
                    i11 = i;
                    break;
                case -141729788:
                case 263474056:
                    ((C1255) callback).toggle();
                    break;
                case 529319950:
                case 1284315501:
                    if (C2834.f9334 <= 0) {
                        sArr = sArr6;
                        sArr5 = sArr5;
                        iM31610 = (C0773.m3169("᩺ܺ") + i9) * 11;
                        i11 = ((iM31610 ^ i10) * (-337)) ^ (-2119736960);
                        i5 = 1461664444;
                        short[] sArr17 = sArr;
                        i12 = iM31610 ^ i5;
                        sArr5 = sArr5;
                        sArr6 = sArr17;
                    } else {
                        iM2761 = (i10 - C0619.m2761("ۛۡ")) * (-87);
                        i = ((iM2761 ^ i9) * 177) ^ (-1442022814);
                        i2 = -730063870;
                        i12 = iM2761 ^ i2;
                        i11 = i;
                    }
                    break;
                case 678129698:
                case 1248758940:
                    C2419.m8174();
                    C13473.m33144();
                    break;
                case 684690752:
                case 1397112325:
                    short[] sArr18 = sArr6;
                    int i27 = this.f38760;
                    short[] sArr19 = sArr5;
                    KeyEvent.Callback callback2 = this.f38761;
                    switch (i27) {
                        case 0:
                            iM31611 = C0773.m3169("᩵ܿ") ^ i10;
                            i6 = ((iM31611 ^ i9) * 22547) ^ 283615741;
                            i7 = 76466202;
                            break;
                        case 1:
                            iM31611 = (i9 - C0773.m3169("۠ܳ")) * (-101);
                            i6 = ((iM31611 ^ i10) * (-7141)) ^ 387914441;
                            i7 = 587353270;
                            break;
                        case 2:
                            iM31611 = C0619.m2761("᩹᩶") ^ i10;
                            i6 = ((iM31611 ^ i9) * (-11215)) ^ (-1036439813);
                            i7 = -1344481889;
                            break;
                        case 3:
                            int iM2764 = C0619.m2761("֫᩻") ^ i9;
                            i11 = ((iM2764 ^ i10) * 19069) ^ (-669941874);
                            sArr5 = sArr19;
                            sArr6 = sArr18;
                            i12 = iM2764 ^ 1167580652;
                            callback = callback2;
                            continue;
                        default:
                            iM31611 = C0773.m3169("᩵۠") ^ i10;
                            i6 = ((iM31611 ^ i9) * 12129) ^ 2001786077;
                            i7 = 1468174759;
                            break;
                    }
                    i12 = iM31611 ^ i7;
                    sArr5 = sArr19;
                    sArr6 = sArr18;
                    i11 = i6;
                    callback = callback2;
                    break;
                case 1199378150:
                case 1274590120:
                    C0773.m3161();
                    iM2761 = (i10 - C0619.m2761("ۛۡ")) * (-87);
                    i = ((iM2761 ^ i9) * 177) ^ (-1442022814);
                    i2 = -730063870;
                    i12 = iM2761 ^ i2;
                    i11 = i;
                    break;
                default:
                    c2361M3794 = C0950.m3794((AbstractActivityC17204) callback);
                    sArr6 = f38759;
                    i15 = 1;
                    i16 = 3;
                    if (C3998.f13671 != 0) {
                        iM2761 = C0619.m2761("۠ۡ") ^ i9;
                        i = ((iM2761 ^ i10) * 31851) ^ 1852384670;
                        i2 = -1853041144;
                    } else {
                        iM2761 = C0619.m2761("ۡᩴ") ^ i9;
                        i = ((iM2761 ^ i10) * 5409) ^ (-273741298);
                        i2 = -309545773;
                    }
                    i12 = iM2761 ^ i2;
                    i11 = i;
                    break;
            }
            return;
        }
    }
}
