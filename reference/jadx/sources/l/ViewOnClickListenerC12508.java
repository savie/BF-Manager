package l;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۨܿ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: N5YQ */
/* JADX INFO: loaded from: classes4.dex */
public class ViewOnClickListenerC12508 extends AbstractActivityC17204 implements View.OnClickListener, View.OnKeyListener, ServiceConnection {

    /* JADX INFO: renamed from: ᩶֨᩷, reason: not valid java name and contains not printable characters */
    private static final short[] f40157 = {6572, -9962, -11474, 9632, 10271, 8379, 5890, -16246, 5412, -14303, 5951, 553, -3594, 1321, 1020, 4378, -6764, -6990, -4406, 14270, 307, 8177, 8819, 2245, -1586, 5518, -1344, 5018, -8137, 8913, -5664, 2055, 8573, -5913, 7423, 5734, 1544, 14034, 10180, 9964, -3953, 9615, 28023, -23974, -30470, -27826, 29785, -24748, 7062, 14394, 8079, -8828, 3138, -19113, -19100, -19099, -19083, -19129, -19101, -19085, -19100, -19089, -19113, -19083, -19102, -19073, -19104, -19073, -19102, -19089};

    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public long f40158;

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public boolean f40159 = false;

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public ViewOnClickListenerC2063 f40160;

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public BinderC3559 f40161;

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public C11757 f40162;

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }

    @Override // l.AbstractActivityC17204
    /* JADX INFO: renamed from: ۙ */
    public final void mo110(C2813 c2813) {
    }

    @Override // l.AbstractActivityC17204
    /* JADX INFO: renamed from: ᩶ */
    public final String mo122() {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        short[] sArr2 = null;
        int i5 = 0;
        int i6 = -1466792692;
        int i7 = C0269.f1558;
        int i8 = C0950.f3488;
        int iM3169 = (C0773.m3169("֨֨") + i8) * 15;
        int i9 = ((iM3169 ^ i7) * (-22067)) ^ (-1749753372);
        int i10 = 1260956801;
        while (true) {
            i6 = ((((i6 ^ i7) * 32193) >> 31) & i9) ^ (iM3169 ^ i10);
            switch (i6) {
                case -2124959102:
                case -1308906496:
                    if (C23916.f77426 > 0) {
                        iM3169 = (i7 - C0619.m2761("֡ۛ")) * (-11);
                        i9 = ((iM3169 ^ i8) * (-15237)) ^ 595157158;
                        i10 = 1141208443;
                    } else {
                        iM3169 = (i8 - C0773.m3169("ᩴۨ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i9 = ((iM3169 ^ i7) * (-19343)) ^ 2092948117;
                        i10 = 1773193966;
                    }
                    break;
                case -2083855930:
                case -1572822281:
                    i = s * s2;
                    i2 = s * s;
                    if (C2288.m7767()) {
                        iM3169 = (C0619.m2761("۫ۘ") ^ i7) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i9 = ((iM3169 ^ i8) * 16203) ^ 922046322;
                        i10 = 76729490;
                    } else {
                        iM3169 = C0773.m3169("ܿ᩷") ^ i7;
                        i9 = ((iM3169 ^ i8) * 14577) ^ 1027962591;
                        i10 = 889786635;
                    }
                    break;
                case -1976618584:
                case 441414156:
                    i3 = 32764176;
                    if (C2310.f7472 >= 0) {
                        iM3169 = (i8 - C0773.m3169("ᩴۨ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i9 = ((iM3169 ^ i7) * (-19343)) ^ 2092948117;
                        i10 = 1773193966;
                    } else {
                        iM3169 = C0773.m3169("ܿ۠") ^ i7;
                        i9 = ((iM3169 ^ i8) * (-20659)) ^ 571548217;
                        i10 = 1415452686;
                    }
                    break;
                case -1867461867:
                case 1253986238:
                    sArr = f40157;
                    if (C4282.f15546 <= 0) {
                        iM3169 = (i7 - C0619.m2761("֡ۛ")) * (-11);
                        i9 = ((iM3169 ^ i8) * (-15237)) ^ 595157158;
                        i10 = 1141208443;
                    } else {
                        iM3169 = C0773.m3169("ۜۘ") ^ i8;
                        i9 = ((iM3169 ^ i7) * 23551) ^ 302700245;
                        i10 = 1440048061;
                    }
                    break;
                case -1393637000:
                case 169826536:
                    i4 = 16319;
                    iM3169 = (i7 - C0619.m2761("֡᩵")) * (-59);
                    i9 = ((iM3169 ^ i8) * 23145) ^ 897278886;
                    i10 = -469428938;
                    break;
                case -1275448078:
                case 859546643:
                    if (!RunnableC1848.f6235) {
                        iM3169 = (i8 - C0773.m3169("ᩴۨ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i9 = ((iM3169 ^ i7) * (-19343)) ^ 2092948117;
                        i10 = 1773193966;
                    } else {
                        iM3169 = (C0619.m2761("۫ۘ") ^ i7) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i9 = ((iM3169 ^ i8) * 16203) ^ 922046322;
                        i10 = 76729490;
                    }
                    break;
                case -1023529235:
                case 281966217:
                    if (C1564.m5509() <= 0) {
                        iM3169 = (C0619.m2761("۫ۘ") ^ i7) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i9 = ((iM3169 ^ i8) * 16203) ^ 922046322;
                        i10 = 76729490;
                    } else {
                        iM3169 = (i7 - C0619.m2761("ᩴۛ")) * 87;
                        i9 = ((iM3169 ^ i8) * (-22611)) ^ 811380380;
                        i10 = -350184697;
                    }
                    break;
                case -862297307:
                case 1278244761:
                    if (C3690.f12684 <= 0) {
                        iM3169 = (C0619.m2761("۫ۘ") ^ i7) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i9 = ((iM3169 ^ i8) * 16203) ^ 922046322;
                        i10 = 76729490;
                    } else {
                        iM3169 = C0619.m2761("ۢ۫") ^ i7;
                        i9 = ((iM3169 ^ i8) * 18191) ^ 387200879;
                        i10 = 463003765;
                    }
                    break;
                case -625887610:
                case 543142425:
                    c = '4';
                    if (C23916.f77426 <= 0) {
                        iM3169 = (C0619.m2761("۫ۘ") ^ i7) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i9 = ((iM3169 ^ i8) * 16203) ^ 922046322;
                        i10 = 76729490;
                    } else {
                        iM3169 = C0773.m3169("ܽ᩶") ^ i8;
                        i9 = ((iM3169 ^ i7) * (-30109)) ^ (-1481171911);
                        i10 = -1374876041;
                    }
                    break;
                case -456903409:
                case -316868665:
                    if (C0862.f3233 != 0) {
                        iM3169 = (i8 - C0619.m2761("ᩳ۠")) * (-75);
                        i9 = ((iM3169 ^ i7) * 4609) ^ 424236470;
                        i10 = 114726699;
                    } else {
                        iM3169 = (C0619.m2761("ۖ֡") ^ i8) * 37;
                        i9 = ((iM3169 ^ i7) * (-6627)) ^ (-216471184);
                        i10 = -1787628358;
                    }
                    break;
                case -350962397:
                case 2065196944:
                    if ((i2 + i3) - i < 0) {
                        iM3169 = C0619.m2761("۠۟") ^ i8;
                        i9 = ((iM3169 ^ i7) * (-26503)) ^ 738114812;
                        i10 = 1002800299;
                    } else {
                        iM3169 = C0773.m3169("۫֨") ^ i8;
                        i9 = ((iM3169 ^ i7) * (-28809)) ^ 628054707;
                        i10 = -1412322869;
                    }
                    break;
                case -300804072:
                case 2078982684:
                    C11235.m28309();
                    return null;
                case -18066399:
                case 1862415028:
                    sArr2 = f40157;
                    i5 = 53;
                    if (C3998.f13671 != 0) {
                        iM3169 = (C0619.m2761("۫ۘ") ^ i7) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i9 = ((iM3169 ^ i8) * 16203) ^ 922046322;
                        i10 = 76729490;
                    } else {
                        iM3169 = (i8 - C0619.m2761("۠ۛ")) * 9;
                        i9 = ((iM3169 ^ i7) * (-16257)) ^ (-524950937);
                        i10 = 2026114642;
                    }
                    break;
                case 498575957:
                case 1559605198:
                    C2878.m9491();
                    if (C1343.f4799 == 0) {
                        iM3169 = (i8 - C0619.m2761("ᩳ۠")) * (-75);
                        i9 = ((iM3169 ^ i7) * 4609) ^ 424236470;
                        i10 = 114726699;
                    } else {
                        iM3169 = (C0619.m2761("۫ۘ") ^ i7) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i9 = ((iM3169 ^ i8) * 16203) ^ 922046322;
                        i10 = 76729490;
                    }
                    break;
                case 887006243:
                case 1610987626:
                    if (C0773.f2792 <= 0) {
                        iM3169 = (i7 - C0619.m2761("֡ۛ")) * (-11);
                        i9 = ((iM3169 ^ i8) * (-15237)) ^ 595157158;
                        i10 = 1141208443;
                    } else {
                        iM3169 = (i7 - C0773.m3169("ܳᩳ")) * q.h;
                        i9 = ((iM3169 ^ i8) * 10913) ^ (-106495728);
                        i10 = 883021338;
                    }
                    break;
                case 958816898:
                case 1026598085:
                    s = sArr[c];
                    s2 = 11448;
                    if (C2310.f7472 >= 0) {
                        iM3169 = (C0773.m3169("ۙܳ") + i7) * 39;
                        i9 = ((iM3169 ^ i8) * (-27053)) ^ 1872979330;
                        i10 = 1863791489;
                    } else {
                        iM3169 = (C0619.m2761("۫᩸") ^ i8) * (-23);
                        i9 = ((iM3169 ^ i7) * 15259) ^ 1100044035;
                        i10 = -916887970;
                    }
                    break;
                case 1023075322:
                case 1490279467:
                    i4 = 46358;
                    iM3169 = (i7 - C0619.m2761("֡᩵")) * (-59);
                    i9 = ((iM3169 ^ i8) * 23145) ^ 897278886;
                    i10 = -469428938;
                    break;
                case 1378774900:
                case 2093054582:
                    C3690.m11987();
                    iM3169 = (C0619.m2761("۫ۘ") ^ i7) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                    i9 = ((iM3169 ^ i8) * 16203) ^ 922046322;
                    i10 = 76729490;
                    break;
                default:
                    return C1519.m5399(sArr2, i5, 17, i4);
            }
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 17341. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // l.AbstractActivityC17204, l.ActivityC7405, l.ActivityC3409, l.ActivityC5577, l.ActivityC8866, android.app.Activity
    public final void onCreate(android.os.Bundle r41) {
        /*
            Method dump skipped, instruction units count: 1734
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC12508.onCreate(android.os.Bundle):void");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        short[] sArr = null;
        short s = 0;
        short s2 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1175263648;
        int i6 = RunnableC0334.f1808;
        int i7 = C2375.f7641;
        int iM3169 = (C0773.m3169("ۛܳ") ^ i6) * 15;
        int i8 = ((iM3169 ^ i7) * 27907) ^ 242843398;
        int i9 = -1953917166;
        while (true) {
            i5 = ((((i5 ^ i7) * 25701) >> 31) & i8) ^ (iM3169 ^ i9);
            switch (i5) {
                case -1954305683:
                case -1380276501:
                    if (C3077.f9998) {
                        iM3169 = (i6 - C0619.m2761("ᩴܿ")) * 65;
                        i8 = ((iM3169 ^ i7) * 7089) ^ (-2091542588);
                        i9 = 145060545;
                    } else {
                        iM3169 = (C0619.m2761("ᩴܺ") ^ i7) * 61;
                        i8 = ((iM3169 ^ i6) * 13929) ^ (-1675682140);
                        i9 = 1725114004;
                    }
                    break;
                case -1847319887:
                case -1769189095:
                    C1146.m4231();
                    C23916.m53419();
                    iM3169 = (C0619.m2761("ᩴܺ") ^ i7) * 61;
                    i8 = ((iM3169 ^ i6) * 13929) ^ (-1675682140);
                    i9 = 1725114004;
                    break;
                case -1701173742:
                case -1001542696:
                    RunnableC1848.m6360();
                    if (!C2288.m7767()) {
                        iM3169 = (C0619.m2761("ۚܶ") + i7) * (-115);
                        i8 = ((iM3169 ^ i6) * (-3811)) ^ (-2009599218);
                        i9 = -382929016;
                    } else {
                        iM3169 = (C0619.m2761("֡ܰ") ^ i6) * (-7);
                        i8 = ((iM3169 ^ i7) * (-6279)) ^ (-1582375656);
                        i9 = -1296646623;
                    }
                    break;
                case -1652722293:
                case 177451243:
                    s = sArr[48];
                    s2 = 11635;
                    if (C1146.f4234 >= 0) {
                        iM3169 = (C0619.m2761("֡ܰ") ^ i6) * (-7);
                        i8 = ((iM3169 ^ i7) * (-6279)) ^ (-1582375656);
                        i9 = -1296646623;
                    } else {
                        iM3169 = C0773.m3169("ۧ۟") ^ i6;
                        i8 = ((iM3169 ^ i7) * (-3837)) ^ (-1765986920);
                        i9 = -169269466;
                    }
                    break;
                case -1454298955:
                case 547269717:
                    i4 = 18230;
                    iM3169 = C0619.m2761("ۧᩳ") ^ i7;
                    i8 = ((iM3169 ^ i6) * (-2145)) ^ (-866945450);
                    i9 = 544449114;
                    break;
                case -1404512699:
                case 1989332076:
                    sArr = f40157;
                    if (C1146.f4234 >= 0) {
                        iM3169 = (C0619.m2761("֡ܰ") ^ i6) * (-7);
                        i8 = ((iM3169 ^ i7) * (-6279)) ^ (-1582375656);
                        i9 = -1296646623;
                    } else {
                        iM3169 = C0773.m3169("ۧ۠") ^ i7;
                        i8 = ((iM3169 ^ i6) * (-14915)) ^ 1475796883;
                        i9 = -375177941;
                    }
                    break;
                case -1268397425:
                case -1171966881:
                    short[] sArr2 = f40157;
                    if (C2966.f9654 < 0) {
                        int iM31610 = C0773.m3169(C3099.m10092(sArr2, 49, 3, i4));
                        if (RunnableC3055.f9898 < 0) {
                            View viewM5518 = C1564.m5518(this, iM31610 ^ 2128757921);
                            if (C3099.f10023 > 0) {
                                C21246 c21246M11605 = this.f40161.m11605();
                                if (C2485.f7950 == 0) {
                                    ViewOnClickListenerC2063 viewOnClickListenerC2063 = new ViewOnClickListenerC2063(this, viewM5518, c21246M11605);
                                    this.f40160 = viewOnClickListenerC2063;
                                    viewOnClickListenerC2063.m7130(ServiceC20713.f66380);
                                }
                                iM3169 = (C0619.m2761("ۚܶ") + i7) * (-115);
                                i8 = ((iM3169 ^ i6) * (-3811)) ^ (-2009599218);
                                i9 = -382929016;
                                break;
                            }
                        }
                    }
                    iM3169 = C0619.m2761("۫᩵") ^ i6;
                    i8 = ((iM3169 ^ i7) * (-2093)) ^ 2105340244;
                    i9 = 1743864750;
                    break;
                case -1244449921:
                case 1420674639:
                    BinderC3559 binderC3559 = (BinderC3559) iBinder;
                    this.f40161 = binderC3559;
                    binderC3559.m11604();
                    if (RunnableC3055.f9898 >= 0) {
                        iM3169 = (C0773.m3169("֡ۗ") ^ i7) * (-67);
                        i8 = ((iM3169 ^ i6) * 15951) ^ 912420238;
                        i9 = -213420383;
                    } else {
                        iM3169 = C0773.m3169("᩶ۚ") ^ i6;
                        i8 = ((iM3169 ^ i7) * (-8517)) ^ (-1111699594);
                        i9 = -1885736524;
                    }
                    break;
                case -1107172201:
                case 1321078175:
                    C0862.m3503();
                    break;
                case -1068104399:
                case 1553963491:
                    int i10 = s + s2;
                    i = i10 * i10;
                    i2 = s * s;
                    if (C1321.f4751 >= 0) {
                        iM3169 = (C0619.m2761("ۚܶ") + i7) * (-115);
                        i8 = ((iM3169 ^ i6) * (-3811)) ^ (-2009599218);
                        i9 = -382929016;
                    } else {
                        iM3169 = C0773.m3169("ۢۚ") ^ i7;
                        i8 = ((iM3169 ^ i6) * 3811) ^ (-853857673);
                        i9 = -1045746071;
                    }
                    break;
                case -949072504:
                case 896683585:
                    C3690.m11987();
                    if (C1564.f5401 <= 0) {
                        iM3169 = (C0619.m2761("ۚܶ") + i7) * (-115);
                        i8 = ((iM3169 ^ i6) * (-3811)) ^ (-2009599218);
                        i9 = -382929016;
                    } else {
                        iM3169 = (C0619.m2761("ᩴܺ") ^ i7) * 61;
                        i8 = ((iM3169 ^ i6) * 13929) ^ (-1675682140);
                        i9 = 1725114004;
                    }
                    break;
                case -739361841:
                case -669247291:
                    int i11 = i2 + i3;
                    if ((i11 + i11) - i >= 0) {
                        iM3169 = C0619.m2761("ۨۗ") ^ i6;
                        i8 = ((iM3169 ^ i7) * (-145)) ^ 2120758135;
                        i9 = 354520693;
                    } else {
                        iM3169 = (C0773.m3169("ܰᩳ") ^ i6) * (-41);
                        i8 = ((iM3169 ^ i7) * (-477)) ^ 2088319814;
                        i9 = 691023826;
                    }
                    break;
                case -407568793:
                case 1297605958:
                    i4 = 16391;
                    iM3169 = C0619.m2761("ۧᩳ") ^ i7;
                    i8 = ((iM3169 ^ i6) * (-2145)) ^ (-866945450);
                    i9 = 544449114;
                    break;
                case 1380863371:
                case 1513505035:
                    if (C1826.f6190 <= 0) {
                        iM3169 = (C0773.m3169("֡ۗ") ^ i7) * (-67);
                        i8 = ((iM3169 ^ i6) * 15951) ^ 912420238;
                        i9 = -213420383;
                    } else {
                        iM3169 = (C0619.m2761("ۚܶ") + i7) * (-115);
                        i8 = ((iM3169 ^ i6) * (-3811)) ^ (-2009599218);
                        i9 = -382929016;
                    }
                    break;
                default:
                    i3 = 135373225;
                    if (RunnableC3055.m9933() != 0) {
                        iM3169 = (C0619.m2761("֡ܰ") ^ i6) * (-7);
                        i8 = ((iM3169 ^ i7) * (-6279)) ^ (-1582375656);
                        i9 = -1296646623;
                    } else {
                        iM3169 = (C0773.m3169("᩸ܺ") + i7) * 9;
                        i8 = ((iM3169 ^ i6) * (-28337)) ^ (-1252994834);
                        i9 = -1007924522;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractActivityC17204, l.ActivityC4348, l.ActivityC3409, android.app.Activity
    public final void onDestroy() {
        C11757 c11757 = null;
        int i = 63943628;
        int i2 = C2310.f7472;
        int i3 = C1519.f5300;
        int iM3169 = C0773.m3169("֨֫") ^ i3;
        int i4 = ((iM3169 ^ i2) * 31141) ^ 448099939;
        int i5 = -434988706;
        while (true) {
            i = ((((i ^ i2) * 32709) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -1942865764:
                case 376698053:
                    if (RunnableC3646.f12471) {
                        iM3169 = C0773.m3169("ۤᩳ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-29247)) ^ (-648116590);
                        i5 = 1053568710;
                    } else {
                        iM3169 = (C0619.m2761("ۤۡ") ^ i3) * 97;
                        i4 = ((iM3169 ^ i2) * 9037) ^ (-1673905531);
                        i5 = 988431137;
                    }
                    break;
                case -1939767891:
                case -1177157751:
                    if (C1564.f5401 <= 0) {
                        iM3169 = (C0773.m3169("۠ۨ") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM3169 ^ i2) * (-15777)) ^ (-2102628723);
                        i5 = -1168224730;
                    } else {
                        iM3169 = C0619.m2761("ܰۢ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 15409) ^ 896269713;
                        i5 = -1972550016;
                    }
                    break;
                case -1891927434:
                case -461465345:
                    ServiceC20713.f66380 = C2023.m6952(C3998.m12928(c11757));
                    break;
                case -1808751069:
                case 1051508473:
                    if (C17202.f56030) {
                        iM3169 = C0773.m3169("᩻ۗ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 21621) ^ 949492601;
                        i5 = 1844385945;
                    } else {
                        iM3169 = (C0619.m2761("ܽۧ") ^ i2) * (-25);
                        i4 = ((iM3169 ^ i3) * (-29109)) ^ (-687806489);
                        i5 = 2041347662;
                    }
                    break;
                case -1143068548:
                case -513132377:
                    unbindService(this);
                    if (C2023.m6964() <= 0) {
                        iM3169 = (C0619.m2761("ܽۧ") ^ i2) * (-25);
                        i4 = ((iM3169 ^ i3) * (-29109)) ^ (-687806489);
                        i5 = 2041347662;
                    } else {
                        iM3169 = (C0619.m2761("ۧܽ") ^ i2) * (-117);
                        i4 = ((iM3169 ^ i3) * (-12237)) ^ (-999302386);
                        i5 = -634111472;
                    }
                    break;
                case -1057503915:
                case -615625963:
                    c11757 = this.f40162;
                    if (C1564.m5509() <= 0) {
                        iM3169 = (C0773.m3169("᩸ۢ") ^ i3) * 127;
                        i4 = ((iM3169 ^ i2) * (-15865)) ^ (-365557942);
                        i5 = -1515775342;
                    } else {
                        iM3169 = C0619.m2761("֡۫") ^ i3;
                        i4 = ((iM3169 ^ i2) * 32511) ^ (-1429330051);
                        i5 = 1346723619;
                    }
                    break;
                case -928845558:
                case -617139115:
                    if (C0773.f2792 <= 0) {
                        iM3169 = (C0773.m3169("۠ۨ") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM3169 ^ i2) * (-15777)) ^ (-2102628723);
                        i5 = -1168224730;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ۡ᩻")) * (-111);
                        i4 = ((iM3169 ^ i2) * (-12187)) ^ 393875597;
                        i5 = -742919342;
                    }
                    break;
                case -886008569:
                case 1433092150:
                    if (C3099.f10023 <= 0) {
                        iM3169 = C0773.m3169("ۤᩳ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-29247)) ^ (-648116590);
                        i5 = 1053568710;
                    } else {
                        iM3169 = (C0773.m3169("۠֫") + i2) * (-75);
                        i4 = ((iM3169 ^ i3) * (-26641)) ^ 1300274268;
                        i5 = -1289442328;
                    }
                    break;
                case -718981112:
                case 1427321613:
                    if (C2310.f7472 >= 0) {
                        iM3169 = (C0619.m2761("᩵۠") + i3) * (-91);
                        i4 = ((iM3169 ^ i2) * 1183) ^ 282688376;
                        i5 = -1385533652;
                    } else {
                        iM3169 = C0619.m2761("ܿۢ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 19233) ^ (-912023163);
                        i5 = -751819341;
                    }
                    break;
                case 5304813:
                case 2062607801:
                    if (C2288.f7433 > 0) {
                        iM3169 = (C0619.m2761("ܽۧ") ^ i2) * (-25);
                        i4 = ((iM3169 ^ i3) * (-29109)) ^ (-687806489);
                        i5 = 2041347662;
                    } else {
                        iM3169 = (C0619.m2761("᩵۠") + i3) * (-91);
                        i4 = ((iM3169 ^ i2) * 1183) ^ 282688376;
                        i5 = -1385533652;
                    }
                    break;
                case 72109587:
                case 565629854:
                    C1519.m5403();
                    if (C4282.f15546 <= 0) {
                        iM3169 = C0773.m3169("ۤᩳ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-29247)) ^ (-648116590);
                        i5 = 1053568710;
                    } else {
                        iM3169 = (C0773.m3169("۠ۨ") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM3169 ^ i2) * (-15777)) ^ (-2102628723);
                        i5 = -1168224730;
                    }
                    break;
                case 84068713:
                case 1473402985:
                    if (AbstractC0641.f2496 >= 0) {
                        iM3169 = C0773.m3169("ۤᩳ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-29247)) ^ (-648116590);
                        i5 = 1053568710;
                    } else {
                        iM3169 = (C0619.m2761("ۨ᩵") ^ i3) * 123;
                        i4 = ((iM3169 ^ i2) * 11963) ^ (-412910662);
                        i5 = -1457879924;
                    }
                    break;
                case 239026706:
                case 1823116395:
                    if (AbstractC3624.m11755() != 0) {
                        iM3169 = (C0619.m2761("᩵۠") + i3) * (-91);
                        i4 = ((iM3169 ^ i2) * 1183) ^ 282688376;
                        i5 = -1385533652;
                    } else {
                        iM3169 = (C0773.m3169("۠ۨ") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM3169 ^ i2) * (-15777)) ^ (-2102628723);
                        i5 = -1168224730;
                    }
                    break;
                case 601779736:
                case 963427426:
                    super.onDestroy();
                    if (C0269.f1558 <= 0) {
                        iM3169 = C0773.m3169("ۤᩳ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-29247)) ^ (-648116590);
                        i5 = 1053568710;
                    } else {
                        iM3169 = (i2 - C0773.m3169("᩻ܶ")) * (-125);
                        i4 = ((iM3169 ^ i3) * 21033) ^ (-519356567);
                        i5 = -414862569;
                    }
                    break;
                case 754970370:
                case 1444601527:
                    C17202.m40372();
                    RunnableC0334.m2063();
                    break;
                default:
                    AbstractC0641.m2813();
                    iM3169 = (C0773.m3169("۠ۨ") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                    i4 = ((iM3169 ^ i2) * (-15777)) ^ (-2102628723);
                    i5 = -1168224730;
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractActivityC17204, l.ActivityC4348, l.ActivityC3409, android.app.Activity
    public final void onStop() {
        BinderC3559 binderC3559 = null;
        int i = -1038707080;
        int i2 = C11235.f35427;
        int i3 = C3492.f12043;
        int iM3169 = C0773.m3169("ۗ᩺") ^ i2;
        int i4 = ((iM3169 ^ i3) * 973) ^ 767053038;
        int i5 = 456476694;
        while (true) {
            i = ((((i ^ i3) * (-9799)) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2087219626:
                case 2055774536:
                    if (this.f40159) {
                        iM3169 = (C0619.m2761("ۤۡ") + i2) * (-29);
                        i4 = ((iM3169 ^ i3) * (-2355)) ^ (-1161698118);
                        i5 = -1308874091;
                    } else {
                        iM3169 = C0773.m3169("֨ܰ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 7953) ^ 671103104;
                        i5 = -248116661;
                    }
                    break;
                case -2018286266:
                case -941214325:
                    C0773.m3161();
                    C2834.m9344();
                    break;
                case -1997766754:
                case 723973896:
                    if (C1343.f4799 != 0) {
                        iM3169 = (C0619.m2761("᩸֡") ^ i3) * 59;
                        i4 = ((iM3169 ^ i2) * 28339) ^ (-1611231708);
                        i5 = -785518309;
                    } else {
                        iM3169 = (i2 - C0773.m3169("ܰᩴ")) * 95;
                        i4 = ((iM3169 ^ i3) * (-22303)) ^ 130519763;
                        i5 = -1033311200;
                    }
                    break;
                case -1982360127:
                case 1033152041:
                    super.onStop();
                    if (C1826.m6301() >= 0) {
                        iM3169 = C0619.m2761("ܽᩳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 20011) ^ 1314237583;
                        i5 = -682545221;
                    } else {
                        iM3169 = C0619.m2761("᩵ۢ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-11367)) ^ (-1573850490);
                        i5 = -1692805030;
                    }
                    break;
                case -1807337799:
                case 952842079:
                    if (C2702.f8586 <= 0) {
                        iM3169 = (i2 - C0619.m2761("֫ᩳ")) * (-49);
                        i4 = ((iM3169 ^ i3) * (-24863)) ^ 61715254;
                        i5 = -757923624;
                    } else {
                        iM3169 = (i3 - C0773.m3169("֫۠")) * (-49);
                        i4 = ((iM3169 ^ i2) * 27013) ^ 31285735;
                        i5 = -1232000568;
                    }
                    break;
                case -1761971475:
                case 1017498855:
                    if (C2023.f6737) {
                        iM3169 = (i2 - C0619.m2761("֫ᩳ")) * (-49);
                        i4 = ((iM3169 ^ i3) * (-24863)) ^ 61715254;
                        i5 = -757923624;
                    } else {
                        iM3169 = (C0619.m2761("ۖ۬") ^ i2) * (-85);
                        i4 = ((iM3169 ^ i3) * 19751) ^ 661273618;
                        i5 = -473581361;
                    }
                    break;
                case -1370164757:
                case -1297907351:
                    if (C3690.f12684 <= 0) {
                        iM3169 = (C0619.m2761("᩸֡") ^ i3) * 59;
                        i4 = ((iM3169 ^ i2) * 28339) ^ (-1611231708);
                        i5 = -785518309;
                    } else {
                        iM3169 = C0619.m2761("ۗۗ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-29083)) ^ 2085466551;
                        i5 = -2018479984;
                    }
                    break;
                case -1274993638:
                case 1140615120:
                    if (C0619.f2439) {
                        iM3169 = (i2 - C0619.m2761("֫ᩳ")) * (-49);
                        i4 = ((iM3169 ^ i3) * (-24863)) ^ 61715254;
                        i5 = -757923624;
                    } else {
                        iM3169 = C0773.m3169("ۨۛ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-28387)) ^ 1796988796;
                        i5 = 794004701;
                    }
                    break;
                case -1210173650:
                case -306503738:
                    if (C1343.f4799 != 0) {
                        iM3169 = (C0619.m2761("ۡᩳ") + i2) * (-99);
                        i4 = ((iM3169 ^ i3) * 26881) ^ 762901021;
                        i5 = -134131662;
                    } else {
                        stopService(new Intent(this, (Class<?>) ServiceC20713.class));
                        iM3169 = C0773.m3169("ᩳۛ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 11089) ^ (-668670035);
                        i5 = -179273067;
                    }
                    break;
                case -995669596:
                case 1788201138:
                    if (!RunnableC1848.f6235) {
                        iM3169 = (i2 - C0619.m2761("֫ᩳ")) * (-49);
                        i4 = ((iM3169 ^ i3) * (-24863)) ^ 61715254;
                        i5 = -757923624;
                    } else {
                        iM3169 = (C0619.m2761("᩸֡") ^ i3) * 59;
                        i4 = ((iM3169 ^ i2) * 28339) ^ (-1611231708);
                        i5 = -785518309;
                    }
                    break;
                case -903338852:
                case 526578150:
                    C1564.m5509();
                    if (RunnableC0334.f1808 > 0) {
                        iM3169 = C0619.m2761("ܽᩳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 20011) ^ 1314237583;
                        i5 = -682545221;
                    } else {
                        iM3169 = (C0773.m3169("ܶ᩹") + i3) * 93;
                        i4 = ((iM3169 ^ i2) * 28523) ^ 941322197;
                        i5 = -951931558;
                    }
                    break;
                case -878760465:
                case -490725366:
                    binderC3559 = this.f40161;
                    if (binderC3559 != null) {
                        iM3169 = C0619.m2761("ۗܳ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 28201) ^ (-461681541);
                        i5 = -521912952;
                    } else {
                        iM3169 = C0773.m3169("ᩳۛ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 11089) ^ (-668670035);
                        i5 = -179273067;
                    }
                    break;
                case -647114983:
                case 606721970:
                    if (C1542.f5343 <= 0) {
                        iM3169 = (C0619.m2761("᩸֡") ^ i3) * 59;
                        i4 = ((iM3169 ^ i2) * 28339) ^ (-1611231708);
                        i5 = -785518309;
                    } else {
                        iM3169 = (C0773.m3169("ܰ۫") ^ i2) * (-51);
                        i4 = ((iM3169 ^ i3) * (-3593)) ^ (-1278993276);
                        i5 = 242003722;
                    }
                    break;
                case -534887854:
                case 1913050592:
                    binderC3559.m11606();
                    iM3169 = C0773.m3169("ᩳۛ") ^ i3;
                    i4 = ((iM3169 ^ i2) * 11089) ^ (-668670035);
                    i5 = -179273067;
                    break;
                case -469634261:
                case 451478075:
                    C4238.m13537(this);
                    iM3169 = (C0619.m2761("۫ۙ") ^ i3) * 43;
                    i4 = ((iM3169 ^ i2) * (-8857)) ^ (-73056063);
                    i5 = 2073531418;
                    break;
                case -425384812:
                case -267762212:
                    if (C3077.m10048(this)) {
                        iM3169 = (C0619.m2761("۫ۙ") ^ i3) * 43;
                        i4 = ((iM3169 ^ i2) * (-8857)) ^ (-73056063);
                        i5 = 2073531418;
                    } else {
                        iM3169 = (C0773.m3169("۟ۧ") + i2) * (-67);
                        i4 = ((iM3169 ^ i3) * (-4277)) ^ (-1547364377);
                        i5 = -1803943561;
                    }
                    break;
                case 214770834:
                case 1429804871:
                    if (C1146.f4234 >= 0) {
                        iM3169 = (C0619.m2761("᩸֡") ^ i3) * 59;
                        i4 = ((iM3169 ^ i2) * 28339) ^ (-1611231708);
                        i5 = -785518309;
                    } else {
                        iM3169 = (i2 - C0773.m3169("ܺۖ")) * (-99);
                        i4 = ((iM3169 ^ i3) * 11329) ^ 1480531599;
                        i5 = 1213713616;
                    }
                    break;
                case 566924727:
                case 2056954457:
                    break;
                case 805953100:
                case 903533767:
                    C1146.m4231();
                    iM3169 = (C0773.m3169("ܶ᩹") + i3) * 93;
                    i4 = ((iM3169 ^ i2) * 28523) ^ 941322197;
                    i5 = -951931558;
                    break;
                case 1219527867:
                case 1832746499:
                    if (C1343.f4799 == 0) {
                        iM3169 = (i2 - C0619.m2761("֫ᩳ")) * (-49);
                        i4 = ((iM3169 ^ i3) * (-24863)) ^ 61715254;
                        i5 = -757923624;
                    } else {
                        iM3169 = (C0773.m3169("ܶ᩹") + i3) * 93;
                        i4 = ((iM3169 ^ i2) * 28523) ^ 941322197;
                        i5 = -951931558;
                    }
                    break;
                default:
                    if (AbstractC3624.m11755() != 0) {
                        iM3169 = (C0619.m2761("᩸֡") ^ i3) * 59;
                        i4 = ((iM3169 ^ i2) * 28339) ^ (-1611231708);
                        i5 = -785518309;
                    } else {
                        iM3169 = C0773.m3169("ۧۤ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-21925)) ^ 1517896725;
                        i5 = -1641034981;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x012e A[PHI: r2 r9 r10 r11 r20 r21
      0x012e: PHI (r2v3 int) = (r2v2 int), (r2v2 int), (r2v4 int) binds: [B:63:0x0277, B:51:0x01df, B:36:0x012c] A[DONT_GENERATE, DONT_INLINE]
      0x012e: PHI (r9v4 int) = (r9v2 int), (r9v3 int), (r9v2 int) binds: [B:63:0x0277, B:51:0x01df, B:36:0x012c] A[DONT_GENERATE, DONT_INLINE]
      0x012e: PHI (r10v4 int) = (r10v2 int), (r10v3 int), (r10v2 int) binds: [B:63:0x0277, B:51:0x01df, B:36:0x012c] A[DONT_GENERATE, DONT_INLINE]
      0x012e: PHI (r11v4 int) = (r11v2 int), (r11v3 int), (r11v2 int) binds: [B:63:0x0277, B:51:0x01df, B:36:0x012c] A[DONT_GENERATE, DONT_INLINE]
      0x012e: PHI (r20v12 int) = (r20v3 int), (r20v6 int), (r20v13 int) binds: [B:63:0x0277, B:51:0x01df, B:36:0x012c] A[DONT_GENERATE, DONT_INLINE]
      0x012e: PHI (r21v5 char) = (r21v4 char), (r21v3 char), (r21v3 char) binds: [B:63:0x0277, B:51:0x01df, B:36:0x012c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x0205 A[PHI: r8 r13 r14 r15 r20
      0x0205: PHI (r8v4 int) = (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:55:0x0203, B:40:0x0155, B:15:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x0205: PHI (r13v4 short[]) = (r13v2 short[]), (r13v3 short[]), (r13v2 short[]) binds: [B:55:0x0203, B:40:0x0155, B:15:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x0205: PHI (r14v4 int) = (r14v2 int), (r14v3 int), (r14v2 int) binds: [B:55:0x0203, B:40:0x0155, B:15:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x0205: PHI (r15v4 int) = (r15v2 int), (r15v3 int), (r15v2 int) binds: [B:55:0x0203, B:40:0x0155, B:15:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x0205: PHI (r20v18 int) = (r20v5 int), (r20v11 int), (r20v19 int) binds: [B:55:0x0203, B:40:0x0155, B:15:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x023d A[PHI: r3 r4 r7 r20
      0x023d: PHI (r3v4 java.lang.String) = (r3v2 java.lang.String), (r3v3 java.lang.String), (r3v2 java.lang.String) binds: [B:59:0x023b, B:28:0x00db, B:11:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x023d: PHI (r4v4 int) = (r4v2 int), (r4v2 int), (r4v5 int) binds: [B:59:0x023b, B:28:0x00db, B:11:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x023d: PHI (r7v4 short) = (r7v3 short), (r7v2 short), (r7v2 short) binds: [B:59:0x023b, B:28:0x00db, B:11:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x023d: PHI (r20v20 int) = (r20v4 int), (r20v16 int), (r20v21 int) binds: [B:59:0x023b, B:28:0x00db, B:11:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractActivityC17204, l.ActivityC3409, android.app.Activity
    public final void onPause() {
        int iM2761;
        int i;
        int i2;
        int i3;
        int i4 = C3448.f11240;
        int i5 = C1146.f4234;
        int iM2762 = (C0619.m2761("᩶ۙ") ^ i4) * (-47);
        int i6 = ((iM2762 ^ i5) * 4321) ^ (-583772473);
        String strM1785 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i7 = iM2762 ^ (-856237287);
        int i8 = 0;
        int iM3169 = 0;
        int iM2763 = 0;
        short s = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = -92849629;
        char c = 0;
        while (true) {
            i16 = i7 ^ (i6 & (((i16 ^ i5) * 25485) >> 31));
            switch (i16) {
                case -1999625856:
                case 892792717:
                    if (C1519.f5300 >= 0) {
                        i8 = i8;
                        iM2761 = (i4 - C0619.m2761("ܶۤ")) * 39;
                        i = ((iM2761 ^ i5) * (-16647)) ^ 1559366821;
                        i2 = 536195655;
                        int i17 = i8;
                        i7 = iM2761 ^ i2;
                        i6 = i;
                        i8 = i17;
                    } else {
                        int iM31610 = (i5 - C0773.m3169("֫ۚ")) * 15;
                        i7 = iM31610 ^ (-1786652973);
                        i6 = ((iM31610 ^ i4) * (-8403)) ^ 1720234846;
                    }
                    break;
                case -1975714210:
                case -219204814:
                    if (C2310.m7813() > 0) {
                        i8 = i8;
                        iM2761 = (i4 - C0773.m3169("ۨܽ")) * (-91);
                        i = ((iM2761 ^ i5) * (-775)) ^ (-811834866);
                        i2 = -1788888211;
                        int i18 = i8;
                        i7 = iM2761 ^ i2;
                        i6 = i;
                        i8 = i18;
                    }
                    i8 = i8;
                    iM2761 = (i4 - C0619.m2761("ܶۤ")) * 39;
                    i = ((iM2761 ^ i5) * (-16647)) ^ 1559366821;
                    i2 = 536195655;
                    int i19 = i8;
                    i7 = iM2761 ^ i2;
                    i6 = i;
                    i8 = i19;
                    break;
                case -1773561820:
                case -166592373:
                    i8 = i8;
                    s = sArr[c];
                    if (C2834.f9334 <= 0) {
                        iM2761 = (i4 - C0773.m3169("ۨܽ")) * (-91);
                        i = ((iM2761 ^ i5) * (-775)) ^ (-811834866);
                        i2 = -1788888211;
                    } else {
                        iM2761 = (C0619.m2761("ܰ᩺") + i5) * (-21);
                        i = ((iM2761 ^ i4) * (-23353)) ^ (-420055485);
                        i2 = -450738154;
                    }
                    int i110 = i8;
                    i7 = iM2761 ^ i2;
                    i6 = i;
                    i8 = i110;
                    break;
                case -1767389812:
                case 452569084:
                    i8 = i8;
                    sArr = f40157;
                    if (C3033.f9831 >= 0) {
                        iM2761 = (i4 - C0619.m2761("ܶۤ")) * 39;
                        i = ((iM2761 ^ i5) * (-16647)) ^ 1559366821;
                        i2 = 536195655;
                    } else {
                        iM2761 = C0619.m2761("֨ܺ") ^ i5;
                        i = ((iM2761 ^ i4) * (-6723)) ^ 883976936;
                        i2 = -2031807882;
                    }
                    int i111 = i8;
                    i7 = iM2761 ^ i2;
                    i6 = i;
                    i8 = i111;
                    break;
                case -1608622074:
                case 1784137597:
                    i8 = i8;
                    strM1785 = C0269.m1785(sArr3, 45, 3, i13);
                    if (C1321.m4852()) {
                        iM2761 = (C0773.m3169("ۚ۟") + i4) * (-101);
                        i = ((iM2761 ^ i5) * (-17303)) ^ (-2006877185);
                        i2 = 1785153712;
                    } else {
                        iM2761 = (i4 - C0773.m3169("ۨܽ")) * (-91);
                        i = ((iM2761 ^ i5) * (-775)) ^ (-811834866);
                        i2 = -1788888211;
                    }
                    int i112 = i8;
                    i7 = iM2761 ^ i2;
                    i6 = i;
                    i8 = i112;
                    break;
                case -1484256805:
                case -78896653:
                    i3 = iM3169 ^ 2102362674;
                    sArr3 = f40157;
                    if (C3033.f9831 >= 0) {
                        iM2761 = C0773.m3169("᩺ᩳ") ^ i5;
                        i8 = i3;
                        i = ((iM2761 ^ i4) * 18363) ^ (-1170894397);
                        i2 = 977727333;
                    } else {
                        iM2761 = C0773.m3169("ۡ᩵") ^ i5;
                        i8 = i3;
                        i = ((iM2761 ^ i4) * (-2031)) ^ (-1870530197);
                        i2 = 275239344;
                    }
                    int i113 = i8;
                    i7 = iM2761 ^ i2;
                    i6 = i;
                    i8 = i113;
                    break;
                case -1243168677:
                case -605771985:
                    i13 = 63259;
                    iM2761 = C0619.m2761("ۡܶ") ^ i4;
                    i = ((iM2761 ^ i5) * (-11869)) ^ 1150578630;
                    i2 = 583005124;
                    int i114 = i8;
                    i7 = iM2761 ^ i2;
                    i6 = i;
                    i8 = i114;
                    break;
                case -1098748018:
                case 1437277843:
                    i13 = 11993;
                    iM2761 = C0619.m2761("ۡܶ") ^ i4;
                    i = ((iM2761 ^ i5) * (-11869)) ^ 1150578630;
                    i2 = 583005124;
                    int i115 = i8;
                    i7 = iM2761 ^ i2;
                    i6 = i;
                    i8 = i115;
                    break;
                case -984785726:
                case -889810153:
                    i8 = i8;
                    sArr2 = f40157;
                    i14 = 42;
                    i15 = 3;
                    if (C2354.m7983()) {
                        iM2761 = (C0619.m2761("֡ۧ") + i4) * 5;
                        i = ((iM2761 ^ i5) * (-12119)) ^ 1993093866;
                        i2 = -120154668;
                    } else {
                        iM2761 = (i5 - C0773.m3169("֨ۛ")) * 37;
                        i = ((iM2761 ^ i4) * 13295) ^ 2005085422;
                        i2 = 161505643;
                    }
                    int i116 = i8;
                    i7 = iM2761 ^ i2;
                    i6 = i;
                    i8 = i116;
                    break;
                case -221749719:
                case -79223464:
                    C2310.m7813();
                    if (C13473.f42873 == 0) {
                        i8 = i8;
                        iM2761 = (i5 - C0773.m3169("֨ۛ")) * 37;
                        i = ((iM2761 ^ i4) * 13295) ^ 2005085422;
                        i2 = 161505643;
                        int i117 = i8;
                        i7 = iM2761 ^ i2;
                        i6 = i;
                        i8 = i117;
                    }
                    i8 = i8;
                    iM2761 = (i4 - C0619.m2761("ܶۤ")) * 39;
                    i = ((iM2761 ^ i5) * (-16647)) ^ 1559366821;
                    i2 = 536195655;
                    int i118 = i8;
                    i7 = iM2761 ^ i2;
                    i6 = i;
                    i8 = i118;
                    break;
                case 14739920:
                case 916257510:
                    i8 = i8;
                    c = ')';
                    if (C1826.m6301() >= 0) {
                        i3 = i8;
                        iM2761 = C0773.m3169("᩺ᩳ") ^ i5;
                        i8 = i3;
                        i = ((iM2761 ^ i4) * 18363) ^ (-1170894397);
                        i2 = 977727333;
                    } else {
                        iM2761 = C0619.m2761("ۛ᩺") ^ i4;
                        i = ((iM2761 ^ i5) * 22183) ^ (-886752782);
                        i2 = 2113981053;
                    }
                    int i119 = i8;
                    i7 = iM2761 ^ i2;
                    i6 = i;
                    i8 = i119;
                    break;
                case 62034623:
                case 1624547026:
                    i8 = i8;
                    i9 = s + 11352;
                    if (RunnableC0334.f1808 <= 0) {
                        iM2761 = (i5 - C0773.m3169("֨ۛ")) * 37;
                        i = ((iM2761 ^ i4) * 13295) ^ 2005085422;
                        i2 = 161505643;
                    } else {
                        iM2761 = C0619.m2761("ܿۤ") ^ i4;
                        i = ((iM2761 ^ i5) * 165) ^ (-1987509868);
                        i2 = -782913619;
                    }
                    int i1110 = i8;
                    i7 = iM2761 ^ i2;
                    i6 = i;
                    i8 = i1110;
                    break;
                case 175463769:
                case 766005473:
                    i8 = i8;
                    int i20 = i11 + i12;
                    if ((i20 + i20) - i10 >= 0) {
                        iM2761 = (C0773.m3169("֨֡") + i5) * 55;
                        i = ((iM2761 ^ i4) * (-13921)) ^ (-986536479);
                        i2 = 1608307638;
                    } else {
                        iM2761 = C0773.m3169("ܰ᩸") ^ i5;
                        i = ((iM2761 ^ i4) * 4377) ^ 631510801;
                        i2 = -439174695;
                    }
                    int i1111 = i8;
                    i7 = iM2761 ^ i2;
                    i6 = i;
                    i8 = i1111;
                    break;
                case 245616195:
                case 1134339282:
                    overridePendingTransition(i8, 2122969154 ^ iM2763);
                    super.onPause();
                    break;
                case 543494636:
                case 1906487272:
                    i8 = i8;
                    iM3169 = C0773.m3169(C2834.m9343(sArr2, i14, i15, i13));
                    if (C2966.f9654 >= 0) {
                        i3 = i8;
                        iM2761 = C0773.m3169("᩺ᩳ") ^ i5;
                        i8 = i3;
                        i = ((iM2761 ^ i4) * 18363) ^ (-1170894397);
                        i2 = 977727333;
                    } else {
                        iM2761 = C0619.m2761("᩸ۖ") ^ i5;
                        i = ((iM2761 ^ i4) * 12701) ^ 1480695930;
                        i2 = 1261847727;
                    }
                    int i1112 = i8;
                    i7 = iM2761 ^ i2;
                    i6 = i;
                    i8 = i1112;
                    break;
                case 821385465:
                case 1629688773:
                    iM2763 = C0619.m2761(strM1785);
                    if (C11235.f35427 >= 0) {
                        i8 = i8;
                        iM2761 = (i4 - C0773.m3169("ۨܽ")) * (-91);
                        i = ((iM2761 ^ i5) * (-775)) ^ (-811834866);
                        i2 = -1788888211;
                    } else {
                        iM2761 = (C0619.m2761("ۜ֫") + i4) * 79;
                        i8 = i8;
                        i = ((iM2761 ^ i5) * (-3523)) ^ (-756527132);
                        i2 = -1582867496;
                    }
                    int i1113 = i8;
                    i7 = iM2761 ^ i2;
                    i6 = i;
                    i8 = i1113;
                    break;
                case 958198926:
                case 1718008671:
                    i8 = i8;
                    i10 = i9 * i9;
                    i11 = s * s;
                    i12 = 128867904;
                    if (C1826.f6190 <= 0) {
                        i3 = i8;
                        iM2761 = C0773.m3169("᩺ᩳ") ^ i5;
                        i8 = i3;
                        i = ((iM2761 ^ i4) * 18363) ^ (-1170894397);
                        i2 = 977727333;
                    } else {
                        iM2761 = (C0619.m2761("᩶ܰ") + i4) * 43;
                        i = ((iM2761 ^ i5) * 13131) ^ (-1279074802);
                        i2 = 244903993;
                    }
                    int i1114 = i8;
                    i7 = iM2761 ^ i2;
                    i6 = i;
                    i8 = i1114;
                    break;
                case 1999376976:
                case 2095911119:
                    C3998.m12920();
                    int iM31611 = (i5 - C0773.m3169("֫ۚ")) * 15;
                    i7 = iM31611 ^ (-1786652973);
                    i6 = ((iM31611 ^ i4) * (-8403)) ^ 1720234846;
                    break;
                default:
                    C0862.m3503();
                    C23916.m53419();
                    break;
            }
            return;
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int iM2761;
        int i;
        int i2;
        short[] sArr;
        int i3;
        int iM2762;
        int i4;
        int iM2763;
        int i5;
        int i6;
        int iM3169;
        int i7;
        int i8 = C2287.f7432;
        int i9 = C1519.f5300;
        int iM31610 = (C0773.m3169("ۙۜ") ^ i9) * 115;
        int i10 = ((iM31610 ^ i8) * 10957) ^ (-1337690686);
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i11 = iM31610 ^ 1398237971;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        char c = 0;
        short s = 0;
        int i19 = 122576145;
        int i20 = 0;
        String strM11769 = null;
        String strM2756 = null;
        String strM3780 = null;
        int iM3792 = 0;
        while (true) {
            i19 = i11 ^ (i10 & (((i19 ^ i8) * (-29153)) >> 31));
            switch (i19) {
                case -2134965804:
                case 1489112744:
                    i16 = 18237;
                    iM2763 = C0619.m2761("۫᩹") ^ i8;
                    i5 = ((iM2763 ^ i9) * 31363) ^ 1462217974;
                    i6 = 391398063;
                    i11 = iM2763 ^ i6;
                    i14 = i14;
                    i10 = i5;
                    i17 = i17;
                    sArr3 = sArr3;
                    break;
                case -2084986399:
                case 2086347735:
                    C4238.m13537(this);
                    break;
                case -1764435914:
                case -1757205432:
                    i14 = i14;
                    sArr3 = sArr3;
                    i17 = i17;
                    iM3792 = C0950.m3792(view);
                    if (iM3792 == 16908314) {
                        iM2763 = (i8 - C0773.m3169("ܶ᩷")) * 123;
                        i5 = ((iM2763 ^ i9) * 4715) ^ 630471282;
                        i6 = 1613190792;
                    } else {
                        iM2763 = (C0619.m2761("ܳܽ") + i9) * 3;
                        i5 = ((iM2763 ^ i8) * 24765) ^ 1226238381;
                        i6 = -860976367;
                    }
                    i11 = iM2763 ^ i6;
                    i14 = i14;
                    i10 = i5;
                    i17 = i17;
                    sArr3 = sArr3;
                    break;
                case -1741486011:
                case 1984751185:
                    i14 = i14;
                    sArr = sArr3;
                    i3 = i17;
                    strM11769 = AbstractC3624.m11769(f40157, 7, 3, i16);
                    if (C1146.f4234 < 0) {
                        iM2762 = (C0619.m2761("ۚܰ") ^ i8) * 89;
                        i = ((iM2762 ^ i9) * 13797) ^ (-1924161287);
                        i4 = 1171885765;
                        int i21 = iM2762 ^ i4;
                        sArr3 = sArr;
                        i17 = i3;
                        i11 = i21;
                        int i22 = i;
                        i14 = i14;
                        i10 = i22;
                    } else {
                        sArr3 = sArr;
                        i17 = i3;
                        iM2763 = (C0619.m2761("ܺۘ") + i8) * (-25);
                        i5 = ((iM2763 ^ i9) * (-18789)) ^ (-1029131537);
                        i6 = -780217159;
                        i11 = iM2763 ^ i6;
                        i14 = i14;
                        i10 = i5;
                        i17 = i17;
                        sArr3 = sArr3;
                    }
                    break;
                case -1662682156:
                case -898891360:
                    i14 = i14;
                    short[] sArr5 = sArr3;
                    int i23 = i17;
                    C0950.m3790(this);
                    if (RunnableC0334.f1808 > 0) {
                        RunnableC1848.m6363(this, new Intent(this, (Class<?>) ServiceConnectionC24443.class));
                    } else {
                        sArr3 = sArr5;
                        i17 = i23;
                        iM2761 = C0773.m3169("ܽ֫") ^ i8;
                        i = ((iM2761 ^ i9) * 16307) ^ (-154669346);
                        i2 = -1700730518;
                        i11 = iM2761 ^ i2;
                        int i24 = i;
                        i14 = i14;
                        i10 = i24;
                    }
                    break;
                case -1645037129:
                case -122347588:
                    i14 = i14;
                    sArr3 = sArr3;
                    i17 = i17;
                    c = 0;
                    if (C3690.f12684 <= 0) {
                        iM2763 = (C0619.m2761("ܺۘ") + i8) * (-25);
                        i5 = ((iM2763 ^ i9) * (-18789)) ^ (-1029131537);
                        i6 = -780217159;
                    } else {
                        iM2763 = (C0619.m2761("ۧᩳ") + i9) * (-33);
                        i5 = ((iM2763 ^ i8) * 20263) ^ (-1129396701);
                        i6 = 203322448;
                    }
                    i11 = iM2763 ^ i6;
                    i14 = i14;
                    i10 = i5;
                    i17 = i17;
                    sArr3 = sArr3;
                    break;
                case -1521255904:
                case -450148234:
                    i14 = i14;
                    sArr3 = sArr3;
                    i17 = i17;
                    strM3780 = C0950.m3780(sArr3, i17, i18, i16);
                    if (C1080.f3865 < 0) {
                        iM2763 = (C0773.m3169("᩸᩶") ^ i8) * 93;
                        i5 = ((iM2763 ^ i9) * (-24959)) ^ 2125497947;
                        i6 = -794588341;
                        i11 = iM2763 ^ i6;
                        i14 = i14;
                        i10 = i5;
                        i17 = i17;
                        sArr3 = sArr3;
                    } else {
                        i17 = i17;
                        sArr3 = sArr3;
                        iM2761 = C0773.m3169("ܽ֫") ^ i8;
                        i = ((iM2761 ^ i9) * 16307) ^ (-154669346);
                        i2 = -1700730518;
                        i11 = iM2761 ^ i2;
                        int i25 = i;
                        i14 = i14;
                        i10 = i25;
                    }
                    break;
                case -1483927458:
                case -841753611:
                    i14 = i14;
                    sArr = sArr3;
                    i3 = i17;
                    if (C2834.m9342() - this.f40158 < 300) {
                        iM2762 = (i9 - C0773.m3169("֡۫")) * 53;
                        i = ((iM2762 ^ i8) * (-7049)) ^ 870282566;
                        i4 = 961899982;
                    } else {
                        iM2762 = C0773.m3169("ۘ᩹") ^ i8;
                        i = ((iM2762 ^ i9) * (-7407)) ^ 200610576;
                        i4 = -1107269561;
                    }
                    int i26 = iM2762 ^ i4;
                    sArr3 = sArr;
                    i17 = i3;
                    i11 = i26;
                    int i27 = i;
                    i14 = i14;
                    i10 = i27;
                    break;
                case -1432611917:
                case 1533557742:
                    i14 = i14;
                    sArr = sArr3;
                    i3 = i17;
                    sArr4 = f40157;
                    i12 = 4;
                    i13 = 3;
                    if (C3690.f12684 > 0) {
                        iM2762 = C0619.m2761("᩹۫") ^ i8;
                        i = ((iM2762 ^ i9) * 9095) ^ (-1511399245);
                        i4 = -1853594879;
                        int i28 = iM2762 ^ i4;
                        sArr3 = sArr;
                        i17 = i3;
                        i11 = i28;
                        int i29 = i;
                        i14 = i14;
                        i10 = i29;
                    } else {
                        i14 = i14;
                        sArr3 = sArr;
                        i17 = i3;
                        iM3169 = (C0619.m2761("֡ۧ") ^ i9) * (-39);
                        i5 = ((iM3169 ^ i8) * (-17021)) ^ (-76376659);
                        i7 = -860739912;
                        i11 = iM3169 ^ i7;
                        i10 = i5;
                        i17 = i17;
                        sArr3 = sArr3;
                    }
                    break;
                case -1394224696:
                case 764786973:
                    if (C2287.f7432 >= 0) {
                        i14 = i14;
                        iM2761 = C0773.m3169("ܽ֫") ^ i8;
                        i = ((iM2761 ^ i9) * 16307) ^ (-154669346);
                        i2 = -1700730518;
                        i11 = iM2761 ^ i2;
                        int i210 = i;
                        i14 = i14;
                        i10 = i210;
                    } else {
                        sArr3 = sArr3;
                        i17 = i17;
                        iM3169 = (C0619.m2761("֡ۧ") ^ i9) * (-39);
                        i5 = ((iM3169 ^ i8) * (-17021)) ^ (-76376659);
                        i7 = -860739912;
                        i11 = iM3169 ^ i7;
                        i10 = i5;
                        i17 = i17;
                        sArr3 = sArr3;
                    }
                    break;
                case -1374099972:
                case 921491079:
                    i14 = i14;
                    sArr3 = sArr3;
                    i17 = i17;
                    sArr2 = f40157;
                    if (C1542.f5343 > 0) {
                        iM2763 = C0619.m2761("᩷ܳ") ^ i8;
                        i5 = ((iM2763 ^ i9) * (-31421)) ^ (-1807418507);
                        i6 = 501619746;
                        i11 = iM2763 ^ i6;
                        i14 = i14;
                        i10 = i5;
                        i17 = i17;
                        sArr3 = sArr3;
                    } else {
                        i14 = i14;
                        iM3169 = (C0619.m2761("֡ۧ") ^ i9) * (-39);
                        i5 = ((iM3169 ^ i8) * (-17021)) ^ (-76376659);
                        i7 = -860739912;
                        i11 = iM3169 ^ i7;
                        i10 = i5;
                        i17 = i17;
                        sArr3 = sArr3;
                    }
                    break;
                case -1360216894:
                case 1145538909:
                    this.f40159 = true;
                    C0950.m3790(this);
                    break;
                case -1265241908:
                case 1407768286:
                    sArr3 = sArr3;
                    i17 = i17;
                    i14 = i20 * i20;
                    i15 = s * 2;
                    if (C1321.f4751 >= 0) {
                        iM3169 = (C0619.m2761("֡ۧ") ^ i9) * (-39);
                        i5 = ((iM3169 ^ i8) * (-17021)) ^ (-76376659);
                        i7 = -860739912;
                    } else {
                        iM3169 = (C0773.m3169("ۜܳ") ^ i8) * (-85);
                        i5 = ((iM3169 ^ i9) * 25189) ^ (-859872192);
                        i7 = 387761282;
                    }
                    i11 = iM3169 ^ i7;
                    i10 = i5;
                    i17 = i17;
                    sArr3 = sArr3;
                    break;
                case -1105833720:
                case -163586151:
                    if (C2375.m8065() <= 0) {
                        i14 = i14;
                        sArr = sArr3;
                        i3 = i17;
                        iM2762 = C0619.m2761("᩻ۨ") ^ i9;
                        i = ((iM2762 ^ i8) * (-31863)) ^ 1513608403;
                        i4 = -1652611315;
                        int i211 = iM2762 ^ i4;
                        sArr3 = sArr;
                        i17 = i3;
                        i11 = i211;
                        int i212 = i;
                        i14 = i14;
                        i10 = i212;
                    } else {
                        i14 = i14;
                        sArr3 = sArr3;
                        i17 = i17;
                        iM2763 = (C0619.m2761("ܺۘ") + i8) * (-25);
                        i5 = ((iM2763 ^ i9) * (-18789)) ^ (-1029131537);
                        i6 = -780217159;
                        i11 = iM2763 ^ i6;
                        i14 = i14;
                        i10 = i5;
                        i17 = i17;
                        sArr3 = sArr3;
                    }
                    break;
                case -842089854:
                case 1343089955:
                    i14 = i14;
                    sArr = sArr3;
                    i3 = i17;
                    if (iM3792 == (C0773.m3169(strM11769) ^ 2098067358)) {
                        iM2762 = (C0773.m3169("᩶ۚ") ^ i9) * (-113);
                        i = ((iM2762 ^ i8) * (-27309)) ^ (-1824722497);
                        i4 = -1806392608;
                    } else {
                        iM2762 = C0773.m3169("ۨ᩷") ^ i8;
                        i = ((iM2762 ^ i9) * 2171) ^ (-2029720500);
                        i4 = -77183231;
                    }
                    int i213 = iM2762 ^ i4;
                    sArr3 = sArr;
                    i17 = i3;
                    i11 = i213;
                    int i214 = i;
                    i14 = i14;
                    i10 = i214;
                    break;
                case -723964545:
                case 462035452:
                    i16 = 37054;
                    iM2763 = C0619.m2761("۫᩹") ^ i8;
                    i5 = ((iM2763 ^ i9) * 31363) ^ 1462217974;
                    i6 = 391398063;
                    i11 = iM2763 ^ i6;
                    i14 = i14;
                    i10 = i5;
                    i17 = i17;
                    sArr3 = sArr3;
                    break;
                case -610865368:
                case 2071013767:
                    break;
                case -498236498:
                case 215000973:
                    i14 = i14;
                    sArr = sArr3;
                    i3 = i17;
                    if (iM3792 == (C0773.m3169(strM2756) ^ 2124680615)) {
                        iM2762 = (i9 - C0773.m3169("ܶܰ")) * 31;
                        i = ((iM2762 ^ i8) * (-26895)) ^ (-1988292499);
                        i4 = -1092928551;
                    } else {
                        iM2762 = C0773.m3169("ۜۛ") ^ i8;
                        i = ((iM2762 ^ i9) * 31293) ^ (-979144079);
                        i4 = -161766617;
                    }
                    int i215 = iM2762 ^ i4;
                    sArr3 = sArr;
                    i17 = i3;
                    i11 = i215;
                    int i216 = i;
                    i14 = i14;
                    i10 = i216;
                    break;
                case -356017840:
                case 614723759:
                    C4238.m13537(this);
                    break;
                case -92164201:
                case 1235487315:
                    i14 = i14;
                    sArr3 = f40157;
                    i17 = 1;
                    i18 = 3;
                    if (C3448.f11240 >= 0) {
                        iM2761 = C0773.m3169("ܽ֫") ^ i8;
                        i = ((iM2761 ^ i9) * 16307) ^ (-154669346);
                        i2 = -1700730518;
                    } else {
                        iM2761 = (C0619.m2761("ܽܽ") + i9) * 41;
                        i = ((iM2761 ^ i8) * (-6193)) ^ (-2068304396);
                        i2 = 776043201;
                    }
                    i11 = iM2761 ^ i2;
                    int i217 = i;
                    i14 = i14;
                    i10 = i217;
                    break;
                case 294700698:
                case 1647219541:
                    i14 = i14;
                    sArr = sArr3;
                    i3 = i17;
                    strM2756 = C0619.m2756(sArr4, i12, i13, i16);
                    if (C0487.f2131 <= 0) {
                        iM2762 = C0619.m2761("᩻ۨ") ^ i9;
                        i = ((iM2762 ^ i8) * (-31863)) ^ 1513608403;
                        i4 = -1652611315;
                    } else {
                        iM2762 = (i9 - C0619.m2761("ۢ᩸")) * (-59);
                        i = ((iM2762 ^ i8) * 1737) ^ (-941918521);
                        i4 = -1673427869;
                    }
                    int i218 = iM2762 ^ i4;
                    sArr3 = sArr;
                    i17 = i3;
                    i11 = i218;
                    int i219 = i;
                    i14 = i14;
                    i10 = i219;
                    break;
                case 399819937:
                case 1868106184:
                    i14 = i14;
                    sArr3 = sArr3;
                    i17 = i17;
                    if (i14 - (i15 + 1) < 0) {
                        iM2763 = C0619.m2761("ۙᩴ") ^ i9;
                        i5 = ((iM2763 ^ i8) * (-8823)) ^ 1520881910;
                        i6 = 195515387;
                    } else {
                        iM2763 = C0619.m2761("۫֫") ^ i8;
                        i5 = ((iM2763 ^ i9) * (-24103)) ^ 1136780762;
                        i6 = 11027453;
                    }
                    i11 = iM2763 ^ i6;
                    i14 = i14;
                    i10 = i5;
                    i17 = i17;
                    sArr3 = sArr3;
                    break;
                case 448237933:
                case 725833883:
                    C17202.m40372();
                    C3998.m12920();
                    sArr3 = sArr3;
                    i17 = i17;
                    iM3169 = (C0619.m2761("֡ۧ") ^ i9) * (-39);
                    i5 = ((iM3169 ^ i8) * (-17021)) ^ (-76376659);
                    i7 = -860739912;
                    i11 = iM3169 ^ i7;
                    i10 = i5;
                    i17 = i17;
                    sArr3 = sArr3;
                    break;
                case 683490029:
                case 1389422826:
                    i14 = i14;
                    sArr3 = sArr3;
                    i17 = i17;
                    if (iM3792 == 16908315) {
                        iM2763 = C0619.m2761("ܶۜ") ^ i9;
                        i5 = ((iM2763 ^ i8) * 26911) ^ (-712876479);
                        i6 = -1822768187;
                    } else {
                        iM2763 = C0773.m3169("᩶۟") ^ i9;
                        i5 = ((iM2763 ^ i8) * (-17303)) ^ 1599481971;
                        i6 = 637273217;
                    }
                    i11 = iM2763 ^ i6;
                    i14 = i14;
                    i10 = i5;
                    i17 = i17;
                    sArr3 = sArr3;
                    break;
                case 726535295:
                case 1107463423:
                    C3998.m12920();
                    if (C13473.f42873 == 0) {
                        i14 = i14;
                        sArr3 = sArr3;
                        i17 = i17;
                        iM2763 = (C0619.m2761("ܺۘ") + i8) * (-25);
                        i5 = ((iM2763 ^ i9) * (-18789)) ^ (-1029131537);
                        i6 = -780217159;
                        i11 = iM2763 ^ i6;
                        i14 = i14;
                        i10 = i5;
                        i17 = i17;
                        sArr3 = sArr3;
                    } else {
                        i14 = i14;
                        iM2761 = C0773.m3169("ܽ֫") ^ i8;
                        i = ((iM2761 ^ i9) * 16307) ^ (-154669346);
                        i2 = -1700730518;
                        i11 = iM2761 ^ i2;
                        int i2110 = i;
                        i14 = i14;
                        i10 = i2110;
                    }
                    break;
                case 1015946661:
                case 1511870690:
                    i14 = i14;
                    sArr3 = sArr3;
                    i17 = i17;
                    s = sArr2[c];
                    i20 = s + 1;
                    if (C3734.f12817 >= 0) {
                        iM2763 = (C0619.m2761("۠ܽ") + i8) * 33;
                        i5 = ((iM2763 ^ i9) * 21621) ^ (-851407620);
                        i6 = 1964513471;
                    } else {
                        iM2763 = C0619.m2761("۬᩺") ^ i9;
                        i5 = ((iM2763 ^ i8) * (-24115)) ^ (-178867766);
                        i6 = -1936279569;
                    }
                    i11 = iM2763 ^ i6;
                    i14 = i14;
                    i10 = i5;
                    i17 = i17;
                    sArr3 = sArr3;
                    break;
                case 1041701103:
                case 1651819768:
                    i14 = i14;
                    this.f40158 = C2834.m9342();
                    sArr = sArr3;
                    i3 = i17;
                    iM2762 = C0773.m3169("ۨ᩷") ^ i8;
                    i = ((iM2762 ^ i9) * 2171) ^ (-2029720500);
                    i4 = -77183231;
                    int i2111 = iM2762 ^ i4;
                    sArr3 = sArr;
                    i17 = i3;
                    i11 = i2111;
                    int i2112 = i;
                    i14 = i14;
                    i10 = i2112;
                    break;
                case 1064987081:
                case 1941779468:
                    C4282.m13644();
                    C3099.m10095();
                    break;
                case 1277474204:
                case 1740446317:
                    this.f40160.m7129();
                    break;
                default:
                    i14 = i14;
                    sArr = sArr3;
                    i3 = i17;
                    if (iM3792 == (C0619.m2761(strM3780) ^ 2104366351)) {
                        iM2762 = (i9 - C0619.m2761("ܽۖ")) * (-71);
                        i = ((iM2762 ^ i8) * 10771) ^ (-1200665991);
                        i4 = -1732025214;
                    } else {
                        iM2762 = (C0619.m2761("ۢ֡") + i8) * 39;
                        i = ((iM2762 ^ i9) * (-2093)) ^ 2073054872;
                        i4 = -657306666;
                    }
                    int i2113 = iM2762 ^ i4;
                    sArr3 = sArr;
                    i17 = i3;
                    i11 = i2113;
                    int i2114 = i;
                    i14 = i14;
                    i10 = i2114;
                    break;
            }
            return;
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        ViewOnClickListenerC2063 viewOnClickListenerC2063 = null;
        int i2 = -2068076569;
        int i3 = AbstractC0116.f1064;
        int i4 = C0269.f1558;
        int iM2761 = C0619.m2761("۟ۡ") ^ i4;
        int i5 = ((iM2761 ^ i3) * (-5051)) ^ (-203865757);
        int i6 = 862280094;
        while (true) {
            i2 = ((((i2 ^ i3) * (-9101)) >> 31) & i5) ^ (iM2761 ^ i6);
            switch (i2) {
                case -2109159554:
                case 1607935546:
                    if (C2375.f7641 <= 0) {
                        iM2761 = (i3 - C0773.m3169("۫᩻")) * (-13);
                        i5 = ((iM2761 ^ i4) * 19625) ^ (-2048424507);
                        i6 = 849141676;
                    } else {
                        iM2761 = (C0619.m2761("ܿۛ") + i3) * (-121);
                        i5 = ((iM2761 ^ i4) * 18871) ^ (-1240986684);
                        i6 = 1635591146;
                    }
                    break;
                case -1984311579:
                case 2054982123:
                    viewOnClickListenerC2063 = this.f40160;
                    if (viewOnClickListenerC2063 != null) {
                        iM2761 = C0773.m3169("ܰۚ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-1631)) ^ (-998472930);
                        i6 = 485457555;
                    } else {
                        iM2761 = C0773.m3169("ۜۡ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-1723)) ^ (-195319342);
                        i6 = -1133062398;
                    }
                    break;
                case -1860077448:
                case 1117483790:
                    AbstractC0116.m1243();
                    C1519.m5403();
                    iM2761 = (i3 - C0773.m3169("۫᩻")) * (-13);
                    i5 = ((iM2761 ^ i4) * 19625) ^ (-2048424507);
                    i6 = 849141676;
                    break;
                case -1825532776:
                case 651365236:
                    return false;
                case -1403265286:
                case 1142084374:
                    if (AbstractC3624.m11755() != 0) {
                        iM2761 = C0619.m2761("ܽۙ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-2073)) ^ (-738439921);
                        i6 = 1843203117;
                    } else {
                        iM2761 = C0619.m2761("᩶֡") ^ i4;
                        i5 = ((iM2761 ^ i3) * 10701) ^ (-568820491);
                        i6 = -367157978;
                    }
                    break;
                case -1372816133:
                case -1143909415:
                    if (C13473.f42873 == 0) {
                        iM2761 = (C0773.m3169("֨᩷") + i3) * (-11);
                        i5 = ((iM2761 ^ i4) * (-1409)) ^ (-367605032);
                        i6 = -2011481573;
                    } else {
                        iM2761 = C0619.m2761("ܽۙ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-2073)) ^ (-738439921);
                        i6 = 1843203117;
                    }
                    break;
                case -1106574396:
                case 816060888:
                    if (C1783.f6087 <= 0) {
                        iM2761 = C0619.m2761("ܽۙ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-2073)) ^ (-738439921);
                        i6 = 1843203117;
                    } else {
                        iM2761 = (C0619.m2761("ᩴۚ") ^ i4) * (-119);
                        i5 = ((iM2761 ^ i3) * 12025) ^ (-64817583);
                        i6 = -2065041089;
                    }
                    break;
                case -1005800150:
                case 139035653:
                    C2288.m7767();
                    if (C2834.f9334 > 0) {
                        iM2761 = C0773.m3169("֫ۖ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 25313) ^ 203147530;
                        i6 = -2123738513;
                    } else {
                        iM2761 = (C0773.m3169("֨᩷") + i3) * (-11);
                        i5 = ((iM2761 ^ i4) * (-1409)) ^ (-367605032);
                        i6 = -2011481573;
                    }
                    break;
                case -984073006:
                case 1118842255:
                    if (C4282.f15546 <= 0) {
                        iM2761 = (i3 - C0773.m3169("۫᩻")) * (-13);
                        i5 = ((iM2761 ^ i4) * 19625) ^ (-2048424507);
                        i6 = 849141676;
                    } else {
                        iM2761 = (C0773.m3169("۟۠") + i3) * 9;
                        i5 = ((iM2761 ^ i4) * 16079) ^ 841805978;
                        i6 = 364560221;
                    }
                    break;
                case -634769297:
                case -358079617:
                    if (C2966.m9664()) {
                        iM2761 = (C0619.m2761("᩷ۜ") + i4) * (-123);
                        i5 = ((iM2761 ^ i3) * (-10403)) ^ 139339659;
                        i6 = -1448672493;
                    } else {
                        iM2761 = C0619.m2761("ܽۙ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-2073)) ^ (-738439921);
                        i6 = 1843203117;
                    }
                    break;
                case -585479593:
                case 1838254946:
                    if (C2288.f7433 <= 0) {
                        iM2761 = C0619.m2761("ܽۙ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-2073)) ^ (-738439921);
                        i6 = 1843203117;
                    } else {
                        iM2761 = C0773.m3169("ۚۜ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-5113)) ^ (-1394621297);
                        i6 = -79500091;
                    }
                    break;
                case -517782291:
                case 1098031765:
                    if (keyEvent.getAction() == 0) {
                        iM2761 = C0619.m2761("ᩴۨ") ^ i3;
                        i5 = ((iM2761 ^ i4) * 135) ^ (-1437319181);
                        i6 = 1193742865;
                    } else {
                        iM2761 = C0773.m3169("ۜۡ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-1723)) ^ (-195319342);
                        i6 = -1133062398;
                    }
                    break;
                case -299864601:
                case 274576196:
                    if (C17202.f56030) {
                        iM2761 = (i3 - C0773.m3169("۠᩺")) * (-27);
                        i5 = ((iM2761 ^ i4) * (-7429)) ^ 1567569755;
                        i6 = 1016028304;
                    } else {
                        iM2761 = (i3 - C0773.m3169("۫᩻")) * (-13);
                        i5 = ((iM2761 ^ i4) * 19625) ^ (-2048424507);
                        i6 = 849141676;
                    }
                    break;
                case -196917903:
                case 1045959978:
                    if (C0269.f1558 <= 0) {
                        iM2761 = (C0773.m3169("֨᩷") + i3) * (-11);
                        i5 = ((iM2761 ^ i4) * (-1409)) ^ (-367605032);
                        i6 = -2011481573;
                    } else {
                        iM2761 = C0619.m2761("᩵ܺ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-26009)) ^ 981610170;
                        i6 = -290069082;
                    }
                    break;
                case -119175672:
                case 966290366:
                    C1321.m4852();
                    return false;
                case -10696133:
                case 318810771:
                    if (RunnableC3055.m9933() != 0) {
                        iM2761 = C0619.m2761("ۛۚ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-22631)) ^ (-1042171469);
                        i6 = 207069926;
                    } else {
                        iM2761 = (i4 - C0619.m2761("۬ᩴ")) * (-97);
                        i5 = ((iM2761 ^ i3) * 14435) ^ 797709882;
                        i6 = 223631104;
                    }
                    break;
                case 195404594:
                case 418473605:
                    viewOnClickListenerC2063.onClick(null);
                    iM2761 = C0773.m3169("ۜۡ") ^ i4;
                    i5 = ((iM2761 ^ i3) * (-1723)) ^ (-195319342);
                    i6 = -1133062398;
                    break;
                case 335564055:
                case 1508798670:
                    C4238.m13537(this);
                    return true;
                case 472062563:
                case 804546693:
                    if (C1343.f4799 != 0) {
                        iM2761 = C0773.m3169("֫ۖ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 25313) ^ 203147530;
                        i6 = -2123738513;
                    } else {
                        iM2761 = (C0619.m2761("ۜۙ") ^ i4) * (-47);
                        i5 = ((iM2761 ^ i3) * (-13177)) ^ 353370217;
                        i6 = 1816245288;
                    }
                    break;
                case 645438252:
                case 1522095900:
                    C3448.m11248();
                    if (C3998.f13671 == 0) {
                        iM2761 = C0619.m2761("ܽۙ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-2073)) ^ (-738439921);
                        i6 = 1843203117;
                    } else {
                        iM2761 = (i3 - C0773.m3169("۫᩻")) * (-13);
                        i5 = ((iM2761 ^ i4) * 19625) ^ (-2048424507);
                        i6 = 849141676;
                    }
                    break;
                case 876719179:
                case 1127929177:
                    if (i == 66) {
                        iM2761 = C0619.m2761("ۧۤ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-245)) ^ 2010332516;
                        i6 = -1493202393;
                    } else {
                        iM2761 = C0773.m3169("ۜۡ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-1723)) ^ (-195319342);
                        i6 = -1133062398;
                    }
                    break;
                default:
                    if (i == 4) {
                        iM2761 = (i4 - C0619.m2761("ܶۡ")) * 13;
                        i5 = ((iM2761 ^ i3) * (-11019)) ^ (-256338527);
                        i6 = 1063548650;
                    } else {
                        iM2761 = (C0773.m3169("ۜ᩻") ^ i3) * 57;
                        i5 = ((iM2761 ^ i4) * (-6967)) ^ 134863244;
                        i6 = 194077350;
                    }
                    break;
            }
        }
    }
}
