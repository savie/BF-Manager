package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.۬۬᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: P1ZL */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC13887 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static volatile boolean f44038 = true;

    /* JADX INFO: renamed from: ᩵ۙۡ, reason: not valid java name and contains not printable characters */
    private static final short[] f44039;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static volatile long f44040;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f44041;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f44042;

    static {
        ApplicationC23172.m52091(UMErrorCode.E_UM_BE_DEFLATE_FAILED);
        f44039 = new short[]{415, 13485, 1264, -29403, -29440, -29419, -29436};
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static native long m33832(C9444 c9444);

    /* JADX INFO: renamed from: ۙ */
    public abstract String mo19750(String str);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC13887 m33833(String str, String str2) {
        return new C7176(str, str2);
    }

    public AbstractC13887(String str) {
        short[] sArr = null;
        int i = 0;
        int i2 = 0;
        int i3 = 118374555;
        int i4 = C3734.f12817;
        int i5 = C2375.f7641;
        short s = f44039[0];
        int i6 = ((s * s) + 3400336) - (s * 3688) >= 0 ? 13442 : 16238;
        int iM3169 = C0773.m3169("ܳ֡") ^ i4;
        int i7 = ((iM3169 ^ i5) * 9139) ^ 1062882624;
        int i8 = 233576091;
        while (true) {
            i3 = ((((i3 ^ i5) * (-6817)) >> 31) & i7) ^ (iM3169 ^ i8);
            switch (i3) {
                case -2144551834:
                case -1728299796:
                    sArr = f44039;
                    i = 1;
                    if (C3077.f9998) {
                        iM3169 = C0773.m3169("۟ۢ") ^ i4;
                        i7 = ((iM3169 ^ i5) * (-12569)) ^ 1118401573;
                        i8 = -854093312;
                    } else {
                        iM3169 = C0773.m3169("ܶ᩺") ^ i4;
                        i7 = ((iM3169 ^ i5) * 20205) ^ (-2117839847);
                        i8 = 1783523826;
                    }
                    break;
                case -2136716789:
                case -1595890113:
                    if (C2375.f7641 <= 0) {
                        iM3169 = C0773.m3169("᩷ۤ") ^ i5;
                        i7 = ((iM3169 ^ i4) * (-4865)) ^ (-198290607);
                        i8 = -985364370;
                    } else {
                        iM3169 = C0773.m3169("ۡ᩷") ^ i5;
                        i7 = ((iM3169 ^ i4) * 19917) ^ 244894774;
                        i8 = 1256289425;
                    }
                    break;
                case -2006264347:
                case -1753585196:
                    if (AbstractC3624.f12429 > 0) {
                        iM3169 = (C0619.m2761("᩺ܺ") ^ i4) * 99;
                        i7 = ((iM3169 ^ i5) * 29719) ^ 672741276;
                        i8 = -1245191118;
                    } else {
                        iM3169 = C0773.m3169("᩷ۤ") ^ i5;
                        i7 = ((iM3169 ^ i4) * (-4865)) ^ (-198290607);
                        i8 = -985364370;
                    }
                    break;
                case -1706929288:
                case -1315362982:
                    C1826.m6301();
                    throw new RuntimeException();
                case -1234038245:
                case 1317174251:
                    if (C2834.m9345(str, C1080.m4056(sArr, i, i2, i6))) {
                        iM3169 = C0773.m3169("᩹᩺") ^ i4;
                        i7 = ((iM3169 ^ i5) * 26173) ^ (-532182034);
                        i8 = -495094166;
                    } else {
                        iM3169 = (i5 - C0619.m2761("ۚ֫")) * 81;
                        i7 = ((iM3169 ^ i4) * 22105) ^ 624436843;
                        i8 = -2096571529;
                    }
                    break;
                case -1059591306:
                case 123104027:
                    if (C2878.m9491() <= 0) {
                        iM3169 = C0773.m3169("᩷ۤ") ^ i5;
                        i7 = ((iM3169 ^ i4) * (-4865)) ^ (-198290607);
                        i8 = -985364370;
                    } else {
                        iM3169 = (i4 - C0619.m2761("ܶ᩵")) * (-117);
                        i7 = ((iM3169 ^ i5) * 23069) ^ (-1861147777);
                        i8 = 2133024961;
                    }
                    break;
                case -809759210:
                case 1044320094:
                    if (C13473.m33144()) {
                        iM3169 = (C0619.m2761("֨ܿ") + i4) * (-31);
                        i7 = ((iM3169 ^ i5) * (-11951)) ^ 760436705;
                        i8 = -1124092563;
                    } else {
                        iM3169 = C0773.m3169("ۘ᩷") ^ i5;
                        i7 = ((iM3169 ^ i4) * (-3743)) ^ 252285091;
                        i8 = 1049431239;
                    }
                    break;
                case -80574531:
                case 493088357:
                    if (C1783.f6087 <= 0) {
                        iM3169 = (C0619.m2761("᩺ܺ") ^ i4) * 99;
                        i7 = ((iM3169 ^ i5) * 29719) ^ 672741276;
                        i8 = -1245191118;
                    } else {
                        iM3169 = C0773.m3169("᩸ܶ") ^ i4;
                        i7 = ((iM3169 ^ i5) * 8587) ^ (-745231097);
                        i8 = -1840931300;
                    }
                    break;
                case -10592945:
                case 2145158178:
                    if (!C3690.m11987()) {
                        iM3169 = C0773.m3169("᩷ۤ") ^ i5;
                        i7 = ((iM3169 ^ i4) * (-4865)) ^ (-198290607);
                        i8 = -985364370;
                    } else {
                        iM3169 = C0773.m3169("ᩳ᩷") ^ i5;
                        i7 = ((iM3169 ^ i4) * 5385) ^ (-570977803);
                        i8 = -475548727;
                    }
                    break;
                case 326187449:
                case 327697051:
                    AbstractC3624.m11755();
                    C1146.m4231();
                    iM3169 = C0773.m3169("᩷ۤ") ^ i5;
                    i7 = ((iM3169 ^ i4) * (-4865)) ^ (-198290607);
                    i8 = -985364370;
                    break;
                case 331128961:
                case 2003761138:
                    throw new IllegalArgumentException(str);
                case 603255704:
                case 1289587675:
                    i2 = 1;
                    if (C2354.f7599 >= 0) {
                        iM3169 = C0773.m3169("ۘ᩷") ^ i5;
                        i7 = ((iM3169 ^ i4) * (-3743)) ^ 252285091;
                        i8 = 1049431239;
                    } else {
                        iM3169 = (C0619.m2761("ۖ᩶") + i5) * 119;
                        i7 = ((iM3169 ^ i4) * 4663) ^ 39332890;
                        i8 = -443039548;
                    }
                    break;
                case 932847741:
                case 1246983713:
                    C3033.m9845();
                    if (RunnableC3055.f9898 < 0) {
                        iM3169 = C0773.m3169("ܶ᩺") ^ i4;
                        i7 = ((iM3169 ^ i5) * 20205) ^ (-2117839847);
                        i8 = 1783523826;
                    } else {
                        iM3169 = C0773.m3169("ᩳ᩷") ^ i5;
                        i7 = ((iM3169 ^ i4) * 5385) ^ (-570977803);
                        i8 = -475548727;
                    }
                    break;
                case 1310682685:
                case 1784855845:
                    if (C1343.f4799 != 0) {
                        iM3169 = (C0619.m2761("᩺ܺ") ^ i4) * 99;
                        i7 = ((iM3169 ^ i5) * 29719) ^ 672741276;
                        i8 = -1245191118;
                    } else {
                        iM3169 = C0619.m2761("ۗ᩷") ^ i5;
                        i7 = ((iM3169 ^ i4) * 13519) ^ (-1645844454);
                        i8 = 407485090;
                    }
                    break;
                case 1476888410:
                case 1991459818:
                    if (C1826.f6190 <= 0) {
                        iM3169 = C0773.m3169("ᩳ᩷") ^ i5;
                        i7 = ((iM3169 ^ i4) * 5385) ^ (-570977803);
                        i8 = -475548727;
                    } else {
                        iM3169 = (C0619.m2761("ۚ᩺") ^ i5) * 79;
                        i7 = ((iM3169 ^ i4) * 32307) ^ 739170178;
                        i8 = 1144701741;
                    }
                    break;
                case 1672550273:
                case 1821884507:
                    if (C4282.m13644()) {
                        iM3169 = C0619.m2761("ܺᩳ") ^ i4;
                        i7 = ((iM3169 ^ i5) * 15037) ^ (-354424106);
                        i8 = -1226520744;
                    } else {
                        iM3169 = C0773.m3169("ܶ᩺") ^ i4;
                        i7 = ((iM3169 ^ i5) * 20205) ^ (-2117839847);
                        i8 = 1783523826;
                    }
                    break;
                case 1775460829:
                case 2033131935:
                    this.f44041 = str;
                    this.f44042 = true;
                    return;
                default:
                    if (C2702.f8586 <= 0) {
                        iM3169 = C0773.m3169("ܶ᩺") ^ i4;
                        i7 = ((iM3169 ^ i5) * 20205) ^ (-2117839847);
                        i8 = 1783523826;
                    } else {
                        iM3169 = C0773.m3169("ۗ᩻") ^ i5;
                        i7 = ((iM3169 ^ i4) * 4845) ^ 1935196972;
                        i8 = -1880294080;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m33831() {
        long jM9342 = 0;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        int i = 0;
        int i2 = -1683592569;
        int i3 = C0487.f2131;
        int i4 = C1826.f6190;
        int iM2761 = C0619.m2761("ۛ᩹") ^ i3;
        int i5 = ((iM2761 ^ i4) * 11261) ^ 1037903799;
        int i6 = 1415415384;
        while (true) {
            i2 = ((((i2 ^ i4) * 21605) >> 31) & i5) ^ (iM2761 ^ i6);
            switch (i2) {
                case -1910837020:
                case -1641927082:
                    j4 = 30 + j3;
                    if (RunnableC0334.f1808 <= 0) {
                        iM2761 = C0773.m3169("֡ۘ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-14865)) ^ (-690856616);
                        i6 = 1365342245;
                    } else {
                        iM2761 = C0619.m2761("᩷ܺ") ^ i3;
                        i5 = ((iM2761 ^ i4) * 18081) ^ (-1000435846);
                        i6 = 456625147;
                    }
                    break;
                case -1777342418:
                case 827258650:
                    j2 = jM9342 / j;
                    if (C0773.f2792 <= 0) {
                        iM2761 = (i4 - C0619.m2761("ܽ᩷")) * 45;
                        i5 = ((iM2761 ^ i3) * (-30101)) ^ 990663803;
                        i6 = -591876922;
                    } else {
                        iM2761 = (i4 - C0773.m3169("ۡ֨")) * (-81);
                        i5 = ((iM2761 ^ i3) * (-16227)) ^ 196302141;
                        i6 = -1946258734;
                    }
                    break;
                case -1746891282:
                case -415952390:
                    C1519.m5403();
                    C1826.m6301();
                    return 0L;
                case -1740528174:
                case -581259689:
                    j3 = f44040 + j2;
                    if (C0773.f2792 <= 0) {
                        iM2761 = C0773.m3169("֡ۘ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-14865)) ^ (-690856616);
                        i6 = 1365342245;
                    } else {
                        iM2761 = (C0619.m2761("ۜܳ") ^ i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i5 = ((iM2761 ^ i4) * 9331) ^ 1152986264;
                        i6 = -525539411;
                    }
                    break;
                case -1689946605:
                case 1424898299:
                    if (C4238.m13540() <= 0) {
                        iM2761 = (i3 - C0619.m2761("֫۠")) * 119;
                        i5 = ((iM2761 ^ i4) * (-9737)) ^ 1612973140;
                        i6 = -1051670661;
                    } else {
                        iM2761 = C0619.m2761("᩶ۧ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 6743) ^ (-1466039168);
                        i6 = 352426335;
                    }
                    break;
                case -1479155019:
                case 1367793919:
                    return j4 + ((long) i);
                case -1085813948:
                case 682949789:
                    if (C0487.f2131 <= 0) {
                        iM2761 = C0773.m3169("ۚܰ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 2895) ^ 2126395507;
                        i6 = -217750113;
                    } else {
                        iM2761 = C0619.m2761("ۡۛ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-8459)) ^ (-274053635);
                        i6 = 1244011094;
                    }
                    break;
                case -641242906:
                case 205911872:
                    i = -1800;
                    if (C0269.f1558 <= 0) {
                        iM2761 = (i3 - C0619.m2761("֫۠")) * 119;
                        i5 = ((iM2761 ^ i4) * (-9737)) ^ 1612973140;
                        i6 = -1051670661;
                    } else {
                        iM2761 = C0773.m3169("ۧۡ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 20135) ^ 1197995113;
                        i6 = 895684546;
                    }
                    break;
                case 74478639:
                case 1621535631:
                    if (C1080.f3865 < 0) {
                        iM2761 = C0619.m2761("ܶ᩸") ^ i3;
                        i5 = ((iM2761 ^ i4) * 13725) ^ (-885773540);
                        i6 = 1982925843;
                    } else {
                        iM2761 = (i3 - C0619.m2761("֫۠")) * 119;
                        i5 = ((iM2761 ^ i4) * (-9737)) ^ 1612973140;
                        i6 = -1051670661;
                    }
                    break;
                case 163743804:
                case 1631629577:
                    C0862.m3503();
                    if (C2375.f7641 <= 0) {
                        iM2761 = (i3 - C0619.m2761("֫۠")) * 119;
                        i5 = ((iM2761 ^ i4) * (-9737)) ^ 1612973140;
                        i6 = -1051670661;
                    } else {
                        iM2761 = C0773.m3169("ۚܰ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 2895) ^ 2126395507;
                        i6 = -217750113;
                    }
                    break;
                case 601453348:
                case 604236702:
                    C0773.m3161();
                    C3690.m11987();
                    iM2761 = C0773.m3169("ۚܰ") ^ i4;
                    i5 = ((iM2761 ^ i3) * 2895) ^ 2126395507;
                    i6 = -217750113;
                    break;
                case 897908373:
                case 2087301141:
                    C0487.m2356();
                    if (!C2023.f6737) {
                        iM2761 = (i4 - C0619.m2761("ܽ᩷")) * 45;
                        i5 = ((iM2761 ^ i3) * (-30101)) ^ 990663803;
                        i6 = -591876922;
                    } else {
                        iM2761 = C0773.m3169("ۚܰ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 2895) ^ 2126395507;
                        i6 = -217750113;
                    }
                    break;
                case 1448055390:
                case 1522670971:
                    if (AbstractC0116.f1064 <= 0) {
                        iM2761 = C0773.m3169("֡ۘ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-14865)) ^ (-690856616);
                        i6 = 1365342245;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ᩳ۬")) * 17;
                        i5 = ((iM2761 ^ i4) * 7653) ^ (-211591631);
                        i6 = -1493553998;
                    }
                    break;
                case 1566015828:
                case 1814756736:
                    if (C0487.m2356() >= 0) {
                        iM2761 = (i4 - C0619.m2761("ܽ᩷")) * 45;
                        i5 = ((iM2761 ^ i3) * (-30101)) ^ 990663803;
                        i6 = -591876922;
                    } else {
                        iM2761 = (C0773.m3169("ۤ֡") + i4) * 75;
                        i5 = ((iM2761 ^ i3) * 3139) ^ 1152881032;
                        i6 = -1104635754;
                    }
                    break;
                case 1911001481:
                case 2147393035:
                    if (C3690.f12684 <= 0) {
                        iM2761 = (i3 - C0619.m2761("֫۠")) * 119;
                        i5 = ((iM2761 ^ i4) * (-9737)) ^ 1612973140;
                        i6 = -1051670661;
                    } else {
                        iM2761 = (C0773.m3169("ۗ֨") + i4) * (-95);
                        i5 = ((iM2761 ^ i3) * (-3883)) ^ (-321923419);
                        i6 = -655399226;
                    }
                    break;
                default:
                    jM9342 = C2834.m9342();
                    j = 1000;
                    if (C2023.f6737) {
                        iM2761 = C0619.m2761("ܶ᩸") ^ i3;
                        i5 = ((iM2761 ^ i4) * 13725) ^ (-885773540);
                        i6 = 1982925843;
                    } else {
                        iM2761 = (C0619.m2761("᩺ۡ") + i3) * (-37);
                        i5 = ((iM2761 ^ i4) * (-29661)) ^ 1320258094;
                        i6 = 124546166;
                    }
                    break;
            }
        }
    }

    public final String toString() {
        return this.f44041;
    }
}
