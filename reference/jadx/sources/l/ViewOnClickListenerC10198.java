package l;

import android.view.View;
import android.widget.RadioButton;
import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.ۤۡ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: H1R6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC10198 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f34834;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f34835;

    public /* synthetic */ ViewOnClickListenerC10198(int i, Object obj) {
        int i2 = -1160638831;
        int i3 = C1875.f7103;
        int i4 = ThreadFactoryC3888.f14547;
        this.f34834 = i;
        this.f34835 = obj;
        int iM11306 = ThreadFactoryC3888.m11306("ۢܿ") ^ i4;
        int i5 = ((iM11306 ^ i3) * (-31691)) ^ 1825419554;
        int i6 = 1736362800;
        while (true) {
            i2 = (iM11306 ^ i6) ^ (i5 & (((i2 ^ i3) * (-24469)) >> 31));
            switch (i2) {
                case -2146582597:
                case 429248280:
                    if (C1977.f7413 <= 0) {
                        iM11306 = C19806.m45029("ۘᩳ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-6847)) ^ (-442051264);
                        i6 = 1526013053;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩹ۜ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 12571) ^ 541638114;
                        i6 = -1627893431;
                    }
                    break;
                case -1544976071:
                case -967709882:
                    return;
                case -1312497333:
                case 188729785:
                    CallableC1627.m5507();
                    iM11306 = ThreadFactoryC3888.m11306("᩹ۜ") ^ i3;
                    i5 = ((iM11306 ^ i4) * 12571) ^ 541638114;
                    i6 = -1627893431;
                    break;
                case -6482349:
                case 936038934:
                    C1066.m4023();
                    if (C1937.f7317 < 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩹ۜ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 12571) ^ 541638114;
                        i6 = -1627893431;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۗۘ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 353) ^ (-1745438997);
                        i6 = 1341562877;
                    }
                    break;
                case 89329487:
                case 824024489:
                    if (C0797.f3386) {
                        iM11306 = ThreadFactoryC3888.m11306("ۨۚ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 3697) ^ 828781239;
                        i6 = 1217761874;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܿܶ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-30085)) ^ (-1779642123);
                        i6 = -1875736939;
                    }
                    break;
                case 519488676:
                case 1049321784:
                    C3660.m10791();
                    if (C2788.f10625 < 0) {
                        iM11306 = C19806.m45029("ۘᩳ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-6847)) ^ (-442051264);
                        i6 = 1526013053;
                    } else {
                        iM11306 = C19806.m45029("ܶ֨") ^ i3;
                        i5 = ((iM11306 ^ i4) * 12193) ^ (-40430018);
                        i6 = 346874060;
                    }
                    break;
                default:
                    RunnableC0195.m1431();
                    throw new RuntimeException();
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int iM11306;
        int i;
        Object obj = null;
        ViewOnClickListenerC23604 viewOnClickListenerC23604 = null;
        RadioButton[] radioButtonArr = null;
        int length = 0;
        int i2 = 0;
        RadioButton radioButton = null;
        boolean z = false;
        int i3 = -395134095;
        int i4 = RunnableC3388.f12514;
        int i5 = C0278.f1572;
        int iM11307 = ThreadFactoryC3888.m11306("ۡܺ") ^ i4;
        int i6 = ((iM11307 ^ i5) * (-767)) ^ 331822912;
        int i7 = 1192575244;
        while (true) {
            int i8 = iM11307 ^ i7;
            while (true) {
                i3 = ((((i3 ^ i5) * (-25703)) >> 31) & i6) ^ i8;
                switch (i3) {
                    case -2131796920:
                    case 488424066:
                        viewOnClickListenerC23604 = (ViewOnClickListenerC23604) obj;
                        int i9 = ViewOnClickListenerC23604.f76463;
                        if (C3535.f13026 > 0) {
                            iM11307 = (i5 - ThreadFactoryC3888.m11306("֨ۧ")) * (-77);
                            i6 = ((iM11307 ^ i4) * 18839) ^ (-373107979);
                            i7 = 1193362562;
                        } else {
                            iM11307 = (C19806.m45029("۫ۙ") + i5) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                            i6 = ((iM11307 ^ i4) * (-27559)) ^ 847917852;
                            i7 = -351097464;
                        }
                        break;
                    case -1994823314:
                    case 1682673274:
                        CallableC1627.m5511(viewOnClickListenerC23604, C1355.m4764());
                        break;
                    case -1938571350:
                    case -11623964:
                        ViewGroupOnHierarchyChangeListenerC1916.m6230(radioButton, z);
                        i2++;
                        iM11307 = C19806.m45029("ۙܿ") ^ i4;
                        i6 = ((iM11307 ^ i5) * 4729) ^ (-426558363);
                        i7 = 748511081;
                        break;
                    case -1821980367:
                    case -1700990566:
                        if (!C1377.f5749) {
                            iM11307 = (C19806.m45029("۫ۙ") + i5) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                            i6 = ((iM11307 ^ i4) * (-27559)) ^ 847917852;
                            i7 = -351097464;
                            break;
                        }
                        iM11307 = ThreadFactoryC3888.m11306("ᩴۧ") ^ i4;
                        i6 = ((iM11307 ^ i5) * (-5331)) ^ (-1454185279);
                        i7 = -521323461;
                    case -1491041548:
                    case -986908215:
                        if (C1461.f5957 > 0) {
                            iM11307 = (ThreadFactoryC3888.m11306("֨ۙ") ^ i4) * (-107);
                            i6 = ((iM11307 ^ i5) * 7053) ^ (-1173297998);
                            i7 = 1096819914;
                        } else {
                            iM11307 = (ThreadFactoryC3888.m11306("ᩴ֫") ^ i5) * (-101);
                            i6 = ((iM11307 ^ i4) * (-10527)) ^ 712588090;
                            i7 = 1473256720;
                        }
                        break;
                    case -1333071859:
                    case 2088573700:
                        C0671.m3008();
                        AbstractC0464.m2313();
                        iM11307 = ThreadFactoryC3888.m11306("ᩴۧ") ^ i4;
                        i6 = ((iM11307 ^ i5) * (-5331)) ^ (-1454185279);
                        i7 = -521323461;
                        break;
                    case -1298303664:
                    case -801808293:
                        if (i2 >= length) {
                            iM11307 = ThreadFactoryC3888.m11306("ܿ۫") ^ i4;
                            i6 = ((iM11307 ^ i5) * (-9679)) ^ 494314053;
                            i7 = -1673859292;
                        } else {
                            iM11307 = (i5 - C19806.m45029("۬ܺ")) * (-73);
                            i6 = ((iM11307 ^ i4) * (-14977)) ^ (-1865653775);
                            i7 = 1950405176;
                        }
                        break;
                    case -1280100629:
                    case 1421889333:
                        int i10 = this.f34834;
                        Object obj2 = this.f34835;
                        switch (i10) {
                            case 0:
                                iM11306 = ThreadFactoryC3888.m11306("᩷᩵") ^ i5;
                                i6 = ((iM11306 ^ i4) * (-16367)) ^ 374170284;
                                i = -1650781711;
                                break;
                            case 1:
                                iM11306 = (ThreadFactoryC3888.m11306("ܽܶ") + i4) * 77;
                                i6 = ((iM11306 ^ i5) * 22947) ^ (-40871516);
                                i = -1504542575;
                                break;
                            default:
                                iM11306 = C19806.m45029("ۡܰ") ^ i5;
                                i6 = ((iM11306 ^ i4) * 8225) ^ 1996951841;
                                i = -195249192;
                                break;
                        }
                        i8 = iM11306 ^ i;
                        obj = obj2;
                        break;
                    case -1266535572:
                    case -572645741:
                        if (C0629.f2722 > 0) {
                            iM11307 = C19806.m45029("֡֫") ^ i5;
                            i6 = ((iM11307 ^ i4) * (-3115)) ^ 2006395232;
                            i7 = 1821827115;
                        } else {
                            iM11307 = (C19806.m45029("۫ۙ") + i5) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                            i6 = ((iM11307 ^ i4) * (-27559)) ^ 847917852;
                            i7 = -351097464;
                        }
                        break;
                    case -1154774263:
                    case 581171243:
                        if (MenuItemOnMenuItemClickListenerC3244.m9701() < 0) {
                            iM11307 = (ThreadFactoryC3888.m11306("ۚ᩻") ^ i5) * 47;
                            i6 = ((iM11307 ^ i4) * 29135) ^ (-457602393);
                            i7 = 1321807954;
                        } else {
                            iM11307 = ThreadFactoryC3888.m11306("ܺ᩷") ^ i4;
                            i6 = ((iM11307 ^ i5) * (-16731)) ^ 42217714;
                            i7 = 77396568;
                        }
                        break;
                    case -1098276418:
                    case -584920811:
                        z = false;
                        iM11307 = (C19806.m45029("ۚۜ") + i5) * 61;
                        i6 = ((iM11307 ^ i4) * (-8893)) ^ (-1865495008);
                        i7 = -86069343;
                        break;
                    case -757830195:
                    case -53058732:
                        z = true;
                        iM11307 = (C19806.m45029("ۚۜ") + i5) * 61;
                        i6 = ((iM11307 ^ i4) * (-8893)) ^ (-1865495008);
                        i7 = -86069343;
                        break;
                        break;
                    case -754089009:
                    case -274040811:
                        if (C1668.f6641 < 0) {
                            iM11307 = ThreadFactoryC3888.m11306("֨۟") ^ i4;
                            i6 = ((iM11307 ^ i5) * (-21509)) ^ 771833960;
                            i7 = 958449020;
                        } else {
                            iM11307 = (ThreadFactoryC3888.m11306("ᩴ֫") ^ i5) * (-101);
                            i6 = ((iM11307 ^ i4) * (-10527)) ^ 712588090;
                            i7 = 1473256720;
                        }
                        break;
                    case -684126165:
                    case -652907318:
                        if (!C0797.f3386) {
                            iM11307 = C19806.m45029("ۙۙ") ^ i5;
                            i6 = ((iM11307 ^ i4) * 1629) ^ (-1310591806);
                            i7 = -220356526;
                        } else {
                            iM11307 = ThreadFactoryC3888.m11306("ᩴۧ") ^ i4;
                            i6 = ((iM11307 ^ i5) * (-5331)) ^ (-1454185279);
                            i7 = -521323461;
                        }
                        break;
                    case -578754320:
                    case 551346153:
                        ((AbstractActivityC5788) obj).m15925();
                        break;
                    case -317745817:
                    case 1017507254:
                        radioButton = radioButtonArr[i2];
                        if (view != radioButton) {
                            iM11307 = ThreadFactoryC3888.m11306("ܰ۬") ^ i5;
                            i6 = ((iM11307 ^ i4) * 16283) ^ (-2072529625);
                            i7 = -1068156978;
                        } else {
                            iM11307 = (ThreadFactoryC3888.m11306("ۜۙ") + i4) * (-103);
                            i6 = ((iM11307 ^ i5) * (-26277)) ^ (-744721184);
                            i7 = -1852829816;
                        }
                        break;
                    case -216512486:
                    case 932721014:
                        if (C1066.f4915 > 0) {
                            iM11307 = ThreadFactoryC3888.m11306("۬᩷") ^ i4;
                            i6 = ((iM11307 ^ i5) * (-18349)) ^ (-1089825205);
                            i7 = 623610813;
                        } else {
                            iM11307 = ThreadFactoryC3888.m11306("ܺ᩷") ^ i4;
                            i6 = ((iM11307 ^ i5) * (-16731)) ^ 42217714;
                            i7 = 77396568;
                        }
                        break;
                    case 37419287:
                    case 1676461638:
                        break;
                    case 238998806:
                    case 1170179929:
                        if (C1398.f5802 > 0) {
                            iM11307 = (ThreadFactoryC3888.m11306("ۘᩴ") ^ i4) * (-79);
                            i6 = ((iM11307 ^ i5) * 847) ^ 1218750336;
                            i7 = -823251927;
                        } else {
                            iM11307 = C19806.m45029("ܰ᩷") ^ i4;
                            i6 = ((iM11307 ^ i5) * 10095) ^ (-275469832);
                            i7 = -495119364;
                        }
                        break;
                    case 667790280:
                    case 1813514628:
                        if (C0278.m1789() > 0) {
                            iM11307 = (ThreadFactoryC3888.m11306("ܶۤ") + i4) * 65;
                            i6 = ((iM11307 ^ i5) * 12333) ^ 1448753180;
                            i7 = -1379609210;
                        } else {
                            iM11307 = (ThreadFactoryC3888.m11306("ᩴ֫") ^ i5) * (-101);
                            i6 = ((iM11307 ^ i4) * (-10527)) ^ 712588090;
                            i7 = 1473256720;
                        }
                        break;
                    case 752364491:
                    case 770229235:
                        C0526.m2437();
                        if (C1875.f7103 < 0) {
                            iM11307 = C19806.m45029("ܰ᩷") ^ i4;
                            i6 = ((iM11307 ^ i5) * 10095) ^ (-275469832);
                            i7 = -495119364;
                            break;
                        }
                        iM11307 = ThreadFactoryC3888.m11306("ᩴۧ") ^ i4;
                        i6 = ((iM11307 ^ i5) * (-5331)) ^ (-1454185279);
                        i7 = -521323461;
                        break;
                    case 922015456:
                    case 1372300469:
                        if (C2249.m6915() > 0) {
                            iM11307 = ThreadFactoryC3888.m11306("ܺ᩷") ^ i4;
                            i6 = ((iM11307 ^ i5) * (-16731)) ^ 42217714;
                            i7 = 77396568;
                            break;
                        }
                        iM11307 = ThreadFactoryC3888.m11306("ᩴۧ") ^ i4;
                        i6 = ((iM11307 ^ i5) * (-5331)) ^ (-1454185279);
                        i7 = -521323461;
                        break;
                    case 1353169721:
                    case 2129590135:
                        C19806.m45024();
                        C1066.m4023();
                        break;
                    case 1440072540:
                    case 1910593382:
                        if (C1668.f6641 < 0) {
                            iM11307 = (i5 - C19806.m45029("ۛۖ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                            i6 = ((iM11307 ^ i4) * (-14565)) ^ 1324736750;
                            i7 = 1150822933;
                        } else {
                            iM11307 = ThreadFactoryC3888.m11306("ܺ᩷") ^ i4;
                            i6 = ((iM11307 ^ i5) * (-16731)) ^ 42217714;
                            i7 = 77396568;
                        }
                        break;
                    default:
                        radioButtonArr = (RadioButton[]) obj;
                        length = radioButtonArr.length;
                        i2 = 0;
                        iM11307 = C19806.m45029("ۙܿ") ^ i4;
                        i6 = ((iM11307 ^ i5) * 4729) ^ (-426558363);
                        i7 = 748511081;
                        break;
                        break;
                }
                return;
            }
        }
    }
}
