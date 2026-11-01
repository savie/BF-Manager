package l;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Iterator;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.᩵ܰۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 42S7 */
/* JADX INFO: loaded from: classes5.dex */
public class ViewOnClickListenerC19497 extends AbstractActivityC12483 implements View.OnClickListener, TextWatcher {

    /* JADX INFO: renamed from: ۗۙ᩵, reason: not valid java name and contains not printable characters */
    private static final short[] f62727 = {5296, 12130, 15759, -14645, 13353, 16164, -10375, 23527, 23526, 23525, 7971, -4730, -15697, 11313, 11135, 11262, -1112, -2650, -15171, 11254, 8869, -14463, -3152, -23875, -23903, -23880, -23894, -23900, -23901, -23932, -23895, -23904, -23902, -23895, -23896, -23932, -23901, -23879, -23896, -23901, -23879, -23827, -23896, -23873, -23873, -23902, -23873, 8766, 9573, -11811, -23936, -23902, -23895, -23896, -23817, -23827, -15042, 8296, -1150, 9497, -4619, -16337, 14893, 15765, 15506, 14998, -15553, 9464, 11384, -9326, -9134, -14013, -13719, 11000, -950, -14061, -15707, -23877, -23896, -23873, -23874, -23900, -23902, -23901, -23933, -23892, -23904, -23896, -23905, -23896, -23875, -23903, -23892, -23890, -23896, -23904, -23896, -23901, -23879, -23827, -23827, -11875, 16106, 9598, -23880, -23875, -23895, -23892, -23879, -23896, -23922, -23902, -23901, -23879, -23896, -23901, -23879, -8253, 10552, -4638, -2350, 14088, -10479, -14371, 10559, -594, -23928, -23873, -23873, -23902, -23873, -23895, -23896, -23893, 8355, -11740, 11283, -1659, -13164, -12946, 14348, -13230, -500, -1287, -2453, 12125, 9123, 18802, 18771, 18752, 18771, 18778, 18777, 18758, 18771, 18756, 18790, 18755, 18772, 18778, 18783, 18757, 18782, 18807, 18773, 18754, 18783, 18752, 18783, 18754, 18767};

