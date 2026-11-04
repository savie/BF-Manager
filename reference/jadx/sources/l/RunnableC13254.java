package l;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import bin.mt.plus.Main;
import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.۫ܿ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 154F */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC13254 implements Runnable {

    /* JADX INFO: renamed from: ۙܺܰ, reason: not valid java name and contains not printable characters */
    private static final short[] f42349 = {1959, -9608, -9631, -9689, -9654, -9627, -9612, -9631, -9603, -9670, -9626, -9615, -9610, -9612, -9625, -9615, -9670, -9640, -9663, -9689, 19683, -29399, -22230, 18703, 17283, -22779, 19523, -20615, -19167, 22276, -22670, 18308, 23078, -31740, 20869, -9658, -9603, -9604, -9617, -9632, -9602, -9632};

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f42350;

    public /* synthetic */ RunnableC13254(int i) {
        this.f42350 = i;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:36:0x0190 A[PHI: r10 r11 r13 r14 r15 r29
      0x0190: PHI (r10v4 l.ܶ᩷ۚ) = (r10v3 l.ܶ᩷ۚ), (r10v2 l.ܶ᩷ۚ), (r10v2 l.ܶ᩷ۚ) binds: [B:35:0x018e, B:27:0x0136, B:15:0x00b3] A[DONT_GENERATE, DONT_INLINE]
      0x0190: PHI (r11v4 l.۠ۖۧ) = (r11v2 l.۠ۖۧ), (r11v3 l.۠ۖۧ), (r11v2 l.۠ۖۧ) binds: [B:35:0x018e, B:27:0x0136, B:15:0x00b3] A[DONT_GENERATE, DONT_INLINE]
      0x0190: PHI (r13v4 short[]) = (r13v3 short[]), (r13v2 short[]), (r13v2 short[]) binds: [B:35:0x018e, B:27:0x0136, B:15:0x00b3] A[DONT_GENERATE, DONT_INLINE]
      0x0190: PHI (r14v4 int) = (r14v3 int), (r14v2 int), (r14v2 int) binds: [B:35:0x018e, B:27:0x0136, B:15:0x00b3] A[DONT_GENERATE, DONT_INLINE]
      0x0190: PHI (r15v4 int) = (r15v3 int), (r15v2 int), (r15v2 int) binds: [B:35:0x018e, B:27:0x0136, B:15:0x00b3] A[DONT_GENERATE, DONT_INLINE]
      0x0190: PHI (r29v46 java.lang.String) = (r29v34 java.lang.String), (r29v36 java.lang.String), (r29v47 java.lang.String) binds: [B:35:0x018e, B:27:0x0136, B:15:0x00b3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x023d A[PHI: r4 r8 r9 r12 r24 r25 r29
      0x023d: PHI (r4v28 int) = (r4v2 int), (r4v27 int), (r4v2 int) binds: [B:47:0x023b, B:43:0x020d, B:40:0x01d4] A[DONT_GENERATE, DONT_INLINE]
      0x023d: PHI (r8v3 int) = (r8v2 int), (r8v2 int), (r8v4 int) binds: [B:47:0x023b, B:43:0x020d, B:40:0x01d4] A[DONT_GENERATE, DONT_INLINE]
      0x023d: PHI (r9v3 android.content.DialogInterface$OnClickListener) = 
      (r9v2 android.content.DialogInterface$OnClickListener)
      (r9v2 android.content.DialogInterface$OnClickListener)
      (r9v4 android.content.DialogInterface$OnClickListener)
     binds: [B:47:0x023b, B:43:0x020d, B:40:0x01d4] A[DONT_GENERATE, DONT_INLINE]
      0x023d: PHI (r12v4 short[]) = (r12v2 short[]), (r12v3 short[]), (r12v2 short[]) binds: [B:47:0x023b, B:43:0x020d, B:40:0x01d4] A[DONT_GENERATE, DONT_INLINE]
      0x023d: PHI (r24v4 java.lang.String) = (r24v3 java.lang.String), (r24v2 java.lang.String), (r24v2 java.lang.String) binds: [B:47:0x023b, B:43:0x020d, B:40:0x01d4] A[DONT_GENERATE, DONT_INLINE]
      0x023d: PHI (r25v4 int) = (r25v2 int), (r25v3 int), (r25v5 int) binds: [B:47:0x023b, B:43:0x020d, B:40:0x01d4] A[DONT_GENERATE, DONT_INLINE]
      0x023d: PHI (r29v31 java.lang.String) = (r29v29 java.lang.String), (r29v30 java.lang.String), (r29v32 java.lang.String) binds: [B:47:0x023b, B:43:0x020d, B:40:0x01d4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x0281 A[PHI: r7 r22 r23 r29
      0x0281: PHI (r7v8 l.ۖۖۧ) = (r7v3 l.ۖۖۧ), (r7v2 l.ۖۖۧ), (r7v2 l.ۖۖۧ) binds: [B:51:0x027f, B:31:0x0163, B:11:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x0281: PHI (r22v8 int) = (r22v3 int), (r22v2 int), (r22v2 int) binds: [B:51:0x027f, B:31:0x0163, B:11:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x0281: PHI (r23v8 int) = (r23v3 int), (r23v2 int), (r23v2 int) binds: [B:51:0x027f, B:31:0x0163, B:11:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x0281: PHI (r29v56 java.lang.String) = (r29v28 java.lang.String), (r29v35 java.lang.String), (r29v57 java.lang.String) binds: [B:51:0x027f, B:31:0x0163, B:11:0x00a7] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // java.lang.Runnable
    public final void run() {
        int iM2761;
        int i;
        int i2;
        String str;
        String str2;
        String str3;
        String str4;
        int i3;
        int i4;
        short[] sArr;
        int i5;
        int i6;
        int iM2762;
        int i7;
        int iM3169;
        int i8;
        int i9;
        int i10;
        short[] sArr2;
        int i11;
        int iM31610;
        int i12;
        int iM31611;
        int i13;
        int i14 = 0;
        int i15 = 0;
        int i16 = -165387560;
        int i17 = C4282.f15546;
        int i18 = C3492.f12043;
        int iM31612 = (C0773.m3169("ۙۗ") + i18) * 77;
        int i19 = ((iM31612 ^ i17) * (-7105)) ^ (-792371010);
        int i20 = iM31612 ^ (-1470902687);
        String str5 = null;
        C2361 c2361M3794 = null;
        String strM3780 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        int i21 = 0;
        int i22 = 0;
        SharedPreferences sharedPreferences = null;
        int iM2763 = 0;
        int i23 = 0;
        int i24 = 0;
        short s = 0;
        String strM11996 = null;
        String str6 = null;
        Main mainM18052 = null;
        String strM3500 = null;
        int i25 = 0;
        String str7 = null;
        DialogInterfaceC8327 dialogInterfaceC8327M4860 = null;
        int i26 = 0;
        DialogInterfaceOnClickListenerC16351 dialogInterfaceOnClickListenerC16351 = null;
        DialogInterface.OnClickListener onClickListener = null;
        int iM2764 = 0;
        while (true) {
            i16 = i20 ^ (i19 & (((i16 ^ i17) * (-15487)) >> 31));
            switch (i16) {
                case -1981941855:
                case 1183292693:
                    break;
                case -1923827687:
                case -661494722:
                    str2 = str7;
                    str3 = str6;
                    str4 = str5;
                    i4 = i26;
                    strM3500 = C0862.m3500(f42349, 20, 3, i25);
                    if (C1080.f3865 < 0) {
                        iM3169 = C0773.m3169("᩸ۘ") ^ i18;
                        i8 = ((iM3169 ^ i17) * (-13763)) ^ 936286629;
                        i9 = 1184010353;
                        i11 = iM3169 ^ i9;
                        i26 = i4;
                        str5 = str4;
                        str6 = str3;
                        str7 = str2;
                        i20 = i11;
                        i19 = i8;
                    } else {
                        sharedPreferences = sharedPreferences;
                        i3 = i25;
                        int iM31613 = (C0773.m3169("ۨۗ") ^ i17) * 65;
                        i5 = ((iM31613 ^ i18) * (-13893)) ^ (-846075238);
                        i6 = iM31613 ^ (-1653967007);
                        i26 = i4;
                        str5 = str4;
                        str6 = str3;
                        str7 = str2;
                        i20 = i6;
                        i19 = i5;
                        i25 = i3;
                        sharedPreferences = sharedPreferences;
                    }
                    break;
                case -1908476340:
                case -1847147126:
                    str2 = str7;
                    RunnableC1848.m6359(c2361M3794, C0619.m2761(C2375.m8069(sArr5, i21, i22, i25)) ^ 2130649968, dialogInterfaceOnClickListenerC16351);
                    if (C0773.m3161() != 0) {
                        iM31611 = (i17 - C0619.m2761("᩷᩹")) * (-107);
                        i8 = ((iM31611 ^ i18) * 31789) ^ (-1768483353);
                        i13 = -760617128;
                    } else {
                        iM31611 = C0773.m3169("ۘۗ") ^ i18;
                        i8 = ((iM31611 ^ i17) * 22473) ^ 1373151035;
                        i13 = 1202560837;
                    }
                    i11 = iM31611 ^ i13;
                    str7 = str2;
                    i20 = i11;
                    i19 = i8;
                    break;
                case -1818855406:
                case 141823179:
                    i25 = 55829;
                    iM2761 = (i17 - C0619.m2761("ۤۙ")) * (-21);
                    i = ((iM2761 ^ i18) * 24499) ^ (-1138128942);
                    i2 = -315690082;
                    int i27 = iM2761 ^ i2;
                    sharedPreferences = sharedPreferences;
                    sArr3 = sArr3;
                    i26 = i26;
                    str5 = str5;
                    str6 = str6;
                    str7 = str7;
                    i20 = i27;
                    i19 = i;
                    strM11996 = strM11996;
                    break;
                case -1814652234:
                case -1455628774:
                    str = strM11996;
                    str2 = str7;
                    sharedPreferences = sharedPreferences;
                    str3 = str6;
                    str4 = str5;
                    i3 = i25;
                    i4 = i26;
                    sArr = sArr3;
                    s = f42349[0];
                    i14 = s * s;
                    i15 = 13249600;
                    if (C1080.f3865 < 0) {
                        int iM31614 = (C0773.m3169("ܽ֫") + i18) * (-61);
                        i5 = ((iM31614 ^ i17) * 20959) ^ 1795418776;
                        i6 = iM31614 ^ 502762831;
                        sArr3 = sArr;
                        i26 = i4;
                        strM11996 = str;
                        str5 = str4;
                        str6 = str3;
                        str7 = str2;
                        i20 = i6;
                        i19 = i5;
                        i25 = i3;
                        sharedPreferences = sharedPreferences;
                    } else {
                        sArr3 = sArr;
                        strM11996 = str;
                        int iM31615 = (C0773.m3169("ۨۗ") ^ i17) * 65;
                        i5 = ((iM31615 ^ i18) * (-13893)) ^ (-846075238);
                        i6 = iM31615 ^ (-1653967007);
                        i26 = i4;
                        str5 = str4;
                        str6 = str3;
                        str7 = str2;
                        i20 = i6;
                        i19 = i5;
                        i25 = i3;
                        sharedPreferences = sharedPreferences;
                    }
                    break;
                case -1756771038:
                case 603086730:
                    str = strM11996;
                    str2 = str7;
                    sharedPreferences = sharedPreferences;
                    str3 = str6;
                    str4 = str5;
                    i4 = i26;
                    sArr = sArr3;
                    int i28 = i14 + i15;
                    i3 = i25;
                    short s2 = s;
                    int i29 = s2 + 3640;
                    if ((i29 * i29) - (i28 + i28) > 0) {
                        iM2762 = (i18 - C0773.m3169("֫۟")) * (-19);
                        i5 = ((iM2762 ^ i17) * 23781) ^ (-1847318228);
                        i7 = -1678056596;
                    } else {
                        iM2762 = C0619.m2761("ۧۖ") ^ i17;
                        i5 = ((iM2762 ^ i18) * (-10095)) ^ 2084107546;
                        i7 = -1221256248;
                    }
                    i6 = iM2762 ^ i7;
                    s = s2;
                    sArr3 = sArr;
                    i26 = i4;
                    strM11996 = str;
                    str5 = str4;
                    str6 = str3;
                    str7 = str2;
                    i20 = i6;
                    i19 = i5;
                    i25 = i3;
                    sharedPreferences = sharedPreferences;
                    break;
                case -1726498419:
                case -199065683:
                    str2 = str7;
                    C13473.m33136(c2361M3794, iM2763 ^ i23);
                    strM3780 = C0950.m3780(f42349, 26, 3, i25);
                    if (C1343.f4799 != 0) {
                        iM31611 = (C0619.m2761("۬ۙ") ^ i17) * (-103);
                        i8 = ((iM31611 ^ i18) * (-30175)) ^ 1380994915;
                        i13 = -1796865733;
                    } else {
                        iM31611 = C0619.m2761("ܿܶ") ^ i18;
                        i8 = ((iM31611 ^ i17) * (-9165)) ^ (-211157866);
                        i13 = 1213674403;
                    }
                    i11 = iM31611 ^ i13;
                    str7 = str2;
                    i20 = i11;
                    i19 = i8;
                    break;
                case -1714421580:
                case 1765868191:
                    C5416.m16141(dialogInterfaceC8327M4860);
                    C2375.m8070(C2310.m7808(dialogInterfaceC8327M4860), new ViewOnClickListenerC21993(4, mainM18052));
                    str7 = str7;
                    i10 = i26;
                    sArr2 = sArr3;
                    int iM31616 = C0773.m3169("֨ܺ") ^ i18;
                    i20 = iM31616 ^ 1433515854;
                    i19 = ((iM31616 ^ i17) * 29065) ^ (-1393672694);
                    sArr3 = sArr2;
                    i26 = i10;
                    strM11996 = strM11996;
                    str5 = str5;
                    sharedPreferences = sharedPreferences;
                    break;
                case -1347893453:
                case 1415305587:
                    str2 = str7;
                    c2361M3794.m8025(C2310.m7803(f42349, 35, 7, i25), onClickListener);
                    dialogInterfaceC8327M4860 = C1321.m4860(c2361M3794);
                    if (C2310.f7472 >= 0) {
                        iM31611 = (C0619.m2761("֫ܳ") ^ i18) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i8 = ((iM31611 ^ i17) * (-26767)) ^ (-1442264092);
                        i13 = 1072818840;
                    } else {
                        iM31611 = C0773.m3169("ۧܳ") ^ i17;
                        i8 = ((iM31611 ^ i18) * 12957) ^ 1259944731;
                        i13 = -1116511603;
                    }
                    i11 = iM31611 ^ i13;
                    str7 = str2;
                    i20 = i11;
                    i19 = i8;
                    break;
                case -1312007965:
                case -719057127:
                    C0619.m2763();
                    C2834.m9344();
                    str2 = str7;
                    sharedPreferences = sharedPreferences;
                    str3 = str6;
                    str4 = str5;
                    i3 = i25;
                    i4 = i26;
                    int iM31617 = (C0773.m3169("ۨۗ") ^ i17) * 65;
                    i5 = ((iM31617 ^ i18) * (-13893)) ^ (-846075238);
                    i6 = iM31617 ^ (-1653967007);
                    i26 = i4;
                    str5 = str4;
                    str6 = str3;
                    str7 = str2;
                    i20 = i6;
                    i19 = i5;
                    i25 = i3;
                    sharedPreferences = sharedPreferences;
                    break;
                case -1303332253:
                case 1105740054:
                    str2 = str7;
                    C3492.m11487(c2361M3794, iM2764, onClickListener);
                    dialogInterfaceOnClickListenerC16351 = new DialogInterfaceOnClickListenerC16351(4, mainM18052);
                    sArr5 = f42349;
                    i21 = 32;
                    i22 = 3;
                    if (C2834.f9334 <= 0) {
                        iM31611 = (C0619.m2761("֫ܳ") ^ i18) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i8 = ((iM31611 ^ i17) * (-26767)) ^ (-1442264092);
                        i13 = 1072818840;
                    } else {
                        iM31611 = C0773.m3169("֫ܶ") ^ i17;
                        i8 = ((iM31611 ^ i18) * 22127) ^ (-1578885345);
                        i13 = -1253716876;
                    }
                    i11 = iM31611 ^ i13;
                    str7 = str2;
                    i20 = i11;
                    i19 = i8;
                    break;
                case -1251383520:
                case 1035917110:
                    C14116.m34268(C1321.m4856());
                    break;
                case -1180438530:
                case 1649999351:
                    C0487.m2356();
                    if (C2023.f6737) {
                        str2 = str7;
                        iM31611 = (C0619.m2761("֫ܳ") ^ i18) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i8 = ((iM31611 ^ i17) * (-26767)) ^ (-1442264092);
                        i13 = 1072818840;
                        i11 = iM31611 ^ i13;
                        str7 = str2;
                        i20 = i11;
                    } else {
                        int iM31618 = C0773.m3169("۫ۚ") ^ i18;
                        i8 = ((iM31618 ^ i17) * 15739) ^ 1997668443;
                        i20 = iM31618 ^ (-1573250715);
                    }
                    i19 = i8;
                    break;
                case -823813614:
                case -510478192:
                    str2 = str7;
                    int i30 = i24;
                    iM2764 = C0619.m2761(C23916.m53420(sArr4, i26, i30, i25)) ^ 2100516951;
                    onClickListener = null;
                    if (C4282.m13644()) {
                        int iM2765 = C0619.m2761("ܿܿ") ^ i17;
                        i24 = i30;
                        i19 = ((iM2765 ^ i18) * (-24465)) ^ 656502129;
                        str7 = str2;
                        i20 = iM2765 ^ 1699420643;
                    } else {
                        i24 = i30;
                        iM31611 = (C0619.m2761("۬ۙ") ^ i17) * (-103);
                        i8 = ((iM31611 ^ i18) * (-30175)) ^ 1380994915;
                        i13 = -1796865733;
                        i11 = iM31611 ^ i13;
                        str7 = str2;
                        i20 = i11;
                        i19 = i8;
                    }
                    break;
                case -803859173:
                case 793274432:
                    C1080.m4050();
                    C1080.m4050();
                    break;
                case -693804925:
                case 559331953:
                    C2287.m7745();
                    if (C13473.f42873 != 0) {
                        int iM31619 = C0773.m3169("۫ۚ") ^ i18;
                        i8 = ((iM31619 ^ i17) * 15739) ^ 1997668443;
                        i20 = iM31619 ^ (-1573250715);
                    } else {
                        str2 = str7;
                        iM31611 = (i17 - C0619.m2761("᩷᩹")) * (-107);
                        i8 = ((iM31611 ^ i18) * 31789) ^ (-1768483353);
                        i13 = -760617128;
                        i11 = iM31611 ^ i13;
                        str7 = str2;
                        i20 = i11;
                    }
                    i19 = i8;
                    break;
                case -448590286:
                case 1774618855:
                    str2 = str7;
                    str3 = str6;
                    str4 = str5;
                    mainM18052 = C6331.m18052();
                    if (mainM18052 == null) {
                        i10 = i26;
                        sharedPreferences = sharedPreferences;
                        str5 = str4;
                        sArr2 = sArr3;
                        str6 = str3;
                        str7 = str2;
                        int iM316110 = C0773.m3169("֨ܺ") ^ i18;
                        i20 = iM316110 ^ 1433515854;
                        i19 = ((iM316110 ^ i17) * 29065) ^ (-1393672694);
                        sArr3 = sArr2;
                        i26 = i10;
                        strM11996 = strM11996;
                        str5 = str5;
                        sharedPreferences = sharedPreferences;
                    } else {
                        iM31610 = C0773.m3169("ܽܺ") ^ i17;
                        i8 = ((iM31610 ^ i18) * 28347) ^ 1450279039;
                        i12 = 2001140679;
                        i11 = iM31610 ^ i12;
                        str5 = str4;
                        str6 = str3;
                        str7 = str2;
                        i20 = i11;
                        i19 = i8;
                    }
                    break;
                case -381395771:
                case 524618109:
                    i25 = 48730;
                    iM2761 = (i17 - C0619.m2761("ۤۙ")) * (-21);
                    i = ((iM2761 ^ i18) * 24499) ^ (-1138128942);
                    i2 = -315690082;
                    int i210 = iM2761 ^ i2;
                    sharedPreferences = sharedPreferences;
                    sArr3 = sArr3;
                    i26 = i26;
                    str5 = str5;
                    str6 = str6;
                    str7 = str7;
                    i20 = i210;
                    i19 = i;
                    strM11996 = strM11996;
                    break;
                case -153060411:
                case 1946552202:
                    C22961.m51787();
                    break;
                case -66444022:
                case 825130588:
                    ApplicationC17729.f58262.edit().putString(strM11996, str7).apply();
                    C6382.m18135(str7);
                    i10 = i26;
                    sArr2 = sArr3;
                    int iM316111 = C0773.m3169("֨ܺ") ^ i18;
                    i20 = iM316111 ^ 1433515854;
                    i19 = ((iM316111 ^ i17) * 29065) ^ (-1393672694);
                    sArr3 = sArr2;
                    i26 = i10;
                    strM11996 = strM11996;
                    str5 = str5;
                    sharedPreferences = sharedPreferences;
                    break;
                case -11935859:
                case 1638289707:
                    str2 = str7;
                    str3 = str6;
                    str4 = str5;
                    i4 = i26;
                    sharedPreferences = ApplicationC17729.f58262;
                    strM11996 = C3690.m11996(f42349, 1, 8, i25);
                    sArr3 = f42349;
                    if (!C3099.m10095()) {
                        iM3169 = (C0773.m3169("ܰ᩹") ^ i18) * (-125);
                        i8 = ((iM3169 ^ i17) * 29921) ^ (-1951319301);
                        i9 = 1781472484;
                        i11 = iM3169 ^ i9;
                        i26 = i4;
                        str5 = str4;
                        str6 = str3;
                        str7 = str2;
                        i20 = i11;
                        i19 = i8;
                    } else {
                        sharedPreferences = sharedPreferences;
                        i3 = i25;
                        int iM316112 = (C0773.m3169("ۨۗ") ^ i17) * 65;
                        i5 = ((iM316112 ^ i18) * (-13893)) ^ (-846075238);
                        i6 = iM316112 ^ (-1653967007);
                        i26 = i4;
                        str5 = str4;
                        str6 = str3;
                        str7 = str2;
                        i20 = i6;
                        i19 = i5;
                        i25 = i3;
                        sharedPreferences = sharedPreferences;
                    }
                    break;
                case 648023849:
                case 1353188097:
                    if (C1826.f6190 > 0) {
                        int iM316113 = C0773.m3169("۫ۚ") ^ i18;
                        i8 = ((iM316113 ^ i17) * 15739) ^ 1997668443;
                        i20 = iM316113 ^ (-1573250715);
                        i19 = i8;
                    } else {
                        str2 = str7;
                        sharedPreferences = sharedPreferences;
                        str3 = str6;
                        str4 = str5;
                        i3 = i25;
                        i4 = i26;
                        int iM316114 = (C0773.m3169("ۨۗ") ^ i17) * 65;
                        i5 = ((iM316114 ^ i18) * (-13893)) ^ (-846075238);
                        i6 = iM316114 ^ (-1653967007);
                        i26 = i4;
                        str5 = str4;
                        str6 = str3;
                        str7 = str2;
                        i20 = i6;
                        i19 = i5;
                        i25 = i3;
                        sharedPreferences = sharedPreferences;
                    }
                    break;
                case 715091044:
                case 1314300778:
                    i10 = i26;
                    sArr2 = sArr3;
                    String strM2756 = C0619.m2756(sArr2, 9, 11, i25);
                    sharedPreferences = sharedPreferences;
                    String strM3786 = C0950.m3786(sharedPreferences, strM11996, strM2756);
                    str5 = strM2756;
                    String strM18128 = C6382.m18128(strM3786);
                    if (C3492.m11490(strM18128, strM3786)) {
                        str6 = strM3786;
                        str7 = strM18128;
                        int iM316115 = C0773.m3169("֨ܺ") ^ i18;
                        i20 = iM316115 ^ 1433515854;
                        i19 = ((iM316115 ^ i17) * 29065) ^ (-1393672694);
                        sArr3 = sArr2;
                        i26 = i10;
                        strM11996 = strM11996;
                        str5 = str5;
                        sharedPreferences = sharedPreferences;
                    } else {
                        String str8 = strM11996;
                        int iM31620 = C0773.m3169("ۛ᩻") ^ i18;
                        i19 = ((iM31620 ^ i17) * 14801) ^ 2037012486;
                        i20 = iM31620 ^ 1889256294;
                        sArr3 = sArr2;
                        i26 = i10;
                        strM11996 = str8;
                        str5 = str5;
                        sharedPreferences = sharedPreferences;
                        str6 = strM3786;
                        str7 = strM18128;
                    }
                    break;
                case 1080977995:
                case 1407558479:
                    str2 = str7;
                    c2361M3794 = C0950.m3794(mainM18052);
                    iM2763 = C0619.m2761(C1343.m4939(f42349, 23, 3, i25));
                    i23 = 2099858964;
                    if (C0862.f3233 != 0) {
                        iM31611 = (i17 - C0619.m2761("᩷᩹")) * (-107);
                        i8 = ((iM31611 ^ i18) * 31789) ^ (-1768483353);
                        i13 = -760617128;
                    } else {
                        iM31611 = (C0773.m3169("ۤۤ") + i17) * 23;
                        i8 = ((iM31611 ^ i18) * 31595) ^ (-1360637650);
                        i13 = -740408338;
                    }
                    i11 = iM31611 ^ i13;
                    str7 = str2;
                    i20 = i11;
                    i19 = i8;
                    break;
                case 1432827864:
                case 1692766897:
                    C3734.m12146(C0619.m2761(strM3500) ^ 2102637614);
                    break;
                case 1537296573:
                case 1582052890:
                    str2 = str7;
                    C1321.m4857(c2361M3794, C0773.m3169(strM3780) ^ 2102463255);
                    sArr4 = f42349;
                    i26 = 29;
                    i24 = 3;
                    if (C1080.m4050()) {
                        iM31611 = (i18 - C0773.m3169("۟ۢ")) * (-51);
                        i8 = ((iM31611 ^ i17) * 32511) ^ (-441436857);
                        i13 = -923858884;
                    } else {
                        iM31611 = (C0619.m2761("۬ۙ") ^ i17) * (-103);
                        i8 = ((iM31611 ^ i18) * (-30175)) ^ 1380994915;
                        i13 = -1796865733;
                    }
                    i11 = iM31611 ^ i13;
                    str7 = str2;
                    i20 = i11;
                    i19 = i8;
                    break;
                case 1571738421:
                case 1668133039:
                    str2 = str7;
                    String str9 = str5;
                    str3 = str6;
                    if (!C3492.m11490(str3, C0950.m3786(ApplicationC17729.f58262, strM11996, str9))) {
                        i10 = i26;
                        str6 = str3;
                        str7 = str2;
                        sArr2 = sArr3;
                        SharedPreferences sharedPreferences2 = sharedPreferences;
                        str5 = str9;
                        sharedPreferences = sharedPreferences2;
                        int iM316116 = C0773.m3169("֨ܺ") ^ i18;
                        i20 = iM316116 ^ 1433515854;
                        i19 = ((iM316116 ^ i17) * 29065) ^ (-1393672694);
                        sArr3 = sArr2;
                        i26 = i10;
                        strM11996 = strM11996;
                        str5 = str5;
                        sharedPreferences = sharedPreferences;
                    } else {
                        iM31610 = (i18 - C0773.m3169("۬᩶")) * (-119);
                        str4 = str9;
                        i8 = ((iM31610 ^ i17) * (-5147)) ^ 294372924;
                        i12 = 1153896253;
                        i11 = iM31610 ^ i12;
                        str5 = str4;
                        str6 = str3;
                        str7 = str2;
                        i20 = i11;
                        i19 = i8;
                    }
                    break;
                default:
                    strM11996 = strM11996;
                    str7 = str7;
                    sharedPreferences = sharedPreferences;
                    str6 = str6;
                    str5 = str5;
                    i26 = i26;
                    sArr3 = sArr3;
                    switch (this.f42350) {
                        case 0:
                            iM2761 = C0619.m2761("᩹ۚ") ^ i17;
                            i = ((iM2761 ^ i18) * 18523) ^ 2090557353;
                            i2 = 1158075839;
                            int i211 = iM2761 ^ i2;
                            sharedPreferences = sharedPreferences;
                            sArr3 = sArr3;
                            i26 = i26;
                            str5 = str5;
                            str6 = str6;
                            str7 = str7;
                            i20 = i211;
                            i19 = i;
                            break;
                        case 1:
                            iM2761 = (i17 - C0773.m3169("۬᩹")) * 91;
                            i = ((iM2761 ^ i18) * (-23927)) ^ 291903318;
                            i2 = -213956835;
                            int i212 = iM2761 ^ i2;
                            sharedPreferences = sharedPreferences;
                            sArr3 = sArr3;
                            i26 = i26;
                            str5 = str5;
                            str6 = str6;
                            str7 = str7;
                            i20 = i212;
                            i19 = i;
                            break;
                        case 2:
                            iM2761 = C0619.m2761("ۢۗ") ^ i18;
                            i = ((iM2761 ^ i17) * 23447) ^ 1618417992;
                            i2 = -882629438;
                            int i213 = iM2761 ^ i2;
                            sharedPreferences = sharedPreferences;
                            sArr3 = sArr3;
                            i26 = i26;
                            str5 = str5;
                            str6 = str6;
                            str7 = str7;
                            i20 = i213;
                            i19 = i;
                            break;
                        case 3:
                            int iM31621 = (C0773.m3169("ᩴۖ") + i17) * 87;
                            i19 = ((iM31621 ^ i18) * (-5385)) ^ (-440518626);
                            sharedPreferences = sharedPreferences;
                            sArr3 = sArr3;
                            i26 = i26;
                            str5 = str5;
                            str6 = str6;
                            str7 = str7;
                            i20 = iM31621 ^ (-1042836015);
                            break;
                        default:
                            iM2761 = (C0619.m2761("۟᩶") + i17) * 43;
                            i = ((iM2761 ^ i18) * 15111) ^ 241883854;
                            i2 = 1315952995;
                            int i214 = iM2761 ^ i2;
                            sharedPreferences = sharedPreferences;
                            sArr3 = sArr3;
                            i26 = i26;
                            str5 = str5;
                            str6 = str6;
                            str7 = str7;
                            i20 = i214;
                            i19 = i;
                            break;
                    }
                    strM11996 = strM11996;
                    break;
            }
            return;
        }
    }
}
