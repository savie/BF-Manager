package l;

import bin.mt.plus.Main;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۛ֨ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1W9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6046 extends AbstractC2432 {

    /* JADX INFO: renamed from: ᩳܳۤ, reason: not valid java name and contains not printable characters */
    private static final short[] f20682 = {5746, -25441, -18029, 32681, 9416, 32678, -21828, -29046, 27524, -22250, -27792, -3549, -26876, 25187, -17057};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f20683;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20962 f20684;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f20685;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C11555 f20686;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f20687;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f20688;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f20689;

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        C11555 c11555 = null;
        Main main = null;
        String str = null;
        int i = 0;
        int i2 = 1084493520;
        int i3 = C3734.f12817;
        int i4 = C1826.f6190;
        int iM2761 = C0619.m2761("᩻֡") ^ i3;
        int i5 = ((iM2761 ^ i4) * 22397) ^ 688252451;
        int i6 = 1005360564;
        while (true) {
            i2 = ((((i2 ^ i4) * 12521) >> 31) & i5) ^ (iM2761 ^ i6);
            switch (i2) {
                case -2070709296:
                case -1358995061:
                    c11555 = this.f20686;
                    if (C2354.f7599 >= 0) {
                        iM2761 = C0619.m2761("᩹ܿ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 25041) ^ 783410993;
                        i6 = 2125985281;
                    } else {
                        iM2761 = C0619.m2761("ۡ۫") ^ i3;
                        i5 = ((iM2761 ^ i4) * 6945) ^ 1469234153;
                        i6 = -171595250;
                    }
                    break;
                case -2024803343:
                case -1629531351:
                    break;
                case -1668264573:
                case 494547383:
                    if (C0773.f2792 <= 0) {
                        iM2761 = C0773.m3169("᩻ܺ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-219)) ^ (-2081321593);
                        i6 = 635726276;
                    } else {
                        iM2761 = C0619.m2761("ܺܶ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-17097)) ^ 539777364;
                        i6 = -619668644;
                    }
                    break;
                case -1537582796:
                case 1190324453:
                    if (c11555.m29071()) {
                        iM2761 = (C0773.m3169("ܶ֨") + i4) * (-45);
                        i5 = ((iM2761 ^ i3) * (-21247)) ^ 45353177;
                        i6 = -2133739835;
                    } else {
                        iM2761 = C0773.m3169("᩶ۜ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-7197)) ^ (-2134457168);
                        i6 = -475399376;
                    }
                    break;
                case -1374519677:
                case 889076657:
                    C3448.m11248();
                    if (C2287.m7745() > 0) {
                        iM2761 = (C0773.m3169("᩶֡") + i4) * (-107);
                        i5 = ((iM2761 ^ i3) * 18793) ^ (-1141143928);
                        i6 = 846060338;
                    } else {
                        iM2761 = C0619.m2761("᩹ܿ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 25041) ^ 783410993;
                        i6 = 2125985281;
                    }
                    break;
                case -1325950110:
                case 854506368:
                    C3033.m9845();
                    C0619.m2763();
                    iM2761 = C0619.m2761("᩹ܿ") ^ i4;
                    i5 = ((iM2761 ^ i3) * 25041) ^ 783410993;
                    i6 = 2125985281;
                    break;
                case -1143088607:
                case -1069152804:
                    if (!C2702.m8876()) {
                        iM2761 = C0773.m3169("᩻ܺ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-219)) ^ (-2081321593);
                        i6 = 635726276;
                    } else {
                        iM2761 = C0619.m2761("᩹ܿ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 25041) ^ 783410993;
                        i6 = 2125985281;
                    }
                    break;
                case -1142034813:
                case 1308668633:
                    if (C3998.f13671 != 0) {
                        iM2761 = (C0773.m3169("᩶֡") + i4) * (-107);
                        i5 = ((iM2761 ^ i3) * 18793) ^ (-1141143928);
                        i6 = 846060338;
                    } else {
                        iM2761 = (C0619.m2761("۟ۘ") + i3) * (-17);
                        i5 = ((iM2761 ^ i4) * (-5853)) ^ 124236551;
                        i6 = -960052666;
                    }
                    break;
                case -1017372578:
                case 316832421:
                    if (this.f7780.m33196()) {
                        iM2761 = C0773.m3169("᩶ۜ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-7197)) ^ (-2134457168);
                        i6 = -475399376;
                    } else {
                        iM2761 = C0773.m3169("֨ܶ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-7587)) ^ (-1745631684);
                        i6 = 1400850769;
                    }
                    break;
                case -965791386:
                case 1990647242:
                    main = this.f20684.f67043;
                    if (C2354.f7599 >= 0) {
                        iM2761 = (C0773.m3169("᩶֡") + i4) * (-107);
                        i5 = ((iM2761 ^ i3) * 18793) ^ (-1141143928);
                        i6 = 846060338;
                    } else {
                        iM2761 = (C0619.m2761("᩵᩵") + i3) * 61;
                        i5 = ((iM2761 ^ i4) * (-31741)) ^ 158095690;
                        i6 = -807549986;
                    }
                    break;
                case -585935954:
                case 1018702153:
                    if (C0862.f3233 != 0) {
                        iM2761 = C0773.m3169("᩻ܺ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-219)) ^ (-2081321593);
                        i6 = 635726276;
                    } else {
                        iM2761 = (C0619.m2761("ۙܳ") + i4) * (-97);
                        i5 = ((iM2761 ^ i3) * (-10069)) ^ 1525949366;
                        i6 = 1480876476;
                    }
                    break;
                case -552243704:
                case -294815724:
                    if (C0619.f2439) {
                        iM2761 = C0773.m3169("۟ܿ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-17625)) ^ (-1309595025);
                        i6 = -1532761477;
                    } else {
                        iM2761 = C0773.m3169("᩻ܽ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-18105)) ^ (-517856364);
                        i6 = 1541543290;
                    }
                    break;
                case 388411667:
                case 484882079:
                    i = this.f20683;
                    if (C20932.f66974 <= 0) {
                        iM2761 = C0773.m3169("ۚܶ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-16857)) ^ 850831036;
                        i6 = -1578226028;
                    } else {
                        iM2761 = (C0619.m2761("ܰ۬") + i3) * (-37);
                        i5 = ((iM2761 ^ i4) * (-25347)) ^ (-165377066);
                        i6 = 719324799;
                    }
                    break;
                case 441581056:
                case 1059319049:
                    C2287.m7745();
                    C1321.m4852();
                    break;
                case 950457815:
                case 1243037163:
                    str = this.f20687;
                    if (C1826.f6190 <= 0) {
                        iM2761 = C0773.m3169("᩻ܺ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-219)) ^ (-2081321593);
                        i6 = 635726276;
                    } else {
                        iM2761 = C0619.m2761("֫ܿ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 2841) ^ 552908310;
                        i6 = 2013475724;
                    }
                    break;
                case 1013418112:
                case 1624619165:
                    if (C2878.m9491() <= 0) {
                        iM2761 = C0773.m3169("ۚܶ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-16857)) ^ 850831036;
                        i6 = -1578226028;
                    } else {
                        iM2761 = C0773.m3169("ܿ֡") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-15673)) ^ 1499213859;
                        i6 = -1175026165;
                    }
                    break;
                case 1057233599:
                case 1977646159:
                    if (C4238.f15451 >= 0) {
                        iM2761 = C0773.m3169("᩻ܺ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-219)) ^ (-2081321593);
                        i6 = 635726276;
                    } else {
                        iM2761 = C0773.m3169("ܶۡ") ^ i3;
                        i5 = ((iM2761 ^ i4) * 11981) ^ 780336800;
                        i6 = -740114377;
                    }
                    break;
                case 1586556264:
                case 1944961934:
                    ActivityC4300.m13685(main, str, AbstractC0116.m1244(i), null, null);
                    iM2761 = C0773.m3169("᩶ۜ") ^ i4;
                    i5 = ((iM2761 ^ i3) * (-7197)) ^ (-2134457168);
                    i6 = -475399376;
                    break;
                default:
                    if (C1519.f5300 < 0) {
                        iM2761 = C0773.m3169("۟ܿ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-17625)) ^ (-1309595025);
                        i6 = -1532761477;
                    } else {
                        iM2761 = C0773.m3169("᩻ܺ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-219)) ^ (-2081321593);
                        i6 = 635726276;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x01e5 A[PHI: r1 r16
      0x01e5: PHI (r1v2 l.᩸ۤۛ) = (r1v1 l.᩸ۤۛ), (r1v4 l.᩸ۤۛ) binds: [B:56:0x01ce, B:50:0x01a4] A[DONT_GENERATE, DONT_INLINE]
      0x01e5: PHI (r16v7 int) = (r16v6 int), (r16v8 int) binds: [B:56:0x01ce, B:50:0x01a4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:77:0x02f1 A[PHI: r16
      0x02f1: PHI (r16v22 int) = (r16v1 int), (r16v4 int), (r16v23 int) binds: [B:76:0x02ef, B:64:0x025d, B:14:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0044, code lost:
    
        r16 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005a, code lost:
    
        if (l.C17202.f56030 != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0072, code lost:
    
        if (l.C0487.f2131 > 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0042, code lost:
    
        if (l.C20932.m47848() == 0) goto L10;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m17553(java.util.TreeSet r19, java.util.ArrayList r20, l.C24975 r21) {
        /*
            Method dump skipped, instruction units count: 1014
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C6046.m17553(java.util.TreeSet, java.util.ArrayList, l.᩻ۤۛ):void");
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        Main main = null;
        int i = 2034698001;
        int i2 = C3033.f9831;
        int i3 = C0269.f1558;
        int iM3169 = (C0773.m3169("ۢۡ") ^ i3) * 59;
        int i4 = ((iM3169 ^ i2) * 26321) ^ 1018158321;
        int i5 = -2128895756;
        while (true) {
            i = ((((i ^ i2) * (-18551)) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -1983844126:
                case -1348031540:
                    if (C2834.f9334 <= 0) {
                        iM3169 = C0619.m2761("ۜ᩸") ^ i2;
                        i4 = ((iM3169 ^ i3) * 11439) ^ 2049669506;
                        i5 = 1993509938;
                    } else {
                        iM3169 = (i2 - C0619.m2761("᩻ᩳ")) * 93;
                        i4 = ((iM3169 ^ i3) * (-5467)) ^ (-62513123);
                        i5 = 1253035027;
                    }
                    break;
                case -1972143432:
                case -733794399:
                    break;
                case -1909108151:
                case 1300268436:
                    C1146.m4231();
                    if (C1564.f5401 <= 0) {
                        iM3169 = C0619.m2761("ᩳۘ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 21421) ^ 788084914;
                        i5 = 2124409074;
                    } else {
                        iM3169 = (C0773.m3169("ᩳܺ") ^ i3) * (-71);
                        i4 = ((iM3169 ^ i2) * 16359) ^ 1597628834;
                        i5 = 594970082;
                    }
                    break;
                case -1858014819:
                case 1393164703:
                    C2310.m7813();
                    if (C0862.f3233 == 0) {
                        iM3169 = C0619.m2761("ۜ᩸") ^ i2;
                        i4 = ((iM3169 ^ i3) * 11439) ^ 2049669506;
                        i5 = 1993509938;
                    } else {
                        iM3169 = (C0773.m3169("ᩳܺ") ^ i3) * (-71);
                        i4 = ((iM3169 ^ i2) * 16359) ^ 1597628834;
                        i5 = 594970082;
                    }
                    break;
                case -1777466472:
                case 1146421419:
                    AbstractC0641.m2814(main, exc, null);
                    break;
                case -1727119228:
                case -752233855:
                    C17202.m40372();
                    C4282.m13644();
                    iM3169 = (C0773.m3169("ᩳܺ") ^ i3) * (-71);
                    i4 = ((iM3169 ^ i2) * 16359) ^ 1597628834;
                    i5 = 594970082;
                    break;
                case -1614629491:
                case 1802169817:
                    if (C1321.f4751 >= 0) {
                        iM3169 = (C0773.m3169("ᩳܺ") ^ i3) * (-71);
                        i4 = ((iM3169 ^ i2) * 16359) ^ 1597628834;
                        i5 = 594970082;
                    } else {
                        iM3169 = C0773.m3169("ܳ᩵") ^ i2;
                        i4 = ((iM3169 ^ i3) * 24773) ^ 2049906052;
                        i5 = -892527104;
                    }
                    break;
                case -1242926499:
                case 854052845:
                    if (C2375.m8065() <= 0) {
                        iM3169 = C0619.m2761("᩺֨") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-23483)) ^ 1288876664;
                        i5 = -352248088;
                    } else {
                        iM3169 = C0619.m2761("ᩳܰ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-31835)) ^ (-71653996);
                        i5 = -1773764747;
                    }
                    break;
                case -1190929289:
                case 1839504811:
                    if (C2023.m6964() <= 0) {
                        iM3169 = C0619.m2761("᩺֨") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-23483)) ^ 1288876664;
                        i5 = -352248088;
                    } else {
                        iM3169 = C0773.m3169("۫ܶ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-9303)) ^ (-1633426338);
                        i5 = 67067280;
                    }
                    break;
                case -1059504486:
                case 822758470:
                    C3448.m11248();
                    break;
                case -886669425:
                case 1680479124:
                    if (C3690.m11987()) {
                        iM3169 = C0619.m2761("ᩳۘ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 21421) ^ 788084914;
                        i5 = 2124409074;
                    } else {
                        iM3169 = C0619.m2761("ۗ᩺") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-6251)) ^ 568789312;
                        i5 = -2132746928;
                    }
                    break;
                case -155584173:
                case 81659692:
                    if (C2834.m9344() < 0) {
                        iM3169 = (C0619.m2761("ۖܿ") ^ i3) * (-63);
                        i4 = ((iM3169 ^ i2) * (-18209)) ^ 171963833;
                        i5 = 271970338;
                    } else {
                        iM3169 = C0619.m2761("ᩳۘ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 21421) ^ 788084914;
                        i5 = 2124409074;
                    }
                    break;
                case -136621034:
                case 481328488:
                    if (RunnableC1848.m6360()) {
                        iM3169 = (C0773.m3169("ᩳܺ") ^ i3) * (-71);
                        i4 = ((iM3169 ^ i2) * 16359) ^ 1597628834;
                        i5 = 594970082;
                    } else {
                        iM3169 = (C0619.m2761("᩹ۤ") ^ i2) * (-99);
                        i4 = ((iM3169 ^ i3) * 17681) ^ (-1682492686);
                        i5 = 241067216;
                    }
                    break;
                case 434659910:
                case 1171854412:
                    main = this.f20684.f67043;
                    if (C2310.f7472 >= 0) {
                        iM3169 = C0619.m2761("ۜ᩸") ^ i2;
                        i4 = ((iM3169 ^ i3) * 11439) ^ 2049669506;
                        i5 = 1993509938;
                    } else {
                        iM3169 = C0619.m2761("ۜۚ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-24979)) ^ 989234012;
                        i5 = 1796424650;
                    }
                    break;
                case 621921288:
                case 1346611775:
                    if (C4282.f15546 <= 0) {
                        iM3169 = C0619.m2761("ۜ᩸") ^ i2;
                        i4 = ((iM3169 ^ i3) * 11439) ^ 2049669506;
                        i5 = 1993509938;
                    } else {
                        iM3169 = C0773.m3169("۠ۚ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-7723)) ^ (-2118515690);
                        i5 = 902450464;
                    }
                    break;
                case 750327844:
                case 1731325876:
                    if (this.f20686.m29071()) {
                        iM3169 = C0773.m3169("ᩴۙ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 243) ^ (-1920677638);
                        i5 = -164136183;
                    } else {
                        iM3169 = C0773.m3169("᩺۟") ^ i2;
                        i4 = ((iM3169 ^ i3) * 2361) ^ 429803145;
                        i5 = 1705796279;
                    }
                    break;
                case 1140626450:
                case 1356277643:
                    if (C4238.f15451 >= 0) {
                        iM3169 = C0619.m2761("᩺֨") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-23483)) ^ 1288876664;
                        i5 = -352248088;
                    } else {
                        iM3169 = (C0619.m2761("᩻۫") ^ i3) * 71;
                        i4 = ((iM3169 ^ i2) * 30817) ^ (-403179619);
                        i5 = -343197057;
                    }
                    break;
                default:
                    if (C0862.m3503()) {
                        iM3169 = (C0773.m3169("ۙ᩸") ^ i2) * (-19);
                        i4 = ((iM3169 ^ i3) * (-24465)) ^ 516789035;
                        i5 = 1649139962;
                    } else {
                        iM3169 = (C0619.m2761("ۖܿ") ^ i3) * (-63);
                        i4 = ((iM3169 ^ i2) * (-18209)) ^ 171963833;
                        i5 = 271970338;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        C20962 c20962 = null;
        Main main = null;
        int i = 2036824968;
        int i2 = C4238.f15451;
        int i3 = C0950.f3488;
        int iM3169 = (i3 - C0773.m3169("᩸ᩴ")) * (-77);
        int i4 = ((iM3169 ^ i2) * (-13387)) ^ (-744852775);
        int i5 = -2033878704;
        while (true) {
            i = ((((i ^ i2) * (-4621)) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2049108562:
                case -1748469121:
                    main = c20962.f67043;
                    if (C1146.f4234 >= 0) {
                        iM3169 = C0773.m3169("۫ۨ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 30151) ^ (-1766838927);
                        i5 = 1869165560;
                    } else {
                        iM3169 = C0619.m2761("᩷᩸") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-27455)) ^ (-87819414);
                        i5 = 252222801;
                    }
                    break;
                case -1950842412:
                case 237498304:
                    c20962 = this.f20684;
                    if (C2702.m8876()) {
                        iM3169 = C0773.m3169("۬ۙ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-21609)) ^ 1613691742;
                        i5 = -508438642;
                    } else {
                        iM3169 = C0619.m2761("ۧ᩺") ^ i3;
                        i4 = ((iM3169 ^ i2) * 7187) ^ (-1477860917);
                        i5 = -1661429157;
                    }
                    break;
                case -1889003877:
                case -1221213316:
                    if (C13473.f42873 == 0) {
                        iM3169 = C0619.m2761("ۧ᩺") ^ i3;
                        i4 = ((iM3169 ^ i2) * 7187) ^ (-1477860917);
                        i5 = -1661429157;
                    } else {
                        iM3169 = (C0773.m3169("ܰۛ") ^ i2) * (-49);
                        i4 = ((iM3169 ^ i3) * 231) ^ 1338577324;
                        i5 = 1760918436;
                    }
                    break;
                case -1776119123:
                case -738542230:
                    if (AbstractC0116.f1064 <= 0) {
                        iM3169 = C0773.m3169("᩺ۡ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 20225) ^ 151625017;
                        i5 = 234887879;
                    } else {
                        iM3169 = C0773.m3169("᩸ܶ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 1065) ^ (-222005726);
                        i5 = 862524217;
                    }
                    break;
                case -1725384884:
                case -815749929:
                    C1564.m5509();
                    if (C0487.f2131 > 0) {
                        iM3169 = C0619.m2761("ۧ᩺") ^ i3;
                        i4 = ((iM3169 ^ i2) * 7187) ^ (-1477860917);
                        i5 = -1661429157;
                    } else {
                        iM3169 = C0773.m3169("ۤ֨") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-19345)) ^ 433894856;
                        i5 = 538873364;
                    }
                    break;
                case -1673566422:
                case -82172123:
                    this.f7780.m33188((Runnable) null);
                    break;
                case -1477495529:
                case -1178800487:
                    C1783.m6242(this, main);
                    if (C2419.f7754 >= 0) {
                        iM3169 = C0773.m3169("᩺ۡ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 20225) ^ 151625017;
                        i5 = 234887879;
                    } else {
                        iM3169 = C0619.m2761("ۛܺ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-11681)) ^ 1005136137;
                        i5 = 185871033;
                    }
                    break;
                case -958636244:
                case -328121467:
                    if (C17202.f56030) {
                        iM3169 = C0619.m2761("ۗܽ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 30211) ^ (-1701977921);
                        i5 = 1698221863;
                    } else {
                        iM3169 = C0773.m3169("᩺ۡ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 20225) ^ 151625017;
                        i5 = 234887879;
                    }
                    break;
                case -917690167:
                case 1989844175:
                    if (C2288.f7433 <= 0) {
                        iM3169 = C0619.m2761("ۧ᩺") ^ i3;
                        i4 = ((iM3169 ^ i2) * 7187) ^ (-1477860917);
                        i5 = -1661429157;
                    } else {
                        iM3169 = C0773.m3169("ᩳ֡") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-6719)) ^ (-1368011422);
                        i5 = 1522878242;
                    }
                    break;
                case -912852162:
                case -745592504:
                    if (C3998.f13671 != 0) {
                        iM3169 = C0773.m3169("۫ۨ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 30151) ^ (-1766838927);
                        i5 = 1869165560;
                    } else {
                        iM3169 = (C0773.m3169("ۨᩳ") + i3) * (-63);
                        i4 = ((iM3169 ^ i2) * 18069) ^ (-766569839);
                        i5 = 799511276;
                    }
                    break;
                case -717106390:
                case 1671410660:
                    if (C0950.f3488 >= 0) {
                        iM3169 = C0773.m3169("۫ۨ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 30151) ^ (-1766838927);
                        i5 = 1869165560;
                    } else {
                        iM3169 = (C0619.m2761("᩹ۢ") + i3) * 69;
                        i4 = ((iM3169 ^ i2) * (-29467)) ^ 257216423;
                        i5 = 1818507427;
                    }
                    break;
                case -639708276:
                case -304559979:
                    AbstractC0116.m1243();
                    C11235.m28309();
                    break;
                case -475182565:
                case 1820534460:
                    if (C2419.f7754 >= 0) {
                        iM3169 = C0619.m2761("ۧ᩺") ^ i3;
                        i4 = ((iM3169 ^ i2) * 7187) ^ (-1477860917);
                        i5 = -1661429157;
                    } else {
                        iM3169 = C0773.m3169("۟ۡ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 1101) ^ 1110385207;
                        i5 = -1344669492;
                    }
                    break;
                case -150206898:
                case 955430146:
                    if (C2878.m9491() <= 0) {
                        iM3169 = C0619.m2761("ۧ᩺") ^ i3;
                        i4 = ((iM3169 ^ i2) * 7187) ^ (-1477860917);
                        i5 = -1661429157;
                    } else {
                        iM3169 = C0619.m2761("ܶܿ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-1095)) ^ (-1968087902);
                        i5 = 1677068490;
                    }
                    break;
                case 198441988:
                case 883026957:
                    C2287.m7745();
                    iM3169 = C0773.m3169("۫ۨ") ^ i2;
                    i4 = ((iM3169 ^ i3) * 30151) ^ (-1766838927);
                    i5 = 1869165560;
                    break;
                default:
                    if (C1146.f4234 < 0) {
                        iM3169 = C0619.m2761("ۧ᩺") ^ i3;
                        i4 = ((iM3169 ^ i2) * 7187) ^ (-1477860917);
                        i5 = -1661429157;
                    } else {
                        iM3169 = C0773.m3169("۫ۨ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 30151) ^ (-1766838927);
                        i5 = 1869165560;
                    }
                    break;
            }
            return;
        }
    }

    public C6046(C20962 c20962, boolean z, String str, String str2) {
        C11555 c11555M29068 = null;
        int iM3169 = 0;
        int i = 0;
        short[] sArr = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = -1606878022;
        int i5 = C3690.f12684;
        int i6 = AbstractC0116.f1064;
        short s = f20682[0];
        int i7 = s + 12796;
        int i8 = (s * s) + 163737616;
        int i9 = (i7 * i7) - (i8 + i8) > 0 ? 61937 : 60805;
        this.f20684 = c20962;
        this.f20689 = z;
        this.f20688 = str;
        this.f20685 = str2;
        int iM2761 = C0619.m2761("᩶֨") ^ i5;
        int i10 = ((iM2761 ^ i6) * 22421) ^ (-808239144);
        int i11 = -1243721520;
        while (true) {
            i4 = ((((i4 ^ i6) * (-4089)) >> 31) & i10) ^ (iM2761 ^ i11);
            switch (i4) {
                case -2117499079:
                case 2050565922:
                    this.f20686 = c11555M29068;
                    if (C0269.f1558 <= 0) {
                        iM2761 = C0619.m2761("۟ܶ") ^ i5;
                        i10 = ((iM2761 ^ i6) * (-22111)) ^ (-246154960);
                        i11 = 2052454367;
                    } else {
                        iM2761 = (C0773.m3169("ۙ֡") + i6) * 81;
                        i10 = ((iM2761 ^ i5) * (-6271)) ^ (-1473240980);
                        i11 = 1573594568;
                    }
                    break;
                case -2008655661:
                case -309744373:
                    iM3169 = C0773.m3169(C2878.m9486(sArr, i2, i3, i9));
                    if (C2288.f7433 <= 0) {
                        iM2761 = C0619.m2761("۠᩹") ^ i6;
                        i10 = ((iM2761 ^ i5) * 30625) ^ (-2070264897);
                        i11 = -1593059452;
                    } else {
                        iM2761 = (i6 - C0619.m2761("۠۫")) * 95;
                        i10 = ((iM2761 ^ i5) * (-21279)) ^ (-395888320);
                        i11 = -100464327;
                    }
                    break;
                case -1996279228:
                case 648412917:
                    if (C2834.f9334 <= 0) {
                        iM2761 = C0619.m2761("۠᩹") ^ i6;
                        i10 = ((iM2761 ^ i5) * 30625) ^ (-2070264897);
                        i11 = -1593059452;
                    } else {
                        iM2761 = C0619.m2761("ᩴ᩸") ^ i5;
                        i10 = ((iM2761 ^ i6) * (-27221)) ^ (-2052998957);
                        i11 = -1086748451;
                    }
                    break;
                case -1959909310:
                case 418067036:
                    c11555M29068 = C11555.m29068(c20962.f67043);
                    if (C1783.f6087 <= 0) {
                        iM2761 = C0619.m2761("۟ܶ") ^ i5;
                        i10 = ((iM2761 ^ i6) * (-22111)) ^ (-246154960);
                        i11 = 2052454367;
                    } else {
                        iM2761 = C0773.m3169("ܿ۠") ^ i6;
                        i10 = ((iM2761 ^ i5) * 21821) ^ (-2065432235);
                        i11 = -895145605;
                    }
                    break;
                case -1816423366:
                case -826592442:
                    if (C3033.f9831 >= 0) {
                        iM2761 = (C0773.m3169("ᩳ᩹") + i5) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i10 = ((iM2761 ^ i6) * 28537) ^ (-43872139);
                        i11 = -305057330;
                    } else {
                        iM2761 = C0773.m3169("֡ۛ") ^ i5;
                        i10 = ((iM2761 ^ i6) * (-11203)) ^ 125053670;
                        i11 = -705606981;
                    }
                    break;
                case -1599166327:
                case -352141695:
                    if (C3033.f9831 >= 0) {
                        iM2761 = C0619.m2761("۠᩹") ^ i6;
                        i10 = ((iM2761 ^ i5) * 30625) ^ (-2070264897);
                        i11 = -1593059452;
                    } else {
                        iM2761 = (C0773.m3169("ۖܳ") ^ i5) * 47;
                        i10 = ((iM2761 ^ i6) * (-26351)) ^ (-2084276155);
                        i11 = 835882154;
                    }
                    break;
                case -1537049135:
                case -1358380588:
                    C2878.m9491();
                    if (C2878.m9491() <= 0) {
                        iM2761 = C0619.m2761("۟ܶ") ^ i5;
                        i10 = ((iM2761 ^ i6) * (-22111)) ^ (-246154960);
                        i11 = 2052454367;
                    } else {
                        iM2761 = C0773.m3169("ܽ۟") ^ i6;
                        i10 = ((iM2761 ^ i5) * 20323) ^ (-1642140658);
                        i11 = -1233718937;
                    }
                    break;
                case -1525299807:
                case 1098512251:
                    if (C2375.f7641 > 0) {
                        iM2761 = (C0773.m3169("ᩳ᩹") + i5) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i10 = ((iM2761 ^ i6) * 28537) ^ (-43872139);
                        i11 = -305057330;
                    } else {
                        iM2761 = C0773.m3169("ܽ۟") ^ i6;
                        i10 = ((iM2761 ^ i5) * 20323) ^ (-1642140658);
                        i11 = -1233718937;
                    }
                    break;
                case -1524380196:
                case -1208362248:
                    this.f20683 = iM3169 ^ i;
                    return;
                case -1301746791:
                case 627455885:
                    C2354.m7983();
                    throw new RuntimeException();
                case -1083453351:
                case -6994653:
                    if (C3734.f12817 >= 0) {
                        iM2761 = (i6 - C0773.m3169("ۢ۠")) * 47;
                        i10 = ((iM2761 ^ i5) * 10679) ^ 1873468971;
                        i11 = 1853941750;
                    } else {
                        iM2761 = C0773.m3169("ᩳ᩶") ^ i6;
                        i10 = ((iM2761 ^ i5) * (-5947)) ^ 1555572810;
                        i11 = -1927380581;
                    }
                    break;
                case 96569002:
                case 843357468:
                    i2 = 1;
                    i3 = 3;
                    if (C2966.f9654 >= 0) {
                        iM2761 = C0619.m2761("۠᩹") ^ i6;
                        i10 = ((iM2761 ^ i5) * 30625) ^ (-2070264897);
                        i11 = -1593059452;
                    } else {
                        iM2761 = C0619.m2761("ۚۙ") ^ i6;
                        i10 = ((iM2761 ^ i5) * (-11121)) ^ 2030958101;
                        i11 = -1940357552;
                    }
                    break;
                case 218487353:
                case 2100136342:
                    i = 2124501257;
                    if (C3492.m11488()) {
                        iM2761 = (C0773.m3169("۬᩻") + i5) * 13;
                        i10 = ((iM2761 ^ i6) * (-8679)) ^ 1078005795;
                        i11 = -1757068673;
                    } else {
                        iM2761 = (C0773.m3169("ᩳ᩹") + i5) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i10 = ((iM2761 ^ i6) * 28537) ^ (-43872139);
                        i11 = -305057330;
                    }
                    break;
                case 332930860:
                case 1323722436:
                    sArr = f20682;
                    if (C2834.f9334 <= 0) {
                        iM2761 = (i6 - C0773.m3169("ۢ۠")) * 47;
                        i10 = ((iM2761 ^ i5) * 10679) ^ 1873468971;
                        i11 = 1853941750;
                    } else {
                        iM2761 = C0619.m2761("ܶۤ") ^ i5;
                        i10 = ((iM2761 ^ i6) * (-11441)) ^ 1103669592;
                        i11 = 213334546;
                    }
                    break;
                case 1056033272:
                case 1663315383:
                    C11235.m28309();
                    if (!RunnableC1848.f6235) {
                        iM2761 = (i6 - C0773.m3169("ۢ۠")) * 47;
                        i10 = ((iM2761 ^ i5) * 10679) ^ 1873468971;
                        i11 = 1853941750;
                    } else {
                        iM2761 = C0619.m2761("۟ܶ") ^ i5;
                        i10 = ((iM2761 ^ i6) * (-22111)) ^ (-246154960);
                        i11 = 2052454367;
                    }
                    break;
                default:
                    RunnableC3646.m11813();
                    C4282.m13644();
                    iM2761 = C0773.m3169("ܽ۟") ^ i6;
                    i10 = ((iM2761 ^ i5) * 20323) ^ (-1642140658);
                    i11 = -1233718937;
                    break;
            }
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        C20932.m47845(this);
    }

    /* JADX WARN: Code duplicated, block: B:149:0x072c A[PHI: r3 r6 r12 r20 r31 r35 r39 r40
      0x072c: PHI (r3v4 java.lang.StringBuilder) = 
      (r3v3 java.lang.StringBuilder)
      (r3v2 java.lang.StringBuilder)
      (r3v2 java.lang.StringBuilder)
      (r3v2 java.lang.StringBuilder)
     binds: [B:147:0x0714, B:138:0x0673, B:122:0x0571, B:56:0x023f] A[DONT_GENERATE, DONT_INLINE]
      0x072c: PHI (r6v54 l.᩶֨ۤ) = (r6v17 l.᩶֨ۤ), (r6v20 l.᩶֨ۤ), (r6v25 l.᩶֨ۤ), (r6v55 l.᩶֨ۤ) binds: [B:147:0x0714, B:138:0x0673, B:122:0x0571, B:56:0x023f] A[DONT_GENERATE, DONT_INLINE]
      0x072c: PHI (r12v86 int) = (r12v54 int), (r12v57 int), (r12v62 int), (r12v87 int) binds: [B:147:0x0714, B:138:0x0673, B:122:0x0571, B:56:0x023f] A[DONT_GENERATE, DONT_INLINE]
      0x072c: PHI (r20v6 java.util.ArrayList) = (r20v2 java.util.ArrayList), (r20v3 java.util.ArrayList), (r20v4 java.util.ArrayList), (r20v2 java.util.ArrayList) binds: [B:147:0x0714, B:138:0x0673, B:122:0x0571, B:56:0x023f] A[DONT_GENERATE, DONT_INLINE]
      0x072c: PHI (r31v34 l.ۙۡ) = (r31v14 l.ۙۡ), (r31v16 l.ۙۡ), (r31v21 l.ۙۡ), (r31v35 l.ۙۡ) binds: [B:147:0x0714, B:138:0x0673, B:122:0x0571, B:56:0x023f] A[DONT_GENERATE, DONT_INLINE]
      0x072c: PHI (r35v46 int) = (r35v14 int), (r35v17 int), (r35v22 int), (r35v47 int) binds: [B:147:0x0714, B:138:0x0673, B:122:0x0571, B:56:0x023f] A[DONT_GENERATE, DONT_INLINE]
      0x072c: PHI (r39v74 int) = (r39v43 int), (r39v46 int), (r39v51 int), (r39v75 int) binds: [B:147:0x0714, B:138:0x0673, B:122:0x0571, B:56:0x023f] A[DONT_GENERATE, DONT_INLINE]
      0x072c: PHI (r40v4 java.util.ArrayList) = (r40v1 java.util.ArrayList), (r40v1 java.util.ArrayList), (r40v3 java.util.ArrayList), (r40v1 java.util.ArrayList) binds: [B:147:0x0714, B:138:0x0673, B:122:0x0571, B:56:0x023f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws Throwable {
        int iM3169;
        int i;
        int i2;
        short s;
        boolean z;
        int iM2761;
        int i3;
        int i4;
        int iM2762;
        int i5;
        int iM31610;
        int i6;
        int i7;
        int i8;
        InterfaceC4787 interfaceC4787;
        int i9;
        int i10;
        C20962 c20962;
        int iM2763;
        int i11;
        int i12;
        int i13;
        InterfaceC4787 interfaceC4788;
        int iM2764;
        int i14;
        int i15;
        int i16;
        int iM2765;
        int i17;
        int iM2766;
        int i18;
        short[] sArr;
        int i19;
        C6046 c6046 = this;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 951859483;
        int i25 = C2288.f7433;
        int i26 = C2419.f7754;
        int iM2767 = C0619.m2761("ܺ۬") ^ i25;
        int i27 = ((iM2767 ^ i26) * 19219) ^ 159573724;
        int i28 = iM2767 ^ 38367003;
        InterfaceC4787 interfaceC4787M29545 = null;
        ArrayList arrayListM47937 = null;
        C22941 c22941 = null;
        C24975 c24975M11255 = null;
        ArrayList arrayList = null;
        String str = null;
        Throwable th = null;
        Object obj = null;
        String strM11996 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i29 = 0;
        int iM2768 = 0;
        boolean zM12923 = false;
        boolean zM33196 = false;
        int iM31611 = 0;
        int i30 = 0;
        int iM2769 = 0;
        boolean z2 = false;
        C20962 c20963 = null;
        int i31 = 0;
        short s2 = 0;
        ArrayList arrayList2 = null;
        Iterator it = null;
        Iterator itM7968 = null;
        int i32 = 0;
        TreeSet treeSet = null;
        Iterator itM4942 = null;
        char c = 0;
        StringBuilder sb = null;
        int i33 = 0;
        while (true) {
            i24 = i28 ^ (i27 & (((i24 ^ i26) * (-12287)) >> 31));
            switch (i24) {
                case -2101890180:
                case -1867284706:
                    try {
                        c6046.m17553(treeSet, arrayList2, C3448.m11255(C0950.m3795(c22941, (C8002) C0950.m3796(itM7968), null)));
                        zM33196 = c6046.f7780.m33196();
                        iM3169 = C0773.m3169("᩷֨") ^ i26;
                        i = ((iM3169 ^ i25) * 23005) ^ (-140829112);
                        i2 = -692952379;
                        i28 = iM3169 ^ i2;
                        i27 = i;
                    } catch (Throwable th2) {
                        th = th2;
                        i33 = i33;
                        i31 = i31;
                        i32 = i32;
                        c20963 = c20963;
                        interfaceC4787M29545 = interfaceC4787M29545;
                        iM31610 = C0619.m2761("ᩳ᩺") ^ i26;
                        i6 = ((iM31610 ^ i25) * (-29823)) ^ (-774765574);
                        i7 = -1545530260;
                        i16 = iM31610 ^ i7;
                        interfaceC4787M29545 = interfaceC4787M29545;
                        c20963 = c20963;
                        i32 = i32;
                        i31 = i31;
                        i13 = i33;
                        i28 = i16;
                        i27 = i6;
                        i33 = i13;
                    }
                    break;
                case -2039788445:
                case -134541865:
                    C3779.m12258(sb, AbstractC3624.m11765(iM2769 ^ 2124387360));
                    C2023.m6955(sb, c);
                    i33 = i33;
                    i31 = i31;
                    i32 = i32;
                    c20963 = c20963;
                    interfaceC4787M29545 = interfaceC4787M29545;
                    iM31610 = C0619.m2761("ܺ֫") ^ i26;
                    i6 = ((iM31610 ^ i25) * (-32419)) ^ 1794957691;
                    i7 = 1279499306;
                    i16 = iM31610 ^ i7;
                    interfaceC4787M29545 = interfaceC4787M29545;
                    c20963 = c20963;
                    i32 = i32;
                    i31 = i31;
                    i13 = i33;
                    i28 = i16;
                    i27 = i6;
                    i33 = i13;
                    break;
                case -2001879169:
                case -851856989:
                    i33 = i33;
                    C24975 c24975 = c24975M11255;
                    i31 = i31;
                    i32 = i32;
                    c20963 = c20963;
                    interfaceC4787M29545 = interfaceC4787M29545;
                    c6046.m17553(treeSet, arrayList2, c24975);
                    if (c6046.f7780.m33196()) {
                        iM31610 = C0773.m3169("ܳ֡") ^ i26;
                        c24975M11255 = c24975;
                        i6 = ((iM31610 ^ i25) * 31083) ^ 14894500;
                        i7 = 1860413795;
                    } else {
                        c24975M11255 = c24975;
                        iM31610 = (C0773.m3169("۠֡") ^ i25) * 63;
                        i6 = ((iM31610 ^ i26) * (-28805)) ^ (-809909502);
                        i7 = -2145621949;
                    }
                    i16 = iM31610 ^ i7;
                    interfaceC4787M29545 = interfaceC4787M29545;
                    c20963 = c20963;
                    i32 = i32;
                    i31 = i31;
                    i13 = i33;
                    i28 = i16;
                    i27 = i6;
                    i33 = i13;
                    break;
                case -1969125815:
                case -1938957672:
                    iM2769 = C0619.m2761(C2966.m9670(sArr3, i33, i32, i29));
                    if (RunnableC3646.m11813() != 0) {
                        iM3169 = C0773.m3169("ܶۛ") ^ i26;
                        i = ((iM3169 ^ i25) * (-24623)) ^ (-1194470060);
                        i2 = -1216254215;
                    } else {
                        iM3169 = (C0619.m2761("ۜۛ") + i25) * (-73);
                        i = ((iM3169 ^ i26) * 299) ^ 577219374;
                        i2 = 28254867;
                    }
                    i28 = iM3169 ^ i2;
                    i27 = i;
                    break;
                case -1967708144:
                case -113205492:
                    C1146.m4235(sb, (InterfaceC4859) C0950.m3796(itM4942));
                    C2023.m6955(sb, c);
                    iM2766 = (C0773.m3169("᩵ᩴ") + i25) * 67;
                    i6 = ((iM2766 ^ i26) * 12689) ^ 218958986;
                    i18 = -141512099;
                    i16 = iM2766 ^ i18;
                    i13 = i33;
                    i28 = i16;
                    i27 = i6;
                    i33 = i13;
                    break;
                case -1798371703:
                case 1335424513:
                    i33 = i33;
                    i31 = i31;
                    i32 = i32;
                    c20963 = c20963;
                    interfaceC4787M29545 = interfaceC4787M29545;
                    c24975M11255 = C3448.m11255(C2485.m8348(c20963.f67049));
                    if (C2834.m9344() < 0) {
                        iM31610 = (C0773.m3169("ۧ۠") ^ i25) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i6 = ((iM31610 ^ i26) * 23887) ^ 1945473454;
                        i7 = -1274982201;
                        i16 = iM31610 ^ i7;
                        interfaceC4787M29545 = interfaceC4787M29545;
                        c20963 = c20963;
                        i32 = i32;
                        i31 = i31;
                        i13 = i33;
                        i28 = i16;
                        i27 = i6;
                        i33 = i13;
                    } else {
                        s = s2;
                        iM2762 = (C0773.m3169("ۚۚ") + i26) * (-77);
                        i3 = ((iM2762 ^ i25) * 14257) ^ (-613534348);
                        i5 = 156440424;
                        i19 = iM2762 ^ i5;
                        s2 = s;
                        interfaceC4787M29545 = interfaceC4787M29545;
                        i33 = i33;
                        i28 = i19;
                        i27 = i3;
                        c20963 = c20963;
                        i32 = i32;
                        c6046 = this;
                        i31 = i31;
                    }
                    break;
                case -1787972826:
                case 1076626645:
                    i33 = i33;
                    sArr = sArr2;
                    i31 = i31;
                    iM2768 = 2103333491 ^ C0619.m2761(C2375.m8069(sArr, i31, 3, i29));
                    if (C2419.m8174() >= 0) {
                        iM2765 = C0619.m2761("ۧۤ") ^ i26;
                        sArr2 = sArr;
                        i6 = ((iM2765 ^ i25) * 20639) ^ 1248150130;
                        i17 = 966687366;
                    } else {
                        sArr2 = sArr;
                        iM2765 = (i26 - C0619.m2761("ۨۢ")) * (-127);
                        i6 = ((iM2765 ^ i25) * (-1965)) ^ 364922430;
                        i17 = 468774510;
                    }
                    i16 = iM2765 ^ i17;
                    i31 = i31;
                    i13 = i33;
                    i28 = i16;
                    i27 = i6;
                    i33 = i13;
                    break;
                case -1782212619:
                case 2139688629:
                    i33 = i33;
                    c6046.f20683 = iM31611 ^ i30;
                    sArr2 = f20682;
                    i31 = 8;
                    if (C0269.f1558 <= 0) {
                        iM2766 = (C0619.m2761("᩸ۧ") ^ i25) * (-3);
                        i6 = ((iM2766 ^ i26) * (-15335)) ^ (-1202458193);
                        i18 = 760202974;
                    } else {
                        iM2766 = C0619.m2761("ᩳᩳ") ^ i26;
                        i6 = ((iM2766 ^ i25) * (-18703)) ^ (-1797367372);
                        i18 = -933721281;
                    }
                    i16 = iM2766 ^ i18;
                    i13 = i33;
                    i28 = i16;
                    i27 = i6;
                    i33 = i13;
                    break;
                case -1725785539:
                case 207493934:
                    i8 = i33;
                    interfaceC4787 = interfaceC4787M29545;
                    i9 = i31;
                    i10 = i32;
                    c20962 = c6046.f20684;
                    if (c20962.f67050 == null) {
                        iM2763 = C0619.m2761("ᩳ֨") ^ i26;
                        i11 = ((iM2763 ^ i25) * 28967) ^ (-785738126);
                        i12 = 1504492413;
                    } else {
                        iM2763 = (i25 - C0619.m2761("ۛ᩸")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i11 = ((iM2763 ^ i26) * (-22371)) ^ (-1777981621);
                        i12 = 12942539;
                    }
                    int i34 = iM2763 ^ i12;
                    interfaceC4787M29545 = interfaceC4787;
                    c20963 = c20962;
                    i27 = i11;
                    i32 = i10;
                    i31 = i9;
                    i13 = i8;
                    i28 = i34;
                    i33 = i13;
                    break;
                case -1576802020:
                case 1637981730:
                    C1080.m4046(sb, c);
                    sArr3 = f20682;
                    i33 = 12;
                    i32 = 3;
                    if (C1146.f4234 < 0) {
                        iM3169 = (C0773.m3169("᩷ۖ") ^ i26) * (-65);
                        i = ((iM3169 ^ i25) * (-24761)) ^ 83486219;
                        i2 = -789717438;
                        i28 = iM3169 ^ i2;
                        i27 = i;
                    } else {
                        c20963 = c20963;
                        interfaceC4787M29545 = interfaceC4787M29545;
                        i31 = i31;
                        s = s2;
                        i32 = 3;
                        i33 = 12;
                        iM2762 = (C0773.m3169("ۚۚ") + i26) * (-77);
                        i3 = ((iM2762 ^ i25) * 14257) ^ (-613534348);
                        i5 = 156440424;
                        i19 = iM2762 ^ i5;
                        s2 = s;
                        interfaceC4787M29545 = interfaceC4787M29545;
                        i33 = i33;
                        i28 = i19;
                        i27 = i3;
                        c20963 = c20963;
                        i32 = i32;
                        c6046 = this;
                        i31 = i31;
                    }
                    break;
                case -1513520368:
                case 1073105174:
                    C2878.m9491();
                    if (!C3077.m10041()) {
                        i33 = i33;
                        i31 = i31;
                        i32 = i32;
                        c20963 = c20963;
                        interfaceC4787M29545 = interfaceC4787M29545;
                        iM2761 = (C0619.m2761("۬᩺") + i25) * 53;
                        i3 = ((iM2761 ^ i26) * 15699) ^ (-838195421);
                        i4 = -1887010501;
                        i19 = iM2761 ^ i4;
                        interfaceC4787M29545 = interfaceC4787M29545;
                        i33 = i33;
                        i28 = i19;
                        i27 = i3;
                        c20963 = c20963;
                        i32 = i32;
                        c6046 = this;
                        i31 = i31;
                    } else {
                        i33 = i33;
                        sArr = sArr2;
                        i31 = i31;
                        iM2765 = C0619.m2761("ۧۤ") ^ i26;
                        sArr2 = sArr;
                        i6 = ((iM2765 ^ i25) * 20639) ^ 1248150130;
                        i17 = 966687366;
                        i16 = iM2765 ^ i17;
                        i31 = i31;
                        i13 = i33;
                        i28 = i16;
                        i27 = i6;
                        i33 = i13;
                    }
                    break;
                case -1473967925:
                case 731224961:
                    try {
                        C3033.m9861(c22941);
                        iM3169 = C0619.m2761("ۙܶ") ^ i26;
                        i = ((iM3169 ^ i25) * 11081) ^ (-1605528798);
                        i2 = 1916033697;
                        i28 = iM3169 ^ i2;
                    } catch (Throwable th3) {
                        int iM31612 = (C0773.m3169("ۛܽ") ^ i25) * (-105);
                        i = ((iM31612 ^ i26) * (-24627)) ^ 1859032472;
                        i28 = iM31612 ^ 1308306840;
                        obj = th3;
                    }
                    i27 = i;
                    break;
                case -1460596339:
                case 2111024193:
                    RunnableC1848.m6369(c22941);
                    return;
                case -1417527300:
                case -903448254:
                    i33 = i33;
                    i31 = i31;
                    i32 = i32;
                    str = (String) C4238.m13529(it);
                    interfaceC4788 = interfaceC4787M29545;
                    if (!interfaceC4788.test(str)) {
                        interfaceC4787M29545 = interfaceC4788;
                        c20963 = c20963;
                        int iM31613 = C0773.m3169("᩷᩹") ^ i26;
                        i6 = ((iM31613 ^ i25) * (-19165)) ^ (-1582527690);
                        i16 = iM31613 ^ (-1515617149);
                        c20963 = c20963;
                        i32 = i32;
                        i31 = i31;
                        i13 = i33;
                        i28 = i16;
                        i27 = i6;
                        i33 = i13;
                    } else {
                        iM2764 = (C0619.m2761("᩺֫") + i26) * (-89);
                        i14 = ((iM2764 ^ i25) * 6735) ^ (-1651476415);
                        i15 = -1393676337;
                        int i35 = iM2764 ^ i15;
                        interfaceC4787M29545 = interfaceC4788;
                        i33 = i33;
                        i28 = i35;
                        i27 = i14;
                        i32 = i32;
                        i31 = i31;
                    }
                    break;
                case -1310103599:
                case -187823723:
                    AbstractC0641.m2813();
                    iM3169 = (C0619.m2761("ۧܿ") ^ i25) * (-43);
                    i = ((iM3169 ^ i26) * 29871) ^ (-1834587100);
                    i2 = 1187852351;
                    i28 = iM3169 ^ i2;
                    i27 = i;
                    break;
                case -1301282521:
                case 1215356543:
                    i8 = i33;
                    i9 = i31;
                    i10 = i32;
                    C20962 c20964 = c20963;
                    c20964.f67050 = treeSet;
                    c20964.f67044 = arrayList2;
                    interfaceC4787 = interfaceC4787M29545;
                    c20962 = c20964;
                    iM2763 = (i25 - C0619.m2761("ۛ᩸")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i11 = ((iM2763 ^ i26) * (-22371)) ^ (-1777981621);
                    i12 = 12942539;
                    int i36 = iM2763 ^ i12;
                    interfaceC4787M29545 = interfaceC4787;
                    c20963 = c20962;
                    i27 = i11;
                    i32 = i10;
                    i31 = i9;
                    i13 = i8;
                    i28 = i36;
                    i33 = i13;
                    break;
                case -1230880149:
                case 2043774219:
                    i33 = i33;
                    z = z2;
                    i31 = i31;
                    i32 = i32;
                    c20963 = c20963;
                    interfaceC4787M29545 = interfaceC4787M29545;
                    try {
                        itM7968 = C2354.m7968(c22941.m51728(z));
                        iM31610 = (i26 - C0773.m3169("ᩴܺ")) * 31;
                        z2 = z;
                        i6 = ((iM31610 ^ i25) * 3385) ^ 1328918910;
                        i7 = 1081689766;
                    } catch (Throwable th4) {
                        z2 = z;
                        th = th4;
                        iM31610 = C0619.m2761("ᩳ᩺") ^ i26;
                        i6 = ((iM31610 ^ i25) * (-29823)) ^ (-774765574);
                        i7 = -1545530260;
                    }
                    i16 = iM31610 ^ i7;
                    interfaceC4787M29545 = interfaceC4787M29545;
                    c20963 = c20963;
                    i32 = i32;
                    i31 = i31;
                    i13 = i33;
                    i28 = i16;
                    i27 = i6;
                    i33 = i13;
                    break;
                case -1123911440:
                case -426472409:
                    return;
                case -1111480792:
                case -726495460:
                    if (C0862.f3233 != 0) {
                        iM3169 = (C0619.m2761("ۧܿ") ^ i25) * (-43);
                        i = ((iM3169 ^ i26) * 29871) ^ (-1834587100);
                        i2 = 1187852351;
                    } else {
                        iM3169 = C0773.m3169("ۚ᩶") ^ i26;
                        i = ((iM3169 ^ i25) * 23705) ^ (-1595644973);
                        i2 = 1075110924;
                    }
                    i28 = iM3169 ^ i2;
                    i27 = i;
                    break;
                case -1003177967:
                case 470481764:
                    i33 = i33;
                    i31 = i31;
                    i32 = i32;
                    c20963 = c20963;
                    interfaceC4787M29545 = C11769.m29545(c6046.f20685);
                    it = c20963.f67050.iterator();
                    int iM31614 = C0773.m3169("᩷᩹") ^ i26;
                    i6 = ((iM31614 ^ i25) * (-19165)) ^ (-1582527690);
                    i16 = iM31614 ^ (-1515617149);
                    c20963 = c20963;
                    i32 = i32;
                    i31 = i31;
                    i13 = i33;
                    i28 = i16;
                    i27 = i6;
                    i33 = i13;
                    break;
                case -966458214:
                case 1506462333:
                    zM12923 = C3998.m12923(itM7968);
                    iM3169 = C0619.m2761("ۘۖ") ^ i25;
                    i = ((iM3169 ^ i26) * (-19793)) ^ 759713777;
                    i2 = -1771656331;
                    i28 = iM3169 ^ i2;
                    i27 = i;
                    break;
                case -953121938:
                case -435335343:
                    C1146.m4219(th, obj);
                    iM3169 = C0619.m2761("ۙܶ") ^ i26;
                    i = ((iM3169 ^ i25) * 11081) ^ (-1605528798);
                    i2 = 1916033697;
                    i28 = iM3169 ^ i2;
                    i27 = i;
                    break;
                case -932983974:
                case 1468164634:
                    if (C2419.f7754 < 0) {
                        i33 = i33;
                        sArr = sArr2;
                        i31 = i31;
                        iM2765 = C0619.m2761("ۧۤ") ^ i26;
                        sArr2 = sArr;
                        i6 = ((iM2765 ^ i25) * 20639) ^ 1248150130;
                        i17 = 966687366;
                        i16 = iM2765 ^ i17;
                        i31 = i31;
                        i13 = i33;
                        i28 = i16;
                        i27 = i6;
                        i33 = i13;
                    } else {
                        iM3169 = (C0619.m2761("ۧܿ") ^ i25) * (-43);
                        i = ((iM3169 ^ i26) * 29871) ^ (-1834587100);
                        i2 = 1187852351;
                        i28 = iM3169 ^ i2;
                        i27 = i;
                    }
                    break;
                case -859766067:
                case 1183309699:
                    C2834.m9344();
                    if (C11235.m28309() != 0) {
                        iM3169 = C0773.m3169("ܶۛ") ^ i26;
                        i = ((iM3169 ^ i25) * (-24623)) ^ (-1194470060);
                        i2 = -1216254215;
                        i28 = iM3169 ^ i2;
                        i27 = i;
                    } else {
                        i33 = i33;
                        i31 = i31;
                        i32 = i32;
                        c20963 = c20963;
                        interfaceC4787M29545 = interfaceC4787M29545;
                        iM2761 = (C0619.m2761("۬᩺") + i25) * 53;
                        i3 = ((iM2761 ^ i26) * 15699) ^ (-838195421);
                        i4 = -1887010501;
                        i19 = iM2761 ^ i4;
                        interfaceC4787M29545 = interfaceC4787M29545;
                        i33 = i33;
                        i28 = i19;
                        i27 = i3;
                        c20963 = c20963;
                        i32 = i32;
                        c6046 = this;
                        i31 = i31;
                    }
                    break;
                case -827058389:
                case 1382051241:
                    i33 = i33;
                    i31 = i31;
                    i32 = i32;
                    c20963 = c20963;
                    interfaceC4787M29545 = interfaceC4787M29545;
                    int i37 = i22 + i23;
                    if ((i37 + i37) - i21 >= 0) {
                        iM31610 = C0619.m2761("ܿۧ") ^ i26;
                        i6 = ((iM31610 ^ i25) * (-13173)) ^ 622128536;
                        i7 = -825407705;
                    } else {
                        iM31610 = C0773.m3169("ۨۛ") ^ i26;
                        i6 = ((iM31610 ^ i25) * 23831) ^ (-581664084);
                        i7 = -1237445103;
                    }
                    i16 = iM31610 ^ i7;
                    interfaceC4787M29545 = interfaceC4787M29545;
                    c20963 = c20963;
                    i32 = i32;
                    i31 = i31;
                    i13 = i33;
                    i28 = i16;
                    i27 = i6;
                    i33 = i13;
                    break;
                case -774356126:
                case -729092066:
                    i33 = i33;
                    i31 = i31;
                    i32 = i32;
                    c20963 = c20963;
                    interfaceC4787M29545 = interfaceC4787M29545;
                    treeSet = new TreeSet();
                    arrayList2 = new ArrayList();
                    if (c20963.f67047) {
                        iM31610 = C0619.m2761("ۧ᩹") ^ i25;
                        i6 = ((iM31610 ^ i26) * (-13591)) ^ (-1817362779);
                        i7 = 768221486;
                    } else {
                        iM31610 = C0619.m2761("ܽۗ") ^ i26;
                        i6 = ((iM31610 ^ i25) * 7969) ^ (-1344391817);
                        i7 = -880808840;
                    }
                    i16 = iM31610 ^ i7;
                    interfaceC4787M29545 = interfaceC4787M29545;
                    c20963 = c20963;
                    i32 = i32;
                    i31 = i31;
                    i13 = i33;
                    i28 = i16;
                    i27 = i6;
                    i33 = i13;
                    break;
                case -710664314:
                case -41898789:
                    i33 = i33;
                    ArrayList arrayList3 = arrayListM47937;
                    i31 = i31;
                    i32 = i32;
                    c20963 = c20963;
                    interfaceC4787M29545 = interfaceC4787M29545;
                    arrayList = (ArrayList) c20963.m47940(arrayList3);
                    if (C3099.m10097(arrayList)) {
                        arrayListM47937 = arrayList3;
                        iM31610 = C0619.m2761("ܺ֫") ^ i26;
                        i6 = ((iM31610 ^ i25) * (-32419)) ^ 1794957691;
                        i7 = 1279499306;
                    } else {
                        iM31610 = C0619.m2761("ۧܰ") ^ i26;
                        arrayListM47937 = arrayList3;
                        i6 = ((iM31610 ^ i25) * (-23707)) ^ (-2054112239);
                        i7 = -990290582;
                    }
                    i16 = iM31610 ^ i7;
                    interfaceC4787M29545 = interfaceC4787M29545;
                    c20963 = c20963;
                    i32 = i32;
                    i31 = i31;
                    i13 = i33;
                    i28 = i16;
                    i27 = i6;
                    i33 = i13;
                    break;
                case -628733827:
                case 1271747241:
                    if (C1826.m6317(itM4942)) {
                        iM3169 = C0773.m3169("ܽۡ") ^ i26;
                        i = ((iM3169 ^ i25) * (-24149)) ^ (-657115347);
                        i2 = 1899477442;
                    } else {
                        iM3169 = (C0619.m2761("ۤ᩻") + i25) * 41;
                        i = ((iM3169 ^ i26) * (-25885)) ^ (-2099424860);
                        i2 = 491595912;
                    }
                    i28 = iM3169 ^ i2;
                    i27 = i;
                    break;
                case -552250329:
                case -427732740:
                    RunnableC1848.m6369(c22941);
                    i33 = i33;
                    i31 = i31;
                    i32 = i32;
                    c20963 = c20963;
                    interfaceC4787M29545 = interfaceC4787M29545;
                    iM31610 = (C0773.m3169("۠֡") ^ i25) * 63;
                    i6 = ((iM31610 ^ i26) * (-28805)) ^ (-809909502);
                    i7 = -2145621949;
                    i16 = iM31610 ^ i7;
                    interfaceC4787M29545 = interfaceC4787M29545;
                    c20963 = c20963;
                    i32 = i32;
                    i31 = i31;
                    i13 = i33;
                    i28 = i16;
                    i27 = i6;
                    i33 = i13;
                    break;
                case -529248329:
                case 1458860798:
                    C3779.m12258(sb, AbstractC3624.m11765(iM2768));
                    C2023.m6955(sb, '\n');
                    itM4942 = C1343.m4942(arrayList);
                    c = '\n';
                    iM2766 = (C0773.m3169("᩵ᩴ") + i25) * 67;
                    i6 = ((iM2766 ^ i26) * 12689) ^ 218958986;
                    i18 = -141512099;
                    i16 = iM2766 ^ i18;
                    i13 = i33;
                    i28 = i16;
                    i27 = i6;
                    i33 = i13;
                    break;
                case -429384837:
                case 132669734:
                    i33 = i33;
                    sb.setLength(C2287.m7738(sb) - 1);
                    interfaceC4788 = interfaceC4787M29545;
                    i31 = i31;
                    i32 = i32;
                    iM2764 = C0619.m2761("ۙۧ") ^ i25;
                    i14 = ((iM2764 ^ i26) * (-2219)) ^ (-988904280);
                    i15 = 1001826969;
                    int i38 = iM2764 ^ i15;
                    interfaceC4787M29545 = interfaceC4788;
                    i33 = i33;
                    i28 = i38;
                    i27 = i14;
                    i32 = i32;
                    i31 = i31;
                    break;
                case -367939003:
                case 1739396635:
                    i33 = i33;
                    interfaceC4788 = interfaceC4787M29545;
                    i31 = i31;
                    i32 = i32;
                    if (C0862.m3510(sb) > 0) {
                        iM2764 = C0619.m2761("ᩳᩴ") ^ i25;
                        i14 = ((iM2764 ^ i26) * (-24507)) ^ 2091336531;
                        i15 = 1706625050;
                    } else {
                        iM2764 = C0619.m2761("ۙۧ") ^ i25;
                        i14 = ((iM2764 ^ i26) * (-2219)) ^ (-988904280);
                        i15 = 1001826969;
                    }
                    int i39 = iM2764 ^ i15;
                    interfaceC4787M29545 = interfaceC4788;
                    i33 = i33;
                    i28 = i39;
                    i27 = i14;
                    i32 = i32;
                    i31 = i31;
                    break;
                case -307691116:
                case 1005914370:
                    i33 = i33;
                    i31 = i31;
                    i32 = i32;
                    c20963 = c20963;
                    interfaceC4787M29545 = interfaceC4787M29545;
                    arrayListM47937 = C20962.m47937(c6046.f20688);
                    if (C1321.m4851(arrayListM47937)) {
                        iM31610 = C0619.m2761("ܺ֫") ^ i26;
                        i6 = ((iM31610 ^ i25) * (-32419)) ^ 1794957691;
                        i7 = 1279499306;
                    } else {
                        iM31610 = C0773.m3169("ۡۗ") ^ i26;
                        i6 = ((iM31610 ^ i25) * (-32147)) ^ 1993061744;
                        i7 = 1574109722;
                    }
                    i16 = iM31610 ^ i7;
                    interfaceC4787M29545 = interfaceC4787M29545;
                    c20963 = c20963;
                    i32 = i32;
                    i31 = i31;
                    i13 = i33;
                    i28 = i16;
                    i27 = i6;
                    i33 = i13;
                    break;
                case -205192977:
                case 1508136682:
                    c6046.f20687 = C2023.m6952(sb);
                    return;
                case -197896490:
                case 1852029728:
                    if (zM12923) {
                        iM3169 = C0773.m3169("֨ܿ") ^ i25;
                        i = ((iM3169 ^ i26) * 23759) ^ (-1358549086);
                        i2 = -220074284;
                    } else {
                        iM3169 = (C0773.m3169("۬ۖ") ^ i26) * 43;
                        i = ((iM3169 ^ i25) * (-13137)) ^ 34336296;
                        i2 = 856984967;
                    }
                    i28 = iM3169 ^ i2;
                    i27 = i;
                    break;
                case -196907596:
                case 1141928955:
                    RunnableC3055.m9933();
                    if (AbstractC0641.f2496 >= 0) {
                        i33 = i33;
                        i31 = i31;
                        s = s2;
                        i32 = i32;
                        c20963 = c20963;
                        interfaceC4787M29545 = interfaceC4787M29545;
                        iM2762 = (C0773.m3169("ۚۚ") + i26) * (-77);
                        i3 = ((iM2762 ^ i25) * 14257) ^ (-613534348);
                        i5 = 156440424;
                        i19 = iM2762 ^ i5;
                        s2 = s;
                        interfaceC4787M29545 = interfaceC4787M29545;
                        i33 = i33;
                        i28 = i19;
                        i27 = i3;
                        c20963 = c20963;
                        i32 = i32;
                        c6046 = this;
                        i31 = i31;
                    }
                    i33 = i33;
                    i31 = i31;
                    i32 = i32;
                    c20963 = c20963;
                    interfaceC4787M29545 = interfaceC4787M29545;
                    iM2761 = (C0619.m2761("۬᩺") + i25) * 53;
                    i3 = ((iM2761 ^ i26) * 15699) ^ (-838195421);
                    i4 = -1887010501;
                    i19 = iM2761 ^ i4;
                    interfaceC4787M29545 = interfaceC4787M29545;
                    i33 = i33;
                    i28 = i19;
                    i27 = i3;
                    c20963 = c20963;
                    i32 = i32;
                    c6046 = this;
                    i31 = i31;
                    break;
                case -184530315:
                case 1545131594:
                    i33 = i33;
                    i31 = i31;
                    iM31611 = C0773.m3169(strM11996);
                    i30 = 2097978885;
                    if (C2419.f7754 < 0) {
                        iM2765 = (C0619.m2761("ۗ᩵") + i25) * (-29);
                        i6 = ((iM2765 ^ i26) * (-10827)) ^ (-965224585);
                        i17 = 1230180804;
                        i16 = iM2765 ^ i17;
                        i31 = i31;
                        i13 = i33;
                        i28 = i16;
                        i27 = i6;
                        i33 = i13;
                    } else {
                        i32 = i32;
                        c20963 = c20963;
                        interfaceC4787M29545 = interfaceC4787M29545;
                        s = s2;
                        iM2762 = (C0773.m3169("ۚۚ") + i26) * (-77);
                        i3 = ((iM2762 ^ i25) * 14257) ^ (-613534348);
                        i5 = 156440424;
                        i19 = iM2762 ^ i5;
                        s2 = s;
                        interfaceC4787M29545 = interfaceC4787M29545;
                        i33 = i33;
                        i28 = i19;
                        i27 = i3;
                        c20963 = c20963;
                        i32 = i32;
                        c6046 = this;
                        i31 = i31;
                    }
                    break;
                case -96255914:
                case 1609887758:
                    throw th;
                case -85213098:
                case 2089847889:
                    if (C1564.f5401 <= 0) {
                        iM3169 = C0619.m2761("۠ۜ") ^ i25;
                        i = ((iM3169 ^ i26) * (-811)) ^ (-1237195383);
                        i2 = 617947938;
                    } else {
                        iM3169 = C0619.m2761("֫ۨ") ^ i25;
                        i = ((iM3169 ^ i26) * (-3493)) ^ 323503090;
                        i2 = 1739582219;
                    }
                    i28 = iM3169 ^ i2;
                    i27 = i;
                    break;
                case -25231832:
                case 1186619685:
                    i29 = 61993;
                    iM31610 = C0773.m3169("ۢ᩸") ^ i25;
                    i6 = ((iM31610 ^ i26) * 21447) ^ (-1849044012);
                    i7 = 1846334373;
                    i16 = iM31610 ^ i7;
                    interfaceC4787M29545 = interfaceC4787M29545;
                    c20963 = c20963;
                    i32 = i32;
                    i31 = i31;
                    i13 = i33;
                    i28 = i16;
                    i27 = i6;
                    i33 = i13;
                    break;
                case 100498123:
                case 644499319:
                    if (C3099.f10023 <= 0) {
                        i33 = i33;
                        i31 = i31;
                        s = s2;
                        i32 = i32;
                        c20963 = c20963;
                        interfaceC4787M29545 = interfaceC4787M29545;
                        iM2762 = C0619.m2761("ۙۜ") ^ i26;
                        i3 = ((iM2762 ^ i25) * (-2397)) ^ 71983722;
                        i5 = -230811992;
                        i19 = iM2762 ^ i5;
                        s2 = s;
                        interfaceC4787M29545 = interfaceC4787M29545;
                        i33 = i33;
                        i28 = i19;
                        i27 = i3;
                        c20963 = c20963;
                        i32 = i32;
                        c6046 = this;
                        i31 = i31;
                    } else {
                        iM3169 = C0773.m3169("ۚ᩶") ^ i26;
                        i = ((iM3169 ^ i25) * 23705) ^ (-1595644973);
                        i2 = 1075110924;
                        i28 = iM3169 ^ i2;
                        i27 = i;
                    }
                    break;
                case 252767224:
                case 1590073694:
                    if (!zM33196) {
                        i33 = i33;
                        z = z2;
                        i31 = i31;
                        i32 = i32;
                        c20963 = c20963;
                        interfaceC4787M29545 = interfaceC4787M29545;
                        iM31610 = (i26 - C0773.m3169("ᩴܺ")) * 31;
                        z2 = z;
                        i6 = ((iM31610 ^ i25) * 3385) ^ 1328918910;
                        i7 = 1081689766;
                        i16 = iM31610 ^ i7;
                        interfaceC4787M29545 = interfaceC4787M29545;
                        c20963 = c20963;
                        i32 = i32;
                        i31 = i31;
                        i13 = i33;
                        i28 = i16;
                        i27 = i6;
                        i33 = i13;
                    } else {
                        iM3169 = (i25 - C0773.m3169("᩵ܺ")) * (-119);
                        i = ((iM3169 ^ i26) * (-16675)) ^ (-715235098);
                        i2 = -442409419;
                        i28 = iM3169 ^ i2;
                        i27 = i;
                    }
                    break;
                case 284924142:
                case 1284391369:
                    i33 = i33;
                    i31 = i31;
                    i32 = i32;
                    strM11996 = C3690.m11996(f20682, 5, 3, i29);
                    if (RunnableC0334.f1808 > 0) {
                        int iM27610 = C0619.m2761("ۤۚ") ^ i25;
                        i6 = ((iM27610 ^ i26) * (-29109)) ^ (-1378556140);
                        i16 = iM27610 ^ (-1756188322);
                        i32 = i32;
                        i31 = i31;
                        i13 = i33;
                        i28 = i16;
                        i27 = i6;
                        i33 = i13;
                    } else {
                        c20963 = c20963;
                        interfaceC4787M29545 = interfaceC4787M29545;
                        s = s2;
                        iM2762 = C0619.m2761("ۙۜ") ^ i26;
                        i3 = ((iM2762 ^ i25) * (-2397)) ^ 71983722;
                        i5 = -230811992;
                        i19 = iM2762 ^ i5;
                        s2 = s;
                        interfaceC4787M29545 = interfaceC4787M29545;
                        i33 = i33;
                        i28 = i19;
                        i27 = i3;
                        c20963 = c20963;
                        i32 = i32;
                        c6046 = this;
                        i31 = i31;
                    }
                    break;
                case 332854994:
                case 1969728038:
                    i33 = i33;
                    i31 = i31;
                    i32 = i32;
                    c20963 = c20963;
                    interfaceC4787M29545 = interfaceC4787M29545;
                    i21 = i20 * i20;
                    s = s2;
                    i22 = s * s;
                    i23 = 39025009;
                    if (C0773.f2792 <= 0) {
                        iM2762 = (C0773.m3169("ۚۚ") + i26) * (-77);
                        i3 = ((iM2762 ^ i25) * 14257) ^ (-613534348);
                        i5 = 156440424;
                    } else {
                        iM2762 = C0619.m2761("ۗۜ") ^ i25;
                        i3 = ((iM2762 ^ i26) * 21513) ^ (-270794944);
                        i5 = -1394152813;
                    }
                    i19 = iM2762 ^ i5;
                    s2 = s;
                    interfaceC4787M29545 = interfaceC4787M29545;
                    i33 = i33;
                    i28 = i19;
                    i27 = i3;
                    c20963 = c20963;
                    i32 = i32;
                    c6046 = this;
                    i31 = i31;
                    break;
                case 567298674:
                case 1567838483:
                    C3779.m12258(sb, str);
                    i33 = i33;
                    C1783.m6234(sb, C1826.m6310(f20682, 11, 1, i29));
                    i31 = i31;
                    i32 = i32;
                    c20963 = c20963;
                    int iM31615 = C0773.m3169("᩷᩹") ^ i26;
                    i6 = ((iM31615 ^ i25) * (-19165)) ^ (-1582527690);
                    i16 = iM31615 ^ (-1515617149);
                    c20963 = c20963;
                    i32 = i32;
                    i31 = i31;
                    i13 = i33;
                    i28 = i16;
                    i27 = i6;
                    i33 = i13;
                    break;
                case 769461227:
                case 1014036706:
                    i33 = i33;
                    i31 = i31;
                    i32 = i32;
                    c20963 = c20963;
                    interfaceC4787M29545 = interfaceC4787M29545;
                    if (C1826.m6317(it)) {
                        iM31610 = C0619.m2761("ۙ֨") ^ i26;
                        i6 = ((iM31610 ^ i25) * 3023) ^ (-1938702090);
                        i7 = 603269017;
                    } else {
                        iM31610 = (C0773.m3169("᩸۬") + i25) * (-123);
                        i6 = ((iM31610 ^ i26) * 7521) ^ 371455713;
                        i7 = 719861712;
                    }
                    i16 = iM31610 ^ i7;
                    interfaceC4787M29545 = interfaceC4787M29545;
                    c20963 = c20963;
                    i32 = i32;
                    i31 = i31;
                    i13 = i33;
                    i28 = i16;
                    i27 = i6;
                    i33 = i13;
                    break;
                case 985841974:
                case 1010837663:
                    C1343.m4943();
                    RunnableC3055.m9933();
                    return;
                case 1044974440:
                case 1818936568:
                    i29 = 37551;
                    iM31610 = C0773.m3169("ۢ᩸") ^ i25;
                    i6 = ((iM31610 ^ i26) * 21447) ^ (-1849044012);
                    i7 = 1846334373;
                    i16 = iM31610 ^ i7;
                    interfaceC4787M29545 = interfaceC4787M29545;
                    c20963 = c20963;
                    i32 = i32;
                    i31 = i31;
                    i13 = i33;
                    i28 = i16;
                    i27 = i6;
                    i33 = i13;
                    break;
                case 1124649672:
                case 1188433202:
                    i33 = i33;
                    i31 = i31;
                    i32 = i32;
                    c20963 = c20963;
                    interfaceC4787M29545 = interfaceC4787M29545;
                    c22941 = new C22941(c20963.f67049);
                    z2 = false;
                    iM31610 = (i25 - C0773.m3169("۬۠")) * 27;
                    i6 = ((iM31610 ^ i26) * (-7737)) ^ (-2136861425);
                    i7 = -399472136;
                    i16 = iM31610 ^ i7;
                    interfaceC4787M29545 = interfaceC4787M29545;
                    c20963 = c20963;
                    i32 = i32;
                    i31 = i31;
                    i13 = i33;
                    i28 = i16;
                    i27 = i6;
                    i33 = i13;
                    break;
                case 1402299307:
                case 2000683362:
                    i33 = i33;
                    i31 = i31;
                    i32 = i32;
                    c20963 = c20963;
                    interfaceC4787M29545 = interfaceC4787M29545;
                    sb = new StringBuilder();
                    if (c6046.f20689) {
                        iM31610 = C0619.m2761("ᩴۜ") ^ i25;
                        i6 = ((iM31610 ^ i26) * 12217) ^ (-1898401263);
                        i7 = -1879565279;
                    } else {
                        iM31610 = C0619.m2761("ܺ֫") ^ i26;
                        i6 = ((iM31610 ^ i25) * (-32419)) ^ 1794957691;
                        i7 = 1279499306;
                    }
                    i16 = iM31610 ^ i7;
                    interfaceC4787M29545 = interfaceC4787M29545;
                    c20963 = c20963;
                    i32 = i32;
                    i31 = i31;
                    i13 = i33;
                    i28 = i16;
                    i27 = i6;
                    i33 = i13;
                    break;
                case 1472306905:
                case 1611330989:
                    i33 = i33;
                    i31 = i31;
                    s = s2;
                    i32 = i32;
                    c20963 = c20963;
                    interfaceC4787M29545 = interfaceC4787M29545;
                    int i40 = s + 6247;
                    if (C3779.f12953 <= 0) {
                        i20 = i40;
                        iM2762 = C0619.m2761("ۙۜ") ^ i26;
                        i3 = ((iM2762 ^ i25) * (-2397)) ^ 71983722;
                        i5 = -230811992;
                        i19 = iM2762 ^ i5;
                        s2 = s;
                        interfaceC4787M29545 = interfaceC4787M29545;
                        i33 = i33;
                        i28 = i19;
                        i27 = i3;
                    } else {
                        int iM27611 = (i25 - C0619.m2761("᩵֡")) * (-59);
                        i20 = i40;
                        i27 = ((iM27611 ^ i26) * (-15341)) ^ 1503315129;
                        s2 = s;
                        interfaceC4787M29545 = interfaceC4787M29545;
                        i33 = i33;
                        i28 = iM27611 ^ 581473715;
                    }
                    c20963 = c20963;
                    i32 = i32;
                    c6046 = this;
                    i31 = i31;
                    break;
                case 1582338519:
                case 1612426932:
                    i33 = i33;
                    i31 = i31;
                    i32 = i32;
                    c20963 = c20963;
                    interfaceC4787M29545 = interfaceC4787M29545;
                    s2 = f20682[4];
                    if (C3077.f9998) {
                        iM2761 = C0619.m2761("ۜ֫") ^ i26;
                        i3 = ((iM2761 ^ i25) * (-25069)) ^ 676996156;
                        i4 = -394400152;
                    } else {
                        iM2761 = (C0619.m2761("۬᩺") + i25) * 53;
                        i3 = ((iM2761 ^ i26) * 15699) ^ (-838195421);
                        i4 = -1887010501;
                    }
                    i19 = iM2761 ^ i4;
                    interfaceC4787M29545 = interfaceC4787M29545;
                    i33 = i33;
                    i28 = i19;
                    i27 = i3;
                    c20963 = c20963;
                    i32 = i32;
                    c6046 = this;
                    i31 = i31;
                    break;
                default:
                    if (C0862.f3233 == 0) {
                        iM3169 = C0619.m2761("۠ۜ") ^ i25;
                        i = ((iM3169 ^ i26) * (-811)) ^ (-1237195383);
                        i2 = 617947938;
                        i28 = iM3169 ^ i2;
                        i27 = i;
                    } else {
                        i33 = i33;
                        i31 = i31;
                        i32 = i32;
                        c20963 = c20963;
                        interfaceC4787M29545 = interfaceC4787M29545;
                        iM2761 = (C0619.m2761("۬᩺") + i25) * 53;
                        i3 = ((iM2761 ^ i26) * 15699) ^ (-838195421);
                        i4 = -1887010501;
                        i19 = iM2761 ^ i4;
                        interfaceC4787M29545 = interfaceC4787M29545;
                        i33 = i33;
                        i28 = i19;
                        i27 = i3;
                        c20963 = c20963;
                        i32 = i32;
                        c6046 = this;
                        i31 = i31;
                    }
                    break;
            }
        }
    }
}
