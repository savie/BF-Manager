package l;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.IBinder;
import android.view.View;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ܿ᩺ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: F5X0 */
/* JADX INFO: loaded from: classes4.dex */
public class ServiceC17650 extends Service implements View.OnClickListener {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static String f56094 = "";

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static String f56095;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static C6037 f56096;

    /* JADX INFO: renamed from: ᩶ܽۛ, reason: not valid java name and contains not printable characters */
    private static final short[] f56097 = {2468, -17657, -17644, -17643, -17659, -9102, -10804, -10495, 13150, 15503, 13508, -17625, -17627, -17614, -17617, -17623, -17624, -17607, -17621, -17614, -17607, -17627, -17622, -17623, -17611, -17629, -17607, -17612, -17629, -17611, -17623, -17613, -17612, -17627, -17629, -17607, -17609, -17613, -17629, -17612, -17617, -17629, -17612, 6362, -31646, -31643, -31646, -31617};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C20013 f56098;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C6037 f56099;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final BroadcastReceiver f56100;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public BinderC12712 f56101;

    /* JADX WARN: Code duplicated, block: B:44:0x0108 A[PHI: r1 r10
      0x0108: PHI (r1v4 int) = (r1v2 int), (r1v2 int), (r1v2 int), (r1v2 int), (r1v8 int) binds: [B:42:0x00f0, B:30:0x00a2, B:23:0x0063, B:21:0x0059, B:28:0x009a] A[DONT_GENERATE, DONT_INLINE]
      0x0108: PHI (r10v7 java.lang.String) = 
      (r10v4 java.lang.String)
      (r10v3 java.lang.String)
      (r10v3 java.lang.String)
      (r10v3 java.lang.String)
      (r10v3 java.lang.String)
     binds: [B:42:0x00f0, B:30:0x00a2, B:23:0x0063, B:21:0x0059, B:28:0x009a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x01c9 A[PHI: r7
      0x01c9: PHI (r7v5 android.content.Intent) = (r7v4 android.content.Intent), (r7v6 android.content.Intent) binds: [B:63:0x01c7, B:38:0x00d2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:72:0x0222  */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int iM11306;
        int i;
        String strM30993 = null;
        int i2 = 0;
        int i3 = -1972706971;
        int i4 = C1937.f7317;
        int i5 = C2788.f10625;
        int iM11307 = (ThreadFactoryC3888.m11306("۫ۨ") + i5) * 89;
        int i6 = ((iM11307 ^ i4) * 9391) ^ 277578318;
        int i7 = 526841976;
        while (true) {
            int i8 = iM11307 ^ i7;
            Intent intent = null;
            while (true) {
                i3 = ((((i3 ^ i4) * 21783) >> 31) & i6) ^ i8;
                switch (i3) {
                    case -2073302984:
                    case -1473386661:
                        if (C0216.m1591() <= 0) {
                            iM11306 = (C19806.m45029("ܺᩳ") + i5) * (-71);
                            i6 = ((iM11306 ^ i4) * 7) ^ 1625179405;
                            i = 1772137559;
                        } else {
                            iM11306 = (ThreadFactoryC3888.m11306("ۙᩴ") ^ i5) * (-27);
                            i6 = ((iM11306 ^ i4) * (-18873)) ^ (-768685412);
                            i = 1374392051;
                        }
                        i8 = iM11306 ^ i;
                        break;
                    case -1808683871:
                    case -268308466:
                        C2871.m8643(intent, 268435456);
                        C2477.m7599(this, intent);
                        break;
                    case -1790792904:
                    case -482996580:
                        C1668.m5583();
                        if (!C0817.f3443) {
                        }
                        iM11306 = C19806.m45029("ܿܶ") ^ i4;
                        i6 = ((iM11306 ^ i5) * 4919) ^ 1327767344;
                        i = -2127154241;
                        i8 = iM11306 ^ i;
                        break;
                    case -1763327031:
                    case 1941990881:
                        if (ViewTreeObserverOnPreDrawListenerC3327.m9878(strM30993, 10) == -1) {
                            int iM45029 = (C19806.m45029("۫ܶ") + i5) * 33;
                            i6 = ((iM45029 ^ i4) * 22953) ^ 306576649;
                            i8 = iM45029 ^ (-1101115980);
                            i2 = -1;
                        } else {
                            i2 = -1;
                            iM11306 = ThreadFactoryC3888.m11306("᩹᩻") ^ i4;
                            i6 = ((iM11306 ^ i5) * (-26033)) ^ (-82323054);
                            i = 1896203023;
                            i8 = iM11306 ^ i;
                        }
                        break;
                    case -1699022528:
                    case -1014019611:
                        if (C0278.f1572 > 0) {
                            intent = new Intent(this, (Class<?>) ViewOnClickListenerC6361.class);
                            if (C0797.f3386) {
                                iM11306 = (i5 - C19806.m45029("۟۬")) * 67;
                                i6 = ((iM11306 ^ i4) * (-30791)) ^ 2003753621;
                                i = 887496288;
                            } else {
                                iM11306 = (ThreadFactoryC3888.m11306("֨۠") ^ i5) * 119;
                                i6 = ((iM11306 ^ i4) * (-1481)) ^ (-493367338);
                                i = -2117287252;
                            }
                            i8 = iM11306 ^ i;
                        }
                        break;
                    case -1636562376:
                    case 1433744093:
                        f56094 = strM30993;
                        iM11306 = ThreadFactoryC3888.m11306("᩹᩻") ^ i4;
                        i6 = ((iM11306 ^ i5) * (-26033)) ^ (-82323054);
                        i = 1896203023;
                        i8 = iM11306 ^ i;
                        break;
                    case -1492558591:
                    case 1787470085:
                        C1025.m3861();
                        C1668.m5583();
                        break;
                    case -1045000736:
                    case -343042769:
                        if (C3535.m10431() <= 0) {
                            iM11306 = C19806.m45029("ܿܶ") ^ i4;
                            i6 = ((iM11306 ^ i5) * 4919) ^ 1327767344;
                            i = -2127154241;
                        } else {
                            iM11306 = C19806.m45029("ۛ᩻") ^ i5;
                            i6 = ((iM11306 ^ i4) * (-29597)) ^ (-1836395726);
                            i = 1367731694;
                        }
                        i8 = iM11306 ^ i;
                        break;
                    case -1013092522:
                    case -998016329:
                        if (C2871.m8641(strM30993) < 100) {
                            iM11306 = (C19806.m45029("ۙۤ") ^ i4) * (-123);
                            i6 = ((iM11306 ^ i5) * 3091) ^ (-1919354320);
                            i = 717064087;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("᩹᩻") ^ i4;
                            i6 = ((iM11306 ^ i5) * (-26033)) ^ (-82323054);
                            i = 1896203023;
                        }
                        i8 = iM11306 ^ i;
                        break;
                    case -1009267904:
                    case 1870925595:
                        MenuItemOnMenuItemClickListenerC3244.m9701();
                        if (C0671.f2816 == 0) {
                        }
                        iM11306 = ThreadFactoryC3888.m11306("᩷۫") ^ i4;
                        i6 = ((iM11306 ^ i5) * 32371) ^ 1538137337;
                        i = 2130568449;
                        i8 = iM11306 ^ i;
                        break;
                    case -911476581:
                    case -619388056:
                        C0216.m1591();
                        if (C2642.m8171() != 0) {
                            iM11306 = ThreadFactoryC3888.m11306("᩷۫") ^ i4;
                            i6 = ((iM11306 ^ i5) * 32371) ^ 1538137337;
                            i = 2130568449;
                        } else {
                            iM11306 = (C19806.m45029("ܺᩳ") + i5) * (-71);
                            i6 = ((iM11306 ^ i4) * 7) ^ 1625179405;
                            i = 1772137559;
                        }
                        i8 = iM11306 ^ i;
                        break;
                    case -543043664:
                    case 766940437:
                        if (ViewTreeObserverOnPreDrawListenerC3327.m9878(strM30993, 13) == i2) {
                            iM11306 = ThreadFactoryC3888.m11306("۫֨") ^ i4;
                            i6 = ((iM11306 ^ i5) * (-18025)) ^ 985916431;
                            i = -1094083667;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("᩹᩻") ^ i4;
                            i6 = ((iM11306 ^ i5) * (-26033)) ^ (-82323054);
                            i = 1896203023;
                        }
                        i8 = iM11306 ^ i;
                        break;
                    case 241680736:
                    case 1478100466:
                        strM30993 = AbstractActivityC12483.m30993();
                        if (strM30993 != null) {
                            iM11306 = (ThreadFactoryC3888.m11306("۫᩵") + i5) * (-81);
                            i6 = ((iM11306 ^ i4) * (-28819)) ^ 1498524360;
                            i = -1937369322;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("᩹᩻") ^ i4;
                            i6 = ((iM11306 ^ i5) * (-26033)) ^ (-82323054);
                            i = 1896203023;
                        }
                        i8 = iM11306 ^ i;
                        break;
                    case 577123372:
                    case 960944719:
                        if (RunnableC1564.f6300) {
                            iM11306 = ThreadFactoryC3888.m11306("᩷۫") ^ i4;
                            i6 = ((iM11306 ^ i5) * 32371) ^ 1538137337;
                            i = 2130568449;
                        } else {
                            iM11306 = (ThreadFactoryC3888.m11306("ۘ᩶") + i4) * 87;
                            i6 = ((iM11306 ^ i5) * 21539) ^ (-94675004);
                            i = 1099447546;
                        }
                        i8 = iM11306 ^ i;
                        break;
                    case 800988615:
                    case 2134532547:
                        if (AbstractC0464.f2088 <= 0) {
                            iM11306 = (C19806.m45029("ܺᩳ") + i5) * (-71);
                            i6 = ((iM11306 ^ i4) * 7) ^ 1625179405;
                            i = 1772137559;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("ܿۨ") ^ i5;
                            i6 = ((iM11306 ^ i4) * 13183) ^ 1140553901;
                            i = -324479216;
                        }
                        i8 = iM11306 ^ i;
                        break;
                    case 987307006:
                    case 1063022530:
                        if (C1025.f4800 >= 0) {
                            iM11306 = ThreadFactoryC3888.m11306("᩷۫") ^ i4;
                            i6 = ((iM11306 ^ i5) * 32371) ^ 1538137337;
                            i = 2130568449;
                        } else {
                            iM11306 = C19806.m45029("᩵᩶") ^ i5;
                            i6 = ((iM11306 ^ i4) * 3407) ^ (-773954070);
                            i = 1315593891;
                        }
                        i8 = iM11306 ^ i;
                        break;
                    case 993607126:
                    case 2101282529:
                        CallableC1627.m5507();
                        break;
                    case 1041106546:
                    case 1571813530:
                        if (C3577.f13150 < 0) {
                            iM11306 = (i4 - C19806.m45029("᩻֨")) * (-73);
                            i6 = ((iM11306 ^ i5) * (-24683)) ^ 939659538;
                            i = -143500830;
                            i8 = iM11306 ^ i;
                        }
                        break;
                    case 1557447495:
                    case 2045744418:
                        if (C2477.f9839 <= 0) {
                            iM11306 = (i5 - C19806.m45029("۟۬")) * 67;
                            i6 = ((iM11306 ^ i4) * (-30791)) ^ 2003753621;
                            i = 887496288;
                        } else {
                            iM11306 = C19806.m45029("ܰۢ") ^ i4;
                            i6 = ((iM11306 ^ i5) * 25909) ^ 1526974482;
                            i = 705305919;
                        }
                        i8 = iM11306 ^ i;
                        break;
                    default:
                        if (C3535.f13026 <= 0) {
                            iM11306 = ThreadFactoryC3888.m11306("᩷۫") ^ i4;
                            i6 = ((iM11306 ^ i5) * 32371) ^ 1538137337;
                            i = 2130568449;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("֡֨") ^ i4;
                            i6 = ((iM11306 ^ i5) * 4425) ^ 1814958062;
                            i = -438632406;
                        }
                        i8 = iM11306 ^ i;
                        break;
                }
                return;
            }
            iM11307 = ThreadFactoryC3888.m11306("ᩳ۫") ^ i5;
            i6 = ((iM11307 ^ i4) * 29963) ^ (-1205968522);
            i7 = -288035368;
        }
    }

    public ServiceC17650() {
        C16945 c16945 = null;
        int i = 85072275;
        int i2 = C10634.f36300;
        int i3 = C3660.f13403;
        int iM45029 = (C19806.m45029("ۙۘ") + i2) * (-91);
        int i4 = ((iM45029 ^ i3) * 32581) ^ (-1167394424);
        int i5 = -624598284;
        while (true) {
            i = ((((i ^ i3) * 26343) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -1997615162:
                case 1122021661:
                    if (C0671.f2816 != 0) {
                        iM45029 = (C19806.m45029("᩸ۨ") ^ i2) * (-111);
                        i4 = ((iM45029 ^ i3) * 28089) ^ (-1265507778);
                        i5 = -2110462185;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۗۚ") + i2) * 25;
                        i4 = ((iM45029 ^ i3) * (-14239)) ^ 1192034367;
                        i5 = -1169030523;
                    }
                    break;
                case -1919428794:
                case 517488972:
                    if (C3722.f13525 > 0) {
                        iM45029 = (C19806.m45029("᩸ۨ") ^ i2) * (-111);
                        i4 = ((iM45029 ^ i3) * 28089) ^ (-1265507778);
                        i5 = -2110462185;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩷ۘ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 7453) ^ 206238511;
                        i5 = -894285814;
                    }
                    break;
                case -1611619859:
                case -497055186:
                    if (C1066.m4023() <= 0) {
                        iM45029 = (C19806.m45029("᩹᩸") ^ i3) * 91;
                        i4 = ((iM45029 ^ i2) * (-31189)) ^ (-844125418);
                        i5 = 263813577;
                    } else {
                        iM45029 = (C19806.m45029("ۡ۫") ^ i3) * (-95);
                        i4 = ((iM45029 ^ i2) * (-19267)) ^ (-1407193983);
                        i5 = -185645292;
                    }
                    break;
                case -1549303062:
                case 1974832928:
                    C3743.m10966();
                    iM45029 = ThreadFactoryC3888.m11306("ۧۖ") ^ i3;
                    i4 = ((iM45029 ^ i2) * 4301) ^ 328433745;
                    i5 = -94806321;
                    break;
                case -1449898916:
                case 172132778:
                    if (C3535.m10431() > 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩷ۘ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 7453) ^ 206238511;
                        i5 = -894285814;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۧۖ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 4301) ^ 328433745;
                        i5 = -94806321;
                    }
                    break;
                case -1432950879:
                case 61518257:
                    if (C0216.f1393 != 0) {
                        iM45029 = (C19806.m45029("᩹᩸") ^ i3) * 91;
                        i4 = ((iM45029 ^ i2) * (-31189)) ^ (-844125418);
                        i5 = 263813577;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܽ᩵") + i3) * (-79);
                        i4 = ((iM45029 ^ i2) * (-19929)) ^ 1040529679;
                        i5 = -2058000244;
                    }
                    break;
                case -1247593689:
                case 2009744488:
                    if (C1668.f6641 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩷ۘ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 7453) ^ 206238511;
                        i5 = -894285814;
                    } else {
                        iM45029 = C19806.m45029("ۨ᩹") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-3839)) ^ 255582802;
                        i5 = -1836927583;
                    }
                    break;
                case -1037499642:
                case 45139003:
                    c16945 = new C16945(this);
                    if (C1025.f4800 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩷ۘ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 7453) ^ 206238511;
                        i5 = -894285814;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۧ᩷") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-6675)) ^ (-1802255580);
                        i5 = -801759907;
                    }
                    break;
                case -840338294:
                case 1156223629:
                    if (C0216.f1393 != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩷ۘ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 7453) ^ 206238511;
                        i5 = -894285814;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܿۖ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-11769)) ^ 790024329;
                        i5 = 361954493;
                    }
                    break;
                case -806527464:
                case 744781652:
                    this.f56100 = c16945;
                    return;
                case -450935939:
                case -417216226:
                    ViewTreeObserverOnPreDrawListenerC3327.m9874();
                    if (RunnableC3388.m10064()) {
                        iM45029 = (C19806.m45029("᩸ۨ") ^ i2) * (-111);
                        i4 = ((iM45029 ^ i3) * 28089) ^ (-1265507778);
                        i5 = -2110462185;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۛ᩹") ^ i3;
                        i4 = ((iM45029 ^ i2) * 18201) ^ (-1078919188);
                        i5 = -1988718863;
                    }
                    break;
                case 86795379:
                case 636211352:
                    if (RunnableC1895.m6170() != 0) {
                        iM45029 = (C19806.m45029("᩹᩸") ^ i3) * 91;
                        i4 = ((iM45029 ^ i2) * (-31189)) ^ (-844125418);
                        i5 = 263813577;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩺ۛ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-28049)) ^ 1125465643;
                        i5 = 1894422994;
                    }
                    break;
                case 499123227:
                case 1155516057:
                    if (RunnableC1564.m5345()) {
                        iM45029 = ThreadFactoryC3888.m11306("᩷ۘ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 7453) ^ 206238511;
                        i5 = -894285814;
                    } else {
                        iM45029 = (C19806.m45029("ۙۚ") ^ i3) * (-49);
                        i4 = ((iM45029 ^ i2) * (-6625)) ^ 495820057;
                        i5 = 1626990961;
                    }
                    break;
                case 1231183898:
                case 1865552198:
                    if (C2249.m6915() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۧۖ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 4301) ^ 328433745;
                        i5 = -94806321;
                    } else {
                        iM45029 = (i3 - C19806.m45029("֫ܶ")) * (-117);
                        i4 = ((iM45029 ^ i2) * (-18077)) ^ 2236106;
                        i5 = 1340207078;
                    }
                    break;
                case 1311102697:
                case 1844945731:
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    ThreadFactoryC3888.m11300();
                    throw new RuntimeException();
                default:
                    if (C0526.f2219) {
                        iM45029 = ThreadFactoryC3888.m11306("᩷ۘ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 7453) ^ 206238511;
                        i5 = -894285814;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ۧ۟")) * 55;
                        i4 = ((iM45029 ^ i3) * 2365) ^ (-443556871);
                        i5 = 1292392984;
                    }
                    break;
            }
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f56101;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x017c A[PHI: r5 r21
      0x017c: PHI (r5v5 int) = (r5v4 int), (r5v2 int) binds: [B:44:0x017a, B:40:0x014d] A[DONT_GENERATE, DONT_INLINE]
      0x017c: PHI (r21v10 int) = (r21v9 int), (r21v11 int) binds: [B:44:0x017a, B:40:0x014d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.app.Service
    public final void onCreate() {
        int iM11306;
        int i;
        int i2;
        int iM11307;
        int i3;
        int i4;
        int i5;
        int i6 = C0278.f1572;
        int i7 = C1460.f5948;
        int iM11308 = ThreadFactoryC3888.m11306("ۜۜ") ^ i6;
        int i8 = ((iM11308 ^ i7) * 30431) ^ (-1091455687);
        Resources resources = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i9 = iM11308 ^ (-727107304);
        C20013 c20013M45318 = null;
        int i10 = 0;
        int iM45029 = 0;
        int iM450210 = 0;
        int i11 = 0;
        IntentFilter intentFilter = null;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        short s = 0;
        int i16 = -2014998724;
        short s2 = 0;
        while (true) {
            i16 = i9 ^ (i8 & (((i16 ^ i7) * (-15043)) >> 31));
            switch (i16) {
                case -2016269169:
                case 139735162:
                    iM450210 = iM450210;
                    sArr = sArr;
                    if ((s * s2) - ((s * s) + 26543104) > 0) {
                        iM11307 = C19806.m45029("᩸ۢ") ^ i6;
                        i3 = ((iM11307 ^ i7) * 11673) ^ 2002778653;
                        i4 = 1374995725;
                    } else {
                        iM11307 = (ThreadFactoryC3888.m11306("ۡۨ") ^ i7) * (-113);
                        i3 = ((iM11307 ^ i6) * (-293)) ^ (-905015521);
                        i4 = 1806559228;
                    }
                    int i17 = iM11307 ^ i4;
                    sArr = sArr;
                    i8 = i3;
                    i5 = iM450210;
                    i9 = i17;
                    iM450210 = i5;
                    break;
                case -1929959446:
                case 1759205699:
                    if (MenuItemOnMenuItemClickListenerC3244.m9701() >= 0) {
                        iM450210 = iM450210;
                        sArr = sArr;
                        iM11307 = C19806.m45029("ܰ᩺") ^ i6;
                        i3 = ((iM11307 ^ i7) * 21783) ^ (-1233133175);
                        i4 = -1892406343;
                        int i18 = iM11307 ^ i4;
                        sArr = sArr;
                        i8 = i3;
                        i5 = iM450210;
                        i9 = i18;
                        iM450210 = i5;
                    }
                    iM450210 = iM450210;
                    sArr = sArr;
                    iM11307 = ThreadFactoryC3888.m11306("ۢܳ") ^ i7;
                    i3 = ((iM11307 ^ i6) * 14853) ^ 1677172554;
                    i4 = -760146466;
                    int i19 = iM11307 ^ i4;
                    sArr = sArr;
                    i8 = i3;
                    i5 = iM450210;
                    i9 = i19;
                    iM450210 = i5;
                    break;
                case -1853547138:
                case -1813775049:
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    iM450210 = iM450210;
                    sArr = sArr;
                    iM11307 = ThreadFactoryC3888.m11306("ۢܳ") ^ i7;
                    i3 = ((iM11307 ^ i6) * 14853) ^ 1677172554;
                    i4 = -760146466;
                    int i110 = iM11307 ^ i4;
                    sArr = sArr;
                    i8 = i3;
                    i5 = iM450210;
                    i9 = i110;
                    iM450210 = i5;
                    break;
                case -1841049196:
                case -484647440:
                    if (!C3286.f12186) {
                        int iM450211 = C19806.m45029("۫ᩴ") ^ i7;
                        i9 = iM450211 ^ 952909692;
                        i8 = ((iM450211 ^ i6) * (-7575)) ^ (-196288023);
                        intentFilter = null;
                    } else {
                        iM450210 = iM450210;
                        sArr = sArr;
                        iM11307 = ThreadFactoryC3888.m11306("ۢܳ") ^ i7;
                        i3 = ((iM11307 ^ i6) * 14853) ^ 1677172554;
                        i4 = -760146466;
                        int i111 = iM11307 ^ i4;
                        sArr = sArr;
                        i8 = i3;
                        i5 = iM450210;
                        i9 = i111;
                        iM450210 = i5;
                    }
                    break;
                case -1828672466:
                case 635856038:
                    iM450210 = iM450210;
                    c20013M45318.setImageDrawable(C19861.m45105(resources, iM45029, getTheme()));
                    C1937.m6291(c20013M45318, this);
                    if (C0962.f3784) {
                        iM11306 = (C19806.m45029("ᩴۧ") + i6) * (-35);
                        i = ((iM11306 ^ i7) * 8105) ^ (-1093819379);
                        i2 = -1869471503;
                    } else {
                        iM11306 = (C19806.m45029("ۢܰ") + i7) * (-19);
                        i = ((iM11306 ^ i6) * (-21995)) ^ (-1658389520);
                        i2 = -1218663130;
                    }
                    i5 = iM450210;
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    iM450210 = i5;
                    break;
                case -1564333514:
                case -536731986:
                    iM450210 = iM450210;
                    iM45029 = 2123940940 ^ C19806.m45029(C1377.m4832(sArr2, i15, 3, i12));
                    if (C2477.m7593() >= 0) {
                        iM11306 = (C19806.m45029("ᩴۧ") + i6) * (-35);
                        i = ((iM11306 ^ i7) * 8105) ^ (-1093819379);
                        i2 = -1869471503;
                    } else {
                        iM11306 = C19806.m45029("֫֡") ^ i6;
                        i = ((iM11306 ^ i7) * (-31735)) ^ 429105975;
                        i2 = 949080727;
                    }
                    i5 = iM450210;
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    iM450210 = i5;
                    break;
                case -1524688430:
                case -1315025107:
                    iM450210 = iM450210;
                    this.f56098 = c20013M45318;
                    sArr3 = f56097;
                    i10 = 8;
                    i11 = 3;
                    if (C3577.m10565()) {
                        iM11306 = (i6 - C19806.m45029("۟ۙ")) * 69;
                        i = ((iM11306 ^ i7) * (-18673)) ^ (-962767977);
                        i2 = 246652896;
                        i5 = iM450210;
                        i9 = iM11306 ^ i2;
                        i8 = i;
                        iM450210 = i5;
                    }
                    sArr = sArr;
                    iM11307 = ThreadFactoryC3888.m11306("ۢܳ") ^ i7;
                    i3 = ((iM11307 ^ i6) * 14853) ^ 1677172554;
                    i4 = -760146466;
                    int i112 = iM11307 ^ i4;
                    sArr = sArr;
                    i8 = i3;
                    i5 = iM450210;
                    i9 = i112;
                    iM450210 = i5;
                    break;
                case -1467603776:
                case 882510804:
                    c20013M45318.setId(2098880435 ^ iM450210);
                    if (ThreadFactoryC3888.f14547 > 0) {
                        iM450210 = iM450210;
                        intentFilter = new IntentFilter(C1419.m4969(f56097, 11, 32, i12));
                        if (C0671.m3008() < 0) {
                            iM11306 = (ThreadFactoryC3888.m11306("ܰ۟") ^ i6) * 109;
                            i = ((iM11306 ^ i7) * (-3699)) ^ (-995263624);
                            i2 = -1935693039;
                            i5 = iM450210;
                            i9 = iM11306 ^ i2;
                            i8 = i;
                            iM450210 = i5;
                        }
                        sArr = sArr;
                        iM11307 = C19806.m45029("ܰ᩺") ^ i6;
                        i3 = ((iM11307 ^ i7) * 21783) ^ (-1233133175);
                        i4 = -1892406343;
                        int i113 = iM11307 ^ i4;
                        sArr = sArr;
                        i8 = i3;
                        i5 = iM450210;
                        i9 = i113;
                        iM450210 = i5;
                    } else {
                        int iM450212 = C19806.m45029("۫ᩴ") ^ i7;
                        i9 = iM450212 ^ 952909692;
                        i8 = ((iM450212 ^ i6) * (-7575)) ^ (-196288023);
                        intentFilter = null;
                    }
                    break;
                case -1207332621:
                case 916933881:
                    C0817.m3399();
                    break;
                case -1120162005:
                case 1415473938:
                    iM450210 = iM450210;
                    sArr = sArr;
                    c20013M45318 = C20013.m45318(this, C1937.m6288(sArr, i13, i14, i12));
                    resources = getResources();
                    sArr2 = f56097;
                    i15 = 5;
                    if (C0671.f2816 != 0) {
                        iM11307 = ThreadFactoryC3888.m11306("ۢܳ") ^ i7;
                        i3 = ((iM11307 ^ i6) * 14853) ^ 1677172554;
                        i4 = -760146466;
                    } else {
                        iM11307 = (i7 - ThreadFactoryC3888.m11306("ܰ֡")) * 101;
                        i3 = ((iM11307 ^ i6) * (-15843)) ^ (-224097986);
                        i4 = 1581943311;
                    }
                    int i114 = iM11307 ^ i4;
                    sArr = sArr;
                    i8 = i3;
                    i5 = iM450210;
                    i9 = i114;
                    iM450210 = i5;
                    break;
                case -908140033:
                case 1811729225:
                    iM450210 = iM450210;
                    sArr = sArr;
                    s = f56097[0];
                    s2 = 10304;
                    if (!C2332.f8260) {
                        sArr = sArr;
                        iM11306 = C19806.m45029("۬ܽ") ^ i6;
                        i = ((iM11306 ^ i7) * 20791) ^ 1674800457;
                        i2 = -1930247224;
                        i5 = iM450210;
                        i9 = iM11306 ^ i2;
                        i8 = i;
                        iM450210 = i5;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("֨ܶ") ^ i6;
                        i3 = ((iM11307 ^ i7) * (-9633)) ^ (-1838889548);
                        i4 = 354649491;
                        int i115 = iM11307 ^ i4;
                        sArr = sArr;
                        i8 = i3;
                        i5 = iM450210;
                        i9 = i115;
                        iM450210 = i5;
                    }
                    break;
                case -667818003:
                case 1302580540:
                    iM450210 = iM450210;
                    super.onCreate();
                    setTheme(C2666.m8210());
                    sArr = f56097;
                    if (C1189.f5284 <= 0) {
                        iM11306 = C19806.m45029("۬ܽ") ^ i6;
                        i = ((iM11306 ^ i7) * 20791) ^ 1674800457;
                        i2 = -1930247224;
                    } else {
                        iM11306 = (C19806.m45029("ۚۜ") + i6) * 119;
                        i = ((iM11306 ^ i7) * 25525) ^ (-2118786715);
                        i2 = -238868778;
                    }
                    i5 = iM450210;
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    iM450210 = i5;
                    break;
                case -589673949:
                case -175618254:
                    ThreadFactoryC3888.m11300();
                    if (C3535.f13026 > 0) {
                        iM450210 = iM450210;
                        iM11306 = C19806.m45029("۬ܽ") ^ i6;
                        i = ((iM11306 ^ i7) * 20791) ^ 1674800457;
                        i2 = -1930247224;
                        i5 = iM450210;
                        i9 = iM11306 ^ i2;
                        i8 = i;
                        iM450210 = i5;
                    }
                    iM450210 = iM450210;
                    sArr = sArr;
                    iM11307 = ThreadFactoryC3888.m11306("ۢܳ") ^ i7;
                    i3 = ((iM11307 ^ i6) * 14853) ^ 1677172554;
                    i4 = -760146466;
                    int i116 = iM11307 ^ i4;
                    sArr = sArr;
                    i8 = i3;
                    i5 = iM450210;
                    i9 = i116;
                    iM450210 = i5;
                    break;
                case -26528031:
                case 1436682959:
                    iM450210 = C19806.m45029(C0797.m3361(sArr3, i10, i11, i12));
                    if (RunnableC3388.m10064()) {
                        int iM11309 = (ThreadFactoryC3888.m11306("᩶ᩴ") + i7) * (-81);
                        i9 = iM11309 ^ 2069226380;
                        i8 = ((iM11309 ^ i6) * (-25255)) ^ (-2089304345);
                    } else {
                        int iM450213 = C19806.m45029("۫ᩴ") ^ i7;
                        i9 = iM450213 ^ 952909692;
                        i8 = ((iM450213 ^ i6) * (-7575)) ^ (-196288023);
                        intentFilter = null;
                    }
                    break;
                case 9627705:
                case 1922478151:
                    C16737.m39269(this.f56100, intentFilter);
                    this.f56101 = new BinderC12712(this);
                    break;
                case 1132176985:
                case 1472265073:
                    iM450210 = iM450210;
                    sArr = sArr;
                    i13 = 1;
                    i14 = 4;
                    if (C3286.f12186) {
                        iM11307 = C19806.m45029("ܰ᩺") ^ i6;
                        i3 = ((iM11307 ^ i7) * 21783) ^ (-1233133175);
                        i4 = -1892406343;
                    } else {
                        iM11307 = C19806.m45029("᩷ᩴ") ^ i7;
                        i3 = ((iM11307 ^ i6) * 22771) ^ 1156433757;
                        i4 = 1496212544;
                    }
                    int i117 = iM11307 ^ i4;
                    sArr = sArr;
                    i8 = i3;
                    i5 = iM450210;
                    i9 = i117;
                    iM450210 = i5;
                    break;
                case 1283521792:
                case 1552041182:
                    i12 = 19841;
                    iM11307 = (i7 - C19806.m45029("۟ۚ")) * 79;
                    i3 = ((iM11307 ^ i6) * (-28487)) ^ 546866483;
                    i4 = 789358505;
                    int i118 = iM11307 ^ i4;
                    sArr = sArr;
                    i8 = i3;
                    i5 = iM450210;
                    i9 = i118;
                    iM450210 = i5;
                    break;
                default:
                    i12 = 47974;
                    iM11307 = (i7 - C19806.m45029("۟ۚ")) * 79;
                    i3 = ((iM11307 ^ i6) * (-28487)) ^ 546866483;
                    i4 = 789358505;
                    int i119 = iM11307 ^ i4;
                    sArr = sArr;
                    i8 = i3;
                    i5 = iM450210;
                    i9 = i119;
                    iM450210 = i5;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0171 A[PHI: r19
      0x0171: PHI (r19v22 int) = (r19v15 int), (r19v18 int), (r19v23 int) binds: [B:43:0x0158, B:32:0x00e9, B:24:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0235 A[PHI: r3 r4 r5 r19
      0x0235: PHI (r3v4 short[]) = (r3v3 short[]), (r3v2 short[]) binds: [B:62:0x0233, B:58:0x0215] A[DONT_GENERATE, DONT_INLINE]
      0x0235: PHI (r4v3 short) = (r4v2 short), (r4v4 short) binds: [B:62:0x0233, B:58:0x0215] A[DONT_GENERATE, DONT_INLINE]
      0x0235: PHI (r5v3 short) = (r5v2 short), (r5v4 short) binds: [B:62:0x0233, B:58:0x0215] A[DONT_GENERATE, DONT_INLINE]
      0x0235: PHI (r19v8 int) = (r19v7 int), (r19v9 int) binds: [B:62:0x0233, B:58:0x0215] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x02bc A[PHI: r6 r7 r8 r19
      0x02bc: PHI (r6v4 int) = (r6v2 int), (r6v3 int), (r6v2 int) binds: [B:74:0x02ba, B:54:0x01ee, B:11:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x02bc: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int) binds: [B:74:0x02ba, B:54:0x01ee, B:11:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x02bc: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int) binds: [B:74:0x02ba, B:54:0x01ee, B:11:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x02bc: PHI (r19v26 int) = (r19v4 int), (r19v10 int), (r19v29 int) binds: [B:74:0x02ba, B:54:0x01ee, B:11:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:83:0x030d A[PHI: r19
      0x030d: PHI (r19v27 int) = (r19v2 int), (r19v6 int), (r19v28 int) binds: [B:82:0x030b, B:66:0x0268, B:10:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:87:0x033b A[PHI: r10 r11 r12 r19
      0x033b: PHI (r10v5 short[]) = (r10v2 short[]), (r10v2 short[]), (r10v3 short[]), (r10v2 short[]) binds: [B:86:0x0339, B:78:0x02ee, B:35:0x010b, B:7:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x033b: PHI (r11v5 int) = (r11v2 int), (r11v2 int), (r11v3 int), (r11v2 int) binds: [B:86:0x0339, B:78:0x02ee, B:35:0x010b, B:7:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x033b: PHI (r12v5 int) = (r12v2 int), (r12v2 int), (r12v3 int), (r12v2 int) binds: [B:86:0x0339, B:78:0x02ee, B:35:0x010b, B:7:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x033b: PHI (r19v32 int) = (r19v1 int), (r19v3 int), (r19v17 int), (r19v33 int) binds: [B:86:0x0339, B:78:0x02ee, B:35:0x010b, B:7:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0064, code lost:
    
        if (l.RunnableC1564.m5345() == false) goto L7;
     */
    @Override // android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int onStartCommand(android.content.Intent r18, int r19, int r20) {
        /*
            Method dump skipped, instruction units count: 1088
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ServiceC17650.onStartCommand(android.content.Intent, int, int):int");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        String str = null;
        int i = 1086410052;
        int i2 = AbstractC0464.f2088;
        int i3 = C1461.f5957;
        int iM11306 = (ThreadFactoryC3888.m11306("ۧۧ") ^ i3) * 67;
        int i4 = ((iM11306 ^ i2) * (-29819)) ^ 1499514138;
        int i5 = -956198969;
        while (true) {
            i = ((((i ^ i2) * (-28651)) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2140031040:
                case -615467896:
                    if (C7105.f23796 >= 0) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ᩳܺ")) * 53;
                        i4 = ((iM11306 ^ i3) * 16445) ^ 2048316514;
                        i5 = -1639518153;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩵۟") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-15667)) ^ 71675566;
                        i5 = -19599081;
                    }
                    break;
                case -1905146287:
                case -1395168073:
                    str = null;
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("۟ܺ") ^ i3) * (-77);
                        i4 = ((iM11306 ^ i2) * (-21469)) ^ (-787265291);
                        i5 = -1860823678;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("᩺᩶")) * (-97);
                        i4 = ((iM11306 ^ i3) * 5943) ^ 1427165464;
                        i5 = 183084422;
                    }
                    break;
                case -1793615521:
                case -866550212:
                    if (C3577.f13150 >= 0) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ᩳܺ")) * 53;
                        i4 = ((iM11306 ^ i3) * 16445) ^ 2048316514;
                        i5 = -1639518153;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۛ۠") ^ i3) * (-115);
                        i4 = ((iM11306 ^ i2) * (-31299)) ^ 856507917;
                        i5 = -1855331962;
                    }
                    break;
                case -1592844160:
                case 1250245917:
                    if (C3660.f13403 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("۟ܺ") ^ i3) * (-77);
                        i4 = ((iM11306 ^ i2) * (-21469)) ^ (-787265291);
                        i5 = -1860823678;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۗܺ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 24173) ^ (-1585736091);
                        i5 = -488738761;
                    }
                    break;
                case -1498055366:
                case 1110513954:
                    if (C1066.f4915 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("۟ܺ") ^ i3) * (-77);
                        i4 = ((iM11306 ^ i2) * (-21469)) ^ (-787265291);
                        i5 = -1860823678;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۗۙ") + i3) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM11306 ^ i2) * (-30355)) ^ (-1698641898);
                        i5 = 1585140512;
                    }
                    break;
                case -1461491315:
                case -1162077101:
                    if (C0526.f2219) {
                        iM11306 = ThreadFactoryC3888.m11306("ۧܺ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 12173) ^ 1828214182;
                        i5 = 1387530550;
                    } else {
                        iM11306 = C19806.m45029("ۤ᩻") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-18211)) ^ 879476908;
                        i5 = -2014304060;
                    }
                    break;
                case -1373732953:
                case -712523817:
                    this.f56098.m45325();
                    if (C0962.f3784) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ᩳܺ")) * 53;
                        i4 = ((iM11306 ^ i3) * 16445) ^ 2048316514;
                        i5 = -1639518153;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܺ۫") + i2) * 71;
                        i4 = ((iM11306 ^ i3) * (-29219)) ^ (-1000839181);
                        i5 = -1970904867;
                    }
                    break;
                case -1099105406:
                case -712877001:
                    if (!C0817.f3443) {
                        iM11306 = (i2 - C19806.m45029("ܿᩴ")) * (-109);
                        i4 = ((iM11306 ^ i3) * (-18435)) ^ (-1002211342);
                        i5 = 1552134414;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۟ܺ") ^ i3) * (-77);
                        i4 = ((iM11306 ^ i2) * (-21469)) ^ (-787265291);
                        i5 = -1860823678;
                    }
                    break;
                case -588152094:
                case 2015529490:
                    C0797.m3359();
                    break;
                case -544051212:
                case 186303:
                    if (C0671.f2816 != 0) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ᩳܺ")) * 53;
                        i4 = ((iM11306 ^ i3) * 16445) ^ 2048316514;
                        i5 = -1639518153;
                    } else {
                        iM11306 = (C19806.m45029("᩷ܶ") + i3) * 3;
                        i4 = ((iM11306 ^ i2) * (-10841)) ^ (-39998300);
                        i5 = -1674644839;
                    }
                    break;
                case -441943218:
                case 1499667762:
                    super.onDestroy();
                    if (C2477.f9839 <= 0) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ᩳܺ")) * 53;
                        i4 = ((iM11306 ^ i3) * 16445) ^ 2048316514;
                        i5 = -1639518153;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("᩻᩺")) * (-81);
                        i4 = ((iM11306 ^ i2) * (-30347)) ^ (-305422838);
                        i5 = 1132896609;
                    }
                    break;
                case -129158966:
                case -7544558:
                    if (!C3743.f13569) {
                        iM11306 = (C19806.m45029("ۘۚ") ^ i3) * 49;
                        i4 = ((iM11306 ^ i2) * (-20543)) ^ 940752518;
                        i5 = 930129459;
                    } else {
                        iM11306 = (i2 - C19806.m45029("ܿᩴ")) * (-109);
                        i4 = ((iM11306 ^ i3) * (-18435)) ^ (-1002211342);
                        i5 = 1552134414;
                    }
                    break;
                case 48323928:
                case 2088339595:
                    C1419.m4973();
                    C3535.m10431();
                    iM11306 = (C19806.m45029("ۘۚ") ^ i3) * 49;
                    i4 = ((iM11306 ^ i2) * (-20543)) ^ 940752518;
                    i5 = 930129459;
                    break;
                case 153532533:
                case 512497401:
                    C16737.m39268(this.f56100);
                    break;
                case 181528998:
                case 990663883:
                    C2477.m7593();
                    if (C2124.f7782 > 0) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ᩳܺ")) * 53;
                        i4 = ((iM11306 ^ i3) * 16445) ^ 2048316514;
                        i5 = -1639518153;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۟ܺ") ^ i3) * (-77);
                        i4 = ((iM11306 ^ i2) * (-21469)) ^ (-787265291);
                        i5 = -1860823678;
                    }
                    break;
                default:
                    f56095 = str;
                    if (RunnableC1606.f6488 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۧܺ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 12173) ^ 1828214182;
                        i5 = 1387530550;
                    } else {
                        iM11306 = C19806.m45029("᩷ۛ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-7601)) ^ 252156464;
                        i5 = -1914586832;
                    }
                    break;
            }
            return;
        }
    }
}
