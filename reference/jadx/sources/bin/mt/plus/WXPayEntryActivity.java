package bin.mt.plus;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.IWXAPIEventHandler;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import l.AbstractC0116;
import l.AbstractC3624;
import l.ActivityC8896;
import l.C0269;
import l.C0487;
import l.C0619;
import l.C0773;
import l.C0950;
import l.C1146;
import l.C1343;
import l.C13473;
import l.C1519;
import l.C1542;
import l.C1564;
import l.C17202;
import l.C1783;
import l.C17930;
import l.C1826;
import l.C20932;
import l.C2287;
import l.C2288;
import l.C2310;
import l.C2354;
import l.C2878;
import l.C3076;
import l.C3448;
import l.C3492;
import l.C3690;
import l.C3734;
import l.C3779;
import l.C3998;
import l.C4238;
import l.C4282;
import l.RunnableC3055;
import l.RunnableC3646;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: loaded from: classes.dex */
public class WXPayEntryActivity extends ActivityC8896 implements IWXAPIEventHandler {

    /* JADX INFO: renamed from: ᩳ۫ۘ, reason: not valid java name and contains not printable characters */
    private static final short[] f59 = {4274, 30449, 23814, 29134, 16705, 29940, 25659, -31033, -26575, 5118, 30449, 23814, -25739, 16392, 32342};
    public IWXAPI api;

