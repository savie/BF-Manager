package l;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۛ᩺ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5YQ */
/* JADX INFO: loaded from: classes3.dex */
public class ViewOnClickListenerC6361 extends AbstractActivityC12483 implements View.OnClickListener, View.OnKeyListener, ServiceConnection {

    /* JADX INFO: renamed from: ᩴ᩸ۡ, reason: not valid java name and contains not printable characters */
    private static final short[] f21428 = {749, 29493, 24037, 32635, -23872, 30533, -17889, 18596, -16583, -19424, 2300, -3865, 11, 3526, 4130, 2153, 5789, -4850, -6181, -6544, 4474, -5523, 635, -4312, -388, -8319, -5340, -6494, -8369, -5359, -7246, -5923, -4035, -3676, 800, -2720, -8883, -1719, -7234, -6229, 843, 5642, 15931, -6562, -1820, -1855, 13197, 7851, 2079, 31633, -32446, -29534, 7315, -28412, -28361, -28362, -28378, -28396, -28368, -28384, -28361, -28356, -28412, -28378, -28367, -28372, -28365, -28372, -28367, -28356};

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public boolean f21429 = false;

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public C15492 f21430;

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public BinderC12712 f21431;

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public long f21432;

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public ViewOnClickListenerC23253 f21433;

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }

    @Override // l.AbstractActivityC12483
    /* JADX INFO: renamed from: ۙ */
    public final void mo121(C4014 c4014) {
    }

    @Override // l.AbstractActivityC12483
    /* JADX INFO: renamed from: ۡ */
    public final String mo126() {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i = 0;
        short s3 = 0;
        int i2 = 0;
        int i3 = 0;
        short[] sArr2 = null;
        int i4 = 0;
        int i5 = 1328821644;
        int i6 = C1937.f7317;
        int i7 = C3660.f13403;
        int iM11306 = (ThreadFactoryC3888.m11306("ܽܶ") + i6) * (-11);
        int i8 = ((iM11306 ^ i7) * (-7713)) ^ (-1491599891);
        int i9 = -1453972575;
        while (true) {
            i5 = ((((i5 ^ i7) * 4163) >> 31) & i8) ^ (iM11306 ^ i9);
            switch (i5) {
                case -1996040996:
                case -1005759773:
                    C3535.m10431();
                    return null;
                case -1924845299:
                case 1210461417:
                    C1025.m3861();
                    if (C2871.f10837 < 0) {
                        iM11306 = (i6 - C19806.m45029("ۤ֡")) * 119;
                        i8 = ((iM11306 ^ i7) * (-5889)) ^ 99970116;
                        i9 = 987267706;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۧ֨") ^ i6;
                        i8 = ((iM11306 ^ i7) * 14385) ^ (-2080422816);
                        i9 = 1656388112;
                    }
                    break;
                case -1924144086:
                case -1107101531:
                    sArr2 = f21428;
                    i4 = 53;
                    if (C1937.m6279() >= 0) {
                        iM11306 = (i7 - C19806.m45029("ᩳܽ")) * 17;
                        i8 = ((iM11306 ^ i6) * (-23955)) ^ 598832383;
                        i9 = -760744897;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֨ᩴ") + i7) * 53;
                        i8 = ((iM11306 ^ i6) * (-21973)) ^ (-1771386289);
                        i9 = 1011434046;
                    }
                    break;
                case -1751953357:
                case 2072661121:
                    if (RunnableC3388.f12514 >= 0) {
                        iM11306 = C19806.m45029("۫۟") ^ i6;
                        i8 = ((iM11306 ^ i7) * 13781) ^ (-861334419);
                        i9 = 884566291;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۤܺ") ^ i7;
                        i8 = ((iM11306 ^ i6) * 5711) ^ (-1096391309);
                        i9 = -389128247;
                    }
                    break;
                case -1715571094:
                case 1617366807:
                    if ((i2 * i2) - i < 0) {
                        iM11306 = (i7 - C19806.m45029("᩺ۘ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i8 = ((iM11306 ^ i6) * 11565) ^ (-35417304);
                        i9 = 68341746;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۖ᩺") ^ i7) * 9;
                        i8 = ((iM11306 ^ i6) * (-15259)) ^ 80635472;
                        i9 = 462855735;
                    }
                    break;
                case -1584854757:
                case 1434245163:
                    s = sArr[c];
                    s2 = 59636;
                    if (MenuItemOnMenuItemClickListenerC3244.m9701() >= 0) {
                        iM11306 = (C19806.m45029("᩶᩶") ^ i7) * 3;
                        i8 = ((iM11306 ^ i6) * 30549) ^ 1523434320;
                        i9 = 1246592900;
                    } else {
                        iM11306 = C19806.m45029("֨ᩳ") ^ i7;
                        i8 = ((iM11306 ^ i6) * (-19337)) ^ (-1691441012);
                        i9 = 1236472770;
                    }
                    break;
                case -1360253398:
                case -1298006141:
                    C0629.m2907();
                    if (C0216.f1393 == 0) {
                        iM11306 = (i7 - C19806.m45029("ᩳܽ")) * 17;
                        i8 = ((iM11306 ^ i6) * (-23955)) ^ 598832383;
                        i9 = -760744897;
                    } else {
                        iM11306 = C19806.m45029("۫۟") ^ i6;
                        i8 = ((iM11306 ^ i7) * 13781) ^ (-861334419);
                        i9 = 884566291;
                    }
                    break;
                case -1057049706:
                case -558013923:
                    C3535.m10431();
                    if (C1419.f5860 < 0) {
                        iM11306 = C19806.m45029("۫۟") ^ i6;
                        i8 = ((iM11306 ^ i7) * 13781) ^ (-861334419);
                        i9 = 884566291;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۧ֨") ^ i6;
                        i8 = ((iM11306 ^ i7) * 14385) ^ (-2080422816);
                        i9 = 1656388112;
                    }
                    break;
                case -1053376360:
                case -154656648:
                    if (AbstractC0464.f2088 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۧ֨") ^ i6;
                        i8 = ((iM11306 ^ i7) * 14385) ^ (-2080422816);
                        i9 = 1656388112;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩶ᩳ") ^ i7;
                        i8 = ((iM11306 ^ i6) * (-16879)) ^ 1768830647;
                        i9 = -962186415;
                    }
                    break;
                case -1034464531:
                case 2131868916:
                    i2 = s + s3;
                    if (C2642.f10294 <= 0) {
                        iM11306 = C19806.m45029("۫۟") ^ i6;
                        i8 = ((iM11306 ^ i7) * 13781) ^ (-861334419);
                        i9 = 884566291;
                    } else {
                        iM11306 = C19806.m45029("᩹ۚ") ^ i6;
                        i8 = ((iM11306 ^ i7) * (-18415)) ^ (-1402582046);
                        i9 = 1912682630;
                    }
                    break;
                case -625989999:
                case 2005607199:
                    sArr = f21428;
                    if (C0278.m1789() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۧ֨") ^ i6;
                        i8 = ((iM11306 ^ i7) * 14385) ^ (-2080422816);
                        i9 = 1656388112;
                    } else {
                        iM11306 = C19806.m45029("ܳܺ") ^ i6;
                        i8 = ((iM11306 ^ i7) * 5745) ^ 1751914713;
                        i9 = 494187378;
                    }
                    break;
                case -568460470:
                case 1626618549:
                    i = s * s2;
                    s3 = 14909;
                    if (C0216.m1591() <= 0) {
                        iM11306 = (i6 - C19806.m45029("ۤ֡")) * 119;
                        i8 = ((iM11306 ^ i7) * (-5889)) ^ 99970116;
                        i9 = 987267706;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۫ۖ") ^ i6) * 9;
                        i8 = ((iM11306 ^ i7) * 18391) ^ 1660433082;
                        i9 = 917525922;
                    }
                    break;
                case -553270998:
                case 38695365:
                    C0629.m2907();
                    iM11306 = ThreadFactoryC3888.m11306("ۧ֨") ^ i6;
                    i8 = ((iM11306 ^ i7) * 14385) ^ (-2080422816);
                    i9 = 1656388112;
                    break;
                case -332548133:
                case 1359699119:
                    if (C1461.m5080()) {
                        iM11306 = (i7 - C19806.m45029("ᩳܽ")) * 17;
                        i8 = ((iM11306 ^ i6) * (-23955)) ^ 598832383;
                        i9 = -760744897;
                    } else {
                        iM11306 = C19806.m45029("۠ᩳ") ^ i7;
                        i8 = ((iM11306 ^ i6) * 18503) ^ (-676718379);
                        i9 = -1488452676;
                    }
                    break;
                case 39902338:
                case 1320408680:
                    i3 = 37189;
                    iM11306 = (i6 - C19806.m45029("ܰ᩺")) * (-19);
                    i8 = ((iM11306 ^ i7) * 7881) ^ (-303013685);
                    i9 = 1058484674;
                    break;
                case 549147559:
                case 2137039452:
                    c = '4';
                    if (C1668.f6641 >= 0) {
                        iM11306 = (i7 - C19806.m45029("ᩳܽ")) * 17;
                        i8 = ((iM11306 ^ i6) * (-23955)) ^ 598832383;
                        i9 = -760744897;
                    } else {
                        iM11306 = (C19806.m45029("֡۠") ^ i6) * (-13);
                        i8 = ((iM11306 ^ i7) * 14439) ^ (-773382045);
                        i9 = 1377232221;
                    }
                    break;
                case 820432236:
                case 1253305554:
                    if (C2477.f9839 <= 0) {
                        iM11306 = (C19806.m45029("᩶᩶") ^ i7) * 3;
                        i8 = ((iM11306 ^ i6) * 30549) ^ 1523434320;
                        i9 = 1246592900;
                    } else {
                        iM11306 = (C19806.m45029("ܽۖ") ^ i6) * (-31);
                        i8 = ((iM11306 ^ i7) * 881) ^ 381423893;
                        i9 = -474408985;
                    }
                    break;
                case 961857208:
                case 1535109157:
                    return RunnableC1895.m6164(sArr2, i4, 17, i3);
                default:
                    i3 = 24355;
                    iM11306 = (i6 - C19806.m45029("ܰ᩺")) * (-19);
                    i8 = ((iM11306 ^ i7) * 7881) ^ (-303013685);
                    i9 = 1058484674;
                    break;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        short[] sArr = null;
        short s = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 880645788;
        int i4 = C1189.f5284;
        int i5 = RunnableC1606.f6488;
        int iM11306 = ThreadFactoryC3888.m11306("ۤܳ") ^ i4;
        int i6 = ((iM11306 ^ i5) * 3429) ^ 966791054;
        int i7 = 436224296;
        while (true) {
            i3 = ((((i3 ^ i5) * (-20837)) >> 31) & i6) ^ (iM11306 ^ i7);
            switch (i3) {
                case -2144363443:
                case -683732461:
                    BinderC12712 binderC12712 = (BinderC12712) iBinder;
                    this.f21431 = binderC12712;
                    binderC12712.m31558();
                    if (C7105.f23796 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("۫ܿ") ^ i5) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i6 = ((iM11306 ^ i4) * 15691) ^ 778357402;
                        i7 = 1966250132;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩻۟") ^ i5) * (-67);
                        i6 = ((iM11306 ^ i4) * 6777) ^ 1785614152;
                        i7 = 520463053;
                    }
                    break;
                case -2079149284:
                case 608195425:
                    short[] sArr2 = f21428;
                    if (C1148.f5161 > 0) {
                        String strM26821 = C10634.m26821(sArr2, 49, 3, i2);
                        if (C3660.m10791() == 0) {
                            int iM11307 = ThreadFactoryC3888.m11306(strM26821);
                            if (!RunnableC1564.f6300) {
                                View viewM1436 = RunnableC0195.m1436(this, iM11307 ^ 2098367195);
                                if (C2124.f7782 > 0) {
                                    C6037 c6037M31559 = this.f21431.m31559();
                                    if (C0671.f2816 == 0) {
                                        ViewOnClickListenerC23253 viewOnClickListenerC23253 = new ViewOnClickListenerC23253(this, viewM1436, c6037M31559);
                                        this.f21433 = viewOnClickListenerC23253;
                                        viewOnClickListenerC23253.m51322(ServiceC17650.f56094);
                                    }
                                    break;
                                }
                            }
                            iM11306 = (C19806.m45029("ܰܿ") + i5) * 83;
                            i6 = ((iM11306 ^ i4) * 7671) ^ (-320684403);
                            i7 = 1493541981;
                        } else {
                            iM11306 = (ThreadFactoryC3888.m11306("ܳ᩹") + i4) * (-19);
                            i6 = ((iM11306 ^ i5) * (-31631)) ^ 826307695;
                            i7 = 760409305;
                        }
                        break;
                    }
                    iM11306 = (ThreadFactoryC3888.m11306("۫ܿ") ^ i5) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i6 = ((iM11306 ^ i4) * 15691) ^ 778357402;
                    i7 = 1966250132;
                    break;
                case -2058030778:
                case -558040114:
                    s = sArr[48];
                    if (C0278.f1572 <= 0) {
                        iM11306 = (C19806.m45029("۫֨") ^ i5) * (-117);
                        i6 = ((iM11306 ^ i4) * 5535) ^ 660226872;
                        i7 = 1491765900;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۡۛ") ^ i4;
                        i6 = ((iM11306 ^ i5) * 24143) ^ (-611001296);
                        i7 = -2129450093;
                    }
                    break;
                case -2056818396:
                case -1097964515:
                    i2 = 22507;
                    iM11306 = ThreadFactoryC3888.m11306("۟۟") ^ i4;
                    i6 = ((iM11306 ^ i5) * (-16791)) ^ (-1232908561);
                    i7 = -1485212734;
                    break;
                case -2013312046:
                case -313182818:
                    C2477.m7593();
                    if (C7105.f23796 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("۫ܿ") ^ i5) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i6 = ((iM11306 ^ i4) * 15691) ^ 778357402;
                        i7 = 1966250132;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩺֫") ^ i4;
                        i6 = ((iM11306 ^ i5) * 23727) ^ (-863713425);
                        i7 = 1919890820;
                    }
                    break;
                case -1798564061:
                case 934352428:
                    sArr = f21428;
                    if (C2332.f8260) {
                        iM11306 = ThreadFactoryC3888.m11306("ۡۢ") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-9865)) ^ (-1591558544);
                        i7 = 829157687;
                    } else {
                        iM11306 = (C19806.m45029("ܰܿ") + i5) * 83;
                        i6 = ((iM11306 ^ i4) * 7671) ^ (-320684403);
                        i7 = 1493541981;
                    }
                    break;
                case -1775286923:
                case -246067784:
                    int i8 = s + 13281;
                    i = i8 * i8;
                    if (C0526.f2219) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܳ᩹") + i4) * (-19);
                        i6 = ((iM11306 ^ i5) * (-31631)) ^ 826307695;
                        i7 = 760409305;
                    } else {
                        iM11306 = C19806.m45029("ܿ۫") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-24095)) ^ (-1263186270);
                        i7 = -1940704453;
                    }
                    break;
                case -1707042120:
                case 1758660793:
                    if (!C3743.f13569) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܳ᩹") + i4) * (-19);
                        i6 = ((iM11306 ^ i5) * (-31631)) ^ 826307695;
                        i7 = 760409305;
                    } else {
                        iM11306 = (C19806.m45029("۫֨") ^ i5) * (-117);
                        i6 = ((iM11306 ^ i4) * 5535) ^ 660226872;
                        i7 = 1491765900;
                    }
                    break;
                case -1391430215:
                case 978491771:
                    if (!C0962.f3784) {
                        iM11306 = (ThreadFactoryC3888.m11306("۫ܿ") ^ i5) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i6 = ((iM11306 ^ i4) * 15691) ^ 778357402;
                        i7 = 1966250132;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܳ᩹") + i4) * (-19);
                        i6 = ((iM11306 ^ i5) * (-31631)) ^ 826307695;
                        i7 = 760409305;
                    }
                    break;
                case -1174591927:
                case 1460032273:
                    i2 = 61617;
                    iM11306 = ThreadFactoryC3888.m11306("۟۟") ^ i4;
                    i6 = ((iM11306 ^ i5) * (-16791)) ^ (-1232908561);
                    i7 = -1485212734;
                    break;
                case -922097187:
                case 704722904:
                    C0671.m3008();
                    break;
                case -352304120:
                case 1669595759:
                    if ((53124 * s) - i > 0) {
                        iM11306 = (C19806.m45029("ܶᩴ") + i4) * 61;
                        i6 = ((iM11306 ^ i5) * (-14157)) ^ 248119912;
                        i7 = 1148362263;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩶ۤ") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-29107)) ^ 1024900483;
                        i7 = -1194148121;
                    }
                    break;
                case 160056486:
                case 1782982614:
                    if (C1937.f7317 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("۫ܿ") ^ i5) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i6 = ((iM11306 ^ i4) * 15691) ^ 778357402;
                        i7 = 1966250132;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܺۖ") ^ i4;
                        i6 = ((iM11306 ^ i5) * 9115) ^ 545188888;
                        i7 = 1207388865;
                    }
                    break;
                default:
                    C3535.m10431();
                    iM11306 = (ThreadFactoryC3888.m11306("۫ܿ") ^ i5) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i6 = ((iM11306 ^ i4) * 15691) ^ 778357402;
                    i7 = 1966250132;
                    break;
            }
            return;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 17341. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // l.AbstractActivityC12483, l.ActivityC4866, l.ActivityC19126, l.ActivityC1086, l.ActivityC16858, android.app.Activity
    public final void onCreate(android.os.Bundle r41) {
        /*
            Method dump skipped, instruction units count: 1734
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC6361.onCreate(android.os.Bundle):void");
    }

    @Override // l.AbstractActivityC12483, l.ActivityC10074, l.ActivityC19126, android.app.Activity
    public final void onDestroy() {
        C15492 c15492 = null;
        int i = -1564950118;
        int i2 = C2788.f10625;
        int i3 = C10634.f36300;
        int iM45029 = (C19806.m45029("ۧᩳ") + i3) * (-29);
        int i4 = ((iM45029 ^ i2) * 19691) ^ 2028693083;
        int i5 = -145942966;
        while (true) {
            i = ((((i ^ i2) * (-18011)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2115002457:
                case 870689880:
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("۫ܽ") ^ i3) * 23;
                        i4 = ((iM45029 ^ i2) * 25441) ^ 399345585;
                        i5 = 1846750680;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩻۫") ^ i3) * 55;
                        i4 = ((iM45029 ^ i2) * (-10161)) ^ (-1204381);
                        i5 = -289615560;
                    }
                    break;
                case -1982793234:
                case -315901028:
                    if (C3535.m10431() <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۤ᩺") ^ i3) * 49;
                        i4 = ((iM45029 ^ i2) * 9059) ^ 1688032653;
                        i5 = 580823022;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩻᩶") ^ i2) * 115;
                        i4 = ((iM45029 ^ i3) * 16089) ^ 1386585281;
                        i5 = 1986008359;
                    }
                    break;
                case -1950493191:
                case -1222195602:
                    if (C1025.f4800 >= 0) {
                        iM45029 = C19806.m45029("ܳ֨") ^ i3;
                        i4 = ((iM45029 ^ i2) * 13647) ^ (-252087436);
                        i5 = -1292680804;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩳᩳ") ^ i3) * (-15);
                        i4 = ((iM45029 ^ i2) * (-32325)) ^ 1096683149;
                        i5 = 1197238453;
                    }
                    break;
                case -1810161362:
                case -1798587686:
                    if (C0671.f2816 != 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۤ᩺") ^ i3) * 49;
                        i4 = ((iM45029 ^ i2) * 9059) ^ 1688032653;
                        i5 = 580823022;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۤܺ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 13031) ^ (-412106894);
                        i5 = -435447208;
                    }
                    break;
                case -1581927585:
                case -1386691581:
                    C2642.m8171();
                    C2704.m8255();
                    break;
                case -1424409105:
                case 204464933:
                    super.onDestroy();
                    if (C1461.m5080()) {
                        iM45029 = (C19806.m45029("ۨۛ") ^ i2) * 61;
                        i4 = ((iM45029 ^ i3) * 10793) ^ (-378570254);
                        i5 = -1633040707;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۬۟") ^ i2;
                        i4 = ((iM45029 ^ i3) * 2209) ^ (-1466724583);
                        i5 = 1657336267;
                    }
                    break;
                case -641279201:
                case 1196173223:
                    if (C1937.f7317 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۤ᩺") ^ i3) * 49;
                        i4 = ((iM45029 ^ i2) * 9059) ^ 1688032653;
                        i5 = 580823022;
                    } else {
                        iM45029 = (C19806.m45029("ܺ᩶") + i2) * 123;
                        i4 = ((iM45029 ^ i3) * (-29841)) ^ 1979172325;
                        i5 = -1433070279;
                    }
                    break;
                case -468240363:
                case 106407171:
                    unbindService(this);
                    if (C1461.f5957 <= 0) {
                        iM45029 = C19806.m45029("ܳ֨") ^ i3;
                        i4 = ((iM45029 ^ i2) * 13647) ^ (-252087436);
                        i5 = -1292680804;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩷ۢ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 7243) ^ (-686706161);
                        i5 = -1897846487;
                    }
                    break;
                case -287676176:
                case 57953189:
                    if (C0278.f1572 <= 0) {
                        iM45029 = C19806.m45029("ܳ֨") ^ i3;
                        i4 = ((iM45029 ^ i2) * 13647) ^ (-252087436);
                        i5 = -1292680804;
                    } else {
                        iM45029 = C19806.m45029("۫ᩳ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-29127)) ^ 903703055;
                        i5 = -1482740098;
                    }
                    break;
                case 234314018:
                case 1606319182:
                    C0671.m3008();
                    if (C10634.f36300 >= 0) {
                        iM45029 = (C19806.m45029("ۨۛ") ^ i2) * 61;
                        i4 = ((iM45029 ^ i3) * 10793) ^ (-378570254);
                        i5 = -1633040707;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۤ᩺") ^ i3) * 49;
                        i4 = ((iM45029 ^ i2) * 9059) ^ 1688032653;
                        i5 = 580823022;
                    }
                    break;
                case 302373913:
                case 1624652639:
                    C1461.m5080();
                    iM45029 = (ThreadFactoryC3888.m11306("ۤ᩺") ^ i3) * 49;
                    i4 = ((iM45029 ^ i2) * 9059) ^ 1688032653;
                    i5 = 580823022;
                    break;
                case 1177713520:
                case 1660148101:
                    ServiceC17650.f56094 = C0817.m3407(ViewTreeObserverOnPreDrawListenerC3327.m9864(c15492));
                    break;
                case 1478005332:
                case 1735073900:
                    if (C2477.m7593() >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("۫ܽ") ^ i3) * 23;
                        i4 = ((iM45029 ^ i2) * 25441) ^ 399345585;
                        i5 = 1846750680;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۤ᩺") ^ i3) * 49;
                        i4 = ((iM45029 ^ i2) * 9059) ^ 1688032653;
                        i5 = 580823022;
                    }
                    break;
                case 1527576756:
                case 1598690729:
                    c15492 = this.f21430;
                    if (C19806.f63586) {
                        iM45029 = C19806.m45029("ܳ֨") ^ i3;
                        i4 = ((iM45029 ^ i2) * 13647) ^ (-252087436);
                        i5 = -1292680804;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܰ۠") ^ i3;
                        i4 = ((iM45029 ^ i2) * 22979) ^ 1001850130;
                        i5 = -113876309;
                    }
                    break;
                case 1920021568:
                case 1947676834:
                    if (C0526.m2437() >= 0) {
                        iM45029 = (C19806.m45029("ۨۛ") ^ i2) * 61;
                        i4 = ((iM45029 ^ i3) * 10793) ^ (-378570254);
                        i5 = -1633040707;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܰۙ") + i3) * 7;
                        i4 = ((iM45029 ^ i2) * 4957) ^ (-654993082);
                        i5 = -1389228126;
                    }
                    break;
                default:
                    if (C3535.m10431() <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("۫ܽ") ^ i3) * 23;
                        i4 = ((iM45029 ^ i2) * 25441) ^ 399345585;
                        i5 = 1846750680;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۟ۤ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 15659) ^ 99636893;
                        i5 = 1373523838;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x020b A[PHI: r8 r9 r13 r14 r15 r20
      0x020b: PHI (r8v4 int) = (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:56:0x0209, B:41:0x015e, B:14:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x020b: PHI (r9v4 int) = (r9v3 int), (r9v2 int), (r9v2 int) binds: [B:56:0x0209, B:41:0x015e, B:14:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x020b: PHI (r13v4 short[]) = (r13v2 short[]), (r13v3 short[]), (r13v2 short[]) binds: [B:56:0x0209, B:41:0x015e, B:14:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x020b: PHI (r14v4 int) = (r14v2 int), (r14v3 int), (r14v2 int) binds: [B:56:0x0209, B:41:0x015e, B:14:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x020b: PHI (r15v4 int) = (r15v2 int), (r15v3 int), (r15v2 int) binds: [B:56:0x0209, B:41:0x015e, B:14:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x020b: PHI (r20v17 int) = (r20v4 int), (r20v10 int), (r20v18 int) binds: [B:56:0x0209, B:41:0x015e, B:14:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0280 A[PHI: r1 r4 r5 r21
      0x0280: PHI (r1v39 int) = (r1v6 int), (r1v31 int), (r1v2 int) binds: [B:65:0x027e, B:33:0x00f7, B:25:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x0280: PHI (r4v3 int) = (r4v2 int), (r4v2 int), (r4v4 int) binds: [B:65:0x027e, B:33:0x00f7, B:25:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x0280: PHI (r5v4 short[]) = (r5v2 short[]), (r5v3 short[]), (r5v2 short[]) binds: [B:65:0x027e, B:33:0x00f7, B:25:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x0280: PHI (r21v5 char) = (r21v4 char), (r21v3 char), (r21v3 char) binds: [B:65:0x027e, B:33:0x00f7, B:25:0x00a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x02ac A[PHI: r3 r10 r11 r16 r20
      0x02ac: PHI (r3v4 java.lang.String) = (r3v2 java.lang.String), (r3v3 java.lang.String), (r3v2 java.lang.String), (r3v2 java.lang.String) binds: [B:52:0x01e4, B:29:0x00d0, B:11:0x0069, B:6:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x02ac: PHI (r10v4 int) = (r10v3 int), (r10v2 int), (r10v2 int), (r10v2 int) binds: [B:52:0x01e4, B:29:0x00d0, B:11:0x0069, B:6:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x02ac: PHI (r11v4 short) = (r11v3 short), (r11v2 short), (r11v2 short), (r11v2 short) binds: [B:52:0x01e4, B:29:0x00d0, B:11:0x0069, B:6:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x02ac: PHI (r16v3 short[]) = (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v5 short[]) binds: [B:52:0x01e4, B:29:0x00d0, B:11:0x0069, B:6:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x02ac: PHI (r20v23 int) = (r20v5 int), (r20v13 int), (r20v22 int), (r20v26 int) binds: [B:52:0x01e4, B:29:0x00d0, B:11:0x0069, B:6:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0084, code lost:
    
        if (l.C0671.f2816 == 0) goto L10;
     */
    @Override // l.AbstractActivityC12483, l.ActivityC19126, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPause() {
        /*
            Method dump skipped, instruction units count: 886
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC6361.onPause():void");
    }

    @Override // l.AbstractActivityC12483, l.ActivityC10074, l.ActivityC19126, android.app.Activity
    public final void onStop() {
        BinderC12712 binderC12712 = null;
        int i = -519876183;
        int i2 = C1875.f7103;
        int i3 = C2477.f9839;
        int iM45029 = C19806.m45029("ܽ֫") ^ i2;
        int i4 = ((iM45029 ^ i3) * (-31025)) ^ (-1105738345);
        int i5 = 759356436;
        while (true) {
            i = ((((i ^ i3) * (-14847)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2040452546:
                case 417943999:
                    if (C2642.f10294 <= 0) {
                        iM45029 = (i3 - C19806.m45029("ۨܽ")) * 57;
                        i4 = ((iM45029 ^ i2) * (-21301)) ^ 1149354759;
                        i5 = -77245295;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۧۛ")) * (-123);
                        i4 = ((iM45029 ^ i2) * (-711)) ^ 1174665143;
                        i5 = 474879550;
                    }
                    break;
                case -1990023421:
                case 1679405712:
                    if (C2249.f8050 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴܳ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-8387)) ^ 809831308;
                        i5 = -357348103;
                    } else {
                        iM45029 = (C19806.m45029("ܽ֡") + i3) * 53;
                        i4 = ((iM45029 ^ i2) * (-27739)) ^ (-1857601422);
                        i5 = -1137236956;
                    }
                    break;
                case -1939193085:
                case 94370956:
                    C1066.m4023();
                    if (!CallableC1627.f6528) {
                        iM45029 = C19806.m45029("᩵᩺") ^ i3;
                        i4 = ((iM45029 ^ i2) * 15921) ^ (-823507976);
                        i5 = -2047353560;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴܳ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-8387)) ^ 809831308;
                        i5 = -357348103;
                    }
                    break;
                case -1716066973:
                case -965531209:
                    super.onStop();
                    if (C1025.m3861() <= 0) {
                        iM45029 = C19806.m45029("᩵᩺") ^ i3;
                        i4 = ((iM45029 ^ i2) * 15921) ^ (-823507976);
                        i5 = -2047353560;
                    } else {
                        iM45029 = C19806.m45029("᩹ۡ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-23671)) ^ 971301790;
                        i5 = -979959277;
                    }
                    break;
                case -1707847336:
                case 1021385975:
                    if (RunnableC1606.f6488 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۖ֡") ^ i3) * 61;
                        i4 = ((iM45029 ^ i2) * (-17883)) ^ 1259503288;
                        i5 = 1257939701;
                    } else {
                        iM45029 = C19806.m45029("ۧܽ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 3057) ^ 421701814;
                        i5 = 1649633688;
                    }
                    break;
                case -1531393997:
                case 2001378254:
                    if (C0797.f3386) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴܳ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-8387)) ^ 809831308;
                        i5 = -357348103;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܿ۟") ^ i3;
                        i4 = ((iM45029 ^ i2) * 21713) ^ (-697553375);
                        i5 = 448769293;
                    }
                    break;
                case -1224705941:
                case 25257067:
                    if (C1461.f5957 <= 0) {
                        iM45029 = C19806.m45029("᩵᩺") ^ i3;
                        i4 = ((iM45029 ^ i2) * 15921) ^ (-823507976);
                        i5 = -2047353560;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۖ֡") ^ i3) * 61;
                        i4 = ((iM45029 ^ i2) * (-17883)) ^ 1259503288;
                        i5 = 1257939701;
                    }
                    break;
                case -867104900:
                case 76927932:
                    if (C2332.m7079() <= 0) {
                        iM45029 = C19806.m45029("᩵᩺") ^ i3;
                        i4 = ((iM45029 ^ i2) * 15921) ^ (-823507976);
                        i5 = -2047353560;
                    } else {
                        iM45029 = (i2 - C19806.m45029("ܽ۬")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM45029 ^ i3) * 18759) ^ 98850393;
                        i5 = -685030884;
                    }
                    break;
                case -841254674:
                case 334297201:
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܺۢ") + i2) * 33;
                        i4 = ((iM45029 ^ i3) * (-2327)) ^ (-872125239);
                        i5 = 442128613;
                    } else {
                        iM45029 = C19806.m45029("ܿ֡") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-29385)) ^ 1778351544;
                        i5 = -290584221;
                    }
                    break;
                case -604667381:
                case 782576182:
                    if (C1025.f4800 >= 0) {
                        iM45029 = (i3 - C19806.m45029("ۨܽ")) * 57;
                        i4 = ((iM45029 ^ i2) * (-21301)) ^ 1149354759;
                        i5 = -77245295;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۧۙ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-16299)) ^ (-1695994438);
                        i5 = -1108696366;
                    }
                    break;
                case -250045980:
                case 1265343600:
                    C0962.m3746();
                    break;
                case -171600541:
                case 1086954909:
                    C2124.m6673();
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    iM45029 = (ThreadFactoryC3888.m11306("ۖ֡") ^ i3) * 61;
                    i4 = ((iM45029 ^ i2) * (-17883)) ^ 1259503288;
                    i5 = 1257939701;
                    break;
                case 31201152:
                case 1774682515:
                    if (RunnableC0195.f1321 >= 0) {
                        iM45029 = C19806.m45029("ܿ֡") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-29385)) ^ 1778351544;
                        i5 = -290584221;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۖ֡") ^ i3) * 61;
                        i4 = ((iM45029 ^ i2) * (-17883)) ^ 1259503288;
                        i5 = 1257939701;
                    }
                    break;
                case 315124302:
                case 2072884242:
                    binderC12712.m31556();
                    iM45029 = (ThreadFactoryC3888.m11306("ۙ֡") ^ i2) * 61;
                    i4 = ((iM45029 ^ i3) * (-29687)) ^ 734629387;
                    i5 = 2133264862;
                    break;
                case 332830581:
                case 1377041414:
                    C0278.m1783(this);
                    iM45029 = C19806.m45029("ܳܳ") ^ i2;
                    i4 = ((iM45029 ^ i3) * (-23531)) ^ 1482517086;
                    i5 = -845044922;
                    break;
                case 340162611:
                case 1979333551:
                    if (ViewTreeObserverOnPreDrawListenerC3327.m9870(this)) {
                        iM45029 = C19806.m45029("ܳܳ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-23531)) ^ 1482517086;
                        i5 = -845044922;
                    } else {
                        iM45029 = C19806.m45029("ۗۙ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-24663)) ^ 1159232314;
                        i5 = -119054790;
                    }
                    break;
                case 561090098:
                case 562834649:
                    binderC12712 = this.f21431;
                    if (binderC12712 != null) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩹ۘ")) * (-73);
                        i4 = ((iM45029 ^ i2) * (-10461)) ^ (-1887745792);
                        i5 = 2038253899;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۙ֡") ^ i2) * 61;
                        i4 = ((iM45029 ^ i3) * (-29687)) ^ 734629387;
                        i5 = 2133264862;
                    }
                    break;
                case 561930506:
                case 646993547:
                    break;
                case 1201734986:
                case 1261114832:
                    if (C3535.f13026 <= 0) {
                        iM45029 = C19806.m45029("᩵᩺") ^ i3;
                        i4 = ((iM45029 ^ i2) * 15921) ^ (-823507976);
                        i5 = -2047353560;
                    } else {
                        iM45029 = (i3 - C19806.m45029("᩸ۚ")) * 85;
                        i4 = ((iM45029 ^ i2) * (-2855)) ^ (-796379514);
                        i5 = 64326027;
                    }
                    break;
                case 1737248625:
                case 1787710563:
                    if (this.f21429) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۚ᩺") + i3) * 79;
                        i4 = ((iM45029 ^ i2) * (-10475)) ^ (-1156992305);
                        i5 = 221943293;
                    } else {
                        iM45029 = (i2 - C19806.m45029("᩻ۘ")) * (-91);
                        i4 = ((iM45029 ^ i3) * 20881) ^ (-373097259);
                        i5 = 1204138882;
                    }
                    break;
                default:
                    if (!C0817.f3443) {
                        iM45029 = (i3 - C19806.m45029("ۨܽ")) * 57;
                        i4 = ((iM45029 ^ i2) * (-21301)) ^ 1149354759;
                        i5 = -77245295;
                    } else {
                        stopService(new Intent(this, (Class<?>) ServiceC17650.class));
                        iM45029 = (ThreadFactoryC3888.m11306("ۙ֡") ^ i2) * 61;
                        i4 = ((iM45029 ^ i3) * (-29687)) ^ 734629387;
                        i5 = 2133264862;
                    }
                    break;
            }
            return;
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        ViewOnClickListenerC23253 viewOnClickListenerC23253 = null;
        int i2 = -782261572;
        int i3 = C1189.f5284;
        int i4 = C3535.f13026;
        int iM11306 = (i3 - ThreadFactoryC3888.m11306("ܶ֫")) * 67;
        int i5 = ((iM11306 ^ i4) * (-16887)) ^ (-252249656);
        int i6 = 196961401;
        while (true) {
            i2 = ((((i2 ^ i4) * (-28321)) >> 31) & i5) ^ (iM11306 ^ i6);
            switch (i2) {
                case -1915023184:
                case -613748879:
                    if (!RunnableC1564.f6300) {
                        iM11306 = ThreadFactoryC3888.m11306("ۚ۬") ^ i4;
                        i5 = ((iM11306 ^ i3) * 23109) ^ 897817528;
                        i6 = 1704137409;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۡᩳ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-23319)) ^ (-1871511675);
                        i6 = 748754259;
                    }
                    break;
                case -1742799747:
                case -1168129272:
                    if (C1875.f7103 >= 0) {
                        iM11306 = (C19806.m45029("ۛܿ") ^ i4) * (-27);
                        i5 = ((iM11306 ^ i3) * 25959) ^ (-1055423276);
                        i6 = -1721089720;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶᩺") ^ i4) * 27;
                        i5 = ((iM11306 ^ i3) * 5757) ^ 720205750;
                        i6 = 2107856518;
                    }
                    break;
                case -1735236566:
                case -885101566:
                    return false;
                case -1537811706:
                case 1778112909:
                    if (C1066.m4023() <= 0) {
                        iM11306 = (C19806.m45029("᩸ᩳ") ^ i3) * (-5);
                        i5 = ((iM11306 ^ i4) * 8293) ^ (-650361484);
                        i6 = 1132013758;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("۠᩶")) * (-121);
                        i5 = ((iM11306 ^ i4) * 15859) ^ (-359548166);
                        i6 = 1815730481;
                    }
                    break;
                case -1272466914:
                case 611371426:
                    viewOnClickListenerC23253 = this.f21433;
                    if (viewOnClickListenerC23253 != null) {
                        iM11306 = C19806.m45029("ۖᩴ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-30135)) ^ (-627295629);
                        i6 = -1826132412;
                    } else {
                        iM11306 = C19806.m45029("ۜܺ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-20455)) ^ (-95935400);
                        i6 = -388758075;
                    }
                    break;
                case -1210084155:
                case 292160265:
                    if (C1668.f6641 >= 0) {
                        iM11306 = (C19806.m45029("ۛܿ") ^ i4) * (-27);
                        i5 = ((iM11306 ^ i3) * 25959) ^ (-1055423276);
                        i6 = -1721089720;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩻᩺") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-7855)) ^ 1638505894;
                        i6 = 1971405638;
                    }
                    break;
                case -1025802212:
                case 987639074:
                    if (keyEvent.getAction() == 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶ۚ") ^ i4) * 3;
                        i5 = ((iM11306 ^ i3) * (-3993)) ^ 2138417995;
                        i6 = 1395315921;
                    } else {
                        iM11306 = C19806.m45029("ۜܺ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-20455)) ^ (-95935400);
                        i6 = -388758075;
                    }
                    break;
                case -901413513:
                case 1068772519:
                    if (C2871.f10837 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۡᩳ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-23319)) ^ (-1871511675);
                        i6 = 748754259;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܿۢ") + i4) * (-15);
                        i5 = ((iM11306 ^ i3) * (-20381)) ^ 357244870;
                        i6 = -1126493139;
                    }
                    break;
                case -841902637:
                case 2066469185:
                    if (C0216.f1393 != 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۡᩳ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-23319)) ^ (-1871511675);
                        i6 = 748754259;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩴܶ") + i4) * (-125);
                        i5 = ((iM11306 ^ i3) * (-32335)) ^ 1442123531;
                        i6 = 1253968560;
                    }
                    break;
                case -609409112:
                case -480167381:
                    viewOnClickListenerC23253.onClick(null);
                    iM11306 = C19806.m45029("ۜܺ") ^ i3;
                    i5 = ((iM11306 ^ i4) * (-20455)) ^ (-95935400);
                    i6 = -388758075;
                    break;
                case -585761361:
                case -439448496:
                    if (C1025.f4800 >= 0) {
                        iM11306 = (C19806.m45029("ۛܿ") ^ i4) * (-27);
                        i5 = ((iM11306 ^ i3) * 25959) ^ (-1055423276);
                        i6 = -1721089720;
                    } else {
                        iM11306 = C19806.m45029("۟ܽ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 24881) ^ (-1878193790);
                        i6 = 191739726;
                    }
                    break;
                case -580953585:
                case 1539262228:
                    C0671.m3008();
                    if (C1977.f7413 > 0) {
                        iM11306 = (C19806.m45029("᩸ᩳ") ^ i3) * (-5);
                        i5 = ((iM11306 ^ i4) * 8293) ^ (-650361484);
                        i6 = 1132013758;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۡᩳ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-23319)) ^ (-1871511675);
                        i6 = 748754259;
                    }
                    break;
                case -426652584:
                case 683933702:
                    if (C1668.f6641 >= 0) {
                        iM11306 = (C19806.m45029("᩸ᩳ") ^ i3) * (-5);
                        i5 = ((iM11306 ^ i4) * 8293) ^ (-650361484);
                        i6 = 1132013758;
                    } else {
                        iM11306 = C19806.m45029("֨᩸") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-10661)) ^ 4936838;
                        i6 = -946215132;
                    }
                    break;
                case -360000798:
                case 1536932912:
                    C0278.m1783(this);
                    return true;
                case 622736737:
                case 2049821359:
                    C3743.m10966();
                    if (C1189.f5284 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩷ۜ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-20683)) ^ (-360627908);
                        i6 = 73154638;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۡᩳ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-23319)) ^ (-1871511675);
                        i6 = 748754259;
                    }
                    break;
                case 711077894:
                case 1272684641:
                    if (C3535.m10431() <= 0) {
                        iM11306 = (C19806.m45029("᩸ᩳ") ^ i3) * (-5);
                        i5 = ((iM11306 ^ i4) * 8293) ^ (-650361484);
                        i6 = 1132013758;
                    } else {
                        iM11306 = (i3 - C19806.m45029("ۙۚ")) * 57;
                        i5 = ((iM11306 ^ i4) * 4429) ^ 1823695315;
                        i6 = 902508519;
                    }
                    break;
                case 980678028:
                case 1531225176:
                    C19806.m45024();
                    iM11306 = ThreadFactoryC3888.m11306("ۡᩳ") ^ i3;
                    i5 = ((iM11306 ^ i4) * (-23319)) ^ (-1871511675);
                    i6 = 748754259;
                    break;
                case 1031927467:
                case 1283703136:
                    if (i == 66) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۧܰ") ^ i4) * 13;
                        i5 = ((iM11306 ^ i3) * 939) ^ 1917397049;
                        i6 = 1783422368;
                    } else {
                        iM11306 = C19806.m45029("ۜܺ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-20455)) ^ (-95935400);
                        i6 = -388758075;
                    }
                    break;
                case 1406985706:
                case 1733345043:
                    if (C1668.f6641 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۚ۬") ^ i4;
                        i5 = ((iM11306 ^ i3) * 23109) ^ 897817528;
                        i6 = 1704137409;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳۙ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 8499) ^ (-115362483);
                        i6 = -904248321;
                    }
                    break;
                case 1545056681:
                case 1558659280:
                    RunnableC3388.m10064();
                    return false;
                case 1633569695:
                case 2085434017:
                    if (i == 4) {
                        iM11306 = (C19806.m45029("۟ۖ") + i3) * (-43);
                        i5 = ((iM11306 ^ i4) * (-7883)) ^ 1009369649;
                        i6 = 2019717272;
                    } else {
                        iM11306 = (C19806.m45029("۠ܳ") + i4) * 29;
                        i5 = ((iM11306 ^ i3) * (-10947)) ^ (-1721639919);
                        i6 = -425596472;
                    }
                    break;
                default:
                    if (C2642.f10294 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩷ۜ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-20683)) ^ (-360627908);
                        i6 = 73154638;
                    } else {
                        iM11306 = C19806.m45029("᩸۠") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-24237)) ^ 1059762156;
                        i6 = -1183659217;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00aa, code lost:
    
        if (l.C1025.f4800 >= 0) goto L14;
     */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r29) {
        /*
            Method dump skipped, instruction units count: 1360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC6361.onClick(android.view.View):void");
    }
}
