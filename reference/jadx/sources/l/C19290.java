package l;

import bin.mt.plugin.api.translation.TranslationEngine;
import com.alipay.sdk.m.y.q;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.᩵ۜۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 517G */
/* JADX INFO: loaded from: classes5.dex */
public final class C19290 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public volatile boolean f62251;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC12483 f62252;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ExecutorService f62253;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20701 f62254;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public ArrayList f62255;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11986 f62256;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m44280(final C19290 c19290, AbstractActivityC12483 abstractActivityC12483, final ExecutorService executorService) {
        int i = 452252749;
        int i2 = RunnableC0195.f1321;
        int i3 = C2788.f10625;
        int iM45029 = (C19806.m45029("᩺ܳ") + i3) * 31;
        int i4 = ((iM45029 ^ i2) * 28207) ^ 1662230627;
        int i5 = 1099402507;
        while (true) {
            i = ((((i ^ i2) * (-5297)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2047480579:
                case -1958947228:
                    if (!C0817.f3443) {
                        iM45029 = ThreadFactoryC3888.m11306("֨ܶ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-31613)) ^ 393767053;
                        i5 = 853884943;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܿܺ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-12503)) ^ (-1889150874);
                        i5 = -1999342537;
                    }
                    break;
                case -1737580283:
                case 627746325:
                    if (C0797.m3359()) {
                        iM45029 = C19806.m45029("ܽܰ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-29663)) ^ (-664211187);
                        i5 = -398577754;
                    } else {
                        iM45029 = (C19806.m45029("ᩴ᩵") ^ i2) * (-55);
                        i4 = ((iM45029 ^ i3) * 7521) ^ (-2061027002);
                        i5 = -708117952;
                    }
                    break;
                case -1695641667:
                case 775224344:
                    C0671.m3016(c19290, abstractActivityC12483);
                    C17485 c17485 = c19290.f12806;
                    if (C0671.f2816 == 0) {
                        c17485.m40697(new Runnable(c19290) { // from class: l.۠ۜۘ

                            /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
                            public final /* synthetic */ C19290 f26240;

                            @Override // java.lang.Runnable
                            public final void run() {
                                C19290.m44279(this.f26240, executorService);
                            }

                            {
                                int i6 = -490944034;
                                int i7 = C2249.f8050;
                                int i8 = C1937.f7317;
                                int iM11306 = (ThreadFactoryC3888.m11306("ۧᩴ") + i7) * (-87);
                                int i9 = ((iM11306 ^ i8) * (-27047)) ^ (-236770536);
                                int i10 = -1232407917;
                                while (true) {
                                    i6 = ((((i6 ^ i8) * 6275) >> 31) & i9) ^ (iM11306 ^ i10);
                                    switch (i6) {
                                        case -2058170147:
                                        case -273790652:
                                            C1668.m5583();
                                            C3660.m10791();
                                            throw new RuntimeException();
                                        case -2034052132:
                                        case 982627310:
                                            if (C1189.f5284 <= 0) {
                                                iM11306 = (C19806.m45029("᩶۫") ^ i8) * 53;
                                                i9 = ((iM11306 ^ i7) * 6535) ^ (-365550155);
                                                i10 = 1194075946;
                                            } else {
                                                iM11306 = ThreadFactoryC3888.m11306("۫۠") ^ i7;
                                                i9 = ((iM11306 ^ i8) * (-20947)) ^ 214144931;
                                                i10 = 1557492087;
                                            }
                                            break;
                                        case -1984487662:
                                        case 1153970502:
                                            C2477.m7593();
                                            if (C3660.f13403 < 0) {
                                                iM11306 = C19806.m45029("ۤ᩻") ^ i7;
                                                i9 = ((iM11306 ^ i8) * (-8827)) ^ 926151597;
                                                i10 = -136747681;
                                            } else {
                                                iM11306 = (i8 - C19806.m45029("ܺ֫")) * (-107);
                                                i9 = ((iM11306 ^ i7) * 7045) ^ (-1474917785);
                                                i10 = -2055712446;
                                            }
                                            break;
                                        case -1897265490:
                                        case -371350726:
                                            if (C2477.f9839 <= 0) {
                                                iM11306 = C19806.m45029("ۛ۠") ^ i7;
                                                i9 = ((iM11306 ^ i8) * 5535) ^ (-890271136);
                                                i10 = 1160862423;
                                            } else {
                                                iM11306 = ThreadFactoryC3888.m11306("۟ۖ") ^ i8;
                                                i9 = ((iM11306 ^ i7) * (-7627)) ^ 1765171499;
                                                i10 = -785572524;
                                            }
                                            break;
                                        case -1694604954:
                                        case 105017743:
                                            if (RunnableC1606.m5473() != 0) {
                                                iM11306 = C19806.m45029("ۛ۠") ^ i7;
                                                i9 = ((iM11306 ^ i8) * 5535) ^ (-890271136);
                                                i10 = 1160862423;
                                            } else {
                                                iM11306 = C19806.m45029("ܶ֫") ^ i7;
                                                i9 = ((iM11306 ^ i8) * (-25305)) ^ (-804096540);
                                                i10 = 1770494332;
                                            }
                                            break;
                                        case -1665729203:
                                        case 1760926885:
                                            return;
                                        case -1444664026:
                                        case 1588097699:
                                            if (C0629.f2722 <= 0) {
                                                iM11306 = C19806.m45029("ۤ᩻") ^ i7;
                                                i9 = ((iM11306 ^ i8) * (-8827)) ^ 926151597;
                                                i10 = -136747681;
                                            } else {
                                                iM11306 = (ThreadFactoryC3888.m11306("᩶ܰ") ^ i8) * (-107);
                                                i9 = ((iM11306 ^ i7) * (-19401)) ^ (-2119389760);
                                                i10 = 1509441658;
                                            }
                                            break;
                                        case -1285320729:
                                        case 2047427976:
                                            if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                                                iM11306 = (i8 - C19806.m45029("ܺ֫")) * (-107);
                                                i9 = ((iM11306 ^ i7) * 7045) ^ (-1474917785);
                                                i10 = -2055712446;
                                            } else {
                                                iM11306 = ThreadFactoryC3888.m11306("ۧۗ") ^ i8;
                                                i9 = ((iM11306 ^ i7) * 15425) ^ (-1334537161);
                                                i10 = -1787511672;
                                            }
                                            break;
                                        case -309394786:
                                        case 728198319:
                                            this.f26240 = c19290;
                                            if (C2477.f9839 <= 0) {
                                                iM11306 = C19806.m45029("ۤ᩻") ^ i7;
                                                i9 = ((iM11306 ^ i8) * (-8827)) ^ 926151597;
                                                i10 = -136747681;
                                            } else {
                                                iM11306 = (i8 - C19806.m45029("ܶ֨")) * 43;
                                                i9 = ((iM11306 ^ i7) * 4361) ^ (-1269136801);
                                                i10 = -1631369114;
                                            }
                                            break;
                                        case -282026759:
                                        case 2031957200:
                                            C3577.m10565();
                                            if (!C0962.f3784) {
                                                iM11306 = C19806.m45029("ۛ۠") ^ i7;
                                                i9 = ((iM11306 ^ i8) * 5535) ^ (-890271136);
                                                i10 = 1160862423;
                                            } else {
                                                iM11306 = (i8 - C19806.m45029("ܺ֫")) * (-107);
                                                i9 = ((iM11306 ^ i7) * 7045) ^ (-1474917785);
                                                i10 = -2055712446;
                                            }
                                            break;
                                        case -45035752:
                                        case 2081649952:
                                            if (C1461.f5957 <= 0) {
                                                iM11306 = (i8 - C19806.m45029("ܺ֫")) * (-107);
                                                i9 = ((iM11306 ^ i7) * 7045) ^ (-1474917785);
                                                i10 = -2055712446;
                                            } else {
                                                iM11306 = (ThreadFactoryC3888.m11306("᩻ۚ") + i7) * 51;
                                                i9 = ((iM11306 ^ i8) * (-29275)) ^ 199115796;
                                                i10 = 567408130;
                                            }
                                            break;
                                        case -35472082:
                                        case 626701510:
                                            RunnableC0195.m1431();
                                            C2704.m8255();
                                            iM11306 = C19806.m45029("ۛ۠") ^ i7;
                                            i9 = ((iM11306 ^ i8) * 5535) ^ (-890271136);
                                            i10 = 1160862423;
                                            break;
                                        case 834893923:
                                        case 934986791:
                                            C3743.m10966();
                                            if (C1460.f5948 < 0) {
                                                iM11306 = C19806.m45029("ۛ۠") ^ i7;
                                                i9 = ((iM11306 ^ i8) * 5535) ^ (-890271136);
                                                i10 = 1160862423;
                                            } else {
                                                iM11306 = ThreadFactoryC3888.m11306("ܰ֫") ^ i8;
                                                i9 = ((iM11306 ^ i7) * 17511) ^ (-2146747258);
                                                i10 = 76287471;
                                            }
                                            break;
                                        case 1478722559:
                                        case 1975506472:
                                            if (C2642.f10294 <= 0) {
                                                iM11306 = (C19806.m45029("᩶۫") ^ i8) * 53;
                                                i9 = ((iM11306 ^ i7) * 6535) ^ (-365550155);
                                                i10 = 1194075946;
                                            } else {
                                                iM11306 = ThreadFactoryC3888.m11306("ܶܿ") ^ i8;
                                                i9 = ((iM11306 ^ i7) * (-1935)) ^ 949552655;
                                                i10 = 39923870;
                                            }
                                            break;
                                        case 1821631568:
                                        case 2127041845:
                                            if (C1668.f6641 >= 0) {
                                                iM11306 = C19806.m45029("ۛ۠") ^ i7;
                                                i9 = ((iM11306 ^ i8) * 5535) ^ (-890271136);
                                                i10 = 1160862423;
                                            } else {
                                                iM11306 = (i7 - C19806.m45029("ۡۢ")) * 53;
                                                i9 = ((iM11306 ^ i8) * 23669) ^ (-1887487873);
                                                i10 = 691177022;
                                            }
                                            break;
                                        default:
                                            if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                                                iM11306 = ThreadFactoryC3888.m11306("ۘ֡") ^ i7;
                                                i9 = ((iM11306 ^ i8) * 31999) ^ (-93918374);
                                                i10 = 1929381697;
                                            } else {
                                                iM11306 = (i8 - C19806.m45029("ܺ֫")) * (-107);
                                                i9 = ((iM11306 ^ i7) * 7045) ^ (-1474917785);
                                                i10 = -2055712446;
                                            }
                                            break;
                                    }
                                }
                            }
                        });
                        iM45029 = (C19806.m45029("ۜ᩶") + i2) * (-101);
                        i4 = ((iM45029 ^ i3) * 4563) ^ (-882395343);
                        i5 = -1516048802;
                    } else {
                        iM45029 = (i3 - C19806.m45029("᩶ᩴ")) * (-17);
                        i4 = ((iM45029 ^ i2) * 20629) ^ (-158378382);
                        i5 = -842027358;
                    }
                    break;
                case -1575742513:
                case -745594784:
                    if (C1066.f4915 <= 0) {
                        iM45029 = (i3 - C19806.m45029("᩶ᩴ")) * (-17);
                        i4 = ((iM45029 ^ i2) * 20629) ^ (-158378382);
                        i5 = -842027358;
                    } else {
                        iM45029 = (i2 - C19806.m45029("֫᩺")) * (-47);
                        i4 = ((iM45029 ^ i3) * 31075) ^ (-1212196240);
                        i5 = -913425026;
                    }
                    break;
                case -1493405780:
                case 973315290:
                    if (c19290.f62251) {
                        iM45029 = ThreadFactoryC3888.m11306("ۡ۠") ^ i3;
                        i4 = ((iM45029 ^ i2) * 7259) ^ 654564635;
                        i5 = 1325447540;
                    } else {
                        iM45029 = (C19806.m45029("ۜ᩶") + i2) * (-101);
                        i4 = ((iM45029 ^ i3) * 4563) ^ (-882395343);
                        i5 = -1516048802;
                    }
                    break;
                case -1445642726:
                case -1046778521:
                    if (ThreadFactoryC3888.m11300() <= 0) {
                        iM45029 = (i3 - C19806.m45029("᩶ᩴ")) * (-17);
                        i4 = ((iM45029 ^ i2) * 20629) ^ (-158378382);
                        i5 = -842027358;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۡ۟") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-6683)) ^ 54829576;
                        i5 = 107026088;
                    }
                    break;
                case -1238617050:
                case -514502224:
                    if (C0817.f3443) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩶ܳ") ^ i3) * (-117);
                        i4 = ((iM45029 ^ i2) * (-5693)) ^ (-2005564824);
                        i5 = 5025795;
                    } else {
                        iM45029 = (C19806.m45029("ܶ֨") + i2) * (-85);
                        i4 = ((iM45029 ^ i3) * 4533) ^ 1048241452;
                        i5 = 474370090;
                    }
                    break;
                case -553797161:
                case 721503679:
                    ThreadFactoryC3888.m11300();
                    if (C2642.f10294 > 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֨ܶ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-31613)) ^ 393767053;
                        i5 = 853884943;
                    } else {
                        iM45029 = (C19806.m45029("ᩴ᩵") ^ i2) * (-55);
                        i4 = ((iM45029 ^ i3) * 7521) ^ (-2061027002);
                        i5 = -708117952;
                    }
                    break;
                case -502424145:
                case 1475495316:
                    if (RunnableC0195.f1321 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܿܺ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-12503)) ^ (-1889150874);
                        i5 = -1999342537;
                    } else {
                        iM45029 = (C19806.m45029("֫ᩳ") ^ i2) * 57;
                        i4 = ((iM45029 ^ i3) * (-23121)) ^ (-71508834);
                        i5 = 1483896030;
                    }
                    break;
                case -479641765:
                case -102304351:
                    break;
                case -418702249:
                case 1508457339:
                    C3722.m10894();
                    iM45029 = (C19806.m45029("ᩴ᩵") ^ i2) * (-55);
                    i4 = ((iM45029 ^ i3) * 7521) ^ (-2061027002);
                    i5 = -708117952;
                    break;
                case -199999390:
                case 1973988855:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܿܺ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-12503)) ^ (-1889150874);
                        i5 = -1999342537;
                    } else {
                        iM45029 = C19806.m45029("ۖۨ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-19369)) ^ 847255047;
                        i5 = 884695476;
                    }
                    break;
                case -70674888:
                case 1037050595:
                    if (C3660.f13403 >= 0) {
                        iM45029 = (C19806.m45029("ܶ֨") + i2) * (-85);
                        i4 = ((iM45029 ^ i3) * 4533) ^ 1048241452;
                        i5 = 474370090;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۡᩳ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-23049)) ^ 1310249092;
                        i5 = -696413162;
                    }
                    break;
                case 110431434:
                case 1607159023:
                    C2332.m7079();
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM45029 = (C19806.m45029("ܶ֨") + i2) * (-85);
                        i4 = ((iM45029 ^ i3) * 4533) ^ 1048241452;
                        i5 = 474370090;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܿܺ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-12503)) ^ (-1889150874);
                        i5 = -1999342537;
                    }
                    break;
                case 570500029:
                case 601401496:
                    if (C3722.f13525 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֨ܶ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-31613)) ^ 393767053;
                        i5 = 853884943;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܶܶ") ^ i2) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM45029 ^ i3) * (-16615)) ^ 1572838717;
                        i5 = 1953552118;
                    }
                    break;
                case 577566746:
                case 1418867132:
                    if (C2704.m8255() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֨ܶ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-31613)) ^ 393767053;
                        i5 = 853884943;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ᩳ᩶")) * 85;
                        i4 = ((iM45029 ^ i2) * 13135) ^ 1072639615;
                        i5 = -449351808;
                    }
                    break;
                default:
                    C1461.m5080();
                    C1398.m4895();
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        int iM45029;
        int i;
        C11986 c11986 = null;
        Iterator itM9863 = null;
        Class cls = null;
        Throwable th = null;
        int i2 = 403557463;
        int i3 = MenuItemOnMenuItemClickListenerC3244.f12064;
        int i4 = C3660.f13403;
        int iM450210 = (C19806.m45029("ܺܺ") + i4) * (-89);
        int i5 = ((iM450210 ^ i3) * 23947) ^ 398726554;
        int i6 = 1274880981;
        while (true) {
            int i7 = iM450210 ^ i6;
            ArrayList arrayList = null;
            while (true) {
                i2 = ((((i2 ^ i3) * 19563) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2008723305:
                    case 1677934322:
                        C0962.m3746();
                        C2124.m6673();
                        break;
                    case -1929803109:
                    case -1244346725:
                        c11986 = this.f62256;
                        c11986.m29810(arrayList);
                        itM9863 = ViewTreeObserverOnPreDrawListenerC3327.m9863(arrayList);
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("۠ۚ")) * (-79);
                        i5 = ((iM45029 ^ i4) * (-29505)) ^ (-1140497989);
                        i = -900402938;
                        i7 = iM45029 ^ i;
                        break;
                    case -1841724308:
                    case 266021280:
                        if (C7105.f23796 >= 0) {
                            iM450210 = (C19806.m45029("۫֫") ^ i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                            i5 = ((iM450210 ^ i4) * (-19375)) ^ 1995349975;
                            i6 = 1858264187;
                        } else {
                            if (C2124.f7782 > 0) {
                                if (!ViewTreeObserverOnPreDrawListenerC3327.m9874()) {
                                    if (C0050.f912 > 0 && C2477.f9839 > 0) {
                                        if (AbstractC0464.f2088 <= 0 || C2124.f7782 <= 0) {
                                            iM450210 = (i4 - ThreadFactoryC3888.m11306("ܽܽ")) * (-79);
                                            i5 = ((iM450210 ^ i3) * (-10115)) ^ (-918874479);
                                            i6 = -1177655772;
                                        } else if (!C0962.f3784) {
                                            if (!RunnableC1564.m5345()) {
                                                arrayList = new ArrayList();
                                                if (C0050.f912 > 0) {
                                                    iM45029 = C19806.m45029("֫᩹") ^ i4;
                                                    i5 = ((iM45029 ^ i3) * (-1981)) ^ (-563958002);
                                                    i = 578432502;
                                                    i7 = iM45029 ^ i;
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    iM450210 = C19806.m45029("᩺ۤ") ^ i4;
                                    i5 = ((iM450210 ^ i3) * (-16393)) ^ (-949580775);
                                    i6 = 2139022787;
                                }
                                iM450210 = C19806.m45029("᩻ᩳ") ^ i4;
                                i5 = ((iM450210 ^ i3) * 8835) ^ (-43118690);
                                i6 = 1861663767;
                            }
                            iM450210 = (ThreadFactoryC3888.m11306("ܽ᩺") + i3) * (-11);
                            i5 = ((iM450210 ^ i4) * 8993) ^ (-380301295);
                            i6 = -1222807924;
                        }
                        break;
                    case -1697914965:
                    case 1152234626:
                        if (C0962.m3748(itM9863)) {
                            iM45029 = (ThreadFactoryC3888.m11306("֡ۛ") ^ i3) * (-29);
                            i5 = ((iM45029 ^ i4) * 29783) ^ 933556805;
                            i = 983770575;
                        } else {
                            iM45029 = (C19806.m45029("᩹ܽ") + i4) * 47;
                            i5 = ((iM45029 ^ i3) * (-7987)) ^ (-2033058687);
                            i = -607269440;
                        }
                        i7 = iM45029 ^ i;
                        break;
                    case -1635533877:
                    case 37326509:
                        try {
                            TranslationEngine translationEngine = (TranslationEngine) cls.newInstance();
                            translationEngine.init(c11986.m29831());
                            C2249.m6905(this.f62255, translationEngine);
                            iM45029 = (i3 - ThreadFactoryC3888.m11306("۠ۚ")) * (-79);
                            i5 = ((iM45029 ^ i4) * (-29505)) ^ (-1140497989);
                            i = -900402938;
                        } catch (Throwable th2) {
                            th = th2;
                            iM45029 = (C19806.m45029("᩸ۗ") ^ i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                            i5 = ((iM45029 ^ i4) * 30009) ^ 2123242797;
                            i = -350459393;
                        }
                        i7 = iM45029 ^ i;
                        break;
                    case -1554144315:
                    case -873857382:
                        C2332.m7079();
                        C2788.m8472();
                        iM450210 = (i4 - ThreadFactoryC3888.m11306("ܽܽ")) * (-79);
                        i5 = ((iM450210 ^ i3) * (-10115)) ^ (-918874479);
                        i6 = -1177655772;
                        break;
                    case -1547491544:
                    case 88288766:
                        if (RunnableC1606.f6488 >= 0) {
                            iM450210 = C19806.m45029("᩺ۤ") ^ i4;
                            i5 = ((iM450210 ^ i3) * (-16393)) ^ (-949580775);
                            i6 = 2139022787;
                        }
                        iM45029 = (C19806.m45029("ܿ֨") + i3) * 7;
                        i5 = ((iM45029 ^ i4) * (-23679)) ^ 482366108;
                        i = -1001830459;
                        i7 = iM45029 ^ i;
                        break;
                    case -1495414854:
                    case 2038936399:
                        if (C3577.f13150 < 0) {
                            iM450210 = (ThreadFactoryC3888.m11306("ܽ᩺") + i3) * (-11);
                            i5 = ((iM450210 ^ i4) * 8993) ^ (-380301295);
                            i6 = -1222807924;
                        } else {
                            iM450210 = (i4 - ThreadFactoryC3888.m11306("ܽܽ")) * (-79);
                            i5 = ((iM450210 ^ i3) * (-10115)) ^ (-918874479);
                            i6 = -1177655772;
                        }
                        break;
                    case -1223557295:
                    case -133111576:
                        cls = (Class) C0278.m1776(itM9863);
                        iM45029 = (ThreadFactoryC3888.m11306("۬ۨ") + i4) * (-19);
                        i5 = ((iM45029 ^ i3) * 7439) ^ 1928217274;
                        i = -1137010306;
                        i7 = iM45029 ^ i;
                        break;
                    case -812717330:
                    case 39704553:
                        break;
                    case -497003305:
                    case -13929687:
                        c11986.m29814(th);
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("۠ۚ")) * (-79);
                        i5 = ((iM45029 ^ i4) * (-29505)) ^ (-1140497989);
                        i = -900402938;
                        i7 = iM45029 ^ i;
                        break;
                    case -388759766:
                    case 2142602881:
                        C1937.m6279();
                        if (C3535.f13026 > 0) {
                            iM450210 = (i4 - ThreadFactoryC3888.m11306("ܽܽ")) * (-79);
                            i5 = ((iM450210 ^ i3) * (-10115)) ^ (-918874479);
                            i6 = -1177655772;
                        }
                        iM45029 = (C19806.m45029("ܿ֨") + i3) * 7;
                        i5 = ((iM45029 ^ i4) * (-23679)) ^ 482366108;
                        i = -1001830459;
                        i7 = iM45029 ^ i;
                        break;
                    default:
                        ThreadFactoryC3888.m11300();
                        if (C1875.f7103 < 0) {
                            iM450210 = (C19806.m45029("۫֫") ^ i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                            i5 = ((iM450210 ^ i4) * (-19375)) ^ 1995349975;
                            i6 = 1858264187;
                        } else {
                            iM450210 = (i4 - ThreadFactoryC3888.m11306("ܽܽ")) * (-79);
                            i5 = ((iM450210 ^ i3) * (-10115)) ^ (-918874479);
                            i6 = -1177655772;
                        }
                        break;
                }
                return;
            }
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        C17485 c17485 = null;
        int i = -1101492350;
        int i2 = C2871.f10837;
        int i3 = C1148.f5161;
        int iM11306 = (ThreadFactoryC3888.m11306("ۛ۠") + i3) * 89;
        int i4 = ((iM11306 ^ i2) * 8077) ^ 2129473402;
        int i5 = 745541311;
        while (true) {
            i = ((((i ^ i2) * (-32043)) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2117248971:
                case 1541834300:
                    if (C1148.f5161 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۗ۫") ^ i3) * (-83);
                        i4 = ((iM11306 ^ i2) * (-18409)) ^ 439619424;
                        i5 = -12953714;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۫ۗ") + i2) * 23;
                        i4 = ((iM11306 ^ i3) * 31939) ^ 1833212329;
                        i5 = 105660290;
                    }
                    break;
                case -2086579311:
                case 900923180:
                    if (C1668.m5583()) {
                        iM11306 = (C19806.m45029("ܿ᩸") + i3) * 89;
                        i4 = ((iM11306 ^ i2) * (-18123)) ^ (-2040850406);
                        i5 = -58776997;
                    } else {
                        iM11306 = (C19806.m45029("ۙ᩵") ^ i3) * (-59);
                        i4 = ((iM11306 ^ i2) * 17729) ^ (-949208152);
                        i5 = 1922629550;
                    }
                    break;
                case -2045749582:
                case -138192310:
                    if (C2788.f10625 >= 0) {
                        iM11306 = (C19806.m45029("ۙ᩵") ^ i3) * (-59);
                        i4 = ((iM11306 ^ i2) * 17729) ^ (-949208152);
                        i5 = 1922629550;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۛ֡") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-11073)) ^ 835749070;
                        i5 = 827431739;
                    }
                    break;
                case -2022406191:
                case 908813275:
                    C2124.m6673();
                    C0278.m1789();
                    iM11306 = (C19806.m45029("ۙ᩵") ^ i3) * (-59);
                    i4 = ((iM11306 ^ i2) * 17729) ^ (-949208152);
                    i5 = 1922629550;
                    break;
                case -1879996323:
                case 1748031801:
                    if (C0278.f1572 <= 0) {
                        iM11306 = (C19806.m45029("ۚܰ") ^ i3) * (-125);
                        i4 = ((iM11306 ^ i2) * 8045) ^ (-2010314789);
                        i5 = 1871925624;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۫֡") ^ i2;
                        i4 = ((iM11306 ^ i3) * 30151) ^ 3984339;
                        i5 = 887134248;
                    }
                    break;
                case -1795250330:
                case -673999569:
                    break;
                case -1714564261:
                case 472616125:
                    if (C1377.f5749) {
                        iM11306 = C19806.m45029("ۗۨ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 30677) ^ 340057348;
                        i5 = -1745310831;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۗ۫") ^ i3) * (-83);
                        i4 = ((iM11306 ^ i2) * (-18409)) ^ 439619424;
                        i5 = -12953714;
                    }
                    break;
                case -1680725871:
                case 634042438:
                    c17485 = this.f12806;
                    if (c17485 != null) {
                        iM11306 = C19806.m45029("ۜܿ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 19317) ^ (-1384528475);
                        i5 = 1834136872;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۠ܶ") + i3) * (-117);
                        i4 = ((iM11306 ^ i2) * 21539) ^ (-343596516);
                        i5 = -628817592;
                    }
                    break;
                case -893121621:
                case 286547203:
                    if (MenuItemOnMenuItemClickListenerC3244.m9701() >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۗ۫") ^ i3) * (-83);
                        i4 = ((iM11306 ^ i2) * (-18409)) ^ 439619424;
                        i5 = -12953714;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩺᩺") ^ i2;
                        i4 = ((iM11306 ^ i3) * 17669) ^ 59670691;
                        i5 = -1788017476;
                    }
                    break;
                case -808845663:
                case -397726585:
                    if (C1977.f7413 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۗ۫") ^ i3) * (-83);
                        i4 = ((iM11306 ^ i2) * (-18409)) ^ 439619424;
                        i5 = -12953714;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۨ᩻") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-19781)) ^ (-266010204);
                        i5 = 1218320939;
                    }
                    break;
                case -666124252:
                case -177983916:
                    if (RunnableC1564.f6300) {
                        iM11306 = (C19806.m45029("ۚܰ") ^ i3) * (-125);
                        i4 = ((iM11306 ^ i2) * 8045) ^ (-2010314789);
                        i5 = 1871925624;
                    } else {
                        iM11306 = (C19806.m45029("ᩴۚ") ^ i2) * 17;
                        i4 = ((iM11306 ^ i3) * 4521) ^ (-1328510046);
                        i5 = -940632244;
                    }
                    break;
                case -542999481:
                case -289602614:
                    if (c17485.m40693()) {
                        iM11306 = (C19806.m45029("᩶ܰ") ^ i2) * (-55);
                        i4 = ((iM11306 ^ i3) * 5857) ^ (-1282673944);
                        i5 = 423582528;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۠ܶ") + i3) * (-117);
                        i4 = ((iM11306 ^ i2) * 21539) ^ (-343596516);
                        i5 = -628817592;
                    }
                    break;
                case -485665367:
                case 1139817546:
                    C0671.m3008();
                    C1937.m6279();
                    break;
                case -93390796:
                case 1102336952:
                    if (C1668.f6641 >= 0) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("۟ۛ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM11306 ^ i3) * (-32725)) ^ 1280586775;
                        i5 = -1522812181;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩷۠") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-15553)) ^ (-48520105);
                        i5 = -25346405;
                    }
                    break;
                case 367637482:
                case 441436590:
                    if (RunnableC1895.f7152) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۡ᩸")) * (-49);
                        i4 = ((iM11306 ^ i2) * 9649) ^ (-1448375316);
                        i5 = 1452484852;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("۟ۛ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM11306 ^ i3) * (-32725)) ^ 1280586775;
                        i5 = -1522812181;
                    }
                    break;
                case 664689008:
                case 1717259780:
                    if (C1025.f4800 < 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۗ۫") ^ i3) * (-83);
                        i4 = ((iM11306 ^ i2) * (-18409)) ^ 439619424;
                        i5 = -12953714;
                    } else {
                        iM11306 = (C19806.m45029("ۙ᩵") ^ i3) * (-59);
                        i4 = ((iM11306 ^ i2) * 17729) ^ (-949208152);
                        i5 = 1922629550;
                    }
                    break;
                case 1430500884:
                case 1743872857:
                    if (C0050.f912 > 0) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("۟ۛ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM11306 ^ i3) * (-32725)) ^ 1280586775;
                        i5 = -1522812181;
                    } else {
                        iM11306 = (C19806.m45029("ۙ᩵") ^ i3) * (-59);
                        i4 = ((iM11306 ^ i2) * 17729) ^ (-949208152);
                        i5 = 1922629550;
                    }
                    break;
                case 1739841874:
                case 2015650647:
                    this.f62256.m29814(exc);
                    break;
                default:
                    if (C1937.f7317 >= 0) {
                        iM11306 = (C19806.m45029("ۙ᩵") ^ i3) * (-59);
                        i4 = ((iM11306 ^ i2) * 17729) ^ (-949208152);
                        i5 = 1922629550;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩺᩶") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-4041)) ^ (-8653867);
                        i5 = -264136058;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m44279(C19290 c19290, ExecutorService executorService) {
        C17485 c17485 = null;
        int i = 1949754499;
        int i2 = C1937.f7317;
        int i3 = C1398.f5802;
        int iM45029 = C19806.m45029("֫᩻") ^ i3;
        int i4 = ((iM45029 ^ i2) * 2693) ^ (-100855920);
        int i5 = -103520480;
        while (true) {
            i = ((((i ^ i2) * (-4351)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2123950068:
                case -1882811318:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("᩷᩷")) * 7;
                        i4 = ((iM45029 ^ i3) * (-20821)) ^ (-872401745);
                        i5 = -504049060;
                    } else {
                        iM45029 = C19806.m45029("֡ۜ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-2809)) ^ 1975104782;
                        i5 = 903385862;
                    }
                    break;
                case -2121344832:
                case -682984167:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩹֨") + i3) * (-99);
                        i4 = ((iM45029 ^ i2) * (-18309)) ^ (-535050912);
                        i5 = -263968939;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩶֨") + i3) * (-103);
                        i4 = ((iM45029 ^ i2) * (-18731)) ^ 930258057;
                        i5 = -1405317362;
                    }
                    break;
                case -2120911901:
                case 601814215:
                    C0278.m1789();
                    iM45029 = (C19806.m45029("ۖᩳ") + i3) * 5;
                    i4 = ((iM45029 ^ i2) * 29227) ^ 1298687608;
                    i5 = 1524449333;
                    break;
                case -1982906431:
                case -338997598:
                    c17485 = c19290.f12806;
                    if (C2249.f8050 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("۠۟") + i2) * (-51);
                        i4 = ((iM45029 ^ i3) * (-5681)) ^ (-325633571);
                        i5 = -1409187047;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ܳ۠")) * (-19);
                        i4 = ((iM45029 ^ i2) * 7351) ^ (-1580424481);
                        i5 = 149110678;
                    }
                    break;
                case -1918664170:
                case 91152408:
                    if (C0050.f912 <= 0) {
                        iM45029 = (C19806.m45029("ۖᩳ") + i3) * 5;
                        i4 = ((iM45029 ^ i2) * 29227) ^ 1298687608;
                        i5 = 1524449333;
                    } else {
                        iM45029 = C19806.m45029("ۘۙ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 4583) ^ 314674321;
                        i5 = -1435306256;
                    }
                    break;
                case -1917585929:
                case -772810518:
                    CallableC1627.m5507();
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    break;
                case -1816238590:
                case -979554650:
                    C3286.m9795(c17485);
                    executorService.shutdownNow();
                    break;
                case -1813717113:
                case -1788559798:
                    if (C0278.m1789() <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩹֨") + i3) * (-99);
                        i4 = ((iM45029 ^ i2) * (-18309)) ^ (-535050912);
                        i5 = -263968939;
                    } else {
                        iM45029 = (C19806.m45029("ۖᩳ") + i3) * 5;
                        i4 = ((iM45029 ^ i2) * 29227) ^ 1298687608;
                        i5 = 1524449333;
                    }
                    break;
                case -1673276835:
                case -759064339:
                    if (RunnableC1564.f6300) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ۚ֡")) * (-59);
                        i4 = ((iM45029 ^ i3) * (-22757)) ^ (-2062104587);
                        i5 = -2011309127;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۟ۧ") + i3) * 21;
                        i4 = ((iM45029 ^ i2) * 27817) ^ 631788940;
                        i5 = 747726035;
                    }
                    break;
                case -1671341789:
                case 516756384:
                    if (RunnableC1564.f6300) {
                        iM45029 = (ThreadFactoryC3888.m11306("۠۟") + i2) * (-51);
                        i4 = ((iM45029 ^ i3) * (-5681)) ^ (-325633571);
                        i5 = -1409187047;
                    } else {
                        iM45029 = (C19806.m45029("ۛ۫") ^ i2) * (-81);
                        i4 = ((iM45029 ^ i3) * 13729) ^ 150699763;
                        i5 = -799575181;
                    }
                    break;
                case -1537338598:
                case -1375754030:
                    if (C2477.f9839 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩹֨") + i3) * (-99);
                        i4 = ((iM45029 ^ i2) * (-18309)) ^ (-535050912);
                        i5 = -263968939;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩸ۜ") ^ i2) * 79;
                        i4 = ((iM45029 ^ i3) * 19189) ^ (-1669561237);
                        i5 = -1998069598;
                    }
                    break;
                case -1521925019:
                case 284361463:
                    if (C0278.f1572 <= 0) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("᩷᩷")) * 7;
                        i4 = ((iM45029 ^ i3) * (-20821)) ^ (-872401745);
                        i5 = -504049060;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ۚ֡")) * (-59);
                        i4 = ((iM45029 ^ i3) * (-22757)) ^ (-2062104587);
                        i5 = -2011309127;
                    }
                    break;
                case -1513572919:
                case -443492254:
                    C2249.m6915();
                    if (!RunnableC3388.m10064()) {
                        iM45029 = (C19806.m45029("ۖᩳ") + i3) * 5;
                        i4 = ((iM45029 ^ i2) * 29227) ^ 1298687608;
                        i5 = 1524449333;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ۚ֡")) * (-59);
                        i4 = ((iM45029 ^ i3) * (-22757)) ^ (-2062104587);
                        i5 = -2011309127;
                    }
                    break;
                case -1189373024:
                case -458327363:
                    if (C10634.f36300 >= 0) {
                        iM45029 = (C19806.m45029("ۖᩳ") + i3) * 5;
                        i4 = ((iM45029 ^ i2) * 29227) ^ 1298687608;
                        i5 = 1524449333;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩷۟") ^ i2;
                        i4 = ((iM45029 ^ i3) * 31635) ^ (-379480981);
                        i5 = 7602311;
                    }
                    break;
                case -149626740:
                case 1223619685:
                    if (C0671.f2816 != 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("۠۟") + i2) * (-51);
                        i4 = ((iM45029 ^ i3) * (-5681)) ^ (-325633571);
                        i5 = -1409187047;
                    } else {
                        iM45029 = C19806.m45029("۠ۖ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 24445) ^ 1438588695;
                        i5 = 1022808962;
                    }
                    break;
                default:
                    if (RunnableC3388.f12514 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩹֨") + i3) * (-99);
                        i4 = ((iM45029 ^ i2) * (-18309)) ^ (-535050912);
                        i5 = -263968939;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴ۬") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-7119)) ^ (-1275891738);
                        i5 = 1713163651;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        int i = -1095114092;
        int i2 = C10634.f36300;
        int i3 = C1460.f5948;
        int iM11306 = ThreadFactoryC3888.m11306("۫ᩴ") ^ i2;
        int i4 = ((iM11306 ^ i3) * (-20451)) ^ (-883851328);
        int i5 = -1170706416;
        while (true) {
            i = ((((i ^ i3) * 6883) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -1770219075:
                case -659560211:
                    C19806.m45024();
                    C1461.m5080();
                    iM11306 = (ThreadFactoryC3888.m11306("ۛ۟") ^ i2) * (-113);
                    i4 = ((iM11306 ^ i3) * (-3933)) ^ 1280610562;
                    i5 = 129828627;
                    break;
                case -1466448526:
                case -970516075:
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    C1025.m3861();
                    break;
                case -1286807403:
                case 330882611:
                    if (AbstractC0464.m2313() != 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۤۡ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 22279) ^ (-1659333072);
                        i5 = 1919598710;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۛ۟") ^ i2) * (-113);
                        i4 = ((iM11306 ^ i3) * (-3933)) ^ 1280610562;
                        i5 = 129828627;
                    }
                    break;
                case -547263240:
                case 1541619455:
                    C1668.m5583();
                    if (C0216.m1591() <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۛ۟") ^ i2) * (-113);
                        i4 = ((iM11306 ^ i3) * (-3933)) ^ 1280610562;
                        i5 = 129828627;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۘ᩹") ^ i2) * (-25);
                        i4 = ((iM11306 ^ i3) * 8919) ^ (-1452172234);
                        i5 = 1260582005;
                    }
                    break;
                case 87850130:
                case 1213483446:
                    if (C1977.f7413 > 0) {
                        if (C3722.f13525 <= 0 || C0216.f1393 != 0) {
                            iM11306 = ThreadFactoryC3888.m11306("ۤۡ") ^ i3;
                            i4 = ((iM11306 ^ i2) * 22279) ^ (-1659333072);
                            i5 = 1919598710;
                        } else if (ViewGroupOnHierarchyChangeListenerC1916.m6233() == 0 && C0526.m2437() < 0) {
                            if (ThreadFactoryC3888.f14547 > 0) {
                                if (C10634.f36300 < 0) {
                                    if (C1668.f6641 < 0) {
                                        final AbstractActivityC12483 abstractActivityC12483 = this.f62252;
                                        if (C0278.f1572 > 0) {
                                            final ExecutorService executorService = this.f62253;
                                            if (C3286.m9798() > 0) {
                                                C2124.m6681(new Runnable(this) { // from class: l.ᩴۜۘ

                                                    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
                                                    public final /* synthetic */ C19290 f59095;

                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        AbstractActivityC12483 abstractActivityC12484 = null;
                                                        ExecutorService executorService2 = null;
                                                        int i6 = -1833157005;
                                                        int i7 = C2477.f9839;
                                                        int i8 = C10634.f36300;
                                                        int iM45029 = (C19806.m45029("ۤ֡") + i7) * (-29);
                                                        int i9 = ((iM45029 ^ i8) * 5321) ^ 1209850593;
                                                        int i10 = -2066534360;
                                                        while (true) {
                                                            i6 = ((((i6 ^ i8) * 26759) >> 31) & i9) ^ (iM45029 ^ i10);
                                                            switch (i6) {
                                                                case -2065919555:
                                                                case 476206420:
                                                                    C3286.m9798();
                                                                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                                                                        iM45029 = (i7 - C19806.m45029("᩵ܿ")) * (-119);
                                                                        i9 = ((iM45029 ^ i8) * 20065) ^ (-330699274);
                                                                        i10 = -1404642143;
                                                                    } else {
                                                                        iM45029 = ThreadFactoryC3888.m11306("ۛܽ") ^ i8;
                                                                        i9 = ((iM45029 ^ i7) * 26617) ^ 855479563;
                                                                        i10 = 1962938764;
                                                                    }
                                                                    break;
                                                                case -1884973404:
                                                                case 1894842035:
                                                                    if (C2704.f10408) {
                                                                        iM45029 = (ThreadFactoryC3888.m11306("۠ۧ") + i8) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                                                                        i9 = ((iM45029 ^ i7) * 11899) ^ (-1592418187);
                                                                        i10 = -1378990927;
                                                                    } else {
                                                                        iM45029 = (i7 - C19806.m45029("᩵ܿ")) * (-119);
                                                                        i9 = ((iM45029 ^ i8) * 20065) ^ (-330699274);
                                                                        i10 = -1404642143;
                                                                    }
                                                                    break;
                                                                case -1526139379:
                                                                case -234410181:
                                                                    C0671.m3008();
                                                                    iM45029 = ThreadFactoryC3888.m11306("ۧ᩷") ^ i8;
                                                                    i9 = ((iM45029 ^ i7) * 17419) ^ (-682087690);
                                                                    i10 = -457903272;
                                                                    break;
                                                                case -1135207450:
                                                                case 764639043:
                                                                    if (C1977.f7413 <= 0) {
                                                                        iM45029 = (i7 - C19806.m45029("᩵ܿ")) * (-119);
                                                                        i9 = ((iM45029 ^ i8) * 20065) ^ (-330699274);
                                                                        i10 = -1404642143;
                                                                    } else {
                                                                        iM45029 = (C19806.m45029("֫ܺ") ^ i8) * (-9);
                                                                        i9 = ((iM45029 ^ i7) * (-32625)) ^ 1789756537;
                                                                        i10 = 942252015;
                                                                    }
                                                                    break;
                                                                case -1000115687:
                                                                case 760624991:
                                                                    if (C1148.m4232() <= 0) {
                                                                        iM45029 = C19806.m45029("۬ۜ") ^ i7;
                                                                        i9 = ((iM45029 ^ i8) * 25275) ^ 765541662;
                                                                        i10 = 1817415370;
                                                                    } else {
                                                                        iM45029 = (ThreadFactoryC3888.m11306("ܶ᩶") ^ i7) * 115;
                                                                        i9 = ((iM45029 ^ i8) * 10499) ^ (-382106150);
                                                                        i10 = 1879972664;
                                                                    }
                                                                    break;
                                                                case -829796087:
                                                                case 1885129970:
                                                                    abstractActivityC12484 = abstractActivityC12483;
                                                                    if (C0526.f2219) {
                                                                        iM45029 = (i7 - C19806.m45029("᩵ܿ")) * (-119);
                                                                        i9 = ((iM45029 ^ i8) * 20065) ^ (-330699274);
                                                                        i10 = -1404642143;
                                                                    } else {
                                                                        iM45029 = ThreadFactoryC3888.m11306("ۙ۠") ^ i8;
                                                                        i9 = ((iM45029 ^ i7) * (-28113)) ^ 415865396;
                                                                        i10 = -420742199;
                                                                    }
                                                                    break;
                                                                case -819699926:
                                                                case 2118557151:
                                                                    executorService2 = executorService;
                                                                    if (C0050.m946() <= 0) {
                                                                        iM45029 = C19806.m45029("۬ۜ") ^ i7;
                                                                        i9 = ((iM45029 ^ i8) * 25275) ^ 765541662;
                                                                        i10 = 1817415370;
                                                                    } else {
                                                                        iM45029 = ThreadFactoryC3888.m11306("ۜ᩵") ^ i7;
                                                                        i9 = ((iM45029 ^ i8) * (-27483)) ^ 1492663734;
                                                                        i10 = 275435423;
                                                                    }
                                                                    break;
                                                                case -579762947:
                                                                case 959012918:
                                                                    if (C1377.m4833() != 0) {
                                                                        iM45029 = C19806.m45029("۬ۜ") ^ i7;
                                                                        i9 = ((iM45029 ^ i8) * 25275) ^ 765541662;
                                                                        i10 = 1817415370;
                                                                    } else {
                                                                        iM45029 = C19806.m45029("ۤۙ") ^ i8;
                                                                        i9 = ((iM45029 ^ i7) * 28625) ^ (-1168110241);
                                                                        i10 = 1396499570;
                                                                    }
                                                                    break;
                                                                case -331824020:
                                                                case 1612583107:
                                                                    if (C10634.m26820()) {
                                                                        iM45029 = ThreadFactoryC3888.m11306("ۧ᩷") ^ i8;
                                                                        i9 = ((iM45029 ^ i7) * 17419) ^ (-682087690);
                                                                        i10 = -457903272;
                                                                    } else {
                                                                        iM45029 = (C19806.m45029("ܺ۬") ^ i7) * (-21);
                                                                        i9 = ((iM45029 ^ i8) * 4987) ^ 1373886051;
                                                                        i10 = -423712021;
                                                                    }
                                                                    break;
                                                                case -278668167:
                                                                case 746824204:
                                                                    if (C0671.f2816 != 0) {
                                                                        iM45029 = ThreadFactoryC3888.m11306("ۛܽ") ^ i8;
                                                                        i9 = ((iM45029 ^ i7) * 26617) ^ 855479563;
                                                                        i10 = 1962938764;
                                                                    } else {
                                                                        iM45029 = (ThreadFactoryC3888.m11306("ܿ᩷") + i7) * 75;
                                                                        i9 = ((iM45029 ^ i8) * (-19391)) ^ 58869068;
                                                                        i10 = -214572927;
                                                                    }
                                                                    break;
                                                                case 280626770:
                                                                case 1616586344:
                                                                    C19290.m44280(this.f59095, abstractActivityC12484, executorService2);
                                                                    break;
                                                                case 377128402:
                                                                case 1934938251:
                                                                    if (C1398.f5802 <= 0) {
                                                                        iM45029 = ThreadFactoryC3888.m11306("ۛܽ") ^ i8;
                                                                        i9 = ((iM45029 ^ i7) * 26617) ^ 855479563;
                                                                        i10 = 1962938764;
                                                                    } else {
                                                                        iM45029 = C19806.m45029("ᩴۖ") ^ i8;
                                                                        i9 = ((iM45029 ^ i7) * 15743) ^ 467763308;
                                                                        i10 = 1348737776;
                                                                    }
                                                                    break;
                                                                case 1508891781:
                                                                case 2003555855:
                                                                    if (RunnableC1564.f6300) {
                                                                        iM45029 = ThreadFactoryC3888.m11306("ۛܽ") ^ i8;
                                                                        i9 = ((iM45029 ^ i7) * 26617) ^ 855479563;
                                                                        i10 = 1962938764;
                                                                    } else {
                                                                        iM45029 = (C19806.m45029("۫ᩳ") ^ i7) * (-55);
                                                                        i9 = ((iM45029 ^ i8) * (-6563)) ^ (-674188670);
                                                                        i10 = 943038539;
                                                                    }
                                                                    break;
                                                                case 1538326339:
                                                                case 1926781234:
                                                                    C19806.m45024();
                                                                    C1398.m4895();
                                                                    break;
                                                                case 1764756892:
                                                                case 1995487493:
                                                                    C1189.m4368();
                                                                    if (C2788.f10625 >= 0) {
                                                                        iM45029 = ThreadFactoryC3888.m11306("ۛܽ") ^ i8;
                                                                        i9 = ((iM45029 ^ i7) * 26617) ^ 855479563;
                                                                        i10 = 1962938764;
                                                                    } else {
                                                                        iM45029 = ThreadFactoryC3888.m11306("ۧ᩷") ^ i8;
                                                                        i9 = ((iM45029 ^ i7) * 17419) ^ (-682087690);
                                                                        i10 = -457903272;
                                                                    }
                                                                    break;
                                                                default:
                                                                    if (C1937.f7317 < 0) {
                                                                        iM45029 = ThreadFactoryC3888.m11306("ۧ᩷") ^ i8;
                                                                        i9 = ((iM45029 ^ i7) * 17419) ^ (-682087690);
                                                                        i10 = -457903272;
                                                                    } else {
                                                                        iM45029 = C19806.m45029("᩵ۧ") ^ i7;
                                                                        i9 = ((iM45029 ^ i8) * (-11895)) ^ (-2117256711);
                                                                        i10 = -717566991;
                                                                    }
                                                                    break;
                                                            }
                                                            return;
                                                        }
                                                    }

                                                    {
                                                        int i6 = 64954698;
                                                        int i7 = MenuItemOnMenuItemClickListenerC3244.f12064;
                                                        int i8 = C2788.f10625;
                                                        int iM45029 = C19806.m45029("᩵۟") ^ i7;
                                                        int i9 = ((iM45029 ^ i8) * (-1071)) ^ 378905500;
                                                        int i10 = 1997670660;
                                                        while (true) {
                                                            i6 = ((((i6 ^ i8) * (-20883)) >> 31) & i9) ^ (iM45029 ^ i10);
                                                            switch (i6) {
                                                                case -2066869382:
                                                                case -863285805:
                                                                    C10634.m26820();
                                                                    C10634.m26820();
                                                                    throw new RuntimeException();
                                                                case -2026180409:
                                                                case 1532963677:
                                                                    C1937.m6279();
                                                                    if (RunnableC0195.f1321 >= 0) {
                                                                        iM45029 = ThreadFactoryC3888.m11306("֡ܺ") ^ i7;
                                                                        i9 = ((iM45029 ^ i8) * 30457) ^ 109317249;
                                                                        i10 = -465422678;
                                                                    } else {
                                                                        iM45029 = C19806.m45029("ᩳܰ") ^ i8;
                                                                        i9 = ((iM45029 ^ i7) * 12957) ^ (-1020336475);
                                                                        i10 = 426155032;
                                                                    }
                                                                    break;
                                                                case -2023650066:
                                                                case -271830554:
                                                                    return;
                                                                case -1686048358:
                                                                case 1861977695:
                                                                    if (C1189.m4368() <= 0) {
                                                                        iM45029 = (i8 - C19806.m45029("ۖ᩺")) * (-99);
                                                                        i9 = ((iM45029 ^ i7) * 32337) ^ (-1588357385);
                                                                        i10 = 531133623;
                                                                    } else {
                                                                        iM45029 = (C19806.m45029("֫ۢ") + i8) * 61;
                                                                        i9 = ((iM45029 ^ i7) * (-19249)) ^ (-986657505);
                                                                        i10 = 134651843;
                                                                    }
                                                                    break;
                                                                case -1599427638:
                                                                case -675973955:
                                                                    if (C1398.f5802 <= 0) {
                                                                        iM45029 = (i8 - C19806.m45029("ۖ᩺")) * (-99);
                                                                        i9 = ((iM45029 ^ i7) * 32337) ^ (-1588357385);
                                                                        i10 = 531133623;
                                                                    } else {
                                                                        iM45029 = ThreadFactoryC3888.m11306("ܿܿ") ^ i8;
                                                                        i9 = ((iM45029 ^ i7) * (-15263)) ^ (-593093677);
                                                                        i10 = 194172190;
                                                                    }
                                                                    break;
                                                                case -1543642799:
                                                                case 1639918449:
                                                                    if (C2124.f7782 <= 0) {
                                                                        iM45029 = (i8 - C19806.m45029("ۖ᩺")) * (-99);
                                                                        i9 = ((iM45029 ^ i7) * 32337) ^ (-1588357385);
                                                                        i10 = 531133623;
                                                                    } else {
                                                                        iM45029 = C19806.m45029("ܰۖ") ^ i8;
                                                                        i9 = ((iM45029 ^ i7) * 3015) ^ 322894571;
                                                                        i10 = -1093596749;
                                                                    }
                                                                    break;
                                                                case -1327975958:
                                                                case 326269018:
                                                                    if (C1148.m4232() <= 0) {
                                                                        iM45029 = (C19806.m45029("۫᩵") ^ i7) * (-101);
                                                                        i9 = ((iM45029 ^ i8) * (-4757)) ^ 1206428218;
                                                                        i10 = 1650412064;
                                                                    } else {
                                                                        iM45029 = (C19806.m45029("᩻᩷") + i7) * 99;
                                                                        i9 = ((iM45029 ^ i8) * (-17349)) ^ (-1288220880);
                                                                        i10 = -560535613;
                                                                    }
                                                                    break;
                                                                case -1098579913:
                                                                case -232789702:
                                                                    if (C0050.m946() <= 0) {
                                                                        iM45029 = (C19806.m45029("᩶֡") ^ i7) * 17;
                                                                        i9 = ((iM45029 ^ i8) * 31815) ^ (-1484380209);
                                                                        i10 = -740869910;
                                                                    } else {
                                                                        iM45029 = C19806.m45029("ܰۗ") ^ i7;
                                                                        i9 = ((iM45029 ^ i8) * (-6793)) ^ (-1056678612);
                                                                        i10 = -642249602;
                                                                    }
                                                                    break;
                                                                case -883740344:
                                                                case 2025520238:
                                                                    if (C0526.f2219) {
                                                                        iM45029 = C19806.m45029("ᩳܰ") ^ i8;
                                                                        i9 = ((iM45029 ^ i7) * 12957) ^ (-1020336475);
                                                                        i10 = 426155032;
                                                                    } else {
                                                                        iM45029 = (i7 - ThreadFactoryC3888.m11306("ۚ᩺")) * (-51);
                                                                        i9 = ((iM45029 ^ i8) * (-8871)) ^ 632441813;
                                                                        i10 = 1329111674;
                                                                    }
                                                                    break;
                                                                case -703387719:
                                                                case 141541502:
                                                                    this.f59095 = this;
                                                                    if (C7105.f23796 >= 0) {
                                                                        iM45029 = (C19806.m45029("᩶֡") ^ i7) * 17;
                                                                        i9 = ((iM45029 ^ i8) * 31815) ^ (-1484380209);
                                                                        i10 = -740869910;
                                                                    } else {
                                                                        iM45029 = C19806.m45029("᩶ۚ") ^ i8;
                                                                        i9 = ((iM45029 ^ i7) * (-24305)) ^ 1134308539;
                                                                        i10 = -962614872;
                                                                    }
                                                                    break;
                                                                case -562243544:
                                                                case -177352934:
                                                                    if (C19806.f63586) {
                                                                        iM45029 = (C19806.m45029("۫᩵") ^ i7) * (-101);
                                                                        i9 = ((iM45029 ^ i8) * (-4757)) ^ 1206428218;
                                                                        i10 = 1650412064;
                                                                    } else {
                                                                        iM45029 = C19806.m45029("ۤܶ") ^ i8;
                                                                        i9 = ((iM45029 ^ i7) * (-2893)) ^ 133089419;
                                                                        i10 = -2123722573;
                                                                    }
                                                                    break;
                                                                case -409942467:
                                                                case 1161860772:
                                                                    C2788.m8472();
                                                                    iM45029 = C19806.m45029("ᩳܰ") ^ i8;
                                                                    i9 = ((iM45029 ^ i7) * 12957) ^ (-1020336475);
                                                                    i10 = 426155032;
                                                                    break;
                                                                case -65340395:
                                                                case 1417979575:
                                                                    if (C1066.f4915 <= 0) {
                                                                        iM45029 = (C19806.m45029("᩶֡") ^ i7) * 17;
                                                                        i9 = ((iM45029 ^ i8) * 31815) ^ (-1484380209);
                                                                        i10 = -740869910;
                                                                    } else {
                                                                        iM45029 = ThreadFactoryC3888.m11306("᩹ܶ") ^ i7;
                                                                        i9 = ((iM45029 ^ i8) * (-28533)) ^ (-256889060);
                                                                        i10 = 643867268;
                                                                    }
                                                                    break;
                                                                case 1601262911:
                                                                case 1657064182:
                                                                    C1398.m4895();
                                                                    if (!C1377.f5749) {
                                                                        iM45029 = ThreadFactoryC3888.m11306("֡ܺ") ^ i7;
                                                                        i9 = ((iM45029 ^ i8) * 30457) ^ 109317249;
                                                                        i10 = -465422678;
                                                                    } else {
                                                                        iM45029 = (C19806.m45029("۫᩵") ^ i7) * (-101);
                                                                        i9 = ((iM45029 ^ i8) * (-4757)) ^ 1206428218;
                                                                        i10 = 1650412064;
                                                                    }
                                                                    break;
                                                                case 1799292611:
                                                                case 1890492825:
                                                                    if (C1377.f5749) {
                                                                        iM45029 = (i7 - C19806.m45029("᩺᩵")) * 39;
                                                                        i9 = ((iM45029 ^ i8) * (-18099)) ^ (-345943939);
                                                                        i10 = 1365592153;
                                                                    } else {
                                                                        iM45029 = (C19806.m45029("᩶֡") ^ i7) * 17;
                                                                        i9 = ((iM45029 ^ i8) * 31815) ^ (-1484380209);
                                                                        i10 = -740869910;
                                                                    }
                                                                    break;
                                                                default:
                                                                    if (!RunnableC1564.f6300) {
                                                                        iM45029 = ThreadFactoryC3888.m11306("֡ܺ") ^ i7;
                                                                        i9 = ((iM45029 ^ i8) * 30457) ^ 109317249;
                                                                        i10 = -465422678;
                                                                    } else {
                                                                        iM45029 = (i8 - C19806.m45029("ۖ᩺")) * (-99);
                                                                        i9 = ((iM45029 ^ i7) * 32337) ^ (-1588357385);
                                                                        i10 = 531133623;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    }
                                                }, 800L);
                                            }
                                            break;
                                        }
                                    }
                                    iM11306 = ThreadFactoryC3888.m11306("ۗۡ") ^ i3;
                                    i4 = ((iM11306 ^ i2) * (-9625)) ^ (-1229395689);
                                    i5 = 1118754366;
                                }
                            }
                            iM11306 = (ThreadFactoryC3888.m11306("ۨۛ") + i3) * (-127);
                            i4 = ((iM11306 ^ i2) * 30779) ^ (-1310812367);
                            i5 = -2088423210;
                        }
                        break;
                    }
                    iM11306 = (ThreadFactoryC3888.m11306("ۛ۟") ^ i2) * (-113);
                    i4 = ((iM11306 ^ i3) * (-3933)) ^ 1280610562;
                    i5 = 129828627;
                    break;
                default:
                    C1460.m5050();
                    if (C2249.f8050 < 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۨۛ") + i3) * (-127);
                        i4 = ((iM11306 ^ i2) * 30779) ^ (-1310812367);
                        i5 = -2088423210;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۤۡ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 22279) ^ (-1659333072);
                        i5 = 1919598710;
                    }
                    break;
            }
            return;
        }
    }

    public C19290(C20701 c20701, AbstractActivityC12483 abstractActivityC12483, ExecutorService executorService, C11986 c11986) {
        ArrayList arrayList = null;
        int i = -305604653;
        int i2 = AbstractC0464.f2088;
        int i3 = C0050.f912;
        this.f62254 = c20701;
        this.f62252 = abstractActivityC12483;
        this.f62253 = executorService;
        this.f62256 = c11986;
        int iM45029 = (i2 - C19806.m45029("᩹ᩳ")) * (-79);
        int i4 = ((iM45029 ^ i3) * 13189) ^ (-1982032879);
        int i5 = -676264608;
        while (true) {
            i = (iM45029 ^ i5) ^ (i4 & (((i ^ i3) * (-10727)) >> 31));
            switch (i) {
                case -1815738738:
                case -1522805524:
                    if (C3743.f13569) {
                        iM45029 = (C19806.m45029("ܶۤ") + i3) * 19;
                        i4 = ((iM45029 ^ i2) * (-9145)) ^ 1671225537;
                        i5 = 1350770175;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۢۜ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 12489) ^ (-692737982);
                        i5 = -85276756;
                    }
                    break;
                case -1572027195:
                case -501996054:
                    RunnableC1895.m6170();
                    C1977.m6356();
                    throw new RuntimeException();
                case -1568101199:
                case -286560867:
                    C1419.m4973();
                    if (C1398.f5802 > 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۖۢ") ^ i2) * 15;
                        i4 = ((iM45029 ^ i3) * (-30391)) ^ 327909461;
                        i5 = -1989315116;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܿᩴ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 21261) ^ (-446857294);
                        i5 = -1371650276;
                    }
                    break;
                case -1532426991:
                case 1771918482:
                    C3722.m10894();
                    if (C2477.f9839 > 0) {
                        iM45029 = C19806.m45029("۟۬") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-3445)) ^ 401799922;
                        i5 = 1678405359;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܿᩴ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 21261) ^ (-446857294);
                        i5 = -1371650276;
                    }
                    break;
                case -1517262957:
                case 803374728:
                    this.f62255 = arrayList;
                    if (RunnableC1564.f6300) {
                        iM45029 = ThreadFactoryC3888.m11306("ۢۜ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 12489) ^ (-692737982);
                        i5 = -85276756;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֡۠") + i3) * (-41);
                        i4 = ((iM45029 ^ i2) * (-11509)) ^ 682110067;
                        i5 = -361885955;
                    }
                    break;
                case -1423163305:
                case -99140602:
                    C10634.m26820();
                    iM45029 = ThreadFactoryC3888.m11306("ܿᩴ") ^ i3;
                    i4 = ((iM45029 ^ i2) * 21261) ^ (-446857294);
                    i5 = -1371650276;
                    break;
                case -1413621699:
                case -1159812479:
                    if (C2642.m8171() != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۢۜ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 12489) ^ (-692737982);
                        i5 = -85276756;
                    } else {
                        iM45029 = C19806.m45029("ۜ᩶") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-12601)) ^ 79935113;
                        i5 = -34455634;
                    }
                    break;
                case -984866064:
                case -636957966:
                    if (C0629.f2722 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۜᩳ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 11707) ^ (-905129872);
                        i5 = -1569364938;
                    } else {
                        iM45029 = C19806.m45029("ۢ۟") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-12963)) ^ (-521831657);
                        i5 = -44449802;
                    }
                    break;
                case -947012863:
                case 1083511944:
                    if (C1875.m6086() != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۜᩳ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 11707) ^ (-905129872);
                        i5 = -1569364938;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۡ᩷") + i2) * (-57);
                        i4 = ((iM45029 ^ i3) * (-8347)) ^ 1599338555;
                        i5 = 750353932;
                    }
                    break;
                case -138830852:
                case -22418495:
                    if (C1189.m4368() <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۖۢ") ^ i2) * 15;
                        i4 = ((iM45029 ^ i3) * (-30391)) ^ 327909461;
                        i5 = -1989315116;
                    } else {
                        iM45029 = C19806.m45029("֡۟") ^ i2;
                        i4 = ((iM45029 ^ i3) * 28361) ^ (-1731790749);
                        i5 = 418846449;
                    }
                    break;
                case 192564024:
                case 1798818581:
                    if (C0671.f2816 != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۢۜ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 12489) ^ (-692737982);
                        i5 = -85276756;
                    } else {
                        iM45029 = C19806.m45029("ۗܺ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 20581) ^ (-568850548);
                        i5 = 1771911351;
                    }
                    break;
                case 472502836:
                case 2104927943:
                    if (C1977.f7413 <= 0) {
                        iM45029 = C19806.m45029("۟۬") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-3445)) ^ 401799922;
                        i5 = 1678405359;
                    } else {
                        iM45029 = C19806.m45029("ۡܿ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-12381)) ^ (-1817087421);
                        i5 = 1196428965;
                    }
                    break;
                case 632781335:
                case 908882904:
                    if (C0278.f1572 <= 0) {
                        iM45029 = C19806.m45029("۟۬") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-3445)) ^ 401799922;
                        i5 = 1678405359;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۗۢ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 16787) ^ 981948225;
                        i5 = -490944691;
                    }
                    break;
                case 662585491:
                case 969444803:
                    this.f62251 = true;
                    return;
                case 673197281:
                case 971376976:
                    if (C1066.m4023() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۜᩳ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 11707) ^ (-905129872);
                        i5 = -1569364938;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܿᩴ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 21261) ^ (-446857294);
                        i5 = -1371650276;
                    }
                    break;
                default:
                    arrayList = new ArrayList();
                    if (C1419.m4973()) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۖۢ") ^ i2) * 15;
                        i4 = ((iM45029 ^ i3) * (-30391)) ^ 327909461;
                        i5 = -1989315116;
                    } else {
                        iM45029 = C19806.m45029("᩺۫") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-11309)) ^ (-1738934675);
                        i5 = -1776195424;
                    }
                    break;
            }
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        int iM45029;
        int i;
        C17485 c17485 = null;
        Iterator itM10563 = null;
        C20701 c20701 = null;
        TranslationEngine translationEngine = null;
        ArrayList arrayList = null;
        int i2 = 1554916424;
        int i3 = ThreadFactoryC3888.f14547;
        int i4 = C1668.f6641;
        int iM11306 = ThreadFactoryC3888.m11306("ۢۖ") ^ i4;
        int i5 = ((iM11306 ^ i3) * 15159) ^ (-2069108555);
        int i6 = 1597786396;
        while (true) {
            int i7 = iM11306 ^ i6;
            while (true) {
                i2 = ((((i2 ^ i3) * 8621) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2137021880:
                    case -88203477:
                        if (C0216.f1393 == 0) {
                            iM11306 = ThreadFactoryC3888.m11306("ܽᩳ") ^ i3;
                            i5 = ((iM11306 ^ i4) * 8751) ^ (-1829609756);
                            i6 = 1558645983;
                        } else {
                            iM11306 = (C19806.m45029("ܿܺ") ^ i4) * 81;
                            i5 = ((iM11306 ^ i3) * 11597) ^ (-59020692);
                            i6 = 446333988;
                        }
                        break;
                    case -1810865370:
                    case 1332606247:
                        if (C1460.f5948 < 0) {
                            iM11306 = ThreadFactoryC3888.m11306("ܶۚ") ^ i3;
                            i5 = ((iM11306 ^ i4) * (-13827)) ^ 1262346341;
                            i6 = -2056531022;
                        } else {
                            iM11306 = (C19806.m45029("֡֫") ^ i3) * 99;
                            i5 = ((iM11306 ^ i4) * (-18909)) ^ (-1384689241);
                            i6 = -265676508;
                        }
                        break;
                    case -1739910418:
                    case -87142954:
                        C0216.m1591();
                        C0817.m3399();
                        iM11306 = (C19806.m45029("ܿܺ") ^ i4) * 81;
                        i5 = ((iM11306 ^ i3) * 11597) ^ (-59020692);
                        i6 = 446333988;
                        break;
                    case -1521143789:
                    case 250093646:
                        if (!C0797.f3386) {
                            iM11306 = (ThreadFactoryC3888.m11306("᩻᩺") + i4) * (-61);
                            i5 = ((iM11306 ^ i3) * 12661) ^ 1473548304;
                            i6 = 1596864883;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("֡ܳ") ^ i3;
                            i5 = ((iM11306 ^ i4) * 3961) ^ (-1296726014);
                            i6 = -688087554;
                        }
                        break;
                    case -1178235639:
                    case 741060751:
                        if (C2249.f8050 < 0) {
                            iM11306 = (C19806.m45029("ܳᩳ") ^ i3) * (-27);
                            i5 = ((iM11306 ^ i4) * (-25269)) ^ (-475757516);
                            i6 = -1815108195;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("֡ܳ") ^ i3;
                            i5 = ((iM11306 ^ i4) * 3961) ^ (-1296726014);
                            i6 = -688087554;
                        }
                        break;
                    case -1018630988:
                    case -754401326:
                        if (C3722.f13525 > 0) {
                            iM11306 = (i4 - C19806.m45029("ۡܺ")) * 29;
                            i5 = ((iM11306 ^ i3) * (-6163)) ^ (-1975929431);
                            i6 = -738856106;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("ܽᩳ") ^ i3;
                            i5 = ((iM11306 ^ i4) * 8751) ^ (-1829609756);
                            i6 = 1558645983;
                        }
                        break;
                    case -934905417:
                    case 643883419:
                        c17485 = this.f12806;
                        if (c17485 == null) {
                            iM11306 = (i3 - ThreadFactoryC3888.m11306("ۧ᩸")) * 29;
                            i5 = ((iM11306 ^ i4) * (-23621)) ^ 415064975;
                            i6 = -1164640581;
                        } else {
                            iM11306 = (C19806.m45029("᩶ۢ") ^ i4) * (-69);
                            i5 = ((iM11306 ^ i3) * (-15771)) ^ 502011;
                            i6 = 394773824;
                        }
                        break;
                    case -860035115:
                    case 2103028385:
                        break;
                    case -689954235:
                    case 1177358185:
                        translationEngine = (TranslationEngine) C0278.m1776(itM10563);
                        if (C1189.f5284 > 0) {
                            iM11306 = (i3 - ThreadFactoryC3888.m11306("۬᩸")) * 37;
                            i5 = ((iM11306 ^ i4) * (-5519)) ^ 1752833034;
                            i6 = 1923627926;
                        } else {
                            iM11306 = (C19806.m45029("ܿܺ") ^ i4) * 81;
                            i5 = ((iM11306 ^ i3) * 11597) ^ (-59020692);
                            i6 = 446333988;
                        }
                        break;
                    case -600311164:
                    case 1884121129:
                        if (C0671.f2816 == 0) {
                            iM11306 = (i4 - C19806.m45029("ۛ᩵")) * (-105);
                            i5 = ((iM11306 ^ i3) * 27423) ^ (-570418040);
                            i6 = -1852112268;
                        } else {
                            iM11306 = (C19806.m45029("֡֫") ^ i3) * 99;
                            i5 = ((iM11306 ^ i4) * (-18909)) ^ (-1384689241);
                            i6 = -265676508;
                        }
                        break;
                    case -318793672:
                    case -191376268:
                        C20701.m46550(c20701);
                        break;
                    case -308754369:
                    case 783916942:
                        arrayList = c20701.f67320;
                        if (C1025.f4800 < 0) {
                            iM11306 = ThreadFactoryC3888.m11306("ۛۨ") ^ i3;
                            i5 = ((iM11306 ^ i4) * (-24471)) ^ (-1439610017);
                            i6 = 189146169;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("ܽᩳ") ^ i3;
                            i5 = ((iM11306 ^ i4) * 8751) ^ (-1829609756);
                            i6 = 1558645983;
                        }
                        break;
                    case -150530912:
                    case 1030358604:
                        C19806.m45024();
                        break;
                    case -81385704:
                    case 1628275251:
                        if (C0671.m3008() < 0) {
                            iM11306 = ThreadFactoryC3888.m11306("ܶ۬") ^ i4;
                            i5 = ((iM11306 ^ i3) * 24547) ^ 1934889622;
                            i6 = -1178364569;
                        } else {
                            iM11306 = (i4 - ThreadFactoryC3888.m11306("ۡܽ")) * (-51);
                            i5 = ((iM11306 ^ i3) * (-20179)) ^ 963013992;
                            i6 = -827670629;
                        }
                        break;
                    case 319233126:
                    case 2108925751:
                        boolean zM5348 = RunnableC1564.m5348(itM10563);
                        C20701 c20702 = this.f62254;
                        if (zM5348) {
                            iM45029 = C19806.m45029("᩺ܶ") ^ i4;
                            i5 = ((iM45029 ^ i3) * (-29135)) ^ (-1464258661);
                            i = -782968822;
                        } else {
                            iM45029 = (C19806.m45029("ۜۧ") ^ i3) * q.h;
                            i5 = ((iM45029 ^ i4) * (-27045)) ^ 450814280;
                            i = -622262617;
                        }
                        i7 = iM45029 ^ i;
                        c20701 = c20702;
                        break;
                    case 470054556:
                    case 621068659:
                        C0216.m1591();
                        if (C1937.f7317 < 0) {
                            iM11306 = (C19806.m45029("֡֫") ^ i3) * 99;
                            i5 = ((iM11306 ^ i4) * (-18909)) ^ (-1384689241);
                            i6 = -265676508;
                            break;
                        }
                        iM11306 = (C19806.m45029("ܿܺ") ^ i4) * 81;
                        i5 = ((iM11306 ^ i3) * 11597) ^ (-59020692);
                        i6 = 446333988;
                        break;
                    case 766974843:
                    case 1941936924:
                        itM10563 = C3577.m10563(this.f62255);
                        iM11306 = C19806.m45029("᩹۬") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-25609)) ^ (-2029051415);
                        i6 = 1164422641;
                        break;
                    case 991769795:
                    case 1001331073:
                        if (!c17485.m40693()) {
                            iM11306 = (i3 - ThreadFactoryC3888.m11306("ۧ᩸")) * 29;
                            i5 = ((iM11306 ^ i4) * (-23621)) ^ 415064975;
                            i6 = -1164640581;
                            break;
                        }
                        iM11306 = (i4 - C19806.m45029("֫֨")) * 95;
                        i5 = ((iM11306 ^ i3) * (-30749)) ^ (-305279398);
                        i6 = 1258499039;
                        break;
                    case 1562735952:
                    case 2068223977:
                        if (C3577.f13150 < 0) {
                            AbstractActivityC12483 abstractActivityC12483 = this.f62252;
                            C11986 c11986 = this.f62256;
                            if (!ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                                iM11306 = ThreadFactoryC3888.m11306("ܽᩳ") ^ i3;
                                i5 = ((iM11306 ^ i4) * 8751) ^ (-1829609756);
                                i6 = 1558645983;
                                break;
                            }
                            C3660.m10788(arrayList, new C13146(abstractActivityC12483, c11986, translationEngine));
                            iM11306 = C19806.m45029("᩹۬") ^ i3;
                            i5 = ((iM11306 ^ i4) * (-25609)) ^ (-2029051415);
                            i6 = 1164422641;
                            break;
                            break;
                        }
                        iM11306 = ThreadFactoryC3888.m11306("֡ܳ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 3961) ^ (-1296726014);
                        i6 = -688087554;
                        break;
                    default:
                        C1377.m4833();
                        if (C3660.f13403 < 0) {
                            iM11306 = (i4 - ThreadFactoryC3888.m11306("ۡܽ")) * (-51);
                            i5 = ((iM11306 ^ i3) * (-20179)) ^ 963013992;
                            i6 = -827670629;
                            break;
                        }
                        iM11306 = (C19806.m45029("֡֫") ^ i3) * 99;
                        i5 = ((iM11306 ^ i4) * (-18909)) ^ (-1384689241);
                        i6 = -265676508;
                        break;
                }
                return;
            }
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        this.f62251 = false;
        C0797.m3353(this);
    }
}
