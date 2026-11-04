package l;

import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۨᩳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: C2R7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12530 extends AbstractC2432 {

    /* JADX INFO: renamed from: ۫۠᩺, reason: not valid java name and contains not printable characters */
    private static final short[] f40230 = {7427, 13946, 13054, -12345, 4428, 15128, 14252, 2373, 12308, -16085, -15214, 5418, -10805, 7696, 11141, -15291, 10567, -20178, -20178, -20178};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC7793 f40231;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f40232;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20472 f40233;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C10745 f40234;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C11378 f40235;

    /* JADX WARN: Code duplicated, block: B:38:0x0120 A[PHI: r12
      0x0120: PHI (r12v4 short[]) = (r12v3 short[]), (r12v2 short[]), (r12v2 short[]) binds: [B:37:0x011e, B:10:0x0066, B:7:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x01cc A[PHI: r2 r4 r9 r10
      0x01cc: PHI (r2v4 l.ۤ۠ᩴ) = (r2v2 l.ۤ۠ᩴ), (r2v3 l.ۤ۠ᩴ), (r2v2 l.ۤ۠ᩴ), (r2v2 l.ۤ۠ᩴ) binds: [B:51:0x01ca, B:41:0x0157, B:21:0x0092, B:7:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x01cc: PHI (r4v4 java.lang.String) = (r4v2 java.lang.String), (r4v2 java.lang.String), (r4v3 java.lang.String), (r4v2 java.lang.String) binds: [B:51:0x01ca, B:41:0x0157, B:21:0x0092, B:7:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x01cc: PHI (r9v4 int) = (r9v3 int), (r9v2 int), (r9v2 int), (r9v2 int) binds: [B:51:0x01ca, B:41:0x0157, B:21:0x0092, B:7:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x01cc: PHI (r10v4 int) = (r10v3 int), (r10v2 int), (r10v2 int), (r10v2 int) binds: [B:51:0x01ca, B:41:0x0157, B:21:0x0092, B:7:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x0200 A[PHI: r8
      0x0200: PHI (r8v4 int) = (r8v3 int), (r8v2 int) binds: [B:55:0x01fe, B:13:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x0231 A[PHI: r5 r7 r13 r14 r15
      0x0231: PHI (r5v4 int) = (r5v2 int), (r5v2 int), (r5v3 int), (r5v2 int), (r5v2 int), (r5v2 int) binds: [B:59:0x022f, B:33:0x00fe, B:25:0x00b5, B:15:0x0072, B:13:0x006e, B:10:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x0231: PHI (r7v4 short) = (r7v3 short), (r7v2 short), (r7v2 short), (r7v2 short), (r7v2 short), (r7v2 short) binds: [B:59:0x022f, B:33:0x00fe, B:25:0x00b5, B:15:0x0072, B:13:0x006e, B:10:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x0231: PHI (r13v4 int) = (r13v2 int), (r13v3 int), (r13v2 int), (r13v2 int), (r13v2 int), (r13v2 int) binds: [B:59:0x022f, B:33:0x00fe, B:25:0x00b5, B:15:0x0072, B:13:0x006e, B:10:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x0231: PHI (r14v4 int) = (r14v2 int), (r14v3 int), (r14v2 int), (r14v2 int), (r14v2 int), (r14v2 int) binds: [B:59:0x022f, B:33:0x00fe, B:25:0x00b5, B:15:0x0072, B:13:0x006e, B:10:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x0231: PHI (r15v4 short[]) = (r15v2 short[]), (r15v2 short[]), (r15v3 short[]), (r15v2 short[]), (r15v2 short[]), (r15v2 short[]) binds: [B:59:0x022f, B:33:0x00fe, B:25:0x00b5, B:15:0x0072, B:13:0x006e, B:10:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0265 A[PHI: r3 r16 r21
      0x0265: PHI (r3v3 int) = (r3v2 int), (r3v5 int) binds: [B:63:0x0263, B:29:0x00dd] A[DONT_GENERATE, DONT_INLINE]
      0x0265: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]) binds: [B:63:0x0263, B:29:0x00dd] A[DONT_GENERATE, DONT_INLINE]
      0x0265: PHI (r21v5 char) = (r21v4 char), (r21v3 char) binds: [B:63:0x0263, B:29:0x00dd] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        int iM3169;
        int i;
        int i2;
        int i3 = C3099.f10023;
        int i4 = C1146.f4234;
        int iM31610 = (C0773.m3169("ۛ֫") ^ i4) * (-115);
        int i5 = ((iM31610 ^ i3) * (-15761)) ^ 1557727758;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM31610 ^ 2076660457;
        C10745 c10745 = null;
        int i7 = 0;
        short s = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = -1520920269;
        char c = 0;
        String strM8069 = null;
        int iM2761 = 0;
        while (true) {
            i14 = i6 ^ (i5 & (((i14 ^ i3) * (-1855)) >> 31));
            switch (i14) {
                case -2069887237:
                case -1827224393:
                    iM2761 = 2101402340 ^ C0619.m2761(C4282.m13650(sArr2, i12, i13, i11));
                    if (C1542.f5343 <= 0) {
                        iM3169 = (C0619.m2761("ܺܶ") ^ i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM3169 ^ i3) * (-29411)) ^ 830304647;
                        i2 = -2125219622;
                    } else {
                        iM3169 = (i4 - C0773.m3169("ۖۖ")) * (-5);
                        i = ((iM3169 ^ i3) * 25149) ^ 2144888100;
                        i2 = 1636860646;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -2033765076:
                case 460305462:
                    c10745.m27393(strM8069);
                    c10745.mo25916((Runnable) null);
                    c10745.mo25931();
                    this.f40234 = c10745;
                    break;
                case -2025118050:
                case -2504329:
                    sArr2 = f40230;
                    if (C17202.f56030) {
                        iM3169 = (C0773.m3169("ۛ۠") ^ i3) * (-121);
                        i = ((iM3169 ^ i4) * (-21473)) ^ 1043937066;
                        i2 = 1990185355;
                    } else {
                        iM3169 = C0619.m2761("᩻᩸") ^ i4;
                        i = ((iM3169 ^ i3) * (-18295)) ^ 568279396;
                        i2 = 2114379893;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1701691328:
                case -720193119:
                    i9 = i8 * i8;
                    i10 = s * 2;
                    if (C3998.m12920()) {
                        iM3169 = (i4 - C0619.m2761("ۤ۬")) * 23;
                        i = ((iM3169 ^ i3) * 32609) ^ (-301928371);
                        i2 = -1853423999;
                    } else {
                        iM3169 = C0773.m3169("᩻ᩴ") ^ i3;
                        i = ((iM3169 ^ i4) * (-15687)) ^ 1528064409;
                        i2 = -456525928;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1490366487:
                case -486996349:
                    i11 = 45312;
                    iM3169 = C0773.m3169("ۙۜ") ^ i3;
                    i = ((iM3169 ^ i4) * (-27777)) ^ 620261027;
                    i2 = 671472601;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1236864130:
                case 1091083582:
                    s = sArr[c];
                    if (C3492.f12043 <= 0) {
                        iM3169 = C0773.m3169("ۤۖ") ^ i3;
                        i = ((iM3169 ^ i4) * 28645) ^ 1363361510;
                        i2 = -1319127321;
                    } else {
                        iM3169 = C0773.m3169("ۧ᩹") ^ i3;
                        i = ((iM3169 ^ i4) * (-22735)) ^ (-870696561);
                        i2 = 723712578;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1130872249:
                case 1006552939:
                    C17202.m40372();
                    if (RunnableC3055.m9933() != 0) {
                        iM3169 = C0773.m3169("ۤۖ") ^ i3;
                        i = ((iM3169 ^ i4) * 28645) ^ 1363361510;
                        i2 = -1319127321;
                    } else {
                        iM3169 = C0619.m2761("᩻᩸") ^ i4;
                        i = ((iM3169 ^ i3) * (-18295)) ^ 568279396;
                        i2 = 2114379893;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1028731037:
                case -608500903:
                    sArr = f40230;
                    c = '\r';
                    if (C1519.m5403()) {
                        iM3169 = C0773.m3169("֨ۘ") ^ i4;
                        i = ((iM3169 ^ i3) * (-9273)) ^ (-930485332);
                        i2 = 104799052;
                    } else {
                        iM3169 = (C0619.m2761("ܺܶ") ^ i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM3169 ^ i3) * (-29411)) ^ 830304647;
                        i2 = -2125219622;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -830672598:
                case 1412603759:
                    if (C20932.m47848() != 0) {
                        iM3169 = C0773.m3169("ۤۖ") ^ i3;
                        i = ((iM3169 ^ i4) * 28645) ^ 1363361510;
                        i2 = -1319127321;
                    } else {
                        iM3169 = C0773.m3169("᩷᩻") ^ i3;
                        i = ((iM3169 ^ i4) * (-22811)) ^ 1428952495;
                        i2 = 1797889763;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -525634513:
                case 1936781494:
                    i8 = s + 1;
                    if (C3998.f13671 != 0) {
                        iM3169 = C0773.m3169("᩷᩻") ^ i3;
                        i = ((iM3169 ^ i4) * (-22811)) ^ 1428952495;
                        i2 = 1797889763;
                    } else {
                        iM3169 = C0773.m3169("᩻֡") ^ i3;
                        i = ((iM3169 ^ i4) * 29617) ^ (-1936663421);
                        i2 = -1924957791;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -384987117:
                case 807104763:
                    C2834.m9344();
                    break;
                case -334348955:
                case 1063153451:
                    strM8069 = C2375.m8069(sArr3, i7, 3, i11);
                    if (C2419.f7754 >= 0) {
                        iM3169 = C0773.m3169("᩻ᩴ") ^ i3;
                        i = ((iM3169 ^ i4) * (-15687)) ^ 1528064409;
                        i2 = -456525928;
                    } else {
                        iM3169 = C0773.m3169("᩸ۜ") ^ i4;
                        i = ((iM3169 ^ i3) * (-14629)) ^ (-81754694);
                        i2 = -1424633520;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -332010160:
                case 1358390276:
                    c10745.m27397(iM2761);
                    sArr3 = f40230;
                    i7 = 17;
                    if (C1542.f5343 <= 0) {
                        iM3169 = C0773.m3169("ۤۖ") ^ i3;
                        i = ((iM3169 ^ i4) * 28645) ^ 1363361510;
                        i2 = -1319127321;
                    } else {
                        iM3169 = C0773.m3169("ۨۧ") ^ i3;
                        i = ((iM3169 ^ i4) * 20243) ^ 1982575727;
                        i2 = -1270867172;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -57299962:
                case 1884813948:
                    c10745 = new C10745(this.f40231);
                    if (C0619.f2439) {
                        iM3169 = C0773.m3169("᩻ᩴ") ^ i3;
                        i = ((iM3169 ^ i4) * (-15687)) ^ 1528064409;
                        i2 = -456525928;
                    } else {
                        iM3169 = (i4 - C0773.m3169("֫ᩴ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i = ((iM3169 ^ i3) * 31473) ^ 930081042;
                        i2 = 1489132378;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 745003214:
                case 863513217:
                    C0619.m2763();
                    C0862.m3503();
                    iM3169 = C0773.m3169("ۤۖ") ^ i3;
                    i = ((iM3169 ^ i4) * 28645) ^ 1363361510;
                    i2 = -1319127321;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 934423102:
                case 2070616125:
                    i12 = 14;
                    i13 = 3;
                    if (C0269.f1558 <= 0) {
                        iM3169 = C0773.m3169("ۤۖ") ^ i3;
                        i = ((iM3169 ^ i4) * 28645) ^ 1363361510;
                        i2 = -1319127321;
                    } else {
                        iM3169 = (i4 - C0773.m3169("֨ۧ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM3169 ^ i3) * 27995) ^ 985148837;
                        i2 = 15776630;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 976591434:
                case 1263886199:
                    if (i9 - (i10 + 1) >= 0) {
                        iM3169 = C0773.m3169("ۙ۫") ^ i4;
                        i = ((iM3169 ^ i3) * 16957) ^ (-862350540);
                        i2 = 391334617;
                    } else {
                        iM3169 = (i3 - C0773.m3169("᩶ۗ")) * (-53);
                        i = ((iM3169 ^ i4) * 2937) ^ (-1008420826);
                        i2 = 2088516633;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 1046881163:
                case 1135858736:
                    if (C2287.f7432 < 0) {
                        iM3169 = C0619.m2761("᩻᩸") ^ i4;
                        i = ((iM3169 ^ i3) * (-18295)) ^ 568279396;
                        i2 = 2114379893;
                    } else {
                        iM3169 = C0773.m3169("᩻ᩴ") ^ i3;
                        i = ((iM3169 ^ i4) * (-15687)) ^ 1528064409;
                        i2 = -456525928;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                default:
                    i11 = 59302;
                    iM3169 = C0773.m3169("ۙۜ") ^ i3;
                    i = ((iM3169 ^ i4) * (-27777)) ^ 620261027;
                    i2 = 671472601;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:61:0x0265 A[PHI: r14 r18 r19 r20 r21 r27
      0x0265: PHI (r14v5 java.lang.String) = 
      (r14v1 java.lang.String)
      (r14v1 java.lang.String)
      (r14v1 java.lang.String)
      (r14v2 java.lang.String)
      (r14v1 java.lang.String)
      (r14v1 java.lang.String)
     binds: [B:56:0x0234, B:97:0x0265, B:60:0x0263, B:33:0x012b, B:29:0x0109, B:13:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x0265: PHI (r18v6 java.lang.String) = 
      (r18v2 java.lang.String)
      (r18v2 java.lang.String)
      (r18v3 java.lang.String)
      (r18v2 java.lang.String)
      (r18v2 java.lang.String)
      (r18v2 java.lang.String)
     binds: [B:56:0x0234, B:97:0x0265, B:60:0x0263, B:33:0x012b, B:29:0x0109, B:13:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x0265: PHI (r19v6 char) = (r19v2 char), (r19v2 char), (r19v3 char), (r19v2 char), (r19v2 char), (r19v2 char) binds: [B:56:0x0234, B:97:0x0265, B:60:0x0263, B:33:0x012b, B:29:0x0109, B:13:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x0265: PHI (r20v17 short[]) = (r20v3 short[]), (r20v2 short[]), (r20v2 short[]), (r20v2 short[]), (r20v2 short[]), (r20v2 short[]) binds: [B:56:0x0234, B:97:0x0265, B:60:0x0263, B:33:0x012b, B:29:0x0109, B:13:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x0265: PHI (r21v44 java.lang.Object[]) = 
      (r21v8 java.lang.Object[])
      (r21v2 java.lang.Object[])
      (r21v40 java.lang.Object[])
      (r21v2 java.lang.Object[])
      (r21v2 java.lang.Object[])
      (r21v2 java.lang.Object[])
     binds: [B:56:0x0234, B:97:0x0265, B:60:0x0263, B:33:0x012b, B:29:0x0109, B:13:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x0265: PHI (r27v18 l.۟ۢ֫) = (r27v7 l.۟ۢ֫), (r27v3 l.۟ۢ֫), (r27v3 l.۟ۢ֫), (r27v3 l.۟ۢ֫), (r27v3 l.۟ۢ֫), (r27v3 l.۟ۢ֫) binds: [B:56:0x0234, B:97:0x0265, B:60:0x0263, B:33:0x012b, B:29:0x0109, B:13:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        int i;
        int iM3169;
        int i2;
        int i3;
        int i4;
        short[] sArr;
        int iM31610;
        int i5;
        C12530 c12530 = this;
        int i6 = 0;
        String strM33142 = null;
        C2361 c2361 = null;
        DialogInterfaceOnClickListenerC23370 dialogInterfaceOnClickListenerC23370 = null;
        int iM2761 = 0;
        int i7 = 0;
        int iM31611 = 0;
        int i8 = 0;
        String strM10047 = null;
        String strM33137 = null;
        short s = 0;
        int i9 = 0;
        int i10 = 102884151;
        int i11 = C23916.f77426;
        int i12 = C4282.f15546;
        int iM2762 = C0619.m2761("ۖ۫") ^ i11;
        int i13 = ((iM2762 ^ i12) * 13955) ^ (-974920227);
        int i14 = iM2762 ^ (-930916232);
        String strM11806 = null;
        ViewOnClickListenerC7793 viewOnClickListenerC7793 = null;
        short[] sArr2 = null;
        int i15 = 0;
        C11378 c11378 = null;
        short[] sArr3 = null;
        char c = 0;
        Object[] objArr = null;
        short[] sArr4 = null;
        while (true) {
            i10 = i14 ^ (i13 & (((i10 ^ i12) * 27637) >> 31));
            switch (i10) {
                case -2124990274:
                case 969718144:
                    C3492.m11487(c2361, C0619.m2761(strM10047) ^ 2116454690, null);
                    if (C2419.f7754 >= 0) {
                        iM3169 = (i12 - C0773.m3169("᩹᩵")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i2 = ((iM3169 ^ i11) * 25877) ^ (-1553450699);
                        i3 = 1409606126;
                    } else {
                        iM3169 = C0619.m2761("ܶ֡") ^ i12;
                        i2 = ((iM3169 ^ i11) * (-13737)) ^ (-264600416);
                        i3 = -686354541;
                    }
                    i14 = iM3169 ^ i3;
                    i13 = i2;
                    break;
                case -1937617946:
                case -1063396835:
                    objArr = objArr;
                    i6 = 1;
                    if (c11378.mo28700() == 1) {
                        iM31610 = C0619.m2761("ܰ۬") ^ i11;
                        i13 = ((iM31610 ^ i12) * (-10011)) ^ 336013885;
                        i5 = 1526293749;
                        i14 = iM31610 ^ i5;
                        c12530 = this;
                        objArr = objArr;
                    } else {
                        int iM31612 = C0773.m3169("ۢܰ") ^ i12;
                        i14 = iM31612 ^ (-464264370);
                        i13 = ((iM31612 ^ i11) * (-20373)) ^ (-1291740243);
                        objArr = objArr;
                        i6 = 1;
                    }
                    break;
                case -1914338100:
                case -1508678576:
                    AbstractC3624.m11755();
                    C3448.m11248();
                    iM3169 = C0619.m2761("ۧܺ") ^ i12;
                    i2 = ((iM3169 ^ i11) * 14105) ^ 1156275915;
                    i3 = -189041028;
                    i14 = iM3169 ^ i3;
                    i13 = i2;
                    break;
                case -1684375013:
                case -45384219:
                    objArr = objArr;
                    objArr[c] = strM11806;
                    ViewOnClickListenerC7793 viewOnClickListenerC7794 = c12530.f40231;
                    sArr3 = f40230;
                    if (C3690.f12684 > 0) {
                        int iM2763 = C0619.m2761("ᩳ۬") ^ i12;
                        i13 = ((iM2763 ^ i11) * (-17861)) ^ (-957926662);
                        i = iM2763 ^ 839003882;
                        viewOnClickListenerC7793 = viewOnClickListenerC7794;
                        i14 = i;
                        objArr = objArr;
                    } else {
                        viewOnClickListenerC7793 = viewOnClickListenerC7794;
                        objArr = objArr;
                        iM3169 = (i12 - C0773.m3169("᩹᩵")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i2 = ((iM3169 ^ i11) * 25877) ^ (-1553450699);
                        i3 = 1409606126;
                        i14 = iM3169 ^ i3;
                        i13 = i2;
                    }
                    break;
                case -1577537195:
                case 1262644001:
                    strM10047 = C3077.m10047(sArr4, 7, 3, i15);
                    if (RunnableC0334.f1808 <= 0) {
                        iM3169 = (i12 - C0773.m3169("᩹᩵")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i2 = ((iM3169 ^ i11) * 25877) ^ (-1553450699);
                        i3 = 1409606126;
                    } else {
                        iM3169 = C0773.m3169("᩶۟") ^ i11;
                        i2 = ((iM3169 ^ i12) * (-9259)) ^ (-656580788);
                        i3 = -1145614335;
                    }
                    i14 = iM3169 ^ i3;
                    i13 = i2;
                    break;
                case -1530939929:
                case 2109606214:
                    i15 = 18294;
                    iM31610 = C0773.m3169("ܺܽ") ^ i11;
                    i13 = ((iM31610 ^ i12) * (-21301)) ^ 832891951;
                    i5 = 45368132;
                    i14 = iM31610 ^ i5;
                    c12530 = this;
                    objArr = objArr;
                    break;
                case -1119857822:
                case 379759398:
                    objArr = objArr;
                    sArr = sArr3;
                    iM2761 = C0619.m2761(C1542.m5471(sArr, 1, 3, i15));
                    if (C0619.f2439) {
                        i4 = 2124751251;
                        int iM2764 = C0619.m2761("᩵ۢ") ^ i11;
                        int i16 = i4;
                        i13 = ((iM2764 ^ i12) * (-17223)) ^ (-516832069);
                        i14 = iM2764 ^ 990917126;
                        sArr3 = sArr;
                        i7 = i16;
                        objArr = objArr;
                    } else {
                        int iM2765 = C0619.m2761("᩹᩺") ^ i11;
                        i13 = ((iM2765 ^ i12) * (-5631)) ^ 1629893189;
                        i14 = iM2765 ^ (-808502900);
                        objArr = objArr;
                        sArr3 = sArr;
                        i7 = 2124751251;
                    }
                    break;
                case -1106365048:
                case 189209475:
                    objArr = objArr;
                    C11378 c11379 = c12530.f40235;
                    if (!C11235.m28304(c11379)) {
                        int iM2766 = C0619.m2761("ۧۖ") ^ i11;
                        i13 = ((iM2766 ^ i12) * 24413) ^ (-2094911897);
                        i = iM2766 ^ (-1235106625);
                        c11378 = c11379;
                        i14 = i;
                        objArr = objArr;
                    } else {
                        c11378 = c11379;
                        iM31610 = C0619.m2761("ܰ۬") ^ i11;
                        i13 = ((iM31610 ^ i12) * (-10011)) ^ 336013885;
                        i5 = 1526293749;
                        i14 = iM31610 ^ i5;
                        c12530 = this;
                        objArr = objArr;
                    }
                    break;
                case -1057980203:
                case -434037225:
                    strM11806 = RunnableC3646.m11806(c12530.f40232);
                    Object[] objArr2 = new Object[i6];
                    c = 0;
                    if (C4238.f15451 >= 0) {
                        objArr = objArr2;
                        iM3169 = (i12 - C0773.m3169("᩹᩵")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i2 = ((iM3169 ^ i11) * 25877) ^ (-1553450699);
                        i3 = 1409606126;
                        i14 = iM3169 ^ i3;
                        i13 = i2;
                    } else {
                        int iM2767 = C0619.m2761("۠ۚ") ^ i11;
                        objArr = objArr2;
                        i13 = ((iM2767 ^ i12) * 1253) ^ 1990100163;
                        i14 = iM2767 ^ (-1585843593);
                    }
                    break;
                case -969471723:
                case -206285395:
                    dialogInterfaceOnClickListenerC23370 = new DialogInterfaceOnClickListenerC23370(i6, c12530);
                    strM33137 = C13473.m33137(f40230, 10, 3, i15);
                    if (C2023.m6964() > 0) {
                        iM3169 = (C0619.m2761("ᩳۡ") + i11) * (-5);
                        i2 = ((iM3169 ^ i12) * (-11061)) ^ 182139975;
                        i3 = -1994847251;
                        i14 = iM3169 ^ i3;
                        i13 = i2;
                    } else {
                        objArr = objArr;
                        iM31610 = (C0619.m2761("ۙۚ") + i12) * (-55);
                        i13 = ((iM31610 ^ i11) * (-11317)) ^ 231153695;
                        i5 = 1349237457;
                        i14 = iM31610 ^ i5;
                        c12530 = this;
                        objArr = objArr;
                    }
                    break;
                case -803728294:
                case 704831649:
                    C0269.m1775();
                    break;
                case -633691940:
                case -181459653:
                    objArr = objArr;
                    ViewOnClickListenerC7793 viewOnClickListenerC7795 = viewOnClickListenerC7793;
                    strM33142 = C13473.m33142(viewOnClickListenerC7795, iM2761 ^ i7, objArr);
                    int i17 = DialogInterfaceC8327.f27315;
                    c2361 = new C2361(viewOnClickListenerC7795);
                    short[] sArr5 = f40230;
                    if (!C3779.m12264()) {
                        viewOnClickListenerC7793 = viewOnClickListenerC7795;
                        sArr2 = sArr5;
                        iM31610 = (C0619.m2761("ۙۚ") + i12) * (-55);
                        i13 = ((iM31610 ^ i11) * (-11317)) ^ 231153695;
                        i5 = 1349237457;
                        i14 = iM31610 ^ i5;
                        c12530 = this;
                        objArr = objArr;
                    } else {
                        int iM2768 = C0619.m2761("ۢ᩸") ^ i12;
                        i13 = ((iM2768 ^ i11) * (-7729)) ^ (-2077305181);
                        i = iM2768 ^ (-76201719);
                        viewOnClickListenerC7793 = viewOnClickListenerC7795;
                        sArr2 = sArr5;
                        i14 = i;
                        objArr = objArr;
                    }
                    break;
                case -539618870:
                case -291266094:
                    iM31611 = C0773.m3169(C1519.m5399(sArr2, 4, 3, i15));
                    i8 = 2118202662;
                    if (C3448.f11240 < 0) {
                        iM3169 = (C0773.m3169("֫ܳ") + i11) * (-43);
                        i2 = ((iM3169 ^ i12) * 20691) ^ (-2046763362);
                        i3 = 302704537;
                        i14 = iM3169 ^ i3;
                        i13 = i2;
                    } else {
                        objArr = objArr;
                        iM31610 = (C0619.m2761("ۙۚ") + i12) * (-55);
                        i13 = ((iM31610 ^ i11) * (-11317)) ^ 231153695;
                        i5 = 1349237457;
                        i14 = iM31610 ^ i5;
                        c12530 = this;
                        objArr = objArr;
                    }
                    break;
                case -249738498:
                case 945289105:
                    objArr = objArr;
                    if (RunnableC0334.m2059(c12530.f40234)) {
                        iM31610 = C0619.m2761("ܰ۬") ^ i11;
                        i13 = ((iM31610 ^ i12) * (-10011)) ^ 336013885;
                        i5 = 1526293749;
                        i14 = iM31610 ^ i5;
                        c12530 = this;
                        objArr = objArr;
                    } else {
                        int iM31613 = (i12 - C0773.m3169("۟֨")) * (-89);
                        i14 = iM31613 ^ (-45046788);
                        i13 = ((iM31613 ^ i11) * (-4407)) ^ (-1956686727);
                        objArr = objArr;
                        c12530 = this;
                    }
                    break;
                case -81490840:
                case 163109711:
                    C13473.m33136(c2361, iM31611 ^ i8);
                    C1519.m5410(c2361, strM33142);
                    sArr4 = f40230;
                    if (C0487.m2356() < 0) {
                        iM3169 = C0619.m2761("᩵᩻") ^ i12;
                        i2 = ((iM3169 ^ i11) * (-13709)) ^ (-1097542933);
                        i3 = 1877121682;
                        i14 = iM3169 ^ i3;
                        i13 = i2;
                    } else {
                        objArr = objArr;
                        iM31610 = (C0619.m2761("ۙۚ") + i12) * (-55);
                        i13 = ((iM31610 ^ i11) * (-11317)) ^ 231153695;
                        i5 = 1349237457;
                        i14 = iM31610 ^ i5;
                        c12530 = this;
                        objArr = objArr;
                    }
                    break;
                case 32529053:
                case 956601272:
                    if (C0269.m1775() <= 0) {
                        iM3169 = C0619.m2761("ۧܺ") ^ i12;
                        i2 = ((iM3169 ^ i11) * 14105) ^ 1156275915;
                        i3 = -189041028;
                    } else {
                        iM3169 = (i12 - C0773.m3169("᩹᩵")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i2 = ((iM3169 ^ i11) * 25877) ^ (-1553450699);
                        i3 = 1409606126;
                    }
                    i14 = iM3169 ^ i3;
                    i13 = i2;
                    break;
                case 649637205:
                case 1010241269:
                    i15 = 16574;
                    iM31610 = C0773.m3169("ܺܽ") ^ i11;
                    i13 = ((iM31610 ^ i12) * (-21301)) ^ 832891951;
                    i5 = 45368132;
                    i14 = iM31610 ^ i5;
                    c12530 = this;
                    objArr = objArr;
                    break;
                case 686557900:
                case 1887589024:
                    objArr = objArr;
                    int i18 = s + 1;
                    if ((i18 * i18) - (i9 + 1) >= 0) {
                        iM31610 = (C0773.m3169("ۗ᩹") + i11) * 63;
                        i13 = ((iM31610 ^ i12) * (-23539)) ^ 56971384;
                        i5 = -627837425;
                    } else {
                        iM31610 = C0773.m3169("᩻ܶ") ^ i12;
                        i13 = ((iM31610 ^ i11) * 12419) ^ 694132328;
                        i5 = 412585467;
                    }
                    i14 = iM31610 ^ i5;
                    c12530 = this;
                    objArr = objArr;
                    break;
                case 822483448:
                case 1892246711:
                    C2023.m6964();
                    if (C3448.f11240 < 0) {
                        i4 = i7;
                        sArr = sArr3;
                        objArr = objArr;
                        int iM2769 = C0619.m2761("᩵ۢ") ^ i11;
                        int i19 = i4;
                        i13 = ((iM2769 ^ i12) * (-17223)) ^ (-516832069);
                        i14 = iM2769 ^ 990917126;
                        sArr3 = sArr;
                        i7 = i19;
                        objArr = objArr;
                    } else {
                        iM3169 = (i12 - C0773.m3169("᩹᩵")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i2 = ((iM3169 ^ i11) * 25877) ^ (-1553450699);
                        i3 = 1409606126;
                        i14 = iM3169 ^ i3;
                        i13 = i2;
                    }
                    break;
                case 1008458613:
                case 1348875233:
                    C2375.m8063(c2361, C0773.m3169(strM33137) ^ 2129371974, dialogInterfaceOnClickListenerC23370);
                    C1321.m4860(c2361);
                    objArr = objArr;
                    iM31610 = C0619.m2761("ܰ۬") ^ i11;
                    i13 = ((iM31610 ^ i12) * (-10011)) ^ 336013885;
                    i5 = 1526293749;
                    i14 = iM31610 ^ i5;
                    c12530 = this;
                    objArr = objArr;
                    break;
                case 1372130511:
                case 1387458041:
                    if (C2834.f9334 > 0) {
                        iM3169 = C0619.m2761("ۧܺ") ^ i12;
                        i2 = ((iM3169 ^ i11) * 14105) ^ 1156275915;
                        i3 = -189041028;
                    } else {
                        iM3169 = (i11 - C0773.m3169("᩻۫")) * 23;
                        i2 = ((iM3169 ^ i12) * (-32717)) ^ 521409521;
                        i3 = -332314982;
                    }
                    i14 = iM3169 ^ i3;
                    i13 = i2;
                    break;
                case 1612370655:
                case 2043385273:
                    break;
                default:
                    objArr = objArr;
                    s = f40230[0];
                    i9 = s * 2;
                    if (C3099.f10023 <= 0) {
                        iM31610 = (C0619.m2761("ۙۚ") + i12) * (-55);
                        i13 = ((iM31610 ^ i11) * (-11317)) ^ 231153695;
                        i5 = 1349237457;
                    } else {
                        iM31610 = (C0773.m3169("ܰܿ") + i12) * 99;
                        i13 = ((iM31610 ^ i11) * 31197) ^ 1864031806;
                        i5 = 55039520;
                    }
                    i14 = iM31610 ^ i5;
                    c12530 = this;
                    objArr = objArr;
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        ViewOnClickListenerC7793 viewOnClickListenerC7793 = null;
        int i = -204379854;
        int i2 = C2375.f7641;
        int i3 = C3734.f12817;
        int iM3169 = C0773.m3169("۟֡") ^ i3;
        int i4 = ((iM3169 ^ i2) * 17503) ^ 1772269486;
        int i5 = 2121829798;
        while (true) {
            i = ((((i ^ i2) * (-7333)) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2014169469:
                case -922409826:
                    if (C2419.f7754 >= 0) {
                        iM3169 = C0773.m3169("ۤۚ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 25271) ^ (-1006059135);
                        i5 = -135398801;
                    } else {
                        iM3169 = C0773.m3169("֡۫") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-28627)) ^ 904355231;
                        i5 = 745737785;
                    }
                    break;
                case -1857432139:
                case 14951162:
                    if (C4238.f15451 >= 0) {
                        iM3169 = (C0773.m3169("ۘᩳ") ^ i2) * (-55);
                        i4 = ((iM3169 ^ i3) * 11163) ^ (-91818787);
                        i5 = -1122591029;
                    } else {
                        iM3169 = C0619.m2761("۟ᩳ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-7107)) ^ 1836231507;
                        i5 = -696925790;
                    }
                    break;
                case -1785665261:
                case 1331829037:
                    if (C23916.f77426 <= 0) {
                        iM3169 = (C0773.m3169("᩶ۗ") + i3) * (-95);
                        i4 = ((iM3169 ^ i2) * 1133) ^ (-144980966);
                        i5 = -142226947;
                    } else {
                        iM3169 = (C0619.m2761("᩹ۛ") + i3) * 109;
                        i4 = ((iM3169 ^ i2) * 26265) ^ 981923838;
                        i5 = 1039260817;
                    }
                    break;
                case -1630446081:
                case -1055551899:
                    if (C2966.f9654 >= 0) {
                        iM3169 = (C0773.m3169("ۘᩳ") ^ i2) * (-55);
                        i4 = ((iM3169 ^ i3) * 11163) ^ (-91818787);
                        i5 = -1122591029;
                    } else {
                        iM3169 = C0619.m2761("֨ᩳ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 3967) ^ (-1429637611);
                        i5 = -1210918683;
                    }
                    break;
                case -1565803857:
                case -38237672:
                    if (C1080.f3865 >= 0) {
                        iM3169 = C0773.m3169("ۤۚ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 25271) ^ (-1006059135);
                        i5 = -135398801;
                    } else {
                        iM3169 = (i3 - C0773.m3169("۠ܿ")) * (-91);
                        i4 = ((iM3169 ^ i2) * 16549) ^ (-1073248547);
                        i5 = -1035905945;
                    }
                    break;
                case -1022589609:
                case 1239245879:
                    viewOnClickListenerC7793 = this.f40231;
                    if (C2287.f7432 >= 0) {
                        iM3169 = C0619.m2761("ܶۜ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 11275) ^ 72647645;
                        i5 = 1136135047;
                    } else {
                        iM3169 = C0773.m3169("ۛ۠") ^ i3;
                        i4 = ((iM3169 ^ i2) * 4667) ^ (-1609585589);
                        i5 = -621892062;
                    }
                    break;
                case -787555485:
                case 1895872552:
                    C2310.m7813();
                    if (C1564.f5401 <= 0) {
                        iM3169 = (C0773.m3169("ۘᩳ") ^ i2) * (-55);
                        i4 = ((iM3169 ^ i3) * 11163) ^ (-91818787);
                        i5 = -1122591029;
                    } else {
                        iM3169 = (C0773.m3169("᩶ۗ") + i3) * (-95);
                        i4 = ((iM3169 ^ i2) * 1133) ^ (-144980966);
                        i5 = -142226947;
                    }
                    break;
                case -746146931:
                case 1495599033:
                    C1826.m6301();
                    C2287.m7745();
                    iM3169 = (C0773.m3169("᩶ۗ") + i3) * (-95);
                    i4 = ((iM3169 ^ i2) * 1133) ^ (-144980966);
                    i5 = -142226947;
                    break;
                case -693623976:
                case -290323545:
                    if (!C17202.m40372()) {
                        iM3169 = (C0619.m2761("ۨۘ") + i2) * 11;
                        i4 = ((iM3169 ^ i3) * (-29893)) ^ 179901717;
                        i5 = -728300320;
                    } else {
                        iM3169 = C0773.m3169("ۤۚ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 25271) ^ (-1006059135);
                        i5 = -135398801;
                    }
                    break;
                case -590950085:
                case 1660807328:
                    if (C0862.f3233 != 0) {
                        iM3169 = (C0619.m2761("ۨۘ") + i2) * 11;
                        i4 = ((iM3169 ^ i3) * (-29893)) ^ 179901717;
                        i5 = -728300320;
                    } else {
                        iM3169 = (C0773.m3169("᩶ۗ") + i3) * (-95);
                        i4 = ((iM3169 ^ i2) * 1133) ^ (-144980966);
                        i5 = -142226947;
                    }
                    break;
                case -345466435:
                case 661756493:
                    if (C1080.f3865 >= 0) {
                        iM3169 = C0773.m3169("ۤۚ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 25271) ^ (-1006059135);
                        i5 = -135398801;
                    } else {
                        iM3169 = (C0773.m3169("᩻۫") + i2) * 33;
                        i4 = ((iM3169 ^ i3) * 14099) ^ (-201161650);
                        i5 = 1585037380;
                    }
                    break;
                case 873366280:
                case 1890491993:
                    if (C0862.f3233 != 0) {
                        iM3169 = C0619.m2761("ܶۜ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 11275) ^ 72647645;
                        i5 = 1136135047;
                    } else {
                        iM3169 = (C0619.m2761("۬ܿ") ^ i2) * (-29);
                        i4 = ((iM3169 ^ i3) * (-11297)) ^ (-475417258);
                        i5 = 1402499595;
                    }
                    break;
                case 1171239511:
                case 1487744810:
                    if (C1542.m5459() >= 0) {
                        iM3169 = (C0619.m2761("ۨۘ") + i2) * 11;
                        i4 = ((iM3169 ^ i3) * (-29893)) ^ 179901717;
                        i5 = -728300320;
                    } else {
                        iM3169 = C0773.m3169("ۢ᩹") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-27089)) ^ (-1722309528);
                        i5 = -440484041;
                    }
                    break;
                case 1342094334:
                case 1615097010:
                    AbstractC0641.m2814(viewOnClickListenerC7793, exc, null);
                    break;
                case 1511363047:
                case 1827719130:
                    C1080.m4050();
                    C2288.m7767();
                    break;
                default:
                    if (C2375.m8065() <= 0) {
                        iM3169 = (C0773.m3169("ۘᩳ") ^ i2) * (-55);
                        i4 = ((iM3169 ^ i3) * 11163) ^ (-91818787);
                        i5 = -1122591029;
                    } else {
                        iM3169 = (C0773.m3169("֨ܽ") + i3) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM3169 ^ i2) * 2449) ^ (-1744754234);
                        i5 = 1805510732;
                    }
                    break;
            }
            return;
        }
    }

    public C12530(ViewOnClickListenerC7793 viewOnClickListenerC7793, C20472 c20472) {
        C11378 c11378 = null;
        int i = -2017833638;
        int i2 = C2966.f9654;
        int i3 = C11235.f35427;
        this.f40231 = viewOnClickListenerC7793;
        this.f40233 = c20472;
        int iM3169 = (i2 - C0773.m3169("᩸ۤ")) * (-121);
        int i4 = ((iM3169 ^ i3) * (-7555)) ^ 732697292;
        int i5 = -1483875172;
        while (true) {
            i = ((((i ^ i3) * 24463) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -1895816830:
                case -216267494:
                    if (C2485.m8357() <= 0) {
                        iM3169 = (i2 - C0773.m3169("ܿܶ")) * (-115);
                        i4 = ((iM3169 ^ i3) * (-30823)) ^ (-1860568284);
                        i5 = 2136071323;
                    } else {
                        iM3169 = C0619.m2761("ۤۚ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-30785)) ^ (-1576950589);
                        i5 = 314340367;
                    }
                    break;
                case -1885114950:
                case 1765567910:
                    c11378.m28703();
                    this.f40235 = c11378;
                    return;
                case -1766297205:
                case 869385987:
                    C0862.m3503();
                    if (RunnableC3055.f9898 < 0) {
                        iM3169 = C0619.m2761("۟ᩳ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-4085)) ^ 315259389;
                        i5 = 2124309909;
                    } else {
                        iM3169 = C0619.m2761("ܿܿ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 2847) ^ 897251388;
                        i5 = 882090803;
                    }
                    break;
                case -1588986325:
                case -259101074:
                    if (RunnableC0334.m2063()) {
                        iM3169 = (i2 - C0773.m3169("ܿܶ")) * (-115);
                        i4 = ((iM3169 ^ i3) * (-30823)) ^ (-1860568284);
                        i5 = 2136071323;
                    } else {
                        iM3169 = (C0773.m3169("᩺ۡ") ^ i3) * 45;
                        i4 = ((iM3169 ^ i2) * (-31169)) ^ (-1442579911);
                        i5 = -1525411754;
                    }
                    break;
                case -1502513273:
                case 1550759378:
                    RunnableC0334.m2063();
                    C0619.m2763();
                    throw new RuntimeException();
                case -1388752225:
                case 561132083:
                    if (C2287.m7745() <= 0) {
                        iM3169 = C0619.m2761("ۜ᩷") ^ i3;
                        i4 = ((iM3169 ^ i2) * 2391) ^ (-993010858);
                        i5 = -1800456940;
                    } else {
                        iM3169 = C0619.m2761("᩻ۧ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 9453) ^ 636599825;
                        i5 = -327163632;
                    }
                    break;
                case -842213333:
                case 343118439:
                    if (C2966.f9654 >= 0) {
                        iM3169 = C0619.m2761("ۜ᩷") ^ i3;
                        i4 = ((iM3169 ^ i2) * 2391) ^ (-993010858);
                        i5 = -1800456940;
                    } else {
                        iM3169 = C0619.m2761("۟ᩳ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-4085)) ^ 315259389;
                        i5 = 2124309909;
                    }
                    break;
                case -646049761:
                case 1223846645:
                    if (C0269.f1558 <= 0) {
                        iM3169 = (i2 - C0773.m3169("ܿܶ")) * (-115);
                        i4 = ((iM3169 ^ i3) * (-30823)) ^ (-1860568284);
                        i5 = 2136071323;
                    } else {
                        iM3169 = C0773.m3169("ᩳ᩷") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-17823)) ^ (-457522497);
                        i5 = 1071132591;
                    }
                    break;
                case -478064862:
                case 789240350:
                    C0862.m3503();
                    AbstractC3624.m11755();
                    iM3169 = C0619.m2761("ܿܿ") ^ i3;
                    i4 = ((iM3169 ^ i2) * 2847) ^ 897251388;
                    i5 = 882090803;
                    break;
                case -145340367:
                case 1902321439:
                    if (C2878.f9462) {
                        iM3169 = C0773.m3169("᩵֫") ^ i2;
                        i4 = ((iM3169 ^ i3) * 24887) ^ 1496289663;
                        i5 = 195333534;
                    } else {
                        iM3169 = C0773.m3169("ۢ۠") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-19263)) ^ (-1258984148);
                        i5 = 1838249875;
                    }
                    break;
                case -89752597:
                case 437147297:
                    if (C2310.f7472 >= 0) {
                        iM3169 = C0619.m2761("۟ᩳ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-4085)) ^ 315259389;
                        i5 = 2124309909;
                    } else {
                        iM3169 = (C0773.m3169("᩻ۗ") + i3) * (-63);
                        i4 = ((iM3169 ^ i2) * (-25097)) ^ 2085974029;
                        i5 = 1451854482;
                    }
                    break;
                case -63060016:
                case 437207165:
                    c11378 = new C11378(viewOnClickListenerC7793);
                    if (AbstractC0116.m1243() != 0) {
                        iM3169 = C0619.m2761("۟ᩳ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-4085)) ^ 315259389;
                        i5 = 2124309909;
                    } else {
                        iM3169 = C0619.m2761("۟۫") ^ i3;
                        i4 = ((iM3169 ^ i2) * 12093) ^ (-1827295875);
                        i5 = 1846781347;
                    }
                    break;
                case -51294949:
                case 625576745:
                    if (C4238.f15451 >= 0) {
                        iM3169 = C0619.m2761("ܿܿ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 2847) ^ 897251388;
                        i5 = 882090803;
                    } else {
                        iM3169 = C0773.m3169("۟ۨ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 17943) ^ 1000599736;
                        i5 = -705858337;
                    }
                    break;
                case 45753108:
                case 1207265318:
                    if (C3492.f12043 <= 0) {
                        iM3169 = (i2 - C0773.m3169("ܿܶ")) * (-115);
                        i4 = ((iM3169 ^ i3) * (-30823)) ^ (-1860568284);
                        i5 = 2136071323;
                    } else {
                        iM3169 = (i3 - C0773.m3169("᩸֫")) * (-25);
                        i4 = ((iM3169 ^ i2) * 21669) ^ 1031149022;
                        i5 = -1304953498;
                    }
                    break;
                case 1250837844:
                case 1956283105:
                    if (C3779.f12953 <= 0) {
                        iM3169 = C0773.m3169("᩵֫") ^ i2;
                        i4 = ((iM3169 ^ i3) * 24887) ^ 1496289663;
                        i5 = 195333534;
                    } else {
                        iM3169 = (C0619.m2761("᩷ۗ") ^ i2) * (-105);
                        i4 = ((iM3169 ^ i3) * 29345) ^ 1286856835;
                        i5 = -1918779567;
                    }
                    break;
                default:
                    C3492.m11488();
                    if (C23916.f77426 > 0) {
                        iM3169 = C0773.m3169("᩵֫") ^ i2;
                        i4 = ((iM3169 ^ i3) * 24887) ^ 1496289663;
                        i5 = 195333534;
                    } else {
                        iM3169 = C0619.m2761("ܿܿ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 2847) ^ 897251388;
                        i5 = 882090803;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0190 A[PHI: r5 r15
      0x0190: PHI (r5v3 boolean) = (r5v2 boolean), (r5v1 boolean) binds: [B:42:0x0174, B:6:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x0190: PHI (r15v2 l.ۧۙ۫) = (r15v1 l.ۧۙ۫), (r15v4 l.ۧۙ۫) binds: [B:42:0x0174, B:6:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x01d7 A[PHI: r11 r12
      0x01d7: PHI (r11v3 l.᩶᩷۫) = (r11v1 l.᩶᩷۫), (r11v2 l.᩶᩷۫), (r11v1 l.᩶᩷۫) binds: [B:123:0x01d7, B:52:0x01d5, B:14:0x0086] A[DONT_GENERATE, DONT_INLINE]
      0x01d7: PHI (r12v3 l.᩷ۨᩴ) = (r12v1 l.᩷ۨᩴ), (r12v2 l.᩷ۨᩴ), (r12v1 l.᩷ۨᩴ) binds: [B:123:0x01d7, B:52:0x01d5, B:14:0x0086] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws Throwable {
        int iM2761;
        int i;
        int i2;
        AbstractC22044 abstractC22044;
        C10745 c10745;
        String str;
        C3374 c3374;
        C24202 c24202;
        C10745 c10746;
        AbstractC22044 abstractC22045;
        C24202 c24203;
        int i3;
        AbstractC22044 abstractC22046;
        C3374 c3375;
        C10745 c10747;
        String str2;
        C24202 c24204;
        AbstractC22044 abstractC22047;
        C10745 c10748;
        String str3;
        C12530 c12530 = this;
        String strM12926 = null;
        long jM54179 = 0;
        long j = 0;
        C21578 c21578M49094 = null;
        AbstractC22044 abstractC22048 = null;
        C21578 c21578M49096 = null;
        boolean zMo4292 = false;
        C11378 c11378 = null;
        int i4 = 610165107;
        int i5 = C1146.f4234;
        int i6 = C3099.f10023;
        int iM2762 = C0619.m2761("ۗۖ") ^ i5;
        int i7 = ((iM2762 ^ i6) * 16849) ^ (-600627334);
        int i8 = iM2762 ^ (-838488625);
        AbstractC22044 abstractC22049 = null;
        boolean z = false;
        C24202 c24205 = null;
        C3374 c3376 = null;
        C10745 c10749 = null;
        AbstractC22044 abstractC220410 = null;
        String strM12927 = null;
        C10745 c107410 = null;
        while (true) {
            i4 = i8 ^ (i7 & (((i4 ^ i6) * 5103) >> 31));
            switch (i4) {
                case -2094796941:
                case 1858296035:
                    abstractC220410 = c12530.f40232;
                    c107410 = c12530.f40234;
                    C1321.m4848(c107410);
                    if (C2485.f7950 == 0) {
                        iM2761 = C0619.m2761("۟ᩴ") ^ i5;
                        i = ((iM2761 ^ i6) * 24211) ^ 1692302601;
                        i2 = 1450007573;
                        i8 = iM2761 ^ i2;
                        i7 = i;
                    } else {
                        int iM3169 = C0773.m3169("ܰ᩹") ^ i5;
                        i8 = iM3169 ^ (-380272194);
                        i7 = ((iM3169 ^ i6) * 20245) ^ 9458287;
                        c3376 = null;
                    }
                    break;
                case -1998147675:
                case 1411923124:
                    C24202 c24206 = c24205;
                    abstractC22049.mo49834();
                    abstractC22044 = abstractC220410;
                    c10746 = c107410;
                    long jM541710 = c24206.m54179();
                    if (C4282.f15546 > 0) {
                        C3374 c3377 = new C3374(jM541710);
                        AbstractC0641.m2819(c3377, c12530.f40234.m27398());
                        if (RunnableC3055.m9933() != 0) {
                            c3376 = c3377;
                            c24202 = c24206;
                            str3 = strM12927;
                            int iM31610 = C0773.m3169("۟᩸") ^ i6;
                            int i9 = ((iM31610 ^ i5) * 20471) ^ (-318774421);
                            i3 = iM31610 ^ 22506225;
                            strM12927 = str3;
                            c107410 = c10746;
                            c24205 = c24202;
                            i7 = i9;
                        } else {
                            int iM2763 = (i6 - C0619.m2761("۬ᩳ")) * (-69);
                            int i10 = ((iM2763 ^ i5) * 12329) ^ 510958055;
                            i3 = iM2763 ^ 1992618300;
                            c3376 = c3377;
                            i7 = i10;
                            c107410 = c10746;
                            c24205 = c24206;
                        }
                        abstractC22045 = abstractC22044;
                        i8 = i3;
                        abstractC220410 = abstractC22045;
                    } else {
                        abstractC220410 = abstractC22044;
                        c107410 = c10746;
                        c24205 = c24206;
                        int iM31611 = C0773.m3169("ܰ᩹") ^ i5;
                        i8 = iM31611 ^ (-380272194);
                        i7 = ((iM31611 ^ i6) * 20245) ^ 9458287;
                        c3376 = null;
                    }
                    break;
                case -1925927672:
                case 400231962:
                    C1519.m5403();
                    RunnableC3055.m9933();
                    break;
                case -1891137627:
                case 307847836:
                    strM12926 = C3998.m12926(c12530.f40232);
                    jM54179 = c24205.m54179();
                    j = 0;
                    if (C1321.f4751 < 0) {
                        iM2761 = C0619.m2761("ᩴۗ") ^ i6;
                        i = ((iM2761 ^ i5) * (-18995)) ^ 7113164;
                        i2 = -1883510313;
                        i8 = iM2761 ^ i2;
                        i7 = i;
                    } else {
                        abstractC22044 = abstractC220410;
                        c10745 = c107410;
                        str = strM12927;
                        c3374 = c3376;
                        int iM31612 = (C0773.m3169("᩵ۤ") + i5) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        strM12927 = str;
                        c3376 = c3374;
                        c107410 = c10745;
                        c24205 = null;
                        abstractC22045 = abstractC22044;
                        i8 = iM31612 ^ (-670559714);
                        i7 = ((iM31612 ^ i6) * (-919)) ^ 813295225;
                        abstractC220410 = abstractC22045;
                    }
                    break;
                case -1670934865:
                case 1832789939:
                    c21578M49096 = C21578.m49096(abstractC22048);
                    zMo4292 = c12530.f40232.mo4292();
                    if (C2966.f9654 < 0) {
                        iM2761 = C0619.m2761("ܿۢ") ^ i6;
                        i = ((iM2761 ^ i5) * (-25743)) ^ (-226551118);
                        i2 = 981322295;
                        i8 = iM2761 ^ i2;
                        i7 = i;
                    } else {
                        abstractC22044 = abstractC220410;
                        c24202 = c24205;
                        c10746 = c107410;
                        str3 = strM12927;
                        int iM31613 = C0773.m3169("۟᩸") ^ i6;
                        int i11 = ((iM31613 ^ i5) * 20471) ^ (-318774421);
                        i3 = iM31613 ^ 22506225;
                        strM12927 = str3;
                        c107410 = c10746;
                        c24205 = c24202;
                        i7 = i11;
                        abstractC22045 = abstractC22044;
                        i8 = i3;
                        abstractC220410 = abstractC22045;
                    }
                    break;
                case -1651153804:
                case 8355219:
                    if (c11378.mo28700() != 0) {
                        abstractC22046 = abstractC220410;
                        c3375 = c3376;
                        C24202 c24207 = c24205;
                        c10747 = c107410;
                        str2 = strM12927;
                        c24204 = c24207;
                        int iM2764 = C0619.m2761("ۙۡ") ^ i6;
                        c3376 = c3375;
                        abstractC22047 = abstractC22046;
                        i8 = iM2764 ^ (-1302659968);
                        i7 = ((iM2764 ^ i5) * (-20371)) ^ (-695763827);
                        abstractC220410 = abstractC22047;
                        C24202 c24208 = c24204;
                        strM12927 = str2;
                        c107410 = c10747;
                        c24205 = c24208;
                    } else {
                        iM2761 = (C0619.m2761("۠ܳ") ^ i5) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM2761 ^ i6) * 20413) ^ 102597745;
                        i2 = -646243937;
                        i8 = iM2761 ^ i2;
                        i7 = i;
                    }
                    break;
                case -1524243767:
                case -810178247:
                    abstractC22046 = abstractC220410;
                    C24202 c24209 = c24205;
                    c3375 = c3376;
                    c10747 = c107410;
                    str2 = strM12927;
                    AbstractC22044 abstractC22044M54177 = c24209.m54177();
                    c12530.f40232 = abstractC22044M54177;
                    if (C1826.m6303(abstractC22044M54177)) {
                        int iM2765 = C0619.m2761("֫᩶") ^ i5;
                        c24204 = c24209;
                        i7 = ((iM2765 ^ i6) * 29497) ^ (-1451580210);
                        c3376 = c3375;
                        abstractC22047 = abstractC22046;
                        i8 = iM2765 ^ (-1574897995);
                    } else {
                        c24204 = c24209;
                        int iM2766 = C0619.m2761("ۙۡ") ^ i6;
                        c3376 = c3375;
                        abstractC22047 = abstractC22046;
                        i8 = iM2766 ^ (-1302659968);
                        i7 = ((iM2766 ^ i5) * (-20371)) ^ (-695763827);
                    }
                    abstractC220410 = abstractC22047;
                    C24202 c242010 = c24204;
                    strM12927 = str2;
                    c107410 = c10747;
                    c24205 = c242010;
                    break;
                case -1267365624:
                case -434836126:
                    abstractC220410.mo4300(new C12978(c107410));
                    abstractC22046 = abstractC220410;
                    c3375 = c3376;
                    C24202 c242011 = c24205;
                    c10747 = c107410;
                    str2 = strM12927;
                    c24204 = c242011;
                    int iM2767 = C0619.m2761("ۙۡ") ^ i6;
                    c3376 = c3375;
                    abstractC22047 = abstractC22046;
                    i8 = iM2767 ^ (-1302659968);
                    i7 = ((iM2767 ^ i5) * (-20371)) ^ (-695763827);
                    abstractC220410 = abstractC22047;
                    C24202 c242012 = c24204;
                    strM12927 = str2;
                    c107410 = c10747;
                    c24205 = c242012;
                    break;
                case -829692241:
                case 1212287906:
                    z = true;
                    if (c11378.mo28700() == 1) {
                        iM2761 = (i5 - C0773.m3169("᩺᩻")) * (-27);
                        i = ((iM2761 ^ i6) * 10243) ^ (-833921863);
                        i2 = -1977473581;
                    } else {
                        iM2761 = (i5 - C0619.m2761("۟ܿ")) * (-113);
                        i = ((iM2761 ^ i6) * (-12737)) ^ (-1445325418);
                        i2 = 420619990;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case -711455995:
                case -672519758:
                    c21578M49094 = C21578.m49094(jM54179, j);
                    abstractC22048 = c12530.f40232;
                    if (C3690.f12684 <= 0) {
                        iM2761 = (C0619.m2761("ۨۖ") ^ i6) * (-85);
                        i = ((iM2761 ^ i5) * (-23923)) ^ 1535437515;
                        i2 = -1771656276;
                    } else {
                        iM2761 = C0773.m3169("۫֡") ^ i5;
                        i = ((iM2761 ^ i6) * 6051) ^ 1255885802;
                        i2 = -582507097;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case -374451082:
                case 1589383590:
                    break;
                case -368517842:
                case 2114993567:
                    abstractC22044 = abstractC220410;
                    c24203 = c24205;
                    C3374 c3378 = c3376;
                    c10745 = c107410;
                    C10745 c107411 = c12530.f40234;
                    strM12927 = C3998.m12926(c12530.f40232);
                    if (C4238.f15451 < 0) {
                        int iM2768 = C0619.m2761("ۛۡ") ^ i6;
                        c10749 = c107411;
                        c3376 = c3378;
                        c10748 = c10745;
                        c24205 = c24203;
                        i7 = ((iM2768 ^ i5) * (-14559)) ^ 691936321;
                        abstractC220410 = abstractC22044;
                        i8 = iM2768 ^ 1406851200;
                        c107410 = c10748;
                    } else {
                        c10749 = c107411;
                        abstractC220410 = abstractC22044;
                        c107410 = c10745;
                        c24205 = c24203;
                        int iM31614 = C0773.m3169("ܰ᩹") ^ i5;
                        i8 = iM31614 ^ (-380272194);
                        i7 = ((iM31614 ^ i6) * 20245) ^ 9458287;
                        c3376 = null;
                    }
                    break;
                case -339478402:
                case 1493532430:
                    if (C1564.f5401 <= 0) {
                        iM2761 = (C0619.m2761("ܶ֫") ^ i6) * 39;
                        i = ((iM2761 ^ i5) * 8087) ^ 1022528499;
                        i2 = -105481907;
                    } else {
                        iM2761 = (C0619.m2761("ۨۖ") ^ i6) * (-85);
                        i = ((iM2761 ^ i5) * (-23923)) ^ 1535437515;
                        i2 = -1771656276;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case -215624255:
                case 1193771513:
                    c24205.m54178(c12530.f40232, new C20735(c12530, c3376));
                    break;
                case 64790408:
                case 1966213174:
                    if (c11378.mo28700() == 2) {
                        iM2761 = C0619.m2761("ۛۤ") ^ i6;
                        i = ((iM2761 ^ i5) * 27225) ^ (-571478833);
                        i2 = 21685271;
                    } else {
                        iM2761 = C0773.m3169("ۡܿ") ^ i5;
                        i = ((iM2761 ^ i6) * 30485) ^ (-584631451);
                        i2 = -1341718545;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case 193526112:
                case 479514371:
                    abstractC22044 = abstractC220410;
                    c24202 = c24205;
                    C3374 c3379 = c3376;
                    c10746 = c107410;
                    str3 = strM12927;
                    c10749.m27393(str3);
                    AbstractC22044 abstractC220411 = c12530.f40232;
                    if (C1783.f6087 > 0) {
                        int iM2769 = C0619.m2761("ܿۡ") ^ i5;
                        abstractC22049 = abstractC220411;
                        c3376 = c3379;
                        c10748 = c10746;
                        c24205 = c24202;
                        i7 = ((iM2769 ^ i6) * 757) ^ 1529062319;
                        abstractC220410 = abstractC22044;
                        i8 = iM2769 ^ (-464419532);
                        strM12927 = str3;
                        c107410 = c10748;
                    } else {
                        abstractC22049 = abstractC220411;
                        c3376 = c3379;
                        int iM31615 = C0773.m3169("۟᩸") ^ i6;
                        int i12 = ((iM31615 ^ i5) * 20471) ^ (-318774421);
                        i3 = iM31615 ^ 22506225;
                        strM12927 = str3;
                        c107410 = c10746;
                        c24205 = c24202;
                        i7 = i12;
                        abstractC22045 = abstractC22044;
                        i8 = i3;
                        abstractC220410 = abstractC22045;
                    }
                    break;
                case 471590917:
                case 1053082137:
                    C4238.m13540();
                    C2023.m6964();
                    iM2761 = (C0619.m2761("ܶ֫") ^ i6) * 39;
                    i = ((iM2761 ^ i5) * 8087) ^ 1022528499;
                    i2 = -105481907;
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case 876380235:
                case 1496065781:
                    if (C3099.f10023 <= 0) {
                        abstractC22044 = abstractC220410;
                        c24202 = c24205;
                        c10746 = c107410;
                        str3 = strM12927;
                        int iM31616 = C0773.m3169("۟᩸") ^ i6;
                        int i13 = ((iM31616 ^ i5) * 20471) ^ (-318774421);
                        i3 = iM31616 ^ 22506225;
                        strM12927 = str3;
                        c107410 = c10746;
                        c24205 = c24202;
                        i7 = i13;
                        abstractC22045 = abstractC22044;
                        i8 = i3;
                        abstractC220410 = abstractC22045;
                    } else {
                        iM2761 = (C0619.m2761("ۨۖ") ^ i6) * (-85);
                        i = ((iM2761 ^ i5) * (-23923)) ^ 1535437515;
                        i2 = -1771656276;
                        i8 = iM2761 ^ i2;
                        i7 = i;
                    }
                    break;
                case 886590755:
                case 2122066194:
                    abstractC22044 = abstractC220410;
                    c10745 = c107410;
                    str = strM12927;
                    c3374 = c3376;
                    C20472 c20472 = c12530.f40233;
                    if (C2485.m8357() > 0) {
                        c24203 = new C24202(c20472);
                        if (C4238.f15451 < 0) {
                            int iM31617 = C0773.m3169("۫᩷") ^ i5;
                            int i14 = ((iM31617 ^ i6) * 255) ^ 700012648;
                            i3 = iM31617 ^ 2144077783;
                            strM12927 = str;
                            c3376 = c3374;
                            c107410 = c10745;
                            c24205 = c24203;
                            i7 = i14;
                            c12530 = this;
                            abstractC22045 = abstractC22044;
                            i8 = i3;
                            abstractC220410 = abstractC22045;
                        } else {
                            strM12927 = str;
                            abstractC220410 = abstractC22044;
                            c107410 = c10745;
                            c24205 = c24203;
                            int iM31618 = C0773.m3169("ܰ᩹") ^ i5;
                            i8 = iM31618 ^ (-380272194);
                            i7 = ((iM31618 ^ i6) * 20245) ^ 9458287;
                            c3376 = null;
                        }
                    } else {
                        int iM31619 = (C0773.m3169("᩵ۤ") + i5) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        strM12927 = str;
                        c3376 = c3374;
                        c107410 = c10745;
                        c24205 = null;
                        abstractC22045 = abstractC22044;
                        i8 = iM31619 ^ (-670559714);
                        i7 = ((iM31619 ^ i6) * (-919)) ^ 813295225;
                        abstractC220410 = abstractC22045;
                    }
                    break;
                case 987731156:
                case 1399953965:
                    if (C3099.f10023 <= 0) {
                        abstractC22044 = abstractC220410;
                        c10745 = c107410;
                        str = strM12927;
                        c3374 = c3376;
                        int iM316110 = (C0773.m3169("᩵ۤ") + i5) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        strM12927 = str;
                        c3376 = c3374;
                        c107410 = c10745;
                        c24205 = null;
                        abstractC22045 = abstractC22044;
                        i8 = iM316110 ^ (-670559714);
                        i7 = ((iM316110 ^ i6) * (-919)) ^ 813295225;
                        abstractC220410 = abstractC22045;
                    } else {
                        iM2761 = (C0619.m2761("ܶ֫") ^ i6) * 39;
                        i = ((iM2761 ^ i5) * 8087) ^ 1022528499;
                        i2 = -105481907;
                        i8 = iM2761 ^ i2;
                        i7 = i;
                    }
                    break;
                case 1020894302:
                case 1259403332:
                    if (!c11378.mo28695()) {
                        abstractC22046 = abstractC220410;
                        c3375 = c3376;
                        C24202 c242013 = c24205;
                        c10747 = c107410;
                        str2 = strM12927;
                        c24204 = c242013;
                        int iM27610 = C0619.m2761("ۙۡ") ^ i6;
                        c3376 = c3375;
                        abstractC22047 = abstractC22046;
                        i8 = iM27610 ^ (-1302659968);
                        i7 = ((iM27610 ^ i5) * (-20371)) ^ (-695763827);
                        abstractC220410 = abstractC22047;
                        C24202 c242014 = c24204;
                        strM12927 = str2;
                        c107410 = c10747;
                        c24205 = c242014;
                    } else {
                        iM2761 = (C0619.m2761("ۡܺ") + i6) * 11;
                        i = ((iM2761 ^ i5) * 28611) ^ 469617845;
                        i2 = 1220137862;
                        i8 = iM2761 ^ i2;
                        i7 = i;
                    }
                    break;
                case 1054913106:
                case 1494795768:
                    c12530.f40232 = c12530.f40232.m49839(z);
                    iM2761 = C0773.m3169("ۡܿ") ^ i5;
                    i = ((iM2761 ^ i6) * 30485) ^ (-584631451);
                    i2 = -1341718545;
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                default:
                    c11378 = c12530.f40235;
                    c11378.mo28697(strM12926, c21578M49094, c21578M49096, zMo4292);
                    if (C11235.m28304(c11378)) {
                        iM2761 = (i5 - C0773.m3169("᩺᩻")) * (-27);
                        i = ((iM2761 ^ i6) * 10243) ^ (-833921863);
                        i2 = -1977473581;
                    } else {
                        iM2761 = (C0619.m2761("ܳܳ") ^ i6) * (-117);
                        i = ((iM2761 ^ i5) * (-24319)) ^ (-49571347);
                        i2 = 1827875917;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        this.f40234.m27405();
    }
}
