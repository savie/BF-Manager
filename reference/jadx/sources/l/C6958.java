package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ۜᩴ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: D20P */
/* JADX INFO: loaded from: classes2.dex */
public final class C6958 {

    /* JADX INFO: renamed from: ۨۛܽ, reason: not valid java name and contains not printable characters */
    private static final short[] f23388 = {799, 8986, 8989, 8975, 8968, 8995, 8969, 8974, 8976, 8975, 8960, 488, 28250, 28253, 28239, 28232, 28259, 28233, 28238, 28240, 28239, 28250, 28253, 28239, 28232, 28259, 28233, 28238, 28240, 28239, 28259, 28249, 28228, 28236, 28245, 28238, 28249, 28248, 28256, 28224};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public LinkedList f23389;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public HashMap f23390;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f23391;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m18702(boolean z) {
        if (C16737.m39294()) {
            AtomicInteger atomicInteger = new AtomicInteger();
            AtomicInteger atomicInteger2 = new AtomicInteger();
            AbstractC2787[] abstractC2787Arr = new AbstractC2787[C23187.f75241];
            Iterator itM10563 = C3577.m10563(this.f23391);
            while (C0962.m3748(itM10563)) {
                C4716.f16635.submit(new C4135(this, (AbstractC2787) C0216.m1584(itM10563), atomicInteger2, atomicInteger, abstractC2787Arr));
            }
            if (z) {
                do {
                    try {
                        Thread.sleep(10L);
                        if (ViewGroupOnHierarchyChangeListenerC1916.m6238(atomicInteger) >= 1) {
                            break;
                        }
                    } catch (InterruptedException unused) {
                    }
                } while (ViewGroupOnHierarchyChangeListenerC1916.m6238(atomicInteger2) != C1377.m4837(this.f23391));
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18701(AbstractC2787 abstractC2787) {
        String strM3407 = null;
        HashMap map = null;
        int i = -1251811961;
        int i2 = C1875.f7103;
        int i3 = C2249.f8050;
        int iM11306 = ThreadFactoryC3888.m11306("ᩳܿ") ^ i3;
        int i4 = ((iM11306 ^ i2) * (-9195)) ^ 1834686890;
        int i5 = -36058436;
        while (true) {
            i = ((((i ^ i2) * 1649) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2023540434:
                case -1806878190:
                    C1977.m6356();
                    C0962.m3746();
                    iM11306 = C19806.m45029("ۡۗ") ^ i2;
                    i4 = ((iM11306 ^ i3) * (-10637)) ^ 1544504345;
                    i5 = -924191063;
                    break;
                case -1961946987:
                case 371552069:
                    C1398.m4895();
                    if (C0216.f1393 != 0) {
                        iM11306 = (C19806.m45029("֫۟") ^ i3) * 101;
                        i4 = ((iM11306 ^ i2) * 23657) ^ (-394823290);
                        i5 = 1611251497;
                    } else {
                        iM11306 = C19806.m45029("ۡۗ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-10637)) ^ 1544504345;
                        i5 = -924191063;
                    }
                    break;
                case -1856093000:
                case 883795794:
                    strM3407 = C0817.m3407(abstractC2787);
                    if (RunnableC1564.f6300) {
                        iM11306 = ThreadFactoryC3888.m11306("ۡۘ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 8665) ^ 2072614304;
                        i5 = -1238724331;
                    } else {
                        iM11306 = C19806.m45029("ۨ᩵") ^ i2;
                        i4 = ((iM11306 ^ i3) * 24833) ^ (-1351386247);
                        i5 = 2130903180;
                    }
                    break;
                case -1808604244:
                case -1146930790:
                    map = this.f23390;
                    if (RunnableC1895.m6163(map, strM3407)) {
                        iM11306 = (C19806.m45029("᩻᩺") + i3) * (-21);
                        i4 = ((iM11306 ^ i2) * (-11169)) ^ (-1586794547);
                        i5 = 526695183;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("۫ܺ")) * (-35);
                        i4 = ((iM11306 ^ i3) * 26631) ^ (-1383132978);
                        i5 = 448503051;
                    }
                    break;
                case -1747325897:
                case 601372946:
                    RunnableC1606.m5473();
                    break;
                case -1677314629:
                case 982617215:
                    if (RunnableC3388.m10064()) {
                        iM11306 = (ThreadFactoryC3888.m11306("۫᩻") ^ i2) * (-63);
                        i4 = ((iM11306 ^ i3) * 27181) ^ (-1700334663);
                        i5 = -768654870;
                    } else {
                        iM11306 = C19806.m45029("ۡۗ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-10637)) ^ 1544504345;
                        i5 = -924191063;
                    }
                    break;
                case -1626631083:
                case 1908507095:
                    C2249.m6905(this.f23391, abstractC2787);
                    iM11306 = (C19806.m45029("᩻᩺") + i3) * (-21);
                    i4 = ((iM11306 ^ i2) * (-11169)) ^ (-1586794547);
                    i5 = 526695183;
                    break;
                case -1054662844:
                case -862564873:
                    if (RunnableC1895.m6170() != 0) {
                        iM11306 = C19806.m45029("ۡۗ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-10637)) ^ 1544504345;
                        i5 = -924191063;
                    } else {
                        iM11306 = (i3 - C19806.m45029("᩻ܶ")) * 23;
                        i4 = ((iM11306 ^ i2) * (-31297)) ^ (-997922955);
                        i5 = -637555148;
                    }
                    break;
                case -1026358451:
                case 455557532:
                    C3722.m10891(map, C0817.m3407(abstractC2787), abstractC2787);
                    if (C1668.f6641 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۡۘ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 8665) ^ 2072614304;
                        i5 = -1238724331;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("᩹֡")) * 79;
                        i4 = ((iM11306 ^ i2) * (-29317)) ^ (-781549234);
                        i5 = -1028869796;
                    }
                    break;
                case -744213543:
                case -555744156:
                    C1398.m4895();
                    if (C2642.f10294 <= 0) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ۢۘ")) * (-51);
                        i4 = ((iM11306 ^ i3) * 16251) ^ 1992015004;
                        i5 = -1368661026;
                    } else {
                        iM11306 = (C19806.m45029("֫۟") ^ i3) * 101;
                        i4 = ((iM11306 ^ i2) * 23657) ^ (-394823290);
                        i5 = 1611251497;
                    }
                    break;
                case -495676704:
                case 289471346:
                    if (CallableC1627.f6528) {
                        iM11306 = ThreadFactoryC3888.m11306("۠ۗ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 21905) ^ (-503528530);
                        i5 = -2006446294;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֫ᩴ") ^ i3) * (-69);
                        i4 = ((iM11306 ^ i2) * (-15417)) ^ (-440092524);
                        i5 = -70835642;
                    }
                    break;
                case -458297580:
                case -171348941:
                    if (C0797.f3386) {
                        iM11306 = ThreadFactoryC3888.m11306("ۡۘ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 8665) ^ 2072614304;
                        i5 = -1238724331;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۧ᩹") ^ i3;
                        i4 = ((iM11306 ^ i2) * 30493) ^ (-1759648401);
                        i5 = 963798664;
                    }
                    break;
                case -116275307:
                case 929181450:
                    if (C1668.m5583()) {
                        iM11306 = ThreadFactoryC3888.m11306("ᩴܺ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 5493) ^ (-2013252410);
                        i5 = -93138023;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֫ᩴ") ^ i3) * (-69);
                        i4 = ((iM11306 ^ i2) * (-15417)) ^ (-440092524);
                        i5 = -70835642;
                    }
                    break;
                case 658120818:
                case 1085892759:
                    if (RunnableC1564.f6300) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ۢۘ")) * (-51);
                        i4 = ((iM11306 ^ i3) * 16251) ^ 1992015004;
                        i5 = -1368661026;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۠۬") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-28931)) ^ (-1552380846);
                        i5 = 2000157210;
                    }
                    break;
                case 1035575551:
                case 1214984659:
                    if (C19806.f63586) {
                        iM11306 = (C19806.m45029("֫۟") ^ i3) * 101;
                        i4 = ((iM11306 ^ i2) * 23657) ^ (-394823290);
                        i5 = 1611251497;
                    } else {
                        iM11306 = C19806.m45029("᩶֡") ^ i2;
                        i4 = ((iM11306 ^ i3) * 22567) ^ (-1965533160);
                        i5 = 519784053;
                    }
                    break;
                case 1208714674:
                case 1599088153:
                    if (C19806.f63586) {
                        iM11306 = ThreadFactoryC3888.m11306("ۡۘ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 8665) ^ 2072614304;
                        i5 = -1238724331;
                    } else {
                        iM11306 = C19806.m45029("֨ۗ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 21159) ^ (-1307379586);
                        i5 = -2133159977;
                    }
                    break;
                case 1380097600:
                case 1984502893:
                    C3722.m10894();
                    if (C3577.f13150 < 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("֫ᩴ") ^ i3) * (-69);
                        i4 = ((iM11306 ^ i2) * (-15417)) ^ (-440092524);
                        i5 = -70835642;
                    } else {
                        iM11306 = (C19806.m45029("֫۟") ^ i3) * 101;
                        i4 = ((iM11306 ^ i2) * 23657) ^ (-394823290);
                        i5 = 1611251497;
                    }
                    break;
            }
            return;
        }
    }

    public C6958() {
        HashMap map = null;
        ArrayList arrayList = null;
        int i = 459580129;
        int i2 = C7105.f23796;
        int i3 = MenuItemOnMenuItemClickListenerC3244.f12064;
        int iM45029 = (i2 - C19806.m45029("᩻᩶")) * (-127);
        int i4 = ((iM45029 ^ i3) * 9223) ^ (-742461624);
        int i5 = 117396748;
        while (true) {
            i = ((((i ^ i3) * (-12735)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2123269551:
                case -636057004:
                    this.f23390 = map;
                    if (C0817.f3443) {
                        iM45029 = C19806.m45029("ᩳܿ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 14671) ^ 186472617;
                        i5 = 200602003;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴۛ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-5633)) ^ 400092774;
                        i5 = 1458060180;
                    }
                    break;
                case -1997019134:
                case -899104054:
                    if (C1875.m6086() != 0) {
                        iM45029 = C19806.m45029("۟᩻") ^ i2;
                        i4 = ((iM45029 ^ i3) * 26309) ^ 1684781341;
                        i5 = -168891782;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩶ۚ") ^ i3) * 63;
                        i4 = ((iM45029 ^ i2) * (-3835)) ^ (-1363255025);
                        i5 = 507186300;
                    }
                    break;
                case -1668328356:
                case 1464082875:
                    C2477.m7593();
                    ThreadFactoryC3888.m11300();
                    throw new RuntimeException();
                case -1625207080:
                case -862588635:
                    map = new HashMap();
                    if (C2704.f10408) {
                        iM45029 = (C19806.m45029("ۙۗ") + i2) * (-63);
                        i4 = ((iM45029 ^ i3) * (-22831)) ^ (-280200870);
                        i5 = 1220929210;
                    } else {
                        iM45029 = (C19806.m45029("ܺۨ") + i3) * (-43);
                        i4 = ((iM45029 ^ i2) * 18459) ^ (-165149118);
                        i5 = -1493999250;
                    }
                    break;
                case -1442815387:
                case 935935545:
                    if (C2477.f9839 > 0) {
                        iM45029 = (C19806.m45029("ܺۨ") + i3) * (-43);
                        i4 = ((iM45029 ^ i2) * 18459) ^ (-165149118);
                        i5 = -1493999250;
                    } else {
                        iM45029 = C19806.m45029("۟᩻") ^ i2;
                        i4 = ((iM45029 ^ i3) * 26309) ^ 1684781341;
                        i5 = -168891782;
                    }
                    break;
                case -1282393801:
                case 2044525495:
                    if (C0526.f2219) {
                        iM45029 = C19806.m45029("ۡ۠") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-2651)) ^ (-880983402);
                        i5 = -1419114237;
                    } else {
                        iM45029 = (i3 - C19806.m45029("᩻ܽ")) * (-119);
                        i4 = ((iM45029 ^ i2) * (-29423)) ^ (-1282181353);
                        i5 = 192419783;
                    }
                    break;
                case -1168681702:
                case -460462417:
                    if (C0526.f2219) {
                        iM45029 = (C19806.m45029("ܺۨ") + i3) * (-43);
                        i4 = ((iM45029 ^ i2) * 18459) ^ (-165149118);
                        i5 = -1493999250;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۨ᩷") + i3) * 47;
                        i4 = ((iM45029 ^ i2) * 12449) ^ 323254524;
                        i5 = 1455779327;
                    }
                    break;
                case -872686784:
                case 1066029097:
                    ViewTreeObserverOnPreDrawListenerC3327.m9874();
                    if (C1460.f5948 < 0) {
                        iM45029 = C19806.m45029("ۡ۠") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-2651)) ^ (-880983402);
                        i5 = -1419114237;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴۛ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-5633)) ^ 400092774;
                        i5 = 1458060180;
                    }
                    break;
                case -649376987:
                case 608169676:
                    if (C3722.f13525 <= 0) {
                        iM45029 = C19806.m45029("۟᩻") ^ i2;
                        i4 = ((iM45029 ^ i3) * 26309) ^ 1684781341;
                        i5 = -168891782;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩹۬") + i3) * (-23);
                        i4 = ((iM45029 ^ i2) * 12617) ^ (-917058489);
                        i5 = -77145011;
                    }
                    break;
                case -183646451:
                case 1944284695:
                    if (C1461.f5957 <= 0) {
                        iM45029 = (C19806.m45029("ܺۨ") + i3) * (-43);
                        i4 = ((iM45029 ^ i2) * 18459) ^ (-165149118);
                        i5 = -1493999250;
                    } else {
                        iM45029 = (C19806.m45029("ۖ᩻") + i2) * (-35);
                        i4 = ((iM45029 ^ i3) * 11469) ^ (-1832230433);
                        i5 = -1638989810;
                    }
                    break;
                case -120162649:
                case 1384968487:
                    if (C0278.m1789() <= 0) {
                        iM45029 = C19806.m45029("۟᩻") ^ i2;
                        i4 = ((iM45029 ^ i3) * 26309) ^ 1684781341;
                        i5 = -168891782;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴۛ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-5633)) ^ 400092774;
                        i5 = 1458060180;
                    }
                    break;
                case 174637227:
                case 293377086:
                    C3286.m9798();
                    iM45029 = ThreadFactoryC3888.m11306("ᩴۛ") ^ i2;
                    i4 = ((iM45029 ^ i3) * (-5633)) ^ 400092774;
                    i5 = 1458060180;
                    break;
                case 317077841:
                case 858951515:
                    this.f23391 = arrayList;
                    if (!C7105.m18985()) {
                        this.f23389 = new LinkedList();
                        return;
                    }
                    iM45029 = ThreadFactoryC3888.m11306("ᩴۛ") ^ i2;
                    i4 = ((iM45029 ^ i3) * (-5633)) ^ 400092774;
                    i5 = 1458060180;
                    break;
                case 586206330:
                case 1338661599:
                    if (C2704.f10408) {
                        iM45029 = (C19806.m45029("ܳۗ") ^ i2) * (-109);
                        i4 = ((iM45029 ^ i3) * (-16499)) ^ 221575163;
                        i5 = 1766384555;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴۛ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-5633)) ^ 400092774;
                        i5 = 1458060180;
                    }
                    break;
                default:
                    arrayList = new ArrayList();
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("۬ۗ") ^ i2) * (-17);
                        i4 = ((iM45029 ^ i3) * 21377) ^ 206651671;
                        i5 = -1197748923;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۘ᩺") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-21727)) ^ (-508066448);
                        i5 = -1276853692;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m18703() {
        return C1377.m4837(this.f23391);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC2787 m18705() {
        LinkedList linkedList = null;
        int i = -336076410;
        int i2 = C1148.f5161;
        int i3 = C2477.f9839;
        int iM11306 = (i2 - ThreadFactoryC3888.m11306("ᩴ᩶")) * (-5);
        int i4 = ((iM11306 ^ i3) * (-3915)) ^ (-2136535794);
        int i5 = 186927271;
        while (true) {
            i = ((((i ^ i3) * (-5)) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2017133770:
                case -750015506:
                    if (C19806.f63586) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩺۬") ^ i2) * 11;
                        i4 = ((iM11306 ^ i3) * 12133) ^ 1879469985;
                        i5 = 1948995678;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۠ۤ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 5683) ^ 571558928;
                        i5 = -646107771;
                    }
                    break;
                case -1968440416:
                case 175438611:
                    linkedList = this.f23389;
                    if (RunnableC1895.f7152) {
                        iM11306 = C19806.m45029("ܽᩴ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-27107)) ^ 1676034717;
                        i5 = -501707285;
                    } else {
                        iM11306 = (i3 - C19806.m45029("֫۫")) * 61;
                        i4 = ((iM11306 ^ i2) * 14531) ^ 984419081;
                        i5 = 598392663;
                    }
                    break;
                case -1842777646:
                case 1527339369:
                    if (RunnableC0195.f1321 >= 0) {
                        iM11306 = (C19806.m45029("ۜۘ") + i3) * (-73);
                        i4 = ((iM11306 ^ i2) * (-13153)) ^ (-1337494128);
                        i5 = 1136370442;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩹֫") ^ i2;
                        i4 = ((iM11306 ^ i3) * 22137) ^ (-789107991);
                        i5 = -853890372;
                    }
                    break;
                case -1742103103:
                case -1370137125:
                    C0050.m946();
                    C1937.m6279();
                    iM11306 = (ThreadFactoryC3888.m11306("᩺۬") ^ i2) * 11;
                    i4 = ((iM11306 ^ i3) * 12133) ^ 1879469985;
                    i5 = 1948995678;
                    break;
                case -1454573713:
                case -977158424:
                    if (C10634.f36300 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۛ۟") ^ i3;
                        i4 = ((iM11306 ^ i2) * 4623) ^ 461137644;
                        i5 = 490961972;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۜ᩶") ^ i2;
                        i4 = ((iM11306 ^ i3) * 30133) ^ 354708826;
                        i5 = 473967981;
                    }
                    break;
                case -1426388302:
                case -19481370:
                    m18702(true);
                    m18700();
                    iM11306 = (ThreadFactoryC3888.m11306("ۜܺ") + i3) * 43;
                    i4 = ((iM11306 ^ i2) * (-30147)) ^ 827978438;
                    i5 = -834532195;
                    break;
                case -1394787590:
                case -958483887:
                    if (C2871.f10837 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩺۬") ^ i2) * 11;
                        i4 = ((iM11306 ^ i3) * 12133) ^ 1879469985;
                        i5 = 1948995678;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("᩺᩵")) * 37;
                        i4 = ((iM11306 ^ i3) * 18413) ^ (-648276846);
                        i5 = -1489390286;
                    }
                    break;
                case -1309684941:
                case 2129818430:
                    if (C2871.f10837 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩺۬") ^ i2) * 11;
                        i4 = ((iM11306 ^ i3) * 12133) ^ 1879469985;
                        i5 = 1948995678;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۧܳ") + i3) * (-13);
                        i4 = ((iM11306 ^ i2) * (-7605)) ^ (-1962791736);
                        i5 = -1951803137;
                    }
                    break;
                case -983436635:
                case 1676910480:
                    if (RunnableC1895.m6162(linkedList)) {
                        iM11306 = C19806.m45029("ۜᩴ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-1051)) ^ 105580641;
                        i5 = -716654515;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۜܺ") + i3) * 43;
                        i4 = ((iM11306 ^ i2) * (-30147)) ^ 827978438;
                        i5 = -834532195;
                    }
                    break;
                case -302128351:
                case 1797625905:
                    if (C2477.f9839 > 0) {
                        iM11306 = (C19806.m45029("ۜۘ") + i3) * (-73);
                        i4 = ((iM11306 ^ i2) * (-13153)) ^ (-1337494128);
                        i5 = 1136370442;
                    } else {
                        iM11306 = (i3 - C19806.m45029("֫۫")) * 61;
                        i4 = ((iM11306 ^ i2) * 14531) ^ 984419081;
                        i5 = 598392663;
                    }
                    break;
                case -115223663:
                case 1287670543:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩺۬") ^ i2) * 11;
                        i4 = ((iM11306 ^ i3) * 12133) ^ 1879469985;
                        i5 = 1948995678;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۧۤ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 5709) ^ 787655369;
                        i5 = -832812535;
                    }
                    break;
                case -22630600:
                case 932904253:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩺۬") ^ i2) * 11;
                        i4 = ((iM11306 ^ i3) * 12133) ^ 1879469985;
                        i5 = 1948995678;
                    } else {
                        iM11306 = C19806.m45029("۟֡") ^ i3;
                        i4 = ((iM11306 ^ i2) * 31295) ^ (-1224147061);
                        i5 = -1995436067;
                    }
                    break;
                case 146748921:
                case 583256213:
                    C2704.m8255();
                    C2477.m7593();
                    return null;
                case 371397849:
                case 914068424:
                    return (AbstractC2787) this.f23389.getFirst();
                case 1115540684:
                case 1319229219:
                    if (C1189.f5284 > 0) {
                        iM11306 = (i3 - C19806.m45029("֫۫")) * 61;
                        i4 = ((iM11306 ^ i2) * 14531) ^ 984419081;
                        i5 = 598392663;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩺۬") ^ i2) * 11;
                        i4 = ((iM11306 ^ i3) * 12133) ^ 1879469985;
                        i5 = 1948995678;
                    }
                    break;
                case 1429251012:
                case 1728513792:
                    if (C1066.f4915 <= 0) {
                        iM11306 = C19806.m45029("ۜ᩷") ^ i2;
                        i4 = ((iM11306 ^ i3) * 18115) ^ 185888422;
                        i5 = 345385677;
                    } else {
                        iM11306 = C19806.m45029("۫۫") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-17915)) ^ 1442297864;
                        i5 = 1210678714;
                    }
                    break;
                case 1671690033:
                case 1836229054:
                    if (!C3286.f12186) {
                        iM11306 = C19806.m45029("ۜ᩷") ^ i2;
                        i4 = ((iM11306 ^ i3) * 18115) ^ 185888422;
                        i5 = 345385677;
                    } else {
                        iM11306 = (i3 - C19806.m45029("֫۫")) * 61;
                        i4 = ((iM11306 ^ i2) * 14531) ^ 984419081;
                        i5 = 598392663;
                    }
                    break;
                default:
                    if (C7105.f23796 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩺۬") ^ i2) * 11;
                        i4 = ((iM11306 ^ i3) * 12133) ^ 1879469985;
                        i5 = 1948995678;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩵ᩴ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 2201) ^ 2128949858;
                        i5 = 620948405;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m18699() {
        short s = f23388[0];
        int i = (s * 16660) - ((s * s) + 69388900) > 0 ? 65444 : 9084;
        LinkedList linkedList = this.f23389;
        synchronized (linkedList) {
            if (!RunnableC1895.m6162(linkedList)) {
                linkedList.removeFirst();
                C23187.f75242.edit().putString(ViewGroupOnHierarchyChangeListenerC1916.m6241(f23388, 1, 9, i), C6851.m18456(linkedList, C2249.m6918(f23388, 10, 1, i))).apply();
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m18704() {
        short s = f23388[11];
        int i = s + 1;
        int i2 = ((s * 2) + 1) - (i * i) > 0 ? 3048 : 28220;
        String strM10951 = C3743.m10951(C23187.f75242, C2788.m8470(f23388, 12, 9, i2), null);
        boolean z = C23187.f75242.getLong(C1419.m4969(f23388, 21, 17, i2), 0L) < C1460.m5059();
        if (strM10951 != null) {
            for (String str : AbstractC0464.m2306(strM10951, RunnableC0195.m1429(f23388, 38, 2, i2))) {
                AbstractC2787 abstractC2787 = (AbstractC2787) C2332.m7077(this.f23390, str);
                if (abstractC2787 != null) {
                    synchronized (this.f23389) {
                        this.f23389.add(abstractC2787);
                    }
                }
            }
        }
        boolean z2 = C3722.m10903(this.f23389) ? true : z;
        m18700();
        if (z2) {
            m18702(false);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18700() {
        LinkedList linkedList = this.f23389;
        synchronized (linkedList) {
            Iterator itM10563 = C3577.m10563(this.f23391);
            while (C0962.m3748(itM10563)) {
                AbstractC2787 abstractC2787 = (AbstractC2787) C0216.m1584(itM10563);
                if (linkedList.size() >= C23187.f75241) {
                    return;
                }
                if (!linkedList.contains(abstractC2787)) {
                    linkedList.add(abstractC2787);
                }
            }
        }
    }
}
