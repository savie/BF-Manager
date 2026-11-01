package l;

import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.math.ec.rfc8032.Scalar25519;

/* JADX INFO: renamed from: l.۟᩻ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: D17I */
/* JADX INFO: loaded from: classes3.dex */
public final class C7801 extends AbstractC3492 {

    /* JADX INFO: renamed from: ᩸ۨ֨, reason: not valid java name and contains not printable characters */
    private static final short[] f25670 = {5743, 24820, 24819, 24823, 24824, 24830, 24809, 24770, 24817, 24818, 24826, 24770, 24827, 24818, 24815, 24816, 24828, 24809, 24774, 24777, 24788, 24784, 24792, 24768, 24765, 24774, 24798, 24785, 24796, 24782, 24782, 24768, 24727, 24752, 24739, 24774, 24784, 24792, 24777, 24789, 24786, 24793, 24768, 24757, 24774, 24785, 24786, 24798, 24796, 24777, 24788, 24786, 24787, 24768, 24756, 24727, 24774, 24783, 24792, 24782, 24776, 24785, 24777, 24768, 24727, 24752, 24752, 24752, 24752, 24752, 24752, 24752, 24752, 24752, 24752, 24752, 24752, 24752, 24752, 24752, 24752, 24752, 24752, 24752, 24752, 24727, 5278, 14420, -6821, 24785, 24816, 24809, 24754, 24785, 24818, 24826, 24742, 24785, 24818, 24826, 24755, 24814, 24816, 24828, 24817, 24820, 24785, 24831, 24820, 24819, 24754, 24809, 24818, 24818, 24817, 24814, 24754, 24820, 24819, 24823, 24824, 24830, 24809, 24754, 24788, 24819, 24823, 24824, 24830, 24809, 24824, 24825, 24785, 24818, 24826, 24742, 24766, 24766, 24785, 24786, 24794, 24770, 24795, 24786, 24783, 24784, 24796, 24777, 24766, 24766, 24766, 24766, 24785, 24786, 24794, 24770, 24781, 24796, 24777, 24789, 24766, 24766, 24766, 24766, 24781, 24796, 24798, 24790, 24796, 24794, 24792, 24770, 24787, 24796, 24784, 24792, 24766, 24766, 24766, 24766, 24781, 24796, 24783, 24796, 24784, 24792, 24777, 24792, 24783, 24766, 24766, 24755, 24809, 24816, 24813, 24781, 24828, 24815, 24814, 24824, 24765, 24814, 24816, 24828, 24817, 24820, 24765, 24827, 24828, 24820, 24817, 24824, 24825, 24795, 24820, 24817, 24824, 24765, 24819, 24818, 24809, 24765, 24827, 24818, 24808, 24819, 24825, 24743, 24765, 24830, 24817, 24828, 24814, 24814, 24824, 24814, 24755, 24825, 24824, 24805, 12718, 13464, 6406, 24770, 24817, 24818, 24826, 2017, 1766, 4623, 7775, 32576, 19264, -31387, 4622, 4622, 4622};

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f25671;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f25672;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC0744 f25673;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C23229 f25674;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f25675;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f25676;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22681 f25677;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14558 f25678;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C1777 f25679;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC3183 f25680;

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        C1777 c1777 = null;
        AbstractC20745 abstractC20745 = null;
        int i = -557448278;
        int i2 = C1977.f7413;
        int i3 = C1025.f4800;
        int iM45029 = C19806.m45029("ܳܰ") ^ i3;
        int i4 = ((iM45029 ^ i2) * 7439) ^ 576992188;
        int i5 = -777509177;
        while (true) {
            i = ((((i ^ i2) * 27097) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -1960058164:
                case -762702720:
                    if (C3577.f13150 >= 0) {
                        iM45029 = C19806.m45029("᩷ۡ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 10961) ^ 977453668;
                        i5 = -2034524084;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܽۘ") + i3) * 63;
                        i4 = ((iM45029 ^ i2) * (-20801)) ^ (-707047834);
                        i5 = -1027333586;
                    }
                    break;
                case -1940830315:
                case -722085986:
                    RunnableC3388.m10052(abstractC20745);
                    iM45029 = (i2 - C19806.m45029("֡۫")) * (-121);
                    i4 = ((iM45029 ^ i3) * (-14123)) ^ 102631433;
                    i5 = -606301490;
                    break;
                case -1889301806:
                case 543442404:
                    if (C2788.f10625 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۜ֫") ^ i2) * 31;
                        i4 = ((iM45029 ^ i3) * (-20151)) ^ (-372054807);
                        i5 = -1735695901;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۤܺ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-13027)) ^ (-170498532);
                        i5 = -2141857123;
                    }
                    break;
                case -1875561419:
                case 1982386294:
                    if (C1398.f5802 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۧۖ") + i3) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM45029 ^ i2) * 27183) ^ (-92124423);
                        i5 = -875383872;
                    } else {
                        iM45029 = C19806.m45029("᩷ۡ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 10961) ^ 977453668;
                        i5 = -2034524084;
                    }
                    break;
                case -1765160785:
                case -1054849391:
                    c1777.m5825();
                    abstractC20745 = this.f25672;
                    if (abstractC20745 != null) {
                        iM45029 = C19806.m45029("᩺ۗ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-21433)) ^ 1091391825;
                        i5 = 1558415559;
                    } else {
                        iM45029 = (i2 - C19806.m45029("֡۫")) * (-121);
                        i4 = ((iM45029 ^ i3) * (-14123)) ^ 102631433;
                        i5 = -606301490;
                    }
                    break;
                case -1235595198:
                case 502302113:
                    C2788.m8472();
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM45029 = C19806.m45029("᩷ۡ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 10961) ^ 977453668;
                        i5 = -2034524084;
                    } else {
                        iM45029 = (C19806.m45029("ܿ֫") + i3) * 53;
                        i4 = ((iM45029 ^ i2) * 11711) ^ (-1391004902);
                        i5 = -276130977;
                    }
                    break;
                case -1187881698:
                case -687723969:
                    if (C1025.f4800 >= 0) {
                        iM45029 = C19806.m45029("ۗ۟") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-28611)) ^ (-1486508171);
                        i5 = -1962760659;
                    } else {
                        iM45029 = C19806.m45029("۠֡") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-3633)) ^ 1316067496;
                        i5 = 1182328481;
                    }
                    break;
                case -1014081555:
                case -843525778:
                    if (C2704.f10408) {
                        iM45029 = (C19806.m45029("ᩳۜ") + i2) * (-71);
                        i4 = ((iM45029 ^ i3) * (-19981)) ^ (-1762244673);
                        i5 = -393336678;
                    } else {
                        iM45029 = (C19806.m45029("ܿ֫") + i3) * 53;
                        i4 = ((iM45029 ^ i2) * 11711) ^ (-1391004902);
                        i5 = -276130977;
                    }
                    break;
                case -725809534:
                case 635557943:
                    RunnableC1564.m5345();
                    C1398.m4895();
                    iM45029 = (C19806.m45029("ܿ֫") + i3) * 53;
                    i4 = ((iM45029 ^ i2) * 11711) ^ (-1391004902);
                    i5 = -276130977;
                    break;
                case -722518221:
                case -672897112:
                    if (C1025.f4800 >= 0) {
                        iM45029 = C19806.m45029("ۗ۟") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-28611)) ^ (-1486508171);
                        i5 = -1962760659;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۙۤ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 2903) ^ 1991461100;
                        i5 = 37436260;
                    }
                    break;
                case -653795007:
                case 1746220003:
                    if (C1461.f5957 > 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۜ֫") ^ i2) * 31;
                        i4 = ((iM45029 ^ i3) * (-20151)) ^ (-372054807);
                        i5 = -1735695901;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۧۖ") + i3) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM45029 ^ i2) * 27183) ^ (-92124423);
                        i5 = -875383872;
                    }
                    break;
                case -628240440:
                case 560290047:
                    C19806.m45024();
                    break;
                case -529344136:
                case 1240139484:
                    this.f25677.m50240();
                    C1148.m4233();
                    break;
                case -232375359:
                case 1140141358:
                    if (C3535.f13026 <= 0) {
                        iM45029 = C19806.m45029("ۗ۟") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-28611)) ^ (-1486508171);
                        i5 = -1962760659;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۗ֨") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-2827)) ^ 832989300;
                        i5 = 1918960081;
                    }
                    break;
                case 18429013:
                case 1068820387:
                    c1777 = this.f25679;
                    if (C2871.f10837 >= 0) {
                        iM45029 = C19806.m45029("ۗ۟") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-28611)) ^ (-1486508171);
                        i5 = -1962760659;
                    } else {
                        iM45029 = C19806.m45029("᩶᩷") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-22081)) ^ 1262338413;
                        i5 = -2048740115;
                    }
                    break;
                case 532301290:
                case 678989695:
                    if (C2249.f8050 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۜ֫") ^ i2) * 31;
                        i4 = ((iM45029 ^ i3) * (-20151)) ^ (-372054807);
                        i5 = -1735695901;
                    } else {
                        iM45029 = (C19806.m45029("ۡۜ") ^ i3) * (-121);
                        i4 = ((iM45029 ^ i2) * 22011) ^ 1109118491;
                        i5 = -1845796190;
                    }
                    break;
                case 1357181572:
                case 1803083601:
                    if (C7105.f23796 >= 0) {
                        iM45029 = C19806.m45029("᩷ۡ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 10961) ^ 977453668;
                        i5 = -2034524084;
                    } else {
                        iM45029 = C19806.m45029("ۢܿ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-28731)) ^ (-418464453);
                        i5 = 1304364275;
                    }
                    break;
                default:
                    if (C19806.f63586) {
                        iM45029 = C19806.m45029("᩷ۡ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 10961) ^ 977453668;
                        i5 = -2034524084;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩷᩻") + i2) * 99;
                        i4 = ((iM45029 ^ i3) * 30311) ^ (-1910606962);
                        i5 = -91864810;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        C23229 c23229 = null;
        C11545 c11545 = null;
        AbstractC20745 abstractC20745 = null;
        int i = -1406354304;
        int i2 = RunnableC1606.f6488;
        int i3 = ViewTreeObserverOnPreDrawListenerC3327.f12317;
        int iM11306 = (ThreadFactoryC3888.m11306("ᩴᩴ") + i2) * (-121);
        int i4 = ((iM11306 ^ i3) * (-8149)) ^ (-1901889234);
        int i5 = -1197277471;
        while (true) {
            i = ((((i ^ i3) * (-8579)) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2032971800:
                case -1194049338:
                    if (AbstractC0464.f2088 <= 0) {
                        iM11306 = (C19806.m45029("ۘܽ") ^ i3) * (-93);
                        i4 = ((iM11306 ^ i2) * (-10613)) ^ (-1174994773);
                        i5 = 838536387;
                    } else {
                        iM11306 = C19806.m45029("ܰܶ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 14813) ^ 626297239;
                        i5 = 2146434010;
                    }
                    break;
                case -1985744117:
                case -1434684261:
                    C1066.m4028(c11545, C3743.m10959(abstractC20745));
                    iM11306 = C19806.m45029("ۢ᩶") ^ i3;
                    i4 = ((iM11306 ^ i2) * (-4473)) ^ 1557302740;
                    i5 = -1613962379;
                    break;
                case -1886031778:
                case -662308629:
                    abstractC20745 = this.f25671;
                    if (C1460.f5948 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֨᩹") ^ i3;
                        i4 = ((iM11306 ^ i2) * 30113) ^ (-390474201);
                        i5 = 231855046;
                    } else {
                        iM11306 = (C19806.m45029("ܺᩳ") ^ i2) * (-13);
                        i4 = ((iM11306 ^ i3) * (-6177)) ^ 752436816;
                        i5 = 2020527944;
                    }
                    break;
                case -1749407035:
                case 624974930:
                    c11545 = this.f25673.f3040;
                    if (C1398.f5802 <= 0) {
                        iM11306 = (C19806.m45029("ۘܽ") ^ i3) * (-93);
                        i4 = ((iM11306 ^ i2) * (-10613)) ^ (-1174994773);
                        i5 = 838536387;
                    } else {
                        iM11306 = C19806.m45029("ܿۧ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 4223) ^ (-1792533496);
                        i5 = -1849437456;
                    }
                    break;
                case -1413661295:
                case -374897828:
                    if (RunnableC1564.m5353(this.f25679)) {
                        iM11306 = C19806.m45029("ۢ᩶") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-4473)) ^ 1557302740;
                        i5 = -1613962379;
                    } else {
                        iM11306 = (C19806.m45029("ܰۚ") ^ i2) * 79;
                        i4 = ((iM11306 ^ i3) * (-20873)) ^ 36359756;
                        i5 = -1798124821;
                    }
                    break;
                case -1102572121:
                case 1054835132:
                    if (C1148.f5161 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֨᩹") ^ i3;
                        i4 = ((iM11306 ^ i2) * 30113) ^ (-390474201);
                        i5 = 231855046;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܺۚ") + i2) * 69;
                        i4 = ((iM11306 ^ i3) * (-23029)) ^ (-1926718828);
                        i5 = -691748932;
                    }
                    break;
                case -1087016604:
                case 391927214:
                    if (c23229.m51236()) {
                        iM11306 = ThreadFactoryC3888.m11306("᩹۠") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-29921)) ^ 548274809;
                        i5 = 108228099;
                    } else {
                        iM11306 = C19806.m45029("ۢ᩶") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-4473)) ^ 1557302740;
                        i5 = -1613962379;
                    }
                    break;
                case -1055798907:
                case 576510085:
                    if (RunnableC3388.f12514 < 0) {
                        iM11306 = (C19806.m45029("ۘܽ") ^ i3) * (-93);
                        i4 = ((iM11306 ^ i2) * (-10613)) ^ (-1174994773);
                        i5 = 838536387;
                    } else {
                        iM11306 = C19806.m45029("۬ۙ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-6671)) ^ (-746423751);
                        i5 = 1685168126;
                    }
                    break;
                case -891562631:
                case 1150801796:
                    C3660.m10791();
                    if (C1189.f5284 > 0) {
                        iM11306 = (i2 - C19806.m45029("ۢۤ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM11306 ^ i3) * 22833) ^ 1691482311;
                        i5 = -1530148593;
                    } else {
                        iM11306 = (C19806.m45029("ۘܽ") ^ i3) * (-93);
                        i4 = ((iM11306 ^ i2) * (-10613)) ^ (-1174994773);
                        i5 = 838536387;
                    }
                    break;
                case -741111741:
                case 763513808:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶֫") ^ i2) * (-89);
                        i4 = ((iM11306 ^ i3) * 5665) ^ (-972763960);
                        i5 = 1609109726;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩻ᩳ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-8093)) ^ (-2005071981);
                        i5 = 1578751845;
                    }
                    break;
                case -695549646:
                case 429694271:
                    break;
                case -631080818:
                case 432646025:
                    c23229 = this.f25674;
                    if (C2249.f8050 >= 0) {
                        iM11306 = (C19806.m45029("ۘܽ") ^ i3) * (-93);
                        i4 = ((iM11306 ^ i2) * (-10613)) ^ (-1174994773);
                        i5 = 838536387;
                    } else {
                        iM11306 = (C19806.m45029("֡ۡ") + i3) * 53;
                        i4 = ((iM11306 ^ i2) * 14701) ^ (-1115589296);
                        i5 = -1786377752;
                    }
                    break;
                case -47889305:
                case 614178989:
                    if (C19806.f63586) {
                        iM11306 = (i2 - C19806.m45029("ۢۤ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM11306 ^ i3) * 22833) ^ 1691482311;
                        i5 = -1530148593;
                    } else {
                        iM11306 = C19806.m45029("ۧܺ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-21591)) ^ (-712080884);
                        i5 = -880149600;
                    }
                    break;
                case 23617737:
                case 1940888868:
                    if (C7105.f23796 >= 0) {
                        iM11306 = (i2 - C19806.m45029("ۢۤ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM11306 ^ i3) * 22833) ^ 1691482311;
                        i5 = -1530148593;
                    } else {
                        iM11306 = C19806.m45029("۟ܰ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-7781)) ^ 219877360;
                        i5 = 1459833391;
                    }
                    break;
                case 264179339:
                case 1526558213:
                    C1066.m4023();
                    if (!C2332.f8260) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶֫") ^ i2) * (-89);
                        i4 = ((iM11306 ^ i3) * 5665) ^ (-972763960);
                        i5 = 1609109726;
                    } else {
                        iM11306 = C19806.m45029("۬ۙ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-6671)) ^ (-746423751);
                        i5 = 1685168126;
                    }
                    break;
                case 610201675:
                case 2122735487:
                    if (C1977.f7413 <= 0) {
                        iM11306 = (i2 - C19806.m45029("ۢۤ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM11306 ^ i3) * 22833) ^ 1691482311;
                        i5 = -1530148593;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ܶܶ")) * 89;
                        i4 = ((iM11306 ^ i3) * (-26103)) ^ 1893679536;
                        i5 = -1301614565;
                    }
                    break;
                case 621481204:
                case 1349690465:
                    RunnableC1564.m5345();
                    iM11306 = C19806.m45029("۬ۙ") ^ i3;
                    i4 = ((iM11306 ^ i2) * (-6671)) ^ (-746423751);
                    i5 = 1685168126;
                    break;
                case 917098575:
                case 1586530721:
                    if (C2249.f8050 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֨᩹") ^ i3;
                        i4 = ((iM11306 ^ i2) * 30113) ^ (-390474201);
                        i5 = 231855046;
                    } else {
                        iM11306 = C19806.m45029("᩹ۙ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 20635) ^ 1560784419;
                        i5 = 1843287742;
                    }
                    break;
                default:
                    C3535.m10431();
                    C0817.m3399();
                    break;
            }
            return;
        }
    }

    public C7801(ViewOnClickListenerC0744 viewOnClickListenerC0744, C22681 c22681, C14558 c14558, boolean z, InterfaceC3183 interfaceC3183, boolean z2) {
        C23229 c23229M51233 = null;
        int i = -653541122;
        int i2 = C1189.f5284;
        int i3 = C2249.f8050;
        this.f25673 = viewOnClickListenerC0744;
        this.f25677 = c22681;
        this.f25678 = c14558;
        this.f25675 = z;
        this.f25680 = interfaceC3183;
        this.f25676 = z2;
        int iM11306 = ThreadFactoryC3888.m11306("۠᩺") ^ i3;
        int i4 = ((iM11306 ^ i2) * (-29535)) ^ 2058696095;
        int i5 = 477138167;
        while (true) {
            i = (iM11306 ^ i5) ^ (i4 & (((i ^ i2) * (-32409)) >> 31));
            switch (i) {
                case -2098990266:
                case 170930953:
                    if (C3743.f13569) {
                        iM11306 = ThreadFactoryC3888.m11306("ܽ֡") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-25797)) ^ 543148136;
                        i5 = 416072917;
                    } else {
                        iM11306 = (C19806.m45029("۟ۜ") ^ i3) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM11306 ^ i2) * (-32495)) ^ (-2123413562);
                        i5 = -1213310822;
                    }
                    break;
                case -1732860768:
                case -1085788189:
                    if (C1875.m6086() != 0) {
                        iM11306 = (C19806.m45029("۟ۜ") ^ i3) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM11306 ^ i2) * (-32495)) ^ (-2123413562);
                        i5 = -1213310822;
                    } else {
                        iM11306 = (i3 - C19806.m45029("ۘۨ")) * 115;
                        i4 = ((iM11306 ^ i2) * (-32675)) ^ 1559804344;
                        i5 = 335914966;
                    }
                    break;
                case -1633490638:
                case -629690197:
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM11306 = (C19806.m45029("۟ۜ") ^ i3) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM11306 ^ i2) * (-32495)) ^ (-2123413562);
                        i5 = -1213310822;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۡۛ") + i2) * 73;
                        i4 = ((iM11306 ^ i3) * 30737) ^ (-1942095360);
                        i5 = 520748856;
                    }
                    break;
                case -1515898938:
                case 641091559:
                    if (C1937.f7317 < 0) {
                        iM11306 = (i3 - C19806.m45029("ۘۨ")) * 115;
                        i4 = ((iM11306 ^ i2) * (-32675)) ^ 1559804344;
                        i5 = 335914966;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩹᩹") ^ i2) * 97;
                        i4 = ((iM11306 ^ i3) * 6767) ^ 1572758593;
                        i5 = 902427794;
                    }
                    break;
                case -1481037607:
                case -602721790:
                    c23229M51233 = C23229.m51233(viewOnClickListenerC0744.f3041);
                    if (C1025.m3861() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۚܿ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-30937)) ^ (-1039097060);
                        i5 = -706521518;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܶܰ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 22071) ^ 242600549;
                        i5 = 1589731047;
                    }
                    break;
                case -1432910737:
                case 2017364859:
                    C0216.m1591();
                    C3286.m9798();
                    throw new RuntimeException();
                case -1167229000:
                case 1563805721:
                    if (C1937.f7317 >= 0) {
                        iM11306 = (i3 - C19806.m45029("ۘۨ")) * 115;
                        i4 = ((iM11306 ^ i2) * (-32675)) ^ 1559804344;
                        i5 = 335914966;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۡۘ")) * (-117);
                        i4 = ((iM11306 ^ i2) * 8181) ^ (-1593095125);
                        i5 = 618080574;
                    }
                    break;
                case -893733468:
                case 123998423:
                    if (C0050.m946() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۚܿ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-30937)) ^ (-1039097060);
                        i5 = -706521518;
                    } else {
                        iM11306 = C19806.m45029("ۗ֫") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-7437)) ^ (-2102537444);
                        i5 = -2019694515;
                    }
                    break;
                case -659590210:
                case 45427304:
                    if (C0817.f3443) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩷ܶ") ^ i2) * (-9);
                        i4 = ((iM11306 ^ i3) * 13437) ^ 1354936952;
                        i5 = -1209856166;
                    } else {
                        iM11306 = (C19806.m45029("۟ۜ") ^ i3) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM11306 ^ i2) * (-32495)) ^ (-2123413562);
                        i5 = -1213310822;
                    }
                    break;
                case -566976260:
                case 770497021:
                    C2642.m8171();
                    if (C1875.m6086() == 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۚۖ") + i2) * 53;
                        i4 = ((iM11306 ^ i3) * 8687) ^ (-487501972);
                        i5 = 628573309;
                    } else {
                        iM11306 = (i3 - C19806.m45029("ۘۨ")) * 115;
                        i4 = ((iM11306 ^ i2) * (-32675)) ^ 1559804344;
                        i5 = 335914966;
                    }
                    break;
                case -91901969:
                case -22815126:
                    if (RunnableC1606.f6488 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۚۖ") + i2) * 53;
                        i4 = ((iM11306 ^ i3) * 8687) ^ (-487501972);
                        i5 = 628573309;
                    } else {
                        iM11306 = C19806.m45029("ܿۜ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 30375) ^ 1930480794;
                        i5 = -224023030;
                    }
                    break;
                case 240087696:
                case 936867830:
                    if (C1419.f5860 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۚܿ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-30937)) ^ (-1039097060);
                        i5 = -706521518;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩸ܺ") ^ i2) * 89;
                        i4 = ((iM11306 ^ i3) * 26875) ^ 1694494942;
                        i5 = 1797413722;
                    }
                    break;
                case 302275476:
                case 1207853206:
                    this.f25674 = c23229M51233;
                    return;
                case 459285595:
                case 1647645847:
                    if (RunnableC1564.m5345()) {
                        iM11306 = (C19806.m45029("۟ۜ") ^ i3) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM11306 ^ i2) * (-32495)) ^ (-2123413562);
                        i5 = -1213310822;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۨ᩸") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-21247)) ^ (-1408819125);
                        i5 = 1052802965;
                    }
                    break;
                case 463907820:
                case 707324322:
                    C2788.m8472();
                    C0526.m2437();
                    iM11306 = (i3 - C19806.m45029("ۘۨ")) * 115;
                    i4 = ((iM11306 ^ i2) * (-32675)) ^ 1559804344;
                    i5 = 335914966;
                    break;
                default:
                    if (C1066.m4023() <= 0) {
                        iM11306 = (C19806.m45029("۟ۜ") ^ i3) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM11306 ^ i2) * (-32495)) ^ (-2123413562);
                        i5 = -1213310822;
                    } else {
                        iM11306 = C19806.m45029("ۤ۬") ^ i2;
                        i4 = ((iM11306 ^ i3) * 22591) ^ (-377165607);
                        i5 = 1998747246;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0064  */
    /* JADX WARN: Code duplicated, block: B:56:0x01dd A[PHI: r7 r10 r11 r12
      0x01dd: PHI (r7v3 l.֫ۧۚ) = (r7v2 l.֫ۧۚ), (r7v2 l.֫ۧۚ), (r7v4 l.֫ۧۚ) binds: [B:55:0x01db, B:9:0x0056, B:44:0x0164] A[DONT_GENERATE, DONT_INLINE]
      0x01dd: PHI (r10v3 int) = (r10v2 int), (r10v1 int), (r10v1 int) binds: [B:55:0x01db, B:9:0x0056, B:44:0x0164] A[DONT_GENERATE, DONT_INLINE]
      0x01dd: PHI (r11v3 int) = (r11v2 int), (r11v1 int), (r11v1 int) binds: [B:55:0x01db, B:9:0x0056, B:44:0x0164] A[DONT_GENERATE, DONT_INLINE]
      0x01dd: PHI (r12v3 int) = (r12v2 int), (r12v1 int), (r12v1 int) binds: [B:55:0x01db, B:9:0x0056, B:44:0x0164] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x0213 A[PHI: r3 r9 r22
      0x0213: PHI (r3v2 java.lang.Runnable) = (r3v1 java.lang.Runnable), (r3v1 java.lang.Runnable), (r3v3 java.lang.Runnable) binds: [B:59:0x0211, B:32:0x00e7, B:24:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x0213: PHI (r9v3 short) = (r9v2 short), (r9v1 short), (r9v1 short) binds: [B:59:0x0211, B:32:0x00e7, B:24:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x0213: PHI (r22v3 short) = (r22v2 short), (r22v1 short), (r22v1 short) binds: [B:59:0x0211, B:32:0x00e7, B:24:0x009d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0247 A[PHI: r2 r4 r5 r6 r14 r15 r16 r21
      0x0247: PHI (r2v4 java.lang.String) = 
      (r2v1 java.lang.String)
      (r2v1 java.lang.String)
      (r2v3 java.lang.String)
      (r2v1 java.lang.String)
      (r2v1 java.lang.String)
      (r2v1 java.lang.String)
     binds: [B:63:0x0245, B:37:0x0120, B:28:0x00c4, B:18:0x007a, B:15:0x0060, B:6:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0247: PHI (r4v2 int) = (r4v1 int), (r4v1 int), (r4v1 int), (r4v1 int), (r4v1 int), (r4v3 int) binds: [B:63:0x0245, B:37:0x0120, B:28:0x00c4, B:18:0x007a, B:15:0x0060, B:6:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0247: PHI (r5v2 int) = (r5v1 int), (r5v1 int), (r5v1 int), (r5v1 int), (r5v1 int), (r5v3 int) binds: [B:63:0x0245, B:37:0x0120, B:28:0x00c4, B:18:0x007a, B:15:0x0060, B:6:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0247: PHI (r6v4 int) = (r6v2 int), (r6v3 int), (r6v2 int), (r6v2 int), (r6v2 int), (r6v2 int) binds: [B:63:0x0245, B:37:0x0120, B:28:0x00c4, B:18:0x007a, B:15:0x0060, B:6:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0247: PHI (r14v3 short[]) = (r14v1 short[]), (r14v2 short[]), (r14v1 short[]), (r14v1 short[]), (r14v1 short[]), (r14v1 short[]) binds: [B:63:0x0245, B:37:0x0120, B:28:0x00c4, B:18:0x007a, B:15:0x0060, B:6:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0247: PHI (r15v3 int) = (r15v1 int), (r15v2 int), (r15v1 int), (r15v1 int), (r15v1 int), (r15v1 int) binds: [B:63:0x0245, B:37:0x0120, B:28:0x00c4, B:18:0x007a, B:15:0x0060, B:6:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0247: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:63:0x0245, B:37:0x0120, B:28:0x00c4, B:18:0x007a, B:15:0x0060, B:6:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0247: PHI (r21v5 char) = (r21v4 char), (r21v3 char), (r21v3 char), (r21v3 char), (r21v3 char), (r21v3 char) binds: [B:63:0x0245, B:37:0x0120, B:28:0x00c4, B:18:0x007a, B:15:0x0060, B:6:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        int iM11306;
        int i;
        int i2;
        String strM10571 = null;
        Runnable runnable = null;
        int iM11307 = 0;
        int i3 = 0;
        short s = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        short[] sArr = null;
        int i8 = 0;
        int i9 = 722218923;
        int i10 = MenuItemOnMenuItemClickListenerC3244.f12064;
        int i11 = C1025.f4800;
        int iM45029 = C19806.m45029("ᩴܿ") ^ i10;
        int i12 = ((iM45029 ^ i11) * 22951) ^ (-2093498371);
        int i13 = iM45029 ^ 1000760896;
        short[] sArr2 = null;
        int i14 = 0;
        C1777 c1777 = null;
        char c = 0;
        short s2 = 0;
        while (true) {
            i9 = i13 ^ (i12 & (((i9 ^ i11) * (-28585)) >> 31));
            switch (i9) {
                case -1953967249:
                case 1957284580:
                    c1777.m5832(strM10571);
                    runnable = null;
                    if (C1668.f6641 >= 0) {
                        iM11306 = C19806.m45029("ۖۧ") ^ i11;
                        i = ((iM11306 ^ i10) * (-18047)) ^ 1409500360;
                        i2 = -863325548;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۙܰ") ^ i10;
                        i = ((iM11306 ^ i11) * (-31677)) ^ (-409768372);
                        i2 = -624150122;
                    }
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case -1772612027:
                case 104079973:
                    C2788.m8472();
                    C1461.m5080();
                    break;
                case -1741731428:
                case -1063561479:
                    strM10571 = C3577.m10571(f25670, Scalar25519.TARGET_LENGTH, 3, i7);
                    if (C10634.m26820()) {
                        iM11306 = (i10 - ThreadFactoryC3888.m11306("ۨ۫")) * 119;
                        i = ((iM11306 ^ i11) * (-7265)) ^ 688030557;
                        i2 = -777684535;
                    } else {
                        iM11306 = (C19806.m45029("ܿ᩺") ^ i11) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i = ((iM11306 ^ i10) * (-27909)) ^ 868145386;
                        i2 = 340128000;
                    }
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case -1735661269:
                case 471443126:
                    C1148.m4232();
                    RunnableC0195.m1431();
                    iM11306 = (i10 - ThreadFactoryC3888.m11306("ۨ۫")) * 119;
                    i = ((iM11306 ^ i11) * (-7265)) ^ 688030557;
                    i2 = -777684535;
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case -1700312900:
                case -1079319292:
                    sArr2 = f25670;
                    c = 250;
                    if (C1668.f6641 >= 0) {
                        iM11306 = (i10 - ThreadFactoryC3888.m11306("ۨ۫")) * 119;
                        i = ((iM11306 ^ i11) * (-7265)) ^ 688030557;
                        i2 = -777684535;
                    } else {
                        iM11306 = (i11 - ThreadFactoryC3888.m11306("ۡ۟")) * (-127);
                        i = ((iM11306 ^ i10) * 3501) ^ (-803684431);
                        i2 = 733712358;
                    }
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case -1218028177:
                case 1585756762:
                    AbstractActivityC12483 abstractActivityC12483 = this.f25673.f3041;
                    if (!C19806.f63586) {
                        c1777 = new C1777(abstractActivityC12483);
                        if (C1377.f5749) {
                            iM11306 = (ThreadFactoryC3888.m11306("ۤ֫") ^ i10) * 23;
                            i = ((iM11306 ^ i11) * 14573) ^ (-1032068547);
                            i2 = -1737121315;
                        } else {
                            iM11306 = (ThreadFactoryC3888.m11306("ۜۙ") + i11) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                            i = ((iM11306 ^ i10) * (-11503)) ^ (-1458628036);
                            i2 = 1326174855;
                        }
                        i13 = iM11306 ^ i2;
                        i12 = i;
                    } else {
                        int iM11308 = ThreadFactoryC3888.m11306("۬۫") ^ i10;
                        i13 = iM11308 ^ (-1821973169);
                        i12 = ((iM11308 ^ i11) * (-1257)) ^ (-10041208);
                        c1777 = null;
                    }
                    break;
                case -863155652:
                case 847479411:
                    if (C1460.f5948 < 0) {
                        int iM11309 = ThreadFactoryC3888.m11306("۬۫") ^ i10;
                        i13 = iM11309 ^ (-1821973169);
                        i12 = ((iM11309 ^ i11) * (-1257)) ^ (-10041208);
                        c1777 = null;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳܰ") ^ i11;
                        i = ((iM11306 ^ i10) * 30719) ^ (-264490490);
                        i2 = 1211705081;
                        i13 = iM11306 ^ i2;
                        i12 = i;
                    }
                    break;
                case -570562197:
                case 473668746:
                    if (C0278.f1572 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳܰ") ^ i11;
                        i = ((iM11306 ^ i10) * 30719) ^ (-264490490);
                        i2 = 1211705081;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۜۙ") + i11) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM11306 ^ i10) * (-11503)) ^ (-1458628036);
                        i2 = 1326174855;
                    }
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case -547230782:
                case 1658168622:
                    c1777.m5837(iM11307 ^ i3);
                    if (C2124.f7782 <= 0) {
                        iM11306 = C19806.m45029("ۖۧ") ^ i11;
                        i = ((iM11306 ^ i10) * (-18047)) ^ 1409500360;
                        i2 = -863325548;
                    } else {
                        iM11306 = C19806.m45029("ۙܿ") ^ i11;
                        i = ((iM11306 ^ i10) * 15549) ^ (-1416492317);
                        i2 = 1218340565;
                    }
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case -281725363:
                case 1702564483:
                    sArr = f25670;
                    i8 = 251;
                    i14 = 3;
                    if (C1066.f4915 <= 0) {
                        iM11306 = (i10 - ThreadFactoryC3888.m11306("ۨ۫")) * 119;
                        i = ((iM11306 ^ i11) * (-7265)) ^ 688030557;
                        i2 = -777684535;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֫᩹") ^ i11;
                        i = ((iM11306 ^ i10) * (-16347)) ^ (-1225890755);
                        i2 = -1097175073;
                    }
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case -74331186:
                case 2058546095:
                    if ((i5 + i6) - i4 >= 0) {
                        iM11306 = C19806.m45029("᩵ۙ") ^ i10;
                        i = ((iM11306 ^ i11) * 32471) ^ (-681598702);
                        i2 = -1934276357;
                    } else {
                        iM11306 = C19806.m45029("ۤᩴ") ^ i10;
                        i = ((iM11306 ^ i11) * (-26181)) ^ 1795811739;
                        i2 = -180732913;
                    }
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case 766797384:
                case 2113618302:
                    i7 = 4640;
                    iM11306 = C19806.m45029("᩷ۖ") ^ i11;
                    i = ((iM11306 ^ i10) * 20403) ^ (-68784240);
                    i2 = 1741984415;
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case 845426055:
                case 2079106222:
                    if (C2642.f10294 > 0) {
                        iM11306 = (i10 - ThreadFactoryC3888.m11306("ۨ۫")) * 119;
                        i = ((iM11306 ^ i11) * (-7265)) ^ 688030557;
                        i2 = -777684535;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳܰ") ^ i11;
                        i = ((iM11306 ^ i10) * 30719) ^ (-264490490);
                        i2 = 1211705081;
                    }
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case 999418344:
                case 1402949591:
                    s2 = sArr2[c];
                    s = 39024;
                    if (C2124.f7782 <= 0) {
                        iM11306 = C19806.m45029("ۖۧ") ^ i11;
                        i = ((iM11306 ^ i10) * (-18047)) ^ 1409500360;
                        i2 = -863325548;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩳۨ") ^ i10) * 11;
                        i = ((iM11306 ^ i11) * 22085) ^ (-1767694513);
                        i2 = -1215945157;
                    }
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case 1056829131:
                case 1413011880:
                    i7 = 9837;
                    iM11306 = C19806.m45029("᩷ۖ") ^ i11;
                    i = ((iM11306 ^ i10) * 20403) ^ (-68784240);
                    i2 = 1741984415;
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case 1552625421:
                case 1567238751:
                    i4 = s2 * s;
                    i5 = s2 * s2;
                    i6 = 380718144;
                    if (C2477.m7593() >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۜۙ") + i11) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM11306 ^ i10) * (-11503)) ^ (-1458628036);
                        i2 = 1326174855;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܳ۠") ^ i11;
                        i = ((iM11306 ^ i10) * (-7021)) ^ 903830606;
                        i2 = 723573004;
                    }
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case 1838511351:
                case 2077161302:
                    c1777.mo5828(runnable);
                    c1777.mo5843();
                    this.f25679 = c1777;
                    this.f25677.m50243();
                    break;
                default:
                    iM11307 = ThreadFactoryC3888.m11306(C1937.m6288(sArr, i8, i14, i7));
                    i3 = 2125986018;
                    if (C3743.f13569) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۘ᩹") ^ i10) * 69;
                        i = ((iM11306 ^ i11) * (-16593)) ^ 46629859;
                        i2 = -1163114708;
                    } else {
                        iM11306 = (i10 - ThreadFactoryC3888.m11306("ۨ۫")) * 119;
                        i = ((iM11306 ^ i11) * (-7265)) ^ 688030557;
                        i2 = -777684535;
                    }
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        AbstractActivityC12483 abstractActivityC12483 = null;
        int i = 132882952;
        int i2 = C1066.f4915;
        int i3 = C10634.f36300;
        int iM45029 = (i2 - C19806.m45029("ۚ᩹")) * 95;
        int i4 = ((iM45029 ^ i3) * (-3979)) ^ (-1875663979);
        int i5 = -421185588;
        while (true) {
            i = ((((i ^ i3) * 3917) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -1989984701:
                case 1901382082:
                    C1025.m3861();
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 > 0) {
                        iM45029 = C19806.m45029("ۛۙ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 30401) ^ 1462502121;
                        i5 = 1594797242;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۘۤ") + i2) * 51;
                        i4 = ((iM45029 ^ i3) * (-14453)) ^ (-1004327884);
                        i5 = 1543535938;
                    }
                    break;
                case -1918277073:
                case 413636876:
                    C1377.m4833();
                    break;
                case -1453798574:
                case -1251557224:
                    if (C3535.f13026 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩸ۜ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-29879)) ^ (-1190013664);
                        i5 = 1959349924;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۘۤ") + i2) * 51;
                        i4 = ((iM45029 ^ i3) * (-14453)) ^ (-1004327884);
                        i5 = 1543535938;
                    }
                    break;
                case -1429968363:
                case -153509444:
                    if (RunnableC1564.m5345()) {
                        iM45029 = C19806.m45029("ۛۙ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 30401) ^ 1462502121;
                        i5 = 1594797242;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩵ۜ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 19479) ^ (-843255119);
                        i5 = -1878542793;
                    }
                    break;
                case -1252110170:
                case 844923410:
                    C0671.m3019(abstractActivityC12483, exc, null);
                    break;
                case -1248335892:
                case 642611365:
                    if (this.f25674.m51236()) {
                        iM45029 = C19806.m45029("۟ۢ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-28365)) ^ (-298512071);
                        i5 = 1249209906;
                    } else {
                        iM45029 = C19806.m45029("֫ۗ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 7483) ^ 36359100;
                        i5 = -1784545828;
                    }
                    break;
                case -815907437:
                case 1769782643:
                    if (C0817.f3443) {
                        iM45029 = (i3 - C19806.m45029("ܶۡ")) * 31;
                        i4 = ((iM45029 ^ i2) * 25677) ^ 1452907206;
                        i5 = 667507562;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩸ۜ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-29879)) ^ (-1190013664);
                        i5 = 1959349924;
                    }
                    break;
                case -694999670:
                case 647990493:
                    if (C3286.f12186) {
                        iM45029 = C19806.m45029("ۗܳ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 17757) ^ 210537599;
                        i5 = 375188485;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۙᩳ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 12959) ^ 1916463425;
                        i5 = -1427965369;
                    }
                    break;
                case -536179825:
                case 205934077:
                    C0526.m2437();
                    iM45029 = (ThreadFactoryC3888.m11306("ۘۤ") + i2) * 51;
                    i4 = ((iM45029 ^ i3) * (-14453)) ^ (-1004327884);
                    i5 = 1543535938;
                    break;
                case -300304978:
                case 51645851:
                    if (C0629.f2722 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩸ۜ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-29879)) ^ (-1190013664);
                        i5 = 1959349924;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۚۛ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 8671) ^ 473365141;
                        i5 = -814180294;
                    }
                    break;
                case -172448674:
                case 1234087105:
                    if (C2249.m6915() <= 0) {
                        iM45029 = C19806.m45029("ᩳ۬") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-5865)) ^ 1013071685;
                        i5 = 351001205;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ۢ۠")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM45029 ^ i2) * (-8917)) ^ (-567437313);
                        i5 = -847566441;
                    }
                    break;
                case -142503468:
                case 399760268:
                    if (C1066.m4023() <= 0) {
                        iM45029 = C19806.m45029("ۗܳ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 17757) ^ 210537599;
                        i5 = 375188485;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ܺܰ")) * (-101);
                        i4 = ((iM45029 ^ i2) * (-3969)) ^ 603209294;
                        i5 = 385107451;
                    }
                    break;
                case -101258310:
                case 112718186:
                    if (C1066.f4915 <= 0) {
                        iM45029 = C19806.m45029("ۗܳ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 17757) ^ 210537599;
                        i5 = 375188485;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֨᩸") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM45029 ^ i3) * 22169) ^ 274770709;
                        i5 = -881901593;
                    }
                    break;
                case 97103956:
                case 801742015:
                    abstractActivityC12483 = this.f25673.f3041;
                    if (C0817.f3443) {
                        iM45029 = ThreadFactoryC3888.m11306("֨ܺ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 4965) ^ 2099359015;
                        i5 = -790442150;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۘۤ") + i2) * 51;
                        i4 = ((iM45029 ^ i3) * (-14453)) ^ (-1004327884);
                        i5 = 1543535938;
                    }
                    break;
                case 291202887:
                case 490182346:
                    if (C3286.m9798() <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۘۤ") + i2) * 51;
                        i4 = ((iM45029 ^ i3) * (-14453)) ^ (-1004327884);
                        i5 = 1543535938;
                    } else {
                        iM45029 = C19806.m45029("ۜ᩹") ^ i3;
                        i4 = ((iM45029 ^ i2) * 25339) ^ 366190013;
                        i5 = -1139794195;
                    }
                    break;
                case 715503419:
                case 1665796372:
                    break;
                case 1418485601:
                case 1897337353:
                    if (RunnableC1895.m6170() != 0) {
                        iM45029 = C19806.m45029("ۗܳ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 17757) ^ 210537599;
                        i5 = 375188485;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۡ᩶") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-19689)) ^ 814392413;
                        i5 = -1573681900;
                    }
                    break;
                default:
                    C3660.m10791();
                    if (C2124.m6673() <= 0) {
                        iM45029 = C19806.m45029("ᩳ۬") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-5865)) ^ 1013071685;
                        i5 = 351001205;
                    } else {
                        iM45029 = C19806.m45029("ۛۙ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 30401) ^ 1462502121;
                        i5 = 1594797242;
                    }
                    break;
            }
            return;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 72961. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        /*
            Method dump skipped, instruction units count: 7296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7801.mo1159():void");
    }
}
