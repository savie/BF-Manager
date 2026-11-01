package l;

import android.content.SharedPreferences;
import android.view.View;
import bin.mt.plugin.api.LocalString;
import bin.mt.plugin.api.PluginContext;
import bin.mt.plugin.api.preference.PluginPreference;
import com.alipay.sdk.m.y.q;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Iterator;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ᩴ᩹ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: O3YD */
/* JADX INFO: loaded from: classes5.dex */
public class ActivityC19041 extends AbstractActivityC12483 {

    /* JADX INFO: renamed from: ۘᩳܽ, reason: not valid java name and contains not printable characters */
    private static final short[] f61584 = {5401, -16186, -16159, -16132, -16133, -16146, -16159, -16148, -16150, -16209, -16158, -16146, -16154, -16159, -16209, -16129, -16131, -16150, -16151, -16150, -16131, -16150, -16159, -16148, -16150, -16209, -16151, -16146, -16154, -16157, -16150, -16149, -19021, -16773, -20397, 4348, -11096, -4209, -10105, 11586, 12005, -12290, -4084, -12175, -9023, -16694, -16682, -16689, -16675, -16685, -16684, -16653, -16674, -16662, -16682, -16689, -16675, -16685, -16684, -16742, -16684, -16683, -16690, -16742, -16676, -16683, -16689, -16684, -16674, -16768, -16742, -16694, -16682, -16689, -16675, -16685, -16684, -16662, -16696, -16673, -16676, -16673, -16696, -16673, -16684, -16679, -16673, -16648, -16689, -16685, -16682, -16674, -16742, -16694, -16696, -16673, -16676, -16673, -16696, -16673, -16684, -16679, -16673, -16742, -16676, -16677, -16685, -16682, -16673, -16674};

    /* JADX INFO: renamed from: ᩸ܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f61585 = 0;

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public SharedPreferences f61586;

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public C22569 f61587;

    /* JADX INFO: renamed from: ۘܰ, reason: not valid java name and contains not printable characters */
    public PluginPreference f61588;

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public C23359 f61589;

    /* JADX INFO: renamed from: ۜܰ, reason: not valid java name and contains not printable characters */
    public C18335 f61590;

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f61591;

    /* JADX INFO: renamed from: ܶܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f61592;

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public PluginContext f61593;

    /* JADX INFO: renamed from: ᩺ܰ, reason: not valid java name and contains not printable characters */
    public C21423 f61594;

