package l;

import android.view.View;
import android.widget.AdapterView;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۡۜۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 517G */
/* JADX INFO: loaded from: classes3.dex */
public final class C8707 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20701 f29936;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13550 f29937;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i = 0;
        C13550 c13550 = null;
        int i2 = 1769165415;
        int i3 = C0629.f2722;
        int i4 = RunnableC3388.f12514;
        int iM45029 = C19806.m45029("᩷ᩴ") ^ i4;
        int i5 = ((iM45029 ^ i3) * (-20495)) ^ (-911723297);
        int i6 = -2067142028;
        while (true) {
            i2 = ((((i2 ^ i3) * (-29897)) >> 31) & i5) ^ (iM45029 ^ i6);
            switch (i2) {
                case -1677872990:
                case 938623326:
                    if (C0278.f1572 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۨ᩶") + i3) * (-51);
                        i5 = ((iM45029 ^ i4) * 18731) ^ (-210850815);
                        i6 = -407036943;
                    } else {
                        iM45029 = C19806.m45029("ۤ᩶") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-8027)) ^ 1825790737;
                        i6 = -123388044;
                    }
                    break;
                case -1594780316:
                case -1381896006:
                    if (C1025.f4800 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۜ᩻") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-24937)) ^ (-601364200);
                        i6 = 1725637748;
                    } else {
                        iM45029 = (i4 - C19806.m45029("֨۟")) * (-43);
                        i5 = ((iM45029 ^ i3) * (-29033)) ^ 1943777680;
                        i6 = 2132884231;
                    }
                    break;
                case -1545410163:
                case -1323115634:
                    View viewM9872 = ViewTreeObserverOnPreDrawListenerC3327.m9872(c13550, i);
                    c13550.removeAllViewsInLayout();
                    C1937.m6278(c13550, viewM9872);
                    break;
                case -1442997218:
                case -339075166:
                    i = 0;
                    if (C1937.m6279() >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۜ᩻") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-24937)) ^ (-601364200);
                        i6 = 1725637748;
                    } else {
                        iM45029 = C19806.m45029("ܽ᩹") ^ i3;
                        i5 = ((iM45029 ^ i4) * 17331) ^ 1214865198;
                        i6 = 422452919;
                    }
                    break;
                case -1332848517:
                case 1109906507:
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۜ᩻") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-24937)) ^ (-601364200);
                        i6 = 1725637748;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩶ۙ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-25161)) ^ 1195813174;
                        i6 = -1093854371;
                    }
                    break;
                case -933778276:
                case 2053149593:
                    if (C0671.f2816 != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۜ᩻") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-24937)) ^ (-601364200);
                        i6 = 1725637748;
                    } else {
                        iM45029 = C19806.m45029("ۚ֡") ^ i4;
                        i5 = ((iM45029 ^ i3) * 31729) ^ (-2042044504);
                        i6 = -366227052;
                    }
                    break;
                case -811901805:
                case 1569911442:
                    if (C19806.f63586) {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("ۗ۬")) * (-47);
                        i5 = ((iM45029 ^ i3) * (-14043)) ^ 493689763;
                        i6 = 900496502;
                    } else {
                        iM45029 = (C19806.m45029("ۘ᩷") ^ i3) * (-113);
                        i5 = ((iM45029 ^ i4) * (-17121)) ^ (-933568984);
                        i6 = 516785951;
                    }
                    break;
                case -85367792:
                case 707231396:
                    if (C19806.m45024()) {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("ۗ۬")) * (-47);
                        i5 = ((iM45029 ^ i3) * (-14043)) ^ 493689763;
                        i6 = 900496502;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܶ᩷") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-15909)) ^ (-2063321234);
                        i6 = 781079493;
                    }
                    break;
                case 10744975:
                case 449467670:
                    if (C0671.f2816 != 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۨ᩶") + i3) * (-51);
                        i5 = ((iM45029 ^ i4) * 18731) ^ (-210850815);
                        i6 = -407036943;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ܰ۠")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i5 = ((iM45029 ^ i4) * 9911) ^ (-541130263);
                        i6 = -765913712;
                    }
                    break;
                case 102987320:
                case 1949039148:
                    C1875.m6086();
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    iM45029 = (ThreadFactoryC3888.m11306("ۨ᩶") + i3) * (-51);
                    i5 = ((iM45029 ^ i4) * 18731) ^ (-210850815);
                    i6 = -407036943;
                    break;
                case 157673012:
                case 1965620938:
                    if (C3660.f13403 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۜ᩻") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-24937)) ^ (-601364200);
                        i6 = 1725637748;
                    } else {
                        iM45029 = (i4 - C19806.m45029("ܶ᩺")) * (-43);
                        i5 = ((iM45029 ^ i3) * 19977) ^ (-410491369);
                        i6 = -302197963;
                    }
                    break;
                case 172045487:
                case 1771774276:
                    c13550 = this.f29937;
                    if (C0629.f2722 <= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ᩴۨ")) * 37;
                        i5 = ((iM45029 ^ i4) * 24277) ^ 1377708714;
                        i6 = -1567885405;
                    } else {
                        iM45029 = (i4 - C19806.m45029("ۘᩳ")) * (-33);
                        i5 = ((iM45029 ^ i3) * (-16707)) ^ (-1290905029);
                        i6 = 282936274;
                    }
                    break;
                case 181877551:
                case 2092804491:
                    if (C0526.f2219) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۨ᩶") + i3) * (-51);
                        i5 = ((iM45029 ^ i4) * 18731) ^ (-210850815);
                        i6 = -407036943;
                    } else {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("ۧ۬")) * (-19);
                        i5 = ((iM45029 ^ i3) * 10745) ^ 349145191;
                        i6 = 409764160;
                    }
                    break;
                case 912492107:
                case 1974737839:
                    C0050.m946();
                    if (RunnableC1606.m5473() != 0) {
                        iM45029 = C19806.m45029("ۚ֡") ^ i4;
                        i5 = ((iM45029 ^ i3) * 31729) ^ (-2042044504);
                        i6 = -366227052;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۨ᩶") + i3) * (-51);
                        i5 = ((iM45029 ^ i4) * 18731) ^ (-210850815);
                        i6 = -407036943;
                    }
                    break;
                case 1815761075:
                case 2135235458:
                    if (C2642.f10294 <= 0) {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("ۗ۬")) * (-47);
                        i5 = ((iM45029 ^ i3) * (-14043)) ^ 493689763;
                        i6 = 900496502;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۜ᩻") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-24937)) ^ (-601364200);
                        i6 = 1725637748;
                    }
                    break;
                default:
                    C3660.m10791();
                    break;
            }
            return;
        }
    }

    public C8707(C20701 c20701, C13550 c13550) {
        int i = 396341862;
        int i2 = C2124.f7782;
        int i3 = AbstractC0464.f2088;
        int iM11306 = ThreadFactoryC3888.m11306("ۖ᩺") ^ i2;
        int i4 = ((iM11306 ^ i3) * (-1091)) ^ 1169030916;
        int i5 = -1392630887;
        while (true) {
            i = ((((i ^ i3) * (-9189)) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -1989363883:
                case 1820382330:
                    RunnableC0195.m1431();
                    if (!C0962.f3784) {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩴۗ") + i2) * (-43);
                        i4 = ((iM11306 ^ i3) * (-28913)) ^ 2067731798;
                        i5 = 1740171895;
                    } else {
                        iM11306 = C19806.m45029("ܰۖ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-26861)) ^ (-1878395301);
                        i5 = 1065978417;
                    }
                    break;
                case -1907976426:
                case -234690209:
                    if (C2871.f10837 >= 0) {
                        iM11306 = (i3 - C19806.m45029("ܰ۠")) * (-127);
                        i4 = ((iM11306 ^ i2) * 28211) ^ (-1655332837);
                        i5 = -1374313822;
                    } else {
                        iM11306 = (C19806.m45029("᩵᩶") + i3) * (-117);
                        i4 = ((iM11306 ^ i2) * (-24085)) ^ (-86474175);
                        i5 = -1456882399;
                    }
                    break;
                case -1880264079:
                case 62674632:
                    C0629.m2907();
                    if (C1066.f4915 <= 0) {
                        iM11306 = C19806.m45029("ܰۖ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-26861)) ^ (-1878395301);
                        i5 = 1065978417;
                    } else {
                        iM11306 = C19806.m45029("ᩴۜ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 23933) ^ (-1667858601);
                        i5 = 867173145;
                    }
                    break;
                case -1761713328:
                case 511052952:
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    if (!C0817.f3443) {
                        iM11306 = (i3 - C19806.m45029("ܰ۠")) * (-127);
                        i4 = ((iM11306 ^ i2) * 28211) ^ (-1655332837);
                        i5 = -1374313822;
                    } else {
                        iM11306 = C19806.m45029("ᩴۜ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 23933) ^ (-1667858601);
                        i5 = 867173145;
                    }
                    break;
                case -1273363659:
                case 1808895702:
                    C3660.m10791();
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    throw new RuntimeException();
                case -899807475:
                case -24023768:
                    if (C0050.m946() <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩴۗ") + i2) * (-43);
                        i4 = ((iM11306 ^ i3) * (-28913)) ^ 2067731798;
                        i5 = 1740171895;
                    } else {
                        iM11306 = C19806.m45029("ۡ۫") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-25739)) ^ 932817442;
                        i5 = 798680241;
                    }
                    break;
                case -817548295:
                case 1209199004:
                    C7105.m18985();
                    C1398.m4895();
                    iM11306 = C19806.m45029("ᩴۜ") ^ i3;
                    i4 = ((iM11306 ^ i2) * 23933) ^ (-1667858601);
                    i5 = 867173145;
                    break;
                case -614118410:
                case 349553882:
                    this.f29936 = c20701;
                    if (RunnableC1895.f7152) {
                        iM11306 = ThreadFactoryC3888.m11306("᩸ۖ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 31049) ^ 650484504;
                        i5 = 1324883720;
                    } else {
                        iM11306 = C19806.m45029("ܰۖ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-26861)) ^ (-1878395301);
                        i5 = 1065978417;
                    }
                    break;
                case -520847800:
                case -461775602:
                    if (C3743.f13569) {
                        iM11306 = ThreadFactoryC3888.m11306("ۧ᩵") ^ i2;
                        i4 = ((iM11306 ^ i3) * 15455) ^ 1901571169;
                        i5 = 1530710996;
                    } else {
                        iM11306 = C19806.m45029("ᩴۜ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 23933) ^ (-1667858601);
                        i5 = 867173145;
                    }
                    break;
                case -355222519:
                case 813098681:
                    if (C1419.f5860 >= 0) {
                        iM11306 = C19806.m45029("ܶܺ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 27051) ^ 234434608;
                        i5 = 1175739771;
                    } else {
                        iM11306 = (C19806.m45029("ܿۡ") ^ i3) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM11306 ^ i2) * 4515) ^ (-2136754039);
                        i5 = -44487760;
                    }
                    break;
                case -312421141:
                case 379163505:
                    if (C1668.f6641 >= 0) {
                        iM11306 = (i3 - C19806.m45029("ܰ۠")) * (-127);
                        i4 = ((iM11306 ^ i2) * 28211) ^ (-1655332837);
                        i5 = -1374313822;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܽۘ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 6869) ^ (-359210281);
                        i5 = 898133707;
                    }
                    break;
                case -85009611:
                case 1128198180:
                    this.f29937 = c13550;
                    return;
                case 185220782:
                case 749190577:
                    if (C3535.f13026 <= 0) {
                        iM11306 = (i3 - C19806.m45029("ܰ۠")) * (-127);
                        i4 = ((iM11306 ^ i2) * 28211) ^ (-1655332837);
                        i5 = -1374313822;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("۫ۙ")) * (-9);
                        i4 = ((iM11306 ^ i2) * (-29471)) ^ (-490831631);
                        i5 = 438188663;
                    }
                    break;
                case 206479175:
                case 1984566714:
                    if (RunnableC0195.f1321 >= 0) {
                        iM11306 = C19806.m45029("ܶܺ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 27051) ^ 234434608;
                        i5 = 1175739771;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶ۗ") ^ i2) * 35;
                        i4 = ((iM11306 ^ i3) * (-5371)) ^ (-2039633940);
                        i5 = 450833562;
                    }
                    break;
                case 1026416908:
                case 1476509328:
                    if (C2332.m7079() <= 0) {
                        iM11306 = C19806.m45029("ܰۖ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-26861)) ^ (-1878395301);
                        i5 = 1065978417;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩻ۘ") ^ i2) * (-39);
                        i4 = ((iM11306 ^ i3) * 13301) ^ 626346908;
                        i5 = 1241353808;
                    }
                    break;
                default:
                    if (C2477.f9839 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩴۗ") + i2) * (-43);
                        i4 = ((iM11306 ^ i3) * (-28913)) ^ 2067731798;
                        i5 = 1740171895;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۟ۘ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 19855) ^ (-53982051);
                        i5 = -1198124362;
                    }
                    break;
            }
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        C13550 c13550 = null;
        View view2 = null;
        View viewM9872 = null;
        int iM6173 = 0;
        View viewM10566 = null;
        View viewM10567 = null;
        C20701 c20701 = null;
        int i2 = -1583647730;
        int i3 = C2871.f10837;
        int i4 = C1398.f5802;
        int iM11306 = ThreadFactoryC3888.m11306("᩶ۚ") ^ i4;
        int i5 = ((iM11306 ^ i3) * 4161) ^ (-29914509);
        int i6 = -1483047818;
        while (true) {
            int i7 = iM11306 ^ i6;
            while (true) {
                i2 = ((((i2 ^ i3) * 20739) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -1936952657:
                    case 126449993:
                        if (!ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                            iM11306 = ThreadFactoryC3888.m11306("۠ۤ") ^ i4;
                            i5 = ((iM11306 ^ i3) * (-109)) ^ 1497638041;
                            i6 = 1562313791;
                        } else {
                            iM11306 = (i4 - ThreadFactoryC3888.m11306("ܿۤ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                            i5 = ((iM11306 ^ i3) * 9951) ^ 1562602648;
                            i6 = 52013591;
                        }
                        break;
                    case -1752820474:
                    case -355198532:
                        RunnableC0195.m1431();
                        if (AbstractC0464.f2088 <= 0) {
                            iM11306 = ThreadFactoryC3888.m11306("۠ۤ") ^ i4;
                            i5 = ((iM11306 ^ i3) * (-109)) ^ 1497638041;
                            i6 = 1562313791;
                            break;
                        }
                        iM11306 = (C19806.m45029("ۖۙ") + i3) * 119;
                        i5 = ((iM11306 ^ i4) * (-24199)) ^ 293921550;
                        i6 = -840421087;
                    case -1732346346:
                    case -1136427642:
                        c13550.removeAllViewsInLayout();
                        C7105.m18979(c13550, view2);
                        c20701 = this.f29936;
                        if (!ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                            iM11306 = (ThreadFactoryC3888.m11306("᩸᩷") + i3) * 99;
                            i5 = ((iM11306 ^ i4) * (-9909)) ^ 680276014;
                            i6 = -1550275129;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("᩸۟") ^ i4;
                            i5 = ((iM11306 ^ i3) * 28899) ^ (-1170240375);
                            i6 = 53400972;
                        }
                        break;
                    case -1412106820:
                    case -297483608:
                        if (C1025.f4800 < 0) {
                            iM11306 = (ThreadFactoryC3888.m11306("۬ܽ") ^ i4) * 79;
                            i5 = ((iM11306 ^ i3) * 32015) ^ (-1367471235);
                            i6 = 1281165914;
                        } else {
                            iM11306 = (ThreadFactoryC3888.m11306("᩸᩷") + i3) * 99;
                            i5 = ((iM11306 ^ i4) * (-9909)) ^ 680276014;
                            i6 = -1550275129;
                        }
                        break;
                    case -1387009704:
                    case -1364578018:
                        viewM9872 = ViewTreeObserverOnPreDrawListenerC3327.m9872(c13550, RunnableC1895.m6173(c13550) - 3);
                        if (C0278.m1789() > 0) {
                            iM11306 = (ThreadFactoryC3888.m11306("۬ۘ") ^ i3) * (-13);
                            i5 = ((iM11306 ^ i4) * (-2829)) ^ 2018433422;
                            i6 = 787579480;
                        } else {
                            iM11306 = (ThreadFactoryC3888.m11306("᩸᩷") + i3) * 99;
                            i5 = ((iM11306 ^ i4) * (-9909)) ^ 680276014;
                            i6 = -1550275129;
                        }
                        break;
                    case -1346161374:
                    case 566301061:
                        if (!C3743.f13569) {
                            iM11306 = C19806.m45029("ۜ᩹") ^ i4;
                            i5 = ((iM11306 ^ i3) * (-28969)) ^ 1755999853;
                            i6 = -1774135392;
                        } else {
                            iM11306 = (ThreadFactoryC3888.m11306("᩸᩷") + i3) * 99;
                            i5 = ((iM11306 ^ i4) * (-9909)) ^ 680276014;
                            i6 = -1550275129;
                        }
                        break;
                    case -1319907299:
                    case 674814742:
                        ((AbstractC10324) C3286.m9796(c20701.f67320, i)).mo26143(c13550);
                        if (C1398.f5802 > 0) {
                            iM11306 = (i3 - C19806.m45029("᩹֫")) * (-111);
                            i5 = ((iM11306 ^ i4) * 20727) ^ 184649620;
                            i6 = 748091867;
                        } else {
                            iM11306 = (C19806.m45029("ۖۙ") + i3) * 119;
                            i5 = ((iM11306 ^ i4) * (-24199)) ^ 293921550;
                            i6 = -840421087;
                        }
                        break;
                    case -1226630612:
                    case 746411615:
                        if (ViewTreeObserverOnPreDrawListenerC3327.f12317 > 0) {
                            iM11306 = (i3 - ThreadFactoryC3888.m11306("ۗ۫")) * (-5);
                            i5 = ((iM11306 ^ i4) * (-4467)) ^ (-1998968603);
                            i6 = 1863788704;
                        } else {
                            iM11306 = (C19806.m45029("ۖۙ") + i3) * 119;
                            i5 = ((iM11306 ^ i4) * (-24199)) ^ 293921550;
                            i6 = -840421087;
                        }
                        break;
                    case -1118499520:
                    case 960780697:
                        C1025.m3861();
                        iM11306 = (C19806.m45029("ۖۙ") + i3) * 119;
                        i5 = ((iM11306 ^ i4) * (-24199)) ^ 293921550;
                        i6 = -840421087;
                        break;
                    case -947211724:
                    case 1205389057:
                        C1937.m6278(c13550, viewM9872);
                        C1937.m6278(c13550, viewM10566);
                        C7105.m18979(c13550, viewM10567);
                        break;
                    case -535396712:
                    case 327095218:
                        C0962.m3746();
                        break;
                    case -188819749:
                    case 127905742:
                        C13550 c13551 = this.f29937;
                        View viewM9873 = ViewTreeObserverOnPreDrawListenerC3327.m9872(c13551, 0);
                        if (C1377.m4833() == 0) {
                            int iM11307 = (ThreadFactoryC3888.m11306("ᩴ֨") + i4) * 55;
                            i5 = ((iM11307 ^ i3) * 24085) ^ 431906337;
                            i7 = iM11307 ^ (-325726695);
                            view2 = viewM9873;
                            c13550 = c13551;
                        } else {
                            view2 = viewM9873;
                            c13550 = c13551;
                            iM11306 = C19806.m45029("ۜ᩹") ^ i4;
                            i5 = ((iM11306 ^ i3) * (-28969)) ^ 1755999853;
                            i6 = -1774135392;
                        }
                        break;
                    case 15665391:
                    case 1858636155:
                        if (C2249.f8050 < 0) {
                            iM11306 = C19806.m45029("֨ܿ") ^ i3;
                            i5 = ((iM11306 ^ i4) * (-6765)) ^ (-1292777119);
                            i6 = 68402743;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("ܰܶ") ^ i4;
                            i5 = ((iM11306 ^ i3) * (-8981)) ^ 2024929434;
                            i6 = 181715582;
                        }
                        break;
                    case 122622972:
                    case 728519679:
                        viewM10566 = C3577.m10566(c13550, iM6173);
                        viewM10567 = C3577.m10566(c13550, C3722.m10898(c13550) - 1);
                        if (C1189.f5284 > 0) {
                            iM11306 = (C19806.m45029("ۖܿ") + i4) * (-93);
                            i5 = ((iM11306 ^ i3) * 21873) ^ 421614414;
                            i6 = -1069171932;
                        } else {
                            iM11306 = (C19806.m45029("ۖۙ") + i3) * 119;
                            i5 = ((iM11306 ^ i4) * (-24199)) ^ 293921550;
                            i6 = -840421087;
                        }
                        break;
                    case 1448945264:
                    case 1980427718:
                        RunnableC1895.m6170();
                        if (!RunnableC1895.f7152) {
                            iM11306 = (C19806.m45029("ۖۙ") + i3) * 119;
                            i5 = ((iM11306 ^ i4) * (-24199)) ^ 293921550;
                            i6 = -840421087;
                            break;
                        }
                        iM11306 = C19806.m45029("ۜ᩹") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-28969)) ^ 1755999853;
                        i6 = -1774135392;
                        break;
                    default:
                        iM6173 = RunnableC1895.m6173(c13550) - 2;
                        if (!CallableC1627.f6528) {
                            iM11306 = ThreadFactoryC3888.m11306("ܰܶ") ^ i4;
                            i5 = ((iM11306 ^ i3) * (-8981)) ^ 2024929434;
                            i6 = 181715582;
                            break;
                        }
                        iM11306 = ThreadFactoryC3888.m11306("ۙ᩵") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-2423)) ^ 1312144566;
                        i6 = -1717784625;
                        break;
                }
                return;
            }
        }
    }
}
