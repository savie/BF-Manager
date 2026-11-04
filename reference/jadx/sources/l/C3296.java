package l;

import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۗۡ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: I141 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3296 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static int f10730 = 0;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static int f10731 = 0;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ColorStateList f10732 = null;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public static int f10733 = 0;

    /* JADX INFO: renamed from: ֫ܺۤ, reason: not valid java name and contains not printable characters */
    private static final short[] f10734 = {1337, 6902, 6890, 6887, 6895, 6887, 6877, 6886, 6883, 6896, 6889, 5695, -4567, -4555, -4552, -4560, -4552, -4606, -4551, -4548, -4561, -4554, -4548, -4568, -4567, -4558, -4606, -4562, -4566, -4556, -4567, -4546, -4555, -4606, -4567, -4555, -4552, -4560, -4552, -4606, -4566, -4556, -4567, -4555, -4606, -4562, -4572, -4562, -4567, -4552, -4560, 4496, 27245, 27257, 27256, 27235, 27219, 27263, 27259, 27237, 27256, 27247, 27236, 27219, 27256, 27236, 27241, 27233, 27241, 27219, 27259, 27237, 27256, 27236, 27219, 27263, 27253, 27263, 27256, 27241, 27233, 6215, 17268, 17256, 17253, 17261, 17253, 17247, 17252, 17249, 17266, 17259};

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static int f10735 = 0;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static int f10736 = 0;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static int f10737 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int f10738 = 0;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public static boolean f10739 = true;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static ColorStateList f10740 = null;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public static int f10741 = 0;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static int f10742 = 0;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static int f10743 = 0;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static int f10744 = 0;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static int f10745 = 0;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static int f10746 = 0;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static int f10747 = 0;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static int f10748 = 0;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public static RunnableC13254 f10749 = null;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int f10750 = 0;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public static ColorStateList f10751 = null;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static int f10752 = 0;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static int f10753 = 0;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public static int f10754 = 0;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static boolean f10755 = false;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int f10756 = 0;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static int f10757 = 0;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public static int f10758 = 0;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static boolean f10759 = false;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public static int f10760 = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static int f10761 = 0;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public static int f10762 = 0;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int f10763 = 0;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public static int f10764 = 0;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static int f10765 = 0;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static int f10766 = 0;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static int f10767 = 0;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public static int f10768 = 0;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static int f10769 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static int f10770 = 0;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int f10771 = 0;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public static boolean f10772 = true;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static int f10773;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public static int f10774;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static int f10775;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public static int f10776;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static int f10777;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static int f10778;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public static ColorStateList f10779;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static float m10870(float f, float f2) {
        int i = 1032826054;
        int i2 = C3033.f9831;
        int i3 = RunnableC0334.f1808;
        int iM2761 = C0619.m2761("᩶ۨ") ^ i2;
        int i4 = ((iM2761 ^ i3) * (-6801)) ^ (-298770737);
        int i5 = -956746441;
        while (true) {
            i = ((((i ^ i3) * (-26985)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2123821678:
                case -12199982:
                    if (f10739) {
                        iM2761 = (C0619.m2761("ۛ۟") + i2) * (-9);
                        i4 = ((iM2761 ^ i3) * 7097) ^ 2094837587;
                        i5 = 1779818778;
                    } else {
                        iM2761 = C0773.m3169("ᩳۛ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 2613) ^ 1553455746;
                        i5 = 1626846062;
                    }
                    break;
                case -2110988958:
                case 418095839:
                    if (AbstractC0116.f1064 <= 0) {
                        iM2761 = C0619.m2761("֫ۢ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 10157) ^ (-863427305);
                        i5 = -1164154189;
                    } else {
                        iM2761 = C0773.m3169("ᩴ۫") ^ i2;
                        i4 = ((iM2761 ^ i3) * 26085) ^ 1796806039;
                        i5 = -992813424;
                    }
                    break;
                case -1969631251:
                case 1900581315:
                    if (C3734.m12152() < 0) {
                        iM2761 = C0619.m2761("֫ۢ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 10157) ^ (-863427305);
                        i5 = -1164154189;
                    } else {
                        iM2761 = C0619.m2761("۠ܰ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-1085)) ^ 621271096;
                        i5 = -813377627;
                    }
                    break;
                case -1899694446:
                case -1282693587:
                    if (C2287.m7745() <= 0) {
                        iM2761 = (C0773.m3169("ۤۙ") + i3) * 71;
                        i4 = ((iM2761 ^ i2) * (-505)) ^ (-1299331642);
                        i5 = 259296474;
                    } else {
                        iM2761 = (i2 - C0773.m3169("ۘۨ")) * 89;
                        i4 = ((iM2761 ^ i3) * 14383) ^ (-1824422733);
                        i5 = 147123406;
                    }
                    break;
                case -1509421574:
                case -418888954:
                    if (C1321.f4751 >= 0) {
                        iM2761 = C0619.m2761("۫ۛ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-32321)) ^ (-951228757);
                        i5 = -570593898;
                    } else {
                        iM2761 = (i3 - C0619.m2761("֡֨")) * (-53);
                        i4 = ((iM2761 ^ i2) * 8869) ^ (-337882060);
                        i5 = 1442596053;
                    }
                    break;
                case -1330675239:
                case 690367919:
                    if (AbstractC0116.f1064 <= 0) {
                        iM2761 = C0619.m2761("۫ۛ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-32321)) ^ (-951228757);
                        i5 = -570593898;
                    } else {
                        iM2761 = C0619.m2761("ۧ᩵") ^ i2;
                        i4 = ((iM2761 ^ i3) * 31695) ^ (-744626824);
                        i5 = -492172118;
                    }
                    break;
                case -1252012195:
                case -96733894:
                    C0487.m2356();
                    iM2761 = C0619.m2761("۫ۛ") ^ i2;
                    i4 = ((iM2761 ^ i3) * (-32321)) ^ (-951228757);
                    i5 = -570593898;
                    break;
                case -1056793576:
                case -416531692:
                    if (C2375.f7641 <= 0) {
                        iM2761 = (C0773.m3169("ۤۙ") + i3) * 71;
                        i4 = ((iM2761 ^ i2) * (-505)) ^ (-1299331642);
                        i5 = 259296474;
                    } else {
                        iM2761 = C0619.m2761("ۡۛ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-32459)) ^ 630071028;
                        i5 = -2043378440;
                    }
                    break;
                case -736137792:
                case 722323405:
                    if (C3779.f12953 <= 0) {
                        iM2761 = (C0773.m3169("ۤۙ") + i3) * 71;
                        i4 = ((iM2761 ^ i2) * (-505)) ^ (-1299331642);
                        i5 = 259296474;
                    } else {
                        iM2761 = (C0773.m3169("᩺ܽ") ^ i2) * (-19);
                        i4 = ((iM2761 ^ i3) * 20227) ^ 1507938525;
                        i5 = 850918620;
                    }
                    break;
                case -499216653:
                case 225894254:
                    if (C3779.m12264()) {
                        iM2761 = C0619.m2761("۬ܶ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-21859)) ^ (-910971752);
                        i5 = 1632682871;
                    } else {
                        iM2761 = C0619.m2761("۫ۛ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-32321)) ^ (-951228757);
                        i5 = -570593898;
                    }
                    break;
                case -155183814:
                case 1431009129:
                    return f2;
                case -80811624:
                case 1843550830:
                    return f;
                case 13064873:
                case 1256815194:
                    if (RunnableC3055.f9898 >= 0) {
                        iM2761 = (C0773.m3169("ۤۙ") + i3) * 71;
                        i4 = ((iM2761 ^ i2) * (-505)) ^ (-1299331642);
                        i5 = 259296474;
                    } else {
                        iM2761 = C0773.m3169("ۗ᩶") ^ i3;
                        i4 = ((iM2761 ^ i2) * 5243) ^ (-745844930);
                        i5 = -1261036254;
                    }
                    break;
                case 594020883:
                case 1430323086:
                    C2287.m7745();
                    if (C3492.f12043 <= 0) {
                        iM2761 = C0619.m2761("۠ܰ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-1085)) ^ 621271096;
                        i5 = -813377627;
                    } else {
                        iM2761 = C0619.m2761("۫ۛ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-32321)) ^ (-951228757);
                        i5 = -570593898;
                    }
                    break;
                case 665725260:
                case 841061228:
                    C3099.m10095();
                    C1826.m6301();
                    return 0.0f;
                case 824241593:
                case 1425006706:
                    if (C1080.f3865 >= 0) {
                        iM2761 = C0619.m2761("֫ۢ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 10157) ^ (-863427305);
                        i5 = -1164154189;
                    } else {
                        iM2761 = C0619.m2761("᩺ۘ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-15127)) ^ 706855295;
                        i5 = 150151968;
                    }
                    break;
                case 1281270876:
                case 1811468612:
                    if (AbstractC3624.f12429 <= 0) {
                        iM2761 = (C0773.m3169("ۤۙ") + i3) * 71;
                        i4 = ((iM2761 ^ i2) * (-505)) ^ (-1299331642);
                        i5 = 259296474;
                    } else {
                        iM2761 = C0773.m3169("ۜᩴ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 2791) ^ (-1674287895);
                        i5 = -325969237;
                    }
                    break;
                default:
                    if (RunnableC1848.f6235) {
                        iM2761 = C0619.m2761("۠ܰ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-1085)) ^ 621271096;
                        i5 = -813377627;
                    } else {
                        iM2761 = C0619.m2761("۠ۘ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-32709)) ^ 1262713234;
                        i5 = -1215039403;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m10874(Configuration configuration, int i) {
        boolean zM10877 = false;
        boolean z = false;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 389628798;
        int i7 = C2288.f7433;
        int i8 = C3448.f11240;
        int iM3169 = (C0773.m3169("ۛ᩸") + i8) * 59;
        int i9 = ((iM3169 ^ i7) * 17363) ^ (-438131590);
        int i10 = -627117600;
        while (true) {
            i6 = ((((i6 ^ i7) * (-4411)) >> 31) & i9) ^ (iM3169 ^ i10);
            switch (i6) {
                case -1851225041:
                case 1403748209:
                    if (C2834.f9334 <= 0) {
                        iM3169 = (C0773.m3169("ۧۧ") ^ i8) * 21;
                        i9 = ((iM3169 ^ i7) * 13543) ^ (-197396787);
                        i10 = -285481435;
                    } else {
                        iM3169 = C0773.m3169("ۚ᩺") ^ i7;
                        i9 = ((iM3169 ^ i8) * 1949) ^ (-1930326707);
                        i10 = 838351918;
                    }
                    break;
                case -1847732141:
                case -1631641276:
                    i5 = 32;
                    iM3169 = C0619.m2761("ᩴ۠") ^ i8;
                    i9 = ((iM3169 ^ i7) * (-22773)) ^ (-1248509943);
                    i10 = -1760960795;
                    break;
                case -1810324579:
                case 1463225293:
                    if (i != 2) {
                        iM3169 = C0619.m2761("ܿ۬") ^ i8;
                        i9 = ((iM3169 ^ i7) * (-13807)) ^ 1383334648;
                        i10 = -1089664975;
                    } else {
                        zM10877 = z;
                        iM3169 = (i8 - C0773.m3169("ܺ֫")) * (-119);
                        i9 = ((iM3169 ^ i7) * 6231) ^ 1315419341;
                        i10 = -1651189393;
                    }
                    break;
                case -1810040031:
                case -289993742:
                    if (C2878.f9462) {
                        iM3169 = C0773.m3169("ܳ۠") ^ i8;
                        i9 = ((iM3169 ^ i7) * 28703) ^ (-1340383561);
                        i10 = 667752872;
                    } else {
                        iM3169 = (C0619.m2761("᩵ۖ") + i7) * 49;
                        i9 = ((iM3169 ^ i8) * (-22289)) ^ (-481921825);
                        i10 = 1629693178;
                    }
                    break;
                case -1780747173:
                case 2135120047:
                    i2 = configuration.uiMode;
                    i3 = -49;
                    if (C2287.f7432 >= 0) {
                        iM3169 = (C0773.m3169("ۧۧ") ^ i8) * 21;
                        i9 = ((iM3169 ^ i7) * 13543) ^ (-197396787);
                        i10 = -285481435;
                    } else {
                        iM3169 = C0773.m3169("ۜۧ") ^ i7;
                        i9 = ((iM3169 ^ i8) * (-12457)) ^ 1334422912;
                        i10 = -1677638917;
                    }
                    break;
                case -1686207299:
                case -945096555:
                    if (i != -100) {
                        iM3169 = C0619.m2761("ۖܳ") ^ i8;
                        i9 = ((iM3169 ^ i7) * (-27779)) ^ 2052803480;
                        i10 = 63951163;
                    } else {
                        iM3169 = C0773.m3169("ᩴ۬") ^ i7;
                        i9 = ((iM3169 ^ i8) * (-29911)) ^ 68146739;
                        i10 = 2035252961;
                    }
                    break;
                case -1682911886:
                case -315747457:
                    if (zM10877) {
                        iM3169 = C0773.m3169("۠ۛ") ^ i7;
                        i9 = ((iM3169 ^ i8) * 22725) ^ (-1415923433);
                        i10 = -208722699;
                    } else {
                        iM3169 = C0619.m2761("ᩴۨ") ^ i7;
                        i9 = ((iM3169 ^ i8) * 20237) ^ (-456703306);
                        i10 = 1242529871;
                    }
                    break;
                case -1676594957:
                case -1284180220:
                    if (C0862.f3233 != 0) {
                        iM3169 = (C0773.m3169("ܿۤ") ^ i7) * (-59);
                        i9 = ((iM3169 ^ i8) * 6089) ^ 1374882098;
                        i10 = 1885354461;
                    } else {
                        iM3169 = (i7 - C0619.m2761("᩷۬")) * (-67);
                        i9 = ((iM3169 ^ i8) * (-26851)) ^ (-416240590);
                        i10 = -26749771;
                    }
                    break;
                case -1521526038:
                case -181877340:
                    if (RunnableC3055.f9898 < 0) {
                        iM3169 = (C0773.m3169("ۧۧ") ^ i8) * 21;
                        i9 = ((iM3169 ^ i7) * 13543) ^ (-197396787);
                        i10 = -285481435;
                    } else {
                        iM3169 = C0773.m3169("۠֫") ^ i7;
                        i9 = ((iM3169 ^ i8) * 21873) ^ 201915002;
                        i10 = 1435061450;
                    }
                    break;
                case -1403914671:
                case 1403712915:
                    if (AbstractC0116.m1243() != 0) {
                        iM3169 = C0773.m3169("۠֫") ^ i7;
                        i9 = ((iM3169 ^ i8) * 21873) ^ 201915002;
                        i10 = 1435061450;
                    } else {
                        iM3169 = C0773.m3169("ܽܳ") ^ i8;
                        i9 = ((iM3169 ^ i7) * 4825) ^ 288664667;
                        i10 = 102005719;
                    }
                    break;
                case -1153438371:
                case 926964409:
                    if (C1826.f6190 <= 0) {
                        iM3169 = (C0773.m3169("᩶֡") ^ i7) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i9 = ((iM3169 ^ i8) * (-1681)) ^ (-77784738);
                        i10 = -1863955470;
                    } else {
                        iM3169 = C0773.m3169("ۚۢ") ^ i8;
                        i9 = ((iM3169 ^ i7) * (-30787)) ^ 1214141711;
                        i10 = 803446651;
                    }
                    break;
                case -1074725506:
                case -813415677:
                    if (C3734.f12817 < 0) {
                        iM3169 = (C0773.m3169("᩶֡") ^ i7) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i9 = ((iM3169 ^ i8) * (-1681)) ^ (-77784738);
                        i10 = -1863955470;
                    } else {
                        iM3169 = C0773.m3169("۠֫") ^ i7;
                        i9 = ((iM3169 ^ i8) * 21873) ^ 201915002;
                        i10 = 1435061450;
                    }
                    break;
                case -1018503412:
                case 454976324:
                    zM10877 = f10739;
                    iM3169 = (i8 - C0773.m3169("ܺ֫")) * (-119);
                    i9 = ((iM3169 ^ i7) * 6231) ^ 1315419341;
                    i10 = -1651189393;
                    break;
                case -970926824:
                case 221384992:
                    configuration.uiMode = i5 | i4;
                    break;
                case -762452219:
                case 651801989:
                    zM10877 = m10877(configuration);
                    iM3169 = (i8 - C0773.m3169("ܺ֫")) * (-119);
                    i9 = ((iM3169 ^ i7) * 6231) ^ 1315419341;
                    i10 = -1651189393;
                    break;
                case -520158309:
                case 1964704643:
                    C3448.m11248();
                    iM3169 = C0773.m3169("۠֫") ^ i7;
                    i9 = ((iM3169 ^ i8) * 21873) ^ 201915002;
                    i10 = 1435061450;
                    break;
                case -343492992:
                case 1165049686:
                    if (i != -1) {
                        iM3169 = (i8 - C0773.m3169("۫ۛ")) * (-37);
                        i9 = ((iM3169 ^ i7) * 4893) ^ 16032610;
                        i10 = -1930548195;
                    } else {
                        iM3169 = C0773.m3169("᩻ܿ") ^ i7;
                        i9 = ((iM3169 ^ i8) * (-20845)) ^ (-1841912435);
                        i10 = 1149808380;
                    }
                    break;
                case -295886617:
                case -10113319:
                    if (C3077.f9998) {
                        iM3169 = (C0773.m3169("۬᩵") + i7) * (-87);
                        i9 = ((iM3169 ^ i8) * (-18135)) ^ (-1638182953);
                        i10 = -1111366642;
                    } else {
                        iM3169 = (C0773.m3169("ۧۧ") ^ i8) * 21;
                        i9 = ((iM3169 ^ i7) * 13543) ^ (-197396787);
                        i10 = -285481435;
                    }
                    break;
                case -28066259:
                case 104293821:
                    i4 = i2 & i3;
                    if (C20932.f66974 <= 0) {
                        iM3169 = (C0773.m3169("ܿۤ") ^ i7) * (-59);
                        i9 = ((iM3169 ^ i8) * 6089) ^ 1374882098;
                        i10 = 1885354461;
                    } else {
                        iM3169 = (i8 - C0773.m3169("۟ۙ")) * (-35);
                        i9 = ((iM3169 ^ i7) * (-25837)) ^ 126713067;
                        i10 = 859526460;
                    }
                    break;
                case 63923008:
                case 1590569760:
                    if (RunnableC1848.f6235) {
                        iM3169 = (C0773.m3169("ۧۧ") ^ i8) * 21;
                        i9 = ((iM3169 ^ i7) * 13543) ^ (-197396787);
                        i10 = -285481435;
                    } else {
                        iM3169 = (i8 - C0773.m3169("᩺ۨ")) * 21;
                        i9 = ((iM3169 ^ i7) * 4143) ^ 1379720504;
                        i10 = -478175318;
                    }
                    break;
                case 403263193:
                case 646821861:
                    if (C3734.m12152() >= 0) {
                        iM3169 = C0773.m3169("ܳ۠") ^ i8;
                        i9 = ((iM3169 ^ i7) * 28703) ^ (-1340383561);
                        i10 = 667752872;
                    } else {
                        iM3169 = (C0773.m3169("ۧۧ") ^ i8) * 21;
                        i9 = ((iM3169 ^ i7) * 13543) ^ (-197396787);
                        i10 = -285481435;
                    }
                    break;
                case 671306072:
                case 1037769215:
                    if (C0950.f3488 >= 0) {
                        iM3169 = (C0773.m3169("᩶֡") ^ i7) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i9 = ((iM3169 ^ i8) * (-1681)) ^ (-77784738);
                        i10 = -1863955470;
                    } else {
                        iM3169 = C0619.m2761("ۤ᩷") ^ i8;
                        i9 = ((iM3169 ^ i7) * 5537) ^ 1176087688;
                        i10 = -1232640107;
                    }
                    break;
                case 677289446:
                case 1349128595:
                    i5 = 16;
                    iM3169 = C0619.m2761("ᩴ۠") ^ i8;
                    i9 = ((iM3169 ^ i7) * (-22773)) ^ (-1248509943);
                    i10 = -1760960795;
                    break;
                case 937144668:
                case 964689174:
                    AbstractC0641.m2813();
                    C1321.m4852();
                    break;
                case 1036233056:
                case 2002416800:
                    zM10877 = false;
                    iM3169 = (i8 - C0773.m3169("ܺ֫")) * (-119);
                    i9 = ((iM3169 ^ i7) * 6231) ^ 1315419341;
                    i10 = -1651189393;
                    break;
                case 1464095514:
                case 1520569908:
                    zM10877 = f10739;
                    iM3169 = (i8 - C0773.m3169("ܺ֫")) * (-119);
                    i9 = ((iM3169 ^ i7) * 6231) ^ 1315419341;
                    i10 = -1651189393;
                    break;
                default:
                    z = true;
                    if (i != 1) {
                        iM3169 = C0773.m3169("ۢ᩷") ^ i7;
                        i9 = ((iM3169 ^ i8) * 6977) ^ 890696190;
                        i10 = 895861573;
                    } else {
                        iM3169 = C0619.m2761("ۛ۟") ^ i8;
                        i9 = ((iM3169 ^ i7) * 24819) ^ 444607277;
                        i10 = -712323422;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m10882(Configuration configuration, int i) {
        int iM3169;
        int i2;
        boolean zM10877 = false;
        boolean z = false;
        boolean z2 = false;
        boolean zM10878 = false;
        int i3 = 955556331;
        int i4 = AbstractC3624.f12429;
        int i5 = C2966.f9654;
        int iM2761 = (C0619.m2761("ۨ֨") + i5) * (-7);
        int i6 = ((iM2761 ^ i4) * (-23953)) ^ (-1503019773);
        int i7 = -1133680442;
        while (true) {
            int i8 = iM2761 ^ i7;
            while (true) {
                i3 = ((((i3 ^ i4) * (-3271)) >> 31) & i6) ^ i8;
                switch (i3) {
                    case -2082842902:
                    case 647049021:
                        if (C2310.m7813() > 0) {
                            iM2761 = (C0619.m2761("᩻۬") ^ i5) * (-15);
                            i6 = ((iM2761 ^ i4) * 30575) ^ 34452649;
                            i7 = -1720991363;
                            break;
                        }
                        iM2761 = C0773.m3169("۫᩹") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-30689)) ^ (-2067512882);
                        i7 = 1988058889;
                        break;
                    case -2028586151:
                    case -478356350:
                        if (AbstractC0116.m1243() == 0) {
                            iM2761 = C0619.m2761("᩵᩸") ^ i4;
                            i6 = ((iM2761 ^ i5) * (-31915)) ^ 41513890;
                            i7 = 1028666041;
                            break;
                        }
                        iM2761 = C0619.m2761("֫֡") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-14353)) ^ (-95478087);
                        i7 = 1906246176;
                        break;
                    case -1878851006:
                    case 369412098:
                        if (i == z2) {
                            iM2761 = C0619.m2761("ᩳ᩹") ^ i5;
                            i6 = ((iM2761 ^ i4) * (-19503)) ^ 1066186530;
                            i7 = -1466867327;
                            break;
                        }
                        iM2761 = C0619.m2761("ۛ᩹") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-20797)) ^ (-1287984922);
                        i7 = -663802838;
                        break;
                    case -1586198923:
                    case 203257776:
                        if (!C0619.f2439) {
                            iM2761 = (i4 - C0773.m3169("۫ܳ")) * (-13);
                            i6 = ((iM2761 ^ i5) * 7725) ^ 455651237;
                            i7 = 2051873585;
                            break;
                        }
                        iM2761 = C0773.m3169("۫᩹") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-30689)) ^ (-2067512882);
                        i7 = 1988058889;
                        break;
                        break;
                    case -1416927278:
                    case 1920789117:
                        if (C2966.f9654 < 0) {
                            iM2761 = (i4 - C0619.m2761("ۨ᩶")) * 17;
                            i6 = ((iM2761 ^ i5) * 6907) ^ (-436214355);
                            i7 = 2120135395;
                            break;
                        }
                        iM2761 = (C0619.m2761("ۖۨ") + i5) * 43;
                        i6 = ((iM2761 ^ i4) * (-15033)) ^ (-663929366);
                        i7 = 1583988857;
                        break;
                    case -1364727822:
                    case 1771575748:
                        C1321.m4852();
                        return false;
                    case -1340674404:
                    case -1039904501:
                        zM10878 = f10739;
                        iM2761 = C0773.m3169("۫ۧ") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-1507)) ^ 2146939342;
                        i7 = -1265343509;
                        break;
                    case -1182362240:
                    case -1031074308:
                        return z2;
                    case -1068666412:
                    case 1164969751:
                        if (i == 2) {
                            iM2761 = C0773.m3169("᩺ۨ") ^ i4;
                            i6 = ((iM2761 ^ i5) * (-18529)) ^ 707349806;
                            i7 = 59975801;
                            break;
                        }
                        iM2761 = C0619.m2761("ܳܺ") ^ i4;
                        i6 = ((iM2761 ^ i5) * 10295) ^ (-1925038027);
                        i7 = -67427535;
                        break;
                    case -1006384487:
                    case 898492964:
                        zM10878 = false;
                        iM2761 = C0773.m3169("۫ۧ") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-1507)) ^ 2146939342;
                        i7 = -1265343509;
                        break;
                        break;
                    case -980923215:
                    case -167829298:
                        C4282.m13644();
                        iM2761 = C0773.m3169("ᩳۖ") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-21497)) ^ 1106606000;
                        i7 = -192616764;
                        break;
                    case -847481002:
                    case 1504351367:
                        if (C2354.f7599 < 0) {
                            iM2761 = C0773.m3169("᩹᩶") ^ i4;
                            i6 = ((iM2761 ^ i5) * (-669)) ^ (-1820753133);
                            i7 = 965906090;
                            break;
                        }
                        iM2761 = C0773.m3169("ᩳۖ") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-21497)) ^ 1106606000;
                        i7 = -192616764;
                        break;
                        break;
                    case -807220895:
                    case 142015917:
                        if (!C13473.m33144()) {
                            iM2761 = C0773.m3169("۫᩹") ^ i5;
                            i6 = ((iM2761 ^ i4) * (-30689)) ^ (-2067512882);
                            i7 = 1988058889;
                            break;
                            break;
                        }
                        iM2761 = (C0773.m3169("ۡܽ") ^ i5) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i6 = ((iM2761 ^ i4) * (-26009)) ^ 175084200;
                        i7 = -229288366;
                        break;
                    case -671599793:
                    case 974338430:
                        if (C0773.m3161() == 0) {
                            iM2761 = C0619.m2761("֫֡") ^ i4;
                            i6 = ((iM2761 ^ i5) * (-14353)) ^ (-95478087);
                            i7 = 1906246176;
                            break;
                            break;
                        }
                        iM2761 = C0773.m3169("ᩳۖ") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-21497)) ^ 1106606000;
                        i7 = -192616764;
                        break;
                        break;
                    case -653942608:
                    case 2112686771:
                        return z;
                    case -479965373:
                    case 614951183:
                        if (i != -100) {
                            iM3169 = C0773.m3169("ۡ֨") ^ i4;
                            i6 = ((iM3169 ^ i5) * 28559) ^ 118916825;
                            i2 = 573535392;
                        } else {
                            iM3169 = (C0773.m3169("۫۠") ^ i5) * (-107);
                            i6 = ((iM3169 ^ i4) * 19589) ^ 1176918818;
                            i2 = 357580136;
                        }
                        i8 = iM3169 ^ i2;
                        z = false;
                        z2 = true;
                        break;
                    case -412000749:
                    case -346002908:
                        if (!RunnableC1848.m6360()) {
                            iM2761 = C0773.m3169("ᩳۖ") ^ i5;
                            i6 = ((iM2761 ^ i4) * (-21497)) ^ 1106606000;
                            i7 = -192616764;
                            break;
                            break;
                        }
                        iM2761 = C0619.m2761("᩻᩵") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-30571)) ^ (-411791056);
                        i7 = -1905907679;
                        break;
                    case -401381750:
                    case 1216165917:
                        zM10878 = true;
                        iM2761 = C0773.m3169("۫ۧ") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-1507)) ^ 2146939342;
                        i7 = -1265343509;
                        break;
                        break;
                    case -338383679:
                    case 1964494271:
                        zM10878 = m10877(configuration);
                        iM2761 = C0773.m3169("۫ۧ") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-1507)) ^ 2146939342;
                        i7 = -1265343509;
                        break;
                        break;
                    case -8809091:
                    case 750122514:
                        if (zM10877 != zM10878) {
                            iM2761 = C0773.m3169("ܰ᩶") ^ i5;
                            i6 = ((iM2761 ^ i4) * (-2523)) ^ 956097128;
                            i7 = 1142594613;
                            break;
                        }
                        iM2761 = C0773.m3169("ۛۤ") ^ i4;
                        i6 = ((iM2761 ^ i5) * 29823) ^ 425353948;
                        i7 = -1989739169;
                        break;
                    case 252736887:
                    case 1961974815:
                        if (C2966.f9654 < 0) {
                            iM2761 = C0773.m3169("ܰۗ") ^ i5;
                            i6 = ((iM2761 ^ i4) * 17823) ^ 405823173;
                            i7 = -1148317863;
                            break;
                        }
                        iM2761 = C0773.m3169("ᩳۖ") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-21497)) ^ 1106606000;
                        i7 = -192616764;
                        break;
                        break;
                    case 369127936:
                    case 1992185808:
                        zM10877 = m10877(configuration);
                        if (C2023.m6964() > 0) {
                            iM2761 = C0619.m2761("۬᩵") ^ i5;
                            i6 = ((iM2761 ^ i4) * 25921) ^ (-562562740);
                            i7 = 2122021769;
                            break;
                        }
                        iM2761 = (C0619.m2761("ۖۨ") + i5) * 43;
                        i6 = ((iM2761 ^ i4) * (-15033)) ^ (-663929366);
                        i7 = 1583988857;
                        break;
                        break;
                    case 446337424:
                    case 1095795750:
                        zM10878 = f10739;
                        iM2761 = C0773.m3169("۫ۧ") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-1507)) ^ 2146939342;
                        i7 = -1265343509;
                        break;
                        break;
                    case 980589756:
                    case 1977001140:
                        C4238.m13540();
                        if (C3690.f12684 <= 0) {
                            iM2761 = C0773.m3169("۫᩹") ^ i5;
                            i6 = ((iM2761 ^ i4) * (-30689)) ^ (-2067512882);
                            i7 = 1988058889;
                            break;
                            break;
                        }
                        iM2761 = C0619.m2761("᩻᩵") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-30571)) ^ (-411791056);
                        i7 = -1905907679;
                        break;
                        break;
                    case 1378278799:
                    case 1862897774:
                        if (RunnableC0334.f1808 > 0) {
                            iM2761 = C0773.m3169("۠ܶ") ^ i4;
                            i6 = ((iM2761 ^ i5) * 17325) ^ 162731766;
                            i7 = 1206943788;
                            break;
                        }
                        iM2761 = (C0619.m2761("ۖۨ") + i5) * 43;
                        i6 = ((iM2761 ^ i4) * (-15033)) ^ (-663929366);
                        i7 = 1583988857;
                        break;
                        break;
                    case 1774355853:
                    case 2028650918:
                        if (i == -1) {
                            iM2761 = C0773.m3169("᩶ܰ") ^ i5;
                            i6 = ((iM2761 ^ i4) * 16457) ^ 1586625717;
                            i7 = 1992839800;
                            break;
                        }
                        iM2761 = C0619.m2761("ܿ֡") ^ i4;
                        i6 = ((iM2761 ^ i5) * 23575) ^ (-859932419);
                        i7 = -605106230;
                        break;
                    default:
                        if (!C1519.m5403()) {
                            iM2761 = (C0619.m2761("ۖۨ") + i5) * 43;
                            i6 = ((iM2761 ^ i4) * (-15033)) ^ (-663929366);
                            i7 = 1583988857;
                            break;
                            break;
                        }
                        iM2761 = (C0773.m3169("ܶۚ") + i5) * 55;
                        i6 = ((iM2761 ^ i4) * (-7109)) ^ 1361373106;
                        i7 = 561520867;
                        break;
                }
            }
        }
    }

    static {
        int i = 0;
        ColorStateList colorStateListValueOf = null;
        int i2 = -1445882420;
        int i3 = RunnableC0334.f1808;
        int i4 = C2375.f7641;
        int iM3169 = (i3 - C0773.m3169("ᩳۢ")) * (-31);
        int i5 = ((iM3169 ^ i4) * 11749) ^ 1389684607;
        int i6 = -220884784;
        while (true) {
            i2 = ((((i2 ^ i4) * 24807) >> 31) & i5) ^ (iM3169 ^ i6);
            switch (i2) {
                case -1930308400:
                case 925168274:
                    i = 0;
                    colorStateListValueOf = ColorStateList.valueOf(0);
                    if (C1783.f6087 <= 0) {
                        iM3169 = C0773.m3169("ܺۛ") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-18411)) ^ (-43576490);
                        i6 = 1139623568;
                    } else {
                        iM3169 = (i4 - C0619.m2761("ۚ֨")) * 7;
                        i5 = ((iM3169 ^ i3) * (-3917)) ^ 302937580;
                        i6 = 1521389359;
                    }
                    break;
                case -1752547338:
                case -279735653:
                    if (C2023.m6964() <= 0) {
                        iM3169 = (i4 - C0773.m3169("ۜᩳ")) * (-123);
                        i5 = ((iM3169 ^ i3) * (-16085)) ^ 826360268;
                        i6 = -1581537191;
                    } else {
                        iM3169 = (C0773.m3169("ۢ۟") + i4) * (-41);
                        i5 = ((iM3169 ^ i3) * (-11301)) ^ 1262951711;
                        i6 = -79168368;
                    }
                    break;
                case -1515595686:
                case 1520370963:
                    C3734.m12152();
                    if (C20932.m47848() == 0) {
                        iM3169 = C0773.m3169("ܺۛ") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-18411)) ^ (-43576490);
                        i6 = 1139623568;
                    } else {
                        iM3169 = (C0773.m3169("ۜۤ") ^ i3) * (-87);
                        i5 = ((iM3169 ^ i4) * 22739) ^ 2042196203;
                        i6 = -1625652911;
                    }
                    break;
                case -1422097222:
                case -1155820350:
                    if (C4238.f15451 >= 0) {
                        iM3169 = C0773.m3169("ܺۛ") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-18411)) ^ (-43576490);
                        i6 = 1139623568;
                    } else {
                        iM3169 = C0619.m2761("᩶᩷") ^ i3;
                        i5 = ((iM3169 ^ i4) * 6907) ^ 1781824448;
                        i6 = -1573482504;
                    }
                    break;
                case -1284436406:
                case -1255426142:
                    if (C3099.f10023 <= 0) {
                        iM3169 = (i4 - C0773.m3169("ۜᩳ")) * (-123);
                        i5 = ((iM3169 ^ i3) * (-16085)) ^ 826360268;
                        i6 = -1581537191;
                    } else {
                        iM3169 = C0619.m2761("ܰ۫") ^ i3;
                        i5 = ((iM3169 ^ i4) * 6757) ^ 1050416651;
                        i6 = 2097506248;
                    }
                    break;
                case -1037916010:
                case 1220181180:
                    if (C2354.m7983()) {
                        iM3169 = (C0773.m3169("ᩳᩴ") + i4) * 53;
                        i5 = ((iM3169 ^ i3) * 13699) ^ (-1203954705);
                        i6 = 1297376198;
                    } else {
                        iM3169 = (C0773.m3169("ۜۤ") ^ i3) * (-87);
                        i5 = ((iM3169 ^ i4) * 22739) ^ 2042196203;
                        i6 = -1625652911;
                    }
                    break;
                case -937669060:
                case 1601391667:
                    C2023.m6964();
                    if (C0773.f2792 <= 0) {
                        iM3169 = (C0619.m2761("ۖܿ") + i3) * (-111);
                        i5 = ((iM3169 ^ i4) * (-20271)) ^ (-2014694248);
                        i6 = -335644565;
                    } else {
                        iM3169 = (i4 - C0773.m3169("ۜᩳ")) * (-123);
                        i5 = ((iM3169 ^ i3) * (-16085)) ^ 826360268;
                        i6 = -1581537191;
                    }
                    break;
                case -214270537:
                case 588305806:
                    C2023.m6964();
                    C13473.m33144();
                    throw new RuntimeException();
                case 105941064:
                case 2017075635:
                    RunnableC3055.m9933();
                    iM3169 = (C0773.m3169("ۜۤ") ^ i3) * (-87);
                    i5 = ((iM3169 ^ i4) * 22739) ^ 2042196203;
                    i6 = -1625652911;
                    break;
                case 455814120:
                case 1757321154:
                    if (C3690.f12684 <= 0) {
                        iM3169 = (C0619.m2761("ۖܿ") + i3) * (-111);
                        i5 = ((iM3169 ^ i4) * (-20271)) ^ (-2014694248);
                        i6 = -335644565;
                    } else {
                        iM3169 = (C0619.m2761("ۙܳ") ^ i3) * (-95);
                        i5 = ((iM3169 ^ i4) * 3229) ^ 1271360600;
                        i6 = -1518761498;
                    }
                    break;
                case 668740733:
                case 926102536:
                    if (C11235.f35427 < 0) {
                        iM3169 = (i4 - C0773.m3169("ۜᩳ")) * (-123);
                        i5 = ((iM3169 ^ i3) * (-16085)) ^ 826360268;
                        i6 = -1581537191;
                    } else {
                        iM3169 = (C0773.m3169("ۜۤ") ^ i3) * (-87);
                        i5 = ((iM3169 ^ i4) * 22739) ^ 2042196203;
                        i6 = -1625652911;
                    }
                    break;
                case 723324676:
                case 1027026932:
                    if (C0619.m2763()) {
                        iM3169 = (C0773.m3169("ۜۤ") ^ i3) * (-87);
                        i5 = ((iM3169 ^ i4) * 22739) ^ 2042196203;
                        i6 = -1625652911;
                    } else {
                        iM3169 = C0773.m3169("᩷᩷") ^ i3;
                        i5 = ((iM3169 ^ i4) * 26965) ^ (-430291210);
                        i6 = -1901648659;
                    }
                    break;
                case 1160620620:
                case 2140640484:
                    if (C1080.f3865 >= 0) {
                        iM3169 = C0619.m2761("ۚۤ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 6863) ^ 1568506059;
                        i6 = -1128136433;
                    } else {
                        iM3169 = (C0773.m3169("ۨ᩸") + i3) * (-23);
                        i5 = ((iM3169 ^ i4) * 18743) ^ (-934782251);
                        i6 = 1744368456;
                    }
                    break;
                case 1252595132:
                case 1700963765:
                    f10732 = ColorStateList.valueOf(i);
                    return;
                case 1280478527:
                case 1556517096:
                    f10740 = colorStateListValueOf;
                    if (C11235.m28309() != 0) {
                        iM3169 = C0619.m2761("ۚۤ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 6863) ^ 1568506059;
                        i6 = -1128136433;
                    } else {
                        iM3169 = C0773.m3169("ۛۙ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 14457) ^ 1776051873;
                        i6 = 1048009371;
                    }
                    break;
                default:
                    if (C0487.f2131 <= 0) {
                        iM3169 = (i4 - C0773.m3169("ۜᩳ")) * (-123);
                        i5 = ((iM3169 ^ i3) * (-16085)) ^ 826360268;
                        i6 = -1581537191;
                    } else {
                        iM3169 = (C0773.m3169("ۛܺ") + i4) * 17;
                        i5 = ((iM3169 ^ i3) * 32551) ^ 409515729;
                        i6 = -2007988;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m10876(boolean z) {
        int i = 0;
        int i2 = -1528391612;
        int i3 = C3492.f12043;
        int i4 = AbstractC3624.f12429;
        int iM3169 = C0773.m3169("᩺۫") ^ i3;
        int i5 = ((iM3169 ^ i4) * 9475) ^ (-883459557);
        int i6 = 1607190661;
        while (true) {
            i2 = ((((i2 ^ i4) * (-24275)) >> 31) & i5) ^ (iM3169 ^ i6);
            switch (i2) {
                case -2031297902:
                case 1546625523:
                    C0269.m1775();
                    break;
                case -1840757714:
                case 321777932:
                    if (C2834.f9334 <= 0) {
                        iM3169 = C0773.m3169("᩹ۡ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 8783) ^ 1107392268;
                        i6 = -566709953;
                    } else {
                        iM3169 = C0619.m2761("ܰܰ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 27199) ^ 900532627;
                        i6 = -182579888;
                    }
                    break;
                case -1824458653:
                case -1101730141:
                    C1826.m6301();
                    if (C0773.f2792 > 0) {
                        iM3169 = (C0773.m3169("۠ۖ") + i4) * 25;
                        i5 = ((iM3169 ^ i3) * 2159) ^ 183881832;
                        i6 = 424984047;
                    } else {
                        iM3169 = (C0619.m2761("֫֡") + i4) * 71;
                        i5 = ((iM3169 ^ i3) * (-6411)) ^ (-346884260);
                        i6 = 1389809171;
                    }
                    break;
                case -1781096067:
                case -1511390572:
                    if (C0269.f1558 <= 0) {
                        iM3169 = C0619.m2761("۬᩻") ^ i3;
                        i5 = ((iM3169 ^ i4) * 19915) ^ 1017524548;
                        i6 = -2135517787;
                    } else {
                        iM3169 = (C0773.m3169("۠ۖ") + i4) * 25;
                        i5 = ((iM3169 ^ i3) * 2159) ^ 183881832;
                        i6 = 424984047;
                    }
                    break;
                case -1600873801:
                case 2080494223:
                    if (AbstractC3624.f12429 <= 0) {
                        iM3169 = C0619.m2761("۬᩻") ^ i3;
                        i5 = ((iM3169 ^ i4) * 19915) ^ 1017524548;
                        i6 = -2135517787;
                    } else {
                        iM3169 = C0773.m3169("ᩴۤ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-29751)) ^ (-1502298513);
                        i6 = 1680639592;
                    }
                    break;
                case -1514022172:
                case 1593641451:
                    if (C2966.f9654 >= 0) {
                        iM3169 = C0773.m3169("᩹ۡ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 8783) ^ 1107392268;
                        i6 = -566709953;
                    } else {
                        iM3169 = (C0773.m3169("֨ۢ") + i4) * 57;
                        i5 = ((iM3169 ^ i3) * (-8109)) ^ 2098292940;
                        i6 = 1471179311;
                    }
                    break;
                case -1509713887:
                case 927280937:
                    if (z) {
                        iM3169 = C0773.m3169("ܳۛ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-11509)) ^ (-1226007205);
                        i6 = 1517528732;
                    } else {
                        iM3169 = C0773.m3169("ۛ᩺") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-9765)) ^ 1141311780;
                        i6 = -1771438564;
                    }
                    break;
                case -1411708805:
                case 1138825186:
                    C1343.m4943();
                    C17202.m40372();
                    iM3169 = (C0619.m2761("֫֡") + i4) * 71;
                    i5 = ((iM3169 ^ i3) * (-6411)) ^ (-346884260);
                    i6 = 1389809171;
                    break;
                case -1389124455:
                case -578536663:
                    i = 1;
                    iM3169 = (i3 - C0619.m2761("᩷֡")) * (-125);
                    i5 = ((iM3169 ^ i4) * 16287) ^ (-1428326946);
                    i6 = -2118293488;
                    break;
                case -1381344614:
                case -1013604179:
                    AbstractC1365.m5019(i);
                    break;
                case -1337509685:
                case 797337744:
                    if (m10881()) {
                        iM3169 = (i3 - C0619.m2761("᩵᩹")) * 69;
                        i5 = ((iM3169 ^ i4) * (-24411)) ^ (-1093015863);
                        i6 = 878146629;
                    } else {
                        iM3169 = C0619.m2761("ۤܶ") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-24859)) ^ (-1073227523);
                        i6 = 2091440177;
                    }
                    break;
                case -1091321702:
                case 1964696756:
                    if (C3779.f12953 <= 0) {
                        iM3169 = C0619.m2761("۬᩻") ^ i3;
                        i5 = ((iM3169 ^ i4) * 19915) ^ 1017524548;
                        i6 = -2135517787;
                    } else {
                        iM3169 = C0619.m2761("ۙۜ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-7605)) ^ 1650474607;
                        i6 = 1292586497;
                    }
                    break;
                case -1030945517:
                case -413782019:
                    if (C1080.f3865 >= 0) {
                        iM3169 = C0773.m3169("᩹ۡ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 8783) ^ 1107392268;
                        i6 = -566709953;
                    } else {
                        iM3169 = C0619.m2761("֡ۚ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-31933)) ^ 882184889;
                        i6 = -32233758;
                    }
                    break;
                case -303952014:
                case 127710789:
                    if (C3998.m12920()) {
                        iM3169 = (C0773.m3169("ۨۚ") ^ i3) * (-59);
                        i5 = ((iM3169 ^ i4) * (-30951)) ^ (-1442575929);
                        i6 = -193497527;
                    } else {
                        iM3169 = C0773.m3169("᩹ۡ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 8783) ^ 1107392268;
                        i6 = -566709953;
                    }
                    break;
                case 44376149:
                case 1302931069:
                    if (C1321.m4852()) {
                        iM3169 = (C0773.m3169("ۡۚ") + i4) * 127;
                        i5 = ((iM3169 ^ i3) * 19681) ^ 593765434;
                        i6 = 1279510112;
                    } else {
                        iM3169 = C0773.m3169("᩹ۡ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 8783) ^ 1107392268;
                        i6 = -566709953;
                    }
                    break;
                case 75812223:
                case 1233509469:
                    i = 2;
                    iM3169 = (i3 - C0619.m2761("᩷֡")) * (-125);
                    i5 = ((iM3169 ^ i4) * 16287) ^ (-1428326946);
                    i6 = -2118293488;
                    break;
                case 334919152:
                case 1279160317:
                    if (C2287.f7432 >= 0) {
                        iM3169 = C0773.m3169("ܿۜ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-20955)) ^ 336615855;
                        i6 = 1343712342;
                    } else {
                        iM3169 = C0619.m2761("᩶ۜ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-3579)) ^ 766951318;
                        i6 = 1783832029;
                    }
                    break;
                case 885043997:
                case 2040969778:
                    if (C3077.f9998) {
                        iM3169 = (C0773.m3169("᩶᩹") + i4) * 31;
                        i5 = ((iM3169 ^ i3) * (-9259)) ^ 2143670874;
                        i6 = -1836429916;
                    } else {
                        iM3169 = C0773.m3169("᩹ۡ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 8783) ^ 1107392268;
                        i6 = -566709953;
                    }
                    break;
                case 1422097340:
                case 2107353514:
                    i = -1;
                    iM3169 = (i3 - C0619.m2761("᩷֡")) * (-125);
                    i5 = ((iM3169 ^ i4) * 16287) ^ (-1428326946);
                    i6 = -2118293488;
                    break;
                case 1767322272:
                case 1936358447:
                    RunnableC3646.m11813();
                    if (C3099.f10023 > 0) {
                        iM3169 = C0773.m3169("ܿۜ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-20955)) ^ 336615855;
                        i6 = 1343712342;
                    } else {
                        iM3169 = (C0619.m2761("֫֡") + i4) * 71;
                        i5 = ((iM3169 ^ i3) * (-6411)) ^ (-346884260);
                        i6 = 1389809171;
                    }
                    break;
                default:
                    if (C1321.f4751 >= 0) {
                        iM3169 = (C0619.m2761("֫֡") + i4) * 71;
                        i5 = ((iM3169 ^ i3) * (-6411)) ^ (-346884260);
                        i6 = 1389809171;
                    } else {
                        iM3169 = (C0619.m2761("ܽ֡") + i4) * (-81);
                        i5 = ((iM3169 ^ i3) * 25501) ^ (-1655056217);
                        i6 = -1274709073;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x005e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0163 A[PHI: r7 r8 r12
      0x0163: PHI (r7v4 int) = (r7v3 int), (r7v2 int), (r7v2 int) binds: [B:44:0x0161, B:26:0x00b5, B:7:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x0163: PHI (r8v4 int) = (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:44:0x0161, B:26:0x00b5, B:7:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x0163: PHI (r12v4 int) = (r12v2 int), (r12v3 int), (r12v2 int) binds: [B:44:0x0161, B:26:0x00b5, B:7:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x01d4 A[PHI: r1 r4 r6 r11
      0x01d4: PHI (r1v3 android.content.SharedPreferences) = 
      (r1v2 android.content.SharedPreferences)
      (r1v2 android.content.SharedPreferences)
      (r1v4 android.content.SharedPreferences)
     binds: [B:56:0x01d2, B:48:0x0198, B:30:0x00d4] A[DONT_GENERATE, DONT_INLINE]
      0x01d4: PHI (r4v4 short) = (r4v3 short), (r4v2 short), (r4v2 short) binds: [B:56:0x01d2, B:48:0x0198, B:30:0x00d4] A[DONT_GENERATE, DONT_INLINE]
      0x01d4: PHI (r6v4 int) = (r6v2 int), (r6v3 int), (r6v2 int) binds: [B:56:0x01d2, B:48:0x0198, B:30:0x00d4] A[DONT_GENERATE, DONT_INLINE]
      0x01d4: PHI (r11v3 short[]) = (r11v2 short[]), (r11v2 short[]), (r11v4 short[]) binds: [B:56:0x01d2, B:48:0x0198, B:30:0x00d4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x0203 A[PHI: r5 r13
      0x0203: PHI (r5v4 short) = (r5v2 short), (r5v3 short), (r5v2 short), (r5v2 short) binds: [B:60:0x0201, B:52:0x01b4, B:22:0x0098, B:14:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x0203: PHI (r13v4 int) = (r13v2 int), (r13v2 int), (r13v3 int), (r13v2 int) binds: [B:60:0x0201, B:52:0x01b4, B:22:0x0098, B:14:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0233 A[PHI: r3 r9 r18
      0x0233: PHI (r3v4 char) = (r3v3 char), (r3v2 char), (r3v2 char), (r3v2 char), (r3v2 char) binds: [B:64:0x0231, B:40:0x013d, B:16:0x0080, B:14:0x007c, B:10:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x0233: PHI (r9v4 int) = (r9v2 int), (r9v3 int), (r9v2 int), (r9v2 int), (r9v2 int) binds: [B:64:0x0231, B:40:0x013d, B:16:0x0080, B:14:0x007c, B:10:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x0233: PHI (r18v5 short[]) = (r18v4 short[]), (r18v3 short[]), (r18v3 short[]), (r18v3 short[]), (r18v3 short[]) binds: [B:64:0x0231, B:40:0x013d, B:16:0x0080, B:14:0x007c, B:10:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m10881() {
        int iM2761;
        int i;
        int i2;
        int i3 = C1826.f6190;
        int i4 = C3099.f10023;
        int iM3169 = C0773.m3169("ۧ֫") ^ i3;
        int i5 = ((iM3169 ^ i4) * (-17457)) ^ (-1075300713);
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM3169 ^ (-630072534);
        SharedPreferences sharedPreferences = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1630164439;
        while (true) {
            i14 = i6 ^ (i5 & (((i14 ^ i4) * 29065) >> 31));
            switch (i14) {
                case -2017625290:
                case -1038345591:
                    if ((i10 + i10) - i7 < 0) {
                        iM2761 = (C0619.m2761("֡ܽ") ^ i4) * (-85);
                        i = ((iM2761 ^ i3) * 29787) ^ (-1389926431);
                        i2 = 1623156117;
                    } else {
                        iM2761 = C0619.m2761("ۗ۟") ^ i3;
                        i = ((iM2761 ^ i4) * (-29971)) ^ 1865259868;
                        i2 = -1721755632;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1948695237:
                case 1848142636:
                    return sharedPreferences.getBoolean(C0950.m3780(sArr2, i12, i13, i11), true);
                case -1912786574:
                case 1460408855:
                    s = sArr[c];
                    if (C3033.f9831 >= 0) {
                        iM2761 = C0619.m2761("ۤ۠") ^ i4;
                        i = ((iM2761 ^ i3) * (-5093)) ^ (-34254039);
                        i2 = -1012351732;
                    } else {
                        iM2761 = (C0619.m2761("ۙۜ") + i3) * (-13);
                        i = ((iM2761 ^ i4) * (-12925)) ^ (-944164317);
                        i2 = -1531856333;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1828386545:
                case 58887770:
                    i10 = i8 + i9;
                    if (C1826.f6190 <= 0) {
                        iM2761 = (C0773.m3169("ۗ֡") ^ i3) * (-83);
                        i = ((iM2761 ^ i4) * 13013) ^ 1553691264;
                        i2 = -233536860;
                    } else {
                        iM2761 = (C0619.m2761("ۛ᩷") ^ i4) * 83;
                        i = ((iM2761 ^ i3) * 21331) ^ (-2036679500);
                        i2 = 622975160;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1826440134:
                case -1263521969:
                    C2375.m8065();
                    if (C2834.m9344() >= 0) {
                        iM2761 = (C0773.m3169("ۗ֡") ^ i3) * (-83);
                        i = ((iM2761 ^ i4) * 13013) ^ 1553691264;
                        i2 = -233536860;
                    } else {
                        iM2761 = C0619.m2761("ᩴ᩷") ^ i3;
                        i = ((iM2761 ^ i4) * 18361) ^ (-471504501);
                        i2 = 350143694;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1825056802:
                case 342815860:
                    if (C11235.f35427 >= 0) {
                        iM2761 = C0619.m2761("ᩴ᩷") ^ i3;
                        i = ((iM2761 ^ i4) * 18361) ^ (-471504501);
                        i2 = 350143694;
                    } else {
                        iM2761 = C0773.m3169("ۤۗ") ^ i3;
                        i = ((iM2761 ^ i4) * (-4571)) ^ 1007412479;
                        i2 = -384246042;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1678074890:
                case 2141667024:
                    C1146.m4231();
                    if (C2287.m7745() <= 0) {
                        iM2761 = (C0619.m2761("ܺ۟") + i4) * 5;
                        i = ((iM2761 ^ i3) * (-285)) ^ (-1893604443);
                        i2 = 713153325;
                    } else {
                        iM2761 = C0619.m2761("ܶܳ") ^ i3;
                        i = ((iM2761 ^ i4) * 13245) ^ 1068867514;
                        i2 = 1219617592;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1479861655:
                case -871050197:
                    i11 = 42995;
                    iM2761 = C0619.m2761("ᩴ᩺") ^ i3;
                    i = ((iM2761 ^ i4) * 1627) ^ (-1643273826);
                    i2 = 577754182;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1151235155:
                case -197825834:
                    C1826.m6301();
                    return false;
                case -1098575435:
                case -1097583767:
                    sArr = f10734;
                    c = '3';
                    if (C0487.f2131 <= 0) {
                        iM2761 = (C0773.m3169("ۗ֡") ^ i3) * (-83);
                        i = ((iM2761 ^ i4) * 13013) ^ 1553691264;
                        i2 = -233536860;
                    } else {
                        iM2761 = (i4 - C0619.m2761("ܽ֡")) * (-17);
                        i = ((iM2761 ^ i3) * (-31445)) ^ (-1670688839);
                        i2 = 920803114;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -367862650:
                case 1155565133:
                    s2 = 9459;
                    if (RunnableC3055.f9898 >= 0) {
                        iM2761 = C0619.m2761("ᩴ᩷") ^ i3;
                        i = ((iM2761 ^ i4) * 18361) ^ (-471504501);
                        i2 = 350143694;
                    } else {
                        iM2761 = (C0619.m2761("ۢ֡") ^ i4) * (-65);
                        i = ((iM2761 ^ i3) * 26859) ^ (-766678006);
                        i2 = -1217912734;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 265753587:
                case 566308433:
                    i13 = 29;
                    if (C0619.f2439) {
                        iM2761 = C0619.m2761("ᩴ᩷") ^ i3;
                        i = ((iM2761 ^ i4) * 18361) ^ (-471504501);
                        i2 = 350143694;
                    } else {
                        iM2761 = C0773.m3169("᩺۬") ^ i4;
                        i = ((iM2761 ^ i3) * (-1819)) ^ 1136111784;
                        i2 = -746028017;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 393701817:
                case 940009186:
                    i12 = 52;
                    if (RunnableC3055.f9898 >= 0) {
                        iM2761 = C0619.m2761("ܶܳ") ^ i3;
                        i = ((iM2761 ^ i4) * 13245) ^ 1068867514;
                        i2 = 1219617592;
                    } else {
                        iM2761 = C0619.m2761("ۧۖ") ^ i4;
                        i = ((iM2761 ^ i3) * 675) ^ 950539368;
                        i2 = 1468347834;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 400535972:
                case 1183426855:
                    sharedPreferences = C21576.f68932;
                    sArr2 = f10734;
                    if (C13473.f42873 != 0) {
                        iM2761 = C0619.m2761("ۤ۠") ^ i4;
                        i = ((iM2761 ^ i3) * (-5093)) ^ (-34254039);
                        i2 = -1012351732;
                    } else {
                        iM2761 = C0619.m2761("ۢ᩹") ^ i3;
                        i = ((iM2761 ^ i4) * 25779) ^ (-799070695);
                        i2 = 1938994569;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 609083685:
                case 649016783:
                    int i15 = s + s2;
                    i7 = i15 * i15;
                    if (C20932.m47848() != 0) {
                        iM2761 = C0619.m2761("ۤ۠") ^ i4;
                        i = ((iM2761 ^ i3) * (-5093)) ^ (-34254039);
                        i2 = -1012351732;
                    } else {
                        iM2761 = C0619.m2761("ܺܰ") ^ i3;
                        i = ((iM2761 ^ i4) * 20477) ^ (-1889530346);
                        i2 = 446495125;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 743716450:
                case 1109819572:
                    if (C2375.f7641 > 0) {
                        iM2761 = (C0773.m3169("ۗ֡") ^ i3) * (-83);
                        i = ((iM2761 ^ i4) * 13013) ^ 1553691264;
                        i2 = -233536860;
                    } else {
                        iM2761 = (C0619.m2761("ܺ۟") + i4) * 5;
                        i = ((iM2761 ^ i3) * (-285)) ^ (-1893604443);
                        i2 = 713153325;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 1677209715:
                case 1882765738:
                    RunnableC1848.m6360();
                    iM2761 = (C0773.m3169("ۗ֡") ^ i3) * (-83);
                    i = ((iM2761 ^ i4) * 13013) ^ 1553691264;
                    i2 = -233536860;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 2035058601:
                case 2121870660:
                    i8 = s * s;
                    i9 = 89472681;
                    if (C3779.m12264()) {
                        iM2761 = (i4 - C0773.m3169("ܽ֫")) * 81;
                        i = ((iM2761 ^ i3) * (-18161)) ^ 229587332;
                        i2 = 1660776695;
                    } else {
                        iM2761 = C0619.m2761("ܶܳ") ^ i3;
                        i = ((iM2761 ^ i4) * 13245) ^ 1068867514;
                        i2 = 1219617592;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                default:
                    i11 = 27148;
                    iM2761 = C0619.m2761("ᩴ᩺") ^ i3;
                    i = ((iM2761 ^ i4) * 1627) ^ (-1643273826);
                    i2 = 577754182;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m10875(RunnableC13254 runnableC13254) {
        f10749 = runnableC13254;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m10877(Configuration configuration) {
        int i = 0;
        int i2 = 0;
        int i3 = 2091970865;
        int i4 = C1542.f5343;
        int i5 = C1080.f3865;
        int iM2761 = (C0619.m2761("ܶ۬") + i4) * 99;
        int i6 = ((iM2761 ^ i5) * 5713) ^ 1522723515;
        int i7 = -1089827856;
        while (true) {
            i3 = ((((i3 ^ i5) * (-21521)) >> 31) & i6) ^ (iM2761 ^ i7);
            switch (i3) {
                case -2037575812:
                case 311933778:
                    if (C0619.f2439) {
                        iM2761 = C0773.m3169("᩹᩵") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-28025)) ^ 2082385040;
                        i7 = 1301856405;
                    } else {
                        iM2761 = (i4 - C0619.m2761("ۘ᩸")) * (-53);
                        i6 = ((iM2761 ^ i5) * 13637) ^ 2124838644;
                        i7 = -711016885;
                    }
                    break;
                case -2019558277:
                case -398195350:
                    if ((i & i2) == 32) {
                        iM2761 = (C0773.m3169("֨ᩴ") ^ i5) * 95;
                        i6 = ((iM2761 ^ i4) * (-17091)) ^ 35740083;
                        i7 = 1084346663;
                    } else {
                        iM2761 = (C0773.m3169("᩹۬") ^ i4) * 97;
                        i6 = ((iM2761 ^ i5) * (-11177)) ^ (-2065870201);
                        i7 = 1737715730;
                    }
                    break;
                case -2018974174:
                case -1548512936:
                    if (C0619.f2439) {
                        iM2761 = (C0773.m3169("᩹ۘ") + i4) * (-69);
                        i6 = ((iM2761 ^ i5) * (-9053)) ^ 411326436;
                        i7 = 2102285369;
                    } else {
                        iM2761 = C0619.m2761("ۡ۫") ^ i4;
                        i6 = ((iM2761 ^ i5) * 30075) ^ (-788971052);
                        i7 = -746610773;
                    }
                    break;
                case -1973918088:
                case 733273979:
                    return true;
                case -1878652425:
                case 615125861:
                    if (C1343.m4943()) {
                        iM2761 = C0619.m2761("ᩴ۟") ^ i4;
                        i6 = ((iM2761 ^ i5) * 27773) ^ (-358819806);
                        i7 = 141609465;
                    } else {
                        iM2761 = C0773.m3169("۠۠") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-29925)) ^ 77396259;
                        i7 = -228881040;
                    }
                    break;
                case -1761748639:
                case 1533209:
                    if (C0862.f3233 != 0) {
                        iM2761 = (C0773.m3169("᩹ۘ") + i4) * (-69);
                        i6 = ((iM2761 ^ i5) * (-9053)) ^ 411326436;
                        i7 = 2102285369;
                    } else {
                        iM2761 = (C0773.m3169("ۛܺ") + i5) * (-5);
                        i6 = ((iM2761 ^ i4) * 1251) ^ 2018653724;
                        i7 = 239614515;
                    }
                    break;
                case -1718055685:
                case -1458433203:
                    return false;
                case -1709276243:
                case 878183459:
                    i2 = 48;
                    if (C3099.m10095()) {
                        iM2761 = (C0619.m2761("ۧ۫") + i5) * (-119);
                        i6 = ((iM2761 ^ i4) * (-2977)) ^ (-34300520);
                        i7 = 227158678;
                    } else {
                        iM2761 = (C0773.m3169("᩺ܿ") + i5) * (-97);
                        i6 = ((iM2761 ^ i4) * 12787) ^ 809202044;
                        i7 = 884691289;
                    }
                    break;
                case -1371593005:
                case -1153789604:
                    C1826.m6301();
                    return false;
                case -1196148594:
                case -552877055:
                    C3998.m12920();
                    iM2761 = C0773.m3169("۠۠") ^ i4;
                    i6 = ((iM2761 ^ i5) * (-29925)) ^ 77396259;
                    i7 = -228881040;
                    break;
                case -567477418:
                case -176635069:
                    i = configuration.uiMode;
                    if (AbstractC3624.f12429 <= 0) {
                        iM2761 = (C0619.m2761("ۧ۫") + i5) * (-119);
                        i6 = ((iM2761 ^ i4) * (-2977)) ^ (-34300520);
                        i7 = 227158678;
                    } else {
                        iM2761 = C0619.m2761("ܿ᩶") ^ i5;
                        i6 = ((iM2761 ^ i4) * 29847) ^ 339728219;
                        i7 = 1575723651;
                    }
                    break;
                case -278589969:
                case 1091711806:
                    if (C1783.m6232()) {
                        iM2761 = C0619.m2761("ܶۨ") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-17979)) ^ (-1149659364);
                        i7 = -630485096;
                    } else {
                        iM2761 = C0773.m3169("᩹᩵") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-28025)) ^ 2082385040;
                        i7 = 1301856405;
                    }
                    break;
                case -184292848:
                case 17645314:
                    if (C20932.m47848() != 0) {
                        iM2761 = (C0773.m3169("᩹ۘ") + i4) * (-69);
                        i6 = ((iM2761 ^ i5) * (-9053)) ^ 411326436;
                        i7 = 2102285369;
                    } else {
                        iM2761 = (i4 - C0773.m3169("᩸ۛ")) * 97;
                        i6 = ((iM2761 ^ i5) * 19805) ^ 1355818325;
                        i7 = -1372387347;
                    }
                    break;
                case 244106938:
                case 893456162:
                    if (C3998.f13671 != 0) {
                        iM2761 = C0773.m3169("᩹᩵") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-28025)) ^ 2082385040;
                        i7 = 1301856405;
                    } else {
                        iM2761 = (C0773.m3169("᩹ۘ") + i4) * (-69);
                        i6 = ((iM2761 ^ i5) * (-9053)) ^ 411326436;
                        i7 = 2102285369;
                    }
                    break;
                case 459939919:
                case 1373984039:
                    if (AbstractC3624.m11755() != 0) {
                        iM2761 = (C0773.m3169("ۛܺ") + i5) * (-5);
                        i6 = ((iM2761 ^ i4) * 1251) ^ 2018653724;
                        i7 = 239614515;
                    } else {
                        iM2761 = C0773.m3169("۠ᩳ") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-7311)) ^ 243267104;
                        i7 = -657722960;
                    }
                    break;
                case 1250328272:
                case 2074802583:
                    C3998.m12920();
                    if (C1343.f4799 == 0) {
                        iM2761 = (C0773.m3169("ۛܺ") + i5) * (-5);
                        i6 = ((iM2761 ^ i4) * 1251) ^ 2018653724;
                        i7 = 239614515;
                    } else {
                        iM2761 = C0773.m3169("۠۠") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-29925)) ^ 77396259;
                        i7 = -228881040;
                    }
                    break;
                case 1659066308:
                case 1864102796:
                    if (AbstractC0641.m2813() <= 0) {
                        iM2761 = (C0619.m2761("ۧ۫") + i5) * (-119);
                        i6 = ((iM2761 ^ i4) * (-2977)) ^ (-34300520);
                        i7 = 227158678;
                    } else {
                        iM2761 = C0619.m2761("۬ۜ") ^ i5;
                        i6 = ((iM2761 ^ i4) * 8205) ^ 2010001246;
                        i7 = 2027231936;
                    }
                    break;
                default:
                    if (C2354.f7599 >= 0) {
                        iM2761 = (C0773.m3169("᩹ۘ") + i4) * (-69);
                        i6 = ((iM2761 ^ i5) * (-9053)) ^ 411326436;
                        i7 = 2102285369;
                    } else {
                        iM2761 = C0773.m3169("۟ۢ") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-20913)) ^ 220613531;
                        i7 = 1842022570;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m10880(Configuration configuration) {
        f10772 = m10877(configuration);
        m10873();
    }

    /* JADX WARN: Code duplicated, block: B:46:0x015f A[PHI: r1 r18 r19
      0x015f: PHI (r1v19 boolean) = (r1v1 boolean), (r1v2 boolean), (r1v1 boolean) binds: [B:45:0x015d, B:41:0x0136, B:12:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x015f: PHI (r18v30 l.ۢ֫ܺ) = (r18v10 l.ۢ֫ܺ), (r18v11 l.ۢ֫ܺ), (r18v37 l.ۢ֫ܺ) binds: [B:45:0x015d, B:41:0x0136, B:12:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x015f: PHI (r19v4 android.content.res.Configuration) = 
      (r19v2 android.content.res.Configuration)
      (r19v1 android.content.res.Configuration)
      (r19v1 android.content.res.Configuration)
     binds: [B:45:0x015d, B:41:0x0136, B:12:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x0216 A[PHI: r7 r8 r14 r18
      0x0216: PHI (r7v3 int) = (r7v2 int), (r7v1 int) binds: [B:60:0x0214, B:25:0x0092] A[DONT_GENERATE, DONT_INLINE]
      0x0216: PHI (r8v3 int) = (r8v2 int), (r8v1 int) binds: [B:60:0x0214, B:25:0x0092] A[DONT_GENERATE, DONT_INLINE]
      0x0216: PHI (r14v2 int) = (r14v1 int), (r14v3 int) binds: [B:60:0x0214, B:25:0x0092] A[DONT_GENERATE, DONT_INLINE]
      0x0216: PHI (r18v13 l.ۢ֫ܺ) = (r18v5 l.ۢ֫ܺ), (r18v14 l.ۢ֫ܺ) binds: [B:60:0x0214, B:25:0x0092] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m10883() {
        int iM3169;
        int i;
        int i2;
        boolean zM13535;
        boolean z;
        int iM2761;
        int i3;
        int i4;
        boolean zM10877 = false;
        InterfaceC9801 interfaceC9801 = null;
        boolean z2 = false;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        short s2 = 0;
        int i8 = 0;
        short[] sArr2 = null;
        int i9 = 0;
        int i10 = 0;
        int i11 = -1419466035;
        int i12 = C0773.f2792;
        int i13 = C1146.f4234;
        int iM31610 = C0773.m3169("ᩴ᩸") ^ i12;
        int i14 = ((iM31610 ^ i13) * 30597) ^ (-1318725377);
        int i15 = iM31610 ^ (-2095003054);
        Configuration configuration = null;
        while (true) {
            i11 = i15 ^ (i14 & (((i11 ^ i13) * (-3955)) >> 31));
            switch (i11) {
                case -1721808249:
                case -1237984029:
                    interfaceC9801 = interfaceC9801;
                    f10772 = zM10877;
                    if (m10881()) {
                        iM3169 = C0773.m3169("ܺᩳ") ^ i12;
                        i = ((iM3169 ^ i13) * (-19113)) ^ 500397511;
                        i2 = -602686639;
                    } else {
                        iM3169 = C0773.m3169("ۛۛ") ^ i13;
                        i = ((iM3169 ^ i12) * (-17173)) ^ (-247138658);
                        i2 = -848426907;
                    }
                    InterfaceC9801 interfaceC9802 = interfaceC9801;
                    i15 = iM3169 ^ i2;
                    i14 = i;
                    interfaceC9801 = interfaceC9802;
                    break;
                case -1668226896:
                case -909510821:
                    zM13535 = C4238.m13535(interfaceC9801, C2375.m8069(sArr2, i9, i10, i8), false);
                    z2 = zM13535;
                    iM3169 = (i13 - C0773.m3169("ᩳ֫")) * (-43);
                    interfaceC9801 = interfaceC9801;
                    i = ((iM3169 ^ i12) * (-23315)) ^ 1136062187;
                    i2 = -1287236767;
                    InterfaceC9801 interfaceC9803 = interfaceC9801;
                    i15 = iM3169 ^ i2;
                    i14 = i;
                    interfaceC9801 = interfaceC9803;
                    break;
                case -1627460539:
                case 177872718:
                    interfaceC9801 = interfaceC9801;
                    i5 = s * s;
                    i6 = 353477601;
                    if (C3448.f11240 >= 0) {
                        iM3169 = (C0773.m3169("ۚ᩸") ^ i13) * 73;
                        i = ((iM3169 ^ i12) * 11719) ^ 960994553;
                        i2 = -2123016301;
                    } else {
                        iM3169 = C0773.m3169("ۧ۬") ^ i12;
                        i = ((iM3169 ^ i13) * 30025) ^ 135061287;
                        i2 = 395995395;
                    }
                    InterfaceC9801 interfaceC9804 = interfaceC9801;
                    i15 = iM3169 ^ i2;
                    i14 = i;
                    interfaceC9801 = interfaceC9804;
                    break;
                case -1583786227:
                case -664159949:
                    i8 = 47064;
                    iM3169 = C0773.m3169("ܶۚ") ^ i13;
                    i = ((iM3169 ^ i12) * (-23055)) ^ (-1975165937);
                    i2 = -81818032;
                    InterfaceC9801 interfaceC9805 = interfaceC9801;
                    i15 = iM3169 ^ i2;
                    i14 = i;
                    interfaceC9801 = interfaceC9805;
                    break;
                case -1438299232:
                case 849528767:
                    interfaceC9801 = interfaceC9801;
                    i9 = 82;
                    if (C2287.f7432 < 0) {
                        iM3169 = (C0619.m2761("֡ۛ") ^ i12) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM3169 ^ i13) * (-19313)) ^ (-912004725);
                        i2 = -1774500609;
                        InterfaceC9801 interfaceC9806 = interfaceC9801;
                        i15 = iM3169 ^ i2;
                        i14 = i;
                        interfaceC9801 = interfaceC9806;
                    } else {
                        z = zM10877;
                        iM2761 = C0773.m3169("ᩴۖ") ^ i13;
                        i3 = ((iM2761 ^ i12) * 16355) ^ 1464782579;
                        i4 = 1080534215;
                        int i16 = iM2761 ^ i4;
                        interfaceC9801 = interfaceC9801;
                        i15 = i16;
                        i14 = i3;
                        zM10877 = z;
                    }
                    break;
                case -1366476415:
                case -62600936:
                    zM13535 = f10772;
                    z2 = zM13535;
                    iM3169 = (i13 - C0773.m3169("ᩳ֫")) * (-43);
                    interfaceC9801 = interfaceC9801;
                    i = ((iM3169 ^ i12) * (-23315)) ^ 1136062187;
                    i2 = -1287236767;
                    InterfaceC9801 interfaceC9807 = interfaceC9801;
                    i15 = iM3169 ^ i2;
                    i14 = i;
                    interfaceC9801 = interfaceC9807;
                    break;
                case -1195119583:
                case -583206141:
                    if (AbstractC0116.f1064 > 0) {
                        z = zM10877;
                        interfaceC9801 = interfaceC9801;
                        iM2761 = C0773.m3169("ᩴۖ") ^ i13;
                        i3 = ((iM2761 ^ i12) * 16355) ^ 1464782579;
                        i4 = 1080534215;
                        int i17 = iM2761 ^ i4;
                        interfaceC9801 = interfaceC9801;
                        i15 = i17;
                    } else {
                        int iM2762 = C0619.m2761("ܽۗ") ^ i12;
                        z = zM10877;
                        i3 = ((iM2762 ^ i13) * 16921) ^ 1401556268;
                        i15 = iM2762 ^ 355401559;
                    }
                    i14 = i3;
                    zM10877 = z;
                    break;
                case -1184839126:
                case 1376167989:
                    interfaceC9801 = interfaceC9801;
                    if (i7 - (s * s2) < 0) {
                        iM3169 = (C0619.m2761("ۖ֨") + i12) * (-99);
                        i = ((iM3169 ^ i13) * 31945) ^ (-1538168213);
                        i2 = 1946847772;
                    } else {
                        iM3169 = C0773.m3169("᩸ۛ") ^ i12;
                        i = ((iM3169 ^ i13) * (-21851)) ^ (-633399209);
                        i2 = -1473638895;
                    }
                    InterfaceC9801 interfaceC9808 = interfaceC9801;
                    i15 = iM3169 ^ i2;
                    i14 = i;
                    interfaceC9801 = interfaceC9808;
                    break;
                case -941656384:
                case 2098695431:
                    interfaceC9801 = C21576.f68931;
                    sArr2 = f10734;
                    if (AbstractC0641.m2813() > 0) {
                        iM3169 = (i12 - C0619.m2761("ܳ᩷")) * 63;
                        interfaceC9801 = interfaceC9801;
                        i = ((iM3169 ^ i13) * 30637) ^ 880221594;
                        i2 = -1635317349;
                        InterfaceC9801 interfaceC9809 = interfaceC9801;
                        i15 = iM3169 ^ i2;
                        i14 = i;
                        interfaceC9801 = interfaceC9809;
                    } else {
                        int iM2763 = C0619.m2761("ܽۗ") ^ i12;
                        z = zM10877;
                        i3 = ((iM2763 ^ i13) * 16921) ^ 1401556268;
                        i15 = iM2763 ^ 355401559;
                        i14 = i3;
                        zM10877 = z;
                    }
                    break;
                case -831583673:
                case 1753383006:
                    z = zM10877;
                    interfaceC9801 = interfaceC9801;
                    if (C13473.f42873 != 0) {
                        iM2761 = C0773.m3169("ۢۨ") ^ i12;
                        i3 = ((iM2761 ^ i13) * 83) ^ (-597409233);
                        i4 = 1550283781;
                    } else {
                        iM2761 = (C0773.m3169("۟۟") + i12) * 55;
                        i3 = ((iM2761 ^ i13) * (-4711)) ^ (-2056886747);
                        i4 = -479829441;
                    }
                    int i18 = iM2761 ^ i4;
                    interfaceC9801 = interfaceC9801;
                    i15 = i18;
                    i14 = i3;
                    zM10877 = z;
                    break;
                case -741983953:
                case 90996357:
                    if (C0773.f2792 > 0) {
                        z = zM10877;
                        interfaceC9801 = interfaceC9801;
                        iM2761 = C0773.m3169("ۢۨ") ^ i12;
                        i3 = ((iM2761 ^ i13) * 83) ^ (-597409233);
                        i4 = 1550283781;
                        int i19 = iM2761 ^ i4;
                        interfaceC9801 = interfaceC9801;
                        i15 = i19;
                        i14 = i3;
                        zM10877 = z;
                    }
                    z = zM10877;
                    interfaceC9801 = interfaceC9801;
                    iM2761 = C0773.m3169("ᩴۖ") ^ i13;
                    i3 = ((iM2761 ^ i12) * 16355) ^ 1464782579;
                    i4 = 1080534215;
                    int i110 = iM2761 ^ i4;
                    interfaceC9801 = interfaceC9801;
                    i15 = i110;
                    i14 = i3;
                    zM10877 = z;
                    break;
                case -625521189:
                case -74558364:
                    i8 = 17152;
                    iM3169 = C0773.m3169("ܶۚ") ^ i13;
                    i = ((iM3169 ^ i12) * (-23055)) ^ (-1975165937);
                    i2 = -81818032;
                    InterfaceC9801 interfaceC98010 = interfaceC9801;
                    i15 = iM3169 ^ i2;
                    i14 = i;
                    interfaceC9801 = interfaceC98010;
                    break;
                case -612268058:
                case 1264989750:
                    interfaceC9801 = interfaceC9801;
                    configuration = C21576.m49055().getConfiguration();
                    if (C2354.m7983()) {
                        iM3169 = (C0773.m3169("ۧᩳ") + i12) * (-67);
                        i = ((iM3169 ^ i13) * (-19143)) ^ 1498654472;
                        i2 = 1963567159;
                    } else {
                        iM3169 = C0619.m2761("ۙ᩷") ^ i13;
                        i = ((iM3169 ^ i12) * (-24543)) ^ 1361575319;
                        i2 = 1833257919;
                    }
                    InterfaceC9801 interfaceC98011 = interfaceC9801;
                    i15 = iM3169 ^ i2;
                    i14 = i;
                    interfaceC9801 = interfaceC98011;
                    break;
                case -278810285:
                case 580072135:
                    f10739 = z2;
                    m10876(z2);
                    break;
                case -266485721:
                case 1416103279:
                    C0773.m3161();
                    break;
                case -239207297:
                case 768597483:
                    z = zM10877;
                    interfaceC9801 = interfaceC9801;
                    sArr = f10734;
                    c = 'Q';
                    if (C2375.f7641 <= 0) {
                        iM2761 = C0773.m3169("ᩴۖ") ^ i13;
                        i3 = ((iM2761 ^ i12) * 16355) ^ 1464782579;
                        i4 = 1080534215;
                    } else {
                        iM2761 = C0619.m2761("ܳ᩹") ^ i13;
                        i3 = ((iM2761 ^ i12) * 29483) ^ 1086899254;
                        i4 = -654628870;
                    }
                    int i111 = iM2761 ^ i4;
                    interfaceC9801 = interfaceC9801;
                    i15 = i111;
                    i14 = i3;
                    zM10877 = z;
                    break;
                case -192670634:
                case 1694813519:
                    interfaceC9801 = interfaceC9801;
                    i7 = i5 + i6;
                    s2 = 37602;
                    if (!C3099.m10095()) {
                        iM3169 = (C0773.m3169("ۘ᩹") ^ i13) * (-115);
                        i = ((iM3169 ^ i12) * (-1383)) ^ (-288933471);
                        i2 = 3501293;
                        InterfaceC9801 interfaceC98012 = interfaceC9801;
                        i15 = iM3169 ^ i2;
                        i14 = i;
                        interfaceC9801 = interfaceC98012;
                    } else {
                        interfaceC9801 = interfaceC9801;
                        int iM2764 = C0619.m2761("ܽۗ") ^ i12;
                        z = zM10877;
                        i3 = ((iM2764 ^ i13) * 16921) ^ 1401556268;
                        i15 = iM2764 ^ 355401559;
                        i14 = i3;
                        zM10877 = z;
                    }
                    break;
                case -55368511:
                case 1739612356:
                    C0619.m2763();
                    z = zM10877;
                    interfaceC9801 = interfaceC9801;
                    iM2761 = C0773.m3169("ᩴۖ") ^ i13;
                    i3 = ((iM2761 ^ i12) * 16355) ^ 1464782579;
                    i4 = 1080534215;
                    int i112 = iM2761 ^ i4;
                    interfaceC9801 = interfaceC9801;
                    i15 = i112;
                    i14 = i3;
                    zM10877 = z;
                    break;
                case 67485176:
                case 2119913582:
                    interfaceC9801 = interfaceC9801;
                    i10 = 10;
                    if (C2834.f9334 <= 0) {
                        iM3169 = (C0773.m3169("ۚ᩸") ^ i13) * 73;
                        i = ((iM3169 ^ i12) * 11719) ^ 960994553;
                        i2 = -2123016301;
                    } else {
                        iM3169 = (C0773.m3169("ۘᩴ") + i13) * 15;
                        i = ((iM3169 ^ i12) * 6417) ^ 1087455344;
                        i2 = -876962318;
                    }
                    InterfaceC9801 interfaceC98013 = interfaceC9801;
                    i15 = iM3169 ^ i2;
                    i14 = i;
                    interfaceC9801 = interfaceC98013;
                    break;
                case 250045520:
                case 1130187600:
                    interfaceC9801 = interfaceC9801;
                    s = sArr[c];
                    if (C3033.f9831 < 0) {
                        z = zM10877;
                        iM2761 = C0773.m3169("ۧ᩹") ^ i13;
                        i3 = ((iM2761 ^ i12) * 69) ^ 471341942;
                        i4 = -1159483074;
                        int i113 = iM2761 ^ i4;
                        interfaceC9801 = interfaceC9801;
                        i15 = i113;
                        i14 = i3;
                        zM10877 = z;
                    }
                    interfaceC9801 = interfaceC9801;
                    int iM2765 = C0619.m2761("ܽۗ") ^ i12;
                    z = zM10877;
                    i3 = ((iM2765 ^ i13) * 16921) ^ 1401556268;
                    i15 = iM2765 ^ 355401559;
                    i14 = i3;
                    zM10877 = z;
                    break;
                case 639198613:
                case 1968101302:
                    interfaceC9801 = interfaceC9801;
                    zM10877 = m10877(configuration);
                    if (C3734.f12817 >= 0) {
                        iM3169 = C0619.m2761("ۙ᩷") ^ i13;
                        i = ((iM3169 ^ i12) * (-24543)) ^ 1361575319;
                        i2 = 1833257919;
                    } else {
                        iM3169 = C0619.m2761("ܳۤ") ^ i13;
                        i = ((iM3169 ^ i12) * (-16815)) ^ (-993095490);
                        i2 = 105669872;
                    }
                    InterfaceC9801 interfaceC98014 = interfaceC9801;
                    i15 = iM3169 ^ i2;
                    i14 = i;
                    interfaceC9801 = interfaceC98014;
                    break;
                default:
                    if (C0487.f2131 > 0) {
                        interfaceC9801 = interfaceC9801;
                        iM3169 = C0619.m2761("ۙ᩷") ^ i13;
                        i = ((iM3169 ^ i12) * (-24543)) ^ 1361575319;
                        i2 = 1833257919;
                        InterfaceC9801 interfaceC98015 = interfaceC9801;
                        i15 = iM3169 ^ i2;
                        i14 = i;
                        interfaceC9801 = interfaceC98015;
                    } else {
                        z = zM10877;
                        interfaceC9801 = interfaceC9801;
                        iM2761 = C0773.m3169("ᩴۖ") ^ i13;
                        i3 = ((iM2761 ^ i12) * 16355) ^ 1464782579;
                        i4 = 1080534215;
                        int i114 = iM2761 ^ i4;
                        interfaceC9801 = interfaceC9801;
                        i15 = i114;
                        i14 = i3;
                        zM10877 = z;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0073  */
    /* JADX WARN: Code duplicated, block: B:33:0x00f4 A[PHI: r5
      0x00f4: PHI (r5v3 boolean) = (r5v2 boolean), (r5v1 boolean) binds: [B:32:0x00f2, B:9:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x0276 A[PHI: r4 r11 r12
      0x0276: PHI (r4v3 l.ᩳ֫ܺ) = (r4v1 l.ᩳ֫ܺ), (r4v2 l.ᩳ֫ܺ), (r4v1 l.ᩳ֫ܺ), (r4v1 l.ᩳ֫ܺ) binds: [B:69:0x0274, B:36:0x0126, B:28:0x00d2, B:12:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x0276: PHI (r11v3 int) = (r11v2 int), (r11v1 int), (r11v1 int), (r11v1 int) binds: [B:69:0x0274, B:36:0x0126, B:28:0x00d2, B:12:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x0276: PHI (r12v3 int) = (r12v2 int), (r12v1 int), (r12v1 int), (r12v1 int) binds: [B:69:0x0274, B:36:0x0126, B:28:0x00d2, B:12:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x02af A[PHI: r10 r14 r15 r20
      0x02af: PHI (r10v3 int) = (r10v2 int), (r10v1 int), (r10v1 int) binds: [B:73:0x02ad, B:58:0x01fe, B:54:0x01da] A[DONT_GENERATE, DONT_INLINE]
      0x02af: PHI (r14v3 short[]) = (r14v1 short[]), (r14v2 short[]), (r14v1 short[]) binds: [B:73:0x02ad, B:58:0x01fe, B:54:0x01da] A[DONT_GENERATE, DONT_INLINE]
      0x02af: PHI (r15v2 int) = (r15v1 int), (r15v1 int), (r15v3 int) binds: [B:73:0x02ad, B:58:0x01fe, B:54:0x01da] A[DONT_GENERATE, DONT_INLINE]
      0x02af: PHI (r20v3 boolean) = (r20v1 boolean), (r20v2 boolean), (r20v1 boolean) binds: [B:73:0x02ad, B:58:0x01fe, B:54:0x01da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:82:0x02fe A[PHI: r3 r8 r9 r21
      0x02fe: PHI (r3v3 l.ۢ֫ܺ) = (r3v1 l.ۢ֫ܺ), (r3v1 l.ۢ֫ܺ), (r3v2 l.ۢ֫ܺ), (r3v1 l.ۢ֫ܺ) binds: [B:81:0x02fc, B:77:0x02df, B:40:0x0146, B:15:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x02fe: PHI (r8v3 char) = (r8v2 char), (r8v1 char), (r8v1 char), (r8v1 char) binds: [B:81:0x02fc, B:77:0x02df, B:40:0x0146, B:15:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x02fe: PHI (r9v3 short) = (r9v1 short), (r9v2 short), (r9v1 short), (r9v1 short) binds: [B:81:0x02fc, B:77:0x02df, B:40:0x0146, B:15:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x02fe: PHI (r21v5 short[]) = (r21v4 short[]), (r21v3 short[]), (r21v3 short[]), (r21v3 short[]) binds: [B:81:0x02fc, B:77:0x02df, B:40:0x0146, B:15:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m10873() {
        int iM2761;
        int i;
        int i2;
        boolean zM3781;
        String strM13650 = null;
        boolean z = false;
        InterfaceC9801 interfaceC9801 = null;
        InterfaceC18752 interfaceC18752M8173 = null;
        boolean z2 = false;
        RunnableC13254 runnableC13254 = null;
        char c = 0;
        short s = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        short[] sArr = null;
        int i7 = 0;
        int i8 = -704035310;
        int i9 = C1826.f6190;
        int i10 = C4282.f15546;
        int iM2762 = (i9 - C0619.m2761("۟᩺")) * 21;
        int i11 = ((iM2762 ^ i10) * 2631) ^ (-1329912405);
        int i12 = iM2762 ^ (-1985711826);
        short[] sArr2 = null;
        boolean zM10881 = false;
        while (true) {
            i8 = i12 ^ (i11 & (((i8 ^ i10) * (-20065)) >> 31));
            switch (i8) {
                case -2085873745:
                case 552090101:
                    m10876(z);
                    break;
                case -2033452176:
                case -1381931742:
                    if (C0487.m2356() >= 0) {
                        iM2761 = (C0619.m2761("ܿܿ") + i10) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i = ((iM2761 ^ i9) * (-21069)) ^ (-1441193261);
                        i2 = 1182613414;
                    } else {
                        iM2761 = C0619.m2761("᩶ۚ") ^ i9;
                        i = ((iM2761 ^ i10) * 27765) ^ (-1265331914);
                        i2 = -1100156000;
                    }
                    i12 = iM2761 ^ i2;
                    i11 = i;
                    break;
                case -2012581526:
                case 1890384543:
                    i6 = 6786;
                    iM2761 = (i10 - C0773.m3169("ᩳᩴ")) * (-45);
                    i = ((iM2761 ^ i9) * 32325) ^ 159320811;
                    i2 = 1244515406;
                    i12 = iM2761 ^ i2;
                    i11 = i;
                    break;
                case -1966396362:
                case 1665237242:
                    if (i3 - (i4 + i5) > 0) {
                        iM2761 = (C0773.m3169("֡᩹") + i9) * (-43);
                        i = ((iM2761 ^ i10) * (-14677)) ^ (-1105210287);
                        i2 = -2031895020;
                    } else {
                        iM2761 = C0619.m2761("ܶ۫") ^ i10;
                        i = ((iM2761 ^ i9) * 7363) ^ 1374642976;
                        i2 = 1410311167;
                    }
                    i12 = iM2761 ^ i2;
                    i11 = i;
                    break;
                case -1950533473:
                case -1732944828:
                    i6 = 20514;
                    iM2761 = (i10 - C0773.m3169("ᩳᩴ")) * (-45);
                    i = ((iM2761 ^ i9) * 32325) ^ 159320811;
                    i2 = 1244515406;
                    i12 = iM2761 ^ i2;
                    i11 = i;
                    break;
                case -1549798083:
                case 1706456830:
                    break;
                case -1516558726:
                case -85752186:
                    i7 = 1;
                    if (C1826.f6190 <= 0) {
                        iM2761 = (C0773.m3169("֨᩷") ^ i9) * (-97);
                        i = ((iM2761 ^ i10) * (-26479)) ^ 356598757;
                        i2 = 842296512;
                    } else {
                        iM2761 = (i9 - C0773.m3169("ܿۙ")) * (-107);
                        i = ((iM2761 ^ i10) * 31003) ^ 53773373;
                        i2 = -1643509004;
                    }
                    i12 = iM2761 ^ i2;
                    i11 = i;
                    break;
                case -1498586286:
                case 264120889:
                    f10739 = z;
                    interfaceC9801 = C21576.f68931;
                    if (C3492.f12043 <= 0) {
                        iM2761 = C0619.m2761("᩶ۚ") ^ i9;
                        i = ((iM2761 ^ i10) * 27765) ^ (-1265331914);
                        i2 = -1100156000;
                    } else {
                        iM2761 = (C0773.m3169("ۢܿ") + i10) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM2761 ^ i9) * (-15371)) ^ (-923878479);
                        i2 = -1865635682;
                    }
                    i12 = iM2761 ^ i2;
                    i11 = i;
                    break;
                case -1485494629:
                case -628425885:
                    C2878.m9491();
                    iM2761 = (C0619.m2761("ܿܿ") + i10) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                    i = ((iM2761 ^ i9) * (-21069)) ^ (-1441193261);
                    i2 = 1182613414;
                    i12 = iM2761 ^ i2;
                    i11 = i;
                    break;
                case -1369584805:
                case 1250849358:
                    C3998.m12920();
                    if (RunnableC3055.m9933() == 0) {
                        iM2761 = (C0619.m2761("ܿܿ") + i10) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i = ((iM2761 ^ i9) * (-21069)) ^ (-1441193261);
                        i2 = 1182613414;
                    } else {
                        iM2761 = (i9 - C0619.m2761("ܰܽ")) * (-9);
                        i = ((iM2761 ^ i10) * (-26635)) ^ 1676767053;
                        i2 = -181225434;
                    }
                    i12 = iM2761 ^ i2;
                    i11 = i;
                    break;
                case -1278610858:
                case -278729119:
                    C2375.m8061(C17202.m40375(interfaceC18752M8173, strM13650, z2));
                    if (C2287.m7745() <= 0) {
                        iM2761 = (i9 - C0619.m2761("ܰܽ")) * (-9);
                        i = ((iM2761 ^ i10) * (-26635)) ^ 1676767053;
                        i2 = -181225434;
                    } else {
                        iM2761 = (C0619.m2761("ۡ۬") ^ i9) * (-73);
                        i = ((iM2761 ^ i10) * (-31327)) ^ (-1651283078);
                        i2 = 1658105133;
                    }
                    i12 = iM2761 ^ i2;
                    i11 = i;
                    break;
                case -1192465496:
                case 882632133:
                    z2 = f10739;
                    if (C1321.f4751 >= 0) {
                        iM2761 = C0619.m2761("ۧۡ") ^ i10;
                        i = ((iM2761 ^ i9) * 31407) ^ (-1768922547);
                        i2 = 1848447361;
                    } else {
                        iM2761 = C0773.m3169("ܽ᩸") ^ i10;
                        i = ((iM2761 ^ i9) * 5689) ^ 24955158;
                        i2 = -1754613864;
                    }
                    i12 = iM2761 ^ i2;
                    i11 = i;
                    break;
                case -1169547952:
                case -137809330:
                    zM3781 = C0950.m3781(C21576.f68931, strM13650, false);
                    z = zM3781;
                    iM2761 = (i9 - C0619.m2761("ᩴ۟")) * (-83);
                    i = ((iM2761 ^ i10) * (-7307)) ^ 561579192;
                    i2 = -787772360;
                    i12 = iM2761 ^ i2;
                    i11 = i;
                    break;
                case -1142367008:
                case -152544744:
                    if (C3033.f9831 >= 0) {
                        iM2761 = (C0619.m2761("ܿܿ") + i10) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i = ((iM2761 ^ i9) * (-21069)) ^ (-1441193261);
                        i2 = 1182613414;
                    } else {
                        iM2761 = C0619.m2761("ۧۡ") ^ i10;
                        i = ((iM2761 ^ i9) * 31407) ^ (-1768922547);
                        i2 = 1848447361;
                    }
                    i12 = iM2761 ^ i2;
                    i11 = i;
                    break;
                case -1074322314:
                case -113413537:
                    C0269.m1775();
                    break;
                case -975045614:
                case 1568341406:
                    zM10881 = m10881();
                    sArr = f10734;
                    if (C2375.f7641 <= 0) {
                        iM2761 = (C0773.m3169("֨᩷") ^ i9) * (-97);
                        i = ((iM2761 ^ i10) * (-26479)) ^ 356598757;
                        i2 = 842296512;
                    } else {
                        iM2761 = C0619.m2761("᩺ᩴ") ^ i9;
                        i = ((iM2761 ^ i10) * (-10783)) ^ (-1709778380);
                        i2 = -1643775397;
                    }
                    i12 = iM2761 ^ i2;
                    i11 = i;
                    break;
                case -862279709:
                case 1878955956:
                    zM3781 = f10772;
                    z = zM3781;
                    iM2761 = (i9 - C0619.m2761("ᩴ۟")) * (-83);
                    i = ((iM2761 ^ i10) * (-7307)) ^ 561579192;
                    i2 = -787772360;
                    i12 = iM2761 ^ i2;
                    i11 = i;
                    break;
                case -820122126:
                case 1157828326:
                    sArr2 = f10734;
                    c = 0;
                    if (C1519.f5300 >= 0) {
                        iM2761 = C0619.m2761("᩶ۚ") ^ i9;
                        i = ((iM2761 ^ i10) * 27765) ^ (-1265331914);
                        i2 = -1100156000;
                    } else {
                        iM2761 = (C0619.m2761("۬᩸") ^ i10) * (-91);
                        i = ((iM2761 ^ i9) * 1225) ^ (-494501040);
                        i2 = -427716782;
                    }
                    i12 = iM2761 ^ i2;
                    i11 = i;
                    break;
                case -688089476:
                case 787876864:
                    interfaceC18752M8173 = C2419.m8173(interfaceC9801);
                    if (C1321.f4751 >= 0) {
                        iM2761 = (i9 - C0619.m2761("ܰܽ")) * (-9);
                        i = ((iM2761 ^ i10) * (-26635)) ^ 1676767053;
                        i2 = -181225434;
                    } else {
                        iM2761 = C0773.m3169("᩶۬") ^ i9;
                        i = ((iM2761 ^ i10) * (-23837)) ^ (-400526175);
                        i2 = -603298951;
                    }
                    i12 = iM2761 ^ i2;
                    i11 = i;
                    break;
                case -518162124:
                case 1251869829:
                    strM13650 = C4282.m13650(sArr, i7, 10, i6);
                    if (zM10881) {
                        iM2761 = C0773.m3169("᩵۫") ^ i10;
                        i = ((iM2761 ^ i9) * (-30143)) ^ (-1919637325);
                        i2 = 1264456631;
                    } else {
                        iM2761 = (C0619.m2761("֡᩺") ^ i10) * (-35);
                        i = ((iM2761 ^ i9) * 12463) ^ 948107819;
                        i2 = 1206683628;
                    }
                    i12 = iM2761 ^ i2;
                    i11 = i;
                    break;
                case -300005444:
                case -53463874:
                    i4 = s * s;
                    i5 = 393863716;
                    if (C20932.f66974 <= 0) {
                        iM2761 = (i9 - C0619.m2761("ܰܽ")) * (-9);
                        i = ((iM2761 ^ i10) * (-26635)) ^ 1676767053;
                        i2 = -181225434;
                    } else {
                        iM2761 = (C0619.m2761("ۤܶ") ^ i9) * 97;
                        i = ((iM2761 ^ i10) * 2649) ^ (-1997074228);
                        i2 = 1482564591;
                    }
                    i12 = iM2761 ^ i2;
                    i11 = i;
                    break;
                case -170185204:
                case 1851863977:
                    runnableC13254.run();
                    iM2761 = C0619.m2761("᩶ܺ") ^ i10;
                    i = ((iM2761 ^ i9) * 29773) ^ 707798461;
                    i2 = -2025885268;
                    i12 = iM2761 ^ i2;
                    i11 = i;
                    break;
                case -169481636:
                case 523221263:
                    i3 = s * 39692;
                    if (C1080.f3865 >= 0) {
                        iM2761 = (C0773.m3169("֨᩷") ^ i9) * (-97);
                        i = ((iM2761 ^ i10) * (-26479)) ^ 356598757;
                        i2 = 842296512;
                    } else {
                        iM2761 = C0773.m3169("ۙܿ") ^ i10;
                        i = ((iM2761 ^ i9) * 14107) ^ (-151300546);
                        i2 = -663531475;
                    }
                    i12 = iM2761 ^ i2;
                    i11 = i;
                    break;
                case 182659042:
                case 1488598009:
                    m10876(z);
                    runnableC13254 = f10749;
                    if (runnableC13254 != null) {
                        iM2761 = C0619.m2761("ۜ᩻") ^ i9;
                        i = ((iM2761 ^ i10) * (-8935)) ^ 1015826048;
                        i2 = 176484177;
                    } else {
                        iM2761 = C0619.m2761("᩶ܺ") ^ i10;
                        i = ((iM2761 ^ i9) * 29773) ^ 707798461;
                        i2 = -2025885268;
                    }
                    i12 = iM2761 ^ i2;
                    i11 = i;
                    break;
                case 527610447:
                case 1400478549:
                    s = sArr2[c];
                    if (C2834.f9334 <= 0) {
                        iM2761 = C0619.m2761("᩶ۚ") ^ i9;
                        i = ((iM2761 ^ i10) * 27765) ^ (-1265331914);
                        i2 = -1100156000;
                    } else {
                        iM2761 = C0773.m3169("᩺ܶ") ^ i9;
                        i = ((iM2761 ^ i10) * (-16379)) ^ 961757205;
                        i2 = 2076815636;
                    }
                    i12 = iM2761 ^ i2;
                    i11 = i;
                    break;
                default:
                    if (z != f10739) {
                        iM2761 = (C0619.m2761("ܶᩴ") ^ i10) * 37;
                        i = ((iM2761 ^ i9) * 22313) ^ 1810110459;
                        i2 = 1143412174;
                    } else {
                        iM2761 = (C0619.m2761("ۧܿ") + i9) * (-121);
                        i = ((iM2761 ^ i10) * 31129) ^ (-691194314);
                        i2 = 1873400236;
                    }
                    i12 = iM2761 ^ i2;
                    i11 = i;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m10871(int i, int i2) {
        int i3 = -1461188433;
        int i4 = C1321.f4751;
        int i5 = C0950.f3488;
        int iM2761 = C0619.m2761("ۡ֡") ^ i4;
        int i6 = ((iM2761 ^ i5) * 14121) ^ (-1034386659);
        int i7 = -432926366;
        while (true) {
            i3 = ((((i3 ^ i5) * 17513) >> 31) & i6) ^ (iM2761 ^ i7);
            switch (i3) {
                case -1933652334:
                case 1648677947:
                    C3033.m9845();
                    if (RunnableC0334.f1808 <= 0) {
                        iM2761 = (C0773.m3169("ܽۘ") + i4) * 51;
                        i6 = ((iM2761 ^ i5) * (-26929)) ^ (-1904557291);
                        i7 = 2043508363;
                    } else {
                        iM2761 = (C0773.m3169("ۢ᩻") ^ i5) * 83;
                        i6 = ((iM2761 ^ i4) * (-24689)) ^ (-518384790);
                        i7 = -584086018;
                    }
                    break;
                case -1894471336:
                case -381778116:
                    if (AbstractC0641.f2496 >= 0) {
                        iM2761 = (C0773.m3169("ܽۘ") + i4) * 51;
                        i6 = ((iM2761 ^ i5) * (-26929)) ^ (-1904557291);
                        i7 = 2043508363;
                    } else {
                        iM2761 = C0619.m2761("ۢᩴ") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-611)) ^ 172491561;
                        i7 = -1772902297;
                    }
                    break;
                case -1533851707:
                case -930273797:
                    if (f10739) {
                        iM2761 = (C0619.m2761("ۜܺ") ^ i4) * (-19);
                        i6 = ((iM2761 ^ i5) * (-4301)) ^ 1481394446;
                        i7 = 1483343724;
                    } else {
                        iM2761 = (C0773.m3169("᩺᩸") ^ i5) * (-109);
                        i6 = ((iM2761 ^ i4) * (-26885)) ^ 1667203257;
                        i7 = 129489744;
                    }
                    break;
                case -1384285785:
                case 1011126473:
                    if (C2310.f7472 >= 0) {
                        iM2761 = C0773.m3169("ۘ֡") ^ i5;
                        i6 = ((iM2761 ^ i4) * 405) ^ 1340724063;
                        i7 = 462782839;
                    } else {
                        iM2761 = (i4 - C0619.m2761("֡ۚ")) * 15;
                        i6 = ((iM2761 ^ i5) * 27739) ^ 1866434011;
                        i7 = -1636501093;
                    }
                    break;
                case -1309407090:
                case -299652987:
                    if (C1080.f3865 >= 0) {
                        iM2761 = (C0773.m3169("ۢ᩻") ^ i5) * 83;
                        i6 = ((iM2761 ^ i4) * (-24689)) ^ (-518384790);
                        i7 = -584086018;
                    } else {
                        iM2761 = C0619.m2761("ۛ᩷") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-14087)) ^ (-1651371804);
                        i7 = 1402763562;
                    }
                    break;
                case -1293007743:
                case -289089245:
                    if (C1564.m5509() <= 0) {
                        iM2761 = (C0773.m3169("ܰܰ") ^ i4) * (-107);
                        i6 = ((iM2761 ^ i5) * (-23291)) ^ 1985669019;
                        i7 = 1566635220;
                    } else {
                        iM2761 = (i5 - C0773.m3169("ܶܽ")) * (-79);
                        i6 = ((iM2761 ^ i4) * 3873) ^ 260549794;
                        i7 = 1348344237;
                    }
                    break;
                case -854925155:
                case 84005567:
                    C3492.m11488();
                    AbstractC3624.m11755();
                    iM2761 = (C0773.m3169("ۢ᩻") ^ i5) * 83;
                    i6 = ((iM2761 ^ i4) * (-24689)) ^ (-518384790);
                    i7 = -584086018;
                    break;
                case -566818927:
                case -312482089:
                    C11235.m28309();
                    return 0;
                case -437865580:
                case -279245968:
                    if (C2485.f7950 != 0) {
                        iM2761 = C0773.m3169("ۘ֡") ^ i5;
                        i6 = ((iM2761 ^ i4) * 405) ^ 1340724063;
                        i7 = 462782839;
                    } else {
                        iM2761 = C0619.m2761("۫ۢ") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-19601)) ^ (-695301109);
                        i7 = 392956578;
                    }
                    break;
                case -329458540:
                case -86138707:
                    return i;
                case -184268627:
                case 1669788954:
                    if (C3448.m11248() != 0) {
                        iM2761 = (C0773.m3169("ܰܰ") ^ i4) * (-107);
                        i6 = ((iM2761 ^ i5) * (-23291)) ^ 1985669019;
                        i7 = 1566635220;
                    } else {
                        iM2761 = C0773.m3169("᩸᩻") ^ i5;
                        i6 = ((iM2761 ^ i4) * 16193) ^ (-1284842762);
                        i7 = 633773486;
                    }
                    break;
                case -18129025:
                case 54463811:
                    if (!C4282.m13644()) {
                        iM2761 = C0773.m3169("ۘ֡") ^ i5;
                        i6 = ((iM2761 ^ i4) * 405) ^ 1340724063;
                        i7 = 462782839;
                    } else {
                        iM2761 = (C0773.m3169("ܽۘ") + i4) * 51;
                        i6 = ((iM2761 ^ i5) * (-26929)) ^ (-1904557291);
                        i7 = 2043508363;
                    }
                    break;
                case 143421099:
                case 1084888313:
                    if (C3690.m11987()) {
                        iM2761 = (C0773.m3169("ܰܰ") ^ i4) * (-107);
                        i6 = ((iM2761 ^ i5) * (-23291)) ^ 1985669019;
                        i7 = 1566635220;
                    } else {
                        iM2761 = C0773.m3169("֨۫") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-22561)) ^ (-1298102648);
                        i7 = 1926075387;
                    }
                    break;
                case 160286328:
                case 1270817460:
                    if (C2023.m6964() <= 0) {
                        iM2761 = (C0773.m3169("ܰܰ") ^ i4) * (-107);
                        i6 = ((iM2761 ^ i5) * (-23291)) ^ 1985669019;
                        i7 = 1566635220;
                    } else {
                        iM2761 = (i4 - C0773.m3169("ܰۢ")) * (-47);
                        i6 = ((iM2761 ^ i5) * (-11765)) ^ 1410452265;
                        i7 = 1448981712;
                    }
                    break;
                case 818649294:
                case 1522142070:
                    if (C1564.f5401 <= 0) {
                        iM2761 = (C0773.m3169("ܰܰ") ^ i4) * (-107);
                        i6 = ((iM2761 ^ i5) * (-23291)) ^ 1985669019;
                        i7 = 1566635220;
                    } else {
                        iM2761 = (C0773.m3169("᩺ۗ") + i5) * (-31);
                        i6 = ((iM2761 ^ i4) * 29179) ^ (-320831784);
                        i7 = 2044312914;
                    }
                    break;
                case 1232068809:
                case 2056056622:
                    C1564.m5509();
                    if (RunnableC1848.f6235) {
                        iM2761 = C0619.m2761("ۢ֡") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-15213)) ^ (-1148626086);
                        i7 = -1550198981;
                    } else {
                        iM2761 = (C0773.m3169("ۢ᩻") ^ i5) * 83;
                        i6 = ((iM2761 ^ i4) * (-24689)) ^ (-518384790);
                        i7 = -584086018;
                    }
                    break;
                case 1553895013:
                case 1955517976:
                    if (C2287.f7432 >= 0) {
                        iM2761 = (C0773.m3169("ܰܰ") ^ i4) * (-107);
                        i6 = ((iM2761 ^ i5) * (-23291)) ^ 1985669019;
                        i7 = 1566635220;
                    } else {
                        iM2761 = (C0773.m3169("ۨ֫") ^ i5) * (-107);
                        i6 = ((iM2761 ^ i4) * 17163) ^ 638248004;
                        i7 = 1609745475;
                    }
                    break;
                default:
                    return i2;
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m10878() {
        return f10739;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0091, code lost:
    
        if (l.C1519.f5300 >= 0) goto L18;
     */
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m10879() {
        /*
            Method dump skipped, instruction units count: 980
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3296.m10879():void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m10872(Object obj, Object obj2) {
        int i = 1247996222;
        int i2 = C2288.f7433;
        int i3 = AbstractC3624.f12429;
        int iM3169 = C0773.m3169("᩵ᩳ") ^ i2;
        int i4 = ((iM3169 ^ i3) * (-9067)) ^ (-1384169452);
        int i5 = 1109839610;
        while (true) {
            i = ((((i ^ i3) * 24681) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2051409591:
                case 1979032519:
                    if (C2375.m8065() <= 0) {
                        iM3169 = C0619.m2761("ۘܿ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 11893) ^ (-622008126);
                        i5 = -2674252;
                    } else {
                        iM3169 = (C0773.m3169("᩺ۜ") ^ i2) * 11;
                        i4 = ((iM3169 ^ i3) * 8235) ^ (-947369403);
                        i5 = 2137739418;
                    }
                    break;
                case -1774552433:
                case 2013276191:
                    if (C17202.f56030) {
                        iM3169 = (C0619.m2761("ܰ۟") + i3) * (-25);
                        i4 = ((iM3169 ^ i2) * 32695) ^ (-1145015620);
                        i5 = 1396888092;
                    } else {
                        iM3169 = C0619.m2761("ۘܿ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 11893) ^ (-622008126);
                        i5 = -2674252;
                    }
                    break;
                case -1652175474:
                case -904661508:
                    C2702.m8876();
                    iM3169 = (C0773.m3169("֫֨") ^ i3) * (-89);
                    i4 = ((iM3169 ^ i2) * 29029) ^ 595020195;
                    i5 = 1876830619;
                    break;
                case -1023543132:
                case 802722831:
                    if (C2702.f8586 <= 0) {
                        iM3169 = C0773.m3169("ۨᩳ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-26171)) ^ (-1867384924);
                        i5 = 1699356828;
                    } else {
                        iM3169 = C0773.m3169("᩸ۗ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-32709)) ^ 1988268699;
                        i5 = 1519342346;
                    }
                    break;
                case -964519629:
                case -533006095:
                    if (C4282.m13644()) {
                        iM3169 = C0773.m3169("۟᩺") ^ i2;
                        i4 = ((iM3169 ^ i3) * 7689) ^ 70840770;
                        i5 = 396848097;
                    } else {
                        iM3169 = (C0773.m3169("ۜ۫") ^ i2) * (-13);
                        i4 = ((iM3169 ^ i3) * 5941) ^ (-508793478);
                        i5 = 1486614207;
                    }
                    break;
                case -526821953:
                case 1175940719:
                    if (C1564.m5509() <= 0) {
                        iM3169 = (C0773.m3169("֫֨") ^ i3) * (-89);
                        i4 = ((iM3169 ^ i2) * 29029) ^ 595020195;
                        i5 = 1876830619;
                    } else {
                        iM3169 = (C0619.m2761("ᩳ۫") + i3) * 99;
                        i4 = ((iM3169 ^ i2) * (-17949)) ^ (-653991452);
                        i5 = 596398502;
                    }
                    break;
                case -511619672:
                case 889526956:
                    if (RunnableC1848.f6235) {
                        iM3169 = C0619.m2761("ۘܿ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 11893) ^ (-622008126);
                        i5 = -2674252;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ܰۧ")) * (-117);
                        i4 = ((iM3169 ^ i2) * (-4811)) ^ 1432189143;
                        i5 = -1879178763;
                    }
                    break;
                case -442562020:
                case 291586975:
                    if (C2834.f9334 <= 0) {
                        iM3169 = C0773.m3169("۫᩵") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-15495)) ^ (-1290308083);
                        i5 = 2076620432;
                    } else {
                        iM3169 = (C0773.m3169("ᩴۘ") + i2) * 67;
                        i4 = ((iM3169 ^ i3) * 12291) ^ 448582859;
                        i5 = -1000825060;
                    }
                    break;
                case -172100582:
                case 767142261:
                    C3077.m10041();
                    return null;
                case 118495821:
                case 666506163:
                    return obj;
                case 119076682:
                case 1977924962:
                    C1080.m4050();
                    if (C1321.f4751 < 0) {
                        iM3169 = (C0773.m3169("ۜ۫") ^ i2) * (-13);
                        i4 = ((iM3169 ^ i3) * 5941) ^ (-508793478);
                        i5 = 1486614207;
                    } else {
                        iM3169 = C0619.m2761("ۘܿ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 11893) ^ (-622008126);
                        i5 = -2674252;
                    }
                    break;
                case 373933082:
                case 971657550:
                    return obj2;
                case 544712505:
                case 1547815952:
                    if (C3779.f12953 <= 0) {
                        iM3169 = C0619.m2761("ۘܿ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 11893) ^ (-622008126);
                        i5 = -2674252;
                    } else {
                        iM3169 = (C0619.m2761("ᩳ۟") ^ i2) * 123;
                        i4 = ((iM3169 ^ i3) * 21741) ^ 57194441;
                        i5 = 167521799;
                    }
                    break;
                case 634398325:
                case 2122047744:
                    if (C2702.f8586 <= 0) {
                        iM3169 = C0773.m3169("۫᩵") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-15495)) ^ (-1290308083);
                        i5 = 2076620432;
                    } else {
                        iM3169 = (C0773.m3169("ۡܽ") + i2) * (-117);
                        i4 = ((iM3169 ^ i3) * 26185) ^ 658227339;
                        i5 = 590095953;
                    }
                    break;
                case 760095967:
                case 1498597353:
                    C3099.m10095();
                    if (C11235.m28309() == 0) {
                        iM3169 = C0773.m3169("۫᩵") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-15495)) ^ (-1290308083);
                        i5 = 2076620432;
                    } else {
                        iM3169 = C0619.m2761("ۘܿ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 11893) ^ (-622008126);
                        i5 = -2674252;
                    }
                    break;
                case 808152496:
                case 2141754792:
                    C2485.m8357();
                    if (C2288.f7433 > 0) {
                        iM3169 = C0619.m2761("ۘܿ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 11893) ^ (-622008126);
                        i5 = -2674252;
                    } else {
                        iM3169 = (C0773.m3169("֫֨") ^ i3) * (-89);
                        i4 = ((iM3169 ^ i2) * 29029) ^ 595020195;
                        i5 = 1876830619;
                    }
                    break;
                case 857938818:
                case 1549703208:
                    if (C2966.f9654 >= 0) {
                        iM3169 = C0773.m3169("ۨᩳ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-26171)) ^ (-1867384924);
                        i5 = 1699356828;
                    } else {
                        iM3169 = C0619.m2761("ۘܳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 15479) ^ 396600070;
                        i5 = 972231246;
                    }
                    break;
                default:
                    if (f10739) {
                        iM3169 = C0773.m3169("ۗᩳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 335) ^ (-2102134661);
                        i5 = 1817695749;
                    } else {
                        iM3169 = (C0773.m3169("ᩴۤ") ^ i2) * (-105);
                        i4 = ((iM3169 ^ i3) * 24445) ^ (-1304226455);
                        i5 = -1789885115;
                    }
                    break;
            }
        }
    }
}
