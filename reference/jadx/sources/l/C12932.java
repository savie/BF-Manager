package l;

import android.R;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import java.io.IOException;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.math.ec.rfc8032.Scalar25519;

/* JADX INFO: renamed from: l.۫ۜۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 79RC */
/* JADX INFO: loaded from: classes4.dex */
public final class C12932 {

    /* JADX INFO: renamed from: ۗᩴۛ, reason: not valid java name and contains not printable characters */
    private static final short[] f41425 = {7964, 19771, 19769, 19758, 19763, 19756, 19763, 19758, 19747, 19754, 19752, 19765, 19756, 19763, 19774, 19775, 19752, 19752, 19775, 19769, 19775, 19763, 19756, 19775, 19752, 19771, 19769, 19758, 19763, 19756, 19763, 19758, 19747, 19831, 19771, 19766, 19763, 19771, 19753, 19771, 19754, 19754, 19766, 19763, 19769, 19771, 19758, 19763, 19765, 19764, 19771, 19754, 19754, 19757, 19763, 19774, 19773, 19775, 19758, 19831, 19754, 19752, 19765, 19756, 19763, 19774, 19775, 19752, 19753, 19775, 19752, 19756, 19763, 19769, 19775, 19771, 19764, 19774, 19752, 19765, 19763, 19774, 19808, 19769, 19765, 19764, 19753, 19758, 19752, 19771, 19763, 19764, 19758, 19717, 19752, 19775, 19772, 19775, 19752, 19775, 19764, 19769, 19775, 19774, 19717, 19763, 19774, 19753, 19766, 19771, 19747, 19765, 19759, 19758, 19717, 19769, 19765, 19764, 19753, 19758, 19752, 19771, 19763, 19764, 19758, 19742, 19763, 19767, 19775, 19764, 19753, 19763, 19765, 19764, 19720, 19771, 19758, 19763, 19765, 19766, 19771, 19768, 19775, 19766, 19766, 19771, 19747, 19765, 19759, 19758, 19735, 19771, 19764, 19771, 19773, 19775, 19752, 19758, 19763, 19758, 19766, 19775, 19737, 19766, 19771, 19753, 19753, 19764, 19771, 19767, 19775, 19713, 19771, 19831, 19744, 19719, 19825, 19826, 19718, 19828, 19713, 19771, 19831, 19744, 19719, 19825, 19827, 19825, 19718, 19828, 19713, 19718, 19757, 19838, 19719, 19825, 19758, 19775, 19746, 19758, 19753, 19775, 19754, 19771, 19752, 19771, 19758, 19765, 19752, 19771, 19754, 19754, 19808, 19774, 19775, 19753, 19769, 19752, 19763, 19754, 19758, 19763, 19765, 19764, 19762, 19763, 19764, 19758, 19753, 19759, 19767, 19767, 19771, 19752, 19747, 19769, 19765, 19767, 19767, 19775, 19764, 19758, 19761, 19775, 19747, 19756, 19771, 19766, 19759, 19775, 19754, 19771, 19758, 19762, 19753, 19759, 19768, 19760, 19775, 19769, 19758};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public List f41426;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C14955 f41427;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f41428;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m32319() {
        return this.f41428;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List m32321() {
        return this.f41426;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C14955 m32320() {
        return this.f41427;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0105 A[PHI: r8 r9
      0x0105: PHI (r8v3 l.᩵ܺۗ) = (r8v1 l.᩵ܺۗ), (r8v2 l.᩵ܺۗ), (r8v1 l.᩵ܺۗ), (r8v1 l.᩵ܺۗ) binds: [B:100:0x0105, B:38:0x0103, B:19:0x0087, B:13:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x0105: PHI (r9v3 l.ۚܺۗ) = (r9v1 l.ۚܺۗ), (r9v2 l.ۚܺۗ), (r9v1 l.ۚܺۗ), (r9v1 l.ۚܺۗ) binds: [B:100:0x0105, B:38:0x0103, B:19:0x0087, B:13:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x02c8 A[PHI: r2 r6
      0x02c8: PHI (r2v3 l.۫ۜۤ) = (r2v1 l.۫ۜۤ), (r2v2 l.۫ۜۤ), (r2v1 l.۫ۜۤ), (r2v1 l.۫ۜۤ) binds: [B:77:0x02c6, B:65:0x022c, B:49:0x016a, B:13:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x02c8: PHI (r6v3 l.᩵ܺۗ) = (r6v1 l.᩵ܺۗ), (r6v1 l.᩵ܺۗ), (r6v2 l.᩵ܺۗ), (r6v1 l.᩵ܺۗ) binds: [B:77:0x02c6, B:65:0x022c, B:49:0x016a, B:13:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:82:0x02f4  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12932 m32317(String str, byte[] bArr) {
        int iM2761;
        int i;
        int i2;
        C14955 c14955M35982 = null;
        C12932 c12932 = null;
        C22311 c22311 = null;
        XmlResourceParserC9734 xmlResourceParserC9734M35991 = null;
        int next = 0;
        InterfaceC20670 interfaceC20670M12145 = null;
        InterfaceC20670 interfaceC20670Filter = null;
        InterfaceC5754 list = null;
        Object objCollect = null;
        List list2 = null;
        int i3 = 682049269;
        int i4 = C11235.f35427;
        int i5 = C3448.f11240;
        int iM3169 = (i4 - C0773.m3169("ܿۨ")) * (-53);
        int i6 = ((iM3169 ^ i5) * (-18927)) ^ 989457629;
        int i7 = iM3169 ^ 867484769;
        C24715 c24715 = null;
        C12932 c12933 = null;
        while (true) {
            i3 = i7 ^ (i6 & (((i3 ^ i5) * 3299) >> 31));
            switch (i3) {
                case -1985571589:
                case 944617927:
                    c12933 = null;
                    iM2761 = C0773.m3169("ۚ֨") ^ i4;
                    i = ((iM2761 ^ i5) * (-10001)) ^ (-834329240);
                    i2 = -1612403410;
                    int i8 = i;
                    i7 = iM2761 ^ i2;
                    i6 = i8;
                    break;
                case -1928528266:
                case 53895153:
                    next = xmlResourceParserC9734M35991.next();
                    iM2761 = (C0773.m3169("۫ܺ") + i4) * 97;
                    i = ((iM2761 ^ i5) * (-10283)) ^ 1074015564;
                    i2 = -1703257997;
                    int i9 = i;
                    i7 = iM2761 ^ i2;
                    i6 = i9;
                    break;
                case -1771566288:
                case 464124756:
                    c12932 = new C12932();
                    if (C1519.f5300 >= 0) {
                        iM2761 = C0773.m3169("᩷۫") ^ i5;
                        i = ((iM2761 ^ i4) * 31671) ^ (-1681107749);
                        i2 = -2021939945;
                    } else {
                        iM2761 = (i5 - C0773.m3169("ۘܳ")) * (-101);
                        i = ((iM2761 ^ i4) * 11375) ^ (-1098069832);
                        i2 = 1116043904;
                    }
                    int i10 = i;
                    i7 = iM2761 ^ i2;
                    i6 = i10;
                    break;
                case -1588498946:
                case 440922760:
                    return c12933;
                case -1527805288:
                case 1747239946:
                    if (AbstractC0641.f2496 >= 0) {
                        iM2761 = C0773.m3169("ۡᩴ") ^ i4;
                        i = ((iM2761 ^ i5) * (-3025)) ^ 1620094130;
                        i2 = -920177491;
                    } else {
                        iM2761 = C0619.m2761("ᩳܽ") ^ i4;
                        i = ((iM2761 ^ i5) * (-26251)) ^ (-2079938980);
                        i2 = -325443593;
                    }
                    int i11 = i;
                    i7 = iM2761 ^ i2;
                    i6 = i11;
                    break;
                case -1526268065:
                case -338350558:
                    interfaceC20670Filter = interfaceC20670M12145.filter(c24715);
                    list = C2025.toList();
                    if (C0619.m2763()) {
                        iM2761 = (i4 - C0773.m3169("᩺֡")) * (-73);
                        i = ((iM2761 ^ i5) * (-14453)) ^ (-403287215);
                        i2 = -224920465;
                    } else {
                        iM2761 = (i4 - C0773.m3169("ۜ۫")) * (-9);
                        i = ((iM2761 ^ i5) * (-2849)) ^ (-1250261245);
                        i2 = 280056586;
                    }
                    int i12 = i;
                    i7 = iM2761 ^ i2;
                    i6 = i12;
                    break;
                case -1491308235:
                case 461567894:
                    xmlResourceParserC9734M35991 = c14955M35982.m35991();
                    iM2761 = (C0773.m3169("᩹۫") ^ i4) * (-33);
                    i = ((iM2761 ^ i5) * (-27895)) ^ 2114284603;
                    i2 = 332104075;
                    int i13 = i;
                    i7 = iM2761 ^ i2;
                    i6 = i13;
                    break;
                case -1446971929:
                case 1471806820:
                    list2 = (List) objCollect;
                    if (AbstractC3624.m11761(list2)) {
                        iM2761 = C0619.m2761("֫ۧ") ^ i5;
                        i = ((iM2761 ^ i4) * (-20945)) ^ 370987076;
                        i2 = 1226336196;
                    } else {
                        iM2761 = C0773.m3169("۟᩷") ^ i4;
                        i = ((iM2761 ^ i5) * 30295) ^ (-240965042);
                        i2 = -1304699780;
                    }
                    int i14 = i;
                    i7 = iM2761 ^ i2;
                    i6 = i14;
                    break;
                case -1181214029:
                case 2127044160:
                    return c12933;
                case -962414311:
                case 1735996849:
                    objCollect = interfaceC20670Filter.collect(list);
                    if (C1564.f5401 > 0) {
                        iM2761 = (i5 - C0773.m3169("᩺۠")) * 115;
                        i = ((iM2761 ^ i4) * 22741) ^ 2113989991;
                        i2 = 1183332;
                        int i15 = i;
                        i7 = iM2761 ^ i2;
                        i6 = i15;
                    } else {
                        int iM2762 = C0619.m2761("ۙ᩶") ^ i4;
                        i6 = ((iM2762 ^ i5) * (-13701)) ^ 401425499;
                        i7 = iM2762 ^ (-1270999604);
                    }
                    break;
                case -959409862:
                case 1852705610:
                    C3448.m11248();
                    if (C1564.m5509() > 0) {
                        iM2761 = (i4 - C0773.m3169("᩺֡")) * (-73);
                        i = ((iM2761 ^ i5) * (-14453)) ^ (-403287215);
                        i2 = -224920465;
                    } else {
                        iM2761 = C0773.m3169("᩷۫") ^ i5;
                        i = ((iM2761 ^ i4) * 31671) ^ (-1681107749);
                        i2 = -2021939945;
                    }
                    int i16 = i;
                    i7 = iM2761 ^ i2;
                    i6 = i16;
                    break;
                case -735441043:
                case 2121996169:
                    if (C1321.m4852()) {
                        iM2761 = C0619.m2761("ۤۙ") ^ i5;
                        i = ((iM2761 ^ i4) * 25759) ^ 1677593549;
                        i2 = -24233893;
                    } else {
                        iM2761 = C0773.m3169("᩷۫") ^ i5;
                        i = ((iM2761 ^ i4) * 31671) ^ (-1681107749);
                        i2 = -2021939945;
                    }
                    int i17 = i;
                    i7 = iM2761 ^ i2;
                    i6 = i17;
                    break;
                case -490858214:
                case -318965756:
                    C0487.m2356();
                    iM2761 = C0773.m3169("ۡᩴ") ^ i4;
                    i = ((iM2761 ^ i5) * (-3025)) ^ 1620094130;
                    i2 = -920177491;
                    int i18 = i;
                    i7 = iM2761 ^ i2;
                    i6 = i18;
                    break;
                case -119498101:
                case 652003365:
                    if (C3033.f9831 >= 0) {
                        iM2761 = C0773.m3169("ۡᩴ") ^ i4;
                        i = ((iM2761 ^ i5) * (-3025)) ^ 1620094130;
                        i2 = -920177491;
                    } else {
                        iM2761 = (i4 - C0619.m2761("ۢܰ")) * (-61);
                        i = ((iM2761 ^ i5) * (-8587)) ^ 1430915444;
                        i2 = 1847613848;
                    }
                    int i19 = i;
                    i7 = iM2761 ^ i2;
                    i6 = i19;
                    break;
                case -79727469:
                case 48155219:
                    interfaceC20670M12145 = C3734.m12145(c22311.values());
                    if (C2288.f7433 <= 0) {
                        iM2761 = C0773.m3169("᩷۫") ^ i5;
                        i = ((iM2761 ^ i4) * 31671) ^ (-1681107749);
                        i2 = -2021939945;
                    } else {
                        iM2761 = C0619.m2761("᩶ۜ") ^ i5;
                        i = ((iM2761 ^ i4) * 17809) ^ (-1838738396);
                        i2 = -1429467925;
                    }
                    int i110 = i;
                    i7 = iM2761 ^ i2;
                    i6 = i110;
                    break;
                case 63342424:
                case 218514548:
                    try {
                        c14955M35982 = C14955.m35982(bArr);
                        iM2761 = (C0619.m2761("ܳۜ") + i4) * 97;
                        i = ((iM2761 ^ i5) * 28039) ^ (-560480039);
                        i2 = 1046779661;
                    } catch (IOException unused) {
                        iM2761 = C0619.m2761("۫ۘ") ^ i5;
                        i = ((iM2761 ^ i4) * (-23885)) ^ 439926142;
                        i2 = -1769898069;
                    }
                    int i111 = i;
                    i7 = iM2761 ^ i2;
                    i6 = i111;
                    break;
                case 382163080:
                case 1748029340:
                    if (C3492.f12043 > 0) {
                        iM2761 = (C0619.m2761("۬ۖ") ^ i5) * (-51);
                        i = ((iM2761 ^ i4) * 6219) ^ (-1454083484);
                        i2 = -2127807077;
                        int i112 = i;
                        i7 = iM2761 ^ i2;
                        i6 = i112;
                    } else {
                        int iM31610 = (C0773.m3169("ۘۗ") ^ i5) * (-39);
                        i7 = (-255463196) ^ iM31610;
                        i6 = ((iM31610 ^ i4) * (-17155)) ^ 1906534754;
                        c24715 = null;
                    }
                    break;
                case 431646697:
                case 770647842:
                    c12932.f41428 = str;
                    if (C1564.m5509() > 0) {
                        iM2761 = (C0619.m2761("ۨۜ") + i4) * 123;
                        i = ((iM2761 ^ i5) * 10563) ^ 1240667463;
                        i2 = -1410377457;
                        int i113 = i;
                        i7 = iM2761 ^ i2;
                        i6 = i113;
                    } else {
                        int iM2763 = C0619.m2761("ۙ᩶") ^ i4;
                        i6 = ((iM2763 ^ i5) * (-13701)) ^ 401425499;
                        i7 = iM2763 ^ (-1270999604);
                    }
                    break;
                case 551092304:
                case 2143764728:
                    c12932.f41426 = list2;
                    c12932.f41427 = c14955M35982;
                    return c12932;
                case 569595626:
                case 955747223:
                    c22311 = new C22311();
                    iM2761 = C0619.m2761("ܽۖ") ^ i5;
                    i = ((iM2761 ^ i4) * (-521)) ^ (-440845186);
                    i2 = -204755959;
                    int i114 = i;
                    i7 = iM2761 ^ i2;
                    i6 = i114;
                    break;
                case 581570395:
                case 1116113771:
                    if (C2485.f7950 == 0) {
                        c24715 = new C24715(1);
                        if (C13473.f42873 == 0) {
                            iM2761 = (C0619.m2761("ۗۤ") ^ i4) * (-39);
                            i = ((iM2761 ^ i5) * 27845) ^ (-836233490);
                            i2 = 979934094;
                            int i115 = i;
                            i7 = iM2761 ^ i2;
                            i6 = i115;
                        } else {
                            int iM2764 = C0619.m2761("ۙ᩶") ^ i4;
                            i6 = ((iM2764 ^ i5) * (-13701)) ^ 401425499;
                            i7 = iM2764 ^ (-1270999604);
                        }
                    } else {
                        int iM31611 = (C0773.m3169("ۘۗ") ^ i5) * (-39);
                        i7 = (-255463196) ^ iM31611;
                        i6 = ((iM31611 ^ i4) * (-17155)) ^ 1906534754;
                        c24715 = null;
                    }
                    break;
                case 1059466573:
                case 1102365572:
                    try {
                        m32318(next, xmlResourceParserC9734M35991, c22311);
                        iM2761 = (C0773.m3169("᩹۫") ^ i4) * (-33);
                        i = ((iM2761 ^ i5) * (-27895)) ^ 2114284603;
                        i2 = 332104075;
                    } catch (Exception unused2) {
                        iM2761 = (i5 - C0773.m3169("ۚᩳ")) * q.h;
                        i = ((iM2761 ^ i4) * (-28925)) ^ (-1034202329);
                        i2 = -1867314806;
                    }
                    int i116 = i;
                    i7 = iM2761 ^ i2;
                    i6 = i116;
                    break;
                case 1202117399:
                case 1539696714:
                    C2375.m8065();
                    RunnableC1848.m6360();
                    return null;
                case 1234801300:
                case 1865491173:
                    if (!C3077.f9998) {
                        int iM31612 = (C0773.m3169("ۘۗ") ^ i5) * (-39);
                        i7 = (-255463196) ^ iM31612;
                        i6 = ((iM31612 ^ i4) * (-17155)) ^ 1906534754;
                        c24715 = null;
                    } else {
                        iM2761 = (i4 - C0773.m3169("᩺֡")) * (-73);
                        i = ((iM2761 ^ i5) * (-14453)) ^ (-403287215);
                        i2 = -224920465;
                        int i117 = i;
                        i7 = iM2761 ^ i2;
                        i6 = i117;
                    }
                    break;
                case 1813289109:
                case 2034028134:
                    C1146.m4231();
                    if (C0773.m3161() == 0) {
                        iM2761 = C0773.m3169("ۡᩴ") ^ i4;
                        i = ((iM2761 ^ i5) * (-3025)) ^ 1620094130;
                        i2 = -920177491;
                    } else {
                        iM2761 = (i4 - C0773.m3169("᩺֡")) * (-73);
                        i = ((iM2761 ^ i5) * (-14453)) ^ (-403287215);
                        i2 = -224920465;
                    }
                    int i118 = i;
                    i7 = iM2761 ^ i2;
                    i6 = i118;
                    break;
                default:
                    if (next != 1) {
                        iM2761 = (C0773.m3169("ᩳܿ") ^ i5) * 49;
                        i = ((iM2761 ^ i4) * 28769) ^ 416765879;
                        i2 = 938947310;
                    } else {
                        iM2761 = (i5 - C0773.m3169("ۚᩳ")) * q.h;
                        i = ((iM2761 ^ i4) * (-28925)) ^ (-1034202329);
                        i2 = -1867314806;
                    }
                    int i119 = i;
                    i7 = iM2761 ^ i2;
                    i6 = i119;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0567 A[PHI: r29
      0x0567: PHI (r29v112 l.ܳ֡᩹) = 
      (r29v64 l.ܳ֡᩹)
      (r29v65 l.ܳ֡᩹)
      (r29v71 l.ܳ֡᩹)
      (r29v73 l.ܳ֡᩹)
      (r29v74 l.ܳ֡᩹)
      (r29v78 l.ܳ֡᩹)
      (r29v79 l.ܳ֡᩹)
      (r29v82 l.ܳ֡᩹)
      (r29v88 l.ܳ֡᩹)
      (r29v90 l.ܳ֡᩹)
      (r29v113 l.ܳ֡᩹)
     binds: [B:108:0x0550, B:105:0x0535, B:91:0x049d, B:85:0x045a, B:82:0x0441, B:74:0x03e8, B:71:0x03c5, B:63:0x0351, B:46:0x0273, B:43:0x0265, B:9:0x00ba] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:123:0x061c A[PHI: r8 r15 r17 r29
      0x061c: PHI (r8v4 int) = (r8v3 int), (r8v2 int) binds: [B:121:0x0604, B:112:0x0582] A[DONT_GENERATE, DONT_INLINE]
      0x061c: PHI (r15v4 int) = (r15v3 int), (r15v2 int) binds: [B:121:0x0604, B:112:0x0582] A[DONT_GENERATE, DONT_INLINE]
      0x061c: PHI (r17v4 java.lang.Object) = (r17v3 java.lang.Object), (r17v2 java.lang.Object) binds: [B:121:0x0604, B:112:0x0582] A[DONT_GENERATE, DONT_INLINE]
      0x061c: PHI (r29v62 l.ܳ֡᩹) = (r29v60 l.ܳ֡᩹), (r29v63 l.ܳ֡᩹) binds: [B:121:0x0604, B:112:0x0582] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:216:0x0acd A[PHI: r5 r6 r9 r16 r19 r20 r23 r29
      0x0acd: PHI (r5v21 int) = (r5v16 int), (r5v22 int) binds: [B:214:0x0ab5, B:195:0x093f] A[DONT_GENERATE, DONT_INLINE]
      0x0acd: PHI (r6v20 int) = (r6v16 int), (r6v21 int) binds: [B:214:0x0ab5, B:195:0x093f] A[DONT_GENERATE, DONT_INLINE]
      0x0acd: PHI (r9v4 ??) = (r9v3 ??), (r9v23 ??) binds: [B:214:0x0ab5, B:195:0x093f] A[DONT_GENERATE, DONT_INLINE]
      0x0acd: PHI (r16v4 int) = (r16v3 int), (r16v2 int) binds: [B:214:0x0ab5, B:195:0x093f] A[DONT_GENERATE, DONT_INLINE]
      0x0acd: PHI (r19v4 java.lang.String) = (r19v3 java.lang.String), (r19v2 java.lang.String) binds: [B:214:0x0ab5, B:195:0x093f] A[DONT_GENERATE, DONT_INLINE]
      0x0acd: PHI (r20v22 java.lang.String) = (r20v10 java.lang.String), (r20v23 java.lang.String) binds: [B:214:0x0ab5, B:195:0x093f] A[DONT_GENERATE, DONT_INLINE]
      0x0acd: PHI (r23v15 java.lang.String) = (r23v10 java.lang.String), (r23v16 java.lang.String) binds: [B:214:0x0ab5, B:195:0x093f] A[DONT_GENERATE, DONT_INLINE]
      0x0acd: PHI (r29v22 java.lang.String) = (r29v17 java.lang.String), (r29v23 java.lang.String) binds: [B:214:0x0ab5, B:195:0x093f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x02e2 A[PHI: r11 r29
      0x02e2: PHI (r11v4 java.lang.String) = (r11v3 java.lang.String), (r11v2 java.lang.String) binds: [B:53:0x02cb, B:43:0x0265] A[DONT_GENERATE, DONT_INLINE]
      0x02e2: PHI (r29v89 l.ܳ֡᩹) = (r29v85 l.ܳ֡᩹), (r29v90 l.ܳ֡᩹) binds: [B:53:0x02cb, B:43:0x0265] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x0394 A[PHI: r10 r29
      0x0394: PHI (r10v4 java.lang.String) = 
      (r10v3 java.lang.String)
      (r10v2 java.lang.String)
      (r10v2 java.lang.String)
      (r10v2 java.lang.String)
      (r10v2 java.lang.String)
      (r10v2 java.lang.String)
      (r10v2 java.lang.String)
      (r10v2 java.lang.String)
      (r10v2 java.lang.String)
      (r10v2 java.lang.String)
      (r10v2 java.lang.String)
      (r10v2 java.lang.String)
      (r10v2 java.lang.String)
     binds: [B:66:0x037b, B:57:0x0308, B:49:0x0299, B:40:0x023e, B:34:0x01f6, B:30:0x01bc, B:27:0x0193, B:24:0x016b, B:21:0x0143, B:18:0x011b, B:15:0x00f3, B:12:0x00cd, B:9:0x00ba] A[DONT_GENERATE, DONT_INLINE]
      0x0394: PHI (r29v107 l.ܳ֡᩹) = 
      (r29v81 l.ܳ֡᩹)
      (r29v84 l.ܳ֡᩹)
      (r29v87 l.ܳ֡᩹)
      (r29v91 l.ܳ֡᩹)
      (r29v93 l.ܳ֡᩹)
      (r29v100 l.ܳ֡᩹)
      (r29v101 l.ܳ֡᩹)
      (r29v102 l.ܳ֡᩹)
      (r29v103 l.ܳ֡᩹)
      (r29v104 l.ܳ֡᩹)
      (r29v105 l.ܳ֡᩹)
      (r29v106 l.ܳ֡᩹)
      (r29v113 l.ܳ֡᩹)
     binds: [B:66:0x037b, B:57:0x0308, B:49:0x0299, B:40:0x023e, B:34:0x01f6, B:30:0x01bc, B:27:0x0193, B:24:0x016b, B:21:0x0143, B:18:0x011b, B:15:0x00f3, B:12:0x00cd, B:9:0x00ba] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to find 'out' block for switch in B:141:0x06e9. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m32318(int i, XmlResourceParserC9734 xmlResourceParserC9734, final C22311 c22311) {
        int iM3169;
        int i2;
        int i3;
        String str;
        int iM31610;
        int i4;
        int i5;
        int iM31611;
        int i6;
        int i7;
        ?? r9;
        int iM31612;
        int i8;
        int i9;
        int iM2761;
        int i10;
        InterfaceC14984 interfaceC14984;
        int iM31613;
        int i11;
        int i12;
        int iM31614;
        int i13;
        int i14;
        InterfaceC14984 interfaceC14985;
        XmlResourceParserC9734 xmlResourceParserC9735 = xmlResourceParserC9734;
        int i15 = 0;
        boolean z = false;
        int i16 = -1013097022;
        int i17 = C2354.f7599;
        int i18 = C2702.f8586;
        int iM2762 = (C0619.m2761("֡ܽ") ^ i17) * (-25);
        int i19 = ((iM2762 ^ i18) * 9327) ^ (-812142157);
        int i20 = iM2762 ^ (-226635096);
        C15169 c15169 = null;
        String attributeName = null;
        String strM4222 = null;
        String strM5463 = null;
        String attributeValue = null;
        InterfaceC14984 interfaceC14986 = null;
        int iM25345 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int attributeCount = 0;
        int i27 = 0;
        String prefix = null;
        String str2 = null;
        Object obj = null;
        ?? r10 = 0;
        Object obj2 = null;
        int i28 = 0;
        while (true) {
            i16 = i20 ^ (i19 & (((i16 ^ i18) * (-28757)) >> 31));
            switch (i16) {
                case -2094354760:
                case -424695884:
                    interfaceC14984 = interfaceC14986;
                    c15169.f49463.add(i24);
                    if (c15169.f49464 != null) {
                        interfaceC14986 = interfaceC14984;
                        i27 = i27;
                        attributeName = attributeName;
                        iM2761 = C0619.m2761("᩵۫") ^ i18;
                        i19 = ((iM2761 ^ i17) * (-12163)) ^ (-1293581859);
                        i10 = -1571663797;
                        i9 = iM2761 ^ i10;
                        i27 = i27;
                        String str3 = attributeName;
                        i20 = i9;
                        attributeName = str3;
                    } else {
                        iM31613 = (C0773.m3169("֫ᩳ") ^ i18) * 101;
                        i11 = ((iM31613 ^ i17) * 23749) ^ (-206947607);
                        i12 = 48739009;
                        interfaceC14985 = interfaceC14984;
                        i20 = iM31613 ^ i12;
                        i19 = i11;
                        interfaceC14986 = interfaceC14985;
                    }
                    break;
                case -2050123721:
                case 1889843047:
                    interfaceC14986.accept(xmlResourceParserC9734.m25340());
                    interfaceC14986.accept(xmlResourceParserC9734.m25343());
                    break;
                case -2023576884:
                case -144801400:
                    c15169.f49464 = attributeName;
                    i27 = i27;
                    attributeName = attributeName;
                    iM2761 = C0619.m2761("᩵۫") ^ i18;
                    i19 = ((iM2761 ^ i17) * (-12163)) ^ (-1293581859);
                    i10 = -1571663797;
                    i9 = iM2761 ^ i10;
                    i27 = i27;
                    String str4 = attributeName;
                    i20 = i9;
                    attributeName = str4;
                    break;
                case -1986281531:
                case -1516522408:
                    attributeName = attributeName;
                    i27 = i27;
                    String str5 = str2;
                    strM4222 = strM4222;
                    i25 = i25;
                    str = str5;
                    if (i != i27) {
                        iM31610 = (C0773.m3169("ܽܺ") + i17) * (-69);
                        i4 = ((iM31610 ^ i18) * 18199) ^ (-920139893);
                        i5 = -2090483268;
                        r10 = r10;
                    } else {
                        iM31610 = C0619.m2761("ۗ᩶") ^ i18;
                        i4 = ((iM31610 ^ i17) * (-2325)) ^ 1035870561;
                        i5 = 952811172;
                        r10 = r10;
                    }
                    int i29 = iM31610 ^ i5;
                    i19 = i4;
                    i27 = i27;
                    xmlResourceParserC9735 = xmlResourceParserC9734;
                    String str6 = attributeName;
                    i20 = i29;
                    attributeName = str6;
                    String str7 = str;
                    i25 = i25;
                    strM4222 = strM4222;
                    str2 = str7;
                    break;
                case -1986043371:
                case 471061517:
                    z = false;
                    iM2761 = (C0773.m3169("֨ۗ") + i17) * (-85);
                    i19 = ((iM2761 ^ i18) * 7545) ^ (-17464907);
                    i10 = 982742000;
                    i9 = iM2761 ^ i10;
                    i27 = i27;
                    String str8 = attributeName;
                    i20 = i9;
                    attributeName = str8;
                    break;
                case -1952093787:
                case 1687256355:
                    str = str2;
                    i21 = 58814;
                    iM31610 = C0619.m2761("ۤ۟") ^ i18;
                    i4 = ((iM31610 ^ i17) * 20983) ^ 321839444;
                    i5 = -406393429;
                    r10 = r10;
                    int i210 = iM31610 ^ i5;
                    i19 = i4;
                    i27 = i27;
                    xmlResourceParserC9735 = xmlResourceParserC9734;
                    String str9 = attributeName;
                    i20 = i210;
                    attributeName = str9;
                    String str10 = str;
                    i25 = i25;
                    strM4222 = strM4222;
                    str2 = str10;
                    break;
                case -1950562769:
                case 1288534785:
                    i26 = 3;
                    strM4222 = strM4222;
                    iM31612 = C0773.m3169("᩻֨") ^ i17;
                    i19 = ((iM31612 ^ i18) * (-12455)) ^ 1116684838;
                    i8 = 1370772100;
                    i9 = iM31612 ^ i8;
                    i27 = i27;
                    strM4222 = strM4222;
                    str2 = str2;
                    xmlResourceParserC9735 = xmlResourceParserC9734;
                    String str11 = attributeName;
                    i20 = i9;
                    attributeName = str11;
                    break;
                case -1946383152:
                case 714055446:
                    break;
                case -1852814939:
                case -1635264888:
                    c15169.f49464 = C25272.m56409(strM4222, attributeName);
                    i27 = i27;
                    attributeName = attributeName;
                    iM2761 = C0619.m2761("᩵۫") ^ i18;
                    i19 = ((iM2761 ^ i17) * (-12163)) ^ (-1293581859);
                    i10 = -1571663797;
                    i9 = iM2761 ^ i10;
                    i27 = i27;
                    String str12 = attributeName;
                    i20 = i9;
                    attributeName = str12;
                    break;
                case -1843994168:
                case 537564641:
                    interfaceC14984 = interfaceC14986;
                    if (C3448.m11238(strM5463, C1321.m4861(f41425, 157, 5, i21))) {
                        iM31613 = (C0619.m2761("۫ܳ") ^ i17) * (-99);
                        i11 = ((iM31613 ^ i18) * (-25731)) ^ 798418732;
                        i12 = 1108667771;
                    } else {
                        iM31613 = C0619.m2761("᩷ܰ") ^ i17;
                        i11 = ((iM31613 ^ i18) * 12227) ^ 469365672;
                        i12 = -1914038252;
                    }
                    interfaceC14985 = interfaceC14984;
                    i20 = iM31613 ^ i12;
                    i19 = i11;
                    interfaceC14986 = interfaceC14985;
                    break;
                case -1831378120:
                case 290725744:
                    attributeName = attributeName;
                    str2 = str2;
                    i27 = i27;
                    strM4222 = strM4222;
                    if (!C3492.m11490(str2, RunnableC3055.m9937(f41425, 1, 8, i21))) {
                        i25 = i25;
                        iM31610 = (i18 - C0619.m2761("ۨ᩵")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        str = str2;
                        i4 = ((iM31610 ^ i17) * (-201)) ^ 1114895588;
                        i5 = 1144476672;
                        r10 = r10;
                        int i211 = iM31610 ^ i5;
                        i19 = i4;
                        i27 = i27;
                        xmlResourceParserC9735 = xmlResourceParserC9734;
                        String str13 = attributeName;
                        i20 = i211;
                        attributeName = str13;
                        String str14 = str;
                        i25 = i25;
                        strM4222 = strM4222;
                        str2 = str14;
                    } else {
                        iM31612 = (i18 - C0773.m3169("ᩳۛ")) * 47;
                        i19 = ((iM31612 ^ i17) * (-22843)) ^ 847837008;
                        i8 = 1119117131;
                        i9 = iM31612 ^ i8;
                        i27 = i27;
                        strM4222 = strM4222;
                        str2 = str2;
                        xmlResourceParserC9735 = xmlResourceParserC9734;
                        String str15 = attributeName;
                        i20 = i9;
                        attributeName = str15;
                    }
                    break;
                case -1823060429:
                case -1135721719:
                    attributeName = attributeName;
                    str2 = str2;
                    i27 = i27;
                    strM4222 = strM4222;
                    if (!C3492.m11490(str2, C2419.m8166(f41425, 50, 18, i21))) {
                        i25 = i25;
                        iM31610 = (i18 - C0619.m2761("ۨ᩵")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        str = str2;
                        i4 = ((iM31610 ^ i17) * (-201)) ^ 1114895588;
                        i5 = 1144476672;
                        r10 = r10;
                        int i212 = iM31610 ^ i5;
                        i19 = i4;
                        i27 = i27;
                        xmlResourceParserC9735 = xmlResourceParserC9734;
                        String str16 = attributeName;
                        i20 = i212;
                        attributeName = str16;
                        String str17 = str;
                        i25 = i25;
                        strM4222 = strM4222;
                        str2 = str17;
                    } else {
                        iM31612 = (C0619.m2761("۫᩷") ^ i18) * (-35);
                        i19 = ((iM31612 ^ i17) * 25639) ^ 44852766;
                        i8 = 2064743864;
                        i9 = iM31612 ^ i8;
                        i27 = i27;
                        strM4222 = strM4222;
                        str2 = str2;
                        xmlResourceParserC9735 = xmlResourceParserC9734;
                        String str18 = attributeName;
                        i20 = i9;
                        attributeName = str18;
                    }
                    break;
                case -1802414401:
                case 1075900116:
                    interfaceC14984 = interfaceC14986;
                    strM5463 = C1542.m5463(attributeName);
                    if (C2834.m9345(strM5463, C2288.m7761(f41425, 139, 5, i21))) {
                        iM31613 = (C0619.m2761("۫ܳ") ^ i17) * (-99);
                        i11 = ((iM31613 ^ i18) * (-25731)) ^ 798418732;
                        i12 = 1108667771;
                    } else {
                        iM31613 = (i18 - C0619.m2761("ۚ֡")) * 19;
                        i11 = ((iM31613 ^ i17) * 31029) ^ (-1959061278);
                        i12 = 1075941774;
                    }
                    interfaceC14985 = interfaceC14984;
                    i20 = iM31613 ^ i12;
                    i19 = i11;
                    interfaceC14986 = interfaceC14985;
                    break;
                case -1766249217:
                case 550399770:
                    attributeName = attributeName;
                    i27 = i27;
                    str2 = str2;
                    if (!C2419.m8175(str2, C3492.m11486(f41425, 68, 7, i21))) {
                        strM4222 = strM4222;
                        i25 = i25;
                        iM31610 = (i18 - C0619.m2761("ۨ᩵")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        str = str2;
                        i4 = ((iM31610 ^ i17) * (-201)) ^ 1114895588;
                        i5 = 1144476672;
                        r10 = r10;
                        int i213 = iM31610 ^ i5;
                        i19 = i4;
                        i27 = i27;
                        xmlResourceParserC9735 = xmlResourceParserC9734;
                        String str19 = attributeName;
                        i20 = i213;
                        attributeName = str19;
                        String str110 = str;
                        i25 = i25;
                        strM4222 = strM4222;
                        str2 = str110;
                    } else {
                        int iM31615 = (i17 - C0773.m3169("۬ܶ")) * (-23);
                        i19 = ((iM31615 ^ i18) * 27399) ^ (-1776489770);
                        i9 = iM31615 ^ (-799565106);
                        str2 = str2;
                        i27 = i27;
                        xmlResourceParserC9735 = xmlResourceParserC9734;
                        String str111 = attributeName;
                        i20 = i9;
                        attributeName = str111;
                    }
                    break;
                case -1766113437:
                case 507528205:
                    String str20 = str2;
                    i27 = i27;
                    strM4222 = strM4222;
                    i25 = i25;
                    if (i == i25) {
                        attributeName = attributeName;
                        iM31610 = (i18 - C0619.m2761("۠ᩴ")) * 69;
                        str = str20;
                        i4 = ((iM31610 ^ i17) * (-3929)) ^ (-1121132224);
                        i5 = -1344919883;
                        r10 = r10;
                        int i214 = iM31610 ^ i5;
                        i19 = i4;
                        i27 = i27;
                        xmlResourceParserC9735 = xmlResourceParserC9734;
                        String str112 = attributeName;
                        i20 = i214;
                        attributeName = str112;
                        String str113 = str;
                        i25 = i25;
                        strM4222 = strM4222;
                        str2 = str113;
                    } else {
                        int iM31616 = (C0773.m3169("۟᩸") + i17) * (-85);
                        i19 = ((iM31616 ^ i18) * (-31757)) ^ (-1361300341);
                        i27 = i27;
                        attributeName = attributeName;
                        i20 = iM31616 ^ 625135381;
                        i25 = i25;
                        strM4222 = strM4222;
                        str2 = str20;
                        xmlResourceParserC9735 = xmlResourceParserC9734;
                    }
                    break;
                case -1755556126:
                case 1584835707:
                    i26 = -1;
                    strM4222 = strM4222;
                    iM31612 = C0773.m3169("᩻֨") ^ i17;
                    i19 = ((iM31612 ^ i18) * (-12455)) ^ 1116684838;
                    i8 = 1370772100;
                    i9 = iM31612 ^ i8;
                    i27 = i27;
                    strM4222 = strM4222;
                    str2 = str2;
                    xmlResourceParserC9735 = xmlResourceParserC9734;
                    String str114 = attributeName;
                    i20 = i9;
                    attributeName = str114;
                    break;
                case -1743373095:
                case -1108577612:
                    interfaceC14984 = interfaceC14986;
                    if (C2834.m9345(strM5463, C3998.m12925(f41425, 200, 9, i21))) {
                        iM31613 = (C0619.m2761("۫ܳ") ^ i17) * (-99);
                        i11 = ((iM31613 ^ i18) * (-25731)) ^ 798418732;
                        i12 = 1108667771;
                    } else {
                        iM31613 = C0619.m2761("ܺۨ") ^ i18;
                        i11 = ((iM31613 ^ i17) * (-10117)) ^ 822758232;
                        i12 = -1116244954;
                    }
                    interfaceC14985 = interfaceC14984;
                    i20 = iM31613 ^ i12;
                    i19 = i11;
                    interfaceC14986 = interfaceC14985;
                    break;
                case -1737267805:
                case 762332406:
                    interfaceC14984 = interfaceC14986;
                    if (C2834.m9345(strM5463, C0950.m3780(f41425, 228, 7, i21))) {
                        iM31613 = (C0619.m2761("۫ܳ") ^ i17) * (-99);
                        i11 = ((iM31613 ^ i18) * (-25731)) ^ 798418732;
                        i12 = 1108667771;
                    } else {
                        iM31613 = (i17 - C0619.m2761("ᩴۛ")) * 13;
                        i11 = ((iM31613 ^ i18) * (-15153)) ^ (-1051700855);
                        i12 = 1511751620;
                    }
                    interfaceC14985 = interfaceC14984;
                    i20 = iM31613 ^ i12;
                    i19 = i11;
                    interfaceC14986 = interfaceC14985;
                    break;
                case -1578047719:
                case -449592473:
                    c15169.f49464 = C25272.m56409(strM4222, attributeName);
                    i27 = i27;
                    attributeName = attributeName;
                    iM2761 = C0619.m2761("᩵۫") ^ i18;
                    i19 = ((iM2761 ^ i17) * (-12163)) ^ (-1293581859);
                    i10 = -1571663797;
                    i9 = iM2761 ^ i10;
                    i27 = i27;
                    String str115 = attributeName;
                    i20 = i9;
                    attributeName = str115;
                    break;
                case -1571938733:
                case 706454311:
                    interfaceC14984 = interfaceC14986;
                    if (C2419.m8175(attributeName, C2287.m7749(f41425, 144, 13, i21))) {
                        iM31613 = C0773.m3169("ܽ᩹") ^ i17;
                        i11 = ((iM31613 ^ i18) * 6137) ^ (-815315699);
                        i12 = -13554420;
                    } else {
                        iM31613 = C0773.m3169("۟ۘ") ^ i18;
                        i11 = ((iM31613 ^ i17) * 4935) ^ (-1677408221);
                        i12 = -1900842709;
                    }
                    interfaceC14985 = interfaceC14984;
                    i20 = iM31613 ^ i12;
                    i19 = i11;
                    interfaceC14986 = interfaceC14985;
                    break;
                case -1557421922:
                case -958575282:
                    interfaceC14984 = interfaceC14986;
                    attributeValue = xmlResourceParserC9735.getAttributeValue(i23);
                    if (C2966.m9659(attributeName, C3099.m10092(f41425, 162, 5, i21))) {
                        iM31613 = C0773.m3169("ۛ۫") ^ i17;
                        i11 = ((iM31613 ^ i18) * 2835) ^ (-1383355680);
                        i12 = 1739819572;
                    } else {
                        iM31613 = (C0619.m2761("ۛۛ") ^ i18) * (-65);
                        i11 = ((iM31613 ^ i17) * 22525) ^ (-111418659);
                        i12 = -821492792;
                    }
                    interfaceC14985 = interfaceC14984;
                    i20 = iM31613 ^ i12;
                    i19 = i11;
                    interfaceC14986 = interfaceC14985;
                    break;
                case -1460608119:
                case 762141736:
                    interfaceC14984 = interfaceC14986;
                    if (C3448.m11238(strM5463, C2485.m8350(f41425, 250, 4, i21))) {
                        iM31613 = (C0619.m2761("۫ܳ") ^ i17) * (-99);
                        i11 = ((iM31613 ^ i18) * (-25731)) ^ 798418732;
                        i12 = 1108667771;
                    } else {
                        iM31613 = C0773.m3169("۠ۧ") ^ i17;
                        i11 = ((iM31613 ^ i18) * 23875) ^ 546688140;
                        i12 = 1004023782;
                    }
                    interfaceC14985 = interfaceC14984;
                    i20 = iM31613 ^ i12;
                    i19 = i11;
                    interfaceC14986 = interfaceC14985;
                    break;
                case -1413940623:
                case 954070716:
                    interfaceC14984 = interfaceC14986;
                    if (C3448.m11238(strM5463, AbstractC0641.m2820(f41425, Scalar25519.TARGET_LENGTH, 7, i21))) {
                        iM31613 = (C0619.m2761("۫ܳ") ^ i17) * (-99);
                        i11 = ((iM31613 ^ i18) * (-25731)) ^ 798418732;
                        i12 = 1108667771;
                    } else {
                        iM31613 = C0773.m3169("ܽ᩹") ^ i17;
                        i11 = ((iM31613 ^ i18) * 6137) ^ (-815315699);
                        i12 = -13554420;
                    }
                    interfaceC14985 = interfaceC14984;
                    i20 = iM31613 ^ i12;
                    i19 = i11;
                    interfaceC14986 = interfaceC14985;
                    break;
                case -1364719411:
                case 2052212278:
                    attributeName = attributeName;
                    i27 = i27;
                    String str21 = str2;
                    strM4222 = strM4222;
                    i25 = i25;
                    str = str21;
                    r9 = r10;
                    if (C2966.m9671(prefix) == 0) {
                        iM31610 = (C0619.m2761("ۗܶ") + i18) * 29;
                        i4 = ((iM31610 ^ i17) * 995) ^ (-1742137184);
                        i5 = -554688122;
                        r10 = r9;
                    } else {
                        iM31610 = C0619.m2761("ܺۗ") ^ i17;
                        i4 = ((iM31610 ^ i18) * (-4831)) ^ 1521086985;
                        i5 = -1938605248;
                        r10 = r10;
                    }
                    int i215 = iM31610 ^ i5;
                    i19 = i4;
                    i27 = i27;
                    xmlResourceParserC9735 = xmlResourceParserC9734;
                    String str116 = attributeName;
                    i20 = i215;
                    attributeName = str116;
                    String str117 = str;
                    i25 = i25;
                    strM4222 = strM4222;
                    str2 = str117;
                    break;
                case -1347889556:
                case 1327902665:
                    String str22 = attributeName;
                    String str23 = str2;
                    String str24 = strM4222;
                    interfaceC14986 = new InterfaceC14984() { // from class: l.ᩴۜۤ
                        @Override // java.util.function.Consumer
                        /* JADX INFO: renamed from: accept */
                        public final /* bridge */ /* synthetic */ void n(Object obj3) {
                            mo15049((Integer) obj3);
                        }

                        @Override // l.InterfaceC14984
                        /* JADX INFO: renamed from: ۤ */
                        public final /* synthetic */ void mo15049(Integer num) {
                            C19460.m45001((InterfaceC14984) this, num);
                        }

                        public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                            return C19460.m45000((InterfaceC14984) this, intConsumer);
                        }

                        public final Consumer andThen(Consumer consumer) {
                            return C12312.$default$andThen(this, consumer);
                        }

                        @Override // java.util.function.IntConsumer
                        public final void accept(int i30) {
                            C22311 c22312 = null;
                            Object obj3 = null;
                            Object c151610 = null;
                            int i31 = -665635353;
                            int i32 = C4282.f15546;
                            int i33 = C11235.f35427;
                            int iM31617 = C0773.m3169("ܿۚ") ^ i33;
                            int i34 = ((iM31617 ^ i32) * (-15187)) ^ (-1946699792);
                            int i35 = -1153009761;
                            while (true) {
                                i31 = ((((i31 ^ i32) * (-18807)) >> 31) & i34) ^ (iM31617 ^ i35);
                                switch (i31) {
                                    case -2142123529:
                                    case 1266560929:
                                        C2702.m8876();
                                        break;
                                    case -1997882528:
                                    case -1593761368:
                                        if (C2287.f7432 >= 0) {
                                            iM31617 = C0619.m2761("֡ۨ") ^ i32;
                                            i34 = ((iM31617 ^ i33) * (-9659)) ^ 1187061166;
                                            i35 = 1010492294;
                                        } else {
                                            iM31617 = (C0773.m3169("ۗۙ") + i32) * 23;
                                            i34 = ((iM31617 ^ i33) * (-30373)) ^ 1948256447;
                                            i35 = 2008392063;
                                        }
                                        break;
                                    case -1907645203:
                                    case 1986688835:
                                        if (C0950.f3488 < 0) {
                                            iM31617 = (C0619.m2761("᩶۫") ^ i33) * 35;
                                            i34 = ((iM31617 ^ i32) * (-21501)) ^ (-516535285);
                                            i35 = 997193598;
                                        } else {
                                            iM31617 = C0619.m2761("֡ۨ") ^ i32;
                                            i34 = ((iM31617 ^ i33) * (-9659)) ^ 1187061166;
                                            i35 = 1010492294;
                                        }
                                        break;
                                    case -1770552376:
                                    case -924568688:
                                        if (C23916.f77426 <= 0) {
                                            iM31617 = C0619.m2761("֡ۨ") ^ i32;
                                            i34 = ((iM31617 ^ i33) * (-9659)) ^ 1187061166;
                                            i35 = 1010492294;
                                        } else {
                                            iM31617 = C0619.m2761("ܽۛ") ^ i33;
                                            i34 = ((iM31617 ^ i32) * 10555) ^ 855463411;
                                            i35 = 1768275546;
                                        }
                                        break;
                                    case -1724169212:
                                    case -549991762:
                                        ((C15169) c151610).f49466 = true;
                                        iM31617 = C0619.m2761("۬ܿ") ^ i33;
                                        i34 = ((iM31617 ^ i32) * 14853) ^ 14794511;
                                        i35 = -1726475933;
                                        break;
                                    case -1712655379:
                                    case 1375344666:
                                        C4238.m13540();
                                        C1343.m4943();
                                        iM31617 = (i32 - C0619.m2761("᩷ۘ")) * (-69);
                                        i34 = ((iM31617 ^ i33) * (-31507)) ^ (-1287882818);
                                        i35 = -1595032021;
                                        break;
                                    case -1573783714:
                                    case -392711207:
                                        if (C0619.f2439) {
                                            iM31617 = (C0619.m2761("ۗۢ") ^ i33) * 77;
                                            i34 = ((iM31617 ^ i32) * (-30437)) ^ (-121315275);
                                            i35 = -1213547106;
                                        } else {
                                            iM31617 = (C0773.m3169("ۖܺ") + i32) * 93;
                                            i34 = ((iM31617 ^ i33) * (-20233)) ^ (-1473504177);
                                            i35 = -642022019;
                                        }
                                        break;
                                    case -1510806510:
                                    case 1178268171:
                                        if (i30 != -1) {
                                            iM31617 = C0773.m3169("۬ܳ") ^ i32;
                                            i34 = ((iM31617 ^ i33) * 2255) ^ 1616112029;
                                            i35 = 1734274170;
                                        } else {
                                            iM31617 = C0619.m2761("۬ܿ") ^ i33;
                                            i34 = ((iM31617 ^ i32) * 14853) ^ 14794511;
                                            i35 = -1726475933;
                                        }
                                        break;
                                    case -1480243922:
                                    case 247840661:
                                        if (RunnableC3646.m11813() != 0) {
                                            iM31617 = (i32 - C0619.m2761("᩷ۘ")) * (-69);
                                            i34 = ((iM31617 ^ i33) * (-31507)) ^ (-1287882818);
                                            i35 = -1595032021;
                                        } else {
                                            iM31617 = C0773.m3169("ᩳܶ") ^ i33;
                                            i34 = ((iM31617 ^ i32) * (-18311)) ^ 1773229004;
                                            i35 = 1972479254;
                                        }
                                        break;
                                    case -1414155707:
                                    case 1487542773:
                                        if (c22312.mo13467(i30)) {
                                            c151610 = obj3;
                                            iM31617 = C0619.m2761("ܽ᩹") ^ i32;
                                            i34 = ((iM31617 ^ i33) * 1639) ^ (-1693259391);
                                            i35 = -1114111539;
                                        } else {
                                            iM31617 = C0773.m3169("ۤ֫") ^ i33;
                                            i34 = ((iM31617 ^ i32) * 22291) ^ 1770656700;
                                            i35 = -1836036909;
                                        }
                                        break;
                                    case -1305402746:
                                    case -75011536:
                                        if (C1783.f6087 <= 0) {
                                            iM31617 = (i32 - C0619.m2761("᩷ۘ")) * (-69);
                                            i34 = ((iM31617 ^ i33) * (-31507)) ^ (-1287882818);
                                            i35 = -1595032021;
                                        } else {
                                            iM31617 = C0619.m2761("᩷ۜ") ^ i32;
                                            i34 = ((iM31617 ^ i33) * (-27121)) ^ (-1490949241);
                                            i35 = -2090483330;
                                        }
                                        break;
                                    case -1033874009:
                                    case 1053092710:
                                        if (RunnableC1848.f6235) {
                                            iM31617 = C0619.m2761("۫ܳ") ^ i32;
                                            i34 = ((iM31617 ^ i33) * 14121) ^ (-1053884673);
                                            i35 = -1427585456;
                                        } else {
                                            iM31617 = (C0773.m3169("ۙ᩶") ^ i33) * 89;
                                            i34 = ((iM31617 ^ i32) * 29125) ^ 1251490476;
                                            i35 = -1310849111;
                                        }
                                        break;
                                    case -762001394:
                                    case 7513280:
                                        c151610 = new C15169(i30);
                                        c22312.mo13466(i30, c151610);
                                        iM31617 = C0619.m2761("ܽ᩹") ^ i32;
                                        i34 = ((iM31617 ^ i33) * 1639) ^ (-1693259391);
                                        i35 = -1114111539;
                                        break;
                                    case -412045983:
                                    case -281746433:
                                        if (C3779.f12953 <= 0) {
                                            iM31617 = C0619.m2761("۫ܳ") ^ i32;
                                            i34 = ((iM31617 ^ i33) * 14121) ^ (-1053884673);
                                            i35 = -1427585456;
                                        } else {
                                            iM31617 = (C0773.m3169("ܺۤ") + i32) * 93;
                                            i34 = ((iM31617 ^ i33) * 18139) ^ (-350078636);
                                            i35 = -366829135;
                                        }
                                        break;
                                    case 412740084:
                                    case 792737636:
                                        if (C3033.f9831 >= 0) {
                                            iM31617 = (C0619.m2761("ۗۢ") ^ i33) * 77;
                                            i34 = ((iM31617 ^ i32) * (-30437)) ^ (-121315275);
                                            i35 = -1213547106;
                                        } else {
                                            iM31617 = (i32 - C0619.m2761("᩷ۘ")) * (-69);
                                            i34 = ((iM31617 ^ i33) * (-31507)) ^ (-1287882818);
                                            i35 = -1595032021;
                                        }
                                        break;
                                    case 652054038:
                                    case 1031566414:
                                        if (C1542.f5343 <= 0) {
                                            iM31617 = C0619.m2761("֡ۨ") ^ i32;
                                            i34 = ((iM31617 ^ i33) * (-9659)) ^ 1187061166;
                                            i35 = 1010492294;
                                        } else {
                                            iM31617 = (C0773.m3169("ۘۧ") + i33) * (-121);
                                            i34 = ((iM31617 ^ i32) * 23515) ^ (-979201656);
                                            i35 = -234658113;
                                        }
                                        break;
                                    case 698655664:
                                    case 2000734834:
                                        if (C2485.m8357() <= 0) {
                                            iM31617 = (C0619.m2761("᩶۫") ^ i33) * 35;
                                            i34 = ((iM31617 ^ i32) * (-21501)) ^ (-516535285);
                                            i35 = 997193598;
                                        } else {
                                            iM31617 = (C0773.m3169("᩷۟") + i32) * 85;
                                            i34 = ((iM31617 ^ i33) * (-19505)) ^ 744210586;
                                            i35 = 364235655;
                                        }
                                        break;
                                    case 728365922:
                                    case 1621972362:
                                        if (C1519.m5403()) {
                                            iM31617 = C0773.m3169("᩻ܶ") ^ i33;
                                            i34 = ((iM31617 ^ i32) * 28105) ^ 903121965;
                                            i35 = 819001361;
                                        } else {
                                            iM31617 = C0619.m2761("۫ܳ") ^ i32;
                                            i34 = ((iM31617 ^ i33) * 14121) ^ (-1053884673);
                                            i35 = -1427585456;
                                        }
                                        break;
                                    case 799789629:
                                    case 1544489268:
                                        if (C2966.f9654 < 0) {
                                            iM31617 = C0619.m2761("֡ۨ") ^ i32;
                                            i34 = ((iM31617 ^ i33) * (-9659)) ^ 1187061166;
                                            i35 = 1010492294;
                                        } else {
                                            iM31617 = (i32 - C0619.m2761("᩷ۘ")) * (-69);
                                            i34 = ((iM31617 ^ i33) * (-31507)) ^ (-1287882818);
                                            i35 = -1595032021;
                                        }
                                        break;
                                    case 1140690600:
                                    case 1257471087:
                                        c22312 = c22311;
                                        obj3 = c22312.get(i30);
                                        if (obj3 == null) {
                                            iM31617 = (i33 - C0619.m2761("ܳۛ")) * (-15);
                                            i34 = ((iM31617 ^ i32) * (-29415)) ^ (-413177535);
                                            i35 = 1013342585;
                                        } else {
                                            c151610 = obj3;
                                            iM31617 = C0619.m2761("ܽ᩹") ^ i32;
                                            i34 = ((iM31617 ^ i33) * 1639) ^ (-1693259391);
                                            i35 = -1114111539;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    };
                    i27 = 3;
                    if (i != 2) {
                        iM31611 = (i17 - C0619.m2761("۬᩸")) * 95;
                        i6 = ((iM31611 ^ i18) * 3743) ^ 233833309;
                        i7 = 919710884;
                    } else {
                        iM31611 = (C0773.m3169("֫ۘ") ^ i17) * 87;
                        i6 = ((iM31611 ^ i18) * (-23695)) ^ 675973125;
                        i7 = 1680377899;
                    }
                    i19 = i6;
                    strM4222 = str24;
                    attributeName = str22;
                    i20 = iM31611 ^ i7;
                    str2 = str23;
                    i25 = 4;
                    xmlResourceParserC9735 = xmlResourceParserC9734;
                    break;
                case -1297806001:
                case 211323976:
                    i26 = 1;
                    strM4222 = strM4222;
                    iM31612 = C0773.m3169("᩻֨") ^ i17;
                    i19 = ((iM31612 ^ i18) * (-12455)) ^ 1116684838;
                    i8 = 1370772100;
                    i9 = iM31612 ^ i8;
                    i27 = i27;
                    strM4222 = strM4222;
                    str2 = str2;
                    xmlResourceParserC9735 = xmlResourceParserC9734;
                    String str118 = attributeName;
                    i20 = i9;
                    attributeName = str118;
                    break;
                case -1254957960:
                case -1066993888:
                    attributeName = attributeName;
                    str2 = str2;
                    i27 = i27;
                    strM4222 = strM4222;
                    if (!C3492.m11490(str2, C2702.m8881(f41425, 25, 14, i21))) {
                        i25 = i25;
                        iM31610 = (i18 - C0619.m2761("ۨ᩵")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        str = str2;
                        i4 = ((iM31610 ^ i17) * (-201)) ^ 1114895588;
                        i5 = 1144476672;
                        r10 = r10;
                        int i216 = iM31610 ^ i5;
                        i19 = i4;
                        i27 = i27;
                        xmlResourceParserC9735 = xmlResourceParserC9734;
                        String str119 = attributeName;
                        i20 = i216;
                        attributeName = str119;
                        String str1110 = str;
                        i25 = i25;
                        strM4222 = strM4222;
                        str2 = str1110;
                    } else {
                        iM31612 = C0773.m3169("ۛۢ") ^ i18;
                        i19 = ((iM31612 ^ i17) * (-10731)) ^ (-1558336503);
                        i8 = -1009583372;
                        i9 = iM31612 ^ i8;
                        i27 = i27;
                        strM4222 = strM4222;
                        str2 = str2;
                        xmlResourceParserC9735 = xmlResourceParserC9734;
                        String str1111 = attributeName;
                        i20 = i9;
                        attributeName = str1111;
                    }
                    break;
                case -1234128811:
                case 1192578333:
                    interfaceC14984 = interfaceC14986;
                    if (z) {
                        iM31613 = C0619.m2761("ۜ۟") ^ i17;
                        i11 = ((iM31613 ^ i18) * 21829) ^ 1479631986;
                        i12 = -486661886;
                    } else {
                        iM31613 = C0773.m3169("ܽ᩹") ^ i17;
                        i11 = ((iM31613 ^ i18) * 6137) ^ (-815315699);
                        i12 = -13554420;
                    }
                    interfaceC14985 = interfaceC14984;
                    i20 = iM31613 ^ i12;
                    i19 = i11;
                    interfaceC14986 = interfaceC14985;
                    break;
                case -1231267222:
                case -634260429:
                    interfaceC14984 = interfaceC14986;
                    c15169.f49464 = C1343.m4946(C1343.m4939(f41425, 209, 4, i21), attributeName);
                    interfaceC14986 = interfaceC14984;
                    i27 = i27;
                    attributeName = attributeName;
                    iM2761 = C0619.m2761("᩵۫") ^ i18;
                    i19 = ((iM2761 ^ i17) * (-12163)) ^ (-1293581859);
                    i10 = -1571663797;
                    i9 = iM2761 ^ i10;
                    i27 = i27;
                    String str1112 = attributeName;
                    i20 = i9;
                    attributeName = str1112;
                    break;
                case -1211611914:
                case -363709006:
                    interfaceC14984 = interfaceC14986;
                    i24 = (i23 * 20) + i22;
                    iM25345 = xmlResourceParserC9735.m25345(i23);
                    obj2 = c22311.get(iM25345);
                    if (obj2 == null) {
                        iM31613 = (C0773.m3169("ۧ᩻") + i18) * 13;
                        i11 = ((iM31613 ^ i17) * (-8559)) ^ (-2021852960);
                        i12 = 1278527260;
                    } else {
                        obj = obj2;
                        iM31613 = (C0619.m2761("ۤ֨") + i18) * (-107);
                        i11 = ((iM31613 ^ i17) * (-2123)) ^ (-716466899);
                        i12 = -1308040643;
                    }
                    interfaceC14985 = interfaceC14984;
                    i20 = iM31613 ^ i12;
                    i19 = i11;
                    interfaceC14986 = interfaceC14985;
                    break;
                case -1187503036:
                case -956125775:
                    attributeName = attributeName;
                    str2 = str2;
                    i27 = i27;
                    strM4222 = strM4222;
                    if (!C2419.m8175(str2, AbstractC0116.m1236(f41425, 39, 11, i21))) {
                        i25 = i25;
                        iM31610 = (i18 - C0619.m2761("ۨ᩵")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        str = str2;
                        i4 = ((iM31610 ^ i17) * (-201)) ^ 1114895588;
                        i5 = 1144476672;
                        r10 = r10;
                        int i217 = iM31610 ^ i5;
                        i19 = i4;
                        i27 = i27;
                        xmlResourceParserC9735 = xmlResourceParserC9734;
                        String str1113 = attributeName;
                        i20 = i217;
                        attributeName = str1113;
                        String str1114 = str;
                        i25 = i25;
                        strM4222 = strM4222;
                        str2 = str1114;
                    } else {
                        i26 = i25;
                        iM31612 = C0773.m3169("᩻֨") ^ i17;
                        i19 = ((iM31612 ^ i18) * (-12455)) ^ 1116684838;
                        i8 = 1370772100;
                        i9 = iM31612 ^ i8;
                        i27 = i27;
                        strM4222 = strM4222;
                        str2 = str2;
                        xmlResourceParserC9735 = xmlResourceParserC9734;
                        String str1115 = attributeName;
                        i20 = i9;
                        attributeName = str1115;
                    }
                    break;
                case -1105448850:
                case -364933919:
                    i23++;
                    iM2761 = C0773.m3169("֡۟") ^ i18;
                    i19 = ((iM2761 ^ i17) * 31025) ^ 1816443743;
                    i10 = 1073406441;
                    i9 = iM2761 ^ i10;
                    i27 = i27;
                    String str1116 = attributeName;
                    i20 = i9;
                    attributeName = str1116;
                    break;
                case -1046043540:
                case -510050964:
                    interfaceC14984 = interfaceC14986;
                    if (c22311.mo13467(iM25345)) {
                        obj = obj2;
                        iM31613 = (C0619.m2761("ۤ֨") + i18) * (-107);
                        i11 = ((iM31613 ^ i17) * (-2123)) ^ (-716466899);
                        i12 = -1308040643;
                    } else {
                        iM31613 = (C0619.m2761("ۧ۬") ^ i18) * q.h;
                        i11 = ((iM31613 ^ i17) * (-32399)) ^ (-828388357);
                        i12 = 1370722409;
                    }
                    interfaceC14985 = interfaceC14984;
                    i20 = iM31613 ^ i12;
                    i19 = i11;
                    interfaceC14986 = interfaceC14985;
                    break;
                case -1043598043:
                case 1392477883:
                    attributeName = attributeName;
                    str2 = str2;
                    i27 = i27;
                    strM4222 = strM4222;
                    if (!C3492.m11490(str2, RunnableC3646.m11809(f41425, 9, 8, i21))) {
                        i25 = i25;
                        iM31610 = (i18 - C0619.m2761("ۨ᩵")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        str = str2;
                        i4 = ((iM31610 ^ i17) * (-201)) ^ 1114895588;
                        i5 = 1144476672;
                        r10 = r10;
                        int i218 = iM31610 ^ i5;
                        i19 = i4;
                        i27 = i27;
                        xmlResourceParserC9735 = xmlResourceParserC9734;
                        String str1117 = attributeName;
                        i20 = i218;
                        attributeName = str1117;
                        String str1118 = str;
                        i25 = i25;
                        strM4222 = strM4222;
                        str2 = str1118;
                    } else {
                        iM31612 = (i17 - C0773.m3169("۠ۨ")) * 77;
                        i19 = ((iM31612 ^ i18) * (-20863)) ^ (-898688685);
                        i8 = 1614298528;
                        i9 = iM31612 ^ i8;
                        i27 = i27;
                        strM4222 = strM4222;
                        str2 = str2;
                        xmlResourceParserC9735 = xmlResourceParserC9734;
                        String str1119 = attributeName;
                        i20 = i9;
                        attributeName = str1119;
                    }
                    break;
                case -1042849383:
                case -196855482:
                    attributeName = attributeName;
                    i27 = i27;
                    switch (i26) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            iM2761 = C0619.m2761("ۙ᩻") ^ i17;
                            i19 = ((iM2761 ^ i18) * (-25011)) ^ 1920580329;
                            i10 = -1645553752;
                            i9 = iM2761 ^ i10;
                            i27 = i27;
                            String str11110 = attributeName;
                            i20 = i9;
                            attributeName = str11110;
                            break;
                        default:
                            String str25 = str2;
                            strM4222 = strM4222;
                            i25 = i25;
                            str = str25;
                            iM31610 = C0619.m2761("ܺۗ") ^ i17;
                            i4 = ((iM31610 ^ i18) * (-4831)) ^ 1521086985;
                            i5 = -1938605248;
                            r10 = r10;
                            int i219 = iM31610 ^ i5;
                            i19 = i4;
                            i27 = i27;
                            xmlResourceParserC9735 = xmlResourceParserC9734;
                            String str11111 = attributeName;
                            i20 = i219;
                            attributeName = str11111;
                            String str11112 = str;
                            i25 = i25;
                            strM4222 = strM4222;
                            str2 = str11112;
                            break;
                    }
                    break;
                case -1011789849:
                case 704552773:
                    interfaceC14984 = interfaceC14986;
                    if (C3448.m11238(strM5463, C1564.m5510(f41425, BERTags.FLAGS, 4, i21))) {
                        iM31613 = (C0619.m2761("۫ܳ") ^ i17) * (-99);
                        i11 = ((iM31613 ^ i18) * (-25731)) ^ 798418732;
                        i12 = 1108667771;
                    } else {
                        iM31613 = (C0619.m2761("۟۟") + i17) * 15;
                        i11 = ((iM31613 ^ i18) * (-2099)) ^ 542413929;
                        i12 = 1490892134;
                    }
                    interfaceC14985 = interfaceC14984;
                    i20 = iM31613 ^ i12;
                    i19 = i11;
                    interfaceC14986 = interfaceC14985;
                    break;
                case -972968718:
                case 207710748:
                    interfaceC14984 = interfaceC14986;
                    C15169 c151610 = new C15169(iM25345);
                    c22311.mo13466(iM25345, c151610);
                    obj = c151610;
                    iM31613 = (C0619.m2761("ۤ֨") + i18) * (-107);
                    i11 = ((iM31613 ^ i17) * (-2123)) ^ (-716466899);
                    i12 = -1308040643;
                    interfaceC14985 = interfaceC14984;
                    i20 = iM31613 ^ i12;
                    i19 = i11;
                    interfaceC14986 = interfaceC14985;
                    break;
                case -946248014:
                case 1992521135:
                    interfaceC14984 = interfaceC14986;
                    if (C1942.m6727(xmlResourceParserC9735.getAttributeValue(i23))) {
                        iM31613 = (i17 - C0619.m2761("᩻ۤ")) * 123;
                        i11 = ((iM31613 ^ i18) * 8409) ^ 423441554;
                        i12 = 481701961;
                    } else {
                        iM31613 = C0773.m3169("ܽ᩹") ^ i17;
                        i11 = ((iM31613 ^ i18) * 6137) ^ (-815315699);
                        i12 = -13554420;
                    }
                    interfaceC14985 = interfaceC14984;
                    i20 = iM31613 ^ i12;
                    i19 = i11;
                    interfaceC14986 = interfaceC14985;
                    break;
                case -915497190:
                case 1219821060:
                    str = str2;
                    i21 = 19802;
                    iM31610 = C0619.m2761("ۤ۟") ^ i18;
                    i4 = ((iM31610 ^ i17) * 20983) ^ 321839444;
                    i5 = -406393429;
                    r10 = r10;
                    int i2110 = iM31610 ^ i5;
                    i19 = i4;
                    i27 = i27;
                    xmlResourceParserC9735 = xmlResourceParserC9734;
                    String str11113 = attributeName;
                    i20 = i2110;
                    attributeName = str11113;
                    String str11114 = str;
                    i25 = i25;
                    strM4222 = strM4222;
                    str2 = str11114;
                    break;
                case -911903171:
                case 1867636288:
                    interfaceC14984 = interfaceC14986;
                    if (!c15169.f49466) {
                        iM31613 = (C0773.m3169("ۖܽ") + i17) * 127;
                        i11 = ((iM31613 ^ i18) * 17519) ^ (-1406856002);
                        i12 = -1144185897;
                        interfaceC14985 = interfaceC14984;
                        i20 = iM31613 ^ i12;
                        i19 = i11;
                        interfaceC14986 = interfaceC14985;
                    } else {
                        interfaceC14986 = interfaceC14984;
                        i27 = i27;
                        attributeName = attributeName;
                        iM2761 = C0619.m2761("᩵۫") ^ i18;
                        i19 = ((iM2761 ^ i17) * (-12163)) ^ (-1293581859);
                        i10 = -1571663797;
                        i9 = iM2761 ^ i10;
                        i27 = i27;
                        String str11115 = attributeName;
                        i20 = i9;
                        attributeName = str11115;
                    }
                    break;
                case -849545300:
                case 187713230:
                    interfaceC14984 = interfaceC14986;
                    if (C3492.m11490(attributeName, C2702.m8881(f41425, 83, 25, i21))) {
                        iM31613 = C0773.m3169("ܽ᩹") ^ i17;
                        i11 = ((iM31613 ^ i18) * 6137) ^ (-815315699);
                        i12 = -13554420;
                    } else {
                        iM31613 = C0773.m3169("ۗۜ") ^ i18;
                        i11 = ((iM31613 ^ i17) * 9141) ^ 1102514627;
                        i12 = -1349094865;
                    }
                    interfaceC14985 = interfaceC14984;
                    i20 = iM31613 ^ i12;
                    i19 = i11;
                    interfaceC14986 = interfaceC14985;
                    break;
                case -792039002:
                case 658526505:
                    attributeName = attributeName;
                    str2 = str2;
                    i27 = i27;
                    strM4222 = strM4222;
                    if (!C3492.m11490(str2, C2354.m7980(f41425, 17, 8, i21))) {
                        i25 = i25;
                        iM31610 = (i18 - C0619.m2761("ۨ᩵")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        str = str2;
                        i4 = ((iM31610 ^ i17) * (-201)) ^ 1114895588;
                        i5 = 1144476672;
                        r10 = r10;
                        int i2111 = iM31610 ^ i5;
                        i19 = i4;
                        i27 = i27;
                        xmlResourceParserC9735 = xmlResourceParserC9734;
                        String str11116 = attributeName;
                        i20 = i2111;
                        attributeName = str11116;
                        String str11117 = str;
                        i25 = i25;
                        strM4222 = strM4222;
                        str2 = str11117;
                    } else {
                        iM31612 = C0773.m3169("ۤۙ") ^ i18;
                        i19 = ((iM31612 ^ i17) * (-13069)) ^ 578120470;
                        i8 = 1508223281;
                        i9 = iM31612 ^ i8;
                        i27 = i27;
                        strM4222 = strM4222;
                        str2 = str2;
                        xmlResourceParserC9735 = xmlResourceParserC9734;
                        String str11118 = attributeName;
                        i20 = i9;
                        attributeName = str11118;
                    }
                    break;
                case -685470728:
                case -286979352:
                    i26 = 6;
                    strM4222 = strM4222;
                    iM31612 = C0773.m3169("᩻֨") ^ i17;
                    i19 = ((iM31612 ^ i18) * (-12455)) ^ 1116684838;
                    i8 = 1370772100;
                    i9 = iM31612 ^ i8;
                    i27 = i27;
                    strM4222 = strM4222;
                    str2 = str2;
                    xmlResourceParserC9735 = xmlResourceParserC9734;
                    String str11119 = attributeName;
                    i20 = i9;
                    attributeName = str11119;
                    break;
                case -682456689:
                case 730877949:
                    interfaceC14984 = interfaceC14986;
                    if (i15 == 0) {
                        iM31613 = C0619.m2761("ۚۧ") ^ i17;
                        i11 = ((iM31613 ^ i18) * 20679) ^ (-756818566);
                        i12 = 1475982447;
                    } else {
                        iM31613 = C0773.m3169("ܽ᩹") ^ i17;
                        i11 = ((iM31613 ^ i18) * 6137) ^ (-815315699);
                        i12 = -13554420;
                    }
                    interfaceC14985 = interfaceC14984;
                    i20 = iM31613 ^ i12;
                    i19 = i11;
                    interfaceC14986 = interfaceC14985;
                    break;
                case -653786040:
                case 1923019537:
                    interfaceC14984 = interfaceC14986;
                    if (C1942.m6727(xmlResourceParserC9735.getAttributeValue(i23))) {
                        iM31613 = (i18 - C0773.m3169("ۘ۬")) * 15;
                        i11 = ((iM31613 ^ i17) * 30359) ^ 1032506444;
                        i12 = 1347682729;
                    } else {
                        iM31613 = C0773.m3169("ܽ᩹") ^ i17;
                        i11 = ((iM31613 ^ i18) * 6137) ^ (-815315699);
                        i12 = -13554420;
                    }
                    interfaceC14985 = interfaceC14984;
                    i20 = iM31613 ^ i12;
                    i19 = i11;
                    interfaceC14986 = interfaceC14985;
                    break;
                case -534208123:
                case 227160314:
                    z = true;
                    iM2761 = (C0773.m3169("֨ۗ") + i17) * (-85);
                    i19 = ((iM2761 ^ i18) * 7545) ^ (-17464907);
                    i10 = 982742000;
                    i9 = iM2761 ^ i10;
                    i27 = i27;
                    String str111110 = attributeName;
                    i20 = i9;
                    attributeName = str111110;
                    break;
                case -403157130:
                case 353209256:
                    interfaceC14984 = interfaceC14986;
                    if (C3492.m11490(attributeName, C0950.m3780(f41425, 108, 31, i21))) {
                        iM31613 = C0773.m3169("ܽ᩹") ^ i17;
                        i11 = ((iM31613 ^ i18) * 6137) ^ (-815315699);
                        i12 = -13554420;
                    } else {
                        iM31613 = (C0773.m3169("ۗۨ") ^ i18) * (-125);
                        i11 = ((iM31613 ^ i17) * (-27701)) ^ (-203219543);
                        i12 = -2009615808;
                    }
                    interfaceC14985 = interfaceC14984;
                    i20 = iM31613 ^ i12;
                    i19 = i11;
                    interfaceC14986 = interfaceC14985;
                    break;
                case -363251735:
                case 197620564:
                    attributeName = attributeName;
                    strM4222 = strM4222;
                    i25 = i25;
                    i27 = i27;
                    String name = xmlResourceParserC9734.getName();
                    C17202.m40369(name);
                    switch (C0619.m2761(name)) {
                        case -1655966961:
                            str = name;
                            iM31610 = (i18 - C0773.m3169("᩶ۗ")) * (-53);
                            i4 = ((iM31610 ^ i17) * 15415) ^ (-775673929);
                            i5 = 283204761;
                            r10 = r10;
                            int i2112 = iM31610 ^ i5;
                            i19 = i4;
                            i27 = i27;
                            xmlResourceParserC9735 = xmlResourceParserC9734;
                            String str111111 = attributeName;
                            i20 = i2112;
                            attributeName = str111111;
                            String str111112 = str;
                            i25 = i25;
                            strM4222 = strM4222;
                            str2 = str111112;
                            break;
                        case -987494927:
                            str = name;
                            iM31610 = C0773.m3169("ۧ۠") ^ i17;
                            i4 = ((iM31610 ^ i18) * (-26003)) ^ (-964007985);
                            i5 = 1370169452;
                            r10 = r10;
                            int i2113 = iM31610 ^ i5;
                            i19 = i4;
                            i27 = i27;
                            xmlResourceParserC9735 = xmlResourceParserC9734;
                            String str111113 = attributeName;
                            i20 = i2113;
                            attributeName = str111113;
                            String str111114 = str;
                            i25 = i25;
                            strM4222 = strM4222;
                            str2 = str111114;
                            break;
                        case -808719889:
                            str = name;
                            iM31610 = (C0773.m3169("ܰܶ") + i18) * (-107);
                            i4 = ((iM31610 ^ i17) * (-11661)) ^ 551218241;
                            i5 = 1770950220;
                            r10 = r10;
                            int i2114 = iM31610 ^ i5;
                            i19 = i4;
                            i27 = i27;
                            xmlResourceParserC9735 = xmlResourceParserC9734;
                            String str111115 = attributeName;
                            i20 = i2114;
                            attributeName = str111115;
                            String str111116 = str;
                            i25 = i25;
                            strM4222 = strM4222;
                            str2 = str111116;
                            break;
                        case 790287890:
                            str = name;
                            iM31610 = (i17 - C0773.m3169("᩹֫")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                            i4 = ((iM31610 ^ i18) * 24171) ^ (-1999137130);
                            i5 = 973881462;
                            r10 = r10;
                            int i2115 = iM31610 ^ i5;
                            i19 = i4;
                            i27 = i27;
                            xmlResourceParserC9735 = xmlResourceParserC9734;
                            String str111117 = attributeName;
                            i20 = i2115;
                            attributeName = str111117;
                            String str111118 = str;
                            i25 = i25;
                            strM4222 = strM4222;
                            str2 = str111118;
                            break;
                        case 1554253136:
                            str = name;
                            iM31610 = C0619.m2761("۟ܿ") ^ i18;
                            i4 = ((iM31610 ^ i17) * 1403) ^ 1811209233;
                            i5 = -1888709043;
                            r10 = r10;
                            int i2116 = iM31610 ^ i5;
                            i19 = i4;
                            i27 = i27;
                            xmlResourceParserC9735 = xmlResourceParserC9734;
                            String str111119 = attributeName;
                            i20 = i2116;
                            attributeName = str111119;
                            String str1111110 = str;
                            i25 = i25;
                            strM4222 = strM4222;
                            str2 = str1111110;
                            break;
                        case 1723095833:
                            str = name;
                            iM31610 = (C0773.m3169("᩸ᩴ") + i17) * (-101);
                            i4 = ((iM31610 ^ i18) * (-13989)) ^ 1259676306;
                            i5 = -1684513033;
                            r10 = r10;
                            int i2117 = iM31610 ^ i5;
                            i19 = i4;
                            i27 = i27;
                            xmlResourceParserC9735 = xmlResourceParserC9734;
                            String str1111111 = attributeName;
                            i20 = i2117;
                            attributeName = str1111111;
                            String str1111112 = str;
                            i25 = i25;
                            strM4222 = strM4222;
                            str2 = str1111112;
                            break;
                        case 1984153269:
                            int iM2763 = C0619.m2761("ܽܰ") ^ i18;
                            i19 = ((iM2763 ^ i17) * (-6117)) ^ (-823763776);
                            i27 = i27;
                            attributeName = attributeName;
                            i20 = iM2763 ^ 1755344693;
                            xmlResourceParserC9735 = xmlResourceParserC9734;
                            i25 = i25;
                            strM4222 = strM4222;
                            str2 = name;
                            break;
                        default:
                            str2 = name;
                            iM31610 = (i18 - C0619.m2761("ۨ᩵")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                            str = str2;
                            i4 = ((iM31610 ^ i17) * (-201)) ^ 1114895588;
                            i5 = 1144476672;
                            r10 = r10;
                            int i2118 = iM31610 ^ i5;
                            i19 = i4;
                            i27 = i27;
                            xmlResourceParserC9735 = xmlResourceParserC9734;
                            String str1111113 = attributeName;
                            i20 = i2118;
                            attributeName = str1111113;
                            String str1111114 = str;
                            i25 = i25;
                            strM4222 = strM4222;
                            str2 = str1111114;
                            break;
                    }
                    break;
                case -325893977:
                case 1996205898:
                    interfaceC14984 = interfaceC14986;
                    if (C3448.m11238(strM5463, C1564.m5510(f41425, 245, 5, i21))) {
                        iM31613 = (C0619.m2761("۫ܳ") ^ i17) * (-99);
                        i11 = ((iM31613 ^ i18) * (-25731)) ^ 798418732;
                        i12 = 1108667771;
                    } else {
                        iM31613 = (C0619.m2761("ᩴۨ") + i17) * 35;
                        i11 = ((iM31613 ^ i18) * (-4595)) ^ 1029354065;
                        i12 = 358792581;
                    }
                    interfaceC14985 = interfaceC14984;
                    i20 = iM31613 ^ i12;
                    i19 = i11;
                    interfaceC14986 = interfaceC14985;
                    break;
                case -225465852:
                case 1699336450:
                    interfaceC14984 = interfaceC14986;
                    c15169.f49463.add(i24);
                    if (c15169.f49464 != null) {
                        interfaceC14986 = interfaceC14984;
                        i27 = i27;
                        attributeName = attributeName;
                        iM2761 = C0619.m2761("᩵۫") ^ i18;
                        i19 = ((iM2761 ^ i17) * (-12163)) ^ (-1293581859);
                        i10 = -1571663797;
                        i9 = iM2761 ^ i10;
                        i27 = i27;
                        String str1111115 = attributeName;
                        i20 = i9;
                        attributeName = str1111115;
                    } else {
                        iM31613 = (C0773.m3169("᩸ۙ") + i17) * (-41);
                        i11 = ((iM31613 ^ i18) * (-14835)) ^ (-9701050);
                        i12 = 1451601677;
                        interfaceC14985 = interfaceC14984;
                        i20 = iM31613 ^ i12;
                        i19 = i11;
                        interfaceC14986 = interfaceC14985;
                    }
                    break;
                case -218430373:
                case 1754858275:
                    interfaceC14984 = interfaceC14986;
                    c15169.f49463.add(i24);
                    if (c15169.f49464 != null) {
                        interfaceC14986 = interfaceC14984;
                        i27 = i27;
                        attributeName = attributeName;
                        iM2761 = C0619.m2761("᩵۫") ^ i18;
                        i19 = ((iM2761 ^ i17) * (-12163)) ^ (-1293581859);
                        i10 = -1571663797;
                        i9 = iM2761 ^ i10;
                        i27 = i27;
                        String str1111116 = attributeName;
                        i20 = i9;
                        attributeName = str1111116;
                    } else {
                        iM31613 = (C0773.m3169("֨᩷") ^ i17) * (-65);
                        i11 = ((iM31613 ^ i18) * (-20809)) ^ (-358706369);
                        i12 = -804418259;
                        interfaceC14985 = interfaceC14984;
                        i20 = iM31613 ^ i12;
                        i19 = i11;
                        interfaceC14986 = interfaceC14985;
                    }
                    break;
                case -182880908:
                case 1498209050:
                    interfaceC14984 = interfaceC14986;
                    if (C2834.m9345(strM5463, C13473.m33137(f41425, 213, 11, i21))) {
                        iM31613 = (C0619.m2761("۫ܳ") ^ i17) * (-99);
                        i11 = ((iM31613 ^ i18) * (-25731)) ^ 798418732;
                        i12 = 1108667771;
                    } else {
                        iM31613 = C0773.m3169("ᩴᩴ") ^ i18;
                        i11 = ((iM31613 ^ i17) * (-17885)) ^ 631389990;
                        i12 = -1948457253;
                    }
                    interfaceC14985 = interfaceC14984;
                    i20 = iM31613 ^ i12;
                    i19 = i11;
                    interfaceC14986 = interfaceC14985;
                    break;
                case -137144108:
                case -16770080:
                    interfaceC14984 = interfaceC14986;
                    if (attributeValue.matches(C1542.m5471(f41425, 171, 25, i21))) {
                        iM31613 = C0773.m3169("ܽ᩹") ^ i17;
                        i11 = ((iM31613 ^ i18) * 6137) ^ (-815315699);
                        i12 = -13554420;
                    } else {
                        iM31613 = (C0619.m2761("ۛۛ") ^ i18) * (-65);
                        i11 = ((iM31613 ^ i17) * 22525) ^ (-111418659);
                        i12 = -821492792;
                    }
                    interfaceC14985 = interfaceC14984;
                    i20 = iM31613 ^ i12;
                    i19 = i11;
                    interfaceC14986 = interfaceC14985;
                    break;
                case 12668821:
                case 294359800:
                    i26 = 2;
                    strM4222 = strM4222;
                    iM31612 = C0773.m3169("᩻֨") ^ i17;
                    i19 = ((iM31612 ^ i18) * (-12455)) ^ 1116684838;
                    i8 = 1370772100;
                    i9 = iM31612 ^ i8;
                    i27 = i27;
                    strM4222 = strM4222;
                    str2 = str2;
                    xmlResourceParserC9735 = xmlResourceParserC9734;
                    String str1111117 = attributeName;
                    i20 = i9;
                    attributeName = str1111117;
                    break;
                case 35854492:
                case 1497213090:
                    InterfaceC14984 interfaceC14987 = interfaceC14986;
                    int attributeNameResource = (xmlResourceParserC9735.getAttributeNameResource(i23) >>> 24) & 255;
                    if (attributeNameResource > r10) {
                        iM31614 = (C0619.m2761("ۡ۠") ^ i18) * (-23);
                        i13 = ((iM31614 ^ i17) * 4945) ^ (-1350975655);
                        i14 = 1965613717;
                    } else {
                        iM31614 = (C0773.m3169("ۡۧ") ^ i17) * (-85);
                        i13 = ((iM31614 ^ i18) * 32439) ^ 938862992;
                        i14 = -661945571;
                    }
                    int i30 = iM31614 ^ i14;
                    i15 = attributeNameResource;
                    i19 = i13;
                    interfaceC14985 = interfaceC14987;
                    i20 = i30;
                    interfaceC14986 = interfaceC14985;
                    break;
                case 101342235:
                case 467430686:
                    c15169.f49466 = r10;
                    i27 = i27;
                    attributeName = attributeName;
                    iM2761 = C0619.m2761("᩵۫") ^ i18;
                    i19 = ((iM2761 ^ i17) * (-12163)) ^ (-1293581859);
                    i10 = -1571663797;
                    i9 = iM2761 ^ i10;
                    i27 = i27;
                    String str1111118 = attributeName;
                    i20 = i9;
                    attributeName = str1111118;
                    break;
                case 158375815:
                case 754774811:
                    i26 = 0;
                    strM4222 = strM4222;
                    iM31612 = C0773.m3169("᩻֨") ^ i17;
                    i19 = ((iM31612 ^ i18) * (-12455)) ^ 1116684838;
                    i8 = 1370772100;
                    i9 = iM31612 ^ i8;
                    i27 = i27;
                    strM4222 = strM4222;
                    str2 = str2;
                    xmlResourceParserC9735 = xmlResourceParserC9734;
                    String str1111119 = attributeName;
                    i20 = i9;
                    attributeName = str1111119;
                    break;
                case 182835159:
                case 351292700:
                    attributeName = attributeName;
                    i27 = i27;
                    String str26 = str2;
                    strM4222 = strM4222;
                    i25 = i25;
                    str = str26;
                    short s = f41425[0];
                    int i31 = 70692 * s;
                    int i32 = s + 17673;
                    if ((i32 * i32) - i31 < 0) {
                        iM31610 = (C0773.m3169("᩺ܽ") ^ i17) * 5;
                        i4 = ((iM31610 ^ i18) * (-16669)) ^ (-775028401);
                        i5 = 1515545210;
                        r10 = r10;
                    } else {
                        iM31610 = (C0773.m3169("᩵ᩳ") ^ i18) * 61;
                        i4 = ((iM31610 ^ i17) * (-20629)) ^ (-1152542032);
                        i5 = -1957703168;
                        r10 = r10;
                    }
                    int i2119 = iM31610 ^ i5;
                    i19 = i4;
                    i27 = i27;
                    xmlResourceParserC9735 = xmlResourceParserC9734;
                    String str11111110 = attributeName;
                    i20 = i2119;
                    attributeName = str11111110;
                    String str11111111 = str;
                    i25 = i25;
                    strM4222 = strM4222;
                    str2 = str11111111;
                    break;
                case 188849469:
                case 2066729920:
                    interfaceC14984 = interfaceC14986;
                    c15169 = (C15169) obj;
                    attributeName = xmlResourceParserC9735.getAttributeName(i23);
                    int attributeNameResource2 = xmlResourceParserC9735.getAttributeNameResource(i23);
                    strM4222 = C1146.m4222(f41425, 75, 8, i21);
                    switch (attributeNameResource2) {
                        case R.attr.label:
                            iM31613 = C0619.m2761("᩹֨") ^ i17;
                            i11 = ((iM31613 ^ i18) * (-11051)) ^ (-1838854377);
                            i12 = -680100158;
                            break;
                        case R.attr.textOn:
                        case R.attr.textOff:
                        case R.attr.text:
                        case R.attr.hint:
                        case R.attr.title:
                        case R.attr.titleCondensed:
                        case R.attr.summary:
                        case R.attr.summaryOn:
                        case R.attr.summaryOff:
                        case R.attr.dialogTitle:
                        case R.attr.dialogMessage:
                        case R.attr.popupCharacters:
                        case R.attr.keyOutputText:
                        case R.attr.keyLabel:
                        case R.attr.imeActionLabel:
                        case R.attr.contentDescription:
                        case R.attr.queryHint:
                        case R.attr.switchTextOn:
                        case R.attr.switchTextOff:
                        case R.attr.format12Hour:
                        case R.attr.format24Hour:
                        case R.attr.tooltipText:
                        case R.attr.autofillHints:
                            iM31613 = C0619.m2761("᩸ܰ") ^ i17;
                            i11 = ((iM31613 ^ i18) * 27291) ^ (-199671222);
                            i12 = -1120735667;
                            break;
                        default:
                            iM31613 = (C0773.m3169("ۘۜ") ^ i18) * (-107);
                            i11 = ((iM31613 ^ i17) * 8555) ^ 640991974;
                            i12 = -1144027260;
                            break;
                    }
                    interfaceC14985 = interfaceC14984;
                    i20 = iM31613 ^ i12;
                    i19 = i11;
                    interfaceC14986 = interfaceC14985;
                    break;
                case 246219089:
                case 1086549247:
                    interfaceC14984 = interfaceC14986;
                    if (C3448.m11238(strM5463, C2702.m8881(f41425, 235, 7, i21))) {
                        iM31613 = (C0619.m2761("۫ܳ") ^ i17) * (-99);
                        i11 = ((iM31613 ^ i18) * (-25731)) ^ 798418732;
                        i12 = 1108667771;
                    } else {
                        iM31613 = (C0619.m2761("᩵᩶") ^ i18) * 39;
                        i11 = ((iM31613 ^ i17) * (-13937)) ^ (-859311002);
                        i12 = 363929110;
                    }
                    interfaceC14985 = interfaceC14984;
                    i20 = iM31613 ^ i12;
                    i19 = i11;
                    interfaceC14986 = interfaceC14985;
                    break;
                case 312353749:
                case 1393266668:
                    interfaceC14984 = interfaceC14986;
                    if (C1942.m6727(xmlResourceParserC9735.getAttributeValue(i23))) {
                        iM31613 = C0619.m2761("֡ۡ") ^ i18;
                        i11 = ((iM31613 ^ i17) * 9269) ^ 671739322;
                        i12 = 757564382;
                    } else {
                        iM31613 = C0773.m3169("ܽ᩹") ^ i17;
                        i11 = ((iM31613 ^ i18) * 6137) ^ (-815315699);
                        i12 = -13554420;
                    }
                    interfaceC14985 = interfaceC14984;
                    i20 = iM31613 ^ i12;
                    i19 = i11;
                    interfaceC14986 = interfaceC14985;
                    break;
                case 448191082:
                case 495528477:
                    interfaceC14984 = interfaceC14986;
                    if (C3448.m11238(strM5463, C23916.m53420(f41425, 167, 4, i21))) {
                        iM31613 = (C0619.m2761("۫ܳ") ^ i17) * (-99);
                        i11 = ((iM31613 ^ i18) * (-25731)) ^ 798418732;
                        i12 = 1108667771;
                    } else {
                        iM31613 = (i18 - C0773.m3169("ܶܳ")) * 109;
                        i11 = ((iM31613 ^ i17) * 12239) ^ (-1942733145);
                        i12 = -1253845605;
                    }
                    interfaceC14985 = interfaceC14984;
                    i20 = iM31613 ^ i12;
                    i19 = i11;
                    interfaceC14986 = interfaceC14985;
                    break;
                case 486923645:
                case 1988320302:
                    interfaceC14984 = interfaceC14986;
                    if (C3448.m11238(strM5463, AbstractC3624.m11769(f41425, 242, 3, i21))) {
                        iM31613 = (C0619.m2761("۫ܳ") ^ i17) * (-99);
                        i11 = ((iM31613 ^ i18) * (-25731)) ^ 798418732;
                        i12 = 1108667771;
                    } else {
                        iM31613 = (C0773.m3169("ܰۜ") ^ i18) * (-23);
                        i11 = ((iM31613 ^ i17) * 10033) ^ 1213032173;
                        i12 = -1836150729;
                    }
                    interfaceC14985 = interfaceC14984;
                    i20 = iM31613 ^ i12;
                    i19 = i11;
                    interfaceC14986 = interfaceC14985;
                    break;
                case 529397317:
                case 1848032369:
                    interfaceC14984 = interfaceC14986;
                    c15169.f49463.add(i24);
                    if (c15169.f49464 != null) {
                        interfaceC14986 = interfaceC14984;
                        i27 = i27;
                        attributeName = attributeName;
                        iM2761 = C0619.m2761("᩵۫") ^ i18;
                        i19 = ((iM2761 ^ i17) * (-12163)) ^ (-1293581859);
                        i10 = -1571663797;
                        i9 = iM2761 ^ i10;
                        i27 = i27;
                        String str11111112 = attributeName;
                        i20 = i9;
                        attributeName = str11111112;
                    } else {
                        iM31613 = C0619.m2761("᩷۟") ^ i17;
                        i11 = ((iM31613 ^ i18) * 23811) ^ (-898764718);
                        i12 = 1968239039;
                        interfaceC14985 = interfaceC14984;
                        i20 = iM31613 ^ i12;
                        i19 = i11;
                        interfaceC14986 = interfaceC14985;
                    }
                    break;
                case 611579266:
                case 1959295728:
                    attributeName = attributeName;
                    i27 = i27;
                    String str27 = str2;
                    strM4222 = strM4222;
                    i25 = i25;
                    str = str27;
                    interfaceC14986.accept(xmlResourceParserC9734.m25340());
                    interfaceC14986.accept(xmlResourceParserC9734.m25343());
                    prefix = xmlResourceParserC9734.getPrefix();
                    i28 = 0;
                    r9 = 1;
                    r10 = 1;
                    if (prefix != null) {
                        iM31610 = C0619.m2761("ۘۢ") ^ i17;
                        i4 = ((iM31610 ^ i18) * (-19047)) ^ 571600717;
                        i5 = 1053350487;
                    } else {
                        iM31610 = (C0619.m2761("ۗܶ") + i18) * 29;
                        i4 = ((iM31610 ^ i17) * 995) ^ (-1742137184);
                        i5 = -554688122;
                        r10 = r9;
                    }
                    int i21110 = iM31610 ^ i5;
                    i19 = i4;
                    i27 = i27;
                    xmlResourceParserC9735 = xmlResourceParserC9734;
                    String str11111113 = attributeName;
                    i20 = i21110;
                    attributeName = str11111113;
                    String str11111114 = str;
                    i25 = i25;
                    strM4222 = strM4222;
                    str2 = str11111114;
                    break;
                case 712361085:
                case 1665147733:
                    interfaceC14986.accept(xmlResourceParserC9734.m25340());
                    break;
                case 760339557:
                case 1401358003:
                    interfaceC14984 = interfaceC14986;
                    if (C1942.m6727(xmlResourceParserC9735.getAttributeValue(i23))) {
                        iM31613 = (i18 - C0773.m3169("۬᩶")) * 95;
                        i11 = ((iM31613 ^ i17) * (-9867)) ^ (-1931282886);
                        i12 = 107031482;
                    } else {
                        iM31613 = C0773.m3169("ܽ᩹") ^ i17;
                        i11 = ((iM31613 ^ i18) * 6137) ^ (-815315699);
                        i12 = -13554420;
                    }
                    interfaceC14985 = interfaceC14984;
                    i20 = iM31613 ^ i12;
                    i19 = i11;
                    interfaceC14986 = interfaceC14985;
                    break;
                case 896738917:
                case 925269425:
                    attributeCount = xmlResourceParserC9734.getAttributeCount();
                    i22 = xmlResourceParserC9735.f31399;
                    i23 = i28;
                    iM2761 = C0773.m3169("֡۟") ^ i18;
                    i19 = ((iM2761 ^ i17) * 31025) ^ 1816443743;
                    i10 = 1073406441;
                    i9 = iM2761 ^ i10;
                    i27 = i27;
                    String str11111115 = attributeName;
                    i20 = i9;
                    attributeName = str11111115;
                    break;
                case 942172806:
                case 2006233867:
                    attributeName = attributeName;
                    int i33 = attributeCount;
                    i27 = i27;
                    if (i23 == i33) {
                        attributeCount = i33;
                        String str28 = str2;
                        strM4222 = strM4222;
                        i25 = i25;
                        str = str28;
                        iM31610 = C0619.m2761("ۗ᩶") ^ i18;
                        i4 = ((iM31610 ^ i17) * (-2325)) ^ 1035870561;
                        i5 = 952811172;
                        r10 = r10;
                        int i21111 = iM31610 ^ i5;
                        i19 = i4;
                        i27 = i27;
                        xmlResourceParserC9735 = xmlResourceParserC9734;
                        String str11111116 = attributeName;
                        i20 = i21111;
                        attributeName = str11111116;
                        String str11111117 = str;
                        i25 = i25;
                        strM4222 = strM4222;
                        str2 = str11111117;
                    } else {
                        iM3169 = C0773.m3169("ۨۛ") ^ i17;
                        attributeCount = i33;
                        i2 = ((iM3169 ^ i18) * 18143) ^ (-179382638);
                        i3 = -1251577426;
                        int i34 = iM3169 ^ i3;
                        i27 = i27;
                        i19 = i2;
                        attributeName = attributeName;
                        i20 = i34;
                    }
                    break;
                case 1168555458:
                case 1670756616:
                    interfaceC14984 = interfaceC14986;
                    if (C3448.m11238(strM5463, RunnableC3646.m11809(f41425, 196, 4, i21))) {
                        iM31613 = (C0619.m2761("۫ܳ") ^ i17) * (-99);
                        i11 = ((iM31613 ^ i18) * (-25731)) ^ 798418732;
                        i12 = 1108667771;
                    } else {
                        iM31613 = C0773.m3169("֡ۜ") ^ i17;
                        i11 = ((iM31613 ^ i18) * 9815) ^ (-1416695524);
                        i12 = 141983762;
                    }
                    interfaceC14985 = interfaceC14984;
                    i20 = iM31613 ^ i12;
                    i19 = i11;
                    interfaceC14986 = interfaceC14985;
                    break;
                case 1243277622:
                case 1675865512:
                    i26 = 5;
                    strM4222 = strM4222;
                    iM31612 = C0773.m3169("᩻֨") ^ i17;
                    i19 = ((iM31612 ^ i18) * (-12455)) ^ 1116684838;
                    i8 = 1370772100;
                    i9 = iM31612 ^ i8;
                    i27 = i27;
                    strM4222 = strM4222;
                    str2 = str2;
                    xmlResourceParserC9735 = xmlResourceParserC9734;
                    String str11111118 = attributeName;
                    i20 = i9;
                    attributeName = str11111118;
                    break;
                default:
                    interfaceC14986.accept(xmlResourceParserC9735.m25336(i23));
                    interfaceC14986.accept(xmlResourceParserC9735.m25348(i23));
                    interfaceC14986.accept(xmlResourceParserC9735.m25341(i23));
                    i27 = i27;
                    if (xmlResourceParserC9735.m25344(i23) != i27) {
                        attributeName = attributeName;
                        iM2761 = C0619.m2761("᩵۫") ^ i18;
                        i19 = ((iM2761 ^ i17) * (-12163)) ^ (-1293581859);
                        i10 = -1571663797;
                        i9 = iM2761 ^ i10;
                        i27 = i27;
                        String str11111119 = attributeName;
                        i20 = i9;
                        attributeName = str11111119;
                    } else {
                        iM3169 = C0773.m3169("ۢۖ") ^ i17;
                        attributeName = attributeName;
                        i2 = ((iM3169 ^ i18) * (-9313)) ^ 2114575788;
                        i3 = 665358674;
                        int i35 = iM3169 ^ i3;
                        i27 = i27;
                        i19 = i2;
                        attributeName = attributeName;
                        i20 = i35;
                    }
                    break;
            }
            return;
        }
    }
}
