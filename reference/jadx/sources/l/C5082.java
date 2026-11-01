package l;

import bin.mt.plugin.api.translation.BatchTranslationEngine;
import bin.mt.plugin.api.translation.TranslationEngine;
import com.alipay.sdk.m.p.a;
import com.google.android.material.slider.BaseSlider;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۚۗۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: U7HQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C5082 implements BatchTranslationEngine.BatchingStrategy {

    /* JADX INFO: renamed from: ᩶ۛܳ, reason: not valid java name and contains not printable characters */
    private static final short[] f17724 = {7325, 10395};

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f17725;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f17726;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final TranslationEngine.TextLengthCalculator f17727;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f17728;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f17729;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f17730;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f17731;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f17732;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f17733;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f17734;

    /* JADX WARN: Code duplicated, block: B:57:0x01cf A[PHI: r1 r5 r6 r17
      0x01cf: PHI (r1v3 java.lang.String) = (r1v2 java.lang.String), (r1v5 java.lang.String) binds: [B:56:0x01cd, B:32:0x00cf] A[DONT_GENERATE, DONT_INLINE]
      0x01cf: PHI (r5v4 short) = (r5v3 short), (r5v2 short) binds: [B:56:0x01cd, B:32:0x00cf] A[DONT_GENERATE, DONT_INLINE]
      0x01cf: PHI (r6v4 short) = (r6v3 short), (r6v2 short) binds: [B:56:0x01cd, B:32:0x00cf] A[DONT_GENERATE, DONT_INLINE]
      0x01cf: PHI (r17v12 java.lang.String) = (r17v4 java.lang.String), (r17v13 java.lang.String) binds: [B:56:0x01cd, B:32:0x00cf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x0295 A[PHI: r7 r17
      0x0295: PHI (r7v4 int) = (r7v2 int), (r7v2 int), (r7v3 int), (r7v2 int) binds: [B:73:0x0293, B:64:0x023c, B:52:0x01a7, B:19:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x0295: PHI (r17v16 java.lang.String) = (r17v0 java.lang.String), (r17v2 java.lang.String), (r17v5 java.lang.String), (r17v17 java.lang.String) binds: [B:73:0x0293, B:64:0x023c, B:52:0x01a7, B:19:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m14175(char c, int i) {
        int iM45029;
        int i2;
        int iM450210;
        int i3;
        int i4;
        String strM1774 = null;
        String strM38890 = null;
        TranslationEngine.TextLengthCalculator textLengthCalculator = null;
        short[] sArr = null;
        short s = 0;
        short s2 = 0;
        int i5 = 0;
        short s3 = 0;
        int i6 = 0;
        short[] sArr2 = null;
        int i7 = 369247550;
        int i8 = C2249.f8050;
        int i9 = C0278.f1572;
        int iM450211 = C19806.m45029("۟ۚ") ^ i8;
        int i10 = ((iM450211 ^ i9) * 26741) ^ 1192426543;
        int i11 = iM450211 ^ (-1331035920);
        while (true) {
            String str = null;
            while (true) {
                i7 = ((((i7 ^ i9) * 31767) >> 31) & i10) ^ i11;
                switch (i7) {
                    case -1941966047:
                    case 1794893119:
                        str = str;
                        i5 = (s * s2) + 1;
                        if (C19806.f63586) {
                            iM45029 = (i8 - C19806.m45029("ۛ۠")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                            i10 = ((iM45029 ^ i9) * 19179) ^ 1412368780;
                            i2 = -1563445515;
                        } else {
                            iM45029 = (i8 - ThreadFactoryC3888.m11306("֡۫")) * 57;
                            i10 = ((iM45029 ^ i9) * (-2373)) ^ (-824166596);
                            i2 = -1082114764;
                        }
                        i11 = iM45029 ^ i2;
                        str = str;
                        break;
                    case -1434005610:
                    case 622489593:
                        if (C19806.f63586) {
                        }
                        str = str;
                        iM45029 = (i8 - C19806.m45029("ۛ۠")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i10 = ((iM45029 ^ i9) * 19179) ^ 1412368780;
                        i2 = -1563445515;
                        i11 = iM45029 ^ i2;
                        str = str;
                        break;
                    case -1371920427:
                    case -927733105:
                        return textLengthCalculator.calculate(strM38890);
                    case -1298286871:
                    case -1266176231:
                        C0962.m3746();
                        str = str;
                        iM45029 = (i8 - C19806.m45029("ۛ۠")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i10 = ((iM45029 ^ i9) * 19179) ^ 1412368780;
                        i2 = -1563445515;
                        i11 = iM45029 ^ i2;
                        str = str;
                        break;
                    case -1096305597:
                    case 2048663596:
                        str = str;
                        if (C0962.f3784) {
                            iM45029 = (i8 - C19806.m45029("ۛ۠")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                            i10 = ((iM45029 ^ i9) * 19179) ^ 1412368780;
                            i2 = -1563445515;
                        } else {
                            iM45029 = (ThreadFactoryC3888.m11306("ۜᩳ") + i8) * (-59);
                            i10 = ((iM45029 ^ i9) * 495) ^ 411179159;
                            i2 = -826235919;
                        }
                        i11 = iM45029 ^ i2;
                        str = str;
                        break;
                    case -1014985621:
                    case 26854524:
                        if (C10634.f36300 < 0) {
                            int iM11306 = (ThreadFactoryC3888.m11306("ۧܺ") ^ i9) * (-125);
                            i10 = ((iM11306 ^ i8) * 18491) ^ 1412347022;
                            i11 = iM11306 ^ 922664810;
                        }
                        break;
                    case -1000516039:
                    case 1020933083:
                        return C2871.m8641(strM38890);
                    case -921176726:
                    case 266432383:
                        i6 = 10385;
                        iM45029 = (i8 - C19806.m45029("ܽܳ")) * 79;
                        i10 = ((iM45029 ^ i9) * (-10769)) ^ 118623813;
                        i2 = 287498785;
                        i11 = iM45029 ^ i2;
                        str = str;
                        break;
                    case -764913267:
                    case -539259078:
                        str = str;
                        if (!C3286.f12186) {
                            iM45029 = ThreadFactoryC3888.m11306("ܰ᩻") ^ i9;
                            i10 = ((iM45029 ^ i8) * (-8779)) ^ (-1198950096);
                            i2 = -1546629521;
                            i11 = iM45029 ^ i2;
                            str = str;
                        }
                        str = str;
                        iM450210 = (i8 - ThreadFactoryC3888.m11306("᩵ܶ")) * 7;
                        str = str;
                        i3 = ((iM450210 ^ i9) * 32473) ^ (-1727503574);
                        i4 = 1127833118;
                        i11 = iM450210 ^ i4;
                        i10 = i3;
                        str = str;
                        break;
                    case -378467099:
                    case 722640184:
                        if (RunnableC0195.f1321 >= 0) {
                            iM450210 = (i8 - ThreadFactoryC3888.m11306("᩵ܶ")) * 7;
                            str = str;
                            i3 = ((iM450210 ^ i9) * 32473) ^ (-1727503574);
                            i4 = 1127833118;
                            i11 = iM450210 ^ i4;
                            i10 = i3;
                            str = str;
                        }
                        break;
                    case -316876663:
                    case 705257716:
                        i6 = 35250;
                        iM45029 = (i8 - C19806.m45029("ܽܳ")) * 79;
                        i10 = ((iM45029 ^ i9) * (-10769)) ^ 118623813;
                        i2 = 287498785;
                        i11 = iM45029 ^ i2;
                        str = str;
                        break;
                    case -159552222:
                    case 522626300:
                        str = str;
                        int i12 = s + s3;
                        if ((i12 * i12) - i5 >= 0) {
                            iM45029 = ThreadFactoryC3888.m11306("ۛܿ") ^ i8;
                            i10 = ((iM45029 ^ i9) * 26025) ^ (-904205895);
                            i2 = -813505068;
                        } else {
                            iM45029 = ThreadFactoryC3888.m11306("ۡۡ") ^ i9;
                            i10 = ((iM45029 ^ i8) * 16145) ^ 2051862741;
                            i2 = -261421106;
                        }
                        i11 = iM45029 ^ i2;
                        str = str;
                        break;
                    case -101402536:
                    case 230159497:
                        str = str;
                        s = sArr[0];
                        s2 = 2;
                        if (C2642.f10294 <= 0) {
                            iM45029 = (ThreadFactoryC3888.m11306("ۢۛ") ^ i8) * (-89);
                            i10 = ((iM45029 ^ i9) * 26611) ^ (-1154422150);
                            i2 = 913391650;
                        } else {
                            iM45029 = (ThreadFactoryC3888.m11306("֨ۧ") ^ i9) * (-97);
                            i10 = ((iM45029 ^ i8) * 32065) ^ 1482843033;
                            i2 = 1503378057;
                        }
                        i11 = iM45029 ^ i2;
                        str = str;
                        break;
                    case -64075293:
                    case 1333545942:
                        char[] cArr = new char[i];
                        Arrays.fill(cArr, c);
                        if (!CallableC1627.f6528) {
                        }
                        str = new String(cArr);
                        sArr2 = f17724;
                        if (C1398.f5802 <= 0) {
                            iM450210 = (i8 - ThreadFactoryC3888.m11306("᩵ܶ")) * 7;
                            str = str;
                            i3 = ((iM450210 ^ i9) * 32473) ^ (-1727503574);
                            i4 = 1127833118;
                        } else {
                            iM450210 = (C19806.m45029("᩶ܿ") ^ i8) * (-7);
                            str = str;
                            i3 = ((iM450210 ^ i9) * 28931) ^ 899436189;
                            i4 = -90954511;
                        }
                        i11 = iM450210 ^ i4;
                        i10 = i3;
                        str = str;
                        break;
                        break;
                    case 62851753:
                    case 1204369223:
                        str = str;
                        strM1774 = C0278.m1774(sArr2, 1, 1, i6);
                        if (C0817.f3443) {
                            iM45029 = (C19806.m45029("ܺۤ") ^ i9) * 127;
                            i10 = ((iM45029 ^ i8) * (-437)) ^ 1685797024;
                            i2 = -1153574095;
                        } else {
                            iM45029 = (ThreadFactoryC3888.m11306("ۢۛ") ^ i8) * (-89);
                            i10 = ((iM45029 ^ i9) * 26611) ^ (-1154422150);
                            i2 = 913391650;
                        }
                        i11 = iM45029 ^ i2;
                        str = str;
                        break;
                    case 522179542:
                    case 625425346:
                        strM38890 = C16523.m38890(strM1774, str, strM1774);
                        textLengthCalculator = this.f17727;
                        if (textLengthCalculator == null) {
                            str = str;
                            iM45029 = (ThreadFactoryC3888.m11306("ܿܿ") + i8) * 57;
                            i10 = ((iM45029 ^ i9) * (-6407)) ^ 2004756370;
                            i2 = -359993012;
                            i11 = iM45029 ^ i2;
                            str = str;
                        } else {
                            iM450210 = (C19806.m45029("ܶۛ") ^ i9) * 119;
                            str = str;
                            i3 = ((iM450210 ^ i8) * 12365) ^ 2012437911;
                            i4 = 478237755;
                            i11 = iM450210 ^ i4;
                            i10 = i3;
                            str = str;
                        }
                        break;
                    case 1311786087:
                    case 1421451276:
                        C0629.m2907();
                        C2788.m8472();
                        return 0;
                    case 1438368516:
                    case 1892256324:
                        str = str;
                        if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                            iM45029 = (i8 - C19806.m45029("ۛ۠")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                            i10 = ((iM45029 ^ i9) * 19179) ^ 1412368780;
                            i2 = -1563445515;
                        } else {
                            iM45029 = C19806.m45029("᩻᩵") ^ i8;
                            i10 = ((iM45029 ^ i9) * 1061) ^ 1568625261;
                            i2 = 302532536;
                        }
                        i11 = iM45029 ^ i2;
                        str = str;
                        break;
                    case 1713734383:
                    case 1798782351:
                        str = str;
                        sArr = f17724;
                        if (!C3743.f13569) {
                        }
                        iM45029 = (ThreadFactoryC3888.m11306("ᩳ֨") + i9) * (-71);
                        i10 = ((iM45029 ^ i8) * (-22515)) ^ 15029254;
                        i2 = 720219716;
                        i11 = iM45029 ^ i2;
                        str = str;
                        break;
                        break;
                    default:
                        str = str;
                        s3 = 1;
                        if (C1461.f5957 > 0) {
                            iM45029 = (i9 - ThreadFactoryC3888.m11306("۠۬")) * 73;
                            i10 = ((iM45029 ^ i8) * (-23517)) ^ (-645158518);
                            i2 = 2039979023;
                            i11 = iM45029 ^ i2;
                            str = str;
                        }
                        str = str;
                        iM450210 = (i8 - ThreadFactoryC3888.m11306("᩵ܶ")) * 7;
                        str = str;
                        i3 = ((iM450210 ^ i9) * 32473) ^ (-1727503574);
                        i4 = 1127833118;
                        i11 = iM450210 ^ i4;
                        i10 = i3;
                        str = str;
                        break;
                }
            }
            int iM450212 = C19806.m45029("ۨ֫") ^ i9;
            i10 = ((iM450212 ^ i8) * 29391) ^ (-286406443);
            i11 = iM450212 ^ (-1443858499);
        }
    }

    public C5082(C22016 c22016, int i, TranslationEngine.TextLengthCalculator textLengthCalculator) {
        int i2 = 0;
        int i3 = 1004310072;
        int i4 = C1189.f5284;
        int i5 = RunnableC0195.f1321;
        int iM45029 = (C19806.m45029("ۤᩳ") ^ i5) * (-91);
        int i6 = ((iM45029 ^ i4) * 29587) ^ (-977128393);
        int i7 = -321750766;
        while (true) {
            i3 = ((((i3 ^ i4) * (-379)) >> 31) & i6) ^ (iM45029 ^ i7);
            switch (i3) {
                case -2125335955:
                case 807442600:
                    if (RunnableC3388.f12514 >= 0) {
                        iM45029 = (i5 - ThreadFactoryC3888.m11306("ۤ۫")) * (-17);
                        i6 = ((iM45029 ^ i4) * (-22771)) ^ (-135970865);
                        i7 = 346959586;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܰۧ") + i5) * (-25);
                        i6 = ((iM45029 ^ i4) * 3975) ^ (-499671925);
                        i7 = -439156497;
                    }
                    break;
                case -2115784463:
                case -681584196:
                    if (C1148.m4232() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۙۚ") ^ i4;
                        i6 = ((iM45029 ^ i5) * (-29313)) ^ (-2062454570);
                        i7 = 837294825;
                    } else {
                        iM45029 = C19806.m45029("ܽܰ") ^ i4;
                        i6 = ((iM45029 ^ i5) * (-20815)) ^ (-387207492);
                        i7 = 221310898;
                    }
                    break;
                case -2070531529:
                case 1580873465:
                    C2332.m7079();
                    if (C3722.f13525 > 0) {
                        iM45029 = (i4 - C19806.m45029("ܶ֨")) * 65;
                        i6 = ((iM45029 ^ i5) * 11475) ^ (-1543595860);
                        i7 = 197370885;
                    } else {
                        iM45029 = (i5 - ThreadFactoryC3888.m11306("ۤ۫")) * (-17);
                        i6 = ((iM45029 ^ i4) * (-22771)) ^ (-135970865);
                        i7 = 346959586;
                    }
                    break;
                case -1982001055:
                case -1119991273:
                    this.f17734 = i;
                    this.f17727 = textLengthCalculator;
                    return;
                case -1971801926:
                case 1129123986:
                    C2704.m8255();
                    C1977.m6356();
                    iM45029 = (i5 - ThreadFactoryC3888.m11306("ۤ۫")) * (-17);
                    i6 = ((iM45029 ^ i4) * (-22771)) ^ (-135970865);
                    i7 = 346959586;
                    break;
                case -1817341171:
                case 2104930832:
                    if (C19806.f63586) {
                        iM45029 = (i5 - ThreadFactoryC3888.m11306("ۤ۫")) * (-17);
                        i6 = ((iM45029 ^ i4) * (-22771)) ^ (-135970865);
                        i7 = 346959586;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩺ۙ") ^ i5;
                        i6 = ((iM45029 ^ i4) * 30537) ^ 1711637620;
                        i7 = -1175026524;
                    }
                    break;
                case -1614020671:
                case 1001203616:
                    if (C10634.f36300 >= 0) {
                        iM45029 = C19806.m45029("ܳۖ") ^ i4;
                        i6 = ((iM45029 ^ i5) * (-23997)) ^ 1433727412;
                        i7 = 217561681;
                    } else {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("֨֫")) * (-33);
                        i6 = ((iM45029 ^ i5) * 26911) ^ (-1803164526);
                        i7 = 1369869486;
                    }
                    break;
                case -1364234160:
                case -80128475:
                    if (C2124.f7782 <= 0) {
                        iM45029 = (C19806.m45029("ᩴ᩹") ^ i5) * (-69);
                        i6 = ((iM45029 ^ i4) * (-25819)) ^ 1168623489;
                        i7 = -1995245397;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۠ܽ") ^ i4;
                        i6 = ((iM45029 ^ i5) * 3185) ^ (-519908086);
                        i7 = -250113023;
                    }
                    break;
                case -1303012386:
                case 1974838162:
                    if (C3743.f13569) {
                        iM45029 = (ThreadFactoryC3888.m11306("۬ܿ") + i5) * (-101);
                        i6 = ((iM45029 ^ i4) * (-7905)) ^ 1921628748;
                        i7 = 1743243938;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۙۚ") ^ i4;
                        i6 = ((iM45029 ^ i5) * (-29313)) ^ (-2062454570);
                        i7 = 837294825;
                    }
                    break;
                case -543341312:
                case 496594537:
                    this.f17728 = i2;
                    if (C2871.f10837 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۙۚ") ^ i4;
                        i6 = ((iM45029 ^ i5) * (-29313)) ^ (-2062454570);
                        i7 = 837294825;
                    } else {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("᩺᩺")) * (-19);
                        i6 = ((iM45029 ^ i5) * 8127) ^ 806239300;
                        i7 = 398547466;
                    }
                    break;
                case 175458198:
                case 1107346904:
                    ThreadFactoryC3888.m11300();
                    throw new RuntimeException();
                case 287989561:
                case 438331752:
                    if (C0278.m1789() <= 0) {
                        iM45029 = C19806.m45029("ܳۖ") ^ i4;
                        i6 = ((iM45029 ^ i5) * (-23997)) ^ 1433727412;
                        i7 = 217561681;
                    } else {
                        iM45029 = (C19806.m45029("۬ۜ") ^ i5) * (-65);
                        i6 = ((iM45029 ^ i4) * 7031) ^ 922376477;
                        i7 = -1183487715;
                    }
                    break;
                case 453545652:
                case 2092033635:
                    C0278.m1789();
                    if (C1025.f4800 < 0) {
                        iM45029 = (C19806.m45029("ᩴ᩹") ^ i5) * (-69);
                        i6 = ((iM45029 ^ i4) * (-25819)) ^ 1168623489;
                        i7 = -1995245397;
                    } else {
                        iM45029 = (i4 - C19806.m45029("ܶ֨")) * 65;
                        i6 = ((iM45029 ^ i5) * 11475) ^ (-1543595860);
                        i7 = 197370885;
                    }
                    break;
                case 803808350:
                case 1247937454:
                    i2 = -1;
                    this.f17731 = -1;
                    if (C7105.f23796 >= 0) {
                        iM45029 = (i4 - C19806.m45029("ܶ֨")) * 65;
                        i6 = ((iM45029 ^ i5) * 11475) ^ (-1543595860);
                        i7 = 197370885;
                    } else {
                        iM45029 = C19806.m45029("ۘ᩸") ^ i5;
                        i6 = ((iM45029 ^ i4) * 30451) ^ (-2032358317);
                        i7 = 1491889878;
                    }
                    break;
                case 1101954041:
                case 1582029330:
                    if (C1460.f5948 < 0) {
                        iM45029 = C19806.m45029("ܳۖ") ^ i4;
                        i6 = ((iM45029 ^ i5) * (-23997)) ^ 1433727412;
                        i7 = 217561681;
                    } else {
                        iM45029 = (i4 - C19806.m45029("ܶ֨")) * 65;
                        i6 = ((iM45029 ^ i5) * 11475) ^ (-1543595860);
                        i7 = 197370885;
                    }
                    break;
                default:
                    if (C1066.f4915 <= 0) {
                        iM45029 = (C19806.m45029("ᩴ᩹") ^ i5) * (-69);
                        i6 = ((iM45029 ^ i4) * (-25819)) ^ 1168623489;
                        i7 = -1995245397;
                    } else {
                        iM45029 = C19806.m45029("ۧۘ") ^ i4;
                        i6 = ((iM45029 ^ i5) * (-7325)) ^ (-788973963);
                        i7 = -1038877378;
                    }
                    break;
            }
        }
    }

    @Override // bin.mt.plugin.api.translation.BatchTranslationEngine.BatchingStrategy
    public final void reset() {
        int i = 0;
        int i2 = 0;
        int i3 = -89032542;
        int i4 = C0050.f912;
        int i5 = C1398.f5802;
        int iM45029 = C19806.m45029("ۛܿ") ^ i4;
        int i6 = ((iM45029 ^ i5) * 8729) ^ (-1228035090);
        int i7 = 2041377359;
        while (true) {
            i3 = ((((i3 ^ i5) * 9399) >> 31) & i6) ^ (iM45029 ^ i7);
            switch (i3) {
                case -2127999390:
                case -2093733160:
                    if (!C1377.f5749) {
                        iM45029 = ThreadFactoryC3888.m11306("ۧ᩷") ^ i4;
                        i6 = ((iM45029 ^ i5) * 11479) ^ 2014421576;
                        i7 = 245072130;
                    } else {
                        iM45029 = C19806.m45029("֫ܺ") ^ i5;
                        i6 = ((iM45029 ^ i4) * 10237) ^ (-1463372876);
                        i7 = -1738967589;
                    }
                    break;
                case -1942865700:
                case -1143023398:
                    C3535.m10431();
                    C1461.m5080();
                    iM45029 = C19806.m45029("֫ܺ") ^ i5;
                    i6 = ((iM45029 ^ i4) * 10237) ^ (-1463372876);
                    i7 = -1738967589;
                    break;
                case -1848071818:
                case 2060858848:
                    this.f17730 = 0L;
                    if (RunnableC1895.m6170() != 0) {
                        iM45029 = (C19806.m45029("ۡۖ") ^ i4) * (-91);
                        i6 = ((iM45029 ^ i5) * (-16997)) ^ 1082862619;
                        i7 = 1842376684;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܽۤ") + i5) * 95;
                        i6 = ((iM45029 ^ i4) * (-29917)) ^ 1539267284;
                        i7 = -277620175;
                    }
                    break;
                case -1598438725:
                case 1118955665:
                    C3286.m9798();
                    if (!C0962.f3784) {
                        iM45029 = (ThreadFactoryC3888.m11306("֫֫") ^ i5) * 75;
                        i6 = ((iM45029 ^ i4) * (-3065)) ^ 205386120;
                        i7 = 1710800336;
                    } else {
                        iM45029 = C19806.m45029("֫ܺ") ^ i5;
                        i6 = ((iM45029 ^ i4) * 10237) ^ (-1463372876);
                        i7 = -1738967589;
                    }
                    break;
                case -1286801719:
                case -1108209072:
                    C1419.m4973();
                    C1977.m6356();
                    break;
                case -1272270324:
                case 1240449916:
                    this.f17731 = i2;
                    this.f17728 = i2;
                    break;
                case -1109929915:
                case 2076205744:
                    if (C1461.f5957 <= 0) {
                        iM45029 = C19806.m45029("֫ܺ") ^ i5;
                        i6 = ((iM45029 ^ i4) * 10237) ^ (-1463372876);
                        i7 = -1738967589;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܽᩴ") + i5) * 53;
                        i6 = ((iM45029 ^ i4) * (-18035)) ^ (-108386361);
                        i7 = -1903308401;
                    }
                    break;
                case -549509044:
                case -128330108:
                    if (C1419.f5860 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("֫֫") ^ i5) * 75;
                        i6 = ((iM45029 ^ i4) * (-3065)) ^ 205386120;
                        i7 = 1710800336;
                    } else {
                        iM45029 = C19806.m45029("ۜۤ") ^ i4;
                        i6 = ((iM45029 ^ i5) * (-13153)) ^ 1679418189;
                        i7 = 1262244146;
                    }
                    break;
                case -350703654:
                case 354290312:
                    i2 = -1;
                    if (C19806.f63586) {
                        iM45029 = ThreadFactoryC3888.m11306("ۧ᩷") ^ i4;
                        i6 = ((iM45029 ^ i5) * 11479) ^ 2014421576;
                        i7 = 245072130;
                    } else {
                        iM45029 = C19806.m45029("ܿۢ") ^ i4;
                        i6 = ((iM45029 ^ i5) * (-20035)) ^ 1285566105;
                        i7 = 96845084;
                    }
                    break;
                case -145054584:
                case 1912991826:
                    if (C2704.f10408) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۡᩳ") + i5) * (-105);
                        i6 = ((iM45029 ^ i4) * 9779) ^ (-243866714);
                        i7 = -1932156043;
                    } else {
                        iM45029 = C19806.m45029("֫ܺ") ^ i5;
                        i6 = ((iM45029 ^ i4) * 10237) ^ (-1463372876);
                        i7 = -1738967589;
                    }
                    break;
                case -88862673:
                case 198442339:
                    C0629.m2907();
                    if (C1398.f5802 > 0) {
                        iM45029 = C19806.m45029("֫ܺ") ^ i5;
                        i6 = ((iM45029 ^ i4) * 10237) ^ (-1463372876);
                        i7 = -1738967589;
                    } else {
                        iM45029 = (i4 - C19806.m45029("᩺ۛ")) * (-127);
                        i6 = ((iM45029 ^ i5) * (-10443)) ^ (-1195321203);
                        i7 = -1270217314;
                    }
                    break;
                case 5682124:
                case 898019432:
                    i = 0;
                    if (C1937.f7317 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۧ᩷") ^ i4;
                        i6 = ((iM45029 ^ i5) * 11479) ^ 2014421576;
                        i7 = 245072130;
                    } else {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("ۨ۫")) * 39;
                        i6 = ((iM45029 ^ i5) * (-20647)) ^ 739675663;
                        i7 = 1828807336;
                    }
                    break;
                case 118887257:
                case 1596931646:
                    if (C3722.f13525 <= 0) {
                        iM45029 = C19806.m45029("֫ܺ") ^ i5;
                        i6 = ((iM45029 ^ i4) * 10237) ^ (-1463372876);
                        i7 = -1738967589;
                    } else {
                        iM45029 = C19806.m45029("֡ۙ") ^ i5;
                        i6 = ((iM45029 ^ i4) * (-2843)) ^ (-1604984469);
                        i7 = 1356194325;
                    }
                    break;
                case 1102577349:
                case 1142829502:
                    this.f17729 = i;
                    if (C0216.f1393 != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۧ᩷") ^ i4;
                        i6 = ((iM45029 ^ i5) * 11479) ^ 2014421576;
                        i7 = 245072130;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۬۠") ^ i4;
                        i6 = ((iM45029 ^ i5) * 26451) ^ (-348260408);
                        i7 = -571281951;
                    }
                    break;
                case 1205748087:
                case 1695926891:
                    if (C0962.f3784) {
                        iM45029 = C19806.m45029("֫ܺ") ^ i5;
                        i6 = ((iM45029 ^ i4) * 10237) ^ (-1463372876);
                        i7 = -1738967589;
                    } else {
                        iM45029 = (C19806.m45029("ܽۗ") + i4) * (-107);
                        i6 = ((iM45029 ^ i5) * 10761) ^ 1329951367;
                        i7 = 1751578148;
                    }
                    break;
                default:
                    this.f17732 = i;
                    this.f17725 = i;
                    if (C0216.f1393 != 0) {
                        iM45029 = (C19806.m45029("ۡۖ") ^ i4) * (-91);
                        i6 = ((iM45029 ^ i5) * (-16997)) ^ 1082862619;
                        i7 = 1842376684;
                    } else {
                        iM45029 = C19806.m45029("᩻ܽ") ^ i5;
                        i6 = ((iM45029 ^ i4) * (-9877)) ^ 307331142;
                        i7 = 1040712535;
                    }
                    break;
            }
            return;
        }
    }

    @Override // bin.mt.plugin.api.translation.BatchTranslationEngine.BatchingStrategy
    public final boolean tryAdd(String str) {
        int iM45029;
        int i;
        int i2;
        TranslationEngine.TextLengthCalculator textLengthCalculator;
        int i3;
        int i4;
        int iM11306;
        int i5;
        int i6;
        TranslationEngine.TextLengthCalculator textLengthCalculator2;
        int i7;
        TranslationEngine.TextLengthCalculator textLengthCalculator3;
        int iM450210;
        int i8;
        int iM450211;
        int i9;
        int i10;
        TranslationEngine.TextLengthCalculator textLengthCalculator4;
        int iM6360;
        int i11;
        int iM450212;
        int i12;
        int iM11307;
        int i13;
        int i14;
        int iM450213;
        int i15;
        int i16;
        int iM450214;
        int i17;
        int i18;
        int iM450215;
        int i19;
        int iM3360;
        int i20;
        int iM3361;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25 = C7105.f23796;
        int i26 = C1148.f5161;
        int iM11308 = ThreadFactoryC3888.m11306("۬᩺") ^ i26;
        int i27 = ((iM11308 ^ i25) * (-27463)) ^ (-690315818);
        TranslationEngine.TextLengthCalculator textLengthCalculator5 = null;
        long j = 0;
        long j2 = 0;
        int i28 = iM11308 ^ 1123866624;
        int i29 = 0;
        int i30 = 0;
        int iM3867 = 0;
        int i31 = 0;
        char cM6362 = 0;
        int i32 = 0;
        char c = 0;
        char c2 = 0;
        boolean z = false;
        int i33 = 0;
        int i34 = 0;
        int iM3362 = 0;
        int i35 = 0;
        int i36 = 0;
        int i37 = 0;
        int i38 = 0;
        int i39 = 0;
        int i40 = 0;
        boolean z2 = false;
        int i41 = 0;
        int i42 = 0;
        int i43 = 0;
        int i44 = 0;
        int i45 = 0;
        int i46 = 0;
        int i47 = -932775978;
        long j3 = 0;
        long j4 = 0;
        int i48 = 0;
        long j5 = 0;
        int i49 = 0;
        while (true) {
            i47 = i28 ^ ((((i47 ^ i25) * 24847) >> 31) & i27);
            switch (i47) {
                case -2127371895:
                case 1215778207:
                    i35 = i35;
                    this.f17729 += z ? 1 : 0;
                    if (C2124.m6673() <= 0) {
                        iM450214 = (C19806.m45029("᩷֡") ^ i26) * (-39);
                        i27 = ((iM450214 ^ i25) * 14207) ^ 40706389;
                        i17 = 1125402206;
                    } else {
                        iM450214 = C19806.m45029("ۜ֨") ^ i26;
                        i27 = ((iM450214 ^ i25) * 12839) ^ 1495739274;
                        i17 = 196977610;
                    }
                    i28 = iM450214 ^ i17;
                    i35 = i35;
                    break;
                case -2112695594:
                case 1165622025:
                    int i50 = iM3362;
                    i35 = i35;
                    if (j2 + j4 <= i30) {
                        i42 = i42;
                        iM3362 = i50;
                        i2 = i29;
                        iM450212 = C19806.m45029("᩻ۙ") ^ i26;
                        i9 = ((iM450212 ^ i25) * 5881) ^ (-560489008);
                        i12 = 935799750;
                        i28 = iM450212 ^ i12;
                        i27 = i9;
                        i29 = i2;
                        i42 = i42;
                        i35 = i35;
                    } else {
                        textLengthCalculator2 = textLengthCalculator5;
                        i42 = i42;
                        iM3362 = i50;
                        i2 = i29;
                        i7 = i39;
                        iM450210 = ThreadFactoryC3888.m11306("᩻֨") ^ i25;
                        textLengthCalculator3 = textLengthCalculator2;
                        i27 = ((iM450210 ^ i26) * (-24191)) ^ (-990528991);
                        i8 = 1491701247;
                        i28 = iM450210 ^ i8;
                        textLengthCalculator5 = textLengthCalculator3;
                        i39 = i7;
                        i29 = i2;
                        i42 = i42;
                        i35 = i35;
                    }
                    break;
                case -2111035419:
                case -1462229028:
                    this.f17733 = m14175(c, iM3867);
                    this.f17728 = iM3867;
                    i18 = iM3362;
                    i35 = i35;
                    iM450215 = ThreadFactoryC3888.m11306("ܿۖ") ^ i26;
                    i27 = ((iM450215 ^ i25) * 7975) ^ 1747023344;
                    i19 = 641753119;
                    int i51 = iM450215 ^ i19;
                    iM3362 = i18;
                    i35 = i35;
                    i28 = i51;
                    break;
                case -2001334702:
                case -686864315:
                    i35 = i35;
                    cM6362 = C1977.m6362(str, i33);
                    if (cM6362 == c2) {
                        iM450213 = ThreadFactoryC3888.m11306("ۤ᩸") ^ i26;
                        i15 = ((iM450213 ^ i25) * 22167) ^ (-585703558);
                        i16 = -674188036;
                    } else {
                        iM450213 = (C19806.m45029("ۧۢ") ^ i25) * 59;
                        i15 = ((iM450213 ^ i26) * (-7963)) ^ (-2022446440);
                        i16 = 1806828947;
                    }
                    i28 = iM450213 ^ i16;
                    i27 = i15;
                    i35 = i35;
                    break;
                case -1965620416:
                case -370421056:
                    int i52 = i35;
                    int i53 = i42;
                    int i54 = i29;
                    i21 = i48;
                    iM3362 = C0797.m3360(this.f17732, i34);
                    i20 = i52;
                    iM3360 = C0797.m3360(this.f17725, i20);
                    if (C3286.f12186) {
                        i42 = i53;
                        iM3361 = i54;
                        int iM450216 = C19806.m45029("ܽۘ") ^ i25;
                        i23 = iM3360;
                        i27 = ((iM450216 ^ i26) * (-7293)) ^ (-1044660890);
                        i24 = iM450216 ^ 1497963609;
                        i48 = i21;
                        i29 = iM3361;
                    } else {
                        int iM450217 = (i26 - C19806.m45029("ۜܳ")) * 29;
                        i23 = iM3360;
                        i27 = ((iM450217 ^ i25) * (-30053)) ^ (-290790966);
                        i24 = iM450217 ^ 698760259;
                        i48 = i21;
                        i29 = i54;
                        i42 = i53;
                    }
                    i35 = i20;
                    i31 = i23;
                    i28 = i24;
                    break;
                case -1924438989:
                case 659612394:
                    if (C1066.m4023() > 0) {
                        i35 = i35;
                        i42 = i42;
                        i2 = i29;
                        iM450212 = (C19806.m45029("ۤۤ") ^ i26) * 91;
                        i9 = ((iM450212 ^ i25) * (-1153)) ^ (-1213096327);
                        i12 = -154705316;
                        i28 = iM450212 ^ i12;
                        i27 = i9;
                        i29 = i2;
                        i42 = i42;
                        i35 = i35;
                    } else {
                        iM45029 = (i26 - ThreadFactoryC3888.m11306("ᩳۘ")) * (-3);
                        i27 = ((iM45029 ^ i25) * (-16229)) ^ (-1373008737);
                        i = 799191348;
                        i28 = iM45029 ^ i;
                    }
                    break;
                case -1844863551:
                case 1961703414:
                    if (C7105.m18985()) {
                        i35 = i35;
                        i4 = i39;
                        textLengthCalculator = textLengthCalculator5;
                        i42 = i42;
                        i3 = i29;
                        iM11306 = (ThreadFactoryC3888.m11306("ۛۗ") ^ i25) * (-107);
                        i5 = ((iM11306 ^ i26) * (-30285)) ^ 34782617;
                        i6 = -578573724;
                        i28 = iM11306 ^ i6;
                        i27 = i5;
                        textLengthCalculator5 = textLengthCalculator;
                        i29 = i3;
                        i39 = i4;
                        i42 = i42;
                        i35 = i35;
                    }
                    i35 = i35;
                    iM450214 = (ThreadFactoryC3888.m11306("ۛ۫") + i26) * 83;
                    i27 = ((iM450214 ^ i25) * (-19559)) ^ 1523490512;
                    i17 = 79750892;
                    i28 = iM450214 ^ i17;
                    i35 = i35;
                    break;
                case -1836129699:
                case -1220615751:
                    return z2;
                case -1825722803:
                case -976793230:
                    C1398.m4895();
                    C1668.m5583();
                    i35 = i35;
                    iM450214 = (ThreadFactoryC3888.m11306("ۛ۫") + i26) * 83;
                    i27 = ((iM450214 ^ i25) * (-19559)) ^ 1523490512;
                    i17 = 79750892;
                    i28 = iM450214 ^ i17;
                    i35 = i35;
                    break;
                case -1723688908:
                case 237802475:
                    i35 = i35;
                    i42 = i42;
                    int i55 = i29;
                    int i56 = i48;
                    int iM8641 = C2871.m8641(str);
                    c2 = a.h;
                    z = true;
                    if (i33 < iM8641) {
                        iM11307 = (C19806.m45029("ܶۗ") ^ i25) * (-25);
                        i13 = ((iM11307 ^ i26) * 32657) ^ 526655554;
                        i14 = -349883097;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("ᩳ֨") ^ i25;
                        i13 = ((iM11307 ^ i26) * 17435) ^ (-381601457);
                        i14 = 596426362;
                    }
                    i28 = iM11307 ^ i14;
                    i48 = i56;
                    i27 = i13;
                    i29 = i55;
                    c = '-';
                    i42 = i42;
                    i35 = i35;
                    break;
                case -1672936643:
                case 703965407:
                    i18 = iM3362;
                    i35 = i35;
                    if (i29 != this.f17731) {
                        iM450215 = C19806.m45029("ۜۜ") ^ i25;
                        i27 = ((iM450215 ^ i26) * 30737) ^ 1144241366;
                        i19 = -1973329118;
                    } else {
                        iM450215 = (ThreadFactoryC3888.m11306("ۢ᩸") + i25) * 21;
                        i27 = ((iM450215 ^ i26) * 9001) ^ 438659208;
                        i19 = 759893939;
                    }
                    int i57 = iM450215 ^ i19;
                    iM3362 = i18;
                    i35 = i35;
                    i28 = i57;
                    break;
                case -1653483703:
                case -1120431978:
                    i33 = i36;
                    i34 = i37;
                    i22 = i38;
                    i49 = 0;
                    i41 = 0;
                    int iM450218 = C19806.m45029("ܶ᩵") ^ i25;
                    int i58 = i22;
                    i27 = ((iM450218 ^ i26) * 32393) ^ 237446064;
                    i24 = iM450218 ^ (-1001898181);
                    i48 = i48;
                    i29 = i29;
                    i42 = i42;
                    i35 = i58;
                    i28 = i24;
                    break;
                case -1608117975:
                case 1028617449:
                    i35 = i35;
                    textLengthCalculator = textLengthCalculator5;
                    i42 = i42;
                    i3 = i29;
                    i4 = this.f17729;
                    if (C0797.f3386) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۛۗ") ^ i25) * (-107);
                        i5 = ((iM11306 ^ i26) * (-30285)) ^ 34782617;
                        i6 = -578573724;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩳ۬") + i25) * (-43);
                        i5 = ((iM11306 ^ i26) * (-7953)) ^ (-1612768597);
                        i6 = 542097951;
                    }
                    i28 = iM11306 ^ i6;
                    i27 = i5;
                    textLengthCalculator5 = textLengthCalculator;
                    i29 = i3;
                    i39 = i4;
                    i42 = i42;
                    i35 = i35;
                    break;
                case -1539998506:
                case 599568230:
                    textLengthCalculator4 = textLengthCalculator5;
                    iM6360 = textLengthCalculator4.calculate(str);
                    i32 = iM6360;
                    int iM450219 = (C19806.m45029("۬ۚ") + i26) * (-53);
                    int i59 = ((iM450219 ^ i25) * 26835) ^ 84243487;
                    i28 = iM450219 ^ (-735938752);
                    textLengthCalculator5 = textLengthCalculator4;
                    i29 = i29;
                    i27 = i59;
                    i42 = i42;
                    i35 = i35;
                    break;
                case -1469900529:
                case -1165461583:
                    i18 = iM3362;
                    i35 = i35;
                    int i60 = i49 + (z ? 1 : 0);
                    if (i60 > i34) {
                        i45 = i60;
                        i46 = i45;
                    } else {
                        i46 = i60;
                        i45 = i34;
                    }
                    iM450215 = (C19806.m45029("ܺܰ") ^ i26) * (-119);
                    i27 = ((iM450215 ^ i25) * 21047) ^ 1806489257;
                    i19 = 1608891841;
                    int i510 = iM450215 ^ i19;
                    iM3362 = i18;
                    i35 = i35;
                    i28 = i510;
                    break;
                case -1353898066:
                case 819369382:
                    if (!C3743.f13569) {
                        iM45029 = (i26 - C19806.m45029("᩶ᩳ")) * (-81);
                        i27 = ((iM45029 ^ i25) * (-10037)) ^ 603518175;
                        i = -496337935;
                        i28 = iM45029 ^ i;
                    } else {
                        i35 = i35;
                        iM450214 = (ThreadFactoryC3888.m11306("ۛ۫") + i26) * 83;
                        i27 = ((iM450214 ^ i25) * (-19559)) ^ 1523490512;
                        i17 = 79750892;
                        i28 = iM450214 ^ i17;
                        i35 = i35;
                    }
                    break;
                case -1265096822:
                case -1166286965:
                    if (C2124.f7782 <= 0) {
                        i35 = i35;
                        iM450214 = (C19806.m45029("᩷֡") ^ i26) * (-39);
                        i27 = ((iM450214 ^ i25) * 14207) ^ 40706389;
                        i17 = 1125402206;
                        i28 = iM450214 ^ i17;
                        i35 = i35;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۖ֡") ^ i25;
                        i27 = ((iM45029 ^ i26) * 30817) ^ 525173704;
                        i = 826859450;
                        i28 = iM45029 ^ i;
                    }
                    break;
                case -1224366374:
                case 591092460:
                    i18 = iM3362;
                    i35 = i35;
                    if (iM3867 != this.f17728) {
                        iM450215 = ThreadFactoryC3888.m11306("ۜ۟") ^ i26;
                        i27 = ((iM450215 ^ i25) * (-709)) ^ 1270337904;
                        i19 = -39870079;
                    } else {
                        iM450215 = ThreadFactoryC3888.m11306("ܿۖ") ^ i26;
                        i27 = ((iM450215 ^ i25) * 7975) ^ 1747023344;
                        i19 = 641753119;
                    }
                    int i511 = iM450215 ^ i19;
                    iM3362 = i18;
                    i35 = i35;
                    i28 = i511;
                    break;
                case -1190007091:
                case -647666106:
                    textLengthCalculator4 = textLengthCalculator5;
                    iM6360 = C1977.m6360(str);
                    i32 = iM6360;
                    int iM4502110 = (C19806.m45029("۬ۚ") + i26) * (-53);
                    int i512 = ((iM4502110 ^ i25) * 26835) ^ 84243487;
                    i28 = iM4502110 ^ (-735938752);
                    textLengthCalculator5 = textLengthCalculator4;
                    i29 = i29;
                    i27 = i512;
                    i42 = i42;
                    i35 = i35;
                    break;
                case -1158145030:
                case 1753988995:
                    i35 = i35;
                    i42 = i42;
                    i2 = i29;
                    TranslationEngine.TextLengthCalculator textLengthCalculator6 = this.f17727;
                    if (textLengthCalculator6 != null) {
                        iM450211 = (C19806.m45029("ۗۜ") ^ i26) * (-43);
                        i9 = ((iM450211 ^ i25) * 31189) ^ 1032441113;
                        i10 = 686632572;
                    } else {
                        iM450211 = (C19806.m45029("᩻ᩴ") + i25) * (-89);
                        i9 = ((iM450211 ^ i26) * 14675) ^ 887996486;
                        i10 = 2022877950;
                    }
                    i28 = iM450211 ^ i10;
                    textLengthCalculator5 = textLengthCalculator6;
                    i27 = i9;
                    i29 = i2;
                    i42 = i42;
                    i35 = i35;
                    break;
                case -1132058997:
                case -33594352:
                    if (C0050.f912 > 0) {
                        iM3360 = i31;
                        i20 = i35;
                        iM3361 = i29;
                        i21 = i48;
                        int iM4502111 = C19806.m45029("ܽۘ") ^ i25;
                        i23 = iM3360;
                        i27 = ((iM4502111 ^ i26) * (-7293)) ^ (-1044660890);
                        i24 = iM4502111 ^ 1497963609;
                        i48 = i21;
                        i29 = iM3361;
                        i35 = i20;
                        i31 = i23;
                        i28 = i24;
                    } else {
                        i35 = i35;
                        iM450214 = (ThreadFactoryC3888.m11306("ۛ۫") + i26) * 83;
                        i27 = ((iM450214 ^ i25) * (-19559)) ^ 1523490512;
                        i17 = 79750892;
                        i28 = iM450214 ^ i17;
                        i35 = i35;
                    }
                    break;
                case -1130388104:
                case -345797385:
                    int i61 = i41 + (z ? 1 : 0);
                    if (i61 > i35) {
                        i43 = i61;
                        i44 = i43;
                    } else {
                        i44 = i61;
                        i43 = i35;
                    }
                    iM45029 = ThreadFactoryC3888.m11306("ܺܳ") ^ i26;
                    i27 = ((iM45029 ^ i25) * 5591) ^ (-1627926222);
                    i = 1687396755;
                    i28 = iM45029 ^ i;
                    break;
                case -828780881:
                case 1045018064:
                    i18 = iM3362;
                    i35 = i35;
                    i45 = i34;
                    i46 = 0;
                    iM450215 = (C19806.m45029("ܺܰ") ^ i26) * (-119);
                    i27 = ((iM450215 ^ i25) * 21047) ^ 1806489257;
                    i19 = 1608891841;
                    int i513 = iM450215 ^ i19;
                    iM3362 = i18;
                    i35 = i35;
                    i28 = i513;
                    break;
                case -818647877:
                case 1580631768:
                    if (!C1377.f5749) {
                        i18 = iM3362;
                        i35 = i35;
                        iM450215 = (C19806.m45029("۟ۡ") + i25) * 51;
                        i27 = ((iM450215 ^ i26) * 20597) ^ 969806287;
                        i19 = -1344822669;
                        int i514 = iM450215 ^ i19;
                        iM3362 = i18;
                        i35 = i35;
                        i28 = i514;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۖ֡") ^ i25;
                        i27 = ((iM45029 ^ i26) * 30817) ^ 525173704;
                        i = 826859450;
                        i28 = iM45029 ^ i;
                    }
                    break;
                case -698888245:
                case 2065778759:
                    C3577.m10565();
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        i18 = iM3362;
                        i35 = i35;
                        iM450215 = (C19806.m45029("۟ۡ") + i25) * 51;
                        i27 = ((iM450215 ^ i26) * 20597) ^ 969806287;
                        i19 = -1344822669;
                        int i515 = iM450215 ^ i19;
                        iM3362 = i18;
                        i35 = i35;
                        i28 = i515;
                    } else {
                        i35 = i35;
                        iM450214 = (ThreadFactoryC3888.m11306("ۛ۫") + i26) * 83;
                        i27 = ((iM450214 ^ i25) * (-19559)) ^ 1523490512;
                        i17 = 79750892;
                        i28 = iM450214 ^ i17;
                        i35 = i35;
                    }
                    break;
                case -660543012:
                case 1688341535:
                    i35 = i35;
                    i42 = i42;
                    iM3867 = C1025.m3867(i42, i31 + i40);
                    i30 = this.f17734;
                    if (i30 > 0) {
                        iM450212 = (ThreadFactoryC3888.m11306("ᩳᩳ") ^ i26) * 127;
                        i2 = i29;
                        i9 = ((iM450212 ^ i25) * (-28129)) ^ (-1509572600);
                        i12 = 1907099430;
                    } else {
                        i2 = i29;
                        iM450212 = C19806.m45029("᩻ۙ") ^ i26;
                        i9 = ((iM450212 ^ i25) * 5881) ^ (-560489008);
                        i12 = 935799750;
                    }
                    i28 = iM450212 ^ i12;
                    i27 = i9;
                    i29 = i2;
                    i42 = i42;
                    i35 = i35;
                    break;
                case -577117623:
                case 874774385:
                    i43 = i35;
                    i44 = 0;
                    iM45029 = ThreadFactoryC3888.m11306("ܺܳ") ^ i26;
                    i27 = ((iM45029 ^ i25) * 5591) ^ (-1627926222);
                    i = 1687396755;
                    i28 = iM45029 ^ i;
                    break;
                case -398522266:
                case 1509153423:
                    i18 = iM3362;
                    i35 = i35;
                    long jM3360 = C0797.m3360(this.f17726, this.f17733);
                    if (C0050.f912 <= 0) {
                        j5 = jM3360;
                        iM450215 = (C19806.m45029("۟ۡ") + i25) * 51;
                        i27 = ((iM450215 ^ i26) * 20597) ^ 969806287;
                        i19 = -1344822669;
                        int i516 = iM450215 ^ i19;
                        iM3362 = i18;
                        i35 = i35;
                        i28 = i516;
                    } else {
                        int iM450220 = C19806.m45029("۠ۛ") ^ i25;
                        j5 = jM3360;
                        i27 = ((iM450220 ^ i26) * (-13263)) ^ (-948155180);
                        i35 = i35;
                        i28 = iM450220 ^ (-480079977);
                        iM3362 = i18;
                    }
                    break;
                case -354516456:
                case 455088973:
                    i33++;
                    i22 = i43;
                    i41 = i44;
                    i34 = i45;
                    i49 = i46;
                    int iM4502112 = C19806.m45029("ܶ᩵") ^ i25;
                    int i517 = i22;
                    i27 = ((iM4502112 ^ i26) * 32393) ^ 237446064;
                    i24 = iM4502112 ^ (-1001898181);
                    i48 = i48;
                    i29 = i29;
                    i42 = i42;
                    i35 = i517;
                    i28 = i24;
                    break;
                case -339576512:
                case 26159423:
                    int i62 = i35;
                    i21 = i48;
                    iM3361 = C0797.m3360(8, i21);
                    i40 = 1;
                    if (C0671.m3008() >= 0) {
                        iM3360 = i31;
                        i20 = i62;
                        i42 = 8;
                        int iM4502113 = C19806.m45029("ܽۘ") ^ i25;
                        i23 = iM3360;
                        i27 = ((iM4502113 ^ i26) * (-7293)) ^ (-1044660890);
                        i24 = iM4502113 ^ 1497963609;
                        i48 = i21;
                        i29 = iM3361;
                        i35 = i20;
                        i31 = i23;
                        i28 = i24;
                    } else {
                        int iM450221 = C19806.m45029("᩶֡") ^ i25;
                        i27 = ((iM450221 ^ i26) * (-11233)) ^ 809306878;
                        i28 = iM450221 ^ (-1362796325);
                        i48 = i21;
                        i29 = iM3361;
                        i35 = i62;
                        i42 = 8;
                    }
                    break;
                case -331450598:
                case 740531649:
                    i18 = iM3362;
                    i35 = i35;
                    j2 = ((long) this.f17729) * j5;
                    if (C1066.m4023() > 0) {
                        iM450215 = C19806.m45029("ۤۙ") ^ i26;
                        i27 = ((iM450215 ^ i25) * (-24923)) ^ 1405151758;
                        i19 = -39759036;
                        int i518 = iM450215 ^ i19;
                        iM3362 = i18;
                        i35 = i35;
                        i28 = i518;
                    } else {
                        i42 = i42;
                        iM3362 = i18;
                        i2 = i29;
                        i11 = i48;
                        iM450212 = ThreadFactoryC3888.m11306("ᩴ۫") ^ i25;
                        i48 = i11;
                        i9 = ((iM450212 ^ i26) * 1227) ^ 706172204;
                        i12 = 1194068971;
                        i28 = iM450212 ^ i12;
                        i27 = i9;
                        i29 = i2;
                        i42 = i42;
                        i35 = i35;
                    }
                    break;
                case -188980555:
                case -80981218:
                    if (!RunnableC3388.m10064()) {
                        iM45029 = (i26 - ThreadFactoryC3888.m11306("ᩳۘ")) * (-3);
                        i27 = ((iM45029 ^ i25) * (-16229)) ^ (-1373008737);
                        i = 799191348;
                        i28 = iM45029 ^ i;
                    } else {
                        i35 = i35;
                        iM450214 = (ThreadFactoryC3888.m11306("ۛ۫") + i26) * 83;
                        i27 = ((iM450214 ^ i25) * (-19559)) ^ 1523490512;
                        i17 = 79750892;
                        i28 = iM450214 ^ i17;
                        i35 = i35;
                    }
                    break;
                case -136849929:
                case 1947083873:
                    i35 = i35;
                    j3 = this.f17730;
                    long j6 = i32;
                    if (C2642.m8171() != 0) {
                        j = j6;
                        iM450214 = (ThreadFactoryC3888.m11306("ۛ۫") + i26) * 83;
                        i27 = ((iM450214 ^ i25) * (-19559)) ^ 1523490512;
                        i17 = 79750892;
                        i28 = iM450214 ^ i17;
                    } else {
                        int iM11309 = (ThreadFactoryC3888.m11306("ۙۗ") ^ i25) * 11;
                        j = j6;
                        i27 = (-350341731) ^ ((iM11309 ^ i26) * (-24289));
                        i28 = iM11309 ^ 1786571872;
                    }
                    i35 = i35;
                    break;
                case -57567976:
                case 1306433643:
                    i18 = iM3362;
                    i35 = i35;
                    if (cM6362 == c) {
                        iM450215 = C19806.m45029("ܿܰ") ^ i25;
                        i27 = ((iM450215 ^ i26) * 13741) ^ (-1064244886);
                        i19 = 1996167046;
                    } else {
                        iM450215 = (C19806.m45029("ۛ᩹") + i25) * (-11);
                        i27 = ((iM450215 ^ i26) * (-27209)) ^ 225070050;
                        i19 = 2038820192;
                    }
                    int i519 = iM450215 ^ i19;
                    iM3362 = i18;
                    i35 = i35;
                    i28 = i519;
                    break;
                case 74478944:
                case 1536016423:
                    i35 = i35;
                    i42 = i42;
                    i2 = i29;
                    i11 = i48;
                    i36 = 0;
                    i37 = 0;
                    i38 = 0;
                    if (C10634.f36300 >= 0) {
                        iM450212 = ThreadFactoryC3888.m11306("ᩴ۫") ^ i25;
                        i48 = i11;
                        i9 = ((iM450212 ^ i26) * 1227) ^ 706172204;
                        i12 = 1194068971;
                    } else {
                        i48 = i11;
                        iM450212 = C19806.m45029("ܰۢ") ^ i26;
                        i9 = ((iM450212 ^ i25) * 3107) ^ (-605984655);
                        i12 = -1031526205;
                    }
                    i28 = iM450212 ^ i12;
                    i27 = i9;
                    i29 = i2;
                    i42 = i42;
                    i35 = i35;
                    break;
                case 376225923:
                case 1672376793:
                    ThreadFactoryC3888.m11300();
                    return false;
                case 420699476:
                case 688259395:
                    i18 = iM3362;
                    i35 = i35;
                    j4 = this.f17730 + ((long) i32);
                    if (!ViewTreeObserverOnPreDrawListenerC3327.m9874()) {
                        iM450215 = (i25 - C19806.m45029("ۧۖ")) * (-23);
                        i27 = ((iM450215 ^ i26) * 23211) ^ (-580051722);
                        i19 = 1026447482;
                        int i5110 = iM450215 ^ i19;
                        iM3362 = i18;
                        i35 = i35;
                        i28 = i5110;
                    } else {
                        i42 = i42;
                        iM3362 = i18;
                        i2 = i29;
                        i11 = i48;
                        iM450212 = ThreadFactoryC3888.m11306("ᩴ۫") ^ i25;
                        i48 = i11;
                        i9 = ((iM450212 ^ i26) * 1227) ^ 706172204;
                        i12 = 1194068971;
                        i28 = iM450212 ^ i12;
                        i27 = i9;
                        i29 = i2;
                        i42 = i42;
                        i35 = i35;
                    }
                    break;
                case 550833335:
                case 980201693:
                    i35 = i35;
                    textLengthCalculator2 = textLengthCalculator5;
                    i42 = i42;
                    i2 = i29;
                    z2 = false;
                    i7 = i39;
                    if (i7 >= 100) {
                        iM450210 = ThreadFactoryC3888.m11306("᩻֨") ^ i25;
                        textLengthCalculator3 = textLengthCalculator2;
                        i27 = ((iM450210 ^ i26) * (-24191)) ^ (-990528991);
                        i8 = 1491701247;
                    } else {
                        textLengthCalculator3 = textLengthCalculator2;
                        iM450210 = (C19806.m45029("۟ܶ") ^ i26) * 109;
                        i27 = ((iM450210 ^ i25) * 7699) ^ (-272235436);
                        i8 = 937818643;
                    }
                    i28 = iM450210 ^ i8;
                    textLengthCalculator5 = textLengthCalculator3;
                    i39 = i7;
                    i29 = i2;
                    i42 = i42;
                    i35 = i35;
                    break;
                case 979932819:
                case 1074130317:
                    i18 = iM3362;
                    i35 = i35;
                    this.f17726 = m14175(c2, i29);
                    this.f17731 = i29;
                    iM450215 = (ThreadFactoryC3888.m11306("ۢ᩸") + i25) * 21;
                    i27 = ((iM450215 ^ i26) * 9001) ^ 438659208;
                    i19 = 759893939;
                    int i5111 = iM450215 ^ i19;
                    iM3362 = i18;
                    i35 = i35;
                    i28 = i5111;
                    break;
                case 1587447699:
                case 1630489660:
                    i35 = i35;
                    i42 = i42;
                    i2 = i29;
                    i48 = iM3362 + 1;
                    if (C2788.f10625 >= 0) {
                        iM450212 = (C19806.m45029("ۤۤ") ^ i26) * 91;
                        i9 = ((iM450212 ^ i25) * (-1153)) ^ (-1213096327);
                        i12 = -154705316;
                    } else {
                        iM450212 = ThreadFactoryC3888.m11306("۬ܰ") ^ i26;
                        i9 = ((iM450212 ^ i25) * (-20567)) ^ 727681171;
                        i12 = 2117904668;
                    }
                    i28 = iM450212 ^ i12;
                    i27 = i9;
                    i29 = i2;
                    i42 = i42;
                    i35 = i35;
                    break;
                default:
                    this.f17730 = j3 + j;
                    this.f17732 = iM3362;
                    this.f17725 = i31;
                    return z;
            }
        }
    }
}