    @Override // l.AbstractActivityC12483
    /* JADX INFO: renamed from: ۡ */
    public final String mo126() {
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static CharSequence m43773(ActivityC19041 activityC19041, CharSequence charSequence) {
        LocalString localString = null;
        PluginContext pluginContext = null;
        String str = null;
        int iM8641 = 0;
        String strM6367 = null;
        int i = 788564237;
        int i2 = C2788.f10625;
        int i3 = C2124.f7782;
        int iM45029 = (C19806.m45029("֫ᩴ") ^ i3) * q.h;
        int i4 = ((iM45029 ^ i2) * (-19079)) ^ (-1398371907);
        int i5 = 625881523;
        while (true) {
            i = ((((i ^ i2) * 7109) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2072819940:
                case 2072164700:
                    C10634.m26820();
                    if (!C19806.f63586) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩵ܺ")) * (-117);
                        i4 = ((iM45029 ^ i2) * (-3531)) ^ (-90613266);
                        i5 = 720101528;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۧۤ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 9127) ^ 2016793578;
                        i5 = 117539816;
                    }
                    break;
                case -2008598687:
                case -1061042331:
                    if (C1377.f5749) {
                        iM45029 = (C19806.m45029("ۗᩳ") + i2) * (-115);
                        i4 = ((iM45029 ^ i3) * (-2025)) ^ (-338299549);
                        i5 = -1398172592;
                    } else {
                        iM45029 = C19806.m45029("۠ۛ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 25175) ^ (-1739560919);
                        i5 = 2059897860;
                    }
                    break;
                case -1953048821:
                case 1629307624:
                    return charSequence;
                case -1876978435:
                case -952838417:
                    return C0074.m1001(localString, (String) charSequence);
                case -1872437535:
                case -628610091:
                    if (C10634.f36300 >= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩵ܺ")) * (-117);
                        i4 = ((iM45029 ^ i2) * (-3531)) ^ (-90613266);
                        i5 = 720101528;
                    } else {
                        iM45029 = (C19806.m45029("ۨ᩸") + i3) * (-61);
                        i4 = ((iM45029 ^ i2) * 14105) ^ (-895501898);
                        i5 = 503867111;
                    }
                    break;
                case -1852579464:
                case 1134173481:
                    if (charSequence == null) {
                        iM45029 = C19806.m45029("᩶֨") ^ i3;
                        i4 = ((iM45029 ^ i2) * 16123) ^ (-76561382);
                        i5 = -707188791;
                    } else {
                        iM45029 = (C19806.m45029("ۘ᩸") + i2) * 79;
                        i4 = ((iM45029 ^ i3) * (-2845)) ^ (-398510034);
                        i5 = -1506694385;
                    }
                    break;
                case -1675445020:
                case 49858336:
                    if (C3577.m10565()) {
                        iM45029 = C19806.m45029("ۛ᩵") ^ i3;
                        i4 = ((iM45029 ^ i2) * 21209) ^ 298656011;
                        i5 = -2334832;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩵ܺ")) * (-117);
                        i4 = ((iM45029 ^ i2) * (-3531)) ^ (-90613266);
                        i5 = 720101528;
                    }
                    break;
                case -1591722011:
                case -481643767:
                    C0962.m3746();
                    if (!C0962.f3784) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩵ܺ")) * (-117);
                        i4 = ((iM45029 ^ i2) * (-3531)) ^ (-90613266);
                        i5 = 720101528;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۢ᩸") ^ i3) * (-35);
                        i4 = ((iM45029 ^ i2) * 3769) ^ 1686383143;
                        i5 = -566083691;
                    }
                    break;
                case -1572759504:
                case -1417102529:
                    return null;
                case -1556762523:
                case 1663207752:
                    localString = activityC19041.f61589.f75676;
                    if (localString != null) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܽۙ") ^ i2) * (-95);
                        i4 = ((iM45029 ^ i3) * (-7607)) ^ (-872009071);
                        i5 = 948632704;
                    } else {
                        iM45029 = C19806.m45029("۟ۧ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 16325) ^ (-2051982423);
                        i5 = 1437672312;
                    }
                    break;
                case -1541264726:
                case 1712972626:
                    if (charSequence instanceof String) {
                        iM45029 = C19806.m45029("᩻ۜ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-2809)) ^ 206925782;
                        i5 = 316213240;
                    } else {
                        iM45029 = C19806.m45029("ۙ۫") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-7503)) ^ 1834860508;
                        i5 = -1259113716;
                    }
                    break;
                case -1539230234:
                case 2103073193:
                    str = (String) charSequence;
                    iM8641 = C2871.m8641(str);
                    if (RunnableC1606.f6488 >= 0) {
                        iM45029 = C19806.m45029("۠ۛ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 25175) ^ (-1739560919);
                        i5 = 2059897860;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ᩴܳ")) * (-3);
                        i4 = ((iM45029 ^ i3) * 17567) ^ 1378596792;
                        i5 = 2100831691;
                    }
                    break;
                case -1356219095:
                case 1902386410:
                    if (C2477.f9839 > 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۢ᩸") ^ i3) * (-35);
                        i4 = ((iM45029 ^ i2) * 3769) ^ 1686383143;
                        i5 = -566083691;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۙ᩷") ^ i3) * (-97);
                        i4 = ((iM45029 ^ i2) * (-17901)) ^ (-869820437);
                        i5 = 1297604706;
                    }
                    break;
                case -1248738237:
                case 1643431513:
                    strM6367 = C1977.m6367(pluginContext, str);
                    if (strM6367 != null) {
                        iM45029 = C19806.m45029("ᩳۜ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-15099)) ^ (-38666161);
                        i5 = -704914750;
                    } else {
                        iM45029 = C19806.m45029("ۙ۫") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-7503)) ^ 1834860508;
                        i5 = -1259113716;
                    }
                    break;
                case -1156598263:
                case -756042269:
                    AbstractC0464.m2313();
                    C1377.m4833();
                    iM45029 = (i3 - ThreadFactoryC3888.m11306("᩵ܺ")) * (-117);
                    i4 = ((iM45029 ^ i2) * (-3531)) ^ (-90613266);
                    i5 = 720101528;
                    break;
                case -1114566445:
                case 161197580:
                    if (C0216.m1576(1, str) == '}') {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ܳ᩵")) * 101;
                        i4 = ((iM45029 ^ i2) * 26167) ^ (-902733513);
                        i5 = 1309516596;
                    } else {
                        iM45029 = C19806.m45029("ۙ۫") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-7503)) ^ 1834860508;
                        i5 = -1259113716;
                    }
                    break;
                case -1013005802:
                case -109388022:
                    C0629.m2907();
                    if (C7105.f23796 < 0) {
                        iM45029 = C19806.m45029("۠ۛ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 25175) ^ (-1739560919);
                        i5 = 2059897860;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۢ᩸") ^ i3) * (-35);
                        i4 = ((iM45029 ^ i2) * 3769) ^ 1686383143;
                        i5 = -566083691;
                    }
                    break;
                case -782684219:
                case 196345270:
                    if (iM8641 >= 3) {
                        iM45029 = ThreadFactoryC3888.m11306("ۡ᩻") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-25493)) ^ (-1305939065);
                        i5 = 1732996357;
                    } else {
                        iM45029 = C19806.m45029("ۙ۫") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-7503)) ^ 1834860508;
                        i5 = -1259113716;
                    }
                    break;
                case -457136058:
                case -118026199:
                    if (C0050.f912 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۢۚ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 6183) ^ (-228100097);
                        i5 = 747956708;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ܰۙ")) * (-75);
                        i4 = ((iM45029 ^ i3) * (-23477)) ^ 926814245;
                        i5 = -995886318;
                    }
                    break;
                case -346236464:
                case 2106458810:
                    C1398.m4895();
                    C1668.m5583();
                    return null;
                case -270530445:
                case 895684578:
                    if (C3722.m10894() <= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩵ܺ")) * (-117);
                        i4 = ((iM45029 ^ i2) * (-3531)) ^ (-90613266);
                        i5 = 720101528;
                    } else {
                        iM45029 = (C19806.m45029("ۤܺ") + i3) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM45029 ^ i2) * (-23037)) ^ (-727126428);
                        i5 = 607768486;
                    }
                    break;
                case -129718802:
                case 1240003706:
                    if (C1461.f5957 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۢۚ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 6183) ^ (-228100097);
                        i5 = 747956708;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۬ۗ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-10165)) ^ (-298473533);
                        i5 = 974012366;
                    }
                    break;
                case 1444573:
                case 467474678:
                    return strM6367;
                case 50648304:
                case 730113432:
                    if (C1189.f5284 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۢۚ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 6183) ^ (-228100097);
                        i5 = 747956708;
                    } else {
                        iM45029 = C19806.m45029("ᩳ᩵") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-1513)) ^ 1293344493;
                        i5 = 1969229641;
                    }
                    break;
                case 282068148:
                case 1563510590:
                    if (C2871.m8652(str, 0) == '{') {
                        iM45029 = C19806.m45029("ۛۧ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 29153) ^ 193015118;
                        i5 = 1753162089;
                    } else {
                        iM45029 = C19806.m45029("ۙ۫") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-7503)) ^ 1834860508;
                        i5 = -1259113716;
                    }
                    break;
                case 573210267:
                case 1530348539:
                    pluginContext = activityC19041.f61593;
                    if (charSequence instanceof String) {
                        iM45029 = C19806.m45029("۬ᩴ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-24967)) ^ 439837666;
                        i5 = 180432554;
                    } else {
                        iM45029 = C19806.m45029("ۙ۫") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-7503)) ^ 1834860508;
                        i5 = -1259113716;
                    }
                    break;
                case 1639963638:
                case 2142581039:
                    if (C1398.m4895() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۢۚ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 6183) ^ (-228100097);
                        i5 = 747956708;
                    } else {
                        iM45029 = C19806.m45029("ۙۙ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 20751) ^ 519440032;
                        i5 = -564278208;
                    }
                    break;
                default:
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۢ۠") ^ i3) * (-5);
                        i4 = ((iM45029 ^ i2) * 23745) ^ (-1836924971);
                        i5 = 1937708834;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۧۤ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 9127) ^ 2016793578;
                        i5 = 117539816;
                    }
                    break;
            }
        }
    }

    public ActivityC19041() {
        m31013();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m43770() {
        int iM11306;
        int i;
        Iterator itM9863 = null;
        AbstractC2896 abstractC2896 = null;
        int i2 = -1498415983;
        int i3 = C3535.f13026;
        int i4 = C2871.f10837;
        int iM45029 = C19806.m45029("ܳܽ") ^ i4;
        int i5 = ((iM45029 ^ i3) * (-13147)) ^ (-568016);
        int i6 = -265534126;
        while (true) {
            int i7 = iM45029 ^ i6;
            ArrayList arrayList = null;
            while (true) {
                i2 = ((((i2 ^ i3) * 29365) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -1595785549:
                    case 299126012:
                        C3660.m10791();
                        C1398.m4895();
                        break;
                    case -1000201576:
                    case 169780682:
                        this.f61592 = arrayList;
                        itM9863 = ViewTreeObserverOnPreDrawListenerC3327.m9863(this.f61591);
                        iM11306 = C19806.m45029("ۜۡ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 32157) ^ 1972417000;
                        i = 1911857608;
                        i7 = iM11306 ^ i;
                        break;
                    case -817596628:
                    case -61351588:
                        abstractC2896 = (AbstractC2896) C0216.m1584(itM9863);
                        if (abstractC2896.f10925) {
                            iM11306 = (ThreadFactoryC3888.m11306("֨ۖ") ^ i3) * (-39);
                            i5 = ((iM11306 ^ i4) * (-343)) ^ (-1980693757);
                            i = 1087708660;
                        } else {
                            iM11306 = C19806.m45029("ۜۡ") ^ i3;
                            i5 = ((iM11306 ^ i4) * 32157) ^ 1972417000;
                            i = 1911857608;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    case -653303186:
                    case 1625704560:
                        if (C1189.f5284 <= 0) {
                            iM45029 = C19806.m45029("ۨ۬") ^ i3;
                            i5 = ((iM45029 ^ i4) * (-21009)) ^ (-1987216184);
                            i6 = 1567107069;
                        } else {
                            iM45029 = ThreadFactoryC3888.m11306("ᩴۚ") ^ i3;
                            i5 = ((iM45029 ^ i4) * 5713) ^ 530254423;
                            i6 = -1503946128;
                        }
                        break;
                    case -539684615:
                    case 1121759668:
                        if (!C7105.m18985()) {
                            if (!C0962.f3784) {
                                if (!C3286.f12186) {
                                    if (C1937.f7317 < 0) {
                                        if (!C1668.m5583()) {
                                            iM45029 = ThreadFactoryC3888.m11306("ᩴۚ") ^ i3;
                                            i5 = ((iM45029 ^ i4) * 5713) ^ 530254423;
                                            i6 = -1503946128;
                                            break;
                                        } else if (ViewTreeObserverOnPreDrawListenerC3327.f12317 > 0) {
                                            if (C7105.f23796 >= 0) {
                                                iM45029 = ThreadFactoryC3888.m11306("ۛܰ") ^ i4;
                                                i5 = ((iM45029 ^ i3) * (-23825)) ^ (-1444505547);
                                                i6 = 303232906;
                                                break;
                                            } else if (C0629.f2722 > 0) {
                                                if (C1148.f5161 > 0) {
                                                    arrayList = new ArrayList();
                                                    if (C3722.f13525 > 0) {
                                                        iM11306 = ThreadFactoryC3888.m11306("֫ۙ") ^ i4;
                                                        i5 = ((iM11306 ^ i3) * 31191) ^ 1051324937;
                                                        i = 1989314202;
                                                        i7 = iM11306 ^ i;
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            iM45029 = ThreadFactoryC3888.m11306("ܳ᩸") ^ i4;
                            i5 = ((iM45029 ^ i3) * 26343) ^ 639147940;
                            i6 = 1811908935;
                            break;
                        }
                        iM45029 = C19806.m45029("ۨ۬") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-21009)) ^ (-1987216184);
                        i6 = 1567107069;
                        break;
                    case -258540604:
                    case 773080658:
                        if (C0962.m3748(itM9863)) {
                            iM11306 = ThreadFactoryC3888.m11306("ܺۚ") ^ i4;
                            i5 = ((iM11306 ^ i3) * (-21849)) ^ 831491957;
                            i = 1319578928;
                        } else {
                            iM11306 = C19806.m45029("ۤ᩵") ^ i3;
                            i5 = ((iM11306 ^ i4) * (-22991)) ^ 814127384;
                            i = 1377612458;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    case -105341815:
                    case 1088950747:
                        C3660.m10791();
                        iM45029 = ThreadFactoryC3888.m11306("ۛܰ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-23825)) ^ (-1444505547);
                        i6 = 303232906;
                        break;
                    case 42518246:
                    case 1490865879:
                        if (C1189.f5284 <= 0) {
                            iM11306 = ThreadFactoryC3888.m11306("ܿ֫") ^ i4;
                            i5 = ((iM11306 ^ i3) * 1153) ^ 1495782866;
                            i = -1174723739;
                            i7 = iM11306 ^ i;
                        } else {
                            iM45029 = ThreadFactoryC3888.m11306("ᩴۚ") ^ i3;
                            i5 = ((iM45029 ^ i4) * 5713) ^ 530254423;
                            i6 = -1503946128;
                        }
                        break;
                    case 234651300:
                    case 1333396830:
                        break;
                    case 606072701:
                    case 1525888307:
                        C3660.m10788(this.f61592, abstractC2896);
                        iM11306 = C19806.m45029("ۜۡ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 32157) ^ 1972417000;
                        i = 1911857608;
                        i7 = iM11306 ^ i;
                        break;
                    default:
                        C0962.m3746();
                        if (C1977.f7413 > 0) {
                            iM45029 = ThreadFactoryC3888.m11306("ᩴۚ") ^ i3;
                            i5 = ((iM45029 ^ i4) * 5713) ^ 530254423;
                            i6 = -1503946128;
                        } else {
                            iM45029 = ThreadFactoryC3888.m11306("ۛܰ") ^ i4;
                            i5 = ((iM45029 ^ i3) * (-23825)) ^ (-1444505547);
                            i6 = 303232906;
                        }
                        break;
                }
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:76:0x02a7 A[PHI: r6 r25 r27
      0x02a7: PHI (r6v5 java.lang.String) = (r6v4 java.lang.String), (r6v2 java.lang.String) binds: [B:74:0x028e, B:69:0x024a] A[DONT_GENERATE, DONT_INLINE]
      0x02a7: PHI (r25v30 java.lang.Throwable) = (r25v28 java.lang.Throwable), (r25v31 java.lang.Throwable) binds: [B:74:0x028e, B:69:0x024a] A[DONT_GENERATE, DONT_INLINE]
      0x02a7: PHI (r27v9 int) = (r27v7 int), (r27v10 int) binds: [B:74:0x028e, B:69:0x024a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c0, code lost:
    
        if (l.C2124.m6673() > 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d5, code lost:
    
        if (l.C0050.f912 <= 0) goto L28;
     */
    @Override // l.AbstractActivityC12483, l.ActivityC4866, l.ActivityC19126, l.ActivityC1086, l.ActivityC16858, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r30) {
        /*
            Method dump skipped, instruction units count: 1616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ActivityC19041.onCreate(android.os.Bundle):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:28:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:31:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:70:0x029d A[PHI: r8 r9 r10 r11 r12 r18
      0x029d: PHI (r8v7 short) = (r8v2 short), (r8v3 short), (r8v2 short), (r8v2 short) binds: [B:69:0x029b, B:65:0x027e, B:61:0x025c, B:14:0x0077] A[DONT_GENERATE, DONT_INLINE]
      0x029d: PHI (r9v7 short) = (r9v2 short), (r9v3 short), (r9v2 short), (r9v2 short) binds: [B:69:0x029b, B:65:0x027e, B:61:0x025c, B:14:0x0077] A[DONT_GENERATE, DONT_INLINE]
      0x029d: PHI (r10v7 int) = (r10v2 int), (r10v2 int), (r10v3 int), (r10v2 int) binds: [B:69:0x029b, B:65:0x027e, B:61:0x025c, B:14:0x0077] A[DONT_GENERATE, DONT_INLINE]
      0x029d: PHI (r11v7 int) = (r11v2 int), (r11v2 int), (r11v3 int), (r11v2 int) binds: [B:69:0x029b, B:65:0x027e, B:61:0x025c, B:14:0x0077] A[DONT_GENERATE, DONT_INLINE]
      0x029d: PHI (r12v7 int) = (r12v2 int), (r12v2 int), (r12v3 int), (r12v2 int) binds: [B:69:0x029b, B:65:0x027e, B:61:0x025c, B:14:0x0077] A[DONT_GENERATE, DONT_INLINE]
      0x029d: PHI (r18v8 short[]) = (r18v4 short[]), (r18v3 short[]), (r18v3 short[]), (r18v3 short[]) binds: [B:69:0x029b, B:65:0x027e, B:61:0x025c, B:14:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m43775(C11986 c11986, PluginPreference pluginPreference) {
        int iM45029;
        int i;
        int i2;
        int iM11306;
        int i3;
        ActivityC19041 activityC19041 = this;
        int i4 = RunnableC3388.f12514;
        int i5 = C10634.f36300;
        int iM11307 = ThreadFactoryC3888.m11306("ۙۙ") ^ i4;
        int i6 = ((iM11307 ^ i5) * (-28347)) ^ 436754267;
        View viewM1436 = null;
        short[] sArr = null;
        int i7 = iM11307 ^ 1685156526;
        int iM11308 = 0;
        short s = 0;
        short s2 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = -919138684;
        C7020 c7020 = null;
        C9186 c9186M40016 = null;
        while (true) {
            i12 = i7 ^ (i6 & (((i12 ^ i5) * (-20061)) >> 31));
            switch (i12) {
                case -2085868882:
                case 1993642650:
                    if (C0526.f2219) {
                        iM45029 = (i5 - ThreadFactoryC3888.m11306("᩺ܿ")) * (-29);
                        i = ((iM45029 ^ i4) * (-14953)) ^ (-725334895);
                        i2 = 1715321181;
                    } else {
                        iM45029 = (C19806.m45029("᩺᩻") ^ i4) * 59;
                        i = ((iM45029 ^ i5) * (-18705)) ^ (-520142549);
                        i2 = 1025686313;
                    }
                    i7 = iM45029 ^ i2;
                    i6 = i;
                    break;
                case -1862220655:
                case -312359665:
                    C7105.m18983(c9186M40016, activityC19041, c7020);
                    activityC19041.f61586 = activityC19041.f61593.getPreferences();
                    if (!C1461.m5080()) {
                        iM45029 = (C19806.m45029("۫ܶ") + i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM45029 ^ i5) * (-16163)) ^ 1307866602;
                        i2 = 2015839638;
                        i7 = iM45029 ^ i2;
                        i6 = i;
                    } else {
                        int iM11309 = (ThreadFactoryC3888.m11306("᩻᩻") + i4) * (-109);
                        i7 = iM11309 ^ (-1920705372);
                        i6 = ((iM11309 ^ i5) * (-2635)) ^ (-45784267);
                        activityC19041 = this;
                    }
                    break;
                case -1795316395:
                case 988843311:
                    C1461.m5080();
                    int iM113010 = (ThreadFactoryC3888.m11306("᩻᩻") + i4) * (-109);
                    i7 = iM113010 ^ (-1920705372);
                    i6 = ((iM113010 ^ i5) * (-2635)) ^ (-45784267);
                    activityC19041 = this;
                    break;
                case -1761838917:
                case 1119666799:
                    i11 = 18733;
                    iM11306 = (C19806.m45029("᩹ۨ") ^ i4) * 91;
                    i6 = ((iM11306 ^ i5) * (-6387)) ^ (-930059224);
                    i3 = 1187747308;
                    i7 = iM11306 ^ i3;
                    activityC19041 = this;
                    break;
                case -1587535212:
                case 2079051464:
                    throw new NullPointerException(C2332.m7082(f61584, 1, 31, i11));
                case -1529485934:
                case 570406427:
                    int i13 = s + s2;
                    i8 = i13 * i13;
                    i9 = s * s;
                    i10 = 57684025;
                    if (C1398.f5802 <= 0) {
                        iM11306 = C19806.m45029("ۛܽ") ^ i4;
                        i6 = ((iM11306 ^ i5) * (-16329)) ^ (-680334260);
                        i3 = -375065067;
                    } else {
                        iM11306 = (C19806.m45029("ۗ֫") + i5) * 85;
                        i6 = ((iM11306 ^ i4) * (-31123)) ^ 1781282992;
                        i3 = -671582254;
                    }
                    i7 = iM11306 ^ i3;
                    activityC19041 = this;
                    break;
                case -1491543613:
                case 1927738584:
                    iM11308 = ThreadFactoryC3888.m11306(ViewTreeObserverOnPreDrawListenerC3327.m9869(f61584, 32, 3, i11));
                    if (!C2332.f8260) {
                        int iM113011 = (ThreadFactoryC3888.m11306("᩻᩻") + i4) * (-109);
                        i7 = iM113011 ^ (-1920705372);
                        i6 = ((iM113011 ^ i5) * (-2635)) ^ (-45784267);
                        activityC19041 = this;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܳ᩵") ^ i5;
                        i = ((iM45029 ^ i4) * (-28321)) ^ 1877464592;
                        i2 = -330498649;
                        i7 = iM45029 ^ i2;
                        i6 = i;
                    }
                    break;
                case -1467581258:
                case -131877895:
                    i11 = 49295;
                    iM11306 = (C19806.m45029("᩹ۨ") ^ i4) * 91;
                    i6 = ((iM11306 ^ i5) * (-6387)) ^ (-930059224);
                    i3 = 1187747308;
                    i7 = iM11306 ^ i3;
                    activityC19041 = this;
                    break;
                case -1321014475:
                case 1056234870:
                    activityC19041.f61588 = pluginPreference;
                    c9186M40016 = C17132.m40016();
                    c7020 = new C7020(1, activityC19041, c11986);
                    if (C3286.f12186) {
                        int iM113012 = (ThreadFactoryC3888.m11306("᩻᩻") + i4) * (-109);
                        i7 = iM113012 ^ (-1920705372);
                        i6 = ((iM113012 ^ i5) * (-2635)) ^ (-45784267);
                    } else {
                        iM11306 = C19806.m45029("ۘܶ") ^ i5;
                        i6 = ((iM11306 ^ i4) * 30791) ^ 277426648;
                        i3 = 772072356;
                        i7 = iM11306 ^ i3;
                    }
                    activityC19041 = this;
                    break;
                case -1157075047:
                case 1882260429:
                    int i14 = i9 + i10;
                    if ((i14 + i14) - i8 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩹᩻") ^ i4;
                        i6 = ((iM11306 ^ i5) * 18979) ^ (-839086867);
                        i3 = 914735659;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۬᩷") ^ i5;
                        i6 = ((iM11306 ^ i4) * 19443) ^ 428992121;
                        i3 = -38220017;
                    }
                    i7 = iM11306 ^ i3;
                    activityC19041 = this;
                    break;
                case -818541005:
                case 23997817:
                    s = sArr[0];
                    s2 = 7595;
                    if (RunnableC1564.f6300) {
                        iM11306 = C19806.m45029("ۛܽ") ^ i4;
                        i6 = ((iM11306 ^ i5) * (-16329)) ^ (-680334260);
                        i3 = -375065067;
                    } else {
                        iM11306 = C19806.m45029("֨ܰ") ^ i5;
                        i6 = ((iM11306 ^ i4) * 26369) ^ (-1924338475);
                        i3 = -1627652872;
                    }
                    i7 = iM11306 ^ i3;
                    activityC19041 = this;
                    break;
                case -622522193:
                case 1635650550:
                    activityC19041.f61590 = new C18335(activityC19041);
                    m43783();
                    return;
                case -93235151:
                case 761474222:
                    sArr = f61584;
                    if (RunnableC3388.f12514 >= 0) {
                        iM11306 = C19806.m45029("ۛܽ") ^ i4;
                        i6 = ((iM11306 ^ i5) * (-16329)) ^ (-680334260);
                        i3 = -375065067;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۖܳ") + i4) * 71;
                        i6 = ((iM11306 ^ i5) * 31677) ^ (-862126919);
                        i3 = -753795971;
                    }
                    i7 = iM11306 ^ i3;
                    activityC19041 = this;
                    break;
                case -93098528:
                case 13556885:
                    C21423 c21423 = (C21423) viewM1436;
                    activityC19041.f61594 = c21423;
                    c21423.m47992();
                    C21423 c21424 = activityC19041.f61594;
                    if (C0671.f2816 != 0) {
                        iM45029 = (i5 - ThreadFactoryC3888.m11306("᩺ܿ")) * (-29);
                        i = ((iM45029 ^ i4) * (-14953)) ^ (-725334895);
                        i2 = 1715321181;
                    } else {
                        c21424.addItemDecoration(new C1401(activityC19041));
                        if (C2249.f8050 >= 0) {
                            iM45029 = (C19806.m45029("᩺᩻") ^ i4) * 59;
                            i = ((iM45029 ^ i5) * (-18705)) ^ (-520142549);
                            i2 = 1025686313;
                        } else {
                            C22569 c22569 = new C22569(activityC19041);
                            activityC19041.f61587 = c22569;
                            C0817.m3403(activityC19041.f61594, c22569);
                            if (C3577.m10565()) {
                                iM45029 = (C19806.m45029("֡᩺") + i5) * (-93);
                                i = ((iM45029 ^ i4) * (-17075)) ^ 1747341550;
                                i2 = -73842342;
                            } else {
                                iM45029 = (i5 - ThreadFactoryC3888.m11306("᩺ܿ")) * (-29);
                                i = ((iM45029 ^ i4) * (-14953)) ^ (-725334895);
                                i2 = 1715321181;
                            }
                        }
                    }
                    i7 = iM45029 ^ i2;
                    i6 = i;
                    break;
                case 328117895:
                case 1476378531:
                    C2124.m6673();
                    if (!C2704.f10408) {
                        iM45029 = (i5 - ThreadFactoryC3888.m11306("᩺ܿ")) * (-29);
                        i = ((iM45029 ^ i4) * (-14953)) ^ (-725334895);
                        i2 = 1715321181;
                        i7 = iM45029 ^ i2;
                        i6 = i;
                    } else {
                        iM11306 = C19806.m45029("ۛܽ") ^ i4;
                        i6 = ((iM11306 ^ i5) * (-16329)) ^ (-680334260);
                        i3 = -375065067;
                        i7 = iM11306 ^ i3;
                        activityC19041 = this;
                    }
                    break;
                case 482105858:
                case 900995433:
                    C0526.m2437();
                    return;
                case 741731563:
                case 1838369532:
                    if (pluginPreference != null) {
                        iM11306 = (C19806.m45029("᩹۬") ^ i4) * (-99);
                        i6 = ((iM11306 ^ i5) * 22503) ^ (-1323975934);
                        i3 = 1439316937;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩹ۡ") ^ i5) * 65;
                        i6 = ((iM11306 ^ i4) * (-5639)) ^ 1719446624;
                        i3 = -82702741;
                    }
                    i7 = iM11306 ^ i3;
                    activityC19041 = this;
                    break;
                case 1112690334:
                case 2007293032:
                    C1419.m4973();
                    if (C1668.f6641 >= 0) {
                        iM45029 = (i5 - ThreadFactoryC3888.m11306("᩺ܿ")) * (-29);
                        i = ((iM45029 ^ i4) * (-14953)) ^ (-725334895);
                        i2 = 1715321181;
                        i7 = iM45029 ^ i2;
                        i6 = i;
                    } else {
                        int iM113013 = (ThreadFactoryC3888.m11306("᩻᩻") + i4) * (-109);
                        i7 = iM113013 ^ (-1920705372);
                        i6 = ((iM113013 ^ i5) * (-2635)) ^ (-45784267);
                        activityC19041 = this;
                    }
                    break;
                default:
                    viewM1436 = RunnableC0195.m1436(activityC19041, 2127421986 ^ iM11308);
                    if (RunnableC1895.f7152) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۨۧ") ^ i4) * (-77);
                        i = ((iM45029 ^ i5) * (-29759)) ^ (-1303869026);
                        i2 = -2088694240;
                    } else {
                        iM45029 = C19806.m45029("ۗ᩹") ^ i5;
                        i = ((iM45029 ^ i4) * 24293) ^ (-1583327270);
                        i2 = 1017657415;
                    }
                    i7 = iM45029 ^ i2;
                    i6 = i;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static void m43772(ActivityC19041 activityC19041) {
        activityC19041.m43783();
        C3535.m10422(activityC19041.f61587);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x007d  */
    /* JADX WARN: Code duplicated, block: B:57:0x01d1 A[PHI: r6
      0x01d1: PHI (r6v4 java.util.ArrayList) = (r6v3 java.util.ArrayList), (r6v2 java.util.ArrayList), (r6v2 java.util.ArrayList), (r6v2 java.util.ArrayList) binds: [B:56:0x01cf, B:24:0x0092, B:21:0x0079, B:108:0x01d1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x0244 A[PHI: r3 r4 r5
      0x0244: PHI (r3v4 bin.mt.plugin.api.preference.PluginPreference) = 
      (r3v3 bin.mt.plugin.api.preference.PluginPreference)
      (r3v2 bin.mt.plugin.api.preference.PluginPreference)
      (r3v2 bin.mt.plugin.api.preference.PluginPreference)
      (r3v2 bin.mt.plugin.api.preference.PluginPreference)
     binds: [B:68:0x0242, B:64:0x0220, B:60:0x0204, B:29:0x00aa] A[DONT_GENERATE, DONT_INLINE]
      0x0244: PHI (r4v4 bin.mt.plugin.api.PluginContext) = 
      (r4v2 bin.mt.plugin.api.PluginContext)
      (r4v3 bin.mt.plugin.api.PluginContext)
      (r4v2 bin.mt.plugin.api.PluginContext)
      (r4v2 bin.mt.plugin.api.PluginContext)
     binds: [B:68:0x0242, B:64:0x0220, B:60:0x0204, B:29:0x00aa] A[DONT_GENERATE, DONT_INLINE]
      0x0244: PHI (r5v4 l.᩻֨ۘ) = (r5v2 l.᩻֨ۘ), (r5v2 l.᩻֨ۘ), (r5v3 l.᩻֨ۘ), (r5v2 l.᩻֨ۘ) binds: [B:68:0x0242, B:64:0x0220, B:60:0x0204, B:29:0x00aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m43783() {
        int iM45029;
        int i;
        int iM450210;
        int i2;
        int i3 = -1575476212;
        int i4 = C3577.f13150;
        int i5 = AbstractC0464.f2088;
        int iM11306 = ThreadFactoryC3888.m11306("᩺ۡ") ^ i5;
        int i6 = ((iM11306 ^ i4) * (-6691)) ^ (-1441270731);
        int i7 = iM11306 ^ (-1941387257);
        C23359 c23359 = null;
        PluginPreference pluginPreference = null;
        Throwable th = null;
        PluginPreference.OnPreferenceScreenCreatedListener onPreferenceScreenCreatedListener = null;
        CharSequence charSequence = null;
        CharSequence charSequence2 = null;
        ArrayList arrayListM51474 = null;
        C23359 c233510 = null;
        PluginContext pluginContext = null;
        while (true) {
            i3 = ((((i3 ^ i4) * (-23509)) >> 31) & i6) ^ i7;
            switch (i3) {
                case -2114263667:
                case 287886909:
                    C3286.m9791(this.f41645, charSequence);
                    iM45029 = (C19806.m45029("᩻ܰ") + i5) * (-53);
                    i6 = ((iM45029 ^ i4) * (-29361)) ^ (-1324928622);
                    i = -769411589;
                    i7 = iM45029 ^ i;
                    break;
                case -2027466115:
                case 578842056:
                    C1875.m6102(this, th, null);
                    iM45029 = (C19806.m45029("ۛۧ") + i5) * 61;
                    i6 = ((iM45029 ^ i4) * (-31977)) ^ 1888380960;
                    i = -1522860120;
                    i7 = iM45029 ^ i;
                    break;
                case -2017178832:
                case 202535405:
                    pluginPreference.onBuild(pluginContext, c23359);
                    c233510 = this.f61589;
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۗ۬") + i5) * 39;
                        i6 = ((iM45029 ^ i4) * (-31985)) ^ (-699329085);
                        i = 154756369;
                    } else {
                        iM45029 = C19806.m45029("᩹ᩳ") ^ i5;
                        i6 = ((iM45029 ^ i4) * 20979) ^ (-1367852187);
                        i = 707992226;
                    }
                    i7 = iM45029 ^ i;
                    break;
                case -1938113645:
                case 812288134:
                    C2124.m6673();
                    break;
                case -1736992450:
                case -1493096472:
                    this.f61589 = c23359;
                    pluginPreference = this.f61588;
                    if (C1875.m6086() != 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۗ۬") + i5) * 39;
                        i6 = ((iM45029 ^ i4) * (-31985)) ^ (-699329085);
                        i = 154756369;
                    } else {
                        iM45029 = (i4 - C19806.m45029("ۧ֫")) * 19;
                        i6 = ((iM45029 ^ i5) * (-23631)) ^ (-625235936);
                        i = 769248955;
                    }
                    i7 = iM45029 ^ i;
                    break;
                case -1581564360:
                case -1367398212:
                    C0817.m3399();
                    iM45029 = (C19806.m45029("۬᩶") + i4) * 77;
                    i6 = ((iM45029 ^ i5) * (-26793)) ^ 923534183;
                    i = -1603274113;
                    i7 = iM45029 ^ i;
                    break;
                case -1445804541:
                case -1434250577:
                    break;
                case -1419707499:
                case -735492985:
                    if (C3660.f13403 < 0) {
                        if (RunnableC1606.f6488 < 0) {
                            PluginContext pluginContext2 = this.f61593;
                            if (C1148.f5161 > 0) {
                                c23359 = new C23359(pluginContext2);
                                if (C0671.m3008() >= 0) {
                                    iM45029 = (i4 - C19806.m45029("ܽᩳ")) * 31;
                                    i6 = ((iM45029 ^ i5) * (-15973)) ^ 1283481378;
                                    i = -864501137;
                                } else {
                                    iM45029 = (ThreadFactoryC3888.m11306("ۜۢ") + i5) * 85;
                                    i6 = ((iM45029 ^ i4) * 23769) ^ (-1047518460);
                                    i = -32598887;
                                }
                                i7 = iM45029 ^ i;
                                break;
                            }
                        }
                        iM450210 = (C19806.m45029("ۛᩳ") + i4) * 97;
                        i6 = ((iM450210 ^ i5) * 30749) ^ (-676654113);
                        i2 = -1963272216;
                        i7 = iM450210 ^ i2;
                        c23359 = null;
                    } else {
                        iM450210 = (i4 - ThreadFactoryC3888.m11306("ۜ᩺")) * 7;
                        i6 = ((iM450210 ^ i5) * 24939) ^ (-1948181836);
                        i2 = -66161676;
                        i7 = iM450210 ^ i2;
                        c23359 = null;
                    }
                    break;
                case -1394926192:
                case 1918034591:
                    arrayListM51474 = c233510.m51474();
                    if (AbstractC0464.m2313() != 0) {
                        iM45029 = (C19806.m45029("۬᩶") + i4) * 77;
                        i6 = ((iM45029 ^ i5) * (-26793)) ^ 923534183;
                        i = -1603274113;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۤ۠") ^ i4;
                        i6 = ((iM45029 ^ i5) * (-1027)) ^ (-1683213675);
                        i = -291416674;
                    }
                    i7 = iM45029 ^ i;
                    break;
                case -1372244796:
                case 377004326:
                    RunnableC0195.m1431();
                    if (!RunnableC1895.f7152) {
                        iM450210 = (C19806.m45029("ۛᩳ") + i4) * 97;
                        i6 = ((iM450210 ^ i5) * 30749) ^ (-676654113);
                        i2 = -1963272216;
                        i7 = iM450210 ^ i2;
                        c23359 = null;
                    } else {
                        iM45029 = (i4 - C19806.m45029("ܽᩳ")) * 31;
                        i6 = ((iM45029 ^ i5) * (-15973)) ^ 1283481378;
                        i = -864501137;
                        i7 = iM45029 ^ i;
                    }
                    break;
                case -1293650946:
                case -741024815:
                    break;
                case -1188543012:
                case 1358057542:
                    pluginContext = this.f61593;
                    if (C0962.f3784) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۗ۬") + i5) * 39;
                        i6 = ((iM45029 ^ i4) * (-31985)) ^ (-699329085);
                        i = 154756369;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۜ۠") ^ i4) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i6 = ((iM45029 ^ i5) * 691) ^ (-277130457);
                        i = -1730019575;
                    }
                    i7 = iM45029 ^ i;
                    break;
                case -962464832:
                case 584743555:
                    RunnableC0195.m1431();
                    if (AbstractC0464.f2088 > 0) {
                        iM45029 = (C19806.m45029("۬᩶") + i4) * 77;
                        i6 = ((iM45029 ^ i5) * (-26793)) ^ 923534183;
                        i = -1603274113;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩵ۗ") ^ i5;
                        i6 = ((iM45029 ^ i4) * 13689) ^ (-978840254);
                        i = -103108067;
                    }
                    i7 = iM45029 ^ i;
                    break;
                case -946326137:
                case -626483921:
                    if (C1668.m5583()) {
                        iM45029 = ThreadFactoryC3888.m11306("ۡۡ") ^ i5;
                        i6 = ((iM45029 ^ i4) * (-31199)) ^ 649059894;
                        i = -162046013;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩵ۗ") ^ i5;
                        i6 = ((iM45029 ^ i4) * 13689) ^ (-978840254);
                        i = -103108067;
                    }
                    i7 = iM45029 ^ i;
                    break;
                case -200203245:
                case -88560665:
                    setTitle(charSequence2);
                    iM45029 = (C19806.m45029("ܺܽ") + i5) * 65;
                    i6 = ((iM45029 ^ i4) * (-27675)) ^ 1609023599;
                    i = 1733760224;
                    i7 = iM45029 ^ i;
                    break;
                case 170783951:
                case 2115118933:
                    RunnableC0195.m1431();
                    if (!C0526.f2219) {
                        iM45029 = ThreadFactoryC3888.m11306("ۡۡ") ^ i5;
                        i6 = ((iM45029 ^ i4) * (-31199)) ^ 649059894;
                        i = -162046013;
                        i7 = iM45029 ^ i;
                    } else {
                        iM450210 = (i4 - ThreadFactoryC3888.m11306("ۜ᩺")) * 7;
                        i6 = ((iM450210 ^ i5) * 24939) ^ (-1948181836);
                        i2 = -66161676;
                        i7 = iM450210 ^ i2;
                        c23359 = null;
                    }
                    break;
                case 344890828:
                case 1953287089:
                    this.f61591 = arrayListM51474;
                    if (!C1668.m5583()) {
                        iM450210 = (i4 - ThreadFactoryC3888.m11306("ۜ᩺")) * 7;
                        i6 = ((iM450210 ^ i5) * 24939) ^ (-1948181836);
                        i2 = -66161676;
                        i7 = iM450210 ^ i2;
                        c23359 = null;
                    } else {
                        iM45029 = (i5 - C19806.m45029("ܳܳ")) * (-41);
                        i6 = ((iM45029 ^ i4) * 27565) ^ (-1373394661);
                        i = -292490096;
                        i7 = iM45029 ^ i;
                    }
                    break;
                case 370945034:
                case 619769368:
                    charSequence = this.f61589.f75678;
                    if (charSequence != null) {
                        iM45029 = (C19806.m45029("۫ۚ") + i4) * (-109);
                        i6 = ((iM45029 ^ i5) * 24811) ^ (-656246533);
                        i = 118769211;
                    } else {
                        iM45029 = (C19806.m45029("᩻ܰ") + i5) * (-53);
                        i6 = ((iM45029 ^ i4) * (-29361)) ^ (-1324928622);
                        i = -769411589;
                    }
                    i7 = iM45029 ^ i;
                    break;
                case 547290626:
                case 1925474892:
                    if (!C1461.m5080()) {
                        iM45029 = (C19806.m45029("۬᩶") + i4) * 77;
                        i6 = ((iM45029 ^ i5) * (-26793)) ^ 923534183;
                        i = -1603274113;
                        i7 = iM45029 ^ i;
                    } else {
                        iM450210 = (C19806.m45029("ۛᩳ") + i4) * 97;
                        i6 = ((iM450210 ^ i5) * 30749) ^ (-676654113);
                        i2 = -1963272216;
                        i7 = iM450210 ^ i2;
                        c23359 = null;
                    }
                    break;
                case 918906033:
                case 2044530848:
                    m43770();
                    charSequence2 = this.f61589.f75672;
                    if (charSequence2 != null) {
                        iM45029 = (ThreadFactoryC3888.m11306("۫᩵") ^ i4) * 13;
                        i6 = ((iM45029 ^ i5) * (-14971)) ^ (-932991042);
                        i = 650819714;
                    } else {
                        iM45029 = (C19806.m45029("ܺܽ") + i5) * 65;
                        i6 = ((iM45029 ^ i4) * (-27675)) ^ 1609023599;
                        i = 1733760224;
                    }
                    i7 = iM45029 ^ i;
                    break;
                case 1132655252:
                case 1623658863:
                    onPreferenceScreenCreatedListener = this.f61589.f75673;
                    if (onPreferenceScreenCreatedListener != null) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۡۖ") ^ i4) * 63;
                        i6 = ((iM45029 ^ i5) * 13499) ^ (-78193469);
                        i = 156843932;
                    } else {
                        iM45029 = (C19806.m45029("ۛۧ") + i5) * 61;
                        i6 = ((iM45029 ^ i4) * (-31977)) ^ 1888380960;
                        i = -1522860120;
                    }
                    i7 = iM45029 ^ i;
                    break;
                case 1395649199:
                case 1772208228:
                    this.f61593.log(th);
                    if (C0962.m3746() >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۗ۬") + i5) * 39;
                        i6 = ((iM45029 ^ i4) * (-31985)) ^ (-699329085);
                        i = 154756369;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۧ᩻") ^ i5;
                        i6 = ((iM45029 ^ i4) * (-26899)) ^ 1716690613;
                        i = -549120722;
                    }
                    i7 = iM45029 ^ i;
                    break;
                default:
                    try {
                        onPreferenceScreenCreatedListener.onPreferenceScreenCreated(new C2355(this.f61593, this), this.f61590);
                        iM45029 = C19806.m45029("֨ܺ") ^ i5;
                        i6 = ((iM45029 ^ i4) * EnumC12167.f40728) ^ (-658415963);
                        i = -1950950812;
                    } catch (Throwable th2) {
                        th = th2;
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("᩸ۢ")) * (-91);
                        i6 = ((iM45029 ^ i5) * 8261) ^ 1557939321;
                        i = -1459592830;
                    }
                    i7 = iM45029 ^ i;
                    break;
            }
            return;
        }
    }
}
