package l;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.view.View;
import bin.mt.plus.Main;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ܰۡ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: G6K1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14482 implements InterfaceC12314 {

    /* JADX INFO: renamed from: ֫۬ᩴ, reason: not valid java name and contains not printable characters */
    private static final short[] f45583 = {4760, -5720, -5697, -5727, 4193, 28321, 28342, 28328, 28325, 28329, 28331, 28392, 28327, 28328, 28322, 28340, 28329, 28335, 28322, 28392, 28336, 28323, 28328, 28322, 28335, 28328, 28321, 28327, 28328, 28322, 28340, 28329, 28335, 28322, 28392, 28335, 28328, 28338, 28323, 28328, 28338, 28392, 28325, 28327, 28338, 28323, 28321, 28329, 28340, 28351, 28392, 28298, 28295, 28307, 28296, 28293, 28302, 28291, 28308, 28321, 28342, 28328, 28327, 28328, 28322, 28340, 28329, 28335, 28322, 28392, 28335, 28328, 28338, 28323, 28328, 28338, 28392, 28325, 28327, 28338, 28323, 28321, 28329, 28340, 28351, 28392, 28303, 28296, 28288, 28297, 3163, 16987, 16972, 16978, 10318, -12657, 16107, -15097, -15918, 14879, -11901, -11397, -10951, 6346, 11038, 8968, 5406, -19673, -19672, -19678, -19660, -19671, -19665, -19678, -19608, -19665, -19672, -19662, -19677, -19672, -19662, -19608, -19673, -19675, -19662, -19665, -19671, -19672, -19608, -19701, -19705, -19697, -19704, -19675, -19671, -19669, -19608, -19673, -19672, -19678, -19660, -19671, -19665, -19678, -19608, -19664, -19677, -19672, -19678, -19665, -19672, -19679, 4125, -3810, -3838, -3838, -3834, -3835, -3764, -3751, -3751, -3813, -3838, -3752, -3819, -3819};

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final Object f45584 = new Object();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f45585;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f45586;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC8327 f45587;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final RunnableC25306 f45588;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Main f45589;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final View f45590;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ViewTreeObserverOnWindowFocusChangeListenerC20450 f45591;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f45592;

    @Override // l.InterfaceC12314
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo29776(InterfaceC11217 interfaceC11217) {
    }

    @Override // l.InterfaceC12314
    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ void mo29778(InterfaceC11217 interfaceC11217) {
    }

    @Override // l.InterfaceC12314
    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ void mo29781(InterfaceC11217 interfaceC11217) {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34967() {
        int i = 0;
        int i2 = 0;
        int i3 = 1724063389;
        int i4 = C4238.f15451;
        int i5 = C3099.f10023;
        int iM2761 = (C0619.m2761("ۛۖ") ^ i4) * (-109);
        int i6 = ((iM2761 ^ i5) * 985) ^ (-131327189);
        int i7 = 2071524357;
        while (true) {
            i3 = ((((i3 ^ i5) * (-23693)) >> 31) & i6) ^ (iM2761 ^ i7);
            switch (i3) {
                case -2135947713:
                case -1308715726:
                    C11235.m28309();
                    C1343.m4943();
                    break;
                case -2029134419:
                case 2091161881:
                    this.f45586 = i + i2;
                    m34965();
                    break;
                case -1910537939:
                case -1640653224:
                    if (C1519.f5300 < 0) {
                        iM2761 = (i4 - C0619.m2761("ܿܺ")) * 27;
                        i6 = ((iM2761 ^ i5) * (-13287)) ^ 1018542612;
                        i7 = 518955859;
                    } else {
                        iM2761 = C0773.m3169("ᩴۘ") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-22713)) ^ (-984629312);
                        i7 = -374385328;
                    }
                    break;
                case -1582469080:
                case 1221203315:
                    i = this.f45586;
                    if (C0269.m1775() <= 0) {
                        iM2761 = C0773.m3169("᩺᩶") ^ i4;
                        i6 = ((iM2761 ^ i5) * 21913) ^ (-2092546970);
                        i7 = 1517672395;
                    } else {
                        iM2761 = (i4 - C0773.m3169("ܽ᩻")) * (-33);
                        i6 = ((iM2761 ^ i5) * 11425) ^ 347120484;
                        i7 = -1645266665;
                    }
                    break;
                case -1539149779:
                case -286704415:
                    if (C1321.f4751 >= 0) {
                        iM2761 = C0773.m3169("ᩴۘ") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-22713)) ^ (-984629312);
                        i7 = -374385328;
                    } else {
                        iM2761 = (i4 - C0619.m2761("ۧۢ")) * 37;
                        i6 = ((iM2761 ^ i5) * 617) ^ 1834679791;
                        i7 = 558415016;
                    }
                    break;
                case -1337460587:
                case -277983934:
                    if (AbstractC0641.f2496 >= 0) {
                        iM2761 = C0773.m3169("ᩴۘ") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-22713)) ^ (-984629312);
                        i7 = -374385328;
                    } else {
                        iM2761 = C0773.m3169("ۡܳ") ^ i5;
                        i6 = ((iM2761 ^ i4) * 28683) ^ (-1957204010);
                        i7 = 1380352982;
                    }
                    break;
                case -1017464814:
                case 1228083790:
                    if (AbstractC0116.f1064 <= 0) {
                        iM2761 = C0619.m2761("ܺۢ") ^ i5;
                        i6 = ((iM2761 ^ i4) * 6417) ^ 761084866;
                        i7 = -966294986;
                    } else {
                        iM2761 = C0619.m2761("ۨܶ") ^ i4;
                        i6 = ((iM2761 ^ i5) * 3263) ^ (-833687279);
                        i7 = -1070126191;
                    }
                    break;
                case -947525532:
                case 326970016:
                    if (C3448.f11240 >= 0) {
                        iM2761 = (i4 - C0619.m2761("ܿܺ")) * 27;
                        i6 = ((iM2761 ^ i5) * (-13287)) ^ 1018542612;
                        i7 = 518955859;
                    } else {
                        iM2761 = (i5 - C0619.m2761("ۚۡ")) * 101;
                        i6 = ((iM2761 ^ i4) * (-1541)) ^ (-1478204022);
                        i7 = 915369786;
                    }
                    break;
                case -627066591:
                case 1540643945:
                    C2354.m7983();
                    if (RunnableC0334.f1808 > 0) {
                        iM2761 = C0773.m3169("ᩴۘ") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-22713)) ^ (-984629312);
                        i7 = -374385328;
                    } else {
                        iM2761 = (i4 - C0773.m3169("ۘ֡")) * (-113);
                        i6 = ((iM2761 ^ i5) * 12473) ^ 1358720539;
                        i7 = 173592119;
                    }
                    break;
                case -510497343:
                case 1226004462:
                    if (RunnableC0334.f1808 <= 0) {
                        iM2761 = C0773.m3169("ᩴۘ") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-22713)) ^ (-984629312);
                        i7 = -374385328;
                    } else {
                        iM2761 = (C0619.m2761("ۤܺ") ^ i5) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i6 = ((iM2761 ^ i4) * (-2935)) ^ 1565885725;
                        i7 = 2106500034;
                    }
                    break;
                case -322853410:
                case 1017614179:
                    C1826.m6301();
                    if (!C0862.m3503()) {
                        iM2761 = C0619.m2761("ܺۢ") ^ i5;
                        i6 = ((iM2761 ^ i4) * 6417) ^ 761084866;
                        i7 = -966294986;
                    } else {
                        iM2761 = C0773.m3169("ᩴۘ") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-22713)) ^ (-984629312);
                        i7 = -374385328;
                    }
                    break;
                case 21702795:
                case 169125154:
                    if (RunnableC0334.f1808 <= 0) {
                        iM2761 = C0773.m3169("᩺᩶") ^ i4;
                        i6 = ((iM2761 ^ i5) * 21913) ^ (-2092546970);
                        i7 = 1517672395;
                    } else {
                        iM2761 = (C0619.m2761("᩷֨") ^ i4) * 59;
                        i6 = ((iM2761 ^ i5) * (-19377)) ^ (-2116693086);
                        i7 = 2127475856;
                    }
                    break;
                case 1070187401:
                case 1336453215:
                    i2 = -1;
                    if (C2878.m9491() <= 0) {
                        iM2761 = C0773.m3169("᩺᩶") ^ i4;
                        i6 = ((iM2761 ^ i5) * 21913) ^ (-2092546970);
                        i7 = 1517672395;
                    } else {
                        iM2761 = (i5 - C0773.m3169("᩶ᩳ")) * (-59);
                        i6 = ((iM2761 ^ i4) * (-14221)) ^ (-456864008);
                        i7 = 581874944;
                    }
                    break;
                case 1124049720:
                case 1988152310:
                    if (C2834.f9334 <= 0) {
                        iM2761 = (i4 - C0619.m2761("ܿܺ")) * 27;
                        i6 = ((iM2761 ^ i5) * (-13287)) ^ 1018542612;
                        i7 = 518955859;
                    } else {
                        iM2761 = (C0619.m2761("ۖ᩹") ^ i4) * (-87);
                        i6 = ((iM2761 ^ i5) * 5873) ^ (-2015415734);
                        i7 = -665914797;
                    }
                    break;
                case 1253103656:
                case 1706237304:
                    if (C4238.f15451 >= 0) {
                        iM2761 = C0773.m3169("ᩴۘ") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-22713)) ^ (-984629312);
                        i7 = -374385328;
                    } else {
                        iM2761 = C0619.m2761("ܽۛ") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-28083)) ^ (-1307263143);
                        i7 = 1261385496;
                    }
                    break;
                default:
                    C1343.m4943();
                    C2023.m6964();
                    iM2761 = C0773.m3169("ᩴۘ") ^ i5;
                    i6 = ((iM2761 ^ i4) * (-22713)) ^ (-984629312);
                    i7 = -374385328;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m34963(C14482 c14482, boolean z) {
        int i = 120959724;
        int i2 = C2834.f9334;
        int i3 = C3734.f12817;
        int iM2761 = C0619.m2761("۬ۛ") ^ i3;
        int i4 = ((iM2761 ^ i2) * 6013) ^ 1699963664;
        int i5 = -1608709910;
        while (true) {
            i = ((((i ^ i2) * (-28507)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -1985525043:
                case 1928359429:
                    if (C3734.f12817 >= 0) {
                        iM2761 = (C0619.m2761("᩶ᩳ") ^ i2) * (-125);
                        i4 = ((iM2761 ^ i3) * 29765) ^ 35869231;
                        i5 = 570539968;
                    } else {
                        iM2761 = (C0773.m3169("ܶ۠") ^ i3) * (-99);
                        i4 = ((iM2761 ^ i2) * 8113) ^ 483307891;
                        i5 = -968138183;
                    }
                    break;
                case -1707975038:
                case 1478326851:
                    if (C1080.f3865 >= 0) {
                        iM2761 = (C0619.m2761("֫ۧ") ^ i2) * 21;
                        i4 = ((iM2761 ^ i3) * 26687) ^ 328301438;
                        i5 = -804667334;
                    } else {
                        iM2761 = C0619.m2761("᩷ۙ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-32459)) ^ 1380228422;
                        i5 = -1246464179;
                    }
                    break;
                case -1668590498:
                case 188932010:
                    if (C1321.f4751 >= 0) {
                        iM2761 = (i3 - C0619.m2761("ۤۧ")) * (-97);
                        i4 = ((iM2761 ^ i2) * 21351) ^ 350962536;
                        i5 = -121483222;
                    } else {
                        iM2761 = C0619.m2761("᩵ۗ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-24815)) ^ 1915378867;
                        i5 = -220952774;
                    }
                    break;
                case -1659543768:
                case 1593756132:
                    c14482.m34965();
                    iM2761 = (C0773.m3169("ۛܰ") + i2) * (-125);
                    i4 = ((iM2761 ^ i3) * 22455) ^ (-1077851012);
                    i5 = 535732300;
                    break;
                case -1522097213:
                case 1358202118:
                    if (!C3077.f9998) {
                        iM2761 = (C0619.m2761("᩶ᩳ") ^ i2) * (-125);
                        i4 = ((iM2761 ^ i3) * 29765) ^ 35869231;
                        i5 = 570539968;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ۤۧ")) * (-97);
                        i4 = ((iM2761 ^ i2) * 21351) ^ 350962536;
                        i5 = -121483222;
                    }
                    break;
                case -1410656771:
                case 951139434:
                    if (C2288.f7433 > 0) {
                        iM2761 = (C0619.m2761("֫ۧ") ^ i2) * 21;
                        i4 = ((iM2761 ^ i3) * 26687) ^ 328301438;
                        i5 = -804667334;
                    } else {
                        iM2761 = (C0619.m2761("ۡۜ") ^ i3) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM2761 ^ i2) * (-18517)) ^ 1962512201;
                        i5 = -1951953718;
                    }
                    break;
                case -1155303826:
                case 81381519:
                    if (C3734.m12152() >= 0) {
                        iM2761 = (i3 - C0619.m2761("ۤۧ")) * (-97);
                        i4 = ((iM2761 ^ i2) * 21351) ^ 350962536;
                        i5 = -121483222;
                    } else {
                        iM2761 = (i2 - C0773.m3169("ۢۗ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM2761 ^ i3) * 25123) ^ 777889663;
                        i5 = -587449648;
                    }
                    break;
                case -972012164:
                case -596785129:
                    C3690.m11987();
                    break;
                case -944911075:
                case 137991236:
                    if (C1564.f5401 <= 0) {
                        iM2761 = (i3 - C0619.m2761("ۤۧ")) * (-97);
                        i4 = ((iM2761 ^ i2) * 21351) ^ 350962536;
                        i5 = -121483222;
                    } else {
                        iM2761 = (C0619.m2761("ᩴܺ") + i2) * 63;
                        i4 = ((iM2761 ^ i3) * (-30525)) ^ 198883416;
                        i5 = 952902148;
                    }
                    break;
                case -414401258:
                case 1001820442:
                    if (C3033.m9845() <= 0) {
                        iM2761 = (i3 - C0619.m2761("ۤۧ")) * (-97);
                        i4 = ((iM2761 ^ i2) * 21351) ^ 350962536;
                        i5 = -121483222;
                    } else {
                        iM2761 = C0619.m2761("ۢܿ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-16809)) ^ (-658541899);
                        i5 = 1388175161;
                    }
                    break;
                case -324401630:
                case 1109565634:
                    if (C1783.f6087 <= 0) {
                        iM2761 = C0619.m2761("ۧ۠") ^ i3;
                        i4 = ((iM2761 ^ i2) * 5741) ^ 1070574695;
                        i5 = 1056638877;
                    } else {
                        iM2761 = (C0773.m3169("ܳ۟") ^ i2) * 13;
                        i4 = ((iM2761 ^ i3) * 26421) ^ (-1114656419);
                        i5 = 1291775981;
                    }
                    break;
                case 288251429:
                case 1467503171:
                    break;
                case 473623575:
                case 547848886:
                    if (C1146.f4234 >= 0) {
                        iM2761 = (C0619.m2761("֫ۧ") ^ i2) * 21;
                        i4 = ((iM2761 ^ i3) * 26687) ^ 328301438;
                        i5 = -804667334;
                    } else {
                        iM2761 = C0773.m3169("ۧ᩹") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-16735)) ^ (-1829035237);
                        i5 = 2042247401;
                    }
                    break;
                case 1046614341:
                case 1246211521:
                    if (z) {
                        iM2761 = (i3 - C0773.m3169("֡ۤ")) * (-81);
                        i4 = ((iM2761 ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult) ^ (-1298817434);
                        i5 = 1223861474;
                    } else {
                        iM2761 = (C0773.m3169("ۛܰ") + i2) * (-125);
                        i4 = ((iM2761 ^ i3) * 22455) ^ (-1077851012);
                        i5 = 535732300;
                    }
                    break;
                case 1396675806:
                case 1784841223:
                    C1519.m5403();
                    iM2761 = (C0619.m2761("ۡۜ") ^ i3) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                    i4 = ((iM2761 ^ i2) * (-18517)) ^ 1962512201;
                    i5 = -1951953718;
                    break;
                case 1484296745:
                case 1741124225:
                    if (C13473.f42873 != 0) {
                        iM2761 = C0619.m2761("ۧ۠") ^ i3;
                        i4 = ((iM2761 ^ i2) * 5741) ^ 1070574695;
                        i5 = 1056638877;
                    } else {
                        iM2761 = (C0773.m3169("ܰܿ") ^ i2) * (-105);
                        i4 = ((iM2761 ^ i3) * (-12331)) ^ (-1128368388);
                        i5 = 1096419475;
                    }
                    break;
                case 1921092862:
                case 2084006304:
                    C13473.m33144();
                    if (!C0619.m2763()) {
                        iM2761 = (C0619.m2761("ۡۜ") ^ i3) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM2761 ^ i2) * (-18517)) ^ 1962512201;
                        i5 = -1951953718;
                    } else {
                        iM2761 = (C0619.m2761("᩶ᩳ") ^ i2) * (-125);
                        i4 = ((iM2761 ^ i3) * 29765) ^ 35869231;
                        i5 = 570539968;
                    }
                    break;
                default:
                    if (C1080.f3865 >= 0) {
                        iM2761 = (i3 - C0619.m2761("ۤۧ")) * (-97);
                        i4 = ((iM2761 ^ i2) * 21351) ^ 350962536;
                        i5 = -121483222;
                    } else {
                        iM2761 = (i2 - C0619.m2761("ᩴۢ")) * (-123);
                        i4 = ((iM2761 ^ i3) * 29737) ^ 1550849027;
                        i5 = -1680696465;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.InterfaceC12314
    /* JADX INFO: renamed from: ۤ */
    public final void mo29777(InterfaceC11217 interfaceC11217) {
        View view = null;
        int i = -1419352176;
        int i2 = C23916.f77426;
        int i3 = C3779.f12953;
        int iM2761 = (C0619.m2761("֨۟") ^ i3) * 123;
        int i4 = ((iM2761 ^ i2) * (-29395)) ^ (-53739620);
        int i5 = 1319573911;
        while (true) {
            i = ((((i ^ i2) * 14363) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -1913406283:
                case -1109781005:
                    view = this.f45590;
                    if (C1146.f4234 >= 0) {
                        iM2761 = C0619.m2761("᩻ۚ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 541) ^ 1165586443;
                        i5 = 1319115439;
                    } else {
                        iM2761 = C0773.m3169("᩺ܶ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 4181) ^ (-677161437);
                        i5 = -235959723;
                    }
                    break;
                case -1879148691:
                case -1452528118:
                    if (C1826.f6190 > 0) {
                        iM2761 = C0773.m3169("ܺۛ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-12019)) ^ (-868291654);
                        i5 = 1971176924;
                    } else {
                        iM2761 = C0773.m3169("ۤ᩶") ^ i2;
                        i4 = ((iM2761 ^ i3) * 31757) ^ 321856199;
                        i5 = -2112583400;
                    }
                    break;
                case -1837352012:
                case -1775155217:
                    if (RunnableC3055.f9898 >= 0) {
                        iM2761 = C0773.m3169("ᩴۚ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-18117)) ^ 31321925;
                        i5 = -1503324995;
                    } else {
                        iM2761 = C0773.m3169("ۜۛ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-1953)) ^ (-1975898040);
                        i5 = 618373336;
                    }
                    break;
                case -1644323600:
                case -434482537:
                    if (C2419.m8174() >= 0) {
                        iM2761 = C0773.m3169("ۤ᩶") ^ i2;
                        i4 = ((iM2761 ^ i3) * 31757) ^ 321856199;
                        i5 = -2112583400;
                    } else {
                        iM2761 = (C0619.m2761("۟ۙ") + i3) * (-29);
                        i4 = ((iM2761 ^ i2) * 19885) ^ 1924499573;
                        i5 = -606550396;
                    }
                    break;
                case -1587414191:
                case -1191761252:
                    AbstractC0641.m2813();
                    C3448.m11248();
                    break;
                case -1442446008:
                case 556784025:
                    if (AbstractC3624.m11755() != 0) {
                        iM2761 = C0619.m2761("᩻ۚ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 541) ^ 1165586443;
                        i5 = 1319115439;
                    } else {
                        iM2761 = (C0619.m2761("᩵ܶ") + i2) * (-51);
                        i4 = ((iM2761 ^ i3) * 13511) ^ 392911597;
                        i5 = -907921282;
                    }
                    break;
                case -1294086932:
                case -1082756135:
                    if (C2354.f7599 >= 0) {
                        iM2761 = C0773.m3169("ۤ᩶") ^ i2;
                        i4 = ((iM2761 ^ i3) * 31757) ^ 321856199;
                        i5 = -2112583400;
                    } else {
                        iM2761 = (C0619.m2761("֫᩹") + i2) * 41;
                        i4 = ((iM2761 ^ i3) * 31905) ^ (-1876302289);
                        i5 = 739117481;
                    }
                    break;
                case -1085568164:
                case 1335783595:
                    C3492.m11488();
                    if (C3448.f11240 < 0) {
                        iM2761 = (C0619.m2761("۫᩷") + i3) * 33;
                        i4 = ((iM2761 ^ i2) * (-23441)) ^ 1433596445;
                        i5 = 262543494;
                    } else {
                        iM2761 = C0773.m3169("ۤ᩶") ^ i2;
                        i4 = ((iM2761 ^ i3) * 31757) ^ 321856199;
                        i5 = -2112583400;
                    }
                    break;
                case -663426913:
                case -165044944:
                    view.removeCallbacks(this.f45588);
                    break;
                case -618988776:
                case 222503569:
                    if (C2287.f7432 >= 0) {
                        iM2761 = C0773.m3169("ܺۛ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-12019)) ^ (-868291654);
                        i5 = 1971176924;
                    } else {
                        iM2761 = C0619.m2761("۠ᩴ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 4319) ^ 1008088221;
                        i5 = -1863993014;
                    }
                    break;
                case -534638013:
                case 457820342:
                    if (AbstractC0641.f2496 >= 0) {
                        iM2761 = C0773.m3169("ۤ᩶") ^ i2;
                        i4 = ((iM2761 ^ i3) * 31757) ^ 321856199;
                        i5 = -2112583400;
                    } else {
                        iM2761 = (i2 - C0773.m3169("ܺ֨")) * (-67);
                        i4 = ((iM2761 ^ i3) * (-3971)) ^ (-2062720799);
                        i5 = 1890021087;
                    }
                    break;
                case -97258793:
                case 492991113:
                    if (C1080.f3865 >= 0) {
                        iM2761 = C0773.m3169("ᩴۚ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-18117)) ^ 31321925;
                        i5 = -1503324995;
                    } else {
                        iM2761 = C0619.m2761("ۚ᩶") ^ i3;
                        i4 = ((iM2761 ^ i2) * 2247) ^ 702689184;
                        i5 = 1549012225;
                    }
                    break;
                case 365349902:
                case 1950380678:
                    if (C2354.f7599 < 0) {
                        iM2761 = C0773.m3169("ᩴۚ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-18117)) ^ 31321925;
                        i5 = -1503324995;
                    } else {
                        iM2761 = (C0619.m2761("۫᩷") + i3) * 33;
                        i4 = ((iM2761 ^ i2) * (-23441)) ^ 1433596445;
                        i5 = 262543494;
                    }
                    break;
                case 1116130765:
                case 1862894448:
                    if (C17202.f56030) {
                        iM2761 = C0773.m3169("ܿ۟") ^ i3;
                        i4 = ((iM2761 ^ i2) * 4731) ^ (-194597314);
                        i5 = -743748511;
                    } else {
                        iM2761 = C0619.m2761("᩻ۚ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 541) ^ 1165586443;
                        i5 = 1319115439;
                    }
                    break;
                case 1482484015:
                case 1976351467:
                    if (C23916.m53419() != 0) {
                        iM2761 = (C0619.m2761("۫᩷") + i3) * 33;
                        i4 = ((iM2761 ^ i2) * (-23441)) ^ 1433596445;
                        i5 = 262543494;
                    } else {
                        iM2761 = (C0773.m3169("ܶ᩸") ^ i2) * 69;
                        i4 = ((iM2761 ^ i3) * 6895) ^ (-1721073157);
                        i5 = 1065264807;
                    }
                    break;
                default:
                    C2354.m7983();
                    iM2761 = C0773.m3169("ۤ᩶") ^ i2;
                    i4 = ((iM2761 ^ i3) * 31757) ^ 321856199;
                    i5 = -2112583400;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0084, code lost:
    
        if (l.C3492.m11488() != false) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12, types: [android.view.ViewTreeObserver] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.view.ViewTreeObserver$OnWindowFocusChangeListener] */
    /* JADX WARN: Type inference failed for: r4v3, types: [l.᩵ۡ֫] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C14482(bin.mt.plus.Main r22) {
        /*
            Method dump skipped, instruction units count: 880
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14482.<init>(bin.mt.plus.Main):void");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Runnable m34968() {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = -2138979073;
        int i5 = C3448.f11240;
        int i6 = C3690.f12684;
        int iM3169 = (C0773.m3169("֫ۚ") + i5) * (-105);
        int i7 = ((iM3169 ^ i6) * (-235)) ^ (-1027705949);
        int i8 = -1203025934;
        while (true) {
            i4 = ((((i4 ^ i6) * (-21603)) >> 31) & i7) ^ (iM3169 ^ i8);
            switch (i4) {
                case -1985584253:
                case 434921287:
                    if (C3448.m11248() != 0) {
                        iM3169 = (i5 - C0619.m2761("ۧۚ")) * 19;
                        i7 = ((iM3169 ^ i6) * (-9855)) ^ 465538002;
                        i8 = 1433647761;
                    } else {
                        iM3169 = C0619.m2761("ܳۚ") ^ i6;
                        i7 = ((iM3169 ^ i5) * 9443) ^ 413584027;
                        i8 = -31153618;
                    }
                    break;
                case -1809090425:
                case -494345002:
                    if (C4238.f15451 >= 0) {
                        iM3169 = C0619.m2761("᩸ۡ") ^ i6;
                        i7 = ((iM3169 ^ i5) * 15725) ^ (-1574380485);
                        i8 = -898051142;
                    } else {
                        iM3169 = (i6 - C0773.m3169("ܽ֡")) * 65;
                        i7 = ((iM3169 ^ i5) * 15509) ^ 328294061;
                        i8 = 357399318;
                    }
                    break;
                case -1523577238:
                case 1551707887:
                    i3 = i + i2;
                    if (C0619.f2439) {
                        iM3169 = C0619.m2761("ܶ۠") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-20871)) ^ (-629492482);
                        i8 = -885140950;
                    } else {
                        iM3169 = C0619.m2761("۬۫") ^ i6;
                        i7 = ((iM3169 ^ i5) * 3469) ^ (-441942982);
                        i8 = -956474240;
                    }
                    break;
                case -1517562304:
                case -133250913:
                    this.f45586 = i3;
                    return new RunnableC4042(this);
                case -1059650231:
                case 1251741681:
                    C17202.m40372();
                    RunnableC1848.m6360();
                    return null;
                case -980816257:
                case -578826619:
                    if (C3448.m11248() != 0) {
                        iM3169 = C0619.m2761("᩺ۚ") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-3615)) ^ 1189960034;
                        i8 = -240723903;
                    } else {
                        iM3169 = (C0619.m2761("ᩴۜ") + i5) * (-81);
                        i7 = ((iM3169 ^ i6) * (-2189)) ^ 1521934503;
                        i8 = 1879017434;
                    }
                    break;
                case -738982526:
                case 1636494584:
                    i2 = 1;
                    if (C0862.m3503()) {
                        iM3169 = C0773.m3169("ܶܽ") ^ i5;
                        i7 = ((iM3169 ^ i6) * 11585) ^ (-984799036);
                        i8 = 1299797003;
                    } else {
                        iM3169 = C0619.m2761("᩸ۡ") ^ i6;
                        i7 = ((iM3169 ^ i5) * 15725) ^ (-1574380485);
                        i8 = -898051142;
                    }
                    break;
                case -405717493:
                case -192370253:
                    C1321.m4852();
                    if (C3033.f9831 < 0) {
                        iM3169 = C0619.m2761("᩺ۚ") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-3615)) ^ 1189960034;
                        i8 = -240723903;
                    } else {
                        iM3169 = (i5 - C0619.m2761("ۧۚ")) * 19;
                        i7 = ((iM3169 ^ i6) * (-9855)) ^ 465538002;
                        i8 = 1433647761;
                    }
                    break;
                case -289126070:
                case 1572919397:
                    if (C2023.f6737) {
                        iM3169 = C0619.m2761("᩺ۚ") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-3615)) ^ 1189960034;
                        i8 = -240723903;
                    } else {
                        iM3169 = C0619.m2761("᩷᩹") ^ i5;
                        i7 = ((iM3169 ^ i6) * 22045) ^ 1771028081;
                        i8 = -887130104;
                    }
                    break;
                case -1222871:
                case 592808524:
                    if (C0619.m2763()) {
                        iM3169 = C0619.m2761("ܳۚ") ^ i6;
                        i7 = ((iM3169 ^ i5) * 9443) ^ 413584027;
                        i8 = -31153618;
                    } else {
                        iM3169 = C0619.m2761("᩶ۗ") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-13491)) ^ 1191720274;
                        i8 = -1703743341;
                    }
                    break;
                case 20838577:
                case 1417428685:
                    i = this.f45586;
                    if (C3998.m12920()) {
                        iM3169 = (i6 - C0619.m2761("ۡܿ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i7 = ((iM3169 ^ i5) * (-25461)) ^ (-8901979);
                        i8 = -1878377594;
                    } else {
                        iM3169 = C0619.m2761("ܶ۠") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-20871)) ^ (-629492482);
                        i8 = -885140950;
                    }
                    break;
                case 23028569:
                case 274344904:
                    if (C17202.f56030) {
                        iM3169 = C0773.m3169("֫ۖ") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-26555)) ^ 1195155344;
                        i8 = -1428648084;
                    } else {
                        iM3169 = C0619.m2761("ܳۚ") ^ i6;
                        i7 = ((iM3169 ^ i5) * 9443) ^ 413584027;
                        i8 = -31153618;
                    }
                    break;
                case 404209748:
                case 594839782:
                    C1321.m4852();
                    if (C0950.f3488 >= 0) {
                        iM3169 = C0619.m2761("᩸ۡ") ^ i6;
                        i7 = ((iM3169 ^ i5) * 15725) ^ (-1574380485);
                        i8 = -898051142;
                    } else {
                        iM3169 = C0619.m2761("᩺ۚ") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-3615)) ^ 1189960034;
                        i8 = -240723903;
                    }
                    break;
                case 713245245:
                case 1916303124:
                    if (C11235.f35427 >= 0) {
                        iM3169 = C0619.m2761("ܳۚ") ^ i6;
                        i7 = ((iM3169 ^ i5) * 9443) ^ 413584027;
                        i8 = -31153618;
                    } else {
                        iM3169 = (C0619.m2761("ܳ۟") ^ i6) * (-19);
                        i7 = ((iM3169 ^ i5) * (-22849)) ^ 302848092;
                        i8 = 845184516;
                    }
                    break;
                case 1634045603:
                case 1746609720:
                    C2354.m7983();
                    iM3169 = C0619.m2761("ܳۚ") ^ i6;
                    i7 = ((iM3169 ^ i5) * 9443) ^ 413584027;
                    i8 = -31153618;
                    break;
                default:
                    if (C3779.m12264()) {
                        iM3169 = C0773.m3169("ۘۗ") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-28623)) ^ (-1332825837);
                        i8 = 892774620;
                    } else {
                        iM3169 = C0619.m2761("᩸ۡ") ^ i6;
                        i7 = ((iM3169 ^ i5) * 15725) ^ (-1574380485);
                        i8 = -898051142;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:74:0x02d2 A[PHI: r6 r9 r10 r11 r17 r19 r20
      0x02d2: PHI (r6v4 char) = (r6v3 char), (r6v2 char), (r6v2 char) binds: [B:73:0x02d0, B:65:0x0282, B:15:0x008a] A[DONT_GENERATE, DONT_INLINE]
      0x02d2: PHI (r9v4 int) = (r9v2 int), (r9v3 int), (r9v2 int) binds: [B:73:0x02d0, B:65:0x0282, B:15:0x008a] A[DONT_GENERATE, DONT_INLINE]
      0x02d2: PHI (r10v4 int) = (r10v2 int), (r10v3 int), (r10v2 int) binds: [B:73:0x02d0, B:65:0x0282, B:15:0x008a] A[DONT_GENERATE, DONT_INLINE]
      0x02d2: PHI (r11v4 int) = (r11v2 int), (r11v3 int), (r11v2 int) binds: [B:73:0x02d0, B:65:0x0282, B:15:0x008a] A[DONT_GENERATE, DONT_INLINE]
      0x02d2: PHI (r17v16 android.content.Intent) = (r17v5 android.content.Intent), (r17v7 android.content.Intent), (r17v17 android.content.Intent) binds: [B:73:0x02d0, B:65:0x0282, B:15:0x008a] A[DONT_GENERATE, DONT_INLINE]
      0x02d2: PHI (r19v15 android.content.Intent) = (r19v3 android.content.Intent), (r19v5 android.content.Intent), (r19v16 android.content.Intent) binds: [B:73:0x02d0, B:65:0x0282, B:15:0x008a] A[DONT_GENERATE, DONT_INLINE]
      0x02d2: PHI (r20v15 java.lang.String) = (r20v3 java.lang.String), (r20v5 java.lang.String), (r20v16 java.lang.String) binds: [B:73:0x02d0, B:65:0x0282, B:15:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x030b A[PHI: r7 r8 r17 r18 r19 r20
      0x030b: PHI (r7v4 short) = (r7v2 short), (r7v3 short), (r7v2 short) binds: [B:77:0x0309, B:69:0x02ab, B:16:0x0096] A[DONT_GENERATE, DONT_INLINE]
      0x030b: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int) binds: [B:77:0x0309, B:69:0x02ab, B:16:0x0096] A[DONT_GENERATE, DONT_INLINE]
      0x030b: PHI (r17v15 android.content.Intent) = (r17v4 android.content.Intent), (r17v6 android.content.Intent), (r17v18 android.content.Intent) binds: [B:77:0x0309, B:69:0x02ab, B:16:0x0096] A[DONT_GENERATE, DONT_INLINE]
      0x030b: PHI (r18v5 short[]) = (r18v4 short[]), (r18v3 short[]), (r18v3 short[]) binds: [B:77:0x0309, B:69:0x02ab, B:16:0x0096] A[DONT_GENERATE, DONT_INLINE]
      0x030b: PHI (r19v14 android.content.Intent) = (r19v2 android.content.Intent), (r19v4 android.content.Intent), (r19v17 android.content.Intent) binds: [B:77:0x0309, B:69:0x02ab, B:16:0x0096] A[DONT_GENERATE, DONT_INLINE]
      0x030b: PHI (r20v14 java.lang.String) = (r20v2 java.lang.String), (r20v4 java.lang.String), (r20v17 java.lang.String) binds: [B:77:0x0309, B:69:0x02ab, B:16:0x0096] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m34964(PackageManager packageManager, String str) {
        int iM2761;
        int i;
        int i2;
        Intent intentAddCategory;
        Intent intent;
        int i3;
        int i4;
        int iM2762;
        int iM3169;
        int i5;
        int i6;
        int i7 = C1826.f6190;
        int i8 = C3734.f12817;
        int iM2763 = C0619.m2761("᩸᩻") ^ i8;
        int i9 = ((iM2763 ^ i7) * 24955) ^ 750786956;
        short[] sArr = null;
        short[] sArr2 = null;
        int i10 = iM2763 ^ 1615308403;
        char c = 0;
        short s = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 997444108;
        Iterator itM53423 = null;
        Intent intent2 = null;
        String strM11809 = null;
        Intent intent3 = null;
        while (true) {
            i16 = i10 ^ (i9 & (((i16 ^ i7) * (-30867)) >> 31));
            switch (i16) {
                case -2066409402:
                case -41679847:
                    C2375.m8065();
                    if (!C0619.f2439) {
                        intent3 = intent3;
                        strM11809 = strM11809;
                        intent2 = intent2;
                        iM2761 = (C0619.m2761("֡᩵") + i7) * (-95);
                        i = ((iM2761 ^ i8) * (-13607)) ^ (-557148763);
                        i2 = 1315528162;
                        int i17 = iM2761 ^ i2;
                        intent2 = intent2;
                        intent3 = intent3;
                        i10 = i17;
                        i9 = i;
                        strM11809 = strM11809;
                    } else {
                        iM2762 = (C0619.m2761("ۢ᩵") + i7) * 59;
                        i3 = ((iM2762 ^ i8) * (-1805)) ^ 408779467;
                        i4 = -325263149;
                        i10 = iM2762 ^ i4;
                        i9 = i3;
                        intent3 = intent3;
                    }
                    break;
                case -2002946654:
                case -1295851549:
                    intent3 = intent3;
                    strM11809 = strM11809;
                    intent2 = intent2;
                    c = 'j';
                    if (C4238.f15451 >= 0) {
                        iM2761 = (C0619.m2761("֡᩵") + i7) * (-95);
                        i = ((iM2761 ^ i8) * (-13607)) ^ (-557148763);
                        i2 = 1315528162;
                    } else {
                        iM2761 = C0773.m3169("ܰۢ") ^ i7;
                        i = ((iM2761 ^ i8) * 3517) ^ (-715281047);
                        i2 = 1799187174;
                    }
                    int i18 = iM2761 ^ i2;
                    intent2 = intent2;
                    intent3 = intent3;
                    i10 = i18;
                    i9 = i;
                    strM11809 = strM11809;
                    break;
                case -1991374815:
                case -138437204:
                    C0862.m3503();
                    if (!C1783.m6232()) {
                        intent3 = intent3;
                        strM11809 = strM11809;
                        intent2 = intent2;
                        iM2761 = C0619.m2761("ۨܳ") ^ i7;
                        i = ((iM2761 ^ i8) * (-26197)) ^ 1664675175;
                        i2 = -1078217334;
                        int i19 = iM2761 ^ i2;
                        intent2 = intent2;
                        intent3 = intent3;
                        i10 = i19;
                        i9 = i;
                        strM11809 = strM11809;
                    } else {
                        iM2762 = (C0619.m2761("ۢ᩵") + i7) * 59;
                        i3 = ((iM2762 ^ i8) * (-1805)) ^ 408779467;
                        i4 = -325263149;
                        i10 = iM2762 ^ i4;
                        i9 = i3;
                        intent3 = intent3;
                    }
                    break;
                case -1751093919:
                case 1481666664:
                    i15 = 25755;
                    iM2761 = (i7 - C0619.m2761("ܶۛ")) * (-41);
                    i = ((iM2761 ^ i8) * (-6667)) ^ 1181326921;
                    i2 = 1823739839;
                    int i110 = iM2761 ^ i2;
                    intent2 = intent2;
                    intent3 = intent3;
                    i10 = i110;
                    i9 = i;
                    strM11809 = strM11809;
                    break;
                case -1678367918:
                case -728428160:
                    intent2 = intent3.setPackage(strM11809);
                    if (C1146.m4231()) {
                        iM2762 = C0773.m3169("۫۠") ^ i8;
                        i3 = ((iM2762 ^ i7) * (-6263)) ^ (-2069150494);
                        i4 = -1603134432;
                    } else {
                        iM2762 = (C0619.m2761("ۢ᩵") + i7) * 59;
                        i3 = ((iM2762 ^ i8) * (-1805)) ^ 408779467;
                        i4 = -325263149;
                    }
                    i10 = iM2762 ^ i4;
                    i9 = i3;
                    intent3 = intent3;
                    break;
                case -1538535449:
                case 337782692:
                    if (C1826.m6317(itM53423)) {
                        iM3169 = (i8 - C0619.m2761("ۨۛ")) * 109;
                        i5 = ((iM3169 ^ i7) * 18917) ^ (-806182626);
                        i6 = 1469582210;
                    } else {
                        iM3169 = (C0773.m3169("ۚۛ") ^ i7) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i5 = ((iM3169 ^ i8) * (-13401)) ^ 929127493;
                        i6 = 420286040;
                    }
                    i10 = iM3169 ^ i6;
                    i9 = i5;
                    break;
                case -1499278942:
                case -976032174:
                    return false;
                case -1430045874:
                case -1060210855:
                    RunnableC1848.m6360();
                    return false;
                case -1382622451:
                case -937420541:
                    C3077.m10041();
                    intent3 = intent3;
                    strM11809 = strM11809;
                    intent2 = intent2;
                    iM2761 = (C0619.m2761("֡᩵") + i7) * (-95);
                    i = ((iM2761 ^ i8) * (-13607)) ^ (-557148763);
                    i2 = 1315528162;
                    int i111 = iM2761 ^ i2;
                    intent2 = intent2;
                    intent3 = intent3;
                    i10 = i111;
                    i9 = i;
                    strM11809 = strM11809;
                    break;
                case -1380666371:
                case -661245776:
                    intent3 = intent3;
                    intent2 = intent2;
                    strM11809 = RunnableC3646.m11809(sArr2, 133, 19, i15);
                    if (C1146.f4234 < 0) {
                        int iM31610 = C0773.m3169("ۜᩴ") ^ i8;
                        i3 = ((iM31610 ^ i7) * (-23963)) ^ 932819788;
                        intent2 = intent2;
                        i10 = iM31610 ^ 249955059;
                        i9 = i3;
                        intent3 = intent3;
                    } else {
                        intentAddCategory = intent3;
                        int iM2764 = C0619.m2761("ܿۢ") ^ i8;
                        Intent intent4 = intentAddCategory;
                        i9 = ((iM2764 ^ i7) * (-3885)) ^ 1705427370;
                        intent3 = intent4;
                        intent = intent2;
                        i10 = iM2764 ^ 1655682198;
                        intent2 = intent;
                    }
                    break;
                case -1143236207:
                case -935994277:
                    intent3 = intent3;
                    intent2 = intent2;
                    short[] sArr3 = f45583;
                    if (C2419.f7754 >= 0) {
                        strM11809 = strM11809;
                        iM2761 = C0619.m2761("ۨܳ") ^ i7;
                        i = ((iM2761 ^ i8) * (-26197)) ^ 1664675175;
                        i2 = -1078217334;
                        int i112 = iM2761 ^ i2;
                        intent2 = intent2;
                        intent3 = intent3;
                        i10 = i112;
                        i9 = i;
                    } else {
                        strM11809 = strM11809;
                        String strM11252 = C3448.m11252(sArr3, IShizukuService.Stub.TRANSACTION_updateFlagsForUid, 26, i15);
                        if (C4282.m13644()) {
                            intentAddCategory = new Intent(strM11252).addCategory(str);
                            sArr2 = f45583;
                            if (C11235.f35427 >= 0) {
                                strM11809 = strM11809;
                                int iM2765 = C0619.m2761("ܿۢ") ^ i8;
                                Intent intent5 = intentAddCategory;
                                i9 = ((iM2765 ^ i7) * (-3885)) ^ 1705427370;
                                intent3 = intent5;
                                intent = intent2;
                                i10 = iM2765 ^ 1655682198;
                                intent2 = intent;
                            } else {
                                int iM2766 = (C0619.m2761("ܳ᩺") + i7) * 57;
                                intent3 = intentAddCategory;
                                i9 = ((iM2766 ^ i8) * 15757) ^ (-1686191818);
                                intent2 = intent2;
                                i10 = iM2766 ^ (-1344924626);
                            }
                        } else {
                            iM2761 = C0619.m2761("ۨܳ") ^ i7;
                            i = ((iM2761 ^ i8) * (-26197)) ^ 1664675175;
                            i2 = -1078217334;
                            int i113 = iM2761 ^ i2;
                            intent2 = intent2;
                            intent3 = intent3;
                            i10 = i113;
                            i9 = i;
                        }
                    }
                    strM11809 = strM11809;
                    break;
                case -1019596408:
                case 1188111914:
                    i15 = 45894;
                    iM2761 = (i7 - C0619.m2761("ܶۛ")) * (-41);
                    i = ((iM2761 ^ i8) * (-6667)) ^ 1181326921;
                    i2 = 1823739839;
                    int i114 = iM2761 ^ i2;
                    intent2 = intent2;
                    intent3 = intent3;
                    i10 = i114;
                    i9 = i;
                    strM11809 = strM11809;
                    break;
                case -827165722:
                case 265862323:
                    intent3 = intent3;
                    strM11809 = strM11809;
                    intent2 = intent2;
                    s = sArr[c];
                    i11 = s + 43;
                    if (C1519.f5300 >= 0) {
                        iM2761 = C0773.m3169("ܳ᩷") ^ i8;
                        i = ((iM2761 ^ i7) * (-30139)) ^ 1072564029;
                        i2 = 298135387;
                    } else {
                        iM2761 = C0619.m2761("۠ܰ") ^ i8;
                        i = ((iM2761 ^ i7) * (-16191)) ^ (-1606377955);
                        i2 = 2031189788;
                    }
                    int i115 = iM2761 ^ i2;
                    intent2 = intent2;
                    intent3 = intent3;
                    i10 = i115;
                    i9 = i;
                    strM11809 = strM11809;
                    break;
                case -614573274:
                case 1186286918:
                    if (C23916.f77426 <= 0) {
                        intent3 = intent3;
                        strM11809 = strM11809;
                        intent2 = intent2;
                        iM2761 = C0773.m3169("ܳ᩷") ^ i8;
                        i = ((iM2761 ^ i7) * (-30139)) ^ 1072564029;
                        i2 = 298135387;
                        int i116 = iM2761 ^ i2;
                        intent2 = intent2;
                        intent3 = intent3;
                        i10 = i116;
                        i9 = i;
                        strM11809 = strM11809;
                    }
                    intent3 = intent3;
                    strM11809 = strM11809;
                    intent2 = intent2;
                    iM2761 = (C0619.m2761("֡᩵") + i7) * (-95);
                    i = ((iM2761 ^ i8) * (-13607)) ^ (-557148763);
                    i2 = 1315528162;
                    int i117 = iM2761 ^ i2;
                    intent2 = intent2;
                    intent3 = intent3;
                    i10 = i117;
                    i9 = i;
                    strM11809 = strM11809;
                    break;
                case -342001536:
                case 1697258183:
                    intent3 = intent3;
                    strM11809 = strM11809;
                    intent2 = intent2;
                    sArr = f45583;
                    if (C2702.f8586 <= 0) {
                        iM2761 = C0773.m3169("ܳ᩷") ^ i8;
                        i = ((iM2761 ^ i7) * (-30139)) ^ 1072564029;
                        i2 = 298135387;
                    } else {
                        iM2761 = C0773.m3169("ۧۨ") ^ i7;
                        i = ((iM2761 ^ i8) * 8455) ^ 223486328;
                        i2 = -702074651;
                    }
                    int i118 = iM2761 ^ i2;
                    intent2 = intent2;
                    intent3 = intent3;
                    i10 = i118;
                    i9 = i;
                    strM11809 = strM11809;
                    break;
                case -335450635:
                case 1842059366:
                    intent3 = intent3;
                    strM11809 = strM11809;
                    intent2 = intent2;
                    i12 = i11 * i11;
                    i13 = s * s;
                    i14 = 1849;
                    if (C1146.f4234 >= 0) {
                        iM2761 = (C0619.m2761("֡᩵") + i7) * (-95);
                        i = ((iM2761 ^ i8) * (-13607)) ^ (-557148763);
                        i2 = 1315528162;
                    } else {
                        iM2761 = (C0619.m2761("᩻᩺") ^ i7) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM2761 ^ i8) * 1581) ^ 1381675954;
                        i2 = 880575974;
                    }
                    int i119 = iM2761 ^ i2;
                    intent2 = intent2;
                    intent3 = intent3;
                    i10 = i119;
                    i9 = i;
                    strM11809 = strM11809;
                    break;
                case -179034167:
                case 1653133802:
                    intent3 = intent3;
                    strM11809 = strM11809;
                    intent2 = intent2;
                    if (C1542.f5343 <= 0) {
                        iM2761 = C0619.m2761("ۨܳ") ^ i7;
                        i = ((iM2761 ^ i8) * (-26197)) ^ 1664675175;
                        i2 = -1078217334;
                    } else {
                        iM2761 = C0619.m2761("᩵ܶ") ^ i8;
                        i = ((iM2761 ^ i7) * (-31931)) ^ 906086844;
                        i2 = -264638689;
                    }
                    int i1110 = iM2761 ^ i2;
                    intent2 = intent2;
                    intent3 = intent3;
                    i10 = i1110;
                    i9 = i;
                    strM11809 = strM11809;
                    break;
                case -151298089:
                case 1030251289:
                    return true;
                case 86968831:
                case 542243532:
                    if (!((ResolveInfo) C4238.m13529(itM53423)).activityInfo.exported) {
                        int iM2767 = (C0619.m2761("᩺ۡ") ^ i7) * 45;
                        intent = intent2;
                        i10 = iM2767 ^ 405060775;
                        i9 = ((iM2767 ^ i8) * (-13327)) ^ 780444202;
                        intent2 = intent;
                    } else {
                        iM3169 = (C0773.m3169("ۚۚ") ^ i8) * 41;
                        i5 = ((iM3169 ^ i7) * (-16201)) ^ (-1618450044);
                        i6 = -486807560;
                        i10 = iM3169 ^ i6;
                        i9 = i5;
                    }
                    break;
                case 895619020:
                case 1036278221:
                    itM53423 = C23916.m53423(packageManager.queryIntentActivities(intent2, 512));
                    int iM2768 = (C0619.m2761("᩺ۡ") ^ i7) * 45;
                    intent = intent2;
                    i10 = iM2768 ^ 405060775;
                    i9 = ((iM2768 ^ i8) * (-13327)) ^ 780444202;
                    intent2 = intent;
                    break;
                default:
                    intent3 = intent3;
                    strM11809 = strM11809;
                    intent2 = intent2;
                    int i20 = i13 + i14;
                    if (i12 - (i20 + i20) > 0) {
                        iM2761 = C0773.m3169("ۙۖ") ^ i8;
                        i = ((iM2761 ^ i7) * (-31909)) ^ (-2121924648);
                        i2 = -851417652;
                    } else {
                        iM2761 = C0619.m2761("ܶܺ") ^ i8;
                        i = ((iM2761 ^ i7) * (-20795)) ^ 724434464;
                        i2 = -742322601;
                    }
                    int i1111 = iM2761 ^ i2;
                    intent2 = intent2;
                    intent3 = intent3;
                    i10 = i1111;
                    i9 = i;
                    strM11809 = strM11809;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m34960(WeakReference weakReference) {
        Object obj = null;
        C14482 c14482 = null;
        int i = -559463800;
        int i2 = C3448.f11240;
        int i3 = AbstractC0641.f2496;
        int iM3169 = (C0773.m3169("ᩴ۟") + i2) * (-65);
        int i4 = ((iM3169 ^ i3) * (-28005)) ^ 1416721114;
        int i5 = 912249882;
        while (true) {
            i = ((((i ^ i3) * 73) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2069245771:
                case 2103212974:
                    if (RunnableC1848.m6360()) {
                        iM3169 = (i2 - C0773.m3169("ᩳܰ")) * (-49);
                        i4 = ((iM3169 ^ i3) * 9457) ^ 2014093814;
                        i5 = -1402198290;
                    } else {
                        iM3169 = C0619.m2761("᩵ᩳ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 21003) ^ 2143198512;
                        i5 = 783111367;
                    }
                    break;
                case -2027365206:
                case 978904656:
                    if (C1343.f4799 != 0) {
                        iM3169 = C0619.m2761("ܳۧ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-27551)) ^ (-258812798);
                        i5 = -1951691688;
                    } else {
                        iM3169 = C0619.m2761("֫֡") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-19157)) ^ (-1431904198);
                        i5 = -1206804545;
                    }
                    break;
                case -1731355023:
                case 1817572929:
                    c14482.f45592 = false;
                    c14482.m34965();
                    iM3169 = C0619.m2761("ۜܺ") ^ i3;
                    i4 = ((iM3169 ^ i2) * 3987) ^ 1689357132;
                    i5 = -2030553263;
                    break;
                case -1609775553:
                case 1534201944:
                    C3779.m12264();
                    if (C1080.f3865 >= 0) {
                        iM3169 = (C0773.m3169("ۗܶ") + i2) * (-97);
                        i4 = ((iM3169 ^ i3) * 20081) ^ 1276840924;
                        i5 = -85572694;
                    } else {
                        iM3169 = C0619.m2761("ܳۧ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-27551)) ^ (-258812798);
                        i5 = -1951691688;
                    }
                    break;
                case -1408592263:
                case 232949517:
                    C2023.m6964();
                    iM3169 = C0619.m2761("ܳۧ") ^ i3;
                    i4 = ((iM3169 ^ i2) * (-27551)) ^ (-258812798);
                    i5 = -1951691688;
                    break;
                case -1230779219:
                case 1408611361:
                    if (C4282.m13644()) {
                        iM3169 = (C0773.m3169("֨ۧ") ^ i3) * (-35);
                        i4 = ((iM3169 ^ i2) * 27949) ^ (-1423425315);
                        i5 = -1113797552;
                    } else {
                        iM3169 = C0773.m3169("ܿᩳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 7341) ^ 830980903;
                        i5 = 718907609;
                    }
                    break;
                case -1186933079:
                case 1548494791:
                    if (C2878.f9462) {
                        iM3169 = (i2 - C0773.m3169("ᩳܰ")) * (-49);
                        i4 = ((iM3169 ^ i3) * 9457) ^ 2014093814;
                        i5 = -1402198290;
                    } else {
                        iM3169 = C0619.m2761("֡ۨ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-14143)) ^ (-1839056619);
                        i5 = -1113726673;
                    }
                    break;
                case -1161189105:
                case 204306813:
                    break;
                case -1005081476:
                case 25100222:
                    C2834.m9344();
                    C23916.m53419();
                    break;
                case -766489720:
                case 1440016622:
                    c14482 = (C14482) obj;
                    if (c14482 != null) {
                        iM3169 = C0619.m2761("ۢᩴ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-14567)) ^ 1300489510;
                        i5 = -2078497483;
                    } else {
                        iM3169 = C0619.m2761("ۜܺ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 3987) ^ 1689357132;
                        i5 = -2030553263;
                    }
                    break;
                case -706570533:
                case 938035585:
                    if (C1542.f5343 <= 0) {
                        iM3169 = (C0773.m3169("ۗܶ") + i2) * (-97);
                        i4 = ((iM3169 ^ i3) * 20081) ^ 1276840924;
                        i5 = -85572694;
                    } else {
                        iM3169 = (C0773.m3169("ۧۚ") + i2) * (-117);
                        i4 = ((iM3169 ^ i3) * (-10359)) ^ (-2042156332);
                        i5 = -402044423;
                    }
                    break;
                case -463779824:
                case -72097552:
                    if (C0950.f3488 >= 0) {
                        iM3169 = C0773.m3169("ܿᩳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 7341) ^ 830980903;
                        i5 = 718907609;
                    } else {
                        iM3169 = (C0773.m3169("ۛ֨") + i2) * (-63);
                        i4 = ((iM3169 ^ i3) * (-13913)) ^ 1597236797;
                        i5 = -268696509;
                    }
                    break;
                case 22688145:
                case 421509108:
                    C0269.m1775();
                    if (C3492.f12043 <= 0) {
                        iM3169 = C0773.m3169("֡᩷") ^ i2;
                        i4 = ((iM3169 ^ i3) * 14613) ^ (-1527544514);
                        i5 = 1145299497;
                    } else {
                        iM3169 = C0619.m2761("ܳۧ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-27551)) ^ (-258812798);
                        i5 = -1951691688;
                    }
                    break;
                case 653070889:
                case 1756792122:
                    if (C2310.f7472 >= 0) {
                        iM3169 = C0773.m3169("ܿᩳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 7341) ^ 830980903;
                        i5 = 718907609;
                    } else {
                        iM3169 = (C0773.m3169("ۗܶ") + i2) * (-97);
                        i4 = ((iM3169 ^ i3) * 20081) ^ 1276840924;
                        i5 = -85572694;
                    }
                    break;
                case 679819296:
                case 841674805:
                    obj = weakReference.get();
                    if (C2834.f9334 <= 0) {
                        iM3169 = (i2 - C0773.m3169("ᩳܰ")) * (-49);
                        i4 = ((iM3169 ^ i3) * 9457) ^ 2014093814;
                        i5 = -1402198290;
                    } else {
                        iM3169 = C0773.m3169("ܽ۬") ^ i3;
                        i4 = ((iM3169 ^ i2) * 1441) ^ (-313422112);
                        i5 = -142014189;
                    }
                    break;
                case 1039045194:
                case 1489686359:
                    if (C0950.f3488 >= 0) {
                        iM3169 = C0773.m3169("ܿᩳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 7341) ^ 830980903;
                        i5 = 718907609;
                    } else {
                        iM3169 = (C0773.m3169("᩶ܳ") + i3) * (-121);
                        i4 = ((iM3169 ^ i2) * 28111) ^ (-730897439);
                        i5 = -1143059815;
                    }
                    break;
                case 1347982927:
                case 1416095779:
                    if (C2878.f9462) {
                        iM3169 = C0773.m3169("֡᩷") ^ i2;
                        i4 = ((iM3169 ^ i3) * 14613) ^ (-1527544514);
                        i5 = 1145299497;
                    } else {
                        iM3169 = (C0773.m3169("ۚۧ") + i3) * 93;
                        i4 = ((iM3169 ^ i2) * (-18811)) ^ (-419908523);
                        i5 = 1007851458;
                    }
                    break;
                default:
                    if (C23916.m53419() != 0) {
                        iM3169 = C0773.m3169("֡᩷") ^ i2;
                        i4 = ((iM3169 ^ i3) * 14613) ^ (-1527544514);
                        i5 = 1145299497;
                    } else {
                        iM3169 = (C0619.m2761("ۤ᩷") ^ i3) * (-77);
                        i4 = ((iM3169 ^ i2) * 32319) ^ (-1291750383);
                        i5 = 171512530;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m34961(InterfaceC9801 interfaceC9801, PackageManager packageManager) {
        short s = f45583[4];
        int i = (s * 28254) - ((s * s) + 199572129) <= 0 ? 28358 : 15514;
        synchronized (f45584) {
            if (interfaceC9801.getInt(C3099.m10092(f45583, 5, 3, i), 0) != 0) {
                return;
            }
            int i2 = 1;
            try {
                packageManager.getApplicationInfo(C3099.m10092(f45583, 8, 19, i), 0);
                if (m34964(packageManager, C3998.m12925(f45583, 27, 32, i)) || m34964(packageManager, C20932.m47853(f45583, 62, 28, i))) {
                    i2 = 2;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            C11235.m28308(C2419.m8173(interfaceC9801).mo3486(i2, RunnableC0334.m2049(f45583, 59, 3, i)));
        }
    }

    @Override // l.InterfaceC12314
    /* JADX INFO: renamed from: ᩴ */
    public final void mo29779(InterfaceC11217 interfaceC11217) {
        boolean z = false;
        RunnableC25306 runnableC25306 = null;
        View view = null;
        DialogInterfaceC8327 dialogInterfaceC8327 = null;
        int i = 1947255729;
        int i2 = C2702.f8586;
        int i3 = C0487.f2131;
        int iM3169 = C0773.m3169("ᩴۚ") ^ i3;
        int i4 = ((iM3169 ^ i2) * 13821) ^ 570914542;
        int i5 = -26676017;
        while (true) {
            i = ((((i ^ i2) * 22505) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2044453472:
                case -1040246075:
                    view.getViewTreeObserver().removeOnWindowFocusChangeListener(this.f45591);
                    iM3169 = (i2 - C0619.m2761("ܿۚ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    i4 = ((iM3169 ^ i3) * 7003) ^ 1794005043;
                    i5 = 1046341524;
                    break;
                case -1923168384:
                case -481328294:
                    if (C2966.f9654 >= 0) {
                        iM3169 = C0773.m3169("᩺᩺") ^ i2;
                        i4 = ((iM3169 ^ i3) * 15795) ^ (-1966823768);
                        i5 = 1200557862;
                    } else {
                        iM3169 = C0773.m3169("ۗܳ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-32613)) ^ 482475303;
                        i5 = -720659480;
                    }
                    break;
                case -1710428121:
                case 534360295:
                    break;
                case -1708820955:
                case 94632237:
                    C3099.m10091(interfaceC11217).mo23078(this);
                    dialogInterfaceC8327 = this.f45587;
                    if (dialogInterfaceC8327 != null) {
                        iM3169 = (i2 - C0619.m2761("֡ۨ")) * (-45);
                        i4 = ((iM3169 ^ i3) * (-26601)) ^ (-1441736680);
                        i5 = 1051993255;
                    } else {
                        iM3169 = C0773.m3169("᩻ᩴ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-27183)) ^ 193228365;
                        i5 = 145471654;
                    }
                    break;
                case -1654282392:
                case 1541902151:
                    if (C3077.f9998) {
                        iM3169 = C0619.m2761("᩺ܿ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 1953) ^ 1878619614;
                        i5 = -243446426;
                    } else {
                        iM3169 = C0773.m3169("ۧܳ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 2033) ^ (-469511487);
                        i5 = 538878773;
                    }
                    break;
                case -1524240670:
                case 538700760:
                    if (!RunnableC0334.m2063()) {
                        iM3169 = (C0773.m3169("᩹ۜ") + i3) * (-33);
                        i4 = ((iM3169 ^ i2) * 7299) ^ (-1701471060);
                        i5 = -578319182;
                    } else {
                        iM3169 = C0773.m3169("ۧܳ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 2033) ^ (-469511487);
                        i5 = 538878773;
                    }
                    break;
                case -1326027559:
                case 846174609:
                    z = true;
                    if (C2354.m7983()) {
                        iM3169 = (C0773.m3169("᩶ܶ") + i3) * 81;
                        i4 = ((iM3169 ^ i2) * (-30455)) ^ 1246643871;
                        i5 = 708258117;
                    } else {
                        iM3169 = C0773.m3169("ۧܳ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 2033) ^ (-469511487);
                        i5 = 538878773;
                    }
                    break;
                case -1136256250:
                case 1105886045:
                    this.f45585 = z;
                    runnableC25306 = this.f45588;
                    if (C3779.f12953 <= 0) {
                        iM3169 = (C0773.m3169("ۡۨ") + i3) * 75;
                        i4 = ((iM3169 ^ i2) * 6113) ^ 1980775166;
                        i5 = -1489034720;
                    } else {
                        iM3169 = (C0773.m3169("ۜ᩹") + i3) * 57;
                        i4 = ((iM3169 ^ i2) * 27541) ^ (-554711803);
                        i5 = 1793128826;
                    }
                    break;
                case -1134184446:
                case 2035249493:
                    if (C3492.f12043 > 0) {
                        iM3169 = C0773.m3169("᩺᩺") ^ i2;
                        i4 = ((iM3169 ^ i3) * 15795) ^ (-1966823768);
                        i5 = 1200557862;
                    } else {
                        iM3169 = C0619.m2761("ܿۨ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 23061) ^ 1235791243;
                        i5 = 929712969;
                    }
                    break;
                case -701319391:
                case 730758409:
                    if (C1826.f6190 <= 0) {
                        iM3169 = C0619.m2761("ܿۨ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 23061) ^ 1235791243;
                        i5 = 929712969;
                    } else {
                        iM3169 = C0773.m3169("ۘ᩶") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-11057)) ^ (-758454884);
                        i5 = 231442743;
                    }
                    break;
                case -482143970:
                case 266512346:
                    C3734.m12152();
                    if (C3734.f12817 >= 0) {
                        iM3169 = C0619.m2761("ܿۨ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 23061) ^ 1235791243;
                        i5 = 929712969;
                    } else {
                        iM3169 = C0773.m3169("ۧܳ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 2033) ^ (-469511487);
                        i5 = 538878773;
                    }
                    break;
                case -446648724:
                case 1752209829:
                    C2419.m8174();
                    break;
                case -435210629:
                case 280013796:
                    if (C4238.f15451 >= 0) {
                        iM3169 = (C0773.m3169("ۡۨ") + i3) * 75;
                        i4 = ((iM3169 ^ i2) * 6113) ^ 1980775166;
                        i5 = -1489034720;
                    } else {
                        iM3169 = C0773.m3169("ۚ᩺") ^ i2;
                        i4 = ((iM3169 ^ i3) * 24825) ^ (-1068149396);
                        i5 = 2046922957;
                    }
                    break;
                case -384136911:
                case 539615973:
                    if (C17202.f56030) {
                        iM3169 = (i3 - C0619.m2761("᩺֨")) * 61;
                        i4 = ((iM3169 ^ i2) * 8933) ^ 129802746;
                        i5 = -1744479674;
                    } else {
                        iM3169 = C0773.m3169("᩺᩺") ^ i2;
                        i4 = ((iM3169 ^ i3) * 15795) ^ (-1966823768);
                        i5 = 1200557862;
                    }
                    break;
                case -54412368:
                case 612148919:
                    C11235.m28309();
                    C2354.m7983();
                    iM3169 = C0773.m3169("ۧܳ") ^ i2;
                    i4 = ((iM3169 ^ i3) * 2033) ^ (-469511487);
                    i5 = 538878773;
                    break;
                case 468813687:
                case 1385097399:
                    view = this.f45590;
                    view.removeCallbacks(runnableC25306);
                    if (C2375.f7641 <= 0) {
                        iM3169 = (C0773.m3169("᩹ۜ") + i3) * (-33);
                        i4 = ((iM3169 ^ i2) * 7299) ^ (-1701471060);
                        i5 = -578319182;
                    } else {
                        iM3169 = (C0619.m2761("ۤ᩷") + i2) * 123;
                        i4 = ((iM3169 ^ i3) * (-12075)) ^ 498179243;
                        i5 = -1932444698;
                    }
                    break;
                case 531705199:
                case 1168474133:
                    if (C2375.f7641 <= 0) {
                        iM3169 = (C0773.m3169("᩹ۜ") + i3) * (-33);
                        i4 = ((iM3169 ^ i2) * 7299) ^ (-1701471060);
                        i5 = -578319182;
                    } else {
                        iM3169 = C0773.m3169("᩹ۘ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-22195)) ^ (-1934477563);
                        i5 = -197263555;
                    }
                    break;
                case 816484769:
                case 2048197544:
                    C11235.m28311(dialogInterfaceC8327);
                    iM3169 = C0773.m3169("᩻ᩴ") ^ i3;
                    i4 = ((iM3169 ^ i2) * (-27183)) ^ 193228365;
                    i5 = 145471654;
                    break;
                case 841382537:
                case 1097698195:
                    if (view.getViewTreeObserver().isAlive()) {
                        iM3169 = (C0773.m3169("ۢܶ") ^ i3) * 35;
                        i4 = ((iM3169 ^ i2) * 3199) ^ (-2117251315);
                        i5 = -176726303;
                    } else {
                        iM3169 = (i2 - C0619.m2761("ܿۚ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM3169 ^ i3) * 7003) ^ 1794005043;
                        i5 = 1046341524;
                    }
                    break;
                default:
                    if (C3448.f11240 >= 0) {
                        iM3169 = C0773.m3169("᩺᩺") ^ i2;
                        i4 = ((iM3169 ^ i3) * 15795) ^ (-1966823768);
                        i5 = 1200557862;
                    } else {
                        iM3169 = C0619.m2761("ۧ᩷") ^ i2;
                        i4 = ((iM3169 ^ i3) * 24407) ^ 253750820;
                        i5 = -1638096659;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m34965() {
        View view = null;
        RunnableC25306 runnableC25306 = null;
        int i = -1408259327;
        int i2 = C2834.f9334;
        int i3 = C1146.f4234;
        int iM2761 = (C0619.m2761("ۛܿ") ^ i2) * (-29);
        int i4 = ((iM2761 ^ i3) * 27763) ^ 1040657938;
        int i5 = 101588224;
        while (true) {
            i = ((((i ^ i3) * 18613) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -1833399471:
                case -382742831:
                    break;
                case -1808677278:
                case -346509161:
                    if (C2287.m7745() <= 0) {
                        iM2761 = (i3 - C0773.m3169("֨ۜ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM2761 ^ i2) * (-20595)) ^ 1602477714;
                        i5 = 765148875;
                    } else {
                        iM2761 = (C0773.m3169("᩺ۡ") + i3) * 25;
                        i4 = ((iM2761 ^ i2) * 18065) ^ 863702395;
                        i5 = -240159681;
                    }
                    break;
                case -1635234575:
                case 1290268085:
                    C2702.m8876();
                    RunnableC3646.m11813();
                    iM2761 = (C0773.m3169("᩻ۢ") + i2) * 47;
                    i4 = ((iM2761 ^ i3) * 32315) ^ 21828894;
                    i5 = -1070551778;
                    break;
                case -1496760540:
                case -846957122:
                    if (C0773.f2792 <= 0) {
                        iM2761 = C0773.m3169("֫۬") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-3893)) ^ (-827478886);
                        i5 = -2043570244;
                    } else {
                        iM2761 = C0773.m3169("ܽۖ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-9841)) ^ 567496834;
                        i5 = 407790202;
                    }
                    break;
                case -1385743948:
                case 910720799:
                    if (C3734.f12817 < 0) {
                        iM2761 = (C0773.m3169("᩶۟") ^ i2) * (-119);
                        i4 = ((iM2761 ^ i3) * (-14809)) ^ (-1600678892);
                        i5 = 1346133003;
                    } else {
                        iM2761 = (C0773.m3169("᩻ۢ") + i2) * 47;
                        i4 = ((iM2761 ^ i3) * 32315) ^ 21828894;
                        i5 = -1070551778;
                    }
                    break;
                case -1146232656:
                case -871650:
                    if (C0773.f2792 <= 0) {
                        iM2761 = (C0773.m3169("᩶۟") ^ i2) * (-119);
                        i4 = ((iM2761 ^ i3) * (-14809)) ^ (-1600678892);
                        i5 = 1346133003;
                    } else {
                        iM2761 = C0619.m2761("ۛ᩹") ^ i2;
                        i4 = ((iM2761 ^ i3) * 587) ^ 1551019281;
                        i5 = -612852404;
                    }
                    break;
                case -459358058:
                case 214271251:
                    if (C2485.m8357() <= 0) {
                        iM2761 = C0619.m2761("ۢ֨") ^ i2;
                        i4 = ((iM2761 ^ i3) * 22999) ^ 343721016;
                        i5 = 1049328942;
                    } else {
                        iM2761 = C0619.m2761("۬ܶ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-14115)) ^ 1539456830;
                        i5 = -1050441967;
                    }
                    break;
                case -367965857:
                case 1897530585:
                    view.removeCallbacks(runnableC25306);
                    view.post(runnableC25306);
                    iM2761 = C0773.m3169("۟ܺ") ^ i3;
                    i4 = ((iM2761 ^ i2) * (-25195)) ^ (-1696191971);
                    i5 = 583076200;
                    break;
                case -357725286:
                case -350591644:
                    if (C13473.f42873 != 0) {
                        iM2761 = (C0773.m3169("᩶۟") ^ i2) * (-119);
                        i4 = ((iM2761 ^ i3) * (-14809)) ^ (-1600678892);
                        i5 = 1346133003;
                    } else {
                        iM2761 = (i2 - C0619.m2761("ܶ᩹")) * (-85);
                        i4 = ((iM2761 ^ i3) * (-15755)) ^ 1275641744;
                        i5 = -1301012570;
                    }
                    break;
                case -35127757:
                case 2058016558:
                    view = this.f45590;
                    runnableC25306 = this.f45588;
                    if (RunnableC3646.f12471) {
                        iM2761 = (C0773.m3169("᩻ۢ") + i2) * 47;
                        i4 = ((iM2761 ^ i3) * 32315) ^ 21828894;
                        i5 = -1070551778;
                    } else {
                        iM2761 = (C0619.m2761("۟۬") ^ i2) * (-33);
                        i4 = ((iM2761 ^ i3) * (-6183)) ^ 266018731;
                        i5 = -1702782061;
                    }
                    break;
                case 44079804:
                case 1886735604:
                    if (this.f45585) {
                        iM2761 = C0773.m3169("۟ܺ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-25195)) ^ (-1696191971);
                        i5 = 583076200;
                    } else {
                        iM2761 = C0619.m2761("ܿۜ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 23311) ^ (-1893737892);
                        i5 = 904103299;
                    }
                    break;
                case 514702153:
                case 1248349320:
                    if (RunnableC3646.f12471) {
                        iM2761 = C0619.m2761("ۢ֨") ^ i2;
                        i4 = ((iM2761 ^ i3) * 22999) ^ 343721016;
                        i5 = 1049328942;
                    } else {
                        iM2761 = C0773.m3169("۬۫") ^ i3;
                        i4 = ((iM2761 ^ i2) * 25133) ^ 1446917499;
                        i5 = -2128317696;
                    }
                    break;
                case 603417195:
                case 1953224266:
                    C3077.m10041();
                    if (!C1343.m4943()) {
                        iM2761 = (i3 - C0773.m3169("֨ۜ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM2761 ^ i2) * (-20595)) ^ 1602477714;
                        i5 = 765148875;
                    } else {
                        iM2761 = (C0773.m3169("᩻ۢ") + i2) * 47;
                        i4 = ((iM2761 ^ i3) * 32315) ^ 21828894;
                        i5 = -1070551778;
                    }
                    break;
                case 663077792:
                case 1326512039:
                    AbstractC0116.m1243();
                    C11235.m28309();
                    break;
                case 1184700642:
                case 1560891824:
                    if (C3998.f13671 != 0) {
                        iM2761 = (C0773.m3169("᩻ۢ") + i2) * 47;
                        i4 = ((iM2761 ^ i3) * 32315) ^ 21828894;
                        i5 = -1070551778;
                    } else {
                        iM2761 = C0773.m3169("ۤۘ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-25787)) ^ (-2041196016);
                        i5 = 1334522216;
                    }
                    break;
                case 1326123604:
                case 1460088979:
                    if (C2419.f7754 >= 0) {
                        iM2761 = C0773.m3169("֫۬") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-3893)) ^ (-827478886);
                        i5 = -2043570244;
                    } else {
                        iM2761 = C0619.m2761("۠ۖ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 9361) ^ 1353169562;
                        i5 = 1533272208;
                    }
                    break;
                case 1908544504:
                case 2009883084:
                    if (!C3099.m10095()) {
                        iM2761 = (i3 - C0773.m3169("֨ۜ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM2761 ^ i2) * (-20595)) ^ 1602477714;
                        i5 = 765148875;
                    } else {
                        iM2761 = C0773.m3169("֫۬") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-3893)) ^ (-827478886);
                        i5 = -2043570244;
                    }
                    break;
                default:
                    if (C1783.f6087 <= 0) {
                        iM2761 = (i3 - C0773.m3169("֨ۜ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM2761 ^ i2) * (-20595)) ^ 1602477714;
                        i5 = 765148875;
                    } else {
                        iM2761 = (C0773.m3169("ۘܺ") ^ i2) * (-85);
                        i4 = ((iM2761 ^ i3) * (-24473)) ^ 882458169;
                        i5 = -1604600843;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.InterfaceC12314
    /* JADX INFO: renamed from: ᩷ */
    public final void mo29780(InterfaceC11217 interfaceC11217) {
        m34965();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00d9 A[PHI: r7 r8
      0x00d9: PHI (r7v3 l.֡᩸᩹) = (r7v1 l.֡᩸᩹), (r7v2 l.֡᩸᩹), (r7v1 l.֡᩸᩹), (r7v1 l.֡᩸᩹) binds: [B:122:0x00d9, B:28:0x00d7, B:25:0x00b1, B:16:0x0083] A[DONT_GENERATE, DONT_INLINE]
      0x00d9: PHI (r8v3 java.lang.CharSequence) = 
      (r8v1 java.lang.CharSequence)
      (r8v2 java.lang.CharSequence)
      (r8v1 java.lang.CharSequence)
      (r8v1 java.lang.CharSequence)
     binds: [B:122:0x00d9, B:28:0x00d7, B:25:0x00b1, B:16:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a0, code lost:
    
        if (l.C0950.f3488 < 0) goto L21;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m34962(final l.C14482 r29) {
        /*
            Method dump skipped, instruction units count: 1466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14482.m34962(l.ܰۡ֫):void");
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0263 A[PHI: r1 r3 r16
      0x0263: PHI (r1v6 short[]) = (r1v5 short[]), (r1v2 short[]), (r1v2 short[]), (r1v2 short[]) binds: [B:68:0x0261, B:60:0x020d, B:51:0x01b6, B:12:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0263: PHI (r3v4 short) = (r3v2 short), (r3v2 short), (r3v3 short), (r3v2 short) binds: [B:68:0x0261, B:60:0x020d, B:51:0x01b6, B:12:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0263: PHI (r16v18 bin.mt.plus.Main) = (r16v3 bin.mt.plus.Main), (r16v5 bin.mt.plus.Main), (r16v7 bin.mt.plus.Main), (r16v22 bin.mt.plus.Main) binds: [B:68:0x0261, B:60:0x020d, B:51:0x01b6, B:12:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0065, code lost:
    
        if (l.C2419.m8174() < 0) goto L19;
     */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void m34966(l.C14482 r18) {
        /*
            Method dump skipped, instruction units count: 806
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14482.m34966(l.ܰۡ֫):void");
    }
}
