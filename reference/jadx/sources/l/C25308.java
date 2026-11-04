package l;

import android.view.View;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import bin.mt.plus.Main;
import org.bouncycastle.pqc.crypto.picnic.PicnicEngine;

/* JADX INFO: renamed from: l.᩻᩷۫, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5PI */
/* JADX INFO: loaded from: classes.dex */
public final class C25308 {

    /* JADX INFO: renamed from: ֫ܿܿ, reason: not valid java name and contains not printable characters */
    private static final short[] f81756;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f81757;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f81758;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC15610 f81759;

    static {
        ApplicationC23172.m52091(PicnicEngine.MAX_AUX_BYTES);
        f81756 = new short[]{58, 32333, 32279, 32270, 32275, 5908, 29644, 29993, 17005, 10092, 10093, 10096, 10024, 10040, 10044, 10040, 10092, 10093, 10096, 10024, 10040, 10044, 10041, 10092, 10093, 10096, 10024, 10040, 10043, 10045, 10092, 10093, 10096, 10024, 10040, 10043, 10047, 10092, 10093, 10096, 10024, 10040, 10043, 10032, 10092, 10093, 10096, 10024, 10040, 10043, 10033, 29743, 26746, 29806, 10092, 10093, 10096, 10071, 10094, 10081, 10096, 10093, 10106, 10071, 10092, 10093, 10096, 10071, 10110, 10093, 10106, 10107, 10081, 10087, 10086, 1330, 12463, -14405, 13580};
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static native void m56570(AbstractC22044 abstractC22044, AbstractC22044 abstractC22045, int i, boolean z, boolean z2, InterfaceC15610 interfaceC15610);

    /* JADX WARN: Code duplicated, block: B:73:0x048c A[PHI: r0 r2 r8 r9 r10 r11 r16 r17 r18 r21 r23 r27 r28 r29 r31 r32
      0x048c: PHI (r0v57 short[]) = (r0v12 short[]), (r0v17 short[]), (r0v18 short[]), (r0v58 short[]) binds: [B:72:0x048a, B:61:0x03bd, B:57:0x037f, B:13:0x0094] A[DONT_GENERATE, DONT_INLINE]
      0x048c: PHI (r2v42 int) = (r2v15 int), (r2v21 int), (r2v22 int), (r2v43 int) binds: [B:72:0x048a, B:61:0x03bd, B:57:0x037f, B:13:0x0094] A[DONT_GENERATE, DONT_INLINE]
      0x048c: PHI (r8v31 int) = (r8v8 int), (r8v13 int), (r8v14 int), (r8v32 int) binds: [B:72:0x048a, B:61:0x03bd, B:57:0x037f, B:13:0x0094] A[DONT_GENERATE, DONT_INLINE]
      0x048c: PHI (r9v31 int) = (r9v8 int), (r9v13 int), (r9v14 int), (r9v32 int) binds: [B:72:0x048a, B:61:0x03bd, B:57:0x037f, B:13:0x0094] A[DONT_GENERATE, DONT_INLINE]
      0x048c: PHI (r10v30 short[]) = (r10v8 short[]), (r10v13 short[]), (r10v14 short[]), (r10v31 short[]) binds: [B:72:0x048a, B:61:0x03bd, B:57:0x037f, B:13:0x0094] A[DONT_GENERATE, DONT_INLINE]
      0x048c: PHI (r11v24 int) = (r11v8 int), (r11v10 int), (r11v11 int), (r11v25 int) binds: [B:72:0x048a, B:61:0x03bd, B:57:0x037f, B:13:0x0094] A[DONT_GENERATE, DONT_INLINE]
      0x048c: PHI (r16v7 int) = (r16v2 int), (r16v3 int), (r16v2 int), (r16v2 int) binds: [B:72:0x048a, B:61:0x03bd, B:57:0x037f, B:13:0x0094] A[DONT_GENERATE, DONT_INLINE]
      0x048c: PHI (r17v7 short) = (r17v3 short), (r17v2 short), (r17v2 short), (r17v2 short) binds: [B:72:0x048a, B:61:0x03bd, B:57:0x037f, B:13:0x0094] A[DONT_GENERATE, DONT_INLINE]
      0x048c: PHI (r18v7 int) = (r18v3 int), (r18v2 int), (r18v2 int), (r18v2 int) binds: [B:72:0x048a, B:61:0x03bd, B:57:0x037f, B:13:0x0094] A[DONT_GENERATE, DONT_INLINE]
      0x048c: PHI (r21v25 int) = (r21v8 int), (r21v13 int), (r21v14 int), (r21v26 int) binds: [B:72:0x048a, B:61:0x03bd, B:57:0x037f, B:13:0x0094] A[DONT_GENERATE, DONT_INLINE]
      0x048c: PHI (r23v28 short[]) = (r23v8 short[]), (r23v13 short[]), (r23v14 short[]), (r23v29 short[]) binds: [B:72:0x048a, B:61:0x03bd, B:57:0x037f, B:13:0x0094] A[DONT_GENERATE, DONT_INLINE]
      0x048c: PHI (r27v40 short[]) = (r27v10 short[]), (r27v15 short[]), (r27v16 short[]), (r27v41 short[]) binds: [B:72:0x048a, B:61:0x03bd, B:57:0x037f, B:13:0x0094] A[DONT_GENERATE, DONT_INLINE]
      0x048c: PHI (r28v6 java.lang.String) = (r28v1 java.lang.String), (r28v1 java.lang.String), (r28v2 java.lang.String), (r28v1 java.lang.String) binds: [B:72:0x048a, B:61:0x03bd, B:57:0x037f, B:13:0x0094] A[DONT_GENERATE, DONT_INLINE]
      0x048c: PHI (r29v21 java.lang.String) = (r29v2 java.lang.String), (r29v7 java.lang.String), (r29v8 java.lang.String), (r29v22 java.lang.String) binds: [B:72:0x048a, B:61:0x03bd, B:57:0x037f, B:13:0x0094] A[DONT_GENERATE, DONT_INLINE]
      0x048c: PHI (r31v21 java.lang.String) = (r31v4 java.lang.String), (r31v9 java.lang.String), (r31v10 java.lang.String), (r31v22 java.lang.String) binds: [B:72:0x048a, B:61:0x03bd, B:57:0x037f, B:13:0x0094] A[DONT_GENERATE, DONT_INLINE]
      0x048c: PHI (r32v17 l.ۢ֫ܺ) = (r32v4 l.ۢ֫ܺ), (r32v9 l.ۢ֫ܺ), (r32v10 l.ۢ֫ܺ), (r32v18 l.ۢ֫ܺ) binds: [B:72:0x048a, B:61:0x03bd, B:57:0x037f, B:13:0x0094] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Spinner m56568(Main main, View view) {
        InterfaceC9801 interfaceC9801;
        short[] sArr;
        String strM12925;
        String str;
        short[] sArr2;
        short[] sArr3;
        int i;
        int i2;
        int i3;
        short[] sArr4;
        int i4;
        int i5;
        int i6;
        int iM2761;
        int i7;
        int i8;
        int i9;
        int iM3169;
        int i10;
        int i11;
        int i12;
        int i13;
        InterfaceC9801 interfaceC9802;
        short[] sArr5;
        String str2;
        String str3;
        short[] sArr6;
        int i14;
        int i15;
        short[] sArr7;
        int i16;
        short[] sArr8;
        int i17;
        int i18;
        int i19;
        InterfaceC9801 interfaceC9803;
        short[] sArr9;
        int i20;
        short[] sArr10;
        int i21;
        int i22;
        int iM31610;
        int i23;
        String[] strArr = null;
        int i24 = 1729198742;
        int i25 = C3448.f11240;
        int i26 = C3690.f12684;
        int iM31611 = C0773.m3169("ܰܿ") ^ i26;
        int i27 = ((iM31611 ^ i25) * 25555) ^ (-1974926209);
        int i28 = iM31611 ^ 377657555;
        String strM11996 = null;
        String str4 = null;
        String strM11997 = null;
        C3054 c3054 = null;
        InterfaceC9801 interfaceC9804 = null;
        short[] sArr11 = null;
        short[] sArr12 = null;
        int i29 = 0;
        int i30 = 0;
        int i31 = 0;
        int i32 = 0;
        int iM2762 = 0;
        int iM2763 = 0;
        short s = 0;
        int i33 = 0;
        String strM11765 = null;
        int i34 = 0;
        String str5 = null;
        short[] sArr13 = null;
        int i35 = 0;
        Spinner spinner = null;
        short[] sArr14 = null;
        String strM11769 = null;
        while (true) {
            i24 = i28 ^ (i27 & (((i24 ^ i25) * (-20981)) >> 31));
            switch (i24) {
                case -2066256100:
                case 1222179935:
                    RunnableC1848.m6360();
                    int iM31612 = (C0773.m3169("ۚܿ") + i25) * 21;
                    i28 = iM31612 ^ (-167017355);
                    i27 = ((iM31612 ^ i26) * (-4865)) ^ (-1051684623);
                    break;
                case -1926561633:
                case 10633334:
                    RunnableC0334.m2063();
                    if (AbstractC3624.f12429 <= 0) {
                        interfaceC9801 = interfaceC9804;
                        sArr = sArr14;
                        strM12925 = str5;
                        str = str4;
                        sArr2 = sArr13;
                        sArr3 = sArr11;
                        i = i35;
                        i2 = i30;
                        i3 = i31;
                        sArr4 = sArr12;
                        i4 = i29;
                        iM2761 = C0619.m2761("۫ۗ") ^ i25;
                        i6 = ((iM2761 ^ i26) * 17657) ^ 1112884804;
                        i5 = 574355773;
                        int i36 = iM2761 ^ i5;
                        i31 = i3;
                        i30 = i2;
                        str4 = str;
                        interfaceC9804 = interfaceC9801;
                        sArr13 = sArr2;
                        str5 = strM12925;
                        i27 = i6;
                        i35 = i;
                        sArr14 = sArr;
                        i28 = i36;
                        i29 = i4;
                        sArr12 = sArr4;
                        sArr11 = sArr3;
                    } else {
                        int iM31613 = (C0773.m3169("ۚܿ") + i25) * 21;
                        i28 = iM31613 ^ (-167017355);
                        i27 = ((iM31613 ^ i26) * (-4865)) ^ (-1051684623);
                    }
                    break;
                case -1727573078:
                case 169538519:
                    spinner.setSelection(C2288.m7764(0, C2354.m7976(6, interfaceC9804.getInt(C3779.m12266(sArr12, i30, i32, i31), 0))));
                    return spinner;
                case -1694034326:
                case 432643498:
                    interfaceC9804 = interfaceC9804;
                    sArr14 = sArr14;
                    str5 = str5;
                    str4 = str4;
                    sArr13 = sArr13;
                    sArr11 = sArr11;
                    i35 = i35;
                    i30 = i30;
                    i7 = i31;
                    sArr12 = sArr12;
                    i8 = i29;
                    i9 = i34;
                    if (((s * 2) + 1) - (i33 * i33) > 0) {
                        iM3169 = C0619.m2761("ۚ᩶") ^ i25;
                        i10 = ((iM3169 ^ i26) * (-30925)) ^ 504398567;
                        i11 = -1042393671;
                    } else {
                        iM3169 = C0619.m2761("۠ۖ") ^ i26;
                        i10 = ((iM3169 ^ i25) * 32391) ^ (-1636189188);
                        i11 = 354615717;
                    }
                    i12 = iM3169 ^ i11;
                    i34 = i9;
                    i29 = i8;
                    i31 = i7;
                    i30 = i30;
                    sArr12 = sArr12;
                    str4 = str4;
                    interfaceC9804 = interfaceC9804;
                    sArr11 = sArr11;
                    i27 = i10;
                    i35 = i35;
                    sArr13 = sArr13;
                    sArr14 = sArr14;
                    str5 = str5;
                    i28 = i12;
                    break;
                case -1533816626:
                case -1499712575:
                    interfaceC9801 = interfaceC9804;
                    sArr4 = sArr12;
                    sArr = sArr14;
                    str = str4;
                    sArr2 = sArr13;
                    i4 = i29;
                    i = i35;
                    i2 = i30;
                    i3 = i31;
                    strM11996 = C3690.m11996(sArr2, i, i4, i3);
                    strM12925 = C3998.m12925(f81756, 23, 7, i3);
                    sArr3 = f81756;
                    i34 = 30;
                    if (C3077.f9998) {
                        iM2761 = (C0619.m2761("ۨܳ") ^ i26) * 49;
                        i6 = ((iM2761 ^ i25) * 12305) ^ 509794085;
                        i5 = -814054243;
                    } else {
                        iM2761 = C0619.m2761("۫ۗ") ^ i25;
                        i6 = ((iM2761 ^ i26) * 17657) ^ 1112884804;
                        i5 = 574355773;
                    }
                    int i37 = iM2761 ^ i5;
                    i31 = i3;
                    i30 = i2;
                    str4 = str;
                    interfaceC9804 = interfaceC9801;
                    sArr13 = sArr2;
                    str5 = strM12925;
                    i27 = i6;
                    i35 = i;
                    sArr14 = sArr;
                    i28 = i37;
                    i29 = i4;
                    sArr12 = sArr4;
                    sArr11 = sArr3;
                    break;
                case -1329382627:
                case 2035506351:
                    if (C2834.f9334 > 0) {
                        interfaceC9804 = interfaceC9804;
                        sArr14 = sArr14;
                        str5 = str5;
                        str4 = str4;
                        sArr13 = sArr13;
                        sArr11 = sArr11;
                        i35 = i35;
                        i30 = i30;
                        i7 = i31;
                        sArr12 = sArr12;
                        i8 = i29;
                        i9 = i34;
                        iM3169 = C0773.m3169("ۨۡ") ^ i26;
                        i10 = ((iM3169 ^ i25) * 25179) ^ 1491893286;
                        i11 = -1171983739;
                        i12 = iM3169 ^ i11;
                        i34 = i9;
                        i29 = i8;
                        i31 = i7;
                        i30 = i30;
                        sArr12 = sArr12;
                        str4 = str4;
                        interfaceC9804 = interfaceC9804;
                        sArr11 = sArr11;
                        i27 = i10;
                        i35 = i35;
                        sArr13 = sArr13;
                        sArr14 = sArr14;
                        str5 = str5;
                        i28 = i12;
                    } else {
                        int iM31614 = (C0773.m3169("ۚܿ") + i25) * 21;
                        i28 = iM31614 ^ (-167017355);
                        i27 = ((iM31614 ^ i26) * (-4865)) ^ (-1051684623);
                    }
                    break;
                case -1295215891:
                case 1124794848:
                    interfaceC9804 = interfaceC9804;
                    sArr14 = sArr14;
                    str5 = str5;
                    str4 = str4;
                    sArr13 = sArr13;
                    sArr11 = sArr11;
                    i35 = i35;
                    i30 = i30;
                    i7 = i31;
                    sArr12 = sArr12;
                    i8 = i29;
                    i9 = i34;
                    iM2763 = C0619.m2761(C2375.m8069(f81756, 6, 3, i7));
                    if (C4238.f15451 >= 0) {
                        iM3169 = C0773.m3169("ۨۡ") ^ i26;
                        i10 = ((iM3169 ^ i25) * 25179) ^ 1491893286;
                        i11 = -1171983739;
                    } else {
                        iM3169 = (i25 - C0619.m2761("᩻ܶ")) * (-23);
                        i10 = ((iM3169 ^ i26) * 20221) ^ 583960528;
                        i11 = -862432180;
                    }
                    i12 = iM3169 ^ i11;
                    i34 = i9;
                    i29 = i8;
                    i31 = i7;
                    i30 = i30;
                    sArr12 = sArr12;
                    str4 = str4;
                    interfaceC9804 = interfaceC9804;
                    sArr11 = sArr11;
                    i27 = i10;
                    i35 = i35;
                    sArr13 = sArr13;
                    sArr14 = sArr14;
                    str5 = str5;
                    i28 = i12;
                    break;
                case -1014394711:
                case -898459433:
                    if (C3492.f12043 <= 0) {
                        interfaceC9802 = interfaceC9804;
                        sArr5 = sArr14;
                        str2 = str5;
                        str3 = str4;
                        sArr8 = sArr13;
                        sArr6 = sArr11;
                        i13 = i30;
                        i15 = i31;
                        sArr7 = sArr12;
                        i16 = i29;
                        i14 = i34;
                        int iM2764 = (i25 - C0619.m2761("֡ܳ")) * (-21);
                        i17 = ((iM2764 ^ i26) * (-529)) ^ 1211282966;
                        i18 = iM2764 ^ (-1957613229);
                        i34 = i14;
                        i29 = i16;
                        i30 = i13;
                        sArr12 = sArr7;
                        sArr14 = sArr5;
                        str5 = str2;
                        sArr11 = sArr6;
                        sArr13 = sArr8;
                        i28 = i18;
                        i27 = i17;
                        i31 = i15;
                        str4 = str3;
                        interfaceC9804 = interfaceC9802;
                    } else {
                        interfaceC9804 = interfaceC9804;
                        sArr14 = sArr14;
                        str5 = str5;
                        str4 = str4;
                        sArr13 = sArr13;
                        sArr11 = sArr11;
                        i35 = i35;
                        i30 = i30;
                        i7 = i31;
                        sArr12 = sArr12;
                        i8 = i29;
                        i9 = i34;
                        iM3169 = C0773.m3169("ۨۡ") ^ i26;
                        i10 = ((iM3169 ^ i25) * 25179) ^ 1491893286;
                        i11 = -1171983739;
                        i12 = iM3169 ^ i11;
                        i34 = i9;
                        i29 = i8;
                        i31 = i7;
                        i30 = i30;
                        sArr12 = sArr12;
                        str4 = str4;
                        interfaceC9804 = interfaceC9804;
                        sArr11 = sArr11;
                        i27 = i10;
                        i35 = i35;
                        sArr13 = sArr13;
                        sArr14 = sArr14;
                        str5 = str5;
                        i28 = i12;
                    }
                    break;
                case -1009098586:
                case 698672622:
                    i19 = i31;
                    interfaceC9803 = interfaceC9804;
                    sArr9 = sArr14;
                    str5 = str5;
                    sArr13 = sArr13;
                    sArr11 = sArr11;
                    i20 = i35;
                    int i38 = i30;
                    sArr10 = sArr12;
                    i21 = i29;
                    i22 = i34;
                    String strM47853 = C20932.m47853(sArr11, i22, 7, i19);
                    strM11997 = C3690.m11996(f81756, 37, 7, i19);
                    if (C3033.m9845() <= 0) {
                        str4 = strM47853;
                        i30 = i38;
                        interfaceC9804 = interfaceC9803;
                        int iM31615 = C0773.m3169("᩷᩶") ^ i26;
                        int i39 = ((iM31615 ^ i25) * (-17941)) ^ 373438490;
                        i12 = iM31615 ^ 1045581769;
                        i34 = i22;
                        i29 = i21;
                        sArr13 = sArr13;
                        i31 = i19;
                        sArr12 = sArr10;
                        str5 = str5;
                        str4 = str4;
                        sArr11 = sArr11;
                        i27 = i39;
                        i35 = i20;
                        sArr14 = sArr9;
                        i28 = i12;
                    } else {
                        int iM31616 = C0773.m3169("۟᩷") ^ i25;
                        i34 = i22;
                        i29 = i21;
                        i31 = i19;
                        sArr12 = sArr10;
                        interfaceC9804 = interfaceC9803;
                        sArr11 = sArr11;
                        str4 = strM47853;
                        i27 = ((iM31616 ^ i26) * (-13995)) ^ (-91480152);
                        i30 = i38;
                        sArr13 = sArr13;
                        str5 = str5;
                        i28 = iM31616 ^ 368984476;
                        i35 = i20;
                        sArr14 = sArr9;
                    }
                    break;
                case -954100855:
                case 2015600235:
                    spinner = (Spinner) C3448.m11246(view, iM2762);
                    spinner.setAdapter((SpinnerAdapter) c3054);
                    interfaceC9804 = ApplicationC17729.f58258;
                    sArr12 = f81756;
                    i32 = 21;
                    if (C1542.f5343 <= 0) {
                        sArr9 = sArr14;
                        i30 = 54;
                        i20 = i35;
                        i19 = i31;
                        sArr10 = sArr12;
                        i21 = i29;
                        i22 = i34;
                        int iM31617 = C0773.m3169("᩷᩶") ^ i26;
                        int i310 = ((iM31617 ^ i25) * (-17941)) ^ 373438490;
                        i12 = iM31617 ^ 1045581769;
                        i34 = i22;
                        i29 = i21;
                        sArr13 = sArr13;
                        i31 = i19;
                        sArr12 = sArr10;
                        str5 = str5;
                        str4 = str4;
                        sArr11 = sArr11;
                        i27 = i310;
                        i35 = i20;
                        sArr14 = sArr9;
                        i28 = i12;
                    } else {
                        int iM2765 = (C0619.m2761("ۢۛ") ^ i26) * (-91);
                        i28 = iM2765 ^ (-1786912118);
                        i27 = ((iM2765 ^ i25) * 3421) ^ 970412882;
                        i30 = 54;
                    }
                    break;
                case -847621884:
                case -224873469:
                    i13 = i30;
                    interfaceC9802 = interfaceC9804;
                    sArr5 = sArr14;
                    str2 = str5;
                    str3 = str4;
                    sArr6 = sArr11;
                    i14 = i34;
                    i15 = i31;
                    sArr7 = sArr12;
                    i16 = 7;
                    strM11769 = AbstractC3624.m11769(f81756, 9, 7, i15);
                    sArr8 = f81756;
                    i35 = 16;
                    if (C3734.f12817 >= 0) {
                        int iM2766 = (i25 - C0619.m2761("֡ܳ")) * (-21);
                        i17 = ((iM2766 ^ i26) * (-529)) ^ 1211282966;
                        i18 = iM2766 ^ (-1957613229);
                        i34 = i14;
                        i29 = i16;
                        i30 = i13;
                        sArr12 = sArr7;
                        sArr14 = sArr5;
                        str5 = str2;
                    } else {
                        int iM2767 = C0619.m2761("᩸ᩴ") ^ i25;
                        i17 = ((iM2767 ^ i26) * (-30515)) ^ (-457263491);
                        i18 = iM2767 ^ 1322697115;
                        i34 = i14;
                        i30 = i13;
                        sArr12 = sArr7;
                        sArr14 = sArr5;
                        str5 = str2;
                        i29 = 7;
                    }
                    sArr11 = sArr6;
                    sArr13 = sArr8;
                    i28 = i18;
                    i27 = i17;
                    i31 = i15;
                    str4 = str3;
                    interfaceC9804 = interfaceC9802;
                    break;
                case -794737741:
                case 346424691:
                    c3054 = new C3054(main, strArr);
                    sArr14 = f81756;
                    if (C3998.f13671 == 0) {
                        iM31610 = C0773.m3169("۟ۖ") ^ i26;
                        i27 = ((iM31610 ^ i25) * (-32417)) ^ (-50573451);
                        i23 = -796133200;
                        i28 = iM31610 ^ i23;
                    } else {
                        sArr9 = sArr14;
                        i20 = i35;
                        i19 = i31;
                        sArr10 = sArr12;
                        i21 = i29;
                        i22 = i34;
                        int iM31618 = C0773.m3169("᩷᩶") ^ i26;
                        int i311 = ((iM31618 ^ i25) * (-17941)) ^ 373438490;
                        i12 = iM31618 ^ 1045581769;
                        i34 = i22;
                        i29 = i21;
                        sArr13 = sArr13;
                        i31 = i19;
                        sArr12 = sArr10;
                        str5 = str5;
                        str4 = str4;
                        sArr11 = sArr11;
                        i27 = i311;
                        i35 = i20;
                        sArr14 = sArr9;
                        i28 = i12;
                    }
                    break;
                case -477298422:
                case 697763779:
                    i31 = 51493;
                    int iM2768 = (C0619.m2761("ۨᩳ") ^ i26) * (-105);
                    i10 = ((iM2768 ^ i25) * 2857) ^ 837603198;
                    i12 = iM2768 ^ 1829177213;
                    i34 = i34;
                    i29 = i29;
                    i30 = i30;
                    sArr12 = sArr12;
                    str4 = str4;
                    interfaceC9804 = interfaceC9804;
                    sArr11 = sArr11;
                    i27 = i10;
                    i35 = i35;
                    sArr13 = sArr13;
                    sArr14 = sArr14;
                    str5 = str5;
                    i28 = i12;
                    break;
                case -413871032:
                case -315480113:
                    interfaceC9804 = interfaceC9804;
                    sArr14 = sArr14;
                    str5 = str5;
                    str4 = str4;
                    sArr13 = sArr13;
                    sArr11 = sArr11;
                    i35 = i35;
                    i30 = i30;
                    i7 = i31;
                    sArr12 = sArr12;
                    i8 = i29;
                    i9 = i34;
                    strM11765 = AbstractC3624.m11765(iM2763 ^ 2119862656);
                    if (RunnableC3646.f12471) {
                        iM3169 = C0773.m3169("ۨۡ") ^ i26;
                        i10 = ((iM3169 ^ i25) * 25179) ^ 1491893286;
                        i11 = -1171983739;
                    } else {
                        iM3169 = (C0773.m3169("ۤۚ") ^ i26) * (-93);
                        i10 = ((iM3169 ^ i25) * 15991) ^ (-1889502149);
                        i11 = -335167994;
                    }
                    i12 = iM3169 ^ i11;
                    i34 = i9;
                    i29 = i8;
                    i31 = i7;
                    i30 = i30;
                    sArr12 = sArr12;
                    str4 = str4;
                    interfaceC9804 = interfaceC9804;
                    sArr11 = sArr11;
                    i27 = i10;
                    i35 = i35;
                    sArr13 = sArr13;
                    sArr14 = sArr14;
                    str5 = str5;
                    i28 = i12;
                    break;
                case -294100473:
                case 1152752701:
                    iM2762 = 2118652473 ^ C0619.m2761(C0487.m2361(sArr14, 51, 3, i31));
                    if (C2702.f8586 > 0) {
                        iM31610 = C0773.m3169("ۡ۬") ^ i25;
                        i27 = ((iM31610 ^ i26) * 22113) ^ 1559131439;
                        i23 = -1872036122;
                        i28 = iM31610 ^ i23;
                    } else {
                        sArr9 = sArr14;
                        i20 = i35;
                        i19 = i31;
                        sArr10 = sArr12;
                        i21 = i29;
                        i22 = i34;
                        int iM31619 = C0773.m3169("᩷᩶") ^ i26;
                        int i312 = ((iM31619 ^ i25) * (-17941)) ^ 373438490;
                        i12 = iM31619 ^ 1045581769;
                        i34 = i22;
                        i29 = i21;
                        sArr13 = sArr13;
                        i31 = i19;
                        sArr12 = sArr10;
                        str5 = str5;
                        str4 = str4;
                        sArr11 = sArr11;
                        i27 = i312;
                        i35 = i20;
                        sArr14 = sArr9;
                        i28 = i12;
                    }
                    break;
                case -38333886:
                case 1459251964:
                    short[] sArr15 = sArr11;
                    sArr10 = sArr12;
                    i21 = i29;
                    sArr9 = sArr14;
                    i20 = i35;
                    str5 = str5;
                    sArr13 = sArr13;
                    int i40 = i30;
                    str4 = str4;
                    i19 = i31;
                    sArr11 = sArr15;
                    interfaceC9803 = interfaceC9804;
                    strArr = new String[]{strM11765, str5, str4, strM11997, C2419.m8166(f81756, 44, 7, i31), strM11769, strM11996};
                    if (C3033.f9831 >= 0) {
                        i30 = i40;
                        i22 = i34;
                        interfaceC9804 = interfaceC9803;
                        int iM316110 = C0773.m3169("᩷᩶") ^ i26;
                        int i313 = ((iM316110 ^ i25) * (-17941)) ^ 373438490;
                        i12 = iM316110 ^ 1045581769;
                        i34 = i22;
                        i29 = i21;
                        sArr13 = sArr13;
                        i31 = i19;
                        sArr12 = sArr10;
                        str5 = str5;
                        str4 = str4;
                        sArr11 = sArr11;
                        i27 = i313;
                        i35 = i20;
                        sArr14 = sArr9;
                        i28 = i12;
                    } else {
                        int iM2769 = (i26 - C0619.m2761("ۜܶ")) * (-99);
                        i35 = i20;
                        i31 = i19;
                        i30 = i40;
                        sArr14 = sArr9;
                        str4 = str4;
                        interfaceC9804 = interfaceC9803;
                        i28 = iM2769 ^ 2028207773;
                        sArr13 = sArr13;
                        str5 = str5;
                        sArr11 = sArr11;
                        i27 = ((iM2769 ^ i25) * (-5481)) ^ 274428408;
                        i29 = i21;
                        sArr12 = sArr10;
                    }
                    break;
                case 678510524:
                case 1444649576:
                    interfaceC9804 = interfaceC9804;
                    sArr14 = sArr14;
                    str5 = str5;
                    str4 = str4;
                    sArr13 = sArr13;
                    sArr11 = sArr11;
                    i35 = i35;
                    i30 = i30;
                    i7 = i31;
                    sArr12 = sArr12;
                    i8 = i29;
                    i9 = i34;
                    s = f81756[5];
                    i33 = s + 1;
                    if (C3033.f9831 >= 0) {
                        iM3169 = C0773.m3169("ۨۡ") ^ i26;
                        i10 = ((iM3169 ^ i25) * 25179) ^ 1491893286;
                        i11 = -1171983739;
                    } else {
                        iM3169 = C0773.m3169("ܶܳ") ^ i25;
                        i10 = ((iM3169 ^ i26) * 20625) ^ 1255050091;
                        i11 = 1934511217;
                    }
                    i12 = iM3169 ^ i11;
                    i34 = i9;
                    i29 = i8;
                    i31 = i7;
                    i30 = i30;
                    sArr12 = sArr12;
                    str4 = str4;
                    interfaceC9804 = interfaceC9804;
                    sArr11 = sArr11;
                    i27 = i10;
                    i35 = i35;
                    sArr13 = sArr13;
                    sArr14 = sArr14;
                    str5 = str5;
                    i28 = i12;
                    break;
                case 735091507:
                case 1868358559:
                    i31 = 9992;
                    int iM27610 = (C0619.m2761("ۨᩳ") ^ i26) * (-105);
                    i10 = ((iM27610 ^ i25) * 2857) ^ 837603198;
                    i12 = iM27610 ^ 1829177213;
                    i34 = i34;
                    i29 = i29;
                    i30 = i30;
                    sArr12 = sArr12;
                    str4 = str4;
                    interfaceC9804 = interfaceC9804;
                    sArr11 = sArr11;
                    i27 = i10;
                    i35 = i35;
                    sArr13 = sArr13;
                    sArr14 = sArr14;
                    str5 = str5;
                    i28 = i12;
                    break;
                default:
                    C2375.m8065();
                    C23916.m53419();
                    return null;
            }
        }
    }

    public C25308(AbstractC22044 abstractC22044) {
        short[] sArr = null;
        int i = 0;
        int i2 = 0;
        int i3 = 144318248;
        int i4 = C2702.f8586;
        int i5 = C0487.f2131;
        short s = f81756[0];
        int i6 = (s * 23434) - ((s * s) + 137288089) <= 0 ? 32355 : 59865;
        int iM2761 = C0619.m2761("ۧۘ") ^ i4;
        int i7 = ((iM2761 ^ i5) * 25733) ^ 1508213728;
        int i8 = -451162524;
        while (true) {
            i3 = ((((i3 ^ i5) * (-2377)) >> 31) & i7) ^ (iM2761 ^ i8);
            switch (i3) {
                case -2146106143:
                case 1031372721:
                    AbstractC0116.m1243();
                    if (C4238.f15451 < 0) {
                        iM2761 = (i5 - C0619.m2761("ۜ֫")) * (-55);
                        i7 = ((iM2761 ^ i4) * 6301) ^ 1630562482;
                        i8 = -1746885921;
                    } else {
                        iM2761 = (C0619.m2761("ۜۡ") + i5) * (-53);
                        i7 = ((iM2761 ^ i4) * (-14979)) ^ 1994070294;
                        i8 = 27584157;
                    }
                    break;
                case -2014256629:
                case 646449313:
                    if (C1519.f5300 >= 0) {
                        iM2761 = (C0773.m3169("ܺ᩹") ^ i4) * 9;
                        i7 = ((iM2761 ^ i5) * 19165) ^ (-360135705);
                        i8 = -1564620868;
                    } else {
                        iM2761 = (i5 - C0619.m2761("ۢ۠")) * 53;
                        i7 = ((iM2761 ^ i4) * (-12859)) ^ 1889889692;
                        i8 = 460026879;
                    }
                    break;
                case -1835476818:
                case 1362621703:
                    this.f81758 = abstractC22044.m49862(C2023.m6966(sArr, i, i2, i6));
                    return;
                case -1775272535:
                case 1316810246:
                    if (C2310.f7472 >= 0) {
                        iM2761 = (C0773.m3169("ܺ᩹") ^ i4) * 9;
                        i7 = ((iM2761 ^ i5) * 19165) ^ (-360135705);
                        i8 = -1564620868;
                    } else {
                        iM2761 = C0619.m2761("ۜ۠") ^ i4;
                        i7 = ((iM2761 ^ i5) * 119) ^ (-1764044470);
                        i8 = 1860580505;
                    }
                    break;
                case -1631594762:
                case -896384702:
                    i2 = 4;
                    if (C4238.f15451 >= 0) {
                        iM2761 = (i5 - C0773.m3169("᩷ۛ")) * (-101);
                        i7 = ((iM2761 ^ i4) * 5641) ^ (-967511376);
                        i8 = 1098928573;
                    } else {
                        iM2761 = (C0619.m2761("ܰᩴ") ^ i4) * 27;
                        i7 = ((iM2761 ^ i5) * (-6023)) ^ (-1595003879);
                        i8 = 822451334;
                    }
                    break;
                case -1495906792:
                case 146437603:
                    if (C3690.f12684 <= 0) {
                        iM2761 = (C0773.m3169("ܺ᩹") ^ i4) * 9;
                        i7 = ((iM2761 ^ i5) * 19165) ^ (-360135705);
                        i8 = -1564620868;
                    } else {
                        iM2761 = (C0619.m2761("ۜۡ") + i5) * (-53);
                        i7 = ((iM2761 ^ i4) * (-14979)) ^ 1994070294;
                        i8 = 27584157;
                    }
                    break;
                case -1384778487:
                case 1130965536:
                    this.f81757 = abstractC22044;
                    sArr = f81756;
                    if (C2485.m8357() <= 0) {
                        iM2761 = (i5 - C0619.m2761("ۜ֫")) * (-55);
                        i7 = ((iM2761 ^ i4) * 6301) ^ 1630562482;
                        i8 = -1746885921;
                    } else {
                        iM2761 = C0773.m3169("ۡܰ") ^ i5;
                        i7 = ((iM2761 ^ i4) * (-10987)) ^ (-1674229086);
                        i8 = 1560562313;
                    }
                    break;
                case -1177013205:
                case 797823193:
                    if (C0773.m3161() != 0) {
                        iM2761 = (C0619.m2761("ۜۡ") + i5) * (-53);
                        i7 = ((iM2761 ^ i4) * (-14979)) ^ 1994070294;
                        i8 = 27584157;
                    } else {
                        iM2761 = C0619.m2761("ܰ᩶") ^ i5;
                        i7 = ((iM2761 ^ i4) * 13721) ^ 883486949;
                        i8 = 1860485759;
                    }
                    break;
                case -1053987619:
                case -25700649:
                    if (C3492.f12043 <= 0) {
                        iM2761 = (C0619.m2761("ۜۡ") + i5) * (-53);
                        i7 = ((iM2761 ^ i4) * (-14979)) ^ 1994070294;
                        i8 = 27584157;
                    } else {
                        iM2761 = C0619.m2761("ۤۜ") ^ i5;
                        i7 = ((iM2761 ^ i4) * (-17333)) ^ 297197147;
                        i8 = -821331107;
                    }
                    break;
                case -967097649:
                case 1815739090:
                    if (C3492.f12043 <= 0) {
                        iM2761 = (i5 - C0619.m2761("ۜ֫")) * (-55);
                        i7 = ((iM2761 ^ i4) * 6301) ^ 1630562482;
                        i8 = -1746885921;
                    } else {
                        iM2761 = (C0773.m3169("ܺ᩶") ^ i4) * 37;
                        i7 = ((iM2761 ^ i5) * 18715) ^ (-252759238);
                        i8 = -835553045;
                    }
                    break;
                case -663035843:
                case 1220745746:
                    if (C2023.m6964() <= 0) {
                        iM2761 = (i5 - C0773.m3169("᩷ۛ")) * (-101);
                        i7 = ((iM2761 ^ i4) * 5641) ^ (-967511376);
                        i8 = 1098928573;
                    } else {
                        iM2761 = (i4 - C0773.m3169("ۡ۫")) * 49;
                        i7 = ((iM2761 ^ i5) * (-3387)) ^ (-1029479153);
                        i8 = -1322660832;
                    }
                    break;
                case 208957285:
                case 1631060494:
                    if (AbstractC0116.f1064 > 0) {
                        iM2761 = (C0619.m2761("ۜۡ") + i5) * (-53);
                        i7 = ((iM2761 ^ i4) * (-14979)) ^ 1994070294;
                        i8 = 27584157;
                    } else {
                        iM2761 = C0619.m2761("ܳ᩹") ^ i4;
                        i7 = ((iM2761 ^ i5) * 7831) ^ 1770491861;
                        i8 = -289908734;
                    }
                    break;
                case 620377058:
                case 1727328963:
                    C3099.m10095();
                    throw new RuntimeException();
                case 694340711:
                case 1732423127:
                    C0619.m2763();
                    RunnableC3055.m9933();
                    iM2761 = (C0619.m2761("ۜۡ") + i5) * (-53);
                    i7 = ((iM2761 ^ i4) * (-14979)) ^ 1994070294;
                    i8 = 27584157;
                    break;
                case 1249235454:
                case 1440725243:
                    if (C3448.f11240 >= 0) {
                        iM2761 = (i5 - C0619.m2761("ۜ֫")) * (-55);
                        i7 = ((iM2761 ^ i4) * 6301) ^ 1630562482;
                        i8 = -1746885921;
                    } else {
                        iM2761 = C0619.m2761("ۗܽ") ^ i4;
                        i7 = ((iM2761 ^ i5) * 9519) ^ (-604177455);
                        i8 = -566148781;
                    }
                    break;
                default:
                    i = 1;
                    if (C1519.f5300 >= 0) {
                        iM2761 = (C0773.m3169("ܺ᩹") ^ i4) * 9;
                        i7 = ((iM2761 ^ i5) * 19165) ^ (-360135705);
                        i8 = -1564620868;
                    } else {
                        iM2761 = C0619.m2761("᩹ܿ") ^ i5;
                        i7 = ((iM2761 ^ i4) * 8519) ^ 1155467002;
                        i8 = -1983010296;
                    }
                    break;
            }
        }
    }
}
