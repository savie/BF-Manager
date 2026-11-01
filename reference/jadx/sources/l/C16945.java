package l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.ܽ᩺ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: F5X0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16945 extends BroadcastReceiver {

    /* JADX INFO: renamed from: ᩹ܶ۠, reason: not valid java name and contains not printable characters */
    private static final short[] f54170 = {4471, 28806, 28804, 28819, 28814, 28808, 28809, 28824, 28810, 28819, 28824, 28804, 28811, 28808, 28820, 28802, 28824, 28821, 28802, 28820, 28808, 28818, 28821, 28804, 28802, 28824, 28822, 28818, 28802, 28821, 28814, 28802, 28821};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ServiceC17650 f54171;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        short[] sArr = null;
        short s = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        short[] sArr2 = null;
        int i4 = 0;
        int i5 = 0;
        int i6 = 271146816;
        int i7 = C1025.f4800;
        int i8 = C2788.f10625;
        int iM45029 = C19806.m45029("ᩴ۬") ^ i8;
        int i9 = ((iM45029 ^ i7) * 8365) ^ (-1454342040);
        int i10 = 1117812209;
        while (true) {
            i6 = ((((i6 ^ i7) * 22787) >> 31) & i9) ^ (iM45029 ^ i10);
            switch (i6) {
                case -2125371461:
                case -623766942:
                    break;
                case -2033150149:
                case 808532799:
                    sArr = f54170;
                    if (C2332.m7079() <= 0) {
                        iM45029 = (C19806.m45029("ۘۧ") ^ i8) * 47;
                        i9 = ((iM45029 ^ i7) * 8115) ^ 1995750533;
                        i10 = -558921087;
                    } else {
                        iM45029 = C19806.m45029("ۚۢ") ^ i8;
                        i9 = ((iM45029 ^ i7) * 29635) ^ 774378542;
                        i10 = -1625874516;
                    }
                    break;
                case -1950085026:
                case -1331973194:
                    sArr2 = f54170;
                    i4 = 1;
                    i5 = 32;
                    if (C2704.f10408) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۧۢ") + i8) * (-57);
                        i9 = ((iM45029 ^ i7) * (-10365)) ^ 5291489;
                        i10 = 10742291;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۚ֨") ^ i7;
                        i9 = ((iM45029 ^ i8) * (-27625)) ^ (-160040754);
                        i10 = 1983706893;
                    }
                    break;
                case -1916200821:
                case -1035398129:
                    i = s * 19798;
                    i2 = s * s;
                    if (C3535.f13026 <= 0) {
                        iM45029 = (C19806.m45029("ۘۧ") ^ i8) * 47;
                        i9 = ((iM45029 ^ i7) * 8115) ^ 1995750533;
                        i10 = -558921087;
                    } else {
                        iM45029 = C19806.m45029("۟᩸") ^ i7;
                        i9 = ((iM45029 ^ i8) * (-22485)) ^ (-334371558);
                        i10 = -1770851583;
                    }
                    break;
                case -1756518945:
                case 503065018:
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۚ֨") ^ i7;
                        i9 = ((iM45029 ^ i8) * (-27625)) ^ (-160040754);
                        i10 = 1983706893;
                    } else {
                        iM45029 = C19806.m45029("ۨۖ") ^ i7;
                        i9 = ((iM45029 ^ i8) * 19153) ^ 14411128;
                        i10 = 560902024;
                    }
                    break;
                case -1743475626:
                case -673063397:
                    C3722.m10894();
                    iM45029 = ThreadFactoryC3888.m11306("ۚ֨") ^ i7;
                    i9 = ((iM45029 ^ i8) * (-27625)) ^ (-160040754);
                    i10 = 1983706893;
                    break;
                case -1500653108:
                case 1142475539:
                    C2642.m8171();
                    break;
                case -1470377363:
                case 1564435332:
                    if (C1460.m5058(C10634.m26821(sArr2, i4, i5, i3), intent.getAction())) {
                        iM45029 = (C19806.m45029("ۧۜ") + i8) * 123;
                        i9 = ((iM45029 ^ i7) * (-13353)) ^ 46234590;
                        i10 = -878018189;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܶܰ") ^ i7;
                        i9 = ((iM45029 ^ i8) * (-2241)) ^ (-1453129532);
                        i10 = 174260247;
                    }
                    break;
                case -1268988498:
                case 27160154:
                    this.f54171.stopSelf();
                    iM45029 = ThreadFactoryC3888.m11306("ܶܰ") ^ i7;
                    i9 = ((iM45029 ^ i8) * (-2241)) ^ (-1453129532);
                    i10 = 174260247;
                    break;
                case -1180071115:
                case 1521713276:
                    if (C3722.f13525 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۜۜ") ^ i7;
                        i9 = ((iM45029 ^ i8) * (-2753)) ^ 1510026238;
                        i10 = -319923988;
                    } else {
                        iM45029 = (C19806.m45029("ۘۧ") ^ i8) * 47;
                        i9 = ((iM45029 ^ i7) * 8115) ^ 1995750533;
                        i10 = -558921087;
                    }
                    break;
                case -929944829:
                case -640388810:
                    if (C7105.f23796 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۜۜ") ^ i7;
                        i9 = ((iM45029 ^ i8) * (-2753)) ^ 1510026238;
                        i10 = -319923988;
                    } else {
                        iM45029 = (i8 - C19806.m45029("֨ۛ")) * (-33);
                        i9 = ((iM45029 ^ i7) * 24803) ^ (-1666404322);
                        i10 = -1963621796;
                    }
                    break;
                case -527568010:
                case -237008983:
                    if (C2249.f8050 >= 0) {
                        iM45029 = (C19806.m45029("ۘۧ") ^ i8) * 47;
                        i9 = ((iM45029 ^ i7) * 8115) ^ 1995750533;
                        i10 = -558921087;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩵֫") ^ i8;
                        i9 = ((iM45029 ^ i7) * 29111) ^ (-1947066090);
                        i10 = -382592859;
                    }
                    break;
                case -515967255:
                case -423709535:
                    if (C3743.f13569) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩻۬") ^ i7) * (-75);
                        i9 = ((iM45029 ^ i8) * 3857) ^ 191220452;
                        i10 = 1565377805;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֫ܽ") ^ i7;
                        i9 = ((iM45029 ^ i8) * 22495) ^ 251278109;
                        i10 = -644903625;
                    }
                    break;
                case 16750180:
                case 1200997847:
                    if (C1419.f5860 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֫ܽ") ^ i7;
                        i9 = ((iM45029 ^ i8) * 22495) ^ 251278109;
                        i10 = -644903625;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۗ۫") ^ i8;
                        i9 = ((iM45029 ^ i7) * 1811) ^ 356008610;
                        i10 = 205144340;
                    }
                    break;
                case 120885997:
                case 986875628:
                    i3 = 28871;
                    iM45029 = (i8 - C19806.m45029("ܶ֡")) * (-79);
                    i9 = ((iM45029 ^ i7) * 13231) ^ (-513479388);
                    i10 = 1883787365;
                    break;
                case 155111178:
                case 930676130:
                    if (C1025.m3861() > 0) {
                        iM45029 = (C19806.m45029("ۘۧ") ^ i8) * 47;
                        i9 = ((iM45029 ^ i7) * 8115) ^ 1995750533;
                        i10 = -558921087;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۚ֨") ^ i7;
                        i9 = ((iM45029 ^ i8) * (-27625)) ^ (-160040754);
                        i10 = 1983706893;
                    }
                    break;
                case 723587481:
                case 997466728:
                    i3 = 6191;
                    iM45029 = (i8 - C19806.m45029("ܶ֡")) * (-79);
                    i9 = ((iM45029 ^ i7) * 13231) ^ (-513479388);
                    i10 = 1883787365;
                    break;
                case 895433034:
                case 1021299621:
                    if (C1668.f6641 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۚ֨") ^ i7;
                        i9 = ((iM45029 ^ i8) * (-27625)) ^ (-160040754);
                        i10 = 1983706893;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۘۗ") ^ i7;
                        i9 = ((iM45029 ^ i8) * 201) ^ 2136722213;
                        i10 = -1759187993;
                    }
                    break;
                case 1187244215:
                case 1190561421:
                    if (i - (97990201 + i2) <= 0) {
                        iM45029 = (C19806.m45029("ۙ᩵") + i8) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i9 = ((iM45029 ^ i7) * (-9057)) ^ (-1767436190);
                        i10 = 1410174878;
                    } else {
                        iM45029 = (C19806.m45029("ܺۜ") + i7) * (-87);
                        i9 = ((iM45029 ^ i8) * 6159) ^ 3563280;
                        i10 = 675509425;
                    }
                    break;
                case 1257844274:
                case 2034734511:
                    s = sArr[0];
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM45029 = (i8 - ThreadFactoryC3888.m11306("ۗܳ")) * 71;
                        i9 = ((iM45029 ^ i7) * (-15789)) ^ 1021441394;
                        i10 = 263574474;
                    } else {
                        iM45029 = (i7 - C19806.m45029("ۗۙ")) * 63;
                        i9 = ((iM45029 ^ i8) * (-1037)) ^ (-1710499141);
                        i10 = -698582568;
                    }
                    break;
                default:
                    C1977.m6356();
                    if (C1148.f5161 > 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֫ܽ") ^ i7;
                        i9 = ((iM45029 ^ i8) * 22495) ^ 251278109;
                        i10 = -644903625;
                    } else {
                        iM45029 = (C19806.m45029("ۘۧ") ^ i8) * 47;
                        i9 = ((iM45029 ^ i7) * 8115) ^ 1995750533;
                        i10 = -558921087;
                    }
                    break;
            }
            return;
        }
    }

    public C16945(ServiceC17650 serviceC17650) {
        this.f54171 = serviceC17650;
    }
}
