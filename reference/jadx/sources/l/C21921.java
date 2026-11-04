package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩷۠֫, reason: contains not printable characters */
/* JADX INFO: compiled from: F6N1 */
/* JADX INFO: loaded from: classes.dex */
public final class C21921 {

    /* JADX INFO: renamed from: ܰۗ᩵, reason: not valid java name and contains not printable characters */
    private static final short[] f70783 = {791, 10535, 10524, 10515, 10512, 10526, 10519, 10578, 10502, 10525, 10578, 10518, 10519, 10526, 10519, 10502, 10519, 10578, 10526, 10519, 10517, 10515, 10513, 10507, 10578, 10518, 10515, 10502, 10515, 10568, 10578, 7026, -3377, -3362, -3370, -3381, -3370, -3368, -3381, -3381, -3383, -3372, -3375, -3362, -3368, -3377, -3384, -3381, -3383, -3372, -3375, -3362, -3368, -3377, -3384, -3346, -3371, -3366, -3367, -3369, -3362, -3429, -3377, -3372, -3429, -3369, -3374, -3384, -3377, -3429, -3369, -3362, -3364, -3366, -3368, -3390, -3429, -3381, -3383, -3372, -3375, -3362, -3368, -3377, -3384, -3346, -3371, -3366, -3367, -3369, -3362, -3429, -3377, -3372, -3429, -3370, -3372, -3379, -3362, -3429, -3369, -3362, -3364, -3366, -3368, -3390, -3429, -3381, -3383, -3372, -3375, -3362, -3368, -3377, -3455, -3429};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized void m49614(AbstractC22044 abstractC22044, AbstractC22044 abstractC22045) {
        short s = f70783[31];
        int i = s + 12224;
        int i2 = (s * s) + 149426176;
        int i3 = (i2 + i2) - (i * i) < 0 ? 30974 : 62139;
        synchronized (C21921.class) {
            m49613(C2310.m7806(abstractC22044, C1146.m4222(f70783, 32, 4, i3)));
            m49613(C2310.m7806(abstractC22044, C3779.m12266(f70783, 36, 3, i3)));
            try {
                AbstractC22044 abstractC22044M1774 = C0269.m1774(abstractC22045, C1519.m5399(f70783, 39, 8, i3));
                Iterator itM53423 = C23916.m53423(C2310.m7806(abstractC22044, C2287.m7749(f70783, 47, 8, i3)).mo4299(true));
                while (C1826.m6317(itM53423)) {
                    AbstractC22044 abstractC22046 = (AbstractC22044) C4238.m13529(itM53423);
                    try {
                        if (C2878.m9481(abstractC22046)) {
                            if (!C2878.m9481(abstractC22044M1774) && !abstractC22044M1774.mo4274()) {
                                return;
                            }
                            AbstractC22044 abstractC22044M1775 = C0269.m1774(abstractC22044M1774, C3998.m12926(abstractC22046));
                            if (!C1826.m6303(abstractC22044M1775)) {
                                abstractC22046.mo4301(abstractC22044M1775);
                            }
                        }
                    } catch (Exception e) {
                        StringBuilder sb = new StringBuilder();
                        C1783.m6234(sb, C3779.m12266(f70783, 85, 31, i3));
                        C1783.m6234(sb, RunnableC3646.m11806(abstractC22046));
                        C3033.m9846(C2023.m6952(sb), e);
                    }
                }
            } catch (Exception e2) {
                RunnableC1848.m6362(C3734.m12149(f70783, 55, 30, i3), e2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0142 A[PHI: r4 r5
      0x0142: PHI (r4v4 java.lang.StringBuilder) = (r4v3 java.lang.StringBuilder), (r4v2 java.lang.StringBuilder), (r4v2 java.lang.StringBuilder) binds: [B:48:0x0140, B:44:0x011e, B:29:0x00b4] A[DONT_GENERATE, DONT_INLINE]
      0x0142: PHI (r5v4 java.lang.String) = (r5v2 java.lang.String), (r5v3 java.lang.String), (r5v2 java.lang.String) binds: [B:48:0x0140, B:44:0x011e, B:29:0x00b4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x0188  */
    /* JADX WARN: Code duplicated, block: B:61:0x01f7 A[PHI: r7 r15
      0x01f7: PHI (r7v4 int) = (r7v3 int), (r7v2 int) binds: [B:60:0x01f5, B:16:0x007e] A[DONT_GENERATE, DONT_INLINE]
      0x01f7: PHI (r15v4 short[]) = (r15v3 short[]), (r15v2 short[]) binds: [B:60:0x01f5, B:16:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:80:0x02be A[PHI: r9 r10 r13
      0x02be: PHI (r9v4 short) = (r9v3 short), (r9v2 short) binds: [B:79:0x02bc, B:71:0x027a] A[DONT_GENERATE, DONT_INLINE]
      0x02be: PHI (r10v4 short) = (r10v3 short), (r10v2 short) binds: [B:79:0x02bc, B:71:0x027a] A[DONT_GENERATE, DONT_INLINE]
      0x02be: PHI (r13v3 int) = (r13v2 int), (r13v4 int) binds: [B:79:0x02bc, B:71:0x027a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:84:0x02f6 A[PHI: r11 r12 r21
      0x02f6: PHI (r11v4 int) = (r11v2 int), (r11v3 int), (r11v2 int) binds: [B:83:0x02f4, B:75:0x029b, B:23:0x00a5] A[DONT_GENERATE, DONT_INLINE]
      0x02f6: PHI (r12v4 short) = (r12v2 short), (r12v3 short), (r12v2 short) binds: [B:83:0x02f4, B:75:0x029b, B:23:0x00a5] A[DONT_GENERATE, DONT_INLINE]
      0x02f6: PHI (r21v5 char) = (r21v4 char), (r21v3 char), (r21v3 char) binds: [B:83:0x02f4, B:75:0x029b, B:23:0x00a5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x0324  */
    /* JADX WARN: Code duplicated, block: B:90:0x0355  */
    /* JADX WARN: Code duplicated, block: B:94:0x038b A[PHI: r16
      0x038b: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:93:0x0389, B:26:0x00ae, B:9:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49613(AbstractC22044 abstractC22044) {
        int iM3169;
        int i;
        int i2;
        int i3 = C2419.f7754;
        int i4 = C3690.f12684;
        int iM2761 = C0619.m2761("۟۠") ^ i4;
        int i5 = ((iM2761 ^ i3) * 25065) ^ 215206894;
        String strM4220 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM2761 ^ 1885116628;
        String strM4056 = null;
        boolean zM12147 = false;
        int i7 = 0;
        short s = 0;
        short s2 = 0;
        int i8 = 0;
        short s3 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 1267783833;
        char c = 0;
        StringBuilder sb = null;
        Exception exc = null;
        boolean zM6303 = false;
        while (true) {
            i11 = i6 ^ (i5 & (((i11 ^ i3) * 23353) >> 31));
            switch (i11) {
                case -1813581001:
                case -333604568:
                    C3099.m10095();
                    if (C1826.f6190 > 0) {
                        iM3169 = (C0619.m2761("֨۫") + i3) * 35;
                        i = ((iM3169 ^ i4) * (-23307)) ^ (-952777983);
                        i2 = -1410267520;
                    } else {
                        iM3169 = C0773.m3169("ۢ᩷") ^ i4;
                        i = ((iM3169 ^ i3) * (-14161)) ^ (-491942036);
                        i2 = 1508228978;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1697101028:
                case 1837641006:
                    sArr2 = f70783;
                    i7 = 1;
                    if (C2702.f8586 <= 0) {
                        iM3169 = C0773.m3169("ۢ᩷") ^ i4;
                        i = ((iM3169 ^ i3) * (-14161)) ^ (-491942036);
                        i2 = 1508228978;
                    } else {
                        iM3169 = C0619.m2761("᩸᩻") ^ i4;
                        i = ((iM3169 ^ i3) * (-3565)) ^ 1703407678;
                        i2 = -322017367;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1538613148:
                case 1682189033:
                    if (C2702.f8586 > 0) {
                        iM3169 = (C0619.m2761("֨۫") + i3) * 35;
                        i = ((iM3169 ^ i4) * (-23307)) ^ (-952777983);
                        i2 = -1410267520;
                    } else {
                        iM3169 = C0773.m3169("ܳ᩻") ^ i4;
                        i = ((iM3169 ^ i3) * 4943) ^ (-819706828);
                        i2 = 463146532;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1458820673:
                case -767661622:
                    strM4056 = C1080.m4056(sArr2, i7, 30, i10);
                    iM3169 = C0619.m2761("֡ܰ") ^ i3;
                    i = ((iM3169 ^ i4) * (-17771)) ^ (-430750671);
                    i2 = -1377479520;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1377405541:
                case 277413852:
                    if (RunnableC3646.f12471) {
                        iM3169 = (C0619.m2761("֨۫") + i3) * 35;
                        i = ((iM3169 ^ i4) * (-23307)) ^ (-952777983);
                        i2 = -1410267520;
                    } else {
                        iM3169 = (C0773.m3169("֡ᩴ") + i4) * 93;
                        i = ((iM3169 ^ i3) * 27819) ^ 816470202;
                        i2 = 745354546;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1371288043:
                case -1027513671:
                    c = 0;
                    if (C4238.m13540() <= 0) {
                        iM3169 = (C0619.m2761("᩵᩺") ^ i4) * (-89);
                        i = ((iM3169 ^ i3) * 11089) ^ 799643507;
                        i2 = 2052745687;
                    } else {
                        iM3169 = C0619.m2761("֨ۡ") ^ i4;
                        i = ((iM3169 ^ i3) * 26603) ^ (-515590610);
                        i2 = 337929638;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1351911843:
                case -660534156:
                    i9 = s + s3;
                    if (AbstractC0116.f1064 <= 0) {
                        iM3169 = (C0773.m3169("۠ᩳ") ^ i4) * 37;
                        i = ((iM3169 ^ i3) * 15405) ^ (-1176101395);
                        i2 = 1964993155;
                    } else {
                        iM3169 = (i3 - C0619.m2761("۠᩷")) * 39;
                        i = ((iM3169 ^ i4) * (-30923)) ^ (-148195752);
                        i2 = -47331895;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1342978896:
                case 914008383:
                    strM4220 = C1146.m4220(abstractC22044);
                    if (AbstractC0641.f2496 >= 0) {
                        iM3169 = C0773.m3169("ܳ᩻") ^ i4;
                        i = ((iM3169 ^ i3) * 4943) ^ (-819706828);
                        i2 = 463146532;
                    } else {
                        iM3169 = (C0773.m3169("ۘᩳ") ^ i3) * (-113);
                        i = ((iM3169 ^ i4) * (-22473)) ^ (-64998107);
                        i2 = 64712444;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1061202045:
                case 1457472527:
                    C1783.m6234(sb, strM4220);
                    C3033.m9846(C2023.m6952(sb), exc);
                    break;
                case -972476527:
                case -873867739:
                    break;
                case -844258426:
                case 627619564:
                    C2023.m6964();
                    iM3169 = (C0619.m2761("֨۫") + i3) * 35;
                    i = ((iM3169 ^ i4) * (-23307)) ^ (-952777983);
                    i2 = -1410267520;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -768220610:
                case 1138779616:
                    i10 = 10610;
                    iM3169 = C0773.m3169("ܰ᩹") ^ i3;
                    i = ((iM3169 ^ i4) * (-3847)) ^ (-938444359);
                    i2 = -436267539;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -714685800:
                case 2113566415:
                    i10 = 15860;
                    iM3169 = C0773.m3169("ܰ᩹") ^ i3;
                    i = ((iM3169 ^ i4) * (-3847)) ^ (-938444359);
                    i2 = -436267539;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -683910635:
                case 59336583:
                    C2702.m8876();
                    break;
                case -677165155:
                case 630333573:
                    zM6303 = C1826.m6303(abstractC22044);
                    iM3169 = (C0619.m2761("ۢᩳ") + i3) * (-111);
                    i = ((iM3169 ^ i4) * (-1995)) ^ 1606586283;
                    i2 = -1870501179;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -675772818:
                case 1945244644:
                    if (C20932.f66974 <= 0) {
                        iM3169 = (C0619.m2761("֨۫") + i3) * 35;
                        i = ((iM3169 ^ i4) * (-23307)) ^ (-952777983);
                        i2 = -1410267520;
                    } else {
                        iM3169 = (C0773.m3169("ܿܰ") ^ i4) * 91;
                        i = ((iM3169 ^ i3) * 7529) ^ 1237018582;
                        i2 = -1937647165;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -661056155:
                case 128221616:
                    if (zM12147) {
                        iM3169 = (C0619.m2761("᩹᩶") ^ i4) * (-39);
                        i = ((iM3169 ^ i3) * (-30557)) ^ 332476521;
                        i2 = -1568400176;
                    } else {
                        iM3169 = (C0619.m2761("ۜᩴ") + i4) * 5;
                        i = ((iM3169 ^ i3) * (-16247)) ^ 2067629325;
                        i2 = -746922010;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -647554962:
                case 1271074533:
                    zM12147 = C3734.m12147(abstractC22044);
                    iM3169 = (C0773.m3169("۫ۗ") + i3) * 95;
                    i = ((iM3169 ^ i4) * (-29745)) ^ 663048899;
                    i2 = 2086396943;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -579263964:
                case 2035496383:
                    C23916.m53419();
                    if (C2023.f6737) {
                        iM3169 = (C0619.m2761("֨۫") + i3) * 35;
                        i = ((iM3169 ^ i4) * (-23307)) ^ (-952777983);
                        i2 = -1410267520;
                    } else {
                        iM3169 = (C0619.m2761("᩵᩺") ^ i4) * (-89);
                        i = ((iM3169 ^ i3) * 11089) ^ 799643507;
                        i2 = 2052745687;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -465200241:
                case 2138181370:
                    sb = new StringBuilder(strM4056);
                    if (C2354.f7599 >= 0) {
                        iM3169 = C0773.m3169("ܳ᩻") ^ i4;
                        i = ((iM3169 ^ i3) * 4943) ^ (-819706828);
                        i2 = 463146532;
                    } else {
                        iM3169 = (C0773.m3169("ۢ᩹") + i4) * 35;
                        i = ((iM3169 ^ i3) * 12251) ^ (-579769510);
                        i2 = -1390931014;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -373412418:
                case 1181848529:
                    try {
                        StringBuilder sb2 = new StringBuilder(strM4056);
                        C3779.m12258(sb2, C1146.m4220(abstractC22044));
                        C20653.m47269(C2023.m6952(sb2));
                        iM3169 = (C0619.m2761("᩹᩶") ^ i4) * (-39);
                        i = ((iM3169 ^ i3) * (-30557)) ^ 332476521;
                        i2 = -1568400176;
                    } catch (Exception e) {
                        exc = e;
                        iM3169 = C0773.m3169("ۚۨ") ^ i4;
                        i = ((iM3169 ^ i3) * (-14731)) ^ (-158520191);
                        i2 = 1099011284;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -79900608:
                case 1814504348:
                    if (RunnableC3055.f9898 >= 0) {
                        iM3169 = (C0773.m3169("᩹ܳ") ^ i3) * 89;
                        i = ((iM3169 ^ i4) * 21761) ^ 1562918461;
                        i2 = -723409484;
                    } else {
                        iM3169 = C0773.m3169("֡ۨ") ^ i3;
                        i = ((iM3169 ^ i4) * (-24719)) ^ (-597974089);
                        i2 = 1607463555;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 6498860:
                case 1148919220:
                    i8 = s * s2;
                    s3 = 429;
                    if (C0487.f2131 <= 0) {
                        iM3169 = (C0619.m2761("᩵᩺") ^ i4) * (-89);
                        i = ((iM3169 ^ i3) * 11089) ^ 799643507;
                        i2 = 2052745687;
                    } else {
                        iM3169 = (C0773.m3169("۫ۙ") ^ i3) * 27;
                        i = ((iM3169 ^ i4) * 9249) ^ (-353941147);
                        i2 = -872710415;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 17495933:
                case 926169548:
                    if (i8 - (i9 * i9) > 0) {
                        iM3169 = C0773.m3169("֫ᩳ") ^ i4;
                        i = ((iM3169 ^ i3) * (-29289)) ^ (-1829878215);
                        i2 = 1124728199;
                    } else {
                        iM3169 = (C0773.m3169("ۚܳ") ^ i4) * 79;
                        i = ((iM3169 ^ i3) * (-18243)) ^ 656319607;
                        i2 = -1088868119;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 109756856:
                case 1320092245:
                    sArr = f70783;
                    if (C1343.m4943()) {
                        iM3169 = C0619.m2761("ᩴ֫") ^ i3;
                        i = ((iM3169 ^ i4) * 25055) ^ (-803717308);
                        i2 = 630361510;
                    } else {
                        iM3169 = (C0773.m3169("᩹ܳ") ^ i3) * 89;
                        i = ((iM3169 ^ i4) * 21761) ^ 1562918461;
                        i2 = -723409484;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 465707262:
                case 1691413844:
                    RunnableC3055.m9933();
                    if (C2310.f7472 < 0) {
                        iM3169 = (C0619.m2761("֨۫") + i3) * 35;
                        i = ((iM3169 ^ i4) * (-23307)) ^ (-952777983);
                        i2 = -1410267520;
                    } else {
                        iM3169 = (C0773.m3169("᩹ܳ") ^ i3) * 89;
                        i = ((iM3169 ^ i4) * 21761) ^ 1562918461;
                        i2 = -723409484;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 718770943:
                case 1996364896:
                    s = sArr[c];
                    s2 = 1716;
                    if (C0773.f2792 <= 0) {
                        iM3169 = (C0773.m3169("۠ᩳ") ^ i4) * 37;
                        i = ((iM3169 ^ i3) * 15405) ^ (-1176101395);
                        i2 = 1964993155;
                    } else {
                        iM3169 = (C0619.m2761("ۢ᩶") ^ i4) * 39;
                        i = ((iM3169 ^ i3) * (-25473)) ^ (-1805383294);
                        i2 = -1753434304;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 1126789966:
                case 2087251010:
                    if (zM6303) {
                        iM3169 = C0619.m2761("ܳۧ") ^ i3;
                        i = ((iM3169 ^ i4) * (-24417)) ^ 658022729;
                        i2 = -1011603077;
                    } else {
                        iM3169 = (C0619.m2761("᩹᩶") ^ i4) * (-39);
                        i = ((iM3169 ^ i3) * (-30557)) ^ 332476521;
                        i2 = -1568400176;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 1233771194:
                case 1729499591:
                    if (AbstractC0641.f2496 >= 0) {
                        iM3169 = (C0619.m2761("֨۫") + i3) * 35;
                        i = ((iM3169 ^ i4) * (-23307)) ^ (-952777983);
                        i2 = -1410267520;
                    } else {
                        iM3169 = (C0773.m3169("᩶ܳ") ^ i3) * (-119);
                        i = ((iM3169 ^ i4) * 23365) ^ 272240592;
                        i2 = 1290171659;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                default:
                    if (C20932.m47848() != 0) {
                        iM3169 = (C0773.m3169("ܿܰ") ^ i4) * 91;
                        i = ((iM3169 ^ i3) * 7529) ^ 1237018582;
                        i2 = -1937647165;
                    } else {
                        iM3169 = C0773.m3169("ᩴܳ") ^ i3;
                        i = ((iM3169 ^ i4) * 9313) ^ 1398453017;
                        i2 = 641152160;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }
}
