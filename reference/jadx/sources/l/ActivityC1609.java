package l;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import com.google.android.material.tabs.TabLayout;
import com.umeng.analytics.pro.o;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.֫ۚۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: H3YF */
/* JADX INFO: loaded from: classes3.dex */
public class ActivityC1609 extends AbstractActivityC12483 {

    /* JADX INFO: renamed from: ֡֫ܰ, reason: not valid java name and contains not printable characters */
    private static final short[] f6494 = {5089, -26936, 29275, 18003, 30412, 28694, 18131, 28962, 27736, -29167, 25056, 31474, -30340, 27434, -24889, 25202, -31127, -30943, -24767, 19239, 32346, 26314, 2515, 23557, 19128, -18026, -31159, -18852, 17271, 7945, -12295, -4432, 3379, 3119, 6692, -2862, -4623, -1040, 5981, -2324, -2024, 296, -32415, -32438, -32435, 7947, 10573, 10609, 10600, 10618, 10612, 10611, 10576, 10620, 10611, 10620, 10618, 10616, 10588, 10622, 10601, 10612, 10603, 10612, 10601, 10596};

    /* JADX INFO: renamed from: ۜܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f6495 = 0;

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public MenuItem f6496;

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public C11674 f6497;

    /* JADX INFO: renamed from: ۘܰ, reason: not valid java name and contains not printable characters */
    public C17318 f6498;

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public boolean f6499;

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public C1439 f6500;

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public C8852 f6501;

