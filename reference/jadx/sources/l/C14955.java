package l;

import com.alipay.sdk.m.y.q;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: l.ܰ᩻ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 05VR */
/* JADX INFO: loaded from: classes.dex */
public class C14955 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C5765 f48825;

    /* JADX INFO: renamed from: ܳܶۜ, reason: not valid java name and contains not printable characters */
    private static final short[] f48826;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f48827;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String f48828;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f48829;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f48830;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f48831;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C12558 f48832;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public byte[] f48833;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public HashMap f48834;

    public native C14955(byte[] bArr);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private native void m35977(StringBuilder sb, byte[] bArr, C21246 c21246, boolean z);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public native void m35985(C21246 c21246, boolean z);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public native void m35986(C21246 c21246, boolean z, AbstractC22044 abstractC22044);

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public native C7498 m35992();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public native void m35995(C21246 c21246, boolean z);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m35978(char c) {
        int i = -1633589891;
        int i2 = C1542.f5343;
        int i3 = C3099.f10023;
        int iM2761 = (i3 - C0619.m2761("ۙܰ")) * (-113);
        int i4 = ((iM2761 ^ i2) * (-20917)) ^ (-1633994152);
        int i5 = -58984520;
        while (true) {
            i = ((((i ^ i2) * (-4357)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2146883310:
                case -922313934:
                    if (C3734.m12152() >= 0) {
                        iM2761 = (C0619.m2761("ۡ֨") ^ i2) * 39;
                        i4 = ((iM2761 ^ i3) * (-19341)) ^ 1343125536;
                        i5 = -2020987036;
                    } else {
                        iM2761 = C0773.m3169("ۙۧ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 24715) ^ 1553674886;
                        i5 = 1567387586;
                    }
                    break;
                case -2131916166:
                case -1000587529:
                    C3099.m10095();
                    iM2761 = C0773.m3169("ۧ۬") ^ i3;
                    i4 = ((iM2761 ^ i2) * (-18557)) ^ 1128075896;
                    i5 = -995926634;
                    break;
                case -1920443224:
                case 538160451:
                    if (c <= 'Z') {
                        iM2761 = (C0619.m2761("۫ۢ") + i2) * 57;
                        i4 = ((iM2761 ^ i3) * 22221) ^ 1197087323;
                        i5 = -1742254695;
                    } else {
                        iM2761 = C0619.m2761("ᩳۡ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 20899) ^ 1406170239;
                        i5 = 872361925;
                    }
                    break;
                case -1917791691:
                case 1319465967:
                    if (c >= 'A') {
                        iM2761 = C0619.m2761("ۨۨ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-26901)) ^ (-517819163);
                        i5 = -707101906;
                    } else {
                        iM2761 = C0619.m2761("ᩳۡ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 20899) ^ 1406170239;
                        i5 = 872361925;
                    }
                    break;
                case -1843818944:
                case 87969386:
                    if (C0487.f2131 <= 0) {
                        iM2761 = C0619.m2761("᩸ܶ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 20059) ^ 1784711173;
                        i5 = 845818129;
                    } else {
                        iM2761 = (C0773.m3169("᩻ܿ") ^ i2) * 45;
                        i4 = ((iM2761 ^ i3) * 6569) ^ (-1726596294);
                        i5 = -438218016;
                    }
                    break;
                case -1793958880:
                case 25829597:
                    if (c <= 'z') {
                        iM2761 = (C0619.m2761("۫ۢ") + i2) * 57;
                        i4 = ((iM2761 ^ i3) * 22221) ^ 1197087323;
                        i5 = -1742254695;
                    } else {
                        iM2761 = C0773.m3169("᩺۠") ^ i3;
                        i4 = ((iM2761 ^ i2) * 6749) ^ (-355255582);
                        i5 = 181714129;
                    }
                    break;
                case -1661895691:
                case -550618400:
                    C1321.m4852();
                    return false;
                case -1495409073:
                case 1384480241:
                    if (c == '_') {
                        iM2761 = (C0619.m2761("۫ۢ") + i2) * 57;
                        i4 = ((iM2761 ^ i3) * 22221) ^ 1197087323;
                        i5 = -1742254695;
                    } else {
                        iM2761 = (C0773.m3169("᩸֡") + i3) * (-3);
                        i4 = ((iM2761 ^ i2) * (-21405)) ^ 455028389;
                        i5 = -1339294928;
                    }
                    break;
                case -1438565495:
                case -619637320:
                    C3099.m10095();
                    if (C2375.m8065() > 0) {
                        iM2761 = (C0619.m2761("ۧᩳ") + i2) * 65;
                        i4 = ((iM2761 ^ i3) * 21513) ^ 1325846915;
                        i5 = 585325794;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ᩴۛ")) * (-125);
                        i4 = ((iM2761 ^ i2) * 9607) ^ (-1869151338);
                        i5 = 224846598;
                    }
                    break;
                case -1390987936:
                case -825073742:
                    return true;
                case -1387833766:
                case -328627109:
                    if (!C0619.f2439) {
                        iM2761 = C0619.m2761("᩸ܶ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 20059) ^ 1784711173;
                        i5 = 845818129;
                    } else {
                        iM2761 = (C0619.m2761("ۧᩳ") + i2) * 65;
                        i4 = ((iM2761 ^ i3) * 21513) ^ 1325846915;
                        i5 = 585325794;
                    }
                    break;
                case -1136715216:
                case 1782310953:
                    if (C11235.f35427 < 0) {
                        iM2761 = (C0773.m3169("ᩳۚ") + i2) * (-111);
                        i4 = ((iM2761 ^ i3) * (-29187)) ^ (-299743598);
                        i5 = 1253701503;
                    } else {
                        iM2761 = C0773.m3169("ۧ۬") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-18557)) ^ 1128075896;
                        i5 = -995926634;
                    }
                    break;
                case -1033460001:
                case 1737410524:
                    if (C1519.f5300 >= 0) {
                        iM2761 = (C0619.m2761("ۧᩳ") + i2) * 65;
                        i4 = ((iM2761 ^ i3) * 21513) ^ 1325846915;
                        i5 = 585325794;
                    } else {
                        iM2761 = C0773.m3169("ۧ۬") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-18557)) ^ 1128075896;
                        i5 = -995926634;
                    }
                    break;
                case -940261800:
                case -718362810:
                    if (C3734.m12152() >= 0) {
                        iM2761 = (C0619.m2761("ۡ֨") ^ i2) * 39;
                        i4 = ((iM2761 ^ i3) * (-19341)) ^ 1343125536;
                        i5 = -2020987036;
                    } else {
                        iM2761 = C0773.m3169("֡ܺ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-11477)) ^ (-286825761);
                        i5 = 203003467;
                    }
                    break;
                case -373499557:
                case 1188469443:
                    return false;
                case -294016864:
                case 1185223913:
                    if (C3690.f12684 <= 0) {
                        iM2761 = (C0773.m3169("ᩳۚ") + i2) * (-111);
                        i4 = ((iM2761 ^ i3) * (-29187)) ^ (-299743598);
                        i5 = 1253701503;
                    } else {
                        iM2761 = C0619.m2761("᩷᩸") ^ i2;
                        i4 = ((iM2761 ^ i3) * 7499) ^ (-1610550227);
                        i5 = 822328534;
                    }
                    break;
                case -76177025:
                case 1271522451:
                    if (c <= '9') {
                        iM2761 = (C0619.m2761("۫ۢ") + i2) * 57;
                        i4 = ((iM2761 ^ i3) * 22221) ^ 1197087323;
                        i5 = -1742254695;
                    } else {
                        iM2761 = C0773.m3169("᩻ܰ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 28607) ^ 1725200475;
                        i5 = -706669402;
                    }
                    break;
                case -4473383:
                case 2116443406:
                    if (C3734.f12817 >= 0) {
                        iM2761 = (C0619.m2761("ۡ֨") ^ i2) * 39;
                        i4 = ((iM2761 ^ i3) * (-19341)) ^ 1343125536;
                        i5 = -2020987036;
                    } else {
                        iM2761 = C0619.m2761("᩶᩶") ^ i2;
                        i4 = ((iM2761 ^ i3) * 25877) ^ 1338966789;
                        i5 = -1830758235;
                    }
                    break;
                case 8698488:
                case 591185291:
                    if (C11235.f35427 >= 0) {
                        iM2761 = (C0619.m2761("ۧᩳ") + i2) * 65;
                        i4 = ((iM2761 ^ i3) * 21513) ^ 1325846915;
                        i5 = 585325794;
                    } else {
                        iM2761 = (C0773.m3169("᩺᩶") ^ i2) * 101;
                        i4 = ((iM2761 ^ i3) * (-28557)) ^ (-1755701977);
                        i5 = -2147468835;
                    }
                    break;
                case 59187080:
                case 743607980:
                    if (C1783.f6087 <= 0) {
                        iM2761 = (C0773.m3169("ᩳۚ") + i2) * (-111);
                        i4 = ((iM2761 ^ i3) * (-29187)) ^ (-299743598);
                        i5 = 1253701503;
                    } else {
                        iM2761 = C0619.m2761("ۙۨ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-10933)) ^ 1894368516;
                        i5 = 1490459601;
                    }
                    break;
                case 127493256:
                case 1944209549:
                    if (C2966.f9654 >= 0) {
                        iM2761 = (C0619.m2761("ۡ֨") ^ i2) * 39;
                        i4 = ((iM2761 ^ i3) * (-19341)) ^ 1343125536;
                        i5 = -2020987036;
                    } else {
                        iM2761 = (C0619.m2761("ۤ᩺") ^ i3) * 49;
                        i4 = ((iM2761 ^ i2) * (-22935)) ^ 653704789;
                        i5 = 164474160;
                    }
                    break;
                case 149046004:
                case 2057164071:
                    if (c >= 'a') {
                        iM2761 = C0619.m2761("֫ۤ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-18361)) ^ (-783943976);
                        i5 = 1223382632;
                    } else {
                        iM2761 = C0773.m3169("᩺۠") ^ i3;
                        i4 = ((iM2761 ^ i2) * 6749) ^ (-355255582);
                        i5 = 181714129;
                    }
                    break;
                case 1414257012:
                case 1764625050:
                    if (c >= '0') {
                        iM2761 = (C0773.m3169("ܺۛ") + i2) * (-13);
                        i4 = ((iM2761 ^ i3) * (-4279)) ^ 2133003637;
                        i5 = -1098373848;
                    } else {
                        iM2761 = C0773.m3169("᩻ܰ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 28607) ^ 1725200475;
                        i5 = -706669402;
                    }
                    break;
                case 1581209295:
                case 2019635739:
                    if (RunnableC1848.f6235) {
                        iM2761 = C0619.m2761("᩸ܶ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 20059) ^ 1784711173;
                        i5 = 845818129;
                    } else {
                        iM2761 = (i2 - C0619.m2761("ۗ۠")) * (-99);
                        i4 = ((iM2761 ^ i3) * 6453) ^ 803864859;
                        i5 = 1483991375;
                    }
                    break;
                default:
                    if (C1826.m6301() >= 0) {
                        iM2761 = (C0619.m2761("ۧᩳ") + i2) * 65;
                        i4 = ((iM2761 ^ i3) * 21513) ^ 1325846915;
                        i5 = 585325794;
                    } else {
                        iM2761 = (C0773.m3169("ܰܽ") ^ i3) * (-67);
                        i4 = ((iM2761 ^ i2) * (-12055)) ^ (-1654324277);
                        i5 = 730078381;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14955 m35973(InputStream inputStream) throws Throwable {
        int iM3169;
        int i;
        Throwable th = null;
        Object th2 = null;
        RuntimeException e = null;
        int i2 = 2089476432;
        int i3 = C3099.f10023;
        int i4 = C0487.f2131;
        int iM31610 = (C0773.m3169("֫۟") + i4) * (-125);
        int i5 = ((iM31610 ^ i3) * (-871)) ^ 1784364135;
        int i6 = -530714559;
        while (true) {
            int i7 = iM31610 ^ i6;
            C14955 c14955 = null;
            while (true) {
                i2 = ((((i2 ^ i3) * (-13825)) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2074163655:
                    case 1164281530:
                        if (C2023.m6964() <= 0) {
                            iM31610 = (C0773.m3169("ۨۢ") + i3) * 27;
                            i5 = ((iM31610 ^ i4) * 17917) ^ (-1524040923);
                            i6 = -1701034108;
                            break;
                        }
                        iM31610 = C0619.m2761("ۗ۠") ^ i3;
                        i5 = ((iM31610 ^ i4) * (-10651)) ^ 636671846;
                        i6 = 105982268;
                    case -2070127198:
                    case -1732586378:
                        C2878.m9491();
                        C3779.m12264();
                        iM31610 = C0619.m2761("ۗ۠") ^ i3;
                        i5 = ((iM31610 ^ i4) * (-10651)) ^ 636671846;
                        i6 = 105982268;
                        break;
                    case -1858429133:
                    case 20860809:
                        if (C2834.f9334 > 0) {
                            iM31610 = C0619.m2761("ۗ۠") ^ i3;
                            i5 = ((iM31610 ^ i4) * (-10651)) ^ 636671846;
                            i6 = 105982268;
                        }
                        iM3169 = C0773.m3169("ۖ۫") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-17987)) ^ (-2024014709);
                        i = -1813135249;
                        i7 = iM3169 ^ i;
                        break;
                    case -1696870231:
                    case 1953199054:
                        RunnableC0334.m2060(inputStream);
                        iM3169 = (C0619.m2761("᩵ۚ") ^ i3) * (-91);
                        i5 = ((iM3169 ^ i4) * 15969) ^ (-709790976);
                        i = -268018598;
                        i7 = iM3169 ^ i;
                        break;
                    case -1546767301:
                    case 1219529304:
                        throw new IOException(e);
                    case -1270953948:
                    case -545188753:
                        try {
                            C1519.m5402(inputStream);
                            iM3169 = C0619.m2761("᩻ᩴ") ^ i3;
                            i5 = ((iM3169 ^ i4) * (-20265)) ^ 24995911;
                            i = 1638343427;
                        } catch (Throwable th3) {
                            th2 = th3;
                            iM3169 = C0773.m3169("ᩳ۬") ^ i3;
                            i5 = ((iM3169 ^ i4) * (-15409)) ^ 55228926;
                            i = 263933793;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case -1123970791:
                    case -900989692:
                        C11235.m28309();
                        if (C3077.f9998) {
                            iM31610 = (i4 - C0773.m3169("۟ۛ")) * (-105);
                            i5 = ((iM31610 ^ i3) * (-26971)) ^ (-2106825968);
                            i6 = -203515049;
                        }
                        iM3169 = C0773.m3169("ۖ۫") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-17987)) ^ (-2024014709);
                        i = -1813135249;
                        i7 = iM3169 ^ i;
                        break;
                    case -1116057852:
                    case -558748285:
                        C2878.m9491();
                        if (C2023.m6964() > 0) {
                            iM31610 = C0619.m2761("ۛ᩺") ^ i3;
                            i5 = ((iM31610 ^ i4) * (-25567)) ^ (-1480549630);
                            i6 = -603139520;
                        }
                        iM3169 = C0773.m3169("ۖ۫") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-17987)) ^ (-2024014709);
                        i = -1813135249;
                        i7 = iM3169 ^ i;
                        break;
                    case 268456989:
                    case 1368762492:
                        C2702.m8876();
                        if (C1826.f6190 <= 0) {
                            iM3169 = C0773.m3169("۬֫") ^ i4;
                            i5 = ((iM3169 ^ i3) * 3489) ^ (-992004893);
                            i = -1838969326;
                            i7 = iM3169 ^ i;
                        } else {
                            iM31610 = C0619.m2761("ۗ۠") ^ i3;
                            i5 = ((iM31610 ^ i4) * (-10651)) ^ 636671846;
                            i6 = 105982268;
                        }
                        break;
                    case 273042362:
                    case 972461788:
                        throw th;
                    case 303011270:
                    case 1577257299:
                        C2310.m7813();
                        C4238.m13540();
                        return null;
                    case 637521465:
                    case 1924940453:
                        if (inputStream != null) {
                            iM3169 = C0619.m2761("ۛۤ") ^ i4;
                            i5 = ((iM3169 ^ i3) * 26869) ^ 1963605544;
                            i = -1555082155;
                        } else {
                            iM3169 = C0619.m2761("᩻ᩴ") ^ i3;
                            i5 = ((iM3169 ^ i4) * (-20265)) ^ 24995911;
                            i = 1638343427;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case 1044978064:
                    case 1829425989:
                        try {
                            if (C2966.f9654 < 0) {
                                if (C1542.f5343 <= 0 || C1343.f4799 != 0) {
                                    iM31610 = C0619.m2761("ۛ᩺") ^ i3;
                                    i5 = ((iM31610 ^ i4) * (-25567)) ^ (-1480549630);
                                    i6 = -603139520;
                                }
                                if (C20932.f66974 > 0) {
                                    if (!C0619.m2763() && !C2023.f6737) {
                                        if (C2966.f9654 >= 0) {
                                            iM31610 = (C0773.m3169("ۨۢ") + i3) * 27;
                                            i5 = ((iM31610 ^ i4) * 17917) ^ (-1524040923);
                                            i6 = -1701034108;
                                            break;
                                            break;
                                        }
                                        if (C2702.f8586 > 0) {
                                            if (!C0619.f2439) {
                                                if (AbstractC3624.f12429 > 0) {
                                                    c14955 = new C14955(C20244.m46522(inputStream, 0));
                                                    iM3169 = C0773.m3169("᩺ۡ") ^ i3;
                                                    i5 = ((iM3169 ^ i4) * (-29349)) ^ (-935964297);
                                                    i = 1726058980;
                                                    i7 = iM3169 ^ i;
                                                } else {
                                                    iM31610 = (C0619.m2761("᩷֡") ^ i3) * 57;
                                                    i5 = ((iM31610 ^ i4) * (-30701)) ^ (-1794304067);
                                                    i6 = -1171027151;
                                                }
                                                break;
                                            }
                                        }
                                    }
                                    iM31610 = C0619.m2761("ۗ۠") ^ i3;
                                    i5 = ((iM31610 ^ i4) * (-10651)) ^ 636671846;
                                    i6 = 105982268;
                                }
                                break;
                                break;
                            }
                            iM31610 = (i4 - C0773.m3169("۟ۛ")) * (-105);
                            i5 = ((iM31610 ^ i3) * (-26971)) ^ (-2106825968);
                            i6 = -203515049;
                        } catch (Throwable th4) {
                            th = th4;
                            iM31610 = C0773.m3169("ۡۘ") ^ i4;
                            i5 = ((iM31610 ^ i3) * 28019) ^ (-902846185);
                            i6 = 848188726;
                        }
                        break;
                    case 1051742405:
                    case 1925323505:
                        if (inputStream != null) {
                            iM3169 = (i4 - C0773.m3169("ۢ᩹")) * (-35);
                            i5 = ((iM3169 ^ i3) * (-21697)) ^ (-2143853502);
                            i = 1367327412;
                        } else {
                            iM3169 = (C0619.m2761("᩵ۚ") ^ i3) * (-91);
                            i5 = ((iM3169 ^ i4) * 15969) ^ (-709790976);
                            i = -268018598;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case 1220659490:
                    case 1794533941:
                        return c14955;
                    case 1474989886:
                    case 1873887657:
                        try {
                            C1146.m4219(th, th2);
                            iM3169 = C0619.m2761("᩻ᩴ") ^ i3;
                            i5 = ((iM3169 ^ i4) * (-20265)) ^ 24995911;
                            i = 1638343427;
                        } catch (RuntimeException e2) {
                            e = e2;
                            iM3169 = (C0773.m3169("ᩴ᩸") ^ i4) * 5;
                            i5 = ((iM3169 ^ i3) * (-26645)) ^ 1600253133;
                            i = -688651209;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    default:
                        if (!C2288.m7767()) {
                            iM31610 = (i4 - C0773.m3169("۟ۛ")) * (-105);
                            i5 = ((iM31610 ^ i3) * (-26971)) ^ (-2106825968);
                            i6 = -203515049;
                        }
                        iM3169 = C0619.m2761("۬᩹") ^ i4;
                        i5 = ((iM3169 ^ i3) * 15335) ^ (-390620382);
                        i = -1442055919;
                        i7 = iM3169 ^ i;
                        break;
                        break;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x006d  */
    /* JADX WARN: Code duplicated, block: B:39:0x008c  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c2  */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C14955 m35982(byte[] bArr) throws IOException {
        int iM2761;
        int i;
        RuntimeException e = null;
        int i2 = -1970571305;
        int i3 = C2354.f7599;
        int i4 = C2287.f7432;
        int iM3169 = C0773.m3169("ۛ᩻") ^ i3;
        int i5 = ((iM3169 ^ i4) * 9287) ^ (-1848744500);
        int i6 = -403397051;
        while (true) {
            int i7 = iM3169 ^ i6;
            C14955 c14955 = null;
            while (true) {
                i2 = ((((i2 ^ i4) * 24317) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2109404797:
                    case -354797624:
                        C23916.m53419();
                        C1542.m5459();
                        iM2761 = (C0773.m3169("ᩴܰ") + i4) * (-33);
                        i5 = ((iM2761 ^ i3) * (-27527)) ^ 1551814109;
                        i = -2072997876;
                        i7 = iM2761 ^ i;
                        break;
                    case -2079716627:
                    case 1575138596:
                        C0619.m2763();
                        if (C3998.f13671 == 0) {
                            iM2761 = (C0773.m3169("ᩴܰ") + i4) * (-33);
                            i5 = ((iM2761 ^ i3) * (-27527)) ^ 1551814109;
                            i = -2072997876;
                        } else {
                            iM2761 = (C0773.m3169("᩹ᩴ") + i3) * 127;
                            i5 = ((iM2761 ^ i4) * 23409) ^ (-878581417);
                            i = 588117334;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case -1796531571:
                    case -933572217:
                        AbstractC0116.m1243();
                        if (C20932.f66974 <= 0) {
                            iM2761 = (C0773.m3169("ᩴܰ") + i4) * (-33);
                            i5 = ((iM2761 ^ i3) * (-27527)) ^ 1551814109;
                            i = -2072997876;
                        } else {
                            iM2761 = C0619.m2761("᩻ܽ") ^ i3;
                            i5 = ((iM2761 ^ i4) * (-8467)) ^ 1692178902;
                            i = 342441823;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case -1427614596:
                    case 2085442217:
                        if (C2023.m6964() > 0) {
                            if (C3448.f11240 < 0 && C0487.f2131 > 0) {
                                if (C1783.f6087 > 0) {
                                    if (C17202.f56030) {
                                        if (!C3077.m10041()) {
                                            if (RunnableC1848.f6235) {
                                                iM2761 = (C0619.m2761("ᩳܿ") + i4) * 25;
                                                i5 = ((iM2761 ^ i3) * (-21933)) ^ 904521549;
                                                i = 1254483882;
                                            } else if (C1826.m6301() < 0) {
                                                if (C1080.m4050()) {
                                                    if (C2375.f7641 > 0) {
                                                        throw new IOException(e);
                                                    }
                                                }
                                            }
                                        }
                                        iM2761 = (C0773.m3169("᩹ᩴ") + i3) * 127;
                                        i5 = ((iM2761 ^ i4) * 23409) ^ (-878581417);
                                        i = 588117334;
                                    } else {
                                        iM2761 = C0619.m2761("᩻ܽ") ^ i3;
                                        i5 = ((iM2761 ^ i4) * (-8467)) ^ 1692178902;
                                        i = 342441823;
                                    }
                                    i7 = iM2761 ^ i;
                                }
                            }
                            iM2761 = (C0773.m3169("ᩴܰ") + i4) * (-33);
                            i5 = ((iM2761 ^ i3) * (-27527)) ^ 1551814109;
                            i = -2072997876;
                            i7 = iM2761 ^ i;
                        }
                        iM2761 = C0773.m3169("ۨᩴ") ^ i3;
                        i5 = ((iM2761 ^ i4) * 10489) ^ (-1330844483);
                        i = 778962835;
                        i7 = iM2761 ^ i;
                        break;
                    case -1202859146:
                    case 2006204629:
                        try {
                            c14955 = new C14955(bArr);
                            iM2761 = C0619.m2761("ۖܿ") ^ i4;
                            i5 = ((iM2761 ^ i3) * 4745) ^ (-1418025983);
                            i = 1131931117;
                            i7 = iM2761 ^ i;
                        } catch (RuntimeException e2) {
                            e = e2;
                            iM3169 = C0619.m2761("ܰ᩹") ^ i3;
                            i5 = ((iM3169 ^ i4) * 19979) ^ (-834657243);
                            i6 = -332553616;
                        }
                        break;
                    case -1017077555:
                    case 1529245436:
                        return c14955;
                    case -492765319:
                    case -117871081:
                        C1519.m5403();
                        return null;
                    default:
                        C2419.m8174();
                        if (C3998.f13671 == 0) {
                            iM2761 = C0619.m2761("᩻ܽ") ^ i3;
                            i5 = ((iM2761 ^ i4) * (-8467)) ^ 1692178902;
                            i = 342441823;
                        } else {
                            iM2761 = (C0619.m2761("ᩳܿ") + i4) * 25;
                            i5 = ((iM2761 ^ i3) * (-21933)) ^ 904521549;
                            i = 1254483882;
                        }
                        i7 = iM2761 ^ i;
                        break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14955 m35974(C13961 c13961) {
        long length = 0;
        int i = 0;
        byte[] bArr = null;
        int i2 = 0;
        byte[] bArrM35984 = null;
        C14955 c14955M35982 = null;
        int i3 = -678524132;
        int i4 = C1146.f4234;
        int i5 = C1519.f5300;
        int iM3169 = C0773.m3169("ܳ۬") ^ i4;
        int i6 = ((iM3169 ^ i5) * (-22861)) ^ 946711517;
        int i7 = 1567202620;
        while (true) {
            i3 = ((((i3 ^ i5) * 26311) >> 31) & i6) ^ (iM3169 ^ i7);
            switch (i3) {
                case -2030990828:
                case -1406652458:
                    if (RunnableC3646.f12471) {
                        iM3169 = C0773.m3169("ܽۙ") ^ i4;
                        i6 = ((iM3169 ^ i5) * 21375) ^ (-645886139);
                        i7 = 1703792204;
                    } else {
                        iM3169 = (C0773.m3169("ᩳ۬") ^ i5) * 41;
                        i6 = ((iM3169 ^ i4) * 10815) ^ 675285172;
                        i7 = 217574786;
                    }
                    break;
                case -1807389725:
                case -58873419:
                    return c14955M35982;
                case -1766726399:
                case 1078077684:
                    if (length > 52428800) {
                        iM3169 = C0619.m2761("ܶ۫") ^ i4;
                        i6 = ((iM3169 ^ i5) * (-25377)) ^ (-280795962);
                        i7 = 1346032171;
                    } else {
                        iM3169 = C0619.m2761("᩸۟") ^ i5;
                        i6 = ((iM3169 ^ i4) * 28707) ^ (-2035821367);
                        i7 = -704922445;
                    }
                    break;
                case -1506876059:
                case 47898539:
                    if (C2702.f8586 <= 0) {
                        iM3169 = C0773.m3169("ܽۙ") ^ i4;
                        i6 = ((iM3169 ^ i5) * 21375) ^ (-645886139);
                        i7 = 1703792204;
                    } else {
                        iM3169 = (i5 - C0773.m3169("᩸ۙ")) * 59;
                        i6 = ((iM3169 ^ i4) * (-12339)) ^ (-2093768698);
                        i7 = -513171443;
                    }
                    break;
                case -1401646497:
                case 1745266742:
                    c13961.seek(0L);
                    iM3169 = C0619.m2761("᩸۟") ^ i5;
                    i6 = ((iM3169 ^ i4) * 28707) ^ (-2035821367);
                    i7 = -704922445;
                    break;
                case -1036410555:
                case 1132492076:
                    if (C17202.f56030) {
                        iM3169 = (C0773.m3169("ܳ۟") + i4) * 53;
                        i6 = ((iM3169 ^ i5) * 703) ^ 2134343698;
                        i7 = 534901735;
                    } else {
                        iM3169 = (i5 - C0773.m3169("᩸ۙ")) * 59;
                        i6 = ((iM3169 ^ i4) * (-12339)) ^ (-2093768698);
                        i7 = -513171443;
                    }
                    break;
                case -1034331607:
                case 1610952487:
                    C1783.m6232();
                    C3099.m10095();
                    iM3169 = C0619.m2761("۟᩶") ^ i4;
                    i6 = ((iM3169 ^ i5) * 21119) ^ 89750981;
                    i7 = -717952659;
                    break;
                case -1029973828:
                case 809107381:
                    if (bArrM35984 != null) {
                        iM3169 = C0773.m3169("ۜ᩷") ^ i5;
                        i6 = ((iM3169 ^ i4) * 22531) ^ (-15779540);
                        i7 = -184405530;
                    } else {
                        iM3169 = (C0619.m2761("֨۬") + i4) * (-5);
                        i6 = ((iM3169 ^ i5) * 29507) ^ 1799517310;
                        i7 = 568920317;
                    }
                    break;
                case -942165164:
                case 446580684:
                    if (C2288.f7433 <= 0) {
                        iM3169 = (i5 - C0773.m3169("᩸ۙ")) * 59;
                        i6 = ((iM3169 ^ i4) * (-12339)) ^ (-2093768698);
                        i7 = -513171443;
                    } else {
                        iM3169 = (C0619.m2761("۠ۙ") ^ i5) * (-67);
                        i6 = ((iM3169 ^ i4) * 8393) ^ (-727864347);
                        i7 = -1032692222;
                    }
                    break;
                case -929437738:
                case -317709017:
                    length = c13961.length();
                    if (C2023.f6737) {
                        iM3169 = (C0619.m2761("֨ܶ") + i5) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i6 = ((iM3169 ^ i4) * 25731) ^ 1569328179;
                        i7 = -1510694954;
                    } else {
                        iM3169 = (C0619.m2761("ۧ۬") + i4) * 23;
                        i6 = ((iM3169 ^ i5) * (-9077)) ^ 1033815276;
                        i7 = 896127891;
                    }
                    break;
                case -718985108:
                case 176560107:
                    i = (int) length;
                    bArr = new byte[i];
                    if (C3077.f9998) {
                        iM3169 = C0773.m3169("ܰۨ") ^ i4;
                        i6 = ((iM3169 ^ i5) * 16725) ^ (-367846669);
                        i7 = -934483524;
                    } else {
                        iM3169 = C0619.m2761("۟᩶") ^ i4;
                        i6 = ((iM3169 ^ i5) * 21119) ^ 89750981;
                        i7 = -717952659;
                    }
                    break;
                case -705398926:
                case 1789678152:
                    C1519.m5403();
                    if (C11235.f35427 < 0) {
                        iM3169 = (i5 - C0773.m3169("᩸ۙ")) * 59;
                        i6 = ((iM3169 ^ i4) * (-12339)) ^ (-2093768698);
                        i7 = -513171443;
                    } else {
                        iM3169 = C0619.m2761("۟᩶") ^ i4;
                        i6 = ((iM3169 ^ i5) * 21119) ^ 89750981;
                        i7 = -717952659;
                    }
                    break;
                case -532452772:
                case -461375454:
                    bArrM35984 = m35984(c13961);
                    iM3169 = (i5 - C0773.m3169("ܽܺ")) * 123;
                    i6 = ((iM3169 ^ i4) * (-18245)) ^ 1762677973;
                    i7 = 1364851299;
                    break;
                case -509261750:
                case 1910734739:
                    C3779.m12264();
                    if (C1080.f3865 >= 0) {
                        iM3169 = (C0619.m2761("֨ܶ") + i5) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i6 = ((iM3169 ^ i4) * 25731) ^ 1569328179;
                        i7 = -1510694954;
                    } else {
                        iM3169 = (i5 - C0773.m3169("᩸ۙ")) * 59;
                        i6 = ((iM3169 ^ i4) * (-12339)) ^ (-2093768698);
                        i7 = -513171443;
                    }
                    break;
                case -275605166:
                case -17927596:
                    if (C3448.f11240 >= 0) {
                        iM3169 = C0773.m3169("ܽۙ") ^ i4;
                        i6 = ((iM3169 ^ i5) * 21375) ^ (-645886139);
                        i7 = 1703792204;
                    } else {
                        iM3169 = (C0619.m2761("۟ᩳ") + i5) * 17;
                        i6 = ((iM3169 ^ i4) * (-6763)) ^ 109760314;
                        i7 = -171286498;
                    }
                    break;
                case 251376649:
                case 1721733412:
                    if (C1519.f5300 >= 0) {
                        iM3169 = (i4 - C0773.m3169("۬᩻")) * (-5);
                        i6 = ((iM3169 ^ i5) * 25051) ^ 1795000595;
                        i7 = 1811977995;
                    } else {
                        iM3169 = (i4 - C0619.m2761("᩺ܶ")) * (-47);
                        i6 = ((iM3169 ^ i5) * 21317) ^ (-1990688577);
                        i7 = 912781104;
                    }
                    break;
                case 352912540:
                case 712789698:
                    try {
                        c14955M35982 = m35982(bArrM35984);
                        iM3169 = C0773.m3169("ۜᩳ") ^ i4;
                        i6 = ((iM3169 ^ i5) * (-2429)) ^ (-513632728);
                        i7 = 1275336864;
                    } catch (Throwable unused) {
                        iM3169 = (C0619.m2761("֨۬") + i4) * (-5);
                        i6 = ((iM3169 ^ i5) * 29507) ^ 1799517310;
                        i7 = 568920317;
                    }
                    break;
                case 582818557:
                case 1499491890:
                    if (C1080.f3865 >= 0) {
                        iM3169 = C0773.m3169("ܽۙ") ^ i4;
                        i6 = ((iM3169 ^ i5) * 21375) ^ (-645886139);
                        i7 = 1703792204;
                    } else {
                        iM3169 = C0773.m3169("᩸ۢ") ^ i4;
                        i6 = ((iM3169 ^ i5) * 27613) ^ 1939146119;
                        i7 = 1777486997;
                    }
                    break;
                case 682478408:
                case 1913678108:
                    c13961.readFully(bArr, i2, i);
                    return m35982(bArr);
                case 1025970795:
                case 1699567640:
                    C1080.m4050();
                    return null;
                case 1028157660:
                case 2016760326:
                    i2 = 0;
                    if (C1542.f5343 <= 0) {
                        iM3169 = (i4 - C0773.m3169("۬᩻")) * (-5);
                        i6 = ((iM3169 ^ i5) * 25051) ^ 1795000595;
                        i7 = 1811977995;
                    } else {
                        iM3169 = C0773.m3169("ܳ᩷") ^ i5;
                        i6 = ((iM3169 ^ i4) * (-22575)) ^ 2016252093;
                        i7 = -1385299833;
                    }
                    break;
                default:
                    if (C3779.f12953 <= 0) {
                        iM3169 = (C0619.m2761("֨ܶ") + i5) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i6 = ((iM3169 ^ i4) * 25731) ^ 1569328179;
                        i7 = -1510694954;
                    } else {
                        iM3169 = (C0773.m3169("᩸ܽ") ^ i5) * 65;
                        i6 = ((iM3169 ^ i4) * (-25505)) ^ 214891941;
                        i7 = -1340924301;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:0x03c6 A[PHI: r17
      0x03c6: PHI (r17v34 byte[]) = (r17v3 byte[]), (r17v5 byte[]), (r17v35 byte[]) binds: [B:110:0x03c4, B:102:0x036f, B:8:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:87:0x02b2 A[PHI: r7 r8 r9 r17
      0x02b2: PHI (r7v3 short) = (r7v2 short), (r7v1 short) binds: [B:86:0x02b0, B:82:0x028c] A[DONT_GENERATE, DONT_INLINE]
      0x02b2: PHI (r8v3 int) = (r8v2 int), (r8v1 int) binds: [B:86:0x02b0, B:82:0x028c] A[DONT_GENERATE, DONT_INLINE]
      0x02b2: PHI (r9v2 int) = (r9v1 int), (r9v3 int) binds: [B:86:0x02b0, B:82:0x028c] A[DONT_GENERATE, DONT_INLINE]
      0x02b2: PHI (r17v10 byte[]) = (r17v9 byte[]), (r17v11 byte[]) binds: [B:86:0x02b0, B:82:0x028c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:99:0x033d A[PHI: r10 r17
      0x033d: PHI (r10v3 short) = (r10v1 short), (r10v1 short), (r10v2 short), (r10v1 short) binds: [B:98:0x033b, B:94:0x031a, B:78:0x0266, B:12:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x033d: PHI (r17v31 byte[]) = (r17v6 byte[]), (r17v7 byte[]), (r17v12 byte[]), (r17v32 byte[]) binds: [B:98:0x033b, B:94:0x031a, B:78:0x0266, B:12:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0085, code lost:
    
        if (l.C2288.f7433 <= 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0087, code lost:
    
        r17 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a8, code lost:
    
        if (l.C2419.m8174() >= 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c7, code lost:
    
        if (l.C2023.f6737 == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ce, code lost:
    
        if (l.C23916.m53419() != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d1, code lost:
    
        r0 = (r14 - l.C0619.m2761("ܶܺ")) * (-121);
        r15 = ((r0 ^ r13) * 31729) ^ (-1270612786);
        r17 = -697154925;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C14955 m35975(l.AbstractC22044 r23) {
        /*
            Method dump skipped, instruction units count: 1320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14955.m35975(l.᩷ۨᩴ):l.ܰ᩻ܺ");
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0060  */
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final XmlResourceParserC9734 m35991() {
        int iM3169;
        int i;
        int i2 = -873348398;
        int i3 = C20932.f66974;
        int i4 = C11235.f35427;
        int iM31610 = (C0773.m3169("᩺ᩴ") ^ i3) * 75;
        int i5 = ((iM31610 ^ i4) * (-2245)) ^ (-1016930436);
        int i6 = -523677936;
        while (true) {
            int i7 = iM31610 ^ i6;
            ByteArrayInputStream byteArrayInputStream = null;
            XmlResourceParserC9734 xmlResourceParserC9734 = null;
            while (true) {
                i2 = ((((i2 ^ i4) * (-21737)) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -1558240424:
                    case -957716422:
                        C2375.m8065();
                        C2702.m8876();
                        return null;
                    case -1469619909:
                    case -18627036:
                        C3690.m11987();
                        if (RunnableC0334.m2063()) {
                            iM3169 = C0773.m3169("۠֫") ^ i3;
                            i5 = ((iM3169 ^ i4) * 12575) ^ 1142863684;
                            i = -333022604;
                        } else {
                            iM3169 = C0773.m3169("᩵᩵") ^ i3;
                            i5 = ((iM3169 ^ i4) * 8233) ^ (-44945281);
                            i = -660654863;
                        }
                        i7 = iM3169 ^ i;
                        byteArrayInputStream = null;
                        break;
                    case -1345475795:
                    case -23171719:
                        C2354.m7983();
                        if (C4282.f15546 > 0) {
                        }
                        iM3169 = C0773.m3169("۠֫") ^ i3;
                        i5 = ((iM3169 ^ i4) * 12575) ^ 1142863684;
                        i = -333022604;
                        i7 = iM3169 ^ i;
                        byteArrayInputStream = null;
                        break;
                    case 728196312:
                    case 1901177378:
                        xmlResourceParserC9734.m25337(byteArrayInputStream, this.f48832);
                        return xmlResourceParserC9734;
                    case 876823660:
                    case 1733331676:
                        if (C1321.f4751 >= 0) {
                            iM3169 = C0773.m3169("۠֫") ^ i3;
                            i5 = ((iM3169 ^ i4) * 12575) ^ 1142863684;
                            i = -333022604;
                        } else {
                            iM3169 = (C0619.m2761("ۡۗ") + i4) * (-81);
                            i5 = ((iM3169 ^ i3) * (-12981)) ^ 1182891054;
                            i = 776961613;
                        }
                        i7 = iM3169 ^ i;
                        byteArrayInputStream = null;
                        break;
                    case 1165573506:
                    case 1778748389:
                        if (C2287.m7745() > 0) {
                            if (C0950.f3488 < 0) {
                                if (C2354.f7599 >= 0) {
                                }
                                if (C23916.f77426 > 0) {
                                    if (C3734.f12817 >= 0) {
                                    }
                                    byte[] bArr = this.f48833;
                                    if (C0862.f3233 == 0) {
                                        int length = bArr.length;
                                        if (C23916.f77426 <= 0) {
                                        }
                                        int i8 = this.f48831;
                                        int i9 = length - i8;
                                        if (C17202.f56030) {
                                            byteArrayInputStream = new ByteArrayInputStream(bArr, i8, i9);
                                            if (C0487.f2131 <= 0) {
                                            }
                                            xmlResourceParserC9734 = new XmlResourceParserC9734();
                                            if (C3448.f11240 < 0) {
                                                int iM2761 = (i4 - C0619.m2761("᩹֨")) * (-57);
                                                i5 = ((iM2761 ^ i3) * (-17861)) ^ (-677456776);
                                                i7 = iM2761 ^ 1024141249;
                                            }
                                        } else {
                                            iM3169 = C0773.m3169("ܰۖ") ^ i4;
                                            i5 = ((iM3169 ^ i3) * (-575)) ^ 20600035;
                                            i = 1820113803;
                                            i7 = iM3169 ^ i;
                                            byteArrayInputStream = null;
                                        }
                                        break;
                                        break;
                                    }
                                    break;
                                }
                                iM3169 = (C0619.m2761("ۡۗ") + i4) * (-81);
                                i5 = ((iM3169 ^ i3) * (-12981)) ^ 1182891054;
                                i = 776961613;
                                i7 = iM3169 ^ i;
                                byteArrayInputStream = null;
                            } else {
                                iM3169 = C0773.m3169("۠֫") ^ i3;
                                i5 = ((iM3169 ^ i4) * 12575) ^ 1142863684;
                                i = -333022604;
                                i7 = iM3169 ^ i;
                                byteArrayInputStream = null;
                            }
                            break;
                        }
                        iM3169 = C0773.m3169("᩵᩵") ^ i3;
                        i5 = ((iM3169 ^ i4) * 8233) ^ (-44945281);
                        i = -660654863;
                        i7 = iM3169 ^ i;
                        byteArrayInputStream = null;
                        break;
                    default:
                        C4238.m13540();
                        iM3169 = C0773.m3169("۠֫") ^ i3;
                        i5 = ((iM3169 ^ i4) * 12575) ^ 1142863684;
                        i = -333022604;
                        i7 = iM3169 ^ i;
                        byteArrayInputStream = null;
                        break;
                }
            }
            iM31610 = (C0619.m2761("᩺ܶ") ^ i3) * (-99);
            i5 = ((iM31610 ^ i4) * (-28405)) ^ 1696514203;
            i6 = 381965033;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m35983(StringBuilder sb, int i) {
        C12558 c12558 = null;
        int i2 = 1801438843;
        int i3 = C2310.f7472;
        int i4 = C3779.f12953;
        int iM2761 = (C0619.m2761("᩷֫") + i3) * (-71);
        int i5 = ((iM2761 ^ i4) * 15609) ^ 359759339;
        int i6 = -1683411588;
        while (true) {
            i2 = ((((i2 ^ i4) * 13055) >> 31) & i5) ^ (iM2761 ^ i6);
            switch (i2) {
                case -2046659168:
                case -948791053:
                    C1146.m4231();
                    C3779.m12264();
                    iM2761 = (C0773.m3169("ᩴۛ") ^ i4) * (-53);
                    i5 = ((iM2761 ^ i3) * (-12339)) ^ 1000546550;
                    i6 = -817705181;
                    break;
                case -1793169496:
                case 2139999179:
                    if (AbstractC3624.f12429 <= 0) {
                        iM2761 = (C0773.m3169("ܶۡ") + i4) * 75;
                        i5 = ((iM2761 ^ i3) * 24035) ^ (-2105132106);
                        i6 = 1170396142;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ۙ᩵")) * (-49);
                        i5 = ((iM2761 ^ i4) * 8875) ^ 2027267693;
                        i6 = 1065412995;
                    }
                    break;
                case -1521339281:
                case 2101516785:
                    if (C3998.f13671 != 0) {
                        iM2761 = (C0773.m3169("֡ۙ") + i3) * (-125);
                        i5 = ((iM2761 ^ i4) * 10391) ^ 426173212;
                        i6 = 178096899;
                    } else {
                        iM2761 = (C0619.m2761("ܺ᩷") + i4) * 63;
                        i5 = ((iM2761 ^ i3) * (-9587)) ^ 2124905590;
                        i6 = -765697502;
                    }
                    break;
                case -1511860545:
                case -96598904:
                    break;
                case -1476579436:
                case 2047394233:
                    if (AbstractC0116.f1064 <= 0) {
                        iM2761 = (C0773.m3169("ᩴۛ") ^ i4) * (-53);
                        i5 = ((iM2761 ^ i3) * (-12339)) ^ 1000546550;
                        i6 = -817705181;
                    } else {
                        iM2761 = C0773.m3169("ۗ۬") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-9451)) ^ 1790798163;
                        i6 = 751752918;
                    }
                    break;
                case -1382638952:
                case 1382351508:
                    C0269.m1775();
                    break;
                case -1348174830:
                case -1288846376:
                    if (C2287.f7432 >= 0) {
                        iM2761 = (C0773.m3169("֡ۙ") + i3) * (-125);
                        i5 = ((iM2761 ^ i4) * 10391) ^ 426173212;
                        i6 = 178096899;
                    } else {
                        iM2761 = (C0773.m3169("ܶۡ") + i4) * 75;
                        i5 = ((iM2761 ^ i3) * 24035) ^ (-2105132106);
                        i6 = 1170396142;
                    }
                    break;
                case -1049752615:
                case 633497163:
                    if (C13473.f42873 != 0) {
                        iM2761 = (C0773.m3169("ᩴۛ") ^ i4) * (-53);
                        i5 = ((iM2761 ^ i3) * (-12339)) ^ 1000546550;
                        i6 = -817705181;
                    } else {
                        iM2761 = (i4 - C0619.m2761("ۨۚ")) * (-109);
                        i5 = ((iM2761 ^ i3) * (-10591)) ^ (-1901579944);
                        i6 = -310560616;
                    }
                    break;
                case -770676939:
                case 1036876101:
                    if (C2375.f7641 <= 0) {
                        iM2761 = (C0773.m3169("ܶۡ") + i4) * 75;
                        i5 = ((iM2761 ^ i3) * 24035) ^ (-2105132106);
                        i6 = 1170396142;
                    } else {
                        iM2761 = (i4 - C0619.m2761("ۗ۠")) * 25;
                        i5 = ((iM2761 ^ i3) * 16055) ^ (-592463065);
                        i6 = -1697304019;
                    }
                    break;
                case -503940897:
                case 1672110736:
                    C2354.m7983();
                    if (C1080.f3865 < 0) {
                        iM2761 = (C0773.m3169("ܶۡ") + i4) * 75;
                        i5 = ((iM2761 ^ i3) * 24035) ^ (-2105132106);
                        i6 = 1170396142;
                    } else {
                        iM2761 = (C0773.m3169("ᩴۛ") ^ i4) * (-53);
                        i5 = ((iM2761 ^ i3) * (-12339)) ^ 1000546550;
                        i6 = -817705181;
                    }
                    break;
                case -463705206:
                case 1058630768:
                    if (C1080.f3865 >= 0) {
                        iM2761 = (C0773.m3169("ᩴۛ") ^ i4) * (-53);
                        i5 = ((iM2761 ^ i3) * (-12339)) ^ 1000546550;
                        i6 = -817705181;
                    } else {
                        iM2761 = C0619.m2761("᩶᩵") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-12531)) ^ 486354333;
                        i6 = -695594926;
                    }
                    break;
                case -321288580:
                case -38588600:
                    C2023.m6955(sb, ':');
                    iM2761 = C0773.m3169("۠ۡ") ^ i3;
                    i5 = ((iM2761 ^ i4) * (-23117)) ^ 2088546013;
                    i6 = 739038160;
                    break;
                case -286786769:
                case 1380820765:
                    if (C2310.f7472 >= 0) {
                        iM2761 = (i4 - C0773.m3169("ۧۧ")) * 119;
                        i5 = ((iM2761 ^ i3) * 27867) ^ (-759680837);
                        i6 = -431552478;
                    } else {
                        iM2761 = C0773.m3169("᩵ۧ") ^ i3;
                        i5 = ((iM2761 ^ i4) * 24691) ^ (-1888199337);
                        i6 = 69293950;
                    }
                    break;
                case -15661093:
                case 2130611414:
                    if (C1343.f4799 != 0) {
                        iM2761 = (C0773.m3169("ᩴۛ") ^ i4) * (-53);
                        i5 = ((iM2761 ^ i3) * (-12339)) ^ 1000546550;
                        i6 = -817705181;
                    } else {
                        iM2761 = C0773.m3169("۬֫") ^ i3;
                        i5 = ((iM2761 ^ i4) * 3235) ^ 753414498;
                        i6 = 391961791;
                    }
                    break;
                case 201709658:
                case 1899155825:
                    C3779.m12258(sb, c12558.m15441(i));
                    if (C0269.f1558 <= 0) {
                        iM2761 = (i4 - C0773.m3169("ۧۧ")) * 119;
                        i5 = ((iM2761 ^ i3) * 27867) ^ (-759680837);
                        i6 = -431552478;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ۘܰ")) * (-103);
                        i5 = ((iM2761 ^ i4) * 4467) ^ (-1913796951);
                        i6 = 1055664613;
                    }
                    break;
                case 207466597:
                case 1780971461:
                    if (C0269.f1558 > 0) {
                        iM2761 = C0619.m2761("ܺ᩸") ^ i3;
                        i5 = ((iM2761 ^ i4) * 26931) ^ (-1398892240);
                        i6 = 1345356935;
                    } else {
                        iM2761 = (C0773.m3169("ᩴۛ") ^ i4) * (-53);
                        i5 = ((iM2761 ^ i3) * (-12339)) ^ 1000546550;
                        i6 = -817705181;
                    }
                    break;
                case 210801593:
                case 1144414473:
                    if (C2354.f7599 >= 0) {
                        iM2761 = C0619.m2761("ܺ᩸") ^ i3;
                        i5 = ((iM2761 ^ i4) * 26931) ^ (-1398892240);
                        i6 = 1345356935;
                    } else {
                        iM2761 = (i3 - C0619.m2761("᩶ܿ")) * (-95);
                        i5 = ((iM2761 ^ i4) * 4217) ^ (-1286772440);
                        i6 = -102598623;
                    }
                    break;
                case 1914546852:
                case 2052073676:
                    c12558 = this.f48832;
                    if (i >= c12558.size()) {
                        iM2761 = C0773.m3169("۠ۡ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-23117)) ^ 2088546013;
                        i6 = 739038160;
                    } else {
                        iM2761 = C0619.m2761("ܶ᩹") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-20181)) ^ 981991183;
                        i6 = 1487565380;
                    }
                    break;
                default:
                    if (i >= 0) {
                        iM2761 = (C0773.m3169("ۖ֨") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i5 = ((iM2761 ^ i4) * 8275) ^ (-560015415);
                        i6 = 1412051521;
                    } else {
                        iM2761 = C0773.m3169("۠ۡ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-23117)) ^ 2088546013;
                        i6 = 739038160;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m35979(long j, InputStream inputStream) {
        int i = 332402386;
        int i2 = C3492.f12043;
        int i3 = C2288.f7433;
        int iM2761 = C0619.m2761("۬ۢ") ^ i2;
        int i4 = ((iM2761 ^ i3) * (-22543)) ^ 528616074;
        int i5 = -1686592076;
        while (true) {
            i = ((((i ^ i3) * (-28963)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2003901429:
                case 1124902467:
                    if (C23916.f77426 <= 0) {
                        iM2761 = (i3 - C0619.m2761("֡ܺ")) * (-61);
                        i4 = ((iM2761 ^ i2) * (-14317)) ^ (-1482082704);
                        i5 = -2031416731;
                    } else {
                        iM2761 = (C0773.m3169("᩵۠") + i2) * 123;
                        i4 = ((iM2761 ^ i3) * 9653) ^ (-341068635);
                        i5 = 1414619593;
                    }
                    break;
                case -1847027376:
                case 1511767754:
                    if (C13473.m33144()) {
                        iM2761 = C0619.m2761("ۡ᩻") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-11795)) ^ (-1390910896);
                        i5 = 754311173;
                    } else {
                        iM2761 = (i3 - C0619.m2761("֡ܺ")) * (-61);
                        i4 = ((iM2761 ^ i2) * (-14317)) ^ (-1482082704);
                        i5 = -2031416731;
                    }
                    break;
                case -1560038234:
                case 1076354169:
                    if (C0487.m2356() >= 0) {
                        iM2761 = (i3 - C0773.m3169("᩹᩸")) * 53;
                        i4 = ((iM2761 ^ i2) * 14505) ^ (-299068326);
                        i5 = 438000958;
                    } else {
                        iM2761 = C0619.m2761("ۗ۟") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-5659)) ^ 683288694;
                        i5 = 1240332523;
                    }
                    break;
                case -1533668708:
                case 1178144784:
                    if (C1146.m4231()) {
                        iM2761 = (C0773.m3169("ᩴ᩺") ^ i2) * (-11);
                        i4 = ((iM2761 ^ i3) * 1381) ^ 193610021;
                        i5 = 2037298162;
                    } else {
                        iM2761 = (C0619.m2761("ۛ֡") ^ i2) * (-17);
                        i4 = ((iM2761 ^ i3) * 29617) ^ (-406892953);
                        i5 = -1402384840;
                    }
                    break;
                case -1513275771:
                case -849620203:
                    if (C2287.f7432 >= 0) {
                        iM2761 = (i3 - C0773.m3169("᩹᩸")) * 53;
                        i4 = ((iM2761 ^ i2) * 14505) ^ (-299068326);
                        i5 = 438000958;
                    } else {
                        iM2761 = C0619.m2761("᩻֡") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-6677)) ^ 1937407347;
                        i5 = 1399388478;
                    }
                    break;
                case -1378314901:
                case 632215145:
                    C1321.m4852();
                    iM2761 = (C0619.m2761("ۛ֡") ^ i2) * (-17);
                    i4 = ((iM2761 ^ i3) * 29617) ^ (-406892953);
                    i5 = -1402384840;
                    break;
                case -1372081645:
                case -542529456:
                    return m35980(new C0211(inputStream));
                case -1146351244:
                case 378995705:
                    if (C4282.m13644()) {
                        iM2761 = C0619.m2761("۫ܳ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 7625) ^ (-607929894);
                        i5 = -1289443088;
                    } else {
                        iM2761 = C0619.m2761("᩷ܿ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 32075) ^ (-1646682474);
                        i5 = -813069922;
                    }
                    break;
                case -841192606:
                case 183548347:
                    if (j < 108) {
                        iM2761 = (C0619.m2761("ܳۛ") + i3) * (-59);
                        i4 = ((iM2761 ^ i2) * (-23963)) ^ 343276369;
                        i5 = 242960235;
                    } else {
                        iM2761 = (C0773.m3169("᩵᩵") ^ i2) * (-51);
                        i4 = ((iM2761 ^ i3) * (-8167)) ^ 1469510475;
                        i5 = -642859707;
                    }
                    break;
                case -780774907:
                case -753075517:
                    if (C2354.f7599 >= 0) {
                        iM2761 = (i3 - C0619.m2761("֡ܺ")) * (-61);
                        i4 = ((iM2761 ^ i2) * (-14317)) ^ (-1482082704);
                        i5 = -2031416731;
                    } else {
                        iM2761 = C0773.m3169("᩶ۘ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 9111) ^ 323069317;
                        i5 = -1051547431;
                    }
                    break;
                case -721067853:
                case 1486925522:
                    return false;
                case -667800382:
                case 13370393:
                    C0950.m3785();
                    C1826.m6301();
                    return false;
                case -396030960:
                case 825877733:
                    if (RunnableC1848.f6235) {
                        iM2761 = (i3 - C0773.m3169("᩹᩸")) * 53;
                        i4 = ((iM2761 ^ i2) * 14505) ^ (-299068326);
                        i5 = 438000958;
                    } else {
                        iM2761 = (C0619.m2761("ۡᩳ") ^ i3) * 43;
                        i4 = ((iM2761 ^ i2) * 3775) ^ (-1834598760);
                        i5 = -975253451;
                    }
                    break;
                case -376907556:
                case 1021850581:
                    C2287.m7745();
                    if (C0773.f2792 <= 0) {
                        iM2761 = C0619.m2761("᩷ܿ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 32075) ^ (-1646682474);
                        i5 = -813069922;
                    } else {
                        iM2761 = (C0619.m2761("ۛ֡") ^ i2) * (-17);
                        i4 = ((iM2761 ^ i3) * 29617) ^ (-406892953);
                        i5 = -1402384840;
                    }
                    break;
                case -367905244:
                case 1319577826:
                    if (C1826.f6190 <= 0) {
                        iM2761 = (i3 - C0773.m3169("᩹᩸")) * 53;
                        i4 = ((iM2761 ^ i2) * 14505) ^ (-299068326);
                        i5 = 438000958;
                    } else {
                        iM2761 = C0773.m3169("۬᩷") ^ i2;
                        i4 = ((iM2761 ^ i3) * 17263) ^ (-2098256600);
                        i5 = 419878009;
                    }
                    break;
                case -67213242:
                case 343728521:
                    C0950.m3785();
                    if (C2375.f7641 > 0) {
                        iM2761 = (C0773.m3169("ۡۘ") ^ i2) * (-105);
                        i4 = ((iM2761 ^ i3) * 1983) ^ (-2072009832);
                        i5 = -216574169;
                    } else {
                        iM2761 = (C0619.m2761("ۛ֡") ^ i2) * (-17);
                        i4 = ((iM2761 ^ i3) * 29617) ^ (-406892953);
                        i5 = -1402384840;
                    }
                    break;
                case 1050802629:
                case 1078565352:
                    if (C0950.m3785() == 0) {
                        iM2761 = (i3 - C0619.m2761("֡ܺ")) * (-61);
                        i4 = ((iM2761 ^ i2) * (-14317)) ^ (-1482082704);
                        i5 = -2031416731;
                    } else {
                        iM2761 = (C0773.m3169("ۡۘ") ^ i2) * (-105);
                        i4 = ((iM2761 ^ i3) * 1983) ^ (-2072009832);
                        i5 = -216574169;
                    }
                    break;
                default:
                    if (C2419.f7754 >= 0) {
                        iM2761 = (C0773.m3169("ۡۘ") ^ i2) * (-105);
                        i4 = ((iM2761 ^ i3) * 1983) ^ (-2072009832);
                        i5 = -216574169;
                    } else {
                        iM2761 = (C0773.m3169("ۨۖ") ^ i2) * (-85);
                        i4 = ((iM2761 ^ i3) * (-8735)) ^ 1926396125;
                        i5 = -460283271;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:46:0x012e  */
    /* JADX WARN: Code duplicated, block: B:69:0x0206  */
    /* JADX WARN: Code duplicated, block: B:73:0x0236  */
    /* JADX WARN: Code duplicated, block: B:77:0x0268  */
    /* JADX WARN: Code duplicated, block: B:81:0x029b  */
    /* JADX WARN: Code duplicated, block: B:85:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:89:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:93:0x0331 A[PHI: r5
      0x0331: PHI (r5v3 int) = (r5v2 int), (r5v1 int), (r5v1 int) binds: [B:92:0x032f, B:32:0x00cc, B:22:0x00a2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m35980(C0211 c0211) {
        int iM2761;
        int i;
        int i2;
        short s = 0;
        boolean z = false;
        int iM1657 = 0;
        int i3 = 0;
        int iM1658 = 0;
        int i4 = 0;
        int i5 = 0;
        boolean z2 = false;
        int iM1659 = 0;
        int iM16510 = 0;
        int i6 = -419249608;
        int i7 = C4238.f15451;
        int i8 = C3099.f10023;
        int iM2762 = C0619.m2761("֫ۖ") ^ i8;
        int i9 = ((iM2762 ^ i7) * 6805) ^ 1139289342;
        int i10 = iM2762 ^ (-1511484757);
        boolean z3 = false;
        while (true) {
            i6 = i10 ^ (i9 & (((i6 ^ i7) * 15065) >> 31));
            switch (i6) {
                case -2134819427:
                case -1713091082:
                    z2 = true;
                    iM2761 = (C0619.m2761("ܽ᩹") + i7) * (-81);
                    i = ((iM2761 ^ i8) * 5959) ^ 1384118613;
                    i2 = -770793411;
                    int i11 = i;
                    i10 = iM2761 ^ i2;
                    i9 = i11;
                    break;
                case -2069600274:
                case 609979851:
                    C1519.m5403();
                    if (C1826.f6190 <= 0) {
                        iM2761 = (C0773.m3169("ۛ᩺") ^ i7) * (-109);
                        i = ((iM2761 ^ i8) * (-1375)) ^ (-770077145);
                        i2 = 708614377;
                    } else {
                        iM2761 = C0773.m3169("۟᩸") ^ i7;
                        i = ((iM2761 ^ i8) * 24047) ^ 508225994;
                        i2 = 1490770563;
                    }
                    int i12 = i;
                    i10 = iM2761 ^ i2;
                    i9 = i12;
                    break;
                case -2035940588:
                case 373750401:
                    if (C1519.m5403()) {
                        iM2761 = (i8 - C0773.m3169("ۙۖ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM2761 ^ i7) * (-2089)) ^ (-2131542373);
                        i2 = -593370843;
                    } else {
                        iM2761 = (C0773.m3169("ۡ᩸") + i8) * 27;
                        i = ((iM2761 ^ i7) * (-19107)) ^ (-1175324619);
                        i2 = -1401041936;
                    }
                    int i13 = i;
                    i10 = iM2761 ^ i2;
                    i9 = i13;
                    break;
                case -1827159941:
                case 555736348:
                    if (C3779.f12953 <= 0) {
                        iM2761 = (C0619.m2761("ܿۜ") + i7) * (-3);
                        i = ((iM2761 ^ i8) * 12767) ^ 542289059;
                        i2 = -1180902323;
                    } else {
                        iM2761 = C0619.m2761("ۙ֡") ^ i7;
                        i = ((iM2761 ^ i8) * (-2873)) ^ 1716505764;
                        i2 = 806479829;
                    }
                    int i14 = i;
                    i10 = iM2761 ^ i2;
                    i9 = i14;
                    break;
                case -1820013890:
                case -917540758:
                    if (C0950.m3785() != 0) {
                        iM2761 = C0773.m3169("ᩳۤ") ^ i8;
                        i = ((iM2761 ^ i7) * 19001) ^ (-559633072);
                        i2 = 903144905;
                    } else {
                        iM2761 = (C0773.m3169("۫۫") ^ i8) * (-59);
                        i = ((iM2761 ^ i7) * 1195) ^ 360287746;
                        i2 = -1649622367;
                    }
                    int i15 = i;
                    i10 = iM2761 ^ i2;
                    i9 = i15;
                    break;
                case -1783995255:
                case -663597046:
                    C4238.m13540();
                    if (C2485.f7950 == 0) {
                        iM2761 = C0773.m3169("۟᩸") ^ i7;
                        i = ((iM2761 ^ i8) * 24047) ^ 508225994;
                        i2 = 1490770563;
                    } else {
                        iM2761 = (C0773.m3169("ۡ᩸") + i8) * 27;
                        i = ((iM2761 ^ i7) * (-19107)) ^ (-1175324619);
                        i2 = -1401041936;
                    }
                    int i16 = i;
                    i10 = iM2761 ^ i2;
                    i9 = i16;
                    break;
                case -1608407352:
                case 428233995:
                    C23916.m53419();
                    iM2761 = (C0619.m2761("ܿۜ") + i7) * (-3);
                    i = ((iM2761 ^ i8) * 12767) ^ 542289059;
                    i2 = -1180902323;
                    int i17 = i;
                    i10 = iM2761 ^ i2;
                    i9 = i17;
                    break;
                case -1603257767:
                case 1942996209:
                    return z3;
                case -1516445440:
                case 1154759568:
                    if (iM1658 == i4) {
                        iM2761 = (C0619.m2761("֫᩵") ^ i7) * (-97);
                        i = ((iM2761 ^ i8) * 22017) ^ (-691441154);
                        i2 = -1859749065;
                    } else {
                        iM2761 = (C0773.m3169("ۚܰ") ^ i7) * 89;
                        i = ((iM2761 ^ i8) * (-19769)) ^ 1587417167;
                        i2 = 631177790;
                    }
                    int i18 = i;
                    i10 = iM2761 ^ i2;
                    i9 = i18;
                    break;
                case -1503184404:
                case 1076157876:
                    i3 = iM1657 - 4;
                    if (C0619.f2439) {
                        iM2761 = (C0773.m3169("ۛ᩺") ^ i7) * (-109);
                        i = ((iM2761 ^ i8) * (-1375)) ^ (-770077145);
                        i2 = 708614377;
                    } else {
                        iM2761 = C0773.m3169("۠ۖ") ^ i8;
                        i = ((iM2761 ^ i7) * (-12487)) ^ 994383888;
                        i2 = -1923221529;
                    }
                    int i19 = i;
                    i10 = iM2761 ^ i2;
                    i9 = i19;
                    break;
                case -1391980780:
                case 891711825:
                    if (C1564.f5401 <= 0) {
                        iM2761 = (C0619.m2761("ۛ۠") + i7) * (-23);
                        i = ((iM2761 ^ i8) * 4283) ^ 1128531916;
                        i2 = 1727440277;
                    } else {
                        iM2761 = (C0619.m2761("ۚܶ") + i8) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM2761 ^ i7) * (-25219)) ^ (-894940396);
                        i2 = -2040511684;
                    }
                    int i110 = i;
                    i10 = iM2761 ^ i2;
                    i9 = i110;
                    break;
                case -1390539110:
                case 1063967299:
                    try {
                        c0211.skipBytes(i5);
                        c0211.skipBytes(c0211.readInt() - 8);
                        iM16510 = c0211.m1657();
                        iM2761 = C0619.m2761("᩹ܺ") ^ i8;
                        i = ((iM2761 ^ i7) * (-15713)) ^ (-1545292502);
                        i2 = 1929797105;
                    } catch (Throwable unused) {
                        iM2761 = (C0773.m3169("ۚܰ") ^ i7) * 89;
                        i = ((iM2761 ^ i8) * (-19769)) ^ 1587417167;
                        i2 = 631177790;
                    }
                    int i111 = i;
                    i10 = iM2761 ^ i2;
                    i9 = i111;
                    break;
                case -1374040861:
                case 336118418:
                    return z;
                case -1343489128:
                case -307421569:
                    i4 = MLKEMEngine.KyberPolyBytes;
                    i5 = 2;
                    if (iM1658 == z) {
                        iM2761 = C0619.m2761("᩸᩵") ^ i8;
                        i = ((iM2761 ^ i7) * (-23221)) ^ 1404974692;
                        i2 = -1263826729;
                    } else {
                        iM2761 = C0619.m2761("ۢۙ") ^ i7;
                        i = ((iM2761 ^ i8) * 21313) ^ 290886408;
                        i2 = -228337010;
                    }
                    int i112 = i;
                    i10 = iM2761 ^ i2;
                    i9 = i112;
                    break;
                case -1252900273:
                case 1433214186:
                    c0211.skipBytes(i5);
                    c0211.skipBytes(c0211.readInt() - 8);
                    iM1659 = c0211.m1657();
                    iM2761 = (i8 - C0619.m2761("᩵۟")) * 33;
                    i = ((iM2761 ^ i7) * (-13425)) ^ 610907649;
                    i2 = 1061329419;
                    int i113 = i;
                    i10 = iM2761 ^ i2;
                    i9 = i113;
                    break;
                case -1210008365:
                case -294876973:
                    if (C2310.f7472 >= 0) {
                        iM2761 = C0773.m3169("ᩳۤ") ^ i8;
                        i = ((iM2761 ^ i7) * 19001) ^ (-559633072);
                        i2 = 903144905;
                    } else {
                        iM2761 = C0619.m2761("ۛۧ") ^ i8;
                        i = ((iM2761 ^ i7) * (-29343)) ^ (-1843734393);
                        i2 = 1243285747;
                    }
                    int i114 = i;
                    i10 = iM2761 ^ i2;
                    i9 = i114;
                    break;
                case -1193506730:
                case -720382313:
                    if (C2023.m6964() <= 0) {
                        iM2761 = (C0619.m2761("ۛ۠") + i7) * (-23);
                        i = ((iM2761 ^ i8) * 4283) ^ 1128531916;
                        i2 = 1727440277;
                    } else {
                        iM2761 = (C0773.m3169("᩸ۖ") + i7) * 97;
                        i = ((iM2761 ^ i8) * 30301) ^ 1901311556;
                        i2 = 2067223514;
                    }
                    int i115 = i;
                    i10 = iM2761 ^ i2;
                    i9 = i115;
                    break;
                case -1035939011:
                case 1835713290:
                    if (C0269.f1558 <= 0) {
                        iM2761 = (C0619.m2761("ۛ۠") + i7) * (-23);
                        i = ((iM2761 ^ i8) * 4283) ^ 1128531916;
                        i2 = 1727440277;
                    } else {
                        iM2761 = C0773.m3169("ۤᩳ") ^ i8;
                        i = ((iM2761 ^ i7) * 12957) ^ 263170802;
                        i2 = 477652568;
                    }
                    int i116 = i;
                    i10 = iM2761 ^ i2;
                    i9 = i116;
                    break;
                case -660189683:
                case -593971073:
                    s = c0211.readShort();
                    iM2761 = (i7 - C0773.m3169("ۗۜ")) * 51;
                    i = ((iM2761 ^ i8) * (-9673)) ^ 1831409018;
                    i2 = 1203083269;
                    int i117 = i;
                    i10 = iM2761 ^ i2;
                    i9 = i117;
                    break;
                case -507318544:
                case -325482500:
                    C2834.m9344();
                    if (RunnableC3055.f9898 >= 0) {
                        iM2761 = C0619.m2761("ۛۧ") ^ i8;
                        i = ((iM2761 ^ i7) * (-29343)) ^ (-1843734393);
                        i2 = 1243285747;
                    } else {
                        iM2761 = (i8 - C0773.m3169("֨ۛ")) * (-11);
                        i = ((iM2761 ^ i7) * 32541) ^ (-2033897269);
                        i2 = -1328318591;
                    }
                    int i118 = i;
                    i10 = iM2761 ^ i2;
                    i9 = i118;
                    break;
                case -413502548:
                case -38084954:
                    z3 = false;
                    iM2761 = C0619.m2761("֫ܿ") ^ i8;
                    i = ((iM2761 ^ i7) * (-17889)) ^ 888614519;
                    i2 = -2067074035;
                    int i119 = i;
                    i10 = iM2761 ^ i2;
                    i9 = i119;
                    break;
                case -315311424:
                case 951848799:
                    if (C2375.f7641 <= 0) {
                        iM2761 = C0773.m3169("۟᩸") ^ i7;
                        i = ((iM2761 ^ i8) * 24047) ^ 508225994;
                        i2 = 1490770563;
                    } else {
                        iM2761 = (C0619.m2761("ܿܰ") ^ i7) * (-19);
                        i = ((iM2761 ^ i8) * 31477) ^ (-655093773);
                        i2 = 1165807305;
                    }
                    int i1110 = i;
                    i10 = iM2761 ^ i2;
                    i9 = i1110;
                    break;
                case -209490261:
                case -25446385:
                    if (C2834.m9344() >= 0) {
                        iM2761 = C0773.m3169("۟᩸") ^ i7;
                        i = ((iM2761 ^ i8) * 24047) ^ 508225994;
                        i2 = 1490770563;
                    } else {
                        iM2761 = C0619.m2761("֨ۗ") ^ i7;
                        i = ((iM2761 ^ i8) * 20049) ^ 854973699;
                        i2 = 589164431;
                    }
                    int i1111 = i;
                    i10 = iM2761 ^ i2;
                    i9 = i1111;
                    break;
                case -159542332:
                case 1200683261:
                    if (C2375.f7641 <= 0) {
                        iM2761 = (C0619.m2761("ۢۧ") ^ i7) * (-77);
                        i = ((iM2761 ^ i8) * (-26757)) ^ 1798516730;
                        i2 = -433539720;
                    } else {
                        iM2761 = C0773.m3169("ۖۨ") ^ i8;
                        i = ((iM2761 ^ i7) * 31405) ^ 317350430;
                        i2 = 2035154248;
                    }
                    int i1112 = i;
                    i10 = iM2761 ^ i2;
                    i9 = i1112;
                    break;
                case -118949426:
                case 727162006:
                    if (iM16510 == i4) {
                        iM2761 = (C0773.m3169("ܽ֫") ^ i8) * q.h;
                        i = ((iM2761 ^ i7) * (-5717)) ^ (-1872540902);
                        i2 = 874458362;
                    } else {
                        iM2761 = (C0773.m3169("ۚܰ") ^ i7) * 89;
                        i = ((iM2761 ^ i8) * (-19769)) ^ 1587417167;
                        i2 = 631177790;
                    }
                    int i1113 = i;
                    i10 = iM2761 ^ i2;
                    i9 = i1113;
                    break;
                case -56328289:
                case 379968452:
                    AbstractC0116.m1243();
                    if (C1146.m4231()) {
                        iM2761 = (C0619.m2761("ۢۧ") ^ i7) * (-77);
                        i = ((iM2761 ^ i8) * (-26757)) ^ 1798516730;
                        i2 = -433539720;
                    } else {
                        iM2761 = (C0619.m2761("ܿۜ") + i7) * (-3);
                        i = ((iM2761 ^ i8) * 12767) ^ 542289059;
                        i2 = -1180902323;
                    }
                    int i1114 = i;
                    i10 = iM2761 ^ i2;
                    i9 = i1114;
                    break;
                case -38214058:
                case 1655615416:
                    iM1657 = c0211.m1657();
                    iM2761 = (i7 - C0619.m2761("֡֫")) * (-63);
                    i = ((iM2761 ^ i8) * (-1327)) ^ 1421967441;
                    i2 = -1351388973;
                    int i1115 = i;
                    i10 = iM2761 ^ i2;
                    i9 = i1115;
                    break;
                case 149455611:
                case 1437286938:
                    if (C2375.f7641 <= 0) {
                        iM2761 = C0773.m3169("۟᩸") ^ i7;
                        i = ((iM2761 ^ i8) * 24047) ^ 508225994;
                        i2 = 1490770563;
                    } else {
                        iM2761 = (C0619.m2761("᩸ۡ") + i7) * (-37);
                        i = ((iM2761 ^ i8) * (-27859)) ^ 468501044;
                        i2 = 1581507212;
                    }
                    int i1116 = i;
                    i10 = iM2761 ^ i2;
                    i9 = i1116;
                    break;
                case 217422595:
                case 1143631057:
                    c0211.skipBytes(i3);
                    iM1658 = c0211.m1657();
                    iM2761 = (i7 - C0619.m2761("ܺܿ")) * (-87);
                    i = ((iM2761 ^ i8) * (-31381)) ^ 477811761;
                    i2 = 94753275;
                    int i1117 = i;
                    i10 = iM2761 ^ i2;
                    i9 = i1117;
                    break;
                case 306784537:
                case 414694781:
                    if (C20932.f66974 <= 0) {
                        iM2761 = (C0619.m2761("ܿۜ") + i7) * (-3);
                        i = ((iM2761 ^ i8) * 12767) ^ 542289059;
                        i2 = -1180902323;
                    } else {
                        iM2761 = C0773.m3169("ᩳۤ") ^ i8;
                        i = ((iM2761 ^ i7) * 19001) ^ (-559633072);
                        i2 = 903144905;
                    }
                    int i1118 = i;
                    i10 = iM2761 ^ i2;
                    i9 = i1118;
                    break;
                case 568331145:
                case 1992887253:
                    z = true;
                    if (s != 3) {
                        iM2761 = C0773.m3169("ۘۘ") ^ i8;
                        i = ((iM2761 ^ i7) * (-3815)) ^ (-23790468);
                        i2 = -661447653;
                    } else {
                        iM2761 = (i8 - C0773.m3169("ᩴ֨")) * (-15);
                        i = ((iM2761 ^ i7) * (-13549)) ^ 1777185901;
                        i2 = -1545910939;
                    }
                    int i1119 = i;
                    i10 = iM2761 ^ i2;
                    i9 = i1119;
                    break;
                case 655703099:
                case 1888024279:
                    z2 = false;
                    iM2761 = (C0619.m2761("ܽ᩹") + i7) * (-81);
                    i = ((iM2761 ^ i8) * 5959) ^ 1384118613;
                    i2 = -770793411;
                    int i11110 = i;
                    i10 = iM2761 ^ i2;
                    i9 = i11110;
                    break;
                case 1167414720:
                case 1837442462:
                    AbstractC0116.m1243();
                    if (C2023.f6737) {
                        iM2761 = (C0773.m3169("ۛ᩺") ^ i7) * (-109);
                        i = ((iM2761 ^ i8) * (-1375)) ^ (-770077145);
                        i2 = 708614377;
                    } else {
                        iM2761 = (C0619.m2761("ܿۜ") + i7) * (-3);
                        i = ((iM2761 ^ i8) * 12767) ^ 542289059;
                        i2 = -1180902323;
                    }
                    int i11111 = i;
                    i10 = iM2761 ^ i2;
                    i9 = i11111;
                    break;
                case 1478620312:
                case 1649102403:
                    C3998.m12920();
                    return false;
                case 1521219597:
                case 1560622327:
                    if (iM1659 == z) {
                        iM2761 = (C0773.m3169("ܽ֫") ^ i8) * q.h;
                        i = ((iM2761 ^ i7) * (-5717)) ^ (-1872540902);
                        i2 = 874458362;
                    } else {
                        iM2761 = (C0773.m3169("ۚܰ") ^ i7) * 89;
                        i = ((iM2761 ^ i8) * (-19769)) ^ 1587417167;
                        i2 = 631177790;
                    }
                    int i11112 = i;
                    i10 = iM2761 ^ i2;
                    i9 = i11112;
                    break;
                default:
                    if (z2) {
                        iM2761 = C0773.m3169("ܺ۠") ^ i7;
                        i = ((iM2761 ^ i8) * 5809) ^ 1329372576;
                        i2 = 464115029;
                    } else {
                        iM2761 = (C0773.m3169("ܽ֫") ^ i8) * q.h;
                        i = ((iM2761 ^ i7) * (-5717)) ^ (-1872540902);
                        i2 = 874458362;
                    }
                    int i11113 = i;
                    i10 = iM2761 ^ i2;
                    i9 = i11113;
                    break;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v2, types: [byte[], l.ۗۧܺ] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static byte[] m35984(C13961 c13961) throws EOFException {
        int i;
        int i2;
        int i3;
        int i4;
        int iM3169;
        int i5;
        int i6;
        C9311 c9311;
        int i7;
        long j;
        int i8;
        C9311 c9311M24534;
        int iM2761;
        int i9;
        int i10;
        int i11;
        int i12;
        C9311 c9312;
        int i13;
        long j2;
        C9311 c9313;
        int i14;
        int i15;
        C9311 c9314;
        long j3;
        int iM2762;
        int i16;
        int i17;
        int i18;
        int iM2763;
        int i19;
        int i20;
        int iM2764;
        int i21;
        int i22;
        long j4;
        int iM2765;
        int i23;
        int iM2766;
        int i24;
        ?? r13;
        ?? r14;
        ?? r15;
        C13961 c13962 = c13961;
        int i25 = C3734.f12817;
        int i26 = C1564.f5401;
        int iM31610 = (i25 - C0773.m3169("۫ܽ")) * (-109);
        int i27 = ((iM31610 ^ i26) * 31097) ^ (-2007494084);
        C9311 c9311M24535 = null;
        ?? r7 = 0;
        long j5 = 0;
        C20566 c20566 = null;
        C12558 c12558M31245 = 0;
        byte[] bArr = null;
        long length = 0;
        int i28 = iM31610 ^ (-959996965);
        int i29 = 0;
        int i30 = 0;
        C6178 c6178 = null;
        int i31 = 0;
        int i32 = 0;
        boolean z = false;
        int iM34027 = 0;
        int i33 = 0;
        int i34 = 0;
        int i35 = 0;
        int i36 = 0;
        int i37 = 323043561;
        int i38 = 0;
        long j6 = 0;
        C9311 c9315 = null;
        while (true) {
            i37 = i28 ^ (i27 & (((i37 ^ i26) * 16133) >> 31));
            switch (i37) {
                case -2093800517:
                case 106947759:
                    i = i31;
                    i2 = i32;
                    c20566 = new C20566(c13962);
                    iM34027 = c13961.m34027();
                    if (C2287.f7432 < 0) {
                        iM3169 = (C0773.m3169("ۤۤ") + i25) * (-61);
                        i5 = ((iM3169 ^ i26) * 24937) ^ (-850083596);
                        i6 = -1414939479;
                        c12558M31245 = c12558M31245;
                        int i39 = iM3169 ^ i6;
                        i32 = i2;
                        i28 = i39;
                        i27 = i5;
                        i31 = i;
                    } else {
                        int iM31611 = C0773.m3169("ᩴ۟") ^ i26;
                        i32 = i2;
                        i31 = i;
                        i28 = iM31611 ^ 1391394384;
                        i27 = ((iM31611 ^ i25) * 23033) ^ 1123695145;
                        c6178 = null;
                    }
                    break;
                case -2081501410:
                case -1909725752:
                    if (C0487.f2131 <= 0) {
                        i11 = i31;
                        i12 = i32;
                        c9312 = c9311M24535;
                        i36 = i36;
                        i13 = i38;
                        j2 = j5;
                        i8 = i29;
                        c9313 = c9315;
                        int iM2767 = C0619.m2761("ܽܺ") ^ i25;
                        C9311 c9316 = c9312;
                        i27 = ((iM2767 ^ i26) * (-25361)) ^ 1982761768;
                        j5 = j2;
                        i38 = i13;
                        c9311M24535 = c9316;
                        i32 = i12;
                        i31 = i11;
                        i28 = iM2767 ^ 83372174;
                        c9315 = c9313;
                        r15 = c12558M31245;
                        i29 = i8;
                        c13962 = c13961;
                        c12558M31245 = r15;
                        i36 = i36;
                    } else {
                        iM2766 = (i25 - C0773.m3169("᩶ۧ")) * (-117);
                        i3 = ((iM2766 ^ i26) * (-20479)) ^ (-1731936532);
                        i24 = 463966553;
                        i28 = iM2766 ^ i24;
                        i27 = i3;
                    }
                    break;
                case -2015869377:
                case 817669599:
                    if (i31 > 0) {
                        iM2766 = C0619.m2761("ۚ֫") ^ i26;
                        i3 = ((iM2766 ^ i25) * (-28267)) ^ 372242311;
                        i24 = -334461973;
                    } else {
                        iM2766 = (C0619.m2761("᩶᩷") ^ i25) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i3 = ((iM2766 ^ i26) * (-5265)) ^ 473549346;
                        i24 = -266615832;
                    }
                    i28 = iM2766 ^ i24;
                    i27 = i3;
                    break;
                case -1986748424:
                case 679093512:
                    C2419.m8174();
                    if (C1519.f5300 < 0) {
                        i = i31;
                        i2 = i32;
                        j4 = j5;
                        iM2765 = (C0773.m3169("ۤܶ") ^ i25) * (-15);
                        i3 = ((iM2765 ^ i26) * 21363) ^ 1169273809;
                        i23 = 1584905017;
                        i4 = iM2765 ^ i23;
                        j5 = j4;
                        i32 = i2;
                        i31 = i;
                        i28 = i4;
                        i27 = i3;
                    } else {
                        i = i31;
                        i2 = i32;
                        iM3169 = C0619.m2761("ܽۧ") ^ i26;
                        i5 = ((iM3169 ^ i25) * 5555) ^ (-409242727);
                        i6 = -326895392;
                        c12558M31245 = c12558M31245;
                        int i310 = iM3169 ^ i6;
                        i32 = i2;
                        i28 = i310;
                        i27 = i5;
                        i31 = i;
                    }
                    break;
                case -1877120517:
                case 1060692549:
                    c6178.write(bArr, z ? 1 : 0, i30);
                    i29 -= i30;
                    i = i31;
                    i2 = i32;
                    iM3169 = (i25 - C0773.m3169("۠᩸")) * 37;
                    i5 = ((iM3169 ^ i26) * (-22843)) ^ (-2021348824);
                    i6 = 698991591;
                    c12558M31245 = c12558M31245;
                    int i311 = iM3169 ^ i6;
                    i32 = i2;
                    i28 = i311;
                    i27 = i5;
                    i31 = i;
                    break;
                case -1847066198:
                case 1924121211:
                    if (C13473.f42873 != 0) {
                        i = i31;
                        i2 = i32;
                        iM3169 = C0619.m2761("ܽۧ") ^ i26;
                        i5 = ((iM3169 ^ i25) * 5555) ^ (-409242727);
                        i6 = -326895392;
                        c12558M31245 = c12558M31245;
                        int i312 = iM3169 ^ i6;
                        i32 = i2;
                        i28 = i312;
                        i27 = i5;
                        i31 = i;
                    } else {
                        i14 = i31;
                        i15 = i32;
                        c9314 = c9311M24535;
                        i36 = i36;
                        j3 = j5;
                        i29 = i29;
                        iM2762 = C0619.m2761("۟ۘ") ^ i26;
                        i16 = ((iM2762 ^ i25) * (-29167)) ^ (-328855769);
                        i17 = -934841398;
                        int i40 = iM2762 ^ i17;
                        c9311M24535 = c9314;
                        j5 = j3;
                        i27 = i16;
                        i32 = i15;
                        i31 = i14;
                        i28 = i40;
                        i29 = i29;
                        c12558M31245 = c12558M31245;
                        i36 = i36;
                    }
                    break;
                case -1777009127:
                case -288241344:
                    C2702.m8876();
                    if (C1519.f5300 < 0) {
                        i14 = i31;
                        i15 = i32;
                        c9314 = c9311M24535;
                        i36 = i36;
                        j3 = j5;
                        i29 = i29;
                        iM2762 = C0619.m2761("۟ۘ") ^ i26;
                        i16 = ((iM2762 ^ i25) * (-29167)) ^ (-328855769);
                        i17 = -934841398;
                        int i41 = iM2762 ^ i17;
                        c9311M24535 = c9314;
                        j5 = j3;
                        i27 = i16;
                        i32 = i15;
                        i31 = i14;
                        i28 = i41;
                        i29 = i29;
                        c12558M31245 = c12558M31245;
                        i36 = i36;
                    } else {
                        iM2766 = (i25 - C0773.m3169("᩶ۧ")) * (-117);
                        i3 = ((iM2766 ^ i26) * (-20479)) ^ (-1731936532);
                        i24 = 463966553;
                        i28 = iM2766 ^ i24;
                        i27 = i3;
                    }
                    break;
                case -1769490359:
                case -160252807:
                    i32 = c13962.read(bArr, z ? 1 : 0, C23916.m53427(i31, i33));
                    if (i32 >= 0) {
                        iM2766 = C0773.m3169("᩸ۢ") ^ i25;
                        i3 = ((iM2766 ^ i26) * (-18413)) ^ 1041551223;
                        i24 = 1863659583;
                    } else {
                        iM2766 = (C0619.m2761("ۗ۠") + i26) * 101;
                        i3 = ((iM2766 ^ i25) * (-6341)) ^ 24864563;
                        i24 = 621875956;
                    }
                    i28 = iM2766 ^ i24;
                    i27 = i3;
                    break;
                case -1710094301:
                case 546302482:
                    c9311M24535 = C9311.m24534(c13961);
                    i18 = i38;
                    iM2764 = (i26 - C0619.m2761("۠֫")) * (-103);
                    i21 = ((iM2764 ^ i25) * (-17015)) ^ (-841275122);
                    i22 = 1775875213;
                    int i42 = iM2764 ^ i22;
                    j5 = j5;
                    i38 = i18;
                    i32 = i32;
                    i31 = i31;
                    i28 = i42;
                    i27 = i21;
                    i29 = i29;
                    c12558M31245 = c12558M31245;
                    i36 = i36;
                    break;
                case -1704435388:
                case -261618027:
                    i30 = c13962.read(bArr, z ? 1 : 0, C23916.m53427(i29, i33));
                    if (i30 >= 0) {
                        iM2766 = (C0773.m3169("ۜ᩹") + i26) * q.h;
                        i3 = ((iM2766 ^ i25) * 13819) ^ (-174197363);
                        i24 = 1283497067;
                    } else {
                        iM2766 = (C0619.m2761("ۛ᩺") ^ i25) * 77;
                        i3 = ((iM2766 ^ i26) * (-16631)) ^ 4662281;
                        i24 = 796973685;
                    }
                    i28 = iM2766 ^ i24;
                    i27 = i3;
                    break;
                case -1684146505:
                case 154184793:
                    return r7;
                case -1663080233:
                case 1399814112:
                    return c6178.m17796();
                case -1562182622:
                case 1571283652:
                    i = i31;
                    i2 = i32;
                    z = false;
                    z = false;
                    if (i29 > 0) {
                        iM3169 = (C0773.m3169("ۢᩳ") ^ i25) * (-13);
                        i5 = ((iM3169 ^ i26) * 7423) ^ (-1715210972);
                        i6 = -1639560403;
                        c12558M31245 = c12558M31245;
                    } else {
                        iM3169 = C0619.m2761("ۧۖ") ^ i26;
                        i5 = ((iM3169 ^ i25) * (-17997)) ^ 687175324;
                        i6 = -1123340799;
                        c12558M31245 = c12558M31245;
                    }
                    int i313 = iM3169 ^ i6;
                    i32 = i2;
                    i28 = i313;
                    i27 = i5;
                    i31 = i;
                    break;
                case -1510401414:
                case 302509913:
                    i18 = i38;
                    c13962.skipBytes(i35 - i18);
                    c9311M24535 = C9311.m24534(c13961);
                    iM2764 = (i26 - C0619.m2761("۠֫")) * (-103);
                    i21 = ((iM2764 ^ i25) * (-17015)) ^ (-841275122);
                    i22 = 1775875213;
                    int i43 = iM2764 ^ i22;
                    j5 = j5;
                    i38 = i18;
                    i32 = i32;
                    i31 = i31;
                    i28 = i43;
                    i27 = i21;
                    i29 = i29;
                    c12558M31245 = c12558M31245;
                    i36 = i36;
                    break;
                case -1352131154:
                case -782004286:
                    i = i31;
                    i2 = i32;
                    c12558M31245 = C12558.m31245(c20566);
                    i33 = 1024;
                    bArr = new byte[1024];
                    if (!C17202.m40372()) {
                        c9311M24534 = c9315;
                        c9311 = c9311M24535;
                        i36 = i36;
                        i7 = i38;
                        j = j5;
                        i8 = i29;
                        r14 = c12558M31245;
                        iM2761 = C0773.m3169("ܺۜ") ^ i26;
                        i9 = ((iM2761 ^ i25) * 15) ^ 87162446;
                        i10 = -109459377;
                        r13 = r14;
                        int i44 = iM2761 ^ i10;
                        j5 = j;
                        i38 = i7;
                        c9311M24535 = c9311;
                        i32 = i2;
                        i31 = i;
                        c9315 = c9311M24534;
                        i28 = i44;
                        i27 = i9;
                        r15 = r13;
                        i29 = i8;
                        c13962 = c13961;
                        c12558M31245 = r15;
                        i36 = i36;
                    } else {
                        iM3169 = (i26 - C0619.m2761("ۤ᩷")) * 33;
                        i5 = ((iM3169 ^ i25) * 20017) ^ 2102492476;
                        i6 = -1914776787;
                        c12558M31245 = c12558M31245;
                        int i314 = iM3169 ^ i6;
                        i32 = i2;
                        i28 = i314;
                        i27 = i5;
                        i31 = i;
                    }
                    break;
                case -1294972512:
                case 62327428:
                    C3099.m10095();
                    RunnableC0334.m2063();
                    iM2766 = (i25 - C0773.m3169("᩶ۧ")) * (-117);
                    i3 = ((iM2766 ^ i26) * (-20479)) ^ (-1731936532);
                    i24 = 463966553;
                    i28 = iM2766 ^ i24;
                    i27 = i3;
                    break;
                case -1282391940:
                case 2069068664:
                    throw new EOFException();
                case -1138575657:
                case -94802053:
                    throw new EOFException();
                case -1039352604:
                case 1324481502:
                    i = i31;
                    i2 = i32;
                    c9311 = c9311M24535;
                    i36 = i36;
                    i7 = i38;
                    j = j5;
                    i8 = i29;
                    c9311M24534 = C9311.m24534(c13961);
                    r14 = c12558M31245;
                    if (C0950.f3488 >= 0) {
                        iM2761 = C0773.m3169("ܺۜ") ^ i26;
                        i9 = ((iM2761 ^ i25) * 15) ^ 87162446;
                        i10 = -109459377;
                        r13 = r14;
                    } else {
                        iM2761 = C0619.m2761("ۤܰ") ^ i26;
                        i9 = ((iM2761 ^ i25) * (-7127)) ^ (-1875347097);
                        i10 = -1518768444;
                        r13 = c12558M31245;
                    }
                    int i45 = iM2761 ^ i10;
                    j5 = j;
                    i38 = i7;
                    c9311M24535 = c9311;
                    i32 = i2;
                    i31 = i;
                    c9315 = c9311M24534;
                    i28 = i45;
                    i27 = i9;
                    r15 = r13;
                    i29 = i8;
                    c13962 = c13961;
                    c12558M31245 = r15;
                    i36 = i36;
                    break;
                case -992405896:
                case 1085011597:
                    i = i31;
                    i2 = i32;
                    if (C3734.f12817 < 0) {
                        C6178 c6179 = new C6178();
                        c13962.seek(0L);
                        c6178 = c6179;
                        i29 = i34;
                        iM3169 = (i25 - C0773.m3169("۠᩸")) * 37;
                        i5 = ((iM3169 ^ i26) * (-22843)) ^ (-2021348824);
                        i6 = 698991591;
                        c12558M31245 = c12558M31245;
                        int i315 = iM3169 ^ i6;
                        i32 = i2;
                        i28 = i315;
                        i27 = i5;
                        i31 = i;
                    } else {
                        int iM31612 = C0773.m3169("ᩴ۟") ^ i26;
                        i32 = i2;
                        i31 = i;
                        i28 = iM31612 ^ 1391394384;
                        i27 = ((iM31612 ^ i25) * 23033) ^ 1123695145;
                        c6178 = null;
                    }
                    break;
                case -991589339:
                case 1117231410:
                    int i46 = i29;
                    int i47 = i31;
                    int i48 = i32;
                    C9311 c9317 = c9311M24535;
                    int i49 = i38;
                    long j7 = j5;
                    int i50 = c9317.f30250;
                    if (c9317.f30253 != 1) {
                        iM2763 = C0619.m2761("ۛܶ") ^ i25;
                        i19 = ((iM2763 ^ i26) * (-6469)) ^ 381438411;
                        i20 = -1262685843;
                    } else {
                        iM2763 = C0619.m2761("ۨۢ") ^ i26;
                        i19 = ((iM2763 ^ i25) * (-14561)) ^ (-1817199802);
                        i20 = -1984110593;
                    }
                    int i51 = iM2763 ^ i20;
                    j5 = j7;
                    i38 = i49;
                    i32 = i48;
                    i31 = i47;
                    i28 = i51;
                    r7 = 0;
                    c9311M24535 = c9317;
                    i27 = i19;
                    i36 = i50;
                    i29 = i46;
                    break;
                case -926455876:
                case 322612743:
                    i = i31;
                    i2 = i32;
                    int iM34028 = c13961.m34027() - i38;
                    long j8 = iM34028;
                    if (C2354.f7599 >= 0) {
                        i34 = iM34028;
                        j5 = j8;
                        iM3169 = C0619.m2761("ܽۧ") ^ i26;
                        i5 = ((iM3169 ^ i25) * 5555) ^ (-409242727);
                        i6 = -326895392;
                        c12558M31245 = c12558M31245;
                        int i316 = iM3169 ^ i6;
                        i32 = i2;
                        i28 = i316;
                        i27 = i5;
                        i31 = i;
                    } else {
                        int iM2768 = (C0619.m2761("᩸ۖ") ^ i26) * 81;
                        i34 = iM34028;
                        j5 = j8;
                        i27 = ((iM2768 ^ i25) * 23935) ^ 586210569;
                        i32 = i2;
                        i31 = i;
                        i28 = iM2768 ^ (-1898013656);
                    }
                    break;
                case -765311011:
                case -198165904:
                    throw new ArithmeticException();
                case -706494970:
                case -76807295:
                    C4282.m13644();
                    C0619.m2763();
                    return null;
                case -593345568:
                case -215227722:
                    i31 = i31;
                    i32 = i32;
                    i18 = i38;
                    j5 = j5;
                    i36 = i36;
                    if (i36 < 41943040) {
                        iM2764 = C0773.m3169("ۡ۟") ^ i25;
                        i29 = i29;
                        i21 = ((iM2764 ^ i26) * (-5737)) ^ (-2131440094);
                        i22 = -1675575554;
                    } else {
                        i29 = i29;
                        iM2764 = C0619.m2761("᩸ܽ") ^ i26;
                        i21 = ((iM2764 ^ i25) * (-8261)) ^ 892423566;
                        i22 = 1773040753;
                    }
                    int i410 = iM2764 ^ i22;
                    j5 = j5;
                    i38 = i18;
                    i32 = i32;
                    i31 = i31;
                    i28 = i410;
                    i27 = i21;
                    i29 = i29;
                    c12558M31245 = c12558M31245;
                    i36 = i36;
                    break;
                case -538029125:
                case 835340394:
                    i11 = i31;
                    i12 = i32;
                    c9312 = c9311M24535;
                    i36 = i36;
                    i13 = i38;
                    j2 = j5;
                    i8 = i29;
                    c9313 = c9315;
                    int i52 = c9313.f30252;
                    if (RunnableC3055.f9898 >= 0) {
                        i35 = i52;
                        int iM2769 = C0619.m2761("ܽܺ") ^ i25;
                        C9311 c9318 = c9312;
                        i27 = ((iM2769 ^ i26) * (-25361)) ^ 1982761768;
                        j5 = j2;
                        i38 = i13;
                        c9311M24535 = c9318;
                        i32 = i12;
                        i31 = i11;
                        i28 = iM2769 ^ 83372174;
                        c9315 = c9313;
                        r15 = c12558M31245;
                        i29 = i8;
                        c13962 = c13961;
                        c12558M31245 = r15;
                        i36 = i36;
                    } else {
                        int iM27610 = C0619.m2761("᩺۫") ^ i25;
                        i35 = i52;
                        j5 = j2;
                        i38 = i13;
                        c9311M24535 = c9312;
                        i32 = i12;
                        i31 = i11;
                        i28 = iM27610 ^ (-1650690667);
                        c9315 = c9313;
                        i29 = i8;
                        i27 = ((iM27610 ^ i26) * (-22611)) ^ 293726242;
                        i36 = i36;
                        c13962 = c13961;
                    }
                    break;
                case -490145077:
                case 444158082:
                    C2485.m8357();
                    if (AbstractC0641.f2496 >= 0) {
                        i = i31;
                        i2 = i32;
                        c9311M24534 = c9315;
                        c9311 = c9311M24535;
                        i36 = i36;
                        i7 = i38;
                        j = j5;
                        i8 = i29;
                        r14 = c12558M31245;
                        iM2761 = C0773.m3169("ܺۜ") ^ i26;
                        i9 = ((iM2761 ^ i25) * 15) ^ 87162446;
                        i10 = -109459377;
                        r13 = r14;
                        int i411 = iM2761 ^ i10;
                        j5 = j;
                        i38 = i7;
                        c9311M24535 = c9311;
                        i32 = i2;
                        i31 = i;
                        c9315 = c9311M24534;
                        i28 = i411;
                        i27 = i9;
                        r15 = r13;
                        i29 = i8;
                        c13962 = c13961;
                        c12558M31245 = r15;
                        i36 = i36;
                    }
                    i11 = i31;
                    i12 = i32;
                    c9312 = c9311M24535;
                    i36 = i36;
                    i13 = i38;
                    j2 = j5;
                    i8 = i29;
                    c9313 = c9315;
                    int iM27611 = C0619.m2761("ܽܺ") ^ i25;
                    C9311 c9319 = c9312;
                    i27 = ((iM27611 ^ i26) * (-25361)) ^ 1982761768;
                    j5 = j2;
                    i38 = i13;
                    c9311M24535 = c9319;
                    i32 = i12;
                    i31 = i11;
                    i28 = iM27611 ^ 83372174;
                    c9315 = c9313;
                    r15 = c12558M31245;
                    i29 = i8;
                    c13962 = c13961;
                    c12558M31245 = r15;
                    i36 = i36;
                    break;
                case -402483232:
                case 143622301:
                    i14 = i31;
                    i15 = i32;
                    c9314 = c9311M24535;
                    i36 = i36;
                    j3 = j5;
                    i29 = i29;
                    i38 = 8;
                    if (C3690.f12684 <= 0) {
                        iM2762 = C0619.m2761("۟ۘ") ^ i26;
                        i16 = ((iM2762 ^ i25) * (-29167)) ^ (-328855769);
                        i17 = -934841398;
                    } else {
                        iM2762 = (C0619.m2761("ۧ֫") ^ i25) * 49;
                        i16 = ((iM2762 ^ i26) * 29077) ^ (-698303435);
                        i17 = 770511095;
                    }
                    int i412 = iM2762 ^ i17;
                    c9311M24535 = c9314;
                    j5 = j3;
                    i27 = i16;
                    i32 = i15;
                    i31 = i14;
                    i28 = i412;
                    i29 = i29;
                    c12558M31245 = c12558M31245;
                    i36 = i36;
                    break;
                case -169936273:
                case 1845850429:
                    long j9 = length - j6;
                    int i53 = (int) j9;
                    i = i31;
                    i2 = i32;
                    if (j9 != i53) {
                        iM3169 = C0773.m3169("۠᩵") ^ i25;
                        i5 = ((iM3169 ^ i26) * 4573) ^ (-307649042);
                        i6 = 1629494108;
                        c12558M31245 = c12558M31245;
                        int i317 = iM3169 ^ i6;
                        i32 = i2;
                        i28 = i317;
                        i27 = i5;
                        i31 = i;
                    } else {
                        i31 = i53;
                        int iM31613 = (i26 - C0773.m3169("ܽۖ")) * 5;
                        int i54 = i2;
                        i28 = iM31613 ^ 1414414781;
                        i27 = ((iM31613 ^ i25) * (-29935)) ^ 84550251;
                        i32 = i54;
                    }
                    break;
                case -100219412:
                case 1694534075:
                    c6178.write(bArr, z ? 1 : 0, i32);
                    i31 -= i32;
                    i2 = i32;
                    int iM31614 = (i26 - C0773.m3169("ܽۖ")) * 5;
                    int i55 = i2;
                    i28 = iM31614 ^ 1414414781;
                    i27 = ((iM31614 ^ i25) * (-29935)) ^ 84550251;
                    i32 = i55;
                    break;
                case 509964015:
                case 564978799:
                    i31 = i31;
                    i32 = i32;
                    j5 = j5;
                    c13962.skipBytes(i36 - 8);
                    i18 = i38;
                    if (c13961.available() < i18) {
                        i36 = i36;
                        iM2764 = C0773.m3169("ۡ۟") ^ i25;
                        i29 = i29;
                        i21 = ((iM2764 ^ i26) * (-5737)) ^ (-2131440094);
                        i22 = -1675575554;
                        int i413 = iM2764 ^ i22;
                        j5 = j5;
                        i38 = i18;
                        i32 = i32;
                        i31 = i31;
                        i28 = i413;
                        i27 = i21;
                        i29 = i29;
                        c12558M31245 = c12558M31245;
                        i36 = i36;
                    } else {
                        int iM31615 = (C0773.m3169("۠ۧ") + i26) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        j5 = j5;
                        i38 = i18;
                        i32 = i32;
                        i31 = i31;
                        i28 = iM31615 ^ (-1305982075);
                        i27 = ((iM31615 ^ i25) * 25655) ^ (-103182440);
                    }
                    break;
                case 627993265:
                case 2079628058:
                    i = i31;
                    i2 = i32;
                    length = c13961.length();
                    if (AbstractC0116.m1243() == 0) {
                        iM3169 = (C0619.m2761("ܿۡ") ^ i26) * 109;
                        i5 = ((iM3169 ^ i25) * 24625) ^ (-1973635978);
                        i6 = -946644814;
                        c12558M31245 = c12558M31245;
                        int i318 = iM3169 ^ i6;
                        i32 = i2;
                        i28 = i318;
                        i27 = i5;
                        i31 = i;
                    } else {
                        int iM31616 = C0773.m3169("ᩴ۟") ^ i26;
                        i32 = i2;
                        i31 = i;
                        i28 = iM31616 ^ 1391394384;
                        i27 = ((iM31616 ^ i25) * 23033) ^ 1123695145;
                        c6178 = null;
                    }
                    break;
                case 1204279509:
                case 2059488864:
                    i = i31;
                    i2 = i32;
                    j4 = j5;
                    c13962.seek(j4);
                    if (C4238.f15451 >= 0) {
                        iM2765 = (C0773.m3169("ۤܶ") ^ i25) * (-15);
                        i3 = ((iM2765 ^ i26) * 21363) ^ 1169273809;
                        i23 = 1584905017;
                    } else {
                        iM2765 = (C0619.m2761("᩶֨") ^ i25) * (-31);
                        i3 = ((iM2765 ^ i26) * 25713) ^ (-1460636212);
                        i23 = -188028604;
                    }
                    i4 = iM2765 ^ i23;
                    j5 = j4;
                    i32 = i2;
                    i31 = i;
                    i28 = i4;
                    i27 = i3;
                    break;
                default:
                    i = i31;
                    i2 = i32;
                    c12558M31245.m31249(c6178, z, (C3374) r7);
                    long j10 = iM34027;
                    c13962.seek(j10);
                    if (C0862.f3233 == 0) {
                        int iM27612 = (C0619.m2761("ܳۧ") ^ i25) * (-125);
                        i3 = ((iM27612 ^ i26) * (-27771)) ^ (-1720635217);
                        i4 = iM27612 ^ 1290320029;
                        j6 = j10;
                        i32 = i2;
                        i31 = i;
                        i28 = i4;
                        i27 = i3;
                    } else {
                        j6 = j10;
                        int iM31617 = C0773.m3169("ᩴ۟") ^ i26;
                        i32 = i2;
                        i31 = i;
                        i28 = iM31617 ^ 1391394384;
                        i27 = ((iM31617 ^ i25) * 23033) ^ 1123695145;
                        c6178 = null;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:160:0x0878 A[PHI: r4 r5 r6 r8 r14 r23 r24 r25 r26 r27 r28 r33 r34
      0x0878: PHI (r4v14 int) = (r4v13 int), (r4v15 int) binds: [B:158:0x0860, B:152:0x0824] A[DONT_GENERATE, DONT_INLINE]
      0x0878: PHI (r5v14 int) = (r5v13 int), (r5v15 int) binds: [B:158:0x0860, B:152:0x0824] A[DONT_GENERATE, DONT_INLINE]
      0x0878: PHI (r6v13 short[]) = (r6v12 short[]), (r6v14 short[]) binds: [B:158:0x0860, B:152:0x0824] A[DONT_GENERATE, DONT_INLINE]
      0x0878: PHI (r8v17 int) = (r8v16 int), (r8v18 int) binds: [B:158:0x0860, B:152:0x0824] A[DONT_GENERATE, DONT_INLINE]
      0x0878: PHI (r14v43 int) = (r14v42 int), (r14v44 int) binds: [B:158:0x0860, B:152:0x0824] A[DONT_GENERATE, DONT_INLINE]
      0x0878: PHI (r23v13 int) = (r23v12 int), (r23v14 int) binds: [B:158:0x0860, B:152:0x0824] A[DONT_GENERATE, DONT_INLINE]
      0x0878: PHI (r24v13 java.lang.StringBuilder) = (r24v12 java.lang.StringBuilder), (r24v14 java.lang.StringBuilder) binds: [B:158:0x0860, B:152:0x0824] A[DONT_GENERATE, DONT_INLINE]
      0x0878: PHI (r25v14 char) = (r25v13 char), (r25v15 char) binds: [B:158:0x0860, B:152:0x0824] A[DONT_GENERATE, DONT_INLINE]
      0x0878: PHI (r26v14 char) = (r26v13 char), (r26v15 char) binds: [B:158:0x0860, B:152:0x0824] A[DONT_GENERATE, DONT_INLINE]
      0x0878: PHI (r27v14 short[]) = (r27v13 short[]), (r27v15 short[]) binds: [B:158:0x0860, B:152:0x0824] A[DONT_GENERATE, DONT_INLINE]
      0x0878: PHI (r28v15 int) = (r28v14 int), (r28v16 int) binds: [B:158:0x0860, B:152:0x0824] A[DONT_GENERATE, DONT_INLINE]
      0x0878: PHI (r33v40 short[]) = (r33v39 short[]), (r33v41 short[]) binds: [B:158:0x0860, B:152:0x0824] A[DONT_GENERATE, DONT_INLINE]
      0x0878: PHI (r34v13 int) = (r34v12 int), (r34v14 int) binds: [B:158:0x0860, B:152:0x0824] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x0109  */
    /* JADX WARN: Code duplicated, block: B:45:0x018e A[PHI: r8 r13
      0x018e: PHI (r8v6 short[]) = (r8v2 short[]), (r8v3 short[]), (r8v2 short[]), (r8v2 short[]) binds: [B:244:0x018e, B:44:0x018c, B:25:0x00e2, B:256:0x018e] A[DONT_GENERATE, DONT_INLINE]
      0x018e: PHI (r13v4 int) = (r13v2 int), (r13v3 int), (r13v2 int), (r13v2 int) binds: [B:244:0x018e, B:44:0x018c, B:25:0x00e2, B:256:0x018e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x0222  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m35972(String str) {
        short[] sArr;
        int iM3169;
        int i;
        int i2;
        short[] sArr2;
        int i3;
        int i4;
        short[] sArr3;
        int i5;
        int i6;
        int iM2761;
        int i7;
        int i8;
        short[] sArr4;
        int i9;
        int i10;
        int i11;
        char c;
        short[] sArr5;
        short[] sArr6;
        int i12;
        int i13;
        int iM2762;
        int i14;
        int i15;
        int iM2763;
        int i16;
        int i17;
        short[] sArr7;
        int i18;
        int i19;
        int i20;
        short[] sArr8;
        int i21;
        int iM2764;
        int i22;
        int i23 = -1338168668;
        int i24 = C1080.f3865;
        int i25 = C4238.f15451;
        int iM2765 = (i24 - C0619.m2761("ܿ۠")) * (-37);
        int i26 = ((iM2765 ^ i25) * 26625) ^ 2105283718;
        int i27 = iM2765 ^ 1730101861;
        short[] sArr9 = null;
        short[] sArr10 = null;
        short[] sArr11 = null;
        short[] sArr12 = null;
        short[] sArr13 = null;
        short[] sArr14 = null;
        int i28 = 0;
        StringBuilder sb = null;
        char c2 = 0;
        int i29 = 0;
        char c3 = 0;
        int i30 = 0;
        int i31 = 0;
        int i32 = 0;
        char c4 = 0;
        short s = 0;
        short s2 = 0;
        int i33 = 0;
        int i34 = 0;
        int i35 = 0;
        int i36 = 0;
        int i37 = 0;
        int i38 = 0;
        int i39 = 0;
        int i40 = 0;
        String strM7761 = null;
        short[] sArr15 = null;
        char c5 = 0;
        int i41 = 0;
        while (true) {
            i23 = i27 ^ (i26 & (((i23 ^ i25) * (-26283)) >> 31));
            switch (i23) {
                case -2118243565:
                case 1562276629:
                    sArr14 = sArr14;
                    i39 = i39;
                    i40 = i40;
                    i28 = i28;
                    i29 = i29;
                    i37 = i37;
                    c5 = c5;
                    sArr15 = sArr15;
                    i36 = i36;
                    sb = sb;
                    short[] sArr16 = sArr10;
                    c3 = c3;
                    i38 = i38;
                    sArr3 = sArr16;
                    if (str != null) {
                        iM2761 = C0773.m3169("ܿۙ") ^ i24;
                        i7 = ((iM2761 ^ i25) * (-16889)) ^ (-14890073);
                        i8 = -1627987170;
                    } else {
                        iM2761 = C0619.m2761("ۢ᩻") ^ i25;
                        i7 = ((iM2761 ^ i24) * (-4365)) ^ (-1738222505);
                        i8 = -124149471;
                    }
                    i28 = i28;
                    i39 = i39;
                    sArr6 = sArr14;
                    i27 = iM2761 ^ i8;
                    i26 = i7;
                    sb = sb;
                    i36 = i36;
                    sArr15 = sArr15;
                    c5 = c5;
                    i37 = i37;
                    i29 = i29;
                    i40 = i40;
                    sArr14 = sArr6;
                    short[] sArr17 = sArr3;
                    i38 = i38;
                    c3 = c3;
                    sArr10 = sArr17;
                    break;
                case -2045471252:
                case -106966916:
                    if (C1080.f3865 < 0) {
                        iM3169 = (C0619.m2761("ܺ۫") + i25) * (-17);
                        i = ((iM3169 ^ i24) * 1463) ^ (-663545905);
                        i2 = -1562464935;
                    } else {
                        iM3169 = (i25 - C0773.m3169("ۖܺ")) * 95;
                        i = ((iM3169 ^ i24) * 13721) ^ 1368580257;
                        i2 = 1600773166;
                    }
                    i27 = iM3169 ^ i2;
                    i26 = i;
                    break;
                case -2028201448:
                case 283731368:
                    i5 = i28;
                    sArr = sArr14;
                    sArr11 = f48826;
                    i40 = 3;
                    i6 = 2;
                    if (AbstractC3624.f12429 > 0) {
                        int iM2766 = (C0619.m2761("ܺۜ") + i24) * 23;
                        i18 = ((iM2766 ^ i25) * (-24601)) ^ (-184409926);
                        i19 = iM2766 ^ 2099093481;
                        i28 = i5;
                        i39 = 2;
                        sArr7 = sArr;
                        i27 = i19;
                        i26 = i18;
                        sArr14 = sArr7;
                    } else {
                        int iM2767 = C0619.m2761("᩻ܺ") ^ i24;
                        int i42 = i5;
                        i39 = i6;
                        i28 = i42;
                        short[] sArr18 = sArr;
                        i27 = iM2767 ^ 1061111613;
                        i26 = ((iM2767 ^ i25) * (-31105)) ^ 821652091;
                        sArr14 = sArr18;
                    }
                    break;
                case -2012430814:
                case -1339386450:
                    sArr = sArr14;
                    if (c3 != '<') {
                        iM2764 = (C0773.m3169("᩷ܶ") + i25) * (-81);
                        i18 = ((iM2764 ^ i24) * (-26679)) ^ (-725071895);
                        i22 = 1526647234;
                    } else {
                        iM2764 = C0619.m2761("۟᩻") ^ i24;
                        i18 = ((iM2764 ^ i25) * 31663) ^ 594031267;
                        i22 = 508023924;
                    }
                    i19 = iM2764 ^ i22;
                    sArr7 = sArr;
                    i27 = i19;
                    i26 = i18;
                    sArr14 = sArr7;
                    break;
                case -1948322415:
                case -915780369:
                    if (C20932.f66974 <= 0) {
                        sArr = sArr14;
                        int i43 = i39;
                        i5 = i28;
                        i6 = i43;
                        int iM2768 = C0619.m2761("᩻ܺ") ^ i24;
                        int i44 = i5;
                        i39 = i6;
                        i28 = i44;
                        short[] sArr19 = sArr;
                        i27 = iM2768 ^ 1061111613;
                        i26 = ((iM2768 ^ i25) * (-31105)) ^ 821652091;
                        sArr14 = sArr19;
                    } else {
                        iM3169 = (i25 - C0773.m3169("ۖܺ")) * 95;
                        i = ((iM3169 ^ i24) * 13721) ^ 1368580257;
                        i2 = 1600773166;
                        i27 = iM3169 ^ i2;
                        i26 = i;
                    }
                    break;
                case -1938709565:
                case -1937158959:
                    C1080.m4046(sb, c3);
                    i20 = i39;
                    sArr8 = sArr11;
                    i21 = i40;
                    int iM2769 = (C0619.m2761("ܺۤ") ^ i25) * (-27);
                    sArr11 = sArr8;
                    i26 = ((iM2769 ^ i24) * 30891) ^ 1556183165;
                    i40 = i21;
                    sArr14 = sArr14;
                    i27 = iM2769 ^ (-1481628892);
                    i28 = i28;
                    i39 = i20;
                    break;
                case -1931505516:
                case 1545149362:
                    C3779.m12258(sb, RunnableC3055.m9937(sArr14, i32, 1, i41));
                    i20 = i39;
                    sArr8 = sArr11;
                    i21 = i40;
                    int iM27610 = (C0619.m2761("ܺۤ") ^ i25) * (-27);
                    sArr11 = sArr8;
                    i26 = ((iM27610 ^ i24) * 30891) ^ 1556183165;
                    i40 = i21;
                    sArr14 = sArr14;
                    i27 = iM27610 ^ (-1481628892);
                    i28 = i28;
                    i39 = i20;
                    break;
                case -1900416230:
                case 309390051:
                    C3779.m12258(sb, RunnableC3055.m9937(sArr12, i30, i31, i41));
                    i20 = i39;
                    sArr8 = sArr11;
                    i21 = i40;
                    int iM27611 = (C0619.m2761("ܺۤ") ^ i25) * (-27);
                    sArr11 = sArr8;
                    i26 = ((iM27611 ^ i24) * 30891) ^ 1556183165;
                    i40 = i21;
                    sArr14 = sArr14;
                    i27 = iM27611 ^ (-1481628892);
                    i28 = i28;
                    i39 = i20;
                    break;
                case -1832418315:
                case -1004507857:
                    C2288.m7767();
                    if (C2023.m6964() > 0) {
                        sArr2 = sArr14;
                        i3 = i39;
                        i40 = i40;
                        i4 = i28;
                        i29 = i29;
                        i37 = i37;
                        c5 = c5;
                        short[] sArr20 = sArr10;
                        c3 = c3;
                        i38 = i38;
                        sArr3 = sArr20;
                        int iM27612 = (C0619.m2761("ۡܳ") + i24) * (-33);
                        i28 = i4;
                        i39 = i3;
                        sArr6 = sArr2;
                        i27 = iM27612 ^ 2033382905;
                        i26 = ((iM27612 ^ i25) * 7823) ^ 1235840109;
                        c5 = c5;
                        i37 = i37;
                        i29 = i29;
                        i40 = i40;
                        sArr14 = sArr6;
                        short[] sArr110 = sArr3;
                        i38 = i38;
                        c3 = c3;
                        sArr10 = sArr110;
                    } else {
                        iM3169 = C0619.m2761("᩶ۜ") ^ i25;
                        i = ((iM3169 ^ i24) * 18713) ^ (-1655537840);
                        i2 = -656081228;
                        i27 = iM3169 ^ i2;
                        i26 = i;
                    }
                    break;
                case -1791842372:
                case 601311260:
                    StringBuilder sb2 = sb;
                    sArr2 = sArr14;
                    i3 = i39;
                    i40 = i40;
                    i4 = i28;
                    i29 = i29;
                    i37 = i37;
                    c5 = c5;
                    short[] sArr21 = sArr15;
                    short[] sArr22 = sArr10;
                    c3 = c3;
                    i38 = i38;
                    sArr3 = sArr22;
                    if (C2310.f7472 < 0) {
                        int iM31610 = C0773.m3169("۠ۘ") ^ i24;
                        i26 = ((iM31610 ^ i25) * (-16251)) ^ (-606988074);
                        sArr15 = sArr21;
                        c5 = c5;
                        i28 = i4;
                        i37 = i37;
                        i39 = i3;
                        i29 = i29;
                        i40 = i40;
                        sArr14 = sArr2;
                        i27 = iM31610 ^ (-1541920769);
                        sb = sb2;
                        i36 = 1;
                        short[] sArr23 = sArr3;
                        i38 = i38;
                        c3 = c3;
                        sArr10 = sArr23;
                    } else {
                        sArr15 = sArr21;
                        sb = sb2;
                        i36 = 1;
                        int iM27613 = (C0619.m2761("ۡܳ") + i24) * (-33);
                        i28 = i4;
                        i39 = i3;
                        sArr6 = sArr2;
                        i27 = iM27613 ^ 2033382905;
                        i26 = ((iM27613 ^ i25) * 7823) ^ 1235840109;
                        c5 = c5;
                        i37 = i37;
                        i29 = i29;
                        i40 = i40;
                        sArr14 = sArr6;
                        short[] sArr111 = sArr3;
                        i38 = i38;
                        c3 = c3;
                        sArr10 = sArr111;
                    }
                    break;
                case -1755048672:
                case 562530479:
                    if (C1306.m4761(c3)) {
                        iM3169 = (C0619.m2761("ܿܽ") + i25) * (-61);
                        i = ((iM3169 ^ i24) * (-26093)) ^ 2018381333;
                        i2 = -93417834;
                    } else {
                        iM3169 = C0619.m2761("ۤܶ") ^ i24;
                        i = ((iM3169 ^ i25) * 27565) ^ 1317283891;
                        i2 = 565995113;
                    }
                    i27 = iM3169 ^ i2;
                    i26 = i;
                    break;
                case -1734550887:
                case 1548702802:
                    sArr4 = sArr14;
                    sArr5 = sArr10;
                    i9 = i39;
                    i40 = i40;
                    i10 = i28;
                    i29 = i29;
                    c3 = c3;
                    i37 = i37;
                    i38 = i38;
                    c5 = c5;
                    if (C0487.m2359(str, C2966.m9670(sArr5, i37, i38, i41))) {
                        sArr3 = sArr5;
                        sArr15 = sArr15;
                        c = c2;
                        i11 = i36;
                        int iM31611 = C0773.m3169("ܶۗ") ^ i25;
                        i28 = i10;
                        i39 = i9;
                        sArr6 = sArr4;
                        i27 = iM31611 ^ 2003716173;
                        i26 = ((iM31611 ^ i24) * 30201) ^ 1434654642;
                        sb = sb;
                        i36 = i11;
                        c2 = c;
                        sArr15 = sArr15;
                        c5 = c5;
                        i37 = i37;
                        i29 = i29;
                        i40 = i40;
                        sArr14 = sArr6;
                    } else {
                        int iM31612 = C0773.m3169("᩻ܿ") ^ i25;
                        sArr3 = sArr5;
                        i26 = ((iM31612 ^ i24) * (-26913)) ^ (-1666639366);
                        i28 = i10;
                        i39 = i9;
                        char c6 = c5;
                        i37 = i37;
                        i29 = i29;
                        i40 = i40;
                        sArr14 = sArr4;
                        i27 = iM31612 ^ (-593299999);
                        c5 = c6;
                    }
                    short[] sArr112 = sArr3;
                    i38 = i38;
                    c3 = c3;
                    sArr10 = sArr112;
                    break;
                case -1707092125:
                case -1004889609:
                    sArr3 = sArr10;
                    i41 = 45320;
                    iM2761 = (i25 - C0619.m2761("ۜۛ")) * (-71);
                    i7 = ((iM2761 ^ i24) * (-6633)) ^ 823804280;
                    i8 = -757808439;
                    i28 = i28;
                    i39 = i39;
                    sArr6 = sArr14;
                    i27 = iM2761 ^ i8;
                    i26 = i7;
                    sb = sb;
                    i36 = i36;
                    sArr15 = sArr15;
                    c5 = c5;
                    i37 = i37;
                    i29 = i29;
                    i40 = i40;
                    sArr14 = sArr6;
                    short[] sArr113 = sArr3;
                    i38 = i38;
                    c3 = c3;
                    sArr10 = sArr113;
                    break;
                case -1701929759:
                case -1007487203:
                    if (c3 >= ' ') {
                        iM3169 = (C0773.m3169("᩺ۜ") + i25) * (-75);
                        i = ((iM3169 ^ i24) * (-22027)) ^ 663785728;
                        i2 = 1007279497;
                    } else {
                        iM3169 = (C0619.m2761("ۡۡ") + i24) * 95;
                        i = ((iM3169 ^ i25) * 27687) ^ (-862464936);
                        i2 = -63964456;
                    }
                    i27 = iM3169 ^ i2;
                    i26 = i;
                    break;
                case -1685813112:
                case 48264892:
                    sArr = sArr14;
                    if (c3 != c2) {
                        iM2764 = (i24 - C0619.m2761("ۤ֫")) * (-37);
                        i18 = ((iM2764 ^ i25) * 27459) ^ (-396170294);
                        i22 = -1985489242;
                    } else {
                        iM2764 = (C0773.m3169("ܺ᩸") ^ i25) * 55;
                        i18 = ((iM2764 ^ i24) * 2579) ^ (-556671118);
                        i22 = 860007658;
                    }
                    i19 = iM2764 ^ i22;
                    sArr7 = sArr;
                    i27 = i19;
                    i26 = i18;
                    sArr14 = sArr7;
                    break;
                case -1668098767:
                case 1023992732:
                    C23916.m53419();
                    if (C2310.f7472 < 0) {
                        sArr = sArr14;
                        iM2764 = C0773.m3169("ۙۘ") ^ i24;
                        i18 = ((iM2764 ^ i25) * (-8925)) ^ 449342756;
                        i22 = 1354266726;
                        i19 = iM2764 ^ i22;
                        sArr7 = sArr;
                        i27 = i19;
                        i26 = i18;
                        sArr14 = sArr7;
                    } else {
                        iM3169 = C0619.m2761("᩶ۜ") ^ i25;
                        i = ((iM3169 ^ i24) * 18713) ^ (-1655537840);
                        i2 = -656081228;
                        i27 = iM3169 ^ i2;
                        i26 = i;
                    }
                    break;
                case -1535657923:
                case 670119600:
                    C2288.m7767();
                    return null;
                case -1528001672:
                case 1065637210:
                    return C2023.m6952(sb);
                case -1279773880:
                case 2139675663:
                    sArr2 = sArr14;
                    int i45 = i36;
                    i3 = i39;
                    i40 = i40;
                    i4 = i28;
                    i29 = i29;
                    i37 = i37;
                    c5 = c5;
                    short[] sArr24 = sArr10;
                    c3 = c3;
                    i38 = i38;
                    sArr3 = sArr24;
                    sb = new StringBuilder();
                    short[] sArr25 = f48826;
                    if (C0487.f2131 <= 0) {
                        i36 = i45;
                        sArr15 = sArr25;
                        int iM27614 = (C0619.m2761("ۡܳ") + i24) * (-33);
                        i28 = i4;
                        i39 = i3;
                        sArr6 = sArr2;
                        i27 = iM27614 ^ 2033382905;
                        i26 = ((iM27614 ^ i25) * 7823) ^ 1235840109;
                        c5 = c5;
                        i37 = i37;
                        i29 = i29;
                        i40 = i40;
                        sArr14 = sArr6;
                        short[] sArr114 = sArr3;
                        i38 = i38;
                        c3 = c3;
                        sArr10 = sArr114;
                    } else {
                        int iM31613 = (C0773.m3169("᩹ܰ") + i24) * 99;
                        i26 = ((iM31613 ^ i25) * (-31801)) ^ 903170060;
                        i28 = i4;
                        i39 = i3;
                        i37 = i37;
                        i29 = i29;
                        i40 = i40;
                        sArr14 = sArr2;
                        i27 = iM31613 ^ (-100337727);
                        c5 = c5;
                        i38 = i38;
                        c3 = c3;
                        sArr10 = sArr3;
                        i36 = i45;
                        sArr15 = sArr25;
                    }
                    break;
                case -1143513048:
                case 1353353405:
                    sArr14 = sArr14;
                    i39 = i39;
                    i40 = i40;
                    i28 = i28;
                    i29 = i29;
                    i37 = i37;
                    c5 = c5;
                    sArr15 = sArr15;
                    i36 = i36;
                    sb = sb;
                    short[] sArr26 = sArr10;
                    c3 = c3;
                    i38 = i38;
                    sArr3 = sArr26;
                    if ((i34 + i35) - i33 >= 0) {
                        iM2761 = (C0773.m3169("֨ۗ") ^ i24) * 57;
                        i7 = ((iM2761 ^ i25) * (-29921)) ^ (-1529474098);
                        i8 = 502437304;
                    } else {
                        iM2761 = (C0773.m3169("֡᩷") ^ i24) * 11;
                        i7 = ((iM2761 ^ i25) * 22283) ^ 1966775707;
                        i8 = 1242444642;
                    }
                    i28 = i28;
                    i39 = i39;
                    sArr6 = sArr14;
                    i27 = iM2761 ^ i8;
                    i26 = i7;
                    sb = sb;
                    i36 = i36;
                    sArr15 = sArr15;
                    c5 = c5;
                    i37 = i37;
                    i29 = i29;
                    i40 = i40;
                    sArr14 = sArr6;
                    short[] sArr115 = sArr3;
                    i38 = i38;
                    c3 = c3;
                    sArr10 = sArr115;
                    break;
                case -1042705659:
                case 47604759:
                    sArr4 = sArr14;
                    sArr5 = sArr10;
                    i9 = i39;
                    i40 = i40;
                    i10 = i28;
                    i29 = i29;
                    c3 = c3;
                    i37 = i37;
                    i38 = i38;
                    c5 = c5;
                    C1080.m4046(sb, c2);
                    int iM31614 = C0773.m3169("᩻ܿ") ^ i25;
                    sArr3 = sArr5;
                    i26 = ((iM31614 ^ i24) * (-26913)) ^ (-1666639366);
                    i28 = i10;
                    i39 = i9;
                    char c7 = c5;
                    i37 = i37;
                    i29 = i29;
                    i40 = i40;
                    sArr14 = sArr4;
                    i27 = iM31614 ^ (-593299999);
                    c5 = c7;
                    short[] sArr116 = sArr3;
                    i38 = i38;
                    c3 = c3;
                    sArr10 = sArr116;
                    break;
                case -1039295955:
                case -916038986:
                    C3779.m12258(sb, strM7761);
                    C3779.m12269(sb, c3);
                    C1080.m4046(sb, ';');
                    i20 = i39;
                    sArr8 = sArr11;
                    i21 = i40;
                    int iM27615 = (C0619.m2761("ܺۤ") ^ i25) * (-27);
                    sArr11 = sArr8;
                    i26 = ((iM27615 ^ i24) * 30891) ^ 1556183165;
                    i40 = i21;
                    sArr14 = sArr14;
                    i27 = iM27615 ^ (-1481628892);
                    i28 = i28;
                    i39 = i20;
                    break;
                case -987664928:
                case 1531564912:
                    C3779.m12258(sb, C4238.m13530(f48826, 20, 4, i41));
                    i20 = i39;
                    sArr8 = sArr11;
                    i21 = i40;
                    int iM27616 = (C0619.m2761("ܺۤ") ^ i25) * (-27);
                    sArr11 = sArr8;
                    i26 = ((iM27616 ^ i24) * 30891) ^ 1556183165;
                    i40 = i21;
                    sArr14 = sArr14;
                    i27 = iM27616 ^ (-1481628892);
                    i28 = i28;
                    i39 = i20;
                    break;
                case -973927637:
                case -364397794:
                    sArr = sArr14;
                    c5 = '\r';
                    sArr13 = f48826;
                    i28 = 7;
                    if (C17202.f56030) {
                        iM2764 = (C0773.m3169("֫֫") ^ i24) * (-117);
                        i18 = ((iM2764 ^ i25) * 28837) ^ 1743114404;
                        i22 = -1764310389;
                    } else {
                        iM2764 = C0773.m3169("ۤ᩶") ^ i25;
                        i18 = ((iM2764 ^ i24) * (-30723)) ^ 251151252;
                        i22 = -1967952918;
                    }
                    i19 = iM2764 ^ i22;
                    sArr7 = sArr;
                    i27 = i19;
                    i26 = i18;
                    sArr14 = sArr7;
                    break;
                case -934024116:
                case 764442096:
                    sArr = sArr14;
                    if (c3 != '\"') {
                        iM2764 = C0619.m2761("ܿ᩵") ^ i25;
                        i18 = ((iM2764 ^ i24) * (-21813)) ^ (-1255267734);
                        i22 = -2087961662;
                    } else {
                        iM2764 = (C0773.m3169("ۡۢ") + i24) * (-35);
                        i18 = ((iM2764 ^ i25) * 21995) ^ (-1797424670);
                        i22 = -348684527;
                    }
                    i19 = iM2764 ^ i22;
                    sArr7 = sArr;
                    i27 = i19;
                    i26 = i18;
                    sArr14 = sArr7;
                    break;
                case -883223857:
                case 2017008892:
                    sArr14 = sArr14;
                    i20 = i39;
                    sArr8 = sArr11;
                    i21 = i40;
                    C1783.m6234(sb, C2702.m8881(sArr8, i21, i20, i41));
                    int iM27617 = (C0619.m2761("ܺۤ") ^ i25) * (-27);
                    sArr11 = sArr8;
                    i26 = ((iM27617 ^ i24) * 30891) ^ 1556183165;
                    i40 = i21;
                    sArr14 = sArr14;
                    i27 = iM27617 ^ (-1481628892);
                    i28 = i28;
                    i39 = i20;
                    break;
                case -586719502:
                case 661059624:
                    sArr3 = sArr10;
                    i41 = 54806;
                    iM2761 = (i25 - C0619.m2761("ۜۛ")) * (-71);
                    i7 = ((iM2761 ^ i24) * (-6633)) ^ 823804280;
                    i8 = -757808439;
                    i28 = i28;
                    i39 = i39;
                    sArr6 = sArr14;
                    i27 = iM2761 ^ i8;
                    i26 = i7;
                    sb = sb;
                    i36 = i36;
                    sArr15 = sArr15;
                    c5 = c5;
                    i37 = i37;
                    i29 = i29;
                    i40 = i40;
                    sArr14 = sArr6;
                    short[] sArr117 = sArr3;
                    i38 = i38;
                    c3 = c3;
                    sArr10 = sArr117;
                    break;
                case -536168798:
                case 791461971:
                    sArr = sArr14;
                    strM7761 = C2288.m7761(sArr13, i28, 2, i41);
                    if (c3 != c5) {
                        iM2764 = C0619.m2761("᩻ۤ") ^ i25;
                        i18 = ((iM2764 ^ i24) * 13401) ^ 60615540;
                        i22 = -1692110064;
                    } else {
                        iM2764 = (i24 - C0773.m3169("֫ۗ")) * 53;
                        i18 = ((iM2764 ^ i25) * 3295) ^ 1815269024;
                        i22 = -1519621702;
                    }
                    i19 = iM2764 ^ i22;
                    sArr7 = sArr;
                    i27 = i19;
                    i26 = i18;
                    sArr14 = sArr7;
                    break;
                case -507103652:
                case -304149776:
                    sArr = sArr14;
                    if (c3 != '\n') {
                        iM2764 = C0773.m3169("ۤ֨") ^ i25;
                        i18 = ((iM2764 ^ i24) * (-24167)) ^ (-26897336);
                        i22 = 1559256435;
                    } else {
                        iM2764 = C0619.m2761("ۗ֫") ^ i24;
                        i18 = ((iM2764 ^ i25) * (-1431)) ^ 1350774161;
                        i22 = -1914525408;
                    }
                    i19 = iM2764 ^ i22;
                    sArr7 = sArr;
                    i27 = i19;
                    i26 = i18;
                    sArr14 = sArr7;
                    break;
                case -463852086:
                case -371553133:
                    C2419.m8174();
                    if (RunnableC3055.m9933() == 0) {
                        sArr = sArr14;
                        iM2764 = C0773.m3169("ۤ᩶") ^ i25;
                        i18 = ((iM2764 ^ i24) * (-30723)) ^ 251151252;
                        i22 = -1967952918;
                        i19 = iM2764 ^ i22;
                        sArr7 = sArr;
                        i27 = i19;
                        i26 = i18;
                        sArr14 = sArr7;
                    } else {
                        iM3169 = (i25 - C0773.m3169("ۖܺ")) * 95;
                        i = ((iM3169 ^ i24) * 13721) ^ 1368580257;
                        i2 = 1600773166;
                        i27 = iM3169 ^ i2;
                        i26 = i;
                    }
                    break;
                case -460136526:
                case 213498213:
                    sArr14 = sArr14;
                    i39 = i39;
                    i40 = i40;
                    i28 = i28;
                    if (i29 < C2966.m9671(str)) {
                        iM2762 = C0619.m2761("۠᩸") ^ i24;
                        i13 = i29;
                        i14 = ((iM2762 ^ i25) * 30001) ^ 804390801;
                        i15 = -579341140;
                    } else {
                        i13 = i29;
                        iM2762 = C0619.m2761("᩶ᩴ") ^ i25;
                        i14 = ((iM2762 ^ i24) * (-10611)) ^ (-1711337775);
                        i15 = -1993333043;
                    }
                    i28 = i28;
                    i39 = i39;
                    sArr7 = sArr14;
                    i27 = iM2762 ^ i15;
                    i26 = i14;
                    i29 = i13;
                    i40 = i40;
                    sArr14 = sArr7;
                    break;
                case -381037771:
                case 1264009486:
                    if (c3 < 127) {
                        iM3169 = C0619.m2761("ᩴܽ") ^ i24;
                        i = ((iM3169 ^ i25) * (-11265)) ^ 582979242;
                        i2 = -1867978743;
                    } else {
                        iM3169 = (C0619.m2761("ۡۡ") + i24) * 95;
                        i = ((iM3169 ^ i25) * 27687) ^ (-862464936);
                        i2 = -63964456;
                    }
                    i27 = iM3169 ^ i2;
                    i26 = i;
                    break;
                case -376445908:
                case 636035314:
                    C3779.m12258(sb, C11235.m28300(f48826, 24, 4, i41));
                    i20 = i39;
                    sArr8 = sArr11;
                    i21 = i40;
                    int iM27618 = (C0619.m2761("ܺۤ") ^ i25) * (-27);
                    sArr11 = sArr8;
                    i26 = ((iM27618 ^ i24) * 30891) ^ 1556183165;
                    i40 = i21;
                    sArr14 = sArr14;
                    i27 = iM27618 ^ (-1481628892);
                    i28 = i28;
                    i39 = i20;
                    break;
                case -341815428:
                case 922190040:
                    sArr14 = sArr14;
                    i39 = i39;
                    i40 = i40;
                    i28 = i28;
                    i29 = i29;
                    i37 = i37;
                    c5 = c5;
                    sArr15 = sArr15;
                    i36 = i36;
                    sb = sb;
                    short[] sArr27 = sArr10;
                    c3 = c3;
                    i38 = i38;
                    sArr3 = sArr27;
                    s = sArr9[c4];
                    s2 = 9196;
                    if (C11235.f35427 >= 0) {
                        iM2761 = C0619.m2761("۫ۨ") ^ i25;
                        i7 = ((iM2761 ^ i24) * (-26033)) ^ (-177273719);
                        i8 = -1950415896;
                    } else {
                        iM2761 = (C0773.m3169("ᩳ֡") + i24) * 39;
                        i7 = ((iM2761 ^ i25) * 27289) ^ 329409258;
                        i8 = 1988623643;
                    }
                    i28 = i28;
                    i39 = i39;
                    sArr6 = sArr14;
                    i27 = iM2761 ^ i8;
                    i26 = i7;
                    sb = sb;
                    i36 = i36;
                    sArr15 = sArr15;
                    c5 = c5;
                    i37 = i37;
                    i29 = i29;
                    i40 = i40;
                    sArr14 = sArr6;
                    short[] sArr118 = sArr3;
                    i38 = i38;
                    c3 = c3;
                    sArr10 = sArr118;
                    break;
                case -338461996:
                case 2135269266:
                    C1783.m6234(sb, C3779.m12266(f48826, 9, 6, i41));
                    i20 = i39;
                    sArr8 = sArr11;
                    i21 = i40;
                    int iM27619 = (C0619.m2761("ܺۤ") ^ i25) * (-27);
                    sArr11 = sArr8;
                    i26 = ((iM27619 ^ i24) * 30891) ^ 1556183165;
                    i40 = i21;
                    sArr14 = sArr14;
                    i27 = iM27619 ^ (-1481628892);
                    i28 = i28;
                    i39 = i20;
                    break;
                case -304395318:
                case 759800952:
                    sArr14 = sArr14;
                    i39 = i39;
                    i40 = i40;
                    i28 = i28;
                    i29 = i29;
                    i37 = i37;
                    c5 = c5;
                    sArr15 = sArr15;
                    i36 = i36;
                    sb = sb;
                    short[] sArr28 = sArr10;
                    c3 = c3;
                    i38 = i38;
                    sArr3 = sArr28;
                    sArr9 = f48826;
                    c4 = 0;
                    if (C2354.f7599 >= 0) {
                        iM2761 = C0619.m2761("۫۬") ^ i24;
                        i7 = ((iM2761 ^ i25) * (-28493)) ^ 1983378544;
                        i8 = 1567759973;
                    } else {
                        iM2761 = (i25 - C0773.m3169("ۡۘ")) * (-51);
                        i7 = ((iM2761 ^ i24) * (-23571)) ^ (-2086560002);
                        i8 = -1352848974;
                    }
                    i28 = i28;
                    i39 = i39;
                    sArr6 = sArr14;
                    i27 = iM2761 ^ i8;
                    i26 = i7;
                    sb = sb;
                    i36 = i36;
                    sArr15 = sArr15;
                    c5 = c5;
                    i37 = i37;
                    i29 = i29;
                    i40 = i40;
                    sArr14 = sArr6;
                    short[] sArr119 = sArr3;
                    i38 = i38;
                    c3 = c3;
                    sArr10 = sArr119;
                    break;
                case -277591996:
                case 101797340:
                    short[] sArr29 = sArr14;
                    int i46 = i39;
                    i40 = i40;
                    int i47 = i28;
                    char cM13656 = C4282.m13656(str, i29);
                    if (cM13656 != '\t') {
                        iM2763 = (C0619.m2761("᩹᩸") ^ i24) * 39;
                        i16 = ((iM2763 ^ i25) * (-10283)) ^ 2069682820;
                        i17 = -1918844163;
                    } else {
                        iM2763 = C0619.m2761("ܿᩴ") ^ i25;
                        i16 = ((iM2763 ^ i24) * 26421) ^ (-1705166764);
                        i17 = 833346596;
                    }
                    i28 = i47;
                    i39 = i46;
                    sArr7 = sArr29;
                    i27 = iM2763 ^ i17;
                    i26 = i16;
                    c3 = cM13656;
                    i40 = i40;
                    sArr14 = sArr7;
                    break;
                case -86315949:
                case 1784900791:
                    C3779.m12258(sb, strM7761);
                    C3779.m12269(sb, c3);
                    sArr14 = f48826;
                    i32 = 30;
                    if (C3690.m11987()) {
                        iM3169 = (i25 - C0773.m3169("ۖܺ")) * 95;
                        i = ((iM3169 ^ i24) * 13721) ^ 1368580257;
                        i2 = 1600773166;
                    } else {
                        iM3169 = C0773.m3169("ۜ۠") ^ i25;
                        i = ((iM3169 ^ i24) * (-12459)) ^ (-2094736689);
                        i2 = -357630689;
                    }
                    i27 = iM3169 ^ i2;
                    i26 = i;
                    break;
                case 86262906:
                case 1271760296:
                    C2023.m6955(sb, c3);
                    i20 = i39;
                    sArr8 = sArr11;
                    i21 = i40;
                    int iM276110 = (C0619.m2761("ܺۤ") ^ i25) * (-27);
                    sArr11 = sArr8;
                    i26 = ((iM276110 ^ i24) * 30891) ^ 1556183165;
                    i40 = i21;
                    sArr14 = sArr14;
                    i27 = iM276110 ^ (-1481628892);
                    i28 = i28;
                    i39 = i20;
                    break;
                case 89063332:
                case 2139007727:
                    sArr4 = sArr14;
                    i9 = i39;
                    i40 = i40;
                    i10 = i28;
                    i29 = i29;
                    i37 = i37;
                    c5 = c5;
                    short[] sArr30 = sArr10;
                    c3 = c3;
                    i38 = i38;
                    sArr3 = sArr30;
                    sArr15 = sArr15;
                    i11 = i36;
                    c = '\\';
                    if (!C0487.m2359(str, C1146.m4222(sArr15, i11, 1, i41))) {
                        int iM31615 = (C0773.m3169("ᩳۗ") + i24) * 21;
                        sArr15 = sArr15;
                        c5 = c5;
                        i28 = i10;
                        i37 = i37;
                        i39 = i9;
                        i29 = i29;
                        i40 = i40;
                        sArr14 = sArr4;
                        i27 = iM31615 ^ (-1833806874);
                        i26 = ((iM31615 ^ i25) * (-145)) ^ (-2011170447);
                        sb = sb;
                        i36 = i11;
                        c2 = '\\';
                        short[] sArr210 = sArr3;
                        i38 = i38;
                        c3 = c3;
                        sArr10 = sArr210;
                    } else {
                        int iM31616 = C0773.m3169("ܶۗ") ^ i25;
                        i28 = i10;
                        i39 = i9;
                        sArr6 = sArr4;
                        i27 = iM31616 ^ 2003716173;
                        i26 = ((iM31616 ^ i24) * 30201) ^ 1434654642;
                        sb = sb;
                        i36 = i11;
                        c2 = c;
                        sArr15 = sArr15;
                        c5 = c5;
                        i37 = i37;
                        i29 = i29;
                        i40 = i40;
                        sArr14 = sArr6;
                        short[] sArr1110 = sArr3;
                        i38 = i38;
                        c3 = c3;
                        sArr10 = sArr1110;
                    }
                    break;
                case 194791195:
                case 489419083:
                    i12 = i29 + 1;
                    iM2762 = (i24 - C0773.m3169("ۗۢ")) * 109;
                    i13 = i12;
                    i14 = ((iM2762 ^ i25) * 16267) ^ 505658855;
                    i15 = 1720480732;
                    i28 = i28;
                    i39 = i39;
                    sArr7 = sArr14;
                    i27 = iM2762 ^ i15;
                    i26 = i14;
                    i29 = i13;
                    i40 = i40;
                    sArr14 = sArr7;
                    break;
                case 462617825:
                case 2031429136:
                    sArr14 = sArr14;
                    i39 = i39;
                    i40 = i40;
                    i28 = i28;
                    i29 = i29;
                    i37 = i37;
                    c5 = c5;
                    sArr15 = sArr15;
                    i36 = i36;
                    sb = sb;
                    short[] sArr31 = sArr10;
                    c3 = c3;
                    i38 = i38;
                    sArr3 = sArr31;
                    i33 = s * s2;
                    i34 = s * s;
                    i35 = 21141604;
                    if (C2702.f8586 <= 0) {
                        iM2761 = (C0773.m3169("ۤۙ") + i24) * 91;
                        i7 = ((iM2761 ^ i25) * (-4503)) ^ (-1751256037);
                        i8 = -631343937;
                    } else {
                        iM2761 = C0773.m3169("ۗܰ") ^ i25;
                        i7 = ((iM2761 ^ i24) * 11621) ^ (-995393203);
                        i8 = 224429624;
                    }
                    i28 = i28;
                    i39 = i39;
                    sArr6 = sArr14;
                    i27 = iM2761 ^ i8;
                    i26 = i7;
                    sb = sb;
                    i36 = i36;
                    sArr15 = sArr15;
                    c5 = c5;
                    i37 = i37;
                    i29 = i29;
                    i40 = i40;
                    sArr14 = sArr6;
                    short[] sArr1111 = sArr3;
                    i38 = i38;
                    c3 = c3;
                    sArr10 = sArr1111;
                    break;
                case 651458576:
                case 1451501180:
                    sArr = sArr14;
                    sArr12 = f48826;
                    i30 = 5;
                    i31 = 2;
                    if (C2419.f7754 >= 0) {
                        iM2764 = C0773.m3169("ۙۘ") ^ i24;
                        i18 = ((iM2764 ^ i25) * (-8925)) ^ 449342756;
                        i22 = 1354266726;
                    } else {
                        iM2764 = C0619.m2761("ܺ᩵") ^ i25;
                        i18 = ((iM2764 ^ i24) * (-30151)) ^ 1186246547;
                        i22 = -1530450511;
                    }
                    i19 = iM2764 ^ i22;
                    sArr7 = sArr;
                    i27 = i19;
                    i26 = i18;
                    sArr14 = sArr7;
                    break;
                case 781221866:
                case 893124093:
                    sArr = sArr14;
                    if (c3 != '&') {
                        iM2764 = C0619.m2761("᩸۟") ^ i25;
                        i18 = ((iM2764 ^ i24) * 30215) ^ (-909470970);
                        i22 = 111055840;
                    } else {
                        iM2764 = (C0773.m3169("᩸ܿ") + i24) * 45;
                        i18 = ((iM2764 ^ i25) * 17507) ^ (-641470439);
                        i22 = -1445125854;
                    }
                    i19 = iM2764 ^ i22;
                    sArr7 = sArr;
                    i27 = i19;
                    i26 = i18;
                    sArr14 = sArr7;
                    break;
                case 945023457:
                case 1898731654:
                    C1783.m6234(sb, C2702.m8881(f48826, 15, 5, i41));
                    i20 = i39;
                    sArr8 = sArr11;
                    i21 = i40;
                    int iM276111 = (C0619.m2761("ܺۤ") ^ i25) * (-27);
                    sArr11 = sArr8;
                    i26 = ((iM276111 ^ i24) * 30891) ^ 1556183165;
                    i40 = i21;
                    sArr14 = sArr14;
                    i27 = iM276111 ^ (-1481628892);
                    i28 = i28;
                    i39 = i20;
                    break;
                case 999227314:
                case 1916370779:
                    C1783.m6234(sb, C1542.m5471(f48826, 28, 2, i41));
                    i20 = i39;
                    sArr8 = sArr11;
                    i21 = i40;
                    int iM276112 = (C0619.m2761("ܺۤ") ^ i25) * (-27);
                    sArr11 = sArr8;
                    i26 = ((iM276112 ^ i24) * 30891) ^ 1556183165;
                    i40 = i21;
                    sArr14 = sArr14;
                    i27 = iM276112 ^ (-1481628892);
                    i28 = i28;
                    i39 = i20;
                    break;
                case 1006937809:
                case 1199350210:
                    if (AbstractC3624.m11755() != 0) {
                        sArr14 = sArr14;
                        i39 = i39;
                        i40 = i40;
                        i28 = i28;
                        i29 = i29;
                        i37 = i37;
                        c5 = c5;
                        sArr15 = sArr15;
                        i36 = i36;
                        sb = sb;
                        short[] sArr32 = sArr10;
                        c3 = c3;
                        i38 = i38;
                        sArr3 = sArr32;
                        iM2761 = C0619.m2761("۫۬") ^ i24;
                        i7 = ((iM2761 ^ i25) * (-28493)) ^ 1983378544;
                        i8 = 1567759973;
                        i28 = i28;
                        i39 = i39;
                        sArr6 = sArr14;
                        i27 = iM2761 ^ i8;
                        i26 = i7;
                        sb = sb;
                        i36 = i36;
                        sArr15 = sArr15;
                        c5 = c5;
                        i37 = i37;
                        i29 = i29;
                        i40 = i40;
                        sArr14 = sArr6;
                        short[] sArr1112 = sArr3;
                        i38 = i38;
                        c3 = c3;
                        sArr10 = sArr1112;
                    } else {
                        iM3169 = C0619.m2761("᩶ۜ") ^ i25;
                        i = ((iM3169 ^ i24) * 18713) ^ (-1655537840);
                        i2 = -656081228;
                        i27 = iM3169 ^ i2;
                        i26 = i;
                    }
                    break;
                case 1090402870:
                case 1167086220:
                    sArr14 = sArr14;
                    i39 = i39;
                    i40 = i40;
                    i28 = i28;
                    i29 = i29;
                    i37 = i37;
                    c5 = c5;
                    sArr15 = sArr15;
                    i36 = i36;
                    sb = sb;
                    short[] sArr33 = sArr10;
                    c3 = c3;
                    i38 = i38;
                    sArr3 = sArr33;
                    if (C2878.m9480(str)) {
                        iM2761 = C0619.m2761("ۢ᩻") ^ i25;
                        i7 = ((iM2761 ^ i24) * (-4365)) ^ (-1738222505);
                        i8 = -124149471;
                    } else {
                        iM2761 = (C0773.m3169("֨ܺ") + i25) * 3;
                        i7 = ((iM2761 ^ i24) * 15801) ^ (-652420714);
                        i8 = -1751127943;
                    }
                    i28 = i28;
                    i39 = i39;
                    sArr6 = sArr14;
                    i27 = iM2761 ^ i8;
                    i26 = i7;
                    sb = sb;
                    i36 = i36;
                    sArr15 = sArr15;
                    c5 = c5;
                    i37 = i37;
                    i29 = i29;
                    i40 = i40;
                    sArr14 = sArr6;
                    short[] sArr1113 = sArr3;
                    i38 = i38;
                    c3 = c3;
                    sArr10 = sArr1113;
                    break;
                case 1100563044:
                case 1850800315:
                    C0269.m1775();
                    C2702.m8876();
                    sArr14 = sArr14;
                    i39 = i39;
                    i40 = i40;
                    i28 = i28;
                    i29 = i29;
                    i37 = i37;
                    c5 = c5;
                    sArr15 = sArr15;
                    i36 = i36;
                    sb = sb;
                    short[] sArr34 = sArr10;
                    c3 = c3;
                    i38 = i38;
                    sArr3 = sArr34;
                    iM2761 = (C0773.m3169("ۤۙ") + i24) * 91;
                    i7 = ((iM2761 ^ i25) * (-4503)) ^ (-1751256037);
                    i8 = -631343937;
                    i28 = i28;
                    i39 = i39;
                    sArr6 = sArr14;
                    i27 = iM2761 ^ i8;
                    i26 = i7;
                    sb = sb;
                    i36 = i36;
                    sArr15 = sArr15;
                    c5 = c5;
                    i37 = i37;
                    i29 = i29;
                    i40 = i40;
                    sArr14 = sArr6;
                    short[] sArr1114 = sArr3;
                    i38 = i38;
                    c3 = c3;
                    sArr10 = sArr1114;
                    break;
                case 1311667153:
                case 1423709518:
                    return "";
                case 1434359474:
                case 2132490015:
                    C1519.m5403();
                    if (!C0619.f2439) {
                        sArr14 = sArr14;
                        i39 = i39;
                        i40 = i40;
                        i28 = i28;
                        i29 = i29;
                        i37 = i37;
                        c5 = c5;
                        sArr15 = sArr15;
                        i36 = i36;
                        sb = sb;
                        short[] sArr35 = sArr10;
                        c3 = c3;
                        i38 = i38;
                        sArr3 = sArr35;
                        iM2761 = (C0773.m3169("ۤۙ") + i24) * 91;
                        i7 = ((iM2761 ^ i25) * (-4503)) ^ (-1751256037);
                        i8 = -631343937;
                        i28 = i28;
                        i39 = i39;
                        sArr6 = sArr14;
                        i27 = iM2761 ^ i8;
                        i26 = i7;
                        sb = sb;
                        i36 = i36;
                        sArr15 = sArr15;
                        c5 = c5;
                        i37 = i37;
                        i29 = i29;
                        i40 = i40;
                        sArr14 = sArr6;
                        short[] sArr1115 = sArr3;
                        i38 = i38;
                        c3 = c3;
                        sArr10 = sArr1115;
                    } else {
                        iM3169 = C0619.m2761("᩶ۜ") ^ i25;
                        i = ((iM3169 ^ i24) * 18713) ^ (-1655537840);
                        i2 = -656081228;
                        i27 = iM3169 ^ i2;
                        i26 = i;
                    }
                    break;
                case 1735021421:
                case 1779889388:
                    i12 = 0;
                    iM2762 = (i24 - C0773.m3169("ۗۢ")) * 109;
                    i13 = i12;
                    i14 = ((iM2762 ^ i25) * 16267) ^ 505658855;
                    i15 = 1720480732;
                    i28 = i28;
                    i39 = i39;
                    sArr7 = sArr14;
                    i27 = iM2762 ^ i15;
                    i26 = i14;
                    i29 = i13;
                    i40 = i40;
                    sArr14 = sArr7;
                    break;
                case 1830461690:
                case 1912171120:
                    c3 = c3;
                    c5 = c5;
                    sArr2 = sArr14;
                    i3 = i39;
                    i40 = i40;
                    i4 = i28;
                    i29 = i29;
                    short[] sArr36 = f48826;
                    i37 = 2;
                    i38 = 1;
                    if (C2419.m8174() >= 0) {
                        sArr3 = sArr36;
                        i38 = 1;
                        int iM276113 = (C0619.m2761("ۡܳ") + i24) * (-33);
                        i28 = i4;
                        i39 = i3;
                        sArr6 = sArr2;
                        i27 = iM276113 ^ 2033382905;
                        i26 = ((iM276113 ^ i25) * 7823) ^ 1235840109;
                        c5 = c5;
                        i37 = i37;
                        i29 = i29;
                        i40 = i40;
                        sArr14 = sArr6;
                        short[] sArr1116 = sArr3;
                        i38 = i38;
                        c3 = c3;
                        sArr10 = sArr1116;
                    } else {
                        int iM27620 = C0619.m2761("᩹ܽ") ^ i25;
                        int i48 = ((iM27620 ^ i24) * 8629) ^ 114614754;
                        i28 = i4;
                        i29 = i29;
                        i40 = i40;
                        i39 = i3;
                        sArr14 = sArr2;
                        i27 = iM27620 ^ (-352628065);
                        c3 = c3;
                        sArr10 = sArr36;
                        i26 = i48;
                        c5 = c5;
                        i37 = 2;
                    }
                    break;
                case 1936144963:
                case 1946222970:
                    sArr = sArr14;
                    if (c3 != '>') {
                        iM2764 = (i25 - C0619.m2761("ܿᩳ")) * 23;
                        i18 = ((iM2764 ^ i24) * 28847) ^ (-32591695);
                        i22 = 1757387103;
                    } else {
                        iM2764 = (i24 - C0619.m2761("ᩴ᩺")) * 97;
                        i18 = ((iM2764 ^ i25) * 4725) ^ (-605298727);
                        i22 = -922105586;
                    }
                    i19 = iM2764 ^ i22;
                    sArr7 = sArr;
                    i27 = i19;
                    i26 = i18;
                    sArr14 = sArr7;
                    break;
                default:
                    if (C2878.f9462) {
                        iM3169 = (C0619.m2761("ܺ۫") + i25) * (-17);
                        i = ((iM3169 ^ i24) * 1463) ^ (-663545905);
                        i2 = -1562464935;
                    } else {
                        iM3169 = C0619.m2761("᩶ۜ") ^ i25;
                        i = ((iM3169 ^ i24) * 18713) ^ (-1655537840);
                        i2 = -656081228;
                    }
                    i27 = iM3169 ^ i2;
                    i26 = i;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0045  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:55:0x016c  */
    /* JADX WARN: Code duplicated, block: B:59:0x0196  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m35989(C21246 c21246) throws IOException {
        int iM2761;
        int i;
        XmlPullParserException e = null;
        byte[] bArrM23985 = null;
        int i2 = -106603887;
        int i3 = RunnableC0334.f1808;
        int i4 = C2966.f9654;
        int iM2762 = C0619.m2761("ۚ᩷") ^ i3;
        int i5 = ((iM2762 ^ i4) * 11867) ^ (-980964332);
        int i6 = 478269539;
        while (true) {
            int i7 = iM2762 ^ i6;
            ByteArrayInputStream byteArrayInputStream = null;
            while (true) {
                i2 = ((((i2 ^ i4) * (-705)) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2130442733:
                    case 338273339:
                        if (C3077.m10041()) {
                            iM2761 = C0619.m2761("᩸ۜ") ^ i3;
                            i5 = ((iM2761 ^ i4) * 26583) ^ (-1002681215);
                            i = 834133536;
                        } else {
                            iM2761 = C0619.m2761("ܿۗ") ^ i4;
                            i5 = ((iM2761 ^ i3) * 6129) ^ 552469039;
                            i = -1332241181;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case -2043751006:
                    case -1561210109:
                        if (AbstractC0641.m2813() > 0) {
                            iM2761 = (C0773.m3169("۠ۗ") + i3) * (-61);
                            i5 = ((iM2761 ^ i4) * (-17265)) ^ (-1190496659);
                            i = 1257511317;
                            i7 = iM2761 ^ i;
                        }
                        break;
                    case -2035884794:
                    case -469509207:
                        m35981(c21246);
                        if (C11235.f35427 >= 0) {
                            iM2761 = C0619.m2761("᩸ۜ") ^ i3;
                            i5 = ((iM2761 ^ i4) * 26583) ^ (-1002681215);
                            i = 834133536;
                        } else {
                            iM2761 = (i3 - C0619.m2761("֡᩹")) * 71;
                            i5 = ((iM2761 ^ i4) * 5629) ^ 1058395303;
                            i = -1889702458;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case -1798213789:
                    case 1194557095:
                        try {
                            bArrM23985 = new C8989(byteArrayInputStream, this.f48832).m23985();
                            iM2761 = C0773.m3169("ܺ᩺") ^ i3;
                            i5 = ((iM2761 ^ i4) * (-19251)) ^ (-2064838080);
                            i = 1673024243;
                        } catch (XmlPullParserException e2) {
                            e = e2;
                            iM2761 = (C0619.m2761("ۗ۫") + i3) * (-91);
                            i5 = ((iM2761 ^ i4) * (-10189)) ^ 709755095;
                            i = 310999846;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case -1782796296:
                    case 898125252:
                        C1146.m4231();
                        if (C2310.f7472 < 0) {
                            iM2761 = C0619.m2761("᩺֡") ^ i3;
                            i5 = ((iM2761 ^ i4) * 3943) ^ (-302165897);
                            i = 1680979168;
                        } else {
                            iM2761 = C0619.m2761("᩸ۜ") ^ i3;
                            i5 = ((iM2761 ^ i4) * 26583) ^ (-1002681215);
                            i = 834133536;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case -1649464864:
                    case 1443321532:
                        return bArrM23985;
                    case -1206947062:
                    case 961031157:
                        C3779.m12264();
                        C1519.m5403();
                        return null;
                    case -1047771137:
                    case -298359993:
                        C2288.m7767();
                        iM2761 = C0773.m3169("᩷ۗ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 10049) ^ 657063859;
                        i = 622038409;
                        i7 = iM2761 ^ i;
                        break;
                    case -623184078:
                    case 1368223816:
                        RunnableC3055.m9933();
                        if (C1783.f6087 > 0) {
                            iM2761 = C0773.m3169("᩷ۗ") ^ i4;
                            i5 = ((iM2761 ^ i3) * 10049) ^ 657063859;
                            i = 622038409;
                        } else {
                            iM2761 = C0773.m3169("ܺ֨") ^ i4;
                            i5 = ((iM2761 ^ i3) * 12741) ^ (-1579978734);
                            i = 1553164178;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case -340108859:
                    case 1593502998:
                        if (C1826.f6190 <= 0) {
                            iM2761 = C0619.m2761("᩺֡") ^ i3;
                            i5 = ((iM2761 ^ i4) * 3943) ^ (-302165897);
                            i = 1680979168;
                        } else {
                            iM2761 = C0773.m3169("ۖܺ") ^ i3;
                            i5 = ((iM2761 ^ i4) * 29095) ^ (-521756136);
                            i = -957822443;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case -331432422:
                    case 1733985127:
                        byte[] bArr = this.f48833;
                        if (C0269.f1558 > 0) {
                            int length = bArr.length;
                            int i8 = this.f48831;
                            if (C0487.f2131 > 0) {
                                byteArrayInputStream = new ByteArrayInputStream(bArr, i8, length - i8);
                                iM2761 = (C0773.m3169("ܺ᩷") + i4) * 123;
                                i5 = ((iM2761 ^ i3) * 27627) ^ (-1277680895);
                                i = 965681255;
                                i7 = iM2761 ^ i;
                            }
                        }
                        break;
                    case -212340738:
                    case 273854462:
                        if (C4282.f15546 <= 0) {
                            iM2761 = C0619.m2761("᩸ۜ") ^ i3;
                            i5 = ((iM2761 ^ i4) * 26583) ^ (-1002681215);
                            i = 834133536;
                        } else {
                            iM2761 = C0619.m2761("ۗܶ") ^ i4;
                            i5 = ((iM2761 ^ i3) * 313) ^ 141367546;
                            i = 1072614911;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case -164071342:
                    case 67836811:
                        if (C13473.f42873 != 0) {
                            iM2761 = C0773.m3169("ܺ֨") ^ i4;
                            i5 = ((iM2761 ^ i3) * 12741) ^ (-1579978734);
                            i = 1553164178;
                        } else {
                            iM2761 = C0619.m2761("᩺֡") ^ i3;
                            i5 = ((iM2761 ^ i4) * 3943) ^ (-302165897);
                            i = 1680979168;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case 184494933:
                    case 2080360263:
                        if (!C17202.f56030) {
                        }
                        iM2761 = C0619.m2761("ۡܿ") ^ i3;
                        i5 = ((iM2761 ^ i4) * 2753) ^ (-9088294);
                        i = 563512970;
                        i7 = iM2761 ^ i;
                        break;
                        break;
                    case 691978353:
                    case 992928558:
                        if (C1321.f4751 < 0) {
                            iM2761 = C0619.m2761("᩸ܶ") ^ i4;
                            i5 = ((iM2761 ^ i3) * (-9689)) ^ (-872801331);
                            i = 1990633400;
                            i7 = iM2761 ^ i;
                        }
                        break;
                    case 763936344:
                    case 1046169923:
                        if (C17202.f56030) {
                            iM2761 = C0773.m3169("ۤܽ") ^ i4;
                            i5 = ((iM2761 ^ i3) * 20663) ^ (-1310896148);
                            i = 2031927987;
                        } else {
                            iM2761 = C0773.m3169("᩷ۗ") ^ i4;
                            i5 = ((iM2761 ^ i3) * 10049) ^ 657063859;
                            i = 622038409;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    default:
                        throw new IOException(e);
                }
            }
            iM2762 = (i4 - C0773.m3169("ܽ᩹")) * 25;
            i5 = ((iM2762 ^ i3) * 31181) ^ 1695787900;
            i6 = 1837735243;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m35990() {
        return this.f48829;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m35994(C21246 c21246) {
        m35981(c21246);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 135181. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m35981(l.C21246 r89) {
        /*
            Method dump skipped, instruction units count: 13518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14955.m35981(l.᩶ۤۤ):void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35976(StringBuilder sb, int i) {
        int i2 = 0;
        int i3 = -281220253;
        int i4 = C3033.f9831;
        int i5 = RunnableC0334.f1808;
        int iM2761 = (i4 - C0619.m2761("ܶۨ")) * 91;
        int i6 = ((iM2761 ^ i5) * (-16959)) ^ (-813769164);
        int i7 = -609748967;
        while (true) {
            i3 = ((((i3 ^ i5) * 24437) >> 31) & i6) ^ (iM2761 ^ i7);
            switch (i3) {
                case -2132478855:
                case 910438430:
                    if (i2 < i) {
                        iM2761 = (C0619.m2761("۠ۙ") + i5) * 9;
                        i6 = ((iM2761 ^ i4) * (-22573)) ^ (-1737107914);
                        i7 = -963463550;
                    } else {
                        iM2761 = C0773.m3169("۬ۘ") ^ i4;
                        i6 = ((iM2761 ^ i5) * 6363) ^ 1577748645;
                        i7 = 1157872609;
                    }
                    break;
                case -1969958445:
                case -1081407088:
                    if (C1343.f4799 != 0) {
                        iM2761 = (C0773.m3169("ۨ᩺") ^ i5) * (-41);
                        i6 = ((iM2761 ^ i4) * 32443) ^ 1498589080;
                        i7 = -402521318;
                    } else {
                        iM2761 = (i5 - C0773.m3169("ۨ۟")) * 87;
                        i6 = ((iM2761 ^ i4) * (-10463)) ^ 293324139;
                        i7 = 430148467;
                    }
                    break;
                case -1939558399:
                case 826857682:
                    if (C2878.m9491() <= 0) {
                        iM2761 = (i5 - C0773.m3169("ۨ۟")) * 87;
                        i6 = ((iM2761 ^ i4) * (-10463)) ^ 293324139;
                        i7 = 430148467;
                    } else {
                        iM2761 = (i4 - C0773.m3169("ۨۚ")) * (-47);
                        i6 = ((iM2761 ^ i5) * (-22559)) ^ 1638142155;
                        i7 = 2042229764;
                    }
                    break;
                case -1895305156:
                case 1524520160:
                    C3033.m9845();
                    if (C1080.f3865 < 0) {
                        iM2761 = (i5 - C0773.m3169("ۨ۟")) * 87;
                        i6 = ((iM2761 ^ i4) * (-10463)) ^ 293324139;
                        i7 = 430148467;
                    } else {
                        iM2761 = C0773.m3169("۬ۛ") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-2239)) ^ 1015289847;
                        i7 = -238472323;
                    }
                    break;
                case -1723254031:
                case -407387998:
                    if (C0950.f3488 >= 0) {
                        iM2761 = C0773.m3169("۬ۛ") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-2239)) ^ 1015289847;
                        i7 = -238472323;
                    } else {
                        iM2761 = (i4 - C0773.m3169("۬۫")) * (-95);
                        i6 = ((iM2761 ^ i5) * 2939) ^ 750537811;
                        i7 = -1487550175;
                    }
                    break;
                case -1572789087:
                case 1995952006:
                    if (C0269.f1558 <= 0) {
                        iM2761 = C0773.m3169("۬ۛ") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-2239)) ^ 1015289847;
                        i7 = -238472323;
                    } else {
                        iM2761 = (C0773.m3169("۫᩶") ^ i4) * 119;
                        i6 = ((iM2761 ^ i5) * 6359) ^ 176708350;
                        i7 = 1076666840;
                    }
                    break;
                case -1538448705:
                case -1501617804:
                    if (C2375.m8065() <= 0) {
                        iM2761 = (C0773.m3169("ܳ֫") ^ i4) * 53;
                        i6 = ((iM2761 ^ i5) * 25353) ^ (-1677529666);
                        i7 = 572627785;
                    } else {
                        iM2761 = C0773.m3169("ۧܽ") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-17019)) ^ 1492097336;
                        i7 = 1128852607;
                    }
                    break;
                case -1428208345:
                case -295431631:
                    break;
                case -1086896503:
                case 248125127:
                    if (C1564.m5509() <= 0) {
                        iM2761 = (C0773.m3169("ܳ֫") ^ i4) * 53;
                        i6 = ((iM2761 ^ i5) * 25353) ^ (-1677529666);
                        i7 = 572627785;
                    } else {
                        iM2761 = C0773.m3169("֫ܶ") ^ i4;
                        i6 = ((iM2761 ^ i5) * 25677) ^ 1631816314;
                        i7 = -507810992;
                    }
                    break;
                case -643868614:
                case 626329482:
                    C2023.m6955(sb, ' ');
                    if (C20932.f66974 <= 0) {
                        iM2761 = (C0773.m3169("ܳ֫") ^ i4) * 53;
                        i6 = ((iM2761 ^ i5) * 25353) ^ (-1677529666);
                        i7 = 572627785;
                    } else {
                        iM2761 = C0773.m3169("ܶۜ") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-15995)) ^ 1457105146;
                        i7 = 1854406423;
                    }
                    break;
                case -625773883:
                case 504745400:
                    C20932.m47848();
                    break;
                case -466631566:
                case 1515653915:
                    C3998.m12920();
                    C20932.m47848();
                    iM2761 = C0773.m3169("۬ۛ") ^ i4;
                    i6 = ((iM2761 ^ i5) * (-2239)) ^ 1015289847;
                    i7 = -238472323;
                    break;
                case -355555875:
                case 241696273:
                    if (C13473.m33144()) {
                        iM2761 = C0619.m2761("ܰܰ") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-26411)) ^ 1262579961;
                        i7 = -1408967782;
                    } else {
                        iM2761 = C0773.m3169("۬ۛ") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-2239)) ^ 1015289847;
                        i7 = -238472323;
                    }
                    break;
                case 132555979:
                case 1530455998:
                    i2++;
                    iM2761 = C0619.m2761("ܰۚ") ^ i5;
                    i6 = ((iM2761 ^ i4) * 16527) ^ 2097201094;
                    i7 = 66792315;
                    break;
                case 167825749:
                case 1526021930:
                    if (C0862.m3503()) {
                        iM2761 = C0773.m3169("ۤ֨") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-29229)) ^ (-1428966910);
                        i7 = 1347847960;
                    } else {
                        iM2761 = (C0773.m3169("ܳ֫") ^ i4) * 53;
                        i6 = ((iM2761 ^ i5) * 25353) ^ (-1677529666);
                        i7 = 572627785;
                    }
                    break;
                case 339936793:
                case 1085355120:
                    if (C3779.m12264()) {
                        iM2761 = C0619.m2761("ۚ֨") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-16527)) ^ 1122375920;
                        i7 = 1267850011;
                    } else {
                        iM2761 = (C0773.m3169("ۨ᩺") ^ i5) * (-41);
                        i6 = ((iM2761 ^ i4) * 32443) ^ 1498589080;
                        i7 = -402521318;
                    }
                    break;
                case 1138236976:
                case 1828064704:
                    i2 = 0;
                    iM2761 = C0619.m2761("ܰۚ") ^ i5;
                    i6 = ((iM2761 ^ i4) * 16527) ^ 2097201094;
                    i7 = 66792315;
                    break;
                case 1290218146:
                case 1709810323:
                    if (C1783.f6087 <= 0) {
                        iM2761 = (C0773.m3169("ۨ᩺") ^ i5) * (-41);
                        i6 = ((iM2761 ^ i4) * 32443) ^ 1498589080;
                        i7 = -402521318;
                    } else {
                        iM2761 = C0619.m2761("۠ᩳ") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-13119)) ^ 714948895;
                        i7 = 1963861292;
                    }
                    break;
                default:
                    if (C2287.f7432 >= 0) {
                        iM2761 = C0773.m3169("۬ۛ") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-2239)) ^ 1015289847;
                        i7 = -238472323;
                    } else {
                        iM2761 = C0773.m3169("ܶ۬") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-9543)) ^ (-1492283659);
                        i7 = 997527166;
                    }
                    break;
            }
            return;
        }
    }

    static {
        ApplicationC23172.m52091(118);
        f48826 = new short[]{2614, -20152, -20169, -20140, -20100, -20140, -20122, -20178, -20181, -20178, -20103, -20099, -20121, -20100, -20173, -20178, -20119, -20123, -20104, -20173, -20178, -20124, -20100, -20173, -20178, -20113, -20100, -20173, -20140, -20140, -20173, 263, 19929, 4396, 11352, 11353, 11354, 11355, 11356, 11357, 11358, 11359, 11344, 11345, 11273, 11274, 11275, 11276, 11277, 11278, 11352, 11353, 11354, 11355, 11356, 11357, 11358, 11359, 11344, 11345, 11305, 11306, 11307, 11308, 11309, 11310, 11280, 11269, 11268, 11270, 11291, 11346, 11352, 11280, 11308, 11277, 11288, 11290, 11277, 11275, 11273, 11292, 11277, 11276, 11336, 11335, 11350, 11362, 11348, 11335, 11292, 11290, 11293, 11277, 11277, 11290, 11290, 11271, 11290, 11278, 11273, 11268, 11291, 11277, 11339, 11342, 11339, 11342, 11273, 11269, 11288, 11347, 11342, 11268, 11292, 11347, 11342, 11279, 11292, 11347, 11347, 1133, 12796, 12768, 12768, 12772, 12718, 12731, 12731, 12775, 12791, 12796, 12785, 12793, 12789, 12775, 12730, 12789, 12794, 12784, 12774, 12795, 12797, 12784, 12730, 12791, 12795, 12793, 12731, 12789, 12772, 12799, 12731, 12789, 12772, 12772, 12789, 12794, 12784, 12774, 12795, 12797, 12784, 12796, 12768, 12768, 12772, 12718, 12731, 12731, 12775, 12791, 12796, 12785, 12793, 12789, 12775, 12730, 12789, 12794, 12784, 12774, 12795, 12797, 12784, 12730, 12791, 12795, 12793, 12731, 12789, 12772, 12799, 12731, 12774, 12785, 12775, 12731, 12789, 12794, 12784, 12774, 12795, 12797, 12784, 12796, 12768, 12768, 12772, 12718, 12731, 12731, 12775, 12791, 12796, 12785, 12793, 12789, 12775, 12730, 12789, 12794, 12784, 12774, 12795, 12797, 12784, 12730, 12791, 12795, 12793, 12731, 12789, 12772, 12799, 12731, 12772, 12774, 12770, 12731, 12774, 12785, 12775, 12731, 12789, 12794, 12784, 12774, 12795, 12797, 12784, 12796, 12768, 12768, 12772, 12718, 12731, 12731, 12775, 12791, 12796, 12785, 12793, 12789, 12775, 12730, 12789, 12794, 12784, 12774, 12795, 12797, 12784, 12730, 12791, 12795, 12793, 12731, 12789, 12772, 12799, 12731, 12784, 12797, 12775, 12768, 12774, 12797, 12790, 12769, 12768, 12797, 12795, 12794, 12791, 12769, 12775, 12768, 12795, 12793, 12789, 12794, 12784, 12774, 12795, 12797, 12784, 12772, 12774, 12770, 12784, 12797, 12775, 12768, 12797, 12784, 12708, 12709, 12710, 12711, 12704, 12705, 12706, 12707, 12716, 12717, 12789, 12790, 12791, 12784, 12785, 12786, 12796, 12768, 12768, 12772, 12718, 12731, 12731, 12775, 12791, 12796, 12785, 12793, 12789, 12775, 12730, 12789, 12794, 12784, 12774, 12795, 12797, 12784, 12730, 12791, 12795, 12793, 12731, 12789, 12772, 12799, 12731, 12774, 12785, 12775, 12729, 12789, 12769, 12768, 12795, 4319, 2869, -11324, 8508, 5395, 22520, 31804, 28751, 4731, -24662, 27913, -25672, 7956, -1912, 11276, -6478};
        f48825 = new C5765();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String m35993() {
        return this.f48828;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0128 A[PHI: r3
      0x0128: PHI (r3v5 boolean) = (r3v4 boolean), (r3v2 boolean), (r3v2 boolean), (r3v2 boolean) binds: [B:45:0x0126, B:19:0x0064, B:17:0x0060, B:14:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x017b A[PHI: r2 r4 r5 r6 r7
      0x017b: PHI (r2v4 short) = (r2v3 short), (r2v2 short), (r2v2 short), (r2v2 short) binds: [B:53:0x0179, B:41:0x0107, B:37:0x00e9, B:29:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x017b: PHI (r4v4 l.ۗۧܺ) = (r4v2 l.ۗۧܺ), (r4v3 l.ۗۧܺ), (r4v2 l.ۗۧܺ), (r4v2 l.ۗۧܺ) binds: [B:53:0x0179, B:41:0x0107, B:37:0x00e9, B:29:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x017b: PHI (r5v4 l.ۨᩴۤ) = (r5v2 l.ۨᩴۤ), (r5v3 l.ۨᩴۤ), (r5v2 l.ۨᩴۤ), (r5v2 l.ۨᩴۤ) binds: [B:53:0x0179, B:41:0x0107, B:37:0x00e9, B:29:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x017b: PHI (r6v4 byte[]) = (r6v2 byte[]), (r6v2 byte[]), (r6v3 byte[]), (r6v2 byte[]) binds: [B:53:0x0179, B:41:0x0107, B:37:0x00e9, B:29:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x017b: PHI (r7v4 int) = (r7v2 int), (r7v2 int), (r7v3 int), (r7v2 int) binds: [B:53:0x0179, B:41:0x0107, B:37:0x00e9, B:29:0x00a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x01c3 A[PHI: r8 r9 r15
      0x01c3: PHI (r8v5 int) = (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int), (r8v2 int), (r8v2 int) binds: [B:49:0x015e, B:33:0x00c6, B:25:0x0083, B:17:0x0060, B:10:0x003d, B:58:0x01c1] A[DONT_GENERATE, DONT_INLINE]
      0x01c3: PHI (r9v5 int) = (r9v2 int), (r9v2 int), (r9v3 int), (r9v2 int), (r9v2 int), (r9v2 int) binds: [B:49:0x015e, B:33:0x00c6, B:25:0x0083, B:17:0x0060, B:10:0x003d, B:58:0x01c1] A[DONT_GENERATE, DONT_INLINE]
      0x01c3: PHI (r15v8 l.ۛۚۤ) = (r15v4 l.ۛۚۤ), (r15v4 l.ۛۚۤ), (r15v4 l.ۛۚۤ), (r15v4 l.ۛۚۤ), (r15v4 l.ۛۚۤ), (r15v9 l.ۛۚۤ) binds: [B:49:0x015e, B:33:0x00c6, B:25:0x0083, B:17:0x0060, B:10:0x003d, B:58:0x01c1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m35988() {
        int iM3169;
        int i;
        short s = 0;
        boolean z = false;
        C3374 c3374 = null;
        C12558 c12558 = null;
        byte[] bArr = null;
        int length = 0;
        int i2 = 0;
        int size = 0;
        int i3 = -542959212;
        int i4 = C3690.f12684;
        int i5 = C3448.f11240;
        int iM31610 = C0773.m3169("֡ۚ") ^ i5;
        int i6 = ((iM31610 ^ i4) * 22491) ^ (-999566228);
        int i7 = -2059996609;
        while (true) {
            int i8 = iM31610 ^ i7;
            C6178 c6178 = null;
            while (true) {
                i3 = ((((i3 ^ i4) * 2499) >> 31) & i6) ^ i8;
                switch (i3) {
                    case -2110617081:
                    case 1073551336:
                        c6178.seek(4L);
                        size = c6178.size();
                        if (C20932.m47848() != 0) {
                            iM3169 = (C0773.m3169("ۗۙ") ^ i4) * (-91);
                            i6 = ((iM3169 ^ i5) * (-8029)) ^ 448599800;
                            i = -934413325;
                        } else {
                            iM3169 = (C0619.m2761("ۡ۫") + i4) * (-9);
                            i6 = ((iM3169 ^ i5) * 4111) ^ (-866929453);
                            i = 1581216824;
                        }
                        i8 = iM3169 ^ i;
                        break;
                    case -2106507175:
                    case -21652018:
                        if (C1343.f4799 == 0) {
                            iM3169 = (C0773.m3169("۫ۢ") ^ i5) * (-83);
                            i6 = ((iM3169 ^ i4) * 8697) ^ 1393823087;
                            i = 1084547863;
                        } else {
                            iM3169 = (C0773.m3169("ۗۙ") ^ i4) * (-91);
                            i6 = ((iM3169 ^ i5) * (-8029)) ^ 448599800;
                            i = -934413325;
                        }
                        i8 = iM3169 ^ i;
                        break;
                    case -1852252485:
                    case -363600597:
                        c6178.mo17788(s);
                        c6178.mo17788((short) 8);
                        if (C3099.f10023 <= 0) {
                            iM3169 = (C0773.m3169("ۗۙ") ^ i4) * (-91);
                            i6 = ((iM3169 ^ i5) * (-8029)) ^ 448599800;
                            i = -934413325;
                        } else {
                            iM3169 = C0773.m3169("ۙ۟") ^ i4;
                            i6 = ((iM3169 ^ i5) * (-18191)) ^ 1466169471;
                            i = 1836741981;
                        }
                        i8 = iM3169 ^ i;
                        break;
                    case -1756003810:
                    case 2126474061:
                        C20932.m47860(c6178, size);
                        return c6178.m17796();
                    case -1429325507:
                    case -497610242:
                        s = 3;
                        if (C3492.f12043 <= 0) {
                            iM3169 = (i5 - C0619.m2761("ܰᩴ")) * 77;
                            i6 = ((iM3169 ^ i4) * (-14149)) ^ (-1929516976);
                            i = -2108187889;
                        } else {
                            iM3169 = (C0773.m3169("ۧۖ") + i5) * (-101);
                            i6 = ((iM3169 ^ i4) * 12857) ^ (-208631761);
                            i = -1329425924;
                        }
                        i8 = iM3169 ^ i;
                        break;
                    case -1237332125:
                    case 1528237448:
                        c6178.write(bArr, i2, length - i2);
                        if (C1080.m4050()) {
                            iM3169 = (C0619.m2761("ܺۧ") + i4) * 59;
                            i6 = ((iM3169 ^ i5) * 11517) ^ (-1256122278);
                            i = 7848888;
                        } else {
                            iM3169 = (i5 - C0619.m2761("ܰᩴ")) * 77;
                            i6 = ((iM3169 ^ i4) * (-14149)) ^ (-1929516976);
                            i = -2108187889;
                        }
                        i8 = iM3169 ^ i;
                        break;
                    case -1179511901:
                    case -320714671:
                        i2 = this.f48831;
                        if (C3734.f12817 >= 0) {
                            iM3169 = (C0773.m3169("ۗۙ") ^ i4) * (-91);
                            i6 = ((iM3169 ^ i5) * (-8029)) ^ 448599800;
                            i = -934413325;
                        } else {
                            iM3169 = (C0773.m3169("ܰۜ") ^ i5) * 5;
                            i6 = ((iM3169 ^ i4) * (-18293)) ^ (-1359465875);
                            i = 1062302289;
                        }
                        i8 = iM3169 ^ i;
                        break;
                    case -1040658048:
                    case -578717491:
                        c12558.m31249(c6178, z, c3374);
                        bArr = this.f48833;
                        length = bArr.length;
                        if (C3492.f12043 <= 0) {
                            iM3169 = (i5 - C0619.m2761("ܰᩴ")) * 77;
                            i6 = ((iM3169 ^ i4) * (-14149)) ^ (-1929516976);
                            i = -2108187889;
                        } else {
                            iM3169 = C0619.m2761("ܰ۫") ^ i5;
                            i6 = ((iM3169 ^ i4) * (-28329)) ^ 502285449;
                            i = 1375423166;
                        }
                        i8 = iM3169 ^ i;
                        break;
                    case -828010620:
                    case 1401548571:
                        c6178.skipBytes(4);
                        z = true;
                        if (C3077.f9998) {
                            iM3169 = C0619.m2761("۬ۧ") ^ i5;
                            i6 = ((iM3169 ^ i4) * 4689) ^ 1727448974;
                            i = -915179266;
                        } else {
                            iM3169 = (C0773.m3169("۫ۢ") ^ i5) * (-83);
                            i6 = ((iM3169 ^ i4) * 8697) ^ 1393823087;
                            i = 1084547863;
                        }
                        i8 = iM3169 ^ i;
                        break;
                    case -703837328:
                    case -258875958:
                        C13473.m33144();
                        return null;
                    case -605667621:
                    case 1605721973:
                        C2023.m6964();
                        if (C0619.f2439) {
                            iM3169 = (C0619.m2761("ܳۜ") ^ i4) * 87;
                            i6 = ((iM3169 ^ i5) * (-4337)) ^ (-2023906859);
                            i = 1319395300;
                        } else {
                            iM3169 = (C0773.m3169("ۗۙ") ^ i4) * (-91);
                            i6 = ((iM3169 ^ i5) * (-8029)) ^ 448599800;
                            i = -934413325;
                        }
                        i8 = iM3169 ^ i;
                        break;
                    case -589523687:
                    case 711572299:
                        if (AbstractC0116.f1064 > 0) {
                        }
                        iM3169 = (C0773.m3169("۫ۢ") ^ i5) * (-83);
                        i6 = ((iM3169 ^ i4) * 8697) ^ 1393823087;
                        i = 1084547863;
                        i8 = iM3169 ^ i;
                        break;
                    case 557455651:
                    case 1090354016:
                        c3374 = null;
                        c12558 = this.f48832;
                        if (C13473.f42873 != 0) {
                            iM3169 = (i5 - C0619.m2761("ܰᩴ")) * 77;
                            i6 = ((iM3169 ^ i4) * (-14149)) ^ (-1929516976);
                            i = -2108187889;
                        } else {
                            iM3169 = C0619.m2761("ۢۘ") ^ i4;
                            i6 = ((iM3169 ^ i5) * 27705) ^ 1237018429;
                            i = -16036650;
                        }
                        i8 = iM3169 ^ i;
                        break;
                    case 1462387513:
                    case 1814562053:
                        C2023.m6964();
                        iM3169 = (C0773.m3169("۫ۢ") ^ i5) * (-83);
                        i6 = ((iM3169 ^ i4) * 8697) ^ 1393823087;
                        i = 1084547863;
                        i8 = iM3169 ^ i;
                        break;
                    default:
                        if (C2419.f7754 < 0) {
                            c6178 = new C6178();
                            if (C2834.f9334 <= 0) {
                                iM3169 = (C0773.m3169("ۗۙ") ^ i4) * (-91);
                                i6 = ((iM3169 ^ i5) * (-8029)) ^ 448599800;
                                i = -934413325;
                            } else {
                                iM3169 = C0619.m2761("ۙܶ") ^ i4;
                                i6 = ((iM3169 ^ i5) * 2665) ^ 524556400;
                                i = -593196061;
                            }
                            i8 = iM3169 ^ i;
                        }
                        break;
                }
            }
            iM31610 = C0619.m2761("ۧ᩻") ^ i5;
            i6 = ((iM31610 ^ i4) * 3885) ^ (-649786403);
            i7 = 385667356;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final byte[] m35996() {
        return this.f48833;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35987(byte[] bArr) {
        this.f48833 = bArr;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m35997() {
        return this.f48831;
    }
}
