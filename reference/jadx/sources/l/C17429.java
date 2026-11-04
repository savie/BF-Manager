package l;

import com.google.android.material.slider.BaseSlider;

/* JADX INFO: renamed from: l.ܽ۟ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5MV */
/* JADX INFO: loaded from: classes5.dex */
public final class C17429 implements InterfaceC7509 {

    /* JADX INFO: renamed from: ۧᩳۘ, reason: not valid java name and contains not printable characters */
    private static final short[] f56683 = {2658, 4765, -4208, -2891, 6033, 4281, 1902};

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15937 f56684;

    /* JADX WARN: Code duplicated, block: B:32:0x00f2 A[PHI: r4 r5
      0x00f2: PHI (r4v4 int) = (r4v3 int), (r4v2 int) binds: [B:31:0x00f0, B:13:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x00f2: PHI (r5v4 int) = (r5v3 int), (r5v2 int) binds: [B:31:0x00f0, B:13:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x0211 A[PHI: r12 r19
      0x0211: PHI (r12v4 short) = (r12v3 short), (r12v2 short), (r12v2 short), (r12v2 short), (r12v2 short) binds: [B:57:0x020f, B:15:0x0076, B:13:0x0072, B:10:0x006a, B:7:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x0211: PHI (r19v4 int) = (r19v3 int), (r19v2 int), (r19v2 int), (r19v2 int), (r19v2 int) binds: [B:57:0x020f, B:15:0x0076, B:13:0x0072, B:10:0x006a, B:7:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x0249 A[PHI: r2 r3 r18 r24
      0x0249: PHI (r2v4 java.lang.Object[]) = (r2v2 java.lang.Object[]), (r2v3 java.lang.Object[]), (r2v2 java.lang.Object[]) binds: [B:61:0x0247, B:43:0x0166, B:7:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x0249: PHI (r3v4 char) = (r3v2 char), (r3v3 char), (r3v2 char) binds: [B:61:0x0247, B:43:0x0166, B:7:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x0249: PHI (r18v4 int) = (r18v3 int), (r18v2 int), (r18v2 int) binds: [B:61:0x0247, B:43:0x0166, B:7:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x0249: PHI (r24v5 short) = (r24v4 short), (r24v3 short), (r24v3 short) binds: [B:61:0x0247, B:43:0x0166, B:7:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x027c A[PHI: r17
      0x027c: PHI (r17v4 char) = (r17v3 char), (r17v2 char) binds: [B:65:0x027a, B:10:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x02ac A[PHI: r6 r7 r8 r10 r11 r14 r15 r16
      0x02ac: PHI (r6v3 java.lang.String) = 
      (r6v2 java.lang.String)
      (r6v2 java.lang.String)
      (r6v2 java.lang.String)
      (r6v2 java.lang.String)
      (r6v4 java.lang.String)
     binds: [B:69:0x02aa, B:39:0x0144, B:35:0x0126, B:25:0x00bb, B:21:0x0097] A[DONT_GENERATE, DONT_INLINE]
      0x02ac: PHI (r7v4 int) = (r7v2 int), (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int) binds: [B:69:0x02aa, B:39:0x0144, B:35:0x0126, B:25:0x00bb, B:21:0x0097] A[DONT_GENERATE, DONT_INLINE]
      0x02ac: PHI (r8v4 short[]) = (r8v2 short[]), (r8v2 short[]), (r8v2 short[]), (r8v3 short[]), (r8v2 short[]) binds: [B:69:0x02aa, B:39:0x0144, B:35:0x0126, B:25:0x00bb, B:21:0x0097] A[DONT_GENERATE, DONT_INLINE]
      0x02ac: PHI (r10v4 int) = (r10v2 int), (r10v2 int), (r10v2 int), (r10v3 int), (r10v2 int) binds: [B:69:0x02aa, B:39:0x0144, B:35:0x0126, B:25:0x00bb, B:21:0x0097] A[DONT_GENERATE, DONT_INLINE]
      0x02ac: PHI (r11v4 int) = (r11v2 int), (r11v2 int), (r11v2 int), (r11v3 int), (r11v2 int) binds: [B:69:0x02aa, B:39:0x0144, B:35:0x0126, B:25:0x00bb, B:21:0x0097] A[DONT_GENERATE, DONT_INLINE]
      0x02ac: PHI (r14v4 short[]) = (r14v2 short[]), (r14v2 short[]), (r14v3 short[]), (r14v2 short[]), (r14v2 short[]) binds: [B:69:0x02aa, B:39:0x0144, B:35:0x0126, B:25:0x00bb, B:21:0x0097] A[DONT_GENERATE, DONT_INLINE]
      0x02ac: PHI (r15v4 int) = (r15v2 int), (r15v2 int), (r15v3 int), (r15v2 int), (r15v2 int) binds: [B:69:0x02aa, B:39:0x0144, B:35:0x0126, B:25:0x00bb, B:21:0x0097] A[DONT_GENERATE, DONT_INLINE]
      0x02ac: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:69:0x02aa, B:39:0x0144, B:35:0x0126, B:25:0x00bb, B:21:0x0097] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m40931(String str) {
        int iM3169;
        int i;
        int i2;
        int i3 = C3690.f12684;
        int i4 = C0487.f2131;
        int iM31610 = C0773.m3169("ۛܿ") ^ i4;
        int i5 = ((iM31610 ^ i3) * (-24639)) ^ 613553955;
        Object[] objArr = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM31610 ^ (-1606711869);
        C15937 c15937 = null;
        char c = 0;
        int iM2761 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        short s = 0;
        int i10 = 0;
        int i11 = 0;
        char c2 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 241055965;
        short s2 = 0;
        short[] sArr3 = null;
        String strM6233 = null;
        int i15 = 0;
        while (true) {
            i14 = i6 ^ (i5 & (((i14 ^ i3) * (-19165)) >> 31));
            switch (i14) {
                case -2040996802:
                case 213523036:
                    if (C2834.m9344() >= 0) {
                        iM3169 = (C0773.m3169("֨֫") + i4) * 27;
                        i = ((iM3169 ^ i3) * 27681) ^ (-843218858);
                        i2 = 268016445;
                    } else {
                        iM3169 = (C0773.m3169("ܺۛ") ^ i3) * 69;
                        i = ((iM3169 ^ i4) * 3405) ^ (-688920829);
                        i2 = -2130719177;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1796043195:
                case -361209354:
                    s2 = sArr3[c2];
                    i12 = s2 * s2;
                    if (C0487.f2131 <= 0) {
                        iM3169 = C0773.m3169("۟ۙ") ^ i3;
                        i = ((iM3169 ^ i4) * (-31493)) ^ (-160248419);
                        i2 = -1645996643;
                    } else {
                        iM3169 = (C0773.m3169("ܳۖ") + i4) * (-127);
                        i = ((iM3169 ^ i3) * 32627) ^ 978807449;
                        i2 = -449664704;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1690877424:
                case 1035873744:
                    objArr[c] = str;
                    if (C1080.f3865 >= 0) {
                        iM3169 = (C0619.m2761("ۨۤ") + i4) * (-33);
                        i = ((iM3169 ^ i3) * (-19117)) ^ (-1296949466);
                        i2 = 1512058628;
                    } else {
                        iM3169 = (i4 - C0619.m2761("۟ۗ")) * (-93);
                        i = ((iM3169 ^ i3) * 15407) ^ 826170435;
                        i2 = 1116311870;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1662867301:
                case -345354971:
                    strM6233 = C1783.m6233(sArr2, i8, i9, i10);
                    if (RunnableC3055.f9898 >= 0) {
                        iM3169 = (C0619.m2761("ۨۤ") + i4) * (-33);
                        i = ((iM3169 ^ i3) * (-19117)) ^ (-1296949466);
                        i2 = 1512058628;
                    } else {
                        iM3169 = (i3 - C0773.m3169("᩺᩺")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i = ((iM3169 ^ i4) * (-18801)) ^ (-1875299462);
                        i2 = 546811374;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1603701144:
                case 1368469162:
                    if (C3734.f12817 >= 0) {
                        iM3169 = (C0773.m3169("֨֫") + i4) * 27;
                        i = ((iM3169 ^ i3) * 27681) ^ (-843218858);
                        i2 = 268016445;
                    } else {
                        iM3169 = C0773.m3169("۟ۙ") ^ i3;
                        i = ((iM3169 ^ i4) * (-31493)) ^ (-160248419);
                        i2 = -1645996643;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1558737113:
                case 445749100:
                    if (RunnableC3055.f9898 >= 0) {
                        iM3169 = (C0773.m3169("֨֫") + i4) * 27;
                        i = ((iM3169 ^ i3) * 27681) ^ (-843218858);
                        i2 = 268016445;
                    } else {
                        iM3169 = C0773.m3169("ۢ֫") ^ i4;
                        i = ((iM3169 ^ i3) * (-7495)) ^ 595332811;
                        i2 = -1859567569;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1467396762:
                case -771150123:
                    c2 = 0;
                    if (RunnableC0334.f1808 <= 0) {
                        iM3169 = C0773.m3169("ۢ֫") ^ i4;
                        i = ((iM3169 ^ i3) * (-7495)) ^ 595332811;
                        i2 = -1859567569;
                    } else {
                        iM3169 = C0773.m3169("ܽ֨") ^ i4;
                        i = ((iM3169 ^ i3) * (-11049)) ^ 551310118;
                        i2 = -49692443;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1287326845:
                case -1150732581:
                    i13 = i12 + 16793604;
                    s = 8196;
                    if (C20932.f66974 <= 0) {
                        iM3169 = (C0773.m3169("֨֫") + i4) * 27;
                        i = ((iM3169 ^ i3) * 27681) ^ (-843218858);
                        i2 = 268016445;
                    } else {
                        iM3169 = (C0773.m3169("᩹֫") ^ i3) * 91;
                        i = ((iM3169 ^ i4) * 19483) ^ 506188638;
                        i2 = -411843306;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1219880673:
                case 645718144:
                    sArr3 = f56683;
                    if (RunnableC3646.f12471) {
                        iM3169 = (C0619.m2761("ۨۤ") + i4) * (-33);
                        i = ((iM3169 ^ i3) * (-19117)) ^ (-1296949466);
                        i2 = 1512058628;
                    } else {
                        iM3169 = C0773.m3169("ۗ᩷") ^ i3;
                        i = ((iM3169 ^ i4) * 419) ^ (-1950142885);
                        i2 = -319127243;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1207431216:
                case 488178404:
                    if ((s2 * s) - i13 > 0) {
                        iM3169 = C0773.m3169("ᩴ᩺") ^ i3;
                        i = ((iM3169 ^ i4) * 18431) ^ 1630625388;
                        i2 = -1079524824;
                    } else {
                        iM3169 = C0619.m2761("ۢ᩶") ^ i4;
                        i = ((iM3169 ^ i3) * (-19835)) ^ 1886422096;
                        i2 = 1009564477;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1057709405:
                case 135036528:
                    sArr2 = f56683;
                    i8 = 4;
                    i9 = 3;
                    if (C3734.m12152() >= 0) {
                        iM3169 = (C0619.m2761("ۨۤ") + i4) * (-33);
                        i = ((iM3169 ^ i3) * (-19117)) ^ (-1296949466);
                        i2 = 1512058628;
                    } else {
                        iM3169 = (C0619.m2761("ۘۧ") + i4) * (-97);
                        i = ((iM3169 ^ i3) * 21975) ^ 885767169;
                        i2 = -156548580;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -762161301:
                case 1996230116:
                    C3690.m11987();
                    C1343.m4943();
                    break;
                case -482474674:
                case 1558544892:
                    c15937.m43859(C0619.m2761(strM6233) ^ 2104675133);
                    break;
                case -384540327:
                case 1017220820:
                    objArr = new Object[1];
                    c = 0;
                    if (AbstractC3624.f12429 <= 0) {
                        iM3169 = C0773.m3169("۟ۙ") ^ i3;
                        i = ((iM3169 ^ i4) * (-31493)) ^ (-160248419);
                        i2 = -1645996643;
                    } else {
                        iM3169 = (C0773.m3169("ۙ֫") ^ i3) * 21;
                        i = ((iM3169 ^ i4) * 28005) ^ 1679460586;
                        i2 = -1295203862;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -151164419:
                case 727520241:
                    i10 = 35485;
                    iM3169 = C0773.m3169("ܰܿ") ^ i3;
                    i = ((iM3169 ^ i4) * 29163) ^ (-1037424866);
                    i2 = 879032404;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -115238581:
                case 646463399:
                    C0269.m1783(c15937, C3734.m12148(iM2761 ^ i15, objArr));
                    break;
                case 57258791:
                case 1255987840:
                    iM2761 = C0619.m2761(C1564.m5510(sArr, i11, i7, i10));
                    i15 = 2102746076;
                    if (C3448.m11248() != 0) {
                        iM3169 = (C0773.m3169("ܺۛ") ^ i3) * 69;
                        i = ((iM3169 ^ i4) * 3405) ^ (-688920829);
                        i2 = -2130719177;
                    } else {
                        iM3169 = C0773.m3169("ۖ۬") ^ i4;
                        i = ((iM3169 ^ i3) * (-14695)) ^ (-157298414);
                        i2 = -296745851;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 177692475:
                case 679865368:
                    c15937 = this.f56684;
                    if (str == null) {
                        int iM2762 = C0619.m2761("ۗۨ") ^ i3;
                        i5 = ((iM2762 ^ i4) * (-25809)) ^ 922529012;
                        i6 = iM2762 ^ (-33081038);
                    } else {
                        iM3169 = (i4 - C0773.m3169("᩺֨")) * 85;
                        i = ((iM3169 ^ i3) * 11341) ^ 1007854055;
                        i2 = -81020250;
                        i6 = iM3169 ^ i2;
                        i5 = i;
                    }
                    break;
                case 1050712318:
                case 1619399133:
                    sArr = f56683;
                    i11 = 1;
                    i7 = 3;
                    if (C23916.f77426 <= 0) {
                        iM3169 = (C0619.m2761("ۨۤ") + i4) * (-33);
                        i = ((iM3169 ^ i3) * (-19117)) ^ (-1296949466);
                        i2 = 1512058628;
                    } else {
                        iM3169 = C0619.m2761("ۤۧ") ^ i3;
                        i = ((iM3169 ^ i4) * (-24775)) ^ (-526594236);
                        i2 = 1949255523;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 1093138824:
                case 2001988594:
                    C0862.m3503();
                    C2023.m6964();
                    iM3169 = (C0773.m3169("֨֫") + i4) * 27;
                    i = ((iM3169 ^ i3) * 27681) ^ (-843218858);
                    i2 = 268016445;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                default:
                    i10 = 5358;
                    iM3169 = C0773.m3169("ܰܿ") ^ i3;
                    i = ((iM3169 ^ i4) * 29163) ^ (-1037424866);
                    i2 = 879032404;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    public C17429(C15937 c15937) {
        this.f56684 = c15937;
    }

    @Override // l.InterfaceC7509
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo924() {
        return C2375.m8058(this.f56684);
    }
}