    @Override // com.tencent.mm.opensdk.openapi.IWXAPIEventHandler
    public void onReq(BaseReq baseReq) {
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        int i = -1914954892;
        int i2 = C4282.f15546;
        int i3 = C3779.f12953;
        int iM2761 = C0619.m2761("᩹ᩴ") ^ i3;
        int i4 = ((iM2761 ^ i2) * (-2925)) ^ 970445876;
        int i5 = -1081137621;
        while (true) {
            i = ((((i ^ i2) * (-733)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2097574333:
                case 1451639721:
                    if (AbstractC3624.f12429 <= 0) {
                        iM2761 = (C0619.m2761("᩷᩷") + i3) * (-43);
                        i4 = ((iM2761 ^ i2) * 255) ^ (-1148327304);
                        i5 = 738377643;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ܳ᩻")) * 85;
                        i4 = ((iM2761 ^ i2) * 22447) ^ 1412705085;
                        i5 = 297389773;
                    }
                    break;
                case -1952606366:
                case 1385502499:
                    super.onNewIntent(intent);
                    if (C2878.m9491() <= 0) {
                        iM2761 = (C0619.m2761("ᩳۢ") + i3) * (-19);
                        i4 = ((iM2761 ^ i2) * (-14089)) ^ (-1723861306);
                        i5 = 1548131728;
                    } else {
                        iM2761 = (C0773.m3169("᩷۠") + i3) * (-79);
                        i4 = ((iM2761 ^ i2) * (-9971)) ^ 1907173987;
                        i5 = -1113118295;
                    }
                    break;
                case -1896144537:
                case -1589136289:
                    if (C0773.f2792 <= 0) {
                        iM2761 = (C0619.m2761("۠ۗ") ^ i3) * 7;
                        i4 = ((iM2761 ^ i2) * (-29865)) ^ (-988688963);
                        i5 = 282726528;
                    } else {
                        iM2761 = (C0619.m2761("ۛۜ") + i2) * (-93);
                        i4 = ((iM2761 ^ i3) * 18997) ^ 134604316;
                        i5 = -429170301;
                    }
                    break;
                case -1789262490:
                case -592420073:
                    setIntent(intent);
                    this.api.handleIntent(intent, this);
                    break;
                case -1777061882:
                case 1079602970:
                    if (RunnableC3055.f9898 >= 0) {
                        iM2761 = (C0619.m2761("᩷᩷") + i3) * (-43);
                        i4 = ((iM2761 ^ i2) * 255) ^ (-1148327304);
                        i5 = 738377643;
                    } else {
                        iM2761 = C0619.m2761("ۛۤ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-7717)) ^ 184413558;
                        i5 = -1998637568;
                    }
                    break;
                case -1511662684:
                case 871465927:
                    C3998.m12920();
                    C1542.m5459();
                    break;
                case -1271548339:
                case 451062979:
                    C1146.m4231();
                    C20932.m47848();
                    iM2761 = (C0619.m2761("۠ۗ") ^ i3) * 7;
                    i4 = ((iM2761 ^ i2) * (-29865)) ^ (-988688963);
                    i5 = 282726528;
                    break;
                case -1254973903:
                case 1171446107:
                    if (!C0619.f2439) {
                        iM2761 = C0773.m3169("֫᩷") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-10665)) ^ 1731631511;
                        i5 = 1044503034;
                    } else {
                        iM2761 = (C0773.m3169("ۗۚ") + i2) * 29;
                        i4 = ((iM2761 ^ i3) * 1553) ^ 1200245818;
                        i5 = -464187453;
                    }
                    break;
                case -1024426277:
                case -142963217:
                    C1519.m5403();
                    if (C1564.f5401 <= 0) {
                        iM2761 = (C0619.m2761("᩷᩷") + i3) * (-43);
                        i4 = ((iM2761 ^ i2) * 255) ^ (-1148327304);
                        i5 = 738377643;
                    } else {
                        iM2761 = C0773.m3169("֫᩷") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-10665)) ^ 1731631511;
                        i5 = 1044503034;
                    }
                    break;
                case -967553480:
                case 785939429:
                    if (!C17202.f56030) {
                        iM2761 = (C0619.m2761("۠ۗ") ^ i3) * 7;
                        i4 = ((iM2761 ^ i2) * (-29865)) ^ (-988688963);
                        i5 = 282726528;
                    } else {
                        iM2761 = C0773.m3169("֫᩷") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-10665)) ^ 1731631511;
                        i5 = 1044503034;
                    }
                    break;
                case -726365501:
                case 1100954303:
                    if (C0487.f2131 <= 0) {
                        iM2761 = C0773.m3169("֫᩷") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-10665)) ^ 1731631511;
                        i5 = 1044503034;
                    } else {
                        iM2761 = C0773.m3169("ܶۖ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-7577)) ^ 465096288;
                        i5 = 992271149;
                    }
                    break;
                case -553945877:
                case 1029291275:
                    if (C1826.f6190 <= 0) {
                        iM2761 = (C0619.m2761("ᩳۢ") + i3) * (-19);
                        i4 = ((iM2761 ^ i2) * (-14089)) ^ (-1723861306);
                        i5 = 1548131728;
                    } else {
                        iM2761 = (C0773.m3169("ܽۙ") ^ i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM2761 ^ i2) * (-7163)) ^ (-997997789);
                        i5 = 506660032;
                    }
                    break;
                case -207296334:
                case 295106266:
                    if (C2878.f9462) {
                        iM2761 = (C0619.m2761("۠ۗ") ^ i3) * 7;
                        i4 = ((iM2761 ^ i2) * (-29865)) ^ (-988688963);
                        i5 = 282726528;
                    } else {
                        iM2761 = (C0619.m2761("ۖܽ") ^ i2) * 7;
                        i4 = ((iM2761 ^ i3) * (-11827)) ^ 520191796;
                        i5 = 1105758177;
                    }
                    break;
                case 528974424:
                case 1820986573:
                    if (C4238.f15451 >= 0) {
                        iM2761 = (C0773.m3169("ۗۚ") + i2) * 29;
                        i4 = ((iM2761 ^ i3) * 1553) ^ 1200245818;
                        i5 = -464187453;
                    } else {
                        iM2761 = (C0773.m3169("ۘ᩷") ^ i3) * 99;
                        i4 = ((iM2761 ^ i2) * (-17003)) ^ (-984224828);
                        i5 = 2044044261;
                    }
                    break;
                case 705309337:
                case 1448641185:
                    if (C2287.f7432 >= 0) {
                        iM2761 = (C0619.m2761("᩷᩷") + i3) * (-43);
                        i4 = ((iM2761 ^ i2) * 255) ^ (-1148327304);
                        i5 = 738377643;
                    } else {
                        iM2761 = (i2 - C0773.m3169("ۜ᩻")) * (-11);
                        i4 = ((iM2761 ^ i3) * (-23705)) ^ 1048070018;
                        i5 = 998724551;
                    }
                    break;
                default:
                    if (C2288.m7767()) {
                        iM2761 = (C0619.m2761("᩷᩷") + i3) * (-43);
                        i4 = ((iM2761 ^ i2) * 255) ^ (-1148327304);
                        i5 = 738377643;
                    } else {
                        iM2761 = C0619.m2761("ۘۚ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-6959)) ^ (-1952068688);
                        i5 = 1983279924;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.ActivityC8896, android.app.Activity
    public void onCreate(Bundle bundle) {
        String strM10032 = null;
        IWXAPI iwxapiCreateWXAPI = null;
        int i = 129432704;
        int i2 = C3734.f12817;
        int i3 = C3448.f11240;
        int iM2761 = (C0619.m2761("ۡܽ") + i2) * 3;
        int i4 = ((iM2761 ^ i3) * (-4343)) ^ (-1442486038);
        int i5 = 1672487862;
        while (true) {
            i = ((((i ^ i3) * 20127) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -1848660465:
                case 1068637170:
                    C1783.m6232();
                    if (C0773.f2792 > 0) {
                        iM2761 = C0773.m3169("ۗۛ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-12331)) ^ 371481807;
                        i5 = -2096633826;
                    } else {
                        iM2761 = C0773.m3169("ܺ֨") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-22825)) ^ (-659262874);
                        i5 = -557317306;
                    }
                    break;
                case -1626056579:
                case 2044042621:
                    C17930 c17930 = C3076.f9993;
                    strM10032 = C3076.m10032();
                    if (AbstractC0116.f1064 <= 0) {
                        iM2761 = C0619.m2761("ᩳ۟") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-27495)) ^ (-2138400511);
                        i5 = -573410800;
                    } else {
                        iM2761 = (C0619.m2761("֫۟") + i3) * (-11);
                        i4 = ((iM2761 ^ i2) * (-4677)) ^ (-350866758);
                        i5 = -1590439315;
                    }
                    break;
                case -1615839765:
                case 165309121:
                    super.onCreate(bundle);
                    if (C2310.f7472 >= 0) {
                        iM2761 = C0619.m2761("ᩳ۟") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-27495)) ^ (-2138400511);
                        i5 = -573410800;
                    } else {
                        iM2761 = C0773.m3169("᩶֨") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-9077)) ^ (-1147658065);
                        i5 = 168275766;
                    }
                    break;
                case -1432775199:
                case 897645929:
                    iwxapiCreateWXAPI.handleIntent(C13473.m33143(this), this);
                    break;
                case -1135504190:
                case -595254743:
                    if (C1343.f4799 != 0) {
                        iM2761 = C0773.m3169("ۗۛ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-12331)) ^ 371481807;
                        i5 = -2096633826;
                    } else {
                        iM2761 = C0773.m3169("ۗ۠") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-15483)) ^ 167332446;
                        i5 = -360484533;
                    }
                    break;
                case -916360044:
                case 46798596:
                    if (C1519.f5300 >= 0) {
                        iM2761 = (C0619.m2761("ۗᩴ") ^ i2) * (-5);
                        i4 = ((iM2761 ^ i3) * (-28589)) ^ 216258883;
                        i5 = 689784798;
                    } else {
                        iM2761 = C0619.m2761("۠᩻") ^ i2;
                        i4 = ((iM2761 ^ i3) * 19107) ^ 1536297284;
                        i5 = -2049050631;
                    }
                    break;
                case -825366824:
                case -558398838:
                    if (AbstractC3624.f12429 <= 0) {
                        iM2761 = C0773.m3169("ܺ֨") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-22825)) ^ (-659262874);
                        i5 = -557317306;
                    } else {
                        iM2761 = C0773.m3169("᩻ۧ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 4167) ^ (-20054353);
                        i5 = -510595669;
                    }
                    break;
                case -643512260:
                case 754696820:
                    if (C0950.f3488 >= 0) {
                        iM2761 = C0619.m2761("ᩳ۟") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-27495)) ^ (-2138400511);
                        i5 = -573410800;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ۛۢ")) * (-109);
                        i4 = ((iM2761 ^ i2) * 9115) ^ 175509869;
                        i5 = -385873278;
                    }
                    break;
                case -471172455:
                case 191285736:
                    C2288.m7767();
                    C3492.m11488();
                    iM2761 = C0773.m3169("ܺ֨") ^ i2;
                    i4 = ((iM2761 ^ i3) * (-22825)) ^ (-659262874);
                    i5 = -557317306;
                    break;
                case -235400529:
                case 987636830:
                    if (C0487.m2356() >= 0) {
                        iM2761 = C0619.m2761("ᩳ۟") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-27495)) ^ (-2138400511);
                        i5 = -573410800;
                    } else {
                        iM2761 = C0773.m3169("ۨ۠") ^ i2;
                        i4 = ((iM2761 ^ i3) * 4749) ^ 1221326697;
                        i5 = 1269272779;
                    }
                    break;
                case -147627725:
                case 737427691:
                    if (C2354.f7599 >= 0) {
                        iM2761 = C0619.m2761("ᩳ۟") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-27495)) ^ (-2138400511);
                        i5 = -573410800;
                    } else {
                        iM2761 = C0773.m3169("ܺᩴ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-6751)) ^ (-1766642995);
                        i5 = 1286929663;
                    }
                    break;
                case -53957485:
                case 281925339:
                    if (C0269.f1558 <= 0) {
                        iM2761 = (C0619.m2761("ۗᩴ") ^ i2) * (-5);
                        i4 = ((iM2761 ^ i3) * (-28589)) ^ 216258883;
                        i5 = 689784798;
                    } else {
                        iM2761 = (C0773.m3169("᩶ۤ") ^ i3) * (-73);
                        i4 = ((iM2761 ^ i2) * (-6547)) ^ 1550450997;
                        i5 = -380953901;
                    }
                    break;
                case 477601151:
                case 1220642405:
                    C1343.m4943();
                    if (C3690.f12684 > 0) {
                        iM2761 = (C0619.m2761("ۗᩴ") ^ i2) * (-5);
                        i4 = ((iM2761 ^ i3) * (-28589)) ^ 216258883;
                        i5 = 689784798;
                    } else {
                        iM2761 = (C0619.m2761("᩵ۖ") + i3) * (-31);
                        i4 = ((iM2761 ^ i2) * (-4293)) ^ 568881275;
                        i5 = 1027897438;
                    }
                    break;
                case 1272457297:
                case 1434874256:
                    RunnableC3646.m11813();
                    C4282.m13644();
                    break;
                case 1596677956:
                case 1800310364:
                    if (!C1146.m4231()) {
                        iM2761 = (C0619.m2761("᩵ۖ") + i3) * (-31);
                        i4 = ((iM2761 ^ i2) * (-4293)) ^ 568881275;
                        i5 = 1027897438;
                    } else {
                        iM2761 = C0773.m3169("ܺ֨") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-22825)) ^ (-659262874);
                        i5 = -557317306;
                    }
                    break;
                default:
                    iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(this, strM10032);
                    this.api = iwxapiCreateWXAPI;
                    if (C2354.f7599 >= 0) {
                        iM2761 = C0619.m2761("ᩳ۟") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-27495)) ^ (-2138400511);
                        i5 = -573410800;
                    } else {
                        iM2761 = C0619.m2761("ۧܽ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-11303)) ^ (-501076919);
                        i5 = 1065977454;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0290 A[PHI: r7 r9 r10 r11 r22 r24 r25
      0x0290: PHI (r7v4 short) = (r7v3 short), (r7v2 short) binds: [B:69:0x028e, B:65:0x0269] A[DONT_GENERATE, DONT_INLINE]
      0x0290: PHI (r9v4 int) = (r9v3 int), (r9v2 int) binds: [B:69:0x028e, B:65:0x0269] A[DONT_GENERATE, DONT_INLINE]
      0x0290: PHI (r10v3 int) = (r10v2 int), (r10v4 int) binds: [B:69:0x028e, B:65:0x0269] A[DONT_GENERATE, DONT_INLINE]
      0x0290: PHI (r11v3 short) = (r11v2 short), (r11v4 short) binds: [B:69:0x028e, B:65:0x0269] A[DONT_GENERATE, DONT_INLINE]
      0x0290: PHI (r22v6 short[]) = (r22v5 short[]), (r22v7 short[]) binds: [B:69:0x028e, B:65:0x0269] A[DONT_GENERATE, DONT_INLINE]
      0x0290: PHI (r24v3 int) = (r24v2 int), (r24v1 int) binds: [B:69:0x028e, B:65:0x0269] A[DONT_GENERATE, DONT_INLINE]
      0x0290: PHI (r25v4 java.lang.Runnable) = (r25v3 java.lang.Runnable), (r25v5 java.lang.Runnable) binds: [B:69:0x028e, B:65:0x0269] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0081, code lost:
    
        if (l.C11235.f35427 >= 0) goto L8;
     */
    @Override // com.tencent.mm.opensdk.openapi.IWXAPIEventHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResp(com.tencent.mm.opensdk.modelbase.BaseResp r28) {
        /*
            Method dump skipped, instruction units count: 1032
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bin.mt.plus.WXPayEntryActivity.onResp(com.tencent.mm.opensdk.modelbase.BaseResp):void");
    }
}
