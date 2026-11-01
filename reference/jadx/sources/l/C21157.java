package l;

import android.annotation.SuppressLint;
import bin.mt.plugin.api.LocalString;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Set;
import moe.shizuku.server.IShizukuService;
import org.json.JSONException;

/* JADX INFO: renamed from: l.᩷᩹ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: B3Z3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21157 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static Writer f68894;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static String f68895;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    @SuppressLint({"SimpleDateFormat"})
    public static final SimpleDateFormat f68896;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static String f68897;

    /* JADX INFO: renamed from: ۧᩳ۬, reason: not valid java name and contains not printable characters */
    private static final short[] f68898 = {9765, 28030, 28030, 27916, 27995, 27995, 27916, 27973, 27973, 27928, 28005, 28005, 28005, 5174, -19239, 249, 25345, 25373, 25348, 25366, 25368, 25375, 25439, 25373, 25374, 25366, 6284, 22866, 22798, 22866, 169, -5858, -5867, -5870, -5806, -5871, -5880, -5806, -5876, -5872, -5879, -5861, -5867, -5870, -5806, -5873, -5883, -5873, -5880, -5863, -5871, 9170, 16168, 16165, 16168, 5022, -13133, -13093, -13106, -13158, -13079, -13105, -13110, -13110, -13112, -13089, -13111, -13111, -13089, -13090, -13184, -13158, -13133, -13063, -13093, -13105, -13111, -13089, -13090, -13158, -13096, -13117, -13184, -13158, -13716, -13715, -13726, -13725, -13728, -13727, -13722, -13723, -13734, -13733, -13736, -13730, -13729, -13732, -13731, -13742, -13743, -13738, 8987, -21442, -21396, -21388, -21378, -21403, -21388, -21406, -21381, -21386, -21403, -21481, -21403, -21390, -21391, -21390, -21403, -21390, -21383, -21388, -21390, -21491, -21398, -21442, -21479, -21479, -21479, -21481, -21481, -21414, -21416, -21435, -21422, -21442, -21418, -21437, -21481, -21442, -21404, -21438, -21433, -21433, -21435, -21422, -21436, -21436, -21422, -21421, -21491, -21481, -21791, -21792, -21777, -21778, -21779, -21780, -21781, -21784, -21801, -21802, -21803, -21805, -21806, -21807, -21808, -21793, -21796, -21797, -21388, -21418, -21438, -21436, -21422, -21421, -21481, -21419, -21426, -21491, -21481, 636, -8763, -8760, -8761, -8754, 7982, -4016, -4020, -4011, -4025, -4023, -4018, -4082, -4020, -4017, -4025};

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final StringBuilder f68899;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C0074 f68900;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static C0074 f68901;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized void m47597() {
        short s = f68898[15];
        int i = s + 13196;
        int i2 = (i * i) - (s * 52784) >= 0 ? 25457 : 27651;
        synchronized (C21157.class) {
            new File(C16737.m39285(), C0216.m1588(f68898, 16, 10, i2)).delete();
            f68894 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized void m47600(String str, String str2) {
        short s = f68898[51];
        int i = 71328 * s;
        int i2 = s + 17832;
        int i3 = i - (i2 * i2) > 0 ? 1731 : 16136;
        synchronized (C21157.class) {
            if (f68894 == null) {
                m47608();
                if (f68894 == null) {
                    return;
                }
            }
            StringBuilder sb = f68899;
            int i4 = 0;
            sb.setLength(0);
            C2788.m8480(sb, f68896.format(C3577.m10575(AbstractC0464.m2311())));
            C1148.m4223(sb, C2249.m6918(f68898, 52, 3, i3));
            C1148.m4223(sb, str);
            int iM3364 = C0797.m3364(sb);
            int iM10572 = C3577.m10572(str2, 10);
            boolean z = true;
            int i5 = 0;
            while (iM10572 != -1) {
                m47598(i5, iM10572, z ? 0 : iM3364, str2);
                i5 = iM10572 + 1;
                iM10572 = str2.indexOf(10, i5);
                z = false;
            }
            if (z || i5 != C1977.m6360(str2)) {
                int iM6360 = C1977.m6360(str2);
                if (!z) {
                    i4 = iM3364;
                }
                m47598(i5, iM6360, i4, str2);
            }
            try {
                f68894.write(C0817.m3407(f68899));
                f68894.flush();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static LocalString m47603() {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = -238055612;
        int i6 = RunnableC3388.f12514;
        int i7 = C2249.f8050;
        int iM45029 = (C19806.m45029("۠֫") ^ i6) * (-103);
        int i8 = ((iM45029 ^ i7) * (-28943)) ^ (-1851933169);
        int i9 = -1859882108;
        while (true) {
            i5 = ((((i5 ^ i7) * (-10263)) >> 31) & i8) ^ (iM45029 ^ i9);
            switch (i5) {
                case -1949587520:
                case 371082741:
                    if (C1189.m4368() <= 0) {
                        iM45029 = C19806.m45029("ܶ᩹") ^ i7;
                        i8 = ((iM45029 ^ i6) * (-9679)) ^ (-307479979);
                        i9 = -1246737078;
                    } else {
                        iM45029 = (C19806.m45029("ۗᩴ") + i6) * 127;
                        i8 = ((iM45029 ^ i7) * 19547) ^ 1017543977;
                        i9 = -1627352767;
                    }
                    break;
                case -1814110164:
                case 1488014704:
                    C1668.m5583();
                    iM45029 = ThreadFactoryC3888.m11306("ܳܰ") ^ i6;
                    i8 = ((iM45029 ^ i7) * 15827) ^ (-1721560268);
                    i9 = 1424644366;
                    break;
                case -1529932142:
                case -950654359:
                    s = sArr[c];
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM45029 = C19806.m45029("ܶ᩹") ^ i7;
                        i8 = ((iM45029 ^ i6) * (-9679)) ^ (-307479979);
                        i9 = -1246737078;
                    } else {
                        iM45029 = C19806.m45029("ۜ֫") ^ i7;
                        i8 = ((iM45029 ^ i6) * (-29247)) ^ 1712375221;
                        i9 = -1394951127;
                    }
                    break;
                case -1475729018:
                case 601669373:
                    return f68901;
                case -906572784:
                case 1976821286:
                    C2124.m6673();
                    if (RunnableC3388.f12514 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("۟۟") ^ i6) * (-15);
                        i8 = ((iM45029 ^ i7) * (-9579)) ^ (-299639861);
                        i9 = -1831822857;
                    } else {
                        iM45029 = C19806.m45029("ۤܺ") ^ i7;
                        i8 = ((iM45029 ^ i6) * 28229) ^ (-76239678);
                        i9 = 1404923285;
                    }
                    break;
                case -890614036:
                case 539747055:
                    C1419.m4973();
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    return null;
                case -683717584:
                case 473709588:
                    i4 = 56745;
                    iM45029 = C19806.m45029("ܿ᩵") ^ i6;
                    i8 = ((iM45029 ^ i7) * 5165) ^ (-1424811826);
                    i9 = 2116414523;
                    break;
                case -660608716:
                case 499977788:
                    i2 = s * s;
                    i3 = 14280841;
                    if (C0050.f912 <= 0) {
                        iM45029 = C19806.m45029("ۤܺ") ^ i7;
                        i8 = ((iM45029 ^ i6) * 28229) ^ (-76239678);
                        i9 = 1404923285;
                    } else {
                        iM45029 = C19806.m45029("ۢᩳ") ^ i7;
                        i8 = ((iM45029 ^ i6) * (-18499)) ^ (-746359020);
                        i9 = 414357055;
                    }
                    break;
                case -657381247:
                case 1452823848:
                    if ((i2 + i3) - i < 0) {
                        iM45029 = (C19806.m45029("ۧ֡") + i7) * (-113);
                        i8 = ((iM45029 ^ i6) * (-25415)) ^ (-1394133673);
                        i9 = 1663451316;
                    } else {
                        iM45029 = (C19806.m45029("ܶۧ") + i6) * 49;
                        i8 = ((iM45029 ^ i7) * (-18437)) ^ 943990273;
                        i9 = -379245312;
                    }
                    break;
                case -534387054:
                case 294938514:
                    if (f68901 == null) {
                        iM45029 = (ThreadFactoryC3888.m11306("۫ܺ") + i7) * (-101);
                        i8 = ((iM45029 ^ i6) * 12401) ^ (-1118997809);
                        i9 = -256564244;
                    } else {
                        iM45029 = (i6 - C19806.m45029("ۧ֨")) * 109;
                        i8 = ((iM45029 ^ i7) * (-3529)) ^ (-1705442252);
                        i9 = -301776064;
                    }
                    break;
                case -389264698:
                case 2110353868:
                    short[] sArr2 = f68898;
                    if (C0629.f2722 > 0) {
                        if (C1875.f7103 >= 0) {
                            iM45029 = C19806.m45029("ܰܽ") ^ i7;
                            i8 = ((iM45029 ^ i6) * 9021) ^ 606000111;
                            i9 = -622850695;
                            break;
                        } else if (C1398.f5802 > 0) {
                            f68901 = new C0074(C1668.m5577(sArr2, 182, 4, i4));
                            iM45029 = (i6 - C19806.m45029("ۧ֨")) * 109;
                            i8 = ((iM45029 ^ i7) * (-3529)) ^ (-1705442252);
                            i9 = -301776064;
                            break;
                        }
                    }
                    iM45029 = (ThreadFactoryC3888.m11306("۟۟") ^ i6) * (-15);
                    i8 = ((iM45029 ^ i7) * (-9579)) ^ (-299639861);
                    i9 = -1831822857;
                    break;
                case -34689915:
                case 96515429:
                    if (C3286.m9798() <= 0) {
                        iM45029 = C19806.m45029("ۤܺ") ^ i7;
                        i8 = ((iM45029 ^ i6) * 28229) ^ (-76239678);
                        i9 = 1404923285;
                    } else {
                        iM45029 = C19806.m45029("ۜܶ") ^ i7;
                        i8 = ((iM45029 ^ i6) * 487) ^ (-324653827);
                        i9 = 1689033767;
                    }
                    break;
                case 444840475:
                case 784691293:
                    if (!C0817.f3443) {
                        iM45029 = C19806.m45029("ܶ᩹") ^ i7;
                        i8 = ((iM45029 ^ i6) * (-9679)) ^ (-307479979);
                        i9 = -1246737078;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܳܰ") ^ i6;
                        i8 = ((iM45029 ^ i7) * 15827) ^ (-1721560268);
                        i9 = 1424644366;
                    }
                    break;
                case 620611612:
                case 1894670259:
                    i4 = 37030;
                    iM45029 = C19806.m45029("ܿ᩵") ^ i6;
                    i8 = ((iM45029 ^ i7) * 5165) ^ (-1424811826);
                    i9 = 2116414523;
                    break;
                case 791485848:
                case 1222459219:
                    if (C0671.f2816 != 0) {
                        iM45029 = C19806.m45029("ۤܺ") ^ i7;
                        i8 = ((iM45029 ^ i6) * 28229) ^ (-76239678);
                        i9 = 1404923285;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܳܰ") ^ i6;
                        i8 = ((iM45029 ^ i7) * 15827) ^ (-1721560268);
                        i9 = 1424644366;
                    }
                    break;
                case 1225458622:
                case 1300885613:
                    if (C1419.f5860 >= 0) {
                        iM45029 = C19806.m45029("ܶ᩹") ^ i7;
                        i8 = ((iM45029 ^ i6) * (-9679)) ^ (-307479979);
                        i9 = -1246737078;
                    } else {
                        iM45029 = C19806.m45029("᩶ۨ") ^ i6;
                        i8 = ((iM45029 ^ i7) * (-11687)) ^ (-297371737);
                        i9 = 365456717;
                    }
                    break;
                case 1824077577:
                case 1917056611:
                    i = s * 7558;
                    if (C10634.m26820()) {
                        iM45029 = C19806.m45029("ܰܽ") ^ i7;
                        i8 = ((iM45029 ^ i6) * 9021) ^ 606000111;
                        i9 = -622850695;
                    } else {
                        iM45029 = (i6 - C19806.m45029("ۜۛ")) * 5;
                        i8 = ((iM45029 ^ i7) * 32307) ^ 1261593173;
                        i9 = 198009212;
                    }
                    break;
                default:
                    sArr = f68898;
                    c = 181;
                    if (C3660.f13403 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("۟۟") ^ i6) * (-15);
                        i8 = ((iM45029 ^ i7) * (-9579)) ^ (-299639861);
                        i9 = -1831822857;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֫ܳ") ^ i7) * 59;
                        i8 = ((iM45029 ^ i6) * 15033) ^ (-844571199);
                        i9 = 445623408;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static String m47604() {
        String str = null;
        String str2 = null;
        int i = -966859215;
        int i2 = C1937.f7317;
        int i3 = C2871.f10837;
        int iM11306 = (ThreadFactoryC3888.m11306("۫ۜ") ^ i2) * (-35);
        int i4 = ((iM11306 ^ i3) * 1493) ^ (-1949544847);
        int i5 = 410040436;
        while (true) {
            i = ((((i ^ i3) * 15577) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2102181025:
                case -1535492731:
                    RunnableC3388.m10064();
                    return null;
                case -2099393641:
                case 139611445:
                    C0817.m3399();
                    iM11306 = C19806.m45029("۬ܺ") ^ i2;
                    i4 = ((iM11306 ^ i3) * 3013) ^ 583153137;
                    i5 = 1762651132;
                    break;
                case -2086558596:
                case -99324656:
                    if (C0817.f3443) {
                        iM11306 = C19806.m45029("᩺ۙ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 23159) ^ 796338629;
                        i5 = 859155207;
                    } else {
                        iM11306 = C19806.m45029("۬ܺ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 3013) ^ 583153137;
                        i5 = 1762651132;
                    }
                    break;
                case -1762096582:
                case -1367554209:
                    return str2;
                case -1651145054:
                case -661985803:
                    if (AbstractC0464.f2088 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("۬֨") + i2) * 115;
                        i4 = ((iM11306 ^ i3) * (-28965)) ^ (-861649664);
                        i5 = -1309197175;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ܰܺ")) * 57;
                        i4 = ((iM11306 ^ i2) * (-10561)) ^ 1572210330;
                        i5 = -259277560;
                    }
                    break;
                case -1169719440:
                case 1937767039:
                    if (C3722.f13525 <= 0) {
                        iM11306 = C19806.m45029("۬ܺ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 3013) ^ 583153137;
                        i5 = 1762651132;
                    } else {
                        iM11306 = (C19806.m45029("۬᩵") + i3) * 39;
                        i4 = ((iM11306 ^ i2) * (-28409)) ^ 308576126;
                        i5 = -1055510577;
                    }
                    break;
                case -1029780566:
                case 279293930:
                    if (C1460.m5050() != 0) {
                        iM11306 = C19806.m45029("۬ܺ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 3013) ^ 583153137;
                        i5 = 1762651132;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܳ᩷") ^ i3) * (-13);
                        i4 = ((iM11306 ^ i2) * (-25529)) ^ 46786888;
                        i5 = 114775337;
                    }
                    break;
                case -903876883:
                case 143871027:
                    if (C0962.m3746() >= 0) {
                        iM11306 = C19806.m45029("֫ܶ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 28907) ^ (-1234360321);
                        i5 = -2053629313;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩻᩶") ^ i3;
                        i4 = ((iM11306 ^ i2) * 17179) ^ (-365331311);
                        i5 = -1047746648;
                    }
                    break;
                case -657539876:
                case 372670144:
                    C1460.m5050();
                    if (!C3577.m10565()) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۧ᩶") ^ i3) * 25;
                        i4 = ((iM11306 ^ i2) * 32229) ^ (-951116996);
                        i5 = -77864004;
                    } else {
                        iM11306 = C19806.m45029("۬ܺ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 3013) ^ 583153137;
                        i5 = 1762651132;
                    }
                    break;
                case -582727752:
                case 703836041:
                    str = f68897;
                    if (C2249.f8050 >= 0) {
                        iM11306 = C19806.m45029("۬ܺ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 3013) ^ 583153137;
                        i5 = 1762651132;
                    } else {
                        iM11306 = (C19806.m45029("֨ۢ") + i2) * (-121);
                        i4 = ((iM11306 ^ i3) * 29551) ^ (-76154546);
                        i5 = 1683862996;
                    }
                    break;
                case -283943983:
                case 1929289930:
                    if (C0629.f2722 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۧ᩶") ^ i3) * 25;
                        i4 = ((iM11306 ^ i2) * 32229) ^ (-951116996);
                        i5 = -77864004;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩻ᩴ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 29807) ^ 1430955286;
                        i5 = 564188377;
                    }
                    break;
                case -137630779:
                case 1669049752:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM11306 = C19806.m45029("۬ܺ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 3013) ^ 583153137;
                        i5 = 1762651132;
                    } else {
                        iM11306 = C19806.m45029("۟᩹") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-3189)) ^ 606734414;
                        i5 = 1990732184;
                    }
                    break;
                case 36477311:
                case 1476170338:
                    C2249.m6915();
                    if (C1419.f5860 >= 0) {
                        iM11306 = C19806.m45029("۬ܺ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 3013) ^ 583153137;
                        i5 = 1762651132;
                    } else {
                        iM11306 = C19806.m45029("ܽ᩺") ^ i3;
                        i4 = ((iM11306 ^ i2) * 27063) ^ (-1933917192);
                        i5 = 1782469773;
                    }
                    break;
                case 272376828:
                case 1674672622:
                    str2 = "";
                    iM11306 = ThreadFactoryC3888.m11306("ۨ֡") ^ i2;
                    i4 = ((iM11306 ^ i3) * (-30323)) ^ (-1154311907);
                    i5 = 1170237835;
                    break;
                case 667637242:
                case 1960890561:
                    if (C3286.f12186) {
                        iM11306 = C19806.m45029("֫ܶ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 28907) ^ (-1234360321);
                        i5 = -2053629313;
                    } else {
                        iM11306 = C19806.m45029("ۚۖ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 689) ^ 1614809938;
                        i5 = -1234857123;
                    }
                    break;
                case 1286715944:
                case 1847908857:
                    C0797.m3359();
                    if (C2642.f10294 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("۬֨") + i2) * 115;
                        i4 = ((iM11306 ^ i3) * (-28965)) ^ (-861649664);
                        i5 = -1309197175;
                    } else {
                        iM11306 = C19806.m45029("۬ܺ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 3013) ^ 583153137;
                        i5 = 1762651132;
                    }
                    break;
                case 1574518028:
                case 1779529875:
                    if (str == null) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۜܰ") + i3) * 35;
                        i4 = ((iM11306 ^ i2) * 27943) ^ (-1057220439);
                        i5 = 1724691676;
                    } else {
                        str2 = str;
                        iM11306 = ThreadFactoryC3888.m11306("ۨ֡") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-30323)) ^ (-1154311907);
                        i5 = 1170237835;
                    }
                    break;
                default:
                    if (C3660.f13403 >= 0) {
                        iM11306 = C19806.m45029("۬ܺ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 3013) ^ 583153137;
                        i5 = 1762651132;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("֡ۘ")) * 67;
                        i4 = ((iM11306 ^ i3) * (-20529)) ^ 511217234;
                        i5 = 1891470952;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m47605(String str) {
        f68897 = str;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m47606() {
        String str = null;
        String str2 = null;
        int i = 498163465;
        int i2 = C2788.f10625;
        int i3 = C10634.f36300;
        int iM45029 = (C19806.m45029("ܶۙ") + i3) * 33;
        int i4 = ((iM45029 ^ i2) * 23519) ^ (-2013447562);
        int i5 = 1509737980;
        while (true) {
            i = ((((i ^ i2) * 32161) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2073385811:
                case -109637071:
                    if (C2788.f10625 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳ᩻") ^ i3;
                        i4 = ((iM45029 ^ i2) * 23175) ^ 550214742;
                        i5 = -1592624536;
                    } else {
                        iM45029 = C19806.m45029("᩶ܿ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 21527) ^ (-1225154852);
                        i5 = 102580225;
                    }
                    break;
                case -1882048804:
                case -926180012:
                    if (C1066.f4915 <= 0) {
                        iM45029 = (C19806.m45029("ۤۗ") ^ i3) * 85;
                        i4 = ((iM45029 ^ i2) * 9057) ^ 1279438388;
                        i5 = 248775725;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۠ۤ") + i2) * 31;
                        i4 = ((iM45029 ^ i3) * (-2887)) ^ (-692061739);
                        i5 = -769784261;
                    }
                    break;
                case -1592253361:
                case 1001750719:
                    if (str == null) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܶ֡") ^ i2) * 39;
                        i4 = ((iM45029 ^ i3) * 11637) ^ 1095433455;
                        i5 = 731788927;
                    } else {
                        str2 = str;
                        iM45029 = C19806.m45029("᩹᩻") ^ i3;
                        i4 = ((iM45029 ^ i2) * 31445) ^ 2082886537;
                        i5 = 383116400;
                    }
                    break;
                case -1445832903:
                case -47623173:
                    return str2;
                case -1417577245:
                case 225348295:
                    if (C0962.m3746() >= 0) {
                        iM45029 = C19806.m45029("᩹ۨ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 22035) ^ (-1991910245);
                        i5 = 22758862;
                    } else {
                        iM45029 = (i2 - C19806.m45029("ۤ۟")) * (-93);
                        i4 = ((iM45029 ^ i3) * 3187) ^ (-1415348770);
                        i5 = -375591746;
                    }
                    break;
                case -1367015699:
                case 974590557:
                    if (C1419.f5860 >= 0) {
                        iM45029 = (C19806.m45029("۬ܿ") + i2) * (-51);
                        i4 = ((iM45029 ^ i3) * (-7915)) ^ 1923881598;
                        i5 = 1600021980;
                    } else {
                        iM45029 = (C19806.m45029("֨ۡ") + i3) * (-41);
                        i4 = ((iM45029 ^ i2) * (-14699)) ^ (-462815082);
                        i5 = 1702422907;
                    }
                    break;
                case -1304825660:
                case 1757864992:
                    if (C0216.f1393 != 0) {
                        iM45029 = (C19806.m45029("۬ܿ") + i2) * (-51);
                        i4 = ((iM45029 ^ i3) * (-7915)) ^ 1923881598;
                        i5 = 1600021980;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ۗ֫")) * (-91);
                        i4 = ((iM45029 ^ i2) * (-1735)) ^ 2104491856;
                        i5 = -853193156;
                    }
                    break;
                case -1126540812:
                case 1108430971:
                    str2 = "";
                    iM45029 = C19806.m45029("᩹᩻") ^ i3;
                    i4 = ((iM45029 ^ i2) * 31445) ^ 2082886537;
                    i5 = 383116400;
                    break;
                case -1076523131:
                case -927123068:
                    C1419.m4973();
                    if (CallableC1627.m5507() != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳ᩻") ^ i3;
                        i4 = ((iM45029 ^ i2) * 23175) ^ 550214742;
                        i5 = -1592624536;
                    } else {
                        iM45029 = (C19806.m45029("ۤۗ") ^ i3) * 85;
                        i4 = ((iM45029 ^ i2) * 9057) ^ 1279438388;
                        i5 = 248775725;
                    }
                    break;
                case -968951438:
                case -855884372:
                    str = f68895;
                    if (C7105.m18985()) {
                        iM45029 = (C19806.m45029("۬ܿ") + i2) * (-51);
                        i4 = ((iM45029 ^ i3) * (-7915)) ^ 1923881598;
                        i5 = 1600021980;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩻ۢ") + i3) * (-35);
                        i4 = ((iM45029 ^ i2) * 28699) ^ (-1831754488);
                        i5 = 412566299;
                    }
                    break;
                case -739208866:
                case 2025918510:
                    if (C3743.f13569) {
                        iM45029 = C19806.m45029("۠ۨ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 31009) ^ 955540567;
                        i5 = 38841853;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳ᩻") ^ i3;
                        i4 = ((iM45029 ^ i2) * 23175) ^ 550214742;
                        i5 = -1592624536;
                    }
                    break;
                case -727521585:
                case 191737506:
                    if (C0278.f1572 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳ᩻") ^ i3;
                        i4 = ((iM45029 ^ i2) * 23175) ^ 550214742;
                        i5 = -1592624536;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۡ᩸") ^ i2;
                        i4 = ((iM45029 ^ i3) * 24023) ^ (-698486513);
                        i5 = -873620428;
                    }
                    break;
                case -726231913:
                case 428764858:
                    C2249.m6915();
                    if (C0050.m946() > 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳ᩻") ^ i3;
                        i4 = ((iM45029 ^ i2) * 23175) ^ 550214742;
                        i5 = -1592624536;
                    } else {
                        iM45029 = (C19806.m45029("ܳ᩵") + i2) * (-27);
                        i4 = ((iM45029 ^ i3) * 20239) ^ 444130044;
                        i5 = -798529315;
                    }
                    break;
                case -675374301:
                case 760828193:
                    if (C1668.f6641 >= 0) {
                        iM45029 = (C19806.m45029("ۤۗ") ^ i3) * 85;
                        i4 = ((iM45029 ^ i2) * 9057) ^ 1279438388;
                        i5 = 248775725;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩷᩶") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-12707)) ^ (-1719737474);
                        i5 = 222184048;
                    }
                    break;
                case -275668676:
                case 503552341:
                    if (C0526.f2219) {
                        iM45029 = C19806.m45029("᩹ۨ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 22035) ^ (-1991910245);
                        i5 = 22758862;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۛᩴ")) * 81;
                        i4 = ((iM45029 ^ i2) * 32515) ^ (-416049980);
                        i5 = -1199317946;
                    }
                    break;
                case 504744043:
                case 1419177582:
                    if (C0278.f1572 > 0) {
                        iM45029 = (C19806.m45029("۬ܿ") + i2) * (-51);
                        i4 = ((iM45029 ^ i3) * (-7915)) ^ 1923881598;
                        i5 = 1600021980;
                    } else {
                        iM45029 = (C19806.m45029("ۤۗ") ^ i3) * 85;
                        i4 = ((iM45029 ^ i2) * 9057) ^ 1279438388;
                        i5 = 248775725;
                    }
                    break;
                case 926645473:
                case 1046832009:
                    C7105.m18985();
                    iM45029 = (C19806.m45029("ۤۗ") ^ i3) * 85;
                    i4 = ((iM45029 ^ i2) * 9057) ^ 1279438388;
                    i5 = 248775725;
                    break;
                default:
                    C2871.m8646();
                    C0962.m3746();
                    return null;
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m47607(String str) {
        f68895 = str;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x01f5 A[PHI: r1
      0x01f5: PHI (r1v108 java.lang.String) = (r1v2 java.lang.String), (r1v97 java.lang.String), (r1v2 java.lang.String), (r1v2 java.lang.String) binds: [B:203:0x01f5, B:41:0x01f3, B:29:0x016f, B:223:0x01f5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x013d, code lost:
    
        if (l.ViewGroupOnHierarchyChangeListenerC1916.f7262 == false) goto L24;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m47601(java.lang.String r42, java.lang.String r43, java.lang.Throwable r44) {
        /*
            Method dump skipped, instruction units count: 3586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C21157.m47601(java.lang.String, java.lang.String, java.lang.Throwable):void");
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0162 A[PHI: r17 r18
      0x0162: PHI (r17v18 int) = (r17v17 int), (r17v19 int) binds: [B:44:0x014c, B:38:0x012d] A[DONT_GENERATE, DONT_INLINE]
      0x0162: PHI (r18v3 java.lang.String) = (r18v2 java.lang.String), (r18v1 java.lang.String) binds: [B:44:0x014c, B:38:0x012d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x023b A[PHI: r1 r2 r7 r8 r9 r12 r13 r17
      0x023b: PHI (r1v30 java.lang.StringBuilder) = (r1v26 java.lang.StringBuilder), (r1v1 java.lang.StringBuilder), (r1v31 java.lang.StringBuilder) binds: [B:34:0x010f, B:26:0x00c3, B:64:0x0239] A[DONT_GENERATE, DONT_INLINE]
      0x023b: PHI (r2v3 java.lang.String) = (r2v2 java.lang.String), (r2v1 java.lang.String), (r2v1 java.lang.String) binds: [B:34:0x010f, B:26:0x00c3, B:64:0x0239] A[DONT_GENERATE, DONT_INLINE]
      0x023b: PHI (r7v3 int) = (r7v1 int), (r7v1 int), (r7v4 int) binds: [B:34:0x010f, B:26:0x00c3, B:64:0x0239] A[DONT_GENERATE, DONT_INLINE]
      0x023b: PHI (r8v2 int) = (r8v1 int), (r8v1 int), (r8v3 int) binds: [B:34:0x010f, B:26:0x00c3, B:64:0x0239] A[DONT_GENERATE, DONT_INLINE]
      0x023b: PHI (r9v2 short) = (r9v1 short), (r9v1 short), (r9v3 short) binds: [B:34:0x010f, B:26:0x00c3, B:64:0x0239] A[DONT_GENERATE, DONT_INLINE]
      0x023b: PHI (r12v3 short[]) = (r12v1 short[]), (r12v2 short[]), (r12v1 short[]) binds: [B:34:0x010f, B:26:0x00c3, B:64:0x0239] A[DONT_GENERATE, DONT_INLINE]
      0x023b: PHI (r13v3 int) = (r13v1 int), (r13v2 int), (r13v1 int) binds: [B:34:0x010f, B:26:0x00c3, B:64:0x0239] A[DONT_GENERATE, DONT_INLINE]
      0x023b: PHI (r17v24 int) = (r17v20 int), (r17v21 int), (r17v25 int) binds: [B:34:0x010f, B:26:0x00c3, B:64:0x0239] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x0293 A[PHI: r5 r6 r17 r19
      0x0293: PHI (r5v3 short) = (r5v2 short), (r5v1 short), (r5v1 short) binds: [B:72:0x0291, B:68:0x0272, B:12:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x0293: PHI (r6v3 int) = (r6v1 int), (r6v2 int), (r6v1 int) binds: [B:72:0x0291, B:68:0x0272, B:12:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x0293: PHI (r17v11 int) = (r17v7 int), (r17v8 int), (r17v13 int) binds: [B:72:0x0291, B:68:0x0272, B:12:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x0293: PHI (r19v7 java.lang.StringBuilder) = (r19v3 java.lang.StringBuilder), (r19v4 java.lang.StringBuilder), (r19v9 java.lang.StringBuilder) binds: [B:72:0x0291, B:68:0x0272, B:12:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0065, code lost:
    
        if (l.ThreadFactoryC3888.m11300() <= 0) goto L8;
     */
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m47596() {
        /*
            Method dump skipped, instruction units count: 934
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C21157.m47596():java.lang.String");
    }

    /* JADX WARN: Code duplicated, block: B:100:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:19:0x0075  */
    /* JADX WARN: Code duplicated, block: B:80:0x0300  */
    /* JADX WARN: Code duplicated, block: B:92:0x036b A[PHI: r5 r14 r15 r21
      0x036b: PHI (r5v4 int) = (r5v2 int), (r5v2 int), (r5v2 int), (r5v3 int), (r5v2 int) binds: [B:91:0x0369, B:87:0x034c, B:67:0x0289, B:48:0x01b2, B:11:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x036b: PHI (r14v4 short[]) = (r14v2 short[]), (r14v2 short[]), (r14v2 short[]), (r14v3 short[]), (r14v2 short[]) binds: [B:91:0x0369, B:87:0x034c, B:67:0x0289, B:48:0x01b2, B:11:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x036b: PHI (r15v4 int) = (r15v2 int), (r15v2 int), (r15v2 int), (r15v3 int), (r15v2 int) binds: [B:91:0x0369, B:87:0x034c, B:67:0x0289, B:48:0x01b2, B:11:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x036b: PHI (r21v5 int) = (r21v3 int), (r21v3 int), (r21v4 int), (r21v3 int), (r21v3 int) binds: [B:91:0x0369, B:87:0x034c, B:67:0x0289, B:48:0x01b2, B:11:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:96:0x039a  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47598(int i, int i2, int i3, String str) {
        int iM45029;
        int i4;
        int i5;
        int iM11306;
        int i6;
        int i7 = RunnableC3388.f12514;
        int i8 = C1937.f7317;
        int iM450210 = C19806.m45029("۠᩹") ^ i8;
        int i9 = ((iM450210 ^ i7) * 283) ^ 845633439;
        StringBuilder sb = null;
        short[] sArr = null;
        int i10 = iM450210 ^ 1086395700;
        char c = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        char cM6362 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        char c2 = 0;
        short s = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = -1566917829;
        int i21 = 0;
        while (true) {
            i20 = i10 ^ (i9 & (((i20 ^ i7) * (-26907)) >> 31));
            switch (i20) {
                case -1988672674:
                case 2067222445:
                    C2788.m8480(sb, C0962.m3747(sArr, i18, i13, i17));
                    i14 = 0;
                    i12 = i;
                    iM45029 = (C19806.m45029("ۘ᩻") ^ i7) * 23;
                    i4 = ((iM45029 ^ i8) * (-28725)) ^ 155135729;
                    i5 = -1080197201;
                    i10 = iM45029 ^ i5;
                    i9 = i4;
                    break;
                case -1969871584:
                case 2134322892:
                    if (i16 < i15) {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩳᩳ") ^ i7) * (-87);
                        i4 = ((iM45029 ^ i8) * (-32623)) ^ (-1291592153);
                        i5 = -1911652311;
                    } else {
                        i12 = i19;
                        iM45029 = (C19806.m45029("ۘ᩻") ^ i7) * 23;
                        i4 = ((iM45029 ^ i8) * (-28725)) ^ 155135729;
                        i5 = -1080197201;
                    }
                    i10 = iM45029 ^ i5;
                    i9 = i4;
                    break;
                case -1933050493:
                case -225016553:
                    C19806.m45023(sb, '\n');
                    break;
                case -1930173333:
                case -858204894:
                    if (C3660.m10791() != 0) {
                        iM45029 = C19806.m45029("ۧ᩶") ^ i7;
                        i4 = ((iM45029 ^ i8) * 14433) ^ (-1534341965);
                        i5 = 563239768;
                    } else {
                        iM45029 = C19806.m45029("ܽܰ") ^ i7;
                        i4 = ((iM45029 ^ i8) * 23623) ^ 232249685;
                        i5 = 1714416184;
                    }
                    i10 = iM45029 ^ i5;
                    i9 = i4;
                    break;
                case -1918913493:
                case -212069607:
                    if (i12 >= i2) {
                        iM45029 = C19806.m45029("۟ܰ") ^ i8;
                        i4 = ((iM45029 ^ i7) * (-27095)) ^ (-1609742641);
                        i5 = 422194251;
                        i10 = iM45029 ^ i5;
                        i9 = i4;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۜۜ") ^ i7;
                        i9 = ((iM11306 ^ i8) * (-31099)) ^ (-1271075675);
                        i6 = -1914452719;
                        i10 = iM11306 ^ i6;
                    }
                    break;
                case -1855976386:
                case 105441716:
                    sb = f68899;
                    if (i11 < i3) {
                        int iM450211 = (C19806.m45029("۬ܰ") ^ i8) * 79;
                        i9 = ((iM450211 ^ i7) * 8701) ^ 272462775;
                        i10 = iM450211 ^ (-401532967);
                    } else {
                        int iM450212 = (C19806.m45029("۠ۖ") + i8) * (-57);
                        i10 = iM450212 ^ 1548546207;
                        i9 = ((iM450212 ^ i7) * (-425)) ^ (-1130004839);
                    }
                    c = ' ';
                    break;
                case -1720887032:
                case -1664667565:
                    if (CallableC1627.f6528) {
                        iM45029 = ThreadFactoryC3888.m11306("۬ۗ") ^ i8;
                        i4 = ((iM45029 ^ i7) * 26773) ^ (-825040513);
                        i5 = -1151772898;
                    } else {
                        iM45029 = C19806.m45029("ۚ۠") ^ i7;
                        i4 = ((iM45029 ^ i8) * (-539)) ^ (-562088661);
                        i5 = 1056623633;
                    }
                    i10 = iM45029 ^ i5;
                    i9 = i4;
                    break;
                case -1670770014:
                case 1975217562:
                    if (C10634.m26820()) {
                        iM45029 = C19806.m45029("ۚ۠") ^ i7;
                        i4 = ((iM45029 ^ i8) * (-539)) ^ (-562088661);
                        i5 = 1056623633;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۧܿ") ^ i8;
                        i4 = ((iM45029 ^ i7) * (-5555)) ^ 2043141675;
                        i5 = 1733250110;
                    }
                    i10 = iM45029 ^ i5;
                    i9 = i4;
                    break;
                case -1600508980:
                case 578410503:
                    s = f68898[26];
                    if (C2249.m6915() <= 0) {
                        iM45029 = (C19806.m45029("᩸۠") + i7) * 95;
                        i4 = ((iM45029 ^ i8) * 14537) ^ (-2054364077);
                        i5 = -951361719;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩺ᩳ") ^ i7) * (-127);
                        i4 = ((iM45029 ^ i8) * 21193) ^ 668170195;
                        i5 = 1095379424;
                    }
                    i10 = iM45029 ^ i5;
                    i9 = i4;
                    break;
                case -1594169624:
                case 1659310247:
                    C1977.m6356();
                    if (C0526.f2219) {
                        iM45029 = ThreadFactoryC3888.m11306("۬ۗ") ^ i8;
                        i4 = ((iM45029 ^ i7) * 26773) ^ (-825040513);
                        i5 = -1151772898;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۨܽ") ^ i8;
                        i4 = ((iM45029 ^ i7) * (-26857)) ^ (-1848516793);
                        i5 = 1291652540;
                    }
                    i10 = iM45029 ^ i5;
                    i9 = i4;
                    break;
                case -1488870012:
                case 1705236194:
                    C2704.m8255();
                    iM45029 = ThreadFactoryC3888.m11306("۬ۗ") ^ i8;
                    i4 = ((iM45029 ^ i7) * 26773) ^ (-825040513);
                    i5 = -1151772898;
                    i10 = iM45029 ^ i5;
                    i9 = i4;
                    break;
                case -1417834560:
                case -1102036042:
                    if (C1025.m3861() <= 0) {
                        iM45029 = C19806.m45029("ۚ۠") ^ i7;
                        i4 = ((iM45029 ^ i8) * (-539)) ^ (-562088661);
                        i5 = 1056623633;
                    } else {
                        iM45029 = (C19806.m45029("ۢ۬") ^ i7) * 11;
                        i4 = ((iM45029 ^ i8) * (-4947)) ^ 767851257;
                        i5 = -144966581;
                    }
                    i10 = iM45029 ^ i5;
                    i9 = i4;
                    break;
                case -1357724090:
                case -131073004:
                    if (RunnableC1895.f7152) {
                        iM45029 = ThreadFactoryC3888.m11306("۠ܰ") ^ i8;
                        i4 = ((iM45029 ^ i7) * (-21187)) ^ 2144142129;
                        i5 = -909807302;
                    } else {
                        iM45029 = C19806.m45029("ۧ᩶") ^ i7;
                        i4 = ((iM45029 ^ i8) * 14433) ^ (-1534341965);
                        i5 = 563239768;
                    }
                    i10 = iM45029 ^ i5;
                    i9 = i4;
                    break;
                case -1259685417:
                case 1690803760:
                    C0278.m1789();
                    if (C3535.m10431() > 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۨܽ") ^ i8;
                        i4 = ((iM45029 ^ i7) * (-26857)) ^ (-1848516793);
                        i5 = 1291652540;
                    } else {
                        iM45029 = C19806.m45029("ۧ᩶") ^ i7;
                        i4 = ((iM45029 ^ i8) * 14433) ^ (-1534341965);
                        i5 = 563239768;
                    }
                    i10 = iM45029 ^ i5;
                    i9 = i4;
                    break;
                case -1251507147:
                case -582139616:
                    i15 = 4 - (i14 % 4);
                    i16 = 0;
                    iM45029 = C19806.m45029("ᩳ֫") ^ i7;
                    i4 = ((iM45029 ^ i8) * (-9039)) ^ (-2024639546);
                    i5 = 345369863;
                    i10 = iM45029 ^ i5;
                    i9 = i4;
                    break;
                case -1214205869:
                case -180456876:
                    if (cM6362 == '\r') {
                        iM45029 = ThreadFactoryC3888.m11306("ۘܽ") ^ i7;
                        i4 = ((iM45029 ^ i8) * (-25099)) ^ 1961931801;
                        i5 = -2049723066;
                    } else {
                        c2 = cM6362;
                        iM45029 = ThreadFactoryC3888.m11306("ۧ֨") ^ i8;
                        i4 = ((iM45029 ^ i7) * (-30185)) ^ (-64810350);
                        i5 = -1469294687;
                    }
                    i10 = iM45029 ^ i5;
                    i9 = i4;
                    break;
                case -1151271258:
                case 466853788:
                    c2 = ' ';
                    iM45029 = ThreadFactoryC3888.m11306("ۧ֨") ^ i8;
                    i4 = ((iM45029 ^ i7) * (-30185)) ^ (-64810350);
                    i5 = -1469294687;
                    i10 = iM45029 ^ i5;
                    i9 = i4;
                    break;
                case -1080927608:
                case -823655002:
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    if (C1419.f5860 >= 0) {
                        iM45029 = C19806.m45029("ۚ۠") ^ i7;
                        i4 = ((iM45029 ^ i8) * (-539)) ^ (-562088661);
                        i5 = 1056623633;
                    } else {
                        iM45029 = C19806.m45029("ۜ۬") ^ i8;
                        i4 = ((iM45029 ^ i7) * 617) ^ (-961806519);
                        i5 = 1926363125;
                    }
                    i10 = iM45029 ^ i5;
                    i9 = i4;
                    break;
                case -1028689391:
                case 333705006:
                    i19 = i12 + 1;
                    cM6362 = C1977.m6362(str, i12);
                    if (cM6362 == '\t') {
                        iM45029 = (ThreadFactoryC3888.m11306("ۧ۫") ^ i8) * 7;
                        i4 = ((iM45029 ^ i7) * 4679) ^ 1026539541;
                        i5 = -951114102;
                        i10 = iM45029 ^ i5;
                        i9 = i4;
                    } else {
                        iM11306 = (i8 - ThreadFactoryC3888.m11306("ۙ᩸")) * (-97);
                        i9 = ((iM11306 ^ i7) * 19421) ^ 913689438;
                        i6 = 441534529;
                        i10 = iM11306 ^ i6;
                    }
                    break;
                case -1028175074:
                case -895007293:
                    C19806.m45023(sb, c);
                    i16++;
                    iM45029 = C19806.m45029("ᩳ֫") ^ i7;
                    i4 = ((iM45029 ^ i8) * (-9039)) ^ (-2024639546);
                    i5 = 345369863;
                    i10 = iM45029 ^ i5;
                    i9 = i4;
                    break;
                case -693662083:
                case 943342700:
                    i17 = 22285;
                    iM45029 = (C19806.m45029("᩹ᩳ") + i7) * (-59);
                    i4 = ((iM45029 ^ i8) * 31243) ^ (-1568911361);
                    i5 = -1137534653;
                    i10 = iM45029 ^ i5;
                    i9 = i4;
                    break;
                case -579972506:
                case 1637341494:
                    i21 = (s * s) + 276922881;
                    if (C2704.f10408) {
                        iM45029 = C19806.m45029("ܺۘ") ^ i8;
                        i4 = ((iM45029 ^ i7) * (-21557)) ^ (-363121675);
                        i5 = -239004116;
                    } else {
                        iM45029 = C19806.m45029("ۜ۬") ^ i8;
                        i4 = ((iM45029 ^ i7) * 617) ^ (-961806519);
                        i5 = 1926363125;
                    }
                    i10 = iM45029 ^ i5;
                    i9 = i4;
                    break;
                case -560721814:
                case 2138710741:
                    sArr = f68898;
                    i18 = 27;
                    i13 = 3;
                    if (C1066.f4915 <= 0) {
                        iM45029 = C19806.m45029("ۜ۬") ^ i8;
                        i4 = ((iM45029 ^ i7) * 617) ^ (-961806519);
                        i5 = 1926363125;
                    } else {
                        iM45029 = (C19806.m45029("۠ۨ") ^ i7) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM45029 ^ i8) * (-17755)) ^ 1984041177;
                        i5 = -1255829598;
                    }
                    i10 = iM45029 ^ i5;
                    i9 = i4;
                    break;
                case -292844265:
                case 1029309900:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۬ۗ") ^ i8;
                        i4 = ((iM45029 ^ i7) * 26773) ^ (-825040513);
                        i5 = -1151772898;
                    } else {
                        iM45029 = C19806.m45029("ۜۧ") ^ i8;
                        i4 = ((iM45029 ^ i7) * 11069) ^ (-1206268862);
                        i5 = -529722882;
                    }
                    i10 = iM45029 ^ i5;
                    i9 = i4;
                    break;
                case -133478005:
                case 688244381:
                    if (C0216.f1393 != 0) {
                        iM45029 = C19806.m45029("ۜ۬") ^ i8;
                        i4 = ((iM45029 ^ i7) * 617) ^ (-961806519);
                        i5 = 1926363125;
                    } else {
                        iM45029 = (C19806.m45029("֡᩵") ^ i8) * (-121);
                        i4 = ((iM45029 ^ i7) * (-8437)) ^ (-1821491576);
                        i5 = 262172685;
                    }
                    i10 = iM45029 ^ i5;
                    i9 = i4;
                    break;
                case 1997482:
                case 1137768813:
                    C19806.m45023(sb, c2);
                    i14++;
                    i12 = i19;
                    iM45029 = (C19806.m45029("ۘ᩻") ^ i7) * 23;
                    i4 = ((iM45029 ^ i8) * (-28725)) ^ 155135729;
                    i5 = -1080197201;
                    i10 = iM45029 ^ i5;
                    i9 = i4;
                    break;
                case 36624495:
                case 198295320:
                    if (C19806.f63586) {
                        iM45029 = C19806.m45029("ۜ۬") ^ i8;
                        i4 = ((iM45029 ^ i7) * 617) ^ (-961806519);
                        i5 = 1926363125;
                    } else {
                        iM45029 = C19806.m45029("ܿᩳ") ^ i7;
                        i4 = ((iM45029 ^ i8) * (-30069)) ^ (-612723820);
                        i5 = 1712014112;
                    }
                    i10 = iM45029 ^ i5;
                    i9 = i4;
                    break;
                case 176556408:
                case 1951188950:
                    i17 = 22898;
                    iM45029 = (C19806.m45029("᩹ᩳ") + i7) * (-59);
                    i4 = ((iM45029 ^ i8) * 31243) ^ (-1568911361);
                    i5 = -1137534653;
                    i10 = iM45029 ^ i5;
                    i9 = i4;
                    break;
                case 444433823:
                case 1073051118:
                    if (i21 - (33282 * s) < 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۧ᩹") ^ i8;
                        i4 = ((iM45029 ^ i7) * 27331) ^ 1481302001;
                        i5 = 1025182562;
                    } else {
                        iM45029 = C19806.m45029("۠۟") ^ i7;
                        i4 = ((iM45029 ^ i8) * (-32761)) ^ 1985664149;
                        i5 = -364057194;
                    }
                    i10 = iM45029 ^ i5;
                    i9 = i4;
                    break;
                case 691508414:
                case 1579619697:
                    i11 = 0;
                    iM11306 = ThreadFactoryC3888.m11306("ܺܶ") ^ i7;
                    i9 = ((iM11306 ^ i8) * (-17973)) ^ (-1954226640);
                    i6 = 257956541;
                    i10 = iM11306 ^ i6;
                    break;
                case 1462311934:
                case 1763139441:
                    ThreadFactoryC3888.m11302(sb, c);
                    i11++;
                    iM11306 = ThreadFactoryC3888.m11306("ܺܶ") ^ i7;
                    i9 = ((iM11306 ^ i8) * (-17973)) ^ (-1954226640);
                    i6 = 257956541;
                    i10 = iM11306 ^ i6;
                    break;
                default:
                    RunnableC1564.m5345();
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:128:0x044b A[PHI: r4 r19 r20 r21
      0x044b: PHI (r4v27 java.io.File) = (r4v19 java.io.File), (r4v26 java.io.File), (r4v28 java.io.File) binds: [B:22:0x0090, B:127:0x0449, B:123:0x0429] A[DONT_GENERATE, DONT_INLINE]
      0x044b: PHI (r19v16 java.lang.String) = (r19v10 java.lang.String), (r19v15 java.lang.String), (r19v17 java.lang.String) binds: [B:22:0x0090, B:127:0x0449, B:123:0x0429] A[DONT_GENERATE, DONT_INLINE]
      0x044b: PHI (r20v16 int) = (r20v10 int), (r20v15 int), (r20v17 int) binds: [B:22:0x0090, B:127:0x0449, B:123:0x0429] A[DONT_GENERATE, DONT_INLINE]
      0x044b: PHI (r21v14 short[]) = (r21v8 short[]), (r21v13 short[]), (r21v15 short[]) binds: [B:22:0x0090, B:127:0x0449, B:123:0x0429] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static void m47608() {
        int iM11306;
        int i;
        int i2;
        int iM45029;
        int i3;
        int i4;
        int iM450210;
        int i5;
        int i6;
        long length = 0;
        String line = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 2034334531;
        int i12 = AbstractC0464.f2088;
        int i13 = C1977.f7413;
        int iM450211 = C19806.m45029("ۡۨ") ^ i13;
        int i14 = ((iM450211 ^ i12) * (-647)) ^ 139445417;
        int i15 = iM450211 ^ 2144763996;
        File file = null;
        BufferedReader bufferedReader = null;
        while (true) {
            i11 = i15 ^ (i14 & (((i11 ^ i12) * 13109) >> 31));
            switch (i11) {
                case -2131210284:
                case 1203027720:
                    line = line;
                    sArr = sArr;
                    i11 = i11;
                    file = file;
                    if ((i8 + i9) - i7 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܳܽ") ^ i12;
                        i = ((iM11306 ^ i13) * (-10521)) ^ (-1445533367);
                        i2 = -521716078;
                    } else {
                        iM11306 = (C19806.m45029("۬ᩳ") ^ i13) * 19;
                        i = ((iM11306 ^ i12) * (-25685)) ^ (-1777655821);
                        i2 = 444184996;
                    }
                    i15 = iM11306 ^ i2;
                    i14 = i;
                    file = file;
                    line = line;
                    i11 = i11;
                    sArr = sArr;
                    break;
                case -1786135570:
                case -336418920:
                    line = line;
                    sArr = sArr;
                    i11 = i11;
                    file = file;
                    i7 = s * 5548;
                    if (C0671.f2816 == 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܶۨ") ^ i12) * (-21);
                        i = ((iM11306 ^ i13) * 2419) ^ 1512238948;
                        i2 = -881298249;
                        i15 = iM11306 ^ i2;
                        i14 = i;
                        file = file;
                        line = line;
                        i11 = i11;
                        sArr = sArr;
                    } else {
                        sArr = sArr;
                        int iM11307 = ThreadFactoryC3888.m11306("᩷ۡ") ^ i12;
                        i15 = iM11307 ^ 1057646084;
                        i14 = ((iM11307 ^ i13) * (-24921)) ^ (-1549353623);
                        line = line;
                        i11 = i11;
                        file = null;
                    }
                    break;
                case -1780115849:
                case -1357360760:
                    line = line;
                    sArr = sArr;
                    i11 = i11;
                    File fileM39285 = C16737.m39285();
                    if (!C1419.m4973()) {
                        short[] sArr2 = f68898;
                        if (!C2704.f10408) {
                            iM45029 = C19806.m45029("ܰܺ") ^ i12;
                            i3 = ((iM45029 ^ i13) * 32035) ^ (-1104612536);
                            i4 = -335153830;
                            i15 = iM45029 ^ i4;
                            i14 = i3;
                            line = line;
                            i11 = i11;
                            sArr = sArr;
                            file = null;
                        } else if (C1066.f4915 > 0) {
                            String strM6363 = C1977.m6363(sArr2, 187, 10, i10);
                            if (RunnableC0195.f1321 < 0) {
                                File file2 = new File(fileM39285, strM6363);
                                if (C2871.m8639(file2)) {
                                    int iM450212 = C19806.m45029("ܿ۠") ^ i12;
                                    i15 = iM450212 ^ (-1582486599);
                                    file = file2;
                                    i14 = ((iM450212 ^ i13) * (-29245)) ^ (-1758348658);
                                } else {
                                    file = file2;
                                    int iM450213 = (C19806.m45029("ܳ֡") ^ i12) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                    i15 = iM450213 ^ 544192689;
                                    i14 = ((iM450213 ^ i13) * (-16181)) ^ (-668212546);
                                }
                                line = line;
                                i11 = i11;
                                sArr = sArr;
                            } else {
                                iM45029 = (C19806.m45029("۠ܽ") + i12) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                i3 = ((iM45029 ^ i13) * 31311) ^ (-2037800808);
                                i4 = -1353067449;
                                i15 = iM45029 ^ i4;
                                i14 = i3;
                                line = line;
                                i11 = i11;
                                sArr = sArr;
                                file = null;
                            }
                        } else {
                            sArr = sArr;
                            int iM11308 = ThreadFactoryC3888.m11306("᩷ۡ") ^ i12;
                            i15 = iM11308 ^ 1057646084;
                            i14 = ((iM11308 ^ i13) * (-24921)) ^ (-1549353623);
                            line = line;
                            i11 = i11;
                            file = null;
                        }
                    } else {
                        iM45029 = (C19806.m45029("۠ۖ") + i12) * (-105);
                        i3 = ((iM45029 ^ i13) * 7871) ^ 1459643518;
                        i4 = -1174940679;
                        i15 = iM45029 ^ i4;
                        i14 = i3;
                        line = line;
                        i11 = i11;
                        sArr = sArr;
                        file = null;
                    }
                    break;
                case -1767637710:
                case 768852479:
                    line = line;
                    i11 = i11;
                    File file3 = file;
                    sArr = f68898;
                    c = 186;
                    if (C2477.f9839 <= 0) {
                        int iM11309 = ThreadFactoryC3888.m11306("᩷ۡ") ^ i12;
                        i15 = iM11309 ^ 1057646084;
                        i14 = ((iM11309 ^ i13) * (-24921)) ^ (-1549353623);
                        line = line;
                        i11 = i11;
                        file = null;
                    } else {
                        int iM450214 = (C19806.m45029("᩺᩷") + i13) * 85;
                        i15 = iM450214 ^ (-913885507);
                        i14 = ((iM450214 ^ i12) * (-24141)) ^ (-357366797);
                        file = file3;
                        line = line;
                        i11 = i11;
                    }
                    break;
                case -1590557601:
                case -1060403741:
                    if (line != null) {
                        iM450210 = (i13 - ThreadFactoryC3888.m11306("ۜۧ")) * (-81);
                        i5 = ((iM450210 ^ i12) * (-12341)) ^ (-892924308);
                        i6 = -763593314;
                    } else {
                        iM450210 = (i13 - C19806.m45029("᩹᩹")) * 119;
                        i5 = ((iM450210 ^ i12) * 20429) ^ 911452711;
                        i6 = 2087814018;
                    }
                    int i16 = i5;
                    i15 = iM450210 ^ i6;
                    i14 = i16;
                    break;
                case -1564060229:
                case -891568365:
                    C0671.m3008();
                    C0817.m3399();
                    iM450210 = ThreadFactoryC3888.m11306("᩸᩶") ^ i12;
                    i5 = ((iM450210 ^ i13) * 30623) ^ (-703655524);
                    i6 = 1040273320;
                    int i17 = i5;
                    i15 = iM450210 ^ i6;
                    i14 = i17;
                    break;
                case -1397048816:
                case -829288201:
                    break;
                case -1361650102:
                case 1887365060:
                    line = line;
                    sArr = sArr;
                    i11 = i11;
                    file.delete();
                    int iM450215 = (C19806.m45029("ܳ֡") ^ i12) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                    i15 = iM450215 ^ 544192689;
                    i14 = ((iM450215 ^ i13) * (-16181)) ^ (-668212546);
                    line = line;
                    i11 = i11;
                    sArr = sArr;
                    break;
                case -1351731410:
                case 1717614193:
                    C1189.m4368();
                    break;
                case -1272955276:
                case -246217201:
                    line = line;
                    sArr = sArr;
                    i11 = i11;
                    file = file;
                    s = sArr[c];
                    if (C1189.f5284 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩻᩹") ^ i13;
                        i = ((iM11306 ^ i12) * 5985) ^ 377458784;
                        i2 = 1205435700;
                    } else {
                        iM11306 = (i13 - C19806.m45029("᩻ܳ")) * 89;
                        i = ((iM11306 ^ i12) * 14731) ^ 1084255919;
                        i2 = 391800162;
                    }
                    i15 = iM11306 ^ i2;
                    i14 = i;
                    file = file;
                    line = line;
                    i11 = i11;
                    sArr = sArr;
                    break;
                case -1268276105:
                case 290510628:
                    if (C1148.f5161 <= 0) {
                        line = line;
                        sArr = sArr;
                        i11 = i11;
                        file = file;
                        iM11306 = (C19806.m45029("ܽܿ") ^ i13) * (-73);
                        i = ((iM11306 ^ i12) * 1377) ^ (-1026097643);
                        i2 = -1697907839;
                        i15 = iM11306 ^ i2;
                        i14 = i;
                        file = file;
                        line = line;
                        i11 = i11;
                        sArr = sArr;
                    } else {
                        line = line;
                        sArr = sArr;
                        i11 = i11;
                        iM45029 = (C19806.m45029("۠ܽ") + i12) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i3 = ((iM45029 ^ i13) * 31311) ^ (-2037800808);
                        i4 = -1353067449;
                        i15 = iM45029 ^ i4;
                        i14 = i3;
                        line = line;
                        i11 = i11;
                        sArr = sArr;
                        file = null;
                    }
                    break;
                case -1199214625:
                case 1296255433:
                    i10 = 61472;
                    iM11306 = C19806.m45029("ۚ᩺") ^ i13;
                    i = ((iM11306 ^ i12) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION) ^ (-74353312);
                    i2 = -941562605;
                    i15 = iM11306 ^ i2;
                    i14 = i;
                    file = file;
                    line = line;
                    i11 = i11;
                    sArr = sArr;
                    break;
                case -1130288129:
                case 1735125609:
                    if (RunnableC1606.m5473() != 0) {
                        line = line;
                        sArr = sArr;
                        i11 = i11;
                        iM45029 = (C19806.m45029("۠ۖ") + i12) * (-105);
                        i3 = ((iM45029 ^ i13) * 7871) ^ 1459643518;
                        i4 = -1174940679;
                        i15 = iM45029 ^ i4;
                        i14 = i3;
                        line = line;
                        i11 = i11;
                        sArr = sArr;
                        file = null;
                    } else {
                        iM450210 = (ThreadFactoryC3888.m11306("᩷۫") ^ i13) * q.h;
                        i5 = ((iM450210 ^ i12) * (-29029)) ^ (-2142640524);
                        i6 = 1009922876;
                        int i18 = i5;
                        i15 = iM450210 ^ i6;
                        i14 = i18;
                    }
                    break;
                case -1089408511:
                case 1151328716:
                    line = line;
                    sArr = sArr;
                    i11 = i11;
                    file = file;
                    try {
                        f68894 = new FileWriter(file, true);
                        break;
                    } catch (IOException unused) {
                    }
                    iM11306 = ThreadFactoryC3888.m11306("ܶᩴ") ^ i12;
                    i = ((iM11306 ^ i13) * 16475) ^ (-979908376);
                    i2 = -1762632146;
                    i15 = iM11306 ^ i2;
                    i14 = i;
                    file = file;
                    line = line;
                    i11 = i11;
                    sArr = sArr;
                    break;
                case -1059463115:
                case -496202362:
                    C1419.m4973();
                    if (C1875.f7103 >= 0) {
                        line = line;
                        sArr = sArr;
                        i11 = i11;
                        iM45029 = (C19806.m45029("۠ܽ") + i12) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i3 = ((iM45029 ^ i13) * 31311) ^ (-2037800808);
                        i4 = -1353067449;
                        i15 = iM45029 ^ i4;
                        i14 = i3;
                        line = line;
                        i11 = i11;
                        sArr = sArr;
                        file = null;
                    } else {
                        iM450210 = ThreadFactoryC3888.m11306("᩸᩶") ^ i12;
                        i5 = ((iM450210 ^ i13) * 30623) ^ (-703655524);
                        i6 = 1040273320;
                        int i19 = i5;
                        i15 = iM450210 ^ i6;
                        i14 = i19;
                    }
                    break;
                case -798382683:
                case 1598699037:
                    try {
                        byte[] bArrM11363 = C3907.m11363(file);
                        try {
                            line = line;
                            try {
                                i11 = i11;
                                try {
                                    sArr = sArr;
                                    try {
                                        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArrM11363, bArrM11363.length / 2, bArrM11363.length / 2)));
                                        try {
                                            bufferedReader2.readLine();
                                            file = file;
                                            try {
                                                f68894 = new BufferedWriter(new FileWriter(file));
                                                bufferedReader = bufferedReader2;
                                                iM11306 = (i12 - ThreadFactoryC3888.m11306("ܺ᩹")) * 51;
                                                i = ((iM11306 ^ i13) * 22877) ^ (-213153083);
                                                i2 = 1726293398;
                                                i15 = iM11306 ^ i2;
                                                i14 = i;
                                                file = file;
                                            } catch (IOException unused2) {
                                                file = file;
                                                bufferedReader = bufferedReader2;
                                                int iM450216 = (C19806.m45029("ܳ֡") ^ i12) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                                i15 = iM450216 ^ 544192689;
                                                i14 = ((iM450216 ^ i13) * (-16181)) ^ (-668212546);
                                            }
                                        } catch (IOException unused3) {
                                        }
                                    } catch (IOException unused4) {
                                        bufferedReader = null;
                                    }
                                } catch (IOException unused5) {
                                    sArr = sArr;
                                }
                            } catch (IOException unused6) {
                                sArr = sArr;
                                i11 = i11;
                                bufferedReader = null;
                                int iM450217 = (C19806.m45029("ܳ֡") ^ i12) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                i15 = iM450217 ^ 544192689;
                                i14 = ((iM450217 ^ i13) * (-16181)) ^ (-668212546);
                                line = line;
                                i11 = i11;
                                sArr = sArr;
                                break;
                            }
                        } catch (IOException unused7) {
                            line = line;
                        }
                    } catch (IOException unused8) {
                        line = line;
                        sArr = sArr;
                        i11 = i11;
                    }
                    line = line;
                    i11 = i11;
                    sArr = sArr;
                    break;
                case -570237527:
                case 1159326325:
                    f68894.write(line);
                    f68894.write(10);
                    line = line;
                    sArr = sArr;
                    i11 = i11;
                    file = file;
                    iM11306 = (i12 - ThreadFactoryC3888.m11306("ܺ᩹")) * 51;
                    i = ((iM11306 ^ i13) * 22877) ^ (-213153083);
                    i2 = 1726293398;
                    i15 = iM11306 ^ i2;
                    i14 = i;
                    file = file;
                    line = line;
                    i11 = i11;
                    sArr = sArr;
                    break;
                case -177100120:
                case 1213205677:
                    line = line;
                    sArr = sArr;
                    i11 = i11;
                    file = file;
                    if (C1461.f5957 <= 0) {
                        iM11306 = (C19806.m45029("ܽܿ") ^ i13) * (-73);
                        i = ((iM11306 ^ i12) * 1377) ^ (-1026097643);
                        i2 = -1697907839;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩳۜ") ^ i12) * (-19);
                        i = ((iM11306 ^ i13) * 24767) ^ 1510129250;
                        i2 = 1058934484;
                    }
                    i15 = iM11306 ^ i2;
                    i14 = i;
                    file = file;
                    line = line;
                    i11 = i11;
                    sArr = sArr;
                    break;
                case -158048173:
                case 366981102:
                    if (!C2704.f10408) {
                        line = line;
                        sArr = sArr;
                        i11 = i11;
                        iM45029 = (C19806.m45029("۠ܽ") + i12) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i3 = ((iM45029 ^ i13) * 31311) ^ (-2037800808);
                        i4 = -1353067449;
                        i15 = iM45029 ^ i4;
                        i14 = i3;
                        line = line;
                        i11 = i11;
                        sArr = sArr;
                        file = null;
                    } else {
                        line = line;
                        sArr = sArr;
                        i11 = i11;
                        file = file;
                        iM11306 = C19806.m45029("ۙܽ") ^ i13;
                        i = ((iM11306 ^ i12) * (-16463)) ^ (-283657916);
                        i2 = -1335243898;
                        i15 = iM11306 ^ i2;
                        i14 = i;
                        file = file;
                        line = line;
                        i11 = i11;
                        sArr = sArr;
                    }
                    break;
                case -103843041:
                case 622082935:
                    line = line;
                    sArr = sArr;
                    i11 = i11;
                    file = file;
                    length = file.length();
                    if (length > 2097152) {
                        iM11306 = ThreadFactoryC3888.m11306("᩹ܶ") ^ i13;
                        i = ((iM11306 ^ i12) * 31555) ^ 305144948;
                        i2 = -53446637;
                    } else {
                        iM11306 = (C19806.m45029("᩸ۗ") ^ i13) * (-11);
                        i = ((iM11306 ^ i12) * 18877) ^ (-1467565729);
                        i2 = 987539166;
                    }
                    i15 = iM11306 ^ i2;
                    i14 = i;
                    file = file;
                    line = line;
                    i11 = i11;
                    sArr = sArr;
                    break;
                case -18336434:
                case 1339849090:
                    line = line;
                    sArr = sArr;
                    i11 = i11;
                    file = file;
                    if (C1977.f7413 <= 0) {
                        iM11306 = (C19806.m45029("ܽܿ") ^ i13) * (-73);
                        i = ((iM11306 ^ i12) * 1377) ^ (-1026097643);
                        i2 = -1697907839;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۖܳ") ^ i12;
                        i = ((iM11306 ^ i13) * 21149) ^ (-396548611);
                        i2 = -331197874;
                    }
                    i15 = iM11306 ^ i2;
                    i14 = i;
                    file = file;
                    line = line;
                    i11 = i11;
                    sArr = sArr;
                    break;
                case 112971947:
                case 1819561811:
                    if (!C3743.f13569) {
                        iM450210 = (C19806.m45029("᩹۬") ^ i12) * 67;
                        i5 = ((iM450210 ^ i13) * 29909) ^ 1378661950;
                        i6 = 1775374378;
                        int i110 = i5;
                        i15 = iM450210 ^ i6;
                        i14 = i110;
                    } else {
                        line = line;
                        sArr = sArr;
                        i11 = i11;
                        iM45029 = (C19806.m45029("۠ܽ") + i12) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i3 = ((iM45029 ^ i13) * 31311) ^ (-2037800808);
                        i4 = -1353067449;
                        i15 = iM45029 ^ i4;
                        i14 = i3;
                        line = line;
                        i11 = i11;
                        sArr = sArr;
                        file = null;
                    }
                    break;
                case 115309282:
                case 289143357:
                    C1189.m4368();
                    if (RunnableC3388.f12514 < 0) {
                        iM450210 = (C19806.m45029("᩹۬") ^ i12) * 67;
                        i5 = ((iM450210 ^ i13) * 29909) ^ 1378661950;
                        i6 = 1775374378;
                    } else {
                        iM450210 = (ThreadFactoryC3888.m11306("᩷۫") ^ i13) * q.h;
                        i5 = ((iM450210 ^ i12) * (-29029)) ^ (-2142640524);
                        i6 = 1009922876;
                    }
                    int i111 = i5;
                    i15 = iM450210 ^ i6;
                    i14 = i111;
                    break;
                case 203338781:
                case 1093073508:
                    i10 = 48953;
                    iM11306 = C19806.m45029("ۚ᩺") ^ i13;
                    i = ((iM11306 ^ i12) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION) ^ (-74353312);
                    i2 = -941562605;
                    i15 = iM11306 ^ i2;
                    i14 = i;
                    file = file;
                    line = line;
                    i11 = i11;
                    sArr = sArr;
                    break;
                case 255586061:
                case 1956061360:
                    line = line;
                    sArr = sArr;
                    i11 = i11;
                    file = file;
                    i8 = s * s;
                    i9 = 7695076;
                    if (C0278.m1789() <= 0) {
                        iM11306 = C19806.m45029("ۙܽ") ^ i13;
                        i = ((iM11306 ^ i12) * (-16463)) ^ (-283657916);
                        i2 = -1335243898;
                    } else {
                        iM11306 = (C19806.m45029("ܰۙ") ^ i13) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM11306 ^ i12) * 9821) ^ (-1850864236);
                        i2 = 268273095;
                    }
                    i15 = iM11306 ^ i2;
                    i14 = i;
                    file = file;
                    line = line;
                    i11 = i11;
                    sArr = sArr;
                    break;
                case 822952108:
                case 1600666133:
                    C0962.m3746();
                    if (!RunnableC0195.m1431()) {
                        line = line;
                        sArr = sArr;
                        i11 = i11;
                        iM45029 = C19806.m45029("ܰܺ") ^ i12;
                        i3 = ((iM45029 ^ i13) * 32035) ^ (-1104612536);
                        i4 = -335153830;
                        i15 = iM45029 ^ i4;
                        i14 = i3;
                        line = line;
                        i11 = i11;
                        sArr = sArr;
                        file = null;
                    } else {
                        line = line;
                        sArr = sArr;
                        i11 = i11;
                        file = file;
                        iM11306 = ThreadFactoryC3888.m11306("᩻᩹") ^ i13;
                        i = ((iM11306 ^ i12) * 5985) ^ 377458784;
                        i2 = 1205435700;
                        i15 = iM11306 ^ i2;
                        i14 = i;
                        file = file;
                        line = line;
                        i11 = i11;
                        sArr = sArr;
                    }
                    break;
                case 1030828400:
                case 1213580086:
                    if (C2704.m8255() <= 0) {
                        line = line;
                        sArr = sArr;
                        i11 = i11;
                        file = file;
                        iM11306 = ThreadFactoryC3888.m11306("᩻᩹") ^ i13;
                        i = ((iM11306 ^ i12) * 5985) ^ 377458784;
                        i2 = 1205435700;
                        i15 = iM11306 ^ i2;
                        i14 = i;
                        file = file;
                        line = line;
                        i11 = i11;
                        sArr = sArr;
                    } else {
                        line = line;
                        sArr = sArr;
                        i11 = i11;
                        iM45029 = (C19806.m45029("۠ܽ") + i12) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i3 = ((iM45029 ^ i13) * 31311) ^ (-2037800808);
                        i4 = -1353067449;
                        i15 = iM45029 ^ i4;
                        i14 = i3;
                        line = line;
                        i11 = i11;
                        sArr = sArr;
                        file = null;
                    }
                    break;
                case 1131049545:
                case 1641415654:
                    line = line;
                    sArr = sArr;
                    i11 = i11;
                    file = file;
                    if (length <= 524288) {
                        file = file;
                        int iM450218 = (C19806.m45029("ܳ֡") ^ i12) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i15 = iM450218 ^ 544192689;
                        i14 = ((iM450218 ^ i13) * (-16181)) ^ (-668212546);
                        line = line;
                        i11 = i11;
                        sArr = sArr;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۜܶ") ^ i13) * 7;
                        i = ((iM11306 ^ i12) * 7625) ^ (-897445467);
                        i2 = 1634654863;
                        i15 = iM11306 ^ i2;
                        i14 = i;
                        file = file;
                        line = line;
                        i11 = i11;
                        sArr = sArr;
                    }
                    break;
                case 1474617606:
                case 1667494910:
                    f68894.close();
                    f68894 = null;
                    line = line;
                    sArr = sArr;
                    i11 = i11;
                    int iM450219 = (C19806.m45029("ܳ֡") ^ i12) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                    i15 = iM450219 ^ 544192689;
                    i14 = ((iM450219 ^ i13) * (-16181)) ^ (-668212546);
                    line = line;
                    i11 = i11;
                    sArr = sArr;
                    break;
                default:
                    try {
                        line = bufferedReader.readLine();
                        iM450210 = (ThreadFactoryC3888.m11306("ۖ۬") ^ i12) * (-79);
                        i5 = ((iM450210 ^ i13) * 26895) ^ (-678424169);
                        i6 = 412227326;
                        int i112 = i5;
                        i15 = iM450210 ^ i6;
                        i14 = i112;
                    } catch (IOException unused9) {
                        line = line;
                        sArr = sArr;
                        i11 = i11;
                        int iM4502110 = (C19806.m45029("ܳ֡") ^ i12) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i15 = iM4502110 ^ 544192689;
                        i14 = ((iM4502110 ^ i13) * (-16181)) ^ (-668212546);
                        line = line;
                        i11 = i11;
                        sArr = sArr;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00fa A[PHI: r14
      0x00fa: PHI (r14v12 java.text.SimpleDateFormat) = (r14v4 java.text.SimpleDateFormat), (r14v14 java.text.SimpleDateFormat) binds: [B:42:0x00f8, B:17:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    static {
        int iM11306;
        int i;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        short s2 = 0;
        int i5 = 0;
        int i6 = 84240481;
        int i7 = RunnableC3388.f12514;
        int i8 = ViewTreeObserverOnPreDrawListenerC3327.f12317;
        int iM45029 = C19806.m45029("ۗ᩶") ^ i8;
        int i9 = ((iM45029 ^ i7) * (-31975)) ^ 608739739;
        int i10 = -306676752;
        while (true) {
            int i11 = iM45029 ^ i10;
            SimpleDateFormat simpleDateFormat = null;
            while (true) {
                i6 = ((((i6 ^ i7) * (-5331)) >> 31) & i9) ^ i11;
                switch (i6) {
                    case -2111208503:
                    case -1473089934:
                        if ((s * s2) - i4 > 0) {
                            iM11306 = ThreadFactoryC3888.m11306("۟ܶ") ^ i7;
                            i9 = ((iM11306 ^ i8) * 7785) ^ (-359333961);
                            i = -1260381871;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("۫᩶") ^ i8;
                            i9 = ((iM11306 ^ i7) * 26551) ^ (-976172007);
                            i = 1232497926;
                        }
                        i11 = iM11306 ^ i;
                        break;
                    case -1542419435:
                    case 1864010976:
                        s = sArr[c];
                        if (C3743.m10966() <= 0) {
                            iM11306 = ThreadFactoryC3888.m11306("᩻ۡ") ^ i7;
                            i9 = ((iM11306 ^ i8) * 29093) ^ (-425197496);
                            i = 1294412646;
                        } else {
                            iM11306 = (ThreadFactoryC3888.m11306("ܿ۬") + i7) * (-123);
                            i9 = ((iM11306 ^ i8) * (-22507)) ^ (-430117823);
                            i = 1856589976;
                        }
                        i11 = iM11306 ^ i;
                        break;
                    case -1526835172:
                    case -242287972:
                        sArr = f68898;
                        c = 0;
                        if (C2788.f10625 < 0) {
                            iM11306 = ThreadFactoryC3888.m11306("ۖᩴ") ^ i8;
                            i9 = ((iM11306 ^ i7) * 22263) ^ 1259165451;
                            i = -313085992;
                            i11 = iM11306 ^ i;
                        } else {
                            iM45029 = ThreadFactoryC3888.m11306("᩹ܳ") ^ i7;
                            i9 = ((iM45029 ^ i8) * 12663) ^ 1252272711;
                            i10 = -1021457384;
                        }
                        break;
                    case -1511985370:
                    case 3166334:
                        i5 = 27958;
                        iM11306 = (ThreadFactoryC3888.m11306("ۙ۬") + i7) * 71;
                        i9 = ((iM11306 ^ i8) * (-31891)) ^ 2056153843;
                        i = -1333672092;
                        i11 = iM11306 ^ i;
                        break;
                    case -1243729570:
                    case -798947185:
                        f68896 = simpleDateFormat;
                        if (C3743.m10966() <= 0) {
                            iM11306 = C19806.m45029("ۛۛ") ^ i8;
                            i9 = ((iM11306 ^ i7) * (-27725)) ^ 79199488;
                            i = -1404830926;
                        } else {
                            if (!RunnableC1564.m5345()) {
                                f68899 = new StringBuilder(128);
                                return;
                            }
                            iM11306 = ThreadFactoryC3888.m11306("᩻ۡ") ^ i7;
                            i9 = ((iM11306 ^ i8) * 29093) ^ (-425197496);
                            i = 1294412646;
                        }
                        i11 = iM11306 ^ i;
                        break;
                    case -1213870363:
                    case -452596287:
                        C0278.m1789();
                        if (C1189.f5284 <= 0) {
                            iM45029 = C19806.m45029("ۧۧ") ^ i8;
                            i9 = ((iM45029 ^ i7) * (-9405)) ^ (-866532965);
                            i10 = -1231972657;
                        } else {
                            iM45029 = (i8 - C19806.m45029("۟᩸")) * (-117);
                            i9 = ((iM45029 ^ i7) * (-9009)) ^ (-1976301176);
                            i10 = 1166795634;
                        }
                        break;
                    case -962945684:
                    case 1169091531:
                        CallableC1627.m5507();
                        throw new RuntimeException();
                    case -752557793:
                    case 40927877:
                        C0629.m2907();
                        if (!C0526.f2219) {
                            iM45029 = (i8 - C19806.m45029("۟᩸")) * (-117);
                            i9 = ((iM45029 ^ i7) * (-9009)) ^ (-1976301176);
                            i10 = 1166795634;
                        } else {
                            iM45029 = ThreadFactoryC3888.m11306("᩹ܳ") ^ i7;
                            i9 = ((iM45029 ^ i8) * 12663) ^ 1252272711;
                            i10 = -1021457384;
                        }
                        break;
                    case -2652228:
                    case 713105219:
                        if (!RunnableC1564.f6300) {
                            iM45029 = ThreadFactoryC3888.m11306("᩹ܳ") ^ i7;
                            i9 = ((iM45029 ^ i8) * 12663) ^ 1252272711;
                            i10 = -1021457384;
                        }
                        iM11306 = ThreadFactoryC3888.m11306("᩻ۡ") ^ i7;
                        i9 = ((iM11306 ^ i8) * 29093) ^ (-425197496);
                        i = 1294412646;
                        i11 = iM11306 ^ i;
                        break;
                    case 17674369:
                    case 140756913:
                        i4 = i2 + i3;
                        s2 = 26858;
                        if (C1668.f6641 < 0) {
                            iM11306 = ThreadFactoryC3888.m11306("ܿۧ") ^ i7;
                            i9 = ((iM11306 ^ i8) * (-14269)) ^ (-43747753);
                            i = 909277253;
                            i11 = iM11306 ^ i;
                        } else {
                            iM45029 = (i8 - C19806.m45029("۟᩸")) * (-117);
                            i9 = ((iM45029 ^ i7) * (-9009)) ^ (-1976301176);
                            i10 = 1166795634;
                        }
                        break;
                    case 406306878:
                    case 2075511012:
                        i2 = s * s;
                        i3 = 180338041;
                        if (C0216.f1393 == 0) {
                            iM11306 = (C19806.m45029("᩷۫") ^ i8) * (-63);
                            i9 = ((iM11306 ^ i7) * 10081) ^ (-1577388408);
                            i = -5537098;
                            i11 = iM11306 ^ i;
                        } else {
                            iM45029 = C19806.m45029("ۧۧ") ^ i8;
                            i9 = ((iM45029 ^ i7) * (-9405)) ^ (-866532965);
                            i10 = -1231972657;
                        }
                        break;
                    case 719336665:
                    case 1512169085:
                        i5 = 57189;
                        iM11306 = (ThreadFactoryC3888.m11306("ۙ۬") + i7) * 71;
                        i9 = ((iM11306 ^ i8) * (-31891)) ^ 2056153843;
                        i = -1333672092;
                        i11 = iM11306 ^ i;
                        break;
                    case 757665664:
                    case 1660817530:
                        short[] sArr2 = f68898;
                        if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                            iM45029 = ThreadFactoryC3888.m11306("᩹ܳ") ^ i7;
                            i9 = ((iM45029 ^ i8) * 12663) ^ 1252272711;
                            i10 = -1021457384;
                        } else if (!RunnableC1895.f7152) {
                            iM45029 = C19806.m45029("ۧۧ") ^ i8;
                            i9 = ((iM45029 ^ i7) * (-9405)) ^ (-866532965);
                            i10 = -1231972657;
                        } else if (!RunnableC1895.f7152) {
                            iM45029 = (i8 - C19806.m45029("۟᩸")) * (-117);
                            i9 = ((iM45029 ^ i7) * (-9009)) ^ (-1976301176);
                            i10 = 1166795634;
                        } else {
                            simpleDateFormat = new SimpleDateFormat(C10634.m26821(sArr2, 1, 12, i5));
                            if (C0817.f3443) {
                                iM11306 = (ThreadFactoryC3888.m11306("᩻ۛ") ^ i8) * 61;
                                i9 = ((iM11306 ^ i7) * (-28081)) ^ 1100639449;
                                i = -1513440952;
                            } else {
                                iM11306 = C19806.m45029("ۛۛ") ^ i8;
                                i9 = ((iM11306 ^ i7) * (-27725)) ^ 79199488;
                                i = -1404830926;
                            }
                            i11 = iM11306 ^ i;
                        }
                        break;
                    default:
                        C1460.m5050();
                        iM45029 = (i8 - C19806.m45029("۟᩸")) * (-117);
                        i9 = ((iM45029 ^ i7) * (-9009)) ^ (-1976301176);
                        i10 = 1166795634;
                        break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47599(String str) {
        short s = f68898[30];
        int i = (s * s) + 149597361;
        int i2 = s + 12231;
        String strM5344 = RunnableC1564.m5344(f68898, 31, 20, (i + i) - (i2 * i2) < 0 ? 53921 : 59772);
        synchronized (C21157.class) {
            m47600(strM5344, str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:132:0x07f1 A[PHI: r0 r2 r3 r7 r23 r25 r27 r30 r39 r40 r41 r42
      0x07f1: PHI (r0v65 int) = (r0v58 int), (r0v60 int), (r0v69 int) binds: [B:130:0x07d8, B:122:0x074f, B:114:0x06c1] A[DONT_GENERATE, DONT_INLINE]
      0x07f1: PHI (r2v73 java.lang.StringBuilder) = (r2v66 java.lang.StringBuilder), (r2v68 java.lang.StringBuilder), (r2v76 java.lang.StringBuilder) binds: [B:130:0x07d8, B:122:0x074f, B:114:0x06c1] A[DONT_GENERATE, DONT_INLINE]
      0x07f1: PHI (r3v50 char) = (r3v43 char), (r3v45 char), (r3v53 char) binds: [B:130:0x07d8, B:122:0x074f, B:114:0x06c1] A[DONT_GENERATE, DONT_INLINE]
      0x07f1: PHI (r7v40 java.lang.String) = (r7v33 java.lang.String), (r7v35 java.lang.String), (r7v44 java.lang.String) binds: [B:130:0x07d8, B:122:0x074f, B:114:0x06c1] A[DONT_GENERATE, DONT_INLINE]
      0x07f1: PHI (r23v30 int) = (r23v23 int), (r23v25 int), (r23v34 int) binds: [B:130:0x07d8, B:122:0x074f, B:114:0x06c1] A[DONT_GENERATE, DONT_INLINE]
      0x07f1: PHI (r25v41 int) = (r25v34 int), (r25v36 int), (r25v44 int) binds: [B:130:0x07d8, B:122:0x074f, B:114:0x06c1] A[DONT_GENERATE, DONT_INLINE]
      0x07f1: PHI (r27v46 int) = (r27v38 int), (r27v41 int), (r27v49 int) binds: [B:130:0x07d8, B:122:0x074f, B:114:0x06c1] A[DONT_GENERATE, DONT_INLINE]
      0x07f1: PHI (r30v42 short[]) = (r30v35 short[]), (r30v37 short[]), (r30v46 short[]) binds: [B:130:0x07d8, B:122:0x074f, B:114:0x06c1] A[DONT_GENERATE, DONT_INLINE]
      0x07f1: PHI (r39v34 int) = (r39v27 int), (r39v29 int), (r39v37 int) binds: [B:130:0x07d8, B:122:0x074f, B:114:0x06c1] A[DONT_GENERATE, DONT_INLINE]
      0x07f1: PHI (r40v34 java.lang.String) = (r40v27 java.lang.String), (r40v29 java.lang.String), (r40v37 java.lang.String) binds: [B:130:0x07d8, B:122:0x074f, B:114:0x06c1] A[DONT_GENERATE, DONT_INLINE]
      0x07f1: PHI (r41v35 int) = (r41v28 int), (r41v30 int), (r41v38 int) binds: [B:130:0x07d8, B:122:0x074f, B:114:0x06c1] A[DONT_GENERATE, DONT_INLINE]
      0x07f1: PHI (r42v21 int) = (r42v14 int), (r42v16 int), (r42v24 int) binds: [B:130:0x07d8, B:122:0x074f, B:114:0x06c1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47602(Throwable th, StringBuilder sb, StackTraceElement[] stackTraceElementArr, String str, String str2, Set set) {
        StringBuilder sb2;
        StringBuilder sb3;
        int i;
        char c;
        int iM45029;
        int i2;
        int i3;
        int iM11306;
        int i4;
        int i5;
        short[] sArr;
        int i6;
        int i7;
        int iM11307;
        int i8;
        int i9;
        int iM11308;
        int i10;
        int i11;
        int iM11309;
        int i12;
        int i13;
        int i14;
        int i15;
        int length;
        String str3;
        int i16;
        int i17;
        StringBuilder sb4;
        int i18;
        short[] sArr2;
        String str4;
        int i19;
        int i20;
        char c2;
        int iM113010;
        int i21;
        int i22;
        StringBuilder sb5;
        short[] sArr3;
        String str5;
        char c3;
        int i23;
        int iM450210;
        int i24;
        StringBuilder sb6;
        int i25;
        char c4;
        int iM450211;
        int i26;
        int i27;
        int iM113011;
        int i28;
        int i29;
        int iM113012;
        int i30;
        int i31;
        StringBuilder sb7 = sb;
        int i32 = 0;
        Throwable thM2905 = null;
        Throwable th2 = null;
        String strM37076 = null;
        int i33 = 0;
        short[] sArr4 = null;
        int i34 = 0;
        int i35 = 0;
        int i36 = 387363487;
        int i37 = C1461.f5957;
        int i38 = C3722.f13525;
        int iM113013 = ThreadFactoryC3888.m11306("ܳܰ") ^ i38;
        int i39 = ((iM113013 ^ i37) * 20605) ^ 193338933;
        int i40 = iM113013 ^ (-681036996);
        Throwable[] thArr = null;
        String strM4892 = null;
        String str6 = null;
        short[] sArr5 = null;
        short[] sArr6 = null;
        int length2 = 0;
        int i41 = 0;
        int i42 = 0;
        int i43 = 0;
        int i44 = 0;
        int i45 = 0;
        int i46 = 0;
        int length3 = 0;
        int i47 = 0;
        int i48 = 0;
        int i49 = 0;
        char c5 = 0;
        int iM6360 = 0;
        short s = 0;
        StackTraceElement[] stackTraceElementArr2 = null;
        while (true) {
            i36 = i40 ^ (i39 & (((i36 ^ i37) * (-29683)) >> 31));
            switch (i36) {
                case -2141556209:
                case -803748398:
                    str6 = str6;
                    strM4892 = strM4892;
                    length2 = length2;
                    i41 = i41;
                    int i50 = iM6360;
                    if (i44 >= i50) {
                        sb2 = sb;
                        sArr5 = sArr5;
                        iM6360 = i50;
                        i49 = i49;
                        i34 = i34;
                        i35 = i35;
                        c5 = c5;
                        i41 = i41;
                        iM11306 = C19806.m45029("ۨܿ") ^ i38;
                        i39 = ((iM11306 ^ i37) * 30827) ^ (-1893336076);
                        i4 = -423202718;
                        i40 = iM11306 ^ i4;
                        c5 = c5;
                        i35 = i35;
                        str6 = str6;
                        i34 = i34;
                        sArr5 = sArr5;
                        iM6360 = iM6360;
                        strM4892 = strM4892;
                        sb7 = sb2;
                        i49 = i49;
                        length2 = length2;
                    } else {
                        int iM113014 = ThreadFactoryC3888.m11306("᩷ܽ") ^ i38;
                        i40 = iM113014 ^ 2130582269;
                        iM6360 = i50;
                        i39 = ((iM113014 ^ i37) * (-19217)) ^ 839911687;
                        str6 = str6;
                        strM4892 = strM4892;
                        length2 = length2;
                        i41 = i41;
                        sb7 = sb;
                    }
                    break;
                case -2097342863:
                case 1398445603:
                    C1461.m5080();
                    if (C1398.f5802 > 0) {
                        strM4892 = strM4892;
                        length2 = length2;
                        sb2 = sb7;
                        i49 = i49;
                        i5 = i34;
                        i35 = i35;
                        iM6360 = iM6360;
                        sArr5 = sArr5;
                        str6 = str6;
                        sArr = sArr4;
                        c5 = c5;
                        int iM113015 = ThreadFactoryC3888.m11306("ۤۗ") ^ i37;
                        sArr4 = sArr;
                        int i51 = ((iM113015 ^ i38) * 21555) ^ 2133082603;
                        i40 = iM113015 ^ (-2112782351);
                        i34 = i5;
                        c5 = c5;
                        i35 = i35;
                        i49 = i49;
                        str6 = str6;
                        strM4892 = strM4892;
                        length2 = length2;
                        i39 = i51;
                        sb7 = sb2;
                        sArr5 = sArr5;
                        iM6360 = iM6360;
                    } else {
                        sb5 = sb7;
                        i23 = iM6360;
                        sArr3 = sArr5;
                        str5 = str6;
                        c3 = c5;
                        iM450210 = (i38 - ThreadFactoryC3888.m11306("۫ۘ")) * 17;
                        i39 = ((iM450210 ^ i37) * (-12449)) ^ (-489094147);
                        i24 = 347851294;
                        i40 = iM450210 ^ i24;
                        c5 = c3;
                        str6 = str5;
                        sArr5 = sArr3;
                        iM6360 = i23;
                        sb7 = sb5;
                    }
                    break;
                case -2069128033:
                case -1218689491:
                    if (C1937.f7317 < 0) {
                        iM113012 = C19806.m45029("ܺ֫") ^ i38;
                        i30 = ((iM113012 ^ i37) * 22265) ^ (-1745889127);
                        i31 = 1001686804;
                    } else {
                        iM113012 = ThreadFactoryC3888.m11306("ۗ۟") ^ i37;
                        i30 = ((iM113012 ^ i38) * (-12977)) ^ (-534484901);
                        i31 = -1735554468;
                    }
                    i40 = iM113012 ^ i31;
                    i39 = i30;
                    break;
                case -1945590261:
                case 541498502:
                    i6 = i35;
                    i7 = i34;
                    i42 = 44087;
                    iM11308 = (C19806.m45029("ۚۢ") + i37) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                    i10 = ((iM11308 ^ i38) * 30043) ^ (-2141111793);
                    i11 = 1926143965;
                    i40 = iM11308 ^ i11;
                    i39 = i10;
                    c5 = c5;
                    str6 = str6;
                    sArr5 = sArr5;
                    iM6360 = iM6360;
                    strM4892 = strM4892;
                    length2 = length2;
                    i41 = i41;
                    sb7 = sb;
                    int i52 = i48;
                    i35 = i6;
                    i48 = i52;
                    int i53 = i49;
                    i34 = i7;
                    i49 = i53;
                    break;
                case -1894661575:
                case -579482160:
                    break;
                case -1684216722:
                case 516576639:
                    if (C0216.m1591() <= 0) {
                        str6 = str6;
                        strM4892 = strM4892;
                        length2 = length2;
                        i41 = i41;
                        c5 = c5;
                        iM6360 = iM6360;
                        s = s;
                        sArr5 = sArr5;
                        int i54 = i35;
                        i48 = i48;
                        i6 = i54;
                        int i55 = i34;
                        i49 = i49;
                        i7 = i55;
                        iM11307 = (C19806.m45029("ܶۡ") ^ i38) * 123;
                        i8 = ((iM11307 ^ i37) * 32633) ^ 1772534842;
                        i9 = 1353995816;
                        i40 = iM11307 ^ i9;
                        s = s;
                        c5 = c5;
                        i39 = i8;
                        str6 = str6;
                        sArr5 = sArr5;
                        iM6360 = iM6360;
                        strM4892 = strM4892;
                        length2 = length2;
                        i41 = i41;
                        sb7 = sb;
                        int i56 = i48;
                        i35 = i6;
                        i48 = i56;
                        int i57 = i49;
                        i34 = i7;
                        i49 = i57;
                    } else {
                        sb5 = sb7;
                        i23 = iM6360;
                        sArr3 = sArr5;
                        str5 = str6;
                        c3 = c5;
                        iM450210 = (i38 - ThreadFactoryC3888.m11306("۫ۘ")) * 17;
                        i39 = ((iM450210 ^ i37) * (-12449)) ^ (-489094147);
                        i24 = 347851294;
                        i40 = iM450210 ^ i24;
                        c5 = c3;
                        str6 = str5;
                        sArr5 = sArr3;
                        iM6360 = i23;
                        sb7 = sb5;
                    }
                    break;
                case -1520956900:
                case 1810467574:
                    strM4892 = strM4892;
                    length2 = length2;
                    i41 = i41;
                    StringBuilder sb8 = sb7;
                    iM6360 = iM6360;
                    sArr5 = sArr5;
                    str6 = str6;
                    int i58 = i48;
                    i6 = i35;
                    c5 = c5;
                    int i59 = i34;
                    i49 = i49;
                    i7 = i59;
                    i48 = i58;
                    C2788.m8480(sb8, C0629.m2906(f68898, IShizukuService.Stub.TRANSACTION_dispatchPackageChanged, 21, i42));
                    RunnableC1895.m6168(sb8, th);
                    if (RunnableC1564.m5345()) {
                        iM11308 = (i38 - C19806.m45029("᩸ܽ")) * 5;
                        i10 = ((iM11308 ^ i37) * 27167) ^ 2058063352;
                        i11 = -1736380888;
                        i40 = iM11308 ^ i11;
                        i39 = i10;
                        c5 = c5;
                        str6 = str6;
                        sArr5 = sArr5;
                        iM6360 = iM6360;
                        strM4892 = strM4892;
                        length2 = length2;
                        i41 = i41;
                        sb7 = sb;
                    } else {
                        int iM113016 = (ThreadFactoryC3888.m11306("᩹ܿ") ^ i37) * (-49);
                        i39 = ((iM113016 ^ i38) * (-30273)) ^ (-1511530211);
                        i40 = iM113016 ^ 1592582594;
                        c5 = c5;
                        str6 = str6;
                        sArr5 = sArr5;
                        iM6360 = iM6360;
                        strM4892 = strM4892;
                        length2 = length2;
                        i41 = i41;
                        sb7 = sb8;
                    }
                    int i510 = i48;
                    i35 = i6;
                    i48 = i510;
                    int i511 = i49;
                    i34 = i7;
                    i49 = i511;
                    break;
                case -1442941995:
                case 1071887147:
                    str6 = str6;
                    strM4892 = strM4892;
                    length2 = length2;
                    i41 = i41;
                    c5 = c5;
                    iM6360 = iM6360;
                    sArr5 = sArr5;
                    int i60 = i35;
                    i48 = i48;
                    i6 = i60;
                    int i61 = i34;
                    i49 = i49;
                    i7 = i61;
                    s = s;
                    int i62 = s + 12361;
                    if ((i62 * i62) - i33 <= 0) {
                        iM11307 = ThreadFactoryC3888.m11306("ᩴ᩹") ^ i37;
                        i8 = ((iM11307 ^ i38) * (-1955)) ^ 65475841;
                        i9 = 2015424416;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("۫ܰ") ^ i38;
                        i8 = ((iM11307 ^ i37) * 20461) ^ 1593675135;
                        i9 = 804845536;
                    }
                    i40 = iM11307 ^ i9;
                    s = s;
                    c5 = c5;
                    i39 = i8;
                    str6 = str6;
                    sArr5 = sArr5;
                    iM6360 = iM6360;
                    strM4892 = strM4892;
                    length2 = length2;
                    i41 = i41;
                    sb7 = sb;
                    int i512 = i48;
                    i35 = i6;
                    i48 = i512;
                    int i513 = i49;
                    i34 = i7;
                    i49 = i513;
                    break;
                case -1431769770:
                case -19294946:
                    str6 = str6;
                    strM4892 = strM4892;
                    length2 = length2;
                    i41 = i41;
                    c5 = c5;
                    iM6360 = iM6360;
                    s = s;
                    sArr5 = sArr5;
                    int i63 = i35;
                    i48 = i48;
                    i6 = i63;
                    int i64 = i34;
                    i49 = i49;
                    i7 = i64;
                    if (C1461.f5957 <= 0) {
                        iM11307 = (C19806.m45029("ۚۙ") ^ i38) * (-97);
                        i8 = ((iM11307 ^ i37) * 7411) ^ (-1483985642);
                        i9 = 390046646;
                    } else {
                        iM11307 = (C19806.m45029("֫ۡ") + i38) * (-93);
                        i8 = ((iM11307 ^ i37) * (-14401)) ^ 2144550139;
                        i9 = -2075413320;
                    }
                    i40 = iM11307 ^ i9;
                    s = s;
                    c5 = c5;
                    i39 = i8;
                    str6 = str6;
                    sArr5 = sArr5;
                    iM6360 = iM6360;
                    strM4892 = strM4892;
                    length2 = length2;
                    i41 = i41;
                    sb7 = sb;
                    int i514 = i48;
                    i35 = i6;
                    i48 = i514;
                    int i515 = i49;
                    i34 = i7;
                    i49 = i515;
                    break;
                case -1416219596:
                case -629891551:
                    C0278.m1789();
                    sb5 = sb7;
                    i23 = iM6360;
                    sArr3 = sArr5;
                    str5 = str6;
                    c3 = c5;
                    iM450210 = (i38 - ThreadFactoryC3888.m11306("۫ۘ")) * 17;
                    i39 = ((iM450210 ^ i37) * (-12449)) ^ (-489094147);
                    i24 = 347851294;
                    i40 = iM450210 ^ i24;
                    c5 = c3;
                    str6 = str5;
                    sArr5 = sArr3;
                    iM6360 = i23;
                    sb7 = sb5;
                    break;
                case -1275924713:
                case 1531366307:
                    strM4892 = strM4892;
                    length2 = length2;
                    sb3 = sb7;
                    i49 = i49;
                    i34 = i34;
                    i35 = i35;
                    i = iM6360;
                    sArr5 = sArr5;
                    str6 = str6;
                    i48 = i48;
                    char c6 = c5;
                    if (i41 <= i48) {
                        iM45029 = ThreadFactoryC3888.m11306("᩷ۡ") ^ i37;
                        i2 = ((iM45029 ^ i38) * 12363) ^ 34167385;
                        i3 = -1643802729;
                    } else {
                        iM45029 = (C19806.m45029("ۙۖ") + i37) * (-71);
                        i2 = ((iM45029 ^ i38) * (-9389)) ^ (-2129738767);
                        i3 = 546994658;
                    }
                    i40 = iM45029 ^ i3;
                    c5 = c6;
                    i39 = i2;
                    str6 = str6;
                    i35 = i35;
                    i34 = i34;
                    strM4892 = strM4892;
                    i48 = i48;
                    sb7 = sb3;
                    i49 = i49;
                    sArr5 = sArr5;
                    iM6360 = i;
                    length2 = length2;
                    break;
                case -1260114125:
                case 1112886000:
                    length2 = length2;
                    sb2 = sb;
                    m47602(th2, sb2, stackTraceElementArr2, C7105.m18989(sArr6, 140, 12, i42), strM37076, set);
                    i43++;
                    i41 = i41;
                    iM11306 = (ThreadFactoryC3888.m11306("ۧ۠") + i37) * 3;
                    i39 = ((iM11306 ^ i38) * 23597) ^ (-2143121628);
                    i4 = 1009226659;
                    i40 = iM11306 ^ i4;
                    c5 = c5;
                    i35 = i35;
                    str6 = str6;
                    i34 = i34;
                    sArr5 = sArr5;
                    iM6360 = iM6360;
                    strM4892 = strM4892;
                    sb7 = sb2;
                    i49 = i49;
                    length2 = length2;
                    break;
                case -1199151002:
                case 1643750828:
                    iM6360 = iM6360;
                    str6 = str6;
                    strM4892 = strM4892;
                    length2 = length2;
                    i41 = i41;
                    m47602(thM2905, sb, stackTraceElementArr2, C0817.m3406(f68898, 170, 11, i42), str2, set);
                    iM113011 = (i38 - ThreadFactoryC3888.m11306("ۡ֡")) * 57;
                    i28 = ((iM113011 ^ i37) * (-25093)) ^ 2089142330;
                    i29 = -671583853;
                    i40 = iM113011 ^ i29;
                    i39 = i28;
                    str6 = str6;
                    iM6360 = iM6360;
                    strM4892 = strM4892;
                    length2 = length2;
                    i41 = i41;
                    sb7 = sb;
                    break;
                case -1158437189:
                case 1251224841:
                    StringBuilder sb9 = sb7;
                    C2788.m8480(sb9, C2871.m8640(f68898, 124, 1, i42));
                    C19806.m45023(sb9, c5);
                    break;
                case -1058509545:
                case 834960627:
                    if (RunnableC1606.f6488 >= 0) {
                        iM113012 = C19806.m45029("ܺ֫") ^ i38;
                        i30 = ((iM113012 ^ i37) * 22265) ^ (-1745889127);
                        i31 = 1001686804;
                        i40 = iM113012 ^ i31;
                        i39 = i30;
                    } else {
                        strM4892 = strM4892;
                        length2 = length2;
                        sb2 = sb7;
                        i49 = i49;
                        i5 = i34;
                        i35 = i35;
                        iM6360 = iM6360;
                        sArr5 = sArr5;
                        str6 = str6;
                        sArr = sArr4;
                        c5 = c5;
                        int iM113017 = ThreadFactoryC3888.m11306("ۤۗ") ^ i37;
                        sArr4 = sArr;
                        int i516 = ((iM113017 ^ i38) * 21555) ^ 2133082603;
                        i40 = iM113017 ^ (-2112782351);
                        i34 = i5;
                        c5 = c5;
                        i35 = i35;
                        i49 = i49;
                        str6 = str6;
                        strM4892 = strM4892;
                        length2 = length2;
                        i39 = i516;
                        sb7 = sb2;
                        sArr5 = sArr5;
                        iM6360 = iM6360;
                    }
                    break;
                case -1027219825:
                case -19905152:
                    if (C1460.f5948 >= 0) {
                        str6 = str6;
                        strM4892 = strM4892;
                        length2 = length2;
                        i41 = i41;
                        c5 = c5;
                        iM6360 = iM6360;
                        s = s;
                        sArr5 = sArr5;
                        int i65 = i35;
                        i48 = i48;
                        i6 = i65;
                        int i66 = i34;
                        i49 = i49;
                        i7 = i66;
                        iM11307 = (C19806.m45029("ۚۙ") ^ i38) * (-97);
                        i8 = ((iM11307 ^ i37) * 7411) ^ (-1483985642);
                        i9 = 390046646;
                        i40 = iM11307 ^ i9;
                        s = s;
                        c5 = c5;
                        i39 = i8;
                        str6 = str6;
                        sArr5 = sArr5;
                        iM6360 = iM6360;
                        strM4892 = strM4892;
                        length2 = length2;
                        i41 = i41;
                        sb7 = sb;
                        int i517 = i48;
                        i35 = i6;
                        i48 = i517;
                        int i518 = i49;
                        i34 = i7;
                        i49 = i518;
                    } else {
                        iM113012 = C19806.m45029("ܺ֫") ^ i38;
                        i30 = ((iM113012 ^ i37) * 22265) ^ (-1745889127);
                        i31 = 1001686804;
                        i40 = iM113012 ^ i31;
                        i39 = i30;
                    }
                    break;
                case -1011311889:
                case 454943009:
                    sb5 = sb7;
                    int i67 = iM6360;
                    sArr3 = sArr5;
                    str5 = str6;
                    c3 = c5;
                    C1148.m4223(sb5, str2);
                    i23 = i67;
                    strM4892 = C1398.m4892(f68898, 135, 4, i42);
                    if (C3577.f13150 >= 0) {
                        iM450210 = (i38 - ThreadFactoryC3888.m11306("۫ۘ")) * 17;
                        i39 = ((iM450210 ^ i37) * (-12449)) ^ (-489094147);
                        i24 = 347851294;
                    } else {
                        iM450210 = (i38 - C19806.m45029("ܽ᩸")) * (-29);
                        i39 = ((iM450210 ^ i37) * (-3349)) ^ (-1664089869);
                        i24 = -135750609;
                    }
                    i40 = iM450210 ^ i24;
                    c5 = c3;
                    str6 = str5;
                    sArr5 = sArr3;
                    iM6360 = i23;
                    sb7 = sb5;
                    break;
                case -1010969897:
                case 1069569743:
                    str3 = strM4892;
                    i16 = length2;
                    i17 = i41;
                    sb4 = sb7;
                    i18 = iM6360;
                    sArr2 = sArr5;
                    str4 = str6;
                    i19 = i48;
                    i20 = i35;
                    c2 = c5;
                    int i68 = i34;
                    i14 = i49;
                    i15 = i68;
                    if (length3 >= 0) {
                        iM113010 = ThreadFactoryC3888.m11306("֡ᩴ") ^ i37;
                        i21 = ((iM113010 ^ i38) * 6327) ^ (-1115572750);
                        i22 = 392002015;
                    } else {
                        iM113010 = ThreadFactoryC3888.m11306("ۢ֨") ^ i37;
                        i21 = ((iM113010 ^ i38) * (-6237)) ^ (-2073413526);
                        i22 = 1695843984;
                    }
                    i40 = iM113010 ^ i22;
                    c5 = c2;
                    i39 = i21;
                    str6 = str4;
                    i35 = i20;
                    strM4892 = str3;
                    length2 = i16;
                    i41 = i17;
                    i48 = i19;
                    sb7 = sb4;
                    sArr5 = sArr2;
                    iM6360 = i18;
                    int i69 = i14;
                    i34 = i15;
                    i49 = i69;
                    break;
                case -966555266:
                case -349885738:
                    strM4892 = strM4892;
                    length2 = length2;
                    sb2 = sb7;
                    i49 = i49;
                    i34 = i34;
                    i35 = i35;
                    iM6360 = iM6360;
                    sArr5 = sArr5;
                    str6 = str6;
                    c5 = c5;
                    if (i32 != 0) {
                        iM11306 = (C19806.m45029("ۢۡ") + i37) * (-49);
                        i39 = ((iM11306 ^ i38) * 24475) ^ 601674630;
                        i4 = -497040582;
                    } else {
                        iM11306 = C19806.m45029("ۨܿ") ^ i38;
                        i39 = ((iM11306 ^ i37) * 30827) ^ (-1893336076);
                        i4 = -423202718;
                    }
                    i40 = iM11306 ^ i4;
                    c5 = c5;
                    i35 = i35;
                    str6 = str6;
                    i34 = i34;
                    sArr5 = sArr5;
                    iM6360 = iM6360;
                    strM4892 = strM4892;
                    sb7 = sb2;
                    i49 = i49;
                    length2 = length2;
                    break;
                case -621357218:
                case -458697240:
                    str6 = str6;
                    strM4892 = strM4892;
                    length2 = length2;
                    i41 = i41;
                    c5 = c5;
                    iM6360 = iM6360;
                    sArr5 = sArr5;
                    int i70 = i35;
                    i48 = i48;
                    i6 = i70;
                    int i71 = i34;
                    i49 = i49;
                    i7 = i71;
                    s = f68898[102];
                    if (C2477.f9839 <= 0) {
                        iM11308 = (i38 - C19806.m45029("᩸ܽ")) * 5;
                        i10 = ((iM11308 ^ i37) * 27167) ^ 2058063352;
                        i11 = -1736380888;
                    } else {
                        iM11308 = ThreadFactoryC3888.m11306("۫᩷") ^ i38;
                        i10 = ((iM11308 ^ i37) * 29383) ^ 499913094;
                        i11 = 1969420470;
                    }
                    i40 = iM11308 ^ i11;
                    i39 = i10;
                    c5 = c5;
                    str6 = str6;
                    sArr5 = sArr5;
                    iM6360 = iM6360;
                    strM4892 = strM4892;
                    length2 = length2;
                    i41 = i41;
                    sb7 = sb;
                    int i519 = i48;
                    i35 = i6;
                    i48 = i519;
                    int i5110 = i49;
                    i34 = i7;
                    i49 = i5110;
                    break;
                case -573071731:
                case -38566957:
                    if (AbstractC0464.f2088 > 0) {
                        iM113012 = (ThreadFactoryC3888.m11306("ۧ֡") + i37) * 13;
                        i30 = ((iM113012 ^ i38) * 25395) ^ 149878081;
                        i31 = -1854982246;
                        i40 = iM113012 ^ i31;
                        i39 = i30;
                    } else {
                        str6 = str6;
                        strM4892 = strM4892;
                        length2 = length2;
                        i41 = i41;
                        iM6360 = iM6360;
                        iM113011 = C19806.m45029("ۨۨ") ^ i38;
                        i28 = ((iM113011 ^ i37) * 28145) ^ (-1845262501);
                        i29 = -1843221257;
                        i40 = iM113011 ^ i29;
                        i39 = i28;
                        str6 = str6;
                        iM6360 = iM6360;
                        strM4892 = strM4892;
                        length2 = length2;
                        i41 = i41;
                        sb7 = sb;
                    }
                    break;
                case -433911556:
                case 1776863555:
                    C1377.m4833();
                    break;
                case -424222063:
                case 2094464744:
                    str6 = str6;
                    strM4892 = strM4892;
                    length2 = length2;
                    i41 = i41;
                    iM6360 = iM6360;
                    strM37076 = C15489.m37076(str2, C2871.m8640(sArr5, i45, i46, i42));
                    sArr6 = f68898;
                    if (!C1977.m6356()) {
                        iM113011 = (ThreadFactoryC3888.m11306("ۙۡ") + i37) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i28 = ((iM113011 ^ i38) * (-8707)) ^ 1066231878;
                        i29 = 2091227328;
                        i40 = iM113011 ^ i29;
                        i39 = i28;
                        str6 = str6;
                        iM6360 = iM6360;
                        strM4892 = strM4892;
                        length2 = length2;
                        i41 = i41;
                        sb7 = sb;
                    } else {
                        int i72 = i35;
                        i48 = i48;
                        i6 = i72;
                        int i73 = i34;
                        i49 = i49;
                        i7 = i73;
                        iM11307 = C19806.m45029("ۗ᩶") ^ i37;
                        i8 = ((iM11307 ^ i38) * 25945) ^ 1136475929;
                        i9 = -1498048932;
                        i40 = iM11307 ^ i9;
                        s = s;
                        c5 = c5;
                        i39 = i8;
                        str6 = str6;
                        sArr5 = sArr5;
                        iM6360 = iM6360;
                        strM4892 = strM4892;
                        length2 = length2;
                        i41 = i41;
                        sb7 = sb;
                        int i5111 = i48;
                        i35 = i6;
                        i48 = i5111;
                        int i5112 = i49;
                        i34 = i7;
                        i49 = i5112;
                    }
                    break;
                case -331317373:
                case -133540325:
                    RunnableC1564.m5345();
                    if (C0671.f2816 == 0) {
                        str6 = str6;
                        strM4892 = strM4892;
                        length2 = length2;
                        i41 = i41;
                        iM6360 = iM6360;
                        iM113011 = C19806.m45029("ۨۨ") ^ i38;
                        i28 = ((iM113011 ^ i37) * 28145) ^ (-1845262501);
                        i29 = -1843221257;
                        i40 = iM113011 ^ i29;
                        i39 = i28;
                        str6 = str6;
                        iM6360 = iM6360;
                        strM4892 = strM4892;
                        length2 = length2;
                        i41 = i41;
                        sb7 = sb;
                    } else {
                        sb5 = sb7;
                        i23 = iM6360;
                        sArr3 = sArr5;
                        str5 = str6;
                        c3 = c5;
                        iM450210 = (i38 - ThreadFactoryC3888.m11306("۫ۘ")) * 17;
                        i39 = ((iM450210 ^ i37) * (-12449)) ^ (-489094147);
                        i24 = 347851294;
                        i40 = iM450210 ^ i24;
                        c5 = c3;
                        str6 = str5;
                        sArr5 = sArr3;
                        iM6360 = i23;
                        sb7 = sb5;
                    }
                    break;
                case -329515133:
                case 1887787076:
                    str3 = strM4892;
                    i16 = length2;
                    i17 = i41;
                    sb4 = sb7;
                    i18 = iM6360;
                    sArr2 = sArr5;
                    str4 = str6;
                    i19 = i48;
                    i20 = i35;
                    c2 = c5;
                    int i74 = i34;
                    i14 = i49;
                    i15 = i74;
                    if (i19 >= 0) {
                        iM113010 = (ThreadFactoryC3888.m11306("ۤ۫") ^ i37) * 15;
                        i21 = ((iM113010 ^ i38) * (-25591)) ^ 242049262;
                        i22 = 305686483;
                    } else {
                        iM113010 = ThreadFactoryC3888.m11306("ۢ֨") ^ i37;
                        i21 = ((iM113010 ^ i38) * (-6237)) ^ (-2073413526);
                        i22 = 1695843984;
                    }
                    i40 = iM113010 ^ i22;
                    c5 = c2;
                    i39 = i21;
                    str6 = str4;
                    i35 = i20;
                    strM4892 = str3;
                    length2 = i16;
                    i41 = i17;
                    i48 = i19;
                    sb7 = sb4;
                    sArr5 = sArr2;
                    iM6360 = i18;
                    int i610 = i14;
                    i34 = i15;
                    i49 = i610;
                    break;
                case -299936853:
                case 926452530:
                    sb6 = sb7;
                    i25 = iM6360;
                    str6 = str6;
                    C1148.m4223(sb6, strM4892);
                    C3722.m10893(sb6, stackTraceElementArr2[i41]);
                    c4 = c5;
                    ThreadFactoryC3888.m11302(sb6, c4);
                    int iM113018 = ThreadFactoryC3888.m11306("ۘ᩺") ^ i38;
                    short[] sArr7 = sArr5;
                    int i75 = ((iM113018 ^ i37) * 9667) ^ 2066923006;
                    i40 = iM113018 ^ 8210531;
                    c5 = c4;
                    str6 = str6;
                    sb7 = sb6;
                    int i76 = i25;
                    i39 = i75;
                    sArr5 = sArr7;
                    iM6360 = i76;
                    break;
                case -268042016:
                case 1944286197:
                    strM4892 = strM4892;
                    length2 = length2;
                    sb5 = sb7;
                    int i77 = i49;
                    iM6360 = iM6360;
                    sArr5 = sArr5;
                    str6 = str6;
                    c5 = c5;
                    C1148.m4223(sb5, str2);
                    sArr4 = f68898;
                    i34 = q.h;
                    i35 = 5;
                    if (!ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        i49 = i77;
                        i41 = i41;
                        i48 = i48;
                        i6 = 5;
                        i7 = q.h;
                        iM11308 = (i38 - C19806.m45029("᩸ܽ")) * 5;
                        i10 = ((iM11308 ^ i37) * 27167) ^ 2058063352;
                        i11 = -1736380888;
                        i40 = iM11308 ^ i11;
                        i39 = i10;
                        c5 = c5;
                        str6 = str6;
                        sArr5 = sArr5;
                        iM6360 = iM6360;
                        strM4892 = strM4892;
                        length2 = length2;
                        i41 = i41;
                        sb7 = sb;
                        int i5113 = i48;
                        i35 = i6;
                        i48 = i5113;
                        int i5114 = i49;
                        i34 = i7;
                        i49 = i5114;
                    } else {
                        int iM113019 = ThreadFactoryC3888.m11306("۠ܿ") ^ i37;
                        i39 = ((iM113019 ^ i38) * (-23305)) ^ 755346524;
                        i40 = iM113019 ^ 1071045773;
                        c5 = c5;
                        i49 = i77;
                        str6 = str6;
                        sArr5 = sArr5;
                        iM6360 = iM6360;
                        strM4892 = strM4892;
                        length2 = length2;
                        sb7 = sb5;
                    }
                    break;
                case -241635995:
                case 890625239:
                    String str7 = str6;
                    String str8 = strM4892;
                    int i78 = iM6360;
                    if (i43 < length2) {
                        iM450211 = C19806.m45029("᩺ܳ") ^ i37;
                        i26 = ((iM450211 ^ i38) * (-20429)) ^ (-1129442167);
                        i27 = 1341902761;
                    } else {
                        iM450211 = (C19806.m45029("ܺۧ") ^ i37) * 31;
                        i26 = ((iM450211 ^ i38) * 12897) ^ (-1608456143);
                        i27 = -1454515596;
                    }
                    i40 = iM450211 ^ i27;
                    iM6360 = i78;
                    i39 = i26;
                    str6 = str7;
                    strM4892 = str8;
                    sb7 = sb;
                    break;
                case -233381189:
                case 704475418:
                    str6 = str6;
                    strM4892 = strM4892;
                    length2 = length2;
                    i41 = i41;
                    c5 = c5;
                    iM6360 = iM6360;
                    s = s;
                    sArr5 = sArr5;
                    int i79 = i35;
                    i48 = i48;
                    i6 = i79;
                    int i80 = i34;
                    i49 = i49;
                    i7 = i80;
                    if (C3722.m10894() <= 0) {
                        iM11307 = C19806.m45029("ۗ᩶") ^ i37;
                        i8 = ((iM11307 ^ i38) * 25945) ^ 1136475929;
                        i9 = -1498048932;
                    } else {
                        iM11307 = (i37 - ThreadFactoryC3888.m11306("ۚۧ")) * 101;
                        i8 = ((iM11307 ^ i38) * (-3705)) ^ (-1215788252);
                        i9 = 1966220984;
                    }
                    i40 = iM11307 ^ i9;
                    s = s;
                    c5 = c5;
                    i39 = i8;
                    str6 = str6;
                    sArr5 = sArr5;
                    iM6360 = iM6360;
                    strM4892 = strM4892;
                    length2 = length2;
                    i41 = i41;
                    sb7 = sb;
                    int i5115 = i48;
                    i35 = i6;
                    i48 = i5115;
                    int i5116 = i49;
                    i34 = i7;
                    i49 = i5116;
                    break;
                case -212122441:
                case 1535317633:
                    str6 = str6;
                    strM4892 = strM4892;
                    length2 = length2;
                    i41 = i41;
                    iM6360 = iM6360;
                    if (C3577.m10572(C2642.m8172(f68898, 152, 18, i42), C1977.m6362(str6, i44)) == -1) {
                        iM113011 = (ThreadFactoryC3888.m11306("᩻᩹") + i37) * 63;
                        i28 = ((iM113011 ^ i38) * 21527) ^ 1626316729;
                        i29 = -1884434908;
                        i40 = iM113011 ^ i29;
                        i39 = i28;
                        str6 = str6;
                        iM6360 = iM6360;
                        strM4892 = strM4892;
                        length2 = length2;
                        i41 = i41;
                        sb7 = sb;
                    } else {
                        sb6 = sb;
                        c4 = c5;
                        i25 = iM6360;
                        strM4892 = strM4892;
                        length2 = length2;
                        i41 = i41;
                        int iM1130110 = ThreadFactoryC3888.m11306("ۘ᩺") ^ i38;
                        short[] sArr8 = sArr5;
                        int i710 = ((iM1130110 ^ i37) * 9667) ^ 2066923006;
                        i40 = iM1130110 ^ 8210531;
                        c5 = c4;
                        str6 = str6;
                        sb7 = sb6;
                        int i711 = i25;
                        i39 = i710;
                        sArr5 = sArr8;
                        iM6360 = i711;
                    }
                    break;
                case -164968316:
                case 146847630:
                    String className = stackTraceElementArr2[i41].getClassName();
                    str6 = className;
                    iM6360 = C1977.m6360(className);
                    i44 = 0;
                    int iM113020 = ThreadFactoryC3888.m11306("ۖܺ") ^ i38;
                    i40 = iM113020 ^ (-1524326671);
                    sb7 = sb;
                    i39 = ((iM113020 ^ i37) * (-14693)) ^ 572851858;
                    strM4892 = strM4892;
                    break;
                case -144047622:
                case 396216819:
                    str6 = str6;
                    strM4892 = strM4892;
                    length2 = length2;
                    i41 = i41;
                    iM6360 = iM6360;
                    th2 = thArr[i43];
                    sArr5 = f68898;
                    i45 = 139;
                    i46 = 1;
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM113011 = C19806.m45029("ۨۨ") ^ i38;
                        i28 = ((iM113011 ^ i37) * 28145) ^ (-1845262501);
                        i29 = -1843221257;
                    } else {
                        iM113011 = ThreadFactoryC3888.m11306("ܽۚ") ^ i38;
                        i28 = ((iM113011 ^ i37) * (-1059)) ^ (-283548723);
                        i29 = 1504194063;
                    }
                    i40 = iM113011 ^ i29;
                    i39 = i28;
                    str6 = str6;
                    iM6360 = iM6360;
                    strM4892 = strM4892;
                    length2 = length2;
                    i41 = i41;
                    sb7 = sb;
                    break;
                case -75100715:
                case 1344028544:
                    str6 = str6;
                    strM4892 = strM4892;
                    length2 = length2;
                    i41 = i41;
                    c5 = c5;
                    iM6360 = iM6360;
                    s = s;
                    sArr5 = sArr5;
                    int i81 = i35;
                    i48 = i48;
                    i6 = i81;
                    int i82 = i34;
                    i49 = i49;
                    i7 = i82;
                    int i83 = (s * s) + 152794321;
                    i33 = i83 + i83;
                    if (C1668.m5583()) {
                        iM11307 = (C19806.m45029("᩸ۙ") ^ i37) * (-3);
                        i8 = ((iM11307 ^ i38) * (-24381)) ^ 1497439710;
                        i9 = 1597216879;
                    } else {
                        iM11307 = (C19806.m45029("ܶۡ") ^ i38) * 123;
                        i8 = ((iM11307 ^ i37) * 32633) ^ 1772534842;
                        i9 = 1353995816;
                    }
                    i40 = iM11307 ^ i9;
                    s = s;
                    c5 = c5;
                    i39 = i8;
                    str6 = str6;
                    sArr5 = sArr5;
                    iM6360 = iM6360;
                    strM4892 = strM4892;
                    length2 = length2;
                    i41 = i41;
                    sb7 = sb;
                    int i5117 = i48;
                    i35 = i6;
                    i48 = i5117;
                    int i5118 = i49;
                    i34 = i7;
                    i49 = i5118;
                    break;
                case -72599077:
                case 1329106063:
                    str3 = strM4892;
                    i16 = length2;
                    sb4 = sb7;
                    int i84 = i49;
                    i15 = i34;
                    i18 = iM6360;
                    sArr2 = sArr5;
                    str4 = str6;
                    i19 = i48;
                    i20 = i35;
                    c2 = c5;
                    i14 = i84;
                    i17 = i41;
                    if (AbstractC0464.m2315(stackTraceElementArr2[i19], stackTraceElementArr[length3])) {
                        iM113010 = ThreadFactoryC3888.m11306("᩻ۙ") ^ i38;
                        i21 = ((iM113010 ^ i37) * 1881) ^ 1736714299;
                        i22 = 1360683433;
                    } else {
                        iM113010 = ThreadFactoryC3888.m11306("ۢ֨") ^ i37;
                        i21 = ((iM113010 ^ i38) * (-6237)) ^ (-2073413526);
                        i22 = 1695843984;
                    }
                    i40 = iM113010 ^ i22;
                    c5 = c2;
                    i39 = i21;
                    str6 = str4;
                    i35 = i20;
                    strM4892 = str3;
                    length2 = i16;
                    i41 = i17;
                    i48 = i19;
                    sb7 = sb4;
                    sArr5 = sArr2;
                    iM6360 = i18;
                    int i611 = i14;
                    i34 = i15;
                    i49 = i611;
                    break;
                case -42943893:
                case 974576051:
                    sb2 = sb7;
                    Throwable[] suppressed = th.getSuppressed();
                    i43 = 0;
                    thArr = suppressed;
                    length2 = suppressed.length;
                    iM11306 = (ThreadFactoryC3888.m11306("ۧ۠") + i37) * 3;
                    i39 = ((iM11306 ^ i38) * 23597) ^ (-2143121628);
                    i4 = 1009226659;
                    i40 = iM11306 ^ i4;
                    c5 = c5;
                    i35 = i35;
                    str6 = str6;
                    i34 = i34;
                    sArr5 = sArr5;
                    iM6360 = iM6360;
                    strM4892 = strM4892;
                    sb7 = sb2;
                    i49 = i49;
                    length2 = length2;
                    break;
                case -28088441:
                case 1739799921:
                    strM4892 = strM4892;
                    length2 = length2;
                    sb2 = sb7;
                    i5 = i34;
                    i35 = i35;
                    iM6360 = iM6360;
                    sArr5 = sArr5;
                    str6 = str6;
                    sArr = sArr4;
                    c5 = c5;
                    C2788.m8480(sb2, C0278.m1774(sArr, i5, i35, i42));
                    i49 = i49;
                    C0817.m3408(sb2, i49);
                    if (MenuItemOnMenuItemClickListenerC3244.m9701() < 0) {
                        sArr4 = sArr;
                        iM11306 = C19806.m45029("ᩴۚ") ^ i37;
                        i34 = i5;
                        i39 = ((iM11306 ^ i38) * (-20481)) ^ (-1922921147);
                        i4 = -1722153445;
                        i40 = iM11306 ^ i4;
                        c5 = c5;
                        i35 = i35;
                        str6 = str6;
                        i34 = i34;
                        sArr5 = sArr5;
                        iM6360 = iM6360;
                        strM4892 = strM4892;
                        sb7 = sb2;
                        i49 = i49;
                        length2 = length2;
                    } else {
                        int iM1130111 = ThreadFactoryC3888.m11306("ۤۗ") ^ i37;
                        sArr4 = sArr;
                        int i5119 = ((iM1130111 ^ i38) * 21555) ^ 2133082603;
                        i40 = iM1130111 ^ (-2112782351);
                        i34 = i5;
                        c5 = c5;
                        i35 = i35;
                        i49 = i49;
                        str6 = str6;
                        strM4892 = strM4892;
                        length2 = length2;
                        i39 = i5119;
                        sb7 = sb2;
                        sArr5 = sArr5;
                        iM6360 = iM6360;
                    }
                    break;
                case 174314804:
                case 620990747:
                    i41++;
                    sb3 = sb;
                    i = iM6360;
                    c = c5;
                    int iM450212 = (C19806.m45029("ۘܿ") + i38) * (-119);
                    i39 = ((iM450212 ^ i37) * 25927) ^ 950903506;
                    i40 = iM450212 ^ (-894908566);
                    c5 = c;
                    str6 = str6;
                    i35 = i35;
                    i34 = i34;
                    strM4892 = strM4892;
                    i48 = i48;
                    sb7 = sb3;
                    i49 = i49;
                    sArr5 = sArr5;
                    iM6360 = i;
                    length2 = length2;
                    break;
                case 176561567:
                case 1041771084:
                    i6 = i35;
                    i7 = i34;
                    i42 = 14797;
                    iM11308 = (C19806.m45029("ۚۢ") + i37) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                    i10 = ((iM11308 ^ i38) * 30043) ^ (-2141111793);
                    i11 = 1926143965;
                    i40 = iM11308 ^ i11;
                    i39 = i10;
                    c5 = c5;
                    str6 = str6;
                    sArr5 = sArr5;
                    iM6360 = iM6360;
                    strM4892 = strM4892;
                    length2 = length2;
                    i41 = i41;
                    sb7 = sb;
                    int i51110 = i48;
                    i35 = i6;
                    i48 = i51110;
                    int i51111 = i49;
                    i34 = i7;
                    i49 = i51111;
                    break;
                case 323176090:
                case 342359226:
                    str6 = str6;
                    strM4892 = strM4892;
                    length2 = length2;
                    i41 = i41;
                    iM6360 = iM6360;
                    sArr5 = sArr5;
                    int i85 = i35;
                    i48 = i48;
                    i6 = i85;
                    int i86 = i34;
                    i49 = i49;
                    i7 = i86;
                    c5 = '\n';
                    if (set.contains(th)) {
                        iM11309 = (i38 - C19806.m45029("᩸᩹")) * 23;
                        i12 = ((iM11309 ^ i37) * (-3303)) ^ 1035161494;
                        i13 = 904094089;
                    } else {
                        iM11309 = ThreadFactoryC3888.m11306("ܺۗ") ^ i38;
                        i12 = ((iM11309 ^ i37) * (-18685)) ^ (-1242687019);
                        i13 = 175241205;
                    }
                    i40 = iM11309 ^ i13;
                    i39 = i12;
                    str6 = str6;
                    sArr5 = sArr5;
                    iM6360 = iM6360;
                    strM4892 = strM4892;
                    length2 = length2;
                    i41 = i41;
                    sb7 = sb;
                    int i51112 = i48;
                    i35 = i6;
                    i48 = i51112;
                    int i51113 = i49;
                    i34 = i7;
                    i49 = i51113;
                    break;
                case 439893707:
                case 789522162:
                    int i87 = i34;
                    i14 = i49;
                    i15 = i87;
                    C1377.m4830(set, th);
                    StackTraceElement[] stackTrace = th.getStackTrace();
                    length = stackTrace.length - 1;
                    stackTraceElementArr2 = stackTrace;
                    i47 = 1;
                    length3 = stackTraceElementArr.length - 1;
                    int iM450213 = (C19806.m45029("ܰ᩻") ^ i38) * (-57);
                    i40 = iM450213 ^ (-700360205);
                    i39 = ((iM450213 ^ i37) * 11885) ^ (-5469373);
                    c5 = c5;
                    str6 = str6;
                    i35 = i35;
                    sArr5 = sArr5;
                    iM6360 = iM6360;
                    strM4892 = strM4892;
                    length2 = length2;
                    sb7 = sb;
                    i48 = length;
                    i41 = i41;
                    int i612 = i14;
                    i34 = i15;
                    i49 = i612;
                    break;
                case 488133638:
                case 921474207:
                    str6 = str6;
                    strM4892 = strM4892;
                    length2 = length2;
                    i41 = i41;
                    iM6360 = iM6360;
                    thM2905 = C0629.m2905(th);
                    if (thM2905 != null) {
                        iM113011 = ThreadFactoryC3888.m11306("ۙ᩻") ^ i37;
                        i28 = ((iM113011 ^ i38) * (-1223)) ^ (-1765700759);
                        i29 = 966555341;
                    } else {
                        iM113011 = (i38 - ThreadFactoryC3888.m11306("ۡ֡")) * 57;
                        i28 = ((iM113011 ^ i37) * (-25093)) ^ 2089142330;
                        i29 = -671583853;
                    }
                    i40 = iM113011 ^ i29;
                    i39 = i28;
                    str6 = str6;
                    iM6360 = iM6360;
                    strM4892 = strM4892;
                    length2 = length2;
                    i41 = i41;
                    sb7 = sb;
                    break;
                case 602276417:
                case 1259963599:
                    if (C3577.f13150 >= 0) {
                        str6 = str6;
                        strM4892 = strM4892;
                        length2 = length2;
                        i41 = i41;
                        iM6360 = iM6360;
                        int i712 = i35;
                        i48 = i48;
                        i6 = i712;
                        int i713 = i34;
                        i49 = i49;
                        i7 = i713;
                        iM11307 = C19806.m45029("ۗ᩶") ^ i37;
                        i8 = ((iM11307 ^ i38) * 25945) ^ 1136475929;
                        i9 = -1498048932;
                        i40 = iM11307 ^ i9;
                        s = s;
                        c5 = c5;
                        i39 = i8;
                        str6 = str6;
                        sArr5 = sArr5;
                        iM6360 = iM6360;
                        strM4892 = strM4892;
                        length2 = length2;
                        i41 = i41;
                        sb7 = sb;
                        int i51114 = i48;
                        i35 = i6;
                        i48 = i51114;
                        int i51115 = i49;
                        i34 = i7;
                        i49 = i51115;
                    } else {
                        iM113012 = (ThreadFactoryC3888.m11306("ۧ֡") + i37) * 13;
                        i30 = ((iM113012 ^ i38) * 25395) ^ 149878081;
                        i31 = -1854982246;
                        i40 = iM113012 ^ i31;
                        i39 = i30;
                    }
                    break;
                case 666629681:
                case 1310162203:
                    i44++;
                    int iM113021 = ThreadFactoryC3888.m11306("ۖܺ") ^ i38;
                    i40 = iM113021 ^ (-1524326671);
                    sb7 = sb;
                    i39 = ((iM113021 ^ i37) * (-14693)) ^ 572851858;
                    strM4892 = strM4892;
                    break;
                case 770368567:
                case 952051423:
                    str3 = strM4892;
                    i16 = length2;
                    i17 = i41;
                    sb4 = sb7;
                    i18 = iM6360;
                    sArr2 = sArr5;
                    str4 = str6;
                    i19 = i48;
                    i20 = i35;
                    c2 = c5;
                    int i88 = i34;
                    i14 = i49;
                    i15 = i88;
                    i32 = 0;
                    iM113010 = (i37 - ThreadFactoryC3888.m11306("۠ۢ")) * 57;
                    i21 = ((iM113010 ^ i38) * 4013) ^ 1471005449;
                    i22 = -681608972;
                    i40 = iM113010 ^ i22;
                    c5 = c2;
                    i39 = i21;
                    str6 = str4;
                    i35 = i20;
                    strM4892 = str3;
                    length2 = i16;
                    i41 = i17;
                    i48 = i19;
                    sb7 = sb4;
                    sArr5 = sArr2;
                    iM6360 = i18;
                    int i613 = i14;
                    i34 = i15;
                    i49 = i613;
                    break;
                case 891747033:
                case 1952935373:
                    int i89 = i49;
                    i15 = i34;
                    length3--;
                    i14 = i89;
                    length = i48 - 1;
                    int iM450214 = (C19806.m45029("ܰ᩻") ^ i38) * (-57);
                    i40 = iM450214 ^ (-700360205);
                    i39 = ((iM450214 ^ i37) * 11885) ^ (-5469373);
                    c5 = c5;
                    str6 = str6;
                    i35 = i35;
                    sArr5 = sArr5;
                    iM6360 = iM6360;
                    strM4892 = strM4892;
                    length2 = length2;
                    sb7 = sb;
                    i48 = length;
                    i41 = i41;
                    int i614 = i14;
                    i34 = i15;
                    i49 = i614;
                    break;
                case 1030840373:
                case 1213965442:
                    str3 = strM4892;
                    i16 = length2;
                    i17 = i41;
                    sb4 = sb7;
                    i15 = i34;
                    i18 = iM6360;
                    sArr2 = sArr5;
                    str4 = str6;
                    i19 = i48;
                    i20 = i35;
                    c2 = c5;
                    int length4 = (stackTraceElementArr2.length - i47) - i19;
                    if (th instanceof JSONException) {
                        i14 = length4;
                        iM113010 = C19806.m45029("ᩴۤ") ^ i38;
                        i21 = ((iM113010 ^ i37) * (-31303)) ^ (-763591959);
                        i22 = 499264501;
                        i40 = iM113010 ^ i22;
                        c5 = c2;
                        i39 = i21;
                    } else {
                        int iM450215 = (C19806.m45029("᩹ܳ") + i38) * (-7);
                        i14 = length4;
                        i39 = ((iM450215 ^ i37) * (-20121)) ^ (-1169237868);
                        i40 = iM450215 ^ (-1334816742);
                        c5 = c2;
                    }
                    str6 = str4;
                    i35 = i20;
                    strM4892 = str3;
                    length2 = i16;
                    i41 = i17;
                    i48 = i19;
                    sb7 = sb4;
                    sArr5 = sArr2;
                    iM6360 = i18;
                    int i615 = i14;
                    i34 = i15;
                    i49 = i615;
                    break;
                case 1225098766:
                case 1717175099:
                    str3 = strM4892;
                    i16 = length2;
                    i17 = i41;
                    sb4 = sb7;
                    i18 = iM6360;
                    sArr2 = sArr5;
                    str4 = str6;
                    i19 = i48;
                    i20 = i35;
                    c2 = c5;
                    int i90 = i34;
                    i14 = i49;
                    i15 = i90;
                    if (th instanceof C4987) {
                        iM113010 = C19806.m45029("ᩴۤ") ^ i38;
                        i21 = ((iM113010 ^ i37) * (-31303)) ^ (-763591959);
                        i22 = 499264501;
                    } else {
                        i32 = i47;
                        iM113010 = (i37 - ThreadFactoryC3888.m11306("۠ۢ")) * 57;
                        i21 = ((iM113010 ^ i38) * 4013) ^ 1471005449;
                        i22 = -681608972;
                    }
                    i40 = iM113010 ^ i22;
                    c5 = c2;
                    i39 = i21;
                    str6 = str4;
                    i35 = i20;
                    strM4892 = str3;
                    length2 = i16;
                    i41 = i17;
                    i48 = i19;
                    sb7 = sb4;
                    sArr5 = sArr2;
                    iM6360 = i18;
                    int i616 = i14;
                    i34 = i15;
                    i49 = i616;
                    break;
                case 1530223394:
                case 1602653629:
                    strM4892 = strM4892;
                    length2 = length2;
                    sb2 = sb7;
                    i49 = i49;
                    i34 = i34;
                    i35 = i35;
                    iM6360 = iM6360;
                    sArr5 = sArr5;
                    str6 = str6;
                    c5 = c5;
                    if (i49 != 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܿ᩹") ^ i38) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i39 = ((iM11306 ^ i37) * (-8159)) ^ 1830152790;
                        i4 = -436051552;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۡ۟") ^ i38;
                        i39 = ((iM11306 ^ i37) * (-22551)) ^ (-139839641);
                        i4 = -670150225;
                    }
                    i40 = iM11306 ^ i4;
                    c5 = c5;
                    i35 = i35;
                    str6 = str6;
                    i34 = i34;
                    sArr5 = sArr5;
                    iM6360 = iM6360;
                    strM4892 = strM4892;
                    sb7 = sb2;
                    i49 = i49;
                    length2 = length2;
                    break;
                case 1953831203:
                case 2030486573:
                    sb3 = sb7;
                    i = iM6360;
                    c = c5;
                    C1148.m4223(sb3, str2);
                    C1148.m4223(sb3, str);
                    RunnableC1895.m6168(sb3, th);
                    ThreadFactoryC3888.m11302(sb3, c);
                    i41 = 0;
                    int iM450216 = (C19806.m45029("ۘܿ") + i38) * (-119);
                    i39 = ((iM450216 ^ i37) * 25927) ^ 950903506;
                    i40 = iM450216 ^ (-894908566);
                    c5 = c;
                    str6 = str6;
                    i35 = i35;
                    i34 = i34;
                    strM4892 = strM4892;
                    i48 = i48;
                    sb7 = sb3;
                    i49 = i49;
                    sArr5 = sArr5;
                    iM6360 = i;
                    length2 = length2;
                    break;
                default:
                    sb2 = sb7;
                    iM6360 = iM6360;
                    sArr5 = sArr5;
                    str6 = str6;
                    c5 = c5;
                    strM4892 = strM4892;
                    C2788.m8480(sb2, RunnableC1895.m6164(f68898, 130, 5, i42));
                    ThreadFactoryC3888.m11302(sb2, c5);
                    length2 = length2;
                    i49 = i49;
                    i34 = i34;
                    i35 = i35;
                    iM11306 = ThreadFactoryC3888.m11306("ۡ۟") ^ i38;
                    i39 = ((iM11306 ^ i37) * (-22551)) ^ (-139839641);
                    i4 = -670150225;
                    i40 = iM11306 ^ i4;
                    c5 = c5;
                    i35 = i35;
                    str6 = str6;
                    i34 = i34;
                    sArr5 = sArr5;
                    iM6360 = iM6360;
                    strM4892 = strM4892;
                    sb7 = sb2;
                    i49 = i49;
                    length2 = length2;
                    break;
            }
            return;
        }
    }
}
