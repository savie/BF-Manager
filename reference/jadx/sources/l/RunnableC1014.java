package l;

import android.app.Activity;
import com.google.android.material.textfield.IndicatorViewController;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.LinkedList;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.֨ۜ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: E4FN */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC1014 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f3677;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f3678;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f3679;

    public /* synthetic */ RunnableC1014(int i, Object obj, Object obj2) {
        int i2 = -190901704;
        int i3 = C2354.f7599;
        int i4 = C2834.f9334;
        this.f3677 = i;
        this.f3679 = obj;
        this.f3678 = obj2;
        int iM2761 = (C0619.m2761("ۧۛ") ^ i4) * 29;
        int i5 = ((iM2761 ^ i3) * 11333) ^ (-1219666096);
        int i6 = -328343152;
        while (true) {
            i2 = (iM2761 ^ i6) ^ (i5 & (((i2 ^ i3) * 25521) >> 31));
            switch (i2) {
                case -1865241585:
                case 375814253:
                    return;
                case -1718356432:
                case 1593822950:
                    C1783.m6232();
                    if (C3033.f9831 >= 0) {
                        iM2761 = C0619.m2761("۟֫") ^ i4;
                        i5 = ((iM2761 ^ i3) * 19595) ^ 2056744888;
                        i6 = -1947143875;
                    } else {
                        iM2761 = (C0619.m2761("ܶ᩻") + i4) * (-3);
                        i5 = ((iM2761 ^ i3) * 30415) ^ 1537638517;
                        i6 = 330699062;
                    }
                    break;
                case -1614159881:
                case 785238362:
                    C1321.m4852();
                    throw new RuntimeException();
                case -994468287:
                case -937032739:
                    C17202.m40372();
                    if (!C0862.m3503()) {
                        iM2761 = (C0619.m2761("ۢ֫") + i3) * 21;
                        i5 = ((iM2761 ^ i4) * (-9345)) ^ 1848155454;
                        i6 = 42862858;
                    } else {
                        iM2761 = C0773.m3169("ᩳܿ") ^ i3;
                        i5 = ((iM2761 ^ i4) * 28991) ^ 3795257;
                        i6 = 262860107;
                    }
                    break;
                case -713242233:
                case 375168154:
                    C1564.m5509();
                    C2485.m8357();
                    iM2761 = C0773.m3169("ᩳܿ") ^ i3;
                    i5 = ((iM2761 ^ i4) * 28991) ^ 3795257;
                    i6 = 262860107;
                    break;
                case -666412163:
                case 27910583:
                    C2878.m9491();
                    if (C4238.f15451 < 0) {
                        iM2761 = C0619.m2761("۟֫") ^ i4;
                        i5 = ((iM2761 ^ i3) * 19595) ^ 2056744888;
                        i6 = -1947143875;
                    } else {
                        iM2761 = (C0619.m2761("ۢ֫") + i3) * 21;
                        i5 = ((iM2761 ^ i4) * (-9345)) ^ 1848155454;
                        i6 = 42862858;
                    }
                    break;
                default:
                    if (C3099.f10023 <= 0) {
                        iM2761 = (C0619.m2761("ۘܳ") ^ i3) * 25;
                        i5 = ((iM2761 ^ i4) * (-25915)) ^ (-987477863);
                        i6 = 1200315189;
                    } else {
                        iM2761 = (i4 - C0619.m2761("ۖۜ")) * 21;
                        i5 = ((iM2761 ^ i3) * (-3265)) ^ (-985076644);
                        i6 = 271277021;
                    }
                    break;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Activity activity = null;
        Object obj = null;
        C24132 c24132 = null;
        Object obj2 = null;
        C4270 c4270 = null;
        Object obj3 = null;
        ViewOnClickListenerC19404 viewOnClickListenerC19404 = null;
        Object obj4 = null;
        int i = 906464783;
        int i2 = C2287.f7432;
        int i3 = AbstractC0641.f2496;
        int iM3169 = (C0773.m3169("᩶᩸") + i3) * 47;
        int i4 = ((iM3169 ^ i2) * (-24749)) ^ (-1986138528);
        int i5 = 2134790150;
        while (true) {
            i = ((((i ^ i2) * 17443) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2018109526:
                case 1285520008:
                    c4270 = (C4270) this.f3679;
                    if (C3077.f9998) {
                        iM3169 = C0619.m2761("ܰۘ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-23041)) ^ (-1689382602);
                        i5 = -1735407059;
                    } else {
                        iM3169 = (C0773.m3169("۬֨") + i3) * (-127);
                        i4 = ((iM3169 ^ i2) * 24309) ^ (-716780803);
                        i5 = -780841099;
                    }
                    break;
                case -1972687818:
                case 513669754:
                    if (C2310.f7472 >= 0) {
                        iM3169 = (C0773.m3169("۬֨") + i3) * (-127);
                        i4 = ((iM3169 ^ i2) * 24309) ^ (-716780803);
                        i5 = -780841099;
                    } else {
                        iM3169 = (C0773.m3169("ۛ᩺") ^ i2) * (-99);
                        i4 = ((iM3169 ^ i3) * (-19927)) ^ 4976847;
                        i5 = -2066224708;
                    }
                    break;
                case -1893374559:
                case -231163550:
                    C17202.m40372();
                    C2485.m8357();
                    break;
                case -1866500363:
                case 49261834:
                    switch (this.f3677) {
                        case 0:
                            iM3169 = (i3 - C0773.m3169("᩻ۧ")) * 5;
                            i4 = ((iM3169 ^ i2) * (-15617)) ^ 1321310288;
                            i5 = -192808998;
                            break;
                        case 1:
                            iM3169 = C0619.m2761("ܳܶ") ^ i2;
                            i4 = ((iM3169 ^ i3) * IndicatorViewController.DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION) ^ (-1578101815);
                            i5 = -1453800851;
                            break;
                        case 2:
                            iM3169 = C0773.m3169("᩻ۙ") ^ i2;
                            i4 = ((iM3169 ^ i3) * 31793) ^ 1769128983;
                            i5 = -863248577;
                            break;
                        default:
                            iM3169 = (C0773.m3169("ܳ᩶") + i3) * 35;
                            i4 = ((iM3169 ^ i2) * 23077) ^ 8961979;
                            i5 = -1428037419;
                            break;
                    }
                    break;
                case -1763917821:
                case -1317075108:
                    C11650.m29292(activity, (C6849) obj);
                    break;
                case -1752904682:
                case 693090823:
                    c24132 = (C24132) this.f3679;
                    if (C0950.f3488 >= 0) {
                        iM3169 = (C0773.m3169("۬֨") + i3) * (-127);
                        i4 = ((iM3169 ^ i2) * 24309) ^ (-716780803);
                        i5 = -780841099;
                    } else {
                        iM3169 = (C0619.m2761("ܿۤ") + i3) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM3169 ^ i2) * (-4913)) ^ 407594848;
                        i5 = -2005752550;
                    }
                    break;
                case -1476706280:
                case -1471579455:
                    if (C1343.f4799 == 0) {
                        iM3169 = C0773.m3169("ۙۙ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-16507)) ^ (-1260900213);
                        i5 = -1635074221;
                    } else {
                        iM3169 = (C0773.m3169("ۛ᩺") ^ i2) * (-99);
                        i4 = ((iM3169 ^ i3) * (-19927)) ^ 4976847;
                        i5 = -2066224708;
                    }
                    break;
                case -1378469275:
                case -239586479:
                    C4270.m13599(c4270, (LinkedList) obj3);
                    break;
                case -1274314731:
                case 100094229:
                    c24132.m53788((AbstractC13753) obj2);
                    break;
                case -1080172811:
                case -823651237:
                    C1343.m4943();
                    iM3169 = (C0773.m3169("ۛ᩺") ^ i2) * (-99);
                    i4 = ((iM3169 ^ i3) * (-19927)) ^ 4976847;
                    i5 = -2066224708;
                    break;
                case -611867267:
                case 1117402468:
                    activity = (Activity) this.f3679;
                    if (C3734.f12817 >= 0) {
                        iM3169 = C0773.m3169("ۙۙ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-16507)) ^ (-1260900213);
                        i5 = -1635074221;
                    } else {
                        iM3169 = (C0773.m3169("֨ۘ") ^ i2) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM3169 ^ i3) * 28367) ^ (-979358354);
                        i5 = -1297077378;
                    }
                    break;
                case -553361012:
                case 943860111:
                    if (C2375.f7641 <= 0) {
                        iM3169 = C0619.m2761("ܿ۬") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-29285)) ^ 656619590;
                        i5 = -1202817299;
                    } else {
                        iM3169 = C0619.m2761("ۨ᩷") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-22233)) ^ 2093852642;
                        i5 = -1215552363;
                    }
                    break;
                case -462993172:
                case 307935863:
                    obj3 = this.f3678;
                    if (C3492.m11488()) {
                        iM3169 = (i2 - C0619.m2761("ۤۛ")) * (-123);
                        i4 = ((iM3169 ^ i3) * (-29353)) ^ 1620736940;
                        i5 = -658062145;
                    } else {
                        iM3169 = C0619.m2761("ܿ۬") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-29285)) ^ 656619590;
                        i5 = -1202817299;
                    }
                    break;
                case -428599898:
                case 849020050:
                    C4282.m13644();
                    if (C4238.m13540() <= 0) {
                        iM3169 = (C0773.m3169("۬֨") + i3) * (-127);
                        i4 = ((iM3169 ^ i2) * 24309) ^ (-716780803);
                        i5 = -780841099;
                    } else {
                        iM3169 = (C0619.m2761("۟ۚ") + i3) * 67;
                        i4 = ((iM3169 ^ i2) * 11911) ^ 1380631323;
                        i5 = -236681025;
                    }
                    break;
                case 32926058:
                case 1395655651:
                    ViewOnClickListenerC19404.m44875(viewOnClickListenerC19404, (Runnable) obj4);
                    break;
                case 387180581:
                case 667688943:
                    obj2 = this.f3678;
                    if (C2287.f7432 >= 0) {
                        iM3169 = (C0773.m3169("۬֨") + i3) * (-127);
                        i4 = ((iM3169 ^ i2) * 24309) ^ (-716780803);
                        i5 = -780841099;
                    } else {
                        iM3169 = C0773.m3169("۟۫") ^ i2;
                        i4 = ((iM3169 ^ i3) * 7427) ^ (-2144871867);
                        i5 = -2048912144;
                    }
                    break;
                case 728305501:
                case 932923923:
                    if (C13473.f42873 != 0) {
                        iM3169 = (C0773.m3169("۬֨") + i3) * (-127);
                        i4 = ((iM3169 ^ i2) * 24309) ^ (-716780803);
                        i5 = -780841099;
                    } else {
                        iM3169 = (C0619.m2761("ۚۧ") + i3) * 101;
                        i4 = ((iM3169 ^ i2) * (-29033)) ^ 683211734;
                        i5 = -1770251243;
                    }
                    break;
                case 1077310646:
                case 1566651645:
                    obj4 = this.f3678;
                    if (C4238.m13540() <= 0) {
                        iM3169 = C0619.m2761("ܿ۬") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-29285)) ^ 656619590;
                        i5 = -1202817299;
                    } else {
                        iM3169 = (C0773.m3169("ܽ֫") ^ i2) * (-7);
                        i4 = ((iM3169 ^ i3) * (-24419)) ^ 429028832;
                        i5 = 2125323941;
                    }
                    break;
                case 1273732447:
                case 1370767754:
                    viewOnClickListenerC19404 = (ViewOnClickListenerC19404) this.f3679;
                    if (C2354.f7599 >= 0) {
                        iM3169 = (C0773.m3169("ۛ᩺") ^ i2) * (-99);
                        i4 = ((iM3169 ^ i3) * (-19927)) ^ 4976847;
                        i5 = -2066224708;
                    } else {
                        iM3169 = (C0619.m2761("᩵֨") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM3169 ^ i2) * (-28745)) ^ (-1855416489);
                        i5 = -1349778640;
                    }
                    break;
                default:
                    obj = this.f3678;
                    if (C2375.f7641 <= 0) {
                        iM3169 = C0619.m2761("ܿ۬") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-29285)) ^ 656619590;
                        i5 = -1202817299;
                    } else {
                        iM3169 = (i3 - C0619.m2761("᩶ܶ")) * (-67);
                        i4 = ((iM3169 ^ i2) * (-1455)) ^ 140239948;
                        i5 = 462246774;
                    }
                    break;
            }
            return;
        }
    }
}