    /* JADX INFO: renamed from: ۜܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f62728 = 0;

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public C11986 f62729;

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f62730;

    /* JADX INFO: renamed from: ۘܰ, reason: not valid java name and contains not printable characters */
    public C19383 f62731;

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public int f62732;

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public boolean f62733;

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public boolean f62734;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // l.AbstractActivityC12483
    /* JADX INFO: renamed from: ۡ */
    public final String mo126() {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        short[] sArr2 = null;
        int i6 = 0;
        int i7 = 1516967979;
        int i8 = AbstractC0464.f2088;
        int i9 = C2124.f7782;
        int iM45029 = C19806.m45029("᩸֫") ^ i8;
        int i10 = ((iM45029 ^ i9) * (-16849)) ^ 2087067326;
        int i11 = 1393911366;
        while (true) {
            i7 = ((((i7 ^ i9) * 6257) >> 31) & i10) ^ (iM45029 ^ i11);
            switch (i7) {
                case -1826350722:
                case 474675874:
                    i2 = i * i;
                    i3 = s * s;
                    if (C0629.f2722 <= 0) {
                        iM45029 = C19806.m45029("ᩴᩳ") ^ i8;
                        i10 = ((iM45029 ^ i9) * 20705) ^ (-1127387790);
                        i11 = 801195983;
                    } else {
                        iM45029 = C19806.m45029("᩻ܿ") ^ i8;
                        i10 = ((iM45029 ^ i9) * 23237) ^ (-888591661);
                        i11 = 246286209;
                    }
                    break;
                case -1819247589:
                case 729520935:
                    if (RunnableC1606.f6488 >= 0) {
                        iM45029 = C19806.m45029("ܿ᩸") ^ i8;
                        i10 = ((iM45029 ^ i9) * (-1457)) ^ 2094820544;
                        i11 = -157758602;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳ᩺") ^ i9) * (-19);
                        i10 = ((iM45029 ^ i8) * 9907) ^ (-658115576);
                        i11 = -1340045393;
                    }
                    break;
                case -1667942848:
                case -863161398:
                    if (C3535.f13026 <= 0) {
                        iM45029 = C19806.m45029("ᩴᩳ") ^ i8;
                        i10 = ((iM45029 ^ i9) * 20705) ^ (-1127387790);
                        i11 = 801195983;
                    } else {
                        iM45029 = C19806.m45029("ᩳ۟") ^ i9;
                        i10 = ((iM45029 ^ i8) * 1461) ^ (-1691357052);
                        i11 = -946089753;
                    }
                    break;
                case -1461821660:
                case 614851214:
                    return C1977.m6363(sArr2, i6, 24, i5);
                case -1408254158:
                case -61029576:
                    i = s + 50;
                    if (C10634.f36300 >= 0) {
                        iM45029 = C19806.m45029("ᩴᩳ") ^ i8;
                        i10 = ((iM45029 ^ i9) * 20705) ^ (-1127387790);
                        i11 = 801195983;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩺۟") ^ i9;
                        i10 = ((iM45029 ^ i8) * 13009) ^ (-1906329595);
                        i11 = -457399088;
                    }
                    break;
                case -1359313080:
                case 561955795:
                    C7105.m18985();
                    return null;
                case -1353383533:
                case 1360110202:
                    c = 146;
                    if (RunnableC1564.f6300) {
                        iM45029 = ThreadFactoryC3888.m11306("᩷ܳ") ^ i9;
                        i10 = ((iM45029 ^ i8) * 23439) ^ (-501134420);
                        i11 = -2016499175;
                    } else {
                        iM45029 = (C19806.m45029("ۤۖ") + i9) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i10 = ((iM45029 ^ i8) * 12905) ^ 29297477;
                        i11 = 1265636509;
                    }
                    break;
                case -1341952992:
                case -450274876:
                    if (C1377.m4833() != 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܺܰ") ^ i8) * 49;
                        i10 = ((iM45029 ^ i9) * (-18037)) ^ 1882949178;
                        i11 = -742938720;
                    } else {
                        iM45029 = C19806.m45029("᩻ܰ") ^ i8;
                        i10 = ((iM45029 ^ i9) * (-1303)) ^ 1991071197;
                        i11 = 1931087893;
                    }
                    break;
                case -1180826602:
                case 2007023255:
                    C2788.m8472();
                    if (CallableC1627.m5507() == 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩷ܳ") ^ i9;
                        i10 = ((iM45029 ^ i8) * 23439) ^ (-501134420);
                        i11 = -2016499175;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩷ᩳ") ^ i9) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i10 = ((iM45029 ^ i8) * 703) ^ (-45592229);
                        i11 = 1062222731;
                    }
                    break;
                case -1139813262:
                case -262793330:
                    if (!RunnableC1564.f6300) {
                        iM45029 = C19806.m45029("ܿ᩸") ^ i8;
                        i10 = ((iM45029 ^ i9) * (-1457)) ^ 2094820544;
                        i11 = -157758602;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩷ᩳ") ^ i9) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i10 = ((iM45029 ^ i8) * 703) ^ (-45592229);
                        i11 = 1062222731;
                    }
                    break;
                case -662049519:
                case 251640990:
                    i5 = 18742;
                    iM45029 = C19806.m45029("᩶ۗ") ^ i8;
                    i10 = ((iM45029 ^ i9) * (-16139)) ^ 1337001533;
                    i11 = 563116793;
                    break;
                case -456649553:
                case 1146384856:
                    s = sArr[c];
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩷ᩳ") ^ i9) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i10 = ((iM45029 ^ i8) * 703) ^ (-45592229);
                        i11 = 1062222731;
                    } else {
                        iM45029 = (C19806.m45029("ۙ᩹") ^ i8) * (-39);
                        i10 = ((iM45029 ^ i9) * 32351) ^ 1942251958;
                        i11 = 621540093;
                    }
                    break;
                case -282641419:
                case 963048673:
                    C0962.m3746();
                    iM45029 = C19806.m45029("ܿ᩸") ^ i8;
                    i10 = ((iM45029 ^ i9) * (-1457)) ^ 2094820544;
                    i11 = -157758602;
                    break;
                case -27217864:
                case 1862013175:
                    int i12 = i3 + i4;
                    if ((i12 + i12) - i2 < 0) {
                        iM45029 = (C19806.m45029("ۨᩴ") ^ i9) * (-125);
                        i10 = ((iM45029 ^ i8) * 8485) ^ 1297490941;
                        i11 = -2038170630;
                    } else {
                        iM45029 = (C19806.m45029("ۜۡ") ^ i9) * 67;
                        i10 = ((iM45029 ^ i8) * 28741) ^ (-558548210);
                        i11 = 1129758900;
                    }
                    break;
                case 192211794:
                case 790165853:
                    sArr = f62727;
                    if (C1460.m5050() != 0) {
                        iM45029 = C19806.m45029("ᩴᩳ") ^ i8;
                        i10 = ((iM45029 ^ i9) * 20705) ^ (-1127387790);
                        i11 = 801195983;
                    } else {
                        iM45029 = (i8 - C19806.m45029("֫۠")) * 71;
                        i10 = ((iM45029 ^ i9) * (-16315)) ^ (-649936893);
                        i11 = 532356670;
                    }
                    break;
                case 855268260:
                case 1563718663:
                    RunnableC1606.m5473();
                    if (C1148.m4232() > 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܺܰ") ^ i8) * 49;
                        i10 = ((iM45029 ^ i9) * (-18037)) ^ 1882949178;
                        i11 = -742938720;
                    } else {
                        iM45029 = C19806.m45029("ܿ᩸") ^ i8;
                        i10 = ((iM45029 ^ i9) * (-1457)) ^ 2094820544;
                        i11 = -157758602;
                    }
                    break;
                case 1237741945:
                case 1456442498:
                    i4 = 2500;
                    if (RunnableC1895.m6170() != 0) {
                        iM45029 = C19806.m45029("ܿ᩸") ^ i8;
                        i10 = ((iM45029 ^ i9) * (-1457)) ^ 2094820544;
                        i11 = -157758602;
                    } else {
                        iM45029 = C19806.m45029("֡᩹") ^ i8;
                        i10 = ((iM45029 ^ i9) * (-18225)) ^ (-331234653);
                        i11 = -1509765145;
                    }
                    break;
                case 1367912115:
                case 2045900543:
                    sArr2 = f62727;
                    i6 = 147;
                    if (C0526.f2219) {
                        iM45029 = C19806.m45029("ᩴᩳ") ^ i8;
                        i10 = ((iM45029 ^ i9) * 20705) ^ (-1127387790);
                        i11 = 801195983;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۫ۜ") ^ i9) * 91;
                        i10 = ((iM45029 ^ i8) * 28383) ^ (-348982867);
                        i11 = 753346522;
                    }
                    break;
                default:
                    i5 = 52649;
                    iM45029 = C19806.m45029("᩶ۗ") ^ i8;
                    i10 = ((iM45029 ^ i9) * (-16139)) ^ 1337001533;
                    i11 = 563116793;
                    break;
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = 1971636414;
        int i5 = C1937.f7317;
        int i6 = C1025.f4800;
        int iM45029 = C19806.m45029("۠֡") ^ i6;
        int i7 = ((iM45029 ^ i5) * (-10467)) ^ 616602158;
        int i8 = -1758119920;
        while (true) {
            i4 = ((((i4 ^ i5) * (-20909)) >> 31) & i7) ^ (iM45029 ^ i8);
            switch (i4) {
                case -1930201508:
                case 1759288038:
                    if (C0526.f2219) {
                        iM45029 = (C19806.m45029("ۘ۠") + i5) * 29;
                        i7 = ((iM45029 ^ i6) * (-15337)) ^ 776243687;
                        i8 = -409734992;
                    } else {
                        iM45029 = C19806.m45029("ۜ۟") ^ i5;
                        i7 = ((iM45029 ^ i6) * 16861) ^ 2099703924;
                        i8 = 1028386334;
                    }
                    break;
                case -1609015669:
                case 741283518:
                    if (C0278.f1572 <= 0) {
                        iM45029 = (C19806.m45029("ۘ۠") + i5) * 29;
                        i7 = ((iM45029 ^ i6) * (-15337)) ^ 776243687;
                        i8 = -409734992;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۚ֡") ^ i6;
                        i7 = ((iM45029 ^ i5) * (-24675)) ^ (-1017625717);
                        i8 = -1200770002;
                    }
                    break;
                case -1604221974:
                case -1474851450:
                    if (CallableC1627.f6528) {
                        iM45029 = ThreadFactoryC3888.m11306("۬ۘ") ^ i5;
                        i7 = ((iM45029 ^ i6) * 6507) ^ (-1674157260);
                        i8 = 605267460;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۫ۤ") ^ i5;
                        i7 = ((iM45029 ^ i6) * 13971) ^ (-1545654065);
                        i8 = -1605829649;
                    }
                    break;
                case -1491098651:
                case -802007352:
                    if (RunnableC1564.f6300) {
                        iM45029 = (i6 - ThreadFactoryC3888.m11306("ۧۜ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i7 = ((iM45029 ^ i5) * 21155) ^ 174983783;
                        i8 = -1290921271;
                    } else {
                        iM45029 = (C19806.m45029("ۧ᩻") + i6) * (-13);
                        i7 = ((iM45029 ^ i5) * 25875) ^ 1973276272;
                        i8 = -963913613;
                    }
                    break;
                case -1354988245:
                case -810611195:
                    break;
                case -1249366707:
                case 984586112:
                    C1377.m4833();
                    if (C3535.m10431() <= 0) {
                        iM45029 = (i5 - ThreadFactoryC3888.m11306("ۛۡ")) * 7;
                        i7 = ((iM45029 ^ i6) * 15249) ^ 1678476852;
                        i8 = 583443560;
                    } else {
                        iM45029 = (i6 - ThreadFactoryC3888.m11306("ۧۜ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i7 = ((iM45029 ^ i5) * 21155) ^ 174983783;
                        i8 = -1290921271;
                    }
                    break;
                case -1082560325:
                case 1256101940:
                    if (C0050.f912 <= 0) {
                        iM45029 = (i5 - ThreadFactoryC3888.m11306("ۛۡ")) * 7;
                        i7 = ((iM45029 ^ i6) * 15249) ^ 1678476852;
                        i8 = 583443560;
                    } else {
                        iM45029 = (i5 - ThreadFactoryC3888.m11306("۬ۛ")) * 47;
                        i7 = ((iM45029 ^ i6) * (-15481)) ^ 1914548310;
                        i8 = -529578937;
                    }
                    break;
                case -809009233:
                case 721799369:
                    C19806.m45024();
                    C2642.m8171();
                    break;
                case -688439056:
                case -172449799:
                    if (C1398.m4895() <= 0) {
                        iM45029 = (C19806.m45029("ۘ۠") + i5) * 29;
                        i7 = ((iM45029 ^ i6) * (-15337)) ^ 776243687;
                        i8 = -409734992;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֡ۙ") ^ i6;
                        i7 = ((iM45029 ^ i5) * 13515) ^ 726537566;
                        i8 = 1179927118;
                    }
                    break;
                case -274402553:
                case 1199838750:
                    if (C0962.f3784) {
                        iM45029 = (i6 - ThreadFactoryC3888.m11306("ۧۜ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i7 = ((iM45029 ^ i5) * 21155) ^ 174983783;
                        i8 = -1290921271;
                    } else {
                        iM45029 = (C19806.m45029("֨ۘ") ^ i6) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i7 = ((iM45029 ^ i5) * 19249) ^ 2135323384;
                        i8 = 2013714021;
                    }
                    break;
                case 247450122:
                case 298672184:
                    if (C0962.f3784) {
                        iM45029 = (i6 - C19806.m45029("۠ܰ")) * 17;
                        i7 = ((iM45029 ^ i5) * (-22491)) ^ (-432299129);
                        i8 = 1850379554;
                    } else {
                        iM45029 = C19806.m45029("ۘ֫") ^ i5;
                        i7 = ((iM45029 ^ i6) * (-24243)) ^ 1124524744;
                        i8 = -946619904;
                    }
                    break;
                case 1108465392:
                case 1614190704:
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM45029 = (i5 - C19806.m45029("ۜ᩻")) * (-31);
                        i7 = ((iM45029 ^ i6) * 14385) ^ (-1802131901);
                        i8 = 1703402678;
                    } else {
                        iM45029 = (C19806.m45029("ۘ۠") + i5) * 29;
                        i7 = ((iM45029 ^ i6) * (-15337)) ^ 776243687;
                        i8 = -409734992;
                    }
                    break;
                case 1141043123:
                case 1357353561:
                    if (C1875.f7103 < 0) {
                        iM45029 = (C19806.m45029("ۘ۠") + i5) * 29;
                        i7 = ((iM45029 ^ i6) * (-15337)) ^ 776243687;
                        i8 = -409734992;
                    } else {
                        iM45029 = (i6 - ThreadFactoryC3888.m11306("ۧۜ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i7 = ((iM45029 ^ i5) * 21155) ^ 174983783;
                        i8 = -1290921271;
                    }
                    break;
                case 1274303451:
                case 1382167861:
                    if (!C3286.f12186) {
                        iM45029 = (i5 - ThreadFactoryC3888.m11306("ۛۡ")) * 7;
                        i7 = ((iM45029 ^ i6) * 15249) ^ 1678476852;
                        i8 = 583443560;
                    } else {
                        iM45029 = (i6 - C19806.m45029("۠ܰ")) * 17;
                        i7 = ((iM45029 ^ i5) * (-22491)) ^ (-432299129);
                        i8 = 1850379554;
                    }
                    break;
                case 1407315441:
                case 1601820628:
                    RunnableC3388.m10064();
                    C1875.m6086();
                    iM45029 = (i6 - ThreadFactoryC3888.m11306("ۧۜ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                    i7 = ((iM45029 ^ i5) * 21155) ^ 174983783;
                    i8 = -1290921271;
                    break;
                default:
                    if (C1148.m4232() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۫ۤ") ^ i5;
                        i7 = ((iM45029 ^ i6) * 13971) ^ (-1545654065);
                        i8 = -1605829649;
                    } else {
                        iM45029 = C19806.m45029("ۜۨ") ^ i6;
                        i7 = ((iM45029 ^ i5) * 6653) ^ 1604810233;
                        i8 = -1703954569;
                    }
                    break;
            }
            return;
        }
    }

    public ViewOnClickListenerC19497() {
        ArrayList arrayList = null;
        int i = 818158538;
        int i2 = C1668.f6641;
        int i3 = C1025.f4800;
        int iM11306 = (i3 - ThreadFactoryC3888.m11306("᩸֫")) * 19;
        int i4 = ((iM11306 ^ i2) * 14743) ^ (-1244355845);
        int i5 = 697841927;
        while (true) {
            i = ((((i ^ i2) * 13261) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2121537843:
                case 535665661:
                    if (C3722.f13525 <= 0) {
                        iM11306 = C19806.m45029("۫ۗ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-20581)) ^ (-1499670862);
                        i5 = 1839066512;
                    } else {
                        iM11306 = (C19806.m45029("ܶ᩷") ^ i3) * (-19);
                        i4 = ((iM11306 ^ i2) * 11901) ^ (-1373190056);
                        i5 = 1331671620;
                    }
                    break;
                case -2120024555:
                case 1433395347:
                    arrayList = new ArrayList();
                    if (C1148.f5161 <= 0) {
                        iM11306 = (C19806.m45029("֫ۡ") ^ i2) * (-15);
                        i4 = ((iM11306 ^ i3) * (-29129)) ^ (-1059111849);
                        i5 = 1582694044;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֨᩷") ^ i2;
                        i4 = ((iM11306 ^ i3) * 14113) ^ (-1792453809);
                        i5 = 384943005;
                    }
                    break;
                case -1669344549:
                case 242535487:
                    if (C7105.f23796 >= 0) {
                        iM11306 = C19806.m45029("۫ۗ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-20581)) ^ (-1499670862);
                        i5 = 1839066512;
                    } else {
                        iM11306 = C19806.m45029("ۧۖ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-4967)) ^ 849698207;
                        i5 = -1607338724;
                    }
                    break;
                case -1601848210:
                case 1104551059:
                    if (C3577.f13150 >= 0) {
                        iM11306 = C19806.m45029("۫ۗ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-20581)) ^ (-1499670862);
                        i5 = 1839066512;
                    } else {
                        iM11306 = (i3 - C19806.m45029("۟ܶ")) * 79;
                        i4 = ((iM11306 ^ i2) * 4653) ^ (-698986420);
                        i5 = -639703767;
                    }
                    break;
                case -1241100746:
                case 1399152340:
                    if (C1460.f5948 >= 0) {
                        iM11306 = (C19806.m45029("֫ۡ") ^ i2) * (-15);
                        i4 = ((iM11306 ^ i3) * (-29129)) ^ (-1059111849);
                        i5 = 1582694044;
                    } else {
                        iM11306 = (i3 - C19806.m45029("ܶ֡")) * (-19);
                        i4 = ((iM11306 ^ i2) * (-3111)) ^ 1598782844;
                        i5 = -1809639911;
                    }
                    break;
                case -1121139693:
                case -458069675:
                    C3577.m10565();
                    C1066.m4023();
                    iM11306 = (C19806.m45029("ܳۨ") ^ i2) * 89;
                    i4 = ((iM11306 ^ i3) * (-22931)) ^ 1372327771;
                    i5 = -1897033969;
                    break;
                case -1085696124:
                case 1887493404:
                    this.f62730 = arrayList;
                    if (C1025.f4800 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۤᩳ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-32535)) ^ (-2130317675);
                        i5 = -2083235308;
                    } else {
                        iM11306 = (C19806.m45029("۟۫") ^ i2) * (-61);
                        i4 = ((iM11306 ^ i3) * 16311) ^ (-1928385374);
                        i5 = -1155958620;
                    }
                    break;
                case -846965518:
                case 483903663:
                    if (C1025.m3861() <= 0) {
                        iM11306 = C19806.m45029("۫ۗ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-20581)) ^ (-1499670862);
                        i5 = 1839066512;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܺ֨") ^ i2) * (-83);
                        i4 = ((iM11306 ^ i3) * (-26019)) ^ 1388111584;
                        i5 = -344195795;
                    }
                    break;
                case -210313816:
                case 1098991589:
                    if (C2788.f10625 < 0) {
                        iM11306 = (i3 - C19806.m45029("ܶ֡")) * (-19);
                        i4 = ((iM11306 ^ i2) * (-3111)) ^ 1598782844;
                        i5 = -1809639911;
                    } else {
                        iM11306 = C19806.m45029("۫ۗ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-20581)) ^ (-1499670862);
                        i5 = 1839066512;
                    }
                    break;
                case -98939413:
                case 1992147445:
                    if (C1461.f5957 <= 0) {
                        iM11306 = (i3 - C19806.m45029("ܶ֡")) * (-19);
                        i4 = ((iM11306 ^ i2) * (-3111)) ^ 1598782844;
                        i5 = -1809639911;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܶۘ") + i3) * (-11);
                        i4 = ((iM11306 ^ i2) * 1881) ^ (-318495090);
                        i5 = -1808841154;
                    }
                    break;
                case -88923258:
                case 1782921346:
                    if (C0526.f2219) {
                        iM11306 = C19806.m45029("۫ۗ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-20581)) ^ (-1499670862);
                        i5 = 1839066512;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֡᩸") + i2) * (-121);
                        i4 = ((iM11306 ^ i3) * (-7357)) ^ (-177401183);
                        i5 = -1667407375;
                    }
                    break;
                case 135591984:
                case 1493971866:
                    if (RunnableC1606.f6488 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۤᩳ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-32535)) ^ (-2130317675);
                        i5 = -2083235308;
                    } else {
                        iM11306 = (C19806.m45029("᩶᩺") + i3) * 39;
                        i4 = ((iM11306 ^ i2) * (-11107)) ^ (-933188433);
                        i5 = 1796798219;
                    }
                    break;
                case 385401037:
                case 1812408098:
                    C1460.m5050();
                    if (C1461.f5957 > 0) {
                        iM11306 = C19806.m45029("۫ۗ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-20581)) ^ (-1499670862);
                        i5 = 1839066512;
                    } else {
                        iM11306 = (C19806.m45029("ܳۨ") ^ i2) * 89;
                        i4 = ((iM11306 ^ i3) * (-22931)) ^ 1372327771;
                        i5 = -1897033969;
                    }
                    break;
                case 474162239:
                case 662710005:
                    C0962.m3746();
                    throw new RuntimeException();
                case 1490919397:
                case 1559867709:
                    this.f62734 = true;
                    return;
                default:
                    if (C2124.f7782 <= 0) {
                        iM11306 = (C19806.m45029("ܳۨ") ^ i2) * 89;
                        i4 = ((iM11306 ^ i3) * (-22931)) ^ 1372327771;
                        i5 = -1897033969;
                    } else {
                        iM11306 = (C19806.m45029("᩵ۡ") ^ i2) * (-83);
                        i4 = ((iM11306 ^ i3) * 25241) ^ (-1097631012);
                        i5 = -1992678443;
                    }
                    break;
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = 857958040;
        int i5 = RunnableC3388.f12514;
        int i6 = C1066.f4915;
        int iM11306 = ThreadFactoryC3888.m11306("֨֫") ^ i5;
        int i7 = ((iM11306 ^ i6) * 31487) ^ (-894439357);
        int i8 = 1369094880;
        while (true) {
            i4 = ((((i4 ^ i6) * (-6885)) >> 31) & i7) ^ (iM11306 ^ i8);
            switch (i4) {
                case -2009958863:
                case -811925924:
                    if (C19806.f63586) {
                        iM11306 = (i6 - C19806.m45029("ܺۛ")) * (-69);
                        i7 = ((iM11306 ^ i5) * (-18673)) ^ (-1482210064);
                        i8 = -1794225292;
                    } else {
                        iM11306 = (i6 - C19806.m45029("ۖ᩵")) * (-101);
                        i7 = ((iM11306 ^ i5) * 11055) ^ 333243401;
                        i8 = -669523154;
                    }
                    break;
                case -1420750655:
                case 2099756902:
                    if (ThreadFactoryC3888.m11300() <= 0) {
                        iM11306 = C19806.m45029("ܶ֨") ^ i6;
                        i7 = ((iM11306 ^ i5) * (-12607)) ^ (-1985480465);
                        i8 = -1698743238;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۤ۟") ^ i6;
                        i7 = ((iM11306 ^ i5) * 5861) ^ (-990888192);
                        i8 = 636769224;
                    }
                    break;
                case -1336680950:
                case -426651284:
                    if (C0817.m3399()) {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩴۖ") + i6) * (-43);
                        i7 = ((iM11306 ^ i5) * 22685) ^ 1046264638;
                        i8 = -742864120;
                    } else {
                        iM11306 = (i5 - ThreadFactoryC3888.m11306("ۢᩴ")) * 43;
                        i7 = ((iM11306 ^ i6) * 30693) ^ 643810187;
                        i8 = -2136333027;
                    }
                    break;
                case -751939121:
                case 1078503133:
                    if (C1668.f6641 >= 0) {
                        iM11306 = C19806.m45029("ܶ֨") ^ i6;
                        i7 = ((iM11306 ^ i5) * (-12607)) ^ (-1985480465);
                        i8 = -1698743238;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۨ᩹") ^ i5;
                        i7 = ((iM11306 ^ i6) * 18635) ^ (-587772714);
                        i8 = -96544492;
                    }
                    break;
                case -617665797:
                case -84575066:
                    if (C2642.m8171() != 0) {
                        iM11306 = (i6 - C19806.m45029("ܺۛ")) * (-69);
                        i7 = ((iM11306 ^ i5) * (-18673)) ^ (-1482210064);
                        i8 = -1794225292;
                    } else {
                        iM11306 = C19806.m45029("ܰۤ") ^ i6;
                        i7 = ((iM11306 ^ i5) * 5881) ^ (-785855846);
                        i8 = -823272421;
                    }
                    break;
                case -384407025:
                case -307372551:
                    if (C19806.f63586) {
                        iM11306 = (i5 - ThreadFactoryC3888.m11306("ۢᩴ")) * 43;
                        i7 = ((iM11306 ^ i6) * 30693) ^ 643810187;
                        i8 = -2136333027;
                    } else {
                        iM11306 = (C19806.m45029("ܿۗ") + i5) * (-93);
                        i7 = ((iM11306 ^ i6) * 405) ^ 1302900769;
                        i8 = 2143667817;
                    }
                    break;
                case -16519066:
                case 1919965866:
                    C1461.m5080();
                    if (!C1377.f5749) {
                        iM11306 = (i5 - ThreadFactoryC3888.m11306("ۢᩴ")) * 43;
                        i7 = ((iM11306 ^ i6) * 30693) ^ 643810187;
                        i8 = -2136333027;
                    } else {
                        iM11306 = (i6 - C19806.m45029("ܺۛ")) * (-69);
                        i7 = ((iM11306 ^ i5) * (-18673)) ^ (-1482210064);
                        i8 = -1794225292;
                    }
                    break;
                case -5800188:
                case 87445563:
                    if (C10634.f36300 >= 0) {
                        iM11306 = C19806.m45029("ܶ֨") ^ i6;
                        i7 = ((iM11306 ^ i5) * (-12607)) ^ (-1985480465);
                        i8 = -1698743238;
                    } else {
                        iM11306 = (C19806.m45029("ᩴ۬") + i5) * (-69);
                        i7 = ((iM11306 ^ i6) * (-24837)) ^ (-495163961);
                        i8 = -2056114348;
                    }
                    break;
                case 25773195:
                case 1884923323:
                    if (!C2332.f8260) {
                        iM11306 = (C19806.m45029("ۜۨ") ^ i6) * 7;
                        i7 = ((iM11306 ^ i5) * 27881) ^ 169780255;
                        i8 = -1332713040;
                    } else {
                        iM11306 = (i5 - ThreadFactoryC3888.m11306("ۢᩴ")) * 43;
                        i7 = ((iM11306 ^ i6) * 30693) ^ 643810187;
                        i8 = -2136333027;
                    }
                    break;
                case 48278484:
                case 166113651:
                    C0278.m1789();
                    break;
                case 178943954:
                case 1038604892:
                    if (!C19806.f63586) {
                        iM11306 = C19806.m45029("ۘ۠") ^ i5;
                        i7 = ((iM11306 ^ i6) * (-27575)) ^ 2113640006;
                        i8 = -1663008413;
                    } else {
                        iM11306 = (C19806.m45029("ۜۨ") ^ i6) * 7;
                        i7 = ((iM11306 ^ i5) * 27881) ^ 169780255;
                        i8 = -1332713040;
                    }
                    break;
                case 454052213:
                case 996339096:
                    if (C1875.f7103 >= 0) {
                        iM11306 = (i6 - C19806.m45029("ܺۛ")) * (-69);
                        i7 = ((iM11306 ^ i5) * (-18673)) ^ (-1482210064);
                        i8 = -1794225292;
                    } else {
                        iM11306 = C19806.m45029("ۚܿ") ^ i6;
                        i7 = ((iM11306 ^ i5) * (-16849)) ^ 228778601;
                        i8 = 2066210201;
                    }
                    break;
                case 827096620:
                case 1681840186:
                    this.f62733 = true;
                    break;
                case 935420390:
                case 1390941842:
                    if (C3535.f13026 <= 0) {
                        iM11306 = (i6 - C19806.m45029("ܺۛ")) * (-69);
                        i7 = ((iM11306 ^ i5) * (-18673)) ^ (-1482210064);
                        i8 = -1794225292;
                    } else {
                        iM11306 = C19806.m45029("ۖ֡") ^ i5;
                        i7 = ((iM11306 ^ i6) * 17117) ^ (-394524433);
                        i8 = 1693799570;
                    }
                    break;
                case 973432184:
                case 2025508254:
                    C0671.m3008();
                    iM11306 = C19806.m45029("ۘ۠") ^ i5;
                    i7 = ((iM11306 ^ i6) * (-27575)) ^ 2113640006;
                    i8 = -1663008413;
                    break;
                default:
                    if (C0216.f1393 != 0) {
                        iM11306 = (C19806.m45029("ۜۨ") ^ i6) * 7;
                        i7 = ((iM11306 ^ i5) * 27881) ^ 169780255;
                        i8 = -1332713040;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۠ۙ") ^ i5;
                        i7 = ((iM11306 ^ i6) * 7415) ^ 395713772;
                        i8 = -857195308;
                    }
                    break;
            }
            return;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 53161. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // l.AbstractActivityC12483, l.ActivityC4866, l.ActivityC19126, l.ActivityC1086, l.ActivityC16858, android.app.Activity
    public final void onCreate(android.os.Bundle r56) {
        /*
            Method dump skipped, instruction units count: 5316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC19497.onCreate(android.os.Bundle):void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44548(ViewOnClickListenerC19497 viewOnClickListenerC19497) {
        C11986 c11986 = null;
        C10700 c10700M34330 = null;
        Iterator itM9863 = null;
        C8208 c8208 = null;
        C4929 c4929 = null;
        String strM13716 = null;
        C23400 c23400 = null;
        C10948 c10948 = null;
        String strM51534 = null;
        int i = -611808605;
        int i2 = C1977.f7413;
        int i3 = ThreadFactoryC3888.f14547;
        int iM45029 = C19806.m45029("᩻֨") ^ i2;
        int i4 = ((iM45029 ^ i3) * 3567) ^ 103911682;
        int i5 = -745854191;
        while (true) {
            i = ((((i ^ i3) * 703) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2121429992:
                case -1174231751:
                    c11986 = viewOnClickListenerC19497.f62729;
                    if (C1977.f7413 <= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩶᩶")) * (-71);
                        i4 = ((iM45029 ^ i2) * (-28167)) ^ 560051951;
                        i5 = -1284189006;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۗܺ") ^ i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM45029 ^ i2) * 27007) ^ (-1861605098);
                        i5 = 966666610;
                    }
                    break;
                case -2100632687:
                case -655918126:
                    strM13716 = c4929.m13716();
                    if (C0629.f2722 <= 0) {
                        iM45029 = (C19806.m45029("֡ۜ") + i2) * (-89);
                        i4 = ((iM45029 ^ i3) * 1075) ^ 881925145;
                        i5 = -1949488807;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۫ۨ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 32261) ^ 810209217;
                        i5 = -1179571144;
                    }
                    break;
                case -2027994412:
                case 1712248572:
                    c4929 = c8208.f28583;
                    if (C3286.f12186) {
                        iM45029 = (C19806.m45029("֡ۜ") + i2) * (-89);
                        i4 = ((iM45029 ^ i3) * 1075) ^ 881925145;
                        i5 = -1949488807;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܿ۠") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-21743)) ^ 1191707474;
                        i5 = -1964899881;
                    }
                    break;
                case -2006432113:
                case 753854:
                    if (C1460.m5050() != 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩶᩶")) * (-71);
                        i4 = ((iM45029 ^ i2) * (-28167)) ^ 560051951;
                        i5 = -1284189006;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ۗۨ")) * (-25);
                        i4 = ((iM45029 ^ i3) * (-14983)) ^ 579499314;
                        i5 = -466717525;
                    }
                    break;
                case -1958296846:
                case -498734301:
                    C1419.m4968(c10948, strM51534);
                    if (C2249.f8050 >= 0) {
                        iM45029 = (C19806.m45029("֡ۜ") + i2) * (-89);
                        i4 = ((iM45029 ^ i3) * 1075) ^ 881925145;
                        i5 = -1949488807;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۤ᩻") ^ i2;
                        i4 = ((iM45029 ^ i3) * 31705) ^ 60276251;
                        i5 = 165308274;
                    }
                    break;
                case -1953150850:
                case -1711160313:
                    ViewTreeObserverOnPreDrawListenerC3327.m9874();
                    C2124.m6673();
                    break;
                case -1569671431:
                case -686531328:
                    viewOnClickListenerC19497.f62733 = true;
                    break;
                case -1512432015:
                case -1439486589:
                    C1875.m6086();
                    C10634.m26820();
                    iM45029 = ThreadFactoryC3888.m11306("ۨܿ") ^ i3;
                    i4 = ((iM45029 ^ i2) * 15361) ^ 174432942;
                    i5 = -571072723;
                    break;
                case -1347914608:
                case -973181363:
                    c10700M34330 = C14228.m34330(C0962.m3741(c11986));
                    if (c10700M34330 == null) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ܽۘ")) * (-91);
                        i4 = ((iM45029 ^ i2) * (-32271)) ^ 320681467;
                        i5 = -1582143784;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("᩻ۤ")) * (-31);
                        i4 = ((iM45029 ^ i3) * 22409) ^ (-1612394539);
                        i5 = 887182033;
                    }
                    break;
                case -1335841656:
                case 626489482:
                    itM9863 = ViewTreeObserverOnPreDrawListenerC3327.m9863(viewOnClickListenerC19497.f62730);
                    iM45029 = (C19806.m45029("ۚۖ") ^ i2) * 119;
                    i4 = ((iM45029 ^ i3) * (-26717)) ^ (-901967307);
                    i5 = -444271948;
                    break;
                case -1209815507:
                case 288500319:
                    c8208 = (C8208) C0278.m1776(itM9863);
                    if (C7105.f23796 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܿܰ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-9269)) ^ (-1827804983);
                        i5 = -130656298;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۢ᩹") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-25889)) ^ 799948257;
                        i5 = -780392697;
                    }
                    break;
                case -1204075370:
                case 608441049:
                    RunnableC0195.m1431();
                    if (!C2704.f10408) {
                        iM45029 = ThreadFactoryC3888.m11306("ۨܿ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 15361) ^ 174432942;
                        i5 = -571072723;
                    } else {
                        iM45029 = (C19806.m45029("ۚ᩻") + i2) * (-33);
                        i4 = ((iM45029 ^ i3) * (-3731)) ^ (-1852099530);
                        i5 = 287776135;
                    }
                    break;
                case -1111222626:
                case 407423269:
                    if (C1937.f7317 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܿܰ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-9269)) ^ (-1827804983);
                        i5 = -130656298;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܰۡ") + i2) * (-123);
                        i4 = ((iM45029 ^ i3) * 5283) ^ 990891181;
                        i5 = -553757388;
                    }
                    break;
                case -989691867:
                case 430344974:
                    if (RunnableC1895.m6170() != 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩶᩶")) * (-71);
                        i4 = ((iM45029 ^ i2) * (-28167)) ^ 560051951;
                        i5 = -1284189006;
                    } else {
                        iM45029 = C19806.m45029("ۡܰ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-3223)) ^ (-6776614);
                        i5 = -1818413018;
                    }
                    break;
                case -735790887:
                case 2080439164:
                    C2249.m6915();
                    if (C2871.f10837 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܿܰ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-9269)) ^ (-1827804983);
                        i5 = -130656298;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۨܿ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 15361) ^ 174432942;
                        i5 = -571072723;
                    }
                    break;
                case -508381386:
                case -499955299:
                    c10948 = c8208.f28586;
                    strM51534 = c23400.m51534();
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = (C19806.m45029("֡ۜ") + i2) * (-89);
                        i4 = ((iM45029 ^ i3) * 1075) ^ 881925145;
                        i5 = -1949488807;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۚۤ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-16125)) ^ (-1446143601);
                        i5 = -1272530323;
                    }
                    break;
                case -347978667:
                case 1842090455:
                    break;
                case -271418527:
                case 1916930289:
                    c23400 = (C23400) C2332.m7077(c10700M34330.f36512, strM13716);
                    if (c23400 != null) {
                        iM45029 = (i2 - C19806.m45029("۠᩻")) * (-17);
                        i4 = ((iM45029 ^ i3) * (-19901)) ^ (-235561502);
                        i5 = 1812120753;
                    } else {
                        iM45029 = (C19806.m45029("ۚۖ") ^ i2) * 119;
                        i4 = ((iM45029 ^ i3) * (-26717)) ^ (-901967307);
                        i5 = -444271948;
                    }
                    break;
                case -268429024:
                case 271065054:
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩶᩶")) * (-71);
                        i4 = ((iM45029 ^ i2) * (-28167)) ^ 560051951;
                        i5 = -1284189006;
                    } else {
                        iM45029 = (C19806.m45029("ۚ᩻") + i2) * (-33);
                        i4 = ((iM45029 ^ i3) * (-3731)) ^ (-1852099530);
                        i5 = 287776135;
                    }
                    break;
                case -172992809:
                case 1210097853:
                    if (C3535.f13026 <= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩶᩶")) * (-71);
                        i4 = ((iM45029 ^ i2) * (-28167)) ^ 560051951;
                        i5 = -1284189006;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۖ֨") + i3) * (-51);
                        i4 = ((iM45029 ^ i2) * (-6023)) ^ (-643814661);
                        i5 = 1114140561;
                    }
                    break;
                case 1541343969:
                case 1949789957:
                    C1419.m4968(c8208.f28582, c23400.m51536());
                    iM45029 = (C19806.m45029("ۚۖ") ^ i2) * 119;
                    i4 = ((iM45029 ^ i3) * (-26717)) ^ (-901967307);
                    i5 = -444271948;
                    break;
                default:
                    if (C0962.m3748(itM9863)) {
                        iM45029 = (C19806.m45029("ۛܿ") ^ i2) * (-61);
                        i4 = ((iM45029 ^ i3) * (-6821)) ^ (-1502071330);
                        i5 = -1017254675;
                    } else {
                        iM45029 = C19806.m45029("ۤܺ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 16235) ^ 1449512203;
                        i5 = -2122904622;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a6 A[PHI: r8
      0x00a6: PHI (r8v3 java.lang.String) = (r8v2 java.lang.String), (r8v2 java.lang.String), (r8v2 java.lang.String), (r8v5 java.lang.String) binds: [B:27:0x008e, B:16:0x004c, B:13:0x0045, B:7:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x00fb A[PHI: r7
      0x00fb: PHI (r7v3 l.ۗ֫ۖ) = (r7v2 l.ۗ֫ۖ), (r7v5 l.ۗ֫ۖ) binds: [B:37:0x00f9, B:33:0x00da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0226 A[PHI: r1
      0x0226: PHI (r1v4 l.ۧۖۘ) = (r1v3 l.ۧۖۘ), (r1v2 l.ۧۖۘ), (r1v2 l.ۧۖۘ) binds: [B:63:0x0224, B:18:0x0050, B:16:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x028b  */
    @Override // l.AbstractActivityC12483, l.ActivityC10074, l.ActivityC19126, android.app.Activity
    public final void onDestroy() {
        int iM11306;
        int i;
        C10700 c10700 = null;
        Iterator itM10563 = null;
        C8208 c8208 = null;
        C10948 c10948 = null;
        String strM3407 = null;
        InterfaceC2916 interfaceC2916M10961 = null;
        String strM3408 = null;
        String strM13716 = null;
        int i2 = 1983105603;
        int i3 = C2871.f10837;
        int i4 = C0050.f912;
        int iM45029 = (C19806.m45029("ۙ۬") + i3) * (-101);
        int i5 = ((iM45029 ^ i4) * (-7559)) ^ (-1840183596);
        int i6 = -521888142;
        while (true) {
            int i7 = iM45029 ^ i6;
            C23400 c23400 = null;
            while (true) {
                i2 = ((((i2 ^ i4) * 30133) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2060949225:
                    case 999331877:
                        if (C0962.m3746() < 0) {
                            iM11306 = (ThreadFactoryC3888.m11306("ۙۙ") + i4) * (-81);
                            i5 = ((iM11306 ^ i3) * 23703) ^ (-394335713);
                            i = 1279953767;
                        } else {
                            iM11306 = C19806.m45029("ۡܳ") ^ i3;
                            i5 = ((iM11306 ^ i4) * 1595) ^ 176276336;
                            i = -1678142414;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    case -2045334057:
                    case -936121323:
                        super.onDestroy();
                        if (this.f62734) {
                            iM11306 = (i4 - ThreadFactoryC3888.m11306("֫᩶")) * (-47);
                            i5 = ((iM11306 ^ i3) * 31711) ^ 1966135027;
                            i = 1918677376;
                        } else {
                            iM11306 = C19806.m45029("ۨۜ") ^ i3;
                            i5 = ((iM11306 ^ i4) * (-15643)) ^ (-728146613);
                            i = 1658969709;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    case -1976595511:
                    case -1797700928:
                        strM3407 = C0817.m3407(C3743.m10961(c10948));
                        if (C1066.f4915 > 0) {
                            iM11306 = (ThreadFactoryC3888.m11306("ܳ᩻") + i3) * 19;
                            i5 = ((iM11306 ^ i4) * 25857) ^ 1629573937;
                            i = 1822727523;
                            i7 = iM11306 ^ i;
                        }
                        break;
                    case -1848636808:
                    case 1567465934:
                        if (RunnableC1564.m5348(itM10563)) {
                            iM11306 = (ThreadFactoryC3888.m11306("᩷᩺") + i4) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                            i5 = ((iM11306 ^ i3) * 4031) ^ (-654517051);
                            i = 1717908356;
                        } else {
                            iM11306 = C19806.m45029("ܽܺ") ^ i4;
                            i5 = ((iM11306 ^ i3) * 23427) ^ (-1077919395);
                            i = 1867651379;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    case -1832393786:
                    case 595093325:
                        C14228.m34327(RunnableC1564.m5347(this.f62729), c10700);
                        iM11306 = C19806.m45029("ۨۜ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-15643)) ^ (-728146613);
                        i = 1658969709;
                        i7 = iM11306 ^ i;
                        break;
                    case -1719136180:
                    case -434479686:
                        if (!C0817.f3443) {
                        }
                        c23400 = new C23400();
                        c10948 = c8208.f28586;
                        if (C2249.f8050 >= 0) {
                            iM11306 = (C19806.m45029("᩵᩵") ^ i4) * 91;
                            i5 = ((iM11306 ^ i3) * (-5137)) ^ 414777886;
                            i = -204257069;
                        } else {
                            iM11306 = (ThreadFactoryC3888.m11306("ۛۡ") ^ i4) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                            i5 = ((iM11306 ^ i3) * (-3751)) ^ 680395838;
                            i = 836337987;
                        }
                        i7 = iM11306 ^ i;
                        break;
                        break;
                    case -1648324863:
                    case -1516569965:
                        strM13716 = c8208.f28583.m13716();
                        if (C0962.m3746() < 0) {
                            iM11306 = ThreadFactoryC3888.m11306("ۘۗ") ^ i3;
                            i5 = ((iM11306 ^ i4) * (-22701)) ^ 1418067428;
                            i = 1675217324;
                            i7 = iM11306 ^ i;
                        }
                        break;
                    case -1435143830:
                    case -63235230:
                        RunnableC1606.m5473();
                        C3286.m9798();
                        break;
                    case -1057066831:
                    case 726104767:
                        c23400.m51535(strM3407);
                        if (RunnableC1564.m5345()) {
                            iM11306 = (ThreadFactoryC3888.m11306("᩵ܺ") ^ i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                            i5 = ((iM11306 ^ i4) * 25703) ^ 1609107983;
                            i = 30205276;
                        } else {
                            iM11306 = C19806.m45029("֡ۡ") ^ i3;
                            i5 = ((iM11306 ^ i4) * 26053) ^ (-2016199008);
                            i = 1139304015;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    case -923876831:
                    case 1744675260:
                        if (C2642.f10294 > 0) {
                        }
                        iM11306 = (C19806.m45029("᩵᩵") ^ i4) * 91;
                        i5 = ((iM11306 ^ i3) * (-5137)) ^ 414777886;
                        i = -204257069;
                        i7 = iM11306 ^ i;
                        break;
                    case -804188139:
                    case 479239929:
                        break;
                    case -785841697:
                    case 1069653387:
                        RunnableC1895.m6172(c10700.f36512, strM13716, c23400);
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ܽ۫")) * 73;
                        i5 = ((iM11306 ^ i4) * (-5929)) ^ 483498013;
                        i = -1746706730;
                        i7 = iM11306 ^ i;
                        break;
                    case -519255038:
                    case 1554149839:
                        if (C2704.m8255() <= 0) {
                        }
                        iM11306 = C19806.m45029("ۡܳ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 1595) ^ 176276336;
                        i = -1678142414;
                        i7 = iM11306 ^ i;
                        break;
                    case -250035805:
                    case 1319523208:
                        interfaceC2916M10961 = C3743.m10961(c8208.f28582);
                        if (AbstractC0464.m2313() != 0) {
                            iM11306 = (ThreadFactoryC3888.m11306("᩵ܺ") ^ i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                            i5 = ((iM11306 ^ i4) * 25703) ^ 1609107983;
                            i = 30205276;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("֫֨") ^ i4;
                            i5 = ((iM11306 ^ i3) * (-9245)) ^ 527871161;
                            i = 1360853951;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    case -103524333:
                    case 688478924:
                        C0278.m1789();
                        C1377.m4833();
                        iM11306 = (ThreadFactoryC3888.m11306("ۙۙ") + i4) * (-81);
                        i5 = ((iM11306 ^ i3) * 23703) ^ (-394335713);
                        i = 1279953767;
                        i7 = iM11306 ^ i;
                        break;
                    case 10106317:
                    case 331027906:
                        c10700 = new C10700();
                        if (C7105.f23796 >= 0) {
                            iM11306 = (ThreadFactoryC3888.m11306("ۙۙ") + i4) * (-81);
                            i5 = ((iM11306 ^ i3) * 23703) ^ (-394335713);
                            i = 1279953767;
                        } else {
                            iM11306 = (C19806.m45029("ܺ۫") ^ i3) * (-81);
                            i5 = ((iM11306 ^ i4) * (-17199)) ^ (-1667159612);
                            i = 486633529;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    case 706936606:
                    case 2093208650:
                        itM10563 = C3577.m10563(this.f62730);
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ܽ۫")) * 73;
                        i5 = ((iM11306 ^ i4) * (-5929)) ^ 483498013;
                        i = -1746706730;
                        i7 = iM11306 ^ i;
                        break;
                    case 1034127793:
                    case 1635966558:
                        c8208 = (C8208) C0278.m1776(itM10563);
                        if (C2704.m8255() > 0) {
                            iM11306 = (C19806.m45029("᩸ۢ") ^ i3) * 23;
                            i5 = ((iM11306 ^ i4) * (-20245)) ^ 684743925;
                            i = -1974414362;
                            i7 = iM11306 ^ i;
                        }
                        break;
                    case 1122764919:
                    case 1837664657:
                        c23400.m51537(strM3408);
                        if (C1937.f7317 >= 0) {
                            iM11306 = C19806.m45029("ۡܳ") ^ i3;
                            i5 = ((iM11306 ^ i4) * 1595) ^ 176276336;
                            i = -1678142414;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("᩻֨") ^ i3;
                            i5 = ((iM11306 ^ i4) * 14027) ^ 981454756;
                            i = 791914240;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    case 1386271623:
                    case 1980656824:
                        if (this.f62733) {
                            iM11306 = (ThreadFactoryC3888.m11306("ۖ᩸") + i4) * (-81);
                            i5 = ((iM11306 ^ i3) * (-3073)) ^ 550443862;
                            i = -425469978;
                        } else {
                            iM11306 = C19806.m45029("ۨۜ") ^ i3;
                            i5 = ((iM11306 ^ i4) * (-15643)) ^ (-728146613);
                            i = 1658969709;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    default:
                        strM3408 = C0817.m3407(interfaceC2916M10961);
                        if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                            iM11306 = C19806.m45029("ۡܳ") ^ i3;
                            i5 = ((iM11306 ^ i4) * 1595) ^ 176276336;
                            i = -1678142414;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("ܿ᩶") ^ i4;
                            i5 = ((iM11306 ^ i3) * (-9231)) ^ 1980107038;
                            i = 247884419;
                        }
                        i7 = iM11306 ^ i;
                        break;
                }
                return;
            }
            iM45029 = (ThreadFactoryC3888.m11306("ᩳۤ") ^ i4) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
            i5 = ((iM45029 ^ i3) * 19159) ^ (-513725312);
            i6 = -1510895305;
        }
    }

    /* JADX WARN: Code duplicated, block: B:77:0x0296 A[PHI: r14 r22 r23 r33
      0x0296: PHI (r14v4 short[]) = (r14v3 short[]), (r14v2 short[]) binds: [B:76:0x0294, B:68:0x023e] A[DONT_GENERATE, DONT_INLINE]
      0x0296: PHI (r22v2 int) = (r22v1 int), (r22v3 int) binds: [B:76:0x0294, B:68:0x023e] A[DONT_GENERATE, DONT_INLINE]
      0x0296: PHI (r23v2 int) = (r23v1 int), (r23v3 int) binds: [B:76:0x0294, B:68:0x023e] A[DONT_GENERATE, DONT_INLINE]
      0x0296: PHI (r33v12 java.lang.String) = (r33v10 java.lang.String), (r33v13 java.lang.String) binds: [B:76:0x0294, B:68:0x023e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00cd, code lost:
    
        if (l.C1148.f5161 <= 0) goto L9;
     */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r43) {
        /*
            Method dump skipped, instruction units count: 2546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC19497.onClick(android.view.View):void");
    }
}
