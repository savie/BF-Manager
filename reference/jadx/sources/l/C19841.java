package l;

import bin.mt.plugin.api.PluginContext;
import bin.mt.plugin.api.translation.TranslationEngine;
import com.alipay.sdk.m.p.a;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ᩴ۬ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: U7HQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C19841 {

    /* JADX INFO: renamed from: ᩻ܺۨ, reason: not valid java name and contains not printable characters */
    private static final short[] f63781 = {7530, -22238, -22196, -22195, -22204, -22207, -22203, -22207, -22180, -22195, -22182, -22169, -22182, -22207, -22193, -22207, -22202, -22199, -22204, -22272, -22271, -22254, -22238, -22148, -22182, -22199, -22202, -22181, -22204, -22199, -22180, -22195, -22196, -22272, -22148, -22182, -22199, -22202, -22181, -22204, -22199, -22180, -22207, -22201, -22202, -22264, -22194, -22199, -22207, -22204, -22195, -22196, -22254, -22264, -22266, -22266, -22266};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C22825 f63782;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final TranslationEngine f63783;

    public C19841(TranslationEngine translationEngine) {
        TranslationEngine.Configuration configuration = null;
        int i = 1702523759;
        int i2 = C2375.f7641;
        int i3 = C1783.f6087;
        int iM2761 = C0619.m2761("ᩳۨ") ^ i2;
        int i4 = ((iM2761 ^ i3) * 12769) ^ 1873845117;
        int i5 = -1269095948;
        while (true) {
            i = ((((i ^ i3) * 29511) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2036645885:
                case -870956177:
                    C0773.m3161();
                    if (C2354.f7599 < 0) {
                        iM2761 = (C0773.m3169("۫ܳ") ^ i3) * 3;
                        i4 = ((iM2761 ^ i2) * 6423) ^ (-603012658);
                        i5 = 1243824472;
                    } else {
                        iM2761 = C0619.m2761("ܰۖ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-23919)) ^ 1470481683;
                        i5 = 1443793003;
                    }
                    break;
                case -1860582184:
                case -1814511091:
                    if (C1783.f6087 <= 0) {
                        iM2761 = C0619.m2761("ܰۖ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-23919)) ^ 1470481683;
                        i5 = 1443793003;
                    } else {
                        iM2761 = (i3 - C0619.m2761("᩹᩹")) * 47;
                        i4 = ((iM2761 ^ i2) * (-22359)) ^ (-520761311);
                        i5 = -1198668616;
                    }
                    break;
                case -1799529406:
                case -779837591:
                    C2310.m7813();
                    C2310.m7813();
                    iM2761 = C0619.m2761("ܰۖ") ^ i2;
                    i4 = ((iM2761 ^ i3) * (-23919)) ^ 1470481683;
                    i5 = 1443793003;
                    break;
                case -1633480987:
                case 1773563220:
                    if (AbstractC3624.f12429 > 0) {
                        int i6 = configuration.maxTranslationTextLength;
                        if (C0269.m1775() > 0) {
                            this.f63782 = new C22825(this, i6, configuration.textLengthCalculator);
                            return;
                        }
                    }
                    iM2761 = C0619.m2761("᩶ᩳ") ^ i2;
                    i4 = ((iM2761 ^ i3) * (-6491)) ^ 919689914;
                    i5 = 1450428758;
                    break;
                case -1516870593:
                case -1064923304:
                    this.f63783 = translationEngine;
                    configuration = translationEngine.getConfiguration();
                    if (C3779.f12953 <= 0) {
                        iM2761 = (i3 - C0773.m3169("ۢ۫")) * (-71);
                        i4 = ((iM2761 ^ i2) * 1073) ^ (-219915312);
                        i5 = -1482295702;
                    } else {
                        iM2761 = C0773.m3169("ۤ᩸") ^ i2;
                        i4 = ((iM2761 ^ i3) * 18511) ^ (-298764119);
                        i5 = -1367092395;
                    }
                    break;
                case -851988714:
                case -645381248:
                    if (C3077.f9998) {
                        iM2761 = C0619.m2761("֡ܳ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-30605)) ^ 1419437775;
                        i5 = -1281053161;
                    } else {
                        iM2761 = C0619.m2761("᩶ᩳ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-6491)) ^ 919689914;
                        i5 = 1450428758;
                    }
                    break;
                case -657613410:
                case 584120756:
                    C1080.m4050();
                    RunnableC1848.m6360();
                    throw new RuntimeException();
                case -631392456:
                case 174146884:
                    if (C1321.f4751 >= 0) {
                        iM2761 = C0773.m3169("ᩴۜ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-2171)) ^ 394927103;
                        i5 = 159579005;
                    } else {
                        iM2761 = (C0619.m2761("ۡܿ") + i3) * 53;
                        i4 = ((iM2761 ^ i2) * 10819) ^ (-1702116319);
                        i5 = -2070948476;
                    }
                    break;
                case -596946949:
                case -107974061:
                    if (RunnableC0334.f1808 <= 0) {
                        iM2761 = C0619.m2761("ܰۖ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-23919)) ^ 1470481683;
                        i5 = 1443793003;
                    } else {
                        iM2761 = (C0619.m2761("᩸ۚ") + i2) * 47;
                        i4 = ((iM2761 ^ i3) * (-17093)) ^ (-88284907);
                        i5 = 101824829;
                    }
                    break;
                case 164532972:
                case 1935970312:
                    if (C2485.m8357() <= 0) {
                        iM2761 = (i3 - C0773.m3169("ۢ۫")) * (-71);
                        i4 = ((iM2761 ^ i2) * 1073) ^ (-219915312);
                        i5 = -1482295702;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ۜܶ")) * 79;
                        i4 = ((iM2761 ^ i2) * 4883) ^ (-424108086);
                        i5 = -585042160;
                    }
                    break;
                case 278065945:
                case 952642996:
                    if (C2878.f9462) {
                        iM2761 = C0619.m2761("ܰۖ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-23919)) ^ 1470481683;
                        i5 = 1443793003;
                    } else {
                        iM2761 = (i2 - C0619.m2761("ۨ᩺")) * (-27);
                        i4 = ((iM2761 ^ i3) * 15323) ^ (-213802398);
                        i5 = 1032221307;
                    }
                    break;
                case 497334160:
                case 2103399916:
                    if (AbstractC3624.f12429 <= 0) {
                        iM2761 = (i3 - C0773.m3169("ۢ۫")) * (-71);
                        i4 = ((iM2761 ^ i2) * 1073) ^ (-219915312);
                        i5 = -1482295702;
                    } else {
                        iM2761 = C0619.m2761("ܰۖ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-23919)) ^ 1470481683;
                        i5 = 1443793003;
                    }
                    break;
                case 663628274:
                case 1425048440:
                    if (C2485.f7950 != 0) {
                        iM2761 = (i3 - C0773.m3169("ۢ۫")) * (-71);
                        i4 = ((iM2761 ^ i2) * 1073) ^ (-219915312);
                        i5 = -1482295702;
                    } else {
                        iM2761 = C0773.m3169("ۡ֨") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-17151)) ^ 25988313;
                        i5 = -360890245;
                    }
                    break;
                default:
                    C2288.m7767();
                    if (AbstractC3624.f12429 <= 0) {
                        iM2761 = C0773.m3169("ᩴۜ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-2171)) ^ 394927103;
                        i5 = 159579005;
                    } else {
                        iM2761 = (C0773.m3169("۫ܳ") ^ i3) * 3;
                        i4 = ((iM2761 ^ i2) * 6423) ^ (-603012658);
                        i5 = 1243824472;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0247  */
    /* JADX WARN: Code duplicated, block: B:78:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:86:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:90:0x032f A[PHI: r2 r7 r8 r20
      0x032f: PHI (r2v4 int) = (r2v3 int), (r2v2 int), (r2v2 int) binds: [B:89:0x032d, B:46:0x0183, B:10:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x032f: PHI (r7v4 java.lang.String) = (r7v2 java.lang.String), (r7v3 java.lang.String), (r7v2 java.lang.String) binds: [B:89:0x032d, B:46:0x0183, B:10:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x032f: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int) binds: [B:89:0x032d, B:46:0x0183, B:10:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x032f: PHI (r20v5 int) = (r20v4 int), (r20v3 int), (r20v3 int) binds: [B:89:0x032d, B:46:0x0183, B:10:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m45701(boolean z, String[] strArr) {
        int iM2761;
        int i;
        int i2;
        int i3 = C4238.f15451;
        int i4 = RunnableC3055.f9898;
        int iM3169 = C0773.m3169("ᩳ۠") ^ i3;
        int i5 = ((iM3169 ^ i4) * (-26863)) ^ (-1979691888);
        String str = null;
        int i6 = iM3169 ^ (-388517243);
        int length = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        char c = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = -859718954;
        int i16 = 0;
        char[] cArr = null;
        int i17 = 0;
        while (true) {
            i15 = i6 ^ (i5 & (((i15 ^ i4) * 25367) >> 31));
            switch (i15) {
                case -2146142019:
                case -1375932641:
                    if (C17202.f56030) {
                        iM2761 = (i3 - C0619.m2761("ۜ᩵")) * 81;
                        i = ((iM2761 ^ i4) * 8805) ^ 866381204;
                        i2 = -1153174926;
                    } else {
                        iM2761 = (C0619.m2761("᩹᩸") ^ i3) * 47;
                        i = ((iM2761 ^ i4) * (-23237)) ^ (-459685105);
                        i2 = -1187840999;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1985690347:
                case -538958729:
                    i11 = i10 + 1;
                    iM2761 = C0619.m2761("ۧ᩵") ^ i3;
                    i = ((iM2761 ^ i4) * 8219) ^ (-956688522);
                    i2 = -1660695471;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1930141343:
                case 1370210348:
                    c = '-';
                    iM2761 = C0773.m3169("֨۠") ^ i4;
                    i = ((iM2761 ^ i3) * (-6675)) ^ (-193002564);
                    i2 = -2097629882;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1917631823:
                case 1735239704:
                    i17 = i16;
                    i7 = 0;
                    iM2761 = C0619.m2761("ܰᩳ") ^ i3;
                    i = ((iM2761 ^ i4) * 24519) ^ 196155509;
                    i2 = -1173848230;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1885688079:
                case 78498411:
                    if (C4282.m13656(str, i9) == c) {
                        iM2761 = (i3 - C0619.m2761("ۛܰ")) * 15;
                        i = ((iM2761 ^ i4) * 7799) ^ 205506543;
                        i2 = 130047244;
                    } else {
                        iM2761 = C0619.m2761("᩻ᩳ") ^ i4;
                        i = ((iM2761 ^ i3) * 25755) ^ (-1600708491);
                        i2 = 2006231049;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1863209306:
                case 1749715706:
                    str = strArr[i7];
                    i8 = 0;
                    if (C1146.f4234 >= 0) {
                        iM2761 = C0619.m2761("ۨ᩺") ^ i4;
                        i = ((iM2761 ^ i3) * (-3985)) ^ 1305993127;
                        i2 = -797314236;
                    } else {
                        iM2761 = C0619.m2761("ܶۗ") ^ i4;
                        i = ((iM2761 ^ i3) * 803) ^ 1078638903;
                        i2 = 2064052085;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1860501872:
                case 2109588547:
                    i9 = i8;
                    i10 = 0;
                    i12 = 0;
                    iM2761 = C0773.m3169("ܳܽ") ^ i3;
                    i = ((iM2761 ^ i4) * 25463) ^ 1144310955;
                    i2 = 1579666974;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1800955859:
                case -235416107:
                    return new String(cArr);
                case -1772874937:
                case 213891888:
                    if (i7 < length) {
                        iM2761 = (C0773.m3169("ۨ۠") + i3) * (-29);
                        i = ((iM2761 ^ i4) * 19097) ^ 1304368563;
                        i2 = 628064441;
                    } else {
                        iM2761 = C0773.m3169("۬ܿ") ^ i4;
                        i = ((iM2761 ^ i3) * 10505) ^ (-1385284502);
                        i2 = -342736273;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1769560868:
                case 2140663281:
                    C3033.m9845();
                    if (AbstractC0641.f2496 < 0) {
                        iM2761 = C0773.m3169("᩸ܳ") ^ i3;
                        i = ((iM2761 ^ i4) * (-11915)) ^ (-1679522896);
                        i2 = 1132986068;
                    } else {
                        iM2761 = C0773.m3169("۫۫") ^ i4;
                        i = ((iM2761 ^ i3) * (-13371)) ^ 459343936;
                        i2 = -1270295265;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1651830571:
                case -750714889:
                    i13 = i10;
                    i14 = 0;
                    iM2761 = (C0773.m3169("ܶۤ") + i4) * (-109);
                    i = ((iM2761 ^ i3) * 23393) ^ (-1898137237);
                    i2 = 1570204473;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1536494073:
                case -241611818:
                    if (i10 >= i17) {
                        iM2761 = C0773.m3169("᩷֫") ^ i3;
                        i = ((iM2761 ^ i4) * (-2161)) ^ (-2019354827);
                        i2 = 1767121738;
                    } else {
                        i11 = i17;
                        iM2761 = C0619.m2761("ۧ᩵") ^ i3;
                        i = ((iM2761 ^ i4) * 8219) ^ (-956688522);
                        i2 = -1660695471;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1500632966:
                case 1582628859:
                    C2288.m7767();
                    iM2761 = C0773.m3169("᩸ܳ") ^ i3;
                    i = ((iM2761 ^ i4) * (-11915)) ^ (-1679522896);
                    i2 = 1132986068;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1284511552:
                case -1203236777:
                    int i18 = i12 + 1;
                    if (i18 > i10) {
                        i13 = i18;
                        i14 = i13;
                    } else {
                        i14 = i18;
                        i13 = i10;
                    }
                    iM2761 = (C0773.m3169("ܶۤ") + i4) * (-109);
                    i = ((iM2761 ^ i3) * 23393) ^ (-1898137237);
                    i2 = 1570204473;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1071020815:
                case 733217046:
                    i7++;
                    i17 = i11;
                    iM2761 = C0619.m2761("ܰᩳ") ^ i3;
                    i = ((iM2761 ^ i4) * 24519) ^ 196155509;
                    i2 = -1173848230;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1069840534:
                case 1167930565:
                    C1542.m5459();
                    if (C2485.f7950 != 0) {
                        iM2761 = C0773.m3169("᩸ܳ") ^ i3;
                        i = ((iM2761 ^ i4) * (-11915)) ^ (-1679522896);
                        i2 = 1132986068;
                    } else {
                        iM2761 = (C0619.m2761("᩹᩸") ^ i3) * 47;
                        i = ((iM2761 ^ i4) * (-23237)) ^ (-459685105);
                        i2 = -1187840999;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1037617242:
                case 840043507:
                    C0773.m3161();
                    if (C2485.f7950 == 0) {
                        iM2761 = C0773.m3169("᩸ܳ") ^ i3;
                        i = ((iM2761 ^ i4) * (-11915)) ^ (-1679522896);
                        i2 = 1132986068;
                    } else {
                        iM2761 = C0619.m2761("ۨ᩺") ^ i4;
                        i = ((iM2761 ^ i3) * (-3985)) ^ 1305993127;
                        i2 = -797314236;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1020371171:
                case 902707730:
                    if (C1080.f3865 >= 0) {
                        iM2761 = (C0619.m2761("᩹᩸") ^ i3) * 47;
                        i = ((iM2761 ^ i4) * (-23237)) ^ (-459685105);
                        i2 = -1187840999;
                    } else {
                        iM2761 = C0773.m3169("ۢۜ") ^ i4;
                        i = ((iM2761 ^ i3) * 8005) ^ (-1674459119);
                        i2 = 1778930435;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -885122414:
                case 1961705826:
                    if (RunnableC0334.f1808 <= 0) {
                        iM2761 = C0773.m3169("۫۫") ^ i4;
                        i = ((iM2761 ^ i3) * (-13371)) ^ 459343936;
                        i2 = -1270295265;
                    } else {
                        iM2761 = C0773.m3169("ܳ֨") ^ i4;
                        i = ((iM2761 ^ i3) * 6635) ^ (-1576044294);
                        i2 = -1112552382;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -698336778:
                case -224860353:
                    if (C1321.f4751 >= 0) {
                        iM2761 = C0773.m3169("۫۫") ^ i4;
                        i = ((iM2761 ^ i3) * (-13371)) ^ 459343936;
                        i2 = -1270295265;
                    } else {
                        iM2761 = C0619.m2761("۬֨") ^ i4;
                        i = ((iM2761 ^ i3) * (-13979)) ^ (-889647502);
                        i2 = -742480075;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -393210531:
                case -381281161:
                    if (i9 < C3077.m10045(str)) {
                        iM2761 = (i4 - C0619.m2761("ܳܳ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i = ((iM2761 ^ i3) * 10203) ^ (-963668459);
                        i2 = 1900641157;
                    } else {
                        iM2761 = (C0619.m2761("֨᩹") + i4) * (-31);
                        i = ((iM2761 ^ i3) * (-15209)) ^ (-637987627);
                        i2 = 1476189539;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -181143482:
                case 975462136:
                    C1146.m4231();
                    C0862.m3503();
                    return null;
                case 26110008:
                case 69686588:
                    cArr = new char[i17];
                    Arrays.fill(cArr, c);
                    if (AbstractC3624.f12429 <= 0) {
                        iM2761 = (i4 - C0619.m2761("۟۟")) * (-89);
                        i = ((iM2761 ^ i3) * 14113) ^ 1581141978;
                        i2 = -643344583;
                    } else {
                        iM2761 = (i3 - C0619.m2761("֫ۤ")) * (-39);
                        i = ((iM2761 ^ i4) * 9185) ^ 2048858348;
                        i2 = -607758907;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 147025809:
                case 1583592801:
                    if (z) {
                        iM2761 = C0773.m3169("᩵᩵") ^ i4;
                        i = ((iM2761 ^ i3) * 30411) ^ (-81718014);
                        i2 = -1145800440;
                    } else {
                        iM2761 = (C0619.m2761("᩸֡") ^ i3) * (-81);
                        i = ((iM2761 ^ i4) * 28149) ^ (-1587123751);
                        i2 = 1300737217;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 215946447:
                case 645805787:
                    i9++;
                    i10 = i13;
                    i12 = i14;
                    iM2761 = C0773.m3169("ܳܽ") ^ i3;
                    i = ((iM2761 ^ i4) * 25463) ^ 1144310955;
                    i2 = 1579666974;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 220756644:
                case 979760210:
                    if (C1783.f6087 <= 0) {
                        iM2761 = C0773.m3169("۫۫") ^ i4;
                        i = ((iM2761 ^ i3) * (-13371)) ^ 459343936;
                        i2 = -1270295265;
                    } else {
                        iM2761 = C0773.m3169("ۢۙ") ^ i3;
                        i = ((iM2761 ^ i4) * 1501) ^ (-1103966753);
                        i2 = 540100034;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 671443383:
                case 1759835386:
                    length = strArr.length;
                    i16 = 8;
                    if (C2834.f9334 <= 0) {
                        iM2761 = C0619.m2761("ۨ᩺") ^ i4;
                        i = ((iM2761 ^ i3) * (-3985)) ^ 1305993127;
                        i2 = -797314236;
                    } else {
                        iM2761 = (C0619.m2761("ܰ֫") ^ i3) * (-15);
                        i = ((iM2761 ^ i4) * 30179) ^ 1670638957;
                        i2 = 2129952288;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 966954125:
                case 1056785098:
                    if (C0950.f3488 >= 0) {
                        iM2761 = C0773.m3169("᩸ܳ") ^ i3;
                        i = ((iM2761 ^ i4) * (-11915)) ^ (-1679522896);
                        i2 = 1132986068;
                    } else {
                        iM2761 = C0619.m2761("ܳۡ") ^ i3;
                        i = ((iM2761 ^ i4) * (-22969)) ^ (-1204424572);
                        i2 = -351785454;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 1024575425:
                case 1471405843:
                    if (C2310.f7472 >= 0) {
                        iM2761 = C0773.m3169("۫۫") ^ i4;
                        i = ((iM2761 ^ i3) * (-13371)) ^ 459343936;
                        i2 = -1270295265;
                    } else {
                        iM2761 = C0773.m3169("ܶ۟") ^ i3;
                        i = ((iM2761 ^ i4) * (-26965)) ^ 557146149;
                        i2 = 1143946367;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 1572861237:
                case 1614943876:
                    if (C13473.f42873 != 0) {
                        iM2761 = C0773.m3169("᩸ܳ") ^ i3;
                        i = ((iM2761 ^ i4) * (-11915)) ^ (-1679522896);
                        i2 = 1132986068;
                    } else {
                        iM2761 = (i4 - C0773.m3169("۬֫")) * (-123);
                        i = ((iM2761 ^ i3) * (-5359)) ^ 977624409;
                        i2 = 164472680;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                default:
                    c = a.h;
                    iM2761 = C0773.m3169("֨۠") ^ i4;
                    i = ((iM2761 ^ i3) * (-6675)) ^ (-193002564);
                    i2 = -2097629882;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String[] m45703(String[] strArr, String str, String str2) {
        int iM3169;
        int i;
        int i2;
        String str3;
        String str4;
        StringBuilder sb;
        boolean z;
        int i3;
        String str5;
        int i4;
        int iM2761;
        int i5;
        String str6;
        short s;
        int iM2762;
        int i6;
        int i7;
        int i8;
        StringBuilder sb2;
        int iM31610;
        int i9;
        int i10;
        int iM2763;
        int i11;
        StringBuilder sb3;
        boolean z2;
        int i12;
        String str7;
        StringBuilder sb4;
        boolean z3;
        int i13;
        int i14;
        String strTranslate;
        int iM2764;
        int i15;
        int i16;
        int iM31611;
        int i17;
        int i18;
        String str8;
        String[] strArr2 = strArr;
        int i19 = 1537223223;
        int i20 = C20932.f66974;
        int i21 = C3690.f12684;
        int iM2765 = C0619.m2761("֡ᩴ") ^ i21;
        int i22 = ((iM2765 ^ i20) * 27317) ^ 1942690175;
        int i23 = iM2765 ^ (-627625000);
        StringBuilder sb5 = null;
        String str9 = null;
        String[] strArrSplit = null;
        PluginContext context = null;
        String strM2361 = null;
        StringBuilder sb6 = null;
        int i24 = 0;
        int i25 = 0;
        boolean z4 = false;
        StringBuilder sb7 = null;
        boolean z5 = false;
        short s2 = 0;
        String strM45701 = null;
        String strM34865 = null;
        String str10 = null;
        String strM6952 = null;
        short[] sArr = null;
        int i26 = 0;
        TranslationEngine translationEngine = null;
        String strM4058 = null;
        while (true) {
            i19 = i23 ^ (i22 & (((i19 ^ i20) * (-24081)) >> 31));
            switch (i19) {
                case -2136289729:
                case 2134916619:
                    C2702.m8876();
                    if (C2485.f7950 != 0) {
                        str3 = strM6952;
                        sArr = sArr;
                        strTranslate = str10;
                        int iM31612 = (i20 - C0773.m3169("۬᩹")) * 55;
                        i22 = ((iM31612 ^ i21) * 5627) ^ 1336978228;
                        int i27 = iM31612 ^ (-1931580153);
                        str10 = strTranslate;
                        sArr = sArr;
                        translationEngine = translationEngine;
                        z5 = z5;
                        strM6952 = str3;
                        i23 = i27;
                    } else {
                        str3 = strM6952;
                        sArr = sArr;
                        str4 = str9;
                        z = z5;
                        s = s2;
                        i3 = i26;
                        str6 = strM45701;
                        int iM31613 = (i21 - C0773.m3169("ᩴ۠")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        int i28 = ((iM31613 ^ i20) * (-21161)) ^ (-719610851);
                        i5 = iM31613 ^ 1148806835;
                        s2 = s;
                        strM45701 = str6;
                        i22 = i28;
                        str9 = str4;
                        i26 = i3;
                        sArr = sArr;
                        sb7 = null;
                        z5 = z;
                        strM6952 = str3;
                        i23 = i5;
                        strArr2 = strArr;
                    }
                    break;
                case -2101146647:
                case 144352950:
                    i12 = i26;
                    strM6952 = strM6952;
                    sArr = sArr;
                    str7 = str9;
                    sb4 = sb7;
                    sb5 = new StringBuilder();
                    z3 = true;
                    if (strArr2.length <= 0) {
                        int iM31614 = (C0773.m3169("ܶ֡") + i21) * (-119);
                        sb7 = sb4;
                        str9 = str7;
                        sArr = sArr;
                        String str11 = strM6952;
                        i23 = iM31614 ^ 136762566;
                        i22 = ((iM31614 ^ i20) * (-20351)) ^ 109328890;
                        strM6952 = str11;
                        int i29 = i12;
                        z5 = z3;
                        i26 = i29;
                    } else {
                        int iM31615 = (C0773.m3169("ۙᩴ") ^ i20) * 123;
                        i13 = ((iM31615 ^ i21) * 17045) ^ 1734146456;
                        i14 = iM31615 ^ (-1980982506);
                        sb7 = sb4;
                        i26 = i12;
                        z5 = true;
                        str9 = str7;
                        sArr = sArr;
                        str8 = strM6952;
                        i23 = i14;
                        i22 = i13;
                        strM6952 = str8;
                    }
                    break;
                case -2093022258:
                case 1104864232:
                    i25 = 18629;
                    iM2763 = (C0619.m2761("᩻᩹") + i20) * 39;
                    i = ((iM2763 ^ i21) * (-28637)) ^ 1883347521;
                    i11 = 1251126877;
                    int i30 = iM2763 ^ i11;
                    strM45701 = strM45701;
                    sb7 = sb7;
                    i26 = i26;
                    z5 = z5;
                    str9 = str9;
                    strM6952 = strM6952;
                    sArr = sArr;
                    i23 = i30;
                    i22 = i;
                    break;
                case -2063377192:
                case 1081419026:
                    throw new IOException(C25272.m56409(C2288.m7761(f63781, 34, 20, i25), strM6952));
                case -2019045359:
                case 1432276437:
                    str3 = strM6952;
                    sArr = sArr;
                    sb2 = sb7;
                    C3779.m12258(sb2, strM2361);
                    C3779.m12258(sb2, strM4058);
                    if (C2878.m9491() <= 0) {
                        iM31610 = C0619.m2761("۫ܰ") ^ i20;
                        i9 = ((iM31610 ^ i21) * (-25925)) ^ (-573005363);
                        i10 = 1840310733;
                    } else {
                        iM31610 = (C0619.m2761("۟ۗ") + i20) * (-31);
                        i9 = ((iM31610 ^ i21) * 8861) ^ 1524873363;
                        i10 = -723331667;
                    }
                    int i31 = iM31610 ^ i10;
                    sb7 = sb2;
                    i22 = i9;
                    sArr = sArr;
                    str8 = str3;
                    i23 = i31;
                    strM6952 = str8;
                    break;
                case -1980546826:
                case -819917368:
                    sb3 = sb7;
                    z2 = z5;
                    strM45701 = m45701(false, strArr2);
                    i26 = 0;
                    z4 = false;
                    iM2764 = C0619.m2761("ۡ᩻") ^ i21;
                    i15 = ((iM2764 ^ i20) * 7513) ^ 386851823;
                    i16 = -1605573017;
                    int i32 = iM2764 ^ i16;
                    z5 = z2;
                    sb7 = sb3;
                    strM6952 = strM6952;
                    i23 = i32;
                    i22 = i15;
                    str9 = str9;
                    sArr = sArr;
                    break;
                case -1921082914:
                case -224649503:
                    str3 = strM6952;
                    sArr = sArr;
                    sb2 = sb7;
                    strM2361 = C0487.m2361(f63781, 20, 3, i25);
                    if (!C0619.f2439) {
                        iM31610 = (C0773.m3169("۫۠") ^ i21) * (-121);
                        i9 = ((iM31610 ^ i20) * 18015) ^ 774918158;
                        i10 = -1182991646;
                        int i33 = iM31610 ^ i10;
                        sb7 = sb2;
                        i22 = i9;
                        sArr = sArr;
                        str8 = str3;
                        i23 = i33;
                        strM6952 = str8;
                    } else {
                        sb7 = sb2;
                        strTranslate = str10;
                        int iM31616 = (i20 - C0773.m3169("۬᩹")) * 55;
                        i22 = ((iM31616 ^ i21) * 5627) ^ 1336978228;
                        int i210 = iM31616 ^ (-1931580153);
                        str10 = strTranslate;
                        sArr = sArr;
                        translationEngine = translationEngine;
                        z5 = z5;
                        strM6952 = str3;
                        i23 = i210;
                    }
                    break;
                case -1869621873:
                case -1163617171:
                    C3033.m9845();
                    if (C23916.m53419() != 0) {
                        str3 = strM6952;
                        sArr = sArr;
                        str4 = str9;
                        z = z5;
                        s = s2;
                        i3 = i26;
                        str6 = strM45701;
                        int iM31617 = (i21 - C0773.m3169("ᩴ۠")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        int i211 = ((iM31617 ^ i20) * (-21161)) ^ (-719610851);
                        i5 = iM31617 ^ 1148806835;
                        s2 = s;
                        strM45701 = str6;
                        i22 = i211;
                        str9 = str4;
                        i26 = i3;
                        sArr = sArr;
                        sb7 = null;
                        z5 = z;
                        strM6952 = str3;
                        i23 = i5;
                        strArr2 = strArr;
                    } else {
                        strM6952 = strM6952;
                        sArr = sArr;
                        int iM31618 = (i21 - C0773.m3169("ۖ᩵")) * 71;
                        i13 = ((iM31618 ^ i20) * 9167) ^ 1485476047;
                        i14 = iM31618 ^ 1929753747;
                        sArr = sArr;
                        str8 = strM6952;
                        i23 = i14;
                        i22 = i13;
                        strM6952 = str8;
                    }
                    break;
                case -1718320387:
                case -83203481:
                    C3033.m9845();
                    C0487.m2356();
                    strM6952 = strM6952;
                    sArr = sArr;
                    int iM31619 = (i21 - C0773.m3169("ۖ᩵")) * 71;
                    i13 = ((iM31619 ^ i20) * 9167) ^ 1485476047;
                    i14 = iM31619 ^ 1929753747;
                    sArr = sArr;
                    str8 = strM6952;
                    i23 = i14;
                    i22 = i13;
                    strM6952 = str8;
                    break;
                case -1702366304:
                case -448355403:
                    str3 = strM6952;
                    sArr = sArr;
                    str4 = str9;
                    sb = sb7;
                    z = z5;
                    i3 = i26;
                    str5 = strM45701;
                    s2 = f63781[0];
                    if (C4238.f15451 >= 0) {
                        iM2761 = (C0619.m2761("ۛۧ") + i21) * 109;
                        i22 = ((iM2761 ^ i20) * 13075) ^ (-957935697);
                        i4 = -1297056553;
                    } else {
                        iM2761 = (C0619.m2761("ۗܺ") ^ i20) * (-51);
                        i22 = ((iM2761 ^ i21) * 6727) ^ 303541709;
                        i4 = 1876776259;
                    }
                    i5 = iM2761 ^ i4;
                    strM45701 = str5;
                    sb7 = sb;
                    i26 = i3;
                    z5 = z;
                    str9 = str4;
                    strM6952 = str3;
                    sArr = sArr;
                    i23 = i5;
                    strArr2 = strArr;
                    break;
                case -1666923323:
                case 103854548:
                    C13473.m33144();
                    RunnableC3646.m11813();
                    return null;
                case -1631631171:
                case -1324158635:
                    strM6952 = strM6952;
                    sArr = sArr;
                    str9 = str9;
                    sb7 = sb7;
                    z5 = z5;
                    i26 = i26;
                    String strM40377 = C17202.m40377(f63781, 1, 1, i25);
                    strM45701 = strM45701;
                    strM34865 = C14442.m34865(strM40377, strM45701, strM40377);
                    if (strM34865 != null) {
                        iM2763 = C0773.m3169("֨ۨ") ^ i21;
                        i = ((iM2763 ^ i20) * 18361) ^ (-1509790622);
                        i11 = -1137640247;
                    } else {
                        iM2763 = C0773.m3169("۟۟") ^ i20;
                        i = ((iM2763 ^ i21) * (-1295)) ^ (-743386265);
                        i11 = 864340817;
                    }
                    int i34 = iM2763 ^ i11;
                    strM45701 = strM45701;
                    sb7 = sb7;
                    i26 = i26;
                    z5 = z5;
                    str9 = str9;
                    strM6952 = strM6952;
                    sArr = sArr;
                    i23 = i34;
                    i22 = i;
                    break;
                case -1545301578:
                case 435864796:
                    sb5.append((CharSequence) strArr2[i26]);
                    i24 = 1;
                    iM31611 = (C0773.m3169("᩻ܽ") ^ i21) * (-117);
                    i17 = ((iM31611 ^ i20) * 11749) ^ (-1646513212);
                    i18 = 2012580757;
                    i8 = iM31611 ^ i18;
                    sb7 = sb7;
                    z5 = z5;
                    i22 = i17;
                    strM6952 = strM6952;
                    sArr = sArr;
                    i23 = i8;
                    break;
                case -1438316359:
                case -1264270939:
                    str3 = strM6952;
                    sArr = sArr;
                    StringBuilder sb8 = sb7;
                    z5 = z5;
                    strM4058 = C1080.m4058(sb5);
                    translationEngine = this.f63783;
                    strTranslate = translationEngine.translate(strM4058, str, str2);
                    String strQuote = Pattern.quote(strM34865);
                    if (RunnableC1848.m6360()) {
                        sb7 = sb8;
                        str9 = strQuote;
                        int iM316110 = (i20 - C0773.m3169("۬᩹")) * 55;
                        i22 = ((iM316110 ^ i21) * 5627) ^ 1336978228;
                        int i212 = iM316110 ^ (-1931580153);
                        str10 = strTranslate;
                        sArr = sArr;
                        translationEngine = translationEngine;
                        z5 = z5;
                        strM6952 = str3;
                        i23 = i212;
                    } else {
                        int iM2766 = (C0619.m2761("ۜۧ") + i20) * 23;
                        str10 = strTranslate;
                        sArr = sArr;
                        translationEngine = translationEngine;
                        i23 = iM2766 ^ (-435100780);
                        i22 = ((iM2766 ^ i21) * 31247) ^ (-1844195053);
                        i26 = i26;
                        z5 = z5;
                        strM6952 = str3;
                        sb7 = sb8;
                        str9 = strQuote;
                    }
                    break;
                case -1275419975:
                case 1456286641:
                    str3 = strM6952;
                    sArr = sArr;
                    String strM9847 = C3033.m9847(f63781, 11, 9, i25);
                    if (!C1321.m4852()) {
                        str4 = str9;
                        z = z5;
                        s = s2;
                        i3 = i26;
                        str6 = strM45701;
                        int iM316111 = (i21 - C0773.m3169("ᩴ۠")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        int i213 = ((iM316111 ^ i20) * (-21161)) ^ (-719610851);
                        i5 = iM316111 ^ 1148806835;
                        s2 = s;
                        strM45701 = str6;
                        i22 = i213;
                        str9 = str4;
                        i26 = i3;
                        sArr = sArr;
                        sb7 = null;
                        z5 = z;
                        strM6952 = str3;
                        i23 = i5;
                        strArr2 = strArr;
                    } else {
                        sb2 = new StringBuilder(strM9847);
                        C3779.m12269(sb2, strArr2.length);
                        if (!C3492.m11488()) {
                            sb7 = sb2;
                            strTranslate = str10;
                            int iM316112 = (i20 - C0773.m3169("۬᩹")) * 55;
                            i22 = ((iM316112 ^ i21) * 5627) ^ 1336978228;
                            int i214 = iM316112 ^ (-1931580153);
                            str10 = strTranslate;
                            sArr = sArr;
                            translationEngine = translationEngine;
                            z5 = z5;
                            strM6952 = str3;
                            i23 = i214;
                        } else {
                            iM31610 = (i20 - C0773.m3169("ۖۘ")) * 83;
                            i9 = ((iM31610 ^ i21) * 21415) ^ 533156144;
                            i10 = 310511832;
                            int i35 = iM31610 ^ i10;
                            sb7 = sb2;
                            i22 = i9;
                            sArr = sArr;
                            str8 = str3;
                            i23 = i35;
                            strM6952 = str8;
                        }
                    }
                    break;
                case -1122687025:
                case 1984805187:
                    C0862.m3503();
                    if (C2966.f9654 < 0) {
                        iM3169 = (i20 - C0619.m2761("ۗۨ")) * 35;
                        i = ((iM3169 ^ i21) * 31409) ^ 1497462910;
                        i2 = 1665525585;
                        i23 = iM3169 ^ i2;
                        i22 = i;
                    } else {
                        str3 = strM6952;
                        sArr = sArr;
                        str4 = str9;
                        z = z5;
                        s = s2;
                        i3 = i26;
                        str6 = strM45701;
                        int iM316113 = (i21 - C0773.m3169("ᩴ۠")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        int i215 = ((iM316113 ^ i20) * (-21161)) ^ (-719610851);
                        i5 = iM316113 ^ 1148806835;
                        s2 = s;
                        strM45701 = str6;
                        i22 = i215;
                        str9 = str4;
                        i26 = i3;
                        sArr = sArr;
                        sb7 = null;
                        z5 = z;
                        strM6952 = str3;
                        i23 = i5;
                        strArr2 = strArr;
                    }
                    break;
                case -885728382:
                case 89653498:
                    sb5.append((CharSequence) strM34865);
                    sb5.append((CharSequence) strArr2[i24]);
                    i24++;
                    iM31611 = (C0773.m3169("᩻ܽ") ^ i21) * (-117);
                    i17 = ((iM31611 ^ i20) * 11749) ^ (-1646513212);
                    i18 = 2012580757;
                    i8 = iM31611 ^ i18;
                    sb7 = sb7;
                    z5 = z5;
                    i22 = i17;
                    strM6952 = strM6952;
                    sArr = sArr;
                    i23 = i8;
                    break;
                case -883438503:
                case 57177738:
                    sb6 = new StringBuilder();
                    C1783.m6234(sb6, AbstractC0116.m1237(str10, i26, 99));
                    sArr = f63781;
                    if (C2310.f7472 < 0) {
                        iM3169 = (C0773.m3169("᩻ᩳ") + i20) * 55;
                        i = ((iM3169 ^ i21) * 19293) ^ (-1336884700);
                        i2 = -485926064;
                        i23 = iM3169 ^ i2;
                        i22 = i;
                    } else {
                        str3 = strM6952;
                        sArr = sArr;
                        str4 = str9;
                        z = z5;
                        s = s2;
                        i3 = i26;
                        str6 = strM45701;
                        int iM316114 = (i21 - C0773.m3169("ᩴ۠")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        int i216 = ((iM316114 ^ i20) * (-21161)) ^ (-719610851);
                        i5 = iM316114 ^ 1148806835;
                        s2 = s;
                        strM45701 = str6;
                        i22 = i216;
                        str9 = str4;
                        i26 = i3;
                        sArr = sArr;
                        sb7 = null;
                        z5 = z;
                        strM6952 = str3;
                        i23 = i5;
                        strArr2 = strArr;
                    }
                    break;
                case -776176853:
                case 1978177216:
                    C3779.m12258(sb6, C1321.m4861(sArr, 54, 3, i25));
                    strM6952 = C2023.m6952(sb6);
                    sArr = sArr;
                    sb2 = sb7;
                    int iM2767 = (C0619.m2761("᩺᩻") ^ i21) * 85;
                    i23 = iM2767 ^ 1622666285;
                    sb7 = sb2;
                    i22 = ((iM2767 ^ i20) * 25613) ^ 1566549114;
                    sArr = sArr;
                    break;
                case -393229910:
                case 2136600470:
                    return strArrSplit;
                case -177821348:
                case 411071741:
                    z2 = z5;
                    strM45701 = m45701(z2, strArr2);
                    z4 = true;
                    sb3 = sb7;
                    iM2764 = C0619.m2761("ۡ᩻") ^ i21;
                    i15 = ((iM2764 ^ i20) * 7513) ^ 386851823;
                    i16 = -1605573017;
                    int i36 = iM2764 ^ i16;
                    z5 = z2;
                    sb7 = sb3;
                    strM6952 = strM6952;
                    i23 = i36;
                    i22 = i15;
                    str9 = str9;
                    sArr = sArr;
                    break;
                case -145224337:
                case 1492988328:
                    strM6952 = strM6952;
                    sArr = sArr;
                    sb7 = sb7;
                    z5 = z5;
                    context = translationEngine.getContext();
                    if (context != null) {
                        iM31611 = (C0773.m3169("ܰ۬") + i21) * (-101);
                        i17 = ((iM31611 ^ i20) * (-10019)) ^ 956565381;
                        i18 = 2137111109;
                    } else {
                        iM31611 = (C0619.m2761("᩷ۖ") + i21) * (-29);
                        i17 = ((iM31611 ^ i20) * (-20557)) ^ (-1546964008);
                        i18 = -395933422;
                    }
                    i8 = iM31611 ^ i18;
                    sb7 = sb7;
                    z5 = z5;
                    i22 = i17;
                    strM6952 = strM6952;
                    sArr = sArr;
                    i23 = i8;
                    break;
                case 100388112:
                case 498074378:
                    context.log(C2023.m6952(sb7));
                    short[] sArr2 = f63781;
                    if (C2375.m8065() > 0) {
                        strM6952 = strM6952;
                        sArr = sArr;
                        String strM9670 = C2966.m9670(sArr2, 23, 11, i25);
                        if (!C2023.f6737) {
                            StringBuilder sb9 = new StringBuilder(strM9670);
                            C3779.m12269(sb9, strArrSplit.length);
                            C1783.m6234(sb9, strM2361);
                            C3779.m12258(sb9, str10);
                            context.log(C1080.m4058(sb9));
                            sb7 = sb7;
                            z5 = z5;
                            iM31611 = (C0619.m2761("᩷ۖ") + i21) * (-29);
                            i17 = ((iM31611 ^ i20) * (-20557)) ^ (-1546964008);
                            i18 = -395933422;
                            i8 = iM31611 ^ i18;
                            sb7 = sb7;
                            z5 = z5;
                            i22 = i17;
                            strM6952 = strM6952;
                            sArr = sArr;
                            i23 = i8;
                        } else {
                            int iM316115 = (i21 - C0773.m3169("ۖ᩵")) * 71;
                            i13 = ((iM316115 ^ i20) * 9167) ^ 1485476047;
                            i14 = iM316115 ^ 1929753747;
                            sArr = sArr;
                            str8 = strM6952;
                            i23 = i14;
                            i22 = i13;
                            strM6952 = str8;
                        }
                    } else {
                        str3 = strM6952;
                        sArr = sArr;
                        sb2 = sb7;
                        iM31610 = C0619.m2761("۫ܰ") ^ i20;
                        i9 = ((iM31610 ^ i21) * (-25925)) ^ (-573005363);
                        i10 = 1840310733;
                        int i37 = iM31610 ^ i10;
                        sb7 = sb2;
                        i22 = i9;
                        sArr = sArr;
                        str8 = str3;
                        i23 = i37;
                        strM6952 = str8;
                    }
                    break;
                case 240475615:
                case 913664239:
                    str3 = strM6952;
                    sArr = sArr;
                    sb2 = sb7;
                    if (C3077.m10045(str10) <= 100) {
                        strM6952 = str10;
                        int iM2768 = (C0619.m2761("᩺᩻") ^ i21) * 85;
                        i23 = iM2768 ^ 1622666285;
                        sb7 = sb2;
                        i22 = ((iM2768 ^ i20) * 25613) ^ 1566549114;
                        sArr = sArr;
                    } else {
                        iM31610 = (C0773.m3169("۠۠") ^ i20) * (-25);
                        i9 = ((iM31610 ^ i21) * (-21125)) ^ (-2063017406);
                        i10 = -780564087;
                        int i38 = iM31610 ^ i10;
                        sb7 = sb2;
                        i22 = i9;
                        sArr = sArr;
                        str8 = str3;
                        i23 = i38;
                        strM6952 = str8;
                    }
                    break;
                case 306113287:
                case 1047092964:
                    strM6952 = strM6952;
                    sArr = sArr;
                    z2 = z5;
                    str9 = str9;
                    strArrSplit = str10.split(str9, -1);
                    sb3 = sb7;
                    if (strArrSplit.length == strArr2.length) {
                        iM2764 = C0619.m2761("ۧܿ") ^ i20;
                        i15 = ((iM2764 ^ i21) * 30795) ^ 159601283;
                        i16 = -1035740137;
                    } else {
                        iM2764 = C0619.m2761("۠ۗ") ^ i21;
                        i15 = ((iM2764 ^ i20) * (-32077)) ^ (-1298894487);
                        i16 = 1748391414;
                    }
                    int i39 = iM2764 ^ i16;
                    z5 = z2;
                    sb7 = sb3;
                    strM6952 = strM6952;
                    i23 = i39;
                    i22 = i15;
                    str9 = str9;
                    sArr = sArr;
                    break;
                case 314536376:
                case 1273187139:
                    strM6952 = strM6952;
                    sArr = sArr;
                    sb7 = sb7;
                    z5 = z5;
                    if (i24 >= strArr2.length) {
                        i12 = i26;
                        z3 = z5;
                        str7 = str9;
                        sb4 = sb7;
                        int iM316116 = (C0773.m3169("ܶ֡") + i21) * (-119);
                        sb7 = sb4;
                        str9 = str7;
                        sArr = sArr;
                        String str12 = strM6952;
                        i23 = iM316116 ^ 136762566;
                        i22 = ((iM316116 ^ i20) * (-20351)) ^ 109328890;
                        strM6952 = str12;
                        int i217 = i12;
                        z5 = z3;
                        i26 = i217;
                    } else {
                        iM31611 = C0773.m3169("ܰۢ") ^ i20;
                        i17 = ((iM31611 ^ i21) * 14515) ^ (-966323283);
                        i18 = 798240205;
                        i8 = iM31611 ^ i18;
                        sb7 = sb7;
                        z5 = z5;
                        i22 = i17;
                        strM6952 = strM6952;
                        sArr = sArr;
                        i23 = i8;
                    }
                    break;
                case 336943072:
                case 1199373549:
                    if (C0862.f3233 != 0) {
                        iM3169 = (i21 - C0773.m3169("ۘܺ")) * (-75);
                        i = ((iM3169 ^ i20) * 2439) ^ 315542498;
                        i2 = -382822942;
                        i23 = iM3169 ^ i2;
                        i22 = i;
                    } else {
                        str3 = strM6952;
                        sArr = sArr;
                        str4 = str9;
                        sb = sb7;
                        z = z5;
                        i3 = i26;
                        str5 = strM45701;
                        iM2761 = (C0619.m2761("ۛۧ") + i21) * 109;
                        i22 = ((iM2761 ^ i20) * 13075) ^ (-957935697);
                        i4 = -1297056553;
                        i5 = iM2761 ^ i4;
                        strM45701 = str5;
                        sb7 = sb;
                        i26 = i3;
                        z5 = z;
                        str9 = str4;
                        strM6952 = str3;
                        sArr = sArr;
                        i23 = i5;
                        strArr2 = strArr;
                    }
                    break;
                case 377838285:
                case 1108731650:
                    str3 = strM6952;
                    sArr = sArr;
                    str4 = str9;
                    sb = sb7;
                    z = z5;
                    i3 = i26;
                    str6 = strM45701;
                    s = s2;
                    if (((s * s) + 20675209) - (s * 9094) < 0) {
                        iM2762 = C0619.m2761("ۡ֡") ^ i21;
                        i6 = ((iM2762 ^ i20) * 19343) ^ 508835565;
                        i7 = -1110665138;
                        i5 = iM2762 ^ i7;
                        s2 = s;
                        strM45701 = str6;
                        i22 = i6;
                        sb7 = sb;
                        i26 = i3;
                        z5 = z;
                        str9 = str4;
                        strM6952 = str3;
                        sArr = sArr;
                        i23 = i5;
                        strArr2 = strArr;
                    } else {
                        int iM2769 = C0619.m2761("ۚۘ") ^ i20;
                        int i40 = ((iM2769 ^ i21) * 9741) ^ 135003096;
                        i8 = iM2769 ^ 1421495491;
                        s2 = s;
                        strM45701 = str6;
                        sb7 = sb;
                        i26 = i3;
                        i22 = i40;
                        z5 = z;
                        str9 = str4;
                        strM6952 = str3;
                        sArr = sArr;
                        strArr2 = strArr;
                        i23 = i8;
                    }
                    break;
                case 424204340:
                case 1497895910:
                    throw new NullPointerException(C2023.m6966(f63781, 2, 9, i25));
                case 430979230:
                case 1455804257:
                    strM6952 = strM6952;
                    sArr = sArr;
                    sb7 = sb7;
                    z5 = z5;
                    if (z4) {
                        iM31611 = C0773.m3169("ܿۧ") ^ i21;
                        i17 = ((iM31611 ^ i20) * 26115) ^ 756581760;
                        i18 = -911496313;
                    } else {
                        iM31611 = (i20 - C0619.m2761("֡ۘ")) * 69;
                        i17 = ((iM31611 ^ i21) * 19779) ^ (-474787789);
                        i18 = -1853792357;
                    }
                    i8 = iM31611 ^ i18;
                    sb7 = sb7;
                    z5 = z5;
                    i22 = i17;
                    strM6952 = strM6952;
                    sArr = sArr;
                    i23 = i8;
                    break;
                case 469636031:
                case 2121686904:
                    i25 = 43304;
                    iM2763 = (C0619.m2761("᩻᩹") + i20) * 39;
                    i = ((iM2763 ^ i21) * (-28637)) ^ 1883347521;
                    i11 = 1251126877;
                    int i310 = iM2763 ^ i11;
                    strM45701 = strM45701;
                    sb7 = sb7;
                    i26 = i26;
                    z5 = z5;
                    str9 = str9;
                    strM6952 = strM6952;
                    sArr = sArr;
                    i23 = i310;
                    i22 = i;
                    break;
                case 945541011:
                case 1741851508:
                    if (!C0862.m3503()) {
                        str3 = strM6952;
                        sArr = sArr;
                        str4 = str9;
                        sb = sb7;
                        z = z5;
                        i3 = i26;
                        str5 = strM45701;
                        iM2761 = (C0619.m2761("ۛۧ") + i21) * 109;
                        i22 = ((iM2761 ^ i20) * 13075) ^ (-957935697);
                        i4 = -1297056553;
                        i5 = iM2761 ^ i4;
                        strM45701 = str5;
                        sb7 = sb;
                        i26 = i3;
                        z5 = z;
                        str9 = str4;
                        strM6952 = str3;
                        sArr = sArr;
                        i23 = i5;
                        strArr2 = strArr;
                    } else {
                        iM3169 = (i20 - C0619.m2761("ۗۨ")) * 35;
                        i = ((iM3169 ^ i21) * 31409) ^ 1497462910;
                        i2 = 1665525585;
                        i23 = iM3169 ^ i2;
                        i22 = i;
                    }
                    break;
                default:
                    str3 = strM6952;
                    sArr = sArr;
                    str4 = str9;
                    sb = sb7;
                    z = z5;
                    s = s2;
                    i3 = i26;
                    str6 = strM45701;
                    if (RunnableC3055.f9898 >= 0) {
                        int iM316117 = (i21 - C0773.m3169("ᩴ۠")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        int i218 = ((iM316117 ^ i20) * (-21161)) ^ (-719610851);
                        i5 = iM316117 ^ 1148806835;
                        s2 = s;
                        strM45701 = str6;
                        i22 = i218;
                        str9 = str4;
                        i26 = i3;
                        sArr = sArr;
                        sb7 = null;
                        z5 = z;
                        strM6952 = str3;
                    } else {
                        iM2762 = C0773.m3169("ᩳ֡") ^ i21;
                        i6 = ((iM2762 ^ i20) * (-8475)) ^ 1964689826;
                        i7 = -608773285;
                        i5 = iM2762 ^ i7;
                        s2 = s;
                        strM45701 = str6;
                        i22 = i6;
                        sb7 = sb;
                        i26 = i3;
                        z5 = z;
                        str9 = str4;
                        strM6952 = str3;
                        sArr = sArr;
                    }
                    i23 = i5;
                    strArr2 = strArr;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22825 m45702() {
        return this.f63782;
    }
}
