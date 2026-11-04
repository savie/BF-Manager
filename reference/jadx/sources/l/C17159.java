package l;

import android.content.res.Configuration;
import android.content.res.Resources;
import bin.mt.plugin.api.LocalString;
import bin.mt.plugin.api.PluginContext;
import com.alipay.sdk.m.y.q;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ܺ᩺֫, reason: contains not printable characters */
/* JADX INFO: compiled from: K3YT */
/* JADX INFO: loaded from: classes5.dex */
public final class C17159 implements LocalString {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final PluginContext f55950;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC17249 f55951;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f55952;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C25365 f55953;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC13430 f55954;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f55955;

    /* JADX INFO: renamed from: ᩳ᩵ᩴ, reason: not valid java name and contains not printable characters */
    private static final short[] f55949 = {9331, -15478, -15469, -15395, -15482, -15468, -15468, -15486, -15469, -15468, -15416, 1823, 18389, 18389, 18382, 18383, 18380, 18379, 18399, 18374, 18398, 18340, 18407, 18430, 18406, 18343, 18394, 18411, 18424, 18425, 18415, 18346, 18406, 18405, 18409, 18411, 18406, 18346, 18425, 18430, 18424, 18403, 18404, 18413, 18346, 18412, 18411, 18403, 18406, 18415, 18414, 18352, 18346, 18408, 18403, 18404, 18340, 18407, 18430, 18340, 18426, 18406, 18431, 18413, 18403, 18404, 18340, 18425, 18419, 18425, 18430, 18415, 18407, 2528, 23216, 23234, 23234, 23257, 23256, 23259, 23260, 23240, 23249, 23241, 6001, 8100, 8100, 8127, 8126, 8125, 8122, 8110, 8119, 8111, 4463, -3430, -3430, -3455, -3456, -3453, -3452, -3440, -3447, -3439, 6724, -9791, -9791, -9766, -9765, -9768, -9761, -9781, -9774, -9782};

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final InterfaceC13430 f55948 = new C11938();

