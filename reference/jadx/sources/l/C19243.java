package l;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import bin.mt.plus.Main;
import com.alipay.sdk.m.y.q;
import java.io.OutputStream;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ᩳᩳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: C2R7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19243 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫ܶܳ, reason: not valid java name and contains not printable characters */
    private static final short[] f62245 = {9019, -8883, -11443, -8468, -4961, 13085, -10122, 9246, 16239, 9102, -10012, -13504, -7747, 8, 29175, 26549, 18434};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC22044 f62246;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20472 f62247;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f62248;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC7793 f62249;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Bitmap f62250;

    /* JADX WARN: Code duplicated, block: B:25:0x00c4 A[PHI: r8 r14
      0x00c4: PHI (r8v4 android.content.DialogInterface$OnClickListener) = 
      (r8v3 android.content.DialogInterface$OnClickListener)
      (r8v2 android.content.DialogInterface$OnClickListener)
      (r8v2 android.content.DialogInterface$OnClickListener)
     binds: [B:24:0x00c2, B:18:0x0093, B:16:0x0090] A[DONT_GENERATE, DONT_INLINE]
      0x00c4: PHI (r14v5 java.lang.String) = (r14v4 java.lang.String), (r14v2 java.lang.String), (r14v2 java.lang.String) binds: [B:24:0x00c2, B:18:0x0093, B:16:0x0090] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x014b A[PHI: r4
      0x014b: PHI (r4v6 short[]) = (r4v2 short[]), (r4v3 short[]), (r4v2 short[]), (r4v2 short[]) binds: [B:84:0x014b, B:36:0x0149, B:28:0x0100, B:13:0x0087] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x0255 A[PHI: r2 r3 r6 r7 r13 r18 r19 r24
      0x0255: PHI (r2v30 l.᩷ۨᩴ) = (r2v2 l.᩷ۨᩴ), (r2v28 l.᩷ۨᩴ), (r2v2 l.᩷ۨᩴ), (r2v2 l.᩷ۨᩴ), (r2v2 l.᩷ۨᩴ) binds: [B:43:0x01a9, B:56:0x0253, B:32:0x0122, B:16:0x0090, B:13:0x0087] A[DONT_GENERATE, DONT_INLINE]
      0x0255: PHI (r3v7 short[]) = (r3v5 short[]), (r3v2 short[]), (r3v2 short[]), (r3v2 short[]), (r3v2 short[]) binds: [B:43:0x01a9, B:56:0x0253, B:32:0x0122, B:16:0x0090, B:13:0x0087] A[DONT_GENERATE, DONT_INLINE]
      0x0255: PHI (r6v5 java.lang.String) = 
      (r6v3 java.lang.String)
      (r6v2 java.lang.String)
      (r6v2 java.lang.String)
      (r6v2 java.lang.String)
      (r6v2 java.lang.String)
     binds: [B:43:0x01a9, B:56:0x0253, B:32:0x0122, B:16:0x0090, B:13:0x0087] A[DONT_GENERATE, DONT_INLINE]
      0x0255: PHI (r7v5 l.ۖۖۧ) = (r7v3 l.ۖۖۧ), (r7v2 l.ۖۖۧ), (r7v2 l.ۖۖۧ), (r7v2 l.ۖۖۧ), (r7v2 l.ۖۖۧ) binds: [B:43:0x01a9, B:56:0x0253, B:32:0x0122, B:16:0x0090, B:13:0x0087] A[DONT_GENERATE, DONT_INLINE]
      0x0255: PHI (r13v4 java.lang.String) = 
      (r13v2 java.lang.String)
      (r13v2 java.lang.String)
      (r13v3 java.lang.String)
      (r13v2 java.lang.String)
      (r13v2 java.lang.String)
     binds: [B:43:0x01a9, B:56:0x0253, B:32:0x0122, B:16:0x0090, B:13:0x0087] A[DONT_GENERATE, DONT_INLINE]
      0x0255: PHI (r18v4 java.lang.String) = 
      (r18v2 java.lang.String)
      (r18v3 java.lang.String)
      (r18v2 java.lang.String)
      (r18v2 java.lang.String)
      (r18v2 java.lang.String)
     binds: [B:43:0x01a9, B:56:0x0253, B:32:0x0122, B:16:0x0090, B:13:0x0087] A[DONT_GENERATE, DONT_INLINE]
      0x0255: PHI (r19v27 java.lang.Object[]) = 
      (r19v8 java.lang.Object[])
      (r19v23 java.lang.Object[])
      (r19v2 java.lang.Object[])
      (r19v2 java.lang.Object[])
      (r19v2 java.lang.Object[])
     binds: [B:43:0x01a9, B:56:0x0253, B:32:0x0122, B:16:0x0090, B:13:0x0087] A[DONT_GENERATE, DONT_INLINE]
      0x0255: PHI (r24v16 l.۟ۢ֫) = (r24v7 l.۟ۢ֫), (r24v3 l.۟ۢ֫), (r24v3 l.۟ۢ֫), (r24v3 l.۟ۢ֫), (r24v3 l.۟ۢ֫) binds: [B:43:0x01a9, B:56:0x0253, B:32:0x0122, B:16:0x0090, B:13:0x0087] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        int iM2761;
        int i;
        int i2;
        int iM2762;
        int i3;
        int i4;
        int i5;
        int iM2763;
        final C19243 c19243 = this;
        int i6 = C1146.f4234;
        int i7 = C1080.f3865;
        int iM2764 = (C0619.m2761("ۨۗ") ^ i6) * 115;
        int i8 = ((iM2764 ^ i7) * (-4367)) ^ 967026913;
        Object[] objArr = null;
        ViewOnClickListenerC7793 viewOnClickListenerC7793 = null;
        DialogInterface.OnClickListener onClickListener = null;
        String strM4222 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i9 = iM2764 ^ 1306252601;
        int iM2765 = 0;
        int i10 = 0;
        int iM2766 = 0;
        int i11 = 0;
        int i12 = 0;
        short s = 0;
        int i13 = 1087342512;
        String strM11806 = null;
        C2361 c2361 = null;
        String strM4861 = null;
        final AbstractC22044 abstractC22044 = null;
        int i14 = 0;
        String strM8354 = null;
        while (true) {
            i13 = i9 ^ (i8 & (((i13 ^ i7) * 31109) >> 31));
            switch (i13) {
                case -2067030143:
                case -1568354716:
                    objArr = objArr;
                    abstractC22044 = abstractC22044;
                    if (((s * 2) + 1) - (i12 * i12) <= 0) {
                        iM2762 = C0619.m2761("᩹ۘ") ^ i6;
                        i8 = ((iM2762 ^ i7) * 5777) ^ 1327859329;
                        i3 = -676271533;
                    } else {
                        iM2762 = C0619.m2761("ۡۡ") ^ i7;
                        i8 = ((iM2762 ^ i6) * 7619) ^ (-876236177);
                        i3 = -1406014750;
                    }
                    i9 = iM2762 ^ i3;
                    c19243 = this;
                    abstractC22044 = abstractC22044;
                    objArr = objArr;
                    break;
                case -1999952485:
                case 2002214954:
                    i11 = 23021;
                    iM2762 = (C0773.m3169("ܽܰ") ^ i6) * (-19);
                    i8 = ((iM2762 ^ i7) * 7743) ^ 342663518;
                    i3 = 503293650;
                    i9 = iM2762 ^ i3;
                    c19243 = this;
                    abstractC22044 = abstractC22044;
                    objArr = objArr;
                    break;
                case -1989057824:
                case 1138742455:
                    objArr = objArr;
                    abstractC22044 = abstractC22044;
                    objArr[0] = strM11806;
                    ViewOnClickListenerC7793 viewOnClickListenerC7794 = c19243.f62249;
                    if (C2287.f7432 >= 0) {
                        viewOnClickListenerC7793 = viewOnClickListenerC7794;
                        iM2762 = C0773.m3169("۬᩵") ^ i7;
                        i8 = ((iM2762 ^ i6) * (-27133)) ^ 1534581874;
                        i3 = -99604961;
                        i9 = iM2762 ^ i3;
                        c19243 = this;
                    } else {
                        int iM3169 = C0773.m3169("ۛܶ") ^ i7;
                        i8 = ((iM3169 ^ i6) * 23995) ^ 883900599;
                        viewOnClickListenerC7793 = viewOnClickListenerC7794;
                        i9 = iM3169 ^ 1352432031;
                    }
                    abstractC22044 = abstractC22044;
                    objArr = objArr;
                    break;
                case -1946487604:
                case 1867939152:
                    objArr = objArr;
                    iM2765 = C0619.m2761(RunnableC1848.m6366(f62245, 1, 3, i11));
                    i10 = 2125779318;
                    if (C4238.f15451 >= 0) {
                        iM2763 = C0619.m2761("ۗۢ") ^ i6;
                        i5 = ((iM2763 ^ i7) * (-13847)) ^ 1363811078;
                        i4 = -191121283;
                    } else {
                        iM2763 = C0773.m3169("ۘܺ") ^ i7;
                        i5 = ((iM2763 ^ i6) * 17335) ^ (-1031556168);
                        i4 = -281082745;
                    }
                    i9 = iM2763 ^ i4;
                    i8 = i5;
                    abstractC22044 = abstractC22044;
                    objArr = objArr;
                    break;
                case -1818744214:
                case -401008535:
                    onClickListener = new DialogInterface.OnClickListener(c19243) { // from class: l.۟ᩳ֫

                        /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ C19243 f26682;

                        {
                            int i15 = -1192262243;
                            int i16 = C2288.f7433;
                            int i17 = C1080.f3865;
                            int iM31610 = (i17 - C0773.m3169("᩷᩵")) * 37;
                            int i18 = ((iM31610 ^ i16) * (-19373)) ^ (-1141959359);
                            int i19 = -1756461891;
                            while (true) {
                                i15 = ((((i15 ^ i16) * (-32077)) >> 31) & i18) ^ (iM31610 ^ i19);
                                switch (i15) {
                                    case -2138759757:
                                    case 572435919:
                                        this.f26682 = c19243;
                                        if (C1826.f6190 <= 0) {
                                            iM31610 = C0619.m2761("֡۫") ^ i16;
                                            i18 = ((iM31610 ^ i17) * 279) ^ (-1836520989);
                                            i19 = -444082028;
                                        } else {
                                            iM31610 = C0773.m3169("᩸֫") ^ i16;
                                            i18 = ((iM31610 ^ i17) * (-28255)) ^ 1225691094;
                                            i19 = -1448405971;
                                        }
                                        break;
                                    case -2016064861:
                                    case -841012151:
                                        C13473.m33144();
                                        throw new RuntimeException();
                                    case -1870951356:
                                    case -1384768109:
                                        if (C1321.f4751 >= 0) {
                                            iM31610 = (C0619.m2761("۬ۤ") + i17) * (-71);
                                            i18 = ((iM31610 ^ i16) * 27623) ^ (-1891249253);
                                            i19 = -1719153242;
                                        } else {
                                            iM31610 = (C0773.m3169("᩻ۨ") + i16) * (-81);
                                            i18 = ((iM31610 ^ i17) * 20009) ^ 1798891842;
                                            i19 = 1511995843;
                                        }
                                        break;
                                    case -1639732423:
                                    case -1192974731:
                                        if (C2702.f8586 <= 0) {
                                            iM31610 = C0619.m2761("֡۫") ^ i16;
                                            i18 = ((iM31610 ^ i17) * 279) ^ (-1836520989);
                                            i19 = -444082028;
                                        } else {
                                            iM31610 = C0619.m2761("᩸ۡ") ^ i17;
                                            i18 = ((iM31610 ^ i16) * (-13985)) ^ (-1853012993);
                                            i19 = 1839273995;
                                        }
                                        break;
                                    case -1568260968:
                                    case -823330033:
                                        if (C3448.f11240 >= 0) {
                                            iM31610 = C0619.m2761("ܰۢ") ^ i16;
                                            i18 = ((iM31610 ^ i17) * 7735) ^ (-1551340136);
                                            i19 = 1241712527;
                                        } else {
                                            iM31610 = (i17 - C0773.m3169("᩺᩸")) * 39;
                                            i18 = ((iM31610 ^ i16) * 7223) ^ 1374743949;
                                            i19 = 329650444;
                                        }
                                        break;
                                    case -1502285994:
                                    case -1075333946:
                                        C3492.m11488();
                                        if (C1542.f5343 > 0) {
                                            iM31610 = (C0773.m3169("ۘܰ") + i16) * (-107);
                                            i18 = ((iM31610 ^ i17) * 28357) ^ (-1360987136);
                                            i19 = 664355239;
                                        } else {
                                            iM31610 = (C0773.m3169("ۤᩴ") ^ i17) * 53;
                                            i18 = ((iM31610 ^ i16) * (-15003)) ^ (-1312822256);
                                            i19 = -1622183829;
                                        }
                                        break;
                                    case -1403014838:
                                    case 2142256106:
                                        if (RunnableC1848.f6235) {
                                            iM31610 = C0619.m2761("ܰۢ") ^ i16;
                                            i18 = ((iM31610 ^ i17) * 7735) ^ (-1551340136);
                                            i19 = 1241712527;
                                        } else {
                                            iM31610 = C0773.m3169("ܿۧ") ^ i16;
                                            i18 = ((iM31610 ^ i17) * 20399) ^ 1518419326;
                                            i19 = 406161281;
                                        }
                                        break;
                                    case -1374445089:
                                    case 2113723491:
                                        if (C20932.f66974 <= 0) {
                                            iM31610 = C0619.m2761("֡۫") ^ i16;
                                            i18 = ((iM31610 ^ i17) * 279) ^ (-1836520989);
                                            i19 = -444082028;
                                        } else {
                                            iM31610 = (C0619.m2761("ۤ֨") ^ i16) * 25;
                                            i18 = ((iM31610 ^ i17) * (-24611)) ^ (-1580124668);
                                            i19 = 761774503;
                                        }
                                        break;
                                    case -1228638838:
                                    case -47794735:
                                        if (C3492.m11488()) {
                                            iM31610 = (i16 - C0773.m3169("ܰۡ")) * (-99);
                                            i18 = ((iM31610 ^ i17) * 2537) ^ (-1460659558);
                                            i19 = 984472755;
                                        } else {
                                            iM31610 = (C0619.m2761("۬ۤ") + i17) * (-71);
                                            i18 = ((iM31610 ^ i16) * 27623) ^ (-1891249253);
                                            i19 = -1719153242;
                                        }
                                        break;
                                    case -1216520234:
                                    case 1444633287:
                                        if (C0950.f3488 >= 0) {
                                            iM31610 = (C0619.m2761("۬ۤ") + i17) * (-71);
                                            i18 = ((iM31610 ^ i16) * 27623) ^ (-1891249253);
                                            i19 = -1719153242;
                                        } else {
                                            iM31610 = C0773.m3169("ܽ۟") ^ i17;
                                            i18 = ((iM31610 ^ i16) * (-26897)) ^ 1308388622;
                                            i19 = 361384613;
                                        }
                                        break;
                                    case -1059807234:
                                    case 1812487627:
                                        if (C3734.m12152() < 0) {
                                            iM31610 = (C0773.m3169("ۤᩴ") ^ i17) * 53;
                                            i18 = ((iM31610 ^ i16) * (-15003)) ^ (-1312822256);
                                            i19 = -1622183829;
                                        } else {
                                            iM31610 = C0619.m2761("֡۫") ^ i16;
                                            i18 = ((iM31610 ^ i17) * 279) ^ (-1836520989);
                                            i19 = -444082028;
                                        }
                                        break;
                                    case -872806077:
                                    case 15983571:
                                        if (C2966.m9664()) {
                                            iM31610 = (C0619.m2761("ۤ᩹") ^ i17) * 9;
                                            i18 = ((iM31610 ^ i16) * (-7291)) ^ (-1767279281);
                                            i19 = 468566902;
                                        } else {
                                            iM31610 = (C0773.m3169("ۘܰ") + i16) * (-107);
                                            i18 = ((iM31610 ^ i17) * 28357) ^ (-1360987136);
                                            i19 = 664355239;
                                        }
                                        break;
                                    case -217063117:
                                    case 2145297882:
                                        C0619.m2763();
                                        iM31610 = C0619.m2761("֡۫") ^ i16;
                                        i18 = ((iM31610 ^ i17) * 279) ^ (-1836520989);
                                        i19 = -444082028;
                                        break;
                                    case -173409127:
                                    case 2053588820:
                                        return;
                                    case 676447584:
                                    case 2021472121:
                                        if (C2354.f7599 < 0) {
                                            iM31610 = (C0619.m2761("۬ۤ") + i17) * (-71);
                                            i18 = ((iM31610 ^ i16) * 27623) ^ (-1891249253);
                                            i19 = -1719153242;
                                        } else {
                                            iM31610 = (C0773.m3169("ۘܰ") + i16) * (-107);
                                            i18 = ((iM31610 ^ i17) * 28357) ^ (-1360987136);
                                            i19 = 664355239;
                                        }
                                        break;
                                    default:
                                        if (C3492.f12043 <= 0) {
                                            iM31610 = C0619.m2761("ܰۢ") ^ i16;
                                            i18 = ((iM31610 ^ i17) * 7735) ^ (-1551340136);
                                            i19 = 1241712527;
                                        } else {
                                            iM31610 = (C0619.m2761("ۚܶ") ^ i17) * 21;
                                            i18 = ((iM31610 ^ i16) * (-5437)) ^ 1910475767;
                                            i19 = 1366965083;
                                        }
                                        break;
                                }
                            }
                        }

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i15) {
                            ViewOnClickListenerC7793 viewOnClickListenerC7795 = null;
                            int i16 = -576360632;
                            int i17 = C2288.f7433;
                            int i18 = C1542.f5343;
                            int iM2767 = (C0619.m2761("ܰ۫") + i18) * 71;
                            int i19 = ((iM2767 ^ i17) * (-6445)) ^ (-1570676038);
                            int i20 = -1123698377;
                            while (true) {
                                i16 = ((((i16 ^ i17) * 32079) >> 31) & i19) ^ (iM2767 ^ i20);
                                switch (i16) {
                                    case -2034177480:
                                    case -413550042:
                                        if (C3492.m11488()) {
                                            iM2767 = (C0773.m3169("ۘ֫") + i18) * (-77);
                                            i19 = ((iM2767 ^ i17) * 14695) ^ (-465340331);
                                            i20 = -1285998277;
                                        } else {
                                            iM2767 = (C0773.m3169("ܰ۟") ^ i17) * 57;
                                            i19 = ((iM2767 ^ i18) * 25323) ^ 1945804867;
                                            i20 = -221219371;
                                        }
                                        break;
                                    case -1270342789:
                                    case 638069765:
                                        if (C2878.m9491() > 0) {
                                            iM2767 = C0619.m2761("ᩳܽ") ^ i18;
                                            i19 = ((iM2767 ^ i17) * 19471) ^ 1323505901;
                                            i20 = 1794981268;
                                        } else {
                                            iM2767 = (i17 - C0773.m3169("ܳܽ")) * 23;
                                            i19 = ((iM2767 ^ i18) * 21373) ^ (-988775311);
                                            i20 = -49816318;
                                        }
                                        break;
                                    case -1171111456:
                                    case 1059444986:
                                        if (C2878.f9462) {
                                            iM2767 = (i17 - C0773.m3169("ܳܽ")) * 23;
                                            i19 = ((iM2767 ^ i18) * 21373) ^ (-988775311);
                                            i20 = -49816318;
                                        } else {
                                            iM2767 = (i17 - C0619.m2761("᩸ۙ")) * (-61);
                                            i19 = ((iM2767 ^ i18) * 28267) ^ (-1857843286);
                                            i20 = 1670638084;
                                        }
                                        break;
                                    case -1066961134:
                                    case -257806608:
                                        if (RunnableC0334.f1808 <= 0) {
                                            iM2767 = C0619.m2761("ᩳܽ") ^ i18;
                                            i19 = ((iM2767 ^ i17) * 19471) ^ 1323505901;
                                            i20 = 1794981268;
                                        } else {
                                            iM2767 = C0773.m3169("ۛ۟") ^ i18;
                                            i19 = ((iM2767 ^ i17) * (-32389)) ^ 2104968769;
                                            i20 = -1377894772;
                                        }
                                        break;
                                    case -1062260882:
                                    case 1612118505:
                                        if (C1542.f5343 <= 0) {
                                            iM2767 = C0773.m3169("֨ۤ") ^ i17;
                                            i19 = ((iM2767 ^ i18) * 21353) ^ (-920094485);
                                            i20 = -702903782;
                                        } else {
                                            iM2767 = C0619.m2761("ۡ֡") ^ i17;
                                            i19 = ((iM2767 ^ i18) * (-18425)) ^ (-1310081628);
                                            i20 = 1490706342;
                                        }
                                        break;
                                    case -821571438:
                                    case -457185852:
                                        if (C3099.f10023 <= 0) {
                                            iM2767 = (i17 - C0773.m3169("ܳܽ")) * 23;
                                            i19 = ((iM2767 ^ i18) * 21373) ^ (-988775311);
                                            i20 = -49816318;
                                        } else {
                                            iM2767 = C0619.m2761("᩸۫") ^ i17;
                                            i19 = ((iM2767 ^ i18) * 15373) ^ (-1436312312);
                                            i20 = 847605229;
                                        }
                                        break;
                                    case -691453742:
                                    case 445701499:
                                        if (C2023.f6737) {
                                            iM2767 = C0773.m3169("֨ۤ") ^ i17;
                                            i19 = ((iM2767 ^ i18) * 21353) ^ (-920094485);
                                            i20 = -702903782;
                                        } else {
                                            iM2767 = (C0773.m3169("ܳᩳ") + i17) * q.h;
                                            i19 = ((iM2767 ^ i18) * (-21569)) ^ 861376001;
                                            i20 = -1197122967;
                                        }
                                        break;
                                    case -677555090:
                                    case 381489719:
                                        if (C1519.f5300 < 0) {
                                            iM2767 = C0773.m3169("֫ۢ") ^ i18;
                                            i19 = ((iM2767 ^ i17) * 5411) ^ 263580626;
                                            i20 = 1262658571;
                                        } else {
                                            iM2767 = C0619.m2761("ᩳܽ") ^ i18;
                                            i19 = ((iM2767 ^ i17) * 19471) ^ 1323505901;
                                            i20 = 1794981268;
                                        }
                                        break;
                                    case -212922498:
                                    case 690088463:
                                        String strM11807 = RunnableC3646.m11806(abstractC22044);
                                        int i21 = ViewOnClickListenerC7793.f25871;
                                        Main.m93(viewOnClickListenerC7795, strM11807);
                                        break;
                                    case 35902128:
                                    case 271198480:
                                        C3077.m10041();
                                        if (AbstractC3624.m11755() == 0) {
                                            iM2767 = C0773.m3169("֨ۤ") ^ i17;
                                            i19 = ((iM2767 ^ i18) * 21353) ^ (-920094485);
                                            i20 = -702903782;
                                        } else {
                                            iM2767 = C0619.m2761("ᩳܽ") ^ i18;
                                            i19 = ((iM2767 ^ i17) * 19471) ^ 1323505901;
                                            i20 = 1794981268;
                                        }
                                        break;
                                    case 225968435:
                                    case 676006103:
                                        C2966.m9664();
                                        C1564.m5509();
                                        break;
                                    case 597673618:
                                    case 1681601322:
                                        C3492.m11488();
                                        iM2767 = (i17 - C0773.m3169("ܳܽ")) * 23;
                                        i19 = ((iM2767 ^ i18) * 21373) ^ (-988775311);
                                        i20 = -49816318;
                                        break;
                                    case 982032923:
                                    case 1316288840:
                                        if (C3690.m11987()) {
                                            iM2767 = C0773.m3169("֫ۢ") ^ i18;
                                            i19 = ((iM2767 ^ i17) * 5411) ^ 263580626;
                                            i20 = 1262658571;
                                        } else {
                                            iM2767 = (C0773.m3169("ۚܳ") + i18) * (-59);
                                            i19 = ((iM2767 ^ i17) * (-5)) ^ (-1326793093);
                                            i20 = -1539938763;
                                        }
                                        break;
                                    case 1356100035:
                                    case 1606174929:
                                        viewOnClickListenerC7795 = this.f26682.f62249;
                                        if (C1519.m5403()) {
                                            iM2767 = C0619.m2761("ᩳ۬") ^ i18;
                                            i19 = ((iM2767 ^ i17) * 1677) ^ 896721145;
                                            i20 = -1171393141;
                                        } else {
                                            iM2767 = (C0773.m3169("ܰ۟") ^ i17) * 57;
                                            i19 = ((iM2767 ^ i18) * 25323) ^ 1945804867;
                                            i20 = -221219371;
                                        }
                                        break;
                                    case 1578014582:
                                    case 2096323155:
                                        if (C2834.f9334 <= 0) {
                                            iM2767 = C0773.m3169("֫ۢ") ^ i18;
                                            i19 = ((iM2767 ^ i17) * 5411) ^ 263580626;
                                            i20 = 1262658571;
                                        } else {
                                            iM2767 = C0619.m2761("ۙܶ") ^ i17;
                                            i19 = ((iM2767 ^ i18) * 733) ^ 285948123;
                                            i20 = -1560423602;
                                        }
                                        break;
                                    default:
                                        if (C1783.m6232()) {
                                            iM2767 = (C0619.m2761("ۙۤ") ^ i18) * 99;
                                            i19 = ((iM2767 ^ i17) * (-15011)) ^ 1590296033;
                                            i20 = -1237044377;
                                        } else {
                                            iM2767 = (C0773.m3169("ܰ۟") ^ i17) * 57;
                                            i19 = ((iM2767 ^ i18) * 25323) ^ 1945804867;
                                            i20 = -221219371;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    };
                    strM4222 = C1146.m4222(f62245, 10, 3, i11);
                    if (C3077.m10041()) {
                        iM2761 = C0773.m3169("᩺۠") ^ i6;
                        i = ((iM2761 ^ i7) * 13799) ^ 864539443;
                        i2 = 86755887;
                    } else {
                        iM2761 = (C0619.m2761("ۙۚ") ^ i7) * 49;
                        i = ((iM2761 ^ i6) * (-15889)) ^ 1907824507;
                        i2 = -688123307;
                    }
                    i9 = iM2761 ^ i2;
                    i8 = i;
                    break;
                case -1608048640:
                case 189662542:
                    objArr = objArr;
                    abstractC22044 = abstractC22044;
                    s = f62245[0];
                    i12 = s + 1;
                    if (C3734.f12817 >= 0) {
                        iM2762 = C0773.m3169("۬᩵") ^ i7;
                        i8 = ((iM2762 ^ i6) * (-27133)) ^ 1534581874;
                        i3 = -99604961;
                    } else {
                        iM2762 = C0619.m2761("᩸֡") ^ i7;
                        i8 = ((iM2762 ^ i6) * 23517) ^ 1529639602;
                        i3 = 2044830373;
                    }
                    i9 = iM2762 ^ i3;
                    c19243 = this;
                    abstractC22044 = abstractC22044;
                    objArr = objArr;
                    break;
                case -1562434572:
                case 2041999135:
                    C3779.m12264();
                    C3099.m10095();
                    iM2761 = C0773.m3169("᩺۠") ^ i6;
                    i = ((iM2761 ^ i7) * 13799) ^ 864539443;
                    i2 = 86755887;
                    i9 = iM2761 ^ i2;
                    i8 = i;
                    break;
                case -1252937845:
                case -70813396:
                    C1542.m5459();
                    C2023.m6964();
                    break;
                case -1132475269:
                case 1155677332:
                    C1826.m6301();
                    if (C3690.m11987()) {
                        iM2761 = C0619.m2761("۠ۚ") ^ i7;
                        i = ((iM2761 ^ i6) * 29067) ^ (-317135525);
                        i2 = -1563368947;
                    } else {
                        iM2761 = (C0619.m2761("᩹۬") + i6) * (-25);
                        i = ((iM2761 ^ i7) * (-8917)) ^ (-32576117);
                        i2 = -1102062466;
                    }
                    i9 = iM2761 ^ i2;
                    i8 = i;
                    break;
                case -979229463:
                case 1045192733:
                    C3492.m11487(c2361, C0773.m3169(strM4861) ^ 2100268941, null);
                    if (C4282.f15546 <= 0) {
                        iM2761 = (C0619.m2761("᩹۬") + i6) * (-25);
                        i = ((iM2761 ^ i7) * (-8917)) ^ (-32576117);
                        i2 = -1102062466;
                    } else {
                        iM2761 = (i7 - C0773.m3169("֡ܿ")) * (-117);
                        i = ((iM2761 ^ i6) * 18609) ^ 1325208591;
                        i2 = 1385451431;
                    }
                    i9 = iM2761 ^ i2;
                    i8 = i;
                    break;
                case -554794022:
                case -83321617:
                    abstractC22044 = c19243.f62246;
                    strM11806 = RunnableC3646.m11806(abstractC22044);
                    Object[] objArr2 = new Object[1];
                    if (C4282.f15546 <= 0) {
                        objArr = objArr2;
                        iM2761 = C0619.m2761("۠ۚ") ^ i7;
                        i = ((iM2761 ^ i6) * 29067) ^ (-317135525);
                        i2 = -1563368947;
                        i9 = iM2761 ^ i2;
                        i8 = i;
                    } else {
                        int iM31610 = C0773.m3169("ۛۖ") ^ i6;
                        i9 = iM31610 ^ 956884921;
                        objArr = objArr2;
                        i8 = ((iM31610 ^ i7) * 4239) ^ 514652552;
                        c19243 = this;
                    }
                    break;
                case -409016682:
                case 1094171342:
                    strM4861 = C1321.m4861(sArr2, 7, 3, i11);
                    if (C1519.f5300 >= 0) {
                        iM2761 = C0619.m2761("۠ۚ") ^ i7;
                        i = ((iM2761 ^ i6) * 29067) ^ (-317135525);
                        i2 = -1563368947;
                    } else {
                        iM2761 = (C0773.m3169("۠ۡ") ^ i6) * 65;
                        i = ((iM2761 ^ i7) * (-635)) ^ (-298484317);
                        i2 = -258579746;
                    }
                    i9 = iM2761 ^ i2;
                    i8 = i;
                    break;
                case 215074434:
                case 677196076:
                    C2375.m8063(c2361, C0619.m2761(strM4222) ^ 2123057470, onClickListener);
                    C1321.m4860(c2361);
                    break;
                case 516355213:
                case 878283021:
                    objArr = objArr;
                    ViewOnClickListenerC7793 viewOnClickListenerC7795 = viewOnClickListenerC7793;
                    strM8354 = C2485.m8354(viewOnClickListenerC7795, iM2765 ^ i10, objArr);
                    int i15 = DialogInterfaceC8327.f27315;
                    c2361 = new C2361(viewOnClickListenerC7795);
                    short[] sArr3 = f62245;
                    if (C0487.m2356() < 0) {
                        int iM31611 = C0773.m3169("ܶܿ") ^ i6;
                        i8 = ((iM31611 ^ i7) * (-18253)) ^ 1935677650;
                        viewOnClickListenerC7793 = viewOnClickListenerC7795;
                        sArr = sArr3;
                        i9 = iM31611 ^ (-709396541);
                        objArr = objArr;
                    } else {
                        viewOnClickListenerC7793 = viewOnClickListenerC7795;
                        objArr = objArr;
                        sArr = sArr3;
                        iM2761 = C0619.m2761("۠ۚ") ^ i7;
                        i = ((iM2761 ^ i6) * 29067) ^ (-317135525);
                        i2 = -1563368947;
                        i9 = iM2761 ^ i2;
                        i8 = i;
                    }
                    break;
                case 561414654:
                case 2045162021:
                    if (!C0619.f2439) {
                        objArr = objArr;
                        iM2763 = C0619.m2761("ۗۢ") ^ i6;
                        i5 = ((iM2763 ^ i7) * (-13847)) ^ 1363811078;
                        i4 = -191121283;
                        i9 = iM2763 ^ i4;
                        i8 = i5;
                        abstractC22044 = abstractC22044;
                        objArr = objArr;
                    } else {
                        iM2761 = (C0619.m2761("᩹۬") + i6) * (-25);
                        i = ((iM2761 ^ i7) * (-8917)) ^ (-32576117);
                        i2 = -1102062466;
                        i9 = iM2761 ^ i2;
                        i8 = i;
                    }
                    break;
                case 584005419:
                case 811758009:
                    C13473.m33136(c2361, iM2766 ^ i14);
                    C1519.m5410(c2361, strM8354);
                    sArr2 = f62245;
                    if (C2834.f9334 <= 0) {
                        iM2761 = (C0619.m2761("᩹۬") + i6) * (-25);
                        i = ((iM2761 ^ i7) * (-8917)) ^ (-32576117);
                        i2 = -1102062466;
                    } else {
                        iM2761 = C0773.m3169("ۚۚ") ^ i6;
                        i = ((iM2761 ^ i7) * 24703) ^ (-1300194034);
                        i2 = 1474782164;
                    }
                    i9 = iM2761 ^ i2;
                    i8 = i;
                    break;
                case 584870543:
                case 2107300877:
                    RunnableC0334.m2063();
                    if (RunnableC0334.f1808 <= 0) {
                        iM2761 = C0773.m3169("᩺۠") ^ i6;
                        i = ((iM2761 ^ i7) * 13799) ^ 864539443;
                        i2 = 86755887;
                    } else {
                        iM2761 = C0619.m2761("۠ۚ") ^ i7;
                        i = ((iM2761 ^ i6) * 29067) ^ (-317135525);
                        i2 = -1563368947;
                    }
                    i9 = iM2761 ^ i2;
                    i8 = i;
                    break;
                case 1065815242:
                case 1741328174:
                    i11 = 45084;
                    iM2762 = (C0773.m3169("ܽܰ") ^ i6) * (-19);
                    i8 = ((iM2762 ^ i7) * 7743) ^ 342663518;
                    i3 = 503293650;
                    i9 = iM2762 ^ i3;
                    c19243 = this;
                    abstractC22044 = abstractC22044;
                    objArr = objArr;
                    break;
                default:
                    iM2766 = C0619.m2761(C0619.m2756(sArr, 4, 3, i11));
                    i14 = 2121894284;
                    if (C3448.f11240 < 0) {
                        iM2761 = C0619.m2761("۬ۘ") ^ i7;
                        i = ((iM2761 ^ i6) * (-14623)) ^ (-499709868);
                        i2 = -106316625;
                        i9 = iM2761 ^ i2;
                        i8 = i;
                    } else {
                        objArr = objArr;
                        abstractC22044 = abstractC22044;
                        iM2762 = C0773.m3169("۬᩵") ^ i7;
                        i8 = ((iM2762 ^ i6) * (-27133)) ^ 1534581874;
                        i3 = -99604961;
                        i9 = iM2762 ^ i3;
                        c19243 = this;
                        abstractC22044 = abstractC22044;
                        objArr = objArr;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        ViewOnClickListenerC7793 viewOnClickListenerC7793 = null;
        Object obj = null;
        int i = -1005505573;
        int i2 = AbstractC0641.f2496;
        int i3 = AbstractC0116.f1064;
        int iM2761 = (i2 - C0619.m2761("ܶ֨")) * 23;
        int i4 = ((iM2761 ^ i3) * (-26641)) ^ 1338403840;
        int i5 = 2143002230;
        while (true) {
            i = ((((i ^ i3) * (-29359)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2094069333:
                case -244164034:
                    if (C17202.m40372()) {
                        iM2761 = C0619.m2761("ۙ۠") ^ i3;
                        i4 = ((iM2761 ^ i2) * 13443) ^ (-704828898);
                        i5 = -329525747;
                    } else {
                        iM2761 = C0619.m2761("᩻۠") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-3567)) ^ 462552631;
                        i5 = -1957352033;
                    }
                    break;
                case -1687117352:
                case -298974375:
                    if (AbstractC0641.m2813() <= 0) {
                        iM2761 = C0619.m2761("ᩳۗ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 3423) ^ (-181660194);
                        i5 = 1347761588;
                    } else {
                        iM2761 = (C0619.m2761("ۖۡ") + i2) * 11;
                        i4 = ((iM2761 ^ i3) * (-8781)) ^ (-172993428);
                        i5 = 105153057;
                    }
                    break;
                case -1658872312:
                case -1026248748:
                    if (AbstractC3624.m11755() != 0) {
                        iM2761 = C0619.m2761("ᩳۗ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 3423) ^ (-181660194);
                        i5 = 1347761588;
                    } else {
                        iM2761 = (i2 - C0773.m3169("᩶֨")) * 71;
                        i4 = ((iM2761 ^ i3) * (-9607)) ^ (-336198819);
                        i5 = 455550424;
                    }
                    break;
                case -1658157354:
                case 414189627:
                    AbstractC0641.m2814(viewOnClickListenerC7793, exc, obj);
                    C3734.m12147(this.f62246);
                    break;
                case -1283977602:
                case -1201018695:
                    obj = null;
                    if (C2485.f7950 != 0) {
                        iM2761 = C0619.m2761("᩻۠") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-3567)) ^ 462552631;
                        i5 = -1957352033;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ۡ᩵")) * (-89);
                        i4 = ((iM2761 ^ i2) * (-25533)) ^ 342877235;
                        i5 = 212310510;
                    }
                    break;
                case -1016689899:
                case 2139798010:
                    if (C1564.m5509() <= 0) {
                        iM2761 = (C0619.m2761("۟ۙ") ^ i3) * (-7);
                        i4 = ((iM2761 ^ i2) * (-15933)) ^ 1266312104;
                        i5 = 762853680;
                    } else {
                        iM2761 = (i2 - C0619.m2761("ۧ۠")) * (-27);
                        i4 = ((iM2761 ^ i3) * (-10161)) ^ 1907813357;
                        i5 = 1119872811;
                    }
                    break;
                case -962221358:
                case -228877849:
                    if (C23916.f77426 <= 0) {
                        iM2761 = C0773.m3169("ܺ۬") ^ i3;
                        i4 = ((iM2761 ^ i2) * 5087) ^ 1567360244;
                        i5 = 860414401;
                    } else {
                        iM2761 = (i2 - C0773.m3169("ۚ᩶")) * 35;
                        i4 = ((iM2761 ^ i3) * (-17563)) ^ (-445472999);
                        i5 = 947147543;
                    }
                    break;
                case -833304058:
                case -578706718:
                    C2288.m7767();
                    iM2761 = (C0773.m3169("ۨۢ") + i2) * (-105);
                    i4 = ((iM2761 ^ i3) * 19261) ^ 1210706109;
                    i5 = 1905403424;
                    break;
                case -679174030:
                case 111181622:
                    if (C2834.f9334 <= 0) {
                        iM2761 = C0619.m2761("ᩳۗ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 3423) ^ (-181660194);
                        i5 = 1347761588;
                    } else {
                        iM2761 = (C0773.m3169("ᩳ᩶") ^ i3) * 39;
                        i4 = ((iM2761 ^ i2) * 17185) ^ 849675447;
                        i5 = 1649592621;
                    }
                    break;
                case -628909438:
                case 120073322:
                    C0269.m1775();
                    if (C3492.f12043 <= 0) {
                        iM2761 = C0773.m3169("ܺ۬") ^ i3;
                        i4 = ((iM2761 ^ i2) * 5087) ^ 1567360244;
                        i5 = 860414401;
                    } else {
                        iM2761 = (C0619.m2761("۟ۙ") ^ i3) * (-7);
                        i4 = ((iM2761 ^ i2) * (-15933)) ^ 1266312104;
                        i5 = 762853680;
                    }
                    break;
                case -398069610:
                case 1326905395:
                    if (C3779.m12264()) {
                        iM2761 = C0773.m3169("֫۟") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-1805)) ^ 410225627;
                        i5 = -1027874310;
                    } else {
                        iM2761 = C0619.m2761("ᩳۗ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 3423) ^ (-181660194);
                        i5 = 1347761588;
                    }
                    break;
                case 349419455:
                case 928447119:
                    C2375.m8065();
                    if (C1343.f4799 != 0) {
                        iM2761 = (C0619.m2761("۟ۙ") ^ i3) * (-7);
                        i4 = ((iM2761 ^ i2) * (-15933)) ^ 1266312104;
                        i5 = 762853680;
                    } else {
                        iM2761 = (C0773.m3169("ۨۢ") + i2) * (-105);
                        i4 = ((iM2761 ^ i3) * 19261) ^ 1210706109;
                        i5 = 1905403424;
                    }
                    break;
                case 422550902:
                case 1599713524:
                    if (C3448.m11248() != 0) {
                        iM2761 = C0619.m2761("᩻۠") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-3567)) ^ 462552631;
                        i5 = -1957352033;
                    } else {
                        iM2761 = (C0619.m2761("֫ۜ") ^ i3) * (-109);
                        i4 = ((iM2761 ^ i2) * 22161) ^ (-279427057);
                        i5 = 1242884061;
                    }
                    break;
                case 966146288:
                case 1963792906:
                    viewOnClickListenerC7793 = this.f62249;
                    if (C11235.f35427 >= 0) {
                        iM2761 = C0773.m3169("ܺ۬") ^ i3;
                        i4 = ((iM2761 ^ i2) * 5087) ^ 1567360244;
                        i5 = 860414401;
                    } else {
                        iM2761 = (C0773.m3169("۠ܺ") ^ i2) * 27;
                        i4 = ((iM2761 ^ i3) * 26973) ^ (-1320764237);
                        i5 = 471280641;
                    }
                    break;
                case 2078444481:
                case 2140732180:
                    C4238.m13540();
                    C13473.m33144();
                    break;
                default:
                    if (C0950.f3488 >= 0) {
                        iM2761 = C0619.m2761("ᩳۗ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 3423) ^ (-181660194);
                        i5 = 1347761588;
                    } else {
                        iM2761 = (C0619.m2761("۟ۙ") ^ i3) * (-7);
                        i4 = ((iM2761 ^ i2) * (-15933)) ^ 1266312104;
                        i5 = 762853680;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws Throwable {
        int iM3169;
        int i;
        AbstractC22044 abstractC22044 = null;
        OutputStream outputStreamMo4289 = null;
        int i2 = 0;
        int i3 = 0;
        Throwable th = null;
        Object th2 = null;
        int i4 = -628514677;
        int i5 = C1321.f4751;
        int i6 = AbstractC3624.f12429;
        int iM2761 = C0619.m2761("ۨܶ") ^ i6;
        int i7 = ((iM2761 ^ i5) * (-32033)) ^ 1710683499;
        int i8 = 1439617149;
        while (true) {
            int i9 = iM2761 ^ i8;
            while (true) {
                i4 = ((((i4 ^ i5) * 4475) >> 31) & i7) ^ i9;
                switch (i4) {
                    case -2124259215:
                    case -256629198:
                        if (i2 != 1) {
                            iM3169 = (C0619.m2761("ۨ᩵") + i5) * (-119);
                            i7 = ((iM3169 ^ i6) * 11331) ^ (-2061558093);
                            i = -1676047909;
                        } else {
                            iM3169 = C0773.m3169("ܳܿ") ^ i5;
                            i7 = ((iM3169 ^ i6) * (-32003)) ^ 2139878356;
                            i = 86836271;
                        }
                        i9 = iM3169 ^ i;
                        i3 = 90;
                        break;
                    case -2116388578:
                    case 1339842154:
                        if (C2834.f9334 > 0) {
                            iM2761 = C0773.m3169("᩷ۧ") ^ i6;
                            i7 = ((iM2761 ^ i5) * (-28217)) ^ 674669568;
                            i8 = -90441619;
                        } else {
                            iM2761 = C0619.m2761("᩺ۘ") ^ i5;
                            i7 = ((iM2761 ^ i6) * 2249) ^ (-1061550662);
                            i8 = 825436831;
                        }
                        break;
                    case -2104058082:
                    case 1175493974:
                        if (outputStreamMo4289 == null) {
                            iM2761 = (i6 - C0773.m3169("ۡۚ")) * (-13);
                            i7 = ((iM2761 ^ i5) * 3055) ^ 751266177;
                            i8 = -26989338;
                        } else {
                            iM2761 = C0773.m3169("ۨۨ") ^ i5;
                            i7 = ((iM2761 ^ i6) * 3921) ^ 623507959;
                            i8 = 299694042;
                        }
                        break;
                    case -1971698672:
                    case -1317672713:
                        if (C1519.f5300 < 0) {
                            iM2761 = C0619.m2761("᩵᩸") ^ i5;
                            i7 = ((iM2761 ^ i6) * (-13799)) ^ 2095762562;
                            i8 = 1639100814;
                        } else {
                            iM2761 = C0619.m2761("᩸ۚ") ^ i6;
                            i7 = ((iM2761 ^ i5) * 15123) ^ (-1496562939);
                            i8 = 1231926825;
                        }
                        break;
                    case -1949767627:
                    case 914450897:
                        if (outputStreamMo4289 == null) {
                            iM2761 = (i6 - C0619.m2761("ۘۗ")) * q.h;
                            i7 = ((iM2761 ^ i5) * 21725) ^ 1335476391;
                            i8 = 1070167745;
                        } else {
                            iM2761 = C0619.m2761("ۙۤ") ^ i5;
                            i7 = ((iM2761 ^ i6) * 17373) ^ (-123180420);
                            i8 = -1150946476;
                        }
                        break;
                    case -1750544774:
                    case 2144397351:
                        if (C2834.f9334 <= 0) {
                            iM2761 = C0773.m3169("ܺ۟") ^ i6;
                            i7 = ((iM2761 ^ i5) * (-17127)) ^ (-86452897);
                            i8 = -115494694;
                        } else {
                            iM2761 = (C0619.m2761("ۙ۠") ^ i5) * (-71);
                            i7 = ((iM2761 ^ i6) * (-2005)) ^ 1438221141;
                            i8 = 418191757;
                        }
                        break;
                    case -1633963242:
                    case -953606058:
                        if (C11235.f35427 < 0) {
                            iM2761 = C0773.m3169("᩶֨") ^ i5;
                            i7 = ((iM2761 ^ i6) * (-1199)) ^ 1064892611;
                            i8 = -1631922870;
                        } else {
                            iM2761 = C0619.m2761("᩺ۘ") ^ i5;
                            i7 = ((iM2761 ^ i6) * 2249) ^ (-1061550662);
                            i8 = 825436831;
                        }
                        break;
                    case -1548403400:
                    case -783019899:
                        this.f62250.compress(Bitmap.CompressFormat.PNG, i3, outputStreamMo4289);
                        iM2761 = C0773.m3169("᩺ۛ") ^ i5;
                        i7 = ((iM2761 ^ i6) * (-10949)) ^ 18615032;
                        i8 = 604863428;
                    case -1510414291:
                    case 42182273:
                        C3998.m12920();
                        C0773.m3161();
                        return;
                    case -1469130198:
                    case -685069790:
                        if (C3033.f9831 < 0) {
                            iM2761 = (C0619.m2761("ۨۢ") ^ i5) * 87;
                            i7 = ((iM2761 ^ i6) * 6067) ^ 856276762;
                            i8 = 2020647813;
                        } else {
                            iM2761 = (i6 - C0773.m3169("᩸ۜ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                            i7 = ((iM2761 ^ i5) * 1929) ^ 1813815112;
                            i8 = 2011688811;
                        }
                        break;
                    case -1390590363:
                    case -41222250:
                        if (C3448.f11240 < 0) {
                            iM2761 = (C0773.m3169("ۘۛ") ^ i6) * (-37);
                            i7 = ((iM2761 ^ i5) * 10139) ^ (-1802551202);
                            i8 = 551106265;
                        } else {
                            iM2761 = (C0619.m2761("ۙ۠") ^ i5) * (-71);
                            i7 = ((iM2761 ^ i6) * (-2005)) ^ 1438221141;
                            i8 = 418191757;
                        }
                        break;
                    case -1302875011:
                    case -1113201923:
                        if (AbstractC0641.f2496 >= 0) {
                            iM2761 = C0619.m2761("᩺ۘ") ^ i5;
                            i7 = ((iM2761 ^ i6) * 2249) ^ (-1061550662);
                            i8 = 825436831;
                            break;
                        }
                        iM2761 = (i5 - C0773.m3169("֨᩵")) * 85;
                        i7 = ((iM2761 ^ i6) * 20543) ^ (-796380690);
                        i8 = 737321006;
                    case -1276680403:
                    case 766117342:
                        throw th;
                    case -1220217439:
                    case 1844354135:
                        C4238.m13542(outputStreamMo4289);
                        iM2761 = (i6 - C0773.m3169("ۡۚ")) * (-13);
                        i7 = ((iM2761 ^ i5) * 3055) ^ 751266177;
                        i8 = -26989338;
                        break;
                    case -1110958479:
                    case 233475019:
                        i2 = this.f62248;
                        iM2761 = C0619.m2761("۫۫") ^ i5;
                        i7 = ((iM2761 ^ i6) * (-8843)) ^ (-268251194);
                        i8 = 1445733417;
                        break;
                    case -1060681755:
                    case 1852979008:
                        C1542.m5459();
                        if (C2375.f7641 <= 0) {
                            iM2761 = (i6 - C0773.m3169("᩸ۜ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                            i7 = ((iM2761 ^ i5) * 1929) ^ 1813815112;
                            i8 = 2011688811;
                            break;
                        }
                        iM2761 = C0773.m3169("ۚܳ") ^ i6;
                        i7 = ((iM2761 ^ i5) * 23803) ^ (-517616968);
                        i8 = -163048786;
                        break;
                    case -853502519:
                    case 1837415072:
                        C3099.m10095();
                        if (C3099.f10023 <= 0) {
                            iM2761 = (C0619.m2761("ᩴܿ") ^ i5) * (-3);
                            i7 = ((iM2761 ^ i6) * (-29023)) ^ (-456467646);
                            i8 = -283838910;
                        } else {
                            iM2761 = (i5 - C0773.m3169("֨᩵")) * 85;
                            i7 = ((iM2761 ^ i6) * 20543) ^ (-796380690);
                            i8 = 737321006;
                        }
                        break;
                    case -751053839:
                    case 763586870:
                        C2419.m8174();
                        C2702.m8876();
                        iM2761 = C0619.m2761("᩸ۚ") ^ i6;
                        i7 = ((iM2761 ^ i5) * 15123) ^ (-1496562939);
                        i8 = 1231926825;
                        break;
                    case -674404301:
                    case 941700035:
                        if (!C3690.m11987()) {
                            iM2761 = C0773.m3169("ۤ֡") ^ i6;
                            i7 = ((iM2761 ^ i5) * (-23367)) ^ 739161567;
                            i8 = -420432238;
                        } else {
                            iM2761 = (C0619.m2761("ᩴܿ") ^ i5) * (-3);
                            i7 = ((iM2761 ^ i6) * (-29023)) ^ (-456467646);
                            i8 = -283838910;
                        }
                        break;
                    case -627320603:
                    case -613217172:
                        return;
                    case -608023822:
                    case 2072875752:
                        if (C1564.f5401 <= 0) {
                            iM2761 = (C0619.m2761("ۙ۠") ^ i5) * (-71);
                            i7 = ((iM2761 ^ i6) * (-2005)) ^ 1438221141;
                            i8 = 418191757;
                            break;
                        }
                        iM2761 = C0619.m2761("᩸ۚ") ^ i6;
                        i7 = ((iM2761 ^ i5) * 15123) ^ (-1496562939);
                        i8 = 1231926825;
                        break;
                    case -482826958:
                    case -15178102:
                        C2375.m8065();
                        if (C3033.f9831 >= 0) {
                            iM2761 = C0773.m3169("ۚܳ") ^ i6;
                            i7 = ((iM2761 ^ i5) * 23803) ^ (-517616968);
                            i8 = -163048786;
                            break;
                            break;
                        }
                        iM2761 = C0773.m3169("ܺ۟") ^ i6;
                        i7 = ((iM2761 ^ i5) * (-17127)) ^ (-86452897);
                        i8 = -115494694;
                        break;
                    case -469279935:
                    case 369085018:
                        if (C2375.f7641 <= 0) {
                            iM2761 = (C0773.m3169("ۧܳ") + i5) * 55;
                            i7 = ((iM2761 ^ i6) * (-2599)) ^ (-1624021034);
                            i8 = 197181444;
                        } else {
                            iM2761 = C0619.m2761("᩸ۚ") ^ i6;
                            i7 = ((iM2761 ^ i5) * 15123) ^ (-1496562939);
                            i8 = 1231926825;
                        }
                        break;
                    case -438725806:
                    case 652131343:
                        if (C2834.f9334 > 0) {
                            iM2761 = (C0773.m3169("֫ۡ") ^ i6) * 61;
                            i7 = ((iM2761 ^ i5) * (-13397)) ^ 174585728;
                            i8 = 996946001;
                        } else {
                            iM2761 = C0619.m2761("᩺ۘ") ^ i5;
                            i7 = ((iM2761 ^ i6) * 2249) ^ (-1061550662);
                            i8 = 825436831;
                        }
                        break;
                    case -286608346:
                    case 312067475:
                        if (i2 == 2) {
                            iM2761 = (C0619.m2761("᩵۟") ^ i6) * 59;
                            i7 = ((iM2761 ^ i5) * 13723) ^ 1985387136;
                            i8 = 617129812;
                        } else {
                            iM2761 = C0773.m3169("᩺ۛ") ^ i5;
                            i7 = ((iM2761 ^ i6) * (-10949)) ^ 18615032;
                            i8 = 604863428;
                        }
                        break;
                    case -110357024:
                    case 754077373:
                        if (C20932.f66974 > 0) {
                            iM2761 = C0773.m3169("᩻֡") ^ i5;
                            i7 = ((iM2761 ^ i6) * 2411) ^ (-1544669047);
                            i8 = -381174889;
                        } else {
                            iM2761 = (C0773.m3169("ۧܳ") + i5) * 55;
                            i7 = ((iM2761 ^ i6) * (-2599)) ^ (-1624021034);
                            i8 = 197181444;
                        }
                        break;
                    case -80229843:
                    case 1528134420:
                        try {
                            this.f62250.compress(Bitmap.CompressFormat.WEBP, i3, outputStreamMo4289);
                            iM2761 = C0773.m3169("᩺ۛ") ^ i5;
                            i7 = ((iM2761 ^ i6) * (-10949)) ^ 18615032;
                            i8 = 604863428;
                        } catch (Throwable th3) {
                            th = th3;
                            iM2761 = C0619.m2761("ܶ۠") ^ i6;
                            i7 = ((iM2761 ^ i5) * 5345) ^ 1679241119;
                            i8 = 2104271985;
                        }
                        break;
                    case 300010796:
                    case 642057258:
                        abstractC22044.mo49834();
                        if (C2419.m8174() < 0) {
                            iM2761 = C0619.m2761("ۧۛ") ^ i5;
                            i7 = ((iM2761 ^ i6) * (-2763)) ^ 1786340682;
                            i8 = -1053402642;
                        } else {
                            iM2761 = (C0773.m3169("۬ۤ") + i6) * (-71);
                            i7 = ((iM2761 ^ i5) * 24431) ^ (-2050278340);
                            i8 = 352073203;
                        }
                        break;
                    case 384625348:
                    case 931674927:
                        C1146.m4219(th, th2);
                        iM2761 = (i6 - C0619.m2761("ۘۗ")) * q.h;
                        i7 = ((iM2761 ^ i5) * 21725) ^ 1335476391;
                        i8 = 1070167745;
                        break;
                    case 503183108:
                    case 1288370314:
                        try {
                            C4238.m13542(outputStreamMo4289);
                            iM2761 = (i6 - C0619.m2761("ۘۗ")) * q.h;
                            i7 = ((iM2761 ^ i5) * 21725) ^ 1335476391;
                            i8 = 1070167745;
                        } catch (Throwable th4) {
                            th2 = th4;
                            iM2761 = C0619.m2761("۟ۖ") ^ i6;
                            i7 = ((iM2761 ^ i5) * (-17357)) ^ 212175033;
                            i8 = 1560353497;
                        }
                        break;
                    case 505620217:
                    case 1437712563:
                        abstractC22044 = this.f62246;
                        if (!RunnableC1848.f6235) {
                            iM2761 = (i6 - C0773.m3169("ܽܳ")) * 49;
                            i7 = ((iM2761 ^ i5) * 22991) ^ (-2008512343);
                            i8 = 1595123670;
                        } else {
                            iM2761 = C0773.m3169("ܺ۟") ^ i6;
                            i7 = ((iM2761 ^ i5) * (-17127)) ^ (-86452897);
                            i8 = -115494694;
                        }
                        break;
                    case 760363746:
                    case 1739479617:
                        outputStreamMo4289 = abstractC22044.mo4289(false);
                        iM2761 = C0619.m2761("ۘ۫") ^ i6;
                        i7 = ((iM2761 ^ i5) * (-1959)) ^ 1415768808;
                        i8 = 1174895378;
                        break;
                    default:
                        AbstractC0641.m2813();
                        if (C1146.f4234 >= 0) {
                            iM2761 = (i5 - C0773.m3169("֨᩵")) * 85;
                            i7 = ((iM2761 ^ i6) * 20543) ^ (-796380690);
                            i8 = 737321006;
                            break;
                        }
                        iM2761 = (C0619.m2761("ۙ۠") ^ i5) * (-71);
                        i7 = ((iM2761 ^ i6) * (-2005)) ^ 1438221141;
                        i8 = 418191757;
                        break;
                }
            }
        }
    }

    public C19243(ViewOnClickListenerC7793 viewOnClickListenerC7793, C20472 c20472, AbstractC22044 abstractC22044, int i) {
        int i2 = 1994423710;
        int i3 = C1542.f5343;
        int i4 = C2287.f7432;
        this.f62249 = viewOnClickListenerC7793;
        this.f62247 = c20472;
        this.f62246 = abstractC22044;
        this.f62248 = i;
        int iM3169 = C0773.m3169("֡᩶") ^ i3;
        int i5 = ((iM3169 ^ i4) * (-6663)) ^ (-565164326);
        int i6 = 304556678;
        while (true) {
            i2 = (iM3169 ^ i6) ^ (i5 & (((i2 ^ i4) * 23725) >> 31));
            switch (i2) {
                case -1946184068:
                case -752428103:
                    C2966.m9664();
                    C1564.m5509();
                    throw new RuntimeException();
                case -1805365309:
                case -1558133580:
                    return;
                case -1164627780:
                case 1859031756:
                    if (C3448.m11248() != 0) {
                        iM3169 = C0773.m3169("᩵֫") ^ i4;
                        i5 = ((iM3169 ^ i3) * 11235) ^ 55161020;
                        i6 = 1395817574;
                    } else {
                        iM3169 = C0773.m3169("ܰۛ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 23071) ^ (-2115892771);
                        i6 = -1112651350;
                    }
                    break;
                case -1063086854:
                case -258908374:
                    C2419.m8174();
                    if (RunnableC3055.f9898 < 0) {
                        iM3169 = C0619.m2761("᩹ܰ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 22449) ^ (-74770398);
                        i6 = 981570914;
                    } else {
                        iM3169 = C0773.m3169("᩵֫") ^ i4;
                        i5 = ((iM3169 ^ i3) * 11235) ^ 55161020;
                        i6 = 1395817574;
                    }
                    break;
                case -187732947:
                case 1451083714:
                    C1826.m6301();
                    iM3169 = C0773.m3169("᩵֫") ^ i4;
                    i5 = ((iM3169 ^ i3) * 11235) ^ 55161020;
                    i6 = 1395817574;
                    break;
                case 413773031:
                case 1041451397:
                    if (C2834.f9334 > 0) {
                        iM3169 = C0619.m2761("᩹ܰ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 22449) ^ (-74770398);
                        i6 = 981570914;
                    } else {
                        iM3169 = C0773.m3169("ۜ۠") ^ i4;
                        i5 = ((iM3169 ^ i3) * 23245) ^ (-825208771);
                        i6 = 1085657463;
                    }
                    break;
                default:
                    if (C1080.m4050()) {
                        iM3169 = C0773.m3169("ۡۡ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 16473) ^ (-1645152054);
                        i6 = -586853425;
                    } else {
                        iM3169 = C0773.m3169("ܰ᩸") ^ i3;
                        i5 = ((iM3169 ^ i4) * 1257) ^ 287765335;
                        i6 = 1372099971;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00a7 A[PHI: r3
      0x00a7: PHI (r3v4 l.᩵ۢ֫) = (r3v3 l.᩵ۢ֫), (r3v2 l.᩵ۢ֫), (r3v2 l.᩵ۢ֫) binds: [B:24:0x00a5, B:17:0x006e, B:15:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x0127 A[PHI: r2 r14 r15
      0x0127: PHI (r2v4 l.۟ۢ֫) = (r2v3 l.۟ۢ֫), (r2v2 l.۟ۢ֫) binds: [B:36:0x0125, B:12:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x0127: PHI (r14v4 short[]) = (r14v3 short[]), (r14v2 short[]) binds: [B:36:0x0125, B:12:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x0127: PHI (r15v4 int) = (r15v3 int), (r15v2 int) binds: [B:36:0x0125, B:12:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x01d5 A[PHI: r7 r11
      0x01d5: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int), (r7v2 int) binds: [B:51:0x01d3, B:32:0x0103, B:15:0x006b, B:12:0x0065, B:9:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x01d5: PHI (r11v4 int) = (r11v3 int), (r11v2 int), (r11v2 int), (r11v2 int), (r11v2 int) binds: [B:51:0x01d3, B:32:0x0103, B:15:0x006b, B:12:0x0065, B:9:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x020d A[PHI: r4 r9 r10
      0x020d: PHI (r4v3 l.ۛ۫) = (r4v2 l.ۛ۫), (r4v2 l.ۛ۫), (r4v5 l.ۛ۫) binds: [B:55:0x020b, B:9:0x005c, B:6:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x020d: PHI (r9v4 short) = (r9v3 short), (r9v2 short), (r9v2 short) binds: [B:55:0x020b, B:9:0x005c, B:6:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x020d: PHI (r10v4 int) = (r10v3 int), (r10v2 int), (r10v2 int) binds: [B:55:0x020b, B:9:0x005c, B:6:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x025b A[PHI: r5 r6 r12 r16 r21
      0x025b: PHI (r5v3 int) = (r5v2 int), (r5v2 int), (r5v2 int), (r5v4 int) binds: [B:63:0x0259, B:59:0x023d, B:47:0x01b0, B:28:0x00e2] A[DONT_GENERATE, DONT_INLINE]
      0x025b: PHI (r6v3 int) = (r6v2 int), (r6v2 int), (r6v2 int), (r6v4 int) binds: [B:63:0x0259, B:59:0x023d, B:47:0x01b0, B:28:0x00e2] A[DONT_GENERATE, DONT_INLINE]
      0x025b: PHI (r12v4 short) = (r12v2 short), (r12v2 short), (r12v3 short), (r12v2 short) binds: [B:63:0x0259, B:59:0x023d, B:47:0x01b0, B:28:0x00e2] A[DONT_GENERATE, DONT_INLINE]
      0x025b: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:63:0x0259, B:59:0x023d, B:47:0x01b0, B:28:0x00e2] A[DONT_GENERATE, DONT_INLINE]
      0x025b: PHI (r21v5 char) = (r21v3 char), (r21v4 char), (r21v3 char), (r21v3 char) binds: [B:63:0x0259, B:59:0x023d, B:47:0x01b0, B:28:0x00e2] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        int iM2761;
        int i;
        int i2;
        int i3 = AbstractC3624.f12429;
        int i4 = C1519.f5300;
        int iM2762 = C0619.m2761("ۡܳ") ^ i3;
        int i5 = ((iM2762 ^ i4) * (-20233)) ^ 339408634;
        C6389 c6389 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM2762 ^ 512524141;
        int iM3169 = 0;
        int i7 = 0;
        int i8 = 0;
        short s = 0;
        int i9 = 0;
        int i10 = 0;
        short s2 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = -1193543826;
        char c = 0;
        C20472 c20472 = null;
        ViewOnClickListenerC7793 viewOnClickListenerC7793 = null;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i4) * 11831) >> 31));
            switch (i13) {
                case -1956813059:
                case -1291570763:
                    c = '\r';
                    if (C3734.f12817 >= 0) {
                        iM2761 = (C0619.m2761("ۗ᩻") ^ i3) * (-23);
                        i = ((iM2761 ^ i4) * 5409) ^ 1465592078;
                        i2 = -1127526475;
                    } else {
                        iM2761 = C0619.m2761("۟۠") ^ i3;
                        i = ((iM2761 ^ i4) * (-8343)) ^ 583470532;
                        i2 = -1158794915;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1861075419:
                case 439843235:
                    C23916.m53419();
                    if (C13473.f42873 == 0) {
                        iM2761 = C0773.m3169("ᩴܳ") ^ i3;
                        i = ((iM2761 ^ i4) * 30639) ^ (-554983797);
                        i2 = 1104380347;
                    } else {
                        iM2761 = C0773.m3169("᩵ܶ") ^ i4;
                        i = ((iM2761 ^ i3) * (-11683)) ^ 1446641077;
                        i2 = 922629116;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1855452597:
                case 1192378788:
                    C3492.m11488();
                    if (C0950.f3488 >= 0) {
                        iM2761 = C0773.m3169("ᩴܳ") ^ i3;
                        i = ((iM2761 ^ i4) * 30639) ^ (-554983797);
                        i2 = 1104380347;
                    } else {
                        iM2761 = (C0773.m3169("ۗۚ") + i4) * (-49);
                        i = ((iM2761 ^ i3) * (-23199)) ^ (-10536270);
                        i2 = 581634013;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1831091670:
                case -1483513223:
                    this.f62250 = DialogInterfaceOnClickListenerC14300.m34706(c6389.getDrawable());
                    break;
                case -1774482694:
                case 1133819030:
                    if ((s * s2) - i10 <= 0) {
                        iM2761 = C0773.m3169("ۖܿ") ^ i3;
                        i = ((iM2761 ^ i4) * (-27473)) ^ 318575625;
                        i2 = 1770230174;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ۡ۟")) * 15;
                        i = ((iM2761 ^ i4) * 14603) ^ 1138214051;
                        i2 = 526623090;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1499394096:
                case -924135891:
                    viewOnClickListenerC7793 = this.f62249;
                    sArr2 = f62245;
                    i12 = 14;
                    if (C2419.f7754 >= 0) {
                        iM2761 = C0773.m3169("᩵ܶ") ^ i4;
                        i = ((iM2761 ^ i3) * (-11683)) ^ 1446641077;
                        i2 = 922629116;
                    } else {
                        iM2761 = (C0619.m2761("ᩴۗ") + i4) * 59;
                        i = ((iM2761 ^ i3) * (-1031)) ^ 1311775455;
                        i2 = -594726111;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1101738223:
                case -1014799116:
                    iM3169 = C0773.m3169(C3998.m12925(sArr2, i12, i8, i11));
                    i7 = 2121255280;
                    if (AbstractC0116.f1064 <= 0) {
                        iM2761 = (C0619.m2761("ۗ᩻") ^ i3) * (-23);
                        i = ((iM2761 ^ i4) * 5409) ^ 1465592078;
                        i2 = -1127526475;
                    } else {
                        iM2761 = (i4 - C0619.m2761("ۚܿ")) * (-77);
                        i = ((iM2761 ^ i3) * (-9259)) ^ (-1326442062);
                        i2 = -1707345771;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1092716333:
                case -377251678:
                    if (C2878.f9462) {
                        iM2761 = (i4 - C0773.m3169("᩹ۙ")) * (-123);
                        i = ((iM2761 ^ i3) * 24715) ^ 284334725;
                        i2 = -267447513;
                    } else {
                        iM2761 = C0773.m3169("ᩴܳ") ^ i3;
                        i = ((iM2761 ^ i4) * 30639) ^ (-554983797);
                        i2 = 1104380347;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1038151235:
                case 1561023803:
                    m8191(viewOnClickListenerC7793, iM3169 ^ i7);
                    c20472 = this.f62247;
                    if (C3077.f9998) {
                        iM2761 = C0619.m2761("ܰۧ") ^ i3;
                        i = ((iM2761 ^ i4) * (-19177)) ^ (-2095273662);
                        i2 = 1003378330;
                    } else {
                        iM2761 = (i4 - C0773.m3169("᩹ۙ")) * (-123);
                        i = ((iM2761 ^ i3) * 24715) ^ 284334725;
                        i2 = -267447513;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -627625699:
                case 1737392352:
                    s2 = 35226;
                    if (C3033.m9845() <= 0) {
                        iM2761 = (C0619.m2761("ۗ᩻") ^ i3) * (-23);
                        i = ((iM2761 ^ i4) * 5409) ^ 1465592078;
                        i2 = -1127526475;
                    } else {
                        iM2761 = (C0619.m2761("ۜᩳ") + i4) * 109;
                        i = ((iM2761 ^ i3) * (-15555)) ^ (-1275755928);
                        i2 = 1792901896;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -360255859:
                case 722095164:
                    i10 = i9 + 310217769;
                    if (AbstractC3624.f12429 <= 0) {
                        iM2761 = C0773.m3169("ᩴܳ") ^ i3;
                        i = ((iM2761 ^ i4) * 30639) ^ (-554983797);
                        i2 = 1104380347;
                    } else {
                        iM2761 = (C0619.m2761("ۙ۟") ^ i3) * (-79);
                        i = ((iM2761 ^ i4) * (-29211)) ^ (-1047131390);
                        i2 = 1258657329;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -251412106:
                case 583735430:
                    s = sArr[c];
                    i9 = s * s;
                    if (C3492.m11488()) {
                        iM2761 = C0773.m3169("ۡۧ") ^ i4;
                        i = ((iM2761 ^ i3) * (-20081)) ^ 1086341996;
                        i2 = 905486996;
                    } else {
                        iM2761 = (C0773.m3169("ۗۚ") + i4) * (-49);
                        i = ((iM2761 ^ i3) * (-23199)) ^ (-10536270);
                        i2 = 581634013;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -243113406:
                case 1873894172:
                    C2288.m7767();
                    break;
                case 142986606:
                case 1432455381:
                    sArr = f62245;
                    if (C3779.f12953 <= 0) {
                        iM2761 = (C0619.m2761("ۗ᩻") ^ i3) * (-23);
                        i = ((iM2761 ^ i4) * 5409) ^ 1465592078;
                        i2 = -1127526475;
                    } else {
                        iM2761 = C0619.m2761("֫ۜ") ^ i4;
                        i = ((iM2761 ^ i3) * (-9975)) ^ (-361206836);
                        i2 = 1411596371;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 171807054:
                case 1853095891:
                    C13473.m33144();
                    C1343.m4943();
                    iM2761 = (i4 - C0773.m3169("᩹ۙ")) * (-123);
                    i = ((iM2761 ^ i3) * 24715) ^ 284334725;
                    i2 = -267447513;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 577659261:
                case 1399919376:
                    i11 = 4169;
                    iM2761 = (C0619.m2761("᩹ۜ") ^ i4) * (-77);
                    i = ((iM2761 ^ i3) * 29479) ^ 229259791;
                    i2 = 265918041;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 1463669532:
                case 1840974438:
                    i11 = 11190;
                    iM2761 = (C0619.m2761("᩹ۜ") ^ i4) * (-77);
                    i = ((iM2761 ^ i3) * 29479) ^ 229259791;
                    i2 = 265918041;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 1583670263:
                case 2091141908:
                    i8 = 3;
                    if (C1519.m5403()) {
                        iM2761 = C0619.m2761("ۧۖ") ^ i3;
                        i = ((iM2761 ^ i4) * (-31945)) ^ (-1886097261);
                        i2 = -172410860;
                    } else {
                        iM2761 = C0773.m3169("ᩴܳ") ^ i3;
                        i = ((iM2761 ^ i4) * 30639) ^ (-554983797);
                        i2 = 1104380347;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                default:
                    c6389 = c20472.f65587;
                    if (C0773.f2792 <= 0) {
                        iM2761 = (C0773.m3169("ۗۚ") + i4) * (-49);
                        i = ((iM2761 ^ i3) * (-23199)) ^ (-10536270);
                        i2 = 581634013;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ܶۜ")) * (-53);
                        i = ((iM2761 ^ i4) * 19751) ^ 2060052182;
                        i2 = -276381643;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        C0487.m2362(this);
        C1519.m5412();
    }
}
