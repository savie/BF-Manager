package l;

import bin.mt.plugin.api.PluginContext;
import bin.mt.plugin.api.preference.PluginPreference;
import com.alipay.sdk.m.y.q;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.Iterator;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ᩳ᩹ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: O3YD */
/* JADX INFO: loaded from: classes5.dex */
public final class C18335 implements PluginPreference.PreferenceScreen {

    /* JADX INFO: renamed from: ۠ܳ᩺, reason: not valid java name and contains not printable characters */
    private static final short[] f58490 = {6805, 3815, 3786, 3790, 3787, 3786, 3805, 3727, 3777, 3776, 3803, 3727, 3785, 3776, 3802, 3777, 3787, 3733, 3727, 4377, -29300, -29266, -29255, -29254, -29255, -29266, -29255, -29262, -29249, -29255, -29188, -29262, -29261, -29272, -29188, -29254, -29261, -29271, -29262, -29256, -29210, -29188};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC19041 f58491;

    @Override // bin.mt.plugin.api.preference.PluginPreference.PreferenceScreen
    public final PluginPreference.PreferenceItem findPreference(String str) {
        ActivityC19041 activityC19041 = null;
        Iterator itM9863 = null;
        AbstractC2896 abstractC2896 = null;
        int i = -339598670;
        int i2 = RunnableC1606.f6488;
        int i3 = C1875.f7103;
        int iM11306 = (ThreadFactoryC3888.m11306("᩻ۛ") + i2) * (-107);
        int i4 = ((iM11306 ^ i3) * 16019) ^ (-80243998);
        int i5 = -126775261;
        while (true) {
            i = ((((i ^ i3) * 18189) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2051823581:
                case -267693:
                    return (PluginPreference.PreferenceItem) abstractC2896.f10930;
                case -2024012649:
                case 969918421:
                    if (C0629.f2722 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۛܰ") ^ i2) * 71;
                        i4 = ((iM11306 ^ i3) * (-32379)) ^ 282159446;
                        i5 = -2035849049;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩵֨") + i2) * (-107);
                        i4 = ((iM11306 ^ i3) * 22633) ^ 861025371;
                        i5 = 97833592;
                    }
                    break;
                case -1879731795:
                case 872211893:
                    if (C0962.f3784) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܽ۫") + i3) * (-83);
                        i4 = ((iM11306 ^ i2) * (-21009)) ^ (-100269998);
                        i5 = 719726095;
                    } else {
                        iM11306 = (C19806.m45029("ܰ۬") + i2) * 79;
                        i4 = ((iM11306 ^ i3) * (-6293)) ^ 197833320;
                        i5 = -1203800737;
                    }
                    break;
                case -1874340448:
                case 468274:
                    if (!C0817.f3443) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܽ۫") + i3) * (-83);
                        i4 = ((iM11306 ^ i2) * (-21009)) ^ (-100269998);
                        i5 = 719726095;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۛܰ") ^ i2) * 71;
                        i4 = ((iM11306 ^ i3) * (-32379)) ^ 282159446;
                        i5 = -2035849049;
                    }
                    break;
                case -1808955760:
                case 286450059:
                    C3535.m10431();
                    if (C0671.f2816 != 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܽ᩻") ^ i3) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM11306 ^ i2) * (-26725)) ^ (-2122846442);
                        i5 = 1680224468;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۬ܺ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 9685) ^ (-2048506414);
                        i5 = -1654443956;
                    }
                    break;
                case -1797541363:
                case -138796233:
                    if (abstractC2896.f10930 == null) {
                        iM11306 = (C19806.m45029("ۚ֫") ^ i3) * (-89);
                        i4 = ((iM11306 ^ i2) * 21551) ^ 1517589387;
                        i5 = -54697125;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܽۡ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 5087) ^ 591997407;
                        i5 = 1784977855;
                    }
                    break;
                case -1732902256:
                case -1129649091:
                    if (C1460.m5058(str, abstractC2896.f10929)) {
                        iM11306 = ThreadFactoryC3888.m11306("ܺ֫") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-21359)) ^ 553233982;
                        i5 = 478926123;
                    } else {
                        iM11306 = (i3 - C19806.m45029("᩻ᩳ")) * (-119);
                        i4 = ((iM11306 ^ i2) * (-11785)) ^ 1868909008;
                        i5 = 1892476778;
                    }
                    break;
                case -1618624257:
                case 410556522:
                    itM9863 = ViewTreeObserverOnPreDrawListenerC3327.m9863(activityC19041.f61591);
                    iM11306 = (i3 - C19806.m45029("᩻ᩳ")) * (-119);
                    i4 = ((iM11306 ^ i2) * (-11785)) ^ 1868909008;
                    i5 = 1892476778;
                    break;
                case -1616886905:
                case -1226377189:
                    if (C2704.f10408) {
                        iM11306 = ThreadFactoryC3888.m11306("᩷֨") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-24649)) ^ 220911207;
                        i5 = 1545484600;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۛܰ") ^ i2) * 71;
                        i4 = ((iM11306 ^ i3) * (-32379)) ^ 282159446;
                        i5 = -2035849049;
                    }
                    break;
                case -1585311211:
                case 2065252842:
                    abstractC2896 = (AbstractC2896) C0278.m1776(itM9863);
                    if (abstractC2896 instanceof C14187) {
                        iM11306 = (i3 - C19806.m45029("᩻ᩳ")) * (-119);
                        i4 = ((iM11306 ^ i2) * (-11785)) ^ 1868909008;
                        i5 = 1892476778;
                    } else {
                        iM11306 = (i3 - C19806.m45029("ۨۧ")) * (-119);
                        i4 = ((iM11306 ^ i2) * (-26589)) ^ (-1971373377);
                        i5 = 272398627;
                    }
                    break;
                case -1571298273:
                case 1924414298:
                    C2477.m7593();
                    C19806.m45024();
                    return null;
                case -1410101980:
                case 33804700:
                    RunnableC1895.m6170();
                    iM11306 = ThreadFactoryC3888.m11306("۬ܺ") ^ i2;
                    i4 = ((iM11306 ^ i3) * 9685) ^ (-2048506414);
                    i5 = -1654443956;
                    break;
                case -1221848956:
                case -526226785:
                    if (RunnableC0195.m1431()) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۘ᩸") ^ i3) * (-5);
                        i4 = ((iM11306 ^ i2) * 759) ^ (-1934520234);
                        i5 = 970400369;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܽ᩻") ^ i3) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM11306 ^ i2) * (-26725)) ^ (-2122846442);
                        i5 = 1680224468;
                    }
                    break;
                case -1178282014:
                case 1422826133:
                    if (C2788.f10625 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܽ۫") + i3) * (-83);
                        i4 = ((iM11306 ^ i2) * (-21009)) ^ (-100269998);
                        i5 = 719726095;
                    } else {
                        iM11306 = C19806.m45029("ܺ᩸") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-31829)) ^ (-426560712);
                        i5 = 690475077;
                    }
                    break;
                case -1163601153:
                case 2046589598:
                    if (C3743.f13569) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩹ܺ") ^ i3) * (-11);
                        i4 = ((iM11306 ^ i2) * (-15935)) ^ 1035974012;
                        i5 = 1798165777;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܽ۫") + i3) * (-83);
                        i4 = ((iM11306 ^ i2) * (-21009)) ^ (-100269998);
                        i5 = 719726095;
                    }
                    break;
                case -1143126797:
                case 33221616:
                    activityC19041 = this.f58491;
                    if (RunnableC1895.f7152) {
                        iM11306 = C19806.m45029("֡᩵") ^ i3;
                        i4 = ((iM11306 ^ i2) * 13253) ^ 507793360;
                        i5 = -213302477;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۬ᩳ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 21823) ^ 877671068;
                        i5 = 2140205695;
                    }
                    break;
                case -955400449:
                case 1406592688:
                    abstractC2896.f10930 = new C21863(activityC19041, abstractC2896);
                    iM11306 = ThreadFactoryC3888.m11306("ܽۡ") ^ i2;
                    i4 = ((iM11306 ^ i3) * 5087) ^ 591997407;
                    i5 = 1784977855;
                    break;
                case -930303213:
                case -345478157:
                    return null;
                case -579511529:
                case 1625590004:
                    if (C0962.m3748(itM9863)) {
                        iM11306 = ThreadFactoryC3888.m11306("ᩴۨ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 26995) ^ 1401355276;
                        i5 = -1798459962;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("۟᩷")) * (-69);
                        i4 = ((iM11306 ^ i3) * 7011) ^ (-437387929);
                        i5 = -1334064941;
                    }
                    break;
                case -65362954:
                case 1193192027:
                    if (C0050.m946() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۬ᩳ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 21823) ^ 877671068;
                        i5 = 2140205695;
                    } else {
                        iM11306 = (C19806.m45029("ܶ֫") ^ i3) * 115;
                        i4 = ((iM11306 ^ i2) * (-4551)) ^ (-1832526489);
                        i5 = -205562659;
                    }
                    break;
                case 925444040:
                case 1320249231:
                    C0817.m3399();
                    if (!C0962.f3784) {
                        iM11306 = ThreadFactoryC3888.m11306("۬ܺ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 9685) ^ (-2048506414);
                        i5 = -1654443956;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۛܰ") ^ i2) * 71;
                        i4 = ((iM11306 ^ i3) * (-32379)) ^ 282159446;
                        i5 = -2035849049;
                    }
                    break;
                case 1372662990:
                case 1917330937:
                    if (C2124.f7782 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۬ܺ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 9685) ^ (-2048506414);
                        i5 = -1654443956;
                    } else {
                        iM11306 = (C19806.m45029("ۢۢ") ^ i2) * 101;
                        i4 = ((iM11306 ^ i3) * (-853)) ^ (-1035891323);
                        i5 = -1508316627;
                    }
                    break;
                default:
                    if (C7105.f23796 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܽ۫") + i3) * (-83);
                        i4 = ((iM11306 ^ i2) * (-21009)) ^ (-100269998);
                        i5 = 719726095;
                    } else {
                        iM11306 = (i2 - C19806.m45029("۟ۘ")) * 95;
                        i4 = ((iM11306 ^ i3) * (-18379)) ^ (-1288126752);
                        i5 = -1620613338;
                    }
                    break;
            }
        }
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.PreferenceScreen
    public final CharSequence getTitle() {
        ActivityC19041 activityC19041 = null;
        CharSequence title = null;
        int i = -1536416711;
        int i2 = C2249.f8050;
        int i3 = C1461.f5957;
        int iM45029 = C19806.m45029("ᩳᩳ") ^ i3;
        int i4 = ((iM45029 ^ i2) * (-5635)) ^ 1466768343;
        int i5 = -195543907;
        while (true) {
            i = ((((i ^ i2) * 4897) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -1959377281:
                case -618203681:
                    return title;
                case -1808183869:
                case -1065520945:
                    if (C2332.f8260) {
                        iM45029 = (ThreadFactoryC3888.m11306("֫ܽ") ^ i2) * (-57);
                        i4 = ((iM45029 ^ i3) * 14431) ^ (-1983875270);
                        i5 = -1579875189;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩸ۡ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 16597) ^ (-1974609151);
                        i5 = 1376712782;
                    }
                    break;
                case -1491887166:
                case 1160587766:
                    C1977.m6356();
                    C0671.m3008();
                    return null;
                case -1418972133:
                case -1111090630:
                    title = activityC19041.getTitle();
                    if (title != null) {
                        iM45029 = (C19806.m45029("֨᩺") + i3) * (-61);
                        i4 = ((iM45029 ^ i2) * (-2809)) ^ 1767618736;
                        i5 = 1686536032;
                    } else {
                        iM45029 = C19806.m45029("᩹ܺ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 21059) ^ 746331699;
                        i5 = 2026007620;
                    }
                    break;
                case -1405202594:
                case 1034328949:
                    activityC19041 = this.f58491;
                    if (C1148.m4232() <= 0) {
                        iM45029 = (C19806.m45029("۫ܺ") + i3) * (-19);
                        i4 = ((iM45029 ^ i2) * 26957) ^ 1501320685;
                        i5 = -1343112686;
                    } else {
                        iM45029 = (i2 - C19806.m45029("᩺ۡ")) * (-45);
                        i4 = ((iM45029 ^ i3) * (-28095)) ^ (-945836203);
                        i5 = -340371734;
                    }
                    break;
                case -1197340982:
                case -343137730:
                    return "";
                case -1147122048:
                case -275873004:
                    if (C0962.f3784) {
                        iM45029 = (C19806.m45029("ܿۗ") + i2) * 123;
                        i4 = ((iM45029 ^ i3) * (-1657)) ^ 1633283774;
                        i5 = 1479984510;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܽ᩺") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-15211)) ^ (-435980860);
                        i5 = -442245820;
                    }
                    break;
                case -995459790:
                case 1293945180:
                    if (C0629.m2907()) {
                        iM45029 = ThreadFactoryC3888.m11306("֨ۜ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 17155) ^ (-1299274897);
                        i5 = 536478046;
                    } else {
                        iM45029 = (C19806.m45029("ܿۗ") + i2) * 123;
                        i4 = ((iM45029 ^ i3) * (-1657)) ^ 1633283774;
                        i5 = 1479984510;
                    }
                    break;
                case -958759247:
                case 652232868:
                    if (C1398.f5802 <= 0) {
                        iM45029 = (C19806.m45029("۫ܺ") + i3) * (-19);
                        i4 = ((iM45029 ^ i2) * 26957) ^ 1501320685;
                        i5 = -1343112686;
                    } else {
                        iM45029 = C19806.m45029("ۨܳ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-11969)) ^ 2065902253;
                        i5 = 804065072;
                    }
                    break;
                case -543538440:
                case 113548564:
                    RunnableC1895.m6170();
                    C2124.m6673();
                    iM45029 = (ThreadFactoryC3888.m11306("ۡۤ") + i2) * 53;
                    i4 = ((iM45029 ^ i3) * (-22327)) ^ (-615845867);
                    i5 = -1852815668;
                    break;
                case -175207049:
                case 1351485962:
                    if (C1377.f5749) {
                        iM45029 = ThreadFactoryC3888.m11306("ۖܿ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-31793)) ^ 1557575936;
                        i5 = 1570759568;
                    } else {
                        iM45029 = (C19806.m45029("۫ܺ") + i3) * (-19);
                        i4 = ((iM45029 ^ i2) * 26957) ^ 1501320685;
                        i5 = -1343112686;
                    }
                    break;
                case -57713359:
                case 100271386:
                    if (C1419.m4973()) {
                        iM45029 = ThreadFactoryC3888.m11306("᩸ۡ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 16597) ^ (-1974609151);
                        i5 = 1376712782;
                    } else {
                        iM45029 = C19806.m45029("ۛܰ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-19891)) ^ (-94737303);
                        i5 = 1415235353;
                    }
                    break;
                case 174653060:
                case 1383991756:
                    C0629.m2907();
                    if (C1377.m4833() != 0) {
                        iM45029 = (C19806.m45029("ۡ᩺") + i2) * 53;
                        i4 = ((iM45029 ^ i3) * (-23577)) ^ 1678212782;
                        i5 = -50887384;
                    } else {
                        iM45029 = (C19806.m45029("۫ܺ") + i3) * (-19);
                        i4 = ((iM45029 ^ i2) * 26957) ^ 1501320685;
                        i5 = -1343112686;
                    }
                    break;
                case 434448741:
                case 1065531969:
                    if (C0050.m946() <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۡۤ") + i2) * 53;
                        i4 = ((iM45029 ^ i3) * (-22327)) ^ (-615845867);
                        i5 = -1852815668;
                    } else {
                        iM45029 = C19806.m45029("᩵᩹") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-27367)) ^ 371090261;
                        i5 = 904827580;
                    }
                    break;
                case 593457583:
                case 672240515:
                    if (!RunnableC1895.f7152) {
                        iM45029 = (C19806.m45029("ۡ᩺") + i2) * 53;
                        i4 = ((iM45029 ^ i3) * (-23577)) ^ 1678212782;
                        i5 = -50887384;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩸ۡ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 16597) ^ (-1974609151);
                        i5 = 1376712782;
                    }
                    break;
                case 674691168:
                case 1888531395:
                    C0797.m3359();
                    if (!C0962.f3784) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۡۤ") + i2) * 53;
                        i4 = ((iM45029 ^ i3) * (-22327)) ^ (-615845867);
                        i5 = -1852815668;
                    } else {
                        iM45029 = (C19806.m45029("۫ܺ") + i3) * (-19);
                        i4 = ((iM45029 ^ i2) * 26957) ^ 1501320685;
                        i5 = -1343112686;
                    }
                    break;
                case 1201638089:
                case 1718767950:
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩸ۡ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 16597) ^ (-1974609151);
                        i5 = 1376712782;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۨۗ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-19139)) ^ 1704600691;
                        i5 = 1743215373;
                    }
                    break;
                default:
                    if (C10634.m26820()) {
                        iM45029 = ThreadFactoryC3888.m11306("᩸ۡ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 16597) ^ (-1974609151);
                        i5 = 1376712782;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۘ᩻") ^ i3) * (-9);
                        i4 = ((iM45029 ^ i2) * (-4505)) ^ 26021052;
                        i5 = 582085553;
                    }
                    break;
            }
        }
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.PreferenceScreen
    public final void setSubtitle(CharSequence charSequence) {
        ActivityC19041 activityC19041 = null;
        C6938 c6938 = null;
        PluginContext pluginContext = null;
        CharSequence charSequenceM6367 = null;
        String str = null;
        int i = 2075091369;
        int i2 = C2642.f10294;
        int i3 = ViewTreeObserverOnPreDrawListenerC3327.f12317;
        int iM11306 = ThreadFactoryC3888.m11306("᩺ۨ") ^ i2;
        int i4 = ((iM11306 ^ i3) * 27377) ^ 666844597;
        int i5 = -1041405043;
        while (true) {
            i = ((((i ^ i3) * 1175) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2033048635:
                case 1677597422:
                    if (C1189.f5284 <= 0) {
                        iM11306 = (i3 - C19806.m45029("ۗ֫")) * 79;
                        i4 = ((iM11306 ^ i2) * 23833) ^ 975756087;
                        i5 = 843664390;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۤ֡") + i2) * 73;
                        i4 = ((iM11306 ^ i3) * (-20795)) ^ (-75092052);
                        i5 = 1885305943;
                    }
                    break;
                case -2007829785:
                case -1436392554:
                    if (C2871.f10837 >= 0) {
                        iM11306 = C19806.m45029("᩶ۨ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-26515)) ^ (-1918717253);
                        i5 = 1507861422;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳ۬") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-7753)) ^ (-397570081);
                        i5 = 621428757;
                    }
                    break;
                case -1642416531:
                case 343116824:
                    charSequenceM6367 = C1977.m6367(pluginContext, str);
                    if (charSequenceM6367 == null) {
                        charSequenceM6367 = charSequence;
                    }
                    iM11306 = C19806.m45029("۠ᩴ") ^ i2;
                    i4 = ((iM11306 ^ i3) * 23645) ^ 1056101919;
                    i5 = -182945144;
                    break;
                case -1561308903:
                case 2090782419:
                    C0797.m3359();
                    if (C10634.m26820()) {
                        iM11306 = (i3 - C19806.m45029("ۗ֫")) * 79;
                        i4 = ((iM11306 ^ i2) * 23833) ^ 975756087;
                        i5 = 843664390;
                    } else {
                        iM11306 = (i3 - C19806.m45029("ۧ۫")) * (-31);
                        i4 = ((iM11306 ^ i2) * 30221) ^ 829667438;
                        i5 = -1864217350;
                    }
                    break;
                case -1487111797:
                case 1376370354:
                    if (C1189.f5284 <= 0) {
                        iM11306 = (i3 - C19806.m45029("ۧ᩷")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM11306 ^ i2) * (-26205)) ^ 1065058829;
                        i5 = 1738561899;
                    } else {
                        iM11306 = C19806.m45029("֫۫") ^ i2;
                        i4 = ((iM11306 ^ i3) * 6399) ^ 470568582;
                        i5 = -1241927924;
                    }
                    break;
                case -1485976185:
                case 160522243:
                    if (C0216.m1576(1, str) == '}') {
                        iM11306 = (i2 - C19806.m45029("ۧۢ")) * (-19);
                        i4 = ((iM11306 ^ i3) * 22639) ^ 825096149;
                        i5 = 966584222;
                    } else {
                        charSequenceM6367 = charSequence;
                        iM11306 = C19806.m45029("۠ᩴ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 23645) ^ 1056101919;
                        i5 = -182945144;
                    }
                    break;
                case -1467954312:
                case 1942692536:
                    if (C3535.f13026 <= 0) {
                        iM11306 = (i3 - C19806.m45029("ۧ᩷")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM11306 ^ i2) * (-26205)) ^ 1065058829;
                        i5 = 1738561899;
                    } else {
                        iM11306 = (C19806.m45029("᩵᩻") + i3) * 31;
                        i4 = ((iM11306 ^ i2) * (-29761)) ^ (-874446966);
                        i5 = 1796111915;
                    }
                    break;
                case -1361113641:
                case 267972115:
                    if (C1461.f5957 > 0) {
                        iM11306 = C19806.m45029("᩶ۨ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-26515)) ^ (-1918717253);
                        i5 = 1507861422;
                    } else {
                        iM11306 = (i3 - C19806.m45029("ۧ᩷")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM11306 ^ i2) * (-26205)) ^ 1065058829;
                        i5 = 1738561899;
                    }
                    break;
                case -1258875700:
                case -933070683:
                    if (C2704.f10408) {
                        iM11306 = C19806.m45029("ۖۤ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-25467)) ^ 387731453;
                        i5 = 245560597;
                    } else {
                        iM11306 = (i3 - C19806.m45029("ۧ᩷")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM11306 ^ i2) * (-26205)) ^ 1065058829;
                        i5 = 1738561899;
                    }
                    break;
                case -862843205:
                case -785067102:
                    if (C1668.f6641 >= 0) {
                        iM11306 = (i3 - C19806.m45029("ۗ֫")) * 79;
                        i4 = ((iM11306 ^ i2) * 23833) ^ 975756087;
                        i5 = 843664390;
                    } else {
                        iM11306 = C19806.m45029("ۨܺ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-17017)) ^ 1055883382;
                        i5 = 716704303;
                    }
                    break;
                case -852517685:
                case -20723475:
                    c6938 = activityC19041.f41645;
                    pluginContext = activityC19041.f61593;
                    if (charSequence instanceof String) {
                        iM11306 = ThreadFactoryC3888.m11306("᩵ۛ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-31609)) ^ (-1334414329);
                        i5 = 111202809;
                    } else {
                        charSequenceM6367 = charSequence;
                        iM11306 = C19806.m45029("۠ᩴ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 23645) ^ 1056101919;
                        i5 = -182945144;
                    }
                    break;
                case -831536368:
                case -360452314:
                    C1419.m4963(c6938, charSequenceM6367);
                    break;
                case -562746855:
                case 347516731:
                    if (RunnableC1895.f7152) {
                        iM11306 = ThreadFactoryC3888.m11306("֨᩹") ^ i2;
                        i4 = ((iM11306 ^ i3) * 14935) ^ (-1370753071);
                        i5 = -754336432;
                    } else {
                        iM11306 = C19806.m45029("᩻᩺") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-17149)) ^ 1998198568;
                        i5 = -1117232004;
                    }
                    break;
                case -223004874:
                case 1206182472:
                    if (RunnableC1606.f6488 >= 0) {
                        iM11306 = C19806.m45029("᩶ۨ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-26515)) ^ (-1918717253);
                        i5 = 1507861422;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩻ۗ") + i2) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM11306 ^ i3) * (-11469)) ^ (-1019750763);
                        i5 = -1934452109;
                    }
                    break;
                case -148306887:
                case 982647030:
                    activityC19041 = this.f58491;
                    if (C1937.m6279() >= 0) {
                        iM11306 = C19806.m45029("᩻᩺") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-17149)) ^ 1998198568;
                        i5 = -1117232004;
                    } else {
                        iM11306 = (i3 - C19806.m45029("᩻ۨ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM11306 ^ i2) * 18505) ^ 225978822;
                        i5 = 982514743;
                    }
                    break;
                case -56344798:
                case 1340417900:
                    str = (String) charSequence;
                    if (C2871.m8641(str) >= 3) {
                        iM11306 = ThreadFactoryC3888.m11306("ۢ᩵") ^ i3;
                        i4 = ((iM11306 ^ i2) * 25751) ^ (-888409873);
                        i5 = 1708747927;
                    } else {
                        charSequenceM6367 = charSequence;
                        iM11306 = C19806.m45029("۠ᩴ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 23645) ^ 1056101919;
                        i5 = -182945144;
                    }
                    break;
                case 748637911:
                case 1418357198:
                    if (C2871.m8652(str, 0) == '{') {
                        iM11306 = (i2 - C19806.m45029("ܶ᩶")) * (-11);
                        i4 = ((iM11306 ^ i3) * 27049) ^ (-701916739);
                        i5 = -1379066495;
                    } else {
                        charSequenceM6367 = charSequence;
                        iM11306 = C19806.m45029("۠ᩴ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 23645) ^ 1056101919;
                        i5 = -182945144;
                    }
                    break;
                case 768348367:
                case 2125896501:
                    if (C0962.f3784) {
                        iM11306 = (i3 - C19806.m45029("ۗ֫")) * 79;
                        i4 = ((iM11306 ^ i2) * 23833) ^ 975756087;
                        i5 = 843664390;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܳۛ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-8817)) ^ (-1239264554);
                        i5 = -300264944;
                    }
                    break;
                case 1182294694:
                case 1484273122:
                    C0050.m946();
                    ThreadFactoryC3888.m11300();
                    iM11306 = (i3 - C19806.m45029("ۧ᩷")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i4 = ((iM11306 ^ i2) * (-26205)) ^ 1065058829;
                    i5 = 1738561899;
                    break;
                case 1778903600:
                case 1926388222:
                    C1937.m6279();
                    break;
                default:
                    C1977.m6356();
                    if (C1066.f4915 > 0) {
                        iM11306 = (i3 - C19806.m45029("ۗ֫")) * 79;
                        i4 = ((iM11306 ^ i2) * 23833) ^ 975756087;
                        i5 = 843664390;
                    } else {
                        iM11306 = (i3 - C19806.m45029("ۧ᩷")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM11306 ^ i2) * (-26205)) ^ 1065058829;
                        i5 = 1738561899;
                    }
                    break;
            }
            return;
        }
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.PreferenceScreen
    public final CharSequence getSubtitle() {
        ActivityC19041 activityC19041 = null;
        CharSequence subtitle = null;
        int i = 1280739627;
        int i2 = C3722.f13525;
        int i3 = C1461.f5957;
        int iM11306 = (ThreadFactoryC3888.m11306("ܺۙ") + i2) * (-5);
        int i4 = ((iM11306 ^ i3) * (-24397)) ^ (-1203507235);
        int i5 = -1459744718;
        while (true) {
            i = ((((i ^ i3) * (-28891)) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2062712815:
                case 1156371567:
                    return subtitle;
                case -2057501572:
                case 1158362435:
                    subtitle = activityC19041.f41645.getSubtitle();
                    if (subtitle != null) {
                        iM11306 = (C19806.m45029("ܺۚ") + i2) * (-27);
                        i4 = ((iM11306 ^ i3) * 20231) ^ (-1989093063);
                        i5 = -1902493069;
                    } else {
                        iM11306 = C19806.m45029("ۗ᩵") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-28141)) ^ (-1901692951);
                        i5 = 1026471766;
                    }
                    break;
                case -1917138661:
                case 461502771:
                    if (C2704.m8255() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܶۧ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-24963)) ^ 928419976;
                        i5 = 1905700866;
                    } else {
                        iM11306 = (C19806.m45029("֨۫") + i2) * (-31);
                        i4 = ((iM11306 ^ i3) * (-10057)) ^ (-1446876891);
                        i5 = 1905027242;
                    }
                    break;
                case -1717224739:
                case 1915442988:
                    if (C1398.f5802 <= 0) {
                        iM11306 = (C19806.m45029("֨۫") + i2) * (-31);
                        i4 = ((iM11306 ^ i3) * (-10057)) ^ (-1446876891);
                        i5 = 1905027242;
                    } else {
                        iM11306 = C19806.m45029("ۙ᩹") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-2405)) ^ 1288282764;
                        i5 = -2029041;
                    }
                    break;
                case -1493435929:
                case 1699439755:
                    return "";
                case -1486845701:
                case 1072976054:
                    if (C1937.m6279() >= 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۛܽ")) * 85;
                        i4 = ((iM11306 ^ i2) * (-29817)) ^ 1683144988;
                        i5 = 1730317224;
                    } else {
                        iM11306 = C19806.m45029("ۗۨ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-31)) ^ (-679260881);
                        i5 = 1979908729;
                    }
                    break;
                case -1417379913:
                case 1554689659:
                    if (C1419.f5860 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۚܿ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-30423)) ^ 822035298;
                        i5 = 2081674445;
                    } else {
                        iM11306 = (C19806.m45029("ܽܳ") + i2) * 109;
                        i4 = ((iM11306 ^ i3) * (-8369)) ^ (-445590814);
                        i5 = 1920820940;
                    }
                    break;
                case -1407772681:
                case 1923016383:
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܶۧ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-24963)) ^ 928419976;
                        i5 = 1905700866;
                    } else {
                        iM11306 = C19806.m45029("ܿۖ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-19469)) ^ (-1329945669);
                        i5 = -1126438288;
                    }
                    break;
                case -1125418971:
                case 225850777:
                    if (C1419.f5860 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܶۧ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-24963)) ^ 928419976;
                        i5 = 1905700866;
                    } else {
                        iM11306 = (C19806.m45029("֨ܳ") ^ i2) * 5;
                        i4 = ((iM11306 ^ i3) * (-24805)) ^ 1137485263;
                        i5 = 1569300309;
                    }
                    break;
                case -1096977344:
                case 70075095:
                    C0526.m2437();
                    return null;
                case -822242035:
                case 1459737587:
                    if (C0962.m3746() >= 0) {
                        iM11306 = (C19806.m45029("֨᩶") ^ i2) * (-75);
                        i4 = ((iM11306 ^ i3) * (-7543)) ^ 236862231;
                        i5 = 407529751;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۜ᩻") ^ i3) * 67;
                        i4 = ((iM11306 ^ i2) * (-11569)) ^ 1512250682;
                        i5 = 1345896843;
                    }
                    break;
                case -420406848:
                case 353301693:
                    if (C1937.f7317 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۚܿ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-30423)) ^ 822035298;
                        i5 = 2081674445;
                    } else {
                        iM11306 = (C19806.m45029("۬᩹") + i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM11306 ^ i2) * (-13687)) ^ (-2129317641);
                        i5 = 988728070;
                    }
                    break;
                case -327518639:
                case -82657588:
                    activityC19041 = this.f58491;
                    if (C1189.f5284 <= 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۛܽ")) * 85;
                        i4 = ((iM11306 ^ i2) * (-29817)) ^ 1683144988;
                        i5 = 1730317224;
                    } else {
                        iM11306 = (C19806.m45029("ۤ᩹") + i2) * 41;
                        i4 = ((iM11306 ^ i3) * 18441) ^ 1644627706;
                        i5 = 1448916660;
                    }
                    break;
                case 703818704:
                case 2028131504:
                    RunnableC1895.m6170();
                    C1066.m4023();
                    iM11306 = (C19806.m45029("֨۫") + i2) * (-31);
                    i4 = ((iM11306 ^ i3) * (-10057)) ^ (-1446876891);
                    i5 = 1905027242;
                    break;
                case 1047983133:
                case 2098545288:
                    if (C2871.f10837 >= 0) {
                        iM11306 = (C19806.m45029("֨᩶") ^ i2) * (-75);
                        i4 = ((iM11306 ^ i3) * (-7543)) ^ 236862231;
                        i5 = 407529751;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܶۧ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-24963)) ^ 928419976;
                        i5 = 1905700866;
                    }
                    break;
                case 1400762194:
                case 1566514677:
                    if (C1148.m4232() <= 0) {
                        iM11306 = (C19806.m45029("֨᩶") ^ i2) * (-75);
                        i4 = ((iM11306 ^ i3) * (-7543)) ^ 236862231;
                        i5 = 407529751;
                    } else {
                        iM11306 = (C19806.m45029("ᩴ᩸") + i3) * (-37);
                        i4 = ((iM11306 ^ i2) * 1925) ^ 1186330095;
                        i5 = 1682509862;
                    }
                    break;
                case 1500330162:
                case 1937056748:
                    if (!RunnableC3388.m10064()) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۛܽ")) * 85;
                        i4 = ((iM11306 ^ i2) * (-29817)) ^ 1683144988;
                        i5 = 1730317224;
                    } else {
                        iM11306 = (C19806.m45029("֨۫") + i2) * (-31);
                        i4 = ((iM11306 ^ i3) * (-10057)) ^ (-1446876891);
                        i5 = 1905027242;
                    }
                    break;
                default:
                    if (C1419.f5860 >= 0) {
                        iM11306 = (C19806.m45029("֨۫") + i2) * (-31);
                        i4 = ((iM11306 ^ i3) * (-10057)) ^ (-1446876891);
                        i5 = 1905027242;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۡ᩷") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-8899)) ^ 1319581935;
                        i5 = -460412368;
                    }
                    break;
            }
        }
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.PreferenceScreen
    public final PluginPreference.PreferenceHeader findHeader(String str) {
        ActivityC19041 activityC19041 = null;
        Iterator itM9863 = null;
        AbstractC2896 abstractC2896 = null;
        C14187 c14187 = null;
        int i = 879569507;
        int i2 = C7105.f23796;
        int i3 = C3660.f13403;
        int iM45029 = C19806.m45029("ܶ֫") ^ i3;
        int i4 = ((iM45029 ^ i2) * (-91)) ^ 289549951;
        int i5 = -312607531;
        while (true) {
            i = ((((i ^ i2) * (-4943)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2092930973:
                case -1590802828:
                    c14187 = (C14187) abstractC2896;
                    if (AbstractC0464.m2315(str, c14187.f10929)) {
                        iM45029 = (C19806.m45029("ۗ۟") ^ i3) * (-85);
                        i4 = ((iM45029 ^ i2) * 26569) ^ (-645090109);
                        i5 = -499673729;
                    } else {
                        iM45029 = C19806.m45029("᩷ۤ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 20145) ^ 513967380;
                        i5 = 1495283157;
                    }
                    break;
                case -2056889308:
                case 1644802587:
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    if (!RunnableC1564.f6300) {
                        iM45029 = (C19806.m45029("֡ۤ") + i2) * (-67);
                        i4 = ((iM45029 ^ i3) * (-8685)) ^ (-88865998);
                        i5 = -1336309580;
                    } else {
                        iM45029 = (C19806.m45029("ܿۖ") ^ i3) * (-71);
                        i4 = ((iM45029 ^ i2) * 4825) ^ 26515516;
                        i5 = -990323446;
                    }
                    break;
                case -1916120739:
                case 1226968048:
                    if (C2871.f10837 >= 0) {
                        iM45029 = (C19806.m45029("ܿۖ") ^ i3) * (-71);
                        i4 = ((iM45029 ^ i2) * 4825) ^ 26515516;
                        i5 = -990323446;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ܿ᩺")) * 57;
                        i4 = ((iM45029 ^ i2) * 19765) ^ 1134006151;
                        i5 = -1927721005;
                    }
                    break;
                case -1824040009:
                case -1548870286:
                    if (RunnableC1564.m5348(itM9863)) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۙ۟") ^ i3) * (-93);
                        i4 = ((iM45029 ^ i2) * (-16315)) ^ (-68216478);
                        i5 = 539151457;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۜ᩸")) * 51;
                        i4 = ((iM45029 ^ i2) * (-7297)) ^ 33940431;
                        i5 = 836590016;
                    }
                    break;
                case -1479429738:
                case 78484695:
                    if (RunnableC1606.f6488 >= 0) {
                        iM45029 = C19806.m45029("᩹᩻") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-20011)) ^ 139373529;
                        i5 = -173745030;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۟᩸") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-16203)) ^ (-1683275115);
                        i5 = -276457223;
                    }
                    break;
                case -1243048062:
                case 2067700098:
                    c14187.f10930 = new C15514(activityC19041, c14187);
                    iM45029 = C19806.m45029("᩻֨") ^ i2;
                    i4 = ((iM45029 ^ i3) * 1817) ^ (-1866093443);
                    i5 = 694069159;
                    break;
                case -1210600578:
                case 599291495:
                    C1066.m4023();
                    iM45029 = (C19806.m45029("ܿۖ") ^ i3) * (-71);
                    i4 = ((iM45029 ^ i2) * 4825) ^ 26515516;
                    i5 = -990323446;
                    break;
                case -1162658840:
                case 1346735029:
                    if (RunnableC1606.f6488 >= 0) {
                        iM45029 = C19806.m45029("ᩴۗ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-16349)) ^ 1749816997;
                        i5 = -712316728;
                    } else {
                        iM45029 = (i3 - C19806.m45029("֨ܰ")) * 59;
                        i4 = ((iM45029 ^ i2) * 589) ^ 1180434846;
                        i5 = -1084970950;
                    }
                    break;
                case -1018215551:
                case 2062760099:
                    if (C1460.f5948 >= 0) {
                        iM45029 = C19806.m45029("ᩴۗ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-16349)) ^ 1749816997;
                        i5 = -712316728;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۢ᩷") ^ i3;
                        i4 = ((iM45029 ^ i2) * 25275) ^ 905260008;
                        i5 = -1553114390;
                    }
                    break;
                case -984758994:
                case -397067860:
                    abstractC2896 = (AbstractC2896) C0216.m1584(itM9863);
                    if (abstractC2896 instanceof C14187) {
                        iM45029 = (C19806.m45029("ۛۚ") + i2) * (-115);
                        i4 = ((iM45029 ^ i3) * (-2247)) ^ (-942807014);
                        i5 = -1748281259;
                    } else {
                        iM45029 = C19806.m45029("᩷ۤ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 20145) ^ 513967380;
                        i5 = 1495283157;
                    }
                    break;
                case -634601855:
                case -482752507:
                    return (PluginPreference.PreferenceHeader) c14187.f10930;
                case -242069797:
                case 286876675:
                    itM9863 = ViewTreeObserverOnPreDrawListenerC3327.m9863(activityC19041.f61591);
                    iM45029 = C19806.m45029("᩷ۤ") ^ i2;
                    i4 = ((iM45029 ^ i3) * 20145) ^ 513967380;
                    i5 = 1495283157;
                    break;
                case -230184509:
                case 1087497542:
                    if (c14187.f10930 == null) {
                        iM45029 = (i2 - C19806.m45029("ۖ֡")) * (-89);
                        i4 = ((iM45029 ^ i3) * (-18481)) ^ 1920577393;
                        i5 = 377656446;
                    } else {
                        iM45029 = C19806.m45029("᩻֨") ^ i2;
                        i4 = ((iM45029 ^ i3) * 1817) ^ (-1866093443);
                        i5 = 694069159;
                    }
                    break;
                case -135010173:
                case 1268986147:
                    if (CallableC1627.f6528) {
                        iM45029 = ThreadFactoryC3888.m11306("ܿۡ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 32473) ^ 1897384702;
                        i5 = -147401297;
                    } else {
                        iM45029 = C19806.m45029("ᩴۗ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-16349)) ^ 1749816997;
                        i5 = -712316728;
                    }
                    break;
                case 106800133:
                case 152374748:
                    return null;
                case 329919927:
                case 885232764:
                    if (C2124.f7782 <= 0) {
                        iM45029 = C19806.m45029("ᩴۗ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-16349)) ^ 1749816997;
                        i5 = -712316728;
                    } else {
                        iM45029 = C19806.m45029("ܰ᩸") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-1805)) ^ 1983021953;
                        i5 = -2092521577;
                    }
                    break;
                case 713022110:
                case 1802044449:
                    C1148.m4232();
                    C0817.m3399();
                    return null;
                case 1028810498:
                case 2042832194:
                    activityC19041 = this.f58491;
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۨᩳ") + i2) * (-33);
                        i4 = ((iM45029 ^ i3) * (-20305)) ^ (-1282213642);
                        i5 = 990252372;
                    } else {
                        iM45029 = C19806.m45029("ۗۘ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-13437)) ^ (-400618497);
                        i5 = -2034786399;
                    }
                    break;
                case 1058816819:
                case 1173435481:
                    if (C1937.f7317 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۨᩳ") + i2) * (-33);
                        i4 = ((iM45029 ^ i3) * (-20305)) ^ (-1282213642);
                        i5 = 990252372;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("֡ܳ")) * 115;
                        i4 = ((iM45029 ^ i3) * 26107) ^ 921397069;
                        i5 = 1292965041;
                    }
                    break;
                case 1109914472:
                case 1418336320:
                    if (C0278.f1572 > 0) {
                        iM45029 = C19806.m45029("᩹᩻") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-20011)) ^ 139373529;
                        i5 = -173745030;
                    } else {
                        iM45029 = (C19806.m45029("֡ۤ") + i2) * (-67);
                        i4 = ((iM45029 ^ i3) * (-8685)) ^ (-88865998);
                        i5 = -1336309580;
                    }
                    break;
                case 1217671483:
                case 1718834575:
                    if (C0216.f1393 != 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۨᩳ") + i2) * (-33);
                        i4 = ((iM45029 ^ i3) * (-20305)) ^ (-1282213642);
                        i5 = 990252372;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۠᩻") + i2) * (-75);
                        i4 = ((iM45029 ^ i3) * (-11243)) ^ (-1436746865);
                        i5 = -1958175775;
                    }
                    break;
                case 1257927055:
                case 2016106179:
                    if (C1460.m5050() != 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۨᩳ") + i2) * (-33);
                        i4 = ((iM45029 ^ i3) * (-20305)) ^ (-1282213642);
                        i5 = 990252372;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۡۧ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 21523) ^ (-1615563485);
                        i5 = -1709112644;
                    }
                    break;
                default:
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    if (!C2332.f8260) {
                        iM45029 = C19806.m45029("ᩴۗ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-16349)) ^ 1749816997;
                        i5 = -712316728;
                    } else {
                        iM45029 = (C19806.m45029("ܿۖ") ^ i3) * (-71);
                        i4 = ((iM45029 ^ i2) * 4825) ^ 26515516;
                        i5 = -990323446;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x01ba A[PHI: r1 r2 r6
      0x01ba: PHI (r1v4 short[]) = (r1v3 short[]), (r1v2 short[]), (r1v2 short[]), (r1v2 short[]) binds: [B:59:0x01b8, B:55:0x019b, B:46:0x0143, B:16:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x01ba: PHI (r2v4 char) = (r2v2 char), (r2v3 char), (r2v2 char), (r2v2 char) binds: [B:59:0x01b8, B:55:0x019b, B:46:0x0143, B:16:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x01ba: PHI (r6v4 short) = (r6v2 short), (r6v2 short), (r6v3 short), (r6v2 short) binds: [B:59:0x01b8, B:55:0x019b, B:46:0x0143, B:16:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x01eb A[PHI: r5
      0x01eb: PHI (r5v5 int) = (r5v2 int), (r5v4 int), (r5v2 int) binds: [B:63:0x01e9, B:50:0x0167, B:15:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x021a A[PHI: r3 r4
      0x021a: PHI (r3v3 short) = (r3v2 short), (r3v2 short), (r3v5 short) binds: [B:67:0x0218, B:28:0x009c, B:7:0x0039] A[DONT_GENERATE, DONT_INLINE]
      0x021a: PHI (r4v3 short) = (r4v2 short), (r4v2 short), (r4v5 short) binds: [B:67:0x0218, B:28:0x009c, B:7:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // bin.mt.plugin.api.preference.PluginPreference.PreferenceScreen
    public final PluginPreference.PreferenceItem requirePreference(String str) {
        int iM11306;
        int i;
        int i2;
        PluginPreference.PreferenceItem preferenceItemFindPreference = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i3 = 0;
        short s3 = 0;
        int i4 = 0;
        int i5 = 1856514068;
        int i6 = C1977.f7413;
        int i7 = C3535.f13026;
        int iM11307 = (i6 - ThreadFactoryC3888.m11306("᩹ۖ")) * (-97);
        int i8 = ((iM11307 ^ i7) * 3369) ^ 296181937;
        int i9 = -1866274272;
        while (true) {
            int i10 = iM11307 ^ i9;
            while (true) {
                i5 = ((((i5 ^ i7) * (-24837)) >> 31) & i8) ^ i10;
                switch (i5) {
                    case -1963336587:
                    case -1137683066:
                        C2871.m8646();
                        C0817.m3399();
                        return null;
                    case -1675931069:
                    case 1102736744:
                        c = 19;
                        if (ThreadFactoryC3888.m11300() <= 0) {
                            iM11306 = (ThreadFactoryC3888.m11306("ۗۜ") + i6) * 33;
                            i = ((iM11306 ^ i7) * 22003) ^ 2108857137;
                            i2 = 1745826140;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("۫᩹") ^ i7;
                            i = ((iM11306 ^ i6) * (-32225)) ^ 201306902;
                            i2 = 556157140;
                        }
                        i10 = iM11306 ^ i2;
                        i8 = i;
                        break;
                    case -1606139381:
                    case 518248929:
                        s3 = 79096;
                        if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                            iM11306 = (ThreadFactoryC3888.m11306("ۗۜ") + i6) * 33;
                            i = ((iM11306 ^ i7) * 22003) ^ 2108857137;
                            i2 = 1745826140;
                        } else {
                            iM11306 = (ThreadFactoryC3888.m11306("᩻ۛ") ^ i6) * (-113);
                            i = ((iM11306 ^ i7) * (-31707)) ^ (-448164152);
                            i2 = -1555422901;
                        }
                        i10 = iM11306 ^ i2;
                        i8 = i;
                        break;
                    case -1493426372:
                    case 1960825354:
                        preferenceItemFindPreference = findPreference(str);
                        if (preferenceItemFindPreference != null) {
                            iM11306 = (ThreadFactoryC3888.m11306("ܺ֫") + i6) * (-49);
                            i = ((iM11306 ^ i7) * 24395) ^ (-1321852276);
                            i2 = 897635161;
                        } else {
                            iM11306 = (i7 - C19806.m45029("ۤۙ")) * (-9);
                            i = ((iM11306 ^ i6) * (-17401)) ^ (-1802973356);
                            i2 = 1443864913;
                        }
                        i10 = iM11306 ^ i2;
                        i8 = i;
                        break;
                    case -1422504086:
                    case 1515698974:
                        AbstractC0464.m2313();
                        C10634.m26820();
                        iM11307 = ThreadFactoryC3888.m11306("ܺܺ") ^ i6;
                        i8 = ((iM11307 ^ i7) * (-2053)) ^ (-1501082550);
                        i9 = -654530895;
                    case -1026123068:
                    case -130738096:
                        if (C19806.m45024()) {
                            iM11306 = ThreadFactoryC3888.m11306("ۨᩳ") ^ i7;
                            i = ((iM11306 ^ i6) * 6177) ^ (-1152841884);
                            i2 = 95909770;
                        } else {
                            iM11306 = (i7 - C19806.m45029("ܳۡ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                            i = ((iM11306 ^ i6) * 29757) ^ (-2091575391);
                            i2 = -1772188193;
                        }
                        i10 = iM11306 ^ i2;
                        i8 = i;
                        break;
                    case -1011784790:
                    case 1808329847:
                        i4 = 48376;
                        iM11306 = (C19806.m45029("ܺᩴ") + i7) * (-21);
                        i = ((iM11306 ^ i6) * (-19955)) ^ 388943805;
                        i2 = 1448695673;
                        i10 = iM11306 ^ i2;
                        i8 = i;
                        break;
                    case -959372330:
                    case 2144213230:
                        sArr = f58490;
                        if (C0629.f2722 <= 0) {
                            iM11306 = (ThreadFactoryC3888.m11306("ۗۜ") + i6) * 33;
                            i = ((iM11306 ^ i7) * 22003) ^ 2108857137;
                            i2 = 1745826140;
                        } else {
                            iM11306 = C19806.m45029("ܿ֨") ^ i6;
                            i = ((iM11306 ^ i7) * (-22829)) ^ 85680445;
                            i2 = -836884082;
                        }
                        i10 = iM11306 ^ i2;
                        i8 = i;
                        break;
                    case -359993884:
                    case 1698275366:
                        i4 = 36316;
                        iM11306 = (C19806.m45029("ܺᩴ") + i7) * (-21);
                        i = ((iM11306 ^ i6) * (-19955)) ^ 388943805;
                        i2 = 1448695673;
                        i10 = iM11306 ^ i2;
                        i8 = i;
                        break;
                    case -148241833:
                    case 1994776717:
                        short[] sArr2 = f58490;
                        if (C0629.f2722 <= 0) {
                            iM11307 = ThreadFactoryC3888.m11306("ܺܺ") ^ i6;
                            i8 = ((iM11307 ^ i7) * (-2053)) ^ (-1501082550);
                            i9 = -654530895;
                        } else if (C3722.f13525 > 0) {
                            if (C0671.f2816 == 0) {
                                throw new IllegalArgumentException(C0252.m1693(C2124.m6685(sArr2, 20, 22, i4), str));
                            }
                            iM11306 = ThreadFactoryC3888.m11306("ۨᩳ") ^ i7;
                            i = ((iM11306 ^ i6) * 6177) ^ (-1152841884);
                            i2 = 95909770;
                            i10 = iM11306 ^ i2;
                            i8 = i;
                        } else {
                            iM11306 = (ThreadFactoryC3888.m11306("۬۫") ^ i7) * (-113);
                            i = ((iM11306 ^ i6) * (-31839)) ^ 1081082588;
                            i2 = -1171753134;
                            i10 = iM11306 ^ i2;
                            i8 = i;
                        }
                        break;
                    case -86330155:
                    case 670423174:
                        if (C1148.f5161 <= 0) {
                            iM11307 = ThreadFactoryC3888.m11306("ܺܺ") ^ i6;
                            i8 = ((iM11307 ^ i7) * (-2053)) ^ (-1501082550);
                            i9 = -654530895;
                        }
                        iM11306 = ThreadFactoryC3888.m11306("ۨᩳ") ^ i7;
                        i = ((iM11306 ^ i6) * 6177) ^ (-1152841884);
                        i2 = 95909770;
                        i10 = iM11306 ^ i2;
                        i8 = i;
                        break;
                    case 87944290:
                    case 2034250114:
                        return preferenceItemFindPreference;
                    case 246752874:
                    case 1300694469:
                        C0278.m1789();
                        if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                            iM11306 = (ThreadFactoryC3888.m11306("ۗۜ") + i6) * 33;
                            i = ((iM11306 ^ i7) * 22003) ^ 2108857137;
                            i2 = 1745826140;
                            i10 = iM11306 ^ i2;
                            i8 = i;
                        }
                        iM11306 = ThreadFactoryC3888.m11306("ۨᩳ") ^ i7;
                        i = ((iM11306 ^ i6) * 6177) ^ (-1152841884);
                        i2 = 95909770;
                        i10 = iM11306 ^ i2;
                        i8 = i;
                        break;
                    case 248690353:
                    case 1558576064:
                        int i11 = s + s2;
                        i3 = i11 * i11;
                        if (C2788.m8472() != 0) {
                            iM11306 = ThreadFactoryC3888.m11306("ۨᩳ") ^ i7;
                            i = ((iM11306 ^ i6) * 6177) ^ (-1152841884);
                            i2 = 95909770;
                        } else {
                            iM11306 = C19806.m45029("᩶᩸") ^ i6;
                            i = ((iM11306 ^ i7) * 5499) ^ 556848937;
                            i2 = -230518451;
                        }
                        i10 = iM11306 ^ i2;
                        i8 = i;
                        break;
                    case 395637746:
                    case 633784970:
                        if (C1066.f4915 <= 0) {
                            iM11307 = (i7 - ThreadFactoryC3888.m11306("֡ۛ")) * 53;
                            i8 = ((iM11307 ^ i6) * (-703)) ^ (-763214814);
                            i9 = -1799232756;
                            break;
                        }
                        iM11307 = ThreadFactoryC3888.m11306("ܺܺ") ^ i6;
                        i8 = ((iM11307 ^ i7) * (-2053)) ^ (-1501082550);
                        i9 = -654530895;
                        break;
                    case 568773118:
                    case 2111451513:
                        if (C1977.f7413 <= 0) {
                            iM11306 = (ThreadFactoryC3888.m11306("۬۫") ^ i7) * (-113);
                            i = ((iM11306 ^ i6) * (-31839)) ^ 1081082588;
                            i2 = -1171753134;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("᩹᩷") ^ i6;
                            i = ((iM11306 ^ i7) * (-15595)) ^ 670588285;
                            i2 = -1439446326;
                        }
                        i10 = iM11306 ^ i2;
                        i8 = i;
                        break;
                    case 1750776503:
                    case 2019916720:
                        if ((s * s3) - i3 <= 0) {
                            iM11306 = ThreadFactoryC3888.m11306("᩻᩺") ^ i7;
                            i = ((iM11306 ^ i6) * 18279) ^ 730931486;
                            i2 = 987419494;
                        } else {
                            iM11306 = (ThreadFactoryC3888.m11306("֨ۚ") ^ i6) * q.h;
                            i = ((iM11306 ^ i7) * (-15317)) ^ (-1467264330);
                            i2 = -818465676;
                        }
                        i10 = iM11306 ^ i2;
                        i8 = i;
                        break;
                    default:
                        s = sArr[c];
                        s2 = 19774;
                        if (C2477.m7593() >= 0) {
                            iM11306 = (ThreadFactoryC3888.m11306("۬۫") ^ i7) * (-113);
                            i = ((iM11306 ^ i6) * (-31839)) ^ 1081082588;
                            i2 = -1171753134;
                        } else {
                            iM11306 = C19806.m45029("ۨ᩺") ^ i7;
                            i = ((iM11306 ^ i6) * (-32385)) ^ 1941500166;
                            i2 = 50673485;
                        }
                        i10 = iM11306 ^ i2;
                        i8 = i;
                        break;
                }
            }
        }
    }

    public C18335(ActivityC19041 activityC19041) {
        this.f58491 = activityC19041;
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.PreferenceScreen
    public final void recreate() {
        ActivityC19041.m43772(this.f58491);
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.PreferenceScreen
    public final void setTitle(CharSequence charSequence) {
        ActivityC19041 activityC19041 = null;
        PluginContext pluginContext = null;
        CharSequence charSequenceM6367 = null;
        String str = null;
        int i = -654397054;
        int i2 = C0278.f1572;
        int i3 = C1066.f4915;
        int iM45029 = C19806.m45029("ۧ۫") ^ i3;
        int i4 = ((iM45029 ^ i2) * 12839) ^ 533121324;
        int i5 = -1701756361;
        while (true) {
            i = ((((i ^ i2) * 28691) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2081330591:
                case 1318273162:
                    activityC19041 = this.f58491;
                    if (C1875.f7103 >= 0) {
                        iM45029 = C19806.m45029("ۨܿ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-5855)) ^ 1756443375;
                        i5 = -236727188;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۤܽ")) * 63;
                        i4 = ((iM45029 ^ i2) * 3509) ^ 1682709820;
                        i5 = -134637804;
                    }
                    break;
                case -2077872082:
                case -979826774:
                    if (C2124.f7782 <= 0) {
                        iM45029 = (i2 - C19806.m45029("ۜۜ")) * (-69);
                        i4 = ((iM45029 ^ i3) * 23299) ^ (-2030168055);
                        i5 = -1114323939;
                    } else {
                        iM45029 = (C19806.m45029("ᩴܶ") ^ i2) * 61;
                        i4 = ((iM45029 ^ i3) * 8443) ^ 1869351160;
                        i5 = 2111042412;
                    }
                    break;
                case -2060277832:
                case 407416341:
                    activityC19041.setTitle(charSequenceM6367);
                    break;
                case -2007597107:
                case 591375237:
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("֫ܳ")) * 39;
                        i4 = ((iM45029 ^ i2) * 16239) ^ (-782278222);
                        i5 = 360942857;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܿ᩹") ^ i2) * 87;
                        i4 = ((iM45029 ^ i3) * 25035) ^ (-993506826);
                        i5 = -1404978659;
                    }
                    break;
                case -1999425072:
                case -651921586:
                    if (ThreadFactoryC3888.m11300() <= 0) {
                        iM45029 = C19806.m45029("ۨܿ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-5855)) ^ 1756443375;
                        i5 = -236727188;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۘᩴ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 18061) ^ (-839360387);
                        i5 = 664752951;
                    }
                    break;
                case -1840817095:
                case 684314773:
                    charSequenceM6367 = C1977.m6367(pluginContext, str);
                    if (charSequenceM6367 == null) {
                        charSequenceM6367 = charSequence;
                    }
                    iM45029 = C19806.m45029("᩺ۚ") ^ i3;
                    i4 = ((iM45029 ^ i2) * (-12253)) ^ (-1653558346);
                    i5 = -527583882;
                    break;
                case -1805705131:
                case -1006672988:
                    if (C3660.f13403 >= 0) {
                        iM45029 = (i2 - C19806.m45029("ۜۜ")) * (-69);
                        i4 = ((iM45029 ^ i3) * 23299) ^ (-2030168055);
                        i5 = -1114323939;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܺ᩻") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-13235)) ^ 476626193;
                        i5 = -1198140871;
                    }
                    break;
                case -1511904289:
                case 1467518502:
                    C1668.m5583();
                    C1419.m4973();
                    break;
                case -1462789222:
                case -850106155:
                    if (C1977.m6362(str, 0) == '{') {
                        iM45029 = ThreadFactoryC3888.m11306("ܰ֨") ^ i3;
                        i4 = ((iM45029 ^ i2) * 8899) ^ 686928572;
                        i5 = 1291427559;
                    } else {
                        charSequenceM6367 = charSequence;
                        iM45029 = C19806.m45029("᩺ۚ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-12253)) ^ (-1653558346);
                        i5 = -527583882;
                    }
                    break;
                case -1350252442:
                case 1458745143:
                    if (C2642.f10294 <= 0) {
                        iM45029 = C19806.m45029("ܰۜ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-12471)) ^ 397585743;
                        i5 = 485249239;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۙܺ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 28795) ^ 308267718;
                        i5 = -1130855007;
                    }
                    break;
                case -1296827744:
                case 1426369232:
                    if (C1460.m5050() != 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("֫ܳ")) * 39;
                        i4 = ((iM45029 ^ i2) * 16239) ^ (-782278222);
                        i5 = 360942857;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܺ᩻") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-13235)) ^ 476626193;
                        i5 = -1198140871;
                    }
                    break;
                case -1058131520:
                case 1740123044:
                    if (C1419.f5860 >= 0) {
                        iM45029 = (i2 - C19806.m45029("ۜۜ")) * (-69);
                        i4 = ((iM45029 ^ i3) * 23299) ^ (-2030168055);
                        i5 = -1114323939;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩻۫") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-2011)) ^ (-1624106987);
                        i5 = -303469197;
                    }
                    break;
                case -924001632:
                case 988331724:
                    if (C0962.f3784) {
                        iM45029 = C19806.m45029("ۨܿ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-5855)) ^ 1756443375;
                        i5 = -236727188;
                    } else {
                        iM45029 = C19806.m45029("᩶ۤ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-18157)) ^ (-1217044978);
                        i5 = 1407678659;
                    }
                    break;
                case -922316353:
                case -17936449:
                    pluginContext = activityC19041.f61593;
                    if (charSequence instanceof String) {
                        iM45029 = (C19806.m45029("ۤۗ") ^ i2) * (-105);
                        i4 = ((iM45029 ^ i3) * (-10201)) ^ 1904882492;
                        i5 = -1473387225;
                    } else {
                        charSequenceM6367 = charSequence;
                        iM45029 = C19806.m45029("᩺ۚ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-12253)) ^ (-1653558346);
                        i5 = -527583882;
                    }
                    break;
                case -835862407:
                case -746540949:
                    if (C0797.f3386) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("֫ܳ")) * 39;
                        i4 = ((iM45029 ^ i2) * 16239) ^ (-782278222);
                        i5 = 360942857;
                    } else {
                        iM45029 = (C19806.m45029("۫᩷") ^ i3) * (-33);
                        i4 = ((iM45029 ^ i2) * (-24693)) ^ 505963575;
                        i5 = -2061509222;
                    }
                    break;
                case -773467783:
                case 1106798059:
                    str = (String) charSequence;
                    if (C1977.m6360(str) >= 3) {
                        iM45029 = C19806.m45029("۠ۜ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 19039) ^ (-1576769372);
                        i5 = -802967474;
                    } else {
                        charSequenceM6367 = charSequence;
                        iM45029 = C19806.m45029("᩺ۚ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-12253)) ^ (-1653558346);
                        i5 = -527583882;
                    }
                    break;
                case -576219510:
                case -13781059:
                    if (C1461.f5957 <= 0) {
                        iM45029 = C19806.m45029("ۨܿ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-5855)) ^ 1756443375;
                        i5 = -236727188;
                    } else {
                        iM45029 = C19806.m45029("ۛۜ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 8773) ^ (-457648500);
                        i5 = -1608125019;
                    }
                    break;
                case -139941518:
                case 1779302243:
                    if (C2788.f10625 >= 0) {
                        iM45029 = C19806.m45029("ܰۜ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-12471)) ^ 397585743;
                        i5 = 485249239;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܺ᩻") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-13235)) ^ 476626193;
                        i5 = -1198140871;
                    }
                    break;
                case 26981916:
                case 2037824094:
                    RunnableC3388.m10064();
                    iM45029 = ThreadFactoryC3888.m11306("ܺ᩻") ^ i2;
                    i4 = ((iM45029 ^ i3) * (-13235)) ^ 476626193;
                    i5 = -1198140871;
                    break;
                case 354263902:
                case 692409329:
                    if (C0278.m1779(1, str) == '}') {
                        iM45029 = (ThreadFactoryC3888.m11306("۟ۡ") ^ i3) * (-95);
                        i4 = ((iM45029 ^ i2) * (-7031)) ^ 849045231;
                        i5 = 371732121;
                    } else {
                        charSequenceM6367 = charSequence;
                        iM45029 = C19806.m45029("᩺ۚ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-12253)) ^ (-1653558346);
                        i5 = -527583882;
                    }
                    break;
                default:
                    if (C3286.f12186) {
                        iM45029 = (i2 - C19806.m45029("ۜۜ")) * (-69);
                        i4 = ((iM45029 ^ i3) * 23299) ^ (-2030168055);
                        i5 = -1114323939;
                    } else {
                        iM45029 = (C19806.m45029("۠᩵") ^ i2) * 33;
                        i4 = ((iM45029 ^ i3) * 2175) ^ (-1783161930);
                        i5 = 536165209;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:65:0x01e9 A[PHI: r1 r3 r4
      0x01e9: PHI (r1v4 short[]) = (r1v3 short[]), (r1v2 short[]), (r1v2 short[]) binds: [B:64:0x01e7, B:56:0x019a, B:11:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x01e9: PHI (r3v4 short) = (r3v2 short), (r3v3 short), (r3v2 short) binds: [B:64:0x01e7, B:56:0x019a, B:11:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x01e9: PHI (r4v4 int) = (r4v2 int), (r4v3 int), (r4v2 int) binds: [B:64:0x01e7, B:56:0x019a, B:11:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x0219 A[PHI: r5 r7
      0x0219: PHI (r5v5 int) = (r5v2 int), (r5v3 int), (r5v2 int), (r5v2 int) binds: [B:68:0x0217, B:52:0x017a, B:44:0x0120, B:29:0x0084] A[DONT_GENERATE, DONT_INLINE]
      0x0219: PHI (r7v5 short) = (r7v2 short), (r7v2 short), (r7v3 short), (r7v2 short) binds: [B:68:0x0217, B:52:0x017a, B:44:0x0120, B:29:0x0084] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
    
        if (l.C1377.f5749 == false) goto L11;
     */
    @Override // bin.mt.plugin.api.preference.PluginPreference.PreferenceScreen
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final bin.mt.plugin.api.preference.PluginPreference.PreferenceHeader requireHeader(java.lang.String r18) {
        /*
            Method dump skipped, instruction units count: 718
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18335.requireHeader(java.lang.String):bin.mt.plugin.api.preference.PluginPreference$PreferenceHeader");
    }
}
