package l;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.os.IBinder;
import android.view.View;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.᩵ܿ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: F5X0 */
/* JADX INFO: loaded from: classes5.dex */
public class ServiceC20713 extends Service implements View.OnClickListener {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static String f66379 = null;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static String f66380 = "";

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C21246 f66381;

    /* JADX INFO: renamed from: ᩳ᩷᩷, reason: not valid java name and contains not printable characters */
    private static final short[] f66382 = {1446, 21675, 21688, 21689, 21673, -9287, 810, 15747, 12835, -12400, 9828, 21643, 21641, 21662, 21635, 21637, 21636, 21653, 21639, 21662, 21653, 21641, 21638, 21637, 21657, 21647, 21653, 21656, 21647, 21657, 21637, 21663, 21656, 21641, 21647, 21653, 21659, 21663, 21647, 21656, 21635, 21647, 21656, 4578, 7440, 7447, 7440, 7437};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final BroadcastReceiver f66383;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C21246 f66384;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C20733 f66385;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public BinderC3559 f66386;

    public ServiceC20713() {
        C23697 c23697 = null;
        int i = -1489151957;
        int i2 = C4238.f15451;
        int i3 = C3033.f9831;
        int iM3169 = C0773.m3169("ܶ۠") ^ i2;
        int i4 = ((iM3169 ^ i3) * (-22467)) ^ (-958230529);
        int i5 = -1451017163;
        while (true) {
            i = ((((i ^ i3) * (-28165)) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2025675908:
                case 247758006:
                    if (C17202.m40372()) {
                        iM3169 = C0773.m3169("۫ۖ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 2067) ^ 1428764757;
                        i5 = -1527175683;
                    } else {
                        iM3169 = C0773.m3169("᩵ۗ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-25553)) ^ 180888671;
                        i5 = 1380028905;
                    }
                    break;
                case -1974057133:
                case -404935971:
                    if (RunnableC3055.f9898 >= 0) {
                        iM3169 = C0773.m3169("᩵ۗ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-25553)) ^ 180888671;
                        i5 = 1380028905;
                    } else {
                        iM3169 = C0773.m3169("᩺֡") ^ i3;
                        i4 = ((iM3169 ^ i2) * 1663) ^ 362304179;
                        i5 = 1179736751;
                    }
                    break;
                case -1909822339:
                case 254002368:
                    C3033.m9845();
                    iM3169 = C0619.m2761("ܿܳ") ^ i3;
                    i4 = ((iM3169 ^ i2) * 20945) ^ 1092021488;
                    i5 = 1604808051;
                    break;
                case -1480425606:
                case -481120139:
                    AbstractC3624.m11755();
                    if (C0269.f1558 > 0) {
                        iM3169 = (C0773.m3169("ۙܰ") + i2) * 49;
                        i4 = ((iM3169 ^ i3) * (-65)) ^ (-1309441845);
                        i5 = -165711264;
                    } else {
                        iM3169 = C0619.m2761("ܿܳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 20945) ^ 1092021488;
                        i5 = 1604808051;
                    }
                    break;
                case -1450294430:
                case 2006037709:
                    if (AbstractC3624.f12429 <= 0) {
                        iM3169 = (C0773.m3169("֡ۘ") ^ i2) * (-67);
                        i4 = ((iM3169 ^ i3) * 12829) ^ 871926058;
                        i5 = 238821911;
                    } else {
                        iM3169 = (i2 - C0773.m3169("ۛ᩺")) * 15;
                        i4 = ((iM3169 ^ i3) * 13535) ^ 1560544542;
                        i5 = 2101674478;
                    }
                    break;
                case -1334073075:
                case -630828294:
                    C1826.m6301();
                    throw new RuntimeException();
                case -945599793:
                case 547239474:
                    if (C3077.f9998) {
                        iM3169 = (i2 - C0773.m3169("ۚ᩸")) * 97;
                        i4 = ((iM3169 ^ i3) * (-19931)) ^ 2029925707;
                        i5 = 772510758;
                    } else {
                        iM3169 = C0619.m2761("ܿܳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 20945) ^ 1092021488;
                        i5 = 1604808051;
                    }
                    break;
                case -907307624:
                case 1655261218:
                    if (C11235.f35427 >= 0) {
                        iM3169 = (C0773.m3169("֡ۘ") ^ i2) * (-67);
                        i4 = ((iM3169 ^ i3) * 12829) ^ 871926058;
                        i5 = 238821911;
                    } else {
                        iM3169 = C0773.m3169("ܶܿ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-10539)) ^ 1715149823;
                        i5 = 916525536;
                    }
                    break;
                case -845697595:
                case -513452846:
                    if (RunnableC1848.f6235) {
                        iM3169 = C0619.m2761("ܿܳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 20945) ^ 1092021488;
                        i5 = 1604808051;
                    } else {
                        iM3169 = C0619.m2761("᩺֨") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-2723)) ^ (-436058140);
                        i5 = 1897352584;
                    }
                    break;
                case -453666878:
                case 1430637874:
                    C0619.m2763();
                    if (C2966.f9654 >= 0) {
                        iM3169 = (C0773.m3169("ۙܰ") + i2) * 49;
                        i4 = ((iM3169 ^ i3) * (-65)) ^ (-1309441845);
                        i5 = -165711264;
                    } else {
                        iM3169 = (i3 - C0619.m2761("᩹ۧ")) * (-87);
                        i4 = ((iM3169 ^ i2) * (-25353)) ^ (-923390964);
                        i5 = -628399866;
                    }
                    break;
                case -386113780:
                case 523560822:
                    c23697 = new C23697(this);
                    if (C2834.f9334 <= 0) {
                        iM3169 = (C0773.m3169("֡ۘ") ^ i2) * (-67);
                        i4 = ((iM3169 ^ i3) * 12829) ^ 871926058;
                        i5 = 238821911;
                    } else {
                        iM3169 = C0773.m3169("᩹᩷") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-13173)) ^ 2011338024;
                        i5 = 575193457;
                    }
                    break;
                case -379777425:
                case 572346822:
                    this.f66383 = c23697;
                    return;
                case -337636893:
                case 353910349:
                    if (C1080.m4050()) {
                        iM3169 = (i3 - C0773.m3169("ۛܺ")) * (-125);
                        i4 = ((iM3169 ^ i2) * (-20397)) ^ (-2127658186);
                        i5 = 1807459602;
                    } else {
                        iM3169 = (C0773.m3169("֡ۘ") ^ i2) * (-67);
                        i4 = ((iM3169 ^ i3) * 12829) ^ 871926058;
                        i5 = 238821911;
                    }
                    break;
                case 307152287:
                case 1182415378:
                    if (C2878.f9462) {
                        iM3169 = (C0773.m3169("֡ۘ") ^ i2) * (-67);
                        i4 = ((iM3169 ^ i3) * 12829) ^ 871926058;
                        i5 = 238821911;
                    } else {
                        iM3169 = (C0619.m2761("ܳܿ") ^ i3) * (-23);
                        i4 = ((iM3169 ^ i2) * 23069) ^ 1571866666;
                        i5 = -1703463591;
                    }
                    break;
                case 600532241:
                case 1755321159:
                    C0269.m1775();
                    if (!C17202.f56030) {
                        iM3169 = C0619.m2761("ܿܳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 20945) ^ 1092021488;
                        i5 = 1604808051;
                    } else {
                        iM3169 = C0773.m3169("᩵ۗ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-25553)) ^ 180888671;
                        i5 = 1380028905;
                    }
                    break;
                default:
                    if (C0269.f1558 <= 0) {
                        iM3169 = (C0773.m3169("ۙܰ") + i2) * 49;
                        i4 = ((iM3169 ^ i3) * (-65)) ^ (-1309441845);
                        i5 = -165711264;
                    } else {
                        iM3169 = (C0773.m3169("ܽ᩹") ^ i3) * 21;
                        i4 = ((iM3169 ^ i2) * 12379) ^ 1752028983;
                        i5 = -1546016232;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0175 A[PHI: r2 r3 r5 r13 r14 r18
      0x0175: PHI (r2v3 l.᩵ܿ᩻) = (r2v2 l.᩵ܿ᩻), (r2v2 l.᩵ܿ᩻), (r2v5 l.᩵ܿ᩻) binds: [B:11:0x0067, B:41:0x015e, B:6:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x0175: PHI (r3v3 android.content.res.Resources) = (r3v2 android.content.res.Resources), (r3v2 android.content.res.Resources), (r3v5 android.content.res.Resources) binds: [B:11:0x0067, B:41:0x015e, B:6:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x0175: PHI (r5v5 int) = (r5v2 int), (r5v4 int), (r5v2 int) binds: [B:11:0x0067, B:41:0x015e, B:6:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x0175: PHI (r13v3 short[]) = (r13v2 short[]), (r13v2 short[]), (r13v5 short[]) binds: [B:11:0x0067, B:41:0x015e, B:6:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x0175: PHI (r14v3 int) = (r14v2 int), (r14v2 int), (r14v5 int) binds: [B:11:0x0067, B:41:0x015e, B:6:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x0175: PHI (r18v21 int) = (r18v4 int), (r18v13 int), (r18v24 int) binds: [B:11:0x0067, B:41:0x015e, B:6:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x0296 A[PHI: r4 r11 r12 r18 r20
      0x0296: PHI (r4v3 android.content.IntentFilter) = 
      (r4v1 android.content.IntentFilter)
      (r4v1 android.content.IntentFilter)
      (r4v2 android.content.IntentFilter)
      (r4v1 android.content.IntentFilter)
     binds: [B:67:0x0294, B:47:0x01a7, B:28:0x00d4, B:14:0x0074] A[DONT_GENERATE, DONT_INLINE]
      0x0296: PHI (r11v4 int) = (r11v2 int), (r11v3 int), (r11v2 int), (r11v2 int) binds: [B:67:0x0294, B:47:0x01a7, B:28:0x00d4, B:14:0x0074] A[DONT_GENERATE, DONT_INLINE]
      0x0296: PHI (r12v4 int) = (r12v2 int), (r12v3 int), (r12v2 int), (r12v2 int) binds: [B:67:0x0294, B:47:0x01a7, B:28:0x00d4, B:14:0x0074] A[DONT_GENERATE, DONT_INLINE]
      0x0296: PHI (r18v19 int) = (r18v5 int), (r18v12 int), (r18v16 int), (r18v20 int) binds: [B:67:0x0294, B:47:0x01a7, B:28:0x00d4, B:14:0x0074] A[DONT_GENERATE, DONT_INLINE]
      0x0296: PHI (r20v3 short) = (r20v2 short), (r20v1 short), (r20v1 short), (r20v1 short) binds: [B:67:0x0294, B:47:0x01a7, B:28:0x00d4, B:14:0x0074] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008f, code lost:
    
        if (l.C4238.f15451 >= 0) goto L18;
     */
    @Override // android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate() {
        /*
            Method dump skipped, instruction units count: 852
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ServiceC20713.onCreate():void");
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f66386;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0102 A[PHI: r1 r10
      0x0102: PHI (r1v4 int) = (r1v2 int), (r1v2 int), (r1v2 int), (r1v2 int), (r1v8 int) binds: [B:42:0x00ec, B:30:0x009b, B:23:0x005b, B:21:0x0051, B:28:0x0093] A[DONT_GENERATE, DONT_INLINE]
      0x0102: PHI (r10v7 java.lang.String) = 
      (r10v4 java.lang.String)
      (r10v3 java.lang.String)
      (r10v3 java.lang.String)
      (r10v3 java.lang.String)
      (r10v3 java.lang.String)
     binds: [B:42:0x00ec, B:30:0x009b, B:23:0x005b, B:21:0x0051, B:28:0x0093] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x0130 A[PHI: r7
      0x0130: PHI (r7v5 android.content.Intent) = (r7v4 android.content.Intent), (r7v6 android.content.Intent) binds: [B:47:0x012e, B:38:0x00ce] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x0196  */
    /* JADX WARN: Code duplicated, block: B:64:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:68:0x01f2  */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int iM3169;
        int i;
        String strM40388 = null;
        int i2 = 0;
        int i3 = 1682702661;
        int i4 = C3099.f10023;
        int i5 = C4282.f15546;
        int iM2761 = C0619.m2761("ܰ۫") ^ i4;
        int i6 = ((iM2761 ^ i5) * (-15803)) ^ 1994414298;
        int i7 = 2024497892;
        while (true) {
            int i8 = iM2761 ^ i7;
            Intent intent = null;
            while (true) {
                i3 = ((((i3 ^ i5) * 9823) >> 31) & i6) ^ i8;
                switch (i3) {
                    case -2055216932:
                    case 408808415:
                        if (AbstractC0116.m1243() == 0) {
                            intent = new Intent(this, (Class<?>) ViewOnClickListenerC12508.class);
                            if (C1146.f4234 >= 0) {
                                iM3169 = (i5 - C0619.m2761("ᩴۨ")) * (-93);
                                i6 = ((iM3169 ^ i4) * (-1615)) ^ 1212889805;
                                i = -363134731;
                            } else {
                                iM3169 = (i5 - C0773.m3169("۟ۧ")) * (-65);
                                i6 = ((iM3169 ^ i4) * (-22999)) ^ 964756933;
                                i = -1563005590;
                            }
                            i8 = iM3169 ^ i;
                        }
                        break;
                    case -2046701485:
                    case 62309663:
                        if (C3077.m10045(strM40388) < 100) {
                            iM3169 = (i4 - C0619.m2761("ܰۧ")) * (-77);
                            i6 = ((iM3169 ^ i5) * 25245) ^ (-336942780);
                            i = -1430847490;
                        } else {
                            iM3169 = (C0619.m2761("᩵ܿ") ^ i4) * 63;
                            i6 = ((iM3169 ^ i5) * (-3973)) ^ 257153400;
                            i = -1539091765;
                        }
                        i8 = iM3169 ^ i;
                        break;
                    case -1833588530:
                    case 1542127862:
                        C23916.m53419();
                        if (C2878.f9462) {
                            iM3169 = C0619.m2761("ܿۡ") ^ i5;
                            i6 = ((iM3169 ^ i4) * (-13131)) ^ (-992718353);
                            i = 440636797;
                        } else {
                            iM3169 = C0619.m2761("֡ۢ") ^ i5;
                            i6 = ((iM3169 ^ i4) * (-7889)) ^ (-773098432);
                            i = -1936011585;
                        }
                        i8 = iM3169 ^ i;
                        break;
                    case -1472609077:
                    case -571515163:
                        if (C20932.f66974 <= 0) {
                            iM3169 = C0619.m2761("ܿۡ") ^ i5;
                            i6 = ((iM3169 ^ i4) * (-13131)) ^ (-992718353);
                            i = 440636797;
                        } else {
                            iM3169 = (C0773.m3169("ܰۚ") ^ i4) * (-35);
                            i6 = ((iM3169 ^ i5) * 9759) ^ (-1011798650);
                            i = 876089497;
                        }
                        i8 = iM3169 ^ i;
                        break;
                    case -1320928348:
                    case 1960741166:
                        if (C23916.m53419() != 0) {
                            iM3169 = C0619.m2761("֡ۢ") ^ i5;
                            i6 = ((iM3169 ^ i4) * (-7889)) ^ (-773098432);
                            i = -1936011585;
                        } else {
                            iM3169 = C0773.m3169("᩹ۤ") ^ i4;
                            i6 = ((iM3169 ^ i5) * (-13263)) ^ 797988059;
                            i = 328425417;
                        }
                        i8 = iM3169 ^ i;
                        break;
                    case -1143423488:
                    case 1054920170:
                        C3448.m11248();
                        break;
                    case -1089837609:
                    case 2093097154:
                        if (C1519.f5300 >= 0) {
                            iM3169 = C0619.m2761("ܿۡ") ^ i5;
                            i6 = ((iM3169 ^ i4) * (-13131)) ^ (-992718353);
                            i = 440636797;
                        } else {
                            iM3169 = C0619.m2761("᩺ۛ") ^ i5;
                            i6 = ((iM3169 ^ i4) * (-1845)) ^ 1170354988;
                            i = -1780170992;
                        }
                        i8 = iM3169 ^ i;
                        break;
                    case -1062257311:
                    case 275922169:
                        AbstractC0116.m1232(intent, 268435456);
                        C2878.m9490(this, intent);
                        break;
                    case -973520317:
                    case -959309297:
                        if (C11235.m28315(strM40388, 10) == -1) {
                            int iM2762 = C0619.m2761("ᩴۗ") ^ i5;
                            i6 = ((iM2762 ^ i4) * 18965) ^ 1393535606;
                            i8 = iM2762 ^ 234984338;
                            i2 = -1;
                        } else {
                            i2 = -1;
                            iM3169 = (C0619.m2761("᩵ܿ") ^ i4) * 63;
                            i6 = ((iM3169 ^ i5) * (-3973)) ^ 257153400;
                            i = -1539091765;
                            i8 = iM3169 ^ i;
                        }
                        break;
                    case -973008291:
                    case -463707966:
                        f66380 = strM40388;
                        iM3169 = (C0619.m2761("᩵ܿ") ^ i4) * 63;
                        i6 = ((iM3169 ^ i5) * (-3973)) ^ 257153400;
                        i = -1539091765;
                        i8 = iM3169 ^ i;
                        break;
                    case -861960057:
                    case 1271045828:
                        if (C13473.f42873 != 0) {
                            iM3169 = (C0773.m3169("ܰۚ") ^ i4) * (-35);
                            i6 = ((iM3169 ^ i5) * 9759) ^ (-1011798650);
                            i = 876089497;
                        } else {
                            iM3169 = (C0619.m2761("ۙ֨") + i5) * (-127);
                            i6 = ((iM3169 ^ i4) * (-4075)) ^ 100275139;
                            i = -1581198519;
                        }
                        i8 = iM3169 ^ i;
                        break;
                    case -764441564:
                    case 1939391565:
                        if (C2419.f7754 >= 0) {
                            iM3169 = (C0773.m3169("ܰۚ") ^ i4) * (-35);
                            i6 = ((iM3169 ^ i5) * 9759) ^ (-1011798650);
                            i = 876089497;
                        } else {
                            iM3169 = (C0773.m3169("ᩴ֫") ^ i4) * 99;
                            i6 = ((iM3169 ^ i5) * (-5103)) ^ (-823259531);
                            i = 2095519020;
                        }
                        i8 = iM3169 ^ i;
                        break;
                    case -654463899:
                    case 1940098772:
                        C3448.m11248();
                        if (C1343.f4799 == 0) {
                        }
                        iM3169 = C0619.m2761("ܿۡ") ^ i5;
                        i6 = ((iM3169 ^ i4) * (-13131)) ^ (-992718353);
                        i = 440636797;
                        i8 = iM3169 ^ i;
                        break;
                    case -164660244:
                    case 1534684895:
                        if (AbstractC0641.f2496 < 0) {
                            iM3169 = (C0619.m2761("֨᩻") ^ i5) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                            i6 = ((iM3169 ^ i4) * (-17505)) ^ (-1936204569);
                            i = 363299722;
                            i8 = iM3169 ^ i;
                        }
                        break;
                    case 370066987:
                    case 964751084:
                        if (C23916.f77426 <= 0) {
                            iM3169 = (i5 - C0619.m2761("ᩴۨ")) * (-93);
                            i6 = ((iM3169 ^ i4) * (-1615)) ^ 1212889805;
                            i = -363134731;
                        } else {
                            iM3169 = C0619.m2761("۫᩸") ^ i5;
                            i6 = ((iM3169 ^ i4) * (-32217)) ^ (-714717149);
                            i = -254202097;
                        }
                        i8 = iM3169 ^ i;
                        break;
                    case 553221593:
                    case 2119131083:
                        if (AbstractC3624.m11755() == 0) {
                            iM3169 = (C0773.m3169("ܳᩴ") + i4) * (-27);
                            i6 = ((iM3169 ^ i5) * 10739) ^ 949717655;
                            i = 271538740;
                            i8 = iM3169 ^ i;
                        }
                        break;
                    case 554985506:
                    case 715200100:
                        if (C2375.m8073(strM40388, 13) == i2) {
                            iM3169 = (i4 - C0773.m3169("ܳ۟")) * 115;
                            i6 = ((iM3169 ^ i5) * (-29881)) ^ (-806669790);
                            i = 1792942227;
                        } else {
                            iM3169 = (C0619.m2761("᩵ܿ") ^ i4) * 63;
                            i6 = ((iM3169 ^ i5) * (-3973)) ^ 257153400;
                            i = -1539091765;
                        }
                        i8 = iM3169 ^ i;
                        break;
                    case 915736543:
                    case 2052201343:
                        strM40388 = AbstractActivityC17204.m40388();
                        if (strM40388 != null) {
                            iM3169 = C0773.m3169("ۛۖ") ^ i5;
                            i6 = ((iM3169 ^ i4) * (-31541)) ^ (-1895359020);
                            i = 655728977;
                        } else {
                            iM3169 = (C0619.m2761("᩵ܿ") ^ i4) * 63;
                            i6 = ((iM3169 ^ i5) * (-3973)) ^ 257153400;
                            i = -1539091765;
                        }
                        i8 = iM3169 ^ i;
                        break;
                    case 1164041622:
                    case 2127462631:
                        C0773.m3161();
                        iM3169 = C0619.m2761("ܿۡ") ^ i5;
                        i6 = ((iM3169 ^ i4) * (-13131)) ^ (-992718353);
                        i = 440636797;
                        i8 = iM3169 ^ i;
                        break;
                    default:
                        if (C3099.m10095()) {
                            iM3169 = (C0773.m3169("ܰۚ") ^ i4) * (-35);
                            i6 = ((iM3169 ^ i5) * 9759) ^ (-1011798650);
                            i = 876089497;
                        } else {
                            iM3169 = C0619.m2761("ۗۘ") ^ i4;
                            i6 = ((iM3169 ^ i5) * 20553) ^ 1853688610;
                            i = 570440472;
                        }
                        i8 = iM3169 ^ i;
                        break;
                }
                return;
            }
            iM2761 = (C0619.m2761("ܺ᩸") + i4) * (-65);
            i6 = ((iM2761 ^ i5) * (-259)) ^ (-338694348);
            i7 = -329234149;
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        String str = null;
        int i = -12914477;
        int i2 = C2702.f8586;
        int i3 = C1146.f4234;
        int iM3169 = C0773.m3169("۬ۛ") ^ i2;
        int i4 = ((iM3169 ^ i3) * 2711) ^ (-843154608);
        int i5 = -512180936;
        while (true) {
            i = ((((i ^ i3) * (-747)) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -1791680710:
                case 1055278074:
                    C1321.m4852();
                    C20932.m47848();
                    iM3169 = C0619.m2761("۫ۧ") ^ i3;
                    i4 = ((iM3169 ^ i2) * 15989) ^ 688638114;
                    i5 = -652288841;
                    break;
                case -1458141205:
                case 1528061436:
                    super.onDestroy();
                    if (C0862.f3233 != 0) {
                        iM3169 = C0619.m2761("۫ۧ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 15989) ^ 688638114;
                        i5 = -652288841;
                    } else {
                        iM3169 = (i2 - C0619.m2761("ۡۜ")) * (-55);
                        i4 = ((iM3169 ^ i3) * (-13327)) ^ (-1822455132);
                        i5 = 142755091;
                    }
                    break;
                case -1341596573:
                case 1563396278:
                    if (C1343.f4799 != 0) {
                        iM3169 = C0619.m2761("ᩳ۟") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-11305)) ^ (-91809417);
                        i5 = -1782563937;
                    } else {
                        iM3169 = C0773.m3169("ܿ۬") ^ i3;
                        i4 = ((iM3169 ^ i2) * 17705) ^ (-1303117075);
                        i5 = 175200569;
                    }
                    break;
                case -1307726569:
                case -625871876:
                    C21576.m49063(this.f66383);
                    break;
                case -1173823306:
                case 8206192:
                    str = null;
                    if (RunnableC3055.m9933() != 0) {
                        iM3169 = (i2 - C0619.m2761("ܺ᩸")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM3169 ^ i3) * 4189) ^ (-238814596);
                        i5 = -951175458;
                    } else {
                        iM3169 = (i2 - C0619.m2761("᩵ۤ")) * 3;
                        i4 = ((iM3169 ^ i3) * 5309) ^ (-883048245);
                        i5 = -889248709;
                    }
                    break;
                case -1012196421:
                case 410596532:
                    if (C1564.m5509() <= 0) {
                        iM3169 = C0619.m2761("ᩳ۟") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-11305)) ^ (-91809417);
                        i5 = -1782563937;
                    } else {
                        iM3169 = (C0773.m3169("ۢܺ") ^ i3) * 11;
                        i4 = ((iM3169 ^ i2) * (-4171)) ^ 1389402591;
                        i5 = 623919357;
                    }
                    break;
                case -579642488:
                case 827016304:
                    C2485.m8357();
                    if (C1321.f4751 < 0) {
                        iM3169 = C0619.m2761("ᩳ۟") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-11305)) ^ (-91809417);
                        i5 = -1782563937;
                    } else {
                        iM3169 = C0619.m2761("۫ۧ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 15989) ^ 688638114;
                        i5 = -652288841;
                    }
                    break;
                case -489279986:
                case 320746990:
                    this.f66385.m47428();
                    if (C1826.f6190 <= 0) {
                        iM3169 = C0773.m3169("۟۠") ^ i2;
                        i4 = ((iM3169 ^ i3) * 28683) ^ 1339659989;
                        i5 = 1988657063;
                    } else {
                        iM3169 = (i2 - C0773.m3169("ܰۜ")) * 37;
                        i4 = ((iM3169 ^ i3) * (-29613)) ^ (-856058243);
                        i5 = -974397113;
                    }
                    break;
                case -434979514:
                case 331096636:
                    f66379 = str;
                    if (C1783.m6232()) {
                        iM3169 = (i3 - C0619.m2761("ۚۗ")) * 97;
                        i4 = ((iM3169 ^ i2) * (-8853)) ^ (-1484962925);
                        i5 = 1065329323;
                    } else {
                        iM3169 = (i2 - C0619.m2761("ܺ᩸")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM3169 ^ i3) * 4189) ^ (-238814596);
                        i5 = -951175458;
                    }
                    break;
                case -374900734:
                case 1415486931:
                    if (C1783.f6087 <= 0) {
                        iM3169 = (i2 - C0773.m3169("֡ܽ")) * 99;
                        i4 = ((iM3169 ^ i3) * 6881) ^ (-1625371138);
                        i5 = 1873078200;
                    } else {
                        iM3169 = C0619.m2761("ۘۖ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-28669)) ^ 1997014735;
                        i5 = -1950013703;
                    }
                    break;
                case -45157651:
                case 1529988856:
                    if (C4238.f15451 >= 0) {
                        iM3169 = C0773.m3169("۟۠") ^ i2;
                        i4 = ((iM3169 ^ i3) * 28683) ^ 1339659989;
                        i5 = 1988657063;
                    } else {
                        iM3169 = (C0619.m2761("ۛ᩸") + i3) * 81;
                        i4 = ((iM3169 ^ i2) * (-25729)) ^ 72067772;
                        i5 = -2098413188;
                    }
                    break;
                case 579788369:
                case 1021581808:
                    if (C2354.f7599 >= 0) {
                        iM3169 = (i2 - C0773.m3169("֡ܽ")) * 99;
                        i4 = ((iM3169 ^ i3) * 6881) ^ (-1625371138);
                        i5 = 1873078200;
                    } else {
                        iM3169 = C0773.m3169("֫ۚ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-28287)) ^ (-1569235804);
                        i5 = -1256152098;
                    }
                    break;
                case 632971089:
                case 1629625496:
                    if (C0487.f2131 > 0) {
                        iM3169 = (i2 - C0773.m3169("֡ܽ")) * 99;
                        i4 = ((iM3169 ^ i3) * 6881) ^ (-1625371138);
                        i5 = 1873078200;
                    } else {
                        iM3169 = C0773.m3169("۟۠") ^ i2;
                        i4 = ((iM3169 ^ i3) * 28683) ^ 1339659989;
                        i5 = 1988657063;
                    }
                    break;
                case 1128363109:
                case 2027537786:
                    if (C2834.f9334 <= 0) {
                        iM3169 = C0619.m2761("ᩳ۟") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-11305)) ^ (-91809417);
                        i5 = -1782563937;
                    } else {
                        iM3169 = C0619.m2761("۬ۢ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 2787) ^ (-121312519);
                        i5 = -1829282523;
                    }
                    break;
                case 1299398657:
                case 1768382441:
                    C1826.m6301();
                    break;
                default:
                    if (C2354.f7599 >= 0) {
                        iM3169 = C0773.m3169("۟۠") ^ i2;
                        i4 = ((iM3169 ^ i3) * 28683) ^ 1339659989;
                        i5 = 1988657063;
                    } else {
                        iM3169 = C0619.m2761("۫ۧ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 15989) ^ 688638114;
                        i5 = -652288841;
                    }
                    break;
            }
            return;
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        short[] sArr = null;
        short s = 0;
        int i3 = 0;
        int i4 = 0;
        short s2 = 0;
        int i5 = 0;
        short[] sArr2 = null;
        int i6 = 0;
        int i7 = 0;
        int i8 = -329150442;
        int i9 = C2419.f7754;
        int i10 = RunnableC3055.f9898;
        int iM2761 = C0619.m2761("ۤ᩺") ^ i9;
        int i11 = ((iM2761 ^ i10) * 25793) ^ 1653376229;
        int i12 = 1496508345;
        while (true) {
            i8 = ((((i8 ^ i10) * (-979)) >> 31) & i11) ^ (iM2761 ^ i12);
            switch (i8) {
                case -2105854319:
                case -696081396:
                    if (C20932.m47848() != 0) {
                        iM2761 = C0773.m3169("۫֨") ^ i10;
                        i11 = ((iM2761 ^ i9) * 26811) ^ (-402078755);
                        i12 = 1133227833;
                    } else {
                        iM2761 = C0773.m3169("ۡܺ") ^ i9;
                        i11 = ((iM2761 ^ i10) * 8223) ^ (-1203879082);
                        i12 = 526613819;
                    }
                    break;
                case -2034245551:
                case -948025399:
                    if (C1826.f6190 > 0) {
                        iM2761 = C0773.m3169("ۛ۠") ^ i10;
                        i11 = ((iM2761 ^ i9) * 25621) ^ (-360274423);
                        i12 = -804691522;
                    } else {
                        iM2761 = (C0619.m2761("ܽᩳ") ^ i9) * 19;
                        i11 = ((iM2761 ^ i10) * 10645) ^ (-409926029);
                        i12 = 1263247215;
                    }
                    break;
                case -2015233563:
                case -617825945:
                    s = sArr[43];
                    i3 = s * s;
                    if (C0950.f3488 >= 0) {
                        iM2761 = C0773.m3169("۫֨") ^ i10;
                        i11 = ((iM2761 ^ i9) * 26811) ^ (-402078755);
                        i12 = 1133227833;
                    } else {
                        iM2761 = (C0773.m3169("ܶۡ") + i9) * (-59);
                        i11 = ((iM2761 ^ i10) * 17679) ^ 1281767941;
                        i12 = 1028914959;
                    }
                    break;
                case -1791406743:
                case 1050568334:
                    i5 = 5020;
                    iM2761 = C0619.m2761("ۜۛ") ^ i10;
                    i11 = ((iM2761 ^ i9) * 18171) ^ (-159425293);
                    i12 = 1881006214;
                    break;
                case -1760272184:
                case 1196058615:
                    if (AbstractC3624.f12429 <= 0) {
                        iM2761 = (C0619.m2761("ۚۤ") + i9) * (-79);
                        i11 = ((iM2761 ^ i10) * 26399) ^ 447873896;
                        i12 = 1685617349;
                    } else {
                        iM2761 = (C0619.m2761("ۢᩴ") ^ i10) * 17;
                        i11 = ((iM2761 ^ i9) * (-6661)) ^ 1662509529;
                        i12 = -436486763;
                    }
                    break;
                case -1711158147:
                case 1858085701:
                    if (intent != null) {
                        iM2761 = C0619.m2761("ۙۚ") ^ i10;
                        i11 = ((iM2761 ^ i9) * 8815) ^ 2034251176;
                        i12 = -344211390;
                    } else {
                        iM2761 = C0619.m2761("ܿܿ") ^ i9;
                        i11 = ((iM2761 ^ i10) * (-2529)) ^ (-1204643767);
                        i12 = 1296349831;
                    }
                    break;
                case -1449687904:
                case -92998500:
                    C0773.m3161();
                    if (AbstractC0116.f1064 > 0) {
                        iM2761 = (C0619.m2761("ۚۤ") + i9) * (-79);
                        i11 = ((iM2761 ^ i10) * 26399) ^ 447873896;
                        i12 = 1685617349;
                    } else {
                        iM2761 = (C0619.m2761("ܽᩳ") ^ i9) * 19;
                        i11 = ((iM2761 ^ i10) * 10645) ^ (-409926029);
                        i12 = 1263247215;
                    }
                    break;
                case -1384129746:
                case 1847992355:
                    if (C2419.m8174() >= 0) {
                        iM2761 = C0773.m3169("۫֨") ^ i10;
                        i11 = ((iM2761 ^ i9) * 26811) ^ (-402078755);
                        i12 = 1133227833;
                    } else {
                        iM2761 = (C0619.m2761("ۧ۬") + i9) * (-45);
                        i11 = ((iM2761 ^ i10) * (-31711)) ^ (-2079472975);
                        i12 = -1399097449;
                    }
                    break;
                case -1381622976:
                case -1318931066:
                    int i13 = 94595076 + i3;
                    i4 = i13 + i13;
                    s2 = 9726;
                    if (AbstractC0641.m2813() <= 0) {
                        iM2761 = C0773.m3169("ۛ۠") ^ i10;
                        i11 = ((iM2761 ^ i9) * 25621) ^ (-360274423);
                        i12 = -804691522;
                    } else {
                        iM2761 = (i9 - C0773.m3169("ᩴܽ")) * (-53);
                        i11 = ((iM2761 ^ i10) * (-9199)) ^ 468156614;
                        i12 = -1930458130;
                    }
                    break;
                case -1370009110:
                case -143858110:
                    if (C2310.f7472 >= 0) {
                        iM2761 = C0773.m3169("ۛ۠") ^ i10;
                        i11 = ((iM2761 ^ i9) * 25621) ^ (-360274423);
                        i12 = -804691522;
                    } else {
                        iM2761 = (i10 - C0619.m2761("ۤۛ")) * 13;
                        i11 = ((iM2761 ^ i9) * 6419) ^ 1047940536;
                        i12 = -321904765;
                    }
                    break;
                case -1350187147:
                case -409988067:
                    this.f66384 = f66381;
                    f66381 = null;
                    iM2761 = C0619.m2761("ܿܿ") ^ i9;
                    i11 = ((iM2761 ^ i10) * (-2529)) ^ (-1204643767);
                    i12 = 1296349831;
                    break;
                case -1113576949:
                case 264060970:
                    if (RunnableC1848.m6360()) {
                        iM2761 = C0619.m2761("᩻֨") ^ i10;
                        i11 = ((iM2761 ^ i9) * 28023) ^ (-422680722);
                        i12 = -846946521;
                    } else {
                        iM2761 = C0773.m3169("᩹ۙ") ^ i9;
                        i11 = ((iM2761 ^ i10) * (-9949)) ^ (-698614197);
                        i12 = -1901541917;
                    }
                    break;
                case -1017020159:
                case 1250413844:
                    if (this.f66385.m47429()) {
                        iM2761 = (C0619.m2761("ܺۧ") + i9) * (-81);
                        i11 = ((iM2761 ^ i10) * 5175) ^ (-970909737);
                        i12 = -1576357052;
                    } else {
                        iM2761 = (C0619.m2761("᩻ܺ") ^ i9) * 13;
                        i11 = ((iM2761 ^ i10) * (-21395)) ^ (-1101987658);
                        i12 = -519294606;
                    }
                    break;
                case -986473235:
                case -908453002:
                    if (this.f66384 != null) {
                        iM2761 = (C0773.m3169("ܶܶ") ^ i9) * (-125);
                        i11 = ((iM2761 ^ i10) * 12787) ^ 899864699;
                        i12 = -1632611873;
                    } else {
                        iM2761 = (C0619.m2761("֡ᩳ") + i9) * 101;
                        i11 = ((iM2761 ^ i10) * (-25031)) ^ 870988960;
                        i12 = -1840963122;
                    }
                    break;
                case -890985819:
                case 664490542:
                    C0773.m3161();
                    AbstractC0116.m1243();
                    return 0;
                case -783952347:
                case -9901352:
                    if (C1783.f6087 <= 0) {
                        iM2761 = C0773.m3169("ۛ۠") ^ i10;
                        i11 = ((iM2761 ^ i9) * 25621) ^ (-360274423);
                        i12 = -804691522;
                    } else {
                        iM2761 = (C0619.m2761("ۘ᩺") ^ i10) * (-25);
                        i11 = ((iM2761 ^ i9) * 8255) ^ (-1085409315);
                        i12 = -171757754;
                    }
                    break;
                case -706381252:
                case 251955005:
                    i5 = 7545;
                    iM2761 = C0619.m2761("ۜۛ") ^ i10;
                    i11 = ((iM2761 ^ i9) * 18171) ^ (-159425293);
                    i12 = 1881006214;
                    break;
                case -538870516:
                case 1142648319:
                    return 2;
                case -351555951:
                case 974474591:
                    C1080.m4050();
                    if (C2485.f7950 != 0) {
                        iM2761 = (C0619.m2761("ܽᩳ") ^ i9) * 19;
                        i11 = ((iM2761 ^ i10) * 10645) ^ (-409926029);
                        i12 = 1263247215;
                    } else {
                        iM2761 = C0619.m2761("᩻֨") ^ i10;
                        i11 = ((iM2761 ^ i9) * 28023) ^ (-422680722);
                        i12 = -846946521;
                    }
                    break;
                case -128204636:
                case 93697318:
                    if (intent.getBooleanExtra(C2023.m6966(sArr2, i6, i7, i5), false)) {
                        iM2761 = C0619.m2761("۬۬") ^ i10;
                        i11 = ((iM2761 ^ i9) * (-28877)) ^ (-1332483038);
                        i12 = 227294745;
                    } else {
                        iM2761 = C0619.m2761("ܿܿ") ^ i9;
                        i11 = ((iM2761 ^ i10) * (-2529)) ^ (-1204643767);
                        i12 = 1296349831;
                    }
                    break;
                case 23588071:
                case 2053884974:
                    sArr2 = f66382;
                    i6 = 44;
                    i7 = 4;
                    if (RunnableC0334.f1808 <= 0) {
                        iM2761 = (C0619.m2761("ܽᩳ") ^ i9) * 19;
                        i11 = ((iM2761 ^ i10) * 10645) ^ (-409926029);
                        i12 = 1263247215;
                    } else {
                        iM2761 = C0773.m3169("ۛ᩷") ^ i10;
                        i11 = ((iM2761 ^ i9) * (-27203)) ^ 1748791592;
                        i12 = -276190114;
                    }
                    break;
                case 45279324:
                case 856670053:
                    int i14 = s + s2;
                    if ((i14 * i14) - i4 <= 0) {
                        iM2761 = C0773.m3169("ܶܺ") ^ i10;
                        i11 = ((iM2761 ^ i9) * (-16419)) ^ 1307445603;
                        i12 = -451373443;
                    } else {
                        iM2761 = C0619.m2761("ܳ᩶") ^ i9;
                        i11 = ((iM2761 ^ i10) * (-8091)) ^ (-248224602);
                        i12 = 491681088;
                    }
                    break;
                case 115097577:
                case 1252981192:
                    sArr = f66382;
                    if (C2375.f7641 <= 0) {
                        iM2761 = C0773.m3169("ۛ۠") ^ i10;
                        i11 = ((iM2761 ^ i9) * 25621) ^ (-360274423);
                        i12 = -804691522;
                    } else {
                        iM2761 = C0619.m2761("᩺ۗ") ^ i10;
                        i11 = ((iM2761 ^ i9) * (-6417)) ^ 286195391;
                        i12 = 1845376508;
                    }
                    break;
                case 217895395:
                case 1432305316:
                    this.f66385.m47426();
                    iM2761 = (C0619.m2761("ܰۧ") ^ i10) * 75;
                    i11 = ((iM2761 ^ i9) * (-18007)) ^ (-1382972992);
                    i12 = -769509106;
                    break;
                case 622473304:
                case 1804794043:
                    C23916.m53419();
                    C0773.m3161();
                    iM2761 = C0619.m2761("᩻֨") ^ i10;
                    i11 = ((iM2761 ^ i9) * 28023) ^ (-422680722);
                    i12 = -846946521;
                    break;
                case 1128222897:
                case 1943535901:
                    this.f66385.show();
                    iM2761 = (C0619.m2761("ܰۧ") ^ i10) * 75;
                    i11 = ((iM2761 ^ i9) * (-18007)) ^ (-1382972992);
                    i12 = -769509106;
                    break;
                default:
                    stopSelf();
                    iM2761 = (C0619.m2761("ܰۧ") ^ i10) * 75;
                    i11 = ((iM2761 ^ i9) * (-18007)) ^ (-1382972992);
                    i12 = -769509106;
                    break;
            }
        }
    }
}
