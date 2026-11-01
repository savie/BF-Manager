package l;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.widget.TextView;
import com.alipay.sdk.m.y.q;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ܰ۠᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: X6L3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13705 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static GradientDrawable m33406(int i, int i2, Integer num) {
        GradientDrawable gradientDrawable = null;
        int iM5054 = 0;
        int iM2304 = 0;
        int i3 = 1687367268;
        int i4 = C0278.f1572;
        int i5 = C3722.f13525;
        int iM45029 = C19806.m45029("ۧۜ") ^ i5;
        int i6 = ((iM45029 ^ i4) * 1909) ^ (-1278647495);
        int i7 = -1161100942;
        while (true) {
            i3 = ((((i3 ^ i4) * (-3699)) >> 31) & i6) ^ (iM45029 ^ i7);
            switch (i3) {
                case -1841911328:
                case -8811527:
                    if (C0962.f3784) {
                        iM45029 = (C19806.m45029("ܽۨ") ^ i5) * (-61);
                        i6 = ((iM45029 ^ i4) * 10203) ^ (-1942510896);
                        i7 = 302596040;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩸᩸") ^ i4;
                        i6 = ((iM45029 ^ i5) * 14595) ^ (-1312656925);
                        i7 = -1524500672;
                    }
                    break;
                case -1718609481:
                case -1247698576:
                    gradientDrawable.setCornerRadius(iM5054);
                    if (num != null) {
                        iM45029 = (i4 - C19806.m45029("֫ᩴ")) * (-33);
                        i6 = ((iM45029 ^ i5) * 13499) ^ 857401815;
                        i7 = -445598626;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩹᩹") ^ i5;
                        i6 = ((iM45029 ^ i4) * (-29039)) ^ 446306826;
                        i7 = -1733964284;
                    }
                    break;
                case -1615467907:
                case -845248820:
                    if (C0962.f3784) {
                        iM45029 = ThreadFactoryC3888.m11306("ܳ۠") ^ i4;
                        i6 = ((iM45029 ^ i5) * 16693) ^ 240793169;
                        i7 = 1487407913;
                    } else {
                        iM45029 = (C19806.m45029("ܺ۬") ^ i4) * 21;
                        i6 = ((iM45029 ^ i5) * 11475) ^ (-380155957);
                        i7 = -1921663778;
                    }
                    break;
                case -1597099334:
                case -1299553025:
                    if (C1460.f5948 >= 0) {
                        iM45029 = C19806.m45029("᩻ۡ") ^ i4;
                        i6 = ((iM45029 ^ i5) * (-13545)) ^ (-1076319087);
                        i7 = 313981280;
                    } else {
                        iM45029 = (C19806.m45029("᩷ᩴ") + i4) * (-119);
                        i6 = ((iM45029 ^ i5) * 16369) ^ 1033976775;
                        i7 = -569021564;
                    }
                    break;
                case -1352584169:
                case 1696447643:
                    if (C19806.f63586) {
                        iM45029 = C19806.m45029("᩻ۡ") ^ i4;
                        i6 = ((iM45029 ^ i5) * (-13545)) ^ (-1076319087);
                        i7 = 313981280;
                    } else {
                        iM45029 = (C19806.m45029("ۖᩳ") ^ i5) * 87;
                        i6 = ((iM45029 ^ i4) * (-29317)) ^ (-2013678297);
                        i7 = 517332571;
                    }
                    break;
                case -1247365863:
                case -1109870850:
                    return gradientDrawable;
                case -1202341081:
                case -197442829:
                    gradientDrawable = new GradientDrawable();
                    if (C2332.f8260) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۨۤ") ^ i5) * (-21);
                        i6 = ((iM45029 ^ i4) * 29467) ^ 1282131914;
                        i7 = 983225616;
                    } else {
                        iM45029 = (i5 - C19806.m45029("᩷ۗ")) * (-5);
                        i6 = ((iM45029 ^ i4) * (-17983)) ^ 1181943406;
                        i7 = -956377503;
                    }
                    break;
                case -703831822:
                case 2108446783:
                    gradientDrawable.setColor(i);
                    iM5054 = C1460.m5054(i2);
                    if (C1668.m5583()) {
                        iM45029 = C19806.m45029("᩻ۧ") ^ i4;
                        i6 = ((iM45029 ^ i5) * 14911) ^ 1036574216;
                        i7 = -1462396453;
                    } else {
                        iM45029 = (C19806.m45029("ܽۨ") ^ i5) * (-61);
                        i6 = ((iM45029 ^ i4) * 10203) ^ (-1942510896);
                        i7 = 302596040;
                    }
                    break;
                case -692966564:
                case 196343619:
                    iM2304 = AbstractC0464.m2304(1);
                    if (C1398.f5802 <= 0) {
                        iM45029 = (i5 - C19806.m45029("᩷ۗ")) * (-5);
                        i6 = ((iM45029 ^ i4) * (-17983)) ^ 1181943406;
                        i7 = -956377503;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۛܺ") + i5) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i6 = ((iM45029 ^ i4) * 24517) ^ 2087450362;
                        i7 = 870917936;
                    }
                    break;
                case -408917529:
                case 995896117:
                    if (C0278.f1572 <= 0) {
                        iM45029 = (i5 - C19806.m45029("᩷ۗ")) * (-5);
                        i6 = ((iM45029 ^ i4) * (-17983)) ^ 1181943406;
                        i7 = -956377503;
                    } else {
                        iM45029 = (C19806.m45029("ܳܰ") + i5) * (-71);
                        i6 = ((iM45029 ^ i4) * (-18431)) ^ 2048696634;
                        i7 = -950801744;
                    }
                    break;
                case -191559443:
                case 1592620047:
                    if (C1875.f7103 >= 0) {
                        iM45029 = (i5 - C19806.m45029("᩷ۗ")) * (-5);
                        i6 = ((iM45029 ^ i4) * (-17983)) ^ 1181943406;
                        i7 = -956377503;
                    } else {
                        iM45029 = C19806.m45029("ܳۗ") ^ i4;
                        i6 = ((iM45029 ^ i5) * 30699) ^ 1409005558;
                        i7 = 1147570426;
                    }
                    break;
                case 46232251:
                case 1769604983:
                    RunnableC1564.m5345();
                    return null;
                case 185775292:
                case 1494314393:
                    if (C1668.f6641 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܳ۠") ^ i4;
                        i6 = ((iM45029 ^ i5) * 16693) ^ 240793169;
                        i7 = 1487407913;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۢ᩹") ^ i5;
                        i6 = ((iM45029 ^ i4) * (-27121)) ^ (-104497222);
                        i7 = -1977619430;
                    }
                    break;
                case 264421825:
                case 1135116381:
                    C2332.m7079();
                    iM45029 = (C19806.m45029("ܽۨ") ^ i5) * (-61);
                    i6 = ((iM45029 ^ i4) * 10203) ^ (-1942510896);
                    i7 = 302596040;
                    break;
                case 1172303427:
                case 1392678498:
                    if (C1148.f5161 <= 0) {
                        iM45029 = C19806.m45029("᩻ۡ") ^ i4;
                        i6 = ((iM45029 ^ i5) * (-13545)) ^ (-1076319087);
                        i7 = 313981280;
                    } else {
                        iM45029 = (C19806.m45029("ܽۨ") ^ i5) * (-61);
                        i6 = ((iM45029 ^ i4) * 10203) ^ (-1942510896);
                        i7 = 302596040;
                    }
                    break;
                case 1281538321:
                case 1646083386:
                    if (C0671.f2816 == 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܳ۠") ^ i4;
                        i6 = ((iM45029 ^ i5) * 16693) ^ 240793169;
                        i7 = 1487407913;
                    } else {
                        iM45029 = (C19806.m45029("ܽۨ") ^ i5) * (-61);
                        i6 = ((iM45029 ^ i4) * 10203) ^ (-1942510896);
                        i7 = 302596040;
                    }
                    break;
                case 1391865585:
                case 1990071221:
                    gradientDrawable.setStroke(iM2304, C0817.m3400(num));
                    iM45029 = ThreadFactoryC3888.m11306("᩹᩹") ^ i5;
                    i6 = ((iM45029 ^ i4) * (-29039)) ^ 446306826;
                    i7 = -1733964284;
                    break;
                default:
                    if (C2704.f10408) {
                        iM45029 = ThreadFactoryC3888.m11306("֡ᩴ") ^ i5;
                        i6 = ((iM45029 ^ i4) * (-19837)) ^ (-1941711935);
                        i7 = 1197720083;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܳ۠") ^ i4;
                        i6 = ((iM45029 ^ i5) * 16693) ^ 240793169;
                        i7 = 1487407913;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static TextView m33407(Context context, float f, boolean z) {
        TextView textView = null;
        int i = 0;
        int i2 = 1947950108;
        int i3 = C1419.f5860;
        int i4 = C2642.f10294;
        int iM45029 = (C19806.m45029("ۨ᩵") ^ i3) * (-41);
        int i5 = ((iM45029 ^ i4) * 12829) ^ (-744628954);
        int i6 = -499054;
        while (true) {
            i2 = ((((i2 ^ i4) * 25093) >> 31) & i5) ^ (iM45029 ^ i6);
            switch (i2) {
                case -2119847426:
                case 740654258:
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = (i3 - C19806.m45029("ܰᩳ")) * (-29);
                        i5 = ((iM45029 ^ i4) * 9299) ^ 1068793309;
                        i6 = 487584781;
                    } else {
                        iM45029 = (i4 - C19806.m45029("᩻ܰ")) * 91;
                        i5 = ((iM45029 ^ i3) * 20247) ^ 1374023439;
                        i6 = -1878841068;
                    }
                    break;
                case -1860695752:
                case 914670165:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM45029 = C19806.m45029("֨۠") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-32543)) ^ (-792629587);
                        i6 = -385351292;
                    } else {
                        iM45029 = C19806.m45029("۠ۚ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-11089)) ^ (-375462086);
                        i6 = 478679286;
                    }
                    break;
                case -1581982879:
                case -1130681657:
                    C3743.m10966();
                    iM45029 = ThreadFactoryC3888.m11306("ۛ֡") ^ i3;
                    i5 = ((iM45029 ^ i4) * (-17889)) ^ (-1367812784);
                    i6 = 893262600;
                    break;
                case -1555534318:
                case 78522930:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۛۚ") ^ i3) * 7;
                        i5 = ((iM45029 ^ i4) * 15175) ^ 1798513769;
                        i6 = 1993434210;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۤۤ") ^ i4) * 69;
                        i5 = ((iM45029 ^ i3) * (-27307)) ^ (-874271875);
                        i6 = 1771218499;
                    }
                    break;
                case -1424146893:
                case -460604313:
                    textView = new TextView(context);
                    textView.setTextSize(f);
                    if (z) {
                        iM45029 = C19806.m45029("֫ܺ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 24095) ^ (-1510301807);
                        i6 = -315397225;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֫ۡ") ^ i3) * 115;
                        i5 = ((iM45029 ^ i4) * 26679) ^ (-1968829868);
                        i6 = -1509348889;
                    }
                    break;
                case -1414718394:
                case 931263686:
                    if (C2704.f10408) {
                        iM45029 = (C19806.m45029("ۜܺ") + i3) * (-87);
                        i5 = ((iM45029 ^ i4) * (-10209)) ^ (-487482562);
                        i6 = 1660691754;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۛ֡") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-17889)) ^ (-1367812784);
                        i6 = 893262600;
                    }
                    break;
                case -1090134811:
                case 1363091171:
                    i = C20368.f66007;
                    iM45029 = C19806.m45029("ۛ᩺") ^ i4;
                    i5 = ((iM45029 ^ i3) * (-32611)) ^ 1073820966;
                    i6 = 420951403;
                    break;
                case -1054277852:
                case -312387999:
                    if (C2332.m7079() <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩻ۨ") ^ i4) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i5 = ((iM45029 ^ i3) * 19739) ^ 1838796526;
                        i6 = -2061196247;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩹᩸") ^ i3) * q.h;
                        i5 = ((iM45029 ^ i4) * (-6391)) ^ (-1436728502);
                        i6 = 1576330005;
                    }
                    break;
                case -772481592:
                case -95701064:
                    if (C0050.f912 > 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩻ۨ") ^ i4) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i5 = ((iM45029 ^ i3) * 19739) ^ 1838796526;
                        i6 = -2061196247;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۛۚ") ^ i3) * 7;
                        i5 = ((iM45029 ^ i4) * 15175) ^ 1798513769;
                        i6 = 1993434210;
                    }
                    break;
                case -711253299:
                case 223198276:
                    if (C3660.f13403 >= 0) {
                        iM45029 = (i3 - C19806.m45029("ܰᩳ")) * (-29);
                        i5 = ((iM45029 ^ i4) * 9299) ^ 1068793309;
                        i6 = 487584781;
                    } else {
                        iM45029 = (C19806.m45029("ᩴ᩷") ^ i3) * (-59);
                        i5 = ((iM45029 ^ i4) * (-31115)) ^ (-494965557);
                        i6 = 709940451;
                    }
                    break;
                case -529076294:
                case 919573987:
                    if (RunnableC1564.m5345()) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۛۚ") ^ i3) * 7;
                        i5 = ((iM45029 ^ i4) * 15175) ^ 1798513769;
                        i6 = 1993434210;
                    } else {
                        iM45029 = (i4 - C19806.m45029("ܰ᩷")) * 127;
                        i5 = ((iM45029 ^ i3) * (-12209)) ^ 1885057977;
                        i6 = 101246155;
                    }
                    break;
                case -526464940:
                case 1644266078:
                    C3743.m10966();
                    return null;
                case -384909954:
                case -238701338:
                    if (C2642.f10294 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۛۚ") ^ i3) * 7;
                        i5 = ((iM45029 ^ i4) * 15175) ^ 1798513769;
                        i6 = 1993434210;
                    } else {
                        iM45029 = (C19806.m45029("۠᩺") ^ i4) * 41;
                        i5 = ((iM45029 ^ i3) * 8365) ^ 1910125540;
                        i6 = 1848171448;
                    }
                    break;
                case -223828158:
                case 947981026:
                    i = C20368.f65988;
                    iM45029 = C19806.m45029("ۛ᩺") ^ i4;
                    i5 = ((iM45029 ^ i3) * (-32611)) ^ 1073820966;
                    i6 = 420951403;
                    break;
                case -189984129:
                case 862334536:
                    if (C2788.m8472() == 0) {
                        iM45029 = C19806.m45029("֨۠") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-32543)) ^ (-792629587);
                        i6 = -385351292;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۛۚ") ^ i3) * 7;
                        i5 = ((iM45029 ^ i4) * 15175) ^ 1798513769;
                        i6 = 1993434210;
                    }
                    break;
                case -189646674:
                case 1640115480:
                    if (C1875.f7103 >= 0) {
                        iM45029 = (i3 - C19806.m45029("ܰᩳ")) * (-29);
                        i5 = ((iM45029 ^ i4) * 9299) ^ 1068793309;
                        i6 = 487584781;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳܰ") + i3) * 97;
                        i5 = ((iM45029 ^ i4) * (-8651)) ^ (-1003848548);
                        i6 = 1625483599;
                    }
                    break;
                case -158085754:
                case -39965357:
                    if (C0050.f912 > 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۛۚ") ^ i3) * 7;
                        i5 = ((iM45029 ^ i4) * 15175) ^ 1798513769;
                        i6 = 1993434210;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۛ֡") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-17889)) ^ (-1367812784);
                        i6 = 893262600;
                    }
                    break;
                case 109879726:
                case 1899866795:
                    C1148.m4225(textView, i);
                    textView.setLineSpacing(0.0f, 1.2f);
                    return textView;
                default:
                    if (C1461.f5957 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩻ۨ") ^ i4) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i5 = ((iM45029 ^ i3) * 19739) ^ 1838796526;
                        i6 = -2061196247;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۧۚ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-19725)) ^ 1789400005;
                        i6 = 1409639511;
                    }
                    break;
            }
        }
    }
}
