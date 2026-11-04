package l;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۨۢ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: C2R7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12267 {

    /* JADX INFO: renamed from: ۢۜۙ, reason: not valid java name and contains not printable characters */
    private static final short[] f39445 = {1753, -14775, 803, 9295, 2646, 3889, -13846, 1719, 26872, 27451, -32691};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3318 f39446;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C3072 f39447;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f39448;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC7793 f39449;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f39450;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C25227 f39451;

    /* JADX WARN: Code duplicated, block: B:107:0x035d  */
    /* JADX WARN: Code duplicated, block: B:119:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:51:0x014b  */
    /* JADX WARN: Code duplicated, block: B:65:0x01c1 A[PHI: r3 r4 r11
      0x01c1: PHI (r3v4 l.ܶ۠᩹) = (r3v3 l.ܶ۠᩹), (r3v2 l.ܶ۠᩹), (r3v2 l.ܶ۠᩹), (r3v2 l.ܶ۠᩹), (r3v2 l.ܶ۠᩹), (r3v2 l.ܶ۠᩹) binds: [B:64:0x01ba, B:53:0x0165, B:47:0x0122, B:41:0x00e9, B:39:0x00d3, B:37:0x00c8] A[DONT_GENERATE, DONT_INLINE]
      0x01c1: PHI (r4v5 l.᩵ۢ֫) = (r4v2 l.᩵ۢ֫), (r4v4 l.᩵ۢ֫), (r4v2 l.᩵ۢ֫), (r4v2 l.᩵ۢ֫), (r4v2 l.᩵ۢ֫), (r4v2 l.᩵ۢ֫) binds: [B:64:0x01ba, B:53:0x0165, B:47:0x0122, B:41:0x00e9, B:39:0x00d3, B:37:0x00c8] A[DONT_GENERATE, DONT_INLINE]
      0x01c1: PHI (r11v6 l.ۢۖ᩹) = (r11v5 l.ۢۖ᩹), (r11v4 l.ۢۖ᩹), (r11v4 l.ۢۖ᩹), (r11v4 l.ۢۖ᩹), (r11v4 l.ۢۖ᩹), (r11v4 l.ۢۖ᩹) binds: [B:64:0x01ba, B:53:0x0165, B:47:0x0122, B:41:0x00e9, B:39:0x00d3, B:37:0x00c8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:83:0x027a  */
    /* JADX WARN: Code duplicated, block: B:95:0x02f8  */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C9829 m30644(C9829 c9829, String str) {
        int iM2761;
        int i;
        int i2 = 0;
        String strM5463 = null;
        InterfaceC15970 interfaceC15970ListIterator = null;
        C20472 c20472 = null;
        int iM10089 = 0;
        int i3 = -1218117735;
        int i4 = C3448.f11240;
        int i5 = C4282.f15546;
        int iM2762 = C0619.m2761("ܺ۫") ^ i5;
        int i6 = ((iM2762 ^ i4) * (-23601)) ^ 1313242158;
        int i7 = -464858172;
        while (true) {
            int i8 = iM2762 ^ i7;
            C9829 c98210 = null;
            while (true) {
                i3 = ((((i3 ^ i4) * (-20317)) >> 31) & i6) ^ i8;
                switch (i3) {
                    case -2141187223:
                    case 1116421120:
                        C2354.m7983();
                        if (AbstractC0116.f1064 <= 0) {
                            iM2761 = (C0773.m3169("۬ܳ") ^ i4) * 67;
                            i6 = ((iM2761 ^ i5) * 11955) ^ (-1792100246);
                            i = -1285431649;
                        } else {
                            iM2761 = C0773.m3169("ܺۗ") ^ i5;
                            i6 = ((iM2761 ^ i4) * 17109) ^ (-1619833377);
                            i = 397582411;
                        }
                        i8 = iM2761 ^ i;
                        break;
                    case -2085694148:
                    case -95237745:
                        if (AbstractC0641.f2496 >= 0) {
                            iM2761 = (C0773.m3169("۬ܳ") ^ i4) * 67;
                            i6 = ((iM2761 ^ i5) * 11955) ^ (-1792100246);
                            i = -1285431649;
                        } else {
                            iM2761 = C0619.m2761("ۡ᩹") ^ i5;
                            i6 = ((iM2761 ^ i4) * (-20889)) ^ 799327961;
                            i = -392134768;
                        }
                        i8 = iM2761 ^ i;
                        break;
                    case -1877923453:
                    case -245694413:
                        C1564.m5509();
                        C3492.m11488();
                        return null;
                    case -1864753230:
                    case -1423417385:
                        if (str != null) {
                            iM2761 = C0619.m2761("֨ۖ") ^ i4;
                            i6 = ((iM2761 ^ i5) * (-4737)) ^ 89540593;
                            i = -1637713809;
                        } else {
                            iM2761 = C0773.m3169("ۜ۠") ^ i5;
                            i6 = ((iM2761 ^ i4) * 11849) ^ (-392038985);
                            i = -881565892;
                        }
                        i8 = iM2761 ^ i;
                        break;
                    case -1721487726:
                    case 570376086:
                        if (C3448.m11238(C1542.m5463(c20472.f65589), strM5463)) {
                            iM2761 = C0619.m2761("֫ۡ") ^ i4;
                            i6 = ((iM2761 ^ i5) * (-22969)) ^ 2115338288;
                            i = -1135010373;
                        } else {
                            iM2761 = (C0619.m2761("ܶۗ") ^ i4) * 99;
                            i6 = ((iM2761 ^ i5) * 12011) ^ 528991348;
                            i = 67433371;
                        }
                        i8 = iM2761 ^ i;
                        break;
                    case -1686547784:
                    case -1085555725:
                        if (c9829.isEmpty()) {
                            i2 = 0;
                            iM2761 = C0619.m2761("ܰܰ") ^ i4;
                            i6 = ((iM2761 ^ i5) * 19385) ^ (-587649218);
                            i = 2022917396;
                            i8 = iM2761 ^ i;
                        } else {
                            int iM2763 = C0619.m2761("᩻᩻") ^ i4;
                            i6 = ((iM2763 ^ i5) * 25959) ^ (-1732311617);
                            i8 = iM2763 ^ 1015662206;
                            i2 = 0;
                        }
                        break;
                    case -1676736657:
                    case -640507627:
                        C0619.m2763();
                        if (C2702.f8586 > 0) {
                            iM2761 = C0773.m3169("۬ܰ") ^ i5;
                            i6 = ((iM2761 ^ i4) * (-27903)) ^ 118926616;
                            i = 580856150;
                        } else {
                            iM2761 = (C0773.m3169("ۜܰ") ^ i4) * 17;
                            i6 = ((iM2761 ^ i5) * (-11213)) ^ 821515404;
                            i = 1061541195;
                        }
                        i8 = iM2761 ^ i;
                        break;
                    case -1657630903:
                    case -506582617:
                        iM10089 = -1;
                        iM2761 = (i4 - C0619.m2761("ۜۘ")) * 99;
                        i6 = ((iM2761 ^ i5) * 13031) ^ 176244105;
                        i = -1262944066;
                        i8 = iM2761 ^ i;
                        break;
                    case -1560939302:
                    case 856816003:
                        C2375.m8065();
                        if (C1343.m4943()) {
                            iM2761 = (C0773.m3169("۬ܳ") ^ i4) * 67;
                            i6 = ((iM2761 ^ i5) * 11955) ^ (-1792100246);
                            i = -1285431649;
                        } else {
                            iM2761 = (C0619.m2761("ܶܰ") ^ i4) * 21;
                            i6 = ((iM2761 ^ i5) * (-1785)) ^ (-220349985);
                            i = -10525569;
                        }
                        i8 = iM2761 ^ i;
                        break;
                    case -1537170124:
                    case 1467811502:
                        return new C9829();
                    case -1498986571:
                    case -271107155:
                        return c9829;
                    case -1467268420:
                    case 722235861:
                        if (C3690.f12684 <= 0) {
                            iM2761 = (C0773.m3169("ܽ᩻") + i5) * (-35);
                            i6 = ((iM2761 ^ i4) * (-7015)) ^ (-1474996137);
                            i = 329631185;
                        } else {
                            iM2761 = (i5 - C0619.m2761("۠ۤ")) * (-21);
                            i6 = ((iM2761 ^ i4) * 11431) ^ 1987727744;
                            i = 1105781864;
                        }
                        i8 = iM2761 ^ i;
                        break;
                    case -1449784956:
                    case 174758657:
                        if (c20472.f65594.applicationInfo.uid == iM10089) {
                            iM2761 = C0773.m3169("ۙܶ") ^ i5;
                            i6 = ((iM2761 ^ i4) * 16137) ^ 1934917815;
                            i = 278668792;
                        } else {
                            iM2761 = C0773.m3169("۠۬") ^ i5;
                            i6 = ((iM2761 ^ i4) * (-26827)) ^ (-1470502219);
                            i = 1547311023;
                        }
                        i8 = iM2761 ^ i;
                        break;
                    case -1323566402:
                    case -374769016:
                        if (C13473.f42873 == 0) {
                            iM2761 = C0773.m3169("ۢ᩸") ^ i4;
                            i6 = ((iM2761 ^ i5) * (-21031)) ^ 1438860720;
                            i = 638319055;
                            i8 = iM2761 ^ i;
                        }
                        break;
                    case -1228129903:
                    case 1414191861:
                        if (!C0619.f2439) {
                            iM2761 = (C0619.m2761("᩵ۨ") ^ i5) * (-113);
                            i6 = ((iM2761 ^ i4) * (-28987)) ^ (-1372754764);
                            i = -2036168710;
                            i8 = iM2761 ^ i;
                        }
                        break;
                    case -1191735271:
                    case 876560784:
                        c98210.add(c20472);
                        iM2761 = C0773.m3169("۠۬") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-26827)) ^ (-1470502219);
                        i = 1547311023;
                        i8 = iM2761 ^ i;
                        break;
                    case -1058436576:
                    case -771125168:
                        if (C3099.m10095()) {
                            iM2761 = (i5 - C0773.m3169("ۨ۟")) * (-105);
                            i6 = ((iM2761 ^ i4) * (-4673)) ^ (-1671679034);
                            i = 4931964;
                        } else {
                            iM2761 = (C0619.m2761("ۧܿ") + i4) * 27;
                            i6 = ((iM2761 ^ i5) * 19057) ^ (-754794564);
                            i = -2054360091;
                        }
                        i8 = iM2761 ^ i;
                        break;
                    case -1001493830:
                    case 887782139:
                        return c98210;
                    case -971348600:
                    case 2023322806:
                        if (C1826.m6317(interfaceC15970ListIterator)) {
                            iM2761 = C0773.m3169("ۨܿ") ^ i4;
                            i6 = ((iM2761 ^ i5) * (-2211)) ^ 392773280;
                            i = -1210046443;
                        } else {
                            iM2761 = (i4 - C0619.m2761("۟᩹")) * 9;
                            i6 = ((iM2761 ^ i5) * 10583) ^ 59265982;
                            i = -289317834;
                        }
                        i8 = iM2761 ^ i;
                        break;
                    case -872206531:
                    case -783377527:
                        if (AbstractC0641.m2813() > 0) {
                            iM2761 = C0619.m2761("ۗۘ") ^ i4;
                            i6 = ((iM2761 ^ i5) * 569) ^ (-1753488346);
                            i = -1140605774;
                            i8 = iM2761 ^ i;
                        }
                        break;
                    case -854010392:
                    case 104614791:
                        C0269.m1775();
                        iM2761 = (C0619.m2761("ܶܰ") ^ i4) * 21;
                        i6 = ((iM2761 ^ i5) * (-1785)) ^ (-220349985);
                        i = -10525569;
                        i8 = iM2761 ^ i;
                        break;
                    case -834491713:
                    case 335302034:
                        if (C2023.m6964() <= 0) {
                            iM2761 = (C0619.m2761("ܶܰ") ^ i4) * 21;
                            i6 = ((iM2761 ^ i5) * (-1785)) ^ (-220349985);
                            i = -10525569;
                        } else {
                            iM2761 = C0619.m2761("᩷ᩴ") ^ i5;
                            i6 = ((iM2761 ^ i4) * (-20439)) ^ 1789670903;
                            i = 262963229;
                        }
                        i8 = iM2761 ^ i;
                        break;
                    case -799348370:
                    case 58239418:
                        if (iM10089 > 0) {
                            iM2761 = C0773.m3169("᩶ܶ") ^ i5;
                            i6 = ((iM2761 ^ i4) * (-18241)) ^ (-372374392);
                            i = 784998292;
                        } else {
                            iM2761 = C0773.m3169("۠۬") ^ i5;
                            i6 = ((iM2761 ^ i4) * (-26827)) ^ (-1470502219);
                            i = 1547311023;
                        }
                        i8 = iM2761 ^ i;
                        break;
                    case -790013608:
                    case -47648832:
                        if (!C13473.m33144()) {
                        }
                        iM2761 = (C0773.m3169("֫ܳ") + i4) * (-51);
                        i6 = ((iM2761 ^ i5) * (-12305)) ^ (-1805561829);
                        i = 137429000;
                        i8 = iM2761 ^ i;
                        break;
                        break;
                    case -725404232:
                    case 827398114:
                        if (c9829.get(i2) == null) {
                            iM2761 = (C0773.m3169("֫ۚ") + i5) * (-69);
                            i6 = ((iM2761 ^ i4) * 22839) ^ (-972068516);
                            i = 1221676130;
                        } else {
                            iM2761 = C0619.m2761("ܰܰ") ^ i4;
                            i6 = ((iM2761 ^ i5) * 19385) ^ (-587649218);
                            i = 2022917396;
                        }
                        i8 = iM2761 ^ i;
                        break;
                    case -723767048:
                    case 1401372320:
                        if (AbstractC3624.f12429 <= 0) {
                            iM2761 = C0619.m2761("᩺ᩴ") ^ i5;
                            i6 = ((iM2761 ^ i4) * (-30089)) ^ (-218706987);
                            i = -1196427456;
                        } else {
                            iM2761 = (i5 - C0773.m3169("ܳۗ")) * (-27);
                            i6 = ((iM2761 ^ i4) * 9617) ^ 907059163;
                            i = -537135883;
                        }
                        i8 = iM2761 ^ i;
                        break;
                    case -493316412:
                    case 1620448128:
                        int size = c9829.size();
                        if (RunnableC3055.f9898 < 0) {
                            c98210 = new C9829(size);
                            interfaceC15970ListIterator = c9829.listIterator(i2);
                            iM2761 = C0773.m3169("۠۬") ^ i5;
                            i6 = ((iM2761 ^ i4) * (-26827)) ^ (-1470502219);
                            i = 1547311023;
                            i8 = iM2761 ^ i;
                        }
                        break;
                    case -389517586:
                    case -246647173:
                        if (C3448.m11238(C3690.m11995(c20472.m46976()), strM5463)) {
                            iM2761 = C0619.m2761("֫ۡ") ^ i4;
                            i6 = ((iM2761 ^ i5) * (-22969)) ^ 2115338288;
                            i = -1135010373;
                        } else {
                            iM2761 = (C0773.m3169("ۛۛ") + i5) * 5;
                            i6 = ((iM2761 ^ i4) * 359) ^ 1378764333;
                            i = -1765262369;
                        }
                        i8 = iM2761 ^ i;
                        break;
                    case -281967111:
                    case 1236182355:
                        try {
                            iM10089 = C3099.m10089(strM5463);
                            iM2761 = (i4 - C0619.m2761("ۜۘ")) * 99;
                            i6 = ((iM2761 ^ i5) * 13031) ^ 176244105;
                            i = -1262944066;
                        } catch (Exception unused) {
                            iM2761 = (i5 - C0773.m3169("ܿܳ")) * (-7);
                            i6 = ((iM2761 ^ i4) * (-15321)) ^ 835124695;
                            i = 507655326;
                        }
                        i8 = iM2761 ^ i;
                        break;
                    case -109444914:
                    case 1801086692:
                        if (C4282.f15546 <= 0) {
                        }
                        iM2761 = C0773.m3169("۬ܰ") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-27903)) ^ 118926616;
                        i = 580856150;
                        i8 = iM2761 ^ i;
                        break;
                    case 171507515:
                    case 1974348878:
                        strM5463 = C1542.m5463(str);
                        iM2761 = (i5 - C0619.m2761("᩸ܰ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i6 = ((iM2761 ^ i4) * 14269) ^ 83581845;
                        i = 1668766046;
                        i8 = iM2761 ^ i;
                        break;
                    case 209109228:
                    case 584723918:
                        if (C3448.m11248() != 0) {
                            iM2761 = C0773.m3169("۬ܰ") ^ i5;
                            i6 = ((iM2761 ^ i4) * (-27903)) ^ 118926616;
                            i = 580856150;
                        } else {
                            iM2761 = C0773.m3169("ۖۙ") ^ i4;
                            i6 = ((iM2761 ^ i5) * 31847) ^ (-249261191);
                            i = 1747547404;
                        }
                        i8 = iM2761 ^ i;
                        break;
                    case 558351636:
                    case 2018878204:
                        if (C2878.f9462) {
                            iM2761 = (C0619.m2761("ܶܰ") ^ i4) * 21;
                            i6 = ((iM2761 ^ i5) * (-1785)) ^ (-220349985);
                            i = -10525569;
                        } else {
                            iM2761 = C0773.m3169("۬ܰ") ^ i5;
                            i6 = ((iM2761 ^ i4) * (-27903)) ^ 118926616;
                            i = 580856150;
                        }
                        i8 = iM2761 ^ i;
                        break;
                    case 1334330613:
                    case 1982558951:
                        if (C2878.m9480(str)) {
                            iM2761 = C0773.m3169("ۜ۠") ^ i5;
                            i6 = ((iM2761 ^ i4) * 11849) ^ (-392038985);
                            i = -881565892;
                        } else {
                            iM2761 = (C0773.m3169("ᩳ۬") ^ i4) * 35;
                            i6 = ((iM2761 ^ i5) * 22421) ^ 209551005;
                            i = -938959770;
                        }
                        i8 = iM2761 ^ i;
                        break;
                    case 1402604505:
                    case 1936287408:
                        C3033.m9845();
                        if (C2023.f6737) {
                        }
                        iM2761 = (i5 - C0773.m3169("ۨ۟")) * (-105);
                        i6 = ((iM2761 ^ i4) * (-4673)) ^ (-1671679034);
                        i = 4931964;
                        i8 = iM2761 ^ i;
                        break;
                    case 1410340747:
                    case 2070719736:
                        c98210.add(c20472);
                        iM2761 = C0773.m3169("۠۬") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-26827)) ^ (-1470502219);
                        i = 1547311023;
                        i8 = iM2761 ^ i;
                        break;
                    case 1604930020:
                    case 1740407696:
                        c20472 = (C20472) C0950.m3796(interfaceC15970ListIterator);
                        if (c20472 == null) {
                            iM2761 = C0773.m3169("۠۬") ^ i5;
                            i6 = ((iM2761 ^ i4) * (-26827)) ^ (-1470502219);
                            i = 1547311023;
                        } else {
                            iM2761 = C0773.m3169("ܺ᩺") ^ i5;
                            i6 = ((iM2761 ^ i4) * (-26075)) ^ (-416306486);
                            i = -865391749;
                        }
                        i8 = iM2761 ^ i;
                        break;
                    default:
                        if (C3099.f10023 > 0) {
                            iM2761 = (C0619.m2761("ܶܰ") ^ i4) * 21;
                            i6 = ((iM2761 ^ i5) * (-1785)) ^ (-220349985);
                            i = -10525569;
                        } else {
                            iM2761 = C0619.m2761("᩺ᩴ") ^ i5;
                            i6 = ((iM2761 ^ i4) * (-30089)) ^ (-218706987);
                            i = -1196427456;
                        }
                        i8 = iM2761 ^ i;
                        break;
                }
            }
            iM2762 = C0773.m3169("ۢۙ") ^ i4;
            i6 = ((iM2762 ^ i5) * (-17105)) ^ 137596958;
            i7 = -896316065;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6302 m30643(C9829 c9829, String str) {
        C9829 c9829M30644 = null;
        InterfaceC15970 interfaceC15970ListIterator = null;
        int i = 0;
        C20472 c20472 = null;
        int i2 = 30222183;
        int i3 = C3448.f11240;
        int i4 = C4282.f15546;
        int iM2761 = C0619.m2761("᩻᩶") ^ i4;
        int i5 = ((iM2761 ^ i3) * 21591) ^ 490610712;
        int i6 = -1142030441;
        while (true) {
            i2 = ((((i2 ^ i3) * 31345) >> 31) & i5) ^ (iM2761 ^ i6);
            switch (i2) {
                case -2134741352:
                case 386660022:
                    i++;
                    iM2761 = (C0619.m2761("ۚ᩵") ^ i3) * (-53);
                    i5 = ((iM2761 ^ i4) * 17597) ^ 345582651;
                    i6 = -1261678949;
                    break;
                case -1995227154:
                case -312836305:
                    C20932.m47848();
                    if (C2310.m7813() <= 0) {
                        iM2761 = C0619.m2761("ۜۡ") ^ i3;
                        i5 = ((iM2761 ^ i4) * 12075) ^ (-1204347602);
                        i6 = -981471524;
                    } else {
                        iM2761 = C0773.m3169("ۖ֡") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-8027)) ^ (-638371393);
                        i6 = -512208717;
                    }
                    break;
                case -1991949527:
                case 217131419:
                    C0487.m2356();
                    if (!C17202.m40372()) {
                        iM2761 = C0773.m3169("ۖ֡") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-8027)) ^ (-638371393);
                        i6 = -512208717;
                    } else {
                        iM2761 = (C0773.m3169("ۘۤ") + i4) * (-33);
                        i5 = ((iM2761 ^ i3) * (-6079)) ^ 511883610;
                        i6 = 361468889;
                    }
                    break;
                case -1943813271:
                case 872314541:
                    if (c20472.f65591) {
                        iM2761 = C0773.m3169("ۚۜ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-5087)) ^ (-2036679873);
                        i6 = -12414638;
                    } else {
                        iM2761 = (C0619.m2761("ۚ᩵") ^ i3) * (-53);
                        i5 = ((iM2761 ^ i4) * 17597) ^ 345582651;
                        i6 = -1261678949;
                    }
                    break;
                case -1916316914:
                case 1601146740:
                    interfaceC15970ListIterator = c9829.listIterator(0);
                    i = 0;
                    iM2761 = (C0619.m2761("ۚ᩵") ^ i3) * (-53);
                    i5 = ((iM2761 ^ i4) * 17597) ^ 345582651;
                    i6 = -1261678949;
                    break;
                case -1810795146:
                case 2071972380:
                    if (C3033.f9831 >= 0) {
                        iM2761 = C0773.m3169("ۖ֡") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-8027)) ^ (-638371393);
                        i6 = -512208717;
                    } else {
                        iM2761 = C0773.m3169("֨ܿ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 20687) ^ 562681120;
                        i6 = -48285320;
                    }
                    break;
                case -1622339623:
                case -1292473063:
                    if (C3448.f11240 >= 0) {
                        iM2761 = (C0773.m3169("᩹᩷") ^ i3) * (-105);
                        i5 = ((iM2761 ^ i4) * 13729) ^ (-2139737329);
                        i6 = -1246552045;
                    } else {
                        iM2761 = C0773.m3169("֡ۢ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-22977)) ^ 101947076;
                        i6 = 2086173873;
                    }
                    break;
                case -1539331702:
                case -975489491:
                    C2878.m9491();
                    C2375.m8065();
                    return null;
                case -1300359915:
                case 1805195823:
                    if (AbstractC0116.f1064 <= 0) {
                        iM2761 = (C0773.m3169("᩹᩷") ^ i3) * (-105);
                        i5 = ((iM2761 ^ i4) * 13729) ^ (-2139737329);
                        i6 = -1246552045;
                    } else {
                        iM2761 = (C0619.m2761("֡ۨ") + i3) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i5 = ((iM2761 ^ i4) * 24905) ^ 1622608648;
                        i6 = -529572417;
                    }
                    break;
                case -1275261432:
                case 504080071:
                    return new C6302(c9829, c9829M30644, str, i);
                case -653851756:
                case 1124640001:
                    if (C3033.f9831 >= 0) {
                        iM2761 = (C0773.m3169("᩹᩷") ^ i3) * (-105);
                        i5 = ((iM2761 ^ i4) * 13729) ^ (-2139737329);
                        i6 = -1246552045;
                    } else {
                        iM2761 = C0773.m3169("᩻۟") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-29413)) ^ (-1424232301);
                        i6 = -1681830021;
                    }
                    break;
                case -641978118:
                case -229220922:
                    if (AbstractC0116.f1064 <= 0) {
                        iM2761 = (C0773.m3169("ۘۤ") + i4) * (-33);
                        i5 = ((iM2761 ^ i3) * (-6079)) ^ 511883610;
                        i6 = 361468889;
                    } else {
                        iM2761 = (C0773.m3169("֡۠") + i3) * 99;
                        i5 = ((iM2761 ^ i4) * (-17259)) ^ 779069245;
                        i6 = 773636553;
                    }
                    break;
                case -619250288:
                case 1672158292:
                    if (C1080.m4050()) {
                        iM2761 = (i4 - C0619.m2761("ۧ۠")) * (-83);
                        i5 = ((iM2761 ^ i3) * (-20057)) ^ (-922086308);
                        i6 = 1957280931;
                    } else {
                        iM2761 = C0619.m2761("ۜۡ") ^ i3;
                        i5 = ((iM2761 ^ i4) * 12075) ^ (-1204347602);
                        i6 = -981471524;
                    }
                    break;
                case -86583770:
                case 136675481:
                    if (C2702.f8586 <= 0) {
                        iM2761 = C0773.m3169("ۖ֡") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-8027)) ^ (-638371393);
                        i6 = -512208717;
                    } else {
                        iM2761 = (C0619.m2761("۫ܺ") ^ i4) * (-87);
                        i5 = ((iM2761 ^ i3) * 29797) ^ 512392013;
                        i6 = 1941028335;
                    }
                    break;
                case -3616987:
                case 1166595316:
                    if (C1146.m4231()) {
                        iM2761 = C0619.m2761("ܳۖ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-22431)) ^ 2080579877;
                        i6 = -39560574;
                    } else {
                        iM2761 = C0619.m2761("᩷۬") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-4079)) ^ 1671899015;
                        i6 = -906298513;
                    }
                    break;
                case 11224839:
                case 1938540569:
                    if (C3779.m12264()) {
                        iM2761 = C0619.m2761("᩺ۢ") ^ i3;
                        i5 = ((iM2761 ^ i4) * 30703) ^ 242356209;
                        i6 = -1948148902;
                    } else {
                        iM2761 = C0619.m2761("᩷۬") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-4079)) ^ 1671899015;
                        i6 = -906298513;
                    }
                    break;
                case 116488413:
                case 1545446020:
                    if (C1826.m6317(interfaceC15970ListIterator)) {
                        iM2761 = C0619.m2761("᩵ۖ") ^ i3;
                        i5 = ((iM2761 ^ i4) * 30653) ^ (-1226432209);
                        i6 = -1773393711;
                    } else {
                        iM2761 = C0773.m3169("ܿ᩸") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-21553)) ^ 9975737;
                        i6 = 984146635;
                    }
                    break;
                case 472231875:
                case 758548991:
                    C2834.m9344();
                    iM2761 = C0773.m3169("ۖ֡") ^ i4;
                    i5 = ((iM2761 ^ i3) * (-8027)) ^ (-638371393);
                    i6 = -512208717;
                    break;
                case 725661082:
                case 939110946:
                    c9829M30644 = m30644(c9829, str);
                    if (C3077.f9998) {
                        iM2761 = (i4 - C0619.m2761("ۤ᩵")) * (-125);
                        i5 = ((iM2761 ^ i3) * (-30491)) ^ 1168861032;
                        i6 = -1857570814;
                    } else {
                        iM2761 = (C0773.m3169("᩹᩷") ^ i3) * (-105);
                        i5 = ((iM2761 ^ i4) * 13729) ^ (-2139737329);
                        i6 = -1246552045;
                    }
                    break;
                case 2036930355:
                case 2114367350:
                    c20472 = (C20472) C0950.m3796(interfaceC15970ListIterator);
                    if (c20472 != null) {
                        iM2761 = C0773.m3169("ۜۙ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-4697)) ^ (-2134797914);
                        i6 = 391975621;
                    } else {
                        iM2761 = (C0619.m2761("ۚ᩵") ^ i3) * (-53);
                        i5 = ((iM2761 ^ i4) * 17597) ^ 345582651;
                        i6 = -1261678949;
                    }
                    break;
                default:
                    if (C1146.f4234 < 0) {
                        iM2761 = C0619.m2761("᩷۬") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-4079)) ^ 1671899015;
                        i6 = -906298513;
                    } else {
                        iM2761 = C0619.m2761("ۜۡ") ^ i3;
                        i5 = ((iM2761 ^ i4) * 12075) ^ (-1204347602);
                        i6 = -981471524;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0099, code lost:
    
        if (l.C1321.f4751 >= 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C12267(l.ViewOnClickListenerC7793 r23, boolean r24) {
        /*
            Method dump skipped, instruction units count: 778
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C12267.<init>(l.۟ۢ֫, boolean):void");
    }

    /* JADX WARN: Code duplicated, block: B:72:0x0222  */
    /* JADX WARN: Code duplicated, block: B:76:0x024e  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9829 m30645(ArrayList arrayList) {
        int iM2761;
        int i;
        Iterator itM4942 = null;
        C20472 c20472 = null;
        PackageInfo packageInfo = null;
        ApplicationInfo applicationInfo = null;
        boolean z = false;
        int i2 = 2011088137;
        int i3 = C1542.f5343;
        int i4 = C0269.f1558;
        int iM2762 = C0619.m2761("᩶۟") ^ i4;
        int i5 = ((iM2762 ^ i3) * (-3265)) ^ 418135372;
        int i6 = -502842278;
        while (true) {
            int i7 = iM2762 ^ i6;
            C9829 c9829 = null;
            while (true) {
                i2 = ((((i2 ^ i3) * 18441) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -1854234557:
                    case -1766540393:
                        packageInfo = c20472.f65594;
                        if (!RunnableC0334.m2063()) {
                            iM2761 = C0773.m3169("᩹֫") ^ i3;
                            i5 = ((iM2761 ^ i4) * 541) ^ 18293469;
                            i = 1045512199;
                            i7 = iM2761 ^ i;
                        }
                        break;
                    case -1736640748:
                    case -1656877897:
                        if (C0950.f3488 < 0) {
                            c9829 = new C9829();
                            itM4942 = C1343.m4942(arrayList);
                            iM2761 = (i4 - C0773.m3169("۠ۗ")) * (-37);
                            i5 = ((iM2761 ^ i3) * 19305) ^ 530536962;
                            i = -321368326;
                            i7 = iM2761 ^ i;
                        }
                        break;
                    case -1676445452:
                    case -969703230:
                        if (C3998.m12923(itM4942)) {
                            iM2761 = (C0619.m2761("ܰۢ") ^ i4) * (-9);
                            i5 = ((iM2761 ^ i3) * 19411) ^ 702088450;
                            i = -374145349;
                        } else {
                            iM2761 = C0619.m2761("ܰۨ") ^ i3;
                            i5 = ((iM2761 ^ i4) * (-9161)) ^ (-589559154);
                            i = -657718710;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case -1673350330:
                    case -851271828:
                        if (C0619.m2763()) {
                            iM2761 = (C0619.m2761("ܽܰ") ^ i3) * 115;
                            i5 = ((iM2761 ^ i4) * (-21339)) ^ (-679898836);
                            i = 1498021711;
                        } else {
                            iM2761 = (C0619.m2761("᩻᩺") + i4) * (-51);
                            i5 = ((iM2761 ^ i3) * 16677) ^ 1240358254;
                            i = -1688644905;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case -1597128083:
                    case 253735729:
                        if (RunnableC0334.f1808 <= 0) {
                            iM2761 = C0619.m2761("֫֫") ^ i3;
                            i5 = ((iM2761 ^ i4) * (-8737)) ^ 1242144246;
                            i = 1564181702;
                        } else {
                            iM2761 = C0773.m3169("ۡܰ") ^ i3;
                            i5 = ((iM2761 ^ i4) * 31347) ^ 335544561;
                            i = -1079973080;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case -1521928556:
                    case 909800120:
                        if (C11235.f35427 < 0) {
                            iM2761 = (C0773.m3169("᩷۠") ^ i4) * 11;
                            i5 = ((iM2761 ^ i3) * 14977) ^ (-733010883);
                            i = -1618807898;
                            i7 = iM2761 ^ i;
                        }
                        break;
                    case -1396212135:
                    case 1999878777:
                        applicationInfo = packageInfo.applicationInfo;
                        if (C2702.f8586 > 0) {
                            iM2761 = (C0773.m3169("ۙ֨") + i4) * 7;
                            i5 = ((iM2761 ^ i3) * (-677)) ^ 881424012;
                            i = 1292730926;
                            i7 = iM2761 ^ i;
                        }
                        break;
                    case -1343412862:
                    case 1216126452:
                        if (C3734.m12152() >= 0) {
                            iM2761 = C0619.m2761("֫֫") ^ i3;
                            i5 = ((iM2761 ^ i4) * (-8737)) ^ 1242144246;
                            i = 1564181702;
                        } else {
                            iM2761 = (C0773.m3169("᩶ۛ") ^ i4) * (-9);
                            i5 = ((iM2761 ^ i3) * 16667) ^ (-249785002);
                            i = 1013131102;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case -1210322566:
                    case 133798988:
                        if ((applicationInfo.flags & 129) == 0) {
                            iM2761 = (C0619.m2761("ᩴۙ") + i3) * 13;
                            i5 = ((iM2761 ^ i4) * (-23255)) ^ 2008456566;
                            i = -1941143310;
                        } else {
                            iM2761 = (i4 - C0773.m3169("ܽ۬")) * 69;
                            i5 = ((iM2761 ^ i3) * (-9437)) ^ (-1965220289);
                            i = -651959127;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case -1192869289:
                    case -1086887344:
                        c20472 = (C20472) C0950.m3796(itM4942);
                        if (C0487.f2131 > 0) {
                            iM2761 = C0773.m3169("᩻֫") ^ i3;
                            i5 = ((iM2761 ^ i4) * 14995) ^ (-487355827);
                            i = -539606741;
                            i7 = iM2761 ^ i;
                        }
                        break;
                    case -1097190480:
                    case 1875623293:
                        if (C2023.m6964() <= 0) {
                            iM2761 = C0619.m2761("֫֫") ^ i3;
                            i5 = ((iM2761 ^ i4) * (-8737)) ^ 1242144246;
                            i = 1564181702;
                        } else {
                            iM2761 = (C0773.m3169("ۛ֨") ^ i3) * 87;
                            i5 = ((iM2761 ^ i4) * 31533) ^ 2052857476;
                            i = 1253499075;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case -1093927793:
                    case 1044545286:
                        C1321.m4852();
                        if (C2702.f8586 > 0) {
                            iM2761 = C0619.m2761("֫֫") ^ i3;
                            i5 = ((iM2761 ^ i4) * (-8737)) ^ 1242144246;
                            i = 1564181702;
                        } else {
                            iM2761 = (C0619.m2761("ܽܰ") ^ i3) * 115;
                            i5 = ((iM2761 ^ i4) * (-21339)) ^ (-679898836);
                            i = 1498021711;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case -653914575:
                    case 341504394:
                        C2310.m7813();
                        return null;
                    case -637716357:
                    case -601669101:
                        C0950.m3785();
                        if (C3690.f12684 > 0) {
                            iM2761 = (C0619.m2761("ܽܰ") ^ i3) * 115;
                            i5 = ((iM2761 ^ i4) * (-21339)) ^ (-679898836);
                            i = 1498021711;
                        } else {
                            iM2761 = (C0619.m2761("᩻᩻") ^ i4) * (-83);
                            i5 = ((iM2761 ^ i3) * 31303) ^ 595701808;
                            i = -1843831083;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case -589247925:
                    case 913063727:
                        z = true;
                        iM2761 = (i4 - C0619.m2761("֡᩸")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i5 = ((iM2761 ^ i3) * (-31905)) ^ 697416978;
                        i = -1841615280;
                        i7 = iM2761 ^ i;
                        break;
                    case -310379512:
                    case 961639446:
                        if (z == this.f39448) {
                            iM2761 = C0773.m3169("۫ۛ") ^ i3;
                            i5 = ((iM2761 ^ i4) * 18727) ^ (-42603512);
                            i = 666219590;
                        } else {
                            iM2761 = (i4 - C0773.m3169("۠ۗ")) * (-37);
                            i5 = ((iM2761 ^ i3) * 19305) ^ 530536962;
                            i = -321368326;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case -254159360:
                    case 1794008488:
                        C0619.m2763();
                        C2485.m8357();
                        iM2761 = C0619.m2761("֫֫") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-8737)) ^ 1242144246;
                        i = 1564181702;
                        i7 = iM2761 ^ i;
                        break;
                    case -155060373:
                    case 1511373518:
                        if (C2310.f7472 >= 0) {
                            iM2761 = (C0619.m2761("ܽܰ") ^ i3) * 115;
                            i5 = ((iM2761 ^ i4) * (-21339)) ^ (-679898836);
                            i = 1498021711;
                        } else {
                            iM2761 = C0773.m3169("ܺۘ") ^ i3;
                            i5 = ((iM2761 ^ i4) * (-30655)) ^ 1885705235;
                            i = 1567045796;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case 335945302:
                    case 721152104:
                        if (C0487.f2131 <= 0) {
                            iM2761 = C0619.m2761("֫֫") ^ i3;
                            i5 = ((iM2761 ^ i4) * (-8737)) ^ 1242144246;
                            i = 1564181702;
                        } else {
                            iM2761 = (C0619.m2761("ܿۛ") ^ i4) * (-53);
                            i5 = ((iM2761 ^ i3) * 6893) ^ (-269968156);
                            i = 1504452092;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case 422495922:
                    case 1693142201:
                        z = false;
                        iM2761 = (i4 - C0619.m2761("֡᩸")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i5 = ((iM2761 ^ i3) * (-31905)) ^ 697416978;
                        i = -1841615280;
                        i7 = iM2761 ^ i;
                        break;
                    case 1185925159:
                    case 1859430714:
                        c9829.add(c20472);
                        c20472.f65592 = this;
                        iM2761 = (i4 - C0773.m3169("۠ۗ")) * (-37);
                        i5 = ((iM2761 ^ i3) * 19305) ^ 530536962;
                        i = -321368326;
                        i7 = iM2761 ^ i;
                        break;
                    default:
                        ViewOnClickListenerC7793.m21207(c9829);
                        return c9829;
                }
            }
            iM2762 = (C0619.m2761("ۡ᩵") ^ i3) * 115;
            i5 = ((iM2762 ^ i4) * (-27919)) ^ 2131436175;
            i6 = 794122547;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00dd A[PHI: r12 r13 r14
      0x00dd: PHI (r12v4 short[]) = (r12v3 short[]), (r12v2 short[]), (r12v2 short[]), (r12v2 short[]), (r12v2 short[]), (r12v2 short[]) binds: [B:30:0x00db, B:22:0x0096, B:17:0x007e, B:15:0x007b, B:11:0x005b, B:8:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x00dd: PHI (r13v4 int) = (r13v3 int), (r13v2 int), (r13v2 int), (r13v2 int), (r13v2 int), (r13v2 int) binds: [B:30:0x00db, B:22:0x0096, B:17:0x007e, B:15:0x007b, B:11:0x005b, B:8:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x00dd: PHI (r14v4 int) = (r14v3 int), (r14v2 int), (r14v2 int), (r14v2 int), (r14v2 int), (r14v2 int) binds: [B:30:0x00db, B:22:0x0096, B:17:0x007e, B:15:0x007b, B:11:0x005b, B:8:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0268 A[PHI: r2 r3 r9
      0x0268: PHI (r2v4 int) = (r2v2 int), (r2v3 int), (r2v2 int) binds: [B:65:0x0266, B:46:0x019d, B:8:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x0268: PHI (r3v4 int) = (r3v2 int), (r3v3 int), (r3v2 int) binds: [B:65:0x0266, B:46:0x019d, B:8:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x0268: PHI (r9v4 int) = (r9v3 int), (r9v2 int), (r9v2 int) binds: [B:65:0x0266, B:46:0x019d, B:8:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x02d7 A[PHI: r7 r8 r19
      0x02d7: PHI (r7v3 short) = (r7v2 short), (r7v2 short), (r7v4 short) binds: [B:77:0x02d5, B:73:0x02b9, B:69:0x029a] A[DONT_GENERATE, DONT_INLINE]
      0x02d7: PHI (r8v3 int) = (r8v2 int), (r8v2 int), (r8v4 int) binds: [B:77:0x02d5, B:73:0x02b9, B:69:0x029a] A[DONT_GENERATE, DONT_INLINE]
      0x02d7: PHI (r19v5 short[]) = (r19v3 short[]), (r19v4 short[]), (r19v3 short[]) binds: [B:77:0x02d5, B:73:0x02b9, B:69:0x029a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:82:0x0306 A[PHI: r5 r10
      0x0306: PHI (r5v4 int) = (r5v2 int), (r5v2 int), (r5v3 int), (r5v2 int) binds: [B:81:0x0304, B:61:0x0244, B:26:0x00bb, B:15:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x0306: PHI (r10v4 short) = (r10v2 short), (r10v3 short), (r10v2 short), (r10v2 short) binds: [B:81:0x0304, B:61:0x0244, B:26:0x00bb, B:15:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30647(boolean z, ViewOnClickListenerC21218 viewOnClickListenerC21218) {
        int iM3169;
        int i;
        int i2;
        int i3 = C3492.f12043;
        int i4 = C2310.f7472;
        int iM31610 = (i3 - C0773.m3169("ܺۛ")) * (-67);
        int i5 = ((iM31610 ^ i4) * 12341) ^ (-328240932);
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM31610 ^ 934590904;
        ViewOnClickListenerC7793 viewOnClickListenerC7793 = null;
        int bindingAdapterPosition = 0;
        int i7 = 0;
        int i8 = 0;
        int iM2761 = 0;
        short s = 0;
        int i9 = 0;
        int i10 = 0;
        short s2 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = -703668648;
        while (true) {
            i14 = i6 ^ (i5 & (((i14 ^ i4) * 11195) >> 31));
            switch (i14) {
                case -2127492186:
                case 115071173:
                    int i15 = s + s2;
                    if (i10 - (i15 * i15) < 0) {
                        iM3169 = (C0619.m2761("ۨ᩻") ^ i4) * (-127);
                        i = ((iM3169 ^ i3) * 3597) ^ 955928813;
                        i2 = 826974276;
                    } else {
                        iM3169 = C0773.m3169("ܳۚ") ^ i3;
                        i = ((iM3169 ^ i4) * (-3971)) ^ 112750496;
                        i2 = 739400359;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -2113938064:
                case -109480524:
                    int iAbs = Math.abs(i7);
                    viewOnClickListenerC7793.f25895 = bindingAdapterPosition;
                    i8 = 1;
                    if (iAbs == 1) {
                        iM3169 = (C0773.m3169("ۘ֫") ^ i3) * (-87);
                        i = ((iM3169 ^ i4) * 9463) ^ 127963537;
                        i2 = 692532000;
                    } else {
                        iM3169 = C0619.m2761("ۙܿ") ^ i4;
                        i = ((iM3169 ^ i3) * 20137) ^ (-1423846493);
                        i2 = -2011797384;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -2079225922:
                case -1391857381:
                    s2 = 311;
                    if (C3492.f12043 <= 0) {
                        iM3169 = C0619.m2761("ܿܺ") ^ i3;
                        i = ((iM3169 ^ i4) * 28099) ^ (-878658626);
                        i2 = 2013284794;
                    } else {
                        iM3169 = C0773.m3169("۠᩷") ^ i4;
                        i = ((iM3169 ^ i3) * 31245) ^ 734510392;
                        i2 = 1459875688;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -2037658348:
                case 925653540:
                    s = sArr[7];
                    i9 = s * s;
                    if (C2310.f7472 >= 0) {
                        iM3169 = C0619.m2761("ۗ۬") ^ i3;
                        i = ((iM3169 ^ i4) * (-31457)) ^ (-555563965);
                        i2 = 433835560;
                    } else {
                        iM3169 = C0773.m3169("ۢ᩵") ^ i4;
                        i = ((iM3169 ^ i3) * 24363) ^ 347526700;
                        i2 = 1998205873;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -2006609134:
                case -1240573817:
                    if (viewOnClickListenerC7793.f25885 == 5) {
                        iM3169 = (C0773.m3169("۫֨") ^ i3) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM3169 ^ i4) * 31997) ^ (-1350783665);
                        i2 = 1263365821;
                    } else {
                        iM3169 = C0619.m2761("ۖۛ") ^ i4;
                        i = ((iM3169 ^ i3) * 545) ^ (-659780903);
                        i2 = -874884642;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1912621426:
                case 587188804:
                    i11 = 1189;
                    iM3169 = C0773.m3169("ᩳ᩷") ^ i3;
                    i = ((iM3169 ^ i4) * (-22619)) ^ 527262166;
                    i2 = -1232649931;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1793461349:
                case -349977299:
                    sArr = f39445;
                    if (C2354.m7983()) {
                        iM3169 = (i3 - C0773.m3169("֡ܿ")) * 25;
                        i = ((iM3169 ^ i4) * (-26467)) ^ 435272530;
                        i2 = -1003501001;
                    } else {
                        iM3169 = C0619.m2761("ۗ۬") ^ i3;
                        i = ((iM3169 ^ i4) * (-31457)) ^ (-555563965);
                        i2 = 433835560;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1791028906:
                case -1591158981:
                    int i16 = 96721 + i9;
                    i10 = i16 + i16;
                    if (C4282.f15546 <= 0) {
                        iM3169 = C0619.m2761("֡ۗ") ^ i4;
                        i = ((iM3169 ^ i3) * 21813) ^ 1046376787;
                        i2 = 616778976;
                    } else {
                        iM3169 = C0619.m2761("֫۫") ^ i3;
                        i = ((iM3169 ^ i4) * 20661) ^ 923926613;
                        i2 = -1090528398;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1702838581:
                case 402029229:
                    bindingAdapterPosition = viewOnClickListenerC21218.getBindingAdapterPosition();
                    i7 = bindingAdapterPosition - viewOnClickListenerC7793.f25895;
                    if (C20932.f66974 <= 0) {
                        iM3169 = C0619.m2761("֡ۗ") ^ i4;
                        i = ((iM3169 ^ i3) * 21813) ^ 1046376787;
                        i2 = 616778976;
                    } else {
                        iM3169 = C0619.m2761("ۜ᩻") ^ i4;
                        i = ((iM3169 ^ i3) * 18093) ^ 641350247;
                        i2 = 793481714;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1674373688:
                case -1544205187:
                    if (RunnableC3646.f12471) {
                        iM3169 = C0619.m2761("ۗ۬") ^ i3;
                        i = ((iM3169 ^ i4) * (-31457)) ^ (-555563965);
                        i2 = 433835560;
                    } else {
                        iM3169 = C0773.m3169("ۢ᩺") ^ i4;
                        i = ((iM3169 ^ i3) * 15999) ^ (-811389682);
                        i2 = 1024532908;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1519217768:
                case 1159091210:
                    viewOnClickListenerC7793 = this.f39449;
                    if (z) {
                        int iM31611 = (i3 - C0773.m3169("ۜ۬")) * 81;
                        i5 = ((iM31611 ^ i4) * (-16461)) ^ (-757523562);
                        i6 = iM31611 ^ (-901603902);
                    } else {
                        iM3169 = C0773.m3169("۠ۢ") ^ i4;
                        i = ((iM3169 ^ i3) * (-5141)) ^ (-1934144644);
                        i2 = 75092635;
                        i6 = iM3169 ^ i2;
                        i5 = i;
                    }
                    break;
                case -1463712382:
                case 1579464871:
                    viewOnClickListenerC7793.f25885 = i8;
                    iM3169 = (C0619.m2761("ۜ᩷") ^ i3) * 63;
                    i = ((iM3169 ^ i4) * (-31299)) ^ (-1358928946);
                    i2 = 1640174524;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1393472129:
                case 606718601:
                    sArr2 = f39445;
                    i12 = 8;
                    i13 = 3;
                    if (C2288.f7433 <= 0) {
                        iM3169 = C0619.m2761("ܰᩴ") ^ i4;
                        i = ((iM3169 ^ i3) * (-23449)) ^ (-1653816515);
                        i2 = 1857872952;
                    } else {
                        iM3169 = (i4 - C0773.m3169("ܽۖ")) * 61;
                        i = ((iM3169 ^ i3) * 31975) ^ (-1178993706);
                        i2 = -795754050;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1198647771:
                case -539577772:
                    C0773.m3161();
                    break;
                case -1012094098:
                case 501776450:
                    break;
                case -651929058:
                case 1250896503:
                    iM2761 = C0619.m2761(C3779.m12266(sArr2, i12, i13, i11));
                    if (C3099.m10095()) {
                        iM3169 = C0619.m2761("ܿܺ") ^ i3;
                        i = ((iM3169 ^ i4) * 28099) ^ (-878658626);
                        i2 = 2013284794;
                    } else {
                        iM3169 = C0619.m2761("ܺ᩵") ^ i3;
                        i = ((iM3169 ^ i4) * 25013) ^ (-922569952);
                        i2 = -400803508;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -578194622:
                case -219024657:
                    if (C4238.f15451 >= 0) {
                        iM3169 = C0619.m2761("ܰᩴ") ^ i4;
                        i = ((iM3169 ^ i3) * (-23449)) ^ (-1653816515);
                        i2 = 1857872952;
                    } else {
                        iM3169 = (C0619.m2761("۫ۜ") ^ i3) * 87;
                        i = ((iM3169 ^ i4) * (-563)) ^ (-2069888211);
                        i2 = -1655921117;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -400035529:
                case 1811296936:
                    C2966.m9664();
                    iM3169 = C0619.m2761("ܰᩴ") ^ i4;
                    i = ((iM3169 ^ i3) * (-23449)) ^ (-1653816515);
                    i2 = 1857872952;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -251273744:
                case 224625577:
                    if (C3492.m11488()) {
                        iM3169 = (i3 - C0773.m3169("۟֡")) * (-55);
                        i = ((iM3169 ^ i4) * 10075) ^ 1851310039;
                        i2 = 704666711;
                    } else {
                        iM3169 = C0619.m2761("ܿܺ") ^ i3;
                        i = ((iM3169 ^ i4) * 28099) ^ (-878658626);
                        i2 = 2013284794;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -68526082:
                case 1936666361:
                    C3734.m12146(2122358170 ^ iM2761);
                    if (C1564.m5509() <= 0) {
                        iM3169 = C0619.m2761("ܰᩴ") ^ i4;
                        i = ((iM3169 ^ i3) * (-23449)) ^ (-1653816515);
                        i2 = 1857872952;
                    } else {
                        iM3169 = C0773.m3169("ۘۢ") ^ i4;
                        i = ((iM3169 ^ i3) * (-3615)) ^ 564950370;
                        i2 = -1165287656;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 170756116:
                case 1968870508:
                    C4282.m13644();
                    if (C1826.f6190 > 0) {
                        iM3169 = C0619.m2761("ܰᩴ") ^ i4;
                        i = ((iM3169 ^ i3) * (-23449)) ^ (-1653816515);
                        i2 = 1857872952;
                    } else {
                        iM3169 = C0619.m2761("֡ۗ") ^ i4;
                        i = ((iM3169 ^ i3) * 21813) ^ 1046376787;
                        i2 = 616778976;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 183743854:
                case 503953162:
                    viewOnClickListenerC7793.f25885 += i8;
                    iM3169 = (C0619.m2761("ۜ᩷") ^ i3) * 63;
                    i = ((iM3169 ^ i4) * (-31299)) ^ (-1358928946);
                    i2 = 1640174524;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 471857011:
                case 1824116555:
                    viewOnClickListenerC7793.f25885 = 0;
                    iM3169 = C0619.m2761("ۖۛ") ^ i4;
                    i = ((iM3169 ^ i3) * 545) ^ (-659780903);
                    i2 = -874884642;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 919868763:
                case 1442638987:
                    C3077.m10041();
                    if (RunnableC3055.f9898 < 0) {
                        iM3169 = C0619.m2761("ܰᩴ") ^ i4;
                        i = ((iM3169 ^ i3) * (-23449)) ^ (-1653816515);
                        i2 = 1857872952;
                    } else {
                        iM3169 = C0619.m2761("ܿܺ") ^ i3;
                        i = ((iM3169 ^ i4) * 28099) ^ (-878658626);
                        i2 = 2013284794;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 1071915113:
                case 1888373106:
                    i11 = 3878;
                    iM3169 = C0773.m3169("ᩳ᩷") ^ i3;
                    i = ((iM3169 ^ i4) * (-22619)) ^ 527262166;
                    i2 = -1232649931;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                default:
                    viewOnClickListenerC7793.f25895 = -2;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30646(String str) {
        C3318 c3318 = null;
        C12267 c12267 = null;
        C9829 c9829 = null;
        C9829 c9829M30644 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        ViewOnClickListenerC7793 viewOnClickListenerC7793 = null;
        int i4 = 697030742;
        int i5 = C2966.f9654;
        int i6 = C1542.f5343;
        int iM3169 = (i6 - C0773.m3169("᩶ۢ")) * (-113);
        int i7 = ((iM3169 ^ i5) * 15537) ^ (-696597351);
        int i8 = -598487526;
        while (true) {
            i4 = ((((i4 ^ i5) * (-8765)) >> 31) & i7) ^ (iM3169 ^ i8);
            switch (i4) {
                case -1987275994:
                case -1470416445:
                    c9829M30644 = m30644(c9829, str);
                    if (C2485.f7950 != 0) {
                        iM3169 = C0773.m3169("ܳۖ") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-30163)) ^ (-671703435);
                        i8 = -2066635988;
                    } else {
                        iM3169 = C0773.m3169("ۗܶ") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-2565)) ^ 1672539399;
                        i8 = 1011653779;
                    }
                    break;
                case -1908816816:
                case 425939818:
                    C2287.m7745();
                    C1343.m4943();
                    break;
                case -1669511816:
                case 1415623064:
                    c3318.f10828 = str;
                    c12267 = c3318.f10827;
                    if (C0619.f2439) {
                        iM3169 = C0773.m3169("ܳۖ") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-30163)) ^ (-671703435);
                        i8 = -2066635988;
                    } else {
                        iM3169 = C0619.m2761("᩵۬") ^ i6;
                        i7 = ((iM3169 ^ i5) * 22057) ^ 920652921;
                        i8 = -1150501269;
                    }
                    break;
                case -1535499288:
                case -1406518044:
                    i3 = i + i2;
                    if (C0269.f1558 <= 0) {
                        iM3169 = C0773.m3169("ܳۖ") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-30163)) ^ (-671703435);
                        i8 = -2066635988;
                    } else {
                        iM3169 = (C0619.m2761("ۙۖ") ^ i6) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i7 = ((iM3169 ^ i5) * (-28953)) ^ 502176477;
                        i8 = 1673308021;
                    }
                    break;
                case -988397830:
                case -599802944:
                    i = c3318.f10824;
                    i2 = 1;
                    if (C13473.f42873 != 0) {
                        iM3169 = (C0773.m3169("ۡۤ") ^ i6) * (-33);
                        i7 = ((iM3169 ^ i5) * 16195) ^ (-978999495);
                        i8 = -997054087;
                    } else {
                        iM3169 = C0773.m3169("ۙ֡") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-27221)) ^ (-493480799);
                        i8 = 962936771;
                    }
                    break;
                case -987075316:
                case 207262529:
                    viewOnClickListenerC7793.f25883 = -1;
                    break;
                case -948350198:
                case -844069629:
                    C1519.m5403();
                    if (!C13473.m33144()) {
                        iM3169 = C0619.m2761("᩹۬") ^ i5;
                        i7 = ((iM3169 ^ i6) * 10423) ^ 1546215155;
                        i8 = -1418619199;
                    } else {
                        iM3169 = C0773.m3169("۬᩻") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-26817)) ^ (-1349192678);
                        i8 = 321319068;
                    }
                    break;
                case -539480943:
                case -233945776:
                    c9829 = c3318.f10826;
                    C17202.m40369(c12267);
                    if (C1519.f5300 >= 0) {
                        iM3169 = C0619.m2761("᩹۬") ^ i5;
                        i7 = ((iM3169 ^ i6) * 10423) ^ 1546215155;
                        i8 = -1418619199;
                    } else {
                        iM3169 = C0773.m3169("֫ܽ") ^ i5;
                        i7 = ((iM3169 ^ i6) * 22061) ^ (-878276356);
                        i8 = 893668082;
                    }
                    break;
                case -536669945:
                case -354563568:
                    c3318.f10824 = i3;
                    if (C3734.f12817 >= 0) {
                        iM3169 = C0773.m3169("ۙ᩸") ^ i6;
                        i7 = ((iM3169 ^ i5) * 22413) ^ 496870636;
                        i8 = 1253730977;
                    } else {
                        iM3169 = (i5 - C0619.m2761("ۘ֫")) * 55;
                        i7 = ((iM3169 ^ i6) * (-17479)) ^ (-1550767541);
                        i8 = 571672626;
                    }
                    break;
                case -229838985:
                case 1965918080:
                    c3318.f10823 = c9829M30644;
                    if (C3779.m12264()) {
                        iM3169 = (C0619.m2761("֫ܳ") + i5) * 73;
                        i7 = ((iM3169 ^ i6) * 19463) ^ (-101807181);
                        i8 = 310130435;
                    } else {
                        iM3169 = C0773.m3169("ܳۖ") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-30163)) ^ (-671703435);
                        i8 = -2066635988;
                    }
                    break;
                case 64701490:
                case 899230670:
                    if (C4282.f15546 <= 0) {
                        iM3169 = (C0773.m3169("ۡۤ") ^ i6) * (-33);
                        i7 = ((iM3169 ^ i5) * 16195) ^ (-978999495);
                        i8 = -997054087;
                    } else {
                        iM3169 = C0773.m3169("۬᩻") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-26817)) ^ (-1349192678);
                        i8 = 321319068;
                    }
                    break;
                case 487537862:
                case 913139857:
                    if (!C2878.f9462) {
                        iM3169 = C0773.m3169("۬᩻") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-26817)) ^ (-1349192678);
                        i8 = 321319068;
                    } else {
                        iM3169 = C0773.m3169("ۙ᩸") ^ i6;
                        i7 = ((iM3169 ^ i5) * 22413) ^ 496870636;
                        i8 = 1253730977;
                    }
                    break;
                case 1041642972:
                case 2103009066:
                    c3318 = this.f39446;
                    if (C0773.m3161() != 0) {
                        iM3169 = (C0773.m3169("ۡۤ") ^ i6) * (-33);
                        i7 = ((iM3169 ^ i5) * 16195) ^ (-978999495);
                        i8 = -997054087;
                    } else {
                        iM3169 = C0619.m2761("ܽᩳ") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-2397)) ^ (-1627802709);
                        i8 = 23231085;
                    }
                    break;
                case 1091863834:
                case 1776167248:
                    if (C1783.f6087 <= 0) {
                        iM3169 = C0773.m3169("ܳۖ") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-30163)) ^ (-671703435);
                        i8 = -2066635988;
                    } else {
                        iM3169 = (C0619.m2761("᩹ۗ") + i6) * 83;
                        i7 = ((iM3169 ^ i5) * (-1079)) ^ (-1696003213);
                        i8 = -173298238;
                    }
                    break;
                case 1323912040:
                case 1877505447:
                    C2288.m7767();
                    C4282.m13644();
                    iM3169 = C0773.m3169("۬᩻") ^ i5;
                    i7 = ((iM3169 ^ i6) * (-26817)) ^ (-1349192678);
                    i8 = 321319068;
                    break;
                default:
                    C3033.m9852(c3318);
                    viewOnClickListenerC7793 = c3318.f10825;
                    if (C2834.f9334 <= 0) {
                        iM3169 = C0773.m3169("ۙ᩸") ^ i6;
                        i7 = ((iM3169 ^ i5) * 22413) ^ 496870636;
                        i8 = 1253730977;
                    } else {
                        iM3169 = (C0619.m2761("᩺᩵") + i6) * 7;
                        i7 = ((iM3169 ^ i5) * (-25123)) ^ (-633228857);
                        i8 = -991361315;
                    }
                    break;
            }
            return;
        }
    }
}
