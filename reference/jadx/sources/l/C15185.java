package l;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ܳ۟֫, reason: contains not printable characters */
/* JADX INFO: compiled from: JAJI */
/* JADX INFO: loaded from: classes5.dex */
public final class C15185 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֡᩸֡, reason: not valid java name and contains not printable characters */
    private static final short[] f49580 = {6988, -1610, 15887, 16010, 3572, -2773, -2800, -2795, -2800, -2799, -2807, -2800, -2722, -2806, -2809, -2802, -2789, -2722, -2799, -2792, -2722, -2787, -2799, -2797, -2802, -2785, -2804, -2793, -2803, -2799, -2800, -2722, -2804, -2789, -2803, -2805, -2798, -2806, -2748, -2722, -2793, -2800, -2792, -2799, -2736, -2796, -2803, -2799, -2800, -2806, -2809, -2802, -2789, -2792, -2793, -2798, -2789, -2737, -2792, -2793, -2798, -2789, -2740, -2790, -2789, -2810, -2785, -2804, -2803, -2787, -2736, -2810, -2797, -2798, -2785, -2810, -2797, -2798, -29379, -23395, 32762, -2736, -2803, -2797, -2785, -2798, -2793, 25603, 26264, -27860, -2793, -2791, -2800, -2799, -2804, -2789, -2772, -2789, -2791, -2793, -2803, -2806, -2789, -2804, -32396, -30569, 28742, -2793, -2791, -2800, -2799, -2804, -2789, -2768, -2799, -2802, -2761, -2800, -2803, -2806, -2804, -2805, -2787, -2806, -2793, -2799, -2800, -2793, -2791, -2800, -2799, -2804, -2789, -2772, -2789, -2803, -2761, -2790, -2755, -2794, -2785, -2800, -2791, -2789, -2803, -2782, -2803, -2732, -2782, -2736, -2804, -2789, -2791, -2793, -2803, -2806, -2789, -2804, -2803, -2722, -2782, -2790, -2731, -2782, -2803, -2732, -2782, -2803, -2732, -2730, -2800, -2799, -2802, -2729, -2751, -2782, -2803, -2732, -2782, -2803, -2732, -2787, -2799, -2800, -2803, -2806, -2730, -2735, -2782, -2790, -2731, -2729, -2751, -2722, -2779, -2802, -2808, -2781, -2782, -2790, -2731, -2734, -2722, -2738, -2810, -2743, -2792, -2779, -2738, -2733, -2745, -2785, -2733, -2792, -2781, -2811, -2744, -2813, -2782, -2803, -2732, -2782, -2803, -2732, -2782, -2736, -2792, -2793, -2789, -2798, -2790, -2722, -2802, -2805, -2788, -2798, -2793, -2787, -2722, -2803, -2806, -2785, -2806, -2793, -2787, -2722, -2730, -2751, -2748, -2792, -2793, -2800, -2785, -2798, -2722, -2729, -2751, -2779, -2784, -2748, -2701, -2700, -2781, -2731, -2748, -2761, -2722, -2749, -2722, -2738, -2810, -2743, -2792, -2779, -2738, -2733, -2745, -2785, -2733, -2792, -2781, -2811, -2744, -2813, -2782, -2803, -2732, -2785, -2735, -2782, -2803, -2732, -2738, -2810, -2743, -2792, -2779, -2738, -2733, -2745, -2785, -2733, -2792, -2781, -2811, -2744, -2813, -2782, -2803, -2732, -2788, -2735};

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC16677 f49581;

    /* JADX WARN: Code duplicated, block: B:46:0x0187 A[PHI: r3 r4 r16
      0x0187: PHI (r3v5 l.ܺ۟֫) = (r3v3 l.ܺ۟֫), (r3v2 l.ܺ۟֫) binds: [B:45:0x0185, B:13:0x0078] A[DONT_GENERATE, DONT_INLINE]
      0x0187: PHI (r4v6 l.᩻ᩳ᩷) = (r4v4 l.᩻ᩳ᩷), (r4v2 l.᩻ᩳ᩷) binds: [B:45:0x0185, B:13:0x0078] A[DONT_GENERATE, DONT_INLINE]
      0x0187: PHI (r16v20 int) = (r16v10 int), (r16v21 int) binds: [B:45:0x0185, B:13:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x01c1 A[PHI: r2 r3 r4 r16
      0x01c1: PHI (r2v5 int) = (r2v4 int), (r2v2 int), (r2v2 int), (r2v2 int), (r2v2 int) binds: [B:49:0x01bf, B:39:0x0165, B:16:0x0083, B:13:0x0078, B:10:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x01c1: PHI (r3v6 l.ܺ۟֫) = (r3v2 l.ܺ۟֫), (r3v3 l.ܺ۟֫), (r3v2 l.ܺ۟֫), (r3v2 l.ܺ۟֫), (r3v2 l.ܺ۟֫) binds: [B:49:0x01bf, B:39:0x0165, B:16:0x0083, B:13:0x0078, B:10:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x01c1: PHI (r4v7 l.᩻ᩳ᩷) = (r4v2 l.᩻ᩳ᩷), (r4v4 l.᩻ᩳ᩷), (r4v2 l.᩻ᩳ᩷), (r4v2 l.᩻ᩳ᩷), (r4v2 l.᩻ᩳ᩷) binds: [B:49:0x01bf, B:39:0x0165, B:16:0x0083, B:13:0x0078, B:10:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x01c1: PHI (r16v22 int) = (r16v9 int), (r16v10 int), (r16v19 int), (r16v21 int), (r16v24 int) binds: [B:49:0x01bf, B:39:0x0165, B:16:0x0083, B:13:0x0078, B:10:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x0289 A[PHI: r7 r9 r16
      0x0289: PHI (r7v5 java.lang.String) = (r7v4 java.lang.String), (r7v2 java.lang.String), (r7v2 java.lang.String), (r7v2 java.lang.String) binds: [B:53:0x01f7, B:18:0x0087, B:16:0x0083, B:6:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x0289: PHI (r9v3 int) = (r9v2 int), (r9v2 int), (r9v2 int), (r9v5 int) binds: [B:53:0x01f7, B:18:0x0087, B:16:0x0083, B:6:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x0289: PHI (r16v25 int) = (r16v8 int), (r16v18 int), (r16v19 int), (r16v28 int) binds: [B:53:0x01f7, B:18:0x0087, B:16:0x0083, B:6:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x02bf A[PHI: r3 r4 r5 r8 r10 r11 r16
      0x02bf: PHI (r3v4 l.ܺ۟֫) = (r3v2 l.ܺ۟֫), (r3v2 l.ܺ۟֫), (r3v3 l.ܺ۟֫), (r3v2 l.ܺ۟֫), (r3v2 l.ܺ۟֫) binds: [B:70:0x02bd, B:64:0x0270, B:42:0x0172, B:35:0x013a, B:31:0x0110] A[DONT_GENERATE, DONT_INLINE]
      0x02bf: PHI (r4v5 l.᩻ᩳ᩷) = (r4v2 l.᩻ᩳ᩷), (r4v2 l.᩻ᩳ᩷), (r4v4 l.᩻ᩳ᩷), (r4v2 l.᩻ᩳ᩷), (r4v2 l.᩻ᩳ᩷) binds: [B:70:0x02bd, B:64:0x0270, B:42:0x0172, B:35:0x013a, B:31:0x0110] A[DONT_GENERATE, DONT_INLINE]
      0x02bf: PHI (r5v4 l.ܰ᩺᩻) = (r5v2 l.ܰ᩺᩻), (r5v2 l.ܰ᩺᩻), (r5v2 l.ܰ᩺᩻), (r5v3 l.ܰ᩺᩻), (r5v2 l.ܰ᩺᩻) binds: [B:70:0x02bd, B:64:0x0270, B:42:0x0172, B:35:0x013a, B:31:0x0110] A[DONT_GENERATE, DONT_INLINE]
      0x02bf: PHI (r8v5 short) = (r8v4 short), (r8v2 short), (r8v2 short), (r8v2 short), (r8v2 short) binds: [B:70:0x02bd, B:64:0x0270, B:42:0x0172, B:35:0x013a, B:31:0x0110] A[DONT_GENERATE, DONT_INLINE]
      0x02bf: PHI (r10v4 int) = (r10v2 int), (r10v3 int), (r10v2 int), (r10v2 int), (r10v2 int) binds: [B:70:0x02bd, B:64:0x0270, B:42:0x0172, B:35:0x013a, B:31:0x0110] A[DONT_GENERATE, DONT_INLINE]
      0x02bf: PHI (r11v4 short) = (r11v2 short), (r11v3 short), (r11v2 short), (r11v2 short), (r11v2 short) binds: [B:70:0x02bd, B:64:0x0270, B:42:0x0172, B:35:0x013a, B:31:0x0110] A[DONT_GENERATE, DONT_INLINE]
      0x02bf: PHI (r16v12 int) = (r16v2 int), (r16v3 int), (r16v10 int), (r16v11 int), (r16v13 int) binds: [B:70:0x02bd, B:64:0x0270, B:42:0x0172, B:35:0x013a, B:31:0x0110] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        int iM3169;
        int i;
        int i2;
        int i3 = C4282.f15546;
        int i4 = C3099.f10023;
        int iM31610 = (C0773.m3169("ᩳ᩶") ^ i3) * (-91);
        int i5 = ((iM31610 ^ i4) * (-7441)) ^ 1811272082;
        String strM4861 = null;
        int i6 = iM31610 ^ (-2063646839);
        short s = 0;
        int i7 = 0;
        int i8 = 0;
        short s2 = 0;
        int i9 = 0;
        int i10 = -392751887;
        View.OnClickListener onClickListener = null;
        C14941 c14941 = null;
        C25227 c25227 = null;
        ActivityC16677 activityC16677 = null;
        int iM2761 = 0;
        while (true) {
            int i11 = i6 ^ (i5 & (((i10 ^ i4) * (-16693)) >> 31));
            switch (i11) {
                case -2114352263:
                case 1956571816:
                    i11 = i11;
                    activityC16677.m39407();
                    if (C1783.m6239(activityC16677).f35992 != null) {
                        iM3169 = (C0619.m2761("ܺۚ") + i4) * 71;
                        i = ((iM3169 ^ i3) * 31211) ^ (-355070954);
                        i2 = 1402462471;
                    } else {
                        iM3169 = (C0773.m3169("᩺ۙ") + i4) * (-77);
                        i = ((iM3169 ^ i3) * 11081) ^ (-1677816468);
                        i2 = -660802835;
                    }
                    int i12 = i11;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i10 = i12;
                    break;
                case -1797550621:
                case -1197270887:
                    C2966.m9664();
                    if (C1519.f5300 < 0) {
                        i11 = i11;
                        iM3169 = C0773.m3169("ۛܿ") ^ i4;
                        i = ((iM3169 ^ i3) * (-30913)) ^ 893952053;
                        i2 = 1146437359;
                    } else {
                        iM3169 = C0619.m2761("ܳۜ") ^ i4;
                        i11 = i11;
                        i = ((iM3169 ^ i3) * 21449) ^ (-287050906);
                        i2 = 616145495;
                    }
                    int i13 = i11;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i10 = i13;
                    break;
                case -1788724114:
                case 752116301:
                    i11 = i11;
                    onClickListener = new View.OnClickListener() { // from class: l.ᩴ۟֫

                        /* JADX INFO: renamed from: ۟ܰ֫, reason: not valid java name and contains not printable characters */
                        private static final short[] f63334 = {3259, 20680, -25705, 21311};

                        /* JADX WARN: Code duplicated, block: B:57:0x0205 A[PHI: r3 r9 r10 r11 r15
                          0x0205: PHI (r3v3 l.ܶ᩹) = (r3v2 l.ܶ᩹), (r3v2 l.ܶ᩹), (r3v4 l.ܶ᩹) binds: [B:56:0x0203, B:32:0x00da, B:6:0x0052] A[DONT_GENERATE, DONT_INLINE]
                          0x0205: PHI (r9v4 short) = (r9v3 short), (r9v2 short), (r9v2 short) binds: [B:56:0x0203, B:32:0x00da, B:6:0x0052] A[DONT_GENERATE, DONT_INLINE]
                          0x0205: PHI (r10v4 int) = (r10v3 int), (r10v2 int), (r10v2 int) binds: [B:56:0x0203, B:32:0x00da, B:6:0x0052] A[DONT_GENERATE, DONT_INLINE]
                          0x0205: PHI (r11v4 int) = (r11v3 int), (r11v2 int), (r11v2 int) binds: [B:56:0x0203, B:32:0x00da, B:6:0x0052] A[DONT_GENERATE, DONT_INLINE]
                          0x0205: PHI (r15v4 short[]) = (r15v2 short[]), (r15v3 short[]), (r15v2 short[]) binds: [B:56:0x0203, B:32:0x00da, B:6:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int iM31611;
                            int i14;
                            int i15;
                            short[] sArr;
                            int iM2762;
                            int i16;
                            int i17 = C4238.f15451;
                            int i18 = C1542.f5343;
                            int iM2763 = (C0619.m2761("᩵ۢ") ^ i18) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                            int i19 = ((iM2763 ^ i17) * (-5113)) ^ (-1615253464);
                            String strM11809 = null;
                            short[] sArr2 = null;
                            short[] sArr3 = null;
                            int i20 = iM2763 ^ (-372487040);
                            int iM2764 = 0;
                            int i21 = 0;
                            char c = 0;
                            short s3 = 0;
                            int i22 = 0;
                            int i23 = 0;
                            int i24 = 0;
                            short s4 = 0;
                            int i25 = 0;
                            int i26 = 1163028059;
                            C16390 c16390 = null;
                            C2361 c2361M3794 = null;
                            ActivityC16677 activityC16678 = null;
                            while (true) {
                                i26 = i20 ^ (i19 & (((i26 ^ i17) * (-4861)) >> 31));
                                switch (i26) {
                                    case -1985478084:
                                    case 1466109621:
                                        int i27 = s3 + s4;
                                        if ((i27 * i27) - i24 <= 0) {
                                            iM31611 = (C0773.m3169("ܳۖ") ^ i17) * (-79);
                                            i14 = ((iM31611 ^ i18) * (-24657)) ^ (-816574504);
                                            i15 = -814795942;
                                        } else {
                                            iM31611 = (i18 - C0619.m2761("۠᩵")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                            i14 = ((iM31611 ^ i17) * 7945) ^ (-441530812);
                                            i15 = 1182636329;
                                        }
                                        i20 = iM31611 ^ i15;
                                        i19 = i14;
                                        break;
                                    case -1916071198:
                                    case -1846654261:
                                        c = 0;
                                        if (C3099.f10023 <= 0) {
                                            iM31611 = (C0619.m2761("ۜᩳ") ^ i18) * 65;
                                            i14 = ((iM31611 ^ i17) * (-5253)) ^ 475490880;
                                            i15 = 1100822214;
                                        } else {
                                            iM31611 = C0773.m3169("ᩴ۬") ^ i17;
                                            i14 = ((iM31611 ^ i18) * 9083) ^ (-884319661);
                                            i15 = 2060733197;
                                        }
                                        i20 = iM31611 ^ i15;
                                        i19 = i14;
                                        break;
                                    case -1899062547:
                                    case 1864320711:
                                        sArr = f63334;
                                        if (C0950.f3488 >= 0) {
                                            iM2762 = C0619.m2761("۠ܰ") ^ i18;
                                            sArr2 = sArr;
                                            i19 = ((iM2762 ^ i17) * (-6265)) ^ (-1676269538);
                                            i16 = -1812197391;
                                        } else {
                                            iM2762 = (i18 - C0619.m2761("֨ۤ")) * (-91);
                                            sArr2 = sArr;
                                            i19 = ((iM2762 ^ i17) * 25721) ^ (-689414536);
                                            i16 = 1732928850;
                                        }
                                        i20 = iM2762 ^ i16;
                                        break;
                                    case -1699166204:
                                    case 107671601:
                                        RunnableC0334.m2063();
                                        if (C0862.f3233 != 0) {
                                            iM31611 = C0619.m2761("᩹᩻") ^ i18;
                                            i14 = ((iM31611 ^ i17) * (-30435)) ^ (-1128436306);
                                            i15 = -2113510648;
                                            i20 = iM31611 ^ i15;
                                            i19 = i14;
                                        } else {
                                            sArr = sArr2;
                                            iM2762 = C0619.m2761("۠ܰ") ^ i18;
                                            sArr2 = sArr;
                                            i19 = ((iM2762 ^ i17) * (-6265)) ^ (-1676269538);
                                            i16 = -1812197391;
                                            i20 = iM2762 ^ i16;
                                        }
                                        break;
                                    case -1581533060:
                                    case 1381316358:
                                        iM2764 = C0619.m2761(strM11809);
                                        i21 = 2101500568;
                                        if (AbstractC0116.f1064 > 0) {
                                            iM31611 = (C0773.m3169("۠ܺ") ^ i17) * 39;
                                            i14 = ((iM31611 ^ i18) * 6663) ^ (-1715060859);
                                            i15 = 452857120;
                                            i20 = iM31611 ^ i15;
                                            i19 = i14;
                                        } else {
                                            sArr = sArr2;
                                            iM2762 = C0619.m2761("۠ܰ") ^ i18;
                                            sArr2 = sArr;
                                            i19 = ((iM2762 ^ i17) * (-6265)) ^ (-1676269538);
                                            i16 = -1812197391;
                                            i20 = iM2762 ^ i16;
                                        }
                                        break;
                                    case -1558996616:
                                    case 1874942427:
                                        C1146.m4227(c2361M3794, c16390.getTitle());
                                        if (C1146.f4234 >= 0) {
                                            iM31611 = C0619.m2761("᩹᩻") ^ i18;
                                            i14 = ((iM31611 ^ i17) * (-30435)) ^ (-1128436306);
                                            i15 = -2113510648;
                                        } else {
                                            iM31611 = C0773.m3169("ۗ᩶") ^ i18;
                                            i14 = ((iM31611 ^ i17) * 27085) ^ 1368070861;
                                            i15 = 2056541321;
                                        }
                                        i20 = iM31611 ^ i15;
                                        i19 = i14;
                                        break;
                                    case -1359999228:
                                    case -76926914:
                                        strM11809 = RunnableC3646.m11809(sArr3, 1, 3, i25);
                                        if (C2354.f7599 < 0) {
                                            iM31611 = (C0773.m3169("ۛۘ") + i17) * (-121);
                                            i14 = ((iM31611 ^ i18) * (-8917)) ^ (-157387784);
                                            i15 = 55038166;
                                            i20 = iM31611 ^ i15;
                                            i19 = i14;
                                        } else {
                                            sArr = sArr2;
                                            iM2762 = C0619.m2761("۠ܰ") ^ i18;
                                            sArr2 = sArr;
                                            i19 = ((iM2762 ^ i17) * (-6265)) ^ (-1676269538);
                                            i16 = -1812197391;
                                            i20 = iM2762 ^ i16;
                                        }
                                        break;
                                    case -882825249:
                                    case 930679888:
                                        C0487.m2356();
                                        sArr = sArr2;
                                        iM2762 = C0619.m2761("۠ܰ") ^ i18;
                                        sArr2 = sArr;
                                        i19 = ((iM2762 ^ i17) * (-6265)) ^ (-1676269538);
                                        i16 = -1812197391;
                                        i20 = iM2762 ^ i16;
                                        break;
                                    case -882578426:
                                    case -759395133:
                                        C2966.m9664();
                                        if (!C1146.m4231()) {
                                            sArr = sArr2;
                                            iM2762 = C0619.m2761("۠ܰ") ^ i18;
                                            sArr2 = sArr;
                                            i19 = ((iM2762 ^ i17) * (-6265)) ^ (-1676269538);
                                            i16 = -1812197391;
                                            i20 = iM2762 ^ i16;
                                        } else {
                                            iM31611 = (C0619.m2761("ۜᩳ") ^ i18) * 65;
                                            i14 = ((iM31611 ^ i17) * (-5253)) ^ 475490880;
                                            i15 = 1100822214;
                                            i20 = iM31611 ^ i15;
                                            i19 = i14;
                                        }
                                        break;
                                    case -866104100:
                                    case 556055296:
                                        s3 = sArr2[c];
                                        i22 = s3 * s3;
                                        i23 = 347039641;
                                        if (C1343.f4799 != 0) {
                                            iM31611 = (C0773.m3169("ۘ֨") ^ i17) * (-45);
                                            i14 = ((iM31611 ^ i18) * (-17315)) ^ 1117836398;
                                            i15 = -406441974;
                                        } else {
                                            iM31611 = (C0773.m3169("ܿ᩵") + i18) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                                            i14 = ((iM31611 ^ i17) * (-9289)) ^ (-352464325);
                                            i15 = -1672359434;
                                        }
                                        i20 = iM31611 ^ i15;
                                        i19 = i14;
                                        break;
                                    case -855812699:
                                    case 168311999:
                                        C3492.m11487(c2361M3794, iM2764 ^ i21, null);
                                        C3099.m10090(c2361M3794);
                                        break;
                                    case -837500251:
                                    case 871725786:
                                        C1519.m5410(c2361M3794, activityC16678.f56046.getSubtitle());
                                        sArr3 = f63334;
                                        if (C1564.f5401 <= 0) {
                                            iM31611 = (C0773.m3169("ۘ֨") ^ i17) * (-45);
                                            i14 = ((iM31611 ^ i18) * (-17315)) ^ 1117836398;
                                            i15 = -406441974;
                                        } else {
                                            iM31611 = (i18 - C0773.m3169("᩻ᩳ")) * 19;
                                            i14 = ((iM31611 ^ i17) * 14195) ^ 3372245;
                                            i15 = -588099400;
                                        }
                                        i20 = iM31611 ^ i15;
                                        i19 = i14;
                                        break;
                                    case -627240051:
                                    case 1176599872:
                                        C20932.m47848();
                                        break;
                                    case -533607619:
                                    case 803392411:
                                        if (C1826.f6190 <= 0) {
                                            iM2762 = C0773.m3169("᩸ᩴ") ^ i17;
                                            i19 = ((iM2762 ^ i18) * 1591) ^ 87665648;
                                            i16 = 2111132682;
                                            i20 = iM2762 ^ i16;
                                        }
                                        sArr = sArr2;
                                        iM2762 = C0619.m2761("۠ܰ") ^ i18;
                                        sArr2 = sArr;
                                        i19 = ((iM2762 ^ i17) * (-6265)) ^ (-1676269538);
                                        i16 = -1812197391;
                                        i20 = iM2762 ^ i16;
                                        break;
                                    case -390132106:
                                    case 383156244:
                                        i25 = 30892;
                                        iM31611 = C0773.m3169("ۚܳ") ^ i17;
                                        i14 = ((iM31611 ^ i18) * (-21797)) ^ (-59898168);
                                        i15 = -195397138;
                                        i20 = iM31611 ^ i15;
                                        i19 = i14;
                                        break;
                                    case 999920002:
                                    case 1302257768:
                                        int i28 = i22 + i23;
                                        i24 = i28 + i28;
                                        s4 = 18629;
                                        if (C23916.f77426 > 0) {
                                            iM31611 = C0619.m2761("۫᩺") ^ i17;
                                            i14 = ((iM31611 ^ i18) * (-22903)) ^ 1986142899;
                                            i15 = -506150029;
                                            i20 = iM31611 ^ i15;
                                            i19 = i14;
                                        } else {
                                            sArr = sArr2;
                                            iM2762 = C0619.m2761("۠ܰ") ^ i18;
                                            sArr2 = sArr;
                                            i19 = ((iM2762 ^ i17) * (-6265)) ^ (-1676269538);
                                            i16 = -1812197391;
                                            i20 = iM2762 ^ i16;
                                        }
                                        break;
                                    case 1122869086:
                                    case 1438189282:
                                        activityC16678 = this.f63335.f49581;
                                        c2361M3794 = C0950.m3794(activityC16678);
                                        if (C2375.m8065() > 0) {
                                            iM31611 = C0773.m3169("֡ۢ") ^ i18;
                                            i14 = ((iM31611 ^ i17) * (-22415)) ^ 1642891511;
                                            i15 = -1645008118;
                                            i20 = iM31611 ^ i15;
                                            i19 = i14;
                                        } else {
                                            iM2762 = C0773.m3169("᩸ᩴ") ^ i17;
                                            i19 = ((iM2762 ^ i18) * 1591) ^ 87665648;
                                            i16 = 2111132682;
                                            i20 = iM2762 ^ i16;
                                        }
                                        break;
                                    case 1378643280:
                                    case 2026231666:
                                        i25 = 52164;
                                        iM31611 = C0773.m3169("ۚܳ") ^ i17;
                                        i14 = ((iM31611 ^ i18) * (-21797)) ^ (-59898168);
                                        i15 = -195397138;
                                        i20 = iM31611 ^ i15;
                                        i19 = i14;
                                        break;
                                    default:
                                        c16390 = activityC16678.f56046;
                                        if (C1321.f4751 >= 0) {
                                            iM31611 = (C0773.m3169("ۘ֨") ^ i17) * (-45);
                                            i14 = ((iM31611 ^ i18) * (-17315)) ^ 1117836398;
                                            i15 = -406441974;
                                        } else {
                                            iM31611 = (C0619.m2761("᩹ۢ") + i17) * (-81);
                                            i14 = ((iM31611 ^ i18) * (-2143)) ^ 1460596321;
                                            i15 = -1913891114;
                                        }
                                        i20 = iM31611 ^ i15;
                                        i19 = i14;
                                        break;
                                }
                                return;
                            }
                        }
                    };
                    C11235.m28299(C6784.m18918(activityC16677.f56046), onClickListener);
                    iM3169 = C0619.m2761("ܺۘ") ^ i3;
                    i = ((iM3169 ^ i4) * 717) ^ (-1506677504);
                    i2 = 619299933;
                    int i14 = i11;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i10 = i14;
                    break;
                case -1676932728:
                case 277555637:
                    C2878.m9491();
                    RunnableC3055.m9933();
                    break;
                case -1563334671:
                case 470228909:
                    i11 = i11;
                    C4282.m13644();
                    iM3169 = C0773.m3169("᩻ۙ") ^ i3;
                    i = ((iM3169 ^ i4) * (-9185)) ^ (-1961241778);
                    i2 = 875277598;
                    int i15 = i11;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i10 = i15;
                    break;
                case -1533908830:
                case -1028615199:
                    i11 = i11;
                    activityC16677 = this.f49581;
                    c25227 = (C25227) C1564.m5518(activityC16677, iM2761);
                    if (C1542.f5343 <= 0) {
                        iM3169 = C0773.m3169("ۛܿ") ^ i4;
                        i = ((iM3169 ^ i3) * (-30913)) ^ 893952053;
                        i2 = 1146437359;
                    } else {
                        Drawable[] drawableArrM28819 = C1783.m6239(activityC16677).m28819();
                        if (C3033.f9831 >= 0) {
                            iM3169 = (C0619.m2761("ܺۤ") ^ i4) * 5;
                            i = ((iM3169 ^ i3) * (-15509)) ^ 977325241;
                            i2 = 20551301;
                        } else {
                            activityC16677.f53877 = new C14941(drawableArrM28819);
                            activityC16677.f53877.m35947((InterfaceC19417) activityC16677);
                            if (C11235.f35427 >= 0) {
                                iM3169 = (C0619.m2761("ۙᩴ") + i3) * (-13);
                                i = ((iM3169 ^ i4) * 17827) ^ 1563756104;
                                i2 = 2030551476;
                            } else {
                                iM3169 = C0619.m2761("ۡܳ") ^ i4;
                                i = ((iM3169 ^ i3) * 1385) ^ 1306828668;
                                i2 = 106144292;
                            }
                        }
                    }
                    int i16 = i11;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i10 = i16;
                    break;
                case -1528035702:
                case 1836945874:
                    i11 = i11;
                    strM4861 = C1321.m4861(f49580, 1, 3, i9);
                    if (C13473.f42873 != 0) {
                        iM3169 = C0773.m3169("᩻ۙ") ^ i3;
                        i = ((iM3169 ^ i4) * (-9185)) ^ (-1961241778);
                        i2 = 875277598;
                    } else {
                        iM3169 = C0619.m2761("ۖ᩷") ^ i3;
                        i = ((iM3169 ^ i4) * 31915) ^ 645260048;
                        i2 = -651253133;
                    }
                    int i17 = i11;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i10 = i17;
                    break;
                case -1313652407:
                case 53142138:
                    i11 = i11;
                    c14941.m35944((InterfaceC5993) activityC16677);
                    C1826.m6315(c25227, activityC16677.f53877);
                    if (AbstractC0641.f2496 >= 0) {
                        iM3169 = (C0619.m2761("ܺۤ") ^ i4) * 5;
                        i = ((iM3169 ^ i3) * (-15509)) ^ 977325241;
                        i2 = 20551301;
                    } else {
                        iM3169 = (C0773.m3169("۠֨") ^ i3) * 59;
                        i = ((iM3169 ^ i4) * (-19505)) ^ 1835978038;
                        i2 = 87462727;
                    }
                    int i18 = i11;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i10 = i18;
                    break;
                case -1232255950:
                case 421163460:
                    break;
                case -473158572:
                case 2095824600:
                    i11 = i11;
                    AbstractC0116.m1243();
                    if (C0862.f3233 == 0) {
                        iM3169 = C0773.m3169("ۛܿ") ^ i4;
                        i = ((iM3169 ^ i3) * (-30913)) ^ 893952053;
                        i2 = 1146437359;
                    } else {
                        iM3169 = (C0619.m2761("ۙᩴ") + i3) * (-13);
                        i = ((iM3169 ^ i4) * 17827) ^ 1563756104;
                        i2 = 2030551476;
                    }
                    int i19 = i11;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i10 = i19;
                    break;
                case -471675476:
                case 133025584:
                    i9 = 61561;
                    iM3169 = C0619.m2761("ۤۗ") ^ i3;
                    i = ((iM3169 ^ i4) * 30337) ^ (-1690673480);
                    i2 = -2142280212;
                    int i110 = i11;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i10 = i110;
                    break;
                case -453207579:
                case 1577157840:
                    i11 = i11;
                    activityC16677.f53877.m35942((InterfaceC2264) activityC16677);
                    c14941 = activityC16677.f53877;
                    if (C3998.f13671 != 0) {
                        iM3169 = (C0619.m2761("ܺۤ") ^ i4) * 5;
                        i = ((iM3169 ^ i3) * (-15509)) ^ 977325241;
                        i2 = 20551301;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ᩴᩴ")) * 93;
                        i = ((iM3169 ^ i4) * (-6919)) ^ 383400284;
                        i2 = 1298269275;
                    }
                    int i111 = i11;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i10 = i111;
                    break;
                case -237147923:
                case 2117407879:
                    i11 = i11;
                    s = f49580[0];
                    if (C3448.f11240 >= 0) {
                        iM3169 = (C0619.m2761("ܺۤ") ^ i4) * 5;
                        i = ((iM3169 ^ i3) * (-15509)) ^ 977325241;
                        i2 = 20551301;
                    } else {
                        iM3169 = (i4 - C0773.m3169("ۢᩴ")) * (-81);
                        i = ((iM3169 ^ i3) * (-32069)) ^ 278433151;
                        i2 = 902538593;
                    }
                    int i112 = i11;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i10 = i112;
                    break;
                case -173795702:
                case 1296377585:
                    i9 = 47089;
                    iM3169 = C0619.m2761("ۤۗ") ^ i3;
                    i = ((iM3169 ^ i4) * 30337) ^ (-1690673480);
                    i2 = -2142280212;
                    int i113 = i11;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i10 = i113;
                    break;
                case -41026809:
                case 1599015601:
                    i11 = i11;
                    iM2761 = 2117931793 ^ C0619.m2761(strM4861);
                    if (AbstractC0641.f2496 >= 0) {
                        iM3169 = C0773.m3169("ۛܿ") ^ i4;
                        i = ((iM3169 ^ i3) * (-30913)) ^ 893952053;
                        i2 = 1146437359;
                    } else {
                        iM3169 = C0773.m3169("ۘܰ") ^ i4;
                        i = ((iM3169 ^ i3) * 31523) ^ 1249297794;
                        i2 = -54507140;
                    }
                    int i114 = i11;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i10 = i114;
                    break;
                case -2637796:
                case 1304843282:
                    i11 = i11;
                    i8 = i7 + 1;
                    s2 = 1;
                    if (C3099.f10023 <= 0) {
                        iM3169 = (C0619.m2761("ܺۤ") ^ i4) * 5;
                        i = ((iM3169 ^ i3) * (-15509)) ^ 977325241;
                        i2 = 20551301;
                    } else {
                        iM3169 = (C0619.m2761("ۙ᩺") ^ i3) * 93;
                        i = ((iM3169 ^ i4) * 12319) ^ (-38733701);
                        i2 = 428106981;
                    }
                    int i115 = i11;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i10 = i115;
                    break;
                case 4890006:
                case 1455238719:
                    i11 = i11;
                    try {
                        C2375.m8070(C6784.m18916(activityC16677.f56046), onClickListener);
                        break;
                    } catch (NullPointerException unused) {
                    }
                    iM3169 = (C0773.m3169("᩺ۙ") + i4) * (-77);
                    i = ((iM3169 ^ i3) * 11081) ^ (-1677816468);
                    i2 = -660802835;
                    int i116 = i11;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i10 = i116;
                    break;
                case 511559470:
                case 1520758212:
                    i11 = i11;
                    C3690.m11987();
                    if (RunnableC1848.f6235) {
                        iM3169 = C0773.m3169("᩻ۙ") ^ i3;
                        i = ((iM3169 ^ i4) * (-9185)) ^ (-1961241778);
                        i2 = 875277598;
                    } else {
                        iM3169 = C0773.m3169("ۛܿ") ^ i4;
                        i = ((iM3169 ^ i3) * (-30913)) ^ 893952053;
                        i2 = 1146437359;
                    }
                    int i117 = i11;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i10 = i117;
                    break;
                case 1456529121:
                case 1589250340:
                    i11 = i11;
                    int i20 = s + s2;
                    if ((i20 * i20) - i8 >= 0) {
                        iM3169 = C0773.m3169("ۘۗ") ^ i4;
                        i = ((iM3169 ^ i3) * (-7361)) ^ (-662188049);
                        i2 = 353830536;
                    } else {
                        iM3169 = C0773.m3169("᩻᩷") ^ i4;
                        i = ((iM3169 ^ i3) * 20737) ^ (-162362541);
                        i2 = -1145866122;
                    }
                    int i118 = i11;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i10 = i118;
                    break;
                default:
                    i11 = i11;
                    i7 = s * 2;
                    if (C2702.f8586 <= 0) {
                        iM3169 = C0773.m3169("᩻ۙ") ^ i3;
                        i = ((iM3169 ^ i4) * (-9185)) ^ (-1961241778);
                        i2 = 875277598;
                    } else {
                        iM3169 = (i3 - C0619.m2761("۟ܰ")) * (-37);
                        i = ((iM3169 ^ i4) * (-21591)) ^ 474915860;
                        i2 = -105684706;
                    }
                    int i119 = i11;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i10 = i119;
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        ActivityC16677 activityC16677 = null;
        int i = 1748440463;
        int i2 = C1542.f5343;
        int i3 = C11235.f35427;
        int iM3169 = (C0773.m3169("ᩳ۠") ^ i2) * (-55);
        int i4 = ((iM3169 ^ i3) * (-32227)) ^ (-2095180876);
        int i5 = -124793424;
        while (true) {
            i = ((((i ^ i3) * (-17479)) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2073860611:
                case 838390676:
                    activityC16677 = this.f49581;
                    if (C2485.m8357() <= 0) {
                        iM3169 = C0773.m3169("᩶ۙ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-27487)) ^ 1569336446;
                        i5 = 705038942;
                    } else {
                        iM3169 = C0619.m2761("᩸ۤ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 25361) ^ 1398699783;
                        i5 = 101985347;
                    }
                    break;
                case -2073826643:
                case -1099493540:
                    if (C1519.f5300 >= 0) {
                        iM3169 = (C0773.m3169("ۜ᩸") + i3) * 59;
                        i4 = ((iM3169 ^ i2) * (-3855)) ^ 1573539872;
                        i5 = 1943859136;
                    } else {
                        iM3169 = (C0773.m3169("᩻ۛ") ^ i2) * 93;
                        i4 = ((iM3169 ^ i3) * 20533) ^ 1776016026;
                        i5 = -1494773638;
                    }
                    break;
                case -2054292014:
                case -772711463:
                    if (C2288.m7767()) {
                        iM3169 = (C0773.m3169("ۜ᩸") + i3) * 59;
                        i4 = ((iM3169 ^ i2) * (-3855)) ^ 1573539872;
                        i5 = 1943859136;
                    } else {
                        iM3169 = C0773.m3169("ۖ֫") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-9217)) ^ (-1630943438);
                        i5 = -1373680159;
                    }
                    break;
                case -1986445292:
                case 1667559761:
                    C0773.m3161();
                    if (!C0862.m3503()) {
                        iM3169 = (C0773.m3169("ۜ᩸") + i3) * 59;
                        i4 = ((iM3169 ^ i2) * (-3855)) ^ 1573539872;
                        i5 = 1943859136;
                    } else {
                        iM3169 = C0619.m2761("ܽۡ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 1363) ^ (-290279911);
                        i5 = 212373429;
                    }
                    break;
                case -1766875388:
                case -1020013543:
                    if (C11235.f35427 >= 0) {
                        iM3169 = C0773.m3169("᩶ۙ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-27487)) ^ 1569336446;
                        i5 = 705038942;
                    } else {
                        iM3169 = (C0773.m3169("ܺ֫") + i2) * 79;
                        i4 = ((iM3169 ^ i3) * 1587) ^ 2061083171;
                        i5 = 1247685457;
                    }
                    break;
                case -1578650393:
                case -793050097:
                    if (C2310.f7472 >= 0) {
                        iM3169 = (i2 - C0619.m2761("᩺۬")) * 49;
                        i4 = ((iM3169 ^ i3) * (-5401)) ^ (-407528842);
                        i5 = 1168054738;
                    } else {
                        iM3169 = C0619.m2761("᩺᩶") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-21361)) ^ (-1152286702);
                        i5 = 1258507687;
                    }
                    break;
                case -1202889988:
                case 1095775092:
                    C2310.m7813();
                    C3690.m11987();
                    iM3169 = C0619.m2761("ܽۡ") ^ i2;
                    i4 = ((iM3169 ^ i3) * 1363) ^ (-290279911);
                    i5 = 212373429;
                    break;
                case -876342663:
                case -411151272:
                    if (C4282.f15546 <= 0) {
                        iM3169 = C0619.m2761("ܽۡ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 1363) ^ (-290279911);
                        i5 = 212373429;
                    } else {
                        iM3169 = C0773.m3169("֨۫") ^ i3;
                        i4 = ((iM3169 ^ i2) * 16421) ^ 563601442;
                        i5 = 1955346020;
                    }
                    break;
                case -639487537:
                case 1032939553:
                    if (C17202.f56030) {
                        iM3169 = (i3 - C0773.m3169("ܽܳ")) * 39;
                        i4 = ((iM3169 ^ i2) * (-26701)) ^ 1879780947;
                        i5 = -466490353;
                    } else {
                        iM3169 = C0619.m2761("ܽۡ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 1363) ^ (-290279911);
                        i5 = 212373429;
                    }
                    break;
                case -428952717:
                case 1287557846:
                    if (C2354.f7599 >= 0) {
                        iM3169 = (i2 - C0619.m2761("᩺۬")) * 49;
                        i4 = ((iM3169 ^ i3) * (-5401)) ^ (-407528842);
                        i5 = 1168054738;
                    } else {
                        iM3169 = C0619.m2761("ܺܳ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-13257)) ^ (-128936673);
                        i5 = -393833486;
                    }
                    break;
                case -282131358:
                case 286241988:
                    if (C1321.m4852()) {
                        iM3169 = (C0619.m2761("ۚۖ") ^ i3) * 59;
                        i4 = ((iM3169 ^ i2) * (-13885)) ^ 939566989;
                        i5 = 1681686692;
                    } else {
                        iM3169 = C0773.m3169("᩶ۙ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-27487)) ^ 1569336446;
                        i5 = 705038942;
                    }
                    break;
                case 236065990:
                case 396909908:
                    if (RunnableC0334.f1808 <= 0) {
                        iM3169 = (i2 - C0619.m2761("᩺۬")) * 49;
                        i4 = ((iM3169 ^ i3) * (-5401)) ^ (-407528842);
                        i5 = 1168054738;
                    } else {
                        iM3169 = C0773.m3169("ۚܳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 26713) ^ (-850905038);
                        i5 = 393155871;
                    }
                    break;
                case 295681456:
                case 1170843869:
                    C2485.m8357();
                    C11235.m28309();
                    break;
                case 1317552776:
                case 2084726876:
                    RunnableC1848.m6360();
                    if (!RunnableC3646.f12471) {
                        iM3169 = C0619.m2761("ܽۡ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 1363) ^ (-290279911);
                        i5 = 212373429;
                    } else {
                        iM3169 = C0773.m3169("ᩴۨ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-9153)) ^ 289702140;
                        i5 = -743359788;
                    }
                    break;
                case 1333188355:
                case 2093327696:
                    activityC16677.m40402((Throwable) exc, true);
                    break;
                default:
                    if (!C3077.f9998) {
                        iM3169 = C0773.m3169("ᩴۨ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-9153)) ^ 289702140;
                        i5 = -743359788;
                    } else {
                        iM3169 = (i2 - C0619.m2761("᩺۬")) * 49;
                        i4 = ((iM3169 ^ i3) * (-5401)) ^ (-407528842);
                        i5 = 1168054738;
                    }
                    break;
            }
            return;
        }
    }

    public C15185(ActivityC16677 activityC16677) {
        this.f49581 = activityC16677;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        C3779.m12267(this, this.f49581);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws Throwable {
        HashMap map;
        C8002 c8002;
        C14691 c14691;
        int iM2761;
        int i;
        int i2;
        int iM3169;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        String str;
        HashMap map2;
        HashMap map3;
        C8002 c8003;
        Throwable th;
        C14691 c14692;
        int i8;
        int iM31610;
        int i9;
        int iM2762;
        int i10;
        HashMap map4;
        int i11 = C2354.f7599;
        int i12 = C3033.f9831;
        int iM31611 = (i12 - C0773.m3169("۟ᩴ")) * (-11);
        int i13 = ((iM31611 ^ i11) * (-12281)) ^ (-935584427);
        Throwable th2 = null;
        Object obj = null;
        C14691 c14693 = null;
        String strM35343 = null;
        String strM2756 = null;
        ArrayList arrayList = null;
        C8002 c8004 = null;
        String strM7741 = null;
        int i14 = iM31611 ^ 1353189609;
        int i15 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean zM11490 = false;
        boolean zM35344 = false;
        boolean zM35345 = false;
        boolean zM12923 = false;
        boolean zM3494 = false;
        boolean zM8175 = false;
        boolean zM2359 = false;
        boolean zM23510 = false;
        int i16 = -1308564761;
        boolean zM8176 = false;
        HashMap map5 = null;
        Iterator itM53426 = null;
        boolean zM35346 = false;
        ActivityC16677 activityC16677 = null;
        C22941 c22941 = null;
        String strM7749 = null;
        while (true) {
            i16 = i14 ^ (i13 & (((i16 ^ i11) * (-24067)) >> 31));
            switch (i16) {
                case -1984537035:
                case 878578059:
                    map3 = map5;
                    c8003 = c8004;
                    obj = obj;
                    th = th2;
                    c14692 = c14693;
                    RunnableC3646.m11799(th, obj);
                    int iM2763 = C0619.m2761("ܶۨ") ^ i12;
                    strM7749 = strM7749;
                    i3 = ((iM2763 ^ i11) * (-23335)) ^ (-1123013569);
                    i5 = iM2763 ^ (-1572250083);
                    c14693 = c14692;
                    th2 = th;
                    map5 = map3;
                    c8004 = c8003;
                    i14 = i5;
                    i13 = i3;
                    strM7749 = strM7749;
                    obj = obj;
                    break;
                case -1981048683:
                case -1593032210:
                    map = map5;
                    C1519.m5406(arrayList, C1564.m5510(f49580, 178, 43, i15));
                    RunnableC0334.m2054(arrayList, C2878.m9486(f49580, 221, 66, i15));
                    RunnableC0334.m2054(arrayList, C11235.m28300(f49580, 289, 21, i15));
                    iM2762 = C0619.m2761("᩶ۖ") ^ i12;
                    i6 = ((iM2762 ^ i11) * 19733) ^ 998514184;
                    i10 = 1502550425;
                    i7 = iM2762 ^ i10;
                    map4 = map;
                    i14 = i7;
                    i13 = i6;
                    map5 = map4;
                    break;
                case -1913372492:
                case -314060204:
                    map = map5;
                    try {
                        C3779.m12263(activityC16677).f35994 = 2;
                        try {
                            c8002 = c8004;
                            try {
                                C3779.m12263(activityC16677).f35989 = C0619.m2761(C2310.m7803(f49580, IShizukuService.Stub.TRANSACTION_isHidden, 3, i15)) ^ 2127650025;
                                C3779.m12263(activityC16677).f35988 = strM2756;
                                activityC16677.runOnUiThread(new RunnableC6280(1, this));
                                iM31610 = (C0773.m3169("۟ۜ") ^ i12) * (-3);
                                i6 = ((iM31610 ^ i11) * (-3593)) ^ 1443579793;
                                i9 = 1357548714;
                                i7 = iM31610 ^ i9;
                                c8004 = c8002;
                                map4 = map;
                                i14 = i7;
                                i13 = i6;
                                map5 = map4;
                            } catch (Throwable th3) {
                                th = th3;
                                th2 = th;
                                map5 = map;
                                c8004 = c8002;
                                str = strM7749;
                                int iM2764 = (C0619.m2761("ۨᩳ") ^ i12) * 89;
                                i14 = iM2764 ^ (-240788614);
                                i13 = ((iM2764 ^ i11) * (-11543)) ^ (-182063598);
                                strM7749 = str;
                                c22941 = c22941;
                                obj = obj;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            c8002 = c8004;
                            th2 = th;
                            map5 = map;
                            c8004 = c8002;
                            str = strM7749;
                            int iM2765 = (C0619.m2761("ۨᩳ") ^ i12) * 89;
                            i14 = iM2765 ^ (-240788614);
                            i13 = ((iM2765 ^ i11) * (-11543)) ^ (-182063598);
                            strM7749 = str;
                            c22941 = c22941;
                            obj = obj;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        th2 = th;
                        map5 = map;
                        str = strM7749;
                        int iM2766 = (C0619.m2761("ۨᩳ") ^ i12) * 89;
                        i14 = iM2766 ^ (-240788614);
                        i13 = ((iM2766 ^ i11) * (-11543)) ^ (-182063598);
                        strM7749 = str;
                        c22941 = c22941;
                        obj = obj;
                    }
                    break;
                case -1839153917:
                case 1613999616:
                    map3 = map5;
                    c8003 = c8004;
                    obj = obj;
                    th = th2;
                    c14692 = c14693;
                    try {
                        C3033.m9861(c22941);
                        int iM2767 = C0619.m2761("ܶۨ") ^ i12;
                        strM7749 = strM7749;
                        i3 = ((iM2767 ^ i11) * (-23335)) ^ (-1123013569);
                        i5 = iM2767 ^ (-1572250083);
                        c14693 = c14692;
                        th2 = th;
                        map5 = map3;
                        c8004 = c8003;
                        i14 = i5;
                        i13 = i3;
                        strM7749 = strM7749;
                        obj = obj;
                    } catch (Throwable th6) {
                        String str2 = strM7749;
                        int iM2768 = (C0619.m2761("ۧۛ") + i11) * 37;
                        i8 = ((iM2768 ^ i12) * 29867) ^ 410126068;
                        c14693 = c14692;
                        th2 = th;
                        map5 = map3;
                        c8004 = c8003;
                        i14 = iM2768 ^ 1471615553;
                        strM7749 = str2;
                        obj = th6;
                        i13 = i8;
                    }
                    break;
                case -1804588259:
                case -1662885821:
                    map = map5;
                    c8002 = c8004;
                    strM2756 = C0619.m2756(f49580, 70, 4, i15);
                    if (zM8176) {
                        iM31610 = C0619.m2761("᩵ۘ") ^ i11;
                        i6 = ((iM31610 ^ i12) * 16525) ^ 1569280234;
                        i9 = -1338095257;
                    } else {
                        iM31610 = (i12 - C0773.m3169("ᩳ۟")) * 7;
                        i6 = ((iM31610 ^ i11) * 17199) ^ (-1889600927);
                        i9 = -463936255;
                    }
                    i7 = iM31610 ^ i9;
                    c8004 = c8002;
                    map4 = map;
                    i14 = i7;
                    i13 = i6;
                    map5 = map4;
                    break;
                case -1798637822:
                case 1020584570:
                    map = map5;
                    c8002 = c8004;
                    try {
                        C1783.m6239(activityC16677).f35994 = z ? 1 : 0;
                        try {
                            C1783.m6239(activityC16677).f35989 = C0619.m2761(C0862.m3500(f49580, 78, 3, i15)) ^ 2128603893;
                            C3779.m12263(activityC16677).f35988 = C20932.m47853(f49580, 81, 6, i15);
                            c14691 = c14693;
                            try {
                                zM35344 = c14691.m35344(C1542.m5471(f49580, 90, 14, i15));
                                zM35345 = c14691.m35344(C0487.m2361(f49580, IShizukuService.Stub.TRANSACTION_updateFlagsForUid, 20, i15));
                                zM35346 = c14691.m35344(C1146.m4222(f49580, 127, 18, i15));
                                arrayList = C1783.m6239(activityC16677).f35997;
                                iM2761 = (C0619.m2761("ۜۛ") ^ i12) * (-109);
                                i = ((iM2761 ^ i11) * 26123) ^ 1530342857;
                                i2 = 551920100;
                                c14693 = c14691;
                                map5 = map;
                                i14 = iM2761 ^ i2;
                                i13 = i;
                                c8004 = c8002;
                            } catch (Throwable th7) {
                                th = th7;
                                th2 = th;
                                c14693 = c14691;
                                map5 = map;
                                c8004 = c8002;
                                str = strM7749;
                                int iM2769 = (C0619.m2761("ۨᩳ") ^ i12) * 89;
                                i14 = iM2769 ^ (-240788614);
                                i13 = ((iM2769 ^ i11) * (-11543)) ^ (-182063598);
                                strM7749 = str;
                                c22941 = c22941;
                                obj = obj;
                            }
                        } catch (Throwable th8) {
                            th = th8;
                            c14691 = c14693;
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        th2 = th;
                        map5 = map;
                        c8004 = c8002;
                        str = strM7749;
                        int iM27610 = (C0619.m2761("ۨᩳ") ^ i12) * 89;
                        i14 = iM27610 ^ (-240788614);
                        i13 = ((iM27610 ^ i11) * (-11543)) ^ (-182063598);
                        strM7749 = str;
                        c22941 = c22941;
                        obj = obj;
                        break;
                    }
                    break;
                case -1780075212:
                case 1987117503:
                    map = map5;
                    strM7741 = C2287.m7741(c8004);
                    zM2359 = C0487.m2359(strM7741, AbstractC3624.m11769(f49580, 287, 2, i15));
                    iM2762 = C0773.m3169("᩹֫") ^ i11;
                    i6 = ((iM2762 ^ i12) * (-22611)) ^ 403783577;
                    i10 = 1123744646;
                    i7 = iM2762 ^ i10;
                    map4 = map;
                    i14 = i7;
                    i13 = i6;
                    map5 = map4;
                    break;
                case -1769951121:
                case -657362273:
                    if (!zM23510) {
                        map = map5;
                        iM2762 = (C0619.m2761("ۗۛ") ^ i11) * (-25);
                        i6 = ((iM2762 ^ i12) * 30421) ^ 908064885;
                        i10 = 275647260;
                        i7 = iM2762 ^ i10;
                        map4 = map;
                        i14 = i7;
                        i13 = i6;
                        map5 = map4;
                    } else {
                        int iM31612 = C0773.m3169("ܽۡ") ^ i11;
                        i8 = ((iM31612 ^ i12) * 26571) ^ 536385579;
                        i14 = iM31612 ^ 183821925;
                        i13 = i8;
                    }
                    break;
                case -1757714053:
                case 899865466:
                    map = map5;
                    if (zM12923) {
                        iM2762 = (C0619.m2761("᩶᩷") ^ i12) * (-31);
                        i6 = ((iM2762 ^ i11) * (-27021)) ^ 1282765948;
                        i10 = 415078266;
                    } else {
                        iM2762 = C0773.m3169("᩻ܰ") ^ i11;
                        i6 = ((iM2762 ^ i12) * (-11665)) ^ 1237943554;
                        i10 = 1650009434;
                    }
                    i7 = iM2762 ^ i10;
                    map4 = map;
                    i14 = i7;
                    i13 = i6;
                    map5 = map4;
                    break;
                case -1701574479:
                case -1006095248:
                    try {
                        ActivityC16677.m39398(map5, c8004, z);
                        map = map5;
                        iM2762 = (C0619.m2761("ۗۛ") ^ i11) * (-25);
                        i6 = ((iM2762 ^ i12) * 30421) ^ 908064885;
                        i10 = 275647260;
                        i7 = iM2762 ^ i10;
                        map4 = map;
                        i14 = i7;
                        i13 = i6;
                        map5 = map4;
                    } catch (Throwable th10) {
                        th2 = th10;
                        c22941 = c22941;
                        str = strM7749;
                        int iM27611 = (C0619.m2761("ۨᩳ") ^ i12) * 89;
                        i14 = iM27611 ^ (-240788614);
                        i13 = ((iM27611 ^ i11) * (-11543)) ^ (-182063598);
                        strM7749 = str;
                        c22941 = c22941;
                        obj = obj;
                    }
                    break;
                case -1688588442:
                case 520221566:
                    map = map5;
                    c8002 = c8004;
                    StringBuilder sb = new StringBuilder(strM7749);
                    C1783.m6234(sb, strM35343);
                    throw new C3090(C2023.m6952(sb));
                case -1659175182:
                case 1301650373:
                    throw th2;
                case -1537019657:
                case 1508158044:
                    i15 = 62846;
                    iM3169 = C0619.m2761("ܳܳ") ^ i12;
                    i3 = ((iM3169 ^ i11) * (-16145)) ^ 37218938;
                    i4 = 1434944171;
                    i5 = iM3169 ^ i4;
                    map5 = map5;
                    c8004 = c8004;
                    c22941 = c22941;
                    th2 = th2;
                    i14 = i5;
                    i13 = i3;
                    strM7749 = strM7749;
                    obj = obj;
                    break;
                case -1508097477:
                case 1461229710:
                    map = map5;
                    c8002 = c8004;
                    c14691 = c14693;
                    zM8176 = C2419.m8175(C3779.m12266(f49580, 66, 4, i15), strM35343);
                    iM2761 = C0619.m2761("᩸۠") ^ i11;
                    i = ((iM2761 ^ i12) * (-3965)) ^ 1696790440;
                    i2 = 68360677;
                    c14693 = c14691;
                    map5 = map;
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    c8004 = c8002;
                    break;
                case -1501014314:
                case 263363753:
                    ActivityC16677.m39398(map5, c8004, z2);
                    map = map5;
                    iM2762 = (C0619.m2761("ۗۛ") ^ i11) * (-25);
                    i6 = ((iM2762 ^ i12) * 30421) ^ 908064885;
                    i10 = 275647260;
                    i7 = iM2762 ^ i10;
                    map4 = map;
                    i14 = i7;
                    i13 = i6;
                    map5 = map4;
                    break;
                case -1496429232:
                case 63547982:
                    i15 = 37676;
                    iM3169 = C0619.m2761("ܳܳ") ^ i12;
                    i3 = ((iM3169 ^ i11) * (-16145)) ^ 37218938;
                    i4 = 1434944171;
                    i5 = iM3169 ^ i4;
                    map5 = map5;
                    c8004 = c8004;
                    c22941 = c22941;
                    th2 = th2;
                    i14 = i5;
                    i13 = i3;
                    strM7749 = strM7749;
                    obj = obj;
                    break;
                case -1434660456:
                case -1252890905:
                    map = map5;
                    if (zM35346) {
                        iM2762 = (i11 - C0773.m3169("᩹ۘ")) * (-59);
                        i6 = ((iM2762 ^ i12) * 22095) ^ 766495370;
                        i10 = 863443584;
                    } else {
                        iM2762 = C0619.m2761("᩶ۖ") ^ i12;
                        i6 = ((iM2762 ^ i11) * 19733) ^ 998514184;
                        i10 = 1502550425;
                    }
                    i7 = iM2762 ^ i10;
                    map4 = map;
                    i14 = i7;
                    i13 = i6;
                    map5 = map4;
                    break;
                case -1238517316:
                case -231075617:
                    C3033.m9861(c22941);
                    C3779.m12263(activityC16677).f35993 = z2;
                    return;
                case -1237261027:
                case -1168423071:
                    map = map5;
                    strM7749 = C2287.m7749(f49580, 5, 35, i15);
                    activityC16677 = this.f49581;
                    c22941 = new C22941(activityC16677.f53870);
                    int iM27612 = (i11 - C0619.m2761("᩹ۗ")) * 61;
                    i6 = ((iM27612 ^ i12) * (-23911)) ^ (-2113907497);
                    i7 = iM27612 ^ 2049339434;
                    obj = obj;
                    c8004 = c8004;
                    th2 = th2;
                    map4 = map;
                    i14 = i7;
                    i13 = i6;
                    map5 = map4;
                    break;
                case -1236270829:
                case 2131043897:
                    map = map5;
                    activityC16677.runOnUiThread(new Runnable() { // from class: l.ۤ۟֫

                        /* JADX INFO: renamed from: ᩺᩻ۡ, reason: not valid java name and contains not printable characters */
                        private static final short[] f34007 = {5558, -13140, 13210, 8944};

                        /* JADX WARN: Code duplicated, block: B:52:0x01a2 A[PHI: r2 r8 r9
                          0x01a2: PHI (r2v5 int) = (r2v2 int), (r2v4 int), (r2v2 int), (r2v2 int), (r2v2 int) binds: [B:51:0x01a0, B:23:0x009b, B:15:0x007d, B:12:0x0077, B:9:0x006c] A[DONT_GENERATE, DONT_INLINE]
                          0x01a2: PHI (r8v4 int) = (r8v3 int), (r8v2 int), (r8v2 int), (r8v2 int), (r8v2 int) binds: [B:51:0x01a0, B:23:0x009b, B:15:0x007d, B:12:0x0077, B:9:0x006c] A[DONT_GENERATE, DONT_INLINE]
                          0x01a2: PHI (r9v4 int) = (r9v3 int), (r9v2 int), (r9v2 int), (r9v2 int), (r9v2 int) binds: [B:51:0x01a0, B:23:0x009b, B:15:0x007d, B:12:0x0077, B:9:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:56:0x01d8 A[PHI: r6 r7 r10
                          0x01d8: PHI (r6v4 short) = (r6v3 short), (r6v2 short), (r6v2 short), (r6v2 short) binds: [B:55:0x01d6, B:47:0x017f, B:17:0x0081, B:15:0x007d] A[DONT_GENERATE, DONT_INLINE]
                          0x01d8: PHI (r7v4 short) = (r7v3 short), (r7v2 short), (r7v2 short), (r7v2 short) binds: [B:55:0x01d6, B:47:0x017f, B:17:0x0081, B:15:0x007d] A[DONT_GENERATE, DONT_INLINE]
                          0x01d8: PHI (r10v4 int) = (r10v2 int), (r10v3 int), (r10v2 int), (r10v2 int) binds: [B:55:0x01d6, B:47:0x017f, B:17:0x0081, B:15:0x007d] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:60:0x020b A[PHI: r1 r5 r12 r13
                          0x020b: PHI (r1v4 l.ܺ۟֫) = (r1v2 l.ܺ۟֫), (r1v2 l.ܺ۟֫), (r1v2 l.ܺ۟֫), (r1v2 l.ܺ۟֫), (r1v7 l.ܺ۟֫) binds: [B:59:0x0209, B:32:0x00e9, B:28:0x00cc, B:9:0x006c, B:70:0x020b] A[DONT_GENERATE, DONT_INLINE]
                          0x020b: PHI (r5v5 char) = (r5v3 char), (r5v2 char), (r5v2 char), (r5v2 char), (r5v2 char) binds: [B:59:0x0209, B:32:0x00e9, B:28:0x00cc, B:9:0x006c, B:70:0x020b] A[DONT_GENERATE, DONT_INLINE]
                          0x020b: PHI (r12v5 short[]) = (r12v2 short[]), (r12v3 short[]), (r12v2 short[]), (r12v2 short[]), (r12v2 short[]) binds: [B:59:0x0209, B:32:0x00e9, B:28:0x00cc, B:9:0x006c, B:70:0x020b] A[DONT_GENERATE, DONT_INLINE]
                          0x020b: PHI (r13v5 int) = (r13v2 int), (r13v2 int), (r13v3 int), (r13v2 int), (r13v2 int) binds: [B:59:0x0209, B:32:0x00e9, B:28:0x00cc, B:9:0x006c, B:70:0x020b] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:64:0x0239 A[PHI: r18
                          0x0239: PHI (r18v5 short[]) = (r18v4 short[]), (r18v3 short[]) binds: [B:63:0x0237, B:12:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
                        @Override // java.lang.Runnable
                        public final void run() {
                            int iM31613;
                            int i17;
                            int i18;
                            int i19 = C0950.f3488;
                            int i20 = C3779.f12953;
                            int iM31614 = (C0773.m3169("ܿۗ") + i19) * 81;
                            int i21 = ((iM31614 ^ i20) * 1603) ^ (-263214764);
                            short[] sArr = null;
                            short[] sArr2 = null;
                            int i22 = iM31614 ^ (-1926199780);
                            ActivityC16677 activityC16678 = null;
                            char c = 0;
                            short s = 0;
                            short s2 = 0;
                            int i23 = 0;
                            int i24 = 0;
                            int i25 = 0;
                            int i26 = 0;
                            int i27 = 0;
                            int i28 = 1240307848;
                            String strM7761 = null;
                            int iM31615 = 0;
                            while (true) {
                                i28 = i22 ^ (i21 & (((i28 ^ i20) * 31773) >> 31));
                                switch (i28) {
                                    case -2103064338:
                                    case 777786747:
                                        if (AbstractC0116.f1064 <= 0) {
                                            iM31613 = (C0619.m2761("᩸۟") ^ i19) * (-11);
                                            i17 = ((iM31613 ^ i20) * 15591) ^ (-1931695995);
                                            i18 = 1135487687;
                                        } else {
                                            iM31613 = C0619.m2761("᩹ܺ") ^ i20;
                                            i17 = ((iM31613 ^ i19) * (-3825)) ^ 1148357571;
                                            i18 = 1480637526;
                                        }
                                        i22 = iM31613 ^ i18;
                                        i21 = i17;
                                        break;
                                    case -1980201666:
                                    case -1349946766:
                                        c = 0;
                                        if (C2485.f7950 != 0) {
                                            iM31613 = C0773.m3169("᩻ۘ") ^ i19;
                                            i17 = ((iM31613 ^ i20) * 15899) ^ (-1541519298);
                                            i18 = 2057387896;
                                        } else {
                                            iM31613 = C0773.m3169("ܰܿ") ^ i20;
                                            i17 = ((iM31613 ^ i19) * (-4921)) ^ 652483032;
                                            i18 = 1865558104;
                                        }
                                        i22 = iM31613 ^ i18;
                                        i21 = i17;
                                        break;
                                    case -1926772203:
                                    case 1364252684:
                                        if (C2288.f7433 > 0) {
                                            iM31613 = C0619.m2761("᩹ܺ") ^ i20;
                                            i17 = ((iM31613 ^ i19) * (-3825)) ^ 1148357571;
                                            i18 = 1480637526;
                                        } else {
                                            iM31613 = C0773.m3169("᩻ۘ") ^ i19;
                                            i17 = ((iM31613 ^ i20) * 15899) ^ (-1541519298);
                                            i18 = 2057387896;
                                        }
                                        i22 = iM31613 ^ i18;
                                        i21 = i17;
                                        break;
                                    case -1819622936:
                                    case -1505373000:
                                        i23 = s * s2;
                                        i24 = s * s;
                                        if (C3033.f9831 >= 0) {
                                            iM31613 = C0619.m2761("᩹ܺ") ^ i20;
                                            i17 = ((iM31613 ^ i19) * (-3825)) ^ 1148357571;
                                            i18 = 1480637526;
                                        } else {
                                            iM31613 = (C0773.m3169("ܳ᩹") ^ i19) * 99;
                                            i17 = ((iM31613 ^ i20) * (-19917)) ^ 991194737;
                                            i18 = -517806109;
                                        }
                                        i22 = iM31613 ^ i18;
                                        i21 = i17;
                                        break;
                                    case -1796291139:
                                    case 146820724:
                                        i25 = 55160329;
                                        if (C3448.f11240 >= 0) {
                                            iM31613 = (C0619.m2761("᩸۟") ^ i19) * (-11);
                                            i17 = ((iM31613 ^ i20) * 15591) ^ (-1931695995);
                                            i18 = 1135487687;
                                        } else {
                                            iM31613 = (i20 - C0619.m2761("ۚܳ")) * 115;
                                            i17 = ((iM31613 ^ i19) * 15561) ^ (-281714400);
                                            i18 = 1851483032;
                                        }
                                        i22 = iM31613 ^ i18;
                                        i21 = i17;
                                        break;
                                    case -1203830295:
                                    case -145827993:
                                        i26 = 19958;
                                        iM31613 = C0619.m2761("ۢܰ") ^ i19;
                                        i17 = ((iM31613 ^ i20) * 15071) ^ (-807446731);
                                        i18 = -979171917;
                                        i22 = iM31613 ^ i18;
                                        i21 = i17;
                                        break;
                                    case -1099045558:
                                    case -309751063:
                                        C0269.m1775();
                                        if (C2878.m9491() <= 0) {
                                            iM31613 = C0619.m2761("᩹ܺ") ^ i20;
                                            i17 = ((iM31613 ^ i19) * (-3825)) ^ 1148357571;
                                            i18 = 1480637526;
                                        } else {
                                            iM31613 = (C0773.m3169("ۨ᩸") + i19) * (-99);
                                            i17 = ((iM31613 ^ i20) * 19669) ^ 2003162135;
                                            i18 = -1482952649;
                                        }
                                        i22 = iM31613 ^ i18;
                                        i21 = i17;
                                        break;
                                    case -1051324897:
                                    case 401916540:
                                        if ((i24 + i25) - i23 >= 0) {
                                            iM31613 = (i19 - C0773.m3169("ܰۧ")) * 67;
                                            i17 = ((iM31613 ^ i20) * (-24621)) ^ (-518635067);
                                            i18 = 1734539768;
                                        } else {
                                            iM31613 = (i20 - C0773.m3169("֡۬")) * (-17);
                                            i17 = ((iM31613 ^ i19) * (-25377)) ^ 649971975;
                                            i18 = 89022911;
                                        }
                                        i22 = iM31613 ^ i18;
                                        i21 = i17;
                                        break;
                                    case -1024547072:
                                    case 1671606002:
                                        C3448.m11248();
                                        break;
                                    case -587601623:
                                    case 864650402:
                                        C2878.m9476(activityC16678, iM31615);
                                        activityC16678.invalidateOptionsMenu();
                                        break;
                                    case -163003814:
                                    case 1478706936:
                                        sArr = f34007;
                                        if (C3779.f12953 <= 0) {
                                            iM31613 = (C0773.m3169("ۨ᩸") + i19) * (-99);
                                            i17 = ((iM31613 ^ i20) * 19669) ^ 2003162135;
                                            i18 = -1482952649;
                                        } else {
                                            iM31613 = (C0773.m3169("᩸᩸") ^ i19) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                                            i17 = ((iM31613 ^ i20) * 29211) ^ (-1555367958);
                                            i18 = -1477820326;
                                        }
                                        i22 = iM31613 ^ i18;
                                        i21 = i17;
                                        break;
                                    case -72683273:
                                    case 1910234753:
                                        C3033.m9845();
                                        iM31613 = (C0619.m2761("᩸۟") ^ i19) * (-11);
                                        i17 = ((iM31613 ^ i20) * 15591) ^ (-1931695995);
                                        i18 = 1135487687;
                                        i22 = iM31613 ^ i18;
                                        i21 = i17;
                                        break;
                                    case 166701361:
                                    case 238982306:
                                        sArr2 = f34007;
                                        if (C2354.f7599 >= 0) {
                                            iM31613 = C0773.m3169("᩻ۘ") ^ i19;
                                            i17 = ((iM31613 ^ i20) * 15899) ^ (-1541519298);
                                            i18 = 2057387896;
                                        } else {
                                            iM31613 = C0773.m3169("᩶ܽ") ^ i19;
                                            i17 = ((iM31613 ^ i20) * (-13275)) ^ (-889231587);
                                            i18 = -288091876;
                                        }
                                        i22 = iM31613 ^ i18;
                                        i21 = i17;
                                        break;
                                    case 711052919:
                                    case 1558671398:
                                        iM31615 = 2129089157 ^ C0773.m3169(strM7761);
                                        if (C3077.f9998) {
                                            iM31613 = C0773.m3169("ۛܰ") ^ i20;
                                            i17 = ((iM31613 ^ i19) * (-6223)) ^ (-1279502220);
                                            i18 = 437323297;
                                        } else {
                                            iM31613 = C0619.m2761("᩹ܺ") ^ i20;
                                            i17 = ((iM31613 ^ i19) * (-3825)) ^ 1148357571;
                                            i18 = 1480637526;
                                        }
                                        i22 = iM31613 ^ i18;
                                        i21 = i17;
                                        break;
                                    case 758812104:
                                    case 1384664849:
                                        activityC16678 = this.f34008.f49581;
                                        if (C1321.f4751 >= 0) {
                                            iM31613 = C0773.m3169("᩻ۘ") ^ i19;
                                            i17 = ((iM31613 ^ i20) * 15899) ^ (-1541519298);
                                            i18 = 2057387896;
                                            i22 = iM31613 ^ i18;
                                            i21 = i17;
                                        } else {
                                            int iM31616 = (C0773.m3169("ܶ᩸") ^ i20) * (-93);
                                            i21 = ((iM31616 ^ i19) * (-10009)) ^ 571979459;
                                            i22 = iM31616 ^ (-362602707);
                                        }
                                        break;
                                    case 786476315:
                                    case 2046606519:
                                        i27 = 1;
                                        if (C0773.f2792 <= 0) {
                                            iM31613 = C0773.m3169("᩻ۘ") ^ i19;
                                            i17 = ((iM31613 ^ i20) * 15899) ^ (-1541519298);
                                            i18 = 2057387896;
                                        } else {
                                            iM31613 = C0619.m2761("᩹᩵") ^ i20;
                                            i17 = ((iM31613 ^ i19) * (-21013)) ^ (-995485643);
                                            i18 = -2128472943;
                                        }
                                        i22 = iM31613 ^ i18;
                                        i21 = i17;
                                        break;
                                    case 966819386:
                                    case 1750159626:
                                        i26 = 24066;
                                        iM31613 = C0619.m2761("ۢܰ") ^ i19;
                                        i17 = ((iM31613 ^ i20) * 15071) ^ (-807446731);
                                        i18 = -979171917;
                                        i22 = iM31613 ^ i18;
                                        i21 = i17;
                                        break;
                                    case 1185584993:
                                    case 1581368810:
                                        s = sArr[c];
                                        s2 = 14854;
                                        if (AbstractC3624.m11755() != 0) {
                                            iM31613 = (C0619.m2761("᩸۟") ^ i19) * (-11);
                                            i17 = ((iM31613 ^ i20) * 15591) ^ (-1931695995);
                                            i18 = 1135487687;
                                        } else {
                                            iM31613 = (i20 - C0619.m2761("᩻᩷")) * 5;
                                            i17 = ((iM31613 ^ i19) * (-21953)) ^ 1181177154;
                                            i18 = 1772938746;
                                        }
                                        i22 = iM31613 ^ i18;
                                        i21 = i17;
                                        break;
                                    default:
                                        strM7761 = C2288.m7761(sArr2, i27, 3, i26);
                                        if (C0862.f3233 != 0) {
                                            iM31613 = (C0619.m2761("᩺ۙ") + i20) * 31;
                                            i17 = ((iM31613 ^ i19) * 14403) ^ 143212;
                                            i18 = 1485299143;
                                        } else {
                                            iM31613 = C0773.m3169("ۢۢ") ^ i19;
                                            i17 = ((iM31613 ^ i20) * 30267) ^ 146165743;
                                            i18 = -875808182;
                                        }
                                        i22 = iM31613 ^ i18;
                                        i21 = i17;
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    c8002 = c8004;
                    iM31610 = (C0773.m3169("۟ۜ") ^ i12) * (-3);
                    i6 = ((iM31610 ^ i11) * (-3593)) ^ 1443579793;
                    i9 = 1357548714;
                    i7 = iM31610 ^ i9;
                    c8004 = c8002;
                    map4 = map;
                    i14 = i7;
                    i13 = i6;
                    map5 = map4;
                    break;
                case -1111548905:
                case 1843722771:
                    map = map5;
                    if (zM35345) {
                        iM2762 = C0619.m2761("᩺᩷") ^ i11;
                        i6 = ((iM2762 ^ i12) * (-16499)) ^ 1976288576;
                        i10 = -594957915;
                    } else {
                        iM2762 = C0773.m3169("ۘ۠") ^ i12;
                        i6 = ((iM2762 ^ i11) * 9385) ^ (-91687555);
                        i10 = 1519296069;
                    }
                    i7 = iM2762 ^ i10;
                    map4 = map;
                    i14 = i7;
                    i13 = i6;
                    map5 = map4;
                    break;
                case -761673660:
                case 769726869:
                    map = map5;
                    if (zM2359) {
                        iM2762 = C0773.m3169("᩹᩷") ^ i11;
                        i6 = ((iM2762 ^ i12) * (-25417)) ^ 662042307;
                        i10 = -1613637081;
                    } else {
                        iM2762 = (i12 - C0619.m2761("ۗ֫")) * (-9);
                        i6 = ((iM2762 ^ i11) * 13333) ^ (-1946456450);
                        i10 = -614144677;
                    }
                    i7 = iM2762 ^ i10;
                    map4 = map;
                    i14 = i7;
                    i13 = i6;
                    map5 = map4;
                    break;
                case -654450629:
                case -152743248:
                    map = map5;
                    zM12923 = C3998.m12923(itM53426);
                    iM2762 = (C0619.m2761("ۜۙ") + i11) * (-57);
                    i6 = ((iM2762 ^ i12) * 25979) ^ 229198090;
                    i10 = 1297508704;
                    i7 = iM2762 ^ i10;
                    map4 = map;
                    i14 = i7;
                    i13 = i6;
                    map5 = map4;
                    break;
                case -516110000:
                case 556342554:
                    c22941 = c22941;
                    map5 = map5;
                    c8004 = c8004;
                    obj = obj;
                    th2 = th2;
                    strM7749 = strM7749;
                    short s = f49580[4];
                    int i17 = s + 1;
                    if ((i17 * i17) - ((s * 2) + 1) < 0) {
                        iM3169 = (C0773.m3169("᩶֫") + i11) * 73;
                        i3 = ((iM3169 ^ i12) * (-27443)) ^ 2135977157;
                        i4 = -1971319363;
                    } else {
                        iM3169 = (i12 - C0773.m3169("᩺֨")) * (-51);
                        i3 = ((iM3169 ^ i11) * (-21765)) ^ (-1938101665);
                        i4 = 1848451920;
                    }
                    i5 = iM3169 ^ i4;
                    map5 = map5;
                    c8004 = c8004;
                    c22941 = c22941;
                    th2 = th2;
                    i14 = i5;
                    i13 = i3;
                    strM7749 = strM7749;
                    obj = obj;
                    break;
                case -429429596:
                case 821774533:
                    map = map5;
                    if (zM3494) {
                        iM2762 = (C0619.m2761("ۗۛ") ^ i11) * (-25);
                        i6 = ((iM2762 ^ i12) * 30421) ^ 908064885;
                        i10 = 275647260;
                    } else {
                        iM2762 = C0619.m2761("᩵֨") ^ i12;
                        i6 = ((iM2762 ^ i11) * (-18181)) ^ 1630128632;
                        i10 = -1716642874;
                    }
                    i7 = iM2762 ^ i10;
                    map4 = map;
                    i14 = i7;
                    i13 = i6;
                    map5 = map4;
                    break;
                case -378301635:
                case 1619237425:
                    map = map5;
                    itM53426 = C23916.m53426(C2023.m6951(c22941));
                    iM2762 = (C0619.m2761("ۗۛ") ^ i11) * (-25);
                    i6 = ((iM2762 ^ i12) * 30421) ^ 908064885;
                    i10 = 275647260;
                    i7 = iM2762 ^ i10;
                    map4 = map;
                    i14 = i7;
                    i13 = i6;
                    map5 = map4;
                    break;
                case -362967325:
                case 901477763:
                    map = map5;
                    C1519.m5406(arrayList, C2354.m7980(f49580, 145, 21, i15));
                    iM2762 = C0619.m2761("ܳ᩻") ^ i11;
                    i6 = ((iM2762 ^ i12) * 26133) ^ 1720869118;
                    i10 = -41678293;
                    i7 = iM2762 ^ i10;
                    map4 = map;
                    i14 = i7;
                    i13 = i6;
                    map5 = map4;
                    break;
                case -347318415:
                case -96845396:
                    map = map5;
                    C8002 c8005 = (C8002) C0950.m3796(itM53426);
                    try {
                        zM3494 = C0862.m3494(c8005);
                        int iM27613 = C0619.m2761("ۚۨ") ^ i11;
                        map4 = map;
                        i14 = iM27613 ^ 1980219002;
                        i13 = ((iM27613 ^ i12) * 32595) ^ (-258543363);
                        c8004 = c8005;
                        map5 = map4;
                    } catch (Throwable th11) {
                        th2 = th11;
                        c8004 = c8005;
                        map5 = map;
                        str = strM7749;
                        int iM27614 = (C0619.m2761("ۨᩳ") ^ i12) * 89;
                        i14 = iM27614 ^ (-240788614);
                        i13 = ((iM27614 ^ i11) * (-11543)) ^ (-182063598);
                        strM7749 = str;
                        c22941 = c22941;
                        obj = obj;
                    }
                    break;
                case -119042313:
                case -32527189:
                    map = map5;
                    if (zM35344) {
                        iM2762 = C0619.m2761("֫᩹") ^ i12;
                        i6 = ((iM2762 ^ i11) * 7193) ^ (-32314732);
                        i10 = -630744057;
                    } else {
                        iM2762 = C0619.m2761("ܳ᩻") ^ i11;
                        i6 = ((iM2762 ^ i12) * 26133) ^ 1720869118;
                        i10 = -41678293;
                    }
                    i7 = iM2762 ^ i10;
                    map4 = map;
                    i14 = i7;
                    i13 = i6;
                    map5 = map4;
                    break;
                case -85788781:
                case 1290465032:
                    map = map5;
                    C1519.m5406(arrayList, C1783.m6233(f49580, 166, 12, i15));
                    iM2762 = C0773.m3169("ۘ۠") ^ i12;
                    i6 = ((iM2762 ^ i11) * 9385) ^ (-91687555);
                    i10 = 1519296069;
                    i7 = iM2762 ^ i10;
                    map4 = map;
                    i14 = i7;
                    i13 = i6;
                    map5 = map4;
                    break;
                case -16750505:
                case 473655904:
                    HashMap map6 = map5;
                    C8002 c8006 = c8004;
                    obj = obj;
                    Throwable th12 = th2;
                    C14691 c14694 = c14693;
                    str = strM7749;
                    try {
                        HashMap map7 = C1783.m6239(activityC16677).f35987;
                        try {
                            map7.clear();
                            map2 = map7;
                            c14693 = c14694;
                            try {
                                C14691 c14691M30925 = AbstractC12454.m30925(new String(C4238.m13532(c22941, c22941.m51724(RunnableC3055.m9937(f49580, 40, 9, i15)), null), Charset.defaultCharset()));
                                try {
                                    c22941 = c22941;
                                    try {
                                        strM35343 = c14691M30925.m35343(RunnableC1848.m6366(f49580, 49, 4, i15));
                                        C3779.m12263(activityC16677).m28817(c14691M30925.m35343(C0773.m3166(f49580, 53, 5, i15)), c14691M30925.m35343(AbstractC0641.m2820(f49580, 58, 5, i15)));
                                        zM8175 = C2419.m8175(C2287.m7749(f49580, 63, 3, i15), strM35343);
                                        int iM31613 = C0773.m3169("᩻ܺ") ^ i11;
                                        i14 = iM31613 ^ (-373971485);
                                        c14693 = c14691M30925;
                                        i13 = ((iM31613 ^ i12) * 29413) ^ (-129815768);
                                        strM7749 = str;
                                        map5 = map2;
                                        c8004 = c8006;
                                        c22941 = c22941;
                                        th2 = th12;
                                    } catch (Throwable th13) {
                                        th = th13;
                                        c14693 = c14691M30925;
                                        map5 = map2;
                                        c8004 = c8006;
                                        th2 = th;
                                        int iM27615 = (C0619.m2761("ۨᩳ") ^ i12) * 89;
                                        i14 = iM27615 ^ (-240788614);
                                        i13 = ((iM27615 ^ i11) * (-11543)) ^ (-182063598);
                                        strM7749 = str;
                                        c22941 = c22941;
                                    }
                                } catch (Throwable th14) {
                                    th = th14;
                                    c22941 = c22941;
                                }
                            } catch (Throwable th15) {
                                th = th15;
                                c22941 = c22941;
                            }
                        } catch (Throwable th16) {
                            th = th16;
                            map2 = map7;
                            c22941 = c22941;
                            c14693 = c14694;
                        }
                    } catch (Throwable th17) {
                        c22941 = c22941;
                        c14693 = c14694;
                        th2 = th17;
                        map5 = map6;
                        c8004 = c8006;
                    }
                    obj = obj;
                    break;
                case 542997492:
                case 1566480251:
                    map = map5;
                    c8002 = c8004;
                    C3779.m12263(activityC16677).f35994 = z2 ? 1 : 0;
                    C3779.m12263(activityC16677).f35989 = C0619.m2761(C2834.m9343(f49580, 87, 3, i15)) ^ 2099672463;
                    C1783.m6239(activityC16677).f35988 = strM2756;
                    activityC16677.runOnUiThread(new Runnable() { // from class: l.᩸۟֫

                        /* JADX INFO: renamed from: ۢۧۤ, reason: not valid java name and contains not printable characters */
                        private static final short[] f73553 = {9660, 25140, -26986, 19104};

                        /* JADX WARN: Code duplicated, block: B:58:0x01f8 A[PHI: r6 r7 r8 r16
                          0x01f8: PHI (r6v4 short) = (r6v3 short), (r6v2 short), (r6v2 short) binds: [B:57:0x01f6, B:53:0x01d4, B:8:0x0053] A[DONT_GENERATE, DONT_INLINE]
                          0x01f8: PHI (r7v4 short) = (r7v3 short), (r7v2 short), (r7v2 short) binds: [B:57:0x01f6, B:53:0x01d4, B:8:0x0053] A[DONT_GENERATE, DONT_INLINE]
                          0x01f8: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int) binds: [B:57:0x01f6, B:53:0x01d4, B:8:0x0053] A[DONT_GENERATE, DONT_INLINE]
                          0x01f8: PHI (r16v15 l.ܺ۟֫) = (r16v4 l.ܺ۟֫), (r16v5 l.ܺ۟֫), (r16v16 l.ܺ۟֫) binds: [B:57:0x01f6, B:53:0x01d4, B:8:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:62:0x0228 A[PHI: r5 r9 r12 r16
                          0x0228: PHI (r5v5 char) = (r5v3 char), (r5v2 char), (r5v2 char), (r5v2 char) binds: [B:61:0x0226, B:49:0x01b3, B:31:0x00e4, B:12:0x005f] A[DONT_GENERATE, DONT_INLINE]
                          0x0228: PHI (r9v5 short) = (r9v2 short), (r9v3 short), (r9v2 short), (r9v2 short) binds: [B:61:0x0226, B:49:0x01b3, B:31:0x00e4, B:12:0x005f] A[DONT_GENERATE, DONT_INLINE]
                          0x0228: PHI (r12v5 int) = (r12v2 int), (r12v2 int), (r12v3 int), (r12v2 int) binds: [B:61:0x0226, B:49:0x01b3, B:31:0x00e4, B:12:0x005f] A[DONT_GENERATE, DONT_INLINE]
                          0x0228: PHI (r16v23 l.ܺ۟֫) = (r16v3 l.ܺ۟֫), (r16v6 l.ܺ۟֫), (r16v10 l.ܺ۟֫), (r16v24 l.ܺ۟֫) binds: [B:61:0x0226, B:49:0x01b3, B:31:0x00e4, B:12:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:66:0x025d A[PHI: r2 r4 r11 r16
                          0x025d: PHI (r2v5 int) = (r2v2 int), (r2v2 int), (r2v6 int) binds: [B:65:0x025b, B:35:0x0107, B:9:0x0057] A[DONT_GENERATE, DONT_INLINE]
                          0x025d: PHI (r4v4 short[]) = (r4v3 short[]), (r4v2 short[]), (r4v2 short[]) binds: [B:65:0x025b, B:35:0x0107, B:9:0x0057] A[DONT_GENERATE, DONT_INLINE]
                          0x025d: PHI (r11v4 short[]) = (r11v2 short[]), (r11v3 short[]), (r11v2 short[]) binds: [B:65:0x025b, B:35:0x0107, B:9:0x0057] A[DONT_GENERATE, DONT_INLINE]
                          0x025d: PHI (r16v13 l.ܺ۟֫) = (r16v2 l.ܺ۟֫), (r16v9 l.ܺ۟֫), (r16v14 l.ܺ۟֫) binds: [B:65:0x025b, B:35:0x0107, B:9:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
                        
                            if (l.C23916.m53419() == 0) goto L8;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:7:0x0051, code lost:
                        
                            if (l.C0773.m3161() != 0) goto L8;
                         */
                        @Override // java.lang.Runnable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void run() {
                            /*
                                Method dump skipped, instruction units count: 806
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: l.RunnableC22645.run():void");
                        }
                    });
                    iM31610 = (C0773.m3169("۟ۜ") ^ i12) * (-3);
                    i6 = ((iM31610 ^ i11) * (-3593)) ^ 1443579793;
                    i9 = 1357548714;
                    i7 = iM31610 ^ i9;
                    c8004 = c8002;
                    map4 = map;
                    i14 = i7;
                    i13 = i6;
                    map5 = map4;
                    break;
                case 954292140:
                case 1790360339:
                    map = map5;
                    c8002 = c8004;
                    zM11490 = C3492.m11490(C0487.m2361(f49580, 74, 4, i15), strM35343);
                    iM31610 = C0619.m2761("ۜᩳ") ^ i12;
                    i6 = ((iM31610 ^ i11) * (-8733)) ^ 1631263606;
                    i9 = -1649057311;
                    i7 = iM31610 ^ i9;
                    c8004 = c8002;
                    map4 = map;
                    i14 = i7;
                    i13 = i6;
                    map5 = map4;
                    break;
                case 1244562177:
                case 1994776301:
                    try {
                        map = map5;
                        try {
                            zM23510 = C0487.m2359(strM7741, C3099.m10092(f49580, 310, 2, i15));
                            iM2762 = C0619.m2761("ۚ᩺") ^ i12;
                            i6 = ((iM2762 ^ i11) * (-17455)) ^ 643576074;
                            i10 = 923647957;
                            i7 = iM2762 ^ i10;
                            map4 = map;
                            i14 = i7;
                            i13 = i6;
                            map5 = map4;
                        } catch (Throwable th18) {
                            th = th18;
                            th2 = th;
                            map5 = map;
                            str = strM7749;
                            int iM27616 = (C0619.m2761("ۨᩳ") ^ i12) * 89;
                            i14 = iM27616 ^ (-240788614);
                            i13 = ((iM27616 ^ i11) * (-11543)) ^ (-182063598);
                            strM7749 = str;
                            c22941 = c22941;
                            obj = obj;
                        }
                    } catch (Throwable th19) {
                        th = th19;
                        map = map5;
                    }
                    break;
                case 1715411405:
                case 1919528284:
                    map = map5;
                    c8002 = c8004;
                    if (zM11490) {
                        iM31610 = (i11 - C0619.m2761("᩸ᩴ")) * 127;
                        i6 = ((iM31610 ^ i12) * (-16291)) ^ 1363857678;
                        i9 = 334811096;
                    } else {
                        iM31610 = (C0773.m3169("ۧۧ") ^ i12) * (-25);
                        i6 = ((iM31610 ^ i11) * (-28551)) ^ 298007742;
                        i9 = -1939152200;
                    }
                    i7 = iM31610 ^ i9;
                    c8004 = c8002;
                    map4 = map;
                    i14 = i7;
                    i13 = i6;
                    map5 = map4;
                    break;
                default:
                    map = map5;
                    c8002 = c8004;
                    c14691 = c14693;
                    z = false;
                    z = false;
                    z2 = true;
                    z2 = true;
                    if (zM8175) {
                        iM2761 = (C0619.m2761("ܿۢ") + i12) * 3;
                        i = ((iM2761 ^ i11) * 13473) ^ 646641423;
                        i2 = 1532876421;
                    } else {
                        iM2761 = C0619.m2761("ۚ۬") ^ i11;
                        i = ((iM2761 ^ i12) * (-10457)) ^ (-1038367635);
                        i2 = 914133241;
                    }
                    c14693 = c14691;
                    map5 = map;
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    c8004 = c8002;
                    break;
            }
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        C20932.m47845(this);
    }
}
