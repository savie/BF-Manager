package l;

import android.widget.TextView;
import com.alipay.sdk.m.y.q;
import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.ۙۤۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 650G */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC4839 implements Runnable {

    /* JADX INFO: renamed from: ᩵ۛ۠, reason: not valid java name and contains not printable characters */
    private static final short[] f16899 = {2276, -11212, 13372, 401};

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f16900;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f16901;

    public /* synthetic */ RunnableC4839(int i, Object obj) {
        int i2 = 383063178;
        int i3 = C1321.f4751;
        int i4 = C3448.f11240;
        this.f16900 = i;
        this.f16901 = obj;
        int iM2761 = C0619.m2761("ۙܰ") ^ i3;
        int i5 = ((iM2761 ^ i4) * 14655) ^ 87385394;
        int i6 = -912653327;
        while (true) {
            i2 = (iM2761 ^ i6) ^ (i5 & (((i2 ^ i4) * 21589) >> 31));
            switch (i2) {
                case -1097753785:
                case 1757154327:
                    C3099.m10095();
                    iM2761 = (C0773.m3169("۫֫") ^ i3) * 69;
                    i5 = ((iM2761 ^ i4) * 4397) ^ 1029558914;
                    i6 = -773112593;
                    break;
                case -672218994:
                case -428802421:
                    return;
                case -264522454:
                case 1683545466:
                    if (C0487.f2131 > 0) {
                        iM2761 = (C0619.m2761("ۤۤ") ^ i3) * (-79);
                        i5 = ((iM2761 ^ i4) * 9275) ^ (-792958871);
                        i6 = -952515577;
                    } else {
                        iM2761 = (C0773.m3169("ۛ᩻") + i3) * q.h;
                        i5 = ((iM2761 ^ i4) * 9919) ^ (-844472267);
                        i6 = 1196682977;
                    }
                    break;
                case 924048232:
                case 1450458151:
                    C23916.m53419();
                    throw new RuntimeException();
                case 1217931450:
                case 1345257868:
                    if (C0950.f3488 < 0) {
                        iM2761 = C0773.m3169("ۛ᩺") ^ i4;
                        i5 = ((iM2761 ^ i3) * 15733) ^ 575344090;
                        i6 = -2131403186;
                    } else {
                        iM2761 = (C0773.m3169("۫֫") ^ i3) * 69;
                        i5 = ((iM2761 ^ i4) * 4397) ^ 1029558914;
                        i6 = -773112593;
                    }
                    break;
                case 1862404093:
                case 2106403097:
                    if (AbstractC0116.f1064 <= 0) {
                        iM2761 = C0619.m2761("ܺ᩸") ^ i4;
                        i5 = ((iM2761 ^ i3) * 21151) ^ (-2096641427);
                        i6 = 410186738;
                    } else {
                        iM2761 = (i4 - C0773.m3169("ܿ᩺")) * (-125);
                        i5 = ((iM2761 ^ i3) * (-25651)) ^ (-1946691561);
                        i6 = 1134018479;
                    }
                    break;
                default:
                    if (C23916.f77426 <= 0) {
                        iM2761 = (C0619.m2761("ۤۤ") ^ i3) * (-79);
                        i5 = ((iM2761 ^ i4) * 9275) ^ (-792958871);
                        i6 = -952515577;
                    } else {
                        iM2761 = C0773.m3169("ۛ᩺") ^ i4;
                        i5 = ((iM2761 ^ i3) * 15733) ^ 575344090;
                        i6 = -2131403186;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005d  */
    /* JADX WARN: Code duplicated, block: B:64:0x021c A[PHI: r3 r10 r13 r14
      0x021c: PHI (r3v4 int) = (r3v2 int), (r3v3 int), (r3v2 int), (r3v2 int), (r3v2 int) binds: [B:63:0x021a, B:34:0x00cf, B:18:0x007d, B:16:0x0079, B:6:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x021c: PHI (r10v4 short) = (r10v3 short), (r10v2 short), (r10v2 short), (r10v2 short), (r10v2 short) binds: [B:63:0x021a, B:34:0x00cf, B:18:0x007d, B:16:0x0079, B:6:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x021c: PHI (r13v3 int) = (r13v2 int), (r13v2 int), (r13v2 int), (r13v2 int), (r13v5 int) binds: [B:63:0x021a, B:34:0x00cf, B:18:0x007d, B:16:0x0079, B:6:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x021c: PHI (r14v3 int) = (r14v2 int), (r14v2 int), (r14v2 int), (r14v2 int), (r14v5 int) binds: [B:63:0x021a, B:34:0x00cf, B:18:0x007d, B:16:0x0079, B:6:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x0278 A[PHI: r2 r4 r7 r8
      0x0278: PHI (r2v5 android.widget.TextView) = (r2v2 android.widget.TextView), (r2v4 android.widget.TextView), (r2v2 android.widget.TextView) binds: [B:71:0x0276, B:43:0x0127, B:30:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x0278: PHI (r4v3 int) = (r4v2 int), (r4v2 int), (r4v4 int) binds: [B:71:0x0276, B:43:0x0127, B:30:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x0278: PHI (r7v4 short) = (r7v3 short), (r7v2 short), (r7v2 short) binds: [B:71:0x0276, B:43:0x0127, B:30:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x0278: PHI (r8v4 int) = (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:71:0x0276, B:43:0x0127, B:30:0x00ac] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x02a9 A[PHI: r6 r9
      0x02a9: PHI (r6v4 char) = (r6v3 char), (r6v2 char), (r6v2 char), (r6v2 char) binds: [B:75:0x02a7, B:67:0x0253, B:16:0x0079, B:12:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x02a9: PHI (r9v4 int) = (r9v2 int), (r9v3 int), (r9v2 int), (r9v2 int) binds: [B:75:0x02a7, B:67:0x0253, B:16:0x0079, B:12:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:80:0x02dc A[PHI: r12 r19
      0x02dc: PHI (r12v4 short[]) = (r12v2 short[]), (r12v3 short[]), (r12v2 short[]) binds: [B:79:0x02da, B:39:0x0105, B:9:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x02dc: PHI (r19v5 short[]) = (r19v4 short[]), (r19v3 short[]), (r19v3 short[]) binds: [B:79:0x02da, B:39:0x0105, B:9:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // java.lang.Runnable
    public final void run() {
        int iM3169;
        int i;
        int i2;
        int i3 = C0773.f2792;
        int i4 = C1080.f3865;
        int iM2761 = C0619.m2761("ۤ֡") ^ i4;
        int i5 = ((iM2761 ^ i3) * 17757) ^ 1592466030;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM2761 ^ (-1683250781);
        TextView textView = null;
        int iM31610 = 0;
        int i7 = 0;
        char c = 0;
        short s = 0;
        int i8 = 0;
        int i9 = 0;
        short s2 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 290017604;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i3) * (-4543)) >> 31));
            switch (i13) {
                case -1766212351:
                case 395214810:
                    RunnableC1848.m6360();
                    break;
                case -1750501828:
                case 291476011:
                    i9 = i8 + 30437289;
                    if (C0487.f2131 <= 0) {
                        iM3169 = C0773.m3169("ۤ۫") ^ i3;
                        i = ((iM3169 ^ i4) * (-20051)) ^ 265620341;
                        i2 = 1475539177;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ۨۨ")) * 67;
                        i = ((iM3169 ^ i4) * 2047) ^ 1001646992;
                        i2 = -824310425;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1588133919:
                case 836876380:
                    s2 = 11034;
                    if (C0862.f3233 != 0) {
                        iM3169 = (i4 - C0619.m2761("ۗܿ")) * 11;
                        i = ((iM3169 ^ i3) * (-18165)) ^ 20243448;
                        i2 = -68816159;
                    } else {
                        iM3169 = (C0773.m3169("᩺᩷") ^ i4) * 101;
                        i = ((iM3169 ^ i3) * 683) ^ 122310168;
                        i2 = -466722535;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1456442748:
                case 1170458168:
                    i10 = 45728;
                    iM3169 = (i4 - C0619.m2761("᩵ᩳ")) * 49;
                    i = ((iM3169 ^ i3) * (-11823)) ^ (-1755881295);
                    i2 = -589080392;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1394393397:
                case 797912918:
                    c = 0;
                    if (C3734.f12817 >= 0) {
                        iM3169 = C0773.m3169("ۤ۫") ^ i3;
                        i = ((iM3169 ^ i4) * (-20051)) ^ 265620341;
                        i2 = 1475539177;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ۛ᩻")) * (-99);
                        i = ((iM3169 ^ i4) * (-30373)) ^ (-1824831631);
                        i2 = 1765546282;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1378057110:
                case -126768646:
                    iM31610 = C0773.m3169(C2310.m7803(sArr2, i11, i12, i10));
                    if (C0862.f3233 != 0) {
                        iM3169 = (i4 - C0619.m2761("ۗܿ")) * 11;
                        i = ((iM3169 ^ i3) * (-18165)) ^ 20243448;
                        i2 = -68816159;
                    } else {
                        iM3169 = (i3 - C0619.m2761("᩶ܶ")) * (-117);
                        i = ((iM3169 ^ i4) * (-3125)) ^ 1198162275;
                        i2 = 2024984438;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1234984151:
                case -1001164755:
                    if (RunnableC3646.f12471) {
                        iM3169 = C0773.m3169("ۤ۫") ^ i3;
                        i = ((iM3169 ^ i4) * (-20051)) ^ 265620341;
                        i2 = 1475539177;
                    } else {
                        iM3169 = C0619.m2761("ܳ۟") ^ i3;
                        i = ((iM3169 ^ i4) * 21781) ^ (-1676625744);
                        i2 = 1559811185;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1027471920:
                case 555208338:
                    switch (this.f16900) {
                        case 0:
                            iM3169 = C0773.m3169("ܳ᩸") ^ i3;
                            i = ((iM3169 ^ i4) * 13663) ^ (-1217411034);
                            i2 = 2075790466;
                            break;
                        case 1:
                            iM3169 = (C0773.m3169("ۙۨ") ^ i4) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                            i = ((iM3169 ^ i3) * (-29339)) ^ 366520466;
                            i2 = -1958640805;
                            break;
                        case 2:
                            iM3169 = C0773.m3169("۠ۙ") ^ i4;
                            i = ((iM3169 ^ i3) * 23095) ^ (-1449312610);
                            i2 = 60901183;
                            break;
                        case 3:
                            iM3169 = C0619.m2761("᩶۠") ^ i4;
                            i = ((iM3169 ^ i3) * 22277) ^ (-26870906);
                            i2 = -610285310;
                            break;
                        default:
                            iM3169 = (i3 - C0773.m3169("ۖۧ")) * 41;
                            i = ((iM3169 ^ i4) * (-2673)) ^ (-1467294667);
                            i2 = 362586861;
                            break;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1003496817:
                case 611441313:
                    s = sArr[c];
                    i8 = s * s;
                    if (C2310.m7813() <= 0) {
                        iM3169 = (C0773.m3169("۫᩸") + i3) * (-39);
                        i = ((iM3169 ^ i4) * 29725) ^ 1605305783;
                        i2 = -95428201;
                    } else {
                        iM3169 = C0619.m2761("᩷ۜ") ^ i4;
                        i = ((iM3169 ^ i3) * 26989) ^ (-579833181);
                        i2 = -902103162;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -943870956:
                case 1087188086:
                    sArr = f16899;
                    if (C3448.m11248() != 0) {
                        iM3169 = C0773.m3169("ܳۖ") ^ i4;
                        i = ((iM3169 ^ i3) * (-10715)) ^ (-1305817458);
                        i2 = 1829049282;
                    } else {
                        iM3169 = C0773.m3169("ۡۚ") ^ i4;
                        i = ((iM3169 ^ i3) * (-3249)) ^ 1290289333;
                        i2 = 2005251130;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -809208856:
                case 1791840272:
                    if (i9 - (s * s2) < 0) {
                        iM3169 = (C0773.m3169("۬ۚ") + i3) * 61;
                        i = ((iM3169 ^ i4) * (-10747)) ^ 356301155;
                        i2 = -423104001;
                    } else {
                        iM3169 = C0619.m2761("۟ۖ") ^ i3;
                        i = ((iM3169 ^ i4) * 23013) ^ (-1470219318);
                        i2 = 665541878;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -657995218:
                case 2072350264:
                    C22961.m51800((byte[]) this.f16901);
                    break;
                case -614156976:
                case 1945701297:
                    if (C1080.f3865 >= 0) {
                        iM3169 = C0619.m2761("ܳ۟") ^ i3;
                        i = ((iM3169 ^ i4) * 21781) ^ (-1676625744);
                        i2 = 1559811185;
                    } else {
                        iM3169 = C0773.m3169("ܳۖ") ^ i4;
                        i = ((iM3169 ^ i3) * (-10715)) ^ (-1305817458);
                        i2 = 1829049282;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -406863051:
                case 1834185935:
                    i7 = 2129607743;
                    if (C4238.f15451 >= 0) {
                        iM3169 = (C0773.m3169("۫᩸") + i3) * (-39);
                        i = ((iM3169 ^ i4) * 29725) ^ 1605305783;
                        i2 = -95428201;
                    } else {
                        iM3169 = C0619.m2761("᩶֫") ^ i3;
                        i = ((iM3169 ^ i4) * (-6939)) ^ (-376081516);
                        i2 = 989599298;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 16426176:
                case 1488033617:
                    C14941.m35927((C14941) this.f16901);
                    break;
                case 153390478:
                case 641799220:
                    C13042.m32468((C13042) this.f16901);
                    break;
                case 240768208:
                case 1319298421:
                    TextureViewSurfaceTextureListenerC6431.m18190((TextureViewSurfaceTextureListenerC6431) this.f16901);
                    break;
                case 287979759:
                case 632902754:
                    sArr2 = f16899;
                    if (AbstractC0641.f2496 >= 0) {
                        iM3169 = C0773.m3169("ܳۖ") ^ i4;
                        i = ((iM3169 ^ i3) * (-10715)) ^ (-1305817458);
                        i2 = 1829049282;
                    } else {
                        iM3169 = (C0619.m2761("ܰܶ") + i3) * 19;
                        i = ((iM3169 ^ i4) * (-6439)) ^ (-2011289646);
                        i2 = 1371928144;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 552184444:
                case 627856583:
                    C4238.m13540();
                    C2966.m9664();
                    iM3169 = (i4 - C0619.m2761("ۗܿ")) * 11;
                    i = ((iM3169 ^ i3) * (-18165)) ^ 20243448;
                    i2 = -68816159;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 778455764:
                case 966724917:
                    C1783.m6232();
                    if (C20932.m47848() != 0) {
                        iM3169 = (i4 - C0619.m2761("ۗܿ")) * 11;
                        i = ((iM3169 ^ i3) * (-18165)) ^ 20243448;
                        i2 = -68816159;
                    } else {
                        iM3169 = C0773.m3169("ۤ۫") ^ i3;
                        i = ((iM3169 ^ i4) * (-20051)) ^ 265620341;
                        i2 = 1475539177;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 921739406:
                case 1214338846:
                    C2023.m6954(textView, iM31610 ^ i7);
                    break;
                case 1392842636:
                case 1459555496:
                    textView = (TextView) this.f16901;
                    if (C0950.f3488 >= 0) {
                        iM3169 = (C0773.m3169("۫᩸") + i3) * (-39);
                        i = ((iM3169 ^ i4) * 29725) ^ 1605305783;
                        i2 = -95428201;
                    } else {
                        iM3169 = (i4 - C0619.m2761("ۚ᩹")) * 87;
                        i = ((iM3169 ^ i3) * (-7713)) ^ 611753751;
                        i2 = -1638112288;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 1429602184:
                case 1686049132:
                    i10 = 20583;
                    iM3169 = (i4 - C0619.m2761("᩵ᩳ")) * 49;
                    i = ((iM3169 ^ i3) * (-11823)) ^ (-1755881295);
                    i2 = -589080392;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                default:
                    i11 = 1;
                    i12 = 3;
                    if (C2375.f7641 <= 0) {
                        iM3169 = (i4 - C0619.m2761("ۗܿ")) * 11;
                        i = ((iM3169 ^ i3) * (-18165)) ^ 20243448;
                        i2 = -68816159;
                    } else {
                        iM3169 = C0773.m3169("᩺ܰ") ^ i4;
                        i = ((iM3169 ^ i3) * (-25659)) ^ (-351555773);
                        i2 = 1991895412;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }
}
