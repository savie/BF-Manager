package l;

import android.app.Application;
import android.util.Base64;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.analytics.pro.o;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Arrays;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.math.ec.custom.sec.SecP160R2Field;

/* JADX INFO: renamed from: l.۬۠᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: E6NZ */
/* JADX INFO: loaded from: classes.dex */
public final class C12999 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static boolean f43350;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final String[] f43351;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static C1003 f43352;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static String f43353;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final SecureRandom f43354;

    /* JADX INFO: renamed from: ܶۘۤ, reason: not valid java name and contains not printable characters */
    private static final short[] f43355;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static int[] f43356;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static native synchronized C1003 m32142();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static native String m32144(int[] iArr);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static native C17367 m32147(C15759 c15759, int i, int[] iArr);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static native void m32152(C6490 c6490, String str, boolean z);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static native void m32153(C15759 c15759);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static native void m32154(C15759 c15759, int i, byte[] bArr, int[] iArr);

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static native int[] m32158();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static native synchronized String m32159();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static native synchronized void m32164(C1003 c1003);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static synchronized void m32163() {
        short s = f43355[352];
        int i = (s * 2) + 1;
        int i2 = s + 1;
        int i3 = i - (i2 * i2) <= 0 ? 56625 : 60130;
        synchronized (C12999.class) {
            m32162(RunnableC1606.m5481(f43355, 353, 4, i3)).m37496();
            f43352 = null;
            f43350 = true;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m32143(String str, String str2) {
        C1003 c1003M2312 = null;
        C1003 c1003M32145 = null;
        String strM32141 = null;
        int i = -1996228240;
        int i2 = C2788.f10625;
        int i3 = C0050.f912;
        int iM45029 = (C19806.m45029("ۚܶ") ^ i3) * (-31);
        int i4 = ((iM45029 ^ i2) * (-17079)) ^ 1834647469;
        int i5 = -1471573704;
        while (true) {
            i = ((((i ^ i2) * 31429) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2024396507:
                case -193523636:
                    if (CallableC1627.f6528) {
                        iM45029 = C19806.m45029("᩺ۨ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-6537)) ^ (-654926644);
                        i5 = 2146801356;
                    } else {
                        iM45029 = C19806.m45029("ۧۤ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 13175) ^ (-826805778);
                        i5 = -513879149;
                    }
                    break;
                case -1993114034:
                case 2092604342:
                    c1003M2312 = AbstractC0464.m2312();
                    if (c1003M2312 != null) {
                        iM45029 = (C19806.m45029("ۘܳ") ^ i3) * (-113);
                        i4 = ((iM45029 ^ i2) * (-1917)) ^ (-1419411848);
                        i5 = -2103691393;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ܰᩳ")) * (-93);
                        i4 = ((iM45029 ^ i2) * (-15407)) ^ 2128183928;
                        i5 = -873700668;
                    }
                    break;
                case -1928577687:
                case 1165643288:
                    RunnableC1895.m6170();
                    if (C0050.f912 > 0) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("֨֡")) * (-5);
                        i4 = ((iM45029 ^ i3) * 8353) ^ 1836543785;
                        i5 = -1201609905;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֫᩸") + i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM45029 ^ i2) * 13429) ^ 1770934706;
                        i5 = -164130083;
                    }
                    break;
                case -1903913835:
                case -473646153:
                    if (AbstractC0464.m2315(str, c1003M2312.f4682)) {
                        iM45029 = ThreadFactoryC3888.m11306("۬ۘ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 6903) ^ 1223146054;
                        i5 = -1687054813;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ܰᩳ")) * (-93);
                        i4 = ((iM45029 ^ i2) * (-15407)) ^ 2128183928;
                        i5 = -873700668;
                    }
                    break;
                case -1717362004:
                case 1831067305:
                    strM32141 = m32141();
                    if (RunnableC1606.f6488 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩸ۖ") ^ i3) * (-101);
                        i4 = ((iM45029 ^ i2) * (-2325)) ^ (-1824959799);
                        i5 = -1608512082;
                    } else {
                        iM45029 = C19806.m45029("֨ܳ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-21969)) ^ 1360663171;
                        i5 = 1779516684;
                    }
                    break;
                case -1626552540:
                case 303794250:
                    c1003M32145 = m32145(c1003M2312);
                    c1003M32145.f4682 = str;
                    if (C2124.m6673() <= 0) {
                        iM45029 = C19806.m45029("ۧۤ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 13175) ^ (-826805778);
                        i5 = -513879149;
                    } else {
                        iM45029 = (C19806.m45029("ۘܺ") ^ i2) * 67;
                        i4 = ((iM45029 ^ i3) * (-5105)) ^ (-976083838);
                        i5 = -1710573012;
                    }
                    break;
                case -1441249356:
                case 1286461813:
                    if (C0050.m946() <= 0) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("֨֡")) * (-5);
                        i4 = ((iM45029 ^ i3) * 8353) ^ 1836543785;
                        i5 = -1201609905;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۖۜ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-30673)) ^ 1141894518;
                        i5 = 1225059918;
                    }
                    break;
                case -1384868179:
                case -893674597:
                    if (C3577.f13150 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("۫᩻") ^ i2) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM45029 ^ i3) * 23201) ^ 304284228;
                        i5 = -1870240097;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("֨֡")) * (-5);
                        i4 = ((iM45029 ^ i3) * 8353) ^ 1836543785;
                        i5 = -1201609905;
                    }
                    break;
                case -1171640613:
                case 1404225217:
                    CallableC1627.m5507();
                    if (!C1668.m5583()) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("֨֡")) * (-5);
                        i4 = ((iM45029 ^ i3) * 8353) ^ 1836543785;
                        i5 = -1201609905;
                    } else {
                        iM45029 = C19806.m45029("ۧۤ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 13175) ^ (-826805778);
                        i5 = -513879149;
                    }
                    break;
                case -1135023066:
                case -151383260:
                    return c1003M2312.f4687;
                case -1073800879:
                case -833129936:
                    c1003M32145.f4687 = strM32141;
                    m32164(c1003M32145);
                    return c1003M32145.f4687;
                case -909825739:
                case -681848148:
                    if (AbstractC0464.m2315(str2, c1003M2312.f4685)) {
                        iM45029 = ThreadFactoryC3888.m11306("ۤ᩸") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-24671)) ^ 1950616003;
                        i5 = 1773598436;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ܰᩳ")) * (-93);
                        i4 = ((iM45029 ^ i2) * (-15407)) ^ 2128183928;
                        i5 = -873700668;
                    }
                    break;
                case -200178683:
                case 1782059488:
                    C1419.m4973();
                    iM45029 = (ThreadFactoryC3888.m11306("֫᩸") + i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                    i4 = ((iM45029 ^ i2) * 13429) ^ 1770934706;
                    i5 = -164130083;
                    break;
                case 86945131:
                case 1246759808:
                    if (C1937.f7317 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩸ۖ") ^ i3) * (-101);
                        i4 = ((iM45029 ^ i2) * (-2325)) ^ (-1824959799);
                        i5 = -1608512082;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۡܺ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 27105) ^ (-335735647);
                        i5 = 157063197;
                    }
                    break;
                case 138923200:
                case 1901596440:
                    if (C0526.f2219) {
                        iM45029 = C19806.m45029("ۧۤ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 13175) ^ (-826805778);
                        i5 = -513879149;
                    } else {
                        iM45029 = (C19806.m45029("֡ۤ") + i2) * 127;
                        i4 = ((iM45029 ^ i3) * 9447) ^ 1877582596;
                        i5 = 1566238705;
                    }
                    break;
                case 688860929:
                case 1762703821:
                    C1398.m4895();
                    return null;
                case 883141443:
                case 1734195248:
                    c1003M32145.f4685 = str2;
                    if (C0278.f1572 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩸ۖ") ^ i3) * (-101);
                        i4 = ((iM45029 ^ i2) * (-2325)) ^ (-1824959799);
                        i5 = -1608512082;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܺ᩵") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-29689)) ^ (-760703705);
                        i5 = 554286385;
                    }
                    break;
                case 1165417863:
                case 2135946474:
                    if (C1875.f7103 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("֫᩸") + i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM45029 ^ i2) * 13429) ^ 1770934706;
                        i5 = -164130083;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩶᩶") ^ i2;
                        i4 = ((iM45029 ^ i3) * 3997) ^ (-2100455015);
                        i5 = -576034602;
                    }
                    break;
                case 1856529319:
                case 2013318619:
                    if (C7105.f23796 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩸ۖ") ^ i3) * (-101);
                        i4 = ((iM45029 ^ i2) * (-2325)) ^ (-1824959799);
                        i5 = -1608512082;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۗۘ") ^ i2) * (-119);
                        i4 = ((iM45029 ^ i3) * (-11471)) ^ (-1758441293);
                        i5 = -517492388;
                    }
                    break;
                default:
                    if (C1398.f5802 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("۫᩻") ^ i2) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM45029 ^ i3) * 23201) ^ 304284228;
                        i5 = -1870240097;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ܺ᩶")) * 7;
                        i4 = ((iM45029 ^ i2) * 18459) ^ 1549441748;
                        i5 = -1837796620;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m32150(C1313 c1313, String str, String str2) throws IOException {
        boolean z = false;
        int i = 1101184624;
        int i2 = C3577.f13150;
        int i3 = C2871.f10837;
        int iM45029 = (C19806.m45029("᩶ۛ") + i2) * (-3);
        int i4 = ((iM45029 ^ i3) * 16721) ^ (-1342758510);
        int i5 = 2032993085;
        while (true) {
            i = ((((i ^ i3) * 17049) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -1983286767:
                case -1098038840:
                    m32151(c1313, str, str2, z);
                    break;
                case -1609884179:
                case -868043874:
                    if (C1875.m6086() != 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩺۬") + i3) * (-13);
                        i4 = ((iM45029 ^ i2) * (-8115)) ^ (-1005572624);
                        i5 = 839607583;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۢۧ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-12663)) ^ (-776215179);
                        i5 = 1037054346;
                    }
                    break;
                case -1538243941:
                case 1287524187:
                    z = true;
                    iM45029 = C19806.m45029("᩻ۖ") ^ i2;
                    i4 = ((iM45029 ^ i3) * (-6815)) ^ (-1659431107);
                    i5 = 608385056;
                    break;
                case -1482290031:
                case 745639498:
                    C1066.m4023();
                    if (C1875.f7103 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۘ᩹") + i2) * (-89);
                        i4 = ((iM45029 ^ i3) * (-15749)) ^ 619893139;
                        i5 = -502118222;
                    } else {
                        iM45029 = C19806.m45029("ۜ᩹") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-16979)) ^ 521977202;
                        i5 = -1212922520;
                    }
                    break;
                case -1300942080:
                case -609328187:
                    C19806.m45024();
                    if (!C7105.m18985()) {
                        iM45029 = C19806.m45029("ۜ᩹") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-16979)) ^ 521977202;
                        i5 = -1212922520;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۢۧ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-12663)) ^ (-776215179);
                        i5 = 1037054346;
                    }
                    break;
                case -891791354:
                case 982292555:
                    if (ViewGroupOnHierarchyChangeListenerC1916.m6233() != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۢۧ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-12663)) ^ (-776215179);
                        i5 = 1037054346;
                    } else {
                        iM45029 = C19806.m45029("ۗ᩹") ^ i3;
                        i4 = ((iM45029 ^ i2) * 12997) ^ (-1472307105);
                        i5 = 1364711761;
                    }
                    break;
                case -742856235:
                case -274038165:
                    z = false;
                    iM45029 = C19806.m45029("᩻ۖ") ^ i2;
                    i4 = ((iM45029 ^ i3) * (-6815)) ^ (-1659431107);
                    i5 = 608385056;
                    break;
                case -730792594:
                case 2013483599:
                    if (C0962.f3784) {
                        iM45029 = C19806.m45029("ۜ᩹") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-16979)) ^ 521977202;
                        i5 = -1212922520;
                    } else {
                        iM45029 = C19806.m45029("᩻ᩳ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 18351) ^ 2127187699;
                        i5 = -1713085886;
                    }
                    break;
                case -648226699:
                case 1277480944:
                    if (str2 != null) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴ֡") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-23011)) ^ 1964085290;
                        i5 = 379808186;
                    } else {
                        iM45029 = C19806.m45029("᩺᩶") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-15191)) ^ 1033614181;
                        i5 = 1969524484;
                    }
                    break;
                case -476778899:
                case 2004087631:
                    if (RunnableC0195.f1321 >= 0) {
                        iM45029 = C19806.m45029("᩻ܺ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-22483)) ^ 373333787;
                        i5 = 357900802;
                    } else {
                        iM45029 = C19806.m45029("ܰᩳ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 6989) ^ 236413033;
                        i5 = 1133601637;
                    }
                    break;
                case -475585185:
                case 1294525073:
                    if (C1066.f4915 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۢۧ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-12663)) ^ (-776215179);
                        i5 = 1037054346;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۫֨") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-16121)) ^ 2086856125;
                        i5 = -101948683;
                    }
                    break;
                case -387412180:
                case 722943894:
                    if (C0629.m2907()) {
                        iM45029 = ThreadFactoryC3888.m11306("ۘۜ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-19745)) ^ 603412509;
                        i5 = -2094928020;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۢۧ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-12663)) ^ (-776215179);
                        i5 = 1037054346;
                    }
                    break;
                case -347602360:
                case 1663171771:
                    if (C1189.f5284 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۘ᩹") + i2) * (-89);
                        i4 = ((iM45029 ^ i3) * (-15749)) ^ 619893139;
                        i5 = -502118222;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩷ۨ")) * 13;
                        i4 = ((iM45029 ^ i2) * 183) ^ (-1707737043);
                        i5 = 1858833007;
                    }
                    break;
                case 28547683:
                case 1453556901:
                    if (C0962.f3784) {
                        iM45029 = C19806.m45029("ۜ᩹") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-16979)) ^ 521977202;
                        i5 = -1212922520;
                    } else {
                        iM45029 = (C19806.m45029("᩻ᩴ") + i2) * 41;
                        i4 = ((iM45029 ^ i3) * (-16089)) ^ (-408812255);
                        i5 = 521644514;
                    }
                    break;
                case 88389881:
                case 315807121:
                    ThreadFactoryC3888.m11300();
                    break;
                case 835790564:
                case 1596352316:
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩺۬") + i3) * (-13);
                        i4 = ((iM45029 ^ i2) * (-8115)) ^ (-1005572624);
                        i5 = 839607583;
                    } else {
                        iM45029 = C19806.m45029("᩹ۘ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 10157) ^ 1153489773;
                        i5 = 1343627562;
                    }
                    break;
                case 1197601865:
                case 2026727312:
                    if (C1398.f5802 <= 0) {
                        iM45029 = C19806.m45029("ۜ᩹") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-16979)) ^ 521977202;
                        i5 = -1212922520;
                    } else {
                        iM45029 = (i2 - C19806.m45029("֨ܿ")) * 13;
                        i4 = ((iM45029 ^ i3) * 15713) ^ (-839764420);
                        i5 = -1247026135;
                    }
                    break;
                case 1260519577:
                case 1774779557:
                    if (RunnableC0195.m1431()) {
                        iM45029 = ThreadFactoryC3888.m11306("ܶᩴ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-12219)) ^ (-602965817);
                        i5 = 1365509407;
                    } else {
                        iM45029 = C19806.m45029("ۜ᩹") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-16979)) ^ 521977202;
                        i5 = -1212922520;
                    }
                    break;
                default:
                    C0671.m3008();
                    CallableC1627.m5507();
                    iM45029 = C19806.m45029("ۜ᩹") ^ i3;
                    i4 = ((iM45029 ^ i2) * (-16979)) ^ 521977202;
                    i5 = -1212922520;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0175  */
    /* JADX WARN: Code duplicated, block: B:47:0x01c3 A[PHI: r1 r2 r5 r6 r11 r12
      0x01c3: PHI (r1v13 java.lang.String) = (r1v1 java.lang.String), (r1v14 java.lang.String) binds: [B:46:0x01c1, B:42:0x01a0] A[DONT_GENERATE, DONT_INLINE]
      0x01c3: PHI (r2v4 java.lang.String) = (r2v2 java.lang.String), (r2v1 java.lang.String) binds: [B:46:0x01c1, B:42:0x01a0] A[DONT_GENERATE, DONT_INLINE]
      0x01c3: PHI (r5v3 short[]) = (r5v1 short[]), (r5v4 short[]) binds: [B:46:0x01c1, B:42:0x01a0] A[DONT_GENERATE, DONT_INLINE]
      0x01c3: PHI (r6v4 short[]) = (r6v2 short[]), (r6v1 short[]) binds: [B:46:0x01c1, B:42:0x01a0] A[DONT_GENERATE, DONT_INLINE]
      0x01c3: PHI (r11v5 int) = (r11v3 int), (r11v6 int) binds: [B:46:0x01c1, B:42:0x01a0] A[DONT_GENERATE, DONT_INLINE]
      0x01c3: PHI (r12v3 int) = (r12v1 int), (r12v4 int) binds: [B:46:0x01c1, B:42:0x01a0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x031b A[PHI: r9 r10 r15 r16 r21 r22
      0x031b: PHI (r9v70 short[]) = (r9v5 short[]), (r9v53 short[]), (r9v75 short[]) binds: [B:69:0x0319, B:20:0x00cb, B:6:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x031b: PHI (r10v45 int) = (r10v5 int), (r10v34 int), (r10v51 int) binds: [B:69:0x0319, B:20:0x00cb, B:6:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x031b: PHI (r15v49 int) = (r15v4 int), (r15v38 int), (r15v52 int) binds: [B:69:0x0319, B:20:0x00cb, B:6:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x031b: PHI (r16v31 java.lang.String) = (r16v3 java.lang.String), (r16v26 java.lang.String), (r16v35 java.lang.String) binds: [B:69:0x0319, B:20:0x00cb, B:6:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x031b: PHI (r21v3 int) = (r21v1 int), (r21v1 int), (r21v6 int) binds: [B:69:0x0319, B:20:0x00cb, B:6:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x031b: PHI (r22v24 java.lang.String) = (r22v3 java.lang.String), (r22v19 java.lang.String), (r22v28 java.lang.String) binds: [B:69:0x0319, B:20:0x00cb, B:6:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    static {
        int i;
        int i2;
        String str;
        int i3;
        int iM45029;
        int i4;
        int i5;
        int i6;
        short[] sArr;
        int i7;
        int iM11306;
        int i8;
        ApplicationC6132.m17119(UMErrorCode.E_UM_BE_NOT_MAINPROCESS);
        f43355 = new short[]{1317, -27087, -27092, -27081, -27102, -27081, -27098, -27102, -27104, -27096, -27089, -27092, -27100, -27094, -27091, -27090, -27094, -27100, -27087, -27102, -27081, -27098, 5883, 1234, 1156, 1232, 1152, 1238, 1153, 1233, 1162, 1237, 1159, 1239, 1163, 5659, -4240, -4313, -4233, -4308, 7151, -25356, -25353, -25345, -25359, -25354, 5111, 7839, 7864, 7840, 7863, 7866, 7871, 7858, 7926, 7845, 7859, 7845, 7845, 7871, 7865, 7864, 7926, 7857, 7844, 7863, 7864, 7842, 7863, 7861, 7869, 7813, 7842, 7863, 7866, 7859, 7926, 7845, 7859, 7845, 7845, 7871, 7865, 7864, 7926, 7857, 7844, 7863, 7864, 7842, 7813, 7859, 7845, 7845, 7871, 7865, 7864, 7926, 7863, 7861, 7869, 7864, 7865, 7841, 7866, 7859, 7858, 7857, 7859, 7867, 7859, 7864, 7842, 7926, 7846, 7859, 7864, 7858, 7871, 7864, 7857, 384, 2004, 1953, 1985, 2008, 1953, 1992, 2004, 1953, 1985, 2008, 1953, 1993, 1981, 2004, 1953, 1985, 2008, 1953, 1998, 2004, 1953, 1985, 2008, 1953, 1985, 2004, 1953, 1985, 2008, 1953, 1986, 1985, 2021, 2047, 2047, 2021, 2018, 2027, 1964, 2047, 2025, 2047, 2047, 2021, 2019, 2018, 1964, 2031, 2046, 2025, 2024, 2025, 2018, 2040, 2021, 2029, 2016, 2004, 1953, 1985, 2008, 1953, 2008, 6394, 30190, 30126, 30117, 30135, 5653, -18506, -18540, -18533, -18533, -18534, -18559, -18475, -18544, -18533, -18538, -18553, -18548, -18555, -18559, -18475, -18535, -18534, -18538, -18540, -18535, -18475, -18538, -18553, -18544, -18543, -18544, -18533, -18559, -18532, -18540, -18535, -18475, -18543, -18540, -18559, -18540, -18503, -18534, -18538, -18540, -18535, -18475, -18538, -18553, -18544, -18543, -18544, -18533, -18559, -18532, -18540, -18535, -18475, -18543, -18540, -18559, -18540, -18475, -18559, -18534, -18534, -18475, -18535, -18540, -18553, -18542, -18544, 3359, -7847, -7921, -7845, -7925, -7843, -7926, -7846, -7935, -7842, -7924, -7844, -7936, 7589, -26356, -26274, -26354, -26286, -26357, -26275, -26359, -26279, -26353, -26280, -26360, -26285, 223, 5238, 5231, 5174, 5247, 5246, 5229, 5234, 5240, 5246, 5153, 5246, 5161, 5241, 5154, 5242, 5164, 5240, 5160, 5242, 5237, 5247, 5225, 5236, 5234, 5247, 5188, 5234, 5247, 5184, 5163, 5174, 5154, 5242, 5174, 5245, 5210, 5174, 5213, 5190, 5216, 5162, 5175, 5162, 5165, 5222, 5154, 5164, 5164, 5167, 5247, 5166, 5165, 5247, 5165, 5155, 5161, 5246, 5166, 5167, 5154, 5240, 5163, 5168, 5153, 5153, 5153, 5153, 4781, -8880, -8954, -8878, -8958, 3083, -16319, -16361, -16317, -16365, 2288, 8878, 8876, 8868, 8893, 8864, 8891, 8878, 8891, 8874};
        String strM5047 = null;
        String str2 = null;
        String strM18989 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i9 = C0050.f912;
        int i10 = C1461.f5957;
        int iM450210 = C19806.m45029("ܳ֡") ^ i10;
        int i11 = ((iM450210 ^ i9) * 26569) ^ 564859988;
        int i12 = iM450210 ^ 707828942;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        short s = 0;
        short s2 = 0;
        int i16 = 0;
        int i17 = 1223635836;
        int i18 = 0;
        short[] sArr5 = null;
        String strM9715 = null;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        while (true) {
            i17 = i12 ^ (i11 & (((i17 ^ i9) * 3533) >> 31));
            switch (i17) {
                case -2130751012:
                case 2027177994:
                    sArr5 = sArr5;
                    i = i20;
                    i2 = i21;
                    strM5047 = strM5047;
                    str = str2;
                    C3286.m9798();
                    if (RunnableC3388.f12514 < 0) {
                        str2 = str;
                        iM45029 = (C19806.m45029("۠۟") + i9) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        str = str2;
                        i4 = ((iM45029 ^ i10) * 1141) ^ (-2071006091);
                        i21 = i2;
                        i5 = -1065169825;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩷۬") + i10) * (-121);
                        i4 = ((iM45029 ^ i9) * 32099) ^ 336582609;
                        i21 = i2;
                        i5 = 1318545949;
                    }
                    int i22 = i;
                    iM11306 = iM45029;
                    strM5047 = strM5047;
                    i20 = i22;
                    short[] sArr6 = sArr5;
                    i7 = i4;
                    str2 = str;
                    sArr5 = sArr6;
                    int i23 = iM11306 ^ i5;
                    i11 = i7;
                    i12 = i23;
                    break;
                case -2033418103:
                case 1918191011:
                    sArr5 = sArr5;
                    i = i20;
                    i3 = i21;
                    strM5047 = strM5047;
                    str = str2;
                    s2 = f43355[0];
                    if (C3660.f13403 >= 0) {
                        iM45029 = C19806.m45029("۬ۢ") ^ i10;
                        i4 = ((iM45029 ^ i9) * (-2289)) ^ (-1734893090);
                        i21 = i3;
                        i5 = -2093065266;
                    } else {
                        iM45029 = C19806.m45029("ۘᩳ") ^ i10;
                        i4 = ((iM45029 ^ i9) * (-9743)) ^ (-1761731230);
                        i21 = i3;
                        i5 = -1598430723;
                    }
                    int i24 = i;
                    iM11306 = iM45029;
                    strM5047 = strM5047;
                    i20 = i24;
                    short[] sArr7 = sArr5;
                    i7 = i4;
                    str2 = str;
                    sArr5 = sArr7;
                    int i25 = iM11306 ^ i5;
                    i11 = i7;
                    i12 = i25;
                    break;
                case -1646338893:
                case -1113577978:
                    sArr5 = sArr5;
                    i = i20;
                    i6 = i21;
                    strM5047 = strM5047;
                    str = str2;
                    int i26 = s2 + s;
                    i16 = i26 * i26;
                    if (!ViewTreeObserverOnPreDrawListenerC3327.m9874()) {
                        iM45029 = ThreadFactoryC3888.m11306("֨ۖ") ^ i9;
                        i4 = ((iM45029 ^ i10) * (-7311)) ^ 2023130610;
                        i21 = i6;
                        i5 = 557021695;
                        int i27 = i;
                        iM11306 = iM45029;
                        strM5047 = strM5047;
                        i20 = i27;
                        short[] sArr8 = sArr5;
                        i7 = i4;
                        str2 = str;
                        sArr5 = sArr8;
                        int i28 = iM11306 ^ i5;
                        i11 = i7;
                        i12 = i28;
                    } else {
                        strM5047 = strM5047;
                        int iM11307 = (i9 - ThreadFactoryC3888.m11306("֫ۙ")) * 81;
                        i21 = i6;
                        i5 = 1637131759;
                        sArr = sArr5;
                        i7 = ((iM11307 ^ i10) * 20281) ^ (-727982016);
                        strM5047 = strM5047;
                        i20 = i;
                        iM11306 = iM11307;
                        str2 = str;
                        sArr5 = sArr;
                        int i29 = iM11306 ^ i5;
                        i11 = i7;
                        i12 = i29;
                    }
                    break;
                case -1473409332:
                case 1641575524:
                    sArr5 = sArr5;
                    i = i20;
                    int i30 = i21;
                    if ((i18 + i18) - i16 < 0) {
                        strM5047 = strM5047;
                        iM45029 = (C19806.m45029("ۗۖ") + i10) * 69;
                        str = str2;
                        i4 = ((iM45029 ^ i9) * 20821) ^ 1225162973;
                        i21 = i30;
                        i5 = -1295820919;
                        int i210 = i;
                        iM11306 = iM45029;
                        strM5047 = strM5047;
                        i20 = i210;
                        short[] sArr9 = sArr5;
                        i7 = i4;
                        str2 = str;
                        sArr5 = sArr9;
                        int i211 = iM11306 ^ i5;
                        i11 = i7;
                        i12 = i211;
                    } else {
                        int iM11308 = ThreadFactoryC3888.m11306("۟᩷") ^ i9;
                        i21 = i30;
                        i5 = 45349749;
                        sArr = sArr5;
                        i7 = ((iM11308 ^ i10) * 28447) ^ (-588014400);
                        strM5047 = strM5047;
                        i20 = i;
                        iM11306 = iM11308;
                        sArr5 = sArr;
                        int i212 = iM11306 ^ i5;
                        i11 = i7;
                        i12 = i212;
                    }
                    break;
                case -1378205288:
                case 560584202:
                    sArr5 = sArr5;
                    i = i20;
                    i2 = i21;
                    strM9715 = MenuItemOnMenuItemClickListenerC3244.m9715(sArr5, i, i2, i15);
                    sArr2 = f43355;
                    if (C1398.f5802 <= 0) {
                        i19 = 7;
                        strM5047 = strM5047;
                        iM45029 = (C19806.m45029("۠۟") + i9) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        str = str2;
                        i4 = ((iM45029 ^ i10) * 1141) ^ (-2071006091);
                        i21 = i2;
                        i5 = -1065169825;
                        int i213 = i;
                        iM11306 = iM45029;
                        strM5047 = strM5047;
                        i20 = i213;
                        short[] sArr10 = sArr5;
                        i7 = i4;
                        str2 = str;
                        sArr5 = sArr10;
                    } else {
                        int iM11309 = (ThreadFactoryC3888.m11306("᩷ۤ") + i10) * 95;
                        int i31 = ((iM11309 ^ i9) * 8683) ^ (-1471139894);
                        i20 = i;
                        i21 = i2;
                        iM11306 = iM11309;
                        i5 = -433768786;
                        sArr5 = sArr5;
                        i7 = i31;
                        i19 = 7;
                    }
                    int i214 = iM11306 ^ i5;
                    i11 = i7;
                    i12 = i214;
                    break;
                case -1199451093:
                case 1841556606:
                    strM18989 = C7105.m18989(sArr3, i14, i13, i15);
                    sArr4 = f43355;
                    if (C1025.f4800 >= 0) {
                        sArr5 = sArr5;
                        i = i20;
                        i2 = i21;
                        strM5047 = strM5047;
                        iM45029 = (C19806.m45029("۠۟") + i9) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        str = str2;
                        i4 = ((iM45029 ^ i10) * 1141) ^ (-2071006091);
                        i21 = i2;
                        i5 = -1065169825;
                        int i215 = i;
                        iM11306 = iM45029;
                        strM5047 = strM5047;
                        i20 = i215;
                        short[] sArr11 = sArr5;
                        i7 = i4;
                        str2 = str;
                        sArr5 = sArr11;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۜۛ") ^ i9;
                        i7 = ((iM11306 ^ i10) * (-19283)) ^ (-1332226305);
                        i5 = -1090480486;
                    }
                    int i216 = iM11306 ^ i5;
                    i11 = i7;
                    i12 = i216;
                    break;
                case -1096946470:
                case -401902056:
                    str2 = "";
                    sArr3 = f43355;
                    i14 = 10;
                    i13 = 5;
                    if (C3660.f13403 >= 0) {
                        sArr5 = sArr5;
                        i = i20;
                        i2 = i21;
                        strM5047 = strM5047;
                        iM45029 = (C19806.m45029("۠۟") + i9) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        str = str2;
                        i4 = ((iM45029 ^ i10) * 1141) ^ (-2071006091);
                        i21 = i2;
                        i5 = -1065169825;
                        int i217 = i;
                        iM11306 = iM45029;
                        strM5047 = strM5047;
                        i20 = i217;
                        short[] sArr12 = sArr5;
                        i7 = i4;
                        str2 = str;
                        sArr5 = sArr12;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩵ܰ") + i9) * (-11);
                        i7 = ((iM11306 ^ i10) * 32127) ^ 1225496542;
                        i5 = 42336893;
                    }
                    int i218 = iM11306 ^ i5;
                    i11 = i7;
                    i12 = i218;
                    break;
                case -1073185907:
                case 656574045:
                    C3577.m10565();
                    if (ThreadFactoryC3888.f14547 > 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܺ۫") + i10) * 91;
                        i7 = ((iM11306 ^ i9) * 9089) ^ 1045735149;
                        i5 = 420059102;
                    } else {
                        i = i20;
                        i3 = i21;
                        str = str2;
                        iM45029 = C19806.m45029("۬ۢ") ^ i10;
                        i4 = ((iM45029 ^ i9) * (-2289)) ^ (-1734893090);
                        i21 = i3;
                        i5 = -2093065266;
                        int i219 = i;
                        iM11306 = iM45029;
                        strM5047 = strM5047;
                        i20 = i219;
                        short[] sArr13 = sArr5;
                        i7 = i4;
                        str2 = str;
                        sArr5 = sArr13;
                    }
                    int i2110 = iM11306 ^ i5;
                    i11 = i7;
                    i12 = i2110;
                    break;
                case -614745317:
                case 648621807:
                    C3577.m10565();
                    iM11306 = (ThreadFactoryC3888.m11306("ܺ۫") + i10) * 91;
                    i7 = ((iM11306 ^ i9) * 9089) ^ 1045735149;
                    i5 = 420059102;
                    int i2111 = iM11306 ^ i5;
                    i11 = i7;
                    i12 = i2111;
                    break;
                case -410473261:
                case 468563287:
                    i3 = 6;
                    if (CallableC1627.m5507() != 0) {
                        i = 1;
                        str = str2;
                        iM45029 = C19806.m45029("۬ۢ") ^ i10;
                        i4 = ((iM45029 ^ i9) * (-2289)) ^ (-1734893090);
                        i21 = i3;
                        i5 = -2093065266;
                        int i2112 = i;
                        iM11306 = iM45029;
                        strM5047 = strM5047;
                        i20 = i2112;
                        short[] sArr14 = sArr5;
                        i7 = i4;
                        str2 = str;
                        sArr5 = sArr14;
                    } else {
                        iM11306 = (i9 - C19806.m45029("ܳۘ")) * (-57);
                        i7 = ((iM11306 ^ i10) * (-18397)) ^ 1279590177;
                        i5 = 736044440;
                        i20 = 1;
                        i21 = 6;
                    }
                    int i2113 = iM11306 ^ i5;
                    i11 = i7;
                    i12 = i2113;
                    break;
                case -215297018:
                case 1548700522:
                    f43351 = new String[]{str2, strM18989, C1189.m4365(sArr4, 15, 7, i15), strM9715, strM5047};
                    return;
                case -171252266:
                case 1280116982:
                    f43354 = new SecureRandom();
                    sArr5 = f43355;
                    if (C2332.f8260) {
                        iM11306 = ThreadFactoryC3888.m11306("ۛܺ") ^ i9;
                        sArr5 = sArr5;
                        i7 = ((iM11306 ^ i10) * (-23645)) ^ (-243546663);
                        i5 = 1472722699;
                    } else {
                        str = str2;
                        i = i20;
                        i2 = i21;
                        strM5047 = strM5047;
                        iM45029 = (ThreadFactoryC3888.m11306("᩷۬") + i10) * (-121);
                        i4 = ((iM45029 ^ i9) * 32099) ^ 336582609;
                        i21 = i2;
                        i5 = 1318545949;
                        int i2114 = i;
                        iM11306 = iM45029;
                        strM5047 = strM5047;
                        i20 = i2114;
                        short[] sArr15 = sArr5;
                        i7 = i4;
                        str2 = str;
                        sArr5 = sArr15;
                    }
                    int i2115 = iM11306 ^ i5;
                    i11 = i7;
                    i12 = i2115;
                    break;
                case -119786811:
                case 1679570060:
                    s = 15553;
                    if (C1937.f7317 >= 0) {
                        sArr5 = sArr5;
                        i = i20;
                        i2 = i21;
                        strM5047 = strM5047;
                        str = str2;
                        iM45029 = (ThreadFactoryC3888.m11306("᩷۬") + i10) * (-121);
                        i4 = ((iM45029 ^ i9) * 32099) ^ 336582609;
                        i21 = i2;
                        i5 = 1318545949;
                        int i2116 = i;
                        iM11306 = iM45029;
                        strM5047 = strM5047;
                        i20 = i2116;
                        short[] sArr16 = sArr5;
                        i7 = i4;
                        str2 = str;
                        sArr5 = sArr16;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۧ۬") ^ i9;
                        i7 = ((iM11306 ^ i10) * 26797) ^ 583628084;
                        i5 = -242588928;
                    }
                    int i2117 = iM11306 ^ i5;
                    i11 = i7;
                    i12 = i2117;
                    break;
                case 275480485:
                case 2013903061:
                    if (C3660.f13403 < 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܺ۫") + i10) * 91;
                        i7 = ((iM11306 ^ i9) * 9089) ^ 1045735149;
                        i5 = 420059102;
                    } else {
                        sArr5 = sArr5;
                        i = i20;
                        i2 = i21;
                        strM5047 = strM5047;
                        str = str2;
                        str2 = str;
                        iM45029 = (C19806.m45029("۠۟") + i9) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        str = str2;
                        i4 = ((iM45029 ^ i10) * 1141) ^ (-2071006091);
                        i21 = i2;
                        i5 = -1065169825;
                        int i2118 = i;
                        iM11306 = iM45029;
                        strM5047 = strM5047;
                        i20 = i2118;
                        short[] sArr17 = sArr5;
                        i7 = i4;
                        str2 = str;
                        sArr5 = sArr17;
                    }
                    int i2119 = iM11306 ^ i5;
                    i11 = i7;
                    i12 = i2119;
                    break;
                case 685889470:
                case 1848746597:
                    strM5047 = C1460.m5047(sArr2, i19, 3, i15);
                    if (C1025.f4800 >= 0) {
                        sArr5 = sArr5;
                        i = i20;
                        i6 = i21;
                        str = str2;
                        int iM113010 = (i9 - ThreadFactoryC3888.m11306("֫ۙ")) * 81;
                        i21 = i6;
                        i5 = 1637131759;
                        sArr = sArr5;
                        i7 = ((iM113010 ^ i10) * 20281) ^ (-727982016);
                        strM5047 = strM5047;
                        i20 = i;
                        iM11306 = iM113010;
                        str2 = str;
                        sArr5 = sArr;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩷᩸") ^ i10) * 21;
                        i7 = ((iM11306 ^ i9) * 21477) ^ 321813583;
                        i5 = -1469316494;
                    }
                    int i21110 = iM11306 ^ i5;
                    i11 = i7;
                    i12 = i21110;
                    break;
                case 1005845507:
                case 1632095363:
                    i8 = 42207;
                    iM11306 = (C19806.m45029("᩷ۜ") ^ i10) * 95;
                    i5 = -2121168980;
                    i15 = i8;
                    i7 = ((iM11306 ^ i9) * (-21521)) ^ 649340055;
                    int i21111 = iM11306 ^ i5;
                    i11 = i7;
                    i12 = i21111;
                    break;
                case 1163752166:
                case 1318686190:
                    i8 = 38467;
                    iM11306 = (C19806.m45029("᩷ۜ") ^ i10) * 95;
                    i5 = -2121168980;
                    i15 = i8;
                    i7 = ((iM11306 ^ i9) * (-21521)) ^ 649340055;
                    int i21112 = iM11306 ^ i5;
                    i11 = i7;
                    i12 = i21112;
                    break;
                case 1967560514:
                case 2084340816:
                    C3743.m10966();
                    C3577.m10565();
                    throw new RuntimeException();
                default:
                    sArr5 = sArr5;
                    i = i20;
                    i2 = i21;
                    strM5047 = strM5047;
                    str = str2;
                    i18 = (s2 * s2) + 241895809;
                    if (C2477.m7593() >= 0) {
                        str2 = str;
                        iM45029 = (C19806.m45029("۠۟") + i9) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        str = str2;
                        i4 = ((iM45029 ^ i10) * 1141) ^ (-2071006091);
                        i21 = i2;
                        i5 = -1065169825;
                    } else {
                        iM45029 = (i10 - ThreadFactoryC3888.m11306("ۢۤ")) * (-35);
                        i4 = ((iM45029 ^ i9) * 28039) ^ 532892474;
                        i21 = i2;
                        i5 = -1952523303;
                    }
                    int i21113 = i;
                    iM11306 = iM45029;
                    strM5047 = strM5047;
                    i20 = i21113;
                    short[] sArr18 = sArr5;
                    i7 = i4;
                    str2 = str;
                    sArr5 = sArr18;
                    int i21114 = iM11306 ^ i5;
                    i11 = i7;
                    i12 = i21114;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C15759 m32162(String str) {
        int i = 515182900;
        int i2 = C3535.f13026;
        int i3 = C1977.f7413;
        int iM11306 = ThreadFactoryC3888.m11306("۬ۢ") ^ i3;
        int i4 = ((iM11306 ^ i2) * 61) ^ (-147236549);
        int i5 = -1587120497;
        while (true) {
            i = ((((i ^ i2) * 7207) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -1128231010:
                case 1354754753:
                    C0526.m2437();
                    if (!C0526.f2219) {
                        iM11306 = ThreadFactoryC3888.m11306("۠۟") ^ i3;
                        i4 = ((iM11306 ^ i2) * 27809) ^ (-753681674);
                        i5 = 1273861171;
                    } else {
                        iM11306 = (C19806.m45029("ۗۡ") ^ i3) * (-125);
                        i4 = ((iM11306 ^ i2) * (-32431)) ^ (-325080130);
                        i5 = -842116486;
                    }
                    break;
                case -1058151317:
                case 1050823984:
                    ThreadFactoryC3888.m11300();
                    C0962.m3746();
                    return null;
                case -813007302:
                case 1829754440:
                    C1977.m6356();
                    if (C1066.f4915 <= 0) {
                        iM11306 = C19806.m45029("۠ᩴ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 11495) ^ 522938070;
                        i5 = 257898826;
                    } else {
                        iM11306 = (C19806.m45029("ۗۡ") ^ i3) * (-125);
                        i4 = ((iM11306 ^ i2) * (-32431)) ^ (-325080130);
                        i5 = -842116486;
                    }
                    break;
                case -211601795:
                case 1274325823:
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        if (C1148.m4232() > 0) {
                            if (RunnableC0195.f1321 < 0) {
                                if (!C0797.f3386) {
                                    if (C1148.m4232() > 0) {
                                        if (RunnableC1895.f7152) {
                                            if (C0629.f2722 > 0) {
                                                if (C7105.f23796 < 0) {
                                                    if (C1398.f5802 > 0) {
                                                        Application applicationM4826 = C1377.m4826();
                                                        if (!C19806.m45024()) {
                                                            return new C15759(new File(applicationM4826.getNoBackupFilesDir(), str));
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    iM11306 = (C19806.m45029("ۗۡ") ^ i3) * (-125);
                                    i4 = ((iM11306 ^ i2) * (-32431)) ^ (-325080130);
                                    i5 = -842116486;
                                }
                                iM11306 = C19806.m45029("ᩳۜ") ^ i2;
                                i4 = ((iM11306 ^ i3) * (-931)) ^ (-790852424);
                                i5 = 854380702;
                            }
                            iM11306 = ThreadFactoryC3888.m11306("֡֫") ^ i2;
                            i4 = ((iM11306 ^ i3) * (-6047)) ^ 1269835712;
                            i5 = -1586127713;
                        }
                        iM11306 = ThreadFactoryC3888.m11306("۠۟") ^ i3;
                        i4 = ((iM11306 ^ i2) * 27809) ^ (-753681674);
                        i5 = 1273861171;
                    } else {
                        iM11306 = C19806.m45029("۠ᩴ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 11495) ^ 522938070;
                        i5 = 257898826;
                    }
                    break;
                case 434688584:
                case 1175404634:
                    C1419.m4973();
                    if (C3722.f13525 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֡֫") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-6047)) ^ 1269835712;
                        i5 = -1586127713;
                    } else {
                        iM11306 = (C19806.m45029("ۗۡ") ^ i3) * (-125);
                        i4 = ((iM11306 ^ i2) * (-32431)) ^ (-325080130);
                        i5 = -842116486;
                    }
                    break;
                default:
                    C0629.m2907();
                    C1875.m6086();
                    iM11306 = (C19806.m45029("ۗۡ") ^ i3) * (-125);
                    i4 = ((iM11306 ^ i2) * (-32431)) ^ (-325080130);
                    i5 = -842116486;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static String m32141() {
        byte[] bArr = null;
        SecureRandom secureRandom = null;
        int i = 1221237888;
        int i2 = C2871.f10837;
        int i3 = C3722.f13525;
        int iM45029 = (C19806.m45029("ܿۡ") + i2) * 95;
        int i4 = ((iM45029 ^ i3) * 5765) ^ (-1287952303);
        int i5 = -1301184291;
        while (true) {
            i = ((((i ^ i3) * (-31547)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -1938492525:
                case 1267436786:
                    if (C0526.f2219) {
                        iM45029 = (ThreadFactoryC3888.m11306("۬ۗ") + i2) * 9;
                        i4 = ((iM45029 ^ i3) * 6393) ^ 106478464;
                        i5 = 337102909;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܰۤ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 23479) ^ 966966456;
                        i5 = -208603334;
                    }
                    break;
                case -1859987243:
                case -1859265966:
                    if (C2249.f8050 >= 0) {
                        iM45029 = (C19806.m45029("᩶ᩳ") + i3) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM45029 ^ i2) * (-30207)) ^ 890685317;
                        i5 = 1358564157;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۛ֫") + i2) * (-67);
                        i4 = ((iM45029 ^ i3) * (-17375)) ^ (-807728719);
                        i5 = 589186842;
                    }
                    break;
                case -1816168650:
                case -719500305:
                    bArr = new byte[32];
                    if (RunnableC1895.f7152) {
                        iM45029 = ThreadFactoryC3888.m11306("ܿ᩻") ^ i3;
                        i4 = ((iM45029 ^ i2) * 30245) ^ 98780115;
                        i5 = -1458946219;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۨۧ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-4267)) ^ (-644347992);
                        i5 = 889626639;
                    }
                    break;
                case -1681379801:
                case -1322835528:
                    secureRandom = f43354;
                    if (C2704.f10408) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۢ᩶") + i2) * 31;
                        i4 = ((iM45029 ^ i3) * (-3365)) ^ (-1460283134);
                        i5 = 2104073468;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۨۧ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-4267)) ^ (-644347992);
                        i5 = 889626639;
                    }
                    break;
                case -1624626448:
                case 1683715150:
                    if (C0671.m3008() >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۨۧ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-4267)) ^ (-644347992);
                        i5 = 889626639;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩵ۤ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-14943)) ^ (-1574081029);
                        i5 = 197911250;
                    }
                    break;
                case -1243092969:
                case 463692736:
                    if (C7105.f23796 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۨۧ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-4267)) ^ (-644347992);
                        i5 = 889626639;
                    } else {
                        iM45029 = (i3 - C19806.m45029("֡ܰ")) * (-43);
                        i4 = ((iM45029 ^ i2) * (-24037)) ^ 573411182;
                        i5 = 583465109;
                    }
                    break;
                case -946249800:
                case -595082813:
                    C1937.m6279();
                    RunnableC0195.m1431();
                    iM45029 = (C19806.m45029("᩶ᩳ") + i3) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                    i4 = ((iM45029 ^ i2) * (-30207)) ^ 890685317;
                    i5 = 1358564157;
                    break;
                case -851436065:
                case 1584375698:
                    if (C2332.m7079() <= 0) {
                        iM45029 = (i3 - C19806.m45029("۟ᩴ")) * 55;
                        i4 = ((iM45029 ^ i2) * (-9919)) ^ 1860180751;
                        i5 = -491822580;
                    } else {
                        iM45029 = C19806.m45029("֨۬") ^ i2;
                        i4 = ((iM45029 ^ i3) * 20195) ^ (-819627379);
                        i5 = 1969879920;
                    }
                    break;
                case -700000932:
                case 880773632:
                    secureRandom.nextBytes(bArr);
                    return Base64.encodeToString(bArr, 11);
                case -280629313:
                case -153476785:
                    C3577.m10565();
                    if (C3722.f13525 > 0) {
                        iM45029 = C19806.m45029("֨۬") ^ i2;
                        i4 = ((iM45029 ^ i3) * 20195) ^ (-819627379);
                        i5 = 1969879920;
                    } else {
                        iM45029 = (C19806.m45029("᩶ᩳ") + i3) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM45029 ^ i2) * (-30207)) ^ 890685317;
                        i5 = 1358564157;
                    }
                    break;
                case 116212657:
                case 166481366:
                    if (C1461.m5080()) {
                        iM45029 = (i3 - C19806.m45029("۟ᩴ")) * 55;
                        i4 = ((iM45029 ^ i2) * (-9919)) ^ 1860180751;
                        i5 = -491822580;
                    } else {
                        iM45029 = (i3 - C19806.m45029("֨᩶")) * 109;
                        i4 = ((iM45029 ^ i2) * (-12173)) ^ 725353192;
                        i5 = -1137229231;
                    }
                    break;
                case 276319018:
                case 436527263:
                    if (C3722.f13525 > 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("۬ۗ") + i2) * 9;
                        i4 = ((iM45029 ^ i3) * 6393) ^ 106478464;
                        i5 = 337102909;
                    } else {
                        iM45029 = (i3 - C19806.m45029("۟ᩴ")) * 55;
                        i4 = ((iM45029 ^ i2) * (-9919)) ^ 1860180751;
                        i5 = -491822580;
                    }
                    break;
                case 783740423:
                case 1163530501:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۨۧ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-4267)) ^ (-644347992);
                        i5 = 889626639;
                    } else {
                        iM45029 = C19806.m45029("ᩳ᩹") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-9431)) ^ (-3721937);
                        i5 = -1095411813;
                    }
                    break;
                case 990384149:
                case 1246796109:
                    if (C7105.f23796 >= 0) {
                        iM45029 = C19806.m45029("֨۬") ^ i2;
                        i4 = ((iM45029 ^ i3) * 20195) ^ (-819627379);
                        i5 = 1969879920;
                    } else {
                        iM45029 = C19806.m45029("ۨۤ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-6233)) ^ 479337816;
                        i5 = -693388738;
                    }
                    break;
                case 1096810498:
                case 1834912564:
                    if (C0278.f1572 <= 0) {
                        iM45029 = (i3 - C19806.m45029("۟ᩴ")) * 55;
                        i4 = ((iM45029 ^ i2) * (-9919)) ^ 1860180751;
                        i5 = -491822580;
                    } else {
                        iM45029 = C19806.m45029("᩶ۢ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-9895)) ^ (-1641051715);
                        i5 = 118800823;
                    }
                    break;
                default:
                    C1066.m4023();
                    C1668.m5583();
                    return null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x043b A[PHI: r2 r3 r5 r21
      0x043b: PHI (r2v4 l.֨۠᩺) = (r2v2 l.֨۠᩺), (r2v3 l.֨۠᩺), (r2v2 l.֨۠᩺) binds: [B:106:0x0439, B:83:0x0316, B:18:0x0087] A[DONT_GENERATE, DONT_INLINE]
      0x043b: PHI (r3v3 long) = (r3v1 long), (r3v2 long), (r3v1 long) binds: [B:106:0x0439, B:83:0x0316, B:18:0x0087] A[DONT_GENERATE, DONT_INLINE]
      0x043b: PHI (r5v4 java.lang.String) = (r5v2 java.lang.String), (r5v3 java.lang.String), (r5v2 java.lang.String) binds: [B:106:0x0439, B:83:0x0316, B:18:0x0087] A[DONT_GENERATE, DONT_INLINE]
      0x043b: PHI (r21v16 int) = (r21v6 int), (r21v12 int), (r21v19 int) binds: [B:106:0x0439, B:83:0x0316, B:18:0x0087] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x023b A[PHI: r21
      0x023b: PHI (r21v29 int) = (r21v27 int), (r21v30 int) binds: [B:63:0x0224, B:55:0x01d1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m32151(C1313 c1313, String str, String str2, boolean z) throws IOException {
        int iM45029;
        int i;
        int i2;
        int iM450210;
        int i3;
        int i4;
        int iM11306;
        int i5;
        int i6;
        int iM450211;
        int i7;
        String str3 = str2;
        int i8 = C0629.f2722;
        int i9 = RunnableC1606.f6488;
        int iM450212 = C19806.m45029("ܰ֡") ^ i8;
        int i10 = ((iM450212 ^ i9) * 25029) ^ 1306046510;
        String strM7601 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i11 = iM450212 ^ (-800837517);
        int iM4684 = 0;
        boolean z2 = false;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        short s = 0;
        int i18 = 935046323;
        short s2 = 0;
        long jM4687 = 0;
        C1003 c1003M32145 = null;
        while (true) {
            i18 = i11 ^ (i10 & (((i18 ^ i9) * 2881) >> 31));
            switch (i18) {
                case -1977722522:
                case -992259706:
                    int i19 = i14;
                    m32164(c1003M32145);
                    if (RunnableC1564.m5342(m32146())) {
                        iM450211 = ThreadFactoryC3888.m11306("ۡ᩷") ^ i9;
                        i5 = ((iM450211 ^ i8) * 27885) ^ (-333877355);
                        i7 = -687911739;
                    } else {
                        iM450211 = (C19806.m45029("۠۫") ^ i8) * (-79);
                        i5 = ((iM450211 ^ i9) * 317) ^ 759281792;
                        i7 = 328005738;
                    }
                    int i20 = iM450211 ^ i7;
                    i14 = i19;
                    i11 = i20;
                    i10 = i5;
                    break;
                case -1926278199:
                case -231391390:
                    i17 = 31317;
                    iM450210 = ThreadFactoryC3888.m11306("ۘۧ") ^ i9;
                    i3 = ((iM450210 ^ i8) * (-979)) ^ (-358318130);
                    i4 = -1610573314;
                    int i21 = iM450210 ^ i4;
                    i10 = i3;
                    i14 = i14;
                    i11 = i21;
                    str3 = str2;
                    break;
                case -1888753658:
                case -1294093605:
                    i14 = i14;
                    i12 = 68;
                    i13 = 3;
                    if (!RunnableC1895.f7152) {
                        iM450210 = (ThreadFactoryC3888.m11306("ܽܿ") ^ i9) * (-109);
                        i3 = ((iM450210 ^ i8) * 4243) ^ (-1724214331);
                        i4 = -2110423936;
                        int i22 = iM450210 ^ i4;
                        i10 = i3;
                        i14 = i14;
                        i11 = i22;
                        str3 = str2;
                    } else {
                        iM45029 = C19806.m45029("᩷ۤ") ^ i8;
                        i = ((iM45029 ^ i9) * 20915) ^ 1239047032;
                        i2 = -2002637262;
                        i10 = i;
                        i14 = i14;
                        i11 = iM45029 ^ i2;
                    }
                    break;
                case -1874241798:
                case 274739409:
                    short[] sArr3 = f43355;
                    if (C2871.f10837 < 0) {
                        throw new IOException(MenuItemOnMenuItemClickListenerC3244.m9715(sArr3, 47, 21, i17));
                    }
                    iM450210 = (C19806.m45029("֫ᩴ") + i8) * (-93);
                    i3 = ((iM450210 ^ i9) * (-1557)) ^ (-2116639934);
                    i4 = -558736431;
                    int i23 = iM450210 ^ i4;
                    i10 = i3;
                    i14 = i14;
                    i11 = i23;
                    str3 = str2;
                    break;
                case -1680947781:
                case 658906720:
                    i14 = i14;
                    c1003M32145.f4682 = C2871.m8640(sArr2, i12, i13, i17);
                    c1003M32145.f4687 = str;
                    if (C0216.f1393 != 0) {
                        iM45029 = (i8 - ThreadFactoryC3888.m11306("ܳ᩸")) * 45;
                        i = ((iM45029 ^ i9) * 11655) ^ (-30921356);
                        i2 = 356202719;
                    } else {
                        iM45029 = C19806.m45029("᩸ۨ") ^ i9;
                        i = ((iM45029 ^ i8) * 4579) ^ (-941708764);
                        i2 = 1707783374;
                    }
                    i10 = i;
                    i14 = i14;
                    i11 = iM45029 ^ i2;
                    break;
                case -1636912313:
                case 886669358:
                    int i24 = s + s2;
                    i14 = i24 * i24;
                    i15 = s * s;
                    i16 = 97081609;
                    if (ViewGroupOnHierarchyChangeListenerC1916.m6233() != 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩹ܶ") + i9) * (-5);
                        i5 = ((iM11306 ^ i8) * (-25115)) ^ (-2038056544);
                        i6 = 810456886;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۧ᩵") ^ i9;
                        i5 = ((iM11306 ^ i8) * (-32133)) ^ (-575010860);
                        i6 = -449330721;
                    }
                    i11 = iM11306 ^ i6;
                    str3 = str2;
                    i10 = i5;
                    break;
                case -1614174109:
                case 334946887:
                    i14 = i14;
                    if (str3 != null) {
                        iM45029 = (i9 - ThreadFactoryC3888.m11306("ᩳܿ")) * (-55);
                        i = ((iM45029 ^ i8) * 28417) ^ 1659506102;
                        i2 = -829568944;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۛܳ") ^ i9;
                        i = ((iM45029 ^ i8) * (-7927)) ^ 217795111;
                        i2 = -693253376;
                    }
                    i10 = i;
                    i14 = i14;
                    i11 = iM45029 ^ i2;
                    break;
                case -1605632471:
                case 1278130048:
                    i14 = i14;
                    z2 = true;
                    if (iM4684 < 1) {
                        iM450210 = (ThreadFactoryC3888.m11306("֨ܿ") ^ i8) * 39;
                        i3 = ((iM450210 ^ i9) * 32593) ^ 970460326;
                        i4 = -442980748;
                        int i25 = iM450210 ^ i4;
                        i10 = i3;
                        i14 = i14;
                        i11 = i25;
                        str3 = str2;
                    } else {
                        iM45029 = C19806.m45029("ܺۢ") ^ i8;
                        i = ((iM45029 ^ i9) * (-30991)) ^ 1943829502;
                        i2 = -1255305588;
                        i10 = i;
                        i14 = i14;
                        i11 = iM45029 ^ i2;
                    }
                    break;
                case -1605110450:
                case 63998004:
                    i14 = i14;
                    if (jM4687 >= c1003M32145.f4686) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۛ᩹") ^ i8) * (-23);
                        i = ((iM45029 ^ i9) * 25375) ^ (-1145130998);
                        i2 = 1391954573;
                    } else {
                        iM45029 = (i8 - C19806.m45029("֡ۚ")) * (-97);
                        i = ((iM45029 ^ i9) * (-26259)) ^ 901786978;
                        i2 = -286894198;
                    }
                    i10 = i;
                    i14 = i14;
                    i11 = iM45029 ^ i2;
                    break;
                case -1569943691:
                case 285858724:
                    C1419.m4973();
                    if (C1066.f4915 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩹ܶ") + i9) * (-5);
                        i5 = ((iM11306 ^ i8) * (-25115)) ^ (-2038056544);
                        i6 = 810456886;
                        i11 = iM11306 ^ i6;
                        str3 = str2;
                        i10 = i5;
                    } else {
                        iM450210 = (C19806.m45029("֫ᩴ") + i8) * (-93);
                        i3 = ((iM450210 ^ i9) * (-1557)) ^ (-2116639934);
                        i4 = -558736431;
                        int i26 = iM450210 ^ i4;
                        i10 = i3;
                        i14 = i14;
                        i11 = i26;
                        str3 = str2;
                    }
                    break;
                case -1505576800:
                case 457817834:
                    i14 = i14;
                    if (z) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۛ᩹") ^ i8) * (-23);
                        i = ((iM45029 ^ i9) * 25375) ^ (-1145130998);
                        i2 = 1391954573;
                    } else {
                        iM45029 = C19806.m45029("᩸ۛ") ^ i9;
                        i = ((iM45029 ^ i8) * (-3767)) ^ (-1152817843);
                        i2 = -335256177;
                    }
                    i10 = i;
                    i14 = i14;
                    i11 = iM45029 ^ i2;
                    break;
                case -1365966845:
                case 906967899:
                    i14 = i14;
                    if (!m32161(strM7601)) {
                        iM450210 = (ThreadFactoryC3888.m11306("֨ܿ") ^ i8) * 39;
                        i3 = ((iM450210 ^ i9) * 32593) ^ 970460326;
                        i4 = -442980748;
                        int i27 = iM450210 ^ i4;
                        i10 = i3;
                        i14 = i14;
                        i11 = i27;
                        str3 = str2;
                    } else {
                        iM45029 = (C19806.m45029("᩵۬") ^ i9) * (-117);
                        i = ((iM45029 ^ i8) * (-31517)) ^ 1342266218;
                        i2 = -1008423348;
                        i10 = i;
                        i14 = i14;
                        i11 = iM45029 ^ i2;
                    }
                    break;
                case -1261917061:
                case 182511465:
                    i14 = i14;
                    int i28 = i15 + i16;
                    if (i14 - (i28 + i28) > 0) {
                        iM450210 = (C19806.m45029("ܳۡ") ^ i9) * (-27);
                        i3 = ((iM450210 ^ i8) * (-20793)) ^ 2068276109;
                        i4 = 962759335;
                    } else {
                        iM450210 = ThreadFactoryC3888.m11306("ۡ֫") ^ i8;
                        i3 = ((iM450210 ^ i9) * (-15771)) ^ (-1079338969);
                        i4 = -165764511;
                    }
                    int i29 = iM450210 ^ i4;
                    i10 = i3;
                    i14 = i14;
                    i11 = i29;
                    str3 = str2;
                    break;
                case -1246713498:
                case -445536177:
                    i17 = 7894;
                    iM450210 = ThreadFactoryC3888.m11306("ۘۧ") ^ i9;
                    i3 = ((iM450210 ^ i8) * (-979)) ^ (-358318130);
                    i4 = -1610573314;
                    int i210 = iM450210 ^ i4;
                    i10 = i3;
                    i14 = i14;
                    i11 = i210;
                    str3 = str2;
                    break;
                case -1210104228:
                case -748462814:
                    i14 = i14;
                    c1003M32145.f4685 = "";
                    c1003M32145.f4681 = str3;
                    c1003M32145.f4684 = z2;
                    iM45029 = ThreadFactoryC3888.m11306("ۛܳ") ^ i9;
                    i = ((iM45029 ^ i8) * (-7927)) ^ 217795111;
                    i2 = -693253376;
                    i10 = i;
                    i14 = i14;
                    i11 = iM45029 ^ i2;
                    break;
                case -1204949506:
                case 1626748225:
                    CallableC1627.m5507();
                    iM450210 = (C19806.m45029("֫ᩴ") + i8) * (-93);
                    i3 = ((iM450210 ^ i9) * (-1557)) ^ (-2116639934);
                    i4 = -558736431;
                    int i211 = iM450210 ^ i4;
                    i10 = i3;
                    i14 = i14;
                    i11 = i211;
                    str3 = str2;
                    break;
                case -1020590906:
                case 115490313:
                    i14 = i14;
                    if (RunnableC1564.m5345()) {
                        iM450210 = (i8 - C19806.m45029("֡۠")) * 11;
                        i3 = ((iM450210 ^ i9) * 11939) ^ (-1183439352);
                        i4 = 814245658;
                    } else {
                        iM450210 = C19806.m45029("᩺ۜ") ^ i8;
                        i3 = ((iM450210 ^ i9) * 14779) ^ 433607429;
                        i4 = -38177345;
                    }
                    int i212 = iM450210 ^ i4;
                    i10 = i3;
                    i14 = i14;
                    i11 = i212;
                    str3 = str2;
                    break;
                case -447854003:
                case 1755230792:
                    C1189.m4368();
                    if (C1937.m6279() < 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩹ܶ") + i9) * (-5);
                        i5 = ((iM11306 ^ i8) * (-25115)) ^ (-2038056544);
                        i6 = 810456886;
                        i11 = iM11306 ^ i6;
                        str3 = str2;
                    } else {
                        int iM11307 = ThreadFactoryC3888.m11306("۠ܰ") ^ i9;
                        i5 = ((iM11307 ^ i8) * 16125) ^ 887845325;
                        i11 = iM11307 ^ 1304135165;
                    }
                    i10 = i5;
                    break;
                case -270450507:
                case 1667928974:
                    if (C2249.f8050 >= 0) {
                        i14 = i14;
                        iM450210 = (i8 - C19806.m45029("֡۠")) * 11;
                        i3 = ((iM450210 ^ i9) * 11939) ^ (-1183439352);
                        i4 = 814245658;
                        int i213 = iM450210 ^ i4;
                        i10 = i3;
                        i14 = i14;
                        i11 = i213;
                        str3 = str2;
                    }
                    iM450210 = (C19806.m45029("֫ᩴ") + i8) * (-93);
                    i3 = ((iM450210 ^ i9) * (-1557)) ^ (-2116639934);
                    i4 = -558736431;
                    int i214 = iM450210 ^ i4;
                    i10 = i3;
                    i14 = i14;
                    i11 = i214;
                    str3 = str2;
                    break;
                case -98542815:
                case 1935509963:
                    i14 = i14;
                    iM4684 = c1313.m4684();
                    if (jM4687 > 0) {
                        iM450210 = ThreadFactoryC3888.m11306("ᩴۘ") ^ i9;
                        i3 = ((iM450210 ^ i8) * (-20099)) ^ 117835328;
                        i4 = 1094839359;
                    } else {
                        iM450210 = (ThreadFactoryC3888.m11306("֨ܿ") ^ i8) * 39;
                        i3 = ((iM450210 ^ i9) * 32593) ^ 970460326;
                        i4 = -442980748;
                    }
                    int i215 = iM450210 ^ i4;
                    i10 = i3;
                    i14 = i14;
                    i11 = i215;
                    str3 = str2;
                    break;
                case 178514807:
                case 826151766:
                    i14 = i14;
                    s = sArr[46];
                    s2 = 9853;
                    if (CallableC1627.f6528) {
                        iM450210 = C19806.m45029("ᩳۡ") ^ i8;
                        i3 = ((iM450210 ^ i9) * (-1665)) ^ (-393323193);
                        i4 = 666200612;
                    } else {
                        iM450210 = ThreadFactoryC3888.m11306("֡ܳ") ^ i9;
                        i3 = ((iM450210 ^ i8) * (-4521)) ^ (-1094239883);
                        i4 = -1610861574;
                    }
                    int i216 = iM450210 ^ i4;
                    i10 = i3;
                    i14 = i14;
                    i11 = i216;
                    str3 = str2;
                    break;
                case 322434165:
                case 1203545246:
                    throw new IOException(C1875.m6105(f43355, 90, 31, i17));
                case 684637639:
                case 1881886864:
                    RunnableC1895.m6170();
                    if (C3535.m10431() <= 0) {
                        i14 = i14;
                        iM45029 = (i8 - ThreadFactoryC3888.m11306("ܳ᩸")) * 45;
                        i = ((iM45029 ^ i9) * 11655) ^ (-30921356);
                        i2 = 356202719;
                        i10 = i;
                        i14 = i14;
                        i11 = iM45029 ^ i2;
                    } else {
                        i14 = i14;
                        iM450210 = (ThreadFactoryC3888.m11306("ܽܿ") ^ i9) * (-109);
                        i3 = ((iM450210 ^ i8) * 4243) ^ (-1724214331);
                        i4 = -2110423936;
                        int i217 = iM450210 ^ i4;
                        i10 = i3;
                        i14 = i14;
                        i11 = i217;
                        str3 = str2;
                    }
                    break;
                case 746159024:
                case 1339528233:
                    i14 = i14;
                    c1003M32145 = m32145(AbstractC0464.m2312());
                    jM4687 = c1313.m4687();
                    strM7601 = C2477.m7601(c1313);
                    if (RunnableC3388.f12514 >= 0) {
                        iM450210 = (i8 - C19806.m45029("֡۠")) * 11;
                        i3 = ((iM450210 ^ i9) * 11939) ^ (-1183439352);
                        i4 = 814245658;
                    } else {
                        iM450210 = (ThreadFactoryC3888.m11306("۬ۡ") ^ i8) * 19;
                        i3 = ((iM450210 ^ i9) * (-5781)) ^ (-524586237);
                        i4 = 40078824;
                    }
                    int i218 = iM450210 ^ i4;
                    i10 = i3;
                    i14 = i14;
                    i11 = i218;
                    str3 = str2;
                    break;
                case 754258012:
                case 958952875:
                    return;
                case 782625846:
                case 1300481185:
                    C1460.m5050();
                    C3660.m10791();
                    return;
                case 964347488:
                case 1244226179:
                    i14 = i14;
                    c1003M32145.f4686 = jM4687;
                    c1003M32145.f4688 = strM7601;
                    c1003M32145.f4683 = iM4684;
                    sArr2 = f43355;
                    if (CallableC1627.m5507() == 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۢ۫") ^ i8;
                        i = ((iM45029 ^ i9) * (-3963)) ^ (-2083371788);
                        i2 = -1677400949;
                        i10 = i;
                        i14 = i14;
                        i11 = iM45029 ^ i2;
                    } else {
                        i14 = i14;
                        iM11306 = (ThreadFactoryC3888.m11306("᩹ܶ") + i9) * (-5);
                        i5 = ((iM11306 ^ i8) * (-25115)) ^ (-2038056544);
                        i6 = 810456886;
                        i11 = iM11306 ^ i6;
                        str3 = str2;
                        i10 = i5;
                    }
                    break;
                case 998987509:
                case 2134960300:
                    AbstractC0464.m2313();
                    if (!C3577.m10565()) {
                        int iM11308 = ThreadFactoryC3888.m11306("۠ܰ") ^ i9;
                        i5 = ((iM11308 ^ i8) * 16125) ^ 887845325;
                        i11 = iM11308 ^ 1304135165;
                        i10 = i5;
                    } else {
                        i14 = i14;
                        iM450210 = (ThreadFactoryC3888.m11306("ܽܿ") ^ i9) * (-109);
                        i3 = ((iM450210 ^ i8) * 4243) ^ (-1724214331);
                        i4 = -2110423936;
                        int i219 = iM450210 ^ i4;
                        i10 = i3;
                        i14 = i14;
                        i11 = i219;
                        str3 = str2;
                    }
                    break;
                case 1275120639:
                case 1899091508:
                    short[] sArr4 = f43355;
                    i14 = i14;
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 > 0) {
                        throw new IOException(C1398.m4892(sArr4, 71, 19, i17));
                    }
                    i14 = i14;
                    iM11306 = (ThreadFactoryC3888.m11306("᩹ܶ") + i9) * (-5);
                    i5 = ((iM11306 ^ i8) * (-25115)) ^ (-2038056544);
                    i6 = 810456886;
                    i11 = iM11306 ^ i6;
                    str3 = str2;
                    i10 = i5;
                    break;
                    break;
                default:
                    i14 = i14;
                    sArr = f43355;
                    if (C2477.f9839 <= 0) {
                        iM450210 = (ThreadFactoryC3888.m11306("ܽܿ") ^ i9) * (-109);
                        i3 = ((iM450210 ^ i8) * 4243) ^ (-1724214331);
                        i4 = -2110423936;
                    } else {
                        iM450210 = C19806.m45029("ۡۘ") ^ i9;
                        i3 = ((iM450210 ^ i8) * 561) ^ (-360175046);
                        i4 = -445324872;
                    }
                    int i2110 = iM450210 ^ i4;
                    i10 = i3;
                    i14 = i14;
                    i11 = i2110;
                    str3 = str2;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:109:0x039e  */
    /* JADX WARN: Code duplicated, block: B:113:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:121:0x0420  */
    /* JADX WARN: Code duplicated, block: B:125:0x0450  */
    /* JADX WARN: Code duplicated, block: B:129:0x047e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0087  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:65:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:84:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:96:0x0319 A[PHI: r3 r5
      0x0319: PHI (r3v3 long) = 
      (r3v2 long)
      (r3v1 long)
      (r3v1 long)
      (r3v1 long)
      (r3v1 long)
      (r3v1 long)
      (r3v1 long)
      (r3v1 long)
      (r3v1 long)
      (r3v1 long)
      (r3v1 long)
     binds: [B:94:0x0300, B:89:0x02dc, B:86:0x02c2, B:79:0x026f, B:76:0x0250, B:73:0x0231, B:70:0x0225, B:67:0x0207, B:43:0x00ec, B:38:0x00c7, B:137:0x0319] A[DONT_GENERATE, DONT_INLINE]
      0x0319: PHI (r5v3 int) = 
      (r5v1 int)
      (r5v2 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
     binds: [B:94:0x0300, B:89:0x02dc, B:86:0x02c2, B:79:0x026f, B:76:0x0250, B:73:0x0231, B:70:0x0225, B:67:0x0207, B:43:0x00ec, B:38:0x00c7, B:137:0x0319] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m32160(C1003 c1003) throws C5237 {
        int iM45029;
        int i;
        int i2;
        C1003 c1004 = c1003;
        long j = 0;
        int i3 = 0;
        String str = null;
        String str2 = null;
        int i4 = 0;
        String[] strArr = null;
        int i5 = 0;
        byte[] bArrDecode = null;
        int length = 0;
        boolean zM2315 = false;
        int i6 = -765217611;
        int i7 = C2642.f10294;
        int i8 = C1937.f7317;
        int iM11306 = (i7 - ThreadFactoryC3888.m11306("ۘ۫")) * (-43);
        int i9 = ((iM11306 ^ i8) * (-2135)) ^ 1914291703;
        int i10 = iM11306 ^ 760785121;
        long j2 = 0;
        while (true) {
            i6 = i10 ^ (i9 & (((i6 ^ i8) * (-27591)) >> 31));
            switch (i6) {
                case -2115345102:
                case -1777669908:
                    if (C0216.m1591() <= 0) {
                        iM45029 = C19806.m45029("ᩳۧ") ^ i7;
                        i = ((iM45029 ^ i8) * (-20959)) ^ (-191084529);
                        i2 = 2003856461;
                    } else {
                        iM45029 = (i7 - C19806.m45029("᩻᩻")) * 93;
                        i = ((iM45029 ^ i8) * 20393) ^ 1152928322;
                        i2 = 1574545443;
                    }
                    int i11 = i;
                    i10 = iM45029 ^ i2;
                    i9 = i11;
                    break;
                case -2105971431:
                case -176405462:
                    if (AbstractC0464.m2315(strArr[i5], str)) {
                        iM45029 = (ThreadFactoryC3888.m11306("۠ܰ") ^ i7) * (-29);
                        i = ((iM45029 ^ i8) * 17937) ^ (-1765657407);
                        i2 = -533424610;
                    } else {
                        iM45029 = (i8 - C19806.m45029("ۗᩳ")) * (-39);
                        i = ((iM45029 ^ i7) * 491) ^ 1753696479;
                        i2 = 188537725;
                    }
                    int i12 = i;
                    i10 = iM45029 ^ i2;
                    i9 = i12;
                    break;
                case -2105583339:
                case -1954338365:
                    if (C0962.f3784) {
                        iM45029 = (C19806.m45029("ۡۗ") ^ i8) * 21;
                        i = ((iM45029 ^ i7) * (-14421)) ^ (-1271531411);
                        i2 = 1200814811;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۫ۖ") ^ i8;
                        i = ((iM45029 ^ i7) * 9027) ^ (-716364725);
                        i2 = 1268943378;
                    }
                    int i13 = i;
                    i10 = iM45029 ^ i2;
                    i9 = i13;
                    break;
                case -2065356062:
                case 1419777092:
                    if (C0216.f1393 != 0) {
                        iM45029 = C19806.m45029("᩻ᩴ") ^ i8;
                        i = ((iM45029 ^ i7) * (-10815)) ^ (-277775024);
                        i2 = 1783979782;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֫ۛ") ^ i7;
                        i = ((iM45029 ^ i8) * 18947) ^ (-1231464659);
                        i2 = -391494800;
                    }
                    int i14 = i;
                    i10 = iM45029 ^ i2;
                    i9 = i14;
                    break;
                case -2011303866:
                case 489391055:
                    if (C2249.m6911(c1004.f4688)) {
                        iM45029 = (C19806.m45029("ۖۡ") + i7) * 7;
                        i = ((iM45029 ^ i8) * (-3643)) ^ (-1680254321);
                        i2 = -2060734134;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩻ۖ") ^ i8) * (-61);
                        i = ((iM45029 ^ i7) * (-27811)) ^ 347760696;
                        i2 = 115926745;
                    }
                    int i15 = i;
                    i10 = iM45029 ^ i2;
                    i9 = i15;
                    break;
                case -1955941408:
                case 1822887138:
                    return;
                case -1898653546:
                case -1374736192:
                    str = c1004.f4682;
                    i5 = 0;
                    iM45029 = (C19806.m45029("ۤܳ") ^ i8) * (-99);
                    i = ((iM45029 ^ i7) * 6539) ^ (-1254697367);
                    i2 = 891863526;
                    int i16 = i;
                    i10 = iM45029 ^ i2;
                    i9 = i16;
                    break;
                case -1813881052:
                case 1698444651:
                    C2332.m7079();
                    if (C1977.f7413 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۫ۖ") ^ i8;
                        i = ((iM45029 ^ i7) * 9027) ^ (-716364725);
                        i2 = 1268943378;
                    } else {
                        iM45029 = (i7 - ThreadFactoryC3888.m11306("ܿۡ")) * (-41);
                        i = ((iM45029 ^ i8) * (-26195)) ^ 1233730132;
                        i2 = -138053060;
                    }
                    int i17 = i;
                    i10 = iM45029 ^ i2;
                    i9 = i17;
                    break;
                case -1671435118:
                case -1096845397:
                    long j3 = c1004.f4686;
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        j2 = j3;
                        iM45029 = (i7 - ThreadFactoryC3888.m11306("ܿۡ")) * (-41);
                        i = ((iM45029 ^ i8) * (-26195)) ^ 1233730132;
                        i2 = -138053060;
                        int i18 = i;
                        i10 = iM45029 ^ i2;
                        i9 = i18;
                    } else {
                        int iM450210 = (C19806.m45029("ۢۘ") ^ i8) * (-63);
                        j2 = j3;
                        i10 = iM450210 ^ 303244441;
                        i9 = ((iM450210 ^ i7) * 20325) ^ (-2046522539);
                        c1004 = c1003;
                    }
                    break;
                case -1631574770:
                case -766931757:
                    if (C7105.f23796 < 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܶܳ") ^ i8) * (-123);
                        i = ((iM45029 ^ i7) * (-19087)) ^ (-874421551);
                        i2 = 1184249172;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩺ܺ") ^ i7;
                        i = ((iM45029 ^ i8) * (-19917)) ^ (-1838299005);
                        i2 = -1810141191;
                    }
                    int i19 = i;
                    i10 = iM45029 ^ i2;
                    i9 = i19;
                    break;
                case -1608637900:
                case 762763051:
                    C1066.m4023();
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 < 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܶܳ") ^ i8) * (-123);
                        i = ((iM45029 ^ i7) * (-19087)) ^ (-874421551);
                        i2 = 1184249172;
                    } else {
                        iM45029 = C19806.m45029("ᩳۧ") ^ i7;
                        i = ((iM45029 ^ i8) * (-20959)) ^ (-191084529);
                        i2 = 2003856461;
                    }
                    int i110 = i;
                    i10 = iM45029 ^ i2;
                    i9 = i110;
                    break;
                case -1606476255:
                case 565922767:
                    if (C2871.m8641(c1004.f4681) <= 256) {
                        iM45029 = (i8 - ThreadFactoryC3888.m11306("ۨۛ")) * 47;
                        i = ((iM45029 ^ i7) * 3549) ^ 2135225514;
                        i2 = 882474855;
                    } else {
                        iM45029 = (C19806.m45029("۬۟") + i8) * (-97);
                        i = ((iM45029 ^ i7) * 26423) ^ (-1164454675);
                        i2 = -1111127786;
                    }
                    int i111 = i;
                    i10 = iM45029 ^ i2;
                    i9 = i111;
                    break;
                case -1556717880:
                case 110472084:
                    if (C1148.f5161 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩺ܺ") ^ i7;
                        i = ((iM45029 ^ i8) * (-19917)) ^ (-1838299005);
                        i2 = -1810141191;
                    } else {
                        iM45029 = C19806.m45029("ۘܶ") ^ i8;
                        i = ((iM45029 ^ i7) * 29741) ^ (-150741628);
                        i2 = 1056266059;
                    }
                    int i112 = i;
                    i10 = iM45029 ^ i2;
                    i9 = i112;
                    break;
                case -1468099138:
                case -1227147999:
                    i3 = c1004.f4683;
                    if (i3 >= 1) {
                        iM45029 = (C19806.m45029("᩶ۛ") + i8) * (-121);
                        i = ((iM45029 ^ i7) * 14791) ^ 190739859;
                        i2 = -1395585173;
                    } else {
                        iM45029 = (C19806.m45029("۬۟") + i8) * (-97);
                        i = ((iM45029 ^ i7) * 26423) ^ (-1164454675);
                        i2 = -1111127786;
                    }
                    int i113 = i;
                    i10 = iM45029 ^ i2;
                    i9 = i113;
                    break;
                case -1461467103:
                case 133954228:
                    C1398.m4895();
                    if (RunnableC1564.f6300) {
                        iM45029 = C19806.m45029("ᩳۧ") ^ i7;
                        i = ((iM45029 ^ i8) * (-20959)) ^ (-191084529);
                        i2 = 2003856461;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩹᩷") ^ i8;
                        i = ((iM45029 ^ i7) * (-11419)) ^ (-1081528816);
                        i2 = 1971265405;
                    }
                    int i114 = i;
                    i10 = iM45029 ^ i2;
                    i9 = i114;
                    break;
                case -1442303922:
                case -1005552887:
                    if (zM2315) {
                        iM45029 = (C19806.m45029("֡᩸") ^ i7) * (-101);
                        i = ((iM45029 ^ i8) * (-25185)) ^ 1186846872;
                        i2 = 698172895;
                    } else {
                        iM45029 = (C19806.m45029("۬۟") + i8) * (-97);
                        i = ((iM45029 ^ i7) * 26423) ^ (-1164454675);
                        i2 = -1111127786;
                    }
                    int i115 = i;
                    i10 = iM45029 ^ i2;
                    i9 = i115;
                    break;
                case -1395843339:
                case -265447844:
                    if (C0817.f3443) {
                        iM45029 = (C19806.m45029("᩸ۨ") ^ i7) * (-93);
                        i = ((iM45029 ^ i8) * (-10457)) ^ 457731221;
                        i2 = 954185854;
                    } else {
                        iM45029 = C19806.m45029("ᩳۧ") ^ i7;
                        i = ((iM45029 ^ i8) * (-20959)) ^ (-191084529);
                        i2 = 2003856461;
                    }
                    int i116 = i;
                    i10 = iM45029 ^ i2;
                    i9 = i116;
                    break;
                case -1247503673:
                case 1944682753:
                    if (C3660.m10786(c1004.f4687)) {
                        iM45029 = (C19806.m45029("֡᩸") ^ i7) * (-101);
                        i = ((iM45029 ^ i8) * (-25185)) ^ 1186846872;
                        i2 = 698172895;
                    } else {
                        iM45029 = C19806.m45029("ܽۙ") ^ i8;
                        i = ((iM45029 ^ i7) * 28813) ^ (-1947173080);
                        i2 = -6655203;
                    }
                    int i117 = i;
                    i10 = iM45029 ^ i2;
                    i9 = i117;
                    break;
                case -1178481661:
                case 96968455:
                    if (C2871.m8641(c1004.f4685) <= 1024) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳۘ") ^ i7) * (-35);
                        i = ((iM45029 ^ i8) * (-14301)) ^ (-897751548);
                        i2 = 226934082;
                    } else {
                        iM45029 = (C19806.m45029("۬۟") + i8) * (-97);
                        i = ((iM45029 ^ i7) * 26423) ^ (-1164454675);
                        i2 = -1111127786;
                    }
                    int i118 = i;
                    i10 = iM45029 ^ i2;
                    i9 = i118;
                    break;
                case -1176299233:
                case -84750780:
                    C0629.m2907();
                    C3286.m9798();
                    return;
                case -1172499675:
                case -652908420:
                    j = 0;
                    if (j2 >= 0) {
                        iM45029 = (C19806.m45029("ᩴۛ") ^ i7) * 17;
                        i = ((iM45029 ^ i8) * (-19679)) ^ 168514399;
                        i2 = -1318921453;
                    } else {
                        iM45029 = (C19806.m45029("۬۟") + i8) * (-97);
                        i = ((iM45029 ^ i7) * 26423) ^ (-1164454675);
                        i2 = -1111127786;
                    }
                    int i119 = i;
                    i10 = iM45029 ^ i2;
                    i9 = i119;
                    break;
                case -1157565930:
                case 2080283387:
                    if (c1004.f4686 != j) {
                        iM45029 = (C19806.m45029("ۖۡ") + i7) * 7;
                        i = ((iM45029 ^ i8) * (-3643)) ^ (-1680254321);
                        i2 = -2060734134;
                    } else {
                        iM45029 = (C19806.m45029("۬۟") + i8) * (-97);
                        i = ((iM45029 ^ i7) * 26423) ^ (-1164454675);
                        i2 = -1111127786;
                    }
                    int i1110 = i;
                    i10 = iM45029 ^ i2;
                    i9 = i1110;
                    break;
                case -1116737440:
                case 1747086704:
                    if (C0817.f3443) {
                        iM45029 = (C19806.m45029("ܳۨ") ^ i8) * 43;
                        i = ((iM45029 ^ i7) * (-23803)) ^ (-1276637188);
                        i2 = -871575188;
                    } else {
                        iM45029 = C19806.m45029("᩻ᩴ") ^ i8;
                        i = ((iM45029 ^ i7) * (-10815)) ^ (-277775024);
                        i2 = 1783979782;
                    }
                    int i1111 = i;
                    i10 = iM45029 ^ i2;
                    i9 = i1111;
                    break;
                case -878986763:
                case -484268100:
                    strArr = f43351;
                    if (i5 < strArr.length) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۢ֨") ^ i8) * (-83);
                        i = ((iM45029 ^ i7) * 3237) ^ 1675279706;
                        i2 = 329915990;
                    } else {
                        iM45029 = C19806.m45029("ᩴۤ") ^ i7;
                        i = ((iM45029 ^ i8) * 7041) ^ 292498222;
                        i2 = 705850490;
                    }
                    int i1112 = i;
                    i10 = iM45029 ^ i2;
                    i9 = i1112;
                    break;
                case -716572296:
                case -715227799:
                    if (C1398.f5802 <= 0) {
                        iM45029 = (C19806.m45029("ܿۗ") + i7) * (-5);
                        i = ((iM45029 ^ i8) * 30463) ^ 326283354;
                        i2 = 80618221;
                    } else {
                        iM45029 = (i7 - C19806.m45029("֫᩸")) * 95;
                        i = ((iM45029 ^ i8) * 16695) ^ 1521288843;
                        i2 = 1668431023;
                    }
                    int i1113 = i;
                    i10 = iM45029 ^ i2;
                    i9 = i1113;
                    break;
                case -712846885:
                case 1961921723:
                    if (m32161(c1004.f4688)) {
                        iM45029 = C19806.m45029("ۖ֡") ^ i7;
                        i = ((iM45029 ^ i8) * (-10901)) ^ (-1687047911);
                        i2 = 1684355402;
                    } else {
                        iM45029 = (C19806.m45029("۬۟") + i8) * (-97);
                        i = ((iM45029 ^ i7) * 26423) ^ (-1164454675);
                        i2 = -1111127786;
                    }
                    int i1114 = i;
                    i10 = iM45029 ^ i2;
                    i9 = i1114;
                    break;
                case -293505534:
                case 245582802:
                    if (C1066.f4915 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩺ܺ") ^ i7;
                        i = ((iM45029 ^ i8) * (-19917)) ^ (-1838299005);
                        i2 = -1810141191;
                    } else {
                        iM45029 = C19806.m45029("ᩳܽ") ^ i7;
                        i = ((iM45029 ^ i8) * 2007) ^ 1530394450;
                        i2 = -1286250523;
                    }
                    int i1115 = i;
                    i10 = iM45029 ^ i2;
                    i9 = i1115;
                    break;
                case -217931335:
                case 898247856:
                    throw new C5237();
                case -147746854:
                case 427977634:
                    if (C3577.f13150 >= 0) {
                        iM45029 = (i7 - C19806.m45029("᩻᩻")) * 93;
                        i = ((iM45029 ^ i8) * 20393) ^ 1152928322;
                        i2 = 1574545443;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܶ᩹") + i8) * (-97);
                        i = ((iM45029 ^ i7) * 23615) ^ (-239989461);
                        i2 = -120790351;
                    }
                    int i1116 = i;
                    i10 = iM45029 ^ i2;
                    i9 = i1116;
                    break;
                case -81245796:
                case 1330128165:
                    try {
                        zM2315 = AbstractC0464.m2315(str2, Base64.encodeToString(bArrDecode, i4));
                        iM45029 = (C19806.m45029("ܽ۟") ^ i7) * 61;
                        i = ((iM45029 ^ i8) * 19167) ^ (-876020692);
                        i2 = 572306902;
                    } catch (IllegalArgumentException unused) {
                        iM45029 = (C19806.m45029("۬۟") + i8) * (-97);
                        i = ((iM45029 ^ i7) * 26423) ^ (-1164454675);
                        i2 = -1111127786;
                    }
                    int i1117 = i;
                    i10 = iM45029 ^ i2;
                    i9 = i1117;
                    break;
                case 99189837:
                case 277221430:
                    throw new C5237();
                case 287456346:
                case 1052018069:
                    if (i3 <= 255) {
                        iM45029 = ThreadFactoryC3888.m11306("ܺ᩻") ^ i7;
                        i = ((iM45029 ^ i8) * (-22911)) ^ 1854134111;
                        i2 = -1752796931;
                    } else {
                        iM45029 = (C19806.m45029("۬۟") + i8) * (-97);
                        i = ((iM45029 ^ i7) * 26423) ^ (-1164454675);
                        i2 = -1111127786;
                    }
                    int i1118 = i;
                    i10 = iM45029 ^ i2;
                    i9 = i1118;
                    break;
                case 300621260:
                case 1082203566:
                    if (C0671.m3008() < 0) {
                        iM45029 = (i7 - C19806.m45029("᩻᩻")) * 93;
                        i = ((iM45029 ^ i8) * 20393) ^ 1152928322;
                        i2 = 1574545443;
                    } else {
                        iM45029 = C19806.m45029("᩻ᩴ") ^ i8;
                        i = ((iM45029 ^ i7) * (-10815)) ^ (-277775024);
                        i2 = 1783979782;
                    }
                    int i1119 = i;
                    i10 = iM45029 ^ i2;
                    i9 = i1119;
                    break;
                case 338092364:
                case 1887390859:
                    str2 = c1004.f4687;
                    i4 = 11;
                    iM45029 = (C19806.m45029("֡ۤ") ^ i7) * 23;
                    i = ((iM45029 ^ i8) * (-29285)) ^ (-1299818791);
                    i2 = -1745730922;
                    int i11110 = i;
                    i10 = iM45029 ^ i2;
                    i9 = i11110;
                    break;
                case 491956788:
                case 1831409530:
                    i5++;
                    iM45029 = (C19806.m45029("ۤܳ") ^ i8) * (-99);
                    i = ((iM45029 ^ i7) * 6539) ^ (-1254697367);
                    i2 = 891863526;
                    int i11111 = i;
                    i10 = iM45029 ^ i2;
                    i9 = i11111;
                    break;
                case 664680721:
                case 2045075684:
                    if (RunnableC1606.m5473() != 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܶܳ") ^ i8) * (-123);
                        i = ((iM45029 ^ i7) * (-19087)) ^ (-874421551);
                        i2 = 1184249172;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۫ۖ") ^ i8;
                        i = ((iM45029 ^ i7) * 9027) ^ (-716364725);
                        i2 = 1268943378;
                    }
                    int i11112 = i;
                    i10 = iM45029 ^ i2;
                    i9 = i11112;
                    break;
                case 719016348:
                case 1124432448:
                    if (length == 32) {
                        iM45029 = ThreadFactoryC3888.m11306("ܶ᩷") ^ i7;
                        i = ((iM45029 ^ i8) * (-30465)) ^ (-861045741);
                        i2 = 1356047646;
                    } else {
                        iM45029 = (C19806.m45029("۬۟") + i8) * (-97);
                        i = ((iM45029 ^ i7) * 26423) ^ (-1164454675);
                        i2 = -1111127786;
                    }
                    int i11113 = i;
                    i10 = iM45029 ^ i2;
                    i9 = i11113;
                    break;
                case 877539578:
                case 1342212151:
                    if (C1875.f7103 >= 0) {
                        iM45029 = C19806.m45029("ᩳۧ") ^ i7;
                        i = ((iM45029 ^ i8) * (-20959)) ^ (-191084529);
                        i2 = 2003856461;
                    } else {
                        iM45029 = (i8 - ThreadFactoryC3888.m11306("ܽܺ")) * (-21);
                        i = ((iM45029 ^ i7) * (-22413)) ^ 45456098;
                        i2 = 178979640;
                    }
                    int i11114 = i;
                    i10 = iM45029 ^ i2;
                    i9 = i11114;
                    break;
                case 1091428969:
                case 1823083990:
                    bArrDecode = Base64.decode(str2, i4);
                    length = bArrDecode.length;
                    iM45029 = ThreadFactoryC3888.m11306("֡ܿ") ^ i8;
                    i = ((iM45029 ^ i7) * (-551)) ^ 396533597;
                    i2 = -1050177201;
                    int i11115 = i;
                    i10 = iM45029 ^ i2;
                    i9 = i11115;
                    break;
                case 1139968847:
                case 1760046243:
                    C1419.m4973();
                    iM45029 = (ThreadFactoryC3888.m11306("ܶܳ") ^ i8) * (-123);
                    i = ((iM45029 ^ i7) * (-19087)) ^ (-874421551);
                    i2 = 1184249172;
                    int i11116 = i;
                    i10 = iM45029 ^ i2;
                    i9 = i11116;
                    break;
                case 1483596393:
                case 1710510304:
                    if (C2871.m8641(c1004.f4687) <= 43) {
                        iM45029 = (C19806.m45029("ܺۙ") + i8) * (-115);
                        i = ((iM45029 ^ i7) * (-3495)) ^ 1700029938;
                        i2 = 472389339;
                    } else {
                        iM45029 = (C19806.m45029("۬۟") + i8) * (-97);
                        i = ((iM45029 ^ i7) * 26423) ^ (-1164454675);
                        i2 = -1111127786;
                    }
                    int i11117 = i;
                    i10 = iM45029 ^ i2;
                    i9 = i11117;
                    break;
                default:
                    if (C2332.f8260) {
                        iM45029 = (i7 - ThreadFactoryC3888.m11306("֨᩷")) * (-11);
                        i = ((iM45029 ^ i8) * 10109) ^ 1975420975;
                        i2 = -1877714019;
                    } else {
                        iM45029 = (C19806.m45029("ۡۗ") ^ i8) * 21;
                        i = ((iM45029 ^ i7) * (-14421)) ^ (-1271531411);
                        i2 = 1200814811;
                    }
                    int i11118 = i;
                    i10 = iM45029 ^ i2;
                    i9 = i11118;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m32161(String str) {
        boolean zM10786 = false;
        boolean z = false;
        int i = 0;
        char cM6362 = 0;
        int i2 = 869821042;
        int i3 = RunnableC0195.f1321;
        int i4 = C1460.f5948;
        int iM11306 = (i3 - ThreadFactoryC3888.m11306("᩷۟")) * 51;
        int i5 = ((iM11306 ^ i4) * (-26121)) ^ (-1874417165);
        int i6 = 1261029306;
        while (true) {
            i2 = ((((i2 ^ i4) * 22643) >> 31) & i5) ^ (iM11306 ^ i6);
            switch (i2) {
                case -2052646120:
                case -1859882891:
                    C1377.m4833();
                    C0050.m946();
                    iM11306 = ThreadFactoryC3888.m11306("ۚ᩺") ^ i3;
                    i5 = ((iM11306 ^ i4) * (-10027)) ^ 1599522986;
                    i6 = -139790184;
                    break;
                case -2042557023:
                case 1776776242:
                    if (C1668.f6641 >= 0) {
                        iM11306 = (C19806.m45029("۬ܶ") ^ i4) * (-121);
                        i5 = ((iM11306 ^ i3) * 11299) ^ 1650804173;
                        i6 = -1763142977;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩵ۢ") + i4) * (-39);
                        i5 = ((iM11306 ^ i3) * 27895) ^ 1777813573;
                        i6 = -784870850;
                    }
                    break;
                case -1908692543:
                case -1044506544:
                    if (C1461.f5957 <= 0) {
                        iM11306 = (C19806.m45029("۬ܶ") ^ i4) * (-121);
                        i5 = ((iM11306 ^ i3) * 11299) ^ 1650804173;
                        i6 = -1763142977;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("۠ۘ")) * (-113);
                        i5 = ((iM11306 ^ i3) * 1793) ^ 1635942216;
                        i6 = -1781916235;
                    }
                    break;
                case -1840830816:
                case 1566509956:
                    if (cM6362 > '~') {
                        iM11306 = C19806.m45029("֨ۢ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-11007)) ^ (-1136048315);
                        i6 = -565005357;
                    } else {
                        iM11306 = (C19806.m45029("ᩳ֨") + i3) * 57;
                        i5 = ((iM11306 ^ i4) * 31019) ^ 19457147;
                        i6 = 354172712;
                    }
                    break;
                case -1772230159:
                case 1850258816:
                    i++;
                    iM11306 = (ThreadFactoryC3888.m11306("᩶ܳ") ^ i4) * (-103);
                    i5 = ((iM11306 ^ i3) * 7255) ^ 1656278346;
                    i6 = 911387329;
                    break;
                case -1614981700:
                case 1862793795:
                    z = false;
                    if (zM10786) {
                        iM11306 = C19806.m45029("֨ۢ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-11007)) ^ (-1136048315);
                        i6 = -565005357;
                    } else {
                        iM11306 = (C19806.m45029("᩸֨") ^ i4) * (-95);
                        i5 = ((iM11306 ^ i3) * (-2319)) ^ (-1567909051);
                        i6 = -1518008660;
                    }
                    break;
                case -1578507232:
                case 2106053562:
                    return z;
                case -1483161637:
                case 1445148307:
                    C1148.m4232();
                    if (C1377.m4833() == 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۚ֫")) * (-87);
                        i5 = ((iM11306 ^ i4) * 30793) ^ (-1871060035);
                        i6 = 424796836;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۚ᩺") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-10027)) ^ 1599522986;
                        i6 = -139790184;
                    }
                    break;
                case -1428076853:
                case -1382898531:
                    if (RunnableC1564.f6300) {
                        iM11306 = C19806.m45029("ᩴ֫") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-29027)) ^ (-1106327079);
                        i6 = 630710853;
                    } else {
                        iM11306 = (C19806.m45029("ۚۡ") ^ i4) * (-23);
                        i5 = ((iM11306 ^ i3) * 1355) ^ (-1155448272);
                        i6 = -1694310322;
                    }
                    break;
                case -1349133705:
                case -673500705:
                    if (C3743.f13569) {
                        iM11306 = C19806.m45029("ܰ۫") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-6393)) ^ 691036525;
                        i6 = 1013474900;
                    } else {
                        iM11306 = C19806.m45029("ᩴ֫") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-29027)) ^ (-1106327079);
                        i6 = 630710853;
                    }
                    break;
                case -944107881:
                case -600592978:
                    if (C1025.f4800 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۚ᩺") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-10027)) ^ 1599522986;
                        i6 = -139790184;
                    } else {
                        iM11306 = (C19806.m45029("᩹ܶ") ^ i3) * 49;
                        i5 = ((iM11306 ^ i4) * 2815) ^ (-1629722562);
                        i6 = -240001869;
                    }
                    break;
                case -887670275:
                case 350827406:
                    return true;
                case -831648926:
                case 1046631546:
                    if (C2871.f10837 >= 0) {
                        iM11306 = (C19806.m45029("۬ܶ") ^ i4) * (-121);
                        i5 = ((iM11306 ^ i3) * 11299) ^ 1650804173;
                        i6 = -1763142977;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۖ֡") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-26541)) ^ (-1716149018);
                        i6 = -128607100;
                    }
                    break;
                case -482415959:
                case 1004423439:
                    if (RunnableC1895.f7152) {
                        iM11306 = C19806.m45029("۟᩻") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-13971)) ^ (-123959923);
                        i6 = 1266921661;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۚ᩺") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-10027)) ^ 1599522986;
                        i6 = -139790184;
                    }
                    break;
                case -371383157:
                case 883627577:
                    zM10786 = C3660.m10786(str);
                    if (C0216.m1591() <= 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۚ֫")) * (-87);
                        i5 = ((iM11306 ^ i4) * 30793) ^ (-1871060035);
                        i6 = 424796836;
                    } else {
                        iM11306 = C19806.m45029("۫ۗ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 12309) ^ (-1034956212);
                        i6 = 770613982;
                    }
                    break;
                case -26678294:
                case 641973354:
                    if (C1977.m6360(str) > 1024) {
                        iM11306 = C19806.m45029("֨ۢ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-11007)) ^ (-1136048315);
                        i6 = -565005357;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۡ᩵") ^ i3) * (-33);
                        i5 = ((iM11306 ^ i4) * (-32329)) ^ 2014222572;
                        i6 = -1390152730;
                    }
                    break;
                case 219322002:
                case 790683096:
                    if (i < C1977.m6360(str)) {
                        iM11306 = ThreadFactoryC3888.m11306("֡ۙ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 1047) ^ (-1612202265);
                        i6 = -2072807427;
                    } else {
                        iM11306 = C19806.m45029("ܽ۠") ^ i4;
                        i5 = ((iM11306 ^ i3) * 30385) ^ 208298165;
                        i6 = 788617992;
                    }
                    break;
                case 370935312:
                case 1535152988:
                    if (C10634.m26820()) {
                        iM11306 = C19806.m45029("ᩴ֫") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-29027)) ^ (-1106327079);
                        i6 = 630710853;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܶܿ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 14355) ^ (-70733342);
                        i6 = -540530064;
                    }
                    break;
                case 452958231:
                case 1821373641:
                    if (C1377.m4833() != 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩵ۢ") + i4) * (-39);
                        i5 = ((iM11306 ^ i3) * 27895) ^ 1777813573;
                        i6 = -784870850;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۗۗ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 29325) ^ (-1550337894);
                        i6 = -528833619;
                    }
                    break;
                case 665195766:
                case 980747498:
                    cM6362 = C1977.m6362(str, i);
                    if (cM6362 >= '!') {
                        iM11306 = (C19806.m45029("ᩴ᩷") + i4) * (-53);
                        i5 = ((iM11306 ^ i3) * 17183) ^ (-1647769468);
                        i6 = 1423980179;
                    } else {
                        iM11306 = C19806.m45029("֨ۢ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-11007)) ^ (-1136048315);
                        i6 = -565005357;
                    }
                    break;
                case 729445800:
                case 1417658411:
                    C1668.m5583();
                    return false;
                case 956295946:
                case 1285585631:
                    i = 0;
                    iM11306 = (ThreadFactoryC3888.m11306("᩶ܳ") ^ i4) * (-103);
                    i5 = ((iM11306 ^ i3) * 7255) ^ 1656278346;
                    i6 = 911387329;
                    break;
                case 1135587102:
                case 2039391813:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩵ۢ") + i4) * (-39);
                        i5 = ((iM11306 ^ i3) * 27895) ^ 1777813573;
                        i6 = -784870850;
                    } else {
                        iM11306 = C19806.m45029("֡ۡ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-26589)) ^ (-902945993);
                        i6 = 712522676;
                    }
                    break;
                default:
                    if (C0216.f1393 == 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩵ۢ") + i4) * (-39);
                        i5 = ((iM11306 ^ i3) * 27895) ^ 1777813573;
                        i6 = -784870850;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۚ᩺") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-10027)) ^ 1599522986;
                        i6 = -139790184;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x033d  */
    /* JADX WARN: Code duplicated, block: B:106:0x036e  */
    /* JADX WARN: Code duplicated, block: B:110:0x039e  */
    /* JADX WARN: Code duplicated, block: B:114:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:118:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:22:0x0086  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:94:0x02f6  */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static byte[] m32165(C15759 c15759) throws Throwable {
        int iM11306;
        int i;
        int i2 = C2788.f10625;
        int i3 = C1025.f4800;
        int iM11307 = (ThreadFactoryC3888.m11306("ܶ۬") + i2) * 83;
        int i4 = ((iM11307 ^ i3) * 4379) ^ 454407434;
        int i5 = iM11307 ^ 2022888862;
        Throwable th = null;
        Object obj = null;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        long size = 0;
        byte[] bArr = null;
        int i9 = 0;
        FileInputStream fileInputStreamM37498 = null;
        int i10 = 294238998;
        while (true) {
            int i11 = i5 ^ ((((i10 ^ i3) * 20437) >> 31) & i4);
            switch (i11) {
                case -2107745949:
                case 270081514:
                    throw th;
                case -2088961683:
                case 714969431:
                    if (C2704.f10408) {
                        iM11306 = (i3 - C19806.m45029("ۖ֨")) * q.h;
                        i4 = ((iM11306 ^ i2) * 17009) ^ 1671253253;
                        i = 595840248;
                    } else {
                        iM11306 = C19806.m45029("֡۠") ^ i2;
                        i4 = ((iM11306 ^ i3) * 3875) ^ 1826718700;
                        i = 1022376573;
                    }
                    i5 = iM11306 ^ i;
                    i10 = i11;
                    break;
                case -1885326288:
                case 1437652671:
                    throw new C5237();
                case -1870324762:
                case 999887032:
                    size = C6001.convertMaybeLegacyFileChannelFromLibrary(fileInputStreamM37498.getChannel()).size();
                    iM11306 = (i2 - C19806.m45029("ܺܰ")) * (-61);
                    i4 = ((iM11306 ^ i3) * 14729) ^ (-576922165);
                    i = -200165688;
                    i5 = iM11306 ^ i;
                    i10 = i11;
                    break;
                case -1618786918:
                case 593596011:
                    i6 = 0;
                    iM11306 = (C19806.m45029("֨ᩳ") + i3) * 89;
                    i4 = ((iM11306 ^ i2) * 2901) ^ 1151000160;
                    i = -1819545963;
                    i5 = iM11306 ^ i;
                    i10 = i11;
                    break;
                case -1591793389:
                case 828471228:
                    C3660.m10791();
                    if (RunnableC1564.f6300) {
                        iM11306 = (i2 - C19806.m45029("ۙ᩵")) * 45;
                        i4 = ((iM11306 ^ i3) * 14795) ^ (-1607990084);
                        i = 1479969017;
                    } else {
                        iM11306 = (C19806.m45029("ᩴ᩹") + i3) * (-23);
                        i4 = ((iM11306 ^ i2) * (-12079)) ^ 454015908;
                        i = 54689358;
                    }
                    i5 = iM11306 ^ i;
                    i10 = i11;
                    break;
                case -1545940273:
                case 1872342289:
                    try {
                        i8 = fileInputStreamM37498.read(bArr, i6, i9 - i6);
                        iM11306 = (i3 - C19806.m45029("ۜ᩻")) * (-25);
                        i4 = ((iM11306 ^ i2) * (-15691)) ^ 678717050;
                        i = 2004293152;
                    } catch (Throwable th2) {
                        th = th2;
                        iM11306 = (C19806.m45029("ۗܳ") ^ i2) * (-65);
                        i4 = ((iM11306 ^ i3) * 17317) ^ 1987559610;
                        i = -1069353504;
                    }
                    i5 = iM11306 ^ i;
                    i10 = i11;
                    break;
                case -1417131468:
                case -1405836357:
                    throw new C5237();
                case -1323983717:
                case -973504463:
                    if (RunnableC3388.f12514 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۟ܳ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-13651)) ^ 1565930479;
                        i = -662108930;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܿ᩷") ^ i3;
                        i4 = ((iM11306 ^ i2) * 28137) ^ 1201834266;
                        i = -119835828;
                    }
                    i5 = iM11306 ^ i;
                    i10 = i11;
                    break;
                case -1288832516:
                case 2136792621:
                    C1189.m4368();
                    if (AbstractC0464.f2088 <= 0) {
                        iM11306 = (C19806.m45029("᩸ۗ") ^ i3) * 43;
                        i4 = ((iM11306 ^ i2) * 23451) ^ 459374247;
                        i = 586243341;
                    } else {
                        iM11306 = (i3 - C19806.m45029("ۤۤ")) * 25;
                        i4 = ((iM11306 ^ i2) * (-3329)) ^ 1621188275;
                        i = 1015591039;
                    }
                    i5 = iM11306 ^ i;
                    i10 = i11;
                    break;
                case -1047806381:
                case 1432756798:
                    if (C2124.f7782 <= 0) {
                        iM11306 = C19806.m45029("֡۠") ^ i2;
                        i4 = ((iM11306 ^ i3) * 3875) ^ 1826718700;
                        i = 1022376573;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܳܳ") ^ i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM11306 ^ i2) * 21919) ^ (-1305373197);
                        i = 152652780;
                    }
                    i5 = iM11306 ^ i;
                    i10 = i11;
                    break;
                case -1025255317:
                case 78435944:
                    C3660.m10791();
                    if (C1668.f6641 < 0) {
                        iM11306 = (C19806.m45029("᩸ۗ") ^ i3) * 43;
                        i4 = ((iM11306 ^ i2) * 23451) ^ 459374247;
                        i = 586243341;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۟ܳ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-13651)) ^ 1565930479;
                        i = -662108930;
                    }
                    i5 = iM11306 ^ i;
                    i10 = i11;
                    break;
                case -969353714:
                case 11147298:
                    if (i7 == -1) {
                        iM11306 = ThreadFactoryC3888.m11306("ܽܳ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 23357) ^ 2147012694;
                        i = -1600625298;
                    } else {
                        iM11306 = C19806.m45029("᩶֡") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-7707)) ^ 2022281205;
                        i = -2141387390;
                    }
                    i5 = iM11306 ^ i;
                    i10 = i11;
                    break;
                case -841325352:
                case 754548797:
                    C2871.m8646();
                    return null;
                case -756915574:
                case -383883788:
                    RunnableC0195.m1431();
                    if (C1189.m4368() > 0) {
                        iM11306 = C19806.m45029("ۨۜ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-7739)) ^ 1181182640;
                        i = 1724108766;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֨֫") + i2) * (-43);
                        i4 = ((iM11306 ^ i3) * 23491) ^ (-1676754711);
                        i = -1310781538;
                    }
                    i5 = iM11306 ^ i;
                    i10 = i11;
                    break;
                case -687853720:
                case 678067355:
                    if (C1419.m4973()) {
                        iM11306 = (ThreadFactoryC3888.m11306("֨֫") + i2) * (-43);
                        i4 = ((iM11306 ^ i3) * 23491) ^ (-1676754711);
                        i = -1310781538;
                    } else {
                        iM11306 = (C19806.m45029("᩷ۧ") + i2) * (-127);
                        i4 = ((iM11306 ^ i3) * (-6339)) ^ (-644505069);
                        i = 766923346;
                    }
                    i5 = iM11306 ^ i;
                    i10 = i11;
                    break;
                case -650306232:
                case 1992816645:
                    if (C1148.f5161 <= 0) {
                        iM11306 = (C19806.m45029("᩸ۗ") ^ i3) * 43;
                        i4 = ((iM11306 ^ i2) * 23451) ^ 459374247;
                        i = 586243341;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ۗܰ")) * 89;
                        i4 = ((iM11306 ^ i3) * 28757) ^ (-89963469);
                        i = -338829021;
                    }
                    i5 = iM11306 ^ i;
                    i10 = i11;
                    break;
                case -599331612:
                case 1573121992:
                    C0216.m1591();
                    if (C3535.f13026 > 0) {
                        iM11306 = (C19806.m45029("᩸ۗ") ^ i3) * 43;
                        i4 = ((iM11306 ^ i2) * 23451) ^ 459374247;
                        i = 586243341;
                    } else {
                        iM11306 = (C19806.m45029("ܺ۟") + i3) * 99;
                        i4 = ((iM11306 ^ i2) * 31611) ^ 405520579;
                        i = -1007874407;
                    }
                    i5 = iM11306 ^ i;
                    i10 = i11;
                    break;
                case -479768693:
                case 1968136980:
                    i7 = fileInputStreamM37498.read();
                    iM11306 = C19806.m45029("ۜۛ") ^ i3;
                    i4 = ((iM11306 ^ i2) * (-22163)) ^ 2065935426;
                    i = -803522670;
                    i5 = iM11306 ^ i;
                    i10 = i11;
                    break;
                case -373200912:
                case 296691380:
                    if (i8 >= 0) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("۬ۧ")) * 33;
                        i4 = ((iM11306 ^ i3) * 27291) ^ 1371244883;
                        i = -1925634750;
                    } else {
                        iM11306 = C19806.m45029("ۜ᩸") ^ i3;
                        i4 = ((iM11306 ^ i2) * 17309) ^ 1976343690;
                        i = -1170279818;
                    }
                    i5 = iM11306 ^ i;
                    i10 = i11;
                    break;
                case -354042916:
                case 1022659898:
                    CallableC1627.m5507();
                    if (C1025.f4800 >= 0) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ۗܰ")) * 89;
                        i4 = ((iM11306 ^ i3) * 28757) ^ (-89963469);
                        i = -338829021;
                    } else {
                        iM11306 = (i2 - C19806.m45029("ۙ᩵")) * 45;
                        i4 = ((iM11306 ^ i3) * 14795) ^ (-1607990084);
                        i = 1479969017;
                    }
                    i5 = iM11306 ^ i;
                    i10 = i11;
                    break;
                case -244760204:
                case 154886882:
                    if (C19806.f63586) {
                        iM11306 = (i3 - C19806.m45029("ۤۤ")) * 25;
                        i4 = ((iM11306 ^ i2) * (-3329)) ^ 1621188275;
                        i = 1015591039;
                    } else {
                        iM11306 = C19806.m45029("ۙ᩷") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-7357)) ^ (-964691547);
                        i = -1395920242;
                    }
                    i5 = iM11306 ^ i;
                    i10 = i11;
                    break;
                case -229075928:
                case 1562337220:
                    if (size <= 16384) {
                        iM11306 = C19806.m45029("ۘܽ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-16485)) ^ (-900149543);
                        i = -101628348;
                    } else {
                        iM11306 = C19806.m45029("ۧۛ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 17807) ^ (-935069684);
                        i = 2089126816;
                    }
                    i5 = iM11306 ^ i;
                    i10 = i11;
                    break;
                case -131459603:
                case 1452782006:
                    if (C0526.m2437() >= 0) {
                        iM11306 = (i2 - C19806.m45029("ۙ᩵")) * 45;
                        i4 = ((iM11306 ^ i3) * 14795) ^ (-1607990084);
                        i = 1479969017;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֨۠") + i2) * 63;
                        i4 = ((iM11306 ^ i3) * (-26435)) ^ 1594220004;
                        i = -258047924;
                    }
                    i5 = iM11306 ^ i;
                    i10 = i11;
                    break;
                case 35048970:
                case 675852419:
                    C0629.m2911(th, obj);
                    iM11306 = ThreadFactoryC3888.m11306("᩵᩶") ^ i3;
                    i4 = ((iM11306 ^ i2) * (-21593)) ^ 1244451969;
                    i = 1391256333;
                    i5 = iM11306 ^ i;
                    i10 = i11;
                    break;
                case 118243729:
                case 1858578038:
                    try {
                        fileInputStreamM37498.close();
                        iM11306 = ThreadFactoryC3888.m11306("᩵᩶") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-21593)) ^ 1244451969;
                        i = 1391256333;
                        i5 = iM11306 ^ i;
                        i10 = i11;
                    } catch (Throwable th3) {
                        int iM11308 = (ThreadFactoryC3888.m11306("ܿۙ") ^ i2) * 31;
                        i4 = ((iM11308 ^ i3) * 9293) ^ 1444722070;
                        int i12 = iM11308 ^ (-811919529);
                        obj = th3;
                        i10 = i11;
                        i5 = i12;
                    }
                    break;
                case 137899013:
                case 1001301379:
                    C2124.m6673();
                    if (C2477.f9839 > 0) {
                        iM11306 = (C19806.m45029("ܺ۟") + i3) * 99;
                        i4 = ((iM11306 ^ i2) * 31611) ^ 405520579;
                        i = -1007874407;
                    } else {
                        iM11306 = C19806.m45029("ۨۜ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-7739)) ^ 1181182640;
                        i = 1724108766;
                    }
                    i5 = iM11306 ^ i;
                    i10 = i11;
                    break;
                case 213954851:
                case 692087278:
                    i9 = (int) size;
                    bArr = new byte[i9];
                    iM11306 = C19806.m45029("᩶᩷") ^ i2;
                    i4 = ((iM11306 ^ i3) * (-26887)) ^ 1102313961;
                    i = -158586244;
                    i5 = iM11306 ^ i;
                    i10 = i11;
                    break;
                case 338007168:
                case 2100126511:
                    if (C2704.f10408) {
                        iM11306 = C19806.m45029("۬ۖ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-21209)) ^ 1803934174;
                        i = -2089187830;
                    } else {
                        iM11306 = (C19806.m45029("᩸ۗ") ^ i3) * 43;
                        i4 = ((iM11306 ^ i2) * 23451) ^ 459374247;
                        i = 586243341;
                    }
                    i5 = iM11306 ^ i;
                    i10 = i11;
                    break;
                case 498052383:
                case 1990483187:
                    if (i6 < i9) {
                        iM11306 = (i2 - C19806.m45029("᩶ۜ")) * 95;
                        i4 = ((iM11306 ^ i3) * (-30209)) ^ (-68579137);
                        i = 233807681;
                    } else {
                        iM11306 = C19806.m45029("۠ۤ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-14683)) ^ 1385539118;
                        i = -1600039482;
                    }
                    i5 = iM11306 ^ i;
                    i10 = i11;
                    break;
                case 513187321:
                case 1613579926:
                    i6 += i8;
                    iM11306 = (C19806.m45029("֨ᩳ") + i3) * 89;
                    i4 = ((iM11306 ^ i2) * 2901) ^ 1151000160;
                    i = -1819545963;
                    i5 = iM11306 ^ i;
                    i10 = i11;
                    break;
                case 609357370:
                case 1800511609:
                    if (C1377.f5749) {
                        iM11306 = ThreadFactoryC3888.m11306("᩵ᩳ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 22981) ^ (-1846964519);
                        i = -9423585;
                    } else {
                        iM11306 = (i2 - C19806.m45029("ۙ᩵")) * 45;
                        i4 = ((iM11306 ^ i3) * 14795) ^ (-1607990084);
                        i = 1479969017;
                    }
                    i5 = iM11306 ^ i;
                    i10 = i11;
                    break;
                case 914563062:
                case 2032531174:
                    if (C2871.f10837 >= 0) {
                        iM11306 = (i3 - C19806.m45029("ۤۤ")) * 25;
                        i4 = ((iM11306 ^ i2) * (-3329)) ^ 1621188275;
                        i = 1015591039;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۡ۫") ^ i3;
                        i4 = ((iM11306 ^ i2) * 19593) ^ 1264342044;
                        i = -370178703;
                    }
                    i5 = iM11306 ^ i;
                    i10 = i11;
                    break;
                case 962506132:
                case 1071966403:
                    if (C0216.m1591() <= 0) {
                        iM11306 = (C19806.m45029("᩸ۗ") ^ i3) * 43;
                        i4 = ((iM11306 ^ i2) * 23451) ^ 459374247;
                        i = 586243341;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۬ܽ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-27979)) ^ (-811758649);
                        i = -1382266319;
                    }
                    i5 = iM11306 ^ i;
                    i10 = i11;
                    break;
                case 1456332311:
                case 1777648151:
                    fileInputStreamM37498 = c15759.m37498();
                    iM11306 = ThreadFactoryC3888.m11306("ܳ۬") ^ i3;
                    i4 = ((iM11306 ^ i2) * 5599) ^ 653067102;
                    i = -349699474;
                    i5 = iM11306 ^ i;
                    i10 = i11;
                    break;
                case 1787816357:
                case 2024303166:
                    throw new C5237();
                case 1864037483:
                case 1970694190:
                    fileInputStreamM37498.close();
                    return bArr;
                default:
                    C1875.m6086();
                    C2642.m8171();
                    iM11306 = (C19806.m45029("᩸ۗ") ^ i3) * 43;
                    i4 = ((iM11306 ^ i2) * 23451) ^ 459374247;
                    i = 586243341;
                    i5 = iM11306 ^ i;
                    i10 = i11;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x009c A[PHI: r4
      0x009c: PHI (r4v3 java.lang.String) = (r4v2 java.lang.String), (r4v5 java.lang.String) binds: [B:10:0x0035, B:7:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:48:0x0152 A[PHI: r2
      0x0152: PHI (r2v4 int) = (r2v3 int), (r2v2 int), (r2v2 int), (r2v2 int), (r2v2 int) binds: [B:47:0x0150, B:29:0x0081, B:16:0x0045, B:13:0x003d, B:10:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1003 m32145(C1003 c1003) {
        int iM11306;
        int i;
        String str = null;
        int i2 = 0;
        String str2 = null;
        String str3 = null;
        int i3 = 194911949;
        int i4 = C1977.f7413;
        int i5 = C1189.f5284;
        int iM45029 = C19806.m45029("֨ۧ") ^ i5;
        int i6 = ((iM45029 ^ i4) * (-24467)) ^ 1929629751;
        int i7 = 146426729;
        while (true) {
            int i8 = iM45029 ^ i7;
            C1003 c1004 = null;
            while (true) {
                i3 = ((((i3 ^ i4) * 16171) >> 31) & i6) ^ i8;
                switch (i3) {
                    case -1984521753:
                    case 898399597:
                        if (ViewGroupOnHierarchyChangeListenerC1916.m6233() == 0) {
                            iM11306 = (ThreadFactoryC3888.m11306("᩺ᩴ") ^ i5) * (-109);
                            i6 = ((iM11306 ^ i4) * (-5393)) ^ 806399266;
                            i = -1140788066;
                        } else {
                            iM11306 = (ThreadFactoryC3888.m11306("ۖ᩵") + i4) * (-97);
                            i6 = ((iM11306 ^ i5) * (-7209)) ^ (-1941512753);
                            i = -1491167465;
                        }
                        i8 = iM11306 ^ i;
                        break;
                    case -1909039409:
                    case -685628874:
                        C2788.m8472();
                        ViewGroupOnHierarchyChangeListenerC1916.m6233();
                        return null;
                    case -1759116236:
                    case 1401948389:
                        c1004.f4688 = str;
                        i2 = c1003.f4683;
                        if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                            iM11306 = (ThreadFactoryC3888.m11306("ۖ᩵") + i4) * (-97);
                            i6 = ((iM11306 ^ i5) * (-7209)) ^ (-1941512753);
                            i = -1491167465;
                        } else {
                            iM11306 = (i4 - ThreadFactoryC3888.m11306("ۗ۠")) * (-5);
                            i6 = ((iM11306 ^ i5) * (-7941)) ^ 2102113351;
                            i = -1676796944;
                        }
                        i8 = iM11306 ^ i;
                        break;
                    case -1728665749:
                    case 622390694:
                        return c1004;
                    case -1320552855:
                    case 616444410:
                        c1004.f4686 = c1003.f4686;
                        if (!C0962.f3784) {
                            iM11306 = ThreadFactoryC3888.m11306("᩺ܶ") ^ i5;
                            i6 = ((iM11306 ^ i4) * 26341) ^ 799072649;
                            i = 1714295878;
                            i8 = iM11306 ^ i;
                        }
                        break;
                    case -1192407301:
                    case 101189557:
                        c1004.f4685 = str3;
                        if (C0797.m3359()) {
                            iM11306 = (i5 - C19806.m45029("ܶۗ")) * (-27);
                            i6 = ((iM11306 ^ i4) * 25957) ^ (-1497193709);
                            i = -708499504;
                        } else {
                            iM11306 = (ThreadFactoryC3888.m11306("ۖ᩵") + i4) * (-97);
                            i6 = ((iM11306 ^ i5) * (-7209)) ^ (-1941512753);
                            i = -1491167465;
                        }
                        i8 = iM11306 ^ i;
                        break;
                    case -1035488452:
                    case 575087458:
                        c1004.f4687 = str2;
                        if (RunnableC1895.m6170() != 0) {
                            iM11306 = ThreadFactoryC3888.m11306("ۗ֡") ^ i5;
                            i6 = ((iM11306 ^ i4) * (-19133)) ^ 1238936976;
                            i = 623612417;
                        } else {
                            iM11306 = C19806.m45029("ۙۨ") ^ i4;
                            i6 = ((iM11306 ^ i5) * 25199) ^ (-890654495);
                            i = 1272144582;
                        }
                        i8 = iM11306 ^ i;
                        break;
                    case -805651785:
                    case 1573843574:
                        c1004.f4684 = c1003.f4684;
                        return c1004;
                    case -173375146:
                    case -102356727:
                        c1004.f4683 = i2;
                        str2 = c1003.f4687;
                        if (C1937.m6279() < 0) {
                            iM11306 = C19806.m45029("ۨ᩷") ^ i5;
                            i6 = ((iM11306 ^ i4) * 8597) ^ 1345990300;
                            i = 1375824348;
                            i8 = iM11306 ^ i;
                        }
                        break;
                    case -43544896:
                    case 1249207:
                        c1004.f4681 = c1003.f4681;
                        if (AbstractC0464.f2088 <= 0) {
                            iM11306 = (ThreadFactoryC3888.m11306("᩺ᩴ") ^ i5) * (-109);
                            i6 = ((iM11306 ^ i4) * (-5393)) ^ 806399266;
                            i = -1140788066;
                        } else {
                            iM11306 = (ThreadFactoryC3888.m11306("ۨ֡") + i4) * (-41);
                            i6 = ((iM11306 ^ i5) * (-23797)) ^ (-129029201);
                            i = -2127009971;
                        }
                        i8 = iM11306 ^ i;
                        break;
                    case 243277681:
                    case 1285188074:
                        C1937.m6279();
                        iM11306 = (ThreadFactoryC3888.m11306("᩺ᩴ") ^ i5) * (-109);
                        i6 = ((iM11306 ^ i4) * (-5393)) ^ 806399266;
                        i = -1140788066;
                        i8 = iM11306 ^ i;
                        break;
                    case 283980055:
                    case 1433268634:
                        if (RunnableC3388.f12514 < 0) {
                            iM11306 = (ThreadFactoryC3888.m11306("ۖ᩵") + i4) * (-97);
                            i6 = ((iM11306 ^ i5) * (-7209)) ^ (-1941512753);
                            i = -1491167465;
                        } else {
                            iM11306 = (ThreadFactoryC3888.m11306("ۚ᩻") ^ i4) * 87;
                            i6 = ((iM11306 ^ i5) * (-22359)) ^ 758602699;
                            i = -963482935;
                        }
                        i8 = iM11306 ^ i;
                        break;
                    case 376149387:
                    case 391452495:
                        str = c1003.f4688;
                        if (!C1977.m6356()) {
                            iM11306 = ThreadFactoryC3888.m11306("ۜᩳ") ^ i5;
                            i6 = ((iM11306 ^ i4) * 28579) ^ (-242159113);
                            i = -413118190;
                            i8 = iM11306 ^ i;
                        }
                        break;
                    case 424172954:
                    case 700490723:
                        if (C0671.m3008() >= 0) {
                        }
                        iM11306 = (ThreadFactoryC3888.m11306("ۖ᩵") + i4) * (-97);
                        i6 = ((iM11306 ^ i5) * (-7209)) ^ (-1941512753);
                        i = -1491167465;
                        i8 = iM11306 ^ i;
                        break;
                    case 433464429:
                    case 823324234:
                        c1004.f4682 = c1003.f4682;
                        if (RunnableC3388.f12514 >= 0) {
                            iM11306 = (ThreadFactoryC3888.m11306("᩺ᩴ") ^ i5) * (-109);
                            i6 = ((iM11306 ^ i4) * (-5393)) ^ 806399266;
                            i = -1140788066;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("ܰۙ") ^ i5;
                            i6 = ((iM11306 ^ i4) * 11265) ^ 131534590;
                            i = 1017897618;
                        }
                        i8 = iM11306 ^ i;
                        break;
                    case 1271832722:
                    case 2029799271:
                        if (!C1461.m5080()) {
                            c1004 = new C1003();
                            if (c1003 == null) {
                                iM11306 = (i4 - ThreadFactoryC3888.m11306("᩺᩹")) * 119;
                                i6 = ((iM11306 ^ i5) * 23577) ^ (-518317665);
                                i = 973770677;
                            } else {
                                iM11306 = (ThreadFactoryC3888.m11306("᩸ܺ") + i4) * 45;
                                i6 = ((iM11306 ^ i5) * (-23667)) ^ (-416254368);
                                i = 1328545972;
                            }
                            i8 = iM11306 ^ i;
                        }
                        break;
                    default:
                        str3 = c1003.f4685;
                        if (C0962.m3746() >= 0) {
                            iM11306 = (ThreadFactoryC3888.m11306("ۚ᩻") ^ i4) * 87;
                            i6 = ((iM11306 ^ i5) * (-22359)) ^ 758602699;
                            i = -963482935;
                        } else {
                            iM11306 = (ThreadFactoryC3888.m11306("ܿ᩻") ^ i4) * 81;
                            i6 = ((iM11306 ^ i5) * (-10391)) ^ (-1381408097);
                            i = -172133971;
                        }
                        i8 = iM11306 ^ i;
                        break;
                }
            }
            iM45029 = (C19806.m45029("ۙ۠") + i5) * 23;
            i6 = ((iM45029 ^ i4) * 23459) ^ 1300957518;
            i7 = -1613171953;
        }
    }

    /* JADX WARN: Code duplicated, block: B:64:0x025f A[PHI: r8 r9 r11 r12 r13 r17
      0x025f: PHI (r8v3 int) = (r8v2 int), (r8v1 int), (r8v1 int), (r8v1 int) binds: [B:63:0x025d, B:52:0x01de, B:48:0x01b8, B:14:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x025f: PHI (r9v3 int) = (r9v2 int), (r9v1 int), (r9v1 int), (r9v1 int) binds: [B:63:0x025d, B:52:0x01de, B:48:0x01b8, B:14:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x025f: PHI (r11v3 short[]) = (r11v1 short[]), (r11v2 short[]), (r11v1 short[]), (r11v1 short[]) binds: [B:63:0x025d, B:52:0x01de, B:48:0x01b8, B:14:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x025f: PHI (r12v3 int) = (r12v1 int), (r12v2 int), (r12v1 int), (r12v1 int) binds: [B:63:0x025d, B:52:0x01de, B:48:0x01b8, B:14:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x025f: PHI (r13v3 int) = (r13v1 int), (r13v1 int), (r13v2 int), (r13v1 int) binds: [B:63:0x025d, B:52:0x01de, B:48:0x01b8, B:14:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x025f: PHI (r17v31 int) = (r17v9 int), (r17v14 int), (r17v15 int), (r17v32 int) binds: [B:63:0x025d, B:52:0x01de, B:48:0x01b8, B:14:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x02b3 A[PHI: r5 r6 r7 r17 r18
      0x02b3: PHI (r5v3 char) = (r5v2 char), (r5v1 char), (r5v1 char) binds: [B:71:0x02b1, B:67:0x0294, B:44:0x0197] A[DONT_GENERATE, DONT_INLINE]
      0x02b3: PHI (r6v3 short) = (r6v1 short), (r6v2 short), (r6v1 short) binds: [B:71:0x02b1, B:67:0x0294, B:44:0x0197] A[DONT_GENERATE, DONT_INLINE]
      0x02b3: PHI (r7v3 int) = (r7v1 int), (r7v2 int), (r7v1 int) binds: [B:71:0x02b1, B:67:0x0294, B:44:0x0197] A[DONT_GENERATE, DONT_INLINE]
      0x02b3: PHI (r17v16 int) = (r17v7 int), (r17v8 int), (r17v17 int) binds: [B:71:0x02b1, B:67:0x0294, B:44:0x0197] A[DONT_GENERATE, DONT_INLINE]
      0x02b3: PHI (r18v2 l.ܺۛ᩺) = (r18v1 l.ܺۛ᩺), (r18v1 l.ܺۛ᩺), (r18v3 l.ܺۛ᩺) binds: [B:71:0x02b1, B:67:0x0294, B:44:0x0197] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x02e9 A[PHI: r3 r4 r17
      0x02e9: PHI (r3v4 java.lang.String) = (r3v1 java.lang.String), (r3v3 java.lang.String), (r3v1 java.lang.String) binds: [B:75:0x02e7, B:21:0x0084, B:15:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x02e9: PHI (r4v3 short[]) = (r4v2 short[]), (r4v1 short[]), (r4v1 short[]) binds: [B:75:0x02e7, B:21:0x0084, B:15:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x02e9: PHI (r17v27 int) = (r17v6 int), (r17v24 int), (r17v28 int) binds: [B:75:0x02e7, B:21:0x0084, B:15:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x003f, code lost:
    
        if (l.C3743.f13569 != false) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int[], java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m32156(boolean r21, boolean r22) {
        /*
            Method dump skipped, instruction units count: 976
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C12999.m32156(boolean, boolean):void");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static byte[] m32166(byte[] bArr) throws C5237 {
        int length = 0;
        int i = 0;
        int length2 = 0;
        byte[] bArrCopyOf = null;
        int length3 = 0;
        int length4 = 0;
        byte[] bArrCopyOfRange = null;
        MessageDigest messageDigestM49421 = null;
        int i2 = -1879318289;
        int i3 = C3577.f13150;
        int i4 = C2124.f7782;
        int iM45029 = C19806.m45029("ܶۨ") ^ i3;
        int i5 = ((iM45029 ^ i4) * 26353) ^ (-1873503370);
        int i6 = 814458802;
        while (true) {
            i2 = ((((i2 ^ i4) * (-7471)) >> 31) & i5) ^ (iM45029 ^ i6);
            switch (i2) {
                case -2119304550:
                case 703862350:
                    bArrCopyOf = Arrays.copyOf(bArr, length2);
                    if (C2249.f8050 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۖ۫") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-31189)) ^ 1959136451;
                        i6 = 945660366;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܶܳ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 8747) ^ 1469016089;
                        i6 = -1028903048;
                    }
                    break;
                case -2053079697:
                case -1438252141:
                    length = bArr.length;
                    if (C1460.f5948 >= 0) {
                        iM45029 = C19806.m45029("֨֡") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-29879)) ^ 1726244128;
                        i6 = 875205042;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֫᩺") ^ i4;
                        i5 = ((iM45029 ^ i3) * 355) ^ (-399556510);
                        i6 = 1733990709;
                    }
                    break;
                case -2034559031:
                case 283486567:
                    if (C2704.m8255() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۖ۫") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-31189)) ^ 1959136451;
                        i6 = 945660366;
                    } else {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("ۨ᩸")) * (-59);
                        i5 = ((iM45029 ^ i3) * (-7859)) ^ (-1091490002);
                        i6 = 769372512;
                    }
                    break;
                case -1622140830:
                case 156873231:
                    C0962.m3746();
                    if (C0629.f2722 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩳ᩵") ^ i3) * 91;
                        i5 = ((iM45029 ^ i4) * (-6927)) ^ 29958310;
                        i6 = 1354076848;
                    } else {
                        iM45029 = C19806.m45029("ᩳܶ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 5845) ^ (-967502198);
                        i6 = 1989160181;
                    }
                    break;
                case -1574122996:
                case 1053855547:
                    if (C0629.f2722 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۖ۫") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-31189)) ^ 1959136451;
                        i6 = 945660366;
                    } else {
                        iM45029 = C19806.m45029("ۙۘ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 1909) ^ (-1449687725);
                        i6 = -4834577;
                    }
                    break;
                case -1567606456:
                case 78764580:
                    C1460.m5050();
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۬ܰ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 31367) ^ (-1500351703);
                        i6 = -389332051;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩳ᩵") ^ i3) * 91;
                        i5 = ((iM45029 ^ i4) * (-6927)) ^ 29958310;
                        i6 = 1354076848;
                    }
                    break;
                case -1360566504:
                case -466646319:
                    RunnableC1564.m5345();
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 > 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۖ۫") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-31189)) ^ 1959136451;
                        i6 = 945660366;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩳ᩵") ^ i3) * 91;
                        i5 = ((iM45029 ^ i4) * (-6927)) ^ 29958310;
                        i6 = 1354076848;
                    }
                    break;
                case -1336734967:
                case -1279627177:
                    bArrCopyOfRange = Arrays.copyOfRange(bArr, length3, length4);
                    messageDigestM49421 = C22253.m49421();
                    if (C3577.f13150 >= 0) {
                        iM45029 = C19806.m45029("֨֡") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-29879)) ^ 1726244128;
                        i6 = 875205042;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֨ۘ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-32399)) ^ 1824326267;
                        i6 = -169430013;
                    }
                    break;
                case -1094739427:
                case 1468778459:
                    C3577.m10565();
                    C1937.m6279();
                    iM45029 = C19806.m45029("ᩳܶ") ^ i4;
                    i5 = ((iM45029 ^ i3) * 5845) ^ (-967502198);
                    i6 = 1989160181;
                    break;
                case -1044856659:
                case 440383392:
                    i = 32;
                    if (length >= 32) {
                        iM45029 = C19806.m45029("ܳ᩵") ^ i3;
                        i5 = ((iM45029 ^ i4) * 17479) ^ (-103878064);
                        i6 = -823313990;
                    } else {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("ۡᩴ")) * (-73);
                        i5 = ((iM45029 ^ i3) * 26953) ^ (-1081578180);
                        i6 = -160426740;
                    }
                    break;
                case -669908230:
                case 1657424378:
                    return bArrCopyOf;
                case -470768141:
                case 1865105504:
                    if (MessageDigest.isEqual(bArrCopyOfRange, messageDigestM49421.digest(bArrCopyOf))) {
                        iM45029 = C19806.m45029("ۛ۫") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-8563)) ^ (-225209848);
                        i6 = -133705511;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۖܶ") + i4) * (-35);
                        i5 = ((iM45029 ^ i3) * (-10539)) ^ (-1685537067);
                        i6 = -1819113824;
                    }
                    break;
                case -424109450:
                case 281138449:
                    if (C2871.f10837 >= 0) {
                        iM45029 = C19806.m45029("ᩳܶ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 5845) ^ (-967502198);
                        i6 = 1989160181;
                    } else {
                        iM45029 = (C19806.m45029("֫۟") + i3) * (-75);
                        i5 = ((iM45029 ^ i4) * 93) ^ (-1069519665);
                        i6 = -1686594712;
                    }
                    break;
                case 17338845:
                case 467641344:
                    C2788.m8472();
                    return null;
                case 312161764:
                case 442729099:
                    throw new C5237();
                case 378529869:
                case 1411416651:
                    length2 = bArr.length - i;
                    if (C1419.f5860 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩳ᩵") ^ i3) * 91;
                        i5 = ((iM45029 ^ i4) * (-6927)) ^ 29958310;
                        i6 = 1354076848;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܺۚ") + i4) * (-15);
                        i5 = ((iM45029 ^ i3) * (-19905)) ^ 1672438092;
                        i6 = 2088264865;
                    }
                    break;
                case 534452867:
                case 1702601635:
                    if (C0629.f2722 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۬ܰ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 31367) ^ (-1500351703);
                        i6 = -389332051;
                    } else {
                        iM45029 = C19806.m45029("ᩳۗ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-18203)) ^ (-2012324062);
                        i6 = 1736250792;
                    }
                    break;
                case 906768831:
                case 1192767318:
                    throw new C5237();
                case 1106552312:
                case 1482787734:
                    length3 = bArrCopyOf.length;
                    length4 = bArr.length;
                    if (AbstractC0464.m2313() != 0) {
                        iM45029 = C19806.m45029("֨֡") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-29879)) ^ 1726244128;
                        i6 = 875205042;
                    } else {
                        iM45029 = C19806.m45029("᩻ܽ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 20459) ^ 1718732448;
                        i6 = -1004352898;
                    }
                    break;
                default:
                    if (C1066.f4915 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۖ۫") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-31189)) ^ 1959136451;
                        i6 = 945660366;
                    } else {
                        iM45029 = C19806.m45029("ۙ᩷") ^ i3;
                        i5 = ((iM45029 ^ i4) * 22537) ^ 759293211;
                        i6 = 1534422080;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m32149(C1313 c1313, String str) throws IOException {
        String str2 = null;
        int i = -808759543;
        int i2 = C1461.f5957;
        int i3 = C1025.f4800;
        int iM45029 = (C19806.m45029("ܶܰ") ^ i2) * 83;
        int i4 = ((iM45029 ^ i3) * (-17193)) ^ 1785779932;
        int i5 = 126399204;
        while (true) {
            i = ((((i ^ i3) * 31513) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2124507131:
                case -1978655879:
                    if (C2871.f10837 >= 0) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("֡۟")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM45029 ^ i3) * (-31715)) ^ (-1481168176);
                        i5 = -1784838837;
                    } else {
                        iM45029 = C19806.m45029("ۖ᩸") ^ i2;
                        i4 = ((iM45029 ^ i3) * 24611) ^ 1946370122;
                        i5 = -496157688;
                    }
                    break;
                case -1978103837:
                case 1578968528:
                    if (C2788.f10625 >= 0) {
                        iM45029 = (C19806.m45029("ۛ۟") + i3) * (-17);
                        i4 = ((iM45029 ^ i2) * 5109) ^ 53979159;
                        i5 = -1992428909;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩷ۗ") ^ i2) * (-35);
                        i4 = ((iM45029 ^ i3) * 407) ^ 1394635982;
                        i5 = 1893824659;
                    }
                    break;
                case -1918027415:
                case -1173819447:
                    if (C2249.f8050 >= 0) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("֡۟")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM45029 ^ i3) * (-31715)) ^ (-1481168176);
                        i5 = -1784838837;
                    } else {
                        iM45029 = C19806.m45029("֫ۙ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 13633) ^ 1490202588;
                        i5 = -2143860503;
                    }
                    break;
                case -1728633083:
                case -1129217468:
                    m32151(c1313, str, str2, true);
                    break;
                case -1695779228:
                case -1413624414:
                    if (RunnableC3388.f12514 >= 0) {
                        iM45029 = (C19806.m45029("ۛ۟") + i3) * (-17);
                        i4 = ((iM45029 ^ i2) * 5109) ^ 53979159;
                        i5 = -1992428909;
                    } else {
                        iM45029 = (i3 - C19806.m45029("۟ܿ")) * 47;
                        i4 = ((iM45029 ^ i2) * 2757) ^ (-698417258);
                        i5 = -627861192;
                    }
                    break;
                case -1628983249:
                case -1366377473:
                    if (C3286.f12186) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("֡۟")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM45029 ^ i3) * (-31715)) ^ (-1481168176);
                        i5 = -1784838837;
                    } else {
                        iM45029 = (C19806.m45029("᩶ܿ") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM45029 ^ i3) * (-269)) ^ (-1345080081);
                        i5 = 850310101;
                    }
                    break;
                case -1605669809:
                case -1390551538:
                    C0671.m3008();
                    if (C1025.f4800 < 0) {
                        iM45029 = C19806.m45029("ۛۚ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 26317) ^ (-2020076899);
                        i5 = -1165580684;
                    } else {
                        iM45029 = C19806.m45029("ᩳۗ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-16463)) ^ 1220066039;
                        i5 = 130399905;
                    }
                    break;
                case -1271208170:
                case 1350961832:
                    if (C2124.f7782 <= 0) {
                        iM45029 = C19806.m45029("ۛۚ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 26317) ^ (-2020076899);
                        i5 = -1165580684;
                    } else {
                        iM45029 = C19806.m45029("ۨ᩷") ^ i2;
                        i4 = ((iM45029 ^ i3) * 22235) ^ (-2123305308);
                        i5 = 27033832;
                    }
                    break;
                case -1023676595:
                case 176746766:
                    if (C1461.f5957 <= 0) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("֡۟")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM45029 ^ i3) * (-31715)) ^ (-1481168176);
                        i5 = -1784838837;
                    } else {
                        iM45029 = (C19806.m45029("ۢܰ") ^ i3) * (-27);
                        i4 = ((iM45029 ^ i2) * (-23045)) ^ (-1920949518);
                        i5 = -2133864184;
                    }
                    break;
                case -993637611:
                case 1081470858:
                    if (C1066.m4023() > 0) {
                        iM45029 = (C19806.m45029("ۛ۟") + i3) * (-17);
                        i4 = ((iM45029 ^ i2) * 5109) ^ 53979159;
                        i5 = -1992428909;
                    } else {
                        iM45029 = C19806.m45029("ᩳۗ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-16463)) ^ 1220066039;
                        i5 = 130399905;
                    }
                    break;
                case -680038230:
                case 1472071029:
                    C2871.m8646();
                    C0216.m1591();
                    break;
                case -488423288:
                case 1953085122:
                    C19806.m45024();
                    iM45029 = C19806.m45029("ᩳۗ") ^ i3;
                    i4 = ((iM45029 ^ i2) * (-16463)) ^ 1220066039;
                    i5 = 130399905;
                    break;
                case -392910961:
                case 1937126639:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM45029 = C19806.m45029("ۛۚ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 26317) ^ (-2020076899);
                        i5 = -1165580684;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۡۗ") ^ i3) * 79;
                        i4 = ((iM45029 ^ i2) * (-11629)) ^ 652993407;
                        i5 = 1814260729;
                    }
                    break;
                case 993347517:
                case 2107576365:
                    if (C0278.m1789() <= 0) {
                        iM45029 = (C19806.m45029("֫ܳ") + i2) * (-43);
                        i4 = ((iM45029 ^ i3) * 14631) ^ (-1970832569);
                        i5 = -501635150;
                    } else {
                        iM45029 = (i2 - C19806.m45029("ᩳ֡")) * 71;
                        i4 = ((iM45029 ^ i3) * (-25819)) ^ (-1075485889);
                        i5 = -583924733;
                    }
                    break;
                case 1377430998:
                case 1559509580:
                    if (!C1419.m4973()) {
                        iM45029 = (C19806.m45029("ۛ۟") + i3) * (-17);
                        i4 = ((iM45029 ^ i2) * 5109) ^ 53979159;
                        i5 = -1992428909;
                    } else {
                        iM45029 = (C19806.m45029("֫ܳ") + i2) * (-43);
                        i4 = ((iM45029 ^ i3) * 14631) ^ (-1970832569);
                        i5 = -501635150;
                    }
                    break;
                default:
                    str2 = null;
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("֡۟")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM45029 ^ i3) * (-31715)) ^ (-1481168176);
                        i5 = -1784838837;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܳۧ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 24269) ^ 1595848281;
                        i5 = 1212560862;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1313 m32146() {
        C1003 c1003M5060 = null;
        C2724 c2724M4222 = null;
        String str = null;
        String str2 = null;
        long j = 0;
        C1313 c1313M8313 = null;
        C1003 c1003M32145 = null;
        String str3 = null;
        int i = 1668999586;
        int i2 = C1066.f4915;
        int i3 = C7105.f23796;
        int iM11306 = ThreadFactoryC3888.m11306("ۤۙ") ^ i3;
        int i4 = ((iM11306 ^ i2) * (-15441)) ^ (-791093216);
        int i5 = 1796343482;
        while (true) {
            i = ((((i ^ i2) * 14107) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2141958215:
                case -1569966887:
                    if (c1313M8313.m4672()) {
                        iM11306 = C19806.m45029("ۜۙ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-3731)) ^ (-771931207);
                        i5 = 2094871192;
                    } else {
                        iM11306 = (C19806.m45029("۫᩶") ^ i3) * (-121);
                        i4 = ((iM11306 ^ i2) * 1155) ^ (-1475654026);
                        i5 = 223214862;
                    }
                    break;
                case -2099856839:
                case 1421320621:
                    c2724M4222.m8317(str);
                    str2 = c1003M5060.f4688;
                    if (RunnableC1564.f6300) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("֫ۙ")) * 47;
                        i4 = ((iM11306 ^ i3) * (-27067)) ^ 290308888;
                        i5 = 1418783913;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳܶ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 27319) ^ (-1998824840);
                        i5 = 1401145822;
                    }
                    break;
                case -1969347851:
                case 722209796:
                    c2724M4222 = C1148.m4222(o.a.m);
                    if (C19806.f63586) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("᩸ܿ")) * (-67);
                        i4 = ((iM11306 ^ i3) * (-18531)) ^ 1368611846;
                        i5 = 393314308;
                    } else {
                        iM11306 = C19806.m45029("ܶۗ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-11231)) ^ (-1872694835);
                        i5 = 1707452298;
                    }
                    break;
                case -1871288668:
                case -1713068078:
                    C0962.m3749(c2724M4222, str2);
                    j = c1003M5060.f4686;
                    if (C1875.f7103 >= 0) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("᩸ܿ")) * (-67);
                        i4 = ((iM11306 ^ i3) * (-18531)) ^ 1368611846;
                        i5 = 393314308;
                    } else {
                        iM11306 = (C19806.m45029("ܶۖ") + i2) * 69;
                        i4 = ((iM11306 ^ i3) * 32389) ^ 1825976500;
                        i5 = 652645058;
                    }
                    break;
                case -1845582971:
                case -439305866:
                    if (C1398.f5802 <= 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("֡ܺ")) * 13;
                        i4 = ((iM11306 ^ i2) * (-20267)) ^ 580626137;
                        i5 = -1487164604;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("᩸ܿ")) * (-67);
                        i4 = ((iM11306 ^ i3) * (-18531)) ^ 1368611846;
                        i5 = 393314308;
                    }
                    break;
                case -1797673304:
                case 210354492:
                    c1003M32145.f4682 = str3;
                    if (C1419.f5860 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܿᩴ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 30741) ^ (-1742970089);
                        i5 = -2140378355;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۠ܶ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 9163) ^ (-1169969404);
                        i5 = 911360872;
                    }
                    break;
                case -1586065440:
                case -414748596:
                    c1003M5060 = C1460.m5060();
                    if (c1003M5060 != null) {
                        iM11306 = (i3 - C19806.m45029("ܶۘ")) * 25;
                        i4 = ((iM11306 ^ i2) * (-1433)) ^ 1364744998;
                        i5 = -764871217;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۚᩴ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 24425) ^ 182288642;
                        i5 = 1887397134;
                    }
                    break;
                case -1419059171:
                case 2011712847:
                    C3535.m10431();
                    C1977.m6356();
                    iM11306 = (i3 - C19806.m45029("᩶ۜ")) * (-45);
                    i4 = ((iM11306 ^ i2) * (-28175)) ^ 11956942;
                    i5 = -576800602;
                    break;
                case -767316817:
                case 1590722145:
                    c1313M8313 = c2724M4222.m8313();
                    if (RunnableC1564.m5342(c1313M8313)) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۖۙ") + i2) * 45;
                        i4 = ((iM11306 ^ i3) * (-31261)) ^ (-1143979336);
                        i5 = 370256362;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩸۬") + i3) * 89;
                        i4 = ((iM11306 ^ i2) * 26963) ^ 699925695;
                        i5 = -59933582;
                    }
                    break;
                case -761605407:
                case 299708362:
                    if (C3660.m10786(c1003M5060.f4688)) {
                        iM11306 = ThreadFactoryC3888.m11306("ۚᩴ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 24425) ^ 182288642;
                        i5 = 1887397134;
                    } else {
                        iM11306 = (C19806.m45029("ۤܰ") ^ i3) * 123;
                        i4 = ((iM11306 ^ i2) * 9045) ^ 175852250;
                        i5 = -1261411612;
                    }
                    break;
                case -531319878:
                case 492054963:
                    C0050.m946();
                    if (!RunnableC1564.m5345()) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("᩸ܿ")) * (-67);
                        i4 = ((iM11306 ^ i3) * (-18531)) ^ 1368611846;
                        i5 = 393314308;
                    } else {
                        iM11306 = (i3 - C19806.m45029("᩶ۜ")) * (-45);
                        i4 = ((iM11306 ^ i2) * (-28175)) ^ 11956942;
                        i5 = -576800602;
                    }
                    break;
                case -529021080:
                case 7956613:
                    str = c1003M5060.f4687;
                    if (C1977.f7413 <= 0) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("֫ۙ")) * 47;
                        i4 = ((iM11306 ^ i3) * (-27067)) ^ 290308888;
                        i5 = 1418783913;
                    } else {
                        iM11306 = C19806.m45029("ܶܽ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-29495)) ^ 1030586530;
                        i5 = 822832644;
                    }
                    break;
                case -469375719:
                case -198699657:
                    c1003M32145 = m32145(c1003M5060);
                    str3 = "";
                    if (C2704.f10408) {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳۚ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-29193)) ^ (-1280133410);
                        i5 = 1589559616;
                    } else {
                        iM11306 = (i3 - C19806.m45029("᩶ۜ")) * (-45);
                        i4 = ((iM11306 ^ i2) * (-28175)) ^ 11956942;
                        i5 = -576800602;
                    }
                    break;
                case -437374018:
                case 425836683:
                    C21444.m48062();
                    iM11306 = (C19806.m45029("۫᩶") ^ i3) * (-121);
                    i4 = ((iM11306 ^ i2) * 1155) ^ (-1475654026);
                    i5 = 223214862;
                    break;
                case -418967959:
                case 1408153168:
                    c1003M32145.f4687 = str3;
                    c1003M32145.f4685 = str3;
                    m32164(c1003M32145);
                    iM11306 = (ThreadFactoryC3888.m11306("᩸۬") + i3) * 89;
                    i4 = ((iM11306 ^ i2) * 26963) ^ 699925695;
                    i5 = -59933582;
                    break;
                case -100992119:
                case 936026266:
                    C0962.m3746();
                    if (!C3743.f13569) {
                        iM11306 = ThreadFactoryC3888.m11306("ܿᩴ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 30741) ^ (-1742970089);
                        i5 = -2140378355;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("᩸ܿ")) * (-67);
                        i4 = ((iM11306 ^ i3) * (-18531)) ^ 1368611846;
                        i5 = 393314308;
                    }
                    break;
                case 365142714:
                case 1629848875:
                    if (RunnableC3388.f12514 >= 0 || C3535.f13026 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܿᩴ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 30741) ^ (-1742970089);
                        i5 = -2140378355;
                    } else {
                        if (C2642.f10294 > 0) {
                            return new C1313(4);
                        }
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("֡ܺ")) * 13;
                        i4 = ((iM11306 ^ i2) * (-20267)) ^ 580626137;
                        i5 = -1487164604;
                    }
                    break;
                case 961682354:
                case 1528847186:
                    return c1313M8313;
                case 1293144132:
                case 2076416061:
                    c2724M4222.m8316(j);
                    if (C2332.f8260) {
                        iM11306 = C19806.m45029("۟ܽ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-913)) ^ 1358449119;
                        i5 = 405218750;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܿᩴ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 30741) ^ (-1742970089);
                        i5 = -2140378355;
                    }
                    break;
                default:
                    C1875.m6086();
                    ViewTreeObserverOnPreDrawListenerC3327.m9874();
                    return null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0216 A[PHI: r2 r3 r5 r7 r8 r14 r15
      0x0216: PHI (r2v6 java.lang.String) = (r2v3 java.lang.String), (r2v2 java.lang.String), (r2v2 java.lang.String) binds: [B:59:0x0215, B:41:0x015e, B:33:0x0115] A[DONT_GENERATE, DONT_INLINE]
      0x0216: PHI (r3v67 java.lang.String) = (r3v60 java.lang.String), (r3v66 java.lang.String), (r3v2 java.lang.String) binds: [B:59:0x0215, B:41:0x015e, B:33:0x0115] A[DONT_GENERATE, DONT_INLINE]
      0x0216: PHI (r5v3 java.lang.String) = (r5v2 java.lang.String), (r5v2 java.lang.String), (r5v4 java.lang.String) binds: [B:59:0x0215, B:41:0x015e, B:33:0x0115] A[DONT_GENERATE, DONT_INLINE]
      0x0216: PHI (r7v5 short[]) = (r7v3 short[]), (r7v2 short[]), (r7v2 short[]) binds: [B:59:0x0215, B:41:0x015e, B:33:0x0115] A[DONT_GENERATE, DONT_INLINE]
      0x0216: PHI (r8v5 int) = (r8v4 int), (r8v2 int), (r8v2 int) binds: [B:59:0x0215, B:41:0x015e, B:33:0x0115] A[DONT_GENERATE, DONT_INLINE]
      0x0216: PHI (r14v5 short[]) = (r14v4 short[]), (r14v2 short[]), (r14v2 short[]) binds: [B:59:0x0215, B:41:0x015e, B:33:0x0115] A[DONT_GENERATE, DONT_INLINE]
      0x0216: PHI (r15v5 int) = (r15v4 int), (r15v2 int), (r15v2 int) binds: [B:59:0x0215, B:41:0x015e, B:33:0x0115] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x028a A[PHI: r0 r1
      0x028a: PHI (r0v18 java.lang.String) = (r0v17 java.lang.String), (r0v19 java.lang.String) binds: [B:69:0x0272, B:63:0x024b] A[DONT_GENERATE, DONT_INLINE]
      0x028a: PHI (r1v6 l.֨۠᩺) = (r1v5 l.֨۠᩺), (r1v2 l.֨۠᩺) binds: [B:69:0x0272, B:63:0x024b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:85:0x0323 A[PHI: r0 r11 r12 r18 r23
      0x0323: PHI (r0v78 java.lang.String) = (r0v11 java.lang.String), (r0v12 java.lang.String), (r0v79 java.lang.String) binds: [B:84:0x0321, B:80:0x02ff, B:7:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x0323: PHI (r11v6 int) = (r11v2 int), (r11v3 int), (r11v2 int) binds: [B:84:0x0321, B:80:0x02ff, B:7:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x0323: PHI (r12v6 int) = (r12v2 int), (r12v3 int), (r12v2 int) binds: [B:84:0x0321, B:80:0x02ff, B:7:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x0323: PHI (r18v6 int) = (r18v3 int), (r18v2 int), (r18v2 int) binds: [B:84:0x0321, B:80:0x02ff, B:7:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x0323: PHI (r23v7 int) = (r23v4 int), (r23v3 int), (r23v3 int) binds: [B:84:0x0321, B:80:0x02ff, B:7:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:93:0x0377 A[PHI: r0 r4 r16 r17
      0x0377: PHI (r0v74 java.lang.String) = (r0v9 java.lang.String), (r0v10 java.lang.String), (r0v75 java.lang.String) binds: [B:92:0x0375, B:88:0x0354, B:10:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x0377: PHI (r4v5 l.ۖᩴ᩺) = (r4v2 l.ۖᩴ᩺), (r4v2 l.ۖᩴ᩺), (r4v6 l.ۖᩴ᩺) binds: [B:92:0x0375, B:88:0x0354, B:10:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x0377: PHI (r16v4 short) = (r16v2 short), (r16v3 short), (r16v2 short) binds: [B:92:0x0375, B:88:0x0354, B:10:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x0377: PHI (r17v4 short) = (r17v3 short), (r17v2 short), (r17v2 short) binds: [B:92:0x0375, B:88:0x0354, B:10:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0080, code lost:
    
        if (l.C0526.f2219 != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x005a, code lost:
    
        if (l.C3577.f13150 >= 0) goto L7;
     */
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C1313 m32167() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1154
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C12999.m32167():l.֨ᩴ᩺");
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0098  */
    /* JADX WARN: Code duplicated, block: B:29:0x00d2 A[PHI: r2 r3
      0x00d2: PHI (r2v56 l.֨۠᩺) = (r2v52 l.֨۠᩺), (r2v2 l.֨۠᩺), (r2v2 l.֨۠᩺), (r2v2 l.֨۠᩺) binds: [B:28:0x00d0, B:19:0x0077, B:17:0x0074, B:88:0x00d2] A[DONT_GENERATE, DONT_INLINE]
      0x00d2: PHI (r3v4 java.lang.String) = (r3v3 java.lang.String), (r3v2 java.lang.String), (r3v2 java.lang.String), (r3v2 java.lang.String) binds: [B:28:0x00d0, B:19:0x0077, B:17:0x0074, B:88:0x00d2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x01aa A[PHI: r1 r18
      0x01aa: PHI (r1v4 l.֨۠᩺) = (r1v3 l.֨۠᩺), (r1v2 l.֨۠᩺), (r1v2 l.֨۠᩺) binds: [B:46:0x0191, B:37:0x0135, B:35:0x0123] A[DONT_GENERATE, DONT_INLINE]
      0x01aa: PHI (r18v17 l.֨۠᩺) = (r18v12 l.֨۠᩺), (r18v15 l.֨۠᩺), (r18v18 l.֨۠᩺) binds: [B:46:0x0191, B:37:0x0135, B:35:0x0123] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x0299 A[PHI: r6 r14 r18
      0x0299: PHI (r6v5 short) = (r6v3 short), (r6v2 short), (r6v2 short) binds: [B:69:0x0297, B:6:0x0051, B:11:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x0299: PHI (r14v5 int) = (r14v2 int), (r14v3 int), (r14v2 int) binds: [B:69:0x0297, B:6:0x0051, B:11:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x0299: PHI (r18v30 l.֨۠᩺) = (r18v4 l.֨۠᩺), (r18v19 l.֨۠᩺), (r18v36 l.֨۠᩺) binds: [B:69:0x0297, B:6:0x0051, B:11:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x02cc A[PHI: r5 r9 r18
      0x02cc: PHI (r5v4 char) = (r5v3 char), (r5v2 char), (r5v2 char) binds: [B:73:0x02ca, B:61:0x024e, B:15:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x02cc: PHI (r9v4 int) = (r9v2 int), (r9v3 int), (r9v2 int) binds: [B:73:0x02ca, B:61:0x024e, B:15:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x02cc: PHI (r18v24 l.֨۠᩺) = (r18v3 l.֨۠᩺), (r18v6 l.֨۠᩺), (r18v27 l.֨۠᩺) binds: [B:73:0x02ca, B:61:0x024e, B:15:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x0301 A[PHI: r7 r8 r10 r12 r13 r18 r19
      0x0301: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int) binds: [B:77:0x02ff, B:65:0x0275, B:57:0x0228, B:41:0x016c] A[DONT_GENERATE, DONT_INLINE]
      0x0301: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:77:0x02ff, B:65:0x0275, B:57:0x0228, B:41:0x016c] A[DONT_GENERATE, DONT_INLINE]
      0x0301: PHI (r10v4 short) = (r10v2 short), (r10v2 short), (r10v3 short), (r10v2 short) binds: [B:77:0x02ff, B:65:0x0275, B:57:0x0228, B:41:0x016c] A[DONT_GENERATE, DONT_INLINE]
      0x0301: PHI (r12v3 short[]) = (r12v2 short[]), (r12v2 short[]), (r12v2 short[]), (r12v4 short[]) binds: [B:77:0x02ff, B:65:0x0275, B:57:0x0228, B:41:0x016c] A[DONT_GENERATE, DONT_INLINE]
      0x0301: PHI (r13v3 int) = (r13v2 int), (r13v2 int), (r13v2 int), (r13v4 int) binds: [B:77:0x02ff, B:65:0x0275, B:57:0x0228, B:41:0x016c] A[DONT_GENERATE, DONT_INLINE]
      0x0301: PHI (r18v13 l.֨۠᩺) = (r18v2 l.֨۠᩺), (r18v5 l.֨۠᩺), (r18v7 l.֨۠᩺), (r18v14 l.֨۠᩺) binds: [B:77:0x02ff, B:65:0x0275, B:57:0x0228, B:41:0x016c] A[DONT_GENERATE, DONT_INLINE]
      0x0301: PHI (r19v5 short[]) = (r19v4 short[]), (r19v3 short[]), (r19v3 short[]), (r19v3 short[]) binds: [B:77:0x02ff, B:65:0x0275, B:57:0x0228, B:41:0x016c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m32148(String str) {
        int iM11306;
        int i;
        int i2;
        int iM11307;
        int i3;
        int i4;
        int i5 = C10634.f36300;
        int i6 = ViewTreeObserverOnPreDrawListenerC3327.f12317;
        int iM11308 = ThreadFactoryC3888.m11306("۫ܿ") ^ i6;
        int i7 = ((iM11308 ^ i5) * (-27971)) ^ 1107278542;
        short[] sArr = null;
        short[] sArr2 = null;
        int i8 = iM11308 ^ 915370918;
        char c = 0;
        short s = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        short s2 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 1886514380;
        String str2 = null;
        C1003 c1003M32145 = null;
        C1003 c1003M2312 = null;
        while (true) {
            i15 = i8 ^ (i7 & (((i15 ^ i5) * (-16007)) >> 31));
            switch (i15) {
                case -2087484033:
                case 753089461:
                    C3660.m10791();
                    RunnableC1564.m5345();
                    break;
                case -2068824579:
                case -492500388:
                    break;
                case -2006385908:
                case 1993816745:
                    c1003M32145 = c1003M32145;
                    int i16 = i9 + i10;
                    i11 = i16 + i16;
                    if (RunnableC1606.f6488 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۖᩳ") + i5) * (-121);
                        i = ((iM11306 ^ i6) * (-29953)) ^ 1903014608;
                        i2 = 761544648;
                    } else {
                        iM11306 = (i5 - C19806.m45029("ۨۖ")) * (-103);
                        i = ((iM11306 ^ i6) * 9669) ^ 1416396617;
                        i2 = -582918601;
                    }
                    C1003 c1003 = c1003M32145;
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    c1003M32145 = c1003;
                    break;
                case -1874728834:
                case -82403948:
                    c1003M32145 = c1003M32145;
                    c1003M2312 = AbstractC0464.m2312();
                    if (c1003M2312 != null) {
                        iM11306 = (ThreadFactoryC3888.m11306("۬᩹") ^ i5) * 13;
                        i = ((iM11306 ^ i6) * 12001) ^ 1075798647;
                        i2 = -240361194;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۨ֨") ^ i5;
                        i = ((iM11306 ^ i6) * (-29237)) ^ 1372431817;
                        i2 = 1570844151;
                    }
                    C1003 c1004 = c1003M32145;
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    c1003M32145 = c1004;
                    break;
                case -1860258775:
                case -541940174:
                    c1003M32145 = m32145(c1003M2312);
                    str2 = "";
                    if (ThreadFactoryC3888.m11300() <= 0) {
                        iM11307 = (ThreadFactoryC3888.m11306("۟ۘ") + i6) * (-49);
                        i3 = ((iM11307 ^ i5) * (-9133)) ^ (-1539941209);
                        i4 = -710170143;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("ۘ۠") ^ i6;
                        i3 = ((iM11307 ^ i5) * (-25355)) ^ (-1408135348);
                        i4 = 497565723;
                    }
                    i8 = iM11307 ^ i4;
                    i7 = i3;
                    break;
                case -1723037210:
                case 623655555:
                    c1003M32145 = c1003M32145;
                    s = sArr[c];
                    if (C0962.f3784) {
                        iM11306 = C19806.m45029("ۜ᩷") ^ i5;
                        i = ((iM11306 ^ i6) * 3823) ^ (-1203330545);
                        i2 = 1123839704;
                    } else {
                        iM11306 = C19806.m45029("ᩴܳ") ^ i5;
                        i = ((iM11306 ^ i6) * 17813) ^ 1414562516;
                        i2 = -197143645;
                    }
                    C1003 c1005 = c1003M32145;
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    c1003M32145 = c1005;
                    break;
                case -1689241424:
                case 1676821621:
                    C2788.m8472();
                    if (C0216.m1591() <= 0) {
                        iM11307 = (ThreadFactoryC3888.m11306("۟ۘ") + i6) * (-49);
                        i3 = ((iM11307 ^ i5) * (-9133)) ^ (-1539941209);
                        i4 = -710170143;
                    } else {
                        iM11307 = (C19806.m45029("ܰۜ") + i6) * 71;
                        i3 = ((iM11307 ^ i5) * (-7721)) ^ 681187436;
                        i4 = -396742901;
                    }
                    i8 = iM11307 ^ i4;
                    i7 = i3;
                    break;
                case -1599059948:
                case -200469670:
                    if (AbstractC0464.m2315(str, c1003M2312.f4687)) {
                        iM11306 = C19806.m45029("ܶ֫") ^ i5;
                        c1003M32145 = c1003M32145;
                        i = ((iM11306 ^ i6) * (-16061)) ^ 1337142460;
                        i2 = 1622589292;
                    } else {
                        c1003M32145 = c1003M32145;
                        iM11306 = ThreadFactoryC3888.m11306("ۨ֨") ^ i5;
                        i = ((iM11306 ^ i6) * (-29237)) ^ 1372431817;
                        i2 = 1570844151;
                    }
                    C1003 c1006 = c1003M32145;
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    c1003M32145 = c1006;
                    break;
                case -1398479274:
                case 135110055:
                    c1003M32145 = c1003M32145;
                    if (AbstractC0464.m2315(MenuItemOnMenuItemClickListenerC3244.m9715(sArr2, i13, i14, i12), c1003M2312.f4682)) {
                        iM11306 = ThreadFactoryC3888.m11306("ۘᩴ") ^ i5;
                        i = ((iM11306 ^ i6) * 21839) ^ 1718778002;
                        i2 = 1258881453;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۨ֨") ^ i5;
                        i = ((iM11306 ^ i6) * (-29237)) ^ 1372431817;
                        i2 = 1570844151;
                    }
                    C1003 c1007 = c1003M32145;
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    c1003M32145 = c1007;
                    break;
                case -1359859118:
                case 1117310776:
                    c1003M32145 = c1003M32145;
                    sArr2 = f43355;
                    i13 = 41;
                    if (C0278.f1572 <= 0) {
                        iM11306 = (C19806.m45029("ۘۘ") + i6) * (-119);
                        i = ((iM11306 ^ i5) * (-26299)) ^ 437730883;
                        i2 = -556624729;
                    } else {
                        iM11306 = (C19806.m45029("ۜۢ") + i6) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM11306 ^ i5) * 25403) ^ (-1287373668);
                        i2 = -271874518;
                    }
                    C1003 c1008 = c1003M32145;
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    c1003M32145 = c1008;
                    break;
                case -1162307214:
                case 2069005824:
                    C0671.m3008();
                    C3577.m10565();
                    iM11307 = (ThreadFactoryC3888.m11306("۟ۘ") + i6) * (-49);
                    i3 = ((iM11307 ^ i5) * (-9133)) ^ (-1539941209);
                    i4 = -710170143;
                    i8 = iM11307 ^ i4;
                    i7 = i3;
                    break;
                case -1049562502:
                case -191978929:
                    i12 = 14166;
                    iM11306 = (i6 - C19806.m45029("᩵ۖ")) * (-93);
                    i = ((iM11306 ^ i5) * 15763) ^ (-4308275);
                    i2 = -231593848;
                    C1003 c1009 = c1003M32145;
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    c1003M32145 = c1009;
                    break;
                case -995459344:
                case 1261966583:
                    c1003M32145 = c1003M32145;
                    i9 = s * s;
                    i10 = 129709321;
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM11306 = C19806.m45029("ܿۙ") ^ i6;
                        i = ((iM11306 ^ i5) * (-1539)) ^ 1922019807;
                        i2 = 1066471488;
                    } else {
                        iM11306 = (C19806.m45029("ۘۘ") + i6) * (-119);
                        i = ((iM11306 ^ i5) * (-26299)) ^ 437730883;
                        i2 = -556624729;
                    }
                    C1003 c10010 = c1003M32145;
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    c1003M32145 = c10010;
                    break;
                case -719282102:
                case -34046552:
                    if (RunnableC0195.f1321 >= 0) {
                        c1003M32145 = c1003M32145;
                        iM11306 = (ThreadFactoryC3888.m11306("ۖᩳ") + i5) * (-121);
                        i = ((iM11306 ^ i6) * (-29953)) ^ 1903014608;
                        i2 = 761544648;
                        C1003 c10011 = c1003M32145;
                        i8 = iM11306 ^ i2;
                        i7 = i;
                        c1003M32145 = c10011;
                    } else {
                        iM11307 = (ThreadFactoryC3888.m11306("۟ۘ") + i6) * (-49);
                        i3 = ((iM11307 ^ i5) * (-9133)) ^ (-1539941209);
                        i4 = -710170143;
                        i8 = iM11307 ^ i4;
                        i7 = i3;
                    }
                    break;
                case -132773246:
                case 416755189:
                    c1003M32145 = c1003M32145;
                    s2 = 11389;
                    if (C1875.f7103 >= 0) {
                        iM11306 = (C19806.m45029("ۘۘ") + i6) * (-119);
                        i = ((iM11306 ^ i5) * (-26299)) ^ 437730883;
                        i2 = -556624729;
                    } else {
                        iM11306 = (C19806.m45029("ۡۡ") + i6) * (-99);
                        i = ((iM11306 ^ i5) * (-22581)) ^ (-443154791);
                        i2 = -1756226710;
                    }
                    C1003 c10012 = c1003M32145;
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    c1003M32145 = c10012;
                    break;
                case 90343311:
                case 828520204:
                    if (ThreadFactoryC3888.m11300() <= 0) {
                        c1003M32145 = c1003M32145;
                        iM11306 = C19806.m45029("ۜ᩷") ^ i5;
                        i = ((iM11306 ^ i6) * 3823) ^ (-1203330545);
                        i2 = 1123839704;
                        C1003 c10013 = c1003M32145;
                        i8 = iM11306 ^ i2;
                        i7 = i;
                        c1003M32145 = c10013;
                    } else {
                        iM11307 = (C19806.m45029("ܰۜ") + i6) * 71;
                        i3 = ((iM11307 ^ i5) * (-7721)) ^ 681187436;
                        i4 = -396742901;
                        i8 = iM11307 ^ i4;
                        i7 = i3;
                    }
                    break;
                case 158450053:
                case 1887904321:
                    c1003M32145.f4687 = str2;
                    c1003M32145.f4685 = str2;
                    m32164(c1003M32145);
                    c1003M32145 = c1003M32145;
                    iM11306 = ThreadFactoryC3888.m11306("ۨ֨") ^ i5;
                    i = ((iM11306 ^ i6) * (-29237)) ^ 1372431817;
                    i2 = 1570844151;
                    C1003 c10014 = c1003M32145;
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    c1003M32145 = c10014;
                    break;
                case 320279760:
                case 1941051379:
                    c1003M32145 = c1003M32145;
                    c = '(';
                    if (C1189.f5284 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۖᩳ") + i5) * (-121);
                        i = ((iM11306 ^ i6) * (-29953)) ^ 1903014608;
                        i2 = 761544648;
                    } else {
                        iM11306 = C19806.m45029("ᩳۚ") ^ i6;
                        i = ((iM11306 ^ i5) * 31741) ^ 584044838;
                        i2 = 1818873303;
                    }
                    C1003 c10015 = c1003M32145;
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    c1003M32145 = c10015;
                    break;
                case 688132298:
                case 1115428529:
                    i12 = 40088;
                    iM11306 = (i6 - C19806.m45029("᩵ۖ")) * (-93);
                    i = ((iM11306 ^ i5) * 15763) ^ (-4308275);
                    i2 = -231593848;
                    C1003 c10016 = c1003M32145;
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    c1003M32145 = c10016;
                    break;
                case 870913363:
                case 2143904641:
                    c1003M32145 = c1003M32145;
                    sArr = f43355;
                    if (C0526.f2219) {
                        iM11306 = (C19806.m45029("ۘۘ") + i6) * (-119);
                        i = ((iM11306 ^ i5) * (-26299)) ^ 437730883;
                        i2 = -556624729;
                    } else {
                        iM11306 = (i5 - ThreadFactoryC3888.m11306("ܳۘ")) * (-79);
                        i = ((iM11306 ^ i6) * (-4243)) ^ (-989142574);
                        i2 = 2114912629;
                    }
                    C1003 c10017 = c1003M32145;
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    c1003M32145 = c10017;
                    break;
                case 1041974445:
                case 1780959056:
                    c1003M32145 = c1003M32145;
                    int i17 = s + s2;
                    if ((i17 * i17) - i11 <= 0) {
                        iM11306 = C19806.m45029("᩺ۗ") ^ i5;
                        i = ((iM11306 ^ i6) * (-1401)) ^ 1031150392;
                        i2 = -1778133188;
                    } else {
                        iM11306 = C19806.m45029("᩹ܺ") ^ i6;
                        i = ((iM11306 ^ i5) * (-15233)) ^ (-568822190);
                        i2 = -1110748099;
                    }
                    C1003 c10018 = c1003M32145;
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    c1003M32145 = c10018;
                    break;
                case 1424905856:
                case 1924845180:
                    c1003M32145.f4682 = str2;
                    if (C3722.m10894() <= 0) {
                        iM11307 = (C19806.m45029("ܰۜ") + i6) * 71;
                        i3 = ((iM11307 ^ i5) * (-7721)) ^ 681187436;
                        i4 = -396742901;
                    } else {
                        iM11307 = (i5 - C19806.m45029("᩹۫")) * 109;
                        i3 = ((iM11307 ^ i6) * 11679) ^ (-756595186);
                        i4 = 1523506656;
                    }
                    i8 = iM11307 ^ i4;
                    i7 = i3;
                    break;
                default:
                    c1003M32145 = c1003M32145;
                    i14 = 5;
                    if (C0962.f3784) {
                        iM11306 = C19806.m45029("ۜ᩷") ^ i5;
                        i = ((iM11306 ^ i6) * 3823) ^ (-1203330545);
                        i2 = 1123839704;
                    } else {
                        iM11306 = C19806.m45029("ۧܳ") ^ i6;
                        i = ((iM11306 ^ i5) * (-31305)) ^ 1185158269;
                        i2 = 1095470360;
                    }
                    C1003 c10019 = c1003M32145;
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    c1003M32145 = c10019;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m32155(C15759 c15759, byte[] bArr) throws IOException {
        FileOutputStream fileOutputStreamM37494 = null;
        IOException e = null;
        boolean zEquals = false;
        int i = 408366158;
        int i2 = C0050.f912;
        int i3 = C2788.f10625;
        int iM45029 = C19806.m45029("۟ۘ") ^ i2;
        int i4 = ((iM45029 ^ i3) * (-22409)) ^ (-590655207);
        int i5 = 983117201;
        while (true) {
            i = ((((i ^ i3) * (-27687)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -1997681209:
                case 128007558:
                    if (C0817.f3443) {
                        iM45029 = (i3 - C19806.m45029("᩷ᩴ")) * 127;
                        i4 = ((iM45029 ^ i2) * 9037) ^ 1407655945;
                        i5 = -257246399;
                    } else {
                        iM45029 = (C19806.m45029("۠ۤ") + i2) * (-39);
                        i4 = ((iM45029 ^ i3) * (-24757)) ^ (-657050244);
                        i5 = 1045072387;
                    }
                    break;
                case -1895616027:
                case 1610549743:
                    c15759.m37497(fileOutputStreamM37494);
                    throw e;
                case -1880133552:
                case 797822295:
                    if (C1461.f5957 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֡ܰ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-4921)) ^ 1188064758;
                        i5 = -1921987585;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ܰᩳ")) * 93;
                        i4 = ((iM45029 ^ i3) * 849) ^ (-1885060599);
                        i5 = -768740811;
                    }
                    break;
                case -1856540641:
                case 1200287379:
                    if (C1460.m5050() != 0) {
                        iM45029 = C19806.m45029("᩻ۚ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-24661)) ^ 171816406;
                        i5 = -681664580;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ܺᩴ")) * 119;
                        i4 = ((iM45029 ^ i2) * 19925) ^ (-1628360730);
                        i5 = 1912144802;
                    }
                    break;
                case -1776427920:
                case 411952637:
                    if (C1398.f5802 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۟᩺") ^ i3;
                        i4 = ((iM45029 ^ i2) * 3605) ^ (-5292097);
                        i5 = -2004861054;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۡ۫") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-31571)) ^ (-1059383868);
                        i5 = 868605196;
                    }
                    break;
                case -1686684192:
                case -1528061416:
                    ViewTreeObserverOnPreDrawListenerC3327.m9874();
                    if (C1419.f5860 < 0) {
                        iM45029 = C19806.m45029("᩺۟") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-16385)) ^ 2083390800;
                        i5 = -546798626;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֡ܰ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-4921)) ^ 1188064758;
                        i5 = -1921987585;
                    }
                    break;
                case -1540875958:
                case -693700486:
                    if (C2871.m8646()) {
                        iM45029 = C19806.m45029("۠ۜ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-23637)) ^ (-446102460);
                        i5 = 1510031738;
                    } else {
                        iM45029 = C19806.m45029("᩺۟") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-16385)) ^ 2083390800;
                        i5 = -546798626;
                    }
                    break;
                case -1412870071:
                case 82087150:
                    if (RunnableC3388.f12514 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۟᩺") ^ i3;
                        i4 = ((iM45029 ^ i2) * 3605) ^ (-5292097);
                        i5 = -2004861054;
                    } else {
                        iM45029 = C19806.m45029("ۧ۟") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-1043)) ^ 1434100709;
                        i5 = -578996956;
                    }
                    break;
                case -1378804686:
                case -1258136720:
                    C3286.m9798();
                    if (RunnableC1606.m5473() != 0) {
                        iM45029 = C19806.m45029("᩻ۚ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-24661)) ^ 171816406;
                        i5 = -681664580;
                    } else {
                        iM45029 = C19806.m45029("᩺۟") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-16385)) ^ 2083390800;
                        i5 = -546798626;
                    }
                    break;
                case -1342647309:
                case -1051007053:
                    C0278.m1789();
                    if (!ViewTreeObserverOnPreDrawListenerC3327.m9874()) {
                        iM45029 = C19806.m45029("᩹ۡ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 21153) ^ (-1500156619);
                        i5 = -1719966622;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۟᩺") ^ i3;
                        i4 = ((iM45029 ^ i2) * 3605) ^ (-5292097);
                        i5 = -2004861054;
                    }
                    break;
                case -796037901:
                case 6535526:
                    if (C1937.f7317 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֡ܰ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-4921)) ^ 1188064758;
                        i5 = -1921987585;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܿܳ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 26073) ^ 1762789368;
                        i5 = -993545232;
                    }
                    break;
                case -775228955:
                case 1234190248:
                    return;
                case -490741619:
                case 176509613:
                    C1377.m4833();
                    if (!C10634.m26820()) {
                        iM45029 = ThreadFactoryC3888.m11306("֡ܰ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-4921)) ^ 1188064758;
                        i5 = -1921987585;
                    } else {
                        iM45029 = C19806.m45029("᩹ۡ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 21153) ^ (-1500156619);
                        i5 = -1719966622;
                    }
                    break;
                case -280437818:
                case 287593691:
                    fileOutputStreamM37494 = c15759.m37494();
                    iM45029 = ThreadFactoryC3888.m11306("ۙۖ") ^ i3;
                    i4 = ((iM45029 ^ i2) * (-18339)) ^ (-904960808);
                    i5 = -424550001;
                    break;
                case -9694218:
                case 1567504943:
                    ThreadFactoryC3888.m11300();
                    iM45029 = C19806.m45029("᩹ۡ") ^ i3;
                    i4 = ((iM45029 ^ i2) * 21153) ^ (-1500156619);
                    i5 = -1719966622;
                    break;
                case 152909258:
                case 2033362965:
                    if (RunnableC3388.f12514 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۟᩺") ^ i3;
                        i4 = ((iM45029 ^ i2) * 3605) ^ (-5292097);
                        i5 = -2004861054;
                    } else {
                        iM45029 = (C19806.m45029("ۙᩳ") ^ i3) * 83;
                        i4 = ((iM45029 ^ i2) * SecP160R2Field.PInv33) ^ (-89007178);
                        i5 = -902384780;
                    }
                    break;
                case 438558450:
                case 2146408645:
                    if (ViewGroupOnHierarchyChangeListenerC1916.m6233() != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֡ܰ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-4921)) ^ 1188064758;
                        i5 = -1921987585;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܳܰ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-21295)) ^ (-1487272625);
                        i5 = -787840923;
                    }
                    break;
                case 771532798:
                case 1190910669:
                    throw new IOException();
                case 861917252:
                case 1953849876:
                    try {
                        fileOutputStreamM37494.write(bArr);
                        fileOutputStreamM37494.getFD().sync();
                        c15759.m37500(fileOutputStreamM37494);
                        zEquals = Arrays.equals(bArr, c15759.m37502());
                        iM45029 = (ThreadFactoryC3888.m11306("۠ۛ") ^ i3) * 115;
                        i4 = ((iM45029 ^ i2) * 27641) ^ (-337886316);
                        i5 = 670296002;
                    } catch (IOException e2) {
                        e = e2;
                        iM45029 = (i2 - C19806.m45029("۟۬")) * (-107);
                        i4 = ((iM45029 ^ i3) * (-9691)) ^ (-161039406);
                        i5 = -1517376565;
                    }
                    break;
                case 1039397109:
                case 1329085269:
                    if (zEquals) {
                        iM45029 = ThreadFactoryC3888.m11306("֡ۜ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 30737) ^ (-347180285);
                        i5 = 96080656;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۟ۛ") ^ i2) * 45;
                        i4 = ((iM45029 ^ i3) * 26247) ^ (-100600880);
                        i5 = 630620126;
                    }
                    break;
                case 1243699974:
                case 1991471019:
                    if (C3743.m10966() <= 0) {
                        iM45029 = C19806.m45029("᩻ۚ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-24661)) ^ 171816406;
                        i5 = -681664580;
                    } else {
                        iM45029 = (C19806.m45029("ܽ֡") + i2) * 61;
                        i4 = ((iM45029 ^ i3) * 6543) ^ (-654483133);
                        i5 = -251952527;
                    }
                    break;
                case 1284945212:
                case 1638043860:
                    C3660.m10791();
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    return;
                default:
                    C2871.m8646();
                    if (RunnableC0195.f1321 >= 0) {
                        iM45029 = C19806.m45029("᩺۟") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-16385)) ^ 2083390800;
                        i5 = -546798626;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֨ۖ") ^ i3) * (-103);
                        i4 = ((iM45029 ^ i2) * (-11473)) ^ (-720789641);
                        i5 = 1086948362;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m32157(byte[] bArr) {
        int iM11306;
        int i;
        byte[] bArrDigest = null;
        int i2 = 1665453578;
        int i3 = C3535.f13026;
        int i4 = C1066.f4915;
        int iM11307 = (i3 - ThreadFactoryC3888.m11306("ܶۜ")) * (-65);
        int i5 = ((iM11307 ^ i4) * (-18059)) ^ (-1643051842);
        int i6 = -1605838605;
        while (true) {
            int i7 = iM11307 ^ i6;
            C11018 c11018 = null;
            while (true) {
                i2 = ((((i2 ^ i4) * 31261) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2028187540:
                    case 1669775049:
                        if (C0526.f2219) {
                            iM11307 = C19806.m45029("۟᩻") ^ i3;
                            i5 = ((iM11307 ^ i4) * (-51)) ^ (-858694612);
                            i6 = 579219292;
                        }
                        iM11306 = ThreadFactoryC3888.m11306("ۛ۫") ^ i3;
                        i5 = ((iM11306 ^ i4) * 3217) ^ 1721662171;
                        i = 2056259586;
                        i7 = iM11306 ^ i;
                        break;
                    case -804140400:
                    case 1572148767:
                        bArrDigest = C22253.m49421().digest(bArr);
                        if (RunnableC1606.m5473() == 0) {
                            iM11306 = (ThreadFactoryC3888.m11306("ۜ᩹") ^ i4) * 15;
                            i5 = ((iM11306 ^ i3) * 5515) ^ 753784426;
                            i = -1865505695;
                            i7 = iM11306 ^ i;
                        } else {
                            iM11307 = C19806.m45029("۟᩻") ^ i3;
                            i5 = ((iM11307 ^ i4) * (-51)) ^ (-858694612);
                            i6 = 579219292;
                        }
                        break;
                    case -617390385:
                    case 1368709703:
                        C2332.m7079();
                        if (!RunnableC1564.m5345()) {
                            iM11307 = C19806.m45029("۟᩻") ^ i3;
                            i5 = ((iM11307 ^ i4) * (-51)) ^ (-858694612);
                            i6 = 579219292;
                        } else {
                            iM11307 = (i3 - C19806.m45029("ۢۗ")) * 25;
                            i5 = ((iM11307 ^ i4) * 24763) ^ 357092659;
                            i6 = 938042987;
                        }
                        break;
                    case -477279746:
                    case 1798912945:
                        if (RunnableC3388.f12514 < 0) {
                            iM11307 = (ThreadFactoryC3888.m11306("᩺ۢ") ^ i4) * 17;
                            i5 = ((iM11307 ^ i3) * 1851) ^ 1209901958;
                            i6 = -1573486097;
                        }
                        iM11306 = ThreadFactoryC3888.m11306("ۛ۫") ^ i3;
                        i5 = ((iM11306 ^ i4) * 3217) ^ 1721662171;
                        i = 2056259586;
                        i7 = iM11306 ^ i;
                        break;
                    case -288518278:
                    case 2103901247:
                        C2477.m7593();
                        return null;
                    case -107012660:
                    case -16321728:
                        c11018.write(bArr);
                        if (!C3286.f12186) {
                            iM11306 = (C19806.m45029("֨ܿ") + i3) * (-71);
                            i5 = ((iM11306 ^ i4) * 31609) ^ 1486219047;
                            i = 891926937;
                            i7 = iM11306 ^ i;
                        } else {
                            iM11307 = ThreadFactoryC3888.m11306("ܽ۫") ^ i4;
                            i5 = ((iM11307 ^ i3) * 30731) ^ (-1725139907);
                            i6 = 875041895;
                        }
                        break;
                    case 134472948:
                    case 216943031:
                        if (C3660.f13403 < 0) {
                            if (C2704.f10408) {
                                if (C2477.m7593() < 0) {
                                    if (C2871.f10837 < 0) {
                                        if (RunnableC1606.f6488 >= 0) {
                                            iM11307 = C19806.m45029("۟᩻") ^ i3;
                                            i5 = ((iM11307 ^ i4) * (-51)) ^ (-858694612);
                                            i6 = 579219292;
                                            break;
                                        } else if (C1419.f5860 < 0 && !C19806.f63586) {
                                            c11018 = new C11018();
                                            if (ViewTreeObserverOnPreDrawListenerC3327.f12317 > 0) {
                                                iM11306 = ThreadFactoryC3888.m11306("᩵ۙ") ^ i4;
                                                i5 = ((iM11306 ^ i3) * 30341) ^ 876936773;
                                                i = -1675620442;
                                                i7 = iM11306 ^ i;
                                                break;
                                            }
                                        }
                                    }
                                }
                                iM11307 = (ThreadFactoryC3888.m11306("᩺ۢ") ^ i4) * 17;
                                i5 = ((iM11307 ^ i3) * 1851) ^ 1209901958;
                                i6 = -1573486097;
                                break;
                            }
                            iM11307 = ThreadFactoryC3888.m11306("ܽ۫") ^ i4;
                            i5 = ((iM11307 ^ i3) * 30731) ^ (-1725139907);
                            i6 = 875041895;
                        } else {
                            iM11307 = (i3 - C19806.m45029("ۢۗ")) * 25;
                            i5 = ((iM11307 ^ i4) * 24763) ^ 357092659;
                            i6 = 938042987;
                        }
                        break;
                    case 628158317:
                    case 735457063:
                        RunnableC0195.m1431();
                        iM11307 = C19806.m45029("۟᩻") ^ i3;
                        i5 = ((iM11307 ^ i4) * (-51)) ^ (-858694612);
                        i6 = 579219292;
                        break;
                    default:
                        c11018.write(bArrDigest);
                        return c11018.m27773();
                }
            }
        }
    }
}
