package l;

import bin.mt.plugin.api.translation.BatchTranslationEngine;
import bin.mt.plugin.api.translation.TranslationEngine;
import com.google.android.material.slider.BaseSlider;
import java.util.Arrays;

/* JADX INFO: renamed from: l.᩸۬ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: U7HQ */
/* JADX INFO: loaded from: classes.dex */
public final class C22825 implements BatchTranslationEngine.BatchingStrategy {

    /* JADX INFO: renamed from: ۨۘܺ, reason: not valid java name and contains not printable characters */
    private static final short[] f73970 = {4645, -10034};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final TranslationEngine.TextLengthCalculator f73971;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f73972;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f73973;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f73974;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f73975;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f73976;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f73977;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f73978;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f73979;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f73980;

    @Override // bin.mt.plugin.api.translation.BatchTranslationEngine.BatchingStrategy
    public final void reset() {
        int i = 0;
        int i2 = 0;
        int i3 = 320177002;
        int i4 = C3099.f10023;
        int i5 = C2419.f7754;
        int iM3169 = C0773.m3169("᩻ܳ") ^ i5;
        int i6 = ((iM3169 ^ i4) * (-11861)) ^ (-1167862159);
        int i7 = -2140712414;
        while (true) {
            i3 = ((((i3 ^ i4) * (-24925)) >> 31) & i6) ^ (iM3169 ^ i7);
            switch (i3) {
                case -1903767603:
                case 616890550:
                    i2 = -1;
                    if (C1321.f4751 >= 0) {
                        iM3169 = C0773.m3169("ۘۧ") ^ i5;
                        i6 = ((iM3169 ^ i4) * 32743) ^ 395399897;
                        i7 = -938086072;
                    } else {
                        iM3169 = (C0619.m2761("۫᩷") ^ i5) * 89;
                        i6 = ((iM3169 ^ i4) * (-6715)) ^ 1855877508;
                        i7 = -1123992186;
                    }
                    break;
                case -1871166355:
                case 820414437:
                    this.f73975 = 0L;
                    if (C1519.f5300 >= 0) {
                        iM3169 = C0619.m2761("ۚ۠") ^ i5;
                        i6 = ((iM3169 ^ i4) * (-24617)) ^ (-1441972758);
                        i7 = 1846852005;
                    } else {
                        iM3169 = (C0773.m3169("ۧۡ") ^ i5) * 89;
                        i6 = ((iM3169 ^ i4) * 13955) ^ 1063895810;
                        i7 = -2017326315;
                    }
                    break;
                case -1233285725:
                case -342548812:
                    if (C11235.f35427 >= 0) {
                        iM3169 = (C0773.m3169("ۚ᩵") + i4) * 127;
                        i6 = ((iM3169 ^ i5) * (-8597)) ^ (-569859206);
                        i7 = -1299351450;
                    } else {
                        iM3169 = C0773.m3169("ᩳܳ") ^ i4;
                        i6 = ((iM3169 ^ i5) * (-10731)) ^ 1228958928;
                        i7 = -1634630110;
                    }
                    break;
                case -1133873251:
                case 135507888:
                    i = 0;
                    if (RunnableC3055.m9933() != 0) {
                        iM3169 = (C0773.m3169("ۚ᩵") + i4) * 127;
                        i6 = ((iM3169 ^ i5) * (-8597)) ^ (-569859206);
                        i7 = -1299351450;
                    } else {
                        iM3169 = C0773.m3169("ۘ᩻") ^ i5;
                        i6 = ((iM3169 ^ i4) * 27327) ^ (-1420005242);
                        i7 = 1040884362;
                    }
                    break;
                case -1041451694:
                case -127932188:
                    if (C1080.f3865 >= 0) {
                        iM3169 = (C0619.m2761("ۗۨ") ^ i5) * 51;
                        i6 = ((iM3169 ^ i4) * (-31733)) ^ 393231406;
                        i7 = 1798505646;
                    } else {
                        iM3169 = (C0773.m3169("ܽۨ") ^ i4) * 25;
                        i6 = ((iM3169 ^ i5) * 20219) ^ (-1296120179);
                        i7 = -1222822239;
                    }
                    break;
                case -960477308:
                case 1486282952:
                    if (C2834.m9344() >= 0) {
                        iM3169 = (C0619.m2761("ۗۨ") ^ i5) * 51;
                        i6 = ((iM3169 ^ i4) * (-31733)) ^ 393231406;
                        i7 = 1798505646;
                    } else {
                        iM3169 = C0619.m2761("ۛᩴ") ^ i5;
                        i6 = ((iM3169 ^ i4) * 20903) ^ (-120436123);
                        i7 = 1234934305;
                    }
                    break;
                case -876796255:
                case 1080224717:
                    C2419.m8174();
                    iM3169 = (C0773.m3169("ۚ᩵") + i4) * 127;
                    i6 = ((iM3169 ^ i5) * (-8597)) ^ (-569859206);
                    i7 = -1299351450;
                    break;
                case -865005072:
                case 1506506436:
                    this.f73974 = i2;
                    this.f73972 = i2;
                    break;
                case -729842612:
                case 1149861167:
                    C0950.m3785();
                    if (!C2023.f6737) {
                        iM3169 = (C0773.m3169("ۚ᩵") + i4) * 127;
                        i6 = ((iM3169 ^ i5) * (-8597)) ^ (-569859206);
                        i7 = -1299351450;
                    } else {
                        iM3169 = C0773.m3169("ۘۧ") ^ i5;
                        i6 = ((iM3169 ^ i4) * 32743) ^ 395399897;
                        i7 = -938086072;
                    }
                    break;
                case -525123166:
                case 989708840:
                    if (C2310.f7472 < 0) {
                        iM3169 = (C0619.m2761("ۗۨ") ^ i5) * 51;
                        i6 = ((iM3169 ^ i4) * (-31733)) ^ 393231406;
                        i7 = 1798505646;
                    } else {
                        iM3169 = (C0773.m3169("ۚ᩵") + i4) * 127;
                        i6 = ((iM3169 ^ i5) * (-8597)) ^ (-569859206);
                        i7 = -1299351450;
                    }
                    break;
                case -429677719:
                case 968739493:
                    C0269.m1775();
                    if (C1564.f5401 <= 0) {
                        iM3169 = (i4 - C0773.m3169("ۧ᩺")) * 57;
                        i6 = ((iM3169 ^ i5) * 1099) ^ 259272529;
                        i7 = 1257734041;
                    } else {
                        iM3169 = (C0619.m2761("ۗۨ") ^ i5) * 51;
                        i6 = ((iM3169 ^ i4) * (-31733)) ^ 393231406;
                        i7 = 1798505646;
                    }
                    break;
                case -190655619:
                case 749631694:
                    this.f73978 = i;
                    if (C1343.m4943()) {
                        iM3169 = C0619.m2761("ۘ۬") ^ i4;
                        i6 = ((iM3169 ^ i5) * 21287) ^ 1576151072;
                        i7 = 1756669559;
                    } else {
                        iM3169 = (i4 - C0773.m3169("ۧ᩺")) * 57;
                        i6 = ((iM3169 ^ i5) * 1099) ^ 259272529;
                        i7 = 1257734041;
                    }
                    break;
                case -156550203:
                case 2139379397:
                    this.f73973 = i;
                    this.f73976 = i;
                    if (C3734.f12817 >= 0) {
                        iM3169 = C0619.m2761("ۚ۠") ^ i5;
                        i6 = ((iM3169 ^ i4) * (-24617)) ^ (-1441972758);
                        i7 = 1846852005;
                    } else {
                        iM3169 = C0619.m2761("ۚ۫") ^ i4;
                        i6 = ((iM3169 ^ i5) * 8929) ^ 1398097094;
                        i7 = -690688486;
                    }
                    break;
                case 387571620:
                case 451104540:
                    if (C1321.f4751 >= 0) {
                        iM3169 = (C0619.m2761("ۗۨ") ^ i5) * 51;
                        i6 = ((iM3169 ^ i4) * (-31733)) ^ 393231406;
                        i7 = 1798505646;
                    } else {
                        iM3169 = C0619.m2761("ۡ֨") ^ i5;
                        i6 = ((iM3169 ^ i4) * (-9027)) ^ (-1296838449);
                        i7 = -2078587886;
                    }
                    break;
                case 1088088644:
                case 1663942521:
                    C0619.m2763();
                    C1146.m4231();
                    break;
                default:
                    if (RunnableC1848.m6360()) {
                        iM3169 = C0773.m3169("ۘۧ") ^ i5;
                        i6 = ((iM3169 ^ i4) * 32743) ^ 395399897;
                        i7 = -938086072;
                    } else {
                        iM3169 = (i4 - C0619.m2761("۠ܽ")) * 67;
                        i6 = ((iM3169 ^ i5) * (-23547)) ^ (-1680230842);
                        i7 = 835951733;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:71:0x0258 A[PHI: r5 r6 r7 r17
      0x0258: PHI (r5v4 short) = (r5v2 short), (r5v2 short), (r5v3 short), (r5v2 short) binds: [B:70:0x0256, B:66:0x0237, B:58:0x01f5, B:54:0x01d1] A[DONT_GENERATE, DONT_INLINE]
      0x0258: PHI (r6v4 int) = (r6v2 int), (r6v2 int), (r6v3 int), (r6v2 int) binds: [B:70:0x0256, B:66:0x0237, B:58:0x01f5, B:54:0x01d1] A[DONT_GENERATE, DONT_INLINE]
      0x0258: PHI (r7v3 int) = (r7v2 int), (r7v2 int), (r7v2 int), (r7v4 int) binds: [B:70:0x0256, B:66:0x0237, B:58:0x01f5, B:54:0x01d1] A[DONT_GENERATE, DONT_INLINE]
      0x0258: PHI (r17v5 java.lang.String) = (r17v1 java.lang.String), (r17v2 java.lang.String), (r17v4 java.lang.String), (r17v6 java.lang.String) binds: [B:70:0x0256, B:66:0x0237, B:58:0x01f5, B:54:0x01d1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m51473(char c, int i) {
        int iM3169;
        int i2;
        int iM31610;
        int i3;
        int i4;
        int iM31611;
        int i5;
        String strM2820 = null;
        String strM34865 = null;
        TranslationEngine.TextLengthCalculator textLengthCalculator = null;
        short[] sArr = null;
        short s = 0;
        int i6 = 0;
        int i7 = 0;
        short s2 = 0;
        int i8 = 0;
        short[] sArr2 = null;
        int i9 = -2021612073;
        int i10 = RunnableC0334.f1808;
        int i11 = C0950.f3488;
        int iM31612 = C0773.m3169("ۤ۠") ^ i11;
        int i12 = ((iM31612 ^ i10) * 13415) ^ (-682488195);
        int i13 = iM31612 ^ (-1459219664);
        while (true) {
            String str = null;
            while (true) {
                i9 = ((((i9 ^ i10) * (-16079)) >> 31) & i12) ^ i13;
                switch (i9) {
                    case -1889368976:
                    case 1232861777:
                        str = str;
                        sArr = f73970;
                        if (C0950.f3488 < 0) {
                            iM3169 = (i10 - C0773.m3169("ۧܰ")) * 91;
                            i12 = ((iM3169 ^ i11) * 3153) ^ 1061642576;
                            i2 = -957983556;
                            i13 = iM3169 ^ i2;
                            str = str;
                        }
                        break;
                    case -1663246875:
                    case -1111815529:
                        str = str;
                        if (C13473.f42873 != 0) {
                            iM3169 = C0773.m3169("᩶᩻") ^ i11;
                            i12 = ((iM3169 ^ i10) * (-27185)) ^ 1053779557;
                            i2 = 1370232040;
                        } else {
                            iM3169 = (C0773.m3169("᩹ܶ") + i11) * 25;
                            i12 = ((iM3169 ^ i10) * 23909) ^ 1612171783;
                            i2 = -1964410704;
                        }
                        i13 = iM3169 ^ i2;
                        str = str;
                        break;
                    case -1624210542:
                    case -567828933:
                        str = str;
                        if (C3448.f11240 >= 0) {
                            iM3169 = C0773.m3169("᩶᩻") ^ i11;
                            i12 = ((iM3169 ^ i10) * (-27185)) ^ 1053779557;
                            i2 = 1370232040;
                        } else {
                            iM3169 = (i10 - C0773.m3169("ۗܳ")) * (-75);
                            i12 = ((iM3169 ^ i11) * 5667) ^ (-620274469);
                            i2 = -54814344;
                        }
                        i13 = iM3169 ^ i2;
                        str = str;
                        break;
                    case -1516662861:
                    case -487817416:
                        char[] cArr = new char[i];
                        Arrays.fill(cArr, c);
                        if (!C2023.f6737) {
                            str = new String(cArr);
                            sArr2 = f73970;
                            if (C3077.f9998) {
                                iM31610 = (C0773.m3169("ܳۗ") ^ i11) * (-67);
                                str = str;
                                i3 = ((iM31610 ^ i10) * (-2487)) ^ 21335567;
                                i4 = 748596744;
                            } else {
                                iM31610 = (C0773.m3169("᩷᩹") + i11) * (-5);
                                str = str;
                                i3 = ((iM31610 ^ i10) * (-28349)) ^ (-825543946);
                                i4 = 116135038;
                            }
                            i13 = iM31610 ^ i4;
                            i12 = i3;
                            str = str;
                        }
                        break;
                    case -1290904354:
                    case -964375551:
                        if (C2419.f7754 >= 0) {
                            iM31610 = (C0773.m3169("᩷᩹") + i11) * (-5);
                            str = str;
                            i3 = ((iM31610 ^ i10) * (-28349)) ^ (-825543946);
                            i4 = 116135038;
                            i13 = iM31610 ^ i4;
                            i12 = i3;
                            str = str;
                        }
                        break;
                    case -1275254912:
                    case -861918268:
                        str = str;
                        s2 = 19378;
                        if (C0773.m3161() == 0) {
                            iM3169 = (i11 - C0619.m2761("ᩳ۬")) * 39;
                            i12 = ((iM3169 ^ i10) * (-5241)) ^ 53798243;
                            i2 = 141473473;
                            i13 = iM3169 ^ i2;
                            str = str;
                        }
                        break;
                    case -1049770832:
                    case 1128205184:
                        str = str;
                        strM2820 = AbstractC0641.m2820(sArr2, 1, 1, i8);
                        if (C2310.m7813() > 0) {
                            iM3169 = (C0773.m3169("ۛۙ") + i10) * 75;
                            i12 = ((iM3169 ^ i11) * 19045) ^ (-1754493094);
                            i2 = -2017322409;
                            i13 = iM3169 ^ i2;
                            str = str;
                        }
                        break;
                    case -982057168:
                    case 2083699493:
                        C2354.m7983();
                        C2702.m8876();
                        return 0;
                    case -910535328:
                    case -602496322:
                        str = str;
                        s = sArr[0];
                        i6 = s * s;
                        if (C0487.f2131 <= 0) {
                            iM3169 = C0773.m3169("᩶᩻") ^ i11;
                            i12 = ((iM3169 ^ i10) * (-27185)) ^ 1053779557;
                            i2 = 1370232040;
                        } else {
                            iM3169 = C0619.m2761("ۨ֨") ^ i11;
                            i12 = ((iM3169 ^ i10) * (-28047)) ^ (-1351058823);
                            i2 = -137204776;
                        }
                        i13 = iM3169 ^ i2;
                        str = str;
                        break;
                    case -850401761:
                    case 759255022:
                        if (AbstractC0116.f1064 <= 0) {
                            iM31611 = C0773.m3169("᩷᩻") ^ i11;
                            i12 = ((iM31611 ^ i10) * (-27293)) ^ 181044128;
                            i5 = 1381902328;
                        } else {
                            iM31611 = (C0619.m2761("֨ᩴ") + i10) * (-123);
                            i12 = ((iM31611 ^ i11) * 9857) ^ (-62911460);
                            i5 = 623556930;
                        }
                        i13 = iM31611 ^ i5;
                        break;
                    case -380605523:
                    case 184128196:
                        C13473.m33144();
                        if (C1519.f5300 < 0) {
                        }
                        iM31611 = (C0619.m2761("֨ᩴ") + i10) * (-123);
                        i12 = ((iM31611 ^ i11) * 9857) ^ (-62911460);
                        i5 = 623556930;
                        i13 = iM31611 ^ i5;
                        break;
                    case -89567731:
                    case 951972216:
                        strM34865 = C14442.m34865(strM2820, str, strM2820);
                        textLengthCalculator = this.f73971;
                        if (textLengthCalculator == null) {
                            str = str;
                            iM3169 = C0773.m3169("᩹ܽ") ^ i10;
                            i12 = ((iM3169 ^ i11) * (-4527)) ^ (-1707188497);
                            i2 = 1277159477;
                            i13 = iM3169 ^ i2;
                            str = str;
                        } else {
                            iM31610 = (C0773.m3169("᩺ۗ") + i11) * 91;
                            str = str;
                            i3 = ((iM31610 ^ i10) * (-29359)) ^ (-2093829576);
                            i4 = -673472321;
                            i13 = iM31610 ^ i4;
                            i12 = i3;
                            str = str;
                        }
                        break;
                    case 120134881:
                    case 256597860:
                        str = str;
                        int i14 = s + s2;
                        if ((i14 * i14) - i7 <= 0) {
                            iM3169 = C0619.m2761("ܺܳ") ^ i10;
                            i12 = ((iM3169 ^ i11) * 10797) ^ (-1776317187);
                            i2 = 535599730;
                        } else {
                            iM3169 = C0773.m3169("֨᩺") ^ i11;
                            i12 = ((iM3169 ^ i10) * 7845) ^ (-1134243140);
                            i2 = -1876699816;
                        }
                        i13 = iM3169 ^ i2;
                        str = str;
                        break;
                    case 158672069:
                    case 1509977074:
                        C1826.m6301();
                        iM31611 = C0773.m3169("᩷᩻") ^ i11;
                        i12 = ((iM31611 ^ i10) * (-27293)) ^ 181044128;
                        i5 = 1381902328;
                        i13 = iM31611 ^ i5;
                        break;
                    case 288052286:
                    case 1626940980:
                        str = str;
                        int i15 = 375506884 + i6;
                        i7 = i15 + i15;
                        if (RunnableC1848.f6235) {
                            iM3169 = C0773.m3169("᩶᩻") ^ i11;
                            i12 = ((iM3169 ^ i10) * (-27185)) ^ 1053779557;
                            i2 = 1370232040;
                        } else {
                            iM3169 = C0773.m3169("ۘۡ") ^ i10;
                            i12 = ((iM3169 ^ i11) * (-6585)) ^ (-2086326878);
                            i2 = -2042494394;
                        }
                        i13 = iM3169 ^ i2;
                        str = str;
                        break;
                    case 710116228:
                    case 1341850155:
                        i8 = 55492;
                        iM3169 = C0773.m3169("ܰۧ") ^ i10;
                        i12 = ((iM3169 ^ i11) * (-893)) ^ (-1732578953);
                        i2 = -682400704;
                        i13 = iM3169 ^ i2;
                        str = str;
                        break;
                    case 764916934:
                    case 2040737054:
                        return C3077.m10045(strM34865);
                    case 1043159392:
                    case 2012979428:
                        str = str;
                        if (C2702.f8586 > 0) {
                            iM3169 = C0773.m3169("ᩳ᩻") ^ i11;
                            i12 = ((iM3169 ^ i10) * 22259) ^ 1568365144;
                            i2 = 135814102;
                            i13 = iM3169 ^ i2;
                            str = str;
                        }
                        break;
                    case 1469674376:
                    case 1786720972:
                        return textLengthCalculator.calculate(strM34865);
                    default:
                        i8 = 36597;
                        iM3169 = C0773.m3169("ܰۧ") ^ i10;
                        i12 = ((iM3169 ^ i11) * (-893)) ^ (-1732578953);
                        i2 = -682400704;
                        i13 = iM3169 ^ i2;
                        str = str;
                        break;
                }
            }
            int iM31613 = C0773.m3169("ۜۜ") ^ i10;
            i12 = ((iM31613 ^ i11) * (-499)) ^ (-131530762);
            i13 = iM31613 ^ 419326625;
        }
    }

    public C22825(C19841 c19841, int i, TranslationEngine.TextLengthCalculator textLengthCalculator) {
        int i2 = 0;
        int i3 = 1504639652;
        int i4 = C3734.f12817;
        int i5 = C1080.f3865;
        int iM2761 = C0619.m2761("ۚ۟") ^ i4;
        int i6 = ((iM2761 ^ i5) * (-1075)) ^ (-1629953389);
        int i7 = -1842158797;
        while (true) {
            i3 = ((((i3 ^ i5) * (-15089)) >> 31) & i6) ^ (iM2761 ^ i7);
            switch (i3) {
                case -1879915622:
                case -1158480016:
                    if (!C0619.f2439) {
                        iM2761 = C0773.m3169("ۘۖ") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-23167)) ^ 1780013953;
                        i7 = -1110376409;
                    } else {
                        iM2761 = C0773.m3169("ܰ֡") ^ i5;
                        i6 = ((iM2761 ^ i4) * 31291) ^ 756398819;
                        i7 = -195494839;
                    }
                    break;
                case -1841857435:
                case 323948977:
                    this.f73972 = i2;
                    if (C3492.f12043 <= 0) {
                        iM2761 = (C0619.m2761("֨ۖ") ^ i5) * (-51);
                        i6 = ((iM2761 ^ i4) * 26331) ^ 1237727239;
                        i7 = -2016224917;
                    } else {
                        iM2761 = C0773.m3169("ۢۖ") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-30175)) ^ 1710594047;
                        i7 = 54479203;
                    }
                    break;
                case -1775281170:
                case 1784844052:
                    this.f73977 = i;
                    this.f73971 = textLengthCalculator;
                    return;
                case -1727980053:
                case 959254598:
                    if (C1343.f4799 != 0) {
                        iM2761 = C0773.m3169("ܰ֡") ^ i5;
                        i6 = ((iM2761 ^ i4) * 31291) ^ 756398819;
                        i7 = -195494839;
                    } else {
                        iM2761 = (C0619.m2761("᩺ۚ") + i5) * (-83);
                        i6 = ((iM2761 ^ i4) * (-2627)) ^ (-714569191);
                        i7 = -813011879;
                    }
                    break;
                case -1645975136:
                case 849667785:
                    C1343.m4943();
                    if (C2310.f7472 >= 0) {
                        iM2761 = C0619.m2761("᩶֫") ^ i5;
                        i6 = ((iM2761 ^ i4) * 25967) ^ 1489434358;
                        i7 = 1637322861;
                    } else {
                        iM2761 = C0773.m3169("ܰ֡") ^ i5;
                        i6 = ((iM2761 ^ i4) * 31291) ^ 756398819;
                        i7 = -195494839;
                    }
                    break;
                case -1584739616:
                case 758955178:
                    if (C0487.f2131 <= 0) {
                        iM2761 = C0773.m3169("ܰ֡") ^ i5;
                        i6 = ((iM2761 ^ i4) * 31291) ^ 756398819;
                        i7 = -195494839;
                    } else {
                        iM2761 = (i4 - C0773.m3169("۫᩸")) * 3;
                        i6 = ((iM2761 ^ i5) * (-10013)) ^ (-1135015263);
                        i7 = 2064075671;
                    }
                    break;
                case -1304339321:
                case -403206964:
                    if (C3099.m10095()) {
                        iM2761 = (C0619.m2761("֨ۖ") ^ i5) * (-51);
                        i6 = ((iM2761 ^ i4) * 26331) ^ 1237727239;
                        i7 = -2016224917;
                    } else {
                        iM2761 = (C0773.m3169("ܺۖ") + i5) * 13;
                        i6 = ((iM2761 ^ i4) * 5827) ^ (-1824701101);
                        i7 = 620839082;
                    }
                    break;
                case -1003957517:
                case 494203254:
                    if (C2287.f7432 >= 0) {
                        iM2761 = C0773.m3169("ۘۖ") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-23167)) ^ 1780013953;
                        i7 = -1110376409;
                    } else {
                        iM2761 = (i5 - C0619.m2761("֡ۗ")) * 67;
                        i6 = ((iM2761 ^ i4) * (-12395)) ^ 1971770040;
                        i7 = -1081629356;
                    }
                    break;
                case -850140699:
                case -312323345:
                    AbstractC0641.m2813();
                    if (AbstractC0641.f2496 < 0) {
                        iM2761 = (C0619.m2761("۠ܶ") + i4) * (-87);
                        i6 = ((iM2761 ^ i5) * (-20989)) ^ 1669225540;
                        i7 = -887442361;
                    } else {
                        iM2761 = C0619.m2761("᩶֫") ^ i5;
                        i6 = ((iM2761 ^ i4) * 25967) ^ 1489434358;
                        i7 = 1637322861;
                    }
                    break;
                case -736170910:
                case 1921104353:
                    if (C2023.f6737) {
                        iM2761 = C0773.m3169("ۘۖ") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-23167)) ^ 1780013953;
                        i7 = -1110376409;
                    } else {
                        iM2761 = C0619.m2761("ܿۖ") ^ i5;
                        i6 = ((iM2761 ^ i4) * 4137) ^ (-1031567945);
                        i7 = -1692139820;
                    }
                    break;
                case 20931166:
                case 1829682090:
                    if (C2419.f7754 >= 0) {
                        iM2761 = (C0619.m2761("۠ܶ") + i4) * (-87);
                        i6 = ((iM2761 ^ i5) * (-20989)) ^ 1669225540;
                        i7 = -887442361;
                    } else {
                        iM2761 = (i5 - C0773.m3169("ۗۢ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i6 = ((iM2761 ^ i4) * (-30703)) ^ (-1905020751);
                        i7 = 1387104632;
                    }
                    break;
                case 119731919:
                case 480135000:
                    i2 = -1;
                    this.f73974 = -1;
                    if (C0773.f2792 <= 0) {
                        iM2761 = C0619.m2761("᩶֫") ^ i5;
                        i6 = ((iM2761 ^ i4) * 25967) ^ 1489434358;
                        i7 = 1637322861;
                    } else {
                        iM2761 = (C0773.m3169("۫ۜ") ^ i4) * 93;
                        i6 = ((iM2761 ^ i5) * 21475) ^ 795460779;
                        i7 = -1054820476;
                    }
                    break;
                case 399254489:
                case 690222832:
                    if (C13473.f42873 != 0) {
                        iM2761 = C0773.m3169("ۘۖ") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-23167)) ^ 1780013953;
                        i7 = -1110376409;
                    } else {
                        iM2761 = (C0619.m2761("ۨۖ") ^ i4) * (-47);
                        i6 = ((iM2761 ^ i5) * 11799) ^ (-1406630605);
                        i7 = 59140327;
                    }
                    break;
                case 683742304:
                case 1027254990:
                    C20932.m47848();
                    C23916.m53419();
                    throw new RuntimeException();
                case 1078284107:
                case 2049603562:
                    if (C3998.f13671 != 0) {
                        iM2761 = (C0619.m2761("۠ܶ") + i4) * (-87);
                        i6 = ((iM2761 ^ i5) * (-20989)) ^ 1669225540;
                        i7 = -887442361;
                    } else {
                        iM2761 = (C0619.m2761("֫ۤ") + i4) * (-7);
                        i6 = ((iM2761 ^ i5) * 24263) ^ 1876552971;
                        i7 = -710391164;
                    }
                    break;
                default:
                    AbstractC3624.m11755();
                    C2485.m8357();
                    iM2761 = C0773.m3169("ۘۖ") ^ i4;
                    i6 = ((iM2761 ^ i5) * (-23167)) ^ 1780013953;
                    i7 = -1110376409;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x01fe A[PHI: r31 r33 r44 r45
      0x01fe: PHI (r31v3 long) = (r31v2 long), (r31v1 long) binds: [B:61:0x01fc, B:57:0x01d9] A[DONT_GENERATE, DONT_INLINE]
      0x01fe: PHI (r33v2 long) = (r33v1 long), (r33v3 long) binds: [B:61:0x01fc, B:57:0x01d9] A[DONT_GENERATE, DONT_INLINE]
      0x01fe: PHI (r44v54 int) = (r44v53 int), (r44v55 int) binds: [B:61:0x01fc, B:57:0x01d9] A[DONT_GENERATE, DONT_INLINE]
      0x01fe: PHI (r45v48 int) = (r45v47 int), (r45v49 int) binds: [B:61:0x01fc, B:57:0x01d9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x011d, code lost:
    
        if (l.C3033.f9831 < 0) goto L31;
     */
    @Override // bin.mt.plugin.api.translation.BatchTranslationEngine.BatchingStrategy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean tryAdd(java.lang.String r49) {
        /*
            Method dump skipped, instruction units count: 2086
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C22825.tryAdd(java.lang.String):boolean");
    }
}
