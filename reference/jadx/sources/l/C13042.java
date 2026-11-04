package l;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import com.alipay.sdk.m.y.q;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.nio.charset.StandardCharsets;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.۫ۤۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 650G */
/* JADX INFO: loaded from: classes4.dex */
public final class C13042 {

    /* JADX INFO: renamed from: ۨ۟ۗ, reason: not valid java name and contains not printable characters */
    private static final short[] f41737 = {3434, -9621, -9619, -9608, -9617, -9617, -9625, -9617, -9628, -9602, -9692, -9602, -9614, -9602, -9669, -9669, -9669, -9728, -5606, -28864, 1200, -27945, 21499, 25457, 23503, -25166, -30012, 30708, 31248, -27352, -27694, 31875, 24701, 32276, 9001, 32723, 28291, -18496, 27104, -18484, 26432, -32194, 29001, -24472};

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static WeakReference f41738;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public SpannableStringBuilder f41739;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f41740;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC17204 f41741;

    /* JADX WARN: Code duplicated, block: B:69:0x0313 A[PHI: r2 r5 r32 r33
      0x0313: PHI (r2v30 l.ۖۖۧ) = (r2v1 l.ۖۖۧ), (r2v29 l.ۖۖۧ), (r2v1 l.ۖۖۧ) binds: [B:104:0x0313, B:68:0x0311, B:48:0x021a] A[DONT_GENERATE, DONT_INLINE]
      0x0313: PHI (r5v2 l.ᩴۤۧ) = (r5v1 l.ᩴۤۧ), (r5v1 l.ᩴۤۧ), (r5v4 l.ᩴۤۧ) binds: [B:104:0x0313, B:68:0x0311, B:48:0x021a] A[DONT_GENERATE, DONT_INLINE]
      0x0313: PHI (r32v4 short[]) = (r32v1 short[]), (r32v3 short[]), (r32v1 short[]) binds: [B:104:0x0313, B:68:0x0311, B:48:0x021a] A[DONT_GENERATE, DONT_INLINE]
      0x0313: PHI (r33v4 int) = (r33v1 int), (r33v3 int), (r33v1 int) binds: [B:104:0x0313, B:68:0x0311, B:48:0x021a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x009d, code lost:
    
        if (l.C3779.f12953 > 0) goto L16;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m32466(l.C13042 r34, final l.RunnableC12927 r35) {
        /*
            Method dump skipped, instruction units count: 1290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C13042.m32466(l.۫ۤۧ, l.۫ۜ֫):void");
    }

    public C13042(AbstractActivityC17204 abstractActivityC17204) {
        int iM3169;
        int i;
        String str;
        int i2;
        SpannableStringBuilder spannableStringBuilder;
        int iM31610;
        int i3;
        int i4 = C2702.f8586;
        int i5 = C1542.f5343;
        short s = f41737[0];
        int i6 = ((s * s) + 156450064) - (s * 25016) < 0 ? 15676 : 55818;
        int iM2761 = (C0619.m2761("۫᩷") + i4) * 3;
        BufferedReader bufferedReader = null;
        String strM9853 = null;
        SpannableStringBuilder spannableStringBuilder2 = null;
        boolean zM9480 = false;
        int iM12919 = 0;
        int i7 = 0;
        int i8 = 0;
        int iM129110 = 0;
        int iM6305 = 0;
        boolean zM2359 = false;
        BufferedReader bufferedReader2 = null;
        int i9 = 1938646197;
        BufferedReader bufferedReader3 = null;
        int i10 = ((iM2761 ^ i5) * (-10329)) ^ (-1610840048);
        String line = null;
        int i11 = iM2761 ^ 977953583;
        int i12 = 0;
        while (true) {
            i9 = i11 ^ (i10 & (((i9 ^ i5) * (-1115)) >> 31));
            switch (i9) {
                case -1889996877:
                case -1440103494:
                    try {
                        spannableStringBuilder2 = new SpannableStringBuilder();
                        try {
                            i2 = i12;
                            try {
                                spannableStringBuilder = spannableStringBuilder2;
                                str = line;
                                try {
                                    bufferedReader3 = new BufferedReader(new InputStreamReader(abstractActivityC17204.getAssets().open(C1783.m6233(f41737, 1, 13, i6)), StandardCharsets.UTF_8));
                                    spannableStringBuilder2 = spannableStringBuilder;
                                    iM31610 = C0619.m2761("᩸ܽ") ^ i4;
                                    i10 = (-1652197676) ^ ((iM31610 ^ i5) * (-1175));
                                    i3 = -1353428368;
                                } catch (IOException unused) {
                                    spannableStringBuilder2 = spannableStringBuilder;
                                    bufferedReader3 = null;
                                    bufferedReader = bufferedReader2;
                                    iM31610 = (C0773.m3169("۬ܿ") + i4) * 19;
                                    i10 = (-1766500527) ^ ((iM31610 ^ i5) * (-28355));
                                    i3 = -559853996;
                                }
                            } catch (IOException unused2) {
                                spannableStringBuilder = spannableStringBuilder2;
                                str = line;
                            }
                        } catch (IOException unused3) {
                            i2 = i12;
                            str = line;
                        }
                    } catch (IOException unused4) {
                        i2 = i12;
                        str = line;
                        spannableStringBuilder2 = null;
                    }
                    i11 = i3 ^ iM31610;
                    i12 = i2;
                    line = str;
                    break;
                case -1591269277:
                case -469472635:
                    strM9853 = C3033.m9853(line);
                    zM9480 = C2878.m9480(strM9853);
                    iM3169 = C0773.m3169("۠ۚ") ^ i4;
                    i10 = ((iM3169 ^ i5) * (-10399)) ^ 1750551746;
                    i = -1652846202;
                    i11 = iM3169 ^ i;
                    break;
                case -1325849405:
                case 2024404626:
                    C1146.m4232(spannableStringBuilder2, C3077.m10047(f41737, 17, 1, i6));
                    iM3169 = C0619.m2761("ۛܿ") ^ i5;
                    i10 = ((iM3169 ^ i4) * (-6145)) ^ 2015378386;
                    i = -1995296259;
                    i11 = iM3169 ^ i;
                    break;
                case -1139522288:
                case 722910286:
                    this.f41739 = spannableStringBuilder2;
                    iM3169 = C0619.m2761("ۗ᩺") ^ i5;
                    i10 = ((iM3169 ^ i4) * (-10289)) ^ (-1848105592);
                    i = -1736177107;
                    i11 = iM3169 ^ i;
                    break;
                case -1091901495:
                case 1125695669:
                    C3492.m11480(bufferedReader);
                    break;
                case -1066194411:
                case -954518933:
                    C1146.m4232(spannableStringBuilder2, C2966.m9670(f41737, 14, 3, i6));
                    i7 = 0;
                    i8 = 17;
                    C17202.m40381(spannableStringBuilder2, new ForegroundColorSpan(0), C1826.m6305(spannableStringBuilder2) - 3, C3998.m12919(spannableStringBuilder2), 17);
                    iM129110 = C3998.m12919(spannableStringBuilder2);
                    C1146.m4232(spannableStringBuilder2, strM9853);
                    iM6305 = C1826.m6305(spannableStringBuilder2);
                    zM2359 = C0487.m2359(strM9853, C4282.m13650(f41737, 18, 1, i6));
                    iM3169 = C0773.m3169("֨ܺ") ^ i5;
                    i10 = ((iM3169 ^ i4) * (-28205)) ^ 1065457583;
                    i = 2047763428;
                    i11 = iM3169 ^ i;
                    break;
                case -970099455:
                case 617462320:
                    iM12919 = C3998.m12919(spannableStringBuilder2);
                    iM3169 = C0773.m3169("ܶ۟") ^ i4;
                    i10 = ((iM3169 ^ i5) * 14071) ^ 953904774;
                    i = 1143130241;
                    i11 = iM3169 ^ i;
                    break;
                case -719999552:
                case 1793280808:
                    if (!zM9480) {
                        iM3169 = C0773.m3169("ۨ۬") ^ i5;
                        i10 = ((iM3169 ^ i4) * 10545) ^ 567305573;
                        i = 1840031512;
                        i11 = iM3169 ^ i;
                    } else {
                        i2 = i12;
                        str = line;
                        iM31610 = C0619.m2761("᩸ܽ") ^ i4;
                        i10 = (-1652197676) ^ ((iM31610 ^ i5) * (-1175));
                        i3 = -1353428368;
                        i11 = i3 ^ iM31610;
                        i12 = i2;
                        line = str;
                    }
                    break;
                case -660187253:
                case -486151465:
                    str = line;
                    i12 = 1;
                    this.f41740 = true;
                    this.f41741 = abstractActivityC17204;
                    bufferedReader2 = null;
                    int iM2762 = (C0619.m2761("᩷᩷") + i5) * (-81);
                    i11 = iM2762 ^ 1831861902;
                    i10 = ((iM2762 ^ i4) * 7285) ^ 665054241;
                    line = str;
                    break;
                case -415658487:
                case 1272253696:
                    line = bufferedReader3.readLine();
                    iM3169 = C0773.m3169("۠۟") ^ i5;
                    i10 = ((iM3169 ^ i4) * 6431) ^ (-26320097);
                    i = 827464082;
                    i11 = iM3169 ^ i;
                    break;
                case 2018770:
                case 1225635266:
                    try {
                        C17202.m40381(spannableStringBuilder2, new RelativeSizeSpan(1.1f), iM129110, iM6305, i8);
                        C17202.m40381(spannableStringBuilder2, new StyleSpan(i12), iM129110, iM6305, i8);
                        C1146.m4232(spannableStringBuilder2, C1564.m5510(f41737, 19, 1, i6));
                        int i13 = iM6305 + 1;
                        C17202.m40381(spannableStringBuilder2, new ForegroundColorSpan(i7), iM6305, i13, i8);
                        C3734.m12154(spannableStringBuilder2, new RelativeSizeSpan(1.5f), iM6305, i13, i8);
                        C3734.m12154(spannableStringBuilder2, new StyleSpan(i12), iM6305, i13, i8);
                        i2 = i12;
                        str = line;
                        iM31610 = C0619.m2761("᩸ܽ") ^ i4;
                        i10 = (-1652197676) ^ ((iM31610 ^ i5) * (-1175));
                        i3 = -1353428368;
                    } catch (IOException unused5) {
                        i2 = i12;
                        str = line;
                        bufferedReader = bufferedReader3;
                        iM31610 = (C0773.m3169("۬ܿ") + i4) * 19;
                        i10 = (-1766500527) ^ ((iM31610 ^ i5) * (-28355));
                        i3 = -559853996;
                    }
                    i11 = i3 ^ iM31610;
                    i12 = i2;
                    line = str;
                    break;
                case 206358868:
                case 1837697773:
                    if (iM12919 > 0) {
                        iM3169 = C0773.m3169("ۘ۠") ^ i4;
                        i10 = ((iM3169 ^ i5) * 26733) ^ 977051369;
                        i = -124315529;
                    } else {
                        iM3169 = C0619.m2761("ۛܿ") ^ i5;
                        i10 = ((iM3169 ^ i4) * (-6145)) ^ 2015378386;
                        i = -1995296259;
                    }
                    i11 = iM3169 ^ i;
                    break;
                case 320480339:
                case 862917978:
                    if (!zM2359) {
                        i2 = i12;
                        str = line;
                        iM31610 = C0619.m2761("᩸ܽ") ^ i4;
                        i10 = (-1652197676) ^ ((iM31610 ^ i5) * (-1175));
                        i3 = -1353428368;
                        i11 = i3 ^ iM31610;
                        i12 = i2;
                        line = str;
                    } else {
                        iM3169 = C0619.m2761("᩶ܰ") ^ i4;
                        i10 = ((iM3169 ^ i5) * (-14065)) ^ 1013715878;
                        i = 1215500564;
                        i11 = iM3169 ^ i;
                    }
                    break;
                case 919275823:
                case 2016608833:
                    if (line != null) {
                        iM3169 = C0619.m2761("ᩳᩳ") ^ i5;
                        i10 = ((iM3169 ^ i4) * (-31697)) ^ 1758753270;
                        i = -398088657;
                    } else {
                        iM3169 = (i4 - C0619.m2761("ۨ֫")) * (-111);
                        i10 = ((iM3169 ^ i5) * (-1831)) ^ (-1806280957);
                        i = 610044441;
                    }
                    i11 = iM3169 ^ i;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32470(final RunnableC12927 runnableC12927) {
        int i = -13002639;
        int i2 = C20932.f66974;
        int i3 = AbstractC0116.f1064;
        int iM2761 = C0619.m2761("ۜۙ") ^ i2;
        int i4 = ((iM2761 ^ i3) * (-18877)) ^ (-1383285201);
        int i5 = -111296715;
        while (true) {
            i = ((((i ^ i3) * 6211) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -1913338709:
                case -950423315:
                    C17202.m40372();
                    if (C1564.m5509() <= 0) {
                        iM2761 = (i2 - C0619.m2761("ᩴ᩵")) * 127;
                        i4 = ((iM2761 ^ i3) * 17593) ^ (-1645399721);
                        i5 = -709280572;
                    } else {
                        iM2761 = (C0773.m3169("ۘᩳ") ^ i3) * 79;
                        i4 = ((iM2761 ^ i2) * (-32393)) ^ 2114142938;
                        i5 = -328245852;
                    }
                    break;
                case -1745291489:
                case 1247900408:
                    if (C2287.f7432 < 0) {
                        C3492.m11477(new Runnable(this) { // from class: l.ۤۤۧ

                            /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
                            public final /* synthetic */ C13042 f34285;

