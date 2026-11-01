package bin.mt.plus;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.IWXAPIEventHandler;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import l.AbstractC0464;
import l.ActivityC3330;
import l.C0050;
import l.C0278;
import l.C0526;
import l.C0629;
import l.C0671;
import l.C0817;
import l.C0962;
import l.C1025;
import l.C1066;
import l.C1148;
import l.C1189;
import l.C1377;
import l.C1419;
import l.C1668;
import l.C1937;
import l.C1977;
import l.C19806;
import l.C20364;
import l.C2249;
import l.C2332;
import l.C2477;
import l.C2642;
import l.C2704;
import l.C2871;
import l.C3286;
import l.C3535;
import l.C3577;
import l.C3722;
import l.C3743;
import l.C7105;
import l.C9186;
import l.CallableC1627;
import l.RunnableC0195;
import l.RunnableC1606;
import l.RunnableC1895;
import l.ThreadFactoryC3888;
import l.ViewGroupOnHierarchyChangeListenerC1916;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: loaded from: classes.dex */
public class WXPayEntryActivity extends ActivityC3330 implements IWXAPIEventHandler {

    /* JADX INFO: renamed from: ܽۜ֡, reason: not valid java name and contains not printable characters */
    private static final short[] f69 = {5667, 25928, 20159, 25207, 21240, 26445, 30594, -27266, -29816, 71, 25928, 20159, -30516, 21425, 28143};
    public IWXAPI api;

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        int i = -1687802986;
        int i2 = RunnableC0195.f1321;
        int i3 = C2871.f10837;
        int iM45029 = (C19806.m45029("ܳۧ") ^ i3) * 101;
        int i4 = ((iM45029 ^ i2) * 8829) ^ 1233353670;
        int i5 = 1158573343;
        while (true) {
            i = ((((i ^ i2) * (-9219)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2071762205:
                case 1439024308:
                    if (C3577.f13150 >= 0) {
                        iM45029 = C19806.m45029("ۛܺ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-3255)) ^ 2096439069;
                        i5 = -1955880877;
                    } else {
                        iM45029 = (C19806.m45029("ᩴۤ") + i2) * (-63);
                        i4 = ((iM45029 ^ i3) * (-6809)) ^ 1507321124;
                        i5 = -1346067779;
                    }
                    break;
                case -1527814125:
                case 38822462:
                    if (C1977.f7413 <= 0) {
                        iM45029 = (i3 - C19806.m45029("ܳᩴ")) * 61;
                        i4 = ((iM45029 ^ i2) * (-32707)) ^ (-1757987441);
                        i5 = 1147503642;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܺ᩺") ^ i3;
                        i4 = ((iM45029 ^ i2) * 23733) ^ (-613379917);
                        i5 = -1108997028;
                    }
                    break;
                case -1454520618:
                case 1085802623:
                    super.onNewIntent(intent);
                    if (C2249.f8050 >= 0) {
                        iM45029 = (C19806.m45029("ۤ۟") ^ i3) * 9;
                        i4 = ((iM45029 ^ i2) * (-21191)) ^ 1983467813;
                        i5 = -2113958328;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("֫ۨ")) * (-99);
                        i4 = ((iM45029 ^ i2) * 4725) ^ 1454095766;
                        i5 = -141539098;
                    }
                    break;
                case -1298533225:
                case 454707535:
                    if (C0278.f1572 > 0) {
                        iM45029 = C19806.m45029("ۛܺ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-3255)) ^ 2096439069;
                        i5 = -1955880877;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ܳᩴ")) * 61;
                        i4 = ((iM45029 ^ i2) * (-32707)) ^ (-1757987441);
                        i5 = 1147503642;
                    }
                    break;
                case -1279900981:
                case -363327756:
                    if (!C1419.m4973()) {
                        iM45029 = (i3 - C19806.m45029("ܳᩴ")) * 61;
                        i4 = ((iM45029 ^ i2) * (-32707)) ^ (-1757987441);
                        i5 = 1147503642;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۡ۟") ^ i2) * 89;
                        i4 = ((iM45029 ^ i3) * 12873) ^ (-255643383);
                        i5 = -301277814;
                    }
                    break;
                case -1192805595:
                case 247865796:
                    if (C0629.f2722 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۡ۟") ^ i2) * 89;
                        i4 = ((iM45029 ^ i3) * 12873) ^ (-255643383);
                        i5 = -301277814;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩻ᩳ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-15235)) ^ 785841854;
                        i5 = -2065680510;
                    }
                    break;
                case -1043075384:
                case -116547045:
                    if (C0817.f3443) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳۨ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-12705)) ^ 1445961503;
                        i5 = 177941072;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ܳᩴ")) * 61;
                        i4 = ((iM45029 ^ i2) * (-32707)) ^ (-1757987441);
                        i5 = 1147503642;
                    }
                    break;
                case -880228121:
                case -310309410:
                    C0526.m2437();
                    if (!C0817.f3443) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۡ۟") ^ i2) * 89;
                        i4 = ((iM45029 ^ i3) * 12873) ^ (-255643383);
                        i5 = -301277814;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۤۚ") + i3) * 51;
                        i4 = ((iM45029 ^ i2) * (-4997)) ^ (-241192376);
                        i5 = 373940141;
                    }
                    break;
                case -692696029:
                case 989805173:
                    setIntent(intent);
                    this.api.handleIntent(intent, this);
                    break;
                case -614798442:
                case -425890843:
                    C2871.m8646();
                    break;
                case -340364025:
                case 1482327185:
                    if (C0817.f3443) {
                        iM45029 = C19806.m45029("ᩳ֡") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-22311)) ^ 438742394;
                        i5 = 1931527626;
                    } else {
                        iM45029 = C19806.m45029("ۛܺ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-3255)) ^ 2096439069;
                        i5 = -1955880877;
                    }
                    break;
                case 253158480:
                case 1440303560:
                    if (C3722.f13525 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۤۚ") + i3) * 51;
                        i4 = ((iM45029 ^ i2) * (-4997)) ^ (-241192376);
                        i5 = 373940141;
                    } else {
                        iM45029 = (C19806.m45029("ᩳᩴ") + i3) * 11;
                        i4 = ((iM45029 ^ i2) * (-5307)) ^ (-1551041651);
                        i5 = 143790346;
                    }
                    break;
                case 657895049:
                case 1593715932:
                    if (C0817.f3443) {
                        iM45029 = ThreadFactoryC3888.m11306("ۙᩳ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-25429)) ^ 1554984161;
                        i5 = 1214467566;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۡ۟") ^ i2) * 89;
                        i4 = ((iM45029 ^ i3) * 12873) ^ (-255643383);
                        i5 = -301277814;
                    }
                    break;
                case 683584959:
                case 1421189314:
                    C0278.m1789();
                    C2332.m7079();
                    iM45029 = (i3 - C19806.m45029("ܳᩴ")) * 61;
                    i4 = ((iM45029 ^ i2) * (-32707)) ^ (-1757987441);
                    i5 = 1147503642;
                    break;
                case 1141419586:
                case 1501763623:
                    if (C0671.m3008() >= 0) {
                        iM45029 = (i3 - C19806.m45029("ܳᩴ")) * 61;
                        i4 = ((iM45029 ^ i2) * (-32707)) ^ (-1757987441);
                        i5 = 1147503642;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۢۧ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 8537) ^ 1868024285;
                        i5 = 913548330;
                    }
                    break;
                default:
                    if (C3577.f13150 >= 0) {
                        iM45029 = C19806.m45029("ۛܺ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-3255)) ^ 2096439069;
                        i5 = -1955880877;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۠ۨ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-26893)) ^ (-194627472);
                        i5 = -95022468;
                    }
                    break;
            }
            return;
        }
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPIEventHandler
    public void onReq(BaseReq baseReq) {
    }

    @Override // l.ActivityC3330, android.app.Activity
    public void onCreate(Bundle bundle) {
        String strM45945 = null;
        IWXAPI iwxapiCreateWXAPI = null;
        int i = -2005938506;
        int i2 = C1025.f4800;
        int i3 = C3577.f13150;
        int iM11306 = (i3 - ThreadFactoryC3888.m11306("ۡ᩶")) * (-95);
        int i4 = ((iM11306 ^ i2) * 14319) ^ (-1853091639);
        int i5 = -943883338;
        while (true) {
            i = ((((i ^ i2) * 26977) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -1899258475:
                case -1587229644:
                    C9186 c9186 = C20364.f65938;
                    strM45945 = C20364.m45945();
                    if (C3286.f12186) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۢܽ")) * 29;
                        i4 = ((iM11306 ^ i2) * 27071) ^ (-1695979159);
                        i5 = -1758793800;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩺᩹") ^ i2) * 123;
                        i4 = ((iM11306 ^ i3) * (-29039)) ^ (-161773427);
                        i5 = -779082970;
                    }
                    break;
                case -1804570762:
                case 980188744:
                    iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(this, strM45945);
                    this.api = iwxapiCreateWXAPI;
                    if (C1148.m4232() <= 0) {
                        iM11306 = C19806.m45029("۠ܺ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 31453) ^ (-1178275731);
                        i5 = -1942743090;
                    } else {
                        iM11306 = C19806.m45029("ۛܰ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 30981) ^ 306941618;
                        i5 = -702017360;
                    }
                    break;
                case -1771522028:
                case 213444759:
                    RunnableC1895.m6170();
                    C2871.m8646();
                    break;
                case -1485771967:
                case -1081847223:
                    if (AbstractC0464.f2088 <= 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۢܽ")) * 29;
                        i4 = ((iM11306 ^ i2) * 27071) ^ (-1695979159);
                        i5 = -1758793800;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܺܺ") + i2) * (-41);
                        i4 = ((iM11306 ^ i3) * (-4145)) ^ (-361366072);
                        i5 = -1353081588;
                    }
                    break;
                case -1193195973:
                case 89655004:
                    if (C2642.f10294 <= 0) {
                        iM11306 = (i3 - C19806.m45029("ۧܿ")) * 41;
                        i4 = ((iM11306 ^ i2) * (-5623)) ^ 558947071;
                        i5 = 1557432647;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܰۘ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-7713)) ^ (-1574780610);
                        i5 = -200750434;
                    }
                    break;
                case -1061838632:
                case -783994132:
                    super.onCreate(bundle);
                    if (C1066.f4915 <= 0) {
                        iM11306 = (i2 - C19806.m45029("᩻ᩳ")) * (-47);
                        i4 = ((iM11306 ^ i3) * (-15949)) ^ 2103852491;
                        i5 = -1697573153;
                    } else {
                        iM11306 = C19806.m45029("ܺۚ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 28537) ^ 872980285;
                        i5 = 1000958087;
                    }
                    break;
                case -625346513:
                case 893291000:
                    C1419.m4973();
                    if (C1668.f6641 < 0) {
                        iM11306 = (C19806.m45029("᩵ܶ") + i3) * (-63);
                        i4 = ((iM11306 ^ i2) * (-8409)) ^ (-1492403155);
                        i5 = -1200502135;
                    } else {
                        iM11306 = (i3 - C19806.m45029("ۧܿ")) * 41;
                        i4 = ((iM11306 ^ i2) * (-5623)) ^ 558947071;
                        i5 = 1557432647;
                    }
                    break;
                case -446327379:
                case 1589697085:
                    if (!C0817.m3399()) {
                        iM11306 = C19806.m45029("۠ܺ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 31453) ^ (-1178275731);
                        i5 = -1942743090;
                    } else {
                        iM11306 = (i3 - C19806.m45029("ۧܿ")) * 41;
                        i4 = ((iM11306 ^ i2) * (-5623)) ^ 558947071;
                        i5 = 1557432647;
                    }
                    break;
                case 256166944:
                case 504195680:
                    if (!ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM11306 = (i2 - C19806.m45029("᩻ᩳ")) * (-47);
                        i4 = ((iM11306 ^ i3) * (-15949)) ^ 2103852491;
                        i5 = -1697573153;
                    } else {
                        iM11306 = (C19806.m45029("᩵ܶ") + i3) * (-63);
                        i4 = ((iM11306 ^ i2) * (-8409)) ^ (-1492403155);
                        i5 = -1200502135;
                    }
                    break;
                case 305587218:
                case 2108796739:
                    if (C19806.m45024()) {
                        iM11306 = (i2 - C19806.m45029("᩻ᩳ")) * (-47);
                        i4 = ((iM11306 ^ i3) * (-15949)) ^ 2103852491;
                        i5 = -1697573153;
                    } else {
                        iM11306 = C19806.m45029("᩺᩺") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-17261)) ^ (-1904104714);
                        i5 = -990238474;
                    }
                    break;
                case 430671431:
                case 1580475877:
                    if (C2249.f8050 >= 0) {
                        iM11306 = (C19806.m45029("᩵ܶ") + i3) * (-63);
                        i4 = ((iM11306 ^ i2) * (-8409)) ^ (-1492403155);
                        i5 = -1200502135;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۫ᩴ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 27923) ^ (-864007352);
                        i5 = 573371521;
                    }
                    break;
                case 447251753:
                case 1290111318:
                    iwxapiCreateWXAPI.handleIntent(C1937.m6287(this), this);
                    break;
                case 616160249:
                case 1386361995:
                    if (C0278.f1572 <= 0) {
                        iM11306 = (i3 - C19806.m45029("ۧܿ")) * 41;
                        i4 = ((iM11306 ^ i2) * (-5623)) ^ 558947071;
                        i5 = 1557432647;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֫ۚ") ^ i3) * (-49);
                        i4 = ((iM11306 ^ i2) * (-15041)) ^ 1541027229;
                        i5 = -519015507;
                    }
                    break;
                case 1006853269:
                case 1739949835:
                    if (C1189.f5284 <= 0) {
                        iM11306 = C19806.m45029("۠ܺ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 31453) ^ (-1178275731);
                        i5 = -1942743090;
                    } else {
                        iM11306 = (C19806.m45029("ܿ᩻") ^ i2) * (-121);
                        i4 = ((iM11306 ^ i3) * (-31309)) ^ (-432459690);
                        i5 = -1661327971;
                    }
                    break;
                case 1552236379:
                case 2097891288:
                    C0278.m1789();
                    iM11306 = (i3 - C19806.m45029("ۧܿ")) * 41;
                    i4 = ((iM11306 ^ i2) * (-5623)) ^ 558947071;
                    i5 = 1557432647;
                    break;
                default:
                    if (C2332.m7079() <= 0) {
                        iM11306 = (i3 - C19806.m45029("ۧܿ")) * 41;
                        i4 = ((iM11306 ^ i2) * (-5623)) ^ 558947071;
                        i5 = 1557432647;
                    } else {
                        iM11306 = (C19806.m45029("ᩴ֨") + i2) * 119;
                        i4 = ((iM11306 ^ i3) * 32025) ^ (-46129001);
                        i5 = 2039034278;
                    }
                    break;
            }
            return;
        }
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPIEventHandler
    public void onResp(BaseResp baseResp) {
        int iM45029;
        int i;
        int i2;
        short[] sArr;
        int iM450210;
        int i3;
        int i4;
        int iM11306;
        int i5;
        int i6;
        int iM11307;
        int i7;
        int i8 = C1025.f4800;
        int i9 = C0050.f912;
        int iM450211 = (C19806.m45029("ۙܺ") ^ i9) * (-17);
        int i10 = ((iM450211 ^ i8) * (-9187)) ^ (-564967668);
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i11 = iM450211 ^ 844567498;
        int i12 = 0;
        int i13 = 0;
        short s = 0;
        int i14 = 0;
        int i15 = 0;
        short s2 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        char c = 0;
        int i19 = -436778076;
        StringBuilder sb = null;
        int i20 = 0;
        Runnable runnable = null;
        int i21 = 0;
        while (true) {
            i19 = i11 ^ (i10 & (((i19 ^ i8) * (-29471)) >> 31));
            switch (i19) {
                case -2081007352:
                case 949268309:
                    if (!C1977.m6356()) {
                        iM450210 = (C19806.m45029("۟ᩴ") + i9) * (-79);
                        i3 = ((iM450210 ^ i8) * 23027) ^ 1952205184;
                        i4 = 1948538276;
                        i11 = iM450210 ^ i4;
                        i10 = i3;
                    } else {
                        sArr4 = sArr4;
                        runnable = runnable;
                        iM45029 = (i8 - ThreadFactoryC3888.m11306("ۢ᩺")) * (-121);
                        i = ((iM45029 ^ i9) * 30723) ^ 1872652942;
                        i2 = 1474578740;
                        i6 = iM45029 ^ i2;
                        runnable = runnable;
                        sArr = sArr4;
                        i11 = i6;
                        i10 = i;
                        sArr4 = sArr;
                    }
                    break;
                case -1743294205:
                case -822499680:
                    sArr4 = sArr4;
                    runnable = runnable;
                    int i22 = i20 + i14;
                    i15 = i22 + i22;
                    s2 = 1886;
                    if (C0671.f2816 == 0) {
                        iM45029 = (C19806.m45029("֫᩷") + i9) * (-61);
                        i = ((iM45029 ^ i8) * (-25295)) ^ 789950570;
                        i2 = 551831861;
                        i6 = iM45029 ^ i2;
                        runnable = runnable;
                        sArr = sArr4;
                        i11 = i6;
                        i10 = i;
                        sArr4 = sArr;
                    }
                    iM11306 = (i9 - C19806.m45029("ܿᩴ")) * 97;
                    i = ((iM11306 ^ i8) * 12777) ^ 1907674868;
                    i5 = 1479767302;
                    i6 = iM11306 ^ i5;
                    runnable = runnable;
                    sb = null;
                    sArr = sArr4;
                    i11 = i6;
                    i10 = i;
                    sArr4 = sArr;
                    break;
                case -1713947095:
                case 179619964:
                    RunnableC1606.m5473();
                    break;
                case -1598839627:
                case -1016691532:
                    sArr4 = sArr4;
                    runnable = runnable;
                    if (C0050.f912 > 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܿᩳ") ^ i8;
                        i = ((iM45029 ^ i9) * (-19053)) ^ 564917293;
                        i2 = 2138764211;
                        i6 = iM45029 ^ i2;
                        runnable = runnable;
                        sArr = sArr4;
                        i11 = i6;
                        i10 = i;
                        sArr4 = sArr;
                    }
                    iM11306 = (i9 - C19806.m45029("ܿᩴ")) * 97;
                    i = ((iM11306 ^ i8) * 12777) ^ 1907674868;
                    i5 = 1479767302;
                    i6 = iM11306 ^ i5;
                    runnable = runnable;
                    sb = null;
                    sArr = sArr4;
                    i11 = i6;
                    i10 = i;
                    sArr4 = sArr;
                    break;
                case -1345586072:
                case -701181331:
                    sArr4 = sArr4;
                    runnable = runnable;
                    sArr2 = f69;
                    if (C7105.f23796 < 0) {
                        iM45029 = C19806.m45029("᩻۠") ^ i9;
                        i = ((iM45029 ^ i8) * 23751) ^ (-816063159);
                        i2 = 31695814;
                        i6 = iM45029 ^ i2;
                        runnable = runnable;
                        sArr = sArr4;
                        i11 = i6;
                        i10 = i;
                        sArr4 = sArr;
                    } else {
                        sArr4 = sArr4;
                        int iM11308 = (i9 - ThreadFactoryC3888.m11306("ܽۛ")) * (-105);
                        i11 = iM11308 ^ (-1177996500);
                        i10 = ((iM11308 ^ i8) * 24003) ^ (-1105998535);
                        runnable = runnable;
                    }
                    break;
                case -855961768:
                case -224084761:
                    CallableC1627.m5503(C2871.m8640(sArr4, i12, i13, i16));
                    sArr4 = sArr4;
                    iM11307 = (ThreadFactoryC3888.m11306("᩺ᩳ") + i9) * (-75);
                    i = ((iM11307 ^ i8) * (-24429)) ^ 2122259243;
                    i7 = 1000789847;
                    i6 = iM11307 ^ i7;
                    sArr = sArr4;
                    i11 = i6;
                    i10 = i;
                    sArr4 = sArr;
                    break;
                case -782999065:
                case 46854833:
                    C1977.m6365(runnable);
                    sArr4 = sArr4;
                    iM11307 = (ThreadFactoryC3888.m11306("᩺ᩳ") + i9) * (-75);
                    i = ((iM11307 ^ i8) * (-24429)) ^ 2122259243;
                    i7 = 1000789847;
                    i6 = iM11307 ^ i7;
                    sArr = sArr4;
                    i11 = i6;
                    i10 = i;
                    sArr4 = sArr;
                    break;
                case -731641443:
                case 1936038852:
                    C2704.m8256(C0817.m3407(sb));
                    sArr4 = sArr4;
                    iM11307 = (ThreadFactoryC3888.m11306("᩺ᩳ") + i9) * (-75);
                    i = ((iM11307 ^ i8) * (-24429)) ^ 2122259243;
                    i7 = 1000789847;
                    i6 = iM11307 ^ i7;
                    sArr = sArr4;
                    i11 = i6;
                    i10 = i;
                    sArr4 = sArr;
                    break;
                case -642127627:
                case 1863633610:
                    i16 = 55348;
                    iM45029 = (i9 - ThreadFactoryC3888.m11306("ܰܿ")) * 69;
                    i = ((iM45029 ^ i8) * (-23979)) ^ 570840052;
                    i2 = -704254847;
                    i6 = iM45029 ^ i2;
                    runnable = runnable;
                    sArr = sArr4;
                    i11 = i6;
                    i10 = i;
                    sArr4 = sArr;
                    break;
                case -228384750:
                case 1500074921:
                    sArr4 = f69;
                    i12 = 10;
                    i13 = 5;
                    if (!C1377.f5749) {
                        runnable = runnable;
                        int iM11309 = (i9 - ThreadFactoryC3888.m11306("ܽۛ")) * (-105);
                        i11 = iM11309 ^ (-1177996500);
                        i10 = ((iM11309 ^ i8) * 24003) ^ (-1105998535);
                        runnable = runnable;
                    } else {
                        iM450210 = (C19806.m45029("ᩳ۠") + i8) * (-17);
                        i3 = ((iM450210 ^ i9) * (-15125)) ^ (-271806062);
                        i4 = -284370436;
                        i11 = iM450210 ^ i4;
                        i10 = i3;
                    }
                    break;
                case -165339863:
                case 425112775:
                    sArr4 = sArr4;
                    CallableC1627.m5503(RunnableC0195.m1429(sArr3, i17, i18, i16));
                    runnable = C20364.f65940;
                    if (runnable != null) {
                        iM11307 = ThreadFactoryC3888.m11306("᩵ܽ") ^ i8;
                        i = ((iM11307 ^ i9) * (-8309)) ^ (-1341750854);
                        i7 = 31895104;
                    } else {
                        iM11307 = (ThreadFactoryC3888.m11306("᩺ᩳ") + i9) * (-75);
                        i = ((iM11307 ^ i8) * (-24429)) ^ 2122259243;
                        i7 = 1000789847;
                    }
                    i6 = iM11307 ^ i7;
                    sArr = sArr4;
                    i11 = i6;
                    i10 = i;
                    sArr4 = sArr;
                    break;
                case -164150224:
                case -112369320:
                    sArr4 = sArr4;
                    runnable = runnable;
                    int i23 = s + s2;
                    if (i15 - (i23 * i23) >= 0) {
                        iM45029 = C19806.m45029("ۜܳ") ^ i8;
                        i = ((iM45029 ^ i9) * 21325) ^ (-2142892929);
                        i2 = -1891045565;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩹۫") ^ i8) * 43;
                        i = ((iM45029 ^ i9) * 29723) ^ 840400427;
                        i2 = -676250518;
                    }
                    i6 = iM45029 ^ i2;
                    runnable = runnable;
                    sArr = sArr4;
                    i11 = i6;
                    i10 = i;
                    sArr4 = sArr;
                    break;
                case -80308298:
                case 1305084384:
                    sArr4 = sArr4;
                    runnable = runnable;
                    c = 0;
                    if (C2477.f9839 > 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۛ֨") ^ i8) * (-103);
                        i = ((iM45029 ^ i9) * (-911)) ^ (-1416196246);
                        i2 = 1537449657;
                        i6 = iM45029 ^ i2;
                        runnable = runnable;
                        sArr = sArr4;
                        i11 = i6;
                        i10 = i;
                        sArr4 = sArr;
                    } else {
                        sArr4 = sArr4;
                        int iM113010 = (i9 - ThreadFactoryC3888.m11306("ܽۛ")) * (-105);
                        i11 = iM113010 ^ (-1177996500);
                        i10 = ((iM113010 ^ i8) * 24003) ^ (-1105998535);
                        runnable = runnable;
                    }
                    break;
                case -16774899:
                case 293945657:
                    ThreadFactoryC3888.m11300();
                    if (C2642.f10294 > 0) {
                        sArr4 = sArr4;
                        runnable = runnable;
                        iM11306 = (i9 - C19806.m45029("ܿᩴ")) * 97;
                        i = ((iM11306 ^ i8) * 12777) ^ 1907674868;
                        i5 = 1479767302;
                        i6 = iM11306 ^ i5;
                        runnable = runnable;
                        sb = null;
                        sArr = sArr4;
                        i11 = i6;
                        i10 = i;
                        sArr4 = sArr;
                    } else {
                        runnable = runnable;
                        int iM113011 = (i9 - ThreadFactoryC3888.m11306("ܽۛ")) * (-105);
                        i11 = iM113011 ^ (-1177996500);
                        i10 = ((iM113011 ^ i8) * 24003) ^ (-1105998535);
                        runnable = runnable;
                    }
                    break;
                case 114444118:
                case 1362662565:
                    sArr4 = sArr4;
                    runnable = runnable;
                    i21 = baseResp.errCode;
                    if (i21 == 0) {
                        iM45029 = C19806.m45029("۠ۤ") ^ i9;
                        i = ((iM45029 ^ i8) * 9341) ^ 1126941699;
                        i2 = 507729515;
                    } else {
                        iM45029 = (C19806.m45029("ܶۨ") ^ i8) * (-75);
                        i = ((iM45029 ^ i9) * (-11011)) ^ 189997812;
                        i2 = -1714212823;
                    }
                    i6 = iM45029 ^ i2;
                    runnable = runnable;
                    sArr = sArr4;
                    i11 = i6;
                    i10 = i;
                    sArr4 = sArr;
                    break;
                case 196144757:
                case 989343517:
                    C3743.m10966();
                    if (!ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM450210 = (C19806.m45029("۟ᩴ") + i9) * (-79);
                        i3 = ((iM450210 ^ i8) * 23027) ^ 1952205184;
                        i4 = 1948538276;
                        i11 = iM450210 ^ i4;
                        i10 = i3;
                    } else {
                        runnable = runnable;
                        int iM113012 = (i9 - ThreadFactoryC3888.m11306("ܽۛ")) * (-105);
                        i11 = iM113012 ^ (-1177996500);
                        i10 = ((iM113012 ^ i8) * 24003) ^ (-1105998535);
                        runnable = runnable;
                    }
                    break;
                case 613783729:
                case 906665792:
                    short[] sArr5 = f69;
                    sArr4 = sArr4;
                    if (C3535.m10431() <= 0) {
                        runnable = runnable;
                        iM11306 = (i9 - C19806.m45029("ܿᩴ")) * 97;
                        i = ((iM11306 ^ i8) * 12777) ^ 1907674868;
                        i5 = 1479767302;
                        i6 = iM11306 ^ i5;
                        runnable = runnable;
                        sb = null;
                        sArr = sArr4;
                        i11 = i6;
                        i10 = i;
                    } else {
                        runnable = runnable;
                        String strM11312 = ThreadFactoryC3888.m11312(sArr5, 5, 5, i16);
                        if (C3286.f12186) {
                            iM11306 = (ThreadFactoryC3888.m11306("۟ܿ") + i8) * (-113);
                            i = ((iM11306 ^ i9) * 8615) ^ 1315034618;
                            i5 = -258672296;
                            i6 = iM11306 ^ i5;
                            runnable = runnable;
                            sb = null;
                            sArr = sArr4;
                            i11 = i6;
                            i10 = i;
                        } else {
                            StringBuilder sb2 = new StringBuilder(strM11312);
                            C0817.m3408(sb2, baseResp.errCode);
                            if (C1937.m6279() >= 0) {
                                sb = sb2;
                                sArr4 = sArr4;
                                int iM113013 = (i9 - ThreadFactoryC3888.m11306("ܽۛ")) * (-105);
                                i11 = iM113013 ^ (-1177996500);
                                i10 = ((iM113013 ^ i8) * 24003) ^ (-1105998535);
                                runnable = runnable;
                            } else {
                                int iM113014 = ThreadFactoryC3888.m11306("ۗ֨") ^ i8;
                                sb = sb2;
                                i10 = ((iM113014 ^ i9) * (-4515)) ^ 1457258832;
                                runnable = runnable;
                                sArr = sArr4;
                                i11 = iM113014 ^ (-1546340678);
                            }
                        }
                    }
                    sArr4 = sArr;
                    break;
                case 760416326:
                case 1171042952:
                    sArr4 = sArr4;
                    runnable = runnable;
                    if (i21 == -2) {
                        iM45029 = C19806.m45029("ۛۢ") ^ i9;
                        i = ((iM45029 ^ i8) * (-14785)) ^ (-401691186);
                        i2 = 356716845;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֫۬") ^ i8;
                        i = ((iM45029 ^ i9) * (-9601)) ^ (-1675232510);
                        i2 = -423895762;
                    }
                    i6 = iM45029 ^ i2;
                    runnable = runnable;
                    sArr = sArr4;
                    i11 = i6;
                    i10 = i;
                    sArr4 = sArr;
                    break;
                case 784462496:
                case 1393933739:
                    sArr4 = sArr4;
                    runnable = runnable;
                    s = sArr2[c];
                    i20 = s * s;
                    i14 = 3556996;
                    if (!C0962.f3784) {
                        iM45029 = C19806.m45029("ۧۧ") ^ i9;
                        i = ((iM45029 ^ i8) * (-5741)) ^ (-1501359225);
                        i2 = -2100042845;
                        i6 = iM45029 ^ i2;
                        runnable = runnable;
                        sArr = sArr4;
                        i11 = i6;
                        i10 = i;
                        sArr4 = sArr;
                    }
                    iM11306 = (ThreadFactoryC3888.m11306("۟ܿ") + i8) * (-113);
                    i = ((iM11306 ^ i9) * 8615) ^ 1315034618;
                    i5 = -258672296;
                    i6 = iM11306 ^ i5;
                    runnable = runnable;
                    sb = null;
                    sArr = sArr4;
                    i11 = i6;
                    i10 = i;
                    sArr4 = sArr;
                    break;
                case 1217832539:
                case 1610203227:
                    i16 = IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                    iM45029 = (i9 - ThreadFactoryC3888.m11306("ܰܿ")) * 69;
                    i = ((iM45029 ^ i8) * (-23979)) ^ 570840052;
                    i2 = -704254847;
                    i6 = iM45029 ^ i2;
                    runnable = runnable;
                    sArr = sArr4;
                    i11 = i6;
                    i10 = i;
                    sArr4 = sArr;
                    break;
                case 1303246599:
                case 1382617996:
                    sArr4 = sArr4;
                    runnable = runnable;
                    sArr3 = f69;
                    i17 = 1;
                    i18 = 4;
                    if (C2477.f9839 <= 0) {
                        iM45029 = (i8 - ThreadFactoryC3888.m11306("ۢ᩺")) * (-121);
                        i = ((iM45029 ^ i9) * 30723) ^ 1872652942;
                        i2 = 1474578740;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩵ۘ") ^ i9) * (-73);
                        i = ((iM45029 ^ i8) * 27739) ^ 1960849179;
                        i2 = 1366702823;
                    }
                    i6 = iM45029 ^ i2;
                    runnable = runnable;
                    sArr = sArr4;
                    i11 = i6;
                    i10 = i;
                    sArr4 = sArr;
                    break;
                case 1408878738:
                case 2066516351:
                    C1148.m4232();
                    C19806.m45024();
                    iM450210 = (C19806.m45029("۟ᩴ") + i9) * (-79);
                    i3 = ((iM450210 ^ i8) * 23027) ^ 1952205184;
                    i4 = 1948538276;
                    i11 = iM450210 ^ i4;
                    i10 = i3;
                    break;
                default:
                    C0278.m1783(this);
                    break;
            }
            return;
        }
    }
}
