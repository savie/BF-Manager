package l;

import android.content.pm.PackageInfo;
import java.util.List;

/* JADX INFO: renamed from: l.ۡᩴۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: C2R7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9059 extends AbstractC13946 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ List f30908;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8387 f30909;

    public C9059(C8387 c8387, List list) {
        this.f30909 = c8387;
        this.f30908 = list;
    }

    @Override // l.AbstractC13946
    /* JADX INFO: renamed from: ܰ */
    public final int mo7139() {
        return this.f30909.size();
    }

    @Override // l.AbstractC13946
    /* JADX INFO: renamed from: ۙ */
    public final int mo7137() {
        return C7105.m18986(this.f30908);
    }

    @Override // l.AbstractC13946
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo7140(int i, int i2) {
        C8387 c8387 = null;
        C16819 c16819 = null;
        String str = null;
        Object objM7592 = null;
        int i3 = -1377804248;
        int i4 = C3577.f13150;
        int i5 = C10634.f36300;
        int iM45029 = (i4 - C19806.m45029("ۙۢ")) * 99;
        int i6 = ((iM45029 ^ i5) * (-32053)) ^ 841055585;
        int i7 = -111680614;
        while (true) {
            i3 = ((((i3 ^ i5) * (-14871)) >> 31) & i6) ^ (iM45029 ^ i7);
            switch (i3) {
                case -2079652847:
                case -1643899843:
                    return C1460.m5058(str, ((C16819) objM7592).f53838);
                case -1780186155:
                case 1686782057:
                    if (C1377.f5749) {
                        iM45029 = C19806.m45029("֨᩶") ^ i4;
                        i6 = ((iM45029 ^ i5) * (-11025)) ^ 1053729041;
                        i7 = -487759769;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۛ֫") ^ i5;
                        i6 = ((iM45029 ^ i4) * 19797) ^ (-2129501960);
                        i7 = -983946822;
                    }
                    break;
                case -1614481222:
                case 1873288988:
                    RunnableC0195.m1431();
                    C2249.m6915();
                    return false;
                case -1450224899:
                case 460372000:
                    c8387 = this.f30909;
                    if (C1460.f5948 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۛ֫") ^ i5;
                        i6 = ((iM45029 ^ i4) * 19797) ^ (-2129501960);
                        i7 = -983946822;
                    } else {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("֨᩵")) * 29;
                        i6 = ((iM45029 ^ i5) * (-24013)) ^ (-283127469);
                        i7 = 1551636375;
                    }
                    break;
                case -1210795661:
                case 573667444:
                    if (C2642.f10294 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۜۚ") ^ i4;
                        i6 = ((iM45029 ^ i5) * (-1937)) ^ (-1075878729);
                        i7 = -822903429;
                    } else {
                        iM45029 = C19806.m45029("ۗ᩹") ^ i4;
                        i6 = ((iM45029 ^ i5) * (-15175)) ^ (-577899127);
                        i7 = -1513124336;
                    }
                    break;
                case -715804487:
                case 433043797:
                    c16819 = (C16819) c8387.get(i);
                    if (C2332.f8260) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܽۡ") + i5) * 45;
                        i6 = ((iM45029 ^ i4) * 15489) ^ 197638146;
                        i7 = 1995185802;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۛ֫") ^ i5;
                        i6 = ((iM45029 ^ i4) * 19797) ^ (-2129501960);
                        i7 = -983946822;
                    }
                    break;
                case -621520378:
                case 1093565817:
                    if (C3286.f12186) {
                        iM45029 = ThreadFactoryC3888.m11306("ۜۚ") ^ i4;
                        i6 = ((iM45029 ^ i5) * (-1937)) ^ (-1075878729);
                        i7 = -822903429;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֨۟") ^ i4;
                        i6 = ((iM45029 ^ i5) * (-4729)) ^ (-1802509330);
                        i7 = 756632855;
                    }
                    break;
                case -526975935:
                case 2015423482:
                    if (ViewGroupOnHierarchyChangeListenerC1916.m6233() != 0) {
                        iM45029 = (C19806.m45029("ۘۖ") ^ i5) * 109;
                        i6 = ((iM45029 ^ i4) * (-15309)) ^ 1700110447;
                        i7 = -1404015617;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܽ᩶") ^ i5) * (-121);
                        i6 = ((iM45029 ^ i4) * (-1601)) ^ 95899982;
                        i7 = -1874545463;
                    }
                    break;
                case -440864335:
                case 2052984801:
                    if (C3577.f13150 >= 0) {
                        iM45029 = (C19806.m45029("ۘۖ") ^ i5) * 109;
                        i6 = ((iM45029 ^ i4) * (-15309)) ^ 1700110447;
                        i7 = -1404015617;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۨ֨") ^ i5;
                        i6 = ((iM45029 ^ i4) * (-16999)) ^ 801304222;
                        i7 = 549510929;
                    }
                    break;
                case -124516722:
                case 2030685479:
                    C0278.m1789();
                    if (C2704.f10408) {
                        iM45029 = ThreadFactoryC3888.m11306("ۜۚ") ^ i4;
                        i6 = ((iM45029 ^ i5) * (-1937)) ^ (-1075878729);
                        i7 = -822903429;
                    } else {
                        iM45029 = (i4 - C19806.m45029("۠ۗ")) * 51;
                        i6 = ((iM45029 ^ i5) * (-11065)) ^ (-1352488836);
                        i7 = -1174178489;
                    }
                    break;
                case -53921349:
                case 1413407830:
                    C1977.m6356();
                    C0962.m3746();
                    iM45029 = ThreadFactoryC3888.m11306("ۨ֨") ^ i5;
                    i6 = ((iM45029 ^ i4) * (-16999)) ^ 801304222;
                    i7 = 549510929;
                    break;
                case -50304734:
                case 1057104577:
                    if (C1419.f5860 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۨ֨") ^ i5;
                        i6 = ((iM45029 ^ i4) * (-16999)) ^ 801304222;
                        i7 = 549510929;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩶۬") ^ i5;
                        i6 = ((iM45029 ^ i4) * 22559) ^ (-1070846194);
                        i7 = -611481804;
                    }
                    break;
                case 79052182:
                case 1824198931:
                    if (RunnableC1606.f6488 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۜۚ") ^ i4;
                        i6 = ((iM45029 ^ i5) * (-1937)) ^ (-1075878729);
                        i7 = -822903429;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۨ֨") ^ i5;
                        i6 = ((iM45029 ^ i4) * (-16999)) ^ 801304222;
                        i7 = 549510929;
                    }
                    break;
                case 610010788:
                case 1174158242:
                    if (C1875.f7103 >= 0) {
                        iM45029 = (C19806.m45029("ۘۖ") ^ i5) * 109;
                        i6 = ((iM45029 ^ i4) * (-15309)) ^ 1700110447;
                        i7 = -1404015617;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۤܽ") ^ i5;
                        i6 = ((iM45029 ^ i4) * 12309) ^ 1205168906;
                        i7 = 1710258868;
                    }
                    break;
                case 660365591:
                case 2044462954:
                    if (C1875.m6086() != 0) {
                        iM45029 = (C19806.m45029("ۘۖ") ^ i5) * 109;
                        i6 = ((iM45029 ^ i4) * (-15309)) ^ 1700110447;
                        i7 = -1404015617;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩸ۧ") ^ i5;
                        i6 = ((iM45029 ^ i4) * 22783) ^ (-261139596);
                        i7 = -1535672540;
                    }
                    break;
                default:
                    str = c16819.f53838;
                    objM7592 = C2477.m7592(this.f30908, i2);
                    if (C19806.m45024()) {
                        iM45029 = ThreadFactoryC3888.m11306("ۛ֫") ^ i5;
                        i6 = ((iM45029 ^ i4) * 19797) ^ (-2129501960);
                        i7 = -983946822;
                    } else {
                        iM45029 = C19806.m45029("ۗ۬") ^ i4;
                        i6 = ((iM45029 ^ i5) * 861) ^ 207033685;
                        i7 = 80317595;
                    }
                    break;
            }
        }
    }

    @Override // l.AbstractC13946
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo7138(int i, int i2) {
        Object obj = null;
        PackageInfo packageInfo = null;
        long j = 0;
        Object objM5478 = null;
        C16819 c16819 = null;
        int i3 = 1391754479;
        int i4 = C3535.f13026;
        int i5 = C0278.f1572;
        int iM11306 = (ThreadFactoryC3888.m11306("᩷ۚ") + i5) * 35;
        int i6 = ((iM11306 ^ i4) * (-1797)) ^ 223406867;
        int i7 = 1099423277;
        while (true) {
            i3 = ((((i3 ^ i4) * (-9227)) >> 31) & i6) ^ (iM11306 ^ i7);
            switch (i3) {
                case -1824329108:
                case 1080080649:
                    C0671.m3008();
                    iM11306 = ThreadFactoryC3888.m11306("ۖۛ") ^ i4;
                    i6 = ((iM11306 ^ i5) * 27063) ^ (-1723208371);
                    i7 = 534540058;
                    break;
                case -1662698708:
                case -1497226665:
                    return true;
                case -1516882014:
                case 331745330:
                    if (C1977.m6356()) {
                        iM11306 = (C19806.m45029("ۤ᩻") + i4) * 63;
                        i6 = ((iM11306 ^ i5) * (-19267)) ^ (-213865874);
                        i7 = -1508799268;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩶ۧ") ^ i5;
                        i6 = ((iM11306 ^ i4) * 27901) ^ 666318303;
                        i7 = 469774095;
                    }
                    break;
                case -1443354861:
                case -1108207960:
                    RunnableC3388.m10064();
                    if (!C1377.f5749) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩷ᩴ") + i5) * 71;
                        i6 = ((iM11306 ^ i4) * (-11135)) ^ 334725414;
                        i7 = 1821141461;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۖۛ") ^ i4;
                        i6 = ((iM11306 ^ i5) * 27063) ^ (-1723208371);
                        i7 = 534540058;
                    }
                    break;
                case -1421282011:
                case 753806152:
                    if (C2249.f8050 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩺ۛ") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-6487)) ^ (-13428486);
                        i7 = -1265885227;
                    } else {
                        iM11306 = C19806.m45029("ܶܳ") ^ i4;
                        i6 = ((iM11306 ^ i5) * (-12125)) ^ (-829438913);
                        i7 = 417286013;
                    }
                    break;
                case -1393355941:
                case 1177636627:
                    if (C1668.f6641 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۖۛ") ^ i4;
                        i6 = ((iM11306 ^ i5) * 27063) ^ (-1723208371);
                        i7 = 534540058;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۙ᩵") ^ i5;
                        i6 = ((iM11306 ^ i4) * 31157) ^ 1356475897;
                        i7 = 832161427;
                    }
                    break;
                case -856225689:
                case -75553689:
                    c16819 = (C16819) objM5478;
                    if (C1066.f4915 <= 0) {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ܺ᩹")) * 73;
                        i6 = ((iM11306 ^ i5) * (-6025)) ^ (-966538832);
                        i7 = 803800221;
                    } else {
                        iM11306 = C19806.m45029("᩶ۙ") ^ i4;
                        i6 = ((iM11306 ^ i5) * (-4985)) ^ (-608516969);
                        i7 = -2071542939;
                    }
                    break;
                case -844611536:
                case 1098473438:
                    j = packageInfo.lastUpdateTime;
                    objM5478 = RunnableC1606.m5478(this.f30908, i2);
                    if (C0797.f3386) {
                        iM11306 = ThreadFactoryC3888.m11306("ۖۛ") ^ i4;
                        i6 = ((iM11306 ^ i5) * 27063) ^ (-1723208371);
                        i7 = 534540058;
                    } else {
                        iM11306 = C19806.m45029("᩺ܽ") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-16439)) ^ (-2032358253);
                        i7 = -435479805;
                    }
                    break;
                case -795716751:
                case 1533695899:
                    return false;
                case -778086207:
                case 1048079766:
                    C2124.m6673();
                    if (C1377.m4833() != 0) {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ܺ᩹")) * 73;
                        i6 = ((iM11306 ^ i5) * (-6025)) ^ (-966538832);
                        i7 = 803800221;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩷ᩴ") + i5) * 71;
                        i6 = ((iM11306 ^ i4) * (-11135)) ^ 334725414;
                        i7 = 1821141461;
                    }
                    break;
                case -598168564:
                case 2034283069:
                    if (C0671.m3008() < 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩺ۛ") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-6487)) ^ (-13428486);
                        i7 = -1265885227;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩷ᩴ") + i5) * 71;
                        i6 = ((iM11306 ^ i4) * (-11135)) ^ 334725414;
                        i7 = 1821141461;
                    }
                    break;
                case -386810319:
                case 143821626:
                    if (RunnableC1564.f6300) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩷ᩴ") + i5) * 71;
                        i6 = ((iM11306 ^ i4) * (-11135)) ^ 334725414;
                        i7 = 1821141461;
                    } else {
                        iM11306 = (i4 - C19806.m45029("᩸֡")) * 51;
                        i6 = ((iM11306 ^ i5) * 27131) ^ (-1026690409);
                        i7 = 180448304;
                    }
                    break;
                case -236199044:
                case 45687091:
                    packageInfo = ((C16819) obj).f53841;
                    int i8 = ViewOnClickListenerC4514.f16038;
                    if (C1668.f6641 >= 0) {
                        iM11306 = (C19806.m45029("ۤ᩻") + i4) * 63;
                        i6 = ((iM11306 ^ i5) * (-19267)) ^ (-213865874);
                        i7 = -1508799268;
                    } else {
                        iM11306 = (i5 - C19806.m45029("ܽܰ")) * 39;
                        i6 = ((iM11306 ^ i4) * (-17995)) ^ 218756417;
                        i7 = -1319731844;
                    }
                    break;
                case 24385369:
                case 416557731:
                    obj = this.f30909.get(i);
                    if (C1461.f5957 <= 0) {
                        iM11306 = (C19806.m45029("ۤ᩻") + i4) * 63;
                        i6 = ((iM11306 ^ i5) * (-19267)) ^ (-213865874);
                        i7 = -1508799268;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۘ۟") ^ i4) * (-49);
                        i6 = ((iM11306 ^ i5) * 2657) ^ (-381370144);
                        i7 = -1488263845;
                    }
                    break;
                case 878980060:
                case 1668652636:
                    if (C10634.f36300 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩷ᩴ") + i5) * 71;
                        i6 = ((iM11306 ^ i4) * (-11135)) ^ 334725414;
                        i7 = 1821141461;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֡֡") ^ i4;
                        i6 = ((iM11306 ^ i5) * (-15517)) ^ 1141235203;
                        i7 = -1223608818;
                    }
                    break;
                case 1052433302:
                case 1077709248:
                    C1937.m6279();
                    return false;
                case 1195351519:
                case 1684726159:
                    if (C0671.f2816 != 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۖۛ") ^ i4;
                        i6 = ((iM11306 ^ i5) * 27063) ^ (-1723208371);
                        i7 = 534540058;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۤܰ") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-29589)) ^ 1432299964;
                        i7 = 689173623;
                    }
                    break;
                default:
                    if (j == c16819.f53841.lastUpdateTime) {
                        iM11306 = (ThreadFactoryC3888.m11306("۫֡") ^ i5) * 77;
                        i6 = ((iM11306 ^ i4) * 8555) ^ 1384497421;
                        i7 = 2076972714;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۖ᩵") ^ i4;
                        i6 = ((iM11306 ^ i5) * (-2057)) ^ 1641572683;
                        i7 = -1888321231;
                    }
                    break;
            }
        }
    }
}
