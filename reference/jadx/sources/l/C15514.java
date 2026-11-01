package l;

import bin.mt.plugin.api.preference.PluginPreference;
import com.google.android.material.slider.BaseSlider;
import java.util.ArrayList;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ܶ᩹ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: O3YD */
/* JADX INFO: loaded from: classes4.dex */
public final class C15514 implements PluginPreference.PreferenceHeader {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14187 f50523;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC19041 f50524;

    @Override // bin.mt.plugin.api.preference.PluginPreference.PreferenceHeader
    public final void setEnabled(boolean z) {
        C14187 c14187 = null;
        int i = 313562576;
        int i2 = C7105.f23796;
        int i3 = C1937.f7317;
        int iM11306 = ThreadFactoryC3888.m11306("۠ۢ") ^ i3;
        int i4 = ((iM11306 ^ i2) * (-17193)) ^ (-626175586);
        int i5 = -1016712974;
        while (true) {
            i = ((((i ^ i2) * 31861) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -1995862604:
                case 1086904682:
                    if (C3286.m9798() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩺᩹") ^ i3;
                        i4 = ((iM11306 ^ i2) * 13121) ^ 2116062692;
                        i5 = -1864887250;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۫֫") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-3163)) ^ 465082713;
                        i5 = 1344864716;
                    }
                    break;
                case -1926487108:
                case -363286809:
                    c14187 = this.f50523;
                    if (C0526.f2219) {
                        iM11306 = C19806.m45029("ܿܿ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 31789) ^ 973921188;
                        i5 = 1656037177;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܺۗ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 3069) ^ 721817660;
                        i5 = -323624082;
                    }
                    break;
                case -1861385013:
                case 646726167:
                    C0817.m3399();
                    iM11306 = ThreadFactoryC3888.m11306("ۢ᩶") ^ i2;
                    i4 = ((iM11306 ^ i3) * (-22645)) ^ 1223924770;
                    i5 = -1679564634;
                    break;
                case -1799157752:
                case 1472223364:
                    if (C0216.f1393 != 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۫֫") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-3163)) ^ 465082713;
                        i5 = 1344864716;
                    } else {
                        iM11306 = C19806.m45029("ۧۜ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 717) ^ (-367917616);
                        i5 = 134975330;
                    }
                    break;
                case -1706194749:
                case 1308401840:
                    C1398.m4895();
                    if (C1461.f5957 > 0) {
                        iM11306 = C19806.m45029("ۛۘ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-11071)) ^ (-1897252733);
                        i5 = 2058431227;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۢ᩶") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-22645)) ^ 1223924770;
                        i5 = -1679564634;
                    }
                    break;
                case -1280532212:
                case 1458569248:
                    if (C1460.f5948 >= 0) {
                        iM11306 = C19806.m45029("ۛۘ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-11071)) ^ (-1897252733);
                        i5 = 2058431227;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۛᩴ")) * (-87);
                        i4 = ((iM11306 ^ i2) * 3611) ^ 1857832207;
                        i5 = -992817623;
                    }
                    break;
                case -1032911208:
                case -456756829:
                    if (C3722.m10894() <= 0) {
                        iM11306 = C19806.m45029("ۛۘ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-11071)) ^ (-1897252733);
                        i5 = 2058431227;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۧ᩹") + i2) * (-5);
                        i4 = ((iM11306 ^ i3) * (-2317)) ^ 1449071598;
                        i5 = 1526047739;
                    }
                    break;
                case -837656445:
                case 651251868:
                    c14187.f10927 = z;
                    m37112();
                    break;
                case -337585304:
                case 164450708:
                    if (C0962.m3746() >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۫֫") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-3163)) ^ 465082713;
                        i5 = 1344864716;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩸ۢ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 3817) ^ (-1523040007);
                        i5 = -1075820285;
                    }
                    break;
                case 129363229:
                case 169241503:
                    if (RunnableC1895.f7152) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ᩴᩴ")) * 45;
                        i4 = ((iM11306 ^ i2) * 18361) ^ 809300365;
                        i5 = -2049738418;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۫֫") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-3163)) ^ 465082713;
                        i5 = 1344864716;
                    }
                    break;
                case 176004728:
                case 1650963858:
                    if (C2477.f9839 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩺᩹") ^ i3;
                        i4 = ((iM11306 ^ i2) * 13121) ^ 2116062692;
                        i5 = -1864887250;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۛۖ") + i3) * (-77);
                        i4 = ((iM11306 ^ i2) * 30735) ^ (-1834296699);
                        i5 = 298050124;
                    }
                    break;
                case 435770893:
                case 1367824989:
                    CallableC1627.m5507();
                    break;
                case 458784983:
                case 1971791686:
                    if (C1461.f5957 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۫֫") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-3163)) ^ 465082713;
                        i5 = 1344864716;
                    } else {
                        iM11306 = C19806.m45029("ܶۨ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-23965)) ^ 1940685330;
                        i5 = -334922238;
                    }
                    break;
                case 685414813:
                case 944574915:
                    if (RunnableC1564.f6300) {
                        iM11306 = ThreadFactoryC3888.m11306("۫֫") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-3163)) ^ 465082713;
                        i5 = 1344864716;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֫ۡ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-30113)) ^ 2061045792;
                        i5 = -1132684417;
                    }
                    break;
                case 1252693541:
                case 2070359676:
                    if (C2477.f9839 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۫֫") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-3163)) ^ 465082713;
                        i5 = 1344864716;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۢ᩶") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-22645)) ^ 1223924770;
                        i5 = -1679564634;
                    }
                    break;
                default:
                    if (C7105.f23796 >= 0) {
                        iM11306 = C19806.m45029("ۛۘ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-11071)) ^ (-1897252733);
                        i5 = 2058431227;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("۟֫")) * 33;
                        i4 = ((iM11306 ^ i3) * 30065) ^ 326391876;
                        i5 = 481252507;
                    }
                    break;
            }
            return;
        }
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.PreferenceHeader
    public final void setVisible(boolean z) {
        C14187 c14187 = null;
        ActivityC19041 activityC19041 = null;
        int i = 1008207230;
        int i2 = RunnableC1606.f6488;
        int i3 = C1419.f5860;
        int iM45029 = C19806.m45029("ܽᩳ") ^ i2;
        int i4 = ((iM45029 ^ i3) * (-11613)) ^ (-47911337);
        int i5 = -80880772;
        while (true) {
            i = ((((i ^ i3) * 28515) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2065264197:
                case -650046007:
                    C0797.m3359();
                    if (!RunnableC1895.f7152) {
                        iM45029 = (C19806.m45029("᩵ܿ") + i3) * (-87);
                        i4 = ((iM45029 ^ i2) * 23033) ^ 1778110064;
                        i5 = 1333757207;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳܶ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-18519)) ^ (-482530714);
                        i5 = 1747025128;
                    }
                    break;
                case -2013949677:
                case 650816348:
                    C0216.m1591();
                    if (C1377.f5749) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ܳۙ")) * 35;
                        i4 = ((iM45029 ^ i2) * 8475) ^ 893224634;
                        i5 = 612549818;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۜ᩺") ^ i2;
                        i4 = ((iM45029 ^ i3) * 9201) ^ (-445986393);
                        i5 = 1529209365;
                    }
                    break;
                case -1921819633:
                case -226464860:
                    C3535.m10422(activityC19041.f61587);
                    iM45029 = C19806.m45029("۬ܽ") ^ i2;
                    i4 = ((iM45029 ^ i3) * (-31901)) ^ 86661352;
                    i5 = 777065427;
                    break;
                case -1410758087:
                case 1203151245:
                    c14187.f10925 = z;
                    activityC19041 = this.f50524;
                    if (C2871.f10837 >= 0) {
                        iM45029 = (C19806.m45029("᩵ܿ") + i3) * (-87);
                        i4 = ((iM45029 ^ i2) * 23033) ^ 1778110064;
                        i5 = 1333757207;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩻ۢ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 3255) ^ 1382091279;
                        i5 = -785372717;
                    }
                    break;
                case -1402538806:
                case -990851749:
                    if (C1460.m5050() != 0) {
                        iM45029 = (C19806.m45029("ۛ᩺") + i2) * 59;
                        i4 = ((iM45029 ^ i3) * 23085) ^ (-1493370343);
                        i5 = -1038939850;
                    } else {
                        iM45029 = (i2 - C19806.m45029("᩺᩸")) * (-113);
                        i4 = ((iM45029 ^ i3) * 215) ^ (-112732349);
                        i5 = 78975423;
                    }
                    break;
                case -1259152429:
                case 71730824:
                    C0050.m946();
                    iM45029 = (i3 - ThreadFactoryC3888.m11306("ܳۙ")) * 35;
                    i4 = ((iM45029 ^ i2) * 8475) ^ 893224634;
                    i5 = 612549818;
                    break;
                case -1183594697:
                case -349799806:
                    c14187 = this.f50523;
                    if (c14187.f10925 != z) {
                        iM45029 = (i3 - C19806.m45029("ۙۘ")) * (-117);
                        i4 = ((iM45029 ^ i2) * 19443) ^ 896212663;
                        i5 = 428437988;
                    } else {
                        iM45029 = C19806.m45029("۬ܽ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-31901)) ^ 86661352;
                        i5 = 777065427;
                    }
                    break;
                case -1149269173:
                case -1048176422:
                    break;
                case -893424824:
                case 1749721280:
                    if (C1148.f5161 <= 0) {
                        iM45029 = (C19806.m45029("ۛ᩺") + i2) * 59;
                        i4 = ((iM45029 ^ i3) * 23085) ^ (-1493370343);
                        i5 = -1038939850;
                    } else {
                        iM45029 = C19806.m45029("᩻ᩴ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 18519) ^ 1695823834;
                        i5 = -453909660;
                    }
                    break;
                case -841498658:
                case 663041209:
                    if (C1937.f7317 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳܶ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-18519)) ^ (-482530714);
                        i5 = 1747025128;
                    } else {
                        iM45029 = C19806.m45029("ۜ᩷") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-11549)) ^ (-906296363);
                        i5 = 976279589;
                    }
                    break;
                case -706223642:
                case 1894913080:
                    if (C1668.f6641 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳܶ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-18519)) ^ (-482530714);
                        i5 = 1747025128;
                    } else {
                        iM45029 = C19806.m45029("ܺ۟") ^ i3;
                        i4 = ((iM45029 ^ i2) * 24255) ^ 160126688;
                        i5 = -259934930;
                    }
                    break;
                case -698391376:
                case 272833638:
                    C1066.m4023();
                    RunnableC1564.m5345();
                    break;
                case -232435760:
                case 827499847:
                    if (C1148.f5161 <= 0) {
                        iM45029 = (C19806.m45029("ۛ᩺") + i2) * 59;
                        i4 = ((iM45029 ^ i3) * 23085) ^ (-1493370343);
                        i5 = -1038939850;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۟᩸") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-19181)) ^ 52317904;
                        i5 = 290466648;
                    }
                    break;
                case 351991666:
                case 956045817:
                    if (C10634.f36300 >= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ܳۙ")) * 35;
                        i4 = ((iM45029 ^ i2) * 8475) ^ 893224634;
                        i5 = 612549818;
                    } else {
                        iM45029 = (i2 - C19806.m45029("۟᩹")) * (-121);
                        i4 = ((iM45029 ^ i3) * 749) ^ 908919872;
                        i5 = 1775488986;
                    }
                    break;
                case 622942897:
                case 1230094760:
                    if (C0817.f3443) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۧۨ")) * (-117);
                        i4 = ((iM45029 ^ i2) * (-18485)) ^ (-243482249);
                        i5 = 1899784968;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳܶ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-18519)) ^ (-482530714);
                        i5 = 1747025128;
                    }
                    break;
                case 683790064:
                case 1055179980:
                    activityC19041.m43770();
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM45029 = (C19806.m45029("ۜۖ") ^ i3) * 23;
                        i4 = ((iM45029 ^ i2) * (-28127)) ^ (-1232444301);
                        i5 = -1140751857;
                    } else {
                        iM45029 = (C19806.m45029("ۛ᩺") + i2) * 59;
                        i4 = ((iM45029 ^ i3) * 23085) ^ (-1493370343);
                        i5 = -1038939850;
                    }
                    break;
                case 796718363:
                case 1899291029:
                    if (C1148.f5161 <= 0) {
                        iM45029 = (C19806.m45029("᩵ܿ") + i3) * (-87);
                        i4 = ((iM45029 ^ i2) * 23033) ^ 1778110064;
                        i5 = 1333757207;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴۜ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 23109) ^ (-2008519353);
                        i5 = 1453796103;
                    }
                    break;
                default:
                    C0526.m2437();
                    if (C3722.f13525 > 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳܶ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-18519)) ^ (-482530714);
                        i5 = 1747025128;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ܳۙ")) * 35;
                        i4 = ((iM45029 ^ i2) * 8475) ^ 893224634;
                        i5 = 612549818;
                    }
                    break;
            }
            return;
        }
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.PreferenceHeader
    public final void setTitle(CharSequence charSequence) {
        ActivityC19041 activityC19041 = null;
        CharSequence charSequenceM43773 = null;
        int i = 471236488;
        int i2 = C1977.f7413;
        int i3 = AbstractC0464.f2088;
        int iM11306 = (i3 - ThreadFactoryC3888.m11306("ۤۙ")) * 15;
        int i4 = ((iM11306 ^ i2) * (-17001)) ^ (-1711321176);
        int i5 = 712738613;
        while (true) {
            i = ((((i ^ i2) * (-27069)) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -1979880969:
                case -1610506950:
                    if (C1066.f4915 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ᩴۨ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 9067) ^ (-528480154);
                        i5 = 1405820086;
                    } else {
                        iM11306 = (C19806.m45029("ۡۘ") + i2) * (-119);
                        i4 = ((iM11306 ^ i3) * (-28317)) ^ 2014854639;
                        i5 = -1879508199;
                    }
                    break;
                case -1834270194:
                case 770307971:
                    C1937.m6279();
                    if (C0962.m3746() < 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("۫ܶ") ^ i2) * 73;
                        i4 = ((iM11306 ^ i3) * 405) ^ 75408942;
                        i5 = -1524845070;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ᩴۨ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 9067) ^ (-528480154);
                        i5 = 1405820086;
                    }
                    break;
                case -1726674961:
                case -722656657:
                    this.f50523.f10931 = charSequenceM43773;
                    m37112();
                    break;
                case -1692966795:
                case -159393195:
                    if (C0278.f1572 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܽۗ") ^ i2) * (-39);
                        i4 = ((iM11306 ^ i3) * (-14861)) ^ 1543834347;
                        i5 = -416949711;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۨۜ") ^ i3) * 81;
                        i4 = ((iM11306 ^ i2) * 15757) ^ (-956799274);
                        i5 = 1462075641;
                    }
                    break;
                case -1450317090:
                case 1325307780:
                    if (AbstractC0464.f2088 <= 0) {
                        iM11306 = (C19806.m45029("᩶᩸") ^ i3) * (-89);
                        i4 = ((iM11306 ^ i2) * (-13353)) ^ (-195712884);
                        i5 = 1746528480;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܺܿ") ^ i2) * (-115);
                        i4 = ((iM11306 ^ i3) * 22211) ^ (-1423114393);
                        i5 = 1699608741;
                    }
                    break;
                case -1373651604:
                case 1436612026:
                    if (C1460.m5050() != 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܽۗ") ^ i2) * (-39);
                        i4 = ((iM11306 ^ i3) * (-14861)) ^ 1543834347;
                        i5 = -416949711;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֡ۛ") + i2) * 3;
                        i4 = ((iM11306 ^ i3) * (-14805)) ^ (-1213978465);
                        i5 = 1829083375;
                    }
                    break;
                case -966526827:
                case 1148303867:
                    RunnableC1895.m6170();
                    C10634.m26820();
                    iM11306 = ThreadFactoryC3888.m11306("ᩴۨ") ^ i3;
                    i4 = ((iM11306 ^ i2) * 9067) ^ (-528480154);
                    i5 = 1405820086;
                    break;
                case -889215428:
                case 2068625102:
                    if (!C0817.m3399()) {
                        iM11306 = (ThreadFactoryC3888.m11306("۫ܶ") ^ i2) * 73;
                        i4 = ((iM11306 ^ i3) * 405) ^ 75408942;
                        i5 = -1524845070;
                    } else {
                        iM11306 = (C19806.m45029("᩶᩸") ^ i3) * (-89);
                        i4 = ((iM11306 ^ i2) * (-13353)) ^ (-195712884);
                        i5 = 1746528480;
                    }
                    break;
                case -316399522:
                case 195727717:
                    C1189.m4368();
                    C3577.m10565();
                    break;
                case -183275028:
                case 1711262361:
                    activityC19041 = this.f50524;
                    if (C0216.m1591() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ᩴۨ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 9067) ^ (-528480154);
                        i5 = 1405820086;
                    } else {
                        iM11306 = (i3 - C19806.m45029("᩹ᩴ")) * (-5);
                        i4 = ((iM11306 ^ i2) * (-27023)) ^ (-1691745235);
                        i5 = 1285324484;
                    }
                    break;
                case 49539949:
                case 180259072:
                    charSequenceM43773 = ActivityC19041.m43773(activityC19041, charSequence);
                    if (C1668.m5583()) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("᩹᩷")) * (-23);
                        i4 = ((iM11306 ^ i3) * (-14389)) ^ (-860548453);
                        i5 = 1965545145;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܽۗ") ^ i2) * (-39);
                        i4 = ((iM11306 ^ i3) * (-14861)) ^ 1543834347;
                        i5 = -416949711;
                    }
                    break;
                case 130045787:
                case 350531573:
                    if (RunnableC1606.m5473() != 0) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ۙ᩸")) * (-67);
                        i4 = ((iM11306 ^ i3) * (-5047)) ^ 711732596;
                        i5 = -208997185;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֨ܽ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-18997)) ^ 517620740;
                        i5 = 230880264;
                    }
                    break;
                case 1120150504:
                case 1868033073:
                    if (C0817.m3399()) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܽ֨") + i2) * (-53);
                        i4 = ((iM11306 ^ i3) * 25445) ^ (-1702075986);
                        i5 = 1990028525;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ۙ᩸")) * (-67);
                        i4 = ((iM11306 ^ i3) * (-5047)) ^ 711732596;
                        i5 = -208997185;
                    }
                    break;
                case 1419025471:
                case 1712297791:
                    if (!CallableC1627.f6528) {
                        iM11306 = (ThreadFactoryC3888.m11306("۫ܶ") ^ i2) * 73;
                        i4 = ((iM11306 ^ i3) * 405) ^ 75408942;
                        i5 = -1524845070;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ۙ᩸")) * (-67);
                        i4 = ((iM11306 ^ i3) * (-5047)) ^ 711732596;
                        i5 = -208997185;
                    }
                    break;
                case 1916514184:
                case 2059446828:
                    if (C2642.f10294 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܽۗ") ^ i2) * (-39);
                        i4 = ((iM11306 ^ i3) * (-14861)) ^ 1543834347;
                        i5 = -416949711;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۗܿ") + i3) * 73;
                        i4 = ((iM11306 ^ i2) * 27235) ^ 1998693628;
                        i5 = 1369115454;
                    }
                    break;
                default:
                    if (C2249.f8050 >= 0) {
                        iM11306 = (C19806.m45029("᩶᩸") ^ i3) * (-89);
                        i4 = ((iM11306 ^ i2) * (-13353)) ^ (-195712884);
                        i5 = 1746528480;
                    } else {
                        iM11306 = (i3 - C19806.m45029("ܺۖ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM11306 ^ i2) * (-3585)) ^ (-2115676189);
                        i5 = -376208355;
                    }
                    break;
            }
            return;
        }
    }

    public C15514(ActivityC19041 activityC19041, C14187 c14187) {
        int i = -1133952391;
        int i2 = C0629.f2722;
        int i3 = C2249.f8050;
        int iM45029 = (i3 - C19806.m45029("ۤ᩸")) * (-101);
        int i4 = ((iM45029 ^ i2) * (-751)) ^ (-341997602);
        int i5 = 688567016;
        while (true) {
            i = ((((i ^ i2) * 31927) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2015532055:
                case 954940971:
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    C2332.m7079();
                    iM45029 = (C19806.m45029("۟ۡ") ^ i3) * (-99);
                    i4 = ((iM45029 ^ i2) * 28387) ^ 773386842;
                    i5 = -1255117096;
                    break;
                case -1980295710:
                case 1386707354:
                    this.f50523 = c14187;
                    return;
                case -1828864222:
                case -246699314:
                    if (C1419.f5860 < 0) {
                        iM45029 = C19806.m45029("۬᩵") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-2429)) ^ 658169289;
                        i5 = 138282711;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܺ᩵") ^ i2) * (-29);
                        i4 = ((iM45029 ^ i3) * 5599) ^ 872645076;
                        i5 = -1500443811;
                    }
                    break;
                case -1816576446:
                case 92275687:
                    if (C1460.m5050() != 0) {
                        iM45029 = C19806.m45029("۬᩵") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-2429)) ^ 658169289;
                        i5 = 138282711;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۗܿ") + i3) * (-95);
                        i4 = ((iM45029 ^ i2) * (-24215)) ^ 447875828;
                        i5 = -1405260124;
                    }
                    break;
                case -1784611787:
                case 621556292:
                    if (C1937.m6279() >= 0) {
                        iM45029 = (C19806.m45029("۟ۡ") ^ i3) * (-99);
                        i4 = ((iM45029 ^ i2) * 28387) ^ 773386842;
                        i5 = -1255117096;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۫۟") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-11963)) ^ 249970418;
                        i5 = -658725857;
                    }
                    break;
                case -1195147298:
                case -263333808:
                    if (C0278.f1572 <= 0) {
                        iM45029 = C19806.m45029("۬᩵") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-2429)) ^ 658169289;
                        i5 = 138282711;
                    } else {
                        iM45029 = (i3 - C19806.m45029("֫ۖ")) * 77;
                        i4 = ((iM45029 ^ i2) * (-10211)) ^ 653552560;
                        i5 = 240271335;
                    }
                    break;
                case -1130842669:
                case -738547341:
                    if (C2332.f8260) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("֨ۚ")) * 79;
                        i4 = ((iM45029 ^ i3) * (-21453)) ^ (-1712389510);
                        i5 = 434600949;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩸۟") ^ i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM45029 ^ i2) * 26573) ^ (-1754005872);
                        i5 = 2129513098;
                    }
                    break;
                case -1118557182:
                case 1057980436:
                    if (C3660.f13403 >= 0) {
                        iM45029 = C19806.m45029("۬᩵") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-2429)) ^ 658169289;
                        i5 = 138282711;
                    } else {
                        iM45029 = C19806.m45029("ۚܿ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 27173) ^ 137096611;
                        i5 = 384764038;
                    }
                    break;
                case -990750356:
                case 749798817:
                    C1460.m5050();
                    throw new RuntimeException();
                case -933386575:
                case 1838167454:
                    if (C0629.f2722 > 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܺ᩵") ^ i2) * (-29);
                        i4 = ((iM45029 ^ i3) * 5599) ^ 872645076;
                        i5 = -1500443811;
                    } else {
                        iM45029 = (C19806.m45029("۟ۡ") ^ i3) * (-99);
                        i4 = ((iM45029 ^ i2) * 28387) ^ 773386842;
                        i5 = -1255117096;
                    }
                    break;
                case -900553420:
                case -182105167:
                    if (C7105.f23796 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩸۟") ^ i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM45029 ^ i2) * 26573) ^ (-1754005872);
                        i5 = 2129513098;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ܺܰ")) * (-127);
                        i4 = ((iM45029 ^ i2) * (-20365)) ^ (-1142570145);
                        i5 = 114972763;
                    }
                    break;
                case -875320945:
                case 1484236998:
                    if (C0797.f3386) {
                        iM45029 = (C19806.m45029("ۢ᩷") + i2) * 79;
                        i4 = ((iM45029 ^ i3) * 8935) ^ 1981916330;
                        i5 = 2014708958;
                    } else {
                        iM45029 = C19806.m45029("ܽۙ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-27057)) ^ (-1053897700);
                        i5 = -431326135;
                    }
                    break;
                case -764899374:
                case -424785669:
                    if (C1377.f5749) {
                        iM45029 = C19806.m45029("ܰ᩺") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-351)) ^ 290098672;
                        i5 = 1438864400;
                    } else {
                        iM45029 = (C19806.m45029("ۢ᩷") + i2) * 79;
                        i4 = ((iM45029 ^ i3) * 8935) ^ 1981916330;
                        i5 = 2014708958;
                    }
                    break;
                case 806686298:
                case 1794712320:
                    C1398.m4895();
                    if (!RunnableC1564.f6300) {
                        iM45029 = (C19806.m45029("۟ۡ") ^ i3) * (-99);
                        i4 = ((iM45029 ^ i2) * 28387) ^ 773386842;
                        i5 = -1255117096;
                    } else {
                        iM45029 = (C19806.m45029("ۢ᩷") + i2) * 79;
                        i4 = ((iM45029 ^ i3) * 8935) ^ 1981916330;
                        i5 = 2014708958;
                    }
                    break;
                case 921568947:
                case 1502449100:
                    if (C2477.m7593() >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܺ᩵") ^ i2) * (-29);
                        i4 = ((iM45029 ^ i3) * 5599) ^ 872645076;
                        i5 = -1500443811;
                    } else {
                        iM45029 = (i2 - C19806.m45029("᩷ܽ")) * (-121);
                        i4 = ((iM45029 ^ i3) * 13959) ^ 1302737701;
                        i5 = 1768880908;
                    }
                    break;
                default:
                    this.f50524 = activityC19041;
                    if (C3660.m10791() != 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩸۟") ^ i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM45029 ^ i2) * 26573) ^ (-1754005872);
                        i5 = 2129513098;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۜ۫") ^ i3) * (-119);
                        i4 = ((iM45029 ^ i2) * (-3521)) ^ 26805194;
                        i5 = 753819106;
                    }
                    break;
            }
        }
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.PreferenceHeader
    public final PluginPreference.PreferenceScreen getPreferenceScreen() {
        return this.f50524.f61590;
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.PreferenceHeader
    public final String getKey() {
        return this.f50523.f10929;
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.PreferenceHeader
    public final CharSequence getTitle() {
        return this.f50523.f10931;
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.PreferenceHeader
    public final boolean isEnabled() {
        return this.f50523.f10927;
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.PreferenceHeader
    public final boolean isVisible() {
        return this.f50523.f10925;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m37112() {
        ActivityC19041 activityC19041 = null;
        ArrayList arrayList = null;
        C14187 c14187 = null;
        int iIndexOf = 0;
        AbstractC12554 abstractC12554FindViewHolderForAdapterPosition = null;
        int i = 984956021;
        int i2 = ThreadFactoryC3888.f14547;
        int i3 = C10634.f36300;
        int iM45029 = (i2 - C19806.m45029("ۜܳ")) * (-23);
        int i4 = ((iM45029 ^ i3) * (-25209)) ^ 1815005403;
        int i5 = -201176616;
        while (true) {
            i = ((((i ^ i3) * (-645)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2050888953:
                case -1646823365:
                    if (C0216.f1393 != 0) {
                        iM45029 = (C19806.m45029("ۙ᩸") + i3) * 81;
                        i4 = ((iM45029 ^ i2) * 7) ^ 1774932663;
                        i5 = 287017336;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳۖ") ^ i2) * 53;
                        i4 = ((iM45029 ^ i3) * 18477) ^ 475818618;
                        i5 = -1430691784;
                    }
                    break;
                case -2044385828:
                case 541216537:
                    ((C13397) abstractC12554FindViewHolderForAdapterPosition).m32884(c14187);
                    break;
                case -1845267807:
                case 2123520231:
                    c14187 = this.f50523;
                    iIndexOf = arrayList.indexOf(c14187);
                    if (iIndexOf >= 0) {
                        iM45029 = (i2 - C19806.m45029("֫ۖ")) * (-9);
                        i4 = ((iM45029 ^ i3) * (-19343)) ^ 381526807;
                        i5 = -1910467643;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳ֨") ^ i3;
                        i4 = ((iM45029 ^ i2) * 22891) ^ (-1531569626);
                        i5 = -1632185431;
                    }
                    break;
                case -1555163962:
                case 1210406824:
                    C1148.m4232();
                    if (!RunnableC1564.m5345()) {
                        iM45029 = (i2 - C19806.m45029("ܿ۫")) * 123;
                        i4 = ((iM45029 ^ i3) * (-1029)) ^ (-263901775);
                        i5 = -231024843;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۬۫") ^ i3) * (-33);
                        i4 = ((iM45029 ^ i2) * 22967) ^ 2101413695;
                        i5 = -1696154183;
                    }
                    break;
                case -1433509145:
                case 1864906667:
                    C1148.m4232();
                    if (!RunnableC1564.f6300) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ۜۨ")) * (-115);
                        i4 = ((iM45029 ^ i3) * 4541) ^ 401711241;
                        i5 = 2039412656;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۬۫") ^ i3) * (-33);
                        i4 = ((iM45029 ^ i2) * 22967) ^ 2101413695;
                        i5 = -1696154183;
                    }
                    break;
                case -1112555306:
                case 1938001179:
                    activityC19041.f61587.notifyItemChanged(iIndexOf);
                    iM45029 = ThreadFactoryC3888.m11306("ᩳ֨") ^ i3;
                    i4 = ((iM45029 ^ i2) * 22891) ^ (-1531569626);
                    i5 = -1632185431;
                    break;
                case -950549475:
                case 1935595677:
                    C0671.m3008();
                    C1377.m4833();
                    iM45029 = (ThreadFactoryC3888.m11306("۬۫") ^ i3) * (-33);
                    i4 = ((iM45029 ^ i2) * 22967) ^ 2101413695;
                    i5 = -1696154183;
                    break;
                case -920645587:
                case 358343844:
                    activityC19041 = this.f50524;
                    if (MenuItemOnMenuItemClickListenerC3244.m9701() >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("۬۫") ^ i3) * (-33);
                        i4 = ((iM45029 ^ i2) * 22967) ^ 2101413695;
                        i5 = -1696154183;
                    } else {
                        iM45029 = C19806.m45029("ۖۜ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-3211)) ^ 1226222400;
                        i5 = -1010886737;
                    }
                    break;
                case -826346226:
                case 758167342:
                    if (C0629.f2722 <= 0) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ۜۨ")) * (-115);
                        i4 = ((iM45029 ^ i3) * 4541) ^ 401711241;
                        i5 = 2039412656;
                    } else {
                        iM45029 = (C19806.m45029("ۡܰ") ^ i3) * 59;
                        i4 = ((iM45029 ^ i2) * 11947) ^ (-1005319228);
                        i5 = -2144171029;
                    }
                    break;
                case -732382727:
                case 2024145786:
                    abstractC12554FindViewHolderForAdapterPosition = activityC19041.f61594.findViewHolderForAdapterPosition(iIndexOf);
                    if (abstractC12554FindViewHolderForAdapterPosition != null) {
                        iM45029 = C19806.m45029("֨ۘ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-15999)) ^ (-1298668518);
                        i5 = 958492551;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܿ᩸") + i2) * (-59);
                        i4 = ((iM45029 ^ i3) * 14307) ^ 1870118563;
                        i5 = -1418030457;
                    }
                    break;
                case -373531889:
                case 565253719:
                    break;
                case -323004208:
                case 1276633300:
                    if (C1419.m4973()) {
                        iM45029 = (C19806.m45029("ۙ᩸") + i3) * 81;
                        i4 = ((iM45029 ^ i2) * 7) ^ 1774932663;
                        i5 = 287017336;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۚܰ")) * 65;
                        i4 = ((iM45029 ^ i2) * (-3919)) ^ 1774230931;
                        i5 = -1280310590;
                    }
                    break;
                case -117299082:
                case 1731159250:
                    if (C1148.f5161 <= 0) {
                        iM45029 = (i2 - C19806.m45029("ܿ۫")) * 123;
                        i4 = ((iM45029 ^ i3) * (-1029)) ^ (-263901775);
                        i5 = -231024843;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۠ᩴ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-31391)) ^ (-720655219);
                        i5 = 957127010;
                    }
                    break;
                case -91160107:
                case 680331954:
                    C0526.m2437();
                    break;
                case 119899047:
                case 1640292658:
                    C2332.m7079();
                    if (C10634.f36300 < 0) {
                        iM45029 = (C19806.m45029("᩸ۜ") ^ i3) * 41;
                        i4 = ((iM45029 ^ i2) * 18679) ^ (-1477434935);
                        i5 = 850428800;
                    } else {
                        iM45029 = (i2 - C19806.m45029("ܿ۫")) * 123;
                        i4 = ((iM45029 ^ i3) * (-1029)) ^ (-263901775);
                        i5 = -231024843;
                    }
                    break;
                case 320991076:
                case 1869610226:
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("۬۫") ^ i3) * (-33);
                        i4 = ((iM45029 ^ i2) * 22967) ^ 2101413695;
                        i5 = -1696154183;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ܺ᩸")) * 127;
                        i4 = ((iM45029 ^ i2) * (-8545)) ^ (-2137577011);
                        i5 = -1897196473;
                    }
                    break;
                case 535486085:
                case 867980503:
                    if (C0216.f1393 != 0) {
                        iM45029 = (C19806.m45029("᩸ۜ") ^ i3) * 41;
                        i4 = ((iM45029 ^ i2) * 18679) ^ (-1477434935);
                        i5 = 850428800;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۠ܽ") ^ i2) * 87;
                        i4 = ((iM45029 ^ i3) * (-16053)) ^ (-1068549444);
                        i5 = 1995632401;
                    }
                    break;
                case 865617417:
                case 1210858827:
                    if (C1148.m4232() <= 0) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ۜۨ")) * (-115);
                        i4 = ((iM45029 ^ i3) * 4541) ^ 401711241;
                        i5 = 2039412656;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳ۟") ^ i3;
                        i4 = ((iM45029 ^ i2) * 1565) ^ 1402644380;
                        i5 = -1454699192;
                    }
                    break;
                case 1563479679:
                case 2092642562:
                    if (C2704.f10408) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("᩸᩶")) * (-23);
                        i4 = ((iM45029 ^ i3) * 17365) ^ (-1194993275);
                        i5 = 1517672100;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۬۫") ^ i3) * (-33);
                        i4 = ((iM45029 ^ i2) * 22967) ^ 2101413695;
                        i5 = -1696154183;
                    }
                    break;
                default:
                    arrayList = activityC19041.f61592;
                    if (C0278.m1789() <= 0) {
                        iM45029 = (C19806.m45029("ۙ᩸") + i3) * 81;
                        i4 = ((iM45029 ^ i2) * 7) ^ 1774932663;
                        i5 = 287017336;
                    } else {
                        iM45029 = C19806.m45029("ᩳ۬") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-26915)) ^ 524547928;
                        i5 = 687007802;
                    }
                    break;
            }
            return;
        }
    }
}