    /* JADX WARN: Code duplicated, block: B:48:0x017e A[PHI: r10 r12 r13 r17
      0x017e: PHI (r10v3 int) = (r10v2 int), (r10v1 int) binds: [B:47:0x017c, B:25:0x00a6] A[DONT_GENERATE, DONT_INLINE]
      0x017e: PHI (r12v2 short[]) = (r12v1 short[]), (r12v3 short[]) binds: [B:47:0x017c, B:25:0x00a6] A[DONT_GENERATE, DONT_INLINE]
      0x017e: PHI (r13v2 int) = (r13v1 int), (r13v3 int) binds: [B:47:0x017c, B:25:0x00a6] A[DONT_GENERATE, DONT_INLINE]
      0x017e: PHI (r17v12 l.ܽ֫ۗ) = (r17v6 l.ܽ֫ۗ), (r17v13 l.ܽ֫ۗ) binds: [B:47:0x017c, B:25:0x00a6] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // bin.mt.plugin.api.LocalString
    public final Set keySet() {
        int iM3169;
        int i;
        int i2;
        int iM2761;
        int i3;
        int i4;
        C17159 c17159 = this;
        ConcurrentMapC17249 concurrentMapC17249 = null;
        Object objComputeIfAbsent = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i5 = 0;
        short s3 = 0;
        int i6 = 0;
        int i7 = 0;
        short[] sArr = null;
        int i8 = 0;
        int i9 = -1459475123;
        int i10 = C1321.f4751;
        int i11 = C0487.f2131;
        int iM2762 = (i11 - C0619.m2761("ᩴ֨")) * 41;
        int i12 = ((iM2762 ^ i10) * (-10497)) ^ 487773658;
        int i13 = iM2762 ^ (-1947812914);
        short[] sArr2 = null;
        C15667 c15667 = null;
        while (true) {
            i9 = i13 ^ (i12 & (((i9 ^ i10) * (-7017)) >> 31));
            switch (i9) {
                case -1967433598:
                case 1022757830:
                    i7 = 62149;
                    iM3169 = (C0619.m2761("ۚۙ") + i10) * 79;
                    i = ((iM3169 ^ i11) * 32151) ^ (-1310504130);
                    i2 = -992888738;
                    i4 = iM3169 ^ i2;
                    ConcurrentMapC17249 concurrentMapC172410 = concurrentMapC17249;
                    i13 = i4;
                    i12 = i;
                    concurrentMapC17249 = concurrentMapC172410;
                    break;
                case -1939308708:
                case -306142734:
                    objComputeIfAbsent = C23217.computeIfAbsent(concurrentMapC17249, C20932.m47853(sArr, i8, 9, i7), c15667);
                    if (!RunnableC1848.f6235) {
                        iM3169 = (i11 - C0619.m2761("ۚ᩸")) * 41;
                        concurrentMapC17249 = concurrentMapC17249;
                        i = ((iM3169 ^ i10) * 5853) ^ (-1699046081);
                        i2 = 1886772388;
                        i4 = iM3169 ^ i2;
                        ConcurrentMapC17249 concurrentMapC172411 = concurrentMapC17249;
                        i13 = i4;
                        i12 = i;
                        concurrentMapC17249 = concurrentMapC172411;
                    }
                    concurrentMapC17249 = concurrentMapC17249;
                    int iM2763 = (C0619.m2761("ᩴۘ") + i10) * (-19);
                    i = ((iM2763 ^ i11) * 22189) ^ 1250544578;
                    i4 = iM2763 ^ 1640396684;
                    c15667 = null;
                    ConcurrentMapC17249 concurrentMapC172412 = concurrentMapC17249;
                    i13 = i4;
                    i12 = i;
                    concurrentMapC17249 = concurrentMapC172412;
                    break;
                case -1824796803:
                case -739265254:
                    concurrentMapC17249 = concurrentMapC17249;
                    s = sArr2[c];
                    s2 = 13716;
                    if (C2419.f7754 < 0) {
                        iM2761 = (i10 - C0619.m2761("᩶۟")) * (-91);
                        i12 = ((iM2761 ^ i11) * (-16605)) ^ 2137110477;
                        i3 = -1742638718;
                        int i14 = iM2761 ^ i3;
                        concurrentMapC17249 = concurrentMapC17249;
                        i13 = i14;
                        c17159 = this;
                    }
                    concurrentMapC17249 = concurrentMapC17249;
                    int iM2764 = (C0619.m2761("ܿ᩺") + i11) * (-65);
                    i13 = iM2764 ^ (-1810608275);
                    i12 = ((iM2764 ^ i10) * 1039) ^ 679323522;
                    c17159 = this;
                    break;
                case -1765276653:
                case -566010755:
                    C3033.m9845();
                    if (C2287.f7432 >= 0) {
                        concurrentMapC17249 = concurrentMapC17249;
                        iM2761 = C0619.m2761("᩻ۖ") ^ i11;
                        i12 = ((iM2761 ^ i10) * (-14173)) ^ 1278448345;
                        i3 = -2121138967;
                        int i15 = iM2761 ^ i3;
                        concurrentMapC17249 = concurrentMapC17249;
                        i13 = i15;
                        c17159 = this;
                    }
                    concurrentMapC17249 = concurrentMapC17249;
                    iM2761 = (C0619.m2761("֡ۢ") ^ i10) * (-47);
                    i12 = ((iM2761 ^ i11) * 21009) ^ 229105937;
                    i3 = 1672915293;
                    int i16 = iM2761 ^ i3;
                    concurrentMapC17249 = concurrentMapC17249;
                    i13 = i16;
                    c17159 = this;
                    break;
                case -1763475382:
                case 777977883:
                    C1542.m5459();
                    if (C0487.f2131 <= 0) {
                        int iM2765 = (C0619.m2761("ܿ᩺") + i11) * (-65);
                        i13 = iM2765 ^ (-1810608275);
                        i12 = ((iM2765 ^ i10) * 1039) ^ 679323522;
                    } else {
                        concurrentMapC17249 = concurrentMapC17249;
                        iM2761 = (C0619.m2761("֡ۢ") ^ i10) * (-47);
                        i12 = ((iM2761 ^ i11) * 21009) ^ 229105937;
                        i3 = 1672915293;
                        int i17 = iM2761 ^ i3;
                        concurrentMapC17249 = concurrentMapC17249;
                        i13 = i17;
                    }
                    c17159 = this;
                    break;
                case -1529331403:
                case -610294610:
                    concurrentMapC17249 = c17159.f55951;
                    if (RunnableC3055.f9898 < 0) {
                        iM3169 = C0619.m2761("ᩴܶ") ^ i10;
                        concurrentMapC17249 = concurrentMapC17249;
                        i = ((iM3169 ^ i11) * (-14577)) ^ 1575925365;
                        i2 = 459959556;
                        i4 = iM3169 ^ i2;
                        ConcurrentMapC17249 concurrentMapC172413 = concurrentMapC17249;
                        i13 = i4;
                        i12 = i;
                        concurrentMapC17249 = concurrentMapC172413;
                    } else {
                        int iM2766 = (C0619.m2761("ܿ᩺") + i11) * (-65);
                        i13 = iM2766 ^ (-1810608275);
                        i12 = ((iM2766 ^ i10) * 1039) ^ 679323522;
                        c17159 = this;
                    }
                    break;
                case -1381947592:
                case 630084692:
                    concurrentMapC17249 = concurrentMapC17249;
                    int i18 = 0;
                    if (C1343.f4799 == 0) {
                        c15667 = new C15667(i18, c17159);
                        if (C0773.f2792 > 0) {
                            iM3169 = C0619.m2761("᩵᩷") ^ i11;
                            i = ((iM3169 ^ i10) * 24281) ^ 1974272514;
                            i2 = -856838892;
                            i4 = iM3169 ^ i2;
                        }
                        ConcurrentMapC17249 concurrentMapC172414 = concurrentMapC17249;
                        i13 = i4;
                        i12 = i;
                        concurrentMapC17249 = concurrentMapC172414;
                    }
                    int iM2767 = (C0619.m2761("ᩴۘ") + i10) * (-19);
                    i = ((iM2767 ^ i11) * 22189) ^ 1250544578;
                    i4 = iM2767 ^ 1640396684;
                    c15667 = null;
                    ConcurrentMapC17249 concurrentMapC172415 = concurrentMapC17249;
                    i13 = i4;
                    i12 = i;
                    concurrentMapC17249 = concurrentMapC172415;
                    break;
                case -1333002770:
                case 1794164380:
                    return C4681.unmodifiableSet(((Map) objComputeIfAbsent).keySet());
                case -1205769273:
                case 883934840:
                    concurrentMapC17249 = concurrentMapC17249;
                    if ((i6 * i6) - i5 >= 0) {
                        iM3169 = C0619.m2761("᩸ۢ") ^ i11;
                        i = ((iM3169 ^ i10) * (-8351)) ^ (-1666265555);
                        i2 = -1647762192;
                    } else {
                        iM3169 = (C0619.m2761("ۡ᩸") + i11) * (-23);
                        i = ((iM3169 ^ i10) * 10789) ^ (-723646097);
                        i2 = -811331951;
                    }
                    i4 = iM3169 ^ i2;
                    ConcurrentMapC17249 concurrentMapC172416 = concurrentMapC17249;
                    i13 = i4;
                    i12 = i;
                    concurrentMapC17249 = concurrentMapC172416;
                    break;
                case -1147659395:
                case 2060372333:
                    concurrentMapC17249 = concurrentMapC17249;
                    c = '^';
                    if (AbstractC0641.f2496 >= 0) {
                        iM2761 = (C0619.m2761("֡ۢ") ^ i10) * (-47);
                        i12 = ((iM2761 ^ i11) * 21009) ^ 229105937;
                        i3 = 1672915293;
                    } else {
                        iM2761 = (C0773.m3169("ۨۖ") + i11) * 17;
                        i12 = ((iM2761 ^ i10) * 1143) ^ (-1878846436);
                        i3 = 1568395644;
                    }
                    int i19 = iM2761 ^ i3;
                    concurrentMapC17249 = concurrentMapC17249;
                    i13 = i19;
                    c17159 = this;
                    break;
                case -1108244163:
                case -831386969:
                    concurrentMapC17249 = concurrentMapC17249;
                    sArr = f55949;
                    i8 = 95;
                    if (C2702.f8586 <= 0) {
                        iM3169 = (i11 - C0773.m3169("ܺۛ")) * (-53);
                        i = ((iM3169 ^ i10) * 29349) ^ (-1593274544);
                        i2 = -1284239218;
                    } else {
                        iM3169 = C0619.m2761("֡۬") ^ i10;
                        i = ((iM3169 ^ i11) * (-23325)) ^ (-1807953738);
                        i2 = 720377164;
                    }
                    i4 = iM3169 ^ i2;
                    ConcurrentMapC17249 concurrentMapC172417 = concurrentMapC17249;
                    i13 = i4;
                    i12 = i;
                    concurrentMapC17249 = concurrentMapC172417;
                    break;
                case -1012105857:
                case 109391730:
                    C1343.m4943();
                    return null;
                case -847693037:
                case 1357899608:
                    concurrentMapC17249 = concurrentMapC17249;
                    i5 = s * s2;
                    s3 = 3429;
                    if (!C2023.f6737) {
                        iM3169 = (i11 - C0773.m3169("ۜᩳ")) * 77;
                        i = ((iM3169 ^ i10) * 21743) ^ 2040791431;
                        i2 = 143610987;
                        i4 = iM3169 ^ i2;
                        ConcurrentMapC17249 concurrentMapC172418 = concurrentMapC17249;
                        i13 = i4;
                        i12 = i;
                        concurrentMapC17249 = concurrentMapC172418;
                    } else {
                        concurrentMapC17249 = concurrentMapC17249;
                        int iM2768 = (C0619.m2761("ܿ᩺") + i11) * (-65);
                        i13 = iM2768 ^ (-1810608275);
                        i12 = ((iM2768 ^ i10) * 1039) ^ 679323522;
                        c17159 = this;
                    }
                    break;
                case 71642150:
                case 1608974027:
                    concurrentMapC17249 = concurrentMapC17249;
                    i6 = s + s3;
                    if (C3077.f9998) {
                        iM3169 = (C0773.m3169("ۨۙ") ^ i10) * (-37);
                        i = ((iM3169 ^ i11) * 8835) ^ (-306706179);
                        i2 = 1411782345;
                    } else {
                        iM3169 = (i11 - C0773.m3169("ܺۛ")) * (-53);
                        i = ((iM3169 ^ i10) * 29349) ^ (-1593274544);
                        i2 = -1284239218;
                    }
                    i4 = iM3169 ^ i2;
                    ConcurrentMapC17249 concurrentMapC172419 = concurrentMapC17249;
                    i13 = i4;
                    i12 = i;
                    concurrentMapC17249 = concurrentMapC172419;
                    break;
                case 152372532:
                case 162671719:
                    C1321.m4852();
                    if (C1080.f3865 >= 0) {
                        int iM2769 = (C0619.m2761("ܿ᩺") + i11) * (-65);
                        i13 = iM2769 ^ (-1810608275);
                        i12 = ((iM2769 ^ i10) * 1039) ^ 679323522;
                        c17159 = this;
                    } else {
                        concurrentMapC17249 = concurrentMapC17249;
                        int iM27610 = (C0619.m2761("ᩴۘ") + i10) * (-19);
                        i = ((iM27610 ^ i11) * 22189) ^ 1250544578;
                        i4 = iM27610 ^ 1640396684;
                        c15667 = null;
                        ConcurrentMapC17249 concurrentMapC1724110 = concurrentMapC17249;
                        i13 = i4;
                        i12 = i;
                        concurrentMapC17249 = concurrentMapC1724110;
                    }
                    break;
                case 723066358:
                case 1026821269:
                    i7 = 8747;
                    iM3169 = (C0619.m2761("ۚۙ") + i10) * 79;
                    i = ((iM3169 ^ i11) * 32151) ^ (-1310504130);
                    i2 = -992888738;
                    i4 = iM3169 ^ i2;
                    ConcurrentMapC17249 concurrentMapC1724111 = concurrentMapC17249;
                    i13 = i4;
                    i12 = i;
                    concurrentMapC17249 = concurrentMapC1724111;
                    break;
                case 805102993:
                case 1262919370:
                    concurrentMapC17249 = concurrentMapC17249;
                    sArr2 = f55949;
                    if (C3033.f9831 >= 0) {
                        iM2761 = C0619.m2761("᩻ۖ") ^ i11;
                        i12 = ((iM2761 ^ i10) * (-14173)) ^ 1278448345;
                        i3 = -2121138967;
                    } else {
                        iM2761 = C0619.m2761("۠ۙ") ^ i10;
                        i12 = ((iM2761 ^ i11) * (-1249)) ^ 1035730870;
                        i3 = 486547455;
                    }
                    int i110 = iM2761 ^ i3;
                    concurrentMapC17249 = concurrentMapC17249;
                    i13 = i110;
                    c17159 = this;
                    break;
                default:
                    AbstractC0116.m1243();
                    C3690.m11987();
                    concurrentMapC17249 = concurrentMapC17249;
                    int iM27611 = (C0619.m2761("ᩴۘ") + i10) * (-19);
                    i = ((iM27611 ^ i11) * 22189) ^ 1250544578;
                    i4 = iM27611 ^ 1640396684;
                    c15667 = null;
                    ConcurrentMapC17249 concurrentMapC1724112 = concurrentMapC17249;
                    i13 = i4;
                    i12 = i;
                    concurrentMapC17249 = concurrentMapC1724112;
                    break;
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C17159(String str) {
        int i = 728711730;
        int i2 = AbstractC0116.f1064;
        int i3 = C3734.f12817;
        short s = f55949[0];
        int i4 = (s * s) + 14676561;
        int i5 = s + 3831;
        this(null, str, C1343.m4946(C3998.m12925(f55949, 1, 10, (i4 + i4) - (i5 * i5) >= 0 ? 50151 : 59181), str), f55948);
        int iM3169 = C0773.m3169("᩸᩵") ^ i2;
        int i6 = ((iM3169 ^ i3) * (-6575)) ^ 932494763;
        int i7 = -498115966;
        while (true) {
            i = ((((i ^ i3) * (-11053)) >> 31) & i6) ^ (iM3169 ^ i7);
            switch (i) {
                case -2111110031:
                case -650091489:
                    AbstractC3624.m11755();
                    if (C0487.f2131 <= 0) {
                        iM3169 = C0619.m2761("᩹ۢ") ^ i3;
                        i6 = ((iM3169 ^ i2) * (-26483)) ^ (-1934408365);
                        i7 = 1894142262;
                    } else {
                        iM3169 = C0619.m2761("ۚ᩸") ^ i2;
                        i6 = ((iM3169 ^ i3) * (-32377)) ^ 180665004;
                        i7 = -309008602;
                    }
                    break;
                case -1141687270:
                case 666959041:
                    C1146.m4231();
                    C3448.m11248();
                    iM3169 = C0619.m2761("᩹ۢ") ^ i3;
                    i6 = ((iM3169 ^ i2) * (-26483)) ^ (-1934408365);
                    i7 = 1894142262;
                    break;
                case -436886522:
                case -235785143:
                    C1080.m4050();
                    throw new RuntimeException();
                case -430773821:
                case 1472200464:
                    if (RunnableC1848.f6235) {
                        iM3169 = C0773.m3169("֡᩸") ^ i3;
                        i6 = ((iM3169 ^ i2) * (-3901)) ^ (-708728520);
                        i7 = 1280336465;
                    } else {
                        iM3169 = (C0773.m3169("᩶ۜ") + i2) * (-71);
                        i6 = ((iM3169 ^ i3) * (-20407)) ^ 326461349;
                        i7 = 633683797;
                    }
                    break;
                case -329291877:
                case -154549939:
                    C2354.m7983();
                    if (C20932.f66974 > 0) {
                        iM3169 = (C0619.m2761("۫ۢ") ^ i2) * (-17);
                        i6 = ((iM3169 ^ i3) * (-4449)) ^ (-2073333121);
                        i7 = -1640026972;
                    } else {
                        iM3169 = C0619.m2761("᩹ۢ") ^ i3;
                        i6 = ((iM3169 ^ i2) * (-26483)) ^ (-1934408365);
                        i7 = 1894142262;
                    }
                    break;
                case -12122617:
                case 794633121:
                    return;
                default:
                    C1826.m6301();
                    if (C3033.f9831 < 0) {
                        iM3169 = (C0619.m2761("۫ۢ") ^ i2) * (-17);
                        i6 = ((iM3169 ^ i3) * (-4449)) ^ (-2073333121);
                        i7 = -1640026972;
                    } else {
                        iM3169 = (C0773.m3169("ۢۡ") + i3) * 65;
                        i6 = ((iM3169 ^ i2) * 20373) ^ 1558608450;
                        i7 = 891490147;
                    }
                    break;
            }
        }
    }

    public C17159(C20889 c20889, String str, String str2, InterfaceC13430 interfaceC13430) {
        ConcurrentMapC17249 concurrentMapC17249 = null;
        int pluginSdkVersion = 0;
        int i = 366664879;
        int i2 = C0950.f3488;
        int i3 = C0269.f1558;
        int iM2761 = (C0619.m2761("᩻ܿ") + i3) * q.h;
        int i4 = ((iM2761 ^ i2) * (-19697)) ^ 72631113;
        int i5 = -96727893;
        while (true) {
            i = ((((i ^ i2) * (-21749)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -1971666288:
                case 1884265645:
                    if (C1519.f5300 < 0) {
                        this.f55953 = new C25365(c20889, pluginSdkVersion, false);
                        return;
                    }
                    iM2761 = C0619.m2761("ᩴ֨") ^ i3;
                    i4 = ((iM2761 ^ i2) * 20959) ^ 1444140704;
                    i5 = 1869680545;
                    break;
                case -1954641130:
                case 1240130345:
                    this.f55950 = c20889;
                    if (C1542.f5343 <= 0) {
                        iM2761 = (i2 - C0619.m2761("֡ۨ")) * (-109);
                        i4 = ((iM2761 ^ i3) * 25707) ^ (-604836436);
                        i5 = -1823846455;
                    } else {
                        iM2761 = (C0619.m2761("ۜۤ") ^ i2) * (-93);
                        i4 = ((iM2761 ^ i3) * 14069) ^ (-1672963120);
                        i5 = 1025421972;
                    }
                    break;
                case -1850512077:
                case 1077194250:
                    AbstractC0116.m1243();
                    if (!C2354.m7983()) {
                        iM2761 = (i2 - C0773.m3169("۠ۘ")) * (-55);
                        i4 = ((iM2761 ^ i3) * 6537) ^ (-2012437477);
                        i5 = -830238870;
                    } else {
                        iM2761 = C0619.m2761("ܰۜ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 19523) ^ 239009302;
                        i5 = -936933156;
                    }
                    break;
                case -1255069559:
                case -151125050:
                    if (C1783.f6087 <= 0) {
                        iM2761 = (i2 - C0619.m2761("֡ۨ")) * (-109);
                        i4 = ((iM2761 ^ i3) * 25707) ^ (-604836436);
                        i5 = -1823846455;
                    } else {
                        iM2761 = (i2 - C0773.m3169("۟ۤ")) * (-63);
                        i4 = ((iM2761 ^ i3) * 14929) ^ 1511363938;
                        i5 = -1334018695;
                    }
                    break;
                case -1245250265:
                case 677018104:
                    this.f55955 = str;
                    this.f55952 = str2;
                    this.f55954 = interfaceC13430;
                    if (c20889 == null) {
                        iM2761 = C0773.m3169("۟ۛ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 25243) ^ (-2078342717);
                        i5 = -632750772;
                    } else {
                        iM2761 = (C0619.m2761("۟ۡ") + i3) * (-103);
                        i4 = ((iM2761 ^ i2) * (-27385)) ^ 511359725;
                        i5 = -257284856;
                    }
                    break;
                case -1166253443:
                case -521117322:
                    if (C4282.m13644()) {
                        iM2761 = (i3 - C0619.m2761("᩻֫")) * 59;
                        i4 = ((iM2761 ^ i2) * 11833) ^ (-1612671970);
                        i5 = 309890099;
                    } else {
                        iM2761 = (i2 - C0619.m2761("֡ۨ")) * (-109);
                        i4 = ((iM2761 ^ i3) * 25707) ^ (-604836436);
                        i5 = -1823846455;
                    }
                    break;
                case -1068877035:
                case -10574048:
                    if (RunnableC3055.m9933() != 0) {
                        iM2761 = C0619.m2761("ᩴ֨") ^ i3;
                        i4 = ((iM2761 ^ i2) * 20959) ^ 1444140704;
                        i5 = 1869680545;
                    } else {
                        iM2761 = C0619.m2761("۬ۜ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 26221) ^ 452079862;
                        i5 = -313995713;
                    }
                    break;
                case -855355986:
                case -782252996:
                    this.f55951 = concurrentMapC17249;
                    if (C3448.f11240 >= 0) {
                        iM2761 = C0619.m2761("ܰۜ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 19523) ^ 239009302;
                        i5 = -936933156;
                    } else {
                        iM2761 = (C0619.m2761("᩷ᩴ") ^ i2) * (-17);
                        i4 = ((iM2761 ^ i3) * (-7329)) ^ 358542367;
                        i5 = -1079806762;
                    }
                    break;
                case -682557434:
                case 1263694270:
                    C1564.m5509();
                    throw new RuntimeException();
                case -598884713:
                case -20877660:
                    if (C1146.f4234 >= 0) {
                        iM2761 = C0619.m2761("ᩴ֨") ^ i3;
                        i4 = ((iM2761 ^ i2) * 20959) ^ 1444140704;
                        i5 = 1869680545;
                    } else {
                        iM2761 = C0619.m2761("ܰۜ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 19523) ^ 239009302;
                        i5 = -936933156;
                    }
                    break;
                case -421589873:
                case 183137937:
                    pluginSdkVersion = c20889.getPluginSdkVersion();
                    iM2761 = C0619.m2761("ܶ֡") ^ i3;
                    i4 = ((iM2761 ^ i2) * 18849) ^ (-1356862427);
                    i5 = 1594483097;
                    break;
                case -413010577:
                case 266917348:
                    C2702.m8876();
                    iM2761 = (i2 - C0773.m3169("۠ۘ")) * (-55);
                    i4 = ((iM2761 ^ i3) * 6537) ^ (-2012437477);
                    i5 = -830238870;
                    break;
                case -315578340:
                case 1366799168:
                    concurrentMapC17249 = new ConcurrentMapC17249();
                    if (C1542.f5343 <= 0) {
                        iM2761 = C0619.m2761("ܰۜ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 19523) ^ 239009302;
                        i5 = -936933156;
                    } else {
                        iM2761 = (i2 - C0773.m3169("ۤۖ")) * (-79);
                        i4 = ((iM2761 ^ i3) * (-29287)) ^ 1046113398;
                        i5 = -1189032212;
                    }
                    break;
                case 394367108:
                case 2080396798:
                    if (C3734.f12817 >= 0) {
                        iM2761 = C0619.m2761("ᩴ֨") ^ i3;
                        i4 = ((iM2761 ^ i2) * 20959) ^ 1444140704;
                        i5 = 1869680545;
                    } else {
                        iM2761 = (C0773.m3169("֨᩹") ^ i3) * 41;
                        i4 = ((iM2761 ^ i2) * 24699) ^ (-264288813);
                        i5 = 1830665950;
                    }
                    break;
                case 749932573:
                case 1227047855:
                    if (C1146.f4234 >= 0) {
                        iM2761 = (i2 - C0619.m2761("֡ۨ")) * (-109);
                        i4 = ((iM2761 ^ i3) * 25707) ^ (-604836436);
                        i5 = -1823846455;
                    } else {
                        iM2761 = C0773.m3169("ܰ᩻") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-26363)) ^ 1204749514;
                        i5 = -498979590;
                    }
                    break;
                case 838075350:
                case 1674998394:
                    AbstractC3624.m11755();
                    if (C2966.f9654 < 0) {
                        iM2761 = C0619.m2761("ᩴ֨") ^ i3;
                        i4 = ((iM2761 ^ i2) * 20959) ^ 1444140704;
                        i5 = 1869680545;
                    } else {
                        iM2761 = C0619.m2761("ܺ᩻") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-10409)) ^ 866219597;
                        i5 = 1776943625;
                    }
                    break;
                case 1298378940:
                case 2132456650:
                    pluginSdkVersion = 3;
                    iM2761 = C0619.m2761("ܶ֡") ^ i3;
                    i4 = ((iM2761 ^ i2) * 18849) ^ (-1356862427);
                    i5 = 1594483097;
                    break;
                default:
                    if (RunnableC0334.f1808 <= 0) {
                        iM2761 = C0619.m2761("ᩴ֨") ^ i3;
                        i4 = ((iM2761 ^ i2) * 20959) ^ 1444140704;
                        i5 = 1869680545;
                    } else {
                        iM2761 = (C0773.m3169("ۢᩳ") ^ i2) * (-25);
                        i4 = ((iM2761 ^ i3) * 4331) ^ 63222958;
                        i5 = 1977767396;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0215 A[PHI: r4 r7 r26
      0x0215: PHI (r4v40 java.lang.String) = (r4v39 java.lang.String), (r4v2 java.lang.String) binds: [B:55:0x01fe, B:32:0x00e9] A[DONT_GENERATE, DONT_INLINE]
      0x0215: PHI (r7v3 java.lang.String) = (r7v2 java.lang.String), (r7v4 java.lang.String) binds: [B:55:0x01fe, B:32:0x00e9] A[DONT_GENERATE, DONT_INLINE]
      0x0215: PHI (r26v29 java.lang.String) = (r26v28 java.lang.String), (r26v3 java.lang.String) binds: [B:55:0x01fe, B:32:0x00e9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x02f6 A[PHI: r2 r9 r19 r20 r21 r25
      0x02f6: PHI (r2v34 java.lang.String) = (r2v8 java.lang.String), (r2v9 java.lang.String), (r2v35 java.lang.String) binds: [B:75:0x02f4, B:71:0x02cf, B:9:0x006f] A[DONT_GENERATE, DONT_INLINE]
      0x02f6: PHI (r9v3 short[]) = (r9v2 short[]), (r9v2 short[]), (r9v4 short[]) binds: [B:75:0x02f4, B:71:0x02cf, B:9:0x006f] A[DONT_GENERATE, DONT_INLINE]
      0x02f6: PHI (r19v4 int) = (r19v3 int), (r19v2 int), (r19v2 int) binds: [B:75:0x02f4, B:71:0x02cf, B:9:0x006f] A[DONT_GENERATE, DONT_INLINE]
      0x02f6: PHI (r20v4 int) = (r20v3 int), (r20v2 int), (r20v2 int) binds: [B:75:0x02f4, B:71:0x02cf, B:9:0x006f] A[DONT_GENERATE, DONT_INLINE]
      0x02f6: PHI (r21v4 int) = (r21v2 int), (r21v3 int), (r21v2 int) binds: [B:75:0x02f4, B:71:0x02cf, B:9:0x006f] A[DONT_GENERATE, DONT_INLINE]
      0x02f6: PHI (r25v22 java.lang.String) = (r25v5 java.lang.String), (r25v6 java.lang.String), (r25v23 java.lang.String) binds: [B:75:0x02f4, B:71:0x02cf, B:9:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:84:0x0358 A[PHI: r2 r12 r13 r14 r16 r17 r18 r25
      0x0358: PHI (r2v45 java.lang.String) = (r2v6 java.lang.String), (r2v7 java.lang.String), (r2v47 java.lang.String) binds: [B:83:0x0356, B:79:0x0334, B:28:0x00c4] A[DONT_GENERATE, DONT_INLINE]
      0x0358: PHI (r12v3 short[]) = (r12v2 short[]), (r12v2 short[]), (r12v4 short[]) binds: [B:83:0x0356, B:79:0x0334, B:28:0x00c4] A[DONT_GENERATE, DONT_INLINE]
      0x0358: PHI (r13v3 int) = (r13v2 int), (r13v2 int), (r13v4 int) binds: [B:83:0x0356, B:79:0x0334, B:28:0x00c4] A[DONT_GENERATE, DONT_INLINE]
      0x0358: PHI (r14v3 int) = (r14v2 int), (r14v2 int), (r14v4 int) binds: [B:83:0x0356, B:79:0x0334, B:28:0x00c4] A[DONT_GENERATE, DONT_INLINE]
      0x0358: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:83:0x0356, B:79:0x0334, B:28:0x00c4] A[DONT_GENERATE, DONT_INLINE]
      0x0358: PHI (r17v4 short) = (r17v2 short), (r17v3 short), (r17v2 short) binds: [B:83:0x0356, B:79:0x0334, B:28:0x00c4] A[DONT_GENERATE, DONT_INLINE]
      0x0358: PHI (r18v4 short) = (r18v2 short), (r18v3 short), (r18v2 short) binds: [B:83:0x0356, B:79:0x0334, B:28:0x00c4] A[DONT_GENERATE, DONT_INLINE]
      0x0358: PHI (r25v28 java.lang.String) = (r25v3 java.lang.String), (r25v4 java.lang.String), (r25v29 java.lang.String) binds: [B:83:0x0356, B:79:0x0334, B:28:0x00c4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0069, code lost:
    
        if (l.C0773.f2792 <= 0) goto L8;
     */
    @Override // bin.mt.plugin.api.LocalString
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String getOrDefault(java.lang.String r28, java.lang.String r29) {
        /*
            Method dump skipped, instruction units count: 1172
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17159.getOrDefault(java.lang.String, java.lang.String):java.lang.String");
    }

    @Override // bin.mt.plugin.api.LocalString
    public final String getOrDefault(String str, String str2, String str3) {
        String strM40334 = null;
        String strM40335 = null;
        short s = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1014277392;
        int i5 = C3779.f12953;
        int i6 = AbstractC3624.f12429;
        int iM2761 = (C0619.m2761("ܺۖ") ^ i6) * 39;
        int i7 = ((iM2761 ^ i5) * (-8853)) ^ 1852654656;
        int i8 = -1953766434;
        while (true) {
            i4 = ((((i4 ^ i5) * 4165) >> 31) & i7) ^ (iM2761 ^ i8);
            switch (i4) {
                case -2133431860:
                case 1658339743:
                    RunnableC3646.m11813();
                    if (C3734.m12152() >= 0) {
                        iM2761 = (C0773.m3169("ۖ۟") + i5) * 27;
                        i7 = ((iM2761 ^ i6) * (-21649)) ^ (-368387825);
                        i8 = 1786413534;
                    } else {
                        iM2761 = (C0619.m2761("᩹۫") + i5) * 119;
                        i7 = ((iM2761 ^ i6) * (-5149)) ^ 569344876;
                        i8 = -1777449231;
                    }
                    break;
                case -2090733600:
                case 447864196:
                    if (C2834.f9334 <= 0) {
                        iM2761 = (C0773.m3169("ۖ۟") + i5) * 27;
                        i7 = ((iM2761 ^ i6) * (-21649)) ^ (-368387825);
                        i8 = 1786413534;
                    } else {
                        iM2761 = C0773.m3169("֫ۛ") ^ i6;
                        i7 = ((iM2761 ^ i5) * 13409) ^ 907681085;
                        i8 = -708617374;
                    }
                    break;
                case -1953750999:
                case 558363932:
                    if (C2878.m9480(str3)) {
                        iM2761 = C0773.m3169("ܿۨ") ^ i5;
                        i7 = ((iM2761 ^ i6) * (-32333)) ^ (-19341744);
                        i8 = -951269062;
                    } else {
                        iM2761 = C0773.m3169("ܿ֨") ^ i5;
                        i7 = ((iM2761 ^ i6) * (-4763)) ^ 1526075308;
                        i8 = 828764469;
                    }
                    break;
                case -1833859095:
                case -1641101768:
                    if (C2023.f6737) {
                        iM2761 = (C0619.m2761("᩹۫") + i5) * 119;
                        i7 = ((iM2761 ^ i6) * (-5149)) ^ 569344876;
                        i8 = -1777449231;
                    } else {
                        iM2761 = C0619.m2761("᩺֨") ^ i5;
                        i7 = ((iM2761 ^ i6) * (-14683)) ^ (-1956201380);
                        i8 = 1679864611;
                    }
                    break;
                case -1826694118:
                case -288065659:
                    strM40334 = m40334(str, C4282.m13650(f55949, 85, 9, i3));
                    if (strM40334 != null) {
                        iM2761 = (C0619.m2761("᩵᩺") + i6) * (-71);
                        i7 = ((iM2761 ^ i5) * (-731)) ^ (-747490423);
                        i8 = -1340493913;
                    } else {
                        iM2761 = C0619.m2761("ܳܰ") ^ i6;
                        i7 = ((iM2761 ^ i5) * 8763) ^ 1427664041;
                        i8 = -1099769484;
                    }
                    break;
                case -1767887183:
                case -667046965:
                    if (C3998.f13671 != 0) {
                        iM2761 = (i6 - C0773.m3169("ܳۛ")) * (-75);
                        i7 = ((iM2761 ^ i5) * 10993) ^ (-1692089585);
                        i8 = 1091697126;
                    } else {
                        iM2761 = (i6 - C0619.m2761("ܿᩴ")) * (-23);
                        i7 = ((iM2761 ^ i5) * 16979) ^ (-120266290);
                        i8 = -1679383645;
                    }
                    break;
                case -1593596626:
                case 1027626390:
                    C11235.m28309();
                    if (!C17202.f56030) {
                        iM2761 = C0619.m2761("ܺۜ") ^ i6;
                        i7 = ((iM2761 ^ i5) * 1293) ^ (-2062453128);
                        i8 = 1743509910;
                    } else {
                        iM2761 = (C0619.m2761("᩹۫") + i5) * 119;
                        i7 = ((iM2761 ^ i6) * (-5149)) ^ 569344876;
                        i8 = -1777449231;
                    }
                    break;
                case -1239335906:
                case 1388898497:
                    s = f55949[84];
                    if (C1564.f5401 <= 0) {
                        iM2761 = (i6 - C0773.m3169("ܳۛ")) * (-75);
                        i7 = ((iM2761 ^ i5) * 10993) ^ (-1692089585);
                        i8 = 1091697126;
                    } else {
                        iM2761 = C0773.m3169("֡ۡ") ^ i5;
                        i7 = ((iM2761 ^ i6) * 14191) ^ 445866962;
                        i8 = -665997145;
                    }
                    break;
                case -1206908708:
                case 1647951984:
                    if (C0773.f2792 <= 0) {
                        iM2761 = C0619.m2761("ۧۢ") ^ i6;
                        i7 = ((iM2761 ^ i5) * 2133) ^ (-1027081653);
                        i8 = -353480129;
                    } else {
                        iM2761 = (i6 - C0773.m3169("ۙۤ")) * (-97);
                        i7 = ((iM2761 ^ i5) * (-15709)) ^ 1711764993;
                        i8 = 32325284;
                    }
                    break;
                case -1073368543:
                case 983059813:
                    if (C2310.f7472 >= 0) {
                        iM2761 = C0619.m2761("ܺۜ") ^ i6;
                        i7 = ((iM2761 ^ i5) * 1293) ^ (-2062453128);
                        i8 = 1743509910;
                    } else {
                        iM2761 = (C0773.m3169("ܽܶ") + i5) * 69;
                        i7 = ((iM2761 ^ i6) * (-217)) ^ (-1764063376);
                        i8 = -980939659;
                    }
                    break;
                case -1050907127:
                case 850351667:
                    C17202.m40372();
                    C1146.m4231();
                    return null;
                case -894039467:
                case 156432955:
                    C2702.m8876();
                    if (C1321.f4751 >= 0) {
                        iM2761 = C0619.m2761("ۧۢ") ^ i6;
                        i7 = ((iM2761 ^ i5) * 2133) ^ (-1027081653);
                        i8 = -353480129;
                    } else {
                        iM2761 = C0619.m2761("ܺۜ") ^ i6;
                        i7 = ((iM2761 ^ i5) * 1293) ^ (-2062453128);
                        i8 = 1743509910;
                    }
                    break;
                case -490047168:
                case 738596030:
                    C13473.m33144();
                    C0269.m1775();
                    iM2761 = (C0619.m2761("᩹۫") + i5) * 119;
                    i7 = ((iM2761 ^ i6) * (-5149)) ^ 569344876;
                    i8 = -1777449231;
                    break;
                case -442761239:
                case -205096002:
                    if (C3033.f9831 >= 0) {
                        iM2761 = (C0773.m3169("ۖ۟") + i5) * 27;
                        i7 = ((iM2761 ^ i6) * (-21649)) ^ (-368387825);
                        i8 = 1786413534;
                    } else {
                        iM2761 = C0773.m3169("᩶ۤ") ^ i6;
                        i7 = ((iM2761 ^ i5) * (-17917)) ^ (-50242068);
                        i8 = 743057431;
                    }
                    break;
                case -386908266:
                case 1338019483:
                    return strM40335;
                case -296625327:
                case -174123805:
                    return str2;
                case -237675279:
                case 363999111:
                    i = s * 26600;
                    i2 = s * s;
                    if (C1343.f4799 != 0) {
                        iM2761 = (C0619.m2761("᩹۫") + i5) * 119;
                        i7 = ((iM2761 ^ i6) * (-5149)) ^ 569344876;
                        i8 = -1777449231;
                    } else {
                        iM2761 = (C0773.m3169("۟۟") ^ i6) * 127;
                        i7 = ((iM2761 ^ i5) * 2227) ^ (-717872357);
                        i8 = -858090911;
                    }
                    break;
                case 419253834:
                case 1548844431:
                    strM40335 = m40334(str, str3);
                    if (strM40335 != null) {
                        iM2761 = C0619.m2761("ܿܶ") ^ i5;
                        i7 = ((iM2761 ^ i6) * (-7437)) ^ 152124636;
                        i8 = -1050115721;
                    } else {
                        iM2761 = C0773.m3169("ܿۨ") ^ i5;
                        i7 = ((iM2761 ^ i6) * (-32333)) ^ (-19341744);
                        i8 = -951269062;
                    }
                    break;
                case 1024137900:
                case 1537307043:
                    i3 = 8187;
                    iM2761 = C0773.m3169("ۙۚ") ^ i6;
                    i7 = ((iM2761 ^ i5) * 15913) ^ (-382701744);
                    i8 = 1789527543;
                    break;
                case 1079485584:
                case 1780891708:
                    return strM40334;
                case 1304154235:
                case 1863769661:
                    if (RunnableC3055.f9898 >= 0) {
                        iM2761 = (i6 - C0773.m3169("ܳۛ")) * (-75);
                        i7 = ((iM2761 ^ i5) * 10993) ^ (-1692089585);
                        i8 = 1091697126;
                    } else {
                        iM2761 = (i5 - C0773.m3169("۟֫")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i7 = ((iM2761 ^ i6) * (-4223)) ^ 1931453532;
                        i8 = 277530598;
                    }
                    break;
                case 1388025356:
                case 1741731511:
                    if (i - (176890000 + i2) <= 0) {
                        iM2761 = (i6 - C0773.m3169("ۨ᩹")) * 29;
                        i7 = ((iM2761 ^ i5) * 26085) ^ (-970871328);
                        i8 = -1033648938;
                    } else {
                        iM2761 = (C0773.m3169("ۤۚ") + i5) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i7 = ((iM2761 ^ i6) * (-27435)) ^ 1465617154;
                        i8 = 1849244493;
                    }
                    break;
                case 1435898985:
                case 1738815731:
                    if (RunnableC0334.m2063()) {
                        iM2761 = C0619.m2761("ۧۢ") ^ i6;
                        i7 = ((iM2761 ^ i5) * 2133) ^ (-1027081653);
                        i8 = -353480129;
                    } else {
                        iM2761 = C0773.m3169("֫ܿ") ^ i5;
                        i7 = ((iM2761 ^ i6) * 22525) ^ 446494354;
                        i8 = -240827383;
                    }
                    break;
                default:
                    i3 = 26571;
                    iM2761 = C0773.m3169("ۙۚ") ^ i6;
                    i7 = ((iM2761 ^ i5) * 15913) ^ (-382701744);
                    i8 = 1789527543;
                    break;
            }
        }
    }

    @Override // bin.mt.plugin.api.LocalString
    public final String getName() {
        return this.f55955;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m40331(LocalString localString, String str) {
        char cM13656 = 0;
        int i = 0;
        int iM10045 = 0;
        int i2 = -1145880397;
        int i3 = C1519.f5300;
        int i4 = C2310.f7472;
        int iM2761 = (i3 - C0619.m2761("֡ܽ")) * 21;
        int i5 = ((iM2761 ^ i4) * 22293) ^ 1619793856;
        int i6 = 1626010859;
        while (true) {
            i2 = ((((i2 ^ i4) * 27289) >> 31) & i5) ^ (iM2761 ^ i6);
            switch (i2) {
                case -1850836865:
                case 98817230:
                    if (AbstractC0641.f2496 >= 0) {
                        iM2761 = (C0773.m3169("ᩳۢ") + i4) * (-39);
                        i5 = ((iM2761 ^ i3) * (-12745)) ^ (-431753638);
                        i6 = -287262667;
                    } else {
                        iM2761 = (C0773.m3169("֫᩵") + i3) * 115;
                        i5 = ((iM2761 ^ i4) * 12627) ^ (-645683821);
                        i6 = 2024725231;
                    }
                    break;
                case -1805718088:
                case -1512938101:
                    if (!C3099.m10095()) {
                        iM2761 = (C0773.m3169("ᩳۢ") + i4) * (-39);
                        i5 = ((iM2761 ^ i3) * (-12745)) ^ (-431753638);
                        i6 = -287262667;
                    } else {
                        iM2761 = C0619.m2761("᩹ۙ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 18957) ^ (-1040421654);
                        i6 = -1665650713;
                    }
                    break;
                case -1763956837:
                case 3043888:
                    if (C2878.f9462) {
                        iM2761 = C0773.m3169("᩻ۛ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-11773)) ^ (-1447027719);
                        i6 = -940678823;
                    } else {
                        iM2761 = (C0773.m3169("ۛ᩷") + i3) * 77;
                        i5 = ((iM2761 ^ i4) * (-20275)) ^ 1005093978;
                        i6 = -660410988;
                    }
                    break;
                case -1603800643:
                case -1075889668:
                    return localString.getOrDefault(AbstractC0116.m1237(str, i, iM10045), str);
                case -1411503033:
                case 680154486:
                    if (cM13656 == '{') {
                        iM2761 = C0619.m2761("ᩳۜ") ^ i3;
                        i5 = ((iM2761 ^ i4) * 10789) ^ 1238311389;
                        i6 = -931301155;
                    } else {
                        iM2761 = (C0619.m2761("ܺ۠") ^ i4) * 115;
                        i5 = ((iM2761 ^ i3) * 17325) ^ (-428587117);
                        i6 = 1253578736;
                    }
                    break;
                case -1390118120:
                case 1465643088:
                    if (RunnableC1848.f6235) {
                        iM2761 = C0773.m3169("᩻ۛ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-11773)) ^ (-1447027719);
                        i6 = -940678823;
                    } else {
                        iM2761 = (C0773.m3169("۬ᩳ") + i3) * (-11);
                        i5 = ((iM2761 ^ i4) * (-8349)) ^ (-1920978159);
                        i6 = 833487669;
                    }
                    break;
                case -1273081131:
                case 246490503:
                    if (C0619.m2763()) {
                        iM2761 = C0773.m3169("᩻ۛ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-11773)) ^ (-1447027719);
                        i6 = -940678823;
                    } else {
                        iM2761 = C0619.m2761("֡֡") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-24425)) ^ 273295618;
                        i6 = 2065089633;
                    }
                    break;
                case -1202152723:
                case 2113004751:
                    iM10045 = C3077.m10045(str) - i;
                    if (C0269.m1775() <= 0) {
                        iM2761 = C0619.m2761("ۜ᩺") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-9693)) ^ 2094786917;
                        i6 = 208165819;
                    } else {
                        iM2761 = (C0619.m2761("֨ۢ") ^ i3) * 19;
                        i5 = ((iM2761 ^ i4) * 20827) ^ (-441793693);
                        i6 = 696511395;
                    }
                    break;
                case -631586820:
                case 1252739825:
                    if (C3448.f11240 >= 0) {
                        iM2761 = C0773.m3169("ᩴۛ") ^ i3;
                        i5 = ((iM2761 ^ i4) * 12599) ^ 260696964;
                        i6 = 1260603232;
                    } else {
                        iM2761 = C0773.m3169("᩻ۛ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-11773)) ^ (-1447027719);
                        i6 = -940678823;
                    }
                    break;
                case -520740790:
                case 901257300:
                    if (str != null) {
                        iM2761 = (C0619.m2761("ۜ᩻") + i3) * (-97);
                        i5 = ((iM2761 ^ i4) * 9329) ^ 15212141;
                        i6 = -1227868130;
                    } else {
                        iM2761 = (C0619.m2761("ܺ۠") ^ i4) * 115;
                        i5 = ((iM2761 ^ i3) * 17325) ^ (-428587117);
                        i6 = 1253578736;
                    }
                    break;
                case -503600853:
                case -169593249:
                    if (C1080.f3865 >= 0) {
                        iM2761 = C0773.m3169("ᩴۛ") ^ i3;
                        i5 = ((iM2761 ^ i4) * 12599) ^ 260696964;
                        i6 = 1260603232;
                    } else {
                        iM2761 = C0619.m2761("֨۟") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-3867)) ^ 436393412;
                        i6 = 1201456401;
                    }
                    break;
                case -489396141:
                case 1258347075:
                    cM13656 = C4282.m13656(str, 0);
                    if (C2375.f7641 <= 0) {
                        iM2761 = C0619.m2761("᩹ۙ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 18957) ^ (-1040421654);
                        i6 = -1665650713;
                    } else {
                        iM2761 = (C0773.m3169("۠ۤ") + i4) * 21;
                        i5 = ((iM2761 ^ i3) * (-1509)) ^ (-1346117887);
                        i6 = -1845327727;
                    }
                    break;
                case -429881988:
                case 668608282:
                    if (C3077.m10045(str) >= 3) {
                        iM2761 = (C0619.m2761("ۨ᩸") + i3) * (-73);
                        i5 = ((iM2761 ^ i4) * 15017) ^ 2056282800;
                        i6 = -1502597974;
                    } else {
                        iM2761 = (C0619.m2761("ܺ۠") ^ i4) * 115;
                        i5 = ((iM2761 ^ i3) * 17325) ^ (-428587117);
                        i6 = 1253578736;
                    }
                    break;
                case -151464838:
                case 1250500414:
                    if (C2485.m8357() <= 0) {
                        iM2761 = C0773.m3169("᩻ۛ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-11773)) ^ (-1447027719);
                        i6 = -940678823;
                    } else {
                        iM2761 = (C0773.m3169("ᩳۢ") + i4) * (-39);
                        i5 = ((iM2761 ^ i3) * (-12745)) ^ (-431753638);
                        i6 = -287262667;
                    }
                    break;
                case 9414223:
                case 1412133579:
                    if (C1321.f4751 >= 0) {
                        iM2761 = C0619.m2761("ۜ᩺") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-9693)) ^ 2094786917;
                        i6 = 208165819;
                    } else {
                        iM2761 = C0619.m2761("᩷ܽ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 25251) ^ 76812005;
                        i6 = -572878189;
                    }
                    break;
                case 199991916:
                case 1715697353:
                    if (C3077.f9998) {
                        iM2761 = (C0619.m2761("ۗۜ") + i3) * 93;
                        i5 = ((iM2761 ^ i4) * (-22783)) ^ 1464228732;
                        i6 = 432257378;
                    } else {
                        iM2761 = C0619.m2761("᩹ۙ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 18957) ^ (-1040421654);
                        i6 = -1665650713;
                    }
                    break;
                case 385929771:
                case 935782333:
                    i = 1;
                    if (RunnableC3646.m11801(1, str) == '}') {
                        iM2761 = C0619.m2761("᩵ܿ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-17943)) ^ (-1581504306);
                        i6 = 1852418782;
                    } else {
                        iM2761 = (C0619.m2761("ܺ۠") ^ i4) * 115;
                        i5 = ((iM2761 ^ i3) * 17325) ^ (-428587117);
                        i6 = 1253578736;
                    }
                    break;
                case 412338854:
                case 2084756653:
                    RunnableC1848.m6360();
                    iM2761 = (C0773.m3169("ᩳۢ") + i4) * (-39);
                    i5 = ((iM2761 ^ i3) * (-12745)) ^ (-431753638);
                    i6 = -287262667;
                    break;
                case 513492932:
                case 1096383137:
                    if (C3734.f12817 >= 0) {
                        iM2761 = C0619.m2761("ۜ᩺") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-9693)) ^ 2094786917;
                        i6 = 208165819;
                    } else {
                        iM2761 = (C0773.m3169("֡᩻") + i4) * 35;
                        i5 = ((iM2761 ^ i3) * 5465) ^ (-150309084);
                        i6 = -51554932;
                    }
                    break;
                case 1819588900:
                case 1918425917:
                    return str;
                default:
                    C2375.m8065();
                    C3448.m11248();
                    return null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:151:0x07b5 A[PHI: r5 r6 r7 r19 r20 r21 r25 r26 r28 r29 r30 r31 r35
      0x07b5: PHI (r5v39 int) = (r5v5 int), (r5v9 int), (r5v40 int) binds: [B:150:0x07b3, B:138:0x06ed, B:14:0x00b0] A[DONT_GENERATE, DONT_INLINE]
      0x07b5: PHI (r6v38 int) = (r6v6 int), (r6v10 int), (r6v39 int) binds: [B:150:0x07b3, B:138:0x06ed, B:14:0x00b0] A[DONT_GENERATE, DONT_INLINE]
      0x07b5: PHI (r7v71 java.lang.String) = (r7v30 java.lang.String), (r7v34 java.lang.String), (r7v72 java.lang.String) binds: [B:150:0x07b3, B:138:0x06ed, B:14:0x00b0] A[DONT_GENERATE, DONT_INLINE]
      0x07b5: PHI (r19v35 java.lang.Object) = (r19v5 java.lang.Object), (r19v9 java.lang.Object), (r19v36 java.lang.Object) binds: [B:150:0x07b3, B:138:0x06ed, B:14:0x00b0] A[DONT_GENERATE, DONT_INLINE]
      0x07b5: PHI (r20v35 java.util.HashMap) = (r20v5 java.util.HashMap), (r20v9 java.util.HashMap), (r20v36 java.util.HashMap) binds: [B:150:0x07b3, B:138:0x06ed, B:14:0x00b0] A[DONT_GENERATE, DONT_INLINE]
      0x07b5: PHI (r21v6 short[]) = (r21v2 short[]), (r21v1 short[]), (r21v1 short[]) binds: [B:150:0x07b3, B:138:0x06ed, B:14:0x00b0] A[DONT_GENERATE, DONT_INLINE]
      0x07b5: PHI (r25v6 int) = (r25v1 int), (r25v2 int), (r25v1 int) binds: [B:150:0x07b3, B:138:0x06ed, B:14:0x00b0] A[DONT_GENERATE, DONT_INLINE]
      0x07b5: PHI (r26v6 short) = (r26v1 short), (r26v2 short), (r26v1 short) binds: [B:150:0x07b3, B:138:0x06ed, B:14:0x00b0] A[DONT_GENERATE, DONT_INLINE]
      0x07b5: PHI (r28v43 bin.mt.plugin.api.PluginContext) = 
      (r28v4 bin.mt.plugin.api.PluginContext)
      (r28v8 bin.mt.plugin.api.PluginContext)
      (r28v44 bin.mt.plugin.api.PluginContext)
     binds: [B:150:0x07b3, B:138:0x06ed, B:14:0x00b0] A[DONT_GENERATE, DONT_INLINE]
      0x07b5: PHI (r29v53 java.lang.Exception) = (r29v19 java.lang.Exception), (r29v23 java.lang.Exception), (r29v54 java.lang.Exception) binds: [B:150:0x07b3, B:138:0x06ed, B:14:0x00b0] A[DONT_GENERATE, DONT_INLINE]
      0x07b5: PHI (r30v30 java.lang.String) = (r30v2 java.lang.String), (r30v6 java.lang.String), (r30v31 java.lang.String) binds: [B:150:0x07b3, B:138:0x06ed, B:14:0x00b0] A[DONT_GENERATE, DONT_INLINE]
      0x07b5: PHI (r31v32 java.lang.String) = (r31v3 java.lang.String), (r31v7 java.lang.String), (r31v33 java.lang.String) binds: [B:150:0x07b3, B:138:0x06ed, B:14:0x00b0] A[DONT_GENERATE, DONT_INLINE]
      0x07b5: PHI (r35v37 short[]) = (r35v7 short[]), (r35v11 short[]), (r35v38 short[]) binds: [B:150:0x07b3, B:138:0x06ed, B:14:0x00b0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0119, code lost:
    
        if (l.C2287.f7432 < 0) goto L23;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map m40333(l.C17159 r45, java.lang.String r46) {
        /*
            Method dump skipped, instruction units count: 2388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17159.m40333(l.ܺ᩺֫, java.lang.String):java.util.Map");
    }

    @Override // bin.mt.plugin.api.LocalString
    public final String get(String str) {
        return getOrDefault(str, str);
    }

    @Override // bin.mt.plugin.api.LocalString
    public final String get(String str, Object... objArr) {
        String orDefault = null;
        int i = 191996076;
        int i2 = C3099.f10023;
        int i3 = C3448.f11240;
        int iM2761 = (C0619.m2761("ۗۨ") + i3) * 25;
        int i4 = ((iM2761 ^ i2) * (-17003)) ^ (-1003632467);
        int i5 = 828362362;
        while (true) {
            i = ((((i ^ i2) * 7605) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2146785553:
                case -1963998437:
                    if (C23916.f77426 <= 0) {
                        iM2761 = (C0619.m2761("ܽܰ") ^ i2) * 127;
                        i4 = ((iM2761 ^ i3) * (-12253)) ^ 1833280096;
                        i5 = -1013429738;
                    } else {
                        iM2761 = C0619.m2761("֫ۘ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-23701)) ^ 1832415305;
                        i5 = -2100465812;
                    }
                    break;
                case -2127906737:
                case -326600930:
                    if (C3099.f10023 <= 0) {
                        iM2761 = (C0619.m2761("۫᩷") + i3) * 37;
                        i4 = ((iM2761 ^ i2) * (-11775)) ^ 1855558326;
                        i5 = 762291595;
                    } else {
                        iM2761 = C0619.m2761("᩺ܽ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-18569)) ^ (-212072936);
                        i5 = 59111916;
                    }
                    break;
                case -1883433030:
                case 1800085926:
                    if (C2288.f7433 <= 0) {
                        iM2761 = (i3 - C0619.m2761("ۢۚ")) * (-57);
                        i4 = ((iM2761 ^ i2) * 18945) ^ (-1997711713);
                        i5 = 130821133;
                    } else {
                        iM2761 = C0619.m2761("ۗ᩵") ^ i2;
                        i4 = ((iM2761 ^ i3) * 10123) ^ (-2042989073);
                        i5 = -1664633726;
                    }
                    break;
                case -1789775748:
                case 1682349757:
                    if (C3998.f13671 == 0) {
                        iM2761 = (C0619.m2761("۫᩷") + i3) * 37;
                        i4 = ((iM2761 ^ i2) * (-11775)) ^ 1855558326;
                        i5 = 762291595;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ۢۚ")) * (-57);
                        i4 = ((iM2761 ^ i2) * 18945) ^ (-1997711713);
                        i5 = 130821133;
                    }
                    break;
                case -1761253217:
                case -996827014:
                    if (RunnableC3646.m11813() != 0) {
                        iM2761 = C0619.m2761("᩷ۖ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 9827) ^ 1293832764;
                        i5 = 2098771941;
                    } else {
                        iM2761 = C0773.m3169("ۨᩳ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-31443)) ^ (-431667406);
                        i5 = -480519436;
                    }
                    break;
                case -1642658875:
                case -1342901691:
                    if (C3448.f11240 >= 0) {
                        iM2761 = (i2 - C0773.m3169("ۛ۫")) * 41;
                        i4 = ((iM2761 ^ i3) * 25553) ^ (-1630130004);
                        i5 = 295483535;
                    } else {
                        iM2761 = (C0773.m3169("᩸ۨ") + i3) * (-47);
                        i4 = ((iM2761 ^ i2) * (-30705)) ^ 1533887169;
                        i5 = -1252653848;
                    }
                    break;
                case -1150193686:
                case 434867801:
                    return m40332(orDefault, objArr);
                case -1079725167:
                case -215431749:
                    C3077.m10041();
                    if (C2702.f8586 <= 0) {
                        iM2761 = (i2 - C0773.m3169("ۛ۫")) * 41;
                        i4 = ((iM2761 ^ i3) * 25553) ^ (-1630130004);
                        i5 = 295483535;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ۢۚ")) * (-57);
                        i4 = ((iM2761 ^ i2) * 18945) ^ (-1997711713);
                        i5 = 130821133;
                    }
                    break;
                case -1076419590:
                case -490201966:
                    orDefault = getOrDefault(str, null);
                    if (orDefault == null) {
                        iM2761 = (i2 - C0619.m2761("ۚۢ")) * (-109);
                        i4 = ((iM2761 ^ i3) * (-12325)) ^ 35757311;
                        i5 = 632666837;
                    } else {
                        iM2761 = (C0619.m2761("᩷ۨ") ^ i3) * (-7);
                        i4 = ((iM2761 ^ i2) * 26993) ^ 563750170;
                        i5 = -1138899354;
                    }
                    break;
                case -870008294:
                case 321136509:
                    C2287.m7745();
                    return null;
                case -207575657:
                case 1078172754:
                    if (C1564.m5509() <= 0) {
                        iM2761 = (C0619.m2761("۫᩷") + i3) * 37;
                        i4 = ((iM2761 ^ i2) * (-11775)) ^ 1855558326;
                        i5 = 762291595;
                    } else {
                        iM2761 = C0619.m2761("᩻ᩴ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-1875)) ^ 890764081;
                        i5 = -665119952;
                    }
                    break;
                case -194883770:
                case 928124547:
                    if (C2354.f7599 >= 0) {
                        iM2761 = (C0619.m2761("ܽܰ") ^ i2) * 127;
                        i4 = ((iM2761 ^ i3) * (-12253)) ^ 1833280096;
                        i5 = -1013429738;
                    } else {
                        iM2761 = (C0773.m3169("᩹᩶") + i3) * (-65);
                        i4 = ((iM2761 ^ i2) * 24901) ^ (-1513733534);
                        i5 = -137320726;
                    }
                    break;
                case -127969260:
                case 1074408335:
                    C13473.m33144();
                    C1321.m4852();
                    iM2761 = (C0619.m2761("ܽܰ") ^ i2) * 127;
                    i4 = ((iM2761 ^ i3) * (-12253)) ^ 1833280096;
                    i5 = -1013429738;
                    break;
                case 185767641:
                case 1229791972:
                    if (C1519.m5403()) {
                        iM2761 = (i2 - C0619.m2761("۫᩶")) * (-47);
                        i4 = ((iM2761 ^ i3) * (-8327)) ^ 1293388160;
                        i5 = -6147576;
                    } else {
                        iM2761 = C0619.m2761("᩷ۖ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 9827) ^ 1293832764;
                        i5 = 2098771941;
                    }
                    break;
                case 362467973:
                case 884621833:
                    C20932.m47848();
                    if (C2966.f9654 < 0) {
                        iM2761 = (i3 - C0619.m2761("ۢۚ")) * (-57);
                        i4 = ((iM2761 ^ i2) * 18945) ^ (-1997711713);
                        i5 = 130821133;
                    } else {
                        iM2761 = (C0619.m2761("ܽܰ") ^ i2) * 127;
                        i4 = ((iM2761 ^ i3) * (-12253)) ^ 1833280096;
                        i5 = -1013429738;
                    }
                    break;
                case 1208283700:
                case 1540636521:
                    if (C2419.m8174() >= 0) {
                        iM2761 = (i3 - C0619.m2761("ۢۚ")) * (-57);
                        i4 = ((iM2761 ^ i2) * 18945) ^ (-1997711713);
                        i5 = 130821133;
                    } else {
                        iM2761 = (C0773.m3169("ۧܶ") + i3) * 67;
                        i4 = ((iM2761 ^ i2) * 18413) ^ 1072721369;
                        i5 = 1144739077;
                    }
                    break;
                case 1787061575:
                case 1921165889:
                    if (C0950.f3488 >= 0) {
                        iM2761 = C0619.m2761("᩷ۖ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 9827) ^ 1293832764;
                        i5 = 2098771941;
                    } else {
                        iM2761 = (C0773.m3169("᩵ۡ") + i2) * (-113);
                        i4 = ((iM2761 ^ i3) * (-29817)) ^ 1022961776;
                        i5 = -1104840332;
                    }
                    break;
                default:
                    return str;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m40332(String str, Object... objArr) {
        Resources resourcesM49055 = null;
        Configuration configuration = null;
        Locale locale = null;
        int i = 581465549;
        int i2 = C1146.f4234;
        int i3 = C2419.f7754;
        int iM2761 = (i2 - C0619.m2761("ۘۧ")) * 119;
        int i4 = ((iM2761 ^ i3) * 8089) ^ (-1878538216);
        int i5 = -2095677592;
        while (true) {
            i = ((((i ^ i3) * (-18071)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -1961713251:
                case -1366599070:
                    if (C2287.f7432 >= 0) {
                        iM2761 = (C0773.m3169("ۧۛ") ^ i3) * (-107);
                        i4 = ((iM2761 ^ i2) * 2175) ^ (-939613411);
                        i5 = -939091060;
                    } else {
                        iM2761 = (C0773.m3169("ۢۗ") ^ i3) * 21;
                        i4 = ((iM2761 ^ i2) * (-24457)) ^ (-539591616);
                        i5 = 1276350510;
                    }
                    break;
                case -1821906801:
                case 1598180368:
                    if (C1146.f4234 >= 0) {
                        iM2761 = (C0619.m2761("᩵۠") ^ i3) * (-81);
                        i4 = ((iM2761 ^ i2) * 7735) ^ (-1911040187);
                        i5 = 915495561;
                    } else {
                        iM2761 = (C0773.m3169("ۡۚ") + i2) * 89;
                        i4 = ((iM2761 ^ i3) * (-22099)) ^ (-447724693);
                        i5 = 2072665187;
                    }
                    break;
                case -1724968085:
                case 1043341882:
                    if (C1146.f4234 < 0) {
                        iM2761 = (C0773.m3169("ܿۢ") + i2) * 71;
                        i4 = ((iM2761 ^ i3) * (-32011)) ^ (-411825293);
                        i5 = 1191916747;
                    } else {
                        iM2761 = C0619.m2761("ܳۗ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 7973) ^ 1091909620;
                        i5 = 1709273470;
                    }
                    break;
                case -1697881870:
                case 785162900:
                    if (RunnableC3646.m11813() != 0) {
                        iM2761 = (C0773.m3169("ܿۢ") + i2) * 71;
                        i4 = ((iM2761 ^ i3) * (-32011)) ^ (-411825293);
                        i5 = 1191916747;
                    } else {
                        iM2761 = (C0619.m2761("ۨۖ") ^ i2) * 99;
                        i4 = ((iM2761 ^ i3) * (-29229)) ^ (-547748508);
                        i5 = -789161543;
                    }
                    break;
                case -1323752376:
                case -462559322:
                    C2354.m7983();
                    if (C2354.f7599 < 0) {
                        iM2761 = C0619.m2761("ܳۗ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 7973) ^ 1091909620;
                        i5 = 1709273470;
                    } else {
                        iM2761 = (C0619.m2761("᩸ܳ") + i2) * (-43);
                        i4 = ((iM2761 ^ i3) * (-11599)) ^ 170227231;
                        i5 = -480904043;
                    }
                    break;
                case -1226673368:
                case 253266982:
                    if (C0269.m1775() > 0) {
                        iM2761 = (C0619.m2761("᩵۠") ^ i3) * (-81);
                        i4 = ((iM2761 ^ i2) * 7735) ^ (-1911040187);
                        i5 = 915495561;
                    } else {
                        iM2761 = C0619.m2761("ܳۗ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 7973) ^ 1091909620;
                        i5 = 1709273470;
                    }
                    break;
                case -1203252780:
                case 1787730320:
                    C3033.m9845();
                    C0862.m3503();
                    return null;
                case -308914448:
                case 1984750648:
                    C20932.m47848();
                    iM2761 = (C0619.m2761("᩸ܳ") + i2) * (-43);
                    i4 = ((iM2761 ^ i3) * (-11599)) ^ 170227231;
                    i5 = -480904043;
                    break;
                case -301205251:
                case 2076230227:
                    if (C2375.m8065() <= 0) {
                        iM2761 = C0619.m2761("ܳۗ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 7973) ^ 1091909620;
                        i5 = 1709273470;
                    } else {
                        iM2761 = (C0773.m3169("ܽ᩻") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM2761 ^ i3) * (-7493)) ^ 1826872661;
                        i5 = 1124713075;
                    }
                    break;
                case -179684596:
                case 1746952742:
                    Locale localeM30639 = C17487.m40989(configuration).m30639(0);
                    if (localeM30639 == null) {
                        iM2761 = (C0619.m2761("ۚܶ") + i2) * 115;
                        i4 = ((iM2761 ^ i3) * (-5883)) ^ 1249948454;
                        i5 = 1241602571;
                    } else {
                        locale = localeM30639;
                        iM2761 = (C0619.m2761("۠ۤ") ^ i3) * (-23);
                        i4 = ((iM2761 ^ i2) * 14631) ^ (-254370259);
                        i5 = -752343554;
                    }
                    break;
                case 66654551:
                case 1707229971:
                    if (C1542.m5459() >= 0) {
                        iM2761 = (C0619.m2761("᩵۠") ^ i3) * (-81);
                        i4 = ((iM2761 ^ i2) * 7735) ^ (-1911040187);
                        i5 = 915495561;
                    } else {
                        iM2761 = (C0773.m3169("֫۟") + i3) * 7;
                        i4 = ((iM2761 ^ i2) * (-13813)) ^ 645054063;
                        i5 = 674013277;
                    }
                    break;
                case 216447985:
                case 1400937191:
                    locale = Locale.getDefault();
                    iM2761 = (C0619.m2761("۠ۤ") ^ i3) * (-23);
                    i4 = ((iM2761 ^ i2) * 14631) ^ (-254370259);
                    i5 = -752343554;
                    break;
                case 392238312:
                case 585981007:
                    if (C2834.f9334 <= 0) {
                        iM2761 = (C0773.m3169("ۧۛ") ^ i3) * (-107);
                        i4 = ((iM2761 ^ i2) * 2175) ^ (-939613411);
                        i5 = -939091060;
                    } else {
                        iM2761 = C0619.m2761("۟ᩴ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 29063) ^ (-550333726);
                        i5 = -336172934;
                    }
                    break;
                case 519752778:
                case 2111234181:
                    if (C3734.f12817 >= 0) {
                        iM2761 = (C0773.m3169("ۧۛ") ^ i3) * (-107);
                        i4 = ((iM2761 ^ i2) * 2175) ^ (-939613411);
                        i5 = -939091060;
                    } else {
                        iM2761 = (C0619.m2761("ۙᩳ") ^ i2) * 123;
                        i4 = ((iM2761 ^ i3) * 26065) ^ (-1802303034);
                        i5 = -1347048581;
                    }
                    break;
                case 569667328:
                case 1267717150:
                    if (AbstractC3624.m11755() != 0) {
                        iM2761 = C0619.m2761("ܳۗ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 7973) ^ 1091909620;
                        i5 = 1709273470;
                    } else {
                        iM2761 = C0773.m3169("ܰ᩶") ^ i3;
                        i4 = ((iM2761 ^ i2) * 20931) ^ (-176177524);
                        i5 = 314267710;
                    }
                    break;
                case 1338354889:
                case 1852079552:
                    return String.format(locale, str, objArr);
                case 1406047756:
                case 1669416581:
                    resourcesM49055 = C21576.m49055();
                    if (C1542.f5343 <= 0) {
                        iM2761 = (C0619.m2761("᩵۠") ^ i3) * (-81);
                        i4 = ((iM2761 ^ i2) * 7735) ^ (-1911040187);
                        i5 = 915495561;
                    } else {
                        iM2761 = (i2 - C0773.m3169("۫ۛ")) * 19;
                        i4 = ((iM2761 ^ i3) * 23933) ^ (-296616804);
                        i5 = 2063881418;
                    }
                    break;
                default:
                    configuration = resourcesM49055.getConfiguration();
                    if (C3998.f13671 != 0) {
                        iM2761 = (C0773.m3169("ۧۛ") ^ i3) * (-107);
                        i4 = ((iM2761 ^ i2) * 2175) ^ (-939613411);
                        i5 = -939091060;
                    } else {
                        iM2761 = C0773.m3169("ۘ֡") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-11719)) ^ 2011672403;
                        i5 = 2101158735;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:64:0x01fe A[PHI: r5
      0x01fe: PHI (r5v3 short[]) = (r5v1 short[]), (r5v2 short[]), (r5v1 short[]) binds: [B:63:0x01fc, B:59:0x01e1, B:11:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x0245 A[PHI: r1 r7
      0x0245: PHI (r1v5 l.ܳ᩺֫) = (r1v1 l.ܳ᩺֫), (r1v1 l.ܳ᩺֫), (r1v4 l.ܳ᩺֫), (r1v1 l.ܳ᩺֫) binds: [B:68:0x0243, B:51:0x0188, B:35:0x00d9, B:14:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x0245: PHI (r7v4 int) = (r7v1 int), (r7v3 int), (r7v1 int), (r7v1 int) binds: [B:68:0x0243, B:51:0x0188, B:35:0x00d9, B:14:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x0277 A[PHI: r2
      0x0277: PHI (r2v3 l.ܽ֫ۗ) = (r2v1 l.ܽ֫ۗ), (r2v2 l.ܽ֫ۗ), (r2v1 l.ܽ֫ۗ) binds: [B:72:0x0275, B:31:0x00b7, B:10:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:77:0x02a5  */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
    
        if (l.C2287.f7432 >= 0) goto L14;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m40334(java.lang.String r17, java.lang.String r18) {
        /*
            Method dump skipped, instruction units count: 902
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17159.m40334(java.lang.String, java.lang.String):java.lang.String");
    }

    @Override // bin.mt.plugin.api.LocalString
    public final String get(String str, String str2) {
        return getOrDefault(str, str, str2);
    }
}