    @Override // l.AbstractActivityC12483
    /* JADX INFO: renamed from: ۡ */
    public final String mo126() {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        short s2 = 0;
        int i3 = 0;
        short[] sArr2 = null;
        int i4 = 0;
        int i5 = -927649107;
        int i6 = C1066.f4915;
        int i7 = C1977.f7413;
        int iM45029 = (i7 - C19806.m45029("᩷᩺")) * (-17);
        int i8 = ((iM45029 ^ i6) * (-20331)) ^ (-1214338613);
        int i9 = 1317070225;
        while (true) {
            i5 = ((((i5 ^ i6) * (-10979)) >> 31) & i8) ^ (iM45029 ^ i9);
            switch (i5) {
                case -2098618499:
                case 1775123662:
                    RunnableC3388.m10064();
                    if (!C0797.f3386) {
                        iM45029 = (i6 - ThreadFactoryC3888.m11306("ᩳ֫")) * (-23);
                        i8 = ((iM45029 ^ i7) * (-25771)) ^ (-1367178190);
                        i9 = 95003656;
                    } else {
                        iM45029 = (C19806.m45029("ۡ۬") + i7) * 69;
                        i8 = ((iM45029 ^ i6) * (-16715)) ^ 2095776370;
                        i9 = 469987409;
                    }
                    break;
                case -2020733428:
                case 2011784018:
                    c = '-';
                    if (C2124.f7782 <= 0) {
                        iM45029 = (C19806.m45029("ۧ۠") + i6) * 69;
                        i8 = ((iM45029 ^ i7) * (-29337)) ^ (-1780697450);
                        i9 = -2092731364;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩺۠") ^ i7;
                        i8 = ((iM45029 ^ i6) * 29383) ^ 1027606853;
                        i9 = 843475185;
                    }
                    break;
                case -1340005580:
                case 1233063540:
                    sArr2 = f6494;
                    i4 = 46;
                    if (C3286.f12186) {
                        iM45029 = ThreadFactoryC3888.m11306("ܿ֨") ^ i7;
                        i8 = ((iM45029 ^ i6) * (-20101)) ^ 986181134;
                        i9 = -1802064280;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۠֨") + i6) * (-71);
                        i8 = ((iM45029 ^ i7) * (-24949)) ^ 2127173179;
                        i9 = -1484860401;
                    }
                    break;
                case -1322856178:
                case 1428500900:
                    if (i2 - (s * s2) >= 0) {
                        iM45029 = C19806.m45029("᩵ܺ") ^ i6;
                        i8 = ((iM45029 ^ i7) * (-21625)) ^ (-1918842954);
                        i9 = 578473497;
                    } else {
                        iM45029 = (i6 - C19806.m45029("ᩳ۟")) * (-117);
                        i8 = ((iM45029 ^ i7) * (-26551)) ^ 1103783534;
                        i9 = 1115118329;
                    }
                    break;
                case -1189777100:
                case 491236034:
                    if (C0671.f2816 != 0) {
                        iM45029 = (C19806.m45029("ۡ۬") + i7) * 69;
                        i8 = ((iM45029 ^ i6) * (-16715)) ^ 2095776370;
                        i9 = 469987409;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩻᩵") ^ i6) * (-17);
                        i8 = ((iM45029 ^ i7) * (-3875)) ^ 1987135670;
                        i9 = 1235441118;
                    }
                    break;
                case -1167621951:
                case -951145188:
                    i2 = 32205625 + i;
                    if (C3535.m10431() <= 0) {
                        iM45029 = (C19806.m45029("ۧ۠") + i6) * 69;
                        i8 = ((iM45029 ^ i7) * (-29337)) ^ (-1780697450);
                        i9 = -2092731364;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܳۖ") ^ i7;
                        i8 = ((iM45029 ^ i6) * 7613) ^ (-1482070674);
                        i9 = 1752450759;
                    }
                    break;
                case -1074871509:
                case 980499776:
                    s2 = 11350;
                    if (C3722.f13525 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۜۨ") ^ i7;
                        i8 = ((iM45029 ^ i6) * 4367) ^ 2137321289;
                        i9 = -789784203;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩻ܽ") ^ i7;
                        i8 = ((iM45029 ^ i6) * (-627)) ^ 1713446530;
                        i9 = -484413272;
                    }
                    break;
                case -1072843505:
                case 740196835:
                    i3 = 49108;
                    iM45029 = (C19806.m45029("᩹ۤ") ^ i7) * (-27);
                    i8 = ((iM45029 ^ i6) * (-747)) ^ (-672544983);
                    i9 = -378708129;
                    break;
                case -1017634082:
                case -862797280:
                    sArr = f6494;
                    if (ThreadFactoryC3888.m11300() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۜۨ") ^ i7;
                        i8 = ((iM45029 ^ i6) * 4367) ^ 2137321289;
                        i9 = -789784203;
                    } else {
                        iM45029 = (C19806.m45029("᩺᩵") + i7) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i8 = ((iM45029 ^ i6) * 7637) ^ (-111095895);
                        i9 = -1012796525;
                    }
                    break;
                case -963390043:
                case 1776180474:
                    C3577.m10565();
                    AbstractC0464.m2313();
                    iM45029 = (C19806.m45029("ۡ۬") + i7) * 69;
                    i8 = ((iM45029 ^ i6) * (-16715)) ^ 2095776370;
                    i9 = 469987409;
                    break;
                case -962174062:
                case 264375526:
                    if (CallableC1627.f6528) {
                        iM45029 = (i7 - ThreadFactoryC3888.m11306("ۘۗ")) * 101;
                        i8 = ((iM45029 ^ i6) * 28609) ^ (-1929233759);
                        i9 = -487207091;
                    } else {
                        iM45029 = (C19806.m45029("ۡ۬") + i7) * 69;
                        i8 = ((iM45029 ^ i6) * (-16715)) ^ 2095776370;
                        i9 = 469987409;
                    }
                    break;
                case -640952370:
                case 818627094:
                    C3577.m10565();
                    if (C1377.m4833() != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܿ֨") ^ i7;
                        i8 = ((iM45029 ^ i6) * (-20101)) ^ 986181134;
                        i9 = -1802064280;
                    } else {
                        iM45029 = (C19806.m45029("ۡ۬") + i7) * 69;
                        i8 = ((iM45029 ^ i6) * (-16715)) ^ 2095776370;
                        i9 = 469987409;
                    }
                    break;
                case -391002817:
                case 873365912:
                    C3535.m10431();
                    if (C3722.f13525 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۜۨ") ^ i7;
                        i8 = ((iM45029 ^ i6) * 4367) ^ 2137321289;
                        i9 = -789784203;
                    } else {
                        iM45029 = (i6 - ThreadFactoryC3888.m11306("ᩳ֫")) * (-23);
                        i8 = ((iM45029 ^ i7) * (-25771)) ^ (-1367178190);
                        i9 = 95003656;
                    }
                    break;
                case 110531364:
                case 227986463:
                    if (C1460.m5050() != 0) {
                        iM45029 = (C19806.m45029("ۡ۬") + i7) * 69;
                        i8 = ((iM45029 ^ i6) * (-16715)) ^ 2095776370;
                        i9 = 469987409;
                    } else {
                        iM45029 = (C19806.m45029("ܽۘ") ^ i6) * (-119);
                        i8 = ((iM45029 ^ i7) * (-11297)) ^ (-2065545325);
                        i9 = 1939502575;
                    }
                    break;
                case 129875066:
                case 598143425:
                    RunnableC0195.m1431();
                    C2249.m6915();
                    return null;
                case 727033344:
                case 1384076610:
                    if (C1066.f4915 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܿ֨") ^ i7;
                        i8 = ((iM45029 ^ i6) * (-20101)) ^ 986181134;
                        i9 = -1802064280;
                    } else {
                        iM45029 = (i6 - ThreadFactoryC3888.m11306("ۚۨ")) * 15;
                        i8 = ((iM45029 ^ i7) * (-16787)) ^ (-2120480849);
                        i9 = -126918657;
                    }
                    break;
                case 953547650:
                case 1614859987:
                    s = sArr[c];
                    i = s * s;
                    if (C0050.m946() <= 0) {
                        iM45029 = (C19806.m45029("ۧ۠") + i6) * 69;
                        i8 = ((iM45029 ^ i7) * (-29337)) ^ (-1780697450);
                        i9 = -2092731364;
                    } else {
                        iM45029 = (C19806.m45029("ۚ᩵") ^ i6) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i8 = ((iM45029 ^ i7) * 29705) ^ (-387012684);
                        i9 = 790268921;
                    }
                    break;
                case 1877803273:
                case 1995476388:
                    return C0797.m3361(sArr2, i4, 20, i3);
                default:
                    i3 = 10525;
                    iM45029 = (C19806.m45029("᩹ۤ") ^ i7) * (-27);
                    i8 = ((iM45029 ^ i6) * (-747)) ^ (-672544983);
                    i9 = -378708129;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m5490() {
        MenuItem menuItem = null;
        boolean z = false;
        int i = 1072367943;
        int i2 = C1148.f5161;
        int i3 = C1398.f5802;
        int iM45029 = (i3 - C19806.m45029("ۚۚ")) * (-49);
        int i4 = ((iM45029 ^ i2) * (-9047)) ^ 1460648945;
        int i5 = -269126405;
        while (true) {
            i = ((((i ^ i2) * 26649) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2099467624:
                case -1223183063:
                    z = true;
                    iM45029 = ThreadFactoryC3888.m11306("ܺ᩺") ^ i2;
                    i4 = ((iM45029 ^ i3) * 9333) ^ 177985617;
                    i5 = 791278486;
                    break;
                case -1893711731:
                case 787469608:
                    if (C1377.m4833() != 0) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("֫᩵")) * 77;
                        i4 = ((iM45029 ^ i3) * 22223) ^ (-1247758095);
                        i5 = 132764990;
                    } else {
                        iM45029 = C19806.m45029("ܿܺ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 4361) ^ (-1826639554);
                        i5 = 1371414571;
                    }
                    break;
                case -1646039143:
                case -532655043:
                    if (C2477.f9839 <= 0) {
                        iM45029 = C19806.m45029("۟ۛ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-6555)) ^ (-1031129759);
                        i5 = -668859269;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܺۛ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 20657) ^ (-563043416);
                        i5 = 865980444;
                    }
                    break;
                case -1539590453:
                case -436103851:
                    z = false;
                    iM45029 = ThreadFactoryC3888.m11306("ܺ᩺") ^ i2;
                    i4 = ((iM45029 ^ i3) * 9333) ^ 177985617;
                    i5 = 791278486;
                    break;
                case -1483636160:
                case 312043071:
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    ThreadFactoryC3888.m11300();
                    iM45029 = ThreadFactoryC3888.m11306("᩵ܿ") ^ i3;
                    i4 = ((iM45029 ^ i2) * 24555) ^ 962667117;
                    i5 = 74864023;
                    break;
                case -1383176672:
                case -549428262:
                    if (C0629.f2722 <= 0) {
                        iM45029 = (C19806.m45029("᩷ۛ") + i2) * 27;
                        i4 = ((iM45029 ^ i3) * 26657) ^ 442752253;
                        i5 = -1529951103;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۢܺ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-6927)) ^ 2076070941;
                        i5 = -706564474;
                    }
                    break;
                case -1369506428:
                case -348087984:
                    if (this.f6499) {
                        iM45029 = ThreadFactoryC3888.m11306("ۛۖ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 27093) ^ 320299452;
                        i5 = 1436306778;
                    } else {
                        iM45029 = (C19806.m45029("۠ۖ") ^ i3) * 35;
                        i4 = ((iM45029 ^ i2) * (-6329)) ^ (-1704614956);
                        i5 = 1204043082;
                    }
                    break;
                case -1028372622:
                case 1387074493:
                    menuItem = this.f6496;
                    if (menuItem != null) {
                        iM45029 = (C19806.m45029("ۛۛ") + i2) * 97;
                        i4 = ((iM45029 ^ i3) * 8255) ^ 446047410;
                        i5 = -854110621;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۢ֨") + i3) * (-95);
                        i4 = ((iM45029 ^ i2) * (-20199)) ^ 1384473028;
                        i5 = -978025741;
                    }
                    break;
                case -948228848:
                case 662317744:
                    break;
                case -615008511:
                case -594744568:
                    if (C1398.f5802 > 0) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("֫᩵")) * 77;
                        i4 = ((iM45029 ^ i3) * 22223) ^ (-1247758095);
                        i5 = 132764990;
                    } else {
                        iM45029 = C19806.m45029("۟ۛ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-6555)) ^ (-1031129759);
                        i5 = -668859269;
                    }
                    break;
                case -523067910:
                case 2058088973:
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM45029 = (i2 - C19806.m45029("᩹۟")) * (-35);
                        i4 = ((iM45029 ^ i3) * (-18455)) ^ (-1649794844);
                        i5 = 386409252;
                    } else {
                        iM45029 = C19806.m45029("᩵ܳ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-13213)) ^ (-1411572458);
                        i5 = 1362183804;
                    }
                    break;
                case -260528740:
                case -17348637:
                    if (C0526.f2219) {
                        iM45029 = (C19806.m45029("᩷ۛ") + i2) * 27;
                        i4 = ((iM45029 ^ i3) * 26657) ^ 442752253;
                        i5 = -1529951103;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۡۡ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-16547)) ^ (-53089315);
                        i5 = 756978298;
                    }
                    break;
                case -151046523:
                case 2049394911:
                    if (!RunnableC0195.m1431()) {
                        iM45029 = C19806.m45029("۟ۛ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-6555)) ^ (-1031129759);
                        i5 = -668859269;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩵ܿ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 24555) ^ 962667117;
                        i5 = 74864023;
                    }
                    break;
                case -150969265:
                case 707775462:
                    if (this.f6500.m5031()) {
                        iM45029 = (C19806.m45029("۠ۖ") ^ i3) * 35;
                        i4 = ((iM45029 ^ i2) * (-6329)) ^ (-1704614956);
                        i5 = 1204043082;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩵᩻") ^ i3;
                        i4 = ((iM45029 ^ i2) * o.a.i) ^ 2045838125;
                        i5 = -1677603214;
                    }
                    break;
                case 146977898:
                case 1794523975:
                    if (C3722.f13525 <= 0) {
                        iM45029 = (C19806.m45029("᩷ۛ") + i2) * 27;
                        i4 = ((iM45029 ^ i3) * 26657) ^ 442752253;
                        i5 = -1529951103;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩸ۗ") ^ i3) * 9;
                        i4 = ((iM45029 ^ i2) * 22333) ^ 1147852987;
                        i5 = 776529298;
                    }
                    break;
                case 411566848:
                case 1429203747:
                    if (C0962.m3746() >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩵ܿ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 24555) ^ 962667117;
                        i5 = 74864023;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩷ܶ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 6135) ^ (-1732123272);
                        i5 = 1113512076;
                    }
                    break;
                case 465264317:
                case 794843904:
                    RunnableC1564.m5345();
                    break;
                case 590074847:
                case 1039056628:
                    if (ThreadFactoryC3888.m11300() <= 0) {
                        iM45029 = C19806.m45029("᩵ܳ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-13213)) ^ (-1411572458);
                        i5 = 1362183804;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۤ֨") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-30419)) ^ 829952223;
                        i5 = -1751496386;
                    }
                    break;
                case 791343729:
                case 893310834:
                    if (C2871.f10837 >= 0) {
                        iM45029 = C19806.m45029("᩵ܳ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-13213)) ^ (-1411572458);
                        i5 = 1362183804;
                    } else {
                        iM45029 = C19806.m45029("ۘ۫") ^ i2;
                        i4 = ((iM45029 ^ i3) * 10575) ^ (-1339471894);
                        i5 = 2003907230;
                    }
                    break;
                case 1186931906:
                case 1352291569:
                    C0817.m3411(menuItem, z);
                    iM45029 = (ThreadFactoryC3888.m11306("ۢ֨") + i3) * (-95);
                    i4 = ((iM45029 ^ i2) * (-20199)) ^ 1384473028;
                    i5 = -978025741;
                    break;
                case 1268971786:
                case 1868544743:
                    C0671.m3008();
                    if (C1461.f5957 <= 0) {
                        iM45029 = C19806.m45029("᩵ܳ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-13213)) ^ (-1411572458);
                        i5 = 1362183804;
                    } else {
                        iM45029 = C19806.m45029("۟ۛ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-6555)) ^ (-1031129759);
                        i5 = -668859269;
                    }
                    break;
                default:
                    if (RunnableC1606.f6488 >= 0) {
                        iM45029 = (C19806.m45029("᩷ۛ") + i2) * 27;
                        i4 = ((iM45029 ^ i3) * 26657) ^ 442752253;
                        i5 = -1529951103;
                    } else {
                        iM45029 = C19806.m45029("᩸᩵") ^ i3;
                        i4 = ((iM45029 ^ i2) * 21067) ^ (-1463007570);
                        i5 = 505982066;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x025f A[PHI: r8 r9
      0x025f: PHI (r8v62 int) = (r8v44 int), (r8v44 int), (r8v1 int) binds: [B:44:0x0248, B:47:0x025d, B:132:0x025f] A[DONT_GENERATE, DONT_INLINE]
      0x025f: PHI (r9v4 l.ۡۨۘ) = (r9v1 l.ۡۨۘ), (r9v2 l.ۡۨۘ), (r9v1 l.ۡۨۘ) binds: [B:44:0x0248, B:47:0x025d, B:132:0x025f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractActivityC12483, l.ActivityC4866, l.ActivityC19126, l.ActivityC1086, l.ActivityC16858, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C14311 c14311;
        int iM11306;
        int i;
        int i2;
        int i3;
        int iM11307;
        int i4;
        int iM45029;
        int i5;
        int i6;
        int i7;
        C6938 c6938;
        short[] sArr;
        int iM11308;
        int i8;
        int i9;
        int iM11309;
        int i10;
        int i11;
        ActivityC1609 activityC1609 = this;
        ViewOnClickListenerC22460 viewOnClickListenerC22460 = null;
        C6938 c6939 = null;
        C1439 c1439 = null;
        int i12 = 0;
        C8852 c8852 = null;
        C11674 c11674 = null;
        C1439 c14310 = null;
        TabLayout tabLayout = null;
        C19383 c19383 = null;
        C10783 c10783 = null;
        int i13 = 0;
        String strM6918 = null;
        String strM10423 = null;
        int iM450210 = 0;
        int iM113010 = 0;
        int i14 = 0;
        int i15 = -1625971164;
        int i16 = C1668.f6641;
        int i17 = C10634.f36300;
        int iM450211 = (C19806.m45029("᩷ۨ") + i17) * 71;
        int i18 = ((iM450211 ^ i16) * 18209) ^ 1231451951;
        int i19 = iM450211 ^ (-1382584932);
        C14494 onBackPressedDispatcher = null;
        C6938 c69310 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i20 = 0;
        int iM113011 = 0;
        View viewM1436 = null;
        short s = 0;
        int i21 = 0;
        int i22 = 0;
        C14311 c14312 = null;
        int i23 = 0;
        while (true) {
            i15 = i19 ^ (i18 & (((i15 ^ i16) * (-26005)) >> 31));
            switch (i15) {
                case -1877970758:
                case -1723920641:
                    i12 = i12;
                    c69310 = c69310;
                    sArr2 = sArr2;
                    i21 = i21;
                    i22 = i22;
                    sArr3 = sArr3;
                    C14311 c14313 = c14312;
                    onBackPressedDispatcher = onBackPressedDispatcher;
                    c14311 = c14313;
                    C2332.m7083(activityC1609, iM113011 ^ i13);
                    strM6918 = C2249.m6918(f6494, 4, 3, i20);
                    if (C2249.f8050 >= 0) {
                        iM11307 = ThreadFactoryC3888.m11306("ܿ᩻") ^ i17;
                        i18 = ((iM11307 ^ i16) * (-19919)) ^ (-528687960);
                        i4 = 2137439480;
                    } else {
                        iM11307 = C19806.m45029("᩸᩺") ^ i16;
                        i18 = ((iM11307 ^ i17) * (-20717)) ^ 490863643;
                        i4 = 1956447397;
                    }
                    i3 = iM11307 ^ i4;
                    i21 = i21;
                    sArr3 = sArr3;
                    i12 = i12;
                    i22 = i22;
                    sArr2 = sArr2;
                    i19 = i3;
                    c69310 = c69310;
                    activityC1609 = this;
                    C14494 c14494 = onBackPressedDispatcher;
                    c14312 = c14311;
                    onBackPressedDispatcher = c14494;
                    break;
                case -1757980539:
                case -1654239876:
                    c19383.m44413(i12);
                    i12 = i12;
                    iM45029 = (C19806.m45029("֡ۘ") ^ i17) * 67;
                    i5 = ((iM45029 ^ i16) * 13135) ^ 2070683586;
                    i6 = 507866448;
                    i19 = iM45029 ^ i6;
                    i18 = i5;
                    i12 = i12;
                    break;
                case -1597481186:
                case 1191757034:
                    i12 = i12;
                    c69310 = c69310;
                    sArr2 = sArr2;
                    i21 = i21;
                    i22 = i22;
                    sArr3 = sArr3;
                    C14311 c14314 = c14312;
                    onBackPressedDispatcher = onBackPressedDispatcher;
                    c14311 = c14314;
                    short s2 = s;
                    if ((s2 * 26296) - (i14 * i14) > 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۚۛ") ^ i17;
                        i = ((iM11306 ^ i16) * (-10759)) ^ 265252950;
                        i2 = -990668942;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۫۫") + i16) * 51;
                        i = ((iM11306 ^ i17) * (-20221)) ^ 1480160829;
                        i2 = 1852017151;
                    }
                    i3 = iM11306 ^ i2;
                    s = s2;
                    i18 = i;
                    i21 = i21;
                    sArr3 = sArr3;
                    i12 = i12;
                    i22 = i22;
                    sArr2 = sArr2;
                    i19 = i3;
                    c69310 = c69310;
                    activityC1609 = this;
                    C14494 c14495 = onBackPressedDispatcher;
                    c14312 = c14311;
                    onBackPressedDispatcher = c14495;
                    break;
                case -1588316840:
                case 264934348:
                    C0797.m3359();
                    break;
                case -1582725118:
                case -269423236:
                    i7 = i12;
                    c6938 = c69310;
                    sArr = sArr3;
                    C6938 c69311 = (C6938) viewM1436;
                    activityC1609.f41645 = c69311;
                    C0216.m1585(activityC1609, c69311);
                    onBackPressedDispatcher = getOnBackPressedDispatcher();
                    C14311 c14315 = new C14311(activityC1609);
                    RunnableC3388.m10051(onBackPressedDispatcher);
                    if (ViewTreeObserverOnPreDrawListenerC3327.m9874()) {
                        c14312 = c14315;
                        iM11308 = (C19806.m45029("᩶ܽ") ^ i17) * 75;
                        i8 = ((iM11308 ^ i16) * 20731) ^ 1031477197;
                        i9 = 1444128636;
                        i19 = iM11308 ^ i9;
                        i18 = i8;
                    } else {
                        int iM450212 = C19806.m45029("᩶ۛ") ^ i16;
                        i19 = iM450212 ^ (-1210422537);
                        c14312 = c14315;
                        i18 = ((iM450212 ^ i17) * 17609) ^ 1469654762;
                    }
                    sArr3 = sArr;
                    i12 = i7;
                    c69310 = c6938;
                    break;
                case -1420553631:
                case -471554248:
                    c69310 = c69310;
                    C14311 c14316 = c14312;
                    onBackPressedDispatcher = onBackPressedDispatcher;
                    c14311 = c14316;
                    C2332.m7083(activityC1609, C19806.m45029(strM6918) ^ 2122738360);
                    sArr2 = f6494;
                    i21 = 7;
                    i22 = 3;
                    int iM113012 = ThreadFactoryC3888.m11306("۠۟") ^ i17;
                    i19 = iM113012 ^ 279481850;
                    i18 = ((iM113012 ^ i16) * (-9177)) ^ (-1542811733);
                    sArr3 = sArr3;
                    i12 = i12;
                    c69310 = c69310;
                    C14494 c14496 = onBackPressedDispatcher;
                    c14312 = c14311;
                    onBackPressedDispatcher = c14496;
                    break;
                case -1347638674:
                case 1566918504:
                    i12 = i12;
                    c69310 = c69310;
                    short[] sArr4 = sArr2;
                    i21 = i21;
                    sArr3 = sArr3;
                    int i24 = i22;
                    C14311 c14317 = c14312;
                    onBackPressedDispatcher = onBackPressedDispatcher;
                    c14311 = c14317;
                    sArr2 = sArr4;
                    viewM1436 = RunnableC0195.m1436(activityC1609, ThreadFactoryC3888.m11306(C3286.m9788(sArr4, i21, i24, i20)) ^ 2126042687);
                    if (!RunnableC1564.f6300) {
                        int iM113013 = (ThreadFactoryC3888.m11306("ܳ᩵") ^ i17) * (-15);
                        i21 = i21;
                        i12 = i12;
                        i22 = i24;
                        sArr2 = sArr2;
                        i19 = iM113013 ^ 1869226299;
                        i18 = ((iM113013 ^ i16) * 10327) ^ 1048706580;
                        sArr3 = sArr3;
                        c69310 = c69310;
                        C14494 c14497 = onBackPressedDispatcher;
                        c14312 = c14311;
                        onBackPressedDispatcher = c14497;
                    } else {
                        i22 = i24;
                        iM11307 = ThreadFactoryC3888.m11306("ܿ᩻") ^ i17;
                        i18 = ((iM11307 ^ i16) * (-19919)) ^ (-528687960);
                        i4 = 2137439480;
                        i3 = iM11307 ^ i4;
                        i21 = i21;
                        sArr3 = sArr3;
                        i12 = i12;
                        i22 = i22;
                        sArr2 = sArr2;
                        i19 = i3;
                        c69310 = c69310;
                        activityC1609 = this;
                        C14494 c14498 = onBackPressedDispatcher;
                        c14312 = c14311;
                        onBackPressedDispatcher = c14498;
                    }
                    break;
                case -1260089522:
                case 1491716578:
                    i12 = i12;
                    c69310 = c69310;
                    sArr2 = sArr2;
                    i21 = i21;
                    i22 = i22;
                    sArr3 = sArr3;
                    C14311 c14318 = c14312;
                    onBackPressedDispatcher = onBackPressedDispatcher;
                    c14311 = c14318;
                    super.onCreate(bundle);
                    if (C2871.m8642()) {
                        iM11307 = (i17 - ThreadFactoryC3888.m11306("ۗۗ")) * 49;
                        i18 = ((iM11307 ^ i16) * (-19363)) ^ (-1259950749);
                        i4 = 1600192500;
                    } else {
                        iM11307 = (ThreadFactoryC3888.m11306("ۘۙ") + i16) * (-13);
                        i18 = ((iM11307 ^ i17) * 31939) ^ (-501893822);
                        i4 = -1618306701;
                    }
                    i3 = iM11307 ^ i4;
                    i21 = i21;
                    sArr3 = sArr3;
                    i12 = i12;
                    i22 = i22;
                    sArr2 = sArr2;
                    i19 = i3;
                    c69310 = c69310;
                    activityC1609 = this;
                    C14494 c14499 = onBackPressedDispatcher;
                    c14312 = c14311;
                    onBackPressedDispatcher = c14499;
                    break;
                case -1236974010:
                case 1811889041:
                    i12 = i12;
                    c1439 = (C1439) C2642.m8167(c6939, ThreadFactoryC3888.m11306(strM10423) ^ 2128634962);
                    if (RunnableC3388.f12514 < 0) {
                        iM45029 = (C19806.m45029("۫᩸") + i17) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i5 = ((iM45029 ^ i16) * 18335) ^ (-1946437843);
                        i6 = -379453676;
                        i19 = iM45029 ^ i6;
                        i18 = i5;
                        i12 = i12;
                    } else {
                        c69310 = c69310;
                        sArr2 = sArr2;
                        i21 = i21;
                        i22 = i22;
                        sArr3 = sArr3;
                        C14311 c14319 = c14312;
                        onBackPressedDispatcher = onBackPressedDispatcher;
                        c14311 = c14319;
                        iM11307 = ThreadFactoryC3888.m11306("ܿ᩻") ^ i17;
                        i18 = ((iM11307 ^ i16) * (-19919)) ^ (-528687960);
                        i4 = 2137439480;
                        i3 = iM11307 ^ i4;
                        i21 = i21;
                        sArr3 = sArr3;
                        i12 = i12;
                        i22 = i22;
                        sArr2 = sArr2;
                        i19 = i3;
                        c69310 = c69310;
                        activityC1609 = this;
                        C14494 c144910 = onBackPressedDispatcher;
                        c14312 = c14311;
                        onBackPressedDispatcher = c144910;
                    }
                    break;
                case -1236381394:
                case -473357440:
                    i12 = i12;
                    tabLayout = (TabLayout) RunnableC0195.m1436(activityC1609, ThreadFactoryC3888.m11306(CallableC1627.m5502(sArr3, i23, 3, i20)) ^ 2126564615);
                    iM45029 = C19806.m45029("ܿ᩶") ^ i16;
                    i5 = ((iM45029 ^ i17) * (-25775)) ^ (-2027117512);
                    i6 = -101822619;
                    i19 = iM45029 ^ i6;
                    i18 = i5;
                    i12 = i12;
                    break;
                case -1130755706:
                case -386880149:
                    C0278.m1789();
                    if (C2477.f9839 <= 0) {
                        i12 = i12;
                        iM45029 = C19806.m45029("۫ۜ") ^ i16;
                        i5 = ((iM45029 ^ i17) * (-3745)) ^ (-1081084700);
                        i6 = -697517068;
                        i19 = iM45029 ^ i6;
                        i18 = i5;
                        i12 = i12;
                    } else {
                        i7 = i12;
                        c6938 = c69310;
                        sArr = sArr3;
                        iM11308 = (C19806.m45029("᩶ܽ") ^ i17) * 75;
                        i8 = ((iM11308 ^ i16) * 20731) ^ 1031477197;
                        i9 = 1444128636;
                        i19 = iM11308 ^ i9;
                        i18 = i8;
                        sArr3 = sArr;
                        i12 = i7;
                        c69310 = c6938;
                    }
                    break;
                case -1067271281:
                case 880021583:
                    C1189.m4368();
                    if (!RunnableC3388.m10064()) {
                        i7 = i12;
                        c6938 = c69310;
                        sArr = sArr3;
                        iM11308 = (C19806.m45029("᩶ܽ") ^ i17) * 75;
                        i8 = ((iM11308 ^ i16) * 20731) ^ 1031477197;
                        i9 = 1444128636;
                        i19 = iM11308 ^ i9;
                        i18 = i8;
                        sArr3 = sArr;
                        i12 = i7;
                        c69310 = c6938;
                    } else {
                        i12 = i12;
                        c69310 = c69310;
                        sArr2 = sArr2;
                        i21 = i21;
                        i22 = i22;
                        C14311 c143110 = c14312;
                        onBackPressedDispatcher = onBackPressedDispatcher;
                        c14311 = c143110;
                        int iM113014 = ThreadFactoryC3888.m11306("۫ۨ") ^ i16;
                        i18 = ((iM113014 ^ i17) * (-2833)) ^ (-1999327190);
                        c69310 = c69310;
                        i21 = i21;
                        i12 = i12;
                        i22 = i22;
                        sArr2 = sArr2;
                        i19 = iM113014 ^ 736114756;
                        activityC1609 = this;
                        C14494 c144911 = onBackPressedDispatcher;
                        c14312 = c14311;
                        onBackPressedDispatcher = c144911;
                    }
                    break;
                case -799153746:
                case 1705037421:
                    i12 = i12;
                    c14310.m5029(new C11031(c11674));
                    sArr3 = f6494;
                    i23 = 13;
                    if (!RunnableC1564.m5345()) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩺ܽ") ^ i17) * 63;
                        i5 = ((iM45029 ^ i16) * 10737) ^ 463337529;
                        i6 = -517899752;
                        i19 = iM45029 ^ i6;
                        i18 = i5;
                        i12 = i12;
                    } else {
                        c69310 = c69310;
                        sArr2 = sArr2;
                        i21 = i21;
                        i22 = i22;
                        C14311 c143111 = c14312;
                        onBackPressedDispatcher = onBackPressedDispatcher;
                        c14311 = c143111;
                        int iM113015 = ThreadFactoryC3888.m11306("۫ۨ") ^ i16;
                        i18 = ((iM113015 ^ i17) * (-2833)) ^ (-1999327190);
                        c69310 = c69310;
                        i21 = i21;
                        i12 = i12;
                        i22 = i22;
                        sArr2 = sArr2;
                        i19 = iM113015 ^ 736114756;
                        activityC1609 = this;
                        C14494 c144912 = onBackPressedDispatcher;
                        c14312 = c14311;
                        onBackPressedDispatcher = c144912;
                    }
                    break;
                case -784579181:
                case 1364978992:
                    i12 = i12;
                    iM113010 = ThreadFactoryC3888.m11306(C0278.m1774(f6494, 19, 3, i20));
                    iM45029 = ThreadFactoryC3888.m11306("᩵ۚ") ^ i16;
                    i5 = ((iM45029 ^ i17) * (-15895)) ^ 792317768;
                    i6 = 1283197731;
                    i19 = iM45029 ^ i6;
                    i18 = i5;
                    i12 = i12;
                    break;
                case -620372807:
                case -132072280:
                    C1668.m5582(iM113010 ^ 2120017084);
                    C0216.m1586(this);
                    break;
                case -530954268:
                case 1473568867:
                    break;
                case -510812028:
                case 1121149494:
                    i7 = i12;
                    c6938 = c69310;
                    RunnableC3388.m10053(c6938, viewOnClickListenerC22460);
                    c6939 = activityC1609.f41645;
                    sArr = sArr3;
                    strM10423 = C3535.m10423(f6494, 10, 3, i20);
                    iM11308 = ThreadFactoryC3888.m11306("ۛۛ") ^ i16;
                    i8 = ((iM11308 ^ i17) * (-18105)) ^ (-854714405);
                    i9 = 557806009;
                    i19 = iM11308 ^ i9;
                    i18 = i8;
                    sArr3 = sArr;
                    i12 = i7;
                    c69310 = c6938;
                    break;
                case -481757608:
                case 726889291:
                    i12 = i12;
                    c19383.m44420(c10783);
                    tabLayout.setupWithViewPager(c19383);
                    c19383.m44422(new C23483(activityC1609));
                    if (C16924.m39614()) {
                        iM45029 = ThreadFactoryC3888.m11306("ܺۛ") ^ i16;
                        i5 = ((iM45029 ^ i17) * 30553) ^ 316032436;
                        i6 = 169625346;
                    } else {
                        iM45029 = (C19806.m45029("֡ۘ") ^ i17) * 67;
                        i5 = ((iM45029 ^ i16) * 13135) ^ 2070683586;
                        i6 = 507866448;
                    }
                    i19 = iM45029 ^ i6;
                    i18 = i5;
                    i12 = i12;
                    break;
                case 45402365:
                case 1137357874:
                    c14311 = c14312;
                    i20 = 7902;
                    iM11307 = ThreadFactoryC3888.m11306("ۖܰ") ^ i16;
                    i18 = ((iM11307 ^ i17) * (-1791)) ^ 1558581058;
                    i4 = -812384665;
                    i3 = iM11307 ^ i4;
                    i21 = i21;
                    sArr3 = sArr3;
                    i12 = i12;
                    i22 = i22;
                    sArr2 = sArr2;
                    i19 = i3;
                    c69310 = c69310;
                    activityC1609 = this;
                    C14494 c144913 = onBackPressedDispatcher;
                    c14312 = c14311;
                    onBackPressedDispatcher = c144913;
                    break;
                case 371573132:
                case 1456478392:
                    c69310 = c69310;
                    short[] sArr5 = sArr3;
                    C14311 c143112 = c14312;
                    onBackPressedDispatcher = onBackPressedDispatcher;
                    c14311 = c143112;
                    short s3 = f6494[0];
                    int i25 = s3 + 6574;
                    int iM113016 = (ThreadFactoryC3888.m11306("᩻ۖ") ^ i17) * (-35);
                    int i26 = ((iM113016 ^ i16) * 15097) ^ (-807125661);
                    i21 = i21;
                    s = s3;
                    i12 = i12;
                    i22 = i22;
                    sArr2 = sArr2;
                    i14 = i25;
                    i19 = iM113016 ^ 1093136782;
                    sArr3 = sArr5;
                    i18 = i26;
                    c69310 = c69310;
                    activityC1609 = this;
                    C14494 c144914 = onBackPressedDispatcher;
                    c14312 = c14311;
                    onBackPressedDispatcher = c144914;
                    break;
                case 547601741:
                case 2127589566:
                    sArr = sArr3;
                    i7 = i12;
                    C14494 c144915 = onBackPressedDispatcher;
                    C14311 c143113 = c14312;
                    c144915.m34905(c143113);
                    C7105.m18992(this);
                    c6938 = activityC1609.f41645;
                    viewOnClickListenerC22460 = new ViewOnClickListenerC22460(5, activityC1609);
                    if (C1461.f5957 <= 0) {
                        c14312 = c143113;
                        onBackPressedDispatcher = c144915;
                        iM11308 = (C19806.m45029("᩶ܽ") ^ i17) * 75;
                        i8 = ((iM11308 ^ i16) * 20731) ^ 1031477197;
                        i9 = 1444128636;
                        i19 = iM11308 ^ i9;
                        i18 = i8;
                        sArr3 = sArr;
                        i12 = i7;
                    } else {
                        int iM113017 = ThreadFactoryC3888.m11306("ܳۙ") ^ i17;
                        i18 = ((iM113017 ^ i16) * (-6561)) ^ (-2124952196);
                        i19 = iM113017 ^ (-36210597);
                        c14312 = c143113;
                        i12 = i7;
                        onBackPressedDispatcher = c144915;
                        sArr3 = sArr;
                    }
                    c69310 = c6938;
                    break;
                case 664832133:
                case 1041241017:
                    i12 = i12;
                    c8852.m22989(new RunnableC5843(0, activityC1609));
                    c11674 = activityC1609.f6497;
                    c14310 = activityC1609.f6500;
                    C0526.m2429(c11674);
                    iM45029 = (i16 - C19806.m45029("ܽ۫")) * 81;
                    i5 = ((iM45029 ^ i17) * 14481) ^ 329726889;
                    i6 = -2009374516;
                    i19 = iM45029 ^ i6;
                    i18 = i5;
                    i12 = i12;
                    break;
                case 988812860:
                case 1300622520:
                    activityC1609.f6500 = c1439;
                    i12 = 1;
                    c1439.m5030(true);
                    activityC1609.f6501 = new C8852(activityC1609);
                    if (C2332.f8260) {
                        activityC1609.f6498 = new C17318(activityC1609);
                        activityC1609.f6497 = new C11674(activityC1609);
                        c8852 = activityC1609.f6501;
                        if (C1461.m5080()) {
                            iM11309 = C19806.m45029("᩹᩵") ^ i17;
                            i10 = ((iM11309 ^ i16) * 7545) ^ 1383183027;
                            i11 = -342106861;
                        } else {
                            iM11309 = ThreadFactoryC3888.m11306("᩻ۧ") ^ i16;
                            i10 = ((iM11309 ^ i17) * 8579) ^ (-1020277100);
                            i11 = -1327931434;
                        }
                    } else {
                        iM11309 = C19806.m45029("᩹᩵") ^ i17;
                        i10 = ((iM11309 ^ i16) * 7545) ^ 1383183027;
                        i11 = -342106861;
                    }
                    i19 = iM11309 ^ i11;
                    i18 = i10;
                    break;
                case 1091996218:
                case 1738071013:
                    if (C1668.f6641 < 0) {
                        iM11309 = C19806.m45029("᩹᩵") ^ i17;
                        i10 = ((iM11309 ^ i16) * 7545) ^ 1383183027;
                        i11 = -342106861;
                        i19 = iM11309 ^ i11;
                        i18 = i10;
                    } else {
                        i7 = i12;
                        c6938 = c69310;
                        sArr = sArr3;
                        iM11308 = (C19806.m45029("᩶ܽ") ^ i17) * 75;
                        i8 = ((iM11308 ^ i16) * 20731) ^ 1031477197;
                        i9 = 1444128636;
                        i19 = iM11308 ^ i9;
                        i18 = i8;
                        sArr3 = sArr;
                        i12 = i7;
                        c69310 = c6938;
                    }
                    break;
                case 1327659405:
                case 1989751019:
                    i12 = i12;
                    c19383 = (C19383) RunnableC0195.m1436(activityC1609, iM450210 ^ 2103077106);
                    c10783 = new C10783(activityC1609);
                    iM45029 = C19806.m45029("ۗᩳ") ^ i17;
                    i5 = ((iM45029 ^ i16) * 4517) ^ 1088065723;
                    i6 = -1806212772;
                    i19 = iM45029 ^ i6;
                    i18 = i5;
                    i12 = i12;
                    break;
                case 1374830719:
                case 1419538020:
                    C2332.m7079();
                    C3722.m10894();
                    i7 = i12;
                    c6938 = c69310;
                    sArr = sArr3;
                    iM11308 = (C19806.m45029("᩶ܽ") ^ i17) * 75;
                    i8 = ((iM11308 ^ i16) * 20731) ^ 1031477197;
                    i9 = 1444128636;
                    i19 = iM11308 ^ i9;
                    i18 = i8;
                    sArr3 = sArr;
                    i12 = i7;
                    c69310 = c6938;
                    break;
                case 1419833094:
                case 1855215853:
                    i12 = i12;
                    iM450210 = C19806.m45029(RunnableC1606.m5481(f6494, 16, 3, i20));
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = C19806.m45029("۫ۜ") ^ i16;
                        i5 = ((iM45029 ^ i17) * (-3745)) ^ (-1081084700);
                        i6 = -697517068;
                    } else {
                        iM45029 = (i17 - ThreadFactoryC3888.m11306("ܿ᩸")) * (-3);
                        i5 = ((iM45029 ^ i16) * (-5253)) ^ (-473565199);
                        i6 = -1915648633;
                    }
                    i19 = iM45029 ^ i6;
                    i18 = i5;
                    i12 = i12;
                    break;
                case 1663335427:
                case 2079830104:
                    c14311 = c14312;
                    i20 = 50483;
                    iM11307 = ThreadFactoryC3888.m11306("ۖܰ") ^ i16;
                    i18 = ((iM11307 ^ i17) * (-1791)) ^ 1558581058;
                    i4 = -812384665;
                    i3 = iM11307 ^ i4;
                    i21 = i21;
                    sArr3 = sArr3;
                    i12 = i12;
                    i22 = i22;
                    sArr2 = sArr2;
                    i19 = i3;
                    c69310 = c69310;
                    activityC1609 = this;
                    C14494 c144916 = onBackPressedDispatcher;
                    c14312 = c14311;
                    onBackPressedDispatcher = c144916;
                    break;
                default:
                    i12 = i12;
                    c69310 = c69310;
                    sArr2 = sArr2;
                    i21 = i21;
                    i22 = i22;
                    sArr3 = sArr3;
                    C14311 c143114 = c14312;
                    onBackPressedDispatcher = onBackPressedDispatcher;
                    c14311 = c143114;
                    m31023();
                    iM113011 = ThreadFactoryC3888.m11306(C1875.m6105(f6494, 1, 3, i20));
                    i13 = 2097239919;
                    if (C2871.f10837 < 0) {
                        iM11307 = (ThreadFactoryC3888.m11306("ۖܳ") + i16) * 67;
                        i18 = ((iM11307 ^ i17) * 12999) ^ (-1854860388);
                        i4 = 1012549835;
                        i3 = iM11307 ^ i4;
                        i21 = i21;
                        sArr3 = sArr3;
                        i12 = i12;
                        i22 = i22;
                        sArr2 = sArr2;
                        i19 = i3;
                        c69310 = c69310;
                        activityC1609 = this;
                        C14494 c144917 = onBackPressedDispatcher;
                        c14312 = c14311;
                        onBackPressedDispatcher = c144917;
                    } else {
                        sArr3 = sArr3;
                        int iM113018 = ThreadFactoryC3888.m11306("۫ۨ") ^ i16;
                        i18 = ((iM113018 ^ i17) * (-2833)) ^ (-1999327190);
                        c69310 = c69310;
                        i21 = i21;
                        i12 = i12;
                        i22 = i22;
                        sArr2 = sArr2;
                        i19 = iM113018 ^ 736114756;
                        activityC1609 = this;
                        C14494 c144918 = onBackPressedDispatcher;
                        c14312 = c14311;
                        onBackPressedDispatcher = c144918;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractActivityC12483, l.ActivityC19126, android.app.Activity
    public final void onResume() {
        C8852 c8852 = null;
        C17318 c17318 = null;
        C11674 c11674 = null;
        int i = 1847205634;
        int i2 = C2788.f10625;
        int i3 = C1148.f5161;
        int iM11306 = ThreadFactoryC3888.m11306("ܽ۠") ^ i3;
        int i4 = ((iM11306 ^ i2) * 26047) ^ 1474500839;
        int i5 = -871937008;
        while (true) {
            i = ((((i ^ i2) * 8069) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2118098292:
                case -404534382:
                    if (C2332.f8260) {
                        iM11306 = C19806.m45029("᩶ᩳ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 793) ^ 1302656362;
                        i5 = -1096915553;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۖۤ") + i3) * (-13);
                        i4 = ((iM11306 ^ i2) * (-32107)) ^ (-1521841942);
                        i5 = 1993871136;
                    }
                    break;
                case -1877041926:
                case -1392255221:
                    c17318.m40287();
                    iM11306 = C19806.m45029("᩶֨") ^ i3;
                    i4 = ((iM11306 ^ i2) * (-25265)) ^ (-1277868165);
                    i5 = -1321553410;
                    break;
                case -1715656526:
                case 1863718207:
                    if (C0526.f2219) {
                        iM11306 = (C19806.m45029("᩸ۤ") + i2) * (-97);
                        i4 = ((iM11306 ^ i3) * 28877) ^ 1433881955;
                        i5 = -1559443646;
                    } else {
                        iM11306 = C19806.m45029("۟ۧ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-26141)) ^ 1505299343;
                        i5 = 276846656;
                    }
                    break;
                case -1279985996:
                case 135008605:
                    super.onResume();
                    if (C1377.f5749) {
                        iM11306 = ThreadFactoryC3888.m11306("۠ۨ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 17963) ^ 16883553;
                        i5 = -1135222082;
                    } else {
                        iM11306 = C19806.m45029("ۤ᩹") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-26251)) ^ 1020734502;
                        i5 = 1336822789;
                    }
                    break;
                case -1177303660:
                case -644353466:
                    c8852.m22990();
                    iM11306 = (C19806.m45029("ܶۡ") ^ i2) * (-89);
                    i4 = ((iM11306 ^ i3) * (-1057)) ^ 25455138;
                    i5 = -1097263511;
                    break;
                case -903276087:
                case -550337848:
                    if (RunnableC1895.m6170() != 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֨ܶ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-10717)) ^ (-882068750);
                        i5 = 15919031;
                    } else {
                        iM11306 = C19806.m45029("ܺܺ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 25869) ^ (-604229932);
                        i5 = 652547424;
                    }
                    break;
                case -893911831:
                case -810782885:
                    break;
                case -829762069:
                case 2091333565:
                    c11674 = this.f6497;
                    if (c11674 != null) {
                        iM11306 = C19806.m45029("ۡܶ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 7183) ^ 640031648;
                        i5 = 1945948675;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩸ۧ") ^ i2) * (-71);
                        i4 = ((iM11306 ^ i3) * (-1291)) ^ 960947708;
                        i5 = 1688648426;
                    }
                    break;
                case -719537169:
                case 371060224:
                    if (!C0526.f2219) {
                        iM11306 = C19806.m45029("ۤ᩹") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-26251)) ^ 1020734502;
                        i5 = 1336822789;
                    } else {
                        iM11306 = (C19806.m45029("᩸ۤ") + i2) * (-97);
                        i4 = ((iM11306 ^ i3) * 28877) ^ 1433881955;
                        i5 = -1559443646;
                    }
                    break;
                case -421251534:
                case 1802748404:
                    c8852 = this.f6501;
                    if (c8852 != null) {
                        iM11306 = ThreadFactoryC3888.m11306("ܶ᩵") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-12463)) ^ 1798616828;
                        i5 = -966762100;
                    } else {
                        iM11306 = (C19806.m45029("ܶۡ") ^ i2) * (-89);
                        i4 = ((iM11306 ^ i3) * (-1057)) ^ 25455138;
                        i5 = -1097263511;
                    }
                    break;
                case -327654188:
                case 514098210:
                    c17318 = this.f6498;
                    if (c17318 != null) {
                        iM11306 = C19806.m45029("᩷ۨ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 30089) ^ 1608367249;
                        i5 = 1173572989;
                    } else {
                        iM11306 = C19806.m45029("᩶֨") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-25265)) ^ (-1277868165);
                        i5 = -1321553410;
                    }
                    break;
                case -271100344:
                case 10436279:
                    if (C1668.f6641 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۖۤ") + i3) * (-13);
                        i4 = ((iM11306 ^ i2) * (-32107)) ^ (-1521841942);
                        i5 = 1993871136;
                    } else {
                        iM11306 = C19806.m45029("ۙ᩷") ^ i2;
                        i4 = ((iM11306 ^ i3) * 2313) ^ (-1278930806);
                        i5 = -1158147753;
                    }
                    break;
                case -217376522:
                case 1603181727:
                    if (C0216.f1393 != 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֨ܶ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-10717)) ^ (-882068750);
                        i5 = 15919031;
                    } else {
                        iM11306 = (C19806.m45029("۠ۚ") + i2) * (-81);
                        i4 = ((iM11306 ^ i3) * (-22351)) ^ (-1925449418);
                        i5 = 2023222387;
                    }
                    break;
                case -198746744:
                case -184479249:
                    C2704.m8255();
                    if (ThreadFactoryC3888.m11300() <= 0) {
                        iM11306 = (C19806.m45029("᩸ۤ") + i2) * (-97);
                        i4 = ((iM11306 ^ i3) * 28877) ^ 1433881955;
                        i5 = -1559443646;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩻ᩳ") ^ i3) * (-33);
                        i4 = ((iM11306 ^ i2) * (-28903)) ^ 58794878;
                        i5 = -1815390704;
                    }
                    break;
                case 180017933:
                case 341955669:
                    if (C0050.f912 <= 0) {
                        iM11306 = C19806.m45029("ۤ᩹") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-26251)) ^ 1020734502;
                        i5 = 1336822789;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۨ۬") ^ i3;
                        i4 = ((iM11306 ^ i2) * 24447) ^ 1004191818;
                        i5 = -1248159446;
                    }
                    break;
                case 206525329:
                case 425586893:
                    c11674.m29172();
                    iM11306 = (ThreadFactoryC3888.m11306("᩸ۧ") ^ i2) * (-71);
                    i4 = ((iM11306 ^ i3) * (-1291)) ^ 960947708;
                    i5 = 1688648426;
                    break;
                case 428262257:
                case 831541712:
                    C0671.m3008();
                    if (C1419.f5860 < 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֨ܶ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-10717)) ^ (-882068750);
                        i5 = 15919031;
                    } else {
                        iM11306 = (C19806.m45029("᩸ۤ") + i2) * (-97);
                        i4 = ((iM11306 ^ i3) * 28877) ^ 1433881955;
                        i5 = -1559443646;
                    }
                    break;
                case 518089938:
                case 934671427:
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM11306 = C19806.m45029("ۤ᩹") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-26251)) ^ 1020734502;
                        i5 = 1336822789;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܳܿ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 3537) ^ 1008291090;
                        i5 = 2133624124;
                    }
                    break;
                case 807264759:
                case 1506331301:
                    C0526.m2437();
                    break;
                case 1278429116:
                case 2026108890:
                    ThreadFactoryC3888.m11300();
                    iM11306 = C19806.m45029("ۤ᩹") ^ i3;
                    i4 = ((iM11306 ^ i2) * (-26251)) ^ 1020734502;
                    i5 = 1336822789;
                    break;
                case 1283907755:
                case 1865670223:
                    if (C10634.f36300 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۖۤ") + i3) * (-13);
                        i4 = ((iM11306 ^ i2) * (-32107)) ^ (-1521841942);
                        i5 = 1993871136;
                    } else {
                        iM11306 = (C19806.m45029("۫ᩳ") + i3) * 115;
                        i4 = ((iM11306 ^ i2) * (-2273)) ^ (-1173266645);
                        i5 = -1172558481;
                    }
                    break;
                default:
                    if (C0962.m3746() >= 0) {
                        iM11306 = C19806.m45029("ۤ᩹") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-26251)) ^ 1020734502;
                        i5 = 1336822789;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֫֨") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-19669)) ^ (-1119886468);
                        i5 = 1963537335;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractActivityC12483, l.ActivityC10074, l.ActivityC19126, android.app.Activity
    public final void onDestroy() {
        C8852 c8852 = null;
        int i = -211043373;
        int i2 = C1875.f7103;
        int i3 = AbstractC0464.f2088;
        int iM45029 = C19806.m45029("ܺ᩻") ^ i3;
        int i4 = ((iM45029 ^ i2) * (-11649)) ^ (-528683473);
        int i5 = -1545223659;
        while (true) {
            i = ((((i ^ i2) * (-27409)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2114710113:
                case -1756901418:
                    if (C1460.m5050() != 0) {
                        iM45029 = (i2 - C19806.m45029("۠ۖ")) * (-13);
                        i4 = ((iM45029 ^ i3) * (-16555)) ^ (-1313582652);
                        i5 = 644388742;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ۡۜ")) * (-19);
                        i4 = ((iM45029 ^ i2) * (-11661)) ^ (-742094724);
                        i5 = 1968148823;
                    }
                    break;
                case -2075372954:
                case 349983502:
                    if (C1977.f7413 <= 0) {
                        iM45029 = (i2 - C19806.m45029("۠ۖ")) * (-13);
                        i4 = ((iM45029 ^ i3) * (-16555)) ^ (-1313582652);
                        i5 = 644388742;
                    } else {
                        iM45029 = C19806.m45029("ۖۧ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-5463)) ^ (-1311046011);
                        i5 = 376014560;
                    }
                    break;
                case -1888176244:
                case -403158440:
                    if (C0629.f2722 <= 0) {
                        iM45029 = C19806.m45029("ۘ᩺") ^ i3;
                        i4 = ((iM45029 ^ i2) * 169) ^ 1318889356;
                        i5 = -1239349773;
                    } else {
                        iM45029 = C19806.m45029("ᩳܳ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-25955)) ^ 827305446;
                        i5 = -1221105653;
                    }
                    break;
                case -1875033711:
                case 85525669:
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = (i2 - C19806.m45029("۬ۗ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM45029 ^ i3) * (-603)) ^ 1419739776;
                        i5 = -733334681;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩷ܺ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-30957)) ^ 1042469146;
                        i5 = -1812747800;
                    }
                    break;
                case -1617164403:
                case 686144563:
                    C1875.m6086();
                    if (!ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM45029 = C19806.m45029("ۘ᩺") ^ i3;
                        i4 = ((iM45029 ^ i2) * 169) ^ 1318889356;
                        i5 = -1239349773;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ۡۜ")) * (-19);
                        i4 = ((iM45029 ^ i2) * (-11661)) ^ (-742094724);
                        i5 = 1968148823;
                    }
                    break;
                case -1567853963:
                case -681319972:
                    C0629.m2907();
                    break;
                case -1547894881:
                case 1551179412:
                    c8852 = this.f6501;
                    if (c8852 != null) {
                        iM45029 = (C19806.m45029("᩹۠") + i2) * 81;
                        i4 = ((iM45029 ^ i3) * 865) ^ 1108081980;
                        i5 = -1362753732;
                    } else {
                        iM45029 = (C19806.m45029("ۧ۠") ^ i3) * (-81);
                        i4 = ((iM45029 ^ i2) * (-16507)) ^ (-495079257);
                        i5 = -56519842;
                    }
                    break;
                case -1247886814:
                case 1543848070:
                    if (C2249.f8050 >= 0) {
                        iM45029 = (i2 - C19806.m45029("۬ۗ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM45029 ^ i3) * (-603)) ^ 1419739776;
                        i5 = -733334681;
                    } else {
                        iM45029 = (C19806.m45029("ᩳܶ") ^ i2) * 31;
                        i4 = ((iM45029 ^ i3) * (-22091)) ^ 1062753111;
                        i5 = 1570389760;
                    }
                    break;
                case -1118265420:
                case 99823435:
                    RunnableC3388.m10064();
                    iM45029 = (i2 - C19806.m45029("۬ۗ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i4 = ((iM45029 ^ i3) * (-603)) ^ 1419739776;
                    i5 = -733334681;
                    break;
                case -1054601326:
                case -297575306:
                    C2124.m6673();
                    if (!C3577.m10565()) {
                        iM45029 = (i3 - C19806.m45029("ۡۜ")) * (-19);
                        i4 = ((iM45029 ^ i2) * (-11661)) ^ (-742094724);
                        i5 = 1968148823;
                    } else {
                        iM45029 = (i2 - C19806.m45029("۬ۗ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM45029 ^ i3) * (-603)) ^ 1419739776;
                        i5 = -733334681;
                    }
                    break;
                case -1022410378:
                case 191851603:
                    if (C2704.m8255() <= 0) {
                        iM45029 = (i3 - C19806.m45029("ۡۜ")) * (-19);
                        i4 = ((iM45029 ^ i2) * (-11661)) ^ (-742094724);
                        i5 = 1968148823;
                    } else {
                        iM45029 = C19806.m45029("᩻ᩳ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-25905)) ^ 2646794;
                        i5 = -411789331;
                    }
                    break;
                case -984938424:
                case -71490297:
                    c8852.m22988();
                    iM45029 = (C19806.m45029("ۧ۠") ^ i3) * (-81);
                    i4 = ((iM45029 ^ i2) * (-16507)) ^ (-495079257);
                    i5 = -56519842;
                    break;
                case -945167172:
                case 646501938:
                    if (C0278.f1572 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܺۖ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-9561)) ^ (-1983621037);
                        i5 = 2088123047;
                    } else {
                        iM45029 = (C19806.m45029("ۙۗ") ^ i3) * 15;
                        i4 = ((iM45029 ^ i2) * 25515) ^ 1078469109;
                        i5 = 1907444163;
                    }
                    break;
                case -870864164:
                case 205966104:
                    if (C1937.m6279() >= 0) {
                        iM45029 = C19806.m45029("ۘ᩺") ^ i3;
                        i4 = ((iM45029 ^ i2) * 169) ^ 1318889356;
                        i5 = -1239349773;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("᩶۟")) * 99;
                        i4 = ((iM45029 ^ i3) * (-22741)) ^ 53173517;
                        i5 = 1653078685;
                    }
                    break;
                case -630625136:
                case -193312772:
                    break;
                case -527512343:
                case -75001933:
                    super.onDestroy();
                    if (RunnableC1895.f7152) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۨۢ")) * (-35);
                        i4 = ((iM45029 ^ i2) * 6101) ^ (-983086687);
                        i5 = 697330351;
                    } else {
                        iM45029 = C19806.m45029("ۘ᩺") ^ i3;
                        i4 = ((iM45029 ^ i2) * 169) ^ 1318889356;
                        i5 = -1239349773;
                    }
                    break;
                case -44544100:
                case 2042745098:
                    if (C1460.f5948 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܺۖ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-9561)) ^ (-1983621037);
                        i5 = 2088123047;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩺᩻") ^ i3;
                        i4 = ((iM45029 ^ i2) * 19817) ^ (-1953482601);
                        i5 = -1080446402;
                    }
                    break;
                default:
                    if (C0526.f2219) {
                        iM45029 = C19806.m45029("ۘ᩺") ^ i3;
                        i4 = ((iM45029 ^ i2) * 169) ^ 1318889356;
                        i5 = -1239349773;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩻ܳ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 16759) ^ 1101266102;
                        i5 = 1287510065;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0245 A[PHI: r4 r6 r10 r11 r12
      0x0245: PHI (r4v7 java.lang.String) = 
      (r4v3 java.lang.String)
      (r4v2 java.lang.String)
      (r4v2 java.lang.String)
      (r4v2 java.lang.String)
      (r4v2 java.lang.String)
     binds: [B:61:0x0243, B:53:0x01e6, B:39:0x0160, B:13:0x0089, B:114:0x0245] A[DONT_GENERATE, DONT_INLINE]
      0x0245: PHI (r6v7 java.lang.String) = 
      (r6v2 java.lang.String)
      (r6v2 java.lang.String)
      (r6v4 java.lang.String)
      (r6v2 java.lang.String)
      (r6v2 java.lang.String)
     binds: [B:61:0x0243, B:53:0x01e6, B:39:0x0160, B:13:0x0089, B:114:0x0245] A[DONT_GENERATE, DONT_INLINE]
      0x0245: PHI (r10v6 short[]) = (r10v2 short[]), (r10v3 short[]), (r10v2 short[]), (r10v2 short[]), (r10v2 short[]) binds: [B:61:0x0243, B:53:0x01e6, B:39:0x0160, B:13:0x0089, B:114:0x0245] A[DONT_GENERATE, DONT_INLINE]
      0x0245: PHI (r11v6 int) = (r11v2 int), (r11v3 int), (r11v2 int), (r11v2 int), (r11v2 int) binds: [B:61:0x0243, B:53:0x01e6, B:39:0x0160, B:13:0x0089, B:114:0x0245] A[DONT_GENERATE, DONT_INLINE]
      0x0245: PHI (r12v6 int) = (r12v2 int), (r12v3 int), (r12v2 int), (r12v2 int), (r12v2 int) binds: [B:61:0x0243, B:53:0x01e6, B:39:0x0160, B:13:0x0089, B:114:0x0245] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:77:0x02f7 A[PHI: r14 r20 r25
      0x02f7: PHI (r14v4 int) = (r14v3 int), (r14v2 int), (r14v2 int) binds: [B:76:0x02f5, B:15:0x008d, B:13:0x0089] A[DONT_GENERATE, DONT_INLINE]
      0x02f7: PHI (r20v4 int) = (r20v3 int), (r20v2 int), (r20v2 int) binds: [B:76:0x02f5, B:15:0x008d, B:13:0x0089] A[DONT_GENERATE, DONT_INLINE]
      0x02f7: PHI (r25v5 int) = (r25v4 int), (r25v3 int), (r25v3 int) binds: [B:76:0x02f5, B:15:0x008d, B:13:0x0089] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int iM11306;
        int i;
        int iM11307;
        int i2;
        int i3;
        ActivityC1609 activityC1609 = this;
        int i4 = C1398.f5802;
        int i5 = C2788.f10625;
        int iM45029 = C19806.m45029("ۤ᩺") ^ i4;
        int i6 = ((iM45029 ^ i5) * 11321) ^ 843520376;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i7 = iM45029 ^ (-1423132331);
        int iM6285 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        char c = 0;
        short s = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 105774774;
        int i16 = 0;
        String strM6164 = null;
        String strM10964 = null;
        String strM8470 = null;
        String strM9869 = null;
        boolean z = false;
        while (true) {
            i15 = i7 ^ (i6 & (((i15 ^ i5) * 16635) >> 31));
            switch (i15) {
                case -2146880615:
                case 1564435492:
                    sArr3 = f6494;
                    i9 = 33;
                    i10 = 3;
                    if (C2124.f7782 <= 0) {
                        iM11307 = C19806.m45029("ܽ᩸") ^ i4;
                        i2 = ((iM11307 ^ i5) * 8363) ^ (-657059375);
                        i3 = -2119688488;
                    } else {
                        iM11307 = (i5 - C19806.m45029("ۗܿ")) * (-67);
                        i2 = ((iM11307 ^ i4) * 24975) ^ (-1010670905);
                        i3 = -951035995;
                    }
                    i7 = iM11307 ^ i3;
                    i6 = i2;
                    break;
                case -2143716162:
                case 1081238867:
                    sArr = f6494;
                    if (RunnableC3388.m10064()) {
                        iM11306 = ThreadFactoryC3888.m11306("ۘۧ") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-5267)) ^ 1577347979;
                        i = -239090954;
                    } else {
                        iM11306 = C19806.m45029("ᩴۖ") ^ i5;
                        i6 = ((iM11306 ^ i4) * 741) ^ 1243524067;
                        i = -630337658;
                    }
                    i7 = iM11306 ^ i;
                    activityC1609 = this;
                    break;
                case -2099830388:
                case -322780883:
                    int i17 = i16 + i11;
                    if ((i17 + i17) - i14 >= 0) {
                        iM11307 = ThreadFactoryC3888.m11306("ۘ۬") ^ i5;
                        i2 = ((iM11307 ^ i4) * 31897) ^ 1715658965;
                        i3 = -941006085;
                    } else {
                        iM11307 = (ThreadFactoryC3888.m11306("᩻ۚ") ^ i4) * (-93);
                        i2 = ((iM11307 ^ i5) * (-17867)) ^ (-499438668);
                        i3 = -964489737;
                    }
                    i7 = iM11307 ^ i3;
                    i6 = i2;
                    break;
                case -2082711568:
                case 609350447:
                    c = 29;
                    if (CallableC1627.f6528) {
                        iM11306 = C19806.m45029("᩷᩹") ^ i4;
                        i6 = ((iM11306 ^ i5) * (-7369)) ^ (-1299958811);
                        i = 974161962;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩶ܰ") ^ i5;
                        i6 = ((iM11306 ^ i4) * 10763) ^ 547904973;
                        i = 322091046;
                    }
                    i7 = iM11306 ^ i;
                    activityC1609 = this;
                    break;
                case -2061523420:
                case -1102281936:
                    if (iM6285 == (C19806.m45029(strM8470) ^ 2100213486)) {
                        iM11307 = ThreadFactoryC3888.m11306("ۗ᩺") ^ i5;
                        i2 = ((iM11307 ^ i4) * 9109) ^ 851579016;
                        i3 = -209014592;
                    } else {
                        iM11307 = (i5 - ThreadFactoryC3888.m11306("ۜۙ")) * (-93);
                        i2 = ((iM11307 ^ i4) * 15357) ^ (-1811535531);
                        i3 = -593560921;
                    }
                    i7 = iM11307 ^ i3;
                    i6 = i2;
                    break;
                case -1946316340:
                case 1122097280:
                    z = true;
                    if (iM6285 == (ThreadFactoryC3888.m11306(strM9869) ^ 2117864553)) {
                        iM11307 = (C19806.m45029("֡֫") + i4) * (-23);
                        i2 = ((iM11307 ^ i5) * (-25785)) ^ (-1051853372);
                        i3 = 1184366923;
                    } else {
                        iM11307 = (ThreadFactoryC3888.m11306("֨ۖ") + i5) * (-91);
                        i2 = ((iM11307 ^ i4) * 6455) ^ 324494898;
                        i3 = -1360091216;
                    }
                    i7 = iM11307 ^ i3;
                    i6 = i2;
                    break;
                case -1907245493:
                case 302469945:
                    i12 = 33059;
                    iM11307 = (i4 - C19806.m45029("ۨ۬")) * 31;
                    i2 = ((iM11307 ^ i5) * 13711) ^ (-817569126);
                    i3 = -562365944;
                    i7 = iM11307 ^ i3;
                    i6 = i2;
                    break;
                case -1810196980:
                case -434068313:
                    strM10964 = C3743.m10964(f6494, 36, 3, i12);
                    if (C0671.f2816 != 0) {
                        iM11307 = C19806.m45029("ܽ᩸") ^ i4;
                        i2 = ((iM11307 ^ i5) * 8363) ^ (-657059375);
                        i3 = -2119688488;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("֨᩹") ^ i4;
                        i2 = ((iM11307 ^ i5) * (-31663)) ^ (-1872526777);
                        i3 = -633330958;
                    }
                    i7 = iM11307 ^ i3;
                    i6 = i2;
                    break;
                case -1635786767:
                case 1165498197:
                    i12 = 24252;
                    iM11307 = (i4 - C19806.m45029("ۨ۬")) * 31;
                    i2 = ((iM11307 ^ i5) * 13711) ^ (-817569126);
                    i3 = -562365944;
                    i7 = iM11307 ^ i3;
                    i6 = i2;
                    break;
                case -1603141910:
                case 2069997382:
                    i14 = i13 * i13;
                    i16 = s * s;
                    i11 = 261242569;
                    if (C3286.f12186) {
                        iM11307 = C19806.m45029("ܰۜ") ^ i5;
                        i2 = ((iM11307 ^ i4) * 15999) ^ (-2137633405);
                        i3 = -484514937;
                    } else {
                        iM11307 = (ThreadFactoryC3888.m11306("ۛ۫") + i4) * (-17);
                        i2 = ((iM11307 ^ i5) * (-7103)) ^ 257087220;
                        i3 = -1587546545;
                    }
                    i7 = iM11307 ^ i3;
                    i6 = i2;
                    break;
                case -1430400514:
                case -991193217:
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    C1875.m6086();
                    iM11307 = C19806.m45029("ܰۜ") ^ i5;
                    i2 = ((iM11307 ^ i4) * 15999) ^ (-2137633405);
                    i3 = -484514937;
                    i7 = iM11307 ^ i3;
                    i6 = i2;
                    break;
                case -1420068139:
                case 644134037:
                    C3286.m9800(activityC1609, new Intent(activityC1609, (Class<?>) ActivityC11736.class));
                    return z;
                case -1384535228:
                case -1167654779:
                    strM6164 = RunnableC1895.m6164(f6494, 39, 3, i12);
                    if (C2788.m8472() == 0) {
                        iM11307 = ThreadFactoryC3888.m11306("ᩳ᩵") ^ i4;
                        i2 = ((iM11307 ^ i5) * (-13119)) ^ (-200448005);
                        i3 = 1251002314;
                        i7 = iM11307 ^ i3;
                        i6 = i2;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩶ܰ") ^ i5;
                        i6 = ((iM11306 ^ i4) * 10763) ^ 547904973;
                        i = 322091046;
                        i7 = iM11306 ^ i;
                        activityC1609 = this;
                    }
                    break;
                case -1092693071:
                case -975062413:
                    strM8470 = C2788.m8470(sArr3, i9, i10, i12);
                    if (C2642.f10294 > 0) {
                        iM11307 = (i4 - C19806.m45029("֫ۚ")) * 77;
                        i2 = ((iM11307 ^ i5) * (-2027)) ^ (-1317109548);
                        i3 = 1265030950;
                        i7 = iM11307 ^ i3;
                        i6 = i2;
                    } else {
                        iM11306 = C19806.m45029("ᩴۖ") ^ i5;
                        i6 = ((iM11306 ^ i4) * 741) ^ 1243524067;
                        i = -630337658;
                        i7 = iM11306 ^ i;
                        activityC1609 = this;
                    }
                    break;
                case -958436982:
                case 743451964:
                    if (C2249.f8050 >= 0) {
                        iM11307 = (C19806.m45029("ܶۙ") ^ i4) * 123;
                        i2 = ((iM11307 ^ i5) * 15739) ^ 425931986;
                        i3 = -1502008981;
                        i7 = iM11307 ^ i3;
                        i6 = i2;
                    } else {
                        iM11306 = C19806.m45029("ᩴۖ") ^ i5;
                        i6 = ((iM11306 ^ i4) * 741) ^ 1243524067;
                        i = -630337658;
                        i7 = iM11306 ^ i;
                        activityC1609 = this;
                    }
                    break;
                case -681156522:
                case -276905915:
                    ActivityC5054.m14079(activityC1609, C0050.m940(f6494, 42, 3, i12));
                    return z;
                case -525853817:
                case 921758973:
                    C1148.m4232();
                    return false;
                case -459284267:
                case 350828499:
                    strM9869 = ViewTreeObserverOnPreDrawListenerC3327.m9869(sArr2, i8, 3, i12);
                    if (C0962.f3784) {
                        iM11307 = C19806.m45029("ܽ᩸") ^ i4;
                        i2 = ((iM11307 ^ i5) * 8363) ^ (-657059375);
                        i3 = -2119688488;
                    } else {
                        iM11307 = C19806.m45029("᩺ܶ") ^ i4;
                        i2 = ((iM11307 ^ i5) * 29543) ^ (-1376981299);
                        i3 = 1777849985;
                    }
                    i7 = iM11307 ^ i3;
                    i6 = i2;
                    break;
                case -385074129:
                case 839262506:
                    iM6285 = C1937.m6285(menuItem);
                    sArr2 = f6494;
                    i8 = 30;
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 > 0) {
                        iM11307 = (ThreadFactoryC3888.m11306("ۡۤ") ^ i5) * 95;
                        i2 = ((iM11307 ^ i4) * (-4385)) ^ (-256458452);
                        i3 = 2005881656;
                        i7 = iM11307 ^ i3;
                        i6 = i2;
                    } else {
                        iM11306 = C19806.m45029("ᩴۖ") ^ i5;
                        i6 = ((iM11306 ^ i4) * 741) ^ 1243524067;
                        i = -630337658;
                        i7 = iM11306 ^ i;
                        activityC1609 = this;
                    }
                    break;
                case -246030626:
                case 1869050243:
                    if (iM6285 == (ThreadFactoryC3888.m11306(strM10964) ^ 2125329727)) {
                        iM11307 = C19806.m45029("ۖᩴ") ^ i5;
                        i2 = ((iM11307 ^ i4) * (-29357)) ^ (-333325828);
                        i3 = 982566093;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("ܳܰ") ^ i5;
                        i2 = ((iM11307 ^ i4) * 7785) ^ 316198567;
                        i3 = 1871252494;
                    }
                    i7 = iM11307 ^ i3;
                    i6 = i2;
                    break;
                case -63947188:
                case 424161210:
                    activityC1609.f6500.m5028((String) null);
                    activityC1609.f6500.m5034(z);
                    return z;
                case 260054962:
                case 1139780252:
                    C2642.m8171();
                    if (C19806.f63586) {
                        iM11307 = C19806.m45029("ܰۜ") ^ i5;
                        i2 = ((iM11307 ^ i4) * 15999) ^ (-2137633405);
                        i3 = -484514937;
                    } else {
                        iM11307 = C19806.m45029("ܽ᩸") ^ i4;
                        i2 = ((iM11307 ^ i5) * 8363) ^ (-657059375);
                        i3 = -2119688488;
                    }
                    i7 = iM11307 ^ i3;
                    i6 = i2;
                    break;
                case 285668149:
                case 1029787135:
                    short s2 = sArr[c];
                    int i18 = s2 + 16163;
                    if (C7105.f23796 >= 0) {
                        s = s2;
                        i13 = i18;
                        iM11306 = ThreadFactoryC3888.m11306("᩶ܰ") ^ i5;
                        i6 = ((iM11306 ^ i4) * 10763) ^ 547904973;
                        i = 322091046;
                        i7 = iM11306 ^ i;
                    } else {
                        int iM11308 = ThreadFactoryC3888.m11306("ۘܽ") ^ i5;
                        int i19 = ((iM11308 ^ i4) * (-20751)) ^ 2046707906;
                        i7 = iM11308 ^ 1973407577;
                        s = s2;
                        i13 = i18;
                        i6 = i19;
                    }
                    activityC1609 = this;
                    break;
                case 337521351:
                case 1132859197:
                    return false;
                case 778661799:
                case 1636219989:
                    if (iM6285 == (C19806.m45029(strM6164) ^ 2128276208)) {
                        iM11307 = (i4 - ThreadFactoryC3888.m11306("ۜܰ")) * (-63);
                        i2 = ((iM11307 ^ i5) * 13767) ^ 821030671;
                        i3 = -1714556507;
                    } else {
                        iM11307 = C19806.m45029("۟ۢ") ^ i4;
                        i2 = ((iM11307 ^ i5) * (-13517)) ^ (-2086883806);
                        i3 = 1754521891;
                    }
                    i7 = iM11307 ^ i3;
                    i6 = i2;
                    break;
                case 1384795951:
                case 1738536756:
                    C3286.m9800(activityC1609, new Intent(activityC1609, (Class<?>) ActivityC17837.class));
                    return z;
                default:
                    if (!CallableC1627.f6528) {
                        iM11307 = C19806.m45029("ܽ᩸") ^ i4;
                        i2 = ((iM11307 ^ i5) * 8363) ^ (-657059375);
                        i3 = -2119688488;
                        i7 = iM11307 ^ i3;
                        i6 = i2;
                    } else {
                        iM11306 = C19806.m45029("ᩴۖ") ^ i5;
                        i6 = ((iM11306 ^ i4) * 741) ^ 1243524067;
                        i = -630337658;
                        i7 = iM11306 ^ i;
                        activityC1609 = this;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00db A[PHI: r4 r5
      0x00db: PHI (r4v3 android.view.MenuItem) = (r4v2 android.view.MenuItem), (r4v1 android.view.MenuItem) binds: [B:28:0x00c1, B:22:0x0099] A[DONT_GENERATE, DONT_INLINE]
      0x00db: PHI (r5v3 boolean) = (r5v2 boolean), (r5v1 boolean) binds: [B:28:0x00c1, B:22:0x0099] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0079, code lost:
    
        if (l.C2642.m8171() != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x007b, code lost:
    
        r2 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0081, code lost:
    
        if (l.C2704.f10408 != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x006c, code lost:
    
        if (l.C2249.f8050 >= 0) goto L10;
     */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onCreateOptionsMenu(android.view.Menu r29) {
        /*
            Method dump skipped, instruction units count: 1060
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ActivityC1609.onCreateOptionsMenu(android.view.Menu):boolean");
    }
}