                            {
                                int i6 = 1504517704;
                                int i7 = C1321.f4751;
                                int i8 = C3033.f9831;
                                int iM3169 = (C0773.m3169("ۘۖ") ^ i7) * 5;
                                int i9 = ((iM3169 ^ i8) * 26475) ^ 1703834579;
                                int i10 = 1415767574;
                                while (true) {
                                    i6 = ((((i6 ^ i8) * (-25473)) >> 31) & i9) ^ (iM3169 ^ i10);
                                    switch (i6) {
                                        case -1815763438:
                                        case -1719767914:
                                            if (C4282.f15546 > 0) {
                                                iM3169 = C0619.m2761("۠۫") ^ i8;
                                                i9 = ((iM3169 ^ i7) * 11251) ^ (-1308779579);
                                                i10 = -115853100;
                                            } else {
                                                iM3169 = C0773.m3169("ۙۛ") ^ i7;
                                                i9 = ((iM3169 ^ i8) * 30361) ^ 1091748647;
                                                i10 = -1335004384;
                                            }
                                            break;
                                        case -1701668152:
                                        case -456133892:
                                            if (C1826.f6190 <= 0) {
                                                iM3169 = C0619.m2761("ܰۚ") ^ i7;
                                                i9 = ((iM3169 ^ i8) * 16965) ^ (-18263519);
                                                i10 = 2098643566;
                                            } else {
                                                iM3169 = C0773.m3169("ۙۛ") ^ i7;
                                                i9 = ((iM3169 ^ i8) * 30361) ^ 1091748647;
                                                i10 = -1335004384;
                                            }
                                            break;
                                        case -1534762034:
                                        case 2070758313:
                                            if (C1542.f5343 <= 0) {
                                                iM3169 = C0773.m3169("ۙۛ") ^ i7;
                                                i9 = ((iM3169 ^ i8) * 30361) ^ 1091748647;
                                                i10 = -1335004384;
                                            } else {
                                                iM3169 = (C0773.m3169("ۜ᩸") ^ i8) * 85;
                                                i9 = ((iM3169 ^ i7) * 14591) ^ (-861964561);
                                                i10 = -296129187;
                                            }
                                            break;
                                        case -1378460853:
                                        case 949483231:
                                            if (C0950.f3488 >= 0) {
                                                iM3169 = C0773.m3169("ۙۛ") ^ i7;
                                                i9 = ((iM3169 ^ i8) * 30361) ^ 1091748647;
                                                i10 = -1335004384;
                                            } else {
                                                iM3169 = C0773.m3169("ܰ᩶") ^ i8;
                                                i9 = ((iM3169 ^ i7) * (-19931)) ^ 1943323042;
                                                i10 = 431892393;
                                            }
                                            break;
                                        case -1210807283:
                                        case 345701775:
                                            this.f34285 = this;
                                            if (C2419.m8174() >= 0) {
                                                iM3169 = C0773.m3169("۟ܽ") ^ i7;
                                                i9 = ((iM3169 ^ i8) * (-23411)) ^ (-1595058281);
                                                i10 = 1113059769;
                                            } else {
                                                iM3169 = (i7 - C0619.m2761("ܿᩳ")) * (-69);
                                                i9 = ((iM3169 ^ i8) * 27043) ^ 1083606449;
                                                i10 = -1260835978;
                                            }
                                            break;
                                        case -1193296605:
                                        case -986543301:
                                            if (C2375.f7641 <= 0) {
                                                iM3169 = C0773.m3169("ۙۛ") ^ i7;
                                                i9 = ((iM3169 ^ i8) * 30361) ^ 1091748647;
                                                i10 = -1335004384;
                                            } else {
                                                iM3169 = C0619.m2761("ܰܺ") ^ i8;
                                                i9 = ((iM3169 ^ i7) * 20753) ^ 859188135;
                                                i10 = 42994881;
                                            }
                                            break;
                                        case -611387201:
                                        case 1753956025:
                                            C0773.m3161();
                                            if (C3033.f9831 >= 0) {
                                                iM3169 = C0619.m2761("۠۫") ^ i8;
                                                i9 = ((iM3169 ^ i7) * 11251) ^ (-1308779579);
                                                i10 = -115853100;
                                            } else {
                                                iM3169 = C0773.m3169("ᩴᩳ") ^ i8;
                                                i9 = ((iM3169 ^ i7) * (-22335)) ^ (-1827000406);
                                                i10 = 2082130887;
                                            }
                                            break;
                                        case -261756114:
                                        case 1868102707:
                                            if (AbstractC0641.f2496 >= 0) {
                                                iM3169 = C0619.m2761("ܰۚ") ^ i7;
                                                i9 = ((iM3169 ^ i8) * 16965) ^ (-18263519);
                                                i10 = 2098643566;
                                            } else {
                                                iM3169 = (i8 - C0773.m3169("ᩳۧ")) * 69;
                                                i9 = ((iM3169 ^ i7) * (-31691)) ^ 316392895;
                                                i10 = -115601995;
                                            }
                                            break;
                                        case -161284795:
                                        case 1486286900:
                                            if (C1542.m5459() >= 0) {
                                                iM3169 = C0619.m2761("ܰۚ") ^ i7;
                                                i9 = ((iM3169 ^ i8) * 16965) ^ (-18263519);
                                                i10 = 2098643566;
                                            } else {
                                                iM3169 = (i7 - C0619.m2761("᩵᩹")) * (-5);
                                                i9 = ((iM3169 ^ i8) * (-20793)) ^ (-987710455);
                                                i10 = 2049351926;
                                            }
                                            break;
                                        case -48542077:
                                        case 1120034524:
                                            if (C2419.f7754 >= 0) {
                                                iM3169 = C0773.m3169("۟ܽ") ^ i7;
                                                i9 = ((iM3169 ^ i8) * (-23411)) ^ (-1595058281);
                                                i10 = 1113059769;
                                            } else {
                                                iM3169 = C0619.m2761("ۢܿ") ^ i7;
                                                i9 = ((iM3169 ^ i8) * 11799) ^ (-1968148715);
                                                i10 = -458921351;
                                            }
                                            break;
                                        case 381994869:
                                        case 1511428190:
                                            C2287.m7745();
                                            iM3169 = C0773.m3169("ۙۛ") ^ i7;
                                            i9 = ((iM3169 ^ i8) * 30361) ^ 1091748647;
                                            i10 = -1335004384;
                                            break;
                                        case 385185657:
                                        case 1673680485:
                                            C23916.m53419();
                                            throw new RuntimeException();
                                        case 442599518:
                                        case 1111320991:
                                            return;
                                        case 938229693:
                                        case 1550502939:
                                            if (C11235.f35427 >= 0) {
                                                iM3169 = C0619.m2761("ܰۚ") ^ i7;
                                                i9 = ((iM3169 ^ i8) * 16965) ^ (-18263519);
                                                i10 = 2098643566;
                                            } else {
                                                iM3169 = (C0773.m3169("ܿܳ") + i8) * 119;
                                                i9 = ((iM3169 ^ i7) * 20625) ^ 2050444198;
                                                i10 = -2099570415;
                                            }
                                            break;
                                        case 1242993971:
                                        case 1649763895:
                                            if (C1519.f5300 >= 0) {
                                                iM3169 = C0773.m3169("ۙۛ") ^ i7;
                                                i9 = ((iM3169 ^ i8) * 30361) ^ 1091748647;
                                                i10 = -1335004384;
                                            } else {
                                                iM3169 = (C0773.m3169("ۘ۠") + i7) * 83;
                                                i9 = ((iM3169 ^ i8) * 13971) ^ 1893280564;
                                                i10 = 1821344842;
                                            }
                                            break;
                                        default:
                                            if (C2310.f7472 >= 0) {
                                                iM3169 = C0773.m3169("ۙۛ") ^ i7;
                                                i9 = ((iM3169 ^ i8) * 30361) ^ 1091748647;
                                                i10 = -1335004384;
                                            } else {
                                                iM3169 = C0773.m3169("᩺۫") ^ i7;
                                                i9 = ((iM3169 ^ i8) * 14415) ^ (-1892964665);
                                                i10 = 35555076;
                                            }
                                            break;
                                    }
                                }
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                C13042.m32466(this.f34285, runnableC12927);
                            }
                        }, 1000L);
                        return;
                    }
                    iM2761 = C0773.m3169("֫ۚ") ^ i3;
                    i4 = ((iM2761 ^ i2) * (-10667)) ^ 1315418243;
                    i5 = -246209897;
                    break;
                case -1715062933:
                case -29030201:
                    if (C2834.f9334 <= 0) {
                        iM2761 = (i2 - C0619.m2761("ᩴ᩵")) * 127;
                        i4 = ((iM2761 ^ i3) * 17593) ^ (-1645399721);
                        i5 = -709280572;
                    } else {
                        iM2761 = (C0773.m3169("ۤܳ") + i2) * 71;
                        i4 = ((iM2761 ^ i3) * (-31457)) ^ (-439868279);
                        i5 = 966558238;
                    }
                    break;
                case -1568877724:
                case 1820274823:
                    this.f41740 = false;
                    if (C3448.f11240 >= 0) {
                        iM2761 = C0619.m2761("۠ܶ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-29985)) ^ (-2131103008);
                        i5 = 1643702498;
                    } else {
                        iM2761 = C0773.m3169("ۛۢ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-17997)) ^ (-520545187);
                        i5 = -1120606979;
                    }
                    break;
                case -1531850193:
                case -330646728:
                    RunnableC0334.m2063();
                    iM2761 = (C0773.m3169("ۘᩳ") ^ i3) * 79;
                    i4 = ((iM2761 ^ i2) * (-32393)) ^ 2114142938;
                    i5 = -328245852;
                    break;
                case -1456950099:
                case 52679267:
                    C4238.m13540();
                    return;
                case -1318773664:
                case -656391104:
                    if (C3998.f13671 != 0) {
                        iM2761 = (i2 - C0619.m2761("ᩴ᩵")) * 127;
                        i4 = ((iM2761 ^ i3) * 17593) ^ (-1645399721);
                        i5 = -709280572;
                    } else {
                        iM2761 = C0773.m3169("᩺ۖ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-19435)) ^ 1470716198;
                        i5 = 1902358571;
                    }
                    break;
                case -1184692663:
                case -179476060:
                    C0619.m2763();
                    if (C1783.f6087 > 0) {
                        iM2761 = C0619.m2761("۠ܶ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-29985)) ^ (-2131103008);
                        i5 = 1643702498;
                    } else {
                        iM2761 = (i2 - C0619.m2761("ᩴ᩵")) * 127;
                        i4 = ((iM2761 ^ i3) * 17593) ^ (-1645399721);
                        i5 = -709280572;
                    }
                    break;
                case -1028247155:
                case -773245602:
                    if (this.f41740) {
                        iM2761 = C0619.m2761("᩵۟") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-6761)) ^ 1590435062;
                        i5 = -2001526549;
                    } else {
                        iM2761 = C0619.m2761("ۜۨ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-7657)) ^ 513279284;
                        i5 = 1841818223;
                    }
                    break;
                case -892850787:
                case 1538016050:
                    if (RunnableC3055.f9898 >= 0) {
                        iM2761 = C0773.m3169("֫ۚ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-10667)) ^ 1315418243;
                        i5 = -246209897;
                    } else {
                        iM2761 = (C0619.m2761("֫֨") + i3) * 37;
                        i4 = ((iM2761 ^ i2) * (-28217)) ^ 264990468;
                        i5 = 1725033050;
                    }
                    break;
                case -745427763:
                case 910795054:
                    if (C1519.f5300 >= 0) {
                        iM2761 = (i2 - C0619.m2761("ᩴ᩵")) * 127;
                        i4 = ((iM2761 ^ i3) * 17593) ^ (-1645399721);
                        i5 = -709280572;
                    } else {
                        iM2761 = (i2 - C0619.m2761("ۚ۫")) * (-107);
                        i4 = ((iM2761 ^ i3) * (-23401)) ^ (-591078893);
                        i5 = 291485994;
                    }
                    break;
                case -517801269:
                case -426485678:
                    if (C2485.f7950 != 0) {
                        iM2761 = C0619.m2761("۠ܶ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-29985)) ^ (-2131103008);
                        i5 = 1643702498;
                    } else {
                        iM2761 = (C0773.m3169("᩶ܽ") ^ i3) * (-35);
                        i4 = ((iM2761 ^ i2) * 16443) ^ 282163513;
                        i5 = 574030552;
                    }
                    break;
                case -517446603:
                case 228352622:
                    if (C1826.f6190 <= 0) {
                        iM2761 = C0619.m2761("۠ܶ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-29985)) ^ (-2131103008);
                        i5 = 1643702498;
                    } else {
                        iM2761 = C0619.m2761("ܶ᩹") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-15889)) ^ (-1135253242);
                        i5 = -1250223137;
                    }
                    break;
                case -156437344:
                case 2057776603:
                    if (C0773.f2792 <= 0) {
                        iM2761 = (i3 - C0619.m2761("֫᩵")) * (-107);
                        i4 = ((iM2761 ^ i2) * (-5699)) ^ 964164997;
                        i5 = -2143698665;
                    } else {
                        iM2761 = C0773.m3169("᩻᩸") ^ i3;
                        i4 = ((iM2761 ^ i2) * 5887) ^ (-1334672049);
                        i5 = -961838228;
                    }
                    break;
                case 196867368:
                case 1775881311:
                    throw new IllegalStateException();
                case 1306191671:
                case 1693739360:
                    if (C13473.f42873 != 0) {
                        iM2761 = C0773.m3169("֫ۚ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-10667)) ^ 1315418243;
                        i5 = -246209897;
                    } else {
                        iM2761 = (i2 - C0773.m3169("ۘ᩷")) * 21;
                        i4 = ((iM2761 ^ i3) * (-11925)) ^ 1261156749;
                        i5 = 1947478910;
                    }
                    break;
                default:
                    if (C3690.f12684 <= 0) {
                        iM2761 = (i3 - C0619.m2761("֫᩵")) * (-107);
                        i4 = ((iM2761 ^ i2) * (-5699)) ^ 964164997;
                        i5 = -2143698665;
                    } else {
                        iM2761 = (i2 - C0619.m2761("ᩴ᩵")) * 127;
                        i4 = ((iM2761 ^ i3) * 17593) ^ (-1645399721);
                        i5 = -709280572;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m32467(C13042 c13042) {
        AbstractActivityC17204 abstractActivityC17204 = null;
        String strM32483 = null;
        int i = 1051845977;
        int i2 = C1519.f5300;
        int i3 = C0487.f2131;
        int iM3169 = C0773.m3169("ۛܺ") ^ i3;
        int i4 = ((iM3169 ^ i2) * (-7373)) ^ 326991970;
        int i5 = -1825872074;
        while (true) {
            i = ((((i ^ i2) * 615) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2074412143:
                case -1313525317:
                    abstractActivityC17204 = c13042.f41741;
                    if (C2834.f9334 <= 0) {
                        iM3169 = C0619.m2761("֫ۚ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-26383)) ^ 456016505;
                        i5 = 2042616440;
                    } else {
                        iM3169 = C0773.m3169("᩶ۨ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 7653) ^ 1346163043;
                        i5 = -1071524662;
                    }
                    break;
                case -1961059201:
                case 1548807516:
                    if (!RunnableC3646.f12471) {
                        iM3169 = (i2 - C0773.m3169("ܽܽ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM3169 ^ i3) * 9347) ^ (-2069156558);
                        i5 = -1587288834;
                    } else {
                        iM3169 = C0619.m2761("֫ۚ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-26383)) ^ 456016505;
                        i5 = 2042616440;
                    }
                    break;
                case -1854376015:
                case 1031520548:
                    if (C0487.f2131 > 0) {
                        iM3169 = (i2 - C0773.m3169("ܽܽ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM3169 ^ i3) * 9347) ^ (-2069156558);
                        i5 = -1587288834;
                    } else {
                        iM3169 = C0773.m3169("ܽۧ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 5245) ^ 163998548;
                        i5 = -434809632;
                    }
                    break;
                case -1457323452:
                case 617343321:
                    if (C2834.f9334 <= 0) {
                        iM3169 = (i3 - C0773.m3169("ۡᩴ")) * 101;
                        i4 = ((iM3169 ^ i2) * 12827) ^ (-1110326431);
                        i5 = -1269897562;
                    } else {
                        iM3169 = C0619.m2761("ۛۙ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-8203)) ^ (-70459647);
                        i5 = 1894693591;
                    }
                    break;
                case -1349455434:
                case -778602374:
                    if (RunnableC3055.f9898 >= 0) {
                        iM3169 = C0619.m2761("֫ۚ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-26383)) ^ 456016505;
                        i5 = 2042616440;
                    } else {
                        iM3169 = C0619.m2761("֨ܳ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 32301) ^ (-621519548);
                        i5 = 11203580;
                    }
                    break;
                case -1176085712:
                case -539699896:
                    if (C2419.m8174() >= 0) {
                        iM3169 = (C0619.m2761("ۙܿ") ^ i2) * (-31);
                        i4 = ((iM3169 ^ i3) * (-17463)) ^ (-1101218340);
                        i5 = 2127340328;
                    } else {
                        iM3169 = C0619.m2761("ᩴۤ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 31349) ^ 740944758;
                        i5 = 1418086279;
                    }
                    break;
                case -924410229:
                case 64188798:
                    C3448.m11248();
                    RunnableC0334.m2063();
                    iM3169 = C0773.m3169("ܽۧ") ^ i3;
                    i4 = ((iM3169 ^ i2) * 5245) ^ 163998548;
                    i5 = -434809632;
                    break;
                case -897394970:
                case 954516118:
                    if (C3998.f13671 != 0) {
                        iM3169 = (i3 - C0773.m3169("ۡᩴ")) * 101;
                        i4 = ((iM3169 ^ i2) * 12827) ^ (-1110326431);
                        i5 = -1269897562;
                    } else {
                        iM3169 = (i2 - C0773.m3169("֫ۤ")) * (-65);
                        i4 = ((iM3169 ^ i3) * 25217) ^ 631733138;
                        i5 = -1946282433;
                    }
                    break;
                case -889869595:
                case 1191965109:
                    strM32483 = C13047.m32483();
                    if (C3448.f11240 >= 0) {
                        iM3169 = (i3 - C0773.m3169("ۡᩴ")) * 101;
                        i4 = ((iM3169 ^ i2) * 12827) ^ (-1110326431);
                        i5 = -1269897562;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ܿۖ")) * 91;
                        i4 = ((iM3169 ^ i2) * (-21081)) ^ 1278179639;
                        i5 = 1297123298;
                    }
                    break;
                case -596936590:
                case 430012889:
                    ActivityC20934.m47864((Context) abstractActivityC17204, strM32483, true);
                    break;
                case -245041998:
                case 663860959:
                    C2310.m7813();
                    C0950.m3785();
                    break;
                case -123930534:
                case 1140079215:
                    if (C2834.f9334 <= 0) {
                        iM3169 = (C0619.m2761("ۙܿ") ^ i2) * (-31);
                        i4 = ((iM3169 ^ i3) * (-17463)) ^ (-1101218340);
                        i5 = 2127340328;
                    } else {
                        iM3169 = C0773.m3169("ᩴۙ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-15611)) ^ (-1132530166);
                        i5 = 274710565;
                    }
                    break;
                case 120438232:
                case 1758077208:
                    if (C1826.f6190 <= 0) {
                        iM3169 = (C0619.m2761("ۙܿ") ^ i2) * (-31);
                        i4 = ((iM3169 ^ i3) * (-17463)) ^ (-1101218340);
                        i5 = 2127340328;
                    } else {
                        iM3169 = C0619.m2761("ۜۡ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-6235)) ^ (-1961802214);
                        i5 = 368876892;
                    }
                    break;
                case 526155719:
                case 623714669:
                    if (AbstractC0116.f1064 <= 0) {
                        iM3169 = (C0619.m2761("ۙܿ") ^ i2) * (-31);
                        i4 = ((iM3169 ^ i3) * (-17463)) ^ (-1101218340);
                        i5 = 2127340328;
                    } else {
                        iM3169 = C0619.m2761("ܳ۠") ^ i3;
                        i4 = ((iM3169 ^ i2) * 22025) ^ (-577003087);
                        i5 = -1015034783;
                    }
                    break;
                case 1664009918:
                case 1859005423:
                    C1783.m6232();
                    if (C2834.f9334 > 0) {
                        iM3169 = (C0619.m2761("ۙܿ") ^ i2) * (-31);
                        i4 = ((iM3169 ^ i3) * (-17463)) ^ (-1101218340);
                        i5 = 2127340328;
                    } else {
                        iM3169 = C0773.m3169("ܽۧ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 5245) ^ 163998548;
                        i5 = -434809632;
                    }
                    break;
                default:
                    if (C1146.f4234 >= 0) {
                        iM3169 = (i2 - C0773.m3169("ܽܽ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM3169 ^ i3) * 9347) ^ (-2069156558);
                        i5 = -1587288834;
                    } else {
                        iM3169 = (C0773.m3169("ܽܶ") ^ i3) * 123;
                        i4 = ((iM3169 ^ i2) * 23171) ^ (-633759663);
                        i5 = 1733555362;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32469() {
        int i = 374807219;
        int i2 = RunnableC3055.f9898;
        int i3 = C1783.f6087;
        int iM2761 = C0619.m2761("֫ۛ") ^ i3;
        int i4 = ((iM2761 ^ i2) * 30425) ^ 272377873;
        int i5 = -644684686;
        while (true) {
            i = ((((i ^ i2) * 13287) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2107332714:
                case -1796277915:
                    throw new IllegalStateException();
                case -2003188644:
                case 349215723:
                    C23916.m53419();
                    C2702.m8876();
                    iM2761 = (C0773.m3169("᩷᩵") + i2) * (-7);
                    i4 = ((iM2761 ^ i3) * 16559) ^ 1951135463;
                    i5 = -1681276076;
                    break;
                case -1909526275:
                case 47697926:
                    C0619.m2763();
                    C1542.m5459();
                    return;
                case -1805242828:
                case 296074412:
                    if (C1564.f5401 <= 0) {
                        iM2761 = (i3 - C0773.m3169("۬ۛ")) * 63;
                        i4 = ((iM2761 ^ i2) * (-7241)) ^ 795487866;
                        i5 = -663674367;
                    } else {
                        iM2761 = (C0773.m3169("᩻֫") ^ i3) * 45;
                        i4 = ((iM2761 ^ i2) * (-25677)) ^ 1174774359;
                        i5 = -74894826;
                    }
                    break;
                case -1696680136:
                case -205998759:
                    if (C2288.f7433 > 0) {
                        iM2761 = C0619.m2761("᩸ۧ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-23919)) ^ 777945306;
                        i5 = -19966208;
                    } else {
                        iM2761 = (C0773.m3169("᩷᩵") + i2) * (-7);
                        i4 = ((iM2761 ^ i3) * 16559) ^ 1951135463;
                        i5 = -1681276076;
                    }
                    break;
                case -1476511640:
                case -593644831:
                    C2485.m8357();
                    if (C11235.f35427 >= 0) {
                        iM2761 = C0773.m3169("ۙ᩹") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-14517)) ^ (-1530951504);
                        i5 = 1422496429;
                    } else {
                        iM2761 = (C0773.m3169("᩷᩵") + i2) * (-7);
                        i4 = ((iM2761 ^ i3) * 16559) ^ 1951135463;
                        i5 = -1681276076;
                    }
                    break;
                case -1429289338:
                case 296428095:
                    if (C13473.f42873 != 0) {
                        iM2761 = (C0773.m3169("᩷᩵") + i2) * (-7);
                        i4 = ((iM2761 ^ i3) * 16559) ^ 1951135463;
                        i5 = -1681276076;
                    } else {
                        iM2761 = C0619.m2761("᩺ۘ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-9621)) ^ (-348992727);
                        i5 = -1966783140;
                    }
                    break;
                case -1312447835:
                case 1022884563:
                    if (C2485.m8357() <= 0) {
                        iM2761 = C0773.m3169("ۙ᩹") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-14517)) ^ (-1530951504);
                        i5 = 1422496429;
                    } else {
                        iM2761 = (i2 - C0619.m2761("ۘܿ")) * 59;
                        i4 = ((iM2761 ^ i3) * (-29325)) ^ (-274585757);
                        i5 = -438319613;
                    }
                    break;
                case -1057876172:
                case 1549635001:
                    if (C1146.f4234 >= 0) {
                        iM2761 = C0773.m3169("ۙ᩹") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-14517)) ^ (-1530951504);
                        i5 = 1422496429;
                    } else {
                        iM2761 = (i2 - C0619.m2761("۬ܰ")) * (-105);
                        i4 = ((iM2761 ^ i3) * (-12627)) ^ 1418402388;
                        i5 = -1047701364;
                    }
                    break;
                case -1010723665:
                case 1775374424:
                    if (C0619.f2439) {
                        iM2761 = C0773.m3169("ۙ᩹") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-14517)) ^ (-1530951504);
                        i5 = 1422496429;
                    } else {
                        iM2761 = C0619.m2761("۟ܺ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 23997) ^ 1722323036;
                        i5 = -71890560;
                    }
                    break;
                case -775578315:
                case -20295807:
                    this.f41740 = false;
                    if (C2966.f9654 >= 0) {
                        iM2761 = C0619.m2761("᩸ۧ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-23919)) ^ 777945306;
                        i5 = -19966208;
                    } else {
                        iM2761 = C0619.m2761("ܿ᩵") ^ i3;
                        i4 = ((iM2761 ^ i2) * 30579) ^ 324305691;
                        i5 = 602309304;
                    }
                    break;
                case -621584144:
                case 826971:
                    if (C1080.m4050()) {
                        iM2761 = (C0619.m2761("᩹ܰ") ^ i3) * (-55);
                        i4 = ((iM2761 ^ i2) * 24981) ^ 1206890496;
                        i5 = 1721601237;
                    } else {
                        iM2761 = C0619.m2761("᩸ۧ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-23919)) ^ 777945306;
                        i5 = -19966208;
                    }
                    break;
                case -265250056:
                case 835313073:
                    if (C17202.f56030) {
                        C2702.m8872(new RunnableC4839(0, this));
                        return;
                    }
                    iM2761 = C0773.m3169("ۚۢ") ^ i2;
                    i4 = ((iM2761 ^ i3) * 27173) ^ (-1457549333);
                    i5 = 914464301;
                    break;
                case 519902619:
                case 1350827789:
                    if (!C3998.m12920()) {
                        iM2761 = (i3 - C0773.m3169("۬ۛ")) * 63;
                        i4 = ((iM2761 ^ i2) * (-7241)) ^ 795487866;
                        i5 = -663674367;
                    } else {
                        iM2761 = (C0773.m3169("᩷᩵") + i2) * (-7);
                        i4 = ((iM2761 ^ i3) * 16559) ^ 1951135463;
                        i5 = -1681276076;
                    }
                    break;
                case 1005856972:
                case 2053890406:
                    if (RunnableC1848.f6235) {
                        iM2761 = (i3 - C0773.m3169("۬ۛ")) * 63;
                        i4 = ((iM2761 ^ i2) * (-7241)) ^ 795487866;
                        i5 = -663674367;
                    } else {
                        iM2761 = C0619.m2761("۬ۤ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-2097)) ^ (-858970691);
                        i5 = 820988428;
                    }
                    break;
                case 1753273916:
                case 2027903821:
                    if (RunnableC1848.f6235) {
                        iM2761 = C0773.m3169("ۚۢ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 27173) ^ (-1457549333);
                        i5 = 914464301;
                    } else {
                        iM2761 = C0619.m2761("᩻ۨ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 31471) ^ (-661742809);
                        i5 = 1992337640;
                    }
                    break;
                default:
                    if (this.f41740) {
                        iM2761 = (C0773.m3169("ۛ᩷") ^ i2) * 77;
                        i4 = ((iM2761 ^ i3) * (-14123)) ^ 108045490;
                        i5 = -1799756135;
                    } else {
                        iM2761 = C0773.m3169("ۙۢ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 14901) ^ 1585882916;
                        i5 = -934275767;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00d8 A[PHI: r5 r6 r7
      0x00d8: PHI (r5v4 l.۠ۖۧ) = (r5v3 l.۠ۖۧ), (r5v2 l.۠ۖۧ), (r5v2 l.۠ۖۧ) binds: [B:28:0x00d6, B:24:0x00aa, B:13:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x00d8: PHI (r6v4 android.widget.Button) = (r6v3 android.widget.Button), (r6v2 android.widget.Button), (r6v2 android.widget.Button) binds: [B:28:0x00d6, B:24:0x00aa, B:13:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x00d8: PHI (r7v5 int) = (r7v2 int), (r7v4 int), (r7v2 int) binds: [B:28:0x00d6, B:24:0x00aa, B:13:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x01ef A[PHI: r8 r14 r15 r22
      0x01ef: PHI (r8v3 java.lang.String) = (r8v2 java.lang.String), (r8v2 java.lang.String), (r8v2 java.lang.String), (r8v5 java.lang.String) binds: [B:49:0x01ed, B:18:0x007f, B:16:0x007b, B:6:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x01ef: PHI (r14v4 int) = (r14v3 int), (r14v2 int), (r14v2 int), (r14v2 int) binds: [B:49:0x01ed, B:18:0x007f, B:16:0x007b, B:6:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x01ef: PHI (r15v4 int) = (r15v3 int), (r15v2 int), (r15v2 int), (r15v2 int) binds: [B:49:0x01ed, B:18:0x007f, B:16:0x007b, B:6:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x01ef: PHI (r22v17 short[]) = (r22v14 short[]), (r22v3 short[]), (r22v3 short[]), (r22v3 short[]) binds: [B:49:0x01ed, B:18:0x007f, B:16:0x007b, B:6:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0069, code lost:
    
        r21 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0076, code lost:
    
        if (l.C0862.f3233 == 0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007b, code lost:
    
        if (l.RunnableC0334.f1808 > 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0067, code lost:
    
        if (l.C11235.m28309() != 0) goto L10;
     */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m32468(l.C13042 r23) {
        /*
            Method dump skipped, instruction units count: 914
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C13042.m32468(l.۫ۤۧ):void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m32465(C13042 c13042) {
        AbstractActivityC17204 abstractActivityC17204 = null;
        String strM32483 = null;
        int i = -1294512006;
        int i2 = C4282.f15546;
        int i3 = C11235.f35427;
        int iM3169 = (C0773.m3169("ۙ֫") ^ i3) * q.h;
        int i4 = ((iM3169 ^ i2) * 16727) ^ 347080077;
        int i5 = -935586654;
        while (true) {
            i = ((((i ^ i2) * (-3663)) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2041166958:
                case 1626110371:
                    ActivityC20934.m47864((Context) abstractActivityC17204, strM32483, true);
                    break;
                case -2002329077:
                case 1735077831:
                    C17202.m40372();
                    C3734.m12152();
                    break;
                case -1983180455:
                case -392967842:
                    C1826.m6301();
                    if (C2966.f9654 < 0) {
                        iM3169 = (C0619.m2761("ۘ᩵") ^ i3) * q.h;
                        i4 = ((iM3169 ^ i2) * (-10083)) ^ 328371388;
                        i5 = 811641134;
                    } else {
                        iM3169 = (i3 - C0619.m2761("۠ۗ")) * (-55);
                        i4 = ((iM3169 ^ i2) * (-29409)) ^ 1325660660;
                        i5 = 1665788347;
                    }
                    break;
                case -1041532804:
                case 1236881457:
                    if (C2702.f8586 <= 0) {
                        iM3169 = (C0619.m2761("ۘ᩵") ^ i3) * q.h;
                        i4 = ((iM3169 ^ i2) * (-10083)) ^ 328371388;
                        i5 = 811641134;
                    } else {
                        iM3169 = C0773.m3169("۟ۗ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-9047)) ^ (-143990233);
                        i5 = -311133510;
                    }
                    break;
                case -965240124:
                case -69981421:
                    C3492.m11488();
                    iM3169 = (C0619.m2761("ۘ᩵") ^ i3) * q.h;
                    i4 = ((iM3169 ^ i2) * (-10083)) ^ 328371388;
                    i5 = 811641134;
                    break;
                case -908648841:
                case 510438481:
                    if (C1321.f4751 >= 0) {
                        iM3169 = (C0619.m2761("ۘ᩵") ^ i3) * q.h;
                        i4 = ((iM3169 ^ i2) * (-10083)) ^ 328371388;
                        i5 = 811641134;
                    } else {
                        iM3169 = (C0773.m3169("֫۠") + i3) * 33;
                        i4 = ((iM3169 ^ i2) * (-8423)) ^ (-1582069594);
                        i5 = 597077205;
                    }
                    break;
                case -858354724:
                case -311866:
                    if (C3077.f9998) {
                        iM3169 = C0619.m2761("ۜܿ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 29023) ^ (-1105580124);
                        i5 = 931539887;
                    } else {
                        iM3169 = (C0619.m2761("᩹ܽ") ^ i2) * 3;
                        i4 = ((iM3169 ^ i3) * 803) ^ (-75084548);
                        i5 = 1252345904;
                    }
                    break;
                case -724473885:
                case 321212249:
                    if (C1146.m4231()) {
                        iM3169 = (C0619.m2761("֫ۘ") ^ i3) * 81;
                        i4 = ((iM3169 ^ i2) * (-10459)) ^ 1615529461;
                        i5 = 359422024;
                    } else {
                        iM3169 = (C0619.m2761("ܳ᩺") ^ i3) * (-113);
                        i4 = ((iM3169 ^ i2) * 9207) ^ (-1008876257);
                        i5 = -1607500828;
                    }
                    break;
                case -573799675:
                case 558472316:
                    if (C4282.f15546 <= 0) {
                        iM3169 = (i2 - C0619.m2761("ᩳۡ")) * (-49);
                        i4 = ((iM3169 ^ i3) * (-16335)) ^ 177301882;
                        i5 = 993080493;
                    } else {
                        iM3169 = (i3 - C0619.m2761("᩸ۙ")) * 23;
                        i4 = ((iM3169 ^ i2) * 801) ^ 1236592177;
                        i5 = -991910037;
                    }
                    break;
                case -500025806:
                case 109456689:
                    if (C1564.f5401 <= 0) {
                        iM3169 = (C0619.m2761("ۘ᩵") ^ i3) * q.h;
                        i4 = ((iM3169 ^ i2) * (-10083)) ^ 328371388;
                        i5 = 811641134;
                    } else {
                        iM3169 = (C0773.m3169("᩷᩺") + i2) * 67;
                        i4 = ((iM3169 ^ i3) * 16943) ^ (-575934775);
                        i5 = 1448337300;
                    }
                    break;
                case -338478792:
                case 1824522721:
                    if (C11235.f35427 >= 0) {
                        iM3169 = (C0619.m2761("᩹ܽ") ^ i2) * 3;
                        i4 = ((iM3169 ^ i3) * 803) ^ (-75084548);
                        i5 = 1252345904;
                    } else {
                        iM3169 = C0619.m2761("ܳܳ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 27497) ^ (-457880080);
                        i5 = 99271945;
                    }
                    break;
                case -152510018:
                case 1329886799:
                    if (C13473.f42873 != 0) {
                        iM3169 = (C0619.m2761("᩹ܽ") ^ i2) * 3;
                        i4 = ((iM3169 ^ i3) * 803) ^ (-75084548);
                        i5 = 1252345904;
                    } else {
                        iM3169 = C0773.m3169("ۛ᩸") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-8775)) ^ 404125685;
                        i5 = 1994257694;
                    }
                    break;
                case 129653260:
                case 1894811564:
                    abstractActivityC17204 = c13042.f41741;
                    if (C0487.f2131 <= 0) {
                        iM3169 = (C0619.m2761("᩹ܽ") ^ i2) * 3;
                        i4 = ((iM3169 ^ i3) * 803) ^ (-75084548);
                        i5 = 1252345904;
                    } else {
                        iM3169 = C0773.m3169("ۛ۬") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-7289)) ^ 1361088851;
                        i5 = 1892736535;
                    }
                    break;
                case 316658366:
                case 452716218:
                    if (!C1343.m4943()) {
                        iM3169 = (i2 - C0619.m2761("ᩳۡ")) * (-49);
                        i4 = ((iM3169 ^ i3) * (-16335)) ^ 177301882;
                        i5 = 993080493;
                    } else {
                        iM3169 = (C0619.m2761("᩹ܽ") ^ i2) * 3;
                        i4 = ((iM3169 ^ i3) * 803) ^ (-75084548);
                        i5 = 1252345904;
                    }
                    break;
                case 658818787:
                case 880407658:
                    if (C1321.f4751 < 0) {
                        iM3169 = (i2 - C0619.m2761("ᩳۡ")) * (-49);
                        i4 = ((iM3169 ^ i3) * (-16335)) ^ 177301882;
                        i5 = 993080493;
                    } else {
                        iM3169 = (C0619.m2761("ۘ᩵") ^ i3) * q.h;
                        i4 = ((iM3169 ^ i2) * (-10083)) ^ 328371388;
                        i5 = 811641134;
                    }
                    break;
                default:
                    strM32483 = C13047.m32483();
                    if (C4238.f15451 >= 0) {
                        iM3169 = (C0619.m2761("ܳ᩺") ^ i3) * (-113);
                        i4 = ((iM3169 ^ i2) * 9207) ^ (-1008876257);
                        i5 = -1607500828;
                    } else {
                        iM3169 = C0773.m3169("ܶۘ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 6129) ^ (-1834732094);
                        i5 = -1560995099;
                    }
                    break;
            }
            return;
        }
    }
}
