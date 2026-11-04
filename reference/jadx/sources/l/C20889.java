package l;

import android.app.Application;
import android.content.ClipboardManager;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import bin.mt.plugin.api.LocalString;
import bin.mt.plugin.api.PluginContext;
import bin.mt.plugin.api.util.ThreadUtil;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.File;
import java.io.InputStream;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.᩵᩺֫, reason: contains not printable characters */
/* JADX INFO: compiled from: R3YJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C20889 implements PluginContext {

    /* JADX INFO: renamed from: ۜ᩷ۜ, reason: not valid java name and contains not printable characters */
    private static final short[] f66857 = {6984, -28750, -28739, -28744, -28767, -28749, -28738, -28752, -28765, -28747, 5747, 15424, 15452, 15429, 15447, 15449, 15454, 15481, 15444, 15424, 15452, 15429, 15447, 15449, 15454, 15456, 15426, 15445, 15446, 15445, 15426, 15445, 15454, 15443, 15445, 8485, 4183, 4171, 4171, 4175, 4101, 4112, 4112, 4183, 4171, 4171, 4175, 4172, 4101, 4112, 4112, 2742, 3131, 9804, 13953, 13981, 13953, 13957, 13981, 13954, 13954, 5224, -4467, -4438, -4436, -4425, -4432, -4423, 5114, -5051, -5022, -5020, -4993, -5000, -5007, -5066, -5000, -4999, -5022, -5066, -5008, -4999, -5021, -5000, -5006, -5076, -5066, 3049, 3897, 3892, 3899, 3890, 3878, 3873, 3879, 3900, 3899, 3890, 3878, 3465, 11698, -8882, -11568, -12646, -8850, -12288, 3210, -32376, -23032, 19079, 969, 17500, 17486, 17486, 17496, 17481, 17486, 17426};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC3735 f66858;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final String f66859;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9086 f66860;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String f66861;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C17159 f66862;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C4130 f66863;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String f66864;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C4130 f66865;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public volatile SharedPreferences f66866;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C11021 f66867;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f66868;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C9086 f66869;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public ClipboardManager f66870;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f66871;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f66872;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public InterfaceC13430 f66873;

    @Override // bin.mt.plugin.api.PluginContext
    public final int getHostVersionCode() {
        return 26110365;
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final String getHostVersionName() {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        short[] sArr2 = null;
        int i5 = 0;
        int i6 = -552395646;
        int i7 = C3690.f12684;
        int i8 = C0773.f2792;
        int iM3169 = (C0773.m3169("ۘۙ") + i8) * 123;
        int i9 = ((iM3169 ^ i7) * (-11803)) ^ 232850837;
        int i10 = -1510954029;
        while (true) {
            i6 = ((((i6 ^ i7) * (-3705)) >> 31) & i9) ^ (iM3169 ^ i10);
            switch (i6) {
                case -1949410001:
                case -1458733652:
                    RunnableC3055.m9933();
                    iM3169 = C0773.m3169("֡᩺") ^ i7;
                    i9 = ((iM3169 ^ i8) * (-4569)) ^ (-1446056814);
                    i10 = 493460562;
                    break;
                case -1912416967:
                case 652308382:
                    c = '5';
                    if (C2287.f7432 >= 0) {
                        iM3169 = C0619.m2761("ۨۛ") ^ i7;
                        i9 = ((iM3169 ^ i8) * (-18475)) ^ (-2120335562);
                        i10 = -235179437;
                    } else {
                        iM3169 = C0619.m2761("᩸ܿ") ^ i8;
                        i9 = ((iM3169 ^ i7) * 7929) ^ (-937212438);
                        i10 = 1356528549;
                    }
                    break;
                case -1657659252:
                case 1456960820:
                    if (C2485.m8357() <= 0) {
                        iM3169 = C0773.m3169("᩶ۤ") ^ i8;
                        i9 = ((iM3169 ^ i7) * (-10791)) ^ (-981759548);
                        i10 = -729189652;
                    } else {
                        iM3169 = (i7 - C0773.m3169("ۤۛ")) * 55;
                        i9 = ((iM3169 ^ i8) * 10807) ^ (-1949175149);
                        i10 = 713759552;
                    }
                    break;
                case -1588541506:
                case -704652905:
                    if (!C3077.m10041()) {
                        iM3169 = C0773.m3169("֡᩺") ^ i7;
                        i9 = ((iM3169 ^ i8) * (-4569)) ^ (-1446056814);
                        i10 = 493460562;
                    } else {
                        iM3169 = (C0619.m2761("᩶᩷") ^ i7) * 89;
                        i9 = ((iM3169 ^ i8) * (-24285)) ^ (-652247949);
                        i10 = 1790653398;
                    }
                    break;
                case -1508626069:
                case 766251104:
                    if (C1146.m4231()) {
                        iM3169 = C0619.m2761("ۢ᩺") ^ i8;
                        i9 = ((iM3169 ^ i7) * 31359) ^ 909005382;
                        i10 = -741453617;
                    } else {
                        iM3169 = C0773.m3169("֡᩺") ^ i7;
                        i9 = ((iM3169 ^ i8) * (-4569)) ^ (-1446056814);
                        i10 = 493460562;
                    }
                    break;
                case -1399278257:
                case -386326922:
                    if (C3077.f9998) {
                        iM3169 = (i8 - C0619.m2761("ۡ۠")) * 63;
                        i9 = ((iM3169 ^ i7) * 11067) ^ 1528397600;
                        i10 = -1992152210;
                    } else {
                        iM3169 = (C0619.m2761("᩶᩷") ^ i7) * 89;
                        i9 = ((iM3169 ^ i8) * (-24285)) ^ (-652247949);
                        i10 = 1790653398;
                    }
                    break;
                case -1325607939:
                case -949454875:
                    i3 = 66863329;
                    if (C2288.m7767()) {
                        iM3169 = C0773.m3169("֡᩺") ^ i7;
                        i9 = ((iM3169 ^ i8) * (-4569)) ^ (-1446056814);
                        i10 = 493460562;
                    } else {
                        iM3169 = (i7 - C0619.m2761("۫ܿ")) * 15;
                        i9 = ((iM3169 ^ i8) * (-12943)) ^ (-45829186);
                        i10 = -259347044;
                    }
                    break;
                case -1309216130:
                case 1434853346:
                    sArr2 = f66857;
                    i5 = 54;
                    if (AbstractC0116.f1064 <= 0) {
                        iM3169 = C0773.m3169("֡᩺") ^ i7;
                        i9 = ((iM3169 ^ i8) * (-4569)) ^ (-1446056814);
                        i10 = 493460562;
                    } else {
                        iM3169 = (C0619.m2761("ۨ֡") + i8) * (-19);
                        i9 = ((iM3169 ^ i7) * (-6691)) ^ (-81095357);
                        i10 = -1642246608;
                    }
                    break;
                case -1216505475:
                case 793139630:
                    sArr = f66857;
                    if (C4282.f15546 <= 0) {
                        iM3169 = C0773.m3169("᩶ۤ") ^ i8;
                        i9 = ((iM3169 ^ i7) * (-10791)) ^ (-981759548);
                        i10 = -729189652;
                    } else {
                        iM3169 = (C0773.m3169("ᩳܶ") ^ i7) * 109;
                        i9 = ((iM3169 ^ i8) * (-29775)) ^ 1174793625;
                        i10 = -1040375335;
                    }
                    break;
                case -1159255712:
                case -1117718365:
                    i = s * s2;
                    i2 = s * s;
                    if (C0773.f2792 <= 0) {
                        iM3169 = C0619.m2761("ۨۛ") ^ i7;
                        i9 = ((iM3169 ^ i8) * (-18475)) ^ (-2120335562);
                        i10 = -235179437;
                    } else {
                        iM3169 = (C0773.m3169("ۧܺ") ^ i7) * (-55);
                        i9 = ((iM3169 ^ i8) * (-32667)) ^ (-1796347566);
                        i10 = -917128746;
                    }
                    break;
                case -1114919272:
                case -603827926:
                    if (C0487.f2131 <= 0) {
                        iM3169 = C0619.m2761("ۨۛ") ^ i7;
                        i9 = ((iM3169 ^ i8) * (-18475)) ^ (-2120335562);
                        i10 = -235179437;
                    } else {
                        iM3169 = C0619.m2761("ܿۜ") ^ i7;
                        i9 = ((iM3169 ^ i8) * (-24501)) ^ (-1739652069);
                        i10 = 403884419;
                    }
                    break;
                case -821497920:
                case 260374452:
                    C3998.m12920();
                    if (!C0619.m2763()) {
                        iM3169 = C0773.m3169("֡᩺") ^ i7;
                        i9 = ((iM3169 ^ i8) * (-4569)) ^ (-1446056814);
                        i10 = 493460562;
                    } else {
                        iM3169 = C0773.m3169("᩶ۤ") ^ i8;
                        i9 = ((iM3169 ^ i7) * (-10791)) ^ (-981759548);
                        i10 = -729189652;
                    }
                    break;
                case -782672193:
                case 575125707:
                    s = sArr[c];
                    s2 = 16354;
                    if (C1519.m5403()) {
                        iM3169 = (C0619.m2761("᩸ۖ") ^ i8) * 5;
                        i9 = ((iM3169 ^ i7) * (-15615)) ^ 1709947504;
                        i10 = -2013955405;
                    } else {
                        iM3169 = C0619.m2761("ۨۛ") ^ i7;
                        i9 = ((iM3169 ^ i8) * (-18475)) ^ (-2120335562);
                        i10 = -235179437;
                    }
                    break;
                case -729900999:
                case -29716575:
                    i4 = 14003;
                    iM3169 = (C0773.m3169("۬᩺") + i7) * 127;
                    i9 = ((iM3169 ^ i8) * (-5293)) ^ 1659411901;
                    i10 = 1856183152;
                    break;
                case -533597558:
                case 2055422203:
                    return C1343.m4939(sArr2, i5, 7, i4);
                case -379968933:
                case 1085897352:
                    if ((i2 + i3) - i >= 0) {
                        iM3169 = C0619.m2761("۟᩶") ^ i8;
                        i9 = ((iM3169 ^ i7) * 729) ^ (-1903389546);
                        i10 = -1495265305;
                    } else {
                        iM3169 = C0773.m3169("۬ۗ") ^ i8;
                        i9 = ((iM3169 ^ i7) * (-29295)) ^ 102794284;
                        i10 = 1677082547;
                    }
                    break;
                case -71194721:
                case 292067953:
                    i4 = 41200;
                    iM3169 = (C0773.m3169("۬᩺") + i7) * 127;
                    i9 = ((iM3169 ^ i8) * (-5293)) ^ 1659411901;
                    i10 = 1856183152;
                    break;
                case 597300683:
                case 1671341833:
                    C11235.m28309();
                    C0619.m2763();
                    return null;
                default:
                    if (C2419.f7754 >= 0) {
                        iM3169 = C0773.m3169("֡᩺") ^ i7;
                        i9 = ((iM3169 ^ i8) * (-4569)) ^ (-1446056814);
                        i10 = 493460562;
                    } else {
                        iM3169 = C0619.m2761("ۢ۬") ^ i8;
                        i9 = ((iM3169 ^ i7) * 21639) ^ (-1767485011);
                        i10 = 608817623;
                    }
                    break;
            }
        }
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final String getString(String str, Object... objArr) {
        int i = -514501307;
        int i2 = C0773.f2792;
        int i3 = C11235.f35427;
        int iM2761 = (C0619.m2761("ۧۛ") + i2) * 47;
        int i4 = ((iM2761 ^ i3) * (-5363)) ^ 1572371580;
        int i5 = -609374594;
        while (true) {
            i = ((((i ^ i3) * (-5415)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -1886433683:
                case -116003734:
                    C3077.m10041();
                    if (!C1343.m4943()) {
                        iM2761 = C0619.m2761("۠ۜ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-9391)) ^ 478200094;
                        i5 = 1752087511;
                    } else {
                        iM2761 = C0619.m2761("ۗ֫") ^ i2;
                        i4 = ((iM2761 ^ i3) * 8519) ^ 1586356106;
                        i5 = 1546135479;
                    }
                    break;
                case -1866887003:
                case -23719181:
                    C0950.m3785();
                    if (RunnableC3055.f9898 >= 0) {
                        iM2761 = C0619.m2761("ۗ֫") ^ i2;
                        i4 = ((iM2761 ^ i3) * 8519) ^ 1586356106;
                        i5 = 1546135479;
                    } else {
                        iM2761 = (C0619.m2761("᩺۬") + i3) * 5;
                        i4 = ((iM2761 ^ i2) * 8231) ^ (-18527025);
                        i5 = 970735711;
                    }
                    break;
                case -1772885171:
                case 764440072:
                    if (C3779.f12953 <= 0) {
                        iM2761 = (i3 - C0773.m3169("᩻ᩳ")) * (-99);
                        i4 = ((iM2761 ^ i2) * (-24017)) ^ 844337612;
                        i5 = -891799066;
                    } else {
                        iM2761 = C0773.m3169("᩺ۤ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-30037)) ^ 1087767643;
                        i5 = 1611893757;
                    }
                    break;
                case -1695320304:
                case -1094024037:
                    if (RunnableC1848.f6235) {
                        iM2761 = (C0773.m3169("᩶ۗ") ^ i2) * (-33);
                        i4 = ((iM2761 ^ i3) * 4655) ^ (-1013011902);
                        i5 = -953394805;
                    } else {
                        iM2761 = (C0773.m3169("۠ۗ") + i3) * 127;
                        i4 = ((iM2761 ^ i2) * 26715) ^ (-1843284943);
                        i5 = 1224179064;
                    }
                    break;
                case -1497576628:
                case 1870955972:
                    return m47732(getString(str), objArr);
                case -1440245997:
                case -848094744:
                    if (RunnableC1848.f6235) {
                        iM2761 = (i3 - C0773.m3169("᩻ᩳ")) * (-99);
                        i4 = ((iM2761 ^ i2) * (-24017)) ^ 844337612;
                        i5 = -891799066;
                    } else {
                        iM2761 = C0619.m2761("ۢܳ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 21431) ^ 386927804;
                        i5 = 488251900;
                    }
                    break;
                case -1395693770:
                case 1483940695:
                    if (C0619.f2439) {
                        iM2761 = C0619.m2761("ۗ֫") ^ i2;
                        i4 = ((iM2761 ^ i3) * 8519) ^ 1586356106;
                        i5 = 1546135479;
                    } else {
                        iM2761 = (C0619.m2761("ܰ۟") + i3) * (-93);
                        i4 = ((iM2761 ^ i2) * (-29109)) ^ 1832092475;
                        i5 = 156794618;
                    }
                    break;
                case -1075391395:
                case 771594033:
                    if (C11235.f35427 >= 0) {
                        iM2761 = C0619.m2761("۠ۜ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-9391)) ^ 478200094;
                        i5 = 1752087511;
                    } else {
                        iM2761 = (C0773.m3169("᩸᩻") + i2) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM2761 ^ i3) * 8965) ^ 137483066;
                        i5 = 558970072;
                    }
                    break;
                case -789766259:
                case -170029942:
                    if (C23916.f77426 <= 0) {
                        iM2761 = C0619.m2761("۠ۜ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-9391)) ^ 478200094;
                        i5 = 1752087511;
                    } else {
                        iM2761 = (C0619.m2761("᩺ᩴ") ^ i3) * (-9);
                        i4 = ((iM2761 ^ i2) * (-825)) ^ 604072801;
                        i5 = -68208877;
                    }
                    break;
                case -527042256:
                case -91466881:
                    C1146.m4231();
                    if (C3998.f13671 == 0) {
                        iM2761 = (C0773.m3169("᩶ۗ") ^ i2) * (-33);
                        i4 = ((iM2761 ^ i3) * 4655) ^ (-1013011902);
                        i5 = -953394805;
                    } else {
                        iM2761 = (C0619.m2761("᩺۬") + i3) * 5;
                        i4 = ((iM2761 ^ i2) * 8231) ^ (-18527025);
                        i5 = 970735711;
                    }
                    break;
                case -408458431:
                case 405047151:
                    C3099.m10095();
                    return null;
                case -407611071:
                case 1843210201:
                    if (C2419.f7754 >= 0) {
                        iM2761 = C0619.m2761("ۗ֫") ^ i2;
                        i4 = ((iM2761 ^ i3) * 8519) ^ 1586356106;
                        i5 = 1546135479;
                    } else {
                        iM2761 = C0773.m3169("᩸ۤ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-17097)) ^ (-1526687433);
                        i5 = 987617230;
                    }
                    break;
                case 229323035:
                case 1212191755:
                    if (C0619.f2439) {
                        iM2761 = (i3 - C0773.m3169("᩻ᩳ")) * (-99);
                        i4 = ((iM2761 ^ i2) * (-24017)) ^ 844337612;
                        i5 = -891799066;
                    } else {
                        iM2761 = (i2 - C0773.m3169("ۗܿ")) * (-119);
                        i4 = ((iM2761 ^ i3) * 2055) ^ (-744301920);
                        i5 = 575185145;
                    }
                    break;
                case 311347454:
                case 1695497400:
                    if (C2354.m7983()) {
                        iM2761 = (C0773.m3169("۫ۡ") ^ i3) * (-19);
                        i4 = ((iM2761 ^ i2) * (-9709)) ^ 125438440;
                        i5 = -1243139348;
                    } else {
                        iM2761 = (C0619.m2761("᩺۬") + i3) * 5;
                        i4 = ((iM2761 ^ i2) * 8231) ^ (-18527025);
                        i5 = 970735711;
                    }
                    break;
                case 465680470:
                case 621531476:
                    if (C23916.f77426 <= 0) {
                        iM2761 = (C0773.m3169("᩶ۗ") ^ i2) * (-33);
                        i4 = ((iM2761 ^ i3) * 4655) ^ (-1013011902);
                        i5 = -953394805;
                    } else {
                        iM2761 = C0619.m2761("ܽۘ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-28999)) ^ 1061278094;
                        i5 = -12586058;
                    }
                    break;
                default:
                    C2287.m7745();
                    iM2761 = (C0619.m2761("᩺۬") + i3) * 5;
                    i4 = ((iM2761 ^ i2) * 8231) ^ (-18527025);
                    i5 = 970735711;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0161 A[PHI: r3 r4 r5 r6 r7
      0x0161: PHI (r3v4 short) = (r3v3 short), (r3v2 short), (r3v2 short) binds: [B:52:0x015f, B:48:0x013c, B:44:0x011d] A[DONT_GENERATE, DONT_INLINE]
      0x0161: PHI (r4v4 short) = (r4v3 short), (r4v2 short), (r4v2 short) binds: [B:52:0x015f, B:48:0x013c, B:44:0x011d] A[DONT_GENERATE, DONT_INLINE]
      0x0161: PHI (r5v4 int) = (r5v2 int), (r5v3 int), (r5v2 int) binds: [B:52:0x015f, B:48:0x013c, B:44:0x011d] A[DONT_GENERATE, DONT_INLINE]
      0x0161: PHI (r6v4 short) = (r6v2 short), (r6v3 short), (r6v2 short) binds: [B:52:0x015f, B:48:0x013c, B:44:0x011d] A[DONT_GENERATE, DONT_INLINE]
      0x0161: PHI (r7v3 int) = (r7v2 int), (r7v2 int), (r7v4 int) binds: [B:52:0x015f, B:48:0x013c, B:44:0x011d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x01dd A[PHI: r2
      0x01dd: PHI (r2v4 char) = (r2v2 char), (r2v3 char), (r2v2 char) binds: [B:64:0x01db, B:56:0x018f, B:14:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0030, code lost:
    
        if (l.C3998.f13671 != 0) goto L9;
     */
    @Override // bin.mt.plugin.api.PluginContext
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String getString(java.lang.String r18) {
        /*
            Method dump skipped, instruction units count: 710
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C20889.getString(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Code duplicated, block: B:77:0x0297 A[PHI: r2 r6 r17
      0x0297: PHI (r2v3 short[]) = (r2v2 short[]), (r2v1 short[]), (r2v1 short[]) binds: [B:76:0x0295, B:64:0x020e, B:14:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x0297: PHI (r6v3 int) = (r6v1 int), (r6v2 int), (r6v1 int) binds: [B:76:0x0295, B:64:0x020e, B:14:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x0297: PHI (r17v27 int) = (r17v7 int), (r17v10 int), (r17v28 int) binds: [B:76:0x0295, B:64:0x020e, B:14:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
    
        if (l.AbstractC3624.f12429 <= 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0043, code lost:
    
        if (l.C1564.f5401 > 0) goto L10;
     */
    @Override // bin.mt.plugin.api.PluginContext
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean setClipboardText(java.lang.CharSequence r20) {
        /*
            Method dump skipped, instruction units count: 940
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C20889.setClipboardText(java.lang.CharSequence):boolean");
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final CharSequence getClipboardText() {
        CharSequence text = null;
        Object th = null;
        CharSequence charSequence = null;
        int i = -1629857035;
        int i2 = C2375.f7641;
        int i3 = C3448.f11240;
        int iM2761 = C0619.m2761("ۧۜ") ^ i3;
        int i4 = ((iM2761 ^ i2) * (-6087)) ^ (-1599485723);
        int i5 = -291801271;
        while (true) {
            i = ((((i ^ i2) * 13999) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -1950105121:
                case -961980197:
                    if (C3690.m11987()) {
                        iM2761 = C0773.m3169("۬ܺ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 10449) ^ 970966463;
                        i5 = -554165671;
                    } else {
                        iM2761 = C0619.m2761("ۛ۫") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-20067)) ^ (-367325757);
                        i5 = 1305887275;
                    }
                    break;
                case -1722171695:
                case 1234210543:
                    if (RunnableC3646.f12471) {
                        iM2761 = (C0619.m2761("۬ۡ") ^ i3) * (-65);
                        i4 = ((iM2761 ^ i2) * 17051) ^ (-1395632735);
                        i5 = 782004559;
                    } else {
                        iM2761 = (C0773.m3169("᩺۠") ^ i3) * 49;
                        i4 = ((iM2761 ^ i2) * (-22351)) ^ 216475306;
                        i5 = -2084925502;
                    }
                    break;
                case -1590194367:
                case 2010080117:
                    if (C2287.f7432 >= 0) {
                        iM2761 = (C0619.m2761("۬ۡ") ^ i3) * (-65);
                        i4 = ((iM2761 ^ i2) * 17051) ^ (-1395632735);
                        i5 = 782004559;
                    } else {
                        iM2761 = C0619.m2761("ۜܰ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-29309)) ^ (-2108428358);
                        i5 = -752724008;
                    }
                    break;
                case -1440328722:
                case 94383280:
                    if (!RunnableC0334.m2063()) {
                        iM2761 = C0619.m2761("ܽ۫") ^ i3;
                        i4 = ((iM2761 ^ i2) * 20245) ^ (-2080350020);
                        i5 = -1370508832;
                    } else {
                        iM2761 = C0773.m3169("᩵۫") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-31891)) ^ 113008502;
                        i5 = 1358167293;
                    }
                    break;
                case -1241874196:
                case -60400402:
                    if (C0862.f3233 != 0) {
                        iM2761 = C0619.m2761("ܽ۫") ^ i3;
                        i4 = ((iM2761 ^ i2) * 20245) ^ (-2080350020);
                        i5 = -1370508832;
                    } else {
                        iM2761 = C0773.m3169("۫ܽ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-27373)) ^ (-881092567);
                        i5 = -309856486;
                    }
                    break;
                case -935626245:
                case 73125049:
                    if (C3033.f9831 >= 0) {
                        iM2761 = C0773.m3169("᩵۫") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-31891)) ^ 113008502;
                        i5 = 1358167293;
                    } else {
                        iM2761 = (C0619.m2761("ᩴ֨") ^ i3) * (-9);
                        i4 = ((iM2761 ^ i2) * 20641) ^ (-1430629393);
                        i5 = -2046423298;
                    }
                    break;
                case -928411453:
                case 1111588453:
                    charSequence = "";
                    iM2761 = C0619.m2761("۠ۛ") ^ i3;
                    i4 = ((iM2761 ^ i2) * (-7723)) ^ 1014941414;
                    i5 = 603014467;
                    break;
                case -877125090:
                case 339547148:
                    return charSequence;
                case -168208190:
                case 1184133313:
                    if (C2878.m9491() <= 0) {
                        iM2761 = (C0619.m2761("֨᩹") + i3) * (-81);
                        i4 = ((iM2761 ^ i2) * 4795) ^ (-1889626397);
                        i5 = -1679486452;
                    } else {
                        iM2761 = C0619.m2761("ۜۨ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 29997) ^ (-1249890925);
                        i5 = 786448369;
                    }
                    break;
                case -135368270:
                case 956828962:
                    if (C0619.f2439) {
                        iM2761 = C0773.m3169("᩵۫") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-31891)) ^ 113008502;
                        i5 = 1358167293;
                    } else {
                        iM2761 = C0773.m3169("ۛۛ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 14709) ^ (-1428727799);
                        i5 = 1887798176;
                    }
                    break;
                case 2878162:
                case 1001558939:
                    if (C1564.f5401 <= 0) {
                        iM2761 = (C0619.m2761("֨᩹") + i3) * (-81);
                        i4 = ((iM2761 ^ i2) * 4795) ^ (-1889626397);
                        i5 = -1679486452;
                    } else {
                        iM2761 = (C0619.m2761("᩻ۖ") ^ i3) * (-69);
                        i4 = ((iM2761 ^ i2) * (-1701)) ^ (-166149232);
                        i5 = -1617966655;
                    }
                    break;
                case 114431802:
                case 948943333:
                    if (C3492.f12043 <= 0) {
                        iM2761 = C0619.m2761("ܽ۫") ^ i3;
                        i4 = ((iM2761 ^ i2) * 20245) ^ (-2080350020);
                        i5 = -1370508832;
                    } else {
                        iM2761 = (i2 - C0619.m2761("ۖۙ")) * 85;
                        i4 = ((iM2761 ^ i3) * (-23407)) ^ 426118913;
                        i5 = -164873483;
                    }
                    break;
                case 225561135:
                case 517891349:
                    return C1080.m4058(th);
                case 462317141:
                case 508299222:
                    if (!C17202.m40372()) {
                        iM2761 = C0773.m3169("۬ܺ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 10449) ^ 970966463;
                        i5 = -554165671;
                    } else {
                        iM2761 = C0619.m2761("ܽ۫") ^ i3;
                        i4 = ((iM2761 ^ i2) * 20245) ^ (-2080350020);
                        i5 = -1370508832;
                    }
                    break;
                case 607015826:
                case 2146519921:
                    C3077.m10041();
                    RunnableC3646.m11813();
                    return null;
                case 768863790:
                case 1479915403:
                    if (text == null) {
                        iM2761 = C0773.m3169("֫ۖ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-28145)) ^ (-1942831030);
                        i5 = 916413591;
                    } else {
                        charSequence = text;
                        iM2761 = C0619.m2761("۠ۛ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-7723)) ^ 1014941414;
                        i5 = 603014467;
                    }
                    break;
                case 996880554:
                case 1722528433:
                    try {
                        text = m47731().getText();
                        iM2761 = C0773.m3169("֨ۙ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-26459)) ^ 550430403;
                        i5 = -979704647;
                    } catch (Throwable th2) {
                        th = th2;
                        iM2761 = C0773.m3169("ۙ᩻") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-28387)) ^ (-35294861);
                        i5 = 1778393006;
                    }
                    break;
                case 1174858248:
                case 1938247505:
                    C2485.m8357();
                    RunnableC3646.m11813();
                    iM2761 = C0773.m3169("᩵۫") ^ i2;
                    i4 = ((iM2761 ^ i3) * (-31891)) ^ 113008502;
                    i5 = 1358167293;
                    break;
                case 1399282848:
                case 1583006152:
                    if (AbstractC0641.f2496 >= 0) {
                        iM2761 = (C0619.m2761("֨᩹") + i3) * (-81);
                        i4 = ((iM2761 ^ i2) * 4795) ^ (-1889626397);
                        i5 = -1679486452;
                    } else {
                        iM2761 = (i2 - C0773.m3169("ۙۗ")) * 123;
                        i4 = ((iM2761 ^ i3) * 21481) ^ 770950915;
                        i5 = 1363635660;
                    }
                    break;
                default:
                    if (C11235.f35427 < 0) {
                        iM2761 = (C0619.m2761("֨᩹") + i3) * (-81);
                        i4 = ((iM2761 ^ i2) * 4795) ^ (-1889626397);
                        i5 = -1679486452;
                    } else {
                        iM2761 = C0773.m3169("۬ܺ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 10449) ^ 970966463;
                        i5 = -554165671;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0269 A[PHI: r16
      0x0269: PHI (r16v8 l.ۡۗ) = (r16v2 l.ۡۗ), (r16v3 l.ۡۗ), (r16v9 l.ۡۗ) binds: [B:55:0x0267, B:51:0x0235, B:15:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009f, code lost:
    
        if (l.C1542.f5343 <= 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C20889(java.lang.String r19, java.lang.String r20, int r21, int r22, java.lang.String r23, l.AbstractC22044 r24, l.C11021 r25, l.C4130 r26, l.C4130 r27) {
        /*
            Method dump skipped, instruction units count: 932
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C20889.<init>(java.lang.String, java.lang.String, int, int, java.lang.String, l.᩷ۨᩴ, l.ۤܿۛ, l.ۘۨ֫, l.ۘۨ֫):void");
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final void openBrowser(String str) {
        int i = 2067881909;
        int i2 = C3099.f10023;
        int i3 = C1321.f4751;
        int iM3169 = (C0773.m3169("᩻ۡ") ^ i2) * 39;
        int i4 = ((iM3169 ^ i3) * (-24359)) ^ 263987099;
        int i5 = 849986957;
        while (true) {
            i = ((((i ^ i3) * 13013) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2057856973:
                case 1649623169:
                    C1783.m6232();
                    AbstractC0641.m2813();
                    iM3169 = C0619.m2761("ᩳܰ") ^ i2;
                    i4 = ((iM3169 ^ i3) * (-2441)) ^ 1668464093;
                    i5 = 1298618741;
                    break;
                case -1997882287:
                case -1435785509:
                    if (C1542.m5459() >= 0) {
                        iM3169 = (C0619.m2761("᩵ᩴ") ^ i3) * 55;
                        i4 = ((iM3169 ^ i2) * (-13597)) ^ (-368074722);
                        i5 = -1396069867;
                    } else {
                        iM3169 = C0619.m2761("ᩳ۟") ^ i2;
                        i4 = ((iM3169 ^ i3) * 29539) ^ (-1467725119);
                        i5 = 1836224970;
                    }
                    break;
                case -1984229413:
                case -1419211072:
                    if (RunnableC1848.f6235) {
                        iM3169 = (C0619.m2761("᩵ᩴ") ^ i3) * 55;
                        i4 = ((iM3169 ^ i2) * (-13597)) ^ (-368074722);
                        i5 = -1396069867;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ۗ᩸")) * (-91);
                        i4 = ((iM3169 ^ i2) * 2011) ^ (-1266154467);
                        i5 = 704910029;
                    }
                    break;
                case -1880037173:
                case -838657190:
                    if (C11235.f35427 >= 0) {
                        iM3169 = C0619.m2761("ᩳܰ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-2441)) ^ 1668464093;
                        i5 = 1298618741;
                    } else {
                        iM3169 = (C0773.m3169("۠᩷") + i2) * 27;
                        i4 = ((iM3169 ^ i3) * 21577) ^ (-1838705250);
                        i5 = -88991788;
                    }
                    break;
                case -1490937532:
                case -1157595691:
                    if (RunnableC0334.f1808 <= 0) {
                        iM3169 = C0619.m2761("ᩳܰ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-2441)) ^ 1668464093;
                        i5 = 1298618741;
                    } else {
                        iM3169 = C0773.m3169("ۛۢ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-7507)) ^ 615248259;
                        i5 = 1754996550;
                    }
                    break;
                case -631878951:
                case 1738931689:
                    if (C1542.f5343 > 0) {
                        iM3169 = C0619.m2761("ܰܳ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-11329)) ^ (-821027263);
                        i5 = 819896643;
                    } else {
                        iM3169 = C0619.m2761("ᩳܰ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-2441)) ^ 1668464093;
                        i5 = 1298618741;
                    }
                    break;
                case -538748675:
                case 1547544933:
                    if (C23916.m53419() != 0) {
                        iM3169 = (C0619.m2761("᩵ᩴ") ^ i3) * 55;
                        i4 = ((iM3169 ^ i2) * (-13597)) ^ (-368074722);
                        i5 = -1396069867;
                    } else {
                        iM3169 = C0619.m2761("ᩳܰ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-2441)) ^ 1668464093;
                        i5 = 1298618741;
                    }
                    break;
                case -502481133:
                case 355899630:
                    C3077.m10041();
                    AbstractC0641.m2813();
                    break;
                case -484451439:
                case 2092351099:
                    if (C3998.m12920()) {
                        iM3169 = C0773.m3169("᩷ᩴ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-18303)) ^ (-1618052549);
                        i5 = -214353253;
                    } else {
                        iM3169 = C0619.m2761("ᩳܰ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-2441)) ^ 1668464093;
                        i5 = 1298618741;
                    }
                    break;
                case -302430737:
                case 813188798:
                    if (C1564.f5401 <= 0) {
                        iM3169 = C0619.m2761("ܰܳ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-11329)) ^ (-821027263);
                        i5 = 819896643;
                    } else {
                        iM3169 = C0773.m3169("֨᩺") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-31323)) ^ 1880745097;
                        i5 = 1578891671;
                    }
                    break;
                case -125571266:
                case 836087548:
                    if (C2966.f9654 < 0) {
                        ThreadUtil.runOnUiThread(new RunnableC8255(2, this, str));
                    } else {
                        iM3169 = C0773.m3169("ۜܽ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 2845) ^ 372706484;
                        i5 = -2018412134;
                    }
                    break;
                case 891507072:
                case 2104297906:
                    if (C13473.m33144()) {
                        iM3169 = C0773.m3169("ۚۤ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-32353)) ^ 337514307;
                        i5 = 1166532512;
                    } else {
                        iM3169 = (C0619.m2761("᩵ᩴ") ^ i3) * 55;
                        i4 = ((iM3169 ^ i2) * (-13597)) ^ (-368074722);
                        i5 = -1396069867;
                    }
                    break;
                case 1104904021:
                case 1188934989:
                    if (C2966.f9654 >= 0) {
                        iM3169 = (C0619.m2761("᩵ᩴ") ^ i3) * 55;
                        i4 = ((iM3169 ^ i2) * (-13597)) ^ (-368074722);
                        i5 = -1396069867;
                    } else {
                        iM3169 = C0619.m2761("ܿ֨") ^ i3;
                        i4 = ((iM3169 ^ i2) * 12251) ^ 482463044;
                        i5 = -325772521;
                    }
                    break;
                case 1242374693:
                case 1739561373:
                    if (RunnableC1848.f6235) {
                        iM3169 = (C0619.m2761("᩵ᩴ") ^ i3) * 55;
                        i4 = ((iM3169 ^ i2) * (-13597)) ^ (-368074722);
                        i5 = -1396069867;
                    } else {
                        iM3169 = C0773.m3169("۟ܽ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 14167) ^ 780247764;
                        i5 = -9420804;
                    }
                    break;
                default:
                    if (RunnableC0334.f1808 <= 0) {
                        iM3169 = C0619.m2761("ᩳܰ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-2441)) ^ 1668464093;
                        i5 = 1298618741;
                    } else {
                        iM3169 = C0773.m3169("ܺ᩵") ^ i3;
                        i4 = ((iM3169 ^ i2) * 14671) ^ 727386344;
                        i5 = -993303167;
                    }
                    break;
            }
            return;
        }
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final void cancelToast() {
        int i = 975492523;
        int i2 = C0487.f2131;
        int i3 = C2702.f8586;
        int iM3169 = (C0773.m3169("᩷ܰ") + i2) * (-71);
        int i4 = ((iM3169 ^ i3) * 25935) ^ (-101520300);
        int i5 = 331056236;
        while (true) {
            i = ((((i ^ i3) * 23237) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2074345294:
                case -80208243:
                    C2702.m8876();
                    if (C1542.f5343 > 0) {
                        iM3169 = (C0619.m2761("ܺܰ") ^ i3) * 67;
                        i4 = ((iM3169 ^ i2) * 23999) ^ 1949209099;
                        i5 = 1095649692;
                    } else {
                        iM3169 = C0773.m3169("ܿ᩹") ^ i2;
                        i4 = ((iM3169 ^ i3) * 14101) ^ 1738650028;
                        i5 = -296264904;
                    }
                    break;
                case -1960607657:
                case 445682980:
                    if (C3690.f12684 <= 0) {
                        iM3169 = C0773.m3169("ܳۖ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 25427) ^ 1855636477;
                        i5 = 1009890038;
                    } else {
                        iM3169 = (i2 - C0773.m3169("᩵ۗ")) * (-21);
                        i4 = ((iM3169 ^ i3) * 17463) ^ 430229021;
                        i5 = -531371236;
                    }
                    break;
                case -1953698199:
                case -194515747:
                    if (C1321.m4852()) {
                        iM3169 = C0773.m3169("۬۟") ^ i2;
                        i4 = ((iM3169 ^ i3) * 8465) ^ (-2020999689);
                        i5 = 64392597;
                    } else {
                        iM3169 = C0619.m2761("֨᩺") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-28781)) ^ (-1105697027);
                        i5 = -1286197021;
                    }
                    break;
                case -1896282902:
                case 1830044805:
                    C17159 c17159 = C5448.f19035;
                    if (C3779.f12953 <= 0) {
                        iM3169 = C0619.m2761("᩵ۘ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 9103) ^ 1543686238;
                        i5 = 266696292;
                    } else {
                        iM3169 = C0773.m3169("ۙᩳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-27615)) ^ (-1616413523);
                        i5 = 1392417826;
                    }
                    break;
                case -1289011362:
                case 1070721651:
                    if (C3734.f12817 < 0) {
                        ThreadUtil.runOnUiThread(new RunnableC8142(1));
                    }
                    iM3169 = C0619.m2761("᩵ۘ") ^ i2;
                    i4 = ((iM3169 ^ i3) * 9103) ^ 1543686238;
                    i5 = 266696292;
                    break;
                case -1249612414:
                case 979562739:
                    C0862.m3503();
                    if (C1826.f6190 > 0) {
                        iM3169 = C0773.m3169("ܿ᩹") ^ i2;
                        i4 = ((iM3169 ^ i3) * 14101) ^ 1738650028;
                        i5 = -296264904;
                    } else {
                        iM3169 = C0773.m3169("ܳۖ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 25427) ^ 1855636477;
                        i5 = 1009890038;
                    }
                    break;
                case -879111768:
                case -226575229:
                    if (C4238.m13540() <= 0) {
                        iM3169 = C0619.m2761("᩵ۘ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 9103) ^ 1543686238;
                        i5 = 266696292;
                    } else {
                        iM3169 = (C0773.m3169("ۛ۬") ^ i2) * 67;
                        i4 = ((iM3169 ^ i3) * 25747) ^ 54203240;
                        i5 = -1852780507;
                    }
                    break;
                case -325966159:
                case -206902994:
                    if (C2310.m7813() <= 0) {
                        iM3169 = C0773.m3169("ܿ᩹") ^ i2;
                        i4 = ((iM3169 ^ i3) * 14101) ^ 1738650028;
                        i5 = -296264904;
                    } else {
                        iM3169 = (C0773.m3169("ۗ᩹") ^ i3) * 55;
                        i4 = ((iM3169 ^ i2) * (-11679)) ^ 20997044;
                        i5 = 2011903942;
                    }
                    break;
                case -214367446:
                case -129447020:
                    if (C2419.f7754 >= 0) {
                        iM3169 = (C0619.m2761("ܺܰ") ^ i3) * 67;
                        i4 = ((iM3169 ^ i2) * 23999) ^ 1949209099;
                        i5 = 1095649692;
                    } else {
                        iM3169 = (C0619.m2761("ۛܿ") + i2) * (-105);
                        i4 = ((iM3169 ^ i3) * 4915) ^ 1000585564;
                        i5 = -1773641959;
                    }
                    break;
                case -209782706:
                case 346494974:
                    if (C3734.f12817 >= 0) {
                        iM3169 = C0773.m3169("ܳۖ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 25427) ^ 1855636477;
                        i5 = 1009890038;
                    } else {
                        iM3169 = (C0619.m2761("ۨܺ") + i3) * 33;
                        i4 = ((iM3169 ^ i2) * (-30691)) ^ 795021419;
                        i5 = 83897534;
                    }
                    break;
                case -172814959:
                case 1952428873:
                    C3492.m11488();
                    C0619.m2763();
                    break;
                case -114890950:
                case 349113856:
                    C0862.m3503();
                    iM3169 = C0773.m3169("ܳۖ") ^ i3;
                    i4 = ((iM3169 ^ i2) * 25427) ^ 1855636477;
                    i5 = 1009890038;
                    break;
                case 332505163:
                case 413124662:
                    if (RunnableC3646.m11813() != 0) {
                        iM3169 = C0773.m3169("ܳۖ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 25427) ^ 1855636477;
                        i5 = 1009890038;
                    } else {
                        iM3169 = C0619.m2761("ܽۗ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-14453)) ^ (-1762731551);
                        i5 = -1173308411;
                    }
                    break;
                case 412551807:
                case 1322714472:
                    C23916.m53419();
                    if (C1542.f5343 <= 0) {
                        iM3169 = C0619.m2761("֨᩺") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-28781)) ^ (-1105697027);
                        i5 = -1286197021;
                    } else {
                        iM3169 = C0773.m3169("ܿ᩹") ^ i2;
                        i4 = ((iM3169 ^ i3) * 14101) ^ 1738650028;
                        i5 = -296264904;
                    }
                    break;
                default:
                    if (RunnableC0334.f1808 <= 0) {
                        iM3169 = C0773.m3169("ܳۖ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 25427) ^ 1855636477;
                        i5 = 1009890038;
                    } else {
                        iM3169 = (C0619.m2761("ۤ᩸") ^ i2) * 23;
                        i4 = ((iM3169 ^ i3) * 25247) ^ 77605669;
                        i5 = 149344863;
                    }
                    break;
            }
            return;
        }
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final String getPluginId() {
        return this.f66864;
    }

    /* JADX WARN: Code duplicated, block: B:118:0x045f A[PHI: r17 r19
      0x045f: PHI (r17v3 short) = (r17v2 short), (r17v4 short) binds: [B:117:0x045d, B:105:0x03d1] A[DONT_GENERATE, DONT_INLINE]
      0x045f: PHI (r19v3 short) = (r19v2 short), (r19v4 short) binds: [B:117:0x045d, B:105:0x03d1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:126:0x04ad A[PHI: r18
      0x04ad: PHI (r18v4 int) = (r18v2 int), (r18v2 int), (r18v3 int), (r18v2 int) binds: [B:125:0x04ab, B:121:0x048f, B:101:0x03ad, B:13:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:23:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:58:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:70:0x022e A[PHI: r3
      0x022e: PHI (r3v4 boolean) = (r3v3 boolean), (r3v2 boolean), (r3v2 boolean) binds: [B:68:0x0214, B:62:0x01dc, B:53:0x018b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:79:0x028e A[PHI: r12 r13 r14
      0x028e: PHI (r12v4 int) = (r12v3 int), (r12v2 int) binds: [B:78:0x028c, B:9:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x028e: PHI (r13v4 short[]) = (r13v3 short[]), (r13v2 short[]) binds: [B:78:0x028c, B:9:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x028e: PHI (r14v4 int) = (r14v3 int), (r14v2 int) binds: [B:78:0x028c, B:9:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c5, code lost:
    
        if (l.C3448.f11240 < 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e3, code lost:
    
        if (l.RunnableC1848.f6235 == false) goto L13;
     */
    @Override // bin.mt.plugin.api.PluginContext
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean setClipboardText(java.lang.CharSequence r26, java.lang.String r27) {
        /*
            Method dump skipped, instruction units count: 1554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C20889.setClipboardText(java.lang.CharSequence, java.lang.String):boolean");
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final InputStream getAssetsAsStream(String str) {
        C18300 c18300 = null;
        C8114 c8114M42640 = null;
        int i = 1998256147;
        int i2 = C1783.f6087;
        int i3 = C23916.f77426;
        int iM2761 = C0619.m2761("᩷᩶") ^ i3;
        int i4 = ((iM2761 ^ i2) * 28013) ^ 1434955957;
        int i5 = -784944091;
        while (true) {
            i = ((((i ^ i2) * 17965) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2139104528:
                case -1692732105:
                    C13473.m33144();
                    C1146.m4231();
                    iM2761 = (C0619.m2761("ۧܰ") ^ i2) * 109;
                    i4 = ((iM2761 ^ i3) * (-18939)) ^ (-532430186);
                    i5 = 662175665;
                    break;
                case -2044468913:
                case -1744413706:
                    c18300 = this.f66863.f14019;
                    if (C4238.f15451 >= 0) {
                        iM2761 = C0773.m3169("᩺᩶") ^ i2;
                        i4 = ((iM2761 ^ i3) * 30907) ^ 459430320;
                        i5 = -1800835716;
                    } else {
                        iM2761 = C0619.m2761("ۗۚ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 6159) ^ 1679970402;
                        i5 = 198740773;
                    }
                    break;
                case -1934934625:
                case 825950800:
                    c8114M42640 = C18300.m42640(c18300);
                    if (C2485.f7950 != 0) {
                        iM2761 = (C0619.m2761("᩵ۤ") ^ i3) * (-67);
                        i4 = ((iM2761 ^ i2) * (-6739)) ^ (-1610170176);
                        i5 = 207514306;
                    } else {
                        iM2761 = C0773.m3169("۬ۘ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 22083) ^ (-790861425);
                        i5 = -166719394;
                    }
                    break;
                case -1819000765:
                case 773334238:
                    if (this.f66858 != null) {
                        iM2761 = (C0773.m3169("ۛܳ") ^ i3) * (-5);
                        i4 = ((iM2761 ^ i2) * (-25625)) ^ 1018903205;
                        i5 = -817190588;
                    } else {
                        iM2761 = (C0773.m3169("ۛۧ") + i2) * (-81);
                        i4 = ((iM2761 ^ i3) * 29685) ^ (-1129518799);
                        i5 = 50784945;
                    }
                    break;
                case -1503698295:
                case -91521109:
                    if (AbstractC0641.f2496 >= 0) {
                        iM2761 = (C0619.m2761("ۧܰ") ^ i2) * 109;
                        i4 = ((iM2761 ^ i3) * (-18939)) ^ (-532430186);
                        i5 = 662175665;
                    } else {
                        iM2761 = (i2 - C0773.m3169("֨۬")) * 3;
                        i4 = ((iM2761 ^ i3) * 25877) ^ (-1989347231);
                        i5 = -1622952911;
                    }
                    break;
                case -1154658868:
                case -643258768:
                    if (C1564.f5401 > 0) {
                        iM2761 = C0773.m3169("᩺᩶") ^ i2;
                        i4 = ((iM2761 ^ i3) * 30907) ^ 459430320;
                        i5 = -1800835716;
                    } else {
                        iM2761 = C0619.m2761("ܳ᩵") ^ i3;
                        i4 = ((iM2761 ^ i2) * 19669) ^ (-2106767438);
                        i5 = 1151308987;
                    }
                    break;
                case -1138449212:
                case 2095533423:
                    this.f66858 = c8114M42640;
                    if (C0269.f1558 <= 0) {
                        iM2761 = C0773.m3169("ۧۤ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-10027)) ^ 1158715645;
                        i5 = -249956121;
                    } else {
                        iM2761 = C0619.m2761("ۚ֡") ^ i2;
                        i4 = ((iM2761 ^ i3) * 13679) ^ (-1631808788);
                        i5 = -1744534002;
                    }
                    break;
                case -1106158803:
                case -1090060990:
                    C1321.m4852();
                    return null;
                case -943142862:
                case -560051274:
                    if (C1542.m5459() >= 0) {
                        iM2761 = C0619.m2761("ܳ᩵") ^ i3;
                        i4 = ((iM2761 ^ i2) * 19669) ^ (-2106767438);
                        i5 = 1151308987;
                    } else {
                        iM2761 = (C0619.m2761("᩵ۤ") ^ i3) * (-67);
                        i4 = ((iM2761 ^ i2) * (-6739)) ^ (-1610170176);
                        i5 = 207514306;
                    }
                    break;
                case -768592385:
                case -746374982:
                    this.f66873 = new C23873(this);
                    iM2761 = (C0773.m3169("ۛܳ") ^ i3) * (-5);
                    i4 = ((iM2761 ^ i2) * (-25625)) ^ 1018903205;
                    i5 = -817190588;
                    break;
                case -513659164:
                case 59556144:
                    if (C0487.f2131 <= 0) {
                        iM2761 = (C0619.m2761("ۧܰ") ^ i2) * 109;
                        i4 = ((iM2761 ^ i3) * (-18939)) ^ (-532430186);
                        i5 = 662175665;
                    } else {
                        iM2761 = C0619.m2761("᩻۠") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-7579)) ^ 385823876;
                        i5 = 351816845;
                    }
                    break;
                case -421417280:
                case 964166192:
                    if (C0487.m2356() >= 0) {
                        iM2761 = (C0619.m2761("᩵ۤ") ^ i3) * (-67);
                        i4 = ((iM2761 ^ i2) * (-6739)) ^ (-1610170176);
                        i5 = 207514306;
                    } else {
                        iM2761 = (C0619.m2761("۬ۤ") ^ i3) * (-35);
                        i4 = ((iM2761 ^ i2) * (-3451)) ^ (-1610877786);
                        i5 = -735033897;
                    }
                    break;
                case -338253460:
                case 1048187274:
                    if (AbstractC0641.f2496 >= 0) {
                        iM2761 = C0773.m3169("ۧۤ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-10027)) ^ 1158715645;
                        i5 = -249956121;
                    } else {
                        iM2761 = (C0619.m2761("᩸ۧ") ^ i2) * 99;
                        i4 = ((iM2761 ^ i3) * (-1823)) ^ 2092535021;
                        i5 = 1434804203;
                    }
                    break;
                case -129733105:
                case 382008926:
                    return this.f66858.getAssetsAsStream(str);
                case -48625017:
                case 651374753:
                    if (RunnableC0334.f1808 <= 0) {
                        iM2761 = C0773.m3169("ۧۤ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-10027)) ^ 1158715645;
                        i5 = -249956121;
                    } else {
                        iM2761 = (C0619.m2761("᩺֫") ^ i3) * (-27);
                        i4 = ((iM2761 ^ i2) * (-21343)) ^ (-2092420231);
                        i5 = -1625535988;
                    }
                    break;
                case 229769559:
                case 2122071695:
                    if (C2375.f7641 <= 0) {
                        iM2761 = (C0619.m2761("᩵ۤ") ^ i3) * (-67);
                        i4 = ((iM2761 ^ i2) * (-6739)) ^ (-1610170176);
                        i5 = 207514306;
                    } else {
                        iM2761 = (C0619.m2761("ۧܰ") ^ i2) * 109;
                        i4 = ((iM2761 ^ i3) * (-18939)) ^ (-532430186);
                        i5 = 662175665;
                    }
                    break;
                case 683115427:
                case 1430822575:
                    if (C4238.f15451 >= 0) {
                        iM2761 = (C0619.m2761("ۧܰ") ^ i2) * 109;
                        i4 = ((iM2761 ^ i3) * (-18939)) ^ (-532430186);
                        i5 = 662175665;
                    } else {
                        iM2761 = (C0773.m3169("ۧᩴ") + i2) * (-127);
                        i4 = ((iM2761 ^ i3) * (-13517)) ^ 1594770029;
                        i5 = -1982379414;
                    }
                    break;
                default:
                    if (C17202.f56030) {
                        iM2761 = C0773.m3169("ᩳۗ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-13427)) ^ (-1572042368);
                        i5 = 963422306;
                    } else {
                        iM2761 = C0619.m2761("ܳ᩵") ^ i3;
                        i4 = ((iM2761 ^ i2) * 19669) ^ (-2106767438);
                        i5 = 1151308987;
                    }
                    break;
            }
        }
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final int getPluginSdkVersion() {
        return this.f66868;
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final int getPluginVersionCode() {
        return this.f66872;
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final String getPluginVersionName() {
        return this.f66859;
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final String getHostPackageName() {
        return C21576.m49092();
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final void openPreference(Class cls) {
        int i = -1495711013;
        int i2 = C3033.f9831;
        int i3 = RunnableC0334.f1808;
        int iM3169 = (C0773.m3169("ܶ᩻") + i2) * 41;
        int i4 = ((iM3169 ^ i3) * (-30465)) ^ 1229389080;
        int i5 = -624315303;
        while (true) {
            i = ((((i ^ i3) * (-24307)) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2083771973:
                case -1283568388:
                    if (C13473.f42873 != 0) {
                        iM3169 = (i3 - C0619.m2761("ܿܿ")) * (-57);
                        i4 = ((iM3169 ^ i2) * (-5629)) ^ 1756718146;
                        i5 = 1599699642;
                    } else {
                        iM3169 = (i3 - C0619.m2761("᩹ۗ")) * (-57);
                        i4 = ((iM3169 ^ i2) * (-12983)) ^ (-357208395);
                        i5 = 2044788201;
                    }
                    break;
                case -1779347568:
                case 1434023116:
                    C3690.m11987();
                    break;
                case -1535955432:
                case 1462410867:
                    if (C2702.f8586 > 0) {
                        iM3169 = (C0619.m2761("ۧۧ") + i2) * (-91);
                        i4 = ((iM3169 ^ i3) * (-27323)) ^ (-910808586);
                        i5 = -1479362332;
                    } else {
                        iM3169 = (C0773.m3169("ܳܳ") ^ i3) * (-97);
                        i4 = ((iM3169 ^ i2) * (-21839)) ^ (-761094665);
                        i5 = -135343747;
                    }
                    break;
                case -1331661474:
                case -245022594:
                    if (C2288.m7767()) {
                        iM3169 = (C0773.m3169("ܳܳ") ^ i3) * (-97);
                        i4 = ((iM3169 ^ i2) * (-21839)) ^ (-761094665);
                        i5 = -135343747;
                    } else {
                        iM3169 = (C0773.m3169("ۖ۠") + i3) * 97;
                        i4 = ((iM3169 ^ i2) * (-16399)) ^ 887272082;
                        i5 = 1858497420;
                    }
                    break;
                case -1328301101:
                case 1901885040:
                    if (RunnableC0334.m2063()) {
                        iM3169 = (C0773.m3169("ܳܳ") ^ i3) * (-97);
                        i4 = ((iM3169 ^ i2) * (-21839)) ^ (-761094665);
                        i5 = -135343747;
                    } else {
                        iM3169 = (C0619.m2761("᩷᩹") + i2) * (-117);
                        i4 = ((iM3169 ^ i3) * 4377) ^ (-91785122);
                        i5 = 1153618404;
                    }
                    break;
                case -1220329277:
                case -235229418:
                    if (C3998.f13671 != 0) {
                        iM3169 = (C0773.m3169("֡۟") ^ i3) * (-83);
                        i4 = ((iM3169 ^ i2) * (-19063)) ^ 127192609;
                        i5 = -128387996;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ܿܿ")) * (-57);
                        i4 = ((iM3169 ^ i2) * (-5629)) ^ 1756718146;
                        i5 = 1599699642;
                    }
                    break;
                case -783308745:
                case 1789037465:
                    C3099.m10095();
                    if (!C2023.f6737) {
                        iM3169 = (C0773.m3169("ܳܳ") ^ i3) * (-97);
                        i4 = ((iM3169 ^ i2) * (-21839)) ^ (-761094665);
                        i5 = -135343747;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ܿܿ")) * (-57);
                        i4 = ((iM3169 ^ i2) * (-5629)) ^ 1756718146;
                        i5 = 1599699642;
                    }
                    break;
                case -610916010:
                case 2010201892:
                    if (C1783.f6087 <= 0) {
                        iM3169 = (C0619.m2761("ۧۧ") + i2) * (-91);
                        i4 = ((iM3169 ^ i3) * (-27323)) ^ (-910808586);
                        i5 = -1479362332;
                    } else {
                        iM3169 = C0773.m3169("ۗ᩷") ^ i2;
                        i4 = ((iM3169 ^ i3) * 19671) ^ (-597597993);
                        i5 = -2140012652;
                    }
                    break;
                case 77780932:
                case 819206517:
                    if (C17202.f56030) {
                        iM3169 = C0773.m3169("ۤ۟") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-19625)) ^ 253955728;
                        i5 = -1647303719;
                    } else {
                        iM3169 = (C0773.m3169("֡۟") ^ i3) * (-83);
                        i4 = ((iM3169 ^ i2) * (-19063)) ^ 127192609;
                        i5 = -128387996;
                    }
                    break;
                case 115436846:
                case 1897430814:
                    if (C20932.f66974 <= 0) {
                        iM3169 = (C0773.m3169("֡۟") ^ i3) * (-83);
                        i4 = ((iM3169 ^ i2) * (-19063)) ^ 127192609;
                        i5 = -128387996;
                    } else {
                        iM3169 = (i2 - C0773.m3169("֨ۘ")) * 115;
                        i4 = ((iM3169 ^ i3) * 20455) ^ 2133959317;
                        i5 = -935128342;
                    }
                    break;
                case 224430506:
                case 1913445384:
                    if (C1542.f5343 <= 0) {
                        iM3169 = (C0773.m3169("ۧۛ") + i2) * (-37);
                        i4 = ((iM3169 ^ i3) * 3629) ^ (-392990156);
                        i5 = -1527495972;
                    } else {
                        iM3169 = C0773.m3169("ۤܶ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-3439)) ^ (-2039203068);
                        i5 = 1155748973;
                    }
                    break;
                case 438466528:
                case 831531373:
                    if (C17202.f56030) {
                        iM3169 = (C0773.m3169("ܽ۫") + i3) * 7;
                        i4 = ((iM3169 ^ i2) * (-14473)) ^ (-1767915176);
                        i5 = 288295053;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ܿܿ")) * (-57);
                        i4 = ((iM3169 ^ i2) * (-5629)) ^ 1756718146;
                        i5 = 1599699642;
                    }
                    break;
                case 463631894:
                case 1505418897:
                    AbstractC0641.m2813();
                    C2354.m7983();
                    iM3169 = (C0773.m3169("ܳܳ") ^ i3) * (-97);
                    i4 = ((iM3169 ^ i2) * (-21839)) ^ (-761094665);
                    i5 = -135343747;
                    break;
                case 1869923130:
                case 1873621694:
                    if (!C0619.m2763()) {
                        ThreadUtil.runOnUiThread(new RunnableC25309(1, this, cls));
                    }
                    iM3169 = (C0773.m3169("ۧۛ") + i2) * (-37);
                    i4 = ((iM3169 ^ i3) * 3629) ^ (-392990156);
                    i5 = -1527495972;
                    break;
                default:
                    if (C3033.m9845() <= 0) {
                        iM3169 = (i3 - C0619.m2761("ܿܿ")) * (-57);
                        i4 = ((iM3169 ^ i2) * (-5629)) ^ 1756718146;
                        i5 = 1599699642;
                    } else {
                        iM3169 = C0619.m2761("ܶܿ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-21033)) ^ 206322739;
                        i5 = 1554155935;
                    }
                    break;
            }
            return;
        }
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final SharedPreferences getPreferences() {
        if (this.f66866 == null) {
            synchronized (this) {
                if (this.f66866 == null) {
                    this.f66866 = C23522.m52721((String) this.f66867.f34801);
                }
            }
        }
        return this.f66866;
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final String getLanguage() {
        return C5448.m16282();
    }

    /* JADX WARN: Code duplicated, block: B:76:0x02bc A[PHI: r7 r16 r17 r18
      0x02bc: PHI (r7v3 short) = (r7v1 short), (r7v2 short), (r7v1 short) binds: [B:75:0x02ba, B:66:0x0262, B:18:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x02bc: PHI (r16v22 int) = (r16v5 int), (r16v7 int), (r16v23 int) binds: [B:75:0x02ba, B:66:0x0262, B:18:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x02bc: PHI (r17v16 short[]) = (r17v2 short[]), (r17v3 short[]), (r17v17 short[]) binds: [B:75:0x02ba, B:66:0x0262, B:18:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x02bc: PHI (r18v15 int) = (r18v0 int), (r18v2 int), (r18v16 int) binds: [B:75:0x02ba, B:66:0x0262, B:18:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // bin.mt.plugin.api.PluginContext
    public final LocalString getFileLocalString(File file, String str) {
        int iM3169;
        int i;
        int iM31610;
        int i2;
        int iM31611;
        int i3;
        C9086 c9086 = null;
        Reference reference = null;
        C17159 c17159 = null;
        C17159 c171510 = null;
        short[] sArr = null;
        short s = 0;
        int i4 = 0;
        short s2 = 0;
        int i5 = 0;
        int i6 = -767677365;
        int i7 = C1542.f5343;
        int i8 = C2419.f7754;
        int iM31612 = (i8 - C0773.m3169("۟᩸")) * 119;
        int i9 = ((iM31612 ^ i7) * 26575) ^ 459163228;
        int i10 = iM31612 ^ 2064836735;
        while (true) {
            int i11 = ((((i6 ^ i7) * 3203) >> 31) & i9) ^ i10;
            switch (i11) {
                case -2010354651:
                case -805349685:
                    c17159 = null;
                    iM31610 = C0619.m2761("۫ᩴ") ^ i7;
                    i9 = ((iM31610 ^ i8) * 15737) ^ 1515353033;
                    i2 = 249750701;
                    i10 = iM31610 ^ i2;
                    i6 = i11;
                    sArr = sArr;
                    i4 = i4;
                    break;
                case -1924988048:
                case -538977259:
                    i5 = 3092;
                    iM31610 = (i7 - C0773.m3169("ۛ᩷")) * (-17);
                    i9 = ((iM31610 ^ i8) * 8679) ^ (-1174911796);
                    i2 = -1643113778;
                    i10 = iM31610 ^ i2;
                    i6 = i11;
                    sArr = sArr;
                    i4 = i4;
                    break;
                case -1914465735:
                case -1052612403:
                    if (C3448.f11240 >= 0) {
                        sArr = sArr;
                        i11 = i11;
                        int iM31613 = C0773.m3169("ۤۘ") ^ i8;
                        i9 = ((iM31613 ^ i7) * 24203) ^ 1430881132;
                        i10 = iM31613 ^ 1143853634;
                        i6 = i11;
                        sArr = sArr;
                    }
                    sArr = sArr;
                    i11 = i11;
                    iM3169 = C0619.m2761("ۗ᩶") ^ i7;
                    i9 = (-693737369) ^ ((iM3169 ^ i8) * 7861);
                    i = 1360348930;
                    i10 = i ^ iM3169;
                    i6 = i11;
                    sArr = sArr;
                    break;
                case -1781213121:
                case -1092869473:
                    c17159 = (C17159) reference.get();
                    iM31610 = C0619.m2761("۫ᩴ") ^ i7;
                    i9 = ((iM31610 ^ i8) * 15737) ^ 1515353033;
                    i2 = 249750701;
                    i10 = iM31610 ^ i2;
                    i6 = i11;
                    sArr = sArr;
                    i4 = i4;
                    break;
                case -1513176618:
                case -866463812:
                    if (C4282.f15546 <= 0) {
                        sArr = sArr;
                        i11 = i11;
                        iM3169 = C0619.m2761("ۗ᩶") ^ i7;
                        i9 = (-693737369) ^ ((iM3169 ^ i8) * 7861);
                        i = 1360348930;
                        i10 = i ^ iM3169;
                        i6 = i11;
                        sArr = sArr;
                    } else {
                        sArr = sArr;
                        i4 = i4;
                        i11 = i11;
                        iM31610 = C0619.m2761("۬ᩴ") ^ i8;
                        i9 = ((iM31610 ^ i7) * 21319) ^ 1457499817;
                        i2 = -1639701220;
                        i10 = iM31610 ^ i2;
                        i6 = i11;
                        sArr = sArr;
                        i4 = i4;
                    }
                    break;
                case -1501149450:
                case 1199821928:
                    sArr = sArr;
                    i4 = i4;
                    i11 = i11;
                    if (c17159 == null) {
                        iM31610 = (C0619.m2761("۠ܶ") ^ i8) * (-21);
                        i9 = ((iM31610 ^ i7) * (-5387)) ^ (-1517519057);
                        i2 = 880728256;
                    } else {
                        c171510 = c17159;
                        iM31610 = (C0619.m2761("ۡ۬") + i7) * 33;
                        i9 = ((iM31610 ^ i8) * (-27991)) ^ (-1633824777);
                        i2 = -2041697457;
                    }
                    i10 = iM31610 ^ i2;
                    i6 = i11;
                    sArr = sArr;
                    i4 = i4;
                    break;
                case -1228664066:
                case 1098475560:
                    AbstractC0116.m1243();
                    if (C1080.f3865 >= 0) {
                        i11 = i11;
                        int iM2761 = (i7 - C0619.m2761("֡ۨ")) * (-121);
                        i9 = (-1570447157) ^ ((iM2761 ^ i8) * (-13977));
                        i10 = (-591234342) ^ iM2761;
                        i6 = i11;
                    } else {
                        sArr = sArr;
                        i11 = i11;
                        iM3169 = C0619.m2761("ۗ᩶") ^ i7;
                        i9 = (-693737369) ^ ((iM3169 ^ i8) * 7861);
                        i = 1360348930;
                        i10 = i ^ iM3169;
                        i6 = i11;
                        sArr = sArr;
                    }
                    break;
                case -1123064195:
                case 1471738292:
                    sArr = sArr;
                    i11 = i11;
                    i4 = s * 21288;
                    s2 = 5322;
                    if (C0619.m2763()) {
                        iM3169 = C0619.m2761("ۗ᩶") ^ i7;
                        i9 = (-693737369) ^ ((iM3169 ^ i8) * 7861);
                        i = 1360348930;
                    } else {
                        iM3169 = (C0773.m3169("ۜۨ") + i7) * 11;
                        i9 = (-197519856) ^ ((iM3169 ^ i8) * (-2525));
                        i = -410585244;
                    }
                    i10 = i ^ iM3169;
                    i6 = i11;
                    sArr = sArr;
                    break;
                case -1098774242:
                case 267906276:
                    sArr = sArr;
                    i4 = i4;
                    i11 = i11;
                    c9086 = this.f66869;
                    reference = (Reference) c9086.get(str);
                    if (reference != null) {
                        iM31610 = (C0619.m2761("ۡۤ") + i8) * (-113);
                        i9 = ((iM31610 ^ i7) * (-25477)) ^ 26857493;
                        i2 = 2082358332;
                    } else {
                        iM31610 = (i8 - C0619.m2761("ۜ۠")) * 109;
                        i9 = ((iM31610 ^ i7) * 6327) ^ (-1735341792);
                        i2 = -1833722709;
                    }
                    i10 = iM31610 ^ i2;
                    i6 = i11;
                    sArr = sArr;
                    i4 = i4;
                    break;
                case -1061533812:
                case 811793914:
                    sArr = sArr;
                    i4 = i4;
                    i11 = i11;
                    int i12 = s + s2;
                    if ((i12 * i12) - i4 < 0) {
                        iM31610 = C0619.m2761("ۙ᩸") ^ i7;
                        i9 = ((iM31610 ^ i8) * (-2161)) ^ (-1662926734);
                        i2 = 386623160;
                    } else {
                        iM31610 = C0773.m3169("ۨ۫") ^ i8;
                        i9 = ((iM31610 ^ i7) * 8039) ^ 645275142;
                        i2 = 1470677148;
                    }
                    i10 = iM31610 ^ i2;
                    i6 = i11;
                    sArr = sArr;
                    i4 = i4;
                    break;
                case -806607442:
                case 1584023595:
                    i5 = 44141;
                    iM31610 = (i7 - C0773.m3169("ۛ᩷")) * (-17);
                    i9 = ((iM31610 ^ i8) * 8679) ^ (-1174911796);
                    i2 = -1643113778;
                    i10 = iM31610 ^ i2;
                    i6 = i11;
                    sArr = sArr;
                    i4 = i4;
                    break;
                case -301084253:
                case -96185292:
                    StringBuilder sb = new StringBuilder();
                    if (C23916.m53419() == 0) {
                        i11 = i11;
                        C3779.m12258(sb, file.getPath());
                        if (C2419.m8174() < 0) {
                            short[] sArr2 = f66857;
                            sArr = sArr;
                            if (RunnableC3055.f9898 < 0) {
                                i4 = i4;
                                String strM8166 = C2419.m8166(sArr2, 52, 1, i5);
                                if (C1321.f4751 < 0) {
                                    C3779.m12258(sb, strM8166);
                                    C3779.m12258(sb, str);
                                    String strM6952 = C2023.m6952(sb);
                                    if (C3998.f13671 == 0) {
                                        C5973 c5973 = new C5973(file);
                                        if (C20932.f66974 > 0) {
                                            C17159 c171511 = new C17159(this, str, strM6952, c5973);
                                            c9086.put(str, new SoftReference(c171511));
                                            c171510 = c171511;
                                            iM31610 = (C0619.m2761("ۡ۬") + i7) * 33;
                                            i9 = ((iM31610 ^ i8) * (-27991)) ^ (-1633824777);
                                            i2 = -2041697457;
                                            i10 = iM31610 ^ i2;
                                            i6 = i11;
                                            sArr = sArr;
                                            i4 = i4;
                                        } else {
                                            i4 = i4;
                                        }
                                    } else {
                                        iM31610 = C0619.m2761("۬ᩴ") ^ i8;
                                        i9 = ((iM31610 ^ i7) * 21319) ^ 1457499817;
                                        i2 = -1639701220;
                                        i10 = iM31610 ^ i2;
                                        i6 = i11;
                                        sArr = sArr;
                                        i4 = i4;
                                    }
                                } else {
                                    sArr = sArr;
                                    iM31611 = C0619.m2761("ۖۚ") ^ i8;
                                    i9 = (-1052185200) ^ ((iM31611 ^ i7) * 32659);
                                    i3 = 1051920816;
                                    i10 = i3 ^ iM31611;
                                    i6 = i11;
                                    i4 = i4;
                                }
                            } else {
                                int iM31614 = C0773.m3169("ۤۘ") ^ i8;
                                i9 = ((iM31614 ^ i7) * 24203) ^ 1430881132;
                                i10 = iM31614 ^ 1143853634;
                                i6 = i11;
                                sArr = sArr;
                            }
                        } else {
                            int iM2762 = (i7 - C0619.m2761("֡ۨ")) * (-121);
                            i9 = (-1570447157) ^ ((iM2762 ^ i8) * (-13977));
                            i10 = (-591234342) ^ iM2762;
                            i6 = i11;
                        }
                    } else {
                        sArr = sArr;
                        i11 = i11;
                    }
                    iM3169 = C0619.m2761("ۗ᩶") ^ i7;
                    i9 = (-693737369) ^ ((iM3169 ^ i8) * 7861);
                    i = 1360348930;
                    i10 = i ^ iM3169;
                    i6 = i11;
                    sArr = sArr;
                    break;
                case -201847688:
                case 1589239626:
                    return c171510;
                case -75431077:
                case 410282321:
                    C3734.m12152();
                    sArr = sArr;
                    i4 = i4;
                    i11 = i11;
                    iM31610 = C0619.m2761("۬ᩴ") ^ i8;
                    i9 = ((iM31610 ^ i7) * 21319) ^ 1457499817;
                    i2 = -1639701220;
                    i10 = iM31610 ^ i2;
                    i6 = i11;
                    sArr = sArr;
                    i4 = i4;
                    break;
                case 338251160:
                case 1836840929:
                    sArr = sArr;
                    i4 = i4;
                    i11 = i11;
                    if (C0773.f2792 <= 0) {
                        iM31610 = C0619.m2761("۬ᩴ") ^ i8;
                        i9 = ((iM31610 ^ i7) * 21319) ^ 1457499817;
                        i2 = -1639701220;
                    } else {
                        iM31610 = (C0773.m3169("ۤۚ") ^ i8) * (-81);
                        i9 = ((iM31610 ^ i7) * (-15105)) ^ (-658409999);
                        i2 = -1951612435;
                    }
                    i10 = iM31610 ^ i2;
                    i6 = i11;
                    sArr = sArr;
                    i4 = i4;
                    break;
                case 722815051:
                case 729161026:
                    sArr = sArr;
                    i4 = i4;
                    i11 = i11;
                    s = sArr[51];
                    if (C3779.m12264()) {
                        iM31610 = C0773.m3169("۬ܶ") ^ i8;
                        i9 = ((iM31610 ^ i7) * 17665) ^ 13135781;
                        i2 = -540021260;
                    } else {
                        iM31610 = C0619.m2761("۬ᩴ") ^ i8;
                        i9 = ((iM31610 ^ i7) * 21319) ^ 1457499817;
                        i2 = -1639701220;
                    }
                    i10 = iM31610 ^ i2;
                    i6 = i11;
                    sArr = sArr;
                    i4 = i4;
                    break;
                case 980087744:
                case 1508065961:
                    i4 = i4;
                    i11 = i11;
                    sArr = f66857;
                    if (C3492.f12043 <= 0) {
                        iM31611 = C0619.m2761("ۖۚ") ^ i8;
                        i9 = (-1052185200) ^ ((iM31611 ^ i7) * 32659);
                        i3 = 1051920816;
                    } else {
                        iM31611 = (C0773.m3169("ۙᩴ") + i7) * (-67);
                        i9 = 116939290 ^ ((iM31611 ^ i8) * (-22765));
                        i3 = -533106240;
                    }
                    i10 = i3 ^ iM31611;
                    i6 = i11;
                    i4 = i4;
                    break;
                default:
                    RunnableC3646.m11813();
                    C2375.m8065();
                    return null;
            }
        }
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final String getCountry() {
        return C5448.m16286();
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final String getLanguageCountry() {
        return C5448.m16288();
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final String[] getStringArray(String... strArr) {
        int i = 0;
        String string = null;
        int i2 = 1102141729;
        int i3 = C1564.f5401;
        int i4 = C1519.f5300;
        int iM3169 = C0773.m3169("ۢ᩶") ^ i4;
        int i5 = ((iM3169 ^ i3) * 24145) ^ (-416558852);
        int i6 = 905881564;
        while (true) {
            i2 = ((((i2 ^ i3) * (-25713)) >> 31) & i5) ^ (iM3169 ^ i6);
            switch (i2) {
                case -2054111223:
                case -1886955932:
                    return strArr;
                case -1664661416:
                case 1161928196:
                    if (C1321.f4751 >= 0) {
                        iM3169 = C0619.m2761("ܿۚ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 22017) ^ (-853818634);
                        i6 = -1206870524;
                    } else {
                        iM3169 = C0773.m3169("ۖ۫") ^ i4;
                        i5 = ((iM3169 ^ i3) * 9791) ^ (-624208054);
                        i6 = 890346622;
                    }
                    break;
                case -1576538949:
                case -1256845014:
                    if (AbstractC3624.f12429 > 0) {
                        iM3169 = C0619.m2761("ܿۚ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 22017) ^ (-853818634);
                        i6 = -1206870524;
                    } else {
                        iM3169 = C0773.m3169("۠ܶ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 11869) ^ 1664071725;
                        i6 = -1804642183;
                    }
                    break;
                case -1517097674:
                case -901497550:
                    if (C1080.f3865 >= 0) {
                        iM3169 = C0773.m3169("᩸ۛ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 22705) ^ 1471023790;
                        i6 = 1785444982;
                    } else {
                        iM3169 = C0619.m2761("ܿۚ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 22017) ^ (-853818634);
                        i6 = -1206870524;
                    }
                    break;
                case -1494726936:
                case 1715832580:
                    if (RunnableC3646.f12471) {
                        iM3169 = C0773.m3169("᩸ۛ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 22705) ^ 1471023790;
                        i6 = 1785444982;
                    } else {
                        iM3169 = C0773.m3169("ۛۧ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-31543)) ^ 132572571;
                        i6 = 1540072701;
                    }
                    break;
                case -1474382799:
                case 786300811:
                    strArr[i] = string;
                    if (C13473.f42873 != 0) {
                        iM3169 = (i4 - C0773.m3169("֨ۧ")) * (-41);
                        i5 = ((iM3169 ^ i3) * 23899) ^ (-215077653);
                        i6 = 35929682;
                    } else {
                        iM3169 = (i4 - C0619.m2761("ۜۨ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i5 = ((iM3169 ^ i3) * (-25171)) ^ 864254758;
                        i6 = 483701768;
                    }
                    break;
                case -1433798390:
                case -1277523341:
                    if (C1826.f6190 <= 0) {
                        iM3169 = (i4 - C0773.m3169("֨ۧ")) * (-41);
                        i5 = ((iM3169 ^ i3) * 23899) ^ (-215077653);
                        i6 = 35929682;
                    } else {
                        iM3169 = C0773.m3169("ۚ᩷") ^ i4;
                        i5 = ((iM3169 ^ i3) * 29103) ^ 1252747443;
                        i6 = 2039887882;
                    }
                    break;
                case -1286282951:
                case -361769324:
                    i = 0;
                    iM3169 = C0619.m2761("֨۠") ^ i4;
                    i5 = ((iM3169 ^ i3) * (-23199)) ^ 59097338;
                    i6 = -738870118;
                    break;
                case -1235506845:
                case 1925416893:
                    i++;
                    iM3169 = C0619.m2761("֨۠") ^ i4;
                    i5 = ((iM3169 ^ i3) * (-23199)) ^ 59097338;
                    i6 = -738870118;
                    break;
                case -871326441:
                case -806484451:
                    string = getString(strArr[i]);
                    if (C17202.f56030) {
                        iM3169 = C0773.m3169("۠۫") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-30745)) ^ (-1005220245);
                        i6 = -240929857;
                    } else {
                        iM3169 = C0773.m3169("᩸ۛ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 22705) ^ 1471023790;
                        i6 = 1785444982;
                    }
                    break;
                case -862325421:
                case 210475677:
                    if (i < strArr.length) {
                        iM3169 = (C0619.m2761("᩻᩻") ^ i3) * (-33);
                        i5 = ((iM3169 ^ i4) * (-18955)) ^ 455443600;
                        i6 = -20583462;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ۡܰ")) * (-125);
                        i5 = ((iM3169 ^ i4) * 3923) ^ 229639332;
                        i6 = -1580028475;
                    }
                    break;
                case -822703741:
                case -285710948:
                    C3033.m9845();
                    return null;
                case -715229966:
                case 1072356712:
                    if (C13473.f42873 != 0) {
                        iM3169 = (i4 - C0773.m3169("֨ۧ")) * (-41);
                        i5 = ((iM3169 ^ i3) * 23899) ^ (-215077653);
                        i6 = 35929682;
                    } else {
                        iM3169 = C0773.m3169("ܿۨ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 427) ^ (-1513207506);
                        i6 = 1822752197;
                    }
                    break;
                case -360654793:
                case 1252286739:
                    if (RunnableC3055.f9898 >= 0) {
                        iM3169 = C0773.m3169("۠ܶ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 11869) ^ 1664071725;
                        i6 = -1804642183;
                    } else {
                        iM3169 = C0619.m2761("֡ᩴ") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-21223)) ^ 60879894;
                        i6 = -876024118;
                    }
                    break;
                case 347518470:
                case 2075701879:
                    if (C0862.m3503()) {
                        iM3169 = (C0773.m3169("ᩴ᩺") ^ i3) * 23;
                        i5 = ((iM3169 ^ i4) * 15427) ^ 1048267363;
                        i6 = 700445797;
                    } else {
                        iM3169 = C0773.m3169("۠ܶ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 11869) ^ 1664071725;
                        i6 = -1804642183;
                    }
                    break;
                case 559717922:
                case 856216153:
                    if (C2354.f7599 >= 0) {
                        iM3169 = C0773.m3169("᩸ۛ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 22705) ^ 1471023790;
                        i6 = 1785444982;
                    } else {
                        iM3169 = (C0773.m3169("ۡ᩶") + i3) * (-99);
                        i5 = ((iM3169 ^ i4) * 21215) ^ (-1745275019);
                        i6 = 169888912;
                    }
                    break;
                case 649795352:
                case 922495058:
                    C1321.m4852();
                    if (C3492.f12043 <= 0) {
                        iM3169 = (i3 - C0773.m3169("᩺֫")) * 89;
                        i5 = ((iM3169 ^ i4) * 28199) ^ (-1270933441);
                        i6 = 943507652;
                    } else {
                        iM3169 = C0773.m3169("۠ܶ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 11869) ^ 1664071725;
                        i6 = -1804642183;
                    }
                    break;
                case 719604134:
                case 1075649329:
                    if (AbstractC0641.f2496 >= 0) {
                        iM3169 = (i3 - C0773.m3169("᩺֫")) * 89;
                        i5 = ((iM3169 ^ i4) * 28199) ^ (-1270933441);
                        i6 = 943507652;
                    } else {
                        iM3169 = (C0773.m3169("ۖ۟") + i3) * 27;
                        i5 = ((iM3169 ^ i4) * (-13619)) ^ (-1024973579);
                        i6 = -772719492;
                    }
                    break;
                default:
                    C11235.m28309();
                    AbstractC0641.m2813();
                    iM3169 = C0773.m3169("۠ܶ") ^ i3;
                    i5 = ((iM3169 ^ i4) * 11869) ^ 1664071725;
                    i6 = -1804642183;
                    break;
            }
        }
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final void log(Throwable th) {
        String str = null;
        int i = -1972311253;
        int i2 = C3779.f12953;
        int i3 = AbstractC0641.f2496;
        int iM3169 = (i2 - C0773.m3169("᩶ۢ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
        int i4 = ((iM3169 ^ i3) * (-32619)) ^ 2091263897;
        int i5 = 63863919;
        while (true) {
            i = ((((i ^ i3) * 11321) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2145807028:
                case 900606168:
                    if (RunnableC0334.f1808 <= 0) {
                        iM3169 = C0619.m2761("ۧ۫") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-10391)) ^ 316935158;
                        i5 = -723559805;
                    } else {
                        iM3169 = (C0773.m3169("ۚۛ") + i3) * 115;
                        i4 = ((iM3169 ^ i2) * (-22659)) ^ 1707435623;
                        i5 = 1314790944;
                    }
                    break;
                case -2138010223:
                case -988172507:
                    if (C2375.m8065() > 0) {
                        iM3169 = C0619.m2761("ۜ֨") ^ i2;
                        i4 = ((iM3169 ^ i3) * 19753) ^ (-332329361);
                        i5 = -595661068;
                    } else {
                        iM3169 = C0619.m2761("ۘܿ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 31525) ^ (-102776529);
                        i5 = -898866590;
                    }
                    break;
                case -2026013164:
                case 2087848213:
                    if (C1783.m6232()) {
                        iM3169 = (i2 - C0773.m3169("ᩴ۫")) * 27;
                        i4 = ((iM3169 ^ i3) * 21087) ^ 444449663;
                        i5 = -1364251741;
                    } else {
                        iM3169 = C0619.m2761("ۘܿ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 31525) ^ (-102776529);
                        i5 = -898866590;
                    }
                    break;
                case -1771858758:
                case 1025850649:
                    if (C2966.f9654 >= 0) {
                        iM3169 = C0619.m2761("ۜ֨") ^ i2;
                        i4 = ((iM3169 ^ i3) * 19753) ^ (-332329361);
                        i5 = -595661068;
                    } else {
                        iM3169 = C0619.m2761("ۗܶ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 11971) ^ 2050682587;
                        i5 = 586653923;
                    }
                    break;
                case -1444045777:
                case 1312524657:
                    if (C2288.f7433 > 0) {
                        iM3169 = C0619.m2761("ۜ֨") ^ i2;
                        i4 = ((iM3169 ^ i3) * 19753) ^ (-332329361);
                        i5 = -595661068;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ۡ۟")) * 33;
                        i4 = ((iM3169 ^ i2) * 885) ^ (-1007730306);
                        i5 = 1710979525;
                    }
                    break;
                case -1101751661:
                case -470491085:
                    RunnableC3055.m9933();
                    C2354.m7983();
                    break;
                case -871032058:
                case -770907856:
                    if (AbstractC0116.f1064 <= 0) {
                        iM3169 = C0619.m2761("ۜ֨") ^ i2;
                        i4 = ((iM3169 ^ i3) * 19753) ^ (-332329361);
                        i5 = -595661068;
                    } else {
                        iM3169 = C0773.m3169("ۨ᩸") ^ i2;
                        i4 = ((iM3169 ^ i3) * 32385) ^ (-1085552868);
                        i5 = -675751258;
                    }
                    break;
                case -269982397:
                case 1577718677:
                    C2966.m9664();
                    iM3169 = C0619.m2761("ۘܿ") ^ i2;
                    i4 = ((iM3169 ^ i3) * 31525) ^ (-102776529);
                    i5 = -898866590;
                    break;
                case -169448050:
                case 1321787433:
                    if (C2419.f7754 < 0) {
                        iM3169 = C0619.m2761("ۧ۫") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-10391)) ^ 316935158;
                        i5 = -723559805;
                    } else {
                        iM3169 = C0619.m2761("ۘܿ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 31525) ^ (-102776529);
                        i5 = -898866590;
                    }
                    break;
                case -31427840:
                case 217516616:
                    if (C1564.f5401 <= 0) {
                        iM3169 = C0619.m2761("ۧ۫") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-10391)) ^ 316935158;
                        i5 = -723559805;
                    } else {
                        iM3169 = C0773.m3169("᩻۬") ^ i3;
                        i4 = ((iM3169 ^ i2) * 27691) ^ 365360420;
                        i5 = 481639065;
                    }
                    break;
                case 191832810:
                case 1331532288:
                    if (C3448.f11240 >= 0) {
                        iM3169 = C0619.m2761("ۧ۫") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-10391)) ^ 316935158;
                        i5 = -723559805;
                    } else {
                        iM3169 = C0773.m3169("ۤۜ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 4011) ^ 767724544;
                        i5 = -1082433198;
                    }
                    break;
                case 233254517:
                case 1919767524:
                    if (C0950.m3785() != 0) {
                        iM3169 = (i3 - C0619.m2761("᩶᩸")) * (-55);
                        i4 = ((iM3169 ^ i2) * (-6413)) ^ (-1909862548);
                        i5 = 1659452865;
                    } else {
                        iM3169 = (C0619.m2761("᩺᩹") ^ i2) * 67;
                        i4 = ((iM3169 ^ i3) * (-21345)) ^ 856920606;
                        i5 = -558138442;
                    }
                    break;
                case 245481354:
                case 2037437679:
                    if (C1343.f4799 != 0) {
                        iM3169 = C0619.m2761("ۘܿ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 31525) ^ (-102776529);
                        i5 = -898866590;
                    } else {
                        iM3169 = C0773.m3169("᩶۫") ^ i3;
                        i4 = ((iM3169 ^ i2) * 25721) ^ (-228449304);
                        i5 = 233558227;
                    }
                    break;
                case 269141961:
                case 331531341:
                    str = this.f66864;
                    if (C13473.m33144()) {
                        iM3169 = C0619.m2761("ᩳ᩸") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-5941)) ^ (-1071201508);
                        i5 = 1683298610;
                    } else {
                        iM3169 = (i3 - C0619.m2761("᩶᩸")) * (-55);
                        i4 = ((iM3169 ^ i2) * (-6413)) ^ (-1909862548);
                        i5 = 1659452865;
                    }
                    break;
                case 1026408429:
                case 1144679940:
                    if (C0269.m1775() <= 0) {
                        iM3169 = C0619.m2761("ۧ۫") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-10391)) ^ 316935158;
                        i5 = -723559805;
                    } else {
                        iM3169 = (C0619.m2761("ᩳܳ") + i3) * (-83);
                        i4 = ((iM3169 ^ i2) * (-32615)) ^ 313435609;
                        i5 = -2101025851;
                    }
                    break;
                default:
                    C5448.m16280(str, null, th);
                    break;
            }
            return;
        }
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final String getPluginName() {
        String str = null;
        String strM7742 = null;
        int i = -506661899;
        int i2 = C1519.f5300;
        int i3 = C3690.f12684;
        int iM3169 = (C0773.m3169("ܰܰ") + i2) * (-77);
        int i4 = ((iM3169 ^ i3) * (-8489)) ^ 486355465;
        int i5 = -1617066402;
        while (true) {
            i = ((((i ^ i3) * 12289) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2140244036:
                case 1587808303:
                    C3492.m11488();
                    C1564.m5509();
                    iM3169 = (i3 - C0619.m2761("ܳܰ")) * 15;
                    i4 = ((iM3169 ^ i2) * 31535) ^ (-1814443305);
                    i5 = -1859362285;
                    break;
                case -1930512346:
                case 426826976:
                    if (RunnableC0334.f1808 <= 0) {
                        iM3169 = (i3 - C0619.m2761("ܳܰ")) * 15;
                        i4 = ((iM3169 ^ i2) * 31535) ^ (-1814443305);
                        i5 = -1859362285;
                    } else {
                        iM3169 = (C0773.m3169("ۨ᩵") ^ i3) * 59;
                        i4 = ((iM3169 ^ i2) * 5209) ^ (-611608717);
                        i5 = 382102996;
                    }
                    break;
                case -1883363826:
                case 1681621466:
                    if (C2354.f7599 >= 0) {
                        iM3169 = C0619.m2761("֨ۢ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 32139) ^ 661025373;
                        i5 = 1160283358;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ۧ᩵")) * (-61);
                        i4 = ((iM3169 ^ i2) * (-25209)) ^ 472637110;
                        i5 = 847698215;
                    }
                    break;
                case -1796445109:
                case 1117838232:
                    if (C20932.f66974 <= 0) {
                        iM3169 = C0619.m2761("ܿۨ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-18505)) ^ 1915854883;
                        i5 = -1129877780;
                    } else {
                        iM3169 = (C0619.m2761("ۛᩴ") + i2) * (-43);
                        i4 = ((iM3169 ^ i3) * 6337) ^ (-191016164);
                        i5 = -703821081;
                    }
                    break;
                case -1788442716:
                case -622934211:
                    if (C0269.f1558 <= 0) {
                        iM3169 = C0619.m2761("֨ۢ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 32139) ^ 661025373;
                        i5 = 1160283358;
                    } else {
                        iM3169 = C0619.m2761("ۖܽ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 27923) ^ 1440126906;
                        i5 = -254977848;
                    }
                    break;
                case -1758698077:
                case -919406036:
                    strM7742 = C2287.m7742(this, str);
                    if (strM7742 != null) {
                        iM3169 = (C0773.m3169("ۧܰ") + i2) * (-97);
                        i4 = ((iM3169 ^ i3) * 31867) ^ (-562930420);
                        i5 = 543900008;
                    } else {
                        iM3169 = C0773.m3169("֨᩶") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-27909)) ^ 402345303;
                        i5 = 1825481650;
                    }
                    break;
                case -1705598245:
                case 1047766097:
                    if (C1343.f4799 == 0) {
                        iM3169 = C0773.m3169("ۡۖ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 30101) ^ 1625420161;
                        i5 = -1096946999;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ܳܰ")) * 15;
                        i4 = ((iM3169 ^ i2) * 31535) ^ (-1814443305);
                        i5 = -1859362285;
                    }
                    break;
                case -1550242945:
                case 715301531:
                    if (C2966.m9671(str) >= 3) {
                        iM3169 = C0619.m2761("᩸ۜ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-7953)) ^ 1489454873;
                        i5 = -320385260;
                    } else {
                        iM3169 = C0773.m3169("֨᩶") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-27909)) ^ 402345303;
                        i5 = 1825481650;
                    }
                    break;
                case -1056002464:
                case 1379740444:
                    return str;
                case -869691931:
                case 1320885421:
                    if (C2287.f7432 < 0) {
                        iM3169 = C0619.m2761("֨ۢ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 32139) ^ 661025373;
                        i5 = 1160283358;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ܳܰ")) * 15;
                        i4 = ((iM3169 ^ i2) * 31535) ^ (-1814443305);
                        i5 = -1859362285;
                    }
                    break;
                case -834747761:
                case 1359252445:
                    if (C1519.f5300 >= 0) {
                        iM3169 = C0619.m2761("֨ۢ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 32139) ^ 661025373;
                        i5 = 1160283358;
                    } else {
                        iM3169 = C0619.m2761("᩺ܳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-3571)) ^ 1481394032;
                        i5 = -667156153;
                    }
                    break;
                case -769425925:
                case 1425848272:
                    if (C3099.f10023 <= 0) {
                        iM3169 = C0619.m2761("ܿ᩻") ^ i3;
                        i4 = ((iM3169 ^ i2) * 20225) ^ (-217758197);
                        i5 = 1883809489;
                    } else {
                        iM3169 = C0619.m2761("۫ܽ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 23359) ^ (-352965174);
                        i5 = 94407344;
                    }
                    break;
                case -597993263:
                case 1496639827:
                    str = this.f66861;
                    if (C1080.f3865 >= 0) {
                        iM3169 = C0619.m2761("֨ۢ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 32139) ^ 661025373;
                        i5 = 1160283358;
                    } else {
                        iM3169 = (C0619.m2761("֨ۧ") + i2) * 45;
                        i4 = ((iM3169 ^ i3) * (-119)) ^ (-1255545943);
                        i5 = -1568055405;
                    }
                    break;
                case -596054461:
                case 865789007:
                    if (C4282.m13656(str, 0) == '{') {
                        iM3169 = (i2 - C0773.m3169("ᩳܰ")) * 67;
                        i4 = ((iM3169 ^ i3) * 28121) ^ (-1168556029);
                        i5 = 604498942;
                    } else {
                        iM3169 = C0773.m3169("֨᩶") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-27909)) ^ 402345303;
                        i5 = 1825481650;
                    }
                    break;
                case -470601004:
                case 1893518064:
                    return strM7742;
                case -425224829:
                case 1675172186:
                    C3033.m9845();
                    if (C2287.f7432 >= 0) {
                        iM3169 = C0619.m2761("ܿ᩻") ^ i3;
                        i4 = ((iM3169 ^ i2) * 20225) ^ (-217758197);
                        i5 = 1883809489;
                    } else {
                        iM3169 = C0773.m3169("ۡۖ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 30101) ^ 1625420161;
                        i5 = -1096946999;
                    }
                    break;
                case -422806562:
                case 502065856:
                    if (RunnableC3055.m9933() != 0) {
                        iM3169 = C0619.m2761("ܿ᩻") ^ i3;
                        i4 = ((iM3169 ^ i2) * 20225) ^ (-217758197);
                        i5 = 1883809489;
                    } else {
                        iM3169 = (i2 - C0619.m2761("ۗۖ")) * (-105);
                        i4 = ((iM3169 ^ i3) * (-6059)) ^ (-1009007354);
                        i5 = 1275086656;
                    }
                    break;
                case -377914995:
                case 1497410584:
                    if (C1146.m4221(1, str) == '}') {
                        iM3169 = (i3 - C0773.m3169("᩹᩺")) * 11;
                        i4 = ((iM3169 ^ i2) * (-6571)) ^ (-632873379);
                        i5 = 2105381529;
                    } else {
                        iM3169 = C0773.m3169("֨᩶") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-27909)) ^ 402345303;
                        i5 = 1825481650;
                    }
                    break;
                case 555693886:
                case 2117085607:
                    C0487.m2356();
                    return null;
                case 851734385:
                case 1530009496:
                    if (C2485.m8357() <= 0) {
                        iM3169 = C0619.m2761("֨ۢ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 32139) ^ 661025373;
                        i5 = 1160283358;
                    } else {
                        iM3169 = C0773.m3169("ۘۜ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 4405) ^ (-1992497668);
                        i5 = 224212672;
                    }
                    break;
                default:
                    if (C2288.m7767()) {
                        iM3169 = C0619.m2761("֨ۢ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 32139) ^ 661025373;
                        i5 = 1160283358;
                    } else {
                        iM3169 = C0619.m2761("ܿۜ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-19867)) ^ 498227390;
                        i5 = -1320321005;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:71:0x0283 A[PHI: r12 r13 r18 r20
      0x0283: PHI (r12v4 int) = (r12v3 int), (r12v2 int), (r12v2 int) binds: [B:70:0x0281, B:30:0x00b4, B:15:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x0283: PHI (r13v4 int) = (r13v3 int), (r13v2 int), (r13v2 int) binds: [B:70:0x0281, B:30:0x00b4, B:15:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x0283: PHI (r18v25 char) = (r18v2 char), (r18v18 char), (r18v26 char) binds: [B:70:0x0281, B:30:0x00b4, B:15:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x0283: PHI (r20v22 short) = (r20v0 short), (r20v17 short), (r20v23 short) binds: [B:70:0x0281, B:30:0x00b4, B:15:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17159 m47736(String str) {
        int iM3169;
        int i;
        int i2;
        C17159 c17159;
        int iM2761;
        int i3;
        int i4;
        int iM2762;
        int i5;
        int i6;
        int i7 = C2834.f9334;
        int i8 = C3690.f12684;
        int iM31610 = C0773.m3169("۠۫") ^ i7;
        int i9 = ((iM31610 ^ i8) * 9193) ^ (-857167255);
        short[] sArr = null;
        int i10 = iM31610 ^ 1305925172;
        char c = 0;
        short s = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = -1556666867;
        C17159 c171510 = null;
        C17159 c171511 = null;
        Reference reference = null;
        C9086 c9086 = null;
        C8114 c8114M42640 = null;
        while (true) {
            i15 = i10 ^ (i9 & (((i15 ^ i8) * (-15901)) >> 31));
            switch (i15) {
                case -2119378880:
                case -645400792:
                    c = c;
                    s = s;
                    if (this.f66858 != null) {
                        iM3169 = C0619.m2761("ۨ᩶") ^ i7;
                        i = ((iM3169 ^ i8) * 6865) ^ (-881422616);
                        i2 = 2083582468;
                    } else {
                        iM3169 = (i7 - C0773.m3169("᩻ܰ")) * 7;
                        i = ((iM3169 ^ i8) * (-18561)) ^ 1081835707;
                        i2 = 1830976025;
                    }
                    i4 = iM3169 ^ i2;
                    c = c;
                    s = s;
                    i10 = i4;
                    i9 = i;
                    break;
                case -1981957608:
                case -679062043:
                    return c171510;
                case -1934268338:
                case 2076101208:
                    C2878.m9491();
                    c = c;
                    s = s;
                    iM3169 = C0619.m2761("᩵֨") ^ i7;
                    i = ((iM3169 ^ i8) * 24803) ^ (-1482057763);
                    i2 = -262055777;
                    i4 = iM3169 ^ i2;
                    c = c;
                    s = s;
                    i10 = i4;
                    i9 = i;
                    break;
                case -1916926985:
                case -220426474:
                    c = c;
                    s = s;
                    if (c171511 == null) {
                        iM3169 = (C0619.m2761("۠֨") ^ i7) * (-27);
                        i = ((iM3169 ^ i8) * 5497) ^ (-1986589321);
                        i2 = -778342256;
                    } else {
                        c171510 = c171511;
                        iM3169 = C0619.m2761("ۢ᩷") ^ i8;
                        i = ((iM3169 ^ i7) * 9737) ^ (-1044374672);
                        i2 = -378143920;
                    }
                    i4 = iM3169 ^ i2;
                    c = c;
                    s = s;
                    i10 = i4;
                    i9 = i;
                    break;
                case -1895305512:
                case -568270262:
                    RunnableC3055.m9933();
                    if (!C1343.m4943()) {
                        c = c;
                        s = s;
                        iM3169 = (i7 - C0773.m3169("۟ۧ")) * 65;
                        i = ((iM3169 ^ i8) * 29397) ^ 1387012888;
                        i2 = -37552672;
                        i4 = iM3169 ^ i2;
                        c = c;
                        s = s;
                        i10 = i4;
                        i9 = i;
                    } else {
                        s = s;
                        iM2762 = (C0619.m2761("ܰ᩻") + i8) * (-67);
                        i5 = ((iM2762 ^ i7) * (-13713)) ^ (-300270563);
                        i6 = 520484671;
                        i10 = iM2762 ^ i6;
                        i9 = i5;
                        s = s;
                    }
                    break;
                case -1726918144:
                case -624131140:
                    C1564.m5509();
                    if (C1564.f5401 > 0) {
                        c = c;
                        s = s;
                        iM3169 = (i8 - C0619.m2761("ۖܽ")) * q.h;
                        i = ((iM3169 ^ i7) * (-9997)) ^ 721892009;
                        i2 = 820937115;
                        i4 = iM3169 ^ i2;
                        c = c;
                        s = s;
                        i10 = i4;
                        i9 = i;
                    }
                    c = c;
                    s = s;
                    iM3169 = C0619.m2761("᩵֨") ^ i7;
                    i = ((iM3169 ^ i8) * 24803) ^ (-1482057763);
                    i2 = -262055777;
                    i4 = iM3169 ^ i2;
                    c = c;
                    s = s;
                    i10 = i4;
                    i9 = i;
                    break;
                case -1673233016:
                case -1087646564:
                    AbstractC0641.m2813();
                    C1146.m4231();
                    return null;
                case -1417536080:
                case 1131488008:
                    c17159 = null;
                    c171511 = c17159;
                    iM3169 = (i8 - C0773.m3169("֡ۙ")) * (-3);
                    i = ((iM3169 ^ i7) * 5883) ^ (-249566199);
                    i2 = -829007841;
                    i4 = iM3169 ^ i2;
                    c = c;
                    s = s;
                    i10 = i4;
                    i9 = i;
                    break;
                case -1124573702:
                case 1954462844:
                    c = c;
                    s = s;
                    this.f66858 = c8114M42640;
                    if (C1080.f3865 >= 0) {
                        iM3169 = (i7 - C0773.m3169("۟ۧ")) * 65;
                        i = ((iM3169 ^ i8) * 29397) ^ 1387012888;
                        i2 = -37552672;
                    } else {
                        iM3169 = (C0619.m2761("۫۟") ^ i8) * 27;
                        i = ((iM3169 ^ i7) * 9015) ^ (-1211703417);
                        i2 = -391841161;
                    }
                    i4 = iM3169 ^ i2;
                    c = c;
                    s = s;
                    i10 = i4;
                    i9 = i;
                    break;
                case -788428555:
                case -606473868:
                    i14 = 17469;
                    iM3169 = (i8 - C0619.m2761("ۡ۠")) * (-119);
                    i = ((iM3169 ^ i7) * 10535) ^ 468373159;
                    i2 = 1023293065;
                    i4 = iM3169 ^ i2;
                    c = c;
                    s = s;
                    i10 = i4;
                    i9 = i;
                    break;
                case -660049465:
                case 1926904040:
                    short[] sArr2 = f66857;
                    c = c;
                    if (!C2288.m7767()) {
                        if (C3077.f9998) {
                            s = s;
                            String strM56409 = C25272.m56409(C4282.m13650(sArr2, UMErrorCode.E_UM_BE_CREATE_FAILED, 7, i14), str);
                            if (C4282.f15546 <= 0) {
                                iM3169 = C0619.m2761("᩵֨") ^ i7;
                                i = ((iM3169 ^ i8) * 24803) ^ (-1482057763);
                                i2 = -262055777;
                            } else {
                                C17159 c171512 = new C17159(this, str, strM56409, this.f66873);
                                if (C3099.f10023 <= 0) {
                                    s = s;
                                } else {
                                    c9086.put(str, new SoftReference(c171512));
                                    c171510 = c171512;
                                    iM3169 = C0619.m2761("ۢ᩷") ^ i8;
                                    i = ((iM3169 ^ i7) * 9737) ^ (-1044374672);
                                    i2 = -378143920;
                                }
                            }
                            i4 = iM3169 ^ i2;
                            c = c;
                            s = s;
                            i10 = i4;
                            i9 = i;
                        }
                        iM2761 = C0619.m2761("᩶֫") ^ i8;
                        i = ((iM2761 ^ i7) * (-28621)) ^ 252885037;
                        i3 = -1309174195;
                        i4 = iM2761 ^ i3;
                        c = c;
                        i10 = i4;
                        i9 = i;
                    }
                    s = s;
                    iM3169 = (i7 - C0773.m3169("۟ۧ")) * 65;
                    i = ((iM3169 ^ i8) * 29397) ^ 1387012888;
                    i2 = -37552672;
                    i4 = iM3169 ^ i2;
                    c = c;
                    s = s;
                    i10 = i4;
                    i9 = i;
                    break;
                case -591548920:
                case 299529784:
                    C1343.m4943();
                    if (!C17202.f56030) {
                        s = s;
                        iM2762 = (C0619.m2761("ܰ᩻") + i8) * (-67);
                        i5 = ((iM2762 ^ i7) * (-13713)) ^ (-300270563);
                        i6 = 520484671;
                        i10 = iM2762 ^ i6;
                        i9 = i5;
                        s = s;
                    } else {
                        c = c;
                        s = s;
                        iM3169 = C0619.m2761("᩵֨") ^ i7;
                        i = ((iM3169 ^ i8) * 24803) ^ (-1482057763);
                        i2 = -262055777;
                        i4 = iM3169 ^ i2;
                        c = c;
                        s = s;
                        i10 = i4;
                        i9 = i;
                    }
                    break;
                case -146418809:
                case 1245445995:
                    c = c;
                    s = s;
                    i12 = i11 * i11;
                    i13 = s * 2;
                    if (C3448.f11240 >= 0) {
                        iM3169 = C0619.m2761("᩵֨") ^ i7;
                        i = ((iM3169 ^ i8) * 24803) ^ (-1482057763);
                        i2 = -262055777;
                    } else {
                        iM3169 = (C0773.m3169("᩶ܽ") + i7) * (-57);
                        i = ((iM3169 ^ i8) * (-5263)) ^ (-1614239572);
                        i2 = 1534862995;
                    }
                    i4 = iM3169 ^ i2;
                    c = c;
                    s = s;
                    i10 = i4;
                    i9 = i;
                    break;
                case 44023791:
                case 947369653:
                    c = c;
                    s = s;
                    sArr = f66857;
                    if (RunnableC3055.f9898 < 0) {
                        iM3169 = (C0773.m3169("۫ۘ") + i7) * (-89);
                        i = ((iM3169 ^ i8) * (-1201)) ^ (-1943446113);
                        i2 = 1482329556;
                        i4 = iM3169 ^ i2;
                        c = c;
                        s = s;
                        i10 = i4;
                        i9 = i;
                    } else {
                        c = c;
                        iM2762 = (C0619.m2761("ܰ᩻") + i8) * (-67);
                        i5 = ((iM2762 ^ i7) * (-13713)) ^ (-300270563);
                        i6 = 520484671;
                        i10 = iM2762 ^ i6;
                        i9 = i5;
                        s = s;
                    }
                    break;
                case 211969330:
                case 684634031:
                    c = c;
                    s = s;
                    if (i12 - (i13 + 1) >= 0) {
                        iM3169 = C0773.m3169("ۜۧ") ^ i7;
                        i = ((iM3169 ^ i8) * 18821) ^ 669656358;
                        i2 = -1802461393;
                    } else {
                        iM3169 = (C0773.m3169("۬֡") ^ i8) * 99;
                        i = ((iM3169 ^ i7) * 8239) ^ (-1898519068);
                        i2 = 1679458551;
                    }
                    i4 = iM3169 ^ i2;
                    c = c;
                    s = s;
                    i10 = i4;
                    i9 = i;
                    break;
                case 297541752:
                case 1259701003:
                    c = c;
                    s = s;
                    this.f66873 = new C23873(this);
                    iM3169 = C0619.m2761("ۨ᩶") ^ i7;
                    i = ((iM3169 ^ i8) * 6865) ^ (-881422616);
                    i2 = 2083582468;
                    i4 = iM3169 ^ i2;
                    c = c;
                    s = s;
                    i10 = i4;
                    i9 = i;
                    break;
                case 863614810:
                case 1162148652:
                    c = c;
                    s = s;
                    c9086 = this.f66860;
                    reference = (Reference) c9086.get(str);
                    if (reference != null) {
                        iM3169 = C0619.m2761("۟֫") ^ i7;
                        i = ((iM3169 ^ i8) * (-11517)) ^ (-1105450723);
                        i2 = 744313592;
                    } else {
                        iM3169 = (C0619.m2761("ᩴ۬") ^ i8) * (-123);
                        i = ((iM3169 ^ i7) * (-5121)) ^ 1131186528;
                        i2 = -2130329872;
                    }
                    i4 = iM3169 ^ i2;
                    c = c;
                    s = s;
                    i10 = i4;
                    i9 = i;
                    break;
                case 927487807:
                case 1744060997:
                    s = s;
                    c = 'n';
                    if (AbstractC3624.m11755() != 0) {
                        iM2762 = (C0619.m2761("ܰ᩻") + i8) * (-67);
                        i5 = ((iM2762 ^ i7) * (-13713)) ^ (-300270563);
                        i6 = 520484671;
                    } else {
                        iM2762 = C0619.m2761("ۙۘ") ^ i8;
                        i5 = ((iM2762 ^ i7) * 27537) ^ (-1120915399);
                        i6 = 2111522783;
                    }
                    i10 = iM2762 ^ i6;
                    i9 = i5;
                    s = s;
                    break;
                case 1009735464:
                case 1861112333:
                    i14 = 15826;
                    iM3169 = (i8 - C0619.m2761("ۡ۠")) * (-119);
                    i = ((iM3169 ^ i7) * 10535) ^ 468373159;
                    i2 = 1023293065;
                    i4 = iM3169 ^ i2;
                    c = c;
                    s = s;
                    i10 = i4;
                    i9 = i;
                    break;
                case 1176210125:
                case 1662270852:
                    c17159 = (C17159) reference.get();
                    c171511 = c17159;
                    iM3169 = (i8 - C0773.m3169("֡ۙ")) * (-3);
                    i = ((iM3169 ^ i7) * 5883) ^ (-249566199);
                    i2 = -829007841;
                    i4 = iM3169 ^ i2;
                    c = c;
                    s = s;
                    i10 = i4;
                    i9 = i;
                    break;
                case 1204760068:
                case 1635297980:
                    c = c;
                    s = s;
                    c8114M42640 = C18300.m42640(this.f66863.f14019);
                    if (RunnableC3055.f9898 >= 0) {
                        iM3169 = (i8 - C0619.m2761("ۖܽ")) * q.h;
                        i = ((iM3169 ^ i7) * (-9997)) ^ 721892009;
                        i2 = 820937115;
                    } else {
                        iM3169 = (i7 - C0619.m2761("᩶ۗ")) * (-19);
                        i = ((iM3169 ^ i8) * 2839) ^ 1184293987;
                        i2 = 1773820287;
                    }
                    i4 = iM3169 ^ i2;
                    c = c;
                    s = s;
                    i10 = i4;
                    i9 = i;
                    break;
                default:
                    c = c;
                    s = sArr[c];
                    i11 = s + 1;
                    if (C0269.m1775() <= 0) {
                        iM2761 = C0619.m2761("᩶֫") ^ i8;
                        i = ((iM2761 ^ i7) * (-28621)) ^ 252885037;
                        i3 = -1309174195;
                    } else {
                        iM2761 = (i8 - C0773.m3169("᩶ۙ")) * 91;
                        i = ((iM2761 ^ i7) * (-17799)) ^ (-1439704853);
                        i3 = -1474829272;
                    }
                    i4 = iM2761 ^ i3;
                    c = c;
                    i10 = i4;
                    i9 = i;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:130:0x0541 A[PHI: r2 r10 r16 r17 r18 r22 r30
      0x0541: PHI (r2v18 int) = (r2v15 int), (r2v17 int), (r2v19 int) binds: [B:129:0x053f, B:121:0x04e7, B:117:0x04c1] A[DONT_GENERATE, DONT_INLINE]
      0x0541: PHI (r10v15 int) = (r10v12 int), (r10v14 int), (r10v16 int) binds: [B:129:0x053f, B:121:0x04e7, B:117:0x04c1] A[DONT_GENERATE, DONT_INLINE]
      0x0541: PHI (r16v3 short) = (r16v2 short), (r16v2 short), (r16v4 short) binds: [B:129:0x053f, B:121:0x04e7, B:117:0x04c1] A[DONT_GENERATE, DONT_INLINE]
      0x0541: PHI (r17v3 int) = (r17v2 int), (r17v2 int), (r17v4 int) binds: [B:129:0x053f, B:121:0x04e7, B:117:0x04c1] A[DONT_GENERATE, DONT_INLINE]
      0x0541: PHI (r18v3 int) = (r18v2 int), (r18v2 int), (r18v4 int) binds: [B:129:0x053f, B:121:0x04e7, B:117:0x04c1] A[DONT_GENERATE, DONT_INLINE]
      0x0541: PHI (r22v4 char) = (r22v2 char), (r22v3 char), (r22v2 char) binds: [B:129:0x053f, B:121:0x04e7, B:117:0x04c1] A[DONT_GENERATE, DONT_INLINE]
      0x0541: PHI (r30v5 int) = (r30v2 int), (r30v4 int), (r30v6 int) binds: [B:129:0x053f, B:121:0x04e7, B:117:0x04c1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:85:0x0316 A[PHI: r29
      0x0316: PHI (r29v5 java.lang.String) = (r29v4 java.lang.String), (r29v3 java.lang.String) binds: [B:83:0x02ff, B:66:0x024c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // bin.mt.plugin.api.PluginContext
    public final String getStringNullable(String str) {
        int i;
        int iM3169;
        int i2;
        int i3;
        String str2;
        int iM31610;
        int i4;
        int i5;
        int iM2761;
        int i6;
        int i7;
        int iM31611;
        int i8;
        int iM2762;
        int i9;
        int i10;
        C17159 c17159M47736;
        this = this;
        int i11 = C2310.f7472;
        int i12 = C2354.f7599;
        int iM31612 = (C0773.m3169("ۧᩳ") ^ i11) * (-31);
        int i13 = ((iM31612 ^ i12) * (-28923)) ^ (-1794784626);
        String strM5124 = null;
        String orDefault = null;
        short[] sArr = null;
        int i14 = iM31612 ^ (-886755217);
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        short s = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        short s2 = 0;
        char c = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = -446793025;
        String strM2824 = null;
        short[] sArr2 = null;
        String strM1237 = null;
        String orDefault2 = null;
        String str3 = null;
        C17159 c17159 = null;
        int i24 = 0;
        String strM42663 = null;
        while (true) {
            i23 = i14 ^ (i13 & (((i23 ^ i12) * 5193) >> 31));
            switch (i23) {
                case -2124569075:
                case 2026047792:
                    sArr = f66857;
                    i15 = 88;
                    i24 = 4;
                    if (C23916.m53419() != 0) {
                        iM3169 = (C0619.m2761("֡ܽ") ^ i12) * (-53);
                        i2 = ((iM3169 ^ i11) * 12647) ^ 980580799;
                        i3 = 341647513;
                    } else {
                        iM3169 = (C0773.m3169("֨ܰ") + i12) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i2 = ((iM3169 ^ i11) * (-16175)) ^ 2109934412;
                        i3 = -444610050;
                    }
                    i14 = iM3169 ^ i3;
                    i13 = i2;
                    break;
                case -2112564406:
                case 898461814:
                    if (RunnableC3646.m11801(i16, str) != '}') {
                        i15 = i15;
                        i = i21;
                        i22 = i22;
                        strM5124 = str;
                        i21 = i;
                        iM31611 = (C0773.m3169("ۚܽ") ^ i11) * 79;
                        i13 = ((iM31611 ^ i12) * (-15013)) ^ (-13620221);
                        i8 = -2011974403;
                        i14 = iM31611 ^ i8;
                        i22 = i22;
                        i15 = i15;
                    } else {
                        iM3169 = C0773.m3169("ۢܶ") ^ i11;
                        i2 = ((iM3169 ^ i12) * 247) ^ 1577156947;
                        i3 = -1289418484;
                        i14 = iM3169 ^ i3;
                        i13 = i2;
                    }
                    break;
                case -2029343720:
                case -75675519:
                    i15 = i15;
                    i21 = i21;
                    i22 = i22;
                    sArr2 = f66857;
                    if (AbstractC0641.f2496 >= 0) {
                        iM31610 = C0773.m3169("۠ۙ") ^ i11;
                        i4 = ((iM31610 ^ i12) * (-23491)) ^ 1921623914;
                        i5 = 850688368;
                    } else {
                        iM31610 = (C0619.m2761("֡ۛ") + i11) * (-37);
                        i4 = ((iM31610 ^ i12) * 9549) ^ 1717079645;
                        i5 = 541936597;
                    }
                    i14 = iM31610 ^ i5;
                    i21 = i21;
                    i13 = i4;
                    i22 = i22;
                    i15 = i15;
                    break;
                case -2017346963:
                case -990468870:
                    i15 = i15;
                    i21 = i21;
                    i22 = i22;
                    if (C17202.f56030) {
                        iM31610 = (C0773.m3169("ᩳ᩹") ^ i12) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM31610 ^ i11) * (-30841)) ^ (-824710480);
                        i5 = 1085246231;
                    } else {
                        iM31610 = C0619.m2761("ᩴ۬") ^ i12;
                        i4 = ((iM31610 ^ i11) * 6261) ^ 1023267631;
                        i5 = 621165967;
                    }
                    i14 = iM31610 ^ i5;
                    i21 = i21;
                    i13 = i4;
                    i22 = i22;
                    i15 = i15;
                    break;
                case -1962209644:
                case 719810036:
                    i15 = i15;
                    i21 = i21;
                    i22 = i22;
                    c = 'W';
                    if (C2375.f7641 <= 0) {
                        iM31610 = C0619.m2761("ᩴ۬") ^ i12;
                        i4 = ((iM31610 ^ i11) * 6261) ^ 1023267631;
                        i5 = 621165967;
                    } else {
                        iM31610 = C0619.m2761("ۢܿ") ^ i11;
                        i4 = ((iM31610 ^ i12) * 3507) ^ 660685604;
                        i5 = 1103799343;
                    }
                    i14 = iM31610 ^ i5;
                    i21 = i21;
                    i13 = i4;
                    i22 = i22;
                    i15 = i15;
                    break;
                case -1849832997:
                case 166752106:
                    int i25 = i15;
                    int i26 = i21;
                    int iM8073 = C2375.m8073(strM5124, 58);
                    str3 = null;
                    if (iM8073 == -1) {
                        iM2762 = (C0619.m2761("ܶۚ") ^ i12) * 3;
                        i9 = ((iM2762 ^ i11) * (-18597)) ^ 2113396476;
                        i10 = -864666168;
                    } else {
                        iM2762 = C0619.m2761("ᩴ᩺") ^ i11;
                        i9 = ((iM2762 ^ i12) * 19273) ^ 1411519411;
                        i10 = 1646849332;
                    }
                    i14 = iM2762 ^ i10;
                    i22 = iM8073;
                    i21 = i26;
                    i13 = i9;
                    i15 = i25;
                    this = this;
                    break;
                case -1745325077:
                case -777877389:
                    i15 = i15;
                    i21 = i21;
                    i22 = i22;
                    s = sArr2[c];
                    i18 = s * s;
                    i19 = 79852096;
                    if (AbstractC3624.f12429 <= 0) {
                        iM31610 = C0619.m2761("ᩴ۬") ^ i12;
                        i4 = ((iM31610 ^ i11) * 6261) ^ 1023267631;
                        i5 = 621165967;
                    } else {
                        iM31610 = (C0619.m2761("֫ۚ") + i12) * (-51);
                        i4 = ((iM31610 ^ i11) * 9729) ^ 13232260;
                        i5 = 845563416;
                    }
                    i14 = iM31610 ^ i5;
                    i21 = i21;
                    i13 = i4;
                    i22 = i22;
                    i15 = i15;
                    break;
                case -1647004727:
                case 262417021:
                    C2023.m6964();
                    if (C2966.f9654 < 0) {
                        i15 = i15;
                        i21 = i21;
                        i22 = i22;
                        iM31610 = (C0773.m3169("۫۫") + i12) * 15;
                        i4 = ((iM31610 ^ i11) * 3521) ^ 1857014080;
                        i5 = -1742530408;
                        i14 = iM31610 ^ i5;
                        i21 = i21;
                        i13 = i4;
                        i22 = i22;
                        i15 = i15;
                    } else {
                        i21 = i21;
                        i22 = i22;
                        int iM2763 = (i11 - C0619.m2761("۠۠")) * (-121);
                        int i27 = ((iM2763 ^ i12) * (-3619)) ^ (-338362244);
                        i14 = iM2763 ^ (-1243720376);
                        i21 = i21;
                        i22 = i22;
                        i13 = i27;
                        this = this;
                    }
                    break;
                case -1582277003:
                case 1410412339:
                    i17 = 3925;
                    iM31610 = (C0773.m3169("ܽۜ") ^ i11) * 51;
                    i4 = ((iM31610 ^ i12) * (-20243)) ^ 1304023909;
                    i5 = -572373668;
                    i14 = iM31610 ^ i5;
                    i21 = i21;
                    i13 = i4;
                    i22 = i22;
                    i15 = i15;
                    break;
                case -1479369206:
                case 635122271:
                    i15 = i15;
                    str2 = strM1237;
                    orDefault2 = c17159.getOrDefault(strM5124, str3);
                    if (orDefault2 == null) {
                        iM2761 = C0773.m3169("ܳۢ") ^ i12;
                        i6 = ((iM2761 ^ i11) * (-195)) ^ 952633529;
                        i7 = 556996358;
                    } else {
                        iM2761 = C0773.m3169("ۙۖ") ^ i11;
                        i6 = ((iM2761 ^ i12) * 21811) ^ (-1219754202);
                        i7 = -1894108813;
                    }
                    int i28 = iM2761 ^ i7;
                    strM1237 = str2;
                    i14 = i28;
                    i13 = i6;
                    i15 = i15;
                    break;
                case -1457899067:
                case 249561035:
                    i15 = i15;
                    i21 = i21;
                    i22 = i22;
                    int i29 = i18 + i19;
                    i20 = i29 + i29;
                    s2 = 8936;
                    if (C1343.f4799 != 0) {
                        iM31610 = (C0773.m3169("۫۫") + i12) * 15;
                        i4 = ((iM31610 ^ i11) * 3521) ^ 1857014080;
                        i5 = -1742530408;
                    } else {
                        iM31610 = C0619.m2761("᩻᩷") ^ i12;
                        i4 = ((iM31610 ^ i11) * (-32467)) ^ (-596936347);
                        i5 = 2143949597;
                    }
                    i14 = iM31610 ^ i5;
                    i21 = i21;
                    i13 = i4;
                    i22 = i22;
                    i15 = i15;
                    break;
                case -1383842016:
                case -1088301329:
                    return C5448.f19037.getOrDefault(strM5124, str3);
                case -1354203077:
                case -758054874:
                    if (C3492.m11490(strM1237, C4238.m13530(sArr, i15, i24, i17))) {
                        iM3169 = (i11 - C0619.m2761("ܿ۫")) * (-27);
                        i2 = ((iM3169 ^ i12) * 2707) ^ (-1409004793);
                        i3 = 2080734722;
                    } else {
                        iM3169 = (C0773.m3169("ۡܺ") + i11) * (-67);
                        i2 = ((iM3169 ^ i12) * 18627) ^ (-1124877443);
                        i3 = -982222206;
                    }
                    i14 = iM3169 ^ i3;
                    i13 = i2;
                    break;
                case -1319896935:
                case -415216370:
                    i15 = i15;
                    str2 = strM1237;
                    if (C5448.f19037 == null) {
                        iM2761 = C0773.m3169("ۗۗ") ^ i11;
                        i6 = ((iM2761 ^ i12) * (-11555)) ^ (-196756371);
                        i7 = 993809363;
                    } else {
                        iM2761 = (C0619.m2761("ܰ֨") + i12) * 65;
                        i6 = ((iM2761 ^ i11) * 17315) ^ 1106992732;
                        i7 = 85479208;
                    }
                    int i210 = iM2761 ^ i7;
                    strM1237 = str2;
                    i14 = i210;
                    i13 = i6;
                    i15 = i15;
                    break;
                case -1273386773:
                case 1051876575:
                    i21 = i21;
                    i22 = i22;
                    strM1237 = AbstractC0116.m1237(strM5124, i21, i22);
                    strM2824 = AbstractC0641.m2824(strM5124, i22 + i16);
                    if (AbstractC3624.m11755() == 0) {
                        iM31610 = (i12 - C0773.m3169("᩻᩻")) * (-13);
                        i15 = i15;
                        i4 = ((iM31610 ^ i11) * 735) ^ (-102317059);
                        i5 = 1579834269;
                        i14 = iM31610 ^ i5;
                        i21 = i21;
                        i13 = i4;
                        i22 = i22;
                        i15 = i15;
                    } else {
                        int iM2764 = (i11 - C0619.m2761("۠۠")) * (-121);
                        int i211 = ((iM2764 ^ i12) * (-3619)) ^ (-338362244);
                        i14 = iM2764 ^ (-1243720376);
                        i21 = i21;
                        i22 = i22;
                        i13 = i211;
                        this = this;
                    }
                    break;
                case -1262733629:
                case 1829873155:
                    i17 = 13081;
                    iM31610 = (C0773.m3169("ܽۜ") ^ i11) * 51;
                    i4 = ((iM31610 ^ i12) * (-20243)) ^ 1304023909;
                    i5 = -572373668;
                    i14 = iM31610 ^ i5;
                    i21 = i21;
                    i13 = i4;
                    i22 = i22;
                    i15 = i15;
                    break;
                case -1251668249:
                case 1241226157:
                    if (C2702.f8586 <= 0) {
                        iM3169 = (i12 - C0619.m2761("ۙܰ")) * (-117);
                        i2 = ((iM3169 ^ i11) * 21631) ^ (-1362774199);
                        i3 = -1159568631;
                        i14 = iM3169 ^ i3;
                        i13 = i2;
                    } else {
                        i21 = i21;
                        i22 = i22;
                        int iM2765 = (i11 - C0619.m2761("۠۠")) * (-121);
                        int i212 = ((iM2765 ^ i12) * (-3619)) ^ (-338362244);
                        i14 = iM2765 ^ (-1243720376);
                        i21 = i21;
                        i22 = i22;
                        i13 = i212;
                        this = this;
                    }
                    break;
                case -1096970854:
                case -195854875:
                    C2375.m8065();
                    if (!C2878.f9462) {
                        i15 = i15;
                        i21 = i21;
                        i22 = i22;
                        iM31610 = (C0773.m3169("۫۫") + i12) * 15;
                        i4 = ((iM31610 ^ i11) * 3521) ^ 1857014080;
                        i5 = -1742530408;
                        i14 = iM31610 ^ i5;
                        i21 = i21;
                        i13 = i4;
                        i22 = i22;
                        i15 = i15;
                    } else {
                        iM3169 = (C0619.m2761("ܳۙ") + i11) * (-41);
                        i2 = ((iM3169 ^ i12) * 23577) ^ (-917323278);
                        i3 = -1949379981;
                        i14 = iM3169 ^ i3;
                        i13 = i2;
                    }
                    break;
                case -1021667749:
                case 1921522361:
                    c17159M47736 = this.m47736(strM42663);
                    this.f66862 = c17159M47736;
                    c17159 = c17159M47736;
                    iM3169 = C0619.m2761("۟ۛ") ^ i12;
                    i2 = ((iM3169 ^ i11) * 21223) ^ 2084779942;
                    i3 = -1245978605;
                    i14 = iM3169 ^ i3;
                    i13 = i2;
                    break;
                case -1013221639:
                case 974751162:
                    C13473.m33144();
                    if (C2878.m9491() > 0) {
                        i15 = i15;
                        i21 = i21;
                        i22 = i22;
                        iM31610 = C0773.m3169("۠ۙ") ^ i11;
                        i4 = ((iM31610 ^ i12) * (-23491)) ^ 1921623914;
                        i5 = 850688368;
                        i14 = iM31610 ^ i5;
                        i21 = i21;
                        i13 = i4;
                        i22 = i22;
                        i15 = i15;
                    }
                    i15 = i15;
                    i21 = i21;
                    i22 = i22;
                    iM31610 = (C0773.m3169("۫۫") + i12) * 15;
                    i4 = ((iM31610 ^ i11) * 3521) ^ 1857014080;
                    i5 = -1742530408;
                    i14 = iM31610 ^ i5;
                    i21 = i21;
                    i13 = i4;
                    i22 = i22;
                    i15 = i15;
                    break;
                case -874118302:
                case -317816214:
                    short[] sArr3 = f66857;
                    str2 = strM1237;
                    if (C1564.m5509() <= 0) {
                        i15 = i15;
                        iM2761 = (C0619.m2761("ۡۨ") + i12) * 89;
                        i6 = ((iM2761 ^ i11) * (-26233)) ^ (-1724097314);
                        i7 = 223113933;
                        int i213 = iM2761 ^ i7;
                        strM1237 = str2;
                        i14 = i213;
                        i13 = i6;
                        i15 = i15;
                    } else if (C3998.f13671 == 0) {
                        i15 = i15;
                        C5448.f19037 = new C17159(C1343.m4939(sArr3, 92, 7, i17));
                        iM2761 = (C0619.m2761("ܰ֨") + i12) * 65;
                        i6 = ((iM2761 ^ i11) * 17315) ^ 1106992732;
                        i7 = 85479208;
                        int i214 = iM2761 ^ i7;
                        strM1237 = str2;
                        i14 = i214;
                        i13 = i6;
                        i15 = i15;
                    } else {
                        i15 = i15;
                        i21 = i21;
                        i22 = i22;
                        strM1237 = str2;
                        iM31610 = C0773.m3169("۠ۙ") ^ i11;
                        i4 = ((iM31610 ^ i12) * (-23491)) ^ 1921623914;
                        i5 = 850688368;
                        i14 = iM31610 ^ i5;
                        i21 = i21;
                        i13 = i4;
                        i22 = i22;
                        i15 = i15;
                    }
                    break;
                case -632765777:
                case 2102718996:
                    c17159M47736 = this.f66862;
                    if (c17159M47736 != null) {
                        c17159 = c17159M47736;
                        iM3169 = C0619.m2761("۟ۛ") ^ i12;
                        i2 = ((iM3169 ^ i11) * 21223) ^ 2084779942;
                        i3 = -1245978605;
                    } else {
                        iM3169 = C0773.m3169("ۘۜ") ^ i11;
                        i2 = ((iM3169 ^ i12) * 12083) ^ 330544447;
                        i3 = -1952222898;
                    }
                    i14 = iM3169 ^ i3;
                    i13 = i2;
                    break;
                case -488451031:
                case 1696063169:
                    i15 = i15;
                    strM5124 = C1402.m5124(i16, i16, str);
                    i22 = i22;
                    iM31611 = (C0773.m3169("ۚܽ") ^ i11) * 79;
                    i13 = ((iM31611 ^ i12) * (-15013)) ^ (-13620221);
                    i8 = -2011974403;
                    i14 = iM31611 ^ i8;
                    i22 = i22;
                    i15 = i15;
                    break;
                case -460936752:
                case 1841270474:
                    C3033.m9845();
                    if (!C2023.f6737) {
                        i15 = i15;
                        str2 = strM1237;
                        iM2761 = (C0619.m2761("ۡۨ") + i12) * 89;
                        i6 = ((iM2761 ^ i11) * (-26233)) ^ (-1724097314);
                        i7 = 223113933;
                        int i215 = iM2761 ^ i7;
                        strM1237 = str2;
                        i14 = i215;
                        i13 = i6;
                        i15 = i15;
                    } else {
                        iM3169 = (C0619.m2761("֡ܽ") ^ i12) * (-53);
                        i2 = ((iM3169 ^ i11) * 12647) ^ 980580799;
                        i3 = 341647513;
                        i14 = iM3169 ^ i3;
                        i13 = i2;
                    }
                    break;
                case -339114059:
                case 1303290271:
                    C2310.m7813();
                    if (C0862.f3233 != 0) {
                        iM3169 = (C0619.m2761("֡ܽ") ^ i12) * (-53);
                        i2 = ((iM3169 ^ i11) * 12647) ^ 980580799;
                        i3 = 341647513;
                        i14 = iM3169 ^ i3;
                        i13 = i2;
                    } else {
                        i21 = i21;
                        i22 = i22;
                        int iM2766 = (i11 - C0619.m2761("۠۠")) * (-121);
                        int i216 = ((iM2766 ^ i12) * (-3619)) ^ (-338362244);
                        i14 = iM2766 ^ (-1243720376);
                        i21 = i21;
                        i22 = i22;
                        i13 = i216;
                        this = this;
                    }
                    break;
                case -309423992:
                case -137496895:
                    C0487.m2356();
                    i21 = i21;
                    i22 = i22;
                    int iM2767 = (i11 - C0619.m2761("۠۠")) * (-121);
                    int i217 = ((iM2767 ^ i12) * (-3619)) ^ (-338362244);
                    i14 = iM2767 ^ (-1243720376);
                    i21 = i21;
                    i22 = i22;
                    i13 = i217;
                    this = this;
                    break;
                case -274115119:
                case 890213509:
                    i15 = i15;
                    i21 = i21;
                    i22 = i22;
                    int i30 = s + s2;
                    if (i20 - (i30 * i30) < 0) {
                        iM31610 = C0773.m3169("ܳܽ") ^ i12;
                        i4 = ((iM31610 ^ i11) * 13931) ^ 963797729;
                        i5 = 618453305;
                    } else {
                        iM31610 = (C0619.m2761("ܰ᩹") ^ i11) * 127;
                        i4 = ((iM31610 ^ i12) * (-18985)) ^ (-552548890);
                        i5 = 391592643;
                    }
                    i14 = iM31610 ^ i5;
                    i21 = i21;
                    i13 = i4;
                    i22 = i22;
                    i15 = i15;
                    break;
                case -178204659:
                case 813683431:
                    orDefault = this.m47736(strM1237).getOrDefault(strM2824, str3);
                    if (orDefault == null) {
                        iM3169 = C0619.m2761("᩸֡") ^ i12;
                        i2 = ((iM3169 ^ i11) * 20255) ^ 1845341213;
                        i3 = -392152439;
                    } else {
                        iM3169 = (C0773.m3169("ۡܺ") + i11) * (-67);
                        i2 = ((iM3169 ^ i12) * 18627) ^ (-1124877443);
                        i3 = -982222206;
                    }
                    i14 = iM3169 ^ i3;
                    i13 = i2;
                    break;
                case -135591493:
                case 903425672:
                    return orDefault;
                case 24676359:
                case 349456227:
                    return ((C17159) C5448.m16285()).getOrDefault(strM2824, str3);
                case 129232358:
                case 1021554258:
                    C2878.m9491();
                    if (C3998.f13671 != 0) {
                        iM3169 = (C0619.m2761("ᩴۤ") + i11) * (-125);
                        i2 = ((iM3169 ^ i12) * 32167) ^ (-1552371129);
                        i3 = -1942672914;
                        i14 = iM3169 ^ i3;
                        i13 = i2;
                    } else {
                        i21 = i21;
                        i22 = i22;
                        int iM2768 = (i11 - C0619.m2761("۠۠")) * (-121);
                        int i218 = ((iM2768 ^ i12) * (-3619)) ^ (-338362244);
                        i14 = iM2768 ^ (-1243720376);
                        i21 = i21;
                        i22 = i22;
                        i13 = i218;
                        this = this;
                    }
                    break;
                case 458899845:
                case 1642865870:
                    i15 = i15;
                    i21 = i21;
                    i22 = i22;
                    if (C4282.m13656(str, i21) != '{') {
                        i = i21;
                        strM5124 = str;
                        i21 = i;
                        iM31611 = (C0773.m3169("ۚܽ") ^ i11) * 79;
                        i13 = ((iM31611 ^ i12) * (-15013)) ^ (-13620221);
                        i8 = -2011974403;
                        i14 = iM31611 ^ i8;
                        i22 = i22;
                        i15 = i15;
                    } else {
                        iM31610 = (C0773.m3169("֨ۘ") ^ i11) * 35;
                        i4 = ((iM31610 ^ i12) * (-29689)) ^ 54189745;
                        i5 = -889506287;
                        i14 = iM31610 ^ i5;
                        i21 = i21;
                        i13 = i4;
                        i22 = i22;
                        i15 = i15;
                    }
                    break;
                case 1495851319:
                case 1789931309:
                    return orDefault2;
                case 1569825043:
                case 1985745659:
                    i15 = i15;
                    str2 = strM1237;
                    strM42663 = this.f66865.f14019.m42663();
                    if (RunnableC3646.f12471) {
                        iM2761 = (C0619.m2761("ۡۨ") + i12) * 89;
                        i6 = ((iM2761 ^ i11) * (-26233)) ^ (-1724097314);
                        i7 = 223113933;
                    } else {
                        iM2761 = (C0619.m2761("᩷֨") ^ i12) * 13;
                        i6 = ((iM2761 ^ i11) * (-30485)) ^ 949131390;
                        i7 = 662800180;
                    }
                    int i219 = iM2761 ^ i7;
                    strM1237 = str2;
                    i14 = i219;
                    i13 = i6;
                    i15 = i15;
                    break;
                case 1997118584:
                case 1998506919:
                    C3998.m12920();
                    C2966.m9664();
                    return null;
                default:
                    i15 = i15;
                    i22 = i22;
                    i21 = 0;
                    i16 = 1;
                    if (C2966.m9671(str) >= 3) {
                        iM31611 = C0619.m2761("ۢܺ") ^ i12;
                        i13 = ((iM31611 ^ i11) * 2545) ^ 1734493706;
                        i8 = -242421306;
                    } else {
                        i = 0;
                        strM5124 = str;
                        i21 = i;
                        iM31611 = (C0773.m3169("ۚܽ") ^ i11) * 79;
                        i13 = ((iM31611 ^ i12) * (-15013)) ^ (-13620221);
                        i8 = -2011974403;
                    }
                    i14 = iM31611 ^ i8;
                    i22 = i22;
                    i15 = i15;
                    break;
            }
        }
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final void log(String str, Throwable th) {
        int i = -19707004;
        int i2 = C11235.f35427;
        int i3 = C3033.f9831;
        int iM3169 = C0773.m3169("ܳ۬") ^ i2;
        int i4 = ((iM3169 ^ i3) * 31589) ^ 1668164317;
        int i5 = 365128102;
        while (true) {
            i = ((((i ^ i3) * 9567) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2078677706:
                case 739859207:
                    if (AbstractC0641.f2496 >= 0) {
                        iM3169 = C0619.m2761("ᩴ᩹") ^ i2;
                        i4 = ((iM3169 ^ i3) * 15669) ^ 283582827;
                        i5 = -1274749991;
                    } else {
                        iM3169 = C0773.m3169("ۢۜ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-5617)) ^ (-1046754776);
                        i5 = -1621450806;
                    }
                    break;
                case -2027832085:
                case 1312288789:
                    if (C3690.f12684 <= 0) {
                        iM3169 = (i3 - C0773.m3169("ܺ۬")) * (-69);
                        i4 = ((iM3169 ^ i2) * 7167) ^ (-797281356);
                        i5 = -1582965596;
                    } else {
                        iM3169 = C0773.m3169("ܶᩳ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-18071)) ^ 1302092930;
                        i5 = 846821832;
                    }
                    break;
                case -1600408735:
                case 19550936:
                    if (C3690.f12684 <= 0) {
                        iM3169 = (i3 - C0773.m3169("ܺ۬")) * (-69);
                        i4 = ((iM3169 ^ i2) * 7167) ^ (-797281356);
                        i5 = -1582965596;
                    } else {
                        iM3169 = (C0773.m3169("ܿ֨") + i3) * 61;
                        i4 = ((iM3169 ^ i2) * 1163) ^ (-672351406);
                        i5 = -961557711;
                    }
                    break;
                case -1568836939:
                case -519793194:
                    if (RunnableC0334.f1808 <= 0) {
                        iM3169 = (C0619.m2761("ܽۤ") + i2) * 57;
                        i4 = ((iM3169 ^ i3) * (-17501)) ^ (-2103159507);
                        i5 = 1362873493;
                    } else {
                        iM3169 = C0619.m2761("ܰۙ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 16887) ^ (-1085382559);
                        i5 = -269084504;
                    }
                    break;
                case -1523364240:
                case 20434420:
                    C1783.m6232();
                    C1343.m4943();
                    iM3169 = C0619.m2761("ᩴ᩹") ^ i2;
                    i4 = ((iM3169 ^ i3) * 15669) ^ 283582827;
                    i5 = -1274749991;
                    break;
                case -1154131692:
                case 652584456:
                    C0862.m3503();
                    break;
                case -964718752:
                case 866195381:
                    if (RunnableC1848.f6235) {
                        iM3169 = C0773.m3169("ܰܳ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-22669)) ^ 1623965882;
                        i5 = 1810727520;
                    } else {
                        iM3169 = C0619.m2761("ᩳ᩹") ^ i2;
                        i4 = ((iM3169 ^ i3) * 1569) ^ 178334718;
                        i5 = -614225569;
                    }
                    break;
                case -961648342:
                case -116435145:
                    C2702.m8876();
                    if (C0773.f2792 > 0) {
                        iM3169 = (i3 - C0773.m3169("ܺ۬")) * (-69);
                        i4 = ((iM3169 ^ i2) * 7167) ^ (-797281356);
                        i5 = -1582965596;
                    } else {
                        iM3169 = C0619.m2761("ܶۨ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 32687) ^ 2120056368;
                        i5 = 1257212840;
                    }
                    break;
                case -907235669:
                case 1733076105:
                    if (C2287.m7745() <= 0) {
                        iM3169 = (C0619.m2761("ܽۤ") + i2) * 57;
                        i4 = ((iM3169 ^ i3) * (-17501)) ^ (-2103159507);
                        i5 = 1362873493;
                    } else {
                        iM3169 = C0619.m2761("ܰۘ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-4711)) ^ (-2039775145);
                        i5 = -1090810373;
                    }
                    break;
                case -704430581:
                case 1233310829:
                    if (C3077.f9998) {
                        iM3169 = C0773.m3169("۟֨") ^ i3;
                        i4 = ((iM3169 ^ i2) * 945) ^ 265282172;
                        i5 = -392113827;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ܺ۬")) * (-69);
                        i4 = ((iM3169 ^ i2) * 7167) ^ (-797281356);
                        i5 = -1582965596;
                    }
                    break;
                case -441769962:
                case 153005856:
                    C23916.m53419();
                    if (C0773.m3161() != 0) {
                        iM3169 = C0619.m2761("ܶۨ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 32687) ^ 2120056368;
                        i5 = 1257212840;
                    } else {
                        iM3169 = C0619.m2761("ᩴ᩹") ^ i2;
                        i4 = ((iM3169 ^ i3) * 15669) ^ 283582827;
                        i5 = -1274749991;
                    }
                    break;
                case -161503949:
                case 1633412021:
                    C5448.m16280(this.f66864, str, th);
                    break;
                case -129138996:
                case 1960899516:
                    if (C23916.m53419() == 0) {
                        iM3169 = (C0619.m2761("ܽۤ") + i2) * 57;
                        i4 = ((iM3169 ^ i3) * (-17501)) ^ (-2103159507);
                        i5 = 1362873493;
                    } else {
                        iM3169 = C0619.m2761("ᩴ᩹") ^ i2;
                        i4 = ((iM3169 ^ i3) * 15669) ^ 283582827;
                        i5 = -1274749991;
                    }
                    break;
                case 125577310:
                case 1551573253:
                    if (C3033.f9831 >= 0) {
                        iM3169 = C0773.m3169("ܰܳ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-22669)) ^ 1623965882;
                        i5 = 1810727520;
                    } else {
                        iM3169 = (C0619.m2761("᩶᩺") ^ i2) * 61;
                        i4 = ((iM3169 ^ i3) * (-9281)) ^ (-156789248);
                        i5 = -1629419291;
                    }
                    break;
                case 1074302222:
                case 1887854682:
                    if (C3077.f9998) {
                        iM3169 = (i3 - C0619.m2761("᩹֡")) * (-125);
                        i4 = ((iM3169 ^ i2) * (-27425)) ^ (-835482725);
                        i5 = 627672134;
                    } else {
                        iM3169 = C0619.m2761("ᩴ᩹") ^ i2;
                        i4 = ((iM3169 ^ i3) * 15669) ^ 283582827;
                        i5 = -1274749991;
                    }
                    break;
                default:
                    if (C1519.f5300 >= 0) {
                        iM3169 = (C0619.m2761("ܽۤ") + i2) * 57;
                        i4 = ((iM3169 ^ i3) * (-17501)) ^ (-2103159507);
                        i5 = 1362873493;
                    } else {
                        iM3169 = (C0773.m3169("۬᩸") + i3) * (-25);
                        i4 = ((iM3169 ^ i2) * 18997) ^ (-1051363868);
                        i5 = -198943053;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x038c  */
    /* JADX WARN: Code duplicated, block: B:18:0x005d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0085  */
    /* JADX WARN: Code duplicated, block: B:59:0x018e A[PHI: r12 r14 r15
      0x018e: PHI (r12v3 java.lang.Object) = 
      (r12v2 java.lang.Object)
      (r12v1 java.lang.Object)
      (r12v1 java.lang.Object)
      (r12v1 java.lang.Object)
      (r12v1 java.lang.Object)
      (r12v1 java.lang.Object)
     binds: [B:57:0x0174, B:50:0x0132, B:44:0x0106, B:41:0x00ea, B:38:0x00ce, B:36:0x00c6] A[DONT_GENERATE, DONT_INLINE]
      0x018e: PHI (r14v4 java.lang.String) = 
      (r14v1 java.lang.String)
      (r14v3 java.lang.String)
      (r14v1 java.lang.String)
      (r14v1 java.lang.String)
      (r14v1 java.lang.String)
      (r14v1 java.lang.String)
     binds: [B:57:0x0174, B:50:0x0132, B:44:0x0106, B:41:0x00ea, B:38:0x00ce, B:36:0x00c6] A[DONT_GENERATE, DONT_INLINE]
      0x018e: PHI (r15v3 java.lang.String) = 
      (r15v1 java.lang.String)
      (r15v1 java.lang.String)
      (r15v1 java.lang.String)
      (r15v1 java.lang.String)
      (r15v2 java.lang.String)
      (r15v1 java.lang.String)
     binds: [B:57:0x0174, B:50:0x0132, B:44:0x0106, B:41:0x00ea, B:38:0x00ce, B:36:0x00c6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x02b6 A[PHI: r1 r5 r6 r7 r8 r9
      0x02b6: PHI (r1v78 java.lang.CharSequence) = (r1v12 java.lang.CharSequence), (r1v14 java.lang.CharSequence), (r1v79 java.lang.CharSequence) binds: [B:84:0x029c, B:79:0x025c, B:72:0x021f] A[DONT_GENERATE, DONT_INLINE]
      0x02b6: PHI (r5v4 char) = (r5v2 char), (r5v1 char), (r5v1 char) binds: [B:84:0x029c, B:79:0x025c, B:72:0x021f] A[DONT_GENERATE, DONT_INLINE]
      0x02b6: PHI (r6v4 int) = (r6v2 int), (r6v1 int), (r6v1 int) binds: [B:84:0x029c, B:79:0x025c, B:72:0x021f] A[DONT_GENERATE, DONT_INLINE]
      0x02b6: PHI (r7v4 int) = (r7v2 int), (r7v1 int), (r7v1 int) binds: [B:84:0x029c, B:79:0x025c, B:72:0x021f] A[DONT_GENERATE, DONT_INLINE]
      0x02b6: PHI (r8v4 int) = (r8v2 int), (r8v1 int), (r8v1 int) binds: [B:84:0x029c, B:79:0x025c, B:72:0x021f] A[DONT_GENERATE, DONT_INLINE]
      0x02b6: PHI (r9v5 java.lang.String) = (r9v1 java.lang.String), (r9v3 java.lang.String), (r9v1 java.lang.String) binds: [B:84:0x029c, B:79:0x025c, B:72:0x021f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:98:0x031c A[PHI: r4 r20
      0x031c: PHI (r4v2 char) = (r4v1 char), (r4v1 char), (r4v7 char) binds: [B:97:0x031a, B:93:0x02fd, B:90:0x02d5] A[DONT_GENERATE, DONT_INLINE]
      0x031c: PHI (r20v2 boolean) = (r20v1 boolean), (r20v1 boolean), (r20v6 boolean) binds: [B:97:0x031a, B:93:0x02fd, B:90:0x02d5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bb, code lost:
    
        if (l.C23916.f77426 <= 0) goto L21;
     */
    @Override // bin.mt.plugin.api.PluginContext
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void showToast(java.lang.CharSequence r23, java.lang.Object... r24) {
        /*
            Method dump skipped, instruction units count: 1312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C20889.showToast(java.lang.CharSequence, java.lang.Object[]):void");
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final List getStringList(String... strArr) {
        getStringArray(strArr);
        return Arrays.asList(strArr);
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final void showToast(CharSequence charSequence) {
        CharSequence charSequenceM3508 = null;
        String str = null;
        int i = 1182602276;
        int i2 = C1519.f5300;
        int i3 = AbstractC3624.f12429;
        int iM2761 = C0619.m2761("᩵ۙ") ^ i3;
        int i4 = ((iM2761 ^ i2) * (-32749)) ^ (-1546637432);
        int i5 = 1488794715;
        while (true) {
            i = ((((i ^ i2) * 3915) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2113717910:
                case 1491128622:
                    C0862.m3503();
                    C2288.m7767();
                    break;
                case -2063170183:
                case 915630917:
                    charSequenceM3508 = C0862.m3508(this, str);
                    if (charSequenceM3508 == null) {
                        charSequenceM3508 = charSequence;
                    }
                    iM2761 = (i2 - C0619.m2761("᩸ᩳ")) * (-69);
                    i4 = ((iM2761 ^ i3) * 25785) ^ 1871413021;
                    i5 = -2130130835;
                    break;
                case -1885874666:
                case 1267879118:
                    if (charSequence instanceof String) {
                        iM2761 = C0773.m3169("᩵ᩴ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-29527)) ^ 1395681988;
                        i5 = -582857799;
                    } else {
                        charSequenceM3508 = charSequence;
                        iM2761 = (i2 - C0619.m2761("᩸ᩳ")) * (-69);
                        i4 = ((iM2761 ^ i3) * 25785) ^ 1871413021;
                        i5 = -2130130835;
                    }
                    break;
                case -1844224879:
                case 1216879278:
                    C23916.m53419();
                    iM2761 = (i2 - C0773.m3169("ܰۨ")) * (-105);
                    i4 = ((iM2761 ^ i3) * 10705) ^ (-2099820769);
                    i5 = -680118325;
                    break;
                case -1767100692:
                case -1579041070:
                    str = (String) charSequence;
                    if (C2966.m9671(str) >= 3) {
                        iM2761 = (C0619.m2761("֫ܰ") ^ i3) * (-55);
                        i4 = ((iM2761 ^ i2) * (-5139)) ^ (-1178920361);
                        i5 = -1703450945;
                    } else {
                        charSequenceM3508 = charSequence;
                        iM2761 = (i2 - C0619.m2761("᩸ᩳ")) * (-69);
                        i4 = ((iM2761 ^ i3) * 25785) ^ 1871413021;
                        i5 = -2130130835;
                    }
                    break;
                case -1658655360:
                case -942429714:
                    C2310.m7813();
                    if (C3998.f13671 == 0) {
                        iM2761 = C0619.m2761("ᩳܽ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-6391)) ^ (-958036248);
                        i5 = 57018958;
                    } else {
                        iM2761 = (i2 - C0773.m3169("ܰۨ")) * (-105);
                        i4 = ((iM2761 ^ i3) * 10705) ^ (-2099820769);
                        i5 = -680118325;
                    }
                    break;
                case -1491863155:
                case -19040564:
                    if (C1783.f6087 <= 0) {
                        iM2761 = (C0619.m2761("ۜ᩷") + i3) * 71;
                        i4 = ((iM2761 ^ i2) * (-14321)) ^ (-595808178);
                        i5 = -762395871;
                    } else {
                        iM2761 = C0619.m2761("᩻ۨ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 20427) ^ (-1126780851);
                        i5 = 382601294;
                    }
                    break;
                case -979741846:
                case 1120903361:
                    C17159 c17159 = C5448.f19035;
                    if (C2485.f7950 == 0) {
                        if (C4282.f15546 > 0) {
                            ThreadUtil.runOnUiThread(new RunnableC4783(4, charSequenceM3508));
                        }
                        iM2761 = (C0619.m2761("ۜ᩷") + i3) * 71;
                        i4 = ((iM2761 ^ i2) * (-14321)) ^ (-595808178);
                        i5 = -762395871;
                    } else {
                        iM2761 = C0619.m2761("ᩳܽ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-6391)) ^ (-958036248);
                        i5 = 57018958;
                    }
                    break;
                case -910974020:
                case 323217305:
                    if (C23916.f77426 <= 0) {
                        iM2761 = (C0619.m2761("ۜ᩷") + i3) * 71;
                        i4 = ((iM2761 ^ i2) * (-14321)) ^ (-595808178);
                        i5 = -762395871;
                    } else {
                        iM2761 = (C0773.m3169("ܽ۫") + i3) * 37;
                        i4 = ((iM2761 ^ i2) * (-499)) ^ 1373204515;
                        i5 = 364271027;
                    }
                    break;
                case -804020908:
                case 944036868:
                    if (C0862.m3503()) {
                        iM2761 = C0619.m2761("ᩴ᩷") ^ i3;
                        i4 = ((iM2761 ^ i2) * 23743) ^ (-1449982901);
                        i5 = -318923580;
                    } else {
                        iM2761 = C0773.m3169("ۤ֨") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-29941)) ^ 1584696577;
                        i5 = -129719810;
                    }
                    break;
                case -637133598:
                case 208315897:
                    if (RunnableC0334.f1808 <= 0) {
                        iM2761 = C0773.m3169("ۤ֨") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-29941)) ^ 1584696577;
                        i5 = -129719810;
                    } else {
                        iM2761 = C0773.m3169("֡ۢ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-27249)) ^ (-1808013955);
                        i5 = -1879128370;
                    }
                    break;
                case -578308446:
                case -46247704:
                    C3077.m10041();
                    if (AbstractC3624.f12429 > 0) {
                        iM2761 = C0773.m3169("ۤ֨") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-29941)) ^ 1584696577;
                        i5 = -129719810;
                    } else {
                        iM2761 = (C0619.m2761("֫ۤ") ^ i2) * 45;
                        i4 = ((iM2761 ^ i3) * 6639) ^ (-620331854);
                        i5 = -1895865664;
                    }
                    break;
                case -320956469:
                case 2138732659:
                    if (C0269.f1558 <= 0) {
                        iM2761 = (i2 - C0773.m3169("ܰۨ")) * (-105);
                        i4 = ((iM2761 ^ i3) * 10705) ^ (-2099820769);
                        i5 = -680118325;
                    } else {
                        iM2761 = C0619.m2761("ۛܺ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 6295) ^ (-1208934018);
                        i5 = 1357487510;
                    }
                    break;
                case 283506691:
                case 396044636:
                    if (RunnableC3646.m11801(1, str) == '}') {
                        iM2761 = (i3 - C0619.m2761("ۧ۟")) * (-25);
                        i4 = ((iM2761 ^ i2) * 10373) ^ 67072601;
                        i5 = -1551949541;
                    } else {
                        charSequenceM3508 = charSequence;
                        iM2761 = (i2 - C0619.m2761("᩸ᩳ")) * (-69);
                        i4 = ((iM2761 ^ i3) * 25785) ^ 1871413021;
                        i5 = -2130130835;
                    }
                    break;
                case 324215957:
                case 1992432382:
                    if (C3734.f12817 >= 0) {
                        iM2761 = C0773.m3169("ۤ֨") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-29941)) ^ 1584696577;
                        i5 = -129719810;
                    } else {
                        iM2761 = (i2 - C0773.m3169("ܺۢ")) * 83;
                        i4 = ((iM2761 ^ i3) * (-9205)) ^ 820362173;
                        i5 = -372685784;
                    }
                    break;
                case 404502519:
                case 897866840:
                    if (C1343.m4937(str, 0) == '{') {
                        iM2761 = C0619.m2761("ۛܳ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-19809)) ^ 1733265548;
                        i5 = -811879548;
                    } else {
                        charSequenceM3508 = charSequence;
                        iM2761 = (i2 - C0619.m2761("᩸ᩳ")) * (-69);
                        i4 = ((iM2761 ^ i3) * 25785) ^ 1871413021;
                        i5 = -2130130835;
                    }
                    break;
                case 658172549:
                case 2120885535:
                    C1321.m4852();
                    if (C20932.f66974 > 0) {
                        iM2761 = (C0619.m2761("֫ۤ") ^ i2) * 45;
                        i4 = ((iM2761 ^ i3) * 6639) ^ (-620331854);
                        i5 = -1895865664;
                    } else {
                        iM2761 = C0619.m2761("ᩳܽ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-6391)) ^ (-958036248);
                        i5 = 57018958;
                    }
                    break;
                case 1136021057:
                case 1350624144:
                    if (C0269.f1558 <= 0) {
                        iM2761 = (i2 - C0773.m3169("ܰۨ")) * (-105);
                        i4 = ((iM2761 ^ i3) * 10705) ^ (-2099820769);
                        i5 = -680118325;
                    } else {
                        iM2761 = (C0619.m2761("᩹ۤ") ^ i3) * (-97);
                        i4 = ((iM2761 ^ i2) * (-27185)) ^ 283695088;
                        i5 = -354924021;
                    }
                    break;
                default:
                    if (C0950.m3785() != 0) {
                        iM2761 = (i2 - C0773.m3169("ܰۨ")) * (-105);
                        i4 = ((iM2761 ^ i3) * 10705) ^ (-2099820769);
                        i5 = -680118325;
                    } else {
                        iM2761 = (C0773.m3169("᩷ۜ") ^ i3) * (-15);
                        i4 = ((iM2761 ^ i2) * (-29067)) ^ (-484199109);
                        i5 = -2123914650;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m47732(String str, Object... objArr) {
        Resources resourcesM49055 = null;
        Configuration configuration = null;
        Locale locale = null;
        int i = -2006970398;
        int i2 = C2288.f7433;
        int i3 = RunnableC3055.f9898;
        int iM2761 = C0619.m2761("֨ۡ") ^ i3;
        int i4 = ((iM2761 ^ i2) * 13429) ^ (-1916630949);
        int i5 = 1301874009;
        while (true) {
            i = ((((i ^ i2) * (-5113)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2034566708:
                case -1610294807:
                    RunnableC3055.m9933();
                    if (!C3077.f9998) {
                        iM2761 = (C0619.m2761("ۙᩳ") ^ i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM2761 ^ i2) * 17071) ^ 854279828;
                        i5 = 1788022331;
                    } else {
                        iM2761 = C0773.m3169("ۚ۠") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-12451)) ^ 326045407;
                        i5 = -2095624473;
                    }
                    break;
                case -1970193850:
                case -576140075:
                    configuration = resourcesM49055.getConfiguration();
                    if (C3099.f10023 <= 0) {
                        iM2761 = C0773.m3169("ᩳۤ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 30921) ^ (-2118075076);
                        i5 = -2053592669;
                    } else {
                        iM2761 = (C0619.m2761("᩺ۡ") ^ i2) * 71;
                        i4 = ((iM2761 ^ i3) * 7799) ^ (-1293243816);
                        i5 = 385638861;
                    }
                    break;
                case -1847236659:
                case 1338003886:
                    if (RunnableC3646.f12471) {
                        iM2761 = C0773.m3169("֡ᩴ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 8481) ^ (-2054117553);
                        i5 = -1034537401;
                    } else {
                        iM2761 = (i2 - C0619.m2761("۟᩶")) * (-57);
                        i4 = ((iM2761 ^ i3) * (-32135)) ^ (-111015293);
                        i5 = 987214945;
                    }
                    break;
                case -1807448211:
                case -789639556:
                    C1080.m4050();
                    C3077.m10041();
                    return null;
                case -1676640806:
                case 1910883740:
                    C2375.m8065();
                    if (C3448.f11240 < 0) {
                        iM2761 = C0773.m3169("֡ᩴ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 8481) ^ (-2054117553);
                        i5 = -1034537401;
                    } else {
                        iM2761 = C0773.m3169("ۚ۠") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-12451)) ^ 326045407;
                        i5 = -2095624473;
                    }
                    break;
                case -1601234631:
                case 1870951632:
                    if (C2354.f7599 >= 0) {
                        iM2761 = C0773.m3169("֡ᩴ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 8481) ^ (-2054117553);
                        i5 = -1034537401;
                    } else {
                        iM2761 = C0619.m2761("ܿܶ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 19311) ^ 923097020;
                        i5 = -1423815408;
                    }
                    break;
                case -1484438300:
                case 318589151:
                    if (C2375.f7641 <= 0) {
                        iM2761 = C0773.m3169("ۚ۠") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-12451)) ^ 326045407;
                        i5 = -2095624473;
                    } else {
                        iM2761 = C0619.m2761("֨ܰ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 13937) ^ 1535434571;
                        i5 = -2020070649;
                    }
                    break;
                case -779870924:
                case 1176867908:
                    if (C2834.m9344() >= 0) {
                        iM2761 = C0773.m3169("ۡ֨") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-27627)) ^ (-1344202928);
                        i5 = -1678120705;
                    } else {
                        iM2761 = (i2 - C0619.m2761("ۛ᩶")) * (-107);
                        i4 = ((iM2761 ^ i3) * 2749) ^ (-1989991069);
                        i5 = -1265539570;
                    }
                    break;
                case -720217610:
                case 557660587:
                    if (C3448.m11248() != 0) {
                        iM2761 = C0773.m3169("ۡ֨") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-27627)) ^ (-1344202928);
                        i5 = -1678120705;
                    } else {
                        iM2761 = (C0773.m3169("۬֫") + i3) * (-3);
                        i4 = ((iM2761 ^ i2) * 29421) ^ 1388195193;
                        i5 = 1270482956;
                    }
                    break;
                case -515525892:
                case 1711961568:
                    C1542.m5459();
                    C23916.m53419();
                    iM2761 = (C0619.m2761("ۙᩳ") ^ i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                    i4 = ((iM2761 ^ i2) * 17071) ^ 854279828;
                    i5 = 1788022331;
                    break;
                case -485752655:
                case 1553729796:
                    if (C2375.f7641 <= 0) {
                        iM2761 = C0773.m3169("ۡ֨") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-27627)) ^ (-1344202928);
                        i5 = -1678120705;
                    } else {
                        iM2761 = (C0773.m3169("ᩴᩴ") ^ i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM2761 ^ i2) * 5747) ^ (-651044632);
                        i5 = -1852118759;
                    }
                    break;
                case -439698734:
                case 176052824:
                    if (C2375.m8065() <= 0) {
                        iM2761 = C0773.m3169("ᩳۤ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 30921) ^ (-2118075076);
                        i5 = -2053592669;
                    } else {
                        iM2761 = (i3 - C0619.m2761("᩺᩺")) * 95;
                        i4 = ((iM2761 ^ i2) * (-30601)) ^ (-650500505);
                        i5 = -1717508744;
                    }
                    break;
                case 169643195:
                case 1658540640:
                    if (C2834.f9334 <= 0) {
                        iM2761 = C0773.m3169("֡ᩴ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 8481) ^ (-2054117553);
                        i5 = -1034537401;
                    } else {
                        iM2761 = C0619.m2761("᩸֡") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-12657)) ^ 615002617;
                        i5 = -1025637299;
                    }
                    break;
                case 674352477:
                case 1384343707:
                    Locale localeM30639 = C17487.m40989(configuration).m30639(0);
                    if (localeM30639 == null) {
                        iM2761 = C0619.m2761("۟ᩳ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-25313)) ^ 883259340;
                        i5 = 1362445180;
                    } else {
                        locale = localeM30639;
                        iM2761 = (i3 - C0773.m3169("ۛ۬")) * 101;
                        i4 = ((iM2761 ^ i2) * (-17839)) ^ 228415243;
                        i5 = -1451863634;
                    }
                    break;
                case 862423893:
                case 958083690:
                    locale = Locale.getDefault();
                    iM2761 = (i3 - C0773.m3169("ۛ۬")) * 101;
                    i4 = ((iM2761 ^ i2) * (-17839)) ^ 228415243;
                    i5 = -1451863634;
                    break;
                case 1094606147:
                case 1915876333:
                    resourcesM49055 = C21576.m49055();
                    if (C4282.f15546 <= 0) {
                        iM2761 = C0773.m3169("ۚ۠") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-12451)) ^ 326045407;
                        i5 = -2095624473;
                    } else {
                        iM2761 = (C0773.m3169("ܿ۫") + i3) * 65;
                        i4 = ((iM2761 ^ i2) * 10015) ^ (-1654049088);
                        i5 = -83584682;
                    }
                    break;
                case 1688689026:
                case 1871144182:
                    if (!RunnableC1848.f6235) {
                        iM2761 = (C0619.m2761("ۙᩳ") ^ i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM2761 ^ i2) * 17071) ^ 854279828;
                        i5 = 1788022331;
                    } else {
                        iM2761 = C0773.m3169("ۡ֨") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-27627)) ^ (-1344202928);
                        i5 = -1678120705;
                    }
                    break;
                default:
                    return String.format(locale, str, objArr);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x01fa A[PHI: r1 r6 r16 r17
      0x01fa: PHI (r1v6 char) = (r1v2 char), (r1v3 char), (r1v2 char), (r1v2 char) binds: [B:56:0x01f8, B:52:0x01d9, B:39:0x0144, B:8:0x0037] A[DONT_GENERATE, DONT_INLINE]
      0x01fa: PHI (r6v6 int) = (r6v2 int), (r6v2 int), (r6v3 int), (r6v2 int) binds: [B:56:0x01f8, B:52:0x01d9, B:39:0x0144, B:8:0x0037] A[DONT_GENERATE, DONT_INLINE]
      0x01fa: PHI (r16v18 int) = (r16v8 int), (r16v9 int), (r16v12 int), (r16v19 int) binds: [B:56:0x01f8, B:52:0x01d9, B:39:0x0144, B:8:0x0037] A[DONT_GENERATE, DONT_INLINE]
      0x01fa: PHI (r17v20 short) = (r17v7 short), (r17v8 short), (r17v10 short), (r17v21 short) binds: [B:56:0x01f8, B:52:0x01d9, B:39:0x0144, B:8:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0047, code lost:
    
        if (l.C23916.m53419() == 0) goto L12;
     */
    @Override // bin.mt.plugin.api.PluginContext
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final bin.mt.plugin.api.LocalString getLocalString() {
        /*
            Method dump skipped, instruction units count: 844
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C20889.getLocalString():bin.mt.plugin.api.LocalString");
    }

    @Override // bin.mt.plugin.api.PluginContext
    @Deprecated
    public final LocalString getAssetLocalString(String str) {
        return m47736(str);
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final void openBuiltinBrowser(final String str, final boolean z) {
        int i = -20904392;
        int i2 = C1321.f4751;
        int i3 = C3099.f10023;
        int iM2761 = C0619.m2761("ܿۖ") ^ i3;
        int i4 = ((iM2761 ^ i2) * 4221) ^ 525543435;
        int i5 = 1603730820;
        while (true) {
            i = ((((i ^ i2) * 32489) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2128300908:
                case 2122290503:
                    if (C0487.f2131 <= 0) {
                        iM2761 = C0773.m3169("᩵ܿ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 31247) ^ 1796219675;
                        i5 = -1283742933;
                    } else {
                        iM2761 = C0619.m2761("ܺ᩸") ^ i3;
                        i4 = ((iM2761 ^ i2) * 3049) ^ (-181952099);
                        i5 = 1762741952;
                    }
                    break;
                case -1972706636:
                case 892583830:
                    C11235.m28309();
                    iM2761 = (i2 - C0773.m3169("۟ۨ")) * 19;
                    i4 = ((iM2761 ^ i3) * 19359) ^ 932764422;
                    i5 = 777861181;
                    break;
                case -1868735105:
                case -1477856483:
                    if (C2834.f9334 <= 0) {
                        iM2761 = (C0773.m3169("᩻۟") + i3) * (-125);
                        i4 = ((iM2761 ^ i2) * (-10105)) ^ (-1849843679);
                        i5 = -388709816;
                    } else {
                        iM2761 = (i3 - C0619.m2761("᩹ܿ")) * (-13);
                        i4 = ((iM2761 ^ i2) * (-29739)) ^ 57671057;
                        i5 = 624298123;
                    }
                    break;
                case -1711479847:
                case -351906275:
                    ThreadUtil.runOnUiThread(new Runnable(this) { // from class: l.ܶ᩺֫

                        /* JADX INFO: renamed from: ܶ֨ۛ, reason: not valid java name and contains not printable characters */
                        private static final short[] f53259 = {2177, -23184, -23177, -23191, -23178, -23187, -23190, -23182, -23215, -23188, -23183, -23191, -23200};

                        /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ C20889 f53260;

                        {
                            int i6 = 2021227759;
                            int i7 = C3099.f10023;
                            int i8 = C1564.f5401;
                            int iM2762 = C0619.m2761("᩸ۘ") ^ i8;
                            int i9 = ((iM2762 ^ i7) * (-581)) ^ 1575386456;
                            int i10 = -1297990386;
                            while (true) {
                                i6 = ((((i6 ^ i7) * 3619) >> 31) & i9) ^ (iM2762 ^ i10);
                                switch (i6) {
                                    case -2121792110:
                                    case -935925795:
                                        this.f53260 = this;
                                        if (C2288.f7433 <= 0) {
                                            iM2762 = (i7 - C0619.m2761("۠ۖ")) * 33;
                                            i9 = ((iM2762 ^ i8) * (-7945)) ^ 1743171272;
                                            i10 = -1222634677;
                                        } else {
                                            iM2762 = (C0773.m3169("᩹ܺ") + i7) * (-89);
                                            i9 = ((iM2762 ^ i8) * (-6923)) ^ 185133022;
                                            i10 = -67573763;
                                        }
                                        break;
                                    case -1787589782:
                                    case -1656117712:
                                        if (C1343.f4799 != 0) {
                                            iM2762 = (C0619.m2761("ۨܺ") ^ i8) * (-107);
                                            i9 = ((iM2762 ^ i7) * (-14005)) ^ 452880412;
                                            i10 = 399089182;
                                        } else {
                                            iM2762 = C0773.m3169("᩶᩺") ^ i8;
                                            i9 = ((iM2762 ^ i7) * 31179) ^ 1386831047;
                                            i10 = 1996550052;
                                        }
                                        break;
                                    case -1739925532:
                                    case 401306072:
                                        if (C3099.f10023 <= 0) {
                                            iM2762 = (C0773.m3169("۬֡") ^ i7) * 7;
                                            i9 = ((iM2762 ^ i8) * 10561) ^ 791772554;
                                            i10 = 314811762;
                                        } else {
                                            iM2762 = (C0619.m2761("ᩳۚ") + i7) * 51;
                                            i9 = ((iM2762 ^ i8) * (-14553)) ^ 205831723;
                                            i10 = 879605649;
                                        }
                                        break;
                                    case -1388238394:
                                    case 1393762385:
                                        if (C17202.f56030) {
                                            iM2762 = (C0773.m3169("ۢ᩵") ^ i8) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                                            i9 = ((iM2762 ^ i7) * (-4781)) ^ (-1458239828);
                                            i10 = 1740814792;
                                        } else {
                                            iM2762 = (i7 - C0619.m2761("۠ۖ")) * 33;
                                            i9 = ((iM2762 ^ i8) * (-7945)) ^ 1743171272;
                                            i10 = -1222634677;
                                        }
                                        break;
                                    case -1308626484:
                                    case 626897272:
                                        if (AbstractC0641.m2813() <= 0) {
                                            iM2762 = (C0773.m3169("۬֡") ^ i7) * 7;
                                            i9 = ((iM2762 ^ i8) * 10561) ^ 791772554;
                                            i10 = 314811762;
                                        } else {
                                            iM2762 = C0773.m3169("ܶܽ") ^ i8;
                                            i9 = ((iM2762 ^ i7) * (-26901)) ^ (-123485060);
                                            i10 = -404840124;
                                        }
                                        break;
                                    case -1167586778:
                                    case -27905585:
                                        if (C3099.f10023 <= 0) {
                                            iM2762 = (C0773.m3169("۬֡") ^ i7) * 7;
                                            i9 = ((iM2762 ^ i8) * 10561) ^ 791772554;
                                            i10 = 314811762;
                                        } else {
                                            iM2762 = (C0773.m3169("֨ۤ") + i8) * (-89);
                                            i9 = ((iM2762 ^ i7) * 16167) ^ (-1076768198);
                                            i10 = -1161593152;
                                        }
                                        break;
                                    case -905399535:
                                    case 2032835520:
                                        if (C3033.f9831 >= 0) {
                                            iM2762 = (i7 - C0619.m2761("۠ۖ")) * 33;
                                            i9 = ((iM2762 ^ i8) * (-7945)) ^ 1743171272;
                                            i10 = -1222634677;
                                        } else {
                                            iM2762 = (C0773.m3169("ܳᩴ") + i8) * 11;
                                            i9 = ((iM2762 ^ i7) * (-30159)) ^ (-1201782290);
                                            i10 = -1197063495;
                                        }
                                        break;
                                    case -721415189:
                                    case 723268166:
                                        AbstractC3624.m11755();
                                        if (AbstractC0641.f2496 >= 0) {
                                            iM2762 = C0773.m3169("۟ۘ") ^ i8;
                                            i9 = ((iM2762 ^ i7) * (-18269)) ^ 2127698296;
                                            i10 = 1972034166;
                                        } else {
                                            iM2762 = (C0773.m3169("ᩳᩳ") ^ i7) * 31;
                                            i9 = ((iM2762 ^ i8) * (-20103)) ^ (-1968275289);
                                            i10 = -1630474312;
                                        }
                                        break;
                                    case -709499941:
                                    case 1435067862:
                                        C2702.m8876();
                                        if (AbstractC3624.f12429 <= 0) {
                                            iM2762 = (C0619.m2761("ۨܺ") ^ i8) * (-107);
                                            i9 = ((iM2762 ^ i7) * (-14005)) ^ 452880412;
                                            i10 = 399089182;
                                        } else {
                                            iM2762 = C0773.m3169("۟ۘ") ^ i8;
                                            i9 = ((iM2762 ^ i7) * (-18269)) ^ 2127698296;
                                            i10 = 1972034166;
                                        }
                                        break;
                                    case -634367191:
                                    case 290300922:
                                        return;
                                    case -194474208:
                                    case 253616156:
                                        C1826.m6301();
                                        iM2762 = (C0773.m3169("ᩳᩳ") ^ i7) * 31;
                                        i9 = ((iM2762 ^ i8) * (-20103)) ^ (-1968275289);
                                        i10 = -1630474312;
                                        break;
                                    case -63492571:
                                    case 509006129:
                                        if (C2834.f9334 <= 0) {
                                            iM2762 = C0773.m3169("۟ۘ") ^ i8;
                                            i9 = ((iM2762 ^ i7) * (-18269)) ^ 2127698296;
                                            i10 = 1972034166;
                                        } else {
                                            iM2762 = (C0619.m2761("᩵ܽ") + i7) * (-29);
                                            i9 = ((iM2762 ^ i8) * 27137) ^ 816527749;
                                            i10 = 1718694894;
                                        }
                                        break;
                                    case 267987044:
                                    case 791939170:
                                        C2354.m7983();
                                        throw new RuntimeException();
                                    case 519331019:
                                    case 2029824919:
                                        if (AbstractC0116.m1243() != 0) {
                                            iM2762 = (i7 - C0619.m2761("۠ۖ")) * 33;
                                            i9 = ((iM2762 ^ i8) * (-7945)) ^ 1743171272;
                                            i10 = -1222634677;
                                        } else {
                                            iM2762 = C0773.m3169("۟ۘ") ^ i8;
                                            i9 = ((iM2762 ^ i7) * (-18269)) ^ 2127698296;
                                            i10 = 1972034166;
                                        }
                                        break;
                                    case 1071073686:
                                    case 1086161512:
                                        if (RunnableC1848.f6235) {
                                            iM2762 = C0773.m3169("۟ۘ") ^ i8;
                                            i9 = ((iM2762 ^ i7) * (-18269)) ^ 2127698296;
                                            i10 = 1972034166;
                                        } else {
                                            iM2762 = C0773.m3169("ۖۢ") ^ i7;
                                            i9 = ((iM2762 ^ i8) * (-29025)) ^ (-867390386);
                                            i10 = -499504532;
                                        }
                                        break;
                                    default:
                                        if (C3033.m9845() <= 0) {
                                            iM2762 = (C0773.m3169("ᩳᩳ") ^ i7) * 31;
                                            i9 = ((iM2762 ^ i8) * (-20103)) ^ (-1968275289);
                                            i10 = -1630474312;
                                        } else {
                                            iM2762 = (C0773.m3169("᩵ܰ") + i7) * (-53);
                                            i9 = ((iM2762 ^ i8) * (-26795)) ^ (-180571031);
                                            i10 = -821279829;
                                        }
                                        break;
                                }
                            }
                        }

                        /* JADX WARN: Code duplicated, block: B:92:0x034b A[PHI: r7 r8 r17 r18
                          0x034b: PHI (r7v3 int) = (r7v1 int), (r7v2 int), (r7v1 int) binds: [B:91:0x0349, B:71:0x0274, B:42:0x0104] A[DONT_GENERATE, DONT_INLINE]
                          0x034b: PHI (r8v3 int) = (r8v1 int), (r8v2 int), (r8v1 int) binds: [B:91:0x0349, B:71:0x0274, B:42:0x0104] A[DONT_GENERATE, DONT_INLINE]
                          0x034b: PHI (r17v23 java.lang.Throwable) = (r17v3 java.lang.Throwable), (r17v8 java.lang.Throwable), (r17v24 java.lang.Throwable) binds: [B:91:0x0349, B:71:0x0274, B:42:0x0104] A[DONT_GENERATE, DONT_INLINE]
                          0x034b: PHI (r18v22 int) = (r18v1 int), (r18v6 int), (r18v23 int) binds: [B:91:0x0349, B:71:0x0274, B:42:0x0104] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:96:0x037e A[PHI: r4 r5 r10 r17 r18
                          0x037e: PHI (r4v3 short[]) = (r4v2 short[]), (r4v1 short[]), (r4v1 short[]), (r4v1 short[]) binds: [B:95:0x037c, B:79:0x02ca, B:63:0x0218, B:27:0x00ac] A[DONT_GENERATE, DONT_INLINE]
                          0x037e: PHI (r5v3 char) = (r5v1 char), (r5v2 char), (r5v1 char), (r5v1 char) binds: [B:95:0x037c, B:79:0x02ca, B:63:0x0218, B:27:0x00ac] A[DONT_GENERATE, DONT_INLINE]
                          0x037e: PHI (r10v3 short) = (r10v1 short), (r10v1 short), (r10v2 short), (r10v1 short) binds: [B:95:0x037c, B:79:0x02ca, B:63:0x0218, B:27:0x00ac] A[DONT_GENERATE, DONT_INLINE]
                          0x037e: PHI (r17v27 java.lang.Throwable) = (r17v2 java.lang.Throwable), (r17v6 java.lang.Throwable), (r17v10 java.lang.Throwable), (r17v28 java.lang.Throwable) binds: [B:95:0x037c, B:79:0x02ca, B:63:0x0218, B:27:0x00ac] A[DONT_GENERATE, DONT_INLINE]
                          0x037e: PHI (r18v24 int) = (r18v0 int), (r18v4 int), (r18v8 int), (r18v25 int) binds: [B:95:0x037c, B:79:0x02ca, B:63:0x0218, B:27:0x00ac] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code restructure failed: missing block: B:15:0x005f, code lost:
                        
                            if (l.C3077.m10041() != false) goto L16;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:26:0x00aa, code lost:
                        
                            if (l.C0619.m2763() == false) goto L27;
                         */
                        @Override // java.lang.Runnable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void run() {
                            /*
                                Method dump skipped, instruction units count: 1154
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: l.RunnableC16413.run():void");
                        }
                    });
                    break;
                case -1647036431:
                case 879786663:
                    if (C3448.m11248() != 0) {
                        iM2761 = C0773.m3169("᩵ܿ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 31247) ^ 1796219675;
                        i5 = -1283742933;
                    } else {
                        iM2761 = (C0773.m3169("ܰ֫") + i2) * (-117);
                        i4 = ((iM2761 ^ i3) * (-2747)) ^ (-1681734691);
                        i5 = 984512849;
                    }
                    break;
                case -1196645128:
                case 367019834:
                    if (C3734.f12817 < 0) {
                        iM2761 = C0773.m3169("۠ۘ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-25571)) ^ (-1393448384);
                        i5 = 1469079642;
                    } else {
                        iM2761 = (C0619.m2761("ܺܰ") ^ i2) * 95;
                        i4 = ((iM2761 ^ i3) * 18367) ^ (-1230288656);
                        i5 = -296159478;
                    }
                    break;
                case -1150408611:
                case 1930787819:
                    C0950.m3785();
                    C3099.m10095();
                    break;
                case -991410187:
                case -242749469:
                    if (C1321.m4852()) {
                        iM2761 = (C0773.m3169("ۘ᩸") + i2) * (-53);
                        i4 = ((iM2761 ^ i3) * (-1861)) ^ (-632192516);
                        i5 = -1044568841;
                    } else {
                        iM2761 = C0773.m3169("᩵ܿ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 31247) ^ 1796219675;
                        i5 = -1283742933;
                    }
                    break;
                case -518583869:
                case 358125946:
                    if (C4282.m13644()) {
                        iM2761 = C0773.m3169("ۗܳ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-6785)) ^ (-1892895877);
                        i5 = -1286309977;
                    } else {
                        iM2761 = C0773.m3169("᩵ܿ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 31247) ^ 1796219675;
                        i5 = -1283742933;
                    }
                    break;
                case -13234748:
                case 560060482:
                    if (RunnableC1848.f6235) {
                        iM2761 = (i2 - C0773.m3169("۟ۨ")) * 19;
                        i4 = ((iM2761 ^ i3) * 19359) ^ 932764422;
                        i5 = 777861181;
                    } else {
                        iM2761 = (i2 - C0773.m3169("᩺᩹")) * 21;
                        i4 = ((iM2761 ^ i3) * 1131) ^ (-1299143080);
                        i5 = 1856803609;
                    }
                    break;
                case 130343029:
                case 230577436:
                    if (C4238.f15451 >= 0) {
                        iM2761 = C0773.m3169("᩵ܿ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 31247) ^ 1796219675;
                        i5 = -1283742933;
                    } else {
                        iM2761 = C0619.m2761("ۗۢ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 2973) ^ 623097848;
                        i5 = 2033449007;
                    }
                    break;
                case 264388900:
                case 855063029:
                    C2834.m9344();
                    if (C4238.m13540() <= 0) {
                        iM2761 = (C0773.m3169("᩻۟") + i3) * (-125);
                        i4 = ((iM2761 ^ i2) * (-10105)) ^ (-1849843679);
                        i5 = -388709816;
                    } else {
                        iM2761 = (i2 - C0773.m3169("۟ۨ")) * 19;
                        i4 = ((iM2761 ^ i3) * 19359) ^ 932764422;
                        i5 = 777861181;
                    }
                    break;
                case 826494520:
                case 1512366238:
                    if (C17202.m40372()) {
                        iM2761 = (i2 - C0773.m3169("᩸ۧ")) * 87;
                        i4 = ((iM2761 ^ i3) * 11517) ^ 219592476;
                        i5 = 17758181;
                    } else {
                        iM2761 = (C0773.m3169("᩻۟") + i3) * (-125);
                        i4 = ((iM2761 ^ i2) * (-10105)) ^ (-1849843679);
                        i5 = -388709816;
                    }
                    break;
                case 1008997273:
                case 1750015938:
                    if (C3448.m11248() == 0) {
                        iM2761 = C0773.m3169("۠ۘ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-25571)) ^ (-1393448384);
                        i5 = 1469079642;
                    } else {
                        iM2761 = (i2 - C0773.m3169("۟ۨ")) * 19;
                        i4 = ((iM2761 ^ i3) * 19359) ^ 932764422;
                        i5 = 777861181;
                    }
                    break;
                case 1133867166:
                case 1541579255:
                    if (C20932.f66974 <= 0) {
                        iM2761 = C0773.m3169("᩵ܿ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 31247) ^ 1796219675;
                        i5 = -1283742933;
                    } else {
                        iM2761 = (C0773.m3169("ۜۜ") + i3) * 47;
                        i4 = ((iM2761 ^ i2) * (-32229)) ^ 602867289;
                        i5 = -1476848027;
                    }
                    break;
                default:
                    if (C0619.f2439) {
                        iM2761 = (C0773.m3169("᩻۟") + i3) * (-125);
                        i4 = ((iM2761 ^ i2) * (-10105)) ^ (-1849843679);
                        i5 = -388709816;
                    } else {
                        iM2761 = (i2 - C0773.m3169("ۙۛ")) * (-45);
                        i4 = ((iM2761 ^ i3) * 22881) ^ (-700969106);
                        i5 = 912492751;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x01fb A[PHI: r3 r4 r5 r8 r16
      0x01fb: PHI (r3v3 char) = (r3v2 char), (r3v1 char), (r3v1 char) binds: [B:61:0x01f9, B:57:0x01db, B:49:0x019c] A[DONT_GENERATE, DONT_INLINE]
      0x01fb: PHI (r4v3 short) = (r4v1 short), (r4v2 short), (r4v1 short) binds: [B:61:0x01f9, B:57:0x01db, B:49:0x019c] A[DONT_GENERATE, DONT_INLINE]
      0x01fb: PHI (r5v3 short) = (r5v1 short), (r5v2 short), (r5v1 short) binds: [B:61:0x01f9, B:57:0x01db, B:49:0x019c] A[DONT_GENERATE, DONT_INLINE]
      0x01fb: PHI (r8v2 int) = (r8v1 int), (r8v1 int), (r8v3 int) binds: [B:61:0x01f9, B:57:0x01db, B:49:0x019c] A[DONT_GENERATE, DONT_INLINE]
      0x01fb: PHI (r16v11 int) = (r16v8 int), (r16v9 int), (r16v12 int) binds: [B:61:0x01f9, B:57:0x01db, B:49:0x019c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x023d A[PHI: r6 r7 r16
      0x023d: PHI (r6v5 int) = (r6v1 int), (r6v2 int), (r6v1 int), (r6v1 int) binds: [B:65:0x0227, B:53:0x01bb, B:6:0x003d, B:11:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x023d: PHI (r7v5 short) = (r7v1 short), (r7v2 short), (r7v1 short), (r7v1 short) binds: [B:65:0x0227, B:53:0x01bb, B:6:0x003d, B:11:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x023d: PHI (r16v31 int) = (r16v7 int), (r16v10 int), (r16v17 int), (r16v37 int) binds: [B:65:0x0227, B:53:0x01bb, B:6:0x003d, B:11:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private ClipboardManager m47731() {
        int i;
        int iM3169;
        int i2;
        int i3;
        int iM2761;
        int i4;
        int i5;
        C20889 c20889 = this;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i6 = 0;
        short s3 = 0;
        int i7 = 0;
        int i8 = 0;
        short[] sArr2 = null;
        int i9 = 0;
        int i10 = 0;
        int i11 = 1079220355;
        int i12 = C4282.f15546;
        int i13 = C3492.f12043;
        int iM2762 = (C0619.m2761("ܰ᩶") + i12) * 115;
        int i14 = ((iM2762 ^ i13) * (-31865)) ^ (-1699903889);
        int i15 = iM2762 ^ (-1799884017);
        String strM5399 = null;
        while (true) {
            i11 = i15 ^ (i14 & (((i11 ^ i13) * 32579) >> 31));
            switch (i11) {
                case -1903280478:
                case -1339297515:
                    strM5399 = C1519.m5399(sArr2, i9, i10, i8);
                    if (C2878.f9462) {
                        i3 = i8;
                        iM2761 = (C0619.m2761("᩻ܰ") ^ i12) * 55;
                        i4 = ((iM2761 ^ i13) * 18241) ^ 1759127305;
                        i5 = -147880858;
                    } else {
                        iM2761 = (C0773.m3169("۟ۤ") + i13) * (-63);
                        i3 = i8;
                        i4 = ((iM2761 ^ i12) * (-24419)) ^ 724697728;
                        i5 = -261045545;
                    }
                    int i16 = i3;
                    i15 = iM2761 ^ i5;
                    i14 = i4;
                    i8 = i16;
                    break;
                case -1901355674:
                case 1899749696:
                    i = i8;
                    if (C13473.f42873 != 0) {
                        iM3169 = (C0773.m3169("ۖܽ") + i13) * (-107);
                        i14 = ((iM3169 ^ i12) * 20711) ^ (-803095156);
                        i2 = 1591092444;
                    } else {
                        iM3169 = C0619.m2761("ۛ֨") ^ i12;
                        i14 = ((iM3169 ^ i13) * 4713) ^ 1602955864;
                        i2 = 964956219;
                    }
                    int i17 = iM3169 ^ i2;
                    i8 = i;
                    i15 = i17;
                    c20889 = this;
                    break;
                case -1872073677:
                case -1573301782:
                    i3 = i8;
                    sArr2 = f66857;
                    i9 = 1;
                    if (C2702.m8876()) {
                        iM2761 = (C0773.m3169("᩷۫") + i12) * 67;
                        i4 = ((iM2761 ^ i13) * (-30009)) ^ 148653196;
                        i5 = -596880019;
                    } else {
                        iM2761 = (C0619.m2761("᩻ܰ") ^ i12) * 55;
                        i4 = ((iM2761 ^ i13) * 18241) ^ 1759127305;
                        i5 = -147880858;
                    }
                    int i18 = i3;
                    i15 = iM2761 ^ i5;
                    i14 = i4;
                    i8 = i18;
                    break;
                case -1756965451:
                case 834731757:
                    i = i8;
                    s = sArr[c];
                    s2 = 13592;
                    if (C4282.f15546 <= 0) {
                        iM3169 = C0773.m3169("᩷۬") ^ i12;
                        i14 = ((iM3169 ^ i13) * (-10783)) ^ (-1766027527);
                        i2 = -1948195099;
                    } else {
                        iM3169 = C0619.m2761("ܳ۬") ^ i13;
                        i14 = ((iM3169 ^ i12) * (-4635)) ^ (-1451040011);
                        i2 = -620122350;
                    }
                    int i19 = iM3169 ^ i2;
                    i8 = i;
                    i15 = i19;
                    c20889 = this;
                    break;
                case -1699201431:
                case -1590757928:
                    RunnableC3055.m9933();
                    i3 = i8;
                    iM2761 = C0619.m2761("ۡ۬") ^ i12;
                    i4 = ((iM2761 ^ i13) * (-26355)) ^ 471731818;
                    i5 = 268694436;
                    int i110 = i3;
                    i15 = iM2761 ^ i5;
                    i14 = i4;
                    i8 = i110;
                    break;
                case -1354734939:
                case 359686453:
                    if (C3099.f10023 > 0) {
                        i = i8;
                        iM3169 = (C0773.m3169("ۖܽ") + i13) * (-107);
                        i14 = ((iM3169 ^ i12) * 20711) ^ (-803095156);
                        i2 = 1591092444;
                        int i111 = iM3169 ^ i2;
                        i8 = i;
                        i15 = i111;
                        c20889 = this;
                    } else {
                        i3 = i8;
                        iM2761 = (C0619.m2761("᩻ܰ") ^ i12) * 55;
                        i4 = ((iM2761 ^ i13) * 18241) ^ 1759127305;
                        i5 = -147880858;
                        int i112 = i3;
                        i15 = iM2761 ^ i5;
                        i14 = i4;
                        i8 = i112;
                    }
                    break;
                case -1162851900:
                case 1272962070:
                    i3 = i8;
                    i10 = 9;
                    if (RunnableC3055.f9898 >= 0) {
                        iM2761 = C0619.m2761("ۡ۬") ^ i12;
                        i4 = ((iM2761 ^ i13) * (-26355)) ^ 471731818;
                        i5 = 268694436;
                    } else {
                        iM2761 = C0773.m3169("ܺܽ") ^ i13;
                        i4 = ((iM2761 ^ i12) * (-4267)) ^ (-1815185796);
                        i5 = -1545762145;
                    }
                    int i113 = i3;
                    i15 = iM2761 ^ i5;
                    i14 = i4;
                    i8 = i113;
                    break;
                case -1160510311:
                case -515300370:
                    i = i8;
                    sArr = f66857;
                    if (C1146.f4234 >= 0) {
                        iM3169 = (i13 - C0619.m2761("᩻᩷")) * (-103);
                        i14 = ((iM3169 ^ i12) * 1663) ^ 1799952993;
                        i2 = 1671685964;
                    } else {
                        iM3169 = C0773.m3169("ۘ᩺") ^ i12;
                        i14 = ((iM3169 ^ i13) * (-22755)) ^ (-1462224339);
                        i2 = 1943443418;
                    }
                    int i114 = iM3169 ^ i2;
                    i8 = i;
                    i15 = i114;
                    c20889 = this;
                    break;
                case -922757694:
                case 1131511054:
                    i = i8;
                    i6 = s * s2;
                    s3 = 3398;
                    if (C3492.f12043 <= 0) {
                        iM3169 = (C0773.m3169("ۖܽ") + i13) * (-107);
                        i14 = ((iM3169 ^ i12) * 20711) ^ (-803095156);
                        i2 = 1591092444;
                    } else {
                        iM3169 = C0619.m2761("᩸֡") ^ i12;
                        i14 = ((iM3169 ^ i13) * 12479) ^ 2057501151;
                        i2 = 460611482;
                    }
                    int i115 = iM3169 ^ i2;
                    i8 = i;
                    i15 = i115;
                    c20889 = this;
                    break;
                case -863247530:
                case -429289479:
                    c20889.f66870 = (ClipboardManager) C21576.m49087(strM5399);
                    i3 = i8;
                    iM2761 = C0773.m3169("ۙܳ") ^ i12;
                    i4 = ((iM2761 ^ i13) * 25783) ^ (-952721579);
                    i5 = 983725389;
                    int i116 = i3;
                    i15 = iM2761 ^ i5;
                    i14 = i4;
                    i8 = i116;
                    break;
                case -577932174:
                case 2033750080:
                    i3 = i8;
                    if (c20889.f66870 == null) {
                        iM2761 = (C0619.m2761("ܰ֨") + i13) * (-97);
                        i4 = ((iM2761 ^ i12) * (-1377)) ^ 2100520239;
                        i5 = -11376020;
                    } else {
                        iM2761 = C0773.m3169("ۙܳ") ^ i12;
                        i4 = ((iM2761 ^ i13) * 25783) ^ (-952721579);
                        i5 = 983725389;
                    }
                    int i117 = i3;
                    i15 = iM2761 ^ i5;
                    i14 = i4;
                    i8 = i117;
                    break;
                case -554620049:
                case -221976548:
                    i8 = 22415;
                    int iM31610 = (C0773.m3169("ۙ᩵") + i13) * 15;
                    i15 = iM31610 ^ 1387904139;
                    i14 = ((iM31610 ^ i12) * 11551) ^ 1301809616;
                    c20889 = this;
                    break;
                case -399086234:
                case 693346662:
                    if (C2702.f8586 <= 0) {
                        i = i8;
                        iM3169 = (i13 - C0619.m2761("᩻᩷")) * (-103);
                        i14 = ((iM3169 ^ i12) * 1663) ^ 1799952993;
                        i2 = 1671685964;
                        int i118 = iM3169 ^ i2;
                        i8 = i;
                        i15 = i118;
                        c20889 = this;
                    } else {
                        i3 = i8;
                        iM2761 = C0619.m2761("ۡ۬") ^ i12;
                        i4 = ((iM2761 ^ i13) * (-26355)) ^ 471731818;
                        i5 = 268694436;
                        int i119 = i3;
                        i15 = iM2761 ^ i5;
                        i14 = i4;
                        i8 = i119;
                    }
                    break;
                case -112788884:
                case 1485302787:
                    C2375.m8065();
                    if (C2419.f7754 < 0) {
                        i3 = i8;
                        iM2761 = (C0619.m2761("᩻ܰ") ^ i12) * 55;
                        i4 = ((iM2761 ^ i13) * 18241) ^ 1759127305;
                        i5 = -147880858;
                        int i1110 = i3;
                        i15 = iM2761 ^ i5;
                        i14 = i4;
                        i8 = i1110;
                    } else {
                        i = i8;
                        iM3169 = (i13 - C0619.m2761("᩻᩷")) * (-103);
                        i14 = ((iM3169 ^ i12) * 1663) ^ 1799952993;
                        i2 = 1671685964;
                        int i1111 = iM3169 ^ i2;
                        i8 = i;
                        i15 = i1111;
                        c20889 = this;
                    }
                    break;
                case -90040099:
                case 503386402:
                    return c20889.f66870;
                case -8770942:
                case 489125123:
                    i = i8;
                    c = 0;
                    if (AbstractC3624.m11755() != 0) {
                        iM3169 = C0773.m3169("᩷۬") ^ i12;
                        i14 = ((iM3169 ^ i13) * (-10783)) ^ (-1766027527);
                        i2 = -1948195099;
                    } else {
                        iM3169 = C0773.m3169("ܺ᩷") ^ i13;
                        i14 = ((iM3169 ^ i12) * (-11625)) ^ (-1878113105);
                        i2 = 574003289;
                    }
                    int i1112 = iM3169 ^ i2;
                    i8 = i;
                    i15 = i1112;
                    c20889 = this;
                    break;
                case 501153915:
                case 882938010:
                    C2354.m7983();
                    C17202.m40372();
                    return null;
                case 728592050:
                case 1070914214:
                    i = i8;
                    i7 = s + s3;
                    if (C3492.f12043 <= 0) {
                        iM3169 = C0773.m3169("᩷۬") ^ i12;
                        i14 = ((iM3169 ^ i13) * (-10783)) ^ (-1766027527);
                        i2 = -1948195099;
                    } else {
                        iM3169 = C0773.m3169("֫᩶") ^ i13;
                        i14 = ((iM3169 ^ i12) * (-17379)) ^ 1553854474;
                        i2 = 1893815627;
                    }
                    int i1113 = iM3169 ^ i2;
                    i8 = i;
                    i15 = i1113;
                    c20889 = this;
                    break;
                case 1293883224:
                case 1662452649:
                    i = i8;
                    if ((i7 * i7) - i6 < 0) {
                        iM3169 = (C0773.m3169("ۢۙ") ^ i12) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i14 = ((iM3169 ^ i13) * 32443) ^ 558951226;
                        i2 = -219158163;
                    } else {
                        iM3169 = (C0619.m2761("ۘܿ") ^ i12) * (-95);
                        i14 = ((iM3169 ^ i13) * 1063) ^ 2129074945;
                        i2 = 349886579;
                    }
                    int i1114 = iM3169 ^ i2;
                    i8 = i;
                    i15 = i1114;
                    c20889 = this;
                    break;
                case 1938252225:
                case 2143869821:
                    i8 = 36817;
                    int iM31611 = (C0773.m3169("ۙ᩵") + i13) * 15;
                    i15 = iM31611 ^ 1387904139;
                    i14 = ((iM31611 ^ i12) * 11551) ^ 1301809616;
                    c20889 = this;
                    break;
                default:
                    i = i8;
                    if (RunnableC3055.f9898 >= 0) {
                        iM3169 = (C0773.m3169("ۖܽ") + i13) * (-107);
                        i14 = ((iM3169 ^ i12) * 20711) ^ (-803095156);
                        i2 = 1591092444;
                    } else {
                        iM3169 = C0619.m2761("ۙᩴ") ^ i13;
                        i14 = ((iM3169 ^ i12) * 3303) ^ 194861015;
                        i2 = -1654788332;
                    }
                    int i1115 = iM3169 ^ i2;
                    i8 = i;
                    i15 = i1115;
                    c20889 = this;
                    break;
            }
        }
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final LocalString getLanguageNameLocalString() {
        return C5448.m16285();
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final File getFilesDir() {
        AbstractC22044 abstractC22044 = null;
        int i = 2133506026;
        int i2 = C3033.f9831;
        int i3 = C1321.f4751;
        int iM2761 = C0619.m2761("ۜ᩶") ^ i2;
        int i4 = ((iM2761 ^ i3) * 2517) ^ (-1855133157);
        int i5 = 631274539;
        while (true) {
            i = ((((i ^ i3) * 28299) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2123013424:
                case -1066554973:
                    if (C1826.m6303(abstractC22044)) {
                        iM2761 = C0773.m3169("ۘܺ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-9019)) ^ (-327566690);
                        i5 = -959375021;
                    } else {
                        iM2761 = C0619.m2761("ۙᩴ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 16529) ^ (-601557242);
                        i5 = 1665990104;
                    }
                    break;
                case -2108888887:
                case -1378575728:
                    if (C2288.f7433 <= 0) {
                        iM2761 = (i2 - C0773.m3169("ۚܿ")) * (-115);
                        i4 = ((iM2761 ^ i3) * 20061) ^ 1252291851;
                        i5 = 604864268;
                    } else {
                        iM2761 = C0619.m2761("֫ۤ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 28211) ^ (-1639948691);
                        i5 = -975466616;
                    }
                    break;
                case -2004713917:
                case -1050229617:
                    if (C1343.f4799 == 0) {
                        iM2761 = (i2 - C0773.m3169("ۚܿ")) * (-115);
                        i4 = ((iM2761 ^ i3) * 20061) ^ 1252291851;
                        i5 = 604864268;
                    } else {
                        iM2761 = C0773.m3169("ۛ᩺") ^ i2;
                        i4 = ((iM2761 ^ i3) * 32537) ^ (-1452795512);
                        i5 = -1536792713;
                    }
                    break;
                case -1995485654:
                case 372155012:
                    C4282.m13644();
                    C2023.m6964();
                    return null;
                case -1262842796:
                case 1893005261:
                    if (RunnableC3055.f9898 >= 0) {
                        iM2761 = C0773.m3169("᩺᩵") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-10555)) ^ 1848002652;
                        i5 = 351930614;
                    } else {
                        iM2761 = C0773.m3169("᩺᩸") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-22553)) ^ 1933414106;
                        i5 = 1727412710;
                    }
                    break;
                case -897797989:
                case 21413991:
                    abstractC22044 = this.f66871;
                    if (C23916.f77426 <= 0) {
                        iM2761 = C0773.m3169("᩺᩵") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-10555)) ^ 1848002652;
                        i5 = 351930614;
                    } else {
                        iM2761 = (i2 - C0619.m2761("ۘ֨")) * 37;
                        i4 = ((iM2761 ^ i3) * (-16359)) ^ 1021974747;
                        i5 = 2033858002;
                    }
                    break;
                case -745825968:
                case 1013945050:
                    if (RunnableC1848.f6235) {
                        iM2761 = C0773.m3169("ۗۜ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-3197)) ^ 1309299280;
                        i5 = 1744748817;
                    } else {
                        iM2761 = (C0773.m3169("ۙܿ") + i3) * 55;
                        i4 = ((iM2761 ^ i2) * 8349) ^ 1277173666;
                        i5 = -1814432346;
                    }
                    break;
                case -715614144:
                case 1690233788:
                    if (C1080.f3865 >= 0) {
                        iM2761 = (i2 - C0773.m3169("ۚܿ")) * (-115);
                        i4 = ((iM2761 ^ i3) * 20061) ^ 1252291851;
                        i5 = 604864268;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ܺۨ")) * (-79);
                        i4 = ((iM2761 ^ i2) * 8677) ^ (-1197207750);
                        i5 = 1103675547;
                    }
                    break;
                case -690844442:
                case -207994481:
                    if (C1343.m4943()) {
                        iM2761 = C0619.m2761("֡ۨ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-17691)) ^ (-562848903);
                        i5 = 1458496969;
                    } else {
                        iM2761 = C0773.m3169("᩺᩵") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-10555)) ^ 1848002652;
                        i5 = 351930614;
                    }
                    break;
                case -388673158:
                case 1490999441:
                    if (C2375.f7641 <= 0) {
                        iM2761 = C0773.m3169("ۗۜ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-3197)) ^ 1309299280;
                        i5 = 1744748817;
                    } else {
                        iM2761 = (C0773.m3169("ܺܳ") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM2761 ^ i3) * 18737) ^ 238835111;
                        i5 = 738692533;
                    }
                    break;
                case -260665387:
                case -202686622:
                    if (AbstractC3624.f12429 <= 0) {
                        iM2761 = C0773.m3169("ۛ᩺") ^ i2;
                        i4 = ((iM2761 ^ i3) * 32537) ^ (-1452795512);
                        i5 = -1536792713;
                    } else {
                        iM2761 = C0773.m3169("ۜۛ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 1107) ^ (-874525336);
                        i5 = -792332713;
                    }
                    break;
                case -81435545:
                case 900342569:
                    if (C2834.f9334 > 0) {
                        iM2761 = C0773.m3169("ۗۜ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-3197)) ^ 1309299280;
                        i5 = 1744748817;
                    } else {
                        iM2761 = (i2 - C0773.m3169("ۚܿ")) * (-115);
                        i4 = ((iM2761 ^ i3) * 20061) ^ 1252291851;
                        i5 = 604864268;
                    }
                    break;
                case 226886751:
                case 1665394282:
                    if (AbstractC0641.f2496 >= 0) {
                        iM2761 = C0773.m3169("ۗۜ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-3197)) ^ 1309299280;
                        i5 = 1744748817;
                    } else {
                        iM2761 = C0619.m2761("ܺۖ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-21157)) ^ 1193637987;
                        i5 = -1956499766;
                    }
                    break;
                case 242756564:
                case 1270524450:
                    RunnableC1848.m6360();
                    C2310.m7813();
                    iM2761 = (C0773.m3169("ۘ᩺") + i3) * (-113);
                    i4 = ((iM2761 ^ i2) * (-11523)) ^ (-187216997);
                    i5 = -15512807;
                    break;
                case 628184704:
                case 1058606722:
                    if (C2310.f7472 >= 0) {
                        iM2761 = C0773.m3169("᩺᩵") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-10555)) ^ 1848002652;
                        i5 = 351930614;
                    } else {
                        iM2761 = C0773.m3169("֡ۤ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-12779)) ^ 1750809603;
                        i5 = -1626840828;
                    }
                    break;
                case 902360660:
                case 1685314253:
                    C2702.m8876();
                    if (C1080.f3865 >= 0) {
                        iM2761 = C0773.m3169("ۛ᩺") ^ i2;
                        i4 = ((iM2761 ^ i3) * 32537) ^ (-1452795512);
                        i5 = -1536792713;
                    } else {
                        iM2761 = (C0773.m3169("ۘ᩺") + i3) * (-113);
                        i4 = ((iM2761 ^ i2) * (-11523)) ^ (-187216997);
                        i5 = -15512807;
                    }
                    break;
                case 1206765419:
                case 1615404362:
                    return new File(C1146.m4220(abstractC22044));
                default:
                    abstractC22044.mo4274();
                    iM2761 = C0773.m3169("ۘܺ") ^ i3;
                    i4 = ((iM2761 ^ i2) * (-9019)) ^ (-327566690);
                    i5 = -959375021;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0367 A[PHI: r11 r16 r18
      0x0367: PHI (r11v4 int) = (r11v2 int), (r11v2 int), (r11v3 int), (r11v2 int) binds: [B:104:0x0365, B:100:0x0346, B:75:0x0246, B:15:0x007f] A[DONT_GENERATE, DONT_INLINE]
      0x0367: PHI (r16v35 int) = (r16v3 int), (r16v4 int), (r16v8 int), (r16v37 int) binds: [B:104:0x0365, B:100:0x0346, B:75:0x0246, B:15:0x007f] A[DONT_GENERATE, DONT_INLINE]
      0x0367: PHI (r18v35 short[]) = (r18v1 short[]), (r18v2 short[]), (r18v6 short[]), (r18v38 short[]) binds: [B:104:0x0365, B:100:0x0346, B:75:0x0246, B:15:0x007f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:110:0x039b A[PHI: r5 r6 r16
      0x039b: PHI (r5v59 short[]) = (r5v55 short[]), (r5v2 short[]), (r5v60 short[]) binds: [B:91:0x02e6, B:37:0x0101, B:88:0x02c6] A[DONT_GENERATE, DONT_INLINE]
      0x039b: PHI (r6v3 char) = (r6v2 char), (r6v2 char), (r6v4 char) binds: [B:91:0x02e6, B:37:0x0101, B:88:0x02c6] A[DONT_GENERATE, DONT_INLINE]
      0x039b: PHI (r16v28 int) = (r16v20 int), (r16v22 int), (r16v29 int) binds: [B:91:0x02e6, B:37:0x0101, B:88:0x02c6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x00e6 A[PHI: r16
      0x00e6: PHI (r16v36 int) = (r16v23 int), (r16v24 int), (r16v34 int), (r16v37 int) binds: [B:33:0x00e3, B:29:0x00c7, B:134:0x00e6, B:133:0x00e6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x010c A[PHI: r16
      0x010c: PHI (r16v25 int) = (r16v21 int), (r16v22 int), (r16v23 int), (r16v26 int) binds: [B:39:0x0104, B:37:0x0101, B:33:0x00e3, B:25:0x00a5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:97:0x0313 A[PHI: r9 r10 r16 r18
      0x0313: PHI (r9v5 int) = (r9v2 int), (r9v3 int), (r9v2 int), (r9v2 int) binds: [B:96:0x0311, B:79:0x0268, B:23:0x009b, B:10:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x0313: PHI (r10v5 short) = (r10v2 short), (r10v3 short), (r10v2 short), (r10v2 short) binds: [B:96:0x0311, B:79:0x0268, B:23:0x009b, B:10:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x0313: PHI (r16v40 int) = (r16v5 int), (r16v7 int), (r16v32 int), (r16v44 int) binds: [B:96:0x0311, B:79:0x0268, B:23:0x009b, B:10:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x0313: PHI (r18v40 short[]) = (r18v3 short[]), (r18v5 short[]), (r18v32 short[]), (r18v42 short[]) binds: [B:96:0x0311, B:79:0x0268, B:23:0x009b, B:10:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47734(C20889 c20889, Class cls) {
        int iM2761;
        int i;
        int i2;
        int iM3169;
        int i3;
        int i4;
        int i5 = C3690.f12684;
        int i6 = C3779.f12953;
        int iM31610 = C0773.m3169("᩺᩹") ^ i6;
        int i7 = ((iM31610 ^ i5) * 14473) ^ 1347480316;
        short[] sArr = null;
        int i8 = iM31610 ^ (-1080107962);
        Intent intent = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i9 = 0;
        short s3 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 1306812091;
        Throwable th = null;
        Application applicationM10096 = null;
        while (true) {
            int i13 = i8 ^ (i7 & (((i12 ^ i5) * 21705) >> 31));
            switch (i13) {
                case -2051302673:
                case -881552239:
                    i13 = i13;
                    if (C4238.f15451 < 0) {
                        iM3169 = C0619.m2761("ۛܳ") ^ i5;
                        i3 = ((iM3169 ^ i6) * 2289) ^ 753556130;
                        i4 = -960740171;
                    } else {
                        iM3169 = (C0619.m2761("ܿ᩷") ^ i6) * 53;
                        i3 = ((iM3169 ^ i5) * 24015) ^ 1347808638;
                        i4 = -1928389934;
                    }
                    int i14 = i13;
                    i8 = iM3169 ^ i4;
                    i7 = i3;
                    i12 = i14;
                    break;
                case -1813591392:
                case 397914884:
                    sArr = sArr;
                    i13 = i13;
                    i10 = s + s3;
                    if (RunnableC3646.f12471) {
                        iM2761 = (i6 - C0773.m3169("֫֡")) * (-79);
                        i = ((iM2761 ^ i5) * 14689) ^ (-1440766237);
                        i2 = -910642433;
                    } else {
                        iM2761 = C0773.m3169("ۡ֨") ^ i6;
                        i = ((iM2761 ^ i5) * (-10161)) ^ (-1897622223);
                        i2 = 1355358149;
                    }
                    int i15 = iM2761 ^ i2;
                    i12 = i13;
                    i8 = i15;
                    i7 = i;
                    sArr = sArr;
                    break;
                case -1805621830:
                case 2035391508:
                    sArr = sArr;
                    i13 = i13;
                    if ((i10 * i10) - i9 >= 0) {
                        iM2761 = (i5 - C0619.m2761("᩻ۧ")) * (-115);
                        i = ((iM2761 ^ i6) * (-4663)) ^ (-993509989);
                        i2 = -1292898729;
                    } else {
                        iM2761 = (C0773.m3169("ۧ᩷") ^ i6) * (-57);
                        i = ((iM2761 ^ i5) * (-23401)) ^ (-684667355);
                        i2 = 1661431635;
                    }
                    int i16 = iM2761 ^ i2;
                    i12 = i13;
                    i8 = i16;
                    i7 = i;
                    sArr = sArr;
                    break;
                case -1778732617:
                case 754733707:
                    i13 = i13;
                    try {
                        sArr = sArr;
                        C3492.m11491(intent, C3033.m9847(f66857, 19, 16, i11), cls.getName());
                        iM2761 = C0773.m3169("ۗ۟") ^ i6;
                        i = ((iM2761 ^ i5) * 9447) ^ 1050551919;
                        i2 = 2116278807;
                    } catch (Throwable th2) {
                        th = th2;
                        sArr = sArr;
                        th = th;
                        iM2761 = C0773.m3169("ܳܺ") ^ i6;
                        i = ((iM2761 ^ i5) * (-11057)) ^ 1134654671;
                        i2 = -19414687;
                    }
                    int i17 = iM2761 ^ i2;
                    i12 = i13;
                    i8 = i17;
                    i7 = i;
                    sArr = sArr;
                    break;
                case -1778005425:
                case -1616863358:
                    sArr = sArr;
                    i13 = i13;
                    if (C0487.f2131 <= 0) {
                        iM2761 = (C0773.m3169("۠᩷") ^ i5) * 53;
                        i = ((iM2761 ^ i6) * (-941)) ^ 182632945;
                        i2 = 1751514874;
                    } else {
                        iM2761 = (C0619.m2761("֫ۤ") ^ i5) * 67;
                        i = ((iM2761 ^ i6) * (-5351)) ^ (-981665238);
                        i2 = 538504374;
                    }
                    int i18 = iM2761 ^ i2;
                    i12 = i13;
                    i8 = i18;
                    i7 = i;
                    sArr = sArr;
                    break;
                case -1694586189:
                case 1416867159:
                    sArr = sArr;
                    i13 = i13;
                    if (C1321.m4852()) {
                        iM2761 = (C0773.m3169("ۡ۟") ^ i5) * 63;
                        i = ((iM2761 ^ i6) * 25049) ^ 685457495;
                        i2 = -552708906;
                    } else {
                        iM2761 = (i6 - C0773.m3169("֫֡")) * (-79);
                        i = ((iM2761 ^ i5) * 14689) ^ (-1440766237);
                        i2 = -910642433;
                    }
                    int i19 = iM2761 ^ i2;
                    i12 = i13;
                    i8 = i19;
                    i7 = i;
                    sArr = sArr;
                    break;
                case -1570854440:
                case -1320381707:
                    i13 = i13;
                    if (C2354.m7983()) {
                        iM3169 = C0619.m2761("ۛܳ") ^ i5;
                        i3 = ((iM3169 ^ i6) * 2289) ^ 753556130;
                        i4 = -960740171;
                    } else {
                        iM3169 = (i6 - C0773.m3169("֫᩺")) * (-95);
                        i3 = ((iM3169 ^ i5) * (-5669)) ^ (-1566205291);
                        i4 = 586632284;
                    }
                    int i110 = i13;
                    i8 = iM3169 ^ i4;
                    i7 = i3;
                    i12 = i110;
                    break;
                case -1560439084:
                case -551316073:
                    sArr = sArr;
                    i13 = i13;
                    if (C2288.f7433 <= 0) {
                        iM2761 = (i5 - C0773.m3169("ۙ۫")) * (-29);
                        i = ((iM2761 ^ i6) * 18303) ^ (-1944873175);
                        i2 = 1875312191;
                    } else {
                        iM2761 = C0773.m3169("ۙۜ") ^ i6;
                        i = ((iM2761 ^ i5) * (-16405)) ^ (-2021120166);
                        i2 = -339867851;
                    }
                    int i111 = iM2761 ^ i2;
                    i12 = i13;
                    i8 = i111;
                    i7 = i;
                    sArr = sArr;
                    break;
                case -1555250175:
                case -1268488322:
                    sArr = sArr;
                    i13 = i13;
                    c = '\n';
                    if (!C0619.f2439) {
                        iM2761 = C0619.m2761("ۘᩴ") ^ i5;
                        i = ((iM2761 ^ i6) * 23427) ^ 47851604;
                        i2 = -843954787;
                        int i112 = iM2761 ^ i2;
                        i12 = i13;
                        i8 = i112;
                        i7 = i;
                        sArr = sArr;
                    } else {
                        sArr = sArr;
                        iM3169 = C0619.m2761("ܿۚ") ^ i6;
                        i3 = ((iM3169 ^ i5) * (-31623)) ^ (-1367548813);
                        i4 = 1972853285;
                        int i113 = i13;
                        i8 = iM3169 ^ i4;
                        i7 = i3;
                        i12 = i113;
                    }
                    break;
                case -1386031765:
                case -213783967:
                    sArr = sArr;
                    i13 = i13;
                    s = sArr[c];
                    s2 = 56644;
                    if (C1826.m6301() >= 0) {
                        iM2761 = C0619.m2761("۬ۤ") ^ i6;
                        i = ((iM2761 ^ i5) * 24825) ^ 1605848464;
                        i2 = 648775382;
                    } else {
                        iM2761 = (C0619.m2761("᩶ۧ") + i6) * (-111);
                        i = ((iM2761 ^ i5) * 27393) ^ (-1220416439);
                        i2 = 761496520;
                    }
                    int i114 = iM2761 ^ i2;
                    i12 = i13;
                    i8 = i114;
                    i7 = i;
                    sArr = sArr;
                    break;
                case -1305042885:
                case 1734170963:
                    i13 = i13;
                    C4282.m13644();
                    if (C4282.f15546 <= 0) {
                        iM3169 = (C0619.m2761("ܿ᩷") ^ i6) * 53;
                        i3 = ((iM3169 ^ i5) * 24015) ^ 1347808638;
                        i4 = -1928389934;
                    } else {
                        iM3169 = C0619.m2761("᩶ܰ") ^ i5;
                        i3 = ((iM3169 ^ i6) * 7085) ^ (-2082838846);
                        i4 = -1152655115;
                    }
                    int i115 = i13;
                    i8 = iM3169 ^ i4;
                    i7 = i3;
                    i12 = i115;
                    break;
                case -1103665215:
                case -128983443:
                    C1080.m4050();
                    C3690.m11987();
                    break;
                case -1037662944:
                case 1726289181:
                    i13 = i13;
                    sArr = f66857;
                    if (C2310.m7813() <= 0) {
                        iM3169 = C0619.m2761("ܿۚ") ^ i6;
                        i3 = ((iM3169 ^ i5) * (-31623)) ^ (-1367548813);
                        i4 = 1972853285;
                    } else {
                        iM3169 = (i5 - C0773.m3169("᩻ۚ")) * (-81);
                        i3 = ((iM3169 ^ i6) * (-5603)) ^ 1351007754;
                        i4 = -1570087055;
                    }
                    int i116 = i13;
                    i8 = iM3169 ^ i4;
                    i7 = i3;
                    i12 = i116;
                    break;
                case -786813983:
                case -655809377:
                    sArr = sArr;
                    i13 = i13;
                    i9 = s * s2;
                    s3 = 14161;
                    if (C2878.f9462) {
                        iM2761 = (i5 - C0773.m3169("ۙ۫")) * (-29);
                        i = ((iM2761 ^ i6) * 18303) ^ (-1944873175);
                        i2 = 1875312191;
                    } else {
                        iM2761 = (i5 - C0773.m3169("᩷۟")) * (-31);
                        i = ((iM2761 ^ i6) * 24989) ^ (-1431894638);
                        i2 = 2002317340;
                    }
                    int i117 = iM2761 ^ i2;
                    i12 = i13;
                    i8 = i117;
                    i7 = i;
                    sArr = sArr;
                    break;
                case -682656208:
                case -196339872:
                    c20889.log(th);
                    C17202.m40373(C1080.m4058(th));
                    break;
                case -570089415:
                case 991314426:
                    i11 = 22051;
                    iM2761 = C0619.m2761("ᩳۤ") ^ i5;
                    i = ((iM2761 ^ i6) * 6051) ^ 807872855;
                    i2 = 1701212744;
                    int i118 = iM2761 ^ i2;
                    i12 = i13;
                    i8 = i118;
                    i7 = i;
                    sArr = sArr;
                    break;
                case -477307105:
                case 1911760252:
                    i13 = i13;
                    C1826.m6301();
                    if (C1146.f4234 >= 0) {
                        sArr = sArr;
                        iM2761 = (C0773.m3169("۠᩷") ^ i5) * 53;
                        i = ((iM2761 ^ i6) * (-941)) ^ 182632945;
                        i2 = 1751514874;
                        int i119 = iM2761 ^ i2;
                        i12 = i13;
                        i8 = i119;
                        i7 = i;
                        sArr = sArr;
                    } else {
                        iM3169 = (C0619.m2761("ܿ᩷") ^ i6) * 53;
                        i3 = ((iM3169 ^ i5) * 24015) ^ 1347808638;
                        i4 = -1928389934;
                        int i1110 = i13;
                        i8 = iM3169 ^ i4;
                        i7 = i3;
                        i12 = i1110;
                    }
                    break;
                case -318523294:
                case 1505823389:
                    sArr = sArr;
                    i13 = i13;
                    if (!C17202.f56030) {
                        sArr = sArr;
                        iM3169 = C0619.m2761("ܿۚ") ^ i6;
                        i3 = ((iM3169 ^ i5) * (-31623)) ^ (-1367548813);
                        i4 = 1972853285;
                        int i1111 = i13;
                        i8 = iM3169 ^ i4;
                        i7 = i3;
                        i12 = i1111;
                    } else {
                        iM2761 = (i6 - C0773.m3169("ۙܿ")) * (-67);
                        i = ((iM2761 ^ i5) * (-8355)) ^ 59947788;
                        i2 = 1633785483;
                        int i1112 = iM2761 ^ i2;
                        i12 = i13;
                        i8 = i1112;
                        i7 = i;
                        sArr = sArr;
                    }
                    break;
                case 26864411:
                case 621238359:
                    sArr = sArr;
                    i13 = i13;
                    if (cls != null) {
                        iM2761 = C0773.m3169("ۢ᩺") ^ i5;
                        i = ((iM2761 ^ i6) * (-17601)) ^ 283002574;
                        i2 = 303037491;
                    } else {
                        iM2761 = C0773.m3169("ۗ۟") ^ i6;
                        i = ((iM2761 ^ i5) * 9447) ^ 1050551919;
                        i2 = 2116278807;
                    }
                    int i1113 = iM2761 ^ i2;
                    i12 = i13;
                    i8 = i1113;
                    i7 = i;
                    sArr = sArr;
                    break;
                case 146968787:
                case 1262705034:
                    i11 = 15408;
                    iM2761 = C0619.m2761("ᩳۤ") ^ i5;
                    i = ((iM2761 ^ i6) * 6051) ^ 807872855;
                    i2 = 1701212744;
                    int i1114 = iM2761 ^ i2;
                    i12 = i13;
                    i8 = i1114;
                    i7 = i;
                    sArr = sArr;
                    break;
                case 255001240:
                case 1631602358:
                    C3448.m11248();
                    if (C2354.f7599 < 0) {
                        iM3169 = (i5 - C0619.m2761("᩹֨")) * (-57);
                        i13 = i13;
                        i3 = ((iM3169 ^ i6) * 26873) ^ 2045695381;
                        i4 = -1685957670;
                        int i1115 = i13;
                        i8 = iM3169 ^ i4;
                        i7 = i3;
                        i12 = i1115;
                    } else {
                        sArr = sArr;
                        i13 = i13;
                        iM2761 = (i5 - C0773.m3169("ۙ۫")) * (-29);
                        i = ((iM2761 ^ i6) * 18303) ^ (-1944873175);
                        i2 = 1875312191;
                        int i1116 = iM2761 ^ i2;
                        i12 = i13;
                        i8 = i1116;
                        i7 = i;
                        sArr = sArr;
                    }
                    break;
                case 295078228:
                case 1664971216:
                    i13 = i13;
                    if (C3099.f10023 > 0) {
                        iM3169 = C0619.m2761("ۛܳ") ^ i5;
                        i3 = ((iM3169 ^ i6) * 2289) ^ 753556130;
                        i4 = -960740171;
                    } else {
                        iM3169 = C0619.m2761("ܿۚ") ^ i6;
                        i3 = ((iM3169 ^ i5) * (-31623)) ^ (-1367548813);
                        i4 = 1972853285;
                    }
                    int i1117 = i13;
                    i8 = iM3169 ^ i4;
                    i7 = i3;
                    i12 = i1117;
                    break;
                case 602289867:
                case 1741580380:
                    break;
                case 702102619:
                case 1536559609:
                    sArr = sArr;
                    i13 = i13;
                    applicationM10096 = C3099.m10096();
                    try {
                        intent = new Intent(applicationM10096, (Class<?>) C12684.f40635);
                        C3492.m11491(intent, C2288.m7761(f66857, 11, 8, i11), c20889.f66864);
                        iM2761 = (C0773.m3169("ۢۨ") ^ i5) * 35;
                        i = ((iM2761 ^ i6) * 26669) ^ 1244697336;
                        i2 = -1102502811;
                    } catch (Throwable th3) {
                        th = th3;
                        intent = null;
                        iM2761 = C0773.m3169("ܳܺ") ^ i6;
                        i = ((iM2761 ^ i5) * (-11057)) ^ 1134654671;
                        i2 = -19414687;
                    }
                    int i1118 = iM2761 ^ i2;
                    i12 = i13;
                    i8 = i1118;
                    i7 = i;
                    sArr = sArr;
                    break;
                case 805496926:
                case 1544545384:
                    i13 = i13;
                    AbstractC3624.m11755();
                    C11235.m28309();
                    iM3169 = C0619.m2761("ۛܳ") ^ i5;
                    i3 = ((iM3169 ^ i6) * 2289) ^ 753556130;
                    i4 = -960740171;
                    int i1119 = i13;
                    i8 = iM3169 ^ i4;
                    i7 = i3;
                    i12 = i1119;
                    break;
                case 993776871:
                case 1612105689:
                    i13 = i13;
                    C0773.m3161();
                    if (C0862.f3233 == 0) {
                        sArr = sArr;
                        iM2761 = (i5 - C0773.m3169("ۙ۫")) * (-29);
                        i = ((iM2761 ^ i6) * 18303) ^ (-1944873175);
                        i2 = 1875312191;
                        int i11110 = iM2761 ^ i2;
                        i12 = i13;
                        i8 = i11110;
                        i7 = i;
                        sArr = sArr;
                    } else {
                        iM3169 = (i6 - C0773.m3169("֫᩺")) * (-95);
                        i3 = ((iM3169 ^ i5) * (-5669)) ^ (-1566205291);
                        i4 = 586632284;
                        int i11111 = i13;
                        i8 = iM3169 ^ i4;
                        i7 = i3;
                        i12 = i11111;
                    }
                    break;
                case 1499076481:
                case 1728855789:
                    i13 = i13;
                    C3077.m10041();
                    if (C1564.f5401 <= 0) {
                        sArr = sArr;
                        iM2761 = (i6 - C0773.m3169("֫֡")) * (-79);
                        i = ((iM2761 ^ i5) * 14689) ^ (-1440766237);
                        i2 = -910642433;
                        int i11112 = iM2761 ^ i2;
                        i12 = i13;
                        i8 = i11112;
                        i7 = i;
                        sArr = sArr;
                    } else {
                        iM3169 = (C0619.m2761("ܿ᩷") ^ i6) * 53;
                        i3 = ((iM3169 ^ i5) * 24015) ^ 1347808638;
                        i4 = -1928389934;
                        int i11113 = i13;
                        i8 = iM3169 ^ i4;
                        i7 = i3;
                        i12 = i11113;
                    }
                    break;
                case 1611760679:
                case 2084277371:
                    sArr = sArr;
                    i13 = i13;
                    if (C4282.f15546 <= 0) {
                        iM2761 = (i6 - C0773.m3169("֫֡")) * (-79);
                        i = ((iM2761 ^ i5) * 14689) ^ (-1440766237);
                        i2 = -910642433;
                    } else {
                        iM2761 = C0773.m3169("ܰ᩵") ^ i6;
                        i = ((iM2761 ^ i5) * (-10293)) ^ (-2047710987);
                        i2 = -1285158208;
                    }
                    int i11114 = iM2761 ^ i2;
                    i12 = i13;
                    i8 = i11114;
                    i7 = i;
                    sArr = sArr;
                    break;
                default:
                    sArr = sArr;
                    i13 = i13;
                    try {
                        AbstractC0116.m1232(intent, 268435456);
                        C2878.m9490(applicationM10096, intent);
                        iM2761 = (C0773.m3169("۠ᩴ") ^ i6) * (-45);
                        i = ((iM2761 ^ i5) * (-11673)) ^ 96819741;
                        i2 = -672559654;
                    } catch (Throwable th4) {
                        th = th4;
                        th = th;
                        iM2761 = C0773.m3169("ܳܺ") ^ i6;
                        i = ((iM2761 ^ i5) * (-11057)) ^ 1134654671;
                        i2 = -19414687;
                    }
                    int i11115 = iM2761 ^ i2;
                    i12 = i13;
                    i8 = i11115;
                    i7 = i;
                    sArr = sArr;
                    break;
            }
            return;
        }
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final void showToastL(CharSequence charSequence) {
        int i = 0;
        CharSequence charSequenceM3508 = null;
        String str = null;
        int i2 = 1137032768;
        int i3 = C2288.f7433;
        int i4 = C4238.f15451;
        int iM2761 = C0619.m2761("᩻᩸") ^ i4;
        int i5 = ((iM2761 ^ i3) * (-27533)) ^ 592516366;
        int i6 = -1641858788;
        while (true) {
            int i7 = iM2761 ^ i6;
            while (true) {
                i2 = ((((i2 ^ i3) * (-13587)) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2088597112:
                    case 1720098353:
                        if (C3492.f12043 <= 0) {
                            iM2761 = C0619.m2761("ۧۚ") ^ i3;
                            i5 = ((iM2761 ^ i4) * 32309) ^ 636291974;
                            i6 = 1306548748;
                        } else {
                            iM2761 = (C0619.m2761("ۖ۠") ^ i3) * (-35);
                            i5 = ((iM2761 ^ i4) * 18903) ^ 1729748662;
                            i6 = 2073923988;
                        }
                        break;
                    case -1982768464:
                    case -60788522:
                        if (C1542.f5343 <= 0) {
                            iM2761 = C0619.m2761("ۧۚ") ^ i3;
                            i5 = ((iM2761 ^ i4) * 32309) ^ 636291974;
                            i6 = 1306548748;
                        } else {
                            iM2761 = (C0773.m3169("ۢ᩺") + i4) * 127;
                            i5 = ((iM2761 ^ i3) * 16467) ^ (-1150396562);
                            i6 = 229397861;
                        }
                        break;
                    case -1975377046:
                    case -577536827:
                        C2966.m9664();
                        if (C3492.f12043 > 0) {
                            iM2761 = (C0773.m3169("֡֨") + i4) * 83;
                            i5 = ((iM2761 ^ i3) * 133) ^ (-273867715);
                            i6 = 1865549221;
                        } else {
                            iM2761 = (C0619.m2761("ۜܺ") + i3) * (-95);
                            i5 = ((iM2761 ^ i4) * (-6249)) ^ (-1734505681);
                            i6 = -1172467877;
                        }
                        break;
                    case -1595728483:
                    case 632433834:
                        if (C1826.f6190 <= 0) {
                            iM2761 = C0619.m2761("ۧۚ") ^ i3;
                            i5 = ((iM2761 ^ i4) * 32309) ^ 636291974;
                            i6 = 1306548748;
                        } else {
                            iM2761 = C0619.m2761("ۛۜ") ^ i3;
                            i5 = ((iM2761 ^ i4) * 17441) ^ (-1820993973);
                            i6 = -1603021542;
                        }
                        break;
                    case -1460533734:
                    case -1248954766:
                        if (!(charSequence instanceof String)) {
                            i = 0;
                            charSequenceM3508 = charSequence;
                            iM2761 = (C0773.m3169("ܿۘ") ^ i3) * 37;
                            i5 = ((iM2761 ^ i4) * (-1213)) ^ (-695220179);
                            i6 = 268316533;
                        } else {
                            int iM3169 = (C0773.m3169("ۙۙ") ^ i4) * 127;
                            i5 = ((iM3169 ^ i3) * 30653) ^ 592006940;
                            i7 = iM3169 ^ 1472742145;
                            i = 0;
                        }
                        break;
                    case -1404642159:
                    case 41886684:
                        if (RunnableC3646.m11801(1, str) == '}') {
                            iM2761 = C0619.m2761("ܽۢ") ^ i3;
                            i5 = ((iM2761 ^ i4) * (-13005)) ^ (-1903609455);
                            i6 = 2084474860;
                        } else {
                            charSequenceM3508 = charSequence;
                            iM2761 = (C0773.m3169("ܿۘ") ^ i3) * 37;
                            i5 = ((iM2761 ^ i4) * (-1213)) ^ (-695220179);
                            i6 = 268316533;
                        }
                        break;
                    case -1262216725:
                    case -315250:
                        if (C3077.f9998) {
                            iM2761 = (C0773.m3169("۬᩸") ^ i4) * 3;
                            i5 = ((iM2761 ^ i3) * 17459) ^ (-1347443920);
                            i6 = -1076543752;
                        } else {
                            iM2761 = (C0619.m2761("ۖۙ") ^ i4) * 109;
                            i5 = ((iM2761 ^ i3) * (-12943)) ^ (-597475753);
                            i6 = -19898219;
                        }
                        break;
                    case -1038014170:
                    case 699631832:
                        if (C3099.f10023 <= 0) {
                            iM2761 = (C0619.m2761("ۖۙ") ^ i4) * 109;
                            i5 = ((iM2761 ^ i3) * (-12943)) ^ (-597475753);
                            i6 = -19898219;
                        } else {
                            iM2761 = (i4 - C0619.m2761("ۖ۟")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                            i5 = ((iM2761 ^ i3) * (-24645)) ^ (-320563605);
                            i6 = -1948368114;
                        }
                        break;
                    case -996998639:
                    case 959201856:
                        C1826.m6301();
                        C11235.m28309();
                        break;
                    case -416645893:
                    case 973859393:
                        C17159 c17159 = C5448.f19035;
                        if (C2419.f7754 < 0) {
                            ThreadUtil.runOnUiThread(new RunnableC12905(i, charSequenceM3508));
                        }
                        iM2761 = (C0773.m3169("֡֨") + i4) * 83;
                        i5 = ((iM2761 ^ i3) * 133) ^ (-273867715);
                        i6 = 1865549221;
                        break;
                    case -218931850:
                    case -201611160:
                        str = (String) charSequence;
                        if (C2966.m9671(str) >= 3) {
                            iM2761 = (C0773.m3169("᩶ۤ") + i3) * 65;
                            i5 = ((iM2761 ^ i4) * 4595) ^ (-1883977261);
                            i6 = 175322583;
                        } else {
                            charSequenceM3508 = charSequence;
                            iM2761 = (C0773.m3169("ܿۘ") ^ i3) * 37;
                            i5 = ((iM2761 ^ i4) * (-1213)) ^ (-695220179);
                            i6 = 268316533;
                        }
                        break;
                    case -180697649:
                    case 1375275975:
                        if (C2354.f7599 >= 0) {
                            iM2761 = (C0619.m2761("ۜܺ") + i3) * (-95);
                            i5 = ((iM2761 ^ i4) * (-6249)) ^ (-1734505681);
                            i6 = -1172467877;
                        } else {
                            iM2761 = C0773.m3169("֫ܰ") ^ i3;
                            i5 = ((iM2761 ^ i4) * (-10231)) ^ (-769441668);
                            i6 = -694777773;
                        }
                        break;
                    case -35835748:
                    case 96927305:
                        if (C1343.m4937(str, i) == '{') {
                            iM2761 = (i4 - C0619.m2761("᩻ܶ")) * (-105);
                            i5 = ((iM2761 ^ i3) * (-3577)) ^ (-681068652);
                            i6 = -1133687341;
                        } else {
                            charSequenceM3508 = charSequence;
                            iM2761 = (C0773.m3169("ܿۘ") ^ i3) * 37;
                            i5 = ((iM2761 ^ i4) * (-1213)) ^ (-695220179);
                            i6 = 268316533;
                        }
                        break;
                    case 142990246:
                    case 510414836:
                        charSequenceM3508 = C0862.m3508(this, str);
                        if (charSequenceM3508 == null) {
                            charSequenceM3508 = charSequence;
                        }
                        iM2761 = (C0773.m3169("ܿۘ") ^ i3) * 37;
                        i5 = ((iM2761 ^ i4) * (-1213)) ^ (-695220179);
                        i6 = 268316533;
                        break;
                    case 554170519:
                    case 800235906:
                        if (C1146.f4234 >= 0) {
                            iM2761 = (C0619.m2761("ۖۙ") ^ i4) * 109;
                            i5 = ((iM2761 ^ i3) * (-12943)) ^ (-597475753);
                            i6 = -19898219;
                        } else {
                            iM2761 = (C0773.m3169("֡֨") + i4) * 83;
                            i5 = ((iM2761 ^ i3) * 133) ^ (-273867715);
                            i6 = 1865549221;
                        }
                        break;
                    case 681003880:
                    case 2085399309:
                        if (C0773.f2792 <= 0) {
                            iM2761 = C0619.m2761("ۧۚ") ^ i3;
                            i5 = ((iM2761 ^ i4) * 32309) ^ 636291974;
                            i6 = 1306548748;
                        } else {
                            iM2761 = (C0773.m3169("۟ܳ") ^ i4) * (-103);
                            i5 = ((iM2761 ^ i3) * (-25389)) ^ (-1455951071);
                            i6 = 444789604;
                        }
                        break;
                    case 849206839:
                    case 2126236911:
                        C4238.m13540();
                        if (C0487.f2131 > 0) {
                            iM2761 = (i3 - C0773.m3169("᩸᩷")) * (-105);
                            i5 = ((iM2761 ^ i4) * (-16635)) ^ (-1647047320);
                            i6 = 1882865079;
                        } else {
                            iM2761 = (C0619.m2761("ۜܺ") + i3) * (-95);
                            i5 = ((iM2761 ^ i4) * (-6249)) ^ (-1734505681);
                            i6 = -1172467877;
                        }
                        break;
                    case 1385249109:
                    case 1702839689:
                        C20932.m47848();
                        C1343.m4943();
                        iM2761 = (C0619.m2761("ۜܺ") + i3) * (-95);
                        i5 = ((iM2761 ^ i4) * (-6249)) ^ (-1734505681);
                        i6 = -1172467877;
                        break;
                    case 1536136586:
                    case 2064652910:
                        if (C4238.m13540() <= 0) {
                            iM2761 = (C0619.m2761("ۖۙ") ^ i4) * 109;
                            i5 = ((iM2761 ^ i3) * (-12943)) ^ (-597475753);
                            i6 = -19898219;
                        } else {
                            iM2761 = C0773.m3169("᩶֫") ^ i3;
                            i5 = ((iM2761 ^ i4) * (-26697)) ^ (-1102949807);
                            i6 = -1640927618;
                        }
                        break;
                    default:
                        if (C2485.f7950 != 0) {
                            iM2761 = (i3 - C0773.m3169("᩸᩷")) * (-105);
                            i5 = ((iM2761 ^ i4) * (-16635)) ^ (-1647047320);
                            i6 = 1882865079;
                        } else {
                            iM2761 = C0773.m3169("ۨۧ") ^ i4;
                            i5 = ((iM2761 ^ i3) * 2005) ^ (-288698480);
                            i6 = -1828336260;
                        }
                        break;
                }
                return;
            }
        }
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final boolean hasClipboardText() {
        boolean zHasPrimaryClip = false;
        int i = -983360016;
        int i2 = RunnableC0334.f1808;
        int i3 = C2834.f9334;
        int iM2761 = C0619.m2761("۟ۙ") ^ i2;
        int i4 = ((iM2761 ^ i3) * 3339) ^ 698229383;
        int i5 = 1149543338;
        while (true) {
            i = ((((i ^ i3) * (-7441)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2093549340:
                case -1250958942:
                    try {
                        zHasPrimaryClip = m47731().hasPrimaryClip();
                        iM2761 = (C0619.m2761("֡᩶") ^ i3) * (-15);
                        i4 = ((iM2761 ^ i2) * (-20721)) ^ (-1537224820);
                        i5 = -1929841367;
                    } catch (Throwable unused) {
                        iM2761 = C0619.m2761("ۢ᩹") ^ i2;
                        i4 = ((iM2761 ^ i3) * 11577) ^ 817013343;
                        i5 = -795590997;
                    }
                    break;
                case -1960041482:
                case -699834372:
                    return zHasPrimaryClip;
                case -1930145467:
                case 2000560051:
                    if (C2310.m7813() <= 0) {
                        iM2761 = (C0619.m2761("ۘ᩹") + i2) * (-91);
                        i4 = ((iM2761 ^ i3) * (-27741)) ^ 358569903;
                        i5 = 1561588285;
                    } else {
                        iM2761 = C0619.m2761("֡ۨ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-5091)) ^ (-1067391920);
                        i5 = -1980210112;
                    }
                    break;
                case -1789420209:
                case 1899726527:
                    if (C0773.f2792 <= 0) {
                        iM2761 = C0773.m3169("ۚ᩺") ^ i2;
                        i4 = ((iM2761 ^ i3) * 6367) ^ 873021486;
                        i5 = 82202940;
                    } else {
                        iM2761 = (C0773.m3169("᩶ۨ") + i3) * (-3);
                        i4 = ((iM2761 ^ i2) * 31015) ^ 403660261;
                        i5 = 1697067849;
                    }
                    break;
                case -1657823519:
                case 663726284:
                    if (C2966.f9654 >= 0) {
                        iM2761 = C0619.m2761("ۙۧ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-21237)) ^ 1453421092;
                        i5 = 1921636352;
                    } else {
                        iM2761 = C0773.m3169("ۙ۠") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-8251)) ^ 774401742;
                        i5 = -261845552;
                    }
                    break;
                case -1183290611:
                case -981463550:
                    C3492.m11488();
                    iM2761 = C0619.m2761("᩸᩻") ^ i3;
                    i4 = ((iM2761 ^ i2) * 15099) ^ (-1218852175);
                    i5 = 236677684;
                    break;
                case -1136185368:
                case -566314976:
                    if (C3077.f9998) {
                        iM2761 = (i3 - C0619.m2761("᩵ۗ")) * 83;
                        i4 = ((iM2761 ^ i2) * 12869) ^ (-1597904994);
                        i5 = -981926996;
                    } else {
                        iM2761 = (C0773.m3169("᩸֡") + i3) * 101;
                        i4 = ((iM2761 ^ i2) * (-14005)) ^ (-213211578);
                        i5 = 1306863314;
                    }
                    break;
                case -1087511769:
                case 1176522481:
                    if (AbstractC0116.m1243() != 0) {
                        iM2761 = (C0619.m2761("ۘ᩹") + i2) * (-91);
                        i4 = ((iM2761 ^ i3) * (-27741)) ^ 358569903;
                        i5 = 1561588285;
                    } else {
                        iM2761 = (i2 - C0619.m2761("ۡ֨")) * 109;
                        i4 = ((iM2761 ^ i3) * (-14279)) ^ 388235047;
                        i5 = 215442956;
                    }
                    break;
                case -980079340:
                case 74480699:
                    if (C1564.m5509() <= 0) {
                        iM2761 = C0773.m3169("ۚ᩺") ^ i2;
                        i4 = ((iM2761 ^ i3) * 6367) ^ 873021486;
                        i5 = 82202940;
                    } else {
                        iM2761 = (i2 - C0619.m2761("ۘ۫")) * (-61);
                        i4 = ((iM2761 ^ i3) * 2429) ^ (-434274030);
                        i5 = -2078564970;
                    }
                    break;
                case -450154573:
                case 1853379940:
                    return false;
                case -417266398:
                case 1095864551:
                    C3690.m11987();
                    AbstractC0116.m1243();
                    return false;
                case -350469961:
                case 1567974482:
                    if (C2419.f7754 >= 0) {
                        iM2761 = C0619.m2761("᩸᩻") ^ i3;
                        i4 = ((iM2761 ^ i2) * 15099) ^ (-1218852175);
                        i5 = 236677684;
                    } else {
                        iM2761 = C0773.m3169("ܽᩴ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 19075) ^ (-732254799);
                        i5 = 1342867545;
                    }
                    break;
                case -290115644:
                case 372453819:
                    if (C3033.f9831 >= 0) {
                        iM2761 = C0773.m3169("ۚ᩺") ^ i2;
                        i4 = ((iM2761 ^ i3) * 6367) ^ 873021486;
                        i5 = 82202940;
                    } else {
                        iM2761 = (i2 - C0619.m2761("ۛ᩻")) * 83;
                        i4 = ((iM2761 ^ i3) * 25011) ^ (-1182445646);
                        i5 = -2014420822;
                    }
                    break;
                case -256269385:
                case 524535646:
                    if (C2375.f7641 <= 0) {
                        iM2761 = C0619.m2761("ۙۧ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-21237)) ^ 1453421092;
                        i5 = 1921636352;
                    } else {
                        iM2761 = C0619.m2761("۠ۤ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-32737)) ^ 1504419178;
                        i5 = 1262032367;
                    }
                    break;
                case -119034463:
                case 1990273894:
                    if (C1321.f4751 >= 0) {
                        iM2761 = C0619.m2761("᩸᩻") ^ i3;
                        i4 = ((iM2761 ^ i2) * 15099) ^ (-1218852175);
                        i5 = 236677684;
                    } else {
                        iM2761 = C0773.m3169("۠ۡ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 281) ^ 1108076995;
                        i5 = 305170946;
                    }
                    break;
                case 827932947:
                case 960135196:
                    RunnableC3055.m9933();
                    if (AbstractC0641.f2496 >= 0) {
                        iM2761 = C0619.m2761("ۙۧ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-21237)) ^ 1453421092;
                        i5 = 1921636352;
                    } else {
                        iM2761 = (C0773.m3169("᩸֡") + i3) * 101;
                        i4 = ((iM2761 ^ i2) * (-14005)) ^ (-213211578);
                        i5 = 1306863314;
                    }
                    break;
                case 1179631838:
                case 1194786273:
                    C0619.m2763();
                    if (C1564.m5509() <= 0) {
                        iM2761 = (C0773.m3169("᩸֡") + i3) * 101;
                        i4 = ((iM2761 ^ i2) * (-14005)) ^ (-213211578);
                        i5 = 1306863314;
                    } else {
                        iM2761 = C0619.m2761("᩸᩻") ^ i3;
                        i4 = ((iM2761 ^ i2) * 15099) ^ (-1218852175);
                        i5 = 236677684;
                    }
                    break;
                default:
                    C2834.m9344();
                    if (RunnableC3055.f9898 >= 0) {
                        iM2761 = (C0619.m2761("ۘ᩹") + i2) * (-91);
                        i4 = ((iM2761 ^ i3) * (-27741)) ^ 358569903;
                        i5 = 1561588285;
                    } else {
                        iM2761 = C0619.m2761("᩸᩻") ^ i3;
                        i4 = ((iM2761 ^ i2) * 15099) ^ (-1218852175);
                        i5 = 236677684;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0161 A[PHI: r1 r11 r15
      0x0161: PHI (r1v4 java.lang.String) = (r1v3 java.lang.String), (r1v2 java.lang.String), (r1v2 java.lang.String) binds: [B:41:0x015f, B:26:0x00e2, B:9:0x0074] A[DONT_GENERATE, DONT_INLINE]
      0x0161: PHI (r11v4 short[]) = (r11v3 short[]), (r11v2 short[]), (r11v2 short[]) binds: [B:41:0x015f, B:26:0x00e2, B:9:0x0074] A[DONT_GENERATE, DONT_INLINE]
      0x0161: PHI (r15v4 int) = (r15v2 int), (r15v3 int), (r15v2 int) binds: [B:41:0x015f, B:26:0x00e2, B:9:0x0074] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0246 A[PHI: r6
      0x0246: PHI (r6v4 short) = (r6v3 short), (r6v2 short), (r6v2 short), (r6v2 short) binds: [B:64:0x0244, B:16:0x009e, B:12:0x007d, B:9:0x0074] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x0279 A[PHI: r5 r7 r8 r12 r13 r14
      0x0279: PHI (r5v4 char) = (r5v3 char), (r5v2 char), (r5v2 char), (r5v2 char), (r5v2 char) binds: [B:68:0x0277, B:60:0x0223, B:56:0x0204, B:37:0x013d, B:30:0x0104] A[DONT_GENERATE, DONT_INLINE]
      0x0279: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int), (r7v2 int) binds: [B:68:0x0277, B:60:0x0223, B:56:0x0204, B:37:0x013d, B:30:0x0104] A[DONT_GENERATE, DONT_INLINE]
      0x0279: PHI (r8v4 int) = (r8v2 int), (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:68:0x0277, B:60:0x0223, B:56:0x0204, B:37:0x013d, B:30:0x0104] A[DONT_GENERATE, DONT_INLINE]
      0x0279: PHI (r12v4 int) = (r12v2 int), (r12v2 int), (r12v2 int), (r12v3 int), (r12v2 int) binds: [B:68:0x0277, B:60:0x0223, B:56:0x0204, B:37:0x013d, B:30:0x0104] A[DONT_GENERATE, DONT_INLINE]
      0x0279: PHI (r13v3 short[]) = (r13v2 short[]), (r13v2 short[]), (r13v2 short[]), (r13v2 short[]), (r13v4 short[]) binds: [B:68:0x0277, B:60:0x0223, B:56:0x0204, B:37:0x013d, B:30:0x0104] A[DONT_GENERATE, DONT_INLINE]
      0x0279: PHI (r14v3 int) = (r14v2 int), (r14v2 int), (r14v2 int), (r14v2 int), (r14v4 int) binds: [B:68:0x0277, B:60:0x0223, B:56:0x0204, B:37:0x013d, B:30:0x0104] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x02ab A[PHI: r9 r20
      0x02ab: PHI (r9v4 short) = (r9v2 short), (r9v3 short), (r9v2 short), (r9v2 short) binds: [B:72:0x02a9, B:52:0x01e4, B:18:0x00a2, B:16:0x009e] A[DONT_GENERATE, DONT_INLINE]
      0x02ab: PHI (r20v5 short[]) = (r20v4 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]) binds: [B:72:0x02a9, B:52:0x01e4, B:18:0x00a2, B:16:0x009e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m47735(String str) {
        int iM2761;
        int i;
        int i2;
        int i3 = C3033.f9831;
        int i4 = C3734.f12817;
        int iM2762 = C0619.m2761("۫ۙ") ^ i4;
        int i5 = ((iM2762 ^ i3) * (-18297)) ^ (-1155457557);
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM2762 ^ 1670018631;
        char c = 0;
        short s = 0;
        int i7 = 0;
        int i8 = 0;
        short s2 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1252920231;
        String strM4946 = null;
        String strM11769 = null;
        String strM11995 = null;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i3) * 10987) >> 31));
            switch (i13) {
                case -2062549810:
                case 714295859:
                    i9 = 18387;
                    iM2761 = C0773.m3169("ܿ᩻") ^ i4;
                    i = ((iM2761 ^ i3) * 1743) ^ 1486158628;
                    i2 = 1133469159;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1981602353:
                case 769213322:
                    i9 = 4159;
                    iM2761 = C0773.m3169("ܿ᩻") ^ i4;
                    i = ((iM2761 ^ i3) * 1743) ^ 1486158628;
                    i2 = 1133469159;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1949374251:
                case -1108980728:
                    C2834.m9344();
                    iM2761 = C0773.m3169("᩹ܿ") ^ i4;
                    i = ((iM2761 ^ i3) * 29159) ^ 1433816496;
                    i2 = 262135912;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1806877072:
                case 8904655:
                    i10 = 36;
                    if (C0862.f3233 != 0) {
                        iM2761 = (C0773.m3169("ۖܰ") ^ i4) * 65;
                        i = ((iM2761 ^ i3) * (-6195)) ^ 1780906860;
                        i2 = -1098924927;
                    } else {
                        iM2761 = C0773.m3169("᩺ۖ") ^ i3;
                        i = ((iM2761 ^ i4) * (-24685)) ^ 1067376545;
                        i2 = 1535657458;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1702095561:
                case 1083655316:
                    AbstractC0116.m1243();
                    AbstractC0116.m1243();
                    return null;
                case -1660257165:
                case 1173047290:
                    s = sArr[c];
                    if (C23916.m53419() != 0) {
                        iM2761 = C0619.m2761("ۡۖ") ^ i3;
                        i = ((iM2761 ^ i4) * 19959) ^ (-739590633);
                        i2 = 1379578807;
                    } else {
                        iM2761 = (C0619.m2761("ᩴ᩷") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM2761 ^ i4) * (-6611)) ^ (-1265387166);
                        i2 = 1455570180;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1652448441:
                case -694196158:
                    strM11995 = C3690.m11995(str);
                    sArr2 = f66857;
                    if (C4238.f15451 >= 0) {
                        iM2761 = C0619.m2761("۟ۖ") ^ i4;
                        i = ((iM2761 ^ i3) * (-11179)) ^ (-1689052527);
                        i2 = -765001697;
                    } else {
                        iM2761 = C0773.m3169("ܶ᩻") ^ i3;
                        i = ((iM2761 ^ i4) * (-10739)) ^ 1415147937;
                        i2 = 2073159647;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1460151921:
                case 1573000284:
                    c = '#';
                    if (C2485.f7950 != 0) {
                        iM2761 = (C0773.m3169("ۖܰ") ^ i4) * 65;
                        i = ((iM2761 ^ i3) * (-6195)) ^ 1780906860;
                        i2 = -1098924927;
                    } else {
                        iM2761 = C0619.m2761("ܺᩳ") ^ i4;
                        i = ((iM2761 ^ i3) * 31847) ^ (-1684670417);
                        i2 = 135940275;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1206467942:
                case 1030561349:
                    i12 = 8;
                    if (C0487.m2356() >= 0) {
                        iM2761 = C0619.m2761("۟ۖ") ^ i4;
                        i = ((iM2761 ^ i3) * (-11179)) ^ (-1689052527);
                        i2 = -765001697;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ۘۚ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM2761 ^ i4) * 35) ^ 2122171331;
                        i2 = 1113517802;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1049382702:
                case 581837314:
                    if (C0487.m2359(strM11995, C0862.m3500(sArr3, i11, i12, i9))) {
                        strM4946 = str;
                        iM2761 = (C0773.m3169("᩹ۧ") + i4) * 73;
                        i = ((iM2761 ^ i3) * 24019) ^ 774306332;
                        i2 = 1857032255;
                        i6 = iM2761 ^ i2;
                        i5 = i;
                    } else {
                        int iM3169 = (C0773.m3169("ۡ۠") ^ i4) * (-53);
                        i5 = ((iM3169 ^ i3) * 24077) ^ 2001346632;
                        i6 = iM3169 ^ (-698217122);
                    }
                    break;
                case -735785697:
                case 1398536711:
                    i7 = s * 2;
                    if (C4282.f15546 <= 0) {
                        iM2761 = (C0773.m3169("ۖܰ") ^ i4) * 65;
                        i = ((iM2761 ^ i3) * (-6195)) ^ 1780906860;
                        i2 = -1098924927;
                    } else {
                        iM2761 = (C0619.m2761("᩻᩸") + i4) * (-103);
                        i = ((iM2761 ^ i3) * 10303) ^ 1459424211;
                        i2 = 1267813375;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -538734102:
                case 23149501:
                    C2419.m8174();
                    if (C1146.f4234 >= 0) {
                        iM2761 = C0773.m3169("᩹ܿ") ^ i4;
                        i = ((iM2761 ^ i3) * 29159) ^ 1433816496;
                        i2 = 262135912;
                    } else {
                        iM2761 = C0619.m2761("ۡۖ") ^ i3;
                        i = ((iM2761 ^ i4) * 19959) ^ (-739590633);
                        i2 = 1379578807;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -335086080:
                case 966170323:
                    return strM4946;
                case -171036932:
                case 53935836:
                    strM4946 = C1343.m4946(strM11769, str);
                    iM2761 = (C0773.m3169("᩹ۧ") + i4) * 73;
                    i = ((iM2761 ^ i3) * 24019) ^ 774306332;
                    i2 = 1857032255;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -157653584:
                case 430448976:
                    sArr = f66857;
                    if (C13473.f42873 != 0) {
                        iM2761 = C0773.m3169("᩹ܿ") ^ i4;
                        i = ((iM2761 ^ i3) * 29159) ^ 1433816496;
                        i2 = 262135912;
                    } else {
                        iM2761 = C0619.m2761("ܽ᩷") ^ i3;
                        i = ((iM2761 ^ i4) * 24215) ^ (-1440212900);
                        i2 = 1194000639;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -17238022:
                case 481794560:
                    s2 = 1;
                    if (C4238.f15451 >= 0) {
                        iM2761 = C0773.m3169("᩹ܿ") ^ i4;
                        i = ((iM2761 ^ i3) * 29159) ^ 1433816496;
                        i2 = 262135912;
                    } else {
                        iM2761 = (i4 - C0619.m2761("᩹ۤ")) * 87;
                        i = ((iM2761 ^ i3) * (-32555)) ^ (-1560531627);
                        i2 = -1834219629;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 486119673:
                case 1801304304:
                    sArr3 = f66857;
                    i11 = 43;
                    if (RunnableC3646.f12471) {
                        iM2761 = (C0773.m3169("ۖܰ") ^ i4) * 65;
                        i = ((iM2761 ^ i3) * (-6195)) ^ 1780906860;
                        i2 = -1098924927;
                    } else {
                        iM2761 = C0619.m2761("ۖ۟") ^ i3;
                        i = ((iM2761 ^ i4) * 5061) ^ 574092317;
                        i2 = -760092890;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 494688204:
                case 892404529:
                    int i14 = s + s2;
                    if ((i14 * i14) - i8 < 0) {
                        iM2761 = (C0619.m2761("ܶ۫") + i3) * (-45);
                        i = ((iM2761 ^ i4) * 24461) ^ (-1534504871);
                        i2 = -55151938;
                    } else {
                        iM2761 = C0619.m2761("᩶ۧ") ^ i4;
                        i = ((iM2761 ^ i3) * (-20651)) ^ (-1602539249);
                        i2 = -1194674686;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 590354814:
                case 1333178073:
                    i8 = i7 + 1;
                    if (C1783.f6087 <= 0) {
                        iM2761 = (C0773.m3169("ۖܰ") ^ i4) * 65;
                        i = ((iM2761 ^ i3) * (-6195)) ^ 1780906860;
                        i2 = -1098924927;
                    } else {
                        iM2761 = (i3 - C0619.m2761("֫ۗ")) * (-71);
                        i = ((iM2761 ^ i4) * (-21157)) ^ (-454527785);
                        i2 = 1720919726;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 945537403:
                case 1735049954:
                    C1783.m6232();
                    if (C2878.m9491() <= 0) {
                        iM2761 = C0619.m2761("ۡۖ") ^ i3;
                        i = ((iM2761 ^ i4) * 19959) ^ (-739590633);
                        i2 = 1379578807;
                    } else {
                        iM2761 = C0619.m2761("۟ۖ") ^ i4;
                        i = ((iM2761 ^ i3) * (-11179)) ^ (-1689052527);
                        i2 = -765001697;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 1198986609:
                case 1883271412:
                    C1783.m6232();
                    if (C2702.f8586 > 0) {
                        iM2761 = C0619.m2761("ۡۖ") ^ i3;
                        i = ((iM2761 ^ i4) * 19959) ^ (-739590633);
                        i2 = 1379578807;
                    } else {
                        iM2761 = (C0773.m3169("ۘܽ") ^ i3) * 19;
                        i = ((iM2761 ^ i4) * 28245) ^ (-1110893853);
                        i2 = -871936800;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                default:
                    strM11769 = AbstractC3624.m11769(sArr2, i10, 7, i9);
                    if (C0487.m2359(strM11995, strM11769)) {
                        strM4946 = str;
                        iM2761 = (C0773.m3169("᩹ۧ") + i4) * 73;
                        i = ((iM2761 ^ i3) * 24019) ^ 774306332;
                        i2 = 1857032255;
                    } else {
                        iM2761 = C0773.m3169("֡۬") ^ i4;
                        i = ((iM2761 ^ i3) * (-21031)) ^ (-1590938191);
                        i2 = -28458206;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x037c  */
    /* JADX WARN: Code duplicated, block: B:111:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:119:0x0417  */
    /* JADX WARN: Code duplicated, block: B:58:0x0193 A[PHI: r12 r14 r15
      0x0193: PHI (r12v3 java.lang.Object) = 
      (r12v2 java.lang.Object)
      (r12v1 java.lang.Object)
      (r12v1 java.lang.Object)
      (r12v1 java.lang.Object)
      (r12v1 java.lang.Object)
      (r12v1 java.lang.Object)
     binds: [B:56:0x017b, B:49:0x013b, B:43:0x0111, B:40:0x00f5, B:37:0x00d7, B:35:0x00cf] A[DONT_GENERATE, DONT_INLINE]
      0x0193: PHI (r14v4 java.lang.String) = 
      (r14v1 java.lang.String)
      (r14v3 java.lang.String)
      (r14v1 java.lang.String)
      (r14v1 java.lang.String)
      (r14v1 java.lang.String)
      (r14v1 java.lang.String)
     binds: [B:56:0x017b, B:49:0x013b, B:43:0x0111, B:40:0x00f5, B:37:0x00d7, B:35:0x00cf] A[DONT_GENERATE, DONT_INLINE]
      0x0193: PHI (r15v3 java.lang.String) = 
      (r15v1 java.lang.String)
      (r15v1 java.lang.String)
      (r15v1 java.lang.String)
      (r15v1 java.lang.String)
      (r15v2 java.lang.String)
      (r15v1 java.lang.String)
     binds: [B:56:0x017b, B:49:0x013b, B:43:0x0111, B:40:0x00f5, B:37:0x00d7, B:35:0x00cf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:82:0x028d A[PHI: r1 r5 r6 r7 r8 r9
      0x028d: PHI (r1v74 java.lang.CharSequence) = (r1v14 java.lang.CharSequence), (r1v16 java.lang.CharSequence), (r1v75 java.lang.CharSequence) binds: [B:80:0x0273, B:75:0x0233, B:68:0x01f4] A[DONT_GENERATE, DONT_INLINE]
      0x028d: PHI (r5v4 char) = (r5v2 char), (r5v1 char), (r5v1 char) binds: [B:80:0x0273, B:75:0x0233, B:68:0x01f4] A[DONT_GENERATE, DONT_INLINE]
      0x028d: PHI (r6v4 int) = (r6v2 int), (r6v1 int), (r6v1 int) binds: [B:80:0x0273, B:75:0x0233, B:68:0x01f4] A[DONT_GENERATE, DONT_INLINE]
      0x028d: PHI (r7v4 int) = (r7v2 int), (r7v1 int), (r7v1 int) binds: [B:80:0x0273, B:75:0x0233, B:68:0x01f4] A[DONT_GENERATE, DONT_INLINE]
      0x028d: PHI (r8v4 int) = (r8v2 int), (r8v1 int), (r8v1 int) binds: [B:80:0x0273, B:75:0x0233, B:68:0x01f4] A[DONT_GENERATE, DONT_INLINE]
      0x028d: PHI (r9v5 java.lang.String) = (r9v1 java.lang.String), (r9v3 java.lang.String), (r9v1 java.lang.String) binds: [B:80:0x0273, B:75:0x0233, B:68:0x01f4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c1, code lost:
    
        if (l.C3492.f12043 > 0) goto L27;
     */
    @Override // bin.mt.plugin.api.PluginContext
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void showToastL(java.lang.CharSequence r23, java.lang.Object... r24) {
        /*
            Method dump skipped, instruction units count: 1362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C20889.showToastL(java.lang.CharSequence, java.lang.Object[]):void");
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final void openLogViewer() {
        int i = -1068574697;
        int i2 = C1519.f5300;
        int i3 = C0950.f3488;
        int iM3169 = (i3 - C0773.m3169("۫ۧ")) * (-57);
        int i4 = ((iM3169 ^ i2) * 255) ^ (-1768565982);
        int i5 = 389042121;
        while (true) {
            i = ((((i ^ i2) * 16403) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -1398931414:
                case 1078761081:
                    if (C2288.f7433 > 0 && C1542.f5343 > 0) {
                        if (C1542.m5459() < 0) {
                            if (C3033.m9845() <= 0) {
                                iM3169 = C0619.m2761("ܽۢ") ^ i3;
                                i4 = ((iM3169 ^ i2) * (-30001)) ^ 1805055781;
                                i5 = 1787368542;
                                break;
                            } else if (C2485.m8357() > 0) {
                                if (C2288.f7433 <= 0) {
                                    iM3169 = (C0773.m3169("ᩴᩴ") ^ i3) * 115;
                                    i4 = ((iM3169 ^ i2) * 21471) ^ (-536244041);
                                    i5 = -22714997;
                                    break;
                                } else if (C20932.f66974 > 0 && C23916.f77426 > 0) {
                                    if (!C2878.f9462) {
                                        int i6 = 3;
                                        if (C2485.f7950 == 0) {
                                            ThreadUtil.runOnUiThread(new RunnableC1784(i6, this.f66864));
                                        }
                                    }
                                    break;
                                }
                            }
                        }
                        iM3169 = C0773.m3169("ܶۚ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-22817)) ^ 1791090086;
                        i5 = -996436545;
                        break;
                    }
                    iM3169 = (i2 - C0619.m2761("ۤܿ")) * (-17);
                    i4 = ((iM3169 ^ i3) * (-27909)) ^ 97663798;
                    i5 = 899826405;
                    break;
                case -1177687127:
                case -865113675:
                    C11235.m28309();
                    C20932.m47848();
                    iM3169 = (C0773.m3169("ᩴᩴ") ^ i3) * 115;
                    i4 = ((iM3169 ^ i2) * 21471) ^ (-536244041);
                    i5 = -22714997;
                    break;
                case -39688905:
                case 1906770584:
                    if (C2702.m8876()) {
                        iM3169 = (i2 - C0619.m2761("᩶ۨ")) * 85;
                        i4 = ((iM3169 ^ i3) * 13945) ^ (-348656119);
                        i5 = -6531868;
                    } else {
                        iM3169 = (C0773.m3169("ᩴᩴ") ^ i3) * 115;
                        i4 = ((iM3169 ^ i2) * 21471) ^ (-536244041);
                        i5 = -22714997;
                    }
                    break;
                case 435957967:
                case 912148317:
                    AbstractC0116.m1243();
                    break;
                case 486888633:
                case 2001117791:
                    if (C11235.f35427 < 0) {
                        iM3169 = C0619.m2761("ܽۢ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-30001)) ^ 1805055781;
                        i5 = 1787368542;
                    } else {
                        iM3169 = (C0773.m3169("ᩴᩴ") ^ i3) * 115;
                        i4 = ((iM3169 ^ i2) * 21471) ^ (-536244041);
                        i5 = -22714997;
                    }
                    break;
                default:
                    if (C2023.m6964() <= 0) {
                        iM3169 = (i2 - C0619.m2761("ۤܿ")) * (-17);
                        i4 = ((iM3169 ^ i3) * (-27909)) ^ 97663798;
                        i5 = 899826405;
                    } else {
                        iM3169 = C0619.m2761("ܽۢ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-30001)) ^ 1805055781;
                        i5 = 1787368542;
                    }
                    break;
            }
            return;
        }
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final void log(String str) {
        String str2 = this.f66864;
        C17159 c17159 = C5448.f19035;
        synchronized (C5448.class) {
            C5448.m16279(str2, str);
        }
    }
}
