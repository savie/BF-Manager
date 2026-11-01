package l;

import java.util.List;
import java.util.concurrent.ExecutorService;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ܽ᩹ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: GA31 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16924 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List f54113;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static boolean f54114;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean f54115;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized void m39613(List list) {
        f54113 = list;
        boolean z = !C0629.m2899(list);
        if (f54115 != z) {
            f54115 = z;
            C1025.m3864(new RunnableC15554(1));
        }
    }

    static {
        int iM45029;
        int i;
        C9186 c9186 = null;
        int i2 = -87257039;
        int i3 = RunnableC0195.f1321;
        int i4 = C0278.f1572;
        int iM11306 = ThreadFactoryC3888.m11306("ܿۛ") ^ i4;
        int i5 = ((iM11306 ^ i3) * 8405) ^ (-640020649);
        int i6 = -1721989632;
        while (true) {
            int i7 = iM11306 ^ i6;
            C16219 c16219 = null;
            while (true) {
                i2 = ((((i2 ^ i3) * (-32499)) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2122446427:
                    case -55651722:
                        if (C3722.m10894() > 0) {
                            iM45029 = (i4 - C19806.m45029("֨ᩴ")) * 85;
                            i5 = ((iM45029 ^ i3) * 22351) ^ (-1158848066);
                            i = -1151658859;
                            i7 = iM45029 ^ i;
                        } else {
                            iM11306 = (i3 - ThreadFactoryC3888.m11306("ܰ᩸")) * 23;
                            i5 = ((iM11306 ^ i4) * (-28821)) ^ 884245174;
                            i6 = 2019969297;
                        }
                        break;
                    case -2077531621:
                    case -1093814108:
                        if (C2871.m8642()) {
                            iM45029 = (C19806.m45029("ۜ᩵") + i4) * 97;
                            i5 = ((iM45029 ^ i3) * (-14775)) ^ 1415193605;
                            i = 1414997262;
                        } else {
                            iM45029 = (C19806.m45029("ܶۙ") + i3) * 31;
                            i5 = ((iM45029 ^ i4) * (-21397)) ^ 1437084989;
                            i = -273289638;
                        }
                        i7 = iM45029 ^ i;
                        break;
                    case -1166067933:
                    case -669081136:
                        ViewGroupOnHierarchyChangeListenerC1916.m6233();
                        if (C2788.f10625 < 0) {
                            iM11306 = (i3 - ThreadFactoryC3888.m11306("ܰ᩸")) * 23;
                            i5 = ((iM11306 ^ i4) * (-28821)) ^ 884245174;
                            i6 = 2019969297;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("۠ܰ") ^ i4;
                            i5 = ((iM11306 ^ i3) * 8371) ^ 897752580;
                            i6 = -100184909;
                        }
                        break;
                    case -412052604:
                    case 1586175340:
                        C2642.m8171();
                        throw new RuntimeException();
                    case -362502559:
                    case 15707282:
                        C17132.m40025(new C0695());
                        return;
                    case 459891776:
                    case 1931097314:
                        C3535.m10431();
                        if (RunnableC1606.f6488 >= 0) {
                            iM11306 = (i3 - ThreadFactoryC3888.m11306("ܰ᩸")) * 23;
                            i5 = ((iM11306 ^ i4) * (-28821)) ^ 884245174;
                            i6 = 2019969297;
                        }
                        iM45029 = (ThreadFactoryC3888.m11306("ۖ۬") ^ i3) * (-125);
                        i5 = ((iM45029 ^ i4) * 9605) ^ 1162807547;
                        i = -655998241;
                        i7 = iM45029 ^ i;
                        break;
                    case 568133090:
                    case 951399504:
                        c9186 = C3141.f11846;
                        if (C1066.f4915 > 0) {
                            if (C0797.f3386 || C1189.f5284 <= 0) {
                                iM11306 = (C19806.m45029("ۜ᩶") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                i5 = ((iM11306 ^ i4) * 28863) ^ 84334973;
                                i6 = -1301745648;
                                break;
                            } else if (C1066.m4023() > 0) {
                                if (C3660.f13403 >= 0 || C2124.f7782 <= 0) {
                                    iM11306 = (i3 - ThreadFactoryC3888.m11306("ܰ᩸")) * 23;
                                    i5 = ((iM11306 ^ i4) * (-28821)) ^ 884245174;
                                    i6 = 2019969297;
                                } else {
                                    c16219 = new C16219();
                                    if (AbstractC0464.f2088 <= 0) {
                                        iM45029 = (ThreadFactoryC3888.m11306("ۖ۬") ^ i3) * (-125);
                                        i5 = ((iM45029 ^ i4) * 9605) ^ 1162807547;
                                        i = -655998241;
                                    } else {
                                        iM45029 = (C19806.m45029("᩺᩸") ^ i4) * 31;
                                        i5 = ((iM45029 ^ i3) * (-26473)) ^ (-331413478);
                                        i = -917913512;
                                    }
                                    i7 = iM45029 ^ i;
                                }
                                break;
                            }
                        }
                        iM11306 = ThreadFactoryC3888.m11306("۠ܰ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 8371) ^ 897752580;
                        i6 = -100184909;
                        break;
                    case 623835593:
                    case 1482489503:
                        c9186.m44961((InterfaceC10597) c16219);
                        if (C2249.m6915() > 0) {
                            iM45029 = (i3 - C19806.m45029("ۧۘ")) * 93;
                            i5 = ((iM45029 ^ i4) * 10197) ^ 581722514;
                            i = 1849295451;
                            i7 = iM45029 ^ i;
                        } else {
                            iM11306 = (C19806.m45029("ۜ᩶") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                            i5 = ((iM11306 ^ i4) * 28863) ^ 84334973;
                            i6 = -1301745648;
                        }
                        break;
                    case 1959371168:
                    case 2116405134:
                        ExecutorService executorService = C4716.f16636;
                        if (!ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                            iM11306 = ThreadFactoryC3888.m11306("۠ܰ") ^ i4;
                            i5 = ((iM11306 ^ i3) * 8371) ^ 897752580;
                            i6 = -100184909;
                        } else {
                            int i8 = 1;
                            if (C1460.f5948 < 0) {
                                C19806.m45014(executorService, new RunnableC23315(i8));
                                iM45029 = (C19806.m45029("ܶۙ") + i3) * 31;
                                i5 = ((iM45029 ^ i4) * (-21397)) ^ 1437084989;
                                i = -273289638;
                                i7 = iM45029 ^ i;
                            } else {
                                iM11306 = (i3 - ThreadFactoryC3888.m11306("ܰ᩸")) * 23;
                                i5 = ((iM11306 ^ i4) * (-28821)) ^ 884245174;
                                i6 = 2019969297;
                            }
                        }
                        break;
                    default:
                        CallableC1627.m5507();
                        iM11306 = ThreadFactoryC3888.m11306("۠ܰ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 8371) ^ 897752580;
                        i6 = -100184909;
                        break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m39612() throws Throwable {
        boolean z = false;
        Throwable th = null;
        int i = 2071712252;
        int i2 = C2788.f10625;
        int i3 = MenuItemOnMenuItemClickListenerC3244.f12064;
        int iM11306 = ThreadFactoryC3888.m11306("۬ܽ") ^ i2;
        int i4 = ((iM11306 ^ i3) * 17719) ^ 547439778;
        int i5 = 978840974;
        while (true) {
            i = ((((i ^ i3) * 14817) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2028995874:
                case -510091548:
                    if (RunnableC1606.f6488 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܳ۟") ^ i3;
                        i4 = ((iM11306 ^ i2) * 10199) ^ 1880701968;
                        i5 = 1488520987;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۜ۠") + i2) * 59;
                        i4 = ((iM11306 ^ i3) * 28595) ^ (-32569161);
                        i5 = -603852815;
                    }
                    break;
                case -2013694225:
                case -979958107:
                    if (C1189.f5284 <= 0) {
                        iM11306 = (i3 - C19806.m45029("ᩳۚ")) * (-17);
                        i4 = ((iM11306 ^ i2) * 29179) ^ 28014521;
                        i5 = -2122020633;
                    } else {
                        iM11306 = C19806.m45029("ܺ᩸") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-563)) ^ (-1167599383);
                        i5 = 880184908;
                    }
                    break;
                case -1919255735:
                case -858620318:
                    if (C1025.f4800 >= 0) {
                        iM11306 = (i3 - C19806.m45029("ᩳۚ")) * (-17);
                        i4 = ((iM11306 ^ i2) * 29179) ^ 28014521;
                        i5 = -2122020633;
                    } else {
                        iM11306 = (i2 - C19806.m45029("ۨܿ")) * (-63);
                        i4 = ((iM11306 ^ i3) * (-21073)) ^ (-1923291718);
                        i5 = 1121263316;
                    }
                    break;
                case -1910234488:
                case 1088520149:
                    if (C3722.f13525 <= 0) {
                        iM11306 = C19806.m45029("᩸۫") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-32059)) ^ (-426120786);
                        i5 = 1256794914;
                    } else {
                        iM11306 = (i3 - C19806.m45029("۫ܿ")) * (-53);
                        i4 = ((iM11306 ^ i2) * (-22211)) ^ (-643419012);
                        i5 = -1742394928;
                    }
                    break;
                case -1903204199:
                case -1016739849:
                    if (!C2704.f10408) {
                        iM11306 = (i3 - C19806.m45029("ᩳۚ")) * (-17);
                        i4 = ((iM11306 ^ i2) * 29179) ^ 28014521;
                        i5 = -2122020633;
                    } else {
                        iM11306 = C19806.m45029("᩸۫") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-32059)) ^ (-426120786);
                        i5 = 1256794914;
                    }
                    break;
                case -1846243346:
                case 684561583:
                    f54114 = z;
                    return;
                case -1841079985:
                case 1018083251:
                    z = false;
                    iM11306 = (ThreadFactoryC3888.m11306("ۧᩴ") + i2) * 27;
                    i4 = ((iM11306 ^ i3) * 4153) ^ 1945399777;
                    i5 = 1153795156;
                    break;
                case -1551221445:
                case -105122656:
                    if (C7105.f23796 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۢ֫") ^ i2;
                        i4 = ((iM11306 ^ i3) * 32001) ^ (-1890041082);
                        i5 = 378271272;
                    } else {
                        iM11306 = (i3 - C19806.m45029("۫ᩳ")) * 27;
                        i4 = ((iM11306 ^ i2) * (-19919)) ^ 1057759663;
                        i5 = 733236114;
                    }
                    break;
                case -828899593:
                case 669029740:
                    if (C3577.f13150 >= 0) {
                        iM11306 = C19806.m45029("᩸۫") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-32059)) ^ (-426120786);
                        i5 = 1256794914;
                    } else {
                        iM11306 = (i3 - C19806.m45029("۫ᩳ")) * 27;
                        i4 = ((iM11306 ^ i2) * (-19919)) ^ 1057759663;
                        i5 = 733236114;
                    }
                    break;
                case -828493516:
                case 755508086:
                    f54114 = z;
                    return;
                case -794121657:
                case 926005883:
                    RunnableC3388.m10064();
                    RunnableC1606.m5473();
                    return;
                case -729177019:
                case 2058978386:
                    try {
                        m39613(C19125.m43941());
                        iM11306 = (C19806.m45029("ۗۛ") + i2) * 81;
                        i4 = ((iM11306 ^ i3) * (-9707)) ^ (-1510117709);
                        i5 = 2118369006;
                    } catch (Exception unused) {
                        iM11306 = C19806.m45029("᩶ᩳ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 14521) ^ 1227275453;
                        i5 = 821417188;
                    } catch (Throwable th2) {
                        th = th2;
                        iM11306 = ThreadFactoryC3888.m11306("᩹ۡ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 2521) ^ 1722525048;
                        i5 = -1619580681;
                    }
                    break;
                case -705185487:
                case 1047922376:
                    f54114 = z;
                    throw th;
                case -499892233:
                case 51100045:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۢ֫") ^ i2;
                        i4 = ((iM11306 ^ i3) * 32001) ^ (-1890041082);
                        i5 = 378271272;
                    } else {
                        iM11306 = (C19806.m45029("ۡܿ") ^ i2) * 101;
                        i4 = ((iM11306 ^ i3) * 14689) ^ 1399817687;
                        i5 = 1692491437;
                    }
                    break;
                case -326154763:
                case 777615016:
                    f54114 = true;
                    if (C0526.f2219) {
                        iM11306 = (i3 - C19806.m45029("ᩳۚ")) * (-17);
                        i4 = ((iM11306 ^ i2) * 29179) ^ 28014521;
                        i5 = -2122020633;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۚۤ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 25643) ^ 16079171;
                        i5 = -1576437904;
                    }
                    break;
                case -273032567:
                case 185368059:
                    if (f54114) {
                        iM11306 = ThreadFactoryC3888.m11306("۟᩷") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-24733)) ^ (-1642006393);
                        i5 = -208164785;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ᩴۤ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 26567) ^ (-1677075990);
                        i5 = 962762195;
                    }
                    break;
                case 35311333:
                case 85247917:
                    if (C0526.f2219) {
                        iM11306 = (i3 - C19806.m45029("ᩳۚ")) * (-17);
                        i4 = ((iM11306 ^ i2) * 29179) ^ 28014521;
                        i5 = -2122020633;
                    } else {
                        iM11306 = (C19806.m45029("᩻֨") + i3) * 71;
                        i4 = ((iM11306 ^ i2) * (-29093)) ^ 1566327461;
                        i5 = 635648405;
                    }
                    break;
                case 159738540:
                case 1385517696:
                    return;
                case 415216491:
                case 2097701801:
                    if (C2332.f8260) {
                        iM11306 = (C19806.m45029("᩺ۨ") ^ i3) * (-63);
                        i4 = ((iM11306 ^ i2) * 23367) ^ (-717742811);
                        i5 = 335897752;
                    } else {
                        iM11306 = (i3 - C19806.m45029("ᩳۚ")) * (-17);
                        i4 = ((iM11306 ^ i2) * 29179) ^ 28014521;
                        i5 = -2122020633;
                    }
                    break;
                case 848973489:
                case 1954146646:
                    if (C2871.f10837 >= 0) {
                        iM11306 = (i3 - C19806.m45029("۫ᩳ")) * 27;
                        i4 = ((iM11306 ^ i2) * (-19919)) ^ 1057759663;
                        i5 = 733236114;
                    } else {
                        iM11306 = C19806.m45029("ܽ۟") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-32499)) ^ (-1838306163);
                        i5 = 654017562;
                    }
                    break;
                case 1631480397:
                case 1957741377:
                    if (C0817.f3443) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܶܶ") + i2) * (-111);
                        i4 = ((iM11306 ^ i3) * (-2131)) ^ (-142739024);
                        i5 = -1289732738;
                    } else {
                        iM11306 = C19806.m45029("᩸۫") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-32059)) ^ (-426120786);
                        i5 = 1256794914;
                    }
                    break;
                default:
                    C1066.m4023();
                    C0629.m2907();
                    iM11306 = (i3 - C19806.m45029("۫ᩳ")) * 27;
                    i4 = ((iM11306 ^ i2) * (-19919)) ^ 1057759663;
                    i5 = 733236114;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m39614() {
        return f54115;
    }
}
