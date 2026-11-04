package l;

import com.alipay.sdk.m.y.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۤ֨᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: D20P */
/* JADX INFO: loaded from: classes3.dex */
public final class C10533 {

    /* JADX INFO: renamed from: ۘܰܿ, reason: not valid java name and contains not printable characters */
    private static final short[] f33500 = {2174, 3318, 3313, 3299, 3300, 3279, 3301, 3298, 3324, 3299, 3318, 3313, 3299, 3300, 3279, 3301, 3298, 3324, 3299, 3279, 3317, 3304, 3296, 3321, 3298, 3317, 3316, 3276, 3308, 9991, 28828, 28827, 28809, 28814, 28837, 28815, 28808, 28822, 28809, 28806};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public LinkedList f33501;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public HashMap f33502;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f33503;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m26989(boolean z) {
        if (C21576.m49085()) {
            AtomicInteger atomicInteger = new AtomicInteger();
            AtomicInteger atomicInteger2 = new AtomicInteger();
            AbstractC13887[] abstractC13887Arr = new AbstractC13887[C22468.f72705];
            Iterator itM4942 = C1343.m4942(this.f33503);
            while (C3998.m12923(itM4942)) {
                C5261.f18538.submit(new C21722(this, (AbstractC13887) C4238.m13529(itM4942), atomicInteger2, atomicInteger, abstractC13887Arr));
            }
            if (z) {
                do {
                    try {
                        Thread.sleep(10L);
                        if (C1519.m5400(atomicInteger) >= 1) {
                            break;
                        }
                    } catch (InterruptedException unused) {
                    }
                } while (C1519.m5400(atomicInteger2) != C2702.m8879(this.f33503));
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26988(AbstractC13887 abstractC13887) {
        String strM4058 = null;
        HashMap map = null;
        int i = -98148275;
        int i2 = C20932.f66974;
        int i3 = C3492.f12043;
        int iM3169 = C0773.m3169("ܽ᩷") ^ i2;
        int i4 = ((iM3169 ^ i3) * (-30013)) ^ 1808336299;
        int i5 = -2108460405;
        while (true) {
            i = ((((i ^ i3) * 9925) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2042637668:
                case 785433605:
                    map = this.f33502;
                    if (C17202.m40370(map, strM4058)) {
                        iM3169 = (i3 - C0619.m2761("֨֨")) * 57;
                        i4 = ((iM3169 ^ i2) * 30033) ^ (-37417094);
                        i5 = -1465297175;
                    } else {
                        iM3169 = (i2 - C0619.m2761("᩺۫")) * (-21);
                        i4 = ((iM3169 ^ i3) * (-2273)) ^ 2018328493;
                        i5 = 1756736171;
                    }
                    break;
                case -1879621730:
                case -1457745726:
                    C0950.m3785();
                    if (!RunnableC3646.f12471) {
                        iM3169 = C0619.m2761("ۜۗ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 24941) ^ (-857703712);
                        i5 = -40369214;
                    } else {
                        iM3169 = (C0619.m2761("֡᩵") + i2) * (-29);
                        i4 = ((iM3169 ^ i3) * 15211) ^ (-1112320289);
                        i5 = -252064040;
                    }
                    break;
                case -1706856813:
                case 2111130901:
                    if (!C0619.f2439) {
                        iM3169 = C0619.m2761("ۜۗ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 24941) ^ (-857703712);
                        i5 = -40369214;
                    } else {
                        iM3169 = C0773.m3169("ᩳܶ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-29451)) ^ (-1684867481);
                        i5 = -2083298460;
                    }
                    break;
                case -1656265465:
                case 145393925:
                    if (C3099.m10095()) {
                        iM3169 = (i3 - C0619.m2761("ܰۛ")) * 37;
                        i4 = ((iM3169 ^ i2) * 16303) ^ 1764699579;
                        i5 = 2025855429;
                    } else {
                        iM3169 = C0619.m2761("ܶۢ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-29371)) ^ (-1563191658);
                        i5 = 310661480;
                    }
                    break;
                case -1644354435:
                case 1356112578:
                    if (C3492.f12043 <= 0) {
                        iM3169 = C0773.m3169("ᩳܶ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-29451)) ^ (-1684867481);
                        i5 = -2083298460;
                    } else {
                        iM3169 = (C0619.m2761("۟ܿ") + i3) * (-15);
                        i4 = ((iM3169 ^ i2) * (-17347)) ^ (-1912209394);
                        i5 = 1228443006;
                    }
                    break;
                case -1465958188:
                case 1215274301:
                    if (C3448.m11248() != 0) {
                        iM3169 = C0619.m2761("ۜۗ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 24941) ^ (-857703712);
                        i5 = -40369214;
                    } else {
                        iM3169 = C0619.m2761("ۨ۟") ^ i3;
                        i4 = ((iM3169 ^ i2) * 6823) ^ (-1347152691);
                        i5 = -1450767936;
                    }
                    break;
                case -1403686274:
                case 2091947895:
                    strM4058 = C1080.m4058(abstractC13887);
                    if (C1343.m4943()) {
                        iM3169 = C0619.m2761("᩶᩶") ^ i2;
                        i4 = ((iM3169 ^ i3) * 20223) ^ (-854126611);
                        i5 = 69157440;
                    } else {
                        iM3169 = C0619.m2761("ۙ᩸") ^ i2;
                        i4 = ((iM3169 ^ i3) * 5111) ^ 1845196207;
                        i5 = 140693652;
                    }
                    break;
                case -1396903941:
                case -294763408:
                    C3690.m11987();
                    break;
                case -1229904889:
                case 1931497436:
                    if (C2288.f7433 <= 0) {
                        iM3169 = C0619.m2761("ۙ᩸") ^ i2;
                        i4 = ((iM3169 ^ i3) * 5111) ^ 1845196207;
                        i5 = 140693652;
                    } else {
                        iM3169 = (i3 - C0773.m3169("۬ۘ")) * (-127);
                        i4 = ((iM3169 ^ i2) * (-29181)) ^ (-1913969766);
                        i5 = 1826986025;
                    }
                    break;
                case -1166980610:
                case 1389851342:
                    if (C1564.m5509() <= 0) {
                        iM3169 = C0773.m3169("ᩳܶ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-29451)) ^ (-1684867481);
                        i5 = -2083298460;
                    } else {
                        iM3169 = (C0619.m2761("ܶܺ") + i2) * (-101);
                        i4 = ((iM3169 ^ i3) * 415) ^ 1479654045;
                        i5 = -1435960268;
                    }
                    break;
                case -1110099759:
                case 365090871:
                    C1519.m5396(map, C2023.m6952(abstractC13887), abstractC13887);
                    if (C3077.f9998) {
                        iM3169 = (C0773.m3169("ۤ֫") + i3) * 9;
                        i4 = ((iM3169 ^ i2) * 14341) ^ 1923868716;
                        i5 = 1965308633;
                    } else {
                        iM3169 = (C0619.m2761("֡᩵") + i2) * (-29);
                        i4 = ((iM3169 ^ i3) * 15211) ^ (-1112320289);
                        i5 = -252064040;
                    }
                    break;
                case -963182007:
                case 1211671052:
                    RunnableC0334.m2054(this.f33503, abstractC13887);
                    iM3169 = (i3 - C0619.m2761("֨֨")) * 57;
                    i4 = ((iM3169 ^ i2) * 30033) ^ (-37417094);
                    i5 = -1465297175;
                    break;
                case -699446381:
                case 1817674266:
                    C2287.m7745();
                    iM3169 = C0619.m2761("ۜۗ") ^ i3;
                    i4 = ((iM3169 ^ i2) * 24941) ^ (-857703712);
                    i5 = -40369214;
                    break;
                case -647377624:
                case 1415098070:
                    break;
                case -589305228:
                case 581891758:
                    if (C1542.f5343 <= 0) {
                        iM3169 = (i3 - C0619.m2761("ܰۛ")) * 37;
                        i4 = ((iM3169 ^ i2) * 16303) ^ 1764699579;
                        i5 = 2025855429;
                    } else {
                        iM3169 = (C0619.m2761("֡᩵") + i2) * (-29);
                        i4 = ((iM3169 ^ i3) * 15211) ^ (-1112320289);
                        i5 = -252064040;
                    }
                    break;
                case -551423386:
                case 1978894580:
                    if (C0487.m2356() >= 0) {
                        iM3169 = C0773.m3169("ᩳܶ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-29451)) ^ (-1684867481);
                        i5 = -2083298460;
                    } else {
                        iM3169 = C0773.m3169("֨ܽ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 24699) ^ 955876506;
                        i5 = -723139655;
                    }
                    break;
                case -30818903:
                case 1384933232:
                    if (C1519.f5300 >= 0) {
                        iM3169 = C0619.m2761("ۙ᩸") ^ i2;
                        i4 = ((iM3169 ^ i3) * 5111) ^ 1845196207;
                        i5 = 140693652;
                    } else {
                        iM3169 = C0619.m2761("۟ۢ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-23925)) ^ 1595950266;
                        i5 = -1221511397;
                    }
                    break;
                default:
                    if (C3448.m11248() != 0) {
                        iM3169 = C0619.m2761("ۜۗ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 24941) ^ (-857703712);
                        i5 = -40369214;
                    } else {
                        iM3169 = C0773.m3169("ۢ᩶") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-30445)) ^ 583901505;
                        i5 = -1079836317;
                    }
                    break;
            }
            return;
        }
    }

    public C10533() {
        HashMap map = null;
        ArrayList arrayList = null;
        int i = -792681918;
        int i2 = C2287.f7432;
        int i3 = C0773.f2792;
        int iM2761 = (C0619.m2761("ۙܶ") + i2) * (-13);
        int i4 = ((iM2761 ^ i3) * 11949) ^ 997164406;
        int i5 = -1123636070;
        while (true) {
            i = ((((i ^ i3) * (-16783)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2009567790:
                case 2099979918:
                    if (C2023.m6964() > 0) {
                        iM2761 = (C0619.m2761("ۗۡ") + i2) * 9;
                        i4 = ((iM2761 ^ i3) * (-895)) ^ 1276615841;
                        i5 = 1350472293;
                    } else {
                        iM2761 = C0773.m3169("ᩴᩴ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-2305)) ^ (-1727019255);
                        i5 = 536066173;
                    }
                    break;
                case -2004947547:
                case -396142306:
                    if (C1146.f4234 >= 0) {
                        iM2761 = (i3 - C0773.m3169("ۗܺ")) * (-57);
                        i4 = ((iM2761 ^ i2) * (-4541)) ^ 900166476;
                        i5 = -1000852905;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ۘ֨")) * 27;
                        i4 = ((iM2761 ^ i2) * (-10701)) ^ (-600671431);
                        i5 = 1524006115;
                    }
                    break;
                case -1765240979:
                case -794635538:
                    C0487.m2356();
                    if (C3033.f9831 < 0) {
                        iM2761 = C0773.m3169("ᩴᩴ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-2305)) ^ (-1727019255);
                        i5 = 536066173;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ۗܺ")) * (-57);
                        i4 = ((iM2761 ^ i2) * (-4541)) ^ 900166476;
                        i5 = -1000852905;
                    }
                    break;
                case -1612224268:
                case 728012829:
                    C23916.m53419();
                    if (!C3077.f9998) {
                        iM2761 = (i3 - C0773.m3169("ۗܺ")) * (-57);
                        i4 = ((iM2761 ^ i2) * (-4541)) ^ 900166476;
                        i5 = -1000852905;
                    } else {
                        iM2761 = C0619.m2761("۬ۚ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 18297) ^ (-485916517);
                        i5 = -698961626;
                    }
                    break;
                case -1594816840:
                case 732913626:
                    if (C3492.f12043 <= 0) {
                        iM2761 = C0619.m2761("۬ۚ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 18297) ^ (-485916517);
                        i5 = -698961626;
                    } else {
                        iM2761 = C0619.m2761("ۧۜ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-29799)) ^ 1290668504;
                        i5 = -852268710;
                    }
                    break;
                case -1574942010:
                case -628117847:
                    this.f33503 = arrayList;
                    if (C3492.m11488()) {
                        this.f33501 = new LinkedList();
                        return;
                    }
                    iM2761 = (C0619.m2761("ۗۡ") + i2) * 9;
                    i4 = ((iM2761 ^ i3) * (-895)) ^ 1276615841;
                    i5 = 1350472293;
                    break;
                case -1527124531:
                case 1774605721:
                    if (C3492.m11488()) {
                        iM2761 = (C0619.m2761("ۤ᩵") + i2) * (-87);
                        i4 = ((iM2761 ^ i3) * (-20681)) ^ 1580920135;
                        i5 = -682183790;
                    } else {
                        iM2761 = (C0619.m2761("ۗ᩹") ^ i3) * 41;
                        i4 = ((iM2761 ^ i2) * (-24589)) ^ (-1322221246);
                        i5 = 642591341;
                    }
                    break;
                case -1343650397:
                case 498620386:
                    if (C4238.f15451 >= 0) {
                        iM2761 = C0619.m2761("۬ۚ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 18297) ^ (-485916517);
                        i5 = -698961626;
                    } else {
                        iM2761 = C0773.m3169("ۛ᩹") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-1579)) ^ (-1040786334);
                        i5 = -697861222;
                    }
                    break;
                case -1094728163:
                case 1315679448:
                    RunnableC3646.m11813();
                    C1146.m4231();
                    iM2761 = C0619.m2761("۬ۚ") ^ i2;
                    i4 = ((iM2761 ^ i3) * 18297) ^ (-485916517);
                    i5 = -698961626;
                    break;
                case -1010337624:
                case 1963164513:
                    map = new HashMap();
                    if (C20932.f66974 <= 0) {
                        iM2761 = (C0619.m2761("ۗۡ") + i2) * 9;
                        i4 = ((iM2761 ^ i3) * (-895)) ^ 1276615841;
                        i5 = 1350472293;
                    } else {
                        iM2761 = (i2 - C0619.m2761("᩷ۖ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM2761 ^ i3) * (-24083)) ^ (-501472640);
                        i5 = -1283090999;
                    }
                    break;
                case 232997799:
                case 1279900672:
                    if (C3099.m10095()) {
                        iM2761 = C0619.m2761("۬ۚ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 18297) ^ (-485916517);
                        i5 = -698961626;
                    } else {
                        iM2761 = (C0773.m3169("᩵ۜ") ^ i2) * (-89);
                        i4 = ((iM2761 ^ i3) * 19247) ^ (-638001468);
                        i5 = 1701497280;
                    }
                    break;
                case 242770129:
                case 2079172321:
                    arrayList = new ArrayList();
                    if (C3448.f11240 >= 0) {
                        iM2761 = (C0619.m2761("ۗ᩹") ^ i3) * 41;
                        i4 = ((iM2761 ^ i2) * (-24589)) ^ (-1322221246);
                        i5 = 642591341;
                    } else {
                        iM2761 = (C0773.m3169("ۧ᩵") ^ i3) * (-31);
                        i4 = ((iM2761 ^ i2) * 28311) ^ (-1078521075);
                        i5 = -1125309151;
                    }
                    break;
                case 319830756:
                case 1004081427:
                    if (C2878.f9462) {
                        iM2761 = C0773.m3169("ᩴᩴ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-2305)) ^ (-1727019255);
                        i5 = 536066173;
                    } else {
                        iM2761 = C0619.m2761("᩻۬") ^ i3;
                        i4 = ((iM2761 ^ i2) * 21421) ^ (-1916863258);
                        i5 = -1694623130;
                    }
                    break;
                case 1032213683:
                case 1294216070:
                    this.f33502 = map;
                    if (C0487.f2131 <= 0) {
                        iM2761 = C0773.m3169("ᩴᩴ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-2305)) ^ (-1727019255);
                        i5 = 536066173;
                    } else {
                        iM2761 = C0773.m3169("֨᩺") ^ i3;
                        i4 = ((iM2761 ^ i2) * 1911) ^ 193261006;
                        i5 = 2095501738;
                    }
                    break;
                default:
                    C0487.m2356();
                    throw new RuntimeException();
            }
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m26991() {
        return C2702.m8879(this.f33503);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC13887 m26992() {
        LinkedList linkedList = null;
        int i = -456754722;
        int i2 = C2375.f7641;
        int i3 = C3492.f12043;
        int iM3169 = (C0773.m3169("᩺ۧ") ^ i2) * 73;
        int i4 = ((iM3169 ^ i3) * 15531) ^ 1466199010;
        int i5 = -2077490408;
        while (true) {
            i = ((((i ^ i3) * 32425) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2145663479:
                case -1036185640:
                    C2485.m8357();
                    iM3169 = C0773.m3169("۠᩺") ^ i2;
                    i4 = ((iM3169 ^ i3) * 15635) ^ (-1105121158);
                    i5 = 1611078136;
                    break;
                case -1941274703:
                case -523401599:
                    if (RunnableC1848.m6360()) {
                        iM3169 = C0773.m3169("۠᩺") ^ i2;
                        i4 = ((iM3169 ^ i3) * 15635) ^ (-1105121158);
                        i5 = 1611078136;
                    } else {
                        iM3169 = C0773.m3169("֡ۖ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-1763)) ^ (-1273072356);
                        i5 = -1359297738;
                    }
                    break;
                case -1812498030:
                case 1134311207:
                    C2310.m7813();
                    if (C3448.f11240 < 0) {
                        iM3169 = (C0773.m3169("ۨ۟") ^ i2) * q.h;
                        i4 = ((iM3169 ^ i3) * (-29553)) ^ (-711845916);
                        i5 = -262623740;
                    } else {
                        iM3169 = C0773.m3169("۠᩺") ^ i2;
                        i4 = ((iM3169 ^ i3) * 15635) ^ (-1105121158);
                        i5 = 1611078136;
                    }
                    break;
                case -1686200249:
                case -1123226966:
                    if (C1826.f6190 <= 0) {
                        iM3169 = (C0773.m3169("ۨ۟") ^ i2) * q.h;
                        i4 = ((iM3169 ^ i3) * (-29553)) ^ (-711845916);
                        i5 = -262623740;
                    } else {
                        iM3169 = (C0619.m2761("֡ۤ") + i2) * (-43);
                        i4 = ((iM3169 ^ i3) * 18323) ^ 216449717;
                        i5 = 2030426940;
                    }
                    break;
                case -848541428:
                case -765110255:
                    m26989(true);
                    m26987();
                    iM3169 = C0619.m2761("ܿܶ") ^ i2;
                    i4 = ((iM3169 ^ i3) * 19071) ^ 1224943991;
                    i5 = 975112583;
                    break;
                case -840533889:
                case 349790747:
                    C2966.m9664();
                    C17202.m40372();
                    return null;
                case -825676402:
                case 1339661466:
                    if (AbstractC3624.m11755() != 0) {
                        iM3169 = C0773.m3169("֡۫") ^ i3;
                        i4 = ((iM3169 ^ i2) * 6139) ^ 510391307;
                        i5 = -2147397583;
                    } else {
                        iM3169 = C0773.m3169("ܶۛ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 12679) ^ 1452838840;
                        i5 = 350884430;
                    }
                    break;
                case -810008729:
                case -523123886:
                    C13473.m33144();
                    if (!C0619.f2439) {
                        iM3169 = C0773.m3169("۠᩺") ^ i2;
                        i4 = ((iM3169 ^ i3) * 15635) ^ (-1105121158);
                        i5 = 1611078136;
                    } else {
                        iM3169 = C0773.m3169("ۤۡ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-27545)) ^ 92400554;
                        i5 = -775205012;
                    }
                    break;
                case -686088084:
                case 707007665:
                    linkedList = this.f33501;
                    if (AbstractC0641.f2496 >= 0) {
                        iM3169 = C0773.m3169("ۤۡ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-27545)) ^ 92400554;
                        i5 = -775205012;
                    } else {
                        iM3169 = (i2 - C0619.m2761("ۨ᩸")) * (-45);
                        i4 = ((iM3169 ^ i3) * 26989) ^ 284613034;
                        i5 = -1782073718;
                    }
                    break;
                case -665426980:
                case -179950001:
                    if (C1321.f4751 >= 0) {
                        iM3169 = C0773.m3169("ۤۡ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-27545)) ^ 92400554;
                        i5 = -775205012;
                    } else {
                        iM3169 = C0619.m2761("ۖ۟") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-12439)) ^ 22719551;
                        i5 = 440102875;
                    }
                    break;
                case -355785573:
                case 1182655439:
                    if (C3492.f12043 <= 0) {
                        iM3169 = C0773.m3169("֡۫") ^ i3;
                        i4 = ((iM3169 ^ i2) * 6139) ^ 510391307;
                        i5 = -2147397583;
                    } else {
                        iM3169 = (i3 - C0773.m3169("֡᩵")) * 77;
                        i4 = ((iM3169 ^ i2) * (-31333)) ^ (-1375942932);
                        i5 = 1328098187;
                    }
                    break;
                case 88136007:
                case 1321302569:
                    return (AbstractC13887) this.f33501.getFirst();
                case 164440539:
                case 2011344709:
                    if (C1343.f4799 != 0) {
                        iM3169 = (C0773.m3169("ۨ۟") ^ i2) * q.h;
                        i4 = ((iM3169 ^ i3) * (-29553)) ^ (-711845916);
                        i5 = -262623740;
                    } else {
                        iM3169 = (C0619.m2761("ۤۜ") + i2) * (-53);
                        i4 = ((iM3169 ^ i3) * 12217) ^ (-988852074);
                        i5 = 662092416;
                    }
                    break;
                case 182474937:
                case 1614045266:
                    if (C3077.m10041()) {
                        iM3169 = C0619.m2761("᩹۫") ^ i3;
                        i4 = ((iM3169 ^ i2) * 23065) ^ 1255344777;
                        i5 = 542394816;
                    } else {
                        iM3169 = (C0619.m2761("ܶۚ") + i3) * (-27);
                        i4 = ((iM3169 ^ i2) * 29753) ^ 778356005;
                        i5 = 1381174534;
                    }
                    break;
                case 368107930:
                case 662389552:
                    if (C0269.f1558 <= 0) {
                        iM3169 = C0773.m3169("۠᩺") ^ i2;
                        i4 = ((iM3169 ^ i3) * 15635) ^ (-1105121158);
                        i5 = 1611078136;
                    } else {
                        iM3169 = (C0619.m2761("۬ۤ") + i3) * 97;
                        i4 = ((iM3169 ^ i2) * 26743) ^ 1176824768;
                        i5 = -1342110799;
                    }
                    break;
                case 549736720:
                case 928093368:
                    if (C1826.f6190 <= 0) {
                        iM3169 = C0773.m3169("۠᩺") ^ i2;
                        i4 = ((iM3169 ^ i3) * 15635) ^ (-1105121158);
                        i5 = 1611078136;
                    } else {
                        iM3169 = (C0619.m2761("ۨᩳ") + i2) * (-17);
                        i4 = ((iM3169 ^ i3) * 7463) ^ 1938374976;
                        i5 = -444708512;
                    }
                    break;
                case 866250395:
                case 977475136:
                    if (C2354.f7599 < 0) {
                        iM3169 = C0773.m3169("֡۫") ^ i3;
                        i4 = ((iM3169 ^ i2) * 6139) ^ 510391307;
                        i5 = -2147397583;
                    } else {
                        iM3169 = (C0773.m3169("ۨ۟") ^ i2) * q.h;
                        i4 = ((iM3169 ^ i3) * (-29553)) ^ (-711845916);
                        i5 = -262623740;
                    }
                    break;
                default:
                    if (linkedList.isEmpty()) {
                        iM3169 = C0619.m2761("۟۟") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-23301)) ^ 1713340013;
                        i5 = -560329179;
                    } else {
                        iM3169 = C0619.m2761("ܿܶ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 19071) ^ 1224943991;
                        i5 = 975112583;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m26993() {
        short s = f33500[29];
        int i = ((s * s) + 693889) - (s * 1666) >= 0 ? 28922 : 22441;
        LinkedList linkedList = this.f33501;
        synchronized (linkedList) {
            if (!linkedList.isEmpty()) {
                linkedList.removeFirst();
                C22468.f72706.edit().putString(C3033.m9847(f33500, 30, 9, i), C24276.m54283(linkedList, C0269.m1785(f33500, 39, 1, i))).apply();
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m26990() {
        short s = f33500[0];
        int i = (s * 30998) - ((s * s) + 240219001) > 0 ? 31508 : 3216;
        String strM3786 = C0950.m3786(C22468.f72706, C1783.m6233(f33500, 1, 9, i), null);
        boolean z = C22468.f72706.getLong(RunnableC1848.m6366(f33500, 10, 17, i), 0L) < C3448.m11251();
        if (strM3786 != null) {
            for (String str : C2878.m9484(strM3786, C0619.m2756(f33500, 27, 2, i))) {
                AbstractC13887 abstractC13887 = (AbstractC13887) C0269.m1779(this.f33502, str);
                if (abstractC13887 != null) {
                    synchronized (this.f33501) {
                        this.f33501.add(abstractC13887);
                    }
                }
            }
        }
        boolean z2 = this.f33501.isEmpty() ? true : z;
        m26987();
        if (z2) {
            m26989(false);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26987() {
        LinkedList linkedList = this.f33501;
        synchronized (linkedList) {
            Iterator itM13647 = C4282.m13647(this.f33503);
            while (C1826.m6317(itM13647)) {
                AbstractC13887 abstractC13887 = (AbstractC13887) C4238.m13529(itM13647);
                if (linkedList.size() >= C22468.f72705) {
                    return;
                }
                if (!linkedList.contains(abstractC13887)) {
                    linkedList.add(abstractC13887);
                }
            }
        }
    }
}
